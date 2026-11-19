.class public final Landroidx/compose/foundation/gestures/TransformableKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00000\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u001a1\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u000c\u0010\u0003\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u00042\u000c\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00080\u0007H\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\t\u001a&\u0010\n\u001a\u00020\u000b*\u00020\u000b2\u0006\u0010\u000c\u001a\u00020\r2\u0008\u0008\u0002\u0010\u000e\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u000f\u001a\u00020\u0005\u0082\u0002\u0004\n\u0002\u0008\u0019\u00a8\u0006\u0010"
    }
    d2 = {
        "detectZoom",
        "",
        "Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;",
        "panZoomLock",
        "Landroidx/compose/runtime/State;",
        "",
        "channel",
        "Lkotlinx/coroutines/channels/Channel;",
        "Landroidx/compose/foundation/gestures/TransformEvent;",
        "(Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;Landroidx/compose/runtime/State;Lkotlinx/coroutines/channels/Channel;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "transformable",
        "Landroidx/compose/ui/Modifier;",
        "state",
        "Landroidx/compose/foundation/gestures/TransformableState;",
        "lockRotationOnZoomPan",
        "enabled",
        "foundation_release"
    }
    k = 0x2
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nTransformable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Transformable.kt\nandroidx/compose/foundation/gestures/TransformableKt\n+ 2 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt\n+ 3 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,180:1\n135#2:181\n101#3,2:182\n33#3,6:184\n103#3:190\n33#3,6:191\n101#3,2:197\n33#3,6:199\n103#3:205\n*S KotlinDebug\n*F\n+ 1 Transformable.kt\nandroidx/compose/foundation/gestures/TransformableKt\n*L\n106#1:181\n137#1:182,2\n137#1:184,6\n137#1:190\n171#1:191,6\n178#1:197,2\n178#1:199,6\n178#1:205\n*E\n"
    }
.end annotation


