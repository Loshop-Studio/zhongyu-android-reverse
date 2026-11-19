package org.tensorflow.lite;

import java.lang.reflect.Array;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import java.nio.LongBuffer;
import java.util.Arrays;

/* loaded from: classes6.dex */
public final class Tensor {

    /* renamed from: a */
    public long f25541a;

    /* renamed from: b */
    public final DataType f25542b;

    /* renamed from: c */
    public int[] f25543c;

    /* renamed from: d */
    public final int[] f25544d;

    /* renamed from: e */
    public final C10586a f25545e;

    /* renamed from: org.tensorflow.lite.Tensor$a */
    public static class C10586a {

        /* renamed from: a */
        public final float f25546a;

        /* renamed from: b */
        public final int f25547b;

        public C10586a(float f10, int i10) {
            this.f25546a = f10;
            this.f25547b = i10;
        }
    }

    public Tensor(long j10) {
        this.f25541a = j10;
        this.f25542b = DataType.m22369c(dtype(j10));
        this.f25543c = shape(j10);
        this.f25544d = shapeSignature(j10);
        this.f25545e = new C10586a(quantizationScale(j10), quantizationZeroPoint(j10));
    }

    private static native ByteBuffer buffer(long j10);

    /* renamed from: c */
    public static int m22380c(Object obj) {
        if (obj == null || !obj.getClass().isArray()) {
            return 0;
        }
        if (Array.getLength(obj) != 0) {
            return m22380c(Array.get(obj, 0)) + 1;
        }
        throw new IllegalArgumentException("Array lengths cannot be 0.");
    }

    private static native long create(long j10, int i10);

    private static native void delete(long j10);

    private static native int dtype(long j10);

    /* renamed from: h */
    public static void m22381h(Object obj, int i10, int[] iArr) {
        if (iArr == null || i10 == iArr.length) {
            return;
        }
        int length = Array.getLength(obj);
        int i11 = iArr[i10];
        if (i11 == 0) {
            iArr[i10] = length;
        } else if (i11 != length) {
            throw new IllegalArgumentException(String.format("Mismatched lengths (%d and %d) in dimension %d", Integer.valueOf(iArr[i10]), Integer.valueOf(length), Integer.valueOf(i10)));
        }
        for (int i12 = 0; i12 < length; i12++) {
            m22381h(Array.get(obj, i12), i10 + 1, iArr);
        }
    }

    private static native boolean hasDelegateBufferHandle(long j10);

    /* renamed from: i */
    public static Tensor m22382i(long j10, int i10) {
        return new Tensor(create(j10, i10));
    }

    private static native int index(long j10);

    /* renamed from: k */
    public static boolean m22383k(Object obj) {
        return obj instanceof Buffer;
    }

    /* renamed from: l */
    public static boolean m22384l(Object obj) {
        return obj instanceof ByteBuffer;
    }

    private static native String name(long j10);

    private static native int numBytes(long j10);

    private static native float quantizationScale(long j10);

    private static native int quantizationZeroPoint(long j10);

    private static native void readMultiDimensionalArray(long j10, Object obj);

    private static native int[] shape(long j10);

    private static native int[] shapeSignature(long j10);

    private static native void writeDirectBuffer(long j10, Buffer buffer);

    private static native void writeMultiDimensionalArray(long j10, Object obj);

    private static native void writeScalar(long j10, Object obj);

    /* renamed from: a */
    public final ByteBuffer m22385a() {
        return buffer(this.f25541a).order(ByteOrder.nativeOrder());
    }

    /* renamed from: b */
    public void m22386b() {
        delete(this.f25541a);
        this.f25541a = 0L;
    }

    /* renamed from: d */
    public int[] m22387d(Object obj) {
        int iM22380c = m22380c(obj);
        if (this.f25542b == DataType.STRING) {
            Class<?> componentType = obj.getClass();
            if (componentType.isArray()) {
                while (componentType.isArray()) {
                    componentType = componentType.getComponentType();
                }
                if (Byte.TYPE.equals(componentType)) {
                    iM22380c--;
                }
            }
        }
        int[] iArr = new int[iM22380c];
        m22381h(obj, 0, iArr);
        return iArr;
    }

