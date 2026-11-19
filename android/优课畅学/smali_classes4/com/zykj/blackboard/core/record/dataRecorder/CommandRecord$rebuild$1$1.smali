.class final Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord$rebuild$1$1;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lx7/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord;->rebuild$lambda-27(Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord;JLcom/zykj/blackboard/core/graph/Graph;I)Lcom/zykj/blackboard/core/data/dao/CommandInfoEntity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lx7/a;"
    }
.end annotation


# instance fields
.field final synthetic $backgroundColor:I

.field final synthetic $rootGraph:Lcom/zykj/blackboard/core/graph/Graph;


# direct methods
.method public constructor <init>(Lcom/zykj/blackboard/core/graph/Graph;I)V
    .locals 0

    iput-object p1, p0, Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord$rebuild$1$1;->$rootGraph:Lcom/zykj/blackboard/core/graph/Graph;

    iput p2, p0, Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord$rebuild$1$1;->$backgroundColor:I

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke()Lcom/google/protobuf/Message;
    .locals 2

    .line 2
    invoke-static {}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$REBUILD;->m()Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$REBUILD$b;

    move-result-object v0

    .line 3
    iget-object v1, p0, Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord$rebuild$1$1;->$rootGraph:Lcom/zykj/blackboard/core/graph/Graph;

    invoke-virtual {v1}, Lcom/zykj/blackboard/core/graph/Graph;->getSnapshot()Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot$b;

    move-result-object v1

    invoke-virtual {v1}, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot$b;->g()Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$REBUILD$b;->B(Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;)Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$REBUILD$b;

    .line 4
    iget v1, p0, Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord$rebuild$1$1;->$backgroundColor:I

    invoke-virtual {v0, v1}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$REBUILD$b;->y(I)Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$REBUILD$b;

    .line 5
    invoke-virtual {v0}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$REBUILD$b;->e()Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$REBUILD;

    move-result-object v0

    const-string v1, "builder.build()"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord$rebuild$1$1;->invoke()Lcom/google/protobuf/Message;

    move-result-object v0

    return-object v0
.end method
