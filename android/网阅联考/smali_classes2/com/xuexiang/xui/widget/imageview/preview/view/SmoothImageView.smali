.class public Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;
.super Lcom/xuexiang/xui/widget/imageview/photoview/PhotoView;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$i;,
        Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$j;,
        Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$g;,
        Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$h;,
        Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$Status;
    }
.end annotation


# static fields
.field public static y:I = 0x190


# instance fields
.field public c:Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$Status;

.field public d:Landroid/graphics/Paint;

.field public e:Landroid/graphics/Matrix;

.field public f:Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$i;

.field public g:Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$i;

.field public h:Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$i;

.field public i:Landroid/graphics/Rect;

.field public j:Z

.field public k:I

.field public l:I

.field public m:Z

.field public n:Landroid/animation/ValueAnimator;

.field public o:F

.field public p:I

.field public q:I

.field public r:Z

.field public s:Z

.field public t:I

.field public u:Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$g;

.field public v:Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$h;

.field public w:Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$i;

.field public x:Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$j;


# direct methods
.method public static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Lcom/xuexiang/xui/widget/imageview/photoview/PhotoView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 2
    .line 3
    .line 4
    sget-object p1, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$Status;->a:Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$Status;

    .line 5
    .line 6
    iput-object p1, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->c:Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$Status;

    .line 7
    .line 8
    const/high16 p1, 0x3f000000    # 0.5f

    .line 9
    .line 10
    iput p1, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->o:F

    .line 11
    .line 12
    const/4 p1, 0x0

    .line 13
    iput-boolean p1, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->r:Z

    .line 14
    .line 15
    iput-boolean p1, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->s:Z

    .line 16
    .line 17
    iput p1, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->t:I

    .line 18
    .line 19
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->k()V

    .line 20
    .line 21
    .line 22
    return-void
.end method

.method public static synthetic d(Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;)Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$g;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->u:Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$g;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic e(Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;)Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$i;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->h:Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$i;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic f(Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;)Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$j;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->x:Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$j;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic g(Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;)Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$Status;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->c:Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$Status;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic h(Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$Status;)Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$Status;
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->c:Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$Status;

    .line 2
    .line 3
    return-object p1
.end method

.method public static setDuration(I)V
    .locals 0

    .line 1
    sput p0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->y:I

    .line 2
    .line 3
    return-void
.end method


# virtual methods
.method public dispatchTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 7

    .line 1
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/imageview/photoview/PhotoView;->getScale()F

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    const/high16 v2, 0x3f800000    # 1.0f

    .line 10
    .line 11
    cmpl-float v1, v1, v2

    .line 12
    .line 13
    const/4 v3, 0x3

    .line 14
    const/4 v4, 0x1

    .line 15
    if-nez v1, :cond_e

    .line 16
    .line 17
    const/4 v1, 0x0

    .line 18
    if-eqz v0, :cond_b

    .line 19
    .line 20
    if-eq v0, v4, :cond_8

    .line 21
    .line 22
    const/4 v5, 0x2

    .line 23
    if-eq v0, v5, :cond_0

    .line 24
    .line 25
    if-eq v0, v3, :cond_8

    .line 26
    .line 27
    goto/16 :goto_3

    .line 28
    .line 29
    :cond_0
    iget-boolean v0, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->s:Z

    .line 30
    .line 31
    if-nez v0, :cond_1

    .line 32
    .line 33
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getPointerCount()I

    .line 34
    .line 35
    .line 36
    move-result v0

    .line 37
    if-ne v0, v4, :cond_1

    .line 38
    .line 39
    goto/16 :goto_3

    .line 40
    .line 41
    :cond_1
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    .line 42
    .line 43
    .line 44
    move-result v0

    .line 45
    float-to-int v0, v0

    .line 46
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    .line 47
    .line 48
    .line 49
    move-result v3

    .line 50
    float-to-int v3, v3

    .line 51
    iget v5, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->p:I

    .line 52
    .line 53
    sub-int/2addr v0, v5

    .line 54
    iget v5, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->q:I

    .line 55
    .line 56
    sub-int/2addr v3, v5

    .line 57
    iget-boolean v5, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->r:Z

    .line 58
    .line 59
    if-nez v5, :cond_3

    .line 60
    .line 61
    invoke-static {v0}, Ljava/lang/Math;->abs(I)I

    .line 62
    .line 63
    .line 64
    move-result v5

    .line 65
    invoke-static {v3}, Ljava/lang/Math;->abs(I)I

    .line 66
    .line 67
    .line 68
    move-result v6

    .line 69
    if-gt v5, v6, :cond_2

    .line 70
    .line 71
    invoke-static {v3}, Ljava/lang/Math;->abs(I)I

    .line 72
    .line 73
    .line 74
    move-result v5

    .line 75
    const/4 v6, 0x5

    .line 76
    if-ge v5, v6, :cond_3

    .line 77
    .line 78
    :cond_2
    move v5, v4

    .line 79
    goto :goto_0

    .line 80
    :cond_3
    move v5, v1

    .line 81
    :goto_0
    if-eqz v5, :cond_4

    .line 82
    .line 83
    invoke-super {p0, p1}, Landroid/widget/ImageView;->dispatchTouchEvent(Landroid/view/MotionEvent;)Z

    .line 84
    .line 85
    .line 86
    move-result p1

    .line 87
    return p1

    .line 88
    :cond_4
    iget-boolean v5, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->m:Z

    .line 89
    .line 90
    if-eqz v5, :cond_5

    .line 91
    .line 92
    invoke-super {p0, p1}, Landroid/widget/ImageView;->dispatchTouchEvent(Landroid/view/MotionEvent;)Z

    .line 93
    .line 94
    .line 95
    move-result p1

    .line 96
    return p1

    .line 97
    :cond_5
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getPointerCount()I

    .line 98
    .line 99
    .line 100
    move-result v5

    .line 101
    if-ne v5, v4, :cond_12

    .line 102
    .line 103
    sget-object p1, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$Status;->d:Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$Status;

    .line 104
    .line 105
    iput-object p1, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->c:Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$Status;

    .line 106
    .line 107
    invoke-virtual {p0, v0}, Landroid/view/View;->offsetLeftAndRight(I)V

    .line 108
    .line 109
    .line 110
    invoke-virtual {p0, v3}, Landroid/view/View;->offsetTopAndBottom(I)V

    .line 111
    .line 112
    .line 113
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->m()F

    .line 114
    .line 115
    .line 116
    move-result p1

    .line 117
    const v0, 0x3dcccccd    # 0.1f

    .line 118
    .line 119
    .line 120
    mul-float/2addr v0, p1

    .line 121
    sub-float v0, v2, v0

    .line 122
    .line 123
    invoke-virtual {p0, v0}, Landroid/view/View;->setScaleY(F)V

    .line 124
    .line 125
    .line 126
    invoke-virtual {p0, v0}, Landroid/view/View;->setScaleX(F)V

    .line 127
    .line 128
    .line 129
    iput-boolean v4, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->r:Z

    .line 130
    .line 131
    const/high16 v0, 0x3f000000    # 0.5f

    .line 132
    .line 133
    mul-float/2addr p1, v0

    .line 134
    sub-float/2addr v2, p1

    .line 135
    const/high16 p1, 0x437f0000    # 255.0f

    .line 136
    .line 137
    mul-float/2addr v2, p1

    .line 138
    float-to-int p1, v2

    .line 139
    iput p1, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->t:I

    .line 140
    .line 141
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    .line 142
    .line 143
    .line 144
    iget p1, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->t:I

    .line 145
    .line 146
    if-gez p1, :cond_6

    .line 147
    .line 148
    iput v1, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->t:I

    .line 149
    .line 150
    :cond_6
    iget-object p1, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->u:Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$g;

    .line 151
    .line 152
    if-eqz p1, :cond_7

    .line 153
    .line 154
    iget v0, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->t:I

    .line 155
    .line 156
    invoke-interface {p1, v0}, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$g;->a(I)V

    .line 157
    .line 158
    .line 159
    :cond_7
    return v4

    .line 160
    :cond_8
    iget-boolean v0, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->r:Z

    .line 161
    .line 162
    if-eqz v0, :cond_12

    .line 163
    .line 164
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->m()F

    .line 165
    .line 166
    .line 167
    move-result p1

    .line 168
    iget v0, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->o:F

    .line 169
    .line 170
    cmpg-float p1, p1, v0

    .line 171
    .line 172
    if-gtz p1, :cond_9

    .line 173
    .line 174
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->n()V

    .line 175
    .line 176
    .line 177
    goto :goto_1

    .line 178
    :cond_9
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->i()V

    .line 179
    .line 180
    .line 181
    sget p1, Lcom/xuexiang/xui/R$id;->item_image_key:I

    .line 182
    .line 183
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 184
    .line 185
    invoke-virtual {p0, p1, v0}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    .line 186
    .line 187
    .line 188
    iget-object p1, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->v:Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$h;

    .line 189
    .line 190
    if-eqz p1, :cond_a

    .line 191
    .line 192
    invoke-interface {p1}, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$h;->a()V

    .line 193
    .line 194
    .line 195
    :cond_a
    :goto_1
    return v4

    .line 196
    :cond_b
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    .line 197
    .line 198
    .line 199
    move-result v0

    .line 200
    float-to-int v0, v0

    .line 201
    iput v0, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->p:I

    .line 202
    .line 203
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    .line 204
    .line 205
    .line 206
    move-result v0

    .line 207
    float-to-int v0, v0

    .line 208
    iput v0, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->q:I

    .line 209
    .line 210
    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->w:Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$i;

    .line 211
    .line 212
    if-nez v0, :cond_c

    .line 213
    .line 214
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->l()V

    .line 215
    .line 216
    .line 217
    :cond_c
    iput-boolean v1, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->s:Z

    .line 218
    .line 219
    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->w:Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$i;

    .line 220
    .line 221
    if-eqz v0, :cond_d

    .line 222
    .line 223
    iget v2, v0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$i;->b:F

    .line 224
    .line 225
    float-to-int v3, v2

    .line 226
    iget v0, v0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$i;->d:F

    .line 227
    .line 228
    add-float/2addr v0, v2

    .line 229
    float-to-int v0, v0

    .line 230
    iget v2, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->q:I

    .line 231
    .line 232
    if-lt v2, v3, :cond_d

    .line 233
    .line 234
    if-lt v0, v2, :cond_d

    .line 235
    .line 236
    iput-boolean v4, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->s:Z

    .line 237
    .line 238
    :cond_d
    iput-boolean v1, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->r:Z

    .line 239
    .line 240
    goto :goto_3

    .line 241
    :cond_e
    if-eq v0, v4, :cond_f

    .line 242
    .line 243
    if-eq v0, v3, :cond_f

    .line 244
    .line 245
    goto :goto_3

    .line 246
    :cond_f
    iget-boolean v0, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->r:Z

    .line 247
    .line 248
    if-eqz v0, :cond_12

    .line 249
    .line 250
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->m()F

    .line 251
    .line 252
    .line 253
    move-result p1

    .line 254
    iget v0, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->o:F

    .line 255
    .line 256
    cmpg-float p1, p1, v0

    .line 257
    .line 258
    if-gtz p1, :cond_10

    .line 259
    .line 260
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->n()V

    .line 261
    .line 262
    .line 263
    goto :goto_2

    .line 264
    :cond_10
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->i()V

    .line 265
    .line 266
    .line 267
    sget p1, Lcom/xuexiang/xui/R$id;->item_image_key:I

    .line 268
    .line 269
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 270
    .line 271
    invoke-virtual {p0, p1, v0}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    .line 272
    .line 273
    .line 274
    iget-object p1, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->v:Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$h;

    .line 275
    .line 276
    if-eqz p1, :cond_11

    .line 277
    .line 278
    invoke-interface {p1}, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$h;->a()V

    .line 279
    .line 280
    .line 281
    :cond_11
    :goto_2
    return v4

    .line 282
    :cond_12
    :goto_3
    invoke-super {p0, p1}, Landroid/widget/ImageView;->dispatchTouchEvent(Landroid/view/MotionEvent;)Z

    .line 283
    .line 284
    .line 285
    move-result p1

    .line 286
    return p1
