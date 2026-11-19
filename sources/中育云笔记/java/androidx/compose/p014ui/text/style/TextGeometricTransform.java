package androidx.compose.p014ui.text.style;

import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.Stable;
import kotlin.jvm.internal.AbstractC9972n;

@Immutable
/* loaded from: classes2.dex */
public final class TextGeometricTransform {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private static final TextGeometricTransform None = new TextGeometricTransform(1.0f, 0.0f);
    private final float scaleX;
    private final float skewX;

    public static final class Companion {
        public /* synthetic */ Companion(AbstractC9972n abstractC9972n) {
            this();
        }

        @Stable
        public static /* synthetic */ void getNone$ui_text_release$annotations() {
        }

        public final TextGeometricTransform getNone$ui_text_release() {
            return TextGeometricTransform.None;
        }

        private Companion() {
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public TextGeometricTransform() {
        float f10 = 0.0f;
        this(f10, f10, 3, null);
    }

    public static /* synthetic */ TextGeometricTransform copy$default(TextGeometricTransform textGeometricTransform, float f10, float f11, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f10 = textGeometricTransform.scaleX;
        }
        if ((i10 & 2) != 0) {
            f11 = textGeometricTransform.skewX;
        }
        return textGeometricTransform.copy(f10, f11);
    }

    public final TextGeometricTransform copy(float f10, float f11) {
        return new TextGeometricTransform(f10, f11);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TextGeometricTransform)) {
            return false;
        }
        TextGeometricTransform textGeometricTransform = (TextGeometricTransform) obj;
        return this.scaleX == textGeometricTransform.scaleX && this.skewX == textGeometricTransform.skewX;
    }

    public final float getScaleX() {
        return this.scaleX;
    }

    public final float getSkewX() {
        return this.skewX;
    }

    public int hashCode() {
        return (Float.hashCode(this.scaleX) * 31) + Float.hashCode(this.skewX);
    }

    public String toString() {
        return "TextGeometricTransform(scaleX=" + this.scaleX + ", skewX=" + this.skewX + ')';
    }

    public TextGeometricTransform(float f10, float f11) {
        this.scaleX = f10;
        this.skewX = f11;
    }

    public /* synthetic */ TextGeometricTransform(float f10, float f11, int i10, AbstractC9972n abstractC9972n) {
        this((i10 & 1) != 0 ? 1.0f : f10, (i10 & 2) != 0 ? 0.0f : f11);
    }
}
