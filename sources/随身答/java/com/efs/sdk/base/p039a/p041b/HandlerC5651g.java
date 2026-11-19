package com.efs.sdk.base.p039a.p041b;

import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.efs.sdk.base.p039a.p041b.C5645a;
import com.efs.sdk.base.p039a.p042c.p043a.C5656c;
import com.efs.sdk.base.p039a.p044d.C5661a;
import com.efs.sdk.base.p039a.p047f.C5670b;
import com.efs.sdk.base.p039a.p048g.p049a.C5676c;
import com.efs.sdk.base.p039a.p048g.p049a.C5677d;
import com.efs.sdk.base.p039a.p050h.C5683a;
import com.efs.sdk.base.p039a.p050h.C5689b;
import com.efs.sdk.base.p039a.p050h.C5697d;
import com.efs.sdk.base.p039a.p050h.p051a.C5684a;
import com.efs.sdk.base.p039a.p050h.p053c.C5696b;
import com.efs.sdk.base.p039a.p054i.C5707f;
import com.efs.sdk.base.protocol.file.section.AbsSection;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.efs.sdk.base.a.b.g */
/* loaded from: classes3.dex */
public final class HandlerC5651g extends Handler implements InterfaceC5649e {

    /* renamed from: a */
    private final ConcurrentHashMap<String, a> f4637a;

    /* renamed from: b */
    private C5677d f4638b;

    /* renamed from: c */
    private C5676c f4639c;

    /* renamed from: com.efs.sdk.base.a.b.g$a */
    public static class a extends FileOutputStream {

        /* renamed from: a */
        long f4640a;

        /* renamed from: b */
        File f4641b;

        public a(@NonNull File file) {
            super(file);
            this.f4641b = file;
            this.f4640a = System.currentTimeMillis();
        }
    }

    public HandlerC5651g() {
        super(C5684a.f4739a.getLooper());
        this.f4637a = new ConcurrentHashMap<>();
        this.f4638b = new C5677d();
        this.f4639c = new C5676c();
    }

    /* renamed from: b */
    private static long m4056b(String str) {
        Map<String, String> mapM4079c = C5656c.m4066a().m4079c();
        String strConcat = "record_accumulation_time_".concat(String.valueOf(str));
        if (!mapM4079c.containsKey(strConcat)) {
            return 60000L;
        }
        String str2 = mapM4079c.get(strConcat);
        if (TextUtils.isEmpty(str2)) {
            return 60000L;
        }
        try {
            return Math.max(Long.parseLong(str2) * 1000, 1000L);
        } catch (Throwable th) {
            C5697d.m4183b("efs.cache", "get cache interval error", th);
            return 60000L;
        }
    }

    /* renamed from: c */
    private void m4058c(String str) {
        a aVar;
        if (this.f4637a.containsKey(str) && (aVar = this.f4637a.get(str)) != null) {
            try {
                aVar.flush();
                C5689b.m4151a(aVar);
                mo4051a(aVar.f4641b);
            } catch (Throwable th) {
                try {
                    th.printStackTrace();
                    this.f4637a.remove(str);
                    if ("wa".equalsIgnoreCase(str)) {
                        return;
                    }
                    C5707f.a.f4777a.f4775c.m4199c();
                } finally {
                    this.f4637a.remove(str);
                    if (!"wa".equalsIgnoreCase(str)) {
                        C5707f.a.f4777a.f4775c.m4199c();
                    }
                }
            }
        }
    }

