package com.p071uc.crashsdk.p072a;

import android.os.Build;
import android.os.Process;
import android.support.v4.media.session.PlaybackStateCompat;
import android.util.SparseArray;
import androidx.core.os.EnvironmentCompat;
import com.efs.sdk.base.protocol.file.section.AbsSection;
import com.google.android.material.timepicker.TimeModel;
import com.p071uc.crashsdk.C6737a;
import com.p071uc.crashsdk.C6746b;
import com.p071uc.crashsdk.C6749e;
import com.p071uc.crashsdk.C6751g;
import com.p071uc.crashsdk.JNIBridge;
import java.io.File;
import java.io.UnsupportedEncodingException;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import kotlin.jvm.internal.ByteCompanionObject;

/* renamed from: com.uc.crashsdk.a.h */
/* loaded from: classes4.dex */
public class C6745h {

    /* renamed from: a */
    static final /* synthetic */ boolean f6369a = true;

    /* renamed from: b */
    private static final Object f6370b = new Object();

    /* renamed from: c */
    private static final Map<String, String> f6371c = new HashMap();

    /* renamed from: d */
    private static int f6372d = 0;

    /* renamed from: e */
    private static final Map<String, a> f6373e = new HashMap();

    /* renamed from: f */
    private static final Object f6374f = new Object();

    /* renamed from: g */
    private static final Object f6375g = new Object();

    /* renamed from: h */
    private static final SparseArray<String> f6376h = new SparseArray<>();

    /* renamed from: i */
    private static boolean f6377i = false;

    /* renamed from: j */
    private static boolean f6378j = false;

    /* renamed from: k */
    private static final Object f6379k = new Object();

    /* renamed from: l */
    private static String f6380l = null;

    /* renamed from: com.uc.crashsdk.a.h$a */
    public static class a {

        /* renamed from: a */
        long f6381a = 0;

        /* renamed from: b */
        int f6382b = 0;

        /* renamed from: c */
        Map<String, String> f6383c = new HashMap();

        /* renamed from: d */
        private String f6384d;

        /* renamed from: e */
        private boolean f6385e;

        /* renamed from: f */
        private boolean f6386f;

        public a(String str, boolean z9, boolean z10) {
            this.f6385e = false;
            this.f6386f = false;
            this.f6384d = str;
            this.f6385e = z9;
            this.f6386f = z10;
        }

        /* renamed from: d */
        private long m5681d(String str) {
            return C6744g.m5625c(m5682a(str));
        }

        /* renamed from: a */
        public final void m5685a(String str, String str2) {
            this.f6383c.put(str, str2);
        }

        /* renamed from: b */
        public final String m5687b(String str) {
            String strM5682a = m5682a(str);
            return strM5682a == null ? "" : strM5682a;
        }

        /* renamed from: c */
        public final boolean m5688c(String str) throws NumberFormatException {
            if (C6744g.m5619a(str)) {
                return false;
            }
            HashMap map = new HashMap();
            Map mapM5666c = C6745h.m5666c(str);
            String str2 = null;
            long jM5625c = 0;
            int iM5625c = 0;
            for (String str3 : mapM5666c.keySet()) {
                String str4 = (String) mapM5666c.get(str3);
                if (str3.equals("lt")) {
                    str2 = str4;
                } else if (this.f6385e && str3.equals("up")) {
                    jM5625c = C6744g.m5625c(str4);
                } else if (this.f6385e && str3.equals("pid")) {
                    iM5625c = (int) C6744g.m5625c(str4);
                } else {
                    map.put(str3, str4);
                }
            }
            String str5 = this.f6384d;
            if (str5 != null && !str5.equals(str2)) {
                return false;
            }
            this.f6381a = jM5625c;
            this.f6382b = iM5625c;
            this.f6384d = str2;
            this.f6383c = map;
            return true;
        }

        /* renamed from: a */
        public final void m5684a(String str, long j9) {
            long jM5681d = m5681d(str) + j9;
            if (jM5681d <= 100) {
                j9 = 0;
                if (jM5681d >= 0) {
                    j9 = jM5681d;
                }
            }
            m5685a(str, String.valueOf(j9));
        }

