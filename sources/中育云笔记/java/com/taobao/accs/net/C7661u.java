package com.taobao.accs.net;

import android.content.Context;
import com.taobao.accs.common.ThreadPoolExecutorFactory;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* renamed from: com.taobao.accs.net.u */
/* loaded from: classes5.dex */
public class C7661u extends AbstractC7646f {

    /* renamed from: c */
    private ScheduledFuture<?> f13125c;

    public C7661u(Context context) {
        super(context);
    }

    @Override // com.taobao.accs.net.AbstractC7646f
    /* renamed from: a */
    public void mo10013a(int i10) {
        ScheduledFuture<?> scheduledFuture = this.f13125c;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(true);
            this.f13125c = null;
        }
        long j10 = i10;
        this.f13125c = ThreadPoolExecutorFactory.getScheduledExecutor().scheduleAtFixedRate(new RunnableC7662v(this), j10, j10, TimeUnit.SECONDS);
    }
}
