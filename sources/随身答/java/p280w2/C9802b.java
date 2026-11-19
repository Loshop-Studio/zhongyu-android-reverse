package p280w2;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import com.umeng.analytics.pro.C6757b;
import com.umeng.commonsdk.statistics.proto.C6793d;
import com.umeng.commonsdk.statistics.proto.C6794e;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.TreeMap;
import p176m2.AbstractC8959h;
import p210p2.AbstractC9318a;
import p260u2.AbstractC9666a;
import p270v2.AbstractC9753a;
import p270v2.AbstractC9755c;
import p270v2.AbstractC9758f;
import p290x2.InterfaceC9868c;
import p290x2.InterfaceC9869d;
import p290x2.InterfaceC9873h;
import p310z2.C9991b;
import p310z2.InterfaceC9990a;

/* renamed from: w2.b */
/* loaded from: classes4.dex */
public class C9802b implements InterfaceC9990a {

    /* renamed from: i */
    public static Context f17450i;

    /* renamed from: j */
    public static C9991b f17451j;

    /* renamed from: a */
    public InterfaceC9873h f17454a;

    /* renamed from: b */
    public a f17455b = new a();

    /* renamed from: c */
    public C6793d f17456c = null;

    /* renamed from: d */
    public static Object f17445d = new Object();

    /* renamed from: e */
    public static final byte[] f17446e = "pbl0".getBytes();

    /* renamed from: f */
    public static Map f17447f = new HashMap();

    /* renamed from: g */
    public static Object f17448g = new Object();

    /* renamed from: h */
    public static C9802b f17449h = null;

    /* renamed from: k */
    public static Map f17452k = new HashMap();

    /* renamed from: l */
    public static Object f17453l = new Object();

    /* renamed from: w2.b$a */
    public static class a {

        /* renamed from: a */
        public Map f17457a = new HashMap();

        /* renamed from: a */
        public synchronized String m16638a(String str, String str2) {
            if (!TextUtils.isEmpty(str) && this.f17457a.size() > 0) {
                String str3 = (String) this.f17457a.get(str);
                return !TextUtils.isEmpty(str3) ? str3 : str2;
            }
            return str2;
        }

        /* renamed from: b */
        public void m16639b(C6793d c6793d) {
            if (c6793d == null) {
                return;
            }
            m16641d(c6793d);
        }

        /* renamed from: c */
        public synchronized void m16640c(String str) {
            Map map = this.f17457a;
            if (map != null && map.size() > 0 && !TextUtils.isEmpty(str) && this.f17457a.containsKey(str)) {
                this.f17457a.remove(str);
            }
        }

