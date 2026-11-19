package kotlin.collections.builders;

import id.InterfaceC9629f;
import java.io.InvalidObjectException;
import java.io.NotSerializableException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import kotlin.jvm.internal.AbstractC9972n;
import kotlin.jvm.internal.AbstractC9979u;
import p325rc.AbstractC10952j;

/* loaded from: classes6.dex */
public final class SetBuilder<E> extends AbstractC10952j implements Set<E>, Serializable, InterfaceC9629f {

    /* renamed from: d */
    public static final C9937a f23341d = new C9937a(null);

    /* renamed from: e */
    public static final SetBuilder f23342e = new SetBuilder(MapBuilder.f23314p.m20189e());

    /* renamed from: c */
    public final MapBuilder f23343c;

    /* renamed from: kotlin.collections.builders.SetBuilder$a */
    public static final class C9937a {
        public /* synthetic */ C9937a(AbstractC9972n abstractC9972n) {
            this();
        }

        public C9937a() {
        }
    }

    public SetBuilder(MapBuilder backing) {
        AbstractC9979u.m20294g(backing, "backing");
        this.f23343c = backing;
    }

    private final void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization is supported via proxy only");
    }

    private final Object writeReplace() throws NotSerializableException {
        if (this.f23343c.m20164M()) {
            return new SerializedCollection(this, 1);
        }
        throw new NotSerializableException("The set cannot be serialized while it is being built.");
    }

    /* renamed from: a */
    public final Set m20201a() {
        this.f23343c.m20179p();
        return size() > 0 ? this : f23342e;
    }

    @Override // p325rc.AbstractC10952j, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean add(Object obj) {
        return this.f23343c.m20177n(obj) >= 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean addAll(Collection elements) {
        AbstractC9979u.m20294g(elements, "elements");
        this.f23343c.m20180r();
        return super.addAll(elements);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public void clear() {
        this.f23343c.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        return this.f23343c.containsKey(obj);
    }

    @Override // p325rc.AbstractC10952j
    public int getSize() {
        return this.f23343c.size();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean isEmpty() {
        return this.f23343c.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator iterator() {
        return this.f23343c.m20165N();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean remove(Object obj) {
        return this.f23343c.m20173W(obj);
    }

    @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean removeAll(Collection elements) {
        AbstractC9979u.m20294g(elements, "elements");
        this.f23343c.m20180r();
        return super.removeAll(elements);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean retainAll(Collection elements) {
        AbstractC9979u.m20294g(elements, "elements");
        this.f23343c.m20180r();
        return super.retainAll(elements);
    }

    public SetBuilder() {
        this(new MapBuilder());
    }

    public SetBuilder(int i10) {
        this(new MapBuilder(i10));
    }
}
