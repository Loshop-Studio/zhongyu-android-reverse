.class public final Lz1/b$b$h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/content/ServiceConnection;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lz1/b$b;-><init>(Ljava/lang/String;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic a:Lz1/b$b;


# direct methods
.method constructor <init>(Lz1/b$b;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    iput-object p1, p0, Lz1/b$b$h;->a:Lz1/b$b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onServiceConnected(Landroid/content/ComponentName;Landroid/os/IBinder;)V
    .locals 2
    .param p1    # Landroid/content/ComponentName;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Landroid/os/IBinder;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "className"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "service"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
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

    .line 2
    iget-object p1, p0, Lz1/b$b$h;->a:Lz1/b$b;

    invoke-static {p1}, Lz1/b$b;->o(Lz1/b$b;)Ljava/util/Timer;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Ljava/util/Timer;->cancel()V

    .line 3
    :cond_0
    iget-object p1, p0, Lz1/b$b$h;->a:Lz1/b$b;

    const/4 v0, 0x0

    invoke-static {p1, v0}, Lz1/b$b;->q(Lz1/b$b;Ljava/util/Timer;)V

    .line 4
    iget-object p1, p0, Lz1/b$b$h;->a:Lz1/b$b;

    invoke-static {p2}, Lb2/b$a;->y(Landroid/os/IBinder;)Lb2/b;

    move-result-object p2

    invoke-virtual {p1, p2}, Lz1/b$b;->y(Lb2/b;)V

    .line 5
    iget-object p1, p0, Lz1/b$b$h;->a:Lz1/b$b;

    new-instance p2, Lz1/b$b$h$a;

    invoke-direct {p2, p0}, Lz1/b$b$h$a;-><init>(Lz1/b$b$h;)V

    invoke-virtual {p1, p2}, Lz1/b$b;->c(Lx2/l;)V

    .line 6
    iget-object p1, p0, Lz1/b$b$h;->a:Lz1/b$b;

    invoke-static {p1}, Lz1/b$b;->k(Lz1/b$b;)Ljava/util/List;

    move-result-object p1

    .line 7
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p2

    if-eqz p2, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, La2/a;

    .line 8
    iget-object v0, p0, Lz1/b$b$h;->a:Lz1/b$b;

    invoke-virtual {v0, p2}, Lz1/b$b;->w(La2/a;)V

    goto :goto_0

    .line 9
    :cond_1
    iget-object p1, p0, Lz1/b$b$h;->a:Lz1/b$b;

    invoke-static {p1}, Lz1/b$b;->p(Lz1/b$b;)V

    return-void
.end method

.method public onServiceDisconnected(Landroid/content/ComponentName;)V
    .locals 1
    .param p1    # Landroid/content/ComponentName;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "className"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "MessageClient"

    const-string v0, "\u4e2a\u4eba\u4e2d\u5fc3\u670d\u52a1\u5931\u53bb\u8fde\u63a5"

    .line 1
    invoke-static {p1, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 2
    :try_start_0
    iget-object p1, p0, Lz1/b$b$h;->a:Lz1/b$b;

    invoke-static {p1}, Lz1/b$b;->m(Lz1/b$b;)Landroid/app/Application;

    move-result-object p1

    invoke-virtual {p1, p0}, Landroid/app/Application;->unbindService(Landroid/content/ServiceConnection;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 3
    :catch_0
    iget-object p1, p0, Lz1/b$b$h;->a:Lz1/b$b;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Lz1/b$b;->y(Lb2/b;)V

    return-void
.end method
