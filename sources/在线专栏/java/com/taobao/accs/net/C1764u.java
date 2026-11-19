package com.taobao.accs.net;

import android.content.Context;
import com.taobao.accs.common.ThreadPoolExecutorFactory;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* renamed from: com.taobao.accs.net.u */
/* loaded from: classes.dex */
public class C1764u extends AbstractC1749f {

    /* renamed from: c */
    private ScheduledFuture<?> f7727c;

    protected C1764u(Context context) {
        super(context);
    }

    @Override // com.taobao.accs.net.AbstractC1749f
    /* renamed from: a */
    protected void mo5987a(int i4) {
        ScheduledFuture<?> scheduledFuture = this.f7727c;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(true);
            this.f7727c = null;
        }
        long j4 = i4;
        this.f7727c = ThreadPoolExecutorFactory.getScheduledExecutor().scheduleAtFixedRate(new RunnableC1765v(this), j4, j4, TimeUnit.SECONDS);
    }
}
