package androidx.compose.runtime;

import kotlin.Metadata;

@Metadata(m7879d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u001a\u0010\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0000¨\u0006\u0004"}, m7880d2 = {"createSnapshotMutableIntState", "Landroidx/compose/runtime/MutableIntState;", "value", "", "runtime_release"}, m7881k = 2, m7882mv = {1, 9, 0}, m7884xi = 48)
/* loaded from: classes2.dex */
public final class SnapshotIntState_androidKt {
    public static final MutableIntState createSnapshotMutableIntState(int i6) {
        return new ParcelableSnapshotMutableIntState(i6);
    }
}
