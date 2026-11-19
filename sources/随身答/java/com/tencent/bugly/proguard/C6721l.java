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
public final class C6721l {

    /* renamed from: a */
    public ByteBuffer f6206a;

    /* renamed from: b */
    protected String f6207b;

    public C6721l(int i9) {
        this.f6207b = "GBK";
        this.f6206a = ByteBuffer.allocate(i9);
    }

    /* renamed from: a */
    private void m5383a(int i9) {
        if (this.f6206a.remaining() < i9) {
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate((this.f6206a.capacity() + i9) * 2);
            byteBufferAllocate.put(this.f6206a.array(), 0, this.f6206a.position());
            this.f6206a = byteBufferAllocate;
        }
    }

    /* renamed from: b */
    private void m5391b(byte b10, int i9) {
        if (i9 < 15) {
            this.f6206a.put((byte) (b10 | (i9 << 4)));
        } else {
            if (i9 >= 256) {
                throw new C6719j("tag is too large: ".concat(String.valueOf(i9)));
            }
            this.f6206a.put((byte) (b10 | 240));
            this.f6206a.put((byte) i9);
        }
    }

    public C6721l() {
        this(128);
    }

    /* renamed from: a */
    public final void m5402a(boolean z9, int i9) {
        m5393a(z9 ? (byte) 1 : (byte) 0, i9);
    }

    /* renamed from: a */
    public final void m5393a(byte b10, int i9) {
        m5383a(3);
        if (b10 == 0) {
            m5391b((byte) 12, i9);
        } else {
            m5391b((byte) 0, i9);
            this.f6206a.put(b10);
        }
    }

    /* renamed from: a */
    public final void m5401a(short s9, int i9) {
        m5383a(4);
        if (s9 >= -128 && s9 <= 127) {
            m5393a((byte) s9, i9);
        } else {
            m5391b((byte) 1, i9);
            this.f6206a.putShort(s9);
        }
    }

    /* renamed from: a */
    public final void m5394a(int i9, int i10) {
        m5383a(6);
        if (i9 >= -32768 && i9 <= 32767) {
            m5401a((short) i9, i10);
        } else {
            m5391b((byte) 2, i10);
            this.f6206a.putInt(i9);
        }
    }

    /* renamed from: a */
    public final void m5395a(long j9, int i9) {
        m5383a(10);
        if (j9 >= SieveCacheKt.NodeMetaAndPreviousMask && j9 <= SieveCacheKt.NodeLinkMask) {
            m5394a((int) j9, i9);
        } else {
            m5391b((byte) 3, i9);
            this.f6206a.putLong(j9);
        }
    }

    /* renamed from: a */
    private void m5382a(float f10, int i9) {
        m5383a(6);
        m5391b((byte) 4, i9);
        this.f6206a.putFloat(f10);
    }

    /* renamed from: a */
    private void m5381a(double d10, int i9) {
        m5383a(10);
        m5391b((byte) 5, i9);
        this.f6206a.putDouble(d10);
    }

    /* renamed from: a */
    public final void m5398a(String str, int i9) throws UnsupportedEncodingException {
        byte[] bytes;
        try {
            bytes = str.getBytes(this.f6207b);
        } catch (UnsupportedEncodingException unused) {
            bytes = str.getBytes();
        }
        m5383a(bytes.length + 10);
        if (bytes.length > 255) {
            m5391b((byte) 7, i9);
            this.f6206a.putInt(bytes.length);
            this.f6206a.put(bytes);
        } else {
            m5391b((byte) 6, i9);
            this.f6206a.put((byte) bytes.length);
            this.f6206a.put(bytes);
        }
    }

    /* renamed from: a */
    public final <K, V> void m5400a(Map<K, V> map, int i9) throws UnsupportedEncodingException {
        m5383a(8);
        m5391b((byte) 8, i9);
        m5394a(map == null ? 0 : map.size(), 0);
        if (map != null) {
            for (Map.Entry<K, V> entry : map.entrySet()) {
                m5397a(entry.getKey(), 0);
                m5397a(entry.getValue(), 1);
            }
        }
    }

    /* renamed from: a */
    private void m5390a(boolean[] zArr, int i9) {
        m5383a(8);
        m5391b((byte) 9, i9);
        m5394a(zArr.length, 0);
        for (boolean z9 : zArr) {
            m5402a(z9, 0);
        }
    }

    /* renamed from: a */
    public final void m5403a(byte[] bArr, int i9) {
        m5383a(bArr.length + 8);
        m5391b((byte) 13, i9);
        m5391b((byte) 0, 0);
        m5394a(bArr.length, 0);
        this.f6206a.put(bArr);
    }

