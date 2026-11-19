.class public final Lh4/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lh4/a$a;
    }
.end annotation


# static fields
.field public static final c:Lh4/a$a;


# instance fields
.field public final a:Lcom/zykj/blackboard/bean/BoardConfig;

.field public final b:Landroid/graphics/Paint;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lh4/a$a;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Lh4/a$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lh4/a;->c:Lh4/a$a;

    .line 8
    .line 9
    return-void
.end method

.method public constructor <init>(Lcom/zykj/blackboard/bean/BoardConfig;)V
    .locals 1

    .line 1
    const-string v0, "boardConfig"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object p1, p0, Lh4/a;->a:Lcom/zykj/blackboard/bean/BoardConfig;

    .line 10
    .line 11
    new-instance p1, Landroid/graphics/Paint;

    .line 12
    .line 13
    invoke-direct {p1}, Landroid/graphics/Paint;-><init>()V

    .line 14
    .line 15
    .line 16
    const/4 v0, 0x1

    .line 17
    invoke-virtual {p1, v0}, Landroid/graphics/Paint;->setDither(Z)V

    .line 18
    .line 19
    .line 20
    invoke-virtual {p1, v0}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 21
    .line 22
    .line 23
    sget-object v0, Landroid/graphics/Paint$Cap;->ROUND:Landroid/graphics/Paint$Cap;

    .line 24
    .line 25
    invoke-virtual {p1, v0}, Landroid/graphics/Paint;->setStrokeCap(Landroid/graphics/Paint$Cap;)V

    .line 26
    .line 27
    .line 28
    sget-object v0, Landroid/graphics/Paint$Join;->ROUND:Landroid/graphics/Paint$Join;

    .line 29
    .line 30
    invoke-virtual {p1, v0}, Landroid/graphics/Paint;->setStrokeJoin(Landroid/graphics/Paint$Join;)V

    .line 31
    .line 32
    .line 33
    iput-object p1, p0, Lh4/a;->b:Landroid/graphics/Paint;

    .line 34
    .line 35
    return-void
.end method


# virtual methods
.method public final a(I)Z
    .locals 6

    .line 1
    shr-int/lit8 v0, p1, 0x10

    .line 2
    .line 3
    and-int/lit16 v0, v0, 0xff

    .line 4
    .line 5
    shr-int/lit8 v1, p1, 0x8

    .line 6
    .line 7
    and-int/lit16 v1, v1, 0xff

    .line 8
    .line 9
    and-int/lit16 p1, p1, 0xff

    .line 10
    .line 11
    int-to-double v2, v0

    .line 12
    const-wide v4, 0x3fd322d0e5604189L    # 0.299

    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    mul-double/2addr v2, v4

    .line 18
    int-to-double v0, v1

    .line 19
    const-wide v4, 0x3fe27ef9db22d0e5L    # 0.578

    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    mul-double/2addr v0, v4

    .line 25
    add-double/2addr v2, v0

    .line 26
    int-to-double v0, p1

    .line 27
    const-wide v4, 0x3fbd2f1a9fbe76c9L    # 0.114

    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    mul-double/2addr v0, v4

    .line 33
    add-double/2addr v2, v0

    .line 34
    const-wide/high16 v0, 0x4068000000000000L    # 192.0

    .line 35
    .line 36
    cmpl-double p1, v2, v0

    .line 37
    .line 38
    if-ltz p1, :cond_0

    .line 39
    .line 40
    const/4 p1, 0x1

    .line 41
    return p1

    .line 42
    :cond_0
    const/4 p1, 0x0

    .line 43
    return p1
.end method

