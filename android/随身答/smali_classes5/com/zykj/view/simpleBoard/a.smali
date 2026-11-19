.class public final Lcom/zykj/view/simpleBoard/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/zykj/view/simpleBoard/a$a;,
        Lcom/zykj/view/simpleBoard/a$b;
    }
.end annotation


# static fields
.field public static final D:Lcom/zykj/view/simpleBoard/a$a;


# instance fields
.field public final A:Landroid/graphics/Paint;

.field public final B:Landroid/graphics/Paint;

.field public final C:Landroid/graphics/Paint;

.field public final a:Lh7/c;

.field public final b:Landroid/graphics/Matrix;

.field public final c:Lj7/d;

.field public d:Landroid/graphics/Bitmap;

.field public e:Landroid/graphics/RectF;

.field public f:Landroid/graphics/Matrix;

.field public final g:Ljava/util/ArrayList;

.field public final h:Ljava/util/ArrayList;

.field public final i:Landroid/graphics/RectF;

.field public final j:Landroid/graphics/PointF;

.field public final k:Landroid/graphics/PointF;

.field public final l:Landroid/graphics/PointF;

.field public m:Lcom/zykj/view/simpleBoard/SelectionTarget;

.field public n:Z

.field public o:Z

.field public p:Z

.field public q:Lh7/d;

.field public r:Lkotlin/jvm/functions/Function1;

.field public s:Landroid/graphics/Path;

.field public t:Lkotlin/jvm/functions/Function0;

.field public final u:Landroid/graphics/Path;

.field public final v:Landroid/graphics/Matrix;

