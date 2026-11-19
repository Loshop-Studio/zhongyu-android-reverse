package androidx.compose.foundation.gestures;

import androidx.compose.p009ui.geometry.Offset;
import kotlin.Metadata;

@Metadata(m7879d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J0\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u0005H&ø\u0001\u0000¢\u0006\u0004\b\t\u0010\nø\u0001\u0001\u0082\u0002\r\n\u0005\b¡\u001e0\u0001\n\u0004\b!0\u0001¨\u0006\u000bÀ\u0006\u0003"}, m7880d2 = {"Landroidx/compose/foundation/gestures/TransformScope;", "", "transformBy", "", "zoomChange", "", "panChange", "Landroidx/compose/ui/geometry/Offset;", "rotationChange", "transformBy-d-4ec7I", "(FJF)V", "foundation_release"}, m7881k = 1, m7882mv = {1, 9, 0}, m7884xi = 48)
/* loaded from: classes.dex */
public interface TransformScope {

    @Metadata(m7881k = 3, m7882mv = {1, 9, 0}, m7884xi = 48)
    public static final class DefaultImpls {
    }

    /* renamed from: transformBy-d-4ec7I$default, reason: not valid java name */
    static /* synthetic */ void m10405transformByd4ec7I$default(TransformScope transformScope, float f6, long j6, float f7, int i6, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: transformBy-d-4ec7I");
        }
        if ((i6 & 1) != 0) {
            f6 = 1.0f;
        }
        if ((i6 & 2) != 0) {
            j6 = Offset.INSTANCE.m13674getZeroF1C5BW0();
        }
        if ((i6 & 4) != 0) {
            f7 = 0.0f;
        }
        transformScope.mo10291transformByd4ec7I(f6, j6, f7);
    }

    /* renamed from: transformBy-d-4ec7I */
    void mo10291transformByd4ec7I(float zoomChange, long panChange, float rotationChange);
}