# direct methods
.method public static final synthetic access$detectZoom(Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;Landroidx/compose/runtime/State;Lkotlinx/coroutines/channels/Channel;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2, p3}, Landroidx/compose/foundation/gestures/TransformableKt;->detectZoom(Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;Landroidx/compose/runtime/State;Lkotlinx/coroutines/channels/Channel;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method private static final detectZoom(Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;Landroidx/compose/runtime/State;Lkotlinx/coroutines/channels/Channel;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 27
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;",
            "Landroidx/compose/runtime/State<",
            "Ljava/lang/Boolean;",
            ">;",
            "Lkotlinx/coroutines/channels/Channel<",
            "Landroidx/compose/foundation/gestures/TransformEvent;",
            ">;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    move-object/from16 v0, p3

    .line 2
    .line 3
    instance-of v1, v0, Landroidx/compose/foundation/gestures/TransformableKt$detectZoom$1;

    .line 4
    .line 5
    if-eqz v1, :cond_0

    .line 6
    .line 7
    move-object v1, v0

    .line 8
    check-cast v1, Landroidx/compose/foundation/gestures/TransformableKt$detectZoom$1;

    .line 9
    .line 10
    iget v2, v1, Landroidx/compose/foundation/gestures/TransformableKt$detectZoom$1;->label:I

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
    iput v2, v1, Landroidx/compose/foundation/gestures/TransformableKt$detectZoom$1;->label:I

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    new-instance v1, Landroidx/compose/foundation/gestures/TransformableKt$detectZoom$1;

    .line 23
    .line 24
    invoke-direct {v1, v0}, Landroidx/compose/foundation/gestures/TransformableKt$detectZoom$1;-><init>(Lkotlin/coroutines/Continuation;)V

    .line 25
    .line 26
    .line 27
    :goto_0
    iget-object v0, v1, Landroidx/compose/foundation/gestures/TransformableKt$detectZoom$1;->result:Ljava/lang/Object;

    .line 28
    .line 29
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object v8

    .line 33
    iget v2, v1, Landroidx/compose/foundation/gestures/TransformableKt$detectZoom$1;->label:I

    .line 34
    .line 35
    const/high16 v9, 0x3f800000    # 1.0f

    .line 36
    .line 37
    const/4 v10, 0x2

    .line 38
    const/4 v11, 0x0

    .line 39
    const/4 v12, 0x0

    .line 40
    const/4 v13, 0x1

    .line 41
    if-eqz v2, :cond_3

    .line 42
    .line 43
    if-eq v2, v13, :cond_2

    .line 44
    .line 45
    if-ne v2, v10, :cond_1

    .line 46
    .line 47
    iget v2, v1, Landroidx/compose/foundation/gestures/TransformableKt$detectZoom$1;->I$1:I

    .line 48
    .line 49
    iget v3, v1, Landroidx/compose/foundation/gestures/TransformableKt$detectZoom$1;->F$2:F

    .line 50
    .line 51
    iget v4, v1, Landroidx/compose/foundation/gestures/TransformableKt$detectZoom$1;->I$0:I

    .line 52
    .line 53
    iget-wide v5, v1, Landroidx/compose/foundation/gestures/TransformableKt$detectZoom$1;->J$0:J

    .line 54
    .line 55
    iget v7, v1, Landroidx/compose/foundation/gestures/TransformableKt$detectZoom$1;->F$1:F

    .line 56
    .line 57
    iget v14, v1, Landroidx/compose/foundation/gestures/TransformableKt$detectZoom$1;->F$0:F

    .line 58
    .line 59
    iget-object v15, v1, Landroidx/compose/foundation/gestures/TransformableKt$detectZoom$1;->L$2:Ljava/lang/Object;

    .line 60
    .line 61
    check-cast v15, Lkotlinx/coroutines/channels/Channel;

    .line 62
    .line 63
    iget-object v10, v1, Landroidx/compose/foundation/gestures/TransformableKt$detectZoom$1;->L$1:Ljava/lang/Object;

    .line 64
    .line 65
    check-cast v10, Landroidx/compose/runtime/State;

    .line 66
    .line 67
    iget-object v13, v1, Landroidx/compose/foundation/gestures/TransformableKt$detectZoom$1;->L$0:Ljava/lang/Object;

    .line 68
    .line 69
    check-cast v13, Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;

    .line 70
    .line 71
    invoke-static {v0}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 72
    .line 73
    .line 74
    goto/16 :goto_3

    .line 75
    .line 76
    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 77
    .line 78
    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    .line 79
    .line 80
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 81
    .line 82
    .line 83
    throw v0

    .line 84
    :cond_2
    iget v2, v1, Landroidx/compose/foundation/gestures/TransformableKt$detectZoom$1;->I$1:I

    .line 85
    .line 86
    iget v3, v1, Landroidx/compose/foundation/gestures/TransformableKt$detectZoom$1;->F$2:F

    .line 87
    .line 88
    iget v4, v1, Landroidx/compose/foundation/gestures/TransformableKt$detectZoom$1;->I$0:I

    .line 89
    .line 90
    iget-wide v5, v1, Landroidx/compose/foundation/gestures/TransformableKt$detectZoom$1;->J$0:J

    .line 91
    .line 92
    iget v7, v1, Landroidx/compose/foundation/gestures/TransformableKt$detectZoom$1;->F$1:F

    .line 93
    .line 94
    iget v10, v1, Landroidx/compose/foundation/gestures/TransformableKt$detectZoom$1;->F$0:F

    .line 95
    .line 96
    iget-object v13, v1, Landroidx/compose/foundation/gestures/TransformableKt$detectZoom$1;->L$2:Ljava/lang/Object;

    .line 97
    .line 98
    check-cast v13, Lkotlinx/coroutines/channels/Channel;

    .line 99
    .line 100
    iget-object v14, v1, Landroidx/compose/foundation/gestures/TransformableKt$detectZoom$1;->L$1:Ljava/lang/Object;

    .line 101
    .line 102
    check-cast v14, Landroidx/compose/runtime/State;

    .line 103
    .line 104
    iget-object v15, v1, Landroidx/compose/foundation/gestures/TransformableKt$detectZoom$1;->L$0:Ljava/lang/Object;

    .line 105
    .line 106
    check-cast v15, Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;

    .line 107
    .line 108
    invoke-static {v0}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 109
    .line 110
    .line 111
    goto :goto_1

    .line 112
    :cond_3
    invoke-static {v0}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 113
    .line 114
    .line 115
    sget-object v0, Landroidx/compose/ui/geometry/Offset;->Companion:Landroidx/compose/ui/geometry/Offset$Companion;

    .line 116
    .line 117
    invoke-virtual {v0}, Landroidx/compose/ui/geometry/Offset$Companion;->getZero-F1C5BW0()J

    .line 118
    .line 119
    .line 120
    move-result-wide v13

    .line 121
    invoke-interface/range {p0 .. p0}, Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;->getViewConfiguration()Landroidx/compose/ui/platform/ViewConfiguration;

    .line 122
    .line 123
    .line 124
    move-result-object v0

    .line 125
    invoke-interface {v0}, Landroidx/compose/ui/platform/ViewConfiguration;->getTouchSlop()F

    .line 126
    .line 127
    .line 128
    move-result v0

    .line 129
    const/4 v3, 0x0

    .line 130
    const/4 v4, 0x0

    .line 131
    const/4 v6, 0x2

    .line 132
    const/4 v7, 0x0

    .line 133
    move-object/from16 v10, p0

    .line 134
    .line 135
    iput-object v10, v1, Landroidx/compose/foundation/gestures/TransformableKt$detectZoom$1;->L$0:Ljava/lang/Object;

    .line 136
    .line 137
    move-object/from16 v15, p1

    .line 138
    .line 139
    iput-object v15, v1, Landroidx/compose/foundation/gestures/TransformableKt$detectZoom$1;->L$1:Ljava/lang/Object;

    .line 140
    .line 141
    move-object/from16 v5, p2

    .line 142
    .line 143
    iput-object v5, v1, Landroidx/compose/foundation/gestures/TransformableKt$detectZoom$1;->L$2:Ljava/lang/Object;

    .line 144
    .line 145
    iput v11, v1, Landroidx/compose/foundation/gestures/TransformableKt$detectZoom$1;->F$0:F

    .line 146
    .line 147
    iput v9, v1, Landroidx/compose/foundation/gestures/TransformableKt$detectZoom$1;->F$1:F

    .line 148
    .line 149
    iput-wide v13, v1, Landroidx/compose/foundation/gestures/TransformableKt$detectZoom$1;->J$0:J

    .line 150
    .line 151
    iput v12, v1, Landroidx/compose/foundation/gestures/TransformableKt$detectZoom$1;->I$0:I

    .line 152
    .line 153
    iput v0, v1, Landroidx/compose/foundation/gestures/TransformableKt$detectZoom$1;->F$2:F

    .line 154
    .line 155
    iput v12, v1, Landroidx/compose/foundation/gestures/TransformableKt$detectZoom$1;->I$1:I

    .line 156
    .line 157
    const/4 v2, 0x1

    .line 158
    iput v2, v1, Landroidx/compose/foundation/gestures/TransformableKt$detectZoom$1;->label:I

    .line 159
    .line 160
    move-object/from16 v2, p0

    .line 161
    .line 162
    move-object v5, v1

    .line 163
    invoke-static/range {v2 .. v7}, Landroidx/compose/foundation/gestures/TapGestureDetectorKt;->awaitFirstDown$default(Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;ZLandroidx/compose/ui/input/pointer/PointerEventPass;Lkotlin/coroutines/Continuation;ILjava/lang/Object;)Ljava/lang/Object;

    .line 164
    .line 165
    .line 166
    move-result-object v2

    .line 167
    if-ne v2, v8, :cond_4

    .line 168
    .line 169
    return-object v8

    .line 170
    :cond_4
    move v3, v0

    .line 171
    move v7, v9

    .line 172
    move v2, v12

    .line 173
    move v4, v2

    .line 174
    move-wide v5, v13

    .line 175
    move-object v14, v15

    .line 176
    move-object/from16 v13, p2

    .line 177
    .line 178
    move-object v15, v10

    .line 179
    move v10, v11

    .line 180
    :goto_1
    move-object/from16 v25, v14

    .line 181
    .line 182
    move v14, v10

    .line 183
    move-object/from16 v10, v25

    .line 184
    .line 185
    move-object/from16 v26, v15

    .line 186
    .line 187
    move-object v15, v13

    .line 188
    move-object/from16 v13, v26

    .line 189
    .line 190
    :goto_2
    iput-object v13, v1, Landroidx/compose/foundation/gestures/TransformableKt$detectZoom$1;->L$0:Ljava/lang/Object;

    .line 191
    .line 192
    iput-object v10, v1, Landroidx/compose/foundation/gestures/TransformableKt$detectZoom$1;->L$1:Ljava/lang/Object;

    .line 193
    .line 194
    iput-object v15, v1, Landroidx/compose/foundation/gestures/TransformableKt$detectZoom$1;->L$2:Ljava/lang/Object;

    .line 195
    .line 196
    iput v14, v1, Landroidx/compose/foundation/gestures/TransformableKt$detectZoom$1;->F$0:F

    .line 197
    .line 198
    iput v7, v1, Landroidx/compose/foundation/gestures/TransformableKt$detectZoom$1;->F$1:F

    .line 199
    .line 200
    iput-wide v5, v1, Landroidx/compose/foundation/gestures/TransformableKt$detectZoom$1;->J$0:J

    .line 201
    .line 202
    iput v4, v1, Landroidx/compose/foundation/gestures/TransformableKt$detectZoom$1;->I$0:I

    .line 203
    .line 204
    iput v3, v1, Landroidx/compose/foundation/gestures/TransformableKt$detectZoom$1;->F$2:F

    .line 205
    .line 206
    iput v2, v1, Landroidx/compose/foundation/gestures/TransformableKt$detectZoom$1;->I$1:I

    .line 207
    .line 208
    const/4 v0, 0x2

    .line 209
    iput v0, v1, Landroidx/compose/foundation/gestures/TransformableKt$detectZoom$1;->label:I

    .line 210
    .line 211
    const/4 v0, 0x0

    .line 212
    const/4 v9, 0x1

    .line 213
    invoke-static {v13, v0, v1, v9, v0}, Landroidx/compose/ui/input/pointer/b;->t(Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;Landroidx/compose/ui/input/pointer/PointerEventPass;Lkotlin/coroutines/Continuation;ILjava/lang/Object;)Ljava/lang/Object;

    .line 214
    .line 215
    .line 216
    move-result-object v0

    .line 217
    if-ne v0, v8, :cond_5

    .line 218
    .line 219
    return-object v8

    .line 220
    :cond_5
    :goto_3
    check-cast v0, Landroidx/compose/ui/input/pointer/PointerEvent;

    .line 221
    .line 222
    invoke-virtual {v0}, Landroidx/compose/ui/input/pointer/PointerEvent;->getChanges()Ljava/util/List;

    .line 223
    .line 224
    .line 225
    move-result-object v9

    .line 226
    invoke-interface {v9}, Ljava/util/List;->size()I

    .line 227
    .line 228
    .line 229
    move-result v11

    .line 230
    :goto_4
    if-ge v12, v11, :cond_7

    .line 231
    .line 232
    invoke-interface {v9, v12}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 233
    .line 234
    .line 235
    move-result-object v19

    .line 236
    check-cast v19, Landroidx/compose/ui/input/pointer/PointerInputChange;

    .line 237
    .line 238
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/input/pointer/PointerInputChange;->isConsumed()Z

    .line 239
    .line 240
    .line 241
    move-result v19

    .line 242
    if-eqz v19, :cond_6

    .line 243
    .line 244
    const/4 v9, 0x1

    .line 245
    goto :goto_5

    .line 246
    :cond_6
    add-int/lit8 v12, v12, 0x1

    .line 247
    .line 248
    goto :goto_4

    .line 249
    :cond_7
    const/4 v9, 0x0

    .line 250
    :goto_5
    if-nez v9, :cond_13

    .line 251
    .line 252
    invoke-static {v0}, Landroidx/compose/foundation/gestures/TransformGestureDetectorKt;->calculateZoom(Landroidx/compose/ui/input/pointer/PointerEvent;)F

    .line 253
    .line 254
    .line 255
    move-result v20

    .line 256
    invoke-static {v0}, Landroidx/compose/foundation/gestures/TransformGestureDetectorKt;->calculateRotation(Landroidx/compose/ui/input/pointer/PointerEvent;)F

    .line 257
    .line 258
    .line 259
    move-result v11

    .line 260
    move-object/from16 p0, v1

    .line 261
    .line 262
    move/from16 p1, v2

    .line 263
    .line 264
    invoke-static {v0}, Landroidx/compose/foundation/gestures/TransformGestureDetectorKt;->calculatePan(Landroidx/compose/ui/input/pointer/PointerEvent;)J

    .line 265
    .line 266
    .line 267
    move-result-wide v1

    .line 268
    if-nez v4, :cond_a

    .line 269
    .line 270
    mul-float v7, v7, v20

    .line 271
    .line 272
    add-float/2addr v14, v11

    .line 273
    invoke-static {v5, v6, v1, v2}, Landroidx/compose/ui/geometry/Offset;->plus-MK-Hz9U(JJ)J

    .line 274
    .line 275
    .line 276
    move-result-wide v5

    .line 277
    const/4 v12, 0x0

    .line 278
    invoke-static {v0, v12}, Landroidx/compose/foundation/gestures/TransformGestureDetectorKt;->calculateCentroidSize(Landroidx/compose/ui/input/pointer/PointerEvent;Z)F

    .line 279
    .line 280
    .line 281
    move-result v18

    .line 282
    move/from16 v16, v4

    .line 283
    .line 284
    const/4 v12, 0x1

    .line 285
    int-to-float v4, v12

    .line 286
    sub-float/2addr v4, v7

    .line 287
    invoke-static {v4}, Ljava/lang/Math;->abs(F)F

    .line 288
    .line 289
    .line 290
    move-result v4

    .line 291
    mul-float v4, v4, v18

    .line 292
    .line 293
    const v19, 0x40490fdb    # (float)Math.PI

    .line 294
    .line 295
    .line 296
    mul-float v19, v19, v14

    .line 297
    .line 298
    mul-float v19, v19, v18

    .line 299
    .line 300
    const/high16 v18, 0x43340000    # 180.0f

    .line 301
    .line 302
    div-float v19, v19, v18

    .line 303
    .line 304
    invoke-static/range {v19 .. v19}, Ljava/lang/Math;->abs(F)F

    .line 305
    .line 306
    .line 307
    move-result v18

    .line 308
    invoke-static {v5, v6}, Landroidx/compose/ui/geometry/Offset;->getDistance-impl(J)F

    .line 309
    .line 310
    .line 311
    move-result v19

    .line 312
    cmpl-float v4, v4, v3

    .line 313
    .line 314
    if-gtz v4, :cond_8

    .line 315
    .line 316
    cmpl-float v4, v18, v3

    .line 317
    .line 318
    if-gtz v4, :cond_8

    .line 319
    .line 320
    cmpl-float v4, v19, v3

    .line 321
    .line 322
    if-lez v4, :cond_b

    .line 323
    .line 324
    :cond_8
    invoke-interface {v10}, Landroidx/compose/runtime/State;->getValue()Ljava/lang/Object;

    .line 325
    .line 326
    .line 327
    move-result-object v4

    .line 328
    check-cast v4, Ljava/lang/Boolean;

    .line 329
    .line 330
    invoke-virtual {v4}, Ljava/lang/Boolean;->booleanValue()Z

    .line 331
    .line 332
    .line 333
    move-result v4

    .line 334
    if-eqz v4, :cond_9

    .line 335
    .line 336
    cmpg-float v4, v18, v3

    .line 337
    .line 338
    if-gez v4, :cond_9

    .line 339
    .line 340
    move v4, v12

    .line 341
    goto :goto_6

    .line 342
    :cond_9
    const/4 v4, 0x0

    .line 343
    :goto_6
    sget-object v12, Landroidx/compose/foundation/gestures/TransformEvent$TransformStarted;->INSTANCE:Landroidx/compose/foundation/gestures/TransformEvent$TransformStarted;

    .line 344
    .line 345
    invoke-interface {v15, v12}, Lkotlinx/coroutines/channels/SendChannel;->trySend-JP2dKIU(Ljava/lang/Object;)Ljava/lang/Object;

    .line 346
    .line 347
    .line 348
    const/16 v16, 0x1

    .line 349
    .line 350
    goto :goto_7

    .line 351
    :cond_a
    move/from16 v16, v4

    .line 352
    .line 353
    :cond_b
    move/from16 v4, p1

    .line 354
    .line 355
    :goto_7
    if-eqz v16, :cond_12

    .line 356
    .line 357
    if-eqz v4, :cond_c

    .line 358
    .line 359
    const/4 v11, 0x0

    .line 360
    const/16 v23, 0x0

    .line 361
    .line 362
    goto :goto_8

    .line 363
    :cond_c
    move/from16 v23, v11

    .line 364
    .line 365
    const/4 v11, 0x0

    .line 366
    :goto_8
    cmpg-float v12, v23, v11

    .line 367
    .line 368
    if-nez v12, :cond_d

    .line 369
    .line 370
    const/4 v12, 0x1

    .line 371
    goto :goto_9

    .line 372
    :cond_d
    const/4 v12, 0x0

    .line 373
    :goto_9
    if-eqz v12, :cond_f

    .line 374
    .line 375
    const/high16 v12, 0x3f800000    # 1.0f

    .line 376
    .line 377
    cmpg-float v17, v20, v12

    .line 378
    .line 379
    if-nez v17, :cond_e

    .line 380
    .line 381
    const/16 v17, 0x1

    .line 382
    .line 383
    goto :goto_a

    .line 384
    :cond_e
    const/16 v17, 0x0

    .line 385
    .line 386
    :goto_a
    if-eqz v17, :cond_f

    .line 387
    .line 388
    sget-object v17, Landroidx/compose/ui/geometry/Offset;->Companion:Landroidx/compose/ui/geometry/Offset$Companion;

    .line 389
    .line 390
    invoke-virtual/range {v17 .. v17}, Landroidx/compose/ui/geometry/Offset$Companion;->getZero-F1C5BW0()J

    .line 391
    .line 392
    .line 393
    move-result-wide v11

    .line 394
    invoke-static {v1, v2, v11, v12}, Landroidx/compose/ui/geometry/Offset;->equals-impl0(JJ)Z

    .line 395
    .line 396
    .line 397
    move-result v11

    .line 398
    if-nez v11, :cond_10

    .line 399
    .line 400
    :cond_f
    new-instance v11, Landroidx/compose/foundation/gestures/TransformEvent$TransformDelta;

    .line 401
    .line 402
    const/16 v24, 0x0

    .line 403
    .line 404
    move-object/from16 v19, v11

    .line 405
    .line 406
    move-wide/from16 v21, v1

    .line 407
    .line 408
    invoke-direct/range {v19 .. v24}, Landroidx/compose/foundation/gestures/TransformEvent$TransformDelta;-><init>(FJFLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 409
    .line 410
    .line 411
    invoke-interface {v15, v11}, Lkotlinx/coroutines/channels/SendChannel;->trySend-JP2dKIU(Ljava/lang/Object;)Ljava/lang/Object;

    .line 412
    .line 413
    .line 414
    :cond_10
    invoke-virtual {v0}, Landroidx/compose/ui/input/pointer/PointerEvent;->getChanges()Ljava/util/List;

    .line 415
    .line 416
    .line 417
    move-result-object v1

    .line 418
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 419
    .line 420
    .line 421
    move-result v2

    .line 422
    const/4 v11, 0x0

    .line 423
    :goto_b
    if-ge v11, v2, :cond_12

    .line 424
    .line 425
    invoke-interface {v1, v11}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 426
    .line 427
    .line 428
    move-result-object v12

    .line 429
    check-cast v12, Landroidx/compose/ui/input/pointer/PointerInputChange;

    .line 430
    .line 431
    invoke-static {v12}, Landroidx/compose/ui/input/pointer/PointerEventKt;->positionChanged(Landroidx/compose/ui/input/pointer/PointerInputChange;)Z

    .line 432
    .line 433
    .line 434
    move-result v17

    .line 435
    if-eqz v17, :cond_11

    .line 436
    .line 437
    invoke-virtual {v12}, Landroidx/compose/ui/input/pointer/PointerInputChange;->consume()V

    .line 438
    .line 439
    .line 440
    :cond_11
    add-int/lit8 v11, v11, 0x1

    .line 441
    .line 442
    goto :goto_b

    .line 443
    :cond_12
    move v2, v4

    .line 444
    move/from16 v4, v16

    .line 445
    .line 446
    goto :goto_c

    .line 447
    :cond_13
    move-object/from16 p0, v1

    .line 448
    .line 449
    move/from16 p1, v2

    .line 450
    .line 451
    move/from16 v16, v4

    .line 452
    .line 453
    :goto_c
    if-nez v9, :cond_17

    .line 454
    .line 455
    invoke-virtual {v0}, Landroidx/compose/ui/input/pointer/PointerEvent;->getChanges()Ljava/util/List;

    .line 456
    .line 457
    .line 458
    move-result-object v0

    .line 459
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 460
    .line 461
    .line 462
    move-result v1

    .line 463
    const/4 v9, 0x0

    .line 464
    :goto_d
    if-ge v9, v1, :cond_15

    .line 465
    .line 466
    invoke-interface {v0, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 467
    .line 468
    .line 469
    move-result-object v11

    .line 470
    check-cast v11, Landroidx/compose/ui/input/pointer/PointerInputChange;

    .line 471
    .line 472
    invoke-virtual {v11}, Landroidx/compose/ui/input/pointer/PointerInputChange;->getPressed()Z

    .line 473
    .line 474
    .line 475
    move-result v11

    .line 476
    if-eqz v11, :cond_14

    .line 477
    .line 478
    const/4 v0, 0x1

    .line 479
    goto :goto_e

    .line 480
    :cond_14
    add-int/lit8 v9, v9, 0x1

    .line 481
    .line 482
    goto :goto_d

    .line 483
    :cond_15
    const/4 v0, 0x0

    .line 484
    :goto_e
    if-nez v0, :cond_16

    .line 485
    .line 486
    goto :goto_f

    .line 487
    :cond_16
    move-object/from16 v1, p0

    .line 488
    .line 489
    const/high16 v9, 0x3f800000    # 1.0f

    .line 490
    .line 491
    const/4 v11, 0x0

    .line 492
    const/4 v12, 0x0

    .line 493
    goto/16 :goto_2

    .line 494
    .line 495
    :cond_17
    :goto_f
    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 496
    .line 497
    return-object v0
.end method

.method public static final transformable(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/gestures/TransformableState;ZZ)Landroidx/compose/ui/Modifier;
    .locals 2

    .line 1
    const-string v0, "<this>"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string/jumbo v0, "state"

    .line 7
    .line 8
    .line 9
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    invoke-static {}, Landroidx/compose/ui/platform/InspectableValueKt;->isDebugInspectorInfoEnabled()Z

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    if-eqz v0, :cond_0

    .line 17
    .line 18
    new-instance v0, Landroidx/compose/foundation/gestures/TransformableKt$transformable$$inlined$debugInspectorInfo$1;

    .line 19
    .line 20
    invoke-direct {v0, p1, p3, p2}, Landroidx/compose/foundation/gestures/TransformableKt$transformable$$inlined$debugInspectorInfo$1;-><init>(Landroidx/compose/foundation/gestures/TransformableState;ZZ)V

    .line 21
    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    invoke-static {}, Landroidx/compose/ui/platform/InspectableValueKt;->getNoInspectorInfo()Lkotlin/jvm/functions/Function1;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    :goto_0
    new-instance v1, Landroidx/compose/foundation/gestures/TransformableKt$transformable$2;

    .line 29
    .line 30
    invoke-direct {v1, p2, p3, p1}, Landroidx/compose/foundation/gestures/TransformableKt$transformable$2;-><init>(ZZLandroidx/compose/foundation/gestures/TransformableState;)V

    .line 31
    .line 32
    .line 33
    invoke-static {p0, v0, v1}, Landroidx/compose/ui/ComposedModifierKt;->composed(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function3;)Landroidx/compose/ui/Modifier;

    .line 34
    .line 35
    .line 36
    move-result-object p0

    .line 37
    return-object p0
.end method

.method public static synthetic transformable$default(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/gestures/TransformableState;ZZILjava/lang/Object;)Landroidx/compose/ui/Modifier;
    .locals 0

    .line 1
    and-int/lit8 p5, p4, 0x2

    .line 2
    .line 3
    if-eqz p5, :cond_0

    .line 4
    .line 5
    const/4 p2, 0x0

    .line 6
    :cond_0
    and-int/lit8 p4, p4, 0x4

    .line 7
    .line 8
    if-eqz p4, :cond_1

    .line 9
    .line 10
    const/4 p3, 0x1

    .line 11
    :cond_1
    invoke-static {p0, p1, p2, p3}, Landroidx/compose/foundation/gestures/TransformableKt;->transformable(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/gestures/TransformableState;ZZ)Landroidx/compose/ui/Modifier;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    return-object p0
.end method
