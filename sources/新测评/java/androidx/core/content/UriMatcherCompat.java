package androidx.core.content;

import android.content.UriMatcher;
import android.net.Uri;
import androidx.core.util.Predicate;

/* loaded from: classes2.dex */
public class UriMatcherCompat {
    private UriMatcherCompat() {
    }

    /* renamed from: a */
    public static /* synthetic */ boolean m1600a(UriMatcher uriMatcher, Uri uri) {
        return uriMatcher.match(uri) != -1;
    }

    public static Predicate<Uri> asPredicate(final UriMatcher uriMatcher) {
        return new Predicate() { // from class: androidx.core.content.x
            @Override // androidx.core.util.Predicate
            public final boolean test(Object obj) {
                return UriMatcherCompat.m1600a(uriMatcher, (Uri) obj);
            }
        };
    }
}
