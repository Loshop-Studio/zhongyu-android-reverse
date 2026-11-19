package com.alibaba.sdk.android.oss.common.utils;

import com.alibaba.sdk.android.oss.common.OSSHeaders;
import com.alibaba.sdk.android.oss.internal.RequestMessage;
import com.alibaba.sdk.android.oss.signer.ServiceSignature;
import com.alibaba.sdk.android.oss.signer.SignParameters;
import com.huawei.hms.framework.common.ContainerUtils;
import java.util.Arrays;
import java.util.Map;
import java.util.TreeMap;
import org.eclipse.paho.client.mqttv3.MqttTopic;

/* loaded from: classes3.dex */
public class SignUtils {
    public static String buildCanonicalString(String str, String str2, RequestMessage requestMessage, String str3) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        sb2.append(SignParameters.NEW_LINE);
        Map headers = requestMessage.getHeaders();
        TreeMap treeMap = new TreeMap();
        if (headers != null) {
            for (Map.Entry entry : headers.entrySet()) {
                if (entry.getKey() != null) {
                    String lowerCase = ((String) entry.getKey()).toLowerCase();
                    if (lowerCase.equals("Content-Type".toLowerCase()) || lowerCase.equals(HttpHeaders.CONTENT_MD5.toLowerCase()) || lowerCase.equals(HttpHeaders.DATE.toLowerCase()) || lowerCase.startsWith(OSSHeaders.OSS_PREFIX)) {
                        treeMap.put(lowerCase, ((String) entry.getValue()).trim());
                    }
                }
            }
        }
        if (!treeMap.containsKey("Content-Type".toLowerCase())) {
            treeMap.put("Content-Type".toLowerCase(), "");
        }
        if (!treeMap.containsKey(HttpHeaders.CONTENT_MD5.toLowerCase())) {
            treeMap.put(HttpHeaders.CONTENT_MD5.toLowerCase(), "");
        }
        for (Map.Entry entry2 : treeMap.entrySet()) {
            String str4 = (String) entry2.getKey();
            Object value = entry2.getValue();
            if (str4.startsWith(OSSHeaders.OSS_PREFIX)) {
                sb2.append(str4);
                sb2.append(':');
                sb2.append(value);
            } else {
                sb2.append(value);
            }
            sb2.append(SignParameters.NEW_LINE);
        }
        sb2.append(buildCanonicalizedResource(str2, requestMessage.getParameters()));
        return sb2.toString();
    }

    public static String buildCanonicalizedResource(String str, Map<String, String> map) {
        OSSUtils.assertTrue(str.startsWith(MqttTopic.TOPIC_LEVEL_SEPARATOR), "Resource path should start with slash character");
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        if (map != null) {
            String[] strArr = (String[]) map.keySet().toArray(new String[map.size()]);
            Arrays.sort(strArr);
            char c10 = '?';
            for (String str2 : strArr) {
                if (SignParameters.SIGNED_PARAMTERS.contains(str2)) {
                    sb2.append(c10);
                    sb2.append(str2);
                    String str3 = map.get(str2);
                    if (str3 != null && !str3.trim().isEmpty()) {
                        sb2.append(ContainerUtils.KEY_VALUE_DELIMITER);
                        sb2.append(str3);
                    }
                    c10 = '&';
                }
            }
        }
        return sb2.toString();
    }

    public static String buildSignature(String str, String str2, String str3, RequestMessage requestMessage) {
        return ServiceSignature.create().computeSignature(str, buildCanonicalString(str2, str3, requestMessage, null));
    }

    public static String composeRequestAuthorization(String str, String str2) {
        return SignParameters.AUTHORIZATION_PREFIX + str + ":" + str2;
    }
}
