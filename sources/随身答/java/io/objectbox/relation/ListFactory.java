package io.objectbox.relation;

import java.io.Serializable;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes5.dex */
public interface ListFactory extends Serializable {

    public static class CopyOnWriteArrayListFactory implements ListFactory {
        @Override // io.objectbox.relation.ListFactory
        /* renamed from: e */
        public List mo13163e() {
            return new CopyOnWriteArrayList();
        }
    }

    /* renamed from: e */
    List mo13163e();
}