.field public final w:[F

.field public final x:Landroid/graphics/Paint;

.field public final y:Landroid/graphics/Paint;

.field public final z:Landroid/graphics/Paint;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/zykj/view/simpleBoard/a$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/zykj/view/simpleBoard/a$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/zykj/view/simpleBoard/a;->D:Lcom/zykj/view/simpleBoard/a$a;

    return-void
.end method

.method public constructor <init>(Lh7/c;Landroid/graphics/Matrix;Lj7/d;)V
    .locals 12

    .line 1
    const-string v0, "mBoardConfig"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "mCameraMatrix"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "mDrawView"

    .line 12
    .line 13
    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 17
    .line 18
    .line 19
    iput-object p1, p0, Lcom/zykj/view/simpleBoard/a;->a:Lh7/c;

    .line 20
    .line 21
    iput-object p2, p0, Lcom/zykj/view/simpleBoard/a;->b:Landroid/graphics/Matrix;

    .line 22
    .line 23
    iput-object p3, p0, Lcom/zykj/view/simpleBoard/a;->c:Lj7/d;

    .line 24
    .line 25
    new-instance p1, Landroid/graphics/RectF;

    .line 26
    .line 27
    invoke-direct {p1}, Landroid/graphics/RectF;-><init>()V

    .line 28
    .line 29
    .line 30
    iput-object p1, p0, Lcom/zykj/view/simpleBoard/a;->e:Landroid/graphics/RectF;

    .line 31
    .line 32
    new-instance p1, Landroid/graphics/Matrix;

    .line 33
    .line 34
    invoke-direct {p1}, Landroid/graphics/Matrix;-><init>()V

    .line 35
    .line 36
    .line 37
    iput-object p1, p0, Lcom/zykj/view/simpleBoard/a;->f:Landroid/graphics/Matrix;

    .line 38
    .line 39
    new-instance p1, Ljava/util/ArrayList;

    .line 40
    .line 41
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 42
    .line 43
    .line 44
    iput-object p1, p0, Lcom/zykj/view/simpleBoard/a;->g:Ljava/util/ArrayList;

    .line 45
    .line 46
    new-instance p1, Ljava/util/ArrayList;

    .line 47
    .line 48
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 49
    .line 50
    .line 51
    iput-object p1, p0, Lcom/zykj/view/simpleBoard/a;->h:Ljava/util/ArrayList;

    .line 52
    .line 53
    new-instance p1, Landroid/graphics/RectF;

    .line 54
    .line 55
    invoke-direct {p1}, Landroid/graphics/RectF;-><init>()V

    .line 56
    .line 57
    .line 58
    iput-object p1, p0, Lcom/zykj/view/simpleBoard/a;->i:Landroid/graphics/RectF;

    .line 59
    .line 60
    new-instance p1, Landroid/graphics/PointF;

    .line 61
    .line 62
    invoke-direct {p1}, Landroid/graphics/PointF;-><init>()V

    .line 63
    .line 64
    .line 65
    iput-object p1, p0, Lcom/zykj/view/simpleBoard/a;->j:Landroid/graphics/PointF;

    .line 66
    .line 67
    new-instance p1, Landroid/graphics/PointF;

    .line 68
    .line 69
    invoke-direct {p1}, Landroid/graphics/PointF;-><init>()V

    .line 70
    .line 71
    .line 72
    iput-object p1, p0, Lcom/zykj/view/simpleBoard/a;->k:Landroid/graphics/PointF;

    .line 73
    .line 74
    new-instance p1, Landroid/graphics/PointF;

    .line 75
    .line 76
    invoke-direct {p1}, Landroid/graphics/PointF;-><init>()V

    .line 77
    .line 78
    .line 79
    iput-object p1, p0, Lcom/zykj/view/simpleBoard/a;->l:Landroid/graphics/PointF;

    .line 80
    .line 81
    sget-object p1, Lcom/zykj/view/simpleBoard/SelectionTarget;->c:Lcom/zykj/view/simpleBoard/SelectionTarget;

    .line 82
    .line 83
    iput-object p1, p0, Lcom/zykj/view/simpleBoard/a;->m:Lcom/zykj/view/simpleBoard/SelectionTarget;

    .line 84
    .line 85
    new-instance v0, Lh7/d;

    .line 86
    .line 87
    const/16 v10, 0x1ff

    .line 88
    .line 89
    const/4 v11, 0x0

    .line 90
    const/4 v1, 0x0

    .line 91
    const/4 v2, 0x0

    .line 92
    const/4 v3, 0x0

    .line 93
    const/4 v4, 0x0

    .line 94
    const/4 v5, 0x0

    .line 95
    const/4 v6, 0x0

    .line 96
    const/4 v7, 0x0

    .line 97
    const/4 v8, 0x0

    .line 98
    const/4 v9, 0x0

    .line 99
    invoke-direct/range {v0 .. v11}, Lh7/d;-><init>(ZZZZZZZLjava/util/List;Ljava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 100
    .line 101
    .line 102
    iput-object v0, p0, Lcom/zykj/view/simpleBoard/a;->q:Lh7/d;

    .line 103
    .line 104
    new-instance p1, Landroid/graphics/Path;

    .line 105
    .line 106
    invoke-direct {p1}, Landroid/graphics/Path;-><init>()V

    .line 107
    .line 108
    .line 109
    iput-object p1, p0, Lcom/zykj/view/simpleBoard/a;->s:Landroid/graphics/Path;

    .line 110
    .line 111
    new-instance p1, Landroid/graphics/Path;

    .line 112
    .line 113
    invoke-direct {p1}, Landroid/graphics/Path;-><init>()V

    .line 114
    .line 115
    .line 116
    iput-object p1, p0, Lcom/zykj/view/simpleBoard/a;->u:Landroid/graphics/Path;

    .line 117
    .line 118
    new-instance p1, Landroid/graphics/Matrix;

    .line 119
    .line 120
    invoke-direct {p1}, Landroid/graphics/Matrix;-><init>()V

    .line 121
    .line 122
    .line 123
    iput-object p1, p0, Lcom/zykj/view/simpleBoard/a;->v:Landroid/graphics/Matrix;

    .line 124
    .line 125
    const/16 p1, 0x9

    .line 126
    .line 127
    new-array p2, p1, [F

    .line 128
    .line 129
    const/4 p3, 0x0

    .line 130
    :goto_0
    const/4 v0, 0x0

    .line 131
    if-ge p3, p1, :cond_0

    .line 132
    .line 133
    aput v0, p2, p3

    .line 134
    .line 135
    add-int/lit8 p3, p3, 0x1

    .line 136
    .line 137
    goto :goto_0

    .line 138
    :cond_0
    iput-object p2, p0, Lcom/zykj/view/simpleBoard/a;->w:[F

    .line 139
    .line 140
    new-instance p1, Landroid/graphics/Paint;

    .line 141
    .line 142
    invoke-direct {p1}, Landroid/graphics/Paint;-><init>()V

    .line 143
    .line 144
    .line 145
    sget-object p2, Landroid/graphics/Paint$Cap;->ROUND:Landroid/graphics/Paint$Cap;

    .line 146
    .line 147
    invoke-virtual {p1, p2}, Landroid/graphics/Paint;->setStrokeCap(Landroid/graphics/Paint$Cap;)V

    .line 148
    .line 149
    .line 150
    sget-object p3, Landroid/graphics/Paint$Join;->ROUND:Landroid/graphics/Paint$Join;

    .line 151
    .line 152
    invoke-virtual {p1, p3}, Landroid/graphics/Paint;->setStrokeJoin(Landroid/graphics/Paint$Join;)V

    .line 153
    .line 154
    .line 155
    const/4 v1, 0x1

    .line 156
    invoke-virtual {p1, v1}, Landroid/graphics/Paint;->setDither(Z)V

    .line 157
    .line 158
    .line 159
    invoke-virtual {p1, v1}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 160
    .line 161
    .line 162
    new-instance v2, Landroid/graphics/PorterDuffXfermode;

    .line 163
    .line 164
    sget-object v3, Landroid/graphics/PorterDuff$Mode;->SRC_OVER:Landroid/graphics/PorterDuff$Mode;

    .line 165
    .line 166
    invoke-direct {v2, v3}, Landroid/graphics/PorterDuffXfermode;-><init>(Landroid/graphics/PorterDuff$Mode;)V

    .line 167
    .line 168
    .line 169
    invoke-virtual {p1, v2}, Landroid/graphics/Paint;->setXfermode(Landroid/graphics/Xfermode;)Landroid/graphics/Xfermode;

    .line 170
    .line 171
    .line 172
    iput-object p1, p0, Lcom/zykj/view/simpleBoard/a;->x:Landroid/graphics/Paint;

    .line 173
    .line 174
    new-instance p1, Landroid/graphics/Paint;

    .line 175
    .line 176
    invoke-direct {p1}, Landroid/graphics/Paint;-><init>()V

    .line 177
    .line 178
    .line 179
    invoke-virtual {p1, p2}, Landroid/graphics/Paint;->setStrokeCap(Landroid/graphics/Paint$Cap;)V

    .line 180
    .line 181
    .line 182
    invoke-virtual {p1, p3}, Landroid/graphics/Paint;->setStrokeJoin(Landroid/graphics/Paint$Join;)V

    .line 183
    .line 184
    .line 185
    invoke-virtual {p1, v1}, Landroid/graphics/Paint;->setDither(Z)V

    .line 186
    .line 187
    .line 188
    invoke-virtual {p1, v1}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 189
    .line 190
    .line 191
    new-instance p2, Landroid/graphics/PorterDuffXfermode;

    .line 192
    .line 193
    invoke-direct {p2, v3}, Landroid/graphics/PorterDuffXfermode;-><init>(Landroid/graphics/PorterDuff$Mode;)V

    .line 194
    .line 195
    .line 196
    invoke-virtual {p1, p2}, Landroid/graphics/Paint;->setXfermode(Landroid/graphics/Xfermode;)Landroid/graphics/Xfermode;

    .line 197
    .line 198
    .line 199
    iput-object p1, p0, Lcom/zykj/view/simpleBoard/a;->y:Landroid/graphics/Paint;

    .line 200
    .line 201
    new-instance p1, Landroid/graphics/Paint;

    .line 202
    .line 203
    invoke-direct {p1}, Landroid/graphics/Paint;-><init>()V

    .line 204
    .line 205
    .line 206
    sget-object p2, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    .line 207
    .line 208
    invoke-virtual {p1, p2}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 209
    .line 210
    .line 211
    const/high16 p3, -0x1000000

    .line 212
    .line 213
    invoke-virtual {p1, p3}, Landroid/graphics/Paint;->setColor(I)V

    .line 214
    .line 215
    .line 216
    const/high16 p3, 0x40400000    # 3.0f

    .line 217
    .line 218
    invoke-virtual {p1, p3}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 219
    .line 220
    .line 221
    new-instance v2, Landroid/graphics/DashPathEffect;

    .line 222
    .line 223
    const/4 v3, 0x2

    .line 224
    new-array v3, v3, [F

    .line 225
    .line 226
    fill-array-data v3, :array_0

    .line 227
    .line 228
    .line 229
    invoke-direct {v2, v3, v0}, Landroid/graphics/DashPathEffect;-><init>([FF)V

    .line 230
    .line 231
    .line 232
    invoke-virtual {p1, v2}, Landroid/graphics/Paint;->setPathEffect(Landroid/graphics/PathEffect;)Landroid/graphics/PathEffect;

    .line 233
    .line 234
    .line 235
    invoke-virtual {p1, v1}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 236
    .line 237
    .line 238
    iput-object p1, p0, Lcom/zykj/view/simpleBoard/a;->z:Landroid/graphics/Paint;

    .line 239
    .line 240
    new-instance p1, Landroid/graphics/Paint;

    .line 241
    .line 242
    invoke-direct {p1, v1}, Landroid/graphics/Paint;-><init>(I)V

    .line 243
    .line 244
    .line 245
    invoke-virtual {p1, p2}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 246
    .line 247
    .line 248
    const p2, -0xb8680d

    .line 249
    .line 250
    .line 251
    invoke-virtual {p1, p2}, Landroid/graphics/Paint;->setColor(I)V

    .line 252
    .line 253
    .line 254
    invoke-virtual {p1, p3}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 255
    .line 256
    .line 257
    iput-object p1, p0, Lcom/zykj/view/simpleBoard/a;->A:Landroid/graphics/Paint;

    .line 258
    .line 259
    new-instance p1, Landroid/graphics/Paint;

    .line 260
    .line 261
    invoke-direct {p1, v1}, Landroid/graphics/Paint;-><init>(I)V

    .line 262
    .line 263
    .line 264
    const/4 p2, -0x1

    .line 265
    invoke-virtual {p1, p2}, Landroid/graphics/Paint;->setColor(I)V

    .line 266
    .line 267
    .line 268
    sget-object p2, Landroid/graphics/Paint$Align;->CENTER:Landroid/graphics/Paint$Align;

    .line 269
    .line 270
    invoke-virtual {p1, p2}, Landroid/graphics/Paint;->setTextAlign(Landroid/graphics/Paint$Align;)V

    .line 271
    .line 272
    .line 273
    const/high16 p2, 0x41400000    # 12.0f

    .line 274
    .line 275
    invoke-virtual {p1, p2}, Landroid/graphics/Paint;->setTextSize(F)V

    .line 276
    .line 277
    .line 278
    iput-object p1, p0, Lcom/zykj/view/simpleBoard/a;->B:Landroid/graphics/Paint;

    .line 279
    .line 280
    new-instance p1, Landroid/graphics/Paint;

    .line 281
    .line 282
    invoke-direct {p1, v1}, Landroid/graphics/Paint;-><init>(I)V

    .line 283
    .line 284
    .line 285
    const/high16 p2, -0x41000000    # -0.5f

    .line 286
    .line 287
    invoke-virtual {p1, p2}, Landroid/graphics/Paint;->setColor(I)V

    .line 288
    .line 289
    .line 290
    iput-object p1, p0, Lcom/zykj/view/simpleBoard/a;->C:Landroid/graphics/Paint;

    .line 291
    .line 292
    return-void

    .line 293
    :array_0
    .array-data 4
        0x41f00000    # 30.0f
        0x41700000    # 15.0f
    .end array-data
.end method

.method public static synthetic y(Lcom/zykj/view/simpleBoard/a;ZILjava/lang/Object;)Landroid/graphics/RectF;
    .locals 0

    .line 1
    const/4 p3, 0x1

    .line 2
    and-int/2addr p2, p3

    .line 3
    if-eqz p2, :cond_0

    .line 4
    .line 5
    move p1, p3

    .line 6
    :cond_0
    invoke-virtual {p0, p1}, Lcom/zykj/view/simpleBoard/a;->x(Z)Landroid/graphics/RectF;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    return-object p0
.end method


# virtual methods
.method public final A(Landroid/graphics/Matrix;)V
    .locals 13

    .line 1
    const-string v0, "matrix"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/zykj/view/simpleBoard/a;->c:Lj7/d;

    .line 7
    .line 8
    const-string v1, "null cannot be cast to non-null type android.view.View"

    .line 9
    .line 10
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    check-cast v0, Landroid/view/View;

    .line 14
    .line 15
    invoke-virtual {p1}, Landroid/graphics/Matrix;->toShortString()Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    new-instance v1, Ljava/lang/StringBuilder;

    .line 20
    .line 21
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 22
    .line 23
    .line 24
    const-string v2, "before -> "

    .line 25
    .line 26
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 27
    .line 28
    .line 29
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 30
    .line 31
    .line 32
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    const-string v1, "DrawControl"

    .line 37
    .line 38
    invoke-static {v1, v0}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 39
    .line 40
    .line 41
    iget-object v0, p0, Lcom/zykj/view/simpleBoard/a;->w:[F

    .line 42
    .line 43
    invoke-virtual {p1, v0}, Landroid/graphics/Matrix;->getValues([F)V

    .line 44
    .line 45
    .line 46
    iget-object v0, p0, Lcom/zykj/view/simpleBoard/a;->w:[F

    .line 47
    .line 48
    const/4 v2, 0x0

    .line 49
    aget v3, v0, v2

    .line 50
    .line 51
    const/4 v4, 0x4

    .line 52
    aget v5, v0, v4

    .line 53
    .line 54
    const/4 v6, 0x2

    .line 55
    aget v7, v0, v6

    .line 56
    .line 57
    const/4 v8, 0x5

    .line 58
    aget v0, v0, v8

    .line 59
    .line 60
    iget-object v9, p0, Lcom/zykj/view/simpleBoard/a;->a:Lh7/c;

    .line 61
    .line 62
    invoke-virtual {v9}, Lh7/c;->e()F

    .line 63
    .line 64
    .line 65
    move-result v9

    .line 66
    const/high16 v10, 0x3f800000    # 1.0f

    .line 67
    .line 68
    cmpl-float v9, v9, v10

    .line 69
    .line 70
    if-lez v9, :cond_0

    .line 71
    .line 72
    iget-object v9, p0, Lcom/zykj/view/simpleBoard/a;->a:Lh7/c;

    .line 73
    .line 74
    invoke-virtual {v9}, Lh7/c;->e()F

    .line 75
    .line 76
    .line 77
    move-result v9

    .line 78
    goto :goto_0

    .line 79
    :cond_0
    move v9, v10

    .line 80
    :goto_0
    cmpg-float v11, v3, v10

    .line 81
    .line 82
    if-gez v11, :cond_1

    .line 83
    .line 84
    iget-object v11, p0, Lcom/zykj/view/simpleBoard/a;->w:[F

    .line 85
    .line 86
    aput v10, v11, v2

    .line 87
    .line 88
    goto :goto_1

    .line 89
    :cond_1
    cmpl-float v11, v3, v9

    .line 90
    .line 91
    if-lez v11, :cond_2

    .line 92
    .line 93
    iget-object v11, p0, Lcom/zykj/view/simpleBoard/a;->w:[F

    .line 94
    .line 95
    aput v9, v11, v2

    .line 96
    .line 97
    :cond_2
    :goto_1
    cmpg-float v11, v5, v10

    .line 98
    .line 99
    if-gez v11, :cond_3

    .line 100
    .line 101
    iget-object v9, p0, Lcom/zykj/view/simpleBoard/a;->w:[F

    .line 102
    .line 103
    aput v10, v9, v4

    .line 104
    .line 105
    goto :goto_2

    .line 106
    :cond_3
    cmpl-float v10, v3, v9

    .line 107
    .line 108
    if-lez v10, :cond_4

    .line 109
    .line 110
    iget-object v10, p0, Lcom/zykj/view/simpleBoard/a;->w:[F

    .line 111
    .line 112
    aput v9, v10, v4

    .line 113
    .line 114
    :cond_4
    :goto_2
    const/4 v9, 0x0

    .line 115
    cmpl-float v10, v7, v9

    .line 116
    .line 117
    const/4 v11, 0x1

    .line 118
    if-lez v10, :cond_5

    .line 119
    .line 120
    iget-object v2, p0, Lcom/zykj/view/simpleBoard/a;->w:[F

    .line 121
    .line 122
    aput v9, v2, v6

    .line 123
    .line 124
    goto/16 :goto_3

    .line 125
    .line 126
    :cond_5
    iget-object v10, p0, Lcom/zykj/view/simpleBoard/a;->e:Landroid/graphics/RectF;

    .line 127
    .line 128
    invoke-virtual {v10}, Landroid/graphics/RectF;->width()F

    .line 129
    .line 130
    .line 131
    move-result v10

    .line 132
    mul-float/2addr v10, v3

    .line 133
    iget-object v12, p0, Lcom/zykj/view/simpleBoard/a;->c:Lj7/d;

    .line 134
    .line 135
    check-cast v12, Landroid/view/View;

    .line 136
    .line 137
    invoke-virtual {v12}, Landroid/view/View;->getWidth()I

    .line 138
    .line 139
    .line 140
    move-result v12

    .line 141
    int-to-float v12, v12

    .line 142
    sub-float/2addr v10, v12

    .line 143
    neg-float v10, v10

    .line 144
    cmpg-float v10, v7, v10

    .line 145
    .line 146
    if-gez v10, :cond_6

    .line 147
    .line 148
    iget-object v3, p0, Lcom/zykj/view/simpleBoard/a;->w:[F

    .line 149
    .line 150
    iget-object v7, p0, Lcom/zykj/view/simpleBoard/a;->e:Landroid/graphics/RectF;

    .line 151
    .line 152
    invoke-virtual {v7}, Landroid/graphics/RectF;->width()F

    .line 153
    .line 154
    .line 155
    move-result v7

    .line 156
    iget-object v10, p0, Lcom/zykj/view/simpleBoard/a;->w:[F

    .line 157
    .line 158
    aget v2, v10, v2

    .line 159
    .line 160
    mul-float/2addr v7, v2

    .line 161
    iget-object v2, p0, Lcom/zykj/view/simpleBoard/a;->c:Lj7/d;

    .line 162
    .line 163
    check-cast v2, Landroid/view/View;

    .line 164
    .line 165
    invoke-virtual {v2}, Landroid/view/View;->getWidth()I

    .line 166
    .line 167
    .line 168
    move-result v2

    .line 169
    int-to-float v2, v2

    .line 170
    sub-float/2addr v7, v2

    .line 171
    neg-float v2, v7

    .line 172
    aput v2, v3, v6

    .line 173
    .line 174
    goto :goto_3

    .line 175
    :cond_6
    iget-object v10, p0, Lcom/zykj/view/simpleBoard/a;->e:Landroid/graphics/RectF;

    .line 176
    .line 177
    invoke-virtual {v10}, Landroid/graphics/RectF;->width()F

    .line 178
    .line 179
    .line 180
    move-result v10

    .line 181
    mul-float/2addr v10, v3

    .line 182
    iget-object v12, p0, Lcom/zykj/view/simpleBoard/a;->c:Lj7/d;

    .line 183
    .line 184
    check-cast v12, Landroid/view/View;

    .line 185
    .line 186
    invoke-virtual {v12}, Landroid/view/View;->getWidth()I

    .line 187
    .line 188
    .line 189
    move-result v12

    .line 190
    int-to-float v12, v12

    .line 191
    cmpg-float v10, v10, v12

    .line 192
    .line 193
    if-nez v10, :cond_7

    .line 194
    .line 195
    iget-object v2, p0, Lcom/zykj/view/simpleBoard/a;->w:[F

    .line 196
    .line 197
    aput v9, v2, v6

    .line 198
    .line 199
    goto :goto_3

    .line 200
    :cond_7
    int-to-float v10, v11

    .line 201
    iget-object v12, p0, Lcom/zykj/view/simpleBoard/a;->e:Landroid/graphics/RectF;

    .line 202
    .line 203
    invoke-virtual {v12}, Landroid/graphics/RectF;->width()F

    .line 204
    .line 205
    .line 206
    move-result v12

    .line 207
    mul-float/2addr v12, v3

    .line 208
    iget-object v3, p0, Lcom/zykj/view/simpleBoard/a;->c:Lj7/d;

    .line 209
    .line 210
    check-cast v3, Landroid/view/View;

    .line 211
    .line 212
    invoke-virtual {v3}, Landroid/view/View;->getWidth()I

    .line 213
    .line 214
    .line 215
    move-result v3

    .line 216
    int-to-float v3, v3

    .line 217
    sub-float/2addr v12, v3

    .line 218
    div-float/2addr v7, v12

    .line 219
    add-float/2addr v7, v10

    .line 220
    iget-object v3, p0, Lcom/zykj/view/simpleBoard/a;->w:[F

    .line 221
    .line 222
    sub-float/2addr v7, v10

    .line 223
    iget-object v10, p0, Lcom/zykj/view/simpleBoard/a;->e:Landroid/graphics/RectF;

    .line 224
    .line 225
    invoke-virtual {v10}, Landroid/graphics/RectF;->width()F

    .line 226
    .line 227
    .line 228
    move-result v10

    .line 229
    iget-object v12, p0, Lcom/zykj/view/simpleBoard/a;->w:[F

    .line 230
    .line 231
    aget v2, v12, v2

    .line 232
    .line 233
    mul-float/2addr v10, v2

    .line 234
    iget-object v2, p0, Lcom/zykj/view/simpleBoard/a;->c:Lj7/d;

    .line 235
    .line 236
    check-cast v2, Landroid/view/View;

    .line 237
    .line 238
    invoke-virtual {v2}, Landroid/view/View;->getWidth()I

    .line 239
    .line 240
    .line 241
    move-result v2

    .line 242
    int-to-float v2, v2

    .line 243
    sub-float/2addr v10, v2

    .line 244
    mul-float/2addr v7, v10

    .line 245
    aput v7, v3, v6

    .line 246
    .line 247
    :goto_3
    cmpl-float v2, v0, v9

    .line 248
    .line 249
    if-lez v2, :cond_8

    .line 250
    .line 251
    iget-object v0, p0, Lcom/zykj/view/simpleBoard/a;->w:[F

    .line 252
    .line 253
    aput v9, v0, v8

    .line 254
    .line 255
    goto/16 :goto_4

    .line 256
    .line 257
    :cond_8
    iget-object v2, p0, Lcom/zykj/view/simpleBoard/a;->e:Landroid/graphics/RectF;

    .line 258
    .line 259
    invoke-virtual {v2}, Landroid/graphics/RectF;->height()F

    .line 260
    .line 261
    .line 262
    move-result v2

    .line 263
    mul-float/2addr v2, v5

    .line 264
    iget-object v3, p0, Lcom/zykj/view/simpleBoard/a;->c:Lj7/d;

    .line 265
    .line 266
    check-cast v3, Landroid/view/View;

    .line 267
    .line 268
    invoke-virtual {v3}, Landroid/view/View;->getHeight()I

    .line 269
    .line 270
    .line 271
    move-result v3

    .line 272
    int-to-float v3, v3

    .line 273
    sub-float/2addr v2, v3

    .line 274
    neg-float v2, v2

    .line 275
    cmpg-float v2, v0, v2

    .line 276
    .line 277
    if-gez v2, :cond_9

    .line 278
    .line 279
    iget-object v0, p0, Lcom/zykj/view/simpleBoard/a;->w:[F

    .line 280
    .line 281
    iget-object v2, p0, Lcom/zykj/view/simpleBoard/a;->e:Landroid/graphics/RectF;

    .line 282
    .line 283
    invoke-virtual {v2}, Landroid/graphics/RectF;->height()F

    .line 284
    .line 285
    .line 286
    move-result v2

    .line 287
    iget-object v3, p0, Lcom/zykj/view/simpleBoard/a;->w:[F

    .line 288
    .line 289
    aget v3, v3, v4

    .line 290
    .line 291
    mul-float/2addr v2, v3

    .line 292
    iget-object v3, p0, Lcom/zykj/view/simpleBoard/a;->c:Lj7/d;

    .line 293
    .line 294
    check-cast v3, Landroid/view/View;

    .line 295
    .line 296
    invoke-virtual {v3}, Landroid/view/View;->getHeight()I

    .line 297
    .line 298
    .line 299
    move-result v3

    .line 300
    int-to-float v3, v3

    .line 301
    sub-float/2addr v2, v3

    .line 302
    neg-float v2, v2

    .line 303
    aput v2, v0, v8

    .line 304
    .line 305
    goto :goto_4

    .line 306
    :cond_9
    iget-object v2, p0, Lcom/zykj/view/simpleBoard/a;->e:Landroid/graphics/RectF;

    .line 307
    .line 308
    invoke-virtual {v2}, Landroid/graphics/RectF;->height()F

    .line 309
    .line 310
    .line 311
    move-result v2

    .line 312
    mul-float/2addr v2, v5

    .line 313
    iget-object v3, p0, Lcom/zykj/view/simpleBoard/a;->c:Lj7/d;

    .line 314
    .line 315
    check-cast v3, Landroid/view/View;

    .line 316
    .line 317
    invoke-virtual {v3}, Landroid/view/View;->getHeight()I

    .line 318
    .line 319
    .line 320
    move-result v3

    .line 321
    int-to-float v3, v3

    .line 322
    cmpg-float v2, v2, v3

    .line 323
    .line 324
    if-nez v2, :cond_a

    .line 325
    .line 326
    iget-object v0, p0, Lcom/zykj/view/simpleBoard/a;->w:[F

    .line 327
    .line 328
    aput v9, v0, v8

    .line 329
    .line 330
    goto :goto_4

    .line 331
    :cond_a
    int-to-float v2, v11

    .line 332
    iget-object v3, p0, Lcom/zykj/view/simpleBoard/a;->e:Landroid/graphics/RectF;

    .line 333
    .line 334
    invoke-virtual {v3}, Landroid/graphics/RectF;->height()F

    .line 335
    .line 336
    .line 337
    move-result v3

    .line 338
    mul-float/2addr v3, v5

    .line 339
    iget-object v5, p0, Lcom/zykj/view/simpleBoard/a;->c:Lj7/d;

    .line 340
    .line 341
    check-cast v5, Landroid/view/View;

    .line 342
    .line 343
    invoke-virtual {v5}, Landroid/view/View;->getHeight()I

    .line 344
    .line 345
    .line 346
    move-result v5

    .line 347
    int-to-float v5, v5

    .line 348
    sub-float/2addr v3, v5

    .line 349
    div-float/2addr v0, v3

    .line 350
    add-float/2addr v0, v2

    .line 351
    iget-object v3, p0, Lcom/zykj/view/simpleBoard/a;->w:[F

    .line 352
    .line 353
    sub-float/2addr v0, v2

    .line 354
    iget-object v2, p0, Lcom/zykj/view/simpleBoard/a;->e:Landroid/graphics/RectF;

    .line 355
    .line 356
    invoke-virtual {v2}, Landroid/graphics/RectF;->height()F

    .line 357
    .line 358
    .line 359
    move-result v2

    .line 360
    iget-object v5, p0, Lcom/zykj/view/simpleBoard/a;->w:[F

    .line 361
    .line 362
    aget v4, v5, v4

    .line 363
    .line 364
    mul-float/2addr v2, v4

    .line 365
    iget-object v4, p0, Lcom/zykj/view/simpleBoard/a;->c:Lj7/d;

    .line 366
    .line 367
    check-cast v4, Landroid/view/View;

    .line 368
    .line 369
    invoke-virtual {v4}, Landroid/view/View;->getHeight()I

    .line 370
    .line 371
    .line 372
    move-result v4

    .line 373
    int-to-float v4, v4

    .line 374
    sub-float/2addr v2, v4

    .line 375
    mul-float/2addr v0, v2

    .line 376
    aput v0, v3, v8

    .line 377
    .line 378
    :goto_4
    iget-object v0, p0, Lcom/zykj/view/simpleBoard/a;->w:[F

    .line 379
    .line 380
    invoke-virtual {p1, v0}, Landroid/graphics/Matrix;->setValues([F)V

    .line 381
    .line 382
    .line 383
    invoke-virtual {p1}, Landroid/graphics/Matrix;->toShortString()Ljava/lang/String;

    .line 384
    .line 385
    .line 386
    move-result-object v0

    .line 387
    new-instance v2, Ljava/lang/StringBuilder;

    .line 388
    .line 389
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 390
    .line 391
    .line 392
    const-string v3, "after -> "

    .line 393
    .line 394
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 395
    .line 396
    .line 397
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 398
    .line 399
    .line 400
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 401
    .line 402
    .line 403
    move-result-object v0

    .line 404
    invoke-static {v1, v0}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 405
    .line 406
    .line 407
    iget-object v0, p0, Lcom/zykj/view/simpleBoard/a;->b:Landroid/graphics/Matrix;

    .line 408
    .line 409
    invoke-virtual {v0, p1}, Landroid/graphics/Matrix;->set(Landroid/graphics/Matrix;)V

    .line 410
    .line 411
    .line 412
    iget-object p1, p0, Lcom/zykj/view/simpleBoard/a;->c:Lj7/d;

    .line 413
    .line 414
    invoke-interface {p1}, Lj7/d;->a()V

    .line 415
    .line 416
    .line 417
    iget-object p1, p0, Lcom/zykj/view/simpleBoard/a;->c:Lj7/d;

    .line 418
    .line 419
    invoke-interface {p1}, Lj7/d;->c()V

    .line 420
    .line 421
    .line 422
    iget-object p1, p0, Lcom/zykj/view/simpleBoard/a;->c:Lj7/d;

    .line 423
    .line 424
    invoke-interface {p1}, Lj7/d;->b()V

    .line 425
    .line 426
    .line 427
    return-void
.end method

.method public final B(Landroid/graphics/PointF;)V
    .locals 6

    .line 1
    const-string v0, "currentPointF"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/zykj/view/simpleBoard/a;->b:Landroid/graphics/Matrix;

    .line 7
    .line 8
    invoke-static {v0, p1}, Lcom/zykj/sketch/core/graph/GraphExtKt;->mapPoint(Landroid/graphics/Matrix;Landroid/graphics/PointF;)Landroid/graphics/PointF;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    iget-object v1, p0, Lcom/zykj/view/simpleBoard/a;->s:Landroid/graphics/Path;

    .line 13
    .line 14
    invoke-virtual {v1}, Landroid/graphics/Path;->reset()V

    .line 15
    .line 16
    .line 17
    iget-object v1, p0, Lcom/zykj/view/simpleBoard/a;->s:Landroid/graphics/Path;

    .line 18
    .line 19
    iget v2, v0, Landroid/graphics/PointF;->x:F

    .line 20
    .line 21
    iget v0, v0, Landroid/graphics/PointF;->y:F

    .line 22
    .line 23
    iget-object v3, p0, Lcom/zykj/view/simpleBoard/a;->a:Lh7/c;

    .line 24
    .line 25
    invoke-virtual {v3}, Lh7/c;->d()F

    .line 26
    .line 27
    .line 28
    move-result v3

    .line 29
    sget-object v4, Landroid/graphics/Path$Direction;->CW:Landroid/graphics/Path$Direction;

    .line 30
    .line 31
    invoke-virtual {v1, v2, v0, v3, v4}, Landroid/graphics/Path;->addCircle(FFFLandroid/graphics/Path$Direction;)V

    .line 32
    .line 33
    .line 34
    iget-object v0, p0, Lcom/zykj/view/simpleBoard/a;->y:Landroid/graphics/Paint;

    .line 35
    .line 36
    invoke-virtual {p0, v0}, Lcom/zykj/view/simpleBoard/a;->L(Landroid/graphics/Paint;)V

    .line 37
    .line 38
    .line 39
    iget-object v0, p0, Lcom/zykj/view/simpleBoard/a;->g:Ljava/util/ArrayList;

    .line 40
    .line 41
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    const-string v1, "iterator(...)"

    .line 46
    .line 47
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 48
    .line 49
    .line 50
    const/4 v1, 0x0

    .line 51
    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 52
    .line 53
    .line 54
    move-result v2

    .line 55
    if-eqz v2, :cond_1

    .line 56
    .line 57
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    move-result-object v2

    .line 61
    const-string v3, "next(...)"

    .line 62
    .line 63
    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 64
    .line 65
    .line 66
    check-cast v2, Li7/k;

    .line 67
    .line 68
    invoke-virtual {v2}, Li7/k;->d()Landroid/graphics/RectF;

    .line 69
    .line 70
    .line 71
    move-result-object v3

    .line 72
    iget v4, p1, Landroid/graphics/PointF;->x:F

    .line 73
    .line 74
    iget v5, p1, Landroid/graphics/PointF;->y:F

    .line 75
    .line 76
    invoke-virtual {v3, v4, v5}, Landroid/graphics/RectF;->contains(FF)Z

    .line 77
    .line 78
    .line 79
    move-result v3

    .line 80
    if-eqz v3, :cond_0

    .line 81
    .line 82
    invoke-virtual {v2}, Li7/k;->c()Ljava/util/List;

    .line 83
    .line 84
    .line 85
    move-result-object v2

    .line 86
    iget-object v3, p0, Lcom/zykj/view/simpleBoard/a;->b:Landroid/graphics/Matrix;

    .line 87
    .line 88
    invoke-static {v3}, Lu5/n;->b(Landroid/graphics/Matrix;)Landroid/graphics/Matrix;

    .line 89
    .line 90
    .line 91
    move-result-object v3

    .line 92
    iget-object v4, p0, Lcom/zykj/view/simpleBoard/a;->a:Lh7/c;

    .line 93
    .line 94
    invoke-virtual {v4}, Lh7/c;->d()F

    .line 95
    .line 96
    .line 97
    move-result v4

    .line 98
    invoke-virtual {v3, v4}, Landroid/graphics/Matrix;->mapRadius(F)F

    .line 99
    .line 100
    .line 101
    move-result v3

    .line 102
    invoke-virtual {p0, p1, v2, v3}, Lcom/zykj/view/simpleBoard/a;->e(Landroid/graphics/PointF;Ljava/util/List;F)Z

    .line 103
    .line 104
    .line 105
    move-result v2

    .line 106
    if-eqz v2, :cond_0

    .line 107
    .line 108
    invoke-interface {v0}, Ljava/util/Iterator;->remove()V

    .line 109
    .line 110
    .line 111
    const/4 v1, 0x1

    .line 112
    goto :goto_0

    .line 113
    :cond_1
    if-eqz v1, :cond_2

    .line 114
    .line 115
    iget-object p1, p0, Lcom/zykj/view/simpleBoard/a;->t:Lkotlin/jvm/functions/Function0;

    .line 116
    .line 117
    if-eqz p1, :cond_2

    .line 118
    .line 119
    invoke-interface {p1}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    .line 120
    .line 121
    .line 122
    :cond_2
    iget-object p1, p0, Lcom/zykj/view/simpleBoard/a;->c:Lj7/d;

    .line 123
    .line 124
    invoke-interface {p1}, Lj7/d;->c()V

    .line 125
    .line 126
    .line 127
    iget-object p1, p0, Lcom/zykj/view/simpleBoard/a;->c:Lj7/d;

    .line 128
    .line 129
    invoke-interface {p1}, Lj7/d;->b()V

    .line 130
    .line 131
    .line 132
    return-void
.end method

.method public final C(Landroid/graphics/PointF;)V
    .locals 6

    .line 1
    const-string v0, "currentPointF"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/zykj/view/simpleBoard/a;->s:Landroid/graphics/Path;

    .line 7
    .line 8
    invoke-virtual {v0}, Landroid/graphics/Path;->reset()V

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, Lcom/zykj/view/simpleBoard/a;->g:Ljava/util/ArrayList;

    .line 12
    .line 13
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    const-string v1, "iterator(...)"

    .line 18
    .line 19
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    const/4 v1, 0x0

    .line 23
    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 24
    .line 25
    .line 26
    move-result v2

    .line 27
    if-eqz v2, :cond_1

    .line 28
    .line 29
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object v2

    .line 33
    const-string v3, "next(...)"

    .line 34
    .line 35
    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 36
    .line 37
    .line 38
    check-cast v2, Li7/k;

    .line 39
    .line 40
    invoke-virtual {v2}, Li7/k;->d()Landroid/graphics/RectF;

    .line 41
    .line 42
    .line 43
    move-result-object v3

    .line 44
    iget v4, p1, Landroid/graphics/PointF;->x:F

    .line 45
    .line 46
    iget v5, p1, Landroid/graphics/PointF;->y:F

    .line 47
    .line 48
    invoke-virtual {v3, v4, v5}, Landroid/graphics/RectF;->contains(FF)Z

    .line 49
    .line 50
    .line 51
    move-result v3

    .line 52
    if-eqz v3, :cond_0

    .line 53
    .line 54
    invoke-virtual {v2}, Li7/k;->c()Ljava/util/List;

    .line 55
    .line 56
    .line 57
    move-result-object v2

    .line 58
    iget-object v3, p0, Lcom/zykj/view/simpleBoard/a;->b:Landroid/graphics/Matrix;

    .line 59
    .line 60
    invoke-static {v3}, Lu5/n;->b(Landroid/graphics/Matrix;)Landroid/graphics/Matrix;

    .line 61
    .line 62
    .line 63
    move-result-object v3

    .line 64
    iget-object v4, p0, Lcom/zykj/view/simpleBoard/a;->a:Lh7/c;

    .line 65
    .line 66
    invoke-virtual {v4}, Lh7/c;->d()F

    .line 67
    .line 68
    .line 69
    move-result v4

    .line 70
    invoke-virtual {v3, v4}, Landroid/graphics/Matrix;->mapRadius(F)F

    .line 71
    .line 72
    .line 73
    move-result v3

    .line 74
    invoke-virtual {p0, p1, v2, v3}, Lcom/zykj/view/simpleBoard/a;->e(Landroid/graphics/PointF;Ljava/util/List;F)Z

    .line 75
    .line 76
    .line 77
    move-result v2

    .line 78
    if-eqz v2, :cond_0

    .line 79
    .line 80
    invoke-interface {v0}, Ljava/util/Iterator;->remove()V

    .line 81
    .line 82
    .line 83
    const/4 v1, 0x1

    .line 84
    goto :goto_0

    .line 85
    :cond_1
    if-eqz v1, :cond_2

    .line 86
    .line 87
    iget-object p1, p0, Lcom/zykj/view/simpleBoard/a;->t:Lkotlin/jvm/functions/Function0;

    .line 88
    .line 89
    if-eqz p1, :cond_2

    .line 90
    .line 91
    invoke-interface {p1}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    .line 92
    .line 93
    .line 94
    :cond_2
    iget-object p1, p0, Lcom/zykj/view/simpleBoard/a;->c:Lj7/d;

    .line 95
    .line 96
    invoke-interface {p1}, Lj7/d;->c()V

    .line 97
    .line 98
    .line 99
    iget-object p1, p0, Lcom/zykj/view/simpleBoard/a;->c:Lj7/d;

    .line 100
    .line 101
    invoke-interface {p1}, Lj7/d;->b()V

    .line 102
    .line 103
    .line 104
    return-void
.end method

.method public final D()V
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/zykj/view/simpleBoard/a;->n:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, Lcom/zykj/view/simpleBoard/a;->t:Lkotlin/jvm/functions/Function0;

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    invoke-interface {v0}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    :cond_0
    sget-object v0, Lcom/zykj/view/simpleBoard/SelectionTarget;->c:Lcom/zykj/view/simpleBoard/SelectionTarget;

    .line 13
    .line 14
    iput-object v0, p0, Lcom/zykj/view/simpleBoard/a;->m:Lcom/zykj/view/simpleBoard/SelectionTarget;

    .line 15
    .line 16
    const/4 v0, 0x0

    .line 17
    iput-boolean v0, p0, Lcom/zykj/view/simpleBoard/a;->n:Z

    .line 18
    .line 19
    iput-boolean v0, p0, Lcom/zykj/view/simpleBoard/a;->o:Z

    .line 20
    .line 21
    iget-object v0, p0, Lcom/zykj/view/simpleBoard/a;->i:Landroid/graphics/RectF;

    .line 22
    .line 23
    invoke-virtual {v0}, Landroid/graphics/RectF;->setEmpty()V

    .line 24
    .line 25
    .line 26
    invoke-virtual {p0}, Lcom/zykj/view/simpleBoard/a;->Q()V

    .line 27
    .line 28
    .line 29
    iget-object v0, p0, Lcom/zykj/view/simpleBoard/a;->c:Lj7/d;

    .line 30
    .line 31
    invoke-interface {v0}, Lj7/d;->c()V

    .line 32
    .line 33
    .line 34
    iget-object v0, p0, Lcom/zykj/view/simpleBoard/a;->c:Lj7/d;

    .line 35
    .line 36
    invoke-interface {v0}, Lj7/d;->b()V

    .line 37
    .line 38
    .line 39
    return-void
.end method

.method public final E(Landroid/graphics/PointF;Landroid/graphics/PointF;)V
    .locals 2

    .line 1
    const-string v0, "point"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "displayPoint"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, Lcom/zykj/view/simpleBoard/a;->j:Landroid/graphics/PointF;

    .line 12
    .line 13
    invoke-virtual {v0, p1}, Landroid/graphics/PointF;->set(Landroid/graphics/PointF;)V

    .line 14
    .line 15
    .line 16
    iget-object v0, p0, Lcom/zykj/view/simpleBoard/a;->k:Landroid/graphics/PointF;

    .line 17
    .line 18
    invoke-virtual {v0, p1}, Landroid/graphics/PointF;->set(Landroid/graphics/PointF;)V

    .line 19
    .line 20
    .line 21
    const/4 v0, 0x0

    .line 22
    iput-boolean v0, p0, Lcom/zykj/view/simpleBoard/a;->n:Z

    .line 23
    .line 24
    iput-boolean v0, p0, Lcom/zykj/view/simpleBoard/a;->o:Z

    .line 25
    .line 26
    invoke-virtual {p0, p2}, Lcom/zykj/view/simpleBoard/a;->v(Landroid/graphics/PointF;)Lcom/zykj/view/simpleBoard/SelectionTarget;

    .line 27
    .line 28
    .line 29
    move-result-object p2

    .line 30
    iput-object p2, p0, Lcom/zykj/view/simpleBoard/a;->m:Lcom/zykj/view/simpleBoard/SelectionTarget;

    .line 31
    .line 32
    invoke-virtual {p0, p2}, Lcom/zykj/view/simpleBoard/a;->H(Lcom/zykj/view/simpleBoard/SelectionTarget;)Z

    .line 33
    .line 34
    .line 35
    move-result p2

    .line 36
    if-eqz p2, :cond_0

    .line 37
    .line 38
    const/4 p1, 0x1

    .line 39
    iput-boolean p1, p0, Lcom/zykj/view/simpleBoard/a;->o:Z

    .line 40
    .line 41
    return-void

    .line 42
    :cond_0
    iget-object p2, p0, Lcom/zykj/view/simpleBoard/a;->m:Lcom/zykj/view/simpleBoard/SelectionTarget;

    .line 43
    .line 44
    sget-object v1, Lcom/zykj/view/simpleBoard/SelectionTarget;->c:Lcom/zykj/view/simpleBoard/SelectionTarget;

    .line 45
    .line 46
    if-eq p2, v1, :cond_1

    .line 47
    .line 48
    invoke-virtual {p0, p2}, Lcom/zykj/view/simpleBoard/a;->R(Lcom/zykj/view/simpleBoard/SelectionTarget;)V

    .line 49
    .line 50
    .line 51
    iput-boolean v0, p0, Lcom/zykj/view/simpleBoard/a;->p:Z

    .line 52
    .line 53
    return-void

    .line 54
    :cond_1
    invoke-virtual {p0, p1}, Lcom/zykj/view/simpleBoard/a;->u(Landroid/graphics/PointF;)Li7/k;

    .line 55
    .line 56
    .line 57
    move-result-object p2

    .line 58
    if-eqz p2, :cond_4

    .line 59
    .line 60
    iget-object p1, p0, Lcom/zykj/view/simpleBoard/a;->h:Ljava/util/ArrayList;

    .line 61
    .line 62
    invoke-virtual {p1, p2}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    .line 63
    .line 64
    .line 65
    move-result p1

    .line 66
    if-nez p1, :cond_2

    .line 67
    .line 68
    iget-object p1, p0, Lcom/zykj/view/simpleBoard/a;->h:Ljava/util/ArrayList;

    .line 69
    .line 70
    invoke-virtual {p1}, Ljava/util/ArrayList;->clear()V

    .line 71
    .line 72
    .line 73
    iget-object p1, p0, Lcom/zykj/view/simpleBoard/a;->h:Ljava/util/ArrayList;

    .line 74
    .line 75
    invoke-virtual {p1, p2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 76
    .line 77
    .line 78
    :cond_2
    iget-object p1, p0, Lcom/zykj/view/simpleBoard/a;->q:Lh7/d;

    .line 79
    .line 80
    invoke-virtual {p1}, Lh7/d;->d()Z

    .line 81
    .line 82
    .line 83
    move-result p1

    .line 84
    if-eqz p1, :cond_3

    .line 85
    .line 86
    sget-object v1, Lcom/zykj/view/simpleBoard/SelectionTarget;->d:Lcom/zykj/view/simpleBoard/SelectionTarget;

    .line 87
    .line 88
    :cond_3
    iput-object v1, p0, Lcom/zykj/view/simpleBoard/a;->m:Lcom/zykj/view/simpleBoard/SelectionTarget;

    .line 89
    .line 90
    iget-object p1, p0, Lcom/zykj/view/simpleBoard/a;->i:Landroid/graphics/RectF;

    .line 91
    .line 92
    invoke-virtual {p1}, Landroid/graphics/RectF;->setEmpty()V

    .line 93
    .line 94
    .line 95
    invoke-virtual {p0}, Lcom/zykj/view/simpleBoard/a;->Q()V

    .line 96
    .line 97
    .line 98
    goto :goto_0

    .line 99
    :cond_4
    iget-object p2, p0, Lcom/zykj/view/simpleBoard/a;->h:Ljava/util/ArrayList;

    .line 100
    .line 101
    invoke-virtual {p2}, Ljava/util/ArrayList;->clear()V

    .line 102
    .line 103
    .line 104
    iput-boolean v0, p0, Lcom/zykj/view/simpleBoard/a;->p:Z

    .line 105
    .line 106
    iget-object p2, p0, Lcom/zykj/view/simpleBoard/a;->i:Landroid/graphics/RectF;

    .line 107
    .line 108
    iget v0, p1, Landroid/graphics/PointF;->x:F

    .line 109
    .line 110
    iget p1, p1, Landroid/graphics/PointF;->y:F

    .line 111
    .line 112
    invoke-virtual {p2, v0, p1, v0, p1}, Landroid/graphics/RectF;->set(FFFF)V

    .line 113
    .line 114
    .line 115
    invoke-virtual {p0}, Lcom/zykj/view/simpleBoard/a;->Q()V

    .line 116
    .line 117
    .line 118
    :goto_0
    iget-object p1, p0, Lcom/zykj/view/simpleBoard/a;->c:Lj7/d;

    .line 119
    .line 120
    invoke-interface {p1}, Lj7/d;->b()V

    .line 121
    .line 122
    .line 123
    return-void
.end method

.method public final F(Landroid/graphics/PointF;)V
    .locals 8

    .line 1
    const-string v0, "point"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-boolean v0, p0, Lcom/zykj/view/simpleBoard/a;->o:Z

    .line 7
    .line 8
    const/4 v1, 0x0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    sget-object p1, Lcom/zykj/view/simpleBoard/SelectionTarget;->c:Lcom/zykj/view/simpleBoard/SelectionTarget;

    .line 12
    .line 13
    iput-object p1, p0, Lcom/zykj/view/simpleBoard/a;->m:Lcom/zykj/view/simpleBoard/SelectionTarget;

    .line 14
    .line 15
    iput-boolean v1, p0, Lcom/zykj/view/simpleBoard/a;->o:Z

    .line 16
    .line 17
    iput-boolean v1, p0, Lcom/zykj/view/simpleBoard/a;->n:Z

    .line 18
    .line 19
    iget-object p1, p0, Lcom/zykj/view/simpleBoard/a;->i:Landroid/graphics/RectF;

    .line 20
    .line 21
    invoke-virtual {p1}, Landroid/graphics/RectF;->setEmpty()V

    .line 22
    .line 23
    .line 24
    iget-object p1, p0, Lcom/zykj/view/simpleBoard/a;->c:Lj7/d;

    .line 25
    .line 26
    invoke-interface {p1}, Lj7/d;->b()V

    .line 27
    .line 28
    .line 29
    return-void

    .line 30
    :cond_0
    iget-object v0, p0, Lcom/zykj/view/simpleBoard/a;->m:Lcom/zykj/view/simpleBoard/SelectionTarget;

    .line 31
    .line 32
    invoke-virtual {v0}, Lcom/zykj/view/simpleBoard/SelectionTarget;->q()Z

    .line 33
    .line 34
    .line 35
    move-result v0

    .line 36
    if-eqz v0, :cond_1

    .line 37
    .line 38
    invoke-virtual {p0, p1}, Lcom/zykj/view/simpleBoard/a;->G(Landroid/graphics/PointF;)V

    .line 39
    .line 40
    .line 41
    iget-boolean p1, p0, Lcom/zykj/view/simpleBoard/a;->n:Z

    .line 42
    .line 43
    if-eqz p1, :cond_6

    .line 44
    .line 45
    iget-object p1, p0, Lcom/zykj/view/simpleBoard/a;->t:Lkotlin/jvm/functions/Function0;

    .line 46
    .line 47
    if-eqz p1, :cond_6

    .line 48
    .line 49
    invoke-interface {p1}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    goto :goto_2

    .line 53
    :cond_1
    invoke-virtual {p0, p1}, Lcom/zykj/view/simpleBoard/a;->G(Landroid/graphics/PointF;)V

    .line 54
    .line 55
    .line 56
    iget-object v0, p0, Lcom/zykj/view/simpleBoard/a;->h:Ljava/util/ArrayList;

    .line 57
    .line 58
    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 59
    .line 60
    .line 61
    iget-object v0, p0, Lcom/zykj/view/simpleBoard/a;->i:Landroid/graphics/RectF;

    .line 62
    .line 63
    invoke-virtual {v0}, Landroid/graphics/RectF;->width()F

    .line 64
    .line 65
    .line 66
    move-result v0

    .line 67
    const/high16 v2, 0x41000000    # 8.0f

    .line 68
    .line 69
    cmpl-float v0, v0, v2

    .line 70
    .line 71
    if-gez v0, :cond_3

    .line 72
    .line 73
    iget-object v0, p0, Lcom/zykj/view/simpleBoard/a;->i:Landroid/graphics/RectF;

    .line 74
    .line 75
    invoke-virtual {v0}, Landroid/graphics/RectF;->height()F

    .line 76
    .line 77
    .line 78
    move-result v0

    .line 79
    cmpl-float v0, v0, v2

    .line 80
    .line 81
    if-ltz v0, :cond_2

    .line 82
    .line 83
    goto :goto_0

    .line 84
    :cond_2
    invoke-virtual {p0, p1}, Lcom/zykj/view/simpleBoard/a;->u(Landroid/graphics/PointF;)Li7/k;

    .line 85
    .line 86
    .line 87
    move-result-object p1

    .line 88
    if-eqz p1, :cond_6

    .line 89
    .line 90
    iget-object v0, p0, Lcom/zykj/view/simpleBoard/a;->h:Ljava/util/ArrayList;

    .line 91
    .line 92
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 93
    .line 94
    .line 95
    goto :goto_2

    .line 96
    :cond_3
    :goto_0
    iget-object p1, p0, Lcom/zykj/view/simpleBoard/a;->h:Ljava/util/ArrayList;

    .line 97
    .line 98
    iget-object v0, p0, Lcom/zykj/view/simpleBoard/a;->g:Ljava/util/ArrayList;

    .line 99
    .line 100
    new-instance v2, Ljava/util/ArrayList;

    .line 101
    .line 102
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 103
    .line 104
    .line 105
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 106
    .line 107
    .line 108
    move-result v3

    .line 109
    move v4, v1

    .line 110
    :cond_4
    :goto_1
    if-ge v4, v3, :cond_5

    .line 111
    .line 112
    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 113
    .line 114
    .line 115
    move-result-object v5

    .line 116
    add-int/lit8 v4, v4, 0x1

    .line 117
    .line 118
    move-object v6, v5

    .line 119
    check-cast v6, Li7/k;

    .line 120
    .line 121
    iget-object v7, p0, Lcom/zykj/view/simpleBoard/a;->i:Landroid/graphics/RectF;

    .line 122
    .line 123
    invoke-virtual {p0, v6}, Lcom/zykj/view/simpleBoard/a;->c(Li7/k;)Landroid/graphics/RectF;

    .line 124
    .line 125
    .line 126
    move-result-object v6

    .line 127
    invoke-virtual {v7, v6}, Landroid/graphics/RectF;->contains(Landroid/graphics/RectF;)Z

    .line 128
    .line 129
    .line 130
    move-result v6

    .line 131
    if-eqz v6, :cond_4

    .line 132
    .line 133
    invoke-interface {v2, v5}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 134
    .line 135
    .line 136
    goto :goto_1

    .line 137
    :cond_5
    invoke-virtual {p1, v2}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 138
    .line 139
    .line 140
    :cond_6
    :goto_2
    sget-object p1, Lcom/zykj/view/simpleBoard/SelectionTarget;->c:Lcom/zykj/view/simpleBoard/SelectionTarget;

    .line 141
    .line 142
    iput-object p1, p0, Lcom/zykj/view/simpleBoard/a;->m:Lcom/zykj/view/simpleBoard/SelectionTarget;

    .line 143
    .line 144
    iput-boolean v1, p0, Lcom/zykj/view/simpleBoard/a;->n:Z

    .line 145
    .line 146
    iput-boolean v1, p0, Lcom/zykj/view/simpleBoard/a;->o:Z

    .line 147
    .line 148
    iget-object p1, p0, Lcom/zykj/view/simpleBoard/a;->i:Landroid/graphics/RectF;

    .line 149
    .line 150
    invoke-virtual {p1}, Landroid/graphics/RectF;->setEmpty()V

    .line 151
    .line 152
    .line 153
    invoke-virtual {p0}, Lcom/zykj/view/simpleBoard/a;->Q()V

    .line 154
    .line 155
    .line 156
    iget-object p1, p0, Lcom/zykj/view/simpleBoard/a;->c:Lj7/d;

    .line 157
    .line 158
    invoke-interface {p1}, Lj7/d;->c()V

    .line 159
    .line 160
    .line 161
    iget-object p1, p0, Lcom/zykj/view/simpleBoard/a;->c:Lj7/d;

    .line 162
    .line 163
    invoke-interface {p1}, Lj7/d;->b()V

    .line 164
    .line 165
    .line 166
    return-void
.end method

.method public final G(Landroid/graphics/PointF;)V
    .locals 5

    .line 1
    const-string v0, "point"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/zykj/view/simpleBoard/a;->m:Lcom/zykj/view/simpleBoard/SelectionTarget;

    .line 7
    .line 8
    invoke-virtual {v0}, Lcom/zykj/view/simpleBoard/SelectionTarget;->q()Z

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    if-eqz v0, :cond_1

    .line 13
    .line 14
    iget-boolean v0, p0, Lcom/zykj/view/simpleBoard/a;->n:Z

    .line 15
    .line 16
    if-nez v0, :cond_0

    .line 17
    .line 18
    iget-object v0, p0, Lcom/zykj/view/simpleBoard/a;->b:Landroid/graphics/Matrix;

    .line 19
    .line 20
    invoke-static {v0}, Lu5/n;->b(Landroid/graphics/Matrix;)Landroid/graphics/Matrix;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    const/high16 v1, 0x40800000    # 4.0f

    .line 25
    .line 26
    invoke-virtual {v0, v1}, Landroid/graphics/Matrix;->mapRadius(F)F

    .line 27
    .line 28
    .line 29
    move-result v0

    .line 30
    iget v1, p1, Landroid/graphics/PointF;->x:F

    .line 31
    .line 32
    iget-object v2, p0, Lcom/zykj/view/simpleBoard/a;->j:Landroid/graphics/PointF;

    .line 33
    .line 34
    iget v3, v2, Landroid/graphics/PointF;->x:F

    .line 35
    .line 36
    sub-float/2addr v1, v3

    .line 37
    iget v3, p1, Landroid/graphics/PointF;->y:F

    .line 38
    .line 39
    iget v2, v2, Landroid/graphics/PointF;->y:F

    .line 40
    .line 41
    sub-float/2addr v3, v2

    .line 42
    mul-float/2addr v1, v1

    .line 43
    mul-float/2addr v3, v3

    .line 44
    add-float/2addr v1, v3

    .line 45
    mul-float/2addr v0, v0

    .line 46
    cmpg-float v0, v1, v0

    .line 47
    .line 48
    if-gez v0, :cond_0

    .line 49
    .line 50
    return-void

    .line 51
    :cond_0
    invoke-virtual {p0, p1}, Lcom/zykj/view/simpleBoard/a;->b(Landroid/graphics/PointF;)V

    .line 52
    .line 53
    .line 54
    iget-object v0, p0, Lcom/zykj/view/simpleBoard/a;->k:Landroid/graphics/PointF;

    .line 55
    .line 56
    invoke-virtual {v0, p1}, Landroid/graphics/PointF;->set(Landroid/graphics/PointF;)V

    .line 57
    .line 58
    .line 59
    goto :goto_0

    .line 60
    :cond_1
    iget-object v0, p0, Lcom/zykj/view/simpleBoard/a;->m:Lcom/zykj/view/simpleBoard/SelectionTarget;

    .line 61
    .line 62
    sget-object v1, Lcom/zykj/view/simpleBoard/SelectionTarget;->c:Lcom/zykj/view/simpleBoard/SelectionTarget;

    .line 63
    .line 64
    if-ne v0, v1, :cond_2

    .line 65
    .line 66
    iget-boolean v0, p0, Lcom/zykj/view/simpleBoard/a;->o:Z

    .line 67
    .line 68
    if-nez v0, :cond_2

    .line 69
    .line 70
    iget-object v0, p0, Lcom/zykj/view/simpleBoard/a;->i:Landroid/graphics/RectF;

    .line 71
    .line 72
    iget-object v1, p0, Lcom/zykj/view/simpleBoard/a;->j:Landroid/graphics/PointF;

    .line 73
    .line 74
    iget v1, v1, Landroid/graphics/PointF;->x:F

    .line 75
    .line 76
    iget v2, p1, Landroid/graphics/PointF;->x:F

    .line 77
    .line 78
    invoke-static {v1, v2}, Ljava/lang/Math;->min(FF)F

    .line 79
    .line 80
    .line 81
    move-result v1

    .line 82
    iget-object v2, p0, Lcom/zykj/view/simpleBoard/a;->j:Landroid/graphics/PointF;

    .line 83
    .line 84
    iget v2, v2, Landroid/graphics/PointF;->y:F

    .line 85
    .line 86
    iget v3, p1, Landroid/graphics/PointF;->y:F

    .line 87
    .line 88
    invoke-static {v2, v3}, Ljava/lang/Math;->min(FF)F

    .line 89
    .line 90
    .line 91
    move-result v2

    .line 92
    iget-object v3, p0, Lcom/zykj/view/simpleBoard/a;->j:Landroid/graphics/PointF;

    .line 93
    .line 94
    iget v3, v3, Landroid/graphics/PointF;->x:F

    .line 95
    .line 96
    iget v4, p1, Landroid/graphics/PointF;->x:F

    .line 97
    .line 98
    invoke-static {v3, v4}, Ljava/lang/Math;->max(FF)F

    .line 99
    .line 100
    .line 101
    move-result v3

    .line 102
    iget-object v4, p0, Lcom/zykj/view/simpleBoard/a;->j:Landroid/graphics/PointF;

    .line 103
    .line 104
    iget v4, v4, Landroid/graphics/PointF;->y:F

    .line 105
    .line 106
    iget p1, p1, Landroid/graphics/PointF;->y:F

    .line 107
    .line 108
    invoke-static {v4, p1}, Ljava/lang/Math;->max(FF)F

    .line 109
    .line 110
    .line 111
    move-result p1

    .line 112
    invoke-virtual {v0, v1, v2, v3, p1}, Landroid/graphics/RectF;->set(FFFF)V

    .line 113
    .line 114
    .line 115
    :cond_2
    :goto_0
    iget-object p1, p0, Lcom/zykj/view/simpleBoard/a;->c:Lj7/d;

    .line 116
    .line 117
    invoke-interface {p1}, Lj7/d;->c()V

    .line 118
    .line 119
    .line 120
    iget-object p1, p0, Lcom/zykj/view/simpleBoard/a;->c:Lj7/d;

    .line 121
    .line 122
    invoke-interface {p1}, Lj7/d;->b()V

    .line 123
    .line 124
    .line 125
    return-void
.end method

.method public final H(Lcom/zykj/view/simpleBoard/SelectionTarget;)Z
    .locals 3

    .line 1
    sget-object v0, Lcom/zykj/view/simpleBoard/SelectionTarget;->o:Lcom/zykj/view/simpleBoard/SelectionTarget;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    if-ne p1, v0, :cond_0

    .line 5
    .line 6
    invoke-virtual {p0}, Lcom/zykj/view/simpleBoard/a;->h()Z

    .line 7
    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    sget-object v0, Lcom/zykj/view/simpleBoard/SelectionTarget;->n:Lcom/zykj/view/simpleBoard/SelectionTarget;

    .line 11
    .line 12
    if-ne p1, v0, :cond_1

    .line 13
    .line 14
    iget-boolean p1, p0, Lcom/zykj/view/simpleBoard/a;->p:Z

    .line 15
    .line 16
    xor-int/2addr p1, v1

    .line 17
    iput-boolean p1, p0, Lcom/zykj/view/simpleBoard/a;->p:Z

    .line 18
    .line 19
    iget-object p1, p0, Lcom/zykj/view/simpleBoard/a;->c:Lj7/d;

    .line 20
    .line 21
    invoke-interface {p1}, Lj7/d;->b()V

    .line 22
    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_1
    sget-object v0, Lcom/zykj/view/simpleBoard/SelectionTarget;->p:Lcom/zykj/view/simpleBoard/SelectionTarget;

    .line 26
    .line 27
    if-eq p1, v0, :cond_4

    .line 28
    .line 29
    invoke-virtual {p1}, Lcom/zykj/view/simpleBoard/SelectionTarget;->g()I

    .line 30
    .line 31
    .line 32
    move-result v0

    .line 33
    const/4 v2, 0x0

    .line 34
    if-ltz v0, :cond_2

    .line 35
    .line 36
    iget-object v0, p0, Lcom/zykj/view/simpleBoard/a;->q:Lh7/d;

    .line 37
    .line 38
    invoke-virtual {v0}, Lh7/d;->h()Ljava/util/List;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    invoke-virtual {p1}, Lcom/zykj/view/simpleBoard/SelectionTarget;->g()I

    .line 43
    .line 44
    .line 45
    move-result p1

    .line 46
    invoke-static {v0, p1}, Lkotlin/collections/CollectionsKt;->getOrNull(Ljava/util/List;I)Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    move-result-object p1

    .line 50
    check-cast p1, Ljava/lang/Integer;

    .line 51
    .line 52
    invoke-virtual {p0, p1, v2}, Lcom/zykj/view/simpleBoard/a;->f0(Ljava/lang/Integer;Ljava/lang/Float;)Z

    .line 53
    .line 54
    .line 55
    goto :goto_0

    .line 56
    :cond_2
    invoke-virtual {p1}, Lcom/zykj/view/simpleBoard/SelectionTarget;->k()I

    .line 57
    .line 58
    .line 59
    move-result v0

    .line 60
    if-ltz v0, :cond_3

    .line 61
    .line 62
    iget-object v0, p0, Lcom/zykj/view/simpleBoard/a;->q:Lh7/d;

    .line 63
    .line 64
    invoke-virtual {v0}, Lh7/d;->i()Ljava/util/List;

    .line 65
    .line 66
    .line 67
    move-result-object v0

    .line 68
    invoke-virtual {p1}, Lcom/zykj/view/simpleBoard/SelectionTarget;->k()I

    .line 69
    .line 70
    .line 71
    move-result p1

    .line 72
    invoke-static {v0, p1}, Lkotlin/collections/CollectionsKt;->getOrNull(Ljava/util/List;I)Ljava/lang/Object;

    .line 73
    .line 74
    .line 75
    move-result-object p1

    .line 76
    check-cast p1, Ljava/lang/Float;

    .line 77
    .line 78
    invoke-virtual {p0, v2, p1}, Lcom/zykj/view/simpleBoard/a;->f0(Ljava/lang/Integer;Ljava/lang/Float;)Z

    .line 79
    .line 80
    .line 81
    goto :goto_0

    .line 82
    :cond_3
    const/4 p1, 0x0

    .line 83
    return p1

    .line 84
    :cond_4
    :goto_0
    return v1
.end method

.method public final I(Landroid/graphics/Path;)V
    .locals 1

    .line 1
    const-string v0, "path"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/zykj/view/simpleBoard/a;->u:Landroid/graphics/Path;

    .line 7
    .line 8
    invoke-virtual {v0, p1}, Landroid/graphics/Path;->set(Landroid/graphics/Path;)V

    .line 9
    .line 10
    .line 11
    iget-object p1, p0, Lcom/zykj/view/simpleBoard/a;->u:Landroid/graphics/Path;

    .line 12
    .line 13
    iget-object v0, p0, Lcom/zykj/view/simpleBoard/a;->b:Landroid/graphics/Matrix;

    .line 14
    .line 15
    invoke-virtual {p1, v0}, Landroid/graphics/Path;->transform(Landroid/graphics/Matrix;)V

    .line 16
    .line 17
    .line 18
    iget-object p1, p0, Lcom/zykj/view/simpleBoard/a;->s:Landroid/graphics/Path;

    .line 19
    .line 20
    iget-object v0, p0, Lcom/zykj/view/simpleBoard/a;->u:Landroid/graphics/Path;

    .line 21
    .line 22
    invoke-virtual {p1, v0}, Landroid/graphics/Path;->set(Landroid/graphics/Path;)V

    .line 23
    .line 24
    .line 25
    iget-object p1, p0, Lcom/zykj/view/simpleBoard/a;->y:Landroid/graphics/Paint;

    .line 26
    .line 27
    invoke-virtual {p0, p1}, Lcom/zykj/view/simpleBoard/a;->M(Landroid/graphics/Paint;)V

    .line 28
    .line 29
    .line 30
    iget-object p1, p0, Lcom/zykj/view/simpleBoard/a;->c:Lj7/d;

    .line 31
    .line 32
    invoke-interface {p1}, Lj7/d;->b()V

    .line 33
    .line 34
    .line 35
    return-void
.end method

.method public final J()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/view/simpleBoard/a;->s:Landroid/graphics/Path;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroid/graphics/Path;->reset()V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/zykj/view/simpleBoard/a;->c:Lj7/d;

    .line 7
    .line 8
    invoke-interface {v0}, Lj7/d;->b()V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public final K(Landroid/graphics/Path;Ljava/util/List;)V
    .locals 2

    .line 1
    const-string v0, "path"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "pointFList"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, Lcom/zykj/view/simpleBoard/a;->s:Landroid/graphics/Path;

    .line 12
    .line 13
    invoke-virtual {v0}, Landroid/graphics/Path;->reset()V

    .line 14
    .line 15
    .line 16
    iget-object v0, p0, Lcom/zykj/view/simpleBoard/a;->x:Landroid/graphics/Paint;

    .line 17
    .line 18
    invoke-virtual {p0, v0}, Lcom/zykj/view/simpleBoard/a;->M(Landroid/graphics/Paint;)V

    .line 19
    .line 20
    .line 21
    iget-object v0, p0, Lcom/zykj/view/simpleBoard/a;->g:Ljava/util/ArrayList;

    .line 22
    .line 23
    iget-object v1, p0, Lcom/zykj/view/simpleBoard/a;->x:Landroid/graphics/Paint;

    .line 24
    .line 25
    invoke-virtual {p0, p2, v1, p1}, Lcom/zykj/view/simpleBoard/a;->d(Ljava/util/List;Landroid/graphics/Paint;Landroid/graphics/Path;)Li7/k;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 30
    .line 31
    .line 32
    iget-object p1, p0, Lcom/zykj/view/simpleBoard/a;->t:Lkotlin/jvm/functions/Function0;

    .line 33
    .line 34
    if-eqz p1, :cond_0

    .line 35
    .line 36
    invoke-interface {p1}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    :cond_0
    iget-object p1, p0, Lcom/zykj/view/simpleBoard/a;->c:Lj7/d;

    .line 40
    .line 41
    invoke-interface {p1}, Lj7/d;->c()V

    .line 42
    .line 43
    .line 44
    iget-object p1, p0, Lcom/zykj/view/simpleBoard/a;->c:Lj7/d;

    .line 45
    .line 46
    invoke-interface {p1}, Lj7/d;->b()V

    .line 47
    .line 48
    .line 49
    return-void
.end method

.method public final L(Landroid/graphics/Paint;)V
    .locals 1

    .line 1
    sget-object v0, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    .line 2
    .line 3
    invoke-virtual {p1, v0}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/zykj/view/simpleBoard/a;->a:Lh7/c;

    .line 7
    .line 8
    invoke-virtual {v0}, Lh7/c;->c()I

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    invoke-virtual {p1, v0}, Landroid/graphics/Paint;->setColor(I)V

    .line 13
    .line 14
    .line 15
    return-void
.end method

.method public final M(Landroid/graphics/Paint;)V
    .locals 3

    .line 1
    sget-object v0, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    .line 2
    .line 3
    invoke-virtual {p1, v0}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/zykj/view/simpleBoard/a;->a:Lh7/c;

    .line 7
    .line 8
    invoke-virtual {v0}, Lh7/c;->f()I

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    invoke-virtual {p1, v0}, Landroid/graphics/Paint;->setColor(I)V

    .line 13
    .line 14
    .line 15
    iget-object v0, p0, Lcom/zykj/view/simpleBoard/a;->a:Lh7/c;

    .line 16
    .line 17
    invoke-virtual {v0}, Lh7/c;->g()F

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    invoke-virtual {p1, v0}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 22
    .line 23
    .line 24
    iget-object v0, p0, Lcom/zykj/view/simpleBoard/a;->a:Lh7/c;

    .line 25
    .line 26
    invoke-virtual {v0}, Lh7/c;->h()Z

    .line 27
    .line 28
    .line 29
    move-result v0

    .line 30
    if-eqz v0, :cond_0

    .line 31
    .line 32
    new-instance v0, Landroid/graphics/DashPathEffect;

    .line 33
    .line 34
    const/4 v1, 0x2

    .line 35
    new-array v1, v1, [F

    .line 36
    .line 37
    fill-array-data v1, :array_0

    .line 38
    .line 39
    .line 40
    const/4 v2, 0x0

    .line 41
    invoke-direct {v0, v1, v2}, Landroid/graphics/DashPathEffect;-><init>([FF)V

    .line 42
    .line 43
    .line 44
    goto :goto_0

    .line 45
    :cond_0
    const/4 v0, 0x0

    .line 46
    :goto_0
    invoke-virtual {p1, v0}, Landroid/graphics/Paint;->setPathEffect(Landroid/graphics/PathEffect;)Landroid/graphics/PathEffect;

    .line 47
    .line 48
    .line 49
    return-void

    .line 50
    nop

    .line 51
    :array_0
    .array-data 4
        0x41f00000    # 30.0f
        0x41700000    # 15.0f
    .end array-data
.end method

.method public final N(I)Z
    .locals 6

    .line 1
    invoke-static {p1}, Landroid/graphics/Color;->red(I)I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-static {p1}, Landroid/graphics/Color;->green(I)I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    invoke-static {p1}, Landroid/graphics/Color;->blue(I)I

    .line 10
    .line 11
    .line 12
    move-result p1

    .line 13
    int-to-double v2, v0

    .line 14
    const-wide v4, 0x3fd322d0e5604189L    # 0.299

    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    mul-double/2addr v2, v4

    .line 20
    int-to-double v0, v1

    .line 21
    const-wide v4, 0x3fe27ef9db22d0e5L    # 0.578

    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    mul-double/2addr v0, v4

    .line 27
    add-double/2addr v2, v0

    .line 28
    int-to-double v0, p1

    .line 29
    const-wide v4, 0x3fbd2f1a9fbe76c9L    # 0.114

    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    mul-double/2addr v0, v4

    .line 35
    add-double/2addr v2, v0

    .line 36
    const-wide/high16 v0, 0x4068000000000000L    # 192.0

    .line 37
    .line 38
    cmpl-double p1, v2, v0

    .line 39
    .line 40
    if-ltz p1, :cond_0

    .line 41
    .line 42
    const/4 p1, 0x1

    .line 43
    return p1

    .line 44
    :cond_0
    const/4 p1, 0x0

    .line 45
    return p1
.end method

.method public final O(Landroid/graphics/PointF;Landroid/graphics/PointF;F)Z
    .locals 2

    .line 1
    iget v0, p1, Landroid/graphics/PointF;->x:F

    .line 2
    .line 3
    iget v1, p2, Landroid/graphics/PointF;->x:F

    .line 4
    .line 5
    sub-float/2addr v0, v1

    .line 6
    iget p1, p1, Landroid/graphics/PointF;->y:F

    .line 7
    .line 8
    iget p2, p2, Landroid/graphics/PointF;->y:F

    .line 9
    .line 10
    sub-float/2addr p1, p2

    .line 11
    mul-float/2addr v0, v0

    .line 12
    mul-float/2addr p1, p1

    .line 13
    add-float/2addr v0, p1

    .line 14
    mul-float/2addr p3, p3

    .line 15
    cmpg-float p1, v0, p3

    .line 16
    .line 17
    if-gtz p1, :cond_0

    .line 18
    .line 19
    const/4 p1, 0x1

    .line 20
    return p1

    .line 21
    :cond_0
    const/4 p1, 0x0

    .line 22
    return p1
.end method

.method public final P()Z
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/zykj/view/simpleBoard/a;->m:Lcom/zykj/view/simpleBoard/SelectionTarget;

    .line 2
    .line 3
    sget-object v1, Lcom/zykj/view/simpleBoard/SelectionTarget;->m:Lcom/zykj/view/simpleBoard/SelectionTarget;

    .line 4
    .line 5
    if-ne v0, v1, :cond_0

    .line 6
    .line 7
    iget-boolean v0, p0, Lcom/zykj/view/simpleBoard/a;->n:Z

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    const/4 v0, 0x1

    .line 12
    return v0

    .line 13
    :cond_0
    const/4 v0, 0x0

    .line 14
    return v0
.end method

.method public final Q()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/zykj/view/simpleBoard/a;->h:Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    const/4 v0, 0x0

    .line 10
    goto :goto_0

    .line 11
    :cond_0
    new-instance v0, Lh7/e;

    .line 12
    .line 13
    iget-object v1, p0, Lcom/zykj/view/simpleBoard/a;->h:Ljava/util/ArrayList;

    .line 14
    .line 15
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    invoke-virtual {p0}, Lcom/zykj/view/simpleBoard/a;->z()Landroid/graphics/RectF;

    .line 20
    .line 21
    .line 22
    move-result-object v2

    .line 23
    invoke-direct {v0, v1, v2}, Lh7/e;-><init>(ILandroid/graphics/RectF;)V

    .line 24
    .line 25
    .line 26
    :goto_0
    iget-object v1, p0, Lcom/zykj/view/simpleBoard/a;->r:Lkotlin/jvm/functions/Function1;

    .line 27
    .line 28
    if-eqz v1, :cond_1

    .line 29
    .line 30
    invoke-interface {v1, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    :cond_1
    return-void
.end method

.method public final R(Lcom/zykj/view/simpleBoard/SelectionTarget;)V
    .locals 3

    .line 1
    invoke-virtual {p1}, Lcom/zykj/view/simpleBoard/SelectionTarget;->q()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_1

    .line 6
    .line 7
    iget-object v0, p0, Lcom/zykj/view/simpleBoard/a;->h:Ljava/util/ArrayList;

    .line 8
    .line 9
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    goto :goto_1

    .line 16
    :cond_0
    const/4 v0, 0x0

    .line 17
    invoke-virtual {p0, v0}, Lcom/zykj/view/simpleBoard/a;->x(Z)Landroid/graphics/RectF;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    sget-object v1, Lcom/zykj/view/simpleBoard/a$b;->a:[I

    .line 22
    .line 23
    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    .line 24
    .line 25
    .line 26
    move-result v2

    .line 27
    aget v1, v1, v2

    .line 28
    .line 29
    packed-switch v1, :pswitch_data_0

    .line 30
    .line 31
    .line 32
    new-instance p1, Landroid/graphics/PointF;

    .line 33
    .line 34
    invoke-virtual {v0}, Landroid/graphics/RectF;->centerX()F

    .line 35
    .line 36
    .line 37
    move-result v1

    .line 38
    invoke-virtual {v0}, Landroid/graphics/RectF;->centerY()F

    .line 39
    .line 40
    .line 41
    move-result v0

    .line 42
    invoke-direct {p1, v1, v0}, Landroid/graphics/PointF;-><init>(FF)V

    .line 43
    .line 44
    .line 45
    goto :goto_0

    .line 46
    :pswitch_0
    new-instance p1, Landroid/graphics/PointF;

    .line 47
    .line 48
    invoke-virtual {v0}, Landroid/graphics/RectF;->centerX()F

    .line 49
    .line 50
    .line 51
    move-result v1

    .line 52
    iget v0, v0, Landroid/graphics/RectF;->top:F

    .line 53
    .line 54
    invoke-direct {p1, v1, v0}, Landroid/graphics/PointF;-><init>(FF)V

    .line 55
    .line 56
    .line 57
    goto :goto_0

    .line 58
    :pswitch_1
    new-instance p1, Landroid/graphics/PointF;

    .line 59
    .line 60
    invoke-virtual {v0}, Landroid/graphics/RectF;->centerX()F

    .line 61
    .line 62
    .line 63
    move-result v1

    .line 64
    iget v0, v0, Landroid/graphics/RectF;->bottom:F

    .line 65
    .line 66
    invoke-direct {p1, v1, v0}, Landroid/graphics/PointF;-><init>(FF)V

    .line 67
    .line 68
    .line 69
    goto :goto_0

    .line 70
    :pswitch_2
    new-instance p1, Landroid/graphics/PointF;

    .line 71
    .line 72
    iget v1, v0, Landroid/graphics/RectF;->left:F

    .line 73
    .line 74
    invoke-virtual {v0}, Landroid/graphics/RectF;->centerY()F

    .line 75
    .line 76
    .line 77
    move-result v0

    .line 78
    invoke-direct {p1, v1, v0}, Landroid/graphics/PointF;-><init>(FF)V

    .line 79
    .line 80
    .line 81
    goto :goto_0

    .line 82
    :pswitch_3
    new-instance p1, Landroid/graphics/PointF;

    .line 83
    .line 84
    iget v1, v0, Landroid/graphics/RectF;->right:F

    .line 85
    .line 86
    invoke-virtual {v0}, Landroid/graphics/RectF;->centerY()F

    .line 87
    .line 88
    .line 89
    move-result v0

    .line 90
    invoke-direct {p1, v1, v0}, Landroid/graphics/PointF;-><init>(FF)V

    .line 91
    .line 92
    .line 93
    goto :goto_0

    .line 94
    :pswitch_4
    invoke-virtual {p1, v0}, Lcom/zykj/view/simpleBoard/SelectionTarget;->u(Landroid/graphics/RectF;)Landroid/graphics/PointF;

    .line 95
    .line 96
    .line 97
    move-result-object p1

    .line 98
    :goto_0
    iget-object v0, p0, Lcom/zykj/view/simpleBoard/a;->l:Landroid/graphics/PointF;

    .line 99
    .line 100
    invoke-virtual {v0, p1}, Landroid/graphics/PointF;->set(Landroid/graphics/PointF;)V

    .line 101
    .line 102
    .line 103
    :cond_1
    :goto_1
    return-void

    .line 104
    nop

    .line 105
    :pswitch_data_0
    .packed-switch 0x2
        :pswitch_4
        :pswitch_4
        :pswitch_4
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final S()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/zykj/view/simpleBoard/a;->A:Landroid/graphics/Paint;

    .line 2
    .line 3
    sget-object v1, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, Lcom/zykj/view/simpleBoard/a;->A:Landroid/graphics/Paint;

    .line 9
    .line 10
    const/high16 v1, 0x40400000    # 3.0f

    .line 11
    .line 12
    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 13
    .line 14
    .line 15
    iget-object v0, p0, Lcom/zykj/view/simpleBoard/a;->A:Landroid/graphics/Paint;

    .line 16
    .line 17
    const v1, -0xb8680d

    .line 18
    .line 19
    .line 20
    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 21
    .line 22
    .line 23
    return-void
.end method

.method public final T(Landroid/graphics/RectF;)Landroid/graphics/PointF;
    .locals 3

    .line 1
    new-instance v0, Landroid/graphics/PointF;

    .line 2
    .line 3
    invoke-virtual {p1}, Landroid/graphics/RectF;->centerX()F

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    iget p1, p1, Landroid/graphics/RectF;->top:F

    .line 8
    .line 9
    const/high16 v2, 0x42580000    # 54.0f

    .line 10
    .line 11
    sub-float/2addr p1, v2

    .line 12
    invoke-direct {v0, v1, p1}, Landroid/graphics/PointF;-><init>(FF)V

    .line 13
    .line 14
    .line 15
    return-object v0
.end method

.method public final U(Landroid/graphics/RectF;)Lh7/b;
    .locals 10

    .line 1
    iget-object v0, p0, Lcom/zykj/view/simpleBoard/a;->c:Lj7/d;

    .line 2
    .line 3
    const-string v1, "null cannot be cast to non-null type android.view.View"

    .line 4
    .line 5
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    check-cast v0, Landroid/view/View;

    .line 9
    .line 10
    iget-object v1, p0, Lcom/zykj/view/simpleBoard/a;->B:Landroid/graphics/Paint;

    .line 11
    .line 12
    const/high16 v2, 0x41c80000    # 25.0f

    .line 13
    .line 14
    invoke-virtual {v1, v2}, Landroid/graphics/Paint;->setTextSize(F)V

    .line 15
    .line 16
    .line 17
    iget-object v1, p0, Lcom/zykj/view/simpleBoard/a;->q:Lh7/d;

    .line 18
    .line 19
    invoke-virtual {v1}, Lh7/d;->b()Z

    .line 20
    .line 21
    .line 22
    move-result v1

    .line 23
    const/high16 v2, 0x41f00000    # 30.0f

    .line 24
    .line 25
    const/4 v3, 0x0

    .line 26
    if-nez v1, :cond_1

    .line 27
    .line 28
    iget-object v1, p0, Lcom/zykj/view/simpleBoard/a;->q:Lh7/d;

    .line 29
    .line 30
    invoke-virtual {v1}, Lh7/d;->c()Z

    .line 31
    .line 32
    .line 33
    move-result v1

    .line 34
    if-eqz v1, :cond_0

    .line 35
    .line 36
    goto :goto_0

    .line 37
    :cond_0
    move v1, v3

    .line 38
    goto :goto_1

    .line 39
    :cond_1
    :goto_0
    iget-object v1, p0, Lcom/zykj/view/simpleBoard/a;->B:Landroid/graphics/Paint;

    .line 40
    .line 41
    const-string v4, "\u7f16\u8f91"

    .line 42
    .line 43
    invoke-virtual {v1, v4}, Landroid/graphics/Paint;->measureText(Ljava/lang/String;)F

    .line 44
    .line 45
    .line 46
    move-result v1

    .line 47
    add-float/2addr v1, v2

    .line 48
    :goto_1
    iget-object v4, p0, Lcom/zykj/view/simpleBoard/a;->q:Lh7/d;

    .line 49
    .line 50
    invoke-virtual {v4}, Lh7/d;->a()Z

    .line 51
    .line 52
    .line 53
    move-result v4

    .line 54
    if-eqz v4, :cond_2

    .line 55
    .line 56
    iget-object v4, p0, Lcom/zykj/view/simpleBoard/a;->B:Landroid/graphics/Paint;

    .line 57
    .line 58
    const-string v5, "\u5220\u9664"

    .line 59
    .line 60
    invoke-virtual {v4, v5}, Landroid/graphics/Paint;->measureText(Ljava/lang/String;)F

    .line 61
    .line 62
    .line 63
    move-result v4

    .line 64
    add-float/2addr v4, v2

    .line 65
    goto :goto_2

    .line 66
    :cond_2
    move v4, v3

    .line 67
    :goto_2
    add-float v2, v1, v4

    .line 68
    .line 69
    const/high16 v5, 0x41800000    # 16.0f

    .line 70
    .line 71
    add-float/2addr v2, v5

    .line 72
    iget v5, p1, Landroid/graphics/RectF;->bottom:F

    .line 73
    .line 74
    const/high16 v6, 0x41600000    # 14.0f

    .line 75
    .line 76
    add-float/2addr v5, v6

    .line 77
    const/high16 v7, 0x42700000    # 60.0f

    .line 78
    .line 79
    add-float v8, v5, v7

    .line 80
    .line 81
    invoke-virtual {v0}, Landroid/view/View;->getHeight()I

    .line 82
    .line 83
    .line 84
    move-result v9

    .line 85
    int-to-float v9, v9

    .line 86
    cmpl-float v8, v8, v9

    .line 87
    .line 88
    if-lez v8, :cond_3

    .line 89
    .line 90
    iget v5, p1, Landroid/graphics/RectF;->top:F

    .line 91
    .line 92
    sub-float/2addr v5, v7

    .line 93
    sub-float/2addr v5, v6

    .line 94
    invoke-static {v5, v3}, Lkotlin/ranges/RangesKt;->coerceAtLeast(FF)F

    .line 95
    .line 96
    .line 97
    move-result v5

    .line 98
    :cond_3
    iget p1, p1, Landroid/graphics/RectF;->left:F

    .line 99
    .line 100
    invoke-virtual {v0}, Landroid/view/View;->getWidth()I

    .line 101
    .line 102
    .line 103
    move-result v0

    .line 104
    int-to-float v0, v0

    .line 105
    sub-float/2addr v0, v2

    .line 106
    invoke-static {v0, v3}, Lkotlin/ranges/RangesKt;->coerceAtLeast(FF)F

    .line 107
    .line 108
    .line 109
    move-result v0

    .line 110
    invoke-static {p1, v3, v0}, Lkotlin/ranges/RangesKt;->coerceIn(FFF)F

    .line 111
    .line 112
    .line 113
    move-result p1

    .line 114
    const/high16 v0, 0x41000000    # 8.0f

    .line 115
    .line 116
    add-float/2addr p1, v0

    .line 117
    new-instance v0, Lh7/b;

    .line 118
    .line 119
    new-instance v2, Landroid/graphics/RectF;

    .line 120
    .line 121
    add-float/2addr v1, p1

    .line 122
    add-float/2addr v7, v5

    .line 123
    invoke-direct {v2, p1, v5, v1, v7}, Landroid/graphics/RectF;-><init>(FFFF)V

    .line 124
    .line 125
    .line 126
    new-instance p1, Landroid/graphics/RectF;

    .line 127
    .line 128
    add-float/2addr v4, v1

    .line 129
    invoke-direct {p1, v1, v5, v4, v7}, Landroid/graphics/RectF;-><init>(FFFF)V

    .line 130
    .line 131
    .line 132
    invoke-direct {v0, v2, p1}, Lh7/b;-><init>(Landroid/graphics/RectF;Landroid/graphics/RectF;)V

    .line 133
    .line 134
    .line 135
    return-object v0
.end method

.method public final V(Landroid/graphics/RectF;)Ljava/util/List;
    .locals 9

    .line 1
    new-instance v0, Landroid/graphics/PointF;

    .line 2
    .line 3
    iget v1, p1, Landroid/graphics/RectF;->left:F

    .line 4
    .line 5
    iget v2, p1, Landroid/graphics/RectF;->top:F

    .line 6
    .line 7
    invoke-direct {v0, v1, v2}, Landroid/graphics/PointF;-><init>(FF)V

    .line 8
    .line 9
    .line 10
    new-instance v1, Landroid/graphics/PointF;

    .line 11
    .line 12
    invoke-virtual {p1}, Landroid/graphics/RectF;->centerX()F

    .line 13
    .line 14
    .line 15
    move-result v2

    .line 16
    iget v3, p1, Landroid/graphics/RectF;->top:F

    .line 17
    .line 18
    invoke-direct {v1, v2, v3}, Landroid/graphics/PointF;-><init>(FF)V

    .line 19
    .line 20
    .line 21
    new-instance v2, Landroid/graphics/PointF;

    .line 22
    .line 23
    iget v3, p1, Landroid/graphics/RectF;->right:F

    .line 24
    .line 25
    iget v4, p1, Landroid/graphics/RectF;->top:F

    .line 26
    .line 27
    invoke-direct {v2, v3, v4}, Landroid/graphics/PointF;-><init>(FF)V

    .line 28
    .line 29
    .line 30
    new-instance v3, Landroid/graphics/PointF;

    .line 31
    .line 32
    iget v4, p1, Landroid/graphics/RectF;->right:F

    .line 33
    .line 34
    invoke-virtual {p1}, Landroid/graphics/RectF;->centerY()F

    .line 35
    .line 36
    .line 37
    move-result v5

    .line 38
    invoke-direct {v3, v4, v5}, Landroid/graphics/PointF;-><init>(FF)V

    .line 39
    .line 40
    .line 41
    new-instance v4, Landroid/graphics/PointF;

    .line 42
    .line 43
    iget v5, p1, Landroid/graphics/RectF;->right:F

    .line 44
    .line 45
    iget v6, p1, Landroid/graphics/RectF;->bottom:F

    .line 46
    .line 47
    invoke-direct {v4, v5, v6}, Landroid/graphics/PointF;-><init>(FF)V

    .line 48
    .line 49
    .line 50
    new-instance v5, Landroid/graphics/PointF;

    .line 51
    .line 52
    invoke-virtual {p1}, Landroid/graphics/RectF;->centerX()F

    .line 53
    .line 54
    .line 55
    move-result v6

    .line 56
    iget v7, p1, Landroid/graphics/RectF;->bottom:F

    .line 57
    .line 58
    invoke-direct {v5, v6, v7}, Landroid/graphics/PointF;-><init>(FF)V

    .line 59
    .line 60
    .line 61
    new-instance v6, Landroid/graphics/PointF;

    .line 62
    .line 63
    iget v7, p1, Landroid/graphics/RectF;->left:F

    .line 64
    .line 65
    iget v8, p1, Landroid/graphics/RectF;->bottom:F

    .line 66
    .line 67
    invoke-direct {v6, v7, v8}, Landroid/graphics/PointF;-><init>(FF)V

    .line 68
    .line 69
    .line 70
    new-instance v7, Landroid/graphics/PointF;

    .line 71
    .line 72
    iget v8, p1, Landroid/graphics/RectF;->left:F

    .line 73
    .line 74
    invoke-virtual {p1}, Landroid/graphics/RectF;->centerY()F

    .line 75
    .line 76
    .line 77
    move-result p1

    .line 78
    invoke-direct {v7, v8, p1}, Landroid/graphics/PointF;-><init>(FF)V

    .line 79
    .line 80
    .line 81
    filled-new-array/range {v0 .. v7}, [Landroid/graphics/PointF;

    .line 82
    .line 83
    .line 84
    move-result-object p1

    .line 85
    invoke-static {p1}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    .line 86
    .line 87
    .line 88
    move-result-object p1

    .line 89
    return-object p1
.end method

.method public final W(Landroid/graphics/Bitmap;)V
    .locals 3

    .line 1
    const-string v0, "bitmap"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    :try_start_0
    sget-object v0, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    .line 7
    .line 8
    invoke-static {p1}, Landroid/graphics/Bitmap;->createBitmap(Landroid/graphics/Bitmap;)Landroid/graphics/Bitmap;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    invoke-static {p1}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 16
    goto :goto_0

    .line 17
    :catchall_0
    move-exception p1

    .line 18
    sget-object v0, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    .line 19
    .line 20
    invoke-static {p1}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    invoke-static {p1}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    :goto_0
    invoke-static {p1}, Lkotlin/Result;->isFailure-impl(Ljava/lang/Object;)Z

    .line 29
    .line 30
    .line 31
    move-result v0

    .line 32
    if-eqz v0, :cond_0

    .line 33
    .line 34
    const/4 p1, 0x0

    .line 35
    :cond_0
    check-cast p1, Landroid/graphics/Bitmap;

    .line 36
    .line 37
    if-eqz p1, :cond_1

    .line 38
    .line 39
    iput-object p1, p0, Lcom/zykj/view/simpleBoard/a;->d:Landroid/graphics/Bitmap;

    .line 40
    .line 41
    iget-object v0, p0, Lcom/zykj/view/simpleBoard/a;->c:Lj7/d;

    .line 42
    .line 43
    const-string v1, "null cannot be cast to non-null type android.view.View"

    .line 44
    .line 45
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 46
    .line 47
    .line 48
    check-cast v0, Landroid/view/View;

    .line 49
    .line 50
    invoke-virtual {v0}, Landroid/view/View;->getWidth()I

    .line 51
    .line 52
    .line 53
    move-result v0

    .line 54
    if-lez v0, :cond_1

    .line 55
    .line 56
    int-to-float v0, v0

    .line 57
    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getWidth()I

    .line 58
    .line 59
    .line 60
    move-result v1

    .line 61
    int-to-float v1, v1

    .line 62
    div-float v1, v0, v1

    .line 63
    .line 64
    iget-object v2, p0, Lcom/zykj/view/simpleBoard/a;->f:Landroid/graphics/Matrix;

    .line 65
    .line 66
    invoke-virtual {v2, v1, v1}, Landroid/graphics/Matrix;->setScale(FF)V

    .line 67
    .line 68
    .line 69
    iget-object v2, p0, Lcom/zykj/view/simpleBoard/a;->e:Landroid/graphics/RectF;

    .line 70
    .line 71
    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getHeight()I

    .line 72
    .line 73
    .line 74
    move-result p1

    .line 75
    int-to-float p1, p1

    .line 76
    mul-float/2addr p1, v1

    .line 77
    const/4 v1, 0x0

    .line 78
    invoke-virtual {v2, v1, v1, v0, p1}, Landroid/graphics/RectF;->set(FFFF)V

    .line 79
    .line 80
    .line 81
    :cond_1
    iget-object p1, p0, Lcom/zykj/view/simpleBoard/a;->c:Lj7/d;

    .line 82
    .line 83
    invoke-interface {p1}, Lj7/d;->a()V

    .line 84
    .line 85
    .line 86
    return-void
.end method

.method public final X(Lkotlin/jvm/functions/Function0;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/zykj/view/simpleBoard/a;->t:Lkotlin/jvm/functions/Function0;

    .line 2
    .line 3
    return-void
.end method

.method public final Y(Lkotlin/jvm/functions/Function1;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/zykj/view/simpleBoard/a;->r:Lkotlin/jvm/functions/Function1;

    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/zykj/view/simpleBoard/a;->Q()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final Z(Lh7/d;)V
    .locals 1

    .line 1
    const-string v0, "config"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, Lcom/zykj/view/simpleBoard/a;->q:Lh7/d;

    .line 7
    .line 8
    invoke-virtual {p1}, Lh7/d;->b()Z

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    if-nez v0, :cond_0

    .line 13
    .line 14
    invoke-virtual {p1}, Lh7/d;->c()Z

    .line 15
    .line 16
    .line 17
    move-result p1

    .line 18
    if-nez p1, :cond_0

    .line 19
    .line 20
    const/4 p1, 0x0

    .line 21
    iput-boolean p1, p0, Lcom/zykj/view/simpleBoard/a;->p:Z

    .line 22
    .line 23
    :cond_0
    iget-object p1, p0, Lcom/zykj/view/simpleBoard/a;->c:Lj7/d;

    .line 24
    .line 25
    invoke-interface {p1}, Lj7/d;->b()V

    .line 26
    .line 27
    .line 28
    return-void
.end method

.method public final a(Landroid/graphics/Matrix;)V
    .locals 10

    .line 1
    iget-object v0, p0, Lcom/zykj/view/simpleBoard/a;->h:Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    const/4 v2, 0x0

    .line 8
    move v3, v2

    .line 9
    :goto_0
    if-ge v3, v1, :cond_1

    .line 10
    .line 11
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v4

    .line 15
    add-int/lit8 v3, v3, 0x1

    .line 16
    .line 17
    check-cast v4, Li7/k;

    .line 18
    .line 19
    invoke-virtual {v4}, Li7/k;->b()Landroid/graphics/Path;

    .line 20
    .line 21
    .line 22
    move-result-object v5

    .line 23
    invoke-virtual {v5, p1}, Landroid/graphics/Path;->transform(Landroid/graphics/Matrix;)V

    .line 24
    .line 25
    .line 26
    invoke-virtual {v4}, Li7/k;->c()Ljava/util/List;

    .line 27
    .line 28
    .line 29
    move-result-object v5

    .line 30
    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 31
    .line 32
    .line 33
    move-result-object v5

    .line 34
    :goto_1
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 35
    .line 36
    .line 37
    move-result v6

    .line 38
    if-eqz v6, :cond_0

    .line 39
    .line 40
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    move-result-object v6

    .line 44
    check-cast v6, Landroid/graphics/PointF;

    .line 45
    .line 46
    iget v7, v6, Landroid/graphics/PointF;->x:F

    .line 47
    .line 48
    iget v8, v6, Landroid/graphics/PointF;->y:F

    .line 49
    .line 50
    const/4 v9, 0x2

    .line 51
    new-array v9, v9, [F

    .line 52
    .line 53
    aput v7, v9, v2

    .line 54
    .line 55
    const/4 v7, 0x1

    .line 56
    aput v8, v9, v7

    .line 57
    .line 58
    invoke-virtual {p1, v9}, Landroid/graphics/Matrix;->mapPoints([F)V

    .line 59
    .line 60
    .line 61
    aget v8, v9, v2

    .line 62
    .line 63
    aget v7, v9, v7

    .line 64
    .line 65
    invoke-virtual {v6, v8, v7}, Landroid/graphics/PointF;->set(FF)V

    .line 66
    .line 67
    .line 68
    goto :goto_1

    .line 69
    :cond_0
    invoke-virtual {p0, v4}, Lcom/zykj/view/simpleBoard/a;->h0(Li7/k;)V

    .line 70
    .line 71
    .line 72
    goto :goto_0

    .line 73
    :cond_1
    return-void
.end method

.method public final a0(Landroid/graphics/RectF;Landroid/graphics/RectF;)Landroid/graphics/RectF;
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/zykj/view/simpleBoard/a;->q:Lh7/d;

    .line 2
    .line 3
    invoke-virtual {v0}, Lh7/d;->b()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    iget-object v0, p0, Lcom/zykj/view/simpleBoard/a;->q:Lh7/d;

    .line 10
    .line 11
    invoke-virtual {v0}, Lh7/d;->h()Ljava/util/List;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    const/4 v1, 0x5

    .line 16
    invoke-static {v0, v1}, Lkotlin/collections/CollectionsKt;->take(Ljava/lang/Iterable;I)Ljava/util/List;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    goto :goto_0

    .line 25
    :cond_0
    const/4 v0, 0x0

    .line 26
    :goto_0
    if-nez v0, :cond_1

    .line 27
    .line 28
    new-instance p1, Landroid/graphics/RectF;

    .line 29
    .line 30
    invoke-direct {p1}, Landroid/graphics/RectF;-><init>()V

    .line 31
    .line 32
    .line 33
    return-object p1

    .line 34
    :cond_1
    invoke-virtual {p2}, Landroid/graphics/RectF;->isEmpty()Z

    .line 35
    .line 36
    .line 37
    move-result v0

    .line 38
    if-eqz v0, :cond_2

    .line 39
    .line 40
    iget p2, p1, Landroid/graphics/RectF;->left:F

    .line 41
    .line 42
    goto :goto_1

    .line 43
    :cond_2
    iget p2, p2, Landroid/graphics/RectF;->right:F

    .line 44
    .line 45
    const/high16 v0, 0x41500000    # 13.0f

    .line 46
    .line 47
    add-float/2addr p2, v0

    .line 48
    :goto_1
    new-instance v0, Landroid/graphics/RectF;

    .line 49
    .line 50
    iget v1, p1, Landroid/graphics/RectF;->top:F

    .line 51
    .line 52
    iget v2, p1, Landroid/graphics/RectF;->right:F

    .line 53
    .line 54
    iget p1, p1, Landroid/graphics/RectF;->bottom:F

    .line 55
    .line 56
    invoke-direct {v0, p2, v1, v2, p1}, Landroid/graphics/RectF;-><init>(FFFF)V

    .line 57
    .line 58
    .line 59
    return-object v0
.end method

.method public final b(Landroid/graphics/PointF;)V
    .locals 6

    .line 1
    new-instance v0, Landroid/graphics/Matrix;

    .line 2
    .line 3
    invoke-direct {v0}, Landroid/graphics/Matrix;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-object v1, p0, Lcom/zykj/view/simpleBoard/a;->m:Lcom/zykj/view/simpleBoard/SelectionTarget;

    .line 7
    .line 8
    sget-object v2, Lcom/zykj/view/simpleBoard/a$b;->a:[I

    .line 9
    .line 10
    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    aget v1, v2, v1

    .line 15
    .line 16
    const/high16 v2, 0x40a00000    # 5.0f

    .line 17
    .line 18
    const v3, 0x3e4ccccd    # 0.2f

    .line 19
    .line 20
    .line 21
    const/high16 v4, 0x3f800000    # 1.0f

    .line 22
    .line 23
    packed-switch v1, :pswitch_data_0

    .line 24
    .line 25
    .line 26
    goto/16 :goto_0

    .line 27
    .line 28
    :pswitch_0
    iget-object v1, p0, Lcom/zykj/view/simpleBoard/a;->q:Lh7/d;

    .line 29
    .line 30
    invoke-virtual {v1}, Lh7/d;->e()Z

    .line 31
    .line 32
    .line 33
    move-result v1

    .line 34
    if-nez v1, :cond_0

    .line 35
    .line 36
    goto/16 :goto_0

    .line 37
    .line 38
    :cond_0
    iget-object v1, p0, Lcom/zykj/view/simpleBoard/a;->k:Landroid/graphics/PointF;

    .line 39
    .line 40
    iget v2, v1, Landroid/graphics/PointF;->y:F

    .line 41
    .line 42
    iget-object v3, p0, Lcom/zykj/view/simpleBoard/a;->l:Landroid/graphics/PointF;

    .line 43
    .line 44
    iget v4, v3, Landroid/graphics/PointF;->y:F

    .line 45
    .line 46
    sub-float/2addr v2, v4

    .line 47
    float-to-double v4, v2

    .line 48
    iget v1, v1, Landroid/graphics/PointF;->x:F

    .line 49
    .line 50
    iget v2, v3, Landroid/graphics/PointF;->x:F

    .line 51
    .line 52
    sub-float/2addr v1, v2

    .line 53
    float-to-double v1, v1

    .line 54
    invoke-static {v4, v5, v1, v2}, Ljava/lang/Math;->atan2(DD)D

    .line 55
    .line 56
    .line 57
    move-result-wide v1

    .line 58
    double-to-float v1, v1

    .line 59
    iget v2, p1, Landroid/graphics/PointF;->y:F

    .line 60
    .line 61
    iget-object v3, p0, Lcom/zykj/view/simpleBoard/a;->l:Landroid/graphics/PointF;

    .line 62
    .line 63
    iget v4, v3, Landroid/graphics/PointF;->y:F

    .line 64
    .line 65
    sub-float/2addr v2, v4

    .line 66
    float-to-double v4, v2

    .line 67
    iget p1, p1, Landroid/graphics/PointF;->x:F

    .line 68
    .line 69
    iget v2, v3, Landroid/graphics/PointF;->x:F

    .line 70
    .line 71
    sub-float/2addr p1, v2

    .line 72
    float-to-double v2, p1

    .line 73
    invoke-static {v4, v5, v2, v3}, Ljava/lang/Math;->atan2(DD)D

    .line 74
    .line 75
    .line 76
    move-result-wide v2

    .line 77
    double-to-float p1, v2

    .line 78
    sub-float/2addr p1, v1

    .line 79
    float-to-double v1, p1

    .line 80
    invoke-static {v1, v2}, Ljava/lang/Math;->toDegrees(D)D

    .line 81
    .line 82
    .line 83
    move-result-wide v1

    .line 84
    double-to-float p1, v1

    .line 85
    iget-object v1, p0, Lcom/zykj/view/simpleBoard/a;->l:Landroid/graphics/PointF;

    .line 86
    .line 87
    iget v2, v1, Landroid/graphics/PointF;->x:F

    .line 88
    .line 89
    iget v1, v1, Landroid/graphics/PointF;->y:F

    .line 90
    .line 91
    invoke-virtual {v0, p1, v2, v1}, Landroid/graphics/Matrix;->setRotate(FFF)V

    .line 92
    .line 93
    .line 94
    goto/16 :goto_1

    .line 95
    .line 96
    :pswitch_1
    iget-object v1, p0, Lcom/zykj/view/simpleBoard/a;->q:Lh7/d;

    .line 97
    .line 98
    invoke-virtual {v1}, Lh7/d;->g()Z

    .line 99
    .line 100
    .line 101
    move-result v1

    .line 102
    if-nez v1, :cond_1

    .line 103
    .line 104
    goto :goto_0

    .line 105
    :cond_1
    iget-object v1, p0, Lcom/zykj/view/simpleBoard/a;->l:Landroid/graphics/PointF;

    .line 106
    .line 107
    iget v1, v1, Landroid/graphics/PointF;->y:F

    .line 108
    .line 109
    iget-object v5, p0, Lcom/zykj/view/simpleBoard/a;->k:Landroid/graphics/PointF;

    .line 110
    .line 111
    iget v5, v5, Landroid/graphics/PointF;->y:F

    .line 112
    .line 113
    sub-float/2addr v5, v1

    .line 114
    invoke-static {v5}, Ljava/lang/Math;->abs(F)F

    .line 115
    .line 116
    .line 117
    move-result v5

    .line 118
    invoke-static {v5, v4}, Lkotlin/ranges/RangesKt;->coerceAtLeast(FF)F

    .line 119
    .line 120
    .line 121
    move-result v5

    .line 122
    iget p1, p1, Landroid/graphics/PointF;->y:F

    .line 123
    .line 124
    sub-float/2addr p1, v1

    .line 125
    invoke-static {p1}, Ljava/lang/Math;->abs(F)F

    .line 126
    .line 127
    .line 128
    move-result p1

    .line 129
    div-float/2addr p1, v5

    .line 130
    invoke-static {p1, v3, v2}, Lkotlin/ranges/RangesKt;->coerceIn(FFF)F

    .line 131
    .line 132
    .line 133
    move-result p1

    .line 134
    iget-object v2, p0, Lcom/zykj/view/simpleBoard/a;->l:Landroid/graphics/PointF;

    .line 135
    .line 136
    iget v2, v2, Landroid/graphics/PointF;->x:F

    .line 137
    .line 138
    invoke-virtual {v0, v4, p1, v2, v1}, Landroid/graphics/Matrix;->setScale(FFFF)V

    .line 139
    .line 140
    .line 141
    goto :goto_1

    .line 142
    :pswitch_2
    iget-object v1, p0, Lcom/zykj/view/simpleBoard/a;->q:Lh7/d;

    .line 143
    .line 144
    invoke-virtual {v1}, Lh7/d;->g()Z

    .line 145
    .line 146
    .line 147
    move-result v1

    .line 148
    if-nez v1, :cond_2

    .line 149
    .line 150
    goto :goto_0

    .line 151
    :cond_2
    iget-object v1, p0, Lcom/zykj/view/simpleBoard/a;->l:Landroid/graphics/PointF;

    .line 152
    .line 153
    iget v1, v1, Landroid/graphics/PointF;->x:F

    .line 154
    .line 155
    iget-object v5, p0, Lcom/zykj/view/simpleBoard/a;->k:Landroid/graphics/PointF;

    .line 156
    .line 157
    iget v5, v5, Landroid/graphics/PointF;->x:F

    .line 158
    .line 159
    sub-float/2addr v5, v1

    .line 160
    invoke-static {v5}, Ljava/lang/Math;->abs(F)F

    .line 161
    .line 162
    .line 163
    move-result v5

    .line 164
    invoke-static {v5, v4}, Lkotlin/ranges/RangesKt;->coerceAtLeast(FF)F

    .line 165
    .line 166
    .line 167
    move-result v5

    .line 168
    iget p1, p1, Landroid/graphics/PointF;->x:F

    .line 169
    .line 170
    sub-float/2addr p1, v1

    .line 171
    invoke-static {p1}, Ljava/lang/Math;->abs(F)F

    .line 172
    .line 173
    .line 174
    move-result p1

    .line 175
    div-float/2addr p1, v5

    .line 176
    invoke-static {p1, v3, v2}, Lkotlin/ranges/RangesKt;->coerceIn(FFF)F

    .line 177
    .line 178
    .line 179
    move-result p1

    .line 180
    iget-object v2, p0, Lcom/zykj/view/simpleBoard/a;->l:Landroid/graphics/PointF;

    .line 181
    .line 182
    iget v2, v2, Landroid/graphics/PointF;->y:F

    .line 183
    .line 184
    invoke-virtual {v0, p1, v4, v1, v2}, Landroid/graphics/Matrix;->setScale(FFFF)V

    .line 185
    .line 186
    .line 187
    goto :goto_1

    .line 188
    :pswitch_3
    iget-object v1, p0, Lcom/zykj/view/simpleBoard/a;->q:Lh7/d;

    .line 189
    .line 190
    invoke-virtual {v1}, Lh7/d;->f()Z

    .line 191
    .line 192
    .line 193
    move-result v1

    .line 194
    if-nez v1, :cond_3

    .line 195
    .line 196
    :goto_0
    return-void

    .line 197
    :cond_3
    iget-object v1, p0, Lcom/zykj/view/simpleBoard/a;->l:Landroid/graphics/PointF;

    .line 198
    .line 199
    iget-object v5, p0, Lcom/zykj/view/simpleBoard/a;->k:Landroid/graphics/PointF;

    .line 200
    .line 201
    invoke-virtual {p0, v5, v1}, Lcom/zykj/view/simpleBoard/a;->i(Landroid/graphics/PointF;Landroid/graphics/PointF;)F

    .line 202
    .line 203
    .line 204
    move-result v5

    .line 205
    invoke-static {v5, v4}, Lkotlin/ranges/RangesKt;->coerceAtLeast(FF)F

    .line 206
    .line 207
    .line 208
    move-result v4

    .line 209
    invoke-virtual {p0, p1, v1}, Lcom/zykj/view/simpleBoard/a;->i(Landroid/graphics/PointF;Landroid/graphics/PointF;)F

    .line 210
    .line 211
    .line 212
    move-result p1

    .line 213
    div-float/2addr p1, v4

    .line 214
    invoke-static {p1, v3, v2}, Lkotlin/ranges/RangesKt;->coerceIn(FFF)F

    .line 215
    .line 216
    .line 217
    move-result p1

    .line 218
    iget v2, v1, Landroid/graphics/PointF;->x:F

    .line 219
    .line 220
    iget v1, v1, Landroid/graphics/PointF;->y:F

    .line 221
    .line 222
    invoke-virtual {v0, p1, p1, v2, v1}, Landroid/graphics/Matrix;->setScale(FFFF)V

    .line 223
    .line 224
    .line 225
    goto :goto_1

    .line 226
    :pswitch_4
    iget v1, p1, Landroid/graphics/PointF;->x:F

    .line 227
    .line 228
    iget-object v2, p0, Lcom/zykj/view/simpleBoard/a;->k:Landroid/graphics/PointF;

    .line 229
    .line 230
    iget v3, v2, Landroid/graphics/PointF;->x:F

    .line 231
    .line 232
    sub-float/2addr v1, v3

    .line 233
    iget p1, p1, Landroid/graphics/PointF;->y:F

    .line 234
    .line 235
    iget v2, v2, Landroid/graphics/PointF;->y:F

    .line 236
    .line 237
    sub-float/2addr p1, v2

    .line 238
    invoke-virtual {v0, v1, p1}, Landroid/graphics/Matrix;->setTranslate(FF)V

    .line 239
    .line 240
    .line 241
    :goto_1
    invoke-virtual {p0, v0}, Lcom/zykj/view/simpleBoard/a;->a(Landroid/graphics/Matrix;)V

    .line 242
    .line 243
    .line 244
    const/4 p1, 0x1

    .line 245
    iput-boolean p1, p0, Lcom/zykj/view/simpleBoard/a;->n:Z

    .line 246
    .line 247
    return-void

    .line 248
    nop

    .line 249
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_4
        :pswitch_3
        :pswitch_3
        :pswitch_3
        :pswitch_3
        :pswitch_2
        :pswitch_2
        :pswitch_1
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final b0(Landroid/graphics/RectF;)Ljava/util/List;
    .locals 9

    .line 1
    iget-object v0, p0, Lcom/zykj/view/simpleBoard/a;->q:Lh7/d;

    .line 2
    .line 3
    invoke-virtual {v0}, Lh7/d;->b()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_3

    .line 8
    .line 9
    iget-object v0, p0, Lcom/zykj/view/simpleBoard/a;->q:Lh7/d;

    .line 10
    .line 11
    invoke-virtual {v0}, Lh7/d;->h()Ljava/util/List;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    if-eqz v0, :cond_0

    .line 20
    .line 21
    goto :goto_1

    .line 22
    :cond_0
    invoke-virtual {p0, p1}, Lcom/zykj/view/simpleBoard/a;->d0(Landroid/graphics/RectF;)Landroid/graphics/RectF;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    invoke-virtual {p0, p1, v0}, Lcom/zykj/view/simpleBoard/a;->a0(Landroid/graphics/RectF;Landroid/graphics/RectF;)Landroid/graphics/RectF;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    iget-object v0, p0, Lcom/zykj/view/simpleBoard/a;->q:Lh7/d;

    .line 31
    .line 32
    invoke-virtual {v0}, Lh7/d;->h()Ljava/util/List;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    const/4 v1, 0x5

    .line 37
    invoke-static {v0, v1}, Lkotlin/collections/CollectionsKt;->take(Ljava/lang/Iterable;I)Ljava/util/List;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    new-instance v1, Ljava/util/ArrayList;

    .line 42
    .line 43
    const/16 v2, 0xa

    .line 44
    .line 45
    invoke-static {v0, v2}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    .line 46
    .line 47
    .line 48
    move-result v2

    .line 49
    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 50
    .line 51
    .line 52
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 53
    .line 54
    .line 55
    move-result-object v0

    .line 56
    const/4 v2, 0x0

    .line 57
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 58
    .line 59
    .line 60
    move-result v3

    .line 61
    if-eqz v3, :cond_2

    .line 62
    .line 63
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 64
    .line 65
    .line 66
    move-result-object v3

    .line 67
    add-int/lit8 v4, v2, 0x1

    .line 68
    .line 69
    if-gez v2, :cond_1

    .line 70
    .line 71
    invoke-static {}, Lkotlin/collections/CollectionsKt;->throwIndexOverflow()V

    .line 72
    .line 73
    .line 74
    :cond_1
    check-cast v3, Ljava/lang/Number;

    .line 75
    .line 76
    invoke-virtual {v3}, Ljava/lang/Number;->intValue()I

    .line 77
    .line 78
    .line 79
    move-result v3

    .line 80
    iget v5, p1, Landroid/graphics/RectF;->left:F

    .line 81
    .line 82
    const/high16 v6, 0x41b80000    # 23.0f

    .line 83
    .line 84
    add-float/2addr v5, v6

    .line 85
    int-to-float v2, v2

    .line 86
    const/high16 v6, 0x42740000    # 61.0f

    .line 87
    .line 88
    mul-float/2addr v2, v6

    .line 89
    add-float/2addr v5, v2

    .line 90
    invoke-virtual {p1}, Landroid/graphics/RectF;->centerY()F

    .line 91
    .line 92
    .line 93
    move-result v2

    .line 94
    const/high16 v6, 0x41980000    # 19.0f

    .line 95
    .line 96
    sub-float/2addr v2, v6

    .line 97
    new-instance v6, Landroid/graphics/RectF;

    .line 98
    .line 99
    const/high16 v7, 0x42180000    # 38.0f

    .line 100
    .line 101
    add-float v8, v5, v7

    .line 102
    .line 103
    add-float/2addr v7, v2

    .line 104
    invoke-direct {v6, v5, v2, v8, v7}, Landroid/graphics/RectF;-><init>(FFFF)V

    .line 105
    .line 106
    .line 107
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 108
    .line 109
    .line 110
    move-result-object v2

    .line 111
    invoke-static {v6, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 112
    .line 113
    .line 114
    move-result-object v2

    .line 115
    invoke-interface {v1, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 116
    .line 117
    .line 118
    move v2, v4

    .line 119
    goto :goto_0

    .line 120
    :cond_2
    return-object v1

    .line 121
    :cond_3
    :goto_1
    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    .line 122
    .line 123
    .line 124
    move-result-object p1

    .line 125
    return-object p1
.end method

.method public final c(Li7/k;)Landroid/graphics/RectF;
    .locals 3

    .line 1
    new-instance v0, Landroid/graphics/RectF;

    .line 2
    .line 3
    invoke-direct {v0}, Landroid/graphics/RectF;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p1}, Li7/k;->b()Landroid/graphics/Path;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    const/4 v2, 0x1

    .line 11
    invoke-virtual {v1, v0, v2}, Landroid/graphics/Path;->computeBounds(Landroid/graphics/RectF;Z)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {p1}, Li7/k;->a()Landroid/graphics/Paint;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    invoke-virtual {v1}, Landroid/graphics/Paint;->getStrokeWidth()F

    .line 19
    .line 20
    .line 21
    move-result v1

    .line 22
    neg-float v1, v1

    .line 23
    invoke-virtual {p1}, Li7/k;->a()Landroid/graphics/Paint;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    invoke-virtual {p1}, Landroid/graphics/Paint;->getStrokeWidth()F

    .line 28
    .line 29
    .line 30
    move-result p1

    .line 31
    neg-float p1, p1

    .line 32
    invoke-virtual {v0, v1, p1}, Landroid/graphics/RectF;->inset(FF)V

    .line 33
    .line 34
    .line 35
    return-object v0
.end method

.method public final c0(Landroid/graphics/RectF;)Landroid/graphics/RectF;
    .locals 8

    .line 1
    iget-object v0, p0, Lcom/zykj/view/simpleBoard/a;->c:Lj7/d;

    .line 2
    .line 3
    const-string v1, "null cannot be cast to non-null type android.view.View"

    .line 4
    .line 5
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    check-cast v0, Landroid/view/View;

    .line 9
    .line 10
    iget-object v1, p0, Lcom/zykj/view/simpleBoard/a;->q:Lh7/d;

    .line 11
    .line 12
    invoke-virtual {v1}, Lh7/d;->c()Z

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    const/4 v2, 0x0

    .line 17
    const/4 v3, 0x5

    .line 18
    if-eqz v1, :cond_0

    .line 19
    .line 20
    iget-object v1, p0, Lcom/zykj/view/simpleBoard/a;->q:Lh7/d;

    .line 21
    .line 22
    invoke-virtual {v1}, Lh7/d;->i()Ljava/util/List;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    invoke-static {v1, v3}, Lkotlin/collections/CollectionsKt;->take(Ljava/lang/Iterable;I)Ljava/util/List;

    .line 27
    .line 28
    .line 29
    move-result-object v1

    .line 30
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 31
    .line 32
    .line 33
    move-result v1

    .line 34
    goto :goto_0

    .line 35
    :cond_0
    move v1, v2

    .line 36
    :goto_0
    iget-object v4, p0, Lcom/zykj/view/simpleBoard/a;->q:Lh7/d;

    .line 37
    .line 38
    invoke-virtual {v4}, Lh7/d;->b()Z

    .line 39
    .line 40
    .line 41
    move-result v4

    .line 42
    if-eqz v4, :cond_1

    .line 43
    .line 44
    iget-object v2, p0, Lcom/zykj/view/simpleBoard/a;->q:Lh7/d;

    .line 45
    .line 46
    invoke-virtual {v2}, Lh7/d;->h()Ljava/util/List;

    .line 47
    .line 48
    .line 49
    move-result-object v2

    .line 50
    invoke-static {v2, v3}, Lkotlin/collections/CollectionsKt;->take(Ljava/lang/Iterable;I)Ljava/util/List;

    .line 51
    .line 52
    .line 53
    move-result-object v2

    .line 54
    invoke-interface {v2}, Ljava/util/List;->size()I

    .line 55
    .line 56
    .line 57
    move-result v2

    .line 58
    :cond_1
    const/4 v3, 0x0

    .line 59
    if-nez v1, :cond_2

    .line 60
    .line 61
    move v1, v3

    .line 62
    goto :goto_1

    .line 63
    :cond_2
    int-to-float v1, v1

    .line 64
    const/high16 v4, 0x42380000    # 46.0f

    .line 65
    .line 66
    mul-float/2addr v1, v4

    .line 67
    const/high16 v4, 0x42000000    # 32.0f

    .line 68
    .line 69
    add-float/2addr v1, v4

    .line 70
    :goto_1
    if-nez v2, :cond_3

    .line 71
    .line 72
    move v2, v3

    .line 73
    goto :goto_2

    .line 74
    :cond_3
    int-to-float v2, v2

    .line 75
    const/high16 v4, 0x42740000    # 61.0f

    .line 76
    .line 77
    mul-float/2addr v2, v4

    .line 78
    const/high16 v4, 0x41b80000    # 23.0f

    .line 79
    .line 80
    add-float/2addr v2, v4

    .line 81
    :goto_2
    cmpl-float v4, v1, v3

    .line 82
    .line 83
    const/high16 v5, 0x41500000    # 13.0f

    .line 84
    .line 85
    if-lez v4, :cond_4

    .line 86
    .line 87
    cmpl-float v4, v2, v3

    .line 88
    .line 89
    if-lez v4, :cond_4

    .line 90
    .line 91
    move v4, v5

    .line 92
    goto :goto_3

    .line 93
    :cond_4
    move v4, v3

    .line 94
    :goto_3
    add-float/2addr v1, v4

    .line 95
    add-float/2addr v1, v2

    .line 96
    invoke-virtual {v0}, Landroid/view/View;->getWidth()I

    .line 97
    .line 98
    .line 99
    move-result v2

    .line 100
    int-to-float v2, v2

    .line 101
    invoke-static {v1, v2}, Lkotlin/ranges/RangesKt;->coerceAtMost(FF)F

    .line 102
    .line 103
    .line 104
    move-result v1

    .line 105
    iget v2, p1, Landroid/graphics/RectF;->left:F

    .line 106
    .line 107
    invoke-virtual {v0}, Landroid/view/View;->getWidth()I

    .line 108
    .line 109
    .line 110
    move-result v4

    .line 111
    int-to-float v4, v4

    .line 112
    sub-float/2addr v4, v1

    .line 113
    invoke-static {v4, v3}, Lkotlin/ranges/RangesKt;->coerceAtLeast(FF)F

    .line 114
    .line 115
    .line 116
    move-result v4

    .line 117
    invoke-static {v2, v3, v4}, Lkotlin/ranges/RangesKt;->coerceIn(FFF)F

    .line 118
    .line 119
    .line 120
    move-result v2

    .line 121
    invoke-virtual {p0, p1}, Lcom/zykj/view/simpleBoard/a;->U(Landroid/graphics/RectF;)Lh7/b;

    .line 122
    .line 123
    .line 124
    move-result-object p1

    .line 125
    invoke-virtual {p1}, Lh7/b;->b()Landroid/graphics/RectF;

    .line 126
    .line 127
    .line 128
    move-result-object v4

    .line 129
    iget v4, v4, Landroid/graphics/RectF;->bottom:F

    .line 130
    .line 131
    add-float/2addr v4, v5

    .line 132
    const/high16 v6, 0x42700000    # 60.0f

    .line 133
    .line 134
    add-float v7, v4, v6

    .line 135
    .line 136
    invoke-virtual {v0}, Landroid/view/View;->getHeight()I

    .line 137
    .line 138
    .line 139
    move-result v0

    .line 140
    int-to-float v0, v0

    .line 141
    cmpl-float v0, v7, v0

    .line 142
    .line 143
    if-lez v0, :cond_5

    .line 144
    .line 145
    invoke-virtual {p1}, Lh7/b;->b()Landroid/graphics/RectF;

    .line 146
    .line 147
    .line 148
    move-result-object p1

    .line 149
    iget p1, p1, Landroid/graphics/RectF;->top:F

    .line 150
    .line 151
    sub-float/2addr p1, v6

    .line 152
    sub-float/2addr p1, v5

    .line 153
    invoke-static {p1, v3}, Lkotlin/ranges/RangesKt;->coerceAtLeast(FF)F

    .line 154
    .line 155
    .line 156
    move-result v4

    .line 157
    :cond_5
    new-instance p1, Landroid/graphics/RectF;

    .line 158
    .line 159
    add-float/2addr v1, v2

    .line 160
    add-float/2addr v6, v4

    .line 161
    invoke-direct {p1, v2, v4, v1, v6}, Landroid/graphics/RectF;-><init>(FFFF)V

    .line 162
    .line 163
    .line 164
    return-object p1
.end method

.method public final d(Ljava/util/List;Landroid/graphics/Paint;Landroid/graphics/Path;)Li7/k;
    .locals 11

    .line 1
    new-instance v0, Landroid/graphics/Path;

    .line 2
    .line 3
    invoke-direct {v0}, Landroid/graphics/Path;-><init>()V

    .line 4
    .line 5
    .line 6
    const/4 v1, 0x2

    .line 7
    const/4 v2, 0x1

    .line 8
    if-eqz p3, :cond_0

    .line 9
    .line 10
    invoke-virtual {v0, p3}, Landroid/graphics/Path;->set(Landroid/graphics/Path;)V

    .line 11
    .line 12
    .line 13
    goto :goto_2

    .line 14
    :cond_0
    new-instance p3, Landroid/graphics/PointF;

    .line 15
    .line 16
    invoke-direct {p3}, Landroid/graphics/PointF;-><init>()V

    .line 17
    .line 18
    .line 19
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 20
    .line 21
    .line 22
    move-result-object v3

    .line 23
    const/4 v4, 0x0

    .line 24
    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 25
    .line 26
    .line 27
    move-result v5

    .line 28
    if-eqz v5, :cond_4

    .line 29
    .line 30
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object v5

    .line 34
    add-int/lit8 v6, v4, 0x1

    .line 35
    .line 36
    if-gez v4, :cond_1

    .line 37
    .line 38
    invoke-static {}, Lkotlin/collections/CollectionsKt;->throwIndexOverflow()V

    .line 39
    .line 40
    .line 41
    :cond_1
    check-cast v5, Landroid/graphics/PointF;

    .line 42
    .line 43
    if-nez v4, :cond_2

    .line 44
    .line 45
    iget v4, v5, Landroid/graphics/PointF;->x:F

    .line 46
    .line 47
    iget v7, v5, Landroid/graphics/PointF;->y:F

    .line 48
    .line 49
    invoke-virtual {v0, v4, v7}, Landroid/graphics/Path;->moveTo(FF)V

    .line 50
    .line 51
    .line 52
    iget v4, v5, Landroid/graphics/PointF;->x:F

    .line 53
    .line 54
    iget v7, v5, Landroid/graphics/PointF;->y:F

    .line 55
    .line 56
    invoke-virtual {v0, v4, v7}, Landroid/graphics/Path;->lineTo(FF)V

    .line 57
    .line 58
    .line 59
    invoke-virtual {p3, v5}, Landroid/graphics/PointF;->set(Landroid/graphics/PointF;)V

    .line 60
    .line 61
    .line 62
    goto :goto_1

    .line 63
    :cond_2
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 64
    .line 65
    .line 66
    move-result v7

    .line 67
    sub-int/2addr v7, v2

    .line 68
    if-ne v4, v7, :cond_3

    .line 69
    .line 70
    iget v4, p3, Landroid/graphics/PointF;->x:F

    .line 71
    .line 72
    iget v7, p3, Landroid/graphics/PointF;->y:F

    .line 73
    .line 74
    iget v8, v5, Landroid/graphics/PointF;->x:F

    .line 75
    .line 76
    add-float/2addr v8, v4

    .line 77
    int-to-float v9, v1

    .line 78
    div-float/2addr v8, v9

    .line 79
    iget v10, v5, Landroid/graphics/PointF;->y:F

    .line 80
    .line 81
    add-float/2addr v10, v7

    .line 82
    div-float/2addr v10, v9

    .line 83
    invoke-virtual {v0, v4, v7, v8, v10}, Landroid/graphics/Path;->quadTo(FFFF)V

    .line 84
    .line 85
    .line 86
    iget v4, v5, Landroid/graphics/PointF;->x:F

    .line 87
    .line 88
    iget v5, v5, Landroid/graphics/PointF;->y:F

    .line 89
    .line 90
    invoke-virtual {v0, v4, v5}, Landroid/graphics/Path;->lineTo(FF)V

    .line 91
    .line 92
    .line 93
    goto :goto_1

    .line 94
    :cond_3
    iget v4, p3, Landroid/graphics/PointF;->x:F

    .line 95
    .line 96
    iget v7, p3, Landroid/graphics/PointF;->y:F

    .line 97
    .line 98
    iget v8, v5, Landroid/graphics/PointF;->x:F

    .line 99
    .line 100
    add-float/2addr v8, v4

    .line 101
    int-to-float v9, v1

    .line 102
    div-float/2addr v8, v9

    .line 103
    iget v10, v5, Landroid/graphics/PointF;->y:F

    .line 104
    .line 105
    add-float/2addr v10, v7

    .line 106
    div-float/2addr v10, v9

    .line 107
    invoke-virtual {v0, v4, v7, v8, v10}, Landroid/graphics/Path;->quadTo(FFFF)V

    .line 108
    .line 109
    .line 110
    invoke-virtual {p3, v5}, Landroid/graphics/PointF;->set(Landroid/graphics/PointF;)V

    .line 111
    .line 112
    .line 113
    :goto_1
    move v4, v6

    .line 114
    goto :goto_0

    .line 115
    :cond_4
    :goto_2
    new-instance p3, Landroid/graphics/Paint;

    .line 116
    .line 117
    invoke-direct {p3, p2}, Landroid/graphics/Paint;-><init>(Landroid/graphics/Paint;)V

    .line 118
    .line 119
    .line 120
    new-instance p2, Landroid/graphics/RectF;

    .line 121
    .line 122
    invoke-direct {p2}, Landroid/graphics/RectF;-><init>()V

    .line 123
    .line 124
    .line 125
    invoke-virtual {v0, p2, v2}, Landroid/graphics/Path;->computeBounds(Landroid/graphics/RectF;Z)V

    .line 126
    .line 127
    .line 128
    iget-object v2, p0, Lcom/zykj/view/simpleBoard/a;->b:Landroid/graphics/Matrix;

    .line 129
    .line 130
    invoke-static {v2}, Lu5/n;->b(Landroid/graphics/Matrix;)Landroid/graphics/Matrix;

    .line 131
    .line 132
    .line 133
    move-result-object v2

    .line 134
    iget-object v3, p0, Lcom/zykj/view/simpleBoard/a;->a:Lh7/c;

    .line 135
    .line 136
    invoke-virtual {v3}, Lh7/c;->d()F

    .line 137
    .line 138
    .line 139
    move-result v3

    .line 140
    invoke-virtual {v2, v3}, Landroid/graphics/Matrix;->mapRadius(F)F

    .line 141
    .line 142
    .line 143
    move-result v2

    .line 144
    invoke-virtual {p2}, Landroid/graphics/RectF;->width()F

    .line 145
    .line 146
    .line 147
    move-result v3

    .line 148
    int-to-float v1, v1

    .line 149
    mul-float/2addr v1, v2

    .line 150
    cmpg-float v3, v3, v1

    .line 151
    .line 152
    if-gez v3, :cond_5

    .line 153
    .line 154
    iget v3, p2, Landroid/graphics/RectF;->left:F

    .line 155
    .line 156
    sub-float/2addr v3, v2

    .line 157
    iput v3, p2, Landroid/graphics/RectF;->left:F

    .line 158
    .line 159
    iget v3, p2, Landroid/graphics/RectF;->right:F

    .line 160
    .line 161
    add-float/2addr v3, v2

    .line 162
    iput v3, p2, Landroid/graphics/RectF;->right:F

    .line 163
    .line 164
    :cond_5
    invoke-virtual {p2}, Landroid/graphics/RectF;->height()F

    .line 165
    .line 166
    .line 167
    move-result v3

    .line 168
    cmpg-float v1, v3, v1

    .line 169
    .line 170
    if-gez v1, :cond_6

    .line 171
    .line 172
    iget v1, p2, Landroid/graphics/RectF;->top:F

    .line 173
    .line 174
    sub-float/2addr v1, v2

    .line 175
    iput v1, p2, Landroid/graphics/RectF;->top:F

    .line 176
    .line 177
    iget v1, p2, Landroid/graphics/RectF;->bottom:F

    .line 178
    .line 179
    add-float/2addr v1, v2

    .line 180
    iput v1, p2, Landroid/graphics/RectF;->bottom:F

    .line 181
    .line 182
    :cond_6
    new-instance v1, Ljava/util/ArrayList;

    .line 183
    .line 184
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 185
    .line 186
    .line 187
    invoke-virtual {v1, p1}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 188
    .line 189
    .line 190
    new-instance p1, Li7/k;

    .line 191
    .line 192
    invoke-direct {p1, v0, p3, p2, v1}, Li7/k;-><init>(Landroid/graphics/Path;Landroid/graphics/Paint;Landroid/graphics/RectF;Ljava/util/List;)V

    .line 193
    .line 194
    .line 195
    return-object p1
.end method

.method public final d0(Landroid/graphics/RectF;)Landroid/graphics/RectF;
    .locals 6

    .line 1
    iget-object v0, p0, Lcom/zykj/view/simpleBoard/a;->q:Lh7/d;

    .line 2
    .line 3
    invoke-virtual {v0}, Lh7/d;->c()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    iget-object v0, p0, Lcom/zykj/view/simpleBoard/a;->q:Lh7/d;

    .line 10
    .line 11
    invoke-virtual {v0}, Lh7/d;->i()Ljava/util/List;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    const/4 v1, 0x5

    .line 16
    invoke-static {v0, v1}, Lkotlin/collections/CollectionsKt;->take(Ljava/lang/Iterable;I)Ljava/util/List;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    goto :goto_0

    .line 25
    :cond_0
    const/4 v0, 0x0

    .line 26
    :goto_0
    if-nez v0, :cond_1

    .line 27
    .line 28
    new-instance p1, Landroid/graphics/RectF;

    .line 29
    .line 30
    invoke-direct {p1}, Landroid/graphics/RectF;-><init>()V

    .line 31
    .line 32
    .line 33
    return-object p1

    .line 34
    :cond_1
    new-instance v1, Landroid/graphics/RectF;

    .line 35
    .line 36
    iget v2, p1, Landroid/graphics/RectF;->left:F

    .line 37
    .line 38
    iget v3, p1, Landroid/graphics/RectF;->top:F

    .line 39
    .line 40
    const/high16 v4, 0x42000000    # 32.0f

    .line 41
    .line 42
    add-float/2addr v4, v2

    .line 43
    int-to-float v0, v0

    .line 44
    const/high16 v5, 0x42380000    # 46.0f

    .line 45
    .line 46
    mul-float/2addr v0, v5

    .line 47
    add-float/2addr v4, v0

    .line 48
    iget p1, p1, Landroid/graphics/RectF;->bottom:F

    .line 49
    .line 50
    invoke-direct {v1, v2, v3, v4, p1}, Landroid/graphics/RectF;-><init>(FFFF)V

    .line 51
    .line 52
    .line 53
    return-object v1
.end method

.method public final e(Landroid/graphics/PointF;Ljava/util/List;F)Z
    .locals 11

    .line 1
    invoke-interface {p2}, Ljava/util/List;->size()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    const/4 v2, 0x1

    .line 7
    if-ne v0, v2, :cond_1

    .line 8
    .line 9
    invoke-static {p2}, Lkotlin/collections/CollectionsKt;->first(Ljava/util/List;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object p2

    .line 13
    check-cast p2, Landroid/graphics/PointF;

    .line 14
    .line 15
    invoke-virtual {p0, p1, p2}, Lcom/zykj/view/simpleBoard/a;->i(Landroid/graphics/PointF;Landroid/graphics/PointF;)F

    .line 16
    .line 17
    .line 18
    move-result p1

    .line 19
    cmpg-float p1, p1, p3

    .line 20
    .line 21
    if-gtz p1, :cond_0

    .line 22
    .line 23
    return v2

    .line 24
    :cond_0
    return v1

    .line 25
    :cond_1
    invoke-interface {p2}, Ljava/util/List;->size()I

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    sub-int/2addr v0, v2

    .line 30
    move v3, v1

    .line 31
    :cond_2
    if-ge v3, v0, :cond_3

    .line 32
    .line 33
    invoke-interface {p2, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object v4

    .line 37
    check-cast v4, Landroid/graphics/PointF;

    .line 38
    .line 39
    iget v5, v4, Landroid/graphics/PointF;->x:F

    .line 40
    .line 41
    invoke-interface {p2, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object v4

    .line 45
    check-cast v4, Landroid/graphics/PointF;

    .line 46
    .line 47
    iget v6, v4, Landroid/graphics/PointF;->y:F

    .line 48
    .line 49
    add-int/lit8 v3, v3, 0x1

    .line 50
    .line 51
    invoke-interface {p2, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 52
    .line 53
    .line 54
    move-result-object v4

    .line 55
    check-cast v4, Landroid/graphics/PointF;

    .line 56
    .line 57
    iget v7, v4, Landroid/graphics/PointF;->x:F

    .line 58
    .line 59
    invoke-interface {p2, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 60
    .line 61
    .line 62
    move-result-object v4

    .line 63
    check-cast v4, Landroid/graphics/PointF;

    .line 64
    .line 65
    iget v8, v4, Landroid/graphics/PointF;->y:F

    .line 66
    .line 67
    iget v9, p1, Landroid/graphics/PointF;->x:F

    .line 68
    .line 69
    iget v10, p1, Landroid/graphics/PointF;->y:F

    .line 70
    .line 71
    invoke-static/range {v5 .. v10}, Lr5/a;->b(FFFFFF)F

    .line 72
    .line 73
    .line 74
    move-result v4

    .line 75
    cmpg-float v4, v4, p3

    .line 76
    .line 77
    if-gtz v4, :cond_2

    .line 78
    .line 79
    return v2

    .line 80
    :cond_3
    return v1
.end method

.method public final e0(Landroid/graphics/RectF;)Ljava/util/List;
    .locals 9

    .line 1
    iget-object v0, p0, Lcom/zykj/view/simpleBoard/a;->q:Lh7/d;

    .line 2
    .line 3
    invoke-virtual {v0}, Lh7/d;->c()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_3

    .line 8
    .line 9
    iget-object v0, p0, Lcom/zykj/view/simpleBoard/a;->q:Lh7/d;

    .line 10
    .line 11
    invoke-virtual {v0}, Lh7/d;->i()Ljava/util/List;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    if-eqz v0, :cond_0

    .line 20
    .line 21
    goto :goto_1

    .line 22
    :cond_0
    invoke-virtual {p0, p1}, Lcom/zykj/view/simpleBoard/a;->d0(Landroid/graphics/RectF;)Landroid/graphics/RectF;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    iget-object v0, p0, Lcom/zykj/view/simpleBoard/a;->q:Lh7/d;

    .line 27
    .line 28
    invoke-virtual {v0}, Lh7/d;->i()Ljava/util/List;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    const/4 v1, 0x5

    .line 33
    invoke-static {v0, v1}, Lkotlin/collections/CollectionsKt;->take(Ljava/lang/Iterable;I)Ljava/util/List;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    new-instance v1, Ljava/util/ArrayList;

    .line 38
    .line 39
    const/16 v2, 0xa

    .line 40
    .line 41
    invoke-static {v0, v2}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    .line 42
    .line 43
    .line 44
    move-result v2

    .line 45
    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 46
    .line 47
    .line 48
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    const/4 v2, 0x0

    .line 53
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 54
    .line 55
    .line 56
    move-result v3

    .line 57
    if-eqz v3, :cond_2

    .line 58
    .line 59
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 60
    .line 61
    .line 62
    move-result-object v3

    .line 63
    add-int/lit8 v4, v2, 0x1

    .line 64
    .line 65
    if-gez v2, :cond_1

    .line 66
    .line 67
    invoke-static {}, Lkotlin/collections/CollectionsKt;->throwIndexOverflow()V

    .line 68
    .line 69
    .line 70
    :cond_1
    check-cast v3, Ljava/lang/Number;

    .line 71
    .line 72
    invoke-virtual {v3}, Ljava/lang/Number;->floatValue()F

    .line 73
    .line 74
    .line 75
    move-result v3

    .line 76
    iget v5, p1, Landroid/graphics/RectF;->left:F

    .line 77
    .line 78
    const/high16 v6, 0x41800000    # 16.0f

    .line 79
    .line 80
    add-float/2addr v5, v6

    .line 81
    int-to-float v2, v2

    .line 82
    const/high16 v6, 0x42380000    # 46.0f

    .line 83
    .line 84
    mul-float/2addr v2, v6

    .line 85
    add-float/2addr v5, v2

    .line 86
    new-instance v2, Landroid/graphics/RectF;

    .line 87
    .line 88
    iget v7, p1, Landroid/graphics/RectF;->top:F

    .line 89
    .line 90
    add-float/2addr v6, v5

    .line 91
    iget v8, p1, Landroid/graphics/RectF;->bottom:F

    .line 92
    .line 93
    invoke-direct {v2, v5, v7, v6, v8}, Landroid/graphics/RectF;-><init>(FFFF)V

    .line 94
    .line 95
    .line 96
    invoke-static {v3}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 97
    .line 98
    .line 99
    move-result-object v3

    .line 100
    invoke-static {v2, v3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 101
    .line 102
    .line 103
    move-result-object v2

    .line 104
    invoke-interface {v1, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 105
    .line 106
    .line 107
    move v2, v4

    .line 108
    goto :goto_0

    .line 109
    :cond_2
    return-object v1

    .line 110
    :cond_3
    :goto_1
    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    .line 111
    .line 112
    .line 113
    move-result-object p1

    .line 114
    return-object p1
.end method

.method public final f()V
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/zykj/view/simpleBoard/a;->g()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/zykj/view/simpleBoard/a;->g:Ljava/util/ArrayList;

    .line 5
    .line 6
    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 7
    .line 8
    .line 9
    iget-object v0, p0, Lcom/zykj/view/simpleBoard/a;->t:Lkotlin/jvm/functions/Function0;

    .line 10
    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    invoke-interface {v0}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    :cond_0
    iget-object v0, p0, Lcom/zykj/view/simpleBoard/a;->c:Lj7/d;

    .line 17
    .line 18
    invoke-interface {v0}, Lj7/d;->c()V

    .line 19
    .line 20
    .line 21
    return-void
.end method

.method public final f0(Ljava/lang/Integer;Ljava/lang/Float;)Z
    .locals 8

    .line 1
    iget-object v0, p0, Lcom/zykj/view/simpleBoard/a;->h:Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/4 v1, 0x0

    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    return v1

    .line 11
    :cond_0
    iget-object v0, p0, Lcom/zykj/view/simpleBoard/a;->h:Ljava/util/ArrayList;

    .line 12
    .line 13
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 14
    .line 15
    .line 16
    move-result v2

    .line 17
    move v3, v1

    .line 18
    :cond_1
    :goto_0
    if-ge v3, v2, :cond_3

    .line 19
    .line 20
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object v4

    .line 24
    add-int/lit8 v3, v3, 0x1

    .line 25
    .line 26
    check-cast v4, Li7/k;

    .line 27
    .line 28
    const/4 v5, 0x1

    .line 29
    if-eqz p1, :cond_2

    .line 30
    .line 31
    iget-object v6, p0, Lcom/zykj/view/simpleBoard/a;->q:Lh7/d;

    .line 32
    .line 33
    invoke-virtual {v6}, Lh7/d;->b()Z

    .line 34
    .line 35
    .line 36
    move-result v6

    .line 37
    if-eqz v6, :cond_2

    .line 38
    .line 39
    invoke-virtual {v4}, Li7/k;->a()Landroid/graphics/Paint;

    .line 40
    .line 41
    .line 42
    move-result-object v6

    .line 43
    invoke-virtual {v6}, Landroid/graphics/Paint;->getColor()I

    .line 44
    .line 45
    .line 46
    move-result v6

    .line 47
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 48
    .line 49
    .line 50
    move-result v7

    .line 51
    if-eq v6, v7, :cond_2

    .line 52
    .line 53
    invoke-virtual {v4}, Li7/k;->a()Landroid/graphics/Paint;

    .line 54
    .line 55
    .line 56
    move-result-object v1

    .line 57
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 58
    .line 59
    .line 60
    move-result v6

    .line 61
    invoke-virtual {v1, v6}, Landroid/graphics/Paint;->setColor(I)V

    .line 62
    .line 63
    .line 64
    move v1, v5

    .line 65
    :cond_2
    if-eqz p2, :cond_1

    .line 66
    .line 67
    iget-object v6, p0, Lcom/zykj/view/simpleBoard/a;->q:Lh7/d;

    .line 68
    .line 69
    invoke-virtual {v6}, Lh7/d;->c()Z

    .line 70
    .line 71
    .line 72
    move-result v6

    .line 73
    if-eqz v6, :cond_1

    .line 74
    .line 75
    invoke-virtual {v4}, Li7/k;->a()Landroid/graphics/Paint;

    .line 76
    .line 77
    .line 78
    move-result-object v6

    .line 79
    invoke-virtual {v6}, Landroid/graphics/Paint;->getStrokeWidth()F

    .line 80
    .line 81
    .line 82
    move-result v6

    .line 83
    invoke-static {v6, p2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(FLjava/lang/Float;)Z

    .line 84
    .line 85
    .line 86
    move-result v6

    .line 87
    if-nez v6, :cond_1

    .line 88
    .line 89
    invoke-virtual {v4}, Li7/k;->a()Landroid/graphics/Paint;

    .line 90
    .line 91
    .line 92
    move-result-object v1

    .line 93
    invoke-virtual {p2}, Ljava/lang/Float;->floatValue()F

    .line 94
    .line 95
    .line 96
    move-result v4

    .line 97
    invoke-virtual {v1, v4}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 98
    .line 99
    .line 100
    move v1, v5

    .line 101
    goto :goto_0

    .line 102
    :cond_3
    if-eqz v1, :cond_5

    .line 103
    .line 104
    iget-object p1, p0, Lcom/zykj/view/simpleBoard/a;->t:Lkotlin/jvm/functions/Function0;

    .line 105
    .line 106
    if-eqz p1, :cond_4

    .line 107
    .line 108
    invoke-interface {p1}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    .line 109
    .line 110
    .line 111
    :cond_4
    iget-object p1, p0, Lcom/zykj/view/simpleBoard/a;->c:Lj7/d;

    .line 112
    .line 113
    invoke-interface {p1}, Lj7/d;->c()V

    .line 114
    .line 115
    .line 116
    :cond_5
    return v1
.end method

.method public final g()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/view/simpleBoard/a;->h:Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    iget-object v0, p0, Lcom/zykj/view/simpleBoard/a;->i:Landroid/graphics/RectF;

    .line 10
    .line 11
    invoke-virtual {v0}, Landroid/graphics/RectF;->isEmpty()Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    return-void

    .line 18
    :cond_0
    iget-object v0, p0, Lcom/zykj/view/simpleBoard/a;->h:Ljava/util/ArrayList;

    .line 19
    .line 20
    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 21
    .line 22
    .line 23
    iget-object v0, p0, Lcom/zykj/view/simpleBoard/a;->i:Landroid/graphics/RectF;

    .line 24
    .line 25
    invoke-virtual {v0}, Landroid/graphics/RectF;->setEmpty()V

    .line 26
    .line 27
    .line 28
    sget-object v0, Lcom/zykj/view/simpleBoard/SelectionTarget;->c:Lcom/zykj/view/simpleBoard/SelectionTarget;

    .line 29
    .line 30
    iput-object v0, p0, Lcom/zykj/view/simpleBoard/a;->m:Lcom/zykj/view/simpleBoard/SelectionTarget;

    .line 31
    .line 32
    const/4 v0, 0x0

    .line 33
    iput-boolean v0, p0, Lcom/zykj/view/simpleBoard/a;->n:Z

    .line 34
    .line 35
    iput-boolean v0, p0, Lcom/zykj/view/simpleBoard/a;->o:Z

    .line 36
    .line 37
    iput-boolean v0, p0, Lcom/zykj/view/simpleBoard/a;->p:Z

    .line 38
    .line 39
    invoke-virtual {p0}, Lcom/zykj/view/simpleBoard/a;->Q()V

    .line 40
    .line 41
    .line 42
    iget-object v0, p0, Lcom/zykj/view/simpleBoard/a;->c:Lj7/d;

    .line 43
    .line 44
    invoke-interface {v0}, Lj7/d;->b()V

    .line 45
    .line 46
    .line 47
    return-void
.end method

.method public final g0(II)V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/zykj/view/simpleBoard/a;->d:Landroid/graphics/Bitmap;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    int-to-float p1, p1

    .line 7
    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getWidth()I

    .line 8
    .line 9
    .line 10
    move-result p2

    .line 11
    int-to-float p2, p2

    .line 12
    div-float p2, p1, p2

    .line 13
    .line 14
    iget-object v2, p0, Lcom/zykj/view/simpleBoard/a;->f:Landroid/graphics/Matrix;

    .line 15
    .line 16
    invoke-virtual {v2, p2, p2}, Landroid/graphics/Matrix;->setScale(FF)V

    .line 17
    .line 18
    .line 19
    iget-object v2, p0, Lcom/zykj/view/simpleBoard/a;->e:Landroid/graphics/RectF;

    .line 20
    .line 21
    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getHeight()I

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    int-to-float v0, v0

    .line 26
    mul-float/2addr v0, p2

    .line 27
    invoke-virtual {v2, v1, v1, p1, v0}, Landroid/graphics/RectF;->set(FFFF)V

    .line 28
    .line 29
    .line 30
    return-void

    .line 31
    :cond_0
    iget-object v0, p0, Lcom/zykj/view/simpleBoard/a;->e:Landroid/graphics/RectF;

    .line 32
    .line 33
    int-to-float p1, p1

    .line 34
    int-to-float p2, p2

    .line 35
    invoke-virtual {v0, v1, v1, p1, p2}, Landroid/graphics/RectF;->set(FFFF)V

    .line 36
    .line 37
    .line 38
    return-void
.end method

.method public final h()Z
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/zykj/view/simpleBoard/a;->q:Lh7/d;

    .line 2
    .line 3
    invoke-virtual {v0}, Lh7/d;->a()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_2

    .line 8
    .line 9
    iget-object v0, p0, Lcom/zykj/view/simpleBoard/a;->h:Ljava/util/ArrayList;

    .line 10
    .line 11
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    iget-object v0, p0, Lcom/zykj/view/simpleBoard/a;->g:Ljava/util/ArrayList;

    .line 19
    .line 20
    iget-object v1, p0, Lcom/zykj/view/simpleBoard/a;->h:Ljava/util/ArrayList;

    .line 21
    .line 22
    invoke-static {v1}, Lkotlin/collections/CollectionsKt;->toSet(Ljava/lang/Iterable;)Ljava/util/Set;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    check-cast v1, Ljava/util/Collection;

    .line 27
    .line 28
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->removeAll(Ljava/util/Collection;)Z

    .line 29
    .line 30
    .line 31
    invoke-virtual {p0}, Lcom/zykj/view/simpleBoard/a;->g()V

    .line 32
    .line 33
    .line 34
    iget-object v0, p0, Lcom/zykj/view/simpleBoard/a;->t:Lkotlin/jvm/functions/Function0;

    .line 35
    .line 36
    if-eqz v0, :cond_1

    .line 37
    .line 38
    invoke-interface {v0}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    :cond_1
    iget-object v0, p0, Lcom/zykj/view/simpleBoard/a;->c:Lj7/d;

    .line 42
    .line 43
    invoke-interface {v0}, Lj7/d;->c()V

    .line 44
    .line 45
    .line 46
    const/4 v0, 0x1

    .line 47
    return v0

    .line 48
    :cond_2
    :goto_0
    const/4 v0, 0x0

    .line 49
    return v0
.end method

.method public final h0(Li7/k;)V
    .locals 5

    .line 1
    invoke-virtual {p1}, Li7/k;->b()Landroid/graphics/Path;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {p1}, Li7/k;->d()Landroid/graphics/RectF;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    const/4 v2, 0x1

    .line 10
    invoke-virtual {v0, v1, v2}, Landroid/graphics/Path;->computeBounds(Landroid/graphics/RectF;Z)V

    .line 11
    .line 12
    .line 13
    iget-object v0, p0, Lcom/zykj/view/simpleBoard/a;->b:Landroid/graphics/Matrix;

    .line 14
    .line 15
    invoke-static {v0}, Lu5/n;->b(Landroid/graphics/Matrix;)Landroid/graphics/Matrix;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    iget-object v1, p0, Lcom/zykj/view/simpleBoard/a;->a:Lh7/c;

    .line 20
    .line 21
    invoke-virtual {v1}, Lh7/c;->d()F

    .line 22
    .line 23
    .line 24
    move-result v1

    .line 25
    invoke-virtual {v0, v1}, Landroid/graphics/Matrix;->mapRadius(F)F

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    invoke-virtual {p1}, Li7/k;->d()Landroid/graphics/RectF;

    .line 30
    .line 31
    .line 32
    move-result-object v1

    .line 33
    invoke-virtual {v1}, Landroid/graphics/RectF;->width()F

    .line 34
    .line 35
    .line 36
    move-result v1

    .line 37
    const/4 v2, 0x2

    .line 38
    int-to-float v2, v2

    .line 39
    mul-float/2addr v2, v0

    .line 40
    cmpg-float v1, v1, v2

    .line 41
    .line 42
    const/4 v3, 0x0

    .line 43
    if-gez v1, :cond_0

    .line 44
    .line 45
    invoke-virtual {p1}, Li7/k;->d()Landroid/graphics/RectF;

    .line 46
    .line 47
    .line 48
    move-result-object v1

    .line 49
    neg-float v4, v0

    .line 50
    invoke-virtual {v1, v4, v3}, Landroid/graphics/RectF;->inset(FF)V

    .line 51
    .line 52
    .line 53
    :cond_0
    invoke-virtual {p1}, Li7/k;->d()Landroid/graphics/RectF;

    .line 54
    .line 55
    .line 56
    move-result-object v1

    .line 57
    invoke-virtual {v1}, Landroid/graphics/RectF;->height()F

    .line 58
    .line 59
    .line 60
    move-result v1

    .line 61
    cmpg-float v1, v1, v2

    .line 62
    .line 63
    if-gez v1, :cond_1

    .line 64
    .line 65
    invoke-virtual {p1}, Li7/k;->d()Landroid/graphics/RectF;

    .line 66
    .line 67
    .line 68
    move-result-object p1

    .line 69
    neg-float v0, v0

    .line 70
    invoke-virtual {p1, v3, v0}, Landroid/graphics/RectF;->inset(FF)V

    .line 71
    .line 72
    .line 73
    :cond_1
    return-void
.end method

.method public final i(Landroid/graphics/PointF;Landroid/graphics/PointF;)F
    .locals 2

    .line 1
    iget v0, p1, Landroid/graphics/PointF;->x:F

    .line 2
    .line 3
    iget v1, p2, Landroid/graphics/PointF;->x:F

    .line 4
    .line 5
    sub-float/2addr v0, v1

    .line 6
    iget p1, p1, Landroid/graphics/PointF;->y:F

    .line 7
    .line 8
    iget p2, p2, Landroid/graphics/PointF;->y:F

    .line 9
    .line 10
    sub-float/2addr p1, p2

    .line 11
    mul-float/2addr v0, v0

    .line 12
    mul-float/2addr p1, p1

    .line 13
    add-float/2addr v0, p1

    .line 14
    float-to-double p1, v0

    .line 15
    invoke-static {p1, p2}, Ljava/lang/Math;->sqrt(D)D

    .line 16
    .line 17
    .line 18
    move-result-wide p1

    .line 19
    double-to-float p1, p1

    .line 20
    return p1
.end method

.method public final j(Landroid/graphics/Canvas;)V
    .locals 3

    .line 1
    const-string v0, "canvas"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/zykj/view/simpleBoard/a;->d:Landroid/graphics/Bitmap;

    .line 7
    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    iget-object v1, p0, Lcom/zykj/view/simpleBoard/a;->v:Landroid/graphics/Matrix;

    .line 11
    .line 12
    iget-object v2, p0, Lcom/zykj/view/simpleBoard/a;->f:Landroid/graphics/Matrix;

    .line 13
    .line 14
    invoke-virtual {v1, v2}, Landroid/graphics/Matrix;->set(Landroid/graphics/Matrix;)V

    .line 15
    .line 16
    .line 17
    iget-object v1, p0, Lcom/zykj/view/simpleBoard/a;->v:Landroid/graphics/Matrix;

    .line 18
    .line 19
    iget-object v2, p0, Lcom/zykj/view/simpleBoard/a;->b:Landroid/graphics/Matrix;

    .line 20
    .line 21
    invoke-virtual {v1, v2}, Landroid/graphics/Matrix;->postConcat(Landroid/graphics/Matrix;)Z

    .line 22
    .line 23
    .line 24
    sget-object v1, Lu5/e;->a:Lu5/e;

    .line 25
    .line 26
    iget-object v2, p0, Lcom/zykj/view/simpleBoard/a;->v:Landroid/graphics/Matrix;

    .line 27
    .line 28
    invoke-virtual {v1, p1, v0, v2}, Lu5/e;->a(Landroid/graphics/Canvas;Landroid/graphics/Bitmap;Landroid/graphics/Matrix;)V

    .line 29
    .line 30
    .line 31
    return-void

    .line 32
    :cond_0
    const/4 v0, -0x1

    .line 33
    invoke-virtual {p1, v0}, Landroid/graphics/Canvas;->drawColor(I)V

    .line 34
    .line 35
    .line 36
    return-void
.end method

.method public final k(Landroid/graphics/Canvas;Landroid/graphics/RectF;I)V
    .locals 9

    .line 1
    iget-object v0, p0, Lcom/zykj/view/simpleBoard/a;->A:Landroid/graphics/Paint;

    .line 2
    .line 3
    sget-object v1, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, Lcom/zykj/view/simpleBoard/a;->A:Landroid/graphics/Paint;

    .line 9
    .line 10
    const/high16 v1, 0x40000000    # 2.0f

    .line 11
    .line 12
    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 13
    .line 14
    .line 15
    iget-object v0, p0, Lcom/zykj/view/simpleBoard/a;->A:Landroid/graphics/Paint;

    .line 16
    .line 17
    invoke-virtual {p0, p3}, Lcom/zykj/view/simpleBoard/a;->N(I)Z

    .line 18
    .line 19
    .line 20
    move-result p3

    .line 21
    if-eqz p3, :cond_0

    .line 22
    .line 23
    const/high16 p3, -0x1000000

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_0
    const/4 p3, -0x1

    .line 27
    :goto_0
    invoke-virtual {v0, p3}, Landroid/graphics/Paint;->setColor(I)V

    .line 28
    .line 29
    .line 30
    invoke-virtual {p2}, Landroid/graphics/RectF;->centerX()F

    .line 31
    .line 32
    .line 33
    move-result p3

    .line 34
    invoke-virtual {p2}, Landroid/graphics/RectF;->centerY()F

    .line 35
    .line 36
    .line 37
    move-result v2

    .line 38
    const/high16 p2, 0x40c00000    # 6.0f

    .line 39
    .line 40
    sub-float v1, p3, p2

    .line 41
    .line 42
    const/high16 p2, 0x3f800000    # 1.0f

    .line 43
    .line 44
    sub-float v3, p3, p2

    .line 45
    .line 46
    const/high16 p2, 0x40a00000    # 5.0f

    .line 47
    .line 48
    add-float v4, v2, p2

    .line 49
    .line 50
    iget-object v5, p0, Lcom/zykj/view/simpleBoard/a;->A:Landroid/graphics/Paint;

    .line 51
    .line 52
    move-object v0, p1

    .line 53
    invoke-virtual/range {v0 .. v5}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    .line 54
    .line 55
    .line 56
    const/high16 p1, 0x40e00000    # 7.0f

    .line 57
    .line 58
    add-float v6, p3, p1

    .line 59
    .line 60
    sub-float v7, v2, p2

    .line 61
    .line 62
    iget-object v8, p0, Lcom/zykj/view/simpleBoard/a;->A:Landroid/graphics/Paint;

    .line 63
    .line 64
    move v5, v4

    .line 65
    move v4, v3

    .line 66
    move-object v3, v0

    .line 67
    invoke-virtual/range {v3 .. v8}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    .line 68
    .line 69
    .line 70
    invoke-virtual {p0}, Lcom/zykj/view/simpleBoard/a;->S()V

    .line 71
    .line 72
    .line 73
    return-void
.end method

.method public final l(Landroid/graphics/Canvas;)V
    .locals 6

    .line 1
    const-string v0, "canvas"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/zykj/view/simpleBoard/a;->v:Landroid/graphics/Matrix;

    .line 7
    .line 8
    iget-object v1, p0, Lcom/zykj/view/simpleBoard/a;->b:Landroid/graphics/Matrix;

    .line 9
    .line 10
    invoke-virtual {v0, v1}, Landroid/graphics/Matrix;->set(Landroid/graphics/Matrix;)V

    .line 11
    .line 12
    .line 13
    iget-object v0, p0, Lcom/zykj/view/simpleBoard/a;->g:Ljava/util/ArrayList;

    .line 14
    .line 15
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    const/4 v2, 0x0

    .line 20
    :goto_0
    if-ge v2, v1, :cond_0

    .line 21
    .line 22
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object v3

    .line 26
    add-int/lit8 v2, v2, 0x1

    .line 27
    .line 28
    check-cast v3, Li7/k;

    .line 29
    .line 30
    iget-object v4, p0, Lcom/zykj/view/simpleBoard/a;->u:Landroid/graphics/Path;

    .line 31
    .line 32
    invoke-virtual {v3}, Li7/k;->b()Landroid/graphics/Path;

    .line 33
    .line 34
    .line 35
    move-result-object v5

    .line 36
    invoke-virtual {v4, v5}, Landroid/graphics/Path;->set(Landroid/graphics/Path;)V

    .line 37
    .line 38
    .line 39
    iget-object v4, p0, Lcom/zykj/view/simpleBoard/a;->u:Landroid/graphics/Path;

    .line 40
    .line 41
    iget-object v5, p0, Lcom/zykj/view/simpleBoard/a;->v:Landroid/graphics/Matrix;

    .line 42
    .line 43
    invoke-virtual {v4, v5}, Landroid/graphics/Path;->transform(Landroid/graphics/Matrix;)V

    .line 44
    .line 45
    .line 46
    iget-object v4, p0, Lcom/zykj/view/simpleBoard/a;->u:Landroid/graphics/Path;

    .line 47
    .line 48
    invoke-virtual {v3}, Li7/k;->a()Landroid/graphics/Paint;

    .line 49
    .line 50
    .line 51
    move-result-object v3

    .line 52
    invoke-virtual {p1, v4, v3}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    .line 53
    .line 54
    .line 55
    goto :goto_0

    .line 56
    :cond_0
    return-void
.end method

.method public final m(Landroid/graphics/Canvas;Landroid/graphics/PointF;)V
    .locals 19

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p2

    .line 4
    .line 5
    const/4 v2, 0x2

    .line 6
    int-to-float v2, v2

    .line 7
    const/high16 v3, 0x41900000    # 18.0f

    .line 8
    .line 9
    mul-float v4, v2, v3

    .line 10
    .line 11
    const/4 v5, 0x3

    .line 12
    int-to-float v5, v5

    .line 13
    div-float/2addr v4, v5

    .line 14
    div-float v5, v3, v2

    .line 15
    .line 16
    new-instance v7, Landroid/graphics/RectF;

    .line 17
    .line 18
    iget v6, v1, Landroid/graphics/PointF;->x:F

    .line 19
    .line 20
    sub-float v8, v6, v3

    .line 21
    .line 22
    iget v9, v1, Landroid/graphics/PointF;->y:F

    .line 23
    .line 24
    sub-float v10, v9, v3

    .line 25
    .line 26
    add-float/2addr v6, v3

    .line 27
    add-float/2addr v9, v3

    .line 28
    invoke-direct {v7, v8, v10, v6, v9}, Landroid/graphics/RectF;-><init>(FFFF)V

    .line 29
    .line 30
    .line 31
    const/4 v10, 0x0

    .line 32
    iget-object v11, v0, Lcom/zykj/view/simpleBoard/a;->A:Landroid/graphics/Paint;

    .line 33
    .line 34
    const/high16 v8, 0x41f00000    # 30.0f

    .line 35
    .line 36
    const/high16 v9, 0x42f00000    # 120.0f

    .line 37
    .line 38
    move-object/from16 v6, p1

    .line 39
    .line 40
    invoke-virtual/range {v6 .. v11}, Landroid/graphics/Canvas;->drawArc(Landroid/graphics/RectF;FFZLandroid/graphics/Paint;)V

    .line 41
    .line 42
    .line 43
    iget v3, v1, Landroid/graphics/PointF;->x:F

    .line 44
    .line 45
    const v6, 0x3fddb3d0

    .line 46
    .line 47
    .line 48
    mul-float v18, v5, v6

    .line 49
    .line 50
    sub-float v13, v3, v18

    .line 51
    .line 52
    iget v6, v1, Landroid/graphics/PointF;->y:F

    .line 53
    .line 54
    sub-float v8, v6, v5

    .line 55
    .line 56
    div-float/2addr v4, v2

    .line 57
    sub-float v14, v8, v4

    .line 58
    .line 59
    sub-float v15, v3, v18

    .line 60
    .line 61
    sub-float v16, v6, v5

    .line 62
    .line 63
    iget-object v2, v0, Lcom/zykj/view/simpleBoard/a;->A:Landroid/graphics/Paint;

    .line 64
    .line 65
    move-object/from16 v12, p1

    .line 66
    .line 67
    move-object/from16 v17, v2

    .line 68
    .line 69
    invoke-virtual/range {v12 .. v17}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    .line 70
    .line 71
    .line 72
    iget v2, v1, Landroid/graphics/PointF;->x:F

    .line 73
    .line 74
    sub-float v13, v2, v18

    .line 75
    .line 76
    iget v3, v1, Landroid/graphics/PointF;->y:F

    .line 77
    .line 78
    sub-float v14, v3, v5

    .line 79
    .line 80
    sub-float v2, v2, v18

    .line 81
    .line 82
    add-float v15, v2, v4

    .line 83
    .line 84
    sub-float v16, v3, v5

    .line 85
    .line 86
    iget-object v2, v0, Lcom/zykj/view/simpleBoard/a;->A:Landroid/graphics/Paint;

    .line 87
    .line 88
    move-object/from16 v17, v2

    .line 89
    .line 90
    invoke-virtual/range {v12 .. v17}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    .line 91
    .line 92
    .line 93
    iget-object v11, v0, Lcom/zykj/view/simpleBoard/a;->A:Landroid/graphics/Paint;

    .line 94
    .line 95
    const/high16 v8, -0x3cea0000    # -150.0f

    .line 96
    .line 97
    move-object/from16 v6, p1

    .line 98
    .line 99
    invoke-virtual/range {v6 .. v11}, Landroid/graphics/Canvas;->drawArc(Landroid/graphics/RectF;FFZLandroid/graphics/Paint;)V

    .line 100
    .line 101
    .line 102
    iget v2, v1, Landroid/graphics/PointF;->x:F

    .line 103
    .line 104
    add-float v13, v2, v18

    .line 105
    .line 106
    iget v3, v1, Landroid/graphics/PointF;->y:F

    .line 107
    .line 108
    add-float v6, v3, v5

    .line 109
    .line 110
    add-float v14, v6, v4

    .line 111
    .line 112
    add-float v15, v2, v18

    .line 113
    .line 114
    add-float v16, v3, v5

    .line 115
    .line 116
    iget-object v2, v0, Lcom/zykj/view/simpleBoard/a;->A:Landroid/graphics/Paint;

    .line 117
    .line 118
    move-object/from16 v17, v2

    .line 119
    .line 120
    invoke-virtual/range {v12 .. v17}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    .line 121
    .line 122
    .line 123
    iget v2, v1, Landroid/graphics/PointF;->x:F

    .line 124
    .line 125
    add-float v13, v2, v18

    .line 126
    .line 127
    iget v3, v1, Landroid/graphics/PointF;->y:F

    .line 128
    .line 129
    add-float v14, v3, v5

    .line 130
    .line 131
    add-float v2, v2, v18

    .line 132
    .line 133
    sub-float v15, v2, v4

    .line 134
    .line 135
    add-float v16, v3, v5

    .line 136
    .line 137
    iget-object v2, v0, Lcom/zykj/view/simpleBoard/a;->A:Landroid/graphics/Paint;

    .line 138
    .line 139
    move-object/from16 v17, v2

    .line 140
    .line 141
    invoke-virtual/range {v12 .. v17}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    .line 142
    .line 143
    .line 144
    iget v2, v1, Landroid/graphics/PointF;->x:F

    .line 145
    .line 146
    sub-float v13, v2, v4

    .line 147
    .line 148
    iget v1, v1, Landroid/graphics/PointF;->y:F

    .line 149
    .line 150
    sub-float v14, v1, v4

    .line 151
    .line 152
    add-float v15, v2, v4

    .line 153
    .line 154
    add-float v16, v1, v4

    .line 155
    .line 156
    iget-object v1, v0, Lcom/zykj/view/simpleBoard/a;->A:Landroid/graphics/Paint;

    .line 157
    .line 158
    move-object/from16 v17, v1

    .line 159
    .line 160
    invoke-virtual/range {v12 .. v17}, Landroid/graphics/Canvas;->drawRect(FFFFLandroid/graphics/Paint;)V

    .line 161
    .line 162
    .line 163
    return-void
.end method

.method public final n(Landroid/graphics/Canvas;Landroid/graphics/PointF;)V
    .locals 11

    .line 1
    iget v1, p2, Landroid/graphics/PointF;->x:F

    .line 2
    .line 3
    iget v2, p2, Landroid/graphics/PointF;->y:F

    .line 4
    .line 5
    iget-object v3, p0, Lcom/zykj/view/simpleBoard/a;->A:Landroid/graphics/Paint;

    .line 6
    .line 7
    const/high16 v4, 0x41c00000    # 24.0f

    .line 8
    .line 9
    invoke-virtual {p1, v1, v2, v4, v3}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    .line 10
    .line 11
    .line 12
    const/4 v1, 0x2

    .line 13
    int-to-float v1, v1

    .line 14
    div-float/2addr v4, v1

    .line 15
    iget v1, p2, Landroid/graphics/PointF;->x:F

    .line 16
    .line 17
    sub-float v6, v1, v4

    .line 18
    .line 19
    iget v2, p2, Landroid/graphics/PointF;->y:F

    .line 20
    .line 21
    sub-float v7, v2, v4

    .line 22
    .line 23
    add-float v8, v1, v4

    .line 24
    .line 25
    add-float v9, v2, v4

    .line 26
    .line 27
    iget-object v10, p0, Lcom/zykj/view/simpleBoard/a;->A:Landroid/graphics/Paint;

    .line 28
    .line 29
    move-object v5, p1

    .line 30
    invoke-virtual/range {v5 .. v10}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    .line 31
    .line 32
    .line 33
    iget v1, p2, Landroid/graphics/PointF;->x:F

    .line 34
    .line 35
    sub-float v6, v1, v4

    .line 36
    .line 37
    iget v7, p2, Landroid/graphics/PointF;->y:F

    .line 38
    .line 39
    sub-float v8, v1, v4

    .line 40
    .line 41
    sub-float v9, v7, v4

    .line 42
    .line 43
    iget-object v10, p0, Lcom/zykj/view/simpleBoard/a;->A:Landroid/graphics/Paint;

    .line 44
    .line 45
    invoke-virtual/range {v5 .. v10}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    .line 46
    .line 47
    .line 48
    iget v8, p2, Landroid/graphics/PointF;->x:F

    .line 49
    .line 50
    sub-float v6, v8, v4

    .line 51
    .line 52
    iget v1, p2, Landroid/graphics/PointF;->y:F

    .line 53
    .line 54
    sub-float v7, v1, v4

    .line 55
    .line 56
    sub-float v9, v1, v4

    .line 57
    .line 58
    iget-object v10, p0, Lcom/zykj/view/simpleBoard/a;->A:Landroid/graphics/Paint;

    .line 59
    .line 60
    invoke-virtual/range {v5 .. v10}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    .line 61
    .line 62
    .line 63
    iget v1, p2, Landroid/graphics/PointF;->x:F

    .line 64
    .line 65
    add-float v6, v1, v4

    .line 66
    .line 67
    iget v7, p2, Landroid/graphics/PointF;->y:F

    .line 68
    .line 69
    add-float v8, v1, v4

    .line 70
    .line 71
    add-float v9, v7, v4

    .line 72
    .line 73
    iget-object v10, p0, Lcom/zykj/view/simpleBoard/a;->A:Landroid/graphics/Paint;

    .line 74
    .line 75
    invoke-virtual/range {v5 .. v10}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    .line 76
    .line 77
    .line 78
    iget v8, p2, Landroid/graphics/PointF;->x:F

    .line 79
    .line 80
    add-float v6, v8, v4

    .line 81
    .line 82
    iget v0, p2, Landroid/graphics/PointF;->y:F

    .line 83
    .line 84
    add-float v7, v0, v4

    .line 85
    .line 86
    add-float v9, v0, v4

    .line 87
    .line 88
    iget-object v10, p0, Lcom/zykj/view/simpleBoard/a;->A:Landroid/graphics/Paint;

    .line 89
    .line 90
    invoke-virtual/range {v5 .. v10}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    .line 91
    .line 92
    .line 93
    return-void
.end method

.method public final o(Landroid/graphics/Canvas;Landroid/graphics/RectF;Ljava/lang/String;Z)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/zykj/view/simpleBoard/a;->B:Landroid/graphics/Paint;

    .line 2
    .line 3
    const/high16 v1, 0x41c80000    # 25.0f

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setTextSize(F)V

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, Lcom/zykj/view/simpleBoard/a;->B:Landroid/graphics/Paint;

    .line 9
    .line 10
    if-eqz p4, :cond_0

    .line 11
    .line 12
    const p4, -0xea8901

    .line 13
    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    const/4 p4, -0x1

    .line 17
    :goto_0
    invoke-virtual {v0, p4}, Landroid/graphics/Paint;->setColor(I)V

    .line 18
    .line 19
    .line 20
    invoke-virtual {p2}, Landroid/graphics/RectF;->centerY()F

    .line 21
    .line 22
    .line 23
    move-result p4

    .line 24
    iget-object v0, p0, Lcom/zykj/view/simpleBoard/a;->B:Landroid/graphics/Paint;

    .line 25
    .line 26
    invoke-virtual {v0}, Landroid/graphics/Paint;->ascent()F

    .line 27
    .line 28
    .line 29
    move-result v0

    .line 30
    iget-object v1, p0, Lcom/zykj/view/simpleBoard/a;->B:Landroid/graphics/Paint;

    .line 31
    .line 32
    invoke-virtual {v1}, Landroid/graphics/Paint;->descent()F

    .line 33
    .line 34
    .line 35
    move-result v1

    .line 36
    add-float/2addr v0, v1

    .line 37
    const/4 v1, 0x2

    .line 38
    int-to-float v1, v1

    .line 39
    div-float/2addr v0, v1

    .line 40
    sub-float/2addr p4, v0

    .line 41
    invoke-virtual {p2}, Landroid/graphics/RectF;->centerX()F

    .line 42
    .line 43
    .line 44
    move-result p2

    .line 45
    iget-object v0, p0, Lcom/zykj/view/simpleBoard/a;->B:Landroid/graphics/Paint;

    .line 46
    .line 47
    invoke-virtual {p1, p3, p2, p4, v0}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V

    .line 48
    .line 49
    .line 50
    return-void
.end method

.method public final p(Landroid/graphics/Canvas;Landroid/graphics/RectF;)V
    .locals 12

    .line 1
    iget v1, p2, Landroid/graphics/RectF;->left:F

    .line 2
    .line 3
    iget v2, p2, Landroid/graphics/RectF;->top:F

    .line 4
    .line 5
    iget v3, p2, Landroid/graphics/RectF;->right:F

    .line 6
    .line 7
    iget-object v5, p0, Lcom/zykj/view/simpleBoard/a;->A:Landroid/graphics/Paint;

    .line 8
    .line 9
    move v4, v2

    .line 10
    move-object v0, p1

    .line 11
    invoke-virtual/range {v0 .. v5}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    .line 12
    .line 13
    .line 14
    move-object v6, v0

    .line 15
    iget v7, p2, Landroid/graphics/RectF;->left:F

    .line 16
    .line 17
    iget v8, p2, Landroid/graphics/RectF;->top:F

    .line 18
    .line 19
    iget v10, p2, Landroid/graphics/RectF;->bottom:F

    .line 20
    .line 21
    iget-object v11, p0, Lcom/zykj/view/simpleBoard/a;->A:Landroid/graphics/Paint;

    .line 22
    .line 23
    move v9, v7

    .line 24
    invoke-virtual/range {v6 .. v11}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    .line 25
    .line 26
    .line 27
    iget-object p1, p0, Lcom/zykj/view/simpleBoard/a;->q:Lh7/d;

    .line 28
    .line 29
    invoke-virtual {p1}, Lh7/d;->f()Z

    .line 30
    .line 31
    .line 32
    move-result p1

    .line 33
    if-eqz p1, :cond_0

    .line 34
    .line 35
    iget v7, p2, Landroid/graphics/RectF;->right:F

    .line 36
    .line 37
    iget v8, p2, Landroid/graphics/RectF;->top:F

    .line 38
    .line 39
    iget p1, p2, Landroid/graphics/RectF;->bottom:F

    .line 40
    .line 41
    const/high16 v0, 0x41c00000    # 24.0f

    .line 42
    .line 43
    sub-float v10, p1, v0

    .line 44
    .line 45
    iget-object v11, p0, Lcom/zykj/view/simpleBoard/a;->A:Landroid/graphics/Paint;

    .line 46
    .line 47
    move v9, v7

    .line 48
    invoke-virtual/range {v6 .. v11}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    .line 49
    .line 50
    .line 51
    iget v7, p2, Landroid/graphics/RectF;->left:F

    .line 52
    .line 53
    iget v8, p2, Landroid/graphics/RectF;->bottom:F

    .line 54
    .line 55
    iget p1, p2, Landroid/graphics/RectF;->right:F

    .line 56
    .line 57
    sub-float v9, p1, v0

    .line 58
    .line 59
    iget-object v11, p0, Lcom/zykj/view/simpleBoard/a;->A:Landroid/graphics/Paint;

    .line 60
    .line 61
    move v10, v8

    .line 62
    invoke-virtual/range {v6 .. v11}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    .line 63
    .line 64
    .line 65
    return-void

    .line 66
    :cond_0
    iget v7, p2, Landroid/graphics/RectF;->right:F

    .line 67
    .line 68
    iget v8, p2, Landroid/graphics/RectF;->top:F

    .line 69
    .line 70
    iget v10, p2, Landroid/graphics/RectF;->bottom:F

    .line 71
    .line 72
    iget-object v11, p0, Lcom/zykj/view/simpleBoard/a;->A:Landroid/graphics/Paint;

    .line 73
    .line 74
    move v9, v7

    .line 75
    invoke-virtual/range {v6 .. v11}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    .line 76
    .line 77
    .line 78
    iget v7, p2, Landroid/graphics/RectF;->left:F

    .line 79
    .line 80
    iget v8, p2, Landroid/graphics/RectF;->bottom:F

    .line 81
    .line 82
    iget v9, p2, Landroid/graphics/RectF;->right:F

    .line 83
    .line 84
    iget-object v11, p0, Lcom/zykj/view/simpleBoard/a;->A:Landroid/graphics/Paint;

    .line 85
    .line 86
    move v10, v8

    .line 87
    invoke-virtual/range {v6 .. v11}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    .line 88
    .line 89
    .line 90
    return-void
.end method

.method public final q(Landroid/graphics/Canvas;Landroid/graphics/RectF;)V
    .locals 8

    .line 1
    invoke-virtual {p0, p1, p2}, Lcom/zykj/view/simpleBoard/a;->p(Landroid/graphics/Canvas;Landroid/graphics/RectF;)V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0, p2}, Lcom/zykj/view/simpleBoard/a;->V(Landroid/graphics/RectF;)Ljava/util/List;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    const/4 v1, 0x0

    .line 13
    move v2, v1

    .line 14
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 15
    .line 16
    .line 17
    move-result v3

    .line 18
    if-eqz v3, :cond_2

    .line 19
    .line 20
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object v3

    .line 24
    add-int/lit8 v4, v2, 0x1

    .line 25
    .line 26
    if-gez v2, :cond_0

    .line 27
    .line 28
    invoke-static {}, Lkotlin/collections/CollectionsKt;->throwIndexOverflow()V

    .line 29
    .line 30
    .line 31
    :cond_0
    check-cast v3, Landroid/graphics/PointF;

    .line 32
    .line 33
    sget-object v5, Lcom/zykj/view/simpleBoard/SelectionTarget;->a:Lcom/zykj/view/simpleBoard/SelectionTarget$a;

    .line 34
    .line 35
    invoke-virtual {v5}, Lcom/zykj/view/simpleBoard/SelectionTarget$a;->b()Ljava/util/List;

    .line 36
    .line 37
    .line 38
    move-result-object v5

    .line 39
    invoke-interface {v5, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object v2

    .line 43
    check-cast v2, Lcom/zykj/view/simpleBoard/SelectionTarget;

    .line 44
    .line 45
    iget-object v5, p0, Lcom/zykj/view/simpleBoard/a;->q:Lh7/d;

    .line 46
    .line 47
    invoke-virtual {v2, v5}, Lcom/zykj/view/simpleBoard/SelectionTarget;->n(Lh7/d;)Z

    .line 48
    .line 49
    .line 50
    move-result v5

    .line 51
    if-eqz v5, :cond_1

    .line 52
    .line 53
    sget-object v5, Lcom/zykj/view/simpleBoard/a$b;->a:[I

    .line 54
    .line 55
    invoke-virtual {v2}, Ljava/lang/Enum;->ordinal()I

    .line 56
    .line 57
    .line 58
    move-result v2

    .line 59
    aget v2, v5, v2

    .line 60
    .line 61
    packed-switch v2, :pswitch_data_0

    .line 62
    .line 63
    .line 64
    goto :goto_1

    .line 65
    :pswitch_0
    invoke-virtual {p0, p1, v3}, Lcom/zykj/view/simpleBoard/a;->r(Landroid/graphics/Canvas;Landroid/graphics/PointF;)V

    .line 66
    .line 67
    .line 68
    goto :goto_1

    .line 69
    :pswitch_1
    invoke-virtual {p0, p1, v3}, Lcom/zykj/view/simpleBoard/a;->n(Landroid/graphics/Canvas;Landroid/graphics/PointF;)V

    .line 70
    .line 71
    .line 72
    :cond_1
    :goto_1
    move v2, v4

    .line 73
    goto :goto_0

    .line 74
    :cond_2
    iget-object v0, p0, Lcom/zykj/view/simpleBoard/a;->q:Lh7/d;

    .line 75
    .line 76
    invoke-virtual {v0}, Lh7/d;->e()Z

    .line 77
    .line 78
    .line 79
    move-result v0

    .line 80
    if-eqz v0, :cond_3

    .line 81
    .line 82
    invoke-virtual {p0, p2}, Lcom/zykj/view/simpleBoard/a;->T(Landroid/graphics/RectF;)Landroid/graphics/PointF;

    .line 83
    .line 84
    .line 85
    move-result-object v0

    .line 86
    invoke-virtual {p2}, Landroid/graphics/RectF;->centerX()F

    .line 87
    .line 88
    .line 89
    move-result v3

    .line 90
    iget v4, p2, Landroid/graphics/RectF;->top:F

    .line 91
    .line 92
    invoke-virtual {p2}, Landroid/graphics/RectF;->centerX()F

    .line 93
    .line 94
    .line 95
    move-result v5

    .line 96
    iget v2, v0, Landroid/graphics/PointF;->y:F

    .line 97
    .line 98
    const/high16 v6, 0x41900000    # 18.0f

    .line 99
    .line 100
    add-float/2addr v6, v2

    .line 101
    iget-object v7, p0, Lcom/zykj/view/simpleBoard/a;->A:Landroid/graphics/Paint;

    .line 102
    .line 103
    move-object v2, p1

    .line 104
    invoke-virtual/range {v2 .. v7}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    .line 105
    .line 106
    .line 107
    invoke-virtual {p0, v2, v0}, Lcom/zykj/view/simpleBoard/a;->m(Landroid/graphics/Canvas;Landroid/graphics/PointF;)V

    .line 108
    .line 109
    .line 110
    goto :goto_2

    .line 111
    :cond_3
    move-object v2, p1

    .line 112
    :goto_2
    invoke-virtual {p0, p2}, Lcom/zykj/view/simpleBoard/a;->U(Landroid/graphics/RectF;)Lh7/b;

    .line 113
    .line 114
    .line 115
    move-result-object p1

    .line 116
    new-instance v0, Landroid/graphics/RectF;

    .line 117
    .line 118
    invoke-virtual {p1}, Lh7/b;->b()Landroid/graphics/RectF;

    .line 119
    .line 120
    .line 121
    move-result-object v3

    .line 122
    invoke-direct {v0, v3}, Landroid/graphics/RectF;-><init>(Landroid/graphics/RectF;)V

    .line 123
    .line 124
    .line 125
    invoke-virtual {p1}, Lh7/b;->a()Landroid/graphics/RectF;

    .line 126
    .line 127
    .line 128
    move-result-object v3

    .line 129
    invoke-virtual {v0, v3}, Landroid/graphics/RectF;->union(Landroid/graphics/RectF;)V

    .line 130
    .line 131
    .line 132
    const/high16 v3, -0x3f000000    # -8.0f

    .line 133
    .line 134
    const/4 v4, 0x0

    .line 135
    invoke-virtual {v0, v3, v4}, Landroid/graphics/RectF;->inset(FF)V

    .line 136
    .line 137
    .line 138
    iget-object v3, p0, Lcom/zykj/view/simpleBoard/a;->C:Landroid/graphics/Paint;

    .line 139
    .line 140
    const/high16 v4, 0x40c00000    # 6.0f

    .line 141
    .line 142
    invoke-virtual {v2, v0, v4, v4, v3}, Landroid/graphics/Canvas;->drawRoundRect(Landroid/graphics/RectF;FFLandroid/graphics/Paint;)V

    .line 143
    .line 144
    .line 145
    iget-object v0, p0, Lcom/zykj/view/simpleBoard/a;->q:Lh7/d;

    .line 146
    .line 147
    invoke-virtual {v0}, Lh7/d;->a()Z

    .line 148
    .line 149
    .line 150
    move-result v0

    .line 151
    if-eqz v0, :cond_4

    .line 152
    .line 153
    invoke-virtual {p1}, Lh7/b;->a()Landroid/graphics/RectF;

    .line 154
    .line 155
    .line 156
    move-result-object v0

    .line 157
    const-string v3, "\u5220\u9664"

    .line 158
    .line 159
    invoke-virtual {p0, v2, v0, v3, v1}, Lcom/zykj/view/simpleBoard/a;->o(Landroid/graphics/Canvas;Landroid/graphics/RectF;Ljava/lang/String;Z)V

    .line 160
    .line 161
    .line 162
    :cond_4
    iget-object v0, p0, Lcom/zykj/view/simpleBoard/a;->q:Lh7/d;

    .line 163
    .line 164
    invoke-virtual {v0}, Lh7/d;->b()Z

    .line 165
    .line 166
    .line 167
    move-result v0

    .line 168
    if-nez v0, :cond_5

    .line 169
    .line 170
    iget-object v0, p0, Lcom/zykj/view/simpleBoard/a;->q:Lh7/d;

    .line 171
    .line 172
    invoke-virtual {v0}, Lh7/d;->c()Z

    .line 173
    .line 174
    .line 175
    move-result v0

    .line 176
    if-eqz v0, :cond_6

    .line 177
    .line 178
    :cond_5
    invoke-virtual {p1}, Lh7/b;->b()Landroid/graphics/RectF;

    .line 179
    .line 180
    .line 181
    move-result-object p1

    .line 182
    const-string v0, "\u7f16\u8f91"

    .line 183
    .line 184
    iget-boolean v1, p0, Lcom/zykj/view/simpleBoard/a;->p:Z

    .line 185
    .line 186
    invoke-virtual {p0, v2, p1, v0, v1}, Lcom/zykj/view/simpleBoard/a;->o(Landroid/graphics/Canvas;Landroid/graphics/RectF;Ljava/lang/String;Z)V

    .line 187
    .line 188
    .line 189
    :cond_6
    iget-boolean p1, p0, Lcom/zykj/view/simpleBoard/a;->p:Z

    .line 190
    .line 191
    if-eqz p1, :cond_7

    .line 192
    .line 193
    invoke-virtual {p0, v2, p2}, Lcom/zykj/view/simpleBoard/a;->s(Landroid/graphics/Canvas;Landroid/graphics/RectF;)V

    .line 194
    .line 195
    .line 196
    :cond_7
    return-void

    .line 197
    :pswitch_data_0
    .packed-switch 0x5
        :pswitch_1
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method

.method public final r(Landroid/graphics/Canvas;Landroid/graphics/PointF;)V
    .locals 8

    .line 1
    iget-object v0, p0, Lcom/zykj/view/simpleBoard/a;->A:Landroid/graphics/Paint;

    .line 2
    .line 3
    sget-object v1, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 6
    .line 7
    .line 8
    iget v0, p2, Landroid/graphics/PointF;->x:F

    .line 9
    .line 10
    const/high16 v1, 0x40900000    # 4.5f

    .line 11
    .line 12
    sub-float v3, v0, v1

    .line 13
    .line 14
    iget p2, p2, Landroid/graphics/PointF;->y:F

    .line 15
    .line 16
    sub-float v4, p2, v1

    .line 17
    .line 18
    add-float v5, v0, v1

    .line 19
    .line 20
    add-float v6, p2, v1

    .line 21
    .line 22
    iget-object v7, p0, Lcom/zykj/view/simpleBoard/a;->A:Landroid/graphics/Paint;

    .line 23
    .line 24
    move-object v2, p1

    .line 25
    invoke-virtual/range {v2 .. v7}, Landroid/graphics/Canvas;->drawRect(FFFFLandroid/graphics/Paint;)V

    .line 26
    .line 27
    .line 28
    invoke-virtual {p0}, Lcom/zykj/view/simpleBoard/a;->S()V

    .line 29
    .line 30
    .line 31
    return-void
.end method

.method public final s(Landroid/graphics/Canvas;Landroid/graphics/RectF;)V
    .locals 9

    .line 1
    invoke-virtual {p0, p2}, Lcom/zykj/view/simpleBoard/a;->c0(Landroid/graphics/RectF;)Landroid/graphics/RectF;

    .line 2
    .line 3
    .line 4
    move-result-object p2

    .line 5
    invoke-virtual {p0, p2}, Lcom/zykj/view/simpleBoard/a;->d0(Landroid/graphics/RectF;)Landroid/graphics/RectF;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-virtual {p0, p2, v0}, Lcom/zykj/view/simpleBoard/a;->a0(Landroid/graphics/RectF;Landroid/graphics/RectF;)Landroid/graphics/RectF;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    invoke-virtual {v0}, Landroid/graphics/RectF;->isEmpty()Z

    .line 14
    .line 15
    .line 16
    move-result v2

    .line 17
    const/high16 v3, 0x40c00000    # 6.0f

    .line 18
    .line 19
    if-nez v2, :cond_0

    .line 20
    .line 21
    iget-object v2, p0, Lcom/zykj/view/simpleBoard/a;->C:Landroid/graphics/Paint;

    .line 22
    .line 23
    invoke-virtual {p1, v0, v3, v3, v2}, Landroid/graphics/Canvas;->drawRoundRect(Landroid/graphics/RectF;FFLandroid/graphics/Paint;)V

    .line 24
    .line 25
    .line 26
    :cond_0
    invoke-virtual {v1}, Landroid/graphics/RectF;->isEmpty()Z

    .line 27
    .line 28
    .line 29
    move-result v0

    .line 30
    if-nez v0, :cond_1

    .line 31
    .line 32
    iget-object v0, p0, Lcom/zykj/view/simpleBoard/a;->C:Landroid/graphics/Paint;

    .line 33
    .line 34
    invoke-virtual {p1, v1, v3, v3, v0}, Landroid/graphics/Canvas;->drawRoundRect(Landroid/graphics/RectF;FFLandroid/graphics/Paint;)V

    .line 35
    .line 36
    .line 37
    :cond_1
    iget-object v0, p0, Lcom/zykj/view/simpleBoard/a;->h:Ljava/util/ArrayList;

    .line 38
    .line 39
    new-instance v1, Ljava/util/ArrayList;

    .line 40
    .line 41
    const/16 v2, 0xa

    .line 42
    .line 43
    invoke-static {v0, v2}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    .line 44
    .line 45
    .line 46
    move-result v4

    .line 47
    invoke-direct {v1, v4}, Ljava/util/ArrayList;-><init>(I)V

    .line 48
    .line 49
    .line 50
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 51
    .line 52
    .line 53
    move-result v4

    .line 54
    const/4 v5, 0x0

    .line 55
    move v6, v5

    .line 56
    :goto_0
    if-ge v6, v4, :cond_2

    .line 57
    .line 58
    invoke-virtual {v0, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 59
    .line 60
    .line 61
    move-result-object v7

    .line 62
    add-int/lit8 v6, v6, 0x1

    .line 63
    .line 64
    check-cast v7, Li7/k;

    .line 65
    .line 66
    invoke-virtual {v7}, Li7/k;->a()Landroid/graphics/Paint;

    .line 67
    .line 68
    .line 69
    move-result-object v7

    .line 70
    invoke-virtual {v7}, Landroid/graphics/Paint;->getColor()I

    .line 71
    .line 72
    .line 73
    move-result v7

    .line 74
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 75
    .line 76
    .line 77
    move-result-object v7

    .line 78
    invoke-interface {v1, v7}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 79
    .line 80
    .line 81
    goto :goto_0

    .line 82
    :cond_2
    invoke-static {v1}, Lkotlin/collections/CollectionsKt;->distinct(Ljava/lang/Iterable;)Ljava/util/List;

    .line 83
    .line 84
    .line 85
    move-result-object v0

    .line 86
    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->singleOrNull(Ljava/util/List;)Ljava/lang/Object;

    .line 87
    .line 88
    .line 89
    move-result-object v0

    .line 90
    check-cast v0, Ljava/lang/Integer;

    .line 91
    .line 92
    invoke-virtual {p0, p2}, Lcom/zykj/view/simpleBoard/a;->b0(Landroid/graphics/RectF;)Ljava/util/List;

    .line 93
    .line 94
    .line 95
    move-result-object v1

    .line 96
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 97
    .line 98
    .line 99
    move-result-object v1

    .line 100
    :cond_3
    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 101
    .line 102
    .line 103
    move-result v4

    .line 104
    if-eqz v4, :cond_5

    .line 105
    .line 106
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 107
    .line 108
    .line 109
    move-result-object v4

    .line 110
    check-cast v4, Lkotlin/Pair;

    .line 111
    .line 112
    invoke-virtual {v4}, Lkotlin/Pair;->component1()Ljava/lang/Object;

    .line 113
    .line 114
    .line 115
    move-result-object v6

    .line 116
    check-cast v6, Landroid/graphics/RectF;

    .line 117
    .line 118
    invoke-virtual {v4}, Lkotlin/Pair;->component2()Ljava/lang/Object;

    .line 119
    .line 120
    .line 121
    move-result-object v4

    .line 122
    check-cast v4, Ljava/lang/Number;

    .line 123
    .line 124
    invoke-virtual {v4}, Ljava/lang/Number;->intValue()I

    .line 125
    .line 126
    .line 127
    move-result v4

    .line 128
    iget-object v7, p0, Lcom/zykj/view/simpleBoard/a;->A:Landroid/graphics/Paint;

    .line 129
    .line 130
    sget-object v8, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    .line 131
    .line 132
    invoke-virtual {v7, v8}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 133
    .line 134
    .line 135
    iget-object v7, p0, Lcom/zykj/view/simpleBoard/a;->A:Landroid/graphics/Paint;

    .line 136
    .line 137
    invoke-virtual {v7, v4}, Landroid/graphics/Paint;->setColor(I)V

    .line 138
    .line 139
    .line 140
    iget-object v7, p0, Lcom/zykj/view/simpleBoard/a;->A:Landroid/graphics/Paint;

    .line 141
    .line 142
    invoke-virtual {p1, v6, v3, v3, v7}, Landroid/graphics/Canvas;->drawRoundRect(Landroid/graphics/RectF;FFLandroid/graphics/Paint;)V

    .line 143
    .line 144
    .line 145
    if-nez v0, :cond_4

    .line 146
    .line 147
    goto :goto_1

    .line 148
    :cond_4
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 149
    .line 150
    .line 151
    move-result v7

    .line 152
    if-ne v7, v4, :cond_3

    .line 153
    .line 154
    invoke-virtual {p0, p1, v6, v4}, Lcom/zykj/view/simpleBoard/a;->k(Landroid/graphics/Canvas;Landroid/graphics/RectF;I)V

    .line 155
    .line 156
    .line 157
    goto :goto_1

    .line 158
    :cond_5
    iget-object v0, p0, Lcom/zykj/view/simpleBoard/a;->h:Ljava/util/ArrayList;

    .line 159
    .line 160
    new-instance v1, Ljava/util/ArrayList;

    .line 161
    .line 162
    invoke-static {v0, v2}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    .line 163
    .line 164
    .line 165
    move-result v2

    .line 166
    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 167
    .line 168
    .line 169
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 170
    .line 171
    .line 172
    move-result v2

    .line 173
    move v3, v5

    .line 174
    :goto_2
    if-ge v3, v2, :cond_6

    .line 175
    .line 176
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 177
    .line 178
    .line 179
    move-result-object v4

    .line 180
    add-int/lit8 v3, v3, 0x1

    .line 181
    .line 182
    check-cast v4, Li7/k;

    .line 183
    .line 184
    invoke-virtual {v4}, Li7/k;->a()Landroid/graphics/Paint;

    .line 185
    .line 186
    .line 187
    move-result-object v4

    .line 188
    invoke-virtual {v4}, Landroid/graphics/Paint;->getStrokeWidth()F

    .line 189
    .line 190
    .line 191
    move-result v4

    .line 192
    invoke-static {v4}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 193
    .line 194
    .line 195
    move-result-object v4

    .line 196
    invoke-interface {v1, v4}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 197
    .line 198
    .line 199
    goto :goto_2

    .line 200
    :cond_6
    invoke-static {v1}, Lkotlin/collections/CollectionsKt;->distinct(Ljava/lang/Iterable;)Ljava/util/List;

    .line 201
    .line 202
    .line 203
    move-result-object v0

    .line 204
    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->singleOrNull(Ljava/util/List;)Ljava/lang/Object;

    .line 205
    .line 206
    .line 207
    move-result-object v0

    .line 208
    check-cast v0, Ljava/lang/Float;

    .line 209
    .line 210
    invoke-virtual {p0, p2}, Lcom/zykj/view/simpleBoard/a;->e0(Landroid/graphics/RectF;)Ljava/util/List;

    .line 211
    .line 212
    .line 213
    move-result-object p2

    .line 214
    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 215
    .line 216
    .line 217
    move-result-object p2

    .line 218
    :goto_3
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 219
    .line 220
    .line 221
    move-result v1

    .line 222
    if-eqz v1, :cond_9

    .line 223
    .line 224
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 225
    .line 226
    .line 227
    move-result-object v1

    .line 228
    add-int/lit8 v2, v5, 0x1

    .line 229
    .line 230
    if-gez v5, :cond_7

    .line 231
    .line 232
    invoke-static {}, Lkotlin/collections/CollectionsKt;->throwIndexOverflow()V

    .line 233
    .line 234
    .line 235
    :cond_7
    check-cast v1, Lkotlin/Pair;

    .line 236
    .line 237
    invoke-virtual {v1}, Lkotlin/Pair;->component1()Ljava/lang/Object;

    .line 238
    .line 239
    .line 240
    move-result-object v3

    .line 241
    check-cast v3, Landroid/graphics/RectF;

    .line 242
    .line 243
    invoke-virtual {v1}, Lkotlin/Pair;->component2()Ljava/lang/Object;

    .line 244
    .line 245
    .line 246
    move-result-object v1

    .line 247
    check-cast v1, Ljava/lang/Number;

    .line 248
    .line 249
    invoke-virtual {v1}, Ljava/lang/Number;->floatValue()F

    .line 250
    .line 251
    .line 252
    move-result v1

    .line 253
    iget-object v4, p0, Lcom/zykj/view/simpleBoard/a;->A:Landroid/graphics/Paint;

    .line 254
    .line 255
    sget-object v6, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    .line 256
    .line 257
    invoke-virtual {v4, v6}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 258
    .line 259
    .line 260
    iget-object v4, p0, Lcom/zykj/view/simpleBoard/a;->A:Landroid/graphics/Paint;

    .line 261
    .line 262
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Float;F)Z

    .line 263
    .line 264
    .line 265
    move-result v1

    .line 266
    if-eqz v1, :cond_8

    .line 267
    .line 268
    const v1, -0xea8901

    .line 269
    .line 270
    .line 271
    goto :goto_4

    .line 272
    :cond_8
    const v1, -0x363637

    .line 273
    .line 274
    .line 275
    :goto_4
    invoke-virtual {v4, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 276
    .line 277
    .line 278
    int-to-float v1, v5

    .line 279
    const/high16 v4, 0x40400000    # 3.0f

    .line 280
    .line 281
    mul-float/2addr v1, v4

    .line 282
    const/high16 v4, 0x41000000    # 8.0f

    .line 283
    .line 284
    add-float/2addr v1, v4

    .line 285
    const/4 v4, 0x2

    .line 286
    int-to-float v4, v4

    .line 287
    div-float/2addr v1, v4

    .line 288
    invoke-virtual {v3}, Landroid/graphics/RectF;->centerX()F

    .line 289
    .line 290
    .line 291
    move-result v4

    .line 292
    invoke-virtual {v3}, Landroid/graphics/RectF;->centerY()F

    .line 293
    .line 294
    .line 295
    move-result v3

    .line 296
    iget-object v5, p0, Lcom/zykj/view/simpleBoard/a;->A:Landroid/graphics/Paint;

    .line 297
    .line 298
    invoke-virtual {p1, v4, v3, v1, v5}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    .line 299
    .line 300
    .line 301
    move v5, v2

    .line 302
    goto :goto_3

    .line 303
    :cond_9
    invoke-virtual {p0}, Lcom/zykj/view/simpleBoard/a;->S()V

    .line 304
    .line 305
    .line 306
    return-void
.end method

.method public final t(Landroid/graphics/Canvas;)V
    .locals 2

    .line 1
    const-string v0, "canvas"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/zykj/view/simpleBoard/a;->s:Landroid/graphics/Path;

    .line 7
    .line 8
    invoke-virtual {v0}, Landroid/graphics/Path;->isEmpty()Z

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    if-nez v0, :cond_0

    .line 13
    .line 14
    iget-object v0, p0, Lcom/zykj/view/simpleBoard/a;->s:Landroid/graphics/Path;

    .line 15
    .line 16
    iget-object v1, p0, Lcom/zykj/view/simpleBoard/a;->y:Landroid/graphics/Paint;

    .line 17
    .line 18
    invoke-virtual {p1, v0, v1}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    .line 19
    .line 20
    .line 21
    :cond_0
    iget-object v0, p0, Lcom/zykj/view/simpleBoard/a;->i:Landroid/graphics/RectF;

    .line 22
    .line 23
    invoke-virtual {v0}, Landroid/graphics/RectF;->isEmpty()Z

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    if-nez v0, :cond_1

    .line 28
    .line 29
    new-instance v0, Landroid/graphics/RectF;

    .line 30
    .line 31
    iget-object v1, p0, Lcom/zykj/view/simpleBoard/a;->i:Landroid/graphics/RectF;

    .line 32
    .line 33
    invoke-direct {v0, v1}, Landroid/graphics/RectF;-><init>(Landroid/graphics/RectF;)V

    .line 34
    .line 35
    .line 36
    iget-object v1, p0, Lcom/zykj/view/simpleBoard/a;->b:Landroid/graphics/Matrix;

    .line 37
    .line 38
    invoke-virtual {v1, v0}, Landroid/graphics/Matrix;->mapRect(Landroid/graphics/RectF;)Z

    .line 39
    .line 40
    .line 41
    iget-object v1, p0, Lcom/zykj/view/simpleBoard/a;->z:Landroid/graphics/Paint;

    .line 42
    .line 43
    invoke-virtual {p1, v0, v1}, Landroid/graphics/Canvas;->drawRect(Landroid/graphics/RectF;Landroid/graphics/Paint;)V

    .line 44
    .line 45
    .line 46
    return-void

    .line 47
    :cond_1
    iget-object v0, p0, Lcom/zykj/view/simpleBoard/a;->h:Ljava/util/ArrayList;

    .line 48
    .line 49
    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    .line 50
    .line 51
    .line 52
    move-result v0

    .line 53
    if-nez v0, :cond_2

    .line 54
    .line 55
    invoke-virtual {p0}, Lcom/zykj/view/simpleBoard/a;->P()Z

    .line 56
    .line 57
    .line 58
    move-result v0

    .line 59
    if-nez v0, :cond_2

    .line 60
    .line 61
    invoke-virtual {p0}, Lcom/zykj/view/simpleBoard/a;->z()Landroid/graphics/RectF;

    .line 62
    .line 63
    .line 64
    move-result-object v0

    .line 65
    invoke-virtual {p0, p1, v0}, Lcom/zykj/view/simpleBoard/a;->q(Landroid/graphics/Canvas;Landroid/graphics/RectF;)V

    .line 66
    .line 67
    .line 68
    :cond_2
    return-void
.end method

.method public final u(Landroid/graphics/PointF;)Li7/k;
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/zykj/view/simpleBoard/a;->g:Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->asReversedMutable(Ljava/util/List;)Ljava/util/List;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    if-eqz v1, :cond_1

    .line 16
    .line 17
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    move-object v2, v1

    .line 22
    check-cast v2, Li7/k;

    .line 23
    .line 24
    invoke-virtual {p0, v2}, Lcom/zykj/view/simpleBoard/a;->c(Li7/k;)Landroid/graphics/RectF;

    .line 25
    .line 26
    .line 27
    move-result-object v2

    .line 28
    iget v3, p1, Landroid/graphics/PointF;->x:F

    .line 29
    .line 30
    iget v4, p1, Landroid/graphics/PointF;->y:F

    .line 31
    .line 32
    invoke-virtual {v2, v3, v4}, Landroid/graphics/RectF;->contains(FF)Z

    .line 33
    .line 34
    .line 35
    move-result v2

    .line 36
    if-eqz v2, :cond_0

    .line 37
    .line 38
    goto :goto_0

    .line 39
    :cond_1
    const/4 v1, 0x0

    .line 40
    :goto_0
    check-cast v1, Li7/k;

    .line 41
    .line 42
    return-object v1
.end method

.method public final v(Landroid/graphics/PointF;)Lcom/zykj/view/simpleBoard/SelectionTarget;
    .locals 9

    .line 1
    iget-object v0, p0, Lcom/zykj/view/simpleBoard/a;->h:Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    sget-object p1, Lcom/zykj/view/simpleBoard/SelectionTarget;->c:Lcom/zykj/view/simpleBoard/SelectionTarget;

    .line 10
    .line 11
    return-object p1

    .line 12
    :cond_0
    invoke-virtual {p0}, Lcom/zykj/view/simpleBoard/a;->z()Landroid/graphics/RectF;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    invoke-virtual {p0, v0}, Lcom/zykj/view/simpleBoard/a;->U(Landroid/graphics/RectF;)Lh7/b;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    iget-object v2, p0, Lcom/zykj/view/simpleBoard/a;->q:Lh7/d;

    .line 21
    .line 22
    invoke-virtual {v2}, Lh7/d;->a()Z

    .line 23
    .line 24
    .line 25
    move-result v2

    .line 26
    if-eqz v2, :cond_1

    .line 27
    .line 28
    invoke-virtual {v1}, Lh7/b;->a()Landroid/graphics/RectF;

    .line 29
    .line 30
    .line 31
    move-result-object v2

    .line 32
    iget v3, p1, Landroid/graphics/PointF;->x:F

    .line 33
    .line 34
    iget v4, p1, Landroid/graphics/PointF;->y:F

    .line 35
    .line 36
    invoke-virtual {v2, v3, v4}, Landroid/graphics/RectF;->contains(FF)Z

    .line 37
    .line 38
    .line 39
    move-result v2

    .line 40
    if-eqz v2, :cond_1

    .line 41
    .line 42
    sget-object p1, Lcom/zykj/view/simpleBoard/SelectionTarget;->o:Lcom/zykj/view/simpleBoard/SelectionTarget;

    .line 43
    .line 44
    return-object p1

    .line 45
    :cond_1
    iget-object v2, p0, Lcom/zykj/view/simpleBoard/a;->q:Lh7/d;

    .line 46
    .line 47
    invoke-virtual {v2}, Lh7/d;->b()Z

    .line 48
    .line 49
    .line 50
    move-result v2

    .line 51
    if-nez v2, :cond_2

    .line 52
    .line 53
    iget-object v2, p0, Lcom/zykj/view/simpleBoard/a;->q:Lh7/d;

    .line 54
    .line 55
    invoke-virtual {v2}, Lh7/d;->c()Z

    .line 56
    .line 57
    .line 58
    move-result v2

    .line 59
    if-eqz v2, :cond_3

    .line 60
    .line 61
    :cond_2
    invoke-virtual {v1}, Lh7/b;->b()Landroid/graphics/RectF;

    .line 62
    .line 63
    .line 64
    move-result-object v1

    .line 65
    iget v2, p1, Landroid/graphics/PointF;->x:F

    .line 66
    .line 67
    iget v3, p1, Landroid/graphics/PointF;->y:F

    .line 68
    .line 69
    invoke-virtual {v1, v2, v3}, Landroid/graphics/RectF;->contains(FF)Z

    .line 70
    .line 71
    .line 72
    move-result v1

    .line 73
    if-eqz v1, :cond_3

    .line 74
    .line 75
    sget-object p1, Lcom/zykj/view/simpleBoard/SelectionTarget;->n:Lcom/zykj/view/simpleBoard/SelectionTarget;

    .line 76
    .line 77
    return-object p1

    .line 78
    :cond_3
    iget-boolean v1, p0, Lcom/zykj/view/simpleBoard/a;->p:Z

    .line 79
    .line 80
    const/4 v2, 0x0

    .line 81
    if-eqz v1, :cond_a

    .line 82
    .line 83
    invoke-virtual {p0, v0}, Lcom/zykj/view/simpleBoard/a;->c0(Landroid/graphics/RectF;)Landroid/graphics/RectF;

    .line 84
    .line 85
    .line 86
    move-result-object v1

    .line 87
    invoke-virtual {p0, v1}, Lcom/zykj/view/simpleBoard/a;->b0(Landroid/graphics/RectF;)Ljava/util/List;

    .line 88
    .line 89
    .line 90
    move-result-object v3

    .line 91
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 92
    .line 93
    .line 94
    move-result-object v3

    .line 95
    move v4, v2

    .line 96
    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 97
    .line 98
    .line 99
    move-result v5

    .line 100
    if-eqz v5, :cond_6

    .line 101
    .line 102
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 103
    .line 104
    .line 105
    move-result-object v5

    .line 106
    add-int/lit8 v6, v4, 0x1

    .line 107
    .line 108
    if-gez v4, :cond_4

    .line 109
    .line 110
    invoke-static {}, Lkotlin/collections/CollectionsKt;->throwIndexOverflow()V

    .line 111
    .line 112
    .line 113
    :cond_4
    check-cast v5, Lkotlin/Pair;

    .line 114
    .line 115
    invoke-virtual {v5}, Lkotlin/Pair;->getFirst()Ljava/lang/Object;

    .line 116
    .line 117
    .line 118
    move-result-object v5

    .line 119
    check-cast v5, Landroid/graphics/RectF;

    .line 120
    .line 121
    iget v7, p1, Landroid/graphics/PointF;->x:F

    .line 122
    .line 123
    iget v8, p1, Landroid/graphics/PointF;->y:F

    .line 124
    .line 125
    invoke-virtual {v5, v7, v8}, Landroid/graphics/RectF;->contains(FF)Z

    .line 126
    .line 127
    .line 128
    move-result v5

    .line 129
    if-eqz v5, :cond_5

    .line 130
    .line 131
    sget-object p1, Lcom/zykj/view/simpleBoard/SelectionTarget;->a:Lcom/zykj/view/simpleBoard/SelectionTarget$a;

    .line 132
    .line 133
    invoke-virtual {p1, v4}, Lcom/zykj/view/simpleBoard/SelectionTarget$a;->a(I)Lcom/zykj/view/simpleBoard/SelectionTarget;

    .line 134
    .line 135
    .line 136
    move-result-object p1

    .line 137
    return-object p1

    .line 138
    :cond_5
    move v4, v6

    .line 139
    goto :goto_0

    .line 140
    :cond_6
    invoke-virtual {p0, v1}, Lcom/zykj/view/simpleBoard/a;->e0(Landroid/graphics/RectF;)Ljava/util/List;

    .line 141
    .line 142
    .line 143
    move-result-object v3

    .line 144
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 145
    .line 146
    .line 147
    move-result-object v3

    .line 148
    move v4, v2

    .line 149
    :goto_1
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 150
    .line 151
    .line 152
    move-result v5

    .line 153
    if-eqz v5, :cond_9

    .line 154
    .line 155
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 156
    .line 157
    .line 158
    move-result-object v5

    .line 159
    add-int/lit8 v6, v4, 0x1

    .line 160
    .line 161
    if-gez v4, :cond_7

    .line 162
    .line 163
    invoke-static {}, Lkotlin/collections/CollectionsKt;->throwIndexOverflow()V

    .line 164
    .line 165
    .line 166
    :cond_7
    check-cast v5, Lkotlin/Pair;

    .line 167
    .line 168
    invoke-virtual {v5}, Lkotlin/Pair;->getFirst()Ljava/lang/Object;

    .line 169
    .line 170
    .line 171
    move-result-object v5

    .line 172
    check-cast v5, Landroid/graphics/RectF;

    .line 173
    .line 174
    iget v7, p1, Landroid/graphics/PointF;->x:F

    .line 175
    .line 176
    iget v8, p1, Landroid/graphics/PointF;->y:F

    .line 177
    .line 178
    invoke-virtual {v5, v7, v8}, Landroid/graphics/RectF;->contains(FF)Z

    .line 179
    .line 180
    .line 181
    move-result v5

    .line 182
    if-eqz v5, :cond_8

    .line 183
    .line 184
    sget-object p1, Lcom/zykj/view/simpleBoard/SelectionTarget;->a:Lcom/zykj/view/simpleBoard/SelectionTarget$a;

    .line 185
    .line 186
    invoke-virtual {p1, v4}, Lcom/zykj/view/simpleBoard/SelectionTarget$a;->c(I)Lcom/zykj/view/simpleBoard/SelectionTarget;

    .line 187
    .line 188
    .line 189
    move-result-object p1

    .line 190
    return-object p1

    .line 191
    :cond_8
    move v4, v6

    .line 192
    goto :goto_1

    .line 193
    :cond_9
    iget v3, p1, Landroid/graphics/PointF;->x:F

    .line 194
    .line 195
    iget v4, p1, Landroid/graphics/PointF;->y:F

    .line 196
    .line 197
    invoke-virtual {v1, v3, v4}, Landroid/graphics/RectF;->contains(FF)Z

    .line 198
    .line 199
    .line 200
    move-result v1

    .line 201
    if-eqz v1, :cond_a

    .line 202
    .line 203
    sget-object p1, Lcom/zykj/view/simpleBoard/SelectionTarget;->p:Lcom/zykj/view/simpleBoard/SelectionTarget;

    .line 204
    .line 205
    return-object p1

    .line 206
    :cond_a
    iget-object v1, p0, Lcom/zykj/view/simpleBoard/a;->q:Lh7/d;

    .line 207
    .line 208
    invoke-virtual {v1}, Lh7/d;->e()Z

    .line 209
    .line 210
    .line 211
    move-result v1

    .line 212
    const/high16 v3, 0x41c00000    # 24.0f

    .line 213
    .line 214
    if-eqz v1, :cond_b

    .line 215
    .line 216
    invoke-virtual {p0, v0}, Lcom/zykj/view/simpleBoard/a;->T(Landroid/graphics/RectF;)Landroid/graphics/PointF;

    .line 217
    .line 218
    .line 219
    move-result-object v1

    .line 220
    invoke-virtual {p0, p1, v1, v3}, Lcom/zykj/view/simpleBoard/a;->O(Landroid/graphics/PointF;Landroid/graphics/PointF;F)Z

    .line 221
    .line 222
    .line 223
    move-result v1

    .line 224
    if-eqz v1, :cond_b

    .line 225
    .line 226
    sget-object p1, Lcom/zykj/view/simpleBoard/SelectionTarget;->m:Lcom/zykj/view/simpleBoard/SelectionTarget;

    .line 227
    .line 228
    return-object p1

    .line 229
    :cond_b
    invoke-virtual {p0, v0}, Lcom/zykj/view/simpleBoard/a;->V(Landroid/graphics/RectF;)Ljava/util/List;

    .line 230
    .line 231
    .line 232
    move-result-object v1

    .line 233
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 234
    .line 235
    .line 236
    move-result-object v1

    .line 237
    :goto_2
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 238
    .line 239
    .line 240
    move-result v4

    .line 241
    if-eqz v4, :cond_e

    .line 242
    .line 243
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 244
    .line 245
    .line 246
    move-result-object v4

    .line 247
    add-int/lit8 v5, v2, 0x1

    .line 248
    .line 249
    if-gez v2, :cond_c

    .line 250
    .line 251
    invoke-static {}, Lkotlin/collections/CollectionsKt;->throwIndexOverflow()V

    .line 252
    .line 253
    .line 254
    :cond_c
    check-cast v4, Landroid/graphics/PointF;

    .line 255
    .line 256
    sget-object v6, Lcom/zykj/view/simpleBoard/SelectionTarget;->a:Lcom/zykj/view/simpleBoard/SelectionTarget$a;

    .line 257
    .line 258
    invoke-virtual {v6}, Lcom/zykj/view/simpleBoard/SelectionTarget$a;->b()Ljava/util/List;

    .line 259
    .line 260
    .line 261
    move-result-object v6

    .line 262
    invoke-interface {v6, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 263
    .line 264
    .line 265
    move-result-object v2

    .line 266
    check-cast v2, Lcom/zykj/view/simpleBoard/SelectionTarget;

    .line 267
    .line 268
    iget-object v6, p0, Lcom/zykj/view/simpleBoard/a;->q:Lh7/d;

    .line 269
    .line 270
    invoke-virtual {v2, v6}, Lcom/zykj/view/simpleBoard/SelectionTarget;->t(Lh7/d;)Z

    .line 271
    .line 272
    .line 273
    move-result v6

    .line 274
    if-eqz v6, :cond_d

    .line 275
    .line 276
    invoke-virtual {p0, p1, v4, v3}, Lcom/zykj/view/simpleBoard/a;->O(Landroid/graphics/PointF;Landroid/graphics/PointF;F)Z

    .line 277
    .line 278
    .line 279
    move-result v4

    .line 280
    if-eqz v4, :cond_d

    .line 281
    .line 282
    return-object v2

    .line 283
    :cond_d
    move v2, v5

    .line 284
    goto :goto_2

    .line 285
    :cond_e
    iget-object v1, p0, Lcom/zykj/view/simpleBoard/a;->q:Lh7/d;

    .line 286
    .line 287
    invoke-virtual {v1}, Lh7/d;->d()Z

    .line 288
    .line 289
    .line 290
    move-result v1

    .line 291
    if-eqz v1, :cond_f

    .line 292
    .line 293
    iget v1, p1, Landroid/graphics/PointF;->x:F

    .line 294
    .line 295
    iget p1, p1, Landroid/graphics/PointF;->y:F

    .line 296
    .line 297
    invoke-virtual {v0, v1, p1}, Landroid/graphics/RectF;->contains(FF)Z

    .line 298
    .line 299
    .line 300
    move-result p1

    .line 301
    if-eqz p1, :cond_f

    .line 302
    .line 303
    sget-object p1, Lcom/zykj/view/simpleBoard/SelectionTarget;->d:Lcom/zykj/view/simpleBoard/SelectionTarget;

    .line 304
    .line 305
    return-object p1

    .line 306
    :cond_f
    sget-object p1, Lcom/zykj/view/simpleBoard/SelectionTarget;->c:Lcom/zykj/view/simpleBoard/SelectionTarget;

    .line 307
    .line 308
    return-object p1
.end method

.method public final w()Landroid/graphics/Bitmap;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/view/simpleBoard/a;->d:Landroid/graphics/Bitmap;

    .line 2
    .line 3
    return-object v0
.end method

.method public final x(Z)Landroid/graphics/RectF;
    .locals 5

    .line 1
    new-instance v0, Landroid/graphics/RectF;

    .line 2
    .line 3
    invoke-direct {v0}, Landroid/graphics/RectF;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-object v1, p0, Lcom/zykj/view/simpleBoard/a;->h:Ljava/util/ArrayList;

    .line 7
    .line 8
    invoke-static {v1}, Lkotlin/collections/CollectionsKt;->first(Ljava/util/List;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    check-cast v1, Li7/k;

    .line 13
    .line 14
    invoke-virtual {v1}, Li7/k;->b()Landroid/graphics/Path;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    const/4 v2, 0x1

    .line 19
    invoke-virtual {v1, v0, v2}, Landroid/graphics/Path;->computeBounds(Landroid/graphics/RectF;Z)V

    .line 20
    .line 21
    .line 22
    iget-object v1, p0, Lcom/zykj/view/simpleBoard/a;->h:Ljava/util/ArrayList;

    .line 23
    .line 24
    invoke-static {v1, v2}, Lkotlin/collections/CollectionsKt;->drop(Ljava/lang/Iterable;I)Ljava/util/List;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 29
    .line 30
    .line 31
    move-result-object v1

    .line 32
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 33
    .line 34
    .line 35
    move-result v3

    .line 36
    if-eqz v3, :cond_0

    .line 37
    .line 38
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object v3

    .line 42
    check-cast v3, Li7/k;

    .line 43
    .line 44
    new-instance v4, Landroid/graphics/RectF;

    .line 45
    .line 46
    invoke-direct {v4}, Landroid/graphics/RectF;-><init>()V

    .line 47
    .line 48
    .line 49
    invoke-virtual {v3}, Li7/k;->b()Landroid/graphics/Path;

    .line 50
    .line 51
    .line 52
    move-result-object v3

    .line 53
    invoke-virtual {v3, v4, v2}, Landroid/graphics/Path;->computeBounds(Landroid/graphics/RectF;Z)V

    .line 54
    .line 55
    .line 56
    invoke-virtual {v0, v4}, Landroid/graphics/RectF;->union(Landroid/graphics/RectF;)V

    .line 57
    .line 58
    .line 59
    goto :goto_0

    .line 60
    :cond_0
    if-eqz p1, :cond_1

    .line 61
    .line 62
    iget-object p1, p0, Lcom/zykj/view/simpleBoard/a;->b:Landroid/graphics/Matrix;

    .line 63
    .line 64
    invoke-static {p1}, Lu5/n;->b(Landroid/graphics/Matrix;)Landroid/graphics/Matrix;

    .line 65
    .line 66
    .line 67
    move-result-object p1

    .line 68
    const/high16 v1, 0x40c00000    # 6.0f

    .line 69
    .line 70
    invoke-virtual {p1, v1}, Landroid/graphics/Matrix;->mapRadius(F)F

    .line 71
    .line 72
    .line 73
    move-result p1

    .line 74
    neg-float p1, p1

    .line 75
    invoke-virtual {v0, p1, p1}, Landroid/graphics/RectF;->inset(FF)V

    .line 76
    .line 77
    .line 78
    :cond_1
    return-object v0
.end method

.method public final z()Landroid/graphics/RectF;
    .locals 4

    .line 1
    new-instance v0, Landroid/graphics/RectF;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    const/4 v2, 0x0

    .line 5
    const/4 v3, 0x0

    .line 6
    invoke-static {p0, v3, v1, v2}, Lcom/zykj/view/simpleBoard/a;->y(Lcom/zykj/view/simpleBoard/a;ZILjava/lang/Object;)Landroid/graphics/RectF;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    invoke-direct {v0, v1}, Landroid/graphics/RectF;-><init>(Landroid/graphics/RectF;)V

    .line 11
    .line 12
    .line 13
    iget-object v1, p0, Lcom/zykj/view/simpleBoard/a;->b:Landroid/graphics/Matrix;

    .line 14
    .line 15
    invoke-virtual {v1, v0}, Landroid/graphics/Matrix;->mapRect(Landroid/graphics/RectF;)Z

    .line 16
    .line 17
    .line 18
    return-object v0
.end method
