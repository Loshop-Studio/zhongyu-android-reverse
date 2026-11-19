package p038c0;

import android.app.Notification;
import android.content.Context;
import android.text.TextUtils;
import com.alibaba.sdk.android.logger.ILog;
import java.util.Map;
import org.android.agoo.common.AgooConstants;
import p124e0.C9061a;
import p124e0.C9062b;

/* renamed from: c0.k */
/* loaded from: classes3.dex */
public final class C5215k implements InterfaceC5217m {

    /* renamed from: a */
    public final /* synthetic */ Map f3090a;

    /* renamed from: b */
    public final /* synthetic */ C9061a f3091b;

    /* renamed from: c */
    public final /* synthetic */ C9062b f3092c;

    /* renamed from: d */
    public final /* synthetic */ Context f3093d;

    /* renamed from: e */
    public final /* synthetic */ InterfaceC5208d f3094e;

    public C5215k(Map map, C9061a c9061a, C9062b c9062b, Context context, InterfaceC5208d interfaceC5208d) {
        this.f3090a = map;
        this.f3091b = c9061a;
        this.f3092c = c9062b;
        this.f3093d = context;
        this.f3094e = interfaceC5208d;
    }

    @Override // p038c0.InterfaceC5217m
    /* renamed from: a */
    public void mo2778a(Notification notification, Notification notification2) {
        String str = (String) this.f3090a.get(AgooConstants.MESSAGE_BODY_EMAS_GROUP);
        if (!TextUtils.isEmpty(str)) {
            this.f3091b.m17799C(str);
        }
        ILog iLog = AbstractC5218n.f3101a;
        iLog.mo3533d("push created notification" + this.f3091b.m17808e());
        this.f3092c.m17833d(this.f3093d, notification, notification2, this.f3091b);
        iLog.mo3533d("push onNotificationShow " + this.f3091b.m17808e());
        this.f3094e.onNotificationShow(this.f3093d, this.f3091b.m17808e(), this.f3091b.m17811h(), this.f3091b.m17815l());
    }
}
