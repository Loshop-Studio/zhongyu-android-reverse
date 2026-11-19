.class public final Lcom/zykj/paint/extensions/GraphExtKt;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final inverts(Landroid/graphics/Matrix;)Landroid/graphics/Matrix;
    .locals 1

    .line 1
    const-string v0, "<this>"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance v0, Landroid/graphics/Matrix;

    .line 7
    .line 8
    invoke-direct {v0}, Landroid/graphics/Matrix;-><init>()V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0, v0}, Landroid/graphics/Matrix;->invert(Landroid/graphics/Matrix;)Z

    .line 12
    .line 13
    .line 14
    return-object v0
.end method

.method public static final mapPoint(Landroid/graphics/Matrix;Landroid/graphics/PointF;)Landroid/graphics/PointF;
    .locals 4

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "pointF"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x2

    .line 5
    new-array v1, v0, [F

    .line 6
    iget v2, p1, Landroid/graphics/PointF;->x:F

    iget p1, p1, Landroid/graphics/PointF;->y:F

    new-array v0, v0, [F

    const/4 v3, 0x0

    aput v2, v0, v3

    const/4 v2, 0x1

    aput p1, v0, v2

    invoke-virtual {p0, v1, v0}, Landroid/graphics/Matrix;->mapPoints([F[F)V

    .line 7
    new-instance p0, Landroid/graphics/PointF;

    aget p1, v1, v3

    aget v0, v1, v2

    invoke-direct {p0, p1, v0}, Landroid/graphics/PointF;-><init>(FF)V

    return-object p0
.end method

.method public static final mapPoint(Lcom/zykj/paint/graphic/Graph;FFLandroid/graphics/Matrix;)Landroid/graphics/PointF;
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "matrix"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    new-instance v0, Landroid/graphics/PointF;

    invoke-direct {v0, p1, p2}, Landroid/graphics/PointF;-><init>(FF)V

    invoke-static {p0, v0, p3}, Lcom/zykj/paint/extensions/GraphExtKt;->mapPoint(Lcom/zykj/paint/graphic/Graph;Landroid/graphics/PointF;Landroid/graphics/Matrix;)Landroid/graphics/PointF;

    move-result-object p0

    return-object p0
.end method

.method public static final mapPoint(Lcom/zykj/paint/graphic/Graph;Landroid/graphics/PointF;Landroid/graphics/Matrix;)Landroid/graphics/PointF;
    .locals 3

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p0, "pointF"

    invoke-static {p1, p0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p0, "matrix"

    invoke-static {p2, p0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 p0, 0x2

    .line 2
    new-array v0, p0, [F

    .line 3
    iget v1, p1, Landroid/graphics/PointF;->x:F

    iget p1, p1, Landroid/graphics/PointF;->y:F

    new-array p0, p0, [F

    const/4 v2, 0x0

    aput v1, p0, v2

    const/4 v1, 0x1

    aput p1, p0, v1

    invoke-virtual {p2, v0, p0}, Landroid/graphics/Matrix;->mapPoints([F[F)V

    .line 4
    new-instance p0, Landroid/graphics/PointF;

    aget p1, v0, v2

    aget p2, v0, v1

    invoke-direct {p0, p1, p2}, Landroid/graphics/PointF;-><init>(FF)V

    return-object p0
.end method
