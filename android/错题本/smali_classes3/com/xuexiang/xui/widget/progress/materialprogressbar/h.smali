.class public final Lcom/xuexiang/xui/widget/progress/materialprogressbar/h;
.super Lcom/xuexiang/xui/widget/progress/materialprogressbar/d;
.source "SourceFile"

# interfaces
.implements Lcom/xuexiang/xui/widget/progress/materialprogressbar/u;


# static fields
.field public static final m:Landroid/graphics/RectF;

.field public static final n:Landroid/graphics/RectF;


# instance fields
.field public final i:I

.field public final j:I

.field public final synthetic k:I

.field public l:Z


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 1
    new-instance v0, Landroid/graphics/RectF;

    .line 2
    .line 3
    const/high16 v1, 0x3f800000    # 1.0f

    .line 4
    .line 5
    const/high16 v2, -0x3ccc0000    # -180.0f

    .line 6
    .line 7
    const/high16 v3, -0x40800000    # -1.0f

    .line 8
    .line 9
    const/high16 v4, 0x43340000    # 180.0f

    .line 10
    .line 11
    invoke-direct {v0, v2, v3, v4, v1}, Landroid/graphics/RectF;-><init>(FFFF)V

    .line 12
    .line 13
    .line 14
    sput-object v0, Lcom/xuexiang/xui/widget/progress/materialprogressbar/h;->m:Landroid/graphics/RectF;

    .line 15
    .line 16
    new-instance v0, Landroid/graphics/RectF;

    .line 17
    .line 18
    const/high16 v1, -0x3f800000    # -4.0f

    .line 19
    .line 20
    const/high16 v3, 0x40800000    # 4.0f

    .line 21
    .line 22
    invoke-direct {v0, v2, v1, v4, v3}, Landroid/graphics/RectF;-><init>(FFFF)V

    .line 23
    .line 24
    .line 25
    sput-object v0, Lcom/xuexiang/xui/widget/progress/materialprogressbar/h;->n:Landroid/graphics/RectF;

    .line 26
    .line 27
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;I)V
    .locals 0

    .line 1
    iput p2, p0, Lcom/xuexiang/xui/widget/progress/materialprogressbar/h;->k:I

    .line 2
    .line 3
    invoke-direct {p0}, Lcom/xuexiang/xui/widget/progress/materialprogressbar/d;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    invoke-virtual {p1}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    iget p1, p1, Landroid/util/DisplayMetrics;->density:F

    .line 15
    .line 16
    const/high16 p2, 0x40800000    # 4.0f

    .line 17
    .line 18
    mul-float/2addr p2, p1

    .line 19
    invoke-static {p2}, Ljava/lang/Math;->round(F)I

    .line 20
    .line 21
    .line 22
    move-result p2

    .line 23
    iput p2, p0, Lcom/xuexiang/xui/widget/progress/materialprogressbar/h;->i:I

    .line 24
    .line 25
    const/high16 p2, 0x41800000    # 16.0f

    .line 26
    .line 27
    mul-float/2addr p1, p2

    .line 28
    invoke-static {p1}, Ljava/lang/Math;->round(F)I

    .line 29
    .line 30
    .line 31
    move-result p1

    .line 32
    iput p1, p0, Lcom/xuexiang/xui/widget/progress/materialprogressbar/h;->j:I

    .line 33
    .line 34
    return-void
.end method


