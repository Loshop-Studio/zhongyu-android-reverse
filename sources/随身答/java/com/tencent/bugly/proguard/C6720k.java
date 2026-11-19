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
public final class C6720k {

    /* renamed from: a */
    protected String f6202a = "GBK";

    /* renamed from: b */
    private ByteBuffer f6203b;

    /* renamed from: com.tencent.bugly.proguard.k$a */
    public static class a {

        /* renamed from: a */
        public byte f6204a;

        /* renamed from: b */
        public int f6205b;
    }

    public C6720k() {
    }

    /* renamed from: b */
    private boolean m5361b(int i9) {
        int i10;
        try {
            a aVar = new a();
            while (true) {
                int iM5352a = m5352a(aVar, this.f6203b.duplicate());
                i10 = aVar.f6205b;
                if (i9 <= i10 || aVar.f6204a == 11) {
                    break;
                }
                m5357a(iM5352a);
                m5356a(aVar.f6204a);
            }
        } catch (C6717h | BufferUnderflowException unused) {
        }
        return i9 == i10;
    }

    /* renamed from: d */
    private boolean[] m5363d(int i9, boolean z9) {
        if (!m5361b(i9)) {
            if (z9) {
                throw new C6717h("require field not exist.");
            }
            return null;
        }
        a aVar = new a();
        m5358a(aVar);
        if (aVar.f6204a != 9) {
            throw new C6717h("type mismatch.");
        }
        int iM5370a = m5370a(0, 0, true);
        if (iM5370a < 0) {
            throw new C6717h("size invalid: ".concat(String.valueOf(iM5370a)));
        }
        boolean[] zArr = new boolean[iM5370a];
        for (int i10 = 0; i10 < iM5370a; i10++) {
            zArr[i10] = m5378a(0, true);
        }
        return zArr;
    }

    /* renamed from: e */
    private short[] m5364e(int i9, boolean z9) {
        if (!m5361b(i9)) {
            if (z9) {
                throw new C6717h("require field not exist.");
            }
            return null;
        }
        a aVar = new a();
        m5358a(aVar);
        if (aVar.f6204a != 9) {
            throw new C6717h("type mismatch.");
        }
        int iM5370a = m5370a(0, 0, true);
        if (iM5370a < 0) {
            throw new C6717h("size invalid: ".concat(String.valueOf(iM5370a)));
        }
        short[] sArr = new short[iM5370a];
        for (int i10 = 0; i10 < iM5370a; i10++) {
            sArr[i10] = m5376a(sArr[0], 0, true);
        }
        return sArr;
    }

    /* renamed from: f */
    private int[] m5365f(int i9, boolean z9) {
        if (!m5361b(i9)) {
            if (z9) {
                throw new C6717h("require field not exist.");
            }
            return null;
        }
        a aVar = new a();
        m5358a(aVar);
        if (aVar.f6204a != 9) {
            throw new C6717h("type mismatch.");
        }
        int iM5370a = m5370a(0, 0, true);
        if (iM5370a < 0) {
            throw new C6717h("size invalid: ".concat(String.valueOf(iM5370a)));
        }
        int[] iArr = new int[iM5370a];
        for (int i10 = 0; i10 < iM5370a; i10++) {
            iArr[i10] = m5370a(iArr[0], 0, true);
        }
        return iArr;
    }

    /* renamed from: g */
    private long[] m5366g(int i9, boolean z9) {
        if (!m5361b(i9)) {
            if (z9) {
                throw new C6717h("require field not exist.");
            }
            return null;
        }
        a aVar = new a();
        m5358a(aVar);
        if (aVar.f6204a != 9) {
            throw new C6717h("type mismatch.");
        }
        int iM5370a = m5370a(0, 0, true);
        if (iM5370a < 0) {
            throw new C6717h("size invalid: ".concat(String.valueOf(iM5370a)));
        }
        long[] jArr = new long[iM5370a];
        for (int i10 = 0; i10 < iM5370a; i10++) {
            jArr[i10] = m5372a(jArr[0], 0, true);
        }
        return jArr;
    }