    @Override // com.efs.sdk.base.p039a.p041b.InterfaceC5649e
    /* renamed from: a */
    public final void mo4050a(C5670b c5670b) {
        Message messageObtain = Message.obtain();
        messageObtain.obj = c5670b;
        messageObtain.what = 0;
        sendMessage(messageObtain);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0075 A[Catch: all -> 0x003e, PHI: r2
      0x0075: PHI (r2v3 com.efs.sdk.base.a.b.g$a) = (r2v2 com.efs.sdk.base.a.b.g$a), (r2v6 com.efs.sdk.base.a.b.g$a) binds: [B:21:0x0052, B:23:0x005f] A[DONT_GENERATE, DONT_INLINE], TRY_LEAVE, TryCatch #0 {all -> 0x003e, blocks: (B:14:0x0021, B:17:0x002a, B:20:0x0040, B:22:0x0054, B:24:0x0061, B:25:0x0075), top: B:30:0x0021 }] */
    @Override // android.os.Handler
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void handleMessage(@androidx.annotation.NonNull android.os.Message r10) {
        /*
            r9 = this;
            java.lang.String r0 = "efs.cache"
            int r1 = r10.what
            if (r1 == 0) goto L19
            r0 = 1
            if (r1 == r0) goto Lb
            goto L92
        Lb:
            java.lang.Object r10 = r10.obj
            boolean r0 = r10 instanceof java.lang.String
            if (r0 == 0) goto L92
            java.lang.String r10 = r10.toString()
            r9.m4058c(r10)
            return
        L19:
            java.lang.Object r10 = r10.obj
            com.efs.sdk.base.a.f.b r10 = (com.efs.sdk.base.p039a.p047f.C5670b) r10
            r1 = 0
        L1e:
            r2 = 3
            if (r1 >= r2) goto L92
            com.efs.sdk.base.a.b.g$a r2 = r9.m4057b(r10)     // Catch: java.lang.Throwable -> L3e
            r3 = 0
            java.lang.String r4 = "writer is null for type "
            if (r2 != 0) goto L40
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L3e
            r2.<init>(r4)     // Catch: java.lang.Throwable -> L3e
            com.efs.sdk.base.a.f.a r4 = r10.f4723a     // Catch: java.lang.Throwable -> L3e
            java.lang.String r4 = r4.f4716a     // Catch: java.lang.Throwable -> L3e
            r2.append(r4)     // Catch: java.lang.Throwable -> L3e
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> L3e
            com.efs.sdk.base.p039a.p050h.C5697d.m4182a(r0, r2, r3)     // Catch: java.lang.Throwable -> L3e
            goto L92
        L3e:
            r2 = move-exception
            goto L8a
        L40:
            java.nio.channels.FileChannel r5 = r2.getChannel()     // Catch: java.lang.Throwable -> L3e
            long r5 = r5.position()     // Catch: java.lang.Throwable -> L3e
            byte[] r7 = r10.f4725c     // Catch: java.lang.Throwable -> L3e
            int r7 = r7.length     // Catch: java.lang.Throwable -> L3e
            long r7 = (long) r7     // Catch: java.lang.Throwable -> L3e
            long r5 = r5 + r7
            r7 = 819200(0xc8000, double:4.047386E-318)
            int r5 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r5 <= 0) goto L75
            com.efs.sdk.base.a.f.a r2 = r10.f4723a     // Catch: java.lang.Throwable -> L3e
            java.lang.String r2 = r2.f4716a     // Catch: java.lang.Throwable -> L3e
            r9.m4058c(r2)     // Catch: java.lang.Throwable -> L3e
            com.efs.sdk.base.a.b.g$a r2 = r9.m4057b(r10)     // Catch: java.lang.Throwable -> L3e
            if (r2 != 0) goto L75
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L3e
            r2.<init>(r4)     // Catch: java.lang.Throwable -> L3e
            com.efs.sdk.base.a.f.a r4 = r10.f4723a     // Catch: java.lang.Throwable -> L3e
            java.lang.String r4 = r4.f4716a     // Catch: java.lang.Throwable -> L3e
            r2.append(r4)     // Catch: java.lang.Throwable -> L3e
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> L3e
            com.efs.sdk.base.p039a.p050h.C5697d.m4182a(r0, r2, r3)     // Catch: java.lang.Throwable -> L3e
            goto L92
        L75:
            byte[] r3 = r10.f4725c     // Catch: java.lang.Throwable -> L3e
            r4 = 11
            byte[] r3 = android.util.Base64.encode(r3, r4)     // Catch: java.lang.Throwable -> L3e
            r2.write(r3)     // Catch: java.lang.Throwable -> L3e
            java.lang.String r3 = "\n"
            byte[] r3 = r3.getBytes()     // Catch: java.lang.Throwable -> L3e
            r2.write(r3)     // Catch: java.lang.Throwable -> L3e
            goto L92
        L8a:
            java.lang.String r3 = "cache file error"
            com.efs.sdk.base.p039a.p050h.C5697d.m4183b(r0, r3, r2)
            int r1 = r1 + 1
            goto L1e
        L92:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.efs.sdk.base.p039a.p041b.HandlerC5651g.handleMessage(android.os.Message):void");
    }

    @Override // com.efs.sdk.base.p039a.p041b.InterfaceC5649e
    /* renamed from: a */
    public final boolean mo4053a(File file, C5670b c5670b) {
        if (!c5670b.m4126b()) {
            mo4051a(file);
            return false;
        }
        if (!file.exists()) {
            return false;
        }
        c5670b.f4726d = file;
        c5670b.m4128d();
        c5670b.m4125b(1);
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0076  */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private com.efs.sdk.base.p039a.p041b.HandlerC5651g.a m4057b(com.efs.sdk.base.p039a.p047f.C5670b r6) {
        /*
            r5 = this;
            java.util.concurrent.ConcurrentHashMap<java.lang.String, com.efs.sdk.base.a.b.g$a> r0 = r5.f4637a
            com.efs.sdk.base.a.f.a r1 = r6.f4723a
            java.lang.String r1 = r1.f4716a
            boolean r0 = r0.containsKey(r1)
            if (r0 == 0) goto L19
            java.util.concurrent.ConcurrentHashMap<java.lang.String, com.efs.sdk.base.a.b.g$a> r0 = r5.f4637a
            com.efs.sdk.base.a.f.a r6 = r6.f4723a
            java.lang.String r6 = r6.f4716a
            java.lang.Object r6 = r0.get(r6)
            com.efs.sdk.base.a.b.g$a r6 = (com.efs.sdk.base.p039a.p041b.HandlerC5651g.a) r6
            return r6
        L19:
            java.lang.String r0 = com.efs.sdk.base.p039a.p050h.C5689b.m4149a(r6)
            java.io.File r1 = new java.io.File
            com.efs.sdk.base.a.c.a r2 = com.efs.sdk.base.p039a.p044d.C5661a.m4097a()
            android.content.Context r2 = r2.f4644c
            com.efs.sdk.base.a.c.a r3 = com.efs.sdk.base.p039a.p044d.C5661a.m4097a()
            java.lang.String r3 = r3.f4642a
            java.io.File r2 = com.efs.sdk.base.p039a.p050h.C5683a.m4142e(r2, r3)
            r1.<init>(r2, r0)
            r0 = 0
            com.efs.sdk.base.a.b.g$a r2 = new com.efs.sdk.base.a.b.g$a     // Catch: java.lang.Throwable -> L64
            r2.<init>(r1)     // Catch: java.lang.Throwable -> L64
            java.util.concurrent.ConcurrentHashMap<java.lang.String, com.efs.sdk.base.a.b.g$a> r0 = r5.f4637a     // Catch: java.lang.Throwable -> L4d
            com.efs.sdk.base.a.f.a r3 = r6.f4723a     // Catch: java.lang.Throwable -> L4d
            java.lang.String r3 = r3.f4716a     // Catch: java.lang.Throwable -> L4d
            java.lang.Object r0 = r0.putIfAbsent(r3, r2)     // Catch: java.lang.Throwable -> L4d
            com.efs.sdk.base.a.b.g$a r0 = (com.efs.sdk.base.p039a.p041b.HandlerC5651g.a) r0     // Catch: java.lang.Throwable -> L4d
            if (r0 == 0) goto L4f
            com.efs.sdk.base.p039a.p050h.C5689b.m4151a(r2)     // Catch: java.lang.Throwable -> L4d
            com.efs.sdk.base.p039a.p050h.C5689b.m4157b(r1)     // Catch: java.lang.Throwable -> L4d
            return r0
        L4d:
            r0 = move-exception
            goto L67
        L4f:
            android.os.Message r0 = android.os.Message.obtain()     // Catch: java.lang.Throwable -> L4d
            com.efs.sdk.base.a.f.a r1 = r6.f4723a     // Catch: java.lang.Throwable -> L4d
            java.lang.String r1 = r1.f4716a     // Catch: java.lang.Throwable -> L4d
            r0.obj = r1     // Catch: java.lang.Throwable -> L4d
            r3 = 1
            r0.what = r3     // Catch: java.lang.Throwable -> L4d
            long r3 = m4056b(r1)     // Catch: java.lang.Throwable -> L4d
            r5.sendMessageDelayed(r0, r3)     // Catch: java.lang.Throwable -> L4d
            goto L6a
        L64:
            r1 = move-exception
            r2 = r0
            r0 = r1
        L67:
            r0.printStackTrace()
        L6a:
            com.efs.sdk.base.a.f.a r6 = r6.f4723a
            java.lang.String r6 = r6.f4716a
            java.lang.String r0 = "wa"
            boolean r6 = r0.equalsIgnoreCase(r6)
            if (r6 != 0) goto L7f
            com.efs.sdk.base.a.i.f r6 = com.efs.sdk.base.p039a.p054i.C5707f.a.m4207a()
            com.efs.sdk.base.a.i.d r6 = r6.f4775c
            r6.m4198b()
        L7f:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.efs.sdk.base.p039a.p041b.HandlerC5651g.m4057b(com.efs.sdk.base.a.f.b):com.efs.sdk.base.a.b.g$a");
    }

    @Override // com.efs.sdk.base.p039a.p041b.InterfaceC5649e
    /* renamed from: a */
    public final void mo4052a(@NonNull String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        Message messageObtain = Message.obtain();
        messageObtain.obj = str;
        messageObtain.what = 1;
        sendMessage(messageObtain);
    }

    @Override // com.efs.sdk.base.p039a.p041b.InterfaceC5649e
    /* renamed from: a */
    public final void mo4051a(File file) {
        byte[] bArr;
        C5670b c5670bM4156b = C5689b.m4156b(file.getName());
        if (c5670bM4156b == null) {
            C5645a unused = C5645a.b.f4633a;
            C5645a.m4042b(file);
        } else if (!m4055a(c5670bM4156b, file) || (bArr = c5670bM4156b.f4725c) == null || bArr.length <= 0) {
            C5645a unused2 = C5645a.b.f4633a;
            C5645a.m4042b(file);
        } else {
            C5689b.m4154a(new File(C5683a.m4143f(C5661a.m4097a().f4644c, C5661a.m4097a().f4642a), C5689b.m4149a(c5670bM4156b)), c5670bM4156b.f4725c);
            C5689b.m4157b(file);
        }
    }

    /* renamed from: a */
    private boolean m4055a(C5670b c5670b, File file) {
        BufferedReader bufferedReader;
        FileReader fileReader;
        StringBuilder sb = new StringBuilder();
        FileReader fileReader2 = null;
        try {
            fileReader = new FileReader(file);
            try {
                bufferedReader = new BufferedReader(fileReader);
            } catch (Throwable th) {
                th = th;
                bufferedReader = null;
            }
        } catch (Throwable th2) {
            th = th2;
            bufferedReader = null;
        }
        try {
            for (String line = bufferedReader.readLine(); line != null; line = bufferedReader.readLine()) {
                String strM4180b = C5696b.m4180b(line.getBytes());
                if (!TextUtils.isEmpty(strM4180b)) {
                    sb.append(strM4180b);
                    sb.append(AbsSection.SEP_ORIGIN_LINE_BREAK);
                }
            }
            c5670b.m4124a(sb.toString().getBytes());
            c5670b.m4128d();
            this.f4639c.mo4131a(c5670b);
            this.f4638b.mo4131a(c5670b);
            c5670b.f4726d = file;
            C5689b.m4151a(bufferedReader);
            C5689b.m4151a(fileReader);
            return true;
        } catch (Throwable th3) {
            th = th3;
            fileReader2 = fileReader;
            try {
                C5697d.m4183b("efs.cache", "local decode error", th);
                C5689b.m4151a(bufferedReader);
                C5689b.m4151a(fileReader2);
                return false;
            } catch (Throwable th4) {
                C5689b.m4151a(bufferedReader);
                C5689b.m4151a(fileReader2);
                throw th4;
            }
        }
    }
}
