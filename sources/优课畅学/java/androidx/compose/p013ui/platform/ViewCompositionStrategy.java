package androidx.compose.p013ui.platform;

import android.view.View;
import androidx.compose.p013ui.internal.InlineClassHelperKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.customview.poolingcontainer.PoolingContainer;
import androidx.customview.poolingcontainer.PoolingContainerListener;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import kotlin.KotlinNothingValueException;
import kotlin.jvm.internal.Ref$ObjectRef;
import p123h7.C8736p;
import p300x7.InterfaceC10559a;

/* loaded from: classes2.dex */
public interface ViewCompositionStrategy {
    public static final Companion Companion = Companion.$$INSTANCE;

    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        public final ViewCompositionStrategy getDefault() {
            return DisposeOnDetachedFromWindowOrReleasedFromPool.INSTANCE;
        }
    }

    @StabilityInferred(parameters = 1)
    public static final class DisposeOnDetachedFromWindow implements ViewCompositionStrategy {
        public static final int $stable = 0;
        public static final DisposeOnDetachedFromWindow INSTANCE = new DisposeOnDetachedFromWindow();

        private DisposeOnDetachedFromWindow() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v0, types: [android.view.View$OnAttachStateChangeListener, androidx.compose.ui.platform.ViewCompositionStrategy$DisposeOnDetachedFromWindow$installFor$listener$1] */
        @Override // androidx.compose.p013ui.platform.ViewCompositionStrategy
        public InterfaceC10559a installFor(final AbstractComposeView abstractComposeView) {
            final ?? r02 = new View.OnAttachStateChangeListener() { // from class: androidx.compose.ui.platform.ViewCompositionStrategy$DisposeOnDetachedFromWindow$installFor$listener$1
                @Override // android.view.View.OnAttachStateChangeListener
                public void onViewAttachedToWindow(View view) {
                }

                @Override // android.view.View.OnAttachStateChangeListener
                public void onViewDetachedFromWindow(View view) {
                    abstractComposeView.disposeComposition();
                }
            };
            abstractComposeView.addOnAttachStateChangeListener(r02);
            return new InterfaceC10559a() { // from class: androidx.compose.ui.platform.ViewCompositionStrategy$DisposeOnDetachedFromWindow$installFor$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // p300x7.InterfaceC10559a
                public /* bridge */ /* synthetic */ Object invoke() {
                    m26100invoke();
                    return C8736p.f16368a;
                }

                /* renamed from: invoke, reason: collision with other method in class */
                public final void m26100invoke() {
                    abstractComposeView.removeOnAttachStateChangeListener(r02);
                }
            };
        }
    }

    @StabilityInferred(parameters = 1)
    public static final class DisposeOnDetachedFromWindowOrReleasedFromPool implements ViewCompositionStrategy {
        public static final int $stable = 0;
        public static final DisposeOnDetachedFromWindowOrReleasedFromPool INSTANCE = new DisposeOnDetachedFromWindowOrReleasedFromPool();

        private DisposeOnDetachedFromWindowOrReleasedFromPool() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v0, types: [android.view.View$OnAttachStateChangeListener, androidx.compose.ui.platform.ViewCompositionStrategy$DisposeOnDetachedFromWindowOrReleasedFromPool$installFor$listener$1] */
        @Override // androidx.compose.p013ui.platform.ViewCompositionStrategy
        public InterfaceC10559a installFor(final AbstractComposeView abstractComposeView) {
            final ?? r02 = new View.OnAttachStateChangeListener() { // from class: androidx.compose.ui.platform.ViewCompositionStrategy$DisposeOnDetachedFromWindowOrReleasedFromPool$installFor$listener$1
                @Override // android.view.View.OnAttachStateChangeListener
                public void onViewAttachedToWindow(View view) {
                }

                @Override // android.view.View.OnAttachStateChangeListener
                public void onViewDetachedFromWindow(View view) {
                    if (PoolingContainer.isWithinPoolingContainer(abstractComposeView)) {
                        return;
                    }
                    abstractComposeView.disposeComposition();
                }
            };
            abstractComposeView.addOnAttachStateChangeListener(r02);
            final PoolingContainerListener poolingContainerListener = new PoolingContainerListener() { // from class: androidx.compose.ui.platform.c1
                @Override // androidx.customview.poolingcontainer.PoolingContainerListener
                public final void onRelease() {
                    abstractComposeView.disposeComposition();
                }
            };
            PoolingContainer.addPoolingContainerListener(abstractComposeView, poolingContainerListener);
            return new InterfaceC10559a() { // from class: androidx.compose.ui.platform.ViewCompositionStrategy$DisposeOnDetachedFromWindowOrReleasedFromPool$installFor$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // p300x7.InterfaceC10559a
                public /* bridge */ /* synthetic */ Object invoke() {
                    m26101invoke();
                    return C8736p.f16368a;
                }

                /* renamed from: invoke, reason: collision with other method in class */
                public final void m26101invoke() {
                    abstractComposeView.removeOnAttachStateChangeListener(r02);
                    PoolingContainer.removePoolingContainerListener(abstractComposeView, poolingContainerListener);
                }
            };
        }
    }

    @StabilityInferred(parameters = 0)
    public static final class DisposeOnLifecycleDestroyed implements ViewCompositionStrategy {
        public static final int $stable = 8;
        private final Lifecycle lifecycle;

        public DisposeOnLifecycleDestroyed(Lifecycle lifecycle) {
            this.lifecycle = lifecycle;
        }

        @Override // androidx.compose.p013ui.platform.ViewCompositionStrategy
        public InterfaceC10559a installFor(AbstractComposeView abstractComposeView) {
            return ViewCompositionStrategy_androidKt.installForLifecycle(abstractComposeView, this.lifecycle);
        }

        public DisposeOnLifecycleDestroyed(LifecycleOwner lifecycleOwner) {
            this(lifecycleOwner.getLifecycle());
        }
    }

    @StabilityInferred(parameters = 1)
    public static final class DisposeOnViewTreeLifecycleDestroyed implements ViewCompositionStrategy {
        public static final int $stable = 0;
        public static final DisposeOnViewTreeLifecycleDestroyed INSTANCE = new DisposeOnViewTreeLifecycleDestroyed();

        private DisposeOnViewTreeLifecycleDestroyed() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v0, types: [android.view.View$OnAttachStateChangeListener, androidx.compose.ui.platform.ViewCompositionStrategy$DisposeOnViewTreeLifecycleDestroyed$installFor$listener$1] */
        @Override // androidx.compose.p013ui.platform.ViewCompositionStrategy
        public InterfaceC10559a installFor(final AbstractComposeView abstractComposeView) {
            if (!abstractComposeView.isAttachedToWindow()) {
                final Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
                final ?? r12 = new View.OnAttachStateChangeListener() { // from class: androidx.compose.ui.platform.ViewCompositionStrategy$DisposeOnViewTreeLifecycleDestroyed$installFor$listener$1
                    @Override // android.view.View.OnAttachStateChangeListener
                    public void onViewAttachedToWindow(View view) {
                        LifecycleOwner lifecycleOwner = ViewTreeLifecycleOwner.get(abstractComposeView);
                        AbstractComposeView abstractComposeView2 = abstractComposeView;
                        if (lifecycleOwner != null) {
                            ref$ObjectRef.f17473a = ViewCompositionStrategy_androidKt.installForLifecycle(abstractComposeView2, lifecycleOwner.getLifecycle());
                            abstractComposeView.removeOnAttachStateChangeListener(this);
                        } else {
                            InlineClassHelperKt.throwIllegalStateExceptionForNullCheck("View tree for " + abstractComposeView2 + " has no ViewTreeLifecycleOwner");
                            throw new KotlinNothingValueException();
                        }
                    }

                    @Override // android.view.View.OnAttachStateChangeListener
                    public void onViewDetachedFromWindow(View view) {
                    }
                };
                abstractComposeView.addOnAttachStateChangeListener(r12);
                ref$ObjectRef.f17473a = new InterfaceC10559a() { // from class: androidx.compose.ui.platform.ViewCompositionStrategy$DisposeOnViewTreeLifecycleDestroyed$installFor$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // p300x7.InterfaceC10559a
                    public /* bridge */ /* synthetic */ Object invoke() {
                        m26102invoke();
                        return C8736p.f16368a;
                    }

                    /* renamed from: invoke, reason: collision with other method in class */
                    public final void m26102invoke() {
                        abstractComposeView.removeOnAttachStateChangeListener(r12);
                    }
                };
                return new InterfaceC10559a() { // from class: androidx.compose.ui.platform.ViewCompositionStrategy$DisposeOnViewTreeLifecycleDestroyed$installFor$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // p300x7.InterfaceC10559a
                    public /* bridge */ /* synthetic */ Object invoke() {
                        m26103invoke();
                        return C8736p.f16368a;
                    }

                    /* renamed from: invoke, reason: collision with other method in class */
                    public final void m26103invoke() {
                        ((InterfaceC10559a) ref$ObjectRef.f17473a).invoke();
                    }
                };
            }
            LifecycleOwner lifecycleOwner = ViewTreeLifecycleOwner.get(abstractComposeView);
            if (lifecycleOwner != null) {
                return ViewCompositionStrategy_androidKt.installForLifecycle(abstractComposeView, lifecycleOwner.getLifecycle());
            }
            InlineClassHelperKt.throwIllegalStateExceptionForNullCheck("View tree for " + abstractComposeView + " has no ViewTreeLifecycleOwner");
            throw new KotlinNothingValueException();
        }
    }

    InterfaceC10559a installFor(AbstractComposeView abstractComposeView);
}
