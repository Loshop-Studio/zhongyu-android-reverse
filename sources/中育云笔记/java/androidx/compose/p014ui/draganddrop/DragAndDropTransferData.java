package androidx.compose.p014ui.draganddrop;

import android.content.ClipData;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.AbstractC9972n;

@StabilityInferred(parameters = 0)
/* loaded from: classes2.dex */
public final class DragAndDropTransferData {
    public static final int $stable = 8;
    private final ClipData clipData;
    private final int flags;
    private final Object localState;

    public DragAndDropTransferData(ClipData clipData, Object obj, int i10) {
        this.clipData = clipData;
        this.localState = obj;
        this.flags = i10;
    }

    public final ClipData getClipData() {
        return this.clipData;
    }

    public final int getFlags() {
        return this.flags;
    }

    public final Object getLocalState() {
        return this.localState;
    }

    public /* synthetic */ DragAndDropTransferData(ClipData clipData, Object obj, int i10, int i11, AbstractC9972n abstractC9972n) {
        this(clipData, (i11 & 2) != 0 ? null : obj, (i11 & 4) != 0 ? 0 : i10);
    }
}
