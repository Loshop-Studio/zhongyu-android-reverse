.class Lcom/taobao/accs/net/w$a;
.super Ljava/lang/Thread;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/taobao/accs/net/w;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "a"
.end annotation


# instance fields
.field public a:I

.field b:J

.field final synthetic c:Lcom/taobao/accs/net/w;

.field private final d:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lcom/taobao/accs/net/w;Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/taobao/accs/net/w$a;->c:Lcom/taobao/accs/net/w;

    .line 2
    invoke-direct {p0, p2}, Ljava/lang/Thread;-><init>(Ljava/lang/String;)V

    .line 3
    invoke-virtual {p0}, Ljava/lang/Thread;->getName()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/taobao/accs/net/w$a;->d:Ljava/lang/String;

    const/4 p1, 0x0

    .line 4
    iput p1, p0, Lcom/taobao/accs/net/w$a;->a:I

    return-void
.end method

.method private a(Z)V
    .locals 10

    .line 1
    iget-object v0, p0, Lcom/taobao/accs/net/w$a;->c:Lcom/taobao/accs/net/w;

    invoke-static {v0}, Lcom/taobao/accs/net/w;->b(Lcom/taobao/accs/net/w;)I

    move-result v0

    const-wide/16 v1, 0x1388

    const/4 v3, 0x0

    const/4 v4, 0x1

    if-eq v0, v4, :cond_5

    .line 2
    iget-object v0, p0, Lcom/taobao/accs/net/w$a;->c:Lcom/taobao/accs/net/w;

    invoke-virtual {v0}, Lcom/taobao/accs/net/w;->d()Ljava/lang/String;

    move-result-object v0

    const/4 v5, 0x2

    new-array v6, v5, [Ljava/lang/Object;

    const-string v7, "force"

    aput-object v7, v6, v3

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v8

    aput-object v8, v6, v4

    const-string v8, "tryConnect"

    invoke-static {v0, v8, v6}, Lcom/taobao/accs/utl/ALog;->d(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    if-eqz p1, :cond_0

    .line 3
    iput v3, p0, Lcom/taobao/accs/net/w$a;->a:I

    .line 4
    :cond_0
    iget-object v0, p0, Lcom/taobao/accs/net/w$a;->d:Ljava/lang/String;

    const/4 v6, 0x4

    new-array v9, v6, [Ljava/lang/Object;

    aput-object v7, v9, v3

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    aput-object p1, v9, v4

    const-string p1, "failTimes"

    aput-object p1, v9, v5

    iget p1, p0, Lcom/taobao/accs/net/w$a;->a:I

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    const/4 v7, 0x3

    aput-object p1, v9, v7

    invoke-static {v0, v8, v9}, Lcom/taobao/accs/utl/ALog;->i(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 5
    iget-object p1, p0, Lcom/taobao/accs/net/w$a;->c:Lcom/taobao/accs/net/w;

    invoke-static {p1}, Lcom/taobao/accs/net/w;->b(Lcom/taobao/accs/net/w;)I

    move-result p1

    if-eq p1, v4, :cond_1

    iget p1, p0, Lcom/taobao/accs/net/w$a;->a:I

    if-lt p1, v6, :cond_1

    .line 6
    iget-object p1, p0, Lcom/taobao/accs/net/w$a;->c:Lcom/taobao/accs/net/w;

    invoke-static {p1, v4}, Lcom/taobao/accs/net/w;->a(Lcom/taobao/accs/net/w;Z)Z

    .line 7
    iget-object p1, p0, Lcom/taobao/accs/net/w$a;->d:Ljava/lang/String;

    new-array v0, v5, [Ljava/lang/Object;

    const-string v1, "maxTimes"

    aput-object v1, v0, v3

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    aput-object v1, v0, v4

    const-string v1, "tryConnect fail"

    invoke-static {p1, v1, v0}, Lcom/taobao/accs/utl/ALog;->e(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    goto/16 :goto_1

    .line 8
    :cond_1
    iget-object p1, p0, Lcom/taobao/accs/net/w$a;->c:Lcom/taobao/accs/net/w;

    invoke-static {p1}, Lcom/taobao/accs/net/w;->b(Lcom/taobao/accs/net/w;)I

    move-result p1

    if-eq p1, v4, :cond_6

    .line 9
    iget-object p1, p0, Lcom/taobao/accs/net/w$a;->c:Lcom/taobao/accs/net/w;

    iget p1, p1, Lcom/taobao/accs/net/b;->c:I

    if-ne p1, v4, :cond_2

    iget p1, p0, Lcom/taobao/accs/net/w$a;->a:I

    if-nez p1, :cond_2

    .line 10
    iget-object p1, p0, Lcom/taobao/accs/net/w$a;->d:Ljava/lang/String;

    new-array v0, v3, [Ljava/lang/Object;

    const-string v1, "tryConnect in app, no sleep"

    invoke-static {p1, v1, v0}, Lcom/taobao/accs/utl/ALog;->i(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0

    .line 11
    :cond_2
    iget-object p1, p0, Lcom/taobao/accs/net/w$a;->d:Ljava/lang/String;

    new-array v0, v3, [Ljava/lang/Object;

    const-string v5, "tryConnect, need sleep"

    invoke-static {p1, v5, v0}, Lcom/taobao/accs/utl/ALog;->i(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 12
    :try_start_0
    invoke-static {v1, v2}, Ljava/lang/Thread;->sleep(J)V
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    .line 13
    invoke-virtual {p1}, Ljava/lang/InterruptedException;->printStackTrace()V

    .line 14
    :goto_0
    iget-object p1, p0, Lcom/taobao/accs/net/w$a;->c:Lcom/taobao/accs/net/w;

    const-string v0, ""

    invoke-static {p1, v0}, Lcom/taobao/accs/net/w;->a(Lcom/taobao/accs/net/w;Ljava/lang/String;)Ljava/lang/String;

    .line 15
    iget p1, p0, Lcom/taobao/accs/net/w$a;->a:I

    if-ne p1, v7, :cond_3

    .line 16
    iget-object p1, p0, Lcom/taobao/accs/net/w$a;->c:Lcom/taobao/accs/net/w;

    invoke-static {p1}, Lcom/taobao/accs/net/w;->e(Lcom/taobao/accs/net/w;)Lcom/taobao/accs/net/g;

    move-result-object p1

    iget-object v0, p0, Lcom/taobao/accs/net/w$a;->c:Lcom/taobao/accs/net/w;

    invoke-virtual {v0}, Lcom/taobao/accs/net/w;->r()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/taobao/accs/net/g;->b(Ljava/lang/String;)V

    .line 17
    :cond_3
    iget-object p1, p0, Lcom/taobao/accs/net/w$a;->c:Lcom/taobao/accs/net/w;

    const/4 v0, 0x0

    invoke-static {p1, v0}, Lcom/taobao/accs/net/w;->b(Lcom/taobao/accs/net/w;Ljava/lang/String;)V

    .line 18
    iget-object p1, p0, Lcom/taobao/accs/net/w$a;->c:Lcom/taobao/accs/net/w;

    invoke-static {p1}, Lcom/taobao/accs/net/w;->c(Lcom/taobao/accs/net/w;)Lcom/taobao/accs/ut/monitor/SessionMonitor;

    move-result-object p1

    iget v0, p0, Lcom/taobao/accs/net/w$a;->a:I

    invoke-virtual {p1, v0}, Lcom/taobao/accs/ut/monitor/SessionMonitor;->setRetryTimes(I)V

    .line 19
    iget-object p1, p0, Lcom/taobao/accs/net/w$a;->c:Lcom/taobao/accs/net/w;

    invoke-static {p1}, Lcom/taobao/accs/net/w;->b(Lcom/taobao/accs/net/w;)I

    move-result p1

    if-eq p1, v4, :cond_4

    .line 20
    iget p1, p0, Lcom/taobao/accs/net/w$a;->a:I

    add-int/2addr p1, v4

    iput p1, p0, Lcom/taobao/accs/net/w$a;->a:I

    .line 21
    iget-object p1, p0, Lcom/taobao/accs/net/w$a;->d:Ljava/lang/String;

    new-array v0, v3, [Ljava/lang/Object;

    const-string v1, "try connect fail, ready for reconnect"

    invoke-static {p1, v1, v0}, Lcom/taobao/accs/utl/ALog;->e(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 22
    invoke-direct {p0, v3}, Lcom/taobao/accs/net/w$a;->a(Z)V

    goto :goto_1

    .line 23
    :cond_4
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/taobao/accs/net/w$a;->b:J

    goto :goto_1

    .line 24
    :cond_5
    iget-object p1, p0, Lcom/taobao/accs/net/w$a;->c:Lcom/taobao/accs/net/w;

    invoke-static {p1}, Lcom/taobao/accs/net/w;->b(Lcom/taobao/accs/net/w;)I

    move-result p1

    if-ne p1, v4, :cond_6

    .line 25
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v4

    iget-wide v6, p0, Lcom/taobao/accs/net/w$a;->b:J

    sub-long/2addr v4, v6

    cmp-long p1, v4, v1

    if-lez p1, :cond_6

    .line 26
    iput v3, p0, Lcom/taobao/accs/net/w$a;->a:I

    :cond_6
    :goto_1
    return-void
.end method


# virtual methods
.method public run()V
    .locals 20

    move-object/from16 v1, p0

    .line 1
    iget-object v0, v1, Lcom/taobao/accs/net/w$a;->d:Ljava/lang/String;

    const-string v2, "NetworkThread run"

    const/4 v3, 0x0

    new-array v4, v3, [Ljava/lang/Object;

    invoke-static {v0, v2, v4}, Lcom/taobao/accs/utl/ALog;->i(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2
    iput v3, v1, Lcom/taobao/accs/net/w$a;->a:I

    const/4 v0, 0x0

    .line 3
    :goto_0
    iget-object v2, v1, Lcom/taobao/accs/net/w$a;->c:Lcom/taobao/accs/net/w;

    invoke-static {v2}, Lcom/taobao/accs/net/w;->f(Lcom/taobao/accs/net/w;)Z

    move-result v2

    if-eqz v2, :cond_1e

    .line 4
    iget-object v2, v1, Lcom/taobao/accs/net/w$a;->d:Ljava/lang/String;

    const-string v4, "ready to get message"

    new-array v5, v3, [Ljava/lang/Object;

    invoke-static {v2, v4, v5}, Lcom/taobao/accs/utl/ALog;->d(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 5
    iget-object v2, v1, Lcom/taobao/accs/net/w$a;->c:Lcom/taobao/accs/net/w;

    invoke-static {v2}, Lcom/taobao/accs/net/w;->a(Lcom/taobao/accs/net/w;)Ljava/util/LinkedList;

    move-result-object v2

    monitor-enter v2

    .line 6
    :try_start_0
    iget-object v4, v1, Lcom/taobao/accs/net/w$a;->c:Lcom/taobao/accs/net/w;

    invoke-static {v4}, Lcom/taobao/accs/net/w;->a(Lcom/taobao/accs/net/w;)Ljava/util/LinkedList;

    move-result-object v4

    invoke-virtual {v4}, Ljava/util/LinkedList;->size()I

    move-result v4
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_e

    if-nez v4, :cond_0

    .line 7
    :try_start_1
    iget-object v4, v1, Lcom/taobao/accs/net/w$a;->d:Ljava/lang/String;

    const-string v5, "no message, wait"

    new-array v6, v3, [Ljava/lang/Object;

    invoke-static {v4, v5, v6}, Lcom/taobao/accs/utl/ALog;->d(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 8
    iget-object v4, v1, Lcom/taobao/accs/net/w$a;->c:Lcom/taobao/accs/net/w;

    invoke-static {v4}, Lcom/taobao/accs/net/w;->a(Lcom/taobao/accs/net/w;)Ljava/util/LinkedList;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/Object;->wait()V
    :try_end_1
    .catch Ljava/lang/InterruptedException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_e

    goto :goto_1

    :catch_0
    move-exception v0

    .line 9
    :try_start_2
    invoke-virtual {v0}, Ljava/lang/InterruptedException;->printStackTrace()V

    .line 10
    monitor-exit v2

    goto/16 :goto_c

    .line 11
    :cond_0
    :goto_1
    iget-object v4, v1, Lcom/taobao/accs/net/w$a;->d:Ljava/lang/String;

    const-string v5, "try get message"

    new-array v6, v3, [Ljava/lang/Object;

    invoke-static {v4, v5, v6}, Lcom/taobao/accs/utl/ALog;->d(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 12
    iget-object v4, v1, Lcom/taobao/accs/net/w$a;->c:Lcom/taobao/accs/net/w;

    invoke-static {v4}, Lcom/taobao/accs/net/w;->a(Lcom/taobao/accs/net/w;)Ljava/util/LinkedList;

    move-result-object v4

    invoke-virtual {v4}, Ljava/util/LinkedList;->size()I

    move-result v4

    if-eqz v4, :cond_1

    .line 13
    iget-object v0, v1, Lcom/taobao/accs/net/w$a;->c:Lcom/taobao/accs/net/w;

    invoke-static {v0}, Lcom/taobao/accs/net/w;->a(Lcom/taobao/accs/net/w;)Ljava/util/LinkedList;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/LinkedList;->getFirst()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/taobao/accs/data/Message;

    .line 14
    invoke-virtual {v0}, Lcom/taobao/accs/data/Message;->e()Lcom/taobao/accs/ut/monitor/NetPerformanceMonitor;

    move-result-object v4

    if-eqz v4, :cond_1

    .line 15
    invoke-virtual {v0}, Lcom/taobao/accs/data/Message;->e()Lcom/taobao/accs/ut/monitor/NetPerformanceMonitor;

    move-result-object v4

    invoke-virtual {v4}, Lcom/taobao/accs/ut/monitor/NetPerformanceMonitor;->onTakeFromQueue()V

    :cond_1
    move-object v4, v0

    .line 16
    monitor-exit v2
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_e

    .line 17
    iget-object v0, v1, Lcom/taobao/accs/net/w$a;->c:Lcom/taobao/accs/net/w;

    invoke-static {v0}, Lcom/taobao/accs/net/w;->f(Lcom/taobao/accs/net/w;)Z

    move-result v0

    if-nez v0, :cond_2

    goto/16 :goto_c

    :cond_2
    if-eqz v4, :cond_1d

    .line 18
    iget-object v0, v1, Lcom/taobao/accs/net/w$a;->d:Ljava/lang/String;

    const-string v2, "sendMessage not null"

    new-array v5, v3, [Ljava/lang/Object;

    invoke-static {v0, v2, v5}, Lcom/taobao/accs/utl/ALog;->d(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    const/16 v2, 0xc9

    const/16 v5, 0x64

    const/4 v6, 0x1

    .line 19
    :try_start_3
    invoke-virtual {v4}, Lcom/taobao/accs/data/Message;->a()I

    move-result v0

    .line 20
    iget-object v7, v1, Lcom/taobao/accs/net/w$a;->d:Ljava/lang/String;

    const-string v8, "sendMessage"

    const/4 v9, 0x4

    new-array v10, v9, [Ljava/lang/Object;

    const-string v11, "type"

    aput-object v11, v10, v3

    invoke-static {v0}, Lcom/taobao/accs/data/Message$c;->b(I)Ljava/lang/String;

    move-result-object v11

    aput-object v11, v10, v6

    const-string v11, "status"

    const/4 v12, 0x2

    aput-object v11, v10, v12

    iget-object v11, v1, Lcom/taobao/accs/net/w$a;->c:Lcom/taobao/accs/net/w;

    invoke-static {v11}, Lcom/taobao/accs/net/w;->b(Lcom/taobao/accs/net/w;)I

    move-result v11

    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v11

    const/4 v13, 0x3

    aput-object v11, v10, v13

    invoke-static {v7, v8, v10}, Lcom/taobao/accs/utl/ALog;->i(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    if-ne v0, v12, :cond_6

    .line 21
    iget-object v0, v1, Lcom/taobao/accs/net/w$a;->c:Lcom/taobao/accs/net/w;

    iget v0, v0, Lcom/taobao/accs/net/b;->c:I

    if-ne v0, v6, :cond_3

    .line 22
    iget-object v0, v1, Lcom/taobao/accs/net/w$a;->d:Ljava/lang/String;

    const-string v7, "sendMessage INAPP ping, skip"

    new-array v8, v3, [Ljava/lang/Object;

    invoke-static {v0, v7, v8}, Lcom/taobao/accs/utl/ALog;->d(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_6

    .line 23
    :try_start_4
    iget-object v0, v1, Lcom/taobao/accs/net/w$a;->d:Ljava/lang/String;

    const-string v2, "send succ, remove it"

    new-array v5, v3, [Ljava/lang/Object;

    invoke-static {v0, v2, v5}, Lcom/taobao/accs/utl/ALog;->d(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 24
    iget-object v0, v1, Lcom/taobao/accs/net/w$a;->c:Lcom/taobao/accs/net/w;

    invoke-static {v0}, Lcom/taobao/accs/net/w;->a(Lcom/taobao/accs/net/w;)Ljava/util/LinkedList;

    move-result-object v2

    monitor-enter v2
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 25
    :try_start_5
    iget-object v0, v1, Lcom/taobao/accs/net/w$a;->c:Lcom/taobao/accs/net/w;

    invoke-static {v0}, Lcom/taobao/accs/net/w;->a(Lcom/taobao/accs/net/w;)Ljava/util/LinkedList;

    move-result-object v0

    invoke-virtual {v0, v4}, Ljava/util/LinkedList;->remove(Ljava/lang/Object;)Z

    .line 26
    monitor-exit v2

    goto/16 :goto_b

    :catchall_0
    move-exception v0

    monitor-exit v2
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    :try_start_6
    throw v0
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_1

    :catchall_1
    move-exception v0

    .line 27
    iget-object v2, v1, Lcom/taobao/accs/net/w$a;->d:Ljava/lang/String;

    const-string v5, " run finally error"

    new-array v6, v3, [Ljava/lang/Object;

    invoke-static {v2, v5, v0, v6}, Lcom/taobao/accs/utl/ALog;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;[Ljava/lang/Object;)V

    goto/16 :goto_b

    .line 28
    :cond_3
    :try_start_7
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v7

    iget-object v0, v1, Lcom/taobao/accs/net/w$a;->c:Lcom/taobao/accs/net/w;

    invoke-static {v0}, Lcom/taobao/accs/net/w;->g(Lcom/taobao/accs/net/w;)J

    move-result-wide v10

    sub-long/2addr v7, v10

    iget-object v0, v1, Lcom/taobao/accs/net/w$a;->c:Lcom/taobao/accs/net/w;

    iget-object v0, v0, Lcom/taobao/accs/net/b;->d:Landroid/content/Context;

    invoke-static {v0}, Lcom/taobao/accs/net/f;->a(Landroid/content/Context;)Lcom/taobao/accs/net/f;

    move-result-object v0

    invoke-virtual {v0}, Lcom/taobao/accs/net/f;->b()I

    move-result v0

    sub-int/2addr v0, v6

    mul-int/lit16 v0, v0, 0x3e8

    int-to-long v10, v0

    cmp-long v0, v7, v10

    if-gez v0, :cond_5

    iget-boolean v0, v4, Lcom/taobao/accs/data/Message;->d:Z

    if-eqz v0, :cond_4

    goto :goto_2

    .line 29
    :cond_4
    invoke-direct {v1, v3}, Lcom/taobao/accs/net/w$a;->a(Z)V

    goto/16 :goto_4

    .line 30
    :cond_5
    :goto_2
    iget-object v0, v1, Lcom/taobao/accs/net/w$a;->d:Ljava/lang/String;

    const-string v7, "sendMessage"

    new-array v8, v9, [Ljava/lang/Object;

    const-string v9, "force"

    aput-object v9, v8, v3

    iget-boolean v9, v4, Lcom/taobao/accs/data/Message;->d:Z

    invoke-static {v9}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v9

    aput-object v9, v8, v6

    const-string v9, "last ping"

    aput-object v9, v8, v12

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v9

    iget-object v11, v1, Lcom/taobao/accs/net/w$a;->c:Lcom/taobao/accs/net/w;

    invoke-static {v11}, Lcom/taobao/accs/net/w;->g(Lcom/taobao/accs/net/w;)J

    move-result-wide v11

    sub-long/2addr v9, v11

    invoke-static {v9, v10}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v9

    aput-object v9, v8, v13

    invoke-static {v0, v7, v8}, Lcom/taobao/accs/utl/ALog;->d(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 31
    invoke-direct {v1, v6}, Lcom/taobao/accs/net/w$a;->a(Z)V

    .line 32
    iget-object v0, v1, Lcom/taobao/accs/net/w$a;->c:Lcom/taobao/accs/net/w;

    invoke-static {v0}, Lcom/taobao/accs/net/w;->h(Lcom/taobao/accs/net/w;)Lorg/android/spdy/SpdySession;

    move-result-object v0

    if-eqz v0, :cond_b

    iget-object v0, v1, Lcom/taobao/accs/net/w$a;->c:Lcom/taobao/accs/net/w;

    invoke-static {v0}, Lcom/taobao/accs/net/w;->b(Lcom/taobao/accs/net/w;)I

    move-result v0

    if-ne v0, v6, :cond_b

    .line 33
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v7

    iget-object v0, v1, Lcom/taobao/accs/net/w$a;->c:Lcom/taobao/accs/net/w;

    invoke-static {v0}, Lcom/taobao/accs/net/w;->g(Lcom/taobao/accs/net/w;)J

    move-result-wide v9

    sub-long/2addr v7, v9

    iget-object v0, v1, Lcom/taobao/accs/net/w$a;->c:Lcom/taobao/accs/net/w;

    iget-object v0, v0, Lcom/taobao/accs/net/b;->d:Landroid/content/Context;

    invoke-static {v0}, Lcom/taobao/accs/net/f;->a(Landroid/content/Context;)Lcom/taobao/accs/net/f;

    move-result-object v0

    invoke-virtual {v0}, Lcom/taobao/accs/net/f;->b()I

    move-result v0

    sub-int/2addr v0, v6

    mul-int/lit16 v0, v0, 0x3e8

    int-to-long v9, v0

    cmp-long v0, v7, v9

    if-ltz v0, :cond_d

    .line 34
    iget-object v0, v1, Lcom/taobao/accs/net/w$a;->d:Ljava/lang/String;

    const-string v7, "sendMessage onSendPing"

    new-array v8, v3, [Ljava/lang/Object;

    invoke-static {v0, v7, v8}, Lcom/taobao/accs/utl/ALog;->i(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 35
    iget-object v0, v1, Lcom/taobao/accs/net/w$a;->c:Lcom/taobao/accs/net/w;

    iget-object v0, v0, Lcom/taobao/accs/net/b;->e:Lcom/taobao/accs/data/d;

    invoke-virtual {v0}, Lcom/taobao/accs/data/d;->a()V

    .line 36
    iget-object v0, v1, Lcom/taobao/accs/net/w$a;->c:Lcom/taobao/accs/net/w;

    invoke-static {v0}, Lcom/taobao/accs/net/w;->h(Lcom/taobao/accs/net/w;)Lorg/android/spdy/SpdySession;

    move-result-object v0

    invoke-virtual {v0}, Lorg/android/spdy/SpdySession;->submitPing()I

    .line 37
    iget-object v0, v1, Lcom/taobao/accs/net/w$a;->c:Lcom/taobao/accs/net/w;

    invoke-static {v0}, Lcom/taobao/accs/net/w;->c(Lcom/taobao/accs/net/w;)Lcom/taobao/accs/ut/monitor/SessionMonitor;

    move-result-object v0

    invoke-virtual {v0}, Lcom/taobao/accs/ut/monitor/SessionMonitor;->onSendPing()V

    .line 38
    iget-object v0, v1, Lcom/taobao/accs/net/w$a;->c:Lcom/taobao/accs/net/w;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v7

    invoke-static {v0, v7, v8}, Lcom/taobao/accs/net/w;->a(Lcom/taobao/accs/net/w;J)J

    .line 39
    iget-object v0, v1, Lcom/taobao/accs/net/w$a;->c:Lcom/taobao/accs/net/w;

    invoke-static {}, Ljava/lang/System;->nanoTime()J

    move-result-wide v7

    invoke-static {v0, v7, v8}, Lcom/taobao/accs/net/w;->b(Lcom/taobao/accs/net/w;J)J

    .line 40
    iget-object v0, v1, Lcom/taobao/accs/net/w$a;->c:Lcom/taobao/accs/net/w;

    invoke-virtual {v0}, Lcom/taobao/accs/net/b;->f()V

    goto/16 :goto_4

    :cond_6
    if-ne v0, v6, :cond_c

    .line 41
    invoke-direct {v1, v6}, Lcom/taobao/accs/net/w$a;->a(Z)V

    .line 42
    iget-object v0, v1, Lcom/taobao/accs/net/w$a;->c:Lcom/taobao/accs/net/w;

    invoke-static {v0}, Lcom/taobao/accs/net/w;->b(Lcom/taobao/accs/net/w;)I

    move-result v0

    if-ne v0, v6, :cond_b

    iget-object v0, v1, Lcom/taobao/accs/net/w$a;->c:Lcom/taobao/accs/net/w;

    invoke-static {v0}, Lcom/taobao/accs/net/w;->h(Lcom/taobao/accs/net/w;)Lorg/android/spdy/SpdySession;

    move-result-object v0

    if-eqz v0, :cond_b

    .line 43
    iget-object v0, v1, Lcom/taobao/accs/net/w$a;->c:Lcom/taobao/accs/net/w;

    iget-object v7, v0, Lcom/taobao/accs/net/b;->d:Landroid/content/Context;

    iget v0, v0, Lcom/taobao/accs/net/b;->c:I

    invoke-virtual {v4, v7, v0}, Lcom/taobao/accs/data/Message;->a(Landroid/content/Context;I)[B

    move-result-object v0

    .line 44
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v7

    invoke-virtual {v4, v7, v8}, Lcom/taobao/accs/data/Message;->a(J)V

    .line 45
    array-length v7, v0

    const/16 v8, 0x4000

    if-le v7, v8, :cond_7

    iget-object v7, v4, Lcom/taobao/accs/data/Message;->t:Ljava/lang/Integer;

    invoke-virtual {v7}, Ljava/lang/Integer;->intValue()I

    move-result v7

    const/16 v8, 0x66

    if-eq v7, v8, :cond_7

    .line 46
    iget-object v0, v1, Lcom/taobao/accs/net/w$a;->c:Lcom/taobao/accs/net/w;

    iget-object v0, v0, Lcom/taobao/accs/net/b;->e:Lcom/taobao/accs/data/d;

    sget-object v7, Lcom/taobao/accs/AccsErrorCode;->MESSAGE_TOO_LARGE:Lcom/alibaba/sdk/android/error/ErrorCode;

    invoke-virtual {v0, v4, v7}, Lcom/taobao/accs/data/d;->a(Lcom/taobao/accs/data/Message;Lcom/alibaba/sdk/android/error/ErrorCode;)V

    goto/16 :goto_4

    .line 47
    :cond_7
    iget-boolean v7, v4, Lcom/taobao/accs/data/Message;->c:Z

    if-eqz v7, :cond_8

    invoke-virtual {v4}, Lcom/taobao/accs/data/Message;->d()Lcom/taobao/accs/data/Message$a;

    move-result-object v7

    invoke-virtual {v7}, Lcom/taobao/accs/data/Message$a;->a()I

    move-result v7

    neg-int v7, v7

    goto :goto_3

    :cond_8
    invoke-virtual {v4}, Lcom/taobao/accs/data/Message;->d()Lcom/taobao/accs/data/Message$a;

    move-result-object v7

    invoke-virtual {v7}, Lcom/taobao/accs/data/Message$a;->a()I

    move-result v7

    .line 48
    :goto_3
    iget-object v8, v1, Lcom/taobao/accs/net/w$a;->c:Lcom/taobao/accs/net/w;

    invoke-static {v8}, Lcom/taobao/accs/net/w;->h(Lcom/taobao/accs/net/w;)Lorg/android/spdy/SpdySession;

    move-result-object v14

    const/16 v16, 0xc8

    const/16 v17, 0x0

    array-length v8, v0

    move v15, v7

    move/from16 v18, v8

    move-object/from16 v19, v0

    invoke-virtual/range {v14 .. v19}, Lorg/android/spdy/SpdySession;->sendCustomControlFrame(IIII[B)I

    .line 49
    iget-object v8, v1, Lcom/taobao/accs/net/w$a;->d:Ljava/lang/String;

    const-string v10, "send data"

    const/4 v11, 0x6

    new-array v11, v11, [Ljava/lang/Object;

    const-string v14, "length"

    aput-object v14, v11, v3

    array-length v14, v0

    invoke-static {v14}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v14

    aput-object v14, v11, v6

    const-string v14, "dataId"

    aput-object v14, v11, v12

    .line 50
    invoke-virtual {v4}, Lcom/taobao/accs/data/Message;->b()Ljava/lang/String;

    move-result-object v14

    aput-object v14, v11, v13

    const-string v13, "utdid"

    aput-object v13, v11, v9

    const/4 v9, 0x5

    iget-object v13, v1, Lcom/taobao/accs/net/w$a;->c:Lcom/taobao/accs/net/w;

    iget-object v13, v13, Lcom/taobao/accs/net/b;->j:Ljava/lang/String;

    aput-object v13, v11, v9

    .line 51
    invoke-static {v8, v10, v11}, Lcom/taobao/accs/utl/ALog;->i(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 52
    iget-object v8, v1, Lcom/taobao/accs/net/w$a;->c:Lcom/taobao/accs/net/w;

    iget-object v8, v8, Lcom/taobao/accs/net/b;->e:Lcom/taobao/accs/data/d;

    invoke-virtual {v8, v4}, Lcom/taobao/accs/data/d;->a(Lcom/taobao/accs/data/Message;)V

    .line 53
    iget-boolean v8, v4, Lcom/taobao/accs/data/Message;->c:Z

    if-eqz v8, :cond_9

    .line 54
    iget-object v8, v1, Lcom/taobao/accs/net/w$a;->d:Ljava/lang/String;

    const-string v9, "sendCFrame end ack"

    new-array v10, v12, [Ljava/lang/Object;

    const-string v11, "dataId"

    aput-object v11, v10, v3

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v11

    aput-object v11, v10, v6

    invoke-static {v8, v9, v10}, Lcom/taobao/accs/utl/ALog;->i(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 55
    iget-object v8, v1, Lcom/taobao/accs/net/w$a;->c:Lcom/taobao/accs/net/w;

    iget-object v8, v8, Lcom/taobao/accs/net/b;->l:Ljava/util/LinkedHashMap;

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-virtual {v8, v7, v4}, Ljava/util/LinkedHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 56
    :cond_9
    invoke-virtual {v4}, Lcom/taobao/accs/data/Message;->e()Lcom/taobao/accs/ut/monitor/NetPerformanceMonitor;

    move-result-object v7

    if-eqz v7, :cond_a

    .line 57
    invoke-virtual {v4}, Lcom/taobao/accs/data/Message;->e()Lcom/taobao/accs/ut/monitor/NetPerformanceMonitor;

    move-result-object v7

    invoke-virtual {v7}, Lcom/taobao/accs/ut/monitor/NetPerformanceMonitor;->onSendData()V

    .line 58
    :cond_a
    iget-object v7, v1, Lcom/taobao/accs/net/w$a;->c:Lcom/taobao/accs/net/w;

    invoke-virtual {v4}, Lcom/taobao/accs/data/Message;->b()Ljava/lang/String;

    move-result-object v8

    iget-object v9, v1, Lcom/taobao/accs/net/w$a;->c:Lcom/taobao/accs/net/w;

    iget-object v9, v9, Lcom/taobao/accs/net/b;->i:Lcom/taobao/accs/AccsClientConfig;

    invoke-virtual {v9}, Lcom/taobao/accs/AccsClientConfig;->isQuickReconnect()Z

    move-result v9

    iget v10, v4, Lcom/taobao/accs/data/Message;->S:I

    int-to-long v10, v10

    invoke-virtual {v7, v8, v9, v10, v11}, Lcom/taobao/accs/net/b;->a(Ljava/lang/String;ZJ)V

    .line 59
    iget-object v7, v1, Lcom/taobao/accs/net/w$a;->c:Lcom/taobao/accs/net/w;

    iget-object v7, v7, Lcom/taobao/accs/net/b;->e:Lcom/taobao/accs/data/d;

    new-instance v14, Lcom/taobao/accs/ut/monitor/TrafficsMonitor$a;

    iget-object v9, v4, Lcom/taobao/accs/data/Message;->H:Ljava/lang/String;

    invoke-static {}, Lanet/channel/GlobalAppRuntimeInfo;->isAppBackground()Z

    move-result v10

    iget-object v8, v1, Lcom/taobao/accs/net/w$a;->c:Lcom/taobao/accs/net/w;

    invoke-virtual {v8}, Lcom/taobao/accs/net/w;->r()Ljava/lang/String;

    move-result-object v11

    array-length v0, v0

    int-to-long v12, v0

    move-object v8, v14

    invoke-direct/range {v8 .. v13}, Lcom/taobao/accs/ut/monitor/TrafficsMonitor$a;-><init>(Ljava/lang/String;ZLjava/lang/String;J)V

    invoke-virtual {v7, v14}, Lcom/taobao/accs/data/d;->a(Lcom/taobao/accs/ut/monitor/TrafficsMonitor$a;)V

    goto :goto_4

    :cond_b
    const/4 v7, 0x0

    goto :goto_5

    .line 60
    :cond_c
    invoke-direct {v1, v3}, Lcom/taobao/accs/net/w$a;->a(Z)V

    .line 61
    iget-object v7, v1, Lcom/taobao/accs/net/w$a;->d:Ljava/lang/String;

    const-string v8, "skip msg"

    new-array v9, v12, [Ljava/lang/Object;

    const-string v10, "type"

    aput-object v10, v9, v3

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    aput-object v0, v9, v6

    invoke-static {v7, v8, v9}, Lcom/taobao/accs/utl/ALog;->i(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_6

    :cond_d
    :goto_4
    const/4 v7, 0x1

    .line 62
    :goto_5
    :try_start_8
    iget-object v0, v1, Lcom/taobao/accs/net/w$a;->c:Lcom/taobao/accs/net/w;

    invoke-static {v0}, Lcom/taobao/accs/net/w;->i(Lcom/taobao/accs/net/w;)V
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_5

    if-nez v7, :cond_12

    .line 63
    :try_start_9
    iget-object v0, v1, Lcom/taobao/accs/net/w$a;->c:Lcom/taobao/accs/net/w;

    invoke-virtual {v0}, Lcom/taobao/accs/net/w;->q()V

    .line 64
    iget-object v0, v1, Lcom/taobao/accs/net/w$a;->c:Lcom/taobao/accs/net/w;

    invoke-static {v0}, Lcom/taobao/accs/net/w;->c(Lcom/taobao/accs/net/w;)Lcom/taobao/accs/ut/monitor/SessionMonitor;

    move-result-object v0

    if-eqz v0, :cond_e

    .line 65
    iget-object v0, v1, Lcom/taobao/accs/net/w$a;->c:Lcom/taobao/accs/net/w;

    invoke-static {v0}, Lcom/taobao/accs/net/w;->c(Lcom/taobao/accs/net/w;)Lcom/taobao/accs/ut/monitor/SessionMonitor;

    move-result-object v0

    const-string v7, "send fail"

    invoke-virtual {v0, v7}, Lcom/taobao/accs/ut/monitor/SessionMonitor;->setCloseReason(Ljava/lang/String;)V

    .line 66
    :cond_e
    iget-object v0, v1, Lcom/taobao/accs/net/w$a;->c:Lcom/taobao/accs/net/w;

    invoke-static {v0}, Lcom/taobao/accs/net/w;->a(Lcom/taobao/accs/net/w;)Ljava/util/LinkedList;

    move-result-object v7

    monitor-enter v7
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_4

    .line 67
    :try_start_a
    iget-object v0, v1, Lcom/taobao/accs/net/w$a;->c:Lcom/taobao/accs/net/w;

    invoke-static {v0}, Lcom/taobao/accs/net/w;->a(Lcom/taobao/accs/net/w;)Ljava/util/LinkedList;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/LinkedList;->size()I

    move-result v0

    sub-int/2addr v0, v6

    :goto_6
    if-ltz v0, :cond_11

    .line 68
    iget-object v6, v1, Lcom/taobao/accs/net/w$a;->c:Lcom/taobao/accs/net/w;

    invoke-static {v6}, Lcom/taobao/accs/net/w;->a(Lcom/taobao/accs/net/w;)Ljava/util/LinkedList;

    move-result-object v6

    invoke-virtual {v6, v0}, Ljava/util/LinkedList;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lcom/taobao/accs/data/Message;

    if-eqz v6, :cond_10

    .line 69
    iget-object v8, v6, Lcom/taobao/accs/data/Message;->t:Ljava/lang/Integer;

    if-eqz v8, :cond_10

    .line 70
    invoke-virtual {v8}, Ljava/lang/Integer;->intValue()I

    move-result v8

    if-eq v8, v5, :cond_f

    iget-object v8, v6, Lcom/taobao/accs/data/Message;->t:Ljava/lang/Integer;

    invoke-virtual {v8}, Ljava/lang/Integer;->intValue()I

    move-result v8

    if-ne v8, v2, :cond_10

    .line 71
    :cond_f
    iget-object v8, v1, Lcom/taobao/accs/net/w$a;->c:Lcom/taobao/accs/net/w;

    iget-object v8, v8, Lcom/taobao/accs/net/b;->e:Lcom/taobao/accs/data/d;

    sget-object v9, Lcom/taobao/accs/AccsErrorCode;->SPDY_CONNECTION_DISCONNECTED_WHEN_SEND_DATA:Lcom/alibaba/sdk/android/error/ErrorCode;

    invoke-virtual {v8, v6, v9}, Lcom/taobao/accs/data/d;->a(Lcom/taobao/accs/data/Message;Lcom/alibaba/sdk/android/error/ErrorCode;)V

    .line 72
    iget-object v6, v1, Lcom/taobao/accs/net/w$a;->c:Lcom/taobao/accs/net/w;

    invoke-static {v6}, Lcom/taobao/accs/net/w;->a(Lcom/taobao/accs/net/w;)Ljava/util/LinkedList;

    move-result-object v6

    invoke-virtual {v6, v0}, Ljava/util/LinkedList;->remove(I)Ljava/lang/Object;

    :cond_10
    add-int/lit8 v0, v0, -0x1

    goto :goto_6

    .line 73
    :cond_11
    iget-object v0, v1, Lcom/taobao/accs/net/w$a;->d:Ljava/lang/String;

    const-string v2, "network disconnected, wait"

    new-array v5, v3, [Ljava/lang/Object;

    invoke-static {v0, v2, v5}, Lcom/taobao/accs/utl/ALog;->e(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 74
    iget-object v0, v1, Lcom/taobao/accs/net/w$a;->c:Lcom/taobao/accs/net/w;

    invoke-static {v0}, Lcom/taobao/accs/net/w;->a(Lcom/taobao/accs/net/w;)Ljava/util/LinkedList;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->wait()V

    .line 75
    monitor-exit v7

    goto/16 :goto_b

    :catchall_2
    move-exception v0

    monitor-exit v7
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_2

    :try_start_b
    throw v0

    .line 76
    :cond_12
    iget-object v0, v1, Lcom/taobao/accs/net/w$a;->d:Ljava/lang/String;

    const-string v2, "send succ, remove it"

    new-array v5, v3, [Ljava/lang/Object;

    invoke-static {v0, v2, v5}, Lcom/taobao/accs/utl/ALog;->d(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 77
    iget-object v0, v1, Lcom/taobao/accs/net/w$a;->c:Lcom/taobao/accs/net/w;

    invoke-static {v0}, Lcom/taobao/accs/net/w;->a(Lcom/taobao/accs/net/w;)Ljava/util/LinkedList;

    move-result-object v2

    monitor-enter v2
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_4

    .line 78
    :try_start_c
    iget-object v0, v1, Lcom/taobao/accs/net/w$a;->c:Lcom/taobao/accs/net/w;

    invoke-static {v0}, Lcom/taobao/accs/net/w;->a(Lcom/taobao/accs/net/w;)Ljava/util/LinkedList;

    move-result-object v0

    invoke-virtual {v0, v4}, Ljava/util/LinkedList;->remove(Ljava/lang/Object;)Z

    .line 79
    monitor-exit v2

    goto/16 :goto_b

    :catchall_3
    move-exception v0

    monitor-exit v2
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_3

    :try_start_d
    throw v0
    :try_end_d
    .catchall {:try_start_d .. :try_end_d} :catchall_4

    :catchall_4
    move-exception v0

    .line 80
    iget-object v2, v1, Lcom/taobao/accs/net/w$a;->d:Ljava/lang/String;

    const-string v5, " run finally error"

    new-array v6, v3, [Ljava/lang/Object;

    invoke-static {v2, v5, v0, v6}, Lcom/taobao/accs/utl/ALog;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;[Ljava/lang/Object;)V

    goto/16 :goto_b

    :catchall_5
    move-exception v0

    goto :goto_7

    :catchall_6
    move-exception v0

    const/4 v7, 0x1

    :goto_7
    :try_start_e
    const-string v8, "accs"

    const-string v9, "send_fail"

    .line 81
    iget-object v10, v4, Lcom/taobao/accs/data/Message;->H:Ljava/lang/String;

    const-string v11, "1"

    new-instance v12, Ljava/lang/StringBuilder;

    invoke-direct {v12}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v13, v1, Lcom/taobao/accs/net/w$a;->c:Lcom/taobao/accs/net/w;

    iget v13, v13, Lcom/taobao/accs/net/b;->c:I

    invoke-virtual {v12, v13}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/Throwable;->toString()Ljava/lang/String;

    move-result-object v13

    invoke-virtual {v12, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v12

    invoke-static {v8, v9, v10, v11, v12}, Lcom/taobao/accs/utl/AppMonitorAdapter;->commitAlarmFail(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 82
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 83
    iget-object v8, v1, Lcom/taobao/accs/net/w$a;->d:Ljava/lang/String;

    const-string v9, "service connection run"

    new-array v10, v3, [Ljava/lang/Object;

    invoke-static {v8, v9, v0, v10}, Lcom/taobao/accs/utl/ALog;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;[Ljava/lang/Object;)V
    :try_end_e
    .catchall {:try_start_e .. :try_end_e} :catchall_a

    if-nez v7, :cond_17

    .line 84
    :try_start_f
    iget-object v0, v1, Lcom/taobao/accs/net/w$a;->c:Lcom/taobao/accs/net/w;

    invoke-virtual {v0}, Lcom/taobao/accs/net/w;->q()V

    .line 85
    iget-object v0, v1, Lcom/taobao/accs/net/w$a;->c:Lcom/taobao/accs/net/w;

    invoke-static {v0}, Lcom/taobao/accs/net/w;->c(Lcom/taobao/accs/net/w;)Lcom/taobao/accs/ut/monitor/SessionMonitor;

    move-result-object v0

    if-eqz v0, :cond_13

    .line 86
    iget-object v0, v1, Lcom/taobao/accs/net/w$a;->c:Lcom/taobao/accs/net/w;

    invoke-static {v0}, Lcom/taobao/accs/net/w;->c(Lcom/taobao/accs/net/w;)Lcom/taobao/accs/ut/monitor/SessionMonitor;

    move-result-object v0

    const-string v7, "send fail"

    invoke-virtual {v0, v7}, Lcom/taobao/accs/ut/monitor/SessionMonitor;->setCloseReason(Ljava/lang/String;)V

    .line 87
    :cond_13
    iget-object v0, v1, Lcom/taobao/accs/net/w$a;->c:Lcom/taobao/accs/net/w;

    invoke-static {v0}, Lcom/taobao/accs/net/w;->a(Lcom/taobao/accs/net/w;)Ljava/util/LinkedList;

    move-result-object v7

    monitor-enter v7
    :try_end_f
    .catchall {:try_start_f .. :try_end_f} :catchall_9

    .line 88
    :try_start_10
    iget-object v0, v1, Lcom/taobao/accs/net/w$a;->c:Lcom/taobao/accs/net/w;

    invoke-static {v0}, Lcom/taobao/accs/net/w;->a(Lcom/taobao/accs/net/w;)Ljava/util/LinkedList;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/LinkedList;->size()I

    move-result v0

    sub-int/2addr v0, v6

    :goto_8
    if-ltz v0, :cond_16

    .line 89
    iget-object v6, v1, Lcom/taobao/accs/net/w$a;->c:Lcom/taobao/accs/net/w;

    invoke-static {v6}, Lcom/taobao/accs/net/w;->a(Lcom/taobao/accs/net/w;)Ljava/util/LinkedList;

    move-result-object v6

    invoke-virtual {v6, v0}, Ljava/util/LinkedList;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lcom/taobao/accs/data/Message;

    if-eqz v6, :cond_15

    .line 90
    iget-object v8, v6, Lcom/taobao/accs/data/Message;->t:Ljava/lang/Integer;

    if-eqz v8, :cond_15

    .line 91
    invoke-virtual {v8}, Ljava/lang/Integer;->intValue()I

    move-result v8

    if-eq v8, v5, :cond_14

    iget-object v8, v6, Lcom/taobao/accs/data/Message;->t:Ljava/lang/Integer;

    invoke-virtual {v8}, Ljava/lang/Integer;->intValue()I

    move-result v8

    if-ne v8, v2, :cond_15

    .line 92
    :cond_14
    iget-object v8, v1, Lcom/taobao/accs/net/w$a;->c:Lcom/taobao/accs/net/w;

    iget-object v8, v8, Lcom/taobao/accs/net/b;->e:Lcom/taobao/accs/data/d;

    sget-object v9, Lcom/taobao/accs/AccsErrorCode;->SPDY_CONNECTION_DISCONNECTED_WHEN_SEND_DATA:Lcom/alibaba/sdk/android/error/ErrorCode;

    invoke-virtual {v8, v6, v9}, Lcom/taobao/accs/data/d;->a(Lcom/taobao/accs/data/Message;Lcom/alibaba/sdk/android/error/ErrorCode;)V

    .line 93
    iget-object v6, v1, Lcom/taobao/accs/net/w$a;->c:Lcom/taobao/accs/net/w;

    invoke-static {v6}, Lcom/taobao/accs/net/w;->a(Lcom/taobao/accs/net/w;)Ljava/util/LinkedList;

    move-result-object v6

    invoke-virtual {v6, v0}, Ljava/util/LinkedList;->remove(I)Ljava/lang/Object;

    :cond_15
    add-int/lit8 v0, v0, -0x1

    goto :goto_8

    .line 94
    :cond_16
    iget-object v0, v1, Lcom/taobao/accs/net/w$a;->d:Ljava/lang/String;

    const-string v2, "network disconnected, wait"

    new-array v5, v3, [Ljava/lang/Object;

    invoke-static {v0, v2, v5}, Lcom/taobao/accs/utl/ALog;->e(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 95
    iget-object v0, v1, Lcom/taobao/accs/net/w$a;->c:Lcom/taobao/accs/net/w;

    invoke-static {v0}, Lcom/taobao/accs/net/w;->a(Lcom/taobao/accs/net/w;)Ljava/util/LinkedList;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->wait()V

    .line 96
    monitor-exit v7

    goto/16 :goto_b

    :catchall_7
    move-exception v0

    monitor-exit v7
    :try_end_10
    .catchall {:try_start_10 .. :try_end_10} :catchall_7

    :try_start_11
    throw v0

    .line 97
    :cond_17
    iget-object v0, v1, Lcom/taobao/accs/net/w$a;->d:Ljava/lang/String;

    const-string v2, "send succ, remove it"

    new-array v5, v3, [Ljava/lang/Object;

    invoke-static {v0, v2, v5}, Lcom/taobao/accs/utl/ALog;->d(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 98
    iget-object v0, v1, Lcom/taobao/accs/net/w$a;->c:Lcom/taobao/accs/net/w;

    invoke-static {v0}, Lcom/taobao/accs/net/w;->a(Lcom/taobao/accs/net/w;)Ljava/util/LinkedList;

    move-result-object v2

    monitor-enter v2
    :try_end_11
    .catchall {:try_start_11 .. :try_end_11} :catchall_9

    .line 99
    :try_start_12
    iget-object v0, v1, Lcom/taobao/accs/net/w$a;->c:Lcom/taobao/accs/net/w;

    invoke-static {v0}, Lcom/taobao/accs/net/w;->a(Lcom/taobao/accs/net/w;)Ljava/util/LinkedList;

    move-result-object v0

    invoke-virtual {v0, v4}, Ljava/util/LinkedList;->remove(Ljava/lang/Object;)Z

    .line 100
    monitor-exit v2

    goto/16 :goto_b

    :catchall_8
    move-exception v0

    monitor-exit v2
    :try_end_12
    .catchall {:try_start_12 .. :try_end_12} :catchall_8

    :try_start_13
    throw v0
    :try_end_13
    .catchall {:try_start_13 .. :try_end_13} :catchall_9

    :catchall_9
    move-exception v0

    .line 101
    iget-object v2, v1, Lcom/taobao/accs/net/w$a;->d:Ljava/lang/String;

    const-string v5, " run finally error"

    new-array v6, v3, [Ljava/lang/Object;

    invoke-static {v2, v5, v0, v6}, Lcom/taobao/accs/utl/ALog;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;[Ljava/lang/Object;)V

    goto/16 :goto_b

    :catchall_a
    move-exception v0

    move-object v8, v0

    if-nez v7, :cond_1c

    .line 102
    :try_start_14
    iget-object v0, v1, Lcom/taobao/accs/net/w$a;->c:Lcom/taobao/accs/net/w;

    invoke-virtual {v0}, Lcom/taobao/accs/net/w;->q()V

    .line 103
    iget-object v0, v1, Lcom/taobao/accs/net/w$a;->c:Lcom/taobao/accs/net/w;

    invoke-static {v0}, Lcom/taobao/accs/net/w;->c(Lcom/taobao/accs/net/w;)Lcom/taobao/accs/ut/monitor/SessionMonitor;

    move-result-object v0

    if-eqz v0, :cond_18

    .line 104
    iget-object v0, v1, Lcom/taobao/accs/net/w$a;->c:Lcom/taobao/accs/net/w;

    invoke-static {v0}, Lcom/taobao/accs/net/w;->c(Lcom/taobao/accs/net/w;)Lcom/taobao/accs/ut/monitor/SessionMonitor;

    move-result-object v0

    const-string v4, "send fail"

    invoke-virtual {v0, v4}, Lcom/taobao/accs/ut/monitor/SessionMonitor;->setCloseReason(Ljava/lang/String;)V

    .line 105
    :cond_18
    iget-object v0, v1, Lcom/taobao/accs/net/w$a;->c:Lcom/taobao/accs/net/w;

    invoke-static {v0}, Lcom/taobao/accs/net/w;->a(Lcom/taobao/accs/net/w;)Ljava/util/LinkedList;

    move-result-object v4

    monitor-enter v4
    :try_end_14
    .catchall {:try_start_14 .. :try_end_14} :catchall_d

    .line 106
    :try_start_15
    iget-object v0, v1, Lcom/taobao/accs/net/w$a;->c:Lcom/taobao/accs/net/w;

    invoke-static {v0}, Lcom/taobao/accs/net/w;->a(Lcom/taobao/accs/net/w;)Ljava/util/LinkedList;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/LinkedList;->size()I

    move-result v0

    sub-int/2addr v0, v6

    :goto_9
    if-ltz v0, :cond_1b

    .line 107
    iget-object v6, v1, Lcom/taobao/accs/net/w$a;->c:Lcom/taobao/accs/net/w;

    invoke-static {v6}, Lcom/taobao/accs/net/w;->a(Lcom/taobao/accs/net/w;)Ljava/util/LinkedList;

    move-result-object v6

    invoke-virtual {v6, v0}, Ljava/util/LinkedList;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lcom/taobao/accs/data/Message;

    if-eqz v6, :cond_1a

    .line 108
    iget-object v7, v6, Lcom/taobao/accs/data/Message;->t:Ljava/lang/Integer;

    if-eqz v7, :cond_1a

    .line 109
    invoke-virtual {v7}, Ljava/lang/Integer;->intValue()I

    move-result v7

    if-eq v7, v5, :cond_19

    iget-object v7, v6, Lcom/taobao/accs/data/Message;->t:Ljava/lang/Integer;

    invoke-virtual {v7}, Ljava/lang/Integer;->intValue()I

    move-result v7

    if-ne v7, v2, :cond_1a

    .line 110
    :cond_19
    iget-object v7, v1, Lcom/taobao/accs/net/w$a;->c:Lcom/taobao/accs/net/w;

    iget-object v7, v7, Lcom/taobao/accs/net/b;->e:Lcom/taobao/accs/data/d;

    sget-object v9, Lcom/taobao/accs/AccsErrorCode;->SPDY_CONNECTION_DISCONNECTED_WHEN_SEND_DATA:Lcom/alibaba/sdk/android/error/ErrorCode;

    invoke-virtual {v7, v6, v9}, Lcom/taobao/accs/data/d;->a(Lcom/taobao/accs/data/Message;Lcom/alibaba/sdk/android/error/ErrorCode;)V

    .line 111
    iget-object v6, v1, Lcom/taobao/accs/net/w$a;->c:Lcom/taobao/accs/net/w;

    invoke-static {v6}, Lcom/taobao/accs/net/w;->a(Lcom/taobao/accs/net/w;)Ljava/util/LinkedList;

    move-result-object v6

    invoke-virtual {v6, v0}, Ljava/util/LinkedList;->remove(I)Ljava/lang/Object;

    :cond_1a
    add-int/lit8 v0, v0, -0x1

    goto :goto_9

    .line 112
    :cond_1b
    iget-object v0, v1, Lcom/taobao/accs/net/w$a;->d:Ljava/lang/String;

    const-string v2, "network disconnected, wait"

    new-array v5, v3, [Ljava/lang/Object;

    invoke-static {v0, v2, v5}, Lcom/taobao/accs/utl/ALog;->e(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 113
    iget-object v0, v1, Lcom/taobao/accs/net/w$a;->c:Lcom/taobao/accs/net/w;

    invoke-static {v0}, Lcom/taobao/accs/net/w;->a(Lcom/taobao/accs/net/w;)Ljava/util/LinkedList;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->wait()V

    .line 114
    monitor-exit v4

    goto :goto_a

    :catchall_b
    move-exception v0

    monitor-exit v4
    :try_end_15
    .catchall {:try_start_15 .. :try_end_15} :catchall_b

    :try_start_16
    throw v0

    .line 115
    :cond_1c
    iget-object v0, v1, Lcom/taobao/accs/net/w$a;->d:Ljava/lang/String;

    const-string v2, "send succ, remove it"

    new-array v5, v3, [Ljava/lang/Object;

    invoke-static {v0, v2, v5}, Lcom/taobao/accs/utl/ALog;->d(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 116
    iget-object v0, v1, Lcom/taobao/accs/net/w$a;->c:Lcom/taobao/accs/net/w;

    invoke-static {v0}, Lcom/taobao/accs/net/w;->a(Lcom/taobao/accs/net/w;)Ljava/util/LinkedList;

    move-result-object v2

    monitor-enter v2
    :try_end_16
    .catchall {:try_start_16 .. :try_end_16} :catchall_d

    .line 117
    :try_start_17
    iget-object v0, v1, Lcom/taobao/accs/net/w$a;->c:Lcom/taobao/accs/net/w;

    invoke-static {v0}, Lcom/taobao/accs/net/w;->a(Lcom/taobao/accs/net/w;)Ljava/util/LinkedList;

    move-result-object v0

    invoke-virtual {v0, v4}, Ljava/util/LinkedList;->remove(Ljava/lang/Object;)Z

    .line 118
    monitor-exit v2

    goto :goto_a

    :catchall_c
    move-exception v0

    monitor-exit v2
    :try_end_17
    .catchall {:try_start_17 .. :try_end_17} :catchall_c

    :try_start_18
    throw v0
    :try_end_18
    .catchall {:try_start_18 .. :try_end_18} :catchall_d

    :catchall_d
    move-exception v0

    .line 119
    iget-object v2, v1, Lcom/taobao/accs/net/w$a;->d:Ljava/lang/String;

    const-string v4, " run finally error"

    new-array v3, v3, [Ljava/lang/Object;

    invoke-static {v2, v4, v0, v3}, Lcom/taobao/accs/utl/ALog;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;[Ljava/lang/Object;)V

    .line 120
    :goto_a
    throw v8

    :cond_1d
    :goto_b
    move-object v0, v4

    goto/16 :goto_0

    :catchall_e
    move-exception v0

    .line 121
    :try_start_19
    monitor-exit v2
    :try_end_19
    .catchall {:try_start_19 .. :try_end_19} :catchall_e

    throw v0

    .line 122
    :cond_1e
    :goto_c
    iget-object v0, v1, Lcom/taobao/accs/net/w$a;->c:Lcom/taobao/accs/net/w;

    invoke-virtual {v0}, Lcom/taobao/accs/net/w;->q()V

    return-void
.end method
