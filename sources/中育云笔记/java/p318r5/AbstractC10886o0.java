package p318r5;

import android.util.Pair;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.Set;
import org.eclipse.paho.client.mqttv3.MqttTopic;

/* renamed from: r5.o0 */
/* loaded from: classes5.dex */
public abstract class AbstractC10886o0 {
    /* renamed from: a */
    public static long m23578a(String str, long j10) {
        try {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat(str, Locale.getDefault());
            return simpleDateFormat.parse(simpleDateFormat.format(Long.valueOf(j10))).getTime();
        } catch (ParseException unused) {
            AbstractC10861f1.m23441m("hmsSdk/stringUtil", "getMillisOfDate(): Time conversion Exception !");
            return 0L;
        }
    }

    /* renamed from: b */
    public static Pair m23579b(String str) {
        String strSubstring;
        String str2;
        if ("_default_config_tag".equals(str)) {
            return new Pair(str, "");
        }
        String[] strArrSplit = str.split("-");
        if (strArrSplit.length > 2) {
            str2 = strArrSplit[strArrSplit.length - 1];
            strSubstring = str.substring(0, (str.length() - str2.length()) - 1);
        } else {
            strSubstring = strArrSplit[0];
            str2 = strArrSplit[1];
        }
        return new Pair(strSubstring, str2);
    }

    /* renamed from: c */
    public static String m23580c(int i10) {
        return i10 != 0 ? i10 != 1 ? i10 != 2 ? i10 != 3 ? "alltype" : "diffprivacy" : "preins" : "maint" : "oper";
    }

    /* renamed from: d */
    public static String m23581d(String str, String str2) {
        if ("_default_config_tag".equals(str)) {
            return str;
        }
        return str + "-" + str2;
    }

    /* renamed from: e */
    public static String m23582e(String str, String str2, String str3) {
        if ("_default_config_tag".equals(str)) {
            return "_default_config_tag#" + str3;
        }
        return str + "-" + str2 + MqttTopic.MULTI_LEVEL_WILDCARD + str3;
    }

    /* renamed from: f */
    public static Set m23583f(Set set) {
        if (set == null || set.size() == 0) {
            return new HashSet();
        }
        HashSet hashSet = new HashSet();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            if ("_default_config_tag".equals(str)) {
                hashSet.add("_default_config_tag");
            } else {
                String str2 = str + "-oper";
                String str3 = str + "-maint";
                hashSet.add(str2);
                hashSet.add(str3);
                hashSet.add(str + "-diffprivacy");
            }
        }
        return hashSet;
    }
}
