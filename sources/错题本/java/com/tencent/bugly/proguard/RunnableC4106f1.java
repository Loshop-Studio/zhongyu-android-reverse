package com.tencent.bugly.proguard;

import com.tencent.bugly.crashreport.biz.UserInfoBean;

/* renamed from: com.tencent.bugly.proguard.f1 */
/* loaded from: classes3.dex */
public final class RunnableC4106f1 implements Runnable {

    /* renamed from: a */
    public final boolean f3816a;

    /* renamed from: b */
    public final UserInfoBean f3817b;

    /* renamed from: c */
    public final /* synthetic */ C4133r f3818c;

    public RunnableC4106f1(C4133r c4133r, UserInfoBean userInfoBean, boolean z8) {
        this.f3818c = c4133r;
        this.f3817b = userInfoBean;
        this.f3816a = z8;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C4133r c4133r = this.f3818c;
        if (c4133r.f3875d) {
            UserInfoBean userInfoBean = this.f3817b;
            if (userInfoBean != null) {
                try {
                    C4133r.m3335a(userInfoBean);
                    C4055al.m3025c("[UserInfo] Record user info.", new Object[0]);
                    c4133r.m3336a(userInfoBean, false);
                } catch (Throwable th) {
                    if (C4055al.m3022a(th)) {
                        return;
                    }
                    th.printStackTrace();
                    return;
                }
            }
            if (this.f3816a) {
                c4133r.m3351b();
            }
        }
    }
}
