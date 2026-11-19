package androidx.compose.p013ui.unit;

import androidx.compose.runtime.Stable;
import kotlin.Metadata;

@Metadata(m13557d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\u001a\u001a\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003H\u0007¨\u0006\u0005"}, m13558d2 = {"Density", "Landroidx/compose/ui/unit/Density;", "density", "", "fontScale", "ui-unit_release"}, m13559k = 2, m13560mv = {1, 9, 0}, m13562xi = 48)
/* loaded from: classes2.dex */
public final class DensityKt {
    @Stable
    public static final Density Density(float f10, float f11) {
        return new DensityImpl(f10, f11);
    }

    public static /* synthetic */ Density Density$default(float f10, float f11, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            f11 = 1.0f;
        }
        return Density(f10, f11);
    }
}
