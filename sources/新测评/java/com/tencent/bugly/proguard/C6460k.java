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
public final class C6460k {

    /* renamed from: a */
    protected String f5625a = "GBK";

    /* renamed from: b */
    private ByteBuffer f5626b;

    /* renamed from: com.tencent.bugly.proguard.k$a */
    public static class a {

        /* renamed from: a */
        public byte f5627a;

        /* renamed from: b */
        public int f5628b;
    }

    public C6460k() {
    }

    /* renamed from: b */
    private boolean m5182b(int i10) {
        int i11;
        try {
            a aVar = new a();
            while (true) {
                int iM5173a = m5173a(aVar, this.f5626b.duplicate());
                i11 = aVar.f5628b;
                if (i10 <= i11 || aVar.f5627a == 11) {
                    break;
                }
                m5178a(iM5173a);
                m5177a(aVar.f5627a);
            }
        } catch (C6457h | BufferUnderflowException unused) {
        }
        return i10 == i11;
    }

    /* renamed from: d */
    private boolean[] m5184d(int i10, boolean z9) {
        if (!m5182b(i10)) {
            if (z9) {
                throw new C6457h("require field not exist.");
            }
            return null;
        }
        a aVar = new a();
        m5179a(aVar);
        if (aVar.f5627a != 9) {
            throw new C6457h("type mismatch.");
        }
        int iM5191a = m5191a(0, 0, true);
        if (iM5191a < 0) {
            throw new C6457h("size invalid: ".concat(String.valueOf(iM5191a)));
        }
        boolean[] zArr = new boolean[iM5191a];
        for (int i11 = 0; i11 < iM5191a; i11++) {
            zArr[i11] = m5199a(0, true);
        }
        return zArr;
    }

    /* renamed from: e */
    private short[] m5185e(int i10, boolean z9) {
        if (!m5182b(i10)) {
            if (z9) {
                throw new C6457h("require field not exist.");
            }
            return null;
        }
        a aVar = new a();
        m5179a(aVar);
        if (aVar.f5627a != 9) {
            throw new C6457h("type mismatch.");
        }
        int iM5191a = m5191a(0, 0, true);
        if (iM5191a < 0) {
            throw new C6457h("size invalid: ".concat(String.valueOf(iM5191a)));
        }
        short[] sArr = new short[iM5191a];
        for (int i11 = 0; i11 < iM5191a; i11++) {
            sArr[i11] = m5197a(sArr[0], 0, true);
        }
        return sArr;
    }

    /* renamed from: f */
    private int[] m5186f(int i10, boolean z9) {
        if (!m5182b(i10)) {
            if (z9) {
                throw new C6457h("require field not exist.");
            }
            return null;
        }
        a aVar = new a();
        m5179a(aVar);
        if (aVar.f5627a != 9) {
            throw new C6457h("type mismatch.");
        }
        int iM5191a = m5191a(0, 0, true);
        if (iM5191a < 0) {
            throw new C6457h("size invalid: ".concat(String.valueOf(iM5191a)));
        }
        int[] iArr = new int[iM5191a];
        for (int i11 = 0; i11 < iM5191a; i11++) {
            iArr[i11] = m5191a(iArr[0], 0, true);
        }
        return iArr;
    }

    /* renamed from: g */
    private long[] m5187g(int i10, boolean z9) {
        if (!m5182b(i10)) {
            if (z9) {
                throw new C6457h("require field not exist.");
            }
            return null;
        }
        a aVar = new a();
        m5179a(aVar);
        if (aVar.f5627a != 9) {
            throw new C6457h("type mismatch.");
        }
        int iM5191a = m5191a(0, 0, true);
        if (iM5191a < 0) {
            throw new C6457h("size invalid: ".concat(String.valueOf(iM5191a)));
        }
        long[] jArr = new long[iM5191a];
        for (int i11 = 0; i11 < iM5191a; i11++) {
            jArr[i11] = m5193a(jArr[0], 0, true);
        }
        return jArr;
    }

