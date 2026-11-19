package com.alibaba.sdk.android.push.p058a;

import android.content.Context;
import android.graphics.Bitmap;
import com.alibaba.sdk.android.ams.common.logger.AmsLogger;
import com.alibaba.sdk.android.ams.common.p051b.C5575c;
import com.alibaba.sdk.android.error.ErrorCode;
import com.alibaba.sdk.android.push.CommonCallback;
import com.alibaba.sdk.android.push.common.global.C5654c;
import com.alibaba.sdk.android.push.common.global.MpsGlobalSetter;
import com.alibaba.sdk.android.push.notification.CPushMessage;
import com.alibaba.sdk.android.push.p064e.C5672g;
import com.p101ut.device.UTDevice;
import com.taobao.agoo.ICallback;
import com.taobao.agoo.TaobaoRegister;
import p038c0.InterfaceC5207c;

/* renamed from: com.alibaba.sdk.android.push.a.a */
/* loaded from: classes3.dex */
public class C5644a {

    /* renamed from: b */
    private static final AmsLogger f4114b = AmsLogger.getLogger("MPS:CloudPushService");

    /* renamed from: a */
    private final Context f4115a;

    /* renamed from: com.alibaba.sdk.android.push.a.a$2, reason: invalid class name */
    public class AnonymousClass2 implements CommonCallback {

        /* renamed from: a */
        final /* synthetic */ CommonCallback f4118a;

        /* renamed from: com.alibaba.sdk.android.push.a.a$2$1, reason: invalid class name */
        public class AnonymousClass1 extends ICallback {
            public AnonymousClass1() {
            }

            @Override // com.taobao.agoo.ICallback
            public void onFailure(String str, String str2) {
                ErrorCode errorCodeBuild = C5654c.m3625a(str, str2).detail("turnOffPushChannel unbindAgoo").build();
                CommonCallback commonCallback = AnonymousClass2.this.f4118a;
                if (commonCallback != null) {
                    commonCallback.onFailed(errorCodeBuild.getCode(), errorCodeBuild.getMsg());
                }
            }

            @Override // com.taobao.agoo.ICallback
            public void onSuccess() {
                C5672g.m3679a().m3711d(new CommonCallback() { // from class: com.alibaba.sdk.android.push.a.a.2.1.1
                    @Override // com.alibaba.sdk.android.push.CommonCallback
                    public void onFailed(final String str, final String str2) {
                        TaobaoRegister.bindAgoo(C5644a.this.f4115a, new ICallback() { // from class: com.alibaba.sdk.android.push.a.a.2.1.1.1
                            @Override // com.taobao.agoo.ICallback
                            public void onFailure(String str3, String str4) {
                                ErrorCode errorCodeBuild = C5654c.m3625a(str3, str4).detail("turnOffPushChannel bindAgoo").build();
                                CommonCallback commonCallback = AnonymousClass2.this.f4118a;
                                if (commonCallback != null) {
                                    commonCallback.onFailed(errorCodeBuild.getCode(), errorCodeBuild.getMsg());
                                }
                            }

                            @Override // com.taobao.agoo.ICallback
                            public void onSuccess() {
                                CommonCallback commonCallback = AnonymousClass2.this.f4118a;
                                if (commonCallback != null) {
                                    commonCallback.onFailed(str, str2);
                                }
                            }
                        });
                    }

                    @Override // com.alibaba.sdk.android.push.CommonCallback
                    public void onSuccess(String str) {
                        CommonCallback commonCallback = AnonymousClass2.this.f4118a;
                        if (commonCallback != null) {
                            commonCallback.onSuccess(str);
                        }
                    }
                });
            }
        }

        public AnonymousClass2(CommonCallback commonCallback) {
            this.f4118a = commonCallback;
        }

        @Override // com.alibaba.sdk.android.push.CommonCallback
        public void onFailed(String str, String str2) {
            CommonCallback commonCallback = this.f4118a;
            if (commonCallback != null) {
                commonCallback.onFailed(str, str2);
            }
        }

        @Override // com.alibaba.sdk.android.push.CommonCallback
        public void onSuccess(String str) {
            if (!str.equals("off")) {
                TaobaoRegister.unbindAgoo(C5644a.this.f4115a, new AnonymousClass1());
                return;
            }
            C5644a.f4114b.m3417d("already off. return");
            CommonCallback commonCallback = this.f4118a;
            if (commonCallback != null) {
                commonCallback.onSuccess(str);
            }
        }
    }

