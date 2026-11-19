package androidx.compose.foundation.text.input;

import androidx.compose.foundation.internal.InlineClassHelperKt;
import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.Stable;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.AbstractC9972n;

@Stable
/* loaded from: classes.dex */
public interface TextFieldLineLimits {
    public static final Companion Companion = Companion.$$INSTANCE;

    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        private static final TextFieldLineLimits Default;

        static {
            int i10 = 0;
            Default = new MultiLine(i10, i10, 3, null);
        }

        private Companion() {
        }

        public final TextFieldLineLimits getDefault() {
            return Default;
        }
    }

    @Immutable
    public static final class MultiLine implements TextFieldLineLimits {
        public static final int $stable = 0;
        private final int maxHeightInLines;
        private final int minHeightInLines;

        /* JADX WARN: Illegal instructions before constructor call */
        public MultiLine() {
            int i10 = 0;
            this(i10, i10, 3, null);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || MultiLine.class != obj.getClass()) {
                return false;
            }
            MultiLine multiLine = (MultiLine) obj;
            return this.minHeightInLines == multiLine.minHeightInLines && this.maxHeightInLines == multiLine.maxHeightInLines;
        }

        public final int getMaxHeightInLines() {
            return this.maxHeightInLines;
        }

        public final int getMinHeightInLines() {
            return this.minHeightInLines;
        }

        public int hashCode() {
            return (this.minHeightInLines * 31) + this.maxHeightInLines;
        }

        public String toString() {
            return "MultiLine(minHeightInLines=" + this.minHeightInLines + ", maxHeightInLines=" + this.maxHeightInLines + ')';
        }

        public MultiLine(int i10, int i11) {
            this.minHeightInLines = i10;
            this.maxHeightInLines = i11;
            boolean z10 = false;
            if (1 <= i10 && i10 <= i11) {
                z10 = true;
            }
            if (z10) {
                return;
            }
            InlineClassHelperKt.throwIllegalArgumentException("Expected 1 ≤ minHeightInLines ≤ maxHeightInLines, were " + i10 + ", " + i11);
        }

        public /* synthetic */ MultiLine(int i10, int i11, int i12, AbstractC9972n abstractC9972n) {
            this((i12 & 1) != 0 ? 1 : i10, (i12 & 2) != 0 ? Integer.MAX_VALUE : i11);
        }
    }

    @StabilityInferred(parameters = 1)
    public static final class SingleLine implements TextFieldLineLimits {
        public static final int $stable = 0;
        public static final SingleLine INSTANCE = new SingleLine();

        private SingleLine() {
        }

        public String toString() {
            return "TextFieldLineLimits.SingleLine";
        }
    }
}
