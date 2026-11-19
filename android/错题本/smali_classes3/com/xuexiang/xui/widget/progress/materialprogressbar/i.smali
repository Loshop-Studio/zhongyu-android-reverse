.class public final Lcom/xuexiang/xui/widget/progress/materialprogressbar/i;
.super Lcom/xuexiang/xui/widget/progress/materialprogressbar/c;
.source "SourceFile"

# interfaces
.implements Lcom/xuexiang/xui/widget/progress/materialprogressbar/t;


# static fields
.field public static final n:Landroid/graphics/RectF;

.field public static final o:Landroid/graphics/RectF;

.field public static final p:Landroid/graphics/RectF;


# instance fields
.field public j:I

.field public k:I

.field public l:Lcom/xuexiang/xui/widget/progress/materialprogressbar/IndeterminateCircularProgressDrawable$RingPathTransform;

.field public m:Lcom/xuexiang/xui/widget/progress/materialprogressbar/IndeterminateCircularProgressDrawable$RingRotation;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, Landroid/graphics/RectF;

    .line 2
    .line 3
    const/high16 v1, -0x3e580000    # -21.0f

    .line 4
    .line 5
    const/high16 v2, 0x41a80000    # 21.0f

    .line 6
    .line 7
    invoke-direct {v0, v1, v1, v2, v2}, Landroid/graphics/RectF;-><init>(FFFF)V

    .line 8
    .line 9
    .line 10
    sput-object v0, Lcom/xuexiang/xui/widget/progress/materialprogressbar/i;->n:Landroid/graphics/RectF;

    .line 11
    .line 12
    new-instance v0, Landroid/graphics/RectF;

    .line 13
    .line 14
    const/high16 v1, -0x3e400000    # -24.0f

    .line 15
    .line 16
    const/high16 v2, 0x41c00000    # 24.0f

    .line 17
    .line 18
    invoke-direct {v0, v1, v1, v2, v2}, Landroid/graphics/RectF;-><init>(FFFF)V

    .line 19
    .line 20
    .line 21
    sput-object v0, Lcom/xuexiang/xui/widget/progress/materialprogressbar/i;->o:Landroid/graphics/RectF;

    .line 22
    .line 23
    new-instance v0, Landroid/graphics/RectF;

    .line 24
    .line 25
    const/high16 v1, -0x3e680000    # -19.0f

    .line 26
    .line 27
    const/high16 v2, 0x41980000    # 19.0f

    .line 28
    .line 29
    invoke-direct {v0, v1, v1, v2, v2}, Landroid/graphics/RectF;-><init>(FFFF)V

    .line 30
    .line 31
    .line 32
    sput-object v0, Lcom/xuexiang/xui/widget/progress/materialprogressbar/i;->p:Landroid/graphics/RectF;

    .line 33
    .line 34
    return-void
.end method


