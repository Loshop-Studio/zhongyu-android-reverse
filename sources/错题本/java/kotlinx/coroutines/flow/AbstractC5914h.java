package kotlinx.coroutines.flow;

import android.support.v4.media.AbstractC0037f;
import android.support.v4.media.C0039h;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.AbstractC6014x;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.channels.C5873b;
import kotlinx.coroutines.channels.C5875d;
import kotlinx.coroutines.channels.InterfaceC5876e;
import kotlinx.coroutines.flow.internal.AbstractC5920b;
import kotlinx.coroutines.flow.internal.AbstractC5922d;
import kotlinx.coroutines.flow.internal.C5924f;
import kotlinx.coroutines.flow.internal.C5926h;
import kotlinx.coroutines.flow.internal.C5931m;
import p045d6.C5443s;
import p054e7.C5471c;
import p054e7.C5486r;
import p054e7.C5488t;
import p075h6.InterfaceC5631c;
import p075h6.InterfaceC5636h;
import p152r6.InterfaceC6473e;

/* renamed from: kotlinx.coroutines.flow.h */
/* loaded from: classes4.dex */
public abstract class AbstractC5914h {

    /* renamed from: a */
    public static final C5488t f9374a = new C5488t(10);

    /* renamed from: b */
    public static final C5486r f9375b = new C5486r("NO_VALUE");

    /* renamed from: c */
    public static final C5486r f9376c = new C5486r("NONE");

    /* renamed from: d */
    public static final C5486r f9377d = new C5486r("PENDING");

    /* renamed from: a */
    public static C5911f0 m5545a(int i, int i8, BufferOverflow bufferOverflow) {
        int i9 = (i8 & 1) != 0 ? 0 : 1;
        if ((i8 & 2) != 0) {
            i = 0;
        }
        if ((i8 & 4) != 0) {
            bufferOverflow = BufferOverflow.SUSPEND;
        }
        if (i9 < 0) {
            throw new IllegalArgumentException(AbstractC0037f.m81f(i9, "replay cannot be negative, but was ").toString());
        }
        if (i < 0) {
            throw new IllegalArgumentException(AbstractC0037f.m81f(i, "extraBufferCapacity cannot be negative, but was ").toString());
        }
        if (i9 <= 0 && i <= 0 && bufferOverflow != BufferOverflow.SUSPEND) {
            throw new IllegalArgumentException(("replay or extraBufferCapacity must be positive with non-default onBufferOverflow strategy " + bufferOverflow).toString());
        }
        int i10 = i + i9;
        if (i10 < 0) {
            i10 = Integer.MAX_VALUE;
        }
        return new C5911f0(i9, i10, bufferOverflow);
    }

