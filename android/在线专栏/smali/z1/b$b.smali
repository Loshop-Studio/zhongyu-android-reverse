.class final Lz1/b$b;
.super Lz1/b;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lz1/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = "b"
.end annotation


# instance fields
.field private d:Lb2/b;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private e:Landroid/app/Application;

.field private f:Ljava/util/Timer;

.field private g:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "La2/a;",
            ">;"
        }
    .end annotation
.end field

.field private final h:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lx2/a<",
            "Lo2/r;",
            ">;>;"
        }
    .end annotation
.end field

.field private final i:Lz1/b$b$h;

.field private final j:Landroid/os/Handler;


# direct methods
.method constructor <init>(Ljava/lang/String;I)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    const/4 v0, 0x0

    .line 1
    invoke-direct {p0, p1, p2, v0}, Lz1/b;-><init>(Ljava/lang/String;ILkotlin/jvm/internal/g;)V

    .line 2
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Lz1/b$b;->g:Ljava/util/List;

    .line 3
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Lz1/b$b;->h:Ljava/util/List;

    .line 4
    new-instance p1, Lz1/b$b$h;

    invoke-direct {p1, p0}, Lz1/b$b$h;-><init>(Lz1/b$b;)V

    iput-object p1, p0, Lz1/b$b;->i:Lz1/b$b$h;

    .line 5
    new-instance p1, Landroid/os/Handler;

    new-instance p2, Lz1/b$b$i;

    invoke-direct {p2, p0}, Lz1/b$b$i;-><init>(Lz1/b$b;)V

    invoke-direct {p1, p2}, Landroid/os/Handler;-><init>(Landroid/os/Handler$Callback;)V

    iput-object p1, p0, Lz1/b$b;->j:Landroid/os/Handler;

    return-void
.end method

.method public static final synthetic j(Lz1/b$b;Lcom/zykj/message/server/bean/ServerInfo;Z)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lz1/b$b;->r(Lcom/zykj/message/server/bean/ServerInfo;Z)V

    return-void
.end method

.method public static final synthetic k(Lz1/b$b;)Ljava/util/List;
    .locals 0

    iget-object p0, p0, Lz1/b$b;->g:Ljava/util/List;

    return-object p0
.end method

.method public static final synthetic l(Lz1/b$b;)Lz1/b$b$h;
    .locals 0

    iget-object p0, p0, Lz1/b$b;->i:Lz1/b$b$h;

    return-object p0
.end method

.method public static final synthetic m(Lz1/b$b;)Landroid/app/Application;
    .locals 1

    iget-object p0, p0, Lz1/b$b;->e:Landroid/app/Application;

    if-nez p0, :cond_0

    const-string v0, "mContext"

    invoke-static {v0}, Lkotlin/jvm/internal/l;->t(Ljava/lang/String;)V

    :cond_0
    return-object p0
.end method

.method public static final synthetic n(Lz1/b$b;)Landroid/os/Handler;
    .locals 0

    iget-object p0, p0, Lz1/b$b;->j:Landroid/os/Handler;

    return-object p0
.end method

.method public static final synthetic o(Lz1/b$b;)Ljava/util/Timer;
    .locals 0

    iget-object p0, p0, Lz1/b$b;->f:Ljava/util/Timer;

    return-object p0
.end method

.method public static final synthetic p(Lz1/b$b;)V
    .locals 0

    invoke-direct {p0}, Lz1/b$b;->x()V

    return-void
.end method

.method public static final synthetic q(Lz1/b$b;Ljava/util/Timer;)V
    .locals 0

    iput-object p1, p0, Lz1/b$b;->f:Ljava/util/Timer;

    return-void
.end method

