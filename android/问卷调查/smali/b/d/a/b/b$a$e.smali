.class public final Lb/d/a/b/b$a$e;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroid/content/ServiceConnection;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lb/d/a/b/b$a;-><init>(Ljava/lang/String;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lb/d/a/b/b$a;


# direct methods
.method public constructor <init>(Lb/d/a/b/b$a;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    iput-object p1, p0, Lb/d/a/b/b$a$e;->a:Lb/d/a/b/b$a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onServiceConnected(Landroid/content/ComponentName;Landroid/os/IBinder;)V
    .locals 4

    const-string v0, "className"

    invoke-static {p1, v0}, Ld/f/b/d;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "service"

    invoke-static {p2, p1}, Ld/f/b/d;->f(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "\u8fde\u63a5\u5230\u4e2a\u4eba\u4e2d\u5fc3\u670d\u52a1"

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    invoke-virtual {p1, v0, v1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string v0, "MessageClient"

    invoke-static {v0, p1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    iget-object p1, p0, Lb/d/a/b/b$a$e;->a:Lb/d/a/b/b$a;

    .line 1
    iget-object p1, p1, Lb/d/a/b/b$a;->f:Ljava/util/Timer;

    if-eqz p1, :cond_0

    .line 2
    invoke-virtual {p1}, Ljava/util/Timer;->cancel()V

    :cond_0
    iget-object p1, p0, Lb/d/a/b/b$a$e;->a:Lb/d/a/b/b$a;

    const/4 v0, 0x0

    .line 3
    iput-object v0, p1, Lb/d/a/b/b$a;->f:Ljava/util/Timer;

    .line 4
    sget v1, Lb/d/a/d/b$a;->a:I

    const-string v1, "com.zykj.message.server.MessageServer"

    invoke-interface {p2, v1}, Landroid/os/IBinder;->queryLocalInterface(Ljava/lang/String;)Landroid/os/IInterface;

    move-result-object v1

    if-eqz v1, :cond_1

    instance-of v2, v1, Lb/d/a/d/b;

    if-eqz v2, :cond_1

    check-cast v1, Lb/d/a/d/b;

    goto :goto_0

    :cond_1
    new-instance v1, Lb/d/a/d/b$a$a;

    invoke-direct {v1, p2}, Lb/d/a/d/b$a$a;-><init>(Landroid/os/IBinder;)V

    .line 5
    :goto_0
    iput-object v1, p1, Lb/d/a/b/b$a;->d:Lb/d/a/d/b;

    .line 6
    iget-object p1, p0, Lb/d/a/b/b$a$e;->a:Lb/d/a/b/b$a;

    new-instance p2, Lb/d/a/b/b$a$e$a;

    invoke-direct {p2, p0}, Lb/d/a/b/b$a$e$a;-><init>(Lb/d/a/b/b$a$e;)V

    invoke-virtual {p1, p2}, Lb/d/a/b/b$a;->a(Ld/f/a/b;)V

    iget-object p1, p0, Lb/d/a/b/b$a$e;->a:Lb/d/a/b/b$a;

    .line 7
    iget-object p1, p1, Lb/d/a/b/b$a;->g:Ljava/util/List;

    .line 8
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p2

    if-eqz p2, :cond_4

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lb/d/a/c/a;

    iget-object v1, p0, Lb/d/a/b/b$a$e;->a:Lb/d/a/b/b$a;

    .line 9
    invoke-static {v1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    const-string v2, "messageCallBack"

    invoke-static {p2, v2}, Ld/f/b/d;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v2, v1, Lb/d/a/b/b$a;->d:Lb/d/a/d/b;

    if-eqz v2, :cond_2

    invoke-interface {v2}, Landroid/os/IInterface;->asBinder()Landroid/os/IBinder;

    move-result-object v2

    invoke-interface {v2}, Landroid/os/IBinder;->pingBinder()Z

    move-result v2

    if-eqz v2, :cond_2

    new-instance v2, Ljava/lang/Thread;

    new-instance v3, Lb/d/a/b/f;

    invoke-direct {v3, v1, p2}, Lb/d/a/b/f;-><init>(Lb/d/a/b/b$a;Lb/d/a/c/a;)V

    invoke-direct {v2, v3}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    invoke-virtual {v2}, Ljava/lang/Thread;->start()V

    goto :goto_1

    :cond_2
    iget-object v2, v1, Lb/d/a/b/b$a;->g:Ljava/util/List;

    invoke-interface {v2, p2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object p2, v1, Lb/d/a/b/b$a;->e:Landroid/app/Application;

    if-eqz p2, :cond_3

    invoke-virtual {v1, p2}, Lb/d/a/b/b$a;->e(Landroid/app/Application;)V

    goto :goto_1

    :cond_3
    const-string p1, "mContext"

    invoke-static {p1}, Ld/f/b/d;->l(Ljava/lang/String;)V

    throw v0

    .line 10
    :cond_4
    iget-object p1, p0, Lb/d/a/b/b$a$e;->a:Lb/d/a/b/b$a;

    .line 11
    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 12
    sget-object p2, Lb/d/a/b/a;->e:Lb/d/a/b/a;

    .line 13
    new-instance v0, Lb/d/a/b/g;

    invoke-direct {v0, p1}, Lb/d/a/b/g;-><init>(Lb/d/a/b/b$a;)V

    .line 14
    iput-object v0, p2, Lb/d/a/b/a;->c:Lb/d/a/b/a$b;

    return-void
.end method

.method public onServiceDisconnected(Landroid/content/ComponentName;)V
    .locals 1

    const-string v0, "className"

    invoke-static {p1, v0}, Ld/f/b/d;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "MessageClient"

    const-string v0, "\u4e2a\u4eba\u4e2d\u5fc3\u670d\u52a1\u5931\u53bb\u8fde\u63a5"

    invoke-static {p1, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    :try_start_0
    iget-object p1, p0, Lb/d/a/b/b$a$e;->a:Lb/d/a/b/b$a;

    invoke-static {p1}, Lb/d/a/b/b$a;->h(Lb/d/a/b/b$a;)Landroid/app/Application;

    move-result-object p1

    invoke-virtual {p1, p0}, Landroid/app/Application;->unbindService(Landroid/content/ServiceConnection;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    iget-object p1, p0, Lb/d/a/b/b$a$e;->a:Lb/d/a/b/b$a;

    const/4 v0, 0x0

    .line 1
    iput-object v0, p1, Lb/d/a/b/b$a;->d:Lb/d/a/d/b;

    return-void
.end method
