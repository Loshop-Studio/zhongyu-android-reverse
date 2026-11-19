.class public Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;
.super Lcom/xuexiang/xui/widget/imageview/photoview/PhotoView;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$Status;
    }
.end annotation


# static fields
.field public static x:I = 0x190


# instance fields
.field public c:Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$Status;

.field public d:Landroid/graphics/Paint;

.field public e:Landroid/graphics/Matrix;

.field public f:Lx2/e;

.field public g:Lx2/e;

.field public h:Lx2/e;

.field public i:Landroid/graphics/Rect;

.field public j:Z

.field public k:I

.field public l:I

.field public m:Landroid/animation/ValueAnimator;

.field public final n:F

.field public o:I

.field public p:I

.field public q:Z

.field public r:Z

.field public s:I

.field public t:Lx2/c;

.field public u:Lx2/d;

.field public v:Lx2/e;

.field public w:Lcom/xuexiang/xui/widget/imageview/preview/view/b;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    .line 8
    invoke-direct {p0, p1}, Lcom/xuexiang/xui/widget/imageview/photoview/PhotoView;-><init>(Landroid/content/Context;)V

    .line 9
    sget-object p1, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$Status;->STATE_NORMAL:Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$Status;

    iput-object p1, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->c:Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$Status;

    const/high16 p1, 0x3f000000    # 0.5f

    .line 10
    iput p1, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->n:F

    const/4 p1, 0x0

    .line 11
    iput-boolean p1, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->q:Z

    .line 12
    iput-boolean p1, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->r:Z

    .line 13
    iput p1, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->s:I

    .line 14
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->b()V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Lcom/xuexiang/xui/widget/imageview/photoview/PhotoView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 2
    sget-object p1, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$Status;->STATE_NORMAL:Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$Status;

    iput-object p1, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->c:Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$Status;

    const/high16 p1, 0x3f000000    # 0.5f

    .line 3
    iput p1, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->n:F

    const/4 p1, 0x0

    .line 4
    iput-boolean p1, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->q:Z

    .line 5
    iput-boolean p1, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->r:Z

    .line 6
    iput p1, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->s:I

    .line 7
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->b()V

    return-void
.end method

.method public static setDuration(I)V
    .locals 0

    .line 1
    sput p0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->x:I

    .line 2
    .line 3
    return-void
.end method


# virtual methods
.method public final a()V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->v:Lx2/e;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, Lx2/e;->c()Lx2/e;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    iget-object v1, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->v:Lx2/e;

    .line 10
    .line 11
    iget v1, v1, Lx2/e;->b:F

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
    iput v1, v0, Lx2/e;->b:F

    .line 20
    .line 21
    iget-object v1, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->v:Lx2/e;

    .line 22
    .line 23
    iget v1, v1, Lx2/e;->a:F

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
    iput v1, v0, Lx2/e;->a:F

    .line 32
    .line 33
    iget v1, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->s:I

    .line 34
    .line 35
    iput v1, v0, Lx2/e;->e:I

    .line 36
    .line 37
    iget-object v1, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->v:Lx2/e;

    .line 38
    .line 39
    iget v1, v1, Lx2/e;->f:F

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
    iget-object v3, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->v:Lx2/e;

    .line 49
    .line 50
    iget v3, v3, Lx2/e;->f:F

    .line 51
    .line 52
    mul-float/2addr v2, v3

    .line 53
    sub-float/2addr v1, v2

    .line 54
    iput v1, v0, Lx2/e;->f:F

    .line 55
    .line 56
    invoke-virtual {v0}, Lx2/e;->c()Lx2/e;

    .line 57
    .line 58
    .line 59
    move-result-object v1

    .line 60
    iput-object v1, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->h:Lx2/e;

    .line 61
    .line 62
    invoke-virtual {v0}, Lx2/e;->c()Lx2/e;

    .line 63
    .line 64
    .line 65
    move-result-object v0

    .line 66
    iput-object v0, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->g:Lx2/e;

    .line 67
    .line 68
    :cond_0
    return-void
.end method

.method public final b()V
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

