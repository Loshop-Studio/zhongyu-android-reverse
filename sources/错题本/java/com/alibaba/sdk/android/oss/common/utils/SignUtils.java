package com.alibaba.sdk.android.oss.common.utils;

import android.support.v4.media.AbstractC0037f;
import com.alibaba.sdk.android.oss.common.OSSHeaders;
import com.alibaba.sdk.android.oss.internal.RequestMessage;
import com.alibaba.sdk.android.oss.signer.ServiceSignature;
import com.alibaba.sdk.android.oss.signer.SignParameters;
import java.util.Arrays;
import java.util.Map;
import java.util.TreeMap;

/* loaded from: classes2.dex */
public class SignUtils {
    public static String buildCanonicalString(String str, String str2, RequestMessage requestMessage, String str3) {
        StringBuilder sbM98w = AbstractC0037f.m98w(str, SignParameters.NEW_LINE);
        Map headers = requestMessage.getHeaders();
        TreeMap treeMap = new TreeMap();
        if (headers != null) {
            for (Map.Entry entry : headers.entrySet()) {
                if (entry.getKey() != null) {
                    String lowerCase = ((String) entry.getKey()).toLowerCase();
                    if (lowerCase.equals(HttpHeaders.CONTENT_TYPE.toLowerCase()) || lowerCase.equals(HttpHeaders.CONTENT_MD5.toLowerCase()) || lowerCase.equals(HttpHeaders.DATE.toLowerCase()) || lowerCase.startsWith(OSSHeaders.OSS_PREFIX)) {
                        treeMap.put(lowerCase, ((String) entry.getValue()).trim());
                    }
                }
            }
        }
        if (!treeMap.containsKey(HttpHeaders.CONTENT_TYPE.toLowerCase())) {
            treeMap.put(HttpHeaders.CONTENT_TYPE.toLowerCase(), "");
        }
        if (!treeMap.containsKey(HttpHeaders.CONTENT_MD5.toLowerCase())) {
            treeMap.put(HttpHeaders.CONTENT_MD5.toLowerCase(), "");
        }
        for (Map.Entry entry2 : treeMap.entrySet()) {
            String str4 = (String) entry2.getKey();
            Object value = entry2.getValue();
            if (str4.startsWith(OSSHeaders.OSS_PREFIX)) {
                sbM98w.append(str4);
                sbM98w.append(':');
                sbM98w.append(value);
            } else {
                sbM98w.append(value);
            }
            sbM98w.append(SignParameters.NEW_LINE);
        }
        sbM98w.append(buildCanonicalizedResource(str2, requestMessage.getParameters()));
        return sbM98w.toString();
    }

    public static String buildCanonicalizedResource(String str, Map<String, String> map) {
        OSSUtils.assertTrue(str.startsWith("/"), "Resource path should start with slash character");
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        if (map != null) {
            String[] strArr = (String[]) map.keySet().toArray(new String[map.size()]);
            Arrays.sort(strArr);
            char c = '?';
            for (String str2 : strArr) {
                if (SignParameters.SIGNED_PARAMTERS.contains(str2)) {
                    sb.append(c);
                    sb.append(str2);
                    String str3 = map.get(str2);
                    if (str3 != null && !str3.trim().isEmpty()) {
                        sb.append("=");
                        sb.append(str3);
                    }
                    c = '&';
                }
            }
        }
        return sb.toString();
    }

    public static String buildSignature(String str, String str2, String str3, RequestMessage requestMessage) {
        return ServiceSignature.create().computeSignature(str, buildCanonicalString(str2, str3, requestMessage, null));
    }

    public static String composeRequestAuthorization(String str, String str2) {
        return SignParameters.AUTHORIZATION_PREFIX + str + ":" + str2;
    }
}
