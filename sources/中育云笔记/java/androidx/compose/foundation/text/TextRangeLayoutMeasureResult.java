package androidx.compose.foundation.text;

import androidx.compose.runtime.internal.StabilityInferred;
import p181hd.InterfaceC9529a;

@StabilityInferred(parameters = 1)
/* loaded from: classes.dex */
public final class TextRangeLayoutMeasureResult {
    public static final int $stable = 0;
    private final int height;
    private final InterfaceC9529a place;
    private final int width;

    public TextRangeLayoutMeasureResult(int i10, int i11, InterfaceC9529a interfaceC9529a) {
        this.width = i10;
        this.height = i11;
        this.place = interfaceC9529a;
    }

    public final int getHeight() {
        return this.height;
    }

    public final InterfaceC9529a getPlace() {
        return this.place;
    }

    public final int getWidth() {
        return this.width;
    }
}