# virtual methods
.method public final a()Z
    .locals 1

    .line 1
    iget v0, p0, Lcom/xuexiang/xui/widget/progress/materialprogressbar/h;->k:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-boolean v0, p0, Lcom/xuexiang/xui/widget/progress/materialprogressbar/h;->l:Z

    .line 7
    .line 8
    return v0

    .line 9
    :pswitch_0
    iget-boolean v0, p0, Lcom/xuexiang/xui/widget/progress/materialprogressbar/h;->l:Z

    .line 10
    .line 11
    return v0

    .line 12
    nop

    .line 13
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final b(Z)V
    .locals 1

    .line 1
    iget v0, p0, Lcom/xuexiang/xui/widget/progress/materialprogressbar/h;->k:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-boolean v0, p0, Lcom/xuexiang/xui/widget/progress/materialprogressbar/h;->l:Z

    .line 7
    .line 8
    if-eq v0, p1, :cond_0

    .line 9
    .line 10
    iput-boolean p1, p0, Lcom/xuexiang/xui/widget/progress/materialprogressbar/h;->l:Z

    .line 11
    .line 12
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->invalidateSelf()V

    .line 13
    .line 14
    .line 15
    :cond_0
    return-void

    .line 16
    :pswitch_0
    iget-boolean v0, p0, Lcom/xuexiang/xui/widget/progress/materialprogressbar/h;->l:Z

    .line 17
    .line 18
    if-eq v0, p1, :cond_1

    .line 19
    .line 20
    iput-boolean p1, p0, Lcom/xuexiang/xui/widget/progress/materialprogressbar/h;->l:Z

    .line 21
    .line 22
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->invalidateSelf()V

    .line 23
    .line 24
    .line 25
    :cond_1
    return-void

    .line 26
    nop

    .line 27
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public draw(Landroid/graphics/Canvas;)V
    .locals 1

    .line 1
    iget v0, p0, Lcom/xuexiang/xui/widget/progress/materialprogressbar/h;->k:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-super {p0, p1}, Lcom/xuexiang/xui/widget/progress/materialprogressbar/d;->draw(Landroid/graphics/Canvas;)V

    .line 7
    .line 8
    .line 9
    return-void

    .line 10
    :pswitch_0
    iget-boolean v0, p0, Lcom/xuexiang/xui/widget/progress/materialprogressbar/h;->l:Z

    .line 11
    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    invoke-super {p0, p1}, Lcom/xuexiang/xui/widget/progress/materialprogressbar/d;->draw(Landroid/graphics/Canvas;)V

    .line 15
    .line 16
    .line 17
    :cond_0
    return-void

    .line 18
    nop

    .line 19
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final e(Landroid/graphics/Canvas;Landroid/graphics/Paint;II)V
    .locals 4

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
    sget-object v0, Lcom/xuexiang/xui/widget/progress/materialprogressbar/h;->n:Landroid/graphics/RectF;

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
    sget-object v0, Lcom/xuexiang/xui/widget/progress/materialprogressbar/h;->m:Landroid/graphics/RectF;

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
    iget p3, p0, Lcom/xuexiang/xui/widget/progress/materialprogressbar/h;->k:I

    .line 69
    .line 70
    packed-switch p3, :pswitch_data_0

    .line 71
    .line 72
    .line 73
    sget-object p3, Lcom/xuexiang/xui/widget/progress/materialprogressbar/h;->m:Landroid/graphics/RectF;

    .line 74
    .line 75
    invoke-virtual {p1, p3, p2}, Landroid/graphics/Canvas;->drawRect(Landroid/graphics/RectF;Landroid/graphics/Paint;)V

    .line 76
    .line 77
    .line 78
    goto :goto_1

    .line 79
    :pswitch_0
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->getLevel()I

    .line 80
    .line 81
    .line 82
    move-result p3

    .line 83
    if-nez p3, :cond_1

    .line 84
    .line 85
    goto :goto_1

    .line 86
    :cond_1
    invoke-virtual {p1}, Landroid/graphics/Canvas;->save()I

    .line 87
    .line 88
    .line 89
    move-result p4

    .line 90
    int-to-float p3, p3

    .line 91
    const v0, 0x461c4000    # 10000.0f

    .line 92
    .line 93
    .line 94
    div-float/2addr p3, v0

    .line 95
    sget-object v0, Lcom/xuexiang/xui/widget/progress/materialprogressbar/h;->m:Landroid/graphics/RectF;

    .line 96
    .line 97
    iget v1, v0, Landroid/graphics/RectF;->left:F

    .line 98
    .line 99
    const/4 v2, 0x0

    .line 100
    const/high16 v3, 0x3f800000    # 1.0f

    .line 101
    .line 102
    invoke-virtual {p1, p3, v3, v1, v2}, Landroid/graphics/Canvas;->scale(FFFF)V

    .line 103
    .line 104
    .line 105
    invoke-virtual {p1, v0, p2}, Landroid/graphics/Canvas;->drawRect(Landroid/graphics/RectF;Landroid/graphics/Paint;)V

    .line 106
    .line 107
    .line 108
    iget-boolean p3, p0, Lcom/xuexiang/xui/widget/progress/materialprogressbar/h;->l:Z

    .line 109
    .line 110
    if-eqz p3, :cond_2

    .line 111
    .line 112
    invoke-virtual {p1, v0, p2}, Landroid/graphics/Canvas;->drawRect(Landroid/graphics/RectF;Landroid/graphics/Paint;)V

    .line 113
    .line 114
    .line 115
    :cond_2
    invoke-virtual {p1, p4}, Landroid/graphics/Canvas;->restoreToCount(I)V

    .line 116
    .line 117
    .line 118
    :goto_1
    return-void

    .line 119
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch
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
    iget v0, p0, Lcom/xuexiang/xui/widget/progress/materialprogressbar/h;->j:I

    .line 6
    .line 7
    return v0

    .line 8
    :cond_0
    iget v0, p0, Lcom/xuexiang/xui/widget/progress/materialprogressbar/h;->i:I

    .line 9
    .line 10
    return v0
.end method

.method public onLevelChange(I)Z
    .locals 1

    .line 1
    iget v0, p0, Lcom/xuexiang/xui/widget/progress/materialprogressbar/h;->k:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-super {p0, p1}, Landroid/graphics/drawable/Drawable;->onLevelChange(I)Z

    .line 7
    .line 8
    .line 9
    move-result p1

    .line 10
    return p1

    .line 11
    :pswitch_0
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->invalidateSelf()V

    .line 12
    .line 13
    .line 14
    const/4 p1, 0x1

    .line 15
    return p1

    .line 16
    nop

    .line 17
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch
.end method
