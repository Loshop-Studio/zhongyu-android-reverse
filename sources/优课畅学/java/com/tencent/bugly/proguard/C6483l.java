package com.tencent.bugly.proguard;

import androidx.collection.SieveCacheKt;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: com.tencent.bugly.proguard.l */
/* loaded from: classes4.dex */
public final class C6483l {

    /* renamed from: a */
    public ByteBuffer f4972a;

    /* renamed from: b */
    protected String f4973b;

    public C6483l(int i10) {
        this.f4973b = "GBK";
        this.f4972a = ByteBuffer.allocate(i10);
    }

    /* renamed from: a */
    private void m4564a(int i10) {
        if (this.f4972a.remaining() < i10) {
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate((this.f4972a.capacity() + i10) * 2);
            byteBufferAllocate.put(this.f4972a.array(), 0, this.f4972a.position());
            this.f4972a = byteBufferAllocate;
        }
    }

    /* renamed from: b */
    private void m4572b(byte b10, int i10) {
        if (i10 < 15) {
            this.f4972a.put((byte) (b10 | (i10 << 4)));
        } else {
            if (i10 >= 256) {
                throw new C6481j("tag is too large: ".concat(String.valueOf(i10)));
            }
            this.f4972a.put((byte) (b10 | 240));
            this.f4972a.put((byte) i10);
        }
    }

    public C6483l() {
        this(128);
    }

    /* renamed from: a */
    public final void m4583a(boolean z10, int i10) {
        m4574a(z10 ? (byte) 1 : (byte) 0, i10);
    }

    /* renamed from: a */
    public final void m4574a(byte b10, int i10) {
        m4564a(3);
        if (b10 == 0) {
            m4572b((byte) 12, i10);
        } else {
            m4572b((byte) 0, i10);
            this.f4972a.put(b10);
        }
    }

    /* renamed from: a */
    public final void m4582a(short s10, int i10) {
        m4564a(4);
        if (s10 >= -128 && s10 <= 127) {
            m4574a((byte) s10, i10);
        } else {
            m4572b((byte) 1, i10);
            this.f4972a.putShort(s10);
        }
    }

    /* renamed from: a */
    public final void m4575a(int i10, int i11) {
        m4564a(6);
        if (i10 >= -32768 && i10 <= 32767) {
            m4582a((short) i10, i11);
        } else {
            m4572b((byte) 2, i11);
            this.f4972a.putInt(i10);
        }
    }

    /* renamed from: a */
    public final void m4576a(long j10, int i10) {
        m4564a(10);
        if (j10 >= SieveCacheKt.NodeMetaAndPreviousMask && j10 <= SieveCacheKt.NodeLinkMask) {
            m4575a((int) j10, i10);
        } else {
            m4572b((byte) 3, i10);
            this.f4972a.putLong(j10);
        }
    }

    /* renamed from: a */
    private void m4563a(float f10, int i10) {
        m4564a(6);
        m4572b((byte) 4, i10);
        this.f4972a.putFloat(f10);
    }

    /* renamed from: a */
    private void m4562a(double d10, int i10) {
        m4564a(10);
        m4572b((byte) 5, i10);
        this.f4972a.putDouble(d10);
    }

    /* renamed from: a */
    public final void m4579a(String str, int i10) throws UnsupportedEncodingException {
        byte[] bytes;
        try {
            bytes = str.getBytes(this.f4973b);
        } catch (UnsupportedEncodingException unused) {
            bytes = str.getBytes();
        }
        m4564a(bytes.length + 10);
        if (bytes.length > 255) {
            m4572b((byte) 7, i10);
            this.f4972a.putInt(bytes.length);
            this.f4972a.put(bytes);
        } else {
            m4572b((byte) 6, i10);
            this.f4972a.put((byte) bytes.length);
            this.f4972a.put(bytes);
        }
    }

    /* renamed from: a */
    public final <K, V> void m4581a(Map<K, V> map, int i10) throws UnsupportedEncodingException {
        m4564a(8);
        m4572b((byte) 8, i10);
        m4575a(map == null ? 0 : map.size(), 0);
        if (map != null) {
            for (Map.Entry<K, V> entry : map.entrySet()) {
                m4578a(entry.getKey(), 0);
                m4578a(entry.getValue(), 1);
            }
        }
    }

    /* renamed from: a */
    private void m4571a(boolean[] zArr, int i10) {
        m4564a(8);
        m4572b((byte) 9, i10);
        m4575a(zArr.length, 0);
        for (boolean z10 : zArr) {
            m4583a(z10, 0);
        }
    }

    /* renamed from: a */
    public final void m4584a(byte[] bArr, int i10) {
        m4564a(bArr.length + 8);
        m4572b((byte) 13, i10);
        m4572b((byte) 0, 0);
        m4575a(bArr.length, 0);
        this.f4972a.put(bArr);
    }