# virtual methods
.method public final e(Landroid/graphics/Canvas;Landroid/graphics/Paint;II)V
    .locals 10

    .line 1
    iget-boolean v0, p0, Lcom/xuexiang/xui/widget/progress/materialprogressbar/d;->h:Z

    .line 2
    .line 3
    const/high16 v1, 0x40000000    # 2.0f

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    int-to-float p3, p3

    .line 8
    sget-object v0, Lcom/xuexiang/xui/widget/progress/materialprogressbar/i;->o:Landroid/graphics/RectF;

    .line 9
    .line 10
    invoke-virtual {v0}, Landroid/graphics/RectF;->width()F

    .line 11
    .line 12
    .line 13
    move-result v2

    .line 14
    div-float/2addr p3, v2

    .line 15
    int-to-float p4, p4

    .line 16
    invoke-virtual {v0}, Landroid/graphics/RectF;->height()F

    .line 17
    .line 18
    .line 19
    move-result v2

    .line 20
    div-float/2addr p4, v2

    .line 21
    invoke-virtual {p1, p3, p4}, Landroid/graphics/Canvas;->scale(FF)V

    .line 22
    .line 23
    .line 24
    invoke-virtual {v0}, Landroid/graphics/RectF;->width()F

    .line 25
    .line 26
    .line 27
    move-result p3

    .line 28
    div-float/2addr p3, v1

    .line 29
    invoke-virtual {v0}, Landroid/graphics/RectF;->height()F

    .line 30
    .line 31
    .line 32
    move-result p4

    .line 33
    div-float/2addr p4, v1

    .line 34
    invoke-virtual {p1, p3, p4}, Landroid/graphics/Canvas;->translate(FF)V

    .line 35
    .line 36
    .line 37
    goto :goto_0

    .line 38
    :cond_0
    int-to-float p3, p3

    .line 39
    sget-object v0, Lcom/xuexiang/xui/widget/progress/materialprogressbar/i;->n:Landroid/graphics/RectF;

    .line 40
    .line 41
    invoke-virtual {v0}, Landroid/graphics/RectF;->width()F

    .line 42
    .line 43
    .line 44
    move-result v2

    .line 45
    div-float/2addr p3, v2

    .line 46
    int-to-float p4, p4

    .line 47
    invoke-virtual {v0}, Landroid/graphics/RectF;->height()F

    .line 48
    .line 49
    .line 50
    move-result v2

    .line 51
    div-float/2addr p4, v2

    .line 52
    invoke-virtual {p1, p3, p4}, Landroid/graphics/Canvas;->scale(FF)V

    .line 53
    .line 54
    .line 55
    invoke-virtual {v0}, Landroid/graphics/RectF;->width()F

    .line 56
    .line 57
    .line 58
    move-result p3

    .line 59
    div-float/2addr p3, v1

    .line 60
    invoke-virtual {v0}, Landroid/graphics/RectF;->height()F

    .line 61
    .line 62
    .line 63
    move-result p4

    .line 64
    div-float/2addr p4, v1

    .line 65
    invoke-virtual {p1, p3, p4}, Landroid/graphics/Canvas;->translate(FF)V

    .line 66
    .line 67
    .line 68
    :goto_0
    invoke-virtual {p1}, Landroid/graphics/Canvas;->save()I

    .line 69
    .line 70
    .line 71
    move-result p3

    .line 72
    iget-object p4, p0, Lcom/xuexiang/xui/widget/progress/materialprogressbar/i;->m:Lcom/xuexiang/xui/widget/progress/materialprogressbar/IndeterminateCircularProgressDrawable$RingRotation;

    .line 73
    .line 74
    iget p4, p4, Lcom/xuexiang/xui/widget/progress/materialprogressbar/IndeterminateCircularProgressDrawable$RingRotation;->a:F

    .line 75
    .line 76
    invoke-virtual {p1, p4}, Landroid/graphics/Canvas;->rotate(F)V

    .line 77
    .line 78
    .line 79
    iget-object p4, p0, Lcom/xuexiang/xui/widget/progress/materialprogressbar/i;->l:Lcom/xuexiang/xui/widget/progress/materialprogressbar/IndeterminateCircularProgressDrawable$RingPathTransform;

    .line 80
    .line 81
    iget v0, p4, Lcom/xuexiang/xui/widget/progress/materialprogressbar/IndeterminateCircularProgressDrawable$RingPathTransform;->c:F

    .line 82
    .line 83
    iget v1, p4, Lcom/xuexiang/xui/widget/progress/materialprogressbar/IndeterminateCircularProgressDrawable$RingPathTransform;->a:F

    .line 84
    .line 85
    add-float/2addr v0, v1

    .line 86
    const/high16 v2, 0x43b40000    # 360.0f

    .line 87
    .line 88
    mul-float/2addr v0, v2

    .line 89
    const/high16 v3, -0x3d4c0000    # -90.0f

    .line 90
    .line 91
    add-float v6, v0, v3

    .line 92
    .line 93
    iget p4, p4, Lcom/xuexiang/xui/widget/progress/materialprogressbar/IndeterminateCircularProgressDrawable$RingPathTransform;->b:F

    .line 94
    .line 95
    sub-float/2addr p4, v1

    .line 96
    mul-float v7, p4, v2

    .line 97
    .line 98
    sget-object v5, Lcom/xuexiang/xui/widget/progress/materialprogressbar/i;->p:Landroid/graphics/RectF;

    .line 99
    .line 100
    const/4 v8, 0x0

    .line 101
    move-object v4, p1

    .line 102
    move-object v9, p2

    .line 103
    invoke-virtual/range {v4 .. v9}, Landroid/graphics/Canvas;->drawArc(Landroid/graphics/RectF;FFZLandroid/graphics/Paint;)V

    .line 104
    .line 105
    .line 106
    invoke-virtual {v4, p3}, Landroid/graphics/Canvas;->restoreToCount(I)V

    .line 107
    .line 108
    .line 109
    return-void
.end method

.method public final f(Landroid/graphics/Paint;)V
    .locals 1

    .line 1
    sget-object v0, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    .line 2
    .line 3
    invoke-virtual {p1, v0}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 4
    .line 5
    .line 6
    const/high16 v0, 0x40800000    # 4.0f

    .line 7
    .line 8
    invoke-virtual {p1, v0}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 9
    .line 10
    .line 11
    sget-object v0, Landroid/graphics/Paint$Cap;->SQUARE:Landroid/graphics/Paint$Cap;

    .line 12
    .line 13
    invoke-virtual {p1, v0}, Landroid/graphics/Paint;->setStrokeCap(Landroid/graphics/Paint$Cap;)V

    .line 14
    .line 15
    .line 16
    sget-object v0, Landroid/graphics/Paint$Join;->MITER:Landroid/graphics/Paint$Join;

    .line 17
    .line 18
    invoke-virtual {p1, v0}, Landroid/graphics/Paint;->setStrokeJoin(Landroid/graphics/Paint$Join;)V

    .line 19
    .line 20
    .line 21
    return-void
.end method

.method public final getIntrinsicHeight()I
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/xuexiang/xui/widget/progress/materialprogressbar/d;->h:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget v0, p0, Lcom/xuexiang/xui/widget/progress/materialprogressbar/i;->k:I

    .line 6
    .line 7
    return v0

    .line 8
    :cond_0
    iget v0, p0, Lcom/xuexiang/xui/widget/progress/materialprogressbar/i;->j:I

    .line 9
    .line 10
    return v0
.end method

.method public final getIntrinsicWidth()I
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/xuexiang/xui/widget/progress/materialprogressbar/d;->h:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget v0, p0, Lcom/xuexiang/xui/widget/progress/materialprogressbar/i;->k:I

    .line 6
    .line 7
    return v0

    .line 8
    :cond_0
    iget v0, p0, Lcom/xuexiang/xui/widget/progress/materialprogressbar/i;->j:I

    .line 9
    .line 10
    return v0
.end method
