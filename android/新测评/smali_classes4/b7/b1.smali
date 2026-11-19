.class public abstract Lb7/b1;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static synthetic a(Landroidx/compose/ui/Modifier;Lb7/w0;Landroid/graphics/Bitmap;Ljava/util/List;IILandroidx/compose/runtime/Composer;I)Lkotlin/Unit;
    .locals 0

    .line 1
    invoke-static/range {p0 .. p7}, Lb7/b1;->i(Landroidx/compose/ui/Modifier;Lb7/w0;Landroid/graphics/Bitmap;Ljava/util/List;IILandroidx/compose/runtime/Composer;I)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lcom/zykj/camera/view/ManualPointView;Landroid/graphics/Matrix;)Ljava/util/List;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lb7/b1;->g(Lcom/zykj/camera/view/ManualPointView;Landroid/graphics/Matrix;)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Lb7/w0;Landroid/graphics/Bitmap;Ljava/util/List;Landroid/content/Context;)Lcom/zykj/camera/view/ManualPointView;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2, p3}, Lb7/b1;->f(Lb7/w0;Landroid/graphics/Bitmap;Ljava/util/List;Landroid/content/Context;)Lcom/zykj/camera/view/ManualPointView;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Lcom/zykj/camera/view/ManualPointView;Landroid/graphics/Matrix;Landroid/graphics/Bitmap;Ljava/util/List;)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2, p3}, Lb7/b1;->h(Lcom/zykj/camera/view/ManualPointView;Landroid/graphics/Matrix;Landroid/graphics/Bitmap;Ljava/util/List;)V

    return-void
.end method

