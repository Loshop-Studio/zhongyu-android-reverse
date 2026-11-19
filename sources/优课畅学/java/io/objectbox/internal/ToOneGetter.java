package io.objectbox.internal;

import io.objectbox.relation.ToOne;
import java.io.Serializable;

/* loaded from: classes5.dex */
public interface ToOneGetter<SOURCE> extends Serializable {
    ToOne getToOne(Object obj);
}
