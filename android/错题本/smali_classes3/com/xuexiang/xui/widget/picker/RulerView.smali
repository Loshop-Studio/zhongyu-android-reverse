.class public Lcom/xuexiang/xui/widget/picker/RulerView;
.super Landroid/view/View;
.source "SourceFile"

# interfaces
.implements Lio/github/inflationx/calligraphy3/HasTypeface;


# instance fields
.field public a:I

.field public b:I

.field public c:I

.field public d:I

.field public e:I

.field public f:I

.field public g:F

.field public h:I

.field public i:Z

.field public final j:F

.field public k:Landroid/animation/ValueAnimator;

.field public final l:Landroid/view/VelocityTracker;

.field public final m:Ljava/lang/String;

.field public n:I

.field public o:I

.field public p:F

.field public q:F

.field public r:F


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    const/4 v0, 0x0

    .line 1
    invoke-direct {p0, p1, v0}, Lcom/xuexiang/xui/widget/picker/RulerView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1
    .param p2    # Landroid/util/AttributeSet;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param

    .line 2
    sget v0, Lcom/xuexiang/xui/R$attr;->RulerViewStyle:I

    invoke-direct {p0, p1, p2, v0}, Lcom/xuexiang/xui/widget/picker/RulerView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 4
    .param p2    # Landroid/util/AttributeSet;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param

    .line 3
    invoke-direct {p0, p1, p2, p3}, Landroid/view/View;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    const/4 v0, 0x1

    .line 4
    iput v0, p0, Lcom/xuexiang/xui/widget/picker/RulerView;->a:I

    const/16 v1, 0x32

    .line 5
    iput v1, p0, Lcom/xuexiang/xui/widget/picker/RulerView;->b:I

    const/16 v1, 0xc

    .line 6
    iput v1, p0, Lcom/xuexiang/xui/widget/picker/RulerView;->c:I

    const/16 v1, 0xa

    .line 7
    iput v1, p0, Lcom/xuexiang/xui/widget/picker/RulerView;->d:I

    .line 8
    iput v1, p0, Lcom/xuexiang/xui/widget/picker/RulerView;->e:I

    const/4 v1, 0x0

    .line 9
    iput v1, p0, Lcom/xuexiang/xui/widget/picker/RulerView;->f:I

    const/high16 v2, 0x42480000    # 50.0f

    .line 10
    iput v2, p0, Lcom/xuexiang/xui/widget/picker/RulerView;->g:F

    const/16 v3, 0x64

    .line 11
    iput v3, p0, Lcom/xuexiang/xui/widget/picker/RulerView;->h:I

    .line 12
    iput-boolean v0, p0, Lcom/xuexiang/xui/widget/picker/RulerView;->i:Z

    .line 13
    iput v2, p0, Lcom/xuexiang/xui/widget/picker/RulerView;->j:F

    .line 14
    invoke-static {}, Landroid/view/VelocityTracker;->obtain()Landroid/view/VelocityTracker;

    move-result-object v2

    iput-object v2, p0, Lcom/xuexiang/xui/widget/picker/RulerView;->l:Landroid/view/VelocityTracker;

    .line 15
    iget v2, p0, Lcom/xuexiang/xui/widget/picker/RulerView;->g:F

    invoke-static {v2}, Ljava/lang/String;->valueOf(F)Ljava/lang/String;

    move-result-object v2

    iput-object v2, p0, Lcom/xuexiang/xui/widget/picker/RulerView;->m:Ljava/lang/String;

    const/4 v2, 0x0

    .line 16
    iput v2, p0, Lcom/xuexiang/xui/widget/picker/RulerView;->q:F

    .line 17
    iput v2, p0, Lcom/xuexiang/xui/widget/picker/RulerView;->r:F

    .line 18
    sget-object v2, Lcom/xuexiang/xui/R$styleable;->RulerView:[I

    invoke-virtual {p1, p2, v2, p3, v1}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    move-result-object p1

    .line 19
    sget p2, Lcom/xuexiang/xui/R$styleable;->RulerView_rv_scaleLimit:I

    iget p3, p0, Lcom/xuexiang/xui/widget/picker/RulerView;->a:I

    invoke-virtual {p1, p2, p3}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result p2

    iput p2, p0, Lcom/xuexiang/xui/widget/picker/RulerView;->a:I

    .line 20
    sget p2, Lcom/xuexiang/xui/R$styleable;->RulerView_rv_rulerHeight:I

    iget p3, p0, Lcom/xuexiang/xui/widget/picker/RulerView;->b:I

    int-to-float p3, p3

    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v1

    invoke-static {v0, p3, v1}, Landroid/util/TypedValue;->applyDimension(IFLandroid/util/DisplayMetrics;)F

    move-result p3

    float-to-int p3, p3

    invoke-virtual {p1, p2, p3}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result p2

    iput p2, p0, Lcom/xuexiang/xui/widget/picker/RulerView;->b:I

    .line 21
    sget p2, Lcom/xuexiang/xui/R$styleable;->RulerView_rv_rulerToResultGap:I

    iget p3, p0, Lcom/xuexiang/xui/widget/picker/RulerView;->c:I

    int-to-float p3, p3

    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v1

    invoke-static {v0, p3, v1}, Landroid/util/TypedValue;->applyDimension(IFLandroid/util/DisplayMetrics;)F

    move-result p3

    float-to-int p3, p3

    invoke-virtual {p1, p2, p3}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result p2

    iput p2, p0, Lcom/xuexiang/xui/widget/picker/RulerView;->c:I

    .line 22
    sget p2, Lcom/xuexiang/xui/R$styleable;->RulerView_rv_scaleCount:I

    iget p3, p0, Lcom/xuexiang/xui/widget/picker/RulerView;->d:I

    invoke-virtual {p1, p2, p3}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result p2

    iput p2, p0, Lcom/xuexiang/xui/widget/picker/RulerView;->d:I

    .line 23
    sget p2, Lcom/xuexiang/xui/R$styleable;->RulerView_rv_scaleGap:I

    iget p3, p0, Lcom/xuexiang/xui/widget/picker/RulerView;->e:I

    int-to-float p3, p3

    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v1

    invoke-static {v0, p3, v1}, Landroid/util/TypedValue;->applyDimension(IFLandroid/util/DisplayMetrics;)F

    move-result p3

    float-to-int p3, p3

    invoke-virtual {p1, p2, p3}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result p2

    iput p2, p0, Lcom/xuexiang/xui/widget/picker/RulerView;->e:I

    .line 24
    sget p2, Lcom/xuexiang/xui/R$styleable;->RulerView_rv_minScale:I

    iget p3, p0, Lcom/xuexiang/xui/widget/picker/RulerView;->f:I

    invoke-virtual {p1, p2, p3}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result p2

    iget p3, p0, Lcom/xuexiang/xui/widget/picker/RulerView;->a:I

    div-int/2addr p2, p3

    iput p2, p0, Lcom/xuexiang/xui/widget/picker/RulerView;->f:I

    .line 25
    sget p2, Lcom/xuexiang/xui/R$styleable;->RulerView_rv_firstScale:I

    iget p3, p0, Lcom/xuexiang/xui/widget/picker/RulerView;->g:F

    invoke-virtual {p1, p2, p3}, Landroid/content/res/TypedArray;->getFloat(IF)F

    move-result p2

    iget p3, p0, Lcom/xuexiang/xui/widget/picker/RulerView;->a:I

    int-to-float p3, p3

    div-float/2addr p2, p3

    iput p2, p0, Lcom/xuexiang/xui/widget/picker/RulerView;->g:F

    .line 26
    sget p2, Lcom/xuexiang/xui/R$styleable;->RulerView_rv_maxScale:I

    iget p3, p0, Lcom/xuexiang/xui/widget/picker/RulerView;->h:I

    invoke-virtual {p1, p2, p3}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result p1

    iget p2, p0, Lcom/xuexiang/xui/widget/picker/RulerView;->a:I

    div-int/2addr p1, p2

    iput p1, p0, Lcom/xuexiang/xui/widget/picker/RulerView;->h:I

    .line 27
    invoke-static {}, Lt1/a;->a()V

    const/4 p1, 0x0

    throw p1
.end method


# virtual methods
.method public final a(F)F
    .locals 3

    .line 1
    iget v0, p0, Lcom/xuexiang/xui/widget/picker/RulerView;->o:I

    .line 2
    .line 3
    int-to-float v0, v0

    .line 4
    const/high16 v1, 0x40000000    # 2.0f

    .line 5
    .line 6
    div-float/2addr v0, v1

    .line 7
    iget v1, p0, Lcom/xuexiang/xui/widget/picker/RulerView;->e:I

    .line 8
    .line 9
    iget v2, p0, Lcom/xuexiang/xui/widget/picker/RulerView;->d:I

    .line 10
    .line 11
    mul-int/2addr v1, v2

    .line 12
    int-to-float v1, v1

    .line 13
    iget v2, p0, Lcom/xuexiang/xui/widget/picker/RulerView;->f:I

    .line 14
    .line 15
    int-to-float v2, v2

    .line 16
    sub-float/2addr p1, v2

    .line 17
    mul-float/2addr p1, v1

    .line 18
    sub-float/2addr v0, p1

    .line 19
    return v0
.end method

.method public getCurrentValue()F
    .locals 1

    .line 1
    iget v0, p0, Lcom/xuexiang/xui/widget/picker/RulerView;->j:F

    .line 2
    .line 3
    return v0
.end method

.method public getSelectValue()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/picker/RulerView;->m:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public final onDraw(Landroid/graphics/Canvas;)V
    .locals 0

    .line 1
    const/4 p1, 0x0

    .line 2
    throw p1
.end method

.method public final onMeasure(II)V
    .locals 2

    .line 1
    invoke-super {p0, p1, p2}, Landroid/view/View;->onMeasure(II)V

    .line 2
    .line 3
    .line 4
    invoke-static {p2}, Landroid/view/View$MeasureSpec;->getMode(I)I

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    invoke-static {p2}, Landroid/view/View$MeasureSpec;->getSize(I)I

    .line 9
    .line 10
    .line 11
    move-result p2

    .line 12
    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getSize(I)I

    .line 13
    .line 14
    .line 15
    move-result p1

    .line 16
    const/high16 v1, -0x80000000

    .line 17
    .line 18
    if-eq v0, v1, :cond_1

    .line 19
    .line 20
    if-eqz v0, :cond_0

    .line 21
    .line 22
    const/high16 v1, 0x40000000    # 2.0f

    .line 23
    .line 24
    if-eq v0, v1, :cond_0

    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_0
    invoke-virtual {p0}, Landroid/view/View;->getPaddingTop()I

    .line 28
    .line 29
    .line 30
    move-result v0

    .line 31
    add-int/2addr v0, p2

    .line 32
    invoke-virtual {p0}, Landroid/view/View;->getPaddingBottom()I

    .line 33
    .line 34
    .line 35
    move-result p2

    .line 36
    add-int/2addr p2, v0

    .line 37
    iput p2, p0, Lcom/xuexiang/xui/widget/picker/RulerView;->n:I

    .line 38
    .line 39
    goto :goto_0

    .line 40
    :cond_1
    iget p2, p0, Lcom/xuexiang/xui/widget/picker/RulerView;->b:I

    .line 41
    .line 42
    iget-boolean v0, p0, Lcom/xuexiang/xui/widget/picker/RulerView;->i:Z

    .line 43
    .line 44
    if-nez v0, :cond_2

    .line 45
    .line 46
    iget v0, p0, Lcom/xuexiang/xui/widget/picker/RulerView;->c:I

    .line 47
    .line 48
    mul-int/lit8 v0, v0, 0x2

    .line 49
    .line 50
    add-int/2addr v0, p2

    .line 51
    invoke-virtual {p0}, Landroid/view/View;->getPaddingTop()I

    .line 52
    .line 53
    .line 54
    move-result p2

    .line 55
    add-int/2addr p2, v0

    .line 56
    invoke-virtual {p0}, Landroid/view/View;->getPaddingBottom()I

    .line 57
    .line 58
    .line 59
    move-result v0

    .line 60
    add-int/2addr v0, p2

    .line 61
    iput v0, p0, Lcom/xuexiang/xui/widget/picker/RulerView;->n:I

    .line 62
    .line 63
    :goto_0
    invoke-virtual {p0}, Landroid/view/View;->getPaddingLeft()I

    .line 64
    .line 65
    .line 66
    move-result p2

    .line 67
    add-int/2addr p2, p1

    .line 68
    invoke-virtual {p0}, Landroid/view/View;->getPaddingRight()I

    .line 69
    .line 70
    .line 71
    move-result p1

    .line 72
    add-int/2addr p1, p2

    .line 73
    iput p1, p0, Lcom/xuexiang/xui/widget/picker/RulerView;->o:I

    .line 74
    .line 75
    iget p2, p0, Lcom/xuexiang/xui/widget/picker/RulerView;->n:I

    .line 76
    .line 77
    invoke-virtual {p0, p1, p2}, Landroid/view/View;->setMeasuredDimension(II)V

    .line 78
    .line 79
    .line 80
    return-void

    .line 81
    :cond_2
    const/4 p1, 0x0

    .line 82
    throw p1
.end method

.method public final onTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 6

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const/4 v1, 0x1

    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    invoke-virtual {p0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    invoke-interface {v0, v1}, Landroid/view/ViewParent;->requestDisallowInterceptTouchEvent(Z)V

    .line 13
    .line 14
    .line 15
    :cond_0
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    const/16 v2, 0x1f4

    .line 20
    .line 21
    iget-object v3, p0, Lcom/xuexiang/xui/widget/picker/RulerView;->l:Landroid/view/VelocityTracker;

    .line 22
    .line 23
    invoke-virtual {v3, v2}, Landroid/view/VelocityTracker;->computeCurrentVelocity(I)V

    .line 24
    .line 25
    .line 26
    invoke-virtual {v3, p1}, Landroid/view/VelocityTracker;->addMovement(Landroid/view/MotionEvent;)V

    .line 27
    .line 28
    .line 29
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I

    .line 30
    .line 31
    .line 32
    move-result v2

    .line 33
    if-eqz v2, :cond_6

    .line 34
    .line 35
    if-eq v2, v1, :cond_3

    .line 36
    .line 37
    const/4 p1, 0x2

    .line 38
    if-eq v2, p1, :cond_1

    .line 39
    .line 40
    goto/16 :goto_1

    .line 41
    .line 42
    :cond_1
    iget p1, p0, Lcom/xuexiang/xui/widget/picker/RulerView;->p:F

    .line 43
    .line 44
    sub-float/2addr v0, p1

    .line 45
    iget p1, p0, Lcom/xuexiang/xui/widget/picker/RulerView;->r:F

    .line 46
    .line 47
    add-float/2addr v0, p1

    .line 48
    iput v0, p0, Lcom/xuexiang/xui/widget/picker/RulerView;->q:F

    .line 49
    .line 50
    iget p1, p0, Lcom/xuexiang/xui/widget/picker/RulerView;->o:I

    .line 51
    .line 52
    int-to-float p1, p1

    .line 53
    const/high16 v2, 0x40000000    # 2.0f

    .line 54
    .line 55
    div-float/2addr p1, v2

    .line 56
    cmpl-float v2, v0, p1

    .line 57
    .line 58
    if-ltz v2, :cond_2

    .line 59
    .line 60
    iput p1, p0, Lcom/xuexiang/xui/widget/picker/RulerView;->q:F

    .line 61
    .line 62
    goto/16 :goto_1

    .line 63
    .line 64
    :cond_2
    iget p1, p0, Lcom/xuexiang/xui/widget/picker/RulerView;->h:I

    .line 65
    .line 66
    int-to-float p1, p1

    .line 67
    invoke-virtual {p0, p1}, Lcom/xuexiang/xui/widget/picker/RulerView;->a(F)F

    .line 68
    .line 69
    .line 70
    move-result p1

    .line 71
    cmpg-float p1, v0, p1

    .line 72
    .line 73
    if-gtz p1, :cond_8

    .line 74
    .line 75
    iget p1, p0, Lcom/xuexiang/xui/widget/picker/RulerView;->h:I

    .line 76
    .line 77
    int-to-float p1, p1

    .line 78
    invoke-virtual {p0, p1}, Lcom/xuexiang/xui/widget/picker/RulerView;->a(F)F

    .line 79
    .line 80
    .line 81
    move-result p1

    .line 82
    iput p1, p0, Lcom/xuexiang/xui/widget/picker/RulerView;->q:F

    .line 83
    .line 84
    goto/16 :goto_1

    .line 85
    .line 86
    :cond_3
    iget p1, p0, Lcom/xuexiang/xui/widget/picker/RulerView;->q:F

    .line 87
    .line 88
    iput p1, p0, Lcom/xuexiang/xui/widget/picker/RulerView;->r:F

    .line 89
    .line 90
    invoke-virtual {v3}, Landroid/view/VelocityTracker;->getXVelocity()F

    .line 91
    .line 92
    .line 93
    move-result p1

    .line 94
    float-to-int p1, p1

    .line 95
    invoke-static {p1}, Ljava/lang/Math;->abs(I)I

    .line 96
    .line 97
    .line 98
    move-result v0

    .line 99
    const/16 v2, 0x32

    .line 100
    .line 101
    if-ge v0, v2, :cond_4

    .line 102
    .line 103
    goto :goto_0

    .line 104
    :cond_4
    iget-object v0, p0, Lcom/xuexiang/xui/widget/picker/RulerView;->k:Landroid/animation/ValueAnimator;

    .line 105
    .line 106
    invoke-virtual {v0}, Landroid/animation/ValueAnimator;->isRunning()Z

    .line 107
    .line 108
    .line 109
    move-result v0

    .line 110
    if-eqz v0, :cond_5

    .line 111
    .line 112
    goto :goto_0

    .line 113
    :cond_5
    div-int/lit8 v0, p1, 0x14

    .line 114
    .line 115
    const/4 v2, 0x0

    .line 116
    filled-new-array {v2, v0}, [I

    .line 117
    .line 118
    .line 119
    move-result-object v0

    .line 120
    invoke-static {v0}, Landroid/animation/ValueAnimator;->ofInt([I)Landroid/animation/ValueAnimator;

    .line 121
    .line 122
    .line 123
    move-result-object v0

    .line 124
    div-int/lit8 p1, p1, 0xa

    .line 125
    .line 126
    invoke-static {p1}, Ljava/lang/Math;->abs(I)I

    .line 127
    .line 128
    .line 129
    move-result p1

    .line 130
    int-to-long v4, p1

    .line 131
    invoke-virtual {v0, v4, v5}, Landroid/animation/ValueAnimator;->setDuration(J)Landroid/animation/ValueAnimator;

    .line 132
    .line 133
    .line 134
    move-result-object p1

    .line 135
    iput-object p1, p0, Lcom/xuexiang/xui/widget/picker/RulerView;->k:Landroid/animation/ValueAnimator;

    .line 136
    .line 137
    new-instance v0, Landroid/view/animation/DecelerateInterpolator;

    .line 138
    .line 139
    invoke-direct {v0}, Landroid/view/animation/DecelerateInterpolator;-><init>()V

    .line 140
    .line 141
    .line 142
    invoke-virtual {p1, v0}, Landroid/animation/ValueAnimator;->setInterpolator(Landroid/animation/TimeInterpolator;)V

    .line 143
    .line 144
    .line 145
    iget-object p1, p0, Lcom/xuexiang/xui/widget/picker/RulerView;->k:Landroid/animation/ValueAnimator;

    .line 146
    .line 147
    new-instance v0, Lcom/xuexiang/xui/widget/button/f;

    .line 148
    .line 149
    const/4 v2, 0x1

    .line 150
    invoke-direct {v0, p0, v2}, Lcom/xuexiang/xui/widget/button/f;-><init>(Ljava/lang/Object;I)V

    .line 151
    .line 152
    .line 153
    invoke-virtual {p1, v0}, Landroid/animation/ValueAnimator;->addUpdateListener(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V

    .line 154
    .line 155
    .line 156
    iget-object p1, p0, Lcom/xuexiang/xui/widget/picker/RulerView;->k:Landroid/animation/ValueAnimator;

    .line 157
    .line 158
    new-instance v0, Ld3/a;

    .line 159
    .line 160
    const/4 v2, 0x0

    .line 161
    invoke-direct {v0, p0, v2}, Ld3/a;-><init>(Ljava/lang/Object;I)V

    .line 162
    .line 163
    .line 164
    invoke-virtual {p1, v0}, Landroid/animation/Animator;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    .line 165
    .line 166
    .line 167
    iget-object p1, p0, Lcom/xuexiang/xui/widget/picker/RulerView;->k:Landroid/animation/ValueAnimator;

    .line 168
    .line 169
    invoke-virtual {p1}, Landroid/animation/ValueAnimator;->start()V

    .line 170
    .line 171
    .line 172
    :goto_0
    invoke-virtual {v3}, Landroid/view/VelocityTracker;->clear()V

    .line 173
    .line 174
    .line 175
    goto :goto_1

    .line 176
    :cond_6
    iget-object v0, p0, Lcom/xuexiang/xui/widget/picker/RulerView;->k:Landroid/animation/ValueAnimator;

    .line 177
    .line 178
    if-eqz v0, :cond_7

    .line 179
    .line 180
    invoke-virtual {v0}, Landroid/animation/ValueAnimator;->isRunning()Z

    .line 181
    .line 182
    .line 183
    move-result v0

    .line 184
    if-eqz v0, :cond_7

    .line 185
    .line 186
    iget-object v0, p0, Lcom/xuexiang/xui/widget/picker/RulerView;->k:Landroid/animation/ValueAnimator;

    .line 187
    .line 188
    invoke-virtual {v0}, Landroid/animation/ValueAnimator;->end()V

    .line 189
    .line 190
    .line 191
    iget-object v0, p0, Lcom/xuexiang/xui/widget/picker/RulerView;->k:Landroid/animation/ValueAnimator;

    .line 192
    .line 193
    invoke-virtual {v0}, Landroid/animation/ValueAnimator;->cancel()V

    .line 194
    .line 195
    .line 196
    :cond_7
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    .line 197
    .line 198
    .line 199
    move-result p1

    .line 200
    iput p1, p0, Lcom/xuexiang/xui/widget/picker/RulerView;->p:F

    .line 201
    .line 202
    :cond_8
    :goto_1
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    .line 203
    .line 204
    .line 205
    return v1
.end method

.method public setBgColor(I)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public setCurrentValue(F)V
    .locals 1

    .line 1
    iget v0, p0, Lcom/xuexiang/xui/widget/picker/RulerView;->a:I

    .line 2
    .line 3
    int-to-float v0, v0

    .line 4
    div-float/2addr p1, v0

    .line 5
    iget v0, p0, Lcom/xuexiang/xui/widget/picker/RulerView;->f:I

    .line 6
    .line 7
    int-to-float v0, v0

    .line 8
    cmpg-float v0, p1, v0

    .line 9
    .line 10
    if-ltz v0, :cond_1

    .line 11
    .line 12
    iget v0, p0, Lcom/xuexiang/xui/widget/picker/RulerView;->h:I

    .line 13
    .line 14
    int-to-float v0, v0

    .line 15
    cmpl-float p1, p1, v0

    .line 16
    .line 17
    if-lez p1, :cond_0

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    .line 21
    .line 22
    .line 23
    :cond_1
    :goto_0
    return-void
.end method

.method public setFirstScale(F)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/xuexiang/xui/widget/picker/RulerView;->g:F

    .line 2
    .line 3
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public setIsBgRoundRect(Z)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public setLargeScaleColor(I)V
    .locals 0

    return-void
.end method

.method public setLargeScaleStroke(I)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public setMaxScale(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/xuexiang/xui/widget/picker/RulerView;->h:I

    .line 2
    .line 3
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public setMidScaleColor(I)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public setMidScaleStroke(I)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public setMinScale(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/xuexiang/xui/widget/picker/RulerView;->f:I

    .line 2
    .line 3
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public setResultNumColor(I)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public setResultNumTextSize(I)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public setRulerHeight(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/xuexiang/xui/widget/picker/RulerView;->b:I

    .line 2
    .line 3
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public setRulerToResultGap(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/xuexiang/xui/widget/picker/RulerView;->c:I

    .line 2
    .line 3
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public setScaleCount(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/xuexiang/xui/widget/picker/RulerView;->d:I

    .line 2
    .line 3
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public setScaleGap(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/xuexiang/xui/widget/picker/RulerView;->e:I

    .line 2
    .line 3
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public setScaleLimit(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/xuexiang/xui/widget/picker/RulerView;->a:I

    .line 2
    .line 3
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public setScaleNumColor(I)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public setScaleNumTextSize(I)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public setShowScaleResult(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/xuexiang/xui/widget/picker/RulerView;->i:Z

    .line 2
    .line 3
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public setSmallScaleColor(I)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public setSmallScaleStroke(I)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public setTypeface(Landroid/graphics/Typeface;)V
    .locals 0

    return-void
.end method

.method public setUnit(Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public setUnitColor(I)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public setUnitTextSize(I)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    .line 2
    .line 3
    .line 4
    return-void
.end method
