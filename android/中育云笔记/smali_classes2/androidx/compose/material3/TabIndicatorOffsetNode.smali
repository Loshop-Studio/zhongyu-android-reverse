.class public final Landroidx/compose/material3/TabIndicatorOffsetNode;
.super Landroidx/compose/ui/Modifier$Node;
.source "SourceFile"

# interfaces
.implements Landroidx/compose/ui/node/LayoutModifierNode;


# annotations
.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x0
.end annotation


# static fields
.field public static final $stable:I = 0x8


# instance fields
.field private followContentSize:Z

.field private initialOffset:Landroidx/compose/ui/unit/Dp;

.field private initialWidth:Landroidx/compose/ui/unit/Dp;

.field private offsetAnimatable:Landroidx/compose/animation/core/Animatable;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/compose/animation/core/Animatable<",
            "Landroidx/compose/ui/unit/Dp;",
            "Landroidx/compose/animation/core/AnimationVector1D;",
            ">;"
        }
    .end annotation
.end field

.field private selectedTabIndex:I

.field private tabPositionsState:Landroidx/compose/runtime/State;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/compose/runtime/State<",
            "+",
            "Ljava/util/List<",
            "Landroidx/compose/material3/TabPosition;",
            ">;>;"
        }
    .end annotation
.end field

.field private widthAnimatable:Landroidx/compose/animation/core/Animatable;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/compose/animation/core/Animatable<",
            "Landroidx/compose/ui/unit/Dp;",
            "Landroidx/compose/animation/core/AnimationVector1D;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Landroidx/compose/runtime/State;IZ)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/runtime/State<",
            "+",
            "Ljava/util/List<",
            "Landroidx/compose/material3/TabPosition;",
            ">;>;IZ)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Landroidx/compose/ui/Modifier$Node;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Landroidx/compose/material3/TabIndicatorOffsetNode;->tabPositionsState:Landroidx/compose/runtime/State;

    .line 5
    .line 6
    iput p2, p0, Landroidx/compose/material3/TabIndicatorOffsetNode;->selectedTabIndex:I

    .line 7
    .line 8
    iput-boolean p3, p0, Landroidx/compose/material3/TabIndicatorOffsetNode;->followContentSize:Z

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final getFollowContentSize()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Landroidx/compose/material3/TabIndicatorOffsetNode;->followContentSize:Z

    .line 2
    .line 3
    return v0
.end method

.method public final getSelectedTabIndex()I
    .locals 1

    .line 1
    iget v0, p0, Landroidx/compose/material3/TabIndicatorOffsetNode;->selectedTabIndex:I

    .line 2
    .line 3
    return v0
.end method

.method public final getTabPositionsState()Landroidx/compose/runtime/State;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Landroidx/compose/runtime/State<",
            "Ljava/util/List<",
            "Landroidx/compose/material3/TabPosition;",
            ">;>;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Landroidx/compose/material3/TabIndicatorOffsetNode;->tabPositionsState:Landroidx/compose/runtime/State;

    .line 2
    .line 3
    return-object v0
.end method

