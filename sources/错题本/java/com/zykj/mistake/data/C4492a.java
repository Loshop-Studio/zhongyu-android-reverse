package com.zykj.mistake.data;

import com.zykj.mistake.entity.req.AddItemsToCollectionReq;
import com.zykj.mistake.entity.req.CreateOrUpdateCollectionReq;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import kotlin.collections.AbstractC5785e0;
import kotlin.collections.AbstractC5806u;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p098k4.C5755a;

/* renamed from: com.zykj.mistake.data.a */
/* loaded from: classes3.dex */
public final class C4492a {

    /* renamed from: a */
    public final C5755a f6002a;

    public C4492a(int i) {
        switch (i) {
            case 1:
                this.f6002a = new C5755a(0);
                break;
            default:
                this.f6002a = new C5755a(0);
                break;
        }
    }

    /* renamed from: a */
    public Object m3971a(List list, List list2, SuspendLambda suspendLambda) {
        ArrayList arrayList = new ArrayList(AbstractC5806u.m5277p(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new Integer(Integer.parseInt((String) it.next())));
        }
        return this.f6002a.m5095a().m4416h(new AddItemsToCollectionReq(list2, arrayList), suspendLambda);
    }

    /* renamed from: b */
    public Object m3972b(int i, String str, SuspendLambda suspendLambda) {
        return this.f6002a.m5095a().m4415g(new CreateOrUpdateCollectionReq(i, str), suspendLambda);
    }

    /* renamed from: c */
    public Object m3973c(List list, List list2, List list3, Set set, SuspendLambda suspendLambda) {
        int iM5149C = AbstractC5785e0.m5149C(AbstractC5806u.m5277p(list3, 10));
        if (iM5149C < 16) {
            iM5149C = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iM5149C);
        for (Object obj : list3) {
            linkedHashMap.put(((C4494c) obj).f6007a, obj);
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            C4494c c4494c = (C4494c) linkedHashMap.get(str);
            if (c4494c != null && !set.contains(str)) {
                if (list2.size() + c4494c.f6009c > c4494c.f6010d) {
                    throw new CollectionLimitException();
                }
            }
        }
        ArrayList arrayList = new ArrayList(AbstractC5806u.m5277p(list, 10));
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList.add(new Integer(Integer.parseInt((String) it2.next())));
        }
        return this.f6002a.m5095a().m4405B(new AddItemsToCollectionReq(list2, arrayList), suspendLambda);
    }
}
