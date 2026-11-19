.class Lanet/channel/status/b;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field static volatile a:Landroid/content/Context;

.field static volatile b:Z

.field static volatile c:Lanet/channel/status/NetworkStatusHelper$NetworkStatus;

.field static volatile d:Ljava/lang/String;

.field static volatile e:Ljava/lang/String;

.field static volatile f:Ljava/lang/String;

.field static volatile g:Ljava/lang/String;

.field static volatile h:Ljava/lang/String;

.field static volatile i:Ljava/lang/String;

.field static volatile j:Landroid/util/Pair;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/util/Pair<",
            "Ljava/lang/String;",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field static volatile k:Z

.field static volatile l:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/net/InetAddress;",
            ">;"
        }
    .end annotation
.end field

.field private static m:[Ljava/lang/String;

.field private static volatile n:Z

.field private static volatile o:Z

.field private static p:Landroid/net/ConnectivityManager;

.field private static q:Landroid/telephony/TelephonyManager;

.field private static r:Landroid/net/wifi/WifiManager;

.field private static s:Landroid/telephony/SubscriptionManager;

.field private static t:Ljava/lang/reflect/Method;

.field private static u:Landroid/content/BroadcastReceiver;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    const-string v0, "net.dns1"

    const-string v1, "net.dns2"

    const-string v2, "net.dns3"

    const-string v3, "net.dns4"

    .line 1
    filled-new-array {v0, v1, v2, v3}, [Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lanet/channel/status/b;->m:[Ljava/lang/String;

    const/4 v0, 0x0

    .line 2
    sput-object v0, Lanet/channel/status/b;->a:Landroid/content/Context;

    const/4 v1, 0x0

    .line 3
    sput-boolean v1, Lanet/channel/status/b;->b:Z

    .line 4
    sget-object v2, Lanet/channel/status/NetworkStatusHelper$NetworkStatus;->NONE:Lanet/channel/status/NetworkStatusHelper$NetworkStatus;

    sput-object v2, Lanet/channel/status/b;->c:Lanet/channel/status/NetworkStatusHelper$NetworkStatus;

    const-string v2, "unknown"

    .line 5
    sput-object v2, Lanet/channel/status/b;->d:Ljava/lang/String;

    const-string v3, ""

    .line 6
    sput-object v3, Lanet/channel/status/b;->e:Ljava/lang/String;

    .line 7
    sput-object v3, Lanet/channel/status/b;->f:Ljava/lang/String;

    .line 8
    sput-object v3, Lanet/channel/status/b;->g:Ljava/lang/String;

    .line 9
    sput-object v2, Lanet/channel/status/b;->h:Ljava/lang/String;

    .line 10
    sput-object v3, Lanet/channel/status/b;->i:Ljava/lang/String;

    .line 11
    sput-object v0, Lanet/channel/status/b;->j:Landroid/util/Pair;

    .line 12
    sput-boolean v1, Lanet/channel/status/b;->k:Z

    .line 13
    sget-object v2, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    sput-object v2, Lanet/channel/status/b;->l:Ljava/util/List;

    .line 14
    sput-boolean v1, Lanet/channel/status/b;->n:Z

    .line 15
    sput-boolean v1, Lanet/channel/status/b;->o:Z

    .line 16
    sput-object v0, Lanet/channel/status/b;->p:Landroid/net/ConnectivityManager;

    .line 17
    sput-object v0, Lanet/channel/status/b;->q:Landroid/telephony/TelephonyManager;

    .line 18
    sput-object v0, Lanet/channel/status/b;->r:Landroid/net/wifi/WifiManager;

    .line 19
    sput-object v0, Lanet/channel/status/b;->s:Landroid/telephony/SubscriptionManager;

    .line 20
    new-instance v0, Lanet/channel/status/NetworkStatusMonitor$2;

    invoke-direct {v0}, Lanet/channel/status/NetworkStatusMonitor$2;-><init>()V

    sput-object v0, Lanet/channel/status/b;->u:Landroid/content/BroadcastReceiver;

    return-void
.end method

.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private static a(ILjava/lang/String;)Lanet/channel/status/NetworkStatusHelper$NetworkStatus;
    .locals 0

    packed-switch p0, :pswitch_data_0

    const-string p0, "TD-SCDMA"

    .line 16
    invoke-virtual {p1, p0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result p0

    if-nez p0, :cond_1

    const-string p0, "WCDMA"

    invoke-virtual {p1, p0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result p0

    if-nez p0, :cond_1

    const-string p0, "CDMA2000"

    invoke-virtual {p1, p0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result p0

    if-eqz p0, :cond_0

    goto :goto_0

    .line 17
    :pswitch_0
    sget-object p0, Lanet/channel/status/NetworkStatusHelper$NetworkStatus;->G5:Lanet/channel/status/NetworkStatusHelper$NetworkStatus;

    return-object p0

    .line 18
    :pswitch_1
    sget-object p0, Lanet/channel/status/NetworkStatusHelper$NetworkStatus;->G4:Lanet/channel/status/NetworkStatusHelper$NetworkStatus;

    return-object p0

    .line 19
    :pswitch_2
    sget-object p0, Lanet/channel/status/NetworkStatusHelper$NetworkStatus;->G3:Lanet/channel/status/NetworkStatusHelper$NetworkStatus;

    return-object p0

    .line 20
    :pswitch_3
    sget-object p0, Lanet/channel/status/NetworkStatusHelper$NetworkStatus;->G2:Lanet/channel/status/NetworkStatusHelper$NetworkStatus;

    return-object p0

    .line 21
    :cond_0
    sget-object p0, Lanet/channel/status/NetworkStatusHelper$NetworkStatus;->NONE:Lanet/channel/status/NetworkStatusHelper$NetworkStatus;

    return-object p0

    .line 22
    :cond_1
    :goto_0
    sget-object p0, Lanet/channel/status/NetworkStatusHelper$NetworkStatus;->G3:Lanet/channel/status/NetworkStatusHelper$NetworkStatus;

    return-object p0

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_3
        :pswitch_3
        :pswitch_2
        :pswitch_3
        :pswitch_2
        :pswitch_2
        :pswitch_3
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_2
        :pswitch_2
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method private static a(Ljava/lang/String;)Ljava/lang/String;
    .locals 3

    .line 23
    invoke-static {p0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    const-string v1, "unknown"

    if-nez v0, :cond_7

    .line 24
    sget-object v0, Ljava/util/Locale;->US:Ljava/util/Locale;

    invoke-virtual {p0, v0}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object p0

    const-string v0, "cmwap"

    .line 25
    invoke-virtual {p0, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v2

    if-eqz v2, :cond_0

    return-object v0

    :cond_0
    const-string v0, "uniwap"

    .line 26
    invoke-virtual {p0, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v2

    if-eqz v2, :cond_1

    return-object v0

    :cond_1
    const-string v0, "3gwap"

    .line 27
    invoke-virtual {p0, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v2

    if-eqz v2, :cond_2

    return-object v0

    :cond_2
    const-string v0, "ctwap"

    .line 28
    invoke-virtual {p0, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v2

    if-eqz v2, :cond_3

    return-object v0

    :cond_3
    const-string v0, "cmnet"

    .line 29
    invoke-virtual {p0, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v2

    if-eqz v2, :cond_4

    return-object v0

    :cond_4
    const-string v0, "uninet"

    .line 30
    invoke-virtual {p0, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v2

    if-eqz v2, :cond_5

    return-object v0

    :cond_5
    const-string v0, "3gnet"

    .line 31
    invoke-virtual {p0, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v2

    if-eqz v2, :cond_6

    return-object v0

    :cond_6
    const-string v0, "ctnet"

    .line 32
    invoke-virtual {p0, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result p0

    if-eqz p0, :cond_7

    return-object v0

    :cond_7
    return-object v1
.end method

.method static a()V
    .locals 4

    .line 1
    sget-boolean v0, Lanet/channel/status/b;->n:Z

    if-nez v0, :cond_0

    sget-object v0, Lanet/channel/status/b;->a:Landroid/content/Context;

    if-eqz v0, :cond_0

    .line 2
    new-instance v0, Landroid/content/IntentFilter;

    invoke-direct {v0}, Landroid/content/IntentFilter;-><init>()V

    const-string v1, "android.net.conn.CONNECTIVITY_CHANGE"

    .line 3
    invoke-virtual {v0, v1}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 4
    :try_start_0
    sget-object v1, Lanet/channel/status/b;->a:Landroid/content/Context;

    sget-object v2, Lanet/channel/status/b;->u:Landroid/content/BroadcastReceiver;

    invoke-virtual {v1, v2, v0}, Landroid/content/Context;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    const/4 v0, 0x0

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "awcn.NetworkStatusMonitor"

    const-string v3, "registerReceiver failed"

    .line 5
    invoke-static {v2, v3, v0, v1}, Lanet/channel/util/ALog;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 6
    :goto_0
    invoke-static {}, Lanet/channel/status/b;->d()V

    const/4 v0, 0x1

    .line 7
    sput-boolean v0, Lanet/channel/status/b;->n:Z

    :cond_0
    return-void
.end method

.method private static a(Lanet/channel/status/NetworkStatusHelper$NetworkStatus;Ljava/lang/String;)V
    .locals 0

    .line 8
    sput-object p0, Lanet/channel/status/b;->c:Lanet/channel/status/NetworkStatusHelper$NetworkStatus;

    .line 9
    sput-object p1, Lanet/channel/status/b;->d:Ljava/lang/String;

    const-string p0, ""

    .line 10
    sput-object p0, Lanet/channel/status/b;->e:Ljava/lang/String;

    .line 11
    sput-object p0, Lanet/channel/status/b;->f:Ljava/lang/String;

    .line 12
    sput-object p0, Lanet/channel/status/b;->g:Ljava/lang/String;

    const/4 p1, 0x0

    .line 13
    sput-object p1, Lanet/channel/status/b;->j:Landroid/util/Pair;

    .line 14
    sput-object p0, Lanet/channel/status/b;->h:Ljava/lang/String;

    .line 15
    sput-object p0, Lanet/channel/status/b;->i:Ljava/lang/String;

    return-void
.end method

.method static b()V
    .locals 2

    .line 1
    sget-object v0, Lanet/channel/status/b;->a:Landroid/content/Context;

    if-eqz v0, :cond_0

    .line 2
    sget-object v0, Lanet/channel/status/b;->a:Landroid/content/Context;

    sget-object v1, Lanet/channel/status/b;->u:Landroid/content/BroadcastReceiver;

    invoke-virtual {v0, v1}, Landroid/content/Context;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V

    :cond_0
    return-void
.end method

.method private static b(Ljava/lang/String;)Z
    .locals 3

    .line 3
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/4 v1, 0x0

    const/16 v2, 0x17

    if-lt v0, v2, :cond_0

    .line 4
    sget-object v0, Lanet/channel/status/b;->a:Landroid/content/Context;

    invoke-virtual {v0, p0}, Landroid/content/Context;->checkSelfPermission(Ljava/lang/String;)I

    move-result p0

    if-nez p0, :cond_0

    const/4 v1, 0x1

    :cond_0
    return v1
.end method

.method static c()V
    .locals 3

    .line 1
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x18

    if-lt v0, v1, :cond_1

    sget-boolean v0, Lanet/channel/status/b;->o:Z

    if-nez v0, :cond_1

    .line 2
    invoke-static {}, Lanet/channel/status/b;->e()Landroid/net/NetworkInfo;

    move-result-object v0

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    .line 3
    invoke-virtual {v0}, Landroid/net/NetworkInfo;->isConnected()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    sput-boolean v0, Lanet/channel/status/b;->b:Z

    .line 4
    sget-object v0, Lanet/channel/status/b;->p:Landroid/net/ConnectivityManager;

    new-instance v2, Lanet/channel/status/c;

    invoke-direct {v2}, Lanet/channel/status/c;-><init>()V

    invoke-virtual {v0, v2}, Landroid/net/ConnectivityManager;->registerDefaultNetworkCallback(Landroid/net/ConnectivityManager$NetworkCallback;)V

    .line 5
    sput-boolean v1, Lanet/channel/status/b;->o:Z

    :cond_1
    return-void
.end method

.method static d()V
    .locals 15

    const-string v0, "wifi"

    const-string v1, "unknown"

    const-string v2, "no network"

    const-string v3, "checkNetworkStatus"

    const/4 v4, 0x0

    new-array v5, v4, [Ljava/lang/Object;

    const-string v6, "awcn.NetworkStatusMonitor"

    const-string v7, "[checkNetworkStatus]"

    const/4 v8, 0x0

    .line 1
    invoke-static {v6, v7, v8, v5}, Lanet/channel/util/ALog;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2
    sget-object v5, Lanet/channel/status/b;->c:Lanet/channel/status/NetworkStatusHelper$NetworkStatus;

    .line 3
    sget-object v7, Lanet/channel/status/b;->e:Ljava/lang/String;

    .line 4
    sget-object v9, Lanet/channel/status/b;->f:Ljava/lang/String;

    const/4 v10, 0x1

    .line 5
    :try_start_0
    invoke-static {}, Lanet/channel/status/b;->e()Landroid/net/NetworkInfo;

    move-result-object v11
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    const/4 v12, 0x0

    goto :goto_0

    :catch_0
    move-exception v11

    :try_start_1
    const-string v12, "getNetworkInfo exception"

    new-array v13, v4, [Ljava/lang/Object;

    .line 6
    invoke-static {v6, v12, v8, v11, v13}, Lanet/channel/util/ALog;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;[Ljava/lang/Object;)V

    .line 7
    sget-object v11, Lanet/channel/status/NetworkStatusHelper$NetworkStatus;->NONE:Lanet/channel/status/NetworkStatusHelper$NetworkStatus;

    invoke-static {v11, v1}, Lanet/channel/status/b;->a(Lanet/channel/status/NetworkStatusHelper$NetworkStatus;Ljava/lang/String;)V

    move-object v11, v8

    const/4 v12, 0x1

    :goto_0
    const/4 v13, 0x2

    if-nez v12, :cond_6

    if-eqz v11, :cond_5

    .line 8
    invoke-virtual {v11}, Landroid/net/NetworkInfo;->isConnected()Z

    move-result v12

    if-nez v12, :cond_0

    goto/16 :goto_2

    :cond_0
    const/4 v2, 0x6

    new-array v2, v2, [Ljava/lang/Object;

    const-string v12, "info.isConnected"

    aput-object v12, v2, v4

    .line 9
    invoke-virtual {v11}, Landroid/net/NetworkInfo;->isConnected()Z

    move-result v12

    invoke-static {v12}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v12

    aput-object v12, v2, v10

    const-string v12, "info.isAvailable"

    aput-object v12, v2, v13

    const/4 v12, 0x3

    invoke-virtual {v11}, Landroid/net/NetworkInfo;->isAvailable()Z

    move-result v14

    invoke-static {v14}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v14

    aput-object v14, v2, v12

    const/4 v12, 0x4

    const-string v14, "info.getType"

    aput-object v14, v2, v12

    const/4 v12, 0x5

    invoke-virtual {v11}, Landroid/net/NetworkInfo;->getType()I

    move-result v14

    invoke-static {v14}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v14

    aput-object v14, v2, v12

    invoke-static {v6, v3, v8, v2}, Lanet/channel/util/ALog;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 10
    invoke-virtual {v11}, Landroid/net/NetworkInfo;->getType()I

    move-result v2

    if-nez v2, :cond_2

    .line 11
    invoke-virtual {v11}, Landroid/net/NetworkInfo;->getSubtypeName()Ljava/lang/String;

    move-result-object v0

    .line 12
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    const-string v2, ""

    if-nez v1, :cond_1

    :try_start_2
    const-string v1, " "

    invoke-virtual {v0, v1, v2}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v2

    .line 13
    :cond_1
    invoke-virtual {v11}, Landroid/net/NetworkInfo;->getSubtype()I

    move-result v0

    invoke-static {v0, v2}, Lanet/channel/status/b;->a(ILjava/lang/String;)Lanet/channel/status/NetworkStatusHelper$NetworkStatus;

    move-result-object v0

    invoke-static {v0, v2}, Lanet/channel/status/b;->a(Lanet/channel/status/NetworkStatusHelper$NetworkStatus;Ljava/lang/String;)V

    .line 14
    invoke-virtual {v11}, Landroid/net/NetworkInfo;->getExtraInfo()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lanet/channel/status/b;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lanet/channel/status/b;->e:Ljava/lang/String;

    .line 15
    invoke-static {}, Lanet/channel/status/b;->h()V

    goto :goto_1

    .line 16
    :cond_2
    invoke-virtual {v11}, Landroid/net/NetworkInfo;->getType()I

    move-result v2

    if-ne v2, v10, :cond_4

    .line 17
    sget-object v1, Lanet/channel/status/NetworkStatusHelper$NetworkStatus;->WIFI:Lanet/channel/status/NetworkStatusHelper$NetworkStatus;

    invoke-static {v1, v0}, Lanet/channel/status/b;->a(Lanet/channel/status/NetworkStatusHelper$NetworkStatus;Ljava/lang/String;)V

    .line 18
    invoke-static {}, Lanet/channel/AwcnConfig;->isWifiInfoEnable()Z

    move-result v1

    if-eqz v1, :cond_3

    .line 19
    invoke-static {}, Lanet/channel/status/b;->i()Landroid/net/wifi/WifiInfo;

    move-result-object v1

    if-eqz v1, :cond_3

    const-string v2, "android.permission.ACCESS_FINE_LOCATION"

    .line 20
    invoke-static {v2}, Lanet/channel/status/b;->b(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_3

    .line 21
    invoke-virtual {v1}, Landroid/net/wifi/WifiInfo;->getBSSID()Ljava/lang/String;

    move-result-object v2

    sput-object v2, Lanet/channel/status/b;->g:Ljava/lang/String;

    .line 22
    invoke-virtual {v1}, Landroid/net/wifi/WifiInfo;->getSSID()Ljava/lang/String;

    move-result-object v1

    sput-object v1, Lanet/channel/status/b;->f:Ljava/lang/String;

    .line 23
    :cond_3
    sput-object v0, Lanet/channel/status/b;->h:Ljava/lang/String;

    sput-object v0, Lanet/channel/status/b;->i:Ljava/lang/String;

    .line 24
    invoke-static {}, Lanet/channel/status/b;->j()Landroid/util/Pair;

    move-result-object v0

    sput-object v0, Lanet/channel/status/b;->j:Landroid/util/Pair;

    goto :goto_1

    .line 25
    :cond_4
    sget-object v0, Lanet/channel/status/NetworkStatusHelper$NetworkStatus;->NONE:Lanet/channel/status/NetworkStatusHelper$NetworkStatus;

    invoke-static {v0, v1}, Lanet/channel/status/b;->a(Lanet/channel/status/NetworkStatusHelper$NetworkStatus;Ljava/lang/String;)V

    .line 26
    :goto_1
    invoke-virtual {v11}, Landroid/net/NetworkInfo;->isRoaming()Z

    move-result v0

    sput-boolean v0, Lanet/channel/status/b;->k:Z

    .line 27
    invoke-static {}, Lanet/channel/util/c;->e()V

    goto :goto_3

    .line 28
    :cond_5
    :goto_2
    sget-object v0, Lanet/channel/status/NetworkStatusHelper$NetworkStatus;->NO:Lanet/channel/status/NetworkStatusHelper$NetworkStatus;

    invoke-static {v0, v2}, Lanet/channel/status/b;->a(Lanet/channel/status/NetworkStatusHelper$NetworkStatus;Ljava/lang/String;)V

    new-array v0, v10, [Ljava/lang/Object;

    aput-object v2, v0, v4

    .line 29
    invoke-static {v6, v3, v8, v0}, Lanet/channel/util/ALog;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 30
    :cond_6
    :goto_3
    sget-object v0, Lanet/channel/status/b;->c:Lanet/channel/status/NetworkStatusHelper$NetworkStatus;

    if-ne v0, v5, :cond_7

    sget-object v0, Lanet/channel/status/b;->e:Ljava/lang/String;

    invoke-virtual {v0, v7}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_7

    sget-object v0, Lanet/channel/status/b;->f:Ljava/lang/String;

    invoke-virtual {v0, v9}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_9

    .line 31
    :cond_7
    invoke-static {v13}, Lanet/channel/util/ALog;->isPrintLog(I)Z

    move-result v0

    if-eqz v0, :cond_8

    .line 32
    invoke-static {}, Lanet/channel/status/NetworkStatusHelper;->printNetworkDetail()V

    .line 33
    :cond_8
    sget-object v0, Lanet/channel/status/b;->c:Lanet/channel/status/NetworkStatusHelper$NetworkStatus;

    invoke-static {v0}, Lanet/channel/status/NetworkStatusHelper;->notifyStatusChanged(Lanet/channel/status/NetworkStatusHelper$NetworkStatus;)V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_1

    goto :goto_4

    :catch_1
    move-exception v0

    new-array v1, v4, [Ljava/lang/Object;

    .line 34
    invoke-static {v6, v3, v8, v0, v1}, Lanet/channel/util/ALog;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;[Ljava/lang/Object;)V

    :cond_9
    :goto_4
    return-void
.end method

.method static e()Landroid/net/NetworkInfo;
    .locals 2

    .line 1
    sget-object v0, Lanet/channel/status/b;->p:Landroid/net/ConnectivityManager;

    if-nez v0, :cond_0

    .line 2
    sget-object v0, Lanet/channel/status/b;->a:Landroid/content/Context;

    const-string v1, "connectivity"

    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/net/ConnectivityManager;

    sput-object v0, Lanet/channel/status/b;->p:Landroid/net/ConnectivityManager;

    .line 3
    :cond_0
    sget-object v0, Lanet/channel/status/b;->p:Landroid/net/ConnectivityManager;

    invoke-virtual {v0}, Landroid/net/ConnectivityManager;->getActiveNetworkInfo()Landroid/net/NetworkInfo;

    move-result-object v0

    return-object v0
.end method

.method static f()Ljava/lang/String;
    .locals 9

    const/4 v0, 0x0

    :try_start_0
    const-string v1, "android.os.SystemProperties"

    .line 1
    invoke-static {v1}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v1

    const-string v2, "get"

    const/4 v3, 0x1

    new-array v4, v3, [Ljava/lang/Class;

    .line 2
    const-class v5, Ljava/lang/String;

    const/4 v6, 0x0

    aput-object v5, v4, v6

    invoke-virtual {v1, v2, v4}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v1

    .line 3
    sget-object v2, Lanet/channel/status/b;->m:[Ljava/lang/String;

    array-length v4, v2

    const/4 v5, 0x0

    :goto_0
    if-ge v5, v4, :cond_1

    aget-object v7, v2, v5

    new-array v8, v3, [Ljava/lang/Object;

    aput-object v7, v8, v6

    .line 4
    invoke-virtual {v1, v0, v8}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/lang/String;

    .line 5
    invoke-static {v7}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v8
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    if-nez v8, :cond_0

    return-object v7

    :cond_0
    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    :catch_0
    :cond_1
    return-object v0
.end method

.method static g()I
    .locals 2

    .line 1
    sget-object v0, Lanet/channel/status/b;->p:Landroid/net/ConnectivityManager;

    if-eqz v0, :cond_0

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x18

    if-lt v0, v1, :cond_0

    .line 2
    sget-object v0, Lanet/channel/status/b;->p:Landroid/net/ConnectivityManager;

    invoke-virtual {v0}, Landroid/net/ConnectivityManager;->getRestrictBackgroundStatus()I

    move-result v0

    return v0

    :cond_0
    const/4 v0, -0x1

    return v0
.end method

.method private static h()V
    .locals 4

    .line 1
    :try_start_0
    invoke-static {}, Lanet/channel/AwcnConfig;->isCarrierInfoEnable()Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    const-string v0, "android.permission.READ_PHONE_STATE"

    .line 2
    invoke-static {v0}, Lanet/channel/status/b;->b(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_1

    return-void

    .line 3
    :cond_1
    sget-object v0, Lanet/channel/status/b;->q:Landroid/telephony/TelephonyManager;

    if-nez v0, :cond_2

    .line 4
    sget-object v0, Lanet/channel/status/b;->a:Landroid/content/Context;

    const-string v1, "phone"

    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/telephony/TelephonyManager;

    sput-object v0, Lanet/channel/status/b;->q:Landroid/telephony/TelephonyManager;

    .line 5
    :cond_2
    sget-object v0, Lanet/channel/status/b;->q:Landroid/telephony/TelephonyManager;

    invoke-virtual {v0}, Landroid/telephony/TelephonyManager;->getSimOperator()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lanet/channel/status/b;->i:Ljava/lang/String;

    .line 6
    sget-object v0, Lanet/channel/status/b;->s:Landroid/telephony/SubscriptionManager;

    const/4 v1, 0x0

    if-nez v0, :cond_3

    .line 7
    sget-object v0, Lanet/channel/status/b;->a:Landroid/content/Context;

    invoke-static {v0}, Landroid/telephony/SubscriptionManager;->from(Landroid/content/Context;)Landroid/telephony/SubscriptionManager;

    move-result-object v0

    sput-object v0, Lanet/channel/status/b;->s:Landroid/telephony/SubscriptionManager;

    .line 8
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    const-string v2, "getDefaultDataSubscriptionInfo"

    new-array v3, v1, [Ljava/lang/Class;

    invoke-virtual {v0, v2, v3}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v0

    sput-object v0, Lanet/channel/status/b;->t:Ljava/lang/reflect/Method;

    .line 9
    :cond_3
    sget-object v0, Lanet/channel/status/b;->t:Ljava/lang/reflect/Method;

    if-eqz v0, :cond_4

    .line 10
    sget-object v2, Lanet/channel/status/b;->s:Landroid/telephony/SubscriptionManager;

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v0, v2, v1}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/telephony/SubscriptionInfo;

    .line 11
    invoke-virtual {v0}, Landroid/telephony/SubscriptionInfo;->getCarrierName()Ljava/lang/CharSequence;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lanet/channel/status/b;->h:Ljava/lang/String;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    :cond_4
    return-void
.end method

.method private static i()Landroid/net/wifi/WifiInfo;
    .locals 5

    const/4 v0, 0x0

    .line 1
    :try_start_0
    sget-object v1, Lanet/channel/status/b;->r:Landroid/net/wifi/WifiManager;

    if-nez v1, :cond_0

    .line 2
    sget-object v1, Lanet/channel/status/b;->a:Landroid/content/Context;

    const-string v2, "wifi"

    invoke-virtual {v1, v2}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/net/wifi/WifiManager;

    sput-object v1, Lanet/channel/status/b;->r:Landroid/net/wifi/WifiManager;

    .line 3
    :cond_0
    sget-object v1, Lanet/channel/status/b;->r:Landroid/net/wifi/WifiManager;

    invoke-virtual {v1}, Landroid/net/wifi/WifiManager;->getConnectionInfo()Landroid/net/wifi/WifiInfo;

    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v1

    const/4 v2, 0x0

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "awcn.NetworkStatusMonitor"

    const-string v4, "getWifiInfo"

    .line 4
    invoke-static {v3, v4, v0, v1, v2}, Lanet/channel/util/ALog;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;[Ljava/lang/Object;)V

    :goto_0
    return-object v0
.end method

.method private static j()Landroid/util/Pair;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Landroid/util/Pair<",
            "Ljava/lang/String;",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    :try_start_0
    const-string v0, "http.proxyHost"

    .line 1
    invoke-static {v0}, Ljava/lang/System;->getProperty(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 2
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_0

    const-string v1, "http.proxyPort"

    .line 3
    invoke-static {v1}, Ljava/lang/System;->getProperty(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v1

    .line 4
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Pair;->create(Ljava/lang/Object;Ljava/lang/Object;)Landroid/util/Pair;

    move-result-object v0
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method