.method public measure-3p2s80s(Landroidx/compose/ui/layout/MeasureScope;Landroidx/compose/ui/layout/Measurable;J)Landroidx/compose/ui/layout/MeasureResult;
    .locals 11

    .line 1
    iget-object v0, p0, Landroidx/compose/material3/TabIndicatorOffsetNode;->tabPositionsState:Landroidx/compose/runtime/State;

    .line 2
    .line 3
    invoke-interface {v0}, Landroidx/compose/runtime/State;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Ljava/util/List;

    .line 8
    .line 9
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    sget-object v5, Landroidx/compose/material3/TabIndicatorOffsetNode$measure$1;->INSTANCE:Landroidx/compose/material3/TabIndicatorOffsetNode$measure$1;

    .line 16
    .line 17
    const/4 v6, 0x4

    .line 18
    const/4 v7, 0x0

    .line 19
    const/4 v2, 0x0

    .line 20
    const/4 v3, 0x0

    .line 21
    const/4 v4, 0x0

    .line 22
    move-object v1, p1

    .line 23
    invoke-static/range {v1 .. v7}, Landroidx/compose/ui/layout/MeasureScope;->layout$default(Landroidx/compose/ui/layout/MeasureScope;IILjava/util/Map;Lhd/l;ILjava/lang/Object;)Landroidx/compose/ui/layout/MeasureResult;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    return-object p1

    .line 28
    :cond_0
    move-object v0, p1

    .line 29
    iget-boolean p1, p0, Landroidx/compose/material3/TabIndicatorOffsetNode;->followContentSize:Z

    .line 30
    .line 31
    if-eqz p1, :cond_1

    .line 32
    .line 33
    iget-object p1, p0, Landroidx/compose/material3/TabIndicatorOffsetNode;->tabPositionsState:Landroidx/compose/runtime/State;

    .line 34
    .line 35
    invoke-interface {p1}, Landroidx/compose/runtime/State;->getValue()Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object p1

    .line 39
    check-cast p1, Ljava/util/List;

    .line 40
    .line 41
    iget v1, p0, Landroidx/compose/material3/TabIndicatorOffsetNode;->selectedTabIndex:I

    .line 42
    .line 43
    invoke-interface {p1, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object p1

    .line 47
    check-cast p1, Landroidx/compose/material3/TabPosition;

    .line 48
    .line 49
    invoke-virtual {p1}, Landroidx/compose/material3/TabPosition;->getContentWidth-D9Ej5fM()F

    .line 50
    .line 51
    .line 52
    move-result p1

    .line 53
    goto :goto_0

    .line 54
    :cond_1
    iget-object p1, p0, Landroidx/compose/material3/TabIndicatorOffsetNode;->tabPositionsState:Landroidx/compose/runtime/State;

    .line 55
    .line 56
    invoke-interface {p1}, Landroidx/compose/runtime/State;->getValue()Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    move-result-object p1

    .line 60
    check-cast p1, Ljava/util/List;

    .line 61
    .line 62
    iget v1, p0, Landroidx/compose/material3/TabIndicatorOffsetNode;->selectedTabIndex:I

    .line 63
    .line 64
    invoke-interface {p1, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 65
    .line 66
    .line 67
    move-result-object p1

    .line 68
    check-cast p1, Landroidx/compose/material3/TabPosition;

    .line 69
    .line 70
    invoke-virtual {p1}, Landroidx/compose/material3/TabPosition;->getWidth-D9Ej5fM()F

    .line 71
    .line 72
    .line 73
    move-result p1

    .line 74
    :goto_0
    iget-object v1, p0, Landroidx/compose/material3/TabIndicatorOffsetNode;->initialWidth:Landroidx/compose/ui/unit/Dp;

    .line 75
    .line 76
    const/4 v2, 0x0

    .line 77
    if-eqz v1, :cond_3

    .line 78
    .line 79
    iget-object v1, p0, Landroidx/compose/material3/TabIndicatorOffsetNode;->widthAnimatable:Landroidx/compose/animation/core/Animatable;

    .line 80
    .line 81
    if-nez v1, :cond_2

    .line 82
    .line 83
    new-instance v3, Landroidx/compose/animation/core/Animatable;

    .line 84
    .line 85
    iget-object v4, p0, Landroidx/compose/material3/TabIndicatorOffsetNode;->initialWidth:Landroidx/compose/ui/unit/Dp;

    .line 86
    .line 87
    invoke-static {v4}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 88
    .line 89
    .line 90
    sget-object v1, Landroidx/compose/ui/unit/Dp;->Companion:Landroidx/compose/ui/unit/Dp$Companion;

    .line 91
    .line 92
    invoke-static {v1}, Landroidx/compose/animation/core/VectorConvertersKt;->getVectorConverter(Landroidx/compose/ui/unit/Dp$Companion;)Landroidx/compose/animation/core/TwoWayConverter;

    .line 93
    .line 94
    .line 95
    move-result-object v5

    .line 96
    const/16 v8, 0xc

    .line 97
    .line 98
    const/4 v9, 0x0

    .line 99
    const/4 v6, 0x0

    .line 100
    const/4 v7, 0x0

    .line 101
    invoke-direct/range {v3 .. v9}, Landroidx/compose/animation/core/Animatable;-><init>(Ljava/lang/Object;Landroidx/compose/animation/core/TwoWayConverter;Ljava/lang/Object;Ljava/lang/String;ILkotlin/jvm/internal/n;)V

    .line 102
    .line 103
    .line 104
    iput-object v3, p0, Landroidx/compose/material3/TabIndicatorOffsetNode;->widthAnimatable:Landroidx/compose/animation/core/Animatable;

    .line 105
    .line 106
    move-object v1, v3

    .line 107
    :cond_2
    invoke-virtual {v1}, Landroidx/compose/animation/core/Animatable;->getTargetValue()Ljava/lang/Object;

    .line 108
    .line 109
    .line 110
    move-result-object v3

    .line 111
    check-cast v3, Landroidx/compose/ui/unit/Dp;

    .line 112
    .line 113
    invoke-virtual {v3}, Landroidx/compose/ui/unit/Dp;->unbox-impl()F

    .line 114
    .line 115
    .line 116
    move-result v3

    .line 117
    invoke-static {p1, v3}, Landroidx/compose/ui/unit/Dp;->equals-impl0(FF)Z

    .line 118
    .line 119
    .line 120
    move-result v3

    .line 121
    if-nez v3, :cond_4

    .line 122
    .line 123
    invoke-virtual {p0}, Landroidx/compose/ui/Modifier$Node;->getCoroutineScope()Lsd/i0;

    .line 124
    .line 125
    .line 126
    move-result-object v4

    .line 127
    new-instance v7, Landroidx/compose/material3/TabIndicatorOffsetNode$measure$2;

    .line 128
    .line 129
    invoke-direct {v7, v1, p1, v2}, Landroidx/compose/material3/TabIndicatorOffsetNode$measure$2;-><init>(Landroidx/compose/animation/core/Animatable;FLvc/c;)V

    .line 130
    .line 131
    .line 132
    const/4 v8, 0x3

    .line 133
    const/4 v9, 0x0

    .line 134
    const/4 v5, 0x0

    .line 135
    const/4 v6, 0x0

    .line 136
    invoke-static/range {v4 .. v9}, Lsd/f;->d(Lsd/i0;Lkotlin/coroutines/d;Lkotlinx/coroutines/CoroutineStart;Lhd/p;ILjava/lang/Object;)Lkotlinx/coroutines/g;

    .line 137
    .line 138
    .line 139
    goto :goto_1

    .line 140
    :cond_3
    invoke-static {p1}, Landroidx/compose/ui/unit/Dp;->box-impl(F)Landroidx/compose/ui/unit/Dp;

    .line 141
    .line 142
    .line 143
    move-result-object v1

    .line 144
    iput-object v1, p0, Landroidx/compose/material3/TabIndicatorOffsetNode;->initialWidth:Landroidx/compose/ui/unit/Dp;

    .line 145
    .line 146
    :cond_4
    :goto_1
    iget-object v1, p0, Landroidx/compose/material3/TabIndicatorOffsetNode;->tabPositionsState:Landroidx/compose/runtime/State;

    .line 147
    .line 148
    invoke-interface {v1}, Landroidx/compose/runtime/State;->getValue()Ljava/lang/Object;

    .line 149
    .line 150
    .line 151
    move-result-object v1

    .line 152
    check-cast v1, Ljava/util/List;

    .line 153
    .line 154
    iget v3, p0, Landroidx/compose/material3/TabIndicatorOffsetNode;->selectedTabIndex:I

    .line 155
    .line 156
    invoke-interface {v1, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 157
    .line 158
    .line 159
    move-result-object v1

    .line 160
    check-cast v1, Landroidx/compose/material3/TabPosition;

    .line 161
    .line 162
    invoke-virtual {v1}, Landroidx/compose/material3/TabPosition;->getLeft-D9Ej5fM()F

    .line 163
    .line 164
    .line 165
    move-result v1

    .line 166
    iget-object v3, p0, Landroidx/compose/material3/TabIndicatorOffsetNode;->initialOffset:Landroidx/compose/ui/unit/Dp;

    .line 167
    .line 168
    if-eqz v3, :cond_6

    .line 169
    .line 170
    iget-object v3, p0, Landroidx/compose/material3/TabIndicatorOffsetNode;->offsetAnimatable:Landroidx/compose/animation/core/Animatable;

    .line 171
    .line 172
    if-nez v3, :cond_5

    .line 173
    .line 174
    new-instance v4, Landroidx/compose/animation/core/Animatable;

    .line 175
    .line 176
    iget-object v5, p0, Landroidx/compose/material3/TabIndicatorOffsetNode;->initialOffset:Landroidx/compose/ui/unit/Dp;

    .line 177
    .line 178
    invoke-static {v5}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 179
    .line 180
    .line 181
    sget-object v3, Landroidx/compose/ui/unit/Dp;->Companion:Landroidx/compose/ui/unit/Dp$Companion;

    .line 182
    .line 183
    invoke-static {v3}, Landroidx/compose/animation/core/VectorConvertersKt;->getVectorConverter(Landroidx/compose/ui/unit/Dp$Companion;)Landroidx/compose/animation/core/TwoWayConverter;

    .line 184
    .line 185
    .line 186
    move-result-object v6

    .line 187
    const/16 v9, 0xc

    .line 188
    .line 189
    const/4 v10, 0x0

    .line 190
    const/4 v7, 0x0

    .line 191
    const/4 v8, 0x0

    .line 192
    invoke-direct/range {v4 .. v10}, Landroidx/compose/animation/core/Animatable;-><init>(Ljava/lang/Object;Landroidx/compose/animation/core/TwoWayConverter;Ljava/lang/Object;Ljava/lang/String;ILkotlin/jvm/internal/n;)V

    .line 193
    .line 194
    .line 195
    iput-object v4, p0, Landroidx/compose/material3/TabIndicatorOffsetNode;->offsetAnimatable:Landroidx/compose/animation/core/Animatable;

    .line 196
    .line 197
    move-object v3, v4

    .line 198
    :cond_5
    invoke-virtual {v3}, Landroidx/compose/animation/core/Animatable;->getTargetValue()Ljava/lang/Object;

    .line 199
    .line 200
    .line 201
    move-result-object v4

    .line 202
    check-cast v4, Landroidx/compose/ui/unit/Dp;

    .line 203
    .line 204
    invoke-virtual {v4}, Landroidx/compose/ui/unit/Dp;->unbox-impl()F

    .line 205
    .line 206
    .line 207
    move-result v4

    .line 208
    invoke-static {v1, v4}, Landroidx/compose/ui/unit/Dp;->equals-impl0(FF)Z

    .line 209
    .line 210
    .line 211
    move-result v4

    .line 212
    if-nez v4, :cond_7

    .line 213
    .line 214
    invoke-virtual {p0}, Landroidx/compose/ui/Modifier$Node;->getCoroutineScope()Lsd/i0;

    .line 215
    .line 216
    .line 217
    move-result-object v5

    .line 218
    new-instance v8, Landroidx/compose/material3/TabIndicatorOffsetNode$measure$3;

    .line 219
    .line 220
    invoke-direct {v8, v3, v1, v2}, Landroidx/compose/material3/TabIndicatorOffsetNode$measure$3;-><init>(Landroidx/compose/animation/core/Animatable;FLvc/c;)V

    .line 221
    .line 222
    .line 223
    const/4 v9, 0x3

    .line 224
    const/4 v10, 0x0

    .line 225
    const/4 v6, 0x0

    .line 226
    const/4 v7, 0x0

    .line 227
    invoke-static/range {v5 .. v10}, Lsd/f;->d(Lsd/i0;Lkotlin/coroutines/d;Lkotlinx/coroutines/CoroutineStart;Lhd/p;ILjava/lang/Object;)Lkotlinx/coroutines/g;

    .line 228
    .line 229
    .line 230
    goto :goto_2

    .line 231
    :cond_6
    invoke-static {v1}, Landroidx/compose/ui/unit/Dp;->box-impl(F)Landroidx/compose/ui/unit/Dp;

    .line 232
    .line 233
    .line 234
    move-result-object v2

    .line 235
    iput-object v2, p0, Landroidx/compose/material3/TabIndicatorOffsetNode;->initialOffset:Landroidx/compose/ui/unit/Dp;

    .line 236
    .line 237
    :cond_7
    :goto_2
    invoke-interface {v0}, Landroidx/compose/ui/layout/IntrinsicMeasureScope;->getLayoutDirection()Landroidx/compose/ui/unit/LayoutDirection;

    .line 238
    .line 239
    .line 240
    move-result-object v2

    .line 241
    sget-object v3, Landroidx/compose/ui/unit/LayoutDirection;->Ltr:Landroidx/compose/ui/unit/LayoutDirection;

    .line 242
    .line 243
    if-ne v2, v3, :cond_8

    .line 244
    .line 245
    iget-object v2, p0, Landroidx/compose/material3/TabIndicatorOffsetNode;->offsetAnimatable:Landroidx/compose/animation/core/Animatable;

    .line 246
    .line 247
    if-eqz v2, :cond_a

    .line 248
    .line 249
    invoke-virtual {v2}, Landroidx/compose/animation/core/Animatable;->getValue()Ljava/lang/Object;

    .line 250
    .line 251
    .line 252
    move-result-object v1

    .line 253
    check-cast v1, Landroidx/compose/ui/unit/Dp;

    .line 254
    .line 255
    invoke-virtual {v1}, Landroidx/compose/ui/unit/Dp;->unbox-impl()F

    .line 256
    .line 257
    .line 258
    move-result v1

    .line 259
    goto :goto_3

    .line 260
    :cond_8
    iget-object v2, p0, Landroidx/compose/material3/TabIndicatorOffsetNode;->offsetAnimatable:Landroidx/compose/animation/core/Animatable;

    .line 261
    .line 262
    if-eqz v2, :cond_9

    .line 263
    .line 264
    invoke-virtual {v2}, Landroidx/compose/animation/core/Animatable;->getValue()Ljava/lang/Object;

    .line 265
    .line 266
    .line 267
    move-result-object v1

    .line 268
    check-cast v1, Landroidx/compose/ui/unit/Dp;

    .line 269
    .line 270
    invoke-virtual {v1}, Landroidx/compose/ui/unit/Dp;->unbox-impl()F

    .line 271
    .line 272
    .line 273
    move-result v1

    .line 274
    :cond_9
    neg-float v1, v1

    .line 275
    invoke-static {v1}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 276
    .line 277
    .line 278
    move-result v1

    .line 279
    :cond_a
    :goto_3
    iget-object v2, p0, Landroidx/compose/material3/TabIndicatorOffsetNode;->widthAnimatable:Landroidx/compose/animation/core/Animatable;

    .line 280
    .line 281
    if-eqz v2, :cond_b

    .line 282
    .line 283
    invoke-virtual {v2}, Landroidx/compose/animation/core/Animatable;->getValue()Ljava/lang/Object;

    .line 284
    .line 285
    .line 286
    move-result-object p1

    .line 287
    check-cast p1, Landroidx/compose/ui/unit/Dp;

    .line 288
    .line 289
    invoke-virtual {p1}, Landroidx/compose/ui/unit/Dp;->unbox-impl()F

    .line 290
    .line 291
    .line 292
    move-result p1

    .line 293
    :cond_b
    invoke-interface {v0, p1}, Landroidx/compose/ui/unit/Density;->roundToPx-0680j_4(F)I

    .line 294
    .line 295
    .line 296
    move-result v4

    .line 297
    invoke-interface {v0, p1}, Landroidx/compose/ui/unit/Density;->roundToPx-0680j_4(F)I

    .line 298
    .line 299
    .line 300
    move-result v5

    .line 301
    const/16 v8, 0xc

    .line 302
    .line 303
    const/4 v9, 0x0

    .line 304
    const/4 v6, 0x0

    .line 305
    const/4 v7, 0x0

    .line 306
    move-wide v2, p3

    .line 307
    invoke-static/range {v2 .. v9}, Landroidx/compose/ui/unit/Constraints;->copy-Zbe2FdA$default(JIIIIILjava/lang/Object;)J

    .line 308
    .line 309
    .line 310
    move-result-wide p3

    .line 311
    invoke-interface {p2, p3, p4}, Landroidx/compose/ui/layout/Measurable;->measure-BRTryo0(J)Landroidx/compose/ui/layout/Placeable;

    .line 312
    .line 313
    .line 314
    move-result-object p1

    .line 315
    move p2, v1

    .line 316
    invoke-virtual {p1}, Landroidx/compose/ui/layout/Placeable;->getWidth()I

    .line 317
    .line 318
    .line 319
    move-result v1

    .line 320
    invoke-virtual {p1}, Landroidx/compose/ui/layout/Placeable;->getHeight()I

    .line 321
    .line 322
    .line 323
    move-result v2

    .line 324
    new-instance v4, Landroidx/compose/material3/TabIndicatorOffsetNode$measure$4;

    .line 325
    .line 326
    invoke-direct {v4, p1, v0, p2}, Landroidx/compose/material3/TabIndicatorOffsetNode$measure$4;-><init>(Landroidx/compose/ui/layout/Placeable;Landroidx/compose/ui/layout/MeasureScope;F)V

    .line 327
    .line 328
    .line 329
    const/4 v5, 0x4

    .line 330
    const/4 v6, 0x0

    .line 331
    const/4 v3, 0x0

    .line 332
    invoke-static/range {v0 .. v6}, Landroidx/compose/ui/layout/MeasureScope;->layout$default(Landroidx/compose/ui/layout/MeasureScope;IILjava/util/Map;Lhd/l;ILjava/lang/Object;)Landroidx/compose/ui/layout/MeasureResult;

    .line 333
    .line 334
    .line 335
    move-result-object p1

    .line 336
    return-object p1
.end method

.method public final setFollowContentSize(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Landroidx/compose/material3/TabIndicatorOffsetNode;->followContentSize:Z

    .line 2
    .line 3
    return-void
.end method

.method public final setSelectedTabIndex(I)V
    .locals 0

    .line 1
    iput p1, p0, Landroidx/compose/material3/TabIndicatorOffsetNode;->selectedTabIndex:I

    .line 2
    .line 3
    return-void
.end method

.method public final setTabPositionsState(Landroidx/compose/runtime/State;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/runtime/State<",
            "+",
            "Ljava/util/List<",
            "Landroidx/compose/material3/TabPosition;",
            ">;>;)V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Landroidx/compose/material3/TabIndicatorOffsetNode;->tabPositionsState:Landroidx/compose/runtime/State;

    .line 2
    .line 3
    return-void
.end method
