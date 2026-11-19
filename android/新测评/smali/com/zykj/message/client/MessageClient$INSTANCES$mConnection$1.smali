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
    .locals 1

    .line 1
    const-string v0, "className"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string/jumbo p1, "service"

    .line 7
    .line 8
    .line 9
    invoke-static {p2, p1}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 13
    .line 14
    .line 15
    iget-object p1, p0, Lcom/zykj/message/client/MessageClient$INSTANCES$mConnection$1;->a:Lcom/zykj/message/client/MessageClient$INSTANCES;

    .line 16
    .line 17
    invoke-static {p1}, Lcom/zykj/message/client/MessageClient$INSTANCES;->z(Lcom/zykj/message/client/MessageClient$INSTANCES;)Ljava/util/Timer;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    if-eqz p1, :cond_0

    .line 22
    .line 23
    invoke-virtual {p1}, Ljava/util/Timer;->cancel()V

    .line 24
    .line 25
    .line 26
    :cond_0
    iget-object p1, p0, Lcom/zykj/message/client/MessageClient$INSTANCES$mConnection$1;->a:Lcom/zykj/message/client/MessageClient$INSTANCES;

    .line 27
    .line 28
    const/4 v0, 0x0

    .line 29
    invoke-static {p1, v0}, Lcom/zykj/message/client/MessageClient$INSTANCES;->B(Lcom/zykj/message/client/MessageClient$INSTANCES;Ljava/util/Timer;)V

    .line 30
    .line 31
    .line 32
    iget-object p1, p0, Lcom/zykj/message/client/MessageClient$INSTANCES$mConnection$1;->a:Lcom/zykj/message/client/MessageClient$INSTANCES;

    .line 33
    .line 34
    invoke-static {p2}, Ln7/b$a;->h(Landroid/os/IBinder;)Ln7/b;

    .line 35
    .line 36
    .line 37
    move-result-object p2

    .line 38
    invoke-virtual {p1, p2}, Lcom/zykj/message/client/MessageClient$INSTANCES;->J(Ln7/b;)V

    .line 39
    .line 40
    .line 41
    iget-object p1, p0, Lcom/zykj/message/client/MessageClient$INSTANCES$mConnection$1;->a:Lcom/zykj/message/client/MessageClient$INSTANCES;

    .line 42
    .line 43
    new-instance p2, Lcom/zykj/message/client/MessageClient$INSTANCES$mConnection$1$onServiceConnected$1;

    .line 44
    .line 45
    invoke-direct {p2, p0}, Lcom/zykj/message/client/MessageClient$INSTANCES$mConnection$1$onServiceConnected$1;-><init>(Lcom/zykj/message/client/MessageClient$INSTANCES$mConnection$1;)V

    .line 46
    .line 47
    .line 48
    invoke-virtual {p1, p2}, Lcom/zykj/message/client/MessageClient$INSTANCES;->f(Lkotlin/jvm/functions/Function1;)V

    .line 49
    .line 50
    .line 51
    iget-object p1, p0, Lcom/zykj/message/client/MessageClient$INSTANCES$mConnection$1;->a:Lcom/zykj/message/client/MessageClient$INSTANCES;

    .line 52
    .line 53
    invoke-static {p1}, Lcom/zykj/message/client/MessageClient$INSTANCES;->v(Lcom/zykj/message/client/MessageClient$INSTANCES;)Ljava/util/List;

    .line 54
    .line 55
    .line 56
    move-result-object p1

    .line 57
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 58
    .line 59
    .line 60
    move-result-object p1

    .line 61
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 62
    .line 63
    .line 64
    move-result p2

    .line 65
    if-eqz p2, :cond_1

    .line 66
    .line 67
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 68
    .line 69
    .line 70
    move-result-object p2

    .line 71
    check-cast p2, Lm7/a;

    .line 72
    .line 73
    iget-object v0, p0, Lcom/zykj/message/client/MessageClient$INSTANCES$mConnection$1;->a:Lcom/zykj/message/client/MessageClient$INSTANCES;

    .line 74
    .line 75
    invoke-virtual {v0, p2}, Lcom/zykj/message/client/MessageClient$INSTANCES;->H(Lm7/a;)V

    .line 76
    .line 77
    .line 78
    goto :goto_0

    .line 79
    :cond_1
    iget-object p1, p0, Lcom/zykj/message/client/MessageClient$INSTANCES$mConnection$1;->a:Lcom/zykj/message/client/MessageClient$INSTANCES;

    .line 80
    .line 81
    invoke-static {p1}, Lcom/zykj/message/client/MessageClient$INSTANCES;->A(Lcom/zykj/message/client/MessageClient$INSTANCES;)V

    .line 82
    .line 83
    .line 84
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
    invoke-static {p1}, Lcom/zykj/message/client/MessageClient$INSTANCES;->x(Lcom/zykj/message/client/MessageClient$INSTANCES;)Landroid/app/Application;

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
    invoke-virtual {p1, v0}, Lcom/zykj/message/client/MessageClient$INSTANCES;->J(Ln7/b;)V

    .line 19
    .line 20
    .line 21
    return-void
.end method
