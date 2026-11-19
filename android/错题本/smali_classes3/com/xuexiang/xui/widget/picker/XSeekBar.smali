.class public Lcom/xuexiang/xui/widget/picker/XSeekBar;
.super Landroid/view/View;
.source "SourceFile"


# instance fields
.field public final a:Landroid/graphics/Paint;

.field public b:I

.field public final c:Landroid/graphics/Rect;

.field public final d:Ljava/util/HashSet;

.field public final e:Ljava/util/HashSet;

.field public f:I

.field public g:I


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    const/4 v0, 0x0

    .line 1
    invoke-direct {p0, p1, v0}, Lcom/xuexiang/xui/widget/picker/XSeekBar;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    .line 2
    sget v0, Lcom/xuexiang/xui/R$attr;->XSeekBarStyle:I

    invoke-direct {p0, p1, p2, v0}, Lcom/xuexiang/xui/widget/picker/XSeekBar;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 0

    .line 3
    invoke-direct {p0, p1, p2, p3}, Landroid/view/View;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 4
    new-instance p1, Landroid/graphics/Paint;

    const/4 p2, 0x1

    invoke-direct {p1, p2}, Landroid/graphics/Paint;-><init>(I)V

    iput-object p1, p0, Lcom/xuexiang/xui/widget/picker/XSeekBar;->a:Landroid/graphics/Paint;

    const/4 p1, 0x0

    .line 5
    iput p1, p0, Lcom/xuexiang/xui/widget/picker/XSeekBar;->b:I

    .line 6
    new-instance p2, Landroid/graphics/Rect;

    invoke-direct {p2}, Landroid/graphics/Rect;-><init>()V

    iput-object p2, p0, Lcom/xuexiang/xui/widget/picker/XSeekBar;->c:Landroid/graphics/Rect;

    .line 7
    new-instance p2, Landroid/graphics/Rect;

    invoke-direct {p2}, Landroid/graphics/Rect;-><init>()V

    .line 8
    new-instance p2, Ljava/util/HashSet;

    invoke-direct {p2}, Ljava/util/HashSet;-><init>()V

    iput-object p2, p0, Lcom/xuexiang/xui/widget/picker/XSeekBar;->d:Ljava/util/HashSet;

    .line 9
    new-instance p2, Ljava/util/HashSet;

    invoke-direct {p2}, Ljava/util/HashSet;-><init>()V

    iput-object p2, p0, Lcom/xuexiang/xui/widget/picker/XSeekBar;->e:Ljava/util/HashSet;

    const/16 p2, 0x64

    .line 10
    iput p2, p0, Lcom/xuexiang/xui/widget/picker/XSeekBar;->f:I

    .line 11
    iput p1, p0, Lcom/xuexiang/xui/widget/picker/XSeekBar;->g:I

    .line 12
    invoke-static {}, Lt1/a;->a()V

    const/4 p1, 0x0

    throw p1
.end method

.method private setSelectedValue(I)V
    .locals 1

    .line 1
    iget v0, p0, Lcom/xuexiang/xui/widget/picker/XSeekBar;->g:I

    .line 2
    .line 3
    sub-int/2addr p1, v0

    .line 4
    int-to-float p1, p1

    .line 5
    const/4 v0, 0x0

    .line 6
    div-float/2addr p1, v0

    .line 7
    const/4 v0, 0x0

    .line 8
    int-to-float v0, v0

    .line 9
    add-float/2addr p1, v0

    .line 10
    invoke-static {p1}, Ljava/lang/Math;->round(F)I

    .line 11
    .line 12
    .line 13
    move-result p1

    .line 14
    iput p1, p0, Lcom/xuexiang/xui/widget/picker/XSeekBar;->b:I

    .line 15
    .line 16
    return-void
.end method


