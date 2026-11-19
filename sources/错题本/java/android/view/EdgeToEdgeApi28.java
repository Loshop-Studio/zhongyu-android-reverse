package android.view;

import android.view.Window;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5830k;
import org.jetbrains.annotations.NotNull;

@RequiresApi(28)
@Metadata(m5109d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0013\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0017¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, m5110d2 = {"Landroidx/activity/EdgeToEdgeApi28;", "Landroidx/activity/EdgeToEdgeApi26;", "<init>", "()V", "Landroid/view/Window;", "window", "Ld6/s;", "adjustLayoutInDisplayCutoutMode", "(Landroid/view/Window;)V", "activity_release"}, m5111k = 1, m5112mv = {1, 8, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes.dex */
class EdgeToEdgeApi28 extends EdgeToEdgeApi26 {
    @Override // android.view.EdgeToEdgeBase, android.view.EdgeToEdgeImpl
    @DoNotInline
    public void adjustLayoutInDisplayCutoutMode(@NotNull Window window) {
        AbstractC5830k.m5330g(window, "window");
        window.getAttributes().layoutInDisplayCutoutMode = 1;
    }
}
