package com.tencent.bugly.proguard;

import android.support.v4.media.AbstractC0037f;
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
/* loaded from: classes3.dex */
public final class C4119k {

    /* renamed from: a */
    protected String f3844a = "GBK";

    /* renamed from: b */
    private ByteBuffer f3845b;

    /* renamed from: com.tencent.bugly.proguard.k$a */
    public static class a {

        /* renamed from: a */
        public byte f3846a;

        /* renamed from: b */
        public int f3847b;
    }

    public C4119k() {
    }

    /* renamed from: b */
    private boolean m3278b(int i) {
        int i8;
        try {
            a aVar = new a();
            while (true) {
                int iM3269a = m3269a(aVar, this.f3845b.duplicate());
                i8 = aVar.f3847b;
                if (i <= i8 || aVar.f3846a == 11) {
                    break;
                }
                m3274a(iM3269a);
                m3273a(aVar.f3846a);
            }
        } catch (C4110h | BufferUnderflowException unused) {
        }
        return i == i8;
    }

    /* renamed from: d */
    private boolean[] m3280d(int i, boolean z8) {
        if (!m3278b(i)) {
            if (z8) {
                throw new C4110h("require field not exist.");
            }
            return null;
        }
        a aVar = new a();
        m3275a(aVar);
        if (aVar.f3846a != 9) {
            throw new C4110h("type mismatch.");
        }
        int iM3287a = m3287a(0, 0, true);
        if (iM3287a < 0) {
            throw new C4110h("size invalid: ".concat(String.valueOf(iM3287a)));
        }
        boolean[] zArr = new boolean[iM3287a];
        for (int i8 = 0; i8 < iM3287a; i8++) {
            zArr[i8] = m3295a(0, true);
        }
        return zArr;
    }

    /* renamed from: e */
    private short[] m3281e(int i, boolean z8) {
        if (!m3278b(i)) {
            if (z8) {
                throw new C4110h("require field not exist.");
            }
            return null;
        }
        a aVar = new a();
        m3275a(aVar);
        if (aVar.f3846a != 9) {
            throw new C4110h("type mismatch.");
        }
        int iM3287a = m3287a(0, 0, true);
        if (iM3287a < 0) {
            throw new C4110h("size invalid: ".concat(String.valueOf(iM3287a)));
        }
        short[] sArr = new short[iM3287a];
        for (int i8 = 0; i8 < iM3287a; i8++) {
            sArr[i8] = m3293a(sArr[0], 0, true);
        }
        return sArr;
    }

    /* renamed from: f */
    private int[] m3282f(int i, boolean z8) {
        if (!m3278b(i)) {
            if (z8) {
                throw new C4110h("require field not exist.");
            }
            return null;
        }
        a aVar = new a();
        m3275a(aVar);
        if (aVar.f3846a != 9) {
            throw new C4110h("type mismatch.");
        }
        int iM3287a = m3287a(0, 0, true);
        if (iM3287a < 0) {
            throw new C4110h("size invalid: ".concat(String.valueOf(iM3287a)));
        }
        int[] iArr = new int[iM3287a];
        for (int i8 = 0; i8 < iM3287a; i8++) {
            iArr[i8] = m3287a(iArr[0], 0, true);
        }
        return iArr;
    }

    /* renamed from: g */
    private long[] m3283g(int i, boolean z8) {
        if (!m3278b(i)) {
            if (z8) {
                throw new C4110h("require field not exist.");
            }
            return null;
        }
        a aVar = new a();
        m3275a(aVar);
        if (aVar.f3846a != 9) {
            throw new C4110h("type mismatch.");
        }
        int iM3287a = m3287a(0, 0, true);
        if (iM3287a < 0) {
            throw new C4110h("size invalid: ".concat(String.valueOf(iM3287a)));
        }
        long[] jArr = new long[iM3287a];
        for (int i8 = 0; i8 < iM3287a; i8++) {
            jArr[i8] = m3289a(jArr[0], 0, true);
        }
        return jArr;
    }

