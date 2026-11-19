.class final Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord$addGraphMatrix$1$1;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lhd/a;


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
        "Lhd/a;"
    }
.end annotation


# instance fields
.field public final synthetic c:Ljava/util/List;

.field public final synthetic d:Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord;

.field public final synthetic e:Ljava/util/List;


# direct methods
.method public constructor <init>(Ljava/util/List;Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord;Ljava/util/List;)V
    .locals 0

    iput-object p1, p0, Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord$addGraphMatrix$1$1;->c:Ljava/util/List;

    iput-object p2, p0, Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord$addGraphMatrix$1$1;->d:Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord;

    iput-object p3, p0, Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord$addGraphMatrix$1$1;->e:Ljava/util/List;

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
    iget-object v1, p0, Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord$addGraphMatrix$1$1;->c:Ljava/util/List;

    .line 6
    .line 7
    check-cast v1, Ljava/lang/Iterable;

    .line 8
    .line 9
    invoke-virtual {v0, v1}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphMatrix$b;->b(Ljava/lang/Iterable;)Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphMatrix$b;

    .line 10
    .line 11
    .line 12
    iget-object v1, p0, Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord$addGraphMatrix$1$1;->d:Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord;

    .line 13
    .line 14
    invoke-static {v1}, Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord;->u(Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord;)Lja/q;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    iget-object v2, p0, Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord$addGraphMatrix$1$1;->e:Ljava/util/List;

    .line 19
    .line 20
    invoke-virtual {v1, v2}, Lja/q;->e(Ljava/util/List;)Lq9/c;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    if-eqz v1, :cond_0

    .line 25
    .line 26
    invoke-virtual {v1}, Lq9/c;->a()Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object v2

    .line 30
    invoke-virtual {v0, v2}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphMatrix$b;->D(Ljava/lang/String;)Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphMatrix$b;

    .line 31
    .line 32
    .line 33
    invoke-virtual {v1}, Lq9/c;->b()I

    .line 34
    .line 35
    .line 36
    move-result v1

    .line 37
    invoke-virtual {v0, v1}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphMatrix$b;->E(I)Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphMatrix$b;

    .line 38
    .line 39
    .line 40
    :cond_0
    invoke-virtual {v0}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphMatrix$b;->e()Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphMatrix;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    const-string v1, "builder.build()"

    .line 45
    .line 46
    invoke-static {v0, v1}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 47
    .line 48
    .line 49
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
