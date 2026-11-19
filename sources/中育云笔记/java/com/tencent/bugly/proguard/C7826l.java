package com.tencent.bugly.proguard;

import androidx.collection.SieveCacheKt;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.eclipse.paho.client.mqttv3.internal.wire.MqttWireMessage;

/* renamed from: com.tencent.bugly.proguard.l */
/* loaded from: classes5.dex */
public final class C7826l {

    /* renamed from: a */
    public ByteBuffer f14071a;

    /* renamed from: b */
    protected String f14072b;

    public C7826l(int i10) {
        this.f14072b = "GBK";
        this.f14071a = ByteBuffer.allocate(i10);
    }

    /* renamed from: a */
    private void m10894a(int i10) {
        if (this.f14071a.remaining() < i10) {
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate((this.f14071a.capacity() + i10) * 2);
            byteBufferAllocate.put(this.f14071a.array(), 0, this.f14071a.position());
            this.f14071a = byteBufferAllocate;
        }
    }

    /* renamed from: b */
    private void m10902b(byte b10, int i10) {
        if (i10 < 15) {
            this.f14071a.put((byte) (b10 | (i10 << 4)));
        } else {
            if (i10 >= 256) {
                throw new C7824j("tag is too large: ".concat(String.valueOf(i10)));
            }
            this.f14071a.put((byte) (b10 | 240));
            this.f14071a.put((byte) i10);
        }
    }

    public C7826l() {
        this(128);
    }

    /* renamed from: a */
    public final void m10913a(boolean z10, int i10) {
        m10904a(z10 ? (byte) 1 : (byte) 0, i10);
    }

    /* renamed from: a */
    public final void m10904a(byte b10, int i10) {
        m10894a(3);
        if (b10 == 0) {
            m10902b(MqttWireMessage.MESSAGE_TYPE_PINGREQ, i10);
        } else {
            m10902b((byte) 0, i10);
            this.f14071a.put(b10);
        }
    }

    /* renamed from: a */
    public final void m10912a(short s10, int i10) {
        m10894a(4);
        if (s10 >= -128 && s10 <= 127) {
            m10904a((byte) s10, i10);
        } else {
            m10902b((byte) 1, i10);
            this.f14071a.putShort(s10);
        }
    }

    /* renamed from: a */
    public final void m10905a(int i10, int i11) {
        m10894a(6);
        if (i10 >= -32768 && i10 <= 32767) {
            m10912a((short) i10, i11);
        } else {
            m10902b((byte) 2, i11);
            this.f14071a.putInt(i10);
        }
    }

    /* renamed from: a */
    public final void m10906a(long j10, int i10) {
        m10894a(10);
        if (j10 >= SieveCacheKt.NodeMetaAndPreviousMask && j10 <= SieveCacheKt.NodeLinkMask) {
            m10905a((int) j10, i10);
        } else {
            m10902b((byte) 3, i10);
            this.f14071a.putLong(j10);
        }
    }

    /* renamed from: a */
    private void m10893a(float f10, int i10) {
        m10894a(6);
        m10902b((byte) 4, i10);
        this.f14071a.putFloat(f10);
    }

    /* renamed from: a */
    private void m10892a(double d10, int i10) {
        m10894a(10);
        m10902b((byte) 5, i10);
        this.f14071a.putDouble(d10);
    }

    /* renamed from: a */
    public final void m10909a(String str, int i10) throws UnsupportedEncodingException {
        byte[] bytes;
        try {
            bytes = str.getBytes(this.f14072b);
        } catch (UnsupportedEncodingException unused) {
            bytes = str.getBytes();
        }
        m10894a(bytes.length + 10);
        if (bytes.length > 255) {
            m10902b((byte) 7, i10);
            this.f14071a.putInt(bytes.length);
            this.f14071a.put(bytes);
        } else {
            m10902b((byte) 6, i10);
            this.f14071a.put((byte) bytes.length);
            this.f14071a.put(bytes);
        }
    }

    /* renamed from: a */
    public final <K, V> void m10911a(Map<K, V> map, int i10) throws UnsupportedEncodingException {
        m10894a(8);
        m10902b((byte) 8, i10);
        m10905a(map == null ? 0 : map.size(), 0);
        if (map != null) {
            for (Map.Entry<K, V> entry : map.entrySet()) {
                m10908a(entry.getKey(), 0);
                m10908a(entry.getValue(), 1);
            }
        }
    }

    /* renamed from: a */
    private void m10901a(boolean[] zArr, int i10) {
        m10894a(8);
        m10902b((byte) 9, i10);
        m10905a(zArr.length, 0);
        for (boolean z10 : zArr) {
            m10913a(z10, 0);
        }
    }

    /* renamed from: a */
    public final void m10914a(byte[] bArr, int i10) {
        m10894a(bArr.length + 8);
        m10902b((byte) 13, i10);
        m10902b((byte) 0, 0);
        m10905a(bArr.length, 0);
        this.f14071a.put(bArr);
    }

