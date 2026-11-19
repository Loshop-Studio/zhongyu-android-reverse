.class public final Lcom/zykj/blackboard/core/canvas/view/BackgroundView;
.super Landroid/view/View;
.source "SourceFile"

# interfaces
.implements Ll4/c;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/zykj/blackboard/core/canvas/view/BackgroundView$a;
    }
.end annotation


# instance fields
.field public a:I

.field public final b:Landroid/graphics/Paint;

.field public final c:Landroid/graphics/Path;

.field public d:Lcom/zykj/blackboard/bean/BackgroundLineConfig$BackgroundLineType;

.field public e:F

.field public final f:Landroid/graphics/Path;

.field public g:F

.field public final h:Landroid/graphics/Matrix;

.field public i:Ljava/util/Map;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 1

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    new-instance v0, Ljava/util/LinkedHashMap;

    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    iput-object v0, p0, Lcom/zykj/blackboard/core/canvas/view/BackgroundView;->i:Ljava/util/Map;

    .line 2
    invoke-direct {p0, p1, p2, p3}, Landroid/view/View;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    const/4 p1, -0x1

    .line 3
    iput p1, p0, Lcom/zykj/blackboard/core/canvas/view/BackgroundView;->a:I

    .line 4
    new-instance p1, Landroid/graphics/Paint;

    invoke-direct {p1}, Landroid/graphics/Paint;-><init>()V

    .line 5
    sget-object p2, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    invoke-virtual {p1, p2}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 6
    sget-object p2, Landroid/graphics/Paint$Cap;->ROUND:Landroid/graphics/Paint$Cap;

    invoke-virtual {p1, p2}, Landroid/graphics/Paint;->setStrokeCap(Landroid/graphics/Paint$Cap;)V

    .line 7
    sget-object p2, Landroid/graphics/Paint$Join;->ROUND:Landroid/graphics/Paint$Join;

    invoke-virtual {p1, p2}, Landroid/graphics/Paint;->setStrokeJoin(Landroid/graphics/Paint$Join;)V

    const/4 p2, 0x1

    .line 8
    invoke-virtual {p1, p2}, Landroid/graphics/Paint;->setDither(Z)V

    .line 9
    invoke-virtual {p1, p2}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    const/high16 p2, -0x1000000

    .line 10
    invoke-virtual {p1, p2}, Landroid/graphics/Paint;->setColor(I)V

    const/high16 p2, 0x40400000    # 3.0f

    .line 11
    invoke-virtual {p1, p2}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 12
    iput-object p1, p0, Lcom/zykj/blackboard/core/canvas/view/BackgroundView;->b:Landroid/graphics/Paint;

    .line 13
    new-instance p1, Landroid/graphics/Path;

    invoke-direct {p1}, Landroid/graphics/Path;-><init>()V

    iput-object p1, p0, Lcom/zykj/blackboard/core/canvas/view/BackgroundView;->c:Landroid/graphics/Path;

    .line 14
    sget-object p1, Lcom/zykj/blackboard/bean/BackgroundLineConfig$BackgroundLineType;->a:Lcom/zykj/blackboard/bean/BackgroundLineConfig$BackgroundLineType;

    iput-object p1, p0, Lcom/zykj/blackboard/core/canvas/view/BackgroundView;->d:Lcom/zykj/blackboard/bean/BackgroundLineConfig$BackgroundLineType;

    const/high16 p1, 0x42c00000    # 96.0f

    .line 15
    iput p1, p0, Lcom/zykj/blackboard/core/canvas/view/BackgroundView;->e:F

    .line 16
    new-instance p1, Landroid/graphics/Path;

    invoke-direct {p1}, Landroid/graphics/Path;-><init>()V

    iput-object p1, p0, Lcom/zykj/blackboard/core/canvas/view/BackgroundView;->f:Landroid/graphics/Path;

    .line 17
    new-instance p1, Landroid/graphics/Matrix;

    invoke-direct {p1}, Landroid/graphics/Matrix;-><init>()V

    iput-object p1, p0, Lcom/zykj/blackboard/core/canvas/view/BackgroundView;->h:Landroid/graphics/Matrix;

    return-void
.end method

