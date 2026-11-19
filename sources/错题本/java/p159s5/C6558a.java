package p159s5;

import io.reactivex.exceptions.CompositeException;
import io.reactivex.internal.util.AbstractC5729a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import p073h4.AbstractC5625a;
import p176u5.InterfaceC6621a;
import p213z5.C6822a;

/* renamed from: s5.a */
/* loaded from: classes3.dex */
public final class C6558a implements InterfaceC6559b, InterfaceC6621a {

    /* renamed from: a */
    public final /* synthetic */ int f10960a;

    /* renamed from: b */
    public volatile boolean f10961b;

    /* renamed from: c */
    public Object f10962c;

    public /* synthetic */ C6558a(int i) {
        this.f10960a = i;
    }

    @Override // p176u5.InterfaceC6621a
    /* renamed from: a */
    public final boolean mo6200a(InterfaceC6559b interfaceC6559b) {
        switch (this.f10960a) {
            case 0:
                if (!this.f10961b) {
                    synchronized (this) {
                        try {
                            if (!this.f10961b) {
                                C6822a c6822a = (C6822a) this.f10962c;
                                if (c6822a == null) {
                                    c6822a = new C6822a();
                                    int iNumberOfLeadingZeros = 1 << (32 - Integer.numberOfLeadingZeros(15));
                                    c6822a.f11557a = iNumberOfLeadingZeros - 1;
                                    c6822a.f11559c = (int) (0.75f * iNumberOfLeadingZeros);
                                    c6822a.f11560d = new Object[iNumberOfLeadingZeros];
                                    this.f10962c = c6822a;
                                }
                                c6822a.m6484a(interfaceC6559b);
                                return true;
                            }
                        } finally {
                        }
                    }
                }
                interfaceC6559b.dispose();
                return false;
            default:
                if (!this.f10961b) {
                    synchronized (this) {
                        try {
                            if (!this.f10961b) {
                                LinkedList linkedList = (LinkedList) this.f10962c;
                                if (linkedList == null) {
                                    linkedList = new LinkedList();
                                    this.f10962c = linkedList;
                                }
                                linkedList.add(interfaceC6559b);
                                return true;
                            }
                        } finally {
                        }
                    }
                }
                interfaceC6559b.dispose();
                return false;
        }
    }

    @Override // p176u5.InterfaceC6621a
    /* renamed from: b */
    public final boolean mo6201b(InterfaceC6559b interfaceC6559b) {
        Object obj;
        switch (this.f10960a) {
            case 0:
                if (this.f10961b) {
                    return false;
                }
                synchronized (this) {
                    try {
                        if (this.f10961b) {
                            return false;
                        }
                        C6822a c6822a = (C6822a) this.f10962c;
                        if (c6822a != null) {
                            Object[] objArr = c6822a.f11560d;
                            int i = c6822a.f11557a;
                            int iHashCode = interfaceC6559b.hashCode() * (-1640531527);
                            int i8 = (iHashCode ^ (iHashCode >>> 16)) & i;
                            Object obj2 = objArr[i8];
                            if (obj2 != null) {
                                if (obj2.equals(interfaceC6559b)) {
                                    c6822a.m6485b(i8, i, objArr);
                                } else {
                                    do {
                                        i8 = (i8 + 1) & i;
                                        obj = objArr[i8];
                                        if (obj == null) {
                                        }
                                    } while (!obj.equals(interfaceC6559b));
                                    c6822a.m6485b(i8, i, objArr);
                                }
                                return true;
                            }
                        }
                        return false;
                    } finally {
                    }
                }
            default:
                boolean z8 = false;
                if (!this.f10961b) {
                    synchronized (this) {
                        try {
                            if (!this.f10961b) {
                                LinkedList linkedList = (LinkedList) this.f10962c;
                                if (linkedList != null && linkedList.remove(interfaceC6559b)) {
                                    z8 = true;
                                }
                            }
                        } finally {
                        }
                    }
                }
                return z8;
        }
    }

    @Override // p176u5.InterfaceC6621a
    /* renamed from: c */
    public final boolean mo6202c(InterfaceC6559b interfaceC6559b) {
        switch (this.f10960a) {
            case 0:
                if (mo6201b(interfaceC6559b)) {
                    interfaceC6559b.dispose();
                    break;
                }
                break;
            default:
                if (mo6201b(interfaceC6559b)) {
                    interfaceC6559b.dispose();
                    break;
                }
                break;
        }
        return true;
    }

    @Override // p159s5.InterfaceC6559b
    public final void dispose() {
        switch (this.f10960a) {
            case 0:
                if (this.f10961b) {
                    return;
                }
                synchronized (this) {
                    try {
                        if (!this.f10961b) {
                            this.f10961b = true;
                            C6822a c6822a = (C6822a) this.f10962c;
                            ArrayList arrayList = null;
                            this.f10962c = null;
                            if (c6822a != null) {
                                for (Object obj : c6822a.f11560d) {
                                    if (obj instanceof InterfaceC6559b) {
                                        try {
                                            ((InterfaceC6559b) obj).dispose();
                                        } catch (Throwable th) {
                                            AbstractC5625a.m4956p(th);
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
                                    throw AbstractC5729a.m5089a((Throwable) arrayList.get(0));
                                }
                            }
                        }
                    } finally {
                    }
                }
                return;
            default:
                if (this.f10961b) {
                    return;
                }
                synchronized (this) {
                    try {
                        if (!this.f10961b) {
                            this.f10961b = true;
                            LinkedList linkedList = (LinkedList) this.f10962c;
                            ArrayList arrayList2 = null;
                            this.f10962c = null;
                            if (linkedList != null) {
                                Iterator it = linkedList.iterator();
                                while (it.hasNext()) {
                                    try {
                                        ((InterfaceC6559b) it.next()).dispose();
                                    } catch (Throwable th2) {
                                        AbstractC5625a.m4956p(th2);
                                        if (arrayList2 == null) {
                                            arrayList2 = new ArrayList();
                                        }
                                        arrayList2.add(th2);
                                    }
                                }
                                if (arrayList2 != null) {
                                    if (arrayList2.size() != 1) {
                                        throw new CompositeException(arrayList2);
                                    }
                                    throw AbstractC5729a.m5089a((Throwable) arrayList2.get(0));
                                }
                            }
                        }
                    } finally {
                    }
                }
                return;
        }
    }
}
