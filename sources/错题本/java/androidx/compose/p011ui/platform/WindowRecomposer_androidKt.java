package androidx.compose.p011ui.platform;

import android.content.ContentResolver;
import android.content.Context;
import android.database.ContentObserver;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.provider.Settings;
import android.view.C6892ViewTreeLifecycleOwner;
import android.view.Lifecycle;
import android.view.LifecycleEventObserver;
import android.view.LifecycleOwner;
import android.view.View;
import android.view.ViewParent;
import androidx.compose.p011ui.C2075R;
import androidx.compose.p011ui.MotionDurationScale;
import androidx.compose.p011ui.internal.InlineClassHelperKt;
import androidx.compose.runtime.CompositionContext;
import androidx.compose.runtime.MonotonicFrameClock;
import androidx.compose.runtime.PausableMonotonicFrameClock;
import androidx.compose.runtime.Recomposer;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.os.HandlerCompat;
import com.alibaba.sdk.android.oss.common.RequestParameters;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.AbstractC5896f0;
import kotlinx.coroutines.AbstractC6014x;
import kotlinx.coroutines.C5982m1;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.channels.AbstractC5882k;
import kotlinx.coroutines.channels.C5873b;
import kotlinx.coroutines.flow.AbstractC5914h;
import kotlinx.coroutines.flow.C5903b0;
import kotlinx.coroutines.flow.C5942l0;
import kotlinx.coroutines.flow.InterfaceC5944m0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p045d6.C5443s;
import p054e7.AbstractC5479k;
import p054e7.C5471c;
import p068g7.C5609e;
import p075h6.C5632d;
import p075h6.InterfaceC5636h;
import p169t6.AbstractC6600a;

