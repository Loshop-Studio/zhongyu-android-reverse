package com.tencent.bugly.proguard;

import androidx.collection.SieveCacheKt;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: com.tencent.bugly.proguard.l */
/* loaded from: classes3.dex */
public final class C4121l {

    /* renamed from: a */
    public ByteBuffer f3848a;

    /* renamed from: b */
    protected String f3849b;

    public C4121l(int i) {
        this.f3849b = "GBK";
        this.f3848a = ByteBuffer.allocate(i);
    }

    /* renamed from: a */
    private void m3300a(int i) {
        if (this.f3848a.remaining() < i) {
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate((this.f3848a.capacity() + i) * 2);
            byteBufferAllocate.put(this.f3848a.array(), 0, this.f3848a.position());
            this.f3848a = byteBufferAllocate;
        }
    }

    /* renamed from: b */
    private void m3308b(byte b6, int i) {
        if (i < 15) {
            this.f3848a.put((byte) (b6 | (i << 4)));
        } else {
            if (i >= 256) {
                throw new C4116j("tag is too large: ".concat(String.valueOf(i)));
            }
            this.f3848a.put((byte) (b6 | 240));
            this.f3848a.put((byte) i);
        }
    }

    public C4121l() {
        this(128);
    }

    /* renamed from: a */
    public final void m3319a(boolean z8, int i) {
        m3310a(z8 ? (byte) 1 : (byte) 0, i);
    }

    /* renamed from: a */
    public final void m3310a(byte b6, int i) {
        m3300a(3);
        if (b6 == 0) {
            m3308b((byte) 12, i);
        } else {
            m3308b((byte) 0, i);
            this.f3848a.put(b6);
        }
    }

    /* renamed from: a */
    public final void m3318a(short s8, int i) {
        m3300a(4);
        if (s8 >= -128 && s8 <= 127) {
            m3310a((byte) s8, i);
        } else {
            m3308b((byte) 1, i);
            this.f3848a.putShort(s8);
        }
    }

    /* renamed from: a */
    public final void m3311a(int i, int i8) {
        m3300a(6);
        if (i >= -32768 && i <= 32767) {
            m3318a((short) i, i8);
        } else {
            m3308b((byte) 2, i8);
            this.f3848a.putInt(i);
        }
    }

    /* renamed from: a */
    public final void m3312a(long j7, int i) {
        m3300a(10);
        if (j7 >= SieveCacheKt.NodeMetaAndPreviousMask && j7 <= SieveCacheKt.NodeLinkMask) {
            m3311a((int) j7, i);
        } else {
            m3308b((byte) 3, i);
            this.f3848a.putLong(j7);
        }
    }

    /* renamed from: a */
    private void m3299a(float f, int i) {
        m3300a(6);
        m3308b((byte) 4, i);
        this.f3848a.putFloat(f);
    }

    /* renamed from: a */
    private void m3298a(double d9, int i) {
        m3300a(10);
        m3308b((byte) 5, i);
        this.f3848a.putDouble(d9);
    }

    /* renamed from: a */
    public final void m3315a(String str, int i) throws UnsupportedEncodingException {
        byte[] bytes;
        try {
            bytes = str.getBytes(this.f3849b);
        } catch (UnsupportedEncodingException unused) {
            bytes = str.getBytes();
        }
        m3300a(bytes.length + 10);
        if (bytes.length > 255) {
            m3308b((byte) 7, i);
            this.f3848a.putInt(bytes.length);
            this.f3848a.put(bytes);
        } else {
            m3308b((byte) 6, i);
            this.f3848a.put((byte) bytes.length);
            this.f3848a.put(bytes);
        }
    }

    /* renamed from: a */
    public final <K, V> void m3317a(Map<K, V> map, int i) throws UnsupportedEncodingException {
        m3300a(8);
        m3308b((byte) 8, i);
        m3311a(map == null ? 0 : map.size(), 0);
        if (map != null) {
            for (Map.Entry<K, V> entry : map.entrySet()) {
                m3314a(entry.getKey(), 0);
                m3314a(entry.getValue(), 1);
            }
        }
    }

    /* renamed from: a */
    private void m3307a(boolean[] zArr, int i) {
        m3300a(8);
        m3308b((byte) 9, i);
        m3311a(zArr.length, 0);
        for (boolean z8 : zArr) {
            m3319a(z8, 0);
        }
    }

    /* renamed from: a */
    public final void m3320a(byte[] bArr, int i) {
        m3300a(bArr.length + 8);
        m3308b((byte) 13, i);
        m3308b((byte) 0, 0);
        m3311a(bArr.length, 0);
        this.f3848a.put(bArr);
    }

