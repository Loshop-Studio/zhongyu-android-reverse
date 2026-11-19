package androidx.compose.foundation.text;

import androidx.compose.p009ui.graphics.Color;
import androidx.compose.p009ui.graphics.SolidColor;
import kotlin.Metadata;

@Metadata(m7879d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÂ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m7880d2 = {"Landroidx/compose/foundation/text/BasicTextFieldDefaults;", "", "()V", "CursorBrush", "Landroidx/compose/ui/graphics/SolidColor;", "getCursorBrush", "()Landroidx/compose/ui/graphics/SolidColor;", "foundation_release"}, m7881k = 1, m7882mv = {1, 9, 0}, m7884xi = 48)
/* loaded from: classes.dex */
final class BasicTextFieldDefaults {
    public static final BasicTextFieldDefaults INSTANCE = new BasicTextFieldDefaults();
    private static final SolidColor CursorBrush = new SolidColor(Color.INSTANCE.m13925getBlack0d7_KjU(), null);

    private BasicTextFieldDefaults() {
    }

    public final SolidColor getCursorBrush() {
        return CursorBrush;
    }
}
