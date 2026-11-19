package com.efs.sdk.base.p035a.p037b;

import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import android.util.Base64;
import com.efs.sdk.base.p035a.p037b.C1277a;
import com.efs.sdk.base.p035a.p038c.p039a.C1288c;
import com.efs.sdk.base.p035a.p040d.C1293a;
import com.efs.sdk.base.p035a.p043f.C1302b;
import com.efs.sdk.base.p035a.p044g.p045a.C1308c;
import com.efs.sdk.base.p035a.p044g.p045a.C1309d;
import com.efs.sdk.base.p035a.p046h.C1315a;
import com.efs.sdk.base.p035a.p046h.C1321b;
import com.efs.sdk.base.p035a.p046h.C1329d;
import com.efs.sdk.base.p035a.p046h.p047a.C1316a;
import com.efs.sdk.base.p035a.p046h.p049c.C1328b;
import com.efs.sdk.base.p035a.p050i.C1339f;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.efs.sdk.base.a.b.g */
/* loaded from: classes.dex */
public final class HandlerC1283g extends Handler implements InterfaceC1281e {

    /* renamed from: a */
    private final ConcurrentHashMap<String, a> f7003a;

    /* renamed from: b */
    private C1309d f7004b;

    /* renamed from: c */
    private C1308c f7005c;

    /* renamed from: com.efs.sdk.base.a.b.g$a */
    static class a extends FileOutputStream {

        /* renamed from: a */
        long f7006a;

        /* renamed from: b */
        File f7007b;

        a(File file) {
            super(file);
            this.f7007b = file;
            this.f7006a = System.currentTimeMillis();
        }
    }

    HandlerC1283g() {
        super(C1316a.f7105a.getLooper());
        this.f7003a = new ConcurrentHashMap<>();
        this.f7004b = new C1309d();
        this.f7005c = new C1308c();
    }

    /* renamed from: b */
    private static long m5446b(String str) {
        Map<String, String> mapM5469c = C1288c.m5456a().m5469c();
        String strConcat = "record_accumulation_time_".concat(String.valueOf(str));
        if (!mapM5469c.containsKey(strConcat)) {
            return 60000L;
        }
        String str2 = mapM5469c.get(strConcat);
        if (TextUtils.isEmpty(str2)) {
            return 60000L;
        }
        try {
            return Math.max(Long.parseLong(str2) * 1000, 1000L);
        } catch (Throwable th) {
            C1329d.m5573b("efs.cache", "get cache interval error", th);
            return 60000L;
        }
    }

    /* renamed from: c */
    private void m5448c(String str) {
        a aVar;
        if (this.f7003a.containsKey(str) && (aVar = this.f7003a.get(str)) != null) {
            try {
                aVar.flush();
                C1321b.m5541a(aVar);
                mo5441a(aVar.f7007b);
            } catch (Throwable th) {
                try {
                    th.printStackTrace();
                    this.f7003a.remove(str);
                    if ("wa".equalsIgnoreCase(str)) {
                        return;
                    }
                    C1339f.a.f7143a.f7141c.m5589c();
                } finally {
                    this.f7003a.remove(str);
                    if (!"wa".equalsIgnoreCase(str)) {
                        C1339f.a.f7143a.f7141c.m5589c();
                    }
                }
            }
        }
    }

