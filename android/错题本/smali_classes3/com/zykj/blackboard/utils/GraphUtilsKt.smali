.class public final Lcom/zykj/blackboard/utils/GraphUtilsKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000*\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u001a\u001a\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004\u001a\n\u0010\u0006\u001a\u00020\u0007*\u00020\u0008\u001a\n\u0010\t\u001a\u00020\n*\u00020\u000b\u001a\n\u0010\u000c\u001a\u00020\u0002*\u00020\u0001\u001a\n\u0010\r\u001a\u00020\u0008*\u00020\u0007\u001a\n\u0010\u000e\u001a\u00020\u000b*\u00020\n\u00a8\u0006\u000f"
    }
    d2 = {
        "covertEzyPaint",
        "Lcom/zykj/board/EzyPaint$Paint;",
        "Landroid/graphics/Paint;",
        "paintItemLength",
        "",
        "paintSpacing",
        "covertEzyPointF",
        "Lcom/zykj/board/EzyPointF$PointF;",
        "Landroid/graphics/PointF;",
        "covertEzyRectF",
        "Lcom/zykj/board/EzyRectF$RectF;",
        "Landroid/graphics/RectF;",
        "covertPaint",
        "covertPointF",
        "covertRectF",
        "blackboard_release"
    }
    k = 0x2
    mv = {
        0x1,
        0x7,
        0x1
    }
    xi = 0x30
.end annotation


# direct methods
.method public static final covertEzyPaint(Landroid/graphics/Paint;FF)Lcom/zykj/board/EzyPaint$Paint;
    .locals 2
    .param p0    # Landroid/graphics/Paint;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    const-string v0, "<this>"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-static {}, Lcom/zykj/board/EzyPaint$Paint;->newBuilder()Lb4/p0;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    invoke-virtual {p0}, Landroid/graphics/Paint;->getColor()I

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    invoke-virtual {v0, v1}, Lb4/p0;->i(I)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {p0}, Landroid/graphics/Paint;->getStrokeWidth()F

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    invoke-virtual {v0, v1}, Lb4/p0;->n(F)V

    .line 22
    .line 23
    .line 24
    invoke-virtual {v0, p1}, Lb4/p0;->j(F)V

    .line 25
    .line 26
    .line 27
    invoke-virtual {v0, p2}, Lb4/p0;->k(F)V

    .line 28
    .line 29
    .line 30
    invoke-virtual {p0}, Landroid/graphics/Paint;->getStyle()Landroid/graphics/Paint$Style;

    .line 31
    .line 32
    .line 33
    move-result-object p1

    .line 34
    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    .line 35
    .line 36
    .line 37
    move-result p1

    .line 38
    invoke-virtual {v0, p1}, Lb4/p0;->l(I)V

    .line 39
    .line 40
    .line 41
    invoke-virtual {p0}, Landroid/graphics/Paint;->getTextSize()F

    .line 42
    .line 43
    .line 44
    move-result p0

    .line 45
    invoke-virtual {v0, p0}, Lb4/p0;->m(F)V

    .line 46
    .line 47
    .line 48
    invoke-virtual {v0}, Lb4/p0;->c()Lcom/zykj/board/EzyPaint$Paint;

    .line 49
    .line 50
    .line 51
    move-result-object p0

    .line 52
    return-object p0
.end method

.method public static final covertEzyPointF(Landroid/graphics/PointF;)Lcom/zykj/board/EzyPointF$PointF;
    .locals 2
    .param p0    # Landroid/graphics/PointF;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    const-string v0, "<this>"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-static {}, Lcom/zykj/board/EzyPointF$PointF;->newBuilder()Lb4/u0;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    iget v1, p0, Landroid/graphics/PointF;->x:F

    .line 11
    .line 12
    invoke-virtual {v0, v1}, Lb4/u0;->i(F)V

    .line 13
    .line 14
    .line 15
    iget p0, p0, Landroid/graphics/PointF;->y:F

    .line 16
    .line 17
    invoke-virtual {v0, p0}, Lb4/u0;->j(F)V

    .line 18
    .line 19
    .line 20
    invoke-virtual {v0}, Lb4/u0;->c()Lcom/zykj/board/EzyPointF$PointF;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    return-object p0
