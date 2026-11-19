package com.efs.sdk.base.p020a.p022b;

import android.os.Handler;
import android.os.Message;
import android.support.annotation.NonNull;
import android.text.TextUtils;
import android.util.Base64;
import com.efs.sdk.base.p020a.p022b.C2905a;
import com.efs.sdk.base.p020a.p023c.p024a.C2916c;
import com.efs.sdk.base.p020a.p025d.C2921a;
import com.efs.sdk.base.p020a.p028f.C2930b;
import com.efs.sdk.base.p020a.p029g.p030a.C2936c;
import com.efs.sdk.base.p020a.p029g.p030a.C2937d;
import com.efs.sdk.base.p020a.p031h.C2943a;
import com.efs.sdk.base.p020a.p031h.C2949b;
import com.efs.sdk.base.p020a.p031h.C2957d;
import com.efs.sdk.base.p020a.p031h.p032a.C2944a;
import com.efs.sdk.base.p020a.p031h.p034c.C2956b;
import com.efs.sdk.base.p020a.p035i.C2967f;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.efs.sdk.base.a.b.g */
/* loaded from: classes2.dex */
public final class HandlerC2911g extends Handler implements InterfaceC2909e {

    /* renamed from: a */
    private final ConcurrentHashMap<String, a> f1033a;

    /* renamed from: b */
    private C2937d f1034b;

    /* renamed from: c */
    private C2936c f1035c;

    /* renamed from: com.efs.sdk.base.a.b.g$a */
    public static class a extends FileOutputStream {

        /* renamed from: a */
        long f1036a;

        /* renamed from: b */
        File f1037b;

        public a(@NonNull File file) {
            super(file);
            this.f1037b = file;
            this.f1036a = System.currentTimeMillis();
        }
    }

    public HandlerC2911g() {
        super(C2944a.f1135a.getLooper());
        this.f1033a = new ConcurrentHashMap<>();
        this.f1034b = new C2937d();
        this.f1035c = new C2936c();
    }

    /* renamed from: b */
    private static long m2087b(String str) {
        Map<String, String> mapM2110c = C2916c.m2097a().m2110c();
        String strConcat = "record_accumulation_time_".concat(String.valueOf(str));
        if (!mapM2110c.containsKey(strConcat)) {
            return 60000L;
        }
        String str2 = mapM2110c.get(strConcat);
        if (TextUtils.isEmpty(str2)) {
            return 60000L;
        }
        try {
            return Math.max(Long.parseLong(str2) * 1000, 1000L);
        } catch (Throwable th) {
            C2957d.m2214b("efs.cache", "get cache interval error", th);
            return 60000L;
        }
    }

    /* renamed from: c */
    private void m2089c(String str) {
        a aVar;
        if (this.f1033a.containsKey(str) && (aVar = this.f1033a.get(str)) != null) {
            try {
                aVar.flush();
                C2949b.m2182a(aVar);
                mo2082a(aVar.f1037b);
            } catch (Throwable th) {
                try {
                    th.printStackTrace();
                    this.f1033a.remove(str);
                    if ("wa".equalsIgnoreCase(str)) {
                        return;
                    }
                    C2967f.a.f1173a.f1171c.m2230c();
                } finally {
                    this.f1033a.remove(str);
                    if (!"wa".equalsIgnoreCase(str)) {
                        C2967f.a.f1173a.f1171c.m2230c();
                    }
                }
            }
        }
    }

    @Override // com.efs.sdk.base.p020a.p022b.InterfaceC2909e
    /* renamed from: a */
    public final void mo2081a(C2930b c2930b) {
        Message messageObtain = Message.obtain();
        messageObtain.obj = c2930b;
        messageObtain.what = 0;
        sendMessage(messageObtain);
    }

