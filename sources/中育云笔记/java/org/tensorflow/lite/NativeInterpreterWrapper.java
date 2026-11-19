package org.tensorflow.lite;

import androidx.documentfile.provider.AbstractC3754a;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.MappedByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.tensorflow.lite.C10588b;
import org.tensorflow.lite.nnapi.NnApiDelegate;

/* loaded from: classes6.dex */
final class NativeInterpreterWrapper implements AutoCloseable {

    /* renamed from: c */
    public long f25529c;

    /* renamed from: d */
    public long f25530d;

    /* renamed from: e */
    public long f25531e;

    /* renamed from: g */
    public ByteBuffer f25533g;

    /* renamed from: h */
    public Map f25534h;

    /* renamed from: i */
    public Map f25535i;

    /* renamed from: j */
    public Tensor[] f25536j;

    /* renamed from: k */
    public Tensor[] f25537k;

    /* renamed from: f */
    public long f25532f = 0;
    private long inferenceDurationNanoseconds = -1;

    /* renamed from: l */
    public boolean f25538l = false;

    /* renamed from: m */
    public final List f25539m = new ArrayList();

    /* renamed from: n */
    public final List f25540n = new ArrayList();

    public NativeInterpreterWrapper(ByteBuffer byteBuffer, C10588b.a aVar) {
        TensorFlowLite.m22400a();
        if (byteBuffer == null || !((byteBuffer instanceof MappedByteBuffer) || (byteBuffer.isDirect() && byteBuffer.order() == ByteOrder.nativeOrder()))) {
            throw new IllegalArgumentException("Model ByteBuffer should be either a MappedByteBuffer of the model file, or a direct ByteBuffer using ByteOrder.nativeOrder() which contains bytes of model content.");
        }
        this.f25533g = byteBuffer;
        long jCreateErrorReporter = createErrorReporter(512);
        m22376e(jCreateErrorReporter, createModelWithBuffer(this.f25533g, jCreateErrorReporter), aVar);
    }

    private static native long allocateTensors(long j10, long j11);

    private static native void allowBufferHandleOutput(long j10, boolean z10);

    private static native void allowFp16PrecisionForFp32(long j10, boolean z10);

    private static native void applyDelegate(long j10, long j11, long j12);

    private static native long createCancellationFlag(long j10);

    private static native long createErrorReporter(int i10);

    private static native long createInterpreter(long j10, long j11, int i10);

    private static native long createModel(String str, long j10);

    private static native long createModelWithBuffer(ByteBuffer byteBuffer, long j10);

    private static native void delete(long j10, long j11, long j12);

    private static native long deleteCancellationFlag(long j10);

