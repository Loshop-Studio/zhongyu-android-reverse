package p153l2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;
import p137k.AbstractC7846r;
import p153l2.InterfaceC8491b;

/* renamed from: l2.d */
/* loaded from: classes4.dex */
public class C8493d {

    /* renamed from: d */
    public static final Object f14070d = new Object();

    /* renamed from: b */
    public File f14072b;

    /* renamed from: a */
    public final Object f14071a = new Object();

    /* renamed from: c */
    public HashMap f14073c = new HashMap();

    /* renamed from: l2.d$a */
    public static final class a implements InterfaceC8491b {

        /* renamed from: g */
        public static final Object f14074g = new Object();

        /* renamed from: a */
        public final File f14075a;

        /* renamed from: b */
        public final File f14076b;

        /* renamed from: c */
        public final int f14077c;

        /* renamed from: d */
        public Map f14078d;

        /* renamed from: e */
        public boolean f14079e = false;

        /* renamed from: f */
        public WeakHashMap f14080f;

        public a(File file, int i10, Map map) {
            this.f14075a = file;
            this.f14076b = C8493d.m13936b(file);
            this.f14077c = i10;
            this.f14078d = map == null ? new HashMap() : map;
            this.f14080f = new WeakHashMap();
        }

        @Override // p153l2.InterfaceC8491b
        /* renamed from: a */
        public InterfaceC8491b.a mo13923a() {
            return new C10152a();
        }

        /* renamed from: d */
        public void m13947d(Map map) {
            if (map != null) {
                synchronized (this) {
                    this.f14078d = map;
                }
            }
        }

        /* renamed from: f */
        public void m13948f(boolean z9) {
            synchronized (this) {
                this.f14079e = z9;
            }
        }

        /* renamed from: g */
        public boolean m13949g() {
            boolean z9;
            synchronized (this) {
                z9 = this.f14079e;
            }
            return z9;
        }

