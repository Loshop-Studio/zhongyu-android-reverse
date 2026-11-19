package androidx.compose.foundation.content;

import android.net.Uri;
import android.os.Bundle;
import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.AbstractC9133u;

@StabilityInferred(parameters = 0)
@ExperimentalFoundationApi
/* loaded from: classes.dex */
public final class PlatformTransferableContent {
    public static final int $stable = 8;
    private final Bundle extras;
    private final Uri linkUri;

    public PlatformTransferableContent(Uri uri, Bundle bundle) {
        this.linkUri = uri;
        this.extras = bundle;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PlatformTransferableContent)) {
            return false;
        }
        PlatformTransferableContent platformTransferableContent = (PlatformTransferableContent) obj;
        return AbstractC9133u.m16128b(this.linkUri, platformTransferableContent.linkUri) && AbstractC9133u.m16128b(this.extras, platformTransferableContent.extras);
    }

    public final Bundle getExtras() {
        return this.extras;
    }

    public final Uri getLinkUri() {
        return this.linkUri;
    }

    public int hashCode() {
        Uri uri = this.linkUri;
        return ((uri != null ? uri.hashCode() : 0) * 31) + this.extras.hashCode();
    }

    public String toString() {
        return "PlatformTransferableContent(linkUri=" + this.linkUri + ", extras=" + this.extras + ')';
    }
}
