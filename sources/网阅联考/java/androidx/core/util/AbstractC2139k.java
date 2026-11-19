package androidx.core.util;

import java.util.Objects;

/* renamed from: androidx.core.util.k */
/* loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC2139k {
    /* renamed from: a */
    public static Predicate m1252a(final Predicate predicate, final Predicate predicate2) {
        Objects.requireNonNull(predicate2);
        return new Predicate() { // from class: androidx.core.util.i
            @Override // androidx.core.util.Predicate
            public /* synthetic */ Predicate and(Predicate predicate3) {
                return AbstractC2139k.m1252a(this, predicate3);
            }

            @Override // androidx.core.util.Predicate
            public /* synthetic */ Predicate negate() {
                return AbstractC2139k.m1253b(this);
            }

            @Override // androidx.core.util.Predicate
            /* renamed from: or */
            public /* synthetic */ Predicate mo1073or(Predicate predicate3) {
                return AbstractC2139k.m1254c(this, predicate3);
            }

            @Override // androidx.core.util.Predicate
            public final boolean test(Object obj) {
                return AbstractC2139k.m1255d(predicate, predicate2, obj);
            }
        };
    }

    /* renamed from: b */
    public static Predicate m1253b(final Predicate predicate) {
        return new Predicate() { // from class: androidx.core.util.j
            @Override // androidx.core.util.Predicate
            public /* synthetic */ Predicate and(Predicate predicate2) {
                return AbstractC2139k.m1252a(this, predicate2);
            }

            @Override // androidx.core.util.Predicate
            public /* synthetic */ Predicate negate() {
                return AbstractC2139k.m1253b(this);
            }

            @Override // androidx.core.util.Predicate
            /* renamed from: or */
            public /* synthetic */ Predicate mo1073or(Predicate predicate2) {
                return AbstractC2139k.m1254c(this, predicate2);
            }

            @Override // androidx.core.util.Predicate
            public final boolean test(Object obj) {
                return AbstractC2139k.m1256e(predicate, obj);
            }
        };
    }

    /* renamed from: c */
    public static Predicate m1254c(final Predicate predicate, final Predicate predicate2) {
        Objects.requireNonNull(predicate2);
        return new Predicate() { // from class: androidx.core.util.f
            @Override // androidx.core.util.Predicate
            public /* synthetic */ Predicate and(Predicate predicate3) {
                return AbstractC2139k.m1252a(this, predicate3);
            }

            @Override // androidx.core.util.Predicate
            public /* synthetic */ Predicate negate() {
                return AbstractC2139k.m1253b(this);
            }

            @Override // androidx.core.util.Predicate
            /* renamed from: or */
            public /* synthetic */ Predicate mo1073or(Predicate predicate3) {
                return AbstractC2139k.m1254c(this, predicate3);
            }

            @Override // androidx.core.util.Predicate
            public final boolean test(Object obj) {
                return AbstractC2139k.m1257f(predicate, predicate2, obj);
            }
        };
    }

    /* renamed from: d */
    public static /* synthetic */ boolean m1255d(Predicate predicate, Predicate predicate2, Object obj) {
        return predicate.test(obj) && predicate2.test(obj);
    }

    /* renamed from: e */
    public static /* synthetic */ boolean m1256e(Predicate predicate, Object obj) {
        return !predicate.test(obj);
    }

    /* renamed from: f */
    public static /* synthetic */ boolean m1257f(Predicate predicate, Predicate predicate2, Object obj) {
        return predicate.test(obj) || predicate2.test(obj);
    }

    /* renamed from: g */
    public static Predicate m1258g(final Object obj) {
        return obj == null ? new Predicate() { // from class: androidx.core.util.g
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
            public final boolean test(Object obj2) {
                return AbstractC2133e.m1251a(obj2);
            }
        } : new Predicate() { // from class: androidx.core.util.h
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
            public final boolean test(Object obj2) {
                return obj.equals(obj2);
            }
        };
    }

    /* renamed from: j */
    public static Predicate m1261j(Predicate predicate) {
        Objects.requireNonNull(predicate);
        return predicate.negate();
    }
}
