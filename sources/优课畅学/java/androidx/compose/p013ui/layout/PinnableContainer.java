package androidx.compose.p013ui.layout;

import androidx.compose.runtime.Stable;

@Stable
/* loaded from: classes2.dex */
public interface PinnableContainer {

    public interface PinnedHandle {
        void release();
    }

    PinnedHandle pin();
}