.end method

.method public final i()V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->w:Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$i;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$i;->a()Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$i;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    iget-object v1, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->w:Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$i;

    .line 10
    .line 11
    iget v1, v1, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$i;->b:F

    .line 12
    .line 13
    invoke-virtual {p0}, Landroid/view/View;->getTop()I

    .line 14
    .line 15
    .line 16
    move-result v2

    .line 17
    int-to-float v2, v2

    .line 18
    add-float/2addr v1, v2

    .line 19
    iput v1, v0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$i;->b:F

    .line 20
    .line 21
    iget-object v1, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->w:Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$i;

    .line 22
    .line 23
    iget v1, v1, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$i;->a:F

    .line 24
    .line 25
    invoke-virtual {p0}, Landroid/view/View;->getLeft()I

    .line 26
    .line 27
    .line 28
    move-result v2

    .line 29
    int-to-float v2, v2

    .line 30
    add-float/2addr v1, v2

    .line 31
    iput v1, v0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$i;->a:F

    .line 32
    .line 33
    iget v1, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->t:I

    .line 34
    .line 35
    iput v1, v0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$i;->e:I

    .line 36
    .line 37
    iget-object v1, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->w:Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$i;

    .line 38
    .line 39
    iget v1, v1, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$i;->f:F

    .line 40
    .line 41
    const/high16 v2, 0x3f800000    # 1.0f

    .line 42
    .line 43
    invoke-virtual {p0}, Landroid/view/View;->getScaleX()F

    .line 44
    .line 45
    .line 46
    move-result v3

    .line 47
    sub-float/2addr v2, v3

    .line 48
    iget-object v3, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->w:Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$i;

    .line 49
    .line 50
    iget v3, v3, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$i;->f:F

    .line 51
    .line 52
    mul-float/2addr v2, v3

    .line 53
    sub-float/2addr v1, v2

    .line 54
    iput v1, v0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$i;->f:F

    .line 55
    .line 56
    invoke-virtual {v0}, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$i;->a()Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$i;

    .line 57
    .line 58
    .line 59
    move-result-object v1

    .line 60
    iput-object v1, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->h:Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$i;

    .line 61
    .line 62
    invoke-virtual {v0}, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$i;->a()Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$i;

    .line 63
    .line 64
    .line 65
    move-result-object v0

    .line 66
    iput-object v0, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->g:Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$i;

    .line 67
    .line 68
    :cond_0
    return-void
.end method

.method public j()Z
    .locals 3

    .line 1
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/imageview/photoview/PhotoView;->getScale()F

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/high16 v1, 0x3f800000    # 1.0f

    .line 6
    .line 7
    cmpl-float v0, v0, v1

    .line 8
    .line 9
    const/4 v2, 0x1

    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    invoke-virtual {p0, v1, v2}, Lcom/xuexiang/xui/widget/imageview/photoview/PhotoView;->c(FZ)V

    .line 13
    .line 14
    .line 15
    const/4 v0, 0x0

    .line 16
    return v0

    .line 17
    :cond_0
    return v2