        @Override // p153l2.InterfaceC8491b
        public long getLong(String str, long j10) {
            synchronized (this) {
                try {
                    Long l10 = (Long) this.f14078d.get(str);
                    if (l10 != null) {
                        j10 = l10.longValue();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return j10;
        }

        @Override // p153l2.InterfaceC8491b
        public String getString(String str, String str2) {
            synchronized (this) {
                String str3 = (String) this.f14078d.get(str);
                if (str3 != null) {
                    str2 = str3;
                }
            }
            return str2;
        }

        /* renamed from: h */
        public final boolean m13950h() throws IOException {
            if (this.f14075a.exists()) {
                if (this.f14076b.exists()) {
                    this.f14075a.delete();
                } else if (!this.f14075a.renameTo(this.f14076b)) {
                    return false;
                }
            }
            try {
                FileOutputStream fileOutputStreamM13946a = m13946a(this.f14075a);
                if (fileOutputStreamM13946a == null) {
                    return false;
                }
                AbstractC8494e.m13957g(this.f14078d, fileOutputStreamM13946a);
                fileOutputStreamM13946a.close();
                this.f14076b.delete();
                return true;
            } catch (Exception unused) {
                if (this.f14075a.exists()) {
                    this.f14075a.delete();
                }
                return false;
            }
        }

        /* renamed from: a */
        public final FileOutputStream m13946a(File file) {
            try {
                return new FileOutputStream(file);
            } catch (FileNotFoundException unused) {
                if (!file.getParentFile().mkdir()) {
                    return null;
                }
                try {
                    return new FileOutputStream(file);
                } catch (FileNotFoundException unused2) {
                    return null;
                }
            }
        }

        /* renamed from: l2.d$a$a, reason: collision with other inner class name */
        public final class C10152a implements InterfaceC8491b.a {

            /* renamed from: a */
            public final Map f14081a = new HashMap();

            /* renamed from: b */
            public boolean f14082b = false;

            public C10152a() {
            }

            @Override // p153l2.InterfaceC8491b.a
            /* renamed from: a */
            public InterfaceC8491b.a mo13925a(String str, String str2) {
                synchronized (this) {
                    this.f14081a.put(str, str2);
                }
                return this;
            }

            @Override // p153l2.InterfaceC8491b.a
            /* renamed from: b */
            public InterfaceC8491b.a mo13926b() {
                synchronized (this) {
                    this.f14082b = true;
                }
                return this;
            }

            @Override // p153l2.InterfaceC8491b.a
            public boolean commit() {
                boolean z9;
                ArrayList arrayList;
                HashSet hashSet;
                boolean zM13950h;
                synchronized (C8493d.f14070d) {
                    try {
                        z9 = a.this.f14080f.size() > 0;
                        if (z9) {
                            arrayList = new ArrayList();
                            hashSet = new HashSet(a.this.f14080f.keySet());
                        } else {
                            arrayList = null;
                            hashSet = null;
                        }
                        synchronized (this) {
                            try {
                                if (this.f14082b) {
                                    a.this.f14078d.clear();
                                    this.f14082b = false;
                                }
                                for (Map.Entry entry : this.f14081a.entrySet()) {
                                    String str = (String) entry.getKey();
                                    Object value = entry.getValue();
                                    if (value == this) {
                                        a.this.f14078d.remove(str);
                                    } else {
                                        a.this.f14078d.put(str, value);
                                    }
                                    if (z9) {
                                        arrayList.add(str);
                                    }
                                }
                                this.f14081a.clear();
                            } finally {
                            }
                        }
                        zM13950h = a.this.m13950h();
                        if (zM13950h) {
                            a.this.m13948f(true);
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                if (z9) {
                    for (int size = arrayList.size() - 1; size >= 0; size--) {
                        Iterator it = hashSet.iterator();
                        while (it.hasNext()) {
                            AbstractC7846r.m13306a(it.next());
                        }
                    }
                }
                return zM13950h;
            }

            @Override // p153l2.InterfaceC8491b.a
            /* renamed from: a */
            public InterfaceC8491b.a mo13924a(String str, long j10) {
                synchronized (this) {
                    this.f14081a.put(str, Long.valueOf(j10));
                }
                return this;
            }
        }
    }

    public C8493d(String str) {
        if (str == null || str.length() <= 0) {
            throw new RuntimeException("Directory can not be empty");
        }
        this.f14072b = new File(str);
    }

    /* renamed from: b */
    public static File m13936b(File file) {
        return new File(file.getPath() + ".bak");
    }

    /* renamed from: a */
    public final File m13939a() {
        File file;
        synchronized (this.f14071a) {
            file = this.f14072b;
        }
        return file;
    }

    /* renamed from: c */
    public final File m13940c(File file, String str) {
        if (str.indexOf(File.separatorChar) < 0) {
            return new File(file, str);
        }
        throw new IllegalArgumentException("File " + str + " contains a path separator");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:53:0x008f A[Catch: all -> 0x0061, TRY_ENTER, TRY_LEAVE, TryCatch #1 {all -> 0x0061, blocks: (B:33:0x005e, B:53:0x008f), top: B:80:0x0038 }] */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0096 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v17 */
    /* JADX WARN: Type inference failed for: r0v5, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public p153l2.InterfaceC8491b m13941e(java.lang.String r6, int r7) throws java.lang.Throwable {
        /*
            r5 = this;
            java.io.File r6 = r5.m13942g(r6)
            java.lang.Object r0 = p153l2.C8493d.f14070d
            monitor-enter(r0)
            java.util.HashMap r1 = r5.f14073c     // Catch: java.lang.Throwable -> L19
            java.lang.Object r1 = r1.get(r6)     // Catch: java.lang.Throwable -> L19
            l2.d$a r1 = (p153l2.C8493d.a) r1     // Catch: java.lang.Throwable -> L19
            if (r1 == 0) goto L1c
            boolean r2 = r1.m13949g()     // Catch: java.lang.Throwable -> L19
            if (r2 != 0) goto L1c
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L19
            return r1
        L19:
            r6 = move-exception
            goto Lb7
        L1c:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L19
            java.io.File r0 = m13936b(r6)
            boolean r2 = r0.exists()
            if (r2 == 0) goto L2d
            r6.delete()
            r0.renameTo(r6)
        L2d:
            boolean r0 = r6.exists()
            r2 = 0
            if (r0 == 0) goto L93
            boolean r0 = r6.canRead()
            if (r0 == 0) goto L93
            java.io.FileInputStream r0 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> L56 java.lang.Exception -> L58 org.xmlpull.v1.XmlPullParserException -> L5a
            r0.<init>(r6)     // Catch: java.lang.Throwable -> L56 java.lang.Exception -> L58 org.xmlpull.v1.XmlPullParserException -> L5a
            java.util.HashMap r2 = p153l2.AbstractC8494e.m13953c(r0)     // Catch: java.lang.Throwable -> L4b java.lang.Exception -> L4e org.xmlpull.v1.XmlPullParserException -> L52
            r0.close()     // Catch: java.lang.Throwable -> L4b java.lang.Exception -> L4e org.xmlpull.v1.XmlPullParserException -> L52
            r0.close()     // Catch: java.lang.Throwable -> L93
            goto L93
        L4b:
            r6 = move-exception
            r2 = r0
            goto L81
        L4e:
            r4 = r2
            r2 = r0
            r0 = r4
            goto L5c
        L52:
            r4 = r2
            r2 = r0
            r0 = r4
            goto L63
        L56:
            r6 = move-exception
            goto L81
        L58:
            r0 = r2
            goto L5c
        L5a:
            r0 = r2
            goto L63
        L5c:
            if (r2 == 0) goto L61
            r2.close()     // Catch: java.lang.Throwable -> L61
        L61:
            r2 = r0
            goto L93
        L63:
            java.io.FileInputStream r3 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> L7a java.lang.Exception -> L87
            r3.<init>(r6)     // Catch: java.lang.Throwable -> L7a java.lang.Exception -> L87
            int r2 = r3.available()     // Catch: java.lang.Throwable -> L75 java.lang.Exception -> L78
            byte[] r2 = new byte[r2]     // Catch: java.lang.Throwable -> L75 java.lang.Exception -> L78
            r3.read(r2)     // Catch: java.lang.Throwable -> L75 java.lang.Exception -> L78
            r3.close()     // Catch: java.lang.Throwable -> L8d
            goto L8d
        L75:
            r6 = move-exception
            r2 = r3
            goto L7b
        L78:
            r2 = r3
            goto L87
        L7a:
            r6 = move-exception
        L7b:
            if (r2 == 0) goto L80
            r2.close()     // Catch: java.lang.Throwable -> L80
        L80:
            throw r6     // Catch: java.lang.Throwable -> L56
        L81:
            if (r2 == 0) goto L86
            r2.close()     // Catch: java.lang.Throwable -> L86
        L86:
            throw r6
        L87:
            if (r2 == 0) goto L8c
            r2.close()     // Catch: java.lang.Throwable -> L8c
        L8c:
            r3 = r2
        L8d:
            if (r3 == 0) goto L61
            r3.close()     // Catch: java.lang.Throwable -> L61
            goto L61
        L93:
            java.lang.Object r3 = p153l2.C8493d.f14070d
            monitor-enter(r3)
            if (r1 == 0) goto L9e
            r1.m13947d(r2)     // Catch: java.lang.Throwable -> L9c
            goto Lb3
        L9c:
            r6 = move-exception
            goto Lb5
        L9e:
            java.util.HashMap r0 = r5.f14073c     // Catch: java.lang.Throwable -> L9c
            java.lang.Object r0 = r0.get(r6)     // Catch: java.lang.Throwable -> L9c
            r1 = r0
            l2.d$a r1 = (p153l2.C8493d.a) r1     // Catch: java.lang.Throwable -> L9c
            if (r1 != 0) goto Lb3
            l2.d$a r1 = new l2.d$a     // Catch: java.lang.Throwable -> L9c
            r1.<init>(r6, r7, r2)     // Catch: java.lang.Throwable -> L9c
            java.util.HashMap r7 = r5.f14073c     // Catch: java.lang.Throwable -> L9c
            r7.put(r6, r1)     // Catch: java.lang.Throwable -> L9c
        Lb3:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L9c
            return r1
        Lb5:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L9c
            throw r6
        Lb7:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L19
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p153l2.C8493d.m13941e(java.lang.String, int):l2.b");
    }

    /* renamed from: g */
    public final File m13942g(String str) {
        return m13940c(m13939a(), str + ".xml");
    }
}
