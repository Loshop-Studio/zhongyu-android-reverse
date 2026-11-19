package p296pd;

import id.InterfaceC9624a;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.AbstractC9924b;
import kotlin.Result;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.InterfaceC9945d;
import kotlin.jvm.internal.AbstractC9979u;
import p309qc.C10786q;
import p393wc.AbstractC11725a;
import p409xc.AbstractC11831f;
import vc.InterfaceC11588c;

/* renamed from: pd.h */
/* loaded from: classes6.dex */
public final class C10660h extends AbstractC10661i implements Iterator, InterfaceC11588c, InterfaceC9624a {

    /* renamed from: c */
    public int f25697c;

    /* renamed from: d */
    public Object f25698d;

    /* renamed from: e */
    public Iterator f25699e;

    /* renamed from: f */
    public InterfaceC11588c f25700f;

    @Override // p296pd.AbstractC10661i
    /* renamed from: a */
    public Object mo22551a(Object obj, InterfaceC11588c interfaceC11588c) {
        this.f25698d = obj;
        this.f25697c = 3;
        this.f25700f = interfaceC11588c;
        Object objM25952f = AbstractC11725a.m25952f();
        if (objM25952f == AbstractC11725a.m25952f()) {
            AbstractC11831f.m26221c(interfaceC11588c);
        }
        return objM25952f == AbstractC11725a.m25952f() ? objM25952f : C10786q.f26013a;
    }

    @Override // p296pd.AbstractC10661i
    /* renamed from: b */
    public Object mo22552b(Iterator it, InterfaceC11588c interfaceC11588c) {
        if (!it.hasNext()) {
            return C10786q.f26013a;
        }
        this.f25699e = it;
        this.f25697c = 2;
        this.f25700f = interfaceC11588c;
        Object objM25952f = AbstractC11725a.m25952f();
        if (objM25952f == AbstractC11725a.m25952f()) {
            AbstractC11831f.m26221c(interfaceC11588c);
        }
        return objM25952f == AbstractC11725a.m25952f() ? objM25952f : C10786q.f26013a;
    }

    /* renamed from: e */
    public final Throwable m22553e() {
        int i10 = this.f25697c;
        if (i10 == 4) {
            return new NoSuchElementException();
        }
        if (i10 == 5) {
            return new IllegalStateException("Iterator has failed.");
        }
        return new IllegalStateException("Unexpected state of the iterator: " + this.f25697c);
    }

    /* renamed from: f */
    public final Object m22554f() {
        if (hasNext()) {
            return next();
        }
        throw new NoSuchElementException();
    }

    /* renamed from: g */
    public final void m22555g(InterfaceC11588c interfaceC11588c) {
        this.f25700f = interfaceC11588c;
    }

    @Override // vc.InterfaceC11588c
    public InterfaceC9945d getContext() {
        return EmptyCoroutineContext.f23351c;
    }

    @Override // java.util.Iterator
    public boolean hasNext() throws Throwable {
        while (true) {
            int i10 = this.f25697c;
            if (i10 != 0) {
                if (i10 != 1) {
                    if (i10 == 2 || i10 == 3) {
                        return true;
                    }
                    if (i10 == 4) {
                        return false;
                    }
                    throw m22553e();
                }
                Iterator it = this.f25699e;
                AbstractC9979u.m20291d(it);
                if (it.hasNext()) {
                    this.f25697c = 2;
                    return true;
                }
                this.f25699e = null;
            }
            this.f25697c = 5;
            InterfaceC11588c interfaceC11588c = this.f25700f;
            AbstractC9979u.m20291d(interfaceC11588c);
            this.f25700f = null;
            interfaceC11588c.resumeWith(Result.m20054c(C10786q.f26013a));
        }
    }

    @Override // java.util.Iterator
    public Object next() throws Throwable {
        int i10 = this.f25697c;
        if (i10 == 0 || i10 == 1) {
            return m22554f();
        }
        if (i10 == 2) {
            this.f25697c = 1;
            Iterator it = this.f25699e;
            AbstractC9979u.m20291d(it);
            return it.next();
        }
        if (i10 != 3) {
            throw m22553e();
        }
        this.f25697c = 0;
        Object obj = this.f25698d;
        this.f25698d = null;
        return obj;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // vc.InterfaceC11588c
    public void resumeWith(Object obj) throws Throwable {
        AbstractC9924b.m20071b(obj);
        this.f25697c = 4;
    }
}
