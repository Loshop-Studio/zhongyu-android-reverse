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
public final class C5838l {

    /* renamed from: a */
    public ByteBuffer f4350a;

    /* renamed from: b */
    protected String f4351b;

    public C5838l(int i6) {
        this.f4351b = "GBK";
        this.f4350a = ByteBuffer.allocate(i6);
    }

    /* renamed from: a */
    private void m4209a(int i6) {
        if (this.f4350a.remaining() < i6) {
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate((this.f4350a.capacity() + i6) * 2);
            byteBufferAllocate.put(this.f4350a.array(), 0, this.f4350a.position());
            this.f4350a = byteBufferAllocate;
        }
    }

    /* renamed from: b */
    private void m4217b(byte b7, int i6) {
        if (i6 < 15) {
            this.f4350a.put((byte) (b7 | (i6 << 4)));
        } else {
            if (i6 >= 256) {
                throw new C5836j("tag is too large: ".concat(String.valueOf(i6)));
            }
            this.f4350a.put((byte) (b7 | 240));
            this.f4350a.put((byte) i6);
        }
    }

    public C5838l() {
        this(128);
    }

    /* renamed from: a */
    public final void m4228a(boolean z6, int i6) {
        m4219a(z6 ? (byte) 1 : (byte) 0, i6);
    }

    /* renamed from: a */
    public final void m4219a(byte b7, int i6) {
        m4209a(3);
        if (b7 == 0) {
            m4217b((byte) 12, i6);
        } else {
            m4217b((byte) 0, i6);
            this.f4350a.put(b7);
        }
    }

    /* renamed from: a */
    public final void m4227a(short s6, int i6) {
        m4209a(4);
        if (s6 >= -128 && s6 <= 127) {
            m4219a((byte) s6, i6);
        } else {
            m4217b((byte) 1, i6);
            this.f4350a.putShort(s6);
        }
    }

    /* renamed from: a */
    public final void m4220a(int i6, int i7) {
        m4209a(6);
        if (i6 >= -32768 && i6 <= 32767) {
            m4227a((short) i6, i7);
        } else {
            m4217b((byte) 2, i7);
            this.f4350a.putInt(i6);
        }
    }

    /* renamed from: a */
    public final void m4221a(long j6, int i6) {
        m4209a(10);
        if (j6 >= SieveCacheKt.NodeMetaAndPreviousMask && j6 <= SieveCacheKt.NodeLinkMask) {
            m4220a((int) j6, i6);
        } else {
            m4217b((byte) 3, i6);
            this.f4350a.putLong(j6);
        }
    }

    /* renamed from: a */
    private void m4208a(float f6, int i6) {
        m4209a(6);
        m4217b((byte) 4, i6);
        this.f4350a.putFloat(f6);
    }

    /* renamed from: a */
    private void m4207a(double d6, int i6) {
        m4209a(10);
        m4217b((byte) 5, i6);
        this.f4350a.putDouble(d6);
    }

    /* renamed from: a */
    public final void m4224a(String str, int i6) throws UnsupportedEncodingException {
        byte[] bytes;
        try {
            bytes = str.getBytes(this.f4351b);
        } catch (UnsupportedEncodingException unused) {
            bytes = str.getBytes();
        }
        m4209a(bytes.length + 10);
        if (bytes.length > 255) {
            m4217b((byte) 7, i6);
            this.f4350a.putInt(bytes.length);
            this.f4350a.put(bytes);
        } else {
            m4217b((byte) 6, i6);
            this.f4350a.put((byte) bytes.length);
            this.f4350a.put(bytes);
        }
    }

    /* renamed from: a */
    public final <K, V> void m4226a(Map<K, V> map, int i6) throws UnsupportedEncodingException {
        m4209a(8);
        m4217b((byte) 8, i6);
        m4220a(map == null ? 0 : map.size(), 0);
        if (map != null) {
            for (Map.Entry<K, V> entry : map.entrySet()) {
                m4223a(entry.getKey(), 0);
                m4223a(entry.getValue(), 1);
            }
        }
    }

    /* renamed from: a */
    private void m4216a(boolean[] zArr, int i6) {
        m4209a(8);
        m4217b((byte) 9, i6);
        m4220a(zArr.length, 0);
        for (boolean z6 : zArr) {
            m4228a(z6, 0);
        }
    }

    /* renamed from: a */
    public final void m4229a(byte[] bArr, int i6) {
        m4209a(bArr.length + 8);
        m4217b((byte) 13, i6);
        m4217b((byte) 0, 0);
        m4220a(bArr.length, 0);
        this.f4350a.put(bArr);
    }

