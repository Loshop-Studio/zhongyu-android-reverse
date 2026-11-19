package androidx.compose.foundation.gestures;

import androidx.compose.p014ui.input.pointer.PointerInputChange;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.AbstractC9972n;

@StabilityInferred(parameters = 1)
/* loaded from: classes.dex */
public abstract class LongPressResult {
    public static final int $stable = 0;

    @StabilityInferred(parameters = 1)
    public static final class Canceled extends LongPressResult {
        public static final int $stable = 0;
        public static final Canceled INSTANCE = new Canceled();

        private Canceled() {
            super(null);
        }
    }

    @StabilityInferred(parameters = 1)
    public static final class Released extends LongPressResult {
        public static final int $stable = 0;
        private final PointerInputChange finalUpChange;

        public Released(PointerInputChange pointerInputChange) {
            super(null);
            this.finalUpChange = pointerInputChange;
        }

        public final PointerInputChange getFinalUpChange() {
            return this.finalUpChange;
        }
    }

    @StabilityInferred(parameters = 1)
    public static final class Success extends LongPressResult {
        public static final int $stable = 0;
        public static final Success INSTANCE = new Success();

        private Success() {
            super(null);
        }
    }

    public /* synthetic */ LongPressResult(AbstractC9972n abstractC9972n) {
        this();
    }

    private LongPressResult() {
    }
}
