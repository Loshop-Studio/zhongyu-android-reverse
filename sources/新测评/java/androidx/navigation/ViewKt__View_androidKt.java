package androidx.navigation;

import android.view.View;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(m13557d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0003"}, m13558d2 = {"findNavController", "Landroidx/navigation/NavController;", "Landroid/view/View;", "navigation-runtime_release"}, m13559k = 5, m13560mv = {2, 0, 0}, m13562xi = 48, m13563xs = "androidx/navigation/ViewKt")
/* loaded from: classes3.dex */
final /* synthetic */ class ViewKt__View_androidKt {
    public static final NavController findNavController(View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        return Navigation.findNavController(view);
    }
}
