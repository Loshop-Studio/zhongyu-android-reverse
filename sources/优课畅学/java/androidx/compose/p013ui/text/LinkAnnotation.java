package androidx.compose.p013ui.text;

import androidx.compose.p013ui.text.AnnotatedString;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.AbstractC9126n;
import kotlin.jvm.internal.AbstractC9133u;

@StabilityInferred(parameters = 1)
/* loaded from: classes2.dex */
public abstract class LinkAnnotation implements AnnotatedString.Annotation {
    public static final int $stable = 0;

    @StabilityInferred(parameters = 0)
    public static final class Clickable extends LinkAnnotation {
        public static final int $stable = 8;
        private final LinkInteractionListener linkInteractionListener;
        private final TextLinkStyles styles;
        private final String tag;

        public /* synthetic */ Clickable(String str, TextLinkStyles textLinkStyles, LinkInteractionListener linkInteractionListener, int i10, AbstractC9126n abstractC9126n) {
            this(str, (i10 & 2) != 0 ? null : textLinkStyles, linkInteractionListener);
        }

        public static /* synthetic */ Clickable copy$default(Clickable clickable, String str, TextLinkStyles textLinkStyles, LinkInteractionListener linkInteractionListener, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = clickable.tag;
            }
            if ((i10 & 2) != 0) {
                textLinkStyles = clickable.getStyles();
            }
            if ((i10 & 4) != 0) {
                linkInteractionListener = clickable.getLinkInteractionListener();
            }
            return clickable.copy(str, textLinkStyles, linkInteractionListener);
        }

        public final Clickable copy(String str, TextLinkStyles textLinkStyles, LinkInteractionListener linkInteractionListener) {
            return new Clickable(str, textLinkStyles, linkInteractionListener);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Clickable)) {
                return false;
            }
            Clickable clickable = (Clickable) obj;
            return AbstractC9133u.m16128b(this.tag, clickable.tag) && AbstractC9133u.m16128b(getStyles(), clickable.getStyles()) && AbstractC9133u.m16128b(getLinkInteractionListener(), clickable.getLinkInteractionListener());
        }

        @Override // androidx.compose.p013ui.text.LinkAnnotation
        public LinkInteractionListener getLinkInteractionListener() {
            return this.linkInteractionListener;
        }

        @Override // androidx.compose.p013ui.text.LinkAnnotation
        public TextLinkStyles getStyles() {
            return this.styles;
        }

        public final String getTag() {
            return this.tag;
        }

        public int hashCode() {
            int iHashCode = this.tag.hashCode() * 31;
            TextLinkStyles styles = getStyles();
            int iHashCode2 = (iHashCode + (styles != null ? styles.hashCode() : 0)) * 31;
            LinkInteractionListener linkInteractionListener = getLinkInteractionListener();
            return iHashCode2 + (linkInteractionListener != null ? linkInteractionListener.hashCode() : 0);
        }

        public String toString() {
            return "LinkAnnotation.Clickable(tag=" + this.tag + ')';
        }

        public Clickable(String str, TextLinkStyles textLinkStyles, LinkInteractionListener linkInteractionListener) {
            super(null);
            this.tag = str;
            this.styles = textLinkStyles;
            this.linkInteractionListener = linkInteractionListener;
        }
    }

    @StabilityInferred(parameters = 0)
    public static final class Url extends LinkAnnotation {
        public static final int $stable = 8;
        private final LinkInteractionListener linkInteractionListener;
        private final TextLinkStyles styles;
        private final String url;

        public /* synthetic */ Url(String str, TextLinkStyles textLinkStyles, LinkInteractionListener linkInteractionListener, int i10, AbstractC9126n abstractC9126n) {
            this(str, (i10 & 2) != 0 ? null : textLinkStyles, (i10 & 4) != 0 ? null : linkInteractionListener);
        }

        public static /* synthetic */ Url copy$default(Url url, String str, TextLinkStyles textLinkStyles, LinkInteractionListener linkInteractionListener, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = url.url;
            }
            if ((i10 & 2) != 0) {
                textLinkStyles = url.getStyles();
            }
            if ((i10 & 4) != 0) {
                linkInteractionListener = url.getLinkInteractionListener();
            }
            return url.copy(str, textLinkStyles, linkInteractionListener);
        }

        public final Url copy(String str, TextLinkStyles textLinkStyles, LinkInteractionListener linkInteractionListener) {
            return new Url(str, textLinkStyles, linkInteractionListener);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Url)) {
                return false;
            }
            Url url = (Url) obj;
            return AbstractC9133u.m16128b(this.url, url.url) && AbstractC9133u.m16128b(getStyles(), url.getStyles()) && AbstractC9133u.m16128b(getLinkInteractionListener(), url.getLinkInteractionListener());
        }

        @Override // androidx.compose.p013ui.text.LinkAnnotation
        public LinkInteractionListener getLinkInteractionListener() {
            return this.linkInteractionListener;
        }

        @Override // androidx.compose.p013ui.text.LinkAnnotation
        public TextLinkStyles getStyles() {
            return this.styles;
        }

        public final String getUrl() {
            return this.url;
        }

        public int hashCode() {
            int iHashCode = this.url.hashCode() * 31;
            TextLinkStyles styles = getStyles();
            int iHashCode2 = (iHashCode + (styles != null ? styles.hashCode() : 0)) * 31;
            LinkInteractionListener linkInteractionListener = getLinkInteractionListener();
            return iHashCode2 + (linkInteractionListener != null ? linkInteractionListener.hashCode() : 0);
        }

        public String toString() {
            return "LinkAnnotation.Url(url=" + this.url + ')';
        }

        public Url(String str, TextLinkStyles textLinkStyles, LinkInteractionListener linkInteractionListener) {
            super(null);
            this.url = str;
            this.styles = textLinkStyles;
            this.linkInteractionListener = linkInteractionListener;
        }
    }

    public /* synthetic */ LinkAnnotation(AbstractC9126n abstractC9126n) {
        this();
    }

    public abstract LinkInteractionListener getLinkInteractionListener();

    public abstract TextLinkStyles getStyles();

    private LinkAnnotation() {
    }
}
