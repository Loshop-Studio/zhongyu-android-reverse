.class final Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord$moveCursor$1$1;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lhd/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord;->W(Ljava/util/List;Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord;JLcom/zykj/board/EzyPaint$Paint;)Lcom/zykj/blackboard/core/data/dao/CommandInfoEntity;
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
.field public final synthetic c:Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord;

.field public final synthetic d:Ljava/util/List;

.field public final synthetic e:Lcom/zykj/board/EzyPaint$Paint;


# direct methods
.method public constructor <init>(Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord;Ljava/util/List;Lcom/zykj/board/EzyPaint$Paint;)V
    .locals 0

    iput-object p1, p0, Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord$moveCursor$1$1;->c:Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord;

    iput-object p2, p0, Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord$moveCursor$1$1;->d:Ljava/util/List;

    iput-object p3, p0, Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord$moveCursor$1$1;->e:Lcom/zykj/board/EzyPaint$Paint;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a()Lcom/google/protobuf/Message;
    .locals 4

    .line 1
    invoke-static {}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$CursorMove;->m()Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$CursorMove$b;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v1, p0, Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord$moveCursor$1$1;->c:Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord;

    .line 6
    .line 7
    invoke-static {v1}, Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord;->w(Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord;)Lja/s;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    iget-object v2, p0, Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord$moveCursor$1$1;->d:Ljava/util/List;

    .line 12
    .line 13
    iget-object v3, p0, Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord$moveCursor$1$1;->e:Lcom/zykj/board/EzyPaint$Paint;

    .line 14
    .line 15
    invoke-virtual {v1, v2, v3}, Lja/s;->e(Ljava/util/List;Lcom/zykj/board/EzyPaint$Paint;)Lq9/c;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    if-eqz v1, :cond_0

    .line 20
    .line 21
    invoke-virtual {v1}, Lq9/c;->a()Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object v2

    .line 25
    invoke-virtual {v0, v2}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$CursorMove$b;->r(Ljava/lang/String;)Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$CursorMove$b;

    .line 26
    .line 27
    .line 28
    invoke-virtual {v1}, Lq9/c;->b()I

    .line 29
    .line 30
    .line 31
    move-result v1

    .line 32
    invoke-virtual {v0, v1}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$CursorMove$b;->s(I)Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$CursorMove$b;

    .line 33
    .line 34
    .line 35
    :cond_0
    invoke-virtual {v0}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$CursorMove$b;->d()Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$CursorMove;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    const-string v1, "builder.build()"

    .line 40
    .line 41
    invoke-static {v0, v1}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 42
    .line 43
    .line 44
    return-object v0
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord$moveCursor$1$1;->a()Lcom/google/protobuf/Message;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method
