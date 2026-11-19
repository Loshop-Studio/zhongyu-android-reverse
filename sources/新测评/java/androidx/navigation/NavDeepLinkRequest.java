package androidx.navigation;

import android.net.Uri;
import androidx.annotation.RestrictTo;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.Regex;

@Metadata(m13557d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\b\u0016\u0018\u00002\u00020\u0001:\u0001\u0011B-\b\u0007\u0012\u000e\u0010\u0002\u001a\n\u0018\u00010\u0003j\u0004\u0018\u0001`\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\b\u0010\u0010\u001a\u00020\u0006H\u0016R\u001e\u0010\u0002\u001a\n\u0018\u00010\u0003j\u0004\u0018\u0001`\u0004X\u0096\u0004¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000e¨\u0006\u0012"}, m13558d2 = {"Landroidx/navigation/NavDeepLinkRequest;", "", "uri", "Landroid/net/Uri;", "Landroidx/navigation/NavUri;", "action", "", "mimeType", "<init>", "(Landroid/net/Uri;Ljava/lang/String;Ljava/lang/String;)V", "getUri", "()Landroid/net/Uri;", "Landroid/net/Uri;", "getAction", "()Ljava/lang/String;", "getMimeType", "toString", "Builder", "navigation-common_release"}, m13559k = 1, m13560mv = {2, 0, 0}, m13562xi = 48)
/* loaded from: classes3.dex */
public class NavDeepLinkRequest {
    private final String action;
    private final String mimeType;
    private final Uri uri;

    @Metadata(m13557d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u000b\u001a\u00020\u00002\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006¢\u0006\u0002\u0010\fJ\u000e\u0010\r\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\tJ\u000e\u0010\u000e\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\tJ\u0006\u0010\u000f\u001a\u00020\u0010R\u0018\u0010\u0004\u001a\n\u0018\u00010\u0005j\u0004\u0018\u0001`\u0006X\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u0007R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\tX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0012"}, m13558d2 = {"Landroidx/navigation/NavDeepLinkRequest$Builder;", "", "<init>", "()V", "uri", "Landroid/net/Uri;", "Landroidx/navigation/NavUri;", "Landroid/net/Uri;", "action", "", "mimeType", "setUri", "(Landroid/net/Uri;)Landroidx/navigation/NavDeepLinkRequest$Builder;", "setAction", "setMimeType", "build", "Landroidx/navigation/NavDeepLinkRequest;", "Companion", "navigation-common_release"}, m13559k = 1, m13560mv = {2, 0, 0}, m13562xi = 48)
    @SourceDebugExtension({"SMAP\nNavDeepLinkRequest.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NavDeepLinkRequest.kt\nandroidx/navigation/NavDeepLinkRequest$Builder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,172:1\n1#2:173\n*E\n"})
    public static final class Builder {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private String action;
        private String mimeType;
        private Uri uri;

        @Metadata(m13557d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0004\u001a\u00020\u00052\n\u0010\u0006\u001a\u00060\u0007j\u0002`\bH\u0007¢\u0006\u0002\u0010\tJ\u0010\u0010\n\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\fH\u0007J\u0010\u0010\r\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\fH\u0007¨\u0006\u000f"}, m13558d2 = {"Landroidx/navigation/NavDeepLinkRequest$Builder$Companion;", "", "<init>", "()V", "fromUri", "Landroidx/navigation/NavDeepLinkRequest$Builder;", "uri", "Landroid/net/Uri;", "Landroidx/navigation/NavUri;", "(Landroid/net/Uri;)Landroidx/navigation/NavDeepLinkRequest$Builder;", "fromAction", "action", "", "fromMimeType", "mimeType", "navigation-common_release"}, m13559k = 1, m13560mv = {2, 0, 0}, m13562xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @JvmStatic
            public final Builder fromAction(String action) {
                Intrinsics.checkNotNullParameter(action, "action");
                if (action.length() <= 0) {
                    throw new IllegalArgumentException("The NavDeepLinkRequest cannot have an empty action.");
                }
                Builder builder = new Builder(null);
                builder.setAction(action);
                return builder;
            }

            @JvmStatic
            public final Builder fromMimeType(String mimeType) {
                Intrinsics.checkNotNullParameter(mimeType, "mimeType");
                Builder builder = new Builder(null);
                builder.setMimeType(mimeType);
                return builder;
            }

            @JvmStatic
            public final Builder fromUri(Uri uri) {
                Intrinsics.checkNotNullParameter(uri, "uri");
                Builder builder = new Builder(null);
                builder.setUri(uri);
                return builder;
            }

            private Companion() {
            }
        }

        public /* synthetic */ Builder(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        public static final Builder fromAction(String str) {
            return INSTANCE.fromAction(str);
        }

        @JvmStatic
        public static final Builder fromMimeType(String str) {
            return INSTANCE.fromMimeType(str);
        }

        @JvmStatic
        public static final Builder fromUri(Uri uri) {
            return INSTANCE.fromUri(uri);
        }

        public final NavDeepLinkRequest build() {
            return new NavDeepLinkRequest(this.uri, this.action, this.mimeType);
        }

        public final Builder setAction(String action) {
            Intrinsics.checkNotNullParameter(action, "action");
            if (action.length() <= 0) {
                throw new IllegalArgumentException("The NavDeepLinkRequest cannot have an empty action.");
            }
            this.action = action;
            return this;
        }

        public final Builder setMimeType(String mimeType) {
            Intrinsics.checkNotNullParameter(mimeType, "mimeType");
            if (new Regex("^[-\\w*.]+/[-\\w+*.]+$").matches(mimeType)) {
                this.mimeType = mimeType;
                return this;
            }
            throw new IllegalArgumentException(("The given mimeType " + mimeType + " does not match to required \"type/subtype\" format").toString());
        }

        public final Builder setUri(Uri uri) {
            Intrinsics.checkNotNullParameter(uri, "uri");
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
        StringBuilder sb = new StringBuilder();
        sb.append("NavDeepLinkRequest");
        sb.append("{");
        if (getUri() != null) {
            sb.append(" uri=");
            sb.append(String.valueOf(getUri()));
        }
        if (getAction() != null) {
            sb.append(" action=");
            sb.append(getAction());
        }
        if (getMimeType() != null) {
            sb.append(" mimetype=");
            sb.append(getMimeType());
        }
        sb.append(" }");
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }
}
