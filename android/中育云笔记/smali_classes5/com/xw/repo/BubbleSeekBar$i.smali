.class public Lcom/xw/repo/BubbleSeekBar$i;
.super Landroid/view/View;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/xw/repo/BubbleSeekBar;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "i"
.end annotation


# instance fields
.field public c:Landroid/graphics/Paint;

.field public d:Landroid/graphics/Path;

.field public e:Landroid/graphics/RectF;

.field public f:Landroid/graphics/Rect;

.field public g:Ljava/lang/String;

.field public final synthetic h:Lcom/xw/repo/BubbleSeekBar;


# direct methods
.method public constructor <init>(Lcom/xw/repo/BubbleSeekBar;Landroid/content/Context;)V
    .locals 1

    const/4 v0, 0x0

    .line 1
    invoke-direct {p0, p1, p2, v0}, Lcom/xw/repo/BubbleSeekBar$i;-><init>(Lcom/xw/repo/BubbleSeekBar;Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method public constructor <init>(Lcom/xw/repo/BubbleSeekBar;Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    const/4 v0, 0x0

    .line 2
    invoke-direct {p0, p1, p2, p3, v0}, Lcom/xw/repo/BubbleSeekBar$i;-><init>(Lcom/xw/repo/BubbleSeekBar;Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Lcom/xw/repo/BubbleSeekBar;Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 0

    .line 3
    iput-object p1, p0, Lcom/xw/repo/BubbleSeekBar$i;->h:Lcom/xw/repo/BubbleSeekBar;

    .line 4
    invoke-direct {p0, p2, p3, p4}, Landroid/view/View;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 5
    const-string p1, ""

    iput-object p1, p0, Lcom/xw/repo/BubbleSeekBar$i;->g:Ljava/lang/String;

    .line 6
    new-instance p1, Landroid/graphics/Paint;

    invoke-direct {p1}, Landroid/graphics/Paint;-><init>()V

    iput-object p1, p0, Lcom/xw/repo/BubbleSeekBar$i;->c:Landroid/graphics/Paint;

    const/4 p2, 0x1

    .line 7
    invoke-virtual {p1, p2}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 8
    iget-object p1, p0, Lcom/xw/repo/BubbleSeekBar$i;->c:Landroid/graphics/Paint;

    sget-object p2, Landroid/graphics/Paint$Align;->CENTER:Landroid/graphics/Paint$Align;

    invoke-virtual {p1, p2}, Landroid/graphics/Paint;->setTextAlign(Landroid/graphics/Paint$Align;)V

    .line 9
    new-instance p1, Landroid/graphics/Path;

    invoke-direct {p1}, Landroid/graphics/Path;-><init>()V

    iput-object p1, p0, Lcom/xw/repo/BubbleSeekBar$i;->d:Landroid/graphics/Path;

    .line 10
    new-instance p1, Landroid/graphics/RectF;

    invoke-direct {p1}, Landroid/graphics/RectF;-><init>()V

    iput-object p1, p0, Lcom/xw/repo/BubbleSeekBar$i;->e:Landroid/graphics/RectF;

    .line 11
    new-instance p1, Landroid/graphics/Rect;

    invoke-direct {p1}, Landroid/graphics/Rect;-><init>()V

    iput-object p1, p0, Lcom/xw/repo/BubbleSeekBar$i;->f:Landroid/graphics/Rect;

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/String;)V
    .locals 1

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    iget-object v0, p0, Lcom/xw/repo/BubbleSeekBar$i;->g:Ljava/lang/String;

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
    iput-object p1, p0, Lcom/xw/repo/BubbleSeekBar$i;->g:Ljava/lang/String;

    .line 12
    .line 13
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    .line 14
    .line 15
    .line 16
    :cond_0
    return-void
.end method

.method public onDraw(Landroid/graphics/Canvas;)V
    .locals 13

    .line 1
    invoke-super {p0, p1}, Landroid/view/View;->onDraw(Landroid/graphics/Canvas;)V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/xw/repo/BubbleSeekBar$i;->d:Landroid/graphics/Path;

    .line 5
    .line 6
    invoke-virtual {v0}, Landroid/graphics/Path;->reset()V

    .line 7
    .line 8
    .line 9
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredWidth()I

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    int-to-float v0, v0

    .line 14
    const/high16 v1, 0x40000000    # 2.0f

    .line 15
    .line 16
    div-float/2addr v0, v1

    .line 17
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredHeight()I

    .line 18
    .line 19
    .line 20
    move-result v2

    .line 21
    int-to-float v2, v2

    .line 22
    iget-object v3, p0, Lcom/xw/repo/BubbleSeekBar$i;->h:Lcom/xw/repo/BubbleSeekBar;

    .line 23
    .line 24
    invoke-static {v3}, Lcom/xw/repo/BubbleSeekBar;->n(Lcom/xw/repo/BubbleSeekBar;)I

    .line 25
    .line 26
    .line 27
    move-result v3

    .line 28
    int-to-float v3, v3

    .line 29
    const/high16 v4, 0x40400000    # 3.0f

    .line 30
    .line 31
    div-float/2addr v3, v4

    .line 32
    sub-float/2addr v2, v3

    .line 33
    iget-object v3, p0, Lcom/xw/repo/BubbleSeekBar$i;->d:Landroid/graphics/Path;

    .line 34
    .line 35
    invoke-virtual {v3, v0, v2}, Landroid/graphics/Path;->moveTo(FF)V

    .line 36
    .line 37
    .line 38
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredWidth()I

    .line 39
    .line 40
    .line 41
    move-result v3

    .line 42
    int-to-float v3, v3

    .line 43
    div-float/2addr v3, v1

    .line 44
    float-to-double v3, v3

    .line 45
    const-wide/high16 v5, 0x4008000000000000L    # 3.0

    .line 46
    .line 47
    invoke-static {v5, v6}, Ljava/lang/Math;->sqrt(D)D

    .line 48
    .line 49
    .line 50
    move-result-wide v7

    .line 51
    const-wide/high16 v9, 0x4000000000000000L    # 2.0

    .line 52
    .line 53
    div-double/2addr v7, v9

    .line 54
    iget-object v11, p0, Lcom/xw/repo/BubbleSeekBar$i;->h:Lcom/xw/repo/BubbleSeekBar;

    .line 55
    .line 56
    invoke-static {v11}, Lcom/xw/repo/BubbleSeekBar;->n(Lcom/xw/repo/BubbleSeekBar;)I

    .line 57
    .line 58
    .line 59
    move-result v11

    .line 60
    int-to-double v11, v11

    .line 61
    mul-double/2addr v7, v11

    .line 62
    sub-double/2addr v3, v7

    .line 63
    double-to-float v3, v3

    .line 64
    iget-object v4, p0, Lcom/xw/repo/BubbleSeekBar$i;->h:Lcom/xw/repo/BubbleSeekBar;

    .line 65
    .line 66
    invoke-static {v4}, Lcom/xw/repo/BubbleSeekBar;->n(Lcom/xw/repo/BubbleSeekBar;)I

    .line 67
    .line 68
    .line 69
    move-result v4

    .line 70
    int-to-float v4, v4

    .line 71
    const/high16 v7, 0x3fc00000    # 1.5f

    .line 72
    .line 73
    mul-float/2addr v4, v7

    .line 74
    iget-object v7, p0, Lcom/xw/repo/BubbleSeekBar$i;->d:Landroid/graphics/Path;

    .line 75
    .line 76
    const/4 v8, 0x2

    .line 77
    invoke-static {v8}, Lp9/b;->a(I)I

    .line 78
    .line 79
    .line 80
    move-result v11

    .line 81
    int-to-float v11, v11

    .line 82
    sub-float v11, v3, v11

    .line 83
    .line 84
    invoke-static {v8}, Lp9/b;->a(I)I

    .line 85
    .line 86
    .line 87
    move-result v12

    .line 88
    int-to-float v12, v12

    .line 89
    sub-float v12, v4, v12

    .line 90
    .line 91
    invoke-virtual {v7, v11, v12, v3, v4}, Landroid/graphics/Path;->quadTo(FFFF)V

    .line 92
    .line 93
    .line 94
    iget-object v3, p0, Lcom/xw/repo/BubbleSeekBar$i;->d:Landroid/graphics/Path;

    .line 95
    .line 96
    iget-object v7, p0, Lcom/xw/repo/BubbleSeekBar$i;->e:Landroid/graphics/RectF;

    .line 97
    .line 98
    const/high16 v11, 0x43160000    # 150.0f

    .line 99
    .line 100
    const/high16 v12, 0x43700000    # 240.0f

    .line 101
    .line 102
    invoke-virtual {v3, v7, v11, v12}, Landroid/graphics/Path;->arcTo(Landroid/graphics/RectF;FF)V

    .line 103
    .line 104
    .line 105
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredWidth()I

    .line 106
    .line 107
    .line 108
    move-result v3

    .line 109
    int-to-float v3, v3

    .line 110
    div-float/2addr v3, v1

    .line 111
    float-to-double v11, v3

    .line 112
    invoke-static {v5, v6}, Ljava/lang/Math;->sqrt(D)D

    .line 113
    .line 114
    .line 115
    move-result-wide v5

    .line 116
    div-double/2addr v5, v9

    .line 117
    iget-object v3, p0, Lcom/xw/repo/BubbleSeekBar$i;->h:Lcom/xw/repo/BubbleSeekBar;

    .line 118
    .line 119
    invoke-static {v3}, Lcom/xw/repo/BubbleSeekBar;->n(Lcom/xw/repo/BubbleSeekBar;)I

    .line 120
    .line 121
    .line 122
    move-result v3

    .line 123
    int-to-double v9, v3

    .line 124
    mul-double/2addr v5, v9

    .line 125
    add-double/2addr v11, v5

    .line 126
    double-to-float v3, v11

    .line 127
    iget-object v5, p0, Lcom/xw/repo/BubbleSeekBar$i;->d:Landroid/graphics/Path;

    .line 128
    .line 129
    invoke-static {v8}, Lp9/b;->a(I)I

    .line 130
    .line 131
    .line 132
    move-result v6

    .line 133
    int-to-float v6, v6

    .line 134
    add-float/2addr v3, v6

    .line 135
    invoke-static {v8}, Lp9/b;->a(I)I

    .line 136
    .line 137
    .line 138
    move-result v6

    .line 139
    int-to-float v6, v6

    .line 140
    sub-float/2addr v4, v6

    .line 141
    invoke-virtual {v5, v3, v4, v0, v2}, Landroid/graphics/Path;->quadTo(FFFF)V

    .line 142
    .line 143
    .line 144
    iget-object v0, p0, Lcom/xw/repo/BubbleSeekBar$i;->d:Landroid/graphics/Path;

    .line 145
    .line 146
    invoke-virtual {v0}, Landroid/graphics/Path;->close()V

    .line 147
    .line 148
    .line 149
    iget-object v0, p0, Lcom/xw/repo/BubbleSeekBar$i;->c:Landroid/graphics/Paint;

    .line 150
    .line 151
    iget-object v2, p0, Lcom/xw/repo/BubbleSeekBar$i;->h:Lcom/xw/repo/BubbleSeekBar;

    .line 152
    .line 153
    invoke-static {v2}, Lcom/xw/repo/BubbleSeekBar;->p(Lcom/xw/repo/BubbleSeekBar;)I

    .line 154
    .line 155
    .line 156
    move-result v2

    .line 157
    invoke-virtual {v0, v2}, Landroid/graphics/Paint;->setColor(I)V

    .line 158
    .line 159
    .line 160
    iget-object v0, p0, Lcom/xw/repo/BubbleSeekBar$i;->d:Landroid/graphics/Path;

    .line 161
    .line 162
    iget-object v2, p0, Lcom/xw/repo/BubbleSeekBar$i;->c:Landroid/graphics/Paint;

    .line 163
    .line 164
    invoke-virtual {p1, v0, v2}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    .line 165
    .line 166
    .line 167
    iget-object v0, p0, Lcom/xw/repo/BubbleSeekBar$i;->c:Landroid/graphics/Paint;

    .line 168
    .line 169
    iget-object v2, p0, Lcom/xw/repo/BubbleSeekBar$i;->h:Lcom/xw/repo/BubbleSeekBar;

    .line 170
    .line 171
    invoke-static {v2}, Lcom/xw/repo/BubbleSeekBar;->q(Lcom/xw/repo/BubbleSeekBar;)I

    .line 172
    .line 173
    .line 174
    move-result v2

    .line 175
    int-to-float v2, v2

    .line 176
    invoke-virtual {v0, v2}, Landroid/graphics/Paint;->setTextSize(F)V

    .line 177
    .line 178
    .line 179
    iget-object v0, p0, Lcom/xw/repo/BubbleSeekBar$i;->c:Landroid/graphics/Paint;

    .line 180
    .line 181
    iget-object v2, p0, Lcom/xw/repo/BubbleSeekBar$i;->h:Lcom/xw/repo/BubbleSeekBar;

    .line 182
    .line 183
    invoke-static {v2}, Lcom/xw/repo/BubbleSeekBar;->r(Lcom/xw/repo/BubbleSeekBar;)I

    .line 184
    .line 185
    .line 186
    move-result v2

    .line 187
    invoke-virtual {v0, v2}, Landroid/graphics/Paint;->setColor(I)V

    .line 188
    .line 189
    .line 190
    iget-object v0, p0, Lcom/xw/repo/BubbleSeekBar$i;->c:Landroid/graphics/Paint;

    .line 191
    .line 192
    iget-object v2, p0, Lcom/xw/repo/BubbleSeekBar$i;->g:Ljava/lang/String;

    .line 193
    .line 194
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    .line 195
    .line 196
    .line 197
    move-result v3

    .line 198
    iget-object v4, p0, Lcom/xw/repo/BubbleSeekBar$i;->f:Landroid/graphics/Rect;

    .line 199
    .line 200
    const/4 v5, 0x0

    .line 201
    invoke-virtual {v0, v2, v5, v3, v4}, Landroid/graphics/Paint;->getTextBounds(Ljava/lang/String;IILandroid/graphics/Rect;)V

    .line 202
    .line 203
    .line 204
    iget-object v0, p0, Lcom/xw/repo/BubbleSeekBar$i;->c:Landroid/graphics/Paint;

    .line 205
    .line 206
    invoke-virtual {v0}, Landroid/graphics/Paint;->getFontMetrics()Landroid/graphics/Paint$FontMetrics;

    .line 207
    .line 208
    .line 209
    move-result-object v0

    .line 210
    iget-object v2, p0, Lcom/xw/repo/BubbleSeekBar$i;->h:Lcom/xw/repo/BubbleSeekBar;

    .line 211
    .line 212
    invoke-static {v2}, Lcom/xw/repo/BubbleSeekBar;->n(Lcom/xw/repo/BubbleSeekBar;)I

    .line 213
    .line 214
    .line 215
    move-result v2

    .line 216
    int-to-float v2, v2

    .line 217
    iget v3, v0, Landroid/graphics/Paint$FontMetrics;->descent:F

    .line 218
    .line 219
    iget v0, v0, Landroid/graphics/Paint$FontMetrics;->ascent:F

    .line 220
    .line 221
    sub-float v0, v3, v0

    .line 222
    .line 223
    div-float/2addr v0, v1

    .line 224
    add-float/2addr v2, v0

    .line 225
    sub-float/2addr v2, v3

    .line 226
    iget-object v0, p0, Lcom/xw/repo/BubbleSeekBar$i;->g:Ljava/lang/String;

    .line 227
    .line 228
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredWidth()I

    .line 229
    .line 230
    .line 231
    move-result v3

    .line 232
    int-to-float v3, v3

    .line 233
    div-float/2addr v3, v1

    .line 234
    iget-object v1, p0, Lcom/xw/repo/BubbleSeekBar$i;->c:Landroid/graphics/Paint;

    .line 235
    .line 236
    invoke-virtual {p1, v0, v3, v2, v1}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V

    .line 237
    .line 238
    .line 239
    return-void
.end method

.method public onMeasure(II)V
    .locals 3

    .line 1
    invoke-super {p0, p1, p2}, Landroid/view/View;->onMeasure(II)V

    .line 2
    .line 3
    .line 4
    iget-object p1, p0, Lcom/xw/repo/BubbleSeekBar$i;->h:Lcom/xw/repo/BubbleSeekBar;

    .line 5
    .line 6
    invoke-static {p1}, Lcom/xw/repo/BubbleSeekBar;->n(Lcom/xw/repo/BubbleSeekBar;)I

    .line 7
    .line 8
    .line 9
    move-result p1

    .line 10
    mul-int/lit8 p1, p1, 0x3

    .line 11
    .line 12
    iget-object p2, p0, Lcom/xw/repo/BubbleSeekBar$i;->h:Lcom/xw/repo/BubbleSeekBar;

    .line 13
    .line 14
    invoke-static {p2}, Lcom/xw/repo/BubbleSeekBar;->n(Lcom/xw/repo/BubbleSeekBar;)I

    .line 15
    .line 16
    .line 17
    move-result p2

    .line 18
    mul-int/lit8 p2, p2, 0x3

    .line 19
    .line 20
    invoke-virtual {p0, p1, p2}, Landroid/view/View;->setMeasuredDimension(II)V

    .line 21
    .line 22
    .line 23
    iget-object p1, p0, Lcom/xw/repo/BubbleSeekBar$i;->e:Landroid/graphics/RectF;

    .line 24
    .line 25
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredWidth()I

    .line 26
    .line 27
    .line 28
    move-result p2

    .line 29
    int-to-float p2, p2

    .line 30
    const/high16 v0, 0x40000000    # 2.0f

    .line 31
    .line 32
    div-float/2addr p2, v0

    .line 33
    iget-object v1, p0, Lcom/xw/repo/BubbleSeekBar$i;->h:Lcom/xw/repo/BubbleSeekBar;

    .line 34
    .line 35
    invoke-static {v1}, Lcom/xw/repo/BubbleSeekBar;->n(Lcom/xw/repo/BubbleSeekBar;)I

    .line 36
    .line 37
    .line 38
    move-result v1

    .line 39
    int-to-float v1, v1

    .line 40
    sub-float/2addr p2, v1

    .line 41
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredWidth()I

    .line 42
    .line 43
    .line 44
    move-result v1

    .line 45
    int-to-float v1, v1

    .line 46
    div-float/2addr v1, v0

    .line 47
    iget-object v0, p0, Lcom/xw/repo/BubbleSeekBar$i;->h:Lcom/xw/repo/BubbleSeekBar;

    .line 48
    .line 49
    invoke-static {v0}, Lcom/xw/repo/BubbleSeekBar;->n(Lcom/xw/repo/BubbleSeekBar;)I

    .line 50
    .line 51
    .line 52
    move-result v0

    .line 53
    int-to-float v0, v0

    .line 54
    add-float/2addr v1, v0

    .line 55
    iget-object v0, p0, Lcom/xw/repo/BubbleSeekBar$i;->h:Lcom/xw/repo/BubbleSeekBar;

    .line 56
    .line 57
    invoke-static {v0}, Lcom/xw/repo/BubbleSeekBar;->n(Lcom/xw/repo/BubbleSeekBar;)I

    .line 58
    .line 59
    .line 60
    move-result v0

    .line 61
    mul-int/lit8 v0, v0, 0x2

    .line 62
    .line 63
    int-to-float v0, v0

    .line 64
    const/4 v2, 0x0

    .line 65
    invoke-virtual {p1, p2, v2, v1, v0}, Landroid/graphics/RectF;->set(FFFF)V

    .line 66
    .line 67
    .line 68
    return-void
.end method
