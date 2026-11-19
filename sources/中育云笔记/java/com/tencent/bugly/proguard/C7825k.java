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
/* loaded from: classes5.dex */
public final class C7825k {

    /* renamed from: a */
    protected String f14067a = "GBK";

    /* renamed from: b */
    private ByteBuffer f14068b;

    /* renamed from: com.tencent.bugly.proguard.k$a */
    public static class a {

        /* renamed from: a */
        public byte f14069a;

        /* renamed from: b */
        public int f14070b;
    }

    public C7825k() {
    }

    /* renamed from: b */
    private boolean m10872b(int i10) {
        int i11;
        try {
            a aVar = new a();
            while (true) {
                int iM10863a = m10863a(aVar, this.f14068b.duplicate());
                i11 = aVar.f14070b;
                if (i10 <= i11 || aVar.f14069a == 11) {
                    break;
                }
                m10868a(iM10863a);
                m10867a(aVar.f14069a);
            }
        } catch (C7822h | BufferUnderflowException unused) {
        }
        return i10 == i11;
    }

    /* renamed from: d */
    private boolean[] m10874d(int i10, boolean z10) {
        if (!m10872b(i10)) {
            if (z10) {
                throw new C7822h("require field not exist.");
            }
            return null;
        }
        a aVar = new a();
        m10869a(aVar);
        if (aVar.f14069a != 9) {
            throw new C7822h("type mismatch.");
        }
        int iM10881a = m10881a(0, 0, true);
        if (iM10881a < 0) {
            throw new C7822h("size invalid: ".concat(String.valueOf(iM10881a)));
        }
        boolean[] zArr = new boolean[iM10881a];
        for (int i11 = 0; i11 < iM10881a; i11++) {
            zArr[i11] = m10889a(0, true);
        }
        return zArr;
    }

    /* renamed from: e */
    private short[] m10875e(int i10, boolean z10) {
        if (!m10872b(i10)) {
            if (z10) {
                throw new C7822h("require field not exist.");
            }
            return null;
        }
        a aVar = new a();
        m10869a(aVar);
        if (aVar.f14069a != 9) {
            throw new C7822h("type mismatch.");
        }
        int iM10881a = m10881a(0, 0, true);
        if (iM10881a < 0) {
            throw new C7822h("size invalid: ".concat(String.valueOf(iM10881a)));
        }
        short[] sArr = new short[iM10881a];
        for (int i11 = 0; i11 < iM10881a; i11++) {
            sArr[i11] = m10887a(sArr[0], 0, true);
        }
        return sArr;
    }

    /* renamed from: f */
    private int[] m10876f(int i10, boolean z10) {
        if (!m10872b(i10)) {
            if (z10) {
                throw new C7822h("require field not exist.");
            }
            return null;
        }
        a aVar = new a();
        m10869a(aVar);
        if (aVar.f14069a != 9) {
            throw new C7822h("type mismatch.");
        }
        int iM10881a = m10881a(0, 0, true);
        if (iM10881a < 0) {
            throw new C7822h("size invalid: ".concat(String.valueOf(iM10881a)));
        }
        int[] iArr = new int[iM10881a];
        for (int i11 = 0; i11 < iM10881a; i11++) {
            iArr[i11] = m10881a(iArr[0], 0, true);
        }
        return iArr;
    }

    /* renamed from: g */
    private long[] m10877g(int i10, boolean z10) {
        if (!m10872b(i10)) {
            if (z10) {
                throw new C7822h("require field not exist.");
            }
            return null;
        }
        a aVar = new a();
        m10869a(aVar);
        if (aVar.f14069a != 9) {
            throw new C7822h("type mismatch.");
        }
        int iM10881a = m10881a(0, 0, true);
        if (iM10881a < 0) {
            throw new C7822h("size invalid: ".concat(String.valueOf(iM10881a)));
        }
        long[] jArr = new long[iM10881a];
        for (int i11 = 0; i11 < iM10881a; i11++) {
            jArr[i11] = m10883a(jArr[0], 0, true);
        }
        return jArr;
    }