    /* renamed from: e */
    public Object m22388e(Object obj) {
        if (obj == null) {
            if (hasDelegateBufferHandle(this.f25541a)) {
                return obj;
            }
            throw new IllegalArgumentException("Null outputs are allowed only if the Tensor is bound to a buffer handle.");
        }
        m22399t(obj);
        m22397r(obj);
        if (m22383k(obj)) {
            m22389f((Buffer) obj);
            return obj;
        }
        readMultiDimensionalArray(this.f25541a, obj);
        return obj;
    }

    /* renamed from: f */
    public final void m22389f(Buffer buffer) {
        if (buffer instanceof ByteBuffer) {
            ((ByteBuffer) buffer).put(m22385a());
            return;
        }
        if (buffer instanceof FloatBuffer) {
            ((FloatBuffer) buffer).put(m22385a().asFloatBuffer());
            return;
        }
        if (buffer instanceof LongBuffer) {
            ((LongBuffer) buffer).put(m22385a().asLongBuffer());
        } else {
            if (buffer instanceof IntBuffer) {
                ((IntBuffer) buffer).put(m22385a().asIntBuffer());
                return;
            }
            throw new IllegalArgumentException("Unexpected output buffer type: " + buffer);
        }
    }

    /* renamed from: g */
    public DataType m22390g(Object obj) {
        if (obj != null) {
            Class<?> componentType = obj.getClass();
            if (componentType.isArray()) {
                while (componentType.isArray()) {
                    componentType = componentType.getComponentType();
                }
                if (Float.TYPE.equals(componentType)) {
                    return DataType.FLOAT32;
                }
                if (Integer.TYPE.equals(componentType)) {
                    return DataType.INT32;
                }
                if (Byte.TYPE.equals(componentType)) {
                    DataType dataType = this.f25542b;
                    DataType dataType2 = DataType.STRING;
                    return dataType == dataType2 ? dataType2 : DataType.UINT8;
                }
                if (Long.TYPE.equals(componentType)) {
                    return DataType.INT64;
                }
                if (Boolean.TYPE.equals(componentType)) {
                    return DataType.BOOL;
                }
                if (String.class.equals(componentType)) {
                    return DataType.STRING;
                }
            } else {
                if (Float.class.equals(componentType) || (obj instanceof FloatBuffer)) {
                    return DataType.FLOAT32;
                }
                if (Integer.class.equals(componentType) || (obj instanceof IntBuffer)) {
                    return DataType.INT32;
                }
                if (Byte.class.equals(componentType)) {
                    return DataType.UINT8;
                }
                if (Long.class.equals(componentType) || (obj instanceof LongBuffer)) {
                    return DataType.INT64;
                }
                if (Boolean.class.equals(componentType)) {
                    return DataType.BOOL;
                }
                if (String.class.equals(componentType)) {
                    return DataType.STRING;
                }
            }
        }
        throw new IllegalArgumentException("DataType error: cannot resolve DataType of " + obj.getClass().getName());
    }

    /* renamed from: j */
    public int[] m22391j(Object obj) {
        if (obj == null || m22383k(obj)) {
            return null;
        }
        m22399t(obj);
        int[] iArrM22387d = m22387d(obj);
        if (Arrays.equals(this.f25543c, iArrM22387d)) {
            return null;
        }
        return iArrM22387d;
    }

    /* renamed from: m */
    public String m22392m() {
        return name(this.f25541a);
    }

    /* renamed from: n */
    public int m22393n() {
        return numBytes(this.f25541a);
    }

    /* renamed from: o */
    public void m22394o() {
        this.f25543c = shape(this.f25541a);
    }

    /* renamed from: p */
    public void m22395p(Object obj) {
        if (obj == null) {
            if (!hasDelegateBufferHandle(this.f25541a)) {
                throw new IllegalArgumentException("Null inputs are allowed only if the Tensor is bound to a buffer handle.");
            }
            return;
        }
        m22399t(obj);
        m22398s(obj);
        if (m22383k(obj)) {
            m22396q((Buffer) obj);
        } else if (obj.getClass().isArray()) {
            writeMultiDimensionalArray(this.f25541a, obj);
        } else {
            writeScalar(this.f25541a, obj);
        }
    }