    /* renamed from: b */
    public static final C5946n0 m5546b(Object obj) {
        if (obj == null) {
            obj = AbstractC5920b.f9388b;
        }
        return new C5946n0(obj);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final kotlin.coroutines.intrinsics.CoroutineSingletons m5547c(kotlinx.coroutines.flow.InterfaceC5912g r4, java.lang.Object r5, java.lang.Object r6, kotlin.coroutines.jvm.internal.ContinuationImpl r7) {
        /*
            boolean r0 = r7 instanceof kotlinx.coroutines.flow.FlowKt__LimitKt$emitAbort$1
            if (r0 == 0) goto L13
            r0 = r7
            kotlinx.coroutines.flow.FlowKt__LimitKt$emitAbort$1 r0 = (kotlinx.coroutines.flow.FlowKt__LimitKt$emitAbort$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            kotlinx.coroutines.flow.FlowKt__LimitKt$emitAbort$1 r0 = new kotlinx.coroutines.flow.FlowKt__LimitKt$emitAbort$1
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 == r3) goto L2b
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L2b:
            java.lang.Object r6 = r0.L$0
            kotlin.AbstractC5774b.m5119b(r7)
            goto L3f
        L31:
            kotlin.AbstractC5774b.m5119b(r7)
            r0.L$0 = r6
            r0.label = r3
            java.lang.Object r4 = r4.emit(r5, r0)
            if (r4 != r1) goto L3f
            return r1
        L3f:
            kotlinx.coroutines.flow.internal.AbortFlowException r4 = new kotlinx.coroutines.flow.internal.AbortFlowException
            r4.<init>(r6)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.AbstractC5914h.m5547c(kotlinx.coroutines.flow.g, java.lang.Object, java.lang.Object, kotlin.coroutines.jvm.internal.ContinuationImpl):kotlin.coroutines.intrinsics.CoroutineSingletons");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object m5548d(kotlinx.coroutines.flow.C5950p0 r4, p152r6.InterfaceC6474f r5, java.lang.Throwable r6, kotlin.coroutines.jvm.internal.ContinuationImpl r7) {
        /*
            boolean r0 = r7 instanceof kotlinx.coroutines.flow.FlowKt__EmittersKt$invokeSafely$1
            if (r0 == 0) goto L13
            r0 = r7
            kotlinx.coroutines.flow.FlowKt__EmittersKt$invokeSafely$1 r0 = (kotlinx.coroutines.flow.FlowKt__EmittersKt$invokeSafely$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            kotlinx.coroutines.flow.FlowKt__EmittersKt$invokeSafely$1 r0 = new kotlinx.coroutines.flow.FlowKt__EmittersKt$invokeSafely$1
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L36
            if (r2 != r3) goto L2e
            java.lang.Object r4 = r0.L$0
            r6 = r4
            java.lang.Throwable r6 = (java.lang.Throwable) r6
            kotlin.AbstractC5774b.m5119b(r7)     // Catch: java.lang.Throwable -> L2c
            goto L44
        L2c:
            r4 = move-exception
            goto L47
        L2e:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L36:
            kotlin.AbstractC5774b.m5119b(r7)
            r0.L$0 = r6     // Catch: java.lang.Throwable -> L2c
            r0.label = r3     // Catch: java.lang.Throwable -> L2c
            java.lang.Object r4 = r5.invoke(r4, r6, r0)     // Catch: java.lang.Throwable -> L2c
            if (r4 != r1) goto L44
            return r1
        L44:
            d6.s r4 = p045d6.C5443s.f8405a
            return r4
        L47:
            if (r6 == 0) goto L4e
            if (r6 == r4) goto L4e
            kotlin.collections.AbstractC5806u.m5266e(r4, r6)
        L4e:
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.AbstractC5914h.m5548d(kotlinx.coroutines.flow.p0, r6.f, java.lang.Throwable, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* renamed from: e */
    public static final void m5549e(Object[] objArr, long j7, Object obj) {
        objArr[((int) j7) & (objArr.length - 1)] = obj;
    }

    /* renamed from: f */
    public static InterfaceC5910f m5550f(AbstractC5922d abstractC5922d, int i) {
        BufferOverflow bufferOverflow = BufferOverflow.SUSPEND;
        if (i < 0 && i != -2 && i != -1) {
            throw new IllegalArgumentException(AbstractC0037f.m81f(i, "Buffer size should be non-negative, BUFFERED, or CONFLATED, but was ").toString());
        }
        if (i == -1) {
            bufferOverflow = BufferOverflow.DROP_OLDEST;
            i = 0;
        }
        return AbstractC5920b.m5564b(abstractC5922d, null, i, bufferOverflow, 1);
    }

    /* renamed from: g */
    public static final C5902b m5551g(InterfaceC6473e interfaceC6473e) {
        return new C5902b(interfaceC6473e, EmptyCoroutineContext.INSTANCE, -2, BufferOverflow.SUSPEND);
    }

    /* renamed from: h */
    public static final Object m5552h(InterfaceC5910f interfaceC5910f, InterfaceC6473e interfaceC6473e, InterfaceC5631c interfaceC5631c) {
        int i = AbstractC5952r.f9437a;
        Object objCollect = m5550f(new C5926h(new FlowKt__MergeKt$mapLatest$1(interfaceC6473e, null), interfaceC5910f, EmptyCoroutineContext.INSTANCE, -2, BufferOverflow.SUSPEND), 0).collect(C5931m.f9405a, interfaceC5631c);
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        C5443s c5443s = C5443s.f8405a;
        if (objCollect != coroutineSingletons) {
            objCollect = c5443s;
        }
        return objCollect == coroutineSingletons ? objCollect : c5443s;
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0091, code lost:
    
        if (r2.emit(r10, r0) == r1) goto L33;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x007f A[Catch: all -> 0x003b, TRY_LEAVE, TryCatch #0 {all -> 0x003b, blocks: (B:13:0x0035, B:25:0x0062, B:29:0x0077, B:31:0x007f, B:20:0x0053, B:24:0x005e), top: B:50:0x0021 }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:32:0x0091 -> B:14:0x0038). Please report as a decompilation issue!!! */
    /* renamed from: i */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object m5553i(kotlinx.coroutines.flow.InterfaceC5912g r7, kotlinx.coroutines.channels.InterfaceC5886o r8, boolean r9, p075h6.InterfaceC5631c r10) throws java.lang.Throwable {
        /*
            boolean r0 = r10 instanceof kotlinx.coroutines.flow.FlowKt__ChannelsKt$emitAllImpl$1
            if (r0 == 0) goto L13
            r0 = r10
            kotlinx.coroutines.flow.FlowKt__ChannelsKt$emitAllImpl$1 r0 = (kotlinx.coroutines.flow.FlowKt__ChannelsKt$emitAllImpl$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            kotlinx.coroutines.flow.FlowKt__ChannelsKt$emitAllImpl$1 r0 = new kotlinx.coroutines.flow.FlowKt__ChannelsKt$emitAllImpl$1
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 0
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L57
            if (r2 == r5) goto L45
            if (r2 != r4) goto L3d
            boolean r9 = r0.Z$0
            java.lang.Object r7 = r0.L$2
            kotlinx.coroutines.channels.a r7 = (kotlinx.coroutines.channels.C5872a) r7
            java.lang.Object r8 = r0.L$1
            kotlinx.coroutines.channels.o r8 = (kotlinx.coroutines.channels.InterfaceC5886o) r8
            java.lang.Object r2 = r0.L$0
            kotlinx.coroutines.flow.g r2 = (kotlinx.coroutines.flow.InterfaceC5912g) r2
            kotlin.AbstractC5774b.m5119b(r10)     // Catch: java.lang.Throwable -> L3b
        L38:
            r10 = r7
            r7 = r2
            goto L62
        L3b:
            r7 = move-exception
            goto L9c
        L3d:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L45:
            boolean r9 = r0.Z$0
            java.lang.Object r7 = r0.L$2
            kotlinx.coroutines.channels.a r7 = (kotlinx.coroutines.channels.C5872a) r7
            java.lang.Object r8 = r0.L$1
            kotlinx.coroutines.channels.o r8 = (kotlinx.coroutines.channels.InterfaceC5886o) r8
            java.lang.Object r2 = r0.L$0
            kotlinx.coroutines.flow.g r2 = (kotlinx.coroutines.flow.InterfaceC5912g) r2
            kotlin.AbstractC5774b.m5119b(r10)     // Catch: java.lang.Throwable -> L3b
            goto L77
        L57:
            kotlin.AbstractC5774b.m5119b(r10)
            boolean r10 = r7 instanceof kotlinx.coroutines.flow.C5950p0
            if (r10 != 0) goto Lb7
            kotlinx.coroutines.channels.a r10 = r8.iterator()     // Catch: java.lang.Throwable -> L3b
        L62:
            r0.L$0 = r7     // Catch: java.lang.Throwable -> L3b
            r0.L$1 = r8     // Catch: java.lang.Throwable -> L3b
            r0.L$2 = r10     // Catch: java.lang.Throwable -> L3b
            r0.Z$0 = r9     // Catch: java.lang.Throwable -> L3b
            r0.label = r5     // Catch: java.lang.Throwable -> L3b
            java.lang.Object r2 = r10.m5466b(r0)     // Catch: java.lang.Throwable -> L3b
            if (r2 != r1) goto L73
            goto L93
        L73:
            r6 = r2
            r2 = r7
            r7 = r10
            r10 = r6
        L77:
            java.lang.Boolean r10 = (java.lang.Boolean) r10     // Catch: java.lang.Throwable -> L3b
            boolean r10 = r10.booleanValue()     // Catch: java.lang.Throwable -> L3b
            if (r10 == 0) goto L94
            java.lang.Object r10 = r7.m5467c()     // Catch: java.lang.Throwable -> L3b
            r0.L$0 = r2     // Catch: java.lang.Throwable -> L3b
            r0.L$1 = r8     // Catch: java.lang.Throwable -> L3b
            r0.L$2 = r7     // Catch: java.lang.Throwable -> L3b
            r0.Z$0 = r9     // Catch: java.lang.Throwable -> L3b
            r0.label = r4     // Catch: java.lang.Throwable -> L3b
            java.lang.Object r10 = r2.emit(r10, r0)     // Catch: java.lang.Throwable -> L3b
            if (r10 != r1) goto L38
        L93:
            return r1
        L94:
            if (r9 == 0) goto L99
            r8.cancel(r3)
        L99:
            d6.s r7 = p045d6.C5443s.f8405a
            return r7
        L9c:
            throw r7     // Catch: java.lang.Throwable -> L9d
        L9d:
            r10 = move-exception
            if (r9 == 0) goto Lb6
            boolean r9 = r7 instanceof java.util.concurrent.CancellationException
            if (r9 == 0) goto La7
            r3 = r7
            java.util.concurrent.CancellationException r3 = (java.util.concurrent.CancellationException) r3
        La7:
            if (r3 != 0) goto Lb3
            java.util.concurrent.CancellationException r3 = new java.util.concurrent.CancellationException
            java.lang.String r9 = "Channel was consumed, consumer had failed"
            r3.<init>(r9)
            r3.initCause(r7)
        Lb3:
            r8.cancel(r3)
        Lb6:
            throw r10
        Lb7:
            kotlinx.coroutines.flow.p0 r7 = (kotlinx.coroutines.flow.C5950p0) r7
            java.lang.Throwable r7 = r7.f9434a
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.AbstractC5914h.m5553i(kotlinx.coroutines.flow.g, kotlinx.coroutines.channels.o, boolean, h6.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x006c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /* JADX WARN: Type inference failed for: r0v0, types: [T, e7.r] */
    /* renamed from: j */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object m5554j(kotlinx.coroutines.flow.InterfaceC5910f r5, p152r6.InterfaceC6473e r6, p075h6.InterfaceC5631c r7) {
        /*
            e7.r r0 = kotlinx.coroutines.flow.internal.AbstractC5920b.f9388b
            boolean r1 = r7 instanceof kotlinx.coroutines.flow.FlowKt__ReduceKt$first$3
            if (r1 == 0) goto L15
            r1 = r7
            kotlinx.coroutines.flow.FlowKt__ReduceKt$first$3 r1 = (kotlinx.coroutines.flow.FlowKt__ReduceKt$first$3) r1
            int r2 = r1.label
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.label = r2
            goto L1a
        L15:
            kotlinx.coroutines.flow.FlowKt__ReduceKt$first$3 r1 = new kotlinx.coroutines.flow.FlowKt__ReduceKt$first$3
            r1.<init>(r7)
        L1a:
            java.lang.Object r7 = r1.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r2 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r3 = r1.label
            r4 = 1
            if (r3 == 0) goto L3b
            if (r3 != r4) goto L33
            java.lang.Object r5 = r1.L$1
            kotlinx.coroutines.flow.s r5 = (kotlinx.coroutines.flow.C5953s) r5
            java.lang.Object r6 = r1.L$0
            kotlin.jvm.internal.Ref$ObjectRef r6 = (kotlin.jvm.internal.Ref$ObjectRef) r6
            kotlin.AbstractC5774b.m5119b(r7)     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L31
            goto L68
        L31:
            r7 = move-exception
            goto L5d
        L33:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L3b:
            kotlin.AbstractC5774b.m5119b(r7)
            kotlin.jvm.internal.Ref$ObjectRef r7 = new kotlin.jvm.internal.Ref$ObjectRef
            r7.<init>()
            r7.element = r0
            kotlinx.coroutines.flow.s r3 = new kotlinx.coroutines.flow.s
            r3.<init>(r7, r6)
            r1.L$0 = r7     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L59
            r1.L$1 = r3     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L59
            r1.label = r4     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L59
            java.lang.Object r5 = r5.collect(r3, r1)     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L59
            if (r5 != r2) goto L57
            return r2
        L57:
            r6 = r7
            goto L68
        L59:
            r5 = move-exception
            r6 = r7
            r7 = r5
            r5 = r3
        L5d:
            java.lang.Object r2 = r7.owner
            if (r2 != r5) goto L75
            h6.h r5 = r1.getContext()
            kotlinx.coroutines.AbstractC6014x.m5639j(r5)
        L68:
            T r5 = r6.element
            if (r5 == r0) goto L6d
            return r5
        L6d:
            java.util.NoSuchElementException r5 = new java.util.NoSuchElementException
            java.lang.String r6 = "Expected at least one element matching the predicate"
            r5.<init>(r6)
            throw r5
        L75:
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.AbstractC5914h.m5554j(kotlinx.coroutines.flow.f, r6.e, h6.c):java.lang.Object");
    }

    /* renamed from: k */
    public static final InterfaceC5910f m5555k(InterfaceC5905c0 interfaceC5905c0, InterfaceC5636h interfaceC5636h, int i, BufferOverflow bufferOverflow) {
        return ((i == 0 || i == -3) && bufferOverflow == BufferOverflow.SUSPEND) ? interfaceC5905c0 : new C5924f(interfaceC5905c0, interfaceC5636h, i, bufferOverflow);
    }

    /* renamed from: l */
    public static final C5904c m5556l(C5873b c5873b) {
        return new C5904c(c5873b, false);
    }

    /* renamed from: m */
    public static final C5901a0 m5557m(C5903b0 c5903b0, C5471c c5471c, C5942l0 c5942l0, Float f) {
        InterfaceC5876e.f9326a0.getClass();
        C5875d c5875d = C5875d.f9324a;
        BufferOverflow bufferOverflow = BufferOverflow.SUSPEND;
        C0039h c0039h = new C0039h(13, c5903b0, false, EmptyCoroutineContext.INSTANCE);
        C5946n0 c5946n0M5546b = m5546b(f);
        AbstractC6014x.m5650u(c5471c, (InterfaceC5636h) c0039h.f97c, c5942l0.equals(C5915h0.f9378a) ? CoroutineStart.DEFAULT : CoroutineStart.UNDISPATCHED, new FlowKt__ShareKt$launchSharing$1(c5942l0, (InterfaceC5910f) c0039h.f96b, c5946n0M5546b, f, null));
        return new C5901a0(c5946n0M5546b);
    }
}