    /* renamed from: com.alibaba.sdk.android.push.a.a$3, reason: invalid class name */
    public class AnonymousClass3 implements CommonCallback {

        /* renamed from: a */
        final /* synthetic */ CommonCallback f4125a;

        /* renamed from: com.alibaba.sdk.android.push.a.a$3$1, reason: invalid class name */
        public class AnonymousClass1 extends ICallback {
            public AnonymousClass1() {
            }

            @Override // com.taobao.agoo.ICallback
            public void onFailure(String str, String str2) {
                ErrorCode errorCodeBuild = C5654c.m3625a(str, str2).detail("turnOnPushChannel bindAgoo").build();
                CommonCallback commonCallback = AnonymousClass3.this.f4125a;
                if (commonCallback != null) {
                    commonCallback.onFailed(errorCodeBuild.getCode(), errorCodeBuild.getMsg());
                }
            }

            @Override // com.taobao.agoo.ICallback
            public void onSuccess() {
                C5672g.m3679a().m3713e(new CommonCallback() { // from class: com.alibaba.sdk.android.push.a.a.3.1.1
                    @Override // com.alibaba.sdk.android.push.CommonCallback
                    public void onFailed(final String str, final String str2) {
                        TaobaoRegister.unbindAgoo(C5644a.this.f4115a, new ICallback() { // from class: com.alibaba.sdk.android.push.a.a.3.1.1.1
                            @Override // com.taobao.agoo.ICallback
                            public void onFailure(String str3, String str4) {
                                ErrorCode errorCodeBuild = C5654c.m3625a(str3, str4).detail("turnOnPushChannel unbindAgoo").build();
                                CommonCallback commonCallback = AnonymousClass3.this.f4125a;
                                if (commonCallback != null) {
                                    commonCallback.onFailed(errorCodeBuild.getCode(), errorCodeBuild.getMsg());
                                }
                            }

                            @Override // com.taobao.agoo.ICallback
                            public void onSuccess() {
                                CommonCallback commonCallback = AnonymousClass3.this.f4125a;
                                if (commonCallback != null) {
                                    commonCallback.onFailed(str, str2);
                                }
                            }
                        });
                    }

                    @Override // com.alibaba.sdk.android.push.CommonCallback
                    public void onSuccess(String str) {
                        CommonCallback commonCallback = AnonymousClass3.this.f4125a;
                        if (commonCallback != null) {
                            commonCallback.onSuccess(str);
                        }
                    }
                });
            }
        }

        public AnonymousClass3(CommonCallback commonCallback) {
            this.f4125a = commonCallback;
        }

        @Override // com.alibaba.sdk.android.push.CommonCallback
        public void onFailed(String str, String str2) {
            CommonCallback commonCallback = this.f4125a;
            if (commonCallback != null) {
                commonCallback.onFailed(str, str2);
            }
        }

        @Override // com.alibaba.sdk.android.push.CommonCallback
        public void onSuccess(String str) {
            if (!str.equals("on")) {
                TaobaoRegister.bindAgoo(C5644a.this.f4115a, new AnonymousClass1());
                return;
            }
            C5644a.f4114b.m3417d("already on. return");
            CommonCallback commonCallback = this.f4125a;
            if (commonCallback != null) {
                commonCallback.onSuccess(str);
            }
        }
    }

    public C5644a(Context context) {
        this.f4115a = context;
        C5672g.m3683a(context);
    }

    /* renamed from: b */
    public void m3579b() {
        TaobaoRegister.clearNotificationCreatedByAliyun(this.f4115a);
    }

    /* renamed from: d */
    public void m3590d(CommonCallback commonCallback) {
        m3593f(new AnonymousClass2(commonCallback));
    }

    /* renamed from: e */
    public void m3592e(CommonCallback commonCallback) {
        m3593f(new AnonymousClass3(commonCallback));
    }

    /* renamed from: f */
    public void m3593f(CommonCallback commonCallback) {
        C5672g.m3679a().m3709c(commonCallback);
    }

    /* renamed from: a */
    public String m3566a() {
        return C5575c.m3411a().mo3403b();
    }

