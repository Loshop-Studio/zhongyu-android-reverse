.class public Lcom/huawei/hms/adapter/AvailableAdapter;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/hms/adapter/AvailableAdapter$AvailableCallBack;
    }
.end annotation


# instance fields
.field public final a:I

.field public b:Lcom/huawei/hms/adapter/AvailableAdapter$AvailableCallBack;

.field public c:Z

.field public d:Lcom/huawei/hms/adapter/sysobs/SystemObserver;


# direct methods
.method public constructor <init>(I)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lcom/huawei/hms/adapter/AvailableAdapter$a;

    .line 5
    .line 6
    invoke-direct {v0, p0}, Lcom/huawei/hms/adapter/AvailableAdapter$a;-><init>(Lcom/huawei/hms/adapter/AvailableAdapter;)V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lcom/huawei/hms/adapter/AvailableAdapter;->d:Lcom/huawei/hms/adapter/sysobs/SystemObserver;

    .line 10
    .line 11
    iput p1, p0, Lcom/huawei/hms/adapter/AvailableAdapter;->a:I

    .line 12
    .line 13
    const/4 p1, 0x0

    .line 14
    iput-boolean p1, p0, Lcom/huawei/hms/adapter/AvailableAdapter;->c:Z

    .line 15
    .line 16
    return-void
.end method

.method public static synthetic c(Lcom/huawei/hms/adapter/AvailableAdapter;)Lcom/huawei/hms/adapter/AvailableAdapter$AvailableCallBack;
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/huawei/hms/adapter/AvailableAdapter;->b()Lcom/huawei/hms/adapter/AvailableAdapter$AvailableCallBack;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method


