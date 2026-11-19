package anetwork.channel.unified;

import androidx.core.app.NotificationCompat;
import anet.channel.RequestCb;
import anet.channel.bytes.ByteArray;
import anet.channel.statist.RequestStatistic;
import anet.channel.util.ALog;
import anet.channel.util.HttpHelper;
import anetwork.channel.aidl.DefaultFinishEvent;
import anetwork.channel.cookie.CookieManager;
import com.taobao.accs.common.Constants;
import java.util.List;
import java.util.Map;

/* renamed from: anetwork.channel.unified.c */
/* loaded from: classes3.dex */
class C5125c implements RequestCb {

    /* renamed from: a */
    final /* synthetic */ C5124b f2924a;

    public C5125c(C5124b c5124b) {
        this.f2924a = c5124b;
    }

    @Override // anet.channel.RequestCb
    public void onDataReceive(ByteArray byteArray, boolean z10) {
        if (this.f2924a.f2920c.f2963d.get()) {
            return;
        }
        C5124b.m2631b(this.f2924a);
        if (this.f2924a.f2920c.f2961b != null) {
            this.f2924a.f2920c.f2961b.onDataReceiveSize(this.f2924a.f2922e, this.f2924a.f2921d, byteArray);
        }
    }

    @Override // anet.channel.RequestCb
    public void onFinish(int i10, String str, RequestStatistic requestStatistic) {
        if (this.f2924a.f2920c.f2963d.getAndSet(true)) {
            return;
        }
        if (ALog.isPrintLog(2)) {
            ALog.m2530i("anet.DegradeTask", "[onFinish]", this.f2924a.f2920c.f2962c, Constants.KEY_HTTP_CODE, Integer.valueOf(i10), NotificationCompat.CATEGORY_MESSAGE, str);
        }
        this.f2924a.f2920c.m2648a();
        requestStatistic.isDone.set(true);
        if (this.f2924a.f2920c.f2961b != null) {
            this.f2924a.f2920c.f2961b.onFinish(new DefaultFinishEvent(i10, str, this.f2924a.f2923f));
        }
    }

    @Override // anet.channel.RequestCb
    public void onResponseCode(int i10, Map<String, List<String>> map) {
        if (this.f2924a.f2920c.f2963d.get()) {
            return;
        }
        this.f2924a.f2920c.m2648a();
        CookieManager.setCookie(this.f2924a.f2920c.f2960a.m2624g(), map);
        this.f2924a.f2921d = HttpHelper.parseContentLength(map);
        if (this.f2924a.f2920c.f2961b != null) {
            this.f2924a.f2920c.f2961b.onResponseCode(i10, map);
        }
    }
}
