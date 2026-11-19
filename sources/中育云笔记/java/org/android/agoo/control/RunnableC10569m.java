package org.android.agoo.control;

import anet.channel.request.Request;
import com.taobao.accs.ACCSManager;
import com.taobao.accs.IACCSManager;
import com.taobao.accs.base.TaoBaseService;
import com.taobao.accs.utl.ALog;
import com.taobao.accs.utl.AdapterUtilityImpl;
import com.taobao.accs.utl.UTMini;
import java.util.HashMap;
import org.android.agoo.common.AgooConstants;
import org.android.agoo.common.Config;
import org.json.JSONObject;

/* renamed from: org.android.agoo.control.m */
/* loaded from: classes6.dex */
class RunnableC10569m implements Runnable {

    /* renamed from: a */
    final /* synthetic */ String f25337a;

    /* renamed from: b */
    final /* synthetic */ String f25338b;

    /* renamed from: c */
    final /* synthetic */ String f25339c;

    /* renamed from: d */
    final /* synthetic */ String f25340d;

    /* renamed from: e */
    final /* synthetic */ boolean f25341e;

    /* renamed from: f */
    final /* synthetic */ NotifManager f25342f;

    public RunnableC10569m(NotifManager notifManager, String str, String str2, String str3, String str4, boolean z10) {
        this.f25342f = notifManager;
        this.f25337a = str;
        this.f25338b = str2;
        this.f25339c = str3;
        this.f25340d = str4;
        this.f25341e = z10;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            HashMap map = new HashMap();
            String str = this.f25337a;
            if (str != null) {
                map.put("sdkVer", str);
            }
            map.put("thirdTokenType", this.f25338b);
            map.put("token", this.f25339c);
            map.put("appkey", Config.m22234b(NotifManager.mContext));
            map.put("utdid", AdapterUtilityImpl.getDeviceId(NotifManager.mContext));
            String str2 = this.f25340d;
            if (str2 != null) {
                map.put("vendorSdkVersion", str2);
            }
            ALog.m10116d("NotifManager", "report,utdid=" + AdapterUtilityImpl.getDeviceId(NotifManager.mContext) + ",regId=" + this.f25339c + ",type=" + this.f25338b + " sdkVer=" + this.f25337a + " thirdVer=" + this.f25340d, new Object[0]);
            ACCSManager.AccsRequest accsRequest = new ACCSManager.AccsRequest(null, "agooTokenReport", new JSONObject(map).toString().getBytes(Request.DEFAULT_CHARSET), null, null, null, null);
            IACCSManager accsInstance = ACCSManager.getAccsInstance(NotifManager.mContext, Config.m22234b(NotifManager.mContext), Config.m22238d(NotifManager.mContext));
            String strSendData = this.f25341e ? accsInstance.sendData(NotifManager.mContext, accsRequest) : accsInstance.sendPushResponse(NotifManager.mContext, accsRequest, new TaoBaseService.ExtraInfo());
            if (ALog.isPrintLog(ALog.Level.D)) {
                ALog.m10119i("NotifManager", "reportThirdPushToken,dataId=" + strSendData + ",regId=" + this.f25339c + ",type=" + this.f25338b, new Object[0]);
            }
        } catch (Throwable th) {
            UTMini.getInstance().commitEvent(AgooConstants.AGOO_EVENT_ID, "reportThirdPushToken", AdapterUtilityImpl.getDeviceId(NotifManager.mContext), th.toString());
            if (ALog.isPrintLog(ALog.Level.E)) {
                ALog.m10117e("NotifManager", "[report] is error", th, new Object[0]);
            }
        }
    }
}
