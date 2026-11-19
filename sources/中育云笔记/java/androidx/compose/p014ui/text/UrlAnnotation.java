package androidx.compose.p014ui.text;

import androidx.compose.p014ui.text.AnnotatedString;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.AbstractC9979u;
import p309qc.InterfaceC10770a;

@StabilityInferred(parameters = 1)
@ExperimentalTextApi
@InterfaceC10770a
/* loaded from: classes2.dex */
public final class UrlAnnotation implements AnnotatedString.Annotation {
    public static final int $stable = 0;
    private final String url;

    public UrlAnnotation(String str) {
        this.url = str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof UrlAnnotation) && AbstractC9979u.m20289b(this.url, ((UrlAnnotation) obj).url);
    }

    public final String getUrl() {
        return this.url;
    }

    public int hashCode() {
        return this.url.hashCode();
    }

    public String toString() {
        return "UrlAnnotation(url=" + this.url + ')';
    }
}
