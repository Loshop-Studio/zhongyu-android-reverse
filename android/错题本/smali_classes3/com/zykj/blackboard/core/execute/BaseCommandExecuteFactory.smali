.class public abstract Lcom/zykj/blackboard/core/execute/BaseCommandExecuteFactory;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0008&\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J\u001f\u0010\u000c\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\t\u00a2\u0006\u0004\u0008\u000c\u0010\rJ)\u0010\u0010\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tH&\u00a2\u0006\u0004\u0008\u0010\u0010\u0011J\u0017\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0012H&\u00a2\u0006\u0004\u0008\u0010\u0010\u0013\u00a8\u0006\u0014"
    }
    d2 = {
        "Lcom/zykj/blackboard/core/execute/BaseCommandExecuteFactory;",
        "",
        "<init>",
        "()V",
        "Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo;",
        "command",
        "Ld6/s;",
        "execute",
        "(Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo;)V",
        "",
        "skipTime",
        "Lcom/zykj/blackboard/core/execute/PlayThread;",
        "asyncExecute",
        "(Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo;J)Lcom/zykj/blackboard/core/execute/PlayThread;",
        "",
        "async",
        "executeCommand",
        "(ZLcom/zykj/board/EzyCommand$CommandSource$CommandInfo;J)Lcom/zykj/blackboard/core/execute/PlayThread;",
        "Lcom/zykj/blackboard/core/data/dao/CommandInfoEntity;",
        "(Lcom/zykj/blackboard/core/data/dao/CommandInfoEntity;)V",
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


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public final asyncExecute(Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo;J)Lcom/zykj/blackboard/core/execute/PlayThread;
    .locals 1
    .param p1    # Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    const-string v0, "command"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const/4 v0, 0x1

    .line 7
    invoke-virtual {p0, v0, p1, p2, p3}, Lcom/zykj/blackboard/core/execute/BaseCommandExecuteFactory;->executeCommand(ZLcom/zykj/board/EzyCommand$CommandSource$CommandInfo;J)Lcom/zykj/blackboard/core/execute/PlayThread;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    return-object p1
.end method

.method public final execute(Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo;)V
    .locals 3
    .param p1    # Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    const-string v0, "command"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const/4 v0, 0x0

    .line 7
    const-wide/16 v1, 0x0

    .line 8
    .line 9
    invoke-virtual {p0, v0, p1, v1, v2}, Lcom/zykj/blackboard/core/execute/BaseCommandExecuteFactory;->executeCommand(ZLcom/zykj/board/EzyCommand$CommandSource$CommandInfo;J)Lcom/zykj/blackboard/core/execute/PlayThread;

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public abstract executeCommand(ZLcom/zykj/board/EzyCommand$CommandSource$CommandInfo;J)Lcom/zykj/blackboard/core/execute/PlayThread;
    .param p2    # Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end method

.method public abstract executeCommand(Lcom/zykj/blackboard/core/data/dao/CommandInfoEntity;)V
    .param p1    # Lcom/zykj/blackboard/core/data/dao/CommandInfoEntity;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
.end method
