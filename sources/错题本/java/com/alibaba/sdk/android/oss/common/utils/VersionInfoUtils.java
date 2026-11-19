package com.alibaba.sdk.android.oss.common.utils;

import android.os.Build;
import android.support.v4.media.AbstractC0037f;
import com.alibaba.sdk.android.oss.common.OSSLog;

/* loaded from: classes2.dex */
public class VersionInfoUtils {
    private static String userAgent;

    private static String getSystemInfo() {
        StringBuilder sb = new StringBuilder("(");
        sb.append(System.getProperty("os.name"));
        sb.append("/Android " + Build.VERSION.RELEASE);
        sb.append("/");
        sb.append(HttpUtil.urlEncode(Build.MODEL, "utf-8") + ";" + HttpUtil.urlEncode(Build.ID, "utf-8"));
        sb.append(")");
        String string = sb.toString();
        OSSLog.logDebug("user agent : " + string);
        return OSSUtils.isEmptyString(string) ? System.getProperty("http.agent").replaceAll("[^\\p{ASCII}]", "?") : string;
    }

    public static String getUserAgent(String str) {
        if (OSSUtils.isEmptyString(userAgent)) {
            userAgent = "aliyun-sdk-android/" + getVersion() + getSystemInfo();
        }
        return OSSUtils.isEmptyString(str) ? userAgent : AbstractC0037f.m92q(new StringBuilder(), userAgent, "/", str);
    }

    public static String getVersion() {
        return "2.9.21";
    }
}
