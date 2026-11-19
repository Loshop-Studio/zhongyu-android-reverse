.class final Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord$rebuild$1$1;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lhd/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord;->Z(Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord;JLba/a;I)Lcom/zykj/blackboard/core/data/dao/CommandInfoEntity;
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
.field public final synthetic c:Lba/a;

.field public final synthetic d:I


# direct methods
.method public constructor <init>(Lba/a;I)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord$rebuild$1$1;->c:Lba/a;

    .line 2
    .line 3
    iput p2, p0, Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord$rebuild$1$1;->d:I

    .line 4
    .line 5
    const/4 p1, 0x0

    .line 6
    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    .line 7
    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public final a()Lcom/google/protobuf/Message;
    .locals 2

    .line 1
    invoke-static {}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$REBUILD;->r()Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$REBUILD$b;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v1, p0, Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord$rebuild$1$1;->c:Lba/a;

    .line 6
    .line 7
    invoke-virtual {v1}, Lba/a;->getSnapshot()Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot$b;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    invoke-virtual {v1}, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot$b;->g()Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    invoke-virtual {v0, v1}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$REBUILD$b;->A(Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;)Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$REBUILD$b;

    .line 16
    .line 17
    .line 18
    iget v1, p0, Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord$rebuild$1$1;->d:I

    .line 19
    .line 20
    invoke-virtual {v0, v1}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$REBUILD$b;->x(I)Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$REBUILD$b;

    .line 21
    .line 22
    .line 23
    invoke-virtual {v0}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$REBUILD$b;->d()Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$REBUILD;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    const-string v1, "builder.build()"

    .line 28
    .line 29
    invoke-static {v0, v1}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    return-object v0
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord$rebuild$1$1;->a()Lcom/google/protobuf/Message;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method
