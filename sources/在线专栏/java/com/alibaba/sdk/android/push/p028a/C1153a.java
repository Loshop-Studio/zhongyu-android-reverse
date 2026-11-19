package com.alibaba.sdk.android.push.p028a;

import android.content.Context;
import android.graphics.Bitmap;
import com.alibaba.sdk.android.ams.common.logger.AmsLogger;
import com.alibaba.sdk.android.ams.common.p021b.C1100c;
import com.alibaba.sdk.android.error.ErrorCode;
import com.alibaba.sdk.android.push.CommonCallback;
import com.alibaba.sdk.android.push.common.global.C1163c;
import com.alibaba.sdk.android.push.common.global.MpsGlobalSetter;
import com.alibaba.sdk.android.push.notification.CPushMessage;
import com.alibaba.sdk.android.push.p034e.C1181g;
import com.aliyun.ams.emas.push.InterfaceC1193a;
import com.p071ut.device.UTDevice;
import com.taobao.agoo.ICallback;
import com.taobao.agoo.TaobaoRegister;

/* renamed from: com.alibaba.sdk.android.push.a.a */
/* loaded from: classes.dex */
public class C1153a {

    /* renamed from: b */
    private static final AmsLogger f6590b = AmsLogger.getLogger("MPS:CloudPushService");

    /* renamed from: a */
    private final Context f6591a;

    /* renamed from: com.alibaba.sdk.android.push.a.a$2, reason: invalid class name */
    class AnonymousClass2 implements CommonCallback {

        /* renamed from: a */
        final /* synthetic */ CommonCallback f6594a;

        /* renamed from: com.alibaba.sdk.android.push.a.a$2$1, reason: invalid class name */
        class AnonymousClass1 extends ICallback {
            AnonymousClass1() {
            }

            @Override // com.taobao.agoo.ICallback
            public void onFailure(String str, String str2) {
                ErrorCode errorCodeBuild = C1163c.m5174a(str, str2).detail("turnOffPushChannel unbindAgoo").build();
                CommonCallback commonCallback = AnonymousClass2.this.f6594a;
                if (commonCallback != null) {
                    commonCallback.onFailed(errorCodeBuild.getCode(), errorCodeBuild.getMsg());
                }
            }

            @Override // com.taobao.agoo.ICallback
            public void onSuccess() {
                C1181g.m5228a().m5260d(new CommonCallback() { // from class: com.alibaba.sdk.android.push.a.a.2.1.1
                    @Override // com.alibaba.sdk.android.push.CommonCallback
                    public void onFailed(final String str, final String str2) {
                        TaobaoRegister.bindAgoo(C1153a.this.f6591a, new ICallback() { // from class: com.alibaba.sdk.android.push.a.a.2.1.1.1
                            @Override // com.taobao.agoo.ICallback
                            public void onFailure(String str3, String str4) {
                                ErrorCode errorCodeBuild = C1163c.m5174a(str3, str4).detail("turnOffPushChannel bindAgoo").build();
                                CommonCallback commonCallback = AnonymousClass2.this.f6594a;
                                if (commonCallback != null) {
                                    commonCallback.onFailed(errorCodeBuild.getCode(), errorCodeBuild.getMsg());
                                }
                            }

                            @Override // com.taobao.agoo.ICallback
                            public void onSuccess() {
                                CommonCallback commonCallback = AnonymousClass2.this.f6594a;
                                if (commonCallback != null) {
                                    commonCallback.onFailed(str, str2);
                                }
                            }
                        });
                    }

                    @Override // com.alibaba.sdk.android.push.CommonCallback
                    public void onSuccess(String str) {
                        CommonCallback commonCallback = AnonymousClass2.this.f6594a;
                        if (commonCallback != null) {
                            commonCallback.onSuccess(str);
                        }
                    }
                });
            }
        }

        AnonymousClass2(CommonCallback commonCallback) {
            this.f6594a = commonCallback;
        }

        @Override // com.alibaba.sdk.android.push.CommonCallback
        public void onFailed(String str, String str2) {
            CommonCallback commonCallback = this.f6594a;
            if (commonCallback != null) {
                commonCallback.onFailed(str, str2);
            }
        }

