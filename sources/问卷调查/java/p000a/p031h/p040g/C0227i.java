package p000a.p031h.p040g;

import java.util.ArrayList;
import p000a.p021e.C0136h;
import p000a.p031h.p040g.C0228j;
import p000a.p031h.p042i.InterfaceC0239a;

/* renamed from: a.h.g.i */
/* loaded from: classes.dex */
public class C0227i implements InterfaceC0239a<C0228j.a> {

    /* renamed from: a */
    public final /* synthetic */ String f1505a;

    public C0227i(String str) {
        this.f1505a = str;
    }

    @Override // p000a.p031h.p042i.InterfaceC0239a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void mo793a(C0228j.a aVar) {
        synchronized (C0228j.f1508c) {
            C0136h<String, ArrayList<InterfaceC0239a<C0228j.a>>> c0136h = C0228j.f1509d;
            ArrayList<InterfaceC0239a<C0228j.a>> arrayList = c0136h.get(this.f1505a);
            if (arrayList == null) {
                return;
            }
            c0136h.remove(this.f1505a);
            for (int i = 0; i < arrayList.size(); i++) {
                arrayList.get(i).mo793a(aVar);
            }
        }
    }
}
