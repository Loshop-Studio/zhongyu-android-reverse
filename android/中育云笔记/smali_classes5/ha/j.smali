.class public final Lha/j;
.super Lz9/c;
.source "SourceFile"


# instance fields
.field public m:Ljava/util/List;

.field public n:Ljava/util/ArrayList;

.field public o:Ljava/util/ArrayList;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Lz9/c;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/util/ArrayList;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lha/j;->n:Ljava/util/ArrayList;

    .line 10
    .line 11
    new-instance v0, Ljava/util/ArrayList;

    .line 12
    .line 13
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 14
    .line 15
    .line 16
    iput-object v0, p0, Lha/j;->o:Ljava/util/ArrayList;

    .line 17
    .line 18
    return-void
.end method


# virtual methods
.method public B(Lcom/zykj/board/EzyMatrix$Matrix;)V
    .locals 2

    .line 1
    const-string v0, "info"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lha/j;->m:Ljava/util/List;

    .line 7
    .line 8
    if-eqz v0, :cond_1

    .line 9
    .line 10
    invoke-static {v0}, Lrc/g0;->m0(Ljava/util/List;)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    if-eqz v0, :cond_0

    .line 19
    .line 20
    invoke-virtual {p0}, Lz9/e;->b()Lv9/c;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    if-eqz p1, :cond_1

    .line 25
    .line 26
    iget-object v0, p0, Lha/j;->o:Ljava/util/ArrayList;

    .line 27
    .line 28
    invoke-interface {p1, v0}, Lv9/c;->x(Ljava/util/List;)V

    .line 29
    .line 30
    .line 31
    return-void

    .line 32
    :cond_0
    invoke-virtual {p0}, Lz9/e;->b()Lv9/c;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    if-eqz v0, :cond_1

    .line 37
    .line 38
    iget-object v1, p0, Lha/j;->o:Ljava/util/ArrayList;

    .line 39
    .line 40
    invoke-static {p1}, Lna/n;->g(Lcom/zykj/board/EzyMatrix$Matrix;)Landroid/graphics/Matrix;

    .line 41
    .line 42
    .line 43
    move-result-object p1

    .line 44
    invoke-interface {v0, v1, p1}, Lv9/c;->k(Ljava/util/List;Landroid/graphics/Matrix;)V

    .line 45
    .line 46
    .line 47
    :cond_1
    return-void
.end method

.method public C(Lcom/zykj/board/EzyMatrix$Matrix;J)Z
    .locals 4

    .line 1
    const-string v0, "info"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p1}, Lcom/zykj/board/EzyMatrix$Matrix;->getEventTime()J

    .line 7
    .line 8
    .line 9
    move-result-wide v0

    .line 10
    invoke-virtual {p0}, Lz9/c;->v()J

    .line 11
    .line 12
    .line 13
    move-result-wide v2

    .line 14
    sub-long/2addr v0, v2

    .line 15
    cmp-long p1, v0, p2

    .line 16
    .line 17
    if-gtz p1, :cond_0

    .line 18
    .line 19
    const/4 p1, 0x1

    .line 20
    return p1

    .line 21
    :cond_0
    const/4 p1, 0x0

    .line 22
    return p1
.end method

