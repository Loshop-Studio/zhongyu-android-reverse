package anetwork.channel.cache;

import anet.channel.util.HttpHelper;
import anetwork.channel.cache.Cache;
import com.alibaba.sdk.android.oss.common.utils.HttpHeaders;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;

/* renamed from: anetwork.channel.cache.a */
/* loaded from: classes.dex */
public class C0983a {

    /* renamed from: a */
    private static final TimeZone f5538a = TimeZone.getTimeZone("GMT");

    /* renamed from: b */
    private static final ThreadLocal<SimpleDateFormat> f5539b = new ThreadLocal<>();

    /* renamed from: a */
    public static String m4686a(long j4) {
        return m4687a().format(new Date(j4));
    }

    /* renamed from: a */
    private static long m4684a(String str) {
        if (str.length() == 0) {
            return 0L;
        }
        try {
            ParsePosition parsePosition = new ParsePosition(0);
            Date date = m4687a().parse(str, parsePosition);
            if (parsePosition.getIndex() == str.length()) {
                return date.getTime();
            }
        } catch (Exception unused) {
        }
        return 0L;
    }

    /* renamed from: a */
    public static Cache.Entry m4685a(Map<String, List<String>> map) throws NumberFormatException {
        long j4;
        long j5;
        long jCurrentTimeMillis = System.currentTimeMillis();
        String singleHeaderFieldByKey = HttpHelper.getSingleHeaderFieldByKey(map, "Cache-Control");
        boolean z3 = true;
        int i4 = 0;
        if (singleHeaderFieldByKey != null) {
            String[] strArrSplit = singleHeaderFieldByKey.split(",");
            j4 = 0;
            while (true) {
                if (i4 >= strArrSplit.length) {
                    break;
                }
                String strTrim = strArrSplit[i4].trim();
                if (strTrim.equals("no-store")) {
                    return null;
                }
                if (strTrim.equals("no-cache")) {
                    j4 = 0;
                    break;
                }
                if (strTrim.startsWith("max-age=")) {
                    try {
                        j4 = Long.parseLong(strTrim.substring(8));
                    } catch (Exception unused) {
                    }
                }
                i4++;
            }
        } else {
            j4 = 0;
            z3 = false;
        }
        String singleHeaderFieldByKey2 = HttpHelper.getSingleHeaderFieldByKey(map, HttpHeaders.DATE);
        long jM4684a = singleHeaderFieldByKey2 != null ? m4684a(singleHeaderFieldByKey2) : 0L;
        String singleHeaderFieldByKey3 = HttpHelper.getSingleHeaderFieldByKey(map, HttpHeaders.EXPIRES);
        long jM4684a2 = singleHeaderFieldByKey3 != null ? m4684a(singleHeaderFieldByKey3) : 0L;
        String singleHeaderFieldByKey4 = HttpHelper.getSingleHeaderFieldByKey(map, HttpHeaders.LAST_MODIFIED);
        long jM4684a3 = singleHeaderFieldByKey4 != null ? m4684a(singleHeaderFieldByKey4) : 0L;
        String singleHeaderFieldByKey5 = HttpHelper.getSingleHeaderFieldByKey(map, HttpHeaders.ETAG);
        if (z3) {
            jCurrentTimeMillis += j4 * 1000;
        } else {
            if (jM4684a <= 0 || jM4684a2 < jM4684a) {
                j5 = jM4684a3;
                if (j5 <= 0) {
                    jCurrentTimeMillis = 0;
                }
                if (jCurrentTimeMillis != 0 && singleHeaderFieldByKey5 == null) {
                    return null;
                }
                Cache.Entry entry = new Cache.Entry();
                entry.etag = singleHeaderFieldByKey5;
                entry.ttl = jCurrentTimeMillis;
                entry.serverDate = jM4684a;
                entry.lastModified = j5;
                entry.responseHeaders = map;
                return entry;
            }
            jCurrentTimeMillis += jM4684a2 - jM4684a;
        }
        j5 = jM4684a3;
        if (jCurrentTimeMillis != 0) {
        }
        Cache.Entry entry2 = new Cache.Entry();
        entry2.etag = singleHeaderFieldByKey5;
        entry2.ttl = jCurrentTimeMillis;
        entry2.serverDate = jM4684a;
        entry2.lastModified = j5;
        entry2.responseHeaders = map;
        return entry2;
    }

    /* renamed from: a */
    private static SimpleDateFormat m4687a() {
        ThreadLocal<SimpleDateFormat> threadLocal = f5539b;
        SimpleDateFormat simpleDateFormat = threadLocal.get();
        if (simpleDateFormat != null) {
            return simpleDateFormat;
        }
        SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss 'GMT'", Locale.US);
        simpleDateFormat2.setTimeZone(f5538a);
        threadLocal.set(simpleDateFormat2);
        return simpleDateFormat2;
    }
}