.end method

.method public final k()V
    .locals 2

    .line 1
    new-instance v0, Landroid/graphics/Paint;

    .line 2
    .line 3
    invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V

    .line 4
    .line 5
    .line 6
    iput-object v0, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->d:Landroid/graphics/Paint;

    .line 7
    .line 8
    sget-object v1, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    .line 9
    .line 10
    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 11
    .line 12
    .line 13
    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->d:Landroid/graphics/Paint;

    .line 14
    .line 15
    const/high16 v1, -0x1000000

    .line 16
    .line 17
    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 18
    .line 19
    .line 20
    new-instance v0, Landroid/graphics/Matrix;

    .line 21
    .line 22
    invoke-direct {v0}, Landroid/graphics/Matrix;-><init>()V

    .line 23
    .line 24
    .line 25
    iput-object v0, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->e:Landroid/graphics/Matrix;

    .line 26
    .line 27
    sget-object v0, Landroid/widget/ImageView$ScaleType;->FIT_CENTER:Landroid/widget/ImageView$ScaleType;

    .line 28
    .line 29
    invoke-virtual {p0, v0}, Lcom/xuexiang/xui/widget/imageview/photoview/PhotoView;->setScaleType(Landroid/widget/ImageView$ScaleType;)V

    .line 30
    .line 31
    .line 32
    return-void
.end method

