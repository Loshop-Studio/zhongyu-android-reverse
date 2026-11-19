package com.tencent.bugly.proguard;

import androidx.camera.video.AudioStats;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.Array;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.tencent.bugly.proguard.k */
/* loaded from: classes4.dex */
public final class C6482k {

    /* renamed from: a */
    protected String f4968a = "GBK";

    /* renamed from: b */
    private ByteBuffer f4969b;

    /* renamed from: com.tencent.bugly.proguard.k$a */
    public static class a {

        /* renamed from: a */
        public byte f4970a;

        /* renamed from: b */
        public int f4971b;
    }

    public C6482k() {
    }

    /* renamed from: b */
    private boolean m4542b(int i10) {
        int i11;
        try {
            a aVar = new a();
            while (true) {
                int iM4533a = m4533a(aVar, this.f4969b.duplicate());
                i11 = aVar.f4971b;
                if (i10 <= i11 || aVar.f4970a == 11) {
                    break;
                }
                m4538a(iM4533a);
                m4537a(aVar.f4970a);
            }
        } catch (C6479h | BufferUnderflowException unused) {
        }
        return i10 == i11;
    }

    /* renamed from: d */
    private boolean[] m4544d(int i10, boolean z10) {
        if (!m4542b(i10)) {
            if (z10) {
                throw new C6479h("require field not exist.");
            }
            return null;
        }
        a aVar = new a();
        m4539a(aVar);
        if (aVar.f4970a != 9) {
            throw new C6479h("type mismatch.");
        }
        int iM4551a = m4551a(0, 0, true);
        if (iM4551a < 0) {
            throw new C6479h("size invalid: ".concat(String.valueOf(iM4551a)));
        }
        boolean[] zArr = new boolean[iM4551a];
        for (int i11 = 0; i11 < iM4551a; i11++) {
            zArr[i11] = m4559a(0, true);
        }
        return zArr;
    }

    /* renamed from: e */
    private short[] m4545e(int i10, boolean z10) {
        if (!m4542b(i10)) {
            if (z10) {
                throw new C6479h("require field not exist.");
            }
            return null;
        }
        a aVar = new a();
        m4539a(aVar);
        if (aVar.f4970a != 9) {
            throw new C6479h("type mismatch.");
        }
        int iM4551a = m4551a(0, 0, true);
        if (iM4551a < 0) {
            throw new C6479h("size invalid: ".concat(String.valueOf(iM4551a)));
        }
        short[] sArr = new short[iM4551a];
        for (int i11 = 0; i11 < iM4551a; i11++) {
            sArr[i11] = m4557a(sArr[0], 0, true);
        }
        return sArr;
    }

    /* renamed from: f */
    private int[] m4546f(int i10, boolean z10) {
        if (!m4542b(i10)) {
            if (z10) {
                throw new C6479h("require field not exist.");
            }
            return null;
        }
        a aVar = new a();
        m4539a(aVar);
        if (aVar.f4970a != 9) {
            throw new C6479h("type mismatch.");
        }
        int iM4551a = m4551a(0, 0, true);
        if (iM4551a < 0) {
            throw new C6479h("size invalid: ".concat(String.valueOf(iM4551a)));
        }
        int[] iArr = new int[iM4551a];
        for (int i11 = 0; i11 < iM4551a; i11++) {
            iArr[i11] = m4551a(iArr[0], 0, true);
        }
        return iArr;
    }

    /* renamed from: g */
    private long[] m4547g(int i10, boolean z10) {
        if (!m4542b(i10)) {
            if (z10) {
                throw new C6479h("require field not exist.");
            }
            return null;
        }
        a aVar = new a();
        m4539a(aVar);
        if (aVar.f4970a != 9) {
            throw new C6479h("type mismatch.");
        }
        int iM4551a = m4551a(0, 0, true);
        if (iM4551a < 0) {
            throw new C6479h("size invalid: ".concat(String.valueOf(iM4551a)));
        }
        long[] jArr = new long[iM4551a];
        for (int i11 = 0; i11 < iM4551a; i11++) {
            jArr[i11] = m4553a(jArr[0], 0, true);
        }
        return jArr;
    }