.method public static final e(Landroidx/compose/ui/Modifier;Lb7/w0;Landroid/graphics/Bitmap;Ljava/util/List;Landroidx/compose/runtime/Composer;II)V
    .locals 12

    .line 1
    move/from16 v5, p5

    .line 2
    .line 3
    const-string v0, "functions"

    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    const-string v0, "initBitmap"

    .line 9
    .line 10
    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    const-string v0, "initPointList"

    .line 14
    .line 15
    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    const v0, 0x7cfee617

    .line 19
    .line 20
    .line 21
    move-object/from16 v1, p4

    .line 22
    .line 23
    invoke-interface {v1, v0}, Landroidx/compose/runtime/Composer;->startRestartGroup(I)Landroidx/compose/runtime/Composer;

    .line 24
    .line 25
    .line 26
    move-result-object v9

    .line 27
    and-int/lit8 v1, p6, 0x1

    .line 28
    .line 29
    if-eqz v1, :cond_0

    .line 30
    .line 31
    or-int/lit8 v2, v5, 0x6

    .line 32
    .line 33
    goto :goto_1

    .line 34
    :cond_0
    and-int/lit8 v2, v5, 0x6

    .line 35
    .line 36
    if-nez v2, :cond_2

    .line 37
    .line 38
    invoke-interface {v9, p0}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 39
    .line 40
    .line 41
    move-result v2

    .line 42
    if-eqz v2, :cond_1

    .line 43
    .line 44
    const/4 v2, 0x4

    .line 45
    goto :goto_0

    .line 46
    :cond_1
    const/4 v2, 0x2

    .line 47
    :goto_0
    or-int/2addr v2, v5

    .line 48
    goto :goto_1

    .line 49
    :cond_2
    move v2, v5

    .line 50
    :goto_1
    and-int/lit8 v3, v5, 0x30

    .line 51
    .line 52
    if-nez v3, :cond_4

    .line 53
    .line 54
    invoke-interface {v9, p1}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 55
    .line 56
    .line 57
    move-result v3

    .line 58
    if-eqz v3, :cond_3

    .line 59
    .line 60
    const/16 v3, 0x20

    .line 61
    .line 62
    goto :goto_2

    .line 63
    :cond_3
    const/16 v3, 0x10

    .line 64
    .line 65
    :goto_2
    or-int/2addr v2, v3

    .line 66
    :cond_4
    and-int/lit16 v3, v5, 0x180

    .line 67
    .line 68
    if-nez v3, :cond_6

    .line 69
    .line 70
    invoke-interface {v9, p2}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 71
    .line 72
    .line 73
    move-result v3

    .line 74
    if-eqz v3, :cond_5

    .line 75
    .line 76
    const/16 v3, 0x100

    .line 77
    .line 78
    goto :goto_3

    .line 79
    :cond_5
    const/16 v3, 0x80

    .line 80
    .line 81
    :goto_3
    or-int/2addr v2, v3

    .line 82
    :cond_6
    and-int/lit16 v3, v5, 0xc00

    .line 83
    .line 84
    if-nez v3, :cond_8

    .line 85
    .line 86
    invoke-interface {v9, p3}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 87
    .line 88
    .line 89
    move-result v3

    .line 90
    if-eqz v3, :cond_7

    .line 91
    .line 92
    const/16 v3, 0x800

    .line 93
    .line 94
    goto :goto_4

    .line 95
    :cond_7
    const/16 v3, 0x400

    .line 96
    .line 97
    :goto_4
    or-int/2addr v2, v3

    .line 98
    :cond_8
    and-int/lit16 v3, v2, 0x493

    .line 99
    .line 100
    const/16 v4, 0x492

    .line 101
    .line 102
    if-eq v3, v4, :cond_9

    .line 103
    .line 104
    const/4 v3, 0x1

    .line 105
    goto :goto_5

    .line 106
    :cond_9
    const/4 v3, 0x0

    .line 107
    :goto_5
    and-int/lit8 v4, v2, 0x1

    .line 108
    .line 109
    invoke-interface {v9, v3, v4}, Landroidx/compose/runtime/Composer;->shouldExecute(ZI)Z

    .line 110
    .line 111
    .line 112
    move-result v3

    .line 113
    if-eqz v3, :cond_f

    .line 114
    .line 115
    if-eqz v1, :cond_a

    .line 116
    .line 117
    sget-object p0, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    .line 118
    .line 119
    :cond_a
    move-object v7, p0

    .line 120
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 121
    .line 122
    .line 123
    move-result p0

    .line 124
    if-eqz p0, :cond_b

    .line 125
    .line 126
    const/4 p0, -0x1

    .line 127
    const-string v1, "com.zykj.evaluation.ui.sheet.widget.ManualPointView (ManualPointView.kt:24)"

    .line 128
    .line 129
    invoke-static {v0, v2, p0, v1}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 130
    .line 131
    .line 132
    :cond_b
    invoke-interface {v9, p1}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 133
    .line 134
    .line 135
    move-result p0

    .line 136
    invoke-interface {v9, p2}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 137
    .line 138
    .line 139
    move-result v0

    .line 140
    or-int/2addr p0, v0

    .line 141
    invoke-interface {v9, p3}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 142
    .line 143
    .line 144
    move-result v0

    .line 145
    or-int/2addr p0, v0

    .line 146
    invoke-interface {v9}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 147
    .line 148
    .line 149
    move-result-object v0

    .line 150
    if-nez p0, :cond_c

    .line 151
    .line 152
    sget-object p0, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    .line 153
    .line 154
    invoke-virtual {p0}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    .line 155
    .line 156
    .line 157
    move-result-object p0

    .line 158
    if-ne v0, p0, :cond_d

    .line 159
    .line 160
    :cond_c
    new-instance v0, Lb7/x0;

    .line 161
    .line 162
    invoke-direct {v0, p1, p2, p3}, Lb7/x0;-><init>(Lb7/w0;Landroid/graphics/Bitmap;Ljava/util/List;)V

    .line 163
    .line 164
    .line 165
    invoke-interface {v9, v0}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 166
    .line 167
    .line 168
    :cond_d
    move-object v6, v0

    .line 169
    check-cast v6, Lkotlin/jvm/functions/Function1;

    .line 170
    .line 171
    shl-int/lit8 p0, v2, 0x3

    .line 172
    .line 173
    and-int/lit8 v10, p0, 0x70

    .line 174
    .line 175
    const/4 v11, 0x4

    .line 176
    const/4 v8, 0x0

    .line 177
    invoke-static/range {v6 .. v11}, Landroidx/compose/ui/viewinterop/AndroidView_androidKt;->AndroidView(Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    .line 178
    .line 179
    .line 180
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 181
    .line 182
    .line 183
    move-result p0

    .line 184
    if-eqz p0, :cond_e

    .line 185
    .line 186
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 187
    .line 188
    .line 189
    :cond_e
    move-object v1, v7

    .line 190
    goto :goto_6

    .line 191
    :cond_f
    invoke-interface {v9}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    .line 192
    .line 193
    .line 194
    move-object v1, p0

    .line 195
    :goto_6
    invoke-interface {v9}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    .line 196
    .line 197
    .line 198
    move-result-object p0

    .line 199
    if-eqz p0, :cond_10

    .line 200
    .line 201
    new-instance v0, Lb7/y0;

    .line 202
    .line 203
    move-object v2, p1

    .line 204
    move-object v3, p2

    .line 205
    move-object v4, p3

    .line 206
    move/from16 v6, p6

    .line 207
    .line 208
    invoke-direct/range {v0 .. v6}, Lb7/y0;-><init>(Landroidx/compose/ui/Modifier;Lb7/w0;Landroid/graphics/Bitmap;Ljava/util/List;II)V

    .line 209
    .line 210
    .line 211
    invoke-interface {p0, v0}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lkotlin/jvm/functions/Function2;)V

    .line 212
    .line 213
    .line 214
    :cond_10
    return-void