.method public final l()V
    .locals 5

    .line 1
    invoke-virtual {p0}, Landroid/widget/ImageView;->getDrawable()Landroid/graphics/drawable/Drawable;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->f:Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$i;

    .line 9
    .line 10
    if-eqz v0, :cond_1

    .line 11
    .line 12
    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->g:Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$i;

    .line 13
    .line 14
    if-eqz v0, :cond_1

    .line 15
    .line 16
    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->h:Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$i;

    .line 17
    .line 18
    if-eqz v0, :cond_1

    .line 19
    .line 20
    return-void

    .line 21
    :cond_1
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    if-eqz v0, :cond_8

    .line 26
    .line 27
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    .line 28
    .line 29
    .line 30
    move-result v0

    .line 31
    if-nez v0, :cond_2

    .line 32
    .line 33
    goto/16 :goto_2

    .line 34
    .line 35
    :cond_2
    invoke-virtual {p0}, Landroid/widget/ImageView;->getDrawable()Landroid/graphics/drawable/Drawable;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    instance-of v0, v0, Landroid/graphics/drawable/BitmapDrawable;

    .line 40
    .line 41
    if-eqz v0, :cond_3

    .line 42
    .line 43
    invoke-virtual {p0}, Landroid/widget/ImageView;->getDrawable()Landroid/graphics/drawable/Drawable;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    check-cast v0, Landroid/graphics/drawable/BitmapDrawable;

    .line 48
    .line 49
    invoke-virtual {v0}, Landroid/graphics/drawable/BitmapDrawable;->getBitmap()Landroid/graphics/Bitmap;

    .line 50
    .line 51
    .line 52
    move-result-object v0

    .line 53
    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getWidth()I

    .line 54
    .line 55
    .line 56
    move-result v1

    .line 57
    iput v1, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->k:I

    .line 58
    .line 59
    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getHeight()I

    .line 60
    .line 61
    .line 62
    move-result v0

    .line 63
    iput v0, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->l:I

    .line 64
    .line 65
    goto :goto_0

    .line 66
    :cond_3
    invoke-virtual {p0}, Landroid/widget/ImageView;->getDrawable()Landroid/graphics/drawable/Drawable;

    .line 67
    .line 68
    .line 69
    move-result-object v0

    .line 70
    instance-of v0, v0, Landroid/graphics/drawable/ColorDrawable;

    .line 71
    .line 72
    if-eqz v0, :cond_4

    .line 73
    .line 74
    invoke-virtual {p0}, Landroid/widget/ImageView;->getDrawable()Landroid/graphics/drawable/Drawable;

    .line 75
    .line 76
    .line 77
    move-result-object v0

    .line 78
    check-cast v0, Landroid/graphics/drawable/ColorDrawable;

    .line 79
    .line 80
    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->getIntrinsicWidth()I

    .line 81
    .line 82
    .line 83
    move-result v1

    .line 84
    iput v1, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->k:I

    .line 85
    .line 86
    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->getIntrinsicHeight()I

    .line 87
    .line 88
    .line 89
    move-result v0

    .line 90
    iput v0, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->l:I

    .line 91
    .line 92
    goto :goto_0

    .line 93
    :cond_4
    invoke-virtual {p0}, Landroid/widget/ImageView;->getDrawable()Landroid/graphics/drawable/Drawable;

    .line 94
    .line 95
    .line 96
    move-result-object v0

    .line 97
    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->getIntrinsicWidth()I

    .line 98
    .line 99
    .line 100
    move-result v0

    .line 101
    invoke-virtual {p0}, Landroid/widget/ImageView;->getDrawable()Landroid/graphics/drawable/Drawable;

    .line 102
    .line 103
    .line 104
    move-result-object v1

    .line 105
    invoke-virtual {v1}, Landroid/graphics/drawable/Drawable;->getIntrinsicHeight()I

    .line 106
    .line 107
    .line 108
    move-result v1

    .line 109
    sget-object v2, Landroid/graphics/Bitmap$Config;->RGB_565:Landroid/graphics/Bitmap$Config;

    .line 110
    .line 111
    invoke-static {v0, v1, v2}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    .line 112
    .line 113
    .line 114
    move-result-object v0

    .line 115
    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getWidth()I

    .line 116
    .line 117
    .line 118
    move-result v1

    .line 119
    iput v1, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->k:I

    .line 120
    .line 121
    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getHeight()I

    .line 122
    .line 123
    .line 124
    move-result v0

    .line 125
    iput v0, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->l:I

    .line 126
    .line 127
    :goto_0
    new-instance v0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$i;

    .line 128
    .line 129
    const/4 v1, 0x0

    .line 130
    invoke-direct {v0, v1}, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$i;-><init>(Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$a;)V

    .line 131
    .line 132
    .line 133
    iput-object v0, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->f:Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$i;

    .line 134
    .line 135
    const/4 v2, 0x0

    .line 136
    iput v2, v0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$i;->e:I

    .line 137
    .line 138
    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->i:Landroid/graphics/Rect;

    .line 139
    .line 140
    if-nez v0, :cond_5

    .line 141
    .line 142
    new-instance v0, Landroid/graphics/Rect;

    .line 143
    .line 144
    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    .line 145
    .line 146
    .line 147
    iput-object v0, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->i:Landroid/graphics/Rect;

    .line 148
    .line 149
    :cond_5
    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->f:Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$i;

    .line 150
    .line 151
    iget-object v2, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->i:Landroid/graphics/Rect;

    .line 152
    .line 153
    iget v3, v2, Landroid/graphics/Rect;->left:I

    .line 154
    .line 155
    int-to-float v3, v3

    .line 156
    iput v3, v0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$i;->a:F

    .line 157
    .line 158
    iget v2, v2, Landroid/graphics/Rect;->top:I

    .line 159
    .line 160
    invoke-static {}, Lcom/xuexiang/xui/utils/g;->i()I

    .line 161
    .line 162
    .line 163
    move-result v3

    .line 164
    sub-int/2addr v2, v3

    .line 165
    int-to-float v2, v2

    .line 166
    iput v2, v0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$i;->b:F

    .line 167
    .line 168
    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->f:Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$i;

    .line 169
    .line 170
    iget-object v2, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->i:Landroid/graphics/Rect;

    .line 171
    .line 172
    invoke-virtual {v2}, Landroid/graphics/Rect;->width()I

    .line 173
    .line 174
    .line 175
    move-result v2

    .line 176
    int-to-float v2, v2

    .line 177
    iput v2, v0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$i;->c:F

    .line 178
    .line 179
    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->f:Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$i;

    .line 180
    .line 181
    iget-object v2, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->i:Landroid/graphics/Rect;

    .line 182
    .line 183
    invoke-virtual {v2}, Landroid/graphics/Rect;->height()I

    .line 184
    .line 185
    .line 186
    move-result v2

    .line 187
    int-to-float v2, v2

    .line 188
    iput v2, v0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$i;->d:F

    .line 189
    .line 190
    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->i:Landroid/graphics/Rect;

    .line 191
    .line 192
    invoke-virtual {v0}, Landroid/graphics/Rect;->width()I

    .line 193
    .line 194
    .line 195
    move-result v0

    .line 196
    int-to-float v0, v0

    .line 197
    iget v2, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->k:I

    .line 198
    .line 199
    int-to-float v2, v2

    .line 200
    div-float/2addr v0, v2

    .line 201
    iget-object v2, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->i:Landroid/graphics/Rect;

    .line 202
    .line 203
    invoke-virtual {v2}, Landroid/graphics/Rect;->height()I

    .line 204
    .line 205
    .line 206
    move-result v2

    .line 207
    int-to-float v2, v2

    .line 208
    iget v3, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->l:I

    .line 209
    .line 210
    int-to-float v3, v3

    .line 211
    div-float/2addr v2, v3

    .line 212
    iget-object v3, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->f:Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$i;

    .line 213
    .line 214
    invoke-static {v0, v2}, Ljava/lang/Math;->max(FF)F

    .line 215
    .line 216
    .line 217
    move-result v0

    .line 218
    iput v0, v3, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$i;->f:F

    .line 219
    .line 220
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    .line 221
    .line 222
    .line 223
    move-result v0

    .line 224
    int-to-float v0, v0

    .line 225
    iget v2, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->k:I

    .line 226
    .line 227
    int-to-float v2, v2

    .line 228
    div-float/2addr v0, v2

    .line 229
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    .line 230
    .line 231
    .line 232
    move-result v2

    .line 233
    int-to-float v2, v2

    .line 234
    iget v3, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->l:I

    .line 235
    .line 236
    int-to-float v3, v3

    .line 237
    div-float/2addr v2, v3

    .line 238
    new-instance v3, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$i;

    .line 239
    .line 240
    invoke-direct {v3, v1}, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$i;-><init>(Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$a;)V

    .line 241
    .line 242
    .line 243
    iput-object v3, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->g:Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$i;

    .line 244
    .line 245
    invoke-static {v0, v2}, Ljava/lang/Math;->min(FF)F

    .line 246
    .line 247
    .line 248
    move-result v0

    .line 249
    iput v0, v3, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$i;->f:F

    .line 250
    .line 251
    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->g:Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$i;

    .line 252
    .line 253
    const/16 v1, 0xff

    .line 254
    .line 255
    iput v1, v0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$i;->e:I

    .line 256
    .line 257
    iget v1, v0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$i;->f:F

    .line 258
    .line 259
    iget v2, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->k:I

    .line 260
    .line 261
    int-to-float v2, v2

    .line 262
    mul-float/2addr v2, v1

    .line 263
    float-to-int v2, v2

    .line 264
    iget v3, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->l:I

    .line 265
    .line 266
    int-to-float v3, v3

    .line 267
    mul-float/2addr v1, v3

    .line 268
    float-to-int v1, v1

    .line 269
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    .line 270
    .line 271
    .line 272
    move-result v3

    .line 273
    sub-int/2addr v3, v2

    .line 274
    int-to-float v3, v3

    .line 275
    const/high16 v4, 0x40000000    # 2.0f

    .line 276
    .line 277
    div-float/2addr v3, v4

    .line 278
    iput v3, v0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$i;->a:F

    .line 279
    .line 280
    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->g:Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$i;

    .line 281
    .line 282
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    .line 283
    .line 284
    .line 285
    move-result v3

    .line 286
    sub-int/2addr v3, v1

    .line 287
    int-to-float v3, v3

    .line 288
    div-float/2addr v3, v4

    .line 289
    iput v3, v0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$i;->b:F

    .line 290
    .line 291
    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->g:Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$i;

    .line 292
    .line 293
    int-to-float v2, v2

    .line 294
    iput v2, v0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$i;->c:F

    .line 295
    .line 296
    int-to-float v1, v1

    .line 297
    iput v1, v0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$i;->d:F

    .line 298
    .line 299
    iget-object v1, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->c:Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$Status;

    .line 300
    .line 301
    sget-object v2, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$Status;->b:Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$Status;

    .line 302
    .line 303
    if-ne v1, v2, :cond_6

    .line 304
    .line 305
    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->f:Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$i;

    .line 306
    .line 307
    invoke-virtual {v0}, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$i;->a()Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$i;

    .line 308
    .line 309
    .line 310
    move-result-object v0

    .line 311
    iput-object v0, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->h:Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$i;

    .line 312
    .line 313
    goto :goto_1

    .line 314
    :cond_6
    sget-object v2, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$Status;->c:Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$Status;

    .line 315
    .line 316
    if-ne v1, v2, :cond_7

    .line 317
    .line 318
    invoke-virtual {v0}, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$i;->a()Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$i;

    .line 319
    .line 320
    .line 321
    move-result-object v0

    .line 322
    iput-object v0, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->h:Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$i;

    .line 323
    .line 324
    :cond_7
    :goto_1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->g:Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$i;

    .line 325
    .line 326
    iput-object v0, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->w:Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$i;

    .line 327
    .line 328
    :cond_8
    :goto_2
    return-void
.end method

.method public final m()F
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->w:Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$i;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->l()V

    .line 6
    .line 7
    .line 8
    :cond_0
    invoke-virtual {p0}, Landroid/view/View;->getTop()I

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    int-to-float v0, v0

    .line 13
    iget-object v1, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->w:Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$i;

    .line 14
    .line 15
    iget v1, v1, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$i;->d:F

    .line 16
    .line 17
    div-float/2addr v0, v1

    .line 18
    invoke-static {v0}, Ljava/lang/Math;->abs(F)F

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    return v0
.end method

