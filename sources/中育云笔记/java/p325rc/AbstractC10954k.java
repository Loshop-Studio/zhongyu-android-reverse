package p325rc;

import id.InterfaceC9624a;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import kotlin.jvm.internal.AbstractC9972n;
import kotlin.jvm.internal.AbstractC9979u;

/* renamed from: rc.k */
/* loaded from: classes6.dex */
public abstract class AbstractC10954k extends AbstractC10936b implements Set, InterfaceC9624a {
    public static final a Companion = new a(null);

    /* renamed from: rc.k$a */
    public static final class a {
        public /* synthetic */ a(AbstractC9972n abstractC9972n) {
            this();
        }

        /* renamed from: a */
        public final boolean m23960a(Set c10, Set other) {
            AbstractC9979u.m20294g(c10, "c");
            AbstractC9979u.m20294g(other, "other");
            if (c10.size() != other.size()) {
                return false;
            }
            return c10.containsAll(other);
        }

        /* renamed from: b */
        public final int m23961b(Collection c10) {
            AbstractC9979u.m20294g(c10, "c");
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
            return Companion.m23960a(this, (Set) obj);
        }
        return false;
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        return Companion.m23961b(this);
    }
}
