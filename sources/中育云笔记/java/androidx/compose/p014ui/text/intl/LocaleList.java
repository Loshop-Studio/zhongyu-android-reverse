package androidx.compose.p014ui.text.intl;

import androidx.compose.runtime.Immutable;
import id.InterfaceC9624a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;
import kotlin.jvm.internal.AbstractC9971m;
import kotlin.jvm.internal.AbstractC9972n;
import kotlin.jvm.internal.AbstractC9979u;
import p310qd.AbstractC10793c0;
import p325rc.AbstractC10968r;
import p325rc.AbstractC10978w;

@Immutable
/* loaded from: classes2.dex */
public final class LocaleList implements Collection<Locale>, InterfaceC9624a {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private static final LocaleList Empty = new LocaleList((List<Locale>) AbstractC10978w.m24136n());
    private final List<Locale> localeList;
    private final int size;

    public static final class Companion {
        public /* synthetic */ Companion(AbstractC9972n abstractC9972n) {
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
        return (obj instanceof LocaleList) && AbstractC9979u.m20289b(this.localeList, ((LocaleList) obj).localeList);
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
        return AbstractC9971m.m20283a(this);
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
        return (T[]) AbstractC9971m.m20284b(this, tArr);
    }

    public LocaleList(String str) {
        List listM23091I0 = AbstractC10793c0.m23091I0(str, new String[]{","}, false, 0, 6, null);
        ArrayList arrayList = new ArrayList(listM23091I0.size());
        int size = listM23091I0.size();
        for (int i10 = 0; i10 < size; i10++) {
            arrayList.add(AbstractC10793c0.m23129e1((String) listM23091I0.get(i10)).toString());
        }
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size2 = arrayList.size();
        for (int i11 = 0; i11 < size2; i11++) {
            arrayList2.add(new Locale((String) arrayList.get(i11)));
        }
        this(arrayList2);
    }

    public LocaleList(Locale... localeArr) {
        this((List<Locale>) AbstractC10968r.m24097p1(localeArr));
    }
}
