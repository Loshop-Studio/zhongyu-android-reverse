package p268u8;

import java.util.Iterator;
import kotlin.jvm.internal.AbstractC9133u;
import p311y7.InterfaceC10668a;

/* renamed from: u8.j */
/* loaded from: classes5.dex */
public abstract class AbstractC10214j {

    /* renamed from: u8.j$a */
    public static final class a implements Iterator, InterfaceC10668a {

        /* renamed from: a */
        public int f20385a;

        /* renamed from: b */
        public final /* synthetic */ InterfaceC10210f f20386b;

        public a(InterfaceC10210f interfaceC10210f) {
            this.f20386b = interfaceC10210f;
            this.f20385a = interfaceC10210f.mo19086c();
        }

        @Override // java.util.Iterator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public InterfaceC10210f next() {
            InterfaceC10210f interfaceC10210f = this.f20386b;
            int iMo19086c = interfaceC10210f.mo19086c();
            int i10 = this.f20385a;
            this.f20385a = i10 - 1;
            return interfaceC10210f.mo19088e(iMo19086c - i10);
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f20385a > 0;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* renamed from: u8.j$b */
    public static final class b implements Iterator, InterfaceC10668a {

        /* renamed from: a */
        public int f20387a;

        /* renamed from: b */
        public final /* synthetic */ InterfaceC10210f f20388b;

        public b(InterfaceC10210f interfaceC10210f) {
            this.f20388b = interfaceC10210f;
            this.f20387a = interfaceC10210f.mo19086c();
        }

        @Override // java.util.Iterator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public String next() {
            InterfaceC10210f interfaceC10210f = this.f20388b;
            int iMo19086c = interfaceC10210f.mo19086c();
            int i10 = this.f20387a;
            this.f20387a = i10 - 1;
            return interfaceC10210f.mo19087d(iMo19086c - i10);
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f20387a > 0;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* renamed from: u8.j$c */
    public static final class c implements Iterable, InterfaceC10668a {

        /* renamed from: a */
        public final /* synthetic */ InterfaceC10210f f20389a;

        public c(InterfaceC10210f interfaceC10210f) {
            this.f20389a = interfaceC10210f;
        }

        @Override // java.lang.Iterable
        public Iterator iterator() {
            return new a(this.f20389a);
        }
    }

    /* renamed from: u8.j$d */
    public static final class d implements Iterable, InterfaceC10668a {

        /* renamed from: a */
        public final /* synthetic */ InterfaceC10210f f20390a;

        public d(InterfaceC10210f interfaceC10210f) {
            this.f20390a = interfaceC10210f;
        }

        @Override // java.lang.Iterable
        public Iterator iterator() {
            return new b(this.f20390a);
        }
    }

    /* renamed from: a */
    public static final Iterable m19099a(InterfaceC10210f interfaceC10210f) {
        AbstractC9133u.m16133g(interfaceC10210f, "<this>");
        return new c(interfaceC10210f);
    }

    /* renamed from: b */
    public static final Iterable m19100b(InterfaceC10210f interfaceC10210f) {
        AbstractC9133u.m16133g(interfaceC10210f, "<this>");
        return new d(interfaceC10210f);
    }
}