        /* renamed from: a */
        public final boolean m5686a(a aVar) {
            if (!this.f6386f) {
                C6738a.m5564a("crashsdk", String.format(Locale.US, "WaItem '%s' is not mergable!", this.f6384d), null);
                return false;
            }
            for (String str : aVar.f6383c.keySet()) {
                if (str.startsWith("c_")) {
                    m5685a(str, aVar.m5682a(str));
                } else {
                    long jM5681d = aVar.m5681d(str);
                    if (jM5681d == 0) {
                        m5685a(str, aVar.m5682a(str));
                    } else if (jM5681d < 100) {
                        m5684a(str, jM5681d);
                    }
                }
            }
            return true;
        }

        /* renamed from: a */
        public final String m5682a(String str) {
            return this.f6383c.get(str);
        }

        /* renamed from: a */
        public final String m5683a(boolean z9, boolean z10, boolean z11) {
            if (this.f6384d == null) {
                return null;
            }
            StringBuilder sb = new StringBuilder();
            if (z9) {
                C6745h.m5661b(sb, "lt", "uc");
                C6745h.m5661b(sb, "pre", C6751g.m5975e());
                C6745h.m5661b(sb, "pkg", C6737a.f6307a);
                C6745h.m5661b(sb, "rom", Build.VERSION.RELEASE);
                C6745h.m5661b(sb, "brd", Build.BRAND);
                C6745h.m5661b(sb, "model", Build.MODEL);
                C6745h.m5651a(sb, "sdk", Build.VERSION.SDK_INT);
                C6745h.m5661b(sb, "cpu", C6749e.m5856e());
                C6745h.m5661b(sb, "hdw", C6749e.m5860f());
                long jM5679n = C6745h.m5679n();
                C6745h.m5651a(sb, "ram", jM5679n);
                C6745h.m5661b(sb, "aram", C6745h.m5640a(jM5679n));
                C6745h.m5661b(sb, "cver", "3.2.0.4");
                C6745h.m5661b(sb, "cseq", "210105150455");
                C6745h.m5661b(sb, "ctag", "release");
                C6745h.m5661b(sb, "aver", C6737a.m5530a());
                C6745h.m5661b(sb, "ver", C6751g.m5954R());
                C6745h.m5661b(sb, "sver", C6751g.m5955S());
                C6745h.m5661b(sb, "seq", C6751g.m5956T());
                C6745h.m5661b(sb, "grd", C6746b.m5754x() ? "fg" : "bg");
                C6745h.m5661b(sb, "os", "android");
                sb.append(AbsSection.SEP_ORIGIN_LINE_BREAK);
            }
            C6745h.m5661b(sb, "lt", this.f6384d);
            C6745h.m5653a(sb, this.f6383c);
            if (this.f6385e && !z10) {
                long j9 = this.f6381a;
                if (j9 != 0) {
                    C6745h.m5661b(sb, "up", String.valueOf(j9));
                }
                if (z11) {
                    C6745h.m5661b(sb, "pid", String.format(Locale.US, TimeModel.NUMBER_FORMAT, Integer.valueOf(Process.myPid())));
                } else {
                    int i9 = this.f6382b;
                    if (i9 != 0) {
                        C6745h.m5661b(sb, "pid", String.format(Locale.US, TimeModel.NUMBER_FORMAT, Integer.valueOf(i9)));
                    }
                }
            }
            sb.append(AbsSection.SEP_ORIGIN_LINE_BREAK);
            return sb.toString();
        }
    }

