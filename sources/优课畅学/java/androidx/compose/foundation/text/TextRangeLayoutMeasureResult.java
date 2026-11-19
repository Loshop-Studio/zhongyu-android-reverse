package androidx.compose.foundation.text;

import androidx.compose.runtime.internal.StabilityInferred;
import p300x7.InterfaceC10559a;

@StabilityInferred(parameters = 1)
/* loaded from: classes.dex */
public final class TextRangeLayoutMeasureResult {
    public static final int $stable = 0;
    private final int height;
    private final InterfaceC10559a place;
    private final int width;

    public TextRangeLayoutMeasureResult(int i10, int i11, InterfaceC10559a interfaceC10559a) {
        this.width = i10;
        this.height = i11;
        this.place = interfaceC10559a;
    }

    public final int getHeight() {
        return this.height;
    }

    public final InterfaceC10559a getPlace() {
        return this.place;
    }

    public final int getWidth() {
        return this.width;
    }
}
