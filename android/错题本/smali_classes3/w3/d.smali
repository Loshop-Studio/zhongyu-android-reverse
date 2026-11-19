.class public final Lw3/d;
.super Landroid/view/View;
.source "SourceFile"


# instance fields
.field public final a:Landroid/graphics/Paint;

.field public final b:Landroid/graphics/Path;

.field public final c:Landroid/graphics/RectF;

.field public final d:Landroid/graphics/Rect;

.field public e:Ljava/lang/String;

.field public final synthetic f:Lcom/xw/repo/BubbleSeekBar;


# direct methods
.method public constructor <init>(Lcom/xw/repo/BubbleSeekBar;Landroid/content/Context;)V
    .locals 1

    .line 1
    iput-object p1, p0, Lw3/d;->f:Lcom/xw/repo/BubbleSeekBar;

    .line 2
    .line 3
    const/4 p1, 0x0

    .line 4
    const/4 v0, 0x0

    .line 5
    invoke-direct {p0, p2, p1, v0}, Landroid/view/View;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 6
    .line 7
    .line 8
    const-string p1, ""

    .line 9
    .line 10
    iput-object p1, p0, Lw3/d;->e:Ljava/lang/String;

    .line 11
    .line 12
    new-instance p1, Landroid/graphics/Paint;

    .line 13
    .line 14
    invoke-direct {p1}, Landroid/graphics/Paint;-><init>()V

    .line 15
    .line 16
    .line 17
    iput-object p1, p0, Lw3/d;->a:Landroid/graphics/Paint;

    .line 18
    .line 19
    const/4 p2, 0x1

    .line 20
    invoke-virtual {p1, p2}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 21
    .line 22
    .line 23
    sget-object p2, Landroid/graphics/Paint$Align;->CENTER:Landroid/graphics/Paint$Align;

    .line 24
    .line 25
    invoke-virtual {p1, p2}, Landroid/graphics/Paint;->setTextAlign(Landroid/graphics/Paint$Align;)V

    .line 26
    .line 27
    .line 28
    new-instance p1, Landroid/graphics/Path;

    .line 29
    .line 30
    invoke-direct {p1}, Landroid/graphics/Path;-><init>()V

    .line 31
    .line 32
    .line 33
    iput-object p1, p0, Lw3/d;->b:Landroid/graphics/Path;

    .line 34
    .line 35
    new-instance p1, Landroid/graphics/RectF;

    .line 36
    .line 37
    invoke-direct {p1}, Landroid/graphics/RectF;-><init>()V

    .line 38
    .line 39
    .line 40
    iput-object p1, p0, Lw3/d;->c:Landroid/graphics/RectF;

    .line 41
    .line 42
    new-instance p1, Landroid/graphics/Rect;

    .line 43
    .line 44
    invoke-direct {p1}, Landroid/graphics/Rect;-><init>()V

    .line 45
    .line 46
    .line 47
    iput-object p1, p0, Lw3/d;->d:Landroid/graphics/Rect;

    .line 48
    .line 49
    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/String;)V
    .locals 1

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    iget-object v0, p0, Lw3/d;->e:Ljava/lang/String;

    .line 4
    .line 5
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    iput-object p1, p0, Lw3/d;->e:Ljava/lang/String;

    .line 12
    .line 13
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    .line 14
    .line 15
    .line 16
    :cond_0
    return-void
.end method