# virtual methods
.method public final a(Landroid/view/MotionEvent;I)Z
    .locals 3

    .line 1
    invoke-virtual {p1, p2}, Landroid/view/MotionEvent;->getX(I)F

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    iget v1, p0, Lcom/xuexiang/xui/widget/picker/XSeekBar;->b:I

    .line 6
    .line 7
    int-to-float v1, v1

    .line 8
    cmpl-float v0, v0, v1

    .line 9
    .line 10
    const/4 v1, 0x0

    .line 11
    if-lez v0, :cond_0

    .line 12
    .line 13
    invoke-virtual {p1, p2}, Landroid/view/MotionEvent;->getX(I)F

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    iget v2, p0, Lcom/xuexiang/xui/widget/picker/XSeekBar;->b:I

    .line 18
    .line 19
    int-to-float v2, v2

    .line 20
    cmpg-float v0, v0, v2

    .line 21
    .line 22
    if-gez v0, :cond_0

    .line 23
    .line 24
    invoke-virtual {p1, p2}, Landroid/view/MotionEvent;->getY(I)F

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    int-to-float v2, v1

    .line 29
    cmpl-float v0, v0, v2

    .line 30
    .line 31
    if-lez v0, :cond_0

    .line 32
    .line 33
    invoke-virtual {p1, p2}, Landroid/view/MotionEvent;->getY(I)F

    .line 34
    .line 35
    .line 36
    move-result v0

    .line 37
    cmpg-float v0, v0, v2

    .line 38
    .line 39
    if-gez v0, :cond_0

    .line 40
    .line 41
    invoke-virtual {p1, p2}, Landroid/view/MotionEvent;->getPointerId(I)I

    .line 42
    .line 43
    .line 44
    move-result p1

    .line 45
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 46
    .line 47
    .line 48
    move-result-object p1

    .line 49
    iget-object p2, p0, Lcom/xuexiang/xui/widget/picker/XSeekBar;->e:Ljava/util/HashSet;

    .line 50
    .line 51
    invoke-virtual {p2, p1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 52
    .line 53
    .line 54
    const/4 p1, 0x1

    .line 55
    return p1

    .line 56
    :cond_0
    return v1
.end method

.method public final b(Landroid/view/MotionEvent;I)V
    .locals 3

    .line 1
    invoke-virtual {p1, p2}, Landroid/view/MotionEvent;->getX(I)F

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    iget v1, p0, Lcom/xuexiang/xui/widget/picker/XSeekBar;->b:I

    .line 6
    .line 7
    int-to-float v1, v1

    .line 8
    cmpl-float v0, v0, v1

    .line 9
    .line 10
    const/4 v1, 0x0

    .line 11
    if-lez v0, :cond_0

    .line 12
    .line 13
    invoke-virtual {p1, p2}, Landroid/view/MotionEvent;->getX(I)F

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    int-to-float v2, v1

    .line 18
    cmpg-float v0, v0, v2

    .line 19
    .line 20
    if-gtz v0, :cond_0

    .line 21
    .line 22
    invoke-virtual {p1, p2}, Landroid/view/MotionEvent;->getX(I)F

    .line 23
    .line 24
    .line 25
    move-result p1

    .line 26
    float-to-int p1, p1

    .line 27
    iput p1, p0, Lcom/xuexiang/xui/widget/picker/XSeekBar;->b:I

    .line 28
    .line 29
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    .line 30
    .line 31
    .line 32
    return-void

    .line 33
    :cond_0
    invoke-virtual {p1, p2}, Landroid/view/MotionEvent;->getX(I)F

    .line 34
    .line 35
    .line 36
    move-result v0

    .line 37
    iget v2, p0, Lcom/xuexiang/xui/widget/picker/XSeekBar;->b:I

    .line 38
    .line 39
    int-to-float v2, v2

    .line 40
    cmpg-float v0, v0, v2

    .line 41
    .line 42
    if-gez v0, :cond_1

    .line 43
    .line 44
    invoke-virtual {p1, p2}, Landroid/view/MotionEvent;->getX(I)F

    .line 45
    .line 46
    .line 47
    move-result v0

    .line 48
    int-to-float v1, v1

    .line 49
    cmpl-float v0, v0, v1

    .line 50
    .line 51
    if-ltz v0, :cond_1

    .line 52
    .line 53
    invoke-virtual {p1, p2}, Landroid/view/MotionEvent;->getX(I)F

    .line 54
    .line 55
    .line 56
    move-result p1

    .line 57
    float-to-int p1, p1

    .line 58
    iput p1, p0, Lcom/xuexiang/xui/widget/picker/XSeekBar;->b:I

    .line 59
    .line 60
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    .line 61
    .line 62
    .line 63
    :cond_1
    return-void
.end method

.method public final c(Z)V
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-interface {v0, p1}, Landroid/view/ViewParent;->requestDisallowInterceptTouchEvent(Z)V

    .line 8
    .line 9
    .line 10
    :cond_0
    return-void
.end method

.method public getMax()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/xuexiang/xui/widget/picker/XSeekBar;->f:I

    .line 2
    .line 3
    return v0
.end method

.method public getMin()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/xuexiang/xui/widget/picker/XSeekBar;->g:I

    .line 2
    .line 3
    return v0
.end method

.method public getSelectedNumber()I
    .locals 2

    .line 1
    iget v0, p0, Lcom/xuexiang/xui/widget/picker/XSeekBar;->b:I

    .line 2
    .line 3
    int-to-float v0, v0

    .line 4
    const/4 v1, 0x0

    .line 5
    mul-float/2addr v0, v1

    .line 6
    iget v1, p0, Lcom/xuexiang/xui/widget/picker/XSeekBar;->g:I

    .line 7
    .line 8
    int-to-float v1, v1

    .line 9
    add-float/2addr v0, v1

    .line 10
    invoke-static {v0}, Ljava/lang/Math;->round(F)I

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    return v0
.end method

.method public final onDraw(Landroid/graphics/Canvas;)V
    .locals 8

    .line 1
    iget-object v5, p0, Lcom/xuexiang/xui/widget/picker/XSeekBar;->a:Landroid/graphics/Paint;

    .line 2
    .line 3
    const/4 v6, 0x0

    .line 4
    invoke-virtual {v5, v6}, Landroid/graphics/Paint;->setColor(I)V

    .line 5
    .line 6
    .line 7
    const/4 v7, 0x0

    .line 8
    invoke-virtual {v5, v7}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 9
    .line 10
    .line 11
    int-to-float v1, v6

    .line 12
    move v2, v1

    .line 13
    move v3, v1

    .line 14
    move v4, v1

    .line 15
    move-object v0, p1

    .line 16
    invoke-virtual/range {v0 .. v5}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    .line 17
    .line 18
    .line 19
    invoke-virtual {v5, v7}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 20
    .line 21
    .line 22
    invoke-virtual {v5, v6}, Landroid/graphics/Paint;->setColor(I)V

    .line 23
    .line 24
    .line 25
    iget p1, p0, Lcom/xuexiang/xui/widget/picker/XSeekBar;->b:I

    .line 26
    .line 27
    int-to-float v3, p1

    .line 28
    invoke-virtual/range {v0 .. v5}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    .line 29
    .line 30
    .line 31
    invoke-virtual {v5, v6}, Landroid/graphics/Paint;->setColor(I)V

    .line 32
    .line 33
    .line 34
    invoke-static {}, Lt1/a;->a()V

    .line 35
    .line 36
    .line 37
    const/4 p1, 0x0

    .line 38
    throw p1
.end method

.method public final onMeasure(II)V
    .locals 3

    .line 1
    invoke-super {p0, p1, p2}, Landroid/view/View;->onMeasure(II)V

    .line 2
    .line 3
    .line 4
    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getMode(I)I

    .line 5
    .line 6
    .line 7
    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getSize(I)I

    .line 8
    .line 9
    .line 10
    invoke-static {p2}, Landroid/view/View$MeasureSpec;->getMode(I)I

    .line 11
    .line 12
    .line 13
    invoke-static {p2}, Landroid/view/View$MeasureSpec;->getSize(I)I

    .line 14
    .line 15
    .line 16
    iget p1, p0, Lcom/xuexiang/xui/widget/picker/XSeekBar;->f:I

    .line 17
    .line 18
    invoke-static {p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    const/4 p2, 0x0

    .line 23
    iget-object v0, p0, Lcom/xuexiang/xui/widget/picker/XSeekBar;->a:Landroid/graphics/Paint;

    .line 24
    .line 25
    invoke-virtual {v0, p2}, Landroid/graphics/Paint;->setTextSize(F)V

    .line 26
    .line 27
    .line 28
    const/4 p2, 0x0

    .line 29
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 30
    .line 31
    .line 32
    move-result v1

    .line 33
    iget-object v2, p0, Lcom/xuexiang/xui/widget/picker/XSeekBar;->c:Landroid/graphics/Rect;

    .line 34
    .line 35
    invoke-virtual {v0, p1, p2, v1, v2}, Landroid/graphics/Paint;->getTextBounds(Ljava/lang/String;IILandroid/graphics/Rect;)V

    .line 36
    .line 37
    .line 38
    const/4 p1, 0x0

    .line 39
    throw p1
.end method

.method public final onTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 11

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 3
    .line 4
    .line 5
    move-result-object v1

    .line 6
    invoke-virtual {p0}, Landroid/view/View;->isEnabled()Z

    .line 7
    .line 8
    .line 9
    move-result v2

    .line 10
    if-nez v2, :cond_0

    .line 11
    .line 12
    return v0

    .line 13
    :cond_0
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getActionIndex()I

    .line 14
    .line 15
    .line 16
    move-result v2

    .line 17
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getActionMasked()I

    .line 18
    .line 19
    .line 20
    move-result v3

    .line 21
    const/4 v4, 0x1

    .line 22
    if-eqz v3, :cond_e

    .line 23
    .line 24
    iget-object v5, p0, Lcom/xuexiang/xui/widget/picker/XSeekBar;->e:Ljava/util/HashSet;

    .line 25
    .line 26
    iget-object v6, p0, Lcom/xuexiang/xui/widget/picker/XSeekBar;->d:Ljava/util/HashSet;

    .line 27
    .line 28
    if-eq v3, v4, :cond_d

    .line 29
    .line 30
    const/4 v7, 0x2

    .line 31
    if-eq v3, v7, :cond_5

    .line 32
    .line 33
    const/4 v1, 0x3

    .line 34
    if-eq v3, v1, :cond_4

    .line 35
    .line 36
    const/4 v1, 0x5

    .line 37
    if-eq v3, v1, :cond_1

    .line 38
    .line 39
    const/4 v1, 0x6

    .line 40
    if-eq v3, v1, :cond_d

    .line 41
    .line 42
    goto :goto_1

    .line 43
    :cond_1
    invoke-virtual {p0, v4}, Lcom/xuexiang/xui/widget/picker/XSeekBar;->c(Z)V

    .line 44
    .line 45
    .line 46
    :goto_0
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getPointerCount()I

    .line 47
    .line 48
    .line 49
    move-result v1

    .line 50
    if-ge v0, v1, :cond_3

    .line 51
    .line 52
    invoke-virtual {p0, p1, v0}, Lcom/xuexiang/xui/widget/picker/XSeekBar;->a(Landroid/view/MotionEvent;I)Z

    .line 53
    .line 54
    .line 55
    move-result v1

    .line 56
    if-nez v1, :cond_2

    .line 57
    .line 58
    invoke-virtual {p0, p1, v0}, Lcom/xuexiang/xui/widget/picker/XSeekBar;->b(Landroid/view/MotionEvent;I)V

    .line 59
    .line 60
    .line 61
    :cond_2
    add-int/lit8 v0, v0, 0x1

    .line 62
    .line 63
    goto :goto_0

    .line 64
    :cond_3
    :goto_1
    return v4

    .line 65
    :cond_4
    invoke-virtual {p0, v0}, Lcom/xuexiang/xui/widget/picker/XSeekBar;->c(Z)V

    .line 66
    .line 67
    .line 68
    invoke-virtual {v6}, Ljava/util/HashSet;->clear()V

    .line 69
    .line 70
    .line 71
    invoke-virtual {v5}, Ljava/util/HashSet;->clear()V

    .line 72
    .line 73
    .line 74
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    .line 75
    .line 76
    .line 77
    return v4

    .line 78
    :cond_5
    invoke-virtual {p0, v4}, Lcom/xuexiang/xui/widget/picker/XSeekBar;->c(Z)V

    .line 79
    .line 80
    .line 81
    :goto_2
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getPointerCount()I

    .line 82
    .line 83
    .line 84
    move-result v2

    .line 85
    if-ge v0, v2, :cond_c

    .line 86
    .line 87
    invoke-virtual {p1, v0}, Landroid/view/MotionEvent;->getPointerId(I)I

    .line 88
    .line 89
    .line 90
    move-result v2

    .line 91
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 92
    .line 93
    .line 94
    move-result-object v2

    .line 95
    invoke-virtual {v6, v2}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    .line 96
    .line 97
    .line 98
    move-result v2

    .line 99
    if-eqz v2, :cond_8

    .line 100
    .line 101
    invoke-virtual {p1, v0}, Landroid/view/MotionEvent;->getX(I)F

    .line 102
    .line 103
    .line 104
    move-result v2

    .line 105
    float-to-int v2, v2

    .line 106
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 107
    .line 108
    .line 109
    move-result-object v2

    .line 110
    invoke-virtual {v2}, Ljava/lang/Number;->doubleValue()D

    .line 111
    .line 112
    .line 113
    move-result-wide v7

    .line 114
    invoke-virtual {v1}, Ljava/lang/Number;->doubleValue()D

    .line 115
    .line 116
    .line 117
    move-result-wide v9

    .line 118
    cmpl-double v3, v7, v9

    .line 119
    .line 120
    if-lez v3, :cond_6

    .line 121
    .line 122
    :goto_3
    move-object v2, v1

    .line 123
    goto :goto_4

    .line 124
    :cond_6
    invoke-virtual {v2}, Ljava/lang/Number;->doubleValue()D

    .line 125
    .line 126
    .line 127
    move-result-wide v7

    .line 128
    invoke-virtual {v1}, Ljava/lang/Number;->doubleValue()D

    .line 129
    .line 130
    .line 131
    move-result-wide v9

    .line 132
    cmpg-double v3, v7, v9

    .line 133
    .line 134
    if-gez v3, :cond_7

    .line 135
    .line 136
    goto :goto_3

    .line 137
    :cond_7
    :goto_4
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 138
    .line 139
    .line 140
    move-result v2

    .line 141
    iget v3, p0, Lcom/xuexiang/xui/widget/picker/XSeekBar;->b:I

    .line 142
    .line 143
    if-lt v2, v3, :cond_8

    .line 144
    .line 145
    iput v2, p0, Lcom/xuexiang/xui/widget/picker/XSeekBar;->b:I

    .line 146
    .line 147
    :cond_8
    invoke-virtual {p1, v0}, Landroid/view/MotionEvent;->getPointerId(I)I

    .line 148
    .line 149
    .line 150
    move-result v2

    .line 151
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 152
    .line 153
    .line 154
    move-result-object v2

    .line 155
    invoke-virtual {v5, v2}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    .line 156
    .line 157
    .line 158
    move-result v2

    .line 159
    if-eqz v2, :cond_b

    .line 160
    .line 161
    invoke-virtual {p1, v0}, Landroid/view/MotionEvent;->getX(I)F

    .line 162
    .line 163
    .line 164
    move-result v2

    .line 165
    float-to-int v2, v2

    .line 166
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 167
    .line 168
    .line 169
    move-result-object v2

    .line 170
    invoke-virtual {v2}, Ljava/lang/Number;->doubleValue()D

    .line 171
    .line 172
    .line 173
    move-result-wide v7

    .line 174
    invoke-virtual {v1}, Ljava/lang/Number;->doubleValue()D

    .line 175
    .line 176
    .line 177
    move-result-wide v9

    .line 178
    cmpl-double v3, v7, v9

    .line 179
    .line 180
    if-lez v3, :cond_9

    .line 181
    .line 182
    :goto_5
    move-object v2, v1

    .line 183
    goto :goto_6

    .line 184
    :cond_9
    invoke-virtual {v2}, Ljava/lang/Number;->doubleValue()D

    .line 185
    .line 186
    .line 187
    move-result-wide v7

    .line 188
    invoke-virtual {v1}, Ljava/lang/Number;->doubleValue()D

    .line 189
    .line 190
    .line 191
    move-result-wide v9

    .line 192
    cmpg-double v3, v7, v9

    .line 193
    .line 194
    if-gez v3, :cond_a

    .line 195
    .line 196
    goto :goto_5

    .line 197
    :cond_a
    :goto_6
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 198
    .line 199
    .line 200
    move-result v2

    .line 201
    iput v2, p0, Lcom/xuexiang/xui/widget/picker/XSeekBar;->b:I

    .line 202
    .line 203
    :cond_b
    add-int/lit8 v0, v0, 0x1

    .line 204
    .line 205
    goto :goto_2

    .line 206
    :cond_c
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    .line 207
    .line 208
    .line 209
    return v4

    .line 210
    :cond_d
    invoke-virtual {p0, v0}, Lcom/xuexiang/xui/widget/picker/XSeekBar;->c(Z)V

    .line 211
    .line 212
    .line 213
    invoke-virtual {p1, v2}, Landroid/view/MotionEvent;->getPointerId(I)I

    .line 214
    .line 215
    .line 216
    move-result v0

    .line 217
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 218
    .line 219
    .line 220
    move-result-object v0

    .line 221
    invoke-virtual {v6, v0}, Ljava/util/HashSet;->remove(Ljava/lang/Object;)Z

    .line 222
    .line 223
    .line 224
    invoke-virtual {p1, v2}, Landroid/view/MotionEvent;->getPointerId(I)I

    .line 225
    .line 226
    .line 227
    move-result p1

    .line 228
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 229
    .line 230
    .line 231
    move-result-object p1

    .line 232
    invoke-virtual {v5, p1}, Ljava/util/HashSet;->remove(Ljava/lang/Object;)Z

    .line 233
    .line 234
    .line 235
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    .line 236
    .line 237
    .line 238
    return v4

    .line 239
    :cond_e
    invoke-virtual {p0, v4}, Lcom/xuexiang/xui/widget/picker/XSeekBar;->c(Z)V

    .line 240
    .line 241
    .line 242
    invoke-virtual {p0, p1, v2}, Lcom/xuexiang/xui/widget/picker/XSeekBar;->a(Landroid/view/MotionEvent;I)Z

    .line 243
    .line 244
    .line 245
    move-result v0

    .line 246
    if-nez v0, :cond_f

    .line 247
    .line 248
    invoke-virtual {p0, p1, v2}, Lcom/xuexiang/xui/widget/picker/XSeekBar;->b(Landroid/view/MotionEvent;I)V

    .line 249
    .line 250
    .line 251
    :cond_f
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    .line 252
    .line 253
    .line 254
    return v4
.end method

.method public setDefaultValue(I)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/xuexiang/xui/widget/picker/XSeekBar;->setSelectedValue(I)V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    .line 5
    .line 6
    .line 7
    return-void
.end method

.method public setInterval(I)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public setMax(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/xuexiang/xui/widget/picker/XSeekBar;->f:I

    .line 2
    .line 3
    return-void
.end method

.method public setMin(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/xuexiang/xui/widget/picker/XSeekBar;->g:I

    .line 2
    .line 3
    return-void
.end method

.method public setOnSeekBarListener(Ld3/c;)V
    .locals 0

    .line 1
    return-void
.end method
