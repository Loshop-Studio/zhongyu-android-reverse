.class final Lcom/zykj/message/client/MessageClient$INSTANCES;
.super Lcom/zykj/message/client/MessageClient;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/zykj/message/client/MessageClient;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "INSTANCES"
.end annotation


# instance fields
.field public f:Leb/b;

.field public g:Landroid/app/Application;

.field public h:Ljava/util/Timer;

.field public i:Ljava/util/List;

.field public final j:Ljava/util/List;

.field public final k:Lcom/zykj/message/client/MessageClient$INSTANCES$mConnection$1;

.field public final l:Landroid/os/Handler;


# direct methods
.method public constructor <init>(Ljava/lang/String;I)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-direct {p0, p1, p2, v0}, Lcom/zykj/message/client/MessageClient;-><init>(Ljava/lang/String;ILkotlin/jvm/internal/n;)V

    .line 3
    .line 4
    .line 5
    new-instance p1, Ljava/util/ArrayList;

    .line 6
    .line 7
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 8
    .line 9
    .line 10
    iput-object p1, p0, Lcom/zykj/message/client/MessageClient$INSTANCES;->i:Ljava/util/List;

    .line 11
    .line 12
    new-instance p1, Ljava/util/ArrayList;

    .line 13
    .line 14
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 15
    .line 16
    .line 17
    iput-object p1, p0, Lcom/zykj/message/client/MessageClient$INSTANCES;->j:Ljava/util/List;

    .line 18
    .line 19
    new-instance p1, Lcom/zykj/message/client/MessageClient$INSTANCES$mConnection$1;

    .line 20
    .line 21
    invoke-direct {p1, p0}, Lcom/zykj/message/client/MessageClient$INSTANCES$mConnection$1;-><init>(Lcom/zykj/message/client/MessageClient$INSTANCES;)V

    .line 22
    .line 23
    .line 24
    iput-object p1, p0, Lcom/zykj/message/client/MessageClient$INSTANCES;->k:Lcom/zykj/message/client/MessageClient$INSTANCES$mConnection$1;

    .line 25
    .line 26
    new-instance p1, Landroid/os/Handler;

    .line 27
    .line 28
    new-instance p2, Lcom/zykj/message/client/MessageClient$INSTANCES$c;

    .line 29
    .line 30
    invoke-direct {p2, p0}, Lcom/zykj/message/client/MessageClient$INSTANCES$c;-><init>(Lcom/zykj/message/client/MessageClient$INSTANCES;)V

    .line 31
    .line 32
    .line 33
    invoke-direct {p1, p2}, Landroid/os/Handler;-><init>(Landroid/os/Handler$Callback;)V

    .line 34
    .line 35
    .line 36
    iput-object p1, p0, Lcom/zykj/message/client/MessageClient$INSTANCES;->l:Landroid/os/Handler;

    .line 37
    .line 38
    return-void
.end method

