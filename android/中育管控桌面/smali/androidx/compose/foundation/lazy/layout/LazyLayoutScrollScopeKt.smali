.class public final Landroidx/compose/foundation/lazy/layout/LazyLayoutScrollScopeKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u001a\u0017\u0010\u0007\u001a\u00020\u00082\u000c\u0010\t\u001a\u0008\u0012\u0004\u0012\u00020\u000b0\nH\u0082\u0008\u001a2\u0010\u000c\u001a\u00020\u0008*\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0013H\u0080@\u00a2\u0006\u0002\u0010\u0014\u001a\u0014\u0010\u0015\u001a\u00020\u0004*\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0000\"\u0010\u0010\u0000\u001a\u00020\u0001X\u0082\u0004\u00a2\u0006\u0004\n\u0002\u0010\u0002\"\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\"\u0010\u0010\u0005\u001a\u00020\u0001X\u0082\u0004\u00a2\u0006\u0004\n\u0002\u0010\u0002\"\u0010\u0010\u0006\u001a\u00020\u0001X\u0082\u0004\u00a2\u0006\u0004\n\u0002\u0010\u0002\u00a8\u0006\u0016"
    }
    d2 = {
        "BoundDistance",
        "Landroidx/compose/ui/unit/Dp;",
        "F",
        "DEBUG",
        "",
        "MinimumDistance",
        "TargetDistance",
        "debugLog",
        "",
        "generateMsg",
        "Lkotlin/Function0;",
        "",
        "animateScrollToItem",
        "Landroidx/compose/foundation/lazy/layout/LazyLayoutScrollScope;",
        "index",
        "",
        "scrollOffset",
        "numOfItemsForTeleport",
        "density",
        "Landroidx/compose/ui/unit/Density;",
        "(Landroidx/compose/foundation/lazy/layout/LazyLayoutScrollScope;IIILandroidx/compose/ui/unit/Density;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "isItemVisible",
        "foundation_release"
    }
    k = 0x2
    mv = {
        0x1,
        0x9,
        0x0
    }
    xi = 0x30
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nLazyLayoutScrollScope.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyLayoutScrollScope.kt\nandroidx/compose/foundation/lazy/layout/LazyLayoutScrollScopeKt\n+ 2 InlineClassHelper.kt\nandroidx/compose/foundation/internal/InlineClassHelperKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,297:1\n42#1,4:304\n42#1,4:308\n96#2,5:298\n1#3:303\n113#4:312\n113#4:313\n113#4:314\n*S KotlinDebug\n*F\n+ 1 LazyLayoutScrollScope.kt\nandroidx/compose/foundation/lazy/layout/LazyLayoutScrollScopeKt\n*L\n169#1:304,4\n263#1:308,4\n116#1:298,5\n35#1:312\n36#1:313\n37#1:314\n*E\n"
    }
.end annotation


# static fields
.field private static final BoundDistance:F

.field private static final DEBUG:Z = false

.field private static final MinimumDistance:F

.field private static final TargetDistance:F


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const/16 v0, 0x9c4

    .line 2
    .line 3
    int-to-float v0, v0

    .line 4
    invoke-static {v0}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    sput v0, Landroidx/compose/foundation/lazy/layout/LazyLayoutScrollScopeKt;->TargetDistance:F

    .line 9
    .line 10
    const/16 v0, 0x5dc

    .line 11
    .line 12
    int-to-float v0, v0

    .line 13
    invoke-static {v0}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    sput v0, Landroidx/compose/foundation/lazy/layout/LazyLayoutScrollScopeKt;->BoundDistance:F

    .line 18
    .line 19
    const/16 v0, 0x32

    .line 20
    .line 21
    int-to-float v0, v0

    .line 22
    invoke-static {v0}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    sput v0, Landroidx/compose/foundation/lazy/layout/LazyLayoutScrollScopeKt;->MinimumDistance:F

    .line 27
    .line 28
    return-void
.end method

.method public static final synthetic access$animateScrollToItem$isOvershot(ZLandroidx/compose/foundation/lazy/layout/LazyLayoutScrollScope;II)Z
    .locals 0

    .line 1
    invoke-static {p0, p1, p2, p3}, Landroidx/compose/foundation/lazy/layout/LazyLayoutScrollScopeKt;->animateScrollToItem$isOvershot(ZLandroidx/compose/foundation/lazy/layout/LazyLayoutScrollScope;II)Z

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method

