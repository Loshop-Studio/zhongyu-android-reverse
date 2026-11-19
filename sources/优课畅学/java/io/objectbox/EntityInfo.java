package io.objectbox;

import java.io.Serializable;
import p189n6.InterfaceC9429b;
import p189n6.InterfaceC9430c;

/* loaded from: classes5.dex */
public interface EntityInfo<T> extends Serializable {
    Property[] getAllProperties();

    InterfaceC9429b getCursorFactory();

    String getDbName();

    Class getEntityClass();

    int getEntityId();

    String getEntityName();

    InterfaceC9430c getIdGetter();
}
