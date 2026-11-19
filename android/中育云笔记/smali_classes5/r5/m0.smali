.class public final Lr5/m0;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static b:Lr5/m0;

.field public static final c:Ljava/lang/Object;


# instance fields
.field public a:Landroid/content/Context;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Ljava/lang/Object;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lr5/m0;->c:Ljava/lang/Object;

    .line 7
    .line 8
    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static a()Lr5/m0;
    .locals 1

    .line 1
    sget-object v0, Lr5/m0;->b:Lr5/m0;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    invoke-static {}, Lr5/m0;->d()V

    .line 6
    .line 7
    .line 8
    :cond_0
    sget-object v0, Lr5/m0;->b:Lr5/m0;

    .line 9
    .line 10
    return-object v0
.end method

.method public static declared-synchronized d()V
    .locals 2

    .line 1
    const-class v0, Lr5/m0;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    sget-object v1, Lr5/m0;->b:Lr5/m0;

    .line 5
    .line 6
    if-nez v1, :cond_0

    .line 7
    .line 8
    new-instance v1, Lr5/m0;

    .line 9
    .line 10
    invoke-direct {v1}, Lr5/m0;-><init>()V

    .line 11
    .line 12
    .line 13
    sput-object v1, Lr5/m0;->b:Lr5/m0;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :catchall_0
    move-exception v1

    .line 17
    goto :goto_1

    .line 18
    :cond_0
    :goto_0
    monitor-exit v0

    .line 19
    return-void

    .line 20
    :goto_1
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 21
    throw v1
.end method


# virtual methods
.method public b(Landroid/content/Context;)V
    .locals 2

    .line 1
    sget-object v0, Lr5/m0;->c:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-object v1, p0, Lr5/m0;->a:Landroid/content/Context;

    .line 5
    .line 6
    if-eqz v1, :cond_0

    .line 7
    .line 8
    const-string p1, "hmsSdk"

    .line 9
    .line 10
    const-string v1, "DataManager already initialized."

    .line 11
    .line 12
    invoke-static {p1, v1}, Lr5/f1;->m(Ljava/lang/String;Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    monitor-exit v0

    .line 16
    return-void

    .line 17
    :catchall_0
    move-exception p1

    .line 18
    goto :goto_0

    .line 19
    :cond_0
    iput-object p1, p0, Lr5/m0;->a:Landroid/content/Context;

    .line 20
    .line 21
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 22
    invoke-static {}, Lr5/z0;->e()Lr5/z0;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    invoke-virtual {v0}, Lr5/z0;->d()Lr5/t;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    iget-object v1, p0, Lr5/m0;->a:Landroid/content/Context;

    .line 31
    .line 32
    invoke-virtual {v0, v1}, Lr5/t;->b(Landroid/content/Context;)V

    .line 33
    .line 34
    .line 35
    invoke-static {}, Lr5/z0;->e()Lr5/z0;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    invoke-virtual {v0}, Lr5/z0;->d()Lr5/t;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    invoke-virtual {p1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object v1

    .line 47
    invoke-virtual {v0, v1}, Lr5/t;->u(Ljava/lang/String;)V

    .line 48
    .line 49
    .line 50
    invoke-static {}, Lr5/b0;->c()Lr5/b0;

    .line 51
    .line 52
    .line 53
    move-result-object v0

    .line 54
    invoke-virtual {v0, p1}, Lr5/b0;->d(Landroid/content/Context;)V

    .line 55
    .line 56
    .line 57
    return-void

    .line 58
    :goto_0
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 59
    throw p1
.end method

.method public c(Ljava/lang/String;)V
    .locals 3

    .line 1
    const-string v0, "HiAnalyticsDataManager.setAppid(String appid) is execute."

    .line 2
    .line 3
    const-string v1, "hmsSdk"

    .line 4
    .line 5
    invoke-static {v1, v0}, Lr5/f1;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, Lr5/m0;->a:Landroid/content/Context;

    .line 9
    .line 10
    if-nez v0, :cond_0

    .line 11
    .line 12
    const-string p1, "sdk is not init"

    .line 13
    .line 14
    invoke-static {v1, p1}, Lr5/f1;->l(Ljava/lang/String;Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    return-void

    .line 18
    :cond_0
    invoke-virtual {v0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    const-string v1, "appID"

    .line 23
    .line 24
    const-string v2, "[a-zA-Z0-9_][a-zA-Z0-9. _-]{0,255}"

    .line 25
    .line 26
    invoke-static {v1, p1, v2, v0}, Lr5/n;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    invoke-static {}, Lr5/z0;->e()Lr5/z0;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    invoke-virtual {v0}, Lr5/z0;->d()Lr5/t;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    invoke-virtual {v0, p1}, Lr5/t;->s(Ljava/lang/String;)V

    .line 39
    .line 40
    .line 41
    return-void
.end method
