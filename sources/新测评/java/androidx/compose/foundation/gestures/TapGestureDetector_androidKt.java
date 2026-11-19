package androidx.compose.foundation.gestures;

import androidx.compose.p013ui.input.pointer.PointerEvent;
import kotlin.Metadata;

@Metadata(m13557d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\b\u0010\u0004\u001a\u00020\u0001H\u0000\"\u0018\u0010\u0000\u001a\u00020\u0001*\u00020\u00028@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0000\u0010\u0003¨\u0006\u0005"}, m13558d2 = {"isDeepPress", "", "Landroidx/compose/ui/input/pointer/PointerEvent;", "(Landroidx/compose/ui/input/pointer/PointerEvent;)Z", "firstDownRefersToPrimaryMouseButtonOnly", "foundation_release"}, m13559k = 2, m13560mv = {1, 9, 0}, m13562xi = 48)
/* loaded from: classes.dex */
public final class TapGestureDetector_androidKt {
    public static final boolean firstDownRefersToPrimaryMouseButtonOnly() {
        return false;
    }

    public static final boolean isDeepPress(PointerEvent pointerEvent) {
        return pointerEvent.getClassification() == 2;
    }
}
