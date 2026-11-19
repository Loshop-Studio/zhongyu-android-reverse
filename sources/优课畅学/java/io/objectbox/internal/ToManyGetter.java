package io.objectbox.internal;

import java.io.Serializable;
import java.util.List;

/* loaded from: classes5.dex */
public interface ToManyGetter<SOURCE> extends Serializable {
    List getToMany(Object obj);
}
