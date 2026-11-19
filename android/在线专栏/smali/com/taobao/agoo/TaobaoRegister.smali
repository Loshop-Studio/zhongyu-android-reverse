.class public final Lcom/taobao/agoo/TaobaoRegister;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/taobao/agoo/TaobaoRegister$g;,
        Lcom/taobao/agoo/TaobaoRegister$h;,
        Lcom/taobao/agoo/TaobaoRegister$f;,
        Lcom/taobao/agoo/TaobaoRegister$e;,
        Lcom/taobao/agoo/TaobaoRegister$d;,
        Lcom/taobao/agoo/TaobaoRegister$a;,
        Lcom/taobao/agoo/TaobaoRegister$c;,
        Lcom/taobao/agoo/TaobaoRegister$b;
    }
.end annotation


# static fields
.field private static final EVENT_ID:I = 0x101d1

.field static final PREFERENCES:Ljava/lang/String; = "Agoo_AppStore"

.field static final PROPERTY_APP_NOTIFICATION_CUSTOM_SOUND:Ljava/lang/String; = "app_notification_custom_sound"

.field static final PROPERTY_APP_NOTIFICATION_ICON:Ljava/lang/String; = "app_notification_icon"

.field static final PROPERTY_APP_NOTIFICATION_SOUND:Ljava/lang/String; = "app_notification_sound"

.field static final PROPERTY_APP_NOTIFICATION_VIBRATE:Ljava/lang/String; = "app_notification_vibrate"

.field private static final SERVICEID:Ljava/lang/String; = "agooSend"

.field protected static final TAG:Ljava/lang/String; = "TaobaoRegister"

.field private static mRequestListener:Lcom/taobao/agoo/a/b;


# direct methods
.method private constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    invoke-direct {v0}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw v0
.end method

.method static synthetic access$000()Lcom/taobao/agoo/a/b;
    .locals 1

    sget-object v0, Lcom/taobao/agoo/TaobaoRegister;->mRequestListener:Lcom/taobao/agoo/a/b;

    return-object v0
.end method

.method static synthetic access$002(Lcom/taobao/agoo/a/b;)Lcom/taobao/agoo/a/b;
    .locals 0

    sput-object p0, Lcom/taobao/agoo/TaobaoRegister;->mRequestListener:Lcom/taobao/agoo/a/b;

    return-object p0
.end method

.method static synthetic access$300(Ljava/lang/String;Landroid/content/Context;Lcom/taobao/agoo/ICallback;Lcom/taobao/agoo/TaobaoRegister$b;)V
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lcom/taobao/agoo/TaobaoRegister;->doAliasOperation(Ljava/lang/String;Landroid/content/Context;Lcom/taobao/agoo/ICallback;Lcom/taobao/agoo/TaobaoRegister$b;)V

    return-void
.end method

