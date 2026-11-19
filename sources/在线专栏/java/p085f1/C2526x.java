package p085f1;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Iterator;
import p169x0.C3435d;
import p169x0.C3453v;
import p169x0.EnumC3432a;
import p169x0.EnumC3446o;

/* renamed from: f1.x */
/* loaded from: classes.dex */
public class C2526x {

    /* renamed from: f1.x$a */
    static /* synthetic */ class a {

        /* renamed from: a */
        static final /* synthetic */ int[] f10216a;

        /* renamed from: b */
        static final /* synthetic */ int[] f10217b;

        /* renamed from: c */
        static final /* synthetic */ int[] f10218c;

        static {
            int[] iArr = new int[EnumC3446o.values().length];
            f10218c = iArr;
            try {
                iArr[EnumC3446o.NOT_REQUIRED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f10218c[EnumC3446o.CONNECTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f10218c[EnumC3446o.UNMETERED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f10218c[EnumC3446o.NOT_ROAMING.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f10218c[EnumC3446o.METERED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            int[] iArr2 = new int[EnumC3432a.values().length];
            f10217b = iArr2;
            try {
                iArr2[EnumC3432a.EXPONENTIAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f10217b[EnumC3432a.LINEAR.ordinal()] = 2;
            } catch (NoSuchFieldError unused7) {
            }
            int[] iArr3 = new int[C3453v.a.values().length];
            f10216a = iArr3;
            try {
                iArr3[C3453v.a.ENQUEUED.ordinal()] = 1;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f10216a[C3453v.a.RUNNING.ordinal()] = 2;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f10216a[C3453v.a.SUCCEEDED.ordinal()] = 3;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f10216a[C3453v.a.FAILED.ordinal()] = 4;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f10216a[C3453v.a.BLOCKED.ordinal()] = 5;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f10216a[C3453v.a.CANCELLED.ordinal()] = 6;
            } catch (NoSuchFieldError unused13) {
            }
        }
    }

    /* renamed from: a */
    public static int m8485a(EnumC3432a enumC3432a) {
        int i4 = a.f10217b[enumC3432a.ordinal()];
        if (i4 == 1) {
            return 0;
        }
        if (i4 == 2) {
            return 1;
        }
        throw new IllegalArgumentException("Could not convert " + enumC3432a + " to int");
    }

    /* JADX WARN: Removed duplicated region for block: B:57:0x005a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static p169x0.C3435d m8486b(byte[] r6) throws java.lang.Throwable {
        /*
            x0.d r0 = new x0.d
            r0.<init>()
            if (r6 != 0) goto L8
            return r0
        L8:
            java.io.ByteArrayInputStream r1 = new java.io.ByteArrayInputStream
            r1.<init>(r6)
            r6 = 0
            java.io.ObjectInputStream r2 = new java.io.ObjectInputStream     // Catch: java.lang.Throwable -> L39 java.io.IOException -> L3d
            r2.<init>(r1)     // Catch: java.lang.Throwable -> L39 java.io.IOException -> L3d
            int r6 = r2.readInt()     // Catch: java.io.IOException -> L37 java.lang.Throwable -> L57
        L17:
            if (r6 <= 0) goto L2b
            java.lang.String r3 = r2.readUTF()     // Catch: java.io.IOException -> L37 java.lang.Throwable -> L57
            android.net.Uri r3 = android.net.Uri.parse(r3)     // Catch: java.io.IOException -> L37 java.lang.Throwable -> L57
            boolean r4 = r2.readBoolean()     // Catch: java.io.IOException -> L37 java.lang.Throwable -> L57
            r0.m10488a(r3, r4)     // Catch: java.io.IOException -> L37 java.lang.Throwable -> L57
            int r6 = r6 + (-1)
            goto L17
        L2b:
            r2.close()     // Catch: java.io.IOException -> L2f
            goto L33
        L2f:
            r6 = move-exception
            r6.printStackTrace()
        L33:
            r1.close()     // Catch: java.io.IOException -> L52
            goto L56
        L37:
            r6 = move-exception
            goto L41
        L39:
            r0 = move-exception
            r2 = r6
            r6 = r0
            goto L58
        L3d:
            r2 = move-exception
            r5 = r2
            r2 = r6
            r6 = r5
        L41:
            r6.printStackTrace()     // Catch: java.lang.Throwable -> L57
            if (r2 == 0) goto L4e
            r2.close()     // Catch: java.io.IOException -> L4a
            goto L4e
        L4a:
            r6 = move-exception
            r6.printStackTrace()
        L4e:
            r1.close()     // Catch: java.io.IOException -> L52
            goto L56
        L52:
            r6 = move-exception
            r6.printStackTrace()
        L56:
            return r0
        L57:
            r6 = move-exception
        L58:
            if (r2 == 0) goto L62
            r2.close()     // Catch: java.io.IOException -> L5e
            goto L62
        L5e:
            r0 = move-exception
            r0.printStackTrace()
        L62:
            r1.close()     // Catch: java.io.IOException -> L66
            goto L6a
        L66:
            r0 = move-exception
            r0.printStackTrace()
        L6a:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p085f1.C2526x.m8486b(byte[]):x0.d");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x0067 -> B:35:0x006a). Please report as a decompilation issue!!! */
    /* renamed from: c */
    public static byte[] m8487c(C3435d c3435d) throws Throwable {
        ObjectOutputStream objectOutputStream;
        boolean zHasNext;
        ObjectOutputStream objectOutputStream2 = null;
        ObjectOutputStream objectOutputStream3 = null;
        objectOutputStream2 = null;
        if (c3435d.m10490c() == 0) {
            return null;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            try {
                try {
                    objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
                } catch (Throwable th) {
                    th = th;
                }
            } catch (IOException e4) {
                e = e4;
            }
        } catch (IOException e5) {
            e5.printStackTrace();
            objectOutputStream2 = objectOutputStream2;
        }
        try {
            objectOutputStream.writeInt(c3435d.m10490c());
            Iterator<C3435d.a> it = c3435d.m10489b().iterator();
            while (true) {
                zHasNext = it.hasNext();
                if (zHasNext != 0) {
                    C3435d.a next = it.next();
                    objectOutputStream.writeUTF(next.m10491a().toString());
                    objectOutputStream.writeBoolean(next.m10492b());
                } else {
                    try {
                        break;
                    } catch (IOException e6) {
                        e6.printStackTrace();
                    }
                }
            }
            objectOutputStream.close();
            byteArrayOutputStream.close();
            objectOutputStream2 = zHasNext;
        } catch (IOException e7) {
            e = e7;
            objectOutputStream3 = objectOutputStream;
            e.printStackTrace();
            if (objectOutputStream3 != null) {
                try {
                    objectOutputStream3.close();
                } catch (IOException e8) {
                    e8.printStackTrace();
                }
            }
            byteArrayOutputStream.close();
            objectOutputStream2 = objectOutputStream3;
            return byteArrayOutputStream.toByteArray();
        } catch (Throwable th2) {
            th = th2;
            objectOutputStream2 = objectOutputStream;
            if (objectOutputStream2 != null) {
                try {
                    objectOutputStream2.close();
                } catch (IOException e9) {
                    e9.printStackTrace();
                }
            }
            try {
                byteArrayOutputStream.close();
                throw th;
            } catch (IOException e10) {
                e10.printStackTrace();
                throw th;
            }
        }
        return byteArrayOutputStream.toByteArray();
    }

    /* renamed from: d */
    public static EnumC3432a m8488d(int i4) {
        if (i4 == 0) {
            return EnumC3432a.EXPONENTIAL;
        }
        if (i4 == 1) {
            return EnumC3432a.LINEAR;
        }
        throw new IllegalArgumentException("Could not convert " + i4 + " to BackoffPolicy");
    }

    /* renamed from: e */
    public static EnumC3446o m8489e(int i4) {
        if (i4 == 0) {
            return EnumC3446o.NOT_REQUIRED;
        }
        if (i4 == 1) {
            return EnumC3446o.CONNECTED;
        }
        if (i4 == 2) {
            return EnumC3446o.UNMETERED;
        }
        if (i4 == 3) {
            return EnumC3446o.NOT_ROAMING;
        }
        if (i4 == 4) {
            return EnumC3446o.METERED;
        }
        throw new IllegalArgumentException("Could not convert " + i4 + " to NetworkType");
    }

    /* renamed from: f */
    public static C3453v.a m8490f(int i4) {
        if (i4 == 0) {
            return C3453v.a.ENQUEUED;
        }
        if (i4 == 1) {
            return C3453v.a.RUNNING;
        }
        if (i4 == 2) {
            return C3453v.a.SUCCEEDED;
        }
        if (i4 == 3) {
            return C3453v.a.FAILED;
        }
        if (i4 == 4) {
            return C3453v.a.BLOCKED;
        }
        if (i4 == 5) {
            return C3453v.a.CANCELLED;
        }
        throw new IllegalArgumentException("Could not convert " + i4 + " to State");
    }

    /* renamed from: g */
    public static int m8491g(EnumC3446o enumC3446o) {
        int i4 = a.f10218c[enumC3446o.ordinal()];
        if (i4 == 1) {
            return 0;
        }
        if (i4 == 2) {
            return 1;
        }
        if (i4 == 3) {
            return 2;
        }
        if (i4 == 4) {
            return 3;
        }
        if (i4 == 5) {
            return 4;
        }
        throw new IllegalArgumentException("Could not convert " + enumC3446o + " to int");
    }

    /* renamed from: h */
    public static int m8492h(C3453v.a aVar) {
        switch (a.f10216a[aVar.ordinal()]) {
            case 1:
                return 0;
            case 2:
                return 1;
            case 3:
                return 2;
            case 4:
                return 3;
            case 5:
                return 4;
            case 6:
                return 5;
            default:
                throw new IllegalArgumentException("Could not convert " + aVar + " to int");
        }
    }
}
