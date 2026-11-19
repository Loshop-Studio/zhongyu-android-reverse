package androidx.compose.foundation.text;

import androidx.compose.p014ui.graphics.Color;
import androidx.compose.p014ui.graphics.SolidColor;

/* loaded from: classes.dex */
final class BasicTextFieldDefaults {
    public static final BasicTextFieldDefaults INSTANCE = new BasicTextFieldDefaults();
    private static final SolidColor CursorBrush = new SolidColor(Color.Companion.m30904getBlack0d7_KjU(), null);

    private BasicTextFieldDefaults() {
    }

    public final SolidColor getCursorBrush() {
        return CursorBrush;
    }
}
