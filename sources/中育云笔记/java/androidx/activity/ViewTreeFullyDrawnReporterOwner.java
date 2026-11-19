package androidx.activity;

import android.view.View;
import androidx.core.viewtree.ViewTree;
import kotlin.jvm.internal.AbstractC9979u;

/* loaded from: classes.dex */
public final class ViewTreeFullyDrawnReporterOwner {
    public static final FullyDrawnReporterOwner get(View view) {
        AbstractC9979u.m20294g(view, "<this>");
        while (view != null) {
            Object tag = view.getTag(C0173R.id.report_drawn);
            FullyDrawnReporterOwner fullyDrawnReporterOwner = tag instanceof FullyDrawnReporterOwner ? (FullyDrawnReporterOwner) tag : null;
            if (fullyDrawnReporterOwner != null) {
                return fullyDrawnReporterOwner;
            }
            Object parentOrViewTreeDisjointParent = ViewTree.getParentOrViewTreeDisjointParent(view);
            view = parentOrViewTreeDisjointParent instanceof View ? (View) parentOrViewTreeDisjointParent : null;
        }
        return null;
    }

    public static final void set(View view, FullyDrawnReporterOwner fullyDrawnReporterOwner) {
        AbstractC9979u.m20294g(view, "<this>");
        AbstractC9979u.m20294g(fullyDrawnReporterOwner, "fullyDrawnReporterOwner");
        view.setTag(C0173R.id.report_drawn, fullyDrawnReporterOwner);
    }
}
