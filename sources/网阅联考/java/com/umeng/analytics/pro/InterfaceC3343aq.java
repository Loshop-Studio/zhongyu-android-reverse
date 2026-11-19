package com.umeng.analytics.pro;

import com.umeng.analytics.pro.InterfaceC3343aq;
import com.umeng.analytics.pro.InterfaceC3350ax;
import java.io.Serializable;

/* renamed from: com.umeng.analytics.pro.aq */
/* loaded from: classes2.dex */
public interface InterfaceC3343aq<T extends InterfaceC3343aq<?, ?>, F extends InterfaceC3350ax> extends Serializable {
    void clear();

    InterfaceC3343aq<T, F> deepCopy();

    F fieldForId(int i4);

    void read(AbstractC3369bp abstractC3369bp) throws C3349aw;

    void write(AbstractC3369bp abstractC3369bp) throws C3349aw;
}
