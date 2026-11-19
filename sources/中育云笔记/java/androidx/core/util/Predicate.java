package androidx.core.util;

import android.annotation.SuppressLint;
import java.util.Objects;

@SuppressLint({"UnknownNullness"})
/* loaded from: classes2.dex */
public interface Predicate<T> {
    /* renamed from: a */
    static /* synthetic */ boolean m1597a(Predicate predicate, Object obj) {
        return !predicate.test(obj);
    }

    /* renamed from: b */
    static /* synthetic */ boolean m1598b(Predicate predicate, Predicate predicate2, Object obj) {
        return predicate.test(obj) && predicate2.test(obj);
    }

    /* renamed from: d */
    static /* synthetic */ boolean m1600d(Predicate predicate, Predicate predicate2, Object obj) {
        return predicate.test(obj) || predicate2.test(obj);
    }

    @SuppressLint({"MissingNullability"})
    static <T> Predicate<T> isEqual(@SuppressLint({"MissingNullability"}) final Object obj) {
        return obj == null ? new Predicate() { // from class: androidx.core.util.e
            @Override // androidx.core.util.Predicate
            public final boolean test(Object obj2) {
                return Objects.isNull(obj2);
            }
        } : new Predicate() { // from class: androidx.core.util.f
            @Override // androidx.core.util.Predicate
            public final boolean test(Object obj2) {
                return obj.equals(obj2);
            }
        };
    }

    @SuppressLint({"MissingNullability"})
    static <T> Predicate<T> not(@SuppressLint({"MissingNullability"}) Predicate<? super T> predicate) {
        Objects.requireNonNull(predicate);
        return predicate.negate();
    }

    @SuppressLint({"MissingNullability"})
    default Predicate<T> and(@SuppressLint({"MissingNullability"}) final Predicate<? super T> predicate) {
        Objects.requireNonNull(predicate);
        return new Predicate() { // from class: androidx.core.util.g
            @Override // androidx.core.util.Predicate
            public final boolean test(Object obj) {
                return Predicate.m1598b(this.f1421a, predicate, obj);
            }
        };
    }

    @SuppressLint({"MissingNullability"})
    default Predicate<T> negate() {
        return new Predicate() { // from class: androidx.core.util.h
            @Override // androidx.core.util.Predicate
            public final boolean test(Object obj) {
                return Predicate.m1597a(this.f1423a, obj);
            }
        };
    }

    @SuppressLint({"MissingNullability"})
    /* renamed from: or */
    default Predicate<T> m1602or(@SuppressLint({"MissingNullability"}) final Predicate<? super T> predicate) {
        Objects.requireNonNull(predicate);
        return new Predicate() { // from class: androidx.core.util.d
            @Override // androidx.core.util.Predicate
            public final boolean test(Object obj) {
                return Predicate.m1600d(this.f1418a, predicate, obj);
            }
        };
    }

    boolean test(T t10);
}
