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
/* loaded from: classes3.dex */
public class C5106a {

    /* renamed from: a */
    private static final TimeZone f2816a = TimeZone.getTimeZone("GMT");

    /* renamed from: b */
    private static final ThreadLocal<SimpleDateFormat> f2817b = new ThreadLocal<>();

    /* renamed from: a */
    public static String m2577a(long j10) {
        return m2578a().format(new Date(j10));
    }

    /* renamed from: a */
    private static long m2575a(String str) {
        if (str.length() == 0) {
            return 0L;
        }
        try {
            ParsePosition parsePosition = new ParsePosition(0);
            Date date = m2578a().parse(str, parsePosition);
            if (parsePosition.getIndex() == str.length()) {
                return date.getTime();
            }
        } catch (Exception unused) {
        }
        return 0L;
    }

    /* renamed from: a */
    public static Cache.Entry m2576a(Map<String, List<String>> map) throws NumberFormatException {
        long j10;
        long jCurrentTimeMillis = System.currentTimeMillis();
        String singleHeaderFieldByKey = HttpHelper.getSingleHeaderFieldByKey(map, "Cache-Control");
        int i10 = 0;
        if (singleHeaderFieldByKey != null) {
            String[] strArrSplit = singleHeaderFieldByKey.split(",");
            j10 = 0;
            while (true) {
                if (i10 >= strArrSplit.length) {
                    break;
                }
                String strTrim = strArrSplit[i10].trim();
                if (strTrim.equals("no-store")) {
                    return null;
                }
                if (strTrim.equals("no-cache")) {
                    j10 = 0;
                    break;
                }
                if (strTrim.startsWith("max-age=")) {
                    try {
                        j10 = Long.parseLong(strTrim.substring(8));
                    } catch (Exception unused) {
                    }
                }
                i10++;
            }
            i10 = 1;
        } else {
            j10 = 0;
        }
        String singleHeaderFieldByKey2 = HttpHelper.getSingleHeaderFieldByKey(map, HttpHeaders.DATE);
        long jM2575a = singleHeaderFieldByKey2 != null ? m2575a(singleHeaderFieldByKey2) : 0L;
        String singleHeaderFieldByKey3 = HttpHelper.getSingleHeaderFieldByKey(map, HttpHeaders.EXPIRES);
        long jM2575a2 = singleHeaderFieldByKey3 != null ? m2575a(singleHeaderFieldByKey3) : 0L;
        String singleHeaderFieldByKey4 = HttpHelper.getSingleHeaderFieldByKey(map, HttpHeaders.LAST_MODIFIED);
        long jM2575a3 = singleHeaderFieldByKey4 != null ? m2575a(singleHeaderFieldByKey4) : 0L;
        String singleHeaderFieldByKey5 = HttpHelper.getSingleHeaderFieldByKey(map, HttpHeaders.ETAG);
        if (i10 != 0) {
            jCurrentTimeMillis += j10 * 1000;
        } else if (jM2575a > 0 && jM2575a2 >= jM2575a) {
            jCurrentTimeMillis += jM2575a2 - jM2575a;
        } else if (jM2575a3 <= 0) {
            jCurrentTimeMillis = 0;
        }
        if (jCurrentTimeMillis == 0 && singleHeaderFieldByKey5 == null) {
            return null;
        }
        Cache.Entry entry = new Cache.Entry();
        entry.etag = singleHeaderFieldByKey5;
        entry.ttl = jCurrentTimeMillis;
        entry.serverDate = jM2575a;
        entry.lastModified = jM2575a3;
        entry.responseHeaders = map;
        return entry;
    }

    /* renamed from: a */
    private static SimpleDateFormat m2578a() {
        ThreadLocal<SimpleDateFormat> threadLocal = f2817b;
        SimpleDateFormat simpleDateFormat = threadLocal.get();
        if (simpleDateFormat != null) {
            return simpleDateFormat;
        }
        SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss 'GMT'", Locale.US);
        simpleDateFormat2.setTimeZone(f2816a);
        threadLocal.set(simpleDateFormat2);
        return simpleDateFormat2;
    }
}