    @Override // com.efs.sdk.base.p035a.p037b.InterfaceC1281e
    /* renamed from: a */
    public final void mo5440a(C1302b c1302b) {
        Message messageObtain = Message.obtain();
        messageObtain.obj = c1302b;
        messageObtain.what = 0;
        sendMessage(messageObtain);
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        int i4 = message.what;
        if (i4 != 0) {
            if (i4 != 1) {
                return;
            }
            Object obj = message.obj;
            if (obj instanceof String) {
                m5448c(obj.toString());
                return;
            }
            return;
        }
        C1302b c1302b = (C1302b) message.obj;
        for (int i5 = 0; i5 < 3; i5++) {
            try {
                a aVarM5447b = m5447b(c1302b);
                if (aVarM5447b == null) {
                    C1329d.m5572a("efs.cache", "writer is null for type " + c1302b.f7089a.f7082a, null);
                    return;
                }
                if (aVarM5447b.getChannel().position() + c1302b.f7091c.length > 819200) {
                    m5448c(c1302b.f7089a.f7082a);
                    aVarM5447b = m5447b(c1302b);
                    if (aVarM5447b == null) {
                        C1329d.m5572a("efs.cache", "writer is null for type " + c1302b.f7089a.f7082a, null);
                        return;
                    }
                }
                aVarM5447b.write(Base64.encode(c1302b.f7091c, 11));
                aVarM5447b.write("\n".getBytes());
                return;
            } catch (Throwable th) {
                C1329d.m5573b("efs.cache", "cache file error", th);
            }
        }
    }