.end method

.method public static final f(Lb7/w0;Landroid/graphics/Bitmap;Ljava/util/List;Landroid/content/Context;)Lcom/zykj/camera/view/ManualPointView;
    .locals 2

    .line 1
    const-string v0, "context"

    .line 2
    .line 3
    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance v0, Lcom/zykj/camera/view/ManualPointView;

    .line 7
    .line 8
    invoke-direct {v0, p3}, Lcom/zykj/camera/view/ManualPointView;-><init>(Landroid/content/Context;)V

    .line 9
    .line 10
    .line 11
    new-instance p3, Landroid/view/ViewGroup$LayoutParams;

    .line 12
    .line 13
    const/4 v1, -0x1

    .line 14
    invoke-direct {p3, v1, v1}, Landroid/view/ViewGroup$LayoutParams;-><init>(II)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {v0, p3}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 18
    .line 19
    .line 20
    new-instance p3, Landroid/graphics/Matrix;

    .line 21
    .line 22
    invoke-direct {p3}, Landroid/graphics/Matrix;-><init>()V

    .line 23
    .line 24
    .line 25
    new-instance v1, Lb7/z0;

    .line 26
    .line 27
    invoke-direct {v1, v0, p3}, Lb7/z0;-><init>(Lcom/zykj/camera/view/ManualPointView;Landroid/graphics/Matrix;)V

    .line 28
    .line 29
    .line 30
    invoke-virtual {p0, v1}, Lb7/w0;->d(Lkotlin/jvm/functions/Function0;)V

    .line 31
    .line 32
    .line 33
    new-instance p0, Lb7/a1;

    .line 34
    .line 35
    invoke-direct {p0, v0, p3, p1, p2}, Lb7/a1;-><init>(Lcom/zykj/camera/view/ManualPointView;Landroid/graphics/Matrix;Landroid/graphics/Bitmap;Ljava/util/List;)V

    .line 36
    .line 37
    .line 38
    invoke-virtual {v0, p0}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 39
    .line 40
    .line 41
    return-object v0
.end method