    /* renamed from: f */
    public static InterfaceC10587a m22372f(List list) throws ClassNotFoundException {
        try {
            Class<?> cls = Class.forName("org.tensorflow.lite.flex.FlexDelegate");
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (cls.isInstance((InterfaceC10587a) it.next())) {
                    return null;
                }
            }
            return (InterfaceC10587a) cls.getConstructor(null).newInstance(null);
        } catch (Exception unused) {
            return null;
        }
    }

    private static native int getExecutionPlanLength(long j10);

    private static native int getInputCount(long j10);

    private static native String[] getInputNames(long j10);

    private static native int getInputTensorIndex(long j10, int i10);

    private static native int getOutputCount(long j10);

    private static native int getOutputDataType(long j10, int i10);

    private static native String[] getOutputNames(long j10);

    private static native int getOutputTensorIndex(long j10, int i10);

    private static native boolean hasUnresolvedFlexOp(long j10);

    private static native void numThreads(long j10, int i10);

    private static native void resetVariableTensors(long j10, long j11);

    private static native boolean resizeInput(long j10, long j11, int i10, int[] iArr, boolean z10);

    private static native void run(long j10, long j11);

    private static native void setCancelled(long j10, long j11, boolean z10);

    private static native void useXNNPACK(long j10, long j11, boolean z10, int i10);

    /* renamed from: a */
    public final void m22373a(C10588b.a aVar) {
        InterfaceC10587a interfaceC10587aM22372f;
        boolean zHasUnresolvedFlexOp = hasUnresolvedFlexOp(this.f25530d);
        if (zHasUnresolvedFlexOp && (interfaceC10587aM22372f = m22372f(aVar.f25557g)) != null) {
            this.f25540n.add((AutoCloseable) interfaceC10587aM22372f);
            applyDelegate(this.f25530d, this.f25529c, interfaceC10587aM22372f.mo22402e());
        }
        try {
            for (InterfaceC10587a interfaceC10587a : aVar.f25557g) {
                applyDelegate(this.f25530d, this.f25529c, interfaceC10587a.mo22402e());
                this.f25539m.add(interfaceC10587a);
            }
            Boolean bool = aVar.f25552b;
            if (bool == null || !bool.booleanValue()) {
                return;
            }
            NnApiDelegate nnApiDelegate = new NnApiDelegate();
            this.f25540n.add(nnApiDelegate);
            applyDelegate(this.f25530d, this.f25529c, nnApiDelegate.mo22402e());
        } catch (IllegalArgumentException e10) {
            if (!zHasUnresolvedFlexOp || hasUnresolvedFlexOp(this.f25530d)) {
                throw e10;
            }
            System.err.println("Ignoring failed delegate application: " + e10);
        }
    }

    /* renamed from: c */
    public Tensor m22374c(int i10) {
        if (i10 >= 0) {
            Tensor[] tensorArr = this.f25536j;
            if (i10 < tensorArr.length) {
                Tensor tensor = tensorArr[i10];
                if (tensor != null) {
                    return tensor;
                }
                long j10 = this.f25530d;
                Tensor tensorM22382i = Tensor.m22382i(j10, getInputTensorIndex(j10, i10));
                tensorArr[i10] = tensorM22382i;
                return tensorM22382i;
            }
        }
        throw new IllegalArgumentException("Invalid input Tensor index: " + i10);
    }

    @Override // java.lang.AutoCloseable
    public void close() {
        int i10 = 0;
        while (true) {
            Tensor[] tensorArr = this.f25536j;
            if (i10 >= tensorArr.length) {
                break;
            }
            Tensor tensor = tensorArr[i10];
            if (tensor != null) {
                tensor.m22386b();
                this.f25536j[i10] = null;
            }
            i10++;
        }
        int i11 = 0;
        while (true) {
            Tensor[] tensorArr2 = this.f25537k;
            if (i11 >= tensorArr2.length) {
                break;
            }
            Tensor tensor2 = tensorArr2[i11];
            if (tensor2 != null) {
                tensor2.m22386b();
                this.f25537k[i11] = null;
            }
            i11++;
        }
        delete(this.f25529c, this.f25531e, this.f25530d);
        deleteCancellationFlag(this.f25532f);
        this.f25529c = 0L;
        this.f25531e = 0L;
        this.f25530d = 0L;
        this.f25532f = 0L;
        this.f25533g = null;
        this.f25534h = null;
        this.f25535i = null;
        this.f25538l = false;
        this.f25539m.clear();
        Iterator it = this.f25540n.iterator();
        while (it.hasNext()) {
            try {
                AbstractC3754a.m1748a((AutoCloseable) it.next());
            } catch (Exception e10) {
                System.err.println("Failed to close flex delegate: " + e10);
            }
        }
        this.f25540n.clear();
    }

    /* renamed from: d */
    public Tensor m22375d(int i10) {
        if (i10 >= 0) {
            Tensor[] tensorArr = this.f25537k;
            if (i10 < tensorArr.length) {
                Tensor tensor = tensorArr[i10];
                if (tensor != null) {
                    return tensor;
                }
                long j10 = this.f25530d;
                Tensor tensorM22382i = Tensor.m22382i(j10, getOutputTensorIndex(j10, i10));
                tensorArr[i10] = tensorM22382i;
                return tensorM22382i;
            }
        }
        throw new IllegalArgumentException("Invalid output Tensor index: " + i10);
    }

    /* renamed from: e */
    public final void m22376e(long j10, long j11, C10588b.a aVar) {
        long j12;
        if (aVar == null) {
            aVar = new C10588b.a();
        }
        this.f25529c = j10;
        this.f25531e = j11;
        this.f25530d = createInterpreter(j11, j10, aVar.f25551a);
        Boolean bool = aVar.f25555e;
        if (bool != null && bool.booleanValue()) {
            this.f25532f = createCancellationFlag(this.f25530d);
        }
        this.f25536j = new Tensor[getInputCount(this.f25530d)];
        this.f25537k = new Tensor[getOutputCount(this.f25530d)];
        Boolean bool2 = aVar.f25553c;
        if (bool2 != null) {
            allowFp16PrecisionForFp32(this.f25530d, bool2.booleanValue());
        }
        Boolean bool3 = aVar.f25554d;
        if (bool3 != null) {
            allowBufferHandleOutput(this.f25530d, bool3.booleanValue());
        }
        m22373a(aVar);
        Boolean bool4 = aVar.f25556f;
        if (bool4 != null) {
            j12 = j10;
            useXNNPACK(this.f25530d, j12, bool4.booleanValue(), aVar.f25551a);
        } else {
            j12 = j10;
        }
        allocateTensors(this.f25530d, j12);
        this.f25538l = true;
    }

    /* renamed from: g */
    public void m22377g(int i10, int[] iArr) {
        m22378i(i10, iArr, false);
    }

    /* renamed from: i */
    public void m22378i(int i10, int[] iArr, boolean z10) {
        if (resizeInput(this.f25530d, this.f25529c, i10, iArr, z10)) {
            this.f25538l = false;
            Tensor tensor = this.f25536j[i10];
            if (tensor != null) {
                tensor.m22394o();
            }
        }
    }

    /* renamed from: j */
    public void m22379j(Object[] objArr, Map map) {
        this.inferenceDurationNanoseconds = -1L;
        if (objArr == null || objArr.length == 0) {
            throw new IllegalArgumentException("Input error: Inputs should not be null or empty.");
        }
        if (map == null || map.isEmpty()) {
            throw new IllegalArgumentException("Input error: Outputs should not be null or empty.");
        }
        int i10 = 0;
        for (int i11 = 0; i11 < objArr.length; i11++) {
            int[] iArrM22391j = m22374c(i11).m22391j(objArr[i11]);
            if (iArrM22391j != null) {
                m22377g(i11, iArrM22391j);
            }
        }
        boolean z10 = this.f25538l;
        if (!z10) {
            allocateTensors(this.f25530d, this.f25529c);
            this.f25538l = true;
        }
        for (int i12 = 0; i12 < objArr.length; i12++) {
            m22374c(i12).m22395p(objArr[i12]);
        }
        long jNanoTime = System.nanoTime();
        run(this.f25530d, this.f25529c);
        long jNanoTime2 = System.nanoTime() - jNanoTime;
        if (!z10) {
            while (true) {
                Tensor[] tensorArr = this.f25537k;
                if (i10 >= tensorArr.length) {
                    break;
                }
                Tensor tensor = tensorArr[i10];
                if (tensor != null) {
                    tensor.m22394o();
                }
                i10++;
            }
        }
        for (Map.Entry entry : map.entrySet()) {
            m22375d(((Integer) entry.getKey()).intValue()).m22388e(entry.getValue());
        }
        this.inferenceDurationNanoseconds = jNanoTime2;
    }
}