.method public synthetic constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;IILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_0

    const/4 p2, 0x0

    :cond_0
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_1

    const/4 p3, 0x0

    .line 18
    :cond_1
    invoke-direct {p0, p1, p2, p3}, Lcom/zykj/blackboard/core/canvas/view/BackgroundView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public static synthetic c(Lcom/zykj/blackboard/core/canvas/view/BackgroundView;ZLandroid/graphics/Matrix;FFFLcom/zykj/blackboard/bean/BackgroundLineConfig$BackgroundLineType;ILjava/lang/Object;)V
    .locals 7

    .line 1
    and-int/lit8 p8, p7, 0x2

    .line 2
    .line 3
    if-eqz p8, :cond_0

    .line 4
    .line 5
    iget-object p2, p0, Lcom/zykj/blackboard/core/canvas/view/BackgroundView;->h:Landroid/graphics/Matrix;

    .line 6
    .line 7
    :cond_0
    move-object v2, p2

    .line 8
    and-int/lit8 p2, p7, 0x4

    .line 9
    .line 10
    if-eqz p2, :cond_1

    .line 11
    .line 12
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    .line 13
    .line 14
    .line 15
    move-result p2

    .line 16
    int-to-float p3, p2

    .line 17
    :cond_1
    move v3, p3

    .line 18
    and-int/lit8 p2, p7, 0x8

    .line 19
    .line 20
    if-eqz p2, :cond_2

    .line 21
    .line 22
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    .line 23
    .line 24
    .line 25
    move-result p2

    .line 26
    int-to-float p4, p2

    .line 27
    :cond_2
    move v4, p4

    .line 28
    and-int/lit8 p2, p7, 0x10

    .line 29
    .line 30
    if-eqz p2, :cond_3

    .line 31
    .line 32
    iget p5, p0, Lcom/zykj/blackboard/core/canvas/view/BackgroundView;->e:F

    .line 33
    .line 34
    :cond_3
    move v5, p5

    .line 35
    and-int/lit8 p2, p7, 0x20

    .line 36
    .line 37
    if-eqz p2, :cond_4

    .line 38
    .line 39
    iget-object p6, p0, Lcom/zykj/blackboard/core/canvas/view/BackgroundView;->d:Lcom/zykj/blackboard/bean/BackgroundLineConfig$BackgroundLineType;

    .line 40
    .line 41
    :cond_4
    move-object v0, p0

    .line 42
    move v1, p1

    .line 43
    move-object v6, p6

    .line 44
    invoke-virtual/range {v0 .. v6}, Lcom/zykj/blackboard/core/canvas/view/BackgroundView;->b(ZLandroid/graphics/Matrix;FFFLcom/zykj/blackboard/bean/BackgroundLineConfig$BackgroundLineType;)V

    .line 45
    .line 46
    .line 47
    return-void
.end method


