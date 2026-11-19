package p101f8;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.AbstractC9079b;
import kotlin.Result;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.InterfaceC9100d;
import kotlin.jvm.internal.AbstractC9133u;
import p123h7.C8736p;
import p179m7.InterfaceC9324c;
import p190n7.AbstractC9434a;
import p201o7.AbstractC9541f;
import p311y7.InterfaceC10668a;

/* renamed from: f8.h */
/* loaded from: classes5.dex */
public final class C8470h extends AbstractC8471i implements Iterator, InterfaceC9324c, InterfaceC10668a {

    /* renamed from: a */
    public int f16069a;

    /* renamed from: b */
    public Object f16070b;

    /* renamed from: c */
    public Iterator f16071c;

    /* renamed from: d */
    public InterfaceC9324c f16072d;

    @Override // p101f8.AbstractC8471i
    /* renamed from: a */
    public Object mo13820a(Object obj, InterfaceC9324c interfaceC9324c) {
        this.f16070b = obj;
        this.f16069a = 3;
        this.f16072d = interfaceC9324c;
        Object objM17291f = AbstractC9434a.m17291f();
        if (objM17291f == AbstractC9434a.m17291f()) {
            AbstractC9541f.m17811c(interfaceC9324c);
        }
        return objM17291f == AbstractC9434a.m17291f() ? objM17291f : C8736p.f16368a;
    }

    @Override // p101f8.AbstractC8471i
    /* renamed from: c */
    public Object mo13821c(Iterator it, InterfaceC9324c interfaceC9324c) {
        if (!it.hasNext()) {
            return C8736p.f16368a;
        }
        this.f16071c = it;
        this.f16069a = 2;
        this.f16072d = interfaceC9324c;
        Object objM17291f = AbstractC9434a.m17291f();
        if (objM17291f == AbstractC9434a.m17291f()) {
            AbstractC9541f.m17811c(interfaceC9324c);
        }
        return objM17291f == AbstractC9434a.m17291f() ? objM17291f : C8736p.f16368a;
    }

    /* renamed from: d */
    public final Throwable m13822d() {
        int i10 = this.f16069a;
        if (i10 == 4) {
            return new NoSuchElementException();
        }
        if (i10 == 5) {
            return new IllegalStateException("Iterator has failed.");
        }
        return new IllegalStateException("Unexpected state of the iterator: " + this.f16069a);
    }

    /* renamed from: e */
    public final Object m13823e() {
        if (hasNext()) {
            return next();
        }
        throw new NoSuchElementException();
    }

    /* renamed from: f */
    public final void m13824f(InterfaceC9324c interfaceC9324c) {
        this.f16072d = interfaceC9324c;
    }

    @Override // p179m7.InterfaceC9324c
    public InterfaceC9100d getContext() {
        return EmptyCoroutineContext.f17438a;
    }

    @Override // java.util.Iterator
    public boolean hasNext() throws Throwable {
        while (true) {
            int i10 = this.f16069a;
            if (i10 != 0) {
                if (i10 != 1) {
                    if (i10 == 2 || i10 == 3) {
                        return true;
                    }
                    if (i10 == 4) {
                        return false;
                    }
                    throw m13822d();
                }
                Iterator it = this.f16071c;
                AbstractC9133u.m16130d(it);
                if (it.hasNext()) {
                    this.f16069a = 2;
                    return true;
                }
                this.f16071c = null;
            }
            this.f16069a = 5;
            InterfaceC9324c interfaceC9324c = this.f16072d;
            AbstractC9133u.m16130d(interfaceC9324c);
            this.f16072d = null;
            interfaceC9324c.resumeWith(Result.m15909b(C8736p.f16368a));
        }
    }

    @Override // java.util.Iterator
    public Object next() throws Throwable {
        int i10 = this.f16069a;
        if (i10 == 0 || i10 == 1) {
            return m13823e();
        }
        if (i10 == 2) {
            this.f16069a = 1;
            Iterator it = this.f16071c;
            AbstractC9133u.m16130d(it);
            return it.next();
        }
        if (i10 != 3) {
            throw m13822d();
        }
        this.f16069a = 0;
        Object obj = this.f16070b;
        this.f16070b = null;
        return obj;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // p179m7.InterfaceC9324c
    public void resumeWith(Object obj) throws Throwable {
        AbstractC9079b.m15926b(obj);
        this.f16069a = 4;
    }
}
