package androidx.compose.p014ui.platform;

import android.content.ContentResolver;
import android.content.Context;
import android.database.ContentObserver;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.provider.Settings;
import android.view.View;
import android.view.ViewParent;
import androidx.compose.p014ui.C2638R;
import androidx.compose.p014ui.MotionDurationScale;
import androidx.compose.p014ui.internal.InlineClassHelperKt;
import androidx.compose.runtime.CompositionContext;
import androidx.compose.runtime.MonotonicFrameClock;
import androidx.compose.runtime.PausableMonotonicFrameClock;
import androidx.compose.runtime.Recomposer;
import androidx.core.os.HandlerCompat;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.KotlinNothingValueException;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.InterfaceC9944c;
import kotlin.coroutines.InterfaceC9945d;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.AbstractC10006d;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.channels.AbstractC10001b;
import kotlinx.coroutines.channels.InterfaceC10000a;
import kotlinx.coroutines.flow.InterfaceC10040a;
import p309qc.C10786q;
import p379vd.AbstractC11596e;
import p379vd.InterfaceC11612u;
import sd.AbstractC11117h;
import sd.InterfaceC11122i0;

/* loaded from: classes2.dex */
public final class WindowRecomposer_androidKt {
    private static final Map<Context, InterfaceC11612u> animationScale = new LinkedHashMap();