    /* renamed from: h */
    private float[] m4548h(int i10, boolean z10) {
        if (!m4542b(i10)) {
            if (z10) {
                throw new C6479h("require field not exist.");
            }
            return null;
        }
        a aVar = new a();
        m4539a(aVar);
        if (aVar.f4970a != 9) {
            throw new C6479h("type mismatch.");
        }
        int iM4551a = m4551a(0, 0, true);
        if (iM4551a < 0) {
            throw new C6479h("size invalid: ".concat(String.valueOf(iM4551a)));
        }
        float[] fArr = new float[iM4551a];
        for (int i11 = 0; i11 < iM4551a; i11++) {
            fArr[i11] = m4532a(fArr[0], 0, true);
        }
        return fArr;
    }

    /* renamed from: i */
    private double[] m4549i(int i10, boolean z10) {
        if (!m4542b(i10)) {
            if (z10) {
                throw new C6479h("require field not exist.");
            }
            return null;
        }
        a aVar = new a();
        m4539a(aVar);
        if (aVar.f4970a != 9) {
            throw new C6479h("type mismatch.");
        }
        int iM4551a = m4551a(0, 0, true);
        if (iM4551a < 0) {
            throw new C6479h("size invalid: ".concat(String.valueOf(iM4551a)));
        }
        double[] dArr = new double[iM4551a];
        for (int i11 = 0; i11 < iM4551a; i11++) {
            dArr[i11] = m4531a(dArr[0], 0, true);
        }
        return dArr;
    }

    /* renamed from: a */
    public final void m4558a(byte[] bArr) {
        ByteBuffer byteBuffer = this.f4969b;
        if (byteBuffer != null) {
            byteBuffer.clear();
        }
        this.f4969b = ByteBuffer.wrap(bArr);
    }

    /* renamed from: c */
    public final byte[] m4561c(int i10, boolean z10) {
        if (!m4542b(i10)) {
            if (z10) {
                throw new C6479h("require field not exist.");
            }
            return null;
        }
        a aVar = new a();
        m4539a(aVar);
        byte b10 = aVar.f4970a;
        if (b10 == 9) {
            int iM4551a = m4551a(0, 0, true);
            if (iM4551a < 0) {
                throw new C6479h("size invalid: ".concat(String.valueOf(iM4551a)));
            }
            byte[] bArr = new byte[iM4551a];
            for (int i11 = 0; i11 < iM4551a; i11++) {
                bArr[i11] = m4550a(bArr[0], 0, true);
            }
            return bArr;
        }
        if (b10 != 13) {
            throw new C6479h("type mismatch.");
        }
        a aVar2 = new a();
        m4539a(aVar2);
        if (aVar2.f4970a != 0) {
            throw new C6479h("type mismatch, tag: " + i10 + ", type: " + ((int) aVar.f4970a) + ", " + ((int) aVar2.f4970a));
        }
        int iM4551a2 = m4551a(0, 0, true);
        if (iM4551a2 >= 0) {
            byte[] bArr2 = new byte[iM4551a2];
            this.f4969b.get(bArr2);
            return bArr2;
        }
        throw new C6479h("invalid size, tag: " + i10 + ", type: " + ((int) aVar.f4970a) + ", " + ((int) aVar2.f4970a) + ", size: " + iM4551a2);
    }

    public C6482k(byte[] bArr) {
        this.f4969b = ByteBuffer.wrap(bArr);
    }

    /* renamed from: a */
    private static int m4533a(a aVar, ByteBuffer byteBuffer) {
        byte b10 = byteBuffer.get();
        aVar.f4970a = (byte) (b10 & 15);
        int i10 = (b10 & 240) >> 4;
        aVar.f4971b = i10;
        if (i10 != 15) {
            return 1;
        }
        aVar.f4971b = byteBuffer.get();
        return 2;
    }

