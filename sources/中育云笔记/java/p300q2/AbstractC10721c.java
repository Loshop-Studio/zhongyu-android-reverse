package p300q2;

import android.content.Context;
import android.content.Intent;
import com.alibaba.sdk.android.push.MessageReceiver;
import com.friday.document.receiver.AliMessageReceiver;
import p120dc.AbstractC9019e;
import p151fc.AbstractC9222e;

/* renamed from: q2.c */
/* loaded from: classes3.dex */
public abstract class AbstractC10721c extends MessageReceiver {

    /* renamed from: c */
    public volatile boolean f25794c = false;

    /* renamed from: d */
    public final Object f25795d = new Object();

    /* renamed from: a */
    public void m22712a(Context context) {
        if (this.f25794c) {
            return;
        }
        synchronized (this.f25795d) {
            try {
                if (!this.f25794c) {
                    ((InterfaceC10719a) AbstractC9019e.m17618a(context)).mo22710a((AliMessageReceiver) AbstractC9222e.m18141a(this));
                    this.f25794c = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.alibaba.sdk.android.push.MessageReceiver, p038c0.AbstractC5206b, android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        m22712a(context);
        super.onReceive(context, intent);
    }
}
