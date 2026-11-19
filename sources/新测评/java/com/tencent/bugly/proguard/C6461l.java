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
public final class C6461l {

    /* renamed from: a */
    public ByteBuffer f5629a;

    /* renamed from: b */
    protected String f5630b;

    public C6461l(int i10) {
        this.f5630b = "GBK";
        this.f5629a = ByteBuffer.allocate(i10);
    }

    /* renamed from: a */
    private void m5204a(int i10) {
        if (this.f5629a.remaining() < i10) {
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate((this.f5629a.capacity() + i10) * 2);
            byteBufferAllocate.put(this.f5629a.array(), 0, this.f5629a.position());
            this.f5629a = byteBufferAllocate;
        }
    }

    /* renamed from: b */
    private void m5212b(byte b10, int i10) {
        if (i10 < 15) {
            this.f5629a.put((byte) (b10 | (i10 << 4)));
        } else {
            if (i10 >= 256) {
                throw new C6459j("tag is too large: ".concat(String.valueOf(i10)));
            }
            this.f5629a.put((byte) (b10 | 240));
            this.f5629a.put((byte) i10);
        }
    }

    public C6461l() {
        this(128);
    }

    /* renamed from: a */
    public final void m5223a(boolean z9, int i10) {
        m5214a(z9 ? (byte) 1 : (byte) 0, i10);
    }

    /* renamed from: a */
    public final void m5214a(byte b10, int i10) {
        m5204a(3);
        if (b10 == 0) {
            m5212b((byte) 12, i10);
        } else {
            m5212b((byte) 0, i10);
            this.f5629a.put(b10);
        }
    }

    /* renamed from: a */
    public final void m5222a(short s10, int i10) {
        m5204a(4);
        if (s10 >= -128 && s10 <= 127) {
            m5214a((byte) s10, i10);
        } else {
            m5212b((byte) 1, i10);
            this.f5629a.putShort(s10);
        }
    }

    /* renamed from: a */
    public final void m5215a(int i10, int i11) {
        m5204a(6);
        if (i10 >= -32768 && i10 <= 32767) {
            m5222a((short) i10, i11);
        } else {
            m5212b((byte) 2, i11);
            this.f5629a.putInt(i10);
        }
    }

    /* renamed from: a */
    public final void m5216a(long j10, int i10) {
        m5204a(10);
        if (j10 >= SieveCacheKt.NodeMetaAndPreviousMask && j10 <= SieveCacheKt.NodeLinkMask) {
            m5215a((int) j10, i10);
        } else {
            m5212b((byte) 3, i10);
            this.f5629a.putLong(j10);
        }
    }

    /* renamed from: a */
    private void m5203a(float f10, int i10) {
        m5204a(6);
        m5212b((byte) 4, i10);
        this.f5629a.putFloat(f10);
    }

    /* renamed from: a */
    private void m5202a(double d10, int i10) {
        m5204a(10);
        m5212b((byte) 5, i10);
        this.f5629a.putDouble(d10);
    }

    /* renamed from: a */
    public final void m5219a(String str, int i10) throws UnsupportedEncodingException {
        byte[] bytes;
        try {
            bytes = str.getBytes(this.f5630b);
        } catch (UnsupportedEncodingException unused) {
            bytes = str.getBytes();
        }
        m5204a(bytes.length + 10);
        if (bytes.length > 255) {
            m5212b((byte) 7, i10);
            this.f5629a.putInt(bytes.length);
            this.f5629a.put(bytes);
        } else {
            m5212b((byte) 6, i10);
            this.f5629a.put((byte) bytes.length);
            this.f5629a.put(bytes);
        }
    }

    /* renamed from: a */
    public final <K, V> void m5221a(Map<K, V> map, int i10) throws UnsupportedEncodingException {
        m5204a(8);
        m5212b((byte) 8, i10);
        m5215a(map == null ? 0 : map.size(), 0);
        if (map != null) {
            for (Map.Entry<K, V> entry : map.entrySet()) {
                m5218a(entry.getKey(), 0);
                m5218a(entry.getValue(), 1);
            }
        }
    }

    /* renamed from: a */
    private void m5211a(boolean[] zArr, int i10) {
        m5204a(8);
        m5212b((byte) 9, i10);
        m5215a(zArr.length, 0);
        for (boolean z9 : zArr) {
            m5223a(z9, 0);
        }
    }

    /* renamed from: a */
    public final void m5224a(byte[] bArr, int i10) {
        m5204a(bArr.length + 8);
        m5212b((byte) 13, i10);
        m5212b((byte) 0, 0);
        m5215a(bArr.length, 0);
        this.f5629a.put(bArr);
    }

