package com.friday.common.helper;

import com.alibaba.sdk.android.push.CloudPushService;
import com.alibaba.sdk.android.push.CommonCallback;
import com.alibaba.sdk.android.push.noonesdk.PushServiceFactory;
import com.blankj.utilcode.util.LogUtils;

/* renamed from: com.friday.common.helper.a */
/* loaded from: classes3.dex */
public final class C5961a {

    /* renamed from: a */
    public static final C5961a f6080a = new C5961a();

    /* renamed from: com.friday.common.helper.a$a */
    public static final class a implements CommonCallback {

        /* renamed from: a */
        public final /* synthetic */ String f6081a;

        public a(String str) {
            this.f6081a = str;
        }

        @Override // com.alibaba.sdk.android.push.CommonCallback
        public void onFailed(String str, String str2) {
            LogUtils.m3887e("页面 AliPushBindHelper.kt -> bindAccount，阿里云推送账号绑定失败，account=" + this.f6081a + "，errorCode=" + str + "，errorMessage=" + str2);
        }

        @Override // com.alibaba.sdk.android.push.CommonCallback
        public void onSuccess(String str) {
            LogUtils.m3888i("页面 AliPushBindHelper.kt -> bindAccount，阿里云推送账号绑定成功，account=" + this.f6081a + "，response=" + str);
        }
    }

    /* renamed from: a */
    public final void m5259a() {
        m5260b(C5962b.f6082a.m5299a().m5292t());
    }

    /* renamed from: b */
    public final void m5260b(long j10) {
        if (j10 <= 0) {
            LogUtils.m3888i("页面 AliPushBindHelper.kt -> bindUserId，userId为空，跳过阿里云推送绑定");
            return;
        }
        String strValueOf = String.valueOf(j10);
        CloudPushService cloudPushService = PushServiceFactory.getCloudPushService();
        LogUtils.m3888i("页面 AliPushBindHelper.kt -> bindUserId，开始绑定阿里云推送账号，account=" + strValueOf + "，deviceId=" + cloudPushService.getDeviceId());
        cloudPushService.bindAccount(strValueOf, new a(strValueOf));
    }
}
