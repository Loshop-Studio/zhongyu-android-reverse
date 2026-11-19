package androidx.compose.foundation.gestures;

import androidx.compose.p014ui.geometry.Rect;
import androidx.compose.p014ui.unit.Density;
import androidx.compose.p014ui.unit.DpRect;
import androidx.compose.runtime.Stable;
import androidx.compose.runtime.internal.StabilityInferred;
import be.AbstractC5194f;
import be.InterfaceC5189a;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p409xc.InterfaceC11829d;
import vc.InterfaceC11588c;

@StabilityInferred(parameters = 1)
/* loaded from: classes.dex */
public final class PressGestureScopeImpl implements PressGestureScope, Density {
    public static final int $stable = 0;
    private final /* synthetic */ Density $$delegate_0;
    private boolean isCanceled;
    private boolean isReleased;
    private final InterfaceC5189a mutex = AbstractC5194f.m2744a(false);

    @InterfaceC11829d(m26210c = "androidx.compose.foundation.gestures.PressGestureScopeImpl", m26211f = "TapGestureDetector.kt", m26212l = {537}, m26213m = "awaitRelease")
    /* renamed from: androidx.compose.foundation.gestures.PressGestureScopeImpl$awaitRelease$1 */
    public static final class C13311 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        public C13311(InterfaceC11588c<? super C13311> interfaceC11588c) {
            super(interfaceC11588c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return PressGestureScopeImpl.this.awaitRelease(this);
        }
    }

    @InterfaceC11829d(m26210c = "androidx.compose.foundation.gestures.PressGestureScopeImpl", m26211f = "TapGestureDetector.kt", m26212l = {531}, m26213m = "reset")
    /* renamed from: androidx.compose.foundation.gestures.PressGestureScopeImpl$reset$1 */
    public static final class C13321 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C13321(InterfaceC11588c<? super C13321> interfaceC11588c) {
            super(interfaceC11588c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return PressGestureScopeImpl.this.reset(this);
        }
    }

    @InterfaceC11829d(m26210c = "androidx.compose.foundation.gestures.PressGestureScopeImpl", m26211f = "TapGestureDetector.kt", m26212l = {544}, m26213m = "tryAwaitRelease")
    /* renamed from: androidx.compose.foundation.gestures.PressGestureScopeImpl$tryAwaitRelease$1 */
    public static final class C13331 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C13331(InterfaceC11588c<? super C13331> interfaceC11588c) {
            super(interfaceC11588c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return PressGestureScopeImpl.this.tryAwaitRelease(this);
        }
    }

    public PressGestureScopeImpl(Density density) {
        this.$$delegate_0 = density;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // androidx.compose.foundation.gestures.PressGestureScope
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object awaitRelease(vc.InterfaceC11588c<? super p309qc.C10786q> r5) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r5 instanceof androidx.compose.foundation.gestures.PressGestureScopeImpl.C13311
            if (r0 == 0) goto L13
            r0 = r5
            androidx.compose.foundation.gestures.PressGestureScopeImpl$awaitRelease$1 r0 = (androidx.compose.foundation.gestures.PressGestureScopeImpl.C13311) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.compose.foundation.gestures.PressGestureScopeImpl$awaitRelease$1 r0 = new androidx.compose.foundation.gestures.PressGestureScopeImpl$awaitRelease$1
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.result
            java.lang.Object r1 = p393wc.AbstractC11725a.m25952f()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            kotlin.AbstractC9924b.m20071b(r5)
            goto L3d
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L31:
            kotlin.AbstractC9924b.m20071b(r5)
            r0.label = r3
            java.lang.Object r5 = r4.tryAwaitRelease(r0)
            if (r5 != r1) goto L3d
            return r1
        L3d:
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            if (r5 == 0) goto L48
            qc.q r5 = p309qc.C10786q.f26013a
            return r5
        L48:
            androidx.compose.foundation.gestures.GestureCancellationException r5 = new androidx.compose.foundation.gestures.GestureCancellationException
            java.lang.String r0 = "The press gesture was canceled."
            r5.<init>(r0)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.PressGestureScopeImpl.awaitRelease(vc.c):java.lang.Object");
    }

