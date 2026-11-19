package kotlin.collections.builders;

import java.io.InvalidObjectException;
import java.io.NotSerializableException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import kotlin.jvm.internal.AbstractC9126n;
import kotlin.jvm.internal.AbstractC9133u;
import p134i7.AbstractC8785j;
import p311y7.InterfaceC10673f;

/* loaded from: classes5.dex */
public final class SetBuilder<E> extends AbstractC8785j implements Set<E>, Serializable, InterfaceC10673f {

    /* renamed from: b */
    public static final C9092a f17428b = new C9092a(null);

    /* renamed from: c */
    public static final SetBuilder f17429c = new SetBuilder(MapBuilder.f17401n.m16044e());

    /* renamed from: a */
    public final MapBuilder f17430a;

    /* renamed from: kotlin.collections.builders.SetBuilder$a */
    public static final class C9092a {
        public /* synthetic */ C9092a(AbstractC9126n abstractC9126n) {
            this();
        }

        public C9092a() {
        }
    }

    public SetBuilder(MapBuilder backing) {
        AbstractC9133u.m16133g(backing, "backing");
        this.f17430a = backing;
    }

    private final void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization is supported via proxy only");
    }

    private final Object writeReplace() throws NotSerializableException {
        if (this.f17430a.m16012D()) {
            return new SerializedCollection(this, 1);
        }
        throw new NotSerializableException("The set cannot be serialized while it is being built.");
    }

    /* renamed from: a */
    public final Set m16056a() {
        this.f17430a.m16027l();
        return size() > 0 ? this : f17429c;
    }

    @Override // p134i7.AbstractC8785j, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean add(Object obj) {
        return this.f17430a.m16025j(obj) >= 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean addAll(Collection elements) {
        AbstractC9133u.m16133g(elements, "elements");
        this.f17430a.m16028m();
        return super.addAll(elements);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public void clear() {
        this.f17430a.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        return this.f17430a.containsKey(obj);
    }

    @Override // p134i7.AbstractC8785j
    public int getSize() {
        return this.f17430a.size();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean isEmpty() {
        return this.f17430a.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator iterator() {
        return this.f17430a.m16013E();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean remove(Object obj) {
        return this.f17430a.m16021N(obj);
    }

    @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean removeAll(Collection elements) {
        AbstractC9133u.m16133g(elements, "elements");
        this.f17430a.m16028m();
        return super.removeAll(elements);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean retainAll(Collection elements) {
        AbstractC9133u.m16133g(elements, "elements");
        this.f17430a.m16028m();
        return super.retainAll(elements);
    }

    public SetBuilder() {
        this(new MapBuilder());
    }

    public SetBuilder(int i10) {
        this(new MapBuilder(i10));
    }
}
