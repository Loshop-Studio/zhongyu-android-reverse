package androidx.navigation;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5830k;
import org.jetbrains.annotations.NotNull;

@Metadata(m5109d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0003"}, m5110d2 = {"findNavController", "Landroidx/navigation/NavController;", "Landroid/view/View;", "navigation-runtime_release"}, m5111k = 5, m5112mv = {2, 0, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE, m5115xs = "androidx/navigation/ViewKt")
/* loaded from: classes2.dex */
final /* synthetic */ class ViewKt__View_androidKt {
    @NotNull
    public static final NavController findNavController(@NotNull View view) {
        AbstractC5830k.m5330g(view, "<this>");
        return Navigation.findNavController(view);
    }
}
