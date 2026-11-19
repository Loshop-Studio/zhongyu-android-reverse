package io.objectbox.relation;

import java.util.Comparator;
import p116m5.InterfaceC6110b;

/* renamed from: io.objectbox.relation.a */
/* loaded from: classes3.dex */
public final class C5703a implements Comparator {

    /* renamed from: a */
    public InterfaceC6110b f8991a;

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        InterfaceC6110b interfaceC6110b = this.f8991a;
        long id = interfaceC6110b.getId(obj);
        long id2 = interfaceC6110b.getId(obj2);
        if (id == 0) {
            id = Long.MAX_VALUE;
        }
        if (id2 == 0) {
            id2 = Long.MAX_VALUE;
        }
        long j7 = id - id2;
        if (j7 < 0) {
            return -1;
        }
        return j7 > 0 ? 1 : 0;
    }
}
