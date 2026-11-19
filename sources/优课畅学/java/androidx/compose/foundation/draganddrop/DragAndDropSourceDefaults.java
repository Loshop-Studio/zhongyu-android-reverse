package androidx.compose.foundation.draganddrop;

import androidx.compose.runtime.Immutable;
import p300x7.InterfaceC10574p;

@Immutable
/* loaded from: classes.dex */
public final class DragAndDropSourceDefaults {
    public static final int $stable = 0;
    public static final DragAndDropSourceDefaults INSTANCE = new DragAndDropSourceDefaults();
    private static final InterfaceC10574p DefaultStartDetector = new DragAndDropSourceDefaults$DefaultStartDetector$1(null);

    private DragAndDropSourceDefaults() {
    }

    public final InterfaceC10574p getDefaultStartDetector() {
        return DefaultStartDetector;
    }
}
