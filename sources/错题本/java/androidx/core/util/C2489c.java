package androidx.core.util;

/* renamed from: androidx.core.util.c */
/* loaded from: classes2.dex */
public final /* synthetic */ class C2489c implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ int f1041a;

    /* renamed from: b */
    public final /* synthetic */ Object f1042b;

    public /* synthetic */ C2489c(Object obj, int i) {
        this.f1041a = i;
        this.f1042b = obj;
    }

    @Override // androidx.core.util.Predicate
    public final boolean test(Object obj) {
        switch (this.f1041a) {
            case 0:
                return this.f1042b.equals(obj);
            default:
                return ((Predicate) this.f1042b).lambda$negate$1(obj);
        }
    }
}
