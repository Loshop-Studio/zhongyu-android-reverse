.class public final Landroidx/compose/foundation/gestures/DragGestureDetectorKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final defaultTouchSlop:F

.field private static final mouseSlop:F

.field private static final mouseToTouchSlopRatio:F


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    const-wide/high16 v0, 0x3fc0000000000000L    # 0.125

    .line 2
    .line 3
    double-to-float v0, v0

    .line 4
    invoke-static {v0}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    sput v0, Landroidx/compose/foundation/gestures/DragGestureDetectorKt;->mouseSlop:F

    .line 9
    .line 10
    const/16 v1, 0x12

    .line 11
    .line 12
    int-to-float v1, v1

    .line 13
    invoke-static {v1}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    sput v1, Landroidx/compose/foundation/gestures/DragGestureDetectorKt;->defaultTouchSlop:F

    .line 18
    .line 19
    div-float/2addr v0, v1

    .line 20
    sput v0, Landroidx/compose/foundation/gestures/DragGestureDetectorKt;->mouseToTouchSlopRatio:F

    .line 21
    .line 22
    return-void
.end method

.method public static final synthetic access$isPointerUp-DmW0f2w(Landroidx/compose/ui/input/pointer/PointerEvent;J)Z
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Landroidx/compose/foundation/gestures/DragGestureDetectorKt;->isPointerUp-DmW0f2w(Landroidx/compose/ui/input/pointer/PointerEvent;J)Z

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method