.end method

.method public static final covertEzyRectF(Landroid/graphics/RectF;)Lcom/zykj/board/EzyRectF$RectF;
    .locals 2
    .param p0    # Landroid/graphics/RectF;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    const-string v0, "<this>"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-static {}, Lcom/zykj/board/EzyRectF$RectF;->newBuilder()Lb4/b1;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    iget v1, p0, Landroid/graphics/RectF;->left:F

    .line 11
    .line 12
    invoke-virtual {v0, v1}, Lb4/b1;->j(F)V

    .line 13
    .line 14
    .line 15
    iget v1, p0, Landroid/graphics/RectF;->top:F

    .line 16
    .line 17
    invoke-virtual {v0, v1}, Lb4/b1;->l(F)V

    .line 18
    .line 19
    .line 20
    iget v1, p0, Landroid/graphics/RectF;->right:F

    .line 21
    .line 22
    invoke-virtual {v0, v1}, Lb4/b1;->k(F)V

    .line 23
    .line 24
    .line 25
    iget p0, p0, Landroid/graphics/RectF;->bottom:F

    .line 26
    .line 27
    invoke-virtual {v0, p0}, Lb4/b1;->i(F)V

    .line 28
    .line 29
    .line 30
    invoke-virtual {v0}, Lb4/b1;->c()Lcom/zykj/board/EzyRectF$RectF;

    .line 31
    .line 32
    .line 33
    move-result-object p0

    .line 34
    return-object p0
.end method