    /* renamed from: h */
    private float[] m5188h(int i10, boolean z9) {
        if (!m5182b(i10)) {
            if (z9) {
                throw new C6457h("require field not exist.");
            }
            return null;
        }
        a aVar = new a();
        m5179a(aVar);
        if (aVar.f5627a != 9) {
            throw new C6457h("type mismatch.");
        }
        int iM5191a = m5191a(0, 0, true);
        if (iM5191a < 0) {
            throw new C6457h("size invalid: ".concat(String.valueOf(iM5191a)));
        }
        float[] fArr = new float[iM5191a];
        for (int i11 = 0; i11 < iM5191a; i11++) {
            fArr[i11] = m5172a(fArr[0], 0, true);
        }
        return fArr;
    }

    /* renamed from: i */
    private double[] m5189i(int i10, boolean z9) {
        if (!m5182b(i10)) {
            if (z9) {
                throw new C6457h("require field not exist.");
            }
            return null;
        }
        a aVar = new a();
        m5179a(aVar);
        if (aVar.f5627a != 9) {
            throw new C6457h("type mismatch.");
        }
        int iM5191a = m5191a(0, 0, true);
        if (iM5191a < 0) {
            throw new C6457h("size invalid: ".concat(String.valueOf(iM5191a)));
        }
        double[] dArr = new double[iM5191a];
        for (int i11 = 0; i11 < iM5191a; i11++) {
            dArr[i11] = m5171a(dArr[0], 0, true);
        }
        return dArr;
    }

    /* renamed from: a */
    public final void m5198a(byte[] bArr) {
        ByteBuffer byteBuffer = this.f5626b;
        if (byteBuffer != null) {
            byteBuffer.clear();
        }
        this.f5626b = ByteBuffer.wrap(bArr);
    }

    /* renamed from: c */
    public final byte[] m5201c(int i10, boolean z9) {
        if (!m5182b(i10)) {
            if (z9) {
                throw new C6457h("require field not exist.");
            }
            return null;
        }
        a aVar = new a();
        m5179a(aVar);
        byte b10 = aVar.f5627a;
        if (b10 == 9) {
            int iM5191a = m5191a(0, 0, true);
            if (iM5191a < 0) {
                throw new C6457h("size invalid: ".concat(String.valueOf(iM5191a)));
            }
            byte[] bArr = new byte[iM5191a];
            for (int i11 = 0; i11 < iM5191a; i11++) {
                bArr[i11] = m5190a(bArr[0], 0, true);
            }
            return bArr;
        }
        if (b10 != 13) {
            throw new C6457h("type mismatch.");
        }
        a aVar2 = new a();
        m5179a(aVar2);
        if (aVar2.f5627a != 0) {
            throw new C6457h("type mismatch, tag: " + i10 + ", type: " + ((int) aVar.f5627a) + ", " + ((int) aVar2.f5627a));
        }
        int iM5191a2 = m5191a(0, 0, true);
        if (iM5191a2 >= 0) {
            byte[] bArr2 = new byte[iM5191a2];
            this.f5626b.get(bArr2);
            return bArr2;
        }
        throw new C6457h("invalid size, tag: " + i10 + ", type: " + ((int) aVar.f5627a) + ", " + ((int) aVar2.f5627a) + ", size: " + iM5191a2);
    }

    public C6460k(byte[] bArr) {
        this.f5626b = ByteBuffer.wrap(bArr);
    }

    /* renamed from: a */
    private static int m5173a(a aVar, ByteBuffer byteBuffer) {
        byte b10 = byteBuffer.get();
        aVar.f5627a = (byte) (b10 & 15);
        int i10 = (b10 & 240) >> 4;
        aVar.f5628b = i10;
        if (i10 != 15) {
            return 1;
        }
        aVar.f5628b = byteBuffer.get();
        return 2;
    }