.method public static final animateScrollToItem(Landroidx/compose/foundation/lazy/layout/LazyLayoutScrollScope;IIILandroidx/compose/ui/unit/Density;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 37
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/foundation/lazy/layout/LazyLayoutScrollScope;",
            "III",
            "Landroidx/compose/ui/unit/Density;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    move/from16 v1, p1

    .line 2
    .line 3
    move-object/from16 v0, p4

    .line 4
    .line 5
    move-object/from16 v2, p5

    .line 6
    .line 7
    instance-of v3, v2, Landroidx/compose/foundation/lazy/layout/LazyLayoutScrollScopeKt$animateScrollToItem$1;

    .line 8
    .line 9
    if-eqz v3, :cond_0

    .line 10
    .line 11
    move-object v3, v2

    .line 12
    check-cast v3, Landroidx/compose/foundation/lazy/layout/LazyLayoutScrollScopeKt$animateScrollToItem$1;

    .line 13
    .line 14
    iget v4, v3, Landroidx/compose/foundation/lazy/layout/LazyLayoutScrollScopeKt$animateScrollToItem$1;->label:I

    .line 15
    .line 16
    const/high16 v5, -0x80000000

    .line 17
    .line 18
    and-int v6, v4, v5

    .line 19
    .line 20
    if-eqz v6, :cond_0

    .line 21
    .line 22
    sub-int/2addr v4, v5

    .line 23
    iput v4, v3, Landroidx/compose/foundation/lazy/layout/LazyLayoutScrollScopeKt$animateScrollToItem$1;->label:I

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_0
    new-instance v3, Landroidx/compose/foundation/lazy/layout/LazyLayoutScrollScopeKt$animateScrollToItem$1;

    .line 27
    .line 28
    invoke-direct {v3, v2}, Landroidx/compose/foundation/lazy/layout/LazyLayoutScrollScopeKt$animateScrollToItem$1;-><init>(Lkotlin/coroutines/Continuation;)V

    .line 29
    .line 30
    .line 31
    :goto_0
    iget-object v2, v3, Landroidx/compose/foundation/lazy/layout/LazyLayoutScrollScopeKt$animateScrollToItem$1;->result:Ljava/lang/Object;

    .line 32
    .line 33
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object v4

    .line 37
    iget v5, v3, Landroidx/compose/foundation/lazy/layout/LazyLayoutScrollScopeKt$animateScrollToItem$1;->label:I

    .line 38
    .line 39
    const/4 v7, 0x2

    .line 40
    const/4 v9, 0x0

    .line 41
    const/4 v10, 0x1

    .line 42
    if-eqz v5, :cond_3

    .line 43
    .line 44
    if-eq v5, v10, :cond_2

    .line 45
    .line 46
    if-ne v5, v7, :cond_1

    .line 47
    .line 48
    iget v0, v3, Landroidx/compose/foundation/lazy/layout/LazyLayoutScrollScopeKt$animateScrollToItem$1;->I$1:I

    .line 49
    .line 50
    iget v1, v3, Landroidx/compose/foundation/lazy/layout/LazyLayoutScrollScopeKt$animateScrollToItem$1;->I$0:I

    .line 51
    .line 52
    iget-object v3, v3, Landroidx/compose/foundation/lazy/layout/LazyLayoutScrollScopeKt$animateScrollToItem$1;->L$0:Ljava/lang/Object;

    .line 53
    .line 54
    check-cast v3, Landroidx/compose/foundation/lazy/layout/LazyLayoutScrollScope;

    .line 55
    .line 56
    invoke-static {v2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 57
    .line 58
    .line 59
    goto/16 :goto_13

    .line 60
    .line 61
    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 62
    .line 63
    const-string/jumbo v1, "call to \'resume\' before \'invoke\' with coroutine"

    .line 64
    .line 65
    .line 66
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 67
    .line 68
    .line 69
    throw v0

    .line 70
    :cond_2
    iget v0, v3, Landroidx/compose/foundation/lazy/layout/LazyLayoutScrollScopeKt$animateScrollToItem$1;->I$3:I

    .line 71
    .line 72
    iget v1, v3, Landroidx/compose/foundation/lazy/layout/LazyLayoutScrollScopeKt$animateScrollToItem$1;->F$2:F

    .line 73
    .line 74
    iget v5, v3, Landroidx/compose/foundation/lazy/layout/LazyLayoutScrollScopeKt$animateScrollToItem$1;->F$1:F

    .line 75
    .line 76
    iget v11, v3, Landroidx/compose/foundation/lazy/layout/LazyLayoutScrollScopeKt$animateScrollToItem$1;->F$0:F

    .line 77
    .line 78
    iget v12, v3, Landroidx/compose/foundation/lazy/layout/LazyLayoutScrollScopeKt$animateScrollToItem$1;->I$2:I

    .line 79
    .line 80
    iget v13, v3, Landroidx/compose/foundation/lazy/layout/LazyLayoutScrollScopeKt$animateScrollToItem$1;->I$1:I

    .line 81
    .line 82
    iget v14, v3, Landroidx/compose/foundation/lazy/layout/LazyLayoutScrollScopeKt$animateScrollToItem$1;->I$0:I

    .line 83
    .line 84
    iget-object v15, v3, Landroidx/compose/foundation/lazy/layout/LazyLayoutScrollScopeKt$animateScrollToItem$1;->L$3:Ljava/lang/Object;

    .line 85
    .line 86
    check-cast v15, Lkotlin/jvm/internal/Ref$IntRef;

    .line 87
    .line 88
    const/16 p5, 0x0

    .line 89
    .line 90
    iget-object v6, v3, Landroidx/compose/foundation/lazy/layout/LazyLayoutScrollScopeKt$animateScrollToItem$1;->L$2:Ljava/lang/Object;

    .line 91
    .line 92
    check-cast v6, Lkotlin/jvm/internal/Ref$ObjectRef;

    .line 93
    .line 94
    iget-object v7, v3, Landroidx/compose/foundation/lazy/layout/LazyLayoutScrollScopeKt$animateScrollToItem$1;->L$1:Ljava/lang/Object;

    .line 95
    .line 96
    check-cast v7, Lkotlin/jvm/internal/Ref$BooleanRef;

    .line 97
    .line 98
    iget-object v8, v3, Landroidx/compose/foundation/lazy/layout/LazyLayoutScrollScopeKt$animateScrollToItem$1;->L$0:Ljava/lang/Object;

    .line 99
    .line 100
    check-cast v8, Landroidx/compose/foundation/lazy/layout/LazyLayoutScrollScope;

    .line 101
    .line 102
    :try_start_0
    invoke-static {v2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V
    :try_end_0
    .catch Landroidx/compose/foundation/lazy/layout/ItemFoundInScroll; {:try_start_0 .. :try_end_0} :catch_0

    .line 103
    .line 104
    .line 105
    move-object v2, v7

    .line 106
    move-object v7, v6

    .line 107
    move-object v6, v2

    .line 108
    move/from16 v23, v5

    .line 109
    .line 110
    move v10, v12

    .line 111
    move/from16 v26, v13

    .line 112
    .line 113
    move-object v5, v3

    .line 114
    move v3, v1

    .line 115
    move-object v1, v8

    .line 116
    :goto_1
    move v2, v14

    .line 117
    goto/16 :goto_b

    .line 118
    .line 119
    :catch_0
    move-exception v0

    .line 120
    move-object v2, v8

    .line 121
    move v5, v9

    .line 122
    move v9, v13

    .line 123
    goto/16 :goto_f

    .line 124
    .line 125
    :cond_3
    const/16 p5, 0x0

    .line 126
    .line 127
    invoke-static {v2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 128
    .line 129
    .line 130
    int-to-float v2, v1

    .line 131
    cmpl-float v2, v2, p5

    .line 132
    .line 133
    if-ltz v2, :cond_4

    .line 134
    .line 135
    move v2, v10

    .line 136
    goto :goto_2

    .line 137
    :cond_4
    move v2, v9

    .line 138
    :goto_2
    if-nez v2, :cond_5

    .line 139
    .line 140
    const-string v2, "Index should be non-negative"

    .line 141
    .line 142
    invoke-static {v2}, Landroidx/compose/foundation/internal/InlineClassHelperKt;->throwIllegalArgumentException(Ljava/lang/String;)V

    .line 143
    .line 144
    .line 145
    :cond_5
    :try_start_1
    sget v2, Landroidx/compose/foundation/lazy/layout/LazyLayoutScrollScopeKt;->TargetDistance:F

    .line 146
    .line 147
    invoke-interface {v0, v2}, Landroidx/compose/ui/unit/Density;->toPx-0680j_4(F)F

    .line 148
    .line 149
    .line 150
    move-result v2

    .line 151
    sget v5, Landroidx/compose/foundation/lazy/layout/LazyLayoutScrollScopeKt;->BoundDistance:F

    .line 152
    .line 153
    invoke-interface {v0, v5}, Landroidx/compose/ui/unit/Density;->toPx-0680j_4(F)F

    .line 154
    .line 155
    .line 156
    move-result v5

    .line 157
    sget v6, Landroidx/compose/foundation/lazy/layout/LazyLayoutScrollScopeKt;->MinimumDistance:F

    .line 158
    .line 159
    invoke-interface {v0, v6}, Landroidx/compose/ui/unit/Density;->toPx-0680j_4(F)F

    .line 160
    .line 161
    .line 162
    move-result v0

    .line 163
    new-instance v6, Lkotlin/jvm/internal/Ref$BooleanRef;

    .line 164
    .line 165
    invoke-direct {v6}, Lkotlin/jvm/internal/Ref$BooleanRef;-><init>()V

    .line 166
    .line 167
    .line 168
    iput-boolean v10, v6, Lkotlin/jvm/internal/Ref$BooleanRef;->element:Z

    .line 169
    .line 170
    new-instance v7, Lkotlin/jvm/internal/Ref$ObjectRef;

    .line 171
    .line 172
    invoke-direct {v7}, Lkotlin/jvm/internal/Ref$ObjectRef;-><init>()V

    .line 173
    .line 174
    .line 175
    const/16 v23, 0x1e

    .line 176
    .line 177
    const/16 v24, 0x0

    .line 178
    .line 179
    const/16 v16, 0x0

    .line 180
    .line 181
    const/16 v17, 0x0

    .line 182
    .line 183
    const-wide/16 v18, 0x0

    .line 184
    .line 185
    const-wide/16 v20, 0x0

    .line 186
    .line 187
    const/16 v22, 0x0

    .line 188
    .line 189
    invoke-static/range {v16 .. v24}, Landroidx/compose/animation/core/AnimationStateKt;->AnimationState$default(FFJJZILjava/lang/Object;)Landroidx/compose/animation/core/AnimationState;

    .line 190
    .line 191
    .line 192
    move-result-object v8

    .line 193
    iput-object v8, v7, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    .line 194
    .line 195
    invoke-static/range {p0 .. p1}, Landroidx/compose/foundation/lazy/layout/LazyLayoutScrollScopeKt;->isItemVisible(Landroidx/compose/foundation/lazy/layout/LazyLayoutScrollScope;I)Z

    .line 196
    .line 197
    .line 198
    move-result v8
    :try_end_1
    .catch Landroidx/compose/foundation/lazy/layout/ItemFoundInScroll; {:try_start_1 .. :try_end_1} :catch_9

    .line 199
    if-nez v8, :cond_d

    .line 200
    .line 201
    :try_start_2
    invoke-interface/range {p0 .. p0}, Landroidx/compose/foundation/lazy/layout/LazyLayoutScrollScope;->getFirstVisibleItemIndex()I

    .line 202
    .line 203
    .line 204
    move-result v8

    .line 205
    if-le v1, v8, :cond_6

    .line 206
    .line 207
    move v8, v10

    .line 208
    goto :goto_3

    .line 209
    :cond_6
    move v8, v9

    .line 210
    :goto_3
    new-instance v11, Lkotlin/jvm/internal/Ref$IntRef;

    .line 211
    .line 212
    invoke-direct {v11}, Lkotlin/jvm/internal/Ref$IntRef;-><init>()V

    .line 213
    .line 214
    .line 215
    iput v10, v11, Lkotlin/jvm/internal/Ref$IntRef;->element:I
    :try_end_2
    .catch Landroidx/compose/foundation/lazy/layout/ItemFoundInScroll; {:try_start_2 .. :try_end_2} :catch_7

    .line 216
    .line 217
    move/from16 v26, p2

    .line 218
    .line 219
    move/from16 v25, p3

    .line 220
    .line 221
    move/from16 v23, v5

    .line 222
    .line 223
    move-object/from16 v24, v11

    .line 224
    .line 225
    move v11, v2

    .line 226
    move-object v5, v3

    .line 227
    move v3, v0

    .line 228
    move v2, v1

    .line 229
    move v0, v8

    .line 230
    move-object/from16 v1, p0

    .line 231
    .line 232
    :goto_4
    :try_start_3
    iget-boolean v8, v6, Lkotlin/jvm/internal/Ref$BooleanRef;->element:Z

    .line 233
    .line 234
    if-eqz v8, :cond_10

    .line 235
    .line 236
    invoke-interface {v1}, Landroidx/compose/foundation/lazy/layout/LazyLayoutScrollScope;->getItemCount()I

    .line 237
    .line 238
    .line 239
    move-result v8

    .line 240
    if-lez v8, :cond_10

    .line 241
    .line 242
    const/4 v8, 0x2

    .line 243
    const/4 v12, 0x0

    .line 244
    invoke-static {v1, v2, v9, v8, v12}, Landroidx/compose/foundation/lazy/layout/LazyLayoutScrollScope;->calculateDistanceTo$default(Landroidx/compose/foundation/lazy/layout/LazyLayoutScrollScope;IIILjava/lang/Object;)I

    .line 245
    .line 246
    .line 247
    move-result v13

    .line 248
    add-int v13, v13, v26

    .line 249
    .line 250
    invoke-static {v13}, Ljava/lang/Math;->abs(I)I

    .line 251
    .line 252
    .line 253
    move-result v8
    :try_end_3
    .catch Landroidx/compose/foundation/lazy/layout/ItemFoundInScroll; {:try_start_3 .. :try_end_3} :catch_6

    .line 254
    int-to-float v8, v8

    .line 255
    cmpg-float v8, v8, v11

    .line 256
    .line 257
    if-gez v8, :cond_8

    .line 258
    .line 259
    int-to-float v8, v13

    .line 260
    :try_start_4
    invoke-static {v8}, Ljava/lang/Math;->abs(F)F

    .line 261
    .line 262
    .line 263
    move-result v8

    .line 264
    invoke-static {v8, v3}, Ljava/lang/Math;->max(FF)F

    .line 265
    .line 266
    .line 267
    move-result v8
    :try_end_4
    .catch Landroidx/compose/foundation/lazy/layout/ItemFoundInScroll; {:try_start_4 .. :try_end_4} :catch_1

    .line 268
    if-eqz v0, :cond_7

    .line 269
    .line 270
    :goto_5
    move/from16 v19, v8

    .line 271
    .line 272
    goto :goto_7

    .line 273
    :cond_7
    neg-float v8, v8

    .line 274
    goto :goto_5

    .line 275
    :catch_1
    move-exception v0

    .line 276
    move v14, v2

    .line 277
    move-object v3, v5

    .line 278
    move v5, v9

    .line 279
    move/from16 v9, v26

    .line 280
    .line 281
    :goto_6
    move-object v2, v1

    .line 282
    goto/16 :goto_f

    .line 283
    .line 284
    :cond_8
    if-eqz v0, :cond_9

    .line 285
    .line 286
    move/from16 v19, v11

    .line 287
    .line 288
    goto :goto_7

    .line 289
    :cond_9
    neg-float v8, v11

    .line 290
    goto :goto_5

    .line 291
    :goto_7
    :try_start_5
    iget-object v8, v7, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    .line 292
    .line 293
    move-object/from16 v27, v8

    .line 294
    .line 295
    check-cast v27, Landroidx/compose/animation/core/AnimationState;

    .line 296
    .line 297
    const/16 v35, 0x1e

    .line 298
    .line 299
    const/16 v36, 0x0

    .line 300
    .line 301
    const/16 v28, 0x0

    .line 302
    .line 303
    const/16 v29, 0x0

    .line 304
    .line 305
    const-wide/16 v30, 0x0

    .line 306
    .line 307
    const-wide/16 v32, 0x0

    .line 308
    .line 309
    const/16 v34, 0x0

    .line 310
    .line 311
    invoke-static/range {v27 .. v36}, Landroidx/compose/animation/core/AnimationStateKt;->copy$default(Landroidx/compose/animation/core/AnimationState;FFJJZILjava/lang/Object;)Landroidx/compose/animation/core/AnimationState;

    .line 312
    .line 313
    .line 314
    move-result-object v8

    .line 315
    iput-object v8, v7, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    .line 316
    .line 317
    new-instance v20, Lkotlin/jvm/internal/Ref$FloatRef;

    .line 318
    .line 319
    invoke-direct/range {v20 .. v20}, Lkotlin/jvm/internal/Ref$FloatRef;-><init>()V

    .line 320
    .line 321
    .line 322
    iget-object v8, v7, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    .line 323
    .line 324
    check-cast v8, Landroidx/compose/animation/core/AnimationState;

    .line 325
    .line 326
    invoke-static/range {v19 .. v19}, Lkotlin/coroutines/jvm/internal/Boxing;->boxFloat(F)Ljava/lang/Float;

    .line 327
    .line 328
    .line 329
    move-result-object v12

    .line 330
    iget-object v13, v7, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    .line 331
    .line 332
    check-cast v13, Landroidx/compose/animation/core/AnimationState;

    .line 333
    .line 334
    invoke-virtual {v13}, Landroidx/compose/animation/core/AnimationState;->getVelocity()Ljava/lang/Object;

    .line 335
    .line 336
    .line 337
    move-result-object v13

    .line 338
    check-cast v13, Ljava/lang/Number;

    .line 339
    .line 340
    invoke-virtual {v13}, Ljava/lang/Number;->floatValue()F

    .line 341
    .line 342
    .line 343
    move-result v13

    .line 344
    cmpg-float v13, v13, p5

    .line 345
    .line 346
    if-nez v13, :cond_a

    .line 347
    .line 348
    move v13, v10

    .line 349
    goto :goto_8

    .line 350
    :cond_a
    move v13, v9

    .line 351
    :goto_8
    xor-int/2addr v13, v10

    .line 352
    new-instance v16, Landroidx/compose/foundation/lazy/layout/LazyLayoutScrollScopeKt$animateScrollToItem$4;
    :try_end_5
    .catch Landroidx/compose/foundation/lazy/layout/ItemFoundInScroll; {:try_start_5 .. :try_end_5} :catch_6

    .line 353
    .line 354
    if-eqz v0, :cond_b

    .line 355
    .line 356
    move/from16 v22, v10

    .line 357
    .line 358
    :goto_9
    move-object/from16 v17, v1

    .line 359
    .line 360
    move/from16 v18, v2

    .line 361
    .line 362
    move-object/from16 v21, v6

    .line 363
    .line 364
    move-object/from16 v27, v7

    .line 365
    .line 366
    goto :goto_a

    .line 367
    :cond_b
    move/from16 v22, v9

    .line 368
    .line 369
    goto :goto_9

    .line 370
    :goto_a
    :try_start_6
    invoke-direct/range {v16 .. v27}, Landroidx/compose/foundation/lazy/layout/LazyLayoutScrollScopeKt$animateScrollToItem$4;-><init>(Landroidx/compose/foundation/lazy/layout/LazyLayoutScrollScope;IFLkotlin/jvm/internal/Ref$FloatRef;Lkotlin/jvm/internal/Ref$BooleanRef;ZFLkotlin/jvm/internal/Ref$IntRef;IILkotlin/jvm/internal/Ref$ObjectRef;)V
    :try_end_6
    .catch Landroidx/compose/foundation/lazy/layout/ItemFoundInScroll; {:try_start_6 .. :try_end_6} :catch_5

    .line 371
    .line 372
    .line 373
    move-object/from16 v2, v17

    .line 374
    .line 375
    move/from16 v14, v18

    .line 376
    .line 377
    move-object/from16 v7, v21

    .line 378
    .line 379
    move/from16 v1, v23

    .line 380
    .line 381
    move-object/from16 v15, v24

    .line 382
    .line 383
    move/from16 v10, v25

    .line 384
    .line 385
    move/from16 v9, v26

    .line 386
    .line 387
    move-object/from16 v6, v27

    .line 388
    .line 389
    :try_start_7
    iput-object v2, v5, Landroidx/compose/foundation/lazy/layout/LazyLayoutScrollScopeKt$animateScrollToItem$1;->L$0:Ljava/lang/Object;

    .line 390
    .line 391
    iput-object v7, v5, Landroidx/compose/foundation/lazy/layout/LazyLayoutScrollScopeKt$animateScrollToItem$1;->L$1:Ljava/lang/Object;

    .line 392
    .line 393
    iput-object v6, v5, Landroidx/compose/foundation/lazy/layout/LazyLayoutScrollScopeKt$animateScrollToItem$1;->L$2:Ljava/lang/Object;

    .line 394
    .line 395
    iput-object v15, v5, Landroidx/compose/foundation/lazy/layout/LazyLayoutScrollScopeKt$animateScrollToItem$1;->L$3:Ljava/lang/Object;

    .line 396
    .line 397
    iput v14, v5, Landroidx/compose/foundation/lazy/layout/LazyLayoutScrollScopeKt$animateScrollToItem$1;->I$0:I

    .line 398
    .line 399
    iput v9, v5, Landroidx/compose/foundation/lazy/layout/LazyLayoutScrollScopeKt$animateScrollToItem$1;->I$1:I

    .line 400
    .line 401
    iput v10, v5, Landroidx/compose/foundation/lazy/layout/LazyLayoutScrollScopeKt$animateScrollToItem$1;->I$2:I

    .line 402
    .line 403
    iput v11, v5, Landroidx/compose/foundation/lazy/layout/LazyLayoutScrollScopeKt$animateScrollToItem$1;->F$0:F

    .line 404
    .line 405
    iput v1, v5, Landroidx/compose/foundation/lazy/layout/LazyLayoutScrollScopeKt$animateScrollToItem$1;->F$1:F

    .line 406
    .line 407
    iput v3, v5, Landroidx/compose/foundation/lazy/layout/LazyLayoutScrollScopeKt$animateScrollToItem$1;->F$2:F

    .line 408
    .line 409
    iput v0, v5, Landroidx/compose/foundation/lazy/layout/LazyLayoutScrollScopeKt$animateScrollToItem$1;->I$3:I

    .line 410
    .line 411
    move/from16 v26, v1

    .line 412
    .line 413
    const/4 v1, 0x1

    .line 414
    iput v1, v5, Landroidx/compose/foundation/lazy/layout/LazyLayoutScrollScopeKt$animateScrollToItem$1;->label:I
    :try_end_7
    .catch Landroidx/compose/foundation/lazy/layout/ItemFoundInScroll; {:try_start_7 .. :try_end_7} :catch_4

    .line 415
    .line 416
    const/16 v18, 0x0

    .line 417
    .line 418
    const/16 v22, 0x2

    .line 419
    .line 420
    const/16 v23, 0x0

    .line 421
    .line 422
    move-object/from16 v21, v5

    .line 423
    .line 424
    move-object/from16 v17, v12

    .line 425
    .line 426
    move/from16 v19, v13

    .line 427
    .line 428
    move-object/from16 v20, v16

    .line 429
    .line 430
    move-object/from16 v16, v8

    .line 431
    .line 432
    :try_start_8
    invoke-static/range {v16 .. v23}, Landroidx/compose/animation/core/SuspendAnimationKt;->animateTo$default(Landroidx/compose/animation/core/AnimationState;Ljava/lang/Object;Landroidx/compose/animation/core/AnimationSpec;ZLkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;ILjava/lang/Object;)Ljava/lang/Object;

    .line 433
    .line 434
    .line 435
    move-result-object v1
    :try_end_8
    .catch Landroidx/compose/foundation/lazy/layout/ItemFoundInScroll; {:try_start_8 .. :try_end_8} :catch_3

    .line 436
    if-ne v1, v4, :cond_c

    .line 437
    .line 438
    goto/16 :goto_12

    .line 439
    .line 440
    :cond_c
    move-object v1, v7

    .line 441
    move-object v7, v6

    .line 442
    move-object v6, v1

    .line 443
    move-object v1, v2

    .line 444
    move-object/from16 v5, v21

    .line 445
    .line 446
    move/from16 v23, v26

    .line 447
    .line 448
    move/from16 v26, v9

    .line 449
    .line 450
    goto/16 :goto_1

    .line 451
    .line 452
    :goto_b
    :try_start_9
    iget v8, v15, Lkotlin/jvm/internal/Ref$IntRef;->element:I

    .line 453
    .line 454
    const/16 v25, 0x1

    .line 455
    .line 456
    add-int/lit8 v8, v8, 0x1

    .line 457
    .line 458
    iput v8, v15, Lkotlin/jvm/internal/Ref$IntRef;->element:I
    :try_end_9
    .catch Landroidx/compose/foundation/lazy/layout/ItemFoundInScroll; {:try_start_9 .. :try_end_9} :catch_2

    .line 459
    .line 460
    move/from16 v25, v10

    .line 461
    .line 462
    move-object/from16 v24, v15

    .line 463
    .line 464
    const/4 v9, 0x0

    .line 465
    const/4 v10, 0x1

    .line 466
    goto/16 :goto_4

    .line 467
    .line 468
    :catch_2
    move-exception v0

    .line 469
    move v14, v2

    .line 470
    move-object v3, v5

    .line 471
    move/from16 v9, v26

    .line 472
    .line 473
    const/4 v5, 0x0

    .line 474
    goto/16 :goto_6

    .line 475
    .line 476
    :catch_3
    move-exception v0

    .line 477
    :goto_c
    move-object/from16 v3, v21

    .line 478
    .line 479
    :goto_d
    const/4 v5, 0x0

    .line 480
    goto :goto_f

    .line 481
    :catch_4
    move-exception v0

    .line 482
    move-object/from16 v21, v5

    .line 483
    .line 484
    goto :goto_c

    .line 485
    :catch_5
    move-exception v0

    .line 486
    move-object/from16 v21, v5

    .line 487
    .line 488
    move-object/from16 v2, v17

    .line 489
    .line 490
    move/from16 v14, v18

    .line 491
    .line 492
    move/from16 v9, v26

    .line 493
    .line 494
    goto :goto_c

    .line 495
    :catch_6
    move-exception v0

    .line 496
    move v14, v2

    .line 497
    move-object/from16 v21, v5

    .line 498
    .line 499
    move/from16 v9, v26

    .line 500
    .line 501
    move-object v2, v1

    .line 502
    goto :goto_c

    .line 503
    :catch_7
    move-exception v0

    .line 504
    move-object/from16 v2, p0

    .line 505
    .line 506
    move/from16 v9, p2

    .line 507
    .line 508
    move v14, v1

    .line 509
    goto :goto_d

    .line 510
    :cond_d
    move-object/from16 v2, p0

    .line 511
    .line 512
    move v5, v9

    .line 513
    const/4 v8, 0x2

    .line 514
    const/4 v12, 0x0

    .line 515
    :try_start_a
    invoke-static {v2, v1, v5, v8, v12}, Landroidx/compose/foundation/lazy/layout/LazyLayoutScrollScope;->calculateDistanceTo$default(Landroidx/compose/foundation/lazy/layout/LazyLayoutScrollScope;IIILjava/lang/Object;)I

    .line 516
    .line 517
    .line 518
    move-result v0

    .line 519
    new-instance v6, Landroidx/compose/foundation/lazy/layout/ItemFoundInScroll;

    .line 520
    .line 521
    iget-object v7, v7, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    .line 522
    .line 523
    check-cast v7, Landroidx/compose/animation/core/AnimationState;

    .line 524
    .line 525
    invoke-direct {v6, v0, v7}, Landroidx/compose/foundation/lazy/layout/ItemFoundInScroll;-><init>(ILandroidx/compose/animation/core/AnimationState;)V

    .line 526
    .line 527
    .line 528
    throw v6
    :try_end_a
    .catch Landroidx/compose/foundation/lazy/layout/ItemFoundInScroll; {:try_start_a .. :try_end_a} :catch_8

    .line 529
    :catch_8
    move-exception v0

    .line 530
    :goto_e
    move/from16 v9, p2

    .line 531
    .line 532
    move v14, v1

    .line 533
    goto :goto_f

    .line 534
    :catch_9
    move-exception v0

    .line 535
    move-object/from16 v2, p0

    .line 536
    .line 537
    move v5, v9

    .line 538
    goto :goto_e

    .line 539
    :goto_f
    invoke-virtual {v0}, Landroidx/compose/foundation/lazy/layout/ItemFoundInScroll;->getPreviousAnimation()Landroidx/compose/animation/core/AnimationState;

    .line 540
    .line 541
    .line 542
    move-result-object v26

    .line 543
    const/16 v34, 0x1e

    .line 544
    .line 545
    const/16 v35, 0x0

    .line 546
    .line 547
    const/16 v27, 0x0

    .line 548
    .line 549
    const/16 v28, 0x0

    .line 550
    .line 551
    const-wide/16 v29, 0x0

    .line 552
    .line 553
    const-wide/16 v31, 0x0

    .line 554
    .line 555
    const/16 v33, 0x0

    .line 556
    .line 557
    invoke-static/range {v26 .. v35}, Landroidx/compose/animation/core/AnimationStateKt;->copy$default(Landroidx/compose/animation/core/AnimationState;FFJJZILjava/lang/Object;)Landroidx/compose/animation/core/AnimationState;

    .line 558
    .line 559
    .line 560
    move-result-object v16

    .line 561
    invoke-virtual {v0}, Landroidx/compose/foundation/lazy/layout/ItemFoundInScroll;->getItemOffset()I

    .line 562
    .line 563
    .line 564
    move-result v0

    .line 565
    add-int/2addr v0, v9

    .line 566
    int-to-float v0, v0

    .line 567
    new-instance v1, Lkotlin/jvm/internal/Ref$FloatRef;

    .line 568
    .line 569
    invoke-direct {v1}, Lkotlin/jvm/internal/Ref$FloatRef;-><init>()V

    .line 570
    .line 571
    .line 572
    invoke-static {v0}, Lkotlin/coroutines/jvm/internal/Boxing;->boxFloat(F)Ljava/lang/Float;

    .line 573
    .line 574
    .line 575
    move-result-object v17

    .line 576
    invoke-virtual/range {v16 .. v16}, Landroidx/compose/animation/core/AnimationState;->getVelocity()Ljava/lang/Object;

    .line 577
    .line 578
    .line 579
    move-result-object v6

    .line 580
    check-cast v6, Ljava/lang/Number;

    .line 581
    .line 582
    invoke-virtual {v6}, Ljava/lang/Number;->floatValue()F

    .line 583
    .line 584
    .line 585
    move-result v6

    .line 586
    cmpg-float v6, v6, p5

    .line 587
    .line 588
    if-nez v6, :cond_e

    .line 589
    .line 590
    const/16 v25, 0x1

    .line 591
    .line 592
    :goto_10
    const/4 v5, 0x1

    .line 593
    goto :goto_11

    .line 594
    :cond_e
    move/from16 v25, v5

    .line 595
    .line 596
    goto :goto_10

    .line 597
    :goto_11
    xor-int/lit8 v19, v25, 0x1

    .line 598
    .line 599
    new-instance v5, Landroidx/compose/foundation/lazy/layout/LazyLayoutScrollScopeKt$animateScrollToItem$6;

    .line 600
    .line 601
    invoke-direct {v5, v0, v1, v2}, Landroidx/compose/foundation/lazy/layout/LazyLayoutScrollScopeKt$animateScrollToItem$6;-><init>(FLkotlin/jvm/internal/Ref$FloatRef;Landroidx/compose/foundation/lazy/layout/LazyLayoutScrollScope;)V

    .line 602
    .line 603
    .line 604
    iput-object v2, v3, Landroidx/compose/foundation/lazy/layout/LazyLayoutScrollScopeKt$animateScrollToItem$1;->L$0:Ljava/lang/Object;

    .line 605
    .line 606
    const/4 v12, 0x0

    .line 607
    iput-object v12, v3, Landroidx/compose/foundation/lazy/layout/LazyLayoutScrollScopeKt$animateScrollToItem$1;->L$1:Ljava/lang/Object;

    .line 608
    .line 609
    iput-object v12, v3, Landroidx/compose/foundation/lazy/layout/LazyLayoutScrollScopeKt$animateScrollToItem$1;->L$2:Ljava/lang/Object;

    .line 610
    .line 611
    iput-object v12, v3, Landroidx/compose/foundation/lazy/layout/LazyLayoutScrollScopeKt$animateScrollToItem$1;->L$3:Ljava/lang/Object;

    .line 612
    .line 613
    iput v14, v3, Landroidx/compose/foundation/lazy/layout/LazyLayoutScrollScopeKt$animateScrollToItem$1;->I$0:I

    .line 614
    .line 615
    iput v9, v3, Landroidx/compose/foundation/lazy/layout/LazyLayoutScrollScopeKt$animateScrollToItem$1;->I$1:I

    .line 616
    .line 617
    const/4 v8, 0x2

    .line 618
    iput v8, v3, Landroidx/compose/foundation/lazy/layout/LazyLayoutScrollScopeKt$animateScrollToItem$1;->label:I

    .line 619
    .line 620
    const/16 v18, 0x0

    .line 621
    .line 622
    const/16 v22, 0x2

    .line 623
    .line 624
    const/16 v23, 0x0

    .line 625
    .line 626
    move-object/from16 v21, v3

    .line 627
    .line 628
    move-object/from16 v20, v5

    .line 629
    .line 630
    invoke-static/range {v16 .. v23}, Landroidx/compose/animation/core/SuspendAnimationKt;->animateTo$default(Landroidx/compose/animation/core/AnimationState;Ljava/lang/Object;Landroidx/compose/animation/core/AnimationSpec;ZLkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;ILjava/lang/Object;)Ljava/lang/Object;

    .line 631
    .line 632
    .line 633
    move-result-object v0

    .line 634
    if-ne v0, v4, :cond_f

    .line 635
    .line 636
    :goto_12
    return-object v4

    .line 637
    :cond_f
    move-object v3, v2

    .line 638
    move v0, v9

    .line 639
    move v1, v14

    .line 640
    :goto_13
    invoke-interface {v3, v1, v0}, Landroidx/compose/foundation/lazy/layout/LazyLayoutScrollScope;->snapToItem(II)V

    .line 641
    .line 642
    .line 643
    :cond_10
    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 644
    .line 645
    return-object v0
.end method

.method private static final animateScrollToItem$isOvershot(ZLandroidx/compose/foundation/lazy/layout/LazyLayoutScrollScope;II)Z
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    const/4 v1, 0x1

    .line 3
    if-eqz p0, :cond_2

    .line 4
    .line 5
    invoke-interface {p1}, Landroidx/compose/foundation/lazy/layout/LazyLayoutScrollScope;->getFirstVisibleItemIndex()I

    .line 6
    .line 7
    .line 8
    move-result p0

    .line 9
    if-le p0, p2, :cond_0

    .line 10
    .line 11
    return v1

    .line 12
    :cond_0
    invoke-interface {p1}, Landroidx/compose/foundation/lazy/layout/LazyLayoutScrollScope;->getFirstVisibleItemIndex()I

    .line 13
    .line 14
    .line 15
    move-result p0

    .line 16
    if-ne p0, p2, :cond_1

    .line 17
    .line 18
    invoke-interface {p1}, Landroidx/compose/foundation/lazy/layout/LazyLayoutScrollScope;->getFirstVisibleItemScrollOffset()I

    .line 19
    .line 20
    .line 21
    move-result p0

    .line 22
    if-le p0, p3, :cond_1

    .line 23
    .line 24
    return v1

    .line 25
    :cond_1
    return v0

    .line 26
    :cond_2
    invoke-interface {p1}, Landroidx/compose/foundation/lazy/layout/LazyLayoutScrollScope;->getFirstVisibleItemIndex()I

    .line 27
    .line 28
    .line 29
    move-result p0

    .line 30
    if-ge p0, p2, :cond_3

    .line 31
    .line 32
    return v1

    .line 33
    :cond_3
    invoke-interface {p1}, Landroidx/compose/foundation/lazy/layout/LazyLayoutScrollScope;->getFirstVisibleItemIndex()I

    .line 34
    .line 35
    .line 36
    move-result p0

    .line 37
    if-ne p0, p2, :cond_4

    .line 38
    .line 39
    invoke-interface {p1}, Landroidx/compose/foundation/lazy/layout/LazyLayoutScrollScope;->getFirstVisibleItemScrollOffset()I

    .line 40
    .line 41
    .line 42
    move-result p0

    .line 43
    if-ge p0, p3, :cond_4

    .line 44
    .line 45
    return v1

    .line 46
    :cond_4
    return v0
.end method

.method private static final debugLog(Lkotlin/jvm/functions/Function0;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function0<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    return-void
.end method

.method public static final isItemVisible(Landroidx/compose/foundation/lazy/layout/LazyLayoutScrollScope;I)Z
    .locals 2

    .line 1
    invoke-interface {p0}, Landroidx/compose/foundation/lazy/layout/LazyLayoutScrollScope;->getFirstVisibleItemIndex()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-interface {p0}, Landroidx/compose/foundation/lazy/layout/LazyLayoutScrollScope;->getLastVisibleItemIndex()I

    .line 6
    .line 7
    .line 8
    move-result p0

    .line 9
    const/4 v1, 0x0

    .line 10
    if-gt p1, p0, :cond_0

    .line 11
    .line 12
    if-gt v0, p1, :cond_0

    .line 13
    .line 14
    const/4 p0, 0x1

    .line 15
    return p0

    .line 16
    :cond_0
    return v1
.end method