    /* renamed from: a */
    private void m4215a(short[] sArr, int i6) {
        m4209a(8);
        m4217b((byte) 9, i6);
        m4220a(sArr.length, 0);
        for (short s6 : sArr) {
            m4227a(s6, 0);
        }
    }

    /* renamed from: a */
    private void m4212a(int[] iArr, int i6) {
        m4209a(8);
        m4217b((byte) 9, i6);
        m4220a(iArr.length, 0);
        for (int i7 : iArr) {
            m4220a(i7, 0);
        }
    }

    /* renamed from: a */
    private void m4213a(long[] jArr, int i6) {
        m4209a(8);
        m4217b((byte) 9, i6);
        m4220a(jArr.length, 0);
        for (long j6 : jArr) {
            m4221a(j6, 0);
        }
    }

    /* renamed from: a */
    private void m4211a(float[] fArr, int i6) {
        m4209a(8);
        m4217b((byte) 9, i6);
        m4220a(fArr.length, 0);
        for (float f6 : fArr) {
            m4208a(f6, 0);
        }
    }

    /* renamed from: a */
    private void m4210a(double[] dArr, int i6) {
        m4209a(8);
        m4217b((byte) 9, i6);
        m4220a(dArr.length, 0);
        for (double d6 : dArr) {
            m4207a(d6, 0);
        }
    }

    /* renamed from: a */
    private void m4214a(Object[] objArr, int i6) throws UnsupportedEncodingException {
        m4209a(8);
        m4217b((byte) 9, i6);
        m4220a(objArr.length, 0);
        for (Object obj : objArr) {
            m4223a(obj, 0);
        }
    }

    /* renamed from: a */
    public final <T> void m4225a(Collection<T> collection, int i6) throws UnsupportedEncodingException {
        m4209a(8);
        m4217b((byte) 9, i6);
        m4220a(collection == null ? 0 : collection.size(), 0);
        if (collection != null) {
            Iterator<T> it = collection.iterator();
            while (it.hasNext()) {
                m4223a(it.next(), 0);
            }
        }
    }

    /* renamed from: a */
    public final void m4222a(AbstractC5839m abstractC5839m, int i6) {
        m4209a(2);
        m4217b((byte) 10, i6);
        abstractC5839m.mo4141a(this);
        m4209a(2);
        m4217b((byte) 11, 0);
    }

    /* renamed from: a */
    public final void m4223a(Object obj, int i6) throws UnsupportedEncodingException {
        if (obj instanceof Byte) {
            m4219a(((Byte) obj).byteValue(), i6);
            return;
        }
        if (obj instanceof Boolean) {
            m4228a(((Boolean) obj).booleanValue(), i6);
            return;
        }
        if (obj instanceof Short) {
            m4227a(((Short) obj).shortValue(), i6);
            return;
        }
        if (obj instanceof Integer) {
            m4220a(((Integer) obj).intValue(), i6);
            return;
        }
        if (obj instanceof Long) {
            m4221a(((Long) obj).longValue(), i6);
            return;
        }
        if (obj instanceof Float) {
            m4208a(((Float) obj).floatValue(), i6);
            return;
        }
        if (obj instanceof Double) {
            m4207a(((Double) obj).doubleValue(), i6);
            return;
        }
        if (obj instanceof String) {
            m4224a((String) obj, i6);
            return;
        }
        if (obj instanceof Map) {
            m4226a((Map) obj, i6);
            return;
        }
        if (obj instanceof List) {
            m4225a((Collection) obj, i6);
            return;
        }
        if (obj instanceof AbstractC5839m) {
            m4222a((AbstractC5839m) obj, i6);
            return;
        }
        if (obj instanceof byte[]) {
            m4229a((byte[]) obj, i6);
            return;
        }
        if (obj instanceof boolean[]) {
            m4216a((boolean[]) obj, i6);
            return;
        }
        if (obj instanceof short[]) {
            m4215a((short[]) obj, i6);
            return;
        }
        if (obj instanceof int[]) {
            m4212a((int[]) obj, i6);
            return;
        }
        if (obj instanceof long[]) {
            m4213a((long[]) obj, i6);
            return;
        }
        if (obj instanceof float[]) {
            m4211a((float[]) obj, i6);
            return;
        }
        if (obj instanceof double[]) {
            m4210a((double[]) obj, i6);
            return;
        }
        if (obj.getClass().isArray()) {
            m4214a((Object[]) obj, i6);
        } else if (obj instanceof Collection) {
            m4225a((Collection) obj, i6);
        } else {
            throw new C5836j("write object error: unsupport type. " + obj.getClass());
        }
    }

    /* renamed from: a */
    public final int m4218a(String str) {
        this.f4351b = str;
        return 0;
    }
}
