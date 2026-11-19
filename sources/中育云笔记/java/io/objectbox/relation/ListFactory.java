package io.objectbox.relation;

import java.io.Serializable;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes6.dex */
public interface ListFactory extends Serializable {

    public static class CopyOnWriteArrayListFactory implements ListFactory {
        @Override // io.objectbox.relation.ListFactory
        /* renamed from: i */
        public List mo19016i() {
            return new CopyOnWriteArrayList();
        }
    }

    /* renamed from: i */
    List mo19016i();
}
