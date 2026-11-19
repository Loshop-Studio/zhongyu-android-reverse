package com.umeng.analytics.pro;

import com.umeng.analytics.pro.InterfaceC1859aq;
import com.umeng.analytics.pro.InterfaceC1866ax;
import java.io.Serializable;

/* renamed from: com.umeng.analytics.pro.aq */
/* loaded from: classes.dex */
public interface InterfaceC1859aq<T extends InterfaceC1859aq<?, ?>, F extends InterfaceC1866ax> extends Serializable {
    void clear();

    InterfaceC1859aq<T, F> deepCopy();

    F fieldForId(int i4);

    void read(AbstractC1885bp abstractC1885bp) throws C1865aw;

    void write(AbstractC1885bp abstractC1885bp) throws C1865aw;
}
