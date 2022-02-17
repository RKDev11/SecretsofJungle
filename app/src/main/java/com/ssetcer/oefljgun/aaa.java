package com.ssetcer.oefljgun;

import static com.ssetcer.oefljgun.HTTPconect.Dec;
import static com.ssetcer.oefljgun.HTTPconect.appKkStatusSsetcerOefljgun;
import static com.ssetcer.oefljgun.HTTPconect.paramsSsetcerOefljgun;

import android.util.Log;

import com.appsflyer.AppsFlyerConversionListener;

import java.util.Map;
import java.util.Objects;

public interface aaa extends AppsFlyerConversionListener {

    aaa appsFlyerConversionListenerSsetcerOefljgun = new aaa() {
        @Override
        public void onConversionDataSuccess(Map<String, Object> map) {
            appKkStatusSsetcerOefljgun = Objects.requireNonNull(map.get(Dec("YWZfc3RhdHVz")).toString());
            if (appKkStatusSsetcerOefljgun.equals(Dec("Tm9uLW9yZ2FuaWM="))) {
                String kKkCampaingStatusSsetcerOefljgun = Objects.requireNonNull(map.get(Dec("Y2FtcGFpZ24=")))  .toString();
                paramsSsetcerOefljgun = HTTPconect.MPars(kKkCampaingStatusSsetcerOefljgun);
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
}
