package androidx.compose.runtime;

import android.support.v4.media.AbstractC0037f;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.alibaba.sdk.android.oss.common.RequestParameters;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@StabilityInferred(parameters = 0)
@Metadata(m5109d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\r\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u000fJ\u000e\u0010\r\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u0011J\b\u0010\u0012\u001a\u00020\u0013H\u0016R\u001a\u0010\u0005\u001a\u00020\u0003X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\u0004R\u0011\u0010\t\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b\u000b\u0010\f¨\u0006\u0014"}, m5110d2 = {"Landroidx/compose/runtime/Anchor;", "", "loc", "", "(I)V", RequestParameters.SUBRESOURCE_LOCATION, "getLocation$runtime_release", "()I", "setLocation$runtime_release", "valid", "", "getValid", "()Z", "toIndexFor", "slots", "Landroidx/compose/runtime/SlotTable;", "writer", "Landroidx/compose/runtime/SlotWriter;", "toString", "", "runtime_release"}, m5111k = 1, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes.dex */
public final class Anchor {
    public static final int $stable = 8;
    private int location;

    public Anchor(int i) {
        this.location = i;
    }

    /* renamed from: getLocation$runtime_release, reason: from getter */
    public final int getLocation() {
        return this.location;
    }

    public final boolean getValid() {
        return this.location != Integer.MIN_VALUE;
    }

    public final void setLocation$runtime_release(int i) {
        this.location = i;
    }

    public final int toIndexFor(@NotNull SlotTable slots) {
        return slots.anchorIndex(this);
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("{ location = ");
        return AbstractC0037f.m90o(sb, " }", this.location);
    }

    public final int toIndexFor(@NotNull SlotWriter writer) {
        return writer.anchorIndex(this);
    }
}
