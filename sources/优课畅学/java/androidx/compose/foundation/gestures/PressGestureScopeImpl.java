package androidx.compose.foundation.gestures;

import androidx.compose.p013ui.geometry.Rect;
import androidx.compose.p013ui.unit.Density;
import androidx.compose.p013ui.unit.DpRect;
import androidx.compose.runtime.Stable;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p179m7.InterfaceC9324c;
import p201o7.InterfaceC9539d;
import p235r8.AbstractC9943b;
import p235r8.InterfaceC9942a;

@StabilityInferred(parameters = 1)
/* loaded from: classes.dex */
public final class PressGestureScopeImpl implements PressGestureScope, Density {
    public static final int $stable = 0;
    private final /* synthetic */ Density $$delegate_0;
    private boolean isCanceled;
    private boolean isReleased;
    private final InterfaceC9942a mutex = AbstractC9943b.m18570a(false);

    @InterfaceC9539d(m17800c = "androidx.compose.foundation.gestures.PressGestureScopeImpl", m17801f = "TapGestureDetector.kt", m17802l = {537}, m17803m = "awaitRelease")
    /* renamed from: androidx.compose.foundation.gestures.PressGestureScopeImpl$awaitRelease$1 */
    public static final class C13011 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        public C13011(InterfaceC9324c<? super C13011> interfaceC9324c) {
            super(interfaceC9324c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return PressGestureScopeImpl.this.awaitRelease(this);
        }
    }

    @InterfaceC9539d(m17800c = "androidx.compose.foundation.gestures.PressGestureScopeImpl", m17801f = "TapGestureDetector.kt", m17802l = {531}, m17803m = "reset")
    /* renamed from: androidx.compose.foundation.gestures.PressGestureScopeImpl$reset$1 */
    public static final class C13021 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C13021(InterfaceC9324c<? super C13021> interfaceC9324c) {
            super(interfaceC9324c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return PressGestureScopeImpl.this.reset(this);
        }
    }

    @InterfaceC9539d(m17800c = "androidx.compose.foundation.gestures.PressGestureScopeImpl", m17801f = "TapGestureDetector.kt", m17802l = {544}, m17803m = "tryAwaitRelease")
    /* renamed from: androidx.compose.foundation.gestures.PressGestureScopeImpl$tryAwaitRelease$1 */
    public static final class C13031 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C13031(InterfaceC9324c<? super C13031> interfaceC9324c) {
            super(interfaceC9324c);
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
    public java.lang.Object awaitRelease(p179m7.InterfaceC9324c<? super p123h7.C8736p> r5) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r5 instanceof androidx.compose.foundation.gestures.PressGestureScopeImpl.C13011
            if (r0 == 0) goto L13
            r0 = r5
            androidx.compose.foundation.gestures.PressGestureScopeImpl$awaitRelease$1 r0 = (androidx.compose.foundation.gestures.PressGestureScopeImpl.C13011) r0
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
            java.lang.Object r1 = p190n7.AbstractC9434a.m17291f()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            kotlin.AbstractC9079b.m15926b(r5)
            goto L3d
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L31:
            kotlin.AbstractC9079b.m15926b(r5)
            r0.label = r3
            java.lang.Object r5 = r4.tryAwaitRelease(r0)
            if (r5 != r1) goto L3d
            return r1
        L3d:
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            if (r5 == 0) goto L48
            h7.p r5 = p123h7.C8736p.f16368a
            return r5
        L48:
            androidx.compose.foundation.gestures.GestureCancellationException r5 = new androidx.compose.foundation.gestures.GestureCancellationException
            java.lang.String r0 = "The press gesture was canceled."
            r5.<init>(r0)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.PressGestureScopeImpl.awaitRelease(m7.c):java.lang.Object");
    }

    public final void cancel() {
        this.isCanceled = true;
        if (this.mutex.isLocked()) {
            InterfaceC9942a.a.m18569c(this.mutex, null, 1, null);
        }
    }

    @Override // androidx.compose.p013ui.unit.Density
    public float getDensity() {
        return this.$$delegate_0.getDensity();
    }

    @Override // androidx.compose.p013ui.unit.FontScaling
    public float getFontScale() {
        return this.$$delegate_0.getFontScale();
    }

