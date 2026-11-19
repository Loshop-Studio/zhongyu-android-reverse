package kotlinx.coroutines.flow;

import kotlin.jvm.internal.Ref$BooleanRef;
import kotlin.jvm.internal.Ref$IntRef;
import p181hd.InterfaceC9544p;
import p309qc.C10786q;
import p379vd.InterfaceC11594c;
import p379vd.InterfaceC11595d;
import p393wc.AbstractC11725a;
import vc.InterfaceC11588c;

/* loaded from: classes6.dex */
public abstract /* synthetic */ class FlowKt__LimitKt {

    /* renamed from: kotlinx.coroutines.flow.FlowKt__LimitKt$a */
    public static final class C10021a implements InterfaceC11594c {

        /* renamed from: c */
        public final /* synthetic */ InterfaceC11594c f23728c;

        /* renamed from: d */
        public final /* synthetic */ int f23729d;

        public C10021a(InterfaceC11594c interfaceC11594c, int i10) {
            this.f23728c = interfaceC11594c;
            this.f23729d = i10;
        }

        @Override // p379vd.InterfaceC11594c
        public Object collect(InterfaceC11595d interfaceC11595d, InterfaceC11588c interfaceC11588c) {
            Object objCollect = this.f23728c.collect(new FlowKt__LimitKt$drop$2$1(new Ref$IntRef(), this.f23729d, interfaceC11595d), interfaceC11588c);
            return objCollect == AbstractC11725a.m25952f() ? objCollect : C10786q.f26013a;
        }
    }

    /* renamed from: kotlinx.coroutines.flow.FlowKt__LimitKt$b */
    public static final class C10022b implements InterfaceC11594c {

        /* renamed from: c */
        public final /* synthetic */ InterfaceC11594c f23730c;

        /* renamed from: d */
        public final /* synthetic */ InterfaceC9544p f23731d;

        public C10022b(InterfaceC11594c interfaceC11594c, InterfaceC9544p interfaceC9544p) {
            this.f23730c = interfaceC11594c;
            this.f23731d = interfaceC9544p;
        }

        @Override // p379vd.InterfaceC11594c
        public Object collect(InterfaceC11595d interfaceC11595d, InterfaceC11588c interfaceC11588c) {
            Object objCollect = this.f23730c.collect(new FlowKt__LimitKt$dropWhile$1$1(new Ref$BooleanRef(), interfaceC11595d, this.f23731d), interfaceC11588c);
            return objCollect == AbstractC11725a.m25952f() ? objCollect : C10786q.f26013a;
        }
    }

    /* renamed from: b */
    public static final InterfaceC11594c m20792b(InterfaceC11594c interfaceC11594c, int i10) {
        if (i10 >= 0) {
            return new C10021a(interfaceC11594c, i10);
        }
        throw new IllegalArgumentException(("Drop count should be non-negative, but had " + i10).toString());
    }

    /* renamed from: c */
    public static final InterfaceC11594c m20793c(InterfaceC11594c interfaceC11594c, InterfaceC9544p interfaceC9544p) {
        return new C10022b(interfaceC11594c, interfaceC9544p);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object m20794d(p379vd.InterfaceC11595d r4, java.lang.Object r5, java.lang.Object r6, vc.InterfaceC11588c r7) throws java.lang.Throwable {
        /*
            boolean r0 = r7 instanceof kotlinx.coroutines.flow.FlowKt__LimitKt$emitAbort$1
            if (r0 == 0) goto L13
            r0 = r7
            kotlinx.coroutines.flow.FlowKt__LimitKt$emitAbort$1 r0 = (kotlinx.coroutines.flow.FlowKt__LimitKt$emitAbort$1) r0
            int r1 = r0.f23748e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f23748e = r1
            goto L18
        L13:
            kotlinx.coroutines.flow.FlowKt__LimitKt$emitAbort$1 r0 = new kotlinx.coroutines.flow.FlowKt__LimitKt$emitAbort$1
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f23747d
            java.lang.Object r1 = p393wc.AbstractC11725a.m25952f()
            int r2 = r0.f23748e
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 == r3) goto L2d
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L2d:
            java.lang.Object r6 = r0.f23746c
            kotlin.AbstractC9924b.m20071b(r7)
            goto L41
        L33:
            kotlin.AbstractC9924b.m20071b(r7)
            r0.f23746c = r6
            r0.f23748e = r3
            java.lang.Object r4 = r4.emit(r5, r0)
            if (r4 != r1) goto L41
            return r1
        L41:
            kotlinx.coroutines.flow.internal.AbortFlowException r4 = new kotlinx.coroutines.flow.internal.AbortFlowException
            r4.<init>(r6)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.FlowKt__LimitKt.m20794d(vd.d, java.lang.Object, java.lang.Object, vc.c):java.lang.Object");
    }

    /* renamed from: e */
    public static final InterfaceC11594c m20795e(InterfaceC11594c interfaceC11594c, int i10) {
        if (i10 > 0) {
            return new FlowKt__LimitKt$take$$inlined$unsafeFlow$1(interfaceC11594c, i10);
        }
        throw new IllegalArgumentException(("Requested element count " + i10 + " should be positive").toString());
    }

    /* renamed from: f */
    public static final InterfaceC11594c m20796f(InterfaceC11594c interfaceC11594c, InterfaceC9544p interfaceC9544p) {
        return new FlowKt__LimitKt$takeWhile$$inlined$unsafeFlow$1(interfaceC11594c, interfaceC9544p);
    }
}
