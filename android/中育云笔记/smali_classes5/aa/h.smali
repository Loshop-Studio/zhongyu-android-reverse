.class public final Laa/h;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Lga/d;

.field public final b:Lv9/c;


# direct methods
.method public constructor <init>(Lga/d;Lv9/c;)V
    .locals 1

    .line 1
    const-string v0, "sourceLoader"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "graphControl"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 12
    .line 13
    .line 14
    iput-object p1, p0, Laa/h;->a:Lga/d;

    .line 15
    .line 16
    iput-object p2, p0, Laa/h;->b:Lv9/c;

    .line 17
    .line 18
    return-void
.end method


# virtual methods
.method public a(Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphMatrix;J)Lz9/e;
    .locals 3

    .line 1
    const-string v0, "data"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Laa/h;->a:Lga/d;

    .line 7
    .line 8
    invoke-virtual {p1}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphMatrix;->z()Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    const-string v2, "data.sourceFileName"

    .line 13
    .line 14
    invoke-static {v1, v2}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {p1}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphMatrix;->A()I

    .line 18
    .line 19
    .line 20
    move-result v2

    .line 21
    invoke-interface {v0, v1, v2}, Lga/d;->b(Ljava/lang/String;I)Lcom/zykj/board/EzySource$MatrixSource$MatrixInfo;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    if-eqz v0, :cond_0

    .line 26
    .line 27
    new-instance v1, Lha/j;

    .line 28
    .line 29
    invoke-direct {v1}, Lha/j;-><init>()V

    .line 30
    .line 31
    .line 32
    iget-object v2, p0, Laa/h;->b:Lv9/c;

    .line 33
    .line 34
    invoke-virtual {v1, v2}, Lz9/e;->n(Lv9/c;)V

    .line 35
    .line 36
    .line 37
    iget-object v2, p0, Laa/h;->a:Lga/d;

    .line 38
    .line 39
    invoke-virtual {v1, v2}, Lz9/e;->r(Lga/d;)V

    .line 40
    .line 41
    .line 42
    invoke-virtual {p1}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphMatrix;->u()Ljava/util/List;

    .line 43
    .line 44
    .line 45
    move-result-object p1

    .line 46
    const-string v2, "data.graphDataList"

    .line 47
    .line 48
    invoke-static {p1, v2}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 49
    .line 50
    .line 51
    invoke-virtual {v1, p1, v0, p2, p3}, Lha/j;->D(Ljava/util/List;Lcom/zykj/board/EzySource$MatrixSource$MatrixInfo;J)V

    .line 52
    .line 53
    .line 54
    return-object v1

    .line 55
    :cond_0
    const/4 p1, 0x0

    .line 56
    return-object p1
.end method

.method public b(Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphMatrix;)V
    .locals 5

    .line 1
    const-string v0, "data"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Laa/h;->a:Lga/d;

    .line 7
    .line 8
    invoke-virtual {p1}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphMatrix;->z()Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    const-string v2, "data.sourceFileName"

    .line 13
    .line 14
    invoke-static {v1, v2}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {p1}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphMatrix;->A()I

    .line 18
    .line 19
    .line 20
    move-result v2

    .line 21
    invoke-interface {v0, v1, v2}, Lga/d;->b(Ljava/lang/String;I)Lcom/zykj/board/EzySource$MatrixSource$MatrixInfo;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    if-eqz v0, :cond_2

    .line 26
    .line 27
    new-instance v1, Ljava/util/ArrayList;

    .line 28
    .line 29
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 30
    .line 31
    .line 32
    invoke-virtual {p1}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphMatrix;->u()Ljava/util/List;

    .line 33
    .line 34
    .line 35
    move-result-object p1

    .line 36
    const-string v2, "data.graphDataList"

    .line 37
    .line 38
    invoke-static {p1, v2}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 39
    .line 40
    .line 41
    check-cast p1, Ljava/lang/Iterable;

    .line 42
    .line 43
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 44
    .line 45
    .line 46
    move-result-object p1

    .line 47
    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 48
    .line 49
    .line 50
    move-result v2

    .line 51
    if-eqz v2, :cond_1

    .line 52
    .line 53
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 54
    .line 55
    .line 56
    move-result-object v2

    .line 57
    check-cast v2, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphData;

    .line 58
    .line 59
    iget-object v3, p0, Laa/h;->b:Lv9/c;

    .line 60
    .line 61
    invoke-interface {v3}, Lv9/c;->n()Lba/c;

    .line 62
    .line 63
    .line 64
    move-result-object v3

    .line 65
    if-eqz v3, :cond_0

    .line 66
    .line 67
    invoke-virtual {v2}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphData;->D()Ljava/lang/String;

    .line 68
    .line 69
    .line 70
    move-result-object v2

    .line 71
    const-string v4, "graph.graphId"

    .line 72
    .line 73
    invoke-static {v2, v4}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 74
    .line 75
    .line 76
    invoke-interface {v3, v2}, Lba/c;->n(Ljava/lang/String;)Lba/a;

    .line 77
    .line 78
    .line 79
    move-result-object v2

    .line 80
    if-eqz v2, :cond_0

    .line 81
    .line 82
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 83
    .line 84
    .line 85
    goto :goto_0

    .line 86
    :cond_1
    iget-object p1, p0, Laa/h;->b:Lv9/c;

    .line 87
    .line 88
    invoke-virtual {v0}, Lcom/zykj/board/EzySource$MatrixSource$MatrixInfo;->getMatrixList()Ljava/util/List;

    .line 89
    .line 90
    .line 91
    move-result-object v0

    .line 92
    const-string v2, "it.matrixList"

    .line 93
    .line 94
    invoke-static {v0, v2}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 95
    .line 96
    .line 97
    invoke-static {v0}, Lrc/g0;->y0(Ljava/util/List;)Ljava/lang/Object;

    .line 98
    .line 99
    .line 100
    move-result-object v0

    .line 101
    const-string v2, "it.matrixList.last()"

    .line 102
    .line 103
    invoke-static {v0, v2}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 104
    .line 105
    .line 106
    check-cast v0, Lcom/zykj/board/EzyMatrix$Matrix;

    .line 107
    .line 108
    invoke-static {v0}, Lna/n;->g(Lcom/zykj/board/EzyMatrix$Matrix;)Landroid/graphics/Matrix;

    .line 109
    .line 110
    .line 111
    move-result-object v0

    .line 112
    invoke-interface {p1, v1, v0}, Lv9/c;->z(Ljava/util/List;Landroid/graphics/Matrix;)V

    .line 113
    .line 114
    .line 115
    :cond_2
    return-void
.end method
