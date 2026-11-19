package p310y6;

import io.reactivex.exceptions.CompositeException;
import io.reactivex.internal.util.ExceptionHelper;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import p277v6.InterfaceC10250b;
import p288w6.AbstractC10359a;
import p321z6.AbstractC10726b;

/* renamed from: y6.b */
/* loaded from: classes5.dex */
public final class C10667b implements InterfaceC10250b, InterfaceC10666a {

    /* renamed from: a */
    public List f21113a;

    /* renamed from: b */
    public volatile boolean f21114b;

    @Override // p310y6.InterfaceC10666a
    /* renamed from: a */
    public boolean mo19200a(InterfaceC10250b interfaceC10250b) {
        AbstractC10726b.m20030c(interfaceC10250b, "Disposable item is null");
        if (this.f21114b) {
            return false;
        }
        synchronized (this) {
            try {
                if (this.f21114b) {
                    return false;
                }
                List list = this.f21113a;
                if (list != null && list.remove(interfaceC10250b)) {
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
        if (!this.f21114b) {
            synchronized (this) {
                try {
                    if (!this.f21114b) {
                        List linkedList = this.f21113a;
                        if (linkedList == null) {
                            linkedList = new LinkedList();
                            this.f21113a = linkedList;
                        }
                        linkedList.add(interfaceC10250b);
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
    public void m19812d(List list) {
        if (list == null) {
            return;
        }
        Iterator it = list.iterator();
        ArrayList arrayList = null;
        while (it.hasNext()) {
            try {
                ((InterfaceC10250b) it.next()).dispose();
            } catch (Throwable th) {
                AbstractC10359a.m19297b(th);
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(th);
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
    public void dispose() {
        if (this.f21114b) {
            return;
        }
        synchronized (this) {
            try {
                if (this.f21114b) {
                    return;
                }
                this.f21114b = true;
                List list = this.f21113a;
                this.f21113a = null;
                m19812d(list);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p277v6.InterfaceC10250b
    public boolean isDisposed() {
        return this.f21114b;
    }
}
