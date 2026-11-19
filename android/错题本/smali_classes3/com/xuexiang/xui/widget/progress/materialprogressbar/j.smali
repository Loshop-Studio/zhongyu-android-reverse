.class public final Lcom/xuexiang/xui/widget/progress/materialprogressbar/j;
.super Lcom/xuexiang/xui/widget/progress/materialprogressbar/c;
.source "SourceFile"

# interfaces
.implements Lcom/xuexiang/xui/widget/progress/materialprogressbar/t;
.implements Lcom/xuexiang/xui/widget/progress/materialprogressbar/u;


# static fields
.field public static final p:Landroid/graphics/RectF;

.field public static final q:Landroid/graphics/RectF;

.field public static final r:Landroid/graphics/RectF;

.field public static final s:Lcom/xuexiang/xui/widget/progress/materialprogressbar/IndeterminateHorizontalProgressDrawable$RectTransformX;

.field public static final t:Lcom/xuexiang/xui/widget/progress/materialprogressbar/IndeterminateHorizontalProgressDrawable$RectTransformX;


# instance fields
.field public j:I

.field public k:I

.field public l:Z

.field public m:F

.field public n:Lcom/xuexiang/xui/widget/progress/materialprogressbar/IndeterminateHorizontalProgressDrawable$RectTransformX;

.field public o:Lcom/xuexiang/xui/widget/progress/materialprogressbar/IndeterminateHorizontalProgressDrawable$RectTransformX;


# direct methods
.method static constructor <clinit>()V
    .locals 7

    .line 1
    new-instance v0, Landroid/graphics/RectF;

    .line 2
    .line 3
    const/high16 v1, -0x3ccc0000    # -180.0f

    .line 4
    .line 5
    const/high16 v2, -0x40800000    # -1.0f

    .line 6
    .line 7
    const/high16 v3, 0x43340000    # 180.0f

    .line 8
    .line 9
    const/high16 v4, 0x3f800000    # 1.0f

    .line 10
    .line 11
    invoke-direct {v0, v1, v2, v3, v4}, Landroid/graphics/RectF;-><init>(FFFF)V

    .line 12
    .line 13
    .line 14
    sput-object v0, Lcom/xuexiang/xui/widget/progress/materialprogressbar/j;->p:Landroid/graphics/RectF;

    .line 15
    .line 16
    new-instance v0, Landroid/graphics/RectF;

    .line 17
    .line 18
    const/high16 v5, -0x3f800000    # -4.0f

    .line 19
    .line 20
    const/high16 v6, 0x40800000    # 4.0f

    .line 21
    .line 22
    invoke-direct {v0, v1, v5, v3, v6}, Landroid/graphics/RectF;-><init>(FFFF)V

    .line 23
    .line 24
    .line 25
    sput-object v0, Lcom/xuexiang/xui/widget/progress/materialprogressbar/j;->q:Landroid/graphics/RectF;

    .line 26
    .line 27
    new-instance v0, Landroid/graphics/RectF;

    .line 28
    .line 29
    const/high16 v1, -0x3cf00000    # -144.0f

    .line 30
    .line 31
    const/high16 v3, 0x43100000    # 144.0f

    .line 32
    .line 33
    invoke-direct {v0, v1, v2, v3, v4}, Landroid/graphics/RectF;-><init>(FFFF)V

    .line 34
    .line 35
    .line 36
    sput-object v0, Lcom/xuexiang/xui/widget/progress/materialprogressbar/j;->r:Landroid/graphics/RectF;

    .line 37
    .line 38
    new-instance v0, Lcom/xuexiang/xui/widget/progress/materialprogressbar/IndeterminateHorizontalProgressDrawable$RectTransformX;

    .line 39
    .line 40
    const v1, -0x3bfd599a    # -522.6f

    .line 41
    .line 42
    .line 43
    invoke-direct {v0, v1}, Lcom/xuexiang/xui/widget/progress/materialprogressbar/IndeterminateHorizontalProgressDrawable$RectTransformX;-><init>(F)V

    .line 44
    .line 45
    .line 46
    sput-object v0, Lcom/xuexiang/xui/widget/progress/materialprogressbar/j;->s:Lcom/xuexiang/xui/widget/progress/materialprogressbar/IndeterminateHorizontalProgressDrawable$RectTransformX;

    .line 47
    .line 48
    new-instance v0, Lcom/xuexiang/xui/widget/progress/materialprogressbar/IndeterminateHorizontalProgressDrawable$RectTransformX;

    .line 49
    .line 50
    const v1, -0x3cba6666    # -197.6f

    .line 51
    .line 52
    .line 53
    invoke-direct {v0, v1}, Lcom/xuexiang/xui/widget/progress/materialprogressbar/IndeterminateHorizontalProgressDrawable$RectTransformX;-><init>(F)V

    .line 54
    .line 55
    .line 56
    sput-object v0, Lcom/xuexiang/xui/widget/progress/materialprogressbar/j;->t:Lcom/xuexiang/xui/widget/progress/materialprogressbar/IndeterminateHorizontalProgressDrawable$RectTransformX;

    .line 57
    .line 58
    return-void
