package androidx.work;

import android.util.Log;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import p169x0.AbstractC3445n;

/* renamed from: androidx.work.a */
/* loaded from: classes.dex */
public final class C0810a {

    /* renamed from: b */
    private static final String f4752b = AbstractC3445n.m10503f("Data");

    /* renamed from: c */
    public static final C0810a f4753c = new a().m4155a();

    /* renamed from: a */
    Map<String, Object> f4754a;

    /* renamed from: androidx.work.a$a */
    public static final class a {

        /* renamed from: a */
        private Map<String, Object> f4755a = new HashMap();

        /* renamed from: a */
        public C0810a m4155a() throws Throwable {
            C0810a c0810a = new C0810a((Map<String, ?>) this.f4755a);
            C0810a.m4149m(c0810a);
            return c0810a;
        }

        /* renamed from: b */
        public a m4156b(String str, Object obj) {
            if (obj == null) {
                this.f4755a.put(str, null);
            } else {
                Class<?> cls = obj.getClass();
                if (cls == Boolean.class || cls == Byte.class || cls == Integer.class || cls == Long.class || cls == Float.class || cls == Double.class || cls == String.class || cls == Boolean[].class || cls == Byte[].class || cls == Integer[].class || cls == Long[].class || cls == Float[].class || cls == Double[].class || cls == String[].class) {
                    this.f4755a.put(str, obj);
                } else if (cls == boolean[].class) {
                    this.f4755a.put(str, C0810a.m4142a((boolean[]) obj));
                } else if (cls == byte[].class) {
                    this.f4755a.put(str, C0810a.m4143b((byte[]) obj));
                } else if (cls == int[].class) {
                    this.f4755a.put(str, C0810a.m4146e((int[]) obj));
                } else if (cls == long[].class) {
                    this.f4755a.put(str, C0810a.m4147f((long[]) obj));
                } else if (cls == float[].class) {
                    this.f4755a.put(str, C0810a.m4145d((float[]) obj));
                } else {
                    if (cls != double[].class) {
                        throw new IllegalArgumentException(String.format("Key %s has invalid type %s", str, cls));
                    }
                    this.f4755a.put(str, C0810a.m4144c((double[]) obj));
                }
            }
            return this;
        }

        /* renamed from: c */
        public a m4157c(C0810a c0810a) {
            m4158d(c0810a.f4754a);
            return this;
        }

        /* renamed from: d */
        public a m4158d(Map<String, Object> map) {
            for (Map.Entry<String, Object> entry : map.entrySet()) {
                m4156b(entry.getKey(), entry.getValue());
            }
            return this;
        }

        /* renamed from: e */
        public a m4159e(String str, int i4) {
            this.f4755a.put(str, Integer.valueOf(i4));
            return this;
        }

        /* renamed from: f */
        public a m4160f(String str, String str2) {
            this.f4755a.put(str, str2);
            return this;
        }
    }

    C0810a() {
    }

    /* renamed from: a */
    static Boolean[] m4142a(boolean[] zArr) {
        Boolean[] boolArr = new Boolean[zArr.length];
        for (int i4 = 0; i4 < zArr.length; i4++) {
            boolArr[i4] = Boolean.valueOf(zArr[i4]);
        }
        return boolArr;
    }

    /* renamed from: b */
    static Byte[] m4143b(byte[] bArr) {
        Byte[] bArr2 = new Byte[bArr.length];
        for (int i4 = 0; i4 < bArr.length; i4++) {
            bArr2[i4] = Byte.valueOf(bArr[i4]);
        }
        return bArr2;
    }

    /* renamed from: c */
    static Double[] m4144c(double[] dArr) {
        Double[] dArr2 = new Double[dArr.length];
        for (int i4 = 0; i4 < dArr.length; i4++) {
            dArr2[i4] = Double.valueOf(dArr[i4]);
        }
        return dArr2;
    }

    /* renamed from: d */
    static Float[] m4145d(float[] fArr) {
        Float[] fArr2 = new Float[fArr.length];
        for (int i4 = 0; i4 < fArr.length; i4++) {
            fArr2[i4] = Float.valueOf(fArr[i4]);
        }
        return fArr2;
    }

    /* renamed from: e */
    static Integer[] m4146e(int[] iArr) {
        Integer[] numArr = new Integer[iArr.length];
        for (int i4 = 0; i4 < iArr.length; i4++) {
            numArr[i4] = Integer.valueOf(iArr[i4]);
        }
        return numArr;
    }

