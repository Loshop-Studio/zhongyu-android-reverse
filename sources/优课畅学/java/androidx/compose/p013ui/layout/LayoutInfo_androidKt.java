package androidx.compose.p013ui.layout;

import android.view.View;
import androidx.compose.p013ui.node.LayoutNode;
import kotlin.jvm.internal.AbstractC9133u;

/* loaded from: classes2.dex */
public final class LayoutInfo_androidKt {
    public static final View getView(LayoutInfo layoutInfo) {
        AbstractC9133u.m16131e(layoutInfo, "null cannot be cast to non-null type androidx.compose.ui.node.LayoutNode");
        Object owner$ui_release = ((LayoutNode) layoutInfo).getOwner$ui_release();
        if (owner$ui_release instanceof View) {
            return (View) owner$ui_release;
        }
        return null;
    }
}
