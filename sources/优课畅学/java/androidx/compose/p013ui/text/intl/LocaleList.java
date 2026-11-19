package androidx.compose.p013ui.text.intl;

import androidx.compose.runtime.Immutable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;
import kotlin.jvm.internal.AbstractC9125m;
import kotlin.jvm.internal.AbstractC9126n;
import kotlin.jvm.internal.AbstractC9133u;
import p113g8.AbstractC8661c0;
import p134i7.AbstractC8801r;
import p134i7.AbstractC8809v;
import p311y7.InterfaceC10668a;

@Immutable
/* loaded from: classes2.dex */
public final class LocaleList implements Collection<Locale>, InterfaceC10668a {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private static final LocaleList Empty = new LocaleList((List<Locale>) AbstractC8809v.m14771n());
    private final List<Locale> localeList;
    private final int size;

    public static final class Companion {
        public /* synthetic */ Companion(AbstractC9126n abstractC9126n) {
            this();
        }

        public final LocaleList getCurrent() {
            return PlatformLocaleKt.getPlatformLocaleDelegate().getCurrent();
        }

        public final LocaleList getEmpty() {
            return LocaleList.Empty;
        }

        private Companion() {
        }
    }

    public LocaleList(List<Locale> list) {
        this.localeList = list;
        this.size = list.size();
    }

    /* renamed from: add, reason: avoid collision after fix types in other method */
    public boolean add2(Locale locale) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean addAll(Collection<? extends Locale> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof Locale) {
            return contains((Locale) obj);
        }
        return false;
    }

    @Override // java.util.Collection
    public boolean containsAll(Collection<? extends Object> collection) {
        return this.localeList.containsAll(collection);
    }

    @Override // java.util.Collection
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof LocaleList) && AbstractC9133u.m16128b(this.localeList, ((LocaleList) obj).localeList);
    }

    public final Locale get(int i10) {
        return this.localeList.get(i10);
    }

    public final List<Locale> getLocaleList() {
        return this.localeList;
    }

    public int getSize() {
        return this.size;
    }

    @Override // java.util.Collection
    public int hashCode() {
        return this.localeList.hashCode();
    }

    @Override // java.util.Collection
    public boolean isEmpty() {
        return this.localeList.isEmpty();
    }

    @Override // java.util.Collection, java.lang.Iterable
    public Iterator<Locale> iterator() {
        return this.localeList.iterator();
    }

    @Override // java.util.Collection
    public boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean removeAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean removeIf(Predicate<? super Locale> predicate) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean retainAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final /* bridge */ int size() {
        return getSize();
    }

    @Override // java.util.Collection
    public Object[] toArray() {
        return AbstractC9125m.m16122a(this);
    }

    public String toString() {
        return "LocaleList(localeList=" + this.localeList + ')';
    }

    @Override // java.util.Collection
    public /* bridge */ /* synthetic */ boolean add(Locale locale) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean contains(Locale locale) {
        return this.localeList.contains(locale);
    }

    @Override // java.util.Collection
    public <T> T[] toArray(T[] tArr) {
        return (T[]) AbstractC9125m.m16123b(this, tArr);
    }

    public LocaleList(String str) {
        List listM13958I0 = AbstractC8661c0.m13958I0(str, new String[]{","}, false, 0, 6, null);
        ArrayList arrayList = new ArrayList(listM13958I0.size());
        int size = listM13958I0.size();
        for (int i10 = 0; i10 < size; i10++) {
            arrayList.add(AbstractC8661c0.m13982W0((String) listM13958I0.get(i10)).toString());
        }
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size2 = arrayList.size();
        for (int i11 = 0; i11 < size2; i11++) {
            arrayList2.add(new Locale((String) arrayList.get(i11)));
        }
        this(arrayList2);
    }

    public LocaleList(Locale... localeArr) {
        this((List<Locale>) AbstractC8801r.m14736u1(localeArr));
    }
}