# virtual methods
.method public a(Landroid/graphics/Canvas;Landroid/graphics/Matrix;)V
    .locals 9

    .line 1
    const-string v0, "canvas"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "matrix"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    iget v0, p0, Lcom/zykj/blackboard/core/canvas/view/BackgroundView;->a:I

    .line 12
    .line 13
    invoke-virtual {p1, v0}, Landroid/graphics/Canvas;->drawColor(I)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/canvas/view/BackgroundView;->e()Z

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    if-eqz v0, :cond_0

    .line 21
    .line 22
    invoke-virtual {p1}, Landroid/graphics/Canvas;->getClipBounds()Landroid/graphics/Rect;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    const-string v1, "getClipBounds()"

    .line 27
    .line 28
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    invoke-static {v0}, Le5/q;->a(Landroid/graphics/Rect;)Landroid/graphics/RectF;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    invoke-static {p2}, Le5/m;->b(Landroid/graphics/Matrix;)Landroid/graphics/Matrix;

    .line 36
    .line 37
    .line 38
    move-result-object v1

    .line 39
    invoke-virtual {v1, v0}, Landroid/graphics/Matrix;->mapRect(Landroid/graphics/RectF;)Z

    .line 40
    .line 41
    .line 42
    iget v3, v0, Landroid/graphics/RectF;->left:F

    .line 43
    .line 44
    iget v4, v0, Landroid/graphics/RectF;->right:F

    .line 45
    .line 46
    iget v5, v0, Landroid/graphics/RectF;->top:F

    .line 47
    .line 48
    iget v6, v0, Landroid/graphics/RectF;->bottom:F

    .line 49
    .line 50
    iget v7, p0, Lcom/zykj/blackboard/core/canvas/view/BackgroundView;->e:F

    .line 51
    .line 52
    iget-object v8, p0, Lcom/zykj/blackboard/core/canvas/view/BackgroundView;->d:Lcom/zykj/blackboard/bean/BackgroundLineConfig$BackgroundLineType;

    .line 53
    .line 54
    move-object v2, p0

    .line 55
    invoke-virtual/range {v2 .. v8}, Lcom/zykj/blackboard/core/canvas/view/BackgroundView;->d(FFFFFLcom/zykj/blackboard/bean/BackgroundLineConfig$BackgroundLineType;)Landroid/graphics/Path;

    .line 56
    .line 57
    .line 58
    move-result-object v0

    .line 59
    invoke-virtual {v0, p2}, Landroid/graphics/Path;->transform(Landroid/graphics/Matrix;)V

    .line 60
    .line 61
    .line 62
    iget-object p2, v2, Lcom/zykj/blackboard/core/canvas/view/BackgroundView;->b:Landroid/graphics/Paint;

    .line 63
    .line 64
    invoke-virtual {p1, v0, p2}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    .line 65
    .line 66
    .line 67
    return-void

    .line 68
    :cond_0
    move-object v2, p0

    .line 69
    return-void
.end method

