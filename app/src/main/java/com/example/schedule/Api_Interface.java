package com.example.schedule;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Headers;

public interface Api_Interface {
    @Headers("X-MASTER-KEY:  $2b$10$3L3b4GDMfCWoEi6P4jZDC.mpU/390GC/fOxyFfK.4iLBPUP4J0W/u")
    @GET("b/6268d5cf38be296761f8c7e9")
    Call<Model> getAllData();
}