    @Override // android.os.Handler
    public final void handleMessage(@NonNull Message message) {
        int i4 = message.what;
        if (i4 != 0) {
            if (i4 != 1) {
                return;
            }
            Object obj = message.obj;
            if (obj instanceof String) {
                m2089c(obj.toString());
                return;
            }
            return;
        }
        C2930b c2930b = (C2930b) message.obj;
        for (int i5 = 0; i5 < 3; i5++) {
            try {
                a aVarM2088b = m2088b(c2930b);
                if (aVarM2088b == null) {
                    C2957d.m2213a("efs.cache", "writer is null for type " + c2930b.f1119a.f1112a, null);
                    return;
                }
                if (aVarM2088b.getChannel().position() + c2930b.f1121c.length > 819200) {
                    m2089c(c2930b.f1119a.f1112a);
                    aVarM2088b = m2088b(c2930b);
                    if (aVarM2088b == null) {
                        C2957d.m2213a("efs.cache", "writer is null for type " + c2930b.f1119a.f1112a, null);
                        return;
                    }
                }
                aVarM2088b.write(Base64.encode(c2930b.f1121c, 11));
                aVarM2088b.write("\n".getBytes());
                return;
            } catch (Throwable th) {
                C2957d.m2214b("efs.cache", "cache file error", th);
            }
        }
    }