.method public static final g(Lcom/zykj/camera/view/ManualPointView;Landroid/graphics/Matrix;)Ljava/util/List;
    .locals 5

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Lcom/zykj/camera/view/ManualPointView;->getPointMap()Ljava/util/Map;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    sget-object v1, Lcom/zykj/camera/view/ManualPointView$PointType;->a:Lcom/zykj/camera/view/ManualPointView$PointType;

    .line 11
    .line 12
    sget-object v2, Lcom/zykj/camera/view/ManualPointView$PointType;->c:Lcom/zykj/camera/view/ManualPointView$PointType;

    .line 13
    .line 14
    sget-object v3, Lcom/zykj/camera/view/ManualPointView$PointType;->d:Lcom/zykj/camera/view/ManualPointView$PointType;

    .line 15
    .line 16
    sget-object v4, Lcom/zykj/camera/view/ManualPointView$PointType;->b:Lcom/zykj/camera/view/ManualPointView$PointType;

    .line 17
    .line 18
    filled-new-array {v1, v2, v3, v4}, [Lcom/zykj/camera/view/ManualPointView$PointType;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    invoke-static {v1}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 27
    .line 28
    .line 29
    move-result-object v1

    .line 30
    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 31
    .line 32
    .line 33
    move-result v2

    .line 34
    if-eqz v2, :cond_1

    .line 35
    .line 36
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object v2

    .line 40
    check-cast v2, Lcom/zykj/camera/view/ManualPointView$PointType;

    .line 41
    .line 42
    invoke-interface {p0, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object v2

    .line 46
    check-cast v2, Landroid/graphics/Point;

    .line 47
    .line 48
    if-eqz v2, :cond_0

    .line 49
    .line 50
    invoke-static {p1}, Le5/m;->b(Landroid/graphics/Matrix;)Landroid/graphics/Matrix;

    .line 51
    .line 52
    .line 53
    move-result-object v3

    .line 54
    invoke-static {v2, v3}, Lb7/b1;->j(Landroid/graphics/Point;Landroid/graphics/Matrix;)Landroid/graphics/Point;

    .line 55
    .line 56
    .line 57
    move-result-object v2

    .line 58
    if-eqz v2, :cond_0

    .line 59
    .line 60
    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 61
    .line 62
    .line 63
    goto :goto_0

    .line 64
    :cond_1
    return-object v0
.end method

.method public static final h(Lcom/zykj/camera/view/ManualPointView;Landroid/graphics/Matrix;Landroid/graphics/Bitmap;Ljava/util/List;)V
    .locals 8

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    int-to-float v2, v0

    .line 10
    invoke-virtual {p2}, Landroid/graphics/Bitmap;->getWidth()I

    .line 11
    .line 12
    .line 13
    move-result v3

    .line 14
    int-to-float v3, v3

    .line 15
    div-float/2addr v2, v3

    .line 16
    int-to-float v3, v1

    .line 17
    invoke-virtual {p2}, Landroid/graphics/Bitmap;->getHeight()I

    .line 18
    .line 19
    .line 20
    move-result v4

    .line 21
    int-to-float v4, v4

    .line 22
    div-float/2addr v3, v4

    .line 23
    invoke-virtual {p1, v2, v3}, Landroid/graphics/Matrix;->setScale(FF)V

    .line 24
    .line 25
    .line 26
    const/4 v2, 0x1

    .line 27
    invoke-static {p2, v0, v1, v2}, Landroid/graphics/Bitmap;->createScaledBitmap(Landroid/graphics/Bitmap;IIZ)Landroid/graphics/Bitmap;

    .line 28
    .line 29
    .line 30
    move-result-object p2

    .line 31
    const-string v0, "createScaledBitmap(...)"

    .line 32
    .line 33
    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    invoke-virtual {p0, p2}, Lcom/zykj/camera/view/ManualPointView;->setBackBitmap(Landroid/graphics/Bitmap;)V

    .line 37
    .line 38
    .line 39
    new-instance p2, Ljava/util/LinkedHashMap;

    .line 40
    .line 41
    invoke-direct {p2}, Ljava/util/LinkedHashMap;-><init>()V

    .line 42
    .line 43
    .line 44
    invoke-virtual {p0}, Lcom/zykj/camera/view/ManualPointView;->getRangeRectMap()Ljava/util/Map;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    invoke-interface {p3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 49
    .line 50
    .line 51
    move-result-object p3

    .line 52
    :cond_0
    invoke-interface {p3}, Ljava/util/Iterator;->hasNext()Z

    .line 53
    .line 54
    .line 55
    move-result v1

    .line 56
    if-eqz v1, :cond_2

    .line 57
    .line 58
    invoke-interface {p3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 59
    .line 60
    .line 61
    move-result-object v1

    .line 62
    check-cast v1, Landroid/graphics/Point;

    .line 63
    .line 64
    invoke-static {v1, p1}, Lb7/b1;->j(Landroid/graphics/Point;Landroid/graphics/Matrix;)Landroid/graphics/Point;

    .line 65
    .line 66
    .line 67
    move-result-object v1

    .line 68
    invoke-interface {v0}, Ljava/util/Map;->keySet()Ljava/util/Set;

    .line 69
    .line 70
    .line 71
    move-result-object v3

    .line 72
    check-cast v3, Ljava/lang/Iterable;

    .line 73
    .line 74
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 75
    .line 76
    .line 77
    move-result-object v3

    .line 78
    :cond_1
    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 79
    .line 80
    .line 81
    move-result v4

    .line 82
    if-eqz v4, :cond_0

    .line 83
    .line 84
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 85
    .line 86
    .line 87
    move-result-object v4

    .line 88
    check-cast v4, Lcom/zykj/camera/view/ManualPointView$PointType;

    .line 89
    .line 90
    invoke-interface {v0, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 91
    .line 92
    .line 93
    move-result-object v5

    .line 94
    check-cast v5, Landroid/graphics/RectF;

    .line 95
    .line 96
    if-eqz v5, :cond_1

    .line 97
    .line 98
    iget v6, v1, Landroid/graphics/Point;->x:I

    .line 99
    .line 100
    int-to-float v6, v6

    .line 101
    iget v7, v1, Landroid/graphics/Point;->y:I

    .line 102
    .line 103
    int-to-float v7, v7

    .line 104
    invoke-virtual {v5, v6, v7}, Landroid/graphics/RectF;->contains(FF)Z

    .line 105
    .line 106
    .line 107
    move-result v5

    .line 108
    if-ne v5, v2, :cond_1

    .line 109
    .line 110
    invoke-interface {p2, v4, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 111
    .line 112
    .line 113
    goto :goto_0

    .line 114
    :cond_2
    invoke-virtual {p0, p2}, Lcom/zykj/camera/view/ManualPointView;->setPointMap(Ljava/util/Map;)V

    .line 115
    .line 116
    .line 117
    return-void
.end method

.method public static final i(Landroidx/compose/ui/Modifier;Lb7/w0;Landroid/graphics/Bitmap;Ljava/util/List;IILandroidx/compose/runtime/Composer;I)Lkotlin/Unit;
    .locals 7

    .line 1
    or-int/lit8 p4, p4, 0x1

    .line 2
    .line 3
    invoke-static {p4}, Landroidx/compose/runtime/RecomposeScopeImplKt;->updateChangedFlags(I)I

    .line 4
    .line 5
    .line 6
    move-result v5

    .line 7
    move-object v0, p0

    .line 8
    move-object v1, p1

    .line 9
    move-object v2, p2

    .line 10
    move-object v3, p3

    .line 11
    move v6, p5

    .line 12
    move-object v4, p6

    .line 13
    invoke-static/range {v0 .. v6}, Lb7/b1;->e(Landroidx/compose/ui/Modifier;Lb7/w0;Landroid/graphics/Bitmap;Ljava/util/List;Landroidx/compose/runtime/Composer;II)V

    .line 14
    .line 15
    .line 16
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 17
    .line 18
    return-object p0
.end method

.method public static final j(Landroid/graphics/Point;Landroid/graphics/Matrix;)Landroid/graphics/Point;
    .locals 4

    .line 1
    const/4 v0, 0x2

    .line 2
    new-array v1, v0, [F

    .line 3
    .line 4
    iget v2, p0, Landroid/graphics/Point;->x:I

    .line 5
    .line 6
    int-to-float v2, v2

    .line 7
    iget p0, p0, Landroid/graphics/Point;->y:I

    .line 8
    .line 9
    int-to-float p0, p0

    .line 10
    new-array v0, v0, [F

    .line 11
    .line 12
    const/4 v3, 0x0

    .line 13
    aput v2, v0, v3

    .line 14
    .line 15
    const/4 v2, 0x1

    .line 16
    aput p0, v0, v2

    .line 17
    .line 18
    invoke-virtual {p1, v1, v0}, Landroid/graphics/Matrix;->mapPoints([F[F)V

    .line 19
    .line 20
    .line 21
    new-instance p0, Landroid/graphics/Point;

    .line 22
    .line 23
    aget p1, v1, v3

    .line 24
    .line 25
    float-to-int p1, p1

    .line 26
    aget v0, v1, v2

    .line 27
    .line 28
    float-to-int v0, v0

    .line 29
    invoke-direct {p0, p1, v0}, Landroid/graphics/Point;-><init>(II)V

    .line 30
    .line 31
    .line 32
    return-object p0
.end method