.method public final c()V
    .locals 7

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
    goto/16 :goto_2

    .line 8
    .line 9
    :cond_0
    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->f:Lx2/e;

    .line 10
    .line 11
    if-eqz v0, :cond_1

    .line 12
    .line 13
    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->g:Lx2/e;

    .line 14
    .line 15
    if-eqz v0, :cond_1

    .line 16
    .line 17
    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->h:Lx2/e;

    .line 18
    .line 19
    if-eqz v0, :cond_1

    .line 20
    .line 21
    goto/16 :goto_2

    .line 22
    .line 23
    :cond_1
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    if-eqz v0, :cond_9

    .line 28
    .line 29
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    .line 30
    .line 31
    .line 32
    move-result v0

    .line 33
    if-nez v0, :cond_2

    .line 34
    .line 35
    goto/16 :goto_2

    .line 36
    .line 37
    :cond_2
    invoke-virtual {p0}, Landroid/widget/ImageView;->getDrawable()Landroid/graphics/drawable/Drawable;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    instance-of v0, v0, Landroid/graphics/drawable/BitmapDrawable;

    .line 42
    .line 43
    if-eqz v0, :cond_3

    .line 44
    .line 45
    invoke-virtual {p0}, Landroid/widget/ImageView;->getDrawable()Landroid/graphics/drawable/Drawable;

    .line 46
    .line 47
    .line 48
    move-result-object v0

    .line 49
    check-cast v0, Landroid/graphics/drawable/BitmapDrawable;

    .line 50
    .line 51
    invoke-virtual {v0}, Landroid/graphics/drawable/BitmapDrawable;->getBitmap()Landroid/graphics/Bitmap;

    .line 52
    .line 53
    .line 54
    move-result-object v0

    .line 55
    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getWidth()I

    .line 56
    .line 57
    .line 58
    move-result v1

    .line 59
    iput v1, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->k:I

    .line 60
    .line 61
    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getHeight()I

    .line 62
    .line 63
    .line 64
    move-result v0

    .line 65
    iput v0, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->l:I

    .line 66
    .line 67
    goto :goto_0

    .line 68
    :cond_3
    invoke-virtual {p0}, Landroid/widget/ImageView;->getDrawable()Landroid/graphics/drawable/Drawable;

    .line 69
    .line 70
    .line 71
    move-result-object v0

    .line 72
    instance-of v0, v0, Landroid/graphics/drawable/ColorDrawable;

    .line 73
    .line 74
    if-eqz v0, :cond_4

    .line 75
    .line 76
    invoke-virtual {p0}, Landroid/widget/ImageView;->getDrawable()Landroid/graphics/drawable/Drawable;

    .line 77
    .line 78
    .line 79
    move-result-object v0

    .line 80
    check-cast v0, Landroid/graphics/drawable/ColorDrawable;

    .line 81
    .line 82
    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->getIntrinsicWidth()I

    .line 83
    .line 84
    .line 85
    move-result v1

    .line 86
    iput v1, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->k:I

    .line 87
    .line 88
    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->getIntrinsicHeight()I

    .line 89
    .line 90
    .line 91
    move-result v0

    .line 92
    iput v0, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->l:I

    .line 93
    .line 94
    goto :goto_0

    .line 95
    :cond_4
    invoke-virtual {p0}, Landroid/widget/ImageView;->getDrawable()Landroid/graphics/drawable/Drawable;

    .line 96
    .line 97
    .line 98
    move-result-object v0

    .line 99
    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->getIntrinsicWidth()I

    .line 100
    .line 101
    .line 102
    move-result v0

    .line 103
    invoke-virtual {p0}, Landroid/widget/ImageView;->getDrawable()Landroid/graphics/drawable/Drawable;

    .line 104
    .line 105
    .line 106
    move-result-object v1

    .line 107
    invoke-virtual {v1}, Landroid/graphics/drawable/Drawable;->getIntrinsicHeight()I

    .line 108
    .line 109
    .line 110
    move-result v1

    .line 111
    sget-object v2, Landroid/graphics/Bitmap$Config;->RGB_565:Landroid/graphics/Bitmap$Config;

    .line 112
    .line 113
    invoke-static {v0, v1, v2}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    .line 114
    .line 115
    .line 116
    move-result-object v0

    .line 117
    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getWidth()I

    .line 118
    .line 119
    .line 120
    move-result v1

    .line 121
    iput v1, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->k:I

    .line 122
    .line 123
    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getHeight()I

    .line 124
    .line 125
    .line 126
    move-result v0

    .line 127
    iput v0, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->l:I

    .line 128
    .line 129
    :goto_0
    new-instance v0, Lx2/e;

    .line 130
    .line 131
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 132
    .line 133
    .line 134
    iput-object v0, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->f:Lx2/e;

    .line 135
    .line 136
    const/4 v1, 0x0

    .line 137
    iput v1, v0, Lx2/e;->e:I

    .line 138
    .line 139
    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->i:Landroid/graphics/Rect;

    .line 140
    .line 141
    if-nez v0, :cond_5

    .line 142
    .line 143
    new-instance v0, Landroid/graphics/Rect;

    .line 144
    .line 145
    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    .line 146
    .line 147
    .line 148
    iput-object v0, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->i:Landroid/graphics/Rect;

    .line 149
    .line 150
    :cond_5
    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->f:Lx2/e;

    .line 151
    .line 152
    iget-object v2, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->i:Landroid/graphics/Rect;

    .line 153
    .line 154
    iget v3, v2, Landroid/graphics/Rect;->left:I

    .line 155
    .line 156
    int-to-float v3, v3

    .line 157
    iput v3, v0, Lx2/e;->a:F

    .line 158
    .line 159
    iget v2, v2, Landroid/graphics/Rect;->top:I

    .line 160
    .line 161
    invoke-static {}, Landroid/content/res/Resources;->getSystem()Landroid/content/res/Resources;

    .line 162
    .line 163
    .line 164
    move-result-object v3

    .line 165
    const-string v4, "dimen"

    .line 166
    .line 167
    const-string v5, "android"

    .line 168
    .line 169
    const-string v6, "status_bar_height"

    .line 170
    .line 171
    invoke-virtual {v3, v6, v4, v5}, Landroid/content/res/Resources;->getIdentifier(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I

    .line 172
    .line 173
    .line 174
    move-result v4

    .line 175
    if-lez v4, :cond_6

    .line 176
    .line 177
    invoke-virtual {v3, v4}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 178
    .line 179
    .line 180
    move-result v1

    .line 181
    :cond_6
    sub-int/2addr v2, v1

    .line 182
    int-to-float v1, v2

    .line 183
    iput v1, v0, Lx2/e;->b:F

    .line 184
    .line 185
    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->f:Lx2/e;

    .line 186
    .line 187
    iget-object v1, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->i:Landroid/graphics/Rect;

    .line 188
    .line 189
    invoke-virtual {v1}, Landroid/graphics/Rect;->width()I

    .line 190
    .line 191
    .line 192
    move-result v1

    .line 193
    int-to-float v1, v1

    .line 194
    iput v1, v0, Lx2/e;->c:F

    .line 195
    .line 196
    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->f:Lx2/e;

    .line 197
    .line 198
    iget-object v1, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->i:Landroid/graphics/Rect;

    .line 199
    .line 200
    invoke-virtual {v1}, Landroid/graphics/Rect;->height()I

    .line 201
    .line 202
    .line 203
    move-result v1

    .line 204
    int-to-float v1, v1

    .line 205
    iput v1, v0, Lx2/e;->d:F

    .line 206
    .line 207
    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->i:Landroid/graphics/Rect;

    .line 208
    .line 209
    invoke-virtual {v0}, Landroid/graphics/Rect;->width()I

    .line 210
    .line 211
    .line 212
    move-result v0

    .line 213
    int-to-float v0, v0

    .line 214
    iget v1, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->k:I

    .line 215
    .line 216
    int-to-float v1, v1

    .line 217
    div-float/2addr v0, v1

    .line 218
    iget-object v1, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->i:Landroid/graphics/Rect;

    .line 219
    .line 220
    invoke-virtual {v1}, Landroid/graphics/Rect;->height()I

    .line 221
    .line 222
    .line 223
    move-result v1

    .line 224
    int-to-float v1, v1

    .line 225
    iget v2, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->l:I

    .line 226
    .line 227
    int-to-float v2, v2

    .line 228
    div-float/2addr v1, v2

    .line 229
    iget-object v2, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->f:Lx2/e;

    .line 230
    .line 231
    invoke-static {v0, v1}, Ljava/lang/Math;->max(FF)F

    .line 232
    .line 233
    .line 234
    move-result v0

    .line 235
    iput v0, v2, Lx2/e;->f:F

    .line 236
    .line 237
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    .line 238
    .line 239
    .line 240
    move-result v0

    .line 241
    int-to-float v0, v0

    .line 242
    iget v1, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->k:I

    .line 243
    .line 244
    int-to-float v1, v1

    .line 245
    div-float/2addr v0, v1

    .line 246
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    .line 247
    .line 248
    .line 249
    move-result v1

    .line 250
    int-to-float v1, v1

    .line 251
    iget v2, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->l:I

    .line 252
    .line 253
    int-to-float v2, v2

    .line 254
    div-float/2addr v1, v2

    .line 255
    new-instance v2, Lx2/e;

    .line 256
    .line 257
    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    .line 258
    .line 259
    .line 260
    iput-object v2, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->g:Lx2/e;

    .line 261
    .line 262
    invoke-static {v0, v1}, Ljava/lang/Math;->min(FF)F

    .line 263
    .line 264
    .line 265
    move-result v0

    .line 266
    iput v0, v2, Lx2/e;->f:F

    .line 267
    .line 268
    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->g:Lx2/e;

    .line 269
    .line 270
    const/16 v1, 0xff

    .line 271
    .line 272
    iput v1, v0, Lx2/e;->e:I

    .line 273
    .line 274
    iget v1, v0, Lx2/e;->f:F

    .line 275
    .line 276
    iget v2, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->k:I

    .line 277
    .line 278
    int-to-float v2, v2

    .line 279
    mul-float/2addr v2, v1

    .line 280
    float-to-int v2, v2

    .line 281
    iget v3, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->l:I

    .line 282
    .line 283
    int-to-float v3, v3

    .line 284
    mul-float/2addr v1, v3

    .line 285
    float-to-int v1, v1

    .line 286
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    .line 287
    .line 288
    .line 289
    move-result v3

    .line 290
    sub-int/2addr v3, v2

    .line 291
    int-to-float v3, v3

    .line 292
    const/high16 v4, 0x40000000    # 2.0f

    .line 293
    .line 294
    div-float/2addr v3, v4

    .line 295
    iput v3, v0, Lx2/e;->a:F

    .line 296
    .line 297
    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->g:Lx2/e;

    .line 298
    .line 299
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    .line 300
    .line 301
    .line 302
    move-result v3

    .line 303
    sub-int/2addr v3, v1

    .line 304
    int-to-float v3, v3

    .line 305
    div-float/2addr v3, v4

    .line 306
    iput v3, v0, Lx2/e;->b:F

    .line 307
    .line 308
    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->g:Lx2/e;

    .line 309
    .line 310
    int-to-float v2, v2

    .line 311
    iput v2, v0, Lx2/e;->c:F

    .line 312
    .line 313
    int-to-float v1, v1

    .line 314
    iput v1, v0, Lx2/e;->d:F

    .line 315
    .line 316
    iget-object v1, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->c:Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$Status;

    .line 317
    .line 318
    sget-object v2, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$Status;->STATE_IN:Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$Status;

    .line 319
    .line 320
    if-ne v1, v2, :cond_7

    .line 321
    .line 322
    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->f:Lx2/e;

    .line 323
    .line 324
    invoke-virtual {v0}, Lx2/e;->c()Lx2/e;

    .line 325
    .line 326
    .line 327
    move-result-object v0

    .line 328
    iput-object v0, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->h:Lx2/e;

    .line 329
    .line 330
    goto :goto_1

    .line 331
    :cond_7
    sget-object v2, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$Status;->STATE_OUT:Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$Status;

    .line 332
    .line 333
    if-ne v1, v2, :cond_8

    .line 334
    .line 335
    invoke-virtual {v0}, Lx2/e;->c()Lx2/e;

    .line 336
    .line 337
    .line 338
    move-result-object v0

    .line 339
    iput-object v0, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->h:Lx2/e;

    .line 340
    .line 341
    :cond_8
    :goto_1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->g:Lx2/e;

    .line 342
    .line 343
    iput-object v0, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->v:Lx2/e;

    .line 344
    .line 345
    :cond_9
    :goto_2
    return-void
.end method

.method public final d()F
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->v:Lx2/e;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->c()V

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
    iget-object v1, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->v:Lx2/e;

    .line 14
    .line 15
    iget v1, v1, Lx2/e;->d:F

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

.method public final dispatchTouchEvent(Landroid/view/MotionEvent;)Z
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
    if-nez v1, :cond_a

    .line 16
    .line 17
    const/4 v1, 0x0

    .line 18
    if-eqz v0, :cond_7

    .line 19
    .line 20
    if-eq v0, v4, :cond_5

    .line 21
    .line 22
    const/4 v5, 0x2

    .line 23
    if-eq v0, v5, :cond_0

    .line 24
    .line 25
    if-eq v0, v3, :cond_5

    .line 26
    .line 27
    goto/16 :goto_0

    .line 28
    .line 29
    :cond_0
    iget-boolean v0, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->r:Z

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
    goto/16 :goto_0

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
    iget v5, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->o:I

    .line 52
    .line 53
    sub-int/2addr v0, v5

    .line 54
    iget v5, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->p:I

    .line 55
    .line 56
    sub-int/2addr v3, v5

    .line 57
    iget-boolean v5, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->q:Z

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
    invoke-super {p0, p1}, Landroid/view/View;->dispatchTouchEvent(Landroid/view/MotionEvent;)Z

    .line 79
    .line 80
    .line 81
    move-result p1

    .line 82
    return p1

    .line 83
    :cond_3
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getPointerCount()I

    .line 84
    .line 85
    .line 86
    move-result v5

    .line 87
    if-ne v5, v4, :cond_e

    .line 88
    .line 89
    sget-object p1, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$Status;->STATE_MOVE:Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$Status;

    .line 90
    .line 91
    iput-object p1, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->c:Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$Status;

    .line 92
    .line 93
    invoke-virtual {p0, v0}, Landroid/view/View;->offsetLeftAndRight(I)V

    .line 94
    .line 95
    .line 96
    invoke-virtual {p0, v3}, Landroid/view/View;->offsetTopAndBottom(I)V

    .line 97
    .line 98
    .line 99
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->d()F

    .line 100
    .line 101
    .line 102
    move-result p1

    .line 103
    const v0, 0x3dcccccd    # 0.1f

    .line 104
    .line 105
    .line 106
    mul-float/2addr v0, p1

    .line 107
    sub-float v0, v2, v0

    .line 108
    .line 109
    invoke-virtual {p0, v0}, Landroid/view/View;->setScaleY(F)V

    .line 110
    .line 111
    .line 112
    invoke-virtual {p0, v0}, Landroid/view/View;->setScaleX(F)V

    .line 113
    .line 114
    .line 115
    iput-boolean v4, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->q:Z

    .line 116
    .line 117
    const/high16 v0, 0x437f0000    # 255.0f

    .line 118
    .line 119
    const/high16 v3, 0x3f000000    # 0.5f

    .line 120
    .line 121
    invoke-static {p1, v3, v2, v0}, Landroidx/compose/material3/c;->y(FFFF)F

    .line 122
    .line 123
    .line 124
    move-result p1

    .line 125
    float-to-int p1, p1

    .line 126
    iput p1, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->s:I

    .line 127
    .line 128
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    .line 129
    .line 130
    .line 131
    iget p1, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->s:I

    .line 132
    .line 133
    if-gez p1, :cond_4

    .line 134
    .line 135
    iput v1, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->s:I

    .line 136
    .line 137
    :cond_4
    iget-object p1, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->t:Lx2/c;

    .line 138
    .line 139
    if-eqz p1, :cond_d

    .line 140
    .line 141
    iget v0, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->s:I

    .line 142
    .line 143
    check-cast p1, Lw2/a;

    .line 144
    .line 145
    invoke-virtual {p1, v0}, Lw2/a;->a(I)V

    .line 146
    .line 147
    .line 148
    return v4

    .line 149
    :cond_5
    iget-boolean v0, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->q:Z

    .line 150
    .line 151
    if-eqz v0, :cond_e

    .line 152
    .line 153
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->d()F

    .line 154
    .line 155
    .line 156
    move-result p1

    .line 157
    iget v0, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->n:F

    .line 158
    .line 159
    cmpg-float p1, p1, v0

    .line 160
    .line 161
    if-gtz p1, :cond_6

    .line 162
    .line 163
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->e()V

    .line 164
    .line 165
    .line 166
    return v4

    .line 167
    :cond_6
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->a()V

    .line 168
    .line 169
    .line 170
    sget p1, Lcom/xuexiang/xui/R$id;->item_image_key:I

    .line 171
    .line 172
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 173
    .line 174
    invoke-virtual {p0, p1, v0}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    .line 175
    .line 176
    .line 177
    iget-object p1, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->u:Lx2/d;

    .line 178
    .line 179
    if-eqz p1, :cond_d

    .line 180
    .line 181
    check-cast p1, Lw2/a;

    .line 182
    .line 183
    iget-object p1, p1, Lw2/a;->a:Lcom/xuexiang/xui/widget/imageview/preview/ui/BasePhotoFragment;

    .line 184
    .line 185
    invoke-virtual {p1}, Landroidx/fragment/app/Fragment;->getActivity()Landroidx/fragment/app/FragmentActivity;

    .line 186
    .line 187
    .line 188
    move-result-object p1

    .line 189
    check-cast p1, Lcom/xuexiang/xui/widget/imageview/preview/ui/PreviewActivity;

    .line 190
    .line 191
    if-eqz p1, :cond_d

    .line 192
    .line 193
    invoke-virtual {p1}, Lcom/xuexiang/xui/widget/imageview/preview/ui/PreviewActivity;->q()V

    .line 194
    .line 195
    .line 196
    return v4

    .line 197
    :cond_7
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    .line 198
    .line 199
    .line 200
    move-result v0

    .line 201
    float-to-int v0, v0

    .line 202
    iput v0, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->o:I

    .line 203
    .line 204
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    .line 205
    .line 206
    .line 207
    move-result v0

    .line 208
    float-to-int v0, v0

    .line 209
    iput v0, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->p:I

    .line 210
    .line 211
    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->v:Lx2/e;

    .line 212
    .line 213
    if-nez v0, :cond_8

    .line 214
    .line 215
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->c()V

    .line 216
    .line 217
    .line 218
    :cond_8
    iput-boolean v1, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->r:Z

    .line 219
    .line 220
    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->v:Lx2/e;

    .line 221
    .line 222
    if-eqz v0, :cond_9

    .line 223
    .line 224
    iget v2, v0, Lx2/e;->b:F

    .line 225
    .line 226
    float-to-int v3, v2

    .line 227
    iget v0, v0, Lx2/e;->d:F

    .line 228
    .line 229
    add-float/2addr v0, v2

    .line 230
    float-to-int v0, v0

    .line 231
    iget v2, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->p:I

    .line 232
    .line 233
    if-lt v2, v3, :cond_9

    .line 234
    .line 235
    if-lt v0, v2, :cond_9

    .line 236
    .line 237
    iput-boolean v4, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->r:Z

    .line 238
    .line 239
    :cond_9
    iput-boolean v1, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->q:Z

    .line 240
    .line 241
    goto :goto_0

    .line 242
    :cond_a
    if-eq v0, v4, :cond_b

    .line 243
    .line 244
    if-eq v0, v3, :cond_b

    .line 245
    .line 246
    goto :goto_0

    .line 247
    :cond_b
    iget-boolean v0, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->q:Z

    .line 248
    .line 249
    if-eqz v0, :cond_e

    .line 250
    .line 251
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->d()F

    .line 252
    .line 253
    .line 254
    move-result p1

    .line 255
    iget v0, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->n:F

    .line 256
    .line 257
    cmpg-float p1, p1, v0

    .line 258
    .line 259
    if-gtz p1, :cond_c

    .line 260
    .line 261
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->e()V

    .line 262
    .line 263
    .line 264
    return v4

    .line 265
    :cond_c
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->a()V

    .line 266
    .line 267
    .line 268
    sget p1, Lcom/xuexiang/xui/R$id;->item_image_key:I

    .line 269
    .line 270
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 271
    .line 272
    invoke-virtual {p0, p1, v0}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    .line 273
    .line 274
    .line 275
    iget-object p1, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->u:Lx2/d;

    .line 276
    .line 277
    if-eqz p1, :cond_d

    .line 278
    .line 279
    check-cast p1, Lw2/a;

    .line 280
    .line 281
    iget-object p1, p1, Lw2/a;->a:Lcom/xuexiang/xui/widget/imageview/preview/ui/BasePhotoFragment;

    .line 282
    .line 283
    invoke-virtual {p1}, Landroidx/fragment/app/Fragment;->getActivity()Landroidx/fragment/app/FragmentActivity;

    .line 284
    .line 285
    .line 286
    move-result-object p1

    .line 287
    check-cast p1, Lcom/xuexiang/xui/widget/imageview/preview/ui/PreviewActivity;

    .line 288
    .line 289
    if-eqz p1, :cond_d

    .line 290
    .line 291
    invoke-virtual {p1}, Lcom/xuexiang/xui/widget/imageview/preview/ui/PreviewActivity;->q()V

    .line 292
    .line 293
    .line 294
    :cond_d
    return v4

    .line 295
    :cond_e
    :goto_0
    invoke-super {p0, p1}, Landroid/view/View;->dispatchTouchEvent(Landroid/view/MotionEvent;)Z

    .line 296
    .line 297
    .line 298
    move-result p1

    .line 299
    return p1
.end method

.method public final e()V
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
    new-instance v2, Lx2/a;

    .line 15
    .line 16
    invoke-direct {v2, p0, v1}, Lx2/a;-><init>(Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;I)V

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
    new-instance v3, Lx2/a;

    .line 35
    .line 36
    const/4 v4, 0x1

    .line 37
    invoke-direct {v3, p0, v4}, Lx2/a;-><init>(Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;I)V

    .line 38
    .line 39
    .line 40
    invoke-virtual {v2, v3}, Landroid/animation/ValueAnimator;->addUpdateListener(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V

    .line 41
    .line 42
    .line 43
    iget v3, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->s:I

    .line 44
    .line 45
    const/16 v5, 0xff

    .line 46
    .line 47
    filled-new-array {v3, v5}, [I

    .line 48
    .line 49
    .line 50
    move-result-object v3

    .line 51
    invoke-static {v3}, Landroid/animation/ValueAnimator;->ofInt([I)Landroid/animation/ValueAnimator;

    .line 52
    .line 53
    .line 54
    move-result-object v3

    .line 55
    new-instance v5, Lx2/b;

    .line 56
    .line 57
    invoke-direct {v5, p0, v1}, Lx2/b;-><init>(Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;I)V

    .line 58
    .line 59
    .line 60
    invoke-virtual {v3, v5}, Landroid/animation/ValueAnimator;->addUpdateListener(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V

    .line 61
    .line 62
    .line 63
    invoke-virtual {p0}, Landroid/view/View;->getScaleX()F

    .line 64
    .line 65
    .line 66
    move-result v5

    .line 67
    const/4 v6, 0x2

    .line 68
    new-array v7, v6, [F

    .line 69
    .line 70
    aput v5, v7, v1

    .line 71
    .line 72
    const/high16 v5, 0x3f800000    # 1.0f

    .line 73
    .line 74
    aput v5, v7, v4

    .line 75
    .line 76
    invoke-static {v7}, Landroid/animation/ValueAnimator;->ofFloat([F)Landroid/animation/ValueAnimator;

    .line 77
    .line 78
    .line 79
    move-result-object v5

    .line 80
    new-instance v7, Lx2/b;

    .line 81
    .line 82
    invoke-direct {v7, p0, v4}, Lx2/b;-><init>(Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;I)V

    .line 83
    .line 84
    .line 85
    invoke-virtual {v5, v7}, Landroid/animation/ValueAnimator;->addUpdateListener(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V

    .line 86
    .line 87
    .line 88
    new-instance v7, Landroid/animation/AnimatorSet;

    .line 89
    .line 90
    invoke-direct {v7}, Landroid/animation/AnimatorSet;-><init>()V

    .line 91
    .line 92
    .line 93
    sget v8, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->x:I

    .line 94
    .line 95
    int-to-long v8, v8

    .line 96
    invoke-virtual {v7, v8, v9}, Landroid/animation/AnimatorSet;->setDuration(J)Landroid/animation/AnimatorSet;

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
    invoke-virtual {v7, v8}, Landroid/animation/AnimatorSet;->setInterpolator(Landroid/animation/TimeInterpolator;)V

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
    aput-object v2, v8, v4

    .line 113
    .line 114
    aput-object v5, v8, v6

    .line 115
    .line 116
    const/4 v0, 0x3

    .line 117
    aput-object v3, v8, v0

    .line 118
    .line 119
    invoke-virtual {v7, v8}, Landroid/animation/AnimatorSet;->playTogether([Landroid/animation/Animator;)V

    .line 120
    .line 121
    .line 122
    invoke-virtual {v7}, Landroid/animation/AnimatorSet;->start()V

    .line 123
    .line 124
    .line 125
    return-void
.end method

.method public final f(Lcom/xuexiang/xui/widget/imageview/preview/view/b;)V
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
    invoke-virtual {p0, p1}, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->setOnTransformListener(Lcom/xuexiang/xui/widget/imageview/preview/view/b;)V

    .line 46
    .line 47
    .line 48
    const/4 p1, 0x1

    .line 49
    iput-boolean p1, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->j:Z

    .line 50
    .line 51
    sget-object p1, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$Status;->STATE_OUT:Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$Status;

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

.method public final onDetachedFromWindow()V
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
    iput-object v0, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->f:Lx2/e;

    .line 17
    .line 18
    iput-object v0, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->g:Lx2/e;

    .line 19
    .line 20
    iput-object v0, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->h:Lx2/e;

    .line 21
    .line 22
    iget-object v1, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->m:Landroid/animation/ValueAnimator;

    .line 23
    .line 24
    if-eqz v1, :cond_0

    .line 25
    .line 26
    invoke-virtual {v1}, Landroid/animation/ValueAnimator;->cancel()V

    .line 27
    .line 28
    .line 29
    iget-object v1, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->m:Landroid/animation/ValueAnimator;

    .line 30
    .line 31
    invoke-virtual {v1}, Landroid/animation/ValueAnimator;->clone()Landroid/animation/ValueAnimator;

    .line 32
    .line 33
    .line 34
    iput-object v0, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->m:Landroid/animation/ValueAnimator;

    .line 35
    .line 36
    :cond_0
    return-void
.end method

.method public final onDraw(Landroid/graphics/Canvas;)V
    .locals 19

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    invoke-virtual {v0}, Landroid/widget/ImageView;->getDrawable()Landroid/graphics/drawable/Drawable;

    .line 6
    .line 7
    .line 8
    move-result-object v2

    .line 9
    if-nez v2, :cond_0

    .line 10
    .line 11
    goto/16 :goto_2

    .line 12
    .line 13
    :cond_0
    iget-object v2, v0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->c:Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$Status;

    .line 14
    .line 15
    sget-object v3, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$Status;->STATE_OUT:Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$Status;

    .line 16
    .line 17
    const/4 v4, 0x0

    .line 18
    if-eq v2, v3, :cond_3

    .line 19
    .line 20
    sget-object v5, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$Status;->STATE_IN:Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$Status;

    .line 21
    .line 22
    if-ne v2, v5, :cond_1

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_1
    sget-object v3, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$Status;->STATE_MOVE:Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$Status;

    .line 26
    .line 27
    if-ne v2, v3, :cond_2

    .line 28
    .line 29
    iget-object v2, v0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->d:Landroid/graphics/Paint;

    .line 30
    .line 31
    invoke-virtual {v2, v4}, Landroid/graphics/Paint;->setAlpha(I)V

    .line 32
    .line 33
    .line 34
    iget-object v2, v0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->d:Landroid/graphics/Paint;

    .line 35
    .line 36
    invoke-virtual {v1, v2}, Landroid/graphics/Canvas;->drawPaint(Landroid/graphics/Paint;)V

    .line 37
    .line 38
    .line 39
    invoke-super/range {p0 .. p1}, Landroid/view/View;->onDraw(Landroid/graphics/Canvas;)V

    .line 40
    .line 41
    .line 42
    return-void

    .line 43
    :cond_2
    iget-object v2, v0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->d:Landroid/graphics/Paint;

    .line 44
    .line 45
    const/16 v3, 0xff

    .line 46
    .line 47
    invoke-virtual {v2, v3}, Landroid/graphics/Paint;->setAlpha(I)V

    .line 48
    .line 49
    .line 50
    iget-object v2, v0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->d:Landroid/graphics/Paint;

    .line 51
    .line 52
    invoke-virtual {v1, v2}, Landroid/graphics/Canvas;->drawPaint(Landroid/graphics/Paint;)V

    .line 53
    .line 54
    .line 55
    invoke-super/range {p0 .. p1}, Landroid/view/View;->onDraw(Landroid/graphics/Canvas;)V

    .line 56
    .line 57
    .line 58
    return-void

    .line 59
    :cond_3
    :goto_0
    iget-object v2, v0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->f:Lx2/e;

    .line 60
    .line 61
    if-eqz v2, :cond_4

    .line 62
    .line 63
    iget-object v2, v0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->g:Lx2/e;

    .line 64
    .line 65
    if-eqz v2, :cond_4

    .line 66
    .line 67
    iget-object v2, v0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->h:Lx2/e;

    .line 68
    .line 69
    if-nez v2, :cond_5

    .line 70
    .line 71
    :cond_4
    invoke-virtual {v0}, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->c()V

    .line 72
    .line 73
    .line 74
    :cond_5
    iget-object v2, v0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->h:Lx2/e;

    .line 75
    .line 76
    if-nez v2, :cond_6

    .line 77
    .line 78
    invoke-super/range {p0 .. p1}, Landroid/view/View;->onDraw(Landroid/graphics/Canvas;)V

    .line 79
    .line 80
    .line 81
    return-void

    .line 82
    :cond_6
    iget-object v5, v0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->d:Landroid/graphics/Paint;

    .line 83
    .line 84
    iget v2, v2, Lx2/e;->e:I

    .line 85
    .line 86
    invoke-virtual {v5, v2}, Landroid/graphics/Paint;->setAlpha(I)V

    .line 87
    .line 88
    .line 89
    iget-object v2, v0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->d:Landroid/graphics/Paint;

    .line 90
    .line 91
    invoke-virtual {v1, v2}, Landroid/graphics/Canvas;->drawPaint(Landroid/graphics/Paint;)V

    .line 92
    .line 93
    .line 94
    invoke-virtual {v1}, Landroid/graphics/Canvas;->getSaveCount()I

    .line 95
    .line 96
    .line 97
    move-result v2

    .line 98
    iget-object v5, v0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->e:Landroid/graphics/Matrix;

    .line 99
    .line 100
    iget-object v6, v0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->h:Lx2/e;

    .line 101
    .line 102
    iget v6, v6, Lx2/e;->f:F

    .line 103
    .line 104
    invoke-virtual {v5, v6, v6}, Landroid/graphics/Matrix;->setScale(FF)V

    .line 105
    .line 106
    .line 107
    iget v5, v0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->k:I

    .line 108
    .line 109
    int-to-float v5, v5

    .line 110
    iget-object v6, v0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->h:Lx2/e;

    .line 111
    .line 112
    iget v7, v6, Lx2/e;->f:F

    .line 113
    .line 114
    mul-float/2addr v5, v7

    .line 115
    iget v8, v6, Lx2/e;->c:F

    .line 116
    .line 117
    sub-float/2addr v5, v8

    .line 118
    neg-float v5, v5

    .line 119
    const/high16 v8, 0x40000000    # 2.0f

    .line 120
    .line 121
    div-float/2addr v5, v8

    .line 122
    iget v9, v0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->l:I

    .line 123
    .line 124
    int-to-float v9, v9

    .line 125
    mul-float/2addr v9, v7

    .line 126
    iget v6, v6, Lx2/e;->d:F

    .line 127
    .line 128
    sub-float/2addr v9, v6

    .line 129
    neg-float v6, v9

    .line 130
    div-float/2addr v6, v8

    .line 131
    iget-object v7, v0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->e:Landroid/graphics/Matrix;

    .line 132
    .line 133
    invoke-virtual {v7, v5, v6}, Landroid/graphics/Matrix;->postTranslate(FF)Z

    .line 134
    .line 135
    .line 136
    iget-object v5, v0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->h:Lx2/e;

    .line 137
    .line 138
    iget v6, v5, Lx2/e;->a:F

    .line 139
    .line 140
    iget v5, v5, Lx2/e;->b:F

    .line 141
    .line 142
    invoke-virtual {v1, v6, v5}, Landroid/graphics/Canvas;->translate(FF)V

    .line 143
    .line 144
    .line 145
    iget-object v5, v0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->h:Lx2/e;

    .line 146
    .line 147
    iget v6, v5, Lx2/e;->c:F

    .line 148
    .line 149
    iget v5, v5, Lx2/e;->d:F

    .line 150
    .line 151
    const/4 v7, 0x0

    .line 152
    invoke-virtual {v1, v7, v7, v6, v5}, Landroid/graphics/Canvas;->clipRect(FFFF)Z

    .line 153
    .line 154
    .line 155
    iget-object v5, v0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->e:Landroid/graphics/Matrix;

    .line 156
    .line 157
    invoke-virtual {v1, v5}, Landroid/graphics/Canvas;->concat(Landroid/graphics/Matrix;)V

    .line 158
    .line 159
    .line 160
    invoke-virtual {v0}, Landroid/widget/ImageView;->getDrawable()Landroid/graphics/drawable/Drawable;

    .line 161
    .line 162
    .line 163
    move-result-object v5

    .line 164
    invoke-virtual {v5, v1}, Landroid/graphics/drawable/Drawable;->draw(Landroid/graphics/Canvas;)V

    .line 165
    .line 166
    .line 167
    invoke-virtual {v1, v2}, Landroid/graphics/Canvas;->restoreToCount(I)V

    .line 168
    .line 169
    .line 170
    iget-boolean v1, v0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->j:Z

    .line 171
    .line 172
    if-eqz v1, :cond_a

    .line 173
    .line 174
    iput-boolean v4, v0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->j:Z

    .line 175
    .line 176
    iget-object v1, v0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->h:Lx2/e;

    .line 177
    .line 178
    if-nez v1, :cond_7

    .line 179
    .line 180
    goto/16 :goto_2

    .line 181
    .line 182
    :cond_7
    new-instance v1, Landroid/animation/ValueAnimator;

    .line 183
    .line 184
    invoke-direct {v1}, Landroid/animation/ValueAnimator;-><init>()V

    .line 185
    .line 186
    .line 187
    iput-object v1, v0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->m:Landroid/animation/ValueAnimator;

    .line 188
    .line 189
    sget v2, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->x:I

    .line 190
    .line 191
    int-to-long v5, v2

    .line 192
    invoke-virtual {v1, v5, v6}, Landroid/animation/ValueAnimator;->setDuration(J)Landroid/animation/ValueAnimator;

    .line 193
    .line 194
    .line 195
    iget-object v1, v0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->m:Landroid/animation/ValueAnimator;

    .line 196
    .line 197
    new-instance v2, Landroid/view/animation/AccelerateDecelerateInterpolator;

    .line 198
    .line 199
    invoke-direct {v2}, Landroid/view/animation/AccelerateDecelerateInterpolator;-><init>()V

    .line 200
    .line 201
    .line 202
    invoke-virtual {v1, v2}, Landroid/animation/ValueAnimator;->setInterpolator(Landroid/animation/TimeInterpolator;)V

    .line 203
    .line 204
    .line 205
    iget-object v1, v0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->c:Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$Status;

    .line 206
    .line 207
    sget-object v2, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$Status;->STATE_IN:Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$Status;

    .line 208
    .line 209
    const/4 v5, 0x1

    .line 210
    const/4 v6, 0x2

    .line 211
    const-string v7, "animHeight"

    .line 212
    .line 213
    const-string v8, "animWidth"

    .line 214
    .line 215
    const-string v9, "animTop"

    .line 216
    .line 217
    const-string v10, "animLeft"

    .line 218
    .line 219
    const-string v11, "animAlpha"

    .line 220
    .line 221
    const-string v12, "animScale"

    .line 222
    .line 223
    if-ne v1, v2, :cond_8

    .line 224
    .line 225
    iget-object v1, v0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->f:Lx2/e;

    .line 226
    .line 227
    iget v1, v1, Lx2/e;->f:F

    .line 228
    .line 229
    iget-object v2, v0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->g:Lx2/e;

    .line 230
    .line 231
    iget v2, v2, Lx2/e;->f:F

    .line 232
    .line 233
    new-array v3, v6, [F

    .line 234
    .line 235
    aput v1, v3, v4

    .line 236
    .line 237
    aput v2, v3, v5

    .line 238
    .line 239
    invoke-static {v12, v3}, Landroid/animation/PropertyValuesHolder;->ofFloat(Ljava/lang/String;[F)Landroid/animation/PropertyValuesHolder;

    .line 240
    .line 241
    .line 242
    move-result-object v13

    .line 243
    iget-object v1, v0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->f:Lx2/e;

    .line 244
    .line 245
    iget v1, v1, Lx2/e;->e:I

    .line 246
    .line 247
    iget-object v2, v0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->g:Lx2/e;

    .line 248
    .line 249
    iget v2, v2, Lx2/e;->e:I

    .line 250
    .line 251
    filled-new-array {v1, v2}, [I

    .line 252
    .line 253
    .line 254
    move-result-object v1

    .line 255
    invoke-static {v11, v1}, Landroid/animation/PropertyValuesHolder;->ofInt(Ljava/lang/String;[I)Landroid/animation/PropertyValuesHolder;

    .line 256
    .line 257
    .line 258
    move-result-object v14

    .line 259
    iget-object v1, v0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->f:Lx2/e;

    .line 260
    .line 261
    iget v1, v1, Lx2/e;->a:F

    .line 262
    .line 263
    iget-object v2, v0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->g:Lx2/e;

    .line 264
    .line 265
    iget v2, v2, Lx2/e;->a:F

    .line 266
    .line 267
    new-array v3, v6, [F

    .line 268
    .line 269
    aput v1, v3, v4

    .line 270
    .line 271
    aput v2, v3, v5

    .line 272
    .line 273
    invoke-static {v10, v3}, Landroid/animation/PropertyValuesHolder;->ofFloat(Ljava/lang/String;[F)Landroid/animation/PropertyValuesHolder;

    .line 274
    .line 275
    .line 276
    move-result-object v15

    .line 277
    iget-object v1, v0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->f:Lx2/e;

    .line 278
    .line 279
    iget v1, v1, Lx2/e;->b:F

    .line 280
    .line 281
    iget-object v2, v0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->g:Lx2/e;

    .line 282
    .line 283
    iget v2, v2, Lx2/e;->b:F

    .line 284
    .line 285
    new-array v3, v6, [F

    .line 286
    .line 287
    aput v1, v3, v4

    .line 288
    .line 289
    aput v2, v3, v5

    .line 290
    .line 291
    invoke-static {v9, v3}, Landroid/animation/PropertyValuesHolder;->ofFloat(Ljava/lang/String;[F)Landroid/animation/PropertyValuesHolder;

    .line 292
    .line 293
    .line 294
    move-result-object v16

    .line 295
    iget-object v1, v0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->f:Lx2/e;

    .line 296
    .line 297
    iget v1, v1, Lx2/e;->c:F

    .line 298
    .line 299
    iget-object v2, v0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->g:Lx2/e;

    .line 300
    .line 301
    iget v2, v2, Lx2/e;->c:F

    .line 302
    .line 303
    new-array v3, v6, [F

    .line 304
    .line 305
    aput v1, v3, v4

    .line 306
    .line 307
    aput v2, v3, v5

    .line 308
    .line 309
    invoke-static {v8, v3}, Landroid/animation/PropertyValuesHolder;->ofFloat(Ljava/lang/String;[F)Landroid/animation/PropertyValuesHolder;

    .line 310
    .line 311
    .line 312
    move-result-object v17

    .line 313
    iget-object v1, v0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->f:Lx2/e;

    .line 314
    .line 315
    iget v1, v1, Lx2/e;->d:F

    .line 316
    .line 317
    iget-object v2, v0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->g:Lx2/e;

    .line 318
    .line 319
    iget v2, v2, Lx2/e;->d:F

    .line 320
    .line 321
    new-array v3, v6, [F

    .line 322
    .line 323
    aput v1, v3, v4

    .line 324
    .line 325
    aput v2, v3, v5

    .line 326
    .line 327
    invoke-static {v7, v3}, Landroid/animation/PropertyValuesHolder;->ofFloat(Ljava/lang/String;[F)Landroid/animation/PropertyValuesHolder;

    .line 328
    .line 329
    .line 330
    move-result-object v18

    .line 331
    iget-object v1, v0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->m:Landroid/animation/ValueAnimator;

    .line 332
    .line 333
    filled-new-array/range {v13 .. v18}, [Landroid/animation/PropertyValuesHolder;

    .line 334
    .line 335
    .line 336
    move-result-object v2

    .line 337
    invoke-virtual {v1, v2}, Landroid/animation/ValueAnimator;->setValues([Landroid/animation/PropertyValuesHolder;)V

    .line 338
    .line 339
    .line 340
    goto :goto_1

    .line 341
    :cond_8
    if-ne v1, v3, :cond_9

    .line 342
    .line 343
    iget-object v1, v0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->g:Lx2/e;

    .line 344
    .line 345
    iget v1, v1, Lx2/e;->f:F

    .line 346
    .line 347
    iget-object v2, v0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->f:Lx2/e;

    .line 348
    .line 349
    iget v2, v2, Lx2/e;->f:F

    .line 350
    .line 351
    new-array v3, v6, [F

    .line 352
    .line 353
    aput v1, v3, v4

    .line 354
    .line 355
    aput v2, v3, v5

    .line 356
    .line 357
    invoke-static {v12, v3}, Landroid/animation/PropertyValuesHolder;->ofFloat(Ljava/lang/String;[F)Landroid/animation/PropertyValuesHolder;

    .line 358
    .line 359
    .line 360
    move-result-object v13

    .line 361
    iget-object v1, v0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->g:Lx2/e;

    .line 362
    .line 363
    iget v1, v1, Lx2/e;->e:I

    .line 364
    .line 365
    iget-object v2, v0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->f:Lx2/e;

    .line 366
    .line 367
    iget v2, v2, Lx2/e;->e:I

    .line 368
    .line 369
    filled-new-array {v1, v2}, [I

    .line 370
    .line 371
    .line 372
    move-result-object v1

    .line 373
    invoke-static {v11, v1}, Landroid/animation/PropertyValuesHolder;->ofInt(Ljava/lang/String;[I)Landroid/animation/PropertyValuesHolder;

    .line 374
    .line 375
    .line 376
    move-result-object v14

    .line 377
    iget-object v1, v0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->g:Lx2/e;

    .line 378
    .line 379
    iget v1, v1, Lx2/e;->a:F

    .line 380
    .line 381
    iget-object v2, v0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->f:Lx2/e;

    .line 382
    .line 383
    iget v2, v2, Lx2/e;->a:F

    .line 384
    .line 385
    new-array v3, v6, [F

    .line 386
    .line 387
    aput v1, v3, v4

    .line 388
    .line 389
    aput v2, v3, v5

    .line 390
    .line 391
    invoke-static {v10, v3}, Landroid/animation/PropertyValuesHolder;->ofFloat(Ljava/lang/String;[F)Landroid/animation/PropertyValuesHolder;

    .line 392
    .line 393
    .line 394
    move-result-object v15

    .line 395
    iget-object v1, v0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->g:Lx2/e;

    .line 396
    .line 397
    iget v1, v1, Lx2/e;->b:F

    .line 398
    .line 399
    iget-object v2, v0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->f:Lx2/e;

    .line 400
    .line 401
    iget v2, v2, Lx2/e;->b:F

    .line 402
    .line 403
    new-array v3, v6, [F

    .line 404
    .line 405
    aput v1, v3, v4

    .line 406
    .line 407
    aput v2, v3, v5

    .line 408
    .line 409
    invoke-static {v9, v3}, Landroid/animation/PropertyValuesHolder;->ofFloat(Ljava/lang/String;[F)Landroid/animation/PropertyValuesHolder;

    .line 410
    .line 411
    .line 412
    move-result-object v16

    .line 413
    iget-object v1, v0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->g:Lx2/e;

    .line 414
    .line 415
    iget v1, v1, Lx2/e;->c:F

    .line 416
    .line 417
    iget-object v2, v0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->f:Lx2/e;

    .line 418
    .line 419
    iget v2, v2, Lx2/e;->c:F

    .line 420
    .line 421
    new-array v3, v6, [F

    .line 422
    .line 423
    aput v1, v3, v4

    .line 424
    .line 425
    aput v2, v3, v5

    .line 426
    .line 427
    invoke-static {v8, v3}, Landroid/animation/PropertyValuesHolder;->ofFloat(Ljava/lang/String;[F)Landroid/animation/PropertyValuesHolder;

    .line 428
    .line 429
    .line 430
    move-result-object v17

    .line 431
    iget-object v1, v0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->g:Lx2/e;

    .line 432
    .line 433
    iget v1, v1, Lx2/e;->d:F

    .line 434
    .line 435
    iget-object v2, v0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->f:Lx2/e;

    .line 436
    .line 437
    iget v2, v2, Lx2/e;->d:F

    .line 438
    .line 439
    new-array v3, v6, [F

    .line 440
    .line 441
    aput v1, v3, v4

    .line 442
    .line 443
    aput v2, v3, v5

    .line 444
    .line 445
    invoke-static {v7, v3}, Landroid/animation/PropertyValuesHolder;->ofFloat(Ljava/lang/String;[F)Landroid/animation/PropertyValuesHolder;

    .line 446
    .line 447
    .line 448
    move-result-object v18

    .line 449
    iget-object v1, v0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->m:Landroid/animation/ValueAnimator;

    .line 450
    .line 451
    filled-new-array/range {v13 .. v18}, [Landroid/animation/PropertyValuesHolder;

    .line 452
    .line 453
    .line 454
    move-result-object v2

    .line 455
    invoke-virtual {v1, v2}, Landroid/animation/ValueAnimator;->setValues([Landroid/animation/PropertyValuesHolder;)V

    .line 456
    .line 457
    .line 458
    :cond_9
    :goto_1
    iget-object v1, v0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->m:Landroid/animation/ValueAnimator;

    .line 459
    .line 460
    new-instance v2, Lx2/b;

    .line 461
    .line 462
    invoke-direct {v2, v0, v6}, Lx2/b;-><init>(Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;I)V

    .line 463
    .line 464
    .line 465
    invoke-virtual {v1, v2}, Landroid/animation/ValueAnimator;->addUpdateListener(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V

    .line 466
    .line 467
    .line 468
    iget-object v1, v0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->m:Landroid/animation/ValueAnimator;

    .line 469
    .line 470
    new-instance v2, Lcom/xuexiang/xui/widget/imageview/preview/view/a;

    .line 471
    .line 472
    invoke-direct {v2, v0}, Lcom/xuexiang/xui/widget/imageview/preview/view/a;-><init>(Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;)V

    .line 473
    .line 474
    .line 475
    invoke-virtual {v1, v2}, Landroid/animation/Animator;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    .line 476
    .line 477
    .line 478
    iget-object v1, v0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->m:Landroid/animation/ValueAnimator;

    .line 479
    .line 480
    invoke-virtual {v1}, Landroid/animation/ValueAnimator;->start()V

    .line 481
    .line 482
    .line 483
    :cond_a
    :goto_2
    return-void
.end method

.method public setAlphaChangeListener(Lx2/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->t:Lx2/c;

    .line 2
    .line 3
    return-void
.end method

.method public setOnTransformListener(Lcom/xuexiang/xui/widget/imageview/preview/view/b;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->w:Lcom/xuexiang/xui/widget/imageview/preview/view/b;

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

.method public setTransformOutListener(Lx2/d;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->u:Lx2/d;

    .line 2
    .line 3
    return-void
.end method
