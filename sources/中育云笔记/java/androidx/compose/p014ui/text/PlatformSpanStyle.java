package androidx.compose.p014ui.text;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.AbstractC9972n;

@StabilityInferred(parameters = 1)
/* loaded from: classes2.dex */
public final class PlatformSpanStyle {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private static final PlatformSpanStyle Default = new PlatformSpanStyle();

    public static final class Companion {
        public /* synthetic */ Companion(AbstractC9972n abstractC9972n) {
            this();
        }

        public final PlatformSpanStyle getDefault() {
            return PlatformSpanStyle.Default;
        }

        private Companion() {
        }
    }

    public boolean equals(Object obj) {
        return this == obj || (obj instanceof PlatformSpanStyle);
    }

    public int hashCode() {
        return super.hashCode();
    }

    public final PlatformSpanStyle merge(PlatformSpanStyle platformSpanStyle) {
        return this;
    }

    public String toString() {
        return "PlatformSpanStyle()";
    }
}
