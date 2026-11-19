package p170v3;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.zykj.huiwei.launcher.receiver.LogoutReceiver;
import p185x4.AbstractC7860e;
import p199z4.AbstractC7951e;

/* renamed from: v3.a */
/* loaded from: classes4.dex */
public abstract class AbstractC7792a extends BroadcastReceiver {

    /* renamed from: a */
    public volatile boolean f10352a = false;

    /* renamed from: b */
    public final Object f10353b = new Object();

    /* renamed from: a */
    public void m9363a(Context context) {
        if (this.f10352a) {
            return;
        }
        synchronized (this.f10353b) {
            try {
                if (!this.f10352a) {
                    ((InterfaceC7793b) AbstractC7860e.m9535a(context)).mo5255d((LogoutReceiver) AbstractC7951e.m9749a(this));
                    this.f10352a = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        m9363a(context);
    }
}