    /* renamed from: a */
    private void m5210a(short[] sArr, int i10) {
        m5204a(8);
        m5212b((byte) 9, i10);
        m5215a(sArr.length, 0);
        for (short s10 : sArr) {
            m5222a(s10, 0);
        }
    }

    /* renamed from: a */
    private void m5207a(int[] iArr, int i10) {
        m5204a(8);
        m5212b((byte) 9, i10);
        m5215a(iArr.length, 0);
        for (int i11 : iArr) {
            m5215a(i11, 0);
        }
    }

    /* renamed from: a */
    private void m5208a(long[] jArr, int i10) {
        m5204a(8);
        m5212b((byte) 9, i10);
        m5215a(jArr.length, 0);
        for (long j10 : jArr) {
            m5216a(j10, 0);
        }
    }

    /* renamed from: a */
    private void m5206a(float[] fArr, int i10) {
        m5204a(8);
        m5212b((byte) 9, i10);
        m5215a(fArr.length, 0);
        for (float f10 : fArr) {
            m5203a(f10, 0);
        }
    }

    /* renamed from: a */
    private void m5205a(double[] dArr, int i10) {
        m5204a(8);
        m5212b((byte) 9, i10);
        m5215a(dArr.length, 0);
        for (double d10 : dArr) {
            m5202a(d10, 0);
        }
    }

    /* renamed from: a */
    private void m5209a(Object[] objArr, int i10) throws UnsupportedEncodingException {
        m5204a(8);
        m5212b((byte) 9, i10);
        m5215a(objArr.length, 0);
        for (Object obj : objArr) {
            m5218a(obj, 0);
        }
    }

    /* renamed from: a */
    public final <T> void m5220a(Collection<T> collection, int i10) throws UnsupportedEncodingException {
        m5204a(8);
        m5212b((byte) 9, i10);
        m5215a(collection == null ? 0 : collection.size(), 0);
        if (collection != null) {
            Iterator<T> it = collection.iterator();
            while (it.hasNext()) {
                m5218a(it.next(), 0);
            }
        }
    }

    /* renamed from: a */
    public final void m5217a(AbstractC6462m abstractC6462m, int i10) {
        m5204a(2);
        m5212b((byte) 10, i10);
        abstractC6462m.mo5136a(this);
        m5204a(2);
        m5212b((byte) 11, 0);
    }

    /* renamed from: a */
    public final void m5218a(Object obj, int i10) throws UnsupportedEncodingException {
        if (obj instanceof Byte) {
            m5214a(((Byte) obj).byteValue(), i10);
            return;
        }
        if (obj instanceof Boolean) {
            m5223a(((Boolean) obj).booleanValue(), i10);
            return;
        }
        if (obj instanceof Short) {
            m5222a(((Short) obj).shortValue(), i10);
            return;
        }
        if (obj instanceof Integer) {
            m5215a(((Integer) obj).intValue(), i10);
            return;
        }
        if (obj instanceof Long) {
            m5216a(((Long) obj).longValue(), i10);
            return;
        }
        if (obj instanceof Float) {
            m5203a(((Float) obj).floatValue(), i10);
            return;
        }
        if (obj instanceof Double) {
            m5202a(((Double) obj).doubleValue(), i10);
            return;
        }
        if (obj instanceof String) {
            m5219a((String) obj, i10);
            return;
        }
        if (obj instanceof Map) {
            m5221a((Map) obj, i10);
            return;
        }
        if (obj instanceof List) {
            m5220a((Collection) obj, i10);
            return;
        }
        if (obj instanceof AbstractC6462m) {
            m5217a((AbstractC6462m) obj, i10);
            return;
        }
        if (obj instanceof byte[]) {
            m5224a((byte[]) obj, i10);
            return;
        }
        if (obj instanceof boolean[]) {
            m5211a((boolean[]) obj, i10);
            return;
        }
        if (obj instanceof short[]) {
            m5210a((short[]) obj, i10);
            return;
        }
        if (obj instanceof int[]) {
            m5207a((int[]) obj, i10);
            return;
        }
        if (obj instanceof long[]) {
            m5208a((long[]) obj, i10);
            return;
        }
        if (obj instanceof float[]) {
            m5206a((float[]) obj, i10);
            return;
        }
        if (obj instanceof double[]) {
            m5205a((double[]) obj, i10);
            return;
        }
        if (obj.getClass().isArray()) {
            m5209a((Object[]) obj, i10);
        } else if (obj instanceof Collection) {
            m5220a((Collection) obj, i10);
        } else {
            throw new C6459j("write object error: unsupport type. " + obj.getClass());
        }
    }

    /* renamed from: a */
    public final int m5213a(String str) {
        this.f5630b = str;
        return 0;
    }
}