.method private final r(Lcom/zykj/message/server/bean/ServerInfo;Z)V
    .locals 2

    if-eqz p1, :cond_0

    .line 1
    invoke-virtual {p1}, Lcom/zykj/message/server/bean/ServerInfo;->b()Lcom/zykj/message/server/bean/Status;

    move-result-object p1

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    sget-object p1, Lcom/zykj/message/server/bean/Status;->c:Lcom/zykj/message/server/bean/Status;

    :goto_0
    sget-object v0, Lz1/c;->a:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    aget p1, v0, p1

    const/4 v0, 0x1

    if-eq p1, v0, :cond_5

    const/4 v0, 0x2

    const-string v1, "mContext"

    if-eq p1, v0, :cond_3

    const/4 v0, 0x3

    if-eq p1, v0, :cond_1

    goto :goto_2

    .line 2
    :cond_1
    iget-object p1, p0, Lz1/b$b;->e:Landroid/app/Application;

    if-nez p1, :cond_2

    invoke-static {v1}, Lkotlin/jvm/internal/l;->t(Ljava/lang/String;)V

    :cond_2
    invoke-virtual {p0, p1, p2}, Lz1/b$b;->u(Landroid/content/Context;Z)V

    goto :goto_2

    .line 3
    :cond_3
    iget-object p1, p0, Lz1/b$b;->e:Landroid/app/Application;

    if-nez p1, :cond_4

    invoke-static {v1}, Lkotlin/jvm/internal/l;->t(Ljava/lang/String;)V

    :cond_4
    invoke-virtual {p0, p1, p2}, Lz1/b$b;->u(Landroid/content/Context;Z)V

    goto :goto_2

    .line 4
    :cond_5
    iget-object p1, p0, Lz1/b$b;->h:Ljava/util/List;

    .line 5
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p2

    if-eqz p2, :cond_6

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lx2/a;

    .line 6
    invoke-interface {p2}, Lx2/a;->invoke()Ljava/lang/Object;

    goto :goto_1

    .line 7
    :cond_6
    iget-object p1, p0, Lz1/b$b;->h:Ljava/util/List;

    invoke-interface {p1}, Ljava/util/List;->clear()V

    :goto_2
    return-void
.end method

.method private final v()V
    .locals 4

    .line 1
    new-instance v0, Landroid/content/Intent;

    invoke-direct {v0}, Landroid/content/Intent;-><init>()V

    const-string v1, "com.zykj.action.zykj.message.service.awaken"

    .line 2
    invoke-virtual {v0, v1}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    const/high16 v1, 0x10000000

    .line 3
    invoke-virtual {v0, v1}, Landroid/content/Intent;->setFlags(I)Landroid/content/Intent;

    .line 4
    iget-object v1, p0, Lz1/b$b;->e:Landroid/app/Application;

    if-nez v1, :cond_0

    const-string v2, "mContext"

    invoke-static {v2}, Lkotlin/jvm/internal/l;->t(Ljava/lang/String;)V

    :cond_0
    invoke-virtual {v1, v0}, Landroid/app/Application;->startActivity(Landroid/content/Intent;)V

    .line 5
    new-instance v0, Ljava/util/Timer;

    invoke-direct {v0}, Ljava/util/Timer;-><init>()V

    iput-object v0, p0, Lz1/b$b;->f:Ljava/util/Timer;

    .line 6
    new-instance v1, Lz1/b$b$j;

    invoke-direct {v1, p0}, Lz1/b$b$j;-><init>(Lz1/b$b;)V

    const-wide/16 v2, 0x3e8

    invoke-virtual {v0, v1, v2, v3}, Ljava/util/Timer;->schedule(Ljava/util/TimerTask;J)V

    return-void
.end method

