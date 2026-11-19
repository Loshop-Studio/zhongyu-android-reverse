.class final Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord$addCommand$2$1;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord;->F(Ljava/util/List;Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord;JLjava/lang/String;Lcom/zykj/board/EzyGraphEnum$GraphEnum;Ljava/lang/String;Lcom/zykj/board/EzyPaint$Paint;)Lcom/zykj/blackboard/core/data/dao/CommandInfoEntity;
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
.field public final synthetic a:Ljava/lang/String;

.field public final synthetic b:Lcom/zykj/board/EzyGraphEnum$GraphEnum;

.field public final synthetic c:Ljava/util/List;

.field public final synthetic d:Ljava/lang/String;

.field public final synthetic e:Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord;

.field public final synthetic f:Lcom/zykj/board/EzyPaint$Paint;


# direct methods
.method public constructor <init>(Ljava/lang/String;Lcom/zykj/board/EzyGraphEnum$GraphEnum;Ljava/util/List;Ljava/lang/String;Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord;Lcom/zykj/board/EzyPaint$Paint;)V
    .locals 0

    iput-object p1, p0, Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord$addCommand$2$1;->a:Ljava/lang/String;

    iput-object p2, p0, Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord$addCommand$2$1;->b:Lcom/zykj/board/EzyGraphEnum$GraphEnum;

    iput-object p3, p0, Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord$addCommand$2$1;->c:Ljava/util/List;

    iput-object p4, p0, Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord$addCommand$2$1;->d:Ljava/lang/String;

    iput-object p5, p0, Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord$addCommand$2$1;->e:Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord;

    iput-object p6, p0, Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord$addCommand$2$1;->f:Lcom/zykj/board/EzyPaint$Paint;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a()Lcom/google/protobuf/Message;
    .locals 4

    .line 1
    invoke-static {}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphData;->I()Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphData$b;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v1, p0, Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord$addCommand$2$1;->a:Ljava/lang/String;

    .line 6
    .line 7
    invoke-virtual {v0, v1}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphData$b;->y(Ljava/lang/String;)Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphData$b;

    .line 8
    .line 9
    .line 10
    iget-object v1, p0, Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord$addCommand$2$1;->b:Lcom/zykj/board/EzyGraphEnum$GraphEnum;

    .line 11
    .line 12
    invoke-virtual {v0, v1}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphData$b;->w(Lcom/zykj/board/EzyGraphEnum$GraphEnum;)Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphData$b;

    .line 13
    .line 14
    .line 15
    sget-object v1, Le5/k;->a:Le5/k;

    .line 16
    .line 17
    iget-object v2, p0, Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord$addCommand$2$1;->c:Ljava/util/List;

    .line 18
    .line 19
    invoke-virtual {v1, v2}, Le5/k;->d(Ljava/util/List;)Landroid/graphics/RectF;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    invoke-static {v1}, Le5/l;->c(Landroid/graphics/RectF;)Lcom/zykj/board/EzyRectF$RectF;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    invoke-virtual {v0, v1}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphData$b;->z(Lcom/zykj/board/EzyRectF$RectF;)Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphData$b;

    .line 28
    .line 29
    .line 30
    iget-object v1, p0, Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord$addCommand$2$1;->d:Ljava/lang/String;

    .line 31
    .line 32
    invoke-virtual {v0, v1}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphData$b;->A(Ljava/lang/String;)Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphData$b;

    .line 33
    .line 34
    .line 35
    iget-object v1, p0, Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord$addCommand$2$1;->e:Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord;

    .line 36
    .line 37
    invoke-static {v1}, Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord;->w(Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord;)Ly4/s;

    .line 38
    .line 39
    .line 40
    move-result-object v1

    .line 41
    iget-object v2, p0, Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord$addCommand$2$1;->c:Ljava/util/List;

    .line 42
    .line 43
    iget-object v3, p0, Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord$addCommand$2$1;->f:Lcom/zykj/board/EzyPaint$Paint;

    .line 44
    .line 45
    invoke-virtual {v1, v2, v3}, Ly4/s;->e(Ljava/util/List;Lcom/zykj/board/EzyPaint$Paint;)Lf4/b;

    .line 46
    .line 47
    .line 48
    move-result-object v1

    .line 49
    if-eqz v1, :cond_0

    .line 50
    .line 51
    invoke-virtual {v1}, Lf4/b;->a()Ljava/lang/String;

    .line 52
    .line 53
    .line 54
    move-result-object v2

    .line 55
    invoke-virtual {v0, v2}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphData$b;->C(Ljava/lang/String;)Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphData$b;

    .line 56
    .line 57
    .line 58
    invoke-virtual {v1}, Lf4/b;->b()I

    .line 59
    .line 60
    .line 61
    move-result v1

    .line 62
    invoke-virtual {v0, v1}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphData$b;->D(I)Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphData$b;

    .line 63
    .line 64
    .line 65
    :cond_0
    invoke-virtual {v0}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphData$b;->c()Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphData;

    .line 66
    .line 67
    .line 68
    move-result-object v0

    .line 69
    const-string v1, "builder.build()"

    .line 70
    .line 71
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 72
    .line 73
    .line 74
    return-object v0
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord$addCommand$2$1;->a()Lcom/google/protobuf/Message;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method
