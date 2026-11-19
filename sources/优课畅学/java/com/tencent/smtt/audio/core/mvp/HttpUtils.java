package com.tencent.smtt.audio.core.mvp;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;

/* loaded from: libtbs.audio_base.jar.so:com/tencent/smtt/audio/core/mvp/HttpUtils.class */
public class HttpUtils {
    public static int getHttpResponseCode(URL url) throws IOException {
        HttpURLConnection httpurlconnection = null;
        int responsecode = -1;
        try {
            URLConnection urlconnection = url.openConnection();
            urlconnection.connect();
            if (!(urlconnection instanceof HttpURLConnection)) {
                return -1;
            }
            httpurlconnection = (HttpURLConnection) urlconnection;
            responsecode = httpurlconnection.getResponseCode();
            switch (responsecode) {
                case 200:
                case 301:
                case 302:
                    return responsecode;
                default:
                    httpurlconnection.disconnect();
                    return responsecode;
            }
        } catch (Exception e) {
            if (httpurlconnection != null) {
                httpurlconnection.disconnect();
            }
            return responsecode;
        }
    }

    public static boolean isNetworkAvailable(Context context) {
        NetworkInfo info;
        ConnectivityManager connectivity = (ConnectivityManager) context.getSystemService("connectivity");
        if (connectivity != null && (info = connectivity.getActiveNetworkInfo()) != null && info.isConnected() && info.getState() == NetworkInfo.State.CONNECTED) {
            return true;
        }
        return false;
    }
}
