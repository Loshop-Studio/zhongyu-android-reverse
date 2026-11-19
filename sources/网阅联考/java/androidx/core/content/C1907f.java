package androidx.core.content;

import androidx.core.util.AbstractC2139k;
import androidx.core.util.Predicate;

/* renamed from: androidx.core.content.f */
/* loaded from: classes.dex */
public final /* synthetic */ class C1907f implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ String f284a;

    @Override // androidx.core.util.Predicate
    public /* synthetic */ Predicate and(Predicate predicate) {
        return AbstractC2139k.m1252a(this, predicate);
    }

    @Override // androidx.core.util.Predicate
    public /* synthetic */ Predicate negate() {
        return AbstractC2139k.m1253b(this);
    }

    @Override // androidx.core.util.Predicate
    /* renamed from: or */
    public /* synthetic */ Predicate mo1073or(Predicate predicate) {
        return AbstractC2139k.m1254c(this, predicate);
    }

    @Override // androidx.core.util.Predicate
    public final boolean test(Object obj) {
        return this.f284a.equals((String) obj);
    }
}
