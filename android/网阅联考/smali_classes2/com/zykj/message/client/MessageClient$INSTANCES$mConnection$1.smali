.class public final Lcom/zykj/message/client/MessageClient$INSTANCES$mConnection$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/content/ServiceConnection;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/message/client/MessageClient$INSTANCES;-><init>(Ljava/lang/String;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lcom/zykj/message/client/MessageClient$INSTANCES;


# direct methods
.method public constructor <init>(Lcom/zykj/message/client/MessageClient$INSTANCES;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/zykj/message/client/MessageClient$INSTANCES$mConnection$1;->a:Lcom/zykj/message/client/MessageClient$INSTANCES;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public onServiceConnected(Landroid/content/ComponentName;Landroid/os/IBinder;)V
    .locals 2

    .line 1
    const-string v0, "className"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string p1, "service"

    .line 7
    .line 8
    invoke-static {p2, p1}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    new-instance p1, Ljava/lang/StringBuilder;

    .line 12
    .line 13
    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    .line 14
    .line 15
    .line 16
    const-string v0, "\u8fde\u63a5\u5230\u4e2a\u4eba\u4e2d\u5fc3\u670d\u52a1"

    .line 17
    .line 18
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 19
    .line 20
    .line 21
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 22
    .line 23
    .line 24
    move-result-wide v0

    .line 25
    invoke-virtual {p1, v0, v1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    iget-object p1, p0, Lcom/zykj/message/client/MessageClient$INSTANCES$mConnection$1;->a:Lcom/zykj/message/client/MessageClient$INSTANCES;

    .line 29
    .line 30
    invoke-static {p1}, Lcom/zykj/message/client/MessageClient$INSTANCES;->k(Lcom/zykj/message/client/MessageClient$INSTANCES;)Ljava/util/Timer;

    .line 31
    .line 32
    .line 33
    move-result-object p1

    .line 34
    if-eqz p1, :cond_0

    .line 35
    .line 36
    invoke-virtual {p1}, Ljava/util/Timer;->cancel()V

    .line 37
    .line 38
    .line 39
    :cond_0
    iget-object p1, p0, Lcom/zykj/message/client/MessageClient$INSTANCES$mConnection$1;->a:Lcom/zykj/message/client/MessageClient$INSTANCES;

    .line 40
    .line 41
    const/4 v0, 0x0

    .line 42
    invoke-static {p1, v0}, Lcom/zykj/message/client/MessageClient$INSTANCES;->m(Lcom/zykj/message/client/MessageClient$INSTANCES;Ljava/util/Timer;)V

    .line 43
    .line 44
    .line 45
    iget-object p1, p0, Lcom/zykj/message/client/MessageClient$INSTANCES$mConnection$1;->a:Lcom/zykj/message/client/MessageClient$INSTANCES;

    .line 46
    .line 47
    invoke-static {p2}, La2/b$a;->f(Landroid/os/IBinder;)La2/b;

    .line 48
    .line 49
    .line 50
    move-result-object p2

    .line 51
    invoke-virtual {p1, p2}, Lcom/zykj/message/client/MessageClient$INSTANCES;->u(La2/b;)V

    .line 52
    .line 53
    .line 54
    iget-object p1, p0, Lcom/zykj/message/client/MessageClient$INSTANCES$mConnection$1;->a:Lcom/zykj/message/client/MessageClient$INSTANCES;

    .line 55
    .line 56
    new-instance p2, Lcom/zykj/message/client/MessageClient$INSTANCES$mConnection$1$onServiceConnected$1;

    .line 57
    .line 58
    invoke-direct {p2, p0}, Lcom/zykj/message/client/MessageClient$INSTANCES$mConnection$1$onServiceConnected$1;-><init>(Lcom/zykj/message/client/MessageClient$INSTANCES$mConnection$1;)V

    .line 59
    .line 60
    .line 61
    invoke-virtual {p1, p2}, Lcom/zykj/message/client/MessageClient$INSTANCES;->a(Lkotlin/jvm/functions/Function1;)V

    .line 62
    .line 63
    .line 64
    iget-object p1, p0, Lcom/zykj/message/client/MessageClient$INSTANCES$mConnection$1;->a:Lcom/zykj/message/client/MessageClient$INSTANCES;

    .line 65
    .line 66
    invoke-static {p1}, Lcom/zykj/message/client/MessageClient$INSTANCES;->g(Lcom/zykj/message/client/MessageClient$INSTANCES;)Ljava/util/List;

    .line 67
    .line 68
    .line 69
    move-result-object p1

    .line 70
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 71
    .line 72
    .line 73
    move-result-object p1

    .line 74
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 75
    .line 76
    .line 77
    move-result p2

    .line 78
    if-eqz p2, :cond_1

    .line 79
    .line 80
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 81
    .line 82
    .line 83
    move-result-object p2

    .line 84
    check-cast p2, Lz1/a;

    .line 85
    .line 86
    iget-object v0, p0, Lcom/zykj/message/client/MessageClient$INSTANCES$mConnection$1;->a:Lcom/zykj/message/client/MessageClient$INSTANCES;

    .line 87
    .line 88
    invoke-virtual {v0, p2}, Lcom/zykj/message/client/MessageClient$INSTANCES;->s(Lz1/a;)V

    .line 89
    .line 90
    .line 91
    goto :goto_0

    .line 92
    :cond_1
    iget-object p1, p0, Lcom/zykj/message/client/MessageClient$INSTANCES$mConnection$1;->a:Lcom/zykj/message/client/MessageClient$INSTANCES;

    .line 93
    .line 94
    invoke-static {p1}, Lcom/zykj/message/client/MessageClient$INSTANCES;->l(Lcom/zykj/message/client/MessageClient$INSTANCES;)V

    .line 95
    .line 96
    .line 97
    return-void
.end method

.method public onServiceDisconnected(Landroid/content/ComponentName;)V
    .locals 1

    .line 1
    const-string v0, "className"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    :try_start_0
    iget-object p1, p0, Lcom/zykj/message/client/MessageClient$INSTANCES$mConnection$1;->a:Lcom/zykj/message/client/MessageClient$INSTANCES;

    .line 7
    .line 8
    invoke-static {p1}, Lcom/zykj/message/client/MessageClient$INSTANCES;->i(Lcom/zykj/message/client/MessageClient$INSTANCES;)Landroid/app/Application;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    invoke-virtual {p1, p0}, Landroid/content/Context;->unbindService(Landroid/content/ServiceConnection;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 13
    .line 14
    .line 15
    :catch_0
    iget-object p1, p0, Lcom/zykj/message/client/MessageClient$INSTANCES$mConnection$1;->a:Lcom/zykj/message/client/MessageClient$INSTANCES;

    .line 16
    .line 17
    const/4 v0, 0x0

    .line 18
    invoke-virtual {p1, v0}, Lcom/zykj/message/client/MessageClient$INSTANCES;->u(La2/b;)V

    .line 19
    .line 20
    .line 21
    return-void
.end method