@Metadata(m5109d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\b\u0010\u001a\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\b\u0010\t\u001a'\u0010\u000f\u001a\u00020\u000e*\u00020\u00002\b\b\u0002\u0010\u000b\u001a\u00020\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000f\u0010\u0010\"&\u0010\u0012\u001a\u0014\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\",\u0010\u0018\u001a\u0004\u0018\u00010\u0001*\u00020\u00002\b\u0010\u0014\u001a\u0004\u0018\u00010\u00018F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0015\u0010\u0003\"\u0004\b\u0016\u0010\u0017\"\u0018\u0010\u001b\u001a\u00020\u0000*\u00020\u00008BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001a\"\u001e\u0010 \u001a\u00020\u000e*\u00020\u00008@X\u0080\u0004¢\u0006\f\u0012\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u001c\u0010\u001d¨\u0006!"}, m5110d2 = {"Landroid/view/View;", "Landroidx/compose/runtime/CompositionContext;", "findViewTreeCompositionContext", "(Landroid/view/View;)Landroidx/compose/runtime/CompositionContext;", "Landroid/content/Context;", "applicationContext", "Lkotlinx/coroutines/flow/m0;", "", "getAnimationScaleFlowFor", "(Landroid/content/Context;)Lkotlinx/coroutines/flow/m0;", "Lh6/h;", "coroutineContext", "Landroidx/lifecycle/Lifecycle;", RequestParameters.SUBRESOURCE_LIFECYCLE, "Landroidx/compose/runtime/Recomposer;", "createLifecycleAwareWindowRecomposer", "(Landroid/view/View;Lh6/h;Landroidx/lifecycle/Lifecycle;)Landroidx/compose/runtime/Recomposer;", "", "animationScale", "Ljava/util/Map;", "value", "getCompositionContext", "setCompositionContext", "(Landroid/view/View;Landroidx/compose/runtime/CompositionContext;)V", "compositionContext", "getContentChild", "(Landroid/view/View;)Landroid/view/View;", "contentChild", "getWindowRecomposer", "(Landroid/view/View;)Landroidx/compose/runtime/Recomposer;", "getWindowRecomposer$annotations", "(Landroid/view/View;)V", "windowRecomposer", "ui_release"}, m5111k = 2, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nWindowRecomposer.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WindowRecomposer.android.kt\nandroidx/compose/ui/platform/WindowRecomposer_androidKt\n+ 2 Synchronization.android.kt\nandroidx/compose/ui/platform/Synchronization_androidKt\n+ 3 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 4 InlineClassHelper.kt\nandroidx/compose/ui/internal/InlineClassHelperKt\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,436:1\n32#2,2:437\n372#3,7:439\n56#4,5:446\n76#4,7:452\n1#5:451\n*S KotlinDebug\n*F\n+ 1 WindowRecomposer.android.kt\nandroidx/compose/ui/platform/WindowRecomposer_androidKt\n*L\n97#1:437,2\n98#1:439,7\n292#1:446,5\n348#1:452,7\n*E\n"})
/* loaded from: classes2.dex */
public final class WindowRecomposer_androidKt {

    @NotNull
    private static final Map<Context, InterfaceC5944m0> animationScale = new LinkedHashMap();

    /* JADX WARN: Type inference failed for: r0v11, types: [T, androidx.compose.ui.platform.MotionDurationScaleImpl] */
    @NotNull
    public static final Recomposer createLifecycleAwareWindowRecomposer(@NotNull final View view, @NotNull InterfaceC5636h interfaceC5636h, @Nullable Lifecycle lifecycle) {
        final PausableMonotonicFrameClock pausableMonotonicFrameClock;
        if (interfaceC5636h.get(C5632d.f8764a) == null || interfaceC5636h.get(MonotonicFrameClock.INSTANCE) == null) {
            interfaceC5636h = AndroidUiDispatcher.INSTANCE.getCurrentThread().plus(interfaceC5636h);
        }
        MonotonicFrameClock monotonicFrameClock = (MonotonicFrameClock) interfaceC5636h.get(MonotonicFrameClock.INSTANCE);
        if (monotonicFrameClock != null) {
            PausableMonotonicFrameClock pausableMonotonicFrameClock2 = new PausableMonotonicFrameClock(monotonicFrameClock);
            pausableMonotonicFrameClock2.pause();
            pausableMonotonicFrameClock = pausableMonotonicFrameClock2;
        } else {
            pausableMonotonicFrameClock = null;
        }
        final Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        MotionDurationScale motionDurationScale = (MotionDurationScale) interfaceC5636h.get(MotionDurationScale.INSTANCE);
        MotionDurationScale motionDurationScale2 = motionDurationScale;
        if (motionDurationScale == null) {
            ?? motionDurationScaleImpl = new MotionDurationScaleImpl();
            ref$ObjectRef.element = motionDurationScaleImpl;
            motionDurationScale2 = motionDurationScaleImpl;
        }
        InterfaceC5636h interfaceC5636hPlus = interfaceC5636h.plus(pausableMonotonicFrameClock != null ? pausableMonotonicFrameClock : EmptyCoroutineContext.INSTANCE).plus(motionDurationScale2);
        final Recomposer recomposer = new Recomposer(interfaceC5636hPlus);
        recomposer.pauseCompositionFrameClock();
        final C5471c c5471cM5630a = AbstractC6014x.m5630a(interfaceC5636hPlus);
        if (lifecycle == null) {
            LifecycleOwner lifecycleOwner = C6892ViewTreeLifecycleOwner.get(view);
            lifecycle = lifecycleOwner != null ? lifecycleOwner.getLifecycle() : null;
        }
        if (lifecycle != null) {
            view.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() { // from class: androidx.compose.ui.platform.WindowRecomposer_androidKt.createLifecycleAwareWindowRecomposer.1
                @Override // android.view.View.OnAttachStateChangeListener
                public void onViewAttachedToWindow(View v2) {
                }

                @Override // android.view.View.OnAttachStateChangeListener
                public void onViewDetachedFromWindow(View v2) {
                    view.removeOnAttachStateChangeListener(this);
                    recomposer.cancel();
                }
            });
            lifecycle.addObserver(new LifecycleEventObserver() { // from class: androidx.compose.ui.platform.WindowRecomposer_androidKt.createLifecycleAwareWindowRecomposer.2

                @Metadata(m5111k = 3, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
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

                @Override // android.view.LifecycleEventObserver
                public void onStateChanged(LifecycleOwner source, Lifecycle.Event event) {
                    int i = WhenMappings.$EnumSwitchMapping$0[event.ordinal()];
                    if (i == 1) {
                        AbstractC6014x.m5651v(c5471cM5630a, null, CoroutineStart.UNDISPATCHED, new C2262x149b840a(ref$ObjectRef, recomposer, source, this, view, null), 1);
                        return;
                    }
                    if (i == 2) {
                        PausableMonotonicFrameClock pausableMonotonicFrameClock3 = pausableMonotonicFrameClock;
                        if (pausableMonotonicFrameClock3 != null) {
                            pausableMonotonicFrameClock3.resume();
                        }
                        recomposer.resumeCompositionFrameClock();
                        return;
                    }
                    if (i == 3) {
                        recomposer.pauseCompositionFrameClock();
                    } else {
                        if (i != 4) {
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

    public static /* synthetic */ Recomposer createLifecycleAwareWindowRecomposer$default(View view, InterfaceC5636h interfaceC5636h, Lifecycle lifecycle, int i, Object obj) {
        if ((i & 1) != 0) {
            interfaceC5636h = EmptyCoroutineContext.INSTANCE;
        }
        if ((i & 2) != 0) {
            lifecycle = null;
        }
        return createLifecycleAwareWindowRecomposer(view, interfaceC5636h, lifecycle);
    }

    @Nullable
    public static final CompositionContext findViewTreeCompositionContext(@NotNull View view) {
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
    public static final InterfaceC5944m0 getAnimationScaleFlowFor(Context context) {
        InterfaceC5944m0 interfaceC5944m0;
        Map<Context, InterfaceC5944m0> map = animationScale;
        synchronized (map) {
            try {
                InterfaceC5944m0 interfaceC5944m0M5557m = map.get(context);
                if (interfaceC5944m0M5557m == null) {
                    ContentResolver contentResolver = context.getContentResolver();
                    Uri uriFor = Settings.Global.getUriFor("animator_duration_scale");
                    final C5873b c5873bM5511a = AbstractC5882k.m5511a(-1, 6, null);
                    final Handler handlerCreateAsync = HandlerCompat.createAsync(Looper.getMainLooper());
                    C5903b0 c5903b0 = new C5903b0(new WindowRecomposer_androidKt$getAnimationScaleFlowFor$1$1$1(contentResolver, uriFor, new ContentObserver(handlerCreateAsync) { // from class: androidx.compose.ui.platform.WindowRecomposer_androidKt$getAnimationScaleFlowFor$1$1$contentObserver$1
                        @Override // android.database.ContentObserver
                        public void onChange(boolean selfChange, Uri uri) {
                            c5873bM5511a.mo5481a(C5443s.f8405a);
                        }
                    }, c5873bM5511a, context, null));
                    C5982m1 c5982m1M5632c = AbstractC6014x.m5632c();
                    C5609e c5609e = AbstractC5896f0.f9343a;
                    interfaceC5944m0M5557m = AbstractC5914h.m5557m(c5903b0, new C5471c(AbstractC6600a.m6239o(AbstractC5479k.f8471a, c5982m1M5632c)), new C5942l0(), Float.valueOf(Settings.Global.getFloat(context.getContentResolver(), "animator_duration_scale", 1.0f)));
                    map.put(context, interfaceC5944m0M5557m);
                }
                interfaceC5944m0 = interfaceC5944m0M5557m;
            } catch (Throwable th) {
                throw th;
            }
        }
        return interfaceC5944m0;
    }

    @Nullable
    public static final CompositionContext getCompositionContext(@NotNull View view) {
        Object tag = view.getTag(C2075R.id.androidx_compose_ui_view_composition_context);
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

    @NotNull
    public static final Recomposer getWindowRecomposer(@NotNull View view) {
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

    public static final void setCompositionContext(@NotNull View view, @Nullable CompositionContext compositionContext) {
        view.setTag(C2075R.id.androidx_compose_ui_view_composition_context, compositionContext);
    }
}
