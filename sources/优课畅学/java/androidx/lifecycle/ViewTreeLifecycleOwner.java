package androidx.lifecycle;

import android.view.View;
import androidx.core.viewtree.ViewTree;
import androidx.lifecycle.runtime.C4107R;
import kotlin.jvm.internal.AbstractC9133u;

/* loaded from: classes3.dex */
public final class ViewTreeLifecycleOwner {
    public static final LifecycleOwner get(View view) {
        AbstractC9133u.m16133g(view, "<this>");
        while (view != null) {
            Object tag = view.getTag(C4107R.id.view_tree_lifecycle_owner);
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
        AbstractC9133u.m16133g(view, "<this>");
        view.setTag(C4107R.id.view_tree_lifecycle_owner, lifecycleOwner);
    }
}
