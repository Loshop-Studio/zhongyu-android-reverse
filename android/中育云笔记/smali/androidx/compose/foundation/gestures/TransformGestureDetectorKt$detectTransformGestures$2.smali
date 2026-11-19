.class final Landroidx/compose/foundation/gestures/TransformGestureDetectorKt$detectTransformGestures$2;
.super Lkotlin/coroutines/jvm/internal/RestrictedSuspendLambda;
.source "SourceFile"

# interfaces
.implements Lhd/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/foundation/gestures/TransformGestureDetectorKt;->detectTransformGestures(Landroidx/compose/ui/input/pointer/PointerInputScope;ZLhd/r;Lvc/c;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/coroutines/jvm/internal/RestrictedSuspendLambda;",
        "Lhd/p;"
    }
.end annotation

.annotation runtime Lxc/d;
    c = "androidx.compose.foundation.gestures.TransformGestureDetectorKt$detectTransformGestures$2"
    f = "TransformGestureDetector.kt"
    l = {
        0x3c,
        0x3e
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field final synthetic $onGesture:Lhd/r;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lhd/r;"
        }
    .end annotation
.end field

.field final synthetic $panZoomLock:Z

.field F$0:F

.field F$1:F

.field F$2:F

.field I$0:I

.field I$1:I

.field J$0:J

.field private synthetic L$0:Ljava/lang/Object;

.field label:I


# direct methods
.method public constructor <init>(ZLhd/r;Lvc/c;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z",
            "Lhd/r;",
            "Lvc/c<",
            "-",
            "Landroidx/compose/foundation/gestures/TransformGestureDetectorKt$detectTransformGestures$2;",
            ">;)V"
        }
    .end annotation

    .line 1
    iput-boolean p1, p0, Landroidx/compose/foundation/gestures/TransformGestureDetectorKt$detectTransformGestures$2;->$panZoomLock:Z

    .line 2
    .line 3
    iput-object p2, p0, Landroidx/compose/foundation/gestures/TransformGestureDetectorKt$detectTransformGestures$2;->$onGesture:Lhd/r;

    .line 4
    .line 5
    const/4 p1, 0x2

    .line 6
    invoke-direct {p0, p1, p3}, Lkotlin/coroutines/jvm/internal/RestrictedSuspendLambda;-><init>(ILvc/c;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lvc/c;)Lvc/c;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            "Lvc/c<",
            "*>;)",
            "Lvc/c<",
            "Lqc/q;",
            ">;"
        }
    .end annotation

    .line 1
    new-instance v0, Landroidx/compose/foundation/gestures/TransformGestureDetectorKt$detectTransformGestures$2;

    .line 2
    .line 3
    iget-boolean v1, p0, Landroidx/compose/foundation/gestures/TransformGestureDetectorKt$detectTransformGestures$2;->$panZoomLock:Z

    .line 4
    .line 5
    iget-object v2, p0, Landroidx/compose/foundation/gestures/TransformGestureDetectorKt$detectTransformGestures$2;->$onGesture:Lhd/r;

    .line 6
    .line 7
    invoke-direct {v0, v1, v2, p2}, Landroidx/compose/foundation/gestures/TransformGestureDetectorKt$detectTransformGestures$2;-><init>(ZLhd/r;Lvc/c;)V

    .line 8
    .line 9
    .line 10
    iput-object p1, v0, Landroidx/compose/foundation/gestures/TransformGestureDetectorKt$detectTransformGestures$2;->L$0:Ljava/lang/Object;

    .line 11
    .line 12
    return-object v0
.end method

