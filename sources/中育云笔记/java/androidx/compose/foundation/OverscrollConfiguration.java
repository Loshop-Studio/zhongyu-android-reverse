package androidx.compose.foundation;

import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.p014ui.graphics.Color;
import androidx.compose.p014ui.graphics.ColorKt;
import androidx.compose.runtime.Stable;
import kotlin.jvm.internal.AbstractC9972n;
import kotlin.jvm.internal.AbstractC9979u;
import p309qc.InterfaceC10770a;

@Stable
@InterfaceC10770a
@ExperimentalFoundationApi
/* loaded from: classes.dex */
public final class OverscrollConfiguration {
    public static final int $stable = 0;
    private final PaddingValues drawPadding;
    private final long glowColor;

    public /* synthetic */ OverscrollConfiguration(long j10, PaddingValues paddingValues, AbstractC9972n abstractC9972n) {
        this(j10, paddingValues);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!AbstractC9979u.m20289b(OverscrollConfiguration.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        AbstractC9979u.m20292e(obj, "null cannot be cast to non-null type androidx.compose.foundation.OverscrollConfiguration");
        OverscrollConfiguration overscrollConfiguration = (OverscrollConfiguration) obj;
        return Color.m30879equalsimpl0(this.glowColor, overscrollConfiguration.glowColor) && AbstractC9979u.m20289b(this.drawPadding, overscrollConfiguration.drawPadding);
    }

    public final PaddingValues getDrawPadding() {
        return this.drawPadding;
    }

    /* renamed from: getGlowColor-0d7_KjU, reason: not valid java name */
    public final long m27043getGlowColor0d7_KjU() {
        return this.glowColor;
    }

    public int hashCode() {
        return (Color.m30885hashCodeimpl(this.glowColor) * 31) + this.drawPadding.hashCode();
    }

    public String toString() {
        return "OverscrollConfiguration(glowColor=" + ((Object) Color.m30886toStringimpl(this.glowColor)) + ", drawPadding=" + this.drawPadding + ')';
    }

    private OverscrollConfiguration(long j10, PaddingValues paddingValues) {
        this.glowColor = j10;
        this.drawPadding = paddingValues;
    }

    public /* synthetic */ OverscrollConfiguration(long j10, PaddingValues paddingValues, int i10, AbstractC9972n abstractC9972n) {
        this((i10 & 1) != 0 ? ColorKt.Color(4284900966L) : j10, (i10 & 2) != 0 ? PaddingKt.m27453PaddingValuesYgX7TsA$default(0.0f, 0.0f, 3, null) : paddingValues, null);
    }
}