# virtual methods
.method public final a(Landroid/content/Context;)I
    .locals 2

    .line 1
    invoke-static {p1}, Lcom/huawei/hms/utils/HMSPackageManager;->getInstance(Landroid/content/Context;)Lcom/huawei/hms/utils/HMSPackageManager;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Lcom/huawei/hms/utils/HMSPackageManager;->isUseOldCertificate()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    const-string v1, "AvailableAdapter"

    .line 10
    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    const-string p1, "The CP uses the old certificate to terminate the connection."

    .line 14
    .line 15
    invoke-static {v1, p1}, Lcom/huawei/hms/support/log/HMSLog;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    const/16 p1, 0xd

    .line 19
    .line 20
    return p1

    .line 21
    :cond_0
    invoke-static {p1}, Lcom/huawei/hms/utils/HMSPackageManager;->getInstance(Landroid/content/Context;)Lcom/huawei/hms/utils/HMSPackageManager;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    invoke-virtual {p1}, Lcom/huawei/hms/utils/HMSPackageManager;->getHMSPackageStatesForMultiService()Lcom/huawei/hms/utils/PackageManagerHelper$PackageStates;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    sget-object v0, Lcom/huawei/hms/utils/PackageManagerHelper$PackageStates;->NOT_INSTALLED:Lcom/huawei/hms/utils/PackageManagerHelper$PackageStates;

    .line 30
    .line 31
    invoke-virtual {v0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 32
    .line 33
    .line 34
    move-result v0

    .line 35
    if-eqz v0, :cond_1

    .line 36
    .line 37
    const-string p1, "HMS is not installed"

    .line 38
    .line 39
    invoke-static {v1, p1}, Lcom/huawei/hms/support/log/HMSLog;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 40
    .line 41
    .line 42
    const/4 p1, 0x1

    .line 43
    return p1

    .line 44
    :cond_1
    sget-object v0, Lcom/huawei/hms/utils/PackageManagerHelper$PackageStates;->SPOOF:Lcom/huawei/hms/utils/PackageManagerHelper$PackageStates;

    .line 45
    .line 46
    invoke-virtual {v0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 47
    .line 48
    .line 49
    move-result v0

    .line 50
    if-eqz v0, :cond_2

    .line 51
    .line 52
    const-string p1, "HMS is spoofed"

    .line 53
    .line 54
    invoke-static {v1, p1}, Lcom/huawei/hms/support/log/HMSLog;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 55
    .line 56
    .line 57
    const/16 p1, 0x1d

    .line 58
    .line 59
    return p1

    .line 60
    :cond_2
    sget-object v0, Lcom/huawei/hms/utils/PackageManagerHelper$PackageStates;->DISABLED:Lcom/huawei/hms/utils/PackageManagerHelper$PackageStates;

    .line 61
    .line 62
    invoke-virtual {v0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 63
    .line 64
    .line 65
    move-result p1

    .line 66
    if-eqz p1, :cond_3

    .line 67
    .line 68
    const-string p1, "HMS is disabled"

    .line 69
    .line 70
    invoke-static {v1, p1}, Lcom/huawei/hms/support/log/HMSLog;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 71
    .line 72
    .line 73
    const/4 p1, 0x3

    .line 74
    return p1

    .line 75
    :cond_3
    const/4 p1, 0x0

    .line 76
    return p1
.end method

.method public final b()Lcom/huawei/hms/adapter/AvailableAdapter$AvailableCallBack;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/huawei/hms/adapter/AvailableAdapter;->b:Lcom/huawei/hms/adapter/AvailableAdapter$AvailableCallBack;

    .line 2
    .line 3
    return-object v0
.end method

.method public checkHuaweiMobileServicesForUpdate(Landroid/content/Context;)I
    .locals 2

    .line 1
    const-string v0, "context must not be null."

    .line 2
    .line 3
    invoke-static {p1, v0}, Lcom/huawei/hms/utils/Checker;->checkNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0, p1}, Lcom/huawei/hms/adapter/AvailableAdapter;->a(Landroid/content/Context;)I

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    goto :goto_0

    .line 13
    :cond_0
    invoke-static {p1}, Lcom/huawei/hms/utils/HMSPackageManager;->getInstance(Landroid/content/Context;)Lcom/huawei/hms/utils/HMSPackageManager;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    iget v1, p0, Lcom/huawei/hms/adapter/AvailableAdapter;->a:I

    .line 18
    .line 19
    invoke-virtual {p1, v1}, Lcom/huawei/hms/utils/HMSPackageManager;->isApkNeedUpdate(I)Z

    .line 20
    .line 21
    .line 22
    move-result p1

    .line 23
    if-eqz p1, :cond_1

    .line 24
    .line 25
    const-string p1, "AvailableAdapter"

    .line 26
    .line 27
    const-string v0, "The current version does not meet the target version requirements"

    .line 28
    .line 29
    invoke-static {p1, v0}, Lcom/huawei/hms/support/log/HMSLog;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    const/4 p1, 0x2

    .line 33
    return p1

    .line 34
    :cond_1
    :goto_0
    return v0
.end method

.method public final d(Landroid/app/Activity;Lcom/huawei/hms/adapter/AvailableAdapter$AvailableCallBack;)V
    .locals 2

    .line 1
    const-string v0, "AvailableAdapter"

    .line 2
    .line 3
    const-string v1, "<showHmsApkNotInstalledDialog> startResolution"

    .line 4
    .line 5
    invoke-static {v0, v1}, Lcom/huawei/hms/support/log/HMSLog;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-static {}, Lcom/huawei/hms/adapter/ui/NotInstalledHmsAdapter;->getShowLock()Z

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    iput-object p2, p0, Lcom/huawei/hms/adapter/AvailableAdapter;->b:Lcom/huawei/hms/adapter/AvailableAdapter$AvailableCallBack;

    .line 15
    .line 16
    invoke-static {}, Lcom/huawei/hms/adapter/sysobs/SystemManager;->getSystemNotifier()Lcom/huawei/hms/adapter/sysobs/SystemNotifier;

    .line 17
    .line 18
    .line 19
    move-result-object p2

    .line 20
    iget-object v0, p0, Lcom/huawei/hms/adapter/AvailableAdapter;->d:Lcom/huawei/hms/adapter/sysobs/SystemObserver;

    .line 21
    .line 22
    invoke-interface {p2, v0}, Lcom/huawei/hms/adapter/sysobs/SystemNotifier;->registerObserver(Lcom/huawei/hms/adapter/sysobs/SystemObserver;)V

    .line 23
    .line 24
    .line 25
    const-class p2, Lcom/huawei/hms/adapter/ui/NotInstalledHmsAdapter;

    .line 26
    .line 27
    invoke-virtual {p2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object p2

    .line 31
    invoke-static {p1, p2}, Lcom/huawei/hms/activity/BridgeActivity;->getIntentStartBridgeActivity(Landroid/app/Activity;Ljava/lang/String;)Landroid/content/Intent;

    .line 32
    .line 33
    .line 34
    move-result-object p2

    .line 35
    invoke-virtual {p1, p2}, Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V

    .line 36
    .line 37
    .line 38
    return-void

    .line 39
    :cond_0
    const/16 p1, 0x1f

    .line 40
    .line 41
    invoke-interface {p2, p1}, Lcom/huawei/hms/adapter/AvailableAdapter$AvailableCallBack;->onComplete(I)V

    .line 42
    .line 43
    .line 44
    return-void
.end method

.method public final e(Landroid/app/Activity;)Z
    .locals 2

    .line 1
    invoke-static {p1}, Lcom/huawei/hms/utils/HMSPackageManager;->getInstance(Landroid/content/Context;)Lcom/huawei/hms/utils/HMSPackageManager;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Lcom/huawei/hms/utils/HMSPackageManager;->isUpdateHmsForThirdPartyDevice()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    const/4 v1, 0x0

    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    return v1

    .line 13
    :cond_0
    invoke-static {p1}, Lcom/huawei/hms/utils/HMSPackageManager;->getInstance(Landroid/content/Context;)Lcom/huawei/hms/utils/HMSPackageManager;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    invoke-virtual {p1}, Lcom/huawei/hms/utils/HMSPackageManager;->getHmsVersionCode()I

    .line 18
    .line 19
    .line 20
    move-result p1

    .line 21
    const v0, 0x2625a00

    .line 22
    .line 23
    .line 24
    if-lt p1, v0, :cond_1

    .line 25
    .line 26
    const-string p1, "AvailableAdapter"

    .line 27
    .line 28
    const-string v0, "enter 4.0 HmsCore upgrade process"

    .line 29
    .line 30
    invoke-static {p1, v0}, Lcom/huawei/hms/support/log/HMSLog;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 31
    .line 32
    .line 33
    const/4 p1, 0x1

    .line 34
    return p1

    .line 35
    :cond_1
    return v1
.end method

.method public final f(Landroid/content/Context;)V
    .locals 0

    .line 1
    invoke-static {p1}, Lcom/huawei/hms/utils/HMSBIInitializer;->getInstance(Landroid/content/Context;)Lcom/huawei/hms/utils/HMSBIInitializer;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-virtual {p1}, Lcom/huawei/hms/utils/HMSBIInitializer;->initBI()V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public isHuaweiMobileServicesAvailable(Landroid/content/Context;)I
    .locals 2

    .line 1
    const-string v0, "context must not be null."

    .line 2
    .line 3
    invoke-static {p1, v0}, Lcom/huawei/hms/utils/Checker;->checkNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0, p1}, Lcom/huawei/hms/adapter/AvailableAdapter;->a(Landroid/content/Context;)I

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    goto :goto_0

    .line 13
    :cond_0
    invoke-static {p1}, Lcom/huawei/hms/utils/HMSPackageManager;->getInstance(Landroid/content/Context;)Lcom/huawei/hms/utils/HMSPackageManager;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    iget v1, p0, Lcom/huawei/hms/adapter/AvailableAdapter;->a:I

    .line 18
    .line 19
    invoke-virtual {p1, v1}, Lcom/huawei/hms/utils/HMSPackageManager;->isApkUpdateNecessary(I)Z

    .line 20
    .line 21
    .line 22
    move-result p1

    .line 23
    if-eqz p1, :cond_1

    .line 24
    .line 25
    const-string p1, "AvailableAdapter"

    .line 26
    .line 27
    const-string v0, "The current version does not meet the minimum version requirements"

    .line 28
    .line 29
    invoke-static {p1, v0}, Lcom/huawei/hms/support/log/HMSLog;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    const/4 p1, 0x2

    .line 33
    return p1

    .line 34
    :cond_1
    :goto_0
    return v0
.end method

.method public isUserNoticeError(I)Z
    .locals 1

    const/16 v0, 0x1d

    if-eq p1, v0, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    const/4 p1, 0x1

    return p1
.end method

.method public isUserResolvableError(I)Z
    .locals 2

    const/4 v0, 0x1

    if-eq p1, v0, :cond_0

    const/4 v1, 0x2

    if-eq p1, v1, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    return v0
.end method

.method public setCalledBySolutionInstallHms(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/huawei/hms/adapter/AvailableAdapter;->c:Z

    .line 2
    .line 3
    return-void
.end method

.method public startNotice(Landroid/app/Activity;Lcom/huawei/hms/adapter/AvailableAdapter$AvailableCallBack;)V
    .locals 2

    .line 1
    if-eqz p1, :cond_2

    .line 2
    .line 3
    if-nez p2, :cond_0

    .line 4
    .line 5
    goto :goto_0

    .line 6
    :cond_0
    invoke-static {p1}, Lcom/huawei/hms/utils/UIUtil;->isBackground(Landroid/content/Context;)Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    const-string v1, "AvailableAdapter"

    .line 11
    .line 12
    if-eqz v0, :cond_1

    .line 13
    .line 14
    const-string p1, "current app is in Background"

    .line 15
    .line 16
    invoke-static {v1, p1}, Lcom/huawei/hms/support/log/HMSLog;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    const/16 p1, 0x1c

    .line 20
    .line 21
    invoke-interface {p2, p1}, Lcom/huawei/hms/adapter/AvailableAdapter$AvailableCallBack;->onComplete(I)V

    .line 22
    .line 23
    .line 24
    return-void

    .line 25
    :cond_1
    const-string v0, "startNotice"

    .line 26
    .line 27
    invoke-static {v1, v0}, Lcom/huawei/hms/support/log/HMSLog;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    iput-object p2, p0, Lcom/huawei/hms/adapter/AvailableAdapter;->b:Lcom/huawei/hms/adapter/AvailableAdapter$AvailableCallBack;

    .line 31
    .line 32
    invoke-static {}, Lcom/huawei/hms/adapter/sysobs/SystemManager;->getSystemNotifier()Lcom/huawei/hms/adapter/sysobs/SystemNotifier;

    .line 33
    .line 34
    .line 35
    move-result-object p2

    .line 36
    iget-object v0, p0, Lcom/huawei/hms/adapter/AvailableAdapter;->d:Lcom/huawei/hms/adapter/sysobs/SystemObserver;

    .line 37
    .line 38
    invoke-interface {p2, v0}, Lcom/huawei/hms/adapter/sysobs/SystemNotifier;->registerObserver(Lcom/huawei/hms/adapter/sysobs/SystemObserver;)V

    .line 39
    .line 40
    .line 41
    const-class p2, Lcom/huawei/hms/update/note/AppSpoofResolution;

    .line 42
    .line 43
    invoke-virtual {p2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object p2

    .line 47
    invoke-static {p1, p2}, Lcom/huawei/hms/activity/BridgeActivity;->getIntentStartBridgeActivity(Landroid/app/Activity;Ljava/lang/String;)Landroid/content/Intent;

    .line 48
    .line 49
    .line 50
    move-result-object p2

    .line 51
    invoke-virtual {p1, p2}, Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V

    .line 52
    .line 53
    .line 54
    :cond_2
    :goto_0
    return-void
.end method

.method public startResolution(Landroid/app/Activity;Lcom/huawei/hms/adapter/AvailableAdapter$AvailableCallBack;)V
    .locals 3

    .line 1
    if-eqz p1, :cond_5

    .line 2
    .line 3
    if-nez p2, :cond_0

    .line 4
    .line 5
    goto :goto_0

    .line 6
    :cond_0
    invoke-virtual {p0, p1}, Lcom/huawei/hms/adapter/AvailableAdapter;->f(Landroid/content/Context;)V

    .line 7
    .line 8
    .line 9
    invoke-static {p1}, Lcom/huawei/hms/utils/UIUtil;->isBackground(Landroid/content/Context;)Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    const-string v1, "AvailableAdapter"

    .line 14
    .line 15
    if-eqz v0, :cond_1

    .line 16
    .line 17
    const-string p1, "current app is in Background"

    .line 18
    .line 19
    invoke-static {v1, p1}, Lcom/huawei/hms/support/log/HMSLog;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    const/16 p1, 0x1c

    .line 23
    .line 24
    invoke-interface {p2, p1}, Lcom/huawei/hms/adapter/AvailableAdapter$AvailableCallBack;->onComplete(I)V

    .line 25
    .line 26
    .line 27
    return-void

    .line 28
    :cond_1
    invoke-virtual {p0, p1}, Lcom/huawei/hms/adapter/AvailableAdapter;->e(Landroid/app/Activity;)Z

    .line 29
    .line 30
    .line 31
    move-result v0

    .line 32
    invoke-static {p1}, Lcom/huawei/hms/adapter/AvailableUtil;->isInstallerLibExist(Landroid/content/Context;)Z

    .line 33
    .line 34
    .line 35
    move-result v2

    .line 36
    if-nez v2, :cond_2

    .line 37
    .line 38
    if-nez v0, :cond_2

    .line 39
    .line 40
    invoke-virtual {p0, p1, p2}, Lcom/huawei/hms/adapter/AvailableAdapter;->d(Landroid/app/Activity;Lcom/huawei/hms/adapter/AvailableAdapter$AvailableCallBack;)V

    .line 41
    .line 42
    .line 43
    return-void

    .line 44
    :cond_2
    sget-object v2, Lcom/huawei/hms/availableupdate/c;->b:Lcom/huawei/hms/availableupdate/c;

    .line 45
    .line 46
    invoke-virtual {v2}, Lcom/huawei/hms/availableupdate/c;->b()Z

    .line 47
    .line 48
    .line 49
    move-result v2

    .line 50
    if-nez v2, :cond_3

    .line 51
    .line 52
    goto :goto_0

    .line 53
    :cond_3
    const-string v2, "startResolution"

    .line 54
    .line 55
    invoke-static {v1, v2}, Lcom/huawei/hms/support/log/HMSLog;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 56
    .line 57
    .line 58
    iput-object p2, p0, Lcom/huawei/hms/adapter/AvailableAdapter;->b:Lcom/huawei/hms/adapter/AvailableAdapter$AvailableCallBack;

    .line 59
    .line 60
    invoke-static {}, Lcom/huawei/hms/adapter/sysobs/SystemManager;->getSystemNotifier()Lcom/huawei/hms/adapter/sysobs/SystemNotifier;

    .line 61
    .line 62
    .line 63
    move-result-object p2

    .line 64
    iget-object v1, p0, Lcom/huawei/hms/adapter/AvailableAdapter;->d:Lcom/huawei/hms/adapter/sysobs/SystemObserver;

    .line 65
    .line 66
    invoke-interface {p2, v1}, Lcom/huawei/hms/adapter/sysobs/SystemNotifier;->registerObserver(Lcom/huawei/hms/adapter/sysobs/SystemObserver;)V

    .line 67
    .line 68
    .line 69
    const-class p2, Lcom/huawei/hms/adapter/ui/UpdateAdapter;

    .line 70
    .line 71
    invoke-virtual {p2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 72
    .line 73
    .line 74
    move-result-object p2

    .line 75
    invoke-static {p1, p2}, Lcom/huawei/hms/activity/BridgeActivity;->getIntentStartBridgeActivity(Landroid/app/Activity;Ljava/lang/String;)Landroid/content/Intent;

    .line 76
    .line 77
    .line 78
    move-result-object p2

    .line 79
    iget v1, p0, Lcom/huawei/hms/adapter/AvailableAdapter;->a:I

    .line 80
    .line 81
    const-string v2, "update_version"

    .line 82
    .line 83
    invoke-virtual {p2, v2, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 84
    .line 85
    .line 86
    iget-boolean v1, p0, Lcom/huawei/hms/adapter/AvailableAdapter;->c:Z

    .line 87
    .line 88
    if-eqz v1, :cond_4

    .line 89
    .line 90
    const-string v1, "installHMS"

    .line 91
    .line 92
    invoke-virtual {p2, v1, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 93
    .line 94
    .line 95
    :cond_4
    const-string v1, "new_update"

    .line 96
    .line 97
    invoke-virtual {p2, v1, v0}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 98
    .line 99
    .line 100
    invoke-virtual {p1, p2}, Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V

    .line 101
    .line 102
    .line 103
    :cond_5
    :goto_0
    return-void
.end method
