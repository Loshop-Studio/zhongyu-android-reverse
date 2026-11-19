package androidx.compose.foundation.draganddrop;

import androidx.compose.runtime.Immutable;
import p181hd.InterfaceC9544p;

@Immutable
/* loaded from: classes.dex */
public final class DragAndDropSourceDefaults {
    public static final int $stable = 0;
    public static final DragAndDropSourceDefaults INSTANCE = new DragAndDropSourceDefaults();
    private static final InterfaceC9544p DefaultStartDetector = new DragAndDropSourceDefaults$DefaultStartDetector$1(null);

    private DragAndDropSourceDefaults() {
    }

    public final InterfaceC9544p getDefaultStartDetector() {
        return DefaultStartDetector;
    }
}
