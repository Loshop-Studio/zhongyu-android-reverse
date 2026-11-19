package androidx.savedstate;

import android.view.View;
import androidx.core.viewtree.ViewTree;
import kotlin.jvm.internal.AbstractC9133u;

/* loaded from: classes3.dex */
public final class ViewTreeSavedStateRegistryOwner {
    public static final SavedStateRegistryOwner get(View view) {
        AbstractC9133u.m16133g(view, "<this>");
        while (view != null) {
            Object tag = view.getTag(C4663R.id.view_tree_saved_state_registry_owner);
            SavedStateRegistryOwner savedStateRegistryOwner = tag instanceof SavedStateRegistryOwner ? (SavedStateRegistryOwner) tag : null;
            if (savedStateRegistryOwner != null) {
                return savedStateRegistryOwner;
            }
            Object parentOrViewTreeDisjointParent = ViewTree.getParentOrViewTreeDisjointParent(view);
            view = parentOrViewTreeDisjointParent instanceof View ? (View) parentOrViewTreeDisjointParent : null;
        }
        return null;
    }

    public static final void set(View view, SavedStateRegistryOwner savedStateRegistryOwner) {
        AbstractC9133u.m16133g(view, "<this>");
        view.setTag(C4663R.id.view_tree_saved_state_registry_owner, savedStateRegistryOwner);
    }
}
