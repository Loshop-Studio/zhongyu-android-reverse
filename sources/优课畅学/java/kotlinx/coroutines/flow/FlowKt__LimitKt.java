package kotlinx.coroutines.flow;

import kotlin.jvm.internal.Ref$BooleanRef;
import kotlin.jvm.internal.Ref$IntRef;
import p123h7.C8736p;
import p169l8.InterfaceC9266c;
import p169l8.InterfaceC9267d;
import p179m7.InterfaceC9324c;
import p190n7.AbstractC9434a;
import p300x7.InterfaceC10574p;

/* loaded from: classes5.dex */
public abstract /* synthetic */ class FlowKt__LimitKt {

    /* renamed from: kotlinx.coroutines.flow.FlowKt__LimitKt$a */
    public static final class C9178a implements InterfaceC9266c {

        /* renamed from: a */
        public final /* synthetic */ InterfaceC9266c f17801a;

        /* renamed from: b */
        public final /* synthetic */ int f17802b;

        public C9178a(InterfaceC9266c interfaceC9266c, int i10) {
            this.f17801a = interfaceC9266c;
            this.f17802b = i10;
        }

        @Override // p169l8.InterfaceC9266c
        public Object collect(InterfaceC9267d interfaceC9267d, InterfaceC9324c interfaceC9324c) {
            Object objCollect = this.f17801a.collect(new FlowKt__LimitKt$drop$2$1(new Ref$IntRef(), this.f17802b, interfaceC9267d), interfaceC9324c);
            return objCollect == AbstractC9434a.m17291f() ? objCollect : C8736p.f16368a;
        }
    }

    /* renamed from: kotlinx.coroutines.flow.FlowKt__LimitKt$b */
    public static final class C9179b implements InterfaceC9266c {

        /* renamed from: a */
        public final /* synthetic */ InterfaceC9266c f17803a;

        /* renamed from: b */
        public final /* synthetic */ InterfaceC10574p f17804b;

        public C9179b(InterfaceC9266c interfaceC9266c, InterfaceC10574p interfaceC10574p) {
            this.f17803a = interfaceC9266c;
            this.f17804b = interfaceC10574p;
        }

        @Override // p169l8.InterfaceC9266c
        public Object collect(InterfaceC9267d interfaceC9267d, InterfaceC9324c interfaceC9324c) {
            Object objCollect = this.f17803a.collect(new FlowKt__LimitKt$dropWhile$1$1(new Ref$BooleanRef(), interfaceC9267d, this.f17804b), interfaceC9324c);
            return objCollect == AbstractC9434a.m17291f() ? objCollect : C8736p.f16368a;
        }
    }

    /* renamed from: b */
    public static final InterfaceC9266c m16604b(InterfaceC9266c interfaceC9266c, int i10) {
        if (i10 >= 0) {
            return new C9178a(interfaceC9266c, i10);
        }
        throw new IllegalArgumentException(("Drop count should be non-negative, but had " + i10).toString());
    }

    /* renamed from: c */
    public static final InterfaceC9266c m16605c(InterfaceC9266c interfaceC9266c, InterfaceC10574p interfaceC10574p) {
        return new C9179b(interfaceC9266c, interfaceC10574p);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object m16606d(p169l8.InterfaceC9267d r4, java.lang.Object r5, java.lang.Object r6, p179m7.InterfaceC9324c r7) throws java.lang.Throwable {
        /*
            boolean r0 = r7 instanceof kotlinx.coroutines.flow.FlowKt__LimitKt$emitAbort$1
            if (r0 == 0) goto L13
            r0 = r7
            kotlinx.coroutines.flow.FlowKt__LimitKt$emitAbort$1 r0 = (kotlinx.coroutines.flow.FlowKt__LimitKt$emitAbort$1) r0
            int r1 = r0.f17821c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f17821c = r1
            goto L18
        L13:
            kotlinx.coroutines.flow.FlowKt__LimitKt$emitAbort$1 r0 = new kotlinx.coroutines.flow.FlowKt__LimitKt$emitAbort$1
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f17820b
            java.lang.Object r1 = p190n7.AbstractC9434a.m17291f()
            int r2 = r0.f17821c
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 == r3) goto L2d
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L2d:
            java.lang.Object r6 = r0.f17819a
            kotlin.AbstractC9079b.m15926b(r7)
            goto L41
        L33:
            kotlin.AbstractC9079b.m15926b(r7)
            r0.f17819a = r6
            r0.f17821c = r3
            java.lang.Object r4 = r4.emit(r5, r0)
            if (r4 != r1) goto L41
            return r1
        L41:
            kotlinx.coroutines.flow.internal.AbortFlowException r4 = new kotlinx.coroutines.flow.internal.AbortFlowException
            r4.<init>(r6)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.FlowKt__LimitKt.m16606d(l8.d, java.lang.Object, java.lang.Object, m7.c):java.lang.Object");
    }

    /* renamed from: e */
    public static final InterfaceC9266c m16607e(InterfaceC9266c interfaceC9266c, int i10) {
        if (i10 > 0) {
            return new FlowKt__LimitKt$take$$inlined$unsafeFlow$1(interfaceC9266c, i10);
        }
        throw new IllegalArgumentException(("Requested element count " + i10 + " should be positive").toString());
    }

    /* renamed from: f */
    public static final InterfaceC9266c m16608f(InterfaceC9266c interfaceC9266c, InterfaceC10574p interfaceC10574p) {
        return new FlowKt__LimitKt$takeWhile$$inlined$unsafeFlow$1(interfaceC9266c, interfaceC10574p);
    }
}
