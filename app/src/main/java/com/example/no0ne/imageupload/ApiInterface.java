package com.example.no0ne.imageupload;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

/**
 * Created by no0ne on 1/26/18.
 */

public interface ApiInterface {

    @FormUrlEncoded // For sending form data
    @POST("ImageUpload/upload.php") // End point
    Call<Image> uploadImage(@Field("title") String title, @Field("image") String image); // Passing values for field title and image
}
