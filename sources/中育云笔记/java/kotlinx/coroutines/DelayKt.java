package kotlinx.coroutines;

import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.InterfaceC9944c;
import kotlin.coroutines.InterfaceC9945d;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.time.DurationUnit;
import p309qc.C10786q;
import p326rd.AbstractC10988c;
import p326rd.C10986a;
import p393wc.AbstractC11725a;
import p409xc.AbstractC11831f;
import sd.AbstractC11134l0;
import sd.InterfaceC11146o0;
import vc.InterfaceC11588c;

/* loaded from: classes6.dex */
public abstract class DelayKt {
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object m20375a(vc.InterfaceC11588c r4) throws java.lang.Throwable {
        /*
            boolean r0 = r4 instanceof kotlinx.coroutines.DelayKt$awaitCancellation$1
            if (r0 == 0) goto L13
            r0 = r4
            kotlinx.coroutines.DelayKt$awaitCancellation$1 r0 = (kotlinx.coroutines.DelayKt$awaitCancellation$1) r0
            int r1 = r0.f23484d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f23484d = r1
            goto L18
        L13:
            kotlinx.coroutines.DelayKt$awaitCancellation$1 r0 = new kotlinx.coroutines.DelayKt$awaitCancellation$1
            r0.<init>(r4)
        L18:
            java.lang.Object r4 = r0.f23483c
            java.lang.Object r1 = p393wc.AbstractC11725a.m25952f()
            int r2 = r0.f23484d
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 == r3) goto L2d
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r0)
            throw r4
        L2d:
            kotlin.AbstractC9924b.m20071b(r4)
            goto L52
        L31:
            kotlin.AbstractC9924b.m20071b(r4)
            r0.f23484d = r3
            kotlinx.coroutines.c r4 = new kotlinx.coroutines.c
            vc.c r2 = kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.m20224d(r0)
            r4.<init>(r2, r3)
            r4.m20503F()
            java.lang.Object r4 = r4.m20538x()
            java.lang.Object r2 = p393wc.AbstractC11725a.m25952f()
            if (r4 != r2) goto L4f
            p409xc.AbstractC11831f.m26221c(r0)
        L4f:
            if (r4 != r1) goto L52
            return r1
        L52:
            kotlin.KotlinNothingValueException r4 = new kotlin.KotlinNothingValueException
            r4.<init>()
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.DelayKt.m20375a(vc.c):java.lang.Object");
    }

    /* renamed from: b */
    public static final Object m20376b(long j10, InterfaceC11588c interfaceC11588c) {
        if (j10 <= 0) {
            return C10786q.f26013a;
        }
        C9997c c9997c = new C9997c(IntrinsicsKt__IntrinsicsJvmKt.m20224d(interfaceC11588c), 1);
        c9997c.m20503F();
        if (j10 < Long.MAX_VALUE) {
            m20377c(c9997c.getContext()).mo24711d(j10, c9997c);
        }
        Object objM20538x = c9997c.m20538x();
        if (objM20538x == AbstractC11725a.m25952f()) {
            AbstractC11831f.m26221c(interfaceC11588c);
        }
        return objM20538x == AbstractC11725a.m25952f() ? objM20538x : C10786q.f26013a;
    }

    /* renamed from: c */
    public static final InterfaceC11146o0 m20377c(InterfaceC9945d interfaceC9945d) {
        InterfaceC9945d.b bVar = interfaceC9945d.get(InterfaceC9944c.f23354a0);
        InterfaceC11146o0 interfaceC11146o0 = bVar instanceof InterfaceC11146o0 ? (InterfaceC11146o0) bVar : null;
        return interfaceC11146o0 == null ? AbstractC11134l0.m24749a() : interfaceC11146o0;
    }

    /* renamed from: d */
    public static final long m20378d(long j10) {
        boolean zM24172D = C10986a.m24172D(j10);
        if (zM24172D) {
            return C10986a.m24191o(C10986a.m24173E(j10, AbstractC10988c.m24229t(999999L, DurationUnit.f23456d)));
        }
        if (zM24172D) {
            throw new NoWhenBranchMatchedException();
        }
        return 0L;
    }
}