    @Override // com.efs.sdk.base.p035a.p037b.InterfaceC1281e
    /* renamed from: a */
    public final boolean mo5443a(File file, C1302b c1302b) {
        if (!c1302b.m5516b()) {
            mo5441a(file);
            return false;
        }
        if (!file.exists()) {
            return false;
        }
        c1302b.f7092d = file;
        c1302b.m5518d();
        c1302b.m5515b(1);
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0076  */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private com.efs.sdk.base.p035a.p037b.HandlerC1283g.a m5447b(com.efs.sdk.base.p035a.p043f.C1302b r6) {
        /*
            r5 = this;
            java.util.concurrent.ConcurrentHashMap<java.lang.String, com.efs.sdk.base.a.b.g$a> r0 = r5.f7003a
            com.efs.sdk.base.a.f.a r1 = r6.f7089a
            java.lang.String r1 = r1.f7082a
            boolean r0 = r0.containsKey(r1)
            if (r0 == 0) goto L19
            java.util.concurrent.ConcurrentHashMap<java.lang.String, com.efs.sdk.base.a.b.g$a> r0 = r5.f7003a
            com.efs.sdk.base.a.f.a r6 = r6.f7089a
            java.lang.String r6 = r6.f7082a
            java.lang.Object r6 = r0.get(r6)
            com.efs.sdk.base.a.b.g$a r6 = (com.efs.sdk.base.p035a.p037b.HandlerC1283g.a) r6
            return r6
        L19:
            java.lang.String r0 = com.efs.sdk.base.p035a.p046h.C1321b.m5539a(r6)
            java.io.File r1 = new java.io.File
            com.efs.sdk.base.a.c.a r2 = com.efs.sdk.base.p035a.p040d.C1293a.m5487a()
            android.content.Context r2 = r2.f7010c
            com.efs.sdk.base.a.c.a r3 = com.efs.sdk.base.p035a.p040d.C1293a.m5487a()
            java.lang.String r3 = r3.f7008a
            java.io.File r2 = com.efs.sdk.base.p035a.p046h.C1315a.m5532e(r2, r3)
            r1.<init>(r2, r0)
            r0 = 0
            com.efs.sdk.base.a.b.g$a r2 = new com.efs.sdk.base.a.b.g$a     // Catch: java.lang.Throwable -> L64
            r2.<init>(r1)     // Catch: java.lang.Throwable -> L64
            java.util.concurrent.ConcurrentHashMap<java.lang.String, com.efs.sdk.base.a.b.g$a> r0 = r5.f7003a     // Catch: java.lang.Throwable -> L62
            com.efs.sdk.base.a.f.a r3 = r6.f7089a     // Catch: java.lang.Throwable -> L62
            java.lang.String r3 = r3.f7082a     // Catch: java.lang.Throwable -> L62
            java.lang.Object r0 = r0.putIfAbsent(r3, r2)     // Catch: java.lang.Throwable -> L62
            com.efs.sdk.base.a.b.g$a r0 = (com.efs.sdk.base.p035a.p037b.HandlerC1283g.a) r0     // Catch: java.lang.Throwable -> L62
            if (r0 == 0) goto L4d
            com.efs.sdk.base.p035a.p046h.C1321b.m5541a(r2)     // Catch: java.lang.Throwable -> L62
            com.efs.sdk.base.p035a.p046h.C1321b.m5547b(r1)     // Catch: java.lang.Throwable -> L62
            return r0
        L4d:
            android.os.Message r0 = android.os.Message.obtain()     // Catch: java.lang.Throwable -> L62
            com.efs.sdk.base.a.f.a r1 = r6.f7089a     // Catch: java.lang.Throwable -> L62
            java.lang.String r1 = r1.f7082a     // Catch: java.lang.Throwable -> L62
            r0.obj = r1     // Catch: java.lang.Throwable -> L62
            r3 = 1
            r0.what = r3     // Catch: java.lang.Throwable -> L62
            long r3 = m5446b(r1)     // Catch: java.lang.Throwable -> L62
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
            com.efs.sdk.base.a.f.a r6 = r6.f7089a
            java.lang.String r6 = r6.f7082a
            java.lang.String r0 = "wa"
            boolean r6 = r0.equalsIgnoreCase(r6)
            if (r6 != 0) goto L7f
            com.efs.sdk.base.a.i.f r6 = com.efs.sdk.base.p035a.p050i.C1339f.a.m5597a()
            com.efs.sdk.base.a.i.d r6 = r6.f7141c
            r6.m5588b()
        L7f:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.efs.sdk.base.p035a.p037b.HandlerC1283g.m5447b(com.efs.sdk.base.a.f.b):com.efs.sdk.base.a.b.g$a");
    }

    @Override // com.efs.sdk.base.p035a.p037b.InterfaceC1281e
    /* renamed from: a */
    public final void mo5442a(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        Message messageObtain = Message.obtain();
        messageObtain.obj = str;
        messageObtain.what = 1;
        sendMessage(messageObtain);
    }

    @Override // com.efs.sdk.base.p035a.p037b.InterfaceC1281e
    /* renamed from: a */
    public final void mo5441a(File file) {
        byte[] bArr;
        C1302b c1302bM5546b = C1321b.m5546b(file.getName());
        if (c1302bM5546b == null) {
            C1277a unused = C1277a.b.f6999a;
            C1277a.m5432b(file);
        } else if (m5445a(c1302bM5546b, file) && (bArr = c1302bM5546b.f7091c) != null && bArr.length > 0) {
            C1321b.m5544a(new File(C1315a.m5533f(C1293a.m5487a().f7010c, C1293a.m5487a().f7008a), C1321b.m5539a(c1302bM5546b)), c1302bM5546b.f7091c);
            C1321b.m5547b(file);
        } else {
            C1277a unused2 = C1277a.b.f6999a;
            C1277a.m5432b(file);
        }
    }

    /* renamed from: a */
    private boolean m5445a(C1302b c1302b, File file) {
        BufferedReader bufferedReader;
        StringBuilder sb = new StringBuilder();
        FileReader fileReader = null;
        try {
            FileReader fileReader2 = new FileReader(file);
            try {
                bufferedReader = new BufferedReader(fileReader2);
                try {
                    for (String line = bufferedReader.readLine(); line != null; line = bufferedReader.readLine()) {
                        String strM5570b = C1328b.m5570b(line.getBytes());
                        if (!TextUtils.isEmpty(strM5570b)) {
                            sb.append(strM5570b);
                            sb.append("\n");
                        }
                    }
                    c1302b.m5514a(sb.toString().getBytes());
                    c1302b.m5518d();
                    this.f7005c.mo5521a(c1302b);
                    this.f7004b.mo5521a(c1302b);
                    c1302b.f7092d = file;
                    C1321b.m5541a(bufferedReader);
                    C1321b.m5541a(fileReader2);
                    return true;
                } catch (Throwable th) {
                    th = th;
                    fileReader = fileReader2;
                    try {
                        C1329d.m5573b("efs.cache", "local decode error", th);
                        C1321b.m5541a(bufferedReader);
                        C1321b.m5541a(fileReader);
                        return false;
                    } catch (Throwable th2) {
                        C1321b.m5541a(bufferedReader);
                        C1321b.m5541a(fileReader);
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
