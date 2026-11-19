package androidx.core.util;

import androidx.core.content.IntentSanitizer;

/* renamed from: androidx.core.util.b */
/* loaded from: classes2.dex */
public final /* synthetic */ class C2488b implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ int f1038a;

    /* renamed from: b */
    public final /* synthetic */ Predicate f1039b;

    /* renamed from: c */
    public final /* synthetic */ Object f1040c;

    public /* synthetic */ C2488b(Predicate predicate, Predicate predicate2, int i) {
        this.f1038a = i;
        this.f1039b = predicate;
        this.f1040c = predicate2;
    }

    @Override // androidx.core.util.Predicate
    public final boolean test(Object obj) {
        switch (this.f1038a) {
            case 0:
                return this.f1039b.lambda$or$2((Predicate) this.f1040c, obj);
            case 1:
                return this.f1039b.lambda$and$0((Predicate) this.f1040c, obj);
            default:
                return IntentSanitizer.Builder.lambda$allowExtra$13((Class) this.f1040c, this.f1039b, obj);
        }
    }

    public /* synthetic */ C2488b(Class cls, Predicate predicate) {
        this.f1038a = 2;
        this.f1040c = cls;
        this.f1039b = predicate;
    }
}
