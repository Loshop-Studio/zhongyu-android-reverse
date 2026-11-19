package kotlin.enums;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.lang.Enum;
import kotlin.jvm.internal.AbstractC9979u;
import p325rc.AbstractC10940d;
import p325rc.AbstractC10968r;
import p425yc.InterfaceC11943a;

/* loaded from: classes6.dex */
final class EnumEntriesList<T extends Enum<T>> extends AbstractC10940d implements InterfaceC11943a, Serializable {

    /* renamed from: c */
    public final Enum[] f23371c;

    public EnumEntriesList(Enum[] entries) {
        AbstractC9979u.m20294g(entries, "entries");
        this.f23371c = entries;
    }

    private final void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization is supported via proxy only");
    }

    private final Object writeReplace() {
        return new EnumEntriesSerializationProxy(this.f23371c);
    }

    @Override // p325rc.AbstractC10936b, java.util.Collection, java.util.List
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof Enum) {
            return m20226d((Enum) obj);
        }
        return false;
    }

    /* renamed from: d */
    public boolean m20226d(Enum element) {
        AbstractC9979u.m20294g(element, "element");
        return ((Enum) AbstractC10968r.m24044C0(this.f23371c, element.ordinal())) == element;
    }

    @Override // p325rc.AbstractC10940d, java.util.List
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public Enum get(int i10) {
        AbstractC10940d.Companion.m23886b(i10, this.f23371c.length);
        return this.f23371c[i10];
    }

    /* renamed from: f */
    public int m20228f(Enum element) {
        AbstractC9979u.m20294g(element, "element");
        int iOrdinal = element.ordinal();
        if (((Enum) AbstractC10968r.m24044C0(this.f23371c, iOrdinal)) == element) {
            return iOrdinal;
        }
        return -1;
    }

    /* renamed from: g */
    public int m20229g(Enum element) {
        AbstractC9979u.m20294g(element, "element");
        return m20228f(element);
    }

    @Override // p325rc.AbstractC10940d, p325rc.AbstractC10936b
    public int getSize() {
        return this.f23371c.length;
    }

    @Override // p325rc.AbstractC10940d, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof Enum) {
            return m20228f((Enum) obj);
        }
        return -1;
    }

    @Override // p325rc.AbstractC10940d, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof Enum) {
            return m20229g((Enum) obj);
        }
        return -1;
    }
}