    /* renamed from: h */
    private float[] m10878h(int i10, boolean z10) {
        if (!m10872b(i10)) {
            if (z10) {
                throw new C7822h("require field not exist.");
            }
            return null;
        }
        a aVar = new a();
        m10869a(aVar);
        if (aVar.f14069a != 9) {
            throw new C7822h("type mismatch.");
        }
        int iM10881a = m10881a(0, 0, true);
        if (iM10881a < 0) {
            throw new C7822h("size invalid: ".concat(String.valueOf(iM10881a)));
        }
        float[] fArr = new float[iM10881a];
        for (int i11 = 0; i11 < iM10881a; i11++) {
            fArr[i11] = m10862a(fArr[0], 0, true);
        }
        return fArr;
    }

    /* renamed from: i */
    private double[] m10879i(int i10, boolean z10) {
        if (!m10872b(i10)) {
            if (z10) {
                throw new C7822h("require field not exist.");
            }
            return null;
        }
        a aVar = new a();
        m10869a(aVar);
        if (aVar.f14069a != 9) {
            throw new C7822h("type mismatch.");
        }
        int iM10881a = m10881a(0, 0, true);
        if (iM10881a < 0) {
            throw new C7822h("size invalid: ".concat(String.valueOf(iM10881a)));
        }
        double[] dArr = new double[iM10881a];
        for (int i11 = 0; i11 < iM10881a; i11++) {
            dArr[i11] = m10861a(dArr[0], 0, true);
        }
        return dArr;
    }

    /* renamed from: a */
    public final void m10888a(byte[] bArr) {
        ByteBuffer byteBuffer = this.f14068b;
        if (byteBuffer != null) {
            byteBuffer.clear();
        }
        this.f14068b = ByteBuffer.wrap(bArr);
    }

    /* renamed from: c */
    public final byte[] m10891c(int i10, boolean z10) {
        if (!m10872b(i10)) {
            if (z10) {
                throw new C7822h("require field not exist.");
            }
            return null;
        }
        a aVar = new a();
        m10869a(aVar);
        byte b10 = aVar.f14069a;
        if (b10 == 9) {
            int iM10881a = m10881a(0, 0, true);
            if (iM10881a < 0) {
                throw new C7822h("size invalid: ".concat(String.valueOf(iM10881a)));
            }
            byte[] bArr = new byte[iM10881a];
            for (int i11 = 0; i11 < iM10881a; i11++) {
                bArr[i11] = m10880a(bArr[0], 0, true);
            }
            return bArr;
        }
        if (b10 != 13) {
            throw new C7822h("type mismatch.");
        }
        a aVar2 = new a();
        m10869a(aVar2);
        if (aVar2.f14069a != 0) {
            throw new C7822h("type mismatch, tag: " + i10 + ", type: " + ((int) aVar.f14069a) + ", " + ((int) aVar2.f14069a));
        }
        int iM10881a2 = m10881a(0, 0, true);
        if (iM10881a2 >= 0) {
            byte[] bArr2 = new byte[iM10881a2];
            this.f14068b.get(bArr2);
            return bArr2;
        }
        throw new C7822h("invalid size, tag: " + i10 + ", type: " + ((int) aVar.f14069a) + ", " + ((int) aVar2.f14069a) + ", size: " + iM10881a2);
    }

    public C7825k(byte[] bArr) {
        this.f14068b = ByteBuffer.wrap(bArr);
    }

    /* renamed from: a */
    private static int m10863a(a aVar, ByteBuffer byteBuffer) {
        byte b10 = byteBuffer.get();
        aVar.f14069a = (byte) (b10 & 15);
        int i10 = (b10 & 240) >> 4;
        aVar.f14070b = i10;
        if (i10 != 15) {
            return 1;
        }
        aVar.f14070b = byteBuffer.get();
        return 2;
    }

