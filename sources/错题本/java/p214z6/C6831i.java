package p214z6;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.AbstractC5774b;
import kotlin.Result;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.internal.AbstractC5830k;
import p045d6.C5443s;
import p075h6.InterfaceC5631c;
import p075h6.InterfaceC5636h;
import p160s6.InterfaceC6560a;

/* renamed from: z6.i */
/* loaded from: classes2.dex */
public final class C6831i extends AbstractC6832j implements Iterator, InterfaceC5631c, InterfaceC6560a {

    /* renamed from: a */
    public int f11578a;

    /* renamed from: b */
    public Object f11579b;

    /* renamed from: c */
    public Iterator f11580c;

    /* renamed from: d */
    public InterfaceC5631c f11581d;

    @Override // p214z6.AbstractC6832j
    /* renamed from: a */
    public final CoroutineSingletons mo6491a(InterfaceC5631c frame, Object obj) {
        this.f11579b = obj;
        this.f11578a = 3;
        this.f11581d = frame;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        AbstractC5830k.m5330g(frame, "frame");
        return coroutineSingletons;
    }

    /* renamed from: c */
    public final RuntimeException m6492c() {
        int i = this.f11578a;
        if (i == 4) {
            return new NoSuchElementException();
        }
        if (i == 5) {
            return new IllegalStateException("Iterator has failed.");
        }
        return new IllegalStateException("Unexpected state of the iterator: " + this.f11578a);
    }

    @Override // p075h6.InterfaceC5631c
    public final InterfaceC5636h getContext() {
        return EmptyCoroutineContext.INSTANCE;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        while (true) {
            int i = this.f11578a;
            if (i != 0) {
                if (i != 1) {
                    if (i == 2 || i == 3) {
                        return true;
                    }
                    if (i == 4) {
                        return false;
                    }
                    throw m6492c();
                }
                Iterator it = this.f11580c;
                AbstractC5830k.m5327d(it);
                if (it.hasNext()) {
                    this.f11578a = 2;
                    return true;
                }
                this.f11580c = null;
            }
            this.f11578a = 5;
            InterfaceC5631c interfaceC5631c = this.f11581d;
            AbstractC5830k.m5327d(interfaceC5631c);
            this.f11581d = null;
            interfaceC5631c.resumeWith(Result.m13956constructorimpl(C5443s.f8405a));
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.f11578a;
        if (i == 0 || i == 1) {
            if (hasNext()) {
                return next();
            }
            throw new NoSuchElementException();
        }
        if (i == 2) {
            this.f11578a = 1;
            Iterator it = this.f11580c;
            AbstractC5830k.m5327d(it);
            return it.next();
        }
        if (i != 3) {
            throw m6492c();
        }
        this.f11578a = 0;
        Object obj = this.f11579b;
        this.f11579b = null;
        return obj;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // p075h6.InterfaceC5631c
    public final void resumeWith(Object obj) {
        AbstractC5774b.m5119b(obj);
        this.f11578a = 4;
    }
}
