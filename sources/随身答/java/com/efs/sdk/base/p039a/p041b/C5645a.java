package com.efs.sdk.base.p039a.p041b;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.efs.sdk.base.p039a.p040a.C5641a;
import com.efs.sdk.base.p039a.p044d.C5661a;
import com.efs.sdk.base.p039a.p047f.C5670b;
import com.efs.sdk.base.p039a.p050h.C5683a;
import com.efs.sdk.base.p039a.p050h.C5689b;
import com.efs.sdk.base.p039a.p050h.C5697d;
import com.efs.sdk.base.p039a.p050h.C5700g;
import com.efs.sdk.base.p039a.p054i.C5707f;
import java.io.File;
import java.util.Comparator;
import java.util.List;

/* renamed from: com.efs.sdk.base.a.b.a */
/* loaded from: classes3.dex */
public final class C5645a {

    /* renamed from: a */
    public boolean f4629a;

    /* renamed from: b */
    public boolean f4630b;

    /* renamed from: c */
    public C5646b f4631c;

    /* renamed from: d */
    public a f4632d;

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
        private static final C5645a f4633a = new C5645a(0);
    }

    public /* synthetic */ C5645a(byte b10) {
        this();
    }

    /* renamed from: b */
    public static void m4042b(@NonNull File file) {
        if (!file.getName().startsWith("wa_")) {
            C5707f.a.f4777a.f4775c.m4201e();
        }
        C5689b.m4157b(file);
    }

    /* renamed from: c */
    public static void m4043c(File file) {
        StringBuilder sb = new StringBuilder("file is expire: ");
        sb.append(file.getName());
        sb.append(", now is ");
        C5641a.m4024a();
        sb.append(C5641a.m4027b());
        C5697d.m4181a("efs.cache", sb.toString());
        if (!file.getName().startsWith("wa_")) {
            C5707f.a.f4777a.f4775c.m4200d();
        }
        C5689b.m4157b(file);
    }

    /* renamed from: a */
    public final void m4045a() {
        String[] list;
        File fileM4141d = C5683a.m4141d(C5661a.m4097a().f4644c, C5661a.m4097a().f4642a);
        if (!fileM4141d.exists() || !fileM4141d.isDirectory() || (list = fileM4141d.list()) == null || list.length <= 0) {
            return;
        }
        for (String str : list) {
            if (!C5700g.m4192a(C5661a.m4097a().f4644c, str)) {
                File file = new File(fileM4141d, str);
                List<File> listM4159d = C5689b.m4159d(file);
                if (!listM4159d.isEmpty()) {
                    for (File file2 : listM4159d) {
                        if (m4041a(file2.getName())) {
                            m4043c(file2);
                        } else {
                            C5670b c5670bM4156b = C5689b.m4156b(file2.getName());
                            if (c5670bM4156b == null) {
                                m4042b(file2);
                            } else {
                                InterfaceC5649e interfaceC5649eM4047a = this.f4631c.m4047a(c5670bM4156b.f4723a.f4717b);
                                if (interfaceC5649eM4047a == null) {
                                    m4042b(file2);
                                } else {
                                    interfaceC5649eM4047a.mo4051a(file2);
                                }
                            }
                        }
                    }
                }
                C5689b.m4157b(file);
            }
        }
    }

    private C5645a() {
        this.f4629a = false;
        this.f4630b = true;
        this.f4631c = new C5646b();
        this.f4632d = new a();
    }

    /* renamed from: a */
    public static boolean m4041a(String str) {
        try {
            long j9 = Long.parseLong(str.substring(str.lastIndexOf("_") + 1));
            C5641a.m4024a();
            return Math.abs(C5641a.m4027b() - j9) >= 604800000;
        } catch (Throwable unused) {
            return true;
        }
    }

    @Nullable
    /* renamed from: a */
    public final C5670b m4044a(File file) {
        try {
            if (!file.exists()) {
                return null;
            }
            if (m4041a(file.getName())) {
                m4043c(file);
                return null;
            }
            C5670b c5670bM4156b = C5689b.m4156b(file.getName());
            if (c5670bM4156b == null) {
                m4042b(file);
                return null;
            }
            InterfaceC5649e interfaceC5649eM4047a = this.f4631c.m4047a(c5670bM4156b.f4723a.f4717b);
            if (interfaceC5649eM4047a == null) {
                m4042b(file);
                return null;
            }
            if (interfaceC5649eM4047a.mo4053a(file, c5670bM4156b)) {
                return c5670bM4156b;
            }
            m4042b(file);
            return null;
        } catch (Throwable th) {
            C5697d.m4182a("efs.base", "efs.cache", th);
            m4042b(file);
            return null;
        }
    }
}