        @Override // com.alibaba.sdk.android.push.CommonCallback
        public void onSuccess(String str) {
            if (!str.equals("off")) {
                TaobaoRegister.unbindAgoo(C1153a.this.f6591a, new AnonymousClass1());
                return;
            }
            C1153a.f6590b.m5016d("already off. return");
            CommonCallback commonCallback = this.f6594a;
            if (commonCallback != null) {
                commonCallback.onSuccess(str);
            }
        }
    }

    /* renamed from: com.alibaba.sdk.android.push.a.a$3, reason: invalid class name */
    class AnonymousClass3 implements CommonCallback {

        /* renamed from: a */
        final /* synthetic */ CommonCallback f6601a;

        /* renamed from: com.alibaba.sdk.android.push.a.a$3$1, reason: invalid class name */
        class AnonymousClass1 extends ICallback {
            AnonymousClass1() {
            }

            @Override // com.taobao.agoo.ICallback
            public void onFailure(String str, String str2) {
                ErrorCode errorCodeBuild = C1163c.m5174a(str, str2).detail("turnOnPushChannel bindAgoo").build();
                CommonCallback commonCallback = AnonymousClass3.this.f6601a;
                if (commonCallback != null) {
                    commonCallback.onFailed(errorCodeBuild.getCode(), errorCodeBuild.getMsg());
                }
            }

            @Override // com.taobao.agoo.ICallback
            public void onSuccess() {
                C1181g.m5228a().m5262e(new CommonCallback() { // from class: com.alibaba.sdk.android.push.a.a.3.1.1
                    @Override // com.alibaba.sdk.android.push.CommonCallback
                    public void onFailed(final String str, final String str2) {
                        TaobaoRegister.unbindAgoo(C1153a.this.f6591a, new ICallback() { // from class: com.alibaba.sdk.android.push.a.a.3.1.1.1
                            @Override // com.taobao.agoo.ICallback
                            public void onFailure(String str3, String str4) {
                                ErrorCode errorCodeBuild = C1163c.m5174a(str3, str4).detail("turnOnPushChannel unbindAgoo").build();
                                CommonCallback commonCallback = AnonymousClass3.this.f6601a;
                                if (commonCallback != null) {
                                    commonCallback.onFailed(errorCodeBuild.getCode(), errorCodeBuild.getMsg());
                                }
                            }

                            @Override // com.taobao.agoo.ICallback
                            public void onSuccess() {
                                CommonCallback commonCallback = AnonymousClass3.this.f6601a;
                                if (commonCallback != null) {
                                    commonCallback.onFailed(str, str2);
                                }
                            }
                        });
                    }

                    @Override // com.alibaba.sdk.android.push.CommonCallback
                    public void onSuccess(String str) {
                        CommonCallback commonCallback = AnonymousClass3.this.f6601a;
                        if (commonCallback != null) {
                            commonCallback.onSuccess(str);
                        }
                    }
                });
            }
        }

        AnonymousClass3(CommonCallback commonCallback) {
            this.f6601a = commonCallback;
        }

        @Override // com.alibaba.sdk.android.push.CommonCallback
        public void onFailed(String str, String str2) {
            CommonCallback commonCallback = this.f6601a;
            if (commonCallback != null) {
                commonCallback.onFailed(str, str2);
            }
        }

        @Override // com.alibaba.sdk.android.push.CommonCallback
        public void onSuccess(String str) {
            if (!str.equals("on")) {
                TaobaoRegister.bindAgoo(C1153a.this.f6591a, new AnonymousClass1());
                return;
            }
            C1153a.f6590b.m5016d("already on. return");
            CommonCallback commonCallback = this.f6601a;
            if (commonCallback != null) {
                commonCallback.onSuccess(str);
            }
        }
    }

    public C1153a(Context context) {
        this.f6591a = context;
        C1181g.m5232a(context);
    }

    /* renamed from: a */
    public String m5115a() {
        return C1100c.m5010a().mo5002b();
    }

    /* renamed from: a */
    public String m5116a(Context context) {
        return UTDevice.getUtdid(context);
    }

    /* renamed from: a */
    public void m5117a(int i4) {
        MpsGlobalSetter.setNotificationSmallIconId(i4);
    }