    public C6460k(byte[] bArr, byte b10) {
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr);
        this.f5626b = byteBufferWrap;
        byteBufferWrap.position(4);
    }

    /* renamed from: b */
    private void m5181b() {
        a aVar = new a();
        m5179a(aVar);
        m5177a(aVar.f5627a);
    }

    /* renamed from: a */
    private void m5179a(a aVar) {
        m5173a(aVar, this.f5626b);
    }

    /* renamed from: a */
    private void m5178a(int i10) {
        ByteBuffer byteBuffer = this.f5626b;
        byteBuffer.position(byteBuffer.position() + i10);
    }

    /* renamed from: b */
    public final String m5200b(int i10, boolean z9) {
        if (!m5182b(i10)) {
            if (z9) {
                throw new C6457h("require field not exist.");
            }
            return null;
        }
        a aVar = new a();
        m5179a(aVar);
        byte b10 = aVar.f5627a;
        if (b10 == 6) {
            int i11 = this.f5626b.get();
            if (i11 < 0) {
                i11 += 256;
            }
            byte[] bArr = new byte[i11];
            this.f5626b.get(bArr);
            try {
                return new String(bArr, this.f5625a);
            } catch (UnsupportedEncodingException unused) {
                return new String(bArr);
            }
        }
        if (b10 == 7) {
            int i12 = this.f5626b.getInt();
            if (i12 <= 104857600 && i12 >= 0) {
                byte[] bArr2 = new byte[i12];
                this.f5626b.get(bArr2);
                try {
                    return new String(bArr2, this.f5625a);
                } catch (UnsupportedEncodingException unused2) {
                    return new String(bArr2);
                }
            }
            throw new C6457h("String too long: ".concat(String.valueOf(i12)));
        }
        throw new C6457h("type mismatch.");
    }

    /* renamed from: a */
    private void m5176a() {
        a aVar = new a();
        do {
            m5179a(aVar);
            m5177a(aVar.f5627a);
        } while (aVar.f5627a != 11);
    }

    /* renamed from: a */
    private void m5177a(byte b10) {
        int i10 = 0;
        switch (b10) {
            case 0:
                m5178a(1);
                return;
            case 1:
                m5178a(2);
                return;
            case 2:
                m5178a(4);
                return;
            case 3:
                m5178a(8);
                return;
            case 4:
                m5178a(4);
                return;
            case 5:
                m5178a(8);
                return;
            case 6:
                int i11 = this.f5626b.get();
                if (i11 < 0) {
                    i11 += 256;
                }
                m5178a(i11);
                return;
            case 7:
                m5178a(this.f5626b.getInt());
                return;
            case 8:
                int iM5191a = m5191a(0, 0, true);
                while (i10 < iM5191a * 2) {
                    m5181b();
                    i10++;
                }
                return;
            case 9:
                int iM5191a2 = m5191a(0, 0, true);
                while (i10 < iM5191a2) {
                    m5181b();
                    i10++;
                }
                return;
            case 10:
                m5176a();
                return;
            case 11:
            case 12:
                return;
            case 13:
                a aVar = new a();
                m5179a(aVar);
                if (aVar.f5627a == 0) {
                    m5178a(m5191a(0, 0, true));
                    return;
                }
                throw new C6457h("skipField with invalid type, type value: " + ((int) b10) + ", " + ((int) aVar.f5627a));
            default:
                throw new C6457h("invalid type.");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: b */
    private <T> T[] m5183b(T t10, int i10, boolean z9) {
        if (!m5182b(i10)) {
            if (z9) {
                throw new C6457h("require field not exist.");
            }
            return null;
        }
        a aVar = new a();
        m5179a(aVar);
        if (aVar.f5627a == 9) {
            int iM5191a = m5191a(0, 0, true);
            if (iM5191a >= 0) {
                T[] tArr = (T[]) ((Object[]) Array.newInstance(t10.getClass(), iM5191a));
                for (int i11 = 0; i11 < iM5191a; i11++) {
                    tArr[i11] = m5195a((C6460k) t10, 0, true);
                }
                return tArr;
            }
            throw new C6457h("size invalid: ".concat(String.valueOf(iM5191a)));
        }
        throw new C6457h("type mismatch.");
    }

    /* renamed from: a */
    public final boolean m5199a(int i10, boolean z9) {
        return m5190a((byte) 0, i10, z9) != 0;
    }

    /* renamed from: a */
    public final byte m5190a(byte b10, int i10, boolean z9) {
        if (!m5182b(i10)) {
            if (z9) {
                throw new C6457h("require field not exist.");
            }
            return b10;
        }
        a aVar = new a();
        m5179a(aVar);
        byte b11 = aVar.f5627a;
        if (b11 == 0) {
            return this.f5626b.get();
        }
        if (b11 == 12) {
            return (byte) 0;
        }
        throw new C6457h("type mismatch.");
    }

    /* renamed from: a */
    public final short m5197a(short s10, int i10, boolean z9) {
        if (!m5182b(i10)) {
            if (z9) {
                throw new C6457h("require field not exist.");
            }
            return s10;
        }
        a aVar = new a();
        m5179a(aVar);
        byte b10 = aVar.f5627a;
        if (b10 == 0) {
            return this.f5626b.get();
        }
        if (b10 == 1) {
            return this.f5626b.getShort();
        }
        if (b10 == 12) {
            return (short) 0;
        }
        throw new C6457h("type mismatch.");
    }

    /* renamed from: a */
    public final int m5191a(int i10, int i11, boolean z9) {
        if (!m5182b(i11)) {
            if (z9) {
                throw new C6457h("require field not exist.");
            }
            return i10;
        }
        a aVar = new a();
        m5179a(aVar);
        byte b10 = aVar.f5627a;
        if (b10 == 0) {
            return this.f5626b.get();
        }
        if (b10 == 1) {
            return this.f5626b.getShort();
        }
        if (b10 == 2) {
            return this.f5626b.getInt();
        }
        if (b10 == 12) {
            return 0;
        }
        throw new C6457h("type mismatch.");
    }

    /* renamed from: a */
    public final long m5193a(long j10, int i10, boolean z9) {
        if (!m5182b(i10)) {
            if (z9) {
                throw new C6457h("require field not exist.");
            }
            return j10;
        }
        a aVar = new a();
        m5179a(aVar);
        byte b10 = aVar.f5627a;
        if (b10 == 0) {
            return this.f5626b.get();
        }
        if (b10 == 1) {
            return this.f5626b.getShort();
        }
        if (b10 == 2) {
            return this.f5626b.getInt();
        }
        if (b10 == 3) {
            return this.f5626b.getLong();
        }
        if (b10 == 12) {
            return 0L;
        }
        throw new C6457h("type mismatch.");
    }

    /* renamed from: a */
    private float m5172a(float f10, int i10, boolean z9) {
        if (!m5182b(i10)) {
            if (z9) {
                throw new C6457h("require field not exist.");
            }
            return f10;
        }
        a aVar = new a();
        m5179a(aVar);
        byte b10 = aVar.f5627a;
        if (b10 == 4) {
            return this.f5626b.getFloat();
        }
        if (b10 == 12) {
            return 0.0f;
        }
        throw new C6457h("type mismatch.");
    }

    /* renamed from: a */
    private double m5171a(double d10, int i10, boolean z9) {
        if (!m5182b(i10)) {
            if (z9) {
                throw new C6457h("require field not exist.");
            }
            return d10;
        }
        a aVar = new a();
        m5179a(aVar);
        byte b10 = aVar.f5627a;
        if (b10 == 4) {
            return this.f5626b.getFloat();
        }
        if (b10 == 5) {
            return this.f5626b.getDouble();
        }
        if (b10 == 12) {
            return AudioStats.AUDIO_AMPLITUDE_NONE;
        }
        throw new C6457h("type mismatch.");
    }

    /* renamed from: a */
    public final <K, V> HashMap<K, V> m5196a(Map<K, V> map, int i10, boolean z9) {
        return (HashMap) m5175a(new HashMap(), map, i10, z9);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    private <K, V> Map<K, V> m5175a(Map<K, V> map, Map<K, V> map2, int i10, boolean z9) {
        if (map2 != null && !map2.isEmpty()) {
            Map.Entry<K, V> next = map2.entrySet().iterator().next();
            K key = next.getKey();
            V value = next.getValue();
            if (m5182b(i10)) {
                a aVar = new a();
                m5179a(aVar);
                if (aVar.f5627a == 8) {
                    int iM5191a = m5191a(0, 0, true);
                    if (iM5191a < 0) {
                        throw new C6457h("size invalid: ".concat(String.valueOf(iM5191a)));
                    }
                    for (int i11 = 0; i11 < iM5191a; i11++) {
                        map.put(m5195a((C6460k) key, 0, true), m5195a((C6460k) value, 1, true));
                    }
                } else {
                    throw new C6457h("type mismatch.");
                }
            } else if (z9) {
                throw new C6457h("require field not exist.");
            }
            return map;
        }
        return new HashMap();
    }

    /* renamed from: a */
    private <T> T[] m5180a(T[] tArr, int i10, boolean z9) {
        if (tArr != null && tArr.length != 0) {
            return (T[]) m5183b(tArr[0], i10, z9);
        }
        throw new C6457h("unable to get type of key and value.");
    }

    /* renamed from: a */
    private <T> List<T> m5174a(List<T> list, int i10, boolean z9) {
        if (list != null && !list.isEmpty()) {
            Object[] objArrM5183b = m5183b(list.get(0), i10, z9);
            if (objArrM5183b == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            for (Object obj : objArrM5183b) {
                arrayList.add(obj);
            }
            return arrayList;
        }
        return new ArrayList();
    }

    /* renamed from: a */
    public final AbstractC6462m m5194a(AbstractC6462m abstractC6462m, int i10, boolean z9) {
        if (!m5182b(i10)) {
            if (z9) {
                throw new C6457h("require field not exist.");
            }
            return null;
        }
        try {
            AbstractC6462m abstractC6462m2 = (AbstractC6462m) abstractC6462m.getClass().newInstance();
            a aVar = new a();
            m5179a(aVar);
            if (aVar.f5627a == 10) {
                abstractC6462m2.mo5135a(this);
                m5176a();
                return abstractC6462m2;
            }
            throw new C6457h("type mismatch.");
        } catch (Exception e10) {
            throw new C6457h(e10.getMessage());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    public final <T> Object m5195a(T t10, int i10, boolean z9) {
        if (t10 instanceof Byte) {
            return Byte.valueOf(m5190a((byte) 0, i10, z9));
        }
        if (t10 instanceof Boolean) {
            return Boolean.valueOf(m5199a(i10, z9));
        }
        if (t10 instanceof Short) {
            return Short.valueOf(m5197a((short) 0, i10, z9));
        }
        if (t10 instanceof Integer) {
            return Integer.valueOf(m5191a(0, i10, z9));
        }
        if (t10 instanceof Long) {
            return Long.valueOf(m5193a(0L, i10, z9));
        }
        if (t10 instanceof Float) {
            return Float.valueOf(m5172a(0.0f, i10, z9));
        }
        if (t10 instanceof Double) {
            return Double.valueOf(m5171a(AudioStats.AUDIO_AMPLITUDE_NONE, i10, z9));
        }
        if (t10 instanceof String) {
            return String.valueOf(m5200b(i10, z9));
        }
        if (t10 instanceof Map) {
            return m5196a((Map) t10, i10, z9);
        }
        if (t10 instanceof List) {
            return m5174a((List) t10, i10, z9);
        }
        if (t10 instanceof AbstractC6462m) {
            return m5194a((AbstractC6462m) t10, i10, z9);
        }
        if (t10.getClass().isArray()) {
            if (!(t10 instanceof byte[]) && !(t10 instanceof Byte[])) {
                if (t10 instanceof boolean[]) {
                    return m5184d(i10, z9);
                }
                if (t10 instanceof short[]) {
                    return m5185e(i10, z9);
                }
                if (t10 instanceof int[]) {
                    return m5186f(i10, z9);
                }
                if (t10 instanceof long[]) {
                    return m5187g(i10, z9);
                }
                if (t10 instanceof float[]) {
                    return m5188h(i10, z9);
                }
                if (t10 instanceof double[]) {
                    return m5189i(i10, z9);
                }
                return m5180a((Object[]) t10, i10, z9);
            }
            return m5201c(i10, z9);
        }
        throw new C6457h("read object error: unsupport type.");
    }

    /* renamed from: a */
    public final int m5192a(String str) {
        this.f5625a = str;
        return 0;
    }
}
