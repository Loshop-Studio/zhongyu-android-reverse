package com.friday.common.entity;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.room.Entity;
import androidx.room.PrimaryKey;
import kotlin.jvm.internal.AbstractC9972n;
import kotlin.jvm.internal.AbstractC9979u;

@StabilityInferred(parameters = 1)
@Entity
/* loaded from: classes3.dex */
public final class User {
    public static final int $stable = 0;

    @PrimaryKey(autoGenerate = false)
    private final long accountId;
    private final String accountName;
    private final boolean albumPermission;
    private final boolean cameraPermission;
    private final String headPhotoUrl;
    private final boolean screenshotsPermission;
    private final String unit;
    private final String userName;

    public User(long j10, String accountName, String headPhotoUrl, String userName, String unit, boolean z10, boolean z11, boolean z12) {
        AbstractC9979u.m20294g(accountName, "accountName");
        AbstractC9979u.m20294g(headPhotoUrl, "headPhotoUrl");
        AbstractC9979u.m20294g(userName, "userName");
        AbstractC9979u.m20294g(unit, "unit");
        this.accountId = j10;
        this.accountName = accountName;
        this.headPhotoUrl = headPhotoUrl;
        this.userName = userName;
        this.unit = unit;
        this.cameraPermission = z10;
        this.albumPermission = z11;
        this.screenshotsPermission = z12;
    }

    public static /* synthetic */ User copy$default(User user, long j10, String str, String str2, String str3, String str4, boolean z10, boolean z11, boolean z12, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            j10 = user.accountId;
        }
        long j11 = j10;
        if ((i10 & 2) != 0) {
            str = user.accountName;
        }
        String str5 = str;
        if ((i10 & 4) != 0) {
            str2 = user.headPhotoUrl;
        }
        String str6 = str2;
        if ((i10 & 8) != 0) {
            str3 = user.userName;
        }
        return user.copy(j11, str5, str6, str3, (i10 & 16) != 0 ? user.unit : str4, (i10 & 32) != 0 ? user.cameraPermission : z10, (i10 & 64) != 0 ? user.albumPermission : z11, (i10 & 128) != 0 ? user.screenshotsPermission : z12);
    }

    public final long component1() {
        return this.accountId;
    }

    public final String component2() {
        return this.accountName;
    }

    public final String component3() {
        return this.headPhotoUrl;
    }

    public final String component4() {
        return this.userName;
    }

    public final String component5() {
        return this.unit;
    }

    public final boolean component6() {
        return this.cameraPermission;
    }

    public final boolean component7() {
        return this.albumPermission;
    }

    public final boolean component8() {
        return this.screenshotsPermission;
    }

    public final User copy(long j10, String accountName, String headPhotoUrl, String userName, String unit, boolean z10, boolean z11, boolean z12) {
        AbstractC9979u.m20294g(accountName, "accountName");
        AbstractC9979u.m20294g(headPhotoUrl, "headPhotoUrl");
        AbstractC9979u.m20294g(userName, "userName");
        AbstractC9979u.m20294g(unit, "unit");
        return new User(j10, accountName, headPhotoUrl, userName, unit, z10, z11, z12);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof User)) {
            return false;
        }
        User user = (User) obj;
        return this.accountId == user.accountId && AbstractC9979u.m20289b(this.accountName, user.accountName) && AbstractC9979u.m20289b(this.headPhotoUrl, user.headPhotoUrl) && AbstractC9979u.m20289b(this.userName, user.userName) && AbstractC9979u.m20289b(this.unit, user.unit) && this.cameraPermission == user.cameraPermission && this.albumPermission == user.albumPermission && this.screenshotsPermission == user.screenshotsPermission;
    }

    public final long getAccountId() {
        return this.accountId;
    }

    public final String getAccountName() {
        return this.accountName;
    }

    public final boolean getAlbumPermission() {
        return this.albumPermission;
    }

    public final boolean getCameraPermission() {
        return this.cameraPermission;
    }

    public final String getHeadPhotoUrl() {
        return this.headPhotoUrl;
    }

    public final boolean getScreenshotsPermission() {
        return this.screenshotsPermission;
    }

    public final String getUnit() {
        return this.unit;
    }

    public final String getUserName() {
        return this.userName;
    }

    public int hashCode() {
        return (((((((((((((Long.hashCode(this.accountId) * 31) + this.accountName.hashCode()) * 31) + this.headPhotoUrl.hashCode()) * 31) + this.userName.hashCode()) * 31) + this.unit.hashCode()) * 31) + Boolean.hashCode(this.cameraPermission)) * 31) + Boolean.hashCode(this.albumPermission)) * 31) + Boolean.hashCode(this.screenshotsPermission);
    }

    public String toString() {
        return "User(accountId=" + this.accountId + ", accountName=" + this.accountName + ", headPhotoUrl=" + this.headPhotoUrl + ", userName=" + this.userName + ", unit=" + this.unit + ", cameraPermission=" + this.cameraPermission + ", albumPermission=" + this.albumPermission + ", screenshotsPermission=" + this.screenshotsPermission + ")";
    }

    public /* synthetic */ User(long j10, String str, String str2, String str3, String str4, boolean z10, boolean z11, boolean z12, int i10, AbstractC9972n abstractC9972n) {
        this(j10, str, str2, str3, str4, (i10 & 32) != 0 ? false : z10, (i10 & 64) != 0 ? false : z11, (i10 & 128) != 0 ? false : z12);
    }
}
