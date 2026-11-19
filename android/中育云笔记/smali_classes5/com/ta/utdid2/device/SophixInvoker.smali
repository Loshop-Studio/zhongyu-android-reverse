.class public Lcom/ta/utdid2/device/SophixInvoker;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final TAG:Ljava/lang/String; = "SophixInvoker"


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static invokeAlicloudReport(Landroid/app/Application;Ljava/lang/String;)V
    .locals 2

    .line 1
    new-instance v0, Lcom/alibaba/sdk/android/sender/SdkInfo;

    .line 2
    .line 3
    invoke-direct {v0}, Lcom/alibaba/sdk/android/sender/SdkInfo;-><init>()V

    .line 4
    .line 5
    .line 6
    const-string v1, "hotfix"

    .line 7
    .line 8
    invoke-virtual {v0, v1}, Lcom/alibaba/sdk/android/sender/SdkInfo;->setSdkId(Ljava/lang/String;)Lcom/alibaba/sdk/android/sender/SdkInfo;

    .line 9
    .line 10
    .line 11
    const-string v1, "3.3.5"

    .line 12
    .line 13
    invoke-virtual {v0, v1}, Lcom/alibaba/sdk/android/sender/SdkInfo;->setSdkVersion(Ljava/lang/String;)Lcom/alibaba/sdk/android/sender/SdkInfo;

    .line 14
    .line 15
    .line 16
    invoke-virtual {v0, p1}, Lcom/alibaba/sdk/android/sender/SdkInfo;->setAppKey(Ljava/lang/String;)Lcom/alibaba/sdk/android/sender/SdkInfo;

    .line 17
    .line 18
    .line 19
    invoke-static {p0, v0}, Lcom/alibaba/sdk/android/sender/AlicloudSender;->asyncSend(Landroid/app/Application;Lcom/alibaba/sdk/android/sender/SdkInfo;)V

    .line 20
    .line 21
    .line 22
    const/4 p0, 0x0

    .line 23
    new-array p0, p0, [Ljava/lang/Object;

    .line 24
    .line 25
    const-string p1, "SophixInvoker"

    .line 26
    .line 27
    const-string v0, "device is active."

    .line 28
    .line 29
    invoke-static {p1, v0, p0}, Lcom/taobao/sophix/e/e;->a(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)I

    .line 30
    .line 31
    .line 32
    return-void
.end method

.method public static invokeAlicloudSenderDebug(Z)V
    .locals 0

    .line 1
    if-eqz p0, :cond_0

    .line 2
    .line 3
    sget-object p0, Lcom/alibaba/sdk/android/logger/LogLevel;->DEBUG:Lcom/alibaba/sdk/android/logger/LogLevel;

    .line 4
    .line 5
    invoke-static {p0}, Lcom/alibaba/sdk/android/sender/SenderLog;->setLevel(Lcom/alibaba/sdk/android/logger/LogLevel;)V

    .line 6
    .line 7
    .line 8
    return-void

    .line 9
    :cond_0
    sget-object p0, Lcom/alibaba/sdk/android/logger/LogLevel;->WARN:Lcom/alibaba/sdk/android/logger/LogLevel;

    .line 10
    .line 11
    invoke-static {p0}, Lcom/alibaba/sdk/android/sender/SenderLog;->setLevel(Lcom/alibaba/sdk/android/logger/LogLevel;)V

    .line 12
    .line 13
    .line 14
    return-void
.end method
