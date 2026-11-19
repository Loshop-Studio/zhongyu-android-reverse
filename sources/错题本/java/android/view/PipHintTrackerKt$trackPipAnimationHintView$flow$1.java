package android.view;

import android.view.View;
import android.view.ViewTreeObserver;
import kotlin.AbstractC5774b;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.AbstractC5830k;
import kotlinx.coroutines.channels.AbstractC5882k;
import kotlinx.coroutines.channels.C5883l;
import kotlinx.coroutines.channels.InterfaceC5884m;
import p045d6.C5443s;
import p075h6.InterfaceC5631c;
import p152r6.InterfaceC6469a;
import p152r6.InterfaceC6473e;

@Metadata(m5109d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, m5110d2 = {"Lkotlinx/coroutines/channels/m;", "Landroid/graphics/Rect;", "Ld6/s;", "<anonymous>", "(Lkotlinx/coroutines/channels/m;)V"}, m5111k = 3, m5112mv = {1, 8, 0})
@DebugMetadata(m5302c = "androidx.activity.PipHintTrackerKt$trackPipAnimationHintView$flow$1", m5303f = "PipHintTracker.kt", m5304i = {}, m5305l = {86}, m5306m = "invokeSuspend", m5307n = {}, m5308s = {})
/* loaded from: classes.dex */
public final class PipHintTrackerKt$trackPipAnimationHintView$flow$1 extends SuspendLambda implements InterfaceC6473e {
    final /* synthetic */ View $view;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PipHintTrackerKt$trackPipAnimationHintView$flow$1(View view, InterfaceC5631c<? super PipHintTrackerKt$trackPipAnimationHintView$flow$1> interfaceC5631c) {
        super(2, interfaceC5631c);
        this.$view = view;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invokeSuspend$lambda$0(InterfaceC5884m interfaceC5884m, View v2, int i, int i8, int i9, int i10, int i11, int i12, int i13, int i14) {
        if (i == i11 && i9 == i13 && i8 == i12 && i10 == i14) {
            return;
        }
        AbstractC5830k.m5329f(v2, "v");
        ((C5883l) interfaceC5884m).mo5481a(Activity.trackPipAnimationHintView$positionInWindow(v2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invokeSuspend$lambda$1(InterfaceC5884m interfaceC5884m, View view) {
        ((C5883l) interfaceC5884m).mo5481a(Activity.trackPipAnimationHintView$positionInWindow(view));
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC5631c<C5443s> create(Object obj, InterfaceC5631c<?> interfaceC5631c) {
        PipHintTrackerKt$trackPipAnimationHintView$flow$1 pipHintTrackerKt$trackPipAnimationHintView$flow$1 = new PipHintTrackerKt$trackPipAnimationHintView$flow$1(this.$view, interfaceC5631c);
        pipHintTrackerKt$trackPipAnimationHintView$flow$1.L$0 = obj;
        return pipHintTrackerKt$trackPipAnimationHintView$flow$1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [android.view.View$OnAttachStateChangeListener, androidx.activity.PipHintTrackerKt$trackPipAnimationHintView$flow$1$attachStateChangeListener$1] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AbstractC5774b.m5119b(obj);
            final InterfaceC5884m interfaceC5884m = (InterfaceC5884m) this.L$0;
            final View.OnLayoutChangeListener onLayoutChangeListener = new View.OnLayoutChangeListener() { // from class: androidx.activity.m
                @Override // android.view.View.OnLayoutChangeListener
                public final void onLayoutChange(View view, int i8, int i9, int i10, int i11, int i12, int i13, int i14, int i15) {
                    PipHintTrackerKt$trackPipAnimationHintView$flow$1.invokeSuspend$lambda$0(interfaceC5884m, view, i8, i9, i10, i11, i12, i13, i14, i15);
                }
            };
            final View view = this.$view;
            final ViewTreeObserver.OnScrollChangedListener onScrollChangedListener = new ViewTreeObserver.OnScrollChangedListener() { // from class: androidx.activity.n
                @Override // android.view.ViewTreeObserver.OnScrollChangedListener
                public final void onScrollChanged() {
                    PipHintTrackerKt$trackPipAnimationHintView$flow$1.invokeSuspend$lambda$1(interfaceC5884m, view);
                }
            };
            final ?? r52 = new View.OnAttachStateChangeListener() { // from class: androidx.activity.PipHintTrackerKt$trackPipAnimationHintView$flow$1$attachStateChangeListener$1
                @Override // android.view.View.OnAttachStateChangeListener
                public void onViewAttachedToWindow(View v2) {
                    AbstractC5830k.m5330g(v2, "v");
                    ((C5883l) interfaceC5884m).mo5481a(Activity.trackPipAnimationHintView$positionInWindow(view));
                    view.getViewTreeObserver().addOnScrollChangedListener(onScrollChangedListener);
                    view.addOnLayoutChangeListener(onLayoutChangeListener);
                }

                @Override // android.view.View.OnAttachStateChangeListener
                public void onViewDetachedFromWindow(View v2) {
                    AbstractC5830k.m5330g(v2, "v");
                    v2.getViewTreeObserver().removeOnScrollChangedListener(onScrollChangedListener);
                    v2.removeOnLayoutChangeListener(onLayoutChangeListener);
                }
            };
            if (this.$view.isAttachedToWindow()) {
                ((C5883l) interfaceC5884m).mo5481a(Activity.trackPipAnimationHintView$positionInWindow(this.$view));
                this.$view.getViewTreeObserver().addOnScrollChangedListener(onScrollChangedListener);
                this.$view.addOnLayoutChangeListener(onLayoutChangeListener);
            }
            this.$view.addOnAttachStateChangeListener(r52);
            final View view2 = this.$view;
            InterfaceC6469a interfaceC6469a = new InterfaceC6469a() { // from class: androidx.activity.PipHintTrackerKt$trackPipAnimationHintView$flow$1.1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // p152r6.InterfaceC6469a
                public /* bridge */ /* synthetic */ Object invoke() {
                    m6508invoke();
                    return C5443s.f8405a;
                }

                /* renamed from: invoke, reason: collision with other method in class */
                public final void m6508invoke() {
                    view2.getViewTreeObserver().removeOnScrollChangedListener(onScrollChangedListener);
                    view2.removeOnLayoutChangeListener(onLayoutChangeListener);
                    view2.removeOnAttachStateChangeListener(r52);
                }
            };
            this.label = 1;
            if (AbstractC5882k.m5512b(interfaceC5884m, interfaceC6469a, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC5774b.m5119b(obj);
        }
        return C5443s.f8405a;
    }

    @Override // p152r6.InterfaceC6473e
    public final Object invoke(InterfaceC5884m interfaceC5884m, InterfaceC5631c<? super C5443s> interfaceC5631c) {
        return ((PipHintTrackerKt$trackPipAnimationHintView$flow$1) create(interfaceC5884m, interfaceC5631c)).invokeSuspend(C5443s.f8405a);
    }
}