.method private final x()V
    .locals 2

    invoke-static {}, Lz1/a;->i()Lz1/a;

    move-result-object v0

    new-instance v1, Lz1/b$b$m;

    invoke-direct {v1, p0}, Lz1/b$b$m;-><init>(Lz1/b$b;)V

    invoke-virtual {v0, v1}, Lz1/a;->g(Lz1/a$b;)V

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 2
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "url"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "appName"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "appPackageName"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    iget-object v0, p0, Lz1/b$b;->d:Lb2/b;

    if-eqz v0, :cond_2

    if-nez v0, :cond_0

    invoke-static {}, Lkotlin/jvm/internal/l;->n()V

    :cond_0
    invoke-interface {v0}, Landroid/os/IInterface;->asBinder()Landroid/os/IBinder;

    move-result-object v0

    invoke-interface {v0}, Landroid/os/IBinder;->pingBinder()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 2
    iget-object v0, p0, Lz1/b$b;->d:Lb2/b;

    if-nez v0, :cond_1

    invoke-static {}, Lkotlin/jvm/internal/l;->n()V

    :cond_1
    invoke-interface {v0, p1, p2, p3}, Lb2/b;->m(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    .line 3
    :cond_2
    iget-object v0, p0, Lz1/b$b;->h:Ljava/util/List;

    new-instance v1, Lz1/b$b$a;

    invoke-direct {v1, p0, p1, p2, p3}, Lz1/b$b$a;-><init>(Lz1/b$b;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 4
    iget-object p1, p0, Lz1/b$b;->e:Landroid/app/Application;

    if-nez p1, :cond_3

    const-string p2, "mContext"

    invoke-static {p2}, Lkotlin/jvm/internal/l;->t(Ljava/lang/String;)V

    :cond_3
    invoke-virtual {p0, p1}, Lz1/b$b;->h(Landroid/app/Application;)V

    :goto_0
    return-void
.end method

.method public b(Lx2/l;)V
    .locals 2
    .param p1    # Lx2/l;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lx2/l<",
            "-",
            "Ljava/lang/String;",
            "Lo2/r;",
            ">;)V"
        }
    .end annotation

    const-string v0, "callBack"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    iget-object v0, p0, Lz1/b$b;->d:Lb2/b;

    if-eqz v0, :cond_1

    if-nez v0, :cond_0

    invoke-static {}, Lkotlin/jvm/internal/l;->n()V

    :cond_0
    invoke-interface {v0}, Landroid/os/IInterface;->asBinder()Landroid/os/IBinder;

    move-result-object v0

    invoke-interface {v0}, Landroid/os/IBinder;->pingBinder()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 2
    new-instance v0, Ljava/lang/Thread;

    new-instance v1, Lz1/b$b$b;

    invoke-direct {v1, p0, p1}, Lz1/b$b$b;-><init>(Lz1/b$b;Lx2/l;)V

    invoke-direct {v0, v1}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    .line 3
    invoke-virtual {v0}, Ljava/lang/Thread;->start()V

    goto :goto_0

    .line 4
    :cond_1
    iget-object v0, p0, Lz1/b$b;->h:Ljava/util/List;

    new-instance v1, Lz1/b$b$c;

    invoke-direct {v1, p0, p1}, Lz1/b$b$c;-><init>(Lz1/b$b;Lx2/l;)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 5
    iget-object p1, p0, Lz1/b$b;->e:Landroid/app/Application;

    if-nez p1, :cond_2

    const-string v0, "mContext"

    invoke-static {v0}, Lkotlin/jvm/internal/l;->t(Ljava/lang/String;)V

    :cond_2
    invoke-virtual {p0, p1}, Lz1/b$b;->h(Landroid/app/Application;)V

    :goto_0
    return-void
.end method

.method public c(Lx2/l;)V
    .locals 2
    .param p1    # Lx2/l;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lx2/l<",
            "-",
            "Lcom/zykj/message/server/bean/ServerInfo;",
            "Lo2/r;",
            ">;)V"
        }
    .end annotation

    const-string v0, "callBack"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    iget-object v0, p0, Lz1/b$b;->d:Lb2/b;

    if-eqz v0, :cond_1

    if-nez v0, :cond_0

    invoke-static {}, Lkotlin/jvm/internal/l;->n()V

    :cond_0
    invoke-interface {v0}, Landroid/os/IInterface;->asBinder()Landroid/os/IBinder;

    move-result-object v0

    invoke-interface {v0}, Landroid/os/IBinder;->pingBinder()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 2
    new-instance v0, Ljava/lang/Thread;

    new-instance v1, Lz1/b$b$d;

    invoke-direct {v1, p0, p1}, Lz1/b$b$d;-><init>(Lz1/b$b;Lx2/l;)V

    invoke-direct {v0, v1}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    .line 3
    invoke-virtual {v0}, Ljava/lang/Thread;->start()V

    goto :goto_0

    .line 4
    :cond_1
    iget-object v0, p0, Lz1/b$b;->h:Ljava/util/List;

    new-instance v1, Lz1/b$b$e;

    invoke-direct {v1, p0, p1}, Lz1/b$b$e;-><init>(Lz1/b$b;Lx2/l;)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 5
    iget-object p1, p0, Lz1/b$b;->e:Landroid/app/Application;

    if-nez p1, :cond_2

    const-string v0, "mContext"

    invoke-static {v0}, Lkotlin/jvm/internal/l;->t(Ljava/lang/String;)V

    :cond_2
    invoke-virtual {p0, p1}, Lz1/b$b;->h(Landroid/app/Application;)V

    :goto_0
    return-void
