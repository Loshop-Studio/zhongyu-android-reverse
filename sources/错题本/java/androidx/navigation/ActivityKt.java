package androidx.navigation;

import android.app.Activity;
import androidx.annotation.IdRes;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(m5109d1 = {"androidx/navigation/ActivityKt__Activity_androidKt"}, m5111k = 4, m5112mv = {2, 0, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes2.dex */
public final class ActivityKt {
    @NotNull
    public static final NavController findNavController(@NotNull Activity activity, @IdRes int i) {
        return ActivityKt__Activity_androidKt.findNavController(activity, i);
    }
}
