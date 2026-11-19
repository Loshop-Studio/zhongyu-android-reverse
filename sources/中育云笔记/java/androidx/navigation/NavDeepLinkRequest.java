package androidx.navigation;

import android.net.Uri;
import androidx.annotation.RestrictTo;
import kotlin.jvm.internal.AbstractC9972n;
import kotlin.jvm.internal.AbstractC9979u;
import kotlin.text.Regex;

/* loaded from: classes.dex */
public class NavDeepLinkRequest {
    private final String action;
    private final String mimeType;
    private final Uri uri;

    public static final class Builder {
        public static final Companion Companion = new Companion(null);
        private String action;
        private String mimeType;
        private Uri uri;

        public static final class Companion {
            public /* synthetic */ Companion(AbstractC9972n abstractC9972n) {
                this();
            }

            public final Builder fromAction(String action) {
                AbstractC9979u.m20294g(action, "action");
                if (action.length() <= 0) {
                    throw new IllegalArgumentException("The NavDeepLinkRequest cannot have an empty action.");
                }
                Builder builder = new Builder(null);
                builder.setAction(action);
                return builder;
            }

            public final Builder fromMimeType(String mimeType) {
                AbstractC9979u.m20294g(mimeType, "mimeType");
                Builder builder = new Builder(null);
                builder.setMimeType(mimeType);
                return builder;
            }

            public final Builder fromUri(Uri uri) {
                AbstractC9979u.m20294g(uri, "uri");
                Builder builder = new Builder(null);
                builder.setUri(uri);
                return builder;
            }

            private Companion() {
            }
        }

        public /* synthetic */ Builder(AbstractC9972n abstractC9972n) {
            this();
        }

        public static final Builder fromAction(String str) {
            return Companion.fromAction(str);
        }

        public static final Builder fromMimeType(String str) {
            return Companion.fromMimeType(str);
        }

        public static final Builder fromUri(Uri uri) {
            return Companion.fromUri(uri);
        }

        public final NavDeepLinkRequest build() {
            return new NavDeepLinkRequest(this.uri, this.action, this.mimeType);
        }

        public final Builder setAction(String action) {
            AbstractC9979u.m20294g(action, "action");
            if (action.length() <= 0) {
                throw new IllegalArgumentException("The NavDeepLinkRequest cannot have an empty action.");
            }
            this.action = action;
            return this;
        }

        public final Builder setMimeType(String mimeType) {
            AbstractC9979u.m20294g(mimeType, "mimeType");
            if (new Regex("^[-\\w*.]+/[-\\w+*.]+$").m20341g(mimeType)) {
                this.mimeType = mimeType;
                return this;
            }
            throw new IllegalArgumentException(("The given mimeType " + mimeType + " does not match to required \"type/subtype\" format").toString());
        }

        public final Builder setUri(Uri uri) {
            AbstractC9979u.m20294g(uri, "uri");
            this.uri = uri;
            return this;
        }

        private Builder() {
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public NavDeepLinkRequest(Uri uri, String str, String str2) {
        this.uri = uri;
        this.action = str;
        this.mimeType = str2;
    }

    public String getAction() {
        return this.action;
    }

    public String getMimeType() {
        return this.mimeType;
    }

    public Uri getUri() {
        return this.uri;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("NavDeepLinkRequest");
        sb2.append("{");
        if (getUri() != null) {
            sb2.append(" uri=");
            sb2.append(String.valueOf(getUri()));
        }
        if (getAction() != null) {
            sb2.append(" action=");
            sb2.append(getAction());
        }
        if (getMimeType() != null) {
            sb2.append(" mimetype=");
            sb2.append(getMimeType());
        }
        sb2.append(" }");
        String string = sb2.toString();
        AbstractC9979u.m20293f(string, "toString(...)");
        return string;
    }
}
