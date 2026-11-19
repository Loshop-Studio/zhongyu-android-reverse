.class public final Lha/g;
.super Lz9/c;
.source "SourceFile"


# instance fields
.field public m:Ljava/util/List;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Lz9/c;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public B(Lcom/zykj/board/EzyMatrix$Matrix;)V
    .locals 3

    .line 1
    const-string v0, "info"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lha/g;->m:Ljava/util/List;

    .line 7
    .line 8
    if-eqz v0, :cond_3

    .line 9
    .line 10
    invoke-static {p1}, Lna/n;->g(Lcom/zykj/board/EzyMatrix$Matrix;)Landroid/graphics/Matrix;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    invoke-static {v1}, Lna/n;->c(Landroid/graphics/Matrix;)Z

    .line 15
    .line 16
    .line 17
    move-result v2

    .line 18
    if-nez v2, :cond_0

    .line 19
    .line 20
    new-instance v0, Ljava/lang/StringBuilder;

    .line 21
    .line 22
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 23
    .line 24
    .line 25
    const-string v1, "CameraMatrixThread -> handle\uff0c\u62e6\u622a\u975e\u6cd5\u64ad\u653e\u76f8\u673a\u77e9\u9635\uff0ceventTime="

    .line 26
    .line 27
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 28
    .line 29
    .line 30
    invoke-virtual {p1}, Lcom/zykj/board/EzyMatrix$Matrix;->getEventTime()J

    .line 31
    .line 32
    .line 33
    move-result-wide v1

    .line 34
    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 35
    .line 36
    .line 37
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object p1

    .line 41
    filled-new-array {p1}, [Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object p1

    .line 45
    invoke-static {p1}, Lcom/blankj/utilcode/util/LogUtils;->e([Ljava/lang/Object;)V

    .line 46
    .line 47
    .line 48
    return-void

    .line 49
    :cond_0
    invoke-static {v0}, Lrc/g0;->y0(Ljava/util/List;)Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    move-result-object v2

    .line 53
    invoke-static {p1, v2}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 54
    .line 55
    .line 56
    move-result v2

    .line 57
    if-eqz v2, :cond_1

    .line 58
    .line 59
    invoke-virtual {p0}, Lz9/e;->b()Lv9/c;

    .line 60
    .line 61
    .line 62
    move-result-object p1

    .line 63
    if-eqz p1, :cond_3

    .line 64
    .line 65
    invoke-interface {p1, v1}, Lv9/c;->D(Landroid/graphics/Matrix;)V

    .line 66
    .line 67
    .line 68
    return-void

    .line 69
    :cond_1
    invoke-static {v0}, Lrc/g0;->m0(Ljava/util/List;)Ljava/lang/Object;

    .line 70
    .line 71
    .line 72
    move-result-object v0

    .line 73
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 74
    .line 75
    .line 76
    move-result p1

    .line 77
    if-eqz p1, :cond_2

    .line 78
    .line 79
    invoke-virtual {p0}, Lz9/e;->b()Lv9/c;

    .line 80
    .line 81
    .line 82
    move-result-object p1

    .line 83
    if-eqz p1, :cond_3

    .line 84
    .line 85
    invoke-interface {p1}, Lv9/c;->o()V

    .line 86
    .line 87
    .line 88
    return-void

    .line 89
    :cond_2
    invoke-virtual {p0}, Lz9/e;->b()Lv9/c;

    .line 90
    .line 91
    .line 92
    move-result-object p1

    .line 93
    if-eqz p1, :cond_3

    .line 94
    .line 95
    invoke-interface {p1, v1}, Lv9/c;->r(Landroid/graphics/Matrix;)V

    .line 96
    .line 97
    .line 98
    :cond_3
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

.method public final D(Lcom/zykj/board/EzySource$MatrixSource$MatrixInfo;J)V
    .locals 2

    .line 1
    const-string v0, "info"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p1}, Lcom/zykj/board/EzySource$MatrixSource$MatrixInfo;->getMatrixList()Ljava/util/List;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    const-string v1, "info.matrixList"

    .line 11
    .line 12
    invoke-static {v0, v1}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    check-cast v0, Ljava/util/Collection;

    .line 16
    .line 17
    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    if-nez v0, :cond_0

    .line 22
    .line 23
    invoke-virtual {p1}, Lcom/zykj/board/EzySource$MatrixSource$MatrixInfo;->getMatrixList()Ljava/util/List;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    iput-object v0, p0, Lha/g;->m:Ljava/util/List;

    .line 28
    .line 29
    invoke-virtual {p1}, Lcom/zykj/board/EzySource$MatrixSource$MatrixInfo;->getMatrixList()Ljava/util/List;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    invoke-interface {v0}, Ljava/util/List;->listIterator()Ljava/util/ListIterator;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    invoke-virtual {p0, v0}, Lz9/c;->A(Ljava/util/ListIterator;)V

    .line 38
    .line 39
    .line 40
    invoke-virtual {p1}, Lcom/zykj/board/EzySource$MatrixSource$MatrixInfo;->getMatrixList()Ljava/util/List;

    .line 41
    .line 42
    .line 43
    move-result-object p1

    .line 44
    invoke-static {p1, v1}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 45
    .line 46
    .line 47
    invoke-static {p1}, Lrc/g0;->m0(Ljava/util/List;)Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    move-result-object p1

    .line 51
    check-cast p1, Lcom/zykj/board/EzyMatrix$Matrix;

    .line 52
    .line 53
    invoke-virtual {p1}, Lcom/zykj/board/EzyMatrix$Matrix;->getEventTime()J

    .line 54
    .line 55
    .line 56
    move-result-wide v0

    .line 57
    invoke-virtual {p0, v0, v1}, Lz9/c;->x(J)V

    .line 58
    .line 59
    .line 60
    invoke-virtual {p0, p2, p3}, Lz9/c;->z(J)V

    .line 61
    .line 62
    .line 63
    :cond_0
    return-void
.end method

.method public bridge synthetic w(Ljava/lang/Object;)V
    .locals 0

    .line 1
    check-cast p1, Lcom/zykj/board/EzyMatrix$Matrix;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lha/g;->B(Lcom/zykj/board/EzyMatrix$Matrix;)V

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
    invoke-virtual {p0, p1, p2, p3}, Lha/g;->C(Lcom/zykj/board/EzyMatrix$Matrix;J)Z

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    return p1
.end method