.method public final n()V
    .locals 10

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->getTop()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    filled-new-array {v0, v1}, [I

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    invoke-static {v0}, Landroid/animation/ValueAnimator;->ofInt([I)Landroid/animation/ValueAnimator;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    new-instance v2, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$a;

    .line 15
    .line 16
    invoke-direct {v2, p0}, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$a;-><init>(Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;)V

    .line 17
    .line 18
    .line 19
    invoke-virtual {v0, v2}, Landroid/animation/ValueAnimator;->addUpdateListener(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V

    .line 20
    .line 21
    .line 22
    invoke-virtual {p0}, Landroid/view/View;->getLeft()I

    .line 23
    .line 24
    .line 25
    move-result v2

    .line 26
    filled-new-array {v2, v1}, [I

    .line 27
    .line 28
    .line 29
    move-result-object v2

    .line 30
    invoke-static {v2}, Landroid/animation/ValueAnimator;->ofInt([I)Landroid/animation/ValueAnimator;

    .line 31
    .line 32
    .line 33
    move-result-object v2

    .line 34
    new-instance v3, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$b;

    .line 35
    .line 36
    invoke-direct {v3, p0}, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$b;-><init>(Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;)V

    .line 37
    .line 38
    .line 39
    invoke-virtual {v2, v3}, Landroid/animation/ValueAnimator;->addUpdateListener(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V

    .line 40
    .line 41
    .line 42
    iget v3, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->t:I

    .line 43
    .line 44
    const/16 v4, 0xff

    .line 45
    .line 46
    filled-new-array {v3, v4}, [I

    .line 47
    .line 48
    .line 49
    move-result-object v3

    .line 50
    invoke-static {v3}, Landroid/animation/ValueAnimator;->ofInt([I)Landroid/animation/ValueAnimator;

    .line 51
    .line 52
    .line 53
    move-result-object v3

    .line 54
    new-instance v4, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$c;

    .line 55
    .line 56
    invoke-direct {v4, p0}, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$c;-><init>(Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;)V

    .line 57
    .line 58
    .line 59
    invoke-virtual {v3, v4}, Landroid/animation/ValueAnimator;->addUpdateListener(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V

    .line 60
    .line 61
    .line 62
    const/4 v4, 0x2

    .line 63
    new-array v5, v4, [F

    .line 64
    .line 65
    invoke-virtual {p0}, Landroid/view/View;->getScaleX()F

    .line 66
    .line 67
    .line 68
    move-result v6

    .line 69
    aput v6, v5, v1

    .line 70
    .line 71
    const/high16 v6, 0x3f800000    # 1.0f

    .line 72
    .line 73
    const/4 v7, 0x1

    .line 74
    aput v6, v5, v7

    .line 75
    .line 76
    invoke-static {v5}, Landroid/animation/ValueAnimator;->ofFloat([F)Landroid/animation/ValueAnimator;

    .line 77
    .line 78
    .line 79
    move-result-object v5

    .line 80
    new-instance v6, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$d;

    .line 81
    .line 82
    invoke-direct {v6, p0}, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$d;-><init>(Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;)V

    .line 83
    .line 84
    .line 85
    invoke-virtual {v5, v6}, Landroid/animation/ValueAnimator;->addUpdateListener(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V

    .line 86
    .line 87
    .line 88
    new-instance v6, Landroid/animation/AnimatorSet;

    .line 89
    .line 90
    invoke-direct {v6}, Landroid/animation/AnimatorSet;-><init>()V

    .line 91
    .line 92
    .line 93
    sget v8, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->y:I

    .line 94
    .line 95
    int-to-long v8, v8

    .line 96
    invoke-virtual {v6, v8, v9}, Landroid/animation/AnimatorSet;->setDuration(J)Landroid/animation/AnimatorSet;

    .line 97
    .line 98
    .line 99
    new-instance v8, Landroid/view/animation/AccelerateDecelerateInterpolator;

    .line 100
    .line 101
    invoke-direct {v8}, Landroid/view/animation/AccelerateDecelerateInterpolator;-><init>()V

    .line 102
    .line 103
    .line 104
    invoke-virtual {v6, v8}, Landroid/animation/AnimatorSet;->setInterpolator(Landroid/animation/TimeInterpolator;)V

    .line 105
    .line 106
    .line 107
    const/4 v8, 0x4

    .line 108
    new-array v8, v8, [Landroid/animation/Animator;

    .line 109
    .line 110
    aput-object v0, v8, v1

    .line 111
    .line 112
    aput-object v2, v8, v7

    .line 113
    .line 114
    aput-object v5, v8, v4

    .line 115
    .line 116
    const/4 v0, 0x3

    .line 117
    aput-object v3, v8, v0

    .line 118
    .line 119
    invoke-virtual {v6, v8}, Landroid/animation/AnimatorSet;->playTogether([Landroid/animation/Animator;)V

    .line 120
    .line 121
    .line 122
    invoke-virtual {v6}, Landroid/animation/AnimatorSet;->start()V

    .line 123
    .line 124
    .line 125
    return-void
.end method

.method public o(ZF)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->m:Z

    .line 2
    .line 3
    iput p2, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->o:F

    .line 4
    .line 5
    return-void
.end method

.method public onDetachedFromWindow()V
    .locals 2

    .line 1
    invoke-super {p0}, Lcom/xuexiang/xui/widget/imageview/photoview/PhotoView;->onDetachedFromWindow()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput v0, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->k:I

    .line 6
    .line 7
    iput v0, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->l:I

    .line 8
    .line 9
    const/4 v0, 0x0

    .line 10
    iput-object v0, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->i:Landroid/graphics/Rect;

    .line 11
    .line 12
    iput-object v0, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->d:Landroid/graphics/Paint;

    .line 13
    .line 14
    iput-object v0, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->e:Landroid/graphics/Matrix;

    .line 15
    .line 16
    iput-object v0, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->f:Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$i;

    .line 17
    .line 18
    iput-object v0, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->g:Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$i;

    .line 19
    .line 20
    iput-object v0, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->h:Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$i;

    .line 21
    .line 22
    iget-object v1, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->n:Landroid/animation/ValueAnimator;

    .line 23
    .line 24
    if-eqz v1, :cond_0

    .line 25
    .line 26
    invoke-virtual {v1}, Landroid/animation/ValueAnimator;->cancel()V

    .line 27
    .line 28
    .line 29
    iget-object v1, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->n:Landroid/animation/ValueAnimator;

    .line 30
    .line 31
    invoke-virtual {v1}, Landroid/animation/ValueAnimator;->clone()Landroid/animation/ValueAnimator;

    .line 32
    .line 33
    .line 34
    iput-object v0, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->n:Landroid/animation/ValueAnimator;

    .line 35
    .line 36
    :cond_0
    return-void
.end method

.method public onDraw(Landroid/graphics/Canvas;)V
    .locals 6

    .line 1
    invoke-virtual {p0}, Landroid/widget/ImageView;->getDrawable()Landroid/graphics/drawable/Drawable;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->c:Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$Status;

    .line 9
    .line 10
    sget-object v1, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$Status;->c:Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$Status;

    .line 11
    .line 12
    if-eq v0, v1, :cond_3

    .line 13
    .line 14
    sget-object v1, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$Status;->b:Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$Status;

    .line 15
    .line 16
    if-ne v0, v1, :cond_1

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_1
    sget-object v1, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$Status;->d:Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$Status;

    .line 20
    .line 21
    if-ne v0, v1, :cond_2

    .line 22
    .line 23
    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->d:Landroid/graphics/Paint;

    .line 24
    .line 25
    const/4 v1, 0x0

    .line 26
    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setAlpha(I)V

    .line 27
    .line 28
    .line 29
    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->d:Landroid/graphics/Paint;

    .line 30
    .line 31
    invoke-virtual {p1, v0}, Landroid/graphics/Canvas;->drawPaint(Landroid/graphics/Paint;)V

    .line 32
    .line 33
    .line 34
    invoke-super {p0, p1}, Landroid/widget/ImageView;->onDraw(Landroid/graphics/Canvas;)V

    .line 35
    .line 36
    .line 37
    goto/16 :goto_1

    .line 38
    .line 39
    :cond_2
    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->d:Landroid/graphics/Paint;

    .line 40
    .line 41
    const/16 v1, 0xff

    .line 42
    .line 43
    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setAlpha(I)V

    .line 44
    .line 45
    .line 46
    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->d:Landroid/graphics/Paint;

    .line 47
    .line 48
    invoke-virtual {p1, v0}, Landroid/graphics/Canvas;->drawPaint(Landroid/graphics/Paint;)V

    .line 49
    .line 50
    .line 51
    invoke-super {p0, p1}, Landroid/widget/ImageView;->onDraw(Landroid/graphics/Canvas;)V

    .line 52
    .line 53
    .line 54
    goto :goto_1

    .line 55
    :cond_3
    :goto_0
    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->f:Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$i;

    .line 56
    .line 57
    if-eqz v0, :cond_4

    .line 58
    .line 59
    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->g:Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$i;

    .line 60
    .line 61
    if-eqz v0, :cond_4

    .line 62
    .line 63
    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->h:Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$i;

    .line 64
    .line 65
    if-nez v0, :cond_5

    .line 66
    .line 67
    :cond_4
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->l()V

    .line 68
    .line 69
    .line 70
    :cond_5
    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->h:Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$i;

    .line 71
    .line 72
    if-nez v0, :cond_6

    .line 73
    .line 74
    invoke-super {p0, p1}, Landroid/widget/ImageView;->onDraw(Landroid/graphics/Canvas;)V

    .line 75
    .line 76
    .line 77
    return-void

    .line 78
    :cond_6
    iget-object v1, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->d:Landroid/graphics/Paint;

    .line 79
    .line 80
    iget v0, v0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$i;->e:I

    .line 81
    .line 82
    invoke-virtual {v1, v0}, Landroid/graphics/Paint;->setAlpha(I)V

    .line 83
    .line 84
    .line 85
    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->d:Landroid/graphics/Paint;

    .line 86
    .line 87
    invoke-virtual {p1, v0}, Landroid/graphics/Canvas;->drawPaint(Landroid/graphics/Paint;)V

    .line 88
    .line 89
    .line 90
    invoke-virtual {p1}, Landroid/graphics/Canvas;->getSaveCount()I

    .line 91
    .line 92
    .line 93
    move-result v0

    .line 94
    iget-object v1, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->e:Landroid/graphics/Matrix;

    .line 95
    .line 96
    iget-object v2, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->h:Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$i;

    .line 97
    .line 98
    iget v2, v2, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$i;->f:F

    .line 99
    .line 100
    invoke-virtual {v1, v2, v2}, Landroid/graphics/Matrix;->setScale(FF)V

    .line 101
    .line 102
    .line 103
    iget v1, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->k:I

    .line 104
    .line 105
    int-to-float v1, v1

    .line 106
    iget-object v2, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->h:Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$i;

    .line 107
    .line 108
    iget v3, v2, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$i;->f:F

    .line 109
    .line 110
    mul-float/2addr v1, v3

    .line 111
    iget v4, v2, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$i;->c:F

    .line 112
    .line 113
    sub-float/2addr v1, v4

    .line 114
    neg-float v1, v1

    .line 115
    const/high16 v4, 0x40000000    # 2.0f

    .line 116
    .line 117
    div-float/2addr v1, v4

    .line 118
    iget v5, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->l:I

    .line 119
    .line 120
    int-to-float v5, v5

    .line 121
    mul-float/2addr v5, v3

    .line 122
    iget v2, v2, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$i;->d:F

    .line 123
    .line 124
    sub-float/2addr v5, v2

    .line 125
    neg-float v2, v5

    .line 126
    div-float/2addr v2, v4

    .line 127
    iget-object v3, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->e:Landroid/graphics/Matrix;

    .line 128
    .line 129
    invoke-virtual {v3, v1, v2}, Landroid/graphics/Matrix;->postTranslate(FF)Z

    .line 130
    .line 131
    .line 132
    iget-object v1, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->h:Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$i;

    .line 133
    .line 134
    iget v2, v1, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$i;->a:F

    .line 135
    .line 136
    iget v1, v1, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$i;->b:F

    .line 137
    .line 138
    invoke-virtual {p1, v2, v1}, Landroid/graphics/Canvas;->translate(FF)V

    .line 139
    .line 140
    .line 141
    iget-object v1, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->h:Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$i;

    .line 142
    .line 143
    iget v2, v1, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$i;->c:F

    .line 144
    .line 145
    iget v1, v1, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$i;->d:F

    .line 146
    .line 147
    const/4 v3, 0x0

    .line 148
    invoke-virtual {p1, v3, v3, v2, v1}, Landroid/graphics/Canvas;->clipRect(FFFF)Z

    .line 149
    .line 150
    .line 151
    iget-object v1, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->e:Landroid/graphics/Matrix;

    .line 152
    .line 153
    invoke-virtual {p1, v1}, Landroid/graphics/Canvas;->concat(Landroid/graphics/Matrix;)V

    .line 154
    .line 155
    .line 156
    invoke-virtual {p0}, Landroid/widget/ImageView;->getDrawable()Landroid/graphics/drawable/Drawable;

    .line 157
    .line 158
    .line 159
    move-result-object v1

    .line 160
    invoke-virtual {v1, p1}, Landroid/graphics/drawable/Drawable;->draw(Landroid/graphics/Canvas;)V

    .line 161
    .line 162
    .line 163
    invoke-virtual {p1, v0}, Landroid/graphics/Canvas;->restoreToCount(I)V

    .line 164
    .line 165
    .line 166
    iget-boolean p1, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->j:Z

    .line 167
    .line 168
    if-eqz p1, :cond_7

    .line 169
    .line 170
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->p()V

    .line 171
    .line 172
    .line 173
    :cond_7
    :goto_1
    return-void
.end method

.method public final p()V
    .locals 15

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-boolean v0, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->j:Z

    .line 3
    .line 4
    iget-object v1, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->h:Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$i;

    .line 5
    .line 6
    if-nez v1, :cond_0

    .line 7
    .line 8
    return-void

    .line 9
    :cond_0
    new-instance v1, Landroid/animation/ValueAnimator;

    .line 10
    .line 11
    invoke-direct {v1}, Landroid/animation/ValueAnimator;-><init>()V

    .line 12
    .line 13
    .line 14
    iput-object v1, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->n:Landroid/animation/ValueAnimator;

    .line 15
    .line 16
    sget v2, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->y:I

    .line 17
    .line 18
    int-to-long v2, v2

    .line 19
    invoke-virtual {v1, v2, v3}, Landroid/animation/ValueAnimator;->setDuration(J)Landroid/animation/ValueAnimator;

    .line 20
    .line 21
    .line 22
    iget-object v1, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->n:Landroid/animation/ValueAnimator;

    .line 23
    .line 24
    new-instance v2, Landroid/view/animation/AccelerateDecelerateInterpolator;

    .line 25
    .line 26
    invoke-direct {v2}, Landroid/view/animation/AccelerateDecelerateInterpolator;-><init>()V

    .line 27
    .line 28
    .line 29
    invoke-virtual {v1, v2}, Landroid/animation/ValueAnimator;->setInterpolator(Landroid/animation/TimeInterpolator;)V

    .line 30
    .line 31
    .line 32
    iget-object v1, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->c:Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$Status;

    .line 33
    .line 34
    sget-object v2, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$Status;->b:Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$Status;

    .line 35
    .line 36
    const/4 v3, 0x5

    .line 37
    const/4 v4, 0x4

    .line 38
    const/4 v5, 0x3

    .line 39
    const/4 v6, 0x6

    .line 40
    const-string v7, "animHeight"

    .line 41
    .line 42
    const-string v8, "animWidth"

    .line 43
    .line 44
    const-string v9, "animTop"

    .line 45
    .line 46
    const-string v10, "animLeft"

    .line 47
    .line 48
    const-string v11, "animAlpha"

    .line 49
    .line 50
    const-string v12, "animScale"

    .line 51
    .line 52
    const/4 v13, 0x1

    .line 53
    const/4 v14, 0x2

    .line 54
    if-ne v1, v2, :cond_1

    .line 55
    .line 56
    new-array v1, v14, [F

    .line 57
    .line 58
    iget-object v2, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->f:Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$i;

    .line 59
    .line 60
    iget v2, v2, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$i;->f:F

    .line 61
    .line 62
    aput v2, v1, v0

    .line 63
    .line 64
    iget-object v2, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->g:Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$i;

    .line 65
    .line 66
    iget v2, v2, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$i;->f:F

    .line 67
    .line 68
    aput v2, v1, v13

    .line 69
    .line 70
    invoke-static {v12, v1}, Landroid/animation/PropertyValuesHolder;->ofFloat(Ljava/lang/String;[F)Landroid/animation/PropertyValuesHolder;

    .line 71
    .line 72
    .line 73
    move-result-object v1

    .line 74
    iget-object v2, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->f:Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$i;

    .line 75
    .line 76
    iget v2, v2, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$i;->e:I

    .line 77
    .line 78
    iget-object v12, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->g:Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$i;

    .line 79
    .line 80
    iget v12, v12, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$i;->e:I

    .line 81
    .line 82
    filled-new-array {v2, v12}, [I

    .line 83
    .line 84
    .line 85
    move-result-object v2

    .line 86
    invoke-static {v11, v2}, Landroid/animation/PropertyValuesHolder;->ofInt(Ljava/lang/String;[I)Landroid/animation/PropertyValuesHolder;

    .line 87
    .line 88
    .line 89
    move-result-object v2

    .line 90
    new-array v11, v14, [F

    .line 91
    .line 92
    iget-object v12, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->f:Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$i;

    .line 93
    .line 94
    iget v12, v12, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$i;->a:F

    .line 95
    .line 96
    aput v12, v11, v0

    .line 97
    .line 98
    iget-object v12, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->g:Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$i;

    .line 99
    .line 100
    iget v12, v12, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$i;->a:F

    .line 101
    .line 102
    aput v12, v11, v13

    .line 103
    .line 104
    invoke-static {v10, v11}, Landroid/animation/PropertyValuesHolder;->ofFloat(Ljava/lang/String;[F)Landroid/animation/PropertyValuesHolder;

    .line 105
    .line 106
    .line 107
    move-result-object v10

    .line 108
    new-array v11, v14, [F

    .line 109
    .line 110
    iget-object v12, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->f:Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$i;

    .line 111
    .line 112
    iget v12, v12, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$i;->b:F

    .line 113
    .line 114
    aput v12, v11, v0

    .line 115
    .line 116
    iget-object v12, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->g:Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$i;

    .line 117
    .line 118
    iget v12, v12, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$i;->b:F

    .line 119
    .line 120
    aput v12, v11, v13

    .line 121
    .line 122
    invoke-static {v9, v11}, Landroid/animation/PropertyValuesHolder;->ofFloat(Ljava/lang/String;[F)Landroid/animation/PropertyValuesHolder;

    .line 123
    .line 124
    .line 125
    move-result-object v9

    .line 126
    new-array v11, v14, [F

    .line 127
    .line 128
    iget-object v12, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->f:Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$i;

    .line 129
    .line 130
    iget v12, v12, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$i;->c:F

    .line 131
    .line 132
    aput v12, v11, v0

    .line 133
    .line 134
    iget-object v12, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->g:Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$i;

    .line 135
    .line 136
    iget v12, v12, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$i;->c:F

    .line 137
    .line 138
    aput v12, v11, v13

    .line 139
    .line 140
    invoke-static {v8, v11}, Landroid/animation/PropertyValuesHolder;->ofFloat(Ljava/lang/String;[F)Landroid/animation/PropertyValuesHolder;

    .line 141
    .line 142
    .line 143
    move-result-object v8

    .line 144
    new-array v11, v14, [F

    .line 145
    .line 146
    iget-object v12, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->f:Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$i;

    .line 147
    .line 148
    iget v12, v12, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$i;->d:F

    .line 149
    .line 150
    aput v12, v11, v0

    .line 151
    .line 152
    iget-object v12, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->g:Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$i;

    .line 153
    .line 154
    iget v12, v12, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$i;->d:F

    .line 155
    .line 156
    aput v12, v11, v13

    .line 157
    .line 158
    invoke-static {v7, v11}, Landroid/animation/PropertyValuesHolder;->ofFloat(Ljava/lang/String;[F)Landroid/animation/PropertyValuesHolder;

    .line 159
    .line 160
    .line 161
    move-result-object v7

    .line 162
    iget-object v11, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->n:Landroid/animation/ValueAnimator;

    .line 163
    .line 164
    new-array v6, v6, [Landroid/animation/PropertyValuesHolder;

    .line 165
    .line 166
    aput-object v1, v6, v0

    .line 167
    .line 168
    aput-object v2, v6, v13

    .line 169
    .line 170
    aput-object v10, v6, v14

    .line 171
    .line 172
    aput-object v9, v6, v5

    .line 173
    .line 174
    aput-object v8, v6, v4

    .line 175
    .line 176
    aput-object v7, v6, v3

    .line 177
    .line 178
    invoke-virtual {v11, v6}, Landroid/animation/ValueAnimator;->setValues([Landroid/animation/PropertyValuesHolder;)V

    .line 179
    .line 180
    .line 181
    goto/16 :goto_0

    .line 182
    .line 183
    :cond_1
    sget-object v2, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$Status;->c:Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$Status;

    .line 184
    .line 185
    if-ne v1, v2, :cond_2

    .line 186
    .line 187
    new-array v1, v14, [F

    .line 188
    .line 189
    iget-object v2, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->g:Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$i;

    .line 190
    .line 191
    iget v2, v2, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$i;->f:F

    .line 192
    .line 193
    aput v2, v1, v0

    .line 194
    .line 195
    iget-object v2, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->f:Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$i;

    .line 196
    .line 197
    iget v2, v2, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$i;->f:F

    .line 198
    .line 199
    aput v2, v1, v13

    .line 200
    .line 201
    invoke-static {v12, v1}, Landroid/animation/PropertyValuesHolder;->ofFloat(Ljava/lang/String;[F)Landroid/animation/PropertyValuesHolder;

    .line 202
    .line 203
    .line 204
    move-result-object v1

    .line 205
    iget-object v2, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->g:Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$i;

    .line 206
    .line 207
    iget v2, v2, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$i;->e:I

    .line 208
    .line 209
    iget-object v12, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->f:Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$i;

    .line 210
    .line 211
    iget v12, v12, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$i;->e:I

    .line 212
    .line 213
    filled-new-array {v2, v12}, [I

    .line 214
    .line 215
    .line 216
    move-result-object v2

    .line 217
    invoke-static {v11, v2}, Landroid/animation/PropertyValuesHolder;->ofInt(Ljava/lang/String;[I)Landroid/animation/PropertyValuesHolder;

    .line 218
    .line 219
    .line 220
    move-result-object v2

    .line 221
    new-array v11, v14, [F

    .line 222
    .line 223
    iget-object v12, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->g:Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$i;

    .line 224
    .line 225
    iget v12, v12, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$i;->a:F

    .line 226
    .line 227
    aput v12, v11, v0

    .line 228
    .line 229
    iget-object v12, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->f:Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$i;

    .line 230
    .line 231
    iget v12, v12, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$i;->a:F

    .line 232
    .line 233
    aput v12, v11, v13

    .line 234
    .line 235
    invoke-static {v10, v11}, Landroid/animation/PropertyValuesHolder;->ofFloat(Ljava/lang/String;[F)Landroid/animation/PropertyValuesHolder;

    .line 236
    .line 237
    .line 238
    move-result-object v10

    .line 239
    new-array v11, v14, [F

    .line 240
    .line 241
    iget-object v12, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->g:Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$i;

    .line 242
    .line 243
    iget v12, v12, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$i;->b:F

    .line 244
    .line 245
    aput v12, v11, v0

    .line 246
    .line 247
    iget-object v12, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->f:Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$i;

    .line 248
    .line 249
    iget v12, v12, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$i;->b:F

    .line 250
    .line 251
    aput v12, v11, v13

    .line 252
    .line 253
    invoke-static {v9, v11}, Landroid/animation/PropertyValuesHolder;->ofFloat(Ljava/lang/String;[F)Landroid/animation/PropertyValuesHolder;

    .line 254
    .line 255
    .line 256
    move-result-object v9

    .line 257
    new-array v11, v14, [F

    .line 258
    .line 259
    iget-object v12, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->g:Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$i;

    .line 260
    .line 261
    iget v12, v12, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$i;->c:F

    .line 262
    .line 263
    aput v12, v11, v0

    .line 264
    .line 265
    iget-object v12, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->f:Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$i;

    .line 266
    .line 267
    iget v12, v12, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$i;->c:F

    .line 268
    .line 269
    aput v12, v11, v13

    .line 270
    .line 271
    invoke-static {v8, v11}, Landroid/animation/PropertyValuesHolder;->ofFloat(Ljava/lang/String;[F)Landroid/animation/PropertyValuesHolder;

    .line 272
    .line 273
    .line 274
    move-result-object v8

    .line 275
    new-array v11, v14, [F

    .line 276
    .line 277
    iget-object v12, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->g:Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$i;

    .line 278
    .line 279
    iget v12, v12, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$i;->d:F

    .line 280
    .line 281
    aput v12, v11, v0

    .line 282
    .line 283
    iget-object v12, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->f:Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$i;

    .line 284
    .line 285
    iget v12, v12, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$i;->d:F

    .line 286
    .line 287
    aput v12, v11, v13

    .line 288
    .line 289
    invoke-static {v7, v11}, Landroid/animation/PropertyValuesHolder;->ofFloat(Ljava/lang/String;[F)Landroid/animation/PropertyValuesHolder;

    .line 290
    .line 291
    .line 292
    move-result-object v7

    .line 293
    iget-object v11, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->n:Landroid/animation/ValueAnimator;

    .line 294
    .line 295
    new-array v6, v6, [Landroid/animation/PropertyValuesHolder;

    .line 296
    .line 297
    aput-object v1, v6, v0

    .line 298
    .line 299
    aput-object v2, v6, v13

    .line 300
    .line 301
    aput-object v10, v6, v14

    .line 302
    .line 303
    aput-object v9, v6, v5

    .line 304
    .line 305
    aput-object v8, v6, v4

    .line 306
    .line 307
    aput-object v7, v6, v3

    .line 308
    .line 309
    invoke-virtual {v11, v6}, Landroid/animation/ValueAnimator;->setValues([Landroid/animation/PropertyValuesHolder;)V

    .line 310
    .line 311
    .line 312
    :cond_2
    :goto_0
    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->n:Landroid/animation/ValueAnimator;

    .line 313
    .line 314
    new-instance v1, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$e;

    .line 315
    .line 316
    invoke-direct {v1, p0}, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$e;-><init>(Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;)V

    .line 317
    .line 318
    .line 319
    invoke-virtual {v0, v1}, Landroid/animation/ValueAnimator;->addUpdateListener(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V

    .line 320
    .line 321
    .line 322
    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->n:Landroid/animation/ValueAnimator;

    .line 323
    .line 324
    new-instance v1, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$f;

    .line 325
    .line 326
    invoke-direct {v1, p0}, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$f;-><init>(Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;)V

    .line 327
    .line 328
    .line 329
    invoke-virtual {v0, v1}, Landroid/animation/Animator;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    .line 330
    .line 331
    .line 332
    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->n:Landroid/animation/ValueAnimator;

    .line 333
    .line 334
    invoke-virtual {v0}, Landroid/animation/ValueAnimator;->start()V

    .line 335
    .line 336
    .line 337
    return-void
.end method

.method public q(Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$j;)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->setOnTransformListener(Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$j;)V

    .line 2
    .line 3
    .line 4
    const/4 p1, 0x1

    .line 5
    iput-boolean p1, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->j:Z

    .line 6
    .line 7
    sget-object p1, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$Status;->b:Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$Status;

    .line 8
    .line 9
    iput-object p1, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->c:Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$Status;

    .line 10
    .line 11
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method public r(Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$j;)V
    .locals 2

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->getTop()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-virtual {p0}, Landroid/view/View;->getTop()I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    neg-int v0, v0

    .line 12
    invoke-virtual {p0, v0}, Landroid/view/View;->offsetTopAndBottom(I)V

    .line 13
    .line 14
    .line 15
    :cond_0
    invoke-virtual {p0}, Landroid/view/View;->getLeft()I

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    if-eqz v0, :cond_1

    .line 20
    .line 21
    invoke-virtual {p0}, Landroid/view/View;->getLeft()I

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    neg-int v0, v0

    .line 26
    invoke-virtual {p0, v0}, Landroid/view/View;->offsetLeftAndRight(I)V

    .line 27
    .line 28
    .line 29
    :cond_1
    invoke-virtual {p0}, Landroid/view/View;->getScaleX()F

    .line 30
    .line 31
    .line 32
    move-result v0

    .line 33
    const/high16 v1, 0x3f800000    # 1.0f

    .line 34
    .line 35
    cmpl-float v0, v0, v1

    .line 36
    .line 37
    if-eqz v0, :cond_2

    .line 38
    .line 39
    invoke-virtual {p0, v1}, Landroid/view/View;->setScaleX(F)V

    .line 40
    .line 41
    .line 42
    invoke-virtual {p0, v1}, Landroid/view/View;->setScaleY(F)V

    .line 43
    .line 44
    .line 45
    :cond_2
    invoke-virtual {p0, p1}, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->setOnTransformListener(Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$j;)V

    .line 46
    .line 47
    .line 48
    const/4 p1, 0x1

    .line 49
    iput-boolean p1, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->j:Z

    .line 50
    .line 51
    sget-object p1, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$Status;->c:Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$Status;

    .line 52
    .line 53
    iput-object p1, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->c:Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$Status;

    .line 54
    .line 55
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    .line 56
    .line 57
    .line 58
    return-void
.end method

.method public setAlphaChangeListener(Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$g;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->u:Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$g;

    .line 2
    .line 3
    return-void
.end method

.method public setOnTransformListener(Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$j;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->x:Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$j;

    .line 2
    .line 3
    return-void
.end method

.method public setThumbRect(Landroid/graphics/Rect;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->i:Landroid/graphics/Rect;

    .line 2
    .line 3
    return-void
.end method

.method public setTransformOutListener(Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$h;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->v:Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$h;

    .line 2
    .line 3
    return-void
.end method
