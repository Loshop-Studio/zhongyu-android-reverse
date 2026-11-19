package io.objectbox.relation;

import java.io.Serializable;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes5.dex */
public interface ListFactory extends Serializable {

    public static class CopyOnWriteArrayListFactory implements ListFactory {
        @Override // io.objectbox.relation.ListFactory
        /* renamed from: f */
        public List mo15491f() {
            return new CopyOnWriteArrayList();
        }
    }

    /* renamed from: f */
    List mo15491f();
}
