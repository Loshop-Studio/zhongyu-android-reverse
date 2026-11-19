package com.taobao.accs;

import android.app.Notification;
import com.taobao.accs.ChannelService;
import com.taobao.accs.utl.ALog;

/* renamed from: com.taobao.accs.b */
/* loaded from: classes.dex */
class RunnableC1707b implements Runnable {

    /* renamed from: a */
    final /* synthetic */ ChannelService.KernelService f7501a;

    RunnableC1707b(ChannelService.KernelService kernelService) {
        this.f7501a = kernelService;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            ChannelService channelService = ChannelService.getInstance();
            int i4 = this.f7501a.f7491b.getPackageManager().getPackageInfo(this.f7501a.getPackageName(), 0).applicationInfo.icon;
            if (i4 != 0) {
                Notification.Builder builder = new Notification.Builder(this.f7501a.f7491b);
                builder.setSmallIcon(i4);
                channelService.startForeground(9371, builder.build());
                Notification.Builder builder2 = new Notification.Builder(this.f7501a.f7491b);
                builder2.setSmallIcon(i4);
                ChannelService.KernelService.f7490a.startForeground(9371, builder2.build());
                ChannelService.KernelService.f7490a.stopForeground(true);
            }
            ChannelService.KernelService.f7490a.stopSelf();
        } catch (Throwable th) {
            ALog.m6091e("ChannelService", " onStartCommand run", th, new Object[0]);
        }
    }
}
