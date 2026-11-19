.class final Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord$removeGraphList$1$1;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lhd/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord;->c0(Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord;JLjava/util/List;)Lcom/zykj/blackboard/core/data/dao/CommandInfoEntity;
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
.field public final synthetic c:Ljava/util/List;


# direct methods
.method public constructor <init>(Ljava/util/List;)V
    .locals 0

    iput-object p1, p0, Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord$removeGraphList$1$1;->c:Ljava/util/List;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a()Lcom/google/protobuf/Message;
    .locals 2

    .line 1
    invoke-static {}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphRemove;->m()Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphRemove$b;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v1, p0, Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord$removeGraphList$1$1;->c:Ljava/util/List;

    .line 6
    .line 7
    check-cast v1, Ljava/lang/Iterable;

    .line 8
    .line 9
    invoke-virtual {v0, v1}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphRemove$b;->b(Ljava/lang/Iterable;)Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphRemove$b;

    .line 10
    .line 11
    .line 12
    invoke-virtual {v0}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphRemove$b;->e()Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphRemove;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    const-string v1, "builder.build()"

    .line 17
    .line 18
    invoke-static {v0, v1}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    return-object v0
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord$removeGraphList$1$1;->a()Lcom/google/protobuf/Message;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method