    /* renamed from: f */
    static Long[] m4147f(long[] jArr) {
        Long[] lArr = new Long[jArr.length];
        for (int i4 = 0; i4 < jArr.length; i4++) {
            lArr[i4] = Long.valueOf(jArr[i4]);
        }
        return lArr;
    }

    /* JADX WARN: Removed duplicated region for block: B:54:0x004e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x006b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:35:0x005d -> B:36:0x0062). Please report as a decompilation issue!!! */
    /* renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static androidx.work.C0810a m4148g(byte[] r7) throws java.lang.Throwable {
        /*
            java.lang.String r0 = "Error in Data#fromByteArray: "
            int r1 = r7.length
            r2 = 10240(0x2800, float:1.4349E-41)
            if (r1 > r2) goto L80
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            java.io.ByteArrayInputStream r2 = new java.io.ByteArrayInputStream
            r2.<init>(r7)
            r7 = 0
            java.io.ObjectInputStream r3 = new java.io.ObjectInputStream     // Catch: java.lang.Throwable -> L3d java.lang.ClassNotFoundException -> L41 java.io.IOException -> L43
            r3.<init>(r2)     // Catch: java.lang.Throwable -> L3d java.lang.ClassNotFoundException -> L41 java.io.IOException -> L43
            int r7 = r3.readInt()     // Catch: java.lang.ClassNotFoundException -> L39 java.io.IOException -> L3b java.lang.Throwable -> L68
        L1b:
            if (r7 <= 0) goto L2b
            java.lang.String r4 = r3.readUTF()     // Catch: java.lang.ClassNotFoundException -> L39 java.io.IOException -> L3b java.lang.Throwable -> L68
            java.lang.Object r5 = r3.readObject()     // Catch: java.lang.ClassNotFoundException -> L39 java.io.IOException -> L3b java.lang.Throwable -> L68
            r1.put(r4, r5)     // Catch: java.lang.ClassNotFoundException -> L39 java.io.IOException -> L3b java.lang.Throwable -> L68
            int r7 = r7 + (-1)
            goto L1b
        L2b:
            r3.close()     // Catch: java.io.IOException -> L2f
            goto L35
        L2f:
            r7 = move-exception
            java.lang.String r3 = androidx.work.C0810a.f4752b
            android.util.Log.e(r3, r0, r7)
        L35:
            r2.close()     // Catch: java.io.IOException -> L5c
            goto L62
        L39:
            r7 = move-exception
            goto L47
        L3b:
            r7 = move-exception
            goto L47
        L3d:
            r1 = move-exception
            r3 = r7
            r7 = r1
            goto L69
        L41:
            r3 = move-exception
            goto L44
        L43:
            r3 = move-exception
        L44:
            r6 = r3
            r3 = r7
            r7 = r6
        L47:
            java.lang.String r4 = androidx.work.C0810a.f4752b     // Catch: java.lang.Throwable -> L68
            android.util.Log.e(r4, r0, r7)     // Catch: java.lang.Throwable -> L68
            if (r3 == 0) goto L58
            r3.close()     // Catch: java.io.IOException -> L52
            goto L58
        L52:
            r7 = move-exception
            java.lang.String r3 = androidx.work.C0810a.f4752b
            android.util.Log.e(r3, r0, r7)
        L58:
            r2.close()     // Catch: java.io.IOException -> L5c
            goto L62
        L5c:
            r7 = move-exception
            java.lang.String r2 = androidx.work.C0810a.f4752b
            android.util.Log.e(r2, r0, r7)
        L62:
            androidx.work.a r7 = new androidx.work.a
            r7.<init>(r1)
            return r7
        L68:
            r7 = move-exception
        L69:
            if (r3 == 0) goto L75
            r3.close()     // Catch: java.io.IOException -> L6f
            goto L75
        L6f:
            r1 = move-exception
            java.lang.String r3 = androidx.work.C0810a.f4752b
            android.util.Log.e(r3, r0, r1)
        L75:
            r2.close()     // Catch: java.io.IOException -> L79
            goto L7f
        L79:
            r1 = move-exception
            java.lang.String r2 = androidx.work.C0810a.f4752b
            android.util.Log.e(r2, r0, r1)
        L7f:
            throw r7
        L80:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "Data cannot occupy more than 10240 bytes when serialized"
            r7.<init>(r0)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.work.C0810a.m4148g(byte[]):androidx.work.a");
    }

    /* renamed from: m */
    public static byte[] m4149m(C0810a c0810a) throws Throwable {
        ObjectOutputStream objectOutputStream;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ObjectOutputStream objectOutputStream2 = null;
        try {
            try {
                objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
            } catch (Throwable th) {
                th = th;
            }
        } catch (IOException e4) {
            e = e4;
        }
        try {
            objectOutputStream.writeInt(c0810a.m4153k());
            for (Map.Entry<String, Object> entry : c0810a.f4754a.entrySet()) {
                objectOutputStream.writeUTF(entry.getKey());
                objectOutputStream.writeObject(entry.getValue());
            }
            try {
                objectOutputStream.close();
            } catch (IOException e5) {
                Log.e(f4752b, "Error in Data#toByteArray: ", e5);
            }
            try {
                byteArrayOutputStream.close();
            } catch (IOException e6) {
                Log.e(f4752b, "Error in Data#toByteArray: ", e6);
            }
            if (byteArrayOutputStream.size() <= 10240) {
                return byteArrayOutputStream.toByteArray();
            }
            throw new IllegalStateException("Data cannot occupy more than 10240 bytes when serialized");
        } catch (IOException e7) {
            e = e7;
            objectOutputStream2 = objectOutputStream;
            Log.e(f4752b, "Error in Data#toByteArray: ", e);
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            if (objectOutputStream2 != null) {
                try {
                    objectOutputStream2.close();
                } catch (IOException e8) {
                    Log.e(f4752b, "Error in Data#toByteArray: ", e8);
                }
            }
            try {
                byteArrayOutputStream.close();
            } catch (IOException e9) {
                Log.e(f4752b, "Error in Data#toByteArray: ", e9);
            }
            return byteArray;
        } catch (Throwable th2) {
            th = th2;
            objectOutputStream2 = objectOutputStream;
            if (objectOutputStream2 != null) {
                try {
                    objectOutputStream2.close();
                } catch (IOException e10) {
                    Log.e(f4752b, "Error in Data#toByteArray: ", e10);
                }
            }
            try {
                byteArrayOutputStream.close();
                throw th;
            } catch (IOException e11) {
                Log.e(f4752b, "Error in Data#toByteArray: ", e11);
                throw th;
            }
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0810a.class != obj.getClass()) {
            return false;
        }
        C0810a c0810a = (C0810a) obj;
        Set<String> setKeySet = this.f4754a.keySet();
        if (!setKeySet.equals(c0810a.f4754a.keySet())) {
            return false;
        }
        for (String str : setKeySet) {
            Object obj2 = this.f4754a.get(str);
            Object obj3 = c0810a.f4754a.get(str);
            if (!((obj2 == null || obj3 == null) ? obj2 == obj3 : ((obj2 instanceof Object[]) && (obj3 instanceof Object[])) ? Arrays.deepEquals((Object[]) obj2, (Object[]) obj3) : obj2.equals(obj3))) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: h */
    public int m4150h(String str, int i4) {
        Object obj = this.f4754a.get(str);
        return obj instanceof Integer ? ((Integer) obj).intValue() : i4;
    }

    public int hashCode() {
        return this.f4754a.hashCode() * 31;
    }

    /* renamed from: i */
    public Map<String, Object> m4151i() {
        return Collections.unmodifiableMap(this.f4754a);
    }

    /* renamed from: j */
    public String m4152j(String str) {
        Object obj = this.f4754a.get(str);
        if (obj instanceof String) {
            return (String) obj;
        }
        return null;
    }

    /* renamed from: k */
    public int m4153k() {
        return this.f4754a.size();
    }

    /* renamed from: l */
    public byte[] m4154l() {
        return m4149m(this);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Data {");
        if (!this.f4754a.isEmpty()) {
            for (String str : this.f4754a.keySet()) {
                sb.append(str);
                sb.append(" : ");
                Object obj = this.f4754a.get(str);
                if (obj instanceof Object[]) {
                    sb.append(Arrays.toString((Object[]) obj));
                } else {
                    sb.append(obj);
                }
                sb.append(", ");
            }
        }
        sb.append("}");
        return sb.toString();
    }

    public C0810a(C0810a c0810a) {
        this.f4754a = new HashMap(c0810a.f4754a);
    }

    C0810a(Map<String, ?> map) {
        this.f4754a = new HashMap(map);
    }
}