.end method

.method public d(Lx2/l;)V
    .locals 2
    .param p1    # Lx2/l;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lx2/l<",
            "-",
            "Lcom/zykj/message/server/bean/UserInfo;",
            "Lo2/r;",
            ">;)V"
        }
    .end annotation

    const-string v0, "callBack"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    iget-object v0, p0, Lz1/b$b;->d:Lb2/b;

    if-eqz v0, :cond_1

    if-nez v0, :cond_0

    invoke-static {}, Lkotlin/jvm/internal/l;->n()V

    :cond_0
    invoke-interface {v0}, Landroid/os/IInterface;->asBinder()Landroid/os/IBinder;

    move-result-object v0

    invoke-interface {v0}, Landroid/os/IBinder;->pingBinder()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 2
    new-instance v0, Ljava/lang/Thread;

    new-instance v1, Lz1/b$b$f;

    invoke-direct {v1, p0, p1}, Lz1/b$b$f;-><init>(Lz1/b$b;Lx2/l;)V

    invoke-direct {v0, v1}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    .line 3
    invoke-virtual {v0}, Ljava/lang/Thread;->start()V

    goto :goto_0

    .line 4
    :cond_1
    iget-object v0, p0, Lz1/b$b;->h:Ljava/util/List;

    new-instance v1, Lz1/b$b$g;

    invoke-direct {v1, p0, p1}, Lz1/b$b$g;-><init>(Lz1/b$b;Lx2/l;)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 5
    iget-object p1, p0, Lz1/b$b;->e:Landroid/app/Application;

    if-nez p1, :cond_2

    const-string v0, "mContext"

    invoke-static {v0}, Lkotlin/jvm/internal/l;->t(Ljava/lang/String;)V

    :cond_2
    invoke-virtual {p0, p1}, Lz1/b$b;->h(Landroid/app/Application;)V

    :goto_0
    return-void
.end method

.method public e()Z
    .locals 3

    .line 1
    iget-object v0, p0, Lz1/b$b;->e:Landroid/app/Application;

    if-nez v0, :cond_0

    const-string v1, "mContext"

    invoke-static {v1}, Lkotlin/jvm/internal/l;->t(Ljava/lang/String;)V

    :cond_0
    invoke-virtual {v0}, Landroid/app/Application;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v0

    const/4 v1, 0x0

    :try_start_0
    const-string v2, "com.zykj.manage"

    .line 2
    invoke-virtual {v0, v2, v1}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;
    :try_end_0
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    const/4 v1, 0x1

    :catch_0
    return v1
.end method

