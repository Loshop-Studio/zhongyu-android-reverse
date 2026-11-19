package androidx.work;

import androidx.work.C0810a;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import p169x0.AbstractC3443l;

/* loaded from: classes.dex */
public final class OverwritingInputMerger extends AbstractC3443l {
    @Override // p169x0.AbstractC3443l
    /* renamed from: b */
    public C0810a mo4121b(List<C0810a> list) {
        C0810a.a aVar = new C0810a.a();
        HashMap map = new HashMap();
        Iterator<C0810a> it = list.iterator();
        while (it.hasNext()) {
            map.putAll(it.next().m4151i());
        }
        aVar.m4158d(map);
        return aVar.m4155a();
    }
}