    /* renamed from: h */
    private float[] m3284h(int i, boolean z8) {
        if (!m3278b(i)) {
            if (z8) {
                throw new C4110h("require field not exist.");
            }
            return null;
        }
        a aVar = new a();
        m3275a(aVar);
        if (aVar.f3846a != 9) {
            throw new C4110h("type mismatch.");
        }
        int iM3287a = m3287a(0, 0, true);
        if (iM3287a < 0) {
            throw new C4110h("size invalid: ".concat(String.valueOf(iM3287a)));
        }
        float[] fArr = new float[iM3287a];
        for (int i8 = 0; i8 < iM3287a; i8++) {
            fArr[i8] = m3268a(fArr[0], 0, true);
        }
        return fArr;
    }

    /* renamed from: i */
    private double[] m3285i(int i, boolean z8) {
        if (!m3278b(i)) {
            if (z8) {
                throw new C4110h("require field not exist.");
            }
            return null;
        }
        a aVar = new a();
        m3275a(aVar);
        if (aVar.f3846a != 9) {
            throw new C4110h("type mismatch.");
        }
        int iM3287a = m3287a(0, 0, true);
        if (iM3287a < 0) {
            throw new C4110h("size invalid: ".concat(String.valueOf(iM3287a)));
        }
        double[] dArr = new double[iM3287a];
        for (int i8 = 0; i8 < iM3287a; i8++) {
            dArr[i8] = m3267a(dArr[0], 0, true);
        }
        return dArr;
    }

    /* renamed from: a */
    public final void m3294a(byte[] bArr) {
        ByteBuffer byteBuffer = this.f3845b;
        if (byteBuffer != null) {
            byteBuffer.clear();
        }
        this.f3845b = ByteBuffer.wrap(bArr);
    }

    /* renamed from: c */
    public final byte[] m3297c(int i, boolean z8) {
        if (!m3278b(i)) {
            if (z8) {
                throw new C4110h("require field not exist.");
            }
            return null;
        }
        a aVar = new a();
        m3275a(aVar);
        byte b6 = aVar.f3846a;
        if (b6 == 9) {
            int iM3287a = m3287a(0, 0, true);
            if (iM3287a < 0) {
                throw new C4110h("size invalid: ".concat(String.valueOf(iM3287a)));
            }
            byte[] bArr = new byte[iM3287a];
            for (int i8 = 0; i8 < iM3287a; i8++) {
                bArr[i8] = m3286a(bArr[0], 0, true);
            }
            return bArr;
        }
        if (b6 != 13) {
            throw new C4110h("type mismatch.");
        }
        a aVar2 = new a();
        m3275a(aVar2);
        if (aVar2.f3846a != 0) {
            StringBuilder sbM94s = AbstractC0037f.m94s(i, "type mismatch, tag: ", ", type: ");
            sbM94s.append((int) aVar.f3846a);
            sbM94s.append(", ");
            sbM94s.append((int) aVar2.f3846a);
            throw new C4110h(sbM94s.toString());
        }
        int iM3287a2 = m3287a(0, 0, true);
        if (iM3287a2 >= 0) {
            byte[] bArr2 = new byte[iM3287a2];
            this.f3845b.get(bArr2);
            return bArr2;
        }
        StringBuilder sbM94s2 = AbstractC0037f.m94s(i, "invalid size, tag: ", ", type: ");
        sbM94s2.append((int) aVar.f3846a);
        sbM94s2.append(", ");
        sbM94s2.append((int) aVar2.f3846a);
        sbM94s2.append(", size: ");
        sbM94s2.append(iM3287a2);
        throw new C4110h(sbM94s2.toString());
    }

    public C4119k(byte[] bArr) {
        this.f3845b = ByteBuffer.wrap(bArr);
    }

    /* renamed from: a */
    private static int m3269a(a aVar, ByteBuffer byteBuffer) {
        byte b6 = byteBuffer.get();
        aVar.f3846a = (byte) (b6 & 15);
        int i = (b6 & 240) >> 4;
        aVar.f3847b = i;
        if (i != 15) {
            return 1;
        }
        aVar.f3847b = byteBuffer.get();
        return 2;
    }

