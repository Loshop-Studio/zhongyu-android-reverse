.class public final Lm5/s;
.super Le5/c;
.source "SourceFile"


# instance fields
.field public final k:Landroid/graphics/Paint;

.field public l:F

.field public m:F

.field public n:Landroid/graphics/Path;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Le5/c;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Landroid/graphics/Paint;

    .line 5
    .line 6
    invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lm5/s;->k:Landroid/graphics/Paint;

    .line 10
    .line 11
    new-instance v0, Landroid/graphics/Path;

    .line 12
    .line 13
    invoke-direct {v0}, Landroid/graphics/Path;-><init>()V

    .line 14
    .line 15
    .line 16
    iput-object v0, p0, Lm5/s;->n:Landroid/graphics/Path;

    .line 17
    .line 18
    return-void
.end method


# virtual methods
.method public B(Lcom/zykj/board/EzyTouchEvent$TouchEvent;)V
    .locals 7

    .line 1
    const-string v0, "info"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lm5/s;->n:Landroid/graphics/Path;

    .line 7
    .line 8
    if-nez v0, :cond_0

    .line 9
    .line 10
    goto :goto_1

    .line 11
    :cond_0
    invoke-virtual {v0}, Landroid/graphics/Path;->isEmpty()Z

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    if-eqz v1, :cond_1

    .line 16
    .line 17
    invoke-virtual {p1}, Lcom/zykj/board/EzyTouchEvent$TouchEvent;->getX()F

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    iput v1, p0, Lm5/s;->l:F

    .line 22
    .line 23
    invoke-virtual {p1}, Lcom/zykj/board/EzyTouchEvent$TouchEvent;->getY()F

    .line 24
    .line 25
    .line 26
    move-result p1

    .line 27
    iput p1, p0, Lm5/s;->m:F

    .line 28
    .line 29
    iget v1, p0, Lm5/s;->l:F

    .line 30
    .line 31
    invoke-virtual {v0, v1, p1}, Landroid/graphics/Path;->moveTo(FF)V

    .line 32
    .line 33
    .line 34
    iget p1, p0, Lm5/s;->l:F

    .line 35
    .line 36
    iget v1, p0, Lm5/s;->m:F

    .line 37
    .line 38
    invoke-virtual {v0, p1, v1}, Landroid/graphics/Path;->lineTo(FF)V

    .line 39
    .line 40
    .line 41
    return-void

    .line 42
    :cond_1
    iget v1, p0, Lm5/s;->l:F

    .line 43
    .line 44
    iget v2, p0, Lm5/s;->m:F

    .line 45
    .line 46
    invoke-virtual {p1}, Lcom/zykj/board/EzyTouchEvent$TouchEvent;->getX()F

    .line 47
    .line 48
    .line 49
    move-result v3

    .line 50
    iget v4, p0, Lm5/s;->l:F

    .line 51
    .line 52
    add-float/2addr v3, v4

    .line 53
    const/4 v4, 0x2

    .line 54
    int-to-float v4, v4

    .line 55
    div-float/2addr v3, v4

    .line 56
    invoke-virtual {p1}, Lcom/zykj/board/EzyTouchEvent$TouchEvent;->getY()F

    .line 57
    .line 58
    .line 59
    move-result v5

    .line 60
    iget v6, p0, Lm5/s;->m:F

    .line 61
    .line 62
    add-float/2addr v5, v6

    .line 63
    div-float/2addr v5, v4

    .line 64
    invoke-virtual {v0, v1, v2, v3, v5}, Landroid/graphics/Path;->quadTo(FFFF)V

    .line 65
    .line 66
    .line 67
    invoke-virtual {p1}, Lcom/zykj/board/EzyTouchEvent$TouchEvent;->getX()F

    .line 68
    .line 69
    .line 70
    move-result v1

    .line 71
    iput v1, p0, Lm5/s;->l:F

    .line 72
    .line 73
    invoke-virtual {p1}, Lcom/zykj/board/EzyTouchEvent$TouchEvent;->getY()F

    .line 74
    .line 75
    .line 76
    move-result p1

    .line 77
    iput p1, p0, Lm5/s;->m:F

    .line 78
    .line 79
    invoke-virtual {p0}, Le5/e;->b()La5/c;

    .line 80
    .line 81
    .line 82
    move-result-object p1

    .line 83
    if-eqz p1, :cond_3

    .line 84
    .line 85
    iget-object v1, p0, Lm5/s;->k:Landroid/graphics/Paint;

    .line 86
    .line 87
    invoke-virtual {p0}, Le5/e;->c()Lz4/a;

    .line 88
    .line 89
    .line 90
    move-result-object v2

    .line 91
    if-eqz v2, :cond_2

    .line 92
    .line 93
    invoke-virtual {v2}, Lz4/a;->b()Landroid/graphics/Matrix;

    .line 94
    .line 95
    .line 96
    move-result-object v2

    .line 97
    goto :goto_0

    .line 98
    :cond_2
    const/4 v2, 0x0

    .line 99
    :goto_0
    invoke-interface {p1, v0, v1, v2}, La5/c;->B(Landroid/graphics/Path;Landroid/graphics/Paint;Landroid/graphics/Matrix;)V

    .line 100
    .line 101
    .line 102
    :cond_3
    :goto_1
    return-void