    @Override // com.efs.sdk.base.p020a.p022b.InterfaceC2909e
    /* renamed from: a */
    public final boolean mo2084a(File file, C2930b c2930b) {
        if (!c2930b.m2157b()) {
            mo2082a(file);
            return false;
        }
        if (!file.exists()) {
            return false;
        }
        c2930b.f1122d = file;
        c2930b.m2159d();
        c2930b.m2156b(1);
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0076  */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private com.efs.sdk.base.p020a.p022b.HandlerC2911g.a m2088b(com.efs.sdk.base.p020a.p028f.C2930b r6) {
        /*
            r5 = this;
            java.util.concurrent.ConcurrentHashMap<java.lang.String, com.efs.sdk.base.a.b.g$a> r0 = r5.f1033a
            com.efs.sdk.base.a.f.a r1 = r6.f1119a
            java.lang.String r1 = r1.f1112a
            boolean r0 = r0.containsKey(r1)
            if (r0 == 0) goto L19
            java.util.concurrent.ConcurrentHashMap<java.lang.String, com.efs.sdk.base.a.b.g$a> r0 = r5.f1033a
            com.efs.sdk.base.a.f.a r6 = r6.f1119a
            java.lang.String r6 = r6.f1112a
            java.lang.Object r6 = r0.get(r6)
            com.efs.sdk.base.a.b.g$a r6 = (com.efs.sdk.base.p020a.p022b.HandlerC2911g.a) r6
            return r6
        L19:
            java.lang.String r0 = com.efs.sdk.base.p020a.p031h.C2949b.m2180a(r6)
            java.io.File r1 = new java.io.File
            com.efs.sdk.base.a.c.a r2 = com.efs.sdk.base.p020a.p025d.C2921a.m2128a()
            android.content.Context r2 = r2.f1040c
            com.efs.sdk.base.a.c.a r3 = com.efs.sdk.base.p020a.p025d.C2921a.m2128a()
            java.lang.String r3 = r3.f1038a
            java.io.File r2 = com.efs.sdk.base.p020a.p031h.C2943a.m2173e(r2, r3)
            r1.<init>(r2, r0)
            r0 = 0
            com.efs.sdk.base.a.b.g$a r2 = new com.efs.sdk.base.a.b.g$a     // Catch: java.lang.Throwable -> L64
            r2.<init>(r1)     // Catch: java.lang.Throwable -> L64
            java.util.concurrent.ConcurrentHashMap<java.lang.String, com.efs.sdk.base.a.b.g$a> r0 = r5.f1033a     // Catch: java.lang.Throwable -> L62
            com.efs.sdk.base.a.f.a r3 = r6.f1119a     // Catch: java.lang.Throwable -> L62
            java.lang.String r3 = r3.f1112a     // Catch: java.lang.Throwable -> L62
            java.lang.Object r0 = r0.putIfAbsent(r3, r2)     // Catch: java.lang.Throwable -> L62
            com.efs.sdk.base.a.b.g$a r0 = (com.efs.sdk.base.p020a.p022b.HandlerC2911g.a) r0     // Catch: java.lang.Throwable -> L62
            if (r0 == 0) goto L4d
            com.efs.sdk.base.p020a.p031h.C2949b.m2182a(r2)     // Catch: java.lang.Throwable -> L62
            com.efs.sdk.base.p020a.p031h.C2949b.m2188b(r1)     // Catch: java.lang.Throwable -> L62
            return r0
        L4d:
            android.os.Message r0 = android.os.Message.obtain()     // Catch: java.lang.Throwable -> L62
            com.efs.sdk.base.a.f.a r1 = r6.f1119a     // Catch: java.lang.Throwable -> L62
            java.lang.String r1 = r1.f1112a     // Catch: java.lang.Throwable -> L62
            r0.obj = r1     // Catch: java.lang.Throwable -> L62
            r3 = 1
            r0.what = r3     // Catch: java.lang.Throwable -> L62
            long r3 = m2087b(r1)     // Catch: java.lang.Throwable -> L62
            r5.sendMessageDelayed(r0, r3)     // Catch: java.lang.Throwable -> L62
            goto L6a
        L62:
            r0 = move-exception
            goto L67
        L64:
            r1 = move-exception
            r2 = r0
            r0 = r1
        L67:
            r0.printStackTrace()
        L6a:
            com.efs.sdk.base.a.f.a r6 = r6.f1119a
            java.lang.String r6 = r6.f1112a
            java.lang.String r0 = "wa"
            boolean r6 = r0.equalsIgnoreCase(r6)
            if (r6 != 0) goto L7f
            com.efs.sdk.base.a.i.f r6 = com.efs.sdk.base.p020a.p035i.C2967f.a.m2238a()
            com.efs.sdk.base.a.i.d r6 = r6.f1171c
            r6.m2229b()
        L7f:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.efs.sdk.base.p020a.p022b.HandlerC2911g.m2088b(com.efs.sdk.base.a.f.b):com.efs.sdk.base.a.b.g$a");
    }

    @Override // com.efs.sdk.base.p020a.p022b.InterfaceC2909e
    /* renamed from: a */
    public final void mo2083a(@NonNull String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        Message messageObtain = Message.obtain();
        messageObtain.obj = str;
        messageObtain.what = 1;
        sendMessage(messageObtain);
    }

    @Override // com.efs.sdk.base.p020a.p022b.InterfaceC2909e
    /* renamed from: a */
    public final void mo2082a(File file) {
        byte[] bArr;
        C2930b c2930bM2187b = C2949b.m2187b(file.getName());
        if (c2930bM2187b == null) {
            C2905a unused = C2905a.b.f1029a;
            C2905a.m2073b(file);
        } else if (!m2086a(c2930bM2187b, file) || (bArr = c2930bM2187b.f1121c) == null || bArr.length <= 0) {
            C2905a unused2 = C2905a.b.f1029a;
            C2905a.m2073b(file);
        } else {
            C2949b.m2185a(new File(C2943a.m2174f(C2921a.m2128a().f1040c, C2921a.m2128a().f1038a), C2949b.m2180a(c2930bM2187b)), c2930bM2187b.f1121c);
            C2949b.m2188b(file);
        }
    }

    /* renamed from: a */
    private boolean m2086a(C2930b c2930b, File file) {
        BufferedReader bufferedReader;
        StringBuilder sb = new StringBuilder();
        FileReader fileReader = null;
        try {
            FileReader fileReader2 = new FileReader(file);
            try {
                bufferedReader = new BufferedReader(fileReader2);
                try {
                    for (String line = bufferedReader.readLine(); line != null; line = bufferedReader.readLine()) {
                        String strM2211b = C2956b.m2211b(line.getBytes());
                        if (!TextUtils.isEmpty(strM2211b)) {
                            sb.append(strM2211b);
                            sb.append("\n");
                        }
                    }
                    c2930b.m2155a(sb.toString().getBytes());
                    c2930b.m2159d();
                    this.f1035c.mo2162a(c2930b);
                    this.f1034b.mo2162a(c2930b);
                    c2930b.f1122d = file;
                    C2949b.m2182a(bufferedReader);
                    C2949b.m2182a(fileReader2);
                    return true;
                } catch (Throwable th) {
                    th = th;
                    fileReader = fileReader2;
                    try {
                        C2957d.m2214b("efs.cache", "local decode error", th);
                        C2949b.m2182a(bufferedReader);
                        C2949b.m2182a(fileReader);
                        return false;
                    } catch (Throwable th2) {
                        C2949b.m2182a(bufferedReader);
                        C2949b.m2182a(fileReader);
                        throw th2;
                    }
                }
            } catch (Throwable th3) {
                th = th3;
                bufferedReader = null;
            }
        } catch (Throwable th4) {
            th = th4;
            bufferedReader = null;
        }
    }
}
