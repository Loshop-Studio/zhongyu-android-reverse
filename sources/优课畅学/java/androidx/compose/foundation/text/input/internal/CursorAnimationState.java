package androidx.compose.foundation.text.input.internal;

import androidx.camera.view.AbstractC0949q;
import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.PrimitiveSnapshotStateKt;
import androidx.compose.runtime.internal.StabilityInferred;
import com.tencent.ijk.media.player.IjkMediaMeta;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.AbstractC9079b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.AbstractC9165e;
import kotlinx.coroutines.InterfaceC9212n;
import p123h7.C8736p;
import p135i8.AbstractC8839h;
import p135i8.InterfaceC8822b0;
import p179m7.InterfaceC9324c;
import p190n7.AbstractC9434a;
import p201o7.AbstractC9536a;
import p201o7.InterfaceC9539d;
import p300x7.InterfaceC10574p;

@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public final class CursorAnimationState {
    public static final int $stable = 8;
    private final boolean animate;
    private AtomicReference<InterfaceC9212n> animationJob = new AtomicReference<>(null);
    private final MutableFloatState cursorAlpha$delegate = PrimitiveSnapshotStateKt.mutableFloatStateOf(0.0f);

    @InterfaceC9539d(m17800c = "androidx.compose.foundation.text.input.internal.CursorAnimationState$snapToVisibleAndAnimate$2", m17801f = "CursorAnimationState.kt", m17802l = {}, m17803m = "invokeSuspend")
    /* renamed from: androidx.compose.foundation.text.input.internal.CursorAnimationState$snapToVisibleAndAnimate$2 */
    public static final class C17602 extends SuspendLambda implements InterfaceC10574p {
        private /* synthetic */ Object L$0;
        int label;

        @InterfaceC9539d(m17800c = "androidx.compose.foundation.text.input.internal.CursorAnimationState$snapToVisibleAndAnimate$2$1", m17801f = "CursorAnimationState.kt", m17802l = {72, IjkMediaMeta.FF_PROFILE_H264_MAIN, 79, 81}, m17803m = "invokeSuspend")
        /* renamed from: androidx.compose.foundation.text.input.internal.CursorAnimationState$snapToVisibleAndAnimate$2$1, reason: invalid class name */
        public static final class AnonymousClass1 extends SuspendLambda implements InterfaceC10574p {
            final /* synthetic */ InterfaceC9212n $oldJob;
            int label;
            final /* synthetic */ CursorAnimationState this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(InterfaceC9212n interfaceC9212n, CursorAnimationState cursorAnimationState, InterfaceC9324c<? super AnonymousClass1> interfaceC9324c) {
                super(2, interfaceC9324c);
                this.$oldJob = interfaceC9212n;
                this.this$0 = cursorAnimationState;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final InterfaceC9324c<C8736p> create(Object obj, InterfaceC9324c<?> interfaceC9324c) {
                return new AnonymousClass1(this.$oldJob, this.this$0, interfaceC9324c);
            }

            @Override // p300x7.InterfaceC10574p
            public final Object invoke(InterfaceC8822b0 interfaceC8822b0, InterfaceC9324c<? super C8736p> interfaceC9324c) {
                return ((AnonymousClass1) create(interfaceC8822b0, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
            }

            /* JADX WARN: Code restructure failed: missing block: B:34:0x0073, code lost:
            
                if (kotlinx.coroutines.DelayKt.m16227b(500, r10) != r0) goto L36;
             */
            /* JADX WARN: Removed duplicated region for block: B:32:0x0067  */
            /* JADX WARN: Removed duplicated region for block: B:33:0x0068 A[Catch: all -> 0x001d, TryCatch #0 {all -> 0x001d, blocks: (B:8:0x0019, B:36:0x0076, B:30:0x005f, B:33:0x0068, B:14:0x0027, B:15:0x002b, B:28:0x0059, B:29:0x005e, B:23:0x0043, B:25:0x0050), top: B:40:0x000f }] */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x0073 -> B:36:0x0076). Please report as a decompilation issue!!! */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r11) throws java.lang.Throwable {
                /*
                    r10 = this;
                    java.lang.Object r0 = p190n7.AbstractC9434a.m17291f()
                    int r1 = r10.label
                    r2 = 0
                    r3 = 500(0x1f4, double:2.47E-321)
                    r5 = 1065353216(0x3f800000, float:1.0)
                    r6 = 4
                    r7 = 3
                    r8 = 2
                    r9 = 1
                    if (r1 == 0) goto L33
                    if (r1 == r9) goto L2f
                    if (r1 == r8) goto L2b
                    if (r1 == r7) goto L27
                    if (r1 != r6) goto L1f
                    kotlin.AbstractC9079b.m15926b(r11)     // Catch: java.lang.Throwable -> L1d
                    goto L76
                L1d:
                    r11 = move-exception
                    goto L7c
                L1f:
                    java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r11.<init>(r0)
                    throw r11
                L27:
                    kotlin.AbstractC9079b.m15926b(r11)     // Catch: java.lang.Throwable -> L1d
                    goto L68
                L2b:
                    kotlin.AbstractC9079b.m15926b(r11)     // Catch: java.lang.Throwable -> L1d
                    goto L59
                L2f:
                    kotlin.AbstractC9079b.m15926b(r11)
                    goto L43
                L33:
                    kotlin.AbstractC9079b.m15926b(r11)
                    kotlinx.coroutines.n r11 = r10.$oldJob
                    if (r11 == 0) goto L43
                    r10.label = r9
                    java.lang.Object r11 = p135i8.AbstractC8823b1.m14811g(r11, r10)
                    if (r11 != r0) goto L43
                    goto L75
                L43:
                    androidx.compose.foundation.text.input.internal.CursorAnimationState r11 = r10.this$0     // Catch: java.lang.Throwable -> L1d
                    androidx.compose.foundation.text.input.internal.CursorAnimationState.access$setCursorAlpha(r11, r5)     // Catch: java.lang.Throwable -> L1d
                    androidx.compose.foundation.text.input.internal.CursorAnimationState r11 = r10.this$0     // Catch: java.lang.Throwable -> L1d
                    boolean r11 = r11.getAnimate()     // Catch: java.lang.Throwable -> L1d
                    if (r11 != 0) goto L5f
                    r10.label = r8     // Catch: java.lang.Throwable -> L1d
                    java.lang.Object r11 = kotlinx.coroutines.DelayKt.m16226a(r10)     // Catch: java.lang.Throwable -> L1d
                    if (r11 != r0) goto L59
                    goto L75
                L59:
                    kotlin.KotlinNothingValueException r11 = new kotlin.KotlinNothingValueException     // Catch: java.lang.Throwable -> L1d
                    r11.<init>()     // Catch: java.lang.Throwable -> L1d
                    throw r11     // Catch: java.lang.Throwable -> L1d
                L5f:
                    r10.label = r7     // Catch: java.lang.Throwable -> L1d
                    java.lang.Object r11 = kotlinx.coroutines.DelayKt.m16227b(r3, r10)     // Catch: java.lang.Throwable -> L1d
                    if (r11 != r0) goto L68
                    goto L75
                L68:
                    androidx.compose.foundation.text.input.internal.CursorAnimationState r11 = r10.this$0     // Catch: java.lang.Throwable -> L1d
                    androidx.compose.foundation.text.input.internal.CursorAnimationState.access$setCursorAlpha(r11, r2)     // Catch: java.lang.Throwable -> L1d
                    r10.label = r6     // Catch: java.lang.Throwable -> L1d
                    java.lang.Object r11 = kotlinx.coroutines.DelayKt.m16227b(r3, r10)     // Catch: java.lang.Throwable -> L1d
                    if (r11 != r0) goto L76
                L75:
                    return r0
                L76:
                    androidx.compose.foundation.text.input.internal.CursorAnimationState r11 = r10.this$0     // Catch: java.lang.Throwable -> L1d
                    androidx.compose.foundation.text.input.internal.CursorAnimationState.access$setCursorAlpha(r11, r5)     // Catch: java.lang.Throwable -> L1d
                    goto L5f
                L7c:
                    androidx.compose.foundation.text.input.internal.CursorAnimationState r0 = r10.this$0
                    androidx.compose.foundation.text.input.internal.CursorAnimationState.access$setCursorAlpha(r0, r2)
                    throw r11
                */
                throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.input.internal.CursorAnimationState.C17602.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        public C17602(InterfaceC9324c<? super C17602> interfaceC9324c) {
            super(2, interfaceC9324c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC9324c<C8736p> create(Object obj, InterfaceC9324c<?> interfaceC9324c) {
            C17602 c17602 = CursorAnimationState.this.new C17602(interfaceC9324c);
            c17602.L$0 = obj;
            return c17602;
        }

        @Override // p300x7.InterfaceC10574p
        public final Object invoke(InterfaceC8822b0 interfaceC8822b0, InterfaceC9324c<? super Boolean> interfaceC9324c) {
            return ((C17602) create(interfaceC8822b0, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            AbstractC9434a.m17291f();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9079b.m15926b(obj);
            return AbstractC9536a.m17796a(AbstractC0949q.m807a(CursorAnimationState.this.animationJob, null, AbstractC8839h.m14861d((InterfaceC8822b0) this.L$0, null, null, new AnonymousClass1((InterfaceC9212n) CursorAnimationState.this.animationJob.getAndSet(null), CursorAnimationState.this, null), 3, null)));
        }
    }

    public CursorAnimationState(boolean z10) {
        this.animate = z10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setCursorAlpha(float f10) {
        this.cursorAlpha$delegate.setFloatValue(f10);
    }

    public final void cancelAndHide() {
        InterfaceC9212n andSet = this.animationJob.getAndSet(null);
        if (andSet != null) {
            InterfaceC9212n.a.m16777a(andSet, null, 1, null);
        }
    }

    public final boolean getAnimate() {
        return this.animate;
    }

    public final float getCursorAlpha() {
        return this.cursorAlpha$delegate.getFloatValue();
    }

    public final Object snapToVisibleAndAnimate(InterfaceC9324c<? super C8736p> interfaceC9324c) {
        Object objM16556e = AbstractC9165e.m16556e(new C17602(null), interfaceC9324c);
        return objM16556e == AbstractC9434a.m17291f() ? objM16556e : C8736p.f16368a;
    }
}
