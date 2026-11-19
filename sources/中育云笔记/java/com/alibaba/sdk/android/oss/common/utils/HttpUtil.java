package com.alibaba.sdk.android.oss.common.utils;

import com.huawei.hms.framework.common.ContainerUtils;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.Map;
import org.eclipse.paho.client.mqttv3.MqttTopic;

/* loaded from: classes3.dex */
public class HttpUtil {
    private static final String[] ENCODED_CHARACTERS_WITH_SLASHES = {MqttTopic.SINGLE_LEVEL_WILDCARD, "*", "%7E", "%2F"};
    private static final String[] ENCODED_CHARACTERS_WITH_SLASHES_REPLACEMENTS = {"%20", "%2A", "~", MqttTopic.TOPIC_LEVEL_SEPARATOR};
    private static final String[] ENCODED_CHARACTERS_WITHOUT_SLASHES = {MqttTopic.SINGLE_LEVEL_WILDCARD, "*", "%7E"};
    private static final String[] ENCODED_CHARACTERS_WITHOUT_SLASHES_REPLACEMENTS = {"%20", "%2A", "~"};

    public static String paramToQueryString(Map<String, String> map, String str) {
        if (map == null || map.isEmpty()) {
            return null;
        }
        StringBuilder sb2 = new StringBuilder();
        boolean z10 = true;
        for (Map.Entry<String, String> entry : map.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            if (!z10) {
                sb2.append("&");
            }
            sb2.append(urlEncode(key, str));
            if (value != null) {
                sb2.append(ContainerUtils.KEY_VALUE_DELIMITER);
                sb2.append(urlEncode(value, str));
            }
            z10 = false;
        }
        return sb2.toString();
    }

    public static String urlEncode(String str, String str2) {
        if (str == null) {
            return "";
        }
        try {
            return URLEncoder.encode(str, str2).replace(MqttTopic.SINGLE_LEVEL_WILDCARD, "%20").replace("*", "%2A").replace("%7E", "~").replace("%2F", MqttTopic.TOPIC_LEVEL_SEPARATOR);
        } catch (Exception e10) {
            throw new IllegalArgumentException("failed to encode url!", e10);
        }
    }

    public static String urlEncode(String str, boolean z10) throws UnsupportedEncodingException {
        if (str == null) {
            return "";
        }
        try {
            String strEncode = URLEncoder.encode(str, "utf-8");
            if (!z10) {
                return StringUtils.replaceEach(strEncode, ENCODED_CHARACTERS_WITHOUT_SLASHES, ENCODED_CHARACTERS_WITHOUT_SLASHES_REPLACEMENTS);
            }
            return StringUtils.replaceEach(strEncode, ENCODED_CHARACTERS_WITH_SLASHES, ENCODED_CHARACTERS_WITH_SLASHES_REPLACEMENTS);
        } catch (UnsupportedEncodingException e10) {
            throw new IllegalArgumentException("FailedToEncodeUri", e10);
        }
    }
}
