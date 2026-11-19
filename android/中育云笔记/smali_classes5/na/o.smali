.class public final Lna/o;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lna/o;

.field public static final b:[F

.field public static final c:[F


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lna/o;

    .line 2
    .line 3
    invoke-direct {v0}, Lna/o;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lna/o;->a:Lna/o;

    .line 7
    .line 8
    const/4 v0, 0x2

    .line 9
    new-array v1, v0, [F

    .line 10
    .line 11
    sput-object v1, Lna/o;->b:[F

    .line 12
    .line 13
    new-array v0, v0, [F

    .line 14
    .line 15
    sput-object v0, Lna/o;->c:[F

    .line 16
    .line 17
    return-void
.end method

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
.method public final a(Landroid/graphics/PointF;Landroid/graphics/PointF;Landroid/graphics/PointF;)F
    .locals 3

    .line 1
    const-string v0, "p1"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "p2"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "p"

    .line 12
    .line 13
    invoke-static {p3, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    iget v0, p2, Landroid/graphics/PointF;->x:F

    .line 17
    .line 18
    iget v1, p1, Landroid/graphics/PointF;->x:F

    .line 19
    .line 20
    sub-float/2addr v0, v1

    .line 21
    iget v2, p3, Landroid/graphics/PointF;->y:F

    .line 22
    .line 23
    iget p1, p1, Landroid/graphics/PointF;->y:F

    .line 24
    .line 25
    sub-float/2addr v2, p1

    .line 26
    mul-float/2addr v0, v2

    .line 27
    iget p3, p3, Landroid/graphics/PointF;->x:F

    .line 28
    .line 29
    sub-float/2addr p3, v1

    .line 30
    iget p2, p2, Landroid/graphics/PointF;->y:F

    .line 31
    .line 32
    sub-float/2addr p2, p1

    .line 33
    mul-float/2addr p3, p2

    .line 34
    sub-float/2addr v0, p3

    .line 35
    return v0
.end method

.method public final b(Landroid/graphics/PointF;Landroid/graphics/PointF;Landroid/graphics/PointF;Landroid/graphics/PointF;Landroid/graphics/PointF;)Z
    .locals 2

    .line 1
    const-string v0, "leftTop"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "rightTop"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "rightBottom"

    .line 12
    .line 13
    invoke-static {p3, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    const-string v0, "leftBottom"

    .line 17
    .line 18
    invoke-static {p4, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    const-string v0, "p"

    .line 22
    .line 23
    invoke-static {p5, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    invoke-virtual {p0, p1, p4, p5}, Lna/o;->a(Landroid/graphics/PointF;Landroid/graphics/PointF;Landroid/graphics/PointF;)F

    .line 27
    .line 28
    .line 29
    move-result v0

    .line 30
    invoke-virtual {p0, p3, p2, p5}, Lna/o;->a(Landroid/graphics/PointF;Landroid/graphics/PointF;Landroid/graphics/PointF;)F

    .line 31
    .line 32
    .line 33
    move-result v1

    .line 34
    mul-float/2addr v0, v1

    .line 35
    const/4 v1, 0x0

    .line 36
    cmpl-float v0, v0, v1

    .line 37
    .line 38
    if-ltz v0, :cond_0

    .line 39
    .line 40
    invoke-virtual {p0, p4, p3, p5}, Lna/o;->a(Landroid/graphics/PointF;Landroid/graphics/PointF;Landroid/graphics/PointF;)F

    .line 41
    .line 42
    .line 43
    move-result p3

    .line 44
    invoke-virtual {p0, p2, p1, p5}, Lna/o;->a(Landroid/graphics/PointF;Landroid/graphics/PointF;Landroid/graphics/PointF;)F

    .line 45
    .line 46
    .line 47
    move-result p1

    .line 48
    mul-float/2addr p3, p1

    .line 49
    cmpl-float p1, p3, v1

    .line 50
    .line 51
    if-ltz p1, :cond_0

    .line 52
    .line 53
    const/4 p1, 0x1

    .line 54
    return p1

    .line 55
    :cond_0
    const/4 p1, 0x0

    .line 56
    return p1
.end method

.method public final c(Landroid/graphics/RectF;Landroid/graphics/Matrix;Landroid/graphics/PointF;)Z
    .locals 8

    .line 1
    const-string v0, "rectF"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "matrix"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "p"

    .line 12
    .line 13
    invoke-static {p3, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    iget v0, p1, Landroid/graphics/RectF;->left:F

    .line 17
    .line 18
    iget v1, p1, Landroid/graphics/RectF;->top:F

    .line 19
    .line 20
    invoke-virtual {p0, v0, v1, p2}, Lna/o;->d(FFLandroid/graphics/Matrix;)Landroid/graphics/PointF;

    .line 21
    .line 22
    .line 23
    move-result-object v3

    .line 24
    iget v0, p1, Landroid/graphics/RectF;->right:F

    .line 25
    .line 26
    iget v1, p1, Landroid/graphics/RectF;->top:F

    .line 27
    .line 28
    invoke-virtual {p0, v0, v1, p2}, Lna/o;->d(FFLandroid/graphics/Matrix;)Landroid/graphics/PointF;

    .line 29
    .line 30
    .line 31
    move-result-object v4

    .line 32
    iget v0, p1, Landroid/graphics/RectF;->right:F

    .line 33
    .line 34
    iget v1, p1, Landroid/graphics/RectF;->bottom:F

    .line 35
    .line 36
    invoke-virtual {p0, v0, v1, p2}, Lna/o;->d(FFLandroid/graphics/Matrix;)Landroid/graphics/PointF;

    .line 37
    .line 38
    .line 39
    move-result-object v5

    .line 40
    iget v0, p1, Landroid/graphics/RectF;->left:F

    .line 41
    .line 42
    iget p1, p1, Landroid/graphics/RectF;->bottom:F

    .line 43
    .line 44
    invoke-virtual {p0, v0, p1, p2}, Lna/o;->d(FFLandroid/graphics/Matrix;)Landroid/graphics/PointF;

    .line 45
    .line 46
    .line 47
    move-result-object v6

    .line 48
    move-object v2, p0

    .line 49
    move-object v7, p3

    .line 50
    invoke-virtual/range {v2 .. v7}, Lna/o;->b(Landroid/graphics/PointF;Landroid/graphics/PointF;Landroid/graphics/PointF;Landroid/graphics/PointF;Landroid/graphics/PointF;)Z

    .line 51
    .line 52
    .line 53
    move-result p1

    .line 54
    return p1
.end method

.method public final d(FFLandroid/graphics/Matrix;)Landroid/graphics/PointF;
    .locals 1

    .line 1
    const-string v0, "matrix"

    .line 2
    .line 3
    invoke-static {p3, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance v0, Landroid/graphics/PointF;

    .line 7
    .line 8
    invoke-direct {v0, p1, p2}, Landroid/graphics/PointF;-><init>(FF)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0, v0, p3}, Lna/o;->e(Landroid/graphics/PointF;Landroid/graphics/Matrix;)Landroid/graphics/PointF;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    return-object p1
.end method

.method public final e(Landroid/graphics/PointF;Landroid/graphics/Matrix;)Landroid/graphics/PointF;
    .locals 5

    .line 1
    const-string v0, "pointF"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "matrix"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    sget-object v0, Lna/o;->b:[F

    .line 12
    .line 13
    const/4 v1, 0x0

    .line 14
    const/4 v2, 0x0

    .line 15
    aput v2, v0, v1

    .line 16
    .line 17
    const/4 v3, 0x1

    .line 18
    aput v2, v0, v3

    .line 19
    .line 20
    sget-object v2, Lna/o;->c:[F

    .line 21
    .line 22
    iget v4, p1, Landroid/graphics/PointF;->x:F

    .line 23
    .line 24
    aput v4, v2, v1

    .line 25
    .line 26
    iget p1, p1, Landroid/graphics/PointF;->y:F

    .line 27
    .line 28
    aput p1, v2, v3

    .line 29
    .line 30
    const/4 v2, 0x2

    .line 31
    new-array v2, v2, [F

    .line 32
    .line 33
    aput v4, v2, v1

    .line 34
    .line 35
    aput p1, v2, v3

    .line 36
    .line 37
    invoke-virtual {p2, v0, v2}, Landroid/graphics/Matrix;->mapPoints([F[F)V

    .line 38
    .line 39
    .line 40
    new-instance p1, Landroid/graphics/PointF;

    .line 41
    .line 42
    aget p2, v0, v1

    .line 43
    .line 44
    aget v0, v0, v3

    .line 45
    .line 46
    invoke-direct {p1, p2, v0}, Landroid/graphics/PointF;-><init>(FF)V

    .line 47
    .line 48
    .line 49
    return-object p1
.end method
