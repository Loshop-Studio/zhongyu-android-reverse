package p070b.p146d.p147a.p148b;

import android.content.Intent;
import android.util.Log;
import java.util.TimerTask;
import p070b.p071a.p072a.p073a.C0561a;
import p070b.p146d.p147a.p148b.EnumC0881b;

/* renamed from: b.d.a.b.e */
/* loaded from: classes.dex */
public final class C0884e extends TimerTask {

    /* renamed from: b */
    public final /* synthetic */ EnumC0881b.a f4722b;

    public C0884e(EnumC0881b.a aVar) {
        this.f4722b = aVar;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public void run() {
        StringBuilder sbM2079g = C0561a.m2079g("重启服务 1S后的超时任务启动");
        sbM2079g.append(System.currentTimeMillis());
        Log.d("MessageClient", sbM2079g.toString());
        Intent intent = new Intent("com.zykj.action.zykj.message.service");
        intent.setPackage("com.zykj.manage");
        if (EnumC0881b.a.m2583h(this.f4722b).bindService(intent, this.f4722b.f4698i, 1)) {
            return;
        }
        StringBuilder sbM2079g2 = C0561a.m2079g("服务没在运行？绑定失败了 ");
        sbM2079g2.append(System.currentTimeMillis());
        Log.e("MessageClient", sbM2079g2.toString());
        this.f4722b.f4699j.sendEmptyMessage(2);
    }
}
