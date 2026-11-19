package androidx.compose.foundation.text;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import p152r6.InterfaceC6469a;

@StabilityInferred(parameters = 1)
@Metadata(m5109d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0000\u0018\u00002\u00020\u0001B'\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\b\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\n\u001a\u0004\b\r\u0010\fR\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m5110d2 = {"Landroidx/compose/foundation/text/TextRangeLayoutMeasureResult;", "", "", "width", "height", "Lkotlin/Function0;", "Landroidx/compose/ui/unit/IntOffset;", "place", "<init>", "(IILr6/a;)V", "I", "getWidth", "()I", "getHeight", "Lr6/a;", "getPlace", "()Lr6/a;", "foundation_release"}, m5111k = 1, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes.dex */
public final class TextRangeLayoutMeasureResult {
    public static final int $stable = 0;
    private final int height;

    @NotNull
    private final InterfaceC6469a place;
    private final int width;

    public TextRangeLayoutMeasureResult(int i, int i8, @NotNull InterfaceC6469a interfaceC6469a) {
        this.width = i;
        this.height = i8;
        this.place = interfaceC6469a;
    }

    public final int getHeight() {
        return this.height;
    }

    @NotNull
    public final InterfaceC6469a getPlace() {
        return this.place;
    }

    public final int getWidth() {
        return this.width;
    }
}
