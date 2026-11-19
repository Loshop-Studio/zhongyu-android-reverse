package androidx.compose.foundation.gestures;

import androidx.compose.p011ui.geometry.Rect;
import androidx.compose.p011ui.unit.Density;
import androidx.compose.p011ui.unit.DpRect;
import androidx.compose.runtime.Stable;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlinx.coroutines.sync.C6001a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p075h6.InterfaceC5631c;
import p076h7.InterfaceC5638a;

@StabilityInferred(parameters = 1)
@Metadata(m5109d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\n\u001a\u00020\u0007*\u00020\u0006H\u0097\u0001ø\u0001\u0000¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\n\u001a\u00020\u0007*\u00020\u000bH\u0097\u0001ø\u0001\u0000¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u0006*\u00020\u000bH\u0097\u0001ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0010\u001a\u00020\u0006*\u00020\u0011H\u0097\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0010\u001a\u00020\u0006*\u00020\u0007H\u0097\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0014J\u0017\u0010\u0019\u001a\u00020\u0016*\u00020\u0015H\u0097\u0001ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001b\u001a\u00020\u0011*\u00020\u0006H\u0097\u0001ø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u0013J\u0017\u0010\u001b\u001a\u00020\u0011*\u00020\u000bH\u0097\u0001ø\u0001\u0000¢\u0006\u0004\b\u001c\u0010\u000fJ\u0014\u0010\u001f\u001a\u00020\u001e*\u00020\u001dH\u0097\u0001¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010\"\u001a\u00020\u0015*\u00020\u0016H\u0097\u0001ø\u0001\u0000¢\u0006\u0004\b!\u0010\u0018J\u0017\u0010%\u001a\u00020\u000b*\u00020\u0006H\u0097\u0001ø\u0001\u0000¢\u0006\u0004\b#\u0010$J\u001a\u0010%\u001a\u00020\u000b*\u00020\u0011H\u0097\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b&\u0010$J\u001a\u0010%\u001a\u00020\u000b*\u00020\u0007H\u0097\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b&\u0010'J\r\u0010)\u001a\u00020(¢\u0006\u0004\b)\u0010*J\r\u0010+\u001a\u00020(¢\u0006\u0004\b+\u0010*J\u0010\u0010,\u001a\u00020(H\u0086@¢\u0006\u0004\b,\u0010-J\u0010\u0010.\u001a\u00020(H\u0096@¢\u0006\u0004\b.\u0010-J\u0010\u00100\u001a\u00020/H\u0096@¢\u0006\u0004\b0\u0010-R\u0016\u00101\u001a\u00020/8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u00102R\u0016\u00103\u001a\u00020/8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u00102R\u0014\u00105\u001a\u0002048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00106R\u0014\u0010\u0003\u001a\u00020\u00118\u0016X\u0097\u0005¢\u0006\u0006\u001a\u0004\b7\u00108R\u0014\u0010:\u001a\u00020\u00118\u0016X\u0097\u0005¢\u0006\u0006\u001a\u0004\b9\u00108\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006;"}, m5110d2 = {"Landroidx/compose/foundation/gestures/PressGestureScopeImpl;", "Landroidx/compose/foundation/gestures/PressGestureScope;", "Landroidx/compose/ui/unit/Density;", "density", "<init>", "(Landroidx/compose/ui/unit/Density;)V", "Landroidx/compose/ui/unit/Dp;", "", "roundToPx-0680j_4", "(F)I", "roundToPx", "Landroidx/compose/ui/unit/TextUnit;", "roundToPx--R2X_6o", "(J)I", "toDp-GaN1DYA", "(J)F", "toDp", "", "toDp-u2uoSUM", "(F)F", "(I)F", "Landroidx/compose/ui/geometry/Size;", "Landroidx/compose/ui/unit/DpSize;", "toDpSize-k-rfVVM", "(J)J", "toDpSize", "toPx-0680j_4", "toPx", "toPx--R2X_6o", "Landroidx/compose/ui/unit/DpRect;", "Landroidx/compose/ui/geometry/Rect;", "toRect", "(Landroidx/compose/ui/unit/DpRect;)Landroidx/compose/ui/geometry/Rect;", "toSize-XkaWNTQ", "toSize", "toSp-0xMU5do", "(F)J", "toSp", "toSp-kPz2Gy4", "(I)J", "Ld6/s;", "cancel", "()V", "release", "reset", "(Lh6/c;)Ljava/lang/Object;", "awaitRelease", "", "tryAwaitRelease", "isReleased", "Z", "isCanceled", "Lh7/a;", "mutex", "Lh7/a;", "getDensity", "()F", "getFontScale", "fontScale", "foundation_release"}, m5111k = 1, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes.dex */
public final class PressGestureScopeImpl implements PressGestureScope, Density {
    public static final int $stable = 0;
    private final /* synthetic */ Density $$delegate_0;
    private boolean isCanceled;
    private boolean isReleased;

