package p277v6;

import io.reactivex.exceptions.CompositeException;
import io.reactivex.internal.util.ExceptionHelper;
import java.util.ArrayList;
import p088e7.C8371d;
import p288w6.AbstractC10359a;
import p310y6.InterfaceC10666a;
import p321z6.AbstractC10726b;

/* renamed from: v6.a */
/* loaded from: classes5.dex */
public final class C10249a implements InterfaceC10250b, InterfaceC10666a {

    /* renamed from: a */
    public C8371d f20488a;

    /* renamed from: b */
    public volatile boolean f20489b;

    @Override // p310y6.InterfaceC10666a
    /* renamed from: a */
    public boolean mo19200a(InterfaceC10250b interfaceC10250b) {
        AbstractC10726b.m20030c(interfaceC10250b, "Disposable item is null");
        if (this.f20489b) {
            return false;
        }
        synchronized (this) {
            try {
                if (this.f20489b) {
                    return false;
                }
                C8371d c8371d = this.f20488a;
                if (c8371d != null && c8371d.m13667e(interfaceC10250b)) {
                    return true;
                }
                return false;
            } finally {
            }
        }
    }

    @Override // p310y6.InterfaceC10666a
    /* renamed from: b */
    public boolean mo19201b(InterfaceC10250b interfaceC10250b) {
        AbstractC10726b.m20030c(interfaceC10250b, "d is null");
        if (!this.f20489b) {
            synchronized (this) {
                try {
                    if (!this.f20489b) {
                        C8371d c8371d = this.f20488a;
                        if (c8371d == null) {
                            c8371d = new C8371d();
                            this.f20488a = c8371d;
                        }
                        c8371d.m13664a(interfaceC10250b);
                        return true;
                    }
                } finally {
                }
            }
        }
        interfaceC10250b.dispose();
        return false;
    }

    @Override // p310y6.InterfaceC10666a
    /* renamed from: c */
    public boolean mo19202c(InterfaceC10250b interfaceC10250b) {
        if (!mo19200a(interfaceC10250b)) {
            return false;
        }
        interfaceC10250b.dispose();
        return true;
    }

    /* renamed from: d */
    public void m19203d() {
        if (this.f20489b) {
            return;
        }
        synchronized (this) {
            try {
                if (this.f20489b) {
                    return;
                }
                C8371d c8371d = this.f20488a;
                this.f20488a = null;
                m19204e(c8371d);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p277v6.InterfaceC10250b
    public void dispose() {
        if (this.f20489b) {
            return;
        }
        synchronized (this) {
            try {
                if (this.f20489b) {
                    return;
                }
                this.f20489b = true;
                C8371d c8371d = this.f20488a;
                this.f20488a = null;
                m19204e(c8371d);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: e */
    public void m19204e(C8371d c8371d) {
        if (c8371d == null) {
            return;
        }
        ArrayList arrayList = null;
        for (Object obj : c8371d.m13665b()) {
            if (obj instanceof InterfaceC10250b) {
                try {
                    ((InterfaceC10250b) obj).dispose();
                } catch (Throwable th) {
                    AbstractC10359a.m19297b(th);
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(th);
                }
            }
        }
        if (arrayList != null) {
            if (arrayList.size() != 1) {
                throw new CompositeException(arrayList);
            }
            throw ExceptionHelper.m15580c((Throwable) arrayList.get(0));
        }
    }

    @Override // p277v6.InterfaceC10250b
    public boolean isDisposed() {
        return this.f20489b;
    }
}