.method static synthetic access$400(Landroid/content/Context;Ljava/util/Map;Lcom/taobao/agoo/ICallback;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/taobao/agoo/TaobaoRegister;->removeAliasInList(Landroid/content/Context;Ljava/util/Map;Lcom/taobao/agoo/ICallback;)V

    return-void
.end method

.method public static declared-synchronized addAlias(Landroid/content/Context;Ljava/lang/String;Lcom/taobao/agoo/ICallback;)V
    .locals 6

    const-class v0, Lcom/taobao/agoo/TaobaoRegister;

    monitor-enter v0

    :try_start_0
    const-string v1, "TaobaoRegister"

    const-string v2, "addAlias"

    const/4 v3, 0x2

    new-array v3, v3, [Ljava/lang/Object;

    const/4 v4, 0x0

    const-string v5, "alias"

    aput-object v5, v3, v4

    const/4 v4, 0x1

    aput-object p1, v3, v4

    .line 1
    invoke-static {v1, v2, v3}, Lcom/taobao/accs/utl/ALog;->i(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2
    invoke-static {p2}, Lcom/taobao/agoo/TaobaoRegister;->checkNull(Lcom/taobao/agoo/ICallback;)Lcom/taobao/agoo/ICallback;

    move-result-object p2

    if-eqz p0, :cond_1

    if-nez p1, :cond_0

    goto :goto_0

    :cond_0
    const-string v1, "addAlias"

    .line 3
    new-instance v2, Lcom/taobao/agoo/TaobaoRegister$a;

    const/4 v3, 0x0

    invoke-direct {v2, p1, v3}, Lcom/taobao/agoo/TaobaoRegister$a;-><init>(Ljava/lang/String;Lcom/taobao/agoo/c;)V

    invoke-static {v1, p0, p2, v2}, Lcom/taobao/agoo/TaobaoRegister;->doAliasOperation(Ljava/lang/String;Landroid/content/Context;Lcom/taobao/agoo/ICallback;Lcom/taobao/agoo/TaobaoRegister$b;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 4
    monitor-exit v0

    return-void

    .line 5
    :cond_1
    :goto_0
    :try_start_1
    sget-object v1, Lcom/taobao/agoo/a;->INVALID_ARG:Lcom/alibaba/sdk/android/error/ErrorCode;

    invoke-virtual {v1}, Lcom/alibaba/sdk/android/error/ErrorCode;->copy()Lcom/alibaba/sdk/android/error/ErrorBuilder;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "addAlias "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p0, " "

    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v1, p0}, Lcom/alibaba/sdk/android/error/ErrorBuilder;->detail(Ljava/lang/String;)Lcom/alibaba/sdk/android/error/ErrorBuilder;

    move-result-object p0

    .line 6
    invoke-virtual {p0}, Lcom/alibaba/sdk/android/error/ErrorBuilder;->build()Lcom/alibaba/sdk/android/error/ErrorCode;

    move-result-object p0

    .line 7
    invoke-virtual {p0}, Lcom/alibaba/sdk/android/error/ErrorCode;->getCode()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0}, Lcom/alibaba/sdk/android/error/ErrorCode;->getMsg()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p2, p1, p0}, Lcom/taobao/agoo/ICallback;->onFailure(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 8
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p0

    monitor-exit v0

    throw p0
.end method

.method public static bindAgoo(Landroid/content/Context;Lcom/taobao/agoo/ICallback;)V
    .locals 2

    const/4 v0, 0x1

    .line 2
    invoke-static {p0, p1, v0}, Lcom/taobao/agoo/TaobaoRegister;->sendSwitch(Landroid/content/Context;Lcom/taobao/agoo/ICallback;Z)V

    .line 3
    invoke-static {}, Lcom/taobao/accs/utl/UTMini;->getInstance()Lcom/taobao/accs/utl/UTMini;

    move-result-object p1

    invoke-static {p0}, Lcom/taobao/accs/utl/UtilityImpl;->getDeviceId(Landroid/content/Context;)Ljava/lang/String;

    move-result-object p0

    const v0, 0x101d1

    const-string v1, "bindAgoo"

    invoke-virtual {p1, v0, v1, p0}, Lcom/taobao/accs/utl/UTMini;->commitEvent(ILjava/lang/String;Ljava/lang/Object;)V

    return-void
.end method

.method public static bindAgoo(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Lorg/android/agoo/common/CallBack;)V
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    const/4 p1, 0x0

    .line 1
    invoke-static {p0, p1}, Lcom/taobao/agoo/TaobaoRegister;->bindAgoo(Landroid/content/Context;Lcom/taobao/agoo/ICallback;)V

    return-void
.end method

.method private static checkNull(Lcom/taobao/agoo/ICallback;)Lcom/taobao/agoo/ICallback;
    .locals 0

    if-nez p0, :cond_0

    new-instance p0, Lcom/taobao/agoo/TaobaoRegister$3;

    invoke-direct {p0}, Lcom/taobao/agoo/TaobaoRegister$3;-><init>()V

    :cond_0
    return-object p0
.end method

.method public static clearNotificationCreatedByAliyun(Landroid/content/Context;)V
    .locals 1

    invoke-static {}, Lk1/a;->a()Lk1/a;

    move-result-object v0

    invoke-virtual {v0, p0}, Lk1/a;->c(Landroid/content/Context;)V

    return-void
.end method

.method public static clickMessage(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    .line 1
    invoke-static {p0}, Lorg/android/agoo/control/AgooFactory;->getInstance(Landroid/content/Context;)Lorg/android/agoo/control/AgooFactory;

    move-result-object v0

    invoke-virtual {v0, p0, p1, p2}, Lorg/android/agoo/control/AgooFactory;->clickMessage(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public static clickMessage(Lcom/aliyun/ams/emas/push/notification/CPushMessage;)V
    .locals 0

    .line 2
    invoke-static {p0}, Lcom/aliyun/ams/emas/push/l;->f(Lcom/aliyun/ams/emas/push/notification/CPushMessage;)V

    return-void
.end method

.method public static dismissMessage(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    .line 1
    invoke-static {p0}, Lorg/android/agoo/control/AgooFactory;->getInstance(Landroid/content/Context;)Lorg/android/agoo/control/AgooFactory;

    move-result-object v0

    invoke-virtual {v0, p0, p1, p2}, Lorg/android/agoo/control/AgooFactory;->dismissMessage(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public static dismissMessage(Lcom/aliyun/ams/emas/push/notification/CPushMessage;)V
    .locals 0

    .line 2
    invoke-static {p0}, Lcom/aliyun/ams/emas/push/l;->i(Lcom/aliyun/ams/emas/push/notification/CPushMessage;)V

    return-void
.end method

.method private static doAliasOperation(Ljava/lang/String;Landroid/content/Context;Lcom/taobao/agoo/ICallback;Lcom/taobao/agoo/TaobaoRegister$b;)V
    .locals 8

    const-string v0, "AgooDeviceCmd"

    const/4 v1, 0x0

    new-array v2, v1, [Ljava/lang/Object;

    const-string v3, "TaobaoRegister"

    .line 1
    invoke-static {v3, p0, v2}, Lcom/taobao/accs/utl/ALog;->i(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2
    invoke-static {p1}, Lorg/android/agoo/common/Config;->getDeviceToken(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v2

    .line 3
    invoke-static {p1}, Lorg/android/agoo/common/Config;->b(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v4

    .line 4
    invoke-static {v4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v5

    if-nez v5, :cond_5

    .line 5
    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v5

    if-nez v5, :cond_5

    if-nez p1, :cond_0

    goto :goto_1

    .line 6
    :cond_0
    :try_start_0
    sget-object v5, Lcom/taobao/agoo/TaobaoRegister;->mRequestListener:Lcom/taobao/agoo/a/b;

    if-nez v5, :cond_1

    .line 7
    new-instance v5, Lcom/taobao/agoo/a/b;

    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v6

    invoke-direct {v5, v6}, Lcom/taobao/agoo/a/b;-><init>(Landroid/content/Context;)V

    sput-object v5, Lcom/taobao/agoo/TaobaoRegister;->mRequestListener:Lcom/taobao/agoo/a/b;

    .line 8
    :cond_1
    invoke-static {p1}, Lorg/android/agoo/common/Config;->d(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v5

    .line 9
    invoke-static {p1, v4, v5}, Lcom/taobao/accs/ACCSManager;->getAccsInstance(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Lcom/taobao/accs/IACCSManager;

    move-result-object v5

    .line 10
    sget-object v6, Lcom/taobao/agoo/a/b;->b:Lcom/taobao/agoo/a/a;

    invoke-virtual {p1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v6, v7}, Lcom/taobao/agoo/a/a;->b(Ljava/lang/String;)Z

    move-result v6

    if-eqz v6, :cond_3

    .line 11
    sget-object v6, Lcom/taobao/agoo/TaobaoRegister;->mRequestListener:Lcom/taobao/agoo/a/b;

    invoke-interface {v5, p1, v0, v6}, Lcom/taobao/accs/IACCSManager;->registerDataListener(Landroid/content/Context;Ljava/lang/String;Lcom/taobao/accs/base/AccsAbstractDataListener;)V

    .line 12
    invoke-interface {p3, v4, v2}, Lcom/taobao/agoo/TaobaoRegister$b;->a(Ljava/lang/String;Ljava/lang/String;)[B

    move-result-object p3

    .line 13
    new-instance v2, Lcom/taobao/accs/ACCSManager$AccsRequest;

    const/4 v4, 0x0

    invoke-direct {v2, v4, v0, p3, v4}, Lcom/taobao/accs/ACCSManager$AccsRequest;-><init>(Ljava/lang/String;Ljava/lang/String;[BLjava/lang/String;)V

    .line 14
    invoke-interface {v5, p1, v2}, Lcom/taobao/accs/IACCSManager;->sendRequest(Landroid/content/Context;Lcom/taobao/accs/ACCSManager$AccsRequest;)Ljava/lang/String;

    move-result-object p1

    .line 15
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p3

    if-eqz p3, :cond_2

    if-eqz p2, :cond_4

    .line 16
    sget-object p1, Lcom/taobao/agoo/a;->ACCS_CHECK_ERROR:Lcom/alibaba/sdk/android/error/ErrorCode;

    invoke-virtual {p1}, Lcom/alibaba/sdk/android/error/ErrorCode;->getCode()Ljava/lang/String;

    move-result-object p3

    .line 17
    invoke-virtual {p1}, Lcom/alibaba/sdk/android/error/ErrorCode;->getMsg()Ljava/lang/String;

    move-result-object p1

    .line 18
    invoke-virtual {p2, p3, p1}, Lcom/taobao/agoo/ICallback;->onFailure(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    :cond_2
    if-eqz p2, :cond_4

    .line 19
    sget-object p3, Lcom/taobao/agoo/TaobaoRegister;->mRequestListener:Lcom/taobao/agoo/a/b;

    iget-object p3, p3, Lcom/taobao/agoo/a/b;->a:Ljava/util/Map;

    invoke-interface {p3, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_3
    if-eqz p2, :cond_4

    .line 20
    sget-object p1, Lcom/taobao/agoo/a;->AGOO_NOT_BIND:Lcom/alibaba/sdk/android/error/ErrorCode;

    invoke-virtual {p1}, Lcom/alibaba/sdk/android/error/ErrorCode;->getCode()Ljava/lang/String;

    move-result-object p3

    .line 21
    invoke-virtual {p1}, Lcom/alibaba/sdk/android/error/ErrorCode;->getMsg()Ljava/lang/String;

    move-result-object p1

    .line 22
    invoke-virtual {p2, p3, p1}, Lcom/taobao/agoo/ICallback;->onFailure(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p1

    new-array p2, v1, [Ljava/lang/Object;

    .line 23
    invoke-static {v3, p0, p1, p2}, Lcom/taobao/accs/utl/ALog;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;[Ljava/lang/Object;)V

    :cond_4
    :goto_0
    return-void

    :cond_5
    :goto_1
    if-eqz p2, :cond_8

    if-nez p1, :cond_6

    .line 24
    sget-object p3, Lcom/taobao/agoo/a;->INVALID_ARG:Lcom/alibaba/sdk/android/error/ErrorCode;

    invoke-virtual {p3}, Lcom/alibaba/sdk/android/error/ErrorCode;->copy()Lcom/alibaba/sdk/android/error/ErrorBuilder;

    move-result-object p3

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v5, " context is null"

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p3, v0}, Lcom/alibaba/sdk/android/error/ErrorBuilder;->detail(Ljava/lang/String;)Lcom/alibaba/sdk/android/error/ErrorBuilder;

    move-result-object p3

    .line 25
    invoke-virtual {p3}, Lcom/alibaba/sdk/android/error/ErrorBuilder;->build()Lcom/alibaba/sdk/android/error/ErrorCode;

    move-result-object p3

    goto :goto_2

    .line 26
    :cond_6
    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p3

    if-eqz p3, :cond_7

    .line 27
    sget-object p3, Lcom/taobao/agoo/a;->INVALID_ARG:Lcom/alibaba/sdk/android/error/ErrorCode;

    invoke-virtual {p3}, Lcom/alibaba/sdk/android/error/ErrorCode;->copy()Lcom/alibaba/sdk/android/error/ErrorBuilder;

    move-result-object p3

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v5, " deviceId is null"

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p3, v0}, Lcom/alibaba/sdk/android/error/ErrorBuilder;->detail(Ljava/lang/String;)Lcom/alibaba/sdk/android/error/ErrorBuilder;

    move-result-object p3

    .line 28
    invoke-virtual {p3}, Lcom/alibaba/sdk/android/error/ErrorBuilder;->build()Lcom/alibaba/sdk/android/error/ErrorCode;

    move-result-object p3

    goto :goto_2

    .line 29
    :cond_7
    sget-object p3, Lcom/taobao/agoo/a;->INVALID_ARG:Lcom/alibaba/sdk/android/error/ErrorCode;

    invoke-virtual {p3}, Lcom/alibaba/sdk/android/error/ErrorCode;->copy()Lcom/alibaba/sdk/android/error/ErrorBuilder;

    move-result-object p3

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v5, " appKey is null"

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p3, v0}, Lcom/alibaba/sdk/android/error/ErrorBuilder;->detail(Ljava/lang/String;)Lcom/alibaba/sdk/android/error/ErrorBuilder;

    move-result-object p3

    .line 30
    invoke-virtual {p3}, Lcom/alibaba/sdk/android/error/ErrorBuilder;->build()Lcom/alibaba/sdk/android/error/ErrorCode;

    move-result-object p3

    .line 31
    :goto_2
    invoke-virtual {p3}, Lcom/alibaba/sdk/android/error/ErrorCode;->getCode()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p3}, Lcom/alibaba/sdk/android/error/ErrorCode;->getMsg()Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p2, v0, p3}, Lcom/taobao/agoo/ICallback;->onFailure(Ljava/lang/String;Ljava/lang/String;)V

    .line 32
    :cond_8
    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p0, " param null"

    invoke-virtual {p2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    const/4 p2, 0x6

    new-array p2, p2, [Ljava/lang/Object;

    const-string p3, "appkey"

    aput-object p3, p2, v1

    const/4 p3, 0x1

    aput-object v4, p2, p3

    const/4 p3, 0x2

    const-string v0, "deviceId"

    aput-object v0, p2, p3

    const/4 p3, 0x3

    aput-object v2, p2, p3

    const/4 p3, 0x4

    const-string v0, "context"

    aput-object v0, p2, p3

    const/4 p3, 0x5

    aput-object p1, p2, p3

    invoke-static {v3, p0, p2}, Lcom/taobao/accs/utl/ALog;->e(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    return-void
.end method

.method public static isPushApi()Z
    .locals 2

    const-class v0, Lcom/aliyun/ams/emas/push/AgooInnerService;

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    sget-object v1, Lcom/taobao/accs/client/AdapterGlobalClientInfo;->mAgooCustomServiceName:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method public static declared-synchronized listAlias(Landroid/content/Context;Lcom/taobao/agoo/IListAliasCallback;)V
    .locals 4

    const-class v0, Lcom/taobao/agoo/TaobaoRegister;

    monitor-enter v0

    :try_start_0
    const-string v1, "TaobaoRegister"

    const-string v2, "listAlias"

    const/4 v3, 0x0

    new-array v3, v3, [Ljava/lang/Object;

    .line 1
    invoke-static {v1, v2, v3}, Lcom/taobao/accs/utl/ALog;->i(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2
    invoke-static {p1}, Lcom/taobao/agoo/TaobaoRegister;->checkNull(Lcom/taobao/agoo/ICallback;)Lcom/taobao/agoo/ICallback;

    move-result-object p1

    if-nez p0, :cond_0

    .line 3
    sget-object p0, Lcom/taobao/agoo/a;->INVALID_ARG:Lcom/alibaba/sdk/android/error/ErrorCode;

    invoke-virtual {p0}, Lcom/alibaba/sdk/android/error/ErrorCode;->copy()Lcom/alibaba/sdk/android/error/ErrorBuilder;

    move-result-object p0

    const-string v1, "listAlias context is null"

    invoke-virtual {p0, v1}, Lcom/alibaba/sdk/android/error/ErrorBuilder;->detail(Ljava/lang/String;)Lcom/alibaba/sdk/android/error/ErrorBuilder;

    move-result-object p0

    .line 4
    invoke-virtual {p0}, Lcom/alibaba/sdk/android/error/ErrorBuilder;->build()Lcom/alibaba/sdk/android/error/ErrorCode;

    move-result-object p0

    .line 5
    invoke-virtual {p0}, Lcom/alibaba/sdk/android/error/ErrorCode;->getCode()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0}, Lcom/alibaba/sdk/android/error/ErrorCode;->getMsg()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p1, v1, p0}, Lcom/taobao/agoo/ICallback;->onFailure(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 6
    monitor-exit v0

    return-void

    :cond_0
    :try_start_1
    const-string v1, "listAlias"

    .line 7
    new-instance v2, Lcom/taobao/agoo/TaobaoRegister$c;

    const/4 v3, 0x0

    invoke-direct {v2, v3}, Lcom/taobao/agoo/TaobaoRegister$c;-><init>(Lcom/taobao/agoo/c;)V

    invoke-static {v1, p0, p1, v2}, Lcom/taobao/agoo/TaobaoRegister;->doAliasOperation(Ljava/lang/String;Landroid/content/Context;Lcom/taobao/agoo/ICallback;Lcom/taobao/agoo/TaobaoRegister$b;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 8
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p0

    monitor-exit v0

    throw p0
.end method

.method public static pingApp(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V
    .locals 0

    invoke-static {p0}, Lorg/android/agoo/control/AgooFactory;->getInstance(Landroid/content/Context;)Lorg/android/agoo/control/AgooFactory;

    move-result-object p0

    invoke-virtual {p0}, Lorg/android/agoo/control/AgooFactory;->getNotifyManager()Lorg/android/agoo/control/NotifManager;

    move-result-object p0

    invoke-virtual {p0, p1, p2, p3, p4}, Lorg/android/agoo/control/NotifManager;->pingApp(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V

    return-void
.end method

.method public static declared-synchronized register(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/taobao/agoo/IRegister;)V
    .locals 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/taobao/accs/AccsException;
        }
    .end annotation

    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    const-class v0, Lcom/taobao/agoo/TaobaoRegister;

    monitor-enter v0

    move-object v1, p0

    move-object v2, p1

    move-object v3, p1

    move-object v4, p2

    move-object v5, p3

    move-object v6, p4

    .line 1
    :try_start_0
    invoke-static/range {v1 .. v6}, Lcom/taobao/agoo/TaobaoRegister;->register(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/taobao/agoo/IRegister;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 2
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p0

    monitor-exit v0

    throw p0
.end method

.method public static declared-synchronized register(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/taobao/agoo/IRegister;)V
    .locals 13
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/taobao/accs/AccsException;
        }
    .end annotation

    move-object v0, p0

    move-object v1, p1

    move-object v6, p2

    move-object/from16 v7, p3

    const-class v8, Lcom/taobao/agoo/TaobaoRegister;

    monitor-enter v8

    const/4 v2, 0x3

    const/4 v3, 0x1

    const/4 v4, 0x0

    const/4 v5, 0x4

    const/4 v9, 0x2

    if-eqz v0, :cond_3

    .line 3
    :try_start_0
    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v10

    if-nez v10, :cond_3

    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v10

    if-eqz v10, :cond_0

    goto/16 :goto_1

    :cond_0
    const-string v10, "TaobaoRegister"

    const-string v11, "register"

    new-array v5, v5, [Ljava/lang/Object;

    const-string v12, "appKey"

    aput-object v12, v5, v4

    aput-object v6, v5, v3

    const-string v3, "configTag"

    aput-object v3, v5, v9

    aput-object v1, v5, v2

    .line 4
    invoke-static {v10, v11, v5}, Lcom/taobao/accs/utl/ALog;->i(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 5
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v10

    .line 6
    sput-object v1, Lorg/android/agoo/common/Config;->a:Ljava/lang/String;

    .line 7
    invoke-static {p0, p2}, Lorg/android/agoo/common/Config;->setAgooAppKey(Landroid/content/Context;Ljava/lang/String;)V

    .line 8
    sput-object v7, Lcom/taobao/accs/utl/AdapterUtilityImpl;->mAgooAppSecret:Ljava/lang/String;

    .line 9
    invoke-static {p0, v7}, Lorg/android/agoo/common/Config;->a(Landroid/content/Context;Ljava/lang/String;)V

    .line 10
    invoke-static/range {p3 .. p3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    if-nez v2, :cond_1

    .line 11
    sput v9, Lcom/taobao/accs/client/AdapterGlobalClientInfo;->mSecurityType:I

    .line 12
    :cond_1
    invoke-static {p0}, Lcom/aliyun/ams/emas/push/l;->c(Landroid/content/Context;)V

    .line 13
    invoke-static {p1}, Lcom/taobao/accs/AccsClientConfig;->getConfigByTag(Ljava/lang/String;)Lcom/taobao/accs/AccsClientConfig;

    move-result-object v2

    if-nez v2, :cond_2

    .line 14
    new-instance v2, Lcom/taobao/accs/AccsClientConfig$Builder;

    invoke-direct {v2}, Lcom/taobao/accs/AccsClientConfig$Builder;-><init>()V

    .line 15
    invoke-virtual {v2, p2}, Lcom/taobao/accs/AccsClientConfig$Builder;->setAppKey(Ljava/lang/String;)Lcom/taobao/accs/AccsClientConfig$Builder;

    move-result-object v2

    .line 16
    invoke-virtual {v2, v7}, Lcom/taobao/accs/AccsClientConfig$Builder;->setAppSecret(Ljava/lang/String;)Lcom/taobao/accs/AccsClientConfig$Builder;

    move-result-object v2

    .line 17
    invoke-virtual {v2, p1}, Lcom/taobao/accs/AccsClientConfig$Builder;->setTag(Ljava/lang/String;)Lcom/taobao/accs/AccsClientConfig$Builder;

    move-result-object v2

    .line 18
    invoke-virtual {v2}, Lcom/taobao/accs/AccsClientConfig$Builder;->build()Lcom/taobao/accs/AccsClientConfig;

    goto :goto_0

    .line 19
    :cond_2
    invoke-virtual {v2}, Lcom/taobao/accs/AccsClientConfig;->getAuthCode()Ljava/lang/String;

    move-result-object v2

    sput-object v2, Lcom/taobao/accs/client/AdapterGlobalClientInfo;->mAuthCode:Ljava/lang/String;

    .line 20
    :goto_0
    invoke-static {p0, p2, p1}, Lcom/taobao/accs/ACCSManager;->getAccsInstance(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Lcom/taobao/accs/IACCSManager;

    move-result-object v9

    .line 21
    new-instance v11, Lcom/taobao/agoo/c;

    move-object v0, v11

    move-object/from16 v1, p5

    move-object v2, v10

    move-object v3, v9

    move-object v4, p2

    move-object/from16 v5, p4

    invoke-direct/range {v0 .. v5}, Lcom/taobao/agoo/c;-><init>(Lcom/taobao/agoo/IRegister;Landroid/content/Context;Lcom/taobao/accs/IACCSManager;Ljava/lang/String;Ljava/lang/String;)V

    move-object v0, v9

    move-object v1, v10

    move-object v2, p2

    move-object/from16 v3, p3

    move-object/from16 v4, p4

    move-object v5, v11

    invoke-interface/range {v0 .. v5}, Lcom/taobao/accs/IACCSManager;->bindApp(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/taobao/accs/IAppReceiver;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 22
    monitor-exit v8

    return-void

    :cond_3
    :goto_1
    :try_start_1
    const-string v0, "TaobaoRegister"

    const-string v7, "register params null"

    new-array v5, v5, [Ljava/lang/Object;

    const-string v10, "appkey"

    aput-object v10, v5, v4

    aput-object v6, v5, v3

    const-string v3, "configTag"

    aput-object v3, v5, v9

    aput-object v1, v5, v2

    .line 23
    invoke-static {v0, v7, v5}, Lcom/taobao/accs/utl/ALog;->e(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 24
    monitor-exit v8

    return-void

    :catchall_0
    move-exception v0

    monitor-exit v8

    throw v0
.end method

.method public static declared-synchronized removeAlias(Landroid/content/Context;Lcom/taobao/agoo/ICallback;)V
    .locals 4

    const-class v0, Lcom/taobao/agoo/TaobaoRegister;

    monitor-enter v0

    :try_start_0
    const-string v1, "TaobaoRegister"

    const-string v2, "removeAlias"

    const/4 v3, 0x0

    new-array v3, v3, [Ljava/lang/Object;

    .line 1
    invoke-static {v1, v2, v3}, Lcom/taobao/accs/utl/ALog;->i(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2
    invoke-static {p1}, Lcom/taobao/agoo/TaobaoRegister;->checkNull(Lcom/taobao/agoo/ICallback;)Lcom/taobao/agoo/ICallback;

    move-result-object p1

    if-nez p0, :cond_0

    .line 3
    sget-object p0, Lcom/taobao/agoo/a;->INVALID_ARG:Lcom/alibaba/sdk/android/error/ErrorCode;

    invoke-virtual {p0}, Lcom/alibaba/sdk/android/error/ErrorCode;->copy()Lcom/alibaba/sdk/android/error/ErrorBuilder;

    move-result-object p0

    const-string v1, "removeAlias before 2.4.x context is null"

    invoke-virtual {p0, v1}, Lcom/alibaba/sdk/android/error/ErrorBuilder;->detail(Ljava/lang/String;)Lcom/alibaba/sdk/android/error/ErrorBuilder;

    move-result-object p0

    .line 4
    invoke-virtual {p0}, Lcom/alibaba/sdk/android/error/ErrorBuilder;->build()Lcom/alibaba/sdk/android/error/ErrorCode;

    move-result-object p0

    .line 5
    invoke-virtual {p0}, Lcom/alibaba/sdk/android/error/ErrorCode;->getCode()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0}, Lcom/alibaba/sdk/android/error/ErrorCode;->getMsg()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p1, v1, p0}, Lcom/taobao/agoo/ICallback;->onFailure(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 6
    monitor-exit v0

    return-void

    :cond_0
    :try_start_1
    const-string v1, "removeAllAlias"

    .line 7
    new-instance v2, Lcom/taobao/agoo/TaobaoRegister$5;

    invoke-direct {v2, p1, p0}, Lcom/taobao/agoo/TaobaoRegister$5;-><init>(Lcom/taobao/agoo/ICallback;Landroid/content/Context;)V

    new-instance p1, Lcom/taobao/agoo/TaobaoRegister$e;

    const/4 v3, 0x0

    invoke-direct {p1, v3}, Lcom/taobao/agoo/TaobaoRegister$e;-><init>(Lcom/taobao/agoo/c;)V

    invoke-static {v1, p0, v2, p1}, Lcom/taobao/agoo/TaobaoRegister;->doAliasOperation(Ljava/lang/String;Landroid/content/Context;Lcom/taobao/agoo/ICallback;Lcom/taobao/agoo/TaobaoRegister$b;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 8
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p0

    monitor-exit v0

    throw p0
.end method

.method public static declared-synchronized removeAlias(Landroid/content/Context;Ljava/lang/String;Lcom/taobao/agoo/ICallback;)V
    .locals 4

    const-class v0, Lcom/taobao/agoo/TaobaoRegister;

    monitor-enter v0

    :try_start_0
    const-string v1, "TaobaoRegister"

    .line 9
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "removeAlias "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    new-array v3, v3, [Ljava/lang/Object;

    invoke-static {v1, v2, v3}, Lcom/taobao/accs/utl/ALog;->i(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 10
    invoke-static {p2}, Lcom/taobao/agoo/TaobaoRegister;->checkNull(Lcom/taobao/agoo/ICallback;)Lcom/taobao/agoo/ICallback;

    move-result-object p2

    if-eqz p0, :cond_1

    if-nez p1, :cond_0

    goto :goto_0

    :cond_0
    const-string v1, "removeAlias"

    .line 11
    new-instance v2, Lcom/taobao/agoo/TaobaoRegister$6;

    invoke-direct {v2, p2, p0, p1}, Lcom/taobao/agoo/TaobaoRegister$6;-><init>(Lcom/taobao/agoo/ICallback;Landroid/content/Context;Ljava/lang/String;)V

    new-instance p2, Lcom/taobao/agoo/TaobaoRegister$d;

    const/4 v3, 0x0

    invoke-direct {p2, p1, v3, v3}, Lcom/taobao/agoo/TaobaoRegister$d;-><init>(Ljava/lang/String;Ljava/lang/String;Lcom/taobao/agoo/c;)V

    invoke-static {v1, p0, v2, p2}, Lcom/taobao/agoo/TaobaoRegister;->doAliasOperation(Ljava/lang/String;Landroid/content/Context;Lcom/taobao/agoo/ICallback;Lcom/taobao/agoo/TaobaoRegister$b;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 12
    monitor-exit v0

    return-void

    .line 13
    :cond_1
    :goto_0
    :try_start_1
    sget-object v1, Lcom/taobao/agoo/a;->INVALID_ARG:Lcom/alibaba/sdk/android/error/ErrorCode;

    invoke-virtual {v1}, Lcom/alibaba/sdk/android/error/ErrorCode;->copy()Lcom/alibaba/sdk/android/error/ErrorBuilder;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "removeAlias "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p0, " "

    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v1, p0}, Lcom/alibaba/sdk/android/error/ErrorBuilder;->detail(Ljava/lang/String;)Lcom/alibaba/sdk/android/error/ErrorBuilder;

    move-result-object p0

    .line 14
    invoke-virtual {p0}, Lcom/alibaba/sdk/android/error/ErrorBuilder;->build()Lcom/alibaba/sdk/android/error/ErrorCode;

    move-result-object p0

    .line 15
    invoke-virtual {p0}, Lcom/alibaba/sdk/android/error/ErrorCode;->getCode()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0}, Lcom/alibaba/sdk/android/error/ErrorCode;->getMsg()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p2, p1, p0}, Lcom/taobao/agoo/ICallback;->onFailure(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 16
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p0

    monitor-exit v0

    throw p0
.end method

.method private static removeAliasInList(Landroid/content/Context;Ljava/util/Map;Lcom/taobao/agoo/ICallback;)V
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;",
            "Lcom/taobao/agoo/ICallback;",
            ")V"
        }
    .end annotation

    if-eqz p1, :cond_2

    .line 1
    invoke-interface {p1}, Ljava/util/Map;->size()I

    move-result v0

    if-nez v0, :cond_0

    goto :goto_1

    .line 2
    :cond_0
    new-instance v0, Ljava/util/ArrayList;

    invoke-interface {p1}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 3
    new-instance v1, Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v2, 0x0

    invoke-direct {v1, v2}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    .line 4
    invoke-interface {p1}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    .line 5
    new-instance v4, Lcom/taobao/agoo/TaobaoRegister$2;

    invoke-direct {v4, v0, v3, v1, p2}, Lcom/taobao/agoo/TaobaoRegister$2;-><init>(Ljava/util/ArrayList;Ljava/lang/String;Ljava/util/concurrent/atomic/AtomicBoolean;Lcom/taobao/agoo/ICallback;)V

    new-instance v5, Lcom/taobao/agoo/TaobaoRegister$d;

    .line 6
    invoke-interface {p1, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/String;

    const/4 v7, 0x0

    invoke-direct {v5, v3, v6, v7}, Lcom/taobao/agoo/TaobaoRegister$d;-><init>(Ljava/lang/String;Ljava/lang/String;Lcom/taobao/agoo/c;)V

    const-string v3, "removeAlias"

    .line 7
    invoke-static {v3, p0, v4, v5}, Lcom/taobao/agoo/TaobaoRegister;->doAliasOperation(Ljava/lang/String;Landroid/content/Context;Lcom/taobao/agoo/ICallback;Lcom/taobao/agoo/TaobaoRegister$b;)V

    goto :goto_0

    :cond_1
    return-void

    .line 8
    :cond_2
    :goto_1
    invoke-virtual {p2}, Lcom/taobao/agoo/ICallback;->onSuccess()V

    return-void
.end method

.method public static declared-synchronized removeAllAliasOnCurrentDevice(Landroid/content/Context;Lcom/taobao/agoo/ICallback;)V
    .locals 4

    const-class v0, Lcom/taobao/agoo/TaobaoRegister;

    monitor-enter v0

    :try_start_0
    const-string v1, "TaobaoRegister"

    const-string v2, "removeAllAliasOnCurrentDevice "

    const/4 v3, 0x0

    new-array v3, v3, [Ljava/lang/Object;

    .line 1
    invoke-static {v1, v2, v3}, Lcom/taobao/accs/utl/ALog;->i(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2
    invoke-static {p1}, Lcom/taobao/agoo/TaobaoRegister;->checkNull(Lcom/taobao/agoo/ICallback;)Lcom/taobao/agoo/ICallback;

    move-result-object p1

    if-nez p0, :cond_0

    .line 3
    sget-object v1, Lcom/taobao/agoo/a;->INVALID_ARG:Lcom/alibaba/sdk/android/error/ErrorCode;

    invoke-virtual {v1}, Lcom/alibaba/sdk/android/error/ErrorCode;->copy()Lcom/alibaba/sdk/android/error/ErrorBuilder;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "removeAllAliasOnCurrentDevice "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v1, p0}, Lcom/alibaba/sdk/android/error/ErrorBuilder;->detail(Ljava/lang/String;)Lcom/alibaba/sdk/android/error/ErrorBuilder;

    move-result-object p0

    .line 4
    invoke-virtual {p0}, Lcom/alibaba/sdk/android/error/ErrorBuilder;->build()Lcom/alibaba/sdk/android/error/ErrorCode;

    move-result-object p0

    .line 5
    invoke-virtual {p0}, Lcom/alibaba/sdk/android/error/ErrorCode;->getCode()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0}, Lcom/alibaba/sdk/android/error/ErrorCode;->getMsg()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p1, v1, p0}, Lcom/taobao/agoo/ICallback;->onFailure(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 6
    monitor-exit v0

    return-void

    :cond_0
    :try_start_1
    const-string v1, "removeAllAliasOnCurrentDevice"

    .line 7
    new-instance v2, Lcom/taobao/agoo/TaobaoRegister$e;

    const/4 v3, 0x0

    invoke-direct {v2, v3}, Lcom/taobao/agoo/TaobaoRegister$e;-><init>(Lcom/taobao/agoo/c;)V

    invoke-static {v1, p0, p1, v2}, Lcom/taobao/agoo/TaobaoRegister;->doAliasOperation(Ljava/lang/String;Landroid/content/Context;Lcom/taobao/agoo/ICallback;Lcom/taobao/agoo/TaobaoRegister$b;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 8
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p0

    monitor-exit v0

    throw p0
.end method

.method public static declared-synchronized removeAllAliasOnCurrentDeviceAndAddThisAlias(Landroid/content/Context;Ljava/lang/String;Lcom/taobao/agoo/ICallback;)V
    .locals 4

    const-class v0, Lcom/taobao/agoo/TaobaoRegister;

    monitor-enter v0

    :try_start_0
    const-string v1, "TaobaoRegister"

    .line 1
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "removeAllAliasOnCurrentDeviceAndAddThisAlias alias : "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    new-array v3, v3, [Ljava/lang/Object;

    invoke-static {v1, v2, v3}, Lcom/taobao/accs/utl/ALog;->i(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2
    invoke-static {p2}, Lcom/taobao/agoo/TaobaoRegister;->checkNull(Lcom/taobao/agoo/ICallback;)Lcom/taobao/agoo/ICallback;

    move-result-object p2

    if-eqz p0, :cond_1

    if-nez p1, :cond_0

    goto :goto_0

    :cond_0
    const-string v1, "removeAllAliasOnCurrentDeviceAndAddThisAlias"

    .line 3
    new-instance v2, Lcom/taobao/agoo/TaobaoRegister$h;

    invoke-direct {v2, p1}, Lcom/taobao/agoo/TaobaoRegister$h;-><init>(Ljava/lang/String;)V

    invoke-static {v1, p0, p2, v2}, Lcom/taobao/agoo/TaobaoRegister;->doAliasOperation(Ljava/lang/String;Landroid/content/Context;Lcom/taobao/agoo/ICallback;Lcom/taobao/agoo/TaobaoRegister$b;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 4
    monitor-exit v0

    return-void

    .line 5
    :cond_1
    :goto_0
    :try_start_1
    sget-object p0, Lcom/taobao/agoo/a;->INVALID_ARG:Lcom/alibaba/sdk/android/error/ErrorCode;

    invoke-virtual {p0}, Lcom/alibaba/sdk/android/error/ErrorCode;->copy()Lcom/alibaba/sdk/android/error/ErrorBuilder;

    move-result-object p0

    const-string p1, "removeAllAliasOnCurrentDeviceAndAddThisAlias context is null"

    invoke-virtual {p0, p1}, Lcom/alibaba/sdk/android/error/ErrorBuilder;->detail(Ljava/lang/String;)Lcom/alibaba/sdk/android/error/ErrorBuilder;

    move-result-object p0

    .line 6
    invoke-virtual {p0}, Lcom/alibaba/sdk/android/error/ErrorBuilder;->build()Lcom/alibaba/sdk/android/error/ErrorCode;

    move-result-object p0

    .line 7
    invoke-virtual {p0}, Lcom/alibaba/sdk/android/error/ErrorCode;->getCode()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0}, Lcom/alibaba/sdk/android/error/ErrorCode;->getMsg()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p2, p1, p0}, Lcom/taobao/agoo/ICallback;->onFailure(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 8
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p0

    monitor-exit v0

    throw p0
.end method

.method public static declared-synchronized removeAllDeviceOnThisAliasAndBindCurrentDevice(Landroid/content/Context;Ljava/lang/String;Lcom/taobao/agoo/ICallback;)V
    .locals 4

    const-class v0, Lcom/taobao/agoo/TaobaoRegister;

    monitor-enter v0

    :try_start_0
    const-string v1, "TaobaoRegister"

    .line 1
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "removeAllDeviceOnThisAliasAndBindCurrentDevice alias : "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    new-array v3, v3, [Ljava/lang/Object;

    invoke-static {v1, v2, v3}, Lcom/taobao/accs/utl/ALog;->i(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2
    invoke-static {p2}, Lcom/taobao/agoo/TaobaoRegister;->checkNull(Lcom/taobao/agoo/ICallback;)Lcom/taobao/agoo/ICallback;

    move-result-object p2

    if-eqz p0, :cond_1

    if-nez p1, :cond_0

    goto :goto_0

    :cond_0
    const-string v1, "removeAllDeviceOnThisAliasAndBindCurrentDevice"

    .line 3
    new-instance v2, Lcom/taobao/agoo/TaobaoRegister$f;

    invoke-direct {v2, p1}, Lcom/taobao/agoo/TaobaoRegister$f;-><init>(Ljava/lang/String;)V

    invoke-static {v1, p0, p2, v2}, Lcom/taobao/agoo/TaobaoRegister;->doAliasOperation(Ljava/lang/String;Landroid/content/Context;Lcom/taobao/agoo/ICallback;Lcom/taobao/agoo/TaobaoRegister$b;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 4
    monitor-exit v0

    return-void

    .line 5
    :cond_1
    :goto_0
    :try_start_1
    sget-object p0, Lcom/taobao/agoo/a;->INVALID_ARG:Lcom/alibaba/sdk/android/error/ErrorCode;

    invoke-virtual {p0}, Lcom/alibaba/sdk/android/error/ErrorCode;->copy()Lcom/alibaba/sdk/android/error/ErrorBuilder;

    move-result-object p0

    const-string p1, "removeAllDeviceOnThisAliasAndBindCurrentDevice context is null"

    invoke-virtual {p0, p1}, Lcom/alibaba/sdk/android/error/ErrorBuilder;->detail(Ljava/lang/String;)Lcom/alibaba/sdk/android/error/ErrorBuilder;

    move-result-object p0

    .line 6
    invoke-virtual {p0}, Lcom/alibaba/sdk/android/error/ErrorBuilder;->build()Lcom/alibaba/sdk/android/error/ErrorCode;

    move-result-object p0

    .line 7
    invoke-virtual {p0}, Lcom/alibaba/sdk/android/error/ErrorCode;->getCode()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0}, Lcom/alibaba/sdk/android/error/ErrorCode;->getMsg()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p2, p1, p0}, Lcom/taobao/agoo/ICallback;->onFailure(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 8
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p0

    monitor-exit v0

    throw p0
.end method

.method public static reset()V
    .locals 1

    .line 1
    sget-object v0, Lcom/taobao/agoo/a/b;->b:Lcom/taobao/agoo/a/a;

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {v0}, Lcom/taobao/agoo/a/a;->a()V

    .line 3
    :cond_0
    :try_start_0
    sget-object v0, Lorg/android/agoo/common/Config;->a:Ljava/lang/String;

    invoke-static {v0}, Lcom/taobao/accs/ACCSClient;->getAccsClient(Ljava/lang/String;)Lcom/taobao/accs/ACCSClient;

    move-result-object v0

    invoke-virtual {v0}, Lcom/taobao/accs/ACCSClient;->reset()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    .line 4
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 5
    :goto_0
    invoke-static {}, Lcom/taobao/accs/client/GlobalClientInfo;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lorg/android/agoo/common/Config;->a(Landroid/content/Context;)V

    return-void
.end method

.method public static declared-synchronized resetDeviceAndAliasToOne2One(Landroid/content/Context;Ljava/lang/String;Lcom/taobao/agoo/ICallback;)V
    .locals 4

    const-class v0, Lcom/taobao/agoo/TaobaoRegister;

    monitor-enter v0

    :try_start_0
    const-string v1, "TaobaoRegister"

    .line 1
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "resetDeviceAndAliasToOne2One alias : "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    new-array v3, v3, [Ljava/lang/Object;

    invoke-static {v1, v2, v3}, Lcom/taobao/accs/utl/ALog;->i(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2
    invoke-static {p2}, Lcom/taobao/agoo/TaobaoRegister;->checkNull(Lcom/taobao/agoo/ICallback;)Lcom/taobao/agoo/ICallback;

    move-result-object p2

    if-eqz p0, :cond_1

    if-nez p1, :cond_0

    goto :goto_0

    :cond_0
    const-string v1, "resetDeviceAndAliasToOne2One"

    .line 3
    new-instance v2, Lcom/taobao/agoo/TaobaoRegister$g;

    invoke-direct {v2, p1}, Lcom/taobao/agoo/TaobaoRegister$g;-><init>(Ljava/lang/String;)V

    invoke-static {v1, p0, p2, v2}, Lcom/taobao/agoo/TaobaoRegister;->doAliasOperation(Ljava/lang/String;Landroid/content/Context;Lcom/taobao/agoo/ICallback;Lcom/taobao/agoo/TaobaoRegister$b;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 4
    monitor-exit v0

    return-void

    .line 5
    :cond_1
    :goto_0
    :try_start_1
    sget-object v1, Lcom/taobao/agoo/a;->INVALID_ARG:Lcom/alibaba/sdk/android/error/ErrorCode;

    invoke-virtual {v1}, Lcom/alibaba/sdk/android/error/ErrorCode;->copy()Lcom/alibaba/sdk/android/error/ErrorBuilder;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "resetDeviceAndAliasToOne2One "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p0, " "

    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v1, p0}, Lcom/alibaba/sdk/android/error/ErrorBuilder;->detail(Ljava/lang/String;)Lcom/alibaba/sdk/android/error/ErrorBuilder;

    move-result-object p0

    .line 6
    invoke-virtual {p0}, Lcom/alibaba/sdk/android/error/ErrorBuilder;->build()Lcom/alibaba/sdk/android/error/ErrorCode;

    move-result-object p0

    .line 7
    invoke-virtual {p0}, Lcom/alibaba/sdk/android/error/ErrorCode;->getCode()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0}, Lcom/alibaba/sdk/android/error/ErrorCode;->getMsg()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p2, p1, p0}, Lcom/taobao/agoo/ICallback;->onFailure(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 8
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p0

    monitor-exit v0

    throw p0
.end method

.method private static declared-synchronized sendSwitch(Landroid/content/Context;Lcom/taobao/agoo/ICallback;Z)V
    .locals 8

    const-class v0, Lcom/taobao/agoo/TaobaoRegister;

    monitor-enter v0

    const/4 v1, 0x0

    .line 1
    :try_start_0
    invoke-static {p0}, Lorg/android/agoo/common/Config;->getDeviceToken(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v2

    .line 2
    invoke-static {p0}, Lorg/android/agoo/common/Config;->b(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v3

    .line 3
    invoke-static {p0}, Lcom/taobao/accs/utl/UtilityImpl;->getDeviceId(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v4

    .line 4
    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v5

    if-nez v5, :cond_3

    if-eqz p0, :cond_3

    .line 5
    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v5

    if-eqz v5, :cond_0

    invoke-static {v4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v5

    if-eqz v5, :cond_0

    goto :goto_0

    .line 6
    :cond_0
    invoke-static {p0}, Lorg/android/agoo/common/Config;->d(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v5

    .line 7
    invoke-static {p0, v3, v5}, Lcom/taobao/accs/ACCSManager;->getAccsInstance(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Lcom/taobao/accs/IACCSManager;

    move-result-object v5

    .line 8
    sget-object v6, Lcom/taobao/agoo/TaobaoRegister;->mRequestListener:Lcom/taobao/agoo/a/b;

    if-nez v6, :cond_1

    .line 9
    new-instance v6, Lcom/taobao/agoo/a/b;

    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v7

    invoke-direct {v6, v7}, Lcom/taobao/agoo/a/b;-><init>(Landroid/content/Context;)V

    sput-object v6, Lcom/taobao/agoo/TaobaoRegister;->mRequestListener:Lcom/taobao/agoo/a/b;

    :cond_1
    const-string v6, "AgooDeviceCmd"

    .line 10
    sget-object v7, Lcom/taobao/agoo/TaobaoRegister;->mRequestListener:Lcom/taobao/agoo/a/b;

    invoke-interface {v5, p0, v6, v7}, Lcom/taobao/accs/IACCSManager;->registerDataListener(Landroid/content/Context;Ljava/lang/String;Lcom/taobao/accs/base/AccsAbstractDataListener;)V

    .line 11
    invoke-static {v3, v2, v4, p2}, Lcom/taobao/agoo/a/a/d;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)[B

    move-result-object p2

    .line 12
    new-instance v2, Lcom/taobao/accs/ACCSManager$AccsRequest;

    const-string v3, "AgooDeviceCmd"

    const/4 v4, 0x0

    invoke-direct {v2, v4, v3, p2, v4}, Lcom/taobao/accs/ACCSManager$AccsRequest;-><init>(Ljava/lang/String;Ljava/lang/String;[BLjava/lang/String;)V

    .line 13
    invoke-interface {v5, p0, v2}, Lcom/taobao/accs/IACCSManager;->sendRequest(Landroid/content/Context;Lcom/taobao/accs/ACCSManager$AccsRequest;)Ljava/lang/String;

    move-result-object p0

    .line 14
    invoke-static {p0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p2

    if-eqz p2, :cond_2

    if-eqz p1, :cond_5

    .line 15
    sget-object p0, Lcom/taobao/agoo/a;->ACCS_CHECK_ERROR:Lcom/alibaba/sdk/android/error/ErrorCode;

    invoke-virtual {p0}, Lcom/alibaba/sdk/android/error/ErrorCode;->getCode()Ljava/lang/String;

    move-result-object p2

    .line 16
    invoke-virtual {p0}, Lcom/alibaba/sdk/android/error/ErrorCode;->getMsg()Ljava/lang/String;

    move-result-object p0

    .line 17
    invoke-virtual {p1, p2, p0}, Lcom/taobao/agoo/ICallback;->onFailure(Ljava/lang/String;Ljava/lang/String;)V

    goto/16 :goto_1

    :cond_2
    if-eqz p1, :cond_5

    .line 18
    sget-object p2, Lcom/taobao/agoo/TaobaoRegister;->mRequestListener:Lcom/taobao/agoo/a/b;

    iget-object p2, p2, Lcom/taobao/agoo/a/b;->a:Ljava/util/Map;

    invoke-interface {p2, p0, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto/16 :goto_1

    :cond_3
    :goto_0
    if-eqz p1, :cond_4

    .line 19
    sget-object v5, Lcom/taobao/agoo/a;->INVALID_ARG:Lcom/alibaba/sdk/android/error/ErrorCode;

    invoke-virtual {v5}, Lcom/alibaba/sdk/android/error/ErrorCode;->copy()Lcom/alibaba/sdk/android/error/ErrorBuilder;

    move-result-object v5

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    const-string v7, "sendSwitch "

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v7, " "

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v7, " "

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v7, " "

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    .line 20
    invoke-virtual {v5, v4}, Lcom/alibaba/sdk/android/error/ErrorBuilder;->detail(Ljava/lang/String;)Lcom/alibaba/sdk/android/error/ErrorBuilder;

    move-result-object v4

    .line 21
    invoke-virtual {v4}, Lcom/alibaba/sdk/android/error/ErrorBuilder;->build()Lcom/alibaba/sdk/android/error/ErrorCode;

    move-result-object v4

    .line 22
    invoke-virtual {v4}, Lcom/alibaba/sdk/android/error/ErrorCode;->getCode()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4}, Lcom/alibaba/sdk/android/error/ErrorCode;->getMsg()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {p1, v5, v4}, Lcom/taobao/agoo/ICallback;->onFailure(Ljava/lang/String;Ljava/lang/String;)V

    :cond_4
    const-string p1, "TaobaoRegister"

    const-string v4, "sendSwitch param null"

    const/16 v5, 0x8

    new-array v5, v5, [Ljava/lang/Object;

    const-string v6, "appkey"

    aput-object v6, v5, v1

    const/4 v6, 0x1

    aput-object v3, v5, v6

    const/4 v3, 0x2

    const-string v6, "deviceId"

    aput-object v6, v5, v3

    const/4 v3, 0x3

    aput-object v2, v5, v3

    const/4 v2, 0x4

    const-string v3, "context"

    aput-object v3, v5, v2

    const/4 v2, 0x5

    aput-object p0, v5, v2

    const/4 p0, 0x6

    const-string v2, "enablePush"

    aput-object v2, v5, p0

    const/4 p0, 0x7

    .line 23
    invoke-static {p2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p2

    aput-object p2, v5, p0

    .line 24
    invoke-static {p1, v4, v5}, Lcom/taobao/accs/utl/ALog;->e(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 25
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p0

    :try_start_1
    const-string p1, "TaobaoRegister"

    const-string p2, "sendSwitch"

    new-array v1, v1, [Ljava/lang/Object;

    .line 26
    invoke-static {p1, p2, p0, v1}, Lcom/taobao/accs/utl/ALog;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;[Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 27
    :cond_5
    :goto_1
    monitor-exit v0

    return-void

    :catchall_1
    move-exception p0

    monitor-exit v0

    throw p0
.end method

.method public static declared-synchronized setAccsConfigTag(Landroid/content/Context;Ljava/lang/String;)V
    .locals 7

    const-class v0, Lcom/taobao/agoo/TaobaoRegister;

    monitor-enter v0

    .line 1
    :try_start_0
    sput-object p1, Lorg/android/agoo/common/Config;->a:Ljava/lang/String;

    .line 2
    invoke-static {p1}, Lcom/taobao/accs/AccsClientConfig;->getConfigByTag(Ljava/lang/String;)Lcom/taobao/accs/AccsClientConfig;

    move-result-object p1

    if-eqz p1, :cond_1

    const-string v1, "TaobaoRegister"

    const-string v2, "setAccsConfigTag"

    const/4 v3, 0x2

    new-array v4, v3, [Ljava/lang/Object;

    const/4 v5, 0x0

    const-string v6, "config"

    aput-object v6, v4, v5

    const/4 v5, 0x1

    .line 3
    invoke-virtual {p1}, Lcom/taobao/accs/AccsClientConfig;->toString()Ljava/lang/String;

    move-result-object v6

    aput-object v6, v4, v5

    invoke-static {v1, v2, v4}, Lcom/taobao/accs/utl/ALog;->i(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 4
    invoke-virtual {p1}, Lcom/taobao/accs/AccsClientConfig;->getAuthCode()Ljava/lang/String;

    move-result-object v1

    sput-object v1, Lcom/taobao/accs/client/AdapterGlobalClientInfo;->mAuthCode:Ljava/lang/String;

    .line 5
    invoke-virtual {p1}, Lcom/taobao/accs/AccsClientConfig;->getAppKey()Ljava/lang/String;

    move-result-object v1

    invoke-static {p0, v1}, Lorg/android/agoo/common/Config;->setAgooAppKey(Landroid/content/Context;Ljava/lang/String;)V

    .line 6
    invoke-virtual {p1}, Lcom/taobao/accs/AccsClientConfig;->getAppSecret()Ljava/lang/String;

    move-result-object v1

    sput-object v1, Lcom/taobao/accs/utl/AdapterUtilityImpl;->mAgooAppSecret:Ljava/lang/String;

    .line 7
    invoke-virtual {p1}, Lcom/taobao/accs/AccsClientConfig;->getAppSecret()Ljava/lang/String;

    move-result-object p1

    invoke-static {p0, p1}, Lorg/android/agoo/common/Config;->a(Landroid/content/Context;Ljava/lang/String;)V

    .line 8
    sget-object p1, Lcom/taobao/accs/utl/AdapterUtilityImpl;->mAgooAppSecret:Ljava/lang/String;

    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p1

    if-nez p1, :cond_0

    .line 9
    sput v3, Lcom/taobao/accs/client/AdapterGlobalClientInfo;->mSecurityType:I

    .line 10
    :cond_0
    invoke-static {p0}, Lcom/aliyun/ams/emas/push/l;->c(Landroid/content/Context;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 11
    monitor-exit v0

    return-void

    .line 12
    :cond_1
    :try_start_1
    new-instance p0, Ljava/lang/RuntimeException;

    const-string p1, "accs config not exist!! please set accs config first!!"

    invoke-direct {p0, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :catchall_0
    move-exception p0

    monitor-exit v0

    throw p0
.end method

.method public static setAgooMsgReceiveService(Ljava/lang/String;)V
    .locals 0

    sput-object p0, Lcom/taobao/accs/client/AdapterGlobalClientInfo;->mAgooCustomServiceName:Ljava/lang/String;

    return-void
.end method

.method public static declared-synchronized setAlias(Landroid/content/Context;Ljava/lang/String;Lcom/taobao/agoo/ICallback;)V
    .locals 4

    const-class v0, Lcom/taobao/agoo/TaobaoRegister;

    monitor-enter v0

    :try_start_0
    const-string v1, "TaobaoRegister"

    .line 1
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "setAlias "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    new-array v3, v3, [Ljava/lang/Object;

    invoke-static {v1, v2, v3}, Lcom/taobao/accs/utl/ALog;->i(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2
    invoke-static {p2}, Lcom/taobao/agoo/TaobaoRegister;->checkNull(Lcom/taobao/agoo/ICallback;)Lcom/taobao/agoo/ICallback;

    move-result-object p2

    if-eqz p0, :cond_1

    if-nez p1, :cond_0

    goto :goto_0

    :cond_0
    const-string v1, "listAlias"

    .line 3
    new-instance v2, Lcom/taobao/agoo/TaobaoRegister$4;

    invoke-direct {v2, p0, p2, p1}, Lcom/taobao/agoo/TaobaoRegister$4;-><init>(Landroid/content/Context;Lcom/taobao/agoo/ICallback;Ljava/lang/String;)V

    new-instance p1, Lcom/taobao/agoo/TaobaoRegister$c;

    const/4 p2, 0x0

    invoke-direct {p1, p2}, Lcom/taobao/agoo/TaobaoRegister$c;-><init>(Lcom/taobao/agoo/c;)V

    invoke-static {v1, p0, v2, p1}, Lcom/taobao/agoo/TaobaoRegister;->doAliasOperation(Ljava/lang/String;Landroid/content/Context;Lcom/taobao/agoo/ICallback;Lcom/taobao/agoo/TaobaoRegister$b;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 4
    monitor-exit v0

    return-void

    .line 5
    :cond_1
    :goto_0
    :try_start_1
    sget-object v1, Lcom/taobao/agoo/a;->INVALID_ARG:Lcom/alibaba/sdk/android/error/ErrorCode;

    invoke-virtual {v1}, Lcom/alibaba/sdk/android/error/ErrorCode;->copy()Lcom/alibaba/sdk/android/error/ErrorBuilder;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "setAlias "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p0, " "

    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v1, p0}, Lcom/alibaba/sdk/android/error/ErrorBuilder;->detail(Ljava/lang/String;)Lcom/alibaba/sdk/android/error/ErrorBuilder;

    move-result-object p0

    .line 6
    invoke-virtual {p0}, Lcom/alibaba/sdk/android/error/ErrorBuilder;->build()Lcom/alibaba/sdk/android/error/ErrorCode;

    move-result-object p0

    .line 7
    invoke-virtual {p0}, Lcom/alibaba/sdk/android/error/ErrorCode;->getCode()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0}, Lcom/alibaba/sdk/android/error/ErrorCode;->getMsg()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p2, p1, p0}, Lcom/taobao/agoo/ICallback;->onFailure(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 8
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p0

    monitor-exit v0

    throw p0
.end method

.method public static setBuilderSound(Landroid/content/Context;Ljava/lang/String;)V
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    return-void
.end method

.method public static setDoNotDisturb(IIIILcom/aliyun/ams/emas/push/a;)V
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Lcom/aliyun/ams/emas/push/l;->b(IIIILcom/aliyun/ams/emas/push/a;)V

    return-void
.end method

.method public static setDoNotDisturbMode(Z)V
    .locals 0

    invoke-static {p0}, Lcom/aliyun/ams/emas/push/l;->h(Z)V

    return-void
.end method

.method public static setEnv(Landroid/content/Context;I)V
    .locals 0
    .param p1    # I
        .annotation build Lcom/taobao/accs/AccsClientConfig$ENV;
        .end annotation
    .end param

    invoke-static {p0, p1}, Lcom/taobao/accs/ACCSClient;->setEnvironment(Landroid/content/Context;I)V

    return-void
.end method

.method public static setNotificationIcon(Landroid/content/Context;I)V
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    return-void
.end method

.method public static setNotificationSound(Landroid/content/Context;Z)V
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    return-void
.end method

.method public static setNotificationVibrate(Landroid/content/Context;Z)V
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    return-void
.end method

.method public static setPushMsgReceiveService(Ljava/lang/Class;)V
    .locals 1

    .line 1
    const-class v0, Lcom/aliyun/ams/emas/push/AgooInnerService;

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/taobao/accs/client/AdapterGlobalClientInfo;->mAgooCustomServiceName:Ljava/lang/String;

    .line 2
    invoke-static {p0}, Lcom/aliyun/ams/emas/push/l;->g(Ljava/lang/Class;)V

    return-void
.end method

.method public static setReportPushArrive(Lcom/aliyun/ams/emas/push/d;)V
    .locals 0

    invoke-static {p0}, Lcom/aliyun/ams/emas/push/l;->e(Lcom/aliyun/ams/emas/push/d;)V

    return-void
.end method

.method public static unBindAgoo(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Lorg/android/agoo/common/CallBack;)V
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    const/4 p1, 0x0

    invoke-static {p0, p1}, Lcom/taobao/agoo/TaobaoRegister;->unbindAgoo(Landroid/content/Context;Lcom/taobao/agoo/ICallback;)V

    return-void
.end method

.method public static unbindAgoo(Landroid/content/Context;Lcom/taobao/agoo/ICallback;)V
    .locals 2

    const/4 v0, 0x0

    .line 1
    invoke-static {p0, p1, v0}, Lcom/taobao/agoo/TaobaoRegister;->sendSwitch(Landroid/content/Context;Lcom/taobao/agoo/ICallback;Z)V

    .line 2
    invoke-static {}, Lcom/taobao/accs/utl/UTMini;->getInstance()Lcom/taobao/accs/utl/UTMini;

    move-result-object p1

    invoke-static {p0}, Lcom/taobao/accs/utl/UtilityImpl;->getDeviceId(Landroid/content/Context;)Ljava/lang/String;

    move-result-object p0

    const v0, 0x101d1

    const-string v1, "unregister"

    invoke-virtual {p1, v0, v1, p0}, Lcom/taobao/accs/utl/UTMini;->commitEvent(ILjava/lang/String;Ljava/lang/Object;)V

    return-void
.end method

.method public static unregister(Landroid/content/Context;Lorg/android/agoo/common/CallBack;)V
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    const/4 p1, 0x0

    invoke-static {p0, p1}, Lcom/taobao/agoo/TaobaoRegister;->unbindAgoo(Landroid/content/Context;Lcom/taobao/agoo/ICallback;)V

    return-void
.end method
