.class public Lcom/umeng/commonsdk/internal/utils/b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/umeng/commonsdk/internal/utils/b$a;
    }
.end annotation


# static fields
.field private static final b:Ljava/lang/String; = "BaseStationUtils"

.field private static c:Z = false

.field private static d:Landroid/content/Context;


# instance fields
.field a:Landroid/telephony/PhoneStateListener;

.field private e:Landroid/telephony/TelephonyManager;


# direct methods
.method public static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method private constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    new-instance v0, Lcom/umeng/commonsdk/internal/utils/b$1;

    invoke-direct {v0, p0}, Lcom/umeng/commonsdk/internal/utils/b$1;-><init>(Lcom/umeng/commonsdk/internal/utils/b;)V

    iput-object v0, p0, Lcom/umeng/commonsdk/internal/utils/b;->a:Landroid/telephony/PhoneStateListener;

    if-eqz p1, :cond_0

    :try_start_0
    const-string v0, "phone"

    .line 4
    invoke-virtual {p1, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/telephony/TelephonyManager;

    iput-object p1, p0, Lcom/umeng/commonsdk/internal/utils/b;->e:Landroid/telephony/TelephonyManager;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :catchall_0
    :cond_0
    return-void
.end method

.method public synthetic constructor <init>(Landroid/content/Context;Lcom/umeng/commonsdk/internal/utils/b$1;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/umeng/commonsdk/internal/utils/b;-><init>(Landroid/content/Context;)V

    return-void
.end method

.method public static synthetic a(Lcom/umeng/commonsdk/internal/utils/b;)Landroid/telephony/TelephonyManager;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/umeng/commonsdk/internal/utils/b;->e:Landroid/telephony/TelephonyManager;

    return-object p0
.end method

.method public static synthetic a(Lcom/umeng/commonsdk/internal/utils/b;Landroid/telephony/TelephonyManager;)Landroid/telephony/TelephonyManager;
    .locals 0

    .line 2
    iput-object p1, p0, Lcom/umeng/commonsdk/internal/utils/b;->e:Landroid/telephony/TelephonyManager;

    return-object p1
.end method

.method public static a(Landroid/content/Context;)Lcom/umeng/commonsdk/internal/utils/b;
    .locals 1

    .line 3
    sget-object v0, Lcom/umeng/commonsdk/internal/utils/b;->d:Landroid/content/Context;

    if-nez v0, :cond_0

    if-eqz p0, :cond_0

    .line 4
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p0

    sput-object p0, Lcom/umeng/commonsdk/internal/utils/b;->d:Landroid/content/Context;

    .line 5
    :cond_0
    invoke-static {}, Lcom/umeng/commonsdk/internal/utils/b$a;->a()Lcom/umeng/commonsdk/internal/utils/b;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lcom/umeng/commonsdk/internal/utils/b;)Ljava/lang/String;
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/umeng/commonsdk/internal/utils/b;->e()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d()Landroid/content/Context;
    .locals 1

    .line 1
    sget-object v0, Lcom/umeng/commonsdk/internal/utils/b;->d:Landroid/content/Context;

    .line 2
    .line 3
    return-object v0
.end method

.method private e()Ljava/lang/String;
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    :try_start_0
    sget-object v1, Lcom/umeng/commonsdk/internal/utils/b;->d:Landroid/content/Context;

    .line 3
    .line 4
    const-string v2, "phone"

    .line 5
    .line 6
    invoke-virtual {v1, v2}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    check-cast v1, Landroid/telephony/TelephonyManager;

    .line 11
    .line 12
    if-nez v1, :cond_0

    .line 13
    .line 14
    return-object v0

    .line 15
    :cond_0
    invoke-virtual {v1}, Landroid/telephony/TelephonyManager;->getSimOperator()Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 20
    .line 21
    .line 22
    move-result v2

    .line 23
    if-nez v2, :cond_4

    .line 24
    .line 25
    const-string v2, "46000"

    .line 26
    .line 27
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 28
    .line 29
    .line 30
    move-result v2

    .line 31
    if-nez v2, :cond_3

    .line 32
    .line 33
    const-string v2, "46002"

    .line 34
    .line 35
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 36
    .line 37
    .line 38
    move-result v2

    .line 39
    if-eqz v2, :cond_1

    .line 40
    .line 41
    goto :goto_0

    .line 42
    :cond_1
    const-string v2, "46001"

    .line 43
    .line 44
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 45
    .line 46
    .line 47
    move-result v2

    .line 48
    if-eqz v2, :cond_2

    .line 49
    .line 50
    const-string v0, "\u4e2d\u56fd\u8054\u901a"

    .line 51
    .line 52
    goto :goto_1

    .line 53
    :cond_2
    const-string v2, "46003"

    .line 54
    .line 55
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 56
    .line 57
    .line 58
    move-result v1

    .line 59
    if-eqz v1, :cond_4

    .line 60
    .line 61
    const-string v0, "\u4e2d\u56fd\u7535\u4fe1"

    .line 62
    .line 63
    goto :goto_1

    .line 64
    :cond_3
    :goto_0
    const-string v0, "\u4e2d\u56fd\u79fb\u52a8"
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 65
    .line 66
    :catchall_0
    :cond_4
    :goto_1
    return-object v0
.end method


# virtual methods
.method public declared-synchronized a()Z
    .locals 1

    monitor-enter p0

    .line 6
    :try_start_0
    sget-boolean v0, Lcom/umeng/commonsdk/internal/utils/b;->c:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return v0

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public declared-synchronized b()V
    .locals 5

    monitor-enter p0

    :try_start_0
    const-string v0, "BaseStationUtils"

    const/4 v1, 0x1

    new-array v2, v1, [Ljava/lang/Object;

    const-string v3, "base station registerListener"

    const/4 v4, 0x0

    aput-object v3, v2, v4

    .line 2
    invoke-static {v0, v2}, Lcom/umeng/commonsdk/statistics/common/ULog;->e(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 3
    :try_start_1
    iget-object v0, p0, Lcom/umeng/commonsdk/internal/utils/b;->e:Landroid/telephony/TelephonyManager;

    if-eqz v0, :cond_0

    .line 4
    iget-object v2, p0, Lcom/umeng/commonsdk/internal/utils/b;->a:Landroid/telephony/PhoneStateListener;

    const/16 v3, 0x100

    invoke-virtual {v0, v2, v3}, Landroid/telephony/TelephonyManager;->listen(Landroid/telephony/PhoneStateListener;I)V

    .line 5
    :cond_0
    sput-boolean v1, Lcom/umeng/commonsdk/internal/utils/b;->c:Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 6
    :catchall_0
    monitor-exit p0

    return-void

    :catchall_1
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public declared-synchronized c()V
    .locals 4

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    const-string v0, "BaseStationUtils"

    .line 3
    .line 4
    const/4 v1, 0x1

    .line 5
    new-array v1, v1, [Ljava/lang/Object;

    .line 6
    .line 7
    const-string v2, "base station unRegisterListener"

    .line 8
    .line 9
    const/4 v3, 0x0

    .line 10
    aput-object v2, v1, v3

    .line 11
    .line 12
    invoke-static {v0, v1}, Lcom/umeng/commonsdk/statistics/common/ULog;->e(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 13
    .line 14
    .line 15
    :try_start_1
    iget-object v0, p0, Lcom/umeng/commonsdk/internal/utils/b;->e:Landroid/telephony/TelephonyManager;

    .line 16
    .line 17
    if-eqz v0, :cond_0

    .line 18
    .line 19
    iget-object v1, p0, Lcom/umeng/commonsdk/internal/utils/b;->a:Landroid/telephony/PhoneStateListener;

    .line 20
    .line 21
    invoke-virtual {v0, v1, v3}, Landroid/telephony/TelephonyManager;->listen(Landroid/telephony/PhoneStateListener;I)V

    .line 22
    .line 23
    .line 24
    :cond_0
    sput-boolean v3, Lcom/umeng/commonsdk/internal/utils/b;->c:Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 25
    .line 26
    :catchall_0
    monitor-exit p0

    .line 27
    return-void

    .line 28
    :catchall_1
    move-exception v0

    .line 29
    monitor-exit p0

    .line 30
    throw v0
.end method