    /* renamed from: a */
    public void m5118a(int i4, int i5, int i6, int i7, final CommonCallback commonCallback) {
        f6590b.m5016d("setDoNotDisturb " + i4 + ":" + i5 + "-" + i6 + ":" + i7);
        TaobaoRegister.setDoNotDisturb(i4, i5, i6, i7, new InterfaceC1193a() { // from class: com.alibaba.sdk.android.push.a.a.1
            @Override // com.aliyun.ams.emas.push.InterfaceC1193a
            public void onFailed(String str, String str2) {
                ErrorCode errorCodeBuild = C1163c.m5174a(str, str2).build();
                commonCallback.onFailed(errorCodeBuild.getCode(), errorCodeBuild.getMsg());
            }

            @Override // com.aliyun.ams.emas.push.InterfaceC1193a
            public void onSuccess(String str) {
                commonCallback.onSuccess(str);
            }
        });
    }

    /* renamed from: a */
    public void m5119a(int i4, CommonCallback commonCallback) {
        C1181g.m5228a().m5249a(i4, commonCallback);
    }

    /* renamed from: a */
    public void m5120a(int i4, String[] strArr, String str, CommonCallback commonCallback) {
        C1181g.m5228a().m5250a(i4, strArr, str, commonCallback);
    }

    /* renamed from: a */
    public void m5121a(Bitmap bitmap) {
        MpsGlobalSetter.setNotificationLargeIconBitmap(bitmap);
    }

    /* renamed from: a */
    public void m5122a(CommonCallback commonCallback) {
        C1181g.m5228a().m5251a(commonCallback);
    }

    /* renamed from: a */
    public void m5123a(CPushMessage cPushMessage) {
        TaobaoRegister.clickMessage(CPushMessage.m5269to(cPushMessage));
    }

    /* renamed from: a */
    public void m5124a(Class<?> cls) {
        TaobaoRegister.setPushMsgReceiveService(cls);
    }

    /* renamed from: a */
    public void m5125a(String str) {
        MpsGlobalSetter.setNotificationSoundPath(str);
    }

    /* renamed from: a */
    public void m5126a(String str, CommonCallback commonCallback) {
        C1181g.m5228a().m5252a(str, commonCallback);
    }

    /* renamed from: a */
    public void m5127a(boolean z3) {
        TaobaoRegister.setDoNotDisturbMode(z3);
    }

    /* renamed from: b */
    public void m5128b() {
        TaobaoRegister.clearNotificationCreatedByAliyun(this.f6591a);
    }

    /* renamed from: b */
    public void m5129b(int i4, String[] strArr, String str, CommonCallback commonCallback) {
        C1181g.m5228a().m5254b(i4, strArr, str, commonCallback);
    }

    /* renamed from: b */
    public void m5130b(Context context) {
        C1181g.m5228a().m5255b(context);
    }

    /* renamed from: b */
    public void m5131b(CommonCallback commonCallback) {
        C1181g.m5228a().m5256b(commonCallback);
    }

    /* renamed from: b */
    public void m5132b(CPushMessage cPushMessage) {
        TaobaoRegister.dismissMessage(CPushMessage.m5269to(cPushMessage));
    }

    /* renamed from: b */
    public void m5133b(String str) {
        C1100c.m5010a().mo5007d(str);
    }

    /* renamed from: b */
    public void m5134b(String str, CommonCallback commonCallback) {
        C1181g.m5228a().m5257b(str, commonCallback);
    }

    /* renamed from: b */
    public void m5135b(boolean z3) {
        MpsGlobalSetter.setDebug(z3);
    }

    /* renamed from: c */
    public void m5136c(CommonCallback commonCallback) {
        C1181g.m5228a().m5263f(commonCallback);
    }

    /* renamed from: c */
    public void m5137c(String str) {
        C1100c.m5010a().mo5009e(str);
    }

    /* renamed from: c */
    public void m5138c(String str, CommonCallback commonCallback) {
        C1181g.m5228a().m5259c(str, commonCallback);
    }

    /* renamed from: d */
    public void m5139d(CommonCallback commonCallback) {
        m5142f(new AnonymousClass2(commonCallback));
    }

    /* renamed from: d */
    public void m5140d(String str, CommonCallback commonCallback) {
        C1181g.m5228a().m5261d(str, commonCallback);
    }

    /* renamed from: e */
    public void m5141e(CommonCallback commonCallback) {
        m5142f(new AnonymousClass3(commonCallback));
    }

    /* renamed from: f */
    public void m5142f(CommonCallback commonCallback) {
        C1181g.m5228a().m5258c(commonCallback);
    }
}
