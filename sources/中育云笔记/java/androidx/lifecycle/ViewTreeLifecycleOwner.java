package androidx.lifecycle;

import android.view.View;
import androidx.core.viewtree.ViewTree;
import androidx.lifecycle.runtime.C3983R;
import kotlin.jvm.internal.AbstractC9979u;

/* loaded from: classes2.dex */
public final class ViewTreeLifecycleOwner {
    public static final LifecycleOwner get(View view) {
        AbstractC9979u.m20294g(view, "<this>");
        while (view != null) {
            Object tag = view.getTag(C3983R.id.view_tree_lifecycle_owner);
            LifecycleOwner lifecycleOwner = tag instanceof LifecycleOwner ? (LifecycleOwner) tag : null;
            if (lifecycleOwner != null) {
                return lifecycleOwner;
            }
            Object parentOrViewTreeDisjointParent = ViewTree.getParentOrViewTreeDisjointParent(view);
            view = parentOrViewTreeDisjointParent instanceof View ? (View) parentOrViewTreeDisjointParent : null;
        }
        return null;
    }

    public static final void set(View view, LifecycleOwner lifecycleOwner) {
        AbstractC9979u.m20294g(view, "<this>");
        view.setTag(C3983R.id.view_tree_lifecycle_owner, lifecycleOwner);
    }
}
