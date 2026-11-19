.class public final Lcom/tendcloud/tenddata/u;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field static final a:Ljava/lang/String; = "events"

.field static final b:Ljava/lang/String; = "config."

.field static final c:Ljava/lang/String; = "hybrid"

.field private static volatile d:Lcom/tendcloud/tenddata/u;


# instance fields
.field private e:Lcom/tendcloud/tenddata/q;

.field private f:Landroid/os/Handler;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    .line 1
    :try_start_0
    invoke-static {}, Lcom/tendcloud/tenddata/u;->a()Lcom/tendcloud/tenddata/u;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 2
    .line 3
    .line 4
    :catchall_0
    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a()Lcom/tendcloud/tenddata/u;
    .locals 2

    .line 1
    sget-object v0, Lcom/tendcloud/tenddata/u;->d:Lcom/tendcloud/tenddata/u;

    if-nez v0, :cond_1

    .line 2
    const-class v0, Lcom/tendcloud/tenddata/u;

    monitor-enter v0

    .line 3
    :try_start_0
    sget-object v1, Lcom/tendcloud/tenddata/u;->d:Lcom/tendcloud/tenddata/u;

    if-nez v1, :cond_0

    .line 4
    new-instance v1, Lcom/tendcloud/tenddata/u;

    invoke-direct {v1}, Lcom/tendcloud/tenddata/u;-><init>()V

    sput-object v1, Lcom/tendcloud/tenddata/u;->d:Lcom/tendcloud/tenddata/u;

    goto :goto_0

    :catchall_0
    move-exception v1

    goto :goto_1

    .line 5
    :cond_0
    :goto_0
    monitor-exit v0

    goto :goto_2

    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1

    .line 6
    :cond_1
    :goto_2
    sget-object v0, Lcom/tendcloud/tenddata/u;->d:Lcom/tendcloud/tenddata/u;

    return-object v0
.end method


# virtual methods
.method public a(Landroid/os/Handler;)V
    .locals 0

    .line 7
    iput-object p1, p0, Lcom/tendcloud/tenddata/u;->f:Landroid/os/Handler;

    return-void
.end method

.method public b()V
    .locals 3

    .line 1
    :try_start_0
    sget-object v0, Lcom/tendcloud/tenddata/zz;->e:Lcom/tendcloud/tenddata/b;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    sget-object v0, Lcom/tendcloud/tenddata/ab;->g:Landroid/content/Context;

    .line 6
    .line 7
    sget-object v1, Lcom/tendcloud/tenddata/a;->UNIVERSAL:Lcom/tendcloud/tenddata/a;

    .line 8
    .line 9
    invoke-static {v0, v1}, Lcom/tendcloud/tenddata/ab;->a(Landroid/content/Context;Lcom/tendcloud/tenddata/a;)Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    sget-object v2, Lcom/tendcloud/tenddata/zz;->e:Lcom/tendcloud/tenddata/b;

    .line 14
    .line 15
    invoke-static {v0, v1, v2}, Lcom/tendcloud/tenddata/q;->a(Landroid/content/Context;Ljava/lang/String;Lcom/tendcloud/tenddata/b;)Lcom/tendcloud/tenddata/q;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    iput-object v0, p0, Lcom/tendcloud/tenddata/u;->e:Lcom/tendcloud/tenddata/q;

    .line 20
    .line 21
    invoke-static {}, Lcom/tendcloud/tenddata/y;->a()Lcom/tendcloud/tenddata/y;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    invoke-virtual {v0}, Lcom/tendcloud/tenddata/y;->d()Landroid/os/Handler;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    const/4 v1, 0x6

    .line 30
    invoke-virtual {v0, v1}, Landroid/os/Handler;->obtainMessage(I)Landroid/os/Message;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    invoke-virtual {v0}, Landroid/os/Message;->sendToTarget()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 35
    .line 36
    .line 37
    :catchall_0
    :cond_0
    return-void
.end method

.method public connectWebSocket(Ljava/lang/String;)V
    .locals 2

    .line 1
    invoke-static {}, Lcom/tendcloud/tenddata/u;->a()Lcom/tendcloud/tenddata/u;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v0, v0, Lcom/tendcloud/tenddata/u;->f:Landroid/os/Handler;

    .line 6
    .line 7
    const/4 v1, 0x1

    .line 8
    invoke-virtual {v0, v1, p1}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    invoke-static {}, Lcom/tendcloud/tenddata/u;->a()Lcom/tendcloud/tenddata/u;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    iget-object v0, v0, Lcom/tendcloud/tenddata/u;->f:Landroid/os/Handler;

    .line 17
    .line 18
    invoke-virtual {v0, p1}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 19
    .line 20
    .line 21
    return-void
.end method
