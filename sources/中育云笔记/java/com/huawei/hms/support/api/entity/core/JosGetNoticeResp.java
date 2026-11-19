package com.huawei.hms.support.api.entity.core;

import android.content.Intent;
import p161g5.InterfaceC9271a;

/* loaded from: classes5.dex */
public class JosGetNoticeResp extends JosBaseResp {

    @InterfaceC9271a
    private Intent noticeIntent;

    private static <T> T get(T t10) {
        return t10;
    }

    public Intent getNoticeIntent() {
        return (Intent) get(this.noticeIntent);
    }

    public void setNoticeIntent(Intent intent) {
        this.noticeIntent = intent;
    }
}