.method public static final awaitAllPointersUpWithSlopDetection(Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;Landroidx/compose/ui/input/pointer/PointerInputChange;Landroidx/compose/ui/input/pointer/PointerEventPass;Lvc/c;)Ljava/lang/Object;
    .locals 18
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;",
            "Landroidx/compose/ui/input/pointer/PointerInputChange;",
            "Landroidx/compose/ui/input/pointer/PointerEventPass;",
            "Lvc/c<",
            "-",
            "Ljava/lang/Boolean;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    move-object/from16 v0, p3

    .line 2
    .line 3
    instance-of v1, v0, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$awaitAllPointersUpWithSlopDetection$1;

    .line 4
    .line 5
    if-eqz v1, :cond_0

    .line 6
    .line 7
    move-object v1, v0

    .line 8
    check-cast v1, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$awaitAllPointersUpWithSlopDetection$1;

    .line 9
    .line 10
    iget v2, v1, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$awaitAllPointersUpWithSlopDetection$1;->label:I

    .line 11
    .line 12
    const/high16 v3, -0x80000000

    .line 13
    .line 14
    and-int v4, v2, v3

    .line 15
    .line 16
    if-eqz v4, :cond_0

    .line 17
    .line 18
    sub-int/2addr v2, v3

    .line 19
    iput v2, v1, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$awaitAllPointersUpWithSlopDetection$1;->label:I

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    new-instance v1, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$awaitAllPointersUpWithSlopDetection$1;

    .line 23
    .line 24
    invoke-direct {v1, v0}, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$awaitAllPointersUpWithSlopDetection$1;-><init>(Lvc/c;)V

    .line 25
    .line 26
    .line 27
    :goto_0
    iget-object v0, v1, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$awaitAllPointersUpWithSlopDetection$1;->result:Ljava/lang/Object;

    .line 28
    .line 29
    invoke-static {}, Lwc/a;->f()Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object v2

    .line 33
    iget v3, v1, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$awaitAllPointersUpWithSlopDetection$1;->label:I

    .line 34
    .line 35
    const/4 v4, 0x0

    .line 36
    const/4 v5, 0x1

    .line 37
    if-eqz v3, :cond_2

    .line 38
    .line 39
    if-ne v3, v5, :cond_1

    .line 40
    .line 41
    iget v3, v1, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$awaitAllPointersUpWithSlopDetection$1;->F$0:F

    .line 42
    .line 43
    iget v6, v1, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$awaitAllPointersUpWithSlopDetection$1;->I$0:I

    .line 44
    .line 45
    iget-object v7, v1, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$awaitAllPointersUpWithSlopDetection$1;->L$3:Ljava/lang/Object;

    .line 46
    .line 47
    check-cast v7, Landroidx/compose/foundation/gestures/TouchSlopDetector;

    .line 48
    .line 49
    iget-object v8, v1, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$awaitAllPointersUpWithSlopDetection$1;->L$2:Ljava/lang/Object;

    .line 50
    .line 51
    check-cast v8, Lkotlin/jvm/internal/Ref$LongRef;

    .line 52
    .line 53
    iget-object v9, v1, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$awaitAllPointersUpWithSlopDetection$1;->L$1:Ljava/lang/Object;

    .line 54
    .line 55
    check-cast v9, Landroidx/compose/ui/input/pointer/PointerEventPass;

    .line 56
    .line 57
    iget-object v10, v1, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$awaitAllPointersUpWithSlopDetection$1;->L$0:Ljava/lang/Object;

    .line 58
    .line 59
    check-cast v10, Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;

    .line 60
    .line 61
    invoke-static {v0}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 62
    .line 63
    .line 64
    move/from16 v17, v3

    .line 65
    .line 66
    move-object v3, v1

    .line 67
    move-object v1, v9

    .line 68
    move-object v9, v8

    .line 69
    move-object v8, v7

    .line 70
    move v7, v6

    .line 71
    move/from16 v6, v17

    .line 72
    .line 73
    goto :goto_2

    .line 74
    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 75
    .line 76
    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    .line 77
    .line 78
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 79
    .line 80
    .line 81
    throw v0

    .line 82
    :cond_2
    invoke-static {v0}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 83
    .line 84
    .line 85
    invoke-static/range {p0 .. p0}, Landroidx/compose/foundation/gestures/ForEachGestureKt;->allPointersUp(Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;)Z

    .line 86
    .line 87
    .line 88
    move-result v0

    .line 89
    if-eqz v0, :cond_3

    .line 90
    .line 91
    invoke-static {v4}, Lxc/a;->a(Z)Ljava/lang/Boolean;

    .line 92
    .line 93
    .line 94
    move-result-object v0

    .line 95
    return-object v0

    .line 96
    :cond_3
    new-instance v0, Lkotlin/jvm/internal/Ref$LongRef;

    .line 97
    .line 98
    invoke-direct {v0}, Lkotlin/jvm/internal/Ref$LongRef;-><init>()V

    .line 99
    .line 100
    .line 101
    invoke-virtual/range {p1 .. p1}, Landroidx/compose/ui/input/pointer/PointerInputChange;->getId-J3iCeTQ()J

    .line 102
    .line 103
    .line 104
    move-result-wide v6

    .line 105
    iput-wide v6, v0, Lkotlin/jvm/internal/Ref$LongRef;->c:J

    .line 106
    .line 107
    invoke-interface/range {p0 .. p0}, Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;->getViewConfiguration()Landroidx/compose/ui/platform/ViewConfiguration;

    .line 108
    .line 109
    .line 110
    move-result-object v3

    .line 111
    invoke-virtual/range {p1 .. p1}, Landroidx/compose/ui/input/pointer/PointerInputChange;->getType-T8wyACA()I

    .line 112
    .line 113
    .line 114
    move-result v6

    .line 115
    invoke-static {v3, v6}, Landroidx/compose/foundation/gestures/DragGestureDetectorKt;->pointerSlop-E8SPZFQ(Landroidx/compose/ui/platform/ViewConfiguration;I)F

    .line 116
    .line 117
    .line 118
    move-result v3

    .line 119
    new-instance v6, Landroidx/compose/foundation/gestures/TouchSlopDetector;

    .line 120
    .line 121
    const/4 v10, 0x3

    .line 122
    const/4 v11, 0x0

    .line 123
    const/4 v7, 0x0

    .line 124
    const-wide/16 v8, 0x0

    .line 125
    .line 126
    invoke-direct/range {v6 .. v11}, Landroidx/compose/foundation/gestures/TouchSlopDetector;-><init>(Landroidx/compose/foundation/gestures/Orientation;JILkotlin/jvm/internal/n;)V

    .line 127
    .line 128
    .line 129
    move-object v9, v0

    .line 130
    move v7, v4

    .line 131
    move-object v8, v6

    .line 132
    move-object/from16 v0, p0

    .line 133
    .line 134
    move v6, v3

    .line 135
    move-object v3, v1

    .line 136
    move-object/from16 v1, p2

    .line 137
    .line 138
    :goto_1
    iput-object v0, v3, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$awaitAllPointersUpWithSlopDetection$1;->L$0:Ljava/lang/Object;

    .line 139
    .line 140
    iput-object v1, v3, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$awaitAllPointersUpWithSlopDetection$1;->L$1:Ljava/lang/Object;

    .line 141
    .line 142
    iput-object v9, v3, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$awaitAllPointersUpWithSlopDetection$1;->L$2:Ljava/lang/Object;

    .line 143
    .line 144
    iput-object v8, v3, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$awaitAllPointersUpWithSlopDetection$1;->L$3:Ljava/lang/Object;

    .line 145
    .line 146
    iput v7, v3, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$awaitAllPointersUpWithSlopDetection$1;->I$0:I

    .line 147
    .line 148
    iput v6, v3, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$awaitAllPointersUpWithSlopDetection$1;->F$0:F

    .line 149
    .line 150
    iput v5, v3, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$awaitAllPointersUpWithSlopDetection$1;->label:I

    .line 151
    .line 152
    invoke-interface {v0, v1, v3}, Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;->awaitPointerEvent(Landroidx/compose/ui/input/pointer/PointerEventPass;Lvc/c;)Ljava/lang/Object;

    .line 153
    .line 154
    .line 155
    move-result-object v10

    .line 156
    if-ne v10, v2, :cond_4

    .line 157
    .line 158
    return-object v2

    .line 159
    :cond_4
    move-object/from16 v17, v10

    .line 160
    .line 161
    move-object v10, v0

    .line 162
    move-object/from16 v0, v17

    .line 163
    .line 164
    :goto_2
    check-cast v0, Landroidx/compose/ui/input/pointer/PointerEvent;

    .line 165
    .line 166
    invoke-virtual {v0}, Landroidx/compose/ui/input/pointer/PointerEvent;->getChanges()Ljava/util/List;

    .line 167
    .line 168
    .line 169
    move-result-object v11

    .line 170
    move-object v12, v11

    .line 171
    check-cast v12, Ljava/util/Collection;

    .line 172
    .line 173
    invoke-interface {v12}, Ljava/util/Collection;->size()I

    .line 174
    .line 175
    .line 176
    move-result v12

    .line 177
    move v13, v4

    .line 178
    :goto_3
    if-ge v13, v12, :cond_6

    .line 179
    .line 180
    invoke-interface {v11, v13}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 181
    .line 182
    .line 183
    move-result-object v15

    .line 184
    move-object/from16 v16, v15

    .line 185
    .line 186
    check-cast v16, Landroidx/compose/ui/input/pointer/PointerInputChange;

    .line 187
    .line 188
    invoke-virtual/range {v16 .. v16}, Landroidx/compose/ui/input/pointer/PointerInputChange;->getId-J3iCeTQ()J

    .line 189
    .line 190
    .line 191
    move-result-wide v4

    .line 192
    move-object/from16 p1, v15

    .line 193
    .line 194
    iget-wide v14, v9, Lkotlin/jvm/internal/Ref$LongRef;->c:J

    .line 195
    .line 196
    invoke-static {v4, v5, v14, v15}, Landroidx/compose/ui/input/pointer/PointerId;->equals-impl0(JJ)Z

    .line 197
    .line 198
    .line 199
    move-result v4

    .line 200
    if-eqz v4, :cond_5

    .line 201
    .line 202
    move-object/from16 v15, p1

    .line 203
    .line 204
    goto :goto_4

    .line 205
    :cond_5
    add-int/lit8 v13, v13, 0x1

    .line 206
    .line 207
    const/4 v4, 0x0

    .line 208
    const/4 v5, 0x1

    .line 209
    goto :goto_3

    .line 210
    :cond_6
    const/4 v15, 0x0

    .line 211
    :goto_4
    check-cast v15, Landroidx/compose/ui/input/pointer/PointerInputChange;

    .line 212
    .line 213
    if-eqz v15, :cond_8

    .line 214
    .line 215
    invoke-static {v15}, Landroidx/compose/ui/input/pointer/PointerEventKt;->changedToUpIgnoreConsumed(Landroidx/compose/ui/input/pointer/PointerInputChange;)Z

    .line 216
    .line 217
    .line 218
    move-result v4

    .line 219
    if-eqz v4, :cond_7

    .line 220
    .line 221
    goto :goto_5

    .line 222
    :cond_7
    invoke-virtual {v8, v15, v6}, Landroidx/compose/foundation/gestures/TouchSlopDetector;->addPointerInputChange-dBAh8RU(Landroidx/compose/ui/input/pointer/PointerInputChange;F)J

    .line 223
    .line 224
    .line 225
    move-result-wide v4

    .line 226
    const-wide v11, 0x7fffffff7fffffffL

    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    and-long/2addr v4, v11

    .line 232
    const-wide v11, 0x7fc000007fc00000L    # 2.247117487993712E307

    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    cmp-long v4, v4, v11

    .line 238
    .line 239
    if-eqz v4, :cond_d

    .line 240
    .line 241
    const/4 v7, 0x1

    .line 242
    goto :goto_9

    .line 243
    :cond_8
    :goto_5
    invoke-virtual {v0}, Landroidx/compose/ui/input/pointer/PointerEvent;->getChanges()Ljava/util/List;

    .line 244
    .line 245
    .line 246
    move-result-object v4

    .line 247
    move-object v5, v4

    .line 248
    check-cast v5, Ljava/util/Collection;

    .line 249
    .line 250
    invoke-interface {v5}, Ljava/util/Collection;->size()I

    .line 251
    .line 252
    .line 253
    move-result v5

    .line 254
    const/4 v11, 0x0

    .line 255
    :goto_6
    if-ge v11, v5, :cond_a

    .line 256
    .line 257
    invoke-interface {v4, v11}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 258
    .line 259
    .line 260
    move-result-object v12

    .line 261
    move-object v13, v12

    .line 262
    check-cast v13, Landroidx/compose/ui/input/pointer/PointerInputChange;

    .line 263
    .line 264
    invoke-virtual {v13}, Landroidx/compose/ui/input/pointer/PointerInputChange;->getPressed()Z

    .line 265
    .line 266
    .line 267
    move-result v13

    .line 268
    if-eqz v13, :cond_9

    .line 269
    .line 270
    move-object v14, v12

    .line 271
    goto :goto_7

    .line 272
    :cond_9
    add-int/lit8 v11, v11, 0x1

    .line 273
    .line 274
    goto :goto_6

    .line 275
    :cond_a
    const/4 v14, 0x0

    .line 276
    :goto_7
    check-cast v14, Landroidx/compose/ui/input/pointer/PointerInputChange;

    .line 277
    .line 278
    if-nez v14, :cond_c

    .line 279
    .line 280
    if-eqz v7, :cond_b

    .line 281
    .line 282
    const/4 v4, 0x1

    .line 283
    goto :goto_8

    .line 284
    :cond_b
    const/4 v4, 0x0

    .line 285
    :goto_8
    invoke-static {v4}, Lxc/a;->a(Z)Ljava/lang/Boolean;

    .line 286
    .line 287
    .line 288
    move-result-object v0

    .line 289
    return-object v0

    .line 290
    :cond_c
    invoke-virtual {v14}, Landroidx/compose/ui/input/pointer/PointerInputChange;->getId-J3iCeTQ()J

    .line 291
    .line 292
    .line 293
    move-result-wide v4

    .line 294
    iput-wide v4, v9, Lkotlin/jvm/internal/Ref$LongRef;->c:J

    .line 295
    .line 296
    :cond_d
    :goto_9
    invoke-virtual {v0}, Landroidx/compose/ui/input/pointer/PointerEvent;->getChanges()Ljava/util/List;

    .line 297
    .line 298
    .line 299
    move-result-object v0

    .line 300
    move-object v4, v0

    .line 301
    check-cast v4, Ljava/util/Collection;

    .line 302
    .line 303
    invoke-interface {v4}, Ljava/util/Collection;->size()I

    .line 304
    .line 305
    .line 306
    move-result v4

    .line 307
    const/4 v5, 0x0

    .line 308
    :goto_a
    if-ge v5, v4, :cond_f

    .line 309
    .line 310
    invoke-interface {v0, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 311
    .line 312
    .line 313
    move-result-object v11

    .line 314
    check-cast v11, Landroidx/compose/ui/input/pointer/PointerInputChange;

    .line 315
    .line 316
    invoke-virtual {v11}, Landroidx/compose/ui/input/pointer/PointerInputChange;->getPressed()Z

    .line 317
    .line 318
    .line 319
    move-result v11

    .line 320
    if-eqz v11, :cond_e

    .line 321
    .line 322
    move-object v0, v10

    .line 323
    const/4 v4, 0x0

    .line 324
    const/4 v5, 0x1

    .line 325
    goto/16 :goto_1

    .line 326
    .line 327
    :cond_e
    add-int/lit8 v5, v5, 0x1

    .line 328
    .line 329
    goto :goto_a

    .line 330
    :cond_f
    if-eqz v7, :cond_10

    .line 331
    .line 332
    const/4 v4, 0x1

    .line 333
    goto :goto_b

    .line 334
    :cond_10
    const/4 v4, 0x0

    .line 335
    :goto_b
    invoke-static {v4}, Lxc/a;->a(Z)Ljava/lang/Boolean;

    .line 336
    .line 337
    .line 338
    move-result-object v0

    .line 339
    return-object v0
.end method

.method public static synthetic awaitAllPointersUpWithSlopDetection$default(Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;Landroidx/compose/ui/input/pointer/PointerInputChange;Landroidx/compose/ui/input/pointer/PointerEventPass;Lvc/c;ILjava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    and-int/lit8 p4, p4, 0x2

    .line 2
    .line 3
    if-eqz p4, :cond_0

    .line 4
    .line 5
    sget-object p2, Landroidx/compose/ui/input/pointer/PointerEventPass;->Main:Landroidx/compose/ui/input/pointer/PointerEventPass;

    .line 6
    .line 7
    :cond_0
    invoke-static {p0, p1, p2, p3}, Landroidx/compose/foundation/gestures/DragGestureDetectorKt;->awaitAllPointersUpWithSlopDetection(Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;Landroidx/compose/ui/input/pointer/PointerInputChange;Landroidx/compose/ui/input/pointer/PointerEventPass;Lvc/c;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    return-object p0
.end method

.method public static final awaitDragOrCancellation-rnUCldI(Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;JLvc/c;)Ljava/lang/Object;
    .locals 17
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;",
            "J",
            "Lvc/c<",
            "-",
            "Landroidx/compose/ui/input/pointer/PointerInputChange;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    move-wide/from16 v0, p1

    .line 2
    .line 3
    move-object/from16 v2, p3

    .line 4
    .line 5
    instance-of v3, v2, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$awaitDragOrCancellation$1;

    .line 6
    .line 7
    if-eqz v3, :cond_0

    .line 8
    .line 9
    move-object v3, v2

    .line 10
    check-cast v3, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$awaitDragOrCancellation$1;

    .line 11
    .line 12
    iget v4, v3, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$awaitDragOrCancellation$1;->label:I

    .line 13
    .line 14
    const/high16 v5, -0x80000000

    .line 15
    .line 16
    and-int v6, v4, v5

    .line 17
    .line 18
    if-eqz v6, :cond_0

    .line 19
    .line 20
    sub-int/2addr v4, v5

    .line 21
    iput v4, v3, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$awaitDragOrCancellation$1;->label:I

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    new-instance v3, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$awaitDragOrCancellation$1;

    .line 25
    .line 26
    invoke-direct {v3, v2}, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$awaitDragOrCancellation$1;-><init>(Lvc/c;)V

    .line 27
    .line 28
    .line 29
    :goto_0
    iget-object v2, v3, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$awaitDragOrCancellation$1;->result:Ljava/lang/Object;

    .line 30
    .line 31
    invoke-static {}, Lwc/a;->f()Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v4

    .line 35
    iget v5, v3, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$awaitDragOrCancellation$1;->label:I

    .line 36
    .line 37
    const/4 v6, 0x1

    .line 38
    const/4 v7, 0x0

    .line 39
    if-eqz v5, :cond_2

    .line 40
    .line 41
    if-ne v5, v6, :cond_1

    .line 42
    .line 43
    iget-object v0, v3, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$awaitDragOrCancellation$1;->L$1:Ljava/lang/Object;

    .line 44
    .line 45
    check-cast v0, Lkotlin/jvm/internal/Ref$LongRef;

    .line 46
    .line 47
    iget-object v1, v3, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$awaitDragOrCancellation$1;->L$0:Ljava/lang/Object;

    .line 48
    .line 49
    check-cast v1, Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;

    .line 50
    .line 51
    invoke-static {v2}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 52
    .line 53
    .line 54
    move-object/from16 v16, v1

    .line 55
    .line 56
    move-object v1, v0

    .line 57
    move-object/from16 v0, v16

    .line 58
    .line 59
    goto :goto_2

    .line 60
    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 61
    .line 62
    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    .line 63
    .line 64
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 65
    .line 66
    .line 67
    throw v0

    .line 68
    :cond_2
    invoke-static {v2}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 69
    .line 70
    .line 71
    invoke-interface/range {p0 .. p0}, Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;->getCurrentEvent()Landroidx/compose/ui/input/pointer/PointerEvent;

    .line 72
    .line 73
    .line 74
    move-result-object v2

    .line 75
    invoke-static {v2, v0, v1}, Landroidx/compose/foundation/gestures/DragGestureDetectorKt;->isPointerUp-DmW0f2w(Landroidx/compose/ui/input/pointer/PointerEvent;J)Z

    .line 76
    .line 77
    .line 78
    move-result v2

    .line 79
    if-eqz v2, :cond_3

    .line 80
    .line 81
    return-object v7

    .line 82
    :cond_3
    new-instance v2, Lkotlin/jvm/internal/Ref$LongRef;

    .line 83
    .line 84
    invoke-direct {v2}, Lkotlin/jvm/internal/Ref$LongRef;-><init>()V

    .line 85
    .line 86
    .line 87
    iput-wide v0, v2, Lkotlin/jvm/internal/Ref$LongRef;->c:J

    .line 88
    .line 89
    move-object/from16 v0, p0

    .line 90
    .line 91
    :goto_1
    iput-object v0, v3, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$awaitDragOrCancellation$1;->L$0:Ljava/lang/Object;

    .line 92
    .line 93
    iput-object v2, v3, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$awaitDragOrCancellation$1;->L$1:Ljava/lang/Object;

    .line 94
    .line 95
    iput v6, v3, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$awaitDragOrCancellation$1;->label:I

    .line 96
    .line 97
    invoke-static {v0, v7, v3, v6, v7}, Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;->awaitPointerEvent$default(Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;Landroidx/compose/ui/input/pointer/PointerEventPass;Lvc/c;ILjava/lang/Object;)Ljava/lang/Object;

    .line 98
    .line 99
    .line 100
    move-result-object v1

    .line 101
    if-ne v1, v4, :cond_4

    .line 102
    .line 103
    return-object v4

    .line 104
    :cond_4
    move-object/from16 v16, v2

    .line 105
    .line 106
    move-object v2, v1

    .line 107
    move-object/from16 v1, v16

    .line 108
    .line 109
    :goto_2
    check-cast v2, Landroidx/compose/ui/input/pointer/PointerEvent;

    .line 110
    .line 111
    invoke-virtual {v2}, Landroidx/compose/ui/input/pointer/PointerEvent;->getChanges()Ljava/util/List;

    .line 112
    .line 113
    .line 114
    move-result-object v5

    .line 115
    move-object v8, v5

    .line 116
    check-cast v8, Ljava/util/Collection;

    .line 117
    .line 118
    invoke-interface {v8}, Ljava/util/Collection;->size()I

    .line 119
    .line 120
    .line 121
    move-result v8

    .line 122
    const/4 v9, 0x0

    .line 123
    move v10, v9

    .line 124
    :goto_3
    if-ge v10, v8, :cond_6

    .line 125
    .line 126
    invoke-interface {v5, v10}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 127
    .line 128
    .line 129
    move-result-object v11

    .line 130
    move-object v12, v11

    .line 131
    check-cast v12, Landroidx/compose/ui/input/pointer/PointerInputChange;

    .line 132
    .line 133
    invoke-virtual {v12}, Landroidx/compose/ui/input/pointer/PointerInputChange;->getId-J3iCeTQ()J

    .line 134
    .line 135
    .line 136
    move-result-wide v12

    .line 137
    iget-wide v14, v1, Lkotlin/jvm/internal/Ref$LongRef;->c:J

    .line 138
    .line 139
    invoke-static {v12, v13, v14, v15}, Landroidx/compose/ui/input/pointer/PointerId;->equals-impl0(JJ)Z

    .line 140
    .line 141
    .line 142
    move-result v12

    .line 143
    if-eqz v12, :cond_5

    .line 144
    .line 145
    goto :goto_4

    .line 146
    :cond_5
    add-int/lit8 v10, v10, 0x1

    .line 147
    .line 148
    goto :goto_3

    .line 149
    :cond_6
    move-object v11, v7

    .line 150
    :goto_4
    check-cast v11, Landroidx/compose/ui/input/pointer/PointerInputChange;

    .line 151
    .line 152
    if-nez v11, :cond_7

    .line 153
    .line 154
    move-object v11, v7

    .line 155
    goto :goto_7

    .line 156
    :cond_7
    invoke-static {v11}, Landroidx/compose/ui/input/pointer/PointerEventKt;->changedToUpIgnoreConsumed(Landroidx/compose/ui/input/pointer/PointerInputChange;)Z

    .line 157
    .line 158
    .line 159
    move-result v5

    .line 160
    if-eqz v5, :cond_b

    .line 161
    .line 162
    invoke-virtual {v2}, Landroidx/compose/ui/input/pointer/PointerEvent;->getChanges()Ljava/util/List;

    .line 163
    .line 164
    .line 165
    move-result-object v2

    .line 166
    move-object v5, v2

    .line 167
    check-cast v5, Ljava/util/Collection;

    .line 168
    .line 169
    invoke-interface {v5}, Ljava/util/Collection;->size()I

    .line 170
    .line 171
    .line 172
    move-result v5

    .line 173
    :goto_5
    if-ge v9, v5, :cond_9

    .line 174
    .line 175
    invoke-interface {v2, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 176
    .line 177
    .line 178
    move-result-object v8

    .line 179
    move-object v10, v8

    .line 180
    check-cast v10, Landroidx/compose/ui/input/pointer/PointerInputChange;

    .line 181
    .line 182
    invoke-virtual {v10}, Landroidx/compose/ui/input/pointer/PointerInputChange;->getPressed()Z

    .line 183
    .line 184
    .line 185
    move-result v10

    .line 186
    if-eqz v10, :cond_8

    .line 187
    .line 188
    goto :goto_6

    .line 189
    :cond_8
    add-int/lit8 v9, v9, 0x1

    .line 190
    .line 191
    goto :goto_5

    .line 192
    :cond_9
    move-object v8, v7

    .line 193
    :goto_6
    check-cast v8, Landroidx/compose/ui/input/pointer/PointerInputChange;

    .line 194
    .line 195
    if-nez v8, :cond_a

    .line 196
    .line 197
    goto :goto_7

    .line 198
    :cond_a
    invoke-virtual {v8}, Landroidx/compose/ui/input/pointer/PointerInputChange;->getId-J3iCeTQ()J

    .line 199
    .line 200
    .line 201
    move-result-wide v8

    .line 202
    iput-wide v8, v1, Lkotlin/jvm/internal/Ref$LongRef;->c:J

    .line 203
    .line 204
    goto :goto_8

    .line 205
    :cond_b
    invoke-static {v11}, Landroidx/compose/ui/input/pointer/PointerEventKt;->positionChangedIgnoreConsumed(Landroidx/compose/ui/input/pointer/PointerInputChange;)Z

    .line 206
    .line 207
    .line 208
    move-result v2

    .line 209
    if-eqz v2, :cond_d

    .line 210
    .line 211
    :goto_7
    if-eqz v11, :cond_c

    .line 212
    .line 213
    invoke-virtual {v11}, Landroidx/compose/ui/input/pointer/PointerInputChange;->isConsumed()Z

    .line 214
    .line 215
    .line 216
    move-result v0

    .line 217
    if-nez v0, :cond_c

    .line 218
    .line 219
    return-object v11

    .line 220
    :cond_c
    return-object v7

    .line 221
    :cond_d
    :goto_8
    move-object v2, v1

    .line 222
    goto/16 :goto_1
.end method

.method private static final awaitDragOrUp-jO51t88(Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;JLhd/l;Lvc/c;)Ljava/lang/Object;
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;",
            "J",
            "Lhd/l;",
            "Lvc/c<",
            "-",
            "Landroidx/compose/ui/input/pointer/PointerInputChange;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    new-instance v0, Lkotlin/jvm/internal/Ref$LongRef;

    .line 2
    .line 3
    invoke-direct {v0}, Lkotlin/jvm/internal/Ref$LongRef;-><init>()V

    .line 4
    .line 5
    .line 6
    iput-wide p1, v0, Lkotlin/jvm/internal/Ref$LongRef;->c:J

    .line 7
    .line 8
    :cond_0
    :goto_0
    const/4 p1, 0x0

    .line 9
    invoke-static {p1}, Lkotlin/jvm/internal/s;->c(I)V

    .line 10
    .line 11
    .line 12
    const/4 p2, 0x0

    .line 13
    const/4 v1, 0x1

    .line 14
    invoke-static {p0, p2, p4, v1, p2}, Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;->awaitPointerEvent$default(Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;Landroidx/compose/ui/input/pointer/PointerEventPass;Lvc/c;ILjava/lang/Object;)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object v2

    .line 18
    invoke-static {v1}, Lkotlin/jvm/internal/s;->c(I)V

    .line 19
    .line 20
    .line 21
    check-cast v2, Landroidx/compose/ui/input/pointer/PointerEvent;

    .line 22
    .line 23
    invoke-virtual {v2}, Landroidx/compose/ui/input/pointer/PointerEvent;->getChanges()Ljava/util/List;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    move-object v3, v1

    .line 28
    check-cast v3, Ljava/util/Collection;

    .line 29
    .line 30
    invoke-interface {v3}, Ljava/util/Collection;->size()I

    .line 31
    .line 32
    .line 33
    move-result v3

    .line 34
    move v4, p1

    .line 35
    :goto_1
    if-ge v4, v3, :cond_2

    .line 36
    .line 37
    invoke-interface {v1, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object v5

    .line 41
    move-object v6, v5

    .line 42
    check-cast v6, Landroidx/compose/ui/input/pointer/PointerInputChange;

    .line 43
    .line 44
    invoke-virtual {v6}, Landroidx/compose/ui/input/pointer/PointerInputChange;->getId-J3iCeTQ()J

    .line 45
    .line 46
    .line 47
    move-result-wide v6

    .line 48
    iget-wide v8, v0, Lkotlin/jvm/internal/Ref$LongRef;->c:J

    .line 49
    .line 50
    invoke-static {v6, v7, v8, v9}, Landroidx/compose/ui/input/pointer/PointerId;->equals-impl0(JJ)Z

    .line 51
    .line 52
    .line 53
    move-result v6

    .line 54
    invoke-static {v6}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 55
    .line 56
    .line 57
    move-result-object v6

    .line 58
    invoke-virtual {v6}, Ljava/lang/Boolean;->booleanValue()Z

    .line 59
    .line 60
    .line 61
    move-result v6

    .line 62
    if-eqz v6, :cond_1

    .line 63
    .line 64
    goto :goto_2

    .line 65
    :cond_1
    add-int/lit8 v4, v4, 0x1

    .line 66
    .line 67
    goto :goto_1

    .line 68
    :cond_2
    move-object v5, p2

    .line 69
    :goto_2
    check-cast v5, Landroidx/compose/ui/input/pointer/PointerInputChange;

    .line 70
    .line 71
    if-eqz v5, :cond_7

    .line 72
    .line 73
    invoke-static {v5}, Landroidx/compose/ui/input/pointer/PointerEventKt;->changedToUpIgnoreConsumed(Landroidx/compose/ui/input/pointer/PointerInputChange;)Z

    .line 74
    .line 75
    .line 76
    move-result v1

    .line 77
    if-eqz v1, :cond_6

    .line 78
    .line 79
    invoke-virtual {v2}, Landroidx/compose/ui/input/pointer/PointerEvent;->getChanges()Ljava/util/List;

    .line 80
    .line 81
    .line 82
    move-result-object v1

    .line 83
    move-object v2, v1

    .line 84
    check-cast v2, Ljava/util/Collection;

    .line 85
    .line 86
    invoke-interface {v2}, Ljava/util/Collection;->size()I

    .line 87
    .line 88
    .line 89
    move-result v2

    .line 90
    :goto_3
    if-ge p1, v2, :cond_4

    .line 91
    .line 92
    invoke-interface {v1, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 93
    .line 94
    .line 95
    move-result-object v3

    .line 96
    move-object v4, v3

    .line 97
    check-cast v4, Landroidx/compose/ui/input/pointer/PointerInputChange;

    .line 98
    .line 99
    invoke-virtual {v4}, Landroidx/compose/ui/input/pointer/PointerInputChange;->getPressed()Z

    .line 100
    .line 101
    .line 102
    move-result v4

    .line 103
    invoke-static {v4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 104
    .line 105
    .line 106
    move-result-object v4

    .line 107
    invoke-virtual {v4}, Ljava/lang/Boolean;->booleanValue()Z

    .line 108
    .line 109
    .line 110
    move-result v4

    .line 111
    if-eqz v4, :cond_3

    .line 112
    .line 113
    move-object p2, v3

    .line 114
    goto :goto_4

    .line 115
    :cond_3
    add-int/lit8 p1, p1, 0x1

    .line 116
    .line 117
    goto :goto_3

    .line 118
    :cond_4
    :goto_4
    check-cast p2, Landroidx/compose/ui/input/pointer/PointerInputChange;

    .line 119
    .line 120
    if-nez p2, :cond_5

    .line 121
    .line 122
    goto :goto_5

    .line 123
    :cond_5
    invoke-virtual {p2}, Landroidx/compose/ui/input/pointer/PointerInputChange;->getId-J3iCeTQ()J

    .line 124
    .line 125
    .line 126
    move-result-wide p1

    .line 127
    iput-wide p1, v0, Lkotlin/jvm/internal/Ref$LongRef;->c:J

    .line 128
    .line 129
    goto :goto_0

    .line 130
    :cond_6
    invoke-interface {p3, v5}, Lhd/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 131
    .line 132
    .line 133
    move-result-object p1

    .line 134
    check-cast p1, Ljava/lang/Boolean;

    .line 135
    .line 136
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 137
    .line 138
    .line 139
    move-result p1

    .line 140
    if-eqz p1, :cond_0

    .line 141
    .line 142
    :goto_5
    return-object v5

    .line 143
    :cond_7
    return-object p2
.end method

.method public static final awaitHorizontalDragOrCancellation-rnUCldI(Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;JLvc/c;)Ljava/lang/Object;
    .locals 17
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;",
            "J",
            "Lvc/c<",
            "-",
            "Landroidx/compose/ui/input/pointer/PointerInputChange;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    move-wide/from16 v0, p1

    .line 2
    .line 3
    move-object/from16 v2, p3

    .line 4
    .line 5
    instance-of v3, v2, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$awaitHorizontalDragOrCancellation$1;

    .line 6
    .line 7
    if-eqz v3, :cond_0

    .line 8
    .line 9
    move-object v3, v2

    .line 10
    check-cast v3, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$awaitHorizontalDragOrCancellation$1;

    .line 11
    .line 12
    iget v4, v3, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$awaitHorizontalDragOrCancellation$1;->label:I

    .line 13
    .line 14
    const/high16 v5, -0x80000000

    .line 15
    .line 16
    and-int v6, v4, v5

    .line 17
    .line 18
    if-eqz v6, :cond_0

    .line 19
    .line 20
    sub-int/2addr v4, v5

    .line 21
    iput v4, v3, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$awaitHorizontalDragOrCancellation$1;->label:I

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    new-instance v3, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$awaitHorizontalDragOrCancellation$1;

    .line 25
    .line 26
    invoke-direct {v3, v2}, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$awaitHorizontalDragOrCancellation$1;-><init>(Lvc/c;)V

    .line 27
    .line 28
    .line 29
    :goto_0
    iget-object v2, v3, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$awaitHorizontalDragOrCancellation$1;->result:Ljava/lang/Object;

    .line 30
    .line 31
    invoke-static {}, Lwc/a;->f()Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v4

    .line 35
    iget v5, v3, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$awaitHorizontalDragOrCancellation$1;->label:I

    .line 36
    .line 37
    const/4 v6, 0x1

    .line 38
    const/4 v7, 0x0

    .line 39
    if-eqz v5, :cond_2

    .line 40
    .line 41
    if-ne v5, v6, :cond_1

    .line 42
    .line 43
    iget-object v0, v3, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$awaitHorizontalDragOrCancellation$1;->L$1:Ljava/lang/Object;

    .line 44
    .line 45
    check-cast v0, Lkotlin/jvm/internal/Ref$LongRef;

    .line 46
    .line 47
    iget-object v1, v3, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$awaitHorizontalDragOrCancellation$1;->L$0:Ljava/lang/Object;

    .line 48
    .line 49
    check-cast v1, Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;

    .line 50
    .line 51
    invoke-static {v2}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 52
    .line 53
    .line 54
    move-object/from16 v16, v1

    .line 55
    .line 56
    move-object v1, v0

    .line 57
    move-object/from16 v0, v16

    .line 58
    .line 59
    goto :goto_2

    .line 60
    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 61
    .line 62
    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    .line 63
    .line 64
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 65
    .line 66
    .line 67
    throw v0

    .line 68
    :cond_2
    invoke-static {v2}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 69
    .line 70
    .line 71
    invoke-interface/range {p0 .. p0}, Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;->getCurrentEvent()Landroidx/compose/ui/input/pointer/PointerEvent;

    .line 72
    .line 73
    .line 74
    move-result-object v2

    .line 75
    invoke-static {v2, v0, v1}, Landroidx/compose/foundation/gestures/DragGestureDetectorKt;->isPointerUp-DmW0f2w(Landroidx/compose/ui/input/pointer/PointerEvent;J)Z

    .line 76
    .line 77
    .line 78
    move-result v2

    .line 79
    if-eqz v2, :cond_3

    .line 80
    .line 81
    return-object v7

    .line 82
    :cond_3
    new-instance v2, Lkotlin/jvm/internal/Ref$LongRef;

    .line 83
    .line 84
    invoke-direct {v2}, Lkotlin/jvm/internal/Ref$LongRef;-><init>()V

    .line 85
    .line 86
    .line 87
    iput-wide v0, v2, Lkotlin/jvm/internal/Ref$LongRef;->c:J

    .line 88
    .line 89
    move-object/from16 v0, p0

    .line 90
    .line 91
    :goto_1
    iput-object v0, v3, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$awaitHorizontalDragOrCancellation$1;->L$0:Ljava/lang/Object;

    .line 92
    .line 93
    iput-object v2, v3, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$awaitHorizontalDragOrCancellation$1;->L$1:Ljava/lang/Object;

    .line 94
    .line 95
    iput v6, v3, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$awaitHorizontalDragOrCancellation$1;->label:I

    .line 96
    .line 97
    invoke-static {v0, v7, v3, v6, v7}, Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;->awaitPointerEvent$default(Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;Landroidx/compose/ui/input/pointer/PointerEventPass;Lvc/c;ILjava/lang/Object;)Ljava/lang/Object;

    .line 98
    .line 99
    .line 100
    move-result-object v1

    .line 101
    if-ne v1, v4, :cond_4

    .line 102
    .line 103
    return-object v4

    .line 104
    :cond_4
    move-object/from16 v16, v2

    .line 105
    .line 106
    move-object v2, v1

    .line 107
    move-object/from16 v1, v16

    .line 108
    .line 109
    :goto_2
    check-cast v2, Landroidx/compose/ui/input/pointer/PointerEvent;

    .line 110
    .line 111
    invoke-virtual {v2}, Landroidx/compose/ui/input/pointer/PointerEvent;->getChanges()Ljava/util/List;

    .line 112
    .line 113
    .line 114
    move-result-object v5

    .line 115
    move-object v8, v5

    .line 116
    check-cast v8, Ljava/util/Collection;

    .line 117
    .line 118
    invoke-interface {v8}, Ljava/util/Collection;->size()I

    .line 119
    .line 120
    .line 121
    move-result v8

    .line 122
    const/4 v9, 0x0

    .line 123
    move v10, v9

    .line 124
    :goto_3
    if-ge v10, v8, :cond_6

    .line 125
    .line 126
    invoke-interface {v5, v10}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 127
    .line 128
    .line 129
    move-result-object v11

    .line 130
    move-object v12, v11

    .line 131
    check-cast v12, Landroidx/compose/ui/input/pointer/PointerInputChange;

    .line 132
    .line 133
    invoke-virtual {v12}, Landroidx/compose/ui/input/pointer/PointerInputChange;->getId-J3iCeTQ()J

    .line 134
    .line 135
    .line 136
    move-result-wide v12

    .line 137
    iget-wide v14, v1, Lkotlin/jvm/internal/Ref$LongRef;->c:J

    .line 138
    .line 139
    invoke-static {v12, v13, v14, v15}, Landroidx/compose/ui/input/pointer/PointerId;->equals-impl0(JJ)Z

    .line 140
    .line 141
    .line 142
    move-result v12

    .line 143
    if-eqz v12, :cond_5

    .line 144
    .line 145
    goto :goto_4

    .line 146
    :cond_5
    add-int/lit8 v10, v10, 0x1

    .line 147
    .line 148
    goto :goto_3

    .line 149
    :cond_6
    move-object v11, v7

    .line 150
    :goto_4
    check-cast v11, Landroidx/compose/ui/input/pointer/PointerInputChange;

    .line 151
    .line 152
    if-nez v11, :cond_7

    .line 153
    .line 154
    move-object v11, v7

    .line 155
    goto :goto_7

    .line 156
    :cond_7
    invoke-static {v11}, Landroidx/compose/ui/input/pointer/PointerEventKt;->changedToUpIgnoreConsumed(Landroidx/compose/ui/input/pointer/PointerInputChange;)Z

    .line 157
    .line 158
    .line 159
    move-result v5

    .line 160
    if-eqz v5, :cond_b

    .line 161
    .line 162
    invoke-virtual {v2}, Landroidx/compose/ui/input/pointer/PointerEvent;->getChanges()Ljava/util/List;

    .line 163
    .line 164
    .line 165
    move-result-object v2

    .line 166
    move-object v5, v2

    .line 167
    check-cast v5, Ljava/util/Collection;

    .line 168
    .line 169
    invoke-interface {v5}, Ljava/util/Collection;->size()I

    .line 170
    .line 171
    .line 172
    move-result v5

    .line 173
    :goto_5
    if-ge v9, v5, :cond_9

    .line 174
    .line 175
    invoke-interface {v2, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 176
    .line 177
    .line 178
    move-result-object v8

    .line 179
    move-object v10, v8

    .line 180
    check-cast v10, Landroidx/compose/ui/input/pointer/PointerInputChange;

    .line 181
    .line 182
    invoke-virtual {v10}, Landroidx/compose/ui/input/pointer/PointerInputChange;->getPressed()Z

    .line 183
    .line 184
    .line 185
    move-result v10

    .line 186
    if-eqz v10, :cond_8

    .line 187
    .line 188
    goto :goto_6

    .line 189
    :cond_8
    add-int/lit8 v9, v9, 0x1

    .line 190
    .line 191
    goto :goto_5

    .line 192
    :cond_9
    move-object v8, v7

    .line 193
    :goto_6
    check-cast v8, Landroidx/compose/ui/input/pointer/PointerInputChange;

    .line 194
    .line 195
    if-nez v8, :cond_a

    .line 196
    .line 197
    goto :goto_7

    .line 198
    :cond_a
    invoke-virtual {v8}, Landroidx/compose/ui/input/pointer/PointerInputChange;->getId-J3iCeTQ()J

    .line 199
    .line 200
    .line 201
    move-result-wide v8

    .line 202
    iput-wide v8, v1, Lkotlin/jvm/internal/Ref$LongRef;->c:J

    .line 203
    .line 204
    goto :goto_8

    .line 205
    :cond_b
    invoke-static {v11}, Landroidx/compose/ui/input/pointer/PointerEventKt;->positionChangeIgnoreConsumed(Landroidx/compose/ui/input/pointer/PointerInputChange;)J

    .line 206
    .line 207
    .line 208
    move-result-wide v12

    .line 209
    const/16 v2, 0x20

    .line 210
    .line 211
    shr-long/2addr v12, v2

    .line 212
    long-to-int v2, v12

    .line 213
    invoke-static {v2}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 214
    .line 215
    .line 216
    move-result v2

    .line 217
    const/4 v5, 0x0

    .line 218
    cmpg-float v2, v2, v5

    .line 219
    .line 220
    if-nez v2, :cond_c

    .line 221
    .line 222
    move v9, v6

    .line 223
    :cond_c
    if-nez v9, :cond_e

    .line 224
    .line 225
    :goto_7
    if-eqz v11, :cond_d

    .line 226
    .line 227
    invoke-virtual {v11}, Landroidx/compose/ui/input/pointer/PointerInputChange;->isConsumed()Z

    .line 228
    .line 229
    .line 230
    move-result v0

    .line 231
    if-nez v0, :cond_d

    .line 232
    .line 233
    return-object v11

    .line 234
    :cond_d
    return-object v7

    .line 235
    :cond_e
    :goto_8
    move-object v2, v1

    .line 236
    goto/16 :goto_1
.end method

.method public static final awaitHorizontalPointerSlopOrCancellation-gDDlDlE(Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;JILhd/p;Lvc/c;)Ljava/lang/Object;
    .locals 21
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;",
            "JI",
            "Lhd/p;",
            "Lvc/c<",
            "-",
            "Landroidx/compose/ui/input/pointer/PointerInputChange;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    move-wide/from16 v0, p1

    .line 2
    .line 3
    move-object/from16 v2, p5

    .line 4
    .line 5
    instance-of v3, v2, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1;

    .line 6
    .line 7
    if-eqz v3, :cond_0

    .line 8
    .line 9
    move-object v3, v2

    .line 10
    check-cast v3, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1;

    .line 11
    .line 12
    iget v4, v3, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1;->label:I

    .line 13
    .line 14
    const/high16 v5, -0x80000000

    .line 15
    .line 16
    and-int v6, v4, v5

    .line 17
    .line 18
    if-eqz v6, :cond_0

    .line 19
    .line 20
    sub-int/2addr v4, v5

    .line 21
    iput v4, v3, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1;->label:I

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    new-instance v3, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1;

    .line 25
    .line 26
    invoke-direct {v3, v2}, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1;-><init>(Lvc/c;)V

    .line 27
    .line 28
    .line 29
    :goto_0
    iget-object v2, v3, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1;->result:Ljava/lang/Object;

    .line 30
    .line 31
    invoke-static {}, Lwc/a;->f()Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v4

    .line 35
    iget v5, v3, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1;->label:I

    .line 36
    .line 37
    const/4 v6, 0x2

    .line 38
    const/4 v7, 0x1

    .line 39
    const/4 v8, 0x0

    .line 40
    if-eqz v5, :cond_3

    .line 41
    .line 42
    if-eq v5, v7, :cond_2

    .line 43
    .line 44
    if-ne v5, v6, :cond_1

    .line 45
    .line 46
    iget v0, v3, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1;->F$0:F

    .line 47
    .line 48
    iget-object v1, v3, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1;->L$4:Ljava/lang/Object;

    .line 49
    .line 50
    check-cast v1, Landroidx/compose/ui/input/pointer/PointerInputChange;

    .line 51
    .line 52
    iget-object v5, v3, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1;->L$3:Ljava/lang/Object;

    .line 53
    .line 54
    check-cast v5, Landroidx/compose/foundation/gestures/TouchSlopDetector;

    .line 55
    .line 56
    iget-object v9, v3, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1;->L$2:Ljava/lang/Object;

    .line 57
    .line 58
    check-cast v9, Lkotlin/jvm/internal/Ref$LongRef;

    .line 59
    .line 60
    iget-object v10, v3, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1;->L$1:Ljava/lang/Object;

    .line 61
    .line 62
    check-cast v10, Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;

    .line 63
    .line 64
    iget-object v11, v3, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1;->L$0:Ljava/lang/Object;

    .line 65
    .line 66
    check-cast v11, Lhd/p;

    .line 67
    .line 68
    invoke-static {v2}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 69
    .line 70
    .line 71
    move-object v2, v5

    .line 72
    move-object/from16 v17, v8

    .line 73
    .line 74
    move v5, v0

    .line 75
    move-object v0, v10

    .line 76
    goto/16 :goto_9

    .line 77
    .line 78
    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 79
    .line 80
    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    .line 81
    .line 82
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 83
    .line 84
    .line 85
    throw v0

    .line 86
    :cond_2
    iget v0, v3, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1;->F$0:F

    .line 87
    .line 88
    iget-object v1, v3, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1;->L$3:Ljava/lang/Object;

    .line 89
    .line 90
    check-cast v1, Landroidx/compose/foundation/gestures/TouchSlopDetector;

    .line 91
    .line 92
    iget-object v5, v3, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1;->L$2:Ljava/lang/Object;

    .line 93
    .line 94
    check-cast v5, Lkotlin/jvm/internal/Ref$LongRef;

    .line 95
    .line 96
    iget-object v9, v3, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1;->L$1:Ljava/lang/Object;

    .line 97
    .line 98
    check-cast v9, Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;

    .line 99
    .line 100
    iget-object v10, v3, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1;->L$0:Ljava/lang/Object;

    .line 101
    .line 102
    check-cast v10, Lhd/p;

    .line 103
    .line 104
    invoke-static {v2}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 105
    .line 106
    .line 107
    move-object v11, v9

    .line 108
    move v9, v0

    .line 109
    move-object v0, v11

    .line 110
    move-object v11, v5

    .line 111
    move-object v5, v3

    .line 112
    move-object v3, v1

    .line 113
    move-object v1, v10

    .line 114
    goto :goto_2

    .line 115
    :cond_3
    invoke-static {v2}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 116
    .line 117
    .line 118
    sget-object v2, Landroidx/compose/foundation/gestures/Orientation;->Horizontal:Landroidx/compose/foundation/gestures/Orientation;

    .line 119
    .line 120
    sget-object v5, Landroidx/compose/ui/geometry/Offset;->Companion:Landroidx/compose/ui/geometry/Offset$Companion;

    .line 121
    .line 122
    invoke-virtual {v5}, Landroidx/compose/ui/geometry/Offset$Companion;->getZero-F1C5BW0()J

    .line 123
    .line 124
    .line 125
    move-result-wide v9

    .line 126
    invoke-interface/range {p0 .. p0}, Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;->getCurrentEvent()Landroidx/compose/ui/input/pointer/PointerEvent;

    .line 127
    .line 128
    .line 129
    move-result-object v5

    .line 130
    invoke-static {v5, v0, v1}, Landroidx/compose/foundation/gestures/DragGestureDetectorKt;->access$isPointerUp-DmW0f2w(Landroidx/compose/ui/input/pointer/PointerEvent;J)Z

    .line 131
    .line 132
    .line 133
    move-result v5

    .line 134
    if-eqz v5, :cond_4

    .line 135
    .line 136
    return-object v8

    .line 137
    :cond_4
    invoke-interface/range {p0 .. p0}, Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;->getViewConfiguration()Landroidx/compose/ui/platform/ViewConfiguration;

    .line 138
    .line 139
    .line 140
    move-result-object v5

    .line 141
    move/from16 v11, p3

    .line 142
    .line 143
    invoke-static {v5, v11}, Landroidx/compose/foundation/gestures/DragGestureDetectorKt;->pointerSlop-E8SPZFQ(Landroidx/compose/ui/platform/ViewConfiguration;I)F

    .line 144
    .line 145
    .line 146
    move-result v5

    .line 147
    new-instance v11, Lkotlin/jvm/internal/Ref$LongRef;

    .line 148
    .line 149
    invoke-direct {v11}, Lkotlin/jvm/internal/Ref$LongRef;-><init>()V

    .line 150
    .line 151
    .line 152
    iput-wide v0, v11, Lkotlin/jvm/internal/Ref$LongRef;->c:J

    .line 153
    .line 154
    new-instance v0, Landroidx/compose/foundation/gestures/TouchSlopDetector;

    .line 155
    .line 156
    invoke-direct {v0, v2, v9, v10, v8}, Landroidx/compose/foundation/gestures/TouchSlopDetector;-><init>(Landroidx/compose/foundation/gestures/Orientation;JLkotlin/jvm/internal/n;)V

    .line 157
    .line 158
    .line 159
    move-object/from16 v1, p4

    .line 160
    .line 161
    move-object v2, v0

    .line 162
    move-object/from16 v0, p0

    .line 163
    .line 164
    :goto_1
    iput-object v1, v3, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1;->L$0:Ljava/lang/Object;

    .line 165
    .line 166
    iput-object v0, v3, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1;->L$1:Ljava/lang/Object;

    .line 167
    .line 168
    iput-object v11, v3, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1;->L$2:Ljava/lang/Object;

    .line 169
    .line 170
    iput-object v2, v3, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1;->L$3:Ljava/lang/Object;

    .line 171
    .line 172
    iput-object v8, v3, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1;->L$4:Ljava/lang/Object;

    .line 173
    .line 174
    iput v5, v3, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1;->F$0:F

    .line 175
    .line 176
    iput v7, v3, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1;->label:I

    .line 177
    .line 178
    invoke-static {v0, v8, v3, v7, v8}, Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;->awaitPointerEvent$default(Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;Landroidx/compose/ui/input/pointer/PointerEventPass;Lvc/c;ILjava/lang/Object;)Ljava/lang/Object;

    .line 179
    .line 180
    .line 181
    move-result-object v9

    .line 182
    if-ne v9, v4, :cond_5

    .line 183
    .line 184
    goto/16 :goto_8

    .line 185
    .line 186
    :cond_5
    move-object/from16 v20, v3

    .line 187
    .line 188
    move-object v3, v2

    .line 189
    move-object v2, v9

    .line 190
    move v9, v5

    .line 191
    move-object/from16 v5, v20

    .line 192
    .line 193
    :goto_2
    check-cast v2, Landroidx/compose/ui/input/pointer/PointerEvent;

    .line 194
    .line 195
    invoke-virtual {v2}, Landroidx/compose/ui/input/pointer/PointerEvent;->getChanges()Ljava/util/List;

    .line 196
    .line 197
    .line 198
    move-result-object v10

    .line 199
    move-object v12, v10

    .line 200
    check-cast v12, Ljava/util/Collection;

    .line 201
    .line 202
    invoke-interface {v12}, Ljava/util/Collection;->size()I

    .line 203
    .line 204
    .line 205
    move-result v12

    .line 206
    const/4 v14, 0x0

    .line 207
    :goto_3
    if-ge v14, v12, :cond_7

    .line 208
    .line 209
    invoke-interface {v10, v14}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 210
    .line 211
    .line 212
    move-result-object v15

    .line 213
    move-object/from16 v16, v15

    .line 214
    .line 215
    check-cast v16, Landroidx/compose/ui/input/pointer/PointerInputChange;

    .line 216
    .line 217
    move-object/from16 v17, v8

    .line 218
    .line 219
    invoke-virtual/range {v16 .. v16}, Landroidx/compose/ui/input/pointer/PointerInputChange;->getId-J3iCeTQ()J

    .line 220
    .line 221
    .line 222
    move-result-wide v7

    .line 223
    move/from16 v16, v14

    .line 224
    .line 225
    iget-wide v13, v11, Lkotlin/jvm/internal/Ref$LongRef;->c:J

    .line 226
    .line 227
    invoke-static {v7, v8, v13, v14}, Landroidx/compose/ui/input/pointer/PointerId;->equals-impl0(JJ)Z

    .line 228
    .line 229
    .line 230
    move-result v7

    .line 231
    if-eqz v7, :cond_6

    .line 232
    .line 233
    goto :goto_4

    .line 234
    :cond_6
    add-int/lit8 v14, v16, 0x1

    .line 235
    .line 236
    move-object/from16 v8, v17

    .line 237
    .line 238
    const/4 v7, 0x1

    .line 239
    goto :goto_3

    .line 240
    :cond_7
    move-object/from16 v17, v8

    .line 241
    .line 242
    move-object/from16 v15, v17

    .line 243
    .line 244
    :goto_4
    move-object v7, v15

    .line 245
    check-cast v7, Landroidx/compose/ui/input/pointer/PointerInputChange;

    .line 246
    .line 247
    if-nez v7, :cond_8

    .line 248
    .line 249
    return-object v17

    .line 250
    :cond_8
    invoke-virtual {v7}, Landroidx/compose/ui/input/pointer/PointerInputChange;->isConsumed()Z

    .line 251
    .line 252
    .line 253
    move-result v8

    .line 254
    if-eqz v8, :cond_9

    .line 255
    .line 256
    return-object v17

    .line 257
    :cond_9
    invoke-static {v7}, Landroidx/compose/ui/input/pointer/PointerEventKt;->changedToUpIgnoreConsumed(Landroidx/compose/ui/input/pointer/PointerInputChange;)Z

    .line 258
    .line 259
    .line 260
    move-result v8

    .line 261
    if-eqz v8, :cond_d

    .line 262
    .line 263
    invoke-virtual {v2}, Landroidx/compose/ui/input/pointer/PointerEvent;->getChanges()Ljava/util/List;

    .line 264
    .line 265
    .line 266
    move-result-object v2

    .line 267
    move-object v7, v2

    .line 268
    check-cast v7, Ljava/util/Collection;

    .line 269
    .line 270
    invoke-interface {v7}, Ljava/util/Collection;->size()I

    .line 271
    .line 272
    .line 273
    move-result v7

    .line 274
    const/4 v13, 0x0

    .line 275
    :goto_5
    if-ge v13, v7, :cond_b

    .line 276
    .line 277
    invoke-interface {v2, v13}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 278
    .line 279
    .line 280
    move-result-object v8

    .line 281
    move-object v10, v8

    .line 282
    check-cast v10, Landroidx/compose/ui/input/pointer/PointerInputChange;

    .line 283
    .line 284
    invoke-virtual {v10}, Landroidx/compose/ui/input/pointer/PointerInputChange;->getPressed()Z

    .line 285
    .line 286
    .line 287
    move-result v10

    .line 288
    if-eqz v10, :cond_a

    .line 289
    .line 290
    goto :goto_6

    .line 291
    :cond_a
    add-int/lit8 v13, v13, 0x1

    .line 292
    .line 293
    goto :goto_5

    .line 294
    :cond_b
    move-object/from16 v8, v17

    .line 295
    .line 296
    :goto_6
    check-cast v8, Landroidx/compose/ui/input/pointer/PointerInputChange;

    .line 297
    .line 298
    if-nez v8, :cond_c

    .line 299
    .line 300
    return-object v17

    .line 301
    :cond_c
    invoke-virtual {v8}, Landroidx/compose/ui/input/pointer/PointerInputChange;->getId-J3iCeTQ()J

    .line 302
    .line 303
    .line 304
    move-result-wide v7

    .line 305
    iput-wide v7, v11, Lkotlin/jvm/internal/Ref$LongRef;->c:J

    .line 306
    .line 307
    goto :goto_7

    .line 308
    :cond_d
    invoke-virtual {v3, v7, v9}, Landroidx/compose/foundation/gestures/TouchSlopDetector;->addPointerInputChange-dBAh8RU(Landroidx/compose/ui/input/pointer/PointerInputChange;F)J

    .line 309
    .line 310
    .line 311
    move-result-wide v12

    .line 312
    const-wide v14, 0x7fffffff7fffffffL

    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    and-long/2addr v14, v12

    .line 318
    const-wide v18, 0x7fc000007fc00000L    # 2.247117487993712E307

    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    cmp-long v2, v14, v18

    .line 324
    .line 325
    if-eqz v2, :cond_f

    .line 326
    .line 327
    const/16 v2, 0x20

    .line 328
    .line 329
    shr-long/2addr v12, v2

    .line 330
    long-to-int v2, v12

    .line 331
    invoke-static {v2}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 332
    .line 333
    .line 334
    move-result v2

    .line 335
    invoke-static {v2}, Lxc/a;->b(F)Ljava/lang/Float;

    .line 336
    .line 337
    .line 338
    move-result-object v2

    .line 339
    invoke-interface {v1, v7, v2}, Lhd/p;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 340
    .line 341
    .line 342
    invoke-virtual {v7}, Landroidx/compose/ui/input/pointer/PointerInputChange;->isConsumed()Z

    .line 343
    .line 344
    .line 345
    move-result v2

    .line 346
    if-eqz v2, :cond_e

    .line 347
    .line 348
    return-object v7

    .line 349
    :cond_e
    invoke-virtual {v3}, Landroidx/compose/foundation/gestures/TouchSlopDetector;->reset()V

    .line 350
    .line 351
    .line 352
    :goto_7
    move-object v2, v3

    .line 353
    move-object v3, v5

    .line 354
    move v5, v9

    .line 355
    move-object/from16 v8, v17

    .line 356
    .line 357
    const/4 v7, 0x1

    .line 358
    goto/16 :goto_1

    .line 359
    .line 360
    :cond_f
    sget-object v2, Landroidx/compose/ui/input/pointer/PointerEventPass;->Final:Landroidx/compose/ui/input/pointer/PointerEventPass;

    .line 361
    .line 362
    iput-object v1, v5, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1;->L$0:Ljava/lang/Object;

    .line 363
    .line 364
    iput-object v0, v5, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1;->L$1:Ljava/lang/Object;

    .line 365
    .line 366
    iput-object v11, v5, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1;->L$2:Ljava/lang/Object;

    .line 367
    .line 368
    iput-object v3, v5, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1;->L$3:Ljava/lang/Object;

    .line 369
    .line 370
    iput-object v7, v5, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1;->L$4:Ljava/lang/Object;

    .line 371
    .line 372
    iput v9, v5, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1;->F$0:F

    .line 373
    .line 374
    iput v6, v5, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1;->label:I

    .line 375
    .line 376
    invoke-interface {v0, v2, v5}, Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;->awaitPointerEvent(Landroidx/compose/ui/input/pointer/PointerEventPass;Lvc/c;)Ljava/lang/Object;

    .line 377
    .line 378
    .line 379
    move-result-object v2

    .line 380
    if-ne v2, v4, :cond_10

    .line 381
    .line 382
    :goto_8
    return-object v4

    .line 383
    :cond_10
    move-object v2, v3

    .line 384
    move-object v3, v5

    .line 385
    move v5, v9

    .line 386
    move-object v9, v11

    .line 387
    move-object v11, v1

    .line 388
    move-object v1, v7

    .line 389
    :goto_9
    invoke-virtual {v1}, Landroidx/compose/ui/input/pointer/PointerInputChange;->isConsumed()Z

    .line 390
    .line 391
    .line 392
    move-result v1

    .line 393
    if-eqz v1, :cond_11

    .line 394
    .line 395
    return-object v17

    .line 396
    :cond_11
    move-object v1, v11

    .line 397
    move-object/from16 v8, v17

    .line 398
    .line 399
    const/4 v7, 0x1

    .line 400
    move-object v11, v9

    .line 401
    goto/16 :goto_1
.end method

.method public static final awaitHorizontalTouchSlopOrCancellation-jO51t88(Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;JLhd/p;Lvc/c;)Ljava/lang/Object;
    .locals 21
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;",
            "J",
            "Lhd/p;",
            "Lvc/c<",
            "-",
            "Landroidx/compose/ui/input/pointer/PointerInputChange;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    move-wide/from16 v0, p1

    .line 2
    .line 3
    move-object/from16 v2, p4

    .line 4
    .line 5
    instance-of v3, v2, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$1;

    .line 6
    .line 7
    if-eqz v3, :cond_0

    .line 8
    .line 9
    move-object v3, v2

    .line 10
    check-cast v3, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$1;

    .line 11
    .line 12
    iget v4, v3, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$1;->label:I

    .line 13
    .line 14
    const/high16 v5, -0x80000000

    .line 15
    .line 16
    and-int v6, v4, v5

    .line 17
    .line 18
    if-eqz v6, :cond_0

    .line 19
    .line 20
    sub-int/2addr v4, v5

    .line 21
    iput v4, v3, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$1;->label:I

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    new-instance v3, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$1;

    .line 25
    .line 26
    invoke-direct {v3, v2}, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$1;-><init>(Lvc/c;)V

    .line 27
    .line 28
    .line 29
    :goto_0
    iget-object v2, v3, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$1;->result:Ljava/lang/Object;

    .line 30
    .line 31
    invoke-static {}, Lwc/a;->f()Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v4

    .line 35
    iget v5, v3, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$1;->label:I

    .line 36
    .line 37
    const/4 v6, 0x2

    .line 38
    const/4 v7, 0x1

    .line 39
    const/4 v8, 0x0

    .line 40
    if-eqz v5, :cond_3

    .line 41
    .line 42
    if-eq v5, v7, :cond_2

    .line 43
    .line 44
    if-ne v5, v6, :cond_1

    .line 45
    .line 46
    iget v0, v3, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$1;->F$0:F

    .line 47
    .line 48
    iget-object v1, v3, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$1;->L$4:Ljava/lang/Object;

    .line 49
    .line 50
    check-cast v1, Landroidx/compose/ui/input/pointer/PointerInputChange;

    .line 51
    .line 52
    iget-object v5, v3, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$1;->L$3:Ljava/lang/Object;

    .line 53
    .line 54
    check-cast v5, Landroidx/compose/foundation/gestures/TouchSlopDetector;

    .line 55
    .line 56
    iget-object v9, v3, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$1;->L$2:Ljava/lang/Object;

    .line 57
    .line 58
    check-cast v9, Lkotlin/jvm/internal/Ref$LongRef;

    .line 59
    .line 60
    iget-object v10, v3, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$1;->L$1:Ljava/lang/Object;

    .line 61
    .line 62
    check-cast v10, Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;

    .line 63
    .line 64
    iget-object v11, v3, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$1;->L$0:Ljava/lang/Object;

    .line 65
    .line 66
    check-cast v11, Lhd/p;

    .line 67
    .line 68
    invoke-static {v2}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 69
    .line 70
    .line 71
    move-object v2, v5

    .line 72
    move-object/from16 v17, v8

    .line 73
    .line 74
    move-object v5, v3

    .line 75
    move v3, v0

    .line 76
    move-object v0, v10

    .line 77
    goto/16 :goto_9

    .line 78
    .line 79
    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 80
    .line 81
    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    .line 82
    .line 83
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 84
    .line 85
    .line 86
    throw v0

    .line 87
    :cond_2
    iget v0, v3, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$1;->F$0:F

    .line 88
    .line 89
    iget-object v1, v3, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$1;->L$3:Ljava/lang/Object;

    .line 90
    .line 91
    check-cast v1, Landroidx/compose/foundation/gestures/TouchSlopDetector;

    .line 92
    .line 93
    iget-object v5, v3, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$1;->L$2:Ljava/lang/Object;

    .line 94
    .line 95
    check-cast v5, Lkotlin/jvm/internal/Ref$LongRef;

    .line 96
    .line 97
    iget-object v9, v3, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$1;->L$1:Ljava/lang/Object;

    .line 98
    .line 99
    check-cast v9, Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;

    .line 100
    .line 101
    iget-object v10, v3, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$1;->L$0:Ljava/lang/Object;

    .line 102
    .line 103
    check-cast v10, Lhd/p;

    .line 104
    .line 105
    invoke-static {v2}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 106
    .line 107
    .line 108
    move-object v11, v5

    .line 109
    move v5, v0

    .line 110
    move-object v0, v9

    .line 111
    move-object v9, v3

    .line 112
    move-object v3, v1

    .line 113
    move-object v1, v10

    .line 114
    goto :goto_2

    .line 115
    :cond_3
    invoke-static {v2}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 116
    .line 117
    .line 118
    sget-object v2, Landroidx/compose/ui/input/pointer/PointerType;->Companion:Landroidx/compose/ui/input/pointer/PointerType$Companion;

    .line 119
    .line 120
    invoke-virtual {v2}, Landroidx/compose/ui/input/pointer/PointerType$Companion;->getTouch-T8wyACA()I

    .line 121
    .line 122
    .line 123
    move-result v2

    .line 124
    sget-object v5, Landroidx/compose/foundation/gestures/Orientation;->Horizontal:Landroidx/compose/foundation/gestures/Orientation;

    .line 125
    .line 126
    sget-object v9, Landroidx/compose/ui/geometry/Offset;->Companion:Landroidx/compose/ui/geometry/Offset$Companion;

    .line 127
    .line 128
    invoke-virtual {v9}, Landroidx/compose/ui/geometry/Offset$Companion;->getZero-F1C5BW0()J

    .line 129
    .line 130
    .line 131
    move-result-wide v9

    .line 132
    invoke-interface/range {p0 .. p0}, Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;->getCurrentEvent()Landroidx/compose/ui/input/pointer/PointerEvent;

    .line 133
    .line 134
    .line 135
    move-result-object v11

    .line 136
    invoke-static {v11, v0, v1}, Landroidx/compose/foundation/gestures/DragGestureDetectorKt;->access$isPointerUp-DmW0f2w(Landroidx/compose/ui/input/pointer/PointerEvent;J)Z

    .line 137
    .line 138
    .line 139
    move-result v11

    .line 140
    if-eqz v11, :cond_4

    .line 141
    .line 142
    return-object v8

    .line 143
    :cond_4
    invoke-interface/range {p0 .. p0}, Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;->getViewConfiguration()Landroidx/compose/ui/platform/ViewConfiguration;

    .line 144
    .line 145
    .line 146
    move-result-object v11

    .line 147
    invoke-static {v11, v2}, Landroidx/compose/foundation/gestures/DragGestureDetectorKt;->pointerSlop-E8SPZFQ(Landroidx/compose/ui/platform/ViewConfiguration;I)F

    .line 148
    .line 149
    .line 150
    move-result v2

    .line 151
    new-instance v11, Lkotlin/jvm/internal/Ref$LongRef;

    .line 152
    .line 153
    invoke-direct {v11}, Lkotlin/jvm/internal/Ref$LongRef;-><init>()V

    .line 154
    .line 155
    .line 156
    iput-wide v0, v11, Lkotlin/jvm/internal/Ref$LongRef;->c:J

    .line 157
    .line 158
    new-instance v0, Landroidx/compose/foundation/gestures/TouchSlopDetector;

    .line 159
    .line 160
    invoke-direct {v0, v5, v9, v10, v8}, Landroidx/compose/foundation/gestures/TouchSlopDetector;-><init>(Landroidx/compose/foundation/gestures/Orientation;JLkotlin/jvm/internal/n;)V

    .line 161
    .line 162
    .line 163
    move-object/from16 v1, p3

    .line 164
    .line 165
    move-object v5, v3

    .line 166
    move v3, v2

    .line 167
    move-object v2, v0

    .line 168
    move-object/from16 v0, p0

    .line 169
    .line 170
    :goto_1
    iput-object v1, v5, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$1;->L$0:Ljava/lang/Object;

    .line 171
    .line 172
    iput-object v0, v5, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$1;->L$1:Ljava/lang/Object;

    .line 173
    .line 174
    iput-object v11, v5, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$1;->L$2:Ljava/lang/Object;

    .line 175
    .line 176
    iput-object v2, v5, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$1;->L$3:Ljava/lang/Object;

    .line 177
    .line 178
    iput-object v8, v5, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$1;->L$4:Ljava/lang/Object;

    .line 179
    .line 180
    iput v3, v5, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$1;->F$0:F

    .line 181
    .line 182
    iput v7, v5, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$1;->label:I

    .line 183
    .line 184
    invoke-static {v0, v8, v5, v7, v8}, Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;->awaitPointerEvent$default(Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;Landroidx/compose/ui/input/pointer/PointerEventPass;Lvc/c;ILjava/lang/Object;)Ljava/lang/Object;

    .line 185
    .line 186
    .line 187
    move-result-object v9

    .line 188
    if-ne v9, v4, :cond_5

    .line 189
    .line 190
    goto/16 :goto_8

    .line 191
    .line 192
    :cond_5
    move/from16 v20, v3

    .line 193
    .line 194
    move-object v3, v2

    .line 195
    move-object v2, v9

    .line 196
    move-object v9, v5

    .line 197
    move/from16 v5, v20

    .line 198
    .line 199
    :goto_2
    check-cast v2, Landroidx/compose/ui/input/pointer/PointerEvent;

    .line 200
    .line 201
    invoke-virtual {v2}, Landroidx/compose/ui/input/pointer/PointerEvent;->getChanges()Ljava/util/List;

    .line 202
    .line 203
    .line 204
    move-result-object v10

    .line 205
    move-object v12, v10

    .line 206
    check-cast v12, Ljava/util/Collection;

    .line 207
    .line 208
    invoke-interface {v12}, Ljava/util/Collection;->size()I

    .line 209
    .line 210
    .line 211
    move-result v12

    .line 212
    const/4 v14, 0x0

    .line 213
    :goto_3
    if-ge v14, v12, :cond_7

    .line 214
    .line 215
    invoke-interface {v10, v14}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 216
    .line 217
    .line 218
    move-result-object v15

    .line 219
    move-object/from16 v16, v15

    .line 220
    .line 221
    check-cast v16, Landroidx/compose/ui/input/pointer/PointerInputChange;

    .line 222
    .line 223
    move-object/from16 v17, v8

    .line 224
    .line 225
    invoke-virtual/range {v16 .. v16}, Landroidx/compose/ui/input/pointer/PointerInputChange;->getId-J3iCeTQ()J

    .line 226
    .line 227
    .line 228
    move-result-wide v7

    .line 229
    move/from16 v16, v14

    .line 230
    .line 231
    iget-wide v13, v11, Lkotlin/jvm/internal/Ref$LongRef;->c:J

    .line 232
    .line 233
    invoke-static {v7, v8, v13, v14}, Landroidx/compose/ui/input/pointer/PointerId;->equals-impl0(JJ)Z

    .line 234
    .line 235
    .line 236
    move-result v7

    .line 237
    if-eqz v7, :cond_6

    .line 238
    .line 239
    goto :goto_4

    .line 240
    :cond_6
    add-int/lit8 v14, v16, 0x1

    .line 241
    .line 242
    move-object/from16 v8, v17

    .line 243
    .line 244
    const/4 v7, 0x1

    .line 245
    goto :goto_3

    .line 246
    :cond_7
    move-object/from16 v17, v8

    .line 247
    .line 248
    move-object/from16 v15, v17

    .line 249
    .line 250
    :goto_4
    move-object v7, v15

    .line 251
    check-cast v7, Landroidx/compose/ui/input/pointer/PointerInputChange;

    .line 252
    .line 253
    if-nez v7, :cond_8

    .line 254
    .line 255
    return-object v17

    .line 256
    :cond_8
    invoke-virtual {v7}, Landroidx/compose/ui/input/pointer/PointerInputChange;->isConsumed()Z

    .line 257
    .line 258
    .line 259
    move-result v8

    .line 260
    if-eqz v8, :cond_9

    .line 261
    .line 262
    return-object v17

    .line 263
    :cond_9
    invoke-static {v7}, Landroidx/compose/ui/input/pointer/PointerEventKt;->changedToUpIgnoreConsumed(Landroidx/compose/ui/input/pointer/PointerInputChange;)Z

    .line 264
    .line 265
    .line 266
    move-result v8

    .line 267
    if-eqz v8, :cond_d

    .line 268
    .line 269
    invoke-virtual {v2}, Landroidx/compose/ui/input/pointer/PointerEvent;->getChanges()Ljava/util/List;

    .line 270
    .line 271
    .line 272
    move-result-object v2

    .line 273
    move-object v7, v2

    .line 274
    check-cast v7, Ljava/util/Collection;

    .line 275
    .line 276
    invoke-interface {v7}, Ljava/util/Collection;->size()I

    .line 277
    .line 278
    .line 279
    move-result v7

    .line 280
    const/4 v13, 0x0

    .line 281
    :goto_5
    if-ge v13, v7, :cond_b

    .line 282
    .line 283
    invoke-interface {v2, v13}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 284
    .line 285
    .line 286
    move-result-object v8

    .line 287
    move-object v10, v8

    .line 288
    check-cast v10, Landroidx/compose/ui/input/pointer/PointerInputChange;

    .line 289
    .line 290
    invoke-virtual {v10}, Landroidx/compose/ui/input/pointer/PointerInputChange;->getPressed()Z

    .line 291
    .line 292
    .line 293
    move-result v10

    .line 294
    if-eqz v10, :cond_a

    .line 295
    .line 296
    goto :goto_6

    .line 297
    :cond_a
    add-int/lit8 v13, v13, 0x1

    .line 298
    .line 299
    goto :goto_5

    .line 300
    :cond_b
    move-object/from16 v8, v17

    .line 301
    .line 302
    :goto_6
    check-cast v8, Landroidx/compose/ui/input/pointer/PointerInputChange;

    .line 303
    .line 304
    if-nez v8, :cond_c

    .line 305
    .line 306
    return-object v17

    .line 307
    :cond_c
    invoke-virtual {v8}, Landroidx/compose/ui/input/pointer/PointerInputChange;->getId-J3iCeTQ()J

    .line 308
    .line 309
    .line 310
    move-result-wide v7

    .line 311
    iput-wide v7, v11, Lkotlin/jvm/internal/Ref$LongRef;->c:J

    .line 312
    .line 313
    goto :goto_7

    .line 314
    :cond_d
    invoke-virtual {v3, v7, v5}, Landroidx/compose/foundation/gestures/TouchSlopDetector;->addPointerInputChange-dBAh8RU(Landroidx/compose/ui/input/pointer/PointerInputChange;F)J

    .line 315
    .line 316
    .line 317
    move-result-wide v12

    .line 318
    const-wide v14, 0x7fffffff7fffffffL

    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    and-long/2addr v14, v12

    .line 324
    const-wide v18, 0x7fc000007fc00000L    # 2.247117487993712E307

    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    cmp-long v2, v14, v18

    .line 330
    .line 331
    if-eqz v2, :cond_f

    .line 332
    .line 333
    const/16 v2, 0x20

    .line 334
    .line 335
    shr-long/2addr v12, v2

    .line 336
    long-to-int v2, v12

    .line 337
    invoke-static {v2}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 338
    .line 339
    .line 340
    move-result v2

    .line 341
    invoke-static {v2}, Lxc/a;->b(F)Ljava/lang/Float;

    .line 342
    .line 343
    .line 344
    move-result-object v2

    .line 345
    invoke-interface {v1, v7, v2}, Lhd/p;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 346
    .line 347
    .line 348
    invoke-virtual {v7}, Landroidx/compose/ui/input/pointer/PointerInputChange;->isConsumed()Z

    .line 349
    .line 350
    .line 351
    move-result v2

    .line 352
    if-eqz v2, :cond_e

    .line 353
    .line 354
    return-object v7

    .line 355
    :cond_e
    invoke-virtual {v3}, Landroidx/compose/foundation/gestures/TouchSlopDetector;->reset()V

    .line 356
    .line 357
    .line 358
    :goto_7
    move-object v2, v3

    .line 359
    move v3, v5

    .line 360
    move-object v5, v9

    .line 361
    move-object/from16 v8, v17

    .line 362
    .line 363
    const/4 v7, 0x1

    .line 364
    goto/16 :goto_1

    .line 365
    .line 366
    :cond_f
    sget-object v2, Landroidx/compose/ui/input/pointer/PointerEventPass;->Final:Landroidx/compose/ui/input/pointer/PointerEventPass;

    .line 367
    .line 368
    iput-object v1, v9, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$1;->L$0:Ljava/lang/Object;

    .line 369
    .line 370
    iput-object v0, v9, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$1;->L$1:Ljava/lang/Object;

    .line 371
    .line 372
    iput-object v11, v9, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$1;->L$2:Ljava/lang/Object;

    .line 373
    .line 374
    iput-object v3, v9, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$1;->L$3:Ljava/lang/Object;

    .line 375
    .line 376
    iput-object v7, v9, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$1;->L$4:Ljava/lang/Object;

    .line 377
    .line 378
    iput v5, v9, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$1;->F$0:F

    .line 379
    .line 380
    iput v6, v9, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$1;->label:I

    .line 381
    .line 382
    invoke-interface {v0, v2, v9}, Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;->awaitPointerEvent(Landroidx/compose/ui/input/pointer/PointerEventPass;Lvc/c;)Ljava/lang/Object;

    .line 383
    .line 384
    .line 385
    move-result-object v2

    .line 386
    if-ne v2, v4, :cond_10

    .line 387
    .line 388
    :goto_8
    return-object v4

    .line 389
    :cond_10
    move-object v2, v3

    .line 390
    move v3, v5

    .line 391
    move-object v5, v9

    .line 392
    move-object v9, v11

    .line 393
    move-object v11, v1

    .line 394
    move-object v1, v7

    .line 395
    :goto_9
    invoke-virtual {v1}, Landroidx/compose/ui/input/pointer/PointerInputChange;->isConsumed()Z

    .line 396
    .line 397
    .line 398
    move-result v1

    .line 399
    if-eqz v1, :cond_11

    .line 400
    .line 401
    return-object v17

    .line 402
    :cond_11
    move-object v1, v11

    .line 403
    move-object/from16 v8, v17

    .line 404
    .line 405
    const/4 v7, 0x1

    .line 406
    move-object v11, v9

    .line 407
    goto/16 :goto_1
.end method

.method public static final awaitLongPressOrCancellation-rnUCldI(Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;JLvc/c;)Ljava/lang/Object;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;",
            "J",
            "Lvc/c<",
            "-",
            "Landroidx/compose/ui/input/pointer/PointerInputChange;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    instance-of v0, p3, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$awaitLongPressOrCancellation$1;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p3

    .line 6
    check-cast v0, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$awaitLongPressOrCancellation$1;

    .line 7
    .line 8
    iget v1, v0, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$awaitLongPressOrCancellation$1;->label:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$awaitLongPressOrCancellation$1;->label:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$awaitLongPressOrCancellation$1;

    .line 21
    .line 22
    invoke-direct {v0, p3}, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$awaitLongPressOrCancellation$1;-><init>(Lvc/c;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p3, v0, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$awaitLongPressOrCancellation$1;->result:Ljava/lang/Object;

    .line 26
    .line 27
    invoke-static {}, Lwc/a;->f()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    iget v2, v0, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$awaitLongPressOrCancellation$1;->label:I

    .line 32
    .line 33
    const/4 v3, 0x1

    .line 34
    const/4 v4, 0x0

    .line 35
    if-eqz v2, :cond_2

    .line 36
    .line 37
    if-ne v2, v3, :cond_1

    .line 38
    .line 39
    iget-object p0, v0, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$awaitLongPressOrCancellation$1;->L$2:Ljava/lang/Object;

    .line 40
    .line 41
    check-cast p0, Lkotlin/jvm/internal/Ref$BooleanRef;

    .line 42
    .line 43
    iget-object p1, v0, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$awaitLongPressOrCancellation$1;->L$1:Ljava/lang/Object;

    .line 44
    .line 45
    check-cast p1, Lkotlin/jvm/internal/Ref$ObjectRef;

    .line 46
    .line 47
    iget-object p2, v0, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$awaitLongPressOrCancellation$1;->L$0:Ljava/lang/Object;

    .line 48
    .line 49
    check-cast p2, Landroidx/compose/ui/input/pointer/PointerInputChange;

    .line 50
    .line 51
    :try_start_0
    invoke-static {p3}, Lkotlin/b;->b(Ljava/lang/Object;)V
    :try_end_0
    .catch Landroidx/compose/ui/input/pointer/PointerEventTimeoutCancellationException; {:try_start_0 .. :try_end_0} :catch_0

    .line 52
    .line 53
    .line 54
    goto/16 :goto_3

    .line 55
    .line 56
    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 57
    .line 58
    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    .line 59
    .line 60
    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 61
    .line 62
    .line 63
    throw p0

    .line 64
    :cond_2
    invoke-static {p3}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 65
    .line 66
    .line 67
    invoke-interface {p0}, Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;->getCurrentEvent()Landroidx/compose/ui/input/pointer/PointerEvent;

    .line 68
    .line 69
    .line 70
    move-result-object p3

    .line 71
    invoke-static {p3, p1, p2}, Landroidx/compose/foundation/gestures/DragGestureDetectorKt;->isPointerUp-DmW0f2w(Landroidx/compose/ui/input/pointer/PointerEvent;J)Z

    .line 72
    .line 73
    .line 74
    move-result p3

    .line 75
    if-eqz p3, :cond_3

    .line 76
    .line 77
    return-object v4

    .line 78
    :cond_3
    invoke-interface {p0}, Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;->getCurrentEvent()Landroidx/compose/ui/input/pointer/PointerEvent;

    .line 79
    .line 80
    .line 81
    move-result-object p3

    .line 82
    invoke-virtual {p3}, Landroidx/compose/ui/input/pointer/PointerEvent;->getChanges()Ljava/util/List;

    .line 83
    .line 84
    .line 85
    move-result-object p3

    .line 86
    move-object v2, p3

    .line 87
    check-cast v2, Ljava/util/Collection;

    .line 88
    .line 89
    invoke-interface {v2}, Ljava/util/Collection;->size()I

    .line 90
    .line 91
    .line 92
    move-result v2

    .line 93
    const/4 v5, 0x0

    .line 94
    :goto_1
    if-ge v5, v2, :cond_5

    .line 95
    .line 96
    invoke-interface {p3, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 97
    .line 98
    .line 99
    move-result-object v6

    .line 100
    move-object v7, v6

    .line 101
    check-cast v7, Landroidx/compose/ui/input/pointer/PointerInputChange;

    .line 102
    .line 103
    invoke-virtual {v7}, Landroidx/compose/ui/input/pointer/PointerInputChange;->getId-J3iCeTQ()J

    .line 104
    .line 105
    .line 106
    move-result-wide v7

    .line 107
    invoke-static {v7, v8, p1, p2}, Landroidx/compose/ui/input/pointer/PointerId;->equals-impl0(JJ)Z

    .line 108
    .line 109
    .line 110
    move-result v7

    .line 111
    if-eqz v7, :cond_4

    .line 112
    .line 113
    goto :goto_2

    .line 114
    :cond_4
    add-int/lit8 v5, v5, 0x1

    .line 115
    .line 116
    goto :goto_1

    .line 117
    :cond_5
    move-object v6, v4

    .line 118
    :goto_2
    move-object p2, v6

    .line 119
    check-cast p2, Landroidx/compose/ui/input/pointer/PointerInputChange;

    .line 120
    .line 121
    if-nez p2, :cond_6

    .line 122
    .line 123
    return-object v4

    .line 124
    :cond_6
    new-instance p1, Lkotlin/jvm/internal/Ref$ObjectRef;

    .line 125
    .line 126
    invoke-direct {p1}, Lkotlin/jvm/internal/Ref$ObjectRef;-><init>()V

    .line 127
    .line 128
    .line 129
    new-instance p3, Lkotlin/jvm/internal/Ref$ObjectRef;

    .line 130
    .line 131
    invoke-direct {p3}, Lkotlin/jvm/internal/Ref$ObjectRef;-><init>()V

    .line 132
    .line 133
    .line 134
    iput-object p2, p3, Lkotlin/jvm/internal/Ref$ObjectRef;->c:Ljava/lang/Object;

    .line 135
    .line 136
    invoke-interface {p0}, Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;->getViewConfiguration()Landroidx/compose/ui/platform/ViewConfiguration;

    .line 137
    .line 138
    .line 139
    move-result-object v2

    .line 140
    invoke-interface {v2}, Landroidx/compose/ui/platform/ViewConfiguration;->getLongPressTimeoutMillis()J

    .line 141
    .line 142
    .line 143
    move-result-wide v5

    .line 144
    :try_start_1
    new-instance v2, Lkotlin/jvm/internal/Ref$BooleanRef;

    .line 145
    .line 146
    invoke-direct {v2}, Lkotlin/jvm/internal/Ref$BooleanRef;-><init>()V

    .line 147
    .line 148
    .line 149
    new-instance v7, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$awaitLongPressOrCancellation$2;

    .line 150
    .line 151
    invoke-direct {v7, v2, p3, p1, v4}, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$awaitLongPressOrCancellation$2;-><init>(Lkotlin/jvm/internal/Ref$BooleanRef;Lkotlin/jvm/internal/Ref$ObjectRef;Lkotlin/jvm/internal/Ref$ObjectRef;Lvc/c;)V

    .line 152
    .line 153
    .line 154
    iput-object p2, v0, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$awaitLongPressOrCancellation$1;->L$0:Ljava/lang/Object;

    .line 155
    .line 156
    iput-object p1, v0, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$awaitLongPressOrCancellation$1;->L$1:Ljava/lang/Object;

    .line 157
    .line 158
    iput-object v2, v0, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$awaitLongPressOrCancellation$1;->L$2:Ljava/lang/Object;

    .line 159
    .line 160
    iput v3, v0, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$awaitLongPressOrCancellation$1;->label:I

    .line 161
    .line 162
    invoke-interface {p0, v5, v6, v7, v0}, Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;->withTimeout(JLhd/p;Lvc/c;)Ljava/lang/Object;

    .line 163
    .line 164
    .line 165
    move-result-object p0

    .line 166
    if-ne p0, v1, :cond_7

    .line 167
    .line 168
    return-object v1

    .line 169
    :cond_7
    move-object p0, v2

    .line 170
    :goto_3
    iget-boolean p0, p0, Lkotlin/jvm/internal/Ref$BooleanRef;->c:Z

    .line 171
    .line 172
    if-eqz p0, :cond_9

    .line 173
    .line 174
    iget-object p0, p1, Lkotlin/jvm/internal/Ref$ObjectRef;->c:Ljava/lang/Object;

    .line 175
    .line 176
    check-cast p0, Landroidx/compose/ui/input/pointer/PointerInputChange;
    :try_end_1
    .catch Landroidx/compose/ui/input/pointer/PointerEventTimeoutCancellationException; {:try_start_1 .. :try_end_1} :catch_0

    .line 177
    .line 178
    if-nez p0, :cond_8

    .line 179
    .line 180
    return-object p2

    .line 181
    :cond_8
    return-object p0

    .line 182
    :cond_9
    return-object v4

    .line 183
    :catch_0
    iget-object p0, p1, Lkotlin/jvm/internal/Ref$ObjectRef;->c:Ljava/lang/Object;

    .line 184
    .line 185
    check-cast p0, Landroidx/compose/ui/input/pointer/PointerInputChange;

    .line 186
    .line 187
    if-nez p0, :cond_a

    .line 188
    .line 189
    goto :goto_4

    .line 190
    :cond_a
    move-object p2, p0

    .line 191
    :goto_4
    return-object p2
.end method

.method public static final awaitPointerSlopOrCancellation-6ksA65w(Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;JILandroidx/compose/foundation/gestures/Orientation;JLhd/p;Lvc/c;)Ljava/lang/Object;
    .locals 19
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;",
            "JI",
            "Landroidx/compose/foundation/gestures/Orientation;",
            "J",
            "Lhd/p;",
            "Lvc/c<",
            "-",
            "Landroidx/compose/ui/input/pointer/PointerInputChange;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    move-wide/from16 v0, p1

    .line 2
    .line 3
    move-object/from16 v2, p8

    .line 4
    .line 5
    instance-of v3, v2, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$awaitPointerSlopOrCancellation$1;

    .line 6
    .line 7
    if-eqz v3, :cond_0

    .line 8
    .line 9
    move-object v3, v2

    .line 10
    check-cast v3, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$awaitPointerSlopOrCancellation$1;

    .line 11
    .line 12
    iget v4, v3, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$awaitPointerSlopOrCancellation$1;->label:I

    .line 13
    .line 14
    const/high16 v5, -0x80000000

    .line 15
    .line 16
    and-int v6, v4, v5

    .line 17
    .line 18
    if-eqz v6, :cond_0

    .line 19
    .line 20
    sub-int/2addr v4, v5

    .line 21
    iput v4, v3, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$awaitPointerSlopOrCancellation$1;->label:I

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    new-instance v3, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$awaitPointerSlopOrCancellation$1;

    .line 25
    .line 26
    invoke-direct {v3, v2}, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$awaitPointerSlopOrCancellation$1;-><init>(Lvc/c;)V

    .line 27
    .line 28
    .line 29
    :goto_0
    iget-object v2, v3, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$awaitPointerSlopOrCancellation$1;->result:Ljava/lang/Object;

    .line 30
    .line 31
    invoke-static {}, Lwc/a;->f()Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v4

    .line 35
    iget v5, v3, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$awaitPointerSlopOrCancellation$1;->label:I

    .line 36
    .line 37
    const/4 v6, 0x2

    .line 38
    const/4 v7, 0x1

    .line 39
    const/4 v8, 0x0

    .line 40
    if-eqz v5, :cond_3

    .line 41
    .line 42
    if-eq v5, v7, :cond_2

    .line 43
    .line 44
    if-ne v5, v6, :cond_1

    .line 45
    .line 46
    iget v0, v3, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$awaitPointerSlopOrCancellation$1;->F$0:F

    .line 47
    .line 48
    iget-object v1, v3, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$awaitPointerSlopOrCancellation$1;->L$4:Ljava/lang/Object;

    .line 49
    .line 50
    check-cast v1, Landroidx/compose/ui/input/pointer/PointerInputChange;

    .line 51
    .line 52
    iget-object v5, v3, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$awaitPointerSlopOrCancellation$1;->L$3:Ljava/lang/Object;

    .line 53
    .line 54
    check-cast v5, Landroidx/compose/foundation/gestures/TouchSlopDetector;

    .line 55
    .line 56
    iget-object v9, v3, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$awaitPointerSlopOrCancellation$1;->L$2:Ljava/lang/Object;

    .line 57
    .line 58
    check-cast v9, Lkotlin/jvm/internal/Ref$LongRef;

    .line 59
    .line 60
    iget-object v10, v3, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$awaitPointerSlopOrCancellation$1;->L$1:Ljava/lang/Object;

    .line 61
    .line 62
    check-cast v10, Lhd/p;

    .line 63
    .line 64
    iget-object v11, v3, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$awaitPointerSlopOrCancellation$1;->L$0:Ljava/lang/Object;

    .line 65
    .line 66
    check-cast v11, Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;

    .line 67
    .line 68
    invoke-static {v2}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 69
    .line 70
    .line 71
    move-object v2, v5

    .line 72
    move-object/from16 v17, v8

    .line 73
    .line 74
    move-object v5, v3

    .line 75
    move v3, v0

    .line 76
    move-object v0, v11

    .line 77
    goto/16 :goto_a

    .line 78
    .line 79
    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 80
    .line 81
    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    .line 82
    .line 83
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 84
    .line 85
    .line 86
    throw v0

    .line 87
    :cond_2
    iget v0, v3, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$awaitPointerSlopOrCancellation$1;->F$0:F

    .line 88
    .line 89
    iget-object v1, v3, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$awaitPointerSlopOrCancellation$1;->L$3:Ljava/lang/Object;

    .line 90
    .line 91
    check-cast v1, Landroidx/compose/foundation/gestures/TouchSlopDetector;

    .line 92
    .line 93
    iget-object v5, v3, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$awaitPointerSlopOrCancellation$1;->L$2:Ljava/lang/Object;

    .line 94
    .line 95
    check-cast v5, Lkotlin/jvm/internal/Ref$LongRef;

    .line 96
    .line 97
    iget-object v9, v3, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$awaitPointerSlopOrCancellation$1;->L$1:Ljava/lang/Object;

    .line 98
    .line 99
    check-cast v9, Lhd/p;

    .line 100
    .line 101
    iget-object v10, v3, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$awaitPointerSlopOrCancellation$1;->L$0:Ljava/lang/Object;

    .line 102
    .line 103
    check-cast v10, Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;

    .line 104
    .line 105
    invoke-static {v2}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 106
    .line 107
    .line 108
    move-object/from16 v18, v5

    .line 109
    .line 110
    move v5, v0

    .line 111
    move-object v0, v10

    .line 112
    move-object/from16 v10, v18

    .line 113
    .line 114
    move-object/from16 v18, v3

    .line 115
    .line 116
    move-object v3, v1

    .line 117
    move-object v1, v9

    .line 118
    move-object/from16 v9, v18

    .line 119
    .line 120
    goto :goto_2

    .line 121
    :cond_3
    invoke-static {v2}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 122
    .line 123
    .line 124
    invoke-interface/range {p0 .. p0}, Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;->getCurrentEvent()Landroidx/compose/ui/input/pointer/PointerEvent;

    .line 125
    .line 126
    .line 127
    move-result-object v2

    .line 128
    invoke-static {v2, v0, v1}, Landroidx/compose/foundation/gestures/DragGestureDetectorKt;->access$isPointerUp-DmW0f2w(Landroidx/compose/ui/input/pointer/PointerEvent;J)Z

    .line 129
    .line 130
    .line 131
    move-result v2

    .line 132
    if-eqz v2, :cond_4

    .line 133
    .line 134
    return-object v8

    .line 135
    :cond_4
    invoke-interface/range {p0 .. p0}, Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;->getViewConfiguration()Landroidx/compose/ui/platform/ViewConfiguration;

    .line 136
    .line 137
    .line 138
    move-result-object v2

    .line 139
    move/from16 v5, p3

    .line 140
    .line 141
    invoke-static {v2, v5}, Landroidx/compose/foundation/gestures/DragGestureDetectorKt;->pointerSlop-E8SPZFQ(Landroidx/compose/ui/platform/ViewConfiguration;I)F

    .line 142
    .line 143
    .line 144
    move-result v2

    .line 145
    new-instance v5, Lkotlin/jvm/internal/Ref$LongRef;

    .line 146
    .line 147
    invoke-direct {v5}, Lkotlin/jvm/internal/Ref$LongRef;-><init>()V

    .line 148
    .line 149
    .line 150
    iput-wide v0, v5, Lkotlin/jvm/internal/Ref$LongRef;->c:J

    .line 151
    .line 152
    new-instance v0, Landroidx/compose/foundation/gestures/TouchSlopDetector;

    .line 153
    .line 154
    move-object/from16 v1, p4

    .line 155
    .line 156
    move-wide/from16 v9, p5

    .line 157
    .line 158
    invoke-direct {v0, v1, v9, v10, v8}, Landroidx/compose/foundation/gestures/TouchSlopDetector;-><init>(Landroidx/compose/foundation/gestures/Orientation;JLkotlin/jvm/internal/n;)V

    .line 159
    .line 160
    .line 161
    move-object/from16 v1, p7

    .line 162
    .line 163
    move-object v9, v5

    .line 164
    move-object v5, v3

    .line 165
    move v3, v2

    .line 166
    move-object v2, v0

    .line 167
    move-object/from16 v0, p0

    .line 168
    .line 169
    :goto_1
    iput-object v0, v5, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$awaitPointerSlopOrCancellation$1;->L$0:Ljava/lang/Object;

    .line 170
    .line 171
    iput-object v1, v5, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$awaitPointerSlopOrCancellation$1;->L$1:Ljava/lang/Object;

    .line 172
    .line 173
    iput-object v9, v5, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$awaitPointerSlopOrCancellation$1;->L$2:Ljava/lang/Object;

    .line 174
    .line 175
    iput-object v2, v5, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$awaitPointerSlopOrCancellation$1;->L$3:Ljava/lang/Object;

    .line 176
    .line 177
    iput-object v8, v5, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$awaitPointerSlopOrCancellation$1;->L$4:Ljava/lang/Object;

    .line 178
    .line 179
    iput v3, v5, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$awaitPointerSlopOrCancellation$1;->F$0:F

    .line 180
    .line 181
    iput v7, v5, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$awaitPointerSlopOrCancellation$1;->label:I

    .line 182
    .line 183
    invoke-static {v0, v8, v5, v7, v8}, Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;->awaitPointerEvent$default(Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;Landroidx/compose/ui/input/pointer/PointerEventPass;Lvc/c;ILjava/lang/Object;)Ljava/lang/Object;

    .line 184
    .line 185
    .line 186
    move-result-object v10

    .line 187
    if-ne v10, v4, :cond_5

    .line 188
    .line 189
    goto/16 :goto_9

    .line 190
    .line 191
    :cond_5
    move/from16 v18, v3

    .line 192
    .line 193
    move-object v3, v2

    .line 194
    move-object v2, v10

    .line 195
    move-object v10, v9

    .line 196
    move-object v9, v5

    .line 197
    move/from16 v5, v18

    .line 198
    .line 199
    :goto_2
    check-cast v2, Landroidx/compose/ui/input/pointer/PointerEvent;

    .line 200
    .line 201
    invoke-virtual {v2}, Landroidx/compose/ui/input/pointer/PointerEvent;->getChanges()Ljava/util/List;

    .line 202
    .line 203
    .line 204
    move-result-object v11

    .line 205
    move-object v12, v11

    .line 206
    check-cast v12, Ljava/util/Collection;

    .line 207
    .line 208
    invoke-interface {v12}, Ljava/util/Collection;->size()I

    .line 209
    .line 210
    .line 211
    move-result v12

    .line 212
    const/4 v14, 0x0

    .line 213
    :goto_3
    if-ge v14, v12, :cond_7

    .line 214
    .line 215
    invoke-interface {v11, v14}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 216
    .line 217
    .line 218
    move-result-object v15

    .line 219
    move-object/from16 v16, v15

    .line 220
    .line 221
    check-cast v16, Landroidx/compose/ui/input/pointer/PointerInputChange;

    .line 222
    .line 223
    move-object/from16 v17, v8

    .line 224
    .line 225
    invoke-virtual/range {v16 .. v16}, Landroidx/compose/ui/input/pointer/PointerInputChange;->getId-J3iCeTQ()J

    .line 226
    .line 227
    .line 228
    move-result-wide v7

    .line 229
    move/from16 v16, v14

    .line 230
    .line 231
    iget-wide v13, v10, Lkotlin/jvm/internal/Ref$LongRef;->c:J

    .line 232
    .line 233
    invoke-static {v7, v8, v13, v14}, Landroidx/compose/ui/input/pointer/PointerId;->equals-impl0(JJ)Z

    .line 234
    .line 235
    .line 236
    move-result v7

    .line 237
    if-eqz v7, :cond_6

    .line 238
    .line 239
    goto :goto_4

    .line 240
    :cond_6
    add-int/lit8 v14, v16, 0x1

    .line 241
    .line 242
    move-object/from16 v8, v17

    .line 243
    .line 244
    const/4 v7, 0x1

    .line 245
    goto :goto_3

    .line 246
    :cond_7
    move-object/from16 v17, v8

    .line 247
    .line 248
    move-object/from16 v15, v17

    .line 249
    .line 250
    :goto_4
    move-object v7, v15

    .line 251
    check-cast v7, Landroidx/compose/ui/input/pointer/PointerInputChange;

    .line 252
    .line 253
    if-nez v7, :cond_8

    .line 254
    .line 255
    return-object v17

    .line 256
    :cond_8
    invoke-virtual {v7}, Landroidx/compose/ui/input/pointer/PointerInputChange;->isConsumed()Z

    .line 257
    .line 258
    .line 259
    move-result v8

    .line 260
    if-eqz v8, :cond_9

    .line 261
    .line 262
    return-object v17

    .line 263
    :cond_9
    invoke-static {v7}, Landroidx/compose/ui/input/pointer/PointerEventKt;->changedToUpIgnoreConsumed(Landroidx/compose/ui/input/pointer/PointerInputChange;)Z

    .line 264
    .line 265
    .line 266
    move-result v8

    .line 267
    if-eqz v8, :cond_d

    .line 268
    .line 269
    invoke-virtual {v2}, Landroidx/compose/ui/input/pointer/PointerEvent;->getChanges()Ljava/util/List;

    .line 270
    .line 271
    .line 272
    move-result-object v2

    .line 273
    move-object v7, v2

    .line 274
    check-cast v7, Ljava/util/Collection;

    .line 275
    .line 276
    invoke-interface {v7}, Ljava/util/Collection;->size()I

    .line 277
    .line 278
    .line 279
    move-result v7

    .line 280
    const/4 v13, 0x0

    .line 281
    :goto_5
    if-ge v13, v7, :cond_b

    .line 282
    .line 283
    invoke-interface {v2, v13}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 284
    .line 285
    .line 286
    move-result-object v8

    .line 287
    move-object v11, v8

    .line 288
    check-cast v11, Landroidx/compose/ui/input/pointer/PointerInputChange;

    .line 289
    .line 290
    invoke-virtual {v11}, Landroidx/compose/ui/input/pointer/PointerInputChange;->getPressed()Z

    .line 291
    .line 292
    .line 293
    move-result v11

    .line 294
    if-eqz v11, :cond_a

    .line 295
    .line 296
    goto :goto_6

    .line 297
    :cond_a
    add-int/lit8 v13, v13, 0x1

    .line 298
    .line 299
    goto :goto_5

    .line 300
    :cond_b
    move-object/from16 v8, v17

    .line 301
    .line 302
    :goto_6
    check-cast v8, Landroidx/compose/ui/input/pointer/PointerInputChange;

    .line 303
    .line 304
    if-nez v8, :cond_c

    .line 305
    .line 306
    return-object v17

    .line 307
    :cond_c
    invoke-virtual {v8}, Landroidx/compose/ui/input/pointer/PointerInputChange;->getId-J3iCeTQ()J

    .line 308
    .line 309
    .line 310
    move-result-wide v7

    .line 311
    iput-wide v7, v10, Lkotlin/jvm/internal/Ref$LongRef;->c:J

    .line 312
    .line 313
    goto :goto_7

    .line 314
    :cond_d
    invoke-virtual {v3, v7, v5}, Landroidx/compose/foundation/gestures/TouchSlopDetector;->addPointerInputChange-dBAh8RU(Landroidx/compose/ui/input/pointer/PointerInputChange;F)J

    .line 315
    .line 316
    .line 317
    move-result-wide v11

    .line 318
    const-wide v13, 0x7fffffff7fffffffL

    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    and-long/2addr v13, v11

    .line 324
    const-wide v15, 0x7fc000007fc00000L    # 2.247117487993712E307

    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    cmp-long v2, v13, v15

    .line 330
    .line 331
    if-eqz v2, :cond_f

    .line 332
    .line 333
    invoke-static {v11, v12}, Landroidx/compose/ui/geometry/Offset;->box-impl(J)Landroidx/compose/ui/geometry/Offset;

    .line 334
    .line 335
    .line 336
    move-result-object v2

    .line 337
    invoke-interface {v1, v7, v2}, Lhd/p;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 338
    .line 339
    .line 340
    invoke-virtual {v7}, Landroidx/compose/ui/input/pointer/PointerInputChange;->isConsumed()Z

    .line 341
    .line 342
    .line 343
    move-result v2

    .line 344
    if-eqz v2, :cond_e

    .line 345
    .line 346
    return-object v7

    .line 347
    :cond_e
    invoke-virtual {v3}, Landroidx/compose/foundation/gestures/TouchSlopDetector;->reset()V

    .line 348
    .line 349
    .line 350
    :goto_7
    move-object v2, v3

    .line 351
    move v3, v5

    .line 352
    move-object v5, v9

    .line 353
    move-object v9, v10

    .line 354
    :goto_8
    move-object/from16 v8, v17

    .line 355
    .line 356
    const/4 v7, 0x1

    .line 357
    goto/16 :goto_1

    .line 358
    .line 359
    :cond_f
    sget-object v2, Landroidx/compose/ui/input/pointer/PointerEventPass;->Final:Landroidx/compose/ui/input/pointer/PointerEventPass;

    .line 360
    .line 361
    iput-object v0, v9, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$awaitPointerSlopOrCancellation$1;->L$0:Ljava/lang/Object;

    .line 362
    .line 363
    iput-object v1, v9, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$awaitPointerSlopOrCancellation$1;->L$1:Ljava/lang/Object;

    .line 364
    .line 365
    iput-object v10, v9, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$awaitPointerSlopOrCancellation$1;->L$2:Ljava/lang/Object;

    .line 366
    .line 367
    iput-object v3, v9, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$awaitPointerSlopOrCancellation$1;->L$3:Ljava/lang/Object;

    .line 368
    .line 369
    iput-object v7, v9, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$awaitPointerSlopOrCancellation$1;->L$4:Ljava/lang/Object;

    .line 370
    .line 371
    iput v5, v9, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$awaitPointerSlopOrCancellation$1;->F$0:F

    .line 372
    .line 373
    iput v6, v9, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$awaitPointerSlopOrCancellation$1;->label:I

    .line 374
    .line 375
    invoke-interface {v0, v2, v9}, Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;->awaitPointerEvent(Landroidx/compose/ui/input/pointer/PointerEventPass;Lvc/c;)Ljava/lang/Object;

    .line 376
    .line 377
    .line 378
    move-result-object v2

    .line 379
    if-ne v2, v4, :cond_10

    .line 380
    .line 381
    :goto_9
    return-object v4

    .line 382
    :cond_10
    move-object v2, v3

    .line 383
    move v3, v5

    .line 384
    move-object v5, v9

    .line 385
    move-object v9, v10

    .line 386
    move-object v10, v1

    .line 387
    move-object v1, v7

    .line 388
    :goto_a
    invoke-virtual {v1}, Landroidx/compose/ui/input/pointer/PointerInputChange;->isConsumed()Z

    .line 389
    .line 390
    .line 391
    move-result v1

    .line 392
    if-eqz v1, :cond_11

    .line 393
    .line 394
    return-object v17

    .line 395
    :cond_11
    move-object v1, v10

    .line 396
    goto :goto_8
.end method

.method private static final awaitPointerSlopOrCancellation-6ksA65w$$forInline(Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;JILandroidx/compose/foundation/gestures/Orientation;JLhd/p;Lvc/c;)Ljava/lang/Object;
    .locals 14
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;",
            "JI",
            "Landroidx/compose/foundation/gestures/Orientation;",
            "J",
            "Lhd/p;",
            "Lvc/c<",
            "-",
            "Landroidx/compose/ui/input/pointer/PointerInputChange;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    move-wide v0, p1

    .line 2
    move-object/from16 v2, p8

    .line 3
    .line 4
    invoke-interface {p0}, Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;->getCurrentEvent()Landroidx/compose/ui/input/pointer/PointerEvent;

    .line 5
    .line 6
    .line 7
    move-result-object v3

    .line 8
    invoke-static {v3, v0, v1}, Landroidx/compose/foundation/gestures/DragGestureDetectorKt;->access$isPointerUp-DmW0f2w(Landroidx/compose/ui/input/pointer/PointerEvent;J)Z

    .line 9
    .line 10
    .line 11
    move-result v3

    .line 12
    const/4 v4, 0x0

    .line 13
    if-eqz v3, :cond_0

    .line 14
    .line 15
    return-object v4

    .line 16
    :cond_0
    invoke-interface {p0}, Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;->getViewConfiguration()Landroidx/compose/ui/platform/ViewConfiguration;

    .line 17
    .line 18
    .line 19
    move-result-object v3

    .line 20
    move/from16 v5, p3

    .line 21
    .line 22
    invoke-static {v3, v5}, Landroidx/compose/foundation/gestures/DragGestureDetectorKt;->pointerSlop-E8SPZFQ(Landroidx/compose/ui/platform/ViewConfiguration;I)F

    .line 23
    .line 24
    .line 25
    move-result v3

    .line 26
    new-instance v5, Lkotlin/jvm/internal/Ref$LongRef;

    .line 27
    .line 28
    invoke-direct {v5}, Lkotlin/jvm/internal/Ref$LongRef;-><init>()V

    .line 29
    .line 30
    .line 31
    iput-wide v0, v5, Lkotlin/jvm/internal/Ref$LongRef;->c:J

    .line 32
    .line 33
    new-instance v0, Landroidx/compose/foundation/gestures/TouchSlopDetector;

    .line 34
    .line 35
    move-object/from16 v1, p4

    .line 36
    .line 37
    move-wide/from16 v6, p5

    .line 38
    .line 39
    invoke-direct {v0, v1, v6, v7, v4}, Landroidx/compose/foundation/gestures/TouchSlopDetector;-><init>(Landroidx/compose/foundation/gestures/Orientation;JLkotlin/jvm/internal/n;)V

    .line 40
    .line 41
    .line 42
    :cond_1
    :goto_0
    const/4 v1, 0x0

    .line 43
    invoke-static {v1}, Lkotlin/jvm/internal/s;->c(I)V

    .line 44
    .line 45
    .line 46
    const/4 v6, 0x1

    .line 47
    invoke-static {p0, v4, v2, v6, v4}, Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;->awaitPointerEvent$default(Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;Landroidx/compose/ui/input/pointer/PointerEventPass;Lvc/c;ILjava/lang/Object;)Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    move-result-object v7

    .line 51
    invoke-static {v6}, Lkotlin/jvm/internal/s;->c(I)V

    .line 52
    .line 53
    .line 54
    check-cast v7, Landroidx/compose/ui/input/pointer/PointerEvent;

    .line 55
    .line 56
    invoke-virtual {v7}, Landroidx/compose/ui/input/pointer/PointerEvent;->getChanges()Ljava/util/List;

    .line 57
    .line 58
    .line 59
    move-result-object v8

    .line 60
    move-object v9, v8

    .line 61
    check-cast v9, Ljava/util/Collection;

    .line 62
    .line 63
    invoke-interface {v9}, Ljava/util/Collection;->size()I

    .line 64
    .line 65
    .line 66
    move-result v9

    .line 67
    move v10, v1

    .line 68
    :goto_1
    if-ge v10, v9, :cond_3

    .line 69
    .line 70
    invoke-interface {v8, v10}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 71
    .line 72
    .line 73
    move-result-object v11

    .line 74
    move-object v12, v11

    .line 75
    check-cast v12, Landroidx/compose/ui/input/pointer/PointerInputChange;

    .line 76
    .line 77
    invoke-virtual {v12}, Landroidx/compose/ui/input/pointer/PointerInputChange;->getId-J3iCeTQ()J

    .line 78
    .line 79
    .line 80
    move-result-wide v12

    .line 81
    move p1, v6

    .line 82
    move-object/from16 p2, v7

    .line 83
    .line 84
    iget-wide v6, v5, Lkotlin/jvm/internal/Ref$LongRef;->c:J

    .line 85
    .line 86
    invoke-static {v12, v13, v6, v7}, Landroidx/compose/ui/input/pointer/PointerId;->equals-impl0(JJ)Z

    .line 87
    .line 88
    .line 89
    move-result v6

    .line 90
    invoke-static {v6}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 91
    .line 92
    .line 93
    move-result-object v6

    .line 94
    invoke-virtual {v6}, Ljava/lang/Boolean;->booleanValue()Z

    .line 95
    .line 96
    .line 97
    move-result v6

    .line 98
    if-eqz v6, :cond_2

    .line 99
    .line 100
    goto :goto_2

    .line 101
    :cond_2
    add-int/lit8 v10, v10, 0x1

    .line 102
    .line 103
    move v6, p1

    .line 104
    move-object/from16 v7, p2

    .line 105
    .line 106
    goto :goto_1

    .line 107
    :cond_3
    move p1, v6

    .line 108
    move-object/from16 p2, v7

    .line 109
    .line 110
    move-object v11, v4

    .line 111
    :goto_2
    check-cast v11, Landroidx/compose/ui/input/pointer/PointerInputChange;

    .line 112
    .line 113
    if-eqz v11, :cond_b

    .line 114
    .line 115
    invoke-virtual {v11}, Landroidx/compose/ui/input/pointer/PointerInputChange;->isConsumed()Z

    .line 116
    .line 117
    .line 118
    move-result v6

    .line 119
    if-eqz v6, :cond_4

    .line 120
    .line 121
    return-object v4

    .line 122
    :cond_4
    invoke-static {v11}, Landroidx/compose/ui/input/pointer/PointerEventKt;->changedToUpIgnoreConsumed(Landroidx/compose/ui/input/pointer/PointerInputChange;)Z

    .line 123
    .line 124
    .line 125
    move-result v6

    .line 126
    if-eqz v6, :cond_8

    .line 127
    .line 128
    invoke-virtual/range {p2 .. p2}, Landroidx/compose/ui/input/pointer/PointerEvent;->getChanges()Ljava/util/List;

    .line 129
    .line 130
    .line 131
    move-result-object v6

    .line 132
    move-object v7, v6

    .line 133
    check-cast v7, Ljava/util/Collection;

    .line 134
    .line 135
    invoke-interface {v7}, Ljava/util/Collection;->size()I

    .line 136
    .line 137
    .line 138
    move-result v7

    .line 139
    :goto_3
    if-ge v1, v7, :cond_6

    .line 140
    .line 141
    invoke-interface {v6, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 142
    .line 143
    .line 144
    move-result-object v8

    .line 145
    move-object v9, v8

    .line 146
    check-cast v9, Landroidx/compose/ui/input/pointer/PointerInputChange;

    .line 147
    .line 148
    invoke-virtual {v9}, Landroidx/compose/ui/input/pointer/PointerInputChange;->getPressed()Z

    .line 149
    .line 150
    .line 151
    move-result v9

    .line 152
    invoke-static {v9}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 153
    .line 154
    .line 155
    move-result-object v9

    .line 156
    invoke-virtual {v9}, Ljava/lang/Boolean;->booleanValue()Z

    .line 157
    .line 158
    .line 159
    move-result v9

    .line 160
    if-eqz v9, :cond_5

    .line 161
    .line 162
    goto :goto_4

    .line 163
    :cond_5
    add-int/lit8 v1, v1, 0x1

    .line 164
    .line 165
    goto :goto_3

    .line 166
    :cond_6
    move-object v8, v4

    .line 167
    :goto_4
    check-cast v8, Landroidx/compose/ui/input/pointer/PointerInputChange;

    .line 168
    .line 169
    if-nez v8, :cond_7

    .line 170
    .line 171
    return-object v4

    .line 172
    :cond_7
    invoke-virtual {v8}, Landroidx/compose/ui/input/pointer/PointerInputChange;->getId-J3iCeTQ()J

    .line 173
    .line 174
    .line 175
    move-result-wide v6

    .line 176
    iput-wide v6, v5, Lkotlin/jvm/internal/Ref$LongRef;->c:J

    .line 177
    .line 178
    move-object/from16 v6, p7

    .line 179
    .line 180
    goto/16 :goto_0

    .line 181
    .line 182
    :cond_8
    invoke-virtual {v0, v11, v3}, Landroidx/compose/foundation/gestures/TouchSlopDetector;->addPointerInputChange-dBAh8RU(Landroidx/compose/ui/input/pointer/PointerInputChange;F)J

    .line 183
    .line 184
    .line 185
    move-result-wide v6

    .line 186
    const-wide v8, 0x7fffffff7fffffffL

    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    and-long/2addr v8, v6

    .line 192
    const-wide v12, 0x7fc000007fc00000L    # 2.247117487993712E307

    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    cmp-long v8, v8, v12

    .line 198
    .line 199
    if-eqz v8, :cond_a

    .line 200
    .line 201
    invoke-static {v6, v7}, Landroidx/compose/ui/geometry/Offset;->box-impl(J)Landroidx/compose/ui/geometry/Offset;

    .line 202
    .line 203
    .line 204
    move-result-object v1

    .line 205
    move-object/from16 v6, p7

    .line 206
    .line 207
    invoke-interface {v6, v11, v1}, Lhd/p;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 208
    .line 209
    .line 210
    invoke-virtual {v11}, Landroidx/compose/ui/input/pointer/PointerInputChange;->isConsumed()Z

    .line 211
    .line 212
    .line 213
    move-result v1

    .line 214
    if-eqz v1, :cond_9

    .line 215
    .line 216
    return-object v11

    .line 217
    :cond_9
    invoke-virtual {v0}, Landroidx/compose/foundation/gestures/TouchSlopDetector;->reset()V

    .line 218
    .line 219
    .line 220
    goto/16 :goto_0

    .line 221
    .line 222
    :cond_a
    move-object/from16 v6, p7

    .line 223
    .line 224
    sget-object v7, Landroidx/compose/ui/input/pointer/PointerEventPass;->Final:Landroidx/compose/ui/input/pointer/PointerEventPass;

    .line 225
    .line 226
    invoke-static {v1}, Lkotlin/jvm/internal/s;->c(I)V

    .line 227
    .line 228
    .line 229
    invoke-interface {p0, v7, v2}, Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;->awaitPointerEvent(Landroidx/compose/ui/input/pointer/PointerEventPass;Lvc/c;)Ljava/lang/Object;

    .line 230
    .line 231
    .line 232
    invoke-static {p1}, Lkotlin/jvm/internal/s;->c(I)V

    .line 233
    .line 234
    .line 235
    invoke-virtual {v11}, Landroidx/compose/ui/input/pointer/PointerInputChange;->isConsumed()Z

    .line 236
    .line 237
    .line 238
    move-result v1

    .line 239
    if-eqz v1, :cond_1

    .line 240
    .line 241
    :cond_b
    return-object v4
.end method

.method public static synthetic awaitPointerSlopOrCancellation-6ksA65w$default(Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;JILandroidx/compose/foundation/gestures/Orientation;JLhd/p;Lvc/c;ILjava/lang/Object;)Ljava/lang/Object;
    .locals 16

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p8

    .line 4
    .line 5
    and-int/lit8 v2, p9, 0x8

    .line 6
    .line 7
    if-eqz v2, :cond_0

    .line 8
    .line 9
    sget-object v2, Landroidx/compose/ui/geometry/Offset;->Companion:Landroidx/compose/ui/geometry/Offset$Companion;

    .line 10
    .line 11
    invoke-virtual {v2}, Landroidx/compose/ui/geometry/Offset$Companion;->getZero-F1C5BW0()J

    .line 12
    .line 13
    .line 14
    move-result-wide v2

    .line 15
    goto :goto_0

    .line 16
    :cond_0
    move-wide/from16 v2, p5

    .line 17
    .line 18
    :goto_0
    invoke-interface {v0}, Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;->getCurrentEvent()Landroidx/compose/ui/input/pointer/PointerEvent;

    .line 19
    .line 20
    .line 21
    move-result-object v4

    .line 22
    move-wide/from16 v5, p1

    .line 23
    .line 24
    invoke-static {v4, v5, v6}, Landroidx/compose/foundation/gestures/DragGestureDetectorKt;->access$isPointerUp-DmW0f2w(Landroidx/compose/ui/input/pointer/PointerEvent;J)Z

    .line 25
    .line 26
    .line 27
    move-result v4

    .line 28
    const/4 v7, 0x0

    .line 29
    if-eqz v4, :cond_1

    .line 30
    .line 31
    return-object v7

    .line 32
    :cond_1
    invoke-interface {v0}, Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;->getViewConfiguration()Landroidx/compose/ui/platform/ViewConfiguration;

    .line 33
    .line 34
    .line 35
    move-result-object v4

    .line 36
    move/from16 v8, p3

    .line 37
    .line 38
    invoke-static {v4, v8}, Landroidx/compose/foundation/gestures/DragGestureDetectorKt;->pointerSlop-E8SPZFQ(Landroidx/compose/ui/platform/ViewConfiguration;I)F

    .line 39
    .line 40
    .line 41
    move-result v4

    .line 42
    new-instance v8, Landroidx/compose/foundation/gestures/TouchSlopDetector;

    .line 43
    .line 44
    move-object/from16 v9, p4

    .line 45
    .line 46
    invoke-direct {v8, v9, v2, v3, v7}, Landroidx/compose/foundation/gestures/TouchSlopDetector;-><init>(Landroidx/compose/foundation/gestures/Orientation;JLkotlin/jvm/internal/n;)V

    .line 47
    .line 48
    .line 49
    :cond_2
    :goto_1
    const/4 v2, 0x0

    .line 50
    invoke-static {v2}, Lkotlin/jvm/internal/s;->c(I)V

    .line 51
    .line 52
    .line 53
    const/4 v3, 0x1

    .line 54
    invoke-static {v0, v7, v1, v3, v7}, Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;->awaitPointerEvent$default(Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;Landroidx/compose/ui/input/pointer/PointerEventPass;Lvc/c;ILjava/lang/Object;)Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    move-result-object v9

    .line 58
    invoke-static {v3}, Lkotlin/jvm/internal/s;->c(I)V

    .line 59
    .line 60
    .line 61
    check-cast v9, Landroidx/compose/ui/input/pointer/PointerEvent;

    .line 62
    .line 63
    invoke-virtual {v9}, Landroidx/compose/ui/input/pointer/PointerEvent;->getChanges()Ljava/util/List;

    .line 64
    .line 65
    .line 66
    move-result-object v10

    .line 67
    move-object v11, v10

    .line 68
    check-cast v11, Ljava/util/Collection;

    .line 69
    .line 70
    invoke-interface {v11}, Ljava/util/Collection;->size()I

    .line 71
    .line 72
    .line 73
    move-result v11

    .line 74
    move v12, v2

    .line 75
    :goto_2
    if-ge v12, v11, :cond_4

    .line 76
    .line 77
    invoke-interface {v10, v12}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 78
    .line 79
    .line 80
    move-result-object v13

    .line 81
    move-object v14, v13

    .line 82
    check-cast v14, Landroidx/compose/ui/input/pointer/PointerInputChange;

    .line 83
    .line 84
    invoke-virtual {v14}, Landroidx/compose/ui/input/pointer/PointerInputChange;->getId-J3iCeTQ()J

    .line 85
    .line 86
    .line 87
    move-result-wide v14

    .line 88
    invoke-static {v14, v15, v5, v6}, Landroidx/compose/ui/input/pointer/PointerId;->equals-impl0(JJ)Z

    .line 89
    .line 90
    .line 91
    move-result v14

    .line 92
    if-eqz v14, :cond_3

    .line 93
    .line 94
    goto :goto_3

    .line 95
    :cond_3
    add-int/lit8 v12, v12, 0x1

    .line 96
    .line 97
    goto :goto_2

    .line 98
    :cond_4
    move-object v13, v7

    .line 99
    :goto_3
    check-cast v13, Landroidx/compose/ui/input/pointer/PointerInputChange;

    .line 100
    .line 101
    if-eqz v13, :cond_c

    .line 102
    .line 103
    invoke-virtual {v13}, Landroidx/compose/ui/input/pointer/PointerInputChange;->isConsumed()Z

    .line 104
    .line 105
    .line 106
    move-result v10

    .line 107
    if-eqz v10, :cond_5

    .line 108
    .line 109
    return-object v7

    .line 110
    :cond_5
    invoke-static {v13}, Landroidx/compose/ui/input/pointer/PointerEventKt;->changedToUpIgnoreConsumed(Landroidx/compose/ui/input/pointer/PointerInputChange;)Z

    .line 111
    .line 112
    .line 113
    move-result v10

    .line 114
    if-eqz v10, :cond_9

    .line 115
    .line 116
    invoke-virtual {v9}, Landroidx/compose/ui/input/pointer/PointerEvent;->getChanges()Ljava/util/List;

    .line 117
    .line 118
    .line 119
    move-result-object v3

    .line 120
    move-object v5, v3

    .line 121
    check-cast v5, Ljava/util/Collection;

    .line 122
    .line 123
    invoke-interface {v5}, Ljava/util/Collection;->size()I

    .line 124
    .line 125
    .line 126
    move-result v5

    .line 127
    :goto_4
    if-ge v2, v5, :cond_7

    .line 128
    .line 129
    invoke-interface {v3, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 130
    .line 131
    .line 132
    move-result-object v6

    .line 133
    move-object v9, v6

    .line 134
    check-cast v9, Landroidx/compose/ui/input/pointer/PointerInputChange;

    .line 135
    .line 136
    invoke-virtual {v9}, Landroidx/compose/ui/input/pointer/PointerInputChange;->getPressed()Z

    .line 137
    .line 138
    .line 139
    move-result v9

    .line 140
    if-eqz v9, :cond_6

    .line 141
    .line 142
    goto :goto_5

    .line 143
    :cond_6
    add-int/lit8 v2, v2, 0x1

    .line 144
    .line 145
    goto :goto_4

    .line 146
    :cond_7
    move-object v6, v7

    .line 147
    :goto_5
    check-cast v6, Landroidx/compose/ui/input/pointer/PointerInputChange;

    .line 148
    .line 149
    if-nez v6, :cond_8

    .line 150
    .line 151
    return-object v7

    .line 152
    :cond_8
    invoke-virtual {v6}, Landroidx/compose/ui/input/pointer/PointerInputChange;->getId-J3iCeTQ()J

    .line 153
    .line 154
    .line 155
    move-result-wide v5

    .line 156
    goto :goto_1

    .line 157
    :cond_9
    invoke-virtual {v8, v13, v4}, Landroidx/compose/foundation/gestures/TouchSlopDetector;->addPointerInputChange-dBAh8RU(Landroidx/compose/ui/input/pointer/PointerInputChange;F)J

    .line 158
    .line 159
    .line 160
    move-result-wide v9

    .line 161
    const-wide v11, 0x7fffffff7fffffffL

    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    and-long/2addr v11, v9

    .line 167
    const-wide v14, 0x7fc000007fc00000L    # 2.247117487993712E307

    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    cmp-long v11, v11, v14

    .line 173
    .line 174
    if-eqz v11, :cond_b

    .line 175
    .line 176
    invoke-static {v9, v10}, Landroidx/compose/ui/geometry/Offset;->box-impl(J)Landroidx/compose/ui/geometry/Offset;

    .line 177
    .line 178
    .line 179
    move-result-object v2

    .line 180
    move-object/from16 v9, p7

    .line 181
    .line 182
    invoke-interface {v9, v13, v2}, Lhd/p;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 183
    .line 184
    .line 185
    invoke-virtual {v13}, Landroidx/compose/ui/input/pointer/PointerInputChange;->isConsumed()Z

    .line 186
    .line 187
    .line 188
    move-result v2

    .line 189
    if-eqz v2, :cond_a

    .line 190
    .line 191
    return-object v13

    .line 192
    :cond_a
    invoke-virtual {v8}, Landroidx/compose/foundation/gestures/TouchSlopDetector;->reset()V

    .line 193
    .line 194
    .line 195
    goto/16 :goto_1

    .line 196
    .line 197
    :cond_b
    move-object/from16 v9, p7

    .line 198
    .line 199
    sget-object v10, Landroidx/compose/ui/input/pointer/PointerEventPass;->Final:Landroidx/compose/ui/input/pointer/PointerEventPass;

    .line 200
    .line 201
    invoke-static {v2}, Lkotlin/jvm/internal/s;->c(I)V

    .line 202
    .line 203
    .line 204
    invoke-interface {v0, v10, v1}, Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;->awaitPointerEvent(Landroidx/compose/ui/input/pointer/PointerEventPass;Lvc/c;)Ljava/lang/Object;

    .line 205
    .line 206
    .line 207
    invoke-static {v3}, Lkotlin/jvm/internal/s;->c(I)V

    .line 208
    .line 209
    .line 210
    invoke-virtual {v13}, Landroidx/compose/ui/input/pointer/PointerInputChange;->isConsumed()Z

    .line 211
    .line 212
    .line 213
    move-result v2

    .line 214
    if-eqz v2, :cond_2

    .line 215
    .line 216
    :cond_c
    return-object v7
.end method

.method public static final awaitTouchSlopOrCancellation-jO51t88(Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;JLhd/p;Lvc/c;)Ljava/lang/Object;
    .locals 19
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;",
            "J",
            "Lhd/p;",
            "Lvc/c<",
            "-",
            "Landroidx/compose/ui/input/pointer/PointerInputChange;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    move-wide/from16 v0, p1

    .line 2
    .line 3
    move-object/from16 v2, p4

    .line 4
    .line 5
    instance-of v3, v2, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$awaitTouchSlopOrCancellation$1;

    .line 6
    .line 7
    if-eqz v3, :cond_0

    .line 8
    .line 9
    move-object v3, v2

    .line 10
    check-cast v3, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$awaitTouchSlopOrCancellation$1;

    .line 11
    .line 12
    iget v4, v3, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$awaitTouchSlopOrCancellation$1;->label:I

    .line 13
    .line 14
    const/high16 v5, -0x80000000

    .line 15
    .line 16
    and-int v6, v4, v5

    .line 17
    .line 18
    if-eqz v6, :cond_0

    .line 19
    .line 20
    sub-int/2addr v4, v5

    .line 21
    iput v4, v3, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$awaitTouchSlopOrCancellation$1;->label:I

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    new-instance v3, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$awaitTouchSlopOrCancellation$1;

    .line 25
    .line 26
    invoke-direct {v3, v2}, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$awaitTouchSlopOrCancellation$1;-><init>(Lvc/c;)V

    .line 27
    .line 28
    .line 29
    :goto_0
    iget-object v2, v3, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$awaitTouchSlopOrCancellation$1;->result:Ljava/lang/Object;

    .line 30
    .line 31
    invoke-static {}, Lwc/a;->f()Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v4

    .line 35
    iget v5, v3, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$awaitTouchSlopOrCancellation$1;->label:I

    .line 36
    .line 37
    const/4 v6, 0x2

    .line 38
    const/4 v7, 0x1

    .line 39
    const/4 v8, 0x0

    .line 40
    if-eqz v5, :cond_3

    .line 41
    .line 42
    if-eq v5, v7, :cond_2

    .line 43
    .line 44
    if-ne v5, v6, :cond_1

    .line 45
    .line 46
    iget v0, v3, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$awaitTouchSlopOrCancellation$1;->F$0:F

    .line 47
    .line 48
    iget-object v1, v3, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$awaitTouchSlopOrCancellation$1;->L$4:Ljava/lang/Object;

    .line 49
    .line 50
    check-cast v1, Landroidx/compose/ui/input/pointer/PointerInputChange;

    .line 51
    .line 52
    iget-object v5, v3, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$awaitTouchSlopOrCancellation$1;->L$3:Ljava/lang/Object;

    .line 53
    .line 54
    check-cast v5, Landroidx/compose/foundation/gestures/TouchSlopDetector;

    .line 55
    .line 56
    iget-object v9, v3, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$awaitTouchSlopOrCancellation$1;->L$2:Ljava/lang/Object;

    .line 57
    .line 58
    check-cast v9, Lkotlin/jvm/internal/Ref$LongRef;

    .line 59
    .line 60
    iget-object v10, v3, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$awaitTouchSlopOrCancellation$1;->L$1:Ljava/lang/Object;

    .line 61
    .line 62
    check-cast v10, Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;

    .line 63
    .line 64
    iget-object v11, v3, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$awaitTouchSlopOrCancellation$1;->L$0:Ljava/lang/Object;

    .line 65
    .line 66
    check-cast v11, Lhd/p;

    .line 67
    .line 68
    invoke-static {v2}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 69
    .line 70
    .line 71
    move-object v2, v5

    .line 72
    move-object/from16 v17, v8

    .line 73
    .line 74
    move-object v5, v3

    .line 75
    move v3, v0

    .line 76
    move-object v0, v10

    .line 77
    goto/16 :goto_a

    .line 78
    .line 79
    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 80
    .line 81
    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    .line 82
    .line 83
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 84
    .line 85
    .line 86
    throw v0

    .line 87
    :cond_2
    iget v0, v3, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$awaitTouchSlopOrCancellation$1;->F$0:F

    .line 88
    .line 89
    iget-object v1, v3, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$awaitTouchSlopOrCancellation$1;->L$3:Ljava/lang/Object;

    .line 90
    .line 91
    check-cast v1, Landroidx/compose/foundation/gestures/TouchSlopDetector;

    .line 92
    .line 93
    iget-object v5, v3, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$awaitTouchSlopOrCancellation$1;->L$2:Ljava/lang/Object;

    .line 94
    .line 95
    check-cast v5, Lkotlin/jvm/internal/Ref$LongRef;

    .line 96
    .line 97
    iget-object v9, v3, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$awaitTouchSlopOrCancellation$1;->L$1:Ljava/lang/Object;

    .line 98
    .line 99
    check-cast v9, Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;

    .line 100
    .line 101
    iget-object v10, v3, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$awaitTouchSlopOrCancellation$1;->L$0:Ljava/lang/Object;

    .line 102
    .line 103
    check-cast v10, Lhd/p;

    .line 104
    .line 105
    invoke-static {v2}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 106
    .line 107
    .line 108
    move-object/from16 v18, v5

    .line 109
    .line 110
    move v5, v0

    .line 111
    move-object v0, v9

    .line 112
    move-object v9, v3

    .line 113
    move-object v3, v1

    .line 114
    move-object v1, v10

    .line 115
    move-object/from16 v10, v18

    .line 116
    .line 117
    goto :goto_2

    .line 118
    :cond_3
    invoke-static {v2}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 119
    .line 120
    .line 121
    sget-object v2, Landroidx/compose/ui/input/pointer/PointerType;->Companion:Landroidx/compose/ui/input/pointer/PointerType$Companion;

    .line 122
    .line 123
    invoke-virtual {v2}, Landroidx/compose/ui/input/pointer/PointerType$Companion;->getTouch-T8wyACA()I

    .line 124
    .line 125
    .line 126
    move-result v2

    .line 127
    sget-object v5, Landroidx/compose/ui/geometry/Offset;->Companion:Landroidx/compose/ui/geometry/Offset$Companion;

    .line 128
    .line 129
    invoke-virtual {v5}, Landroidx/compose/ui/geometry/Offset$Companion;->getZero-F1C5BW0()J

    .line 130
    .line 131
    .line 132
    move-result-wide v9

    .line 133
    invoke-interface/range {p0 .. p0}, Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;->getCurrentEvent()Landroidx/compose/ui/input/pointer/PointerEvent;

    .line 134
    .line 135
    .line 136
    move-result-object v5

    .line 137
    invoke-static {v5, v0, v1}, Landroidx/compose/foundation/gestures/DragGestureDetectorKt;->access$isPointerUp-DmW0f2w(Landroidx/compose/ui/input/pointer/PointerEvent;J)Z

    .line 138
    .line 139
    .line 140
    move-result v5

    .line 141
    if-eqz v5, :cond_4

    .line 142
    .line 143
    return-object v8

    .line 144
    :cond_4
    invoke-interface/range {p0 .. p0}, Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;->getViewConfiguration()Landroidx/compose/ui/platform/ViewConfiguration;

    .line 145
    .line 146
    .line 147
    move-result-object v5

    .line 148
    invoke-static {v5, v2}, Landroidx/compose/foundation/gestures/DragGestureDetectorKt;->pointerSlop-E8SPZFQ(Landroidx/compose/ui/platform/ViewConfiguration;I)F

    .line 149
    .line 150
    .line 151
    move-result v2

    .line 152
    new-instance v5, Lkotlin/jvm/internal/Ref$LongRef;

    .line 153
    .line 154
    invoke-direct {v5}, Lkotlin/jvm/internal/Ref$LongRef;-><init>()V

    .line 155
    .line 156
    .line 157
    iput-wide v0, v5, Lkotlin/jvm/internal/Ref$LongRef;->c:J

    .line 158
    .line 159
    new-instance v0, Landroidx/compose/foundation/gestures/TouchSlopDetector;

    .line 160
    .line 161
    invoke-direct {v0, v8, v9, v10, v8}, Landroidx/compose/foundation/gestures/TouchSlopDetector;-><init>(Landroidx/compose/foundation/gestures/Orientation;JLkotlin/jvm/internal/n;)V

    .line 162
    .line 163
    .line 164
    move-object/from16 v1, p3

    .line 165
    .line 166
    move-object v9, v5

    .line 167
    move-object v5, v3

    .line 168
    move v3, v2

    .line 169
    move-object v2, v0

    .line 170
    move-object/from16 v0, p0

    .line 171
    .line 172
    :goto_1
    iput-object v1, v5, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$awaitTouchSlopOrCancellation$1;->L$0:Ljava/lang/Object;

    .line 173
    .line 174
    iput-object v0, v5, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$awaitTouchSlopOrCancellation$1;->L$1:Ljava/lang/Object;

    .line 175
    .line 176
    iput-object v9, v5, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$awaitTouchSlopOrCancellation$1;->L$2:Ljava/lang/Object;

    .line 177
    .line 178
    iput-object v2, v5, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$awaitTouchSlopOrCancellation$1;->L$3:Ljava/lang/Object;

    .line 179
    .line 180
    iput-object v8, v5, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$awaitTouchSlopOrCancellation$1;->L$4:Ljava/lang/Object;

    .line 181
    .line 182
    iput v3, v5, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$awaitTouchSlopOrCancellation$1;->F$0:F

    .line 183
    .line 184
    iput v7, v5, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$awaitTouchSlopOrCancellation$1;->label:I

    .line 185
    .line 186
    invoke-static {v0, v8, v5, v7, v8}, Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;->awaitPointerEvent$default(Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;Landroidx/compose/ui/input/pointer/PointerEventPass;Lvc/c;ILjava/lang/Object;)Ljava/lang/Object;

    .line 187
    .line 188
    .line 189
    move-result-object v10

    .line 190
    if-ne v10, v4, :cond_5

    .line 191
    .line 192
    goto/16 :goto_9

    .line 193
    .line 194
    :cond_5
    move/from16 v18, v3

    .line 195
    .line 196
    move-object v3, v2

    .line 197
    move-object v2, v10

    .line 198
    move-object v10, v9

    .line 199
    move-object v9, v5

    .line 200
    move/from16 v5, v18

    .line 201
    .line 202
    :goto_2
    check-cast v2, Landroidx/compose/ui/input/pointer/PointerEvent;

    .line 203
    .line 204
    invoke-virtual {v2}, Landroidx/compose/ui/input/pointer/PointerEvent;->getChanges()Ljava/util/List;

    .line 205
    .line 206
    .line 207
    move-result-object v11

    .line 208
    move-object v12, v11

    .line 209
    check-cast v12, Ljava/util/Collection;

    .line 210
    .line 211
    invoke-interface {v12}, Ljava/util/Collection;->size()I

    .line 212
    .line 213
    .line 214
    move-result v12

    .line 215
    const/4 v14, 0x0

    .line 216
    :goto_3
    if-ge v14, v12, :cond_7

    .line 217
    .line 218
    invoke-interface {v11, v14}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 219
    .line 220
    .line 221
    move-result-object v15

    .line 222
    move-object/from16 v16, v15

    .line 223
    .line 224
    check-cast v16, Landroidx/compose/ui/input/pointer/PointerInputChange;

    .line 225
    .line 226
    move-object/from16 v17, v8

    .line 227
    .line 228
    invoke-virtual/range {v16 .. v16}, Landroidx/compose/ui/input/pointer/PointerInputChange;->getId-J3iCeTQ()J

    .line 229
    .line 230
    .line 231
    move-result-wide v7

    .line 232
    move/from16 v16, v14

    .line 233
    .line 234
    iget-wide v13, v10, Lkotlin/jvm/internal/Ref$LongRef;->c:J

    .line 235
    .line 236
    invoke-static {v7, v8, v13, v14}, Landroidx/compose/ui/input/pointer/PointerId;->equals-impl0(JJ)Z

    .line 237
    .line 238
    .line 239
    move-result v7

    .line 240
    if-eqz v7, :cond_6

    .line 241
    .line 242
    goto :goto_4

    .line 243
    :cond_6
    add-int/lit8 v14, v16, 0x1

    .line 244
    .line 245
    move-object/from16 v8, v17

    .line 246
    .line 247
    const/4 v7, 0x1

    .line 248
    goto :goto_3

    .line 249
    :cond_7
    move-object/from16 v17, v8

    .line 250
    .line 251
    move-object/from16 v15, v17

    .line 252
    .line 253
    :goto_4
    move-object v7, v15

    .line 254
    check-cast v7, Landroidx/compose/ui/input/pointer/PointerInputChange;

    .line 255
    .line 256
    if-nez v7, :cond_8

    .line 257
    .line 258
    return-object v17

    .line 259
    :cond_8
    invoke-virtual {v7}, Landroidx/compose/ui/input/pointer/PointerInputChange;->isConsumed()Z

    .line 260
    .line 261
    .line 262
    move-result v8

    .line 263
    if-eqz v8, :cond_9

    .line 264
    .line 265
    return-object v17

    .line 266
    :cond_9
    invoke-static {v7}, Landroidx/compose/ui/input/pointer/PointerEventKt;->changedToUpIgnoreConsumed(Landroidx/compose/ui/input/pointer/PointerInputChange;)Z

    .line 267
    .line 268
    .line 269
    move-result v8

    .line 270
    if-eqz v8, :cond_d

    .line 271
    .line 272
    invoke-virtual {v2}, Landroidx/compose/ui/input/pointer/PointerEvent;->getChanges()Ljava/util/List;

    .line 273
    .line 274
    .line 275
    move-result-object v2

    .line 276
    move-object v7, v2

    .line 277
    check-cast v7, Ljava/util/Collection;

    .line 278
    .line 279
    invoke-interface {v7}, Ljava/util/Collection;->size()I

    .line 280
    .line 281
    .line 282
    move-result v7

    .line 283
    const/4 v13, 0x0

    .line 284
    :goto_5
    if-ge v13, v7, :cond_b

    .line 285
    .line 286
    invoke-interface {v2, v13}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 287
    .line 288
    .line 289
    move-result-object v8

    .line 290
    move-object v11, v8

    .line 291
    check-cast v11, Landroidx/compose/ui/input/pointer/PointerInputChange;

    .line 292
    .line 293
    invoke-virtual {v11}, Landroidx/compose/ui/input/pointer/PointerInputChange;->getPressed()Z

    .line 294
    .line 295
    .line 296
    move-result v11

    .line 297
    if-eqz v11, :cond_a

    .line 298
    .line 299
    goto :goto_6

    .line 300
    :cond_a
    add-int/lit8 v13, v13, 0x1

    .line 301
    .line 302
    goto :goto_5

    .line 303
    :cond_b
    move-object/from16 v8, v17

    .line 304
    .line 305
    :goto_6
    check-cast v8, Landroidx/compose/ui/input/pointer/PointerInputChange;

    .line 306
    .line 307
    if-nez v8, :cond_c

    .line 308
    .line 309
    return-object v17

    .line 310
    :cond_c
    invoke-virtual {v8}, Landroidx/compose/ui/input/pointer/PointerInputChange;->getId-J3iCeTQ()J

    .line 311
    .line 312
    .line 313
    move-result-wide v7

    .line 314
    iput-wide v7, v10, Lkotlin/jvm/internal/Ref$LongRef;->c:J

    .line 315
    .line 316
    goto :goto_7

    .line 317
    :cond_d
    invoke-virtual {v3, v7, v5}, Landroidx/compose/foundation/gestures/TouchSlopDetector;->addPointerInputChange-dBAh8RU(Landroidx/compose/ui/input/pointer/PointerInputChange;F)J

    .line 318
    .line 319
    .line 320
    move-result-wide v11

    .line 321
    const-wide v13, 0x7fffffff7fffffffL

    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    and-long/2addr v13, v11

    .line 327
    const-wide v15, 0x7fc000007fc00000L    # 2.247117487993712E307

    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    cmp-long v2, v13, v15

    .line 333
    .line 334
    if-eqz v2, :cond_f

    .line 335
    .line 336
    invoke-static {v11, v12}, Landroidx/compose/ui/geometry/Offset;->box-impl(J)Landroidx/compose/ui/geometry/Offset;

    .line 337
    .line 338
    .line 339
    move-result-object v2

    .line 340
    invoke-interface {v1, v7, v2}, Lhd/p;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 341
    .line 342
    .line 343
    invoke-virtual {v7}, Landroidx/compose/ui/input/pointer/PointerInputChange;->isConsumed()Z

    .line 344
    .line 345
    .line 346
    move-result v2

    .line 347
    if-eqz v2, :cond_e

    .line 348
    .line 349
    return-object v7

    .line 350
    :cond_e
    invoke-virtual {v3}, Landroidx/compose/foundation/gestures/TouchSlopDetector;->reset()V

    .line 351
    .line 352
    .line 353
    :goto_7
    move-object v2, v3

    .line 354
    move v3, v5

    .line 355
    move-object v5, v9

    .line 356
    move-object v9, v10

    .line 357
    :goto_8
    move-object/from16 v8, v17

    .line 358
    .line 359
    const/4 v7, 0x1

    .line 360
    goto/16 :goto_1

    .line 361
    .line 362
    :cond_f
    sget-object v2, Landroidx/compose/ui/input/pointer/PointerEventPass;->Final:Landroidx/compose/ui/input/pointer/PointerEventPass;

    .line 363
    .line 364
    iput-object v1, v9, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$awaitTouchSlopOrCancellation$1;->L$0:Ljava/lang/Object;

    .line 365
    .line 366
    iput-object v0, v9, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$awaitTouchSlopOrCancellation$1;->L$1:Ljava/lang/Object;

    .line 367
    .line 368
    iput-object v10, v9, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$awaitTouchSlopOrCancellation$1;->L$2:Ljava/lang/Object;

    .line 369
    .line 370
    iput-object v3, v9, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$awaitTouchSlopOrCancellation$1;->L$3:Ljava/lang/Object;

    .line 371
    .line 372
    iput-object v7, v9, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$awaitTouchSlopOrCancellation$1;->L$4:Ljava/lang/Object;

    .line 373
    .line 374
    iput v5, v9, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$awaitTouchSlopOrCancellation$1;->F$0:F

    .line 375
    .line 376
    iput v6, v9, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$awaitTouchSlopOrCancellation$1;->label:I

    .line 377
    .line 378
    invoke-interface {v0, v2, v9}, Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;->awaitPointerEvent(Landroidx/compose/ui/input/pointer/PointerEventPass;Lvc/c;)Ljava/lang/Object;

    .line 379
    .line 380
    .line 381
    move-result-object v2

    .line 382
    if-ne v2, v4, :cond_10

    .line 383
    .line 384
    :goto_9
    return-object v4

    .line 385
    :cond_10
    move-object v11, v1

    .line 386
    move-object v2, v3

    .line 387
    move v3, v5

    .line 388
    move-object v1, v7

    .line 389
    move-object v5, v9

    .line 390
    move-object v9, v10

    .line 391
    :goto_a
    invoke-virtual {v1}, Landroidx/compose/ui/input/pointer/PointerInputChange;->isConsumed()Z

    .line 392
    .line 393
    .line 394
    move-result v1

    .line 395
    if-eqz v1, :cond_11

    .line 396
    .line 397
    return-object v17

    .line 398
    :cond_11
    move-object v1, v11

    .line 399
    goto :goto_8
.end method

.method public static final awaitVerticalDragOrCancellation-rnUCldI(Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;JLvc/c;)Ljava/lang/Object;
    .locals 17
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;",
            "J",
            "Lvc/c<",
            "-",
            "Landroidx/compose/ui/input/pointer/PointerInputChange;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    move-wide/from16 v0, p1

    .line 2
    .line 3
    move-object/from16 v2, p3

    .line 4
    .line 5
    instance-of v3, v2, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$awaitVerticalDragOrCancellation$1;

    .line 6
    .line 7
    if-eqz v3, :cond_0

    .line 8
    .line 9
    move-object v3, v2

    .line 10
    check-cast v3, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$awaitVerticalDragOrCancellation$1;

    .line 11
    .line 12
    iget v4, v3, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$awaitVerticalDragOrCancellation$1;->label:I

    .line 13
    .line 14
    const/high16 v5, -0x80000000

    .line 15
    .line 16
    and-int v6, v4, v5

    .line 17
    .line 18
    if-eqz v6, :cond_0

    .line 19
    .line 20
    sub-int/2addr v4, v5

    .line 21
    iput v4, v3, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$awaitVerticalDragOrCancellation$1;->label:I

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    new-instance v3, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$awaitVerticalDragOrCancellation$1;

    .line 25
    .line 26
    invoke-direct {v3, v2}, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$awaitVerticalDragOrCancellation$1;-><init>(Lvc/c;)V

    .line 27
    .line 28
    .line 29
    :goto_0
    iget-object v2, v3, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$awaitVerticalDragOrCancellation$1;->result:Ljava/lang/Object;

    .line 30
    .line 31
    invoke-static {}, Lwc/a;->f()Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v4

    .line 35
    iget v5, v3, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$awaitVerticalDragOrCancellation$1;->label:I

    .line 36
    .line 37
    const/4 v6, 0x1

    .line 38
    const/4 v7, 0x0

    .line 39
    if-eqz v5, :cond_2

    .line 40
    .line 41
    if-ne v5, v6, :cond_1

    .line 42
    .line 43
    iget-object v0, v3, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$awaitVerticalDragOrCancellation$1;->L$1:Ljava/lang/Object;

    .line 44
    .line 45
    check-cast v0, Lkotlin/jvm/internal/Ref$LongRef;

    .line 46
    .line 47
    iget-object v1, v3, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$awaitVerticalDragOrCancellation$1;->L$0:Ljava/lang/Object;

    .line 48
    .line 49
    check-cast v1, Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;

    .line 50
    .line 51
    invoke-static {v2}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 52
    .line 53
    .line 54
    move-object/from16 v16, v1

    .line 55
    .line 56
    move-object v1, v0

    .line 57
    move-object/from16 v0, v16

    .line 58
    .line 59
    goto :goto_2

    .line 60
    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 61
    .line 62
    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    .line 63
    .line 64
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 65
    .line 66
    .line 67
    throw v0

    .line 68
    :cond_2
    invoke-static {v2}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 69
    .line 70
    .line 71
    invoke-interface/range {p0 .. p0}, Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;->getCurrentEvent()Landroidx/compose/ui/input/pointer/PointerEvent;

    .line 72
    .line 73
    .line 74
    move-result-object v2

    .line 75
    invoke-static {v2, v0, v1}, Landroidx/compose/foundation/gestures/DragGestureDetectorKt;->isPointerUp-DmW0f2w(Landroidx/compose/ui/input/pointer/PointerEvent;J)Z

    .line 76
    .line 77
    .line 78
    move-result v2

    .line 79
    if-eqz v2, :cond_3

    .line 80
    .line 81
    return-object v7

    .line 82
    :cond_3
    new-instance v2, Lkotlin/jvm/internal/Ref$LongRef;

    .line 83
    .line 84
    invoke-direct {v2}, Lkotlin/jvm/internal/Ref$LongRef;-><init>()V

    .line 85
    .line 86
    .line 87
    iput-wide v0, v2, Lkotlin/jvm/internal/Ref$LongRef;->c:J

    .line 88
    .line 89
    move-object/from16 v0, p0

    .line 90
    .line 91
    :goto_1
    iput-object v0, v3, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$awaitVerticalDragOrCancellation$1;->L$0:Ljava/lang/Object;

    .line 92
    .line 93
    iput-object v2, v3, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$awaitVerticalDragOrCancellation$1;->L$1:Ljava/lang/Object;

    .line 94
    .line 95
    iput v6, v3, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$awaitVerticalDragOrCancellation$1;->label:I

    .line 96
    .line 97
    invoke-static {v0, v7, v3, v6, v7}, Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;->awaitPointerEvent$default(Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;Landroidx/compose/ui/input/pointer/PointerEventPass;Lvc/c;ILjava/lang/Object;)Ljava/lang/Object;

    .line 98
    .line 99
    .line 100
    move-result-object v1

    .line 101
    if-ne v1, v4, :cond_4

    .line 102
    .line 103
    return-object v4

    .line 104
    :cond_4
    move-object/from16 v16, v2

    .line 105
    .line 106
    move-object v2, v1

    .line 107
    move-object/from16 v1, v16

    .line 108
    .line 109
    :goto_2
    check-cast v2, Landroidx/compose/ui/input/pointer/PointerEvent;

    .line 110
    .line 111
    invoke-virtual {v2}, Landroidx/compose/ui/input/pointer/PointerEvent;->getChanges()Ljava/util/List;

    .line 112
    .line 113
    .line 114
    move-result-object v5

    .line 115
    move-object v8, v5

    .line 116
    check-cast v8, Ljava/util/Collection;

    .line 117
    .line 118
    invoke-interface {v8}, Ljava/util/Collection;->size()I

    .line 119
    .line 120
    .line 121
    move-result v8

    .line 122
    const/4 v9, 0x0

    .line 123
    move v10, v9

    .line 124
    :goto_3
    if-ge v10, v8, :cond_6

    .line 125
    .line 126
    invoke-interface {v5, v10}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 127
    .line 128
    .line 129
    move-result-object v11

    .line 130
    move-object v12, v11

    .line 131
    check-cast v12, Landroidx/compose/ui/input/pointer/PointerInputChange;

    .line 132
    .line 133
    invoke-virtual {v12}, Landroidx/compose/ui/input/pointer/PointerInputChange;->getId-J3iCeTQ()J

    .line 134
    .line 135
    .line 136
    move-result-wide v12

    .line 137
    iget-wide v14, v1, Lkotlin/jvm/internal/Ref$LongRef;->c:J

    .line 138
    .line 139
    invoke-static {v12, v13, v14, v15}, Landroidx/compose/ui/input/pointer/PointerId;->equals-impl0(JJ)Z

    .line 140
    .line 141
    .line 142
    move-result v12

    .line 143
    if-eqz v12, :cond_5

    .line 144
    .line 145
    goto :goto_4

    .line 146
    :cond_5
    add-int/lit8 v10, v10, 0x1

    .line 147
    .line 148
    goto :goto_3

    .line 149
    :cond_6
    move-object v11, v7

    .line 150
    :goto_4
    check-cast v11, Landroidx/compose/ui/input/pointer/PointerInputChange;

    .line 151
    .line 152
    if-nez v11, :cond_7

    .line 153
    .line 154
    move-object v11, v7

    .line 155
    goto :goto_7

    .line 156
    :cond_7
    invoke-static {v11}, Landroidx/compose/ui/input/pointer/PointerEventKt;->changedToUpIgnoreConsumed(Landroidx/compose/ui/input/pointer/PointerInputChange;)Z

    .line 157
    .line 158
    .line 159
    move-result v5

    .line 160
    if-eqz v5, :cond_b

    .line 161
    .line 162
    invoke-virtual {v2}, Landroidx/compose/ui/input/pointer/PointerEvent;->getChanges()Ljava/util/List;

    .line 163
    .line 164
    .line 165
    move-result-object v2

    .line 166
    move-object v5, v2

    .line 167
    check-cast v5, Ljava/util/Collection;

    .line 168
    .line 169
    invoke-interface {v5}, Ljava/util/Collection;->size()I

    .line 170
    .line 171
    .line 172
    move-result v5

    .line 173
    :goto_5
    if-ge v9, v5, :cond_9

    .line 174
    .line 175
    invoke-interface {v2, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 176
    .line 177
    .line 178
    move-result-object v8

    .line 179
    move-object v10, v8

    .line 180
    check-cast v10, Landroidx/compose/ui/input/pointer/PointerInputChange;

    .line 181
    .line 182
    invoke-virtual {v10}, Landroidx/compose/ui/input/pointer/PointerInputChange;->getPressed()Z

    .line 183
    .line 184
    .line 185
    move-result v10

    .line 186
    if-eqz v10, :cond_8

    .line 187
    .line 188
    goto :goto_6

    .line 189
    :cond_8
    add-int/lit8 v9, v9, 0x1

    .line 190
    .line 191
    goto :goto_5

    .line 192
    :cond_9
    move-object v8, v7

    .line 193
    :goto_6
    check-cast v8, Landroidx/compose/ui/input/pointer/PointerInputChange;

    .line 194
    .line 195
    if-nez v8, :cond_a

    .line 196
    .line 197
    goto :goto_7

    .line 198
    :cond_a
    invoke-virtual {v8}, Landroidx/compose/ui/input/pointer/PointerInputChange;->getId-J3iCeTQ()J

    .line 199
    .line 200
    .line 201
    move-result-wide v8

    .line 202
    iput-wide v8, v1, Lkotlin/jvm/internal/Ref$LongRef;->c:J

    .line 203
    .line 204
    goto :goto_8

    .line 205
    :cond_b
    invoke-static {v11}, Landroidx/compose/ui/input/pointer/PointerEventKt;->positionChangeIgnoreConsumed(Landroidx/compose/ui/input/pointer/PointerInputChange;)J

    .line 206
    .line 207
    .line 208
    move-result-wide v12

    .line 209
    const-wide v14, 0xffffffffL

    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    and-long/2addr v12, v14

    .line 215
    long-to-int v2, v12

    .line 216
    invoke-static {v2}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 217
    .line 218
    .line 219
    move-result v2

    .line 220
    const/4 v5, 0x0

    .line 221
    cmpg-float v2, v2, v5

    .line 222
    .line 223
    if-nez v2, :cond_c

    .line 224
    .line 225
    move v9, v6

    .line 226
    :cond_c
    if-nez v9, :cond_e

    .line 227
    .line 228
    :goto_7
    if-eqz v11, :cond_d

    .line 229
    .line 230
    invoke-virtual {v11}, Landroidx/compose/ui/input/pointer/PointerInputChange;->isConsumed()Z

    .line 231
    .line 232
    .line 233
    move-result v0

    .line 234
    if-nez v0, :cond_d

    .line 235
    .line 236
    return-object v11

    .line 237
    :cond_d
    return-object v7

    .line 238
    :cond_e
    :goto_8
    move-object v2, v1

    .line 239
    goto/16 :goto_1
.end method

.method public static final awaitVerticalPointerSlopOrCancellation-gDDlDlE(Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;JILhd/p;Lvc/c;)Ljava/lang/Object;
    .locals 21
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;",
            "JI",
            "Lhd/p;",
            "Lvc/c<",
            "-",
            "Landroidx/compose/ui/input/pointer/PointerInputChange;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    move-wide/from16 v0, p1

    .line 2
    .line 3
    move-object/from16 v2, p5

    .line 4
    .line 5
    instance-of v3, v2, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1;

    .line 6
    .line 7
    if-eqz v3, :cond_0

    .line 8
    .line 9
    move-object v3, v2

    .line 10
    check-cast v3, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1;

    .line 11
    .line 12
    iget v4, v3, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1;->label:I

    .line 13
    .line 14
    const/high16 v5, -0x80000000

    .line 15
    .line 16
    and-int v6, v4, v5

    .line 17
    .line 18
    if-eqz v6, :cond_0

    .line 19
    .line 20
    sub-int/2addr v4, v5

    .line 21
    iput v4, v3, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1;->label:I

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    new-instance v3, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1;

    .line 25
    .line 26
    invoke-direct {v3, v2}, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1;-><init>(Lvc/c;)V

    .line 27
    .line 28
    .line 29
    :goto_0
    iget-object v2, v3, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1;->result:Ljava/lang/Object;

    .line 30
    .line 31
    invoke-static {}, Lwc/a;->f()Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v4

    .line 35
    iget v5, v3, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1;->label:I

    .line 36
    .line 37
    const/4 v6, 0x2

    .line 38
    const/4 v7, 0x1

    .line 39
    const/4 v8, 0x0

    .line 40
    if-eqz v5, :cond_3

    .line 41
    .line 42
    if-eq v5, v7, :cond_2

    .line 43
    .line 44
    if-ne v5, v6, :cond_1

    .line 45
    .line 46
    iget v0, v3, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1;->F$0:F

    .line 47
    .line 48
    iget-object v1, v3, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1;->L$4:Ljava/lang/Object;

    .line 49
    .line 50
    check-cast v1, Landroidx/compose/ui/input/pointer/PointerInputChange;

    .line 51
    .line 52
    iget-object v5, v3, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1;->L$3:Ljava/lang/Object;

    .line 53
    .line 54
    check-cast v5, Landroidx/compose/foundation/gestures/TouchSlopDetector;

    .line 55
    .line 56
    iget-object v9, v3, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1;->L$2:Ljava/lang/Object;

    .line 57
    .line 58
    check-cast v9, Lkotlin/jvm/internal/Ref$LongRef;

    .line 59
    .line 60
    iget-object v10, v3, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1;->L$1:Ljava/lang/Object;

    .line 61
    .line 62
    check-cast v10, Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;

    .line 63
    .line 64
    iget-object v11, v3, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1;->L$0:Ljava/lang/Object;

    .line 65
    .line 66
    check-cast v11, Lhd/p;

    .line 67
    .line 68
    invoke-static {v2}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 69
    .line 70
    .line 71
    move-object v2, v5

    .line 72
    move-object/from16 v17, v8

    .line 73
    .line 74
    move v5, v0

    .line 75
    move-object v0, v10

    .line 76
    goto/16 :goto_9

    .line 77
    .line 78
    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 79
    .line 80
    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    .line 81
    .line 82
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 83
    .line 84
    .line 85
    throw v0

    .line 86
    :cond_2
    iget v0, v3, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1;->F$0:F

    .line 87
    .line 88
    iget-object v1, v3, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1;->L$3:Ljava/lang/Object;

    .line 89
    .line 90
    check-cast v1, Landroidx/compose/foundation/gestures/TouchSlopDetector;

    .line 91
    .line 92
    iget-object v5, v3, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1;->L$2:Ljava/lang/Object;

    .line 93
    .line 94
    check-cast v5, Lkotlin/jvm/internal/Ref$LongRef;

    .line 95
    .line 96
    iget-object v9, v3, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1;->L$1:Ljava/lang/Object;

    .line 97
    .line 98
    check-cast v9, Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;

    .line 99
    .line 100
    iget-object v10, v3, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1;->L$0:Ljava/lang/Object;

    .line 101
    .line 102
    check-cast v10, Lhd/p;

    .line 103
    .line 104
    invoke-static {v2}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 105
    .line 106
    .line 107
    move-object v11, v9

    .line 108
    move v9, v0

    .line 109
    move-object v0, v11

    .line 110
    move-object v11, v5

    .line 111
    move-object v5, v3

    .line 112
    move-object v3, v1

    .line 113
    move-object v1, v10

    .line 114
    goto :goto_2

    .line 115
    :cond_3
    invoke-static {v2}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 116
    .line 117
    .line 118
    sget-object v2, Landroidx/compose/foundation/gestures/Orientation;->Vertical:Landroidx/compose/foundation/gestures/Orientation;

    .line 119
    .line 120
    sget-object v5, Landroidx/compose/ui/geometry/Offset;->Companion:Landroidx/compose/ui/geometry/Offset$Companion;

    .line 121
    .line 122
    invoke-virtual {v5}, Landroidx/compose/ui/geometry/Offset$Companion;->getZero-F1C5BW0()J

    .line 123
    .line 124
    .line 125
    move-result-wide v9

    .line 126
    invoke-interface/range {p0 .. p0}, Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;->getCurrentEvent()Landroidx/compose/ui/input/pointer/PointerEvent;

    .line 127
    .line 128
    .line 129
    move-result-object v5

    .line 130
    invoke-static {v5, v0, v1}, Landroidx/compose/foundation/gestures/DragGestureDetectorKt;->access$isPointerUp-DmW0f2w(Landroidx/compose/ui/input/pointer/PointerEvent;J)Z

    .line 131
    .line 132
    .line 133
    move-result v5

    .line 134
    if-eqz v5, :cond_4

    .line 135
    .line 136
    return-object v8

    .line 137
    :cond_4
    invoke-interface/range {p0 .. p0}, Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;->getViewConfiguration()Landroidx/compose/ui/platform/ViewConfiguration;

    .line 138
    .line 139
    .line 140
    move-result-object v5

    .line 141
    move/from16 v11, p3

    .line 142
    .line 143
    invoke-static {v5, v11}, Landroidx/compose/foundation/gestures/DragGestureDetectorKt;->pointerSlop-E8SPZFQ(Landroidx/compose/ui/platform/ViewConfiguration;I)F

    .line 144
    .line 145
    .line 146
    move-result v5

    .line 147
    new-instance v11, Lkotlin/jvm/internal/Ref$LongRef;

    .line 148
    .line 149
    invoke-direct {v11}, Lkotlin/jvm/internal/Ref$LongRef;-><init>()V

    .line 150
    .line 151
    .line 152
    iput-wide v0, v11, Lkotlin/jvm/internal/Ref$LongRef;->c:J

    .line 153
    .line 154
    new-instance v0, Landroidx/compose/foundation/gestures/TouchSlopDetector;

    .line 155
    .line 156
    invoke-direct {v0, v2, v9, v10, v8}, Landroidx/compose/foundation/gestures/TouchSlopDetector;-><init>(Landroidx/compose/foundation/gestures/Orientation;JLkotlin/jvm/internal/n;)V

    .line 157
    .line 158
    .line 159
    move-object/from16 v1, p4

    .line 160
    .line 161
    move-object v2, v0

    .line 162
    move-object/from16 v0, p0

    .line 163
    .line 164
    :goto_1
    iput-object v1, v3, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1;->L$0:Ljava/lang/Object;

    .line 165
    .line 166
    iput-object v0, v3, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1;->L$1:Ljava/lang/Object;

    .line 167
    .line 168
    iput-object v11, v3, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1;->L$2:Ljava/lang/Object;

    .line 169
    .line 170
    iput-object v2, v3, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1;->L$3:Ljava/lang/Object;

    .line 171
    .line 172
    iput-object v8, v3, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1;->L$4:Ljava/lang/Object;

    .line 173
    .line 174
    iput v5, v3, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1;->F$0:F

    .line 175
    .line 176
    iput v7, v3, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1;->label:I

    .line 177
    .line 178
    invoke-static {v0, v8, v3, v7, v8}, Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;->awaitPointerEvent$default(Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;Landroidx/compose/ui/input/pointer/PointerEventPass;Lvc/c;ILjava/lang/Object;)Ljava/lang/Object;

    .line 179
    .line 180
    .line 181
    move-result-object v9

    .line 182
    if-ne v9, v4, :cond_5

    .line 183
    .line 184
    goto/16 :goto_8

    .line 185
    .line 186
    :cond_5
    move-object/from16 v20, v3

    .line 187
    .line 188
    move-object v3, v2

    .line 189
    move-object v2, v9

    .line 190
    move v9, v5

    .line 191
    move-object/from16 v5, v20

    .line 192
    .line 193
    :goto_2
    check-cast v2, Landroidx/compose/ui/input/pointer/PointerEvent;

    .line 194
    .line 195
    invoke-virtual {v2}, Landroidx/compose/ui/input/pointer/PointerEvent;->getChanges()Ljava/util/List;

    .line 196
    .line 197
    .line 198
    move-result-object v10

    .line 199
    move-object v12, v10

    .line 200
    check-cast v12, Ljava/util/Collection;

    .line 201
    .line 202
    invoke-interface {v12}, Ljava/util/Collection;->size()I

    .line 203
    .line 204
    .line 205
    move-result v12

    .line 206
    const/4 v14, 0x0

    .line 207
    :goto_3
    if-ge v14, v12, :cond_7

    .line 208
    .line 209
    invoke-interface {v10, v14}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 210
    .line 211
    .line 212
    move-result-object v15

    .line 213
    move-object/from16 v16, v15

    .line 214
    .line 215
    check-cast v16, Landroidx/compose/ui/input/pointer/PointerInputChange;

    .line 216
    .line 217
    move-object/from16 v17, v8

    .line 218
    .line 219
    invoke-virtual/range {v16 .. v16}, Landroidx/compose/ui/input/pointer/PointerInputChange;->getId-J3iCeTQ()J

    .line 220
    .line 221
    .line 222
    move-result-wide v7

    .line 223
    move/from16 v16, v14

    .line 224
    .line 225
    iget-wide v13, v11, Lkotlin/jvm/internal/Ref$LongRef;->c:J

    .line 226
    .line 227
    invoke-static {v7, v8, v13, v14}, Landroidx/compose/ui/input/pointer/PointerId;->equals-impl0(JJ)Z

    .line 228
    .line 229
    .line 230
    move-result v7

    .line 231
    if-eqz v7, :cond_6

    .line 232
    .line 233
    goto :goto_4

    .line 234
    :cond_6
    add-int/lit8 v14, v16, 0x1

    .line 235
    .line 236
    move-object/from16 v8, v17

    .line 237
    .line 238
    const/4 v7, 0x1

    .line 239
    goto :goto_3

    .line 240
    :cond_7
    move-object/from16 v17, v8

    .line 241
    .line 242
    move-object/from16 v15, v17

    .line 243
    .line 244
    :goto_4
    move-object v7, v15

    .line 245
    check-cast v7, Landroidx/compose/ui/input/pointer/PointerInputChange;

    .line 246
    .line 247
    if-nez v7, :cond_8

    .line 248
    .line 249
    return-object v17

    .line 250
    :cond_8
    invoke-virtual {v7}, Landroidx/compose/ui/input/pointer/PointerInputChange;->isConsumed()Z

    .line 251
    .line 252
    .line 253
    move-result v8

    .line 254
    if-eqz v8, :cond_9

    .line 255
    .line 256
    return-object v17

    .line 257
    :cond_9
    invoke-static {v7}, Landroidx/compose/ui/input/pointer/PointerEventKt;->changedToUpIgnoreConsumed(Landroidx/compose/ui/input/pointer/PointerInputChange;)Z

    .line 258
    .line 259
    .line 260
    move-result v8

    .line 261
    if-eqz v8, :cond_d

    .line 262
    .line 263
    invoke-virtual {v2}, Landroidx/compose/ui/input/pointer/PointerEvent;->getChanges()Ljava/util/List;

    .line 264
    .line 265
    .line 266
    move-result-object v2

    .line 267
    move-object v7, v2

    .line 268
    check-cast v7, Ljava/util/Collection;

    .line 269
    .line 270
    invoke-interface {v7}, Ljava/util/Collection;->size()I

    .line 271
    .line 272
    .line 273
    move-result v7

    .line 274
    const/4 v13, 0x0

    .line 275
    :goto_5
    if-ge v13, v7, :cond_b

    .line 276
    .line 277
    invoke-interface {v2, v13}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 278
    .line 279
    .line 280
    move-result-object v8

    .line 281
    move-object v10, v8

    .line 282
    check-cast v10, Landroidx/compose/ui/input/pointer/PointerInputChange;

    .line 283
    .line 284
    invoke-virtual {v10}, Landroidx/compose/ui/input/pointer/PointerInputChange;->getPressed()Z

    .line 285
    .line 286
    .line 287
    move-result v10

    .line 288
    if-eqz v10, :cond_a

    .line 289
    .line 290
    goto :goto_6

    .line 291
    :cond_a
    add-int/lit8 v13, v13, 0x1

    .line 292
    .line 293
    goto :goto_5

    .line 294
    :cond_b
    move-object/from16 v8, v17

    .line 295
    .line 296
    :goto_6
    check-cast v8, Landroidx/compose/ui/input/pointer/PointerInputChange;

    .line 297
    .line 298
    if-nez v8, :cond_c

    .line 299
    .line 300
    return-object v17

    .line 301
    :cond_c
    invoke-virtual {v8}, Landroidx/compose/ui/input/pointer/PointerInputChange;->getId-J3iCeTQ()J

    .line 302
    .line 303
    .line 304
    move-result-wide v7

    .line 305
    iput-wide v7, v11, Lkotlin/jvm/internal/Ref$LongRef;->c:J

    .line 306
    .line 307
    goto :goto_7

    .line 308
    :cond_d
    invoke-virtual {v3, v7, v9}, Landroidx/compose/foundation/gestures/TouchSlopDetector;->addPointerInputChange-dBAh8RU(Landroidx/compose/ui/input/pointer/PointerInputChange;F)J

    .line 309
    .line 310
    .line 311
    move-result-wide v12

    .line 312
    const-wide v14, 0x7fffffff7fffffffL

    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    and-long/2addr v14, v12

    .line 318
    const-wide v18, 0x7fc000007fc00000L    # 2.247117487993712E307

    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    cmp-long v2, v14, v18

    .line 324
    .line 325
    if-eqz v2, :cond_f

    .line 326
    .line 327
    const-wide v14, 0xffffffffL

    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    and-long/2addr v12, v14

    .line 333
    long-to-int v2, v12

    .line 334
    invoke-static {v2}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 335
    .line 336
    .line 337
    move-result v2

    .line 338
    invoke-static {v2}, Lxc/a;->b(F)Ljava/lang/Float;

    .line 339
    .line 340
    .line 341
    move-result-object v2

    .line 342
    invoke-interface {v1, v7, v2}, Lhd/p;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 343
    .line 344
    .line 345
    invoke-virtual {v7}, Landroidx/compose/ui/input/pointer/PointerInputChange;->isConsumed()Z

    .line 346
    .line 347
    .line 348
    move-result v2

    .line 349
    if-eqz v2, :cond_e

    .line 350
    .line 351
    return-object v7

    .line 352
    :cond_e
    invoke-virtual {v3}, Landroidx/compose/foundation/gestures/TouchSlopDetector;->reset()V

    .line 353
    .line 354
    .line 355
    :goto_7
    move-object v2, v3

    .line 356
    move-object v3, v5

    .line 357
    move v5, v9

    .line 358
    move-object/from16 v8, v17

    .line 359
    .line 360
    const/4 v7, 0x1

    .line 361
    goto/16 :goto_1

    .line 362
    .line 363
    :cond_f
    sget-object v2, Landroidx/compose/ui/input/pointer/PointerEventPass;->Final:Landroidx/compose/ui/input/pointer/PointerEventPass;

    .line 364
    .line 365
    iput-object v1, v5, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1;->L$0:Ljava/lang/Object;

    .line 366
    .line 367
    iput-object v0, v5, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1;->L$1:Ljava/lang/Object;

    .line 368
    .line 369
    iput-object v11, v5, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1;->L$2:Ljava/lang/Object;

    .line 370
    .line 371
    iput-object v3, v5, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1;->L$3:Ljava/lang/Object;

    .line 372
    .line 373
    iput-object v7, v5, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1;->L$4:Ljava/lang/Object;

    .line 374
    .line 375
    iput v9, v5, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1;->F$0:F

    .line 376
    .line 377
    iput v6, v5, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1;->label:I

    .line 378
    .line 379
    invoke-interface {v0, v2, v5}, Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;->awaitPointerEvent(Landroidx/compose/ui/input/pointer/PointerEventPass;Lvc/c;)Ljava/lang/Object;

    .line 380
    .line 381
    .line 382
    move-result-object v2

    .line 383
    if-ne v2, v4, :cond_10

    .line 384
    .line 385
    :goto_8
    return-object v4

    .line 386
    :cond_10
    move-object v2, v3

    .line 387
    move-object v3, v5

    .line 388
    move v5, v9

    .line 389
    move-object v9, v11

    .line 390
    move-object v11, v1

    .line 391
    move-object v1, v7

    .line 392
    :goto_9
    invoke-virtual {v1}, Landroidx/compose/ui/input/pointer/PointerInputChange;->isConsumed()Z

    .line 393
    .line 394
    .line 395
    move-result v1

    .line 396
    if-eqz v1, :cond_11

    .line 397
    .line 398
    return-object v17

    .line 399
    :cond_11
    move-object v1, v11

    .line 400
    move-object/from16 v8, v17

    .line 401
    .line 402
    const/4 v7, 0x1

    .line 403
    move-object v11, v9

    .line 404
    goto/16 :goto_1
.end method

.method public static final awaitVerticalTouchSlopOrCancellation-jO51t88(Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;JLhd/p;Lvc/c;)Ljava/lang/Object;
    .locals 21
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;",
            "J",
            "Lhd/p;",
            "Lvc/c<",
            "-",
            "Landroidx/compose/ui/input/pointer/PointerInputChange;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    move-wide/from16 v0, p1

    .line 2
    .line 3
    move-object/from16 v2, p4

    .line 4
    .line 5
    instance-of v3, v2, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$1;

    .line 6
    .line 7
    if-eqz v3, :cond_0

    .line 8
    .line 9
    move-object v3, v2

    .line 10
    check-cast v3, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$1;

    .line 11
    .line 12
    iget v4, v3, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$1;->label:I

    .line 13
    .line 14
    const/high16 v5, -0x80000000

    .line 15
    .line 16
    and-int v6, v4, v5

    .line 17
    .line 18
    if-eqz v6, :cond_0

    .line 19
    .line 20
    sub-int/2addr v4, v5

    .line 21
    iput v4, v3, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$1;->label:I

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    new-instance v3, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$1;

    .line 25
    .line 26
    invoke-direct {v3, v2}, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$1;-><init>(Lvc/c;)V

    .line 27
    .line 28
    .line 29
    :goto_0
    iget-object v2, v3, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$1;->result:Ljava/lang/Object;

    .line 30
    .line 31
    invoke-static {}, Lwc/a;->f()Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v4

    .line 35
    iget v5, v3, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$1;->label:I

    .line 36
    .line 37
    const/4 v6, 0x2

    .line 38
    const/4 v7, 0x1

    .line 39
    const/4 v8, 0x0

    .line 40
    if-eqz v5, :cond_3

    .line 41
    .line 42
    if-eq v5, v7, :cond_2

    .line 43
    .line 44
    if-ne v5, v6, :cond_1

    .line 45
    .line 46
    iget v0, v3, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$1;->F$0:F

    .line 47
    .line 48
    iget-object v1, v3, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$1;->L$4:Ljava/lang/Object;

    .line 49
    .line 50
    check-cast v1, Landroidx/compose/ui/input/pointer/PointerInputChange;

    .line 51
    .line 52
    iget-object v5, v3, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$1;->L$3:Ljava/lang/Object;

    .line 53
    .line 54
    check-cast v5, Landroidx/compose/foundation/gestures/TouchSlopDetector;

    .line 55
    .line 56
    iget-object v9, v3, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$1;->L$2:Ljava/lang/Object;

    .line 57
    .line 58
    check-cast v9, Lkotlin/jvm/internal/Ref$LongRef;

    .line 59
    .line 60
    iget-object v10, v3, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$1;->L$1:Ljava/lang/Object;

    .line 61
    .line 62
    check-cast v10, Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;

    .line 63
    .line 64
    iget-object v11, v3, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$1;->L$0:Ljava/lang/Object;

    .line 65
    .line 66
    check-cast v11, Lhd/p;

    .line 67
    .line 68
    invoke-static {v2}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 69
    .line 70
    .line 71
    move-object v2, v5

    .line 72
    move-object/from16 v17, v8

    .line 73
    .line 74
    move-object v5, v3

    .line 75
    move v3, v0

    .line 76
    move-object v0, v10

    .line 77
    goto/16 :goto_9

    .line 78
    .line 79
    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 80
    .line 81
    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    .line 82
    .line 83
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 84
    .line 85
    .line 86
    throw v0

    .line 87
    :cond_2
    iget v0, v3, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$1;->F$0:F

    .line 88
    .line 89
    iget-object v1, v3, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$1;->L$3:Ljava/lang/Object;

    .line 90
    .line 91
    check-cast v1, Landroidx/compose/foundation/gestures/TouchSlopDetector;

    .line 92
    .line 93
    iget-object v5, v3, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$1;->L$2:Ljava/lang/Object;

    .line 94
    .line 95
    check-cast v5, Lkotlin/jvm/internal/Ref$LongRef;

    .line 96
    .line 97
    iget-object v9, v3, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$1;->L$1:Ljava/lang/Object;

    .line 98
    .line 99
    check-cast v9, Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;

    .line 100
    .line 101
    iget-object v10, v3, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$1;->L$0:Ljava/lang/Object;

    .line 102
    .line 103
    check-cast v10, Lhd/p;

    .line 104
    .line 105
    invoke-static {v2}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 106
    .line 107
    .line 108
    move-object v11, v5

    .line 109
    move v5, v0

    .line 110
    move-object v0, v9

    .line 111
    move-object v9, v3

    .line 112
    move-object v3, v1

    .line 113
    move-object v1, v10

    .line 114
    goto :goto_2

    .line 115
    :cond_3
    invoke-static {v2}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 116
    .line 117
    .line 118
    sget-object v2, Landroidx/compose/ui/input/pointer/PointerType;->Companion:Landroidx/compose/ui/input/pointer/PointerType$Companion;

    .line 119
    .line 120
    invoke-virtual {v2}, Landroidx/compose/ui/input/pointer/PointerType$Companion;->getTouch-T8wyACA()I

    .line 121
    .line 122
    .line 123
    move-result v2

    .line 124
    sget-object v5, Landroidx/compose/foundation/gestures/Orientation;->Vertical:Landroidx/compose/foundation/gestures/Orientation;

    .line 125
    .line 126
    sget-object v9, Landroidx/compose/ui/geometry/Offset;->Companion:Landroidx/compose/ui/geometry/Offset$Companion;

    .line 127
    .line 128
    invoke-virtual {v9}, Landroidx/compose/ui/geometry/Offset$Companion;->getZero-F1C5BW0()J

    .line 129
    .line 130
    .line 131
    move-result-wide v9

    .line 132
    invoke-interface/range {p0 .. p0}, Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;->getCurrentEvent()Landroidx/compose/ui/input/pointer/PointerEvent;

    .line 133
    .line 134
    .line 135
    move-result-object v11

    .line 136
    invoke-static {v11, v0, v1}, Landroidx/compose/foundation/gestures/DragGestureDetectorKt;->access$isPointerUp-DmW0f2w(Landroidx/compose/ui/input/pointer/PointerEvent;J)Z

    .line 137
    .line 138
    .line 139
    move-result v11

    .line 140
    if-eqz v11, :cond_4

    .line 141
    .line 142
    return-object v8

    .line 143
    :cond_4
    invoke-interface/range {p0 .. p0}, Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;->getViewConfiguration()Landroidx/compose/ui/platform/ViewConfiguration;

    .line 144
    .line 145
    .line 146
    move-result-object v11

    .line 147
    invoke-static {v11, v2}, Landroidx/compose/foundation/gestures/DragGestureDetectorKt;->pointerSlop-E8SPZFQ(Landroidx/compose/ui/platform/ViewConfiguration;I)F

    .line 148
    .line 149
    .line 150
    move-result v2

    .line 151
    new-instance v11, Lkotlin/jvm/internal/Ref$LongRef;

    .line 152
    .line 153
    invoke-direct {v11}, Lkotlin/jvm/internal/Ref$LongRef;-><init>()V

    .line 154
    .line 155
    .line 156
    iput-wide v0, v11, Lkotlin/jvm/internal/Ref$LongRef;->c:J

    .line 157
    .line 158
    new-instance v0, Landroidx/compose/foundation/gestures/TouchSlopDetector;

    .line 159
    .line 160
    invoke-direct {v0, v5, v9, v10, v8}, Landroidx/compose/foundation/gestures/TouchSlopDetector;-><init>(Landroidx/compose/foundation/gestures/Orientation;JLkotlin/jvm/internal/n;)V

    .line 161
    .line 162
    .line 163
    move-object/from16 v1, p3

    .line 164
    .line 165
    move-object v5, v3

    .line 166
    move v3, v2

    .line 167
    move-object v2, v0

    .line 168
    move-object/from16 v0, p0

    .line 169
    .line 170
    :goto_1
    iput-object v1, v5, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$1;->L$0:Ljava/lang/Object;

    .line 171
    .line 172
    iput-object v0, v5, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$1;->L$1:Ljava/lang/Object;

    .line 173
    .line 174
    iput-object v11, v5, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$1;->L$2:Ljava/lang/Object;

    .line 175
    .line 176
    iput-object v2, v5, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$1;->L$3:Ljava/lang/Object;

    .line 177
    .line 178
    iput-object v8, v5, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$1;->L$4:Ljava/lang/Object;

    .line 179
    .line 180
    iput v3, v5, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$1;->F$0:F

    .line 181
    .line 182
    iput v7, v5, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$1;->label:I

    .line 183
    .line 184
    invoke-static {v0, v8, v5, v7, v8}, Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;->awaitPointerEvent$default(Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;Landroidx/compose/ui/input/pointer/PointerEventPass;Lvc/c;ILjava/lang/Object;)Ljava/lang/Object;

    .line 185
    .line 186
    .line 187
    move-result-object v9

    .line 188
    if-ne v9, v4, :cond_5

    .line 189
    .line 190
    goto/16 :goto_8

    .line 191
    .line 192
    :cond_5
    move/from16 v20, v3

    .line 193
    .line 194
    move-object v3, v2

    .line 195
    move-object v2, v9

    .line 196
    move-object v9, v5

    .line 197
    move/from16 v5, v20

    .line 198
    .line 199
    :goto_2
    check-cast v2, Landroidx/compose/ui/input/pointer/PointerEvent;

    .line 200
    .line 201
    invoke-virtual {v2}, Landroidx/compose/ui/input/pointer/PointerEvent;->getChanges()Ljava/util/List;

    .line 202
    .line 203
    .line 204
    move-result-object v10

    .line 205
    move-object v12, v10

    .line 206
    check-cast v12, Ljava/util/Collection;

    .line 207
    .line 208
    invoke-interface {v12}, Ljava/util/Collection;->size()I

    .line 209
    .line 210
    .line 211
    move-result v12

    .line 212
    const/4 v14, 0x0

    .line 213
    :goto_3
    if-ge v14, v12, :cond_7

    .line 214
    .line 215
    invoke-interface {v10, v14}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 216
    .line 217
    .line 218
    move-result-object v15

    .line 219
    move-object/from16 v16, v15

    .line 220
    .line 221
    check-cast v16, Landroidx/compose/ui/input/pointer/PointerInputChange;

    .line 222
    .line 223
    move-object/from16 v17, v8

    .line 224
    .line 225
    invoke-virtual/range {v16 .. v16}, Landroidx/compose/ui/input/pointer/PointerInputChange;->getId-J3iCeTQ()J

    .line 226
    .line 227
    .line 228
    move-result-wide v7

    .line 229
    move/from16 v16, v14

    .line 230
    .line 231
    iget-wide v13, v11, Lkotlin/jvm/internal/Ref$LongRef;->c:J

    .line 232
    .line 233
    invoke-static {v7, v8, v13, v14}, Landroidx/compose/ui/input/pointer/PointerId;->equals-impl0(JJ)Z

    .line 234
    .line 235
    .line 236
    move-result v7

    .line 237
    if-eqz v7, :cond_6

    .line 238
    .line 239
    goto :goto_4

    .line 240
    :cond_6
    add-int/lit8 v14, v16, 0x1

    .line 241
    .line 242
    move-object/from16 v8, v17

    .line 243
    .line 244
    const/4 v7, 0x1

    .line 245
    goto :goto_3

    .line 246
    :cond_7
    move-object/from16 v17, v8

    .line 247
    .line 248
    move-object/from16 v15, v17

    .line 249
    .line 250
    :goto_4
    move-object v7, v15

    .line 251
    check-cast v7, Landroidx/compose/ui/input/pointer/PointerInputChange;

    .line 252
    .line 253
    if-nez v7, :cond_8

    .line 254
    .line 255
    return-object v17

    .line 256
    :cond_8
    invoke-virtual {v7}, Landroidx/compose/ui/input/pointer/PointerInputChange;->isConsumed()Z

    .line 257
    .line 258
    .line 259
    move-result v8

    .line 260
    if-eqz v8, :cond_9

    .line 261
    .line 262
    return-object v17

    .line 263
    :cond_9
    invoke-static {v7}, Landroidx/compose/ui/input/pointer/PointerEventKt;->changedToUpIgnoreConsumed(Landroidx/compose/ui/input/pointer/PointerInputChange;)Z

    .line 264
    .line 265
    .line 266
    move-result v8

    .line 267
    if-eqz v8, :cond_d

    .line 268
    .line 269
    invoke-virtual {v2}, Landroidx/compose/ui/input/pointer/PointerEvent;->getChanges()Ljava/util/List;

    .line 270
    .line 271
    .line 272
    move-result-object v2

    .line 273
    move-object v7, v2

    .line 274
    check-cast v7, Ljava/util/Collection;

    .line 275
    .line 276
    invoke-interface {v7}, Ljava/util/Collection;->size()I

    .line 277
    .line 278
    .line 279
    move-result v7

    .line 280
    const/4 v13, 0x0

    .line 281
    :goto_5
    if-ge v13, v7, :cond_b

    .line 282
    .line 283
    invoke-interface {v2, v13}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 284
    .line 285
    .line 286
    move-result-object v8

    .line 287
    move-object v10, v8

    .line 288
    check-cast v10, Landroidx/compose/ui/input/pointer/PointerInputChange;

    .line 289
    .line 290
    invoke-virtual {v10}, Landroidx/compose/ui/input/pointer/PointerInputChange;->getPressed()Z

    .line 291
    .line 292
    .line 293
    move-result v10

    .line 294
    if-eqz v10, :cond_a

    .line 295
    .line 296
    goto :goto_6

    .line 297
    :cond_a
    add-int/lit8 v13, v13, 0x1

    .line 298
    .line 299
    goto :goto_5

    .line 300
    :cond_b
    move-object/from16 v8, v17

    .line 301
    .line 302
    :goto_6
    check-cast v8, Landroidx/compose/ui/input/pointer/PointerInputChange;

    .line 303
    .line 304
    if-nez v8, :cond_c

    .line 305
    .line 306
    return-object v17

    .line 307
    :cond_c
    invoke-virtual {v8}, Landroidx/compose/ui/input/pointer/PointerInputChange;->getId-J3iCeTQ()J

    .line 308
    .line 309
    .line 310
    move-result-wide v7

    .line 311
    iput-wide v7, v11, Lkotlin/jvm/internal/Ref$LongRef;->c:J

    .line 312
    .line 313
    goto :goto_7

    .line 314
    :cond_d
    invoke-virtual {v3, v7, v5}, Landroidx/compose/foundation/gestures/TouchSlopDetector;->addPointerInputChange-dBAh8RU(Landroidx/compose/ui/input/pointer/PointerInputChange;F)J

    .line 315
    .line 316
    .line 317
    move-result-wide v12

    .line 318
    const-wide v14, 0x7fffffff7fffffffL

    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    and-long/2addr v14, v12

    .line 324
    const-wide v18, 0x7fc000007fc00000L    # 2.247117487993712E307

    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    cmp-long v2, v14, v18

    .line 330
    .line 331
    if-eqz v2, :cond_f

    .line 332
    .line 333
    const-wide v14, 0xffffffffL

    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    and-long/2addr v12, v14

    .line 339
    long-to-int v2, v12

    .line 340
    invoke-static {v2}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 341
    .line 342
    .line 343
    move-result v2

    .line 344
    invoke-static {v2}, Lxc/a;->b(F)Ljava/lang/Float;

    .line 345
    .line 346
    .line 347
    move-result-object v2

    .line 348
    invoke-interface {v1, v7, v2}, Lhd/p;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 349
    .line 350
    .line 351
    invoke-virtual {v7}, Landroidx/compose/ui/input/pointer/PointerInputChange;->isConsumed()Z

    .line 352
    .line 353
    .line 354
    move-result v2

    .line 355
    if-eqz v2, :cond_e

    .line 356
    .line 357
    return-object v7

    .line 358
    :cond_e
    invoke-virtual {v3}, Landroidx/compose/foundation/gestures/TouchSlopDetector;->reset()V

    .line 359
    .line 360
    .line 361
    :goto_7
    move-object v2, v3

    .line 362
    move v3, v5

    .line 363
    move-object v5, v9

    .line 364
    move-object/from16 v8, v17

    .line 365
    .line 366
    const/4 v7, 0x1

    .line 367
    goto/16 :goto_1

    .line 368
    .line 369
    :cond_f
    sget-object v2, Landroidx/compose/ui/input/pointer/PointerEventPass;->Final:Landroidx/compose/ui/input/pointer/PointerEventPass;

    .line 370
    .line 371
    iput-object v1, v9, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$1;->L$0:Ljava/lang/Object;

    .line 372
    .line 373
    iput-object v0, v9, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$1;->L$1:Ljava/lang/Object;

    .line 374
    .line 375
    iput-object v11, v9, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$1;->L$2:Ljava/lang/Object;

    .line 376
    .line 377
    iput-object v3, v9, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$1;->L$3:Ljava/lang/Object;

    .line 378
    .line 379
    iput-object v7, v9, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$1;->L$4:Ljava/lang/Object;

    .line 380
    .line 381
    iput v5, v9, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$1;->F$0:F

    .line 382
    .line 383
    iput v6, v9, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$1;->label:I

    .line 384
    .line 385
    invoke-interface {v0, v2, v9}, Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;->awaitPointerEvent(Landroidx/compose/ui/input/pointer/PointerEventPass;Lvc/c;)Ljava/lang/Object;

    .line 386
    .line 387
    .line 388
    move-result-object v2

    .line 389
    if-ne v2, v4, :cond_10

    .line 390
    .line 391
    :goto_8
    return-object v4

    .line 392
    :cond_10
    move-object v2, v3

    .line 393
    move v3, v5

    .line 394
    move-object v5, v9

    .line 395
    move-object v9, v11

    .line 396
    move-object v11, v1

    .line 397
    move-object v1, v7

    .line 398
    :goto_9
    invoke-virtual {v1}, Landroidx/compose/ui/input/pointer/PointerInputChange;->isConsumed()Z

    .line 399
    .line 400
    .line 401
    move-result v1

    .line 402
    if-eqz v1, :cond_11

    .line 403
    .line 404
    return-object v17

    .line 405
    :cond_11
    move-object v1, v11

    .line 406
    move-object/from16 v8, v17

    .line 407
    .line 408
    const/4 v7, 0x1

    .line 409
    move-object v11, v9

    .line 410
    goto/16 :goto_1
.end method

.method public static final detectDragGestures(Landroidx/compose/ui/input/pointer/PointerInputScope;Lhd/l;Lhd/a;Lhd/a;Lhd/p;Lvc/c;)Ljava/lang/Object;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/ui/input/pointer/PointerInputScope;",
            "Lhd/l;",
            "Lhd/a;",
            "Lhd/a;",
            "Lhd/p;",
            "Lvc/c<",
            "-",
            "Lqc/q;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    new-instance v1, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$detectDragGestures$5;

    invoke-direct {v1, p1}, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$detectDragGestures$5;-><init>(Lhd/l;)V

    new-instance v2, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$detectDragGestures$6;

    invoke-direct {v2, p2}, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$detectDragGestures$6;-><init>(Lhd/a;)V

    sget-object v4, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$detectDragGestures$7;->INSTANCE:Landroidx/compose/foundation/gestures/DragGestureDetectorKt$detectDragGestures$7;

    const/4 v5, 0x0

    move-object v0, p0

    move-object v3, p3

    move-object v6, p4

    move-object v7, p5

    invoke-static/range {v0 .. v7}, Landroidx/compose/foundation/gestures/DragGestureDetectorKt;->detectDragGestures(Landroidx/compose/ui/input/pointer/PointerInputScope;Lhd/q;Lhd/l;Lhd/a;Lhd/a;Landroidx/compose/foundation/gestures/Orientation;Lhd/p;Lvc/c;)Ljava/lang/Object;

    move-result-object p0

    invoke-static {}, Lwc/a;->f()Ljava/lang/Object;

    move-result-object p1

    if-ne p0, p1, :cond_0

    return-object p0

    :cond_0
    sget-object p0, Lqc/q;->a:Lqc/q;

    return-object p0
.end method

.method public static final detectDragGestures(Landroidx/compose/ui/input/pointer/PointerInputScope;Lhd/q;Lhd/l;Lhd/a;Lhd/a;Landroidx/compose/foundation/gestures/Orientation;Lhd/p;Lvc/c;)Ljava/lang/Object;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/ui/input/pointer/PointerInputScope;",
            "Lhd/q;",
            "Lhd/l;",
            "Lhd/a;",
            "Lhd/a;",
            "Landroidx/compose/foundation/gestures/Orientation;",
            "Lhd/p;",
            "Lvc/c<",
            "-",
            "Lqc/q;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 2
    new-instance v2, Lkotlin/jvm/internal/Ref$LongRef;

    invoke-direct {v2}, Lkotlin/jvm/internal/Ref$LongRef;-><init>()V

    .line 3
    new-instance v0, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$detectDragGestures$9;

    const/4 v8, 0x0

    move-object v4, p1

    move-object v7, p2

    move-object v6, p3

    move-object v1, p4

    move-object v3, p5

    move-object v5, p6

    invoke-direct/range {v0 .. v8}, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$detectDragGestures$9;-><init>(Lhd/a;Lkotlin/jvm/internal/Ref$LongRef;Landroidx/compose/foundation/gestures/Orientation;Lhd/q;Lhd/p;Lhd/a;Lhd/l;Lvc/c;)V

    move-object/from16 p1, p7

    invoke-static {p0, v0, p1}, Landroidx/compose/foundation/gestures/ForEachGestureKt;->awaitEachGesture(Landroidx/compose/ui/input/pointer/PointerInputScope;Lhd/p;Lvc/c;)Ljava/lang/Object;

    move-result-object p0

    invoke-static {}, Lwc/a;->f()Ljava/lang/Object;

    move-result-object p1

    if-ne p0, p1, :cond_0

    return-object p0

    :cond_0
    sget-object p0, Lqc/q;->a:Lqc/q;

    return-object p0
.end method

.method public static synthetic detectDragGestures$default(Landroidx/compose/ui/input/pointer/PointerInputScope;Lhd/l;Lhd/a;Lhd/a;Lhd/p;Lvc/c;ILjava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    and-int/lit8 p7, p6, 0x1

    .line 2
    .line 3
    if-eqz p7, :cond_0

    .line 4
    .line 5
    sget-object p1, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$detectDragGestures$2;->INSTANCE:Landroidx/compose/foundation/gestures/DragGestureDetectorKt$detectDragGestures$2;

    .line 6
    .line 7
    :cond_0
    and-int/lit8 p7, p6, 0x2

    .line 8
    .line 9
    if-eqz p7, :cond_1

    .line 10
    .line 11
    sget-object p2, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$detectDragGestures$3;->INSTANCE:Landroidx/compose/foundation/gestures/DragGestureDetectorKt$detectDragGestures$3;

    .line 12
    .line 13
    :cond_1
    and-int/lit8 p6, p6, 0x4

    .line 14
    .line 15
    if-eqz p6, :cond_2

    .line 16
    .line 17
    sget-object p3, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$detectDragGestures$4;->INSTANCE:Landroidx/compose/foundation/gestures/DragGestureDetectorKt$detectDragGestures$4;

    .line 18
    .line 19
    :cond_2
    move-object p6, p4

    .line 20
    move-object p7, p5

    .line 21
    move-object p4, p2

    .line 22
    move-object p5, p3

    .line 23
    move-object p2, p0

    .line 24
    move-object p3, p1

    .line 25
    invoke-static/range {p2 .. p7}, Landroidx/compose/foundation/gestures/DragGestureDetectorKt;->detectDragGestures(Landroidx/compose/ui/input/pointer/PointerInputScope;Lhd/l;Lhd/a;Lhd/a;Lhd/p;Lvc/c;)Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object p0

    .line 29
    return-object p0
.end method

.method public static final detectDragGesturesAfterLongPress(Landroidx/compose/ui/input/pointer/PointerInputScope;Lhd/l;Lhd/a;Lhd/a;Lhd/p;Lvc/c;)Ljava/lang/Object;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/ui/input/pointer/PointerInputScope;",
            "Lhd/l;",
            "Lhd/a;",
            "Lhd/a;",
            "Lhd/p;",
            "Lvc/c<",
            "-",
            "Lqc/q;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    new-instance v0, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$detectDragGesturesAfterLongPress$5;

    .line 2
    .line 3
    const/4 v5, 0x0

    .line 4
    move-object v1, p1

    .line 5
    move-object v2, p2

    .line 6
    move-object v3, p3

    .line 7
    move-object v4, p4

    .line 8
    invoke-direct/range {v0 .. v5}, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$detectDragGesturesAfterLongPress$5;-><init>(Lhd/l;Lhd/a;Lhd/a;Lhd/p;Lvc/c;)V

    .line 9
    .line 10
    .line 11
    invoke-static {p0, v0, p5}, Landroidx/compose/foundation/gestures/ForEachGestureKt;->awaitEachGesture(Landroidx/compose/ui/input/pointer/PointerInputScope;Lhd/p;Lvc/c;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    invoke-static {}, Lwc/a;->f()Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    if-ne p0, p1, :cond_0

    .line 20
    .line 21
    return-object p0

    .line 22
    :cond_0
    sget-object p0, Lqc/q;->a:Lqc/q;

    .line 23
    .line 24
    return-object p0
.end method

.method public static synthetic detectDragGesturesAfterLongPress$default(Landroidx/compose/ui/input/pointer/PointerInputScope;Lhd/l;Lhd/a;Lhd/a;Lhd/p;Lvc/c;ILjava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    and-int/lit8 p7, p6, 0x1

    .line 2
    .line 3
    if-eqz p7, :cond_0

    .line 4
    .line 5
    sget-object p1, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$detectDragGesturesAfterLongPress$2;->INSTANCE:Landroidx/compose/foundation/gestures/DragGestureDetectorKt$detectDragGesturesAfterLongPress$2;

    .line 6
    .line 7
    :cond_0
    and-int/lit8 p7, p6, 0x2

    .line 8
    .line 9
    if-eqz p7, :cond_1

    .line 10
    .line 11
    sget-object p2, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$detectDragGesturesAfterLongPress$3;->INSTANCE:Landroidx/compose/foundation/gestures/DragGestureDetectorKt$detectDragGesturesAfterLongPress$3;

    .line 12
    .line 13
    :cond_1
    and-int/lit8 p6, p6, 0x4

    .line 14
    .line 15
    if-eqz p6, :cond_2

    .line 16
    .line 17
    sget-object p3, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$detectDragGesturesAfterLongPress$4;->INSTANCE:Landroidx/compose/foundation/gestures/DragGestureDetectorKt$detectDragGesturesAfterLongPress$4;

    .line 18
    .line 19
    :cond_2
    move-object p6, p4

    .line 20
    move-object p7, p5

    .line 21
    move-object p4, p2

    .line 22
    move-object p5, p3

    .line 23
    move-object p2, p0

    .line 24
    move-object p3, p1

    .line 25
    invoke-static/range {p2 .. p7}, Landroidx/compose/foundation/gestures/DragGestureDetectorKt;->detectDragGesturesAfterLongPress(Landroidx/compose/ui/input/pointer/PointerInputScope;Lhd/l;Lhd/a;Lhd/a;Lhd/p;Lvc/c;)Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object p0

    .line 29
    return-object p0
.end method

.method public static final detectHorizontalDragGestures(Landroidx/compose/ui/input/pointer/PointerInputScope;Lhd/l;Lhd/a;Lhd/a;Lhd/p;Lvc/c;)Ljava/lang/Object;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/ui/input/pointer/PointerInputScope;",
            "Lhd/l;",
            "Lhd/a;",
            "Lhd/a;",
            "Lhd/p;",
            "Lvc/c<",
            "-",
            "Lqc/q;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    new-instance v0, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$detectHorizontalDragGestures$5;

    .line 2
    .line 3
    const/4 v5, 0x0

    .line 4
    move-object v1, p1

    .line 5
    move-object v3, p2

    .line 6
    move-object v4, p3

    .line 7
    move-object v2, p4

    .line 8
    invoke-direct/range {v0 .. v5}, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$detectHorizontalDragGestures$5;-><init>(Lhd/l;Lhd/p;Lhd/a;Lhd/a;Lvc/c;)V

    .line 9
    .line 10
    .line 11
    invoke-static {p0, v0, p5}, Landroidx/compose/foundation/gestures/ForEachGestureKt;->awaitEachGesture(Landroidx/compose/ui/input/pointer/PointerInputScope;Lhd/p;Lvc/c;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    invoke-static {}, Lwc/a;->f()Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    if-ne p0, p1, :cond_0

    .line 20
    .line 21
    return-object p0

    .line 22
    :cond_0
    sget-object p0, Lqc/q;->a:Lqc/q;

    .line 23
    .line 24
    return-object p0
.end method

.method public static synthetic detectHorizontalDragGestures$default(Landroidx/compose/ui/input/pointer/PointerInputScope;Lhd/l;Lhd/a;Lhd/a;Lhd/p;Lvc/c;ILjava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    and-int/lit8 p7, p6, 0x1

    .line 2
    .line 3
    if-eqz p7, :cond_0

    .line 4
    .line 5
    sget-object p1, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$detectHorizontalDragGestures$2;->INSTANCE:Landroidx/compose/foundation/gestures/DragGestureDetectorKt$detectHorizontalDragGestures$2;

    .line 6
    .line 7
    :cond_0
    and-int/lit8 p7, p6, 0x2

    .line 8
    .line 9
    if-eqz p7, :cond_1

    .line 10
    .line 11
    sget-object p2, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$detectHorizontalDragGestures$3;->INSTANCE:Landroidx/compose/foundation/gestures/DragGestureDetectorKt$detectHorizontalDragGestures$3;

    .line 12
    .line 13
    :cond_1
    and-int/lit8 p6, p6, 0x4

    .line 14
    .line 15
    if-eqz p6, :cond_2

    .line 16
    .line 17
    sget-object p3, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$detectHorizontalDragGestures$4;->INSTANCE:Landroidx/compose/foundation/gestures/DragGestureDetectorKt$detectHorizontalDragGestures$4;

    .line 18
    .line 19
    :cond_2
    move-object p6, p4

    .line 20
    move-object p7, p5

    .line 21
    move-object p4, p2

    .line 22
    move-object p5, p3

    .line 23
    move-object p2, p0

    .line 24
    move-object p3, p1

    .line 25
    invoke-static/range {p2 .. p7}, Landroidx/compose/foundation/gestures/DragGestureDetectorKt;->detectHorizontalDragGestures(Landroidx/compose/ui/input/pointer/PointerInputScope;Lhd/l;Lhd/a;Lhd/a;Lhd/p;Lvc/c;)Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object p0

    .line 29
    return-object p0
.end method

.method public static final detectVerticalDragGestures(Landroidx/compose/ui/input/pointer/PointerInputScope;Lhd/l;Lhd/a;Lhd/a;Lhd/p;Lvc/c;)Ljava/lang/Object;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/ui/input/pointer/PointerInputScope;",
            "Lhd/l;",
            "Lhd/a;",
            "Lhd/a;",
            "Lhd/p;",
            "Lvc/c<",
            "-",
            "Lqc/q;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    new-instance v0, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$detectVerticalDragGestures$5;

    .line 2
    .line 3
    const/4 v5, 0x0

    .line 4
    move-object v1, p1

    .line 5
    move-object v3, p2

    .line 6
    move-object v4, p3

    .line 7
    move-object v2, p4

    .line 8
    invoke-direct/range {v0 .. v5}, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$detectVerticalDragGestures$5;-><init>(Lhd/l;Lhd/p;Lhd/a;Lhd/a;Lvc/c;)V

    .line 9
    .line 10
    .line 11
    invoke-static {p0, v0, p5}, Landroidx/compose/foundation/gestures/ForEachGestureKt;->awaitEachGesture(Landroidx/compose/ui/input/pointer/PointerInputScope;Lhd/p;Lvc/c;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    invoke-static {}, Lwc/a;->f()Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    if-ne p0, p1, :cond_0

    .line 20
    .line 21
    return-object p0

    .line 22
    :cond_0
    sget-object p0, Lqc/q;->a:Lqc/q;

    .line 23
    .line 24
    return-object p0
.end method

.method public static synthetic detectVerticalDragGestures$default(Landroidx/compose/ui/input/pointer/PointerInputScope;Lhd/l;Lhd/a;Lhd/a;Lhd/p;Lvc/c;ILjava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    and-int/lit8 p7, p6, 0x1

    .line 2
    .line 3
    if-eqz p7, :cond_0

    .line 4
    .line 5
    sget-object p1, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$detectVerticalDragGestures$2;->INSTANCE:Landroidx/compose/foundation/gestures/DragGestureDetectorKt$detectVerticalDragGestures$2;

    .line 6
    .line 7
    :cond_0
    and-int/lit8 p7, p6, 0x2

    .line 8
    .line 9
    if-eqz p7, :cond_1

    .line 10
    .line 11
    sget-object p2, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$detectVerticalDragGestures$3;->INSTANCE:Landroidx/compose/foundation/gestures/DragGestureDetectorKt$detectVerticalDragGestures$3;

    .line 12
    .line 13
    :cond_1
    and-int/lit8 p6, p6, 0x4

    .line 14
    .line 15
    if-eqz p6, :cond_2

    .line 16
    .line 17
    sget-object p3, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$detectVerticalDragGestures$4;->INSTANCE:Landroidx/compose/foundation/gestures/DragGestureDetectorKt$detectVerticalDragGestures$4;

    .line 18
    .line 19
    :cond_2
    move-object p6, p4

    .line 20
    move-object p7, p5

    .line 21
    move-object p4, p2

    .line 22
    move-object p5, p3

    .line 23
    move-object p2, p0

    .line 24
    move-object p3, p1

    .line 25
    invoke-static/range {p2 .. p7}, Landroidx/compose/foundation/gestures/DragGestureDetectorKt;->detectVerticalDragGestures(Landroidx/compose/ui/input/pointer/PointerInputScope;Lhd/l;Lhd/a;Lhd/a;Lhd/p;Lvc/c;)Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object p0

    .line 29
    return-object p0
.end method

.method public static final drag-VnAYq1g(Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;JLhd/l;Landroidx/compose/foundation/gestures/Orientation;Lhd/l;Lvc/c;)Ljava/lang/Object;
    .locals 19
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;",
            "J",
            "Lhd/l;",
            "Landroidx/compose/foundation/gestures/Orientation;",
            "Lhd/l;",
            "Lvc/c<",
            "-",
            "Landroidx/compose/ui/input/pointer/PointerInputChange;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    move-object/from16 v0, p6

    .line 2
    .line 3
    instance-of v1, v0, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$drag$2;

    .line 4
    .line 5
    if-eqz v1, :cond_0

    .line 6
    .line 7
    move-object v1, v0

    .line 8
    check-cast v1, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$drag$2;

    .line 9
    .line 10
    iget v2, v1, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$drag$2;->label:I

    .line 11
    .line 12
    const/high16 v3, -0x80000000

    .line 13
    .line 14
    and-int v4, v2, v3

    .line 15
    .line 16
    if-eqz v4, :cond_0

    .line 17
    .line 18
    sub-int/2addr v2, v3

    .line 19
    iput v2, v1, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$drag$2;->label:I

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    new-instance v1, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$drag$2;

    .line 23
    .line 24
    invoke-direct {v1, v0}, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$drag$2;-><init>(Lvc/c;)V

    .line 25
    .line 26
    .line 27
    :goto_0
    iget-object v0, v1, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$drag$2;->result:Ljava/lang/Object;

    .line 28
    .line 29
    invoke-static {}, Lwc/a;->f()Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object v2

    .line 33
    iget v3, v1, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$drag$2;->label:I

    .line 34
    .line 35
    const/4 v4, 0x1

    .line 36
    const/4 v5, 0x0

    .line 37
    if-eqz v3, :cond_2

    .line 38
    .line 39
    if-ne v3, v4, :cond_1

    .line 40
    .line 41
    iget-object v3, v1, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$drag$2;->L$5:Ljava/lang/Object;

    .line 42
    .line 43
    check-cast v3, Lkotlin/jvm/internal/Ref$LongRef;

    .line 44
    .line 45
    iget-object v6, v1, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$drag$2;->L$4:Ljava/lang/Object;

    .line 46
    .line 47
    check-cast v6, Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;

    .line 48
    .line 49
    iget-object v7, v1, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$drag$2;->L$3:Ljava/lang/Object;

    .line 50
    .line 51
    check-cast v7, Lhd/l;

    .line 52
    .line 53
    iget-object v8, v1, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$drag$2;->L$2:Ljava/lang/Object;

    .line 54
    .line 55
    check-cast v8, Landroidx/compose/foundation/gestures/Orientation;

    .line 56
    .line 57
    iget-object v9, v1, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$drag$2;->L$1:Ljava/lang/Object;

    .line 58
    .line 59
    check-cast v9, Lhd/l;

    .line 60
    .line 61
    iget-object v10, v1, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$drag$2;->L$0:Ljava/lang/Object;

    .line 62
    .line 63
    check-cast v10, Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;

    .line 64
    .line 65
    invoke-static {v0}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 66
    .line 67
    .line 68
    move-object/from16 v18, v9

    .line 69
    .line 70
    move-object v9, v1

    .line 71
    move-object/from16 v1, v18

    .line 72
    .line 73
    move-object/from16 v18, v7

    .line 74
    .line 75
    move-object v7, v3

    .line 76
    move-object v3, v8

    .line 77
    move-object/from16 v8, v18

    .line 78
    .line 79
    goto :goto_3

    .line 80
    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 81
    .line 82
    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    .line 83
    .line 84
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 85
    .line 86
    .line 87
    throw v0

    .line 88
    :cond_2
    invoke-static {v0}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 89
    .line 90
    .line 91
    invoke-interface/range {p0 .. p0}, Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;->getCurrentEvent()Landroidx/compose/ui/input/pointer/PointerEvent;

    .line 92
    .line 93
    .line 94
    move-result-object v0

    .line 95
    move-wide/from16 v6, p1

    .line 96
    .line 97
    invoke-static {v0, v6, v7}, Landroidx/compose/foundation/gestures/DragGestureDetectorKt;->access$isPointerUp-DmW0f2w(Landroidx/compose/ui/input/pointer/PointerEvent;J)Z

    .line 98
    .line 99
    .line 100
    move-result v0

    .line 101
    if-eqz v0, :cond_3

    .line 102
    .line 103
    return-object v5

    .line 104
    :cond_3
    move-object/from16 v0, p0

    .line 105
    .line 106
    move-object/from16 v3, p4

    .line 107
    .line 108
    move-object/from16 v8, p5

    .line 109
    .line 110
    move-object v9, v1

    .line 111
    move-object/from16 v1, p3

    .line 112
    .line 113
    :goto_1
    new-instance v10, Lkotlin/jvm/internal/Ref$LongRef;

    .line 114
    .line 115
    invoke-direct {v10}, Lkotlin/jvm/internal/Ref$LongRef;-><init>()V

    .line 116
    .line 117
    .line 118
    iput-wide v6, v10, Lkotlin/jvm/internal/Ref$LongRef;->c:J

    .line 119
    .line 120
    move-object v6, v0

    .line 121
    :goto_2
    iput-object v0, v9, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$drag$2;->L$0:Ljava/lang/Object;

    .line 122
    .line 123
    iput-object v1, v9, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$drag$2;->L$1:Ljava/lang/Object;

    .line 124
    .line 125
    iput-object v3, v9, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$drag$2;->L$2:Ljava/lang/Object;

    .line 126
    .line 127
    iput-object v8, v9, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$drag$2;->L$3:Ljava/lang/Object;

    .line 128
    .line 129
    iput-object v6, v9, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$drag$2;->L$4:Ljava/lang/Object;

    .line 130
    .line 131
    iput-object v10, v9, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$drag$2;->L$5:Ljava/lang/Object;

    .line 132
    .line 133
    iput v4, v9, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$drag$2;->label:I

    .line 134
    .line 135
    invoke-static {v6, v5, v9, v4, v5}, Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;->awaitPointerEvent$default(Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;Landroidx/compose/ui/input/pointer/PointerEventPass;Lvc/c;ILjava/lang/Object;)Ljava/lang/Object;

    .line 136
    .line 137
    .line 138
    move-result-object v7

    .line 139
    if-ne v7, v2, :cond_4

    .line 140
    .line 141
    return-object v2

    .line 142
    :cond_4
    move-object/from16 v18, v10

    .line 143
    .line 144
    move-object v10, v0

    .line 145
    move-object v0, v7

    .line 146
    move-object/from16 v7, v18

    .line 147
    .line 148
    :goto_3
    check-cast v0, Landroidx/compose/ui/input/pointer/PointerEvent;

    .line 149
    .line 150
    invoke-virtual {v0}, Landroidx/compose/ui/input/pointer/PointerEvent;->getChanges()Ljava/util/List;

    .line 151
    .line 152
    .line 153
    move-result-object v11

    .line 154
    move-object v12, v11

    .line 155
    check-cast v12, Ljava/util/Collection;

    .line 156
    .line 157
    invoke-interface {v12}, Ljava/util/Collection;->size()I

    .line 158
    .line 159
    .line 160
    move-result v12

    .line 161
    const/4 v14, 0x0

    .line 162
    :goto_4
    if-ge v14, v12, :cond_6

    .line 163
    .line 164
    invoke-interface {v11, v14}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 165
    .line 166
    .line 167
    move-result-object v15

    .line 168
    move-object/from16 v16, v15

    .line 169
    .line 170
    check-cast v16, Landroidx/compose/ui/input/pointer/PointerInputChange;

    .line 171
    .line 172
    move-object/from16 v17, v5

    .line 173
    .line 174
    invoke-virtual/range {v16 .. v16}, Landroidx/compose/ui/input/pointer/PointerInputChange;->getId-J3iCeTQ()J

    .line 175
    .line 176
    .line 177
    move-result-wide v4

    .line 178
    move/from16 v16, v14

    .line 179
    .line 180
    iget-wide v13, v7, Lkotlin/jvm/internal/Ref$LongRef;->c:J

    .line 181
    .line 182
    invoke-static {v4, v5, v13, v14}, Landroidx/compose/ui/input/pointer/PointerId;->equals-impl0(JJ)Z

    .line 183
    .line 184
    .line 185
    move-result v4

    .line 186
    if-eqz v4, :cond_5

    .line 187
    .line 188
    goto :goto_5

    .line 189
    :cond_5
    add-int/lit8 v14, v16, 0x1

    .line 190
    .line 191
    move-object/from16 v5, v17

    .line 192
    .line 193
    const/4 v4, 0x1

    .line 194
    goto :goto_4

    .line 195
    :cond_6
    move-object/from16 v17, v5

    .line 196
    .line 197
    move-object/from16 v15, v17

    .line 198
    .line 199
    :goto_5
    check-cast v15, Landroidx/compose/ui/input/pointer/PointerInputChange;

    .line 200
    .line 201
    if-nez v15, :cond_7

    .line 202
    .line 203
    move-object/from16 v15, v17

    .line 204
    .line 205
    goto :goto_a

    .line 206
    :cond_7
    invoke-static {v15}, Landroidx/compose/ui/input/pointer/PointerEventKt;->changedToUpIgnoreConsumed(Landroidx/compose/ui/input/pointer/PointerInputChange;)Z

    .line 207
    .line 208
    .line 209
    move-result v4

    .line 210
    if-eqz v4, :cond_b

    .line 211
    .line 212
    invoke-virtual {v0}, Landroidx/compose/ui/input/pointer/PointerEvent;->getChanges()Ljava/util/List;

    .line 213
    .line 214
    .line 215
    move-result-object v0

    .line 216
    move-object v4, v0

    .line 217
    check-cast v4, Ljava/util/Collection;

    .line 218
    .line 219
    invoke-interface {v4}, Ljava/util/Collection;->size()I

    .line 220
    .line 221
    .line 222
    move-result v4

    .line 223
    const/4 v13, 0x0

    .line 224
    :goto_6
    if-ge v13, v4, :cond_9

    .line 225
    .line 226
    invoke-interface {v0, v13}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 227
    .line 228
    .line 229
    move-result-object v5

    .line 230
    move-object v11, v5

    .line 231
    check-cast v11, Landroidx/compose/ui/input/pointer/PointerInputChange;

    .line 232
    .line 233
    invoke-virtual {v11}, Landroidx/compose/ui/input/pointer/PointerInputChange;->getPressed()Z

    .line 234
    .line 235
    .line 236
    move-result v11

    .line 237
    if-eqz v11, :cond_8

    .line 238
    .line 239
    goto :goto_7

    .line 240
    :cond_8
    add-int/lit8 v13, v13, 0x1

    .line 241
    .line 242
    goto :goto_6

    .line 243
    :cond_9
    move-object/from16 v5, v17

    .line 244
    .line 245
    :goto_7
    check-cast v5, Landroidx/compose/ui/input/pointer/PointerInputChange;

    .line 246
    .line 247
    if-nez v5, :cond_a

    .line 248
    .line 249
    goto :goto_a

    .line 250
    :cond_a
    invoke-virtual {v5}, Landroidx/compose/ui/input/pointer/PointerInputChange;->getId-J3iCeTQ()J

    .line 251
    .line 252
    .line 253
    move-result-wide v4

    .line 254
    iput-wide v4, v7, Lkotlin/jvm/internal/Ref$LongRef;->c:J

    .line 255
    .line 256
    goto :goto_b

    .line 257
    :cond_b
    invoke-static {v15}, Landroidx/compose/ui/input/pointer/PointerEventKt;->positionChangeIgnoreConsumed(Landroidx/compose/ui/input/pointer/PointerInputChange;)J

    .line 258
    .line 259
    .line 260
    move-result-wide v4

    .line 261
    if-nez v3, :cond_c

    .line 262
    .line 263
    invoke-static {v4, v5}, Landroidx/compose/ui/geometry/Offset;->getDistance-impl(J)F

    .line 264
    .line 265
    .line 266
    move-result v0

    .line 267
    goto :goto_8

    .line 268
    :cond_c
    sget-object v0, Landroidx/compose/foundation/gestures/Orientation;->Vertical:Landroidx/compose/foundation/gestures/Orientation;

    .line 269
    .line 270
    if-ne v3, v0, :cond_d

    .line 271
    .line 272
    const-wide v11, 0xffffffffL

    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    and-long/2addr v4, v11

    .line 278
    long-to-int v0, v4

    .line 279
    invoke-static {v0}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 280
    .line 281
    .line 282
    move-result v0

    .line 283
    goto :goto_8

    .line 284
    :cond_d
    const/16 v0, 0x20

    .line 285
    .line 286
    shr-long/2addr v4, v0

    .line 287
    long-to-int v0, v4

    .line 288
    invoke-static {v0}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 289
    .line 290
    .line 291
    move-result v0

    .line 292
    :goto_8
    const/4 v4, 0x0

    .line 293
    cmpg-float v0, v0, v4

    .line 294
    .line 295
    if-nez v0, :cond_e

    .line 296
    .line 297
    const/4 v13, 0x1

    .line 298
    goto :goto_9

    .line 299
    :cond_e
    const/4 v13, 0x0

    .line 300
    :goto_9
    if-nez v13, :cond_12

    .line 301
    .line 302
    :goto_a
    if-nez v15, :cond_f

    .line 303
    .line 304
    return-object v17

    .line 305
    :cond_f
    invoke-interface {v8, v15}, Lhd/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 306
    .line 307
    .line 308
    move-result-object v0

    .line 309
    check-cast v0, Ljava/lang/Boolean;

    .line 310
    .line 311
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 312
    .line 313
    .line 314
    move-result v0

    .line 315
    if-eqz v0, :cond_10

    .line 316
    .line 317
    return-object v17

    .line 318
    :cond_10
    invoke-static {v15}, Landroidx/compose/ui/input/pointer/PointerEventKt;->changedToUpIgnoreConsumed(Landroidx/compose/ui/input/pointer/PointerInputChange;)Z

    .line 319
    .line 320
    .line 321
    move-result v0

    .line 322
    if-eqz v0, :cond_11

    .line 323
    .line 324
    return-object v15

    .line 325
    :cond_11
    invoke-interface {v1, v15}, Lhd/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 326
    .line 327
    .line 328
    invoke-virtual {v15}, Landroidx/compose/ui/input/pointer/PointerInputChange;->getId-J3iCeTQ()J

    .line 329
    .line 330
    .line 331
    move-result-wide v6

    .line 332
    move-object v0, v10

    .line 333
    move-object/from16 v5, v17

    .line 334
    .line 335
    const/4 v4, 0x1

    .line 336
    goto/16 :goto_1

    .line 337
    .line 338
    :cond_12
    :goto_b
    move-object v0, v10

    .line 339
    move-object/from16 v5, v17

    .line 340
    .line 341
    const/4 v4, 0x1

    .line 342
    move-object v10, v7

    .line 343
    goto/16 :goto_2
.end method

.method private static final drag-VnAYq1g$$forInline(Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;JLhd/l;Landroidx/compose/foundation/gestures/Orientation;Lhd/l;Lvc/c;)Ljava/lang/Object;
    .locals 16
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;",
            "J",
            "Lhd/l;",
            "Landroidx/compose/foundation/gestures/Orientation;",
            "Lhd/l;",
            "Lvc/c<",
            "-",
            "Landroidx/compose/ui/input/pointer/PointerInputChange;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    move-object/from16 v0, p4

    .line 2
    .line 3
    invoke-interface/range {p0 .. p0}, Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;->getCurrentEvent()Landroidx/compose/ui/input/pointer/PointerEvent;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    move-wide/from16 v2, p1

    .line 8
    .line 9
    invoke-static {v1, v2, v3}, Landroidx/compose/foundation/gestures/DragGestureDetectorKt;->access$isPointerUp-DmW0f2w(Landroidx/compose/ui/input/pointer/PointerEvent;J)Z

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    const/4 v4, 0x0

    .line 14
    if-eqz v1, :cond_0

    .line 15
    .line 16
    return-object v4

    .line 17
    :cond_0
    :goto_0
    new-instance v1, Lkotlin/jvm/internal/Ref$LongRef;

    .line 18
    .line 19
    invoke-direct {v1}, Lkotlin/jvm/internal/Ref$LongRef;-><init>()V

    .line 20
    .line 21
    .line 22
    iput-wide v2, v1, Lkotlin/jvm/internal/Ref$LongRef;->c:J

    .line 23
    .line 24
    :cond_1
    :goto_1
    const/4 v2, 0x0

    .line 25
    invoke-static {v2}, Lkotlin/jvm/internal/s;->c(I)V

    .line 26
    .line 27
    .line 28
    const/4 v3, 0x1

    .line 29
    move-object/from16 v5, p0

    .line 30
    .line 31
    move-object/from16 v6, p6

    .line 32
    .line 33
    invoke-static {v5, v4, v6, v3, v4}, Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;->awaitPointerEvent$default(Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;Landroidx/compose/ui/input/pointer/PointerEventPass;Lvc/c;ILjava/lang/Object;)Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object v7

    .line 37
    invoke-static {v3}, Lkotlin/jvm/internal/s;->c(I)V

    .line 38
    .line 39
    .line 40
    check-cast v7, Landroidx/compose/ui/input/pointer/PointerEvent;

    .line 41
    .line 42
    invoke-virtual {v7}, Landroidx/compose/ui/input/pointer/PointerEvent;->getChanges()Ljava/util/List;

    .line 43
    .line 44
    .line 45
    move-result-object v8

    .line 46
    move-object v9, v8

    .line 47
    check-cast v9, Ljava/util/Collection;

    .line 48
    .line 49
    invoke-interface {v9}, Ljava/util/Collection;->size()I

    .line 50
    .line 51
    .line 52
    move-result v9

    .line 53
    move v10, v2

    .line 54
    :goto_2
    if-ge v10, v9, :cond_3

    .line 55
    .line 56
    invoke-interface {v8, v10}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    move-result-object v11

    .line 60
    move-object v12, v11

    .line 61
    check-cast v12, Landroidx/compose/ui/input/pointer/PointerInputChange;

    .line 62
    .line 63
    invoke-virtual {v12}, Landroidx/compose/ui/input/pointer/PointerInputChange;->getId-J3iCeTQ()J

    .line 64
    .line 65
    .line 66
    move-result-wide v12

    .line 67
    iget-wide v14, v1, Lkotlin/jvm/internal/Ref$LongRef;->c:J

    .line 68
    .line 69
    invoke-static {v12, v13, v14, v15}, Landroidx/compose/ui/input/pointer/PointerId;->equals-impl0(JJ)Z

    .line 70
    .line 71
    .line 72
    move-result v12

    .line 73
    invoke-static {v12}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 74
    .line 75
    .line 76
    move-result-object v12

    .line 77
    invoke-virtual {v12}, Ljava/lang/Boolean;->booleanValue()Z

    .line 78
    .line 79
    .line 80
    move-result v12

    .line 81
    if-eqz v12, :cond_2

    .line 82
    .line 83
    goto :goto_3

    .line 84
    :cond_2
    add-int/lit8 v10, v10, 0x1

    .line 85
    .line 86
    goto :goto_2

    .line 87
    :cond_3
    move-object v11, v4

    .line 88
    :goto_3
    check-cast v11, Landroidx/compose/ui/input/pointer/PointerInputChange;

    .line 89
    .line 90
    if-eqz v11, :cond_b

    .line 91
    .line 92
    invoke-static {v11}, Landroidx/compose/ui/input/pointer/PointerEventKt;->changedToUpIgnoreConsumed(Landroidx/compose/ui/input/pointer/PointerInputChange;)Z

    .line 93
    .line 94
    .line 95
    move-result v8

    .line 96
    if-eqz v8, :cond_7

    .line 97
    .line 98
    invoke-virtual {v7}, Landroidx/compose/ui/input/pointer/PointerEvent;->getChanges()Ljava/util/List;

    .line 99
    .line 100
    .line 101
    move-result-object v3

    .line 102
    move-object v7, v3

    .line 103
    check-cast v7, Ljava/util/Collection;

    .line 104
    .line 105
    invoke-interface {v7}, Ljava/util/Collection;->size()I

    .line 106
    .line 107
    .line 108
    move-result v7

    .line 109
    :goto_4
    if-ge v2, v7, :cond_5

    .line 110
    .line 111
    invoke-interface {v3, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 112
    .line 113
    .line 114
    move-result-object v8

    .line 115
    move-object v9, v8

    .line 116
    check-cast v9, Landroidx/compose/ui/input/pointer/PointerInputChange;

    .line 117
    .line 118
    invoke-virtual {v9}, Landroidx/compose/ui/input/pointer/PointerInputChange;->getPressed()Z

    .line 119
    .line 120
    .line 121
    move-result v9

    .line 122
    invoke-static {v9}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 123
    .line 124
    .line 125
    move-result-object v9

    .line 126
    invoke-virtual {v9}, Ljava/lang/Boolean;->booleanValue()Z

    .line 127
    .line 128
    .line 129
    move-result v9

    .line 130
    if-eqz v9, :cond_4

    .line 131
    .line 132
    goto :goto_5

    .line 133
    :cond_4
    add-int/lit8 v2, v2, 0x1

    .line 134
    .line 135
    goto :goto_4

    .line 136
    :cond_5
    move-object v8, v4

    .line 137
    :goto_5
    check-cast v8, Landroidx/compose/ui/input/pointer/PointerInputChange;

    .line 138
    .line 139
    if-nez v8, :cond_6

    .line 140
    .line 141
    goto :goto_7

    .line 142
    :cond_6
    invoke-virtual {v8}, Landroidx/compose/ui/input/pointer/PointerInputChange;->getId-J3iCeTQ()J

    .line 143
    .line 144
    .line 145
    move-result-wide v2

    .line 146
    iput-wide v2, v1, Lkotlin/jvm/internal/Ref$LongRef;->c:J

    .line 147
    .line 148
    goto :goto_1

    .line 149
    :cond_7
    invoke-static {v11}, Landroidx/compose/ui/input/pointer/PointerEventKt;->positionChangeIgnoreConsumed(Landroidx/compose/ui/input/pointer/PointerInputChange;)J

    .line 150
    .line 151
    .line 152
    move-result-wide v7

    .line 153
    if-nez v0, :cond_8

    .line 154
    .line 155
    invoke-static {v7, v8}, Landroidx/compose/ui/geometry/Offset;->getDistance-impl(J)F

    .line 156
    .line 157
    .line 158
    move-result v7

    .line 159
    goto :goto_6

    .line 160
    :cond_8
    sget-object v9, Landroidx/compose/foundation/gestures/Orientation;->Vertical:Landroidx/compose/foundation/gestures/Orientation;

    .line 161
    .line 162
    if-ne v0, v9, :cond_9

    .line 163
    .line 164
    const-wide v9, 0xffffffffL

    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    and-long/2addr v7, v9

    .line 170
    long-to-int v7, v7

    .line 171
    invoke-static {v7}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 172
    .line 173
    .line 174
    move-result v7

    .line 175
    goto :goto_6

    .line 176
    :cond_9
    const/16 v9, 0x20

    .line 177
    .line 178
    shr-long/2addr v7, v9

    .line 179
    long-to-int v7, v7

    .line 180
    invoke-static {v7}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 181
    .line 182
    .line 183
    move-result v7

    .line 184
    :goto_6
    const/4 v8, 0x0

    .line 185
    cmpg-float v7, v7, v8

    .line 186
    .line 187
    if-nez v7, :cond_a

    .line 188
    .line 189
    move v2, v3

    .line 190
    :cond_a
    xor-int/2addr v2, v3

    .line 191
    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 192
    .line 193
    .line 194
    move-result-object v2

    .line 195
    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 196
    .line 197
    .line 198
    move-result v2

    .line 199
    if-eqz v2, :cond_1

    .line 200
    .line 201
    goto :goto_7

    .line 202
    :cond_b
    move-object v11, v4

    .line 203
    :goto_7
    if-eqz v11, :cond_e

    .line 204
    .line 205
    move-object/from16 v1, p5

    .line 206
    .line 207
    invoke-interface {v1, v11}, Lhd/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 208
    .line 209
    .line 210
    move-result-object v2

    .line 211
    check-cast v2, Ljava/lang/Boolean;

    .line 212
    .line 213
    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 214
    .line 215
    .line 216
    move-result v2

    .line 217
    if-eqz v2, :cond_c

    .line 218
    .line 219
    return-object v4

    .line 220
    :cond_c
    invoke-static {v11}, Landroidx/compose/ui/input/pointer/PointerEventKt;->changedToUpIgnoreConsumed(Landroidx/compose/ui/input/pointer/PointerInputChange;)Z

    .line 221
    .line 222
    .line 223
    move-result v2

    .line 224
    if-eqz v2, :cond_d

    .line 225
    .line 226
    return-object v11

    .line 227
    :cond_d
    move-object/from16 v2, p3

    .line 228
    .line 229
    invoke-interface {v2, v11}, Lhd/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 230
    .line 231
    .line 232
    invoke-virtual {v11}, Landroidx/compose/ui/input/pointer/PointerInputChange;->getId-J3iCeTQ()J

    .line 233
    .line 234
    .line 235
    move-result-wide v7

    .line 236
    move-wide v2, v7

    .line 237
    goto/16 :goto_0

    .line 238
    .line 239
    :cond_e
    return-object v4
.end method

.method public static final drag-jO51t88(Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;JLhd/l;Lvc/c;)Ljava/lang/Object;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;",
            "J",
            "Lhd/l;",
            "Lvc/c<",
            "-",
            "Ljava/lang/Boolean;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    instance-of v0, p4, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$drag$1;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p4

    .line 6
    check-cast v0, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$drag$1;

    .line 7
    .line 8
    iget v1, v0, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$drag$1;->label:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$drag$1;->label:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$drag$1;

    .line 21
    .line 22
    invoke-direct {v0, p4}, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$drag$1;-><init>(Lvc/c;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p4, v0, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$drag$1;->result:Ljava/lang/Object;

    .line 26
    .line 27
    invoke-static {}, Lwc/a;->f()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    iget v2, v0, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$drag$1;->label:I

    .line 32
    .line 33
    const/4 v3, 0x1

    .line 34
    if-eqz v2, :cond_2

    .line 35
    .line 36
    if-ne v2, v3, :cond_1

    .line 37
    .line 38
    iget-object p0, v0, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$drag$1;->L$1:Ljava/lang/Object;

    .line 39
    .line 40
    check-cast p0, Lhd/l;

    .line 41
    .line 42
    iget-object p1, v0, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$drag$1;->L$0:Ljava/lang/Object;

    .line 43
    .line 44
    check-cast p1, Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;

    .line 45
    .line 46
    invoke-static {p4}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 47
    .line 48
    .line 49
    move-object p3, p0

    .line 50
    move-object p0, p1

    .line 51
    goto :goto_2

    .line 52
    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 53
    .line 54
    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    .line 55
    .line 56
    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 57
    .line 58
    .line 59
    throw p0

    .line 60
    :cond_2
    invoke-static {p4}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 61
    .line 62
    .line 63
    :goto_1
    iput-object p0, v0, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$drag$1;->L$0:Ljava/lang/Object;

    .line 64
    .line 65
    iput-object p3, v0, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$drag$1;->L$1:Ljava/lang/Object;

    .line 66
    .line 67
    iput v3, v0, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$drag$1;->label:I

    .line 68
    .line 69
    invoke-static {p0, p1, p2, v0}, Landroidx/compose/foundation/gestures/DragGestureDetectorKt;->awaitDragOrCancellation-rnUCldI(Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;JLvc/c;)Ljava/lang/Object;

    .line 70
    .line 71
    .line 72
    move-result-object p4

    .line 73
    if-ne p4, v1, :cond_3

    .line 74
    .line 75
    return-object v1

    .line 76
    :cond_3
    :goto_2
    check-cast p4, Landroidx/compose/ui/input/pointer/PointerInputChange;

    .line 77
    .line 78
    if-nez p4, :cond_4

    .line 79
    .line 80
    const/4 p0, 0x0

    .line 81
    invoke-static {p0}, Lxc/a;->a(Z)Ljava/lang/Boolean;

    .line 82
    .line 83
    .line 84
    move-result-object p0

    .line 85
    return-object p0

    .line 86
    :cond_4
    invoke-static {p4}, Landroidx/compose/ui/input/pointer/PointerEventKt;->changedToUpIgnoreConsumed(Landroidx/compose/ui/input/pointer/PointerInputChange;)Z

    .line 87
    .line 88
    .line 89
    move-result p1

    .line 90
    if-eqz p1, :cond_5

    .line 91
    .line 92
    invoke-static {v3}, Lxc/a;->a(Z)Ljava/lang/Boolean;

    .line 93
    .line 94
    .line 95
    move-result-object p0

    .line 96
    return-object p0

    .line 97
    :cond_5
    invoke-interface {p3, p4}, Lhd/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 98
    .line 99
    .line 100
    invoke-virtual {p4}, Landroidx/compose/ui/input/pointer/PointerInputChange;->getId-J3iCeTQ()J

    .line 101
    .line 102
    .line 103
    move-result-wide p1

    .line 104
    goto :goto_1
.end method

.method public static final horizontalDrag-jO51t88(Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;JLhd/l;Lvc/c;)Ljava/lang/Object;
    .locals 17
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;",
            "J",
            "Lhd/l;",
            "Lvc/c<",
            "-",
            "Ljava/lang/Boolean;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    move-object/from16 v0, p4

    .line 2
    .line 3
    instance-of v1, v0, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$horizontalDrag$1;

    .line 4
    .line 5
    if-eqz v1, :cond_0

    .line 6
    .line 7
    move-object v1, v0

    .line 8
    check-cast v1, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$horizontalDrag$1;

    .line 9
    .line 10
    iget v2, v1, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$horizontalDrag$1;->label:I

    .line 11
    .line 12
    const/high16 v3, -0x80000000

    .line 13
    .line 14
    and-int v4, v2, v3

    .line 15
    .line 16
    if-eqz v4, :cond_0

    .line 17
    .line 18
    sub-int/2addr v2, v3

    .line 19
    iput v2, v1, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$horizontalDrag$1;->label:I

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    new-instance v1, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$horizontalDrag$1;

    .line 23
    .line 24
    invoke-direct {v1, v0}, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$horizontalDrag$1;-><init>(Lvc/c;)V

    .line 25
    .line 26
    .line 27
    :goto_0
    iget-object v0, v1, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$horizontalDrag$1;->result:Ljava/lang/Object;

    .line 28
    .line 29
    invoke-static {}, Lwc/a;->f()Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object v2

    .line 33
    iget v3, v1, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$horizontalDrag$1;->label:I

    .line 34
    .line 35
    const/4 v5, 0x1

    .line 36
    const/4 v6, 0x0

    .line 37
    if-eqz v3, :cond_2

    .line 38
    .line 39
    if-ne v3, v5, :cond_1

    .line 40
    .line 41
    iget-object v3, v1, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$horizontalDrag$1;->L$4:Ljava/lang/Object;

    .line 42
    .line 43
    check-cast v3, Lkotlin/jvm/internal/Ref$LongRef;

    .line 44
    .line 45
    iget-object v7, v1, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$horizontalDrag$1;->L$3:Ljava/lang/Object;

    .line 46
    .line 47
    check-cast v7, Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;

    .line 48
    .line 49
    iget-object v8, v1, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$horizontalDrag$1;->L$2:Ljava/lang/Object;

    .line 50
    .line 51
    check-cast v8, Landroidx/compose/foundation/gestures/Orientation;

    .line 52
    .line 53
    iget-object v9, v1, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$horizontalDrag$1;->L$1:Ljava/lang/Object;

    .line 54
    .line 55
    check-cast v9, Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;

    .line 56
    .line 57
    iget-object v10, v1, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$horizontalDrag$1;->L$0:Ljava/lang/Object;

    .line 58
    .line 59
    check-cast v10, Lhd/l;

    .line 60
    .line 61
    invoke-static {v0}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 62
    .line 63
    .line 64
    move-object/from16 v16, v10

    .line 65
    .line 66
    move-object v10, v1

    .line 67
    move-object/from16 v1, v16

    .line 68
    .line 69
    goto :goto_3

    .line 70
    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 71
    .line 72
    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    .line 73
    .line 74
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 75
    .line 76
    .line 77
    throw v0

    .line 78
    :cond_2
    invoke-static {v0}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 79
    .line 80
    .line 81
    sget-object v0, Landroidx/compose/foundation/gestures/Orientation;->Horizontal:Landroidx/compose/foundation/gestures/Orientation;

    .line 82
    .line 83
    invoke-interface/range {p0 .. p0}, Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;->getCurrentEvent()Landroidx/compose/ui/input/pointer/PointerEvent;

    .line 84
    .line 85
    .line 86
    move-result-object v3

    .line 87
    move-wide/from16 v7, p1

    .line 88
    .line 89
    invoke-static {v3, v7, v8}, Landroidx/compose/foundation/gestures/DragGestureDetectorKt;->access$isPointerUp-DmW0f2w(Landroidx/compose/ui/input/pointer/PointerEvent;J)Z

    .line 90
    .line 91
    .line 92
    move-result v3

    .line 93
    if-eqz v3, :cond_3

    .line 94
    .line 95
    goto/16 :goto_d

    .line 96
    .line 97
    :cond_3
    move-object v3, v0

    .line 98
    move-object v9, v1

    .line 99
    move-object/from16 v0, p0

    .line 100
    .line 101
    move-object/from16 v1, p3

    .line 102
    .line 103
    :goto_1
    new-instance v10, Lkotlin/jvm/internal/Ref$LongRef;

    .line 104
    .line 105
    invoke-direct {v10}, Lkotlin/jvm/internal/Ref$LongRef;-><init>()V

    .line 106
    .line 107
    .line 108
    iput-wide v7, v10, Lkotlin/jvm/internal/Ref$LongRef;->c:J

    .line 109
    .line 110
    move-object v7, v0

    .line 111
    move-object v8, v3

    .line 112
    move-object v3, v10

    .line 113
    :goto_2
    iput-object v1, v9, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$horizontalDrag$1;->L$0:Ljava/lang/Object;

    .line 114
    .line 115
    iput-object v0, v9, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$horizontalDrag$1;->L$1:Ljava/lang/Object;

    .line 116
    .line 117
    iput-object v8, v9, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$horizontalDrag$1;->L$2:Ljava/lang/Object;

    .line 118
    .line 119
    iput-object v7, v9, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$horizontalDrag$1;->L$3:Ljava/lang/Object;

    .line 120
    .line 121
    iput-object v3, v9, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$horizontalDrag$1;->L$4:Ljava/lang/Object;

    .line 122
    .line 123
    iput v5, v9, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$horizontalDrag$1;->label:I

    .line 124
    .line 125
    invoke-static {v7, v6, v9, v5, v6}, Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;->awaitPointerEvent$default(Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;Landroidx/compose/ui/input/pointer/PointerEventPass;Lvc/c;ILjava/lang/Object;)Ljava/lang/Object;

    .line 126
    .line 127
    .line 128
    move-result-object v10

    .line 129
    if-ne v10, v2, :cond_4

    .line 130
    .line 131
    return-object v2

    .line 132
    :cond_4
    move-object/from16 v16, v9

    .line 133
    .line 134
    move-object v9, v0

    .line 135
    move-object v0, v10

    .line 136
    move-object/from16 v10, v16

    .line 137
    .line 138
    :goto_3
    check-cast v0, Landroidx/compose/ui/input/pointer/PointerEvent;

    .line 139
    .line 140
    invoke-virtual {v0}, Landroidx/compose/ui/input/pointer/PointerEvent;->getChanges()Ljava/util/List;

    .line 141
    .line 142
    .line 143
    move-result-object v11

    .line 144
    move-object v12, v11

    .line 145
    check-cast v12, Ljava/util/Collection;

    .line 146
    .line 147
    invoke-interface {v12}, Ljava/util/Collection;->size()I

    .line 148
    .line 149
    .line 150
    move-result v12

    .line 151
    const/4 v13, 0x0

    .line 152
    :goto_4
    if-ge v13, v12, :cond_6

    .line 153
    .line 154
    invoke-interface {v11, v13}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 155
    .line 156
    .line 157
    move-result-object v14

    .line 158
    move-object v15, v14

    .line 159
    check-cast v15, Landroidx/compose/ui/input/pointer/PointerInputChange;

    .line 160
    .line 161
    invoke-virtual {v15}, Landroidx/compose/ui/input/pointer/PointerInputChange;->getId-J3iCeTQ()J

    .line 162
    .line 163
    .line 164
    move-result-wide v4

    .line 165
    move-object/from16 p0, v7

    .line 166
    .line 167
    iget-wide v6, v3, Lkotlin/jvm/internal/Ref$LongRef;->c:J

    .line 168
    .line 169
    invoke-static {v4, v5, v6, v7}, Landroidx/compose/ui/input/pointer/PointerId;->equals-impl0(JJ)Z

    .line 170
    .line 171
    .line 172
    move-result v4

    .line 173
    if-eqz v4, :cond_5

    .line 174
    .line 175
    goto :goto_5

    .line 176
    :cond_5
    add-int/lit8 v13, v13, 0x1

    .line 177
    .line 178
    const/4 v5, 0x1

    .line 179
    const/4 v6, 0x0

    .line 180
    move-object/from16 v7, p0

    .line 181
    .line 182
    goto :goto_4

    .line 183
    :cond_6
    move-object/from16 p0, v7

    .line 184
    .line 185
    const/4 v14, 0x0

    .line 186
    :goto_5
    check-cast v14, Landroidx/compose/ui/input/pointer/PointerInputChange;

    .line 187
    .line 188
    if-nez v14, :cond_7

    .line 189
    .line 190
    const/4 v14, 0x0

    .line 191
    goto :goto_b

    .line 192
    :cond_7
    invoke-static {v14}, Landroidx/compose/ui/input/pointer/PointerEventKt;->changedToUpIgnoreConsumed(Landroidx/compose/ui/input/pointer/PointerInputChange;)Z

    .line 193
    .line 194
    .line 195
    move-result v4

    .line 196
    if-eqz v4, :cond_b

    .line 197
    .line 198
    invoke-virtual {v0}, Landroidx/compose/ui/input/pointer/PointerEvent;->getChanges()Ljava/util/List;

    .line 199
    .line 200
    .line 201
    move-result-object v0

    .line 202
    move-object v4, v0

    .line 203
    check-cast v4, Ljava/util/Collection;

    .line 204
    .line 205
    invoke-interface {v4}, Ljava/util/Collection;->size()I

    .line 206
    .line 207
    .line 208
    move-result v4

    .line 209
    const/4 v5, 0x0

    .line 210
    :goto_6
    if-ge v5, v4, :cond_9

    .line 211
    .line 212
    invoke-interface {v0, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 213
    .line 214
    .line 215
    move-result-object v6

    .line 216
    move-object v7, v6

    .line 217
    check-cast v7, Landroidx/compose/ui/input/pointer/PointerInputChange;

    .line 218
    .line 219
    invoke-virtual {v7}, Landroidx/compose/ui/input/pointer/PointerInputChange;->getPressed()Z

    .line 220
    .line 221
    .line 222
    move-result v7

    .line 223
    if-eqz v7, :cond_8

    .line 224
    .line 225
    goto :goto_7

    .line 226
    :cond_8
    add-int/lit8 v5, v5, 0x1

    .line 227
    .line 228
    goto :goto_6

    .line 229
    :cond_9
    const/4 v6, 0x0

    .line 230
    :goto_7
    check-cast v6, Landroidx/compose/ui/input/pointer/PointerInputChange;

    .line 231
    .line 232
    if-nez v6, :cond_a

    .line 233
    .line 234
    goto :goto_b

    .line 235
    :cond_a
    invoke-virtual {v6}, Landroidx/compose/ui/input/pointer/PointerInputChange;->getId-J3iCeTQ()J

    .line 236
    .line 237
    .line 238
    move-result-wide v4

    .line 239
    iput-wide v4, v3, Lkotlin/jvm/internal/Ref$LongRef;->c:J

    .line 240
    .line 241
    goto :goto_f

    .line 242
    :cond_b
    invoke-static {v14}, Landroidx/compose/ui/input/pointer/PointerEventKt;->positionChangeIgnoreConsumed(Landroidx/compose/ui/input/pointer/PointerInputChange;)J

    .line 243
    .line 244
    .line 245
    move-result-wide v4

    .line 246
    if-nez v8, :cond_c

    .line 247
    .line 248
    invoke-static {v4, v5}, Landroidx/compose/ui/geometry/Offset;->getDistance-impl(J)F

    .line 249
    .line 250
    .line 251
    move-result v0

    .line 252
    goto :goto_9

    .line 253
    :cond_c
    sget-object v0, Landroidx/compose/foundation/gestures/Orientation;->Vertical:Landroidx/compose/foundation/gestures/Orientation;

    .line 254
    .line 255
    if-ne v8, v0, :cond_d

    .line 256
    .line 257
    const-wide v6, 0xffffffffL

    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    and-long/2addr v4, v6

    .line 263
    :goto_8
    long-to-int v0, v4

    .line 264
    invoke-static {v0}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 265
    .line 266
    .line 267
    move-result v0

    .line 268
    goto :goto_9

    .line 269
    :cond_d
    const/16 v0, 0x20

    .line 270
    .line 271
    shr-long/2addr v4, v0

    .line 272
    goto :goto_8

    .line 273
    :goto_9
    const/4 v4, 0x0

    .line 274
    cmpg-float v0, v0, v4

    .line 275
    .line 276
    if-nez v0, :cond_e

    .line 277
    .line 278
    const/4 v0, 0x1

    .line 279
    goto :goto_a

    .line 280
    :cond_e
    const/4 v0, 0x0

    .line 281
    :goto_a
    if-nez v0, :cond_13

    .line 282
    .line 283
    :goto_b
    if-nez v14, :cond_f

    .line 284
    .line 285
    :goto_c
    const/4 v6, 0x0

    .line 286
    goto :goto_d

    .line 287
    :cond_f
    invoke-virtual {v14}, Landroidx/compose/ui/input/pointer/PointerInputChange;->isConsumed()Z

    .line 288
    .line 289
    .line 290
    move-result v0

    .line 291
    if-eqz v0, :cond_10

    .line 292
    .line 293
    goto :goto_c

    .line 294
    :cond_10
    invoke-static {v14}, Landroidx/compose/ui/input/pointer/PointerEventKt;->changedToUpIgnoreConsumed(Landroidx/compose/ui/input/pointer/PointerInputChange;)Z

    .line 295
    .line 296
    .line 297
    move-result v0

    .line 298
    if-eqz v0, :cond_12

    .line 299
    .line 300
    move-object v6, v14

    .line 301
    :goto_d
    if-eqz v6, :cond_11

    .line 302
    .line 303
    const/4 v4, 0x1

    .line 304
    goto :goto_e

    .line 305
    :cond_11
    const/4 v4, 0x0

    .line 306
    :goto_e
    invoke-static {v4}, Lxc/a;->a(Z)Ljava/lang/Boolean;

    .line 307
    .line 308
    .line 309
    move-result-object v0

    .line 310
    return-object v0

    .line 311
    :cond_12
    invoke-interface {v1, v14}, Lhd/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 312
    .line 313
    .line 314
    invoke-virtual {v14}, Landroidx/compose/ui/input/pointer/PointerInputChange;->getId-J3iCeTQ()J

    .line 315
    .line 316
    .line 317
    move-result-wide v3

    .line 318
    move-wide v5, v3

    .line 319
    move-object v3, v8

    .line 320
    move-wide v7, v5

    .line 321
    move-object v0, v9

    .line 322
    move-object v9, v10

    .line 323
    const/4 v5, 0x1

    .line 324
    const/4 v6, 0x0

    .line 325
    goto/16 :goto_1

    .line 326
    .line 327
    :cond_13
    :goto_f
    move-object/from16 v7, p0

    .line 328
    .line 329
    move-object v0, v9

    .line 330
    move-object v9, v10

    .line 331
    const/4 v5, 0x1

    .line 332
    const/4 v6, 0x0

    .line 333
    goto/16 :goto_2
.end method

.method private static final isPointerUp-DmW0f2w(Landroidx/compose/ui/input/pointer/PointerEvent;J)Z
    .locals 6

    .line 1
    invoke-virtual {p0}, Landroidx/compose/ui/input/pointer/PointerEvent;->getChanges()Ljava/util/List;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    move-object v0, p0

    .line 6
    check-cast v0, Ljava/util/Collection;

    .line 7
    .line 8
    invoke-interface {v0}, Ljava/util/Collection;->size()I

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    const/4 v1, 0x0

    .line 13
    move v2, v1

    .line 14
    :goto_0
    if-ge v2, v0, :cond_1

    .line 15
    .line 16
    invoke-interface {p0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object v3

    .line 20
    move-object v4, v3

    .line 21
    check-cast v4, Landroidx/compose/ui/input/pointer/PointerInputChange;

    .line 22
    .line 23
    invoke-virtual {v4}, Landroidx/compose/ui/input/pointer/PointerInputChange;->getId-J3iCeTQ()J

    .line 24
    .line 25
    .line 26
    move-result-wide v4

    .line 27
    invoke-static {v4, v5, p1, p2}, Landroidx/compose/ui/input/pointer/PointerId;->equals-impl0(JJ)Z

    .line 28
    .line 29
    .line 30
    move-result v4

    .line 31
    if-eqz v4, :cond_0

    .line 32
    .line 33
    goto :goto_1

    .line 34
    :cond_0
    add-int/lit8 v2, v2, 0x1

    .line 35
    .line 36
    goto :goto_0

    .line 37
    :cond_1
    const/4 v3, 0x0

    .line 38
    :goto_1
    check-cast v3, Landroidx/compose/ui/input/pointer/PointerInputChange;

    .line 39
    .line 40
    const/4 p0, 0x1

    .line 41
    if-eqz v3, :cond_2

    .line 42
    .line 43
    invoke-virtual {v3}, Landroidx/compose/ui/input/pointer/PointerInputChange;->getPressed()Z

    .line 44
    .line 45
    .line 46
    move-result p1

    .line 47
    if-ne p1, p0, :cond_2

    .line 48
    .line 49
    move v1, p0

    .line 50
    :cond_2
    xor-int/2addr p0, v1

    .line 51
    return p0
.end method

.method public static final pointerSlop-E8SPZFQ(Landroidx/compose/ui/platform/ViewConfiguration;I)F
    .locals 1

    .line 1
    sget-object v0, Landroidx/compose/ui/input/pointer/PointerType;->Companion:Landroidx/compose/ui/input/pointer/PointerType$Companion;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroidx/compose/ui/input/pointer/PointerType$Companion;->getMouse-T8wyACA()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    invoke-static {p1, v0}, Landroidx/compose/ui/input/pointer/PointerType;->equals-impl0(II)Z

    .line 8
    .line 9
    .line 10
    move-result p1

    .line 11
    if-eqz p1, :cond_0

    .line 12
    .line 13
    invoke-interface {p0}, Landroidx/compose/ui/platform/ViewConfiguration;->getTouchSlop()F

    .line 14
    .line 15
    .line 16
    move-result p0

    .line 17
    sget p1, Landroidx/compose/foundation/gestures/DragGestureDetectorKt;->mouseToTouchSlopRatio:F

    .line 18
    .line 19
    mul-float/2addr p0, p1

    .line 20
    return p0

    .line 21
    :cond_0
    invoke-interface {p0}, Landroidx/compose/ui/platform/ViewConfiguration;->getTouchSlop()F

    .line 22
    .line 23
    .line 24
    move-result p0

    .line 25
    return p0
.end method

.method public static final verticalDrag-jO51t88(Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;JLhd/l;Lvc/c;)Ljava/lang/Object;
    .locals 17
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;",
            "J",
            "Lhd/l;",
            "Lvc/c<",
            "-",
            "Ljava/lang/Boolean;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    move-object/from16 v0, p4

    .line 2
    .line 3
    instance-of v1, v0, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$verticalDrag$1;

    .line 4
    .line 5
    if-eqz v1, :cond_0

    .line 6
    .line 7
    move-object v1, v0

    .line 8
    check-cast v1, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$verticalDrag$1;

    .line 9
    .line 10
    iget v2, v1, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$verticalDrag$1;->label:I

    .line 11
    .line 12
    const/high16 v3, -0x80000000

    .line 13
    .line 14
    and-int v4, v2, v3

    .line 15
    .line 16
    if-eqz v4, :cond_0

    .line 17
    .line 18
    sub-int/2addr v2, v3

    .line 19
    iput v2, v1, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$verticalDrag$1;->label:I

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    new-instance v1, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$verticalDrag$1;

    .line 23
    .line 24
    invoke-direct {v1, v0}, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$verticalDrag$1;-><init>(Lvc/c;)V

    .line 25
    .line 26
    .line 27
    :goto_0
    iget-object v0, v1, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$verticalDrag$1;->result:Ljava/lang/Object;

    .line 28
    .line 29
    invoke-static {}, Lwc/a;->f()Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object v2

    .line 33
    iget v3, v1, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$verticalDrag$1;->label:I

    .line 34
    .line 35
    const/4 v5, 0x1

    .line 36
    const/4 v6, 0x0

    .line 37
    if-eqz v3, :cond_2

    .line 38
    .line 39
    if-ne v3, v5, :cond_1

    .line 40
    .line 41
    iget-object v3, v1, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$verticalDrag$1;->L$4:Ljava/lang/Object;

    .line 42
    .line 43
    check-cast v3, Lkotlin/jvm/internal/Ref$LongRef;

    .line 44
    .line 45
    iget-object v7, v1, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$verticalDrag$1;->L$3:Ljava/lang/Object;

    .line 46
    .line 47
    check-cast v7, Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;

    .line 48
    .line 49
    iget-object v8, v1, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$verticalDrag$1;->L$2:Ljava/lang/Object;

    .line 50
    .line 51
    check-cast v8, Landroidx/compose/foundation/gestures/Orientation;

    .line 52
    .line 53
    iget-object v9, v1, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$verticalDrag$1;->L$1:Ljava/lang/Object;

    .line 54
    .line 55
    check-cast v9, Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;

    .line 56
    .line 57
    iget-object v10, v1, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$verticalDrag$1;->L$0:Ljava/lang/Object;

    .line 58
    .line 59
    check-cast v10, Lhd/l;

    .line 60
    .line 61
    invoke-static {v0}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 62
    .line 63
    .line 64
    move-object/from16 v16, v10

    .line 65
    .line 66
    move-object v10, v1

    .line 67
    move-object/from16 v1, v16

    .line 68
    .line 69
    goto :goto_3

    .line 70
    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 71
    .line 72
    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    .line 73
    .line 74
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 75
    .line 76
    .line 77
    throw v0

    .line 78
    :cond_2
    invoke-static {v0}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 79
    .line 80
    .line 81
    sget-object v0, Landroidx/compose/foundation/gestures/Orientation;->Vertical:Landroidx/compose/foundation/gestures/Orientation;

    .line 82
    .line 83
    invoke-interface/range {p0 .. p0}, Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;->getCurrentEvent()Landroidx/compose/ui/input/pointer/PointerEvent;

    .line 84
    .line 85
    .line 86
    move-result-object v3

    .line 87
    move-wide/from16 v7, p1

    .line 88
    .line 89
    invoke-static {v3, v7, v8}, Landroidx/compose/foundation/gestures/DragGestureDetectorKt;->access$isPointerUp-DmW0f2w(Landroidx/compose/ui/input/pointer/PointerEvent;J)Z

    .line 90
    .line 91
    .line 92
    move-result v3

    .line 93
    if-eqz v3, :cond_3

    .line 94
    .line 95
    goto/16 :goto_d

    .line 96
    .line 97
    :cond_3
    move-object v3, v0

    .line 98
    move-object v9, v1

    .line 99
    move-object/from16 v0, p0

    .line 100
    .line 101
    move-object/from16 v1, p3

    .line 102
    .line 103
    :goto_1
    new-instance v10, Lkotlin/jvm/internal/Ref$LongRef;

    .line 104
    .line 105
    invoke-direct {v10}, Lkotlin/jvm/internal/Ref$LongRef;-><init>()V

    .line 106
    .line 107
    .line 108
    iput-wide v7, v10, Lkotlin/jvm/internal/Ref$LongRef;->c:J

    .line 109
    .line 110
    move-object v7, v0

    .line 111
    move-object v8, v3

    .line 112
    move-object v3, v10

    .line 113
    :goto_2
    iput-object v1, v9, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$verticalDrag$1;->L$0:Ljava/lang/Object;

    .line 114
    .line 115
    iput-object v0, v9, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$verticalDrag$1;->L$1:Ljava/lang/Object;

    .line 116
    .line 117
    iput-object v8, v9, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$verticalDrag$1;->L$2:Ljava/lang/Object;

    .line 118
    .line 119
    iput-object v7, v9, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$verticalDrag$1;->L$3:Ljava/lang/Object;

    .line 120
    .line 121
    iput-object v3, v9, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$verticalDrag$1;->L$4:Ljava/lang/Object;

    .line 122
    .line 123
    iput v5, v9, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$verticalDrag$1;->label:I

    .line 124
    .line 125
    invoke-static {v7, v6, v9, v5, v6}, Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;->awaitPointerEvent$default(Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;Landroidx/compose/ui/input/pointer/PointerEventPass;Lvc/c;ILjava/lang/Object;)Ljava/lang/Object;

    .line 126
    .line 127
    .line 128
    move-result-object v10

    .line 129
    if-ne v10, v2, :cond_4

    .line 130
    .line 131
    return-object v2

    .line 132
    :cond_4
    move-object/from16 v16, v9

    .line 133
    .line 134
    move-object v9, v0

    .line 135
    move-object v0, v10

    .line 136
    move-object/from16 v10, v16

    .line 137
    .line 138
    :goto_3
    check-cast v0, Landroidx/compose/ui/input/pointer/PointerEvent;

    .line 139
    .line 140
    invoke-virtual {v0}, Landroidx/compose/ui/input/pointer/PointerEvent;->getChanges()Ljava/util/List;

    .line 141
    .line 142
    .line 143
    move-result-object v11

    .line 144
    move-object v12, v11

    .line 145
    check-cast v12, Ljava/util/Collection;

    .line 146
    .line 147
    invoke-interface {v12}, Ljava/util/Collection;->size()I

    .line 148
    .line 149
    .line 150
    move-result v12

    .line 151
    const/4 v13, 0x0

    .line 152
    :goto_4
    if-ge v13, v12, :cond_6

    .line 153
    .line 154
    invoke-interface {v11, v13}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 155
    .line 156
    .line 157
    move-result-object v14

    .line 158
    move-object v15, v14

    .line 159
    check-cast v15, Landroidx/compose/ui/input/pointer/PointerInputChange;

    .line 160
    .line 161
    invoke-virtual {v15}, Landroidx/compose/ui/input/pointer/PointerInputChange;->getId-J3iCeTQ()J

    .line 162
    .line 163
    .line 164
    move-result-wide v4

    .line 165
    move-object/from16 p0, v7

    .line 166
    .line 167
    iget-wide v6, v3, Lkotlin/jvm/internal/Ref$LongRef;->c:J

    .line 168
    .line 169
    invoke-static {v4, v5, v6, v7}, Landroidx/compose/ui/input/pointer/PointerId;->equals-impl0(JJ)Z

    .line 170
    .line 171
    .line 172
    move-result v4

    .line 173
    if-eqz v4, :cond_5

    .line 174
    .line 175
    goto :goto_5

    .line 176
    :cond_5
    add-int/lit8 v13, v13, 0x1

    .line 177
    .line 178
    const/4 v5, 0x1

    .line 179
    const/4 v6, 0x0

    .line 180
    move-object/from16 v7, p0

    .line 181
    .line 182
    goto :goto_4

    .line 183
    :cond_6
    move-object/from16 p0, v7

    .line 184
    .line 185
    const/4 v14, 0x0

    .line 186
    :goto_5
    check-cast v14, Landroidx/compose/ui/input/pointer/PointerInputChange;

    .line 187
    .line 188
    if-nez v14, :cond_7

    .line 189
    .line 190
    const/4 v14, 0x0

    .line 191
    goto :goto_b

    .line 192
    :cond_7
    invoke-static {v14}, Landroidx/compose/ui/input/pointer/PointerEventKt;->changedToUpIgnoreConsumed(Landroidx/compose/ui/input/pointer/PointerInputChange;)Z

    .line 193
    .line 194
    .line 195
    move-result v4

    .line 196
    if-eqz v4, :cond_b

    .line 197
    .line 198
    invoke-virtual {v0}, Landroidx/compose/ui/input/pointer/PointerEvent;->getChanges()Ljava/util/List;

    .line 199
    .line 200
    .line 201
    move-result-object v0

    .line 202
    move-object v4, v0

    .line 203
    check-cast v4, Ljava/util/Collection;

    .line 204
    .line 205
    invoke-interface {v4}, Ljava/util/Collection;->size()I

    .line 206
    .line 207
    .line 208
    move-result v4

    .line 209
    const/4 v5, 0x0

    .line 210
    :goto_6
    if-ge v5, v4, :cond_9

    .line 211
    .line 212
    invoke-interface {v0, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 213
    .line 214
    .line 215
    move-result-object v6

    .line 216
    move-object v7, v6

    .line 217
    check-cast v7, Landroidx/compose/ui/input/pointer/PointerInputChange;

    .line 218
    .line 219
    invoke-virtual {v7}, Landroidx/compose/ui/input/pointer/PointerInputChange;->getPressed()Z

    .line 220
    .line 221
    .line 222
    move-result v7

    .line 223
    if-eqz v7, :cond_8

    .line 224
    .line 225
    goto :goto_7

    .line 226
    :cond_8
    add-int/lit8 v5, v5, 0x1

    .line 227
    .line 228
    goto :goto_6

    .line 229
    :cond_9
    const/4 v6, 0x0

    .line 230
    :goto_7
    check-cast v6, Landroidx/compose/ui/input/pointer/PointerInputChange;

    .line 231
    .line 232
    if-nez v6, :cond_a

    .line 233
    .line 234
    goto :goto_b

    .line 235
    :cond_a
    invoke-virtual {v6}, Landroidx/compose/ui/input/pointer/PointerInputChange;->getId-J3iCeTQ()J

    .line 236
    .line 237
    .line 238
    move-result-wide v4

    .line 239
    iput-wide v4, v3, Lkotlin/jvm/internal/Ref$LongRef;->c:J

    .line 240
    .line 241
    goto :goto_f

    .line 242
    :cond_b
    invoke-static {v14}, Landroidx/compose/ui/input/pointer/PointerEventKt;->positionChangeIgnoreConsumed(Landroidx/compose/ui/input/pointer/PointerInputChange;)J

    .line 243
    .line 244
    .line 245
    move-result-wide v4

    .line 246
    if-nez v8, :cond_c

    .line 247
    .line 248
    invoke-static {v4, v5}, Landroidx/compose/ui/geometry/Offset;->getDistance-impl(J)F

    .line 249
    .line 250
    .line 251
    move-result v0

    .line 252
    goto :goto_9

    .line 253
    :cond_c
    sget-object v0, Landroidx/compose/foundation/gestures/Orientation;->Vertical:Landroidx/compose/foundation/gestures/Orientation;

    .line 254
    .line 255
    if-ne v8, v0, :cond_d

    .line 256
    .line 257
    const-wide v6, 0xffffffffL

    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    and-long/2addr v4, v6

    .line 263
    :goto_8
    long-to-int v0, v4

    .line 264
    invoke-static {v0}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 265
    .line 266
    .line 267
    move-result v0

    .line 268
    goto :goto_9

    .line 269
    :cond_d
    const/16 v0, 0x20

    .line 270
    .line 271
    shr-long/2addr v4, v0

    .line 272
    goto :goto_8

    .line 273
    :goto_9
    const/4 v4, 0x0

    .line 274
    cmpg-float v0, v0, v4

    .line 275
    .line 276
    if-nez v0, :cond_e

    .line 277
    .line 278
    const/4 v0, 0x1

    .line 279
    goto :goto_a

    .line 280
    :cond_e
    const/4 v0, 0x0

    .line 281
    :goto_a
    if-nez v0, :cond_13

    .line 282
    .line 283
    :goto_b
    if-nez v14, :cond_f

    .line 284
    .line 285
    :goto_c
    const/4 v6, 0x0

    .line 286
    goto :goto_d

    .line 287
    :cond_f
    invoke-virtual {v14}, Landroidx/compose/ui/input/pointer/PointerInputChange;->isConsumed()Z

    .line 288
    .line 289
    .line 290
    move-result v0

    .line 291
    if-eqz v0, :cond_10

    .line 292
    .line 293
    goto :goto_c

    .line 294
    :cond_10
    invoke-static {v14}, Landroidx/compose/ui/input/pointer/PointerEventKt;->changedToUpIgnoreConsumed(Landroidx/compose/ui/input/pointer/PointerInputChange;)Z

    .line 295
    .line 296
    .line 297
    move-result v0

    .line 298
    if-eqz v0, :cond_12

    .line 299
    .line 300
    move-object v6, v14

    .line 301
    :goto_d
    if-eqz v6, :cond_11

    .line 302
    .line 303
    const/4 v4, 0x1

    .line 304
    goto :goto_e

    .line 305
    :cond_11
    const/4 v4, 0x0

    .line 306
    :goto_e
    invoke-static {v4}, Lxc/a;->a(Z)Ljava/lang/Boolean;

    .line 307
    .line 308
    .line 309
    move-result-object v0

    .line 310
    return-object v0

    .line 311
    :cond_12
    invoke-interface {v1, v14}, Lhd/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 312
    .line 313
    .line 314
    invoke-virtual {v14}, Landroidx/compose/ui/input/pointer/PointerInputChange;->getId-J3iCeTQ()J

    .line 315
    .line 316
    .line 317
    move-result-wide v3

    .line 318
    move-wide v5, v3

    .line 319
    move-object v3, v8

    .line 320
    move-wide v7, v5

    .line 321
    move-object v0, v9

    .line 322
    move-object v9, v10

    .line 323
    const/4 v5, 0x1

    .line 324
    const/4 v6, 0x0

    .line 325
    goto/16 :goto_1

    .line 326
    .line 327
    :cond_13
    :goto_f
    move-object/from16 v7, p0

    .line 328
    .line 329
    move-object v0, v9

    .line 330
    move-object v9, v10

    .line 331
    const/4 v5, 0x1

    .line 332
    const/4 v6, 0x0

    .line 333
    goto/16 :goto_2
.end method
