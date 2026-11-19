.class final Lcom/zykj/blackboard/core/play/PlayPageControl$seekTo$1;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/blackboard/core/play/PlayPageControl;->d(JLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function0<",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0008\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n\u00a2\u0006\u0002\u0008\u0002"
    }
    d2 = {
        "<anonymous>",
        "",
        "invoke"
    }
    k = 0x3
    mv = {
        0x1,
        0x7,
        0x1
    }
    xi = 0x30
.end annotation


# instance fields
.field public final synthetic a:Lcom/zykj/blackboard/core/play/PlayPageControl;

.field public final synthetic b:J

.field public final synthetic c:Lkotlin/jvm/functions/Function0;

.field public final synthetic d:Lkotlin/jvm/functions/Function1;


# direct methods
.method public constructor <init>(Lcom/zykj/blackboard/core/play/PlayPageControl;JLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;)V
    .locals 0

    iput-object p1, p0, Lcom/zykj/blackboard/core/play/PlayPageControl$seekTo$1;->a:Lcom/zykj/blackboard/core/play/PlayPageControl;

    iput-wide p2, p0, Lcom/zykj/blackboard/core/play/PlayPageControl$seekTo$1;->b:J

    iput-object p4, p0, Lcom/zykj/blackboard/core/play/PlayPageControl$seekTo$1;->c:Lkotlin/jvm/functions/Function0;

    iput-object p5, p0, Lcom/zykj/blackboard/core/play/PlayPageControl$seekTo$1;->d:Lkotlin/jvm/functions/Function1;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method

.method public static synthetic a(Lkotlin/jvm/functions/Function1;Ljava/lang/Throwable;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/zykj/blackboard/core/play/PlayPageControl$seekTo$1;->k(Lkotlin/jvm/functions/Function1;Ljava/lang/Throwable;)V

    return-void
.end method

.method public static synthetic c(Lkotlin/jvm/functions/Function0;)V
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/zykj/blackboard/core/play/PlayPageControl$seekTo$1;->g(Lkotlin/jvm/functions/Function0;)V

    return-void
.end method

.method public static final g(Lkotlin/jvm/functions/Function0;)V
    .locals 1

    .line 1
    const-string v0, "$onSuccess"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-interface {p0}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public static final k(Lkotlin/jvm/functions/Function1;Ljava/lang/Throwable;)V
    .locals 1

    .line 1
    const-string v0, "$onError"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "$it"

    .line 7
    .line 8
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

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

    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v0
.end method

.method public final invoke()V
    .locals 7

    .line 2
    iget-object v0, p0, Lcom/zykj/blackboard/core/play/PlayPageControl$seekTo$1;->a:Lcom/zykj/blackboard/core/play/PlayPageControl;

    iget-wide v1, p0, Lcom/zykj/blackboard/core/play/PlayPageControl$seekTo$1;->b:J

    :try_start_0
    sget-object v3, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

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
    invoke-virtual {v0}, Lm5/f;->o()Lm5/h;

    move-result-object v3

    invoke-virtual {v3}, Lm5/h;->k()V

    .line 5
    invoke-virtual {v0}, Lm5/f;->m()Lcom/zykj/blackboard/core/play/AudioCommandThread;

    move-result-object v3

    invoke-virtual {v3}, Lcom/zykj/blackboard/core/play/AudioCommandThread;->k()V

    const-wide/16 v3, 0x64

    .line 6
    invoke-static {v3, v4}, Ljava/lang/Thread;->sleep(J)V

    .line 7
    invoke-virtual {v0}, Lm5/f;->p()La5/b;

    move-result-object v5

    const/4 v6, 0x0

    invoke-virtual {v5, v6}, La5/b;->j(Z)V

    .line 8
    invoke-virtual {v0}, Lm5/f;->r()Lz4/a;

    move-result-object v5

    invoke-virtual {v5}, Lz4/a;->i()V

    .line 9
    invoke-virtual {v0}, Lm5/f;->p()La5/b;

    move-result-object v5

    invoke-virtual {v5}, La5/b;->P()V

    .line 10
    invoke-static {v3, v4}, Ljava/lang/Thread;->sleep(J)V

    .line 11
    invoke-virtual {v0}, Lm5/f;->m()Lcom/zykj/blackboard/core/play/AudioCommandThread;

    move-result-object v3

    new-instance v4, Lcom/zykj/blackboard/core/play/PlayPageControl$seekTo$1$1$1;

    invoke-direct {v4, v0, v1, v2}, Lcom/zykj/blackboard/core/play/PlayPageControl$seekTo$1$1$1;-><init>(Lcom/zykj/blackboard/core/play/PlayPageControl;J)V

    invoke-virtual {v3, v1, v2, v4}, Lcom/zykj/blackboard/core/play/AudioCommandThread;->F(JLkotlin/jvm/functions/Function0;)V

    .line 12
    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 13
    invoke-static {v0}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    sget-object v1, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    invoke-static {v0}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    .line 14
    :goto_0
    iget-object v1, p0, Lcom/zykj/blackboard/core/play/PlayPageControl$seekTo$1;->c:Lkotlin/jvm/functions/Function0;

    invoke-static {v0}, Lkotlin/Result;->isSuccess-impl(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    move-object v2, v0

    check-cast v2, Lkotlin/Unit;

    .line 15
    new-instance v2, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v3

    invoke-direct {v2, v3}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    new-instance v3, Lcom/zykj/blackboard/core/play/a;

    invoke-direct {v3, v1}, Lcom/zykj/blackboard/core/play/a;-><init>(Lkotlin/jvm/functions/Function0;)V

    invoke-virtual {v2, v3}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 16
    :cond_0
    iget-object v1, p0, Lcom/zykj/blackboard/core/play/PlayPageControl$seekTo$1;->d:Lkotlin/jvm/functions/Function1;

    invoke-static {v0}, Lkotlin/Result;->exceptionOrNull-impl(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 17
    new-instance v2, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v3

    invoke-direct {v2, v3}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    new-instance v3, Lcom/zykj/blackboard/core/play/b;

    invoke-direct {v3, v1, v0}, Lcom/zykj/blackboard/core/play/b;-><init>(Lkotlin/jvm/functions/Function1;Ljava/lang/Throwable;)V

    invoke-virtual {v2, v3}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    :cond_1
    return-void
.end method
