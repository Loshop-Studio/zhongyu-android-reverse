package androidx.activity;

import android.view.View;
import android.view.ViewTreeObserver;
import com.taobao.sophix.PatchStatus;
import kotlin.AbstractC9924b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.AbstractC9979u;
import kotlinx.coroutines.channels.ProduceKt;
import p181hd.InterfaceC9529a;
import p181hd.InterfaceC9544p;
import p309qc.C10786q;
import p365ud.InterfaceC11395j;
import p393wc.AbstractC11725a;
import p409xc.InterfaceC11829d;
import vc.InterfaceC11588c;

@InterfaceC11829d(m26210c = "androidx.activity.PipHintTrackerKt$trackPipAnimationHintView$flow$1", m26211f = "PipHintTracker.kt", m26212l = {PatchStatus.CODE_LOAD_ILLEGAL_ACCESS}, m26213m = "invokeSuspend")
/* loaded from: classes.dex */
public final class PipHintTrackerKt$trackPipAnimationHintView$flow$1 extends SuspendLambda implements InterfaceC9544p {
    final /* synthetic */ View $view;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PipHintTrackerKt$trackPipAnimationHintView$flow$1(View view, InterfaceC11588c<? super PipHintTrackerKt$trackPipAnimationHintView$flow$1> interfaceC11588c) {
        super(2, interfaceC11588c);
        this.$view = view;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invokeSuspend$lambda$0(InterfaceC11395j interfaceC11395j, View v10, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        if (i10 == i14 && i12 == i16 && i11 == i15 && i13 == i17) {
            return;
        }
        AbstractC9979u.m20293f(v10, "v");
        interfaceC11395j.mo33808trySendJP2dKIU(PipHintTrackerKt.trackPipAnimationHintView$positionInWindow(v10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invokeSuspend$lambda$1(InterfaceC11395j interfaceC11395j, View view) {
        interfaceC11395j.mo33808trySendJP2dKIU(PipHintTrackerKt.trackPipAnimationHintView$positionInWindow(view));
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC11588c<C10786q> create(Object obj, InterfaceC11588c<?> interfaceC11588c) {
        PipHintTrackerKt$trackPipAnimationHintView$flow$1 pipHintTrackerKt$trackPipAnimationHintView$flow$1 = new PipHintTrackerKt$trackPipAnimationHintView$flow$1(this.$view, interfaceC11588c);
        pipHintTrackerKt$trackPipAnimationHintView$flow$1.L$0 = obj;
        return pipHintTrackerKt$trackPipAnimationHintView$flow$1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1, types: [android.view.View$OnAttachStateChangeListener, androidx.activity.PipHintTrackerKt$trackPipAnimationHintView$flow$1$attachStateChangeListener$1] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM25952f = AbstractC11725a.m25952f();
        int i10 = this.label;
        if (i10 == 0) {
            AbstractC9924b.m20071b(obj);
            final InterfaceC11395j interfaceC11395j = (InterfaceC11395j) this.L$0;
            final View.OnLayoutChangeListener onLayoutChangeListener = new View.OnLayoutChangeListener() { // from class: androidx.activity.t
                @Override // android.view.View.OnLayoutChangeListener
                public final void onLayoutChange(View view, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18) {
                    PipHintTrackerKt$trackPipAnimationHintView$flow$1.invokeSuspend$lambda$0(interfaceC11395j, view, i11, i12, i13, i14, i15, i16, i17, i18);
                }
            };
            final View view = this.$view;
            final ViewTreeObserver.OnScrollChangedListener onScrollChangedListener = new ViewTreeObserver.OnScrollChangedListener() { // from class: androidx.activity.u
                @Override // android.view.ViewTreeObserver.OnScrollChangedListener
                public final void onScrollChanged() {
                    PipHintTrackerKt$trackPipAnimationHintView$flow$1.invokeSuspend$lambda$1(interfaceC11395j, view);
                }
            };
            final View view2 = this.$view;
            final ?? r32 = new View.OnAttachStateChangeListener() { // from class: androidx.activity.PipHintTrackerKt$trackPipAnimationHintView$flow$1$attachStateChangeListener$1
                @Override // android.view.View.OnAttachStateChangeListener
                public void onViewAttachedToWindow(View v10) {
                    AbstractC9979u.m20294g(v10, "v");
                    interfaceC11395j.mo33808trySendJP2dKIU(PipHintTrackerKt.trackPipAnimationHintView$positionInWindow(view2));
                    view2.getViewTreeObserver().addOnScrollChangedListener(onScrollChangedListener);
                    view2.addOnLayoutChangeListener(onLayoutChangeListener);
                }

                @Override // android.view.View.OnAttachStateChangeListener
                public void onViewDetachedFromWindow(View v10) {
                    AbstractC9979u.m20294g(v10, "v");
                    v10.getViewTreeObserver().removeOnScrollChangedListener(onScrollChangedListener);
                    v10.removeOnLayoutChangeListener(onLayoutChangeListener);
                }
            };
            if (this.$view.isAttachedToWindow()) {
                interfaceC11395j.mo33808trySendJP2dKIU(PipHintTrackerKt.trackPipAnimationHintView$positionInWindow(this.$view));
                this.$view.getViewTreeObserver().addOnScrollChangedListener(onScrollChangedListener);
                this.$view.addOnLayoutChangeListener(onLayoutChangeListener);
            }
            this.$view.addOnAttachStateChangeListener(r32);
            final View view3 = this.$view;
            InterfaceC9529a interfaceC9529a = new InterfaceC9529a() { // from class: androidx.activity.PipHintTrackerKt$trackPipAnimationHintView$flow$1.1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // p181hd.InterfaceC9529a
                public /* bridge */ /* synthetic */ Object invoke() {
                    m26704invoke();
                    return C10786q.f26013a;
                }

                /* renamed from: invoke, reason: collision with other method in class */
                public final void m26704invoke() {
                    view3.getViewTreeObserver().removeOnScrollChangedListener(onScrollChangedListener);
                    view3.removeOnLayoutChangeListener(onLayoutChangeListener);
                    view3.removeOnAttachStateChangeListener(r32);
                }
            };
            this.label = 1;
            if (ProduceKt.m20713a(interfaceC11395j, interfaceC9529a, this) == objM25952f) {
                return objM25952f;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9924b.m20071b(obj);
        }
        return C10786q.f26013a;
    }

    @Override // p181hd.InterfaceC9544p
    public final Object invoke(InterfaceC11395j interfaceC11395j, InterfaceC11588c<? super C10786q> interfaceC11588c) {
        return ((PipHintTrackerKt$trackPipAnimationHintView$flow$1) create(interfaceC11395j, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
    }
}
