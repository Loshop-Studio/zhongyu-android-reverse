.class public Lcom/taobao/sophix/d/c/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/taobao/sophix/d/c/a$a;
    }
.end annotation


# instance fields
.field private a:I

.field private b:Ljava/lang/String;

.field private c:Ljava/lang/String;


# direct methods
.method private constructor <init>()V
    .locals 1

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 3
    iput v0, p0, Lcom/taobao/sophix/d/c/a;->a:I

    .line 4
    const-string v0, "UNKNOWN"

    iput-object v0, p0, Lcom/taobao/sophix/d/c/a;->b:Ljava/lang/String;

    .line 5
    iput-object v0, p0, Lcom/taobao/sophix/d/c/a;->c:Ljava/lang/String;

    return-void
.end method

.method public synthetic constructor <init>(Lcom/taobao/sophix/d/c/a$1;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/taobao/sophix/d/c/a;-><init>()V

    return-void
.end method

.method public static a()Lcom/taobao/sophix/d/c/a;
    .locals 1

    .line 1
    invoke-static {}, Lcom/taobao/sophix/d/c/a$a;->a()Lcom/taobao/sophix/d/c/a;

    move-result-object v0

    return-object v0
.end method

.method private b(Landroid/content/Context;)V
    .locals 2

    .line 2
    invoke-direct {p0, p1}, Lcom/taobao/sophix/d/c/a;->f(Landroid/content/Context;)I

    move-result v0

    .line 3
    iput v0, p0, Lcom/taobao/sophix/d/c/a;->a:I

    const/4 v1, 0x1

    if-eq v0, v1, :cond_1

    const/4 v1, 0x2

    if-eq v0, v1, :cond_0

    const/4 v1, 0x3

    if-eq v0, v1, :cond_0

    const/4 v1, 0x4

    if-eq v0, v1, :cond_0

    goto :goto_0

    .line 4
    :cond_0
    invoke-direct {p0, p1}, Lcom/taobao/sophix/d/c/a;->c(Landroid/content/Context;)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/taobao/sophix/d/c/a;->b:Ljava/lang/String;

    goto :goto_0

    .line 5
    :cond_1
    invoke-direct {p0, p1}, Lcom/taobao/sophix/d/c/a;->d(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/taobao/sophix/d/c/a;->b:Ljava/lang/String;

    .line 6
    invoke-direct {p0, p1}, Lcom/taobao/sophix/d/c/a;->e(Landroid/content/Context;)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/taobao/sophix/d/c/a;->c:Ljava/lang/String;

    .line 7
    :goto_0
    iget-object p1, p0, Lcom/taobao/sophix/d/c/a;->b:Ljava/lang/String;

    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p1

    if-eqz p1, :cond_2

    .line 8
    const-string p1, "UNKNOWN"

    iput-object p1, p0, Lcom/taobao/sophix/d/c/a;->b:Ljava/lang/String;

    :cond_2
    return-void
.end method

.method private c(Landroid/content/Context;)Ljava/lang/String;
    .locals 1

    .line 2
    :try_start_0
    const-string v0, "phone"

    invoke-virtual {p1, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/telephony/TelephonyManager;

    .line 3
    invoke-virtual {p1}, Landroid/telephony/TelephonyManager;->getSimOperator()Ljava/lang/String;

    move-result-object p1

    .line 4
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez v0, :cond_0

    return-object p1

    :catchall_0
    :cond_0
    const/4 p1, 0x0

    .line 5
    invoke-static {p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method private d(Landroid/content/Context;)Ljava/lang/String;
    .locals 2

    const/4 p1, 0x0

    .line 7
    :try_start_0
    sget-object v0, Lcom/taobao/sophix/b/b;->b:Landroid/app/Application;

    const-string v1, "wifi"

    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/net/wifi/WifiManager;

    .line 8
    invoke-virtual {v0}, Landroid/net/wifi/WifiManager;->getConnectionInfo()Landroid/net/wifi/WifiInfo;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 9
    invoke-virtual {v0}, Landroid/net/wifi/WifiInfo;->getSSID()Ljava/lang/String;

    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :catchall_0
    :cond_0
    return-object p1
.end method

.method private e(Landroid/content/Context;)Ljava/lang/String;
    .locals 2

    .line 1
    const/4 p1, 0x0

    .line 2
    :try_start_0
    sget-object v0, Lcom/taobao/sophix/b/b;->b:Landroid/app/Application;

    .line 3
    .line 4
    const-string v1, "wifi"

    .line 5
    .line 6
    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    check-cast v0, Landroid/net/wifi/WifiManager;

    .line 11
    .line 12
    invoke-virtual {v0}, Landroid/net/wifi/WifiManager;->getConnectionInfo()Landroid/net/wifi/WifiInfo;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    if-eqz v0, :cond_0

    .line 17
    .line 18
    invoke-virtual {v0}, Landroid/net/wifi/WifiInfo;->getBSSID()Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 22
    :catchall_0
    :cond_0
    return-object p1
.end method

.method private f(Landroid/content/Context;)I
    .locals 4

    .line 1
    const/16 v0, 0xff

    .line 2
    .line 3
    :try_start_0
    const-string v1, "connectivity"

    .line 4
    .line 5
    invoke-virtual {p1, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    check-cast p1, Landroid/net/ConnectivityManager;

    .line 10
    .line 11
    const/4 v1, 0x0

    .line 12
    if-nez p1, :cond_0

    .line 13
    .line 14
    return v1

    .line 15
    :cond_0
    invoke-virtual {p1}, Landroid/net/ConnectivityManager;->getActiveNetworkInfo()Landroid/net/NetworkInfo;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    if-nez p1, :cond_1

    .line 20
    .line 21
    return v0

    .line 22
    :cond_1
    invoke-virtual {p1}, Landroid/net/NetworkInfo;->isAvailable()Z

    .line 23
    .line 24
    .line 25
    move-result v2

    .line 26
    if-eqz v2, :cond_5

    .line 27
    .line 28
    invoke-virtual {p1}, Landroid/net/NetworkInfo;->isConnected()Z

    .line 29
    .line 30
    .line 31
    move-result v2

    .line 32
    if-nez v2, :cond_2

    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_2
    invoke-virtual {p1}, Landroid/net/NetworkInfo;->getType()I

    .line 36
    .line 37
    .line 38
    move-result v2

    .line 39
    const/4 v3, 0x1

    .line 40
    if-ne v2, v3, :cond_3

    .line 41
    .line 42
    return v3

    .line 43
    :cond_3
    invoke-virtual {p1}, Landroid/net/NetworkInfo;->getType()I

    .line 44
    .line 45
    .line 46
    move-result v2

    .line 47
    if-nez v2, :cond_4

    .line 48
    .line 49
    invoke-virtual {p1}, Landroid/net/NetworkInfo;->getSubtype()I

    .line 50
    .line 51
    .line 52
    move-result p1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 53
    packed-switch p1, :pswitch_data_0

    .line 54
    .line 55
    .line 56
    :pswitch_0
    return v1

    .line 57
    :pswitch_1
    const/4 p1, 0x4

    .line 58
    return p1

    .line 59
    :pswitch_2
    const/4 p1, 0x3

    .line 60
    return p1

    .line 61
    :pswitch_3
    const/4 p1, 0x2

    .line 62
    return p1

    .line 63
    :cond_4
    return v1

    .line 64
    :catch_0
    :cond_5
    :goto_0
    return v0

    .line 65
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
        :pswitch_0
        :pswitch_1
        :pswitch_0
        :pswitch_2
    .end packed-switch
.end method


# virtual methods
.method public a(Landroid/content/Context;)V
    .locals 0

    .line 2
    invoke-direct {p0, p1}, Lcom/taobao/sophix/d/c/a;->b(Landroid/content/Context;)V

    return-void
.end method

.method public b()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/taobao/sophix/d/c/a;->b:Ljava/lang/String;

    return-object v0
.end method

.method public c()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/taobao/sophix/d/c/a;->a:I

    return v0
.end method

.method public d()Ljava/lang/String;
    .locals 2

    .line 1
    invoke-static {}, Lcom/taobao/sophix/d/c/a;->a()Lcom/taobao/sophix/d/c/a;

    move-result-object v0

    invoke-virtual {v0}, Lcom/taobao/sophix/d/c/a;->c()I

    move-result v0

    const/4 v1, 0x1

    if-eq v0, v1, :cond_3

    const/4 v1, 0x2

    if-eq v0, v1, :cond_2

    const/4 v1, 0x3

    if-eq v0, v1, :cond_1

    const/4 v1, 0x4

    if-eq v0, v1, :cond_0

    .line 2
    const-string v0, "UNKNOWN"

    return-object v0

    .line 3
    :cond_0
    const-string v0, "4G"

    return-object v0

    .line 4
    :cond_1
    const-string v0, "3G"

    return-object v0

    .line 5
    :cond_2
    const-string v0, "2G"

    return-object v0

    .line 6
    :cond_3
    const-string v0, "WIFI"

    return-object v0
.end method
