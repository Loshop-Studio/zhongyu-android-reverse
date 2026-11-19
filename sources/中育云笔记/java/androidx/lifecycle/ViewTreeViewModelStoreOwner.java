package androidx.lifecycle;

import android.view.View;
import androidx.core.viewtree.ViewTree;
import androidx.lifecycle.viewmodel.C3989R;
import kotlin.jvm.internal.AbstractC9979u;

/* loaded from: classes2.dex */
public final class ViewTreeViewModelStoreOwner {
    public static final ViewModelStoreOwner get(View view) {
        AbstractC9979u.m20294g(view, "<this>");
        while (view != null) {
            Object tag = view.getTag(C3989R.id.view_tree_view_model_store_owner);
            ViewModelStoreOwner viewModelStoreOwner = tag instanceof ViewModelStoreOwner ? (ViewModelStoreOwner) tag : null;
            if (viewModelStoreOwner != null) {
                return viewModelStoreOwner;
            }
            Object parentOrViewTreeDisjointParent = ViewTree.getParentOrViewTreeDisjointParent(view);
            view = parentOrViewTreeDisjointParent instanceof View ? (View) parentOrViewTreeDisjointParent : null;
        }
        return null;
    }

    public static final void set(View view, ViewModelStoreOwner viewModelStoreOwner) {
        AbstractC9979u.m20294g(view, "<this>");
        view.setTag(C3989R.id.view_tree_view_model_store_owner, viewModelStoreOwner);
    }
}