    /* renamed from: a */
    private void m5389a(short[] sArr, int i9) {
        m5383a(8);
        m5391b((byte) 9, i9);
        m5394a(sArr.length, 0);
        for (short s9 : sArr) {
            m5401a(s9, 0);
        }
    }

    /* renamed from: a */
    private void m5386a(int[] iArr, int i9) {
        m5383a(8);
        m5391b((byte) 9, i9);
        m5394a(iArr.length, 0);
        for (int i10 : iArr) {
            m5394a(i10, 0);
        }
    }

    /* renamed from: a */
    private void m5387a(long[] jArr, int i9) {
        m5383a(8);
        m5391b((byte) 9, i9);
        m5394a(jArr.length, 0);
        for (long j9 : jArr) {
            m5395a(j9, 0);
        }
    }

    /* renamed from: a */
    private void m5385a(float[] fArr, int i9) {
        m5383a(8);
        m5391b((byte) 9, i9);
        m5394a(fArr.length, 0);
        for (float f10 : fArr) {
            m5382a(f10, 0);
        }
    }

    /* renamed from: a */
    private void m5384a(double[] dArr, int i9) {
        m5383a(8);
        m5391b((byte) 9, i9);
        m5394a(dArr.length, 0);
        for (double d10 : dArr) {
            m5381a(d10, 0);
        }
    }

    /* renamed from: a */
    private void m5388a(Object[] objArr, int i9) throws UnsupportedEncodingException {
        m5383a(8);
        m5391b((byte) 9, i9);
        m5394a(objArr.length, 0);
        for (Object obj : objArr) {
            m5397a(obj, 0);
        }
    }

    /* renamed from: a */
    public final <T> void m5399a(Collection<T> collection, int i9) throws UnsupportedEncodingException {
        m5383a(8);
        m5391b((byte) 9, i9);
        m5394a(collection == null ? 0 : collection.size(), 0);
        if (collection != null) {
            Iterator<T> it = collection.iterator();
            while (it.hasNext()) {
                m5397a(it.next(), 0);
            }
        }
    }

    /* renamed from: a */
    public final void m5396a(AbstractC6722m abstractC6722m, int i9) {
        m5383a(2);
        m5391b((byte) 10, i9);
        abstractC6722m.mo5315a(this);
        m5383a(2);
        m5391b((byte) 11, 0);
    }

    /* renamed from: a */
    public final void m5397a(Object obj, int i9) throws UnsupportedEncodingException {
        if (obj instanceof Byte) {
            m5393a(((Byte) obj).byteValue(), i9);
            return;
        }
        if (obj instanceof Boolean) {
            m5402a(((Boolean) obj).booleanValue(), i9);
            return;
        }
        if (obj instanceof Short) {
            m5401a(((Short) obj).shortValue(), i9);
            return;
        }
        if (obj instanceof Integer) {
            m5394a(((Integer) obj).intValue(), i9);
            return;
        }
        if (obj instanceof Long) {
            m5395a(((Long) obj).longValue(), i9);
            return;
        }
        if (obj instanceof Float) {
            m5382a(((Float) obj).floatValue(), i9);
            return;
        }
        if (obj instanceof Double) {
            m5381a(((Double) obj).doubleValue(), i9);
            return;
        }
        if (obj instanceof String) {
            m5398a((String) obj, i9);
            return;
        }
        if (obj instanceof Map) {
            m5400a((Map) obj, i9);
            return;
        }
        if (obj instanceof List) {
            m5399a((Collection) obj, i9);
            return;
        }
        if (obj instanceof AbstractC6722m) {
            m5396a((AbstractC6722m) obj, i9);
            return;
        }
        if (obj instanceof byte[]) {
            m5403a((byte[]) obj, i9);
            return;
        }
        if (obj instanceof boolean[]) {
            m5390a((boolean[]) obj, i9);
            return;
        }
        if (obj instanceof short[]) {
            m5389a((short[]) obj, i9);
            return;
        }
        if (obj instanceof int[]) {
            m5386a((int[]) obj, i9);
            return;
        }
        if (obj instanceof long[]) {
            m5387a((long[]) obj, i9);
            return;
        }
        if (obj instanceof float[]) {
            m5385a((float[]) obj, i9);
            return;
        }
        if (obj instanceof double[]) {
            m5384a((double[]) obj, i9);
            return;
        }
        if (obj.getClass().isArray()) {
            m5388a((Object[]) obj, i9);
        } else if (obj instanceof Collection) {
            m5399a((Collection) obj, i9);
        } else {
            throw new C6719j("write object error: unsupport type. " + obj.getClass());
        }
    }

    /* renamed from: a */
    public final int m5392a(String str) {
        this.f6207b = str;
        return 0;
    }
}
