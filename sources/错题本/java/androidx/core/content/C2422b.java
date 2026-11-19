package androidx.core.content;

import android.content.ComponentName;
import android.content.UriMatcher;
import android.net.Uri;
import androidx.core.util.Predicate;

/* renamed from: androidx.core.content.b */
/* loaded from: classes2.dex */
public final /* synthetic */ class C2422b implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ int f989a;

    /* renamed from: b */
    public final /* synthetic */ Object f990b;

    public /* synthetic */ C2422b(Object obj, int i) {
        this.f989a = i;
        this.f990b = obj;
    }

    @Override // androidx.core.util.Predicate
    public final boolean test(Object obj) {
        switch (this.f989a) {
            case 0:
                return ((ComponentName) this.f990b).equals((ComponentName) obj);
            default:
                return UriMatcherCompat.lambda$asPredicate$0((UriMatcher) this.f990b, (Uri) obj);
        }
    }
}
