package androidx.compose.p014ui.text.font;

import androidx.compose.p014ui.text.internal.InlineClassHelperKt;
import androidx.compose.runtime.Immutable;
import id.InterfaceC9624a;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.function.UnaryOperator;
import kotlin.jvm.internal.AbstractC9971m;
import kotlin.jvm.internal.AbstractC9979u;

@Immutable
/* loaded from: classes2.dex */
public final class FontListFontFamily extends FileBasedFontFamily implements List<Font>, InterfaceC9624a {
    public static final int $stable = 0;
    private final List<Font> fonts;

    /* JADX WARN: Multi-variable type inference failed */
    public FontListFontFamily(List<? extends Font> list) {
        super(null);
        this.fonts = list;
        if (list.isEmpty()) {
            InlineClassHelperKt.throwIllegalStateException("At least one font should be passed to FontFamily");
        }
    }

    /* renamed from: add, reason: avoid collision after fix types in other method */
    public void add2(int i10, Font font) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public boolean addAll(int i10, Collection<? extends Font> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public void addFirst(Font font) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public void addLast(Font font) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean contains(Font font) {
        return this.fonts.contains(font);
    }

    @Override // java.util.List, java.util.Collection
    public boolean containsAll(Collection<? extends Object> collection) {
        return this.fonts.containsAll(collection);
    }

    @Override // java.util.List, java.util.Collection
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof FontListFontFamily) && AbstractC9979u.m20289b(this.fonts, ((FontListFontFamily) obj).fonts);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // java.util.List
    public Font get(int i10) {
        return this.fonts.get(i10);
    }

    public final List<Font> getFonts() {
        return this.fonts;
    }

    public int getSize() {
        return this.fonts.size();
    }

    @Override // java.util.List, java.util.Collection
    public int hashCode() {
        return this.fonts.hashCode();
    }

    public int indexOf(Font font) {
        return this.fonts.indexOf(font);
    }

    @Override // java.util.List, java.util.Collection
    public boolean isEmpty() {
        return this.fonts.isEmpty();
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public Iterator<Font> iterator() {
        return this.fonts.iterator();
    }

    public int lastIndexOf(Font font) {
        return this.fonts.lastIndexOf(font);
    }

    @Override // java.util.List
    public ListIterator<Font> listIterator() {
        return this.fonts.listIterator();
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // java.util.List
    public Font remove(int i10) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public boolean removeAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public Font removeFirst() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public Font removeLast() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public void replaceAll(UnaryOperator<Font> unaryOperator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public boolean retainAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* renamed from: set, reason: avoid collision after fix types in other method */
    public Font set2(int i10, Font font) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final /* bridge */ int size() {
        return getSize();
    }

    @Override // java.util.List
    public void sort(Comparator<? super Font> comparator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public List<Font> subList(int i10, int i11) {
        return this.fonts.subList(i10, i11);
    }

    @Override // java.util.List, java.util.Collection
    public Object[] toArray() {
        return AbstractC9971m.m20283a(this);
    }

    public String toString() {
        return "FontListFontFamily(fonts=" + this.fonts + ')';
    }

    @Override // java.util.List
    public /* bridge */ /* synthetic */ void add(int i10, Font font) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public boolean addAll(Collection<? extends Font> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public /* bridge */ /* synthetic */ void addFirst(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public /* bridge */ /* synthetic */ void addLast(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof Font) {
            return contains((Font) obj);
        }
        return false;
    }

    @Override // java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof Font) {
            return indexOf((Font) obj);
        }
        return -1;
    }

    @Override // java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof Font) {
            return lastIndexOf((Font) obj);
        }
        return -1;
    }

    @Override // java.util.List
    public ListIterator<Font> listIterator(int i10) {
        return this.fonts.listIterator(i10);
    }

    @Override // java.util.List
    public /* bridge */ /* synthetic */ Font remove(int i10) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* renamed from: removeFirst, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m33059removeFirst() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* renamed from: removeLast, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m33060removeLast() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public /* bridge */ /* synthetic */ Font set(int i10, Font font) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public <T> T[] toArray(T[] tArr) {
        return (T[]) AbstractC9971m.m20284b(this, tArr);
    }

    public boolean add(Font font) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public /* bridge */ /* synthetic */ boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
