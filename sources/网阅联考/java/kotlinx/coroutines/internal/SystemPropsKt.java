package kotlinx.coroutines.internal;

import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;

@Metadata(m5174d1 = {"kotlinx/coroutines/internal/SystemPropsKt__SystemPropsKt", "kotlinx/coroutines/internal/SystemPropsKt__SystemProps_commonKt"}, m5176k = 4, m5177mv = {1, 6, 0}, m5179xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes2.dex */
public final class SystemPropsKt {
    public static final int getAVAILABLE_PROCESSORS() {
        return SystemPropsKt__SystemPropsKt.getAVAILABLE_PROCESSORS();
    }

    public static final int systemProp(String str, int i4, int i5, int i6) {
        return SystemPropsKt__SystemProps_commonKt.systemProp(str, i4, i5, i6);
    }

    public static final long systemProp(String str, long j4, long j5, long j6) {
        return SystemPropsKt__SystemProps_commonKt.systemProp(str, j4, j5, j6);
    }

    public static final String systemProp(String str) {
        return SystemPropsKt__SystemPropsKt.systemProp(str);
    }

    public static final boolean systemProp(String str, boolean z3) {
        return SystemPropsKt__SystemProps_commonKt.systemProp(str, z3);
    }
}
