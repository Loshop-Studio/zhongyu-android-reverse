package p219q1;

import android.content.Context;
import android.database.Cursor;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.StatFs;
import android.util.Log;
import com.alibaba.sdk.android.oss.common.utils.HttpHeaders;
import com.liulishuo.okdownload.C6593a;
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
import p209p1.C9315d;
import p229r1.C9417a;
import p229r1.C9419c;
import p229r1.C9423g;
import p229r1.C9424h;
import p229r1.InterfaceC9425i;
import p239s1.C9466b;
import p239s1.C9467c;
import p239s1.InterfaceC9465a;

/* renamed from: q1.c */
/* loaded from: classes4.dex */
public abstract class AbstractC9353c {

    /* renamed from: a */
    public static c f16251a = new b();

    /* renamed from: q1.c$a */
    public static class a implements ThreadFactory {

        /* renamed from: a */
        public final /* synthetic */ String f16252a;

        /* renamed from: b */
        public final /* synthetic */ boolean f16253b;

        public a(String str, boolean z9) {
            this.f16252a = str;
            this.f16253b = z9;
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            Thread thread = new Thread(runnable, this.f16252a);
            thread.setDaemon(this.f16253b);
            return thread;
        }
    }

    /* renamed from: q1.c$c */
    public interface c {
        /* renamed from: a */
        void mo15324a(String str, String str2);

        /* renamed from: b */
        void mo15325b(String str, String str2);
    }

    /* renamed from: a */
    public static void m15298a(InterfaceC9465a interfaceC9465a) {
        interfaceC9465a.mo15635b(HttpHeaders.USER_AGENT, "OkDownload/1.0.7");
    }