    /* renamed from: a */
    private void m3306a(short[] sArr, int i) {
        m3300a(8);
        m3308b((byte) 9, i);
        m3311a(sArr.length, 0);
        for (short s8 : sArr) {
            m3318a(s8, 0);
        }
    }

    /* renamed from: a */
    private void m3303a(int[] iArr, int i) {
        m3300a(8);
        m3308b((byte) 9, i);
        m3311a(iArr.length, 0);
        for (int i8 : iArr) {
            m3311a(i8, 0);
        }
    }

    /* renamed from: a */
    private void m3304a(long[] jArr, int i) {
        m3300a(8);
        m3308b((byte) 9, i);
        m3311a(jArr.length, 0);
        for (long j7 : jArr) {
            m3312a(j7, 0);
        }
    }

    /* renamed from: a */
    private void m3302a(float[] fArr, int i) {
        m3300a(8);
        m3308b((byte) 9, i);
        m3311a(fArr.length, 0);
        for (float f : fArr) {
            m3299a(f, 0);
        }
    }

    /* renamed from: a */
    private void m3301a(double[] dArr, int i) {
        m3300a(8);
        m3308b((byte) 9, i);
        m3311a(dArr.length, 0);
        for (double d9 : dArr) {
            m3298a(d9, 0);
        }
    }

    /* renamed from: a */
    private void m3305a(Object[] objArr, int i) throws UnsupportedEncodingException {
        m3300a(8);
        m3308b((byte) 9, i);
        m3311a(objArr.length, 0);
        for (Object obj : objArr) {
            m3314a(obj, 0);
        }
    }

    /* renamed from: a */
    public final <T> void m3316a(Collection<T> collection, int i) throws UnsupportedEncodingException {
        m3300a(8);
        m3308b((byte) 9, i);
        m3311a(collection == null ? 0 : collection.size(), 0);
        if (collection != null) {
            Iterator<T> it = collection.iterator();
            while (it.hasNext()) {
                m3314a(it.next(), 0);
            }
        }
    }

    /* renamed from: a */
    public final void m3313a(AbstractC4123m abstractC4123m, int i) {
        m3300a(2);
        m3308b((byte) 10, i);
        abstractC4123m.mo3233a(this);
        m3300a(2);
        m3308b((byte) 11, 0);
    }

    /* renamed from: a */
    public final void m3314a(Object obj, int i) throws UnsupportedEncodingException {
        if (obj instanceof Byte) {
            m3310a(((Byte) obj).byteValue(), i);
            return;
        }
        if (obj instanceof Boolean) {
            m3319a(((Boolean) obj).booleanValue(), i);
            return;
        }
        if (obj instanceof Short) {
            m3318a(((Short) obj).shortValue(), i);
            return;
        }
        if (obj instanceof Integer) {
            m3311a(((Integer) obj).intValue(), i);
            return;
        }
        if (obj instanceof Long) {
            m3312a(((Long) obj).longValue(), i);
            return;
        }
        if (obj instanceof Float) {
            m3299a(((Float) obj).floatValue(), i);
            return;
        }
        if (obj instanceof Double) {
            m3298a(((Double) obj).doubleValue(), i);
            return;
        }
        if (obj instanceof String) {
            m3315a((String) obj, i);
            return;
        }
        if (obj instanceof Map) {
            m3317a((Map) obj, i);
            return;
        }
        if (obj instanceof List) {
            m3316a((Collection) obj, i);
            return;
        }
        if (obj instanceof AbstractC4123m) {
            m3313a((AbstractC4123m) obj, i);
            return;
        }
        if (obj instanceof byte[]) {
            m3320a((byte[]) obj, i);
            return;
        }
        if (obj instanceof boolean[]) {
            m3307a((boolean[]) obj, i);
            return;
        }
        if (obj instanceof short[]) {
            m3306a((short[]) obj, i);
            return;
        }
        if (obj instanceof int[]) {
            m3303a((int[]) obj, i);
            return;
        }
        if (obj instanceof long[]) {
            m3304a((long[]) obj, i);
            return;
        }
        if (obj instanceof float[]) {
            m3302a((float[]) obj, i);
            return;
        }
        if (obj instanceof double[]) {
            m3301a((double[]) obj, i);
            return;
        }
        if (obj.getClass().isArray()) {
            m3305a((Object[]) obj, i);
        } else if (obj instanceof Collection) {
            m3316a((Collection) obj, i);
        } else {
            throw new C4116j("write object error: unsupport type. " + obj.getClass());
        }
    }

    /* renamed from: a */
    public final int m3309a(String str) {
        this.f3849b = str;
        return 0;
    }
}
