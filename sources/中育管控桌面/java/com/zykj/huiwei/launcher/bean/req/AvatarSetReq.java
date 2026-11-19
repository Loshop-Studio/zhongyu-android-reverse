package com.zykj.huiwei.launcher.bean.req;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;

@StabilityInferred(parameters = 1)
@Metadata(m7879d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m7880d2 = {"Lcom/zykj/huiwei/launcher/bean/req/AvatarSetReq;", "", "profileId", "", "<init>", "(J)V", "getProfileId", "()J", "app_release"}, m7881k = 1, m7882mv = {2, 2, 0}, m7884xi = 48)
/* loaded from: classes4.dex */
public final class AvatarSetReq {
    public static final int $stable = 0;
    private final long profileId;

    public AvatarSetReq(long j6) {
        this.profileId = j6;
    }

    public final long getProfileId() {
        return this.profileId;
    }
}
