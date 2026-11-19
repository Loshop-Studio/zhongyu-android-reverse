package ee;

import id.InterfaceC9624a;
import java.util.Iterator;
import kotlin.jvm.internal.AbstractC9979u;

/* renamed from: ee.j */
/* loaded from: classes6.dex */
public abstract class AbstractC9133j {

    /* renamed from: ee.j$a */
    public static final class a implements Iterator, InterfaceC9624a {

        /* renamed from: c */
        public int f21324c;

        /* renamed from: d */
        public final /* synthetic */ InterfaceC9129f f21325d;

        public a(InterfaceC9129f interfaceC9129f) {
            this.f21325d = interfaceC9129f;
            this.f21324c = interfaceC9129f.mo17958c();
        }

        @Override // java.util.Iterator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public InterfaceC9129f next() {
            InterfaceC9129f interfaceC9129f = this.f21325d;
            int iMo17958c = interfaceC9129f.mo17958c();
            int i10 = this.f21324c;
            this.f21324c = i10 - 1;
            return interfaceC9129f.mo17960e(iMo17958c - i10);
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f21324c > 0;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* renamed from: ee.j$b */
    public static final class b implements Iterator, InterfaceC9624a {

        /* renamed from: c */
        public int f21326c;

        /* renamed from: d */
        public final /* synthetic */ InterfaceC9129f f21327d;

        public b(InterfaceC9129f interfaceC9129f) {
            this.f21327d = interfaceC9129f;
            this.f21326c = interfaceC9129f.mo17958c();
        }

        @Override // java.util.Iterator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public String next() {
            InterfaceC9129f interfaceC9129f = this.f21327d;
            int iMo17958c = interfaceC9129f.mo17958c();
            int i10 = this.f21326c;
            this.f21326c = i10 - 1;
            return interfaceC9129f.mo17959d(iMo17958c - i10);
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f21326c > 0;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* renamed from: ee.j$c */
    public static final class c implements Iterable, InterfaceC9624a {

        /* renamed from: c */
        public final /* synthetic */ InterfaceC9129f f21328c;

        public c(InterfaceC9129f interfaceC9129f) {
            this.f21328c = interfaceC9129f;
        }

        @Override // java.lang.Iterable
        public Iterator iterator() {
            return new a(this.f21328c);
        }
    }

    /* renamed from: ee.j$d */
    public static final class d implements Iterable, InterfaceC9624a {

        /* renamed from: c */
        public final /* synthetic */ InterfaceC9129f f21329c;

        public d(InterfaceC9129f interfaceC9129f) {
            this.f21329c = interfaceC9129f;
        }

        @Override // java.lang.Iterable
        public Iterator iterator() {
            return new b(this.f21329c);
        }
    }

    /* renamed from: a */
    public static final Iterable m17971a(InterfaceC9129f interfaceC9129f) {
        AbstractC9979u.m20294g(interfaceC9129f, "<this>");
        return new c(interfaceC9129f);
    }

    /* renamed from: b */
    public static final Iterable m17972b(InterfaceC9129f interfaceC9129f) {
        AbstractC9979u.m20294g(interfaceC9129f, "<this>");
        return new d(interfaceC9129f);
    }
}
