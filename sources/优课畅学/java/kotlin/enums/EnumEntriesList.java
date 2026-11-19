package kotlin.enums;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.lang.Enum;
import kotlin.jvm.internal.AbstractC9133u;
import p134i7.AbstractC8773d;
import p134i7.AbstractC8801r;
import p212p7.InterfaceC9760a;

/* loaded from: classes5.dex */
final class EnumEntriesList<T extends Enum<T>> extends AbstractC8773d implements InterfaceC9760a, Serializable {

    /* renamed from: a */
    public final Enum[] f17458a;

    public EnumEntriesList(Enum[] entries) {
        AbstractC9133u.m16133g(entries, "entries");
        this.f17458a = entries;
    }

    private final void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization is supported via proxy only");
    }

    private final Object writeReplace() {
        return new EnumEntriesSerializationProxy(this.f17458a);
    }

    /* renamed from: c */
    public boolean m16081c(Enum element) {
        AbstractC9133u.m16133g(element, "element");
        return ((Enum) AbstractC8801r.m14672D0(this.f17458a, element.ordinal())) == element;
    }

    @Override // p134i7.AbstractC8769b, java.util.Collection, java.util.List
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof Enum) {
            return m16081c((Enum) obj);
        }
        return false;
    }

    @Override // p134i7.AbstractC8773d, java.util.List
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public Enum get(int i10) {
        AbstractC8773d.Companion.m14512b(i10, this.f17458a.length);
        return this.f17458a[i10];
    }

    /* renamed from: e */
    public int m16083e(Enum element) {
        AbstractC9133u.m16133g(element, "element");
        int iOrdinal = element.ordinal();
        if (((Enum) AbstractC8801r.m14672D0(this.f17458a, iOrdinal)) == element) {
            return iOrdinal;
        }
        return -1;
    }

    /* renamed from: g */
    public int m16084g(Enum element) {
        AbstractC9133u.m16133g(element, "element");
        return m16083e(element);
    }

    @Override // p134i7.AbstractC8773d, p134i7.AbstractC8769b
    public int getSize() {
        return this.f17458a.length;
    }

    @Override // p134i7.AbstractC8773d, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof Enum) {
            return m16083e((Enum) obj);
        }
        return -1;
    }

    @Override // p134i7.AbstractC8773d, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof Enum) {
            return m16084g((Enum) obj);
        }
        return -1;
    }
}
