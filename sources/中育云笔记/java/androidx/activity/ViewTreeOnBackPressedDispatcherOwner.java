package androidx.activity;

import android.view.View;
import androidx.core.viewtree.ViewTree;
import kotlin.jvm.internal.AbstractC9979u;

/* loaded from: classes.dex */
public final class ViewTreeOnBackPressedDispatcherOwner {
    public static final OnBackPressedDispatcherOwner get(View view) {
        AbstractC9979u.m20294g(view, "<this>");
        while (view != null) {
            Object tag = view.getTag(C0173R.id.view_tree_on_back_pressed_dispatcher_owner);
            OnBackPressedDispatcherOwner onBackPressedDispatcherOwner = tag instanceof OnBackPressedDispatcherOwner ? (OnBackPressedDispatcherOwner) tag : null;
            if (onBackPressedDispatcherOwner != null) {
                return onBackPressedDispatcherOwner;
            }
            Object parentOrViewTreeDisjointParent = ViewTree.getParentOrViewTreeDisjointParent(view);
            view = parentOrViewTreeDisjointParent instanceof View ? (View) parentOrViewTreeDisjointParent : null;
        }
        return null;
    }

    public static final void set(View view, OnBackPressedDispatcherOwner onBackPressedDispatcherOwner) {
        AbstractC9979u.m20294g(view, "<this>");
        AbstractC9979u.m20294g(onBackPressedDispatcherOwner, "onBackPressedDispatcherOwner");
        view.setTag(C0173R.id.view_tree_on_back_pressed_dispatcher_owner, onBackPressedDispatcherOwner);
    }
}
