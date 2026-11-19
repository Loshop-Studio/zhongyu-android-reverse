package com.bumptech.glide.load.data;

import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;

/* renamed from: com.bumptech.glide.load.data.d */
/* loaded from: classes3.dex */
public interface InterfaceC5824d {

    /* renamed from: com.bumptech.glide.load.data.d$a */
    public interface a {
        /* renamed from: b */
        void mo4062b(Exception exc);

        /* renamed from: d */
        void mo4063d(Object obj);
    }

    /* renamed from: a */
    Class mo4051a();

    /* renamed from: c */
    void mo4057c(Priority priority, a aVar);

    void cancel();

    void cleanup();

    DataSource getDataSource();
}