.method public declared-synchronized f(Lx2/l;)V
    .locals 4
    .param p1    # Lx2/l;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lx2/l<",
            "-",
            "Lcom/zykj/message/server/bean/ServerInfo;",
            "Lo2/r;",
            ">;)V"
        }
    .end annotation

    monitor-enter p0

    :try_start_0
    const-string v0, "callBack"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    iget-object v0, p0, Lz1/b$b;->d:Lb2/b;

    if-eqz v0, :cond_2

    if-nez v0, :cond_0

    invoke-static {}, Lkotlin/jvm/internal/l;->n()V

    :cond_0
    invoke-interface {v0}, Landroid/os/IInterface;->asBinder()Landroid/os/IBinder;

    move-result-object v0

    invoke-interface {v0}, Landroid/os/IBinder;->pingBinder()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 2
    iget-object v0, p0, Lz1/b$b;->d:Lb2/b;

    if-nez v0, :cond_1

    invoke-static {}, Lkotlin/jvm/internal/l;->n()V

    :cond_1
    new-instance v1, Lz1/b$b$k;

    invoke-direct {v1, p1}, Lz1/b$b$k;-><init>(Lx2/l;)V

    invoke-interface {v0, v1}, Lb2/b;->a(Lb2/a;)V

    goto :goto_3

    .line 3
    :cond_2
    iget-object v0, p0, Lz1/b$b;->e:Landroid/app/Application;

    if-nez v0, :cond_3

    const-string v1, "mContext"

    invoke-static {v1}, Lkotlin/jvm/internal/l;->t(Ljava/lang/String;)V

    :cond_3
    invoke-virtual {p0, v0}, Lz1/b$b;->h(Landroid/app/Application;)V

    const v0, 0x7fffffff

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_8

    const-wide/16 v2, 0x64

    .line 4
    invoke-static {v2, v3}, Ljava/lang/Thread;->sleep(J)V

    .line 5
    iget-object v2, p0, Lz1/b$b;->d:Lb2/b;

    const/4 v3, 0x0

    if-eqz v2, :cond_4

    invoke-interface {v2}, Lb2/b;->p()Lcom/zykj/message/server/bean/ServerInfo;

    move-result-object v2

    goto :goto_1

    :cond_4
    move-object v2, v3

    :goto_1
    if-nez v2, :cond_6

    const/16 v2, 0x28

    if-le v1, v2, :cond_5

    goto :goto_2

    :cond_5
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 6
    :cond_6
    :goto_2
    iget-object v0, p0, Lz1/b$b;->d:Lb2/b;

    if-eqz v0, :cond_7

    invoke-interface {v0}, Lb2/b;->p()Lcom/zykj/message/server/bean/ServerInfo;

    move-result-object v3

    :cond_7
    invoke-interface {p1, v3}, Lx2/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 7
    monitor-exit p0

    return-void

    .line 8
    :cond_8
    :goto_3
    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public g(Lx2/l;)V
    .locals 3
    .param p1    # Lx2/l;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lx2/l<",
            "-",
            "Lcom/zykj/message/server/bean/ServerInfo;",
            "Lo2/r;",
            ">;)V"
        }
    .end annotation

    const-string v0, "callBack"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    iget-object v0, p0, Lz1/b$b;->d:Lb2/b;

    if-eqz v0, :cond_1

    if-nez v0, :cond_0

    invoke-static {}, Lkotlin/jvm/internal/l;->n()V

    :cond_0
    invoke-interface {v0}, Landroid/os/IInterface;->asBinder()Landroid/os/IBinder;

    move-result-object v0

    invoke-interface {v0}, Landroid/os/IBinder;->pingBinder()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 2
    new-instance v0, Ljava/lang/Thread;

    new-instance v1, Lz1/b$b$n;

    invoke-direct {v1, p0, p1}, Lz1/b$b$n;-><init>(Lz1/b$b;Lx2/l;)V

    invoke-direct {v0, v1}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    .line 3
    invoke-virtual {v0}, Ljava/lang/Thread;->start()V

    goto :goto_0

    .line 4
    :cond_1
    iget-object v0, p0, Lz1/b$b;->g:Ljava/util/List;

    new-instance v1, La2/b;

    sget-object v2, Lz1/b$b$o;->a:Lz1/b$b$o;

    invoke-direct {v1, p1, v2}, La2/b;-><init>(Lx2/l;Lx2/l;)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 5
    iget-object p1, p0, Lz1/b$b;->e:Landroid/app/Application;

    if-nez p1, :cond_2

    const-string v0, "mContext"

    invoke-static {v0}, Lkotlin/jvm/internal/l;->t(Ljava/lang/String;)V

    :cond_2
    invoke-virtual {p0, p1}, Lz1/b$b;->h(Landroid/app/Application;)V

    :goto_0
    return-void