.method public static final covertPaint(Lcom/zykj/board/EzyPaint$Paint;)Landroid/graphics/Paint;
    .locals 8
    .param p0    # Lcom/zykj/board/EzyPaint$Paint;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    const-string v0, "<this>"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance v0, Landroid/graphics/Paint;

    .line 7
    .line 8
    invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0}, Lcom/zykj/board/EzyPaint$Paint;->getColor()I

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 16
    .line 17
    .line 18
    invoke-virtual {p0}, Lcom/zykj/board/EzyPaint$Paint;->getWidth()F

    .line 19
    .line 20
    .line 21
    move-result v1

    .line 22
    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 23
    .line 24
    .line 25
    invoke-virtual {p0}, Lcom/zykj/board/EzyPaint$Paint;->getSpacing()F

    .line 26
    .line 27
    .line 28
    move-result v1

    .line 29
    const/4 v2, 0x0

    .line 30
    cmpg-float v1, v1, v2

    .line 31
    .line 32
    const/4 v3, 0x1

    .line 33
    if-nez v1, :cond_0

    .line 34
    .line 35
    goto :goto_0

    .line 36
    :cond_0
    new-instance v1, Landroid/graphics/DashPathEffect;

    .line 37
    .line 38
    invoke-virtual {p0}, Lcom/zykj/board/EzyPaint$Paint;->getItemLength()F

    .line 39
    .line 40
    .line 41
    move-result v4

    .line 42
    invoke-virtual {p0}, Lcom/zykj/board/EzyPaint$Paint;->getSpacing()F

    .line 43
    .line 44
    .line 45
    move-result v5

    .line 46
    const/4 v6, 0x2

    .line 47
    new-array v6, v6, [F

    .line 48
    .line 49
    const/4 v7, 0x0

    .line 50
    aput v4, v6, v7

    .line 51
    .line 52
    aput v5, v6, v3

    .line 53
    .line 54
    invoke-direct {v1, v6, v2}, Landroid/graphics/DashPathEffect;-><init>([FF)V

    .line 55
    .line 56
    .line 57
    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setPathEffect(Landroid/graphics/PathEffect;)Landroid/graphics/PathEffect;

    .line 58
    .line 59
    .line 60
    :goto_0
    invoke-virtual {p0}, Lcom/zykj/board/EzyPaint$Paint;->getStyle()I

    .line 61
    .line 62
    .line 63
    move-result v1

    .line 64
    if-eqz v1, :cond_2

    .line 65
    .line 66
    if-eq v1, v3, :cond_1

    .line 67
    .line 68
    sget-object v1, Landroid/graphics/Paint$Style;->FILL_AND_STROKE:Landroid/graphics/Paint$Style;

    .line 69
    .line 70
    goto :goto_1

    .line 71
    :cond_1
    sget-object v1, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    .line 72
    .line 73
    goto :goto_1

    .line 74
    :cond_2
    sget-object v1, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    .line 75
    .line 76
    :goto_1
    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 77
    .line 78
    .line 79
    sget-object v1, Landroid/graphics/Paint$Cap;->ROUND:Landroid/graphics/Paint$Cap;

    .line 80
    .line 81
    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStrokeCap(Landroid/graphics/Paint$Cap;)V

    .line 82
    .line 83
    .line 84
    sget-object v1, Landroid/graphics/Paint$Join;->ROUND:Landroid/graphics/Paint$Join;

    .line 85
    .line 86
    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStrokeJoin(Landroid/graphics/Paint$Join;)V

    .line 87
    .line 88
    .line 89
    invoke-virtual {p0}, Lcom/zykj/board/EzyPaint$Paint;->getTextSize()F

    .line 90
    .line 91
    .line 92
    move-result p0

    .line 93
    invoke-virtual {v0, p0}, Landroid/graphics/Paint;->setTextSize(F)V

    .line 94
    .line 95
    .line 96
    invoke-virtual {v0, v3}, Landroid/graphics/Paint;->setDither(Z)V

    .line 97
    .line 98
    .line 99
    invoke-virtual {v0, v3}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 100
    .line 101
    .line 102
    return-object v0
.end method

.method public static final covertPointF(Lcom/zykj/board/EzyPointF$PointF;)Landroid/graphics/PointF;
    .locals 2
    .param p0    # Lcom/zykj/board/EzyPointF$PointF;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    const-string v0, "<this>"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance v0, Landroid/graphics/PointF;

    .line 7
    .line 8
    invoke-virtual {p0}, Lcom/zykj/board/EzyPointF$PointF;->getX()F

    .line 9
    .line 10
    .line 11
    move-result v1

    .line 12
    invoke-virtual {p0}, Lcom/zykj/board/EzyPointF$PointF;->getY()F

    .line 13
    .line 14
    .line 15
    move-result p0

    .line 16
    invoke-direct {v0, v1, p0}, Landroid/graphics/PointF;-><init>(FF)V

    .line 17
    .line 18
    .line 19
    return-object v0
.end method

.method public static final covertRectF(Lcom/zykj/board/EzyRectF$RectF;)Landroid/graphics/RectF;
    .locals 4
    .param p0    # Lcom/zykj/board/EzyRectF$RectF;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    const-string v0, "<this>"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance v0, Landroid/graphics/RectF;

    .line 7
    .line 8
    invoke-virtual {p0}, Lcom/zykj/board/EzyRectF$RectF;->getLeft()F

    .line 9
    .line 10
    .line 11
    move-result v1

    .line 12
    invoke-virtual {p0}, Lcom/zykj/board/EzyRectF$RectF;->getTop()F

    .line 13
    .line 14
    .line 15
    move-result v2

    .line 16
    invoke-virtual {p0}, Lcom/zykj/board/EzyRectF$RectF;->getRight()F

    .line 17
    .line 18
    .line 19
    move-result v3

    .line 20
    invoke-virtual {p0}, Lcom/zykj/board/EzyRectF$RectF;->getBottom()F

    .line 21
    .line 22
    .line 23
    move-result p0

    .line 24
    invoke-direct {v0, v1, v2, v3, p0}, Landroid/graphics/RectF;-><init>(FFFF)V

    .line 25
    .line 26
    .line 27
    return-object v0
.end method