    public C7825k(byte[] bArr, byte b10) {
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr);
        this.f14068b = byteBufferWrap;
        byteBufferWrap.position(4);
    }

    /* renamed from: b */
    private void m10871b() {
        a aVar = new a();
        m10869a(aVar);
        m10867a(aVar.f14069a);
    }

    /* renamed from: a */
    private void m10869a(a aVar) {
        m10863a(aVar, this.f14068b);
    }

    /* renamed from: a */
    private void m10868a(int i10) {
        ByteBuffer byteBuffer = this.f14068b;
        byteBuffer.position(byteBuffer.position() + i10);
    }

    /* renamed from: b */
    public final String m10890b(int i10, boolean z10) {
        if (!m10872b(i10)) {
            if (z10) {
                throw new C7822h("require field not exist.");
            }
            return null;
        }
        a aVar = new a();
        m10869a(aVar);
        byte b10 = aVar.f14069a;
        if (b10 == 6) {
            int i11 = this.f14068b.get();
            if (i11 < 0) {
                i11 += 256;
            }
            byte[] bArr = new byte[i11];
            this.f14068b.get(bArr);
            try {
                return new String(bArr, this.f14067a);
            } catch (UnsupportedEncodingException unused) {
                return new String(bArr);
            }
        }
        if (b10 == 7) {
            int i12 = this.f14068b.getInt();
            if (i12 <= 104857600 && i12 >= 0) {
                byte[] bArr2 = new byte[i12];
                this.f14068b.get(bArr2);
                try {
                    return new String(bArr2, this.f14067a);
                } catch (UnsupportedEncodingException unused2) {
                    return new String(bArr2);
                }
            }
            throw new C7822h("String too long: ".concat(String.valueOf(i12)));
        }
        throw new C7822h("type mismatch.");
    }

    /* renamed from: a */
    private void m10866a() {
        a aVar = new a();
        do {
            m10869a(aVar);
            m10867a(aVar.f14069a);
        } while (aVar.f14069a != 11);
    }

    /* renamed from: a */
    private void m10867a(byte b10) {
        int i10 = 0;
        switch (b10) {
            case 0:
                m10868a(1);
                return;
            case 1:
                m10868a(2);
                return;
            case 2:
                m10868a(4);
                return;
            case 3:
                m10868a(8);
                return;
            case 4:
                m10868a(4);
                return;
            case 5:
                m10868a(8);
                return;
            case 6:
                int i11 = this.f14068b.get();
                if (i11 < 0) {
                    i11 += 256;
                }
                m10868a(i11);
                return;
            case 7:
                m10868a(this.f14068b.getInt());
                return;
            case 8:
                int iM10881a = m10881a(0, 0, true);
                while (i10 < iM10881a * 2) {
                    m10871b();
                    i10++;
                }
                return;
            case 9:
                int iM10881a2 = m10881a(0, 0, true);
                while (i10 < iM10881a2) {
                    m10871b();
                    i10++;
                }
                return;
            case 10:
                m10866a();
                return;
            case 11:
            case 12:
                return;
            case 13:
                a aVar = new a();
                m10869a(aVar);
                if (aVar.f14069a == 0) {
                    m10868a(m10881a(0, 0, true));
                    return;
                }
                throw new C7822h("skipField with invalid type, type value: " + ((int) b10) + ", " + ((int) aVar.f14069a));
            default:
                throw new C7822h("invalid type.");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: b */
    private <T> T[] m10873b(T t10, int i10, boolean z10) {
        if (!m10872b(i10)) {
            if (z10) {
                throw new C7822h("require field not exist.");
            }
            return null;
        }
        a aVar = new a();
        m10869a(aVar);
        if (aVar.f14069a == 9) {
            int iM10881a = m10881a(0, 0, true);
            if (iM10881a >= 0) {
                T[] tArr = (T[]) ((Object[]) Array.newInstance(t10.getClass(), iM10881a));
                for (int i11 = 0; i11 < iM10881a; i11++) {
                    tArr[i11] = m10885a((C7825k) t10, 0, true);
                }
                return tArr;
            }
            throw new C7822h("size invalid: ".concat(String.valueOf(iM10881a)));
        }
        throw new C7822h("type mismatch.");
    }

    /* renamed from: a */
    public final boolean m10889a(int i10, boolean z10) {
        return m10880a((byte) 0, i10, z10) != 0;
    }

    /* renamed from: a */
    public final byte m10880a(byte b10, int i10, boolean z10) {
        if (!m10872b(i10)) {
            if (z10) {
                throw new C7822h("require field not exist.");
            }
            return b10;
        }
        a aVar = new a();
        m10869a(aVar);
        byte b11 = aVar.f14069a;
        if (b11 == 0) {
            return this.f14068b.get();
        }
        if (b11 == 12) {
            return (byte) 0;
        }
        throw new C7822h("type mismatch.");
    }

    /* renamed from: a */
    public final short m10887a(short s10, int i10, boolean z10) {
        if (!m10872b(i10)) {
            if (z10) {
                throw new C7822h("require field not exist.");
            }
            return s10;
        }
        a aVar = new a();
        m10869a(aVar);
        byte b10 = aVar.f14069a;
        if (b10 == 0) {
            return this.f14068b.get();
        }
        if (b10 == 1) {
            return this.f14068b.getShort();
        }
        if (b10 == 12) {
            return (short) 0;
        }
        throw new C7822h("type mismatch.");
    }

    /* renamed from: a */
    public final int m10881a(int i10, int i11, boolean z10) {
        if (!m10872b(i11)) {
            if (z10) {
                throw new C7822h("require field not exist.");
            }
            return i10;
        }
        a aVar = new a();
        m10869a(aVar);
        byte b10 = aVar.f14069a;
        if (b10 == 0) {
            return this.f14068b.get();
        }
        if (b10 == 1) {
            return this.f14068b.getShort();
        }
        if (b10 == 2) {
            return this.f14068b.getInt();
        }
        if (b10 == 12) {
            return 0;
        }
        throw new C7822h("type mismatch.");
    }

    /* renamed from: a */
    public final long m10883a(long j10, int i10, boolean z10) {
        if (!m10872b(i10)) {
            if (z10) {
                throw new C7822h("require field not exist.");
            }
            return j10;
        }
        a aVar = new a();
        m10869a(aVar);
        byte b10 = aVar.f14069a;
        if (b10 == 0) {
            return this.f14068b.get();
        }
        if (b10 == 1) {
            return this.f14068b.getShort();
        }
        if (b10 == 2) {
            return this.f14068b.getInt();
        }
        if (b10 == 3) {
            return this.f14068b.getLong();
        }
        if (b10 == 12) {
            return 0L;
        }
        throw new C7822h("type mismatch.");
    }

    /* renamed from: a */
    private float m10862a(float f10, int i10, boolean z10) {
        if (!m10872b(i10)) {
            if (z10) {
                throw new C7822h("require field not exist.");
            }
            return f10;
        }
        a aVar = new a();
        m10869a(aVar);
        byte b10 = aVar.f14069a;
        if (b10 == 4) {
            return this.f14068b.getFloat();
        }
        if (b10 == 12) {
            return 0.0f;
        }
        throw new C7822h("type mismatch.");
    }

    /* renamed from: a */
    private double m10861a(double d10, int i10, boolean z10) {
        if (!m10872b(i10)) {
            if (z10) {
                throw new C7822h("require field not exist.");
            }
            return d10;
        }
        a aVar = new a();
        m10869a(aVar);
        byte b10 = aVar.f14069a;
        if (b10 == 4) {
            return this.f14068b.getFloat();
        }
        if (b10 == 5) {
            return this.f14068b.getDouble();
        }
        if (b10 == 12) {
            return AudioStats.AUDIO_AMPLITUDE_NONE;
        }
        throw new C7822h("type mismatch.");
    }

    /* renamed from: a */
    public final <K, V> HashMap<K, V> m10886a(Map<K, V> map, int i10, boolean z10) {
        return (HashMap) m10865a(new HashMap(), map, i10, z10);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    private <K, V> Map<K, V> m10865a(Map<K, V> map, Map<K, V> map2, int i10, boolean z10) {
        if (map2 != null && !map2.isEmpty()) {
            Map.Entry<K, V> next = map2.entrySet().iterator().next();
            K key = next.getKey();
            V value = next.getValue();
            if (m10872b(i10)) {
                a aVar = new a();
                m10869a(aVar);
                if (aVar.f14069a == 8) {
                    int iM10881a = m10881a(0, 0, true);
                    if (iM10881a < 0) {
                        throw new C7822h("size invalid: ".concat(String.valueOf(iM10881a)));
                    }
                    for (int i11 = 0; i11 < iM10881a; i11++) {
                        map.put(m10885a((C7825k) key, 0, true), m10885a((C7825k) value, 1, true));
                    }
                } else {
                    throw new C7822h("type mismatch.");
                }
            } else if (z10) {
                throw new C7822h("require field not exist.");
            }
            return map;
        }
        return new HashMap();
    }

    /* renamed from: a */
    private <T> T[] m10870a(T[] tArr, int i10, boolean z10) {
        if (tArr != null && tArr.length != 0) {
            return (T[]) m10873b(tArr[0], i10, z10);
        }
        throw new C7822h("unable to get type of key and value.");
    }

    /* renamed from: a */
    private <T> List<T> m10864a(List<T> list, int i10, boolean z10) {
        if (list != null && !list.isEmpty()) {
            Object[] objArrM10873b = m10873b(list.get(0), i10, z10);
            if (objArrM10873b == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            for (Object obj : objArrM10873b) {
                arrayList.add(obj);
            }
            return arrayList;
        }
        return new ArrayList();
    }

    /* renamed from: a */
    public final AbstractC7827m m10884a(AbstractC7827m abstractC7827m, int i10, boolean z10) {
        if (!m10872b(i10)) {
            if (z10) {
                throw new C7822h("require field not exist.");
            }
            return null;
        }
        try {
            AbstractC7827m abstractC7827m2 = (AbstractC7827m) abstractC7827m.getClass().newInstance();
            a aVar = new a();
            m10869a(aVar);
            if (aVar.f14069a == 10) {
                abstractC7827m2.mo10825a(this);
                m10866a();
                return abstractC7827m2;
            }
            throw new C7822h("type mismatch.");
        } catch (Exception e10) {
            throw new C7822h(e10.getMessage());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    public final <T> Object m10885a(T t10, int i10, boolean z10) {
        if (t10 instanceof Byte) {
            return Byte.valueOf(m10880a((byte) 0, i10, z10));
        }
        if (t10 instanceof Boolean) {
            return Boolean.valueOf(m10889a(i10, z10));
        }
        if (t10 instanceof Short) {
            return Short.valueOf(m10887a((short) 0, i10, z10));
        }
        if (t10 instanceof Integer) {
            return Integer.valueOf(m10881a(0, i10, z10));
        }
        if (t10 instanceof Long) {
            return Long.valueOf(m10883a(0L, i10, z10));
        }
        if (t10 instanceof Float) {
            return Float.valueOf(m10862a(0.0f, i10, z10));
        }
        if (t10 instanceof Double) {
            return Double.valueOf(m10861a(AudioStats.AUDIO_AMPLITUDE_NONE, i10, z10));
        }
        if (t10 instanceof String) {
            return String.valueOf(m10890b(i10, z10));
        }
        if (t10 instanceof Map) {
            return m10886a((Map) t10, i10, z10);
        }
        if (t10 instanceof List) {
            return m10864a((List) t10, i10, z10);
        }
        if (t10 instanceof AbstractC7827m) {
            return m10884a((AbstractC7827m) t10, i10, z10);
        }
        if (t10.getClass().isArray()) {
            if (!(t10 instanceof byte[]) && !(t10 instanceof Byte[])) {
                if (t10 instanceof boolean[]) {
                    return m10874d(i10, z10);
                }
                if (t10 instanceof short[]) {
                    return m10875e(i10, z10);
                }
                if (t10 instanceof int[]) {
                    return m10876f(i10, z10);
                }
                if (t10 instanceof long[]) {
                    return m10877g(i10, z10);
                }
                if (t10 instanceof float[]) {
                    return m10878h(i10, z10);
                }
                if (t10 instanceof double[]) {
                    return m10879i(i10, z10);
                }
                return m10870a((Object[]) t10, i10, z10);
            }
            return m10891c(i10, z10);
        }
        throw new C7822h("read object error: unsupport type.");
    }

    /* renamed from: a */
    public final int m10882a(String str) {
        this.f14067a = str;
        return 0;
    }
}
