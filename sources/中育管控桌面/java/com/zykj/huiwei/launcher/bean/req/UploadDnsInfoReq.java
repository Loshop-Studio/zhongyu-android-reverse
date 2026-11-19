package com.zykj.huiwei.launcher.bean.req;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.savedstate.serialization.ClassDiscriminatorModeKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred(parameters = 0)
@Metadata(m7879d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0010\b\u0007\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0003¢\u0006\u0004\b\b\u0010\tR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000b\"\u0004\b\u000f\u0010\rR\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0007\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u000b\"\u0004\b\u0015\u0010\r¨\u0006\u0016"}, m7880d2 = {"Lcom/zykj/huiwei/launcher/bean/req/UploadDnsInfoReq;", "", "appName", "", "appPackageName", ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY, "", "detailInfo", "<init>", "(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)V", "getAppName", "()Ljava/lang/String;", "setAppName", "(Ljava/lang/String;)V", "getAppPackageName", "setAppPackageName", "getType", "()I", "setType", "(I)V", "getDetailInfo", "setDetailInfo", "app_release"}, m7881k = 1, m7882mv = {2, 2, 0}, m7884xi = 48)
/* loaded from: classes4.dex */
public final class UploadDnsInfoReq {
    public static final int $stable = 8;
    private String appName;
    private String appPackageName;
    private String detailInfo;
    private int type;

    public UploadDnsInfoReq(String appName, String appPackageName, int i6, String detailInfo) {
        Intrinsics.checkNotNullParameter(appName, "appName");
        Intrinsics.checkNotNullParameter(appPackageName, "appPackageName");
        Intrinsics.checkNotNullParameter(detailInfo, "detailInfo");
        this.appName = appName;
        this.appPackageName = appPackageName;
        this.type = i6;
        this.detailInfo = detailInfo;
    }

    public final String getAppName() {
        return this.appName;
    }

    public final String getAppPackageName() {
        return this.appPackageName;
    }

    public final String getDetailInfo() {
        return this.detailInfo;
    }

    public final int getType() {
        return this.type;
    }

    public final void setAppName(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.appName = str;
    }

    public final void setAppPackageName(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.appPackageName = str;
    }

    public final void setDetailInfo(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.detailInfo = str;
    }

    public final void setType(int i6) {
        this.type = i6;
    }
}