    public static final Recomposer createLifecycleAwareWindowRecomposer(final View view, InterfaceC9945d interfaceC9945d, Lifecycle lifecycle) {
        final PausableMonotonicFrameClock pausableMonotonicFrameClock;
        if (interfaceC9945d.get(InterfaceC9944c.f23354a0) == null || interfaceC9945d.get(MonotonicFrameClock.Key) == null) {
            interfaceC9945d = AndroidUiDispatcher.Companion.getCurrentThread().plus(interfaceC9945d);
        }
        MonotonicFrameClock monotonicFrameClock = (MonotonicFrameClock) interfaceC9945d.get(MonotonicFrameClock.Key);
        if (monotonicFrameClock != null) {
            PausableMonotonicFrameClock pausableMonotonicFrameClock2 = new PausableMonotonicFrameClock(monotonicFrameClock);
            pausableMonotonicFrameClock2.pause();
            pausableMonotonicFrameClock = pausableMonotonicFrameClock2;
        } else {
            pausableMonotonicFrameClock = null;
        }
        final Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        InterfaceC9945d motionDurationScaleImpl = (MotionDurationScale) interfaceC9945d.get(MotionDurationScale.Key);
        if (motionDurationScaleImpl == null) {
            motionDurationScaleImpl = new MotionDurationScaleImpl();
            ref$ObjectRef.f23402c = motionDurationScaleImpl;
        }
        InterfaceC9945d interfaceC9945dPlus = interfaceC9945d.plus(pausableMonotonicFrameClock != null ? pausableMonotonicFrameClock : EmptyCoroutineContext.f23351c).plus(motionDurationScaleImpl);
        final Recomposer recomposer = new Recomposer(interfaceC9945dPlus);
        recomposer.pauseCompositionFrameClock();
        final InterfaceC11122i0 interfaceC11122i0M20744a = AbstractC10006d.m20744a(interfaceC9945dPlus);
        if (lifecycle == null) {
            LifecycleOwner lifecycleOwner = ViewTreeLifecycleOwner.get(view);
            lifecycle = lifecycleOwner != null ? lifecycleOwner.getLifecycle() : null;
        }
        if (lifecycle != null) {
            view.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() { // from class: androidx.compose.ui.platform.WindowRecomposer_androidKt.createLifecycleAwareWindowRecomposer.1
                @Override // android.view.View.OnAttachStateChangeListener
                public void onViewAttachedToWindow(View view2) {
                }

                @Override // android.view.View.OnAttachStateChangeListener
                public void onViewDetachedFromWindow(View view2) {
                    view.removeOnAttachStateChangeListener(this);
                    recomposer.cancel();
                }
            });
            lifecycle.addObserver(new LifecycleEventObserver() { // from class: androidx.compose.ui.platform.WindowRecomposer_androidKt.createLifecycleAwareWindowRecomposer.2

                /* renamed from: androidx.compose.ui.platform.WindowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2$WhenMappings */
                public /* synthetic */ class WhenMappings {
                    public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                    static {
                        int[] iArr = new int[Lifecycle.Event.values().length];
                        try {
                            iArr[Lifecycle.Event.ON_CREATE.ordinal()] = 1;
                        } catch (NoSuchFieldError unused) {
                        }
                        try {
                            iArr[Lifecycle.Event.ON_START.ordinal()] = 2;
                        } catch (NoSuchFieldError unused2) {
                        }
                        try {
                            iArr[Lifecycle.Event.ON_STOP.ordinal()] = 3;
                        } catch (NoSuchFieldError unused3) {
                        }
                        try {
                            iArr[Lifecycle.Event.ON_DESTROY.ordinal()] = 4;
                        } catch (NoSuchFieldError unused4) {
                        }
                        try {
                            iArr[Lifecycle.Event.ON_PAUSE.ordinal()] = 5;
                        } catch (NoSuchFieldError unused5) {
                        }
                        try {
                            iArr[Lifecycle.Event.ON_RESUME.ordinal()] = 6;
                        } catch (NoSuchFieldError unused6) {
                        }
                        try {
                            iArr[Lifecycle.Event.ON_ANY.ordinal()] = 7;
                        } catch (NoSuchFieldError unused7) {
                        }
                        $EnumSwitchMapping$0 = iArr;
                    }
                }

                @Override // androidx.lifecycle.LifecycleEventObserver
                public void onStateChanged(LifecycleOwner lifecycleOwner2, Lifecycle.Event event) {
                    int i10 = WhenMappings.$EnumSwitchMapping$0[event.ordinal()];
                    if (i10 == 1) {
                        AbstractC11117h.m24726d(interfaceC11122i0M20744a, null, CoroutineStart.f23479f, new C3014x149b840a(ref$ObjectRef, recomposer, lifecycleOwner2, this, view, null), 1, null);
                        return;
                    }
                    if (i10 == 2) {
                        PausableMonotonicFrameClock pausableMonotonicFrameClock3 = pausableMonotonicFrameClock;
                        if (pausableMonotonicFrameClock3 != null) {
                            pausableMonotonicFrameClock3.resume();
                        }
                        recomposer.resumeCompositionFrameClock();
                        return;
                    }
                    if (i10 == 3) {
                        recomposer.pauseCompositionFrameClock();
                    } else {
                        if (i10 != 4) {
                            return;
                        }
                        recomposer.cancel();
                    }
                }
            });
            return recomposer;
        }
        InlineClassHelperKt.throwIllegalStateExceptionForNullCheck("ViewTreeLifecycleOwner not found from " + view);
        throw new KotlinNothingValueException();
    }

    public static /* synthetic */ Recomposer createLifecycleAwareWindowRecomposer$default(View view, InterfaceC9945d interfaceC9945d, Lifecycle lifecycle, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            interfaceC9945d = EmptyCoroutineContext.f23351c;
        }
        if ((i10 & 2) != 0) {
            lifecycle = null;
        }
        return createLifecycleAwareWindowRecomposer(view, interfaceC9945d, lifecycle);
    }

    public static final CompositionContext findViewTreeCompositionContext(View view) {
        CompositionContext compositionContext = getCompositionContext(view);
        if (compositionContext != null) {
            return compositionContext;
        }
        for (ViewParent parent = view.getParent(); compositionContext == null && (parent instanceof View); parent = parent.getParent()) {
            compositionContext = getCompositionContext((View) parent);
        }
        return compositionContext;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference failed for: r5v1, types: [androidx.compose.ui.platform.WindowRecomposer_androidKt$getAnimationScaleFlowFor$1$1$contentObserver$1] */
    public static final InterfaceC11612u getAnimationScaleFlowFor(Context context) {
        InterfaceC11612u interfaceC11612u;
        Map<Context, InterfaceC11612u> map = animationScale;
        synchronized (map) {
            try {
                InterfaceC11612u interfaceC11612uM25546Q = map.get(context);
                if (interfaceC11612uM25546Q == null) {
                    ContentResolver contentResolver = context.getContentResolver();
                    Uri uriFor = Settings.Global.getUriFor("animator_duration_scale");
                    final InterfaceC10000a interfaceC10000aM20722b = AbstractC10001b.m20722b(-1, null, null, 6, null);
                    final Handler handlerCreateAsync = HandlerCompat.createAsync(Looper.getMainLooper());
                    interfaceC11612uM25546Q = AbstractC11596e.m25546Q(AbstractC11596e.m25531B(new WindowRecomposer_androidKt$getAnimationScaleFlowFor$1$1$1(contentResolver, uriFor, new ContentObserver(handlerCreateAsync) { // from class: androidx.compose.ui.platform.WindowRecomposer_androidKt$getAnimationScaleFlowFor$1$1$contentObserver$1
                        @Override // android.database.ContentObserver
                        public void onChange(boolean z10, Uri uri) {
                            interfaceC10000aM20722b.mo33808trySendJP2dKIU(C10786q.f26013a);
                        }
                    }, interfaceC10000aM20722b, context, null)), AbstractC10006d.m20745b(), InterfaceC10040a.a.m20875b(InterfaceC10040a.f23896a, 0L, 0L, 3, null), Float.valueOf(Settings.Global.getFloat(context.getContentResolver(), "animator_duration_scale", 1.0f)));
                    map.put(context, interfaceC11612uM25546Q);
                }
                interfaceC11612u = interfaceC11612uM25546Q;
            } catch (Throwable th) {
                throw th;
            }
        }
        return interfaceC11612u;
    }

    public static final CompositionContext getCompositionContext(View view) {
        Object tag = view.getTag(C2638R.id.androidx_compose_ui_view_composition_context);
        if (tag instanceof CompositionContext) {
            return (CompositionContext) tag;
        }
        return null;
    }

    private static final View getContentChild(View view) {
        Object parent = view.getParent();
        while (parent instanceof View) {
            View view2 = (View) parent;
            if (view2.getId() == 16908290) {
                break;
            }
            parent = view2.getParent();
            view = view2;
        }
        return view;
    }

    public static final Recomposer getWindowRecomposer(View view) {
        if (!view.isAttachedToWindow()) {
            InlineClassHelperKt.throwIllegalStateException("Cannot locate windowRecomposer; View " + view + " is not attached to a window");
        }
        View contentChild = getContentChild(view);
        CompositionContext compositionContext = getCompositionContext(contentChild);
        if (compositionContext == null) {
            return WindowRecomposerPolicy.INSTANCE.createAndInstallWindowRecomposer$ui_release(contentChild);
        }
        if (compositionContext instanceof Recomposer) {
            return (Recomposer) compositionContext;
        }
        throw new IllegalStateException("root viewTreeParentCompositionContext is not a Recomposer");
    }

    public static /* synthetic */ void getWindowRecomposer$annotations(View view) {
    }

    public static final void setCompositionContext(View view, CompositionContext compositionContext) {
        view.setTag(C2638R.id.androidx_compose_ui_view_composition_context, compositionContext);
    }
}
