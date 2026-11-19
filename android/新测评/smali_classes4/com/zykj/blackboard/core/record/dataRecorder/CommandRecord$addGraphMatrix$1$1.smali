.class final Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord$addGraphMatrix$1$1;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord;->M(Ljava/util/List;Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord;JLjava/util/List;)Lcom/zykj/blackboard/core/data/dao/CommandInfoEntity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function0<",
        "Lcom/google/protobuf/Message;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0001\u001a\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0001\u0010\u0002"
    }
    d2 = {
        "Lcom/google/protobuf/Message;",
        "a",
        "()Lcom/google/protobuf/Message;"
    }
    k = 0x3
    mv = {
        0x1,
        0x7,
        0x1
    }
.end annotation


# instance fields
.field public final synthetic a:Ljava/util/List;

.field public final synthetic b:Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord;

.field public final synthetic c:Ljava/util/List;


# direct methods
.method public constructor <init>(Ljava/util/List;Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord;Ljava/util/List;)V
    .locals 0

    iput-object p1, p0, Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord$addGraphMatrix$1$1;->a:Ljava/util/List;

    iput-object p2, p0, Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord$addGraphMatrix$1$1;->b:Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord;

    iput-object p3, p0, Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord$addGraphMatrix$1$1;->c:Ljava/util/List;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a()Lcom/google/protobuf/Message;
    .locals 3

    .line 1
    invoke-static {}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphMatrix;->E()Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphMatrix$b;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v1, p0, Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord$addGraphMatrix$1$1;->a:Ljava/util/List;

    .line 6
    .line 7
    invoke-virtual {v0, v1}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphMatrix$b;->b(Ljava/lang/Iterable;)Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphMatrix$b;

    .line 8
    .line 9
    .line 10
    iget-object v1, p0, Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord$addGraphMatrix$1$1;->b:Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord;

    .line 11
    .line 12
    invoke-static {v1}, Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord;->u(Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord;)Ly4/q;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    iget-object v2, p0, Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord$addGraphMatrix$1$1;->c:Ljava/util/List;

    .line 17
    .line 18
    invoke-virtual {v1, v2}, Ly4/q;->e(Ljava/util/List;)Lf4/b;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    if-eqz v1, :cond_0

    .line 23
    .line 24
    invoke-virtual {v1}, Lf4/b;->a()Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object v2

    .line 28
    invoke-virtual {v0, v2}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphMatrix$b;->E(Ljava/lang/String;)Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphMatrix$b;

    .line 29
    .line 30
    .line 31
    invoke-virtual {v1}, Lf4/b;->b()I

    .line 32
    .line 33
    .line 34
    move-result v1

    .line 35
    invoke-virtual {v0, v1}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphMatrix$b;->F(I)Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphMatrix$b;

    .line 36
    .line 37
    .line 38
    :cond_0
    invoke-virtual {v0}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphMatrix$b;->d()Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphMatrix;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    const-string v1, "builder.build()"

    .line 43
    .line 44
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 45
    .line 46
    .line 47
    return-object v0
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord$addGraphMatrix$1$1;->a()Lcom/google/protobuf/Message;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method
