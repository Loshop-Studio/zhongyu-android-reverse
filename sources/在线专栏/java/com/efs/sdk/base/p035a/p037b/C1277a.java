package com.efs.sdk.base.p035a.p037b;

import com.efs.sdk.base.p035a.p036a.C1273a;
import com.efs.sdk.base.p035a.p040d.C1293a;
import com.efs.sdk.base.p035a.p043f.C1302b;
import com.efs.sdk.base.p035a.p046h.C1315a;
import com.efs.sdk.base.p035a.p046h.C1321b;
import com.efs.sdk.base.p035a.p046h.C1329d;
import com.efs.sdk.base.p035a.p046h.C1332g;
import com.efs.sdk.base.p035a.p050i.C1339f;
import java.io.File;
import java.util.Comparator;
import java.util.List;

/* renamed from: com.efs.sdk.base.a.b.a */
/* loaded from: classes.dex */
public final class C1277a {

    /* renamed from: a */
    public boolean f6995a;

    /* renamed from: b */
    public boolean f6996b;

    /* renamed from: c */
    public C1278b f6997c;

    /* renamed from: d */
    public a f6998d;

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
        private static final C1277a f6999a = new C1277a(0);
    }

    /* synthetic */ C1277a(byte b4) {
        this();
    }

    /* renamed from: b */
    static void m5432b(File file) {
        if (!file.getName().startsWith("wa_")) {
            C1339f.a.f7143a.f7141c.m5591e();
        }
        C1321b.m5547b(file);
    }

    /* renamed from: c */
    static void m5433c(File file) {
        StringBuilder sb = new StringBuilder("file is expire: ");
        sb.append(file.getName());
        sb.append(", now is ");
        C1273a.m5414a();
        sb.append(C1273a.m5417b());
        C1329d.m5571a("efs.cache", sb.toString());
        if (!file.getName().startsWith("wa_")) {
            C1339f.a.f7143a.f7141c.m5590d();
        }
        C1321b.m5547b(file);
    }

    /* renamed from: a */
    public final void m5435a() {
        String[] list;
        File fileM5531d = C1315a.m5531d(C1293a.m5487a().f7010c, C1293a.m5487a().f7008a);
        if (!fileM5531d.exists() || !fileM5531d.isDirectory() || (list = fileM5531d.list()) == null || list.length <= 0) {
            return;
        }
        for (String str : list) {
            if (!C1332g.m5582a(C1293a.m5487a().f7010c, str)) {
                File file = new File(fileM5531d, str);
                List<File> listM5549d = C1321b.m5549d(file);
                if (!listM5549d.isEmpty()) {
                    for (File file2 : listM5549d) {
                        if (m5431a(file2.getName())) {
                            m5433c(file2);
                        } else {
                            C1302b c1302bM5546b = C1321b.m5546b(file2.getName());
                            if (c1302bM5546b == null) {
                                m5432b(file2);
                            } else {
                                InterfaceC1281e interfaceC1281eM5437a = this.f6997c.m5437a(c1302bM5546b.f7089a.f7083b);
                                if (interfaceC1281eM5437a == null) {
                                    m5432b(file2);
                                } else {
                                    interfaceC1281eM5437a.mo5441a(file2);
                                }
                            }
                        }
                    }
                }
                C1321b.m5547b(file);
            }
        }
    }

    private C1277a() {
        this.f6995a = false;
        this.f6996b = true;
        this.f6997c = new C1278b();
        this.f6998d = new a();
    }

    /* renamed from: a */
    static boolean m5431a(String str) {
        try {
            long j4 = Long.parseLong(str.substring(str.lastIndexOf("_") + 1));
            C1273a.m5414a();
            return Math.abs(C1273a.m5417b() - j4) >= 604800000;
        } catch (Throwable unused) {
            return true;
        }
    }

    /* renamed from: a */
    public final C1302b m5434a(File file) {
        try {
            if (!file.exists()) {
                return null;
            }
            if (m5431a(file.getName())) {
                m5433c(file);
                return null;
            }
            C1302b c1302bM5546b = C1321b.m5546b(file.getName());
            if (c1302bM5546b == null) {
                m5432b(file);
                return null;
            }
            InterfaceC1281e interfaceC1281eM5437a = this.f6997c.m5437a(c1302bM5546b.f7089a.f7083b);
            if (interfaceC1281eM5437a == null) {
                m5432b(file);
                return null;
            }
            if (interfaceC1281eM5437a.mo5443a(file, c1302bM5546b)) {
                return c1302bM5546b;
            }
            m5432b(file);
            return null;
        } catch (Throwable th) {
            C1329d.m5572a("efs.base", "efs.cache", th);
            m5432b(file);
            return null;
        }
    }
}
