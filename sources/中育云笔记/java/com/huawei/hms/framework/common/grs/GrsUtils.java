package com.huawei.hms.framework.common.grs;

import com.huawei.hms.framework.common.StringUtils;
import java.util.Locale;
import org.eclipse.paho.client.mqttv3.MqttTopic;

/* loaded from: classes5.dex */
public class GrsUtils {
    public static String fixResult(String[] strArr, String str) {
        if (strArr.length <= 2) {
            return str;
        }
        if (str.endsWith(MqttTopic.TOPIC_LEVEL_SEPARATOR)) {
            return str + strArr[2];
        }
        return str + MqttTopic.TOPIC_LEVEL_SEPARATOR + strArr[2];
    }

    public static boolean isGRSSchema(String str) {
        return str != null && str.startsWith("grs://");
    }

    public static String[] parseGRSSchema(String str) {
        String[] strArrSplit = StringUtils.substring(str, str.toLowerCase(Locale.ENGLISH).indexOf("grs://") + 6).split(MqttTopic.TOPIC_LEVEL_SEPARATOR, 3);
        return strArrSplit.length == 1 ? new String[]{strArrSplit[0], "ROOT"} : strArrSplit;
    }

    public static String[] parseParams(String str) {
        if (str.endsWith(MqttTopic.TOPIC_LEVEL_SEPARATOR)) {
            str = StringUtils.substring(str, str.indexOf("grs://"), str.length() - 1);
        }
        return parseGRSSchema(str);
    }
}
