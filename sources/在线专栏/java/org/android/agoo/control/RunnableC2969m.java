package org.android.agoo.control;

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
/* loaded from: classes.dex */
class RunnableC2969m implements Runnable {

    /* renamed from: a */
    final /* synthetic */ String f11455a;

    /* renamed from: b */
    final /* synthetic */ String f11456b;

    /* renamed from: c */
    final /* synthetic */ String f11457c;

    /* renamed from: d */
    final /* synthetic */ String f11458d;

    /* renamed from: e */
    final /* synthetic */ boolean f11459e;

    /* renamed from: f */
    final /* synthetic */ NotifManager f11460f;

    RunnableC2969m(NotifManager notifManager, String str, String str2, String str3, String str4, boolean z3) {
        this.f11460f = notifManager;
        this.f11455a = str;
        this.f11456b = str2;
        this.f11457c = str3;
        this.f11458d = str4;
        this.f11459e = z3;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            HashMap map = new HashMap();
            String str = this.f11455a;
            if (str != null) {
                map.put("sdkVer", str);
            }
            map.put("thirdTokenType", this.f11456b);
            map.put("token", this.f11457c);
            map.put("appkey", Config.m10016b(NotifManager.mContext));
            map.put("utdid", AdapterUtilityImpl.getDeviceId(NotifManager.mContext));
            String str2 = this.f11458d;
            if (str2 != null) {
                map.put("vendorSdkVersion", str2);
            }
            ALog.m6090d("NotifManager", "report,utdid=" + AdapterUtilityImpl.getDeviceId(NotifManager.mContext) + ",regId=" + this.f11457c + ",type=" + this.f11456b + " sdkVer=" + this.f11455a + " thirdVer=" + this.f11458d, new Object[0]);
            ACCSManager.AccsRequest accsRequest = new ACCSManager.AccsRequest(null, "agooTokenReport", new JSONObject(map).toString().getBytes("UTF-8"), null, null, null, null);
            IACCSManager accsInstance = ACCSManager.getAccsInstance(NotifManager.mContext, Config.m10016b(NotifManager.mContext), Config.m10020d(NotifManager.mContext));
            String strSendData = this.f11459e ? accsInstance.sendData(NotifManager.mContext, accsRequest) : accsInstance.sendPushResponse(NotifManager.mContext, accsRequest, new TaoBaseService.ExtraInfo());
            if (ALog.isPrintLog(ALog.Level.D)) {
                ALog.m6093i("NotifManager", "reportThirdPushToken,dataId=" + strSendData + ",regId=" + this.f11457c + ",type=" + this.f11456b, new Object[0]);
            }
        } catch (Throwable th) {
            UTMini.getInstance().commitEvent(AgooConstants.AGOO_EVENT_ID, "reportThirdPushToken", AdapterUtilityImpl.getDeviceId(NotifManager.mContext), th.toString());
            if (ALog.isPrintLog(ALog.Level.E)) {
                ALog.m6091e("NotifManager", "[report] is error", th, new Object[0]);
            }
        }
    }
}
