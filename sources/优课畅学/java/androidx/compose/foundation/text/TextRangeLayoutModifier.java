package androidx.compose.foundation.text;

import androidx.compose.p013ui.layout.ParentDataModifier;
import androidx.compose.p013ui.unit.Density;
import androidx.compose.runtime.internal.StabilityInferred;

@StabilityInferred(parameters = 1)
/* loaded from: classes.dex */
public final class TextRangeLayoutModifier implements ParentDataModifier {
    public static final int $stable = 0;
    private final TextRangeScopeMeasurePolicy measurePolicy;

    public TextRangeLayoutModifier(TextRangeScopeMeasurePolicy textRangeScopeMeasurePolicy) {
        this.measurePolicy = textRangeScopeMeasurePolicy;
    }

    public final TextRangeScopeMeasurePolicy getMeasurePolicy() {
        return this.measurePolicy;
    }

    @Override // androidx.compose.p013ui.layout.ParentDataModifier
    public TextRangeLayoutModifier modifyParentData(Density density, Object obj) {
        return this;
    }
}
