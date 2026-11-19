package androidx.compose.p006ui.unit;

import android.content.Context;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.umeng.analytics.pro.C3380c;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(m5174d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u000e\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003¨\u0006\u0004"}, m5175d2 = {"Density", "Landroidx/compose/ui/unit/Density;", C3380c.f1965R, "Landroid/content/Context;", "ui-unit_release"}, m5176k = 2, m5177mv = {1, 8, 0}, m5179xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes.dex */
public final class AndroidDensity_androidKt {
    public static final Density Density(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return DensityKt.Density(context.getResources().getDisplayMetrics().density, context.getResources().getConfiguration().fontScale);
    }
}
