.class public final Lb/d/a/b/b$a;
.super Lb/d/a/b/b;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lb/d/a/b/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field public d:Lb/d/a/d/b;

.field public e:Landroid/app/Application;

.field public f:Ljava/util/Timer;

.field public g:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lb/d/a/c/a;",
            ">;"
        }
    .end annotation
.end field

.field public final h:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ld/f/a/a<",
            "Ld/d;",
            ">;>;"
        }
    .end annotation
.end field

.field public final i:Lb/d/a/b/b$a$e;

.field public final j:Landroid/os/Handler;


# direct methods
.method public constructor <init>(Ljava/lang/String;I)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    const/4 v0, 0x0

    invoke-direct {p0, p1, p2, v0}, Lb/d/a/b/b;-><init>(Ljava/lang/String;ILd/f/b/c;)V

    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Lb/d/a/b/b$a;->g:Ljava/util/List;

    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Lb/d/a/b/b$a;->h:Ljava/util/List;

    new-instance p1, Lb/d/a/b/b$a$e;

    invoke-direct {p1, p0}, Lb/d/a/b/b$a$e;-><init>(Lb/d/a/b/b$a;)V

    iput-object p1, p0, Lb/d/a/b/b$a;->i:Lb/d/a/b/b$a$e;

    new-instance p1, Landroid/os/Handler;

    new-instance p2, Lb/d/a/b/b$a$f;

    invoke-direct {p2, p0}, Lb/d/a/b/b$a$f;-><init>(Lb/d/a/b/b$a;)V

    invoke-direct {p1, p2}, Landroid/os/Handler;-><init>(Landroid/os/Handler$Callback;)V

    iput-object p1, p0, Lb/d/a/b/b$a;->j:Landroid/os/Handler;

    return-void
.end method

