.class public abstract Lo4/a;
.super Ljava/lang/Object;
.source "SourceFile"


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
.method public final a(Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo;J)Lo4/e;
    .locals 1

    .line 1
    const-string v0, "command"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const/4 v0, 0x1

    .line 7
    invoke-virtual {p0, v0, p1, p2, p3}, Lo4/a;->c(ZLcom/zykj/board/EzyCommand$CommandSource$CommandInfo;J)Lo4/e;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    return-object p1
.end method

.method public final b(Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo;)V
    .locals 3

    .line 1
    const-string v0, "command"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const/4 v0, 0x0

    .line 7
    const-wide/16 v1, 0x0

    .line 8
    .line 9
    invoke-virtual {p0, v0, p1, v1, v2}, Lo4/a;->c(ZLcom/zykj/board/EzyCommand$CommandSource$CommandInfo;J)Lo4/e;

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public abstract c(ZLcom/zykj/board/EzyCommand$CommandSource$CommandInfo;J)Lo4/e;
.end method

.method public abstract d(Lcom/zykj/blackboard/core/data/dao/CommandInfoEntity;)V
.end method