    public C6482k(byte[] bArr, byte b10) {
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr);
        this.f4969b = byteBufferWrap;
        byteBufferWrap.position(4);
    }

    /* renamed from: b */
    private void m4541b() {
        a aVar = new a();
        m4539a(aVar);
        m4537a(aVar.f4970a);
    }

    /* renamed from: a */
    private void m4539a(a aVar) {
        m4533a(aVar, this.f4969b);
    }

    /* renamed from: a */
    private void m4538a(int i10) {
        ByteBuffer byteBuffer = this.f4969b;
        byteBuffer.position(byteBuffer.position() + i10);
    }

    /* renamed from: b */
    public final String m4560b(int i10, boolean z10) {
        if (!m4542b(i10)) {
            if (z10) {
                throw new C6479h("require field not exist.");
            }
            return null;
        }
        a aVar = new a();
        m4539a(aVar);
        byte b10 = aVar.f4970a;
        if (b10 == 6) {
            int i11 = this.f4969b.get();
            if (i11 < 0) {
                i11 += 256;
            }
            byte[] bArr = new byte[i11];
            this.f4969b.get(bArr);
            try {
                return new String(bArr, this.f4968a);
            } catch (UnsupportedEncodingException unused) {
                return new String(bArr);
            }
        }
        if (b10 == 7) {
            int i12 = this.f4969b.getInt();
            if (i12 <= 104857600 && i12 >= 0) {
                byte[] bArr2 = new byte[i12];
                this.f4969b.get(bArr2);
                try {
                    return new String(bArr2, this.f4968a);
                } catch (UnsupportedEncodingException unused2) {
                    return new String(bArr2);
                }
            }
            throw new C6479h("String too long: ".concat(String.valueOf(i12)));
        }
        throw new C6479h("type mismatch.");
    }

    /* renamed from: a */
    private void m4536a() {
        a aVar = new a();
        do {
            m4539a(aVar);
            m4537a(aVar.f4970a);
        } while (aVar.f4970a != 11);
    }

    /* renamed from: a */
    private void m4537a(byte b10) {
        int i10 = 0;
        switch (b10) {
            case 0:
                m4538a(1);
                return;
            case 1:
                m4538a(2);
                return;
            case 2:
                m4538a(4);
                return;
            case 3:
                m4538a(8);
                return;
            case 4:
                m4538a(4);
                return;
            case 5:
                m4538a(8);
                return;
            case 6:
                int i11 = this.f4969b.get();
                if (i11 < 0) {
                    i11 += 256;
                }
                m4538a(i11);
                return;
            case 7:
                m4538a(this.f4969b.getInt());
                return;
            case 8:
                int iM4551a = m4551a(0, 0, true);
                while (i10 < iM4551a * 2) {
                    m4541b();
                    i10++;
                }
                return;
            case 9:
                int iM4551a2 = m4551a(0, 0, true);
                while (i10 < iM4551a2) {
                    m4541b();
                    i10++;
                }
                return;
            case 10:
                m4536a();
                return;
            case 11:
            case 12:
                return;
            case 13:
                a aVar = new a();
                m4539a(aVar);
                if (aVar.f4970a == 0) {
                    m4538a(m4551a(0, 0, true));
                    return;
                }
                throw new C6479h("skipField with invalid type, type value: " + ((int) b10) + ", " + ((int) aVar.f4970a));
            default:
                throw new C6479h("invalid type.");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: b */
    private <T> T[] m4543b(T t10, int i10, boolean z10) {
        if (!m4542b(i10)) {
            if (z10) {
                throw new C6479h("require field not exist.");
            }
            return null;
        }
        a aVar = new a();
        m4539a(aVar);
        if (aVar.f4970a == 9) {
            int iM4551a = m4551a(0, 0, true);
            if (iM4551a >= 0) {
                T[] tArr = (T[]) ((Object[]) Array.newInstance(t10.getClass(), iM4551a));
                for (int i11 = 0; i11 < iM4551a; i11++) {
                    tArr[i11] = m4555a((C6482k) t10, 0, true);
                }
                return tArr;
            }
            throw new C6479h("size invalid: ".concat(String.valueOf(iM4551a)));
        }
        throw new C6479h("type mismatch.");
    }

    /* renamed from: a */
    public final boolean m4559a(int i10, boolean z10) {
        return m4550a((byte) 0, i10, z10) != 0;
    }

    /* renamed from: a */
    public final byte m4550a(byte b10, int i10, boolean z10) {
        if (!m4542b(i10)) {
            if (z10) {
                throw new C6479h("require field not exist.");
            }
            return b10;
        }
        a aVar = new a();
        m4539a(aVar);
        byte b11 = aVar.f4970a;
        if (b11 == 0) {
            return this.f4969b.get();
        }
        if (b11 == 12) {
            return (byte) 0;
        }
        throw new C6479h("type mismatch.");
    }

    /* renamed from: a */
    public final short m4557a(short s10, int i10, boolean z10) {
        if (!m4542b(i10)) {
            if (z10) {
                throw new C6479h("require field not exist.");
            }
            return s10;
        }
        a aVar = new a();
        m4539a(aVar);
        byte b10 = aVar.f4970a;
        if (b10 == 0) {
            return this.f4969b.get();
        }
        if (b10 == 1) {
            return this.f4969b.getShort();
        }
        if (b10 == 12) {
            return (short) 0;
        }
        throw new C6479h("type mismatch.");
    }

    /* renamed from: a */
    public final int m4551a(int i10, int i11, boolean z10) {
        if (!m4542b(i11)) {
            if (z10) {
                throw new C6479h("require field not exist.");
            }
            return i10;
        }
        a aVar = new a();
        m4539a(aVar);
        byte b10 = aVar.f4970a;
        if (b10 == 0) {
            return this.f4969b.get();
        }
        if (b10 == 1) {
            return this.f4969b.getShort();
        }
        if (b10 == 2) {
            return this.f4969b.getInt();
        }
        if (b10 == 12) {
            return 0;
        }
        throw new C6479h("type mismatch.");
    }

    /* renamed from: a */
    public final long m4553a(long j10, int i10, boolean z10) {
        if (!m4542b(i10)) {
            if (z10) {
                throw new C6479h("require field not exist.");
            }
            return j10;
        }
        a aVar = new a();
        m4539a(aVar);
        byte b10 = aVar.f4970a;
        if (b10 == 0) {
            return this.f4969b.get();
        }
        if (b10 == 1) {
            return this.f4969b.getShort();
        }
        if (b10 == 2) {
            return this.f4969b.getInt();
        }
        if (b10 == 3) {
            return this.f4969b.getLong();
        }
        if (b10 == 12) {
            return 0L;
        }
        throw new C6479h("type mismatch.");
    }

    /* renamed from: a */
    private float m4532a(float f10, int i10, boolean z10) {
        if (!m4542b(i10)) {
            if (z10) {
                throw new C6479h("require field not exist.");
            }
            return f10;
        }
        a aVar = new a();
        m4539a(aVar);
        byte b10 = aVar.f4970a;
        if (b10 == 4) {
            return this.f4969b.getFloat();
        }
        if (b10 == 12) {
            return 0.0f;
        }
        throw new C6479h("type mismatch.");
    }

    /* renamed from: a */
    private double m4531a(double d10, int i10, boolean z10) {
        if (!m4542b(i10)) {
            if (z10) {
                throw new C6479h("require field not exist.");
            }
            return d10;
        }
        a aVar = new a();
        m4539a(aVar);
        byte b10 = aVar.f4970a;
        if (b10 == 4) {
            return this.f4969b.getFloat();
        }
        if (b10 == 5) {
            return this.f4969b.getDouble();
        }
        if (b10 == 12) {
            return AudioStats.AUDIO_AMPLITUDE_NONE;
        }
        throw new C6479h("type mismatch.");
    }

    /* renamed from: a */
    public final <K, V> HashMap<K, V> m4556a(Map<K, V> map, int i10, boolean z10) {
        return (HashMap) m4535a(new HashMap(), map, i10, z10);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    private <K, V> Map<K, V> m4535a(Map<K, V> map, Map<K, V> map2, int i10, boolean z10) {
        if (map2 != null && !map2.isEmpty()) {
            Map.Entry<K, V> next = map2.entrySet().iterator().next();
            K key = next.getKey();
            V value = next.getValue();
            if (m4542b(i10)) {
                a aVar = new a();
                m4539a(aVar);
                if (aVar.f4970a == 8) {
                    int iM4551a = m4551a(0, 0, true);
                    if (iM4551a < 0) {
                        throw new C6479h("size invalid: ".concat(String.valueOf(iM4551a)));
                    }
                    for (int i11 = 0; i11 < iM4551a; i11++) {
                        map.put(m4555a((C6482k) key, 0, true), m4555a((C6482k) value, 1, true));
                    }
                } else {
                    throw new C6479h("type mismatch.");
                }
            } else if (z10) {
                throw new C6479h("require field not exist.");
            }
            return map;
        }
        return new HashMap();
    }

    /* renamed from: a */
    private <T> T[] m4540a(T[] tArr, int i10, boolean z10) {
        if (tArr != null && tArr.length != 0) {
            return (T[]) m4543b(tArr[0], i10, z10);
        }
        throw new C6479h("unable to get type of key and value.");
    }

    /* renamed from: a */
    private <T> List<T> m4534a(List<T> list, int i10, boolean z10) {
        if (list != null && !list.isEmpty()) {
            Object[] objArrM4543b = m4543b(list.get(0), i10, z10);
            if (objArrM4543b == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            for (Object obj : objArrM4543b) {
                arrayList.add(obj);
            }
            return arrayList;
        }
        return new ArrayList();
    }

    /* renamed from: a */
    public final AbstractC6484m m4554a(AbstractC6484m abstractC6484m, int i10, boolean z10) {
        if (!m4542b(i10)) {
            if (z10) {
                throw new C6479h("require field not exist.");
            }
            return null;
        }
        try {
            AbstractC6484m abstractC6484m2 = (AbstractC6484m) abstractC6484m.getClass().newInstance();
            a aVar = new a();
            m4539a(aVar);
            if (aVar.f4970a == 10) {
                abstractC6484m2.mo4495a(this);
                m4536a();
                return abstractC6484m2;
            }
            throw new C6479h("type mismatch.");
        } catch (Exception e10) {
            throw new C6479h(e10.getMessage());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    public final <T> Object m4555a(T t10, int i10, boolean z10) {
        if (t10 instanceof Byte) {
            return Byte.valueOf(m4550a((byte) 0, i10, z10));
        }
        if (t10 instanceof Boolean) {
            return Boolean.valueOf(m4559a(i10, z10));
        }
        if (t10 instanceof Short) {
            return Short.valueOf(m4557a((short) 0, i10, z10));
        }
        if (t10 instanceof Integer) {
            return Integer.valueOf(m4551a(0, i10, z10));
        }
        if (t10 instanceof Long) {
            return Long.valueOf(m4553a(0L, i10, z10));
        }
        if (t10 instanceof Float) {
            return Float.valueOf(m4532a(0.0f, i10, z10));
        }
        if (t10 instanceof Double) {
            return Double.valueOf(m4531a(AudioStats.AUDIO_AMPLITUDE_NONE, i10, z10));
        }
        if (t10 instanceof String) {
            return String.valueOf(m4560b(i10, z10));
        }
        if (t10 instanceof Map) {
            return m4556a((Map) t10, i10, z10);
        }
        if (t10 instanceof List) {
            return m4534a((List) t10, i10, z10);
        }
        if (t10 instanceof AbstractC6484m) {
            return m4554a((AbstractC6484m) t10, i10, z10);
        }
        if (t10.getClass().isArray()) {
            if (!(t10 instanceof byte[]) && !(t10 instanceof Byte[])) {
                if (t10 instanceof boolean[]) {
                    return m4544d(i10, z10);
                }
                if (t10 instanceof short[]) {
                    return m4545e(i10, z10);
                }
                if (t10 instanceof int[]) {
                    return m4546f(i10, z10);
                }
                if (t10 instanceof long[]) {
                    return m4547g(i10, z10);
                }
                if (t10 instanceof float[]) {
                    return m4548h(i10, z10);
                }
                if (t10 instanceof double[]) {
                    return m4549i(i10, z10);
                }
                return m4540a((Object[]) t10, i10, z10);
            }
            return m4561c(i10, z10);
        }
        throw new C6479h("read object error: unsupport type.");
    }

    /* renamed from: a */
    public final int m4552a(String str) {
        this.f4968a = str;
        return 0;
    }
}