.method public final b(ZLandroid/graphics/Matrix;FFFLcom/zykj/blackboard/bean/BackgroundLineConfig$BackgroundLineType;)V
    .locals 9

    .line 1
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/canvas/view/BackgroundView;->e()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    iget-object p1, p0, Lcom/zykj/blackboard/core/canvas/view/BackgroundView;->c:Landroid/graphics/Path;

    .line 8
    .line 9
    invoke-virtual {p1}, Landroid/graphics/Path;->reset()V

    .line 10
    .line 11
    .line 12
    return-void

    .line 13
    :cond_0
    iget v0, p0, Lcom/zykj/blackboard/core/canvas/view/BackgroundView;->g:F

    .line 14
    .line 15
    mul-float v1, p5, v0

    .line 16
    .line 17
    if-eqz p1, :cond_1

    .line 18
    .line 19
    mul-float v7, p5, v0

    .line 20
    .line 21
    iget-object p1, p0, Lcom/zykj/blackboard/core/canvas/view/BackgroundView;->f:Landroid/graphics/Path;

    .line 22
    .line 23
    const/4 v3, 0x0

    .line 24
    const/4 v5, 0x0

    .line 25
    move-object v2, p0

    .line 26
    move v4, p3

    .line 27
    move v6, p4

    .line 28
    move-object v8, p6

    .line 29
    invoke-virtual/range {v2 .. v8}, Lcom/zykj/blackboard/core/canvas/view/BackgroundView;->d(FFFFFLcom/zykj/blackboard/bean/BackgroundLineConfig$BackgroundLineType;)Landroid/graphics/Path;

    .line 30
    .line 31
    .line 32
    move-result-object p3

    .line 33
    invoke-virtual {p1, p3}, Landroid/graphics/Path;->set(Landroid/graphics/Path;)V

    .line 34
    .line 35
    .line 36
    move v1, v7

    .line 37
    goto :goto_0

    .line 38
    :cond_1
    move-object v2, p0

    .line 39
    :goto_0
    const/4 p1, 0x2

    .line 40
    new-array p1, p1, [F

    .line 41
    .line 42
    fill-array-data p1, :array_0

    .line 43
    .line 44
    .line 45
    invoke-virtual {p2, p1}, Landroid/graphics/Matrix;->mapPoints([F)V

    .line 46
    .line 47
    .line 48
    const/4 p2, 0x0

    .line 49
    aget p2, p1, p2

    .line 50
    .line 51
    const/4 p3, 0x0

    .line 52
    cmpg-float p3, p2, p3

    .line 53
    .line 54
    const/high16 p4, 0x3f800000    # 1.0f

    .line 55
    .line 56
    if-gez p3, :cond_2

    .line 57
    .line 58
    sub-float p3, p4, p2

    .line 59
    .line 60
    div-float/2addr p3, v1

    .line 61
    float-to-int p3, p3

    .line 62
    int-to-float p3, p3

    .line 63
    mul-float/2addr p3, v1

    .line 64
    add-float/2addr p2, p3

    .line 65
    goto :goto_1

    .line 66
    :cond_2
    div-float p3, p2, v1

    .line 67
    .line 68
    float-to-int p3, p3

    .line 69
    int-to-float p3, p3

    .line 70
    mul-float/2addr p3, v1

    .line 71
    sub-float/2addr p2, p3

    .line 72
    :goto_1
    const/4 p3, 0x1

    .line 73
    aget p1, p1, p3

    .line 74
    .line 75
    cmpg-float p3, p1, p4

    .line 76
    .line 77
    if-gez p3, :cond_3

    .line 78
    .line 79
    sub-float/2addr p4, p1

    .line 80
    div-float/2addr p4, v1

    .line 81
    float-to-int p3, p4

    .line 82
    int-to-float p3, p3

    .line 83
    mul-float/2addr p3, v1

    .line 84
    add-float/2addr p1, p3

    .line 85
    goto :goto_2

    .line 86
    :cond_3
    div-float p3, p1, v1

    .line 87
    .line 88
    float-to-int p3, p3

    .line 89
    int-to-float p3, p3

    .line 90
    mul-float/2addr p3, v1

    .line 91
    sub-float/2addr p1, p3

    .line 92
    :goto_2
    new-instance p3, Landroid/graphics/PointF;

    .line 93
    .line 94
    invoke-direct {p3, p2, p1}, Landroid/graphics/PointF;-><init>(FF)V

    .line 95
    .line 96
    .line 97
    new-instance p1, Landroid/graphics/Matrix;

    .line 98
    .line 99
    invoke-direct {p1}, Landroid/graphics/Matrix;-><init>()V

    .line 100
    .line 101
    .line 102
    iget p2, p3, Landroid/graphics/PointF;->x:F

    .line 103
    .line 104
    sub-float/2addr p2, v1

    .line 105
    iget p3, p3, Landroid/graphics/PointF;->y:F

    .line 106
    .line 107
    sub-float/2addr p3, v1

    .line 108
    invoke-virtual {p1, p2, p3}, Landroid/graphics/Matrix;->setTranslate(FF)V

    .line 109
    .line 110
    .line 111
    iget-object p2, v2, Lcom/zykj/blackboard/core/canvas/view/BackgroundView;->c:Landroid/graphics/Path;

    .line 112
    .line 113
    iget-object p3, v2, Lcom/zykj/blackboard/core/canvas/view/BackgroundView;->f:Landroid/graphics/Path;

    .line 114
    .line 115
    invoke-virtual {p2, p3}, Landroid/graphics/Path;->set(Landroid/graphics/Path;)V

    .line 116
    .line 117
    .line 118
    invoke-virtual {p2, p1}, Landroid/graphics/Path;->transform(Landroid/graphics/Matrix;)V

    .line 119
    .line 120
    .line 121
    return-void

    .line 122
    nop

    .line 123
    :array_0
    .array-data 4
        0x0
        0x0
    .end array-data
.end method

.method public final d(FFFFFLcom/zykj/blackboard/bean/BackgroundLineConfig$BackgroundLineType;)Landroid/graphics/Path;
    .locals 7

    .line 1
    new-instance v2, Landroid/graphics/Path;

    .line 2
    .line 3
    invoke-direct {v2}, Landroid/graphics/Path;-><init>()V

    .line 4
    .line 5
    .line 6
    sub-float/2addr p4, p3

    .line 7
    div-float/2addr p4, p5

    .line 8
    float-to-int p4, p4

    .line 9
    add-int/lit8 v1, p4, 0x3

    .line 10
    .line 11
    sub-float/2addr p2, p1

    .line 12
    div-float/2addr p2, p5

    .line 13
    float-to-int p2, p2

    .line 14
    add-int/lit8 p2, p2, 0x3

    .line 15
    .line 16
    int-to-float p4, p2

    .line 17
    mul-float v6, p4, p5

    .line 18
    .line 19
    int-to-float p4, v1

    .line 20
    mul-float/2addr p4, p5

    .line 21
    new-instance v0, Lcom/zykj/blackboard/core/canvas/view/BackgroundView$calculateOriginLinePath$vFun$1;

    .line 22
    .line 23
    move v3, p1

    .line 24
    move v4, p3

    .line 25
    move v5, p5

    .line 26
    invoke-direct/range {v0 .. v6}, Lcom/zykj/blackboard/core/canvas/view/BackgroundView$calculateOriginLinePath$vFun$1;-><init>(ILandroid/graphics/Path;FFFF)V

    .line 27
    .line 28
    .line 29
    move-object p1, v0

    .line 30
    new-instance v0, Lcom/zykj/blackboard/core/canvas/view/BackgroundView$calculateOriginLinePath$hFun$1;

    .line 31
    .line 32
    move v1, v5

    .line 33
    move v5, v4

    .line 34
    move v4, v1

    .line 35
    move v1, p2

    .line 36
    move v6, p4

    .line 37
    invoke-direct/range {v0 .. v6}, Lcom/zykj/blackboard/core/canvas/view/BackgroundView$calculateOriginLinePath$hFun$1;-><init>(ILandroid/graphics/Path;FFFF)V

    .line 38
    .line 39
    .line 40
    sget-object p2, Lcom/zykj/blackboard/core/canvas/view/BackgroundView$a;->a:[I

    .line 41
    .line 42
    invoke-virtual {p6}, Ljava/lang/Enum;->ordinal()I

    .line 43
    .line 44
    .line 45
    move-result p3

    .line 46
    aget p2, p2, p3

    .line 47
    .line 48
    const/4 p3, 0x1

    .line 49
    if-eq p2, p3, :cond_1

    .line 50
    .line 51
    const/4 p3, 0x2

    .line 52
    if-eq p2, p3, :cond_0

    .line 53
    .line 54
    return-object v2

    .line 55
    :cond_0
    invoke-interface {p1}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    invoke-interface {v0}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    .line 59
    .line 60
    .line 61
    return-object v2

    .line 62
    :cond_1
    invoke-interface {p1}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    return-object v2
.end method

.method public final e()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/blackboard/core/canvas/view/BackgroundView;->b:Landroid/graphics/Paint;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroid/graphics/Paint;->getColor()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    const/4 v0, 0x1

    .line 10
    return v0

    .line 11
    :cond_0
    const/4 v0, 0x0

    .line 12
    return v0
.end method

.method public getBackgroundLineConfig()Lcom/zykj/blackboard/bean/BackgroundLineConfig;
    .locals 5

    .line 1
    iget v0, p0, Lcom/zykj/blackboard/core/canvas/view/BackgroundView;->e:F

    .line 2
    .line 3
    iget-object v1, p0, Lcom/zykj/blackboard/core/canvas/view/BackgroundView;->b:Landroid/graphics/Paint;

    .line 4
    .line 5
    invoke-virtual {v1}, Landroid/graphics/Paint;->getColor()I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    iget-object v2, p0, Lcom/zykj/blackboard/core/canvas/view/BackgroundView;->d:Lcom/zykj/blackboard/bean/BackgroundLineConfig$BackgroundLineType;

    .line 10
    .line 11
    iget-object v3, p0, Lcom/zykj/blackboard/core/canvas/view/BackgroundView;->b:Landroid/graphics/Paint;

    .line 12
    .line 13
    invoke-virtual {v3}, Landroid/graphics/Paint;->getStrokeWidth()F

    .line 14
    .line 15
    .line 16
    move-result v3

    .line 17
    new-instance v4, Lcom/zykj/blackboard/bean/BackgroundLineConfig;

    .line 18
    .line 19
    invoke-direct {v4, v1, v0, v2, v3}, Lcom/zykj/blackboard/bean/BackgroundLineConfig;-><init>(IFLcom/zykj/blackboard/bean/BackgroundLineConfig$BackgroundLineType;F)V

    .line 20
    .line 21
    .line 22
    return-object v4
.end method

.method public getMyBackgroundColor()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/zykj/blackboard/core/canvas/view/BackgroundView;->a:I

    .line 2
    .line 3
    return v0
.end method

.method public onDraw(Landroid/graphics/Canvas;)V
    .locals 2

    .line 1
    invoke-super {p0, p1}, Landroid/view/View;->onDraw(Landroid/graphics/Canvas;)V

    .line 2
    .line 3
    .line 4
    if-eqz p1, :cond_0

    .line 5
    .line 6
    iget v0, p0, Lcom/zykj/blackboard/core/canvas/view/BackgroundView;->a:I

    .line 7
    .line 8
    invoke-virtual {p1, v0}, Landroid/graphics/Canvas;->drawColor(I)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/canvas/view/BackgroundView;->e()Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    iget-object v0, p0, Lcom/zykj/blackboard/core/canvas/view/BackgroundView;->c:Landroid/graphics/Path;

    .line 18
    .line 19
    iget-object v1, p0, Lcom/zykj/blackboard/core/canvas/view/BackgroundView;->b:Landroid/graphics/Paint;

    .line 20
    .line 21
    invoke-virtual {p1, v0, v1}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    .line 22
    .line 23
    .line 24
    :cond_0
    return-void
.end method

.method public refresh()V
    .locals 0

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->postInvalidateOnAnimation()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public setBackgroundLineConfig(Lcom/zykj/blackboard/bean/BackgroundLineConfig;)V
    .locals 11

    .line 1
    const-string v0, "backgroundLineConfig"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget v0, p0, Lcom/zykj/blackboard/core/canvas/view/BackgroundView;->e:F

    .line 7
    .line 8
    invoke-virtual {p1}, Lcom/zykj/blackboard/bean/BackgroundLineConfig;->b()F

    .line 9
    .line 10
    .line 11
    move-result v1

    .line 12
    cmpg-float v0, v0, v1

    .line 13
    .line 14
    const/4 v1, 0x1

    .line 15
    if-nez v0, :cond_0

    .line 16
    .line 17
    const/4 v0, 0x0

    .line 18
    goto :goto_0

    .line 19
    :cond_0
    invoke-virtual {p1}, Lcom/zykj/blackboard/bean/BackgroundLineConfig;->b()F

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    iput v0, p0, Lcom/zykj/blackboard/core/canvas/view/BackgroundView;->e:F

    .line 24
    .line 25
    move v0, v1

    .line 26
    :goto_0
    iget-object v2, p0, Lcom/zykj/blackboard/core/canvas/view/BackgroundView;->d:Lcom/zykj/blackboard/bean/BackgroundLineConfig$BackgroundLineType;

    .line 27
    .line 28
    invoke-virtual {p1}, Lcom/zykj/blackboard/bean/BackgroundLineConfig;->c()Lcom/zykj/blackboard/bean/BackgroundLineConfig$BackgroundLineType;

    .line 29
    .line 30
    .line 31
    move-result-object v3

    .line 32
    if-eq v2, v3, :cond_1

    .line 33
    .line 34
    invoke-virtual {p1}, Lcom/zykj/blackboard/bean/BackgroundLineConfig;->c()Lcom/zykj/blackboard/bean/BackgroundLineConfig$BackgroundLineType;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    iput-object v0, p0, Lcom/zykj/blackboard/core/canvas/view/BackgroundView;->d:Lcom/zykj/blackboard/bean/BackgroundLineConfig$BackgroundLineType;

    .line 39
    .line 40
    goto :goto_1

    .line 41
    :cond_1
    move v1, v0

    .line 42
    :goto_1
    iget-object v0, p0, Lcom/zykj/blackboard/core/canvas/view/BackgroundView;->b:Landroid/graphics/Paint;

    .line 43
    .line 44
    invoke-virtual {p1}, Lcom/zykj/blackboard/bean/BackgroundLineConfig;->a()I

    .line 45
    .line 46
    .line 47
    move-result v2

    .line 48
    invoke-virtual {v0, v2}, Landroid/graphics/Paint;->setColor(I)V

    .line 49
    .line 50
    .line 51
    iget-object v0, p0, Lcom/zykj/blackboard/core/canvas/view/BackgroundView;->b:Landroid/graphics/Paint;

    .line 52
    .line 53
    invoke-virtual {p1}, Lcom/zykj/blackboard/bean/BackgroundLineConfig;->d()F

    .line 54
    .line 55
    .line 56
    move-result p1

    .line 57
    invoke-virtual {v0, p1}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 58
    .line 59
    .line 60
    if-eqz v1, :cond_2

    .line 61
    .line 62
    const/16 v9, 0x3e

    .line 63
    .line 64
    const/4 v10, 0x0

    .line 65
    const/4 v3, 0x1

    .line 66
    const/4 v4, 0x0

    .line 67
    const/4 v5, 0x0

    .line 68
    const/4 v6, 0x0

    .line 69
    const/4 v7, 0x0

    .line 70
    const/4 v8, 0x0

    .line 71
    move-object v2, p0

    .line 72
    invoke-static/range {v2 .. v10}, Lcom/zykj/blackboard/core/canvas/view/BackgroundView;->c(Lcom/zykj/blackboard/core/canvas/view/BackgroundView;ZLandroid/graphics/Matrix;FFFLcom/zykj/blackboard/bean/BackgroundLineConfig$BackgroundLineType;ILjava/lang/Object;)V

    .line 73
    .line 74
    .line 75
    :cond_2
    return-void
.end method

.method public setMatrix(Landroid/graphics/Matrix;)V
    .locals 10

    .line 1
    const-string v0, "adapterMatrix"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/zykj/blackboard/core/canvas/view/BackgroundView;->h:Landroid/graphics/Matrix;

    .line 7
    .line 8
    invoke-virtual {v0, p1}, Landroid/graphics/Matrix;->set(Landroid/graphics/Matrix;)V

    .line 9
    .line 10
    .line 11
    new-instance v0, Ljava/lang/StringBuilder;

    .line 12
    .line 13
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 14
    .line 15
    .line 16
    const-string v1, "drawBackground fuck -> "

    .line 17
    .line 18
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 19
    .line 20
    .line 21
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 22
    .line 23
    .line 24
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    const-string v1, "bbbb"

    .line 29
    .line 30
    invoke-static {v1, v0}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 31
    .line 32
    .line 33
    invoke-static {p1}, Le5/m;->a(Landroid/graphics/Matrix;)F

    .line 34
    .line 35
    .line 36
    move-result p1

    .line 37
    iget v0, p0, Lcom/zykj/blackboard/core/canvas/view/BackgroundView;->g:F

    .line 38
    .line 39
    cmpg-float v0, v0, p1

    .line 40
    .line 41
    if-nez v0, :cond_0

    .line 42
    .line 43
    const/4 v0, 0x1

    .line 44
    goto :goto_0

    .line 45
    :cond_0
    const/4 v0, 0x0

    .line 46
    :goto_0
    xor-int/lit8 v2, v0, 0x1

    .line 47
    .line 48
    if-nez v0, :cond_1

    .line 49
    .line 50
    iput p1, p0, Lcom/zykj/blackboard/core/canvas/view/BackgroundView;->g:F

    .line 51
    .line 52
    :cond_1
    const/16 v8, 0x3e

    .line 53
    .line 54
    const/4 v9, 0x0

    .line 55
    const/4 v3, 0x0

    .line 56
    const/4 v4, 0x0

    .line 57
    const/4 v5, 0x0

    .line 58
    const/4 v6, 0x0

    .line 59
    const/4 v7, 0x0

    .line 60
    move-object v1, p0

    .line 61
    invoke-static/range {v1 .. v9}, Lcom/zykj/blackboard/core/canvas/view/BackgroundView;->c(Lcom/zykj/blackboard/core/canvas/view/BackgroundView;ZLandroid/graphics/Matrix;FFFLcom/zykj/blackboard/bean/BackgroundLineConfig$BackgroundLineType;ILjava/lang/Object;)V

    .line 62
    .line 63
    .line 64
    invoke-virtual {p0}, Landroid/view/View;->postInvalidateOnAnimation()V

    .line 65
    .line 66
    .line 67
    return-void
.end method

.method public setMyBackgroundColor(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/zykj/blackboard/core/canvas/view/BackgroundView;->a:I

    .line 2
    .line 3
    return-void
.end method