.method public static final synthetic A(Lcom/zykj/message/client/MessageClient$INSTANCES;Ljava/util/Timer;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/zykj/message/client/MessageClient$INSTANCES;->h:Ljava/util/Timer;

    .line 2
    .line 3
    return-void
.end method

.method public static final synthetic p(Lcom/zykj/message/client/MessageClient$INSTANCES;Lcom/zykj/message/server/bean/ServerInfo;Z)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Lcom/zykj/message/client/MessageClient$INSTANCES;->C(Lcom/zykj/message/server/bean/ServerInfo;Z)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static final synthetic r(Lcom/zykj/message/client/MessageClient$INSTANCES;)Ljava/util/List;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/zykj/message/client/MessageClient$INSTANCES;->i:Ljava/util/List;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic t(Lcom/zykj/message/client/MessageClient$INSTANCES;)Lcom/zykj/message/client/MessageClient$INSTANCES$mConnection$1;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/zykj/message/client/MessageClient$INSTANCES;->k:Lcom/zykj/message/client/MessageClient$INSTANCES$mConnection$1;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic u(Lcom/zykj/message/client/MessageClient$INSTANCES;)Landroid/app/Application;
    .locals 1

    .line 1
    iget-object p0, p0, Lcom/zykj/message/client/MessageClient$INSTANCES;->g:Landroid/app/Application;

    .line 2
    .line 3
    if-nez p0, :cond_0

    .line 4
    .line 5
    const-string v0, "mContext"

    .line 6
    .line 7
    invoke-static {v0}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    :cond_0
    return-object p0
.end method

.method public static final synthetic v(Lcom/zykj/message/client/MessageClient$INSTANCES;)Landroid/os/Handler;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/zykj/message/client/MessageClient$INSTANCES;->l:Landroid/os/Handler;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic y(Lcom/zykj/message/client/MessageClient$INSTANCES;)Ljava/util/Timer;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/zykj/message/client/MessageClient$INSTANCES;->h:Ljava/util/Timer;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic z(Lcom/zykj/message/client/MessageClient$INSTANCES;)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/zykj/message/client/MessageClient$INSTANCES;->H()V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public final C(Lcom/zykj/message/server/bean/ServerInfo;Z)V
    .locals 2

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    invoke-virtual {p1}, Lcom/zykj/message/server/bean/ServerInfo;->b()Lcom/zykj/message/server/bean/Status;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    if-eqz p1, :cond_0

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    sget-object p1, Lcom/zykj/message/server/bean/Status;->e:Lcom/zykj/message/server/bean/Status;

    .line 11
    .line 12
    :goto_0
    sget-object v0, Lcb/c;->a:[I

    .line 13
    .line 14
    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    .line 15
    .line 16
    .line 17
    move-result p1

    .line 18
    aget p1, v0, p1

    .line 19
    .line 20
    const/4 v0, 0x1

    .line 21
    if-eq p1, v0, :cond_5

    .line 22
    .line 23
    const/4 v0, 0x2

    .line 24
    const-string v1, "mContext"

    .line 25
    .line 26
    if-eq p1, v0, :cond_3

    .line 27
    .line 28
    const/4 v0, 0x3

    .line 29
    if-eq p1, v0, :cond_1

    .line 30
    .line 31
    return-void

    .line 32
    :cond_1
    iget-object p1, p0, Lcom/zykj/message/client/MessageClient$INSTANCES;->g:Landroid/app/Application;

    .line 33
    .line 34
    if-nez p1, :cond_2

    .line 35
    .line 36
    invoke-static {v1}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 37
    .line 38
    .line 39
    :cond_2
    invoke-virtual {p0, p1, p2}, Lcom/zykj/message/client/MessageClient$INSTANCES;->F(Landroid/content/Context;Z)V

    .line 40
    .line 41
    .line 42
    return-void

    .line 43
    :cond_3
    iget-object p1, p0, Lcom/zykj/message/client/MessageClient$INSTANCES;->g:Landroid/app/Application;

    .line 44
    .line 45
    if-nez p1, :cond_4

    .line 46
    .line 47
    invoke-static {v1}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 48
    .line 49
    .line 50
    :cond_4
    invoke-virtual {p0, p1, p2}, Lcom/zykj/message/client/MessageClient$INSTANCES;->F(Landroid/content/Context;Z)V

    .line 51
    .line 52
    .line 53
    return-void

    .line 54
    :cond_5
    iget-object p1, p0, Lcom/zykj/message/client/MessageClient$INSTANCES;->j:Ljava/util/List;

    .line 55
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
    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 63
    .line 64
    .line 65
    move-result p2

    .line 66
    if-eqz p2, :cond_6

    .line 67
    .line 68
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 69
    .line 70
    .line 71
    move-result-object p2

    .line 72
    check-cast p2, Lhd/a;

    .line 73
    .line 74
    invoke-interface {p2}, Lhd/a;->invoke()Ljava/lang/Object;

    .line 75
    .line 76
    .line 77
    goto :goto_1

    .line 78
    :cond_6
    iget-object p1, p0, Lcom/zykj/message/client/MessageClient$INSTANCES;->j:Ljava/util/List;

    .line 79
    .line 80
    invoke-interface {p1}, Ljava/util/List;->clear()V

    .line 81
    .line 82
    .line 83
    return-void
.end method

.method public final D()Leb/b;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/message/client/MessageClient$INSTANCES;->f:Leb/b;

    .line 2
    .line 3
    return-object v0
.end method

.method public E(Landroid/content/Context;Z)V
    .locals 3

    .line 1
    const-string v0, "context"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-static {}, Lcb/a;->i()Lcb/a;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    const-string v1, "ActivityCollectionHelper.with()"

    .line 11
    .line 12
    invoke-static {v0, v1}, Lkotlin/jvm/internal/u;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    invoke-virtual {v0}, Lcb/a;->e()Landroid/app/Activity;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    const-class v2, Lcom/zykj/message/UnInstallActivity;

    .line 20
    .line 21
    if-eqz v0, :cond_0

    .line 22
    .line 23
    invoke-static {}, Lcb/a;->i()Lcb/a;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    invoke-static {v0, v1}, Lkotlin/jvm/internal/u;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    invoke-virtual {v0}, Lcb/a;->e()Landroid/app/Activity;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    invoke-virtual {v0}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    invoke-virtual {v2}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object v1

    .line 46
    invoke-static {v0, v1}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 47
    .line 48
    .line 49
    move-result v0

    .line 50
    if-eqz v0, :cond_0

    .line 51
    .line 52
    return-void

    .line 53
    :cond_0
    invoke-static {}, Lcb/a;->i()Lcb/a;

    .line 54
    .line 55
    .line 56
    move-result-object v0

    .line 57
    invoke-virtual {v0}, Lcb/a;->d()V

    .line 58
    .line 59
    .line 60
    new-instance v0, Landroid/content/Intent;

    .line 61
    .line 62
    invoke-direct {v0, p1, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 63
    .line 64
    .line 65
    const-string v1, "hidden"

    .line 66
    .line 67
    invoke-virtual {v0, v1, p2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 68
    .line 69
    .line 70
    const/high16 p2, 0x10000000

    .line 71
    .line 72
    invoke-virtual {v0, p2}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    .line 73
    .line 74
    .line 75
    const/high16 p2, 0x4000000

    .line 76
    .line 77
    invoke-virtual {v0, p2}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    .line 78
    .line 79
    .line 80
    invoke-virtual {p1, v0}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    .line 81
    .line 82
    .line 83
    return-void
.end method

.method public F(Landroid/content/Context;Z)V
    .locals 3

    .line 1
    const-string v0, "context"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-static {}, Lcb/a;->i()Lcb/a;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    const-string v1, "ActivityCollectionHelper.with()"

    .line 11
    .line 12
    invoke-static {v0, v1}, Lkotlin/jvm/internal/u;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    invoke-virtual {v0}, Lcb/a;->e()Landroid/app/Activity;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    const-class v2, Lcom/zykj/message/UnLoginActivity;

    .line 20
    .line 21
    if-eqz v0, :cond_0

    .line 22
    .line 23
    invoke-static {}, Lcb/a;->i()Lcb/a;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    invoke-static {v0, v1}, Lkotlin/jvm/internal/u;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    invoke-virtual {v0}, Lcb/a;->e()Landroid/app/Activity;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    invoke-virtual {v0}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    invoke-virtual {v2}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object v1

    .line 46
    invoke-static {v0, v1}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 47
    .line 48
    .line 49
    move-result v0

    .line 50
    if-eqz v0, :cond_0

    .line 51
    .line 52
    return-void

    .line 53
    :cond_0
    invoke-static {}, Lcb/a;->i()Lcb/a;

    .line 54
    .line 55
    .line 56
    move-result-object v0

    .line 57
    invoke-virtual {v0}, Lcb/a;->d()V

    .line 58
    .line 59
    .line 60
    new-instance v0, Landroid/content/Intent;

    .line 61
    .line 62
    invoke-direct {v0, p1, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 63
    .line 64
    .line 65
    const-string v1, "hidden"

    .line 66
    .line 67
    invoke-virtual {v0, v1, p2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 68
    .line 69
    .line 70
    const/high16 p2, 0x10000000

    .line 71
    .line 72
    invoke-virtual {v0, p2}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    .line 73
    .line 74
    .line 75
    const/high16 p2, 0x4000000

    .line 76
    .line 77
    invoke-virtual {v0, p2}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    .line 78
    .line 79
    .line 80
    invoke-virtual {p1, v0}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    .line 81
    .line 82
    .line 83
    return-void
.end method

.method public final G()V
    .locals 4

    .line 1
    new-instance v0, Landroid/content/Intent;

    .line 2
    .line 3
    invoke-direct {v0}, Landroid/content/Intent;-><init>()V

    .line 4
    .line 5
    .line 6
    const-string v1, "com.zykj.action.zykj.message.service.awaken"

    .line 7
    .line 8
    invoke-virtual {v0, v1}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    .line 9
    .line 10
    .line 11
    const/high16 v1, 0x10000000

    .line 12
    .line 13
    invoke-virtual {v0, v1}, Landroid/content/Intent;->setFlags(I)Landroid/content/Intent;

    .line 14
    .line 15
    .line 16
    iget-object v1, p0, Lcom/zykj/message/client/MessageClient$INSTANCES;->g:Landroid/app/Application;

    .line 17
    .line 18
    if-nez v1, :cond_0

    .line 19
    .line 20
    const-string v2, "mContext"

    .line 21
    .line 22
    invoke-static {v2}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    :cond_0
    invoke-virtual {v1, v0}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    .line 26
    .line 27
    .line 28
    new-instance v0, Ljava/util/Timer;

    .line 29
    .line 30
    invoke-direct {v0}, Ljava/util/Timer;-><init>()V

    .line 31
    .line 32
    .line 33
    iput-object v0, p0, Lcom/zykj/message/client/MessageClient$INSTANCES;->h:Ljava/util/Timer;

    .line 34
    .line 35
    new-instance v1, Lcom/zykj/message/client/MessageClient$INSTANCES$d;

    .line 36
    .line 37
    invoke-direct {v1, p0}, Lcom/zykj/message/client/MessageClient$INSTANCES$d;-><init>(Lcom/zykj/message/client/MessageClient$INSTANCES;)V

    .line 38
    .line 39
    .line 40
    const-wide/16 v2, 0x3e8

    .line 41
    .line 42
    invoke-virtual {v0, v1, v2, v3}, Ljava/util/Timer;->schedule(Ljava/util/TimerTask;J)V

    .line 43
    .line 44
    .line 45
    return-void
.end method

.method public final H()V
    .locals 2

    .line 1
    invoke-static {}, Lcb/a;->i()Lcb/a;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    new-instance v1, Lcom/zykj/message/client/MessageClient$INSTANCES$registerResumeListener$1;

    .line 6
    .line 7
    invoke-direct {v1, p0}, Lcom/zykj/message/client/MessageClient$INSTANCES$registerResumeListener$1;-><init>(Lcom/zykj/message/client/MessageClient$INSTANCES;)V

    .line 8
    .line 9
    .line 10
    invoke-virtual {v0, v1}, Lcb/a;->g(Lcb/a$b;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public final I(Leb/b;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/zykj/message/client/MessageClient$INSTANCES;->f:Leb/b;

    .line 2
    .line 3
    return-void
.end method

.method public a(Lcb/b;)V
    .locals 2

    .line 1
    const-string v0, "callBack"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/zykj/message/client/MessageClient$INSTANCES;->f:Leb/b;

    .line 7
    .line 8
    if-eqz v0, :cond_1

    .line 9
    .line 10
    if-nez v0, :cond_0

    .line 11
    .line 12
    invoke-static {}, Lkotlin/jvm/internal/u;->s()V

    .line 13
    .line 14
    .line 15
    :cond_0
    invoke-interface {v0}, Landroid/os/IInterface;->asBinder()Landroid/os/IBinder;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    invoke-interface {v0}, Landroid/os/IBinder;->pingBinder()Z

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    if-eqz v0, :cond_1

    .line 24
    .line 25
    new-instance v0, Ljava/lang/Thread;

    .line 26
    .line 27
    new-instance v1, Lcom/zykj/message/client/MessageClient$INSTANCES$a;

    .line 28
    .line 29
    invoke-direct {v1, p0, p1}, Lcom/zykj/message/client/MessageClient$INSTANCES$a;-><init>(Lcom/zykj/message/client/MessageClient$INSTANCES;Lcb/b;)V

    .line 30
    .line 31
    .line 32
    invoke-direct {v0, v1}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    .line 33
    .line 34
    .line 35
    invoke-virtual {v0}, Ljava/lang/Thread;->start()V

    .line 36
    .line 37
    .line 38
    return-void

    .line 39
    :cond_1
    iget-object v0, p0, Lcom/zykj/message/client/MessageClient$INSTANCES;->j:Ljava/util/List;

    .line 40
    .line 41
    new-instance v1, Lcom/zykj/message/client/MessageClient$INSTANCES$getServerInfo$2;

    .line 42
    .line 43
    invoke-direct {v1, p0, p1}, Lcom/zykj/message/client/MessageClient$INSTANCES$getServerInfo$2;-><init>(Lcom/zykj/message/client/MessageClient$INSTANCES;Lcb/b;)V

    .line 44
    .line 45
    .line 46
    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 47
    .line 48
    .line 49
    iget-object p1, p0, Lcom/zykj/message/client/MessageClient$INSTANCES;->g:Landroid/app/Application;

    .line 50
    .line 51
    if-nez p1, :cond_2

    .line 52
    .line 53
    const-string v0, "mContext"

    .line 54
    .line 55
    invoke-static {v0}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 56
    .line 57
    .line 58
    :cond_2
    invoke-virtual {p0, p1}, Lcom/zykj/message/client/MessageClient$INSTANCES;->m(Landroid/app/Application;)V

    .line 59
    .line 60
    .line 61
    return-void
.end method

.method public c(Lhd/l;)V
    .locals 2

    .line 1
    const-string v0, "callBack"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/zykj/message/client/MessageClient$INSTANCES;->f:Leb/b;

    .line 7
    .line 8
    if-eqz v0, :cond_1

    .line 9
    .line 10
    if-nez v0, :cond_0

    .line 11
    .line 12
    invoke-static {}, Lkotlin/jvm/internal/u;->s()V

    .line 13
    .line 14
    .line 15
    :cond_0
    invoke-interface {v0}, Landroid/os/IInterface;->asBinder()Landroid/os/IBinder;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    invoke-interface {v0}, Landroid/os/IBinder;->pingBinder()Z

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    if-eqz v0, :cond_1

    .line 24
    .line 25
    new-instance v0, Ljava/lang/Thread;

    .line 26
    .line 27
    new-instance v1, Lcom/zykj/message/client/MessageClient$INSTANCES$b;

    .line 28
    .line 29
    invoke-direct {v1, p0, p1}, Lcom/zykj/message/client/MessageClient$INSTANCES$b;-><init>(Lcom/zykj/message/client/MessageClient$INSTANCES;Lhd/l;)V

    .line 30
    .line 31
    .line 32
    invoke-direct {v0, v1}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    .line 33
    .line 34
    .line 35
    invoke-virtual {v0}, Ljava/lang/Thread;->start()V

    .line 36
    .line 37
    .line 38
    return-void

    .line 39
    :cond_1
    iget-object v0, p0, Lcom/zykj/message/client/MessageClient$INSTANCES;->j:Ljava/util/List;

    .line 40
    .line 41
    new-instance v1, Lcom/zykj/message/client/MessageClient$INSTANCES$getServerInfo$4;

    .line 42
    .line 43
    invoke-direct {v1, p0, p1}, Lcom/zykj/message/client/MessageClient$INSTANCES$getServerInfo$4;-><init>(Lcom/zykj/message/client/MessageClient$INSTANCES;Lhd/l;)V

    .line 44
    .line 45
    .line 46
    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 47
    .line 48
    .line 49
    iget-object p1, p0, Lcom/zykj/message/client/MessageClient$INSTANCES;->g:Landroid/app/Application;

    .line 50
    .line 51
    if-nez p1, :cond_2

    .line 52
    .line 53
    const-string v0, "mContext"

    .line 54
    .line 55
    invoke-static {v0}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 56
    .line 57
    .line 58
    :cond_2
    invoke-virtual {p0, p1}, Lcom/zykj/message/client/MessageClient$INSTANCES;->m(Landroid/app/Application;)V

    .line 59
    .line 60
    .line 61
    return-void
.end method

.method public d()Lcom/zykj/message/server/bean/UserInfo;
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/zykj/message/client/MessageClient$INSTANCES;->f:Leb/b;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_1

    .line 5
    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    invoke-static {}, Lkotlin/jvm/internal/u;->s()V

    .line 9
    .line 10
    .line 11
    :cond_0
    invoke-interface {v0}, Landroid/os/IInterface;->asBinder()Landroid/os/IBinder;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    invoke-interface {v0}, Landroid/os/IBinder;->pingBinder()Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    if-eqz v0, :cond_1

    .line 20
    .line 21
    iget-object v0, p0, Lcom/zykj/message/client/MessageClient$INSTANCES;->f:Leb/b;

    .line 22
    .line 23
    if-eqz v0, :cond_1

    .line 24
    .line 25
    invoke-interface {v0}, Leb/b;->d()Lcom/zykj/message/server/bean/UserInfo;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    return-object v0

    .line 30
    :cond_1
    return-object v1
.end method

.method public e(Landroid/app/Application;)V
    .locals 2

    .line 1
    const-string v0, "context"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, Lcom/zykj/message/client/MessageClient$INSTANCES;->g:Landroid/app/Application;

    .line 7
    .line 8
    invoke-static {}, Lcb/a;->i()Lcb/a;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    iget-object v0, p0, Lcom/zykj/message/client/MessageClient$INSTANCES;->g:Landroid/app/Application;

    .line 13
    .line 14
    if-nez v0, :cond_0

    .line 15
    .line 16
    const-string v1, "mContext"

    .line 17
    .line 18
    invoke-static {v1}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    :cond_0
    invoke-virtual {p1, v0}, Lcb/a;->f(Landroid/app/Application;)V

    .line 22
    .line 23
    .line 24
    return-void
.end method

.method public f()Z
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/zykj/message/client/MessageClient$INSTANCES;->g:Landroid/app/Application;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const-string v1, "mContext"

    .line 6
    .line 7
    invoke-static {v1}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    :cond_0
    invoke-virtual {v0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    const/4 v1, 0x0

    .line 15
    :try_start_0
    const-string v2, "com.zykj.manage"

    .line 16
    .line 17
    invoke-virtual {v0, v2, v1}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;
    :try_end_0
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    .line 18
    .line 19
    .line 20
    const/4 v0, 0x1

    .line 21
    return v0

    .line 22
    :catch_0
    return v1
.end method

.method public declared-synchronized g(Lhd/l;)V
    .locals 3

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    const-string v0, "callBack"

    .line 3
    .line 4
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 5
    .line 6
    .line 7
    iget-object v0, p0, Lcom/zykj/message/client/MessageClient$INSTANCES;->f:Leb/b;

    .line 8
    .line 9
    if-eqz v0, :cond_2

    .line 10
    .line 11
    if-nez v0, :cond_0

    .line 12
    .line 13
    invoke-static {}, Lkotlin/jvm/internal/u;->s()V

    .line 14
    .line 15
    .line 16
    goto :goto_0

    .line 17
    :catchall_0
    move-exception p1

    .line 18
    goto :goto_5

    .line 19
    :cond_0
    :goto_0
    invoke-interface {v0}, Landroid/os/IInterface;->asBinder()Landroid/os/IBinder;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    invoke-interface {v0}, Landroid/os/IBinder;->pingBinder()Z

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    if-eqz v0, :cond_2

    .line 28
    .line 29
    iget-object v0, p0, Lcom/zykj/message/client/MessageClient$INSTANCES;->f:Leb/b;

    .line 30
    .line 31
    if-nez v0, :cond_1

    .line 32
    .line 33
    invoke-static {}, Lkotlin/jvm/internal/u;->s()V

    .line 34
    .line 35
    .line 36
    :cond_1
    new-instance v1, Lcom/zykj/message/client/MessageClient$INSTANCES$e;

    .line 37
    .line 38
    invoke-direct {v1, p1}, Lcom/zykj/message/client/MessageClient$INSTANCES$e;-><init>(Lhd/l;)V

    .line 39
    .line 40
    .line 41
    invoke-interface {v0, v1}, Leb/b;->a(Leb/a;)V

    .line 42
    .line 43
    .line 44
    goto :goto_4

    .line 45
    :cond_2
    iget-object v0, p0, Lcom/zykj/message/client/MessageClient$INSTANCES;->g:Landroid/app/Application;

    .line 46
    .line 47
    if-nez v0, :cond_3

    .line 48
    .line 49
    const-string v1, "mContext"

    .line 50
    .line 51
    invoke-static {v1}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 52
    .line 53
    .line 54
    :cond_3
    invoke-virtual {p0, v0}, Lcom/zykj/message/client/MessageClient$INSTANCES;->m(Landroid/app/Application;)V

    .line 55
    .line 56
    .line 57
    const/4 v0, 0x0

    .line 58
    :goto_1
    const v1, 0x7fffffff

    .line 59
    .line 60
    .line 61
    if-ge v0, v1, :cond_8

    .line 62
    .line 63
    const-wide/16 v1, 0x64

    .line 64
    .line 65
    invoke-static {v1, v2}, Ljava/lang/Thread;->sleep(J)V

    .line 66
    .line 67
    .line 68
    iget-object v1, p0, Lcom/zykj/message/client/MessageClient$INSTANCES;->f:Leb/b;

    .line 69
    .line 70
    const/4 v2, 0x0

    .line 71
    if-eqz v1, :cond_4

    .line 72
    .line 73
    invoke-interface {v1}, Leb/b;->k()Lcom/zykj/message/server/bean/ServerInfo;

    .line 74
    .line 75
    .line 76
    move-result-object v1

    .line 77
    goto :goto_2

    .line 78
    :cond_4
    move-object v1, v2

    .line 79
    :goto_2
    if-nez v1, :cond_6

    .line 80
    .line 81
    const/16 v1, 0x28

    .line 82
    .line 83
    if-le v0, v1, :cond_5

    .line 84
    .line 85
    goto :goto_3

    .line 86
    :cond_5
    add-int/lit8 v0, v0, 0x1

    .line 87
    .line 88
    goto :goto_1

    .line 89
    :cond_6
    :goto_3
    iget-object v0, p0, Lcom/zykj/message/client/MessageClient$INSTANCES;->f:Leb/b;

    .line 90
    .line 91
    if-eqz v0, :cond_7

    .line 92
    .line 93
    invoke-interface {v0}, Leb/b;->k()Lcom/zykj/message/server/bean/ServerInfo;

    .line 94
    .line 95
    .line 96
    move-result-object v2

    .line 97
    :cond_7
    invoke-interface {p1, v2}, Lhd/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 98
    .line 99
    .line 100
    monitor-exit p0

    .line 101
    return-void

    .line 102
    :cond_8
    :goto_4
    monitor-exit p0

    .line 103
    return-void

    .line 104
    :goto_5
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 105
    throw p1
.end method

.method public k(Ldb/a;)V
    .locals 2

    .line 1
    const-string v0, "messageCallBack"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/zykj/message/client/MessageClient$INSTANCES;->f:Leb/b;

    .line 7
    .line 8
    if-eqz v0, :cond_1

    .line 9
    .line 10
    if-nez v0, :cond_0

    .line 11
    .line 12
    invoke-static {}, Lkotlin/jvm/internal/u;->s()V

    .line 13
    .line 14
    .line 15
    :cond_0
    invoke-interface {v0}, Landroid/os/IInterface;->asBinder()Landroid/os/IBinder;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    invoke-interface {v0}, Landroid/os/IBinder;->pingBinder()Z

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    if-eqz v0, :cond_1

    .line 24
    .line 25
    new-instance v0, Ljava/lang/Thread;

    .line 26
    .line 27
    new-instance v1, Lcom/zykj/message/client/MessageClient$INSTANCES$f;

    .line 28
    .line 29
    invoke-direct {v1, p0, p1}, Lcom/zykj/message/client/MessageClient$INSTANCES$f;-><init>(Lcom/zykj/message/client/MessageClient$INSTANCES;Ldb/a;)V

    .line 30
    .line 31
    .line 32
    invoke-direct {v0, v1}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    .line 33
    .line 34
    .line 35
    invoke-virtual {v0}, Ljava/lang/Thread;->start()V

    .line 36
    .line 37
    .line 38
    return-void

    .line 39
    :cond_1
    iget-object v0, p0, Lcom/zykj/message/client/MessageClient$INSTANCES;->i:Ljava/util/List;

    .line 40
    .line 41
    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 42
    .line 43
    .line 44
    iget-object p1, p0, Lcom/zykj/message/client/MessageClient$INSTANCES;->g:Landroid/app/Application;

    .line 45
    .line 46
    if-nez p1, :cond_2

    .line 47
    .line 48
    const-string v0, "mContext"

    .line 49
    .line 50
    invoke-static {v0}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 51
    .line 52
    .line 53
    :cond_2
    invoke-virtual {p0, p1}, Lcom/zykj/message/client/MessageClient$INSTANCES;->m(Landroid/app/Application;)V

    .line 54
    .line 55
    .line 56
    return-void
.end method

.method public m(Landroid/app/Application;)V
    .locals 3

    .line 1
    const-string v0, "context"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, Lcom/zykj/message/client/MessageClient$INSTANCES;->g:Landroid/app/Application;

    .line 7
    .line 8
    invoke-static {}, Lcb/a;->i()Lcb/a;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    iget-object v0, p0, Lcom/zykj/message/client/MessageClient$INSTANCES;->g:Landroid/app/Application;

    .line 13
    .line 14
    const-string v1, "mContext"

    .line 15
    .line 16
    if-nez v0, :cond_0

    .line 17
    .line 18
    invoke-static {v1}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    :cond_0
    invoke-virtual {p1, v0}, Lcb/a;->f(Landroid/app/Application;)V

    .line 22
    .line 23
    .line 24
    invoke-virtual {p0}, Lcom/zykj/message/client/MessageClient$INSTANCES;->f()Z

    .line 25
    .line 26
    .line 27
    move-result p1

    .line 28
    if-nez p1, :cond_2

    .line 29
    .line 30
    iget-object p1, p0, Lcom/zykj/message/client/MessageClient$INSTANCES;->g:Landroid/app/Application;

    .line 31
    .line 32
    if-nez p1, :cond_1

    .line 33
    .line 34
    invoke-static {v1}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    :cond_1
    const/4 v0, 0x0

    .line 38
    invoke-virtual {p0, p1, v0}, Lcom/zykj/message/client/MessageClient$INSTANCES;->E(Landroid/content/Context;Z)V

    .line 39
    .line 40
    .line 41
    return-void

    .line 42
    :cond_2
    iget-object p1, p0, Lcom/zykj/message/client/MessageClient$INSTANCES;->f:Leb/b;

    .line 43
    .line 44
    if-eqz p1, :cond_5

    .line 45
    .line 46
    if-eqz p1, :cond_4

    .line 47
    .line 48
    invoke-interface {p1}, Landroid/os/IInterface;->asBinder()Landroid/os/IBinder;

    .line 49
    .line 50
    .line 51
    move-result-object p1

    .line 52
    if-eqz p1, :cond_4

    .line 53
    .line 54
    invoke-interface {p1}, Landroid/os/IBinder;->pingBinder()Z

    .line 55
    .line 56
    .line 57
    move-result p1

    .line 58
    if-nez p1, :cond_4

    .line 59
    .line 60
    :try_start_0
    iget-object p1, p0, Lcom/zykj/message/client/MessageClient$INSTANCES;->g:Landroid/app/Application;

    .line 61
    .line 62
    if-nez p1, :cond_3

    .line 63
    .line 64
    invoke-static {v1}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 65
    .line 66
    .line 67
    :cond_3
    iget-object v0, p0, Lcom/zykj/message/client/MessageClient$INSTANCES;->k:Lcom/zykj/message/client/MessageClient$INSTANCES$mConnection$1;

    .line 68
    .line 69
    invoke-virtual {p1, v0}, Landroid/content/Context;->unbindService(Landroid/content/ServiceConnection;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 70
    .line 71
    .line 72
    :catch_0
    :cond_4
    const/4 p1, 0x0

    .line 73
    iput-object p1, p0, Lcom/zykj/message/client/MessageClient$INSTANCES;->f:Leb/b;

    .line 74
    .line 75
    :cond_5
    iget-object p1, p0, Lcom/zykj/message/client/MessageClient$INSTANCES;->f:Leb/b;

    .line 76
    .line 77
    if-nez p1, :cond_9

    .line 78
    .line 79
    :try_start_1
    iget-object p1, p0, Lcom/zykj/message/client/MessageClient$INSTANCES;->g:Landroid/app/Application;

    .line 80
    .line 81
    if-nez p1, :cond_6

    .line 82
    .line 83
    invoke-static {v1}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 84
    .line 85
    .line 86
    :cond_6
    iget-object v0, p0, Lcom/zykj/message/client/MessageClient$INSTANCES;->k:Lcom/zykj/message/client/MessageClient$INSTANCES$mConnection$1;

    .line 87
    .line 88
    invoke-virtual {p1, v0}, Landroid/content/Context;->unbindService(Landroid/content/ServiceConnection;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    .line 89
    .line 90
    .line 91
    :catch_1
    new-instance p1, Landroid/content/Intent;

    .line 92
    .line 93
    const-string v0, "com.zykj.action.zykj.message.service"

    .line 94
    .line 95
    invoke-direct {p1, v0}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 96
    .line 97
    .line 98
    const-string v0, "com.zykj.manage"

    .line 99
    .line 100
    invoke-virtual {p1, v0}, Landroid/content/Intent;->setPackage(Ljava/lang/String;)Landroid/content/Intent;

    .line 101
    .line 102
    .line 103
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 104
    .line 105
    .line 106
    iget-object v0, p0, Lcom/zykj/message/client/MessageClient$INSTANCES;->g:Landroid/app/Application;

    .line 107
    .line 108
    if-nez v0, :cond_7

    .line 109
    .line 110
    invoke-static {v1}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 111
    .line 112
    .line 113
    :cond_7
    iget-object v1, p0, Lcom/zykj/message/client/MessageClient$INSTANCES;->k:Lcom/zykj/message/client/MessageClient$INSTANCES$mConnection$1;

    .line 114
    .line 115
    const/4 v2, 0x1

    .line 116
    invoke-virtual {v0, p1, v1, v2}, Landroid/content/Context;->bindService(Landroid/content/Intent;Landroid/content/ServiceConnection;I)Z

    .line 117
    .line 118
    .line 119
    move-result p1

    .line 120
    if-nez p1, :cond_8

    .line 121
    .line 122
    new-instance p1, Ljava/lang/StringBuilder;

    .line 123
    .line 124
    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    .line 125
    .line 126
    .line 127
    const-string v0, "\u7ed1\u5b9a\u4e2a\u4eba\u4e2d\u5fc3\u670d\u52a1\u5931\u8d25,\u51c6\u5907\u91cd\u65b0\u542f\u52a8\u8be5\u4efb\u52a1 "

    .line 128
    .line 129
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 130
    .line 131
    .line 132
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 133
    .line 134
    .line 135
    move-result-wide v0

    .line 136
    invoke-virtual {p1, v0, v1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 137
    .line 138
    .line 139
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 140
    .line 141
    .line 142
    move-result-object p1

    .line 143
    const-string v0, "MessageClient"

    .line 144
    .line 145
    invoke-static {v0, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 146
    .line 147
    .line 148
    invoke-virtual {p0}, Lcom/zykj/message/client/MessageClient$INSTANCES;->G()V

    .line 149
    .line 150
    .line 151
    goto :goto_0

    .line 152
    :cond_8
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 153
    .line 154
    .line 155
    :cond_9
    :goto_0
    return-void
.end method

.method public n()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/zykj/message/client/MessageClient$INSTANCES;->f:Leb/b;

    .line 2
    .line 3
    const-string v1, "mContext"

    .line 4
    .line 5
    if-eqz v0, :cond_1

    .line 6
    .line 7
    if-eqz v0, :cond_1

    .line 8
    .line 9
    invoke-interface {v0}, Landroid/os/IInterface;->asBinder()Landroid/os/IBinder;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    if-eqz v0, :cond_1

    .line 14
    .line 15
    invoke-interface {v0}, Landroid/os/IBinder;->pingBinder()Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    const/4 v2, 0x1

    .line 20
    if-ne v0, v2, :cond_1

    .line 21
    .line 22
    iget-object v0, p0, Lcom/zykj/message/client/MessageClient$INSTANCES;->g:Landroid/app/Application;

    .line 23
    .line 24
    if-nez v0, :cond_0

    .line 25
    .line 26
    invoke-static {v1}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    :cond_0
    iget-object v2, p0, Lcom/zykj/message/client/MessageClient$INSTANCES;->k:Lcom/zykj/message/client/MessageClient$INSTANCES$mConnection$1;

    .line 30
    .line 31
    invoke-virtual {v0, v2}, Landroid/content/Context;->unbindService(Landroid/content/ServiceConnection;)V

    .line 32
    .line 33
    .line 34
    :cond_1
    invoke-static {}, Lcb/a;->i()Lcb/a;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    iget-object v2, p0, Lcom/zykj/message/client/MessageClient$INSTANCES;->g:Landroid/app/Application;

    .line 39
    .line 40
    if-nez v2, :cond_2

    .line 41
    .line 42
    invoke-static {v1}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 43
    .line 44
    .line 45
    :cond_2
    invoke-virtual {v0, v2}, Lcb/a;->h(Landroid/app/Application;)V

    .line 46
    .line 47
    .line 48
    return-void
.end method

.method public o(Ldb/a;)V
    .locals 2

    .line 1
    const-string v0, "messageCallBack"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/zykj/message/client/MessageClient$INSTANCES;->f:Leb/b;

    .line 7
    .line 8
    if-eqz v0, :cond_1

    .line 9
    .line 10
    if-nez v0, :cond_0

    .line 11
    .line 12
    invoke-static {}, Lkotlin/jvm/internal/u;->s()V

    .line 13
    .line 14
    .line 15
    :cond_0
    invoke-interface {v0}, Landroid/os/IInterface;->asBinder()Landroid/os/IBinder;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    invoke-interface {v0}, Landroid/os/IBinder;->pingBinder()Z

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    if-eqz v0, :cond_1

    .line 24
    .line 25
    new-instance v0, Ljava/lang/Thread;

    .line 26
    .line 27
    new-instance v1, Lcom/zykj/message/client/MessageClient$INSTANCES$g;

    .line 28
    .line 29
    invoke-direct {v1, p0, p1}, Lcom/zykj/message/client/MessageClient$INSTANCES$g;-><init>(Lcom/zykj/message/client/MessageClient$INSTANCES;Ldb/a;)V

    .line 30
    .line 31
    .line 32
    invoke-direct {v0, v1}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    .line 33
    .line 34
    .line 35
    invoke-virtual {v0}, Ljava/lang/Thread;->start()V

    .line 36
    .line 37
    .line 38
    return-void

    .line 39
    :cond_1
    iget-object v0, p0, Lcom/zykj/message/client/MessageClient$INSTANCES;->i:Ljava/util/List;

    .line 40
    .line 41
    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 42
    .line 43
    .line 44
    iget-object p1, p0, Lcom/zykj/message/client/MessageClient$INSTANCES;->g:Landroid/app/Application;

    .line 45
    .line 46
    if-nez p1, :cond_2

    .line 47
    .line 48
    const-string v0, "mContext"

    .line 49
    .line 50
    invoke-static {v0}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 51
    .line 52
    .line 53
    :cond_2
    invoke-virtual {p0, p1}, Lcom/zykj/message/client/MessageClient$INSTANCES;->m(Landroid/app/Application;)V

    .line 54
    .line 55
    .line 56
    return-void
.end method
