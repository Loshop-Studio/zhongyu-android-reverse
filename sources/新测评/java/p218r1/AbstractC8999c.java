package p218r1;

import android.content.Context;
import android.database.Cursor;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.StatFs;
import android.util.Log;
import com.alibaba.sdk.android.oss.common.utils.HttpHeaders;
import com.liulishuo.okdownload.C6327a;
import java.io.File;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.InvocationTargetException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ThreadFactory;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.UByte;
import p207q1.C8879d;
import p229s1.C9124a;
import p229s1.C9126c;
import p229s1.C9130g;
import p229s1.C9131h;
import p229s1.InterfaceC9132i;
import p240t1.C9378b;
import p240t1.C9379c;
import p240t1.InterfaceC9377a;

/* renamed from: r1.c */
/* loaded from: classes4.dex */
public abstract class AbstractC8999c {

    /* renamed from: a */
    public static c f15402a = new b();

    /* renamed from: r1.c$a */
    public static class a implements ThreadFactory {

        /* renamed from: a */
        public final /* synthetic */ String f15403a;

        /* renamed from: b */
        public final /* synthetic */ boolean f15404b;

        public a(String str, boolean z9) {
            this.f15403a = str;
            this.f15404b = z9;
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            Thread thread = new Thread(runnable, this.f15403a);
            thread.setDaemon(this.f15404b);
            return thread;
        }
    }

    /* renamed from: r1.c$c */
    public interface c {
        /* renamed from: a */
        void mo15143a(String str, String str2);

        /* renamed from: b */
        void mo15144b(String str, String str2);
    }

    /* renamed from: a */
    public static void m15117a(InterfaceC9377a interfaceC9377a) {
        interfaceC9377a.mo15671b(HttpHeaders.USER_AGENT, "OkDownload/1.0.7");
    }

