package androidx.compose.foundation.gestures.snapping;

import androidx.compose.runtime.Stable;
import androidx.compose.runtime.internal.StabilityInferred;

@Stable
/* loaded from: classes.dex */
public interface SnapPosition {

    @StabilityInferred(parameters = 1)
    public static final class Center implements SnapPosition {
        public static final int $stable = 0;
        public static final Center INSTANCE = new Center();

        private Center() {
        }

        @Override // androidx.compose.foundation.gestures.snapping.SnapPosition
        public int position(int i10, int i11, int i12, int i13, int i14, int i15) {
            return (((i10 - i12) - i13) / 2) - (i11 / 2);
        }

        public String toString() {
            return "Center";
        }
    }

    @StabilityInferred(parameters = 1)
    public static final class End implements SnapPosition {
        public static final int $stable = 0;
        public static final End INSTANCE = new End();

        private End() {
        }

        @Override // androidx.compose.foundation.gestures.snapping.SnapPosition
        public int position(int i10, int i11, int i12, int i13, int i14, int i15) {
            return ((i10 - i12) - i13) - i11;
        }

        public String toString() {
            return "End";
        }
    }

    @StabilityInferred(parameters = 1)
    public static final class Start implements SnapPosition {
        public static final int $stable = 0;
        public static final Start INSTANCE = new Start();

        private Start() {
        }

        @Override // androidx.compose.foundation.gestures.snapping.SnapPosition
        public int position(int i10, int i11, int i12, int i13, int i14, int i15) {
            return 0;
        }

        public String toString() {
            return "Start";
        }
    }

    int position(int i10, int i11, int i12, int i13, int i14, int i15);
}