.method public final onDraw(Landroid/graphics/Canvas;)V
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    invoke-super/range {p0 .. p1}, Landroid/view/View;->onDraw(Landroid/graphics/Canvas;)V

    .line 6
    .line 7
    .line 8
    iget-object v2, v0, Lw3/d;->b:Landroid/graphics/Path;

    .line 9
    .line 10
    invoke-virtual {v2}, Landroid/graphics/Path;->reset()V

    .line 11
    .line 12
    .line 13
    invoke-virtual {v0}, Landroid/view/View;->getMeasuredWidth()I

    .line 14
    .line 15
    .line 16
    move-result v3

    .line 17
    int-to-float v3, v3

    .line 18
    const/high16 v4, 0x40000000    # 2.0f

    .line 19
    .line 20
    div-float/2addr v3, v4

    .line 21
    invoke-virtual {v0}, Landroid/view/View;->getMeasuredHeight()I

    .line 22
    .line 23
    .line 24
    move-result v5

    .line 25
    int-to-float v5, v5

    .line 26
    iget-object v6, v0, Lw3/d;->f:Lcom/xw/repo/BubbleSeekBar;

    .line 27
    .line 28
    iget v7, v6, Lcom/xw/repo/BubbleSeekBar;->e0:I

    .line 29
    .line 30
    int-to-float v7, v7

    .line 31
    const/high16 v8, 0x40400000    # 3.0f

    .line 32
    .line 33
    div-float/2addr v7, v8

    .line 34
    sub-float/2addr v5, v7

    .line 35
    invoke-virtual {v2, v3, v5}, Landroid/graphics/Path;->moveTo(FF)V

    .line 36
    .line 37
    .line 38
    invoke-virtual {v0}, Landroid/view/View;->getMeasuredWidth()I

    .line 39
    .line 40
    .line 41
    move-result v7

    .line 42
    int-to-float v7, v7

    .line 43
    div-float/2addr v7, v4

    .line 44
    float-to-double v7, v7

    .line 45
    const-wide/high16 v9, 0x4008000000000000L    # 3.0

    .line 46
    .line 47
    invoke-static {v9, v10}, Ljava/lang/Math;->sqrt(D)D

    .line 48
    .line 49
    .line 50
    move-result-wide v11

    .line 51
    const-wide/high16 v13, 0x4000000000000000L    # 2.0

    .line 52
    .line 53
    div-double/2addr v11, v13

    .line 54
    iget v15, v6, Lcom/xw/repo/BubbleSeekBar;->e0:I

    .line 55
    .line 56
    move-wide/from16 v16, v9

    .line 57
    .line 58
    int-to-double v9, v15

    .line 59
    mul-double/2addr v11, v9

    .line 60
    sub-double/2addr v7, v11

    .line 61
    double-to-float v7, v7

    .line 62
    const/high16 v8, 0x3fc00000    # 1.5f

    .line 63
    .line 64
    int-to-float v9, v15

    .line 65
    mul-float/2addr v9, v8

    .line 66
    const/4 v8, 0x2

    .line 67
    invoke-static {v8}, Lw3/g;->a(I)I

    .line 68
    .line 69
    .line 70
    move-result v10

    .line 71
    int-to-float v10, v10

    .line 72
    sub-float v10, v7, v10

    .line 73
    .line 74
    invoke-static {v8}, Lw3/g;->a(I)I

    .line 75
    .line 76
    .line 77
    move-result v11

    .line 78
    int-to-float v11, v11

    .line 79
    sub-float v11, v9, v11

    .line 80
    .line 81
    invoke-virtual {v2, v10, v11, v7, v9}, Landroid/graphics/Path;->quadTo(FFFF)V

    .line 82
    .line 83
    .line 84
    const/high16 v7, 0x43160000    # 150.0f

    .line 85
    .line 86
    const/high16 v10, 0x43700000    # 240.0f

    .line 87
    .line 88
    iget-object v11, v0, Lw3/d;->c:Landroid/graphics/RectF;

    .line 89
    .line 90
    invoke-virtual {v2, v11, v7, v10}, Landroid/graphics/Path;->arcTo(Landroid/graphics/RectF;FF)V

    .line 91
    .line 92
    .line 93
    invoke-virtual {v0}, Landroid/view/View;->getMeasuredWidth()I

    .line 94
    .line 95
    .line 96
    move-result v7

    .line 97
    int-to-float v7, v7

    .line 98
    div-float/2addr v7, v4

    .line 99
    float-to-double v10, v7

    .line 100
    invoke-static/range {v16 .. v17}, Ljava/lang/Math;->sqrt(D)D

    .line 101
    .line 102
    .line 103
    move-result-wide v15

    .line 104
    div-double/2addr v15, v13

    .line 105
    iget v7, v6, Lcom/xw/repo/BubbleSeekBar;->e0:I

    .line 106
    .line 107
    int-to-double v12, v7

    .line 108
    mul-double/2addr v15, v12

    .line 109
    add-double/2addr v10, v15

    .line 110
    double-to-float v7, v10

    .line 111
    invoke-static {v8}, Lw3/g;->a(I)I

    .line 112
    .line 113
    .line 114
    move-result v10

    .line 115
    int-to-float v10, v10

    .line 116
    add-float/2addr v7, v10

    .line 117
    invoke-static {v8}, Lw3/g;->a(I)I

    .line 118
    .line 119
    .line 120
    move-result v8

    .line 121
    int-to-float v8, v8

    .line 122
    sub-float/2addr v9, v8

    .line 123
    invoke-virtual {v2, v7, v9, v3, v5}, Landroid/graphics/Path;->quadTo(FFFF)V

    .line 124
    .line 125
    .line 126
    invoke-virtual {v2}, Landroid/graphics/Path;->close()V

    .line 127
    .line 128
    .line 129
    iget v3, v6, Lcom/xw/repo/BubbleSeekBar;->F:I

    .line 130
    .line 131
    iget-object v5, v0, Lw3/d;->a:Landroid/graphics/Paint;

    .line 132
    .line 133
    invoke-virtual {v5, v3}, Landroid/graphics/Paint;->setColor(I)V

    .line 134
    .line 135
    .line 136
    invoke-virtual {v1, v2, v5}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    .line 137
    .line 138
    .line 139
    iget v2, v6, Lcom/xw/repo/BubbleSeekBar;->G:I

    .line 140
    .line 141
    int-to-float v2, v2

    .line 142
    invoke-virtual {v5, v2}, Landroid/graphics/Paint;->setTextSize(F)V

    .line 143
    .line 144
    .line 145
    iget v2, v6, Lcom/xw/repo/BubbleSeekBar;->H:I

    .line 146
    .line 147
    invoke-virtual {v5, v2}, Landroid/graphics/Paint;->setColor(I)V

    .line 148
    .line 149
    .line 150
    iget-object v2, v0, Lw3/d;->e:Ljava/lang/String;

    .line 151
    .line 152
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    .line 153
    .line 154
    .line 155
    move-result v3

    .line 156
    iget-object v7, v0, Lw3/d;->d:Landroid/graphics/Rect;

    .line 157
    .line 158
    const/4 v8, 0x0

    .line 159
    invoke-virtual {v5, v2, v8, v3, v7}, Landroid/graphics/Paint;->getTextBounds(Ljava/lang/String;IILandroid/graphics/Rect;)V

    .line 160
    .line 161
    .line 162
    invoke-virtual {v5}, Landroid/graphics/Paint;->getFontMetrics()Landroid/graphics/Paint$FontMetrics;

    .line 163
    .line 164
    .line 165
    move-result-object v2

    .line 166
    iget v3, v6, Lcom/xw/repo/BubbleSeekBar;->e0:I

    .line 167
    .line 168
    int-to-float v3, v3

    .line 169
    iget v6, v2, Landroid/graphics/Paint$FontMetrics;->descent:F

    .line 170
    .line 171
    iget v2, v2, Landroid/graphics/Paint$FontMetrics;->ascent:F

    .line 172
    .line 173
    sub-float v2, v6, v2

    .line 174
    .line 175
    div-float/2addr v2, v4

    .line 176
    add-float/2addr v2, v3

    .line 177
    sub-float/2addr v2, v6

    .line 178
    iget-object v3, v0, Lw3/d;->e:Ljava/lang/String;

    .line 179
    .line 180
    invoke-virtual {v0}, Landroid/view/View;->getMeasuredWidth()I

    .line 181
    .line 182
    .line 183
    move-result v6

    .line 184
    int-to-float v6, v6

    .line 185
    div-float/2addr v6, v4

    .line 186
    invoke-virtual {v1, v3, v6, v2, v5}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V

    .line 187
    .line 188
    .line 189
    return-void