    /* renamed from: b */
    public static void m15118b(Map map, InterfaceC9377a interfaceC9377a) {
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            Iterator it = ((List) entry.getValue()).iterator();
            while (it.hasNext()) {
                interfaceC9377a.mo15671b(str, (String) it.next());
            }
        }
    }

    /* renamed from: c */
    public static void m15119c(Map map, InterfaceC9377a interfaceC9377a) throws IOException {
        m15130n(map);
        m15118b(map, interfaceC9377a);
    }

    /* renamed from: d */
    public static void m15120d(C6327a c6327a, C9126c c9126c, long j10, boolean z9) {
        int iM16137a = C8879d.m14905k().m14911f().m16144h(z9) ? C8879d.m14905k().m14911f().m16137a(c6327a, j10) : 1;
        c9126c.m15481p();
        long j11 = iM16137a;
        long j12 = j10 / j11;
        long j13 = 0;
        int i10 = 0;
        long j14 = 0;
        while (i10 < iM16137a) {
            j13 += j14;
            j14 = i10 == 0 ? (j10 % j11) + j12 : j12;
            c9126c.m15466a(new C9124a(j13, j14));
            i10++;
        }
    }

    /* renamed from: e */
    public static boolean m15121e(String str) {
        return C8879d.m14905k().m14909d().checkCallingOrSelfPermission(str) == 0;
    }

    /* renamed from: f */
    public static InterfaceC9377a.b m15122f() {
        try {
            return (InterfaceC9377a.b) C9378b.a.class.getDeclaredConstructor(null).newInstance(null);
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException unused) {
            return new C9379c.b();
        }
    }

    /* renamed from: g */
    public static InterfaceC9132i m15123g(Context context) {
        try {
            return (InterfaceC9132i) C9131h.class.getDeclaredConstructor(Context.class).newInstance(context);
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException unused) {
            return new C9130g();
        }
    }

    /* renamed from: h */
    public static InterfaceC9132i m15124h(InterfaceC9132i interfaceC9132i) {
        try {
            interfaceC9132i = (InterfaceC9132i) interfaceC9132i.getClass().getMethod("createRemitSelf", null).invoke(interfaceC9132i, null);
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
        }
        m15125i("Util", "Get final download store is " + interfaceC9132i);
        return interfaceC9132i;
    }

    /* renamed from: i */
    public static void m15125i(String str, String str2) {
        c cVar = f15402a;
        if (cVar != null) {
            cVar.mo15144b(str, str2);
        }
    }

    /* renamed from: j */
    public static String m15126j(Uri uri) {
        Cursor cursorQuery = C8879d.m14905k().m14909d().getContentResolver().query(uri, null, null, null, null);
        if (cursorQuery == null) {
            return null;
        }
        try {
            cursorQuery.moveToFirst();
            return cursorQuery.getString(cursorQuery.getColumnIndex("_display_name"));
        } finally {
            cursorQuery.close();
        }
    }

    /* renamed from: k */
    public static long m15127k(StatFs statFs) {
        return statFs.getAvailableBytes();
    }

    /* renamed from: l */
    public static File m15128l(File file) {
        File parentFile = file.getParentFile();
        return parentFile == null ? new File("/") : parentFile;
    }

    /* renamed from: m */
    public static long m15129m(Uri uri) {
        Cursor cursorQuery = C8879d.m14905k().m14909d().getContentResolver().query(uri, null, null, null, null);
        if (cursorQuery == null) {
            return 0L;
        }
        try {
            cursorQuery.moveToFirst();
            return cursorQuery.getLong(cursorQuery.getColumnIndex("_size"));
        } finally {
            cursorQuery.close();
        }
    }

    /* renamed from: n */
    public static void m15130n(Map map) throws IOException {
        if (map.containsKey("If-Match") || map.containsKey(HttpHeaders.RANGE)) {
            throw new IOException("If-Match and Range only can be handle by internal!");
        }
    }

    /* renamed from: o */
    public static boolean m15131o(long j10, long j11) {
        return j10 == j11;
    }

    /* renamed from: p */
    public static boolean m15132p(CharSequence charSequence) {
        return charSequence == null || charSequence.length() == 0;
    }

    /* renamed from: q */
    public static boolean m15133q(ConnectivityManager connectivityManager) {
        if (connectivityManager == null) {
            m15142z("Util", "failed to get connectivity manager!");
            return true;
        }
        NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    /* renamed from: r */
    public static boolean m15134r(ConnectivityManager connectivityManager) {
        if (connectivityManager == null) {
            m15142z("Util", "failed to get connectivity manager!");
            return true;
        }
        NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
        return activeNetworkInfo == null || activeNetworkInfo.getType() != 1;
    }

    /* renamed from: s */
    public static boolean m15135s(Uri uri) {
        return uri.getScheme().equals("content");
    }

    /* renamed from: t */
    public static boolean m15136t(Uri uri) {
        return uri.getScheme().equals("file");
    }

    /* renamed from: u */
    public static String m15137u(String str) {
        byte[] bArrDigest;
        try {
            bArrDigest = MessageDigest.getInstance("MD5").digest(str.getBytes("UTF-8"));
        } catch (UnsupportedEncodingException | NoSuchAlgorithmException unused) {
            bArrDigest = null;
        }
        if (bArrDigest == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder(bArrDigest.length * 2);
        for (byte b10 : bArrDigest) {
            int i10 = b10 & UByte.MAX_VALUE;
            if (i10 < 16) {
                sb.append('0');
            }
            sb.append(Integer.toHexString(i10));
        }
        return sb.toString();
    }

    /* renamed from: v */
    public static long m15138v(String str) {
        if (str == null) {
            return -1L;
        }
        try {
            return Long.parseLong(str);
        } catch (NumberFormatException unused) {
            m15125i("Util", "parseContentLength failed parse for '" + str + "'");
            return -1L;
        }
    }

    /* renamed from: w */
    public static long m15139w(String str) throws NumberFormatException {
        if (str != null && str.length() != 0) {
            try {
                Matcher matcher = Pattern.compile("bytes (\\d+)-(\\d+)/\\d+").matcher(str);
                if (matcher.find()) {
                    return (Long.parseLong(matcher.group(2)) - Long.parseLong(matcher.group(1))) + 1;
                }
            } catch (Exception e10) {
                m15142z("Util", "parse content-length from content-range failed " + e10);
            }
        }
        return -1L;
    }

    /* renamed from: x */
    public static void m15140x(C9124a c9124a) {
        if (c9124a.m15458c() >= 0 && c9124a.m15458c() <= c9124a.m15457b()) {
            return;
        }
        m15142z("resetBlockIfDirty", "block is dirty so have to reset: " + c9124a);
        c9124a.m15463h();
    }

    /* renamed from: y */
    public static ThreadFactory m15141y(String str, boolean z9) {
        return new a(str, z9);
    }

    /* renamed from: z */
    public static void m15142z(String str, String str2) {
        c cVar = f15402a;
        if (cVar != null) {
            cVar.mo15143a(str, str2);
        } else {
            Log.w(str, str2);
        }
    }

    /* renamed from: r1.c$b */
    public static class b implements c {
        @Override // p218r1.AbstractC8999c.c
        /* renamed from: a */
        public void mo15143a(String str, String str2) {
        }

        @Override // p218r1.AbstractC8999c.c
        /* renamed from: b */
        public void mo15144b(String str, String str2) {
        }
    }
}
