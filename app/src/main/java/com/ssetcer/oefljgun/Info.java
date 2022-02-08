package com.ssetcer.oefljgun;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.GET;

public interface Info {

    @GET("https://gist.githubusercontent.com/RKDev11/08eaaf69b7bfd758d0391d8f8bd9891f/raw/Secrets%2520of%2520Jungle")
    Call<ResponseBody> getStrU();

}
