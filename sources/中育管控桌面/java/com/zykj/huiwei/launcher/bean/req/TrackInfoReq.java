package com.zykj.huiwei.launcher.bean.req;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;

@StabilityInferred(parameters = 0)
@Metadata(m7879d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\b\"\u0004\b\f\u0010\n¨\u0006\r"}, m7880d2 = {"Lcom/zykj/huiwei/launcher/bean/req/TrackInfoReq;", "", "deviceNumber", "", "description", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getDeviceNumber", "()Ljava/lang/String;", "setDeviceNumber", "(Ljava/lang/String;)V", "getDescription", "setDescription", "app_release"}, m7881k = 1, m7882mv = {2, 2, 0}, m7884xi = 48)
/* loaded from: classes4.dex */
public final class TrackInfoReq {
    public static final int $stable = 8;
    private String description;
    private String deviceNumber;

    public TrackInfoReq(String str, String str2) {
        this.deviceNumber = str;
        this.description = str2;
    }

    public final String getDescription() {
        return this.description;
    }

    public final String getDeviceNumber() {
        return this.deviceNumber;
    }

    public final void setDescription(String str) {
        this.description = str;
    }

    public final void setDeviceNumber(String str) {
        this.deviceNumber = str;
    }
}
