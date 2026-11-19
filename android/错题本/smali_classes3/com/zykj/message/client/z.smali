.class public final Lcom/zykj/message/client/z;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/content/ServiceConnection;


# instance fields
.field public final synthetic a:Lcom/zykj/message/client/MessageClient$INSTANCES;


# direct methods
.method public constructor <init>(Lcom/zykj/message/client/MessageClient$INSTANCES;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/zykj/message/client/z;->a:Lcom/zykj/message/client/MessageClient$INSTANCES;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final onServiceConnected(Landroid/content/ComponentName;Landroid/os/IBinder;)V
    .locals 2

    .line 1
    const-string v0, "className"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string p1, "service"

    .line 7
    .line 8
    invoke-static {p2, p1}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    new-instance p1, Ljava/lang/StringBuilder;

    .line 12
    .line 13
    const-string v0, "\u8fde\u63a5\u5230\u4e2a\u4eba\u4e2d\u5fc3\u670d\u52a1"

    .line 14
    .line 15
    invoke-direct {p1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 19
    .line 20
    .line 21
    move-result-wide v0

    .line 22
    invoke-virtual {p1, v0, v1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 23
    .line 24
    .line 25
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    const-string v0, "MessageClient"

    .line 30
    .line 31
    invoke-static {v0, p1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 32
    .line 33
    .line 34
    iget-object p1, p0, Lcom/zykj/message/client/z;->a:Lcom/zykj/message/client/MessageClient$INSTANCES;

    .line 35
    .line 36
    invoke-static {p1}, Lcom/zykj/message/client/MessageClient$INSTANCES;->access$getTimeOut$p(Lcom/zykj/message/client/MessageClient$INSTANCES;)Ljava/util/Timer;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    if-eqz v0, :cond_0

    .line 41
    .line 42
    invoke-virtual {v0}, Ljava/util/Timer;->cancel()V

    .line 43
    .line 44
    .line 45
    :cond_0
    const/4 v0, 0x0

    .line 46
    invoke-static {p1, v0}, Lcom/zykj/message/client/MessageClient$INSTANCES;->access$setTimeOut$p(Lcom/zykj/message/client/MessageClient$INSTANCES;Ljava/util/Timer;)V

    .line 47
    .line 48
    .line 49
    sget v0, Ld4/c;->c:I

    .line 50
    .line 51
    const-string v0, "com.zykj.message.server.MessageServer"

    .line 52
    .line 53
    invoke-interface {p2, v0}, Landroid/os/IBinder;->queryLocalInterface(Ljava/lang/String;)Landroid/os/IInterface;

    .line 54
    .line 55
    .line 56
    move-result-object v0

    .line 57
    if-eqz v0, :cond_1

    .line 58
    .line 59
    instance-of v1, v0, Ld4/d;

    .line 60
    .line 61
    if-eqz v1, :cond_1

    .line 62
    .line 63
    check-cast v0, Ld4/d;

    .line 64
    .line 65
    goto :goto_0

    .line 66
    :cond_1
    new-instance v0, Ld4/b;

    .line 67
    .line 68
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 69
    .line 70
    .line 71
    iput-object p2, v0, Ld4/b;->c:Landroid/os/IBinder;

    .line 72
    .line 73
    :goto_0
    invoke-virtual {p1, v0}, Lcom/zykj/message/client/MessageClient$INSTANCES;->setRemoteServer(Ld4/d;)V

    .line 74
    .line 75
    .line 76
    new-instance p2, Lcom/zykj/message/client/MessageClient$INSTANCES$mConnection$1$onServiceConnected$1;

    .line 77
    .line 78
    invoke-direct {p2, p0}, Lcom/zykj/message/client/MessageClient$INSTANCES$mConnection$1$onServiceConnected$1;-><init>(Lcom/zykj/message/client/z;)V

    .line 79
    .line 80
    .line 81
    invoke-virtual {p1, p2}, Lcom/zykj/message/client/MessageClient$INSTANCES;->getServerInfo(Lr6/c;)V

    .line 82
    .line 83
    .line 84
    invoke-static {p1}, Lcom/zykj/message/client/MessageClient$INSTANCES;->access$getListenerList$p(Lcom/zykj/message/client/MessageClient$INSTANCES;)Ljava/util/List;

    .line 85
    .line 86
    .line 87
    move-result-object p2

    .line 88
    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 89
    .line 90
    .line 91
    move-result-object p2

    .line 92
    :goto_1
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 93
    .line 94
    .line 95
    move-result v0

    .line 96
    if-eqz v0, :cond_2

    .line 97
    .line 98
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 99
    .line 100
    .line 101
    move-result-object v0

    .line 102
    check-cast v0, Lc4/a;

    .line 103
    .line 104
    invoke-virtual {p1, v0}, Lcom/zykj/message/client/MessageClient$INSTANCES;->registerListener(Lc4/a;)V

    .line 105
    .line 106
    .line 107
    goto :goto_1

    .line 108
    :cond_2
    invoke-static {p1}, Lcom/zykj/message/client/MessageClient$INSTANCES;->access$registerResumeListener(Lcom/zykj/message/client/MessageClient$INSTANCES;)V

    .line 109
    .line 110
    .line 111
    return-void
.end method

.method public final onServiceDisconnected(Landroid/content/ComponentName;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/zykj/message/client/z;->a:Lcom/zykj/message/client/MessageClient$INSTANCES;

    .line 2
    .line 3
    const-string v1, "className"

    .line 4
    .line 5
    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    const-string p1, "MessageClient"

    .line 9
    .line 10
    const-string v1, "\u4e2a\u4eba\u4e2d\u5fc3\u670d\u52a1\u5931\u53bb\u8fde\u63a5"

    .line 11
    .line 12
    invoke-static {p1, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 13
    .line 14
    .line 15
    :try_start_0
    invoke-static {v0}, Lcom/zykj/message/client/MessageClient$INSTANCES;->access$getMContext$p(Lcom/zykj/message/client/MessageClient$INSTANCES;)Landroid/app/Application;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    invoke-virtual {p1, p0}, Landroid/content/Context;->unbindService(Landroid/content/ServiceConnection;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 20
    .line 21
    .line 22
    :catch_0
    const/4 p1, 0x0

    .line 23
    invoke-virtual {v0, p1}, Lcom/zykj/message/client/MessageClient$INSTANCES;->setRemoteServer(Ld4/d;)V

    .line 24
    .line 25
    .line 26
    return-void
.end method