    public final void release() {
        this.isReleased = true;
        if (this.mutex.isLocked()) {
            InterfaceC9942a.a.m18569c(this.mutex, null, 1, null);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object reset(p179m7.InterfaceC9324c<? super p123h7.C8736p> r5) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r5 instanceof androidx.compose.foundation.gestures.PressGestureScopeImpl.C13021
            if (r0 == 0) goto L13
            r0 = r5
            androidx.compose.foundation.gestures.PressGestureScopeImpl$reset$1 r0 = (androidx.compose.foundation.gestures.PressGestureScopeImpl.C13021) r0
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
            java.lang.Object r1 = p190n7.AbstractC9434a.m17291f()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r0 = r0.L$0
            androidx.compose.foundation.gestures.PressGestureScopeImpl r0 = (androidx.compose.foundation.gestures.PressGestureScopeImpl) r0
            kotlin.AbstractC9079b.m15926b(r5)
            goto L47
        L2d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L35:
            kotlin.AbstractC9079b.m15926b(r5)
            r8.a r5 = r4.mutex
            r0.L$0 = r4
            r0.label = r3
            r2 = 0
            java.lang.Object r5 = p235r8.InterfaceC9942a.a.m18567a(r5, r2, r0, r3, r2)
            if (r5 != r1) goto L46
            return r1
        L46:
            r0 = r4
        L47:
            r5 = 0
            r0.isReleased = r5
            r0.isCanceled = r5
            h7.p r5 = p123h7.C8736p.f16368a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.PressGestureScopeImpl.reset(m7.c):java.lang.Object");
    }

    @Override // androidx.compose.p013ui.unit.Density
    @Stable
    /* renamed from: roundToPx--R2X_6o */
    public int mo20490roundToPxR2X_6o(long j10) {
        return this.$$delegate_0.mo20490roundToPxR2X_6o(j10);
    }

    @Override // androidx.compose.p013ui.unit.Density
    @Stable
    /* renamed from: roundToPx-0680j_4 */
    public int mo20491roundToPx0680j_4(float f10) {
        return this.$$delegate_0.mo20491roundToPx0680j_4(f10);
    }

    @Override // androidx.compose.p013ui.unit.FontScaling
    @Stable
    /* renamed from: toDp-GaN1DYA */
    public float mo20492toDpGaN1DYA(long j10) {
        return this.$$delegate_0.mo20492toDpGaN1DYA(j10);
    }

    @Override // androidx.compose.p013ui.unit.Density
    @Stable
    /* renamed from: toDp-u2uoSUM */
    public float mo20493toDpu2uoSUM(float f10) {
        return this.$$delegate_0.mo20493toDpu2uoSUM(f10);
    }

    @Override // androidx.compose.p013ui.unit.Density
    @Stable
    /* renamed from: toDpSize-k-rfVVM */
    public long mo20495toDpSizekrfVVM(long j10) {
        return this.$$delegate_0.mo20495toDpSizekrfVVM(j10);
    }

    @Override // androidx.compose.p013ui.unit.Density
    @Stable
    /* renamed from: toPx--R2X_6o */
    public float mo20496toPxR2X_6o(long j10) {
        return this.$$delegate_0.mo20496toPxR2X_6o(j10);
    }

    @Override // androidx.compose.p013ui.unit.Density
    @Stable
    /* renamed from: toPx-0680j_4 */
    public float mo20497toPx0680j_4(float f10) {
        return this.$$delegate_0.mo20497toPx0680j_4(f10);
    }

    @Override // androidx.compose.p013ui.unit.Density
    @Stable
    public Rect toRect(DpRect dpRect) {
        return this.$$delegate_0.toRect(dpRect);
    }

    @Override // androidx.compose.p013ui.unit.Density
    @Stable
    /* renamed from: toSize-XkaWNTQ */
    public long mo20498toSizeXkaWNTQ(long j10) {
        return this.$$delegate_0.mo20498toSizeXkaWNTQ(j10);
    }

    @Override // androidx.compose.p013ui.unit.FontScaling
    @Stable
    /* renamed from: toSp-0xMU5do */
    public long mo20499toSp0xMU5do(float f10) {
        return this.$$delegate_0.mo20499toSp0xMU5do(f10);
    }

    @Override // androidx.compose.p013ui.unit.Density
    @Stable
    /* renamed from: toSp-kPz2Gy4 */
    public long mo20500toSpkPz2Gy4(float f10) {
        return this.$$delegate_0.mo20500toSpkPz2Gy4(f10);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // androidx.compose.foundation.gestures.PressGestureScope
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object tryAwaitRelease(p179m7.InterfaceC9324c<? super java.lang.Boolean> r6) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r6 instanceof androidx.compose.foundation.gestures.PressGestureScopeImpl.C13031
            if (r0 == 0) goto L13
            r0 = r6
            androidx.compose.foundation.gestures.PressGestureScopeImpl$tryAwaitRelease$1 r0 = (androidx.compose.foundation.gestures.PressGestureScopeImpl.C13031) r0
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
            java.lang.Object r1 = p190n7.AbstractC9434a.m17291f()
            int r2 = r0.label
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L36
            if (r2 != r4) goto L2e
            java.lang.Object r0 = r0.L$0
            androidx.compose.foundation.gestures.PressGestureScopeImpl r0 = (androidx.compose.foundation.gestures.PressGestureScopeImpl) r0
            kotlin.AbstractC9079b.m15926b(r6)
            goto L4f
        L2e:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L36:
            kotlin.AbstractC9079b.m15926b(r6)
            boolean r6 = r5.isReleased
            if (r6 != 0) goto L55
            boolean r6 = r5.isCanceled
            if (r6 != 0) goto L55
            r8.a r6 = r5.mutex
            r0.L$0 = r5
            r0.label = r4
            java.lang.Object r6 = p235r8.InterfaceC9942a.a.m18567a(r6, r3, r0, r4, r3)
            if (r6 != r1) goto L4e
            return r1
        L4e:
            r0 = r5
        L4f:
            r8.a r6 = r0.mutex
            p235r8.InterfaceC9942a.a.m18569c(r6, r3, r4, r3)
            goto L56
        L55:
            r0 = r5
        L56:
            boolean r6 = r0.isReleased
            java.lang.Boolean r6 = p201o7.AbstractC9536a.m17796a(r6)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.PressGestureScopeImpl.tryAwaitRelease(m7.c):java.lang.Object");
    }

    @Override // androidx.compose.p013ui.unit.Density
    @Stable
    /* renamed from: toDp-u2uoSUM */
    public float mo20494toDpu2uoSUM(int i10) {
        return this.$$delegate_0.mo20494toDpu2uoSUM(i10);
    }

    @Override // androidx.compose.p013ui.unit.Density
    @Stable
    /* renamed from: toSp-kPz2Gy4 */
    public long mo20501toSpkPz2Gy4(int i10) {
        return this.$$delegate_0.mo20501toSpkPz2Gy4(i10);
    }
}
