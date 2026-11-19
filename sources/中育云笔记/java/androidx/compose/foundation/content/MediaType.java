package androidx.compose.foundation.content;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.AbstractC9972n;
import kotlin.jvm.internal.AbstractC9979u;

@StabilityInferred(parameters = 1)
/* loaded from: classes.dex */
public final class MediaType {
    public static final int $stable = 0;
    private final String representation;
    public static final Companion Companion = new Companion(null);
    private static final MediaType Text = new MediaType("text/*");
    private static final MediaType PlainText = new MediaType("text/plain");
    private static final MediaType HtmlText = new MediaType("text/html");
    private static final MediaType Image = new MediaType("image/*");
    private static final MediaType All = new MediaType("*/*");

    public static final class Companion {
        public /* synthetic */ Companion(AbstractC9972n abstractC9972n) {
            this();
        }

        public final MediaType getAll() {
            return MediaType.All;
        }

        public final MediaType getHtmlText() {
            return MediaType.HtmlText;
        }

        public final MediaType getImage() {
            return MediaType.Image;
        }

        public final MediaType getPlainText() {
            return MediaType.PlainText;
        }

        public final MediaType getText() {
            return MediaType.Text;
        }

        private Companion() {
        }
    }

    public MediaType(String str) {
        this.representation = str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof MediaType) {
            return AbstractC9979u.m20289b(this.representation, ((MediaType) obj).representation);
        }
        return false;
    }

    public final String getRepresentation() {
        return this.representation;
    }

    public int hashCode() {
        return this.representation.hashCode();
    }

    public String toString() {
        return "MediaType(representation='" + this.representation + "')";
    }
}
