package androidx.navigation;

import android.app.Activity;
import androidx.annotation.IdRes;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(m13412d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u001a\u0014\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\b\b\u0001\u0010\u0003\u001a\u00020\u0004¨\u0006\u0005"}, m13413d2 = {"findNavController", "Landroidx/navigation/NavController;", "Landroid/app/Activity;", "viewId", "", "navigation-runtime_release"}, m13414k = 5, m13415mv = {2, 0, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE, m13418xs = "androidx/navigation/ActivityKt")
/* loaded from: classes3.dex */
final /* synthetic */ class ActivityKt__Activity_androidKt {
    public static final NavController findNavController(Activity activity, @IdRes int i9) {
        Intrinsics.checkNotNullParameter(activity, "<this>");
        return Navigation.findNavController(activity, i9);
    }
}
