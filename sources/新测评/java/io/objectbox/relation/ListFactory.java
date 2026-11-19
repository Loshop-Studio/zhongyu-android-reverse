package io.objectbox.relation;

import java.io.Serializable;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes5.dex */
public interface ListFactory extends Serializable {

    public static class CopyOnWriteArrayListFactory implements ListFactory {
        @Override // io.objectbox.relation.ListFactory
        /* renamed from: d */
        public List mo13044d() {
            return new CopyOnWriteArrayList();
        }
    }

    /* renamed from: d */
    List mo13044d();
}