.end method

.method public final onMeasure(II)V
    .locals 3

    .line 1
    invoke-super {p0, p1, p2}, Landroid/view/View;->onMeasure(II)V

    .line 2
    .line 3
    .line 4
    iget-object p1, p0, Lw3/d;->f:Lcom/xw/repo/BubbleSeekBar;

    .line 5
    .line 6
    iget p2, p1, Lcom/xw/repo/BubbleSeekBar;->e0:I

    .line 7
    .line 8
    mul-int/lit8 v0, p2, 0x3

    .line 9
    .line 10
    mul-int/lit8 p2, p2, 0x3

    .line 11
    .line 12
    invoke-virtual {p0, v0, p2}, Landroid/view/View;->setMeasuredDimension(II)V

    .line 13
    .line 14
    .line 15
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredWidth()I

    .line 16
    .line 17
    .line 18
    move-result p2

    .line 19
    int-to-float p2, p2

    .line 20
    const/high16 v0, 0x40000000    # 2.0f

    .line 21
    .line 22
    div-float/2addr p2, v0

    .line 23
    iget v1, p1, Lcom/xw/repo/BubbleSeekBar;->e0:I

    .line 24
    .line 25
    int-to-float v1, v1

    .line 26
    sub-float/2addr p2, v1

    .line 27
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredWidth()I

    .line 28
    .line 29
    .line 30
    move-result v1

    .line 31
    int-to-float v1, v1

    .line 32
    div-float/2addr v1, v0

    .line 33
    iget p1, p1, Lcom/xw/repo/BubbleSeekBar;->e0:I

    .line 34
    .line 35
    int-to-float v0, p1

    .line 36
    add-float/2addr v1, v0

    .line 37
    mul-int/lit8 p1, p1, 0x2

    .line 38
    .line 39
    int-to-float p1, p1

    .line 40
    iget-object v0, p0, Lw3/d;->c:Landroid/graphics/RectF;

    .line 41
    .line 42
    const/4 v2, 0x0

    .line 43
    invoke-virtual {v0, p2, v2, v1, p1}, Landroid/graphics/RectF;->set(FFFF)V

    .line 44
    .line 45
    .line 46
    return-void
.end method
