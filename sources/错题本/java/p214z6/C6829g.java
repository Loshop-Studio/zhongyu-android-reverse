package p214z6;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.AbstractC5830k;
import kotlin.text.C5842c;
import p152r6.InterfaceC6469a;
import p152r6.InterfaceC6471c;
import p160s6.InterfaceC6560a;

/* renamed from: z6.g */
/* loaded from: classes2.dex */
public final class C6829g implements Iterator, InterfaceC6560a {

    /* renamed from: a */
    public final /* synthetic */ int f11574a;

    /* renamed from: b */
    public int f11575b;

    /* renamed from: c */
    public Object f11576c;

    /* renamed from: d */
    public final /* synthetic */ InterfaceC6830h f11577d;

    public C6829g(C6836n c6836n) {
        this.f11574a = 1;
        this.f11577d = c6836n;
        this.f11576c = c6836n.f11584a.iterator();
    }

    /* renamed from: a */
    public void m6490a() {
        Object objInvoke;
        C5842c c5842c = (C5842c) this.f11577d;
        if (this.f11575b == -2) {
            objInvoke = ((InterfaceC6469a) c5842c.f9245b).invoke();
        } else {
            InterfaceC6471c interfaceC6471c = (InterfaceC6471c) c5842c.f9246c;
            Object obj = this.f11576c;
            AbstractC5830k.m5327d(obj);
            objInvoke = interfaceC6471c.invoke(obj);
        }
        this.f11576c = objInvoke;
        this.f11575b = objInvoke == null ? 0 : 1;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f11574a) {
            case 0:
                if (this.f11575b < 0) {
                    m6490a();
                }
                if (this.f11575b == 1) {
                }
                break;
            default:
                C6836n c6836n = (C6836n) this.f11577d;
                Iterator it = (Iterator) this.f11576c;
                while (this.f11575b < c6836n.f11585b && it.hasNext()) {
                    it.next();
                    this.f11575b++;
                }
                if (this.f11575b >= c6836n.f11586c || !it.hasNext()) {
                }
                break;
        }
        return true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f11574a) {
            case 0:
                if (this.f11575b < 0) {
                    m6490a();
                }
                if (this.f11575b == 0) {
                    throw new NoSuchElementException();
                }
                Object obj = this.f11576c;
                AbstractC5830k.m5328e(obj, "null cannot be cast to non-null type T of kotlin.sequences.GeneratorSequence");
                this.f11575b = -1;
                return obj;
            default:
                C6836n c6836n = (C6836n) this.f11577d;
                Iterator it = (Iterator) this.f11576c;
                while (this.f11575b < c6836n.f11585b && it.hasNext()) {
                    it.next();
                    this.f11575b++;
                }
                int i = this.f11575b;
                if (i >= c6836n.f11586c) {
                    throw new NoSuchElementException();
                }
                this.f11575b = i + 1;
                return it.next();
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f11574a) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public C6829g(C5842c c5842c) {
        this.f11574a = 0;
        this.f11577d = c5842c;
        this.f11575b = -2;
    }
}
