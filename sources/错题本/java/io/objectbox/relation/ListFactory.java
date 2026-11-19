package io.objectbox.relation;

import io.objectbox.annotation.apihint.Experimental;
import java.io.Serializable;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

@Experimental
/* loaded from: classes3.dex */
public interface ListFactory extends Serializable {

    public static class CopyOnWriteArrayListFactory implements ListFactory {
        private static final long serialVersionUID = 1888039726372206411L;

        @Override // io.objectbox.relation.ListFactory
        public <T> List<T> createList() {
            return new CopyOnWriteArrayList();
        }
    }

    <T> List<T> createList();
}
