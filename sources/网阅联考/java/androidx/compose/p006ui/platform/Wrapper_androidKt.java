package androidx.compose.p006ui.platform;

import android.content.Context;
import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.MainThread;
import androidx.compose.p006ui.C1265R;
import androidx.compose.p006ui.node.LayoutNode;
import androidx.compose.p006ui.node.UiApplier;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Composition;
import androidx.compose.runtime.CompositionContext;
import androidx.compose.runtime.CompositionKt;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.lang.reflect.Field;
import java.util.Collections;
import java.util.WeakHashMap;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(m5174d1 = {"\u0000F\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0001\u001a0\u0010\n\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\b\u001a\u00020\t2\u0011\u0010\r\u001a\r\u0012\u0004\u0012\u00020\u000f0\u000e¢\u0006\u0002\b\u0010H\u0002¢\u0006\u0002\u0010\u0011\u001a\b\u0010\u0012\u001a\u00020\u000fH\u0002\u001a\u0010\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u000b\u001a\u00020\fH\u0002\u001a,\u0010\u0015\u001a\u00020\u0005*\u00020\u00162\u0006\u0010\b\u001a\u00020\t2\u0011\u0010\r\u001a\r\u0012\u0004\u0012\u00020\u000f0\u000e¢\u0006\u0002\b\u0010H\u0000¢\u0006\u0002\u0010\u0017\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0003X\u0082D¢\u0006\u0002\n\u0000¨\u0006\u0018"}, m5175d2 = {"DefaultLayoutParams", "Landroid/view/ViewGroup$LayoutParams;", "TAG", "", "createSubcomposition", "Landroidx/compose/runtime/Composition;", "container", "Landroidx/compose/ui/node/LayoutNode;", "parent", "Landroidx/compose/runtime/CompositionContext;", "doSetContent", "owner", "Landroidx/compose/ui/platform/AndroidComposeView;", "content", "Lkotlin/Function0;", "", "Landroidx/compose/runtime/Composable;", "(Landroidx/compose/ui/platform/AndroidComposeView;Landroidx/compose/runtime/CompositionContext;Lkotlin/jvm/functions/Function2;)Landroidx/compose/runtime/Composition;", "enableDebugInspectorInfo", "inspectionWanted", "", "setContent", "Landroidx/compose/ui/platform/AbstractComposeView;", "(Landroidx/compose/ui/platform/AbstractComposeView;Landroidx/compose/runtime/CompositionContext;Lkotlin/jvm/functions/Function2;)Landroidx/compose/runtime/Composition;", "ui_release"}, m5176k = 2, m5177mv = {1, 8, 0}, m5179xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nWrapper.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Wrapper.android.kt\nandroidx/compose/ui/platform/Wrapper_androidKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,217:1\n1#2:218\n*E\n"})
/* loaded from: classes.dex */
public final class Wrapper_androidKt {
    private static final ViewGroup.LayoutParams DefaultLayoutParams = new ViewGroup.LayoutParams(-2, -2);
    private static final String TAG = "Wrapper";

    @MainThread
    public static final Composition createSubcomposition(LayoutNode container, CompositionContext parent) {
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(parent, "parent");
        return CompositionKt.Composition(new UiApplier(container), parent);
    }

    @ComposableInferredTarget(scheme = "[0[0]]")
    private static final Composition doSetContent(AndroidComposeView androidComposeView, CompositionContext compositionContext, Function2<? super Composer, ? super Integer, Unit> function2) throws IllegalAccessException, NoSuchFieldException, SecurityException, IllegalArgumentException {
        if (inspectionWanted(androidComposeView)) {
            androidComposeView.setTag(C1265R.id.inspection_slot_table_set, Collections.newSetFromMap(new WeakHashMap()));
            enableDebugInspectorInfo();
        }
        Composition Composition = CompositionKt.Composition(new UiApplier(androidComposeView.getRoot()), compositionContext);
        Object tag = androidComposeView.getView().getTag(C1265R.id.wrapped_composition_tag);
        WrappedComposition wrappedComposition = tag instanceof WrappedComposition ? (WrappedComposition) tag : null;
        if (wrappedComposition == null) {
            wrappedComposition = new WrappedComposition(androidComposeView, Composition);
            androidComposeView.getView().setTag(C1265R.id.wrapped_composition_tag, wrappedComposition);
        }
        wrappedComposition.setContent(function2);
        return wrappedComposition;
    }

    private static final void enableDebugInspectorInfo() throws IllegalAccessException, NoSuchFieldException, SecurityException, IllegalArgumentException {
        if (InspectableValueKt.isDebugInspectorInfoEnabled()) {
            return;
        }
        try {
            Field declaredField = InspectableValueKt.class.getDeclaredField("isDebugInspectorInfoEnabled");
            declaredField.setAccessible(true);
            declaredField.setBoolean(null, true);
        } catch (Exception unused) {
            Log.w(TAG, "Could not access isDebugInspectorInfoEnabled. Please set explicitly.");
        }
    }

    private static final boolean inspectionWanted(AndroidComposeView androidComposeView) {
        return Build.VERSION.SDK_INT >= 29 && (WrapperVerificationHelperMethods.INSTANCE.attributeSourceResourceMap(androidComposeView).isEmpty() ^ true);
    }

    @ComposableInferredTarget(scheme = "[0[0]]")
    public static final Composition setContent(AbstractComposeView abstractComposeView, CompositionContext parent, Function2<? super Composer, ? super Integer, Unit> content) {
        Intrinsics.checkNotNullParameter(abstractComposeView, "<this>");
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(content, "content");
        GlobalSnapshotManager.INSTANCE.ensureStarted();
        AndroidComposeView androidComposeView = null;
        if (abstractComposeView.getChildCount() > 0) {
            View childAt = abstractComposeView.getChildAt(0);
            if (childAt instanceof AndroidComposeView) {
                androidComposeView = (AndroidComposeView) childAt;
            }
        } else {
            abstractComposeView.removeAllViews();
        }
        if (androidComposeView == null) {
            Context context = abstractComposeView.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "context");
            androidComposeView = new AndroidComposeView(context);
            abstractComposeView.addView(androidComposeView.getView(), DefaultLayoutParams);
        }
        return doSetContent(androidComposeView, parent, content);
    }
}