    /* renamed from: h */
    private float[] m5367h(int i9, boolean z9) {
        if (!m5361b(i9)) {
            if (z9) {
                throw new C6717h("require field not exist.");
            }
            return null;
        }
        a aVar = new a();
        m5358a(aVar);
        if (aVar.f6204a != 9) {
            throw new C6717h("type mismatch.");
        }
        int iM5370a = m5370a(0, 0, true);
        if (iM5370a < 0) {
            throw new C6717h("size invalid: ".concat(String.valueOf(iM5370a)));
        }
        float[] fArr = new float[iM5370a];
        for (int i10 = 0; i10 < iM5370a; i10++) {
            fArr[i10] = m5351a(fArr[0], 0, true);
        }
        return fArr;
    }

    /* renamed from: i */
    private double[] m5368i(int i9, boolean z9) {
        if (!m5361b(i9)) {
            if (z9) {
                throw new C6717h("require field not exist.");
            }
            return null;
        }
        a aVar = new a();
        m5358a(aVar);
        if (aVar.f6204a != 9) {
            throw new C6717h("type mismatch.");
        }
        int iM5370a = m5370a(0, 0, true);
        if (iM5370a < 0) {
            throw new C6717h("size invalid: ".concat(String.valueOf(iM5370a)));
        }
        double[] dArr = new double[iM5370a];
        for (int i10 = 0; i10 < iM5370a; i10++) {
            dArr[i10] = m5350a(dArr[0], 0, true);
        }
        return dArr;
    }

    /* renamed from: a */
    public final void m5377a(byte[] bArr) {
        ByteBuffer byteBuffer = this.f6203b;
        if (byteBuffer != null) {
            byteBuffer.clear();
        }
        this.f6203b = ByteBuffer.wrap(bArr);
    }

    /* renamed from: c */
    public final byte[] m5380c(int i9, boolean z9) {
        if (!m5361b(i9)) {
            if (z9) {
                throw new C6717h("require field not exist.");
            }
            return null;
        }
        a aVar = new a();
        m5358a(aVar);
        byte b10 = aVar.f6204a;
        if (b10 == 9) {
            int iM5370a = m5370a(0, 0, true);
            if (iM5370a < 0) {
                throw new C6717h("size invalid: ".concat(String.valueOf(iM5370a)));
            }
            byte[] bArr = new byte[iM5370a];
            for (int i10 = 0; i10 < iM5370a; i10++) {
                bArr[i10] = m5369a(bArr[0], 0, true);
            }
            return bArr;
        }
        if (b10 != 13) {
            throw new C6717h("type mismatch.");
        }
        a aVar2 = new a();
        m5358a(aVar2);
        if (aVar2.f6204a != 0) {
            throw new C6717h("type mismatch, tag: " + i9 + ", type: " + ((int) aVar.f6204a) + ", " + ((int) aVar2.f6204a));
        }
        int iM5370a2 = m5370a(0, 0, true);
        if (iM5370a2 >= 0) {
            byte[] bArr2 = new byte[iM5370a2];
            this.f6203b.get(bArr2);
            return bArr2;
        }
        throw new C6717h("invalid size, tag: " + i9 + ", type: " + ((int) aVar.f6204a) + ", " + ((int) aVar2.f6204a) + ", size: " + iM5370a2);
    }

    public C6720k(byte[] bArr) {
        this.f6203b = ByteBuffer.wrap(bArr);
    }

    /* renamed from: a */
    private static int m5352a(a aVar, ByteBuffer byteBuffer) {
        byte b10 = byteBuffer.get();
        aVar.f6204a = (byte) (b10 & 15);
        int i9 = (b10 & 240) >> 4;
        aVar.f6205b = i9;
        if (i9 != 15) {
            return 1;
        }
        aVar.f6205b = byteBuffer.get();
        return 2;
    }

