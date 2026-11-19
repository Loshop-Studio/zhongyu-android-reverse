package androidx.navigation;

import android.app.Activity;
import androidx.annotation.IdRes;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(m13557d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u001a\u0014\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\b\b\u0001\u0010\u0003\u001a\u00020\u0004¨\u0006\u0005"}, m13558d2 = {"findNavController", "Landroidx/navigation/NavController;", "Landroid/app/Activity;", "viewId", "", "navigation-runtime_release"}, m13559k = 5, m13560mv = {2, 0, 0}, m13562xi = 48, m13563xs = "androidx/navigation/ActivityKt")
/* loaded from: classes3.dex */
final /* synthetic */ class ActivityKt__Activity_androidKt {
    public static final NavController findNavController(Activity activity, @IdRes int i10) {
        Intrinsics.checkNotNullParameter(activity, "<this>");
        return Navigation.findNavController(activity, i10);
    }
}
