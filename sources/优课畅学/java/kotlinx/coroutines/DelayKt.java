package kotlinx.coroutines;

import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.InterfaceC9099c;
import kotlin.coroutines.InterfaceC9100d;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.time.DurationUnit;
import p123h7.C8736p;
import p124h8.AbstractC8740c;
import p124h8.C8738a;
import p135i8.AbstractC8828d0;
import p179m7.InterfaceC9324c;
import p190n7.AbstractC9434a;
import p201o7.AbstractC9541f;

/* loaded from: classes5.dex */
public abstract class DelayKt {
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object m16226a(p179m7.InterfaceC9324c r4) throws java.lang.Throwable {
        /*
            boolean r0 = r4 instanceof kotlinx.coroutines.DelayKt$awaitCancellation$1
            if (r0 == 0) goto L13
            r0 = r4
            kotlinx.coroutines.DelayKt$awaitCancellation$1 r0 = (kotlinx.coroutines.DelayKt$awaitCancellation$1) r0
            int r1 = r0.f17560b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f17560b = r1
            goto L18
        L13:
            kotlinx.coroutines.DelayKt$awaitCancellation$1 r0 = new kotlinx.coroutines.DelayKt$awaitCancellation$1
            r0.<init>(r4)
        L18:
            java.lang.Object r4 = r0.f17559a
            java.lang.Object r1 = p190n7.AbstractC9434a.m17291f()
            int r2 = r0.f17560b
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 == r3) goto L2d
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r0)
            throw r4
        L2d:
            kotlin.AbstractC9079b.m15926b(r4)
            goto L52
        L31:
            kotlin.AbstractC9079b.m15926b(r4)
            r0.f17560b = r3
            kotlinx.coroutines.c r4 = new kotlinx.coroutines.c
            m7.c r2 = kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.m16079d(r0)
            r4.<init>(r2, r3)
            r4.m16343D()
            java.lang.Object r4 = r4.m16372x()
            java.lang.Object r2 = p190n7.AbstractC9434a.m17291f()
            if (r4 != r2) goto L4f
            p201o7.AbstractC9541f.m17811c(r0)
        L4f:
            if (r4 != r1) goto L52
            return r1
        L52:
            kotlin.KotlinNothingValueException r4 = new kotlin.KotlinNothingValueException
            r4.<init>()
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.DelayKt.m16226a(m7.c):java.lang.Object");
    }

    /* renamed from: b */
    public static final Object m16227b(long j10, InterfaceC9324c interfaceC9324c) {
        if (j10 <= 0) {
            return C8736p.f16368a;
        }
        C9155c c9155c = new C9155c(IntrinsicsKt__IntrinsicsJvmKt.m16079d(interfaceC9324c), 1);
        c9155c.m16343D();
        if (j10 < Long.MAX_VALUE) {
            m16228c(c9155c.getContext()).mo16336g(j10, c9155c);
        }
        Object objM16372x = c9155c.m16372x();
        if (objM16372x == AbstractC9434a.m17291f()) {
            AbstractC9541f.m17811c(interfaceC9324c);
        }
        return objM16372x == AbstractC9434a.m17291f() ? objM16372x : C8736p.f16368a;
    }

    /* renamed from: c */
    public static final InterfaceC9203g m16228c(InterfaceC9100d interfaceC9100d) {
        InterfaceC9100d.b bVar = interfaceC9100d.get(InterfaceC9099c.f17441b0);
        InterfaceC9203g interfaceC9203g = bVar instanceof InterfaceC9203g ? (InterfaceC9203g) bVar : null;
        return interfaceC9203g == null ? AbstractC8828d0.m14827a() : interfaceC9203g;
    }

    /* renamed from: d */
    public static final long m16229d(long j10) {
        boolean zM14331D = C8738a.m14331D(j10);
        if (zM14331D) {
            return C8738a.m14350o(C8738a.m14332E(j10, AbstractC8740c.m14388t(999999L, DurationUnit.f17527b)));
        }
        if (zM14331D) {
            throw new NoWhenBranchMatchedException();
        }
        return 0L;
    }
}
