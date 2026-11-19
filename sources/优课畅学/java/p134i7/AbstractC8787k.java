package p134i7;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import kotlin.jvm.internal.AbstractC9126n;
import kotlin.jvm.internal.AbstractC9133u;
import p311y7.InterfaceC10668a;

/* renamed from: i7.k */
/* loaded from: classes5.dex */
public abstract class AbstractC8787k extends AbstractC8769b implements Set, InterfaceC10668a {
    public static final a Companion = new a(null);

    /* renamed from: i7.k$a */
    public static final class a {
        public /* synthetic */ a(AbstractC9126n abstractC9126n) {
            this();
        }

        /* renamed from: a */
        public final boolean m14586a(Set c10, Set other) {
            AbstractC9133u.m16133g(c10, "c");
            AbstractC9133u.m16133g(other, "other");
            if (c10.size() != other.size()) {
                return false;
            }
            return c10.containsAll(other);
        }

        /* renamed from: b */
        public final int m14587b(Collection c10) {
            AbstractC9133u.m16133g(c10, "c");
            Iterator it = c10.iterator();
            int iHashCode = 0;
            while (it.hasNext()) {
                Object next = it.next();
                iHashCode += next != null ? next.hashCode() : 0;
            }
            return iHashCode;
        }

        public a() {
        }
    }

    @Override // java.util.Collection, java.util.Set
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof Set) {
            return Companion.m14586a(this, (Set) obj);
        }
        return false;
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        return Companion.m14587b(this);
    }
}
