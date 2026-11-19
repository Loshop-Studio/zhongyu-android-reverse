package androidx.compose.foundation.text.selection;

import androidx.compose.foundation.text.Handle;
import androidx.compose.p014ui.geometry.Offset;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.AbstractC9972n;

@StabilityInferred(parameters = 1)
/* loaded from: classes.dex */
public final class SelectionHandleInfo {
    public static final int $stable = 0;
    private final SelectionHandleAnchor anchor;
    private final Handle handle;
    private final long position;
    private final boolean visible;

    public /* synthetic */ SelectionHandleInfo(Handle handle, long j10, SelectionHandleAnchor selectionHandleAnchor, boolean z10, AbstractC9972n abstractC9972n) {
        this(handle, j10, selectionHandleAnchor, z10);
    }

    /* renamed from: copy-ubNVwUQ$default, reason: not valid java name */
    public static /* synthetic */ SelectionHandleInfo m28223copyubNVwUQ$default(SelectionHandleInfo selectionHandleInfo, Handle handle, long j10, SelectionHandleAnchor selectionHandleAnchor, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            handle = selectionHandleInfo.handle;
        }
        if ((i10 & 2) != 0) {
            j10 = selectionHandleInfo.position;
        }
        if ((i10 & 4) != 0) {
            selectionHandleAnchor = selectionHandleInfo.anchor;
        }
        if ((i10 & 8) != 0) {
            z10 = selectionHandleInfo.visible;
        }
        return selectionHandleInfo.m28225copyubNVwUQ(handle, j10, selectionHandleAnchor, z10);
    }

    public final Handle component1() {
        return this.handle;
    }

    /* renamed from: component2-F1C5BW0, reason: not valid java name */
    public final long m28224component2F1C5BW0() {
        return this.position;
    }

    public final SelectionHandleAnchor component3() {
        return this.anchor;
    }

    public final boolean component4() {
        return this.visible;
    }

    /* renamed from: copy-ubNVwUQ, reason: not valid java name */
    public final SelectionHandleInfo m28225copyubNVwUQ(Handle handle, long j10, SelectionHandleAnchor selectionHandleAnchor, boolean z10) {
        return new SelectionHandleInfo(handle, j10, selectionHandleAnchor, z10, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SelectionHandleInfo)) {
            return false;
        }
        SelectionHandleInfo selectionHandleInfo = (SelectionHandleInfo) obj;
        return this.handle == selectionHandleInfo.handle && Offset.m30634equalsimpl0(this.position, selectionHandleInfo.position) && this.anchor == selectionHandleInfo.anchor && this.visible == selectionHandleInfo.visible;
    }

    public final SelectionHandleAnchor getAnchor() {
        return this.anchor;
    }

    public final Handle getHandle() {
        return this.handle;
    }

    /* renamed from: getPosition-F1C5BW0, reason: not valid java name */
    public final long m28226getPositionF1C5BW0() {
        return this.position;
    }

    public final boolean getVisible() {
        return this.visible;
    }

    public int hashCode() {
        return (((((this.handle.hashCode() * 31) + Offset.m30639hashCodeimpl(this.position)) * 31) + this.anchor.hashCode()) * 31) + Boolean.hashCode(this.visible);
    }

    public String toString() {
        return "SelectionHandleInfo(handle=" + this.handle + ", position=" + ((Object) Offset.m30645toStringimpl(this.position)) + ", anchor=" + this.anchor + ", visible=" + this.visible + ')';
    }

    private SelectionHandleInfo(Handle handle, long j10, SelectionHandleAnchor selectionHandleAnchor, boolean z10) {
        this.handle = handle;
        this.position = j10;
        this.anchor = selectionHandleAnchor;
        this.visible = z10;
    }
}
