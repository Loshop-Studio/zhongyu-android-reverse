.class public final Lcom/zykj/blackboard/utils/PointUtils;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final INSTANCE:Lcom/zykj/blackboard/utils/PointUtils;

.field private static final tempDstFloatArray:[F

.field private static final tempSrcFloatArray:[F


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lcom/zykj/blackboard/utils/PointUtils;

    .line 2
    .line 3
    invoke-direct {v0}, Lcom/zykj/blackboard/utils/PointUtils;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lcom/zykj/blackboard/utils/PointUtils;->INSTANCE:Lcom/zykj/blackboard/utils/PointUtils;

    .line 7
    .line 8
    const/4 v0, 0x2

    .line 9
    new-array v1, v0, [F

    .line 10
    .line 11
    sput-object v1, Lcom/zykj/blackboard/utils/PointUtils;->tempDstFloatArray:[F

    .line 12
    .line 13
    new-array v0, v0, [F

    .line 14
    .line 15
    sput-object v0, Lcom/zykj/blackboard/utils/PointUtils;->tempSrcFloatArray:[F

    .line 16
    .line 17
    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public final getCross(Landroid/graphics/PointF;Landroid/graphics/PointF;Landroid/graphics/PointF;)F
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

.method public final isPointInRect(Landroid/graphics/PointF;Landroid/graphics/PointF;Landroid/graphics/PointF;Landroid/graphics/PointF;Landroid/graphics/PointF;)Z
    .locals 2

    const-string v0, "leftTop"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "rightTop"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "rightBottom"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "leftBottom"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "p"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    invoke-virtual {p0, p1, p4, p5}, Lcom/zykj/blackboard/utils/PointUtils;->getCross(Landroid/graphics/PointF;Landroid/graphics/PointF;Landroid/graphics/PointF;)F

    move-result v0

    invoke-virtual {p0, p3, p2, p5}, Lcom/zykj/blackboard/utils/PointUtils;->getCross(Landroid/graphics/PointF;Landroid/graphics/PointF;Landroid/graphics/PointF;)F

    move-result v1

    mul-float/2addr v0, v1

    const/4 v1, 0x0

    cmpl-float v0, v0, v1

    if-ltz v0, :cond_0

    .line 7
    invoke-virtual {p0, p4, p3, p5}, Lcom/zykj/blackboard/utils/PointUtils;->getCross(Landroid/graphics/PointF;Landroid/graphics/PointF;Landroid/graphics/PointF;)F

    move-result p3

    invoke-virtual {p0, p2, p1, p5}, Lcom/zykj/blackboard/utils/PointUtils;->getCross(Landroid/graphics/PointF;Landroid/graphics/PointF;Landroid/graphics/PointF;)F

    move-result p1

    mul-float/2addr p3, p1

    cmpl-float p1, p3, v1

    if-ltz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final isPointInRect(Landroid/graphics/RectF;Landroid/graphics/Matrix;Landroid/graphics/PointF;)Z
    .locals 8

    const-string v0, "rectF"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "matrix"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "p"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    iget v0, p1, Landroid/graphics/RectF;->left:F

    iget v1, p1, Landroid/graphics/RectF;->top:F

    invoke-virtual {p0, v0, v1, p2}, Lcom/zykj/blackboard/utils/PointUtils;->mapPoint(FFLandroid/graphics/Matrix;)Landroid/graphics/PointF;

    move-result-object v3

    .line 2
    iget v0, p1, Landroid/graphics/RectF;->right:F

    iget v1, p1, Landroid/graphics/RectF;->top:F

    invoke-virtual {p0, v0, v1, p2}, Lcom/zykj/blackboard/utils/PointUtils;->mapPoint(FFLandroid/graphics/Matrix;)Landroid/graphics/PointF;

    move-result-object v4

    .line 3
    iget v0, p1, Landroid/graphics/RectF;->right:F

    iget v1, p1, Landroid/graphics/RectF;->bottom:F

    invoke-virtual {p0, v0, v1, p2}, Lcom/zykj/blackboard/utils/PointUtils;->mapPoint(FFLandroid/graphics/Matrix;)Landroid/graphics/PointF;

    move-result-object v5

    .line 4
    iget v0, p1, Landroid/graphics/RectF;->left:F

    iget p1, p1, Landroid/graphics/RectF;->bottom:F

    invoke-virtual {p0, v0, p1, p2}, Lcom/zykj/blackboard/utils/PointUtils;->mapPoint(FFLandroid/graphics/Matrix;)Landroid/graphics/PointF;

    move-result-object v6

    move-object v2, p0

    move-object v7, p3

    .line 5
    invoke-virtual/range {v2 .. v7}, Lcom/zykj/blackboard/utils/PointUtils;->isPointInRect(Landroid/graphics/PointF;Landroid/graphics/PointF;Landroid/graphics/PointF;Landroid/graphics/PointF;Landroid/graphics/PointF;)Z

    move-result p1

    return p1
.end method

.method public final isRectFinRectF(Landroid/graphics/PointF;Landroid/graphics/PointF;Landroid/graphics/PointF;Landroid/graphics/PointF;Landroid/graphics/RectF;)Z
    .locals 7

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
    const-string v0, "rectF"

    .line 22
    .line 23
    invoke-static {p5, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    new-instance v6, Landroid/graphics/PointF;

    .line 27
    .line 28
    invoke-direct {v6}, Landroid/graphics/PointF;-><init>()V

    .line 29
    .line 30
    .line 31
    iget v0, p5, Landroid/graphics/RectF;->left:F

    .line 32
    .line 33
    iget v1, p5, Landroid/graphics/RectF;->top:F

    .line 34
    .line 35
    invoke-virtual {v6, v0, v1}, Landroid/graphics/PointF;->set(FF)V

    .line 36
    .line 37
    .line 38
    sget-object v0, Lh7/p;->a:Lh7/p;

    .line 39
    .line 40
    move-object v1, p0

    .line 41
    move-object v2, p1

    .line 42
    move-object v3, p2

    .line 43
    move-object v4, p3

    .line 44
    move-object v5, p4

    .line 45
    invoke-virtual/range {v1 .. v6}, Lcom/zykj/blackboard/utils/PointUtils;->isPointInRect(Landroid/graphics/PointF;Landroid/graphics/PointF;Landroid/graphics/PointF;Landroid/graphics/PointF;Landroid/graphics/PointF;)Z

    .line 46
    .line 47
    .line 48
    move-result p1

    .line 49
    if-eqz p1, :cond_0

    .line 50
    .line 51
    iget p1, p5, Landroid/graphics/RectF;->right:F

    .line 52
    .line 53
    iget p2, p5, Landroid/graphics/RectF;->top:F

    .line 54
    .line 55
    invoke-virtual {v6, p1, p2}, Landroid/graphics/PointF;->set(FF)V

    .line 56
    .line 57
    .line 58
    move-object v1, p0

    .line 59
    invoke-virtual/range {v1 .. v6}, Lcom/zykj/blackboard/utils/PointUtils;->isPointInRect(Landroid/graphics/PointF;Landroid/graphics/PointF;Landroid/graphics/PointF;Landroid/graphics/PointF;Landroid/graphics/PointF;)Z

    .line 60
    .line 61
    .line 62
    move-result p1

    .line 63
    if-eqz p1, :cond_0

    .line 64
    .line 65
    iget p1, p5, Landroid/graphics/RectF;->right:F

    .line 66
    .line 67
    iget p2, p5, Landroid/graphics/RectF;->bottom:F

    .line 68
    .line 69
    invoke-virtual {v6, p1, p2}, Landroid/graphics/PointF;->set(FF)V

    .line 70
    .line 71
    .line 72
    move-object v1, p0

    .line 73
    invoke-virtual/range {v1 .. v6}, Lcom/zykj/blackboard/utils/PointUtils;->isPointInRect(Landroid/graphics/PointF;Landroid/graphics/PointF;Landroid/graphics/PointF;Landroid/graphics/PointF;Landroid/graphics/PointF;)Z

    .line 74
    .line 75
    .line 76
    move-result p1

    .line 77
    if-eqz p1, :cond_0

    .line 78
    .line 79
    iget p1, p5, Landroid/graphics/RectF;->left:F

    .line 80
    .line 81
    iget p2, p5, Landroid/graphics/RectF;->bottom:F

    .line 82
    .line 83
    invoke-virtual {v6, p1, p2}, Landroid/graphics/PointF;->set(FF)V

    .line 84
    .line 85
    .line 86
    move-object v1, p0

    .line 87
    invoke-virtual/range {v1 .. v6}, Lcom/zykj/blackboard/utils/PointUtils;->isPointInRect(Landroid/graphics/PointF;Landroid/graphics/PointF;Landroid/graphics/PointF;Landroid/graphics/PointF;Landroid/graphics/PointF;)Z

    .line 88
    .line 89
    .line 90
    move-result p1

    .line 91
    if-eqz p1, :cond_0

    .line 92
    .line 93
    const/4 p1, 0x1

    .line 94
    return p1

    .line 95
    :cond_0
    const/4 p1, 0x0

    .line 96
    return p1
.end method

.method public final mapPoint(FFLandroid/graphics/Matrix;)Landroid/graphics/PointF;
    .locals 1

    const-string v0, "matrix"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    new-instance v0, Landroid/graphics/PointF;

    invoke-direct {v0, p1, p2}, Landroid/graphics/PointF;-><init>(FF)V

    invoke-virtual {p0, v0, p3}, Lcom/zykj/blackboard/utils/PointUtils;->mapPoint(Landroid/graphics/PointF;Landroid/graphics/Matrix;)Landroid/graphics/PointF;

    move-result-object p1

    return-object p1
.end method

.method public final mapPoint(Landroid/graphics/PointF;Landroid/graphics/Matrix;)Landroid/graphics/PointF;
    .locals 5

    const-string v0, "pointF"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "matrix"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    sget-object v0, Lcom/zykj/blackboard/utils/PointUtils;->tempDstFloatArray:[F

    const/4 v1, 0x0

    const/4 v2, 0x0

    aput v2, v0, v1

    const/4 v3, 0x1

    .line 3
    aput v2, v0, v3

    .line 4
    sget-object v2, Lcom/zykj/blackboard/utils/PointUtils;->tempSrcFloatArray:[F

    iget v4, p1, Landroid/graphics/PointF;->x:F

    aput v4, v2, v1

    .line 5
    iget p1, p1, Landroid/graphics/PointF;->y:F

    aput p1, v2, v3

    const/4 v2, 0x2

    .line 6
    new-array v2, v2, [F

    aput v4, v2, v1

    aput p1, v2, v3

    invoke-virtual {p2, v0, v2}, Landroid/graphics/Matrix;->mapPoints([F[F)V

    .line 7
    new-instance p1, Landroid/graphics/PointF;

    aget p2, v0, v1

    aget v0, v0, v3

    invoke-direct {p1, p2, v0}, Landroid/graphics/PointF;-><init>(FF)V

    return-object p1
.end method

.method public final rectConvertPath(Landroid/graphics/RectF;Landroid/graphics/Matrix;)Landroid/graphics/Path;
    .locals 4

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
    new-instance v0, Landroid/graphics/Path;

    .line 12
    .line 13
    invoke-direct {v0}, Landroid/graphics/Path;-><init>()V

    .line 14
    .line 15
    .line 16
    iget v1, p1, Landroid/graphics/RectF;->left:F

    .line 17
    .line 18
    iget v2, p1, Landroid/graphics/RectF;->top:F

    .line 19
    .line 20
    invoke-virtual {p0, v1, v2, p2}, Lcom/zykj/blackboard/utils/PointUtils;->mapPoint(FFLandroid/graphics/Matrix;)Landroid/graphics/PointF;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    iget v2, v1, Landroid/graphics/PointF;->x:F

    .line 25
    .line 26
    iget v3, v1, Landroid/graphics/PointF;->y:F

    .line 27
    .line 28
    invoke-virtual {v0, v2, v3}, Landroid/graphics/Path;->moveTo(FF)V

    .line 29
    .line 30
    .line 31
    iget v2, v1, Landroid/graphics/PointF;->x:F

    .line 32
    .line 33
    iget v1, v1, Landroid/graphics/PointF;->y:F

    .line 34
    .line 35
    invoke-virtual {v0, v2, v1}, Landroid/graphics/Path;->lineTo(FF)V

    .line 36
    .line 37
    .line 38
    iget v1, p1, Landroid/graphics/RectF;->right:F

    .line 39
    .line 40
    iget v2, p1, Landroid/graphics/RectF;->top:F

    .line 41
    .line 42
    invoke-virtual {p0, v1, v2, p2}, Lcom/zykj/blackboard/utils/PointUtils;->mapPoint(FFLandroid/graphics/Matrix;)Landroid/graphics/PointF;

    .line 43
    .line 44
    .line 45
    move-result-object v1

    .line 46
    iget v2, v1, Landroid/graphics/PointF;->x:F

    .line 47
    .line 48
    iget v1, v1, Landroid/graphics/PointF;->y:F

    .line 49
    .line 50
    invoke-virtual {v0, v2, v1}, Landroid/graphics/Path;->lineTo(FF)V

    .line 51
    .line 52
    .line 53
    iget v1, p1, Landroid/graphics/RectF;->right:F

    .line 54
    .line 55
    iget v2, p1, Landroid/graphics/RectF;->bottom:F

    .line 56
    .line 57
    invoke-virtual {p0, v1, v2, p2}, Lcom/zykj/blackboard/utils/PointUtils;->mapPoint(FFLandroid/graphics/Matrix;)Landroid/graphics/PointF;

    .line 58
    .line 59
    .line 60
    move-result-object v1

    .line 61
    iget v2, v1, Landroid/graphics/PointF;->x:F

    .line 62
    .line 63
    iget v1, v1, Landroid/graphics/PointF;->y:F

    .line 64
    .line 65
    invoke-virtual {v0, v2, v1}, Landroid/graphics/Path;->lineTo(FF)V

    .line 66
    .line 67
    .line 68
    iget v1, p1, Landroid/graphics/RectF;->left:F

    .line 69
    .line 70
    iget p1, p1, Landroid/graphics/RectF;->bottom:F

    .line 71
    .line 72
    invoke-virtual {p0, v1, p1, p2}, Lcom/zykj/blackboard/utils/PointUtils;->mapPoint(FFLandroid/graphics/Matrix;)Landroid/graphics/PointF;

    .line 73
    .line 74
    .line 75
    move-result-object p1

    .line 76
    iget p2, p1, Landroid/graphics/PointF;->x:F

    .line 77
    .line 78
    iget p1, p1, Landroid/graphics/PointF;->y:F

    .line 79
    .line 80
    invoke-virtual {v0, p2, p1}, Landroid/graphics/Path;->lineTo(FF)V

    .line 81
    .line 82
    .line 83
    invoke-virtual {v0}, Landroid/graphics/Path;->close()V

    .line 84
    .line 85
    .line 86
    return-object v0
.end method
