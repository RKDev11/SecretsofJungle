package com.ssetcer.oefljgun;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;

import com.facebook.FacebookSdk;
import com.facebook.applinks.AppLinkData;

public class FaceBook{
    public String infoMettaSsetcerOefljgun;
    public static String dataFbKkkkSsetcerOefljgun;
    HTTPconect httPconectSsetcerOefljgun = new HTTPconect();

    FaceBook(String fbId, Context context){
        FacebookSdk.setApplicationId(fbId);
        FacebookSdk.setAdvertiserIDCollectionEnabled(true);
        FacebookSdk.fullyInitialize();
        FacebookSdk.setAutoInitEnabled(true);
        FacebookSdk.setAutoLogAppEventsEnabled(true);
        AppLinkData.fetchDeferredAppLinkData(context, new AppLinkData.CompletionHandler() {
            @Override
            public void onDeferredAppLinkDataFetched(AppLinkData dataSsetcerOefljgun) {
                if (dataSsetcerOefljgun == null) {
                    dataSsetcerOefljgun = AppLinkData.createFromActivity((Activity) context);
                }
                if (dataSsetcerOefljgun != null) {
                    Uri urlSsetcerOefljgun = dataSsetcerOefljgun.getTargetUri();
                    infoMettaSsetcerOefljgun = urlSsetcerOefljgun.getQuery();
                    dataFbKkkkSsetcerOefljgun = httPconectSsetcerOefljgun.MPars(infoMettaSsetcerOefljgun);

                }
            }
        });
    }
}
