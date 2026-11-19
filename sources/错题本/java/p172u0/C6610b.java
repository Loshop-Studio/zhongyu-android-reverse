package p172u0;

import java.security.MessageDigest;
import p185v7.AbstractC6675d;
import p202y.InterfaceC6760c;

/* renamed from: u0.b */
/* loaded from: classes2.dex */
public final class C6610b implements InterfaceC6760c {

    /* renamed from: b */
    public final Object f11040b;

    public C6610b(Object obj) {
        AbstractC6675d.m6344f(obj, "Argument must not be null");
        this.f11040b = obj;
    }

    @Override // p202y.InterfaceC6760c
    /* renamed from: b */
    public final void mo2013b(MessageDigest messageDigest) {
        messageDigest.update(this.f11040b.toString().getBytes(InterfaceC6760c.f11429a));
    }

    @Override // p202y.InterfaceC6760c
    public final boolean equals(Object obj) {
        if (obj instanceof C6610b) {
            return this.f11040b.equals(((C6610b) obj).f11040b);
        }
        return false;
    }

    @Override // p202y.InterfaceC6760c
    public final int hashCode() {
        return this.f11040b.hashCode();
    }

    public final String toString() {
        return "ObjectKey{object=" + this.f11040b + '}';
    }
}