        /* renamed from: d */
        public final synchronized void m16641d(C6793d c6793d) {
            C6794e c6794e;
            if (c6793d != null) {
                if (c6793d.m6400x()) {
                    Map mapM6398v = c6793d.m6398v();
                    for (String str : mapM6398v.keySet()) {
                        if (!TextUtils.isEmpty(str) && (c6794e = (C6794e) mapM6398v.get(str)) != null) {
                            String strM6415n = c6794e.m6415n();
                            if (!TextUtils.isEmpty(strM6415n)) {
                                this.f17457a.put(str, strM6415n);
                                if (AbstractC9666a.f17071c) {
                                    Log.i("ImprintHandler", "imKey is " + str + ", imValue is " + strM6415n);
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    public C9802b(Context context) {
        f17450i = context.getApplicationContext();
    }

    /* renamed from: h */
    public static void m16617h(String str, InterfaceC9868c interfaceC9868c) {
        synchronized (f17448g) {
            try {
                int i9 = 0;
                if (f17447f.containsKey(str)) {
                    ArrayList arrayList = (ArrayList) f17447f.get(str);
                    int size = arrayList.size();
                    AbstractC9758f.m16432g("--->>> addCallback: before add: callbacks size is: " + size);
                    while (i9 < size) {
                        if (interfaceC9868c == arrayList.get(i9)) {
                            AbstractC9758f.m16432g("--->>> addCallback: callback has exist, just exit");
                            return;
                        }
                        i9++;
                    }
                    arrayList.add(interfaceC9868c);
                    AbstractC9758f.m16432g("--->>> addCallback: after add: callbacks size is: " + arrayList.size());
                } else {
                    ArrayList arrayList2 = new ArrayList();
                    int size2 = arrayList2.size();
                    AbstractC9758f.m16432g("--->>> addCallback: before add: callbacks size is: " + size2);
                    while (i9 < size2) {
                        if (interfaceC9868c == arrayList2.get(i9)) {
                            AbstractC9758f.m16432g("--->>> addCallback: callback has exist, just exit");
                            return;
                        }
                        i9++;
                    }
                    arrayList2.add(interfaceC9868c);
                    AbstractC9758f.m16432g("--->>> addCallback: after add: callbacks size is: " + arrayList2.size());
                    f17447f.put(str, arrayList2);
                }
            } catch (Throwable th) {
                AbstractC9318a.m15200b(f17450i, th);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x009e A[Catch: all -> 0x00a0, DONT_GENERATE, TryCatch #0 {, blocks: (B:25:0x009e, B:24:0x0099, B:8:0x000d, B:10:0x0015, B:12:0x0023, B:14:0x003e, B:16:0x0044, B:19:0x005e, B:20:0x0061, B:22:0x007f), top: B:31:0x000d, inners: #1 }] */
    /* renamed from: n */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void m16618n(java.lang.String r5, p290x2.InterfaceC9868c r6) {
        /*
            boolean r0 = android.text.TextUtils.isEmpty(r5)
            if (r0 != 0) goto La3
            if (r6 != 0) goto La
            goto La3
        La:
            java.lang.Object r0 = p280w2.C9802b.f17448g
            monitor-enter(r0)
            java.util.Map r1 = p280w2.C9802b.f17447f     // Catch: java.lang.Throwable -> L5c
            boolean r1 = r1.containsKey(r5)     // Catch: java.lang.Throwable -> L5c
            if (r1 == 0) goto L9e
            java.util.Map r1 = p280w2.C9802b.f17447f     // Catch: java.lang.Throwable -> L5c
            java.lang.Object r1 = r1.get(r5)     // Catch: java.lang.Throwable -> L5c
            java.util.ArrayList r1 = (java.util.ArrayList) r1     // Catch: java.lang.Throwable -> L5c
            int r2 = r1.size()     // Catch: java.lang.Throwable -> L5c
            if (r2 <= 0) goto L9e
            int r2 = r1.size()     // Catch: java.lang.Throwable -> L5c
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L5c
            r3.<init>()     // Catch: java.lang.Throwable -> L5c
            java.lang.String r4 = "--->>> removeCallback: before remove: callbacks size is: "
            r3.append(r4)     // Catch: java.lang.Throwable -> L5c
            r3.append(r2)     // Catch: java.lang.Throwable -> L5c
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Throwable -> L5c
            p270v2.AbstractC9758f.m16432g(r3)     // Catch: java.lang.Throwable -> L5c
            r3 = 0
        L3c:
            if (r3 >= r2) goto L61
            java.lang.Object r4 = r1.get(r3)     // Catch: java.lang.Throwable -> L5c
            if (r6 != r4) goto L5e
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L5c
            r6.<init>()     // Catch: java.lang.Throwable -> L5c
            java.lang.String r2 = "--->>> removeCallback: remove index "
            r6.append(r2)     // Catch: java.lang.Throwable -> L5c
            r6.append(r3)     // Catch: java.lang.Throwable -> L5c
            java.lang.String r6 = r6.toString()     // Catch: java.lang.Throwable -> L5c
            p270v2.AbstractC9758f.m16432g(r6)     // Catch: java.lang.Throwable -> L5c
            r1.remove(r3)     // Catch: java.lang.Throwable -> L5c
            goto L61
        L5c:
            r5 = move-exception
            goto L99
        L5e:
            int r3 = r3 + 1
            goto L3c
        L61:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L5c
            r6.<init>()     // Catch: java.lang.Throwable -> L5c
            java.lang.String r2 = "--->>> removeCallback: after remove: callbacks size is: "
            r6.append(r2)     // Catch: java.lang.Throwable -> L5c
            int r2 = r1.size()     // Catch: java.lang.Throwable -> L5c
            r6.append(r2)     // Catch: java.lang.Throwable -> L5c
            java.lang.String r6 = r6.toString()     // Catch: java.lang.Throwable -> L5c
            p270v2.AbstractC9758f.m16432g(r6)     // Catch: java.lang.Throwable -> L5c
            int r6 = r1.size()     // Catch: java.lang.Throwable -> L5c
            if (r6 != 0) goto L9e
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L5c
            r6.<init>()     // Catch: java.lang.Throwable -> L5c
            java.lang.String r1 = "--->>> removeCallback: remove key from map: key = "
            r6.append(r1)     // Catch: java.lang.Throwable -> L5c
            r6.append(r5)     // Catch: java.lang.Throwable -> L5c
            java.lang.String r6 = r6.toString()     // Catch: java.lang.Throwable -> L5c
            p270v2.AbstractC9758f.m16432g(r6)     // Catch: java.lang.Throwable -> L5c
            java.util.Map r6 = p280w2.C9802b.f17447f     // Catch: java.lang.Throwable -> L5c
            r6.remove(r5)     // Catch: java.lang.Throwable -> L5c
            goto L9e
        L99:
            android.content.Context r6 = p280w2.C9802b.f17450i     // Catch: java.lang.Throwable -> La0
            p210p2.AbstractC9318a.m15200b(r6, r5)     // Catch: java.lang.Throwable -> La0
        L9e:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> La0
            goto La3
        La0:
            r5 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> La0
            throw r5
        La3:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p280w2.C9802b.m16618n(java.lang.String, x2.c):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x003c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* renamed from: t */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void m16619t() {
        /*
            r5 = this;
            java.io.File r0 = new java.io.File
            android.content.Context r1 = p280w2.C9802b.f17450i
            java.io.File r1 = r1.getFilesDir()
            java.lang.String r2 = ".imprint"
            r0.<init>(r1, r2)
            java.lang.Object r1 = p280w2.C9802b.f17445d
            monitor-enter(r1)
            boolean r0 = r0.exists()     // Catch: java.lang.Throwable -> L18
            if (r0 != 0) goto L1a
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L18
            return
        L18:
            r0 = move-exception
            goto L63
        L1a:
            r0 = 0
            android.content.Context r2 = p280w2.C9802b.f17450i     // Catch: java.lang.Throwable -> L2f java.lang.Exception -> L34
            java.lang.String r3 = ".imprint"
            java.io.FileInputStream r2 = r2.openFileInput(r3)     // Catch: java.lang.Throwable -> L2f java.lang.Exception -> L34
            byte[] r0 = p270v2.AbstractC9755c.m16396e(r2)     // Catch: java.lang.Throwable -> L2b java.lang.Exception -> L2d
        L27:
            p270v2.AbstractC9755c.m16397f(r2)     // Catch: java.lang.Throwable -> L18
            goto L3a
        L2b:
            r0 = move-exception
            goto L5f
        L2d:
            r3 = move-exception
            goto L36
        L2f:
            r2 = move-exception
            r4 = r2
            r2 = r0
            r0 = r4
            goto L5f
        L34:
            r3 = move-exception
            r2 = r0
        L36:
            r3.printStackTrace()     // Catch: java.lang.Throwable -> L2b
            goto L27
        L3a:
            if (r0 == 0) goto L5d
            com.umeng.commonsdk.statistics.proto.d r2 = new com.umeng.commonsdk.statistics.proto.d     // Catch: java.lang.Throwable -> L18 java.lang.Exception -> L59
            r2.<init>()     // Catch: java.lang.Throwable -> L18 java.lang.Exception -> L59
            com.umeng.analytics.pro.a r3 = new com.umeng.analytics.pro.a     // Catch: java.lang.Throwable -> L18 java.lang.Exception -> L59
            r3.<init>()     // Catch: java.lang.Throwable -> L18 java.lang.Exception -> L59
            r3.m6018a(r2, r0)     // Catch: java.lang.Throwable -> L18 java.lang.Exception -> L59
            r5.f17456c = r2     // Catch: java.lang.Throwable -> L18 java.lang.Exception -> L59
            w2.b$a r0 = r5.f17455b     // Catch: java.lang.Throwable -> L18 java.lang.Exception -> L59
            r0.m16639b(r2)     // Catch: java.lang.Throwable -> L18 java.lang.Exception -> L59
            com.umeng.commonsdk.statistics.proto.d r0 = r5.f17456c     // Catch: java.lang.Throwable -> L18 java.lang.Exception -> L59
            com.umeng.commonsdk.statistics.proto.d r0 = r5.m16632q(r0)     // Catch: java.lang.Throwable -> L18 java.lang.Exception -> L59
            r5.f17456c = r0     // Catch: java.lang.Throwable -> L18 java.lang.Exception -> L59
            goto L5d
        L59:
            r0 = move-exception
            r0.printStackTrace()     // Catch: java.lang.Throwable -> L18
        L5d:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L18
            return
        L5f:
            p270v2.AbstractC9755c.m16397f(r2)     // Catch: java.lang.Throwable -> L18
            throw r0     // Catch: java.lang.Throwable -> L18
        L63:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L18
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p280w2.C9802b.m16619t():void");
    }

    /* renamed from: u */
    public static synchronized C9802b m16620u(Context context) {
        try {
            if (f17449h == null) {
                f17449h = new C9802b(context);
                f17451j = new C9991b();
                f17451j.m17311b(new File(f17450i.getFilesDir(), ".imprint"), f17449h, 0);
            }
        } catch (Throwable th) {
            throw th;
        }
        return f17449h;
    }

    @Override // p310z2.InterfaceC9990a
    /* renamed from: a */
    public boolean mo6244a(String str) {
        return false;
    }

    /* renamed from: b */
    public final C6793d m16621b(C6793d c6793d, C6793d c6793d2, Map map) {
        InterfaceC9869d interfaceC9869d;
        ArrayList arrayList;
        if (c6793d2 == null) {
            return c6793d;
        }
        Map mapM6398v = c6793d.m6398v();
        for (Map.Entry entry : c6793d2.m6398v().entrySet()) {
            int i9 = 0;
            if (((C6794e) entry.getValue()).m6418u()) {
                String str = (String) entry.getKey();
                String str2 = ((C6794e) entry.getValue()).f6963a;
                synchronized (f17453l) {
                    try {
                        if (!TextUtils.isEmpty(str) && f17452k.containsKey(str) && (interfaceC9869d = (InterfaceC9869d) f17452k.get(str)) != null && interfaceC9869d.mo12452d(str, str2)) {
                            i9 = 1;
                        }
                    } finally {
                    }
                }
                if (i9 == 0) {
                    mapM6398v.put(entry.getKey(), entry.getValue());
                    synchronized (f17448g) {
                        try {
                            if (!TextUtils.isEmpty(str) && f17447f.containsKey(str) && ((ArrayList) f17447f.get(str)) != null) {
                                map.put(str, str2);
                            }
                        } finally {
                        }
                    }
                } else {
                    AbstractC8959h.m14293c("MobclickRT", "--->>> merge: [" + str + "] should be ignored.");
                }
            } else {
                String str3 = (String) entry.getKey();
                synchronized (f17448g) {
                    try {
                        if (!TextUtils.isEmpty(str3) && f17447f.containsKey(str3) && (arrayList = (ArrayList) f17447f.get(str3)) != null) {
                            while (i9 < arrayList.size()) {
                                ((InterfaceC9868c) arrayList.get(i9)).mo12451b(str3, null);
                                i9++;
                            }
                        }
                    } finally {
                    }
                }
                mapM6398v.remove(str3);
                this.f17455b.m16640c(str3);
            }
        }
        c6793d.m6393g(c6793d2.m6401y());
        c6793d.m6394n(m16622d(c6793d));
        return c6793d;
    }

    @Override // p310z2.InterfaceC9990a
    /* renamed from: c */
    public boolean mo6245c(String str, Object obj) {
        return false;
    }

    /* renamed from: d */
    public String m16622d(C6793d c6793d) {
        StringBuilder sb = new StringBuilder();
        for (Map.Entry entry : new TreeMap(c6793d.m6398v()).entrySet()) {
            sb.append((String) entry.getKey());
            if (((C6794e) entry.getValue()).m6418u()) {
                sb.append(((C6794e) entry.getValue()).m6415n());
            }
            sb.append(((C6794e) entry.getValue()).m6419v());
            sb.append(((C6794e) entry.getValue()).m6421x());
        }
        sb.append(c6793d.f6947b);
        return AbstractC9755c.m16392a(sb.toString()).toLowerCase(Locale.US);
    }

    @Override // p310z2.InterfaceC9990a
    /* renamed from: e */
    public boolean mo6246e(File file, int i9) {
        if (i9 == 0) {
            f17449h.m16619t();
        } else if (i9 == 1) {
            f17449h.m16623f(file);
        }
        return true;
    }

    /* renamed from: f */
    public final void m16623f(File file) {
        if (this.f17456c == null) {
            return;
        }
        try {
            synchronized (f17445d) {
                try {
                    byte[] bArrM6068a = new C6757b().m6068a(this.f17456c);
                    FileOutputStream fileOutputStream = new FileOutputStream(file);
                    try {
                        fileOutputStream.write(bArrM6068a);
                        fileOutputStream.flush();
                    } finally {
                        AbstractC9755c.m16398g(fileOutputStream);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    /* renamed from: g */
    public void m16624g(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        synchronized (f17453l) {
            try {
                if (f17452k.containsKey(str)) {
                    AbstractC8959h.m14293c("MobclickRT", "--->>> unregistPreProcessCallback: unregist [" + str + "] success.");
                    f17447f.remove(str);
                } else {
                    AbstractC8959h.m14293c("MobclickRT", "--->>> unregistPreProcessCallback: can't find [" + str + "], pls regist first.");
                }
            } finally {
            }
        }
    }

    /* renamed from: i */
    public void m16625i(InterfaceC9873h interfaceC9873h) {
        this.f17454a = interfaceC9873h;
    }

    /* renamed from: j */
    public final boolean m16626j(String str, String str2) {
        return str == null ? str2 == null : str.equals(str2);
    }

    /* renamed from: k */
    public byte[] m16627k() {
        try {
            synchronized (this) {
                try {
                    C6793d c6793d = this.f17456c;
                    if (c6793d == null) {
                        return null;
                    }
                    if (c6793d.m6396t() <= 0) {
                        return null;
                    }
                    return new C6757b().m6068a(this.f17456c);
                } catch (Throwable th) {
                    throw th;
                }
            }
        } catch (Throwable th2) {
            AbstractC9318a.m15200b(f17450i, th2);
            return null;
        }
    }

    /* renamed from: l */
    public byte[] m16628l(C6794e c6794e) {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(8);
        byteBufferAllocate.order(null);
        byteBufferAllocate.putLong(c6794e.m6419v());
        byte[] bArrArray = byteBufferAllocate.array();
        byte[] bArr = f17446e;
        byte[] bArr2 = new byte[4];
        for (int i9 = 0; i9 < 4; i9++) {
            bArr2[i9] = (byte) (bArrArray[i9] ^ bArr[i9]);
        }
        return bArr2;
    }

    /* renamed from: m */
    public void m16629m(C6793d c6793d) {
        boolean zM16626j;
        if (c6793d == null) {
            if (AbstractC9666a.f17071c) {
                AbstractC8959h.m14291a("MobclickRT", "Imprint is null");
                return;
            }
            return;
        }
        if (!m16631p(c6793d)) {
            if (AbstractC9666a.f17071c) {
                AbstractC8959h.m14292b("MobclickRT", "Imprint is not valid");
                return;
            }
            return;
        }
        boolean z9 = AbstractC9666a.f17069a;
        HashMap map = new HashMap();
        synchronized (this) {
            try {
                C6793d c6793d2 = this.f17456c;
                C6793d c6793dM16632q = m16632q(c6793d);
                String strM6391A = null;
                String strM6391A2 = c6793d2 == null ? null : c6793d2.m6391A();
                C6793d c6793dM16634s = c6793d2 == null ? m16634s(c6793dM16632q) : m16621b(c6793d2, c6793dM16632q, map);
                this.f17456c = c6793dM16634s;
                if (c6793dM16634s != null) {
                    strM6391A = c6793dM16634s.m6391A();
                }
                zM16626j = m16626j(strM6391A2, strM6391A);
            } finally {
            }
        }
        C6793d c6793d3 = this.f17456c;
        if (c6793d3 != null && !zM16626j) {
            this.f17455b.m16639b(c6793d3);
            InterfaceC9873h interfaceC9873h = this.f17454a;
            if (interfaceC9873h != null) {
                interfaceC9873h.mo16130a(this.f17455b);
            }
        }
        if (map.size() > 0) {
            synchronized (f17448g) {
                try {
                    for (Map.Entry entry : map.entrySet()) {
                        String str = (String) entry.getKey();
                        String str2 = (String) entry.getValue();
                        if (!TextUtils.isEmpty(str) && f17447f.containsKey(str)) {
                            AbstractC9758f.m16432g("--->>> target imprint key is: " + str + "; value is: " + str2);
                            ArrayList arrayList = (ArrayList) f17447f.get(str);
                            if (arrayList != null) {
                                for (int i9 = 0; i9 < arrayList.size(); i9++) {
                                    ((InterfaceC9868c) arrayList.get(i9)).mo12451b(str, str2);
                                }
                            }
                        }
                    }
                } finally {
                }
            }
        }
    }

    /* renamed from: o */
    public a m16630o() {
        return this.f17455b;
    }

    /* renamed from: p */
    public final boolean m16631p(C6793d c6793d) {
        if (!c6793d.m6391A().equals(m16622d(c6793d))) {
            return false;
        }
        for (C6794e c6794e : c6793d.m6398v().values()) {
            byte[] bArrM16344j = AbstractC9753a.m16344j(c6794e.m6421x());
            byte[] bArrM16628l = m16628l(c6794e);
            for (int i9 = 0; i9 < 4; i9++) {
                if (bArrM16344j[i9] != bArrM16628l[i9]) {
                    return false;
                }
            }
        }
        return true;
    }

    /* renamed from: q */
    public final C6793d m16632q(C6793d c6793d) {
        Map mapM6398v = c6793d.m6398v();
        if (mapM6398v.containsKey("umtt")) {
            mapM6398v.remove("umtt");
            this.f17455b.m16640c("umtt");
            c6793d.m6393g(c6793d.m6401y());
            c6793d.m6394n(m16622d(c6793d));
        }
        return c6793d;
    }

    /* renamed from: r */
    public void m16633r() throws IOException {
        if (this.f17456c == null || f17451j == null) {
            return;
        }
        File file = new File(f17450i.getFilesDir(), ".imprint");
        if (!file.exists()) {
            try {
                try {
                    file.createNewFile();
                } catch (IOException e10) {
                    AbstractC9318a.m15200b(f17450i, e10);
                }
            } catch (IOException unused) {
                file.createNewFile();
            }
        }
        f17451j.m17311b(file, f17449h, 1);
    }

    /* renamed from: s */
    public final C6793d m16634s(C6793d c6793d) {
        ArrayList arrayList;
        boolean z9;
        ArrayList arrayList2;
        InterfaceC9869d interfaceC9869d;
        Map mapM6398v = c6793d.m6398v();
        ArrayList arrayList3 = new ArrayList(mapM6398v.size() / 2);
        Iterator it = mapM6398v.entrySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Map.Entry entry = (Map.Entry) it.next();
            if (((C6794e) entry.getValue()).m6418u()) {
                String str = (String) entry.getKey();
                String str2 = ((C6794e) entry.getValue()).f6963a;
                synchronized (f17453l) {
                    try {
                        z9 = !TextUtils.isEmpty(str) && f17452k.containsKey(str) && (interfaceC9869d = (InterfaceC9869d) f17452k.get(str)) != null && interfaceC9869d.mo12452d(str, str2);
                    } finally {
                    }
                }
                if (z9) {
                    arrayList3.add(str);
                }
                synchronized (f17448g) {
                    try {
                        if (!TextUtils.isEmpty(str) && f17447f.containsKey(str) && (arrayList2 = (ArrayList) f17447f.get(str)) != null) {
                            for (int i9 = 0; i9 < arrayList2.size(); i9++) {
                                ((InterfaceC9868c) arrayList2.get(i9)).mo12451b(str, str2);
                            }
                        }
                    } finally {
                    }
                }
            } else {
                arrayList3.add(entry.getKey());
            }
        }
        int size = arrayList3.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList3.get(i10);
            i10++;
            String str3 = (String) obj;
            synchronized (f17448g) {
                try {
                    if (!TextUtils.isEmpty(str3) && f17447f.containsKey(str3) && (arrayList = (ArrayList) f17447f.get(str3)) != null) {
                        for (int i11 = 0; i11 < arrayList.size(); i11++) {
                            ((InterfaceC9868c) arrayList.get(i11)).mo12451b(str3, null);
                        }
                    }
                } finally {
                }
            }
            mapM6398v.remove(str3);
        }
        return c6793d;
    }

    /* renamed from: v */
    public void m16635v(String str, InterfaceC9868c interfaceC9868c) {
        if (TextUtils.isEmpty(str) || interfaceC9868c == null) {
            return;
        }
        m16617h(str, interfaceC9868c);
    }

    /* renamed from: w */
    public void m16636w(String str, InterfaceC9869d interfaceC9869d) {
        if (TextUtils.isEmpty(str) || interfaceC9869d == null) {
            return;
        }
        synchronized (f17453l) {
            try {
                if (f17452k.containsKey(str)) {
                    AbstractC8959h.m14293c("MobclickRT", "--->>> key : " + str + " PreProcesser has registed!");
                } else {
                    f17452k.put(str, interfaceC9869d);
                    AbstractC8959h.m14293c("MobclickRT", "--->>> registPreProcessCallback: key : " + str + " regist success.");
                }
            } finally {
            }
        }
    }

    /* renamed from: x */
    public void m16637x(String str, InterfaceC9868c interfaceC9868c) {
        if (TextUtils.isEmpty(str) || interfaceC9868c == null) {
            return;
        }
        m16618n(str, interfaceC9868c);
    }
}
