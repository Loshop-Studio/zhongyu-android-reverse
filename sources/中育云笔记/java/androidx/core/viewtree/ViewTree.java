package androidx.core.viewtree;

import android.view.View;
import android.view.ViewParent;
import kotlin.jvm.internal.AbstractC9979u;

/* loaded from: classes2.dex */
public final class ViewTree {
    public static final ViewParent getParentOrViewTreeDisjointParent(View view) {
        AbstractC9979u.m20294g(view, "<this>");
        ViewParent parent = view.getParent();
        if (parent != null) {
            return parent;
        }
        Object tag = view.getTag(C3687R.id.view_tree_disjoint_parent);
        if (tag instanceof ViewParent) {
            return (ViewParent) tag;
        }
        return null;
    }

    public static final void setViewTreeDisjointParent(View view, ViewParent viewParent) {
        AbstractC9979u.m20294g(view, "<this>");
        view.setTag(C3687R.id.view_tree_disjoint_parent, viewParent);
    }
}