.method public final D(Ljava/util/List;Lcom/zykj/board/EzySource$MatrixSource$MatrixInfo;J)V
    .locals 5

    .line 1
    const-string v0, "graphIdList"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "info"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, Lha/j;->n:Ljava/util/ArrayList;

    .line 12
    .line 13
    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 14
    .line 15
    .line 16
    iget-object v0, p0, Lha/j;->n:Ljava/util/ArrayList;

    .line 17
    .line 18
    check-cast p1, Ljava/util/Collection;

    .line 19
    .line 20
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 21
    .line 22
    .line 23
    iget-object p1, p0, Lha/j;->n:Ljava/util/ArrayList;

    .line 24
    .line 25
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    const/4 v1, 0x0

    .line 30
    :cond_0
    :goto_0
    if-ge v1, v0, :cond_1

    .line 31
    .line 32
    invoke-virtual {p1, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object v2

    .line 36
    add-int/lit8 v1, v1, 0x1

    .line 37
    .line 38
    check-cast v2, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphData;

    .line 39
    .line 40
    invoke-virtual {p0}, Lz9/e;->b()Lv9/c;

    .line 41
    .line 42
    .line 43
    move-result-object v3

    .line 44
    if-eqz v3, :cond_0

    .line 45
    .line 46
    invoke-interface {v3}, Lv9/c;->n()Lba/c;

    .line 47
    .line 48
    .line 49
    move-result-object v3

    .line 50
    if-eqz v3, :cond_0

    .line 51
    .line 52
    invoke-virtual {v2}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphData;->D()Ljava/lang/String;

    .line 53
    .line 54
    .line 55
    move-result-object v2

    .line 56
    const-string v4, "it.graphId"

    .line 57
    .line 58
    invoke-static {v2, v4}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 59
    .line 60
    .line 61
    invoke-interface {v3, v2}, Lba/c;->n(Ljava/lang/String;)Lba/a;

    .line 62
    .line 63
    .line 64
    move-result-object v2

    .line 65
    if-eqz v2, :cond_0

    .line 66
    .line 67
    iget-object v3, p0, Lha/j;->o:Ljava/util/ArrayList;

    .line 68
    .line 69
    invoke-virtual {v3, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 70
    .line 71
    .line 72
    goto :goto_0

    .line 73
    :cond_1
    invoke-virtual {p2}, Lcom/zykj/board/EzySource$MatrixSource$MatrixInfo;->getMatrixList()Ljava/util/List;

    .line 74
    .line 75
    .line 76
    move-result-object p1

    .line 77
    const-string v0, "info.matrixList"

    .line 78
    .line 79
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 80
    .line 81
    .line 82
    check-cast p1, Ljava/util/Collection;

    .line 83
    .line 84
    invoke-interface {p1}, Ljava/util/Collection;->isEmpty()Z

    .line 85
    .line 86
    .line 87
    move-result p1

    .line 88
    if-nez p1, :cond_2

    .line 89
    .line 90
    invoke-virtual {p2}, Lcom/zykj/board/EzySource$MatrixSource$MatrixInfo;->getMatrixList()Ljava/util/List;

    .line 91
    .line 92
    .line 93
    move-result-object p1

    .line 94
    iput-object p1, p0, Lha/j;->m:Ljava/util/List;

    .line 95
    .line 96
    invoke-virtual {p2}, Lcom/zykj/board/EzySource$MatrixSource$MatrixInfo;->getMatrixList()Ljava/util/List;

    .line 97
    .line 98
    .line 99
    move-result-object p1

    .line 100
    invoke-interface {p1}, Ljava/util/List;->listIterator()Ljava/util/ListIterator;

    .line 101
    .line 102
    .line 103
    move-result-object p1

    .line 104
    invoke-virtual {p0, p1}, Lz9/c;->A(Ljava/util/ListIterator;)V

    .line 105
    .line 106
    .line 107
    invoke-virtual {p2}, Lcom/zykj/board/EzySource$MatrixSource$MatrixInfo;->getMatrixList()Ljava/util/List;

    .line 108
    .line 109
    .line 110
    move-result-object p1

    .line 111
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 112
    .line 113
    .line 114
    invoke-static {p1}, Lrc/g0;->m0(Ljava/util/List;)Ljava/lang/Object;

    .line 115
    .line 116
    .line 117
    move-result-object p1

    .line 118
    check-cast p1, Lcom/zykj/board/EzyMatrix$Matrix;

    .line 119
    .line 120
    invoke-virtual {p1}, Lcom/zykj/board/EzyMatrix$Matrix;->getEventTime()J

    .line 121
    .line 122
    .line 123
    move-result-wide p1

    .line 124
    invoke-virtual {p0, p1, p2}, Lz9/c;->x(J)V

    .line 125
    .line 126
    .line 127
    invoke-virtual {p0, p3, p4}, Lz9/c;->z(J)V

    .line 128
    .line 129
    .line 130
    :cond_2
    return-void
.end method

.method public bridge synthetic w(Ljava/lang/Object;)V
    .locals 0

    .line 1
    check-cast p1, Lcom/zykj/board/EzyMatrix$Matrix;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lha/j;->B(Lcom/zykj/board/EzyMatrix$Matrix;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public bridge synthetic y(Ljava/lang/Object;J)Z
    .locals 0

    .line 1
    check-cast p1, Lcom/zykj/board/EzyMatrix$Matrix;

    .line 2
    .line 3
    invoke-virtual {p0, p1, p2, p3}, Lha/j;->C(Lcom/zykj/board/EzyMatrix$Matrix;J)Z

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    return p1
.end method
