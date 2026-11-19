package com.tencent.bugly.proguard;

import java.io.UnsupportedEncodingException;
import java.lang.reflect.Array;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.tencent.bugly.proguard.k */
/* loaded from: classes3.dex */
public final class C5837k {

    /* renamed from: a */
    protected String f4346a = "GBK";

    /* renamed from: b */
    private ByteBuffer f4347b;

    /* renamed from: com.tencent.bugly.proguard.k$a */
    public static class a {

        /* renamed from: a */
        public byte f4348a;

        /* renamed from: b */
        public int f4349b;
    }

    public C5837k() {
    }

    /* renamed from: b */
    private boolean m4187b(int i6) {
        int i7;
        try {
            a aVar = new a();
            while (true) {
                int iM4178a = m4178a(aVar, this.f4347b.duplicate());
                i7 = aVar.f4349b;
                if (i6 <= i7 || aVar.f4348a == 11) {
                    break;
                }
                m4183a(iM4178a);
                m4182a(aVar.f4348a);
            }
        } catch (C5834h | BufferUnderflowException unused) {
        }
        return i6 == i7;
    }

    /* renamed from: d */
    private boolean[] m4189d(int i6, boolean z6) {
        if (!m4187b(i6)) {
            if (z6) {
                throw new C5834h("require field not exist.");
            }
            return null;
        }
        a aVar = new a();
        m4184a(aVar);
        if (aVar.f4348a != 9) {
            throw new C5834h("type mismatch.");
        }
        int iM4196a = m4196a(0, 0, true);
        if (iM4196a < 0) {
            throw new C5834h("size invalid: ".concat(String.valueOf(iM4196a)));
        }
        boolean[] zArr = new boolean[iM4196a];
        for (int i7 = 0; i7 < iM4196a; i7++) {
            zArr[i7] = m4204a(0, true);
        }
        return zArr;
    }

    /* renamed from: e */
    private short[] m4190e(int i6, boolean z6) {
        if (!m4187b(i6)) {
            if (z6) {
                throw new C5834h("require field not exist.");
            }
            return null;
        }
        a aVar = new a();
        m4184a(aVar);
        if (aVar.f4348a != 9) {
            throw new C5834h("type mismatch.");
        }
        int iM4196a = m4196a(0, 0, true);
        if (iM4196a < 0) {
            throw new C5834h("size invalid: ".concat(String.valueOf(iM4196a)));
        }
        short[] sArr = new short[iM4196a];
        for (int i7 = 0; i7 < iM4196a; i7++) {
            sArr[i7] = m4202a(sArr[0], 0, true);
        }
        return sArr;
    }

    /* renamed from: f */
    private int[] m4191f(int i6, boolean z6) {
        if (!m4187b(i6)) {
            if (z6) {
                throw new C5834h("require field not exist.");
            }
            return null;
        }
        a aVar = new a();
        m4184a(aVar);
        if (aVar.f4348a != 9) {
            throw new C5834h("type mismatch.");
        }
        int iM4196a = m4196a(0, 0, true);
        if (iM4196a < 0) {
            throw new C5834h("size invalid: ".concat(String.valueOf(iM4196a)));
        }
        int[] iArr = new int[iM4196a];
        for (int i7 = 0; i7 < iM4196a; i7++) {
            iArr[i7] = m4196a(iArr[0], 0, true);
        }
        return iArr;
    }

    /* renamed from: g */
    private long[] m4192g(int i6, boolean z6) {
        if (!m4187b(i6)) {
            if (z6) {
                throw new C5834h("require field not exist.");
            }
            return null;
        }
        a aVar = new a();
        m4184a(aVar);
        if (aVar.f4348a != 9) {
            throw new C5834h("type mismatch.");
        }
        int iM4196a = m4196a(0, 0, true);
        if (iM4196a < 0) {
            throw new C5834h("size invalid: ".concat(String.valueOf(iM4196a)));
        }
        long[] jArr = new long[iM4196a];
        for (int i7 = 0; i7 < iM4196a; i7++) {
            jArr[i7] = m4198a(jArr[0], 0, true);
        }
        return jArr;
    }