    /* renamed from: q */
    public final void m22396q(Buffer buffer) {
        if (buffer instanceof ByteBuffer) {
            ByteBuffer byteBuffer = (ByteBuffer) buffer;
            if (byteBuffer.isDirect() && byteBuffer.order() == ByteOrder.nativeOrder()) {
                writeDirectBuffer(this.f25541a, buffer);
                return;
            } else {
                m22385a().put(byteBuffer);
                return;
            }
        }
        if (buffer instanceof LongBuffer) {
            LongBuffer longBuffer = (LongBuffer) buffer;
            if (longBuffer.isDirect() && longBuffer.order() == ByteOrder.nativeOrder()) {
                writeDirectBuffer(this.f25541a, buffer);
                return;
            } else {
                m22385a().asLongBuffer().put(longBuffer);
                return;
            }
        }
        if (buffer instanceof FloatBuffer) {
            FloatBuffer floatBuffer = (FloatBuffer) buffer;
            if (floatBuffer.isDirect() && floatBuffer.order() == ByteOrder.nativeOrder()) {
                writeDirectBuffer(this.f25541a, buffer);
                return;
            } else {
                m22385a().asFloatBuffer().put(floatBuffer);
                return;
            }
        }
        if (!(buffer instanceof IntBuffer)) {
            throw new IllegalArgumentException("Unexpected input buffer type: " + buffer);
        }
        IntBuffer intBuffer = (IntBuffer) buffer;
        if (intBuffer.isDirect() && intBuffer.order() == ByteOrder.nativeOrder()) {
            writeDirectBuffer(this.f25541a, buffer);
        } else {
            m22385a().asIntBuffer().put(intBuffer);
        }
    }

    /* renamed from: r */
    public final void m22397r(Object obj) {
        if (!m22383k(obj)) {
            int[] iArrM22387d = m22387d(obj);
            if (!Arrays.equals(iArrM22387d, this.f25543c)) {
                throw new IllegalArgumentException(String.format("Cannot copy from a TensorFlowLite tensor (%s) with shape %s to a Java object with shape %s.", m22392m(), Arrays.toString(this.f25543c), Arrays.toString(iArrM22387d)));
            }
        } else {
            Buffer buffer = (Buffer) obj;
            int iM22393n = m22393n();
            int iCapacity = m22384l(obj) ? buffer.capacity() : buffer.capacity() * this.f25542b.m22370a();
            if (iM22393n > iCapacity) {
                throw new IllegalArgumentException(String.format("Cannot copy from a TensorFlowLite tensor (%s) with %d bytes to a Java Buffer with %d bytes.", m22392m(), Integer.valueOf(iM22393n), Integer.valueOf(iCapacity)));
            }
        }
    }

    /* renamed from: s */
    public final void m22398s(Object obj) {
        if (!m22383k(obj)) {
            int[] iArrM22387d = m22387d(obj);
            if (!Arrays.equals(iArrM22387d, this.f25543c)) {
                throw new IllegalArgumentException(String.format("Cannot copy to a TensorFlowLite tensor (%s) with shape %s from a Java object with shape %s.", m22392m(), Arrays.toString(this.f25543c), Arrays.toString(iArrM22387d)));
            }
        } else {
            Buffer buffer = (Buffer) obj;
            int iM22393n = m22393n();
            int iCapacity = m22384l(obj) ? buffer.capacity() : buffer.capacity() * this.f25542b.m22370a();
            if (iM22393n != iCapacity) {
                throw new IllegalArgumentException(String.format("Cannot copy to a TensorFlowLite tensor (%s) with %d bytes from a Java Buffer with %d bytes.", m22392m(), Integer.valueOf(iM22393n), Integer.valueOf(iCapacity)));
            }
        }
    }

    /* renamed from: t */
    public final void m22399t(Object obj) {
        DataType dataTypeM22390g;
        if (!m22384l(obj) && (dataTypeM22390g = m22390g(obj)) != this.f25542b && !dataTypeM22390g.m22371d().equals(this.f25542b.m22371d())) {
            throw new IllegalArgumentException(String.format("Cannot convert between a TensorFlowLite tensor with type %s and a Java object of type %s (which is compatible with the TensorFlowLite type %s).", this.f25542b, obj.getClass().getName(), dataTypeM22390g));
        }
    }
}
