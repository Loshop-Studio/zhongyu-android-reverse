package com.taobao.accs.utl;

import android.app.Application;
import android.content.Context;
import android.text.TextUtils;
import com.huawei.hms.framework.common.ContainerUtils;
import com.p074ta.utdid2.device.UTDevice;
import java.util.Map;

/* loaded from: classes5.dex */
public final class UTMini {
    public static final int EVENT_ID_AGOO = 19999;
    private static final UTMini INSTANCE = new UTMini();
    public static final String PAGE_AGOO = "Page_Push";

    public static String convertObjectToString(Object obj) {
        if (obj == null) {
            return "";
        }
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof Integer) {
            return "" + obj;
        }
        if (obj instanceof Long) {
            return "" + obj;
        }
        if (obj instanceof Double) {
            return "" + obj;
        }
        if (obj instanceof Float) {
            return "" + obj;
        }
        if (obj instanceof Short) {
            return "" + obj;
        }
        if (!(obj instanceof Byte)) {
            return obj instanceof Boolean ? obj.toString() : obj instanceof Character ? obj.toString() : obj.toString();
        }
        return "" + obj;
    }

    private String convertStringAToKVSString(String... strArr) {
        if (strArr != null && strArr.length == 0) {
            return null;
        }
        StringBuilder sb2 = new StringBuilder();
        if (strArr != null && strArr.length > 0) {
            boolean z10 = false;
            for (String str : strArr) {
                if (!TextUtils.isEmpty(str)) {
                    if (z10) {
                        sb2.append(",");
                    }
                    sb2.append(str);
                    z10 = true;
                }
            }
        }
        return sb2.toString();
    }

    public static String getCommitInfo(int i10, String str, String str2, String str3, Map<String, String> map) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("eventId=");
        sb2.append(i10);
        sb2.append(";arg1=");
        sb2.append(str);
        sb2.append(";arg2=");
        sb2.append(str2);
        sb2.append(";arg3=");
        sb2.append(str3);
        if (map != null) {
            sb2.append(";");
            sb2.append("args=");
            sb2.append(map.toString());
        }
        return sb2.toString();
    }

    public static UTMini getInstance() {
        return INSTANCE;
    }

    private static String[] mapToArray(Map<String, String> map) {
        int i10 = 0;
        if (map == null || map.isEmpty()) {
            return new String[0];
        }
        String[] strArr = new String[map.size()];
        for (Map.Entry<String, String> entry : map.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            if (key == null) {
                strArr[i10] = "";
            } else {
                strArr[i10] = key + ContainerUtils.KEY_VALUE_DELIMITER + value;
            }
            i10++;
        }
        return strArr;
    }

    public void commitEvent(int i10, String str, Object obj) {
    }

    public String getUtdId(Context context) {
        try {
            return UTDevice.getUtdid(context);
        } catch (Throwable unused) {
            return null;
        }
    }

    public void onCaughtException(Throwable th) {
    }

    public void start(Application application, String str, String str2, String str3) {
    }

    public void stop(Context context) {
    }

    public void commitEvent(int i10, String str, Object obj, Object obj2) {
    }

    public void commitEvent(int i10, String str, Object obj, Object obj2, Object obj3) {
    }

    public void commitEvent(int i10, String str, Object obj, Object obj2, Object obj3, Map<String, String> map) {
    }

    public void commitEvent(int i10, String str, Object obj, Object obj2, Object obj3, String... strArr) {
    }

    public static String getCommitInfo(int i10, String str, String str2, String str3, String str4) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("eventId=");
        sb2.append(i10);
        sb2.append(";arg1=");
        sb2.append(str);
        sb2.append(";arg2=");
        sb2.append(str2);
        sb2.append(";arg3=");
        sb2.append(str3);
        if (str4 != null) {
            sb2.append(";");
            sb2.append("args=");
            sb2.append(str4);
        }
        return sb2.toString();
    }
}