    /* renamed from: a */
    private void m4570a(short[] sArr, int i10) {
        m4564a(8);
        m4572b((byte) 9, i10);
        m4575a(sArr.length, 0);
        for (short s10 : sArr) {
            m4582a(s10, 0);
        }
    }

    /* renamed from: a */
    private void m4567a(int[] iArr, int i10) {
        m4564a(8);
        m4572b((byte) 9, i10);
        m4575a(iArr.length, 0);
        for (int i11 : iArr) {
            m4575a(i11, 0);
        }
    }

    /* renamed from: a */
    private void m4568a(long[] jArr, int i10) {
        m4564a(8);
        m4572b((byte) 9, i10);
        m4575a(jArr.length, 0);
        for (long j10 : jArr) {
            m4576a(j10, 0);
        }
    }

    /* renamed from: a */
    private void m4566a(float[] fArr, int i10) {
        m4564a(8);
        m4572b((byte) 9, i10);
        m4575a(fArr.length, 0);
        for (float f10 : fArr) {
            m4563a(f10, 0);
        }
    }

    /* renamed from: a */
    private void m4565a(double[] dArr, int i10) {
        m4564a(8);
        m4572b((byte) 9, i10);
        m4575a(dArr.length, 0);
        for (double d10 : dArr) {
            m4562a(d10, 0);
        }
    }

    /* renamed from: a */
    private void m4569a(Object[] objArr, int i10) throws UnsupportedEncodingException {
        m4564a(8);
        m4572b((byte) 9, i10);
        m4575a(objArr.length, 0);
        for (Object obj : objArr) {
            m4578a(obj, 0);
        }
    }

    /* renamed from: a */
    public final <T> void m4580a(Collection<T> collection, int i10) throws UnsupportedEncodingException {
        m4564a(8);
        m4572b((byte) 9, i10);
        m4575a(collection == null ? 0 : collection.size(), 0);
        if (collection != null) {
            Iterator<T> it = collection.iterator();
            while (it.hasNext()) {
                m4578a(it.next(), 0);
            }
        }
    }

    /* renamed from: a */
    public final void m4577a(AbstractC6484m abstractC6484m, int i10) {
        m4564a(2);
        m4572b((byte) 10, i10);
        abstractC6484m.mo4496a(this);
        m4564a(2);
        m4572b((byte) 11, 0);
    }

    /* renamed from: a */
    public final void m4578a(Object obj, int i10) throws UnsupportedEncodingException {
        if (obj instanceof Byte) {
            m4574a(((Byte) obj).byteValue(), i10);
            return;
        }
        if (obj instanceof Boolean) {
            m4583a(((Boolean) obj).booleanValue(), i10);
            return;
        }
        if (obj instanceof Short) {
            m4582a(((Short) obj).shortValue(), i10);
            return;
        }
        if (obj instanceof Integer) {
            m4575a(((Integer) obj).intValue(), i10);
            return;
        }
        if (obj instanceof Long) {
            m4576a(((Long) obj).longValue(), i10);
            return;
        }
        if (obj instanceof Float) {
            m4563a(((Float) obj).floatValue(), i10);
            return;
        }
        if (obj instanceof Double) {
            m4562a(((Double) obj).doubleValue(), i10);
            return;
        }
        if (obj instanceof String) {
            m4579a((String) obj, i10);
            return;
        }
        if (obj instanceof Map) {
            m4581a((Map) obj, i10);
            return;
        }
        if (obj instanceof List) {
            m4580a((Collection) obj, i10);
            return;
        }
        if (obj instanceof AbstractC6484m) {
            m4577a((AbstractC6484m) obj, i10);
            return;
        }
        if (obj instanceof byte[]) {
            m4584a((byte[]) obj, i10);
            return;
        }
        if (obj instanceof boolean[]) {
            m4571a((boolean[]) obj, i10);
            return;
        }
        if (obj instanceof short[]) {
            m4570a((short[]) obj, i10);
            return;
        }
        if (obj instanceof int[]) {
            m4567a((int[]) obj, i10);
            return;
        }
        if (obj instanceof long[]) {
            m4568a((long[]) obj, i10);
            return;
        }
        if (obj instanceof float[]) {
            m4566a((float[]) obj, i10);
            return;
        }
        if (obj instanceof double[]) {
            m4565a((double[]) obj, i10);
            return;
        }
        if (obj.getClass().isArray()) {
            m4569a((Object[]) obj, i10);
        } else if (obj instanceof Collection) {
            m4580a((Collection) obj, i10);
        } else {
            throw new C6481j("write object error: unsupport type. " + obj.getClass());
        }
    }

    /* renamed from: a */
    public final int m4573a(String str) {
        this.f4973b = str;
        return 0;
    }
}
