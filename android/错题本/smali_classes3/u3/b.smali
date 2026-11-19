.class public final Lu3/b;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Landroid/content/Context;

.field public b:I

.field public c:I

.field public d:I

.field public e:I

.field public final f:I

.field public final g:I

.field public h:Ljava/lang/String;

.field public i:I

.field public j:I

.field public k:Ljava/lang/String;

.field public l:I

.field public m:Z

.field public n:I

.field public final o:Landroid/graphics/Paint;

.field public final p:Landroid/graphics/Paint;

.field public final q:Landroid/graphics/Path;

.field public final r:Landroid/graphics/Path;

.field public final s:Landroid/graphics/Paint;

.field public final t:Landroid/graphics/Rect;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lu3/b;->a:Landroid/content/Context;

    .line 5
    .line 6
    sget-object v0, Lcom/xuexiang/xui/R$styleable;->LabelView:[I

    .line 7
    .line 8
    const/4 v1, 0x0

    .line 9
    invoke-virtual {p1, p2, v0, p3, v1}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    sget p2, Lcom/xuexiang/xui/R$styleable;->LabelView_label_distance:I

    .line 14
    .line 15
    const/high16 p3, 0x42200000    # 40.0f

    .line 16
    .line 17
    invoke-virtual {p0, p3}, Lu3/b;->a(F)I

    .line 18
    .line 19
    .line 20
    move-result p3

    .line 21
    invoke-virtual {p1, p2, p3}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    .line 22
    .line 23
    .line 24
    move-result p2

    .line 25
    iput p2, p0, Lu3/b;->c:I

    .line 26
    .line 27
    sget p2, Lcom/xuexiang/xui/R$styleable;->LabelView_label_height:I

    .line 28
    .line 29
    const/high16 p3, 0x41a00000    # 20.0f

    .line 30
    .line 31
    invoke-virtual {p0, p3}, Lu3/b;->a(F)I

    .line 32
    .line 33
    .line 34
    move-result p3

    .line 35
    invoke-virtual {p1, p2, p3}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    .line 36
    .line 37
    .line 38
    move-result p2

    .line 39
    iput p2, p0, Lu3/b;->d:I

    .line 40
    .line 41
    sget p2, Lcom/xuexiang/xui/R$styleable;->LabelView_label_backgroundColor:I

    .line 42
    .line 43
    const p3, -0x60d83240

    .line 44
    .line 45
    .line 46
    invoke-virtual {p1, p2, p3}, Landroid/content/res/TypedArray;->getColor(II)I

    .line 47
    .line 48
    .line 49
    move-result p2

    .line 50
    iput p2, p0, Lu3/b;->e:I

    .line 51
    .line 52
    sget p2, Lcom/xuexiang/xui/R$styleable;->LabelView_label_strokeWidth:I

    .line 53
    .line 54
    const/high16 p3, 0x3f800000    # 1.0f

    .line 55
    .line 56
    invoke-virtual {p0, p3}, Lu3/b;->a(F)I

    .line 57
    .line 58
    .line 59
    move-result p3

    .line 60
    invoke-virtual {p1, p2, p3}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    .line 61
    .line 62
    .line 63
    move-result p2

    .line 64
    iput p2, p0, Lu3/b;->f:I

    .line 65
    .line 66
    sget p2, Lcom/xuexiang/xui/R$styleable;->LabelView_label_strokeColor:I

    .line 67
    .line 68
    invoke-virtual {p1, p2, v1}, Landroid/content/res/TypedArray;->getColor(II)I

    .line 69
    .line 70
    .line 71
    move-result p2

    .line 72
    iput p2, p0, Lu3/b;->g:I

    .line 73
    .line 74
    sget p2, Lcom/xuexiang/xui/R$styleable;->LabelView_label_text:I

    .line 75
    .line 76
    invoke-virtual {p1, p2}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    .line 77
    .line 78
    .line 79
    move-result-object p2

    .line 80
    iput-object p2, p0, Lu3/b;->h:Ljava/lang/String;

    .line 81
    .line 82
    sget p2, Lcom/xuexiang/xui/R$styleable;->LabelView_label_textSize:I

    .line 83
    .line 84
    const/high16 p3, 0x41600000    # 14.0f

    .line 85
    .line 86
    invoke-virtual {p0, p3}, Lu3/b;->a(F)I

    .line 87
    .line 88
    .line 89
    move-result p3

    .line 90
    invoke-virtual {p1, p2, p3}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    .line 91
    .line 92
    .line 93
    move-result p2

    .line 94
    iput p2, p0, Lu3/b;->i:I

    .line 95
    .line 96
    sget p2, Lcom/xuexiang/xui/R$styleable;->LabelView_label_textStyle:I

    .line 97
    .line 98
    invoke-virtual {p1, p2, v1}, Landroid/content/res/TypedArray;->getInt(II)I

    .line 99
    .line 100
    .line 101
    move-result p2

    .line 102
    iput p2, p0, Lu3/b;->j:I

    .line 103
    .line 104
    sget p2, Lcom/xuexiang/xui/R$styleable;->LabelView_label_textFont:I

    .line 105
    .line 106
    invoke-virtual {p1, p2}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    .line 107
    .line 108
    .line 109
    move-result-object p2

    .line 110
    iput-object p2, p0, Lu3/b;->k:Ljava/lang/String;

    .line 111
    .line 112
    sget p2, Lcom/xuexiang/xui/R$styleable;->LabelView_label_textColor:I

    .line 113
    .line 114
    const/4 p3, -0x1

    .line 115
    invoke-virtual {p1, p2, p3}, Landroid/content/res/TypedArray;->getColor(II)I

    .line 116
    .line 117
    .line 118
    move-result p2

    .line 119
    iput p2, p0, Lu3/b;->l:I

    .line 120
    .line 121
    sget p2, Lcom/xuexiang/xui/R$styleable;->LabelView_label_visual:I

    .line 122
    .line 123
    const/4 p3, 0x1

    .line 124
    invoke-virtual {p1, p2, p3}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    .line 125
    .line 126
    .line 127
    move-result p2

    .line 128
    iput-boolean p2, p0, Lu3/b;->m:Z

    .line 129
    .line 130
    sget p2, Lcom/xuexiang/xui/R$styleable;->LabelView_label_orientation:I

    .line 131
    .line 132
    invoke-virtual {p1, p2, p3}, Landroid/content/res/TypedArray;->getInteger(II)I

    .line 133
    .line 134
    .line 135
    move-result p2

    .line 136
    iput p2, p0, Lu3/b;->n:I

    .line 137
    .line 138
    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    .line 139
    .line 140
    .line 141
    new-instance p1, Landroid/graphics/Paint;

    .line 142
    .line 143
    invoke-direct {p1}, Landroid/graphics/Paint;-><init>()V

    .line 144
    .line 145
    .line 146
    iput-object p1, p0, Lu3/b;->o:Landroid/graphics/Paint;

    .line 147
    .line 148
    invoke-virtual {p1, p3}, Landroid/graphics/Paint;->setDither(Z)V

    .line 149
    .line 150
    .line 151
    iget-object p1, p0, Lu3/b;->o:Landroid/graphics/Paint;

    .line 152
    .line 153
    invoke-virtual {p1, p3}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 154
    .line 155
    .line 156
    iget-object p1, p0, Lu3/b;->o:Landroid/graphics/Paint;

    .line 157
    .line 158
    sget-object p2, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    .line 159
    .line 160
    invoke-virtual {p1, p2}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 161
    .line 162
    .line 163
    new-instance p1, Landroid/graphics/Paint;

    .line 164
    .line 165
    invoke-direct {p1}, Landroid/graphics/Paint;-><init>()V

    .line 166
    .line 167
    .line 168
    iput-object p1, p0, Lu3/b;->p:Landroid/graphics/Paint;

    .line 169
    .line 170
    invoke-virtual {p1, p3}, Landroid/graphics/Paint;->setDither(Z)V

    .line 171
    .line 172
    .line 173
    iget-object p1, p0, Lu3/b;->p:Landroid/graphics/Paint;

    .line 174
    .line 175
    invoke-virtual {p1, p3}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 176
    .line 177
    .line 178
    iget-object p1, p0, Lu3/b;->p:Landroid/graphics/Paint;

    .line 179
    .line 180
    sget-object p2, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    .line 181
    .line 182
    invoke-virtual {p1, p2}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 183
    .line 184
    .line 185
    new-instance p1, Landroid/graphics/Path;

    .line 186
    .line 187
    invoke-direct {p1}, Landroid/graphics/Path;-><init>()V

    .line 188
    .line 189
    .line 190
    iput-object p1, p0, Lu3/b;->q:Landroid/graphics/Path;

    .line 191
    .line 192
    invoke-virtual {p1}, Landroid/graphics/Path;->reset()V

    .line 193
    .line 194
    .line 195
    new-instance p1, Landroid/graphics/Path;

    .line 196
    .line 197
    invoke-direct {p1}, Landroid/graphics/Path;-><init>()V

    .line 198
    .line 199
    .line 200
    iput-object p1, p0, Lu3/b;->r:Landroid/graphics/Path;

    .line 201
    .line 202
    invoke-virtual {p1}, Landroid/graphics/Path;->reset()V

    .line 203
    .line 204
    .line 205
    new-instance p1, Landroid/graphics/Paint;

    .line 206
    .line 207
    invoke-direct {p1}, Landroid/graphics/Paint;-><init>()V

    .line 208
    .line 209
    .line 210
    iput-object p1, p0, Lu3/b;->s:Landroid/graphics/Paint;

    .line 211
    .line 212
    invoke-virtual {p1, p3}, Landroid/graphics/Paint;->setDither(Z)V

    .line 213
    .line 214
    .line 215
    iget-object p1, p0, Lu3/b;->s:Landroid/graphics/Paint;

    .line 216
    .line 217
    invoke-virtual {p1, p3}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 218
    .line 219
    .line 220
    iget-object p1, p0, Lu3/b;->s:Landroid/graphics/Paint;

    .line 221
    .line 222
    sget-object p2, Landroid/graphics/Paint$Join;->ROUND:Landroid/graphics/Paint$Join;

    .line 223
    .line 224
    invoke-virtual {p1, p2}, Landroid/graphics/Paint;->setStrokeJoin(Landroid/graphics/Paint$Join;)V

    .line 225
    .line 226
    .line 227
    iget-object p1, p0, Lu3/b;->s:Landroid/graphics/Paint;

    .line 228
    .line 229
    sget-object p2, Landroid/graphics/Paint$Cap;->SQUARE:Landroid/graphics/Paint$Cap;

    .line 230
    .line 231
    invoke-virtual {p1, p2}, Landroid/graphics/Paint;->setStrokeCap(Landroid/graphics/Paint$Cap;)V

    .line 232
    .line 233
    .line 234
    new-instance p1, Landroid/graphics/Rect;

    .line 235
    .line 236
    invoke-direct {p1}, Landroid/graphics/Rect;-><init>()V

    .line 237
    .line 238
    .line 239
    iput-object p1, p0, Lu3/b;->t:Landroid/graphics/Rect;

    .line 240
    .line 241
    return-void
.end method


# virtual methods
.method public final a(F)I
    .locals 1

    .line 1
    iget-object v0, p0, Lu3/b;->a:Landroid/content/Context;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    iget v0, v0, Landroid/util/DisplayMetrics;->density:F

    .line 12
    .line 13
    mul-float/2addr p1, v0

    .line 14
    const/high16 v0, 0x3f000000    # 0.5f

    .line 15
    .line 16
    add-float/2addr p1, v0

    .line 17
    float-to-int p1, p1

    .line 18
    return p1
.end method

.method public final b(Landroid/graphics/Canvas;II)V
    .locals 11

    .line 1
    iget-boolean v3, p0, Lu3/b;->m:Z

    .line 2
    .line 3
    if-eqz v3, :cond_9

    .line 4
    .line 5
    iget-object v3, p0, Lu3/b;->h:Ljava/lang/String;

    .line 6
    .line 7
    if-nez v3, :cond_0

    .line 8
    .line 9
    goto/16 :goto_4

    .line 10
    .line 11
    :cond_0
    iget v3, p0, Lu3/b;->c:I

    .line 12
    .line 13
    int-to-float v4, v3

    .line 14
    iget v5, p0, Lu3/b;->d:I

    .line 15
    .line 16
    int-to-float v6, v5

    .line 17
    const/high16 v7, 0x40000000    # 2.0f

    .line 18
    .line 19
    div-float/2addr v6, v7

    .line 20
    add-float/2addr v4, v6

    .line 21
    sub-int v8, p2, v3

    .line 22
    .line 23
    sub-int/2addr v8, v5

    .line 24
    int-to-float v8, v8

    .line 25
    int-to-float v1, p2

    .line 26
    sub-int v3, p3, v3

    .line 27
    .line 28
    sub-int/2addr v3, v5

    .line 29
    int-to-float v3, v3

    .line 30
    int-to-float v2, p3

    .line 31
    iget v5, p0, Lu3/b;->n:I

    .line 32
    .line 33
    const/4 v9, 0x1

    .line 34
    const/4 v10, 0x0

    .line 35
    if-eq v5, v9, :cond_4

    .line 36
    .line 37
    const/4 v9, 0x2

    .line 38
    if-eq v5, v9, :cond_3

    .line 39
    .line 40
    const/4 v9, 0x3

    .line 41
    if-eq v5, v9, :cond_2

    .line 42
    .line 43
    const/4 v9, 0x4

    .line 44
    if-eq v5, v9, :cond_1

    .line 45
    .line 46
    goto/16 :goto_0

    .line 47
    .line 48
    :cond_1
    iget-object v5, p0, Lu3/b;->q:Landroid/graphics/Path;

    .line 49
    .line 50
    invoke-virtual {v5}, Landroid/graphics/Path;->reset()V

    .line 51
    .line 52
    .line 53
    iget-object v5, p0, Lu3/b;->q:Landroid/graphics/Path;

    .line 54
    .line 55
    invoke-virtual {v5, v8, v2}, Landroid/graphics/Path;->moveTo(FF)V

    .line 56
    .line 57
    .line 58
    iget-object v5, p0, Lu3/b;->q:Landroid/graphics/Path;

    .line 59
    .line 60
    invoke-virtual {v5, v1, v3}, Landroid/graphics/Path;->lineTo(FF)V

    .line 61
    .line 62
    .line 63
    iget v5, p0, Lu3/b;->d:I

    .line 64
    .line 65
    int-to-float v5, v5

    .line 66
    add-float/2addr v5, v3

    .line 67
    iget-object v9, p0, Lu3/b;->q:Landroid/graphics/Path;

    .line 68
    .line 69
    invoke-virtual {v9, v1, v5}, Landroid/graphics/Path;->lineTo(FF)V

    .line 70
    .line 71
    .line 72
    iget v5, p0, Lu3/b;->d:I

    .line 73
    .line 74
    int-to-float v5, v5

    .line 75
    add-float/2addr v5, v8

    .line 76
    iget-object v9, p0, Lu3/b;->q:Landroid/graphics/Path;

    .line 77
    .line 78
    invoke-virtual {v9, v5, v2}, Landroid/graphics/Path;->lineTo(FF)V

    .line 79
    .line 80
    .line 81
    iget-object v5, p0, Lu3/b;->q:Landroid/graphics/Path;

    .line 82
    .line 83
    invoke-virtual {v5}, Landroid/graphics/Path;->close()V

    .line 84
    .line 85
    .line 86
    iget-object v5, p0, Lu3/b;->r:Landroid/graphics/Path;

    .line 87
    .line 88
    invoke-virtual {v5}, Landroid/graphics/Path;->reset()V

    .line 89
    .line 90
    .line 91
    iget-object v5, p0, Lu3/b;->r:Landroid/graphics/Path;

    .line 92
    .line 93
    add-float/2addr v8, v6

    .line 94
    invoke-virtual {v5, v8, v2}, Landroid/graphics/Path;->moveTo(FF)V

    .line 95
    .line 96
    .line 97
    iget-object v2, p0, Lu3/b;->r:Landroid/graphics/Path;

    .line 98
    .line 99
    add-float/2addr v3, v6

    .line 100
    invoke-virtual {v2, v1, v3}, Landroid/graphics/Path;->lineTo(FF)V

    .line 101
    .line 102
    .line 103
    iget-object v1, p0, Lu3/b;->r:Landroid/graphics/Path;

    .line 104
    .line 105
    invoke-virtual {v1}, Landroid/graphics/Path;->close()V

    .line 106
    .line 107
    .line 108
    goto/16 :goto_0

    .line 109
    .line 110
    :cond_2
    iget-object v1, p0, Lu3/b;->q:Landroid/graphics/Path;

    .line 111
    .line 112
    invoke-virtual {v1}, Landroid/graphics/Path;->reset()V

    .line 113
    .line 114
    .line 115
    iget-object v1, p0, Lu3/b;->q:Landroid/graphics/Path;

    .line 116
    .line 117
    invoke-virtual {v1, v10, v3}, Landroid/graphics/Path;->moveTo(FF)V

    .line 118
    .line 119
    .line 120
    iget v1, p0, Lu3/b;->c:I

    .line 121
    .line 122
    iget v5, p0, Lu3/b;->d:I

    .line 123
    .line 124
    add-int/2addr v1, v5

    .line 125
    int-to-float v1, v1

    .line 126
    iget-object v5, p0, Lu3/b;->q:Landroid/graphics/Path;

    .line 127
    .line 128
    invoke-virtual {v5, v1, v2}, Landroid/graphics/Path;->lineTo(FF)V

    .line 129
    .line 130
    .line 131
    iget v1, p0, Lu3/b;->c:I

    .line 132
    .line 133
    int-to-float v1, v1

    .line 134
    iget-object v5, p0, Lu3/b;->q:Landroid/graphics/Path;

    .line 135
    .line 136
    invoke-virtual {v5, v1, v2}, Landroid/graphics/Path;->lineTo(FF)V

    .line 137
    .line 138
    .line 139
    iget v1, p0, Lu3/b;->d:I

    .line 140
    .line 141
    int-to-float v1, v1

    .line 142
    add-float/2addr v1, v3

    .line 143
    iget-object v5, p0, Lu3/b;->q:Landroid/graphics/Path;

    .line 144
    .line 145
    invoke-virtual {v5, v10, v1}, Landroid/graphics/Path;->lineTo(FF)V

    .line 146
    .line 147
    .line 148
    iget-object v1, p0, Lu3/b;->q:Landroid/graphics/Path;

    .line 149
    .line 150
    invoke-virtual {v1}, Landroid/graphics/Path;->close()V

    .line 151
    .line 152
    .line 153
    iget-object v1, p0, Lu3/b;->r:Landroid/graphics/Path;

    .line 154
    .line 155
    invoke-virtual {v1}, Landroid/graphics/Path;->reset()V

    .line 156
    .line 157
    .line 158
    iget-object v1, p0, Lu3/b;->r:Landroid/graphics/Path;

    .line 159
    .line 160
    add-float/2addr v3, v6

    .line 161
    invoke-virtual {v1, v10, v3}, Landroid/graphics/Path;->moveTo(FF)V

    .line 162
    .line 163
    .line 164
    iget v1, p0, Lu3/b;->c:I

    .line 165
    .line 166
    int-to-float v1, v1

    .line 167
    add-float/2addr v1, v6

    .line 168
    iget-object v3, p0, Lu3/b;->r:Landroid/graphics/Path;

    .line 169
    .line 170
    invoke-virtual {v3, v1, v2}, Landroid/graphics/Path;->lineTo(FF)V

    .line 171
    .line 172
    .line 173
    iget-object v1, p0, Lu3/b;->r:Landroid/graphics/Path;

    .line 174
    .line 175
    invoke-virtual {v1}, Landroid/graphics/Path;->close()V

    .line 176
    .line 177
    .line 178
    goto/16 :goto_0

    .line 179
    .line 180
    :cond_3
    iget-object v2, p0, Lu3/b;->q:Landroid/graphics/Path;

    .line 181
    .line 182
    invoke-virtual {v2}, Landroid/graphics/Path;->reset()V

    .line 183
    .line 184
    .line 185
    iget-object v2, p0, Lu3/b;->q:Landroid/graphics/Path;

    .line 186
    .line 187
    invoke-virtual {v2, v8, v10}, Landroid/graphics/Path;->moveTo(FF)V

    .line 188
    .line 189
    .line 190
    iget v2, p0, Lu3/b;->d:I

    .line 191
    .line 192
    int-to-float v2, v2

    .line 193
    add-float/2addr v2, v8

    .line 194
    iget-object v3, p0, Lu3/b;->q:Landroid/graphics/Path;

    .line 195
    .line 196
    invoke-virtual {v3, v2, v10}, Landroid/graphics/Path;->lineTo(FF)V

    .line 197
    .line 198
    .line 199
    iget v2, p0, Lu3/b;->c:I

    .line 200
    .line 201
    int-to-float v2, v2

    .line 202
    iget-object v3, p0, Lu3/b;->q:Landroid/graphics/Path;

    .line 203
    .line 204
    invoke-virtual {v3, v1, v2}, Landroid/graphics/Path;->lineTo(FF)V

    .line 205
    .line 206
    .line 207
    iget v2, p0, Lu3/b;->c:I

    .line 208
    .line 209
    iget v3, p0, Lu3/b;->d:I

    .line 210
    .line 211
    add-int/2addr v2, v3

    .line 212
    int-to-float v2, v2

    .line 213
    iget-object v3, p0, Lu3/b;->q:Landroid/graphics/Path;

    .line 214
    .line 215
    invoke-virtual {v3, v1, v2}, Landroid/graphics/Path;->lineTo(FF)V

    .line 216
    .line 217
    .line 218
    iget-object v2, p0, Lu3/b;->q:Landroid/graphics/Path;

    .line 219
    .line 220
    invoke-virtual {v2}, Landroid/graphics/Path;->close()V

    .line 221
    .line 222
    .line 223
    iget-object v2, p0, Lu3/b;->r:Landroid/graphics/Path;

    .line 224
    .line 225
    invoke-virtual {v2}, Landroid/graphics/Path;->reset()V

    .line 226
    .line 227
    .line 228
    iget-object v2, p0, Lu3/b;->r:Landroid/graphics/Path;

    .line 229
    .line 230
    add-float/2addr v8, v6

    .line 231
    invoke-virtual {v2, v8, v10}, Landroid/graphics/Path;->moveTo(FF)V

    .line 232
    .line 233
    .line 234
    iget v2, p0, Lu3/b;->c:I

    .line 235
    .line 236
    int-to-float v2, v2

    .line 237
    add-float/2addr v2, v6

    .line 238
    iget-object v3, p0, Lu3/b;->r:Landroid/graphics/Path;

    .line 239
    .line 240
    invoke-virtual {v3, v1, v2}, Landroid/graphics/Path;->lineTo(FF)V

    .line 241
    .line 242
    .line 243
    iget-object v1, p0, Lu3/b;->r:Landroid/graphics/Path;

    .line 244
    .line 245
    invoke-virtual {v1}, Landroid/graphics/Path;->close()V

    .line 246
    .line 247
    .line 248
    goto :goto_0

    .line 249
    :cond_4
    iget-object v1, p0, Lu3/b;->q:Landroid/graphics/Path;

    .line 250
    .line 251
    invoke-virtual {v1}, Landroid/graphics/Path;->reset()V

    .line 252
    .line 253
    .line 254
    iget v1, p0, Lu3/b;->c:I

    .line 255
    .line 256
    int-to-float v1, v1

    .line 257
    iget-object v2, p0, Lu3/b;->q:Landroid/graphics/Path;

    .line 258
    .line 259
    invoke-virtual {v2, v10, v1}, Landroid/graphics/Path;->moveTo(FF)V

    .line 260
    .line 261
    .line 262
    iget v1, p0, Lu3/b;->c:I

    .line 263
    .line 264
    int-to-float v1, v1

    .line 265
    iget-object v2, p0, Lu3/b;->q:Landroid/graphics/Path;

    .line 266
    .line 267
    invoke-virtual {v2, v1, v10}, Landroid/graphics/Path;->lineTo(FF)V

    .line 268
    .line 269
    .line 270
    iget v1, p0, Lu3/b;->c:I

    .line 271
    .line 272
    iget v2, p0, Lu3/b;->d:I

    .line 273
    .line 274
    add-int/2addr v1, v2

    .line 275
    int-to-float v1, v1

    .line 276
    iget-object v2, p0, Lu3/b;->q:Landroid/graphics/Path;

    .line 277
    .line 278
    invoke-virtual {v2, v1, v10}, Landroid/graphics/Path;->lineTo(FF)V

    .line 279
    .line 280
    .line 281
    iget v1, p0, Lu3/b;->c:I

    .line 282
    .line 283
    iget v2, p0, Lu3/b;->d:I

    .line 284
    .line 285
    add-int/2addr v1, v2

    .line 286
    int-to-float v1, v1

    .line 287
    iget-object v2, p0, Lu3/b;->q:Landroid/graphics/Path;

    .line 288
    .line 289
    invoke-virtual {v2, v10, v1}, Landroid/graphics/Path;->lineTo(FF)V

    .line 290
    .line 291
    .line 292
    iget-object v1, p0, Lu3/b;->q:Landroid/graphics/Path;

    .line 293
    .line 294
    invoke-virtual {v1}, Landroid/graphics/Path;->close()V

    .line 295
    .line 296
    .line 297
    iget-object v1, p0, Lu3/b;->r:Landroid/graphics/Path;

    .line 298
    .line 299
    invoke-virtual {v1}, Landroid/graphics/Path;->reset()V

    .line 300
    .line 301
    .line 302
    iget v1, p0, Lu3/b;->c:I

    .line 303
    .line 304
    int-to-float v1, v1

    .line 305
    add-float/2addr v1, v6

    .line 306
    iget-object v2, p0, Lu3/b;->r:Landroid/graphics/Path;

    .line 307
    .line 308
    invoke-virtual {v2, v10, v1}, Landroid/graphics/Path;->moveTo(FF)V

    .line 309
    .line 310
    .line 311
    iget v1, p0, Lu3/b;->c:I

    .line 312
    .line 313
    int-to-float v1, v1

    .line 314
    add-float/2addr v1, v6

    .line 315
    iget-object v2, p0, Lu3/b;->r:Landroid/graphics/Path;

    .line 316
    .line 317
    invoke-virtual {v2, v1, v10}, Landroid/graphics/Path;->lineTo(FF)V

    .line 318
    .line 319
    .line 320
    iget-object v1, p0, Lu3/b;->r:Landroid/graphics/Path;

    .line 321
    .line 322
    invoke-virtual {v1}, Landroid/graphics/Path;->close()V

    .line 323
    .line 324
    .line 325
    :goto_0
    iget-object v1, p0, Lu3/b;->o:Landroid/graphics/Paint;

    .line 326
    .line 327
    iget v2, p0, Lu3/b;->e:I

    .line 328
    .line 329
    invoke-virtual {v1, v2}, Landroid/graphics/Paint;->setColor(I)V

    .line 330
    .line 331
    .line 332
    iget v1, p0, Lu3/b;->b:I

    .line 333
    .line 334
    if-eqz v1, :cond_5

    .line 335
    .line 336
    iget-object v2, p0, Lu3/b;->o:Landroid/graphics/Paint;

    .line 337
    .line 338
    invoke-virtual {v2, v1}, Landroid/graphics/Paint;->setAlpha(I)V

    .line 339
    .line 340
    .line 341
    :cond_5
    iget-object v1, p0, Lu3/b;->p:Landroid/graphics/Paint;

    .line 342
    .line 343
    iget v2, p0, Lu3/b;->g:I

    .line 344
    .line 345
    invoke-virtual {v1, v2}, Landroid/graphics/Paint;->setColor(I)V

    .line 346
    .line 347
    .line 348
    iget v1, p0, Lu3/b;->f:I

    .line 349
    .line 350
    int-to-float v1, v1

    .line 351
    iget-object v2, p0, Lu3/b;->p:Landroid/graphics/Paint;

    .line 352
    .line 353
    invoke-virtual {v2, v1}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 354
    .line 355
    .line 356
    iget-object v1, p0, Lu3/b;->q:Landroid/graphics/Path;

    .line 357
    .line 358
    iget-object v2, p0, Lu3/b;->o:Landroid/graphics/Paint;

    .line 359
    .line 360
    invoke-virtual {p1, v1, v2}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    .line 361
    .line 362
    .line 363
    iget-object v1, p0, Lu3/b;->q:Landroid/graphics/Path;

    .line 364
    .line 365
    iget-object v2, p0, Lu3/b;->p:Landroid/graphics/Paint;

    .line 366
    .line 367
    invoke-virtual {p1, v1, v2}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    .line 368
    .line 369
    .line 370
    iget v1, p0, Lu3/b;->i:I

    .line 371
    .line 372
    int-to-float v1, v1

    .line 373
    iget-object v2, p0, Lu3/b;->s:Landroid/graphics/Paint;

    .line 374
    .line 375
    invoke-virtual {v2, v1}, Landroid/graphics/Paint;->setTextSize(F)V

    .line 376
    .line 377
    .line 378
    iget-object v1, p0, Lu3/b;->s:Landroid/graphics/Paint;

    .line 379
    .line 380
    iget v2, p0, Lu3/b;->l:I

    .line 381
    .line 382
    invoke-virtual {v1, v2}, Landroid/graphics/Paint;->setColor(I)V

    .line 383
    .line 384
    .line 385
    iget-object v1, p0, Lu3/b;->h:Ljava/lang/String;

    .line 386
    .line 387
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 388
    .line 389
    .line 390
    move-result v2

    .line 391
    iget-object v3, p0, Lu3/b;->t:Landroid/graphics/Rect;

    .line 392
    .line 393
    iget-object v5, p0, Lu3/b;->s:Landroid/graphics/Paint;

    .line 394
    .line 395
    const/4 v6, 0x0

    .line 396
    invoke-virtual {v5, v1, v6, v2, v3}, Landroid/graphics/Paint;->getTextBounds(Ljava/lang/String;IILandroid/graphics/Rect;)V

    .line 397
    .line 398
    .line 399
    iget-object v1, p0, Lu3/b;->k:Ljava/lang/String;

    .line 400
    .line 401
    if-eqz v1, :cond_7

    .line 402
    .line 403
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 404
    .line 405
    .line 406
    move-result v1

    .line 407
    if-nez v1, :cond_6

    .line 408
    .line 409
    goto :goto_1

    .line 410
    :cond_6
    iget-object v1, p0, Lu3/b;->k:Ljava/lang/String;

    .line 411
    .line 412
    invoke-static {v1}, Lt1/a;->c(Ljava/lang/String;)V

    .line 413
    .line 414
    .line 415
    const/4 v1, 0x0

    .line 416
    iget-object v2, p0, Lu3/b;->s:Landroid/graphics/Paint;

    .line 417
    .line 418
    invoke-virtual {v2, v1}, Landroid/graphics/Paint;->setTypeface(Landroid/graphics/Typeface;)Landroid/graphics/Typeface;

    .line 419
    .line 420
    .line 421
    goto :goto_2

    .line 422
    :cond_7
    :goto_1
    iget v1, p0, Lu3/b;->j:I

    .line 423
    .line 424
    invoke-static {v1}, Landroid/graphics/Typeface;->defaultFromStyle(I)Landroid/graphics/Typeface;

    .line 425
    .line 426
    .line 427
    move-result-object v1

    .line 428
    iget-object v2, p0, Lu3/b;->s:Landroid/graphics/Paint;

    .line 429
    .line 430
    invoke-virtual {v2, v1}, Landroid/graphics/Paint;->setTypeface(Landroid/graphics/Typeface;)Landroid/graphics/Typeface;

    .line 431
    .line 432
    .line 433
    :goto_2
    const v1, 0x3fb504f3

    .line 434
    .line 435
    .line 436
    mul-float/2addr v4, v1

    .line 437
    div-float/2addr v4, v7

    .line 438
    iget-object v1, p0, Lu3/b;->t:Landroid/graphics/Rect;

    .line 439
    .line 440
    invoke-virtual {v1}, Landroid/graphics/Rect;->width()I

    .line 441
    .line 442
    .line 443
    move-result v1

    .line 444
    int-to-float v1, v1

    .line 445
    div-float/2addr v1, v7

    .line 446
    sub-float/2addr v4, v1

    .line 447
    cmpg-float v1, v4, v10

    .line 448
    .line 449
    if-gez v1, :cond_8

    .line 450
    .line 451
    move v3, v10

    .line 452
    goto :goto_3

    .line 453
    :cond_8
    move v3, v4

    .line 454
    :goto_3
    iget-object v1, p0, Lu3/b;->h:Ljava/lang/String;

    .line 455
    .line 456
    iget-object v2, p0, Lu3/b;->t:Landroid/graphics/Rect;

    .line 457
    .line 458
    invoke-virtual {v2}, Landroid/graphics/Rect;->height()I

    .line 459
    .line 460
    .line 461
    move-result v2

    .line 462
    int-to-float v2, v2

    .line 463
    div-float v4, v2, v7

    .line 464
    .line 465
    iget-object v5, p0, Lu3/b;->s:Landroid/graphics/Paint;

    .line 466
    .line 467
    iget-object v2, p0, Lu3/b;->r:Landroid/graphics/Path;

    .line 468
    .line 469
    move-object v0, p1

    .line 470
    invoke-virtual/range {v0 .. v5}, Landroid/graphics/Canvas;->drawTextOnPath(Ljava/lang/String;Landroid/graphics/Path;FFLandroid/graphics/Paint;)V

    .line 471
    .line 472
    .line 473
    :cond_9
    :goto_4
    return-void
.end method

.method public final c(F)I
    .locals 1

    .line 1
    iget-object v0, p0, Lu3/b;->a:Landroid/content/Context;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    iget v0, v0, Landroid/util/DisplayMetrics;->density:F

    .line 12
    .line 13
    div-float/2addr p1, v0

    .line 14
    const/high16 v0, 0x3f000000    # 0.5f

    .line 15
    .line 16
    add-float/2addr p1, v0

    .line 17
    float-to-int p1, p1

    .line 18
    return p1
.end method

.method public final d(Landroid/view/View;I)V
    .locals 2

    .line 1
    iget v0, p0, Lu3/b;->c:I

    .line 2
    .line 3
    int-to-float p2, p2

    .line 4
    invoke-virtual {p0, p2}, Lu3/b;->a(F)I

    .line 5
    .line 6
    .line 7
    move-result v1

    .line 8
    if-eq v0, v1, :cond_0

    .line 9
    .line 10
    invoke-virtual {p0, p2}, Lu3/b;->a(F)I

    .line 11
    .line 12
    .line 13
    move-result p2

    .line 14
    iput p2, p0, Lu3/b;->c:I

    .line 15
    .line 16
    invoke-virtual {p1}, Landroid/view/View;->invalidate()V

    .line 17
    .line 18
    .line 19
    :cond_0
    return-void
.end method

.method public final e(Landroid/view/View;I)V
    .locals 2

    .line 1
    iget v0, p0, Lu3/b;->d:I

    .line 2
    .line 3
    int-to-float p2, p2

    .line 4
    invoke-virtual {p0, p2}, Lu3/b;->a(F)I

    .line 5
    .line 6
    .line 7
    move-result v1

    .line 8
    if-eq v0, v1, :cond_0

    .line 9
    .line 10
    invoke-virtual {p0, p2}, Lu3/b;->a(F)I

    .line 11
    .line 12
    .line 13
    move-result p2

    .line 14
    iput p2, p0, Lu3/b;->d:I

    .line 15
    .line 16
    invoke-virtual {p1}, Landroid/view/View;->invalidate()V

    .line 17
    .line 18
    .line 19
    :cond_0
    return-void
.end method

.method public final f(Landroid/view/View;I)V
    .locals 1

    .line 1
    iget v0, p0, Lu3/b;->n:I

    .line 2
    .line 3
    if-eq v0, p2, :cond_0

    .line 4
    .line 5
    const/4 v0, 0x4

    .line 6
    if-gt p2, v0, :cond_0

    .line 7
    .line 8
    const/4 v0, 0x1

    .line 9
    if-lt p2, v0, :cond_0

    .line 10
    .line 11
    iput p2, p0, Lu3/b;->n:I

    .line 12
    .line 13
    invoke-virtual {p1}, Landroid/view/View;->invalidate()V

    .line 14
    .line 15
    .line 16
    :cond_0
    return-void
.end method
