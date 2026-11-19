.class final Landroidx/compose/animation/AnimatedContentMeasurePolicy;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/compose/ui/layout/MeasurePolicy;


# instance fields
.field private final rootScope:Landroidx/compose/animation/AnimatedContentTransitionScopeImpl;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/compose/animation/AnimatedContentTransitionScopeImpl<",
            "*>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroidx/compose/animation/AnimatedContentTransitionScopeImpl;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/animation/AnimatedContentTransitionScopeImpl<",
            "*>;)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Landroidx/compose/animation/AnimatedContentMeasurePolicy;->rootScope:Landroidx/compose/animation/AnimatedContentTransitionScopeImpl;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final getRootScope()Landroidx/compose/animation/AnimatedContentTransitionScopeImpl;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Landroidx/compose/animation/AnimatedContentTransitionScopeImpl<",
            "*>;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Landroidx/compose/animation/AnimatedContentMeasurePolicy;->rootScope:Landroidx/compose/animation/AnimatedContentTransitionScopeImpl;

    .line 2
    .line 3
    return-object v0
.end method

.method public maxIntrinsicHeight(Landroidx/compose/ui/layout/IntrinsicMeasureScope;Ljava/util/List;I)I
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/ui/layout/IntrinsicMeasureScope;",
            "Ljava/util/List<",
            "+",
            "Landroidx/compose/ui/layout/IntrinsicMeasurable;",
            ">;I)I"
        }
    .end annotation

    .line 1
    invoke-interface {p2}, Ljava/util/List;->isEmpty()Z

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    const/4 v0, 0x0

    .line 6
    if-eqz p1, :cond_0

    .line 7
    .line 8
    const/4 p1, 0x0

    .line 9
    goto :goto_1

    .line 10
    :cond_0
    invoke-interface {p2, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    check-cast p1, Landroidx/compose/ui/layout/IntrinsicMeasurable;

    .line 15
    .line 16
    invoke-interface {p1, p3}, Landroidx/compose/ui/layout/IntrinsicMeasurable;->maxIntrinsicHeight(I)I

    .line 17
    .line 18
    .line 19
    move-result p1

    .line 20
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    invoke-static {p2}, Lrc/w;->p(Ljava/util/List;)I

    .line 25
    .line 26
    .line 27
    move-result v1

    .line 28
    const/4 v2, 0x1

    .line 29
    if-gt v2, v1, :cond_2

    .line 30
    .line 31
    :goto_0
    invoke-interface {p2, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v3

    .line 35
    check-cast v3, Landroidx/compose/ui/layout/IntrinsicMeasurable;

    .line 36
    .line 37
    invoke-interface {v3, p3}, Landroidx/compose/ui/layout/IntrinsicMeasurable;->maxIntrinsicHeight(I)I

    .line 38
    .line 39
    .line 40
    move-result v3

    .line 41
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 42
    .line 43
    .line 44
    move-result-object v3

    .line 45
    invoke-interface {v3, p1}, Ljava/lang/Comparable;->compareTo(Ljava/lang/Object;)I

    .line 46
    .line 47
    .line 48
    move-result v4

    .line 49
    if-lez v4, :cond_1

    .line 50
    .line 51
    move-object p1, v3

    .line 52
    :cond_1
    if-eq v2, v1, :cond_2

    .line 53
    .line 54
    add-int/lit8 v2, v2, 0x1

    .line 55
    .line 56
    goto :goto_0

    .line 57
    :cond_2
    :goto_1
    if-eqz p1, :cond_3

    .line 58
    .line 59
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 60
    .line 61
    .line 62
    move-result p1

    .line 63
    return p1

    .line 64
    :cond_3
    return v0
.end method

.method public maxIntrinsicWidth(Landroidx/compose/ui/layout/IntrinsicMeasureScope;Ljava/util/List;I)I
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/ui/layout/IntrinsicMeasureScope;",
            "Ljava/util/List<",
            "+",
            "Landroidx/compose/ui/layout/IntrinsicMeasurable;",
            ">;I)I"
        }
    .end annotation

    .line 1
    invoke-interface {p2}, Ljava/util/List;->isEmpty()Z

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    const/4 v0, 0x0

    .line 6
    if-eqz p1, :cond_0

    .line 7
    .line 8
    const/4 p1, 0x0

    .line 9
    goto :goto_1

    .line 10
    :cond_0
    invoke-interface {p2, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    check-cast p1, Landroidx/compose/ui/layout/IntrinsicMeasurable;

    .line 15
    .line 16
    invoke-interface {p1, p3}, Landroidx/compose/ui/layout/IntrinsicMeasurable;->maxIntrinsicWidth(I)I

    .line 17
    .line 18
    .line 19
    move-result p1

    .line 20
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    invoke-static {p2}, Lrc/w;->p(Ljava/util/List;)I

    .line 25
    .line 26
    .line 27
    move-result v1

    .line 28
    const/4 v2, 0x1

    .line 29
    if-gt v2, v1, :cond_2

    .line 30
    .line 31
    :goto_0
    invoke-interface {p2, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v3

    .line 35
    check-cast v3, Landroidx/compose/ui/layout/IntrinsicMeasurable;

    .line 36
    .line 37
    invoke-interface {v3, p3}, Landroidx/compose/ui/layout/IntrinsicMeasurable;->maxIntrinsicWidth(I)I

    .line 38
    .line 39
    .line 40
    move-result v3

    .line 41
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 42
    .line 43
    .line 44
    move-result-object v3

    .line 45
    invoke-interface {v3, p1}, Ljava/lang/Comparable;->compareTo(Ljava/lang/Object;)I

    .line 46
    .line 47
    .line 48
    move-result v4

    .line 49
    if-lez v4, :cond_1

    .line 50
    .line 51
    move-object p1, v3

    .line 52
    :cond_1
    if-eq v2, v1, :cond_2

    .line 53
    .line 54
    add-int/lit8 v2, v2, 0x1

    .line 55
    .line 56
    goto :goto_0

    .line 57
    :cond_2
    :goto_1
    if-eqz p1, :cond_3

    .line 58
    .line 59
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 60
    .line 61
    .line 62
    move-result p1

    .line 63
    return p1

    .line 64
    :cond_3
    return v0
.end method

.method public measure-3p2s80s(Landroidx/compose/ui/layout/MeasureScope;Ljava/util/List;J)Landroidx/compose/ui/layout/MeasureResult;
    .locals 27
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/ui/layout/MeasureScope;",
            "Ljava/util/List<",
            "+",
            "Landroidx/compose/ui/layout/Measurable;",
            ">;J)",
            "Landroidx/compose/ui/layout/MeasureResult;"
        }
    .end annotation

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p2

    .line 4
    .line 5
    move-wide/from16 v2, p3

    .line 6
    .line 7
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 8
    .line 9
    .line 10
    move-result v4

    .line 11
    new-array v5, v4, [Landroidx/compose/ui/layout/Placeable;

    .line 12
    .line 13
    sget-object v6, Landroidx/compose/ui/unit/IntSize;->Companion:Landroidx/compose/ui/unit/IntSize$Companion;

    .line 14
    .line 15
    invoke-virtual {v6}, Landroidx/compose/ui/unit/IntSize$Companion;->getZero-YbymL2g()J

    .line 16
    .line 17
    .line 18
    move-result-wide v6

    .line 19
    move-object v8, v1

    .line 20
    check-cast v8, Ljava/util/Collection;

    .line 21
    .line 22
    invoke-interface {v8}, Ljava/util/Collection;->size()I

    .line 23
    .line 24
    .line 25
    move-result v9

    .line 26
    const/4 v11, 0x0

    .line 27
    :goto_0
    const/4 v15, 0x0

    .line 28
    const/16 v16, 0x0

    .line 29
    .line 30
    const/4 v10, 0x1

    .line 31
    if-ge v11, v9, :cond_2

    .line 32
    .line 33
    invoke-interface {v1, v11}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object v17

    .line 37
    const-wide v18, 0xffffffffL

    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    move-object/from16 v12, v17

    .line 43
    .line 44
    check-cast v12, Landroidx/compose/ui/layout/Measurable;

    .line 45
    .line 46
    invoke-interface {v12}, Landroidx/compose/ui/layout/IntrinsicMeasurable;->getParentData()Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    move-result-object v13

    .line 50
    const/16 v17, 0x20

    .line 51
    .line 52
    instance-of v14, v13, Landroidx/compose/animation/AnimatedContentTransitionScopeImpl$ChildData;

    .line 53
    .line 54
    if-eqz v14, :cond_0

    .line 55
    .line 56
    move-object v15, v13

    .line 57
    check-cast v15, Landroidx/compose/animation/AnimatedContentTransitionScopeImpl$ChildData;

    .line 58
    .line 59
    :cond_0
    if-eqz v15, :cond_1

    .line 60
    .line 61
    invoke-virtual {v15}, Landroidx/compose/animation/AnimatedContentTransitionScopeImpl$ChildData;->isTarget()Z

    .line 62
    .line 63
    .line 64
    move-result v13

    .line 65
    if-ne v13, v10, :cond_1

    .line 66
    .line 67
    invoke-interface {v12, v2, v3}, Landroidx/compose/ui/layout/Measurable;->measure-BRTryo0(J)Landroidx/compose/ui/layout/Placeable;

    .line 68
    .line 69
    .line 70
    move-result-object v6

    .line 71
    invoke-virtual {v6}, Landroidx/compose/ui/layout/Placeable;->getWidth()I

    .line 72
    .line 73
    .line 74
    move-result v7

    .line 75
    invoke-virtual {v6}, Landroidx/compose/ui/layout/Placeable;->getHeight()I

    .line 76
    .line 77
    .line 78
    move-result v10

    .line 79
    int-to-long v12, v7

    .line 80
    shl-long v12, v12, v17

    .line 81
    .line 82
    int-to-long v14, v10

    .line 83
    and-long v14, v14, v18

    .line 84
    .line 85
    or-long/2addr v12, v14

    .line 86
    invoke-static {v12, v13}, Landroidx/compose/ui/unit/IntSize;->constructor-impl(J)J

    .line 87
    .line 88
    .line 89
    move-result-wide v12

    .line 90
    sget-object v7, Lqc/q;->a:Lqc/q;

    .line 91
    .line 92
    aput-object v6, v5, v11

    .line 93
    .line 94
    move-wide v6, v12

    .line 95
    :cond_1
    add-int/lit8 v11, v11, 0x1

    .line 96
    .line 97
    goto :goto_0

    .line 98
    :cond_2
    const/16 v17, 0x20

    .line 99
    .line 100
    const-wide v18, 0xffffffffL

    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    invoke-interface {v8}, Ljava/util/Collection;->size()I

    .line 106
    .line 107
    .line 108
    move-result v8

    .line 109
    move/from16 v9, v16

    .line 110
    .line 111
    :goto_1
    if-ge v9, v8, :cond_4

    .line 112
    .line 113
    invoke-interface {v1, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 114
    .line 115
    .line 116
    move-result-object v11

    .line 117
    check-cast v11, Landroidx/compose/ui/layout/Measurable;

    .line 118
    .line 119
    aget-object v12, v5, v9

    .line 120
    .line 121
    if-nez v12, :cond_3

    .line 122
    .line 123
    invoke-interface {v11, v2, v3}, Landroidx/compose/ui/layout/Measurable;->measure-BRTryo0(J)Landroidx/compose/ui/layout/Placeable;

    .line 124
    .line 125
    .line 126
    move-result-object v11

    .line 127
    aput-object v11, v5, v9

    .line 128
    .line 129
    :cond_3
    add-int/lit8 v9, v9, 0x1

    .line 130
    .line 131
    goto :goto_1

    .line 132
    :cond_4
    invoke-interface/range {p1 .. p1}, Landroidx/compose/ui/layout/IntrinsicMeasureScope;->isLookingAhead()Z

    .line 133
    .line 134
    .line 135
    move-result v1

    .line 136
    if-eqz v1, :cond_5

    .line 137
    .line 138
    shr-long v1, v6, v17

    .line 139
    .line 140
    long-to-int v1, v1

    .line 141
    goto :goto_6

    .line 142
    :cond_5
    if-nez v4, :cond_6

    .line 143
    .line 144
    move-object v1, v15

    .line 145
    goto :goto_5

    .line 146
    :cond_6
    aget-object v1, v5, v16

    .line 147
    .line 148
    invoke-static {v5}, Lrc/r;->A0([Ljava/lang/Object;)I

    .line 149
    .line 150
    .line 151
    move-result v2

    .line 152
    if-nez v2, :cond_7

    .line 153
    .line 154
    goto :goto_5

    .line 155
    :cond_7
    if-eqz v1, :cond_8

    .line 156
    .line 157
    invoke-virtual {v1}, Landroidx/compose/ui/layout/Placeable;->getWidth()I

    .line 158
    .line 159
    .line 160
    move-result v3

    .line 161
    goto :goto_2

    .line 162
    :cond_8
    move/from16 v3, v16

    .line 163
    .line 164
    :goto_2
    new-instance v8, Lnd/j;

    .line 165
    .line 166
    invoke-direct {v8, v10, v2}, Lnd/j;-><init>(II)V

    .line 167
    .line 168
    .line 169
    invoke-virtual {v8}, Lnd/h;->e()Lrc/n0;

    .line 170
    .line 171
    .line 172
    move-result-object v2

    .line 173
    :cond_9
    :goto_3
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 174
    .line 175
    .line 176
    move-result v8

    .line 177
    if-eqz v8, :cond_b

    .line 178
    .line 179
    invoke-virtual {v2}, Lrc/n0;->nextInt()I

    .line 180
    .line 181
    .line 182
    move-result v8

    .line 183
    aget-object v8, v5, v8

    .line 184
    .line 185
    if-eqz v8, :cond_a

    .line 186
    .line 187
    invoke-virtual {v8}, Landroidx/compose/ui/layout/Placeable;->getWidth()I

    .line 188
    .line 189
    .line 190
    move-result v9

    .line 191
    goto :goto_4

    .line 192
    :cond_a
    move/from16 v9, v16

    .line 193
    .line 194
    :goto_4
    if-ge v3, v9, :cond_9

    .line 195
    .line 196
    move-object v1, v8

    .line 197
    move v3, v9

    .line 198
    goto :goto_3

    .line 199
    :cond_b
    :goto_5
    if-eqz v1, :cond_c

    .line 200
    .line 201
    invoke-virtual {v1}, Landroidx/compose/ui/layout/Placeable;->getWidth()I

    .line 202
    .line 203
    .line 204
    move-result v1

    .line 205
    goto :goto_6

    .line 206
    :cond_c
    move/from16 v1, v16

    .line 207
    .line 208
    :goto_6
    invoke-interface/range {p1 .. p1}, Landroidx/compose/ui/layout/IntrinsicMeasureScope;->isLookingAhead()Z

    .line 209
    .line 210
    .line 211
    move-result v2

    .line 212
    if-eqz v2, :cond_d

    .line 213
    .line 214
    and-long v2, v6, v18

    .line 215
    .line 216
    long-to-int v10, v2

    .line 217
    goto :goto_b

    .line 218
    :cond_d
    if-nez v4, :cond_e

    .line 219
    .line 220
    goto :goto_a

    .line 221
    :cond_e
    aget-object v15, v5, v16

    .line 222
    .line 223
    invoke-static {v5}, Lrc/r;->A0([Ljava/lang/Object;)I

    .line 224
    .line 225
    .line 226
    move-result v2

    .line 227
    if-nez v2, :cond_f

    .line 228
    .line 229
    goto :goto_a

    .line 230
    :cond_f
    if-eqz v15, :cond_10

    .line 231
    .line 232
    invoke-virtual {v15}, Landroidx/compose/ui/layout/Placeable;->getHeight()I

    .line 233
    .line 234
    .line 235
    move-result v3

    .line 236
    goto :goto_7

    .line 237
    :cond_10
    move/from16 v3, v16

    .line 238
    .line 239
    :goto_7
    new-instance v4, Lnd/j;

    .line 240
    .line 241
    invoke-direct {v4, v10, v2}, Lnd/j;-><init>(II)V

    .line 242
    .line 243
    .line 244
    invoke-virtual {v4}, Lnd/h;->e()Lrc/n0;

    .line 245
    .line 246
    .line 247
    move-result-object v2

    .line 248
    :cond_11
    :goto_8
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 249
    .line 250
    .line 251
    move-result v4

    .line 252
    if-eqz v4, :cond_13

    .line 253
    .line 254
    invoke-virtual {v2}, Lrc/n0;->nextInt()I

    .line 255
    .line 256
    .line 257
    move-result v4

    .line 258
    aget-object v4, v5, v4

    .line 259
    .line 260
    if-eqz v4, :cond_12

    .line 261
    .line 262
    invoke-virtual {v4}, Landroidx/compose/ui/layout/Placeable;->getHeight()I

    .line 263
    .line 264
    .line 265
    move-result v6

    .line 266
    goto :goto_9

    .line 267
    :cond_12
    move/from16 v6, v16

    .line 268
    .line 269
    :goto_9
    if-ge v3, v6, :cond_11

    .line 270
    .line 271
    move-object v15, v4

    .line 272
    move v3, v6

    .line 273
    goto :goto_8

    .line 274
    :cond_13
    :goto_a
    if-eqz v15, :cond_14

    .line 275
    .line 276
    invoke-virtual {v15}, Landroidx/compose/ui/layout/Placeable;->getHeight()I

    .line 277
    .line 278
    .line 279
    move-result v10

    .line 280
    goto :goto_b

    .line 281
    :cond_14
    move/from16 v10, v16

    .line 282
    .line 283
    :goto_b
    invoke-interface/range {p1 .. p1}, Landroidx/compose/ui/layout/IntrinsicMeasureScope;->isLookingAhead()Z

    .line 284
    .line 285
    .line 286
    move-result v2

    .line 287
    if-nez v2, :cond_15

    .line 288
    .line 289
    iget-object v2, v0, Landroidx/compose/animation/AnimatedContentMeasurePolicy;->rootScope:Landroidx/compose/animation/AnimatedContentTransitionScopeImpl;

    .line 290
    .line 291
    int-to-long v3, v1

    .line 292
    shl-long v3, v3, v17

    .line 293
    .line 294
    int-to-long v6, v10

    .line 295
    and-long v6, v6, v18

    .line 296
    .line 297
    or-long/2addr v3, v6

    .line 298
    invoke-static {v3, v4}, Landroidx/compose/ui/unit/IntSize;->constructor-impl(J)J

    .line 299
    .line 300
    .line 301
    move-result-wide v3

    .line 302
    invoke-virtual {v2, v3, v4}, Landroidx/compose/animation/AnimatedContentTransitionScopeImpl;->setMeasuredSize-ozmzZPI$animation_release(J)V

    .line 303
    .line 304
    .line 305
    :cond_15
    new-instance v2, Landroidx/compose/animation/AnimatedContentMeasurePolicy$measure$3;

    .line 306
    .line 307
    invoke-direct {v2, v5, v0, v1, v10}, Landroidx/compose/animation/AnimatedContentMeasurePolicy$measure$3;-><init>([Landroidx/compose/ui/layout/Placeable;Landroidx/compose/animation/AnimatedContentMeasurePolicy;II)V

    .line 308
    .line 309
    .line 310
    const/16 v25, 0x4

    .line 311
    .line 312
    const/16 v26, 0x0

    .line 313
    .line 314
    const/16 v23, 0x0

    .line 315
    .line 316
    move-object/from16 v20, p1

    .line 317
    .line 318
    move/from16 v21, v1

    .line 319
    .line 320
    move-object/from16 v24, v2

    .line 321
    .line 322
    move/from16 v22, v10

    .line 323
    .line 324
    invoke-static/range {v20 .. v26}, Landroidx/compose/ui/layout/MeasureScope;->layout$default(Landroidx/compose/ui/layout/MeasureScope;IILjava/util/Map;Lhd/l;ILjava/lang/Object;)Landroidx/compose/ui/layout/MeasureResult;

    .line 325
    .line 326
    .line 327
    move-result-object v1

    .line 328
    return-object v1
.end method

.method public minIntrinsicHeight(Landroidx/compose/ui/layout/IntrinsicMeasureScope;Ljava/util/List;I)I
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/ui/layout/IntrinsicMeasureScope;",
            "Ljava/util/List<",
            "+",
            "Landroidx/compose/ui/layout/IntrinsicMeasurable;",
            ">;I)I"
        }
    .end annotation

    .line 1
    invoke-interface {p2}, Ljava/util/List;->isEmpty()Z

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    const/4 v0, 0x0

    .line 6
    if-eqz p1, :cond_0

    .line 7
    .line 8
    const/4 p1, 0x0

    .line 9
    goto :goto_1

    .line 10
    :cond_0
    invoke-interface {p2, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    check-cast p1, Landroidx/compose/ui/layout/IntrinsicMeasurable;

    .line 15
    .line 16
    invoke-interface {p1, p3}, Landroidx/compose/ui/layout/IntrinsicMeasurable;->minIntrinsicHeight(I)I

    .line 17
    .line 18
    .line 19
    move-result p1

    .line 20
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    invoke-static {p2}, Lrc/w;->p(Ljava/util/List;)I

    .line 25
    .line 26
    .line 27
    move-result v1

    .line 28
    const/4 v2, 0x1

    .line 29
    if-gt v2, v1, :cond_2

    .line 30
    .line 31
    :goto_0
    invoke-interface {p2, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v3

    .line 35
    check-cast v3, Landroidx/compose/ui/layout/IntrinsicMeasurable;

    .line 36
    .line 37
    invoke-interface {v3, p3}, Landroidx/compose/ui/layout/IntrinsicMeasurable;->minIntrinsicHeight(I)I

    .line 38
    .line 39
    .line 40
    move-result v3

    .line 41
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 42
    .line 43
    .line 44
    move-result-object v3

    .line 45
    invoke-interface {v3, p1}, Ljava/lang/Comparable;->compareTo(Ljava/lang/Object;)I

    .line 46
    .line 47
    .line 48
    move-result v4

    .line 49
    if-lez v4, :cond_1

    .line 50
    .line 51
    move-object p1, v3

    .line 52
    :cond_1
    if-eq v2, v1, :cond_2

    .line 53
    .line 54
    add-int/lit8 v2, v2, 0x1

    .line 55
    .line 56
    goto :goto_0

    .line 57
    :cond_2
    :goto_1
    if-eqz p1, :cond_3

    .line 58
    .line 59
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 60
    .line 61
    .line 62
    move-result p1

    .line 63
    return p1

    .line 64
    :cond_3
    return v0
.end method

.method public minIntrinsicWidth(Landroidx/compose/ui/layout/IntrinsicMeasureScope;Ljava/util/List;I)I
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/ui/layout/IntrinsicMeasureScope;",
            "Ljava/util/List<",
            "+",
            "Landroidx/compose/ui/layout/IntrinsicMeasurable;",
            ">;I)I"
        }
    .end annotation

    .line 1
    invoke-interface {p2}, Ljava/util/List;->isEmpty()Z

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    const/4 v0, 0x0

    .line 6
    if-eqz p1, :cond_0

    .line 7
    .line 8
    const/4 p1, 0x0

    .line 9
    goto :goto_1

    .line 10
    :cond_0
    invoke-interface {p2, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    check-cast p1, Landroidx/compose/ui/layout/IntrinsicMeasurable;

    .line 15
    .line 16
    invoke-interface {p1, p3}, Landroidx/compose/ui/layout/IntrinsicMeasurable;->minIntrinsicWidth(I)I

    .line 17
    .line 18
    .line 19
    move-result p1

    .line 20
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    invoke-static {p2}, Lrc/w;->p(Ljava/util/List;)I

    .line 25
    .line 26
    .line 27
    move-result v1

    .line 28
    const/4 v2, 0x1

    .line 29
    if-gt v2, v1, :cond_2

    .line 30
    .line 31
    :goto_0
    invoke-interface {p2, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v3

    .line 35
    check-cast v3, Landroidx/compose/ui/layout/IntrinsicMeasurable;

    .line 36
    .line 37
    invoke-interface {v3, p3}, Landroidx/compose/ui/layout/IntrinsicMeasurable;->minIntrinsicWidth(I)I

    .line 38
    .line 39
    .line 40
    move-result v3

    .line 41
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 42
    .line 43
    .line 44
    move-result-object v3

    .line 45
    invoke-interface {v3, p1}, Ljava/lang/Comparable;->compareTo(Ljava/lang/Object;)I

    .line 46
    .line 47
    .line 48
    move-result v4

    .line 49
    if-lez v4, :cond_1

    .line 50
    .line 51
    move-object p1, v3

    .line 52
    :cond_1
    if-eq v2, v1, :cond_2

    .line 53
    .line 54
    add-int/lit8 v2, v2, 0x1

    .line 55
    .line 56
    goto :goto_0

    .line 57
    :cond_2
    :goto_1
    if-eqz p1, :cond_3

    .line 58
    .line 59
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 60
    .line 61
    .line 62
    move-result p1

    .line 63
    return p1

    .line 64
    :cond_3
    return v0
.end method
