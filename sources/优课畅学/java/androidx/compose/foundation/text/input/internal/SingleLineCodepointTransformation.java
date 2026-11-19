package androidx.compose.foundation.text.input.internal;

import androidx.compose.runtime.internal.StabilityInferred;

@StabilityInferred(parameters = 1)
/* loaded from: classes.dex */
public final class SingleLineCodepointTransformation implements CodepointTransformation {
    public static final int $stable = 0;
    private static final int CARRIAGE_RETURN = 13;
    public static final SingleLineCodepointTransformation INSTANCE = new SingleLineCodepointTransformation();
    private static final int LINE_FEED = 10;
    private static final int WHITESPACE = 32;
    private static final int ZERO_WIDTH_SPACE = 65279;

    private SingleLineCodepointTransformation() {
    }

    public String toString() {
        return "SingleLineCodepointTransformation";
    }

    @Override // androidx.compose.foundation.text.input.internal.CodepointTransformation
    public int transform(int i10, int i11) {
        if (i11 == 10) {
            return 32;
        }
        return i11 == 13 ? ZERO_WIDTH_SPACE : i11;
    }
}