    /* renamed from: b */
    public static void m15299b(Map map, InterfaceC9465a interfaceC9465a) {
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            Iterator it = ((List) entry.getValue()).iterator();
            while (it.hasNext()) {
                interfaceC9465a.mo15635b(str, (String) it.next());
            }
        }
    }

    /* renamed from: c */
    public static void m15300c(Map map, InterfaceC9465a interfaceC9465a) throws IOException {
        m15311n(map);
        m15299b(map, interfaceC9465a);
    }

    /* renamed from: d */
    public static void m15301d(C6593a c6593a, C9419c c9419c, long j9, boolean z9) {
        int iM16098a = C9315d.m15182k().m15188f().m16105h(z9) ? C9315d.m15182k().m15188f().m16098a(c6593a, j9) : 1;
        c9419c.m15535p();
        long j10 = iM16098a;
        long j11 = j9 / j10;
        long j12 = 0;
        int i9 = 0;
        long j13 = 0;
        while (i9 < iM16098a) {
            j12 += j13;
            j13 = i9 == 0 ? (j9 % j10) + j11 : j11;
            c9419c.m15520a(new C9417a(j12, j13));
            i9++;
        }
    }

    /* renamed from: e */
    public static boolean m15302e(String str) {
        return C9315d.m15182k().m15186d().checkCallingOrSelfPermission(str) == 0;
    }

    /* renamed from: f */
    public static InterfaceC9465a.b m15303f() {
        try {
            return (InterfaceC9465a.b) C9466b.a.class.getDeclaredConstructor(null).newInstance(null);
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException unused) {
            return new C9467c.b();
        }
    }

    /* renamed from: g */
    public static InterfaceC9425i m15304g(Context context) {
        try {
            return (InterfaceC9425i) C9424h.class.getDeclaredConstructor(Context.class).newInstance(context);
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException unused) {
            return new C9423g();
        }
    }

    /* renamed from: h */
    public static InterfaceC9425i m15305h(InterfaceC9425i interfaceC9425i) {
        try {
            interfaceC9425i = (InterfaceC9425i) interfaceC9425i.getClass().getMethod("createRemitSelf", null).invoke(interfaceC9425i, null);
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
        }
        m15306i("Util", "Get final download store is " + interfaceC9425i);
        return interfaceC9425i;
    }

    /* renamed from: i */
    public static void m15306i(String str, String str2) {
        c cVar = f16251a;
        if (cVar != null) {
            cVar.mo15325b(str, str2);
        }
    }

    /* renamed from: j */
    public static String m15307j(Uri uri) {
        Cursor cursorQuery = C9315d.m15182k().m15186d().getContentResolver().query(uri, null, null, null, null);
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
    public static long m15308k(StatFs statFs) {
        return statFs.getAvailableBytes();
    }

    /* renamed from: l */
    public static File m15309l(File file) {
        File parentFile = file.getParentFile();
        return parentFile == null ? new File("/") : parentFile;
    }

    /* renamed from: m */
    public static long m15310m(Uri uri) {
        Cursor cursorQuery = C9315d.m15182k().m15186d().getContentResolver().query(uri, null, null, null, null);
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
    public static void m15311n(Map map) throws IOException {
        if (map.containsKey("If-Match") || map.containsKey(HttpHeaders.RANGE)) {
            throw new IOException("If-Match and Range only can be handle by internal!");
        }
    }

    /* renamed from: o */
    public static boolean m15312o(long j9, long j10) {
        return j9 == j10;
    }

    /* renamed from: p */
    public static boolean m15313p(CharSequence charSequence) {
        return charSequence == null || charSequence.length() == 0;
    }

    /* renamed from: q */
    public static boolean m15314q(ConnectivityManager connectivityManager) {
        if (connectivityManager == null) {
            m15323z("Util", "failed to get connectivity manager!");
            return true;
        }
        NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    /* renamed from: r */
    public static boolean m15315r(ConnectivityManager connectivityManager) {
        if (connectivityManager == null) {
            m15323z("Util", "failed to get connectivity manager!");
            return true;
        }
        NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
        return activeNetworkInfo == null || activeNetworkInfo.getType() != 1;
    }

    /* renamed from: s */
    public static boolean m15316s(Uri uri) {
        return uri.getScheme().equals("content");
    }

    /* renamed from: t */
    public static boolean m15317t(Uri uri) {
        return uri.getScheme().equals("file");
    }

    /* renamed from: u */
    public static String m15318u(String str) {
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
            int i9 = b10 & UByte.MAX_VALUE;
            if (i9 < 16) {
                sb.append('0');
            }
            sb.append(Integer.toHexString(i9));
        }
        return sb.toString();
    }

    /* renamed from: v */
    public static long m15319v(String str) {
        if (str == null) {
            return -1L;
        }
        try {
            return Long.parseLong(str);
        } catch (NumberFormatException unused) {
            m15306i("Util", "parseContentLength failed parse for '" + str + "'");
            return -1L;
        }
    }

    /* renamed from: w */
    public static long m15320w(String str) throws NumberFormatException {
        if (str != null && str.length() != 0) {
            try {
                Matcher matcher = Pattern.compile("bytes (\\d+)-(\\d+)/\\d+").matcher(str);
                if (matcher.find()) {
                    return (Long.parseLong(matcher.group(2)) - Long.parseLong(matcher.group(1))) + 1;
                }
            } catch (Exception e10) {
                m15323z("Util", "parse content-length from content-range failed " + e10);
            }
        }
        return -1L;
    }

    /* renamed from: x */
    public static void m15321x(C9417a c9417a) {
        if (c9417a.m15512c() >= 0 && c9417a.m15512c() <= c9417a.m15511b()) {
            return;
        }
        m15323z("resetBlockIfDirty", "block is dirty so have to reset: " + c9417a);
        c9417a.m15517h();
    }

    /* renamed from: y */
    public static ThreadFactory m15322y(String str, boolean z9) {
        return new a(str, z9);
    }

    /* renamed from: z */
    public static void m15323z(String str, String str2) {
        c cVar = f16251a;
        if (cVar != null) {
            cVar.mo15324a(str, str2);
        } else {
            Log.w(str, str2);
        }
    }

    /* renamed from: q1.c$b */
    public static class b implements c {
        @Override // p219q1.AbstractC9353c.c
        /* renamed from: a */
        public void mo15324a(String str, String str2) {
        }

        @Override // p219q1.AbstractC9353c.c
        /* renamed from: b */
        public void mo15325b(String str, String str2) {
        }
    }
}