    public C4119k(byte[] bArr, byte b6) {
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr);
        this.f3845b = byteBufferWrap;
        byteBufferWrap.position(4);
    }

    /* renamed from: b */
    private void m3277b() {
        a aVar = new a();
        m3275a(aVar);
        m3273a(aVar.f3846a);
    }

    /* renamed from: a */
    private void m3275a(a aVar) {
        m3269a(aVar, this.f3845b);
    }

    /* renamed from: a */
    private void m3274a(int i) {
        ByteBuffer byteBuffer = this.f3845b;
        byteBuffer.position(byteBuffer.position() + i);
    }

    /* renamed from: b */
    public final String m3296b(int i, boolean z8) {
        if (!m3278b(i)) {
            if (z8) {
                throw new C4110h("require field not exist.");
            }
            return null;
        }
        a aVar = new a();
        m3275a(aVar);
        byte b6 = aVar.f3846a;
        if (b6 == 6) {
            int i8 = this.f3845b.get();
            if (i8 < 0) {
                i8 += 256;
            }
            byte[] bArr = new byte[i8];
            this.f3845b.get(bArr);
            try {
                return new String(bArr, this.f3844a);
            } catch (UnsupportedEncodingException unused) {
                return new String(bArr);
            }
        }
        if (b6 == 7) {
            int i9 = this.f3845b.getInt();
            if (i9 <= 104857600 && i9 >= 0) {
                byte[] bArr2 = new byte[i9];
                this.f3845b.get(bArr2);
                try {
                    return new String(bArr2, this.f3844a);
                } catch (UnsupportedEncodingException unused2) {
                    return new String(bArr2);
                }
            }
            throw new C4110h("String too long: ".concat(String.valueOf(i9)));
        }
        throw new C4110h("type mismatch.");
    }

    /* renamed from: a */
    private void m3272a() {
        a aVar = new a();
        do {
            m3275a(aVar);
            m3273a(aVar.f3846a);
        } while (aVar.f3846a != 11);
    }

    /* renamed from: a */
    private void m3273a(byte b6) {
        int i = 0;
        switch (b6) {
            case 0:
                m3274a(1);
                return;
            case 1:
                m3274a(2);
                return;
            case 2:
                m3274a(4);
                return;
            case 3:
                m3274a(8);
                return;
            case 4:
                m3274a(4);
                return;
            case 5:
                m3274a(8);
                return;
            case 6:
                int i8 = this.f3845b.get();
                if (i8 < 0) {
                    i8 += 256;
                }
                m3274a(i8);
                return;
            case 7:
                m3274a(this.f3845b.getInt());
                return;
            case 8:
                int iM3287a = m3287a(0, 0, true);
                while (i < iM3287a * 2) {
                    m3277b();
                    i++;
                }
                return;
            case 9:
                int iM3287a2 = m3287a(0, 0, true);
                while (i < iM3287a2) {
                    m3277b();
                    i++;
                }
                return;
            case 10:
                m3272a();
                return;
            case 11:
            case 12:
                return;
            case 13:
                a aVar = new a();
                m3275a(aVar);
                if (aVar.f3846a == 0) {
                    m3274a(m3287a(0, 0, true));
                    return;
                } else {
                    StringBuilder sbM94s = AbstractC0037f.m94s(b6, "skipField with invalid type, type value: ", ", ");
                    sbM94s.append((int) aVar.f3846a);
                    throw new C4110h(sbM94s.toString());
                }
            default:
                throw new C4110h("invalid type.");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: b */
    private <T> T[] m3279b(T t8, int i, boolean z8) {
        if (!m3278b(i)) {
            if (z8) {
                throw new C4110h("require field not exist.");
            }
            return null;
        }
        a aVar = new a();
        m3275a(aVar);
        if (aVar.f3846a == 9) {
            int iM3287a = m3287a(0, 0, true);
            if (iM3287a >= 0) {
                T[] tArr = (T[]) ((Object[]) Array.newInstance(t8.getClass(), iM3287a));
                for (int i8 = 0; i8 < iM3287a; i8++) {
                    tArr[i8] = m3291a((C4119k) t8, 0, true);
                }
                return tArr;
            }
            throw new C4110h("size invalid: ".concat(String.valueOf(iM3287a)));
        }
        throw new C4110h("type mismatch.");
    }

    /* renamed from: a */
    public final boolean m3295a(int i, boolean z8) {
        return m3286a((byte) 0, i, z8) != 0;
    }

    /* renamed from: a */
    public final byte m3286a(byte b6, int i, boolean z8) {
        if (!m3278b(i)) {
            if (z8) {
                throw new C4110h("require field not exist.");
            }
            return b6;
        }
        a aVar = new a();
        m3275a(aVar);
        byte b9 = aVar.f3846a;
        if (b9 == 0) {
            return this.f3845b.get();
        }
        if (b9 == 12) {
            return (byte) 0;
        }
        throw new C4110h("type mismatch.");
    }

    /* renamed from: a */
    public final short m3293a(short s8, int i, boolean z8) {
        if (!m3278b(i)) {
            if (z8) {
                throw new C4110h("require field not exist.");
            }
            return s8;
        }
        a aVar = new a();
        m3275a(aVar);
        byte b6 = aVar.f3846a;
        if (b6 == 0) {
            return this.f3845b.get();
        }
        if (b6 == 1) {
            return this.f3845b.getShort();
        }
        if (b6 == 12) {
            return (short) 0;
        }
        throw new C4110h("type mismatch.");
    }

    /* renamed from: a */
    public final int m3287a(int i, int i8, boolean z8) {
        if (!m3278b(i8)) {
            if (z8) {
                throw new C4110h("require field not exist.");
            }
            return i;
        }
        a aVar = new a();
        m3275a(aVar);
        byte b6 = aVar.f3846a;
        if (b6 == 0) {
            return this.f3845b.get();
        }
        if (b6 == 1) {
            return this.f3845b.getShort();
        }
        if (b6 == 2) {
            return this.f3845b.getInt();
        }
        if (b6 == 12) {
            return 0;
        }
        throw new C4110h("type mismatch.");
    }

    /* renamed from: a */
    public final long m3289a(long j7, int i, boolean z8) {
        if (!m3278b(i)) {
            if (z8) {
                throw new C4110h("require field not exist.");
            }
            return j7;
        }
        a aVar = new a();
        m3275a(aVar);
        byte b6 = aVar.f3846a;
        if (b6 == 0) {
            return this.f3845b.get();
        }
        if (b6 == 1) {
            return this.f3845b.getShort();
        }
        if (b6 == 2) {
            return this.f3845b.getInt();
        }
        if (b6 == 3) {
            return this.f3845b.getLong();
        }
        if (b6 == 12) {
            return 0L;
        }
        throw new C4110h("type mismatch.");
    }

    /* renamed from: a */
    private float m3268a(float f, int i, boolean z8) {
        if (!m3278b(i)) {
            if (z8) {
                throw new C4110h("require field not exist.");
            }
            return f;
        }
        a aVar = new a();
        m3275a(aVar);
        byte b6 = aVar.f3846a;
        if (b6 == 4) {
            return this.f3845b.getFloat();
        }
        if (b6 == 12) {
            return 0.0f;
        }
        throw new C4110h("type mismatch.");
    }

    /* renamed from: a */
    private double m3267a(double d9, int i, boolean z8) {
        if (!m3278b(i)) {
            if (z8) {
                throw new C4110h("require field not exist.");
            }
            return d9;
        }
        a aVar = new a();
        m3275a(aVar);
        byte b6 = aVar.f3846a;
        if (b6 == 4) {
            return this.f3845b.getFloat();
        }
        if (b6 == 5) {
            return this.f3845b.getDouble();
        }
        if (b6 == 12) {
            return AudioStats.AUDIO_AMPLITUDE_NONE;
        }
        throw new C4110h("type mismatch.");
    }

    /* renamed from: a */
    public final <K, V> HashMap<K, V> m3292a(Map<K, V> map, int i, boolean z8) {
        return (HashMap) m3271a(new HashMap(), map, i, z8);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    private <K, V> Map<K, V> m3271a(Map<K, V> map, Map<K, V> map2, int i, boolean z8) {
        if (map2 != null && !map2.isEmpty()) {
            Map.Entry<K, V> next = map2.entrySet().iterator().next();
            K key = next.getKey();
            V value = next.getValue();
            if (m3278b(i)) {
                a aVar = new a();
                m3275a(aVar);
                if (aVar.f3846a == 8) {
                    int iM3287a = m3287a(0, 0, true);
                    if (iM3287a < 0) {
                        throw new C4110h("size invalid: ".concat(String.valueOf(iM3287a)));
                    }
                    for (int i8 = 0; i8 < iM3287a; i8++) {
                        map.put(m3291a((C4119k) key, 0, true), m3291a((C4119k) value, 1, true));
                    }
                } else {
                    throw new C4110h("type mismatch.");
                }
            } else if (z8) {
                throw new C4110h("require field not exist.");
            }
            return map;
        }
        return new HashMap();
    }

    /* renamed from: a */
    private <T> T[] m3276a(T[] tArr, int i, boolean z8) {
        if (tArr != null && tArr.length != 0) {
            return (T[]) m3279b(tArr[0], i, z8);
        }
        throw new C4110h("unable to get type of key and value.");
    }

    /* renamed from: a */
    private <T> List<T> m3270a(List<T> list, int i, boolean z8) {
        if (list != null && !list.isEmpty()) {
            Object[] objArrM3279b = m3279b(list.get(0), i, z8);
            if (objArrM3279b == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            for (Object obj : objArrM3279b) {
                arrayList.add(obj);
            }
            return arrayList;
        }
        return new ArrayList();
    }

    /* renamed from: a */
    public final AbstractC4123m m3290a(AbstractC4123m abstractC4123m, int i, boolean z8) {
        if (!m3278b(i)) {
            if (z8) {
                throw new C4110h("require field not exist.");
            }
            return null;
        }
        try {
            AbstractC4123m abstractC4123m2 = (AbstractC4123m) abstractC4123m.getClass().newInstance();
            a aVar = new a();
            m3275a(aVar);
            if (aVar.f3846a == 10) {
                abstractC4123m2.mo3232a(this);
                m3272a();
                return abstractC4123m2;
            }
            throw new C4110h("type mismatch.");
        } catch (Exception e) {
            throw new C4110h(e.getMessage());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    public final <T> Object m3291a(T t8, int i, boolean z8) {
        if (t8 instanceof Byte) {
            return Byte.valueOf(m3286a((byte) 0, i, z8));
        }
        if (t8 instanceof Boolean) {
            return Boolean.valueOf(m3295a(i, z8));
        }
        if (t8 instanceof Short) {
            return Short.valueOf(m3293a((short) 0, i, z8));
        }
        if (t8 instanceof Integer) {
            return Integer.valueOf(m3287a(0, i, z8));
        }
        if (t8 instanceof Long) {
            return Long.valueOf(m3289a(0L, i, z8));
        }
        if (t8 instanceof Float) {
            return Float.valueOf(m3268a(0.0f, i, z8));
        }
        if (t8 instanceof Double) {
            return Double.valueOf(m3267a(AudioStats.AUDIO_AMPLITUDE_NONE, i, z8));
        }
        if (t8 instanceof String) {
            return String.valueOf(m3296b(i, z8));
        }
        if (t8 instanceof Map) {
            return m3292a((Map) t8, i, z8);
        }
        if (t8 instanceof List) {
            return m3270a((List) t8, i, z8);
        }
        if (t8 instanceof AbstractC4123m) {
            return m3290a((AbstractC4123m) t8, i, z8);
        }
        if (t8.getClass().isArray()) {
            if (!(t8 instanceof byte[]) && !(t8 instanceof Byte[])) {
                if (t8 instanceof boolean[]) {
                    return m3280d(i, z8);
                }
                if (t8 instanceof short[]) {
                    return m3281e(i, z8);
                }
                if (t8 instanceof int[]) {
                    return m3282f(i, z8);
                }
                if (t8 instanceof long[]) {
                    return m3283g(i, z8);
                }
                if (t8 instanceof float[]) {
                    return m3284h(i, z8);
                }
                if (t8 instanceof double[]) {
                    return m3285i(i, z8);
                }
                return m3276a((Object[]) t8, i, z8);
            }
            return m3297c(i, z8);
        }
        throw new C4110h("read object error: unsupport type.");
    }

    /* renamed from: a */
    public final int m3288a(String str) {
        this.f3844a = str;
        return 0;
    }
}
