# RE note 本类字节码直接引用的读写或显示接口包括文件流。
.class public final Lcom/zykj/blackboard/utils/GraphUtils;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/zykj/blackboard/utils/GraphUtils$WhenMappings;
    }
.end annotation


# static fields
.field public static final INSTANCE:Lcom/zykj/blackboard/utils/GraphUtils;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/zykj/blackboard/utils/GraphUtils;

    invoke-direct {v0}, Lcom/zykj/blackboard/utils/GraphUtils;-><init>()V

    sput-object v0, Lcom/zykj/blackboard/utils/GraphUtils;->INSTANCE:Lcom/zykj/blackboard/utils/GraphUtils;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private final convertMatrix(Lcom/zykj/board/EzyMatrix$Matrix;)Landroid/graphics/Matrix;
    .locals 10

    .line 1
    invoke-virtual {p1}, Lcom/zykj/board/EzyMatrix$Matrix;->getScaleX()F

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-virtual {p1}, Lcom/zykj/board/EzyMatrix$Matrix;->q()F

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    invoke-virtual {p1}, Lcom/zykj/board/EzyMatrix$Matrix;->s()F

    .line 10
    .line 11
    .line 12
    move-result v2

    .line 13
    invoke-virtual {p1}, Lcom/zykj/board/EzyMatrix$Matrix;->r()F

    .line 14
    .line 15
    .line 16
    move-result v3

    .line 17
    invoke-virtual {p1}, Lcom/zykj/board/EzyMatrix$Matrix;->getScaleY()F

    .line 18
    .line 19
    .line 20
    move-result v4

    .line 21
    invoke-virtual {p1}, Lcom/zykj/board/EzyMatrix$Matrix;->t()F

    .line 22
    .line 23
    .line 24
    move-result v5

    .line 25
    invoke-virtual {p1}, Lcom/zykj/board/EzyMatrix$Matrix;->n()F

    .line 26
    .line 27
    .line 28
    move-result v6

    .line 29
    invoke-virtual {p1}, Lcom/zykj/board/EzyMatrix$Matrix;->o()F

    .line 30
    .line 31
    .line 32
    move-result v7

    .line 33
    invoke-virtual {p1}, Lcom/zykj/board/EzyMatrix$Matrix;->p()F

    .line 34
    .line 35
    .line 36
    move-result p1

    .line 37
    const/16 v8, 0x9

    .line 38
    .line 39
    new-array v8, v8, [F

    .line 40
    .line 41
    const/4 v9, 0x0

    .line 42
    aput v0, v8, v9

    .line 43
    .line 44
    const/4 v0, 0x1

    .line 45
    aput v1, v8, v0

    .line 46
    .line 47
    const/4 v0, 0x2

    .line 48
    aput v2, v8, v0

    .line 49
    .line 50
    const/4 v0, 0x3

    .line 51
    aput v3, v8, v0

    .line 52
    .line 53
    const/4 v0, 0x4

    .line 54
    aput v4, v8, v0

    .line 55
    .line 56
    const/4 v0, 0x5

    .line 57
    aput v5, v8, v0

    .line 58
    .line 59
    const/4 v0, 0x6

    .line 60
    aput v6, v8, v0

    .line 61
    .line 62
    const/4 v0, 0x7

    .line 63
    aput v7, v8, v0

    .line 64
    .line 65
    const/16 v0, 0x8

    .line 66
    .line 67
    aput p1, v8, v0

    .line 68
    .line 69
    new-instance p1, Landroid/graphics/Matrix;

    .line 70
    .line 71
    invoke-direct {p1}, Landroid/graphics/Matrix;-><init>()V

    .line 72
    .line 73
    .line 74
    invoke-virtual {p1, v8}, Landroid/graphics/Matrix;->setValues([F)V

    .line 75
    .line 76
    .line 77
    return-object p1
.end method


# virtual methods
.method public final buildGraph(Lcom/zykj/blackboard/core/loader/SourceLoader;Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;)Lcom/zykj/blackboard/core/graph/Graph;
    .locals 17

    .line 1
    move-object/from16 v3, p1

    .line 2
    .line 3
    const-string v0, "sourceLoad"

    .line 4
    .line 5
    invoke-static {v3, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    const-string v0, "pageSnapshot"

    .line 9
    .line 10
    move-object/from16 v6, p2

    .line 11
    .line 12
    invoke-static {v6, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    invoke-virtual {v6}, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;->A()Lcom/zykj/board/EzyGraphEnum$GraphEnum;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    if-nez v0, :cond_0

    .line 20
    .line 21
    const/4 v0, -0x1

    .line 22
    goto :goto_0

    .line 23
    :cond_0
    sget-object v1, Lcom/zykj/blackboard/utils/GraphUtils$WhenMappings;->$EnumSwitchMapping$0:[I

    .line 24
    .line 25
    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    aget v0, v1, v0

    .line 30
    .line 31
    :goto_0
    const-string v7, "pageSnapshot.paint"

    .line 32
    .line 33
    const/4 v8, 0x0

    .line 34
    const-string v9, "pageSnapshot.matrix"

    .line 35
    .line 36
    const-string v1, "pageSnapshot.outRect"

    .line 37
    .line 38
    const-string v2, "pageSnapshot.id"

    .line 39
    .line 40
    packed-switch v0, :pswitch_data_0

    .line 41
    .line 42
    .line 43
    goto/16 :goto_6

    .line 44
    .line 45
    :pswitch_0
    new-instance v0, Lcom/zykj/blackboard/core/graph/group/GeometryGraph;

    .line 46
    .line 47
    invoke-virtual {v6}, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;->getId()Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object v4

    .line 51
    invoke-static {v4, v2}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 52
    .line 53
    .line 54
    invoke-virtual {v6}, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;->D()Lcom/zykj/board/EzyRectF$RectF;

    .line 55
    .line 56
    .line 57
    move-result-object v2

    .line 58
    invoke-static {v2, v1}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 59
    .line 60
    .line 61
    invoke-static {v2}, Lcom/zykj/blackboard/utils/GraphUtilsKt;->covertRectF(Lcom/zykj/board/EzyRectF$RectF;)Landroid/graphics/RectF;

    .line 62
    .line 63
    .line 64
    move-result-object v2

    .line 65
    move-object v1, v4

    .line 66
    invoke-virtual {v6}, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;->H()Ljava/lang/String;

    .line 67
    .line 68
    .line 69
    move-result-object v4

    .line 70
    invoke-virtual {v6}, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;->I()I

    .line 71
    .line 72
    .line 73
    move-result v5

    .line 74
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 75
    .line 76
    .line 77
    move-result-object v5

    .line 78
    invoke-direct/range {v0 .. v5}, Lcom/zykj/blackboard/core/graph/group/GeometryGraph;-><init>(Ljava/lang/String;Landroid/graphics/RectF;Lcom/zykj/blackboard/core/loader/SourceLoader;Ljava/lang/String;Ljava/lang/Integer;)V

    .line 79
    .line 80
    .line 81
    sget-object v1, Lcom/zykj/blackboard/utils/GraphUtils;->INSTANCE:Lcom/zykj/blackboard/utils/GraphUtils;

    .line 82
    .line 83
    invoke-virtual {v6}, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;->C()Lcom/zykj/board/EzyMatrix$Matrix;

    .line 84
    .line 85
    .line 86
    move-result-object v2

    .line 87
    invoke-static {v2, v9}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 88
    .line 89
    .line 90
    invoke-direct {v1, v2}, Lcom/zykj/blackboard/utils/GraphUtils;->convertMatrix(Lcom/zykj/board/EzyMatrix$Matrix;)Landroid/graphics/Matrix;

    .line 91
    .line 92
    .line 93
    move-result-object v1

    .line 94
    invoke-virtual {v0, v1}, Lcom/zykj/blackboard/core/graph/Graph;->initMatrix(Landroid/graphics/Matrix;)V

    .line 95
    .line 96
    .line 97
    invoke-virtual {v6}, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;->E()Lcom/zykj/board/EzyPaint$Paint;

    .line 98
    .line 99
    .line 100
    move-result-object v1

    .line 101
    invoke-static {v1, v7}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 102
    .line 103
    .line 104
    invoke-static {v1}, Lcom/zykj/blackboard/utils/GraphUtilsKt;->covertPaint(Lcom/zykj/board/EzyPaint$Paint;)Landroid/graphics/Paint;

    .line 105
    .line 106
    .line 107
    move-result-object v1

    .line 108
    invoke-virtual {v0, v1}, Lcom/zykj/blackboard/core/graph/group/GeometryGraph;->setPaint(Landroid/graphics/Paint;)V

    .line 109
    .line 110
    .line 111
    invoke-virtual {v6}, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;->G()Ljava/util/List;

    .line 112
    .line 113
    .line 114
    move-result-object v1

    .line 115
    const-string v2, "pageSnapshot.pointListList"

    .line 116
    .line 117
    invoke-static {v1, v2}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 118
    .line 119
    .line 120
    new-instance v2, Ljava/util/ArrayList;

    .line 121
    .line 122
    const/16 v3, 0xa

    .line 123
    .line 124
    invoke-static {v1, v3}, Li7/w;->x(Ljava/lang/Iterable;I)I

    .line 125
    .line 126
    .line 127
    move-result v3

    .line 128
    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(I)V

    .line 129
    .line 130
    .line 131
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 132
    .line 133
    .line 134
    move-result-object v1

    .line 135
    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 136
    .line 137
    .line 138
    move-result v3

    .line 139
    if-eqz v3, :cond_1

    .line 140
    .line 141
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 142
    .line 143
    .line 144
    move-result-object v3

    .line 145
    check-cast v3, Lcom/zykj/board/EzyPointF$PointF;

    .line 146
    .line 147
    const-string v4, "it"

    .line 148
    .line 149
    invoke-static {v3, v4}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 150
    .line 151
    .line 152
    invoke-static {v3}, Lcom/zykj/blackboard/utils/GraphUtilsKt;->covertPointF(Lcom/zykj/board/EzyPointF$PointF;)Landroid/graphics/PointF;

    .line 153
    .line 154
    .line 155
    move-result-object v3

    .line 156
    invoke-interface {v2, v3}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 157
    .line 158
    .line 159
    goto :goto_1

    .line 160
    :cond_1
    invoke-virtual {v0, v2}, Lcom/zykj/blackboard/core/graph/group/GeometryGraph;->setPointList(Ljava/util/List;)V

    .line 161
    .line 162
    .line 163
    :cond_2
    :goto_2
    move-object/from16 v3, p1

    .line 164
    .line 165
    :goto_3
    move-object v8, v0

    .line 166
    goto/16 :goto_6

    .line 167
    .line 168
    :pswitch_1
    new-instance v0, Lcom/zykj/blackboard/core/graph/group/TextGraph;

    .line 169
    .line 170
    invoke-virtual {v6}, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;->getId()Ljava/lang/String;

    .line 171
    .line 172
    .line 173
    move-result-object v3

    .line 174
    invoke-static {v3, v2}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 175
    .line 176
    .line 177
    invoke-virtual {v6}, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;->D()Lcom/zykj/board/EzyRectF$RectF;

    .line 178
    .line 179
    .line 180
    move-result-object v2

    .line 181
    invoke-static {v2, v1}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 182
    .line 183
    .line 184
    invoke-static {v2}, Lcom/zykj/blackboard/utils/GraphUtilsKt;->covertRectF(Lcom/zykj/board/EzyRectF$RectF;)Landroid/graphics/RectF;

    .line 185
    .line 186
    .line 187
    move-result-object v2

    .line 188
    invoke-virtual {v6}, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;->H()Ljava/lang/String;

    .line 189
    .line 190
    .line 191
    move-result-object v4

    .line 192
    invoke-virtual {v6}, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;->I()I

    .line 193
    .line 194
    .line 195
    move-result v1

    .line 196
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 197
    .line 198
    .line 199
    move-result-object v5

    .line 200
    move-object v1, v3

    .line 201
    move-object/from16 v3, p1

    .line 202
    .line 203
    invoke-direct/range {v0 .. v5}, Lcom/zykj/blackboard/core/graph/group/TextGraph;-><init>(Ljava/lang/String;Landroid/graphics/RectF;Lcom/zykj/blackboard/core/loader/SourceLoader;Ljava/lang/String;Ljava/lang/Integer;)V

    .line 204
    .line 205
    .line 206
    sget-object v1, Lcom/zykj/blackboard/utils/GraphUtils;->INSTANCE:Lcom/zykj/blackboard/utils/GraphUtils;

    .line 207
    .line 208
    invoke-virtual {v6}, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;->C()Lcom/zykj/board/EzyMatrix$Matrix;

    .line 209
    .line 210
    .line 211
    move-result-object v2

    .line 212
    invoke-static {v2, v9}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 213
    .line 214
    .line 215
    invoke-direct {v1, v2}, Lcom/zykj/blackboard/utils/GraphUtils;->convertMatrix(Lcom/zykj/board/EzyMatrix$Matrix;)Landroid/graphics/Matrix;

    .line 216
    .line 217
    .line 218
    move-result-object v1

    .line 219
    invoke-virtual {v0, v1}, Lcom/zykj/blackboard/core/graph/Graph;->initMatrix(Landroid/graphics/Matrix;)V

    .line 220
    .line 221
    .line 222
    invoke-virtual {v6}, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;->E()Lcom/zykj/board/EzyPaint$Paint;

    .line 223
    .line 224
    .line 225
    move-result-object v1

    .line 226
    invoke-static {v1, v7}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 227
    .line 228
    .line 229
    invoke-static {v1}, Lcom/zykj/blackboard/utils/GraphUtilsKt;->covertPaint(Lcom/zykj/board/EzyPaint$Paint;)Landroid/graphics/Paint;

    .line 230
    .line 231
    .line 232
    move-result-object v1

    .line 233
    invoke-virtual {v0, v1}, Lcom/zykj/blackboard/core/graph/group/TextGraph;->setPaint(Landroid/graphics/Paint;)V

    .line 234
    .line 235
    .line 236
    invoke-virtual {v6}, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;->getContent()Ljava/lang/String;

    .line 237
    .line 238
    .line 239
    move-result-object v1

    .line 240
    invoke-virtual {v0, v1}, Lcom/zykj/blackboard/core/graph/group/TextGraph;->setContent(Ljava/lang/String;)V

    .line 241
    .line 242
    .line 243
    goto :goto_3

    .line 244
    :pswitch_2
    new-instance v10, Lcom/zykj/blackboard/core/graph/group/GroupGraph;

    .line 245
    .line 246
    invoke-virtual {v6}, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;->getId()Ljava/lang/String;

    .line 247
    .line 248
    .line 249
    move-result-object v11

    .line 250
    invoke-static {v11, v2}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 251
    .line 252
    .line 253
    invoke-virtual {v6}, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;->D()Lcom/zykj/board/EzyRectF$RectF;

    .line 254
    .line 255
    .line 256
    move-result-object v0

    .line 257
    invoke-static {v0, v1}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 258
    .line 259
    .line 260
    invoke-static {v0}, Lcom/zykj/blackboard/utils/GraphUtilsKt;->covertRectF(Lcom/zykj/board/EzyRectF$RectF;)Landroid/graphics/RectF;

    .line 261
    .line 262
    .line 263
    move-result-object v12

    .line 264
    const/16 v15, 0xc

    .line 265
    .line 266
    const/16 v16, 0x0

    .line 267
    .line 268
    const/4 v13, 0x0

    .line 269
    const/4 v14, 0x0

    .line 270
    invoke-direct/range {v10 .. v16}, Lcom/zykj/blackboard/core/graph/group/GroupGraph;-><init>(Ljava/lang/String;Landroid/graphics/RectF;Ljava/lang/String;Ljava/lang/Integer;ILkotlin/jvm/internal/n;)V

    .line 271
    .line 272
    .line 273
    sget-object v0, Lcom/zykj/blackboard/utils/GraphUtils;->INSTANCE:Lcom/zykj/blackboard/utils/GraphUtils;

    .line 274
    .line 275
    invoke-virtual {v6}, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;->C()Lcom/zykj/board/EzyMatrix$Matrix;

    .line 276
    .line 277
    .line 278
    move-result-object v1

    .line 279
    invoke-static {v1, v9}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 280
    .line 281
    .line 282
    invoke-direct {v0, v1}, Lcom/zykj/blackboard/utils/GraphUtils;->convertMatrix(Lcom/zykj/board/EzyMatrix$Matrix;)Landroid/graphics/Matrix;

    .line 283
    .line 284
    .line 285
    move-result-object v0

    .line 286
    invoke-virtual {v10, v0}, Lcom/zykj/blackboard/core/graph/Graph;->initMatrix(Landroid/graphics/Matrix;)V

    .line 287
    .line 288
    .line 289
    move-object/from16 v3, p1

    .line 290
    .line 291
    :goto_4
    move-object v8, v10

    .line 292
    goto/16 :goto_6

    .line 293
    .line 294
    :pswitch_3
    new-instance v0, Lcom/zykj/blackboard/core/graph/stroke/BeelineStrokeGraph;

    .line 295
    .line 296
    invoke-virtual {v6}, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;->getId()Ljava/lang/String;

    .line 297
    .line 298
    .line 299
    move-result-object v3

    .line 300
    invoke-static {v3, v2}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 301
    .line 302
    .line 303
    invoke-virtual {v6}, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;->D()Lcom/zykj/board/EzyRectF$RectF;

    .line 304
    .line 305
    .line 306
    move-result-object v2

    .line 307
    invoke-static {v2, v1}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 308
    .line 309
    .line 310
    invoke-static {v2}, Lcom/zykj/blackboard/utils/GraphUtilsKt;->covertRectF(Lcom/zykj/board/EzyRectF$RectF;)Landroid/graphics/RectF;

    .line 311
    .line 312
    .line 313
    move-result-object v2

    .line 314
    invoke-virtual {v6}, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;->H()Ljava/lang/String;

    .line 315
    .line 316
    .line 317
    move-result-object v4

    .line 318
    invoke-virtual {v6}, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;->I()I

    .line 319
    .line 320
    .line 321
    move-result v1

    .line 322
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 323
    .line 324
    .line 325
    move-result-object v5

    .line 326
    move-object v1, v3

    .line 327
    move-object/from16 v3, p1

    .line 328
    .line 329
    invoke-direct/range {v0 .. v5}, Lcom/zykj/blackboard/core/graph/stroke/BeelineStrokeGraph;-><init>(Ljava/lang/String;Landroid/graphics/RectF;Lcom/zykj/blackboard/core/loader/SourceLoader;Ljava/lang/String;Ljava/lang/Integer;)V

    .line 330
    .line 331
    .line 332
    sget-object v1, Lcom/zykj/blackboard/utils/GraphUtils;->INSTANCE:Lcom/zykj/blackboard/utils/GraphUtils;

    .line 333
    .line 334
    invoke-virtual {v6}, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;->C()Lcom/zykj/board/EzyMatrix$Matrix;

    .line 335
    .line 336
    .line 337
    move-result-object v2

    .line 338
    invoke-static {v2, v9}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 339
    .line 340
    .line 341
    invoke-direct {v1, v2}, Lcom/zykj/blackboard/utils/GraphUtils;->convertMatrix(Lcom/zykj/board/EzyMatrix$Matrix;)Landroid/graphics/Matrix;

    .line 342
    .line 343
    .line 344
    move-result-object v1

    .line 345
    invoke-virtual {v0, v1}, Lcom/zykj/blackboard/core/graph/Graph;->initMatrix(Landroid/graphics/Matrix;)V

    .line 346
    .line 347
    .line 348
    invoke-virtual {v6}, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;->K()Z

    .line 349
    .line 350
    .line 351
    move-result v1

    .line 352
    if-eqz v1, :cond_2

    .line 353
    .line 354
    invoke-virtual {v6}, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;->E()Lcom/zykj/board/EzyPaint$Paint;

    .line 355
    .line 356
    .line 357
    move-result-object v1

    .line 358
    invoke-static {v1, v7}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 359
    .line 360
    .line 361
    invoke-static {v1}, Lcom/zykj/blackboard/utils/GraphUtilsKt;->covertPaint(Lcom/zykj/board/EzyPaint$Paint;)Landroid/graphics/Paint;

    .line 362
    .line 363
    .line 364
    move-result-object v1

    .line 365
    invoke-virtual {v6}, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;->E()Lcom/zykj/board/EzyPaint$Paint;

    .line 366
    .line 367
    .line 368
    move-result-object v2

    .line 369
    invoke-virtual {v2}, Lcom/zykj/board/EzyPaint$Paint;->j()F

    .line 370
    .line 371
    .line 372
    move-result v2

    .line 373
    invoke-virtual {v6}, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;->E()Lcom/zykj/board/EzyPaint$Paint;

    .line 374
    .line 375
    .line 376
    move-result-object v3

    .line 377
    invoke-virtual {v3}, Lcom/zykj/board/EzyPaint$Paint;->k()F

    .line 378
    .line 379
    .line 380
    move-result v3

    .line 381
    invoke-virtual {v0, v1, v2, v3}, Lcom/zykj/blackboard/core/graph/stroke/WritingGraph;->setPaint(Landroid/graphics/Paint;FF)V

    .line 382
    .line 383
    .line 384
    goto/16 :goto_2

    .line 385
    .line 386
    :pswitch_4
    new-instance v0, Lcom/zykj/blackboard/core/graph/stroke/StrokeGraph;

    .line 387
    .line 388
    invoke-virtual {v6}, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;->getId()Ljava/lang/String;

    .line 389
    .line 390
    .line 391
    move-result-object v3

    .line 392
    invoke-static {v3, v2}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 393
    .line 394
    .line 395
    invoke-virtual {v6}, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;->D()Lcom/zykj/board/EzyRectF$RectF;

    .line 396
    .line 397
    .line 398
    move-result-object v2

    .line 399
    invoke-static {v2, v1}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 400
    .line 401
    .line 402
    invoke-static {v2}, Lcom/zykj/blackboard/utils/GraphUtilsKt;->covertRectF(Lcom/zykj/board/EzyRectF$RectF;)Landroid/graphics/RectF;

    .line 403
    .line 404
    .line 405
    move-result-object v2

    .line 406
    invoke-virtual {v6}, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;->H()Ljava/lang/String;

    .line 407
    .line 408
    .line 409
    move-result-object v4

    .line 410
    invoke-virtual {v6}, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;->I()I

    .line 411
    .line 412
    .line 413
    move-result v1

    .line 414
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 415
    .line 416
    .line 417
    move-result-object v5

    .line 418
    move-object v1, v3

    .line 419
    move-object/from16 v3, p1

    .line 420
    .line 421
    invoke-direct/range {v0 .. v5}, Lcom/zykj/blackboard/core/graph/stroke/StrokeGraph;-><init>(Ljava/lang/String;Landroid/graphics/RectF;Lcom/zykj/blackboard/core/loader/SourceLoader;Ljava/lang/String;Ljava/lang/Integer;)V

    .line 422
    .line 423
    .line 424
    sget-object v1, Lcom/zykj/blackboard/utils/GraphUtils;->INSTANCE:Lcom/zykj/blackboard/utils/GraphUtils;

    .line 425
    .line 426
    invoke-virtual {v6}, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;->C()Lcom/zykj/board/EzyMatrix$Matrix;

    .line 427
    .line 428
    .line 429
    move-result-object v2

    .line 430
    invoke-static {v2, v9}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 431
    .line 432
    .line 433
    invoke-direct {v1, v2}, Lcom/zykj/blackboard/utils/GraphUtils;->convertMatrix(Lcom/zykj/board/EzyMatrix$Matrix;)Landroid/graphics/Matrix;

    .line 434
    .line 435
    .line 436
    move-result-object v1

    .line 437
    invoke-virtual {v0, v1}, Lcom/zykj/blackboard/core/graph/Graph;->initMatrix(Landroid/graphics/Matrix;)V

    .line 438
    .line 439
    .line 440
    invoke-virtual {v6}, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;->K()Z

    .line 441
    .line 442
    .line 443
    move-result v1

    .line 444
    if-eqz v1, :cond_2

    .line 445
    .line 446
    invoke-virtual {v6}, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;->E()Lcom/zykj/board/EzyPaint$Paint;

    .line 447
    .line 448
    .line 449
    move-result-object v1

    .line 450
    invoke-static {v1, v7}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 451
    .line 452
    .line 453
    invoke-static {v1}, Lcom/zykj/blackboard/utils/GraphUtilsKt;->covertPaint(Lcom/zykj/board/EzyPaint$Paint;)Landroid/graphics/Paint;

    .line 454
    .line 455
    .line 456
    move-result-object v1

    .line 457
    invoke-virtual {v6}, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;->E()Lcom/zykj/board/EzyPaint$Paint;

    .line 458
    .line 459
    .line 460
    move-result-object v2

    .line 461
    invoke-virtual {v2}, Lcom/zykj/board/EzyPaint$Paint;->j()F

    .line 462
    .line 463
    .line 464
    move-result v2

    .line 465
    invoke-virtual {v6}, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;->E()Lcom/zykj/board/EzyPaint$Paint;

    .line 466
    .line 467
    .line 468
    move-result-object v3

    .line 469
    invoke-virtual {v3}, Lcom/zykj/board/EzyPaint$Paint;->k()F

    .line 470
    .line 471
    .line 472
    move-result v3

    .line 473
    invoke-virtual {v0, v1, v2, v3}, Lcom/zykj/blackboard/core/graph/stroke/WritingGraph;->setPaint(Landroid/graphics/Paint;FF)V

    .line 474
    .line 475
    .line 476
    goto/16 :goto_2

    .line 477
    .line 478
    :pswitch_5
    new-instance v0, Lcom/zykj/blackboard/core/graph/group/ImageGraph;

    .line 479
    .line 480
    invoke-virtual {v6}, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;->getId()Ljava/lang/String;

    .line 481
    .line 482
    .line 483
    move-result-object v3

    .line 484
    invoke-static {v3, v2}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 485
    .line 486
    .line 487
    invoke-virtual {v6}, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;->D()Lcom/zykj/board/EzyRectF$RectF;

    .line 488
    .line 489
    .line 490
    move-result-object v2

    .line 491
    invoke-static {v2, v1}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 492
    .line 493
    .line 494
    invoke-static {v2}, Lcom/zykj/blackboard/utils/GraphUtilsKt;->covertRectF(Lcom/zykj/board/EzyRectF$RectF;)Landroid/graphics/RectF;

    .line 495
    .line 496
    .line 497
    move-result-object v2

    .line 498
    invoke-virtual {v6}, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;->H()Ljava/lang/String;

    .line 499
    .line 500
    .line 501
    move-result-object v4

    .line 502
    const-string v1, "pageSnapshot.sourceFileName"

    .line 503
    .line 504
    invoke-static {v4, v1}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 505
    .line 506
    .line 507
    invoke-virtual {v6}, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;->I()I

    .line 508
    .line 509
    .line 510
    move-result v5

    .line 511
    move-object v1, v3

    .line 512
    move-object/from16 v3, p1

    .line 513
    .line 514
    invoke-direct/range {v0 .. v5}, Lcom/zykj/blackboard/core/graph/group/ImageGraph;-><init>(Ljava/lang/String;Landroid/graphics/RectF;Lcom/zykj/blackboard/core/loader/SourceLoader;Ljava/lang/String;I)V

    .line 515
    .line 516
    .line 517
    sget-object v1, Lcom/zykj/blackboard/utils/GraphUtils;->INSTANCE:Lcom/zykj/blackboard/utils/GraphUtils;

    .line 518
    .line 519
    invoke-virtual {v6}, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;->C()Lcom/zykj/board/EzyMatrix$Matrix;

    .line 520
    .line 521
    .line 522
    move-result-object v2

    .line 523
    invoke-static {v2, v9}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 524
    .line 525
    .line 526
    invoke-direct {v1, v2}, Lcom/zykj/blackboard/utils/GraphUtils;->convertMatrix(Lcom/zykj/board/EzyMatrix$Matrix;)Landroid/graphics/Matrix;

    .line 527
    .line 528
    .line 529
    move-result-object v1

    .line 530
    invoke-virtual {v0, v1}, Lcom/zykj/blackboard/core/graph/Graph;->initMatrix(Landroid/graphics/Matrix;)V

    .line 531
    .line 532
    .line 533
    invoke-virtual {v6}, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;->z()Ljava/lang/String;

    .line 534
    .line 535
    .line 536
    move-result-object v1

    .line 537
    if-eqz v1, :cond_4

    .line 538
    .line 539
    const-string v2, "filePath"

    .line 540
    .line 541
    invoke-static {v1, v2}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 542
    .line 543
    .line 544
    invoke-interface {v1}, Ljava/lang/CharSequence;->length()I

    .line 545
    .line 546
    .line 547
    move-result v2

    .line 548
    if-nez v2, :cond_3

    .line 549
    .line 550
    goto :goto_5

    .line 551
    :cond_3
    invoke-interface {v3}, Lcom/zykj/blackboard/core/loader/SourceLoader;->path()Ljava/lang/String;

    .line 552
    .line 553
    .line 554
    move-result-object v2

    .line 555
    if-eqz v2, :cond_4

    .line 556
    .line 557
    new-instance v4, Ljava/io/File;

    .line 558
    .line 559
    sget-object v5, Lcom/zykj/blackboard/core/record/SourceRouterRecord;->Companion:Lcom/zykj/blackboard/core/record/SourceRouterRecord$Companion;

    .line 560
    .line 561
    sget-object v7, Lcom/zykj/blackboard/enums/DocumentType;->IMAGE:Lcom/zykj/blackboard/enums/DocumentType;

    .line 562
    .line 563
    invoke-virtual {v5, v2, v7}, Lcom/zykj/blackboard/core/record/SourceRouterRecord$Companion;->getResPath(Ljava/lang/String;Lcom/zykj/blackboard/enums/DocumentType;)Ljava/lang/String;

    .line 564
    .line 565
    .line 566
    move-result-object v2

    .line 567
    invoke-direct {v4, v2, v1}, Ljava/io/File;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 568
    .line 569
    .line 570
    invoke-virtual {v4}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 571
    .line 572
    .line 573
    move-result-object v8

    .line 574
    :cond_4
    :goto_5
    invoke-virtual {v0, v8}, Lcom/zykj/blackboard/core/graph/group/FileGraph;->setFilePath(Ljava/lang/String;)V

    .line 575
    .line 576
    .line 577
    goto/16 :goto_3

    .line 578
    .line 579
    :pswitch_6
    new-instance v10, Lcom/zykj/blackboard/core/graph/root/BoundedContainerGraph;

    .line 580
    .line 581
    invoke-virtual {v6}, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;->getId()Ljava/lang/String;

    .line 582
    .line 583
    .line 584
    move-result-object v11

    .line 585
    invoke-static {v11, v2}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 586
    .line 587
    .line 588
    invoke-virtual {v6}, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;->D()Lcom/zykj/board/EzyRectF$RectF;

    .line 589
    .line 590
    .line 591
    move-result-object v0

    .line 592
    invoke-static {v0, v1}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 593
    .line 594
    .line 595
    invoke-static {v0}, Lcom/zykj/blackboard/utils/GraphUtilsKt;->covertRectF(Lcom/zykj/board/EzyRectF$RectF;)Landroid/graphics/RectF;

    .line 596
    .line 597
    .line 598
    move-result-object v12

    .line 599
    const/16 v15, 0xc

    .line 600
    .line 601
    const/16 v16, 0x0

    .line 602
    .line 603
    const/4 v13, 0x0

    .line 604
    const/4 v14, 0x0

    .line 605
    invoke-direct/range {v10 .. v16}, Lcom/zykj/blackboard/core/graph/root/BoundedContainerGraph;-><init>(Ljava/lang/String;Landroid/graphics/RectF;Ljava/lang/String;Ljava/lang/Integer;ILkotlin/jvm/internal/n;)V

    .line 606
    .line 607
    .line 608
    sget-object v0, Lcom/zykj/blackboard/utils/GraphUtils;->INSTANCE:Lcom/zykj/blackboard/utils/GraphUtils;

    .line 609
    .line 610
    invoke-virtual {v6}, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;->C()Lcom/zykj/board/EzyMatrix$Matrix;

    .line 611
    .line 612
    .line 613
    move-result-object v1

    .line 614
    invoke-static {v1, v9}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 615
    .line 616
    .line 617
    invoke-direct {v0, v1}, Lcom/zykj/blackboard/utils/GraphUtils;->convertMatrix(Lcom/zykj/board/EzyMatrix$Matrix;)Landroid/graphics/Matrix;

    .line 618
    .line 619
    .line 620
    move-result-object v0

    .line 621
    invoke-virtual {v10, v0}, Lcom/zykj/blackboard/core/graph/Graph;->initMatrix(Landroid/graphics/Matrix;)V

    .line 622
    .line 623
    .line 624
    goto/16 :goto_4

    .line 625
    .line 626
    :goto_6
    invoke-virtual {v6}, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;->getChildGraphList()Ljava/util/List;

    .line 627
    .line 628
    .line 629
    move-result-object v0

    .line 630
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 631
    .line 632
    .line 633
    move-result-object v0

    .line 634
    :cond_5
    :goto_7
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 635
    .line 636
    .line 637
    move-result v1

    .line 638
    if-eqz v1, :cond_6

    .line 639
    .line 640
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 641
    .line 642
    .line 643
    move-result-object v1

    .line 644
    check-cast v1, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;

    .line 645
    .line 646
    const-string v2, "childPageSnapshot"

    .line 647
    .line 648
    invoke-static {v1, v2}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 649
    .line 650
    .line 651
    move-object/from16 v2, p0

    .line 652
    .line 653
    invoke-virtual {v2, v3, v1}, Lcom/zykj/blackboard/utils/GraphUtils;->buildGraph(Lcom/zykj/blackboard/core/loader/SourceLoader;Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;)Lcom/zykj/blackboard/core/graph/Graph;

    .line 654
    .line 655
    .line 656
    move-result-object v1

    .line 657
    if-eqz v1, :cond_5

    .line 658
    .line 659
    if-eqz v8, :cond_5

    .line 660
    .line 661
    invoke-virtual {v8, v1}, Lcom/zykj/blackboard/core/graph/Graph;->addGraph(Lcom/zykj/blackboard/core/graph/IGraph;)V

    .line 662
    .line 663
    .line 664
    goto :goto_7

    .line 665
    :cond_6
    move-object/from16 v2, p0

    .line 666
    .line 667
    return-object v8

    .line 668
    nop

    .line 669
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final eventConvertPath(Ljava/util/List;)Landroid/graphics/Path;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/zykj/board/EzyTouchEvent$TouchEvent;",
            ">;)",
            "Landroid/graphics/Path;"
        }
    .end annotation

    .line 1
    const-string v0, "pointList"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance v0, Landroid/graphics/Path;

    .line 7
    .line 8
    invoke-direct {v0}, Landroid/graphics/Path;-><init>()V

    .line 9
    .line 10
    .line 11
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    const/4 v2, 0x0

    .line 16
    move v3, v2

    .line 17
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 18
    .line 19
    .line 20
    move-result v4

    .line 21
    if-eqz v4, :cond_2

    .line 22
    .line 23
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v4

    .line 27
    check-cast v4, Lcom/zykj/board/EzyTouchEvent$TouchEvent;

    .line 28
    .line 29
    invoke-static {p1}, Li7/f0;->l0(Ljava/util/List;)Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object v5

    .line 33
    invoke-static {v4, v5}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 34
    .line 35
    .line 36
    move-result v5

    .line 37
    if-eqz v5, :cond_0

    .line 38
    .line 39
    invoke-virtual {v4}, Lcom/zykj/board/EzyTouchEvent$TouchEvent;->getX()F

    .line 40
    .line 41
    .line 42
    move-result v2

    .line 43
    invoke-virtual {v4}, Lcom/zykj/board/EzyTouchEvent$TouchEvent;->getY()F

    .line 44
    .line 45
    .line 46
    move-result v3

    .line 47
    invoke-virtual {v0, v2, v3}, Landroid/graphics/Path;->moveTo(FF)V

    .line 48
    .line 49
    .line 50
    invoke-virtual {v4}, Lcom/zykj/board/EzyTouchEvent$TouchEvent;->getX()F

    .line 51
    .line 52
    .line 53
    move-result v2

    .line 54
    invoke-virtual {v4}, Lcom/zykj/board/EzyTouchEvent$TouchEvent;->getY()F

    .line 55
    .line 56
    .line 57
    move-result v3

    .line 58
    invoke-virtual {v0, v2, v3}, Landroid/graphics/Path;->lineTo(FF)V

    .line 59
    .line 60
    .line 61
    goto :goto_1

    .line 62
    :cond_0
    invoke-static {p1}, Li7/f0;->x0(Ljava/util/List;)Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    move-result-object v5

    .line 66
    invoke-static {v4, v5}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 67
    .line 68
    .line 69
    move-result v5

    .line 70
    const/4 v6, 0x2

    .line 71
    if-eqz v5, :cond_1

    .line 72
    .line 73
    invoke-virtual {v4}, Lcom/zykj/board/EzyTouchEvent$TouchEvent;->getX()F

    .line 74
    .line 75
    .line 76
    move-result v5

    .line 77
    add-float/2addr v5, v2

    .line 78
    int-to-float v6, v6

    .line 79
    div-float/2addr v5, v6

    .line 80
    invoke-virtual {v4}, Lcom/zykj/board/EzyTouchEvent$TouchEvent;->getY()F

    .line 81
    .line 82
    .line 83
    move-result v7

    .line 84
    add-float/2addr v7, v3

    .line 85
    div-float/2addr v7, v6

    .line 86
    invoke-virtual {v0, v2, v3, v5, v7}, Landroid/graphics/Path;->quadTo(FFFF)V

    .line 87
    .line 88
    .line 89
    invoke-virtual {v4}, Lcom/zykj/board/EzyTouchEvent$TouchEvent;->getX()F

    .line 90
    .line 91
    .line 92
    move-result v2

    .line 93
    invoke-virtual {v4}, Lcom/zykj/board/EzyTouchEvent$TouchEvent;->getY()F

    .line 94
    .line 95
    .line 96
    move-result v3

    .line 97
    invoke-virtual {v0, v2, v3}, Landroid/graphics/Path;->lineTo(FF)V

    .line 98
    .line 99
    .line 100
    goto :goto_1

    .line 101
    :cond_1
    invoke-virtual {v4}, Lcom/zykj/board/EzyTouchEvent$TouchEvent;->getX()F

    .line 102
    .line 103
    .line 104
    move-result v5

    .line 105
    add-float/2addr v5, v2

    .line 106
    int-to-float v6, v6

    .line 107
    div-float/2addr v5, v6

    .line 108
    invoke-virtual {v4}, Lcom/zykj/board/EzyTouchEvent$TouchEvent;->getY()F

    .line 109
    .line 110
    .line 111
    move-result v7

    .line 112
    add-float/2addr v7, v3

    .line 113
    div-float/2addr v7, v6

    .line 114
    invoke-virtual {v0, v2, v3, v5, v7}, Landroid/graphics/Path;->quadTo(FFFF)V

    .line 115
    .line 116
    .line 117
    :goto_1
    invoke-virtual {v4}, Lcom/zykj/board/EzyTouchEvent$TouchEvent;->getX()F

    .line 118
    .line 119
    .line 120
    move-result v2

    .line 121
    invoke-virtual {v4}, Lcom/zykj/board/EzyTouchEvent$TouchEvent;->getY()F

    .line 122
    .line 123
    .line 124
    move-result v3

    .line 125
    goto :goto_0

    .line 126
    :cond_2
    return-object v0
.end method

.method public final findPointListRectF(Ljava/util/List;)Landroid/graphics/RectF;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/zykj/board/EzyTouchEvent$TouchEvent;",
            ">;)",
            "Landroid/graphics/RectF;"
        }
    .end annotation

    .line 1
    const-string v0, "pointList"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance v0, Landroid/graphics/RectF;

    .line 7
    .line 8
    invoke-direct {v0}, Landroid/graphics/RectF;-><init>()V

    .line 9
    .line 10
    .line 11
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    if-eqz v1, :cond_0

    .line 16
    .line 17
    return-object v0

    .line 18
    :cond_0
    new-instance v1, Landroid/graphics/PointF;

    .line 19
    .line 20
    invoke-static {p1}, Li7/f0;->l0(Ljava/util/List;)Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object v2

    .line 24
    check-cast v2, Lcom/zykj/board/EzyTouchEvent$TouchEvent;

    .line 25
    .line 26
    invoke-virtual {v2}, Lcom/zykj/board/EzyTouchEvent$TouchEvent;->getX()F

    .line 27
    .line 28
    .line 29
    move-result v2

    .line 30
    invoke-static {p1}, Li7/f0;->l0(Ljava/util/List;)Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object v3

    .line 34
    check-cast v3, Lcom/zykj/board/EzyTouchEvent$TouchEvent;

    .line 35
    .line 36
    invoke-virtual {v3}, Lcom/zykj/board/EzyTouchEvent$TouchEvent;->getY()F

    .line 37
    .line 38
    .line 39
    move-result v3

    .line 40
    invoke-direct {v1, v2, v3}, Landroid/graphics/PointF;-><init>(FF)V

    .line 41
    .line 42
    .line 43
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 44
    .line 45
    .line 46
    move-result-object v2

    .line 47
    const/4 v3, 0x1

    .line 48
    move v4, v3

    .line 49
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 50
    .line 51
    .line 52
    move-result v5

    .line 53
    if-eqz v5, :cond_2

    .line 54
    .line 55
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    move-result-object v5

    .line 59
    check-cast v5, Lcom/zykj/board/EzyTouchEvent$TouchEvent;

    .line 60
    .line 61
    iget v6, v1, Landroid/graphics/PointF;->x:F

    .line 62
    .line 63
    invoke-virtual {v5}, Lcom/zykj/board/EzyTouchEvent$TouchEvent;->getX()F

    .line 64
    .line 65
    .line 66
    move-result v7

    .line 67
    cmpg-float v6, v6, v7

    .line 68
    .line 69
    if-nez v6, :cond_1

    .line 70
    .line 71
    iget v6, v1, Landroid/graphics/PointF;->y:F

    .line 72
    .line 73
    invoke-virtual {v5}, Lcom/zykj/board/EzyTouchEvent$TouchEvent;->getY()F

    .line 74
    .line 75
    .line 76
    move-result v5

    .line 77
    cmpg-float v5, v6, v5

    .line 78
    .line 79
    if-nez v5, :cond_1

    .line 80
    .line 81
    goto :goto_0

    .line 82
    :cond_1
    const/4 v4, 0x0

    .line 83
    goto :goto_0

    .line 84
    :cond_2
    if-eqz v4, :cond_3

    .line 85
    .line 86
    iget p1, v1, Landroid/graphics/PointF;->x:F

    .line 87
    .line 88
    int-to-float v2, v3

    .line 89
    sub-float v3, p1, v2

    .line 90
    .line 91
    iget v1, v1, Landroid/graphics/PointF;->y:F

    .line 92
    .line 93
    sub-float v4, v1, v2

    .line 94
    .line 95
    add-float/2addr p1, v2

    .line 96
    add-float/2addr v1, v2

    .line 97
    invoke-virtual {v0, v3, v4, p1, v1}, Landroid/graphics/RectF;->set(FFFF)V

    .line 98
    .line 99
    .line 100
    return-object v0

    .line 101
    :cond_3
    invoke-virtual {p0, p1}, Lcom/zykj/blackboard/utils/GraphUtils;->eventConvertPath(Ljava/util/List;)Landroid/graphics/Path;

    .line 102
    .line 103
    .line 104
    move-result-object p1

    .line 105
    invoke-virtual {p1, v0, v3}, Landroid/graphics/Path;->computeBounds(Landroid/graphics/RectF;Z)V

    .line 106
    .line 107
    .line 108
    return-object v0
.end method

.method public final line(Landroid/graphics/Point;Landroid/graphics/Point;Landroid/graphics/Point;)D
    .locals 4

    .line 1
    const-string v0, "pointA"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "pointB"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "pointP"

    .line 12
    .line 13
    invoke-static {p3, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    iget v0, p1, Landroid/graphics/Point;->y:I

    .line 17
    .line 18
    iget v1, p2, Landroid/graphics/Point;->y:I

    .line 19
    .line 20
    sub-int v2, v0, v1

    .line 21
    .line 22
    iget p2, p2, Landroid/graphics/Point;->x:I

    .line 23
    .line 24
    iget p1, p1, Landroid/graphics/Point;->x:I

    .line 25
    .line 26
    sub-int v3, p2, p1

    .line 27
    .line 28
    mul-int/2addr p1, v1

    .line 29
    mul-int/2addr v0, p2

    .line 30
    sub-int/2addr p1, v0

    .line 31
    iget p2, p3, Landroid/graphics/Point;->x:I

    .line 32
    .line 33
    mul-int/2addr p2, v2

    .line 34
    iget p3, p3, Landroid/graphics/Point;->y:I

    .line 35
    .line 36
    mul-int/2addr p3, v3

    .line 37
    add-int/2addr p2, p3

    .line 38
    add-int/2addr p2, p1

    .line 39
    invoke-static {p2}, Ljava/lang/Math;->abs(I)I

    .line 40
    .line 41
    .line 42
    move-result p1

    .line 43
    int-to-double p1, p1

    .line 44
    mul-int/2addr v2, v2

    .line 45
    mul-int/2addr v3, v3

    .line 46
    add-int/2addr v2, v3

    .line 47
    int-to-double v0, v2

    .line 48
    invoke-static {v0, v1}, Ljava/lang/Math;->sqrt(D)D

    .line 49
    .line 50
    .line 51
    move-result-wide v0

    .line 52
    div-double/2addr p1, v0

    .line 53
    return-wide p1
.end method

.method public final snapshotGraphToGraph(Ljava/lang/String;)Lcom/zykj/board/EzyPageSnapshot$PageSnapshot;
    .locals 2

    .line 1
    const-string v0, "filePath"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance v0, Ljava/io/File;

    .line 7
    .line 8
    invoke-direct {v0, p1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    new-instance v0, Ljava/io/FileInputStream;

    .line 18
    .line 19
    new-instance v1, Ljava/io/File;

    .line 20
    .line 21
    invoke-direct {v1, p1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    invoke-direct {v0, v1}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V

    .line 25
    .line 26
    .line 27
    invoke-static {v0}, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot;->n(Ljava/io/InputStream;)Lcom/zykj/board/EzyPageSnapshot$PageSnapshot;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    invoke-virtual {v0}, Ljava/io/FileInputStream;->close()V

    .line 32
    .line 33
    .line 34
    return-object p1

    .line 35
    :cond_0
    const/4 p1, 0x0

    .line 36
    return-object p1
.end method