.end method

.method public C(Lcom/zykj/board/EzyTouchEvent$TouchEvent;J)Z
    .locals 4

    .line 1
    const-string v0, "info"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p1}, Lcom/zykj/board/EzyTouchEvent$TouchEvent;->getEventTime()J

    .line 7
    .line 8
    .line 9
    move-result-wide v0

    .line 10
    invoke-virtual {p0}, Le5/c;->v()J

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

.method public final D(Lcom/zykj/board/EzySource$TouchSource$TouchInfo;J)V
    .locals 3

    .line 1
    const-string v0, "touchInfo"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lm5/s;->k:Landroid/graphics/Paint;

    .line 7
    .line 8
    invoke-virtual {p1}, Lcom/zykj/board/EzySource$TouchSource$TouchInfo;->v()Lcom/zykj/board/EzyPaint$Paint;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    const-string v2, "touchInfo.paint"

    .line 13
    .line 14
    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    invoke-static {v1}, Lu5/m;->d(Lcom/zykj/board/EzyPaint$Paint;)Landroid/graphics/Paint;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->set(Landroid/graphics/Paint;)V

    .line 22
    .line 23
    .line 24
    iget-object v0, p0, Lm5/s;->n:Landroid/graphics/Path;

    .line 25
    .line 26
    if-eqz v0, :cond_0

    .line 27
    .line 28
    invoke-virtual {v0}, Landroid/graphics/Path;->reset()V

    .line 29
    .line 30
    .line 31
    :cond_0
    invoke-virtual {p1}, Lcom/zykj/board/EzySource$TouchSource$TouchInfo;->getTouchEventList()Ljava/util/List;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    const-string v1, "touchInfo.touchEventList"

    .line 36
    .line 37
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 38
    .line 39
    .line 40
    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    .line 41
    .line 42
    .line 43
    move-result v0

    .line 44
    if-nez v0, :cond_1

    .line 45
    .line 46
    invoke-virtual {p1}, Lcom/zykj/board/EzySource$TouchSource$TouchInfo;->getTouchEventList()Ljava/util/List;

    .line 47
    .line 48
    .line 49
    move-result-object v0

    .line 50
    invoke-interface {v0}, Ljava/util/List;->listIterator()Ljava/util/ListIterator;

    .line 51
    .line 52
    .line 53
    move-result-object v0

    .line 54
    invoke-virtual {p0, v0}, Le5/c;->A(Ljava/util/ListIterator;)V

    .line 55
    .line 56
    .line 57
    invoke-virtual {p1}, Lcom/zykj/board/EzySource$TouchSource$TouchInfo;->getTouchEventList()Ljava/util/List;

    .line 58
    .line 59
    .line 60
    move-result-object p1

    .line 61
    invoke-static {p1, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 62
    .line 63
    .line 64
    invoke-static {p1}, Lkotlin/collections/CollectionsKt;->first(Ljava/util/List;)Ljava/lang/Object;

    .line 65
    .line 66
    .line 67
    move-result-object p1

    .line 68
    check-cast p1, Lcom/zykj/board/EzyTouchEvent$TouchEvent;

    .line 69
    .line 70
    invoke-virtual {p1}, Lcom/zykj/board/EzyTouchEvent$TouchEvent;->getEventTime()J

    .line 71
    .line 72
    .line 73
    move-result-wide v0

    .line 74
    invoke-virtual {p0, v0, v1}, Le5/c;->x(J)V

    .line 75
    .line 76
    .line 77
    invoke-virtual {p0, p2, p3}, Le5/c;->z(J)V

    .line 78
    .line 79
    .line 80
    :cond_1
    return-void
.end method

.method public s()V
    .locals 1

    .line 1
    invoke-super {p0}, Le5/e;->s()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput-object v0, p0, Lm5/s;->n:Landroid/graphics/Path;

    .line 6
    .line 7
    return-void
.end method

.method public bridge synthetic w(Ljava/lang/Object;)V
    .locals 0

    .line 1
    check-cast p1, Lcom/zykj/board/EzyTouchEvent$TouchEvent;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lm5/s;->B(Lcom/zykj/board/EzyTouchEvent$TouchEvent;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public bridge synthetic y(Ljava/lang/Object;J)Z
    .locals 0

    .line 1
    check-cast p1, Lcom/zykj/board/EzyTouchEvent$TouchEvent;

    .line 2
    .line 3
    invoke-virtual {p0, p1, p2, p3}, Lm5/s;->C(Lcom/zykj/board/EzyTouchEvent$TouchEvent;J)Z

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    return p1
.end method
