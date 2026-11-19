package androidx.compose.foundation.text.input.internal;

import androidx.camera.view.AbstractC0979q;
import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.PrimitiveSnapshotStateKt;
import androidx.compose.runtime.internal.StabilityInferred;
import com.taobao.sophix.PatchStatus;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.AbstractC9924b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.AbstractC10006d;
import kotlinx.coroutines.InterfaceC10045g;
import p181hd.InterfaceC9544p;
import p309qc.C10786q;
import p393wc.AbstractC11725a;
import p409xc.AbstractC11826a;
import p409xc.InterfaceC11829d;
import sd.AbstractC11117h;
import sd.InterfaceC11122i0;
import vc.InterfaceC11588c;

@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public final class CursorAnimationState {
    public static final int $stable = 8;
    private final boolean animate;
    private AtomicReference<InterfaceC10045g> animationJob = new AtomicReference<>(null);
    private final MutableFloatState cursorAlpha$delegate = PrimitiveSnapshotStateKt.mutableFloatStateOf(0.0f);

    @InterfaceC11829d(m26210c = "androidx.compose.foundation.text.input.internal.CursorAnimationState$snapToVisibleAndAnimate$2", m26211f = "CursorAnimationState.kt", m26212l = {}, m26213m = "invokeSuspend")
    /* renamed from: androidx.compose.foundation.text.input.internal.CursorAnimationState$snapToVisibleAndAnimate$2 */
    public static final class C17902 extends SuspendLambda implements InterfaceC9544p {
        private /* synthetic */ Object L$0;
        int label;

        @InterfaceC11829d(m26210c = "androidx.compose.foundation.text.input.internal.CursorAnimationState$snapToVisibleAndAnimate$2$1", m26211f = "CursorAnimationState.kt", m26212l = {PatchStatus.CODE_LOAD_AES_DECRYPT, 77, 79, PatchStatus.CODE_LOAD_HANDLE_DEX}, m26213m = "invokeSuspend")
        /* renamed from: androidx.compose.foundation.text.input.internal.CursorAnimationState$snapToVisibleAndAnimate$2$1, reason: invalid class name */
        public static final class AnonymousClass1 extends SuspendLambda implements InterfaceC9544p {
            final /* synthetic */ InterfaceC10045g $oldJob;
            int label;
            final /* synthetic */ CursorAnimationState this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(InterfaceC10045g interfaceC10045g, CursorAnimationState cursorAnimationState, InterfaceC11588c<? super AnonymousClass1> interfaceC11588c) {
                super(2, interfaceC11588c);
                this.$oldJob = interfaceC10045g;
                this.this$0 = cursorAnimationState;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final InterfaceC11588c<C10786q> create(Object obj, InterfaceC11588c<?> interfaceC11588c) {
                return new AnonymousClass1(this.$oldJob, this.this$0, interfaceC11588c);
            }

            /* JADX WARN: Code restructure failed: missing block: B:34:0x0073, code lost:
            
                if (kotlinx.coroutines.DelayKt.m20376b(500, r10) != r0) goto L36;
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
                    java.lang.Object r0 = p393wc.AbstractC11725a.m25952f()
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
                    kotlin.AbstractC9924b.m20071b(r11)     // Catch: java.lang.Throwable -> L1d
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
                    kotlin.AbstractC9924b.m20071b(r11)     // Catch: java.lang.Throwable -> L1d
                    goto L68
                L2b:
                    kotlin.AbstractC9924b.m20071b(r11)     // Catch: java.lang.Throwable -> L1d
                    goto L59
                L2f:
                    kotlin.AbstractC9924b.m20071b(r11)
                    goto L43
                L33:
                    kotlin.AbstractC9924b.m20071b(r11)
                    kotlinx.coroutines.g r11 = r10.$oldJob
                    if (r11 == 0) goto L43
                    r10.label = r9
                    java.lang.Object r11 = sd.AbstractC11147o1.m24773g(r11, r10)
                    if (r11 != r0) goto L43
                    goto L75
                L43:
                    androidx.compose.foundation.text.input.internal.CursorAnimationState r11 = r10.this$0     // Catch: java.lang.Throwable -> L1d
                    androidx.compose.foundation.text.input.internal.CursorAnimationState.access$setCursorAlpha(r11, r5)     // Catch: java.lang.Throwable -> L1d
                    androidx.compose.foundation.text.input.internal.CursorAnimationState r11 = r10.this$0     // Catch: java.lang.Throwable -> L1d
                    boolean r11 = r11.getAnimate()     // Catch: java.lang.Throwable -> L1d
                    if (r11 != 0) goto L5f
                    r10.label = r8     // Catch: java.lang.Throwable -> L1d
                    java.lang.Object r11 = kotlinx.coroutines.DelayKt.m20375a(r10)     // Catch: java.lang.Throwable -> L1d
                    if (r11 != r0) goto L59
                    goto L75
                L59:
                    kotlin.KotlinNothingValueException r11 = new kotlin.KotlinNothingValueException     // Catch: java.lang.Throwable -> L1d
                    r11.<init>()     // Catch: java.lang.Throwable -> L1d
                    throw r11     // Catch: java.lang.Throwable -> L1d
                L5f:
                    r10.label = r7     // Catch: java.lang.Throwable -> L1d
                    java.lang.Object r11 = kotlinx.coroutines.DelayKt.m20376b(r3, r10)     // Catch: java.lang.Throwable -> L1d
                    if (r11 != r0) goto L68
                    goto L75
                L68:
                    androidx.compose.foundation.text.input.internal.CursorAnimationState r11 = r10.this$0     // Catch: java.lang.Throwable -> L1d
                    androidx.compose.foundation.text.input.internal.CursorAnimationState.access$setCursorAlpha(r11, r2)     // Catch: java.lang.Throwable -> L1d
                    r10.label = r6     // Catch: java.lang.Throwable -> L1d
                    java.lang.Object r11 = kotlinx.coroutines.DelayKt.m20376b(r3, r10)     // Catch: java.lang.Throwable -> L1d
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
                throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.input.internal.CursorAnimationState.C17902.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
            }

            @Override // p181hd.InterfaceC9544p
            public final Object invoke(InterfaceC11122i0 interfaceC11122i0, InterfaceC11588c<? super C10786q> interfaceC11588c) {
                return ((AnonymousClass1) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
            }
        }

        public C17902(InterfaceC11588c<? super C17902> interfaceC11588c) {
            super(2, interfaceC11588c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC11588c<C10786q> create(Object obj, InterfaceC11588c<?> interfaceC11588c) {
            C17902 c17902 = CursorAnimationState.this.new C17902(interfaceC11588c);
            c17902.L$0 = obj;
            return c17902;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            AbstractC11725a.m25952f();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9924b.m20071b(obj);
            return AbstractC11826a.m26206a(AbstractC0979q.m884a(CursorAnimationState.this.animationJob, null, AbstractC11117h.m24726d((InterfaceC11122i0) this.L$0, null, null, new AnonymousClass1((InterfaceC10045g) CursorAnimationState.this.animationJob.getAndSet(null), CursorAnimationState.this, null), 3, null)));
        }

        @Override // p181hd.InterfaceC9544p
        public final Object invoke(InterfaceC11122i0 interfaceC11122i0, InterfaceC11588c<? super Boolean> interfaceC11588c) {
            return ((C17902) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
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
        InterfaceC10045g andSet = this.animationJob.getAndSet(null);
        if (andSet != null) {
            InterfaceC10045g.a.m20900a(andSet, null, 1, null);
        }
    }

    public final boolean getAnimate() {
        return this.animate;
    }

    public final float getCursorAlpha() {
        return this.cursorAlpha$delegate.getFloatValue();
    }

    public final Object snapToVisibleAndAnimate(InterfaceC11588c<? super C10786q> interfaceC11588c) {
        Object objM20748e = AbstractC10006d.m20748e(new C17902(null), interfaceC11588c);
        return objM20748e == AbstractC11725a.m25952f() ? objM20748e : C10786q.f26013a;
    }
}