    public final void cancel() {
        this.isCanceled = true;
        if (this.mutex.isLocked()) {
            InterfaceC5189a.a.m2743c(this.mutex, null, 1, null);
        }
    }

    @Override // androidx.compose.p014ui.unit.Density
    public float getDensity() {
        return this.$$delegate_0.getDensity();
    }

    @Override // androidx.compose.p014ui.unit.FontScaling
    public float getFontScale() {
        return this.$$delegate_0.getFontScale();
    }

    public final void release() {
        this.isReleased = true;
        if (this.mutex.isLocked()) {
            InterfaceC5189a.a.m2743c(this.mutex, null, 1, null);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object reset(vc.InterfaceC11588c<? super p309qc.C10786q> r5) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r5 instanceof androidx.compose.foundation.gestures.PressGestureScopeImpl.C13321
            if (r0 == 0) goto L13
            r0 = r5
            androidx.compose.foundation.gestures.PressGestureScopeImpl$reset$1 r0 = (androidx.compose.foundation.gestures.PressGestureScopeImpl.C13321) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.compose.foundation.gestures.PressGestureScopeImpl$reset$1 r0 = new androidx.compose.foundation.gestures.PressGestureScopeImpl$reset$1
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.result
            java.lang.Object r1 = p393wc.AbstractC11725a.m25952f()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r0 = r0.L$0
            androidx.compose.foundation.gestures.PressGestureScopeImpl r0 = (androidx.compose.foundation.gestures.PressGestureScopeImpl) r0
            kotlin.AbstractC9924b.m20071b(r5)
            goto L47
        L2d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L35:
            kotlin.AbstractC9924b.m20071b(r5)
            be.a r5 = r4.mutex
            r0.L$0 = r4
            r0.label = r3
            r2 = 0
            java.lang.Object r5 = be.InterfaceC5189a.a.m2741a(r5, r2, r0, r3, r2)
            if (r5 != r1) goto L46
            return r1
        L46:
            r0 = r4
        L47:
            r5 = 0
            r0.isReleased = r5
            r0.isCanceled = r5
            qc.q r5 = p309qc.C10786q.f26013a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.PressGestureScopeImpl.reset(vc.c):java.lang.Object");
    }

    @Override // androidx.compose.p014ui.unit.Density
    @Stable
    /* renamed from: roundToPx--R2X_6o */
    public int mo27092roundToPxR2X_6o(long j10) {
        return this.$$delegate_0.mo27092roundToPxR2X_6o(j10);
    }

    @Override // androidx.compose.p014ui.unit.Density
    @Stable
    /* renamed from: roundToPx-0680j_4 */
    public int mo27093roundToPx0680j_4(float f10) {
        return this.$$delegate_0.mo27093roundToPx0680j_4(f10);
    }

    @Override // androidx.compose.p014ui.unit.FontScaling
    @Stable
    /* renamed from: toDp-GaN1DYA */
    public float mo27094toDpGaN1DYA(long j10) {
        return this.$$delegate_0.mo27094toDpGaN1DYA(j10);
    }

    @Override // androidx.compose.p014ui.unit.Density
    @Stable
    /* renamed from: toDp-u2uoSUM */
    public float mo27095toDpu2uoSUM(float f10) {
        return this.$$delegate_0.mo27095toDpu2uoSUM(f10);
    }

    @Override // androidx.compose.p014ui.unit.Density
    @Stable
    /* renamed from: toDpSize-k-rfVVM */
    public long mo27097toDpSizekrfVVM(long j10) {
        return this.$$delegate_0.mo27097toDpSizekrfVVM(j10);
    }

    @Override // androidx.compose.p014ui.unit.Density
    @Stable
    /* renamed from: toPx--R2X_6o */
    public float mo27098toPxR2X_6o(long j10) {
        return this.$$delegate_0.mo27098toPxR2X_6o(j10);
    }

    @Override // androidx.compose.p014ui.unit.Density
    @Stable
    /* renamed from: toPx-0680j_4 */
    public float mo27099toPx0680j_4(float f10) {
        return this.$$delegate_0.mo27099toPx0680j_4(f10);
    }

    @Override // androidx.compose.p014ui.unit.Density
    @Stable
    public Rect toRect(DpRect dpRect) {
        return this.$$delegate_0.toRect(dpRect);
    }

    @Override // androidx.compose.p014ui.unit.Density
    @Stable
    /* renamed from: toSize-XkaWNTQ */
    public long mo27100toSizeXkaWNTQ(long j10) {
        return this.$$delegate_0.mo27100toSizeXkaWNTQ(j10);
    }

    @Override // androidx.compose.p014ui.unit.FontScaling
    @Stable
    /* renamed from: toSp-0xMU5do */
    public long mo27101toSp0xMU5do(float f10) {
        return this.$$delegate_0.mo27101toSp0xMU5do(f10);
    }

    @Override // androidx.compose.p014ui.unit.Density
    @Stable
    /* renamed from: toSp-kPz2Gy4 */
    public long mo27102toSpkPz2Gy4(float f10) {
        return this.$$delegate_0.mo27102toSpkPz2Gy4(f10);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // androidx.compose.foundation.gestures.PressGestureScope
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object tryAwaitRelease(vc.InterfaceC11588c<? super java.lang.Boolean> r6) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r6 instanceof androidx.compose.foundation.gestures.PressGestureScopeImpl.C13331
            if (r0 == 0) goto L13
            r0 = r6
            androidx.compose.foundation.gestures.PressGestureScopeImpl$tryAwaitRelease$1 r0 = (androidx.compose.foundation.gestures.PressGestureScopeImpl.C13331) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.compose.foundation.gestures.PressGestureScopeImpl$tryAwaitRelease$1 r0 = new androidx.compose.foundation.gestures.PressGestureScopeImpl$tryAwaitRelease$1
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.result
            java.lang.Object r1 = p393wc.AbstractC11725a.m25952f()
            int r2 = r0.label
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L36
            if (r2 != r4) goto L2e
            java.lang.Object r0 = r0.L$0
            androidx.compose.foundation.gestures.PressGestureScopeImpl r0 = (androidx.compose.foundation.gestures.PressGestureScopeImpl) r0
            kotlin.AbstractC9924b.m20071b(r6)
            goto L4f
        L2e:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L36:
            kotlin.AbstractC9924b.m20071b(r6)
            boolean r6 = r5.isReleased
            if (r6 != 0) goto L55
            boolean r6 = r5.isCanceled
            if (r6 != 0) goto L55
            be.a r6 = r5.mutex
            r0.L$0 = r5
            r0.label = r4
            java.lang.Object r6 = be.InterfaceC5189a.a.m2741a(r6, r3, r0, r4, r3)
            if (r6 != r1) goto L4e
            return r1
        L4e:
            r0 = r5
        L4f:
            be.a r6 = r0.mutex
            be.InterfaceC5189a.a.m2743c(r6, r3, r4, r3)
            goto L56
        L55:
            r0 = r5
        L56:
            boolean r6 = r0.isReleased
            java.lang.Boolean r6 = p409xc.AbstractC11826a.m26206a(r6)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.PressGestureScopeImpl.tryAwaitRelease(vc.c):java.lang.Object");
    }

    @Override // androidx.compose.p014ui.unit.Density
    @Stable
    /* renamed from: toDp-u2uoSUM */
    public float mo27096toDpu2uoSUM(int i10) {
        return this.$$delegate_0.mo27096toDpu2uoSUM(i10);
    }

    @Override // androidx.compose.p014ui.unit.Density
    @Stable
    /* renamed from: toSp-kPz2Gy4 */
    public long mo27103toSpkPz2Gy4(int i10) {
        return this.$$delegate_0.mo27103toSpkPz2Gy4(i10);
    }
}