.method public static final g(Lb/d/a/b/b$a;Lb/d/a/d/c/a;Z)V
    .locals 3

    .line 1
    invoke-static {p0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2
    iget-object p1, p1, Lb/d/a/d/c/a;->b:Lb/d/a/d/c/b;

    if-eqz p1, :cond_0

    goto :goto_0

    .line 3
    :cond_0
    sget-object p1, Lb/d/a/d/c/b;->c:Lb/d/a/d/c/b;

    :goto_0
    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    if-eqz p1, :cond_5

    const/4 v0, 0x1

    const-string v1, "mContext"

    const/4 v2, 0x0

    if-eq p1, v0, :cond_3

    const/4 v0, 0x2

    if-eq p1, v0, :cond_1

    goto :goto_3

    :cond_1
    iget-object p1, p0, Lb/d/a/b/b$a;->e:Landroid/app/Application;

    if-eqz p1, :cond_2

    goto :goto_1

    :cond_2
    invoke-static {v1}, Ld/f/b/d;->l(Ljava/lang/String;)V

    throw v2

    :cond_3
    iget-object p1, p0, Lb/d/a/b/b$a;->e:Landroid/app/Application;

    if-eqz p1, :cond_4

    :goto_1
    invoke-virtual {p0, p1, p2}, Lb/d/a/b/b$a;->i(Landroid/content/Context;Z)V

    goto :goto_3

    :cond_4
    invoke-static {v1}, Ld/f/b/d;->l(Ljava/lang/String;)V

    throw v2

    :cond_5
    iget-object p1, p0, Lb/d/a/b/b$a;->h:Ljava/util/List;

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_2
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p2

    if-eqz p2, :cond_6

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ld/f/a/a;

    invoke-interface {p2}, Ld/f/a/a;->a()Ljava/lang/Object;

    goto :goto_2

    :cond_6
    iget-object p0, p0, Lb/d/a/b/b$a;->h:Ljava/util/List;

    invoke-interface {p0}, Ljava/util/List;->clear()V

    :goto_3
    return-void
.end method

.method public static final synthetic h(Lb/d/a/b/b$a;)Landroid/app/Application;
    .locals 0

    iget-object p0, p0, Lb/d/a/b/b$a;->e:Landroid/app/Application;

    if-eqz p0, :cond_0

    return-object p0

    :cond_0
    const-string p0, "mContext"

    invoke-static {p0}, Ld/f/b/d;->l(Ljava/lang/String;)V

    const/4 p0, 0x0

    throw p0
.end method


# virtual methods
.method public a(Ld/f/a/b;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ld/f/a/b<",
            "-",
            "Lb/d/a/d/c/a;",
            "Ld/d;",
            ">;)V"
        }
    .end annotation

    const-string v0, "callBack"

    invoke-static {p1, v0}, Ld/f/b/d;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lb/d/a/b/b$a;->d:Lb/d/a/d/b;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Landroid/os/IInterface;->asBinder()Landroid/os/IBinder;

    move-result-object v0

    invoke-interface {v0}, Landroid/os/IBinder;->pingBinder()Z

    move-result v0

    if-eqz v0, :cond_0

    new-instance v0, Ljava/lang/Thread;

    new-instance v1, Lb/d/a/b/b$a$a;

    invoke-direct {v1, p0, p1}, Lb/d/a/b/b$a$a;-><init>(Lb/d/a/b/b$a;Ld/f/a/b;)V

    invoke-direct {v0, v1}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    invoke-virtual {v0}, Ljava/lang/Thread;->start()V

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lb/d/a/b/b$a;->h:Ljava/util/List;

    new-instance v1, Lb/d/a/b/b$a$b;

    invoke-direct {v1, p0, p1}, Lb/d/a/b/b$a$b;-><init>(Lb/d/a/b/b$a;Ld/f/a/b;)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object p1, p0, Lb/d/a/b/b$a;->e:Landroid/app/Application;

    if-eqz p1, :cond_1

    invoke-virtual {p0, p1}, Lb/d/a/b/b$a;->e(Landroid/app/Application;)V

    :goto_0
    return-void

    :cond_1
    const-string p1, "mContext"

    invoke-static {p1}, Ld/f/b/d;->l(Ljava/lang/String;)V

    const/4 p1, 0x0

    throw p1
.end method

.method public b(Ld/f/a/b;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ld/f/a/b<",
            "-",
            "Lb/d/a/d/c/c;",
            "Ld/d;",
            ">;)V"
        }
    .end annotation

    const-string v0, "callBack"

    invoke-static {p1, v0}, Ld/f/b/d;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lb/d/a/b/b$a;->d:Lb/d/a/d/b;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Landroid/os/IInterface;->asBinder()Landroid/os/IBinder;

    move-result-object v0

    invoke-interface {v0}, Landroid/os/IBinder;->pingBinder()Z

    move-result v0

    if-eqz v0, :cond_0

    new-instance v0, Ljava/lang/Thread;

    new-instance v1, Lb/d/a/b/b$a$c;

    invoke-direct {v1, p0, p1}, Lb/d/a/b/b$a$c;-><init>(Lb/d/a/b/b$a;Ld/f/a/b;)V

    invoke-direct {v0, v1}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    invoke-virtual {v0}, Ljava/lang/Thread;->start()V

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lb/d/a/b/b$a;->h:Ljava/util/List;

    new-instance v1, Lb/d/a/b/b$a$d;

    invoke-direct {v1, p0, p1}, Lb/d/a/b/b$a$d;-><init>(Lb/d/a/b/b$a;Ld/f/a/b;)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object p1, p0, Lb/d/a/b/b$a;->e:Landroid/app/Application;

    if-eqz p1, :cond_1

    invoke-virtual {p0, p1}, Lb/d/a/b/b$a;->e(Landroid/app/Application;)V

    :goto_0
    return-void

    :cond_1
    const-string p1, "mContext"

    invoke-static {p1}, Ld/f/b/d;->l(Ljava/lang/String;)V

    const/4 p1, 0x0

    throw p1
.end method

.method public c()Z
    .locals 3

    iget-object v0, p0, Lb/d/a/b/b$a;->e:Landroid/app/Application;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/app/Application;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v0

    const/4 v1, 0x0

    :try_start_0
    const-string v2, "com.zykj.manage"

    invoke-virtual {v0, v2, v1}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;
    :try_end_0
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    const/4 v1, 0x1

    :catch_0
    return v1

    :cond_0
    const-string v0, "mContext"

    invoke-static {v0}, Ld/f/b/d;->l(Ljava/lang/String;)V

    const/4 v0, 0x0

    throw v0
.end method

.method public declared-synchronized d(Ld/f/a/b;)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ld/f/a/b<",
            "-",
            "Lb/d/a/d/c/a;",
            "Ld/d;",
            ">;)V"
        }
    .end annotation

    monitor-enter p0

    :try_start_0
    const-string v0, "callBack"

    invoke-static {p1, v0}, Ld/f/b/d;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lb/d/a/b/b$a;->d:Lb/d/a/d/b;

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    invoke-interface {v0}, Landroid/os/IInterface;->asBinder()Landroid/os/IBinder;

    move-result-object v0

    invoke-interface {v0}, Landroid/os/IBinder;->pingBinder()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lb/d/a/b/b$a;->d:Lb/d/a/d/b;

    if-eqz v0, :cond_0

    new-instance v1, Lb/d/a/b/b$a$g;

    invoke-direct {v1, p1}, Lb/d/a/b/b$a$g;-><init>(Ld/f/a/b;)V

    invoke-interface {v0, v1}, Lb/d/a/d/b;->b(Lb/d/a/d/a;)V

    goto :goto_3

    :cond_0
    invoke-static {}, Ld/f/b/d;->k()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1

    :cond_1
    :try_start_1
    iget-object v0, p0, Lb/d/a/b/b$a;->e:Landroid/app/Application;

    if-eqz v0, :cond_7

    invoke-virtual {p0, v0}, Lb/d/a/b/b$a;->e(Landroid/app/Application;)V

    const v0, 0x7fffffff

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v0, :cond_6

    const-wide/16 v3, 0x64

    invoke-static {v3, v4}, Ljava/lang/Thread;->sleep(J)V

    iget-object v3, p0, Lb/d/a/b/b$a;->d:Lb/d/a/d/b;

    if-eqz v3, :cond_2

    invoke-interface {v3}, Lb/d/a/d/b;->d()Lb/d/a/d/c/a;

    move-result-object v3

    goto :goto_1

    :cond_2
    move-object v3, v1

    :goto_1
    if-nez v3, :cond_4

    const/16 v3, 0x28

    if-le v2, v3, :cond_3

    goto :goto_2

    :cond_3
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_4
    :goto_2
    iget-object v0, p0, Lb/d/a/b/b$a;->d:Lb/d/a/d/b;

    if-eqz v0, :cond_5

    invoke-interface {v0}, Lb/d/a/d/b;->d()Lb/d/a/d/c/a;

    move-result-object v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :cond_5
    check-cast p1, Lcom/zykj/satisfaction/MainActivity$a$a;

    :try_start_2
    invoke-virtual {p1, v1}, Lcom/zykj/satisfaction/MainActivity$a$a;->c(Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    monitor-exit p0

    return-void

    :cond_6
    :goto_3
    monitor-exit p0

    return-void

    :cond_7
    :try_start_3
    const-string p1, "mContext"

    invoke-static {p1}, Ld/f/b/d;->l(Ljava/lang/String;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    throw v1

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public e(Landroid/app/Application;)V
    .locals 8

    const-string v0, "context"

    invoke-static {p1, v0}, Ld/f/b/d;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lb/d/a/b/b$a;->e:Landroid/app/Application;

    .line 1
    sget-object v1, Lb/d/a/b/a;->e:Lb/d/a/b/a;

    const-string v2, "mContext"

    const/4 v3, 0x0

    if-eqz p1, :cond_c

    .line 2
    iget-boolean v4, v1, Lb/d/a/b/a;->b:Z

    const/4 v5, 0x1

    if-eqz v4, :cond_0

    goto :goto_0

    :cond_0
    iput-boolean v5, v1, Lb/d/a/b/a;->b:Z

    iget-object v1, v1, Lb/d/a/b/a;->d:Landroid/app/Application$ActivityLifecycleCallbacks;

    invoke-virtual {p1, v1}, Landroid/app/Application;->registerActivityLifecycleCallbacks(Landroid/app/Application$ActivityLifecycleCallbacks;)V

    .line 3
    :goto_0
    invoke-virtual {p0}, Lb/d/a/b/b$a;->c()Z

    move-result p1

    const/high16 v1, 0x10000000

    const-string v4, "MessageClient"

    if-nez p1, :cond_3

    iget-object p1, p0, Lb/d/a/b/b$a;->e:Landroid/app/Application;

    if-eqz p1, :cond_2

    const/4 v2, 0x0

    .line 4
    invoke-static {p1, v0}, Ld/f/b/d;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 5
    sget-object v0, Lb/d/a/b/a;->e:Lb/d/a/b/a;

    const-string v3, "ActivityCollectionHelper.with()"

    .line 6
    invoke-static {v0, v3}, Ld/f/b/d;->b(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0}, Lb/d/a/b/a;->c()Landroid/app/Activity;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 7
    sget-object v0, Lb/d/a/b/a;->e:Lb/d/a/b/a;

    .line 8
    invoke-static {v0, v3}, Ld/f/b/d;->b(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0}, Lb/d/a/b/a;->c()Landroid/app/Activity;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    move-result-object v0

    const-class v3, Lcom/zykj/message/UnInstallActivity;

    invoke-virtual {v3}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    move-result-object v3

    invoke-static {v0, v3}, Ld/f/b/d;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    goto :goto_1

    .line 9
    :cond_1
    sget-object v0, Lb/d/a/b/a;->e:Lb/d/a/b/a;

    .line 10
    invoke-virtual {v0}, Lb/d/a/b/a;->b()V

    new-instance v0, Landroid/content/Intent;

    const-class v3, Lcom/zykj/message/UnInstallActivity;

    invoke-direct {v0, p1, v3}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    const-string v3, "hidden"

    invoke-virtual {v0, v3, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    invoke-virtual {v0, v1}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    const/high16 v1, 0x4000000

    invoke-virtual {v0, v1}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    invoke-virtual {p1, v0}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    const-string p1, "\u53bb\u542f\u52a8\u5b89\u88c5\u754c\u9762"

    invoke-static {v4, p1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    :goto_1
    return-void

    .line 11
    :cond_2
    invoke-static {v2}, Ld/f/b/d;->l(Ljava/lang/String;)V

    throw v3

    :cond_3
    iget-object p1, p0, Lb/d/a/b/b$a;->d:Lb/d/a/d/b;

    if-eqz p1, :cond_6

    if-eqz p1, :cond_5

    invoke-interface {p1}, Landroid/os/IInterface;->asBinder()Landroid/os/IBinder;

    move-result-object p1

    if-eqz p1, :cond_5

    invoke-interface {p1}, Landroid/os/IBinder;->pingBinder()Z

    move-result p1

    if-nez p1, :cond_5

    :try_start_0
    iget-object p1, p0, Lb/d/a/b/b$a;->e:Landroid/app/Application;

    if-eqz p1, :cond_4

    iget-object v0, p0, Lb/d/a/b/b$a;->i:Lb/d/a/b/b$a$e;

    invoke-virtual {p1, v0}, Landroid/app/Application;->unbindService(Landroid/content/ServiceConnection;)V

    goto :goto_2

    :cond_4
    invoke-static {v2}, Ld/f/b/d;->l(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    throw v3

    :catch_0
    :cond_5
    :goto_2
    iput-object v3, p0, Lb/d/a/b/b$a;->d:Lb/d/a/d/b;

    :cond_6
    iget-object p1, p0, Lb/d/a/b/b$a;->d:Lb/d/a/d/b;

    if-nez p1, :cond_b

    :try_start_1
    iget-object p1, p0, Lb/d/a/b/b$a;->e:Landroid/app/Application;

    if-eqz p1, :cond_7

    iget-object v0, p0, Lb/d/a/b/b$a;->i:Lb/d/a/b/b$a$e;

    invoke-virtual {p1, v0}, Landroid/app/Application;->unbindService(Landroid/content/ServiceConnection;)V

    goto :goto_3

    :cond_7
    invoke-static {v2}, Ld/f/b/d;->l(Ljava/lang/String;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    throw v3

    :catch_1
    :goto_3
    new-instance p1, Landroid/content/Intent;

    const-string v0, "com.zykj.action.zykj.message.service"

    invoke-direct {p1, v0}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    const-string v0, "com.zykj.manage"

    invoke-virtual {p1, v0}, Landroid/content/Intent;->setPackage(Ljava/lang/String;)Landroid/content/Intent;

    const-string v0, "\u5f00\u59cb\u8fde\u63a5\u670d\u52a1->"

    invoke-static {v0}, Lb/a/a/a/a;->g(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v6

    invoke-virtual {v0, v6, v7}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v4, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    iget-object v0, p0, Lb/d/a/b/b$a;->e:Landroid/app/Application;

    if-eqz v0, :cond_a

    iget-object v6, p0, Lb/d/a/b/b$a;->i:Lb/d/a/b/b$a$e;

    invoke-virtual {v0, p1, v6, v5}, Landroid/app/Application;->bindService(Landroid/content/Intent;Landroid/content/ServiceConnection;I)Z

    move-result p1

    if-nez p1, :cond_9

    const-string p1, "\u7ed1\u5b9a\u4e2a\u4eba\u4e2d\u5fc3\u670d\u52a1\u5931\u8d25,\u51c6\u5907\u91cd\u65b0\u542f\u52a8\u8be5\u4efb\u52a1 "

    invoke-static {p1}, Lb/a/a/a/a;->g(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p1

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v5

    invoke-virtual {p1, v5, v6}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v4, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 12
    new-instance p1, Landroid/content/Intent;

    invoke-direct {p1}, Landroid/content/Intent;-><init>()V

    const-string v0, "com.zykj.action.zykj.message.service.awaken"

    invoke-virtual {p1, v0}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    invoke-virtual {p1, v1}, Landroid/content/Intent;->setFlags(I)Landroid/content/Intent;

    iget-object v0, p0, Lb/d/a/b/b$a;->e:Landroid/app/Application;

    if-eqz v0, :cond_8

    invoke-virtual {v0, p1}, Landroid/app/Application;->startActivity(Landroid/content/Intent;)V

    new-instance p1, Ljava/util/Timer;

    invoke-direct {p1}, Ljava/util/Timer;-><init>()V

    iput-object p1, p0, Lb/d/a/b/b$a;->f:Ljava/util/Timer;

    new-instance v0, Lb/d/a/b/e;

    invoke-direct {v0, p0}, Lb/d/a/b/e;-><init>(Lb/d/a/b/b$a;)V

    const-wide/16 v1, 0x3e8

    invoke-virtual {p1, v0, v1, v2}, Ljava/util/Timer;->schedule(Ljava/util/TimerTask;J)V

    goto :goto_4

    :cond_8
    invoke-static {v2}, Ld/f/b/d;->l(Ljava/lang/String;)V

    throw v3

    :cond_9
    const-string p1, "\u7ed1\u5b9a\u4e2a\u4eba\u4e2d\u5fc3\u670d\u52a1\u6210\u529f result= true : "

    .line 13
    invoke-static {p1}, Lb/a/a/a/a;->g(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p1

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    invoke-virtual {p1, v0, v1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v4, p1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_4

    :cond_a
    invoke-static {v2}, Ld/f/b/d;->l(Ljava/lang/String;)V

    throw v3

    :cond_b
    :goto_4
    return-void

    :cond_c
    invoke-static {v2}, Ld/f/b/d;->l(Ljava/lang/String;)V

    throw v3
.end method

.method public f()V
    .locals 4

    iget-object v0, p0, Lb/d/a/b/b$a;->d:Lb/d/a/d/b;

    const/4 v1, 0x0

    const-string v2, "mContext"

    if-eqz v0, :cond_1

    if-eqz v0, :cond_1

    invoke-interface {v0}, Landroid/os/IInterface;->asBinder()Landroid/os/IBinder;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-interface {v0}, Landroid/os/IBinder;->pingBinder()Z

    move-result v0

    const/4 v3, 0x1

    if-ne v0, v3, :cond_1

    iget-object v0, p0, Lb/d/a/b/b$a;->e:Landroid/app/Application;

    if-eqz v0, :cond_0

    iget-object v3, p0, Lb/d/a/b/b$a;->i:Lb/d/a/b/b$a$e;

    invoke-virtual {v0, v3}, Landroid/app/Application;->unbindService(Landroid/content/ServiceConnection;)V

    goto :goto_0

    :cond_0
    invoke-static {v2}, Ld/f/b/d;->l(Ljava/lang/String;)V

    throw v1

    .line 1
    :cond_1
    :goto_0
    sget-object v0, Lb/d/a/b/a;->e:Lb/d/a/b/a;

    .line 2
    iget-object v3, p0, Lb/d/a/b/b$a;->e:Landroid/app/Application;

    if-eqz v3, :cond_2

    .line 3
    iget-object v0, v0, Lb/d/a/b/a;->d:Landroid/app/Application$ActivityLifecycleCallbacks;

    invoke-virtual {v3, v0}, Landroid/app/Application;->unregisterActivityLifecycleCallbacks(Landroid/app/Application$ActivityLifecycleCallbacks;)V

    return-void

    .line 4
    :cond_2
    invoke-static {v2}, Ld/f/b/d;->l(Ljava/lang/String;)V

    throw v1
.end method

.method public i(Landroid/content/Context;Z)V
    .locals 2

    const-string v0, "context"

    invoke-static {p1, v0}, Ld/f/b/d;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    sget-object v0, Lb/d/a/b/a;->e:Lb/d/a/b/a;

    const-string v1, "ActivityCollectionHelper.with()"

    .line 2
    invoke-static {v0, v1}, Ld/f/b/d;->b(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0}, Lb/d/a/b/a;->c()Landroid/app/Activity;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 3
    sget-object v0, Lb/d/a/b/a;->e:Lb/d/a/b/a;

    .line 4
    invoke-static {v0, v1}, Ld/f/b/d;->b(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0}, Lb/d/a/b/a;->c()Landroid/app/Activity;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    move-result-object v0

    const-class v1, Lcom/zykj/message/UnLoginActivity;

    invoke-virtual {v1}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Ld/f/b/d;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    .line 5
    :cond_0
    sget-object v0, Lb/d/a/b/a;->e:Lb/d/a/b/a;

    .line 6
    invoke-virtual {v0}, Lb/d/a/b/a;->b()V

    new-instance v0, Landroid/content/Intent;

    const-class v1, Lcom/zykj/message/UnLoginActivity;

    invoke-direct {v0, p1, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    const-string v1, "hidden"

    invoke-virtual {v0, v1, p2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    const/high16 p2, 0x10000000

    invoke-virtual {v0, p2}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    const/high16 p2, 0x4000000

    invoke-virtual {v0, p2}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    invoke-virtual {p1, v0}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    const-string p1, "MessageClient"

    const-string p2, "\u53bb\u542f\u52a8\u767b\u5f55\u754c\u9762"

    invoke-static {p1, p2}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    return-void
.end method
