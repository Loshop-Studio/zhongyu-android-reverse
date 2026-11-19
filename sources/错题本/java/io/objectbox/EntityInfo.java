package io.objectbox;

import io.objectbox.annotation.apihint.Internal;
import java.io.Serializable;
import p116m5.InterfaceC6109a;
import p116m5.InterfaceC6110b;

@Internal
/* loaded from: classes3.dex */
public interface EntityInfo<T> extends Serializable {
    Property<T>[] getAllProperties();

    InterfaceC6109a getCursorFactory();

    String getDbName();

    Class<T> getEntityClass();

    int getEntityId();

    String getEntityName();

    InterfaceC6110b getIdGetter();

    Property<T> getIdProperty();
}