    public C6720k(byte[] bArr, byte b10) {
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr);
        this.f6203b = byteBufferWrap;
        byteBufferWrap.position(4);
    }

    /* renamed from: b */
    private void m5360b() {
        a aVar = new a();
        m5358a(aVar);
        m5356a(aVar.f6204a);
    }

    /* renamed from: a */
    private void m5358a(a aVar) {
        m5352a(aVar, this.f6203b);
    }

    /* renamed from: a */
    private void m5357a(int i9) {
        ByteBuffer byteBuffer = this.f6203b;
        byteBuffer.position(byteBuffer.position() + i9);
    }

    /* renamed from: b */
    public final String m5379b(int i9, boolean z9) {
        if (!m5361b(i9)) {
            if (z9) {
                throw new C6717h("require field not exist.");
            }
            return null;
        }
        a aVar = new a();
        m5358a(aVar);
        byte b10 = aVar.f6204a;
        if (b10 == 6) {
            int i10 = this.f6203b.get();
            if (i10 < 0) {
                i10 += 256;
            }
            byte[] bArr = new byte[i10];
            this.f6203b.get(bArr);
            try {
                return new String(bArr, this.f6202a);
            } catch (UnsupportedEncodingException unused) {
                return new String(bArr);
            }
        }
        if (b10 == 7) {
            int i11 = this.f6203b.getInt();
            if (i11 <= 104857600 && i11 >= 0) {
                byte[] bArr2 = new byte[i11];
                this.f6203b.get(bArr2);
                try {
                    return new String(bArr2, this.f6202a);
                } catch (UnsupportedEncodingException unused2) {
                    return new String(bArr2);
                }
            }
            throw new C6717h("String too long: ".concat(String.valueOf(i11)));
        }
        throw new C6717h("type mismatch.");
    }

    /* renamed from: a */
    private void m5355a() {
        a aVar = new a();
        do {
            m5358a(aVar);
            m5356a(aVar.f6204a);
        } while (aVar.f6204a != 11);
    }

    /* renamed from: a */
    private void m5356a(byte b10) {
        int i9 = 0;
        switch (b10) {
            case 0:
                m5357a(1);
                return;
            case 1:
                m5357a(2);
                return;
            case 2:
                m5357a(4);
                return;
            case 3:
                m5357a(8);
                return;
            case 4:
                m5357a(4);
                return;
            case 5:
                m5357a(8);
                return;
            case 6:
                int i10 = this.f6203b.get();
                if (i10 < 0) {
                    i10 += 256;
                }
                m5357a(i10);
                return;
            case 7:
                m5357a(this.f6203b.getInt());
                return;
            case 8:
                int iM5370a = m5370a(0, 0, true);
                while (i9 < iM5370a * 2) {
                    m5360b();
                    i9++;
                }
                return;
            case 9:
                int iM5370a2 = m5370a(0, 0, true);
                while (i9 < iM5370a2) {
                    m5360b();
                    i9++;
                }
                return;
            case 10:
                m5355a();
                return;
            case 11:
            case 12:
                return;
            case 13:
                a aVar = new a();
                m5358a(aVar);
                if (aVar.f6204a == 0) {
                    m5357a(m5370a(0, 0, true));
                    return;
                }
                throw new C6717h("skipField with invalid type, type value: " + ((int) b10) + ", " + ((int) aVar.f6204a));
            default:
                throw new C6717h("invalid type.");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: b */
    private <T> T[] m5362b(T t9, int i9, boolean z9) {
        if (!m5361b(i9)) {
            if (z9) {
                throw new C6717h("require field not exist.");
            }
            return null;
        }
        a aVar = new a();
        m5358a(aVar);
        if (aVar.f6204a == 9) {
            int iM5370a = m5370a(0, 0, true);
            if (iM5370a >= 0) {
                T[] tArr = (T[]) ((Object[]) Array.newInstance(t9.getClass(), iM5370a));
                for (int i10 = 0; i10 < iM5370a; i10++) {
                    tArr[i10] = m5374a((C6720k) t9, 0, true);
                }
                return tArr;
            }
            throw new C6717h("size invalid: ".concat(String.valueOf(iM5370a)));
        }
        throw new C6717h("type mismatch.");
    }

    /* renamed from: a */
    public final boolean m5378a(int i9, boolean z9) {
        return m5369a((byte) 0, i9, z9) != 0;
    }

    /* renamed from: a */
    public final byte m5369a(byte b10, int i9, boolean z9) {
        if (!m5361b(i9)) {
            if (z9) {
                throw new C6717h("require field not exist.");
            }
            return b10;
        }
        a aVar = new a();
        m5358a(aVar);
        byte b11 = aVar.f6204a;
        if (b11 == 0) {
            return this.f6203b.get();
        }
        if (b11 == 12) {
            return (byte) 0;
        }
        throw new C6717h("type mismatch.");
    }

    /* renamed from: a */
    public final short m5376a(short s9, int i9, boolean z9) {
        if (!m5361b(i9)) {
            if (z9) {
                throw new C6717h("require field not exist.");
            }
            return s9;
        }
        a aVar = new a();
        m5358a(aVar);
        byte b10 = aVar.f6204a;
        if (b10 == 0) {
            return this.f6203b.get();
        }
        if (b10 == 1) {
            return this.f6203b.getShort();
        }
        if (b10 == 12) {
            return (short) 0;
        }
        throw new C6717h("type mismatch.");
    }

    /* renamed from: a */
    public final int m5370a(int i9, int i10, boolean z9) {
        if (!m5361b(i10)) {
            if (z9) {
                throw new C6717h("require field not exist.");
            }
            return i9;
        }
        a aVar = new a();
        m5358a(aVar);
        byte b10 = aVar.f6204a;
        if (b10 == 0) {
            return this.f6203b.get();
        }
        if (b10 == 1) {
            return this.f6203b.getShort();
        }
        if (b10 == 2) {
            return this.f6203b.getInt();
        }
        if (b10 == 12) {
            return 0;
        }
        throw new C6717h("type mismatch.");
    }

    /* renamed from: a */
    public final long m5372a(long j9, int i9, boolean z9) {
        if (!m5361b(i9)) {
            if (z9) {
                throw new C6717h("require field not exist.");
            }
            return j9;
        }
        a aVar = new a();
        m5358a(aVar);
        byte b10 = aVar.f6204a;
        if (b10 == 0) {
            return this.f6203b.get();
        }
        if (b10 == 1) {
            return this.f6203b.getShort();
        }
        if (b10 == 2) {
            return this.f6203b.getInt();
        }
        if (b10 == 3) {
            return this.f6203b.getLong();
        }
        if (b10 == 12) {
            return 0L;
        }
        throw new C6717h("type mismatch.");
    }

    /* renamed from: a */
    private float m5351a(float f10, int i9, boolean z9) {
        if (!m5361b(i9)) {
            if (z9) {
                throw new C6717h("require field not exist.");
            }
            return f10;
        }
        a aVar = new a();
        m5358a(aVar);
        byte b10 = aVar.f6204a;
        if (b10 == 4) {
            return this.f6203b.getFloat();
        }
        if (b10 == 12) {
            return 0.0f;
        }
        throw new C6717h("type mismatch.");
    }

    /* renamed from: a */
    private double m5350a(double d10, int i9, boolean z9) {
        if (!m5361b(i9)) {
            if (z9) {
                throw new C6717h("require field not exist.");
            }
            return d10;
        }
        a aVar = new a();
        m5358a(aVar);
        byte b10 = aVar.f6204a;
        if (b10 == 4) {
            return this.f6203b.getFloat();
        }
        if (b10 == 5) {
            return this.f6203b.getDouble();
        }
        if (b10 == 12) {
            return AudioStats.AUDIO_AMPLITUDE_NONE;
        }
        throw new C6717h("type mismatch.");
    }

    /* renamed from: a */
    public final <K, V> HashMap<K, V> m5375a(Map<K, V> map, int i9, boolean z9) {
        return (HashMap) m5354a(new HashMap(), map, i9, z9);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    private <K, V> Map<K, V> m5354a(Map<K, V> map, Map<K, V> map2, int i9, boolean z9) {
        if (map2 != null && !map2.isEmpty()) {
            Map.Entry<K, V> next = map2.entrySet().iterator().next();
            K key = next.getKey();
            V value = next.getValue();
            if (m5361b(i9)) {
                a aVar = new a();
                m5358a(aVar);
                if (aVar.f6204a == 8) {
                    int iM5370a = m5370a(0, 0, true);
                    if (iM5370a < 0) {
                        throw new C6717h("size invalid: ".concat(String.valueOf(iM5370a)));
                    }
                    for (int i10 = 0; i10 < iM5370a; i10++) {
                        map.put(m5374a((C6720k) key, 0, true), m5374a((C6720k) value, 1, true));
                    }
                } else {
                    throw new C6717h("type mismatch.");
                }
            } else if (z9) {
                throw new C6717h("require field not exist.");
            }
            return map;
        }
        return new HashMap();
    }

    /* renamed from: a */
    private <T> T[] m5359a(T[] tArr, int i9, boolean z9) {
        if (tArr != null && tArr.length != 0) {
            return (T[]) m5362b(tArr[0], i9, z9);
        }
        throw new C6717h("unable to get type of key and value.");
    }

    /* renamed from: a */
    private <T> List<T> m5353a(List<T> list, int i9, boolean z9) {
        if (list != null && !list.isEmpty()) {
            Object[] objArrM5362b = m5362b(list.get(0), i9, z9);
            if (objArrM5362b == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            for (Object obj : objArrM5362b) {
                arrayList.add(obj);
            }
            return arrayList;
        }
        return new ArrayList();
    }

    /* renamed from: a */
    public final AbstractC6722m m5373a(AbstractC6722m abstractC6722m, int i9, boolean z9) {
        if (!m5361b(i9)) {
            if (z9) {
                throw new C6717h("require field not exist.");
            }
            return null;
        }
        try {
            AbstractC6722m abstractC6722m2 = (AbstractC6722m) abstractC6722m.getClass().newInstance();
            a aVar = new a();
            m5358a(aVar);
            if (aVar.f6204a == 10) {
                abstractC6722m2.mo5314a(this);
                m5355a();
                return abstractC6722m2;
            }
            throw new C6717h("type mismatch.");
        } catch (Exception e10) {
            throw new C6717h(e10.getMessage());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    public final <T> Object m5374a(T t9, int i9, boolean z9) {
        if (t9 instanceof Byte) {
            return Byte.valueOf(m5369a((byte) 0, i9, z9));
        }
        if (t9 instanceof Boolean) {
            return Boolean.valueOf(m5378a(i9, z9));
        }
        if (t9 instanceof Short) {
            return Short.valueOf(m5376a((short) 0, i9, z9));
        }
        if (t9 instanceof Integer) {
            return Integer.valueOf(m5370a(0, i9, z9));
        }
        if (t9 instanceof Long) {
            return Long.valueOf(m5372a(0L, i9, z9));
        }
        if (t9 instanceof Float) {
            return Float.valueOf(m5351a(0.0f, i9, z9));
        }
        if (t9 instanceof Double) {
            return Double.valueOf(m5350a(AudioStats.AUDIO_AMPLITUDE_NONE, i9, z9));
        }
        if (t9 instanceof String) {
            return String.valueOf(m5379b(i9, z9));
        }
        if (t9 instanceof Map) {
            return m5375a((Map) t9, i9, z9);
        }
        if (t9 instanceof List) {
            return m5353a((List) t9, i9, z9);
        }
        if (t9 instanceof AbstractC6722m) {
            return m5373a((AbstractC6722m) t9, i9, z9);
        }
        if (t9.getClass().isArray()) {
            if (!(t9 instanceof byte[]) && !(t9 instanceof Byte[])) {
                if (t9 instanceof boolean[]) {
                    return m5363d(i9, z9);
                }
                if (t9 instanceof short[]) {
                    return m5364e(i9, z9);
                }
                if (t9 instanceof int[]) {
                    return m5365f(i9, z9);
                }
                if (t9 instanceof long[]) {
                    return m5366g(i9, z9);
                }
                if (t9 instanceof float[]) {
                    return m5367h(i9, z9);
                }
                if (t9 instanceof double[]) {
                    return m5368i(i9, z9);
                }
                return m5359a((Object[]) t9, i9, z9);
            }
            return m5380c(i9, z9);
        }
        throw new C6717h("read object error: unsupport type.");
    }

    /* renamed from: a */
    public final int m5371a(String str) {
        this.f6202a = str;
        return 0;
    }
}
