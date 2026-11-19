package com.zykj.huiwei.launcher.bean.req;

import androidx.autofill.HintConstants;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred(parameters = 1)
@Metadata(m7879d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\r\b\u0007\u0018\u00002\u00020\u0001BE\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000fR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\t\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, m7880d2 = {"Lcom/zykj/huiwei/launcher/bean/req/LoginReq;", "", "schoolName", "", HintConstants.AUTOFILL_HINT_USERNAME, HintConstants.AUTOFILL_HINT_PASSWORD, "deviceNumber", "clientType", "", "role", "im", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IIZ)V", "getSchoolName", "()Ljava/lang/String;", "getUsername", "getPassword", "getDeviceNumber", "getClientType", "()I", "getRole", "getIm", "()Z", "app_release"}, m7881k = 1, m7882mv = {2, 2, 0}, m7884xi = 48)
/* loaded from: classes4.dex */
public final class LoginReq {
    public static final int $stable = 0;
    private final int clientType;
    private final String deviceNumber;
    private final boolean im;
    private final String password;
    private final int role;
    private final String schoolName;
    private final String username;

    public LoginReq(String schoolName, String username, String password, String deviceNumber, int i6, int i7, boolean z6) {
        Intrinsics.checkNotNullParameter(schoolName, "schoolName");
        Intrinsics.checkNotNullParameter(username, "username");
        Intrinsics.checkNotNullParameter(password, "password");
        Intrinsics.checkNotNullParameter(deviceNumber, "deviceNumber");
        this.schoolName = schoolName;
        this.username = username;
        this.password = password;
        this.deviceNumber = deviceNumber;
        this.clientType = i6;
        this.role = i7;
        this.im = z6;
    }

    public final int getClientType() {
        return this.clientType;
    }

    public final String getDeviceNumber() {
        return this.deviceNumber;
    }

    public final boolean getIm() {
        return this.im;
    }

    public final String getPassword() {
        return this.password;
    }

    public final int getRole() {
        return this.role;
    }

    public final String getSchoolName() {
        return this.schoolName;
    }

    public final String getUsername() {
        return this.username;
    }

    public /* synthetic */ LoginReq(String str, String str2, String str3, String str4, int i6, int i7, boolean z6, int i8, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, str4, (i8 & 16) != 0 ? 2 : i6, (i8 & 32) != 0 ? 1 : i7, (i8 & 64) != 0 ? false : z6);
    }
}
