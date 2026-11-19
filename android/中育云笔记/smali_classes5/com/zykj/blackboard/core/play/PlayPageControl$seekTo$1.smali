.class final Lcom/zykj/blackboard/core/play/PlayPageControl$seekTo$1;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lhd/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/blackboard/core/play/PlayPageControl;->e(JLhd/a;Lhd/l;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lhd/a;"
    }
.end annotation


# instance fields
.field public final synthetic c:Lcom/zykj/blackboard/core/play/PlayPageControl;

.field public final synthetic d:J

.field public final synthetic e:Lhd/a;

.field public final synthetic f:Lhd/l;


# direct methods
.method public constructor <init>(Lcom/zykj/blackboard/core/play/PlayPageControl;JLhd/a;Lhd/l;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/zykj/blackboard/core/play/PlayPageControl$seekTo$1;->c:Lcom/zykj/blackboard/core/play/PlayPageControl;

    .line 2
    .line 3
    iput-wide p2, p0, Lcom/zykj/blackboard/core/play/PlayPageControl$seekTo$1;->d:J

    .line 4
    .line 5
    iput-object p4, p0, Lcom/zykj/blackboard/core/play/PlayPageControl$seekTo$1;->e:Lhd/a;

    .line 6
    .line 7
    iput-object p5, p0, Lcom/zykj/blackboard/core/play/PlayPageControl$seekTo$1;->f:Lhd/l;

    .line 8
    .line 9
    const/4 p1, 0x0

    .line 10
    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public static synthetic a(Lhd/l;Ljava/lang/Throwable;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/zykj/blackboard/core/play/PlayPageControl$seekTo$1;->e(Lhd/l;Ljava/lang/Throwable;)V

    return-void
.end method

.method public static synthetic c(Lhd/a;)V
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/zykj/blackboard/core/play/PlayPageControl$seekTo$1;->d(Lhd/a;)V

    return-void
.end method

.method public static final d(Lhd/a;)V
    .locals 1

    .line 1
    const-string v0, "$onSuccess"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-interface {p0}, Lhd/a;->invoke()Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public static final e(Lhd/l;Ljava/lang/Throwable;)V
    .locals 1

    .line 1
    const-string v0, "$onError"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "$it"

    .line 7
    .line 8
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-interface {p0, p1}, Lhd/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/play/PlayPageControl$seekTo$1;->invoke()V

    sget-object v0, Lqc/q;->a:Lqc/q;

    return-object v0
.end method

.method public final invoke()V
    .locals 7

    .line 2
    iget-object v0, p0, Lcom/zykj/blackboard/core/play/PlayPageControl$seekTo$1;->c:Lcom/zykj/blackboard/core/play/PlayPageControl;

    iget-wide v1, p0, Lcom/zykj/blackboard/core/play/PlayPageControl$seekTo$1;->d:J

    :try_start_0
    sget-object v3, Lkotlin/Result;->d:Lkotlin/Result$a;

    .line 3
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "playThread = "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/Thread;->getName()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v4, " seekTo"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    sget-object v4, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v4, v3}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V

    .line 4
    invoke-virtual {v0}, Lha/f;->o()Lha/h;

    move-result-object v3

    invoke-virtual {v3}, Lha/h;->k()V

    .line 5
    invoke-virtual {v0}, Lha/f;->m()Lcom/zykj/blackboard/core/play/AudioCommandThread;

    move-result-object v3

    invoke-virtual {v3}, Lcom/zykj/blackboard/core/play/AudioCommandThread;->k()V

    const-wide/16 v3, 0x64

    .line 6
    invoke-static {v3, v4}, Ljava/lang/Thread;->sleep(J)V

    .line 7
    invoke-virtual {v0}, Lha/f;->p()Lv9/b;

    move-result-object v5

    const/4 v6, 0x0

    invoke-virtual {v5, v6}, Lv9/b;->l(Z)V

    .line 8
    invoke-virtual {v0}, Lha/f;->r()Lu9/a;

    move-result-object v5

    invoke-virtual {v5}, Lu9/a;->i()V

    .line 9
    invoke-virtual {v0}, Lha/f;->p()Lv9/b;

    move-result-object v5

    invoke-virtual {v5}, Lv9/b;->R()V

    .line 10
    invoke-static {v3, v4}, Ljava/lang/Thread;->sleep(J)V

    .line 11
    invoke-virtual {v0}, Lha/f;->m()Lcom/zykj/blackboard/core/play/AudioCommandThread;

    move-result-object v3

    new-instance v4, Lcom/zykj/blackboard/core/play/PlayPageControl$seekTo$1$1$1;

    invoke-direct {v4, v0, v1, v2}, Lcom/zykj/blackboard/core/play/PlayPageControl$seekTo$1$1$1;-><init>(Lcom/zykj/blackboard/core/play/PlayPageControl;J)V

    invoke-virtual {v3, v1, v2, v4}, Lcom/zykj/blackboard/core/play/AudioCommandThread;->F(JLhd/a;)V

    .line 12
    sget-object v0, Lqc/q;->a:Lqc/q;

    .line 13
    invoke-static {v0}, Lkotlin/Result;->c(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    sget-object v1, Lkotlin/Result;->d:Lkotlin/Result$a;

    invoke-static {v0}, Lkotlin/b;->a(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lkotlin/Result;->c(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    .line 14
    :goto_0
    iget-object v1, p0, Lcom/zykj/blackboard/core/play/PlayPageControl$seekTo$1;->e:Lhd/a;

    invoke-static {v0}, Lkotlin/Result;->k(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    move-object v2, v0

    check-cast v2, Lqc/q;

    .line 15
    new-instance v2, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v3

    invoke-direct {v2, v3}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    new-instance v3, Lcom/zykj/blackboard/core/play/a;

    invoke-direct {v3, v1}, Lcom/zykj/blackboard/core/play/a;-><init>(Lhd/a;)V

    invoke-virtual {v2, v3}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 16
    :cond_0
    iget-object v1, p0, Lcom/zykj/blackboard/core/play/PlayPageControl$seekTo$1;->f:Lhd/l;

    invoke-static {v0}, Lkotlin/Result;->e(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 17
    new-instance v2, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v3

    invoke-direct {v2, v3}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    new-instance v3, Lcom/zykj/blackboard/core/play/b;

    invoke-direct {v3, v1, v0}, Lcom/zykj/blackboard/core/play/b;-><init>(Lhd/l;Ljava/lang/Throwable;)V

    invoke-virtual {v2, v3}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    :cond_1
    return-void
.end method
