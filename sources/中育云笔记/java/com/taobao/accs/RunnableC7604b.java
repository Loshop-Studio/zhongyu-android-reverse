package com.taobao.accs;

import android.app.Notification;
import com.taobao.accs.ChannelService;
import com.taobao.accs.utl.ALog;

/* renamed from: com.taobao.accs.b */
/* loaded from: classes5.dex */
class RunnableC7604b implements Runnable {

    /* renamed from: a */
    final /* synthetic */ ChannelService.KernelService f12899a;

    public RunnableC7604b(ChannelService.KernelService kernelService) {
        this.f12899a = kernelService;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            ChannelService channelService = ChannelService.getInstance();
            int i10 = this.f12899a.f12889b.getPackageManager().getPackageInfo(this.f12899a.getPackageName(), 0).applicationInfo.icon;
            if (i10 != 0) {
                Notification.Builder builder = new Notification.Builder(this.f12899a.f12889b);
                builder.setSmallIcon(i10);
                channelService.startForeground(9371, builder.build());
                Notification.Builder builder2 = new Notification.Builder(this.f12899a.f12889b);
                builder2.setSmallIcon(i10);
                ChannelService.KernelService.f12888a.startForeground(9371, builder2.build());
                ChannelService.KernelService.f12888a.stopForeground(true);
            }
            ChannelService.KernelService.f12888a.stopSelf();
        } catch (Throwable th) {
            ALog.m10117e("ChannelService", " onStartCommand run", th, new Object[0]);
        }
    }
}