    /* renamed from: a */
    private void m10900a(short[] sArr, int i10) {
        m10894a(8);
        m10902b((byte) 9, i10);
        m10905a(sArr.length, 0);
        for (short s10 : sArr) {
            m10912a(s10, 0);
        }
    }

    /* renamed from: a */
    private void m10897a(int[] iArr, int i10) {
        m10894a(8);
        m10902b((byte) 9, i10);
        m10905a(iArr.length, 0);
        for (int i11 : iArr) {
            m10905a(i11, 0);
        }
    }

    /* renamed from: a */
    private void m10898a(long[] jArr, int i10) {
        m10894a(8);
        m10902b((byte) 9, i10);
        m10905a(jArr.length, 0);
        for (long j10 : jArr) {
            m10906a(j10, 0);
        }
    }

    /* renamed from: a */
    private void m10896a(float[] fArr, int i10) {
        m10894a(8);
        m10902b((byte) 9, i10);
        m10905a(fArr.length, 0);
        for (float f10 : fArr) {
            m10893a(f10, 0);
        }
    }

    /* renamed from: a */
    private void m10895a(double[] dArr, int i10) {
        m10894a(8);
        m10902b((byte) 9, i10);
        m10905a(dArr.length, 0);
        for (double d10 : dArr) {
            m10892a(d10, 0);
        }
    }

    /* renamed from: a */
    private void m10899a(Object[] objArr, int i10) throws UnsupportedEncodingException {
        m10894a(8);
        m10902b((byte) 9, i10);
        m10905a(objArr.length, 0);
        for (Object obj : objArr) {
            m10908a(obj, 0);
        }
    }

    /* renamed from: a */
    public final <T> void m10910a(Collection<T> collection, int i10) throws UnsupportedEncodingException {
        m10894a(8);
        m10902b((byte) 9, i10);
        m10905a(collection == null ? 0 : collection.size(), 0);
        if (collection != null) {
            Iterator<T> it = collection.iterator();
            while (it.hasNext()) {
                m10908a(it.next(), 0);
            }
        }
    }

    /* renamed from: a */
    public final void m10907a(AbstractC7827m abstractC7827m, int i10) {
        m10894a(2);
        m10902b((byte) 10, i10);
        abstractC7827m.mo10826a(this);
        m10894a(2);
        m10902b(MqttWireMessage.MESSAGE_TYPE_UNSUBACK, 0);
    }

    /* renamed from: a */
    public final void m10908a(Object obj, int i10) throws UnsupportedEncodingException {
        if (obj instanceof Byte) {
            m10904a(((Byte) obj).byteValue(), i10);
            return;
        }
        if (obj instanceof Boolean) {
            m10913a(((Boolean) obj).booleanValue(), i10);
            return;
        }
        if (obj instanceof Short) {
            m10912a(((Short) obj).shortValue(), i10);
            return;
        }
        if (obj instanceof Integer) {
            m10905a(((Integer) obj).intValue(), i10);
            return;
        }
        if (obj instanceof Long) {
            m10906a(((Long) obj).longValue(), i10);
            return;
        }
        if (obj instanceof Float) {
            m10893a(((Float) obj).floatValue(), i10);
            return;
        }
        if (obj instanceof Double) {
            m10892a(((Double) obj).doubleValue(), i10);
            return;
        }
        if (obj instanceof String) {
            m10909a((String) obj, i10);
            return;
        }
        if (obj instanceof Map) {
            m10911a((Map) obj, i10);
            return;
        }
        if (obj instanceof List) {
            m10910a((Collection) obj, i10);
            return;
        }
        if (obj instanceof AbstractC7827m) {
            m10907a((AbstractC7827m) obj, i10);
            return;
        }
        if (obj instanceof byte[]) {
            m10914a((byte[]) obj, i10);
            return;
        }
        if (obj instanceof boolean[]) {
            m10901a((boolean[]) obj, i10);
            return;
        }
        if (obj instanceof short[]) {
            m10900a((short[]) obj, i10);
            return;
        }
        if (obj instanceof int[]) {
            m10897a((int[]) obj, i10);
            return;
        }
        if (obj instanceof long[]) {
            m10898a((long[]) obj, i10);
            return;
        }
        if (obj instanceof float[]) {
            m10896a((float[]) obj, i10);
            return;
        }
        if (obj instanceof double[]) {
            m10895a((double[]) obj, i10);
            return;
        }
        if (obj.getClass().isArray()) {
            m10899a((Object[]) obj, i10);
        } else if (obj instanceof Collection) {
            m10910a((Collection) obj, i10);
        } else {
            throw new C7824j("write object error: unsupport type. " + obj.getClass());
        }
    }

    /* renamed from: a */
    public final int m10903a(String str) {
        this.f14072b = str;
        return 0;
    }
}
