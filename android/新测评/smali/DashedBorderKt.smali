.class public abstract LDashedBorderKt;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static synthetic a(Landroidx/compose/ui/graphics/Shape;FFFLandroidx/compose/ui/graphics/Brush;Landroidx/compose/ui/draw/CacheDrawScope;)Landroidx/compose/ui/draw/DrawResult;
    .locals 0

    .line 1
    invoke-static/range {p0 .. p5}, LDashedBorderKt;->g(Landroidx/compose/ui/graphics/Shape;FFFLandroidx/compose/ui/graphics/Brush;Landroidx/compose/ui/draw/CacheDrawScope;)Landroidx/compose/ui/draw/DrawResult;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Landroidx/compose/ui/graphics/Shape;FFFLandroidx/compose/ui/graphics/Brush;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/Modifier;
    .locals 0

    .line 1
    invoke-static/range {p0 .. p7}, LDashedBorderKt;->f(Landroidx/compose/ui/graphics/Shape;FFFLandroidx/compose/ui/graphics/Brush;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/Modifier;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Lkotlin/jvm/internal/Ref$ObjectRef;Lkotlin/jvm/internal/Ref$ObjectRef;Lkotlin/jvm/internal/Ref$ObjectRef;Landroidx/compose/ui/graphics/Brush;Lkotlin/jvm/internal/Ref$FloatRef;Lkotlin/jvm/internal/Ref$ObjectRef;Landroidx/compose/ui/graphics/Outline;FFLandroidx/compose/ui/graphics/drawscope/ContentDrawScope;)Lkotlin/Unit;
    .locals 0

    .line 1
    invoke-static/range {p0 .. p9}, LDashedBorderKt;->h(Lkotlin/jvm/internal/Ref$ObjectRef;Lkotlin/jvm/internal/Ref$ObjectRef;Lkotlin/jvm/internal/Ref$ObjectRef;Landroidx/compose/ui/graphics/Brush;Lkotlin/jvm/internal/Ref$FloatRef;Lkotlin/jvm/internal/Ref$ObjectRef;Landroidx/compose/ui/graphics/Outline;FFLandroidx/compose/ui/graphics/drawscope/ContentDrawScope;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static final d(Landroidx/compose/ui/Modifier;FJLandroidx/compose/ui/graphics/Shape;FF)Landroidx/compose/ui/Modifier;
    .locals 2

    .line 1
    const-string v0, "$this$dashedBorder"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string/jumbo v0, "shape"

    .line 7
    .line 8
    .line 9
    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    move-wide v0, p2

    .line 13
    new-instance p2, Landroidx/compose/ui/graphics/SolidColor;

    .line 14
    .line 15
    const/4 p3, 0x0

    .line 16
    invoke-direct {p2, v0, v1, p3}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 17
    .line 18
    .line 19
    move-object p3, p4

    .line 20
    move p4, p5

    .line 21
    move p5, p6

    .line 22
    invoke-static/range {p0 .. p5}, LDashedBorderKt;->e(Landroidx/compose/ui/Modifier;FLandroidx/compose/ui/graphics/Brush;Landroidx/compose/ui/graphics/Shape;FF)Landroidx/compose/ui/Modifier;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    return-object p0
.end method

.method public static final e(Landroidx/compose/ui/Modifier;FLandroidx/compose/ui/graphics/Brush;Landroidx/compose/ui/graphics/Shape;FF)Landroidx/compose/ui/Modifier;
    .locals 7

    .line 1
    const-string v0, "$this$dashedBorder"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "brush"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string/jumbo v0, "shape"

    .line 12
    .line 13
    .line 14
    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    invoke-static {}, Landroidx/compose/ui/platform/InspectableValueKt;->isDebugInspectorInfoEnabled()Z

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    if-eqz v0, :cond_0

    .line 22
    .line 23
    new-instance v0, LDashedBorderKt$dashedBorder-jd7gvko$$inlined$debugInspectorInfo$1;

    .line 24
    .line 25
    invoke-direct {v0, p1, p2, p3}, LDashedBorderKt$dashedBorder-jd7gvko$$inlined$debugInspectorInfo$1;-><init>(FLandroidx/compose/ui/graphics/Brush;Landroidx/compose/ui/graphics/Shape;)V

    .line 26
    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_0
    invoke-static {}, Landroidx/compose/ui/platform/InspectableValueKt;->getNoInspectorInfo()Lkotlin/jvm/functions/Function1;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    :goto_0
    new-instance v1, La;

    .line 34
    .line 35
    move v3, p1

    .line 36
    move-object v6, p2

    .line 37
    move-object v2, p3

    .line 38
    move v4, p4

    .line 39
    move v5, p5

    .line 40
    invoke-direct/range {v1 .. v6}, La;-><init>(Landroidx/compose/ui/graphics/Shape;FFFLandroidx/compose/ui/graphics/Brush;)V

    .line 41
    .line 42
    .line 43
    invoke-static {p0, v0, v1}, Landroidx/compose/ui/ComposedModifierKt;->composed(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function3;)Landroidx/compose/ui/Modifier;

    .line 44
    .line 45
    .line 46
    move-result-object p0

    .line 47
    return-object p0
.end method

.method public static final f(Landroidx/compose/ui/graphics/Shape;FFFLandroidx/compose/ui/graphics/Brush;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/Modifier;
    .locals 8

    .line 1
    const-string v0, "$this$composed"

    .line 2
    .line 3
    invoke-static {p5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const v0, -0x7b24bb11

    .line 7
    .line 8
    .line 9
    invoke-interface {p6, v0}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    .line 10
    .line 11
    .line 12
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    if-eqz v1, :cond_0

    .line 17
    .line 18
    const/4 v1, -0x1

    .line 19
    const-string v2, "dashedBorder.<anonymous> (DashedBorder.kt:72)"

    .line 20
    .line 21
    invoke-static {v0, p7, v1, v2}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 22
    .line 23
    .line 24
    :cond_0
    sget-object p7, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    .line 25
    .line 26
    invoke-interface {p6, p0}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 27
    .line 28
    .line 29
    move-result v0

    .line 30
    invoke-interface {p6, p1}, Landroidx/compose/runtime/Composer;->changed(F)Z

    .line 31
    .line 32
    .line 33
    move-result v1

    .line 34
    or-int/2addr v0, v1

    .line 35
    invoke-interface {p6, p2}, Landroidx/compose/runtime/Composer;->changed(F)Z

    .line 36
    .line 37
    .line 38
    move-result v1

    .line 39
    or-int/2addr v0, v1

    .line 40
    invoke-interface {p6, p3}, Landroidx/compose/runtime/Composer;->changed(F)Z

    .line 41
    .line 42
    .line 43
    move-result v1

    .line 44
    or-int/2addr v0, v1

    .line 45
    invoke-interface {p6, p4}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 46
    .line 47
    .line 48
    move-result v1

    .line 49
    or-int/2addr v0, v1

    .line 50
    invoke-interface {p6}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    move-result-object v1

    .line 54
    if-nez v0, :cond_1

    .line 55
    .line 56
    sget-object v0, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    .line 57
    .line 58
    invoke-virtual {v0}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    .line 59
    .line 60
    .line 61
    move-result-object v0

    .line 62
    if-ne v1, v0, :cond_2

    .line 63
    .line 64
    :cond_1
    new-instance v2, Lb;

    .line 65
    .line 66
    move-object v3, p0

    .line 67
    move v4, p1

    .line 68
    move v5, p2

    .line 69
    move v6, p3

    .line 70
    move-object v7, p4

    .line 71
    invoke-direct/range {v2 .. v7}, Lb;-><init>(Landroidx/compose/ui/graphics/Shape;FFFLandroidx/compose/ui/graphics/Brush;)V

    .line 72
    .line 73
    .line 74
    invoke-interface {p6, v2}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 75
    .line 76
    .line 77
    move-object v1, v2

    .line 78
    :cond_2
    check-cast v1, Lkotlin/jvm/functions/Function1;

    .line 79
    .line 80
    invoke-static {p7, v1}, Landroidx/compose/ui/draw/DrawModifierKt;->drawWithCache(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/Modifier;

    .line 81
    .line 82
    .line 83
    move-result-object p0

    .line 84
    invoke-interface {p5, p0}, Landroidx/compose/ui/Modifier;->then(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    .line 85
    .line 86
    .line 87
    move-result-object p0

    .line 88
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 89
    .line 90
    .line 91
    move-result p1

    .line 92
    if-eqz p1, :cond_3

    .line 93
    .line 94
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 95
    .line 96
    .line 97
    :cond_3
    invoke-interface {p6}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    .line 98
    .line 99
    .line 100
    return-object p0
.end method

.method public static final g(Landroidx/compose/ui/graphics/Shape;FFFLandroidx/compose/ui/graphics/Brush;Landroidx/compose/ui/draw/CacheDrawScope;)Landroidx/compose/ui/draw/DrawResult;
    .locals 30

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move/from16 v1, p1

    .line 4
    .line 5
    move/from16 v8, p2

    .line 6
    .line 7
    move/from16 v9, p3

    .line 8
    .line 9
    move-object/from16 v10, p5

    .line 10
    .line 11
    const-string v2, "$this$drawWithCache"

    .line 12
    .line 13
    invoke-static {v10, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {v10}, Landroidx/compose/ui/draw/CacheDrawScope;->getSize-NH-jbRc()J

    .line 17
    .line 18
    .line 19
    move-result-wide v2

    .line 20
    invoke-virtual {v10}, Landroidx/compose/ui/draw/CacheDrawScope;->getLayoutDirection()Landroidx/compose/ui/unit/LayoutDirection;

    .line 21
    .line 22
    .line 23
    move-result-object v4

    .line 24
    invoke-interface {v0, v2, v3, v4, v10}, Landroidx/compose/ui/graphics/Shape;->createOutline-Pq9zytI(JLandroidx/compose/ui/unit/LayoutDirection;Landroidx/compose/ui/unit/Density;)Landroidx/compose/ui/graphics/Outline;

    .line 25
    .line 26
    .line 27
    move-result-object v7

    .line 28
    sget-object v2, Landroidx/compose/ui/unit/Dp;->Companion:Landroidx/compose/ui/unit/Dp$Companion;

    .line 29
    .line 30
    invoke-virtual {v2}, Landroidx/compose/ui/unit/Dp$Companion;->getHairline-D9Ej5fM()F

    .line 31
    .line 32
    .line 33
    move-result v2

    .line 34
    invoke-static {v1, v2}, Landroidx/compose/ui/unit/Dp;->equals-impl0(FF)Z

    .line 35
    .line 36
    .line 37
    move-result v2

    .line 38
    if-eqz v2, :cond_0

    .line 39
    .line 40
    const/high16 v1, 0x3f800000    # 1.0f

    .line 41
    .line 42
    :goto_0
    move v12, v1

    .line 43
    goto :goto_1

    .line 44
    :cond_0
    invoke-interface {v10, v1}, Landroidx/compose/ui/unit/Density;->toPx-0680j_4(F)F

    .line 45
    .line 46
    .line 47
    move-result v1

    .line 48
    goto :goto_0

    .line 49
    :goto_1
    new-instance v2, Lkotlin/jvm/internal/Ref$ObjectRef;

    .line 50
    .line 51
    invoke-direct {v2}, Lkotlin/jvm/internal/Ref$ObjectRef;-><init>()V

    .line 52
    .line 53
    .line 54
    new-instance v1, Lkotlin/jvm/internal/Ref$ObjectRef;

    .line 55
    .line 56
    invoke-direct {v1}, Lkotlin/jvm/internal/Ref$ObjectRef;-><init>()V

    .line 57
    .line 58
    .line 59
    new-instance v3, Lkotlin/jvm/internal/Ref$ObjectRef;

    .line 60
    .line 61
    invoke-direct {v3}, Lkotlin/jvm/internal/Ref$ObjectRef;-><init>()V

    .line 62
    .line 63
    .line 64
    new-instance v5, Lkotlin/jvm/internal/Ref$FloatRef;

    .line 65
    .line 66
    invoke-direct {v5}, Lkotlin/jvm/internal/Ref$FloatRef;-><init>()V

    .line 67
    .line 68
    .line 69
    new-instance v6, Lkotlin/jvm/internal/Ref$ObjectRef;

    .line 70
    .line 71
    invoke-direct {v6}, Lkotlin/jvm/internal/Ref$ObjectRef;-><init>()V

    .line 72
    .line 73
    .line 74
    const/4 v4, 0x0

    .line 75
    cmpl-float v11, v12, v4

    .line 76
    .line 77
    if-lez v11, :cond_6

    .line 78
    .line 79
    invoke-virtual {v10}, Landroidx/compose/ui/draw/CacheDrawScope;->getSize-NH-jbRc()J

    .line 80
    .line 81
    .line 82
    move-result-wide v13

    .line 83
    invoke-static {v13, v14}, Landroidx/compose/ui/geometry/Size;->getMinDimension-impl(J)F

    .line 84
    .line 85
    .line 86
    move-result v11

    .line 87
    cmpl-float v11, v11, v4

    .line 88
    .line 89
    if-lez v11, :cond_6

    .line 90
    .line 91
    instance-of v11, v7, Landroidx/compose/ui/graphics/Outline$Rectangle;

    .line 92
    .line 93
    const/4 v15, 0x2

    .line 94
    const/16 p1, 0x1

    .line 95
    .line 96
    const/4 v13, 0x0

    .line 97
    if-eqz v11, :cond_1

    .line 98
    .line 99
    new-instance v11, Landroidx/compose/ui/graphics/drawscope/Stroke;

    .line 100
    .line 101
    sget-object v0, Landroidx/compose/ui/graphics/PathEffect;->Companion:Landroidx/compose/ui/graphics/PathEffect$Companion;

    .line 102
    .line 103
    invoke-interface {v10, v8}, Landroidx/compose/ui/unit/Density;->toPx-0680j_4(F)F

    .line 104
    .line 105
    .line 106
    move-result v16

    .line 107
    invoke-interface {v10, v9}, Landroidx/compose/ui/unit/Density;->toPx-0680j_4(F)F

    .line 108
    .line 109
    .line 110
    move-result v17

    .line 111
    const/16 v18, 0x0

    .line 112
    .line 113
    new-array v14, v15, [F

    .line 114
    .line 115
    aput v16, v14, v18

    .line 116
    .line 117
    aput v17, v14, p1

    .line 118
    .line 119
    invoke-static {v0, v14, v4, v15, v13}, Landroidx/compose/ui/graphics/PathEffect$Companion;->dashPathEffect$default(Landroidx/compose/ui/graphics/PathEffect$Companion;[FFILjava/lang/Object;)Landroidx/compose/ui/graphics/PathEffect;

    .line 120
    .line 121
    .line 122
    move-result-object v16

    .line 123
    const/16 v17, 0xe

    .line 124
    .line 125
    const/16 v18, 0x0

    .line 126
    .line 127
    const/4 v13, 0x0

    .line 128
    const/4 v14, 0x0

    .line 129
    const/4 v15, 0x0

    .line 130
    invoke-direct/range {v11 .. v18}, Landroidx/compose/ui/graphics/drawscope/Stroke;-><init>(FFIILandroidx/compose/ui/graphics/PathEffect;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 131
    .line 132
    .line 133
    iput-object v11, v1, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    .line 134
    .line 135
    goto/16 :goto_4

    .line 136
    .line 137
    :cond_1
    const/16 v18, 0x0

    .line 138
    .line 139
    const v11, 0x3f99999a    # 1.2f

    .line 140
    .line 141
    .line 142
    mul-float v20, v12, v11

    .line 143
    .line 144
    int-to-float v11, v15

    .line 145
    div-float v14, v20, v11

    .line 146
    .line 147
    sub-float/2addr v12, v14

    .line 148
    iput v12, v5, Lkotlin/jvm/internal/Ref$FloatRef;->element:F

    .line 149
    .line 150
    invoke-virtual {v10}, Landroidx/compose/ui/draw/CacheDrawScope;->getSize-NH-jbRc()J

    .line 151
    .line 152
    .line 153
    move-result-wide v16

    .line 154
    const/16 v27, 0x20

    .line 155
    .line 156
    shr-long v12, v16, v27

    .line 157
    .line 158
    long-to-int v12, v12

    .line 159
    invoke-static {v12}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 160
    .line 161
    .line 162
    move-result v12

    .line 163
    iget v13, v5, Lkotlin/jvm/internal/Ref$FloatRef;->element:F

    .line 164
    .line 165
    mul-float/2addr v13, v11

    .line 166
    sub-float/2addr v12, v13

    .line 167
    invoke-virtual {v10}, Landroidx/compose/ui/draw/CacheDrawScope;->getSize-NH-jbRc()J

    .line 168
    .line 169
    .line 170
    move-result-wide v16

    .line 171
    const-wide v28, 0xffffffffL

    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    and-long v14, v16, v28

    .line 177
    .line 178
    long-to-int v14, v14

    .line 179
    invoke-static {v14}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 180
    .line 181
    .line 182
    move-result v14

    .line 183
    iget v15, v5, Lkotlin/jvm/internal/Ref$FloatRef;->element:F

    .line 184
    .line 185
    mul-float/2addr v15, v11

    .line 186
    sub-float/2addr v14, v15

    .line 187
    invoke-static {v12}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 188
    .line 189
    .line 190
    move-result v11

    .line 191
    int-to-long v11, v11

    .line 192
    invoke-static {v14}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 193
    .line 194
    .line 195
    move-result v14

    .line 196
    int-to-long v14, v14

    .line 197
    shl-long v11, v11, v27

    .line 198
    .line 199
    and-long v14, v14, v28

    .line 200
    .line 201
    or-long/2addr v11, v14

    .line 202
    invoke-static {v11, v12}, Landroidx/compose/ui/geometry/Size;->constructor-impl(J)J

    .line 203
    .line 204
    .line 205
    move-result-wide v11

    .line 206
    invoke-virtual {v10}, Landroidx/compose/ui/draw/CacheDrawScope;->getLayoutDirection()Landroidx/compose/ui/unit/LayoutDirection;

    .line 207
    .line 208
    .line 209
    move-result-object v14

    .line 210
    invoke-interface {v0, v11, v12, v14, v10}, Landroidx/compose/ui/graphics/Shape;->createOutline-Pq9zytI(JLandroidx/compose/ui/unit/LayoutDirection;Landroidx/compose/ui/unit/Density;)Landroidx/compose/ui/graphics/Outline;

    .line 211
    .line 212
    .line 213
    move-result-object v0

    .line 214
    iput-object v0, v2, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    .line 215
    .line 216
    const/4 v14, 0x0

    .line 217
    new-instance v19, Landroidx/compose/ui/graphics/drawscope/Stroke;

    .line 218
    .line 219
    sget-object v0, Landroidx/compose/ui/graphics/PathEffect;->Companion:Landroidx/compose/ui/graphics/PathEffect$Companion;

    .line 220
    .line 221
    invoke-interface {v10, v8}, Landroidx/compose/ui/unit/Density;->toPx-0680j_4(F)F

    .line 222
    .line 223
    .line 224
    move-result v11

    .line 225
    invoke-interface {v10, v9}, Landroidx/compose/ui/unit/Density;->toPx-0680j_4(F)F

    .line 226
    .line 227
    .line 228
    move-result v12

    .line 229
    const/4 v13, 0x2

    .line 230
    new-array v15, v13, [F

    .line 231
    .line 232
    aput v11, v15, v18

    .line 233
    .line 234
    aput v12, v15, p1

    .line 235
    .line 236
    invoke-static {v0, v15, v4, v13, v14}, Landroidx/compose/ui/graphics/PathEffect$Companion;->dashPathEffect$default(Landroidx/compose/ui/graphics/PathEffect$Companion;[FFILjava/lang/Object;)Landroidx/compose/ui/graphics/PathEffect;

    .line 237
    .line 238
    .line 239
    move-result-object v24

    .line 240
    const/16 v25, 0xe

    .line 241
    .line 242
    const/16 v26, 0x0

    .line 243
    .line 244
    const/16 v21, 0x0

    .line 245
    .line 246
    const/16 v22, 0x0

    .line 247
    .line 248
    const/16 v23, 0x0

    .line 249
    .line 250
    invoke-direct/range {v19 .. v26}, Landroidx/compose/ui/graphics/drawscope/Stroke;-><init>(FFIILandroidx/compose/ui/graphics/PathEffect;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 251
    .line 252
    .line 253
    move-object/from16 v0, v19

    .line 254
    .line 255
    iput-object v0, v1, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    .line 256
    .line 257
    instance-of v0, v7, Landroidx/compose/ui/graphics/Outline$Rounded;

    .line 258
    .line 259
    if-eqz v0, :cond_2

    .line 260
    .line 261
    invoke-static {}, Landroidx/compose/ui/graphics/AndroidPath_androidKt;->Path()Landroidx/compose/ui/graphics/Path;

    .line 262
    .line 263
    .line 264
    move-result-object v0

    .line 265
    move-object v4, v7

    .line 266
    check-cast v4, Landroidx/compose/ui/graphics/Outline$Rounded;

    .line 267
    .line 268
    invoke-virtual {v4}, Landroidx/compose/ui/graphics/Outline$Rounded;->getRoundRect()Landroidx/compose/ui/geometry/RoundRect;

    .line 269
    .line 270
    .line 271
    move-result-object v4

    .line 272
    const/4 v13, 0x2

    .line 273
    const/4 v14, 0x0

    .line 274
    invoke-static {v0, v4, v14, v13, v14}, Landroidx/compose/ui/graphics/Path;->addRoundRect$default(Landroidx/compose/ui/graphics/Path;Landroidx/compose/ui/geometry/RoundRect;Landroidx/compose/ui/graphics/Path$Direction;ILjava/lang/Object;)V

    .line 275
    .line 276
    .line 277
    goto :goto_2

    .line 278
    :cond_2
    instance-of v0, v7, Landroidx/compose/ui/graphics/Outline$Generic;

    .line 279
    .line 280
    if-eqz v0, :cond_3

    .line 281
    .line 282
    move-object v0, v7

    .line 283
    check-cast v0, Landroidx/compose/ui/graphics/Outline$Generic;

    .line 284
    .line 285
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Outline$Generic;->getPath()Landroidx/compose/ui/graphics/Path;

    .line 286
    .line 287
    .line 288
    move-result-object v19

    .line 289
    move-object/from16 v0, v19

    .line 290
    .line 291
    goto :goto_2

    .line 292
    :cond_3
    const/4 v0, 0x0

    .line 293
    :goto_2
    iput-object v0, v3, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    .line 294
    .line 295
    iget-object v0, v2, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    .line 296
    .line 297
    instance-of v4, v0, Landroidx/compose/ui/graphics/Outline$Rounded;

    .line 298
    .line 299
    if-eqz v4, :cond_4

    .line 300
    .line 301
    check-cast v0, Landroidx/compose/ui/graphics/Outline$Rounded;

    .line 302
    .line 303
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Outline$Rounded;->getRoundRect()Landroidx/compose/ui/geometry/RoundRect;

    .line 304
    .line 305
    .line 306
    move-result-object v0

    .line 307
    invoke-static {v0}, Landroidx/compose/ui/geometry/RoundRectKt;->isSimple(Landroidx/compose/ui/geometry/RoundRect;)Z

    .line 308
    .line 309
    .line 310
    move-result v0

    .line 311
    if-nez v0, :cond_4

    .line 312
    .line 313
    invoke-static {}, Landroidx/compose/ui/graphics/AndroidPath_androidKt;->Path()Landroidx/compose/ui/graphics/Path;

    .line 314
    .line 315
    .line 316
    move-result-object v0

    .line 317
    iget-object v4, v2, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    .line 318
    .line 319
    check-cast v4, Landroidx/compose/ui/graphics/Outline$Rounded;

    .line 320
    .line 321
    invoke-virtual {v4}, Landroidx/compose/ui/graphics/Outline$Rounded;->getRoundRect()Landroidx/compose/ui/geometry/RoundRect;

    .line 322
    .line 323
    .line 324
    move-result-object v4

    .line 325
    const/4 v13, 0x2

    .line 326
    const/4 v14, 0x0

    .line 327
    invoke-static {v0, v4, v14, v13, v14}, Landroidx/compose/ui/graphics/Path;->addRoundRect$default(Landroidx/compose/ui/graphics/Path;Landroidx/compose/ui/geometry/RoundRect;Landroidx/compose/ui/graphics/Path$Direction;ILjava/lang/Object;)V

    .line 328
    .line 329
    .line 330
    iget v4, v5, Lkotlin/jvm/internal/Ref$FloatRef;->element:F

    .line 331
    .line 332
    invoke-static {v4}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 333
    .line 334
    .line 335
    move-result v11

    .line 336
    int-to-long v11, v11

    .line 337
    invoke-static {v4}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 338
    .line 339
    .line 340
    move-result v4

    .line 341
    int-to-long v13, v4

    .line 342
    shl-long v11, v11, v27

    .line 343
    .line 344
    and-long v13, v13, v28

    .line 345
    .line 346
    or-long/2addr v11, v13

    .line 347
    invoke-static {v11, v12}, Landroidx/compose/ui/geometry/Offset;->constructor-impl(J)J

    .line 348
    .line 349
    .line 350
    move-result-wide v11

    .line 351
    invoke-interface {v0, v11, v12}, Landroidx/compose/ui/graphics/Path;->translate-k-4lQ0M(J)V

    .line 352
    .line 353
    .line 354
    move-object v13, v0

    .line 355
    goto :goto_3

    .line 356
    :cond_4
    const/4 v14, 0x0

    .line 357
    iget-object v0, v2, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    .line 358
    .line 359
    instance-of v0, v0, Landroidx/compose/ui/graphics/Outline$Generic;

    .line 360
    .line 361
    if-eqz v0, :cond_5

    .line 362
    .line 363
    invoke-static {}, Landroidx/compose/ui/graphics/AndroidPath_androidKt;->Path()Landroidx/compose/ui/graphics/Path;

    .line 364
    .line 365
    .line 366
    move-result-object v13

    .line 367
    iget-object v0, v2, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    .line 368
    .line 369
    check-cast v0, Landroidx/compose/ui/graphics/Outline$Generic;

    .line 370
    .line 371
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Outline$Generic;->getPath()Landroidx/compose/ui/graphics/Path;

    .line 372
    .line 373
    .line 374
    move-result-object v0

    .line 375
    iget v4, v5, Lkotlin/jvm/internal/Ref$FloatRef;->element:F

    .line 376
    .line 377
    invoke-static {v4}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 378
    .line 379
    .line 380
    move-result v11

    .line 381
    int-to-long v11, v11

    .line 382
    invoke-static {v4}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 383
    .line 384
    .line 385
    move-result v4

    .line 386
    int-to-long v14, v4

    .line 387
    shl-long v11, v11, v27

    .line 388
    .line 389
    and-long v14, v14, v28

    .line 390
    .line 391
    or-long/2addr v11, v14

    .line 392
    invoke-static {v11, v12}, Landroidx/compose/ui/geometry/Offset;->constructor-impl(J)J

    .line 393
    .line 394
    .line 395
    move-result-wide v11

    .line 396
    invoke-interface {v13, v0, v11, v12}, Landroidx/compose/ui/graphics/Path;->addPath-Uv8p0NA(Landroidx/compose/ui/graphics/Path;J)V

    .line 397
    .line 398
    .line 399
    goto :goto_3

    .line 400
    :cond_5
    move-object v13, v14

    .line 401
    :goto_3
    iput-object v13, v6, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    .line 402
    .line 403
    :cond_6
    :goto_4
    new-instance v0, Lc;

    .line 404
    .line 405
    move-object/from16 v4, p4

    .line 406
    .line 407
    invoke-direct/range {v0 .. v9}, Lc;-><init>(Lkotlin/jvm/internal/Ref$ObjectRef;Lkotlin/jvm/internal/Ref$ObjectRef;Lkotlin/jvm/internal/Ref$ObjectRef;Landroidx/compose/ui/graphics/Brush;Lkotlin/jvm/internal/Ref$FloatRef;Lkotlin/jvm/internal/Ref$ObjectRef;Landroidx/compose/ui/graphics/Outline;FF)V

    .line 408
    .line 409
    .line 410
    invoke-virtual {v10, v0}, Landroidx/compose/ui/draw/CacheDrawScope;->onDrawWithContent(Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/draw/DrawResult;

    .line 411
    .line 412
    .line 413
    move-result-object v0

    .line 414
    return-object v0
.end method

.method public static final h(Lkotlin/jvm/internal/Ref$ObjectRef;Lkotlin/jvm/internal/Ref$ObjectRef;Lkotlin/jvm/internal/Ref$ObjectRef;Landroidx/compose/ui/graphics/Brush;Lkotlin/jvm/internal/Ref$FloatRef;Lkotlin/jvm/internal/Ref$ObjectRef;Landroidx/compose/ui/graphics/Outline;FFLandroidx/compose/ui/graphics/drawscope/ContentDrawScope;)Lkotlin/Unit;
    .locals 30

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    move-object/from16 v2, p2

    .line 6
    .line 7
    move-object/from16 v3, p6

    .line 8
    .line 9
    move-object/from16 v6, p9

    .line 10
    .line 11
    const-string v7, "$this$onDrawWithContent"

    .line 12
    .line 13
    invoke-static {v6, v7}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    invoke-interface {v6}, Landroidx/compose/ui/graphics/drawscope/ContentDrawScope;->drawContent()V

    .line 17
    .line 18
    .line 19
    iget-object v7, v0, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    .line 20
    .line 21
    if-eqz v7, :cond_6

    .line 22
    .line 23
    iget-object v8, v1, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    .line 24
    .line 25
    const/4 v9, 0x2

    .line 26
    const-wide v20, 0xffffffffL

    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    const/16 v22, 0x20

    .line 32
    .line 33
    if-eqz v8, :cond_5

    .line 34
    .line 35
    iget-object v10, v2, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    .line 36
    .line 37
    if-eqz v10, :cond_5

    .line 38
    .line 39
    instance-of v7, v8, Landroidx/compose/ui/graphics/Outline$Rounded;

    .line 40
    .line 41
    const/16 v23, 0x1

    .line 42
    .line 43
    const/4 v10, 0x0

    .line 44
    if-eqz v7, :cond_0

    .line 45
    .line 46
    check-cast v8, Landroidx/compose/ui/graphics/Outline$Rounded;

    .line 47
    .line 48
    invoke-virtual {v8}, Landroidx/compose/ui/graphics/Outline$Rounded;->getRoundRect()Landroidx/compose/ui/geometry/RoundRect;

    .line 49
    .line 50
    .line 51
    move-result-object v7

    .line 52
    invoke-static {v7}, Landroidx/compose/ui/geometry/RoundRectKt;->isSimple(Landroidx/compose/ui/geometry/RoundRect;)Z

    .line 53
    .line 54
    .line 55
    move-result v7

    .line 56
    if-eqz v7, :cond_0

    .line 57
    .line 58
    move/from16 v24, v23

    .line 59
    .line 60
    goto :goto_0

    .line 61
    :cond_0
    move/from16 v24, v10

    .line 62
    .line 63
    :goto_0
    invoke-interface {v6}, Landroidx/compose/ui/graphics/drawscope/DrawScope;->getDrawContext()Landroidx/compose/ui/graphics/drawscope/DrawContext;

    .line 64
    .line 65
    .line 66
    move-result-object v7

    .line 67
    invoke-interface {v7}, Landroidx/compose/ui/graphics/drawscope/DrawContext;->getSize-NH-jbRc()J

    .line 68
    .line 69
    .line 70
    move-result-wide v11

    .line 71
    invoke-interface {v7}, Landroidx/compose/ui/graphics/drawscope/DrawContext;->getCanvas()Landroidx/compose/ui/graphics/Canvas;

    .line 72
    .line 73
    .line 74
    move-result-object v8

    .line 75
    invoke-interface {v8}, Landroidx/compose/ui/graphics/Canvas;->save()V

    .line 76
    .line 77
    .line 78
    :try_start_0
    invoke-interface {v7}, Landroidx/compose/ui/graphics/drawscope/DrawContext;->getTransform()Landroidx/compose/ui/graphics/drawscope/DrawTransform;

    .line 79
    .line 80
    .line 81
    move-result-object v8

    .line 82
    iget-object v13, v2, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    .line 83
    .line 84
    check-cast v13, Landroidx/compose/ui/graphics/Path;

    .line 85
    .line 86
    const/4 v14, 0x0

    .line 87
    invoke-static {v8, v13, v10, v9, v14}, Landroidx/compose/ui/graphics/drawscope/DrawTransform;->clipPath-mtrdD-E$default(Landroidx/compose/ui/graphics/drawscope/DrawTransform;Landroidx/compose/ui/graphics/Path;IILjava/lang/Object;)V

    .line 88
    .line 89
    .line 90
    if-eqz v24, :cond_1

    .line 91
    .line 92
    move-object/from16 v13, p4

    .line 93
    .line 94
    iget v13, v13, Lkotlin/jvm/internal/Ref$FloatRef;->element:F

    .line 95
    .line 96
    invoke-interface {v8, v13, v13}, Landroidx/compose/ui/graphics/drawscope/DrawTransform;->translate(FF)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 97
    .line 98
    .line 99
    goto :goto_1

    .line 100
    :catchall_0
    move-exception v0

    .line 101
    move-object v1, v7

    .line 102
    move-wide v4, v11

    .line 103
    goto/16 :goto_6

    .line 104
    .line 105
    :cond_1
    :goto_1
    const-string/jumbo v8, "null cannot be cast to non-null type androidx.compose.ui.graphics.Outline.Rounded"

    .line 106
    .line 107
    .line 108
    if-eqz v24, :cond_2

    .line 109
    .line 110
    :try_start_1
    iget-object v1, v1, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    .line 111
    .line 112
    invoke-static {v1, v8}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 113
    .line 114
    .line 115
    check-cast v1, Landroidx/compose/ui/graphics/Outline$Rounded;

    .line 116
    .line 117
    invoke-virtual {v1}, Landroidx/compose/ui/graphics/Outline$Rounded;->getRoundRect()Landroidx/compose/ui/geometry/RoundRect;

    .line 118
    .line 119
    .line 120
    move-result-object v1

    .line 121
    invoke-virtual {v1}, Landroidx/compose/ui/geometry/RoundRect;->getLeft()F

    .line 122
    .line 123
    .line 124
    move-result v13

    .line 125
    invoke-virtual {v1}, Landroidx/compose/ui/geometry/RoundRect;->getTop()F

    .line 126
    .line 127
    .line 128
    move-result v15

    .line 129
    invoke-static {v13}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 130
    .line 131
    .line 132
    move-result v13

    .line 133
    int-to-long v9, v13

    .line 134
    invoke-static {v15}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 135
    .line 136
    .line 137
    move-result v13

    .line 138
    int-to-long v14, v13

    .line 139
    shl-long v9, v9, v22

    .line 140
    .line 141
    and-long v13, v14, v20

    .line 142
    .line 143
    or-long/2addr v9, v13

    .line 144
    invoke-static {v9, v10}, Landroidx/compose/ui/geometry/Offset;->constructor-impl(J)J

    .line 145
    .line 146
    .line 147
    move-result-wide v9

    .line 148
    invoke-virtual {v1}, Landroidx/compose/ui/geometry/RoundRect;->getWidth()F

    .line 149
    .line 150
    .line 151
    move-result v13

    .line 152
    invoke-virtual {v1}, Landroidx/compose/ui/geometry/RoundRect;->getHeight()F

    .line 153
    .line 154
    .line 155
    move-result v14

    .line 156
    invoke-static {v13}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 157
    .line 158
    .line 159
    move-result v13
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 160
    move-object v15, v7

    .line 161
    int-to-long v6, v13

    .line 162
    :try_start_2
    invoke-static {v14}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 163
    .line 164
    .line 165
    move-result v13

    .line 166
    int-to-long v13, v13

    .line 167
    shl-long v6, v6, v22

    .line 168
    .line 169
    and-long v13, v13, v20

    .line 170
    .line 171
    or-long/2addr v6, v13

    .line 172
    invoke-static {v6, v7}, Landroidx/compose/ui/geometry/Size;->constructor-impl(J)J

    .line 173
    .line 174
    .line 175
    move-result-wide v6

    .line 176
    invoke-virtual {v1}, Landroidx/compose/ui/geometry/RoundRect;->getTopLeftCornerRadius-kKHJgLs()J

    .line 177
    .line 178
    .line 179
    move-result-wide v13

    .line 180
    iget-object v0, v0, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    .line 181
    .line 182
    check-cast v0, Landroidx/compose/ui/graphics/drawscope/DrawStyle;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 183
    .line 184
    const/4 v1, 0x0

    .line 185
    const/16 v18, 0xd0

    .line 186
    .line 187
    const/16 v19, 0x0

    .line 188
    .line 189
    move-wide/from16 v25, v11

    .line 190
    .line 191
    move-wide v12, v13

    .line 192
    const/4 v14, 0x0

    .line 193
    const/4 v11, 0x2

    .line 194
    const/16 v16, 0x0

    .line 195
    .line 196
    const/16 v27, 0x0

    .line 197
    .line 198
    const/16 v17, 0x0

    .line 199
    .line 200
    move v2, v11

    .line 201
    move-object v1, v15

    .line 202
    move-wide/from16 v4, v25

    .line 203
    .line 204
    move-object v15, v0

    .line 205
    move-object v0, v8

    .line 206
    move-wide v8, v9

    .line 207
    move-wide v10, v6

    .line 208
    move-object/from16 v7, p3

    .line 209
    .line 210
    move-object/from16 v6, p9

    .line 211
    .line 212
    :try_start_3
    invoke-static/range {v6 .. v19}, Landroidx/compose/ui/graphics/drawscope/DrawScope;->drawRoundRect-ZuiqVtQ$default(Landroidx/compose/ui/graphics/drawscope/DrawScope;Landroidx/compose/ui/graphics/Brush;JJJFLandroidx/compose/ui/graphics/drawscope/DrawStyle;Landroidx/compose/ui/graphics/ColorFilter;IILjava/lang/Object;)V

    .line 213
    .line 214
    .line 215
    move-object/from16 v6, p9

    .line 216
    .line 217
    move-object v15, v0

    .line 218
    goto :goto_2

    .line 219
    :catchall_1
    move-exception v0

    .line 220
    goto/16 :goto_6

    .line 221
    .line 222
    :catchall_2
    move-exception v0

    .line 223
    move-wide v4, v11

    .line 224
    move-object v1, v15

    .line 225
    goto/16 :goto_6

    .line 226
    .line 227
    :cond_2
    move-object/from16 v6, p5

    .line 228
    .line 229
    move-object v1, v7

    .line 230
    move-object v15, v8

    .line 231
    move v2, v9

    .line 232
    move/from16 v27, v10

    .line 233
    .line 234
    move-wide v4, v11

    .line 235
    iget-object v6, v6, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    .line 236
    .line 237
    if-eqz v6, :cond_3

    .line 238
    .line 239
    move-object v7, v6

    .line 240
    check-cast v7, Landroidx/compose/ui/graphics/Path;

    .line 241
    .line 242
    iget-object v0, v0, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    .line 243
    .line 244
    move-object v10, v0

    .line 245
    check-cast v10, Landroidx/compose/ui/graphics/drawscope/DrawStyle;

    .line 246
    .line 247
    const/16 v13, 0x34

    .line 248
    .line 249
    const/4 v14, 0x0

    .line 250
    const/4 v9, 0x0

    .line 251
    const/4 v11, 0x0

    .line 252
    const/4 v12, 0x0

    .line 253
    move-object/from16 v8, p3

    .line 254
    .line 255
    move-object/from16 v6, p9

    .line 256
    .line 257
    invoke-static/range {v6 .. v14}, Landroidx/compose/ui/graphics/drawscope/DrawScope;->drawPath-GBMwjPU$default(Landroidx/compose/ui/graphics/drawscope/DrawScope;Landroidx/compose/ui/graphics/Path;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/drawscope/DrawStyle;Landroidx/compose/ui/graphics/ColorFilter;IILjava/lang/Object;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 258
    .line 259
    .line 260
    goto :goto_2

    .line 261
    :cond_3
    move-object/from16 v6, p9

    .line 262
    .line 263
    :goto_2
    invoke-interface {v1}, Landroidx/compose/ui/graphics/drawscope/DrawContext;->getCanvas()Landroidx/compose/ui/graphics/Canvas;

    .line 264
    .line 265
    .line 266
    move-result-object v0

    .line 267
    invoke-interface {v0}, Landroidx/compose/ui/graphics/Canvas;->restore()V

    .line 268
    .line 269
    .line 270
    invoke-interface {v1, v4, v5}, Landroidx/compose/ui/graphics/drawscope/DrawContext;->setSize-uvyYCjk(J)V

    .line 271
    .line 272
    .line 273
    invoke-interface {v6}, Landroidx/compose/ui/graphics/drawscope/DrawScope;->getSize-NH-jbRc()J

    .line 274
    .line 275
    .line 276
    move-result-wide v0

    .line 277
    shr-long v0, v0, v22

    .line 278
    .line 279
    long-to-int v0, v0

    .line 280
    invoke-static {v0}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 281
    .line 282
    .line 283
    move-result v10

    .line 284
    invoke-interface {v6}, Landroidx/compose/ui/graphics/drawscope/DrawScope;->getSize-NH-jbRc()J

    .line 285
    .line 286
    .line 287
    move-result-wide v0

    .line 288
    and-long v0, v0, v20

    .line 289
    .line 290
    long-to-int v0, v0

    .line 291
    invoke-static {v0}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 292
    .line 293
    .line 294
    move-result v11

    .line 295
    sget-object v0, Landroidx/compose/ui/graphics/ClipOp;->Companion:Landroidx/compose/ui/graphics/ClipOp$Companion;

    .line 296
    .line 297
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/ClipOp$Companion;->getIntersect-rtfAjoo()I

    .line 298
    .line 299
    .line 300
    move-result v12

    .line 301
    invoke-interface {v6}, Landroidx/compose/ui/graphics/drawscope/DrawScope;->getDrawContext()Landroidx/compose/ui/graphics/drawscope/DrawContext;

    .line 302
    .line 303
    .line 304
    move-result-object v14

    .line 305
    invoke-interface {v14}, Landroidx/compose/ui/graphics/drawscope/DrawContext;->getSize-NH-jbRc()J

    .line 306
    .line 307
    .line 308
    move-result-wide v4

    .line 309
    invoke-interface {v14}, Landroidx/compose/ui/graphics/drawscope/DrawContext;->getCanvas()Landroidx/compose/ui/graphics/Canvas;

    .line 310
    .line 311
    .line 312
    move-result-object v0

    .line 313
    invoke-interface {v0}, Landroidx/compose/ui/graphics/Canvas;->save()V

    .line 314
    .line 315
    .line 316
    :try_start_4
    invoke-interface {v14}, Landroidx/compose/ui/graphics/drawscope/DrawContext;->getTransform()Landroidx/compose/ui/graphics/drawscope/DrawTransform;

    .line 317
    .line 318
    .line 319
    move-result-object v7

    .line 320
    const/4 v8, 0x0

    .line 321
    const/4 v9, 0x0

    .line 322
    invoke-interface/range {v7 .. v12}, Landroidx/compose/ui/graphics/drawscope/DrawTransform;->clipRect-N_I0leg(FFFFI)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_5

    .line 323
    .line 324
    .line 325
    if-eqz v24, :cond_4

    .line 326
    .line 327
    :try_start_5
    invoke-static {v3, v15}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 328
    .line 329
    .line 330
    move-object v1, v3

    .line 331
    check-cast v1, Landroidx/compose/ui/graphics/Outline$Rounded;

    .line 332
    .line 333
    invoke-virtual {v1}, Landroidx/compose/ui/graphics/Outline$Rounded;->getRoundRect()Landroidx/compose/ui/geometry/RoundRect;

    .line 334
    .line 335
    .line 336
    move-result-object v1

    .line 337
    invoke-virtual {v1}, Landroidx/compose/ui/geometry/RoundRect;->getLeft()F

    .line 338
    .line 339
    .line 340
    move-result v3

    .line 341
    invoke-virtual {v1}, Landroidx/compose/ui/geometry/RoundRect;->getTop()F

    .line 342
    .line 343
    .line 344
    move-result v7

    .line 345
    invoke-static {v3}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 346
    .line 347
    .line 348
    move-result v3

    .line 349
    int-to-long v8, v3

    .line 350
    invoke-static {v7}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 351
    .line 352
    .line 353
    move-result v3

    .line 354
    int-to-long v10, v3

    .line 355
    shl-long v7, v8, v22

    .line 356
    .line 357
    and-long v9, v10, v20

    .line 358
    .line 359
    or-long/2addr v7, v9

    .line 360
    invoke-static {v7, v8}, Landroidx/compose/ui/geometry/Offset;->constructor-impl(J)J

    .line 361
    .line 362
    .line 363
    move-result-wide v7

    .line 364
    invoke-virtual {v1}, Landroidx/compose/ui/geometry/RoundRect;->getWidth()F

    .line 365
    .line 366
    .line 367
    move-result v3

    .line 368
    invoke-virtual {v1}, Landroidx/compose/ui/geometry/RoundRect;->getHeight()F

    .line 369
    .line 370
    .line 371
    move-result v9

    .line 372
    invoke-static {v3}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 373
    .line 374
    .line 375
    move-result v3

    .line 376
    int-to-long v10, v3

    .line 377
    invoke-static {v9}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 378
    .line 379
    .line 380
    move-result v3

    .line 381
    int-to-long v12, v3

    .line 382
    shl-long v9, v10, v22

    .line 383
    .line 384
    and-long v11, v12, v20

    .line 385
    .line 386
    or-long/2addr v9, v11

    .line 387
    invoke-static {v9, v10}, Landroidx/compose/ui/geometry/Size;->constructor-impl(J)J

    .line 388
    .line 389
    .line 390
    move-result-wide v9

    .line 391
    invoke-virtual {v1}, Landroidx/compose/ui/geometry/RoundRect;->getTopLeftCornerRadius-kKHJgLs()J

    .line 392
    .line 393
    .line 394
    move-result-wide v11

    .line 395
    new-instance v15, Landroidx/compose/ui/graphics/drawscope/Stroke;

    .line 396
    .line 397
    sget-object v1, Landroidx/compose/ui/graphics/PathEffect;->Companion:Landroidx/compose/ui/graphics/PathEffect$Companion;

    .line 398
    .line 399
    move/from16 v3, p7

    .line 400
    .line 401
    invoke-interface {v6, v3}, Landroidx/compose/ui/unit/Density;->toPx-0680j_4(F)F

    .line 402
    .line 403
    .line 404
    move-result v3

    .line 405
    move/from16 v13, p8

    .line 406
    .line 407
    invoke-interface {v6, v13}, Landroidx/compose/ui/unit/Density;->toPx-0680j_4(F)F

    .line 408
    .line 409
    .line 410
    move-result v13

    .line 411
    new-array v0, v2, [F

    .line 412
    .line 413
    aput v3, v0, v27

    .line 414
    .line 415
    aput v13, v0, v23

    .line 416
    .line 417
    const/4 v3, 0x0

    .line 418
    const/4 v13, 0x0

    .line 419
    invoke-static {v1, v0, v3, v2, v13}, Landroidx/compose/ui/graphics/PathEffect$Companion;->dashPathEffect$default(Landroidx/compose/ui/graphics/PathEffect$Companion;[FFILjava/lang/Object;)Landroidx/compose/ui/graphics/PathEffect;

    .line 420
    .line 421
    .line 422
    move-result-object v20

    .line 423
    const/16 v21, 0xe

    .line 424
    .line 425
    const/16 v22, 0x0

    .line 426
    .line 427
    const/16 v16, 0x0

    .line 428
    .line 429
    const/16 v17, 0x0

    .line 430
    .line 431
    const/16 v18, 0x0

    .line 432
    .line 433
    const/16 v19, 0x0

    .line 434
    .line 435
    invoke-direct/range {v15 .. v22}, Landroidx/compose/ui/graphics/drawscope/Stroke;-><init>(FFIILandroidx/compose/ui/graphics/PathEffect;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_4

    .line 436
    .line 437
    .line 438
    move-wide v2, v7

    .line 439
    move-wide v6, v11

    .line 440
    const/16 v12, 0xd0

    .line 441
    .line 442
    const/4 v13, 0x0

    .line 443
    const/4 v8, 0x0

    .line 444
    move-wide/from16 v16, v4

    .line 445
    .line 446
    move-wide v4, v9

    .line 447
    const/4 v10, 0x0

    .line 448
    const/4 v11, 0x0

    .line 449
    move-object/from16 v1, p3

    .line 450
    .line 451
    move-object/from16 v0, p9

    .line 452
    .line 453
    move-object v9, v15

    .line 454
    move-wide/from16 v28, v16

    .line 455
    .line 456
    :try_start_6
    invoke-static/range {v0 .. v13}, Landroidx/compose/ui/graphics/drawscope/DrawScope;->drawRoundRect-ZuiqVtQ$default(Landroidx/compose/ui/graphics/drawscope/DrawScope;Landroidx/compose/ui/graphics/Brush;JJJFLandroidx/compose/ui/graphics/drawscope/DrawStyle;Landroidx/compose/ui/graphics/ColorFilter;IILjava/lang/Object;)V

    .line 457
    .line 458
    .line 459
    goto :goto_4

    .line 460
    :catchall_3
    move-exception v0

    .line 461
    :goto_3
    move-wide/from16 v1, v28

    .line 462
    .line 463
    goto :goto_5

    .line 464
    :catchall_4
    move-exception v0

    .line 465
    move-wide/from16 v28, v4

    .line 466
    .line 467
    goto :goto_3

    .line 468
    :cond_4
    move-object/from16 v0, p2

    .line 469
    .line 470
    move/from16 v3, p7

    .line 471
    .line 472
    move/from16 v13, p8

    .line 473
    .line 474
    move-wide/from16 v28, v4

    .line 475
    .line 476
    iget-object v0, v0, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    .line 477
    .line 478
    move-object v1, v0

    .line 479
    check-cast v1, Landroidx/compose/ui/graphics/Path;

    .line 480
    .line 481
    new-instance v15, Landroidx/compose/ui/graphics/drawscope/Stroke;

    .line 482
    .line 483
    sget-object v0, Landroidx/compose/ui/graphics/PathEffect;->Companion:Landroidx/compose/ui/graphics/PathEffect$Companion;

    .line 484
    .line 485
    invoke-interface {v6, v3}, Landroidx/compose/ui/unit/Density;->toPx-0680j_4(F)F

    .line 486
    .line 487
    .line 488
    move-result v3

    .line 489
    invoke-interface {v6, v13}, Landroidx/compose/ui/unit/Density;->toPx-0680j_4(F)F

    .line 490
    .line 491
    .line 492
    move-result v4

    .line 493
    new-array v5, v2, [F

    .line 494
    .line 495
    aput v3, v5, v27

    .line 496
    .line 497
    aput v4, v5, v23

    .line 498
    .line 499
    const/4 v3, 0x0

    .line 500
    const/4 v13, 0x0

    .line 501
    invoke-static {v0, v5, v3, v2, v13}, Landroidx/compose/ui/graphics/PathEffect$Companion;->dashPathEffect$default(Landroidx/compose/ui/graphics/PathEffect$Companion;[FFILjava/lang/Object;)Landroidx/compose/ui/graphics/PathEffect;

    .line 502
    .line 503
    .line 504
    move-result-object v20

    .line 505
    const/16 v21, 0xe

    .line 506
    .line 507
    const/16 v22, 0x0

    .line 508
    .line 509
    const/16 v16, 0x0

    .line 510
    .line 511
    const/16 v17, 0x0

    .line 512
    .line 513
    const/16 v18, 0x0

    .line 514
    .line 515
    const/16 v19, 0x0

    .line 516
    .line 517
    invoke-direct/range {v15 .. v22}, Landroidx/compose/ui/graphics/drawscope/Stroke;-><init>(FFIILandroidx/compose/ui/graphics/PathEffect;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 518
    .line 519
    .line 520
    const/16 v7, 0x34

    .line 521
    .line 522
    const/4 v8, 0x0

    .line 523
    const/4 v3, 0x0

    .line 524
    const/4 v5, 0x0

    .line 525
    const/4 v6, 0x0

    .line 526
    move-object/from16 v2, p3

    .line 527
    .line 528
    move-object/from16 v0, p9

    .line 529
    .line 530
    move-object v4, v15

    .line 531
    invoke-static/range {v0 .. v8}, Landroidx/compose/ui/graphics/drawscope/DrawScope;->drawPath-GBMwjPU$default(Landroidx/compose/ui/graphics/drawscope/DrawScope;Landroidx/compose/ui/graphics/Path;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/drawscope/DrawStyle;Landroidx/compose/ui/graphics/ColorFilter;IILjava/lang/Object;)V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_3

    .line 532
    .line 533
    .line 534
    :goto_4
    invoke-interface {v14}, Landroidx/compose/ui/graphics/drawscope/DrawContext;->getCanvas()Landroidx/compose/ui/graphics/Canvas;

    .line 535
    .line 536
    .line 537
    move-result-object v0

    .line 538
    invoke-interface {v0}, Landroidx/compose/ui/graphics/Canvas;->restore()V

    .line 539
    .line 540
    .line 541
    move-wide/from16 v1, v28

    .line 542
    .line 543
    invoke-interface {v14, v1, v2}, Landroidx/compose/ui/graphics/drawscope/DrawContext;->setSize-uvyYCjk(J)V

    .line 544
    .line 545
    .line 546
    goto :goto_7

    .line 547
    :catchall_5
    move-exception v0

    .line 548
    move-wide v1, v4

    .line 549
    :goto_5
    invoke-interface {v14}, Landroidx/compose/ui/graphics/drawscope/DrawContext;->getCanvas()Landroidx/compose/ui/graphics/Canvas;

    .line 550
    .line 551
    .line 552
    move-result-object v3

    .line 553
    invoke-interface {v3}, Landroidx/compose/ui/graphics/Canvas;->restore()V

    .line 554
    .line 555
    .line 556
    invoke-interface {v14, v1, v2}, Landroidx/compose/ui/graphics/drawscope/DrawContext;->setSize-uvyYCjk(J)V

    .line 557
    .line 558
    .line 559
    throw v0

    .line 560
    :goto_6
    invoke-interface {v1}, Landroidx/compose/ui/graphics/drawscope/DrawContext;->getCanvas()Landroidx/compose/ui/graphics/Canvas;

    .line 561
    .line 562
    .line 563
    move-result-object v2

    .line 564
    invoke-interface {v2}, Landroidx/compose/ui/graphics/Canvas;->restore()V

    .line 565
    .line 566
    .line 567
    invoke-interface {v1, v4, v5}, Landroidx/compose/ui/graphics/drawscope/DrawContext;->setSize-uvyYCjk(J)V

    .line 568
    .line 569
    .line 570
    throw v0

    .line 571
    :cond_5
    move v2, v9

    .line 572
    check-cast v7, Landroidx/compose/ui/graphics/drawscope/Stroke;

    .line 573
    .line 574
    invoke-virtual {v7}, Landroidx/compose/ui/graphics/drawscope/Stroke;->getWidth()F

    .line 575
    .line 576
    .line 577
    move-result v1

    .line 578
    int-to-float v2, v2

    .line 579
    div-float v2, v1, v2

    .line 580
    .line 581
    invoke-static {v2}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 582
    .line 583
    .line 584
    move-result v3

    .line 585
    int-to-long v3, v3

    .line 586
    invoke-static {v2}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 587
    .line 588
    .line 589
    move-result v2

    .line 590
    int-to-long v5, v2

    .line 591
    shl-long v2, v3, v22

    .line 592
    .line 593
    and-long v4, v5, v20

    .line 594
    .line 595
    or-long/2addr v2, v4

    .line 596
    invoke-static {v2, v3}, Landroidx/compose/ui/geometry/Offset;->constructor-impl(J)J

    .line 597
    .line 598
    .line 599
    move-result-wide v2

    .line 600
    invoke-interface/range {p9 .. p9}, Landroidx/compose/ui/graphics/drawscope/DrawScope;->getSize-NH-jbRc()J

    .line 601
    .line 602
    .line 603
    move-result-wide v4

    .line 604
    shr-long v4, v4, v22

    .line 605
    .line 606
    long-to-int v4, v4

    .line 607
    invoke-static {v4}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 608
    .line 609
    .line 610
    move-result v4

    .line 611
    sub-float/2addr v4, v1

    .line 612
    invoke-interface/range {p9 .. p9}, Landroidx/compose/ui/graphics/drawscope/DrawScope;->getSize-NH-jbRc()J

    .line 613
    .line 614
    .line 615
    move-result-wide v5

    .line 616
    and-long v5, v5, v20

    .line 617
    .line 618
    long-to-int v5, v5

    .line 619
    invoke-static {v5}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 620
    .line 621
    .line 622
    move-result v5

    .line 623
    sub-float/2addr v5, v1

    .line 624
    invoke-static {v4}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 625
    .line 626
    .line 627
    move-result v1

    .line 628
    int-to-long v6, v1

    .line 629
    invoke-static {v5}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 630
    .line 631
    .line 632
    move-result v1

    .line 633
    int-to-long v4, v1

    .line 634
    shl-long v6, v6, v22

    .line 635
    .line 636
    and-long v4, v4, v20

    .line 637
    .line 638
    or-long/2addr v4, v6

    .line 639
    invoke-static {v4, v5}, Landroidx/compose/ui/geometry/Size;->constructor-impl(J)J

    .line 640
    .line 641
    .line 642
    move-result-wide v4

    .line 643
    iget-object v0, v0, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    .line 644
    .line 645
    move-object v7, v0

    .line 646
    check-cast v7, Landroidx/compose/ui/graphics/drawscope/DrawStyle;

    .line 647
    .line 648
    const/16 v10, 0x68

    .line 649
    .line 650
    const/4 v11, 0x0

    .line 651
    const/4 v6, 0x0

    .line 652
    const/4 v8, 0x0

    .line 653
    const/4 v9, 0x0

    .line 654
    move-object/from16 v1, p3

    .line 655
    .line 656
    move-object/from16 v0, p9

    .line 657
    .line 658
    invoke-static/range {v0 .. v11}, Landroidx/compose/ui/graphics/drawscope/DrawScope;->drawRect-AsUm42w$default(Landroidx/compose/ui/graphics/drawscope/DrawScope;Landroidx/compose/ui/graphics/Brush;JJFLandroidx/compose/ui/graphics/drawscope/DrawStyle;Landroidx/compose/ui/graphics/ColorFilter;IILjava/lang/Object;)V

    .line 659
    .line 660
    .line 661
    :cond_6
    :goto_7
    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 662
    .line 663
    return-object v0
.end method