.end method

.method public h(Landroid/app/Application;)V
    .locals 4
    .param p1    # Landroid/app/Application;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    iput-object p1, p0, Lz1/b$b;->e:Landroid/app/Application;

    .line 2
    invoke-static {}, Lz1/a;->i()Lz1/a;

    move-result-object p1

    iget-object v0, p0, Lz1/b$b;->e:Landroid/app/Application;

    const-string v1, "mContext"

    if-nez v0, :cond_0

    invoke-static {v1}, Lkotlin/jvm/internal/l;->t(Ljava/lang/String;)V

    :cond_0
    invoke-virtual {p1, v0}, Lz1/a;->f(Landroid/app/Application;)V

    .line 3
    invoke-virtual {p0}, Lz1/b$b;->e()Z

    move-result p1

    if-nez p1, :cond_2

    .line 4
    iget-object p1, p0, Lz1/b$b;->e:Landroid/app/Application;

    if-nez p1, :cond_1

    invoke-static {v1}, Lkotlin/jvm/internal/l;->t(Ljava/lang/String;)V

    :cond_1
    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0}, Lz1/b$b;->t(Landroid/content/Context;Z)V

    return-void

    .line 5
    :cond_2
    iget-object p1, p0, Lz1/b$b;->d:Lb2/b;

    if-eqz p1, :cond_5

    if-eqz p1, :cond_4

    .line 6
    invoke-interface {p1}, Landroid/os/IInterface;->asBinder()Landroid/os/IBinder;

    move-result-object p1

    if-eqz p1, :cond_4

    invoke-interface {p1}, Landroid/os/IBinder;->pingBinder()Z

    move-result p1

    if-nez p1, :cond_4

    .line 7
    :try_start_0
    iget-object p1, p0, Lz1/b$b;->e:Landroid/app/Application;

    if-nez p1, :cond_3

    invoke-static {v1}, Lkotlin/jvm/internal/l;->t(Ljava/lang/String;)V

    :cond_3
    iget-object v0, p0, Lz1/b$b;->i:Lz1/b$b$h;

    invoke-virtual {p1, v0}, Landroid/app/Application;->unbindService(Landroid/content/ServiceConnection;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    :cond_4
    const/4 p1, 0x0

    .line 8
    iput-object p1, p0, Lz1/b$b;->d:Lb2/b;

    .line 9
    :cond_5
    iget-object p1, p0, Lz1/b$b;->d:Lb2/b;

    if-nez p1, :cond_9

    .line 10
    :try_start_1
    iget-object p1, p0, Lz1/b$b;->e:Landroid/app/Application;

    if-nez p1, :cond_6

    invoke-static {v1}, Lkotlin/jvm/internal/l;->t(Ljava/lang/String;)V

    :cond_6
    iget-object v0, p0, Lz1/b$b;->i:Lz1/b$b$h;

    invoke-virtual {p1, v0}, Landroid/app/Application;->unbindService(Landroid/content/ServiceConnection;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_0

    :catch_1
    nop

    .line 11
    :goto_0
    new-instance p1, Landroid/content/Intent;

    const-string v0, "com.zykj.action.zykj.message.service"

    invoke-direct {p1, v0}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    const-string v0, "com.zykj.manage"

    .line 12
    invoke-virtual {p1, v0}, Landroid/content/Intent;->setPackage(Ljava/lang/String;)Landroid/content/Intent;

    .line 13
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "\u5f00\u59cb\u8fde\u63a5\u670d\u52a1->"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    invoke-virtual {v0, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v2, "MessageClient"

    invoke-static {v2, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 14
    iget-object v0, p0, Lz1/b$b;->e:Landroid/app/Application;

    if-nez v0, :cond_7

    invoke-static {v1}, Lkotlin/jvm/internal/l;->t(Ljava/lang/String;)V

    :cond_7
    iget-object v1, p0, Lz1/b$b;->i:Lz1/b$b$h;

    const/4 v3, 0x1

    invoke-virtual {v0, p1, v1, v3}, Landroid/app/Application;->bindService(Landroid/content/Intent;Landroid/content/ServiceConnection;I)Z

    move-result p1

    if-nez p1, :cond_8

    .line 15
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "\u7ed1\u5b9a\u4e2a\u4eba\u4e2d\u5fc3\u670d\u52a1\u5931\u8d25,\u51c6\u5907\u91cd\u65b0\u542f\u52a8\u8be5\u4efb\u52a1 "

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    invoke-virtual {p1, v0, v1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v2, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 16
    invoke-direct {p0}, Lz1/b$b;->v()V

    goto :goto_1

    .line 17
    :cond_8
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "\u7ed1\u5b9a\u4e2a\u4eba\u4e2d\u5fc3\u670d\u52a1\u6210\u529f result= true : "

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    invoke-virtual {p1, v0, v1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    .line 18
    invoke-static {v2, p1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    :cond_9
    :goto_1
    return-void
.end method

.method public i()V
    .locals 3

    .line 1
    iget-object v0, p0, Lz1/b$b;->d:Lb2/b;

    const-string v1, "mContext"

    if-eqz v0, :cond_1

    if-eqz v0, :cond_1

    invoke-interface {v0}, Landroid/os/IInterface;->asBinder()Landroid/os/IBinder;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-interface {v0}, Landroid/os/IBinder;->pingBinder()Z

    move-result v0

    const/4 v2, 0x1

    if-ne v0, v2, :cond_1

    .line 2
    iget-object v0, p0, Lz1/b$b;->e:Landroid/app/Application;

    if-nez v0, :cond_0

    invoke-static {v1}, Lkotlin/jvm/internal/l;->t(Ljava/lang/String;)V

    :cond_0
    iget-object v2, p0, Lz1/b$b;->i:Lz1/b$b$h;

    invoke-virtual {v0, v2}, Landroid/app/Application;->unbindService(Landroid/content/ServiceConnection;)V

    .line 3
    :cond_1
    invoke-static {}, Lz1/a;->i()Lz1/a;

    move-result-object v0

    iget-object v2, p0, Lz1/b$b;->e:Landroid/app/Application;

    if-nez v2, :cond_2

    invoke-static {v1}, Lkotlin/jvm/internal/l;->t(Ljava/lang/String;)V

    :cond_2
    invoke-virtual {v0, v2}, Lz1/a;->h(Landroid/app/Application;)V

    return-void
.end method

.method public final s()Lb2/b;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    iget-object v0, p0, Lz1/b$b;->d:Lb2/b;

    return-object v0
.end method

.method public t(Landroid/content/Context;Z)V
    .locals 3
    .param p1    # Landroid/content/Context;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-class v0, Lcom/zykj/message/UnInstallActivity;

    const-string v1, "context"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-static {}, Lz1/a;->i()Lz1/a;

    move-result-object v1

    const-string v2, "ActivityCollectionHelper.with()"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/l;->b(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1}, Lz1/a;->e()Landroid/app/Activity;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-static {}, Lz1/a;->i()Lz1/a;

    move-result-object v1

    invoke-static {v1, v2}, Lkotlin/jvm/internal/l;->b(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1}, Lz1/a;->e()Landroid/app/Activity;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Lkotlin/jvm/internal/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    return-void

    .line 2
    :cond_0
    invoke-static {}, Lz1/a;->i()Lz1/a;

    move-result-object v1

    invoke-virtual {v1}, Lz1/a;->d()V

    .line 3
    new-instance v1, Landroid/content/Intent;

    invoke-direct {v1, p1, v0}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    const-string v0, "hidden"

    .line 4
    invoke-virtual {v1, v0, p2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    const/high16 p2, 0x10000000

    .line 5
    invoke-virtual {v1, p2}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    const/high16 p2, 0x4000000

    .line 6
    invoke-virtual {v1, p2}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    .line 7
    invoke-virtual {p1, v1}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    const-string p1, "MessageClient"

    const-string p2, "\u53bb\u542f\u52a8\u5b89\u88c5\u754c\u9762"

    .line 8
    invoke-static {p1, p2}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    return-void
.end method

.method public u(Landroid/content/Context;Z)V
    .locals 3
    .param p1    # Landroid/content/Context;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-class v0, Lcom/zykj/message/UnLoginActivity;

    const-string v1, "context"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-static {}, Lz1/a;->i()Lz1/a;

    move-result-object v1

    const-string v2, "ActivityCollectionHelper.with()"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/l;->b(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1}, Lz1/a;->e()Landroid/app/Activity;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-static {}, Lz1/a;->i()Lz1/a;

    move-result-object v1

    invoke-static {v1, v2}, Lkotlin/jvm/internal/l;->b(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1}, Lz1/a;->e()Landroid/app/Activity;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Lkotlin/jvm/internal/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    return-void

    .line 2
    :cond_0
    invoke-static {}, Lz1/a;->i()Lz1/a;

    move-result-object v1

    invoke-virtual {v1}, Lz1/a;->d()V

    .line 3
    new-instance v1, Landroid/content/Intent;

    invoke-direct {v1, p1, v0}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    const-string v0, "hidden"

    .line 4
    invoke-virtual {v1, v0, p2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    const/high16 p2, 0x10000000

    .line 5
    invoke-virtual {v1, p2}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    const/high16 p2, 0x4000000

    .line 6
    invoke-virtual {v1, p2}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    .line 7
    invoke-virtual {p1, v1}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    const-string p1, "MessageClient"

    const-string p2, "\u53bb\u542f\u52a8\u767b\u5f55\u754c\u9762"

    .line 8
    invoke-static {p1, p2}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    return-void
.end method

.method public w(La2/a;)V
    .locals 2
    .param p1    # La2/a;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "messageCallBack"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    iget-object v0, p0, Lz1/b$b;->d:Lb2/b;

    if-eqz v0, :cond_1

    if-nez v0, :cond_0

    invoke-static {}, Lkotlin/jvm/internal/l;->n()V

    :cond_0
    invoke-interface {v0}, Landroid/os/IInterface;->asBinder()Landroid/os/IBinder;

    move-result-object v0

    invoke-interface {v0}, Landroid/os/IBinder;->pingBinder()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 2
    new-instance v0, Ljava/lang/Thread;

    new-instance v1, Lz1/b$b$l;

    invoke-direct {v1, p0, p1}, Lz1/b$b$l;-><init>(Lz1/b$b;La2/a;)V

    invoke-direct {v0, v1}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    .line 3
    invoke-virtual {v0}, Ljava/lang/Thread;->start()V

    goto :goto_0

    .line 4
    :cond_1
    iget-object v0, p0, Lz1/b$b;->g:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 5
    iget-object p1, p0, Lz1/b$b;->e:Landroid/app/Application;

    if-nez p1, :cond_2

    const-string v0, "mContext"

    invoke-static {v0}, Lkotlin/jvm/internal/l;->t(Ljava/lang/String;)V

    :cond_2
    invoke-virtual {p0, p1}, Lz1/b$b;->h(Landroid/app/Application;)V

    :goto_0
    return-void
.end method

.method public final y(Lb2/b;)V
    .locals 0
    .param p1    # Lb2/b;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    iput-object p1, p0, Lz1/b$b;->d:Lb2/b;

    return-void
.end method