.end method


# virtual methods
.method public final a()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/xuexiang/xui/widget/progress/materialprogressbar/j;->l:Z

    .line 2
    .line 3
    return v0
.end method

.method public final b(Z)V
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/xuexiang/xui/widget/progress/materialprogressbar/j;->l:Z

    .line 2
    .line 3
    if-eq v0, p1, :cond_0

    .line 4
    .line 5
    iput-boolean p1, p0, Lcom/xuexiang/xui/widget/progress/materialprogressbar/j;->l:Z

    .line 6
    .line 7
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->invalidateSelf()V

    .line 8
    .line 9
    .line 10
    :cond_0
    return-void
.end method

.method public final e(Landroid/graphics/Canvas;Landroid/graphics/Paint;II)V
    .locals 4

    .line 1
    iget-boolean v0, p0, Lcom/xuexiang/xui/widget/progress/materialprogressbar/d;->h:Z

    .line 2
    .line 3
    sget-object v1, Lcom/xuexiang/xui/widget/progress/materialprogressbar/j;->p:Landroid/graphics/RectF;

    .line 4
    .line 5
    const/high16 v2, 0x40000000    # 2.0f

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    int-to-float p3, p3

    .line 10
    sget-object v0, Lcom/xuexiang/xui/widget/progress/materialprogressbar/j;->q:Landroid/graphics/RectF;

    .line 11
    .line 12
    invoke-virtual {v0}, Landroid/graphics/RectF;->width()F

    .line 13
    .line 14
    .line 15
    move-result v3

    .line 16
    div-float/2addr p3, v3

    .line 17
    int-to-float p4, p4

    .line 18
    invoke-virtual {v0}, Landroid/graphics/RectF;->height()F

    .line 19
    .line 20
    .line 21
    move-result v3

    .line 22
    div-float/2addr p4, v3

    .line 23
    invoke-virtual {p1, p3, p4}, Landroid/graphics/Canvas;->scale(FF)V

    .line 24
    .line 25
    .line 26
    invoke-virtual {v0}, Landroid/graphics/RectF;->width()F

    .line 27
    .line 28
    .line 29
    move-result p3

    .line 30
    div-float/2addr p3, v2

    .line 31
    invoke-virtual {v0}, Landroid/graphics/RectF;->height()F

    .line 32
    .line 33
    .line 34
    move-result p4

    .line 35
    div-float/2addr p4, v2

    .line 36
    invoke-virtual {p1, p3, p4}, Landroid/graphics/Canvas;->translate(FF)V

    .line 37
    .line 38
    .line 39
    goto :goto_0

    .line 40
    :cond_0
    int-to-float p3, p3

    .line 41
    invoke-virtual {v1}, Landroid/graphics/RectF;->width()F

    .line 42
    .line 43
    .line 44
    move-result v0

    .line 45
    div-float/2addr p3, v0

    .line 46
    int-to-float p4, p4

    .line 47
    invoke-virtual {v1}, Landroid/graphics/RectF;->height()F

    .line 48
    .line 49
    .line 50
    move-result v0

    .line 51
    div-float/2addr p4, v0

    .line 52
    invoke-virtual {p1, p3, p4}, Landroid/graphics/Canvas;->scale(FF)V

    .line 53
    .line 54
    .line 55
    invoke-virtual {v1}, Landroid/graphics/RectF;->width()F

    .line 56
    .line 57
    .line 58
    move-result p3

    .line 59
    div-float/2addr p3, v2

    .line 60
    invoke-virtual {v1}, Landroid/graphics/RectF;->height()F

    .line 61
    .line 62
    .line 63
    move-result p4

    .line 64
    div-float/2addr p4, v2

    .line 65
    invoke-virtual {p1, p3, p4}, Landroid/graphics/Canvas;->translate(FF)V

    .line 66
    .line 67
    .line 68
    :goto_0
    iget-boolean p3, p0, Lcom/xuexiang/xui/widget/progress/materialprogressbar/j;->l:Z

    .line 69
    .line 70
    if-eqz p3, :cond_1

    .line 71
    .line 72
    iget p3, p0, Lcom/xuexiang/xui/widget/progress/materialprogressbar/d;->a:I

    .line 73
    .line 74
    int-to-float p3, p3

    .line 75
    iget p4, p0, Lcom/xuexiang/xui/widget/progress/materialprogressbar/j;->m:F

    .line 76
    .line 77
    mul-float/2addr p3, p4

    .line 78
    invoke-static {p3}, Ljava/lang/Math;->round(F)I

    .line 79
    .line 80
    .line 81
    move-result p3

    .line 82
    invoke-virtual {p2, p3}, Landroid/graphics/Paint;->setAlpha(I)V

    .line 83
    .line 84
    .line 85
    invoke-virtual {p1, v1, p2}, Landroid/graphics/Canvas;->drawRect(Landroid/graphics/RectF;Landroid/graphics/Paint;)V

    .line 86
    .line 87
    .line 88
    iget p3, p0, Lcom/xuexiang/xui/widget/progress/materialprogressbar/d;->a:I

    .line 89
    .line 90
    invoke-virtual {p2, p3}, Landroid/graphics/Paint;->setAlpha(I)V

    .line 91
    .line 92
    .line 93
    :cond_1
    iget-object p3, p0, Lcom/xuexiang/xui/widget/progress/materialprogressbar/j;->o:Lcom/xuexiang/xui/widget/progress/materialprogressbar/IndeterminateHorizontalProgressDrawable$RectTransformX;

    .line 94
    .line 95
    invoke-virtual {p1}, Landroid/graphics/Canvas;->save()I

    .line 96
    .line 97
    .line 98
    move-result p4

    .line 99
    iget v0, p3, Lcom/xuexiang/xui/widget/progress/materialprogressbar/IndeterminateHorizontalProgressDrawable$RectTransformX;->a:F

    .line 100
    .line 101
    const/4 v1, 0x0

    .line 102
    invoke-virtual {p1, v0, v1}, Landroid/graphics/Canvas;->translate(FF)V

    .line 103
    .line 104
    .line 105
    iget p3, p3, Lcom/xuexiang/xui/widget/progress/materialprogressbar/IndeterminateHorizontalProgressDrawable$RectTransformX;->b:F

    .line 106
    .line 107
    const/high16 v0, 0x3f800000    # 1.0f

    .line 108
    .line 109
    invoke-virtual {p1, p3, v0}, Landroid/graphics/Canvas;->scale(FF)V

    .line 110
    .line 111
    .line 112
    sget-object p3, Lcom/xuexiang/xui/widget/progress/materialprogressbar/j;->r:Landroid/graphics/RectF;

    .line 113
    .line 114
    invoke-virtual {p1, p3, p2}, Landroid/graphics/Canvas;->drawRect(Landroid/graphics/RectF;Landroid/graphics/Paint;)V

    .line 115
    .line 116
    .line 117
    invoke-virtual {p1, p4}, Landroid/graphics/Canvas;->restoreToCount(I)V

    .line 118
    .line 119
    .line 120
    iget-object p4, p0, Lcom/xuexiang/xui/widget/progress/materialprogressbar/j;->n:Lcom/xuexiang/xui/widget/progress/materialprogressbar/IndeterminateHorizontalProgressDrawable$RectTransformX;

    .line 121
    .line 122
    invoke-virtual {p1}, Landroid/graphics/Canvas;->save()I

    .line 123
    .line 124
    .line 125
    move-result v2

    .line 126
    iget v3, p4, Lcom/xuexiang/xui/widget/progress/materialprogressbar/IndeterminateHorizontalProgressDrawable$RectTransformX;->a:F

    .line 127
    .line 128
    invoke-virtual {p1, v3, v1}, Landroid/graphics/Canvas;->translate(FF)V

    .line 129
    .line 130
    .line 131
    iget p4, p4, Lcom/xuexiang/xui/widget/progress/materialprogressbar/IndeterminateHorizontalProgressDrawable$RectTransformX;->b:F

    .line 132
    .line 133
    invoke-virtual {p1, p4, v0}, Landroid/graphics/Canvas;->scale(FF)V

    .line 134
    .line 135
    .line 136
    invoke-virtual {p1, p3, p2}, Landroid/graphics/Canvas;->drawRect(Landroid/graphics/RectF;Landroid/graphics/Paint;)V

    .line 137
    .line 138
    .line 139
    invoke-virtual {p1, v2}, Landroid/graphics/Canvas;->restoreToCount(I)V

    .line 140
    .line 141
    .line 142
    return-void
.end method

.method public final f(Landroid/graphics/Paint;)V
    .locals 1

    .line 1
    sget-object v0, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    .line 2
    .line 3
    invoke-virtual {p1, v0}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 4
    .line 5
    .line 6
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
    iget v0, p0, Lcom/xuexiang/xui/widget/progress/materialprogressbar/j;->k:I

    .line 6
    .line 7
    return v0

    .line 8
    :cond_0
    iget v0, p0, Lcom/xuexiang/xui/widget/progress/materialprogressbar/j;->j:I

    .line 9
    .line 10
    return v0
.end method