.method public final b(Landroid/graphics/Canvas;Li4/e;Li4/c;Landroid/graphics/Paint;ILjava/util/List;)V
    .locals 13

    .line 1
    move-object/from16 v4, p4

    .line 2
    .line 3
    sget-object v0, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    .line 4
    .line 5
    invoke-virtual {v4, v0}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual/range {p4 .. p5}, Landroid/graphics/Paint;->setColor(I)V

    .line 9
    .line 10
    .line 11
    invoke-virtual/range {p3 .. p3}, Li4/c;->a()Landroid/graphics/RectF;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    const/high16 v1, 0x40c00000    # 6.0f

    .line 16
    .line 17
    invoke-virtual {p1, v0, v1, v1, v4}, Landroid/graphics/Canvas;->drawRoundRect(Landroid/graphics/RectF;FFLandroid/graphics/Paint;)V

    .line 18
    .line 19
    .line 20
    invoke-interface/range {p6 .. p6}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 21
    .line 22
    .line 23
    move-result-object v2

    .line 24
    const/4 v3, 0x0

    .line 25
    move v0, v3

    .line 26
    move v5, v0

    .line 27
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 28
    .line 29
    .line 30
    move-result v6

    .line 31
    if-eqz v6, :cond_5

    .line 32
    .line 33
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object v6

    .line 37
    add-int/lit8 v7, v0, 0x1

    .line 38
    .line 39
    if-gez v0, :cond_0

    .line 40
    .line 41
    invoke-static {}, Lkotlin/collections/CollectionsKt;->throwIndexOverflow()V

    .line 42
    .line 43
    .line 44
    :cond_0
    check-cast v6, Lh4/f;

    .line 45
    .line 46
    sget-object v8, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    .line 47
    .line 48
    invoke-virtual {v4, v8}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 49
    .line 50
    .line 51
    invoke-virtual {v6}, Lh4/f;->a()I

    .line 52
    .line 53
    .line 54
    move-result v8

    .line 55
    invoke-virtual {v4, v8}, Landroid/graphics/Paint;->setColor(I)V

    .line 56
    .line 57
    .line 58
    new-instance v8, Landroid/graphics/RectF;

    .line 59
    .line 60
    invoke-virtual {p2}, Li4/e;->a()Ljava/util/ArrayList;

    .line 61
    .line 62
    .line 63
    move-result-object v9

    .line 64
    invoke-virtual {v9, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 65
    .line 66
    .line 67
    move-result-object v9

    .line 68
    check-cast v9, Landroid/graphics/RectF;

    .line 69
    .line 70
    iget v9, v9, Landroid/graphics/RectF;->left:F

    .line 71
    .line 72
    invoke-virtual {p2}, Li4/e;->a()Ljava/util/ArrayList;

    .line 73
    .line 74
    .line 75
    move-result-object v10

    .line 76
    invoke-virtual {v10, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 77
    .line 78
    .line 79
    move-result-object v10

    .line 80
    check-cast v10, Landroid/graphics/RectF;

    .line 81
    .line 82
    iget v10, v10, Landroid/graphics/RectF;->top:F

    .line 83
    .line 84
    invoke-virtual {p2}, Li4/e;->a()Ljava/util/ArrayList;

    .line 85
    .line 86
    .line 87
    move-result-object v11

    .line 88
    invoke-virtual {v11, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 89
    .line 90
    .line 91
    move-result-object v11

    .line 92
    check-cast v11, Landroid/graphics/RectF;

    .line 93
    .line 94
    iget v11, v11, Landroid/graphics/RectF;->right:F

    .line 95
    .line 96
    invoke-virtual {p2}, Li4/e;->a()Ljava/util/ArrayList;

    .line 97
    .line 98
    .line 99
    move-result-object v12

    .line 100
    invoke-virtual {v12, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 101
    .line 102
    .line 103
    move-result-object v0

    .line 104
    check-cast v0, Landroid/graphics/RectF;

    .line 105
    .line 106
    iget v0, v0, Landroid/graphics/RectF;->bottom:F

    .line 107
    .line 108
    invoke-direct {v8, v9, v10, v11, v0}, Landroid/graphics/RectF;-><init>(FFFF)V

    .line 109
    .line 110
    .line 111
    new-instance v0, Landroid/graphics/Path;

    .line 112
    .line 113
    invoke-direct {v0}, Landroid/graphics/Path;-><init>()V

    .line 114
    .line 115
    .line 116
    sget-object v9, Landroid/graphics/Path$Direction;->CW:Landroid/graphics/Path$Direction;

    .line 117
    .line 118
    invoke-virtual {v0, v8, v1, v1, v9}, Landroid/graphics/Path;->addRoundRect(Landroid/graphics/RectF;FFLandroid/graphics/Path$Direction;)V

    .line 119
    .line 120
    .line 121
    invoke-virtual {p1}, Landroid/graphics/Canvas;->save()I

    .line 122
    .line 123
    .line 124
    move-result v9

    .line 125
    invoke-virtual {p1, v0}, Landroid/graphics/Canvas;->clipPath(Landroid/graphics/Path;)Z

    .line 126
    .line 127
    .line 128
    :try_start_0
    sget-object v0, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    .line 129
    .line 130
    invoke-virtual {v6}, Lh4/f;->a()I

    .line 131
    .line 132
    .line 133
    move-result v0

    .line 134
    invoke-virtual {p1, v0}, Landroid/graphics/Canvas;->drawColor(I)V

    .line 135
    .line 136
    .line 137
    instance-of v0, v6, Lh4/f$b;

    .line 138
    .line 139
    if-eqz v0, :cond_2

    .line 140
    .line 141
    move-object v0, v6

    .line 142
    check-cast v0, Lh4/f$b;

    .line 143
    .line 144
    invoke-virtual {v0}, Lh4/f$b;->e()Z

    .line 145
    .line 146
    .line 147
    move-result v5

    .line 148
    invoke-static {}, Lcom/blankj/utilcode/util/Utils;->getApp()Landroid/app/Application;

    .line 149
    .line 150
    .line 151
    move-result-object v0

    .line 152
    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 153
    .line 154
    .line 155
    move-result-object v0

    .line 156
    invoke-virtual {v6}, Lh4/f;->a()I

    .line 157
    .line 158
    .line 159
    move-result v10

    .line 160
    if-eqz v10, :cond_1

    .line 161
    .line 162
    sget v10, Lcom/zykj/blackboard/R$drawable;->blackboard_icon_custom_color_selected:I

    .line 163
    .line 164
    goto :goto_1

    .line 165
    :catchall_0
    move-exception v0

    .line 166
    goto :goto_3

    .line 167
    :cond_1
    sget v10, Lcom/zykj/blackboard/R$drawable;->blackboard_icon_custom_color:I

    .line 168
    .line 169
    :goto_1
    invoke-static {v0, v10}, Landroid/graphics/BitmapFactory;->decodeResource(Landroid/content/res/Resources;I)Landroid/graphics/Bitmap;

    .line 170
    .line 171
    .line 172
    move-result-object v0

    .line 173
    new-instance v10, Landroid/graphics/Rect;

    .line 174
    .line 175
    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getWidth()I

    .line 176
    .line 177
    .line 178
    move-result v11

    .line 179
    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getHeight()I

    .line 180
    .line 181
    .line 182
    move-result v12

    .line 183
    invoke-direct {v10, v3, v3, v11, v12}, Landroid/graphics/Rect;-><init>(IIII)V

    .line 184
    .line 185
    .line 186
    const/4 v11, 0x0

    .line 187
    invoke-virtual {p1, v0, v10, v8, v11}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;Landroid/graphics/Rect;Landroid/graphics/RectF;Landroid/graphics/Paint;)V

    .line 188
    .line 189
    .line 190
    :cond_2
    invoke-virtual {v6}, Lh4/f;->b()Z

    .line 191
    .line 192
    .line 193
    move-result v0

    .line 194
    if-eqz v0, :cond_4

    .line 195
    .line 196
    sget-object v0, Le5/r;->a:Le5/r;

    .line 197
    .line 198
    invoke-virtual {v0, v8}, Le5/r;->f(Landroid/graphics/RectF;)Landroid/graphics/Path;

    .line 199
    .line 200
    .line 201
    move-result-object v0

    .line 202
    invoke-virtual {v6}, Lh4/f;->a()I

    .line 203
    .line 204
    .line 205
    move-result v6

    .line 206
    invoke-virtual {p0, v6}, Lh4/a;->a(I)Z

    .line 207
    .line 208
    .line 209
    move-result v6

    .line 210
    if-eqz v6, :cond_3

    .line 211
    .line 212
    const/high16 v6, -0x1000000

    .line 213
    .line 214
    goto :goto_2

    .line 215
    :cond_3
    const/4 v6, -0x1

    .line 216
    :goto_2
    invoke-virtual {v4, v6}, Landroid/graphics/Paint;->setColor(I)V

    .line 217
    .line 218
    .line 219
    sget-object v6, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    .line 220
    .line 221
    invoke-virtual {v4, v6}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 222
    .line 223
    .line 224
    const/high16 v6, 0x40400000    # 3.0f

    .line 225
    .line 226
    invoke-virtual {v4, v6}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 227
    .line 228
    .line 229
    invoke-virtual {p1, v0, v4}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    .line 230
    .line 231
    .line 232
    :cond_4
    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 233
    .line 234
    invoke-static {v0}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 235
    .line 236
    .line 237
    goto :goto_4

    .line 238
    :goto_3
    sget-object v6, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    .line 239
    .line 240
    invoke-static {v0}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    .line 241
    .line 242
    .line 243
    move-result-object v0

    .line 244
    invoke-static {v0}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    .line 245
    .line 246
    .line 247
    :goto_4
    invoke-virtual {p1, v9}, Landroid/graphics/Canvas;->restoreToCount(I)V

    .line 248
    .line 249
    .line 250
    move v0, v7

    .line 251
    goto/16 :goto_0

    .line 252
    .line 253
    :cond_5
    if-eqz v5, :cond_6

    .line 254
    .line 255
    invoke-virtual/range {p3 .. p3}, Li4/c;->b()Landroid/graphics/RectF;

    .line 256
    .line 257
    .line 258
    move-result-object v6

    .line 259
    move-object v1, p0

    .line 260
    move-object v2, p1

    .line 261
    move-object v3, p2

    .line 262
    move/from16 v5, p5

    .line 263
    .line 264
    invoke-virtual/range {v1 .. v6}, Lh4/a;->c(Landroid/graphics/Canvas;Li4/e;Landroid/graphics/Paint;ILandroid/graphics/RectF;)V

    .line 265
    .line 266
    .line 267
    :cond_6
    return-void
.end method

.method public final c(Landroid/graphics/Canvas;Li4/e;Landroid/graphics/Paint;ILandroid/graphics/RectF;)V
    .locals 1

    .line 1
    invoke-virtual {p2}, Li4/e;->b()Landroid/graphics/RectF;

    .line 2
    .line 3
    .line 4
    move-result-object p2

    .line 5
    sget-object v0, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    .line 6
    .line 7
    invoke-virtual {p3, v0}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 8
    .line 9
    .line 10
    invoke-virtual {p3, p4}, Landroid/graphics/Paint;->setColor(I)V

    .line 11
    .line 12
    .line 13
    const/high16 p4, 0x40c00000    # 6.0f

    .line 14
    .line 15
    invoke-virtual {p1, p5, p4, p4, p3}, Landroid/graphics/Canvas;->drawRoundRect(Landroid/graphics/RectF;FFLandroid/graphics/Paint;)V

    .line 16
    .line 17
    .line 18
    invoke-virtual {p1}, Landroid/graphics/Canvas;->save()I

    .line 19
    .line 20
    .line 21
    move-result p3

    .line 22
    iget p4, p2, Landroid/graphics/RectF;->left:F

    .line 23
    .line 24
    iget p2, p2, Landroid/graphics/RectF;->top:F

    .line 25
    .line 26
    invoke-virtual {p1, p4, p2}, Landroid/graphics/Canvas;->translate(FF)V

    .line 27
    .line 28
    .line 29
    iget-object p2, p0, Lh4/a;->a:Lcom/zykj/blackboard/bean/BoardConfig;

    .line 30
    .line 31
    invoke-virtual {p2}, Lcom/zykj/blackboard/bean/BoardConfig;->getSelectCustomColorView()Ld5/a;

    .line 32
    .line 33
    .line 34
    move-result-object p2

    .line 35
    if-eqz p2, :cond_0

    .line 36
    .line 37
    invoke-interface {p2, p1}, Ld5/a;->draw(Landroid/graphics/Canvas;)V

    .line 38
    .line 39
    .line 40
    :cond_0
    invoke-virtual {p1, p3}, Landroid/graphics/Canvas;->restoreToCount(I)V

    .line 41
    .line 42
    .line 43
    return-void
.end method

.method public final d(Landroid/graphics/Canvas;ILandroid/graphics/Path;Li4/e;Li4/c;Ljava/util/List;Landroid/graphics/PointF;)V
    .locals 14

    .line 1
    move-object/from16 v0, p3

    .line 2
    .line 3
    move-object/from16 v2, p7

    .line 4
    .line 5
    const-string v3, "canvas"

    .line 6
    .line 7
    invoke-static {p1, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    const-string v3, "path"

    .line 11
    .line 12
    invoke-static {v0, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    const-string v3, "functionRectF"

    .line 16
    .line 17
    move-object/from16 v4, p4

    .line 18
    .line 19
    invoke-static {v4, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    const-string v3, "functionBackgroundRectF"

    .line 23
    .line 24
    move-object/from16 v8, p5

    .line 25
    .line 26
    invoke-static {v8, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    const-string v3, "typeList"

    .line 30
    .line 31
    move-object/from16 v5, p6

    .line 32
    .line 33
    invoke-static {v5, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    new-instance v3, Ljava/util/ArrayList;

    .line 37
    .line 38
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 39
    .line 40
    .line 41
    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 42
    .line 43
    .line 44
    move-result-object v5

    .line 45
    :cond_0
    :goto_0
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 46
    .line 47
    .line 48
    move-result v6

    .line 49
    if-eqz v6, :cond_1

    .line 50
    .line 51
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 52
    .line 53
    .line 54
    move-result-object v6

    .line 55
    move-object v7, v6

    .line 56
    check-cast v7, Lh4/c;

    .line 57
    .line 58
    invoke-virtual {v7}, Lh4/c;->a()Ljava/lang/String;

    .line 59
    .line 60
    .line 61
    move-result-object v7

    .line 62
    invoke-interface {v7}, Ljava/lang/CharSequence;->length()I

    .line 63
    .line 64
    .line 65
    move-result v7

    .line 66
    if-lez v7, :cond_0

    .line 67
    .line 68
    invoke-interface {v3, v6}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 69
    .line 70
    .line 71
    goto :goto_0

    .line 72
    :cond_1
    invoke-interface {v3}, Ljava/util/List;->isEmpty()Z

    .line 73
    .line 74
    .line 75
    move-result v5

    .line 76
    if-eqz v5, :cond_2

    .line 77
    .line 78
    goto/16 :goto_6

    .line 79
    .line 80
    :cond_2
    move/from16 v5, p2

    .line 81
    .line 82
    invoke-virtual {p0, v5}, Lh4/a;->a(I)Z

    .line 83
    .line 84
    .line 85
    move-result v5

    .line 86
    if-eqz v5, :cond_3

    .line 87
    .line 88
    const/high16 v6, -0x41000000    # -0.5f

    .line 89
    .line 90
    goto :goto_1

    .line 91
    :cond_3
    const v6, 0x33ffffff

    .line 92
    .line 93
    .line 94
    :goto_1
    iget-object v7, p0, Lh4/a;->b:Landroid/graphics/Paint;

    .line 95
    .line 96
    const/high16 v9, 0x40400000    # 3.0f

    .line 97
    .line 98
    invoke-virtual {v7, v9}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 99
    .line 100
    .line 101
    iget-object v7, p0, Lh4/a;->b:Landroid/graphics/Paint;

    .line 102
    .line 103
    if-eqz v5, :cond_4

    .line 104
    .line 105
    const v5, -0xb8680d

    .line 106
    .line 107
    .line 108
    goto :goto_2

    .line 109
    :cond_4
    const v5, -0x333334

    .line 110
    .line 111
    .line 112
    :goto_2
    invoke-virtual {v7, v5}, Landroid/graphics/Paint;->setColor(I)V

    .line 113
    .line 114
    .line 115
    iget-object v5, p0, Lh4/a;->b:Landroid/graphics/Paint;

    .line 116
    .line 117
    sget-object v7, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    .line 118
    .line 119
    invoke-virtual {v5, v7}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 120
    .line 121
    .line 122
    iget-object v5, p0, Lh4/a;->b:Landroid/graphics/Paint;

    .line 123
    .line 124
    const/4 v9, 0x0

    .line 125
    invoke-virtual {v5, v9}, Landroid/graphics/Paint;->setPathEffect(Landroid/graphics/PathEffect;)Landroid/graphics/PathEffect;

    .line 126
    .line 127
    .line 128
    iget-object v5, p0, Lh4/a;->b:Landroid/graphics/Paint;

    .line 129
    .line 130
    invoke-virtual {p1, v0, v5}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    .line 131
    .line 132
    .line 133
    if-eqz v2, :cond_5

    .line 134
    .line 135
    iget-object v0, p0, Lh4/a;->b:Landroid/graphics/Paint;

    .line 136
    .line 137
    sget-object v5, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    .line 138
    .line 139
    invoke-virtual {v0, v5}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 140
    .line 141
    .line 142
    iget-object v0, p0, Lh4/a;->b:Landroid/graphics/Paint;

    .line 143
    .line 144
    const v5, -0x9a00

    .line 145
    .line 146
    .line 147
    invoke-virtual {v0, v5}, Landroid/graphics/Paint;->setColor(I)V

    .line 148
    .line 149
    .line 150
    iget v0, v2, Landroid/graphics/PointF;->x:F

    .line 151
    .line 152
    iget v2, v2, Landroid/graphics/PointF;->y:F

    .line 153
    .line 154
    iget-object v5, p0, Lh4/a;->a:Lcom/zykj/blackboard/bean/BoardConfig;

    .line 155
    .line 156
    invoke-virtual {v5}, Lcom/zykj/blackboard/bean/BoardConfig;->getSelectIconWidth()F

    .line 157
    .line 158
    .line 159
    move-result v5

    .line 160
    const/16 v10, 0x8

    .line 161
    .line 162
    int-to-float v10, v10

    .line 163
    div-float/2addr v5, v10

    .line 164
    iget-object v10, p0, Lh4/a;->b:Landroid/graphics/Paint;

    .line 165
    .line 166
    invoke-virtual {p1, v0, v2, v5, v10}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    .line 167
    .line 168
    .line 169
    :cond_5
    iget-object v0, p0, Lh4/a;->b:Landroid/graphics/Paint;

    .line 170
    .line 171
    const/high16 v2, 0x41c80000    # 25.0f

    .line 172
    .line 173
    invoke-virtual {v0, v2}, Landroid/graphics/Paint;->setTextSize(F)V

    .line 174
    .line 175
    .line 176
    iget-object v0, p0, Lh4/a;->b:Landroid/graphics/Paint;

    .line 177
    .line 178
    invoke-virtual {v0, v7}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 179
    .line 180
    .line 181
    invoke-virtual {v8}, Li4/c;->c()Landroid/graphics/RectF;

    .line 182
    .line 183
    .line 184
    move-result-object v0

    .line 185
    iget-object v5, p0, Lh4/a;->b:Landroid/graphics/Paint;

    .line 186
    .line 187
    sget-object v7, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    .line 188
    .line 189
    invoke-virtual {v5, v7}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 190
    .line 191
    .line 192
    iget-object v5, p0, Lh4/a;->b:Landroid/graphics/Paint;

    .line 193
    .line 194
    invoke-virtual {v5, v6}, Landroid/graphics/Paint;->setColor(I)V

    .line 195
    .line 196
    .line 197
    iget-object v5, p0, Lh4/a;->b:Landroid/graphics/Paint;

    .line 198
    .line 199
    const/high16 v10, 0x40c00000    # 6.0f

    .line 200
    .line 201
    invoke-virtual {p1, v0, v10, v10, v5}, Landroid/graphics/Canvas;->drawRoundRect(Landroid/graphics/RectF;FFLandroid/graphics/Paint;)V

    .line 202
    .line 203
    .line 204
    iget-object v5, p0, Lh4/a;->b:Landroid/graphics/Paint;

    .line 205
    .line 206
    invoke-virtual {v5, v7}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 207
    .line 208
    .line 209
    iget-object v5, p0, Lh4/a;->b:Landroid/graphics/Paint;

    .line 210
    .line 211
    const/high16 v7, -0x1000000

    .line 212
    .line 213
    invoke-virtual {v5, v7}, Landroid/graphics/Paint;->setColor(I)V

    .line 214
    .line 215
    .line 216
    iget-object v5, p0, Lh4/a;->b:Landroid/graphics/Paint;

    .line 217
    .line 218
    invoke-virtual {v5, v2}, Landroid/graphics/Paint;->setTextSize(F)V

    .line 219
    .line 220
    .line 221
    iget v2, v0, Landroid/graphics/RectF;->bottom:F

    .line 222
    .line 223
    invoke-virtual {v0}, Landroid/graphics/RectF;->height()F

    .line 224
    .line 225
    .line 226
    move-result v0

    .line 227
    iget-object v5, p0, Lh4/a;->b:Landroid/graphics/Paint;

    .line 228
    .line 229
    invoke-virtual {v5}, Landroid/graphics/Paint;->getFontMetrics()Landroid/graphics/Paint$FontMetrics;

    .line 230
    .line 231
    .line 232
    move-result-object v5

    .line 233
    iget v5, v5, Landroid/graphics/Paint$FontMetrics;->bottom:F

    .line 234
    .line 235
    iget-object v7, p0, Lh4/a;->b:Landroid/graphics/Paint;

    .line 236
    .line 237
    invoke-virtual {v7}, Landroid/graphics/Paint;->getFontMetrics()Landroid/graphics/Paint$FontMetrics;

    .line 238
    .line 239
    .line 240
    move-result-object v7

    .line 241
    iget v7, v7, Landroid/graphics/Paint$FontMetrics;->top:F

    .line 242
    .line 243
    sub-float/2addr v5, v7

    .line 244
    sub-float/2addr v0, v5

    .line 245
    const/4 v5, 0x2

    .line 246
    int-to-float v5, v5

    .line 247
    div-float/2addr v0, v5

    .line 248
    sub-float/2addr v2, v0

    .line 249
    iget-object v0, p0, Lh4/a;->b:Landroid/graphics/Paint;

    .line 250
    .line 251
    invoke-virtual {v0}, Landroid/graphics/Paint;->getFontMetrics()Landroid/graphics/Paint$FontMetrics;

    .line 252
    .line 253
    .line 254
    move-result-object v0

    .line 255
    iget v0, v0, Landroid/graphics/Paint$FontMetrics;->bottom:F

    .line 256
    .line 257
    sub-float/2addr v2, v0

    .line 258
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    .line 259
    .line 260
    .line 261
    move-result v0

    .line 262
    const/4 v5, 0x0

    .line 263
    move v7, v5

    .line 264
    :goto_3
    if-ge v7, v0, :cond_c

    .line 265
    .line 266
    invoke-virtual {v3, v7}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 267
    .line 268
    .line 269
    move-result-object v10

    .line 270
    add-int/lit8 v7, v7, 0x1

    .line 271
    .line 272
    check-cast v10, Lh4/c;

    .line 273
    .line 274
    instance-of v11, v10, Lh4/c$g;

    .line 275
    .line 276
    if-eqz v11, :cond_6

    .line 277
    .line 278
    invoke-virtual {v4}, Li4/e;->i()Landroid/graphics/RectF;

    .line 279
    .line 280
    .line 281
    move-result-object v11

    .line 282
    iget v11, v11, Landroid/graphics/RectF;->left:F

    .line 283
    .line 284
    goto :goto_4

    .line 285
    :cond_6
    instance-of v11, v10, Lh4/c$f;

    .line 286
    .line 287
    if-eqz v11, :cond_7

    .line 288
    .line 289
    invoke-virtual {v4}, Li4/e;->f()Landroid/graphics/RectF;

    .line 290
    .line 291
    .line 292
    move-result-object v11

    .line 293
    iget v11, v11, Landroid/graphics/RectF;->left:F

    .line 294
    .line 295
    goto :goto_4

    .line 296
    :cond_7
    instance-of v11, v10, Lh4/c$b;

    .line 297
    .line 298
    if-eqz v11, :cond_8

    .line 299
    .line 300
    invoke-virtual {v4}, Li4/e;->d()Landroid/graphics/RectF;

    .line 301
    .line 302
    .line 303
    move-result-object v11

    .line 304
    iget v11, v11, Landroid/graphics/RectF;->left:F

    .line 305
    .line 306
    goto :goto_4

    .line 307
    :cond_8
    instance-of v11, v10, Lh4/c$c;

    .line 308
    .line 309
    if-eqz v11, :cond_9

    .line 310
    .line 311
    invoke-virtual {v4}, Li4/e;->e()Landroid/graphics/RectF;

    .line 312
    .line 313
    .line 314
    move-result-object v11

    .line 315
    iget v11, v11, Landroid/graphics/RectF;->left:F

    .line 316
    .line 317
    goto :goto_4

    .line 318
    :cond_9
    instance-of v11, v10, Lh4/c$a;

    .line 319
    .line 320
    if-eqz v11, :cond_a

    .line 321
    .line 322
    invoke-virtual {v4}, Li4/e;->c()Landroid/graphics/RectF;

    .line 323
    .line 324
    .line 325
    move-result-object v11

    .line 326
    iget v11, v11, Landroid/graphics/RectF;->left:F

    .line 327
    .line 328
    goto :goto_4

    .line 329
    :cond_a
    const/high16 v11, 0x41000000    # 8.0f

    .line 330
    .line 331
    :goto_4
    const/high16 v12, 0x41700000    # 15.0f

    .line 332
    .line 333
    add-float/2addr v11, v12

    .line 334
    iget-object v12, p0, Lh4/a;->b:Landroid/graphics/Paint;

    .line 335
    .line 336
    invoke-virtual {v10}, Lh4/c;->b()Z

    .line 337
    .line 338
    .line 339
    move-result v13

    .line 340
    if-eqz v13, :cond_b

    .line 341
    .line 342
    const v13, -0xea8901

    .line 343
    .line 344
    .line 345
    goto :goto_5

    .line 346
    :cond_b
    const/4 v13, -0x1

    .line 347
    :goto_5
    invoke-virtual {v12, v13}, Landroid/graphics/Paint;->setColor(I)V

    .line 348
    .line 349
    .line 350
    invoke-virtual {v10}, Lh4/c;->a()Ljava/lang/String;

    .line 351
    .line 352
    .line 353
    move-result-object v10

    .line 354
    iget-object v12, p0, Lh4/a;->b:Landroid/graphics/Paint;

    .line 355
    .line 356
    invoke-virtual {p1, v10, v11, v2, v12}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V

    .line 357
    .line 358
    .line 359
    goto :goto_3

    .line 360
    :cond_c
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    .line 361
    .line 362
    .line 363
    move-result v0

    .line 364
    :cond_d
    if-ge v5, v0, :cond_e

    .line 365
    .line 366
    invoke-virtual {v3, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 367
    .line 368
    .line 369
    move-result-object v2

    .line 370
    add-int/lit8 v5, v5, 0x1

    .line 371
    .line 372
    move-object v7, v2

    .line 373
    check-cast v7, Lh4/c;

    .line 374
    .line 375
    invoke-virtual {v7}, Lh4/c;->b()Z

    .line 376
    .line 377
    .line 378
    move-result v7

    .line 379
    if-eqz v7, :cond_d

    .line 380
    .line 381
    move-object v9, v2

    .line 382
    :cond_e
    check-cast v9, Lh4/c;

    .line 383
    .line 384
    instance-of v0, v9, Lh4/c$g;

    .line 385
    .line 386
    if-eqz v0, :cond_f

    .line 387
    .line 388
    iget-object v3, p0, Lh4/a;->b:Landroid/graphics/Paint;

    .line 389
    .line 390
    invoke-virtual {v8}, Li4/c;->e()Landroid/graphics/RectF;

    .line 391
    .line 392
    .line 393
    move-result-object v5

    .line 394
    iget-object v0, p0, Lh4/a;->a:Lcom/zykj/blackboard/bean/BoardConfig;

    .line 395
    .line 396
    check-cast v9, Lh4/c$g;

    .line 397
    .line 398
    invoke-virtual {v9}, Lh4/c$g;->f()Z

    .line 399
    .line 400
    .line 401
    move-result v2

    .line 402
    invoke-virtual {v0, v2}, Lcom/zykj/blackboard/bean/BoardConfig;->getSelectStrokeWidthList(Z)Ljava/util/List;

    .line 403
    .line 404
    .line 405
    move-result-object v0

    .line 406
    invoke-virtual {v9}, Lh4/c$g;->e()F

    .line 407
    .line 408
    .line 409
    move-result v7

    .line 410
    move-object v1, p1

    .line 411
    move-object v2, v4

    .line 412
    move v4, v6

    .line 413
    move-object v6, v0

    .line 414
    move-object v0, p0

    .line 415
    invoke-virtual/range {v0 .. v7}, Lh4/a;->h(Landroid/graphics/Canvas;Li4/e;Landroid/graphics/Paint;ILandroid/graphics/RectF;Ljava/util/List;F)V

    .line 416
    .line 417
    .line 418
    move v5, v4

    .line 419
    iget-object v4, p0, Lh4/a;->b:Landroid/graphics/Paint;

    .line 420
    .line 421
    invoke-virtual {v9}, Lh4/c$g;->d()Ljava/util/List;

    .line 422
    .line 423
    .line 424
    move-result-object v6

    .line 425
    move-object/from16 v2, p4

    .line 426
    .line 427
    move-object v3, v8

    .line 428
    invoke-virtual/range {v0 .. v6}, Lh4/a;->b(Landroid/graphics/Canvas;Li4/e;Li4/c;Landroid/graphics/Paint;ILjava/util/List;)V

    .line 429
    .line 430
    .line 431
    return-void

    .line 432
    :cond_f
    move v5, v6

    .line 433
    instance-of v1, v9, Lh4/c$f;

    .line 434
    .line 435
    if-eqz v1, :cond_10

    .line 436
    .line 437
    iget-object v3, p0, Lh4/a;->b:Landroid/graphics/Paint;

    .line 438
    .line 439
    move v4, v5

    .line 440
    invoke-virtual/range {p5 .. p5}, Li4/c;->d()Landroid/graphics/RectF;

    .line 441
    .line 442
    .line 443
    move-result-object v5

    .line 444
    move-object v0, p0

    .line 445
    move-object v1, p1

    .line 446
    move-object/from16 v2, p4

    .line 447
    .line 448
    invoke-virtual/range {v0 .. v5}, Lh4/a;->g(Landroid/graphics/Canvas;Li4/e;Landroid/graphics/Paint;ILandroid/graphics/RectF;)V

    .line 449
    .line 450
    .line 451
    move v5, v4

    .line 452
    iget-object v4, p0, Lh4/a;->b:Landroid/graphics/Paint;

    .line 453
    .line 454
    check-cast v9, Lh4/c$f;

    .line 455
    .line 456
    invoke-virtual {v9}, Lh4/c$f;->d()Ljava/util/List;

    .line 457
    .line 458
    .line 459
    move-result-object v6

    .line 460
    move-object/from16 v3, p5

    .line 461
    .line 462
    invoke-virtual/range {v0 .. v6}, Lh4/a;->b(Landroid/graphics/Canvas;Li4/e;Li4/c;Landroid/graphics/Paint;ILjava/util/List;)V

    .line 463
    .line 464
    .line 465
    return-void

    .line 466
    :cond_10
    instance-of v1, v9, Lh4/c$b;

    .line 467
    .line 468
    if-eqz v1, :cond_11

    .line 469
    .line 470
    iget-object v4, p0, Lh4/a;->b:Landroid/graphics/Paint;

    .line 471
    .line 472
    check-cast v9, Lh4/c$b;

    .line 473
    .line 474
    invoke-virtual {v9}, Lh4/c$b;->d()Ljava/util/List;

    .line 475
    .line 476
    .line 477
    move-result-object v6

    .line 478
    move-object v0, p0

    .line 479
    move-object v1, p1

    .line 480
    move-object/from16 v2, p4

    .line 481
    .line 482
    move-object/from16 v3, p5

    .line 483
    .line 484
    invoke-virtual/range {v0 .. v6}, Lh4/a;->b(Landroid/graphics/Canvas;Li4/e;Li4/c;Landroid/graphics/Paint;ILjava/util/List;)V

    .line 485
    .line 486
    .line 487
    :cond_11
    :goto_6
    return-void
.end method

.method public final e(I)Landroid/graphics/Paint;
    .locals 3

    .line 1
    iget-object v0, p0, Lh4/a;->b:Landroid/graphics/Paint;

    .line 2
    .line 3
    const/high16 v1, 0x40400000    # 3.0f

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, Lh4/a;->b:Landroid/graphics/Paint;

    .line 9
    .line 10
    invoke-virtual {p0, p1}, Lh4/a;->a(I)Z

    .line 11
    .line 12
    .line 13
    move-result p1

    .line 14
    if-eqz p1, :cond_0

    .line 15
    .line 16
    const/high16 p1, -0x1000000

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_0
    const p1, -0x333334

    .line 20
    .line 21
    .line 22
    :goto_0
    invoke-virtual {v0, p1}, Landroid/graphics/Paint;->setColor(I)V

    .line 23
    .line 24
    .line 25
    iget-object p1, p0, Lh4/a;->b:Landroid/graphics/Paint;

    .line 26
    .line 27
    sget-object v0, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    .line 28
    .line 29
    invoke-virtual {p1, v0}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 30
    .line 31
    .line 32
    iget-object p1, p0, Lh4/a;->b:Landroid/graphics/Paint;

    .line 33
    .line 34
    new-instance v0, Landroid/graphics/DashPathEffect;

    .line 35
    .line 36
    const/4 v1, 0x2

    .line 37
    new-array v1, v1, [F

    .line 38
    .line 39
    fill-array-data v1, :array_0

    .line 40
    .line 41
    .line 42
    const/4 v2, 0x0

    .line 43
    invoke-direct {v0, v1, v2}, Landroid/graphics/DashPathEffect;-><init>([FF)V

    .line 44
    .line 45
    .line 46
    invoke-virtual {p1, v0}, Landroid/graphics/Paint;->setPathEffect(Landroid/graphics/PathEffect;)Landroid/graphics/PathEffect;

    .line 47
    .line 48
    .line 49
    iget-object p1, p0, Lh4/a;->b:Landroid/graphics/Paint;

    .line 50
    .line 51
    return-object p1

    .line 52
    nop

    .line 53
    :array_0
    .array-data 4
        0x41f00000    # 30.0f
        0x41700000    # 15.0f
    .end array-data
.end method

.method public final f(FFFF)Landroid/graphics/Path;
    .locals 6

    .line 1
    new-instance v0, Landroid/graphics/Path;

    .line 2
    .line 3
    invoke-direct {v0}, Landroid/graphics/Path;-><init>()V

    .line 4
    .line 5
    .line 6
    sget-object v5, Landroid/graphics/Path$Direction;->CW:Landroid/graphics/Path$Direction;

    .line 7
    .line 8
    move v1, p1

    .line 9
    move v2, p2

    .line 10
    move v3, p3

    .line 11
    move v4, p4

    .line 12
    invoke-virtual/range {v0 .. v5}, Landroid/graphics/Path;->addRect(FFFFLandroid/graphics/Path$Direction;)V

    .line 13
    .line 14
    .line 15
    invoke-virtual {v0}, Landroid/graphics/Path;->close()V

    .line 16
    .line 17
    .line 18
    return-object v0
.end method

.method public final g(Landroid/graphics/Canvas;Li4/e;Landroid/graphics/Paint;ILandroid/graphics/RectF;)V
    .locals 7

    .line 1
    sget-object v0, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    .line 2
    .line 3
    invoke-virtual {p3, v0}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual/range {p3 .. p4}, Landroid/graphics/Paint;->setColor(I)V

    .line 7
    .line 8
    .line 9
    const/high16 v0, 0x40c00000    # 6.0f

    .line 10
    .line 11
    invoke-virtual {p1, p5, v0, v0, p3}, Landroid/graphics/Canvas;->drawRoundRect(Landroid/graphics/RectF;FFLandroid/graphics/Paint;)V

    .line 12
    .line 13
    .line 14
    sget-object v0, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    .line 15
    .line 16
    invoke-virtual {p3, v0}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 17
    .line 18
    .line 19
    const/4 v0, -0x1

    .line 20
    invoke-virtual {p3, v0}, Landroid/graphics/Paint;->setColor(I)V

    .line 21
    .line 22
    .line 23
    const/high16 v0, 0x40400000    # 3.0f

    .line 24
    .line 25
    invoke-virtual {p3, v0}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 26
    .line 27
    .line 28
    invoke-virtual {p2}, Li4/e;->h()Landroid/graphics/RectF;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    invoke-virtual {v0}, Landroid/graphics/RectF;->centerX()F

    .line 33
    .line 34
    .line 35
    move-result v0

    .line 36
    const/high16 v6, 0x41400000    # 12.0f

    .line 37
    .line 38
    sub-float/2addr v0, v6

    .line 39
    invoke-virtual {p2}, Li4/e;->h()Landroid/graphics/RectF;

    .line 40
    .line 41
    .line 42
    move-result-object v2

    .line 43
    invoke-virtual {v2}, Landroid/graphics/RectF;->centerY()F

    .line 44
    .line 45
    .line 46
    move-result v2

    .line 47
    invoke-virtual {p2}, Li4/e;->h()Landroid/graphics/RectF;

    .line 48
    .line 49
    .line 50
    move-result-object v3

    .line 51
    invoke-virtual {v3}, Landroid/graphics/RectF;->centerX()F

    .line 52
    .line 53
    .line 54
    move-result v3

    .line 55
    add-float/2addr v3, v6

    .line 56
    invoke-virtual {p2}, Li4/e;->h()Landroid/graphics/RectF;

    .line 57
    .line 58
    .line 59
    move-result-object v4

    .line 60
    invoke-virtual {v4}, Landroid/graphics/RectF;->centerY()F

    .line 61
    .line 62
    .line 63
    move-result v4

    .line 64
    move-object v5, p3

    .line 65
    move v1, v0

    .line 66
    move-object v0, p1

    .line 67
    invoke-virtual/range {v0 .. v5}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    .line 68
    .line 69
    .line 70
    invoke-virtual {p2}, Li4/e;->g()Landroid/graphics/RectF;

    .line 71
    .line 72
    .line 73
    move-result-object v0

    .line 74
    invoke-virtual {v0}, Landroid/graphics/RectF;->centerX()F

    .line 75
    .line 76
    .line 77
    move-result v0

    .line 78
    sub-float v1, v0, v6

    .line 79
    .line 80
    invoke-virtual {p5}, Landroid/graphics/RectF;->centerY()F

    .line 81
    .line 82
    .line 83
    move-result v2

    .line 84
    invoke-virtual {p2}, Li4/e;->g()Landroid/graphics/RectF;

    .line 85
    .line 86
    .line 87
    move-result-object v0

    .line 88
    invoke-virtual {v0}, Landroid/graphics/RectF;->centerX()F

    .line 89
    .line 90
    .line 91
    move-result v0

    .line 92
    add-float v3, v0, v6

    .line 93
    .line 94
    invoke-virtual {p5}, Landroid/graphics/RectF;->centerY()F

    .line 95
    .line 96
    .line 97
    move-result v4

    .line 98
    move-object v0, p1

    .line 99
    invoke-virtual/range {v0 .. v5}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    .line 100
    .line 101
    .line 102
    invoke-virtual {p2}, Li4/e;->g()Landroid/graphics/RectF;

    .line 103
    .line 104
    .line 105
    move-result-object v0

    .line 106
    invoke-virtual {v0}, Landroid/graphics/RectF;->centerX()F

    .line 107
    .line 108
    .line 109
    move-result v1

    .line 110
    invoke-virtual {p5}, Landroid/graphics/RectF;->centerY()F

    .line 111
    .line 112
    .line 113
    move-result v0

    .line 114
    sub-float v2, v0, v6

    .line 115
    .line 116
    invoke-virtual {p2}, Li4/e;->g()Landroid/graphics/RectF;

    .line 117
    .line 118
    .line 119
    move-result-object v0

    .line 120
    invoke-virtual {v0}, Landroid/graphics/RectF;->centerX()F

    .line 121
    .line 122
    .line 123
    move-result v3

    .line 124
    invoke-virtual {p5}, Landroid/graphics/RectF;->centerY()F

    .line 125
    .line 126
    .line 127
    move-result v0

    .line 128
    add-float v4, v0, v6

    .line 129
    .line 130
    move-object v0, p1

    .line 131
    invoke-virtual/range {v0 .. v5}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    .line 132
    .line 133
    .line 134
    const/high16 v0, 0x40000000    # 2.0f

    .line 135
    .line 136
    invoke-virtual {p3, v0}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 137
    .line 138
    .line 139
    const v0, -0x7f000001

    .line 140
    .line 141
    .line 142
    invoke-virtual {p3, v0}, Landroid/graphics/Paint;->setColor(I)V

    .line 143
    .line 144
    .line 145
    invoke-virtual {p5}, Landroid/graphics/RectF;->centerX()F

    .line 146
    .line 147
    .line 148
    move-result v1

    .line 149
    invoke-virtual {p5}, Landroid/graphics/RectF;->centerY()F

    .line 150
    .line 151
    .line 152
    move-result v0

    .line 153
    sub-float v2, v0, v6

    .line 154
    .line 155
    invoke-virtual {p5}, Landroid/graphics/RectF;->centerX()F

    .line 156
    .line 157
    .line 158
    move-result v3

    .line 159
    invoke-virtual {p5}, Landroid/graphics/RectF;->centerY()F

    .line 160
    .line 161
    .line 162
    move-result v0

    .line 163
    add-float v4, v0, v6

    .line 164
    .line 165
    move-object v0, p1

    .line 166
    invoke-virtual/range {v0 .. v5}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    .line 167
    .line 168
    .line 169
    return-void
.end method

.method public final h(Landroid/graphics/Canvas;Li4/e;Landroid/graphics/Paint;ILandroid/graphics/RectF;Ljava/util/List;F)V
    .locals 3

    .line 1
    sget-object v0, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    .line 2
    .line 3
    invoke-virtual {p3, v0}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p3, p4}, Landroid/graphics/Paint;->setColor(I)V

    .line 7
    .line 8
    .line 9
    const/high16 p4, 0x40c00000    # 6.0f

    .line 10
    .line 11
    invoke-virtual {p1, p5, p4, p4, p3}, Landroid/graphics/Canvas;->drawRoundRect(Landroid/graphics/RectF;FFLandroid/graphics/Paint;)V

    .line 12
    .line 13
    .line 14
    invoke-interface {p6}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 15
    .line 16
    .line 17
    move-result-object p4

    .line 18
    const/4 p5, 0x0

    .line 19
    :goto_0
    invoke-interface {p4}, Ljava/util/Iterator;->hasNext()Z

    .line 20
    .line 21
    .line 22
    move-result p6

    .line 23
    if-eqz p6, :cond_2

    .line 24
    .line 25
    invoke-interface {p4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object p6

    .line 29
    add-int/lit8 v0, p5, 0x1

    .line 30
    .line 31
    if-gez p5, :cond_0

    .line 32
    .line 33
    invoke-static {}, Lkotlin/collections/CollectionsKt;->throwIndexOverflow()V

    .line 34
    .line 35
    .line 36
    :cond_0
    check-cast p6, Ljava/lang/Number;

    .line 37
    .line 38
    invoke-virtual {p6}, Ljava/lang/Number;->floatValue()F

    .line 39
    .line 40
    .line 41
    move-result p6

    .line 42
    cmpg-float p6, p6, p7

    .line 43
    .line 44
    if-nez p6, :cond_1

    .line 45
    .line 46
    const p6, -0xea8901

    .line 47
    .line 48
    .line 49
    goto :goto_1

    .line 50
    :cond_1
    const p6, -0x363637

    .line 51
    .line 52
    .line 53
    :goto_1
    invoke-virtual {p3, p6}, Landroid/graphics/Paint;->setColor(I)V

    .line 54
    .line 55
    .line 56
    int-to-float p6, p5

    .line 57
    const/high16 v1, 0x40400000    # 3.0f

    .line 58
    .line 59
    mul-float/2addr p6, v1

    .line 60
    const/high16 v1, 0x41000000    # 8.0f

    .line 61
    .line 62
    add-float/2addr p6, v1

    .line 63
    const/4 v1, 0x2

    .line 64
    int-to-float v1, v1

    .line 65
    div-float/2addr p6, v1

    .line 66
    invoke-virtual {p2}, Li4/e;->j()Ljava/util/ArrayList;

    .line 67
    .line 68
    .line 69
    move-result-object v1

    .line 70
    invoke-virtual {v1, p5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 71
    .line 72
    .line 73
    move-result-object v1

    .line 74
    check-cast v1, Landroid/graphics/RectF;

    .line 75
    .line 76
    invoke-virtual {v1}, Landroid/graphics/RectF;->centerX()F

    .line 77
    .line 78
    .line 79
    move-result v1

    .line 80
    invoke-virtual {p2}, Li4/e;->j()Ljava/util/ArrayList;

    .line 81
    .line 82
    .line 83
    move-result-object v2

    .line 84
    invoke-virtual {v2, p5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 85
    .line 86
    .line 87
    move-result-object p5

    .line 88
    check-cast p5, Landroid/graphics/RectF;

    .line 89
    .line 90
    invoke-virtual {p5}, Landroid/graphics/RectF;->centerY()F

    .line 91
    .line 92
    .line 93
    move-result p5

    .line 94
    invoke-virtual {p1, v1, p5, p6, p3}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    .line 95
    .line 96
    .line 97
    move p5, v0

    .line 98
    goto :goto_0

    .line 99
    :cond_2
    return-void
.end method

.method public final i(Landroid/graphics/RectF;Ljava/util/List;Landroid/graphics/Matrix;)Landroid/graphics/Path;
    .locals 20

    .line 1
    move-object/from16 v0, p1

    .line 2
    .line 3
    move-object/from16 v1, p2

    .line 4
    .line 5
    move-object/from16 v2, p3

    .line 6
    .line 7
    const-string v3, "selectRectF"

    .line 8
    .line 9
    invoke-static {v0, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    const-string v3, "typeList"

    .line 13
    .line 14
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    const-string v3, "matrix"

    .line 18
    .line 19
    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    new-instance v4, Landroid/graphics/Path;

    .line 23
    .line 24
    invoke-direct {v4}, Landroid/graphics/Path;-><init>()V

    .line 25
    .line 26
    .line 27
    invoke-static {v2}, Le5/m;->b(Landroid/graphics/Matrix;)Landroid/graphics/Matrix;

    .line 28
    .line 29
    .line 30
    move-result-object v3

    .line 31
    move-object/from16 v10, p0

    .line 32
    .line 33
    iget-object v5, v10, Lh4/a;->a:Lcom/zykj/blackboard/bean/BoardConfig;

    .line 34
    .line 35
    invoke-virtual {v5}, Lcom/zykj/blackboard/bean/BoardConfig;->getSelectIconWidth()F

    .line 36
    .line 37
    .line 38
    move-result v5

    .line 39
    invoke-virtual {v3, v5}, Landroid/graphics/Matrix;->mapRadius(F)F

    .line 40
    .line 41
    .line 42
    move-result v3

    .line 43
    const/4 v5, 0x2

    .line 44
    int-to-float v5, v5

    .line 45
    div-float v11, v3, v5

    .line 46
    .line 47
    const/4 v6, 0x4

    .line 48
    int-to-float v12, v6

    .line 49
    div-float v13, v11, v12

    .line 50
    .line 51
    invoke-virtual {v0}, Landroid/graphics/RectF;->width()F

    .line 52
    .line 53
    .line 54
    move-result v6

    .line 55
    div-float v14, v6, v5

    .line 56
    .line 57
    invoke-virtual {v0}, Landroid/graphics/RectF;->height()F

    .line 58
    .line 59
    .line 60
    move-result v6

    .line 61
    div-float v15, v6, v5

    .line 62
    .line 63
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 64
    .line 65
    .line 66
    move-result-object v5

    .line 67
    :cond_0
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 68
    .line 69
    .line 70
    move-result v6

    .line 71
    const/4 v7, 0x0

    .line 72
    if-eqz v6, :cond_1

    .line 73
    .line 74
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 75
    .line 76
    .line 77
    move-result-object v6

    .line 78
    move-object v8, v6

    .line 79
    check-cast v8, Lh4/c;

    .line 80
    .line 81
    instance-of v8, v8, Lh4/c$b;

    .line 82
    .line 83
    if-eqz v8, :cond_0

    .line 84
    .line 85
    goto :goto_0

    .line 86
    :cond_1
    move-object v6, v7

    .line 87
    :goto_0
    check-cast v6, Lh4/c;

    .line 88
    .line 89
    const/4 v5, 0x0

    .line 90
    if-eqz v6, :cond_2

    .line 91
    .line 92
    check-cast v6, Lh4/c$b;

    .line 93
    .line 94
    invoke-virtual {v6}, Lh4/c$b;->e()Z

    .line 95
    .line 96
    .line 97
    move-result v6

    .line 98
    move/from16 v16, v6

    .line 99
    .line 100
    goto :goto_1

    .line 101
    :cond_2
    move/from16 v16, v5

    .line 102
    .line 103
    :goto_1
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 104
    .line 105
    .line 106
    move-result-object v6

    .line 107
    :cond_3
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    .line 108
    .line 109
    .line 110
    move-result v8

    .line 111
    if-eqz v8, :cond_4

    .line 112
    .line 113
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 114
    .line 115
    .line 116
    move-result-object v8

    .line 117
    move-object v9, v8

    .line 118
    check-cast v9, Lh4/c;

    .line 119
    .line 120
    instance-of v9, v9, Lh4/c$f;

    .line 121
    .line 122
    if-eqz v9, :cond_3

    .line 123
    .line 124
    move-object v7, v8

    .line 125
    :cond_4
    check-cast v7, Lh4/c;

    .line 126
    .line 127
    if-eqz v7, :cond_5

    .line 128
    .line 129
    check-cast v7, Lh4/c$f;

    .line 130
    .line 131
    invoke-virtual {v7}, Lh4/c$f;->e()Z

    .line 132
    .line 133
    .line 134
    move-result v6

    .line 135
    move/from16 v17, v6

    .line 136
    .line 137
    goto :goto_2

    .line 138
    :cond_5
    move/from16 v17, v16

    .line 139
    .line 140
    :goto_2
    const/4 v6, 0x1

    .line 141
    if-eqz v1, :cond_7

    .line 142
    .line 143
    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    .line 144
    .line 145
    .line 146
    move-result v7

    .line 147
    if-eqz v7, :cond_7

    .line 148
    .line 149
    :cond_6
    move/from16 v18, v5

    .line 150
    .line 151
    goto :goto_3

    .line 152
    :cond_7
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 153
    .line 154
    .line 155
    move-result-object v7

    .line 156
    :cond_8
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    .line 157
    .line 158
    .line 159
    move-result v8

    .line 160
    if-eqz v8, :cond_6

    .line 161
    .line 162
    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 163
    .line 164
    .line 165
    move-result-object v8

    .line 166
    check-cast v8, Lh4/c;

    .line 167
    .line 168
    instance-of v8, v8, Lh4/c$d;

    .line 169
    .line 170
    if-eqz v8, :cond_8

    .line 171
    .line 172
    move/from16 v18, v6

    .line 173
    .line 174
    :goto_3
    if-eqz v1, :cond_a

    .line 175
    .line 176
    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    .line 177
    .line 178
    .line 179
    move-result v7

    .line 180
    if-eqz v7, :cond_a

    .line 181
    .line 182
    :cond_9
    move v1, v5

    .line 183
    goto :goto_4

    .line 184
    :cond_a
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 185
    .line 186
    .line 187
    move-result-object v1

    .line 188
    :cond_b
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 189
    .line 190
    .line 191
    move-result v7

    .line 192
    if-eqz v7, :cond_9

    .line 193
    .line 194
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 195
    .line 196
    .line 197
    move-result-object v7

    .line 198
    check-cast v7, Lh4/c;

    .line 199
    .line 200
    instance-of v7, v7, Lh4/c$e;

    .line 201
    .line 202
    if-eqz v7, :cond_b

    .line 203
    .line 204
    move v1, v6

    .line 205
    :goto_4
    iget v5, v0, Landroid/graphics/RectF;->left:F

    .line 206
    .line 207
    iget v6, v0, Landroid/graphics/RectF;->top:F

    .line 208
    .line 209
    invoke-virtual {v4, v5, v6}, Landroid/graphics/Path;->moveTo(FF)V

    .line 210
    .line 211
    .line 212
    iget v5, v0, Landroid/graphics/RectF;->left:F

    .line 213
    .line 214
    iget v6, v0, Landroid/graphics/RectF;->top:F

    .line 215
    .line 216
    add-float/2addr v6, v15

    .line 217
    sub-float/2addr v6, v13

    .line 218
    invoke-virtual {v4, v5, v6}, Landroid/graphics/Path;->lineTo(FF)V

    .line 219
    .line 220
    .line 221
    if-nez v16, :cond_c

    .line 222
    .line 223
    iget v5, v0, Landroid/graphics/RectF;->left:F

    .line 224
    .line 225
    iget v6, v0, Landroid/graphics/RectF;->top:F

    .line 226
    .line 227
    add-float/2addr v6, v15

    .line 228
    add-float/2addr v6, v13

    .line 229
    invoke-virtual {v4, v5, v6}, Landroid/graphics/Path;->lineTo(FF)V

    .line 230
    .line 231
    .line 232
    goto :goto_5

    .line 233
    :cond_c
    iget v5, v0, Landroid/graphics/RectF;->left:F

    .line 234
    .line 235
    move v6, v5

    .line 236
    sub-float v5, v6, v13

    .line 237
    .line 238
    iget v7, v0, Landroid/graphics/RectF;->top:F

    .line 239
    .line 240
    add-float v8, v7, v15

    .line 241
    .line 242
    sub-float/2addr v8, v13

    .line 243
    add-float/2addr v6, v13

    .line 244
    add-float/2addr v7, v15

    .line 245
    add-float/2addr v7, v13

    .line 246
    sget-object v9, Landroid/graphics/Path$Direction;->CW:Landroid/graphics/Path$Direction;

    .line 247
    .line 248
    move/from16 v19, v7

    .line 249
    .line 250
    move v7, v6

    .line 251
    move v6, v8

    .line 252
    move/from16 v8, v19

    .line 253
    .line 254
    invoke-virtual/range {v4 .. v9}, Landroid/graphics/Path;->addRect(FFFFLandroid/graphics/Path$Direction;)V

    .line 255
    .line 256
    .line 257
    iget v5, v0, Landroid/graphics/RectF;->left:F

    .line 258
    .line 259
    iget v6, v0, Landroid/graphics/RectF;->top:F

    .line 260
    .line 261
    add-float/2addr v6, v15

    .line 262
    add-float/2addr v6, v13

    .line 263
    invoke-virtual {v4, v5, v6}, Landroid/graphics/Path;->moveTo(FF)V

    .line 264
    .line 265
    .line 266
    :goto_5
    iget v5, v0, Landroid/graphics/RectF;->left:F

    .line 267
    .line 268
    iget v6, v0, Landroid/graphics/RectF;->bottom:F

    .line 269
    .line 270
    invoke-virtual {v4, v5, v6}, Landroid/graphics/Path;->lineTo(FF)V

    .line 271
    .line 272
    .line 273
    iget v5, v0, Landroid/graphics/RectF;->left:F

    .line 274
    .line 275
    add-float/2addr v5, v14

    .line 276
    sub-float/2addr v5, v13

    .line 277
    iget v6, v0, Landroid/graphics/RectF;->bottom:F

    .line 278
    .line 279
    invoke-virtual {v4, v5, v6}, Landroid/graphics/Path;->lineTo(FF)V

    .line 280
    .line 281
    .line 282
    if-nez v16, :cond_d

    .line 283
    .line 284
    iget v5, v0, Landroid/graphics/RectF;->left:F

    .line 285
    .line 286
    add-float/2addr v5, v14

    .line 287
    add-float/2addr v5, v13

    .line 288
    iget v6, v0, Landroid/graphics/RectF;->bottom:F

    .line 289
    .line 290
    invoke-virtual {v4, v5, v6}, Landroid/graphics/Path;->lineTo(FF)V

    .line 291
    .line 292
    .line 293
    goto :goto_6

    .line 294
    :cond_d
    iget v5, v0, Landroid/graphics/RectF;->left:F

    .line 295
    .line 296
    add-float v6, v5, v14

    .line 297
    .line 298
    sub-float/2addr v6, v13

    .line 299
    iget v7, v0, Landroid/graphics/RectF;->bottom:F

    .line 300
    .line 301
    move v8, v5

    .line 302
    move v5, v6

    .line 303
    sub-float v6, v7, v13

    .line 304
    .line 305
    add-float/2addr v8, v14

    .line 306
    add-float/2addr v8, v13

    .line 307
    add-float/2addr v7, v13

    .line 308
    sget-object v9, Landroid/graphics/Path$Direction;->CW:Landroid/graphics/Path$Direction;

    .line 309
    .line 310
    move/from16 v19, v8

    .line 311
    .line 312
    move v8, v7

    .line 313
    move/from16 v7, v19

    .line 314
    .line 315
    invoke-virtual/range {v4 .. v9}, Landroid/graphics/Path;->addRect(FFFFLandroid/graphics/Path$Direction;)V

    .line 316
    .line 317
    .line 318
    iget v5, v0, Landroid/graphics/RectF;->left:F

    .line 319
    .line 320
    add-float/2addr v5, v14

    .line 321
    add-float/2addr v5, v13

    .line 322
    iget v6, v0, Landroid/graphics/RectF;->bottom:F

    .line 323
    .line 324
    invoke-virtual {v4, v5, v6}, Landroid/graphics/Path;->moveTo(FF)V

    .line 325
    .line 326
    .line 327
    :goto_6
    iget v5, v0, Landroid/graphics/RectF;->right:F

    .line 328
    .line 329
    sub-float/2addr v5, v11

    .line 330
    iget v6, v0, Landroid/graphics/RectF;->bottom:F

    .line 331
    .line 332
    invoke-virtual {v4, v5, v6}, Landroid/graphics/Path;->lineTo(FF)V

    .line 333
    .line 334
    .line 335
    if-eqz v1, :cond_e

    .line 336
    .line 337
    sget-object v1, Le5/r;->a:Le5/r;

    .line 338
    .line 339
    iget v5, v0, Landroid/graphics/RectF;->right:F

    .line 340
    .line 341
    iget v6, v0, Landroid/graphics/RectF;->bottom:F

    .line 342
    .line 343
    invoke-virtual {v1, v4, v5, v6, v11}, Le5/r;->c(Landroid/graphics/Path;FFF)Landroid/graphics/Path;

    .line 344
    .line 345
    .line 346
    goto :goto_7

    .line 347
    :cond_e
    iget v1, v0, Landroid/graphics/RectF;->right:F

    .line 348
    .line 349
    iget v5, v0, Landroid/graphics/RectF;->bottom:F

    .line 350
    .line 351
    invoke-virtual {v4, v1, v5}, Landroid/graphics/Path;->lineTo(FF)V

    .line 352
    .line 353
    .line 354
    iget v1, v0, Landroid/graphics/RectF;->right:F

    .line 355
    .line 356
    iget v5, v0, Landroid/graphics/RectF;->bottom:F

    .line 357
    .line 358
    sub-float/2addr v5, v11

    .line 359
    invoke-virtual {v4, v1, v5}, Landroid/graphics/Path;->lineTo(FF)V

    .line 360
    .line 361
    .line 362
    :goto_7
    iget v1, v0, Landroid/graphics/RectF;->right:F

    .line 363
    .line 364
    iget v5, v0, Landroid/graphics/RectF;->bottom:F

    .line 365
    .line 366
    sub-float/2addr v5, v11

    .line 367
    invoke-virtual {v4, v1, v5}, Landroid/graphics/Path;->moveTo(FF)V

    .line 368
    .line 369
    .line 370
    iget v1, v0, Landroid/graphics/RectF;->right:F

    .line 371
    .line 372
    iget v5, v0, Landroid/graphics/RectF;->top:F

    .line 373
    .line 374
    add-float/2addr v5, v15

    .line 375
    add-float/2addr v5, v13

    .line 376
    invoke-virtual {v4, v1, v5}, Landroid/graphics/Path;->lineTo(FF)V

    .line 377
    .line 378
    .line 379
    if-nez v17, :cond_f

    .line 380
    .line 381
    iget v1, v0, Landroid/graphics/RectF;->right:F

    .line 382
    .line 383
    iget v5, v0, Landroid/graphics/RectF;->top:F

    .line 384
    .line 385
    add-float/2addr v5, v15

    .line 386
    sub-float/2addr v5, v13

    .line 387
    invoke-virtual {v4, v1, v5}, Landroid/graphics/Path;->lineTo(FF)V

    .line 388
    .line 389
    .line 390
    goto :goto_8

    .line 391
    :cond_f
    iget v1, v0, Landroid/graphics/RectF;->right:F

    .line 392
    .line 393
    sub-float v5, v1, v13

    .line 394
    .line 395
    iget v6, v0, Landroid/graphics/RectF;->top:F

    .line 396
    .line 397
    add-float v7, v6, v15

    .line 398
    .line 399
    sub-float/2addr v7, v13

    .line 400
    add-float/2addr v1, v13

    .line 401
    add-float/2addr v6, v15

    .line 402
    add-float v8, v6, v13

    .line 403
    .line 404
    sget-object v9, Landroid/graphics/Path$Direction;->CW:Landroid/graphics/Path$Direction;

    .line 405
    .line 406
    move v6, v7

    .line 407
    move v7, v1

    .line 408
    invoke-virtual/range {v4 .. v9}, Landroid/graphics/Path;->addRect(FFFFLandroid/graphics/Path$Direction;)V

    .line 409
    .line 410
    .line 411
    iget v1, v0, Landroid/graphics/RectF;->right:F

    .line 412
    .line 413
    iget v5, v0, Landroid/graphics/RectF;->top:F

    .line 414
    .line 415
    add-float/2addr v5, v15

    .line 416
    sub-float/2addr v5, v13

    .line 417
    invoke-virtual {v4, v1, v5}, Landroid/graphics/Path;->moveTo(FF)V

    .line 418
    .line 419
    .line 420
    :goto_8
    iget v1, v0, Landroid/graphics/RectF;->right:F

    .line 421
    .line 422
    iget v5, v0, Landroid/graphics/RectF;->top:F

    .line 423
    .line 424
    invoke-virtual {v4, v1, v5}, Landroid/graphics/Path;->lineTo(FF)V

    .line 425
    .line 426
    .line 427
    iget v1, v0, Landroid/graphics/RectF;->right:F

    .line 428
    .line 429
    iget v5, v0, Landroid/graphics/RectF;->top:F

    .line 430
    .line 431
    invoke-virtual {v4, v1, v5}, Landroid/graphics/Path;->moveTo(FF)V

    .line 432
    .line 433
    .line 434
    iget v1, v0, Landroid/graphics/RectF;->left:F

    .line 435
    .line 436
    add-float/2addr v1, v14

    .line 437
    add-float/2addr v1, v13

    .line 438
    iget v5, v0, Landroid/graphics/RectF;->top:F

    .line 439
    .line 440
    invoke-virtual {v4, v1, v5}, Landroid/graphics/Path;->lineTo(FF)V

    .line 441
    .line 442
    .line 443
    if-nez v16, :cond_10

    .line 444
    .line 445
    iget v1, v0, Landroid/graphics/RectF;->left:F

    .line 446
    .line 447
    add-float/2addr v1, v14

    .line 448
    sub-float/2addr v1, v13

    .line 449
    iget v5, v0, Landroid/graphics/RectF;->top:F

    .line 450
    .line 451
    invoke-virtual {v4, v1, v5}, Landroid/graphics/Path;->lineTo(FF)V

    .line 452
    .line 453
    .line 454
    goto :goto_9

    .line 455
    :cond_10
    iget v1, v0, Landroid/graphics/RectF;->left:F

    .line 456
    .line 457
    add-float v5, v1, v14

    .line 458
    .line 459
    sub-float/2addr v5, v13

    .line 460
    iget v6, v0, Landroid/graphics/RectF;->top:F

    .line 461
    .line 462
    move v7, v6

    .line 463
    sub-float v6, v7, v13

    .line 464
    .line 465
    add-float/2addr v1, v14

    .line 466
    add-float/2addr v1, v13

    .line 467
    add-float v8, v7, v13

    .line 468
    .line 469
    sget-object v9, Landroid/graphics/Path$Direction;->CW:Landroid/graphics/Path$Direction;

    .line 470
    .line 471
    move v7, v1

    .line 472
    invoke-virtual/range {v4 .. v9}, Landroid/graphics/Path;->addRect(FFFFLandroid/graphics/Path$Direction;)V

    .line 473
    .line 474
    .line 475
    iget v1, v0, Landroid/graphics/RectF;->left:F

    .line 476
    .line 477
    add-float/2addr v1, v14

    .line 478
    sub-float/2addr v1, v13

    .line 479
    iget v5, v0, Landroid/graphics/RectF;->top:F

    .line 480
    .line 481
    invoke-virtual {v4, v1, v5}, Landroid/graphics/Path;->moveTo(FF)V

    .line 482
    .line 483
    .line 484
    :goto_9
    iget v1, v0, Landroid/graphics/RectF;->left:F

    .line 485
    .line 486
    iget v5, v0, Landroid/graphics/RectF;->top:F

    .line 487
    .line 488
    invoke-virtual {v4, v1, v5}, Landroid/graphics/Path;->lineTo(FF)V

    .line 489
    .line 490
    .line 491
    if-eqz v18, :cond_12

    .line 492
    .line 493
    const/4 v1, 0x5

    .line 494
    int-to-float v1, v1

    .line 495
    mul-float/2addr v3, v1

    .line 496
    div-float/2addr v3, v12

    .line 497
    iget v1, v0, Landroid/graphics/RectF;->left:F

    .line 498
    .line 499
    add-float/2addr v1, v14

    .line 500
    iget v5, v0, Landroid/graphics/RectF;->top:F

    .line 501
    .line 502
    sub-float/2addr v5, v13

    .line 503
    sub-float/2addr v5, v3

    .line 504
    invoke-virtual {v4, v1, v5}, Landroid/graphics/Path;->moveTo(FF)V

    .line 505
    .line 506
    .line 507
    iget v1, v0, Landroid/graphics/RectF;->left:F

    .line 508
    .line 509
    add-float/2addr v1, v14

    .line 510
    iget v5, v0, Landroid/graphics/RectF;->top:F

    .line 511
    .line 512
    sub-float/2addr v5, v13

    .line 513
    invoke-virtual {v4, v1, v5}, Landroid/graphics/Path;->lineTo(FF)V

    .line 514
    .line 515
    .line 516
    if-nez v16, :cond_11

    .line 517
    .line 518
    iget v1, v0, Landroid/graphics/RectF;->left:F

    .line 519
    .line 520
    add-float/2addr v1, v14

    .line 521
    iget v5, v0, Landroid/graphics/RectF;->top:F

    .line 522
    .line 523
    invoke-virtual {v4, v1, v5}, Landroid/graphics/Path;->lineTo(FF)V

    .line 524
    .line 525
    .line 526
    :cond_11
    sget-object v1, Le5/r;->a:Le5/r;

    .line 527
    .line 528
    iget v5, v0, Landroid/graphics/RectF;->left:F

    .line 529
    .line 530
    add-float/2addr v5, v14

    .line 531
    iget v0, v0, Landroid/graphics/RectF;->top:F

    .line 532
    .line 533
    sub-float/2addr v0, v13

    .line 534
    sub-float/2addr v0, v3

    .line 535
    sub-float/2addr v0, v11

    .line 536
    invoke-virtual {v1, v4, v5, v0, v11}, Le5/r;->b(Landroid/graphics/Path;FFF)Landroid/graphics/Path;

    .line 537
    .line 538
    .line 539
    :cond_12
    invoke-virtual {v4, v2}, Landroid/graphics/Path;->transform(Landroid/graphics/Matrix;)V

    .line 540
    .line 541
    .line 542
    return-object v4
.end method
