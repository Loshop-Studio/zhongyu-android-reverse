package androidx.compose.p006ui.node;

import androidx.compose.p006ui.layout.IntrinsicMeasurable;
import androidx.compose.p006ui.layout.IntrinsicMeasureScope;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: androidx.compose.ui.node.c */
/* loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC1455c {
    /* renamed from: a */
    public static void m717a(LayoutModifierNode layoutModifierNode) {
        DelegatableNodeKt.requireLayoutNode(layoutModifierNode).forceRemeasure();
    }

    /* renamed from: b */
    public static int m718b(LayoutModifierNode layoutModifierNode, IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable measurable, int i4) {
        Intrinsics.checkNotNullParameter(intrinsicMeasureScope, "<this>");
        Intrinsics.checkNotNullParameter(measurable, "measurable");
        return NodeMeasuringIntrinsics.INSTANCE.maxHeight$ui_release(layoutModifierNode, intrinsicMeasureScope, measurable, i4);
    }

    /* renamed from: c */
    public static int m719c(LayoutModifierNode layoutModifierNode, IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable measurable, int i4) {
        Intrinsics.checkNotNullParameter(intrinsicMeasureScope, "<this>");
        Intrinsics.checkNotNullParameter(measurable, "measurable");
        return NodeMeasuringIntrinsics.INSTANCE.maxWidth$ui_release(layoutModifierNode, intrinsicMeasureScope, measurable, i4);
    }

    /* renamed from: d */
    public static int m720d(LayoutModifierNode layoutModifierNode, IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable measurable, int i4) {
        Intrinsics.checkNotNullParameter(intrinsicMeasureScope, "<this>");
        Intrinsics.checkNotNullParameter(measurable, "measurable");
        return NodeMeasuringIntrinsics.INSTANCE.minHeight$ui_release(layoutModifierNode, intrinsicMeasureScope, measurable, i4);
    }

    /* renamed from: e */
    public static int m721e(LayoutModifierNode layoutModifierNode, IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable measurable, int i4) {
        Intrinsics.checkNotNullParameter(intrinsicMeasureScope, "<this>");
        Intrinsics.checkNotNullParameter(measurable, "measurable");
        return NodeMeasuringIntrinsics.INSTANCE.minWidth$ui_release(layoutModifierNode, intrinsicMeasureScope, measurable, i4);
    }
}
