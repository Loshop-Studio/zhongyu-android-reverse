package android.view;

import android.view.View;
import android.view.viewmodel.C2777R;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.viewtree.ViewTree;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.AbstractC5830k;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m5109d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a\u001d\u0010\u0006\u001a\u00020\u0003*\u00020\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0007¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u0015\u0010\t\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\n"}, m5110d2 = {"Landroid/view/View;", "Landroidx/lifecycle/ViewModelStoreOwner;", "viewModelStoreOwner", "Ld6/s;", "set", "(Landroid/view/View;Landroidx/lifecycle/ViewModelStoreOwner;)V", "setViewTreeViewModelStoreOwner", "get", "(Landroid/view/View;)Landroidx/lifecycle/ViewModelStoreOwner;", "findViewTreeViewModelStoreOwner", "lifecycle-viewmodel_release"}, m5111k = 2, m5112mv = {2, 0, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@JvmName(name = "ViewTreeViewModelStoreOwner")
/* renamed from: androidx.lifecycle.ViewTreeViewModelStoreOwner, reason: from Kotlin metadata and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C6893ViewTreeViewModelStoreOwner {
    @JvmName(name = "get")
    @Nullable
    public static final ViewModelStoreOwner get(@NotNull View view) {
        AbstractC5830k.m5330g(view, "<this>");
        while (view != null) {
            Object tag = view.getTag(C2777R.id.view_tree_view_model_store_owner);
            ViewModelStoreOwner viewModelStoreOwner = tag instanceof ViewModelStoreOwner ? (ViewModelStoreOwner) tag : null;
            if (viewModelStoreOwner != null) {
                return viewModelStoreOwner;
            }
            Object parentOrViewTreeDisjointParent = ViewTree.getParentOrViewTreeDisjointParent(view);
            view = parentOrViewTreeDisjointParent instanceof View ? (View) parentOrViewTreeDisjointParent : null;
        }
        return null;
    }

    @JvmName(name = "set")
    public static final void set(@NotNull View view, @Nullable ViewModelStoreOwner viewModelStoreOwner) {
        AbstractC5830k.m5330g(view, "<this>");
        view.setTag(C2777R.id.view_tree_view_model_store_owner, viewModelStoreOwner);
    }
}