    /* renamed from: h */
    private float[] m4193h(int i6, boolean z6) {
        if (!m4187b(i6)) {
            if (z6) {
                throw new C5834h("require field not exist.");
            }
            return null;
        }
        a aVar = new a();
        m4184a(aVar);
        if (aVar.f4348a != 9) {
            throw new C5834h("type mismatch.");
        }
        int iM4196a = m4196a(0, 0, true);
        if (iM4196a < 0) {
            throw new C5834h("size invalid: ".concat(String.valueOf(iM4196a)));
        }
        float[] fArr = new float[iM4196a];
        for (int i7 = 0; i7 < iM4196a; i7++) {
            fArr[i7] = m4177a(fArr[0], 0, true);
        }
        return fArr;
    }

    /* renamed from: i */
    private double[] m4194i(int i6, boolean z6) {
        if (!m4187b(i6)) {
            if (z6) {
                throw new C5834h("require field not exist.");
            }
            return null;
        }
        a aVar = new a();
        m4184a(aVar);
        if (aVar.f4348a != 9) {
            throw new C5834h("type mismatch.");
        }
        int iM4196a = m4196a(0, 0, true);
        if (iM4196a < 0) {
            throw new C5834h("size invalid: ".concat(String.valueOf(iM4196a)));
        }
        double[] dArr = new double[iM4196a];
        for (int i7 = 0; i7 < iM4196a; i7++) {
            dArr[i7] = m4176a(dArr[0], 0, true);
        }
        return dArr;
    }

    /* renamed from: a */
    public final void m4203a(byte[] bArr) {
        ByteBuffer byteBuffer = this.f4347b;
        if (byteBuffer != null) {
            byteBuffer.clear();
        }
        this.f4347b = ByteBuffer.wrap(bArr);
    }

    /* renamed from: c */
    public final byte[] m4206c(int i6, boolean z6) {
        if (!m4187b(i6)) {
            if (z6) {
                throw new C5834h("require field not exist.");
            }
            return null;
        }
        a aVar = new a();
        m4184a(aVar);
        byte b7 = aVar.f4348a;
        if (b7 == 9) {
            int iM4196a = m4196a(0, 0, true);
            if (iM4196a < 0) {
                throw new C5834h("size invalid: ".concat(String.valueOf(iM4196a)));
            }
            byte[] bArr = new byte[iM4196a];
            for (int i7 = 0; i7 < iM4196a; i7++) {
                bArr[i7] = m4195a(bArr[0], 0, true);
            }
            return bArr;
        }
        if (b7 != 13) {
            throw new C5834h("type mismatch.");
        }
        a aVar2 = new a();
        m4184a(aVar2);
        if (aVar2.f4348a != 0) {
            throw new C5834h("type mismatch, tag: " + i6 + ", type: " + ((int) aVar.f4348a) + ", " + ((int) aVar2.f4348a));
        }
        int iM4196a2 = m4196a(0, 0, true);
        if (iM4196a2 >= 0) {
            byte[] bArr2 = new byte[iM4196a2];
            this.f4347b.get(bArr2);
            return bArr2;
        }
        throw new C5834h("invalid size, tag: " + i6 + ", type: " + ((int) aVar.f4348a) + ", " + ((int) aVar2.f4348a) + ", size: " + iM4196a2);
    }

    public C5837k(byte[] bArr) {
        this.f4347b = ByteBuffer.wrap(bArr);
    }

    /* renamed from: a */
    private static int m4178a(a aVar, ByteBuffer byteBuffer) {
        byte b7 = byteBuffer.get();
        aVar.f4348a = (byte) (b7 & 15);
        int i6 = (b7 & 240) >> 4;
        aVar.f4349b = i6;
        if (i6 != 15) {
            return 1;
        }
        aVar.f4349b = byteBuffer.get();
        return 2;
    }