    @NotNull
    private final InterfaceC5638a mutex = new C6001a();

    @Metadata(m5111k = 3, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    @DebugMetadata(m5302c = "androidx.compose.foundation.gestures.PressGestureScopeImpl", m5303f = "TapGestureDetector.kt", m5304i = {}, m5305l = {537}, m5306m = "awaitRelease", m5307n = {}, m5308s = {})
    /* renamed from: androidx.compose.foundation.gestures.PressGestureScopeImpl$awaitRelease$1 */
    public static final class C08861 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        public C08861(InterfaceC5631c<? super C08861> interfaceC5631c) {
            super(interfaceC5631c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return PressGestureScopeImpl.this.awaitRelease(this);
        }
    }

    @Metadata(m5111k = 3, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    @DebugMetadata(m5302c = "androidx.compose.foundation.gestures.PressGestureScopeImpl", m5303f = "TapGestureDetector.kt", m5304i = {0}, m5305l = {531}, m5306m = "reset", m5307n = {"this"}, m5308s = {"L$0"})
    /* renamed from: androidx.compose.foundation.gestures.PressGestureScopeImpl$reset$1 */
    public static final class C08871 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C08871(InterfaceC5631c<? super C08871> interfaceC5631c) {
            super(interfaceC5631c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return PressGestureScopeImpl.this.reset(this);
        }
    }

    @Metadata(m5111k = 3, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    @DebugMetadata(m5302c = "androidx.compose.foundation.gestures.PressGestureScopeImpl", m5303f = "TapGestureDetector.kt", m5304i = {0}, m5305l = {544}, m5306m = "tryAwaitRelease", m5307n = {"this"}, m5308s = {"L$0"})
    /* renamed from: androidx.compose.foundation.gestures.PressGestureScopeImpl$tryAwaitRelease$1 */
    public static final class C08881 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C08881(InterfaceC5631c<? super C08881> interfaceC5631c) {
            super(interfaceC5631c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return PressGestureScopeImpl.this.tryAwaitRelease(this);
        }
    }

    public PressGestureScopeImpl(@NotNull Density density) {
        this.$$delegate_0 = density;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // androidx.compose.foundation.gestures.PressGestureScope
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object awaitRelease(@org.jetbrains.annotations.NotNull p075h6.InterfaceC5631c<? super p045d6.C5443s> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof androidx.compose.foundation.gestures.PressGestureScopeImpl.C08861
            if (r0 == 0) goto L13
            r0 = r5
            androidx.compose.foundation.gestures.PressGestureScopeImpl$awaitRelease$1 r0 = (androidx.compose.foundation.gestures.PressGestureScopeImpl.C08861) r0
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
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            kotlin.AbstractC5774b.m5119b(r5)
            goto L3b
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L2f:
            kotlin.AbstractC5774b.m5119b(r5)
            r0.label = r3
            java.lang.Object r5 = r4.tryAwaitRelease(r0)
            if (r5 != r1) goto L3b
            return r1
        L3b:
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            if (r5 == 0) goto L46
            d6.s r5 = p045d6.C5443s.f8405a
            return r5
        L46:
            androidx.compose.foundation.gestures.GestureCancellationException r5 = new androidx.compose.foundation.gestures.GestureCancellationException
            java.lang.String r0 = "The press gesture was canceled."
            r5.<init>(r0)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.PressGestureScopeImpl.awaitRelease(h6.c):java.lang.Object");
    }

    public final void cancel() {
        this.isCanceled = true;
        if (((C6001a) this.mutex).m5614d()) {
            ((C6001a) this.mutex).m5617g(null);
        }
    }

    @Override // androidx.compose.p011ui.unit.Density
    public float getDensity() {
        return this.$$delegate_0.getDensity();
    }

    @Override // androidx.compose.p011ui.unit.FontScaling
    public float getFontScale() {
        return this.$$delegate_0.getFontScale();
    }

    public final void release() {
        this.isReleased = true;
        if (((C6001a) this.mutex).m5614d()) {
            ((C6001a) this.mutex).m5617g(null);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object reset(@org.jetbrains.annotations.NotNull p075h6.InterfaceC5631c<? super p045d6.C5443s> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof androidx.compose.foundation.gestures.PressGestureScopeImpl.C08871
            if (r0 == 0) goto L13
            r0 = r5
            androidx.compose.foundation.gestures.PressGestureScopeImpl$reset$1 r0 = (androidx.compose.foundation.gestures.PressGestureScopeImpl.C08871) r0
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
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            java.lang.Object r0 = r0.L$0
            androidx.compose.foundation.gestures.PressGestureScopeImpl r0 = (androidx.compose.foundation.gestures.PressGestureScopeImpl) r0
            kotlin.AbstractC5774b.m5119b(r5)
            goto L46
        L2b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L33:
            kotlin.AbstractC5774b.m5119b(r5)
            h7.a r5 = r4.mutex
            r0.L$0 = r4
            r0.label = r3
            kotlinx.coroutines.sync.a r5 = (kotlinx.coroutines.sync.C6001a) r5
            java.lang.Object r5 = r5.m5615e(r0)
            if (r5 != r1) goto L45
            return r1
        L45:
            r0 = r4
        L46:
            r5 = 0
            r0.isReleased = r5
            r0.isCanceled = r5
            d6.s r5 = p045d6.C5443s.f8405a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.PressGestureScopeImpl.reset(h6.c):java.lang.Object");
    }

    @Override // androidx.compose.p011ui.unit.Density
    @Stable
    /* renamed from: roundToPx--R2X_6o */
    public int mo6896roundToPxR2X_6o(long j7) {
        return this.$$delegate_0.mo6896roundToPxR2X_6o(j7);
    }

    @Override // androidx.compose.p011ui.unit.Density
    @Stable
    /* renamed from: roundToPx-0680j_4 */
    public int mo6897roundToPx0680j_4(float f) {
        return this.$$delegate_0.mo6897roundToPx0680j_4(f);
    }

    @Override // androidx.compose.p011ui.unit.FontScaling
    @Stable
    /* renamed from: toDp-GaN1DYA */
    public float mo6898toDpGaN1DYA(long j7) {
        return this.$$delegate_0.mo6898toDpGaN1DYA(j7);
    }

    @Override // androidx.compose.p011ui.unit.Density
    @Stable
    /* renamed from: toDp-u2uoSUM */
    public float mo6899toDpu2uoSUM(float f) {
        return this.$$delegate_0.mo6899toDpu2uoSUM(f);
    }

    @Override // androidx.compose.p011ui.unit.Density
    @Stable
    /* renamed from: toDpSize-k-rfVVM */
    public long mo6901toDpSizekrfVVM(long j7) {
        return this.$$delegate_0.mo6901toDpSizekrfVVM(j7);
    }

    @Override // androidx.compose.p011ui.unit.Density
    @Stable
    /* renamed from: toPx--R2X_6o */
    public float mo6902toPxR2X_6o(long j7) {
        return this.$$delegate_0.mo6902toPxR2X_6o(j7);
    }

    @Override // androidx.compose.p011ui.unit.Density
    @Stable
    /* renamed from: toPx-0680j_4 */
    public float mo6903toPx0680j_4(float f) {
        return this.$$delegate_0.mo6903toPx0680j_4(f);
    }

    @Override // androidx.compose.p011ui.unit.Density
    @Stable
    @NotNull
    public Rect toRect(@NotNull DpRect dpRect) {
        return this.$$delegate_0.toRect(dpRect);
    }

    @Override // androidx.compose.p011ui.unit.Density
    @Stable
    /* renamed from: toSize-XkaWNTQ */
    public long mo6904toSizeXkaWNTQ(long j7) {
        return this.$$delegate_0.mo6904toSizeXkaWNTQ(j7);
    }

    @Override // androidx.compose.p011ui.unit.FontScaling
    @Stable
    /* renamed from: toSp-0xMU5do */
    public long mo6905toSp0xMU5do(float f) {
        return this.$$delegate_0.mo6905toSp0xMU5do(f);
    }

    @Override // androidx.compose.p011ui.unit.Density
    @Stable
    /* renamed from: toSp-kPz2Gy4 */
    public long mo6906toSpkPz2Gy4(float f) {
        return this.$$delegate_0.mo6906toSpkPz2Gy4(f);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // androidx.compose.foundation.gestures.PressGestureScope
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object tryAwaitRelease(@org.jetbrains.annotations.NotNull p075h6.InterfaceC5631c<? super java.lang.Boolean> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof androidx.compose.foundation.gestures.PressGestureScopeImpl.C08881
            if (r0 == 0) goto L13
            r0 = r5
            androidx.compose.foundation.gestures.PressGestureScopeImpl$tryAwaitRelease$1 r0 = (androidx.compose.foundation.gestures.PressGestureScopeImpl.C08881) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.compose.foundation.gestures.PressGestureScopeImpl$tryAwaitRelease$1 r0 = new androidx.compose.foundation.gestures.PressGestureScopeImpl$tryAwaitRelease$1
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            java.lang.Object r0 = r0.L$0
            androidx.compose.foundation.gestures.PressGestureScopeImpl r0 = (androidx.compose.foundation.gestures.PressGestureScopeImpl) r0
            kotlin.AbstractC5774b.m5119b(r5)
            goto L4e
        L2b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L33:
            kotlin.AbstractC5774b.m5119b(r5)
            boolean r5 = r4.isReleased
            if (r5 != 0) goto L54
            boolean r5 = r4.isCanceled
            if (r5 != 0) goto L54
            h7.a r5 = r4.mutex
            r0.L$0 = r4
            r0.label = r3
            kotlinx.coroutines.sync.a r5 = (kotlinx.coroutines.sync.C6001a) r5
            java.lang.Object r5 = r5.m5615e(r0)
            if (r5 != r1) goto L4d
            return r1
        L4d:
            r0 = r4
        L4e:
            h7.a r5 = r0.mutex
            p076h7.AbstractC5640c.m4969a(r5)
            goto L55
        L54:
            r0 = r4
        L55:
            boolean r5 = r0.isReleased
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.PressGestureScopeImpl.tryAwaitRelease(h6.c):java.lang.Object");
    }

    @Override // androidx.compose.p011ui.unit.Density
    @Stable
    /* renamed from: toDp-u2uoSUM */
    public float mo6900toDpu2uoSUM(int i) {
        return this.$$delegate_0.mo6900toDpu2uoSUM(i);
    }

    @Override // androidx.compose.p011ui.unit.Density
    @Stable
    /* renamed from: toSp-kPz2Gy4 */
    public long mo6907toSpkPz2Gy4(int i) {
        return this.$$delegate_0.mo6907toSpkPz2Gy4(i);
    }
}
