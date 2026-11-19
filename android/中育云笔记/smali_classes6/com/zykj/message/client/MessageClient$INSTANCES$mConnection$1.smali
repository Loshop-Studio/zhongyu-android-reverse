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
.field public final synthetic c:Lcom/zykj/message/client/MessageClient$INSTANCES;


# direct methods
.method public constructor <init>(Lcom/zykj/message/client/MessageClient$INSTANCES;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/zykj/message/client/MessageClient$INSTANCES$mConnection$1;->c:Lcom/zykj/message/client/MessageClient$INSTANCES;

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
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string p1, "service"

    .line 7
    .line 8
    invoke-static {p2, p1}, Lkotlin/jvm/internal/u;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 12
    .line 13
    .line 14
    iget-object p1, p0, Lcom/zykj/message/client/MessageClient$INSTANCES$mConnection$1;->c:Lcom/zykj/message/client/MessageClient$INSTANCES;

    .line 15
    .line 16
    invoke-static {p1}, Lcom/zykj/message/client/MessageClient$INSTANCES;->y(Lcom/zykj/message/client/MessageClient$INSTANCES;)Ljava/util/Timer;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    if-eqz p1, :cond_0

    .line 21
    .line 22
    invoke-virtual {p1}, Ljava/util/Timer;->cancel()V

    .line 23
    .line 24
    .line 25
    :cond_0
    iget-object p1, p0, Lcom/zykj/message/client/MessageClient$INSTANCES$mConnection$1;->c:Lcom/zykj/message/client/MessageClient$INSTANCES;

    .line 26
    .line 27
    const/4 v0, 0x0

    .line 28
    invoke-static {p1, v0}, Lcom/zykj/message/client/MessageClient$INSTANCES;->A(Lcom/zykj/message/client/MessageClient$INSTANCES;Ljava/util/Timer;)V

    .line 29
    .line 30
    .line 31
    iget-object p1, p0, Lcom/zykj/message/client/MessageClient$INSTANCES$mConnection$1;->c:Lcom/zykj/message/client/MessageClient$INSTANCES;

    .line 32
    .line 33
    invoke-static {p2}, Leb/b$a;->l(Landroid/os/IBinder;)Leb/b;

    .line 34
    .line 35
    .line 36
    move-result-object p2

    .line 37
    invoke-virtual {p1, p2}, Lcom/zykj/message/client/MessageClient$INSTANCES;->I(Leb/b;)V

    .line 38
    .line 39
    .line 40
    iget-object p1, p0, Lcom/zykj/message/client/MessageClient$INSTANCES$mConnection$1;->c:Lcom/zykj/message/client/MessageClient$INSTANCES;

    .line 41
    .line 42
    new-instance p2, Lcom/zykj/message/client/MessageClient$INSTANCES$mConnection$1$onServiceConnected$1;

    .line 43
    .line 44
    invoke-direct {p2, p0}, Lcom/zykj/message/client/MessageClient$INSTANCES$mConnection$1$onServiceConnected$1;-><init>(Lcom/zykj/message/client/MessageClient$INSTANCES$mConnection$1;)V

    .line 45
    .line 46
    .line 47
    invoke-virtual {p1, p2}, Lcom/zykj/message/client/MessageClient$INSTANCES;->c(Lhd/l;)V

    .line 48
    .line 49
    .line 50
    iget-object p1, p0, Lcom/zykj/message/client/MessageClient$INSTANCES$mConnection$1;->c:Lcom/zykj/message/client/MessageClient$INSTANCES;

    .line 51
    .line 52
    invoke-static {p1}, Lcom/zykj/message/client/MessageClient$INSTANCES;->r(Lcom/zykj/message/client/MessageClient$INSTANCES;)Ljava/util/List;

    .line 53
    .line 54
    .line 55
    move-result-object p1

    .line 56
    check-cast p1, Ljava/lang/Iterable;

    .line 57
    .line 58
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 59
    .line 60
    .line 61
    move-result-object p1

    .line 62
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 63
    .line 64
    .line 65
    move-result p2

    .line 66
    if-eqz p2, :cond_1

    .line 67
    .line 68
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 69
    .line 70
    .line 71
    move-result-object p2

    .line 72
    check-cast p2, Ldb/a;

    .line 73
    .line 74
    iget-object v0, p0, Lcom/zykj/message/client/MessageClient$INSTANCES$mConnection$1;->c:Lcom/zykj/message/client/MessageClient$INSTANCES;

    .line 75
    .line 76
    invoke-virtual {v0, p2}, Lcom/zykj/message/client/MessageClient$INSTANCES;->k(Ldb/a;)V

    .line 77
    .line 78
    .line 79
    goto :goto_0

    .line 80
    :cond_1
    iget-object p1, p0, Lcom/zykj/message/client/MessageClient$INSTANCES$mConnection$1;->c:Lcom/zykj/message/client/MessageClient$INSTANCES;

    .line 81
    .line 82
    invoke-static {p1}, Lcom/zykj/message/client/MessageClient$INSTANCES;->z(Lcom/zykj/message/client/MessageClient$INSTANCES;)V

    .line 83
    .line 84
    .line 85
    return-void
.end method

.method public onServiceDisconnected(Landroid/content/ComponentName;)V
    .locals 1

    .line 1
    const-string v0, "className"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    :try_start_0
    iget-object p1, p0, Lcom/zykj/message/client/MessageClient$INSTANCES$mConnection$1;->c:Lcom/zykj/message/client/MessageClient$INSTANCES;

    .line 7
    .line 8
    invoke-static {p1}, Lcom/zykj/message/client/MessageClient$INSTANCES;->u(Lcom/zykj/message/client/MessageClient$INSTANCES;)Landroid/app/Application;

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
    iget-object p1, p0, Lcom/zykj/message/client/MessageClient$INSTANCES$mConnection$1;->c:Lcom/zykj/message/client/MessageClient$INSTANCES;

    .line 16
    .line 17
    const/4 v0, 0x0

    .line 18
    invoke-virtual {p1, v0}, Lcom/zykj/message/client/MessageClient$INSTANCES;->I(Leb/b;)V

    .line 19
    .line 20
    .line 21
    return-void
.end method
