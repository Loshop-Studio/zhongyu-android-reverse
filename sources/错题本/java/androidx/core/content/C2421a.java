package androidx.core.content;

import android.content.ComponentName;
import android.net.Uri;
import androidx.core.content.IntentSanitizer;
import androidx.core.util.Predicate;

/* renamed from: androidx.core.content.a */
/* loaded from: classes2.dex */
public final /* synthetic */ class C2421a implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ int f987a;

    /* renamed from: b */
    public final /* synthetic */ String f988b;

    public /* synthetic */ C2421a(String str, int i) {
        this.f987a = i;
        this.f988b = str;
    }

    @Override // androidx.core.util.Predicate
    public final boolean test(Object obj) {
        switch (this.f987a) {
            case 0:
                return IntentSanitizer.Builder.lambda$allowExtraOutput$16(this.f988b, (Uri) obj);
            case 1:
                return this.f988b.equals((String) obj);
            case 2:
                return IntentSanitizer.Builder.lambda$allowComponentWithPackage$9(this.f988b, (ComponentName) obj);
            case 3:
                return IntentSanitizer.Builder.lambda$allowDataWithAuthority$8(this.f988b, (Uri) obj);
            case 4:
                return IntentSanitizer.Builder.lambda$allowClipDataUriWithAuthority$11(this.f988b, (Uri) obj);
            default:
                return IntentSanitizer.Builder.lambda$allowExtraStreamUriWithAuthority$15(this.f988b, (Uri) obj);
        }
    }
}