    public C5837k(byte[] bArr, byte b7) {
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr);
        this.f4347b = byteBufferWrap;
        byteBufferWrap.position(4);
    }

    /* renamed from: b */
    private void m4186b() {
        a aVar = new a();
        m4184a(aVar);
        m4182a(aVar.f4348a);
    }

    /* renamed from: a */
    private void m4184a(a aVar) {
        m4178a(aVar, this.f4347b);
    }

    /* renamed from: a */
    private void m4183a(int i6) {
        ByteBuffer byteBuffer = this.f4347b;
        byteBuffer.position(byteBuffer.position() + i6);
    }

    /* renamed from: b */
    public final String m4205b(int i6, boolean z6) {
        if (!m4187b(i6)) {
            if (z6) {
                throw new C5834h("require field not exist.");
            }
            return null;
        }
        a aVar = new a();
        m4184a(aVar);
        byte b7 = aVar.f4348a;
        if (b7 == 6) {
            int i7 = this.f4347b.get();
            if (i7 < 0) {
                i7 += 256;
            }
            byte[] bArr = new byte[i7];
            this.f4347b.get(bArr);
            try {
                return new String(bArr, this.f4346a);
            } catch (UnsupportedEncodingException unused) {
                return new String(bArr);
            }
        }
        if (b7 == 7) {
            int i8 = this.f4347b.getInt();
            if (i8 <= 104857600 && i8 >= 0) {
                byte[] bArr2 = new byte[i8];
                this.f4347b.get(bArr2);
                try {
                    return new String(bArr2, this.f4346a);
                } catch (UnsupportedEncodingException unused2) {
                    return new String(bArr2);
                }
            }
            throw new C5834h("String too long: ".concat(String.valueOf(i8)));
        }
        throw new C5834h("type mismatch.");
    }

    /* renamed from: a */
    private void m4181a() {
        a aVar = new a();
        do {
            m4184a(aVar);
            m4182a(aVar.f4348a);
        } while (aVar.f4348a != 11);
    }

    /* renamed from: a */
    private void m4182a(byte b7) {
        int i6 = 0;
        switch (b7) {
            case 0:
                m4183a(1);
                return;
            case 1:
                m4183a(2);
                return;
            case 2:
                m4183a(4);
                return;
            case 3:
                m4183a(8);
                return;
            case 4:
                m4183a(4);
                return;
            case 5:
                m4183a(8);
                return;
            case 6:
                int i7 = this.f4347b.get();
                if (i7 < 0) {
                    i7 += 256;
                }
                m4183a(i7);
                return;
            case 7:
                m4183a(this.f4347b.getInt());
                return;
            case 8:
                int iM4196a = m4196a(0, 0, true);
                while (i6 < iM4196a * 2) {
                    m4186b();
                    i6++;
                }
                return;
            case 9:
                int iM4196a2 = m4196a(0, 0, true);
                while (i6 < iM4196a2) {
                    m4186b();
                    i6++;
                }
                return;
            case 10:
                m4181a();
                return;
            case 11:
            case 12:
                return;
            case 13:
                a aVar = new a();
                m4184a(aVar);
                if (aVar.f4348a == 0) {
                    m4183a(m4196a(0, 0, true));
                    return;
                }
                throw new C5834h("skipField with invalid type, type value: " + ((int) b7) + ", " + ((int) aVar.f4348a));
            default:
                throw new C5834h("invalid type.");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: b */
    private <T> T[] m4188b(T t6, int i6, boolean z6) {
        if (!m4187b(i6)) {
            if (z6) {
                throw new C5834h("require field not exist.");
            }
            return null;
        }
        a aVar = new a();
        m4184a(aVar);
        if (aVar.f4348a == 9) {
            int iM4196a = m4196a(0, 0, true);
            if (iM4196a >= 0) {
                T[] tArr = (T[]) ((Object[]) Array.newInstance(t6.getClass(), iM4196a));
                for (int i7 = 0; i7 < iM4196a; i7++) {
                    tArr[i7] = m4200a((C5837k) t6, 0, true);
                }
                return tArr;
            }
            throw new C5834h("size invalid: ".concat(String.valueOf(iM4196a)));
        }
        throw new C5834h("type mismatch.");
    }

    /* renamed from: a */
    public final boolean m4204a(int i6, boolean z6) {
        return m4195a((byte) 0, i6, z6) != 0;
    }

    /* renamed from: a */
    public final byte m4195a(byte b7, int i6, boolean z6) {
        if (!m4187b(i6)) {
            if (z6) {
                throw new C5834h("require field not exist.");
            }
            return b7;
        }
        a aVar = new a();
        m4184a(aVar);
        byte b8 = aVar.f4348a;
        if (b8 == 0) {
            return this.f4347b.get();
        }
        if (b8 == 12) {
            return (byte) 0;
        }
        throw new C5834h("type mismatch.");
    }

    /* renamed from: a */
    public final short m4202a(short s6, int i6, boolean z6) {
        if (!m4187b(i6)) {
            if (z6) {
                throw new C5834h("require field not exist.");
            }
            return s6;
        }
        a aVar = new a();
        m4184a(aVar);
        byte b7 = aVar.f4348a;
        if (b7 == 0) {
            return this.f4347b.get();
        }
        if (b7 == 1) {
            return this.f4347b.getShort();
        }
        if (b7 == 12) {
            return (short) 0;
        }
        throw new C5834h("type mismatch.");
    }

    /* renamed from: a */
    public final int m4196a(int i6, int i7, boolean z6) {
        if (!m4187b(i7)) {
            if (z6) {
                throw new C5834h("require field not exist.");
            }
            return i6;
        }
        a aVar = new a();
        m4184a(aVar);
        byte b7 = aVar.f4348a;
        if (b7 == 0) {
            return this.f4347b.get();
        }
        if (b7 == 1) {
            return this.f4347b.getShort();
        }
        if (b7 == 2) {
            return this.f4347b.getInt();
        }
        if (b7 == 12) {
            return 0;
        }
        throw new C5834h("type mismatch.");
    }

    /* renamed from: a */
    public final long m4198a(long j6, int i6, boolean z6) {
        if (!m4187b(i6)) {
            if (z6) {
                throw new C5834h("require field not exist.");
            }
            return j6;
        }
        a aVar = new a();
        m4184a(aVar);
        byte b7 = aVar.f4348a;
        if (b7 == 0) {
            return this.f4347b.get();
        }
        if (b7 == 1) {
            return this.f4347b.getShort();
        }
        if (b7 == 2) {
            return this.f4347b.getInt();
        }
        if (b7 == 3) {
            return this.f4347b.getLong();
        }
        if (b7 == 12) {
            return 0L;
        }
        throw new C5834h("type mismatch.");
    }

    /* renamed from: a */
    private float m4177a(float f6, int i6, boolean z6) {
        if (!m4187b(i6)) {
            if (z6) {
                throw new C5834h("require field not exist.");
            }
            return f6;
        }
        a aVar = new a();
        m4184a(aVar);
        byte b7 = aVar.f4348a;
        if (b7 == 4) {
            return this.f4347b.getFloat();
        }
        if (b7 == 12) {
            return 0.0f;
        }
        throw new C5834h("type mismatch.");
    }

    /* renamed from: a */
    private double m4176a(double d6, int i6, boolean z6) {
        if (!m4187b(i6)) {
            if (z6) {
                throw new C5834h("require field not exist.");
            }
            return d6;
        }
        a aVar = new a();
        m4184a(aVar);
        byte b7 = aVar.f4348a;
        if (b7 == 4) {
            return this.f4347b.getFloat();
        }
        if (b7 == 5) {
            return this.f4347b.getDouble();
        }
        if (b7 == 12) {
            return 0.0d;
        }
        throw new C5834h("type mismatch.");
    }

    /* renamed from: a */
    public final <K, V> HashMap<K, V> m4201a(Map<K, V> map, int i6, boolean z6) {
        return (HashMap) m4180a(new HashMap(), map, i6, z6);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    private <K, V> Map<K, V> m4180a(Map<K, V> map, Map<K, V> map2, int i6, boolean z6) {
        if (map2 != null && !map2.isEmpty()) {
            Map.Entry<K, V> next = map2.entrySet().iterator().next();
            K key = next.getKey();
            V value = next.getValue();
            if (m4187b(i6)) {
                a aVar = new a();
                m4184a(aVar);
                if (aVar.f4348a == 8) {
                    int iM4196a = m4196a(0, 0, true);
                    if (iM4196a < 0) {
                        throw new C5834h("size invalid: ".concat(String.valueOf(iM4196a)));
                    }
                    for (int i7 = 0; i7 < iM4196a; i7++) {
                        map.put(m4200a((C5837k) key, 0, true), m4200a((C5837k) value, 1, true));
                    }
                } else {
                    throw new C5834h("type mismatch.");
                }
            } else if (z6) {
                throw new C5834h("require field not exist.");
            }
            return map;
        }
        return new HashMap();
    }

    /* renamed from: a */
    private <T> T[] m4185a(T[] tArr, int i6, boolean z6) {
        if (tArr != null && tArr.length != 0) {
            return (T[]) m4188b(tArr[0], i6, z6);
        }
        throw new C5834h("unable to get type of key and value.");
    }

    /* renamed from: a */
    private <T> List<T> m4179a(List<T> list, int i6, boolean z6) {
        if (list != null && !list.isEmpty()) {
            Object[] objArrM4188b = m4188b(list.get(0), i6, z6);
            if (objArrM4188b == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            for (Object obj : objArrM4188b) {
                arrayList.add(obj);
            }
            return arrayList;
        }
        return new ArrayList();
    }

    /* renamed from: a */
    public final AbstractC5839m m4199a(AbstractC5839m abstractC5839m, int i6, boolean z6) {
        if (!m4187b(i6)) {
            if (z6) {
                throw new C5834h("require field not exist.");
            }
            return null;
        }
        try {
            AbstractC5839m abstractC5839m2 = (AbstractC5839m) abstractC5839m.getClass().newInstance();
            a aVar = new a();
            m4184a(aVar);
            if (aVar.f4348a == 10) {
                abstractC5839m2.mo4140a(this);
                m4181a();
                return abstractC5839m2;
            }
            throw new C5834h("type mismatch.");
        } catch (Exception e6) {
            throw new C5834h(e6.getMessage());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    public final <T> Object m4200a(T t6, int i6, boolean z6) {
        if (t6 instanceof Byte) {
            return Byte.valueOf(m4195a((byte) 0, i6, z6));
        }
        if (t6 instanceof Boolean) {
            return Boolean.valueOf(m4204a(i6, z6));
        }
        if (t6 instanceof Short) {
            return Short.valueOf(m4202a((short) 0, i6, z6));
        }
        if (t6 instanceof Integer) {
            return Integer.valueOf(m4196a(0, i6, z6));
        }
        if (t6 instanceof Long) {
            return Long.valueOf(m4198a(0L, i6, z6));
        }
        if (t6 instanceof Float) {
            return Float.valueOf(m4177a(0.0f, i6, z6));
        }
        if (t6 instanceof Double) {
            return Double.valueOf(m4176a(0.0d, i6, z6));
        }
        if (t6 instanceof String) {
            return String.valueOf(m4205b(i6, z6));
        }
        if (t6 instanceof Map) {
            return m4201a((Map) t6, i6, z6);
        }
        if (t6 instanceof List) {
            return m4179a((List) t6, i6, z6);
        }
        if (t6 instanceof AbstractC5839m) {
            return m4199a((AbstractC5839m) t6, i6, z6);
        }
        if (t6.getClass().isArray()) {
            if (!(t6 instanceof byte[]) && !(t6 instanceof Byte[])) {
                if (t6 instanceof boolean[]) {
                    return m4189d(i6, z6);
                }
                if (t6 instanceof short[]) {
                    return m4190e(i6, z6);
                }
                if (t6 instanceof int[]) {
                    return m4191f(i6, z6);
                }
                if (t6 instanceof long[]) {
                    return m4192g(i6, z6);
                }
                if (t6 instanceof float[]) {
                    return m4193h(i6, z6);
                }
                if (t6 instanceof double[]) {
                    return m4194i(i6, z6);
                }
                return m4185a((Object[]) t6, i6, z6);
            }
            return m4206c(i6, z6);
        }
        throw new C5834h("read object error: unsupport type.");
    }

    /* renamed from: a */
    public final int m4197a(String str) {
        this.f4346a = str;
        return 0;
    }
}
