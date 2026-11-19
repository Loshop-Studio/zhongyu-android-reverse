.class final Lcom/zykj/blackboard/core/play/PlayPageControl$seekTo$1;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lr6/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/blackboard/core/play/PlayPageControl;->seekTo(JLr6/a;Lr6/c;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lr6/a;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0010\u0003\u001a\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0001\u0010\u0002"
    }
    d2 = {
        "Ld6/s;",
        "invoke",
        "()V",
        "<anonymous>"
    }
    k = 0x3
    mv = {
        0x1,
        0x7,
        0x1
    }
.end annotation


# instance fields
.field final synthetic $onError:Lr6/c;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lr6/c;"
        }
    .end annotation
.end field

.field final synthetic $onSuccess:Lr6/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lr6/a;"
        }
    .end annotation
.end field

.field final synthetic $skip:J

.field final synthetic this$0:Lcom/zykj/blackboard/core/play/PlayPageControl;


# direct methods
.method public constructor <init>(Lcom/zykj/blackboard/core/play/PlayPageControl;JLr6/a;Lr6/c;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/zykj/blackboard/core/play/PlayPageControl;",
            "J",
            "Lr6/a;",
            "Lr6/c;",
            ")V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lcom/zykj/blackboard/core/play/PlayPageControl$seekTo$1;->this$0:Lcom/zykj/blackboard/core/play/PlayPageControl;

    .line 2
    .line 3
    iput-wide p2, p0, Lcom/zykj/blackboard/core/play/PlayPageControl$seekTo$1;->$skip:J

    .line 4
    .line 5
    iput-object p4, p0, Lcom/zykj/blackboard/core/play/PlayPageControl$seekTo$1;->$onSuccess:Lr6/a;

    .line 6
    .line 7
    iput-object p5, p0, Lcom/zykj/blackboard/core/play/PlayPageControl$seekTo$1;->$onError:Lr6/c;

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

.method public static synthetic a(Lr6/c;Ljava/lang/Throwable;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/zykj/blackboard/core/play/PlayPageControl$seekTo$1;->invoke$lambda-4$lambda-3(Lr6/c;Ljava/lang/Throwable;)V

    return-void
.end method

.method public static synthetic b(Lr6/a;)V
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/zykj/blackboard/core/play/PlayPageControl$seekTo$1;->invoke$lambda-2$lambda-1(Lr6/a;)V

    return-void
.end method

.method private static final invoke$lambda-2$lambda-1(Lr6/a;)V
    .locals 1

    .line 1
    const-string v0, "$onSuccess"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-interface {p0}, Lr6/a;->invoke()Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method private static final invoke$lambda-4$lambda-3(Lr6/c;Ljava/lang/Throwable;)V
    .locals 1

    .line 1
    const-string v0, "$onError"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "$it"

    .line 7
    .line 8
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-interface {p0, p1}, Lr6/c;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

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

    sget-object v0, Ld6/s;->a:Ld6/s;

    return-object v0
.end method

.method public final invoke()V
    .locals 7

    .line 2
    const-string v0, "playThread = "

    iget-object v1, p0, Lcom/zykj/blackboard/core/play/PlayPageControl$seekTo$1;->this$0:Lcom/zykj/blackboard/core/play/PlayPageControl;

    iget-wide v2, p0, Lcom/zykj/blackboard/core/play/PlayPageControl$seekTo$1;->$skip:J

    .line 3
    :try_start_0
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Thread;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, " seekTo"

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    sget-object v4, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v4, v0}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V

    .line 4
    invoke-virtual {v1}, Lcom/zykj/blackboard/core/play/BasePlayPageControl;->getCommandThread()Lcom/zykj/blackboard/core/play/CommandThread;

    move-result-object v0

    invoke-virtual {v0}, Lcom/zykj/blackboard/core/play/CommandThread;->pausePlay()V

    .line 5
    invoke-virtual {v1}, Lcom/zykj/blackboard/core/play/BasePlayPageControl;->getAudioCommandThread()Lcom/zykj/blackboard/core/play/AudioCommandThread;

    move-result-object v0

    invoke-virtual {v0}, Lcom/zykj/blackboard/core/play/AudioCommandThread;->pausePlay()V

    const-wide/16 v4, 0x64

    .line 6
    invoke-static {v4, v5}, Ljava/lang/Thread;->sleep(J)V

    .line 7
    invoke-virtual {v1}, Lcom/zykj/blackboard/core/play/BasePlayPageControl;->getGraphControl()Lcom/zykj/blackboard/core/canvas/control/GraphControl;

    move-result-object v0

    const/4 v6, 0x0

    invoke-virtual {v0, v6}, Lcom/zykj/blackboard/core/canvas/control/GraphControl;->isDraw(Z)V

    .line 8
    invoke-virtual {v1}, Lcom/zykj/blackboard/core/play/BasePlayPageControl;->getMatrixAdapter()Lcom/zykj/blackboard/core/canvas/MatrixAdapter;

    move-result-object v0

    invoke-virtual {v0}, Lcom/zykj/blackboard/core/canvas/MatrixAdapter;->resetCamera()V

    .line 9
    invoke-virtual {v1}, Lcom/zykj/blackboard/core/play/BasePlayPageControl;->getGraphControl()Lcom/zykj/blackboard/core/canvas/control/GraphControl;

    move-result-object v0

    invoke-virtual {v0}, Lcom/zykj/blackboard/core/canvas/control/GraphControl;->reset()V

    .line 10
    invoke-static {v4, v5}, Ljava/lang/Thread;->sleep(J)V

    .line 11
    invoke-virtual {v1}, Lcom/zykj/blackboard/core/play/BasePlayPageControl;->getAudioCommandThread()Lcom/zykj/blackboard/core/play/AudioCommandThread;

    move-result-object v0

    new-instance v4, Lcom/zykj/blackboard/core/play/PlayPageControl$seekTo$1$1$1;

    invoke-direct {v4, v1, v2, v3}, Lcom/zykj/blackboard/core/play/PlayPageControl$seekTo$1$1$1;-><init>(Lcom/zykj/blackboard/core/play/PlayPageControl;J)V

    invoke-virtual {v0, v2, v3, v4}, Lcom/zykj/blackboard/core/play/AudioCommandThread;->seekTo(JLr6/a;)V

    .line 12
    sget-object v0, Ld6/s;->a:Ld6/s;

    .line 13
    invoke-static {v0}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    invoke-static {v0}, Lkotlin/b;->a(Ljava/lang/Throwable;)Lkotlin/Result$Failure;

    move-result-object v0

    invoke-static {v0}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    .line 14
    :goto_0
    iget-object v1, p0, Lcom/zykj/blackboard/core/play/PlayPageControl$seekTo$1;->$onSuccess:Lr6/a;

    invoke-static {v0}, Lkotlin/Result;->isSuccess-impl(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    move-object v2, v0

    check-cast v2, Ld6/s;

    .line 15
    new-instance v2, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v3

    invoke-direct {v2, v3}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    new-instance v3, Lcom/zykj/blackboard/core/play/e;

    invoke-direct {v3, v1}, Lcom/zykj/blackboard/core/play/e;-><init>(Lr6/a;)V

    invoke-virtual {v2, v3}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 16
    :cond_0
    iget-object v1, p0, Lcom/zykj/blackboard/core/play/PlayPageControl$seekTo$1;->$onError:Lr6/c;

    invoke-static {v0}, Lkotlin/Result;->exceptionOrNull-impl(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 17
    new-instance v2, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v3

    invoke-direct {v2, v3}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    new-instance v3, Lcom/zykj/blackboard/core/play/f;

    const/4 v4, 0x0

    invoke-direct {v3, v4, v1, v0}, Lcom/zykj/blackboard/core/play/f;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v2, v3}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    :cond_1
    return-void
.end method
