package p038c0;

import android.app.Notification;
import android.content.Context;
import android.os.Handler;
import android.text.TextUtils;
import java.util.Map;

/* renamed from: c0.i */
/* loaded from: classes3.dex */
public final class RunnableC5213i implements Runnable {

    /* renamed from: c */
    public final /* synthetic */ InterfaceC5209e f3080c;

    /* renamed from: d */
    public final /* synthetic */ Context f3081d;

    /* renamed from: e */
    public final /* synthetic */ Map f3082e;

    /* renamed from: f */
    public final /* synthetic */ String f3083f;

    /* renamed from: g */
    public final /* synthetic */ boolean f3084g;

    /* renamed from: h */
    public final /* synthetic */ Handler f3085h;

    /* renamed from: i */
    public final /* synthetic */ InterfaceC5217m f3086i;

    public RunnableC5213i(InterfaceC5209e interfaceC5209e, Context context, Map map, String str, boolean z10, Handler handler, InterfaceC5217m interfaceC5217m) {
        this.f3080c = interfaceC5209e;
        this.f3081d = context;
        this.f3082e = map;
        this.f3083f = str;
        this.f3084g = z10;
        this.f3085h = handler;
        this.f3086i = interfaceC5217m;
    }

    @Override // java.lang.Runnable
    public void run() {
        Notification notificationCustomNotificationUI = this.f3080c.customNotificationUI(this.f3081d, this.f3082e);
        Notification notificationCustomSummaryNotification = (!TextUtils.isEmpty(this.f3083f) || this.f3084g) ? this.f3080c.customSummaryNotification(this.f3081d, this.f3082e) : null;
        Handler handler = this.f3085h;
        if (handler != null) {
            handler.post(new RunnableC5214j(this, notificationCustomNotificationUI, notificationCustomSummaryNotification));
        } else {
            this.f3086i.mo2778a(notificationCustomNotificationUI, notificationCustomSummaryNotification);
        }
    }
}
