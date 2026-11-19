.class public final Lu4/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lu4/d;


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
.method public a(Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphData;Lv4/d;)Lq4/a;
    .locals 7

    .line 1
    const-string v0, "graphData"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "sourceLoad"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    new-instance v1, Lcom/zykj/blackboard/core/graph/group/ImageGraph;

    .line 12
    .line 13
    invoke-virtual {p1}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphData;->D()Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object v2

    .line 17
    const-string v0, "graphData.graphId"

    .line 18
    .line 19
    invoke-static {v2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    invoke-virtual {p1}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphData;->E()Lcom/zykj/board/EzyRectF$RectF;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    const-string v3, "graphData.outRect"

    .line 27
    .line 28
    invoke-static {v0, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    invoke-static {v0}, Le5/l;->f(Lcom/zykj/board/EzyRectF$RectF;)Landroid/graphics/RectF;

    .line 32
    .line 33
    .line 34
    move-result-object v3

    .line 35
    invoke-virtual {p1}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphData;->G()Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object v5

    .line 39
    const-string v0, "graphData.sourceFileName"

    .line 40
    .line 41
    invoke-static {v5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 42
    .line 43
    .line 44
    invoke-virtual {p1}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphData;->H()I

    .line 45
    .line 46
    .line 47
    move-result v6

    .line 48
    move-object v4, p2

    .line 49
    invoke-direct/range {v1 .. v6}, Lcom/zykj/blackboard/core/graph/group/ImageGraph;-><init>(Ljava/lang/String;Landroid/graphics/RectF;Lv4/d;Ljava/lang/String;I)V

    .line 50
    .line 51
    .line 52
    return-object v1
.end method
