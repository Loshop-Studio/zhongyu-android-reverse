package kotlinx.coroutines.flow;

import kotlin.jvm.internal.Ref$BooleanRef;
import p075h6.InterfaceC5631c;

/* renamed from: kotlinx.coroutines.flow.j0 */
/* loaded from: classes4.dex */
public final class C5938j0 implements InterfaceC5912g {

    /* renamed from: a */
    public final /* synthetic */ Ref$BooleanRef f9415a;

    /* renamed from: b */
    public final /* synthetic */ InterfaceC5912g f9416b;

    public C5938j0(Ref$BooleanRef ref$BooleanRef, InterfaceC5912g interfaceC5912g) {
        this.f9415a = ref$BooleanRef;
        this.f9416b = interfaceC5912g;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m5568b(int r6, p075h6.InterfaceC5631c r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof kotlinx.coroutines.flow.StartedLazily$command$1$1$emit$1
            if (r0 == 0) goto L13
            r0 = r7
            kotlinx.coroutines.flow.StartedLazily$command$1$1$emit$1 r0 = (kotlinx.coroutines.flow.StartedLazily$command$1$1$emit$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            kotlinx.coroutines.flow.StartedLazily$command$1$1$emit$1 r0 = new kotlinx.coroutines.flow.StartedLazily$command$1$1$emit$1
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.label
            d6.s r3 = p045d6.C5443s.f8405a
            r4 = 1
            if (r2 == 0) goto L31
            if (r2 != r4) goto L29
            kotlin.AbstractC5774b.m5119b(r7)
            goto L4b
        L29:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L31:
            kotlin.AbstractC5774b.m5119b(r7)
            if (r6 <= 0) goto L4b
            kotlin.jvm.internal.Ref$BooleanRef r6 = r5.f9415a
            boolean r7 = r6.element
            if (r7 != 0) goto L4b
            r6.element = r4
            kotlinx.coroutines.flow.SharingCommand r6 = kotlinx.coroutines.flow.SharingCommand.START
            r0.label = r4
            kotlinx.coroutines.flow.g r7 = r5.f9416b
            java.lang.Object r6 = r7.emit(r6, r0)
            if (r6 != r1) goto L4b
            return r1
        L4b:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.C5938j0.m5568b(int, h6.c):java.lang.Object");
    }

    @Override // kotlinx.coroutines.flow.InterfaceC5912g
    public final /* bridge */ /* synthetic */ Object emit(Object obj, InterfaceC5631c interfaceC5631c) {
        return m5568b(((Number) obj).intValue(), interfaceC5631c);
    }
}
