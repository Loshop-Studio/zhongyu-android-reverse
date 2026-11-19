.class public final Lcom/zykj/blackboard/core/play/CommandThread$fastReadCommandAndPause$1$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/zykj/blackboard/core/execute/PlayFinishListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/blackboard/core/play/CommandThread;->fastReadCommandAndPause(Ljava/util/ListIterator;)Z
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003*\u0001\u0000\u0008\n\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016\u00a2\u0006\u0004\u0008\u0007\u0010\u0008\u00a8\u0006\t"
    }
    d2 = {
        "com/zykj/blackboard/core/play/CommandThread$fastReadCommandAndPause$1$1",
        "Lcom/zykj/blackboard/core/execute/PlayFinishListener;",
        "Lcom/zykj/blackboard/core/execute/PlayThread;",
        "thread",
        "",
        "isCompleted",
        "Ld6/s;",
        "finish",
        "(Lcom/zykj/blackboard/core/execute/PlayThread;Z)V",
        "blackboard_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x7,
        0x1
    }
    xi = 0x30
.end annotation


# instance fields
.field final synthetic $next:Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo;

.field final synthetic $this_run:Lcom/zykj/blackboard/core/execute/PlayThread;

.field final synthetic this$0:Lcom/zykj/blackboard/core/play/CommandThread;


# direct methods
.method public constructor <init>(Lcom/zykj/blackboard/core/play/CommandThread;Lcom/zykj/blackboard/core/execute/PlayThread;Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/zykj/blackboard/core/play/CommandThread$fastReadCommandAndPause$1$1;->this$0:Lcom/zykj/blackboard/core/play/CommandThread;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/zykj/blackboard/core/play/CommandThread$fastReadCommandAndPause$1$1;->$this_run:Lcom/zykj/blackboard/core/execute/PlayThread;

    .line 4
    .line 5
    iput-object p3, p0, Lcom/zykj/blackboard/core/play/CommandThread$fastReadCommandAndPause$1$1;->$next:Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo;

    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public finish(Lcom/zykj/blackboard/core/execute/PlayThread;Z)V
    .locals 1
    .param p1    # Lcom/zykj/blackboard/core/execute/PlayThread;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    const-string v0, "thread"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/zykj/blackboard/core/play/CommandThread$fastReadCommandAndPause$1$1;->this$0:Lcom/zykj/blackboard/core/play/CommandThread;

    .line 7
    .line 8
    invoke-static {v0}, Lcom/zykj/blackboard/core/play/CommandThread;->access$getThreadList$p(Lcom/zykj/blackboard/core/play/CommandThread;)Ljava/util/List;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    invoke-interface {v0, p1}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    .line 13
    .line 14
    .line 15
    if-eqz p2, :cond_0

    .line 16
    .line 17
    iget-object p1, p0, Lcom/zykj/blackboard/core/play/CommandThread$fastReadCommandAndPause$1$1;->$this_run:Lcom/zykj/blackboard/core/execute/PlayThread;

    .line 18
    .line 19
    invoke-virtual {p1}, Lcom/zykj/blackboard/core/execute/PlayThread;->getSourceLoader()Lcom/zykj/blackboard/core/loader/SourceLoader;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    if-eqz p1, :cond_0

    .line 24
    .line 25
    iget-object p1, p0, Lcom/zykj/blackboard/core/play/CommandThread$fastReadCommandAndPause$1$1;->this$0:Lcom/zykj/blackboard/core/play/CommandThread;

    .line 26
    .line 27
    iget-object p2, p0, Lcom/zykj/blackboard/core/play/CommandThread$fastReadCommandAndPause$1$1;->$next:Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo;

    .line 28
    .line 29
    invoke-static {p1}, Lcom/zykj/blackboard/core/play/CommandThread;->access$getCommandExecuteFactory$p(Lcom/zykj/blackboard/core/play/CommandThread;)Lcom/zykj/blackboard/core/execute/BaseCommandExecuteFactory;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    if-eqz p1, :cond_0

    .line 34
    .line 35
    invoke-virtual {p1, p2}, Lcom/zykj/blackboard/core/execute/BaseCommandExecuteFactory;->execute(Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo;)V

    .line 36
    .line 37
    .line 38
    :cond_0
    return-void
.end method
