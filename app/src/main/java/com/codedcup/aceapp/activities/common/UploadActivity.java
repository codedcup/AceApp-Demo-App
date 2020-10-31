package com.codedcup.aceapp.activities.common;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import android.Manifest;
import android.app.ProgressDialog;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.codedcup.aceapp.R;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.storage.FirebaseStorage;
import com.google.firebase.storage.OnProgressListener;
import com.google.firebase.storage.StorageReference;
import com.google.firebase.storage.UploadTask;

import java.io.IOException;

public class UploadActivity extends BaseAuthenticationActivity {
    private static final int PICK_IMAGE_REQUEST = 234;
    Button choose;
    Button upload;
    TextView textView;
    ImageView imageView;

    private Uri filePath;
    private StorageReference StorageReference;

    @Override
    protected void OnAppCreate(Bundle savedState) {
        StorageReference = FirebaseStorage.getInstance().getReference();
        setContentView(R.layout.activity_upload);

        choose = findViewById(R.id.activity_upload_choose);
        upload = findViewById(R.id.activity_upload_upload);
        textView = findViewById(R.id.activity_upload_textview);
        imageView = findViewById(R.id.activity_upload_imageview);

        choose.setOnClickListener(listener);
        upload.setOnClickListener(listener);
    }


    private void showFileChooser()
    {
        Intent intent = new Intent();
        intent.setType("image/*");
        intent.setAction(Intent.ACTION_GET_CONTENT);
        startActivityForResult(Intent.createChooser(intent,"Select an image"),PICK_IMAGE_REQUEST);
    }

    private void uploadFile()
    {
        if (filePath!=null) {
            final ProgressDialog progressDialog = new ProgressDialog(this);
            progressDialog.setTitle("Uploading...");
            progressDialog.show();

            StorageReference NoticeRef = StorageReference.child("images/Notice.jpg");

            NoticeRef.putFile(filePath)
                    .addOnSuccessListener(new OnSuccessListener<UploadTask.TaskSnapshot>() {
                        @Override
                        public void onSuccess(UploadTask.TaskSnapshot taskSnapshot) {
                            progressDialog.dismiss();
                            Toast.makeText(getApplicationContext(),"file uploaded ",Toast.LENGTH_LONG).show();

                        }
                    })
                    .addOnFailureListener(new OnFailureListener() {
                        @Override
                        public void onFailure(@NonNull Exception exception) {
                            progressDialog.dismiss();
                            Toast.makeText(getApplicationContext(),exception.getMessage(),Toast.LENGTH_LONG).show();

                        }
                    }).addOnProgressListener(new OnProgressListener<UploadTask.TaskSnapshot>() {
                @Override
                public void onProgress(UploadTask.TaskSnapshot taskSnapshot) {
                    double progress = (100.0 * taskSnapshot.getBytesTransferred())/taskSnapshot.getTotalByteCount();
                    progressDialog.setMessage(((int) progress) + "% Uploaded...");
                }
            });
        }else{
            //display a error
        }
    }


    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if(requestCode==PICK_IMAGE_REQUEST && resultCode==RESULT_OK && data != null && data.getData()!= null)
        {
          filePath=data.getData();

            try {
                Bitmap bitmap= MediaStore.Images.Media.getBitmap(getContentResolver(),filePath);
                imageView.setImageBitmap(bitmap);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    View.OnClickListener listener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            if(view==choose) {
                showFileChooser();
            }
            else if(view==upload)
            {
                uploadFile();

            }


        }
    };
}