    /* renamed from: b */
    public void m3580b(int i10, String[] strArr, String str, CommonCallback commonCallback) {
        C5672g.m3679a().m3705b(i10, strArr, str, commonCallback);
    }

    /* renamed from: c */
    public void m3587c(CommonCallback commonCallback) {
        C5672g.m3679a().m3714f(commonCallback);
    }

    /* renamed from: d */
    public void m3591d(String str, CommonCallback commonCallback) {
        C5672g.m3679a().m3712d(str, commonCallback);
    }

    /* renamed from: a */
    public String m3567a(Context context) {
        return UTDevice.getUtdid(context);
    }

    /* renamed from: b */
    public void m3581b(Context context) {
        C5672g.m3679a().m3706b(context);
    }

    /* renamed from: c */
    public void m3588c(String str) {
        C5575c.m3411a().mo3410e(str);
    }

    /* renamed from: a */
    public void m3568a(int i10) {
        MpsGlobalSetter.setNotificationSmallIconId(i10);
    }

    /* renamed from: b */
    public void m3582b(CommonCallback commonCallback) {
        C5672g.m3679a().m3707b(commonCallback);
    }

    /* renamed from: c */
    public void m3589c(String str, CommonCallback commonCallback) {
        C5672g.m3679a().m3710c(str, commonCallback);
    }

    /* renamed from: a */
    public void m3569a(int i10, int i11, int i12, int i13, final CommonCallback commonCallback) {
        f4114b.m3417d("setDoNotDisturb " + i10 + ":" + i11 + "-" + i12 + ":" + i13);
        TaobaoRegister.setDoNotDisturb(i10, i11, i12, i13, new InterfaceC5207c() { // from class: com.alibaba.sdk.android.push.a.a.1
            @Override // p038c0.InterfaceC5207c
            public void onFailed(String str, String str2) {
                ErrorCode errorCodeBuild = C5654c.m3625a(str, str2).build();
                commonCallback.onFailed(errorCodeBuild.getCode(), errorCodeBuild.getMsg());
            }

            @Override // p038c0.InterfaceC5207c
            public void onSuccess(String str) {
                commonCallback.onSuccess(str);
            }
        });
    }

    /* renamed from: b */
    public void m3583b(CPushMessage cPushMessage) {
        TaobaoRegister.dismissMessage(CPushMessage.m3720to(cPushMessage));
    }

    /* renamed from: a */
    public void m3570a(int i10, CommonCallback commonCallback) {
        C5672g.m3679a().m3700a(i10, commonCallback);
    }

    /* renamed from: b */
    public void m3584b(String str) {
        C5575c.m3411a().mo3408d(str);
    }

    /* renamed from: a */
    public void m3571a(int i10, String[] strArr, String str, CommonCallback commonCallback) {
        C5672g.m3679a().m3701a(i10, strArr, str, commonCallback);
    }

    /* renamed from: b */
    public void m3585b(String str, CommonCallback commonCallback) {
        C5672g.m3679a().m3708b(str, commonCallback);
    }

    /* renamed from: a */
    public void m3572a(Bitmap bitmap) {
        MpsGlobalSetter.setNotificationLargeIconBitmap(bitmap);
    }

    /* renamed from: b */
    public void m3586b(boolean z10) {
        MpsGlobalSetter.setDebug(z10);
    }

    /* renamed from: a */
    public void m3573a(CommonCallback commonCallback) {
        C5672g.m3679a().m3702a(commonCallback);
    }

    /* renamed from: a */
    public void m3574a(CPushMessage cPushMessage) {
        TaobaoRegister.clickMessage(CPushMessage.m3720to(cPushMessage));
    }

    /* renamed from: a */
    public void m3575a(Class<?> cls) {
        TaobaoRegister.setPushMsgReceiveService(cls);
    }

    /* renamed from: a */
    public void m3576a(String str) {
        MpsGlobalSetter.setNotificationSoundPath(str);
    }

    /* renamed from: a */
    public void m3577a(String str, CommonCallback commonCallback) {
        C5672g.m3679a().m3703a(str, commonCallback);
    }

    /* renamed from: a */
    public void m3578a(boolean z10) {
        TaobaoRegister.setDoNotDisturbMode(z10);
    }
}
