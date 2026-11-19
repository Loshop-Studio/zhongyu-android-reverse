package p441ze;

import java.util.EventListener;
import java.util.Iterator;
import org.apache.commons.net.util.ListenerList;

/* renamed from: ze.b */
/* loaded from: classes6.dex */
public class C12052b implements InterfaceC12053c {

    /* renamed from: a */
    public final ListenerList f28437a = new ListenerList();

    @Override // p441ze.InterfaceC12053c
    /* renamed from: a */
    public void mo26412a(long j10, int i10, long j11) {
        Iterator<EventListener> it = this.f28437a.iterator();
        while (it.hasNext()) {
            ((InterfaceC12053c) it.next()).mo26412a(j10, i10, j11);
        }
    }

    /* renamed from: b */
    public void m26694b(InterfaceC12053c interfaceC12053c) {
        this.f28437a.m22267a(interfaceC12053c);
    }
}
