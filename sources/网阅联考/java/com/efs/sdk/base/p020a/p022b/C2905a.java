package com.efs.sdk.base.p020a.p022b;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.efs.sdk.base.p020a.p021a.C2901a;
import com.efs.sdk.base.p020a.p025d.C2921a;
import com.efs.sdk.base.p020a.p028f.C2930b;
import com.efs.sdk.base.p020a.p031h.C2943a;
import com.efs.sdk.base.p020a.p031h.C2949b;
import com.efs.sdk.base.p020a.p031h.C2957d;
import com.efs.sdk.base.p020a.p031h.C2960g;
import com.efs.sdk.base.p020a.p035i.C2967f;
import java.io.File;
import java.util.Comparator;
import java.util.List;

/* renamed from: com.efs.sdk.base.a.b.a */
/* loaded from: classes2.dex */
public final class C2905a {

    /* renamed from: a */
    public boolean f1025a;

    /* renamed from: b */
    public boolean f1026b;

    /* renamed from: c */
    public C2906b f1027c;

    /* renamed from: d */
    public a f1028d;

    /* renamed from: com.efs.sdk.base.a.b.a$a */
    public static class a implements Comparator<File> {
        @Override // java.util.Comparator
        public final /* synthetic */ int compare(File file, File file2) {
            long jLastModified = file.lastModified() - file2.lastModified();
            if (jLastModified > 0) {
                return 1;
            }
            return jLastModified == 0 ? 0 : -1;
        }
    }

    /* renamed from: com.efs.sdk.base.a.b.a$b */
    public static class b {

        /* renamed from: a */
        private static final C2905a f1029a = new C2905a(0);
    }

    public /* synthetic */ C2905a(byte b4) {
        this();
    }

    /* renamed from: b */
    public static void m2073b(@NonNull File file) {
        if (!file.getName().startsWith("wa_")) {
            C2967f.a.f1173a.f1171c.m2232e();
        }
        C2949b.m2188b(file);
    }

    /* renamed from: c */
    public static void m2074c(File file) {
        StringBuilder sb = new StringBuilder("file is expire: ");
        sb.append(file.getName());
        sb.append(", now is ");
        C2901a.m2055a();
        sb.append(C2901a.m2058b());
        C2957d.m2212a("efs.cache", sb.toString());
        if (!file.getName().startsWith("wa_")) {
            C2967f.a.f1173a.f1171c.m2231d();
        }
        C2949b.m2188b(file);
    }

    /* renamed from: a */
    public final void m2076a() {
        String[] list;
        File fileM2172d = C2943a.m2172d(C2921a.m2128a().f1040c, C2921a.m2128a().f1038a);
        if (!fileM2172d.exists() || !fileM2172d.isDirectory() || (list = fileM2172d.list()) == null || list.length <= 0) {
            return;
        }
        for (String str : list) {
            if (!C2960g.m2223a(C2921a.m2128a().f1040c, str)) {
                File file = new File(fileM2172d, str);
                List<File> listM2190d = C2949b.m2190d(file);
                if (!listM2190d.isEmpty()) {
                    for (File file2 : listM2190d) {
                        if (m2072a(file2.getName())) {
                            m2074c(file2);
                        } else {
                            C2930b c2930bM2187b = C2949b.m2187b(file2.getName());
                            if (c2930bM2187b == null) {
                                m2073b(file2);
                            } else {
                                InterfaceC2909e interfaceC2909eM2078a = this.f1027c.m2078a(c2930bM2187b.f1119a.f1113b);
                                if (interfaceC2909eM2078a == null) {
                                    m2073b(file2);
                                } else {
                                    interfaceC2909eM2078a.mo2082a(file2);
                                }
                            }
                        }
                    }
                }
                C2949b.m2188b(file);
            }
        }
    }

    private C2905a() {
        this.f1025a = false;
        this.f1026b = true;
        this.f1027c = new C2906b();
        this.f1028d = new a();
    }

    /* renamed from: a */
    public static boolean m2072a(String str) {
        try {
            long j4 = Long.parseLong(str.substring(str.lastIndexOf("_") + 1));
            C2901a.m2055a();
            return Math.abs(C2901a.m2058b() - j4) >= 604800000;
        } catch (Throwable unused) {
            return true;
        }
    }

    @Nullable
    /* renamed from: a */
    public final C2930b m2075a(File file) {
        try {
            if (!file.exists()) {
                return null;
            }
            if (m2072a(file.getName())) {
                m2074c(file);
                return null;
            }
            C2930b c2930bM2187b = C2949b.m2187b(file.getName());
            if (c2930bM2187b == null) {
                m2073b(file);
                return null;
            }
            InterfaceC2909e interfaceC2909eM2078a = this.f1027c.m2078a(c2930bM2187b.f1119a.f1113b);
            if (interfaceC2909eM2078a == null) {
                m2073b(file);
                return null;
            }
            if (interfaceC2909eM2078a.mo2084a(file, c2930bM2187b)) {
                return c2930bM2187b;
            }
            m2073b(file);
            return null;
        } catch (Throwable th) {
            C2957d.m2213a("efs.base", "efs.cache", th);
            m2073b(file);
            return null;
        }
    }
}