    /* renamed from: a */
    public static /* synthetic */ String m5640a(long j9) {
        if (j9 < PlaybackStateCompat.ACTION_SET_SHUFFLE_MODE_ENABLED) {
            return "512M";
        }
        return String.format(Locale.US, "%dG", Long.valueOf(((j9 / PlaybackStateCompat.ACTION_PLAY_FROM_MEDIA_ID) + 512) / PlaybackStateCompat.ACTION_PLAY_FROM_MEDIA_ID));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public static void m5661b(StringBuilder sb, String str, String str2) {
        sb.append(str);
        sb.append("=");
        sb.append(str2);
        sb.append("`");
    }

    /* renamed from: c */
    public static /* synthetic */ Map m5666c(String str) {
        HashMap map = new HashMap();
        for (String str2 : str.split("`")) {
            if (str2.length() > 1) {
                String[] strArrSplit = str2.split("=", 3);
                if (strArrSplit.length == 2) {
                    map.put(strArrSplit[0], strArrSplit[1]);
                }
            }
        }
        return map;
    }

    /* renamed from: d */
    public static void m5668d() {
        m5659b(2, 2000L);
        m5644a(1, 70000L);
    }

    /* renamed from: e */
    public static boolean m5670e() {
        return f6378j;
    }

    /* renamed from: f */
    public static void m5671f() {
        m5659b(1, 2000L);
    }

    /* renamed from: g */
    public static void m5672g() {
        m5659b(3, 0L);
    }

    /* renamed from: h */
    public static void m5673h() {
        m5659b(4, 0L);
    }

    /* renamed from: i */
    public static void m5674i() {
        if (C6751g.m5951O()) {
            C6743f.m5600a(1, new RunnableC6742e(303));
        }
    }

    /* renamed from: j */
    public static byte[] m5675j() {
        return new byte[]{ByteCompanionObject.MAX_VALUE, 100, 110, 31};
    }

    /* renamed from: l */
    private static String m5677l() {
        return C6751g.m5957U() + "pv.wa";
    }

    /* renamed from: m */
    private static String m5678m() {
        return C6751g.m5957U() + "cdt.wa";
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: n */
    public static long m5679n() {
        ArrayList<String> arrayListM5609a = C6744g.m5609a(new File("/proc/meminfo"), 2);
        int size = arrayListM5609a.size();
        int i9 = 0;
        while (i9 < size) {
            String str = arrayListM5609a.get(i9);
            i9++;
            String str2 = str;
            if (str2.contains("MemTotal:")) {
                try {
                    return Long.parseLong(str2.replaceAll("\\D+", ""));
                } catch (NumberFormatException e10) {
                    C6744g.m5614a(e10);
                    return 0L;
                }
            }
        }
        return 0L;
    }

    /* renamed from: o */
    private static String m5680o() {
        if (C6744g.m5619a(f6380l)) {
            synchronized (f6379k) {
                try {
                    f6380l = C6744g.m5607a(C6746b.m5738h(), C6751g.m5952P() ? "https://errlogos.umeng.com/api/crashsdk/logcollect" : "https://errlog.umeng.com/api/crashsdk/logcollect", true);
                } finally {
                }
            }
        }
        return f6380l;
    }

    /* renamed from: a */
    public static /* synthetic */ void m5651a(StringBuilder sb, String str, long j9) {
        m5661b(sb, str, String.valueOf(j9));
    }

    /* renamed from: b */
    public static void m5658b() {
        m5644a(2, 0L);
    }

    /* renamed from: c */
    public static void m5667c() {
        m5644a(3, 0L);
    }

    /* renamed from: b */
    private static void m5659b(int i9, long j9) {
        if (C6751g.m5951O()) {
            C6743f.m5601a(1, new RunnableC6742e(301, new Object[]{Integer.valueOf(i9)}), j9);
        }
    }

    /* renamed from: d */
    private static boolean m5669d(String str) throws NoSuchAlgorithmException, UnsupportedEncodingException {
        File file = new File(str);
        ArrayList<a> arrayListM5642a = m5642a(file, "cst", 30);
        int size = arrayListM5642a.size();
        int i9 = 0;
        while (i9 < size) {
            a aVar = arrayListM5642a.get(i9);
            i9++;
            a aVar2 = aVar;
            String strM5682a = aVar2.m5682a("prc");
            if (!C6744g.m5619a(strM5682a)) {
                Map<String, a> map = f6373e;
                a aVar3 = map.get(strM5682a);
                if (aVar3 != null) {
                    aVar3.m5686a(aVar2);
                } else {
                    map.put(strM5682a, aVar2);
                }
            }
        }
        Map<String, a> map2 = f6373e;
        boolean zM5664b = m5664b(C6749e.m5885p(), m5641a((Iterable<a>) map2.values(), true, false).toString());
        C6744g.m5622b(file);
        if (zM5664b || C6744g.m5617a(file, m5641a((Iterable<a>) map2.values(), false, true).toString())) {
            map2.clear();
        }
        return true;
    }

    /* renamed from: a */
    public static /* synthetic */ void m5653a(StringBuilder sb, Map map) {
        for (String str : map.keySet()) {
            m5661b(sb, str, (String) map.get(str));
        }
    }

    /* renamed from: a */
    public static void m5649a(String str) {
        synchronized (f6370b) {
            try {
                File file = new File(m5677l());
                a aVar = new a("pv", true, true);
                String strM5627c = C6744g.m5627c(file);
                if (!C6744g.m5619a(strM5627c)) {
                    aVar.m5688c(strM5627c);
                }
                aVar.m5684a(str, 1L);
                aVar.m5684a("aujv", 1L);
                C6744g.m5617a(file, aVar.m5683a(false, false, false));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: b */
    public static boolean m5663b(int i9, Object[] objArr) throws NoSuchAlgorithmException, UnsupportedEncodingException {
        switch (i9) {
            case 351:
                if (!f6369a && objArr == null) {
                    throw new AssertionError();
                }
                String str = (String) objArr[0];
                int iIntValue = ((Integer) objArr[1]).intValue();
                if (iIntValue == 1) {
                    if (f6378j) {
                        return false;
                    }
                    f6378j = true;
                }
                File file = new File(str);
                ArrayList<a> arrayListM5642a = m5642a(file, "crp", 100);
                if (iIntValue != 4) {
                    a aVar = new a("crp", false, false);
                    if (iIntValue == 1) {
                        aVar.m5685a("et", String.valueOf(C6746b.m5694F()));
                        aVar.m5685a("ete", String.valueOf(C6746b.m5695G()));
                    } else if (iIntValue == 3) {
                        aVar.m5685a("et", "1");
                        aVar.m5685a("ete", "1");
                    } else if (iIntValue == 2) {
                        aVar.m5685a("hpv", "1");
                    }
                    aVar.m5685a("prc", C6749e.m5868h());
                    aVar.m5685a("imp", C6746b.m5691C() ? "1" : "0");
                    m5648a(aVar);
                    arrayListM5642a.add(0, aVar);
                }
                if (!arrayListM5642a.isEmpty()) {
                    boolean zM5664b = m5664b(C6749e.m5885p(), m5641a((Iterable<a>) arrayListM5642a, true, false).toString());
                    C6744g.m5622b(file);
                    if (!zM5664b) {
                        C6744g.m5617a(file, m5641a((Iterable<a>) arrayListM5642a, false, true).toString());
                    }
                }
                return true;
            case 352:
                if (f6369a || objArr != null) {
                    return m5669d((String) objArr[0]);
                }
                throw new AssertionError();
            case 353:
                if (f6369a || objArr != null) {
                    return m5665b((String) objArr[0], (String) objArr[1], ((Boolean) objArr[2]).booleanValue(), ((Boolean) objArr[3]).booleanValue());
                }
                throw new AssertionError();
            case 354:
                if (!f6369a && objArr == null) {
                    throw new AssertionError();
                }
                File file2 = new File((String) objArr[0]);
                boolean zM5664b2 = m5664b(C6749e.m5885p(), m5641a((Iterable<a>) m5642a(file2, "cst", 30), true, false).toString());
                if (zM5664b2) {
                    C6744g.m5622b(file2);
                }
                return zM5664b2;
            default:
                return false;
        }
    }

    /* renamed from: a */
    public static void m5643a() {
        m5644a(0, C6746b.m5693E() ? 700000L : 70000L);
    }

    /* renamed from: a */
    private static void m5644a(int i9, long j9) {
        if (C6746b.m5691C()) {
            C6743f.m5601a(0, new RunnableC6742e(302, new Object[]{Integer.valueOf(i9)}), j9);
        }
    }

    /* renamed from: a */
    public static boolean m5655a(String str, String str2) {
        String strReplaceAll;
        try {
            String str3 = "c_" + str.replaceAll("[^0-9a-zA-Z-_]", "-");
            if (C6744g.m5619a(str2)) {
                strReplaceAll = "";
            } else {
                strReplaceAll = str2.replaceAll("[`=]", "-");
            }
            Map<String, String> map = f6371c;
            synchronized (map) {
                try {
                    if (map.get(str3) == null) {
                        int i9 = f6372d;
                        if (i9 >= 20) {
                            return false;
                        }
                        f6372d = i9 + 1;
                    }
                    map.put(str3, strReplaceAll);
                    return true;
                } finally {
                }
            }
        } catch (Throwable th) {
            C6744g.m5614a(th);
            return false;
        }
    }

    /* renamed from: b */
    public static void m5662b(boolean z9) {
        if (m5657a(z9, "crash detail upload")) {
            return;
        }
        String str = C6751g.m5957U() + "dt.wa";
        C6746b.m5722a(f6374f, str, new RunnableC6742e(352, new Object[]{str}));
        String strM5678m = m5678m();
        C6746b.m5722a(f6375g, strM5678m, new RunnableC6742e(354, new Object[]{strM5678m}));
    }

    /* renamed from: b */
    private static boolean m5665b(String str, String str2, boolean z9, boolean z10) {
        a aVar;
        File file = new File(m5678m());
        ArrayList<a> arrayListM5642a = m5642a(file, "cst", 30);
        String str3 = str + str2;
        int size = arrayListM5642a.size();
        int i9 = 0;
        while (true) {
            if (i9 >= size) {
                aVar = null;
                break;
            }
            a aVar2 = arrayListM5642a.get(i9);
            i9++;
            aVar = aVar2;
            if (str3.equals(aVar.m5687b("prc") + aVar.m5687b("typ"))) {
                break;
            }
        }
        if (aVar == null) {
            aVar = new a("cst", false, true);
            aVar.m5685a("prc", str);
            aVar.m5685a("typ", str2);
            m5648a(aVar);
            arrayListM5642a.add(aVar);
        }
        aVar.m5684a("cnt", 1L);
        if (z9) {
            aVar.m5684a("lim", 1L);
        }
        if (z10) {
            aVar.m5684a("syu", 1L);
        }
        return C6744g.m5617a(file, m5641a((Iterable<a>) arrayListM5642a, false, false).toString());
    }

    /* renamed from: a */
    private static void m5648a(a aVar) {
        Map<String, String> map = f6371c;
        synchronized (map) {
            try {
                for (String str : map.keySet()) {
                    aVar.m5685a(str, f6371c.get(str));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: a */
    public static void m5654a(boolean z9) {
        m5646a(1, z9);
    }

    /* renamed from: a */
    public static boolean m5657a(boolean z9, String str) {
        if (!C6746b.f6426d || z9 || !JNIBridge.nativeIsCrashing()) {
            return false;
        }
        C6738a.m5566b("crashsdk", "Native is crashing, skip stat for " + str);
        return true;
    }

    /* renamed from: a */
    private static void m5646a(int i9, boolean z9) {
        if (m5657a(z9, "crash rate")) {
            return;
        }
        String str = C6751g.m5957U() + "cr.wa";
        C6746b.m5722a(f6370b, str, new RunnableC6742e(351, new Object[]{str, Integer.valueOf(i9)}));
    }

    /* renamed from: b */
    private static boolean m5664b(String str, String str2) throws NoSuchAlgorithmException, UnsupportedEncodingException {
        boolean z9;
        String string;
        byte[] bArrM5579a;
        byte[] bArrM5581a;
        if (C6744g.m5619a(str2)) {
            return true;
        }
        byte[] bytes = str2.getBytes();
        try {
            byte[] bArr = new byte[16];
            C6740c.m5574a(bArr, 0, C6740c.m5577a());
            C6740c.m5574a(bArr, 4, m5675j());
            C6740c.m5574a(bArr, 8, C6737a.m5551f());
            C6740c.m5574a(bArr, 12, C6741d.m5591c());
            bArrM5581a = C6740c.m5581a(bytes, bArr);
        } catch (Throwable th) {
            C6744g.m5614a(th);
        }
        if (bArrM5581a != null) {
            bytes = bArrM5581a;
            z9 = true;
        } else {
            z9 = false;
        }
        if (str == null) {
            str = EnvironmentCompat.MEDIA_UNKNOWN;
        }
        String str3 = C6751g.m5952P() ? "4ea4e41a3993" : "28ef1713347d";
        String strValueOf = String.valueOf(System.currentTimeMillis());
        String strM5630d = C6744g.m5630d(str3 + str + strValueOf + "AppChk#2014");
        if (strM5630d == null) {
            string = null;
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append(m5680o());
            sb.append("?chk=");
            sb.append(strM5630d.substring(strM5630d.length() - 8, strM5630d.length()));
            sb.append("&vno=");
            sb.append(strValueOf);
            sb.append("&uuid=");
            sb.append(str);
            sb.append("&app=");
            sb.append(str3);
            if (z9) {
                sb.append("&enc=aes");
            }
            string = sb.toString();
        }
        return (string == null || (bArrM5579a = C6740c.m5579a(string, bytes)) == null || !new String(bArrM5579a).contains("retcode=0")) ? false : true;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x004a A[Catch: all -> 0x0035, TryCatch #0 {all -> 0x0035, blocks: (B:19:0x0023, B:21:0x002e, B:23:0x0032, B:55:0x00cf, B:26:0x0038, B:28:0x0042, B:30:0x004a, B:32:0x0064, B:34:0x0069, B:39:0x0076, B:40:0x007d, B:46:0x0091, B:48:0x009d, B:53:0x00b5, B:54:0x00c8, B:51:0x00ab, B:45:0x0089), top: B:67:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0064 A[Catch: all -> 0x0035, TryCatch #0 {all -> 0x0035, blocks: (B:19:0x0023, B:21:0x002e, B:23:0x0032, B:55:0x00cf, B:26:0x0038, B:28:0x0042, B:30:0x004a, B:32:0x0064, B:34:0x0069, B:39:0x0076, B:40:0x007d, B:46:0x0091, B:48:0x009d, B:53:0x00b5, B:54:0x00c8, B:51:0x00ab, B:45:0x0089), top: B:67:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0076 A[Catch: all -> 0x0035, TryCatch #0 {all -> 0x0035, blocks: (B:19:0x0023, B:21:0x002e, B:23:0x0032, B:55:0x00cf, B:26:0x0038, B:28:0x0042, B:30:0x004a, B:32:0x0064, B:34:0x0069, B:39:0x0076, B:40:0x007d, B:46:0x0091, B:48:0x009d, B:53:0x00b5, B:54:0x00c8, B:51:0x00ab, B:45:0x0089), top: B:67:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x009d A[Catch: all -> 0x0035, TryCatch #0 {all -> 0x0035, blocks: (B:19:0x0023, B:21:0x002e, B:23:0x0032, B:55:0x00cf, B:26:0x0038, B:28:0x0042, B:30:0x004a, B:32:0x0064, B:34:0x0069, B:39:0x0076, B:40:0x007d, B:46:0x0091, B:48:0x009d, B:53:0x00b5, B:54:0x00c8, B:51:0x00ab, B:45:0x0089), top: B:67:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00ab A[Catch: all -> 0x0035, TryCatch #0 {all -> 0x0035, blocks: (B:19:0x0023, B:21:0x002e, B:23:0x0032, B:55:0x00cf, B:26:0x0038, B:28:0x0042, B:30:0x004a, B:32:0x0064, B:34:0x0069, B:39:0x0076, B:40:0x007d, B:46:0x0091, B:48:0x009d, B:53:0x00b5, B:54:0x00c8, B:51:0x00ab, B:45:0x0089), top: B:67:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00b5 A[Catch: all -> 0x0035, TryCatch #0 {all -> 0x0035, blocks: (B:19:0x0023, B:21:0x002e, B:23:0x0032, B:55:0x00cf, B:26:0x0038, B:28:0x0042, B:30:0x004a, B:32:0x0064, B:34:0x0069, B:39:0x0076, B:40:0x007d, B:46:0x0091, B:48:0x009d, B:53:0x00b5, B:54:0x00c8, B:51:0x00ab, B:45:0x0089), top: B:67:0x0023 }] */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void m5647a(int r9, java.lang.Object[] r10) {
        /*
            Method dump skipped, instructions count: 246
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p071uc.crashsdk.p072a.C6745h.m5647a(int, java.lang.Object[]):void");
    }

    /* renamed from: a */
    private static StringBuilder m5641a(Iterable<a> iterable, boolean z9, boolean z10) {
        StringBuilder sb = new StringBuilder();
        boolean z11 = true;
        for (a aVar : iterable) {
            if (z11) {
                sb.append(aVar.m5683a(z9, z9, z10));
                z11 = false;
            } else {
                sb.append(aVar.m5683a(false, z9, z10));
            }
        }
        return sb;
    }

    /* renamed from: b */
    public static void m5660b(String str) {
        synchronized (f6379k) {
            f6380l = str;
            C6739b.m5571a(C6746b.m5738h(), f6380l + AbsSection.SEP_ORIGIN_LINE_BREAK);
        }
    }

    /* renamed from: a */
    public static void m5650a(String str, int i9, int i10) {
        if (C6751g.m5951O()) {
            synchronized (f6374f) {
                try {
                    Map<String, a> map = f6373e;
                    a aVar = map.get(str);
                    if (aVar == null) {
                        aVar = new a("cst", false, true);
                        map.put(str, aVar);
                        m5648a(aVar);
                    }
                    SparseArray<String> sparseArray = f6376h;
                    synchronized (sparseArray) {
                        try {
                            if (sparseArray.size() == 0) {
                                m5645a(100, "pv");
                                m5645a(102, "hpv");
                                m5645a(1, "all");
                                m5645a(2, "afg");
                                m5645a(101, "abg");
                                m5645a(3, "jfg");
                                m5645a(4, "jbg");
                                m5645a(7, "nfg");
                                m5645a(8, "nbg");
                                m5645a(27, "nafg");
                                m5645a(28, "nabg");
                                m5645a(9, "nho");
                                m5645a(10, "uar");
                                m5645a(29, "ulm");
                                m5645a(30, "ukt");
                                m5645a(31, "uet");
                                m5645a(32, "urs");
                                m5645a(11, "ufg");
                                m5645a(12, "ubg");
                                m5645a(40, "anf");
                                m5645a(41, "anb");
                                m5645a(42, "ancf");
                                m5645a(43, "ancb");
                                m5645a(13, "lup");
                                m5645a(14, "luf");
                                m5645a(15, "lef");
                                m5645a(200, "ltf");
                                m5645a(16, "laf");
                                m5645a(22, "lac");
                                m5645a(23, "lau");
                                m5645a(17, "llf");
                                m5645a(18, "lul");
                                m5645a(19, "lub");
                                m5645a(20, "luc");
                                m5645a(21, "luu");
                                m5645a(24, "lzc");
                                m5645a(201, "lec");
                                m5645a(25, "lrc");
                                m5645a(26, "lss");
                            }
                        } finally {
                        }
                    }
                    String str2 = sparseArray.get(i9);
                    if (str2 == null) {
                        C6738a.m5564a("crashsdk", "map key is not set with: " + i9, null);
                    }
                    aVar.m5685a("prc", str);
                    if (str2 != null) {
                        aVar.m5685a(str2, String.valueOf(i10));
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    /* renamed from: a */
    public static boolean m5656a(String str, String str2, boolean z9, boolean z10) {
        if (!C6751g.m5951O()) {
            return false;
        }
        return C6746b.m5722a(f6375g, m5678m(), new RunnableC6742e(353, new Object[]{str, str2, Boolean.valueOf(z9), Boolean.valueOf(z10)}));
    }

    /* renamed from: a */
    private static void m5645a(int i9, String str) {
        f6376h.put(i9, str);
    }

    /* renamed from: a */
    private static ArrayList<a> m5642a(File file, String str, int i9) {
        ArrayList<String> arrayListM5609a = C6744g.m5609a(file, i9);
        ArrayList<a> arrayList = new ArrayList<>();
        int size = arrayListM5609a.size();
        int i10 = 0;
        while (i10 < size) {
            String str2 = arrayListM5609a.get(i10);
            i10++;
            a aVar = new a(str, false, false);
            if (aVar.m5688c(str2)) {
                arrayList.add(aVar);
            }
        }
        return arrayList;
    }
}