.method public final invoke(Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;Lvc/c;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;",
            "Lvc/c<",
            "-",
            "Lqc/q;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0, p1, p2}, Landroidx/compose/foundation/gestures/TransformGestureDetectorKt$detectTransformGestures$2;->create(Ljava/lang/Object;Lvc/c;)Lvc/c;

    move-result-object p1

    check-cast p1, Landroidx/compose/foundation/gestures/TransformGestureDetectorKt$detectTransformGestures$2;

    sget-object p2, Lqc/q;->a:Lqc/q;

    invoke-virtual {p1, p2}, Landroidx/compose/foundation/gestures/TransformGestureDetectorKt$detectTransformGestures$2;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;

    check-cast p2, Lvc/c;

    invoke-virtual {p0, p1, p2}, Landroidx/compose/foundation/gestures/TransformGestureDetectorKt$detectTransformGestures$2;->invoke(Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;Lvc/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 24

    .line 1
    move-object/from16 v3, p0

    .line 2
    .line 3
    invoke-static {}, Lwc/a;->f()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v6

    .line 7
    iget v0, v3, Landroidx/compose/foundation/gestures/TransformGestureDetectorKt$detectTransformGestures$2;->label:I

    .line 8
    .line 9
    const/high16 v7, 0x3f800000    # 1.0f

    .line 10
    .line 11
    const/4 v8, 0x2

    .line 12
    const/4 v9, 0x0

    .line 13
    const/4 v10, 0x0

    .line 14
    const/4 v11, 0x1

    .line 15
    if-eqz v0, :cond_2

    .line 16
    .line 17
    if-eq v0, v11, :cond_1

    .line 18
    .line 19
    if-ne v0, v8, :cond_0

    .line 20
    .line 21
    iget v0, v3, Landroidx/compose/foundation/gestures/TransformGestureDetectorKt$detectTransformGestures$2;->I$1:I

    .line 22
    .line 23
    iget v1, v3, Landroidx/compose/foundation/gestures/TransformGestureDetectorKt$detectTransformGestures$2;->F$2:F

    .line 24
    .line 25
    iget v2, v3, Landroidx/compose/foundation/gestures/TransformGestureDetectorKt$detectTransformGestures$2;->I$0:I

    .line 26
    .line 27
    iget-wide v4, v3, Landroidx/compose/foundation/gestures/TransformGestureDetectorKt$detectTransformGestures$2;->J$0:J

    .line 28
    .line 29
    iget v12, v3, Landroidx/compose/foundation/gestures/TransformGestureDetectorKt$detectTransformGestures$2;->F$1:F

    .line 30
    .line 31
    iget v13, v3, Landroidx/compose/foundation/gestures/TransformGestureDetectorKt$detectTransformGestures$2;->F$0:F

    .line 32
    .line 33
    iget-object v14, v3, Landroidx/compose/foundation/gestures/TransformGestureDetectorKt$detectTransformGestures$2;->L$0:Ljava/lang/Object;

    .line 34
    .line 35
    check-cast v14, Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;

    .line 36
    .line 37
    invoke-static/range {p1 .. p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 38
    .line 39
    .line 40
    move-object/from16 v15, p1

    .line 41
    .line 42
    goto/16 :goto_2

    .line 43
    .line 44
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 45
    .line 46
    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    .line 47
    .line 48
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 49
    .line 50
    .line 51
    throw v0

    .line 52
    :cond_1
    iget v0, v3, Landroidx/compose/foundation/gestures/TransformGestureDetectorKt$detectTransformGestures$2;->I$1:I

    .line 53
    .line 54
    iget v1, v3, Landroidx/compose/foundation/gestures/TransformGestureDetectorKt$detectTransformGestures$2;->F$2:F

    .line 55
    .line 56
    iget v2, v3, Landroidx/compose/foundation/gestures/TransformGestureDetectorKt$detectTransformGestures$2;->I$0:I

    .line 57
    .line 58
    iget-wide v4, v3, Landroidx/compose/foundation/gestures/TransformGestureDetectorKt$detectTransformGestures$2;->J$0:J

    .line 59
    .line 60
    iget v12, v3, Landroidx/compose/foundation/gestures/TransformGestureDetectorKt$detectTransformGestures$2;->F$1:F

    .line 61
    .line 62
    iget v13, v3, Landroidx/compose/foundation/gestures/TransformGestureDetectorKt$detectTransformGestures$2;->F$0:F

    .line 63
    .line 64
    iget-object v14, v3, Landroidx/compose/foundation/gestures/TransformGestureDetectorKt$detectTransformGestures$2;->L$0:Ljava/lang/Object;

    .line 65
    .line 66
    check-cast v14, Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;

    .line 67
    .line 68
    invoke-static/range {p1 .. p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 69
    .line 70
    .line 71
    goto :goto_0

    .line 72
    :cond_2
    invoke-static/range {p1 .. p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 73
    .line 74
    .line 75
    iget-object v0, v3, Landroidx/compose/foundation/gestures/TransformGestureDetectorKt$detectTransformGestures$2;->L$0:Ljava/lang/Object;

    .line 76
    .line 77
    check-cast v0, Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;

    .line 78
    .line 79
    sget-object v1, Landroidx/compose/ui/geometry/Offset;->Companion:Landroidx/compose/ui/geometry/Offset$Companion;

    .line 80
    .line 81
    invoke-virtual {v1}, Landroidx/compose/ui/geometry/Offset$Companion;->getZero-F1C5BW0()J

    .line 82
    .line 83
    .line 84
    move-result-wide v12

    .line 85
    invoke-interface {v0}, Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;->getViewConfiguration()Landroidx/compose/ui/platform/ViewConfiguration;

    .line 86
    .line 87
    .line 88
    move-result-object v1

    .line 89
    invoke-interface {v1}, Landroidx/compose/ui/platform/ViewConfiguration;->getTouchSlop()F

    .line 90
    .line 91
    .line 92
    move-result v14

    .line 93
    iput-object v0, v3, Landroidx/compose/foundation/gestures/TransformGestureDetectorKt$detectTransformGestures$2;->L$0:Ljava/lang/Object;

    .line 94
    .line 95
    iput v9, v3, Landroidx/compose/foundation/gestures/TransformGestureDetectorKt$detectTransformGestures$2;->F$0:F

    .line 96
    .line 97
    iput v7, v3, Landroidx/compose/foundation/gestures/TransformGestureDetectorKt$detectTransformGestures$2;->F$1:F

    .line 98
    .line 99
    iput-wide v12, v3, Landroidx/compose/foundation/gestures/TransformGestureDetectorKt$detectTransformGestures$2;->J$0:J

    .line 100
    .line 101
    iput v10, v3, Landroidx/compose/foundation/gestures/TransformGestureDetectorKt$detectTransformGestures$2;->I$0:I

    .line 102
    .line 103
    iput v14, v3, Landroidx/compose/foundation/gestures/TransformGestureDetectorKt$detectTransformGestures$2;->F$2:F

    .line 104
    .line 105
    iput v10, v3, Landroidx/compose/foundation/gestures/TransformGestureDetectorKt$detectTransformGestures$2;->I$1:I

    .line 106
    .line 107
    iput v11, v3, Landroidx/compose/foundation/gestures/TransformGestureDetectorKt$detectTransformGestures$2;->label:I

    .line 108
    .line 109
    const/4 v1, 0x0

    .line 110
    const/4 v2, 0x0

    .line 111
    const/4 v4, 0x2

    .line 112
    const/4 v5, 0x0

    .line 113
    invoke-static/range {v0 .. v5}, Landroidx/compose/foundation/gestures/TapGestureDetectorKt;->awaitFirstDown$default(Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;ZLandroidx/compose/ui/input/pointer/PointerEventPass;Lvc/c;ILjava/lang/Object;)Ljava/lang/Object;

    .line 114
    .line 115
    .line 116
    move-result-object v1

    .line 117
    if-ne v1, v6, :cond_3

    .line 118
    .line 119
    goto :goto_1

    .line 120
    :cond_3
    move v2, v10

    .line 121
    move-wide v4, v12

    .line 122
    move v1, v14

    .line 123
    move-object v14, v0

    .line 124
    move v12, v7

    .line 125
    move v13, v9

    .line 126
    move v0, v2

    .line 127
    :goto_0
    iput-object v14, v3, Landroidx/compose/foundation/gestures/TransformGestureDetectorKt$detectTransformGestures$2;->L$0:Ljava/lang/Object;

    .line 128
    .line 129
    iput v13, v3, Landroidx/compose/foundation/gestures/TransformGestureDetectorKt$detectTransformGestures$2;->F$0:F

    .line 130
    .line 131
    iput v12, v3, Landroidx/compose/foundation/gestures/TransformGestureDetectorKt$detectTransformGestures$2;->F$1:F

    .line 132
    .line 133
    iput-wide v4, v3, Landroidx/compose/foundation/gestures/TransformGestureDetectorKt$detectTransformGestures$2;->J$0:J

    .line 134
    .line 135
    iput v2, v3, Landroidx/compose/foundation/gestures/TransformGestureDetectorKt$detectTransformGestures$2;->I$0:I

    .line 136
    .line 137
    iput v1, v3, Landroidx/compose/foundation/gestures/TransformGestureDetectorKt$detectTransformGestures$2;->F$2:F

    .line 138
    .line 139
    iput v0, v3, Landroidx/compose/foundation/gestures/TransformGestureDetectorKt$detectTransformGestures$2;->I$1:I

    .line 140
    .line 141
    iput v8, v3, Landroidx/compose/foundation/gestures/TransformGestureDetectorKt$detectTransformGestures$2;->label:I

    .line 142
    .line 143
    const/4 v15, 0x0

    .line 144
    invoke-static {v14, v15, v3, v11, v15}, Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;->awaitPointerEvent$default(Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;Landroidx/compose/ui/input/pointer/PointerEventPass;Lvc/c;ILjava/lang/Object;)Ljava/lang/Object;

    .line 145
    .line 146
    .line 147
    move-result-object v15

    .line 148
    if-ne v15, v6, :cond_4

    .line 149
    .line 150
    :goto_1
    return-object v6

    .line 151
    :cond_4
    :goto_2
    check-cast v15, Landroidx/compose/ui/input/pointer/PointerEvent;

    .line 152
    .line 153
    move/from16 v16, v7

    .line 154
    .line 155
    invoke-virtual {v15}, Landroidx/compose/ui/input/pointer/PointerEvent;->getChanges()Ljava/util/List;

    .line 156
    .line 157
    .line 158
    move-result-object v7

    .line 159
    move-object/from16 v17, v7

    .line 160
    .line 161
    check-cast v17, Ljava/util/Collection;

    .line 162
    .line 163
    invoke-interface/range {v17 .. v17}, Ljava/util/Collection;->size()I

    .line 164
    .line 165
    .line 166
    move-result v8

    .line 167
    move/from16 v17, v9

    .line 168
    .line 169
    move v9, v10

    .line 170
    :goto_3
    if-ge v9, v8, :cond_6

    .line 171
    .line 172
    invoke-interface {v7, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 173
    .line 174
    .line 175
    move-result-object v18

    .line 176
    check-cast v18, Landroidx/compose/ui/input/pointer/PointerInputChange;

    .line 177
    .line 178
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/input/pointer/PointerInputChange;->isConsumed()Z

    .line 179
    .line 180
    .line 181
    move-result v18

    .line 182
    if-eqz v18, :cond_5

    .line 183
    .line 184
    move v7, v11

    .line 185
    goto :goto_4

    .line 186
    :cond_5
    add-int/lit8 v9, v9, 0x1

    .line 187
    .line 188
    goto :goto_3

    .line 189
    :cond_6
    move v7, v10

    .line 190
    :goto_4
    if-nez v7, :cond_11

    .line 191
    .line 192
    invoke-static {v15}, Landroidx/compose/foundation/gestures/TransformGestureDetectorKt;->calculateZoom(Landroidx/compose/ui/input/pointer/PointerEvent;)F

    .line 193
    .line 194
    .line 195
    move-result v8

    .line 196
    invoke-static {v15}, Landroidx/compose/foundation/gestures/TransformGestureDetectorKt;->calculateRotation(Landroidx/compose/ui/input/pointer/PointerEvent;)F

    .line 197
    .line 198
    .line 199
    move-result v9

    .line 200
    move/from16 p1, v12

    .line 201
    .line 202
    invoke-static {v15}, Landroidx/compose/foundation/gestures/TransformGestureDetectorKt;->calculatePan(Landroidx/compose/ui/input/pointer/PointerEvent;)J

    .line 203
    .line 204
    .line 205
    move-result-wide v11

    .line 206
    if-nez v2, :cond_a

    .line 207
    .line 208
    mul-float v19, p1, v8

    .line 209
    .line 210
    add-float/2addr v13, v9

    .line 211
    invoke-static {v4, v5, v11, v12}, Landroidx/compose/ui/geometry/Offset;->plus-MK-Hz9U(JJ)J

    .line 212
    .line 213
    .line 214
    move-result-wide v4

    .line 215
    invoke-static {v15, v10}, Landroidx/compose/foundation/gestures/TransformGestureDetectorKt;->calculateCentroidSize(Landroidx/compose/ui/input/pointer/PointerEvent;Z)F

    .line 216
    .line 217
    .line 218
    move-result v20

    .line 219
    move/from16 v18, v0

    .line 220
    .line 221
    const/4 v10, 0x1

    .line 222
    int-to-float v0, v10

    .line 223
    sub-float v0, v0, v19

    .line 224
    .line 225
    invoke-static {v0}, Ljava/lang/Math;->abs(F)F

    .line 226
    .line 227
    .line 228
    move-result v0

    .line 229
    mul-float v0, v0, v20

    .line 230
    .line 231
    const v22, 0x40490fdb    # (float)Math.PI

    .line 232
    .line 233
    .line 234
    mul-float v22, v22, v13

    .line 235
    .line 236
    mul-float v22, v22, v20

    .line 237
    .line 238
    const/high16 v20, 0x43340000    # 180.0f

    .line 239
    .line 240
    div-float v22, v22, v20

    .line 241
    .line 242
    invoke-static/range {v22 .. v22}, Ljava/lang/Math;->abs(F)F

    .line 243
    .line 244
    .line 245
    move-result v20

    .line 246
    invoke-static {v4, v5}, Landroidx/compose/ui/geometry/Offset;->getDistance-impl(J)F

    .line 247
    .line 248
    .line 249
    move-result v22

    .line 250
    cmpl-float v0, v0, v1

    .line 251
    .line 252
    if-gtz v0, :cond_8

    .line 253
    .line 254
    cmpl-float v0, v20, v1

    .line 255
    .line 256
    if-gtz v0, :cond_8

    .line 257
    .line 258
    cmpl-float v0, v22, v1

    .line 259
    .line 260
    if-lez v0, :cond_7

    .line 261
    .line 262
    goto :goto_5

    .line 263
    :cond_7
    move/from16 v0, v18

    .line 264
    .line 265
    goto :goto_7

    .line 266
    :cond_8
    :goto_5
    iget-boolean v0, v3, Landroidx/compose/foundation/gestures/TransformGestureDetectorKt$detectTransformGestures$2;->$panZoomLock:Z

    .line 267
    .line 268
    if-eqz v0, :cond_9

    .line 269
    .line 270
    cmpg-float v0, v20, v1

    .line 271
    .line 272
    if-gez v0, :cond_9

    .line 273
    .line 274
    move v0, v10

    .line 275
    goto :goto_6

    .line 276
    :cond_9
    const/4 v0, 0x0

    .line 277
    :goto_6
    move v2, v10

    .line 278
    goto :goto_7

    .line 279
    :cond_a
    move/from16 v18, v0

    .line 280
    .line 281
    const/4 v10, 0x1

    .line 282
    move/from16 v19, p1

    .line 283
    .line 284
    :goto_7
    if-eqz v2, :cond_f

    .line 285
    .line 286
    const/4 v10, 0x0

    .line 287
    invoke-static {v15, v10}, Landroidx/compose/foundation/gestures/TransformGestureDetectorKt;->calculateCentroid(Landroidx/compose/ui/input/pointer/PointerEvent;Z)J

    .line 288
    .line 289
    .line 290
    move-result-wide v21

    .line 291
    if-eqz v0, :cond_b

    .line 292
    .line 293
    move/from16 v9, v17

    .line 294
    .line 295
    :cond_b
    cmpg-float v18, v9, v17

    .line 296
    .line 297
    if-nez v18, :cond_c

    .line 298
    .line 299
    cmpg-float v18, v8, v16

    .line 300
    .line 301
    if-nez v18, :cond_c

    .line 302
    .line 303
    sget-object v18, Landroidx/compose/ui/geometry/Offset;->Companion:Landroidx/compose/ui/geometry/Offset$Companion;

    .line 304
    .line 305
    move/from16 p1, v0

    .line 306
    .line 307
    move/from16 v23, v1

    .line 308
    .line 309
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/geometry/Offset$Companion;->getZero-F1C5BW0()J

    .line 310
    .line 311
    .line 312
    move-result-wide v0

    .line 313
    invoke-static {v11, v12, v0, v1}, Landroidx/compose/ui/geometry/Offset;->equals-impl0(JJ)Z

    .line 314
    .line 315
    .line 316
    move-result v0

    .line 317
    if-nez v0, :cond_d

    .line 318
    .line 319
    goto :goto_8

    .line 320
    :cond_c
    move/from16 p1, v0

    .line 321
    .line 322
    move/from16 v23, v1

    .line 323
    .line 324
    :goto_8
    iget-object v0, v3, Landroidx/compose/foundation/gestures/TransformGestureDetectorKt$detectTransformGestures$2;->$onGesture:Lhd/r;

    .line 325
    .line 326
    invoke-static/range {v21 .. v22}, Landroidx/compose/ui/geometry/Offset;->box-impl(J)Landroidx/compose/ui/geometry/Offset;

    .line 327
    .line 328
    .line 329
    move-result-object v1

    .line 330
    invoke-static {v11, v12}, Landroidx/compose/ui/geometry/Offset;->box-impl(J)Landroidx/compose/ui/geometry/Offset;

    .line 331
    .line 332
    .line 333
    move-result-object v11

    .line 334
    invoke-static {v8}, Lxc/a;->b(F)Ljava/lang/Float;

    .line 335
    .line 336
    .line 337
    move-result-object v8

    .line 338
    invoke-static {v9}, Lxc/a;->b(F)Ljava/lang/Float;

    .line 339
    .line 340
    .line 341
    move-result-object v9

    .line 342
    invoke-interface {v0, v1, v11, v8, v9}, Lhd/r;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 343
    .line 344
    .line 345
    :cond_d
    invoke-virtual {v15}, Landroidx/compose/ui/input/pointer/PointerEvent;->getChanges()Ljava/util/List;

    .line 346
    .line 347
    .line 348
    move-result-object v0

    .line 349
    move-object v1, v0

    .line 350
    check-cast v1, Ljava/util/Collection;

    .line 351
    .line 352
    invoke-interface {v1}, Ljava/util/Collection;->size()I

    .line 353
    .line 354
    .line 355
    move-result v1

    .line 356
    move v8, v10

    .line 357
    :goto_9
    if-ge v8, v1, :cond_10

    .line 358
    .line 359
    invoke-interface {v0, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 360
    .line 361
    .line 362
    move-result-object v9

    .line 363
    check-cast v9, Landroidx/compose/ui/input/pointer/PointerInputChange;

    .line 364
    .line 365
    invoke-static {v9}, Landroidx/compose/ui/input/pointer/PointerEventKt;->positionChanged(Landroidx/compose/ui/input/pointer/PointerInputChange;)Z

    .line 366
    .line 367
    .line 368
    move-result v11

    .line 369
    if-eqz v11, :cond_e

    .line 370
    .line 371
    invoke-virtual {v9}, Landroidx/compose/ui/input/pointer/PointerInputChange;->consume()V

    .line 372
    .line 373
    .line 374
    :cond_e
    add-int/lit8 v8, v8, 0x1

    .line 375
    .line 376
    goto :goto_9

    .line 377
    :cond_f
    move/from16 p1, v0

    .line 378
    .line 379
    move/from16 v23, v1

    .line 380
    .line 381
    const/4 v10, 0x0

    .line 382
    :cond_10
    move/from16 v0, p1

    .line 383
    .line 384
    move/from16 v12, v19

    .line 385
    .line 386
    goto :goto_a

    .line 387
    :cond_11
    move/from16 v18, v0

    .line 388
    .line 389
    move/from16 v23, v1

    .line 390
    .line 391
    move/from16 p1, v12

    .line 392
    .line 393
    :goto_a
    if-nez v7, :cond_13

    .line 394
    .line 395
    invoke-virtual {v15}, Landroidx/compose/ui/input/pointer/PointerEvent;->getChanges()Ljava/util/List;

    .line 396
    .line 397
    .line 398
    move-result-object v1

    .line 399
    move-object v7, v1

    .line 400
    check-cast v7, Ljava/util/Collection;

    .line 401
    .line 402
    invoke-interface {v7}, Ljava/util/Collection;->size()I

    .line 403
    .line 404
    .line 405
    move-result v7

    .line 406
    move v8, v10

    .line 407
    :goto_b
    if-ge v8, v7, :cond_13

    .line 408
    .line 409
    invoke-interface {v1, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 410
    .line 411
    .line 412
    move-result-object v9

    .line 413
    check-cast v9, Landroidx/compose/ui/input/pointer/PointerInputChange;

    .line 414
    .line 415
    invoke-virtual {v9}, Landroidx/compose/ui/input/pointer/PointerInputChange;->getPressed()Z

    .line 416
    .line 417
    .line 418
    move-result v9

    .line 419
    if-eqz v9, :cond_12

    .line 420
    .line 421
    move/from16 v7, v16

    .line 422
    .line 423
    move/from16 v9, v17

    .line 424
    .line 425
    move/from16 v1, v23

    .line 426
    .line 427
    const/4 v8, 0x2

    .line 428
    const/4 v11, 0x1

    .line 429
    goto/16 :goto_0

    .line 430
    .line 431
    :cond_12
    add-int/lit8 v8, v8, 0x1

    .line 432
    .line 433
    goto :goto_b

    .line 434
    :cond_13
    sget-object v0, Lqc/q;->a:Lqc/q;

    .line 435
    .line 436
    return-object v0
.end method
