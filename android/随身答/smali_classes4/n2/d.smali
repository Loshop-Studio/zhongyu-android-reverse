.class public Ln2/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lx2/c;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ln2/d$c;
    }
.end annotation


# static fields
.field public static a:Landroid/os/HandlerThread; = null

.field public static b:Landroid/os/Handler; = null

.field public static c:Landroid/os/Handler; = null

.field public static d:Ln2/d$c; = null

.field public static e:Landroid/net/ConnectivityManager; = null

.field public static f:Landroid/net/NetworkInfo; = null

.field public static g:Landroid/content/IntentFilter; = null

.field public static h:Z = false

.field public static i:Ljava/util/ArrayList;

.field public static j:Ljava/lang/Object;

.field public static k:Ljava/util/concurrent/locks/ReentrantLock;

.field public static l:Z

.field public static m:I

.field public static n:Ljava/lang/Object;

.field public static o:Landroid/content/BroadcastReceiver;


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
    sput-object v0, Ln2/d;->j:Ljava/lang/Object;

    .line 7
    .line 8
    new-instance v0, Ljava/util/concurrent/locks/ReentrantLock;

    .line 9
    .line 10
    invoke-direct {v0}, Ljava/util/concurrent/locks/ReentrantLock;-><init>()V

    .line 11
    .line 12
    .line 13
    sput-object v0, Ln2/d;->k:Ljava/util/concurrent/locks/ReentrantLock;

    .line 14
    .line 15
    const/4 v0, 0x0

    .line 16
    sput-boolean v0, Ln2/d;->l:Z

    .line 17
    .line 18
    const/16 v0, 0xf

    .line 19
    .line 20
    sput v0, Ln2/d;->m:I

    .line 21
    .line 22
    new-instance v0, Ljava/lang/Object;

    .line 23
    .line 24
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 25
    .line 26
    .line 27
    sput-object v0, Ln2/d;->n:Ljava/lang/Object;

    .line 28
    .line 29
    new-instance v0, Ln2/d$a;

    .line 30
    .line 31
    invoke-direct {v0}, Ln2/d$a;-><init>()V

    .line 32
    .line 33
    .line 34
    sput-object v0, Ln2/d;->o:Landroid/content/BroadcastReceiver;

    .line 35
    .line 36
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/os/Handler;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    invoke-static {}, Ln2/a;->b()Landroid/content/Context;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    const-string v1, "connectivity"

    .line 9
    .line 10
    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    check-cast v1, Landroid/net/ConnectivityManager;

    .line 15
    .line 16
    sput-object v1, Ln2/d;->e:Landroid/net/ConnectivityManager;

    .line 17
    .line 18
    sput-object p2, Ln2/d;->c:Landroid/os/Handler;

    .line 19
    .line 20
    :try_start_0
    sget-object p2, Ln2/d;->a:Landroid/os/HandlerThread;

    .line 21
    .line 22
    if-nez p2, :cond_3

    .line 23
    .line 24
    new-instance p2, Landroid/os/HandlerThread;

    .line 25
    .line 26
    const-string v1, "NetWorkSender"

    .line 27
    .line 28
    invoke-direct {p2, v1}, Landroid/os/HandlerThread;-><init>(Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    sput-object p2, Ln2/d;->a:Landroid/os/HandlerThread;

    .line 32
    .line 33
    invoke-virtual {p2}, Ljava/lang/Thread;->start()V

    .line 34
    .line 35
    .line 36
    sget-object p2, Ln2/d;->d:Ln2/d$c;

    .line 37
    .line 38
    if-nez p2, :cond_0

    .line 39
    .line 40
    new-instance p2, Ln2/d$c;

    .line 41
    .line 42
    invoke-static {p1}, Lcom/umeng/commonsdk/framework/b;->d(Landroid/content/Context;)Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object v1

    .line 46
    invoke-direct {p2, v1}, Ln2/d$c;-><init>(Ljava/lang/String;)V

    .line 47
    .line 48
    .line 49
    sput-object p2, Ln2/d;->d:Ln2/d$c;

    .line 50
    .line 51
    invoke-virtual {p2}, Landroid/os/FileObserver;->startWatching()V

    .line 52
    .line 53
    .line 54
    const-string p2, "--->>> FileMonitor has already started!"

    .line 55
    .line 56
    invoke-static {p2}, Lv2/f;->a(Ljava/lang/String;)V

    .line 57
    .line 58
    .line 59
    goto :goto_0

    .line 60
    :catchall_0
    move-exception p2

    .line 61
    goto :goto_1

    .line 62
    :cond_0
    :goto_0
    const-string p2, "android.permission.ACCESS_NETWORK_STATE"

    .line 63
    .line 64
    invoke-static {v0, p2}, Lv2/b;->b(Landroid/content/Context;Ljava/lang/String;)Z

    .line 65
    .line 66
    .line 67
    move-result p2

    .line 68
    if-eqz p2, :cond_1

    .line 69
    .line 70
    sget-object p2, Ln2/d;->e:Landroid/net/ConnectivityManager;

    .line 71
    .line 72
    if-eqz p2, :cond_1

    .line 73
    .line 74
    sget-object p2, Ln2/d;->g:Landroid/content/IntentFilter;

    .line 75
    .line 76
    if-nez p2, :cond_1

    .line 77
    .line 78
    new-instance p2, Landroid/content/IntentFilter;

    .line 79
    .line 80
    invoke-direct {p2}, Landroid/content/IntentFilter;-><init>()V

    .line 81
    .line 82
    .line 83
    sput-object p2, Ln2/d;->g:Landroid/content/IntentFilter;

    .line 84
    .line 85
    const-string v1, "android.net.conn.CONNECTIVITY_CHANGE"

    .line 86
    .line 87
    invoke-virtual {p2, v1}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 88
    .line 89
    .line 90
    sget-object p2, Ln2/d;->o:Landroid/content/BroadcastReceiver;

    .line 91
    .line 92
    if-eqz p2, :cond_1

    .line 93
    .line 94
    sget-object v1, Ln2/d;->g:Landroid/content/IntentFilter;

    .line 95
    .line 96
    invoke-virtual {v0, p2, v1}, Landroid/content/Context;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;

    .line 97
    .line 98
    .line 99
    :cond_1
    invoke-virtual {p0}, Ln2/d;->v()V

    .line 100
    .line 101
    .line 102
    sget-object p2, Ln2/d;->b:Landroid/os/Handler;

    .line 103
    .line 104
    if-nez p2, :cond_2

    .line 105
    .line 106
    new-instance p2, Ln2/d$b;

    .line 107
    .line 108
    sget-object v0, Ln2/d;->a:Landroid/os/HandlerThread;

    .line 109
    .line 110
    invoke-virtual {v0}, Landroid/os/HandlerThread;->getLooper()Landroid/os/Looper;

    .line 111
    .line 112
    .line 113
    move-result-object v0

    .line 114
    invoke-direct {p2, p0, v0}, Ln2/d$b;-><init>(Ln2/d;Landroid/os/Looper;)V

    .line 115
    .line 116
    .line 117
    sput-object p2, Ln2/d;->b:Landroid/os/Handler;

    .line 118
    .line 119
    :cond_2
    invoke-static {p1}, Lw2/b;->u(Landroid/content/Context;)Lw2/b;

    .line 120
    .line 121
    .line 122
    move-result-object p2

    .line 123
    const-string v0, "report_policy"

    .line 124
    .line 125
    invoke-virtual {p2, v0, p0}, Lw2/b;->v(Ljava/lang/String;Lx2/c;)V

    .line 126
    .line 127
    .line 128
    invoke-static {p1}, Lw2/b;->u(Landroid/content/Context;)Lw2/b;

    .line 129
    .line 130
    .line 131
    move-result-object p2

    .line 132
    const-string v0, "report_interval"

    .line 133
    .line 134
    invoke-virtual {p2, v0, p0}, Lw2/b;->v(Ljava/lang/String;Lx2/c;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 135
    .line 136
    .line 137
    :cond_3
    return-void

    .line 138
    :goto_1
    invoke-static {p1, p2}, Lp2/a;->b(Landroid/content/Context;Ljava/lang/Throwable;)V

    .line 139
    .line 140
    .line 141
    return-void
.end method

.method public static synthetic a(Landroid/net/NetworkInfo;)Landroid/net/NetworkInfo;
    .locals 0

    .line 1
    sput-object p0, Ln2/d;->f:Landroid/net/NetworkInfo;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic c(I)V
    .locals 0

    .line 1
    invoke-static {p0}, Ln2/d;->k(I)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static d(II)V
    .locals 3

    .line 1
    sget-boolean v0, Ln2/d;->h:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    sget-object v0, Ln2/d;->b:Landroid/os/Handler;

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    invoke-virtual {v0, p0}, Landroid/os/Handler;->removeMessages(I)V

    .line 10
    .line 11
    .line 12
    sget-object v0, Ln2/d;->b:Landroid/os/Handler;

    .line 13
    .line 14
    invoke-virtual {v0}, Landroid/os/Handler;->obtainMessage()Landroid/os/Message;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    iput p0, v0, Landroid/os/Message;->what:I

    .line 19
    .line 20
    sget-object p0, Ln2/d;->b:Landroid/os/Handler;

    .line 21
    .line 22
    int-to-long v1, p1

    .line 23
    invoke-virtual {p0, v0, v1, v2}, Landroid/os/Handler;->sendMessageDelayed(Landroid/os/Message;J)Z

    .line 24
    .line 25
    .line 26
    :cond_0
    return-void
.end method

.method public static e(Ln2/b;)V
    .locals 3

    .line 1
    sget-object v0, Ln2/d;->j:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    sget-object v1, Ln2/d;->i:Ljava/util/ArrayList;

    .line 5
    .line 6
    if-nez v1, :cond_0

    .line 7
    .line 8
    new-instance v1, Ljava/util/ArrayList;

    .line 9
    .line 10
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 11
    .line 12
    .line 13
    sput-object v1, Ln2/d;->i:Ljava/util/ArrayList;

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :catchall_0
    move-exception p0

    .line 17
    goto :goto_2

    .line 18
    :cond_0
    :goto_0
    if-eqz p0, :cond_3

    .line 19
    .line 20
    const/4 v1, 0x0

    .line 21
    :goto_1
    sget-object v2, Ln2/d;->i:Ljava/util/ArrayList;

    .line 22
    .line 23
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 24
    .line 25
    .line 26
    move-result v2

    .line 27
    if-ge v1, v2, :cond_2

    .line 28
    .line 29
    sget-object v2, Ln2/d;->i:Ljava/util/ArrayList;

    .line 30
    .line 31
    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v2

    .line 35
    if-ne p0, v2, :cond_1

    .line 36
    .line 37
    const-string p0, "MobclickRT"

    .line 38
    .line 39
    const-string v1, "--->>> addConnStateObserver: input item has exist."

    .line 40
    .line 41
    invoke-static {p0, v1}, Lm2/h;->c(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 42
    .line 43
    .line 44
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 45
    return-void

    .line 46
    :catchall_1
    move-exception p0

    .line 47
    goto :goto_4

    .line 48
    :cond_1
    add-int/lit8 v1, v1, 0x1

    .line 49
    .line 50
    goto :goto_1

    .line 51
    :cond_2
    :try_start_2
    sget-object v1, Ln2/d;->i:Ljava/util/ArrayList;

    .line 52
    .line 53
    invoke-virtual {v1, p0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 54
    .line 55
    .line 56
    goto :goto_3

    .line 57
    :goto_2
    :try_start_3
    invoke-static {}, Ln2/a;->b()Landroid/content/Context;

    .line 58
    .line 59
    .line 60
    move-result-object v1

    .line 61
    invoke-static {v1, p0}, Lp2/a;->b(Landroid/content/Context;Ljava/lang/Throwable;)V

    .line 62
    .line 63
    .line 64
    :cond_3
    :goto_3
    monitor-exit v0

    .line 65
    return-void

    .line 66
    :goto_4
    monitor-exit v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 67
    throw p0
.end method

.method public static f()Z
    .locals 2

    .line 1
    sget-object v0, Ln2/d;->n:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    sget-boolean v1, Ln2/d;->l:Z

    .line 5
    .line 6
    monitor-exit v0

    .line 7
    return v1

    .line 8
    :catchall_0
    move-exception v1

    .line 9
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 10
    throw v1
.end method

.method public static synthetic g(Z)Z
    .locals 0

    .line 1
    sput-boolean p0, Ln2/d;->h:Z

    .line 2
    .line 3
    return p0
.end method

.method public static h()I
    .locals 2

    .line 1
    sget-object v0, Ln2/d;->n:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    sget v1, Ln2/d;->m:I

    .line 5
    .line 6
    monitor-exit v0

    .line 7
    return v1

    .line 8
    :catchall_0
    move-exception v1

    .line 9
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 10
    throw v1
.end method

.method public static i(I)V
    .locals 1

    .line 1
    sget-boolean v0, Ln2/d;->h:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    sget-object v0, Ln2/d;->b:Landroid/os/Handler;

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    invoke-virtual {v0, p0}, Landroid/os/Handler;->hasMessages(I)Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-nez v0, :cond_0

    .line 14
    .line 15
    sget-object v0, Ln2/d;->b:Landroid/os/Handler;

    .line 16
    .line 17
    invoke-virtual {v0}, Landroid/os/Handler;->obtainMessage()Landroid/os/Message;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    iput p0, v0, Landroid/os/Message;->what:I

    .line 22
    .line 23
    sget-object p0, Ln2/d;->b:Landroid/os/Handler;

    .line 24
    .line 25
    invoke-virtual {p0, v0}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 26
    .line 27
    .line 28
    :cond_0
    return-void
.end method

.method public static j()V
    .locals 0

    .line 1
    return-void
.end method

.method public static k(I)V
    .locals 1

    .line 1
    sget-boolean v0, Ln2/d;->h:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    sget-object v0, Ln2/d;->b:Landroid/os/Handler;

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    invoke-virtual {v0}, Landroid/os/Handler;->obtainMessage()Landroid/os/Message;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    iput p0, v0, Landroid/os/Message;->what:I

    .line 14
    .line 15
    sget-object p0, Ln2/d;->b:Landroid/os/Handler;

    .line 16
    .line 17
    invoke-virtual {p0, v0}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 18
    .line 19
    .line 20
    :cond_0
    return-void
.end method

.method public static l()V
    .locals 2

    .line 1
    sget-object v0, Ln2/d;->k:Ljava/util/concurrent/locks/ReentrantLock;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantLock;->tryLock()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    const/16 v0, 0x111

    .line 10
    .line 11
    :try_start_0
    invoke-static {v0}, Ln2/d;->i(I)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 12
    .line 13
    .line 14
    sget-object v0, Ln2/d;->k:Ljava/util/concurrent/locks/ReentrantLock;

    .line 15
    .line 16
    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    .line 17
    .line 18
    .line 19
    return-void

    .line 20
    :catchall_0
    move-exception v0

    .line 21
    sget-object v1, Ln2/d;->k:Ljava/util/concurrent/locks/ReentrantLock;

    .line 22
    .line 23
    invoke-virtual {v1}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    .line 24
    .line 25
    .line 26
    throw v0

    .line 27
    :cond_0
    return-void
.end method

.method public static m()V
    .locals 2

    .line 1
    const/16 v0, 0x112

    .line 2
    .line 3
    const/16 v1, 0xbb8

    .line 4
    .line 5
    invoke-static {v0, v1}, Ln2/d;->d(II)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public static synthetic n()Landroid/net/ConnectivityManager;
    .locals 1

    .line 1
    sget-object v0, Ln2/d;->e:Landroid/net/ConnectivityManager;

    .line 2
    .line 3
    return-object v0
.end method

.method public static synthetic o()Landroid/net/NetworkInfo;
    .locals 1

    .line 1
    sget-object v0, Ln2/d;->f:Landroid/net/NetworkInfo;

    .line 2
    .line 3
    return-object v0
.end method

.method public static synthetic p()Ljava/lang/Object;
    .locals 1

    .line 1
    sget-object v0, Ln2/d;->j:Ljava/lang/Object;

    .line 2
    .line 3
    return-object v0
.end method

.method public static synthetic q()Ljava/util/ArrayList;
    .locals 1

    .line 1
    sget-object v0, Ln2/d;->i:Ljava/util/ArrayList;

    .line 2
    .line 3
    return-object v0
.end method

.method public static synthetic r()Ljava/util/concurrent/locks/ReentrantLock;
    .locals 1

    .line 1
    sget-object v0, Ln2/d;->k:Ljava/util/concurrent/locks/ReentrantLock;

    .line 2
    .line 3
    return-object v0
.end method

.method public static synthetic s()V
    .locals 0

    .line 1
    invoke-static {}, Ln2/d;->y()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic t()V
    .locals 0

    .line 1
    invoke-static {}, Ln2/d;->x()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic u()V
    .locals 0

    .line 1
    invoke-static {}, Ln2/d;->w()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static w()V
    .locals 4

    .line 1
    sget-object v0, Ln2/d;->j:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    sget-object v1, Ln2/d;->i:Ljava/util/ArrayList;

    .line 5
    .line 6
    if-eqz v1, :cond_0

    .line 7
    .line 8
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 9
    .line 10
    .line 11
    move-result v1

    .line 12
    if-lez v1, :cond_0

    .line 13
    .line 14
    const/4 v2, 0x0

    .line 15
    :goto_0
    if-ge v2, v1, :cond_0

    .line 16
    .line 17
    sget-object v3, Ln2/d;->i:Ljava/util/ArrayList;

    .line 18
    .line 19
    invoke-virtual {v3, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v3

    .line 23
    check-cast v3, Ln2/b;

    .line 24
    .line 25
    invoke-interface {v3}, Ln2/b;->b()V

    .line 26
    .line 27
    .line 28
    add-int/lit8 v2, v2, 0x1

    .line 29
    .line 30
    goto :goto_0

    .line 31
    :catchall_0
    move-exception v1

    .line 32
    goto :goto_1

    .line 33
    :cond_0
    monitor-exit v0

    .line 34
    return-void

    .line 35
    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 36
    throw v1
.end method

.method public static x()V
    .locals 0

    .line 1
    return-void
.end method

.method public static y()V
    .locals 7

    .line 1
    const-string v0, "]."

    .line 2
    .line 3
    const-string v1, "--->>> handleProcessNext: Enter..."

    .line 4
    .line 5
    invoke-static {v1}, Lv2/f;->a(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    sget-boolean v1, Ln2/d;->h:Z

    .line 9
    .line 10
    if-nez v1, :cond_0

    .line 11
    .line 12
    return-void

    .line 13
    :cond_0
    invoke-static {}, Ln2/a;->b()Landroid/content/Context;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    :try_start_0
    invoke-static {v1}, Lcom/umeng/commonsdk/framework/b;->b(Landroid/content/Context;)I

    .line 18
    .line 19
    .line 20
    move-result v2

    .line 21
    if-lez v2, :cond_4

    .line 22
    .line 23
    const-string v2, "--->>> The envelope file exists."

    .line 24
    .line 25
    invoke-static {v2}, Lv2/f;->a(Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    invoke-static {v1}, Lcom/umeng/commonsdk/framework/b;->b(Landroid/content/Context;)I

    .line 29
    .line 30
    .line 31
    move-result v2

    .line 32
    const/16 v3, 0xc8

    .line 33
    .line 34
    if-le v2, v3, :cond_1

    .line 35
    .line 36
    const-string v2, "--->>> Number of envelope files is greater than 200, remove old files first."

    .line 37
    .line 38
    invoke-static {v2}, Lv2/f;->a(Ljava/lang/String;)V

    .line 39
    .line 40
    .line 41
    invoke-static {v1, v3}, Lcom/umeng/commonsdk/framework/b;->n(Landroid/content/Context;I)V

    .line 42
    .line 43
    .line 44
    goto :goto_0

    .line 45
    :catchall_0
    move-exception v0

    .line 46
    goto :goto_1

    .line 47
    :cond_1
    :goto_0
    invoke-static {v1}, Lcom/umeng/commonsdk/framework/b;->e(Landroid/content/Context;)Ljava/io/File;

    .line 48
    .line 49
    .line 50
    move-result-object v2

    .line 51
    if-eqz v2, :cond_4

    .line 52
    .line 53
    invoke-virtual {v2}, Ljava/io/File;->getPath()Ljava/lang/String;

    .line 54
    .line 55
    .line 56
    move-result-object v3

    .line 57
    new-instance v4, Ljava/lang/StringBuilder;

    .line 58
    .line 59
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 60
    .line 61
    .line 62
    const-string v5, "--->>> Ready to send envelope file ["

    .line 63
    .line 64
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 65
    .line 66
    .line 67
    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 68
    .line 69
    .line 70
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 71
    .line 72
    .line 73
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 74
    .line 75
    .line 76
    move-result-object v4

    .line 77
    invoke-static {v4}, Lv2/f;->a(Ljava/lang/String;)V

    .line 78
    .line 79
    .line 80
    const-string v4, "MobclickRT"

    .line 81
    .line 82
    new-instance v5, Ljava/lang/StringBuilder;

    .line 83
    .line 84
    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    .line 85
    .line 86
    .line 87
    const-string v6, "--->>> send envelope file [ "

    .line 88
    .line 89
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 90
    .line 91
    .line 92
    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 93
    .line 94
    .line 95
    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 96
    .line 97
    .line 98
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 99
    .line 100
    .line 101
    move-result-object v0

    .line 102
    invoke-static {v4, v0}, Lm2/h;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 103
    .line 104
    .line 105
    new-instance v0, Lu2/f;

    .line 106
    .line 107
    invoke-direct {v0, v1}, Lu2/f;-><init>(Landroid/content/Context;)V

    .line 108
    .line 109
    .line 110
    invoke-virtual {v0, v2}, Lu2/f;->c(Ljava/io/File;)Z

    .line 111
    .line 112
    .line 113
    move-result v0

    .line 114
    if-eqz v0, :cond_3

    .line 115
    .line 116
    const-string v0, "--->>> Send envelope file success, delete it."

    .line 117
    .line 118
    invoke-static {v0}, Lv2/f;->a(Ljava/lang/String;)V

    .line 119
    .line 120
    .line 121
    invoke-static {v2}, Lcom/umeng/commonsdk/framework/b;->m(Ljava/io/File;)Z

    .line 122
    .line 123
    .line 124
    move-result v0

    .line 125
    if-nez v0, :cond_2

    .line 126
    .line 127
    const-string v0, "--->>> Failed to delete already processed file. We try again after delete failed."

    .line 128
    .line 129
    invoke-static {v0}, Lv2/f;->a(Ljava/lang/String;)V

    .line 130
    .line 131
    .line 132
    invoke-static {v2}, Lcom/umeng/commonsdk/framework/b;->m(Ljava/io/File;)Z

    .line 133
    .line 134
    .line 135
    :cond_2
    const/16 v0, 0x111

    .line 136
    .line 137
    invoke-static {v0}, Ln2/d;->k(I)V

    .line 138
    .line 139
    .line 140
    return-void

    .line 141
    :cond_3
    const-string v0, "--->>> Send envelope file failed, abandon and wait next trigger!"

    .line 142
    .line 143
    invoke-static {v0}, Lv2/f;->a(Ljava/lang/String;)V

    .line 144
    .line 145
    .line 146
    return-void

    .line 147
    :cond_4
    invoke-static {}, Ln2/d;->m()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 148
    .line 149
    .line 150
    return-void

    .line 151
    :goto_1
    invoke-static {v1, v0}, Lp2/a;->b(Landroid/content/Context;Ljava/lang/Throwable;)V

    .line 152
    .line 153
    .line 154
    return-void
.end method


# virtual methods
.method public b(Ljava/lang/String;Ljava/lang/String;)V
    .locals 3

    .line 1
    sget-object v0, Ln2/d;->n:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    const-string v1, "report_policy"

    .line 5
    .line 6
    invoke-virtual {v1, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 7
    .line 8
    .line 9
    move-result v1

    .line 10
    if-eqz v1, :cond_1

    .line 11
    .line 12
    const-string v1, "11"

    .line 13
    .line 14
    invoke-virtual {v1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 15
    .line 16
    .line 17
    move-result v1

    .line 18
    if-eqz v1, :cond_0

    .line 19
    .line 20
    const-string v1, "MobclickRT"

    .line 21
    .line 22
    const-string v2, "--->>> switch to report_policy 11"

    .line 23
    .line 24
    invoke-static {v1, v2}, Lm2/h;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    const/4 v1, 0x1

    .line 28
    sput-boolean v1, Ln2/d;->l:Z

    .line 29
    .line 30
    goto :goto_0

    .line 31
    :catchall_0
    move-exception p1

    .line 32
    goto :goto_3

    .line 33
    :cond_0
    const/4 v1, 0x0

    .line 34
    sput-boolean v1, Ln2/d;->l:Z

    .line 35
    .line 36
    :cond_1
    :goto_0
    const-string v1, "report_interval"

    .line 37
    .line 38
    invoke-virtual {v1, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 39
    .line 40
    .line 41
    move-result p1

    .line 42
    if-eqz p1, :cond_4

    .line 43
    .line 44
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(Ljava/lang/String;)Ljava/lang/Integer;

    .line 45
    .line 46
    .line 47
    move-result-object p1

    .line 48
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 49
    .line 50
    .line 51
    move-result p1

    .line 52
    const-string p2, "MobclickRT"

    .line 53
    .line 54
    new-instance v1, Ljava/lang/StringBuilder;

    .line 55
    .line 56
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 57
    .line 58
    .line 59
    const-string v2, "--->>> set report_interval value to: "

    .line 60
    .line 61
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 62
    .line 63
    .line 64
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 65
    .line 66
    .line 67
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 68
    .line 69
    .line 70
    move-result-object v1

    .line 71
    invoke-static {p2, v1}, Lm2/h;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 72
    .line 73
    .line 74
    const/4 p2, 0x3

    .line 75
    if-lt p1, p2, :cond_3

    .line 76
    .line 77
    const/16 p2, 0x5a

    .line 78
    .line 79
    if-le p1, p2, :cond_2

    .line 80
    .line 81
    goto :goto_1

    .line 82
    :cond_2
    mul-int/lit16 p1, p1, 0x3e8

    .line 83
    .line 84
    sput p1, Ln2/d;->m:I

    .line 85
    .line 86
    goto :goto_2

    .line 87
    :cond_3
    :goto_1
    const/16 p1, 0x3a98

    .line 88
    .line 89
    sput p1, Ln2/d;->m:I

    .line 90
    .line 91
    :goto_2
    const-string p1, "MobclickRT"

    .line 92
    .line 93
    new-instance p2, Ljava/lang/StringBuilder;

    .line 94
    .line 95
    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    .line 96
    .line 97
    .line 98
    const-string v1, "--->>> really set report_interval value to: "

    .line 99
    .line 100
    invoke-virtual {p2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 101
    .line 102
    .line 103
    sget v1, Ln2/d;->m:I

    .line 104
    .line 105
    invoke-virtual {p2, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 106
    .line 107
    .line 108
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 109
    .line 110
    .line 111
    move-result-object p2

    .line 112
    invoke-static {p1, p2}, Lm2/h;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 113
    .line 114
    .line 115
    :cond_4
    monitor-exit v0

    .line 116
    return-void

    .line 117
    :goto_3
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 118
    throw p1
.end method

.method public final v()V
    .locals 6

    .line 1
    sget-object v0, Ln2/d;->n:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    invoke-static {}, Ln2/a;->b()Landroid/content/Context;

    .line 5
    .line 6
    .line 7
    move-result-object v1

    .line 8
    const-string v2, "report_policy"

    .line 9
    .line 10
    const-string v3, ""

    .line 11
    .line 12
    invoke-static {v1, v2, v3}, Lcom/umeng/commonsdk/framework/a;->h(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    const-string v2, "11"

    .line 17
    .line 18
    invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 19
    .line 20
    .line 21
    move-result v1

    .line 22
    if-eqz v1, :cond_2

    .line 23
    .line 24
    const-string v1, "MobclickRT"

    .line 25
    .line 26
    const-string v2, "--->>> switch to report_policy 11"

    .line 27
    .line 28
    invoke-static {v1, v2}, Lm2/h;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    const/4 v1, 0x1

    .line 32
    sput-boolean v1, Ln2/d;->l:Z

    .line 33
    .line 34
    const/16 v1, 0xf

    .line 35
    .line 36
    sput v1, Ln2/d;->m:I

    .line 37
    .line 38
    invoke-static {}, Ln2/a;->b()Landroid/content/Context;

    .line 39
    .line 40
    .line 41
    move-result-object v2

    .line 42
    const-string v3, "report_interval"

    .line 43
    .line 44
    const-string v4, "15"

    .line 45
    .line 46
    invoke-static {v2, v3, v4}, Lcom/umeng/commonsdk/framework/a;->h(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object v2

    .line 50
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(Ljava/lang/String;)Ljava/lang/Integer;

    .line 51
    .line 52
    .line 53
    move-result-object v2

    .line 54
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 55
    .line 56
    .line 57
    move-result v2

    .line 58
    const-string v3, "MobclickRT"

    .line 59
    .line 60
    new-instance v4, Ljava/lang/StringBuilder;

    .line 61
    .line 62
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 63
    .line 64
    .line 65
    const-string v5, "--->>> set report_interval value to: "

    .line 66
    .line 67
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 68
    .line 69
    .line 70
    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 71
    .line 72
    .line 73
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 74
    .line 75
    .line 76
    move-result-object v4

    .line 77
    invoke-static {v3, v4}, Lm2/h;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 78
    .line 79
    .line 80
    const/4 v3, 0x3

    .line 81
    if-lt v2, v3, :cond_1

    .line 82
    .line 83
    const/16 v3, 0x5a

    .line 84
    .line 85
    if-le v2, v3, :cond_0

    .line 86
    .line 87
    goto :goto_0

    .line 88
    :cond_0
    mul-int/lit16 v2, v2, 0x3e8

    .line 89
    .line 90
    sput v2, Ln2/d;->m:I

    .line 91
    .line 92
    goto :goto_1

    .line 93
    :catchall_0
    move-exception v1

    .line 94
    goto :goto_2

    .line 95
    :cond_1
    :goto_0
    sput v1, Ln2/d;->m:I

    .line 96
    .line 97
    goto :goto_1

    .line 98
    :cond_2
    const/4 v1, 0x0

    .line 99
    sput-boolean v1, Ln2/d;->l:Z

    .line 100
    .line 101
    :goto_1
    monitor-exit v0

    .line 102
    return-void

    .line 103
    :goto_2
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 104
    throw v1
.end method
