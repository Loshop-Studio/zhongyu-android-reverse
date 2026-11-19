.class public abstract Ly1/a;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static a:Ljava/text/DecimalFormat;


# direct methods
.method public static final a(Ls/f;Ljava/lang/Throwable;)Ls/b;
    .locals 3

    .line 1
    new-instance v0, Ls/b;

    .line 2
    .line 3
    instance-of v1, p1, Lcoil3/request/NullRequestDataException;

    .line 4
    .line 5
    if-eqz v1, :cond_1

    .line 6
    .line 7
    iget-object v1, p0, Ls/f;->n:Lr6/c;

    .line 8
    .line 9
    iget-object v2, p0, Ls/f;->t:Ls/d;

    .line 10
    .line 11
    invoke-interface {v1, p0}, Lr6/c;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    check-cast v1, Lcoil3/k;

    .line 16
    .line 17
    if-nez v1, :cond_0

    .line 18
    .line 19
    iget-object v1, v2, Ls/d;->j:Lr6/c;

    .line 20
    .line 21
    invoke-interface {v1, p0}, Lr6/c;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    check-cast v1, Lcoil3/k;

    .line 26
    .line 27
    :cond_0
    if-nez v1, :cond_2

    .line 28
    .line 29
    iget-object v1, p0, Ls/f;->m:Lr6/c;

    .line 30
    .line 31
    invoke-interface {v1, p0}, Lr6/c;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v1

    .line 35
    check-cast v1, Lcoil3/k;

    .line 36
    .line 37
    if-nez v1, :cond_2

    .line 38
    .line 39
    iget-object v1, v2, Ls/d;->i:Lr6/c;

    .line 40
    .line 41
    invoke-interface {v1, p0}, Lr6/c;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object v1

    .line 45
    check-cast v1, Lcoil3/k;

    .line 46
    .line 47
    goto :goto_0

    .line 48
    :cond_1
    iget-object v1, p0, Ls/f;->m:Lr6/c;

    .line 49
    .line 50
    invoke-interface {v1, p0}, Lr6/c;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    move-result-object v1

    .line 54
    check-cast v1, Lcoil3/k;

    .line 55
    .line 56
    if-nez v1, :cond_2

    .line 57
    .line 58
    iget-object v1, p0, Ls/f;->t:Ls/d;

    .line 59
    .line 60
    iget-object v1, v1, Ls/d;->i:Lr6/c;

    .line 61
    .line 62
    invoke-interface {v1, p0}, Lr6/c;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    move-result-object v1

    .line 66
    check-cast v1, Lcoil3/k;

    .line 67
    .line 68
    :cond_2
    :goto_0
    invoke-direct {v0, v1, p0, p1}, Ls/b;-><init>(Lcoil3/k;Ls/f;Ljava/lang/Throwable;)V

    .line 69
    .line 70
    .line 71
    return-object v0
.end method

.method public static final b(Lw4/c;Lw4/a;Lt4/e;Lr6/e;Landroidx/compose/runtime/Composer;I)V
    .locals 17

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v2, p1

    .line 4
    .line 5
    move-object/from16 v3, p2

    .line 6
    .line 7
    move-object/from16 v4, p3

    .line 8
    .line 9
    move/from16 v5, p5

    .line 10
    .line 11
    const-string v0, "infrastructure"

    .line 12
    .line 13
    invoke-static {v2, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    const-string v0, "mainNavController"

    .line 17
    .line 18
    invoke-static {v3, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    const-string v0, "content"

    .line 22
    .line 23
    invoke-static {v4, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    const v0, -0x2cb5d7eb

    .line 27
    .line 28
    .line 29
    move-object/from16 v6, p4

    .line 30
    .line 31
    invoke-interface {v6, v0}, Landroidx/compose/runtime/Composer;->startRestartGroup(I)Landroidx/compose/runtime/Composer;

    .line 32
    .line 33
    .line 34
    move-result-object v6

    .line 35
    and-int/lit8 v7, v5, 0x6

    .line 36
    .line 37
    if-nez v7, :cond_2

    .line 38
    .line 39
    and-int/lit8 v7, v5, 0x8

    .line 40
    .line 41
    if-nez v7, :cond_0

    .line 42
    .line 43
    invoke-interface {v6, v1}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 44
    .line 45
    .line 46
    move-result v7

    .line 47
    goto :goto_0

    .line 48
    :cond_0
    invoke-interface {v6, v1}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 49
    .line 50
    .line 51
    move-result v7

    .line 52
    :goto_0
    if-eqz v7, :cond_1

    .line 53
    .line 54
    const/4 v7, 0x4

    .line 55
    goto :goto_1

    .line 56
    :cond_1
    const/4 v7, 0x2

    .line 57
    :goto_1
    or-int/2addr v7, v5

    .line 58
    goto :goto_2

    .line 59
    :cond_2
    move v7, v5

    .line 60
    :goto_2
    and-int/lit8 v8, v5, 0x30

    .line 61
    .line 62
    if-nez v8, :cond_4

    .line 63
    .line 64
    invoke-interface {v6, v2}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 65
    .line 66
    .line 67
    move-result v8

    .line 68
    if-eqz v8, :cond_3

    .line 69
    .line 70
    const/16 v8, 0x20

    .line 71
    .line 72
    goto :goto_3

    .line 73
    :cond_3
    const/16 v8, 0x10

    .line 74
    .line 75
    :goto_3
    or-int/2addr v7, v8

    .line 76
    :cond_4
    and-int/lit16 v8, v5, 0x180

    .line 77
    .line 78
    if-nez v8, :cond_6

    .line 79
    .line 80
    invoke-interface {v6, v3}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 81
    .line 82
    .line 83
    move-result v8

    .line 84
    if-eqz v8, :cond_5

    .line 85
    .line 86
    const/16 v8, 0x100

    .line 87
    .line 88
    goto :goto_4

    .line 89
    :cond_5
    const/16 v8, 0x80

    .line 90
    .line 91
    :goto_4
    or-int/2addr v7, v8

    .line 92
    :cond_6
    and-int/lit16 v8, v5, 0xc00

    .line 93
    .line 94
    if-nez v8, :cond_8

    .line 95
    .line 96
    invoke-interface {v6, v4}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 97
    .line 98
    .line 99
    move-result v8

    .line 100
    if-eqz v8, :cond_7

    .line 101
    .line 102
    const/16 v8, 0x800

    .line 103
    .line 104
    goto :goto_5

    .line 105
    :cond_7
    const/16 v8, 0x400

    .line 106
    .line 107
    :goto_5
    or-int/2addr v7, v8

    .line 108
    :cond_8
    and-int/lit16 v8, v7, 0x493

    .line 109
    .line 110
    const/16 v9, 0x492

    .line 111
    .line 112
    const/4 v10, 0x1

    .line 113
    if-eq v8, v9, :cond_9

    .line 114
    .line 115
    move v8, v10

    .line 116
    goto :goto_6

    .line 117
    :cond_9
    const/4 v8, 0x0

    .line 118
    :goto_6
    and-int/lit8 v9, v7, 0x1

    .line 119
    .line 120
    invoke-interface {v6, v8, v9}, Landroidx/compose/runtime/Composer;->shouldExecute(ZI)Z

    .line 121
    .line 122
    .line 123
    move-result v8

    .line 124
    if-eqz v8, :cond_b

    .line 125
    .line 126
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 127
    .line 128
    .line 129
    move-result v8

    .line 130
    if-eqz v8, :cond_a

    .line 131
    .line 132
    const/4 v8, -0x1

    .line 133
    const-string v9, "com.zykj.mistake.platform.MainRouteCompositionLocals (MainRouteCompositionLocals.kt:17)"

    .line 134
    .line 135
    invoke-static {v0, v7, v8, v9}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 136
    .line 137
    .line 138
    :cond_a
    sget-object v0, Lw4/d;->a:Landroidx/compose/runtime/ProvidableCompositionLocal;

    .line 139
    .line 140
    invoke-virtual {v0, v1}, Landroidx/compose/runtime/ProvidableCompositionLocal;->provides(Ljava/lang/Object;)Landroidx/compose/runtime/ProvidedValue;

    .line 141
    .line 142
    .line 143
    move-result-object v11

    .line 144
    sget-object v0, Lt4/d;->a:Landroidx/compose/runtime/ProvidableCompositionLocal;

    .line 145
    .line 146
    invoke-virtual {v0, v3}, Landroidx/compose/runtime/ProvidableCompositionLocal;->provides(Ljava/lang/Object;)Landroidx/compose/runtime/ProvidedValue;

    .line 147
    .line 148
    .line 149
    move-result-object v12

    .line 150
    sget-object v0, Lz4/f;->a:Landroidx/compose/runtime/ProvidableCompositionLocal;

    .line 151
    .line 152
    iget-object v7, v2, Lw4/a;->a:Lz4/e;

    .line 153
    .line 154
    invoke-virtual {v0, v7}, Landroidx/compose/runtime/ProvidableCompositionLocal;->provides(Ljava/lang/Object;)Landroidx/compose/runtime/ProvidedValue;

    .line 155
    .line 156
    .line 157
    move-result-object v13

    .line 158
    sget-object v0, Lz4/b;->a:Landroidx/compose/runtime/ProvidableCompositionLocal;

    .line 159
    .line 160
    iget-object v7, v2, Lw4/a;->b:Lz4/a;

    .line 161
    .line 162
    invoke-virtual {v0, v7}, Landroidx/compose/runtime/ProvidableCompositionLocal;->provides(Ljava/lang/Object;)Landroidx/compose/runtime/ProvidedValue;

    .line 163
    .line 164
    .line 165
    move-result-object v14

    .line 166
    sget-object v0, Lz4/d;->a:Landroidx/compose/runtime/ProvidableCompositionLocal;

    .line 167
    .line 168
    iget-object v7, v2, Lw4/a;->c:Lz4/c;

    .line 169
    .line 170
    invoke-virtual {v0, v7}, Landroidx/compose/runtime/ProvidableCompositionLocal;->provides(Ljava/lang/Object;)Landroidx/compose/runtime/ProvidedValue;

    .line 171
    .line 172
    .line 173
    move-result-object v15

    .line 174
    sget-object v0, Lz4/h;->a:Landroidx/compose/runtime/ProvidableCompositionLocal;

    .line 175
    .line 176
    iget-object v7, v2, Lw4/a;->d:Lz4/g;

    .line 177
    .line 178
    invoke-virtual {v0, v7}, Landroidx/compose/runtime/ProvidableCompositionLocal;->provides(Ljava/lang/Object;)Landroidx/compose/runtime/ProvidedValue;

    .line 179
    .line 180
    .line 181
    move-result-object v16

    .line 182
    filled-new-array/range {v11 .. v16}, [Landroidx/compose/runtime/ProvidedValue;

    .line 183
    .line 184
    .line 185
    move-result-object v0

    .line 186
    new-instance v7, Lw4/b;

    .line 187
    .line 188
    const/4 v8, 0x0

    .line 189
    invoke-direct {v7, v4, v8}, Lw4/b;-><init>(Lr6/e;I)V

    .line 190
    .line 191
    .line 192
    const/16 v8, 0x36

    .line 193
    .line 194
    const v9, 0x3e751cd5

    .line 195
    .line 196
    .line 197
    invoke-static {v9, v10, v7, v6, v8}, Landroidx/compose/runtime/internal/ComposableLambdaKt;->rememberComposableLambda(IZLjava/lang/Object;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/internal/ComposableLambda;

    .line 198
    .line 199
    .line 200
    move-result-object v7

    .line 201
    sget v8, Landroidx/compose/runtime/ProvidedValue;->$stable:I

    .line 202
    .line 203
    or-int/lit8 v8, v8, 0x30

    .line 204
    .line 205
    invoke-static {v0, v7, v6, v8}, Landroidx/compose/runtime/CompositionLocalKt;->CompositionLocalProvider([Landroidx/compose/runtime/ProvidedValue;Lr6/e;Landroidx/compose/runtime/Composer;I)V

    .line 206
    .line 207
    .line 208
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 209
    .line 210
    .line 211
    move-result v0

    .line 212
    if-eqz v0, :cond_c

    .line 213
    .line 214
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 215
    .line 216
    .line 217
    goto :goto_7

    .line 218
    :cond_b
    invoke-interface {v6}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    .line 219
    .line 220
    .line 221
    :cond_c
    :goto_7
    invoke-interface {v6}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    .line 222
    .line 223
    .line 224
    move-result-object v7

    .line 225
    if-eqz v7, :cond_d

    .line 226
    .line 227
    new-instance v0, Lcom/zykj/mistake/feature/notebook/detail/d0;

    .line 228
    .line 229
    const/4 v6, 0x4

    .line 230
    invoke-direct/range {v0 .. v6}, Lcom/zykj/mistake/feature/notebook/detail/d0;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;II)V

    .line 231
    .line 232
    .line 233
    invoke-interface {v7, v0}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lr6/e;)V

    .line 234
    .line 235
    .line 236
    :cond_d
    return-void
.end method

.method public static c(Lcom/xuexiang/xui/widget/progress/ratingbar/PartialView;FF)F
    .locals 3

    .line 1
    sget-object v0, Ly1/a;->a:Ljava/text/DecimalFormat;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Ljava/text/DecimalFormatSymbols;

    .line 6
    .line 7
    sget-object v1, Ljava/util/Locale;->ENGLISH:Ljava/util/Locale;

    .line 8
    .line 9
    invoke-direct {v0, v1}, Ljava/text/DecimalFormatSymbols;-><init>(Ljava/util/Locale;)V

    .line 10
    .line 11
    .line 12
    const/16 v1, 0x2e

    .line 13
    .line 14
    invoke-virtual {v0, v1}, Ljava/text/DecimalFormatSymbols;->setDecimalSeparator(C)V

    .line 15
    .line 16
    .line 17
    new-instance v1, Ljava/text/DecimalFormat;

    .line 18
    .line 19
    const-string v2, "#.##"

    .line 20
    .line 21
    invoke-direct {v1, v2, v0}, Ljava/text/DecimalFormat;-><init>(Ljava/lang/String;Ljava/text/DecimalFormatSymbols;)V

    .line 22
    .line 23
    .line 24
    sput-object v1, Ly1/a;->a:Ljava/text/DecimalFormat;

    .line 25
    .line 26
    :cond_0
    sget-object v0, Ly1/a;->a:Ljava/text/DecimalFormat;

    .line 27
    .line 28
    invoke-virtual {p0}, Landroid/view/View;->getLeft()I

    .line 29
    .line 30
    .line 31
    move-result v1

    .line 32
    int-to-float v1, v1

    .line 33
    sub-float/2addr p2, v1

    .line 34
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    .line 35
    .line 36
    .line 37
    move-result v1

    .line 38
    int-to-float v1, v1

    .line 39
    div-float/2addr p2, v1

    .line 40
    float-to-double v1, p2

    .line 41
    invoke-virtual {v0, v1, v2}, Ljava/text/NumberFormat;->format(D)Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object p2

    .line 45
    invoke-static {p2}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    .line 46
    .line 47
    .line 48
    move-result p2

    .line 49
    div-float/2addr p2, p1

    .line 50
    invoke-static {p2}, Ljava/lang/Math;->round(F)I

    .line 51
    .line 52
    .line 53
    move-result p2

    .line 54
    int-to-float p2, p2

    .line 55
    mul-float/2addr p2, p1

    .line 56
    invoke-virtual {p0}, Landroid/view/View;->getTag()Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    move-result-object p0

    .line 60
    check-cast p0, Ljava/lang/Integer;

    .line 61
    .line 62
    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    .line 63
    .line 64
    .line 65
    move-result p0

    .line 66
    int-to-float p0, p0

    .line 67
    const/high16 p1, 0x3f800000    # 1.0f

    .line 68
    .line 69
    sub-float/2addr p1, p2

    .line 70
    sub-float/2addr p0, p1

    .line 71
    float-to-double p0, p0

    .line 72
    invoke-virtual {v0, p0, p1}, Ljava/text/NumberFormat;->format(D)Ljava/lang/String;

    .line 73
    .line 74
    .line 75
    move-result-object p0

    .line 76
    invoke-static {p0}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    .line 77
    .line 78
    .line 79
    move-result p0

    .line 80
    return p0
.end method

.method public static d(I)V
    .locals 5

    .line 1
    const/4 v0, 0x2

    .line 2
    if-gt v0, p0, :cond_0

    .line 3
    .line 4
    const/16 v1, 0x25

    .line 5
    .line 6
    if-ge p0, v1, :cond_0

    .line 7
    .line 8
    return-void

    .line 9
    :cond_0
    new-instance v1, Ljava/lang/IllegalArgumentException;

    .line 10
    .line 11
    const-string v2, "radix "

    .line 12
    .line 13
    const-string v3, " was not in valid range "

    .line 14
    .line 15
    invoke-static {p0, v2, v3}, Landroid/support/v4/media/f;->s(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    new-instance v2, Lx6/f;

    .line 20
    .line 21
    const/16 v3, 0x24

    .line 22
    .line 23
    const/4 v4, 0x1

    .line 24
    invoke-direct {v2, v0, v3, v4}, Lx6/d;-><init>(III)V

    .line 25
    .line 26
    .line 27
    invoke-virtual {p0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 28
    .line 29
    .line 30
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object p0

    .line 34
    invoke-direct {v1, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    throw v1
.end method

.method public static f(Ljava/lang/Comparable;Ljava/lang/Comparable;)I
    .locals 0

    .line 1
    if-ne p0, p1, :cond_0

    .line 2
    .line 3
    const/4 p0, 0x0

    .line 4
    return p0

    .line 5
    :cond_0
    if-nez p0, :cond_1

    .line 6
    .line 7
    const/4 p0, -0x1

    .line 8
    return p0

    .line 9
    :cond_1
    if-nez p1, :cond_2

    .line 10
    .line 11
    const/4 p0, 0x1

    .line 12
    return p0

    .line 13
    :cond_2
    invoke-interface {p0, p1}, Ljava/lang/Comparable;->compareTo(Ljava/lang/Object;)I

    .line 14
    .line 15
    .line 16
    move-result p0

    .line 17
    return p0
.end method

.method public static final g(IILt/f;Lcoil3/size/Scale;Lt/f;)J
    .locals 2

    .line 1
    sget-object v0, Lt/f;->c:Lt/f;

    .line 2
    .line 3
    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    iget-object p0, p2, Lt/f;->a:Lt/c;

    .line 11
    .line 12
    invoke-static {p0, p3}, Ly1/a;->u(Lt/c;Lcoil3/size/Scale;)I

    .line 13
    .line 14
    .line 15
    move-result p0

    .line 16
    iget-object p1, p2, Lt/f;->b:Lt/c;

    .line 17
    .line 18
    invoke-static {p1, p3}, Ly1/a;->u(Lt/c;Lcoil3/size/Scale;)I

    .line 19
    .line 20
    .line 21
    move-result p1

    .line 22
    :goto_0
    iget-object p2, p4, Lt/f;->a:Lt/c;

    .line 23
    .line 24
    iget-object p3, p4, Lt/f;->b:Lt/c;

    .line 25
    .line 26
    instance-of p4, p2, Lt/a;

    .line 27
    .line 28
    const v0, 0x7fffffff

    .line 29
    .line 30
    .line 31
    const/high16 v1, -0x80000000

    .line 32
    .line 33
    if-eqz p4, :cond_2

    .line 34
    .line 35
    if-eq p0, v1, :cond_2

    .line 36
    .line 37
    if-ne p0, v0, :cond_1

    .line 38
    .line 39
    goto :goto_1

    .line 40
    :cond_1
    check-cast p2, Lt/a;

    .line 41
    .line 42
    iget p2, p2, Lt/a;->a:I

    .line 43
    .line 44
    if-le p0, p2, :cond_2

    .line 45
    .line 46
    move p0, p2

    .line 47
    :cond_2
    :goto_1
    instance-of p2, p3, Lt/a;

    .line 48
    .line 49
    if-eqz p2, :cond_4

    .line 50
    .line 51
    if-eq p1, v1, :cond_4

    .line 52
    .line 53
    if-ne p1, v0, :cond_3

    .line 54
    .line 55
    goto :goto_2

    .line 56
    :cond_3
    check-cast p3, Lt/a;

    .line 57
    .line 58
    iget p2, p3, Lt/a;->a:I

    .line 59
    .line 60
    if-le p1, p2, :cond_4

    .line 61
    .line 62
    move p1, p2

    .line 63
    :cond_4
    :goto_2
    int-to-long p2, p0

    .line 64
    const/16 p0, 0x20

    .line 65
    .line 66
    shl-long/2addr p2, p0

    .line 67
    int-to-long p0, p1

    .line 68
    const-wide v0, 0xffffffffL

    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    and-long/2addr p0, v0

    .line 74
    or-long/2addr p0, p2

    .line 75
    return-wide p0
.end method

.method public static final h(IIIILcoil3/size/Scale;)D
    .locals 4

    .line 1
    int-to-double v0, p2

    .line 2
    int-to-double v2, p0

    .line 3
    div-double/2addr v0, v2

    .line 4
    int-to-double p2, p3

    .line 5
    int-to-double p0, p1

    .line 6
    div-double/2addr p2, p0

    .line 7
    sget-object p0, Lcoil3/decode/h;->a:[I

    .line 8
    .line 9
    invoke-virtual {p4}, Ljava/lang/Enum;->ordinal()I

    .line 10
    .line 11
    .line 12
    move-result p1

    .line 13
    aget p0, p0, p1

    .line 14
    .line 15
    const/4 p1, 0x1

    .line 16
    if-eq p0, p1, :cond_1

    .line 17
    .line 18
    const/4 p1, 0x2

    .line 19
    if-ne p0, p1, :cond_0

    .line 20
    .line 21
    invoke-static {v0, v1, p2, p3}, Ljava/lang/Math;->min(DD)D

    .line 22
    .line 23
    .line 24
    move-result-wide p0

    .line 25
    return-wide p0

    .line 26
    :cond_0
    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    .line 27
    .line 28
    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    .line 29
    .line 30
    .line 31
    throw p0

    .line 32
    :cond_1
    invoke-static {v0, v1, p2, p3}, Ljava/lang/Math;->max(DD)D

    .line 33
    .line 34
    .line 35
    move-result-wide p0

    .line 36
    return-wide p0
.end method

.method public static i(Lcom/google/flatbuffers/a;JJ)I
    .locals 3

    .line 1
    const/16 v0, 0x10

    .line 2
    .line 3
    const/16 v1, 0x8

    .line 4
    .line 5
    invoke-virtual {p0, v1, v0}, Lcom/google/flatbuffers/a;->h(II)V

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, Lcom/google/flatbuffers/a;->a:Ljava/nio/ByteBuffer;

    .line 9
    .line 10
    iget v2, p0, Lcom/google/flatbuffers/a;->b:I

    .line 11
    .line 12
    sub-int/2addr v2, v1

    .line 13
    iput v2, p0, Lcom/google/flatbuffers/a;->b:I

    .line 14
    .line 15
    invoke-virtual {v0, v2, p3, p4}, Ljava/nio/ByteBuffer;->putLong(IJ)Ljava/nio/ByteBuffer;

    .line 16
    .line 17
    .line 18
    const/4 p3, 0x0

    .line 19
    move p4, p3

    .line 20
    :goto_0
    const/4 v0, 0x4

    .line 21
    if-ge p4, v0, :cond_0

    .line 22
    .line 23
    iget-object v0, p0, Lcom/google/flatbuffers/a;->a:Ljava/nio/ByteBuffer;

    .line 24
    .line 25
    iget v1, p0, Lcom/google/flatbuffers/a;->b:I

    .line 26
    .line 27
    add-int/lit8 v1, v1, -0x1

    .line 28
    .line 29
    iput v1, p0, Lcom/google/flatbuffers/a;->b:I

    .line 30
    .line 31
    invoke-virtual {v0, v1, p3}, Ljava/nio/ByteBuffer;->put(IB)Ljava/nio/ByteBuffer;

    .line 32
    .line 33
    .line 34
    add-int/lit8 p4, p4, 0x1

    .line 35
    .line 36
    goto :goto_0

    .line 37
    :cond_0
    long-to-int p1, p1

    .line 38
    invoke-virtual {p0, p1}, Lcom/google/flatbuffers/a;->i(I)V

    .line 39
    .line 40
    .line 41
    invoke-virtual {p0}, Lcom/google/flatbuffers/a;->g()I

    .line 42
    .line 43
    .line 44
    move-result p0

    .line 45
    return p0
.end method

.method public static j(C)I
    .locals 3

    .line 1
    const/16 v0, 0xa

    .line 2
    .line 3
    invoke-static {p0, v0}, Ljava/lang/Character;->digit(II)I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-ltz v0, :cond_0

    .line 8
    .line 9
    return v0

    .line 10
    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 11
    .line 12
    new-instance v1, Ljava/lang/StringBuilder;

    .line 13
    .line 14
    const-string v2, "Char "

    .line 15
    .line 16
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 20
    .line 21
    .line 22
    const-string p0, " is not a decimal digit"

    .line 23
    .line 24
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 25
    .line 26
    .line 27
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    invoke-direct {v0, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 32
    .line 33
    .line 34
    throw v0
.end method

.method public static final k(CCZ)Z
    .locals 2

    .line 1
    const/4 v0, 0x1

    .line 2
    if-ne p0, p1, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    const/4 v1, 0x0

    .line 6
    if-nez p2, :cond_1

    .line 7
    .line 8
    return v1

    .line 9
    :cond_1
    invoke-static {p0}, Ljava/lang/Character;->toUpperCase(C)C

    .line 10
    .line 11
    .line 12
    move-result p0

    .line 13
    invoke-static {p1}, Ljava/lang/Character;->toUpperCase(C)C

    .line 14
    .line 15
    .line 16
    move-result p1

    .line 17
    if-eq p0, p1, :cond_3

    .line 18
    .line 19
    invoke-static {p0}, Ljava/lang/Character;->toLowerCase(C)C

    .line 20
    .line 21
    .line 22
    move-result p0

    .line 23
    invoke-static {p1}, Ljava/lang/Character;->toLowerCase(C)C

    .line 24
    .line 25
    .line 26
    move-result p1

    .line 27
    if-ne p0, p1, :cond_2

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_2
    return v1

    .line 31
    :cond_3
    :goto_0
    return v0
.end method

.method public static l(IIII)Landroid/graphics/Rect;
    .locals 10

    .line 1
    const-wide/high16 v0, 0x7ff0000000000000L    # Double.POSITIVE_INFINITY

    .line 2
    .line 3
    if-ge p2, p0, :cond_0

    .line 4
    .line 5
    int-to-double v2, p2

    .line 6
    int-to-double v4, p0

    .line 7
    div-double/2addr v2, v4

    .line 8
    goto :goto_0

    .line 9
    :cond_0
    move-wide v2, v0

    .line 10
    :goto_0
    if-ge p3, p1, :cond_1

    .line 11
    .line 12
    int-to-double v4, p3

    .line 13
    int-to-double v6, p1

    .line 14
    div-double/2addr v4, v6

    .line 15
    goto :goto_1

    .line 16
    :cond_1
    move-wide v4, v0

    .line 17
    :goto_1
    cmpl-double v6, v2, v0

    .line 18
    .line 19
    if-nez v6, :cond_3

    .line 20
    .line 21
    cmpl-double v0, v4, v0

    .line 22
    .line 23
    if-eqz v0, :cond_2

    .line 24
    .line 25
    goto :goto_2

    .line 26
    :cond_2
    int-to-double v0, p1

    .line 27
    int-to-double p0, p0

    .line 28
    goto :goto_3

    .line 29
    :cond_3
    :goto_2
    cmpg-double v0, v2, v4

    .line 30
    .line 31
    if-gtz v0, :cond_4

    .line 32
    .line 33
    int-to-double v0, p2

    .line 34
    int-to-double v2, p1

    .line 35
    mul-double/2addr v2, v0

    .line 36
    int-to-double p0, p0

    .line 37
    div-double p0, v2, p0

    .line 38
    .line 39
    move-wide v8, v0

    .line 40
    move-wide v0, p0

    .line 41
    move-wide p0, v8

    .line 42
    goto :goto_3

    .line 43
    :cond_4
    int-to-double v0, p3

    .line 44
    int-to-double v2, p0

    .line 45
    mul-double/2addr v2, v0

    .line 46
    int-to-double p0, p1

    .line 47
    div-double p0, v2, p0

    .line 48
    .line 49
    :goto_3
    int-to-double v2, p2

    .line 50
    cmpl-double p2, p0, v2

    .line 51
    .line 52
    const/4 v4, 0x0

    .line 53
    const-wide/high16 v5, 0x4000000000000000L    # 2.0

    .line 54
    .line 55
    if-nez p2, :cond_5

    .line 56
    .line 57
    int-to-double p2, p3

    .line 58
    sub-double/2addr p2, v0

    .line 59
    div-double/2addr p2, v5

    .line 60
    invoke-static {p2, p3}, Ljava/lang/Math;->round(D)J

    .line 61
    .line 62
    .line 63
    move-result-wide p2

    .line 64
    :goto_4
    long-to-int p2, p2

    .line 65
    goto :goto_5

    .line 66
    :cond_5
    int-to-double p2, p3

    .line 67
    cmpl-double v7, v0, p2

    .line 68
    .line 69
    if-nez v7, :cond_6

    .line 70
    .line 71
    sub-double/2addr v2, p0

    .line 72
    div-double/2addr v2, v5

    .line 73
    invoke-static {v2, v3}, Ljava/lang/Math;->round(D)J

    .line 74
    .line 75
    .line 76
    move-result-wide p2

    .line 77
    long-to-int p2, p2

    .line 78
    move v8, v4

    .line 79
    move v4, p2

    .line 80
    move p2, v8

    .line 81
    goto :goto_5

    .line 82
    :cond_6
    sub-double/2addr v2, p0

    .line 83
    div-double/2addr v2, v5

    .line 84
    invoke-static {v2, v3}, Ljava/lang/Math;->round(D)J

    .line 85
    .line 86
    .line 87
    move-result-wide v2

    .line 88
    long-to-int v4, v2

    .line 89
    sub-double/2addr p2, v0

    .line 90
    div-double/2addr p2, v5

    .line 91
    invoke-static {p2, p3}, Ljava/lang/Math;->round(D)J

    .line 92
    .line 93
    .line 94
    move-result-wide p2

    .line 95
    goto :goto_4

    .line 96
    :goto_5
    new-instance p3, Landroid/graphics/Rect;

    .line 97
    .line 98
    invoke-static {p0, p1}, Ljava/lang/Math;->ceil(D)D

    .line 99
    .line 100
    .line 101
    move-result-wide p0

    .line 102
    double-to-int p0, p0

    .line 103
    add-int/2addr p0, v4

    .line 104
    invoke-static {v0, v1}, Ljava/lang/Math;->ceil(D)D

    .line 105
    .line 106
    .line 107
    move-result-wide v0

    .line 108
    double-to-int p1, v0

    .line 109
    add-int/2addr p1, p2

    .line 110
    invoke-direct {p3, v4, p2, p0, p1}, Landroid/graphics/Rect;-><init>(IIII)V

    .line 111
    .line 112
    .line 113
    return-object p3
.end method

.method public static final m(Lk7/g;)Ly6/c;
    .locals 1

    .line 1
    const-string v0, "<this>"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    instance-of v0, p0, Lk7/b;

    .line 7
    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    check-cast p0, Lk7/b;

    .line 11
    .line 12
    iget-object p0, p0, Lk7/b;->b:Ly6/c;

    .line 13
    .line 14
    return-object p0

    .line 15
    :cond_0
    instance-of v0, p0, Lm7/h1;

    .line 16
    .line 17
    if-eqz v0, :cond_1

    .line 18
    .line 19
    check-cast p0, Lm7/h1;

    .line 20
    .line 21
    iget-object p0, p0, Lm7/h1;->a:Lk7/g;

    .line 22
    .line 23
    invoke-static {p0}, Ly1/a;->m(Lk7/g;)Ly6/c;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    return-object p0

    .line 28
    :cond_1
    const/4 p0, 0x0

    .line 29
    return-object p0
.end method

.method public static final n(Landroid/view/View;)Ls/o;
    .locals 3

    .line 1
    sget v0, Lcoil3/core/R$id;->coil3_request_manager:I

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    instance-of v1, v0, Ls/o;

    .line 8
    .line 9
    const/4 v2, 0x0

    .line 10
    if-eqz v1, :cond_0

    .line 11
    .line 12
    check-cast v0, Ls/o;

    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_0
    move-object v0, v2

    .line 16
    :goto_0
    if-nez v0, :cond_3

    .line 17
    .line 18
    monitor-enter p0

    .line 19
    :try_start_0
    sget v0, Lcoil3/core/R$id;->coil3_request_manager:I

    .line 20
    .line 21
    invoke-virtual {p0, v0}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    instance-of v1, v0, Ls/o;

    .line 26
    .line 27
    if-eqz v1, :cond_1

    .line 28
    .line 29
    move-object v2, v0

    .line 30
    check-cast v2, Ls/o;

    .line 31
    .line 32
    goto :goto_1

    .line 33
    :catchall_0
    move-exception v0

    .line 34
    goto :goto_3

    .line 35
    :cond_1
    :goto_1
    if-eqz v2, :cond_2

    .line 36
    .line 37
    goto :goto_2

    .line 38
    :cond_2
    new-instance v2, Ls/o;

    .line 39
    .line 40
    invoke-direct {v2, p0}, Ls/o;-><init>(Landroid/view/View;)V

    .line 41
    .line 42
    .line 43
    invoke-virtual {p0, v2}, Landroid/view/View;->addOnAttachStateChangeListener(Landroid/view/View$OnAttachStateChangeListener;)V

    .line 44
    .line 45
    .line 46
    sget v0, Lcoil3/core/R$id;->coil3_request_manager:I

    .line 47
    .line 48
    invoke-virtual {p0, v0, v2}, Landroid/view/View;->setTag(ILjava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 49
    .line 50
    .line 51
    :goto_2
    monitor-exit p0

    .line 52
    return-object v2

    .line 53
    :goto_3
    monitor-exit p0

    .line 54
    throw v0

    .line 55
    :cond_3
    return-object v0
.end method

.method public static o(C)Z
    .locals 1

    .line 1
    invoke-static {p0}, Ljava/lang/Character;->isWhitespace(C)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_1

    .line 6
    .line 7
    invoke-static {p0}, Ljava/lang/Character;->isSpaceChar(C)Z

    .line 8
    .line 9
    .line 10
    move-result p0

    .line 11
    if-eqz p0, :cond_0

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    const/4 p0, 0x0

    .line 15
    return p0

    .line 16
    :cond_1
    :goto_0
    const/4 p0, 0x1

    .line 17
    return p0
.end method

.method public static p(Landroidx/compose/ui/unit/Dp;Landroidx/compose/ui/unit/Dp;)Ljava/lang/Comparable;
    .locals 1

    .line 1
    const-string v0, "a"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "b"

    .line 7
    .line 8
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-interface {p0, p1}, Ljava/lang/Comparable;->compareTo(Ljava/lang/Object;)I

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-ltz v0, :cond_0

    .line 16
    .line 17
    return-object p0

    .line 18
    :cond_0
    return-object p1
.end method

.method public static final q(Ly6/c;Ljava/util/ArrayList;Lr6/a;)Li7/b;
    .locals 5

    .line 1
    const-string v0, "<this>"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-class v0, Ljava/util/Collection;

    .line 7
    .line 8
    invoke-static {v0}, Lkotlin/jvm/internal/m;->a(Ljava/lang/Class;)Lkotlin/jvm/internal/d;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    invoke-virtual {p0, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    const/4 v1, 0x0

    .line 17
    if-nez v0, :cond_b

    .line 18
    .line 19
    const-class v0, Ljava/util/List;

    .line 20
    .line 21
    invoke-static {v0}, Lkotlin/jvm/internal/m;->a(Ljava/lang/Class;)Lkotlin/jvm/internal/d;

    .line 22
    .line 23
    .line 24
    move-result-object v2

    .line 25
    invoke-virtual {p0, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 26
    .line 27
    .line 28
    move-result v2

    .line 29
    if-nez v2, :cond_b

    .line 30
    .line 31
    invoke-static {v0}, Lkotlin/jvm/internal/m;->a(Ljava/lang/Class;)Lkotlin/jvm/internal/d;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    invoke-virtual {p0, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 36
    .line 37
    .line 38
    move-result v0

    .line 39
    if-nez v0, :cond_b

    .line 40
    .line 41
    const-class v0, Ljava/util/ArrayList;

    .line 42
    .line 43
    invoke-static {v0}, Lkotlin/jvm/internal/m;->a(Ljava/lang/Class;)Lkotlin/jvm/internal/d;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    invoke-virtual {p0, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 48
    .line 49
    .line 50
    move-result v0

    .line 51
    if-eqz v0, :cond_0

    .line 52
    .line 53
    goto/16 :goto_3

    .line 54
    .line 55
    :cond_0
    const-class v0, Ljava/util/HashSet;

    .line 56
    .line 57
    invoke-static {v0}, Lkotlin/jvm/internal/m;->a(Ljava/lang/Class;)Lkotlin/jvm/internal/d;

    .line 58
    .line 59
    .line 60
    move-result-object v0

    .line 61
    invoke-virtual {p0, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 62
    .line 63
    .line 64
    move-result v0

    .line 65
    if-eqz v0, :cond_1

    .line 66
    .line 67
    new-instance p2, Lm7/d;

    .line 68
    .line 69
    invoke-virtual {p1, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 70
    .line 71
    .line 72
    move-result-object v0

    .line 73
    check-cast v0, Li7/b;

    .line 74
    .line 75
    const/4 v2, 0x1

    .line 76
    invoke-direct {p2, v0, v2}, Lm7/d;-><init>(Li7/b;I)V

    .line 77
    .line 78
    .line 79
    goto/16 :goto_4

    .line 80
    .line 81
    :cond_1
    const-class v0, Ljava/util/Set;

    .line 82
    .line 83
    invoke-static {v0}, Lkotlin/jvm/internal/m;->a(Ljava/lang/Class;)Lkotlin/jvm/internal/d;

    .line 84
    .line 85
    .line 86
    move-result-object v2

    .line 87
    invoke-virtual {p0, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 88
    .line 89
    .line 90
    move-result v2

    .line 91
    if-nez v2, :cond_a

    .line 92
    .line 93
    invoke-static {v0}, Lkotlin/jvm/internal/m;->a(Ljava/lang/Class;)Lkotlin/jvm/internal/d;

    .line 94
    .line 95
    .line 96
    move-result-object v0

    .line 97
    invoke-virtual {p0, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 98
    .line 99
    .line 100
    move-result v0

    .line 101
    if-nez v0, :cond_a

    .line 102
    .line 103
    const-class v0, Ljava/util/LinkedHashSet;

    .line 104
    .line 105
    invoke-static {v0}, Lkotlin/jvm/internal/m;->a(Ljava/lang/Class;)Lkotlin/jvm/internal/d;

    .line 106
    .line 107
    .line 108
    move-result-object v0

    .line 109
    invoke-virtual {p0, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 110
    .line 111
    .line 112
    move-result v0

    .line 113
    if-eqz v0, :cond_2

    .line 114
    .line 115
    goto/16 :goto_2

    .line 116
    .line 117
    :cond_2
    const-class v0, Ljava/util/HashMap;

    .line 118
    .line 119
    invoke-static {v0}, Lkotlin/jvm/internal/m;->a(Ljava/lang/Class;)Lkotlin/jvm/internal/d;

    .line 120
    .line 121
    .line 122
    move-result-object v0

    .line 123
    invoke-virtual {p0, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 124
    .line 125
    .line 126
    move-result v0

    .line 127
    const/4 v2, 0x1

    .line 128
    if-eqz v0, :cond_3

    .line 129
    .line 130
    new-instance p2, Lm7/e0;

    .line 131
    .line 132
    invoke-virtual {p1, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 133
    .line 134
    .line 135
    move-result-object v0

    .line 136
    check-cast v0, Li7/b;

    .line 137
    .line 138
    invoke-virtual {p1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 139
    .line 140
    .line 141
    move-result-object v2

    .line 142
    check-cast v2, Li7/b;

    .line 143
    .line 144
    const/4 v3, 0x0

    .line 145
    invoke-direct {p2, v0, v2, v3}, Lm7/e0;-><init>(Li7/b;Li7/b;I)V

    .line 146
    .line 147
    .line 148
    goto/16 :goto_4

    .line 149
    .line 150
    :cond_3
    const-class v0, Ljava/util/Map;

    .line 151
    .line 152
    invoke-static {v0}, Lkotlin/jvm/internal/m;->a(Ljava/lang/Class;)Lkotlin/jvm/internal/d;

    .line 153
    .line 154
    .line 155
    move-result-object v3

    .line 156
    invoke-virtual {p0, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 157
    .line 158
    .line 159
    move-result v3

    .line 160
    if-nez v3, :cond_9

    .line 161
    .line 162
    invoke-static {v0}, Lkotlin/jvm/internal/m;->a(Ljava/lang/Class;)Lkotlin/jvm/internal/d;

    .line 163
    .line 164
    .line 165
    move-result-object v0

    .line 166
    invoke-virtual {p0, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 167
    .line 168
    .line 169
    move-result v0

    .line 170
    if-nez v0, :cond_9

    .line 171
    .line 172
    const-class v0, Ljava/util/LinkedHashMap;

    .line 173
    .line 174
    invoke-static {v0}, Lkotlin/jvm/internal/m;->a(Ljava/lang/Class;)Lkotlin/jvm/internal/d;

    .line 175
    .line 176
    .line 177
    move-result-object v0

    .line 178
    invoke-virtual {p0, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 179
    .line 180
    .line 181
    move-result v0

    .line 182
    if-eqz v0, :cond_4

    .line 183
    .line 184
    goto/16 :goto_1

    .line 185
    .line 186
    :cond_4
    const-class v0, Ljava/util/Map$Entry;

    .line 187
    .line 188
    invoke-static {v0}, Lkotlin/jvm/internal/m;->a(Ljava/lang/Class;)Lkotlin/jvm/internal/d;

    .line 189
    .line 190
    .line 191
    move-result-object v0

    .line 192
    invoke-virtual {p0, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 193
    .line 194
    .line 195
    move-result v0

    .line 196
    const-string v3, "valueSerializer"

    .line 197
    .line 198
    const-string v4, "keySerializer"

    .line 199
    .line 200
    if-eqz v0, :cond_5

    .line 201
    .line 202
    invoke-virtual {p1, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 203
    .line 204
    .line 205
    move-result-object p2

    .line 206
    check-cast p2, Li7/b;

    .line 207
    .line 208
    invoke-virtual {p1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 209
    .line 210
    .line 211
    move-result-object v0

    .line 212
    check-cast v0, Li7/b;

    .line 213
    .line 214
    invoke-static {p2, v4}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 215
    .line 216
    .line 217
    invoke-static {v0, v3}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 218
    .line 219
    .line 220
    new-instance v2, Lm7/r0;

    .line 221
    .line 222
    const/4 v3, 0x0

    .line 223
    invoke-direct {v2, p2, v0, v3}, Lm7/r0;-><init>(Li7/b;Li7/b;I)V

    .line 224
    .line 225
    .line 226
    :goto_0
    move-object p2, v2

    .line 227
    goto/16 :goto_4

    .line 228
    .line 229
    :cond_5
    const-class v0, Lkotlin/Pair;

    .line 230
    .line 231
    invoke-static {v0}, Lkotlin/jvm/internal/m;->a(Ljava/lang/Class;)Lkotlin/jvm/internal/d;

    .line 232
    .line 233
    .line 234
    move-result-object v0

    .line 235
    invoke-virtual {p0, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 236
    .line 237
    .line 238
    move-result v0

    .line 239
    if-eqz v0, :cond_6

    .line 240
    .line 241
    invoke-virtual {p1, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 242
    .line 243
    .line 244
    move-result-object p2

    .line 245
    check-cast p2, Li7/b;

    .line 246
    .line 247
    invoke-virtual {p1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 248
    .line 249
    .line 250
    move-result-object v0

    .line 251
    check-cast v0, Li7/b;

    .line 252
    .line 253
    invoke-static {p2, v4}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 254
    .line 255
    .line 256
    invoke-static {v0, v3}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 257
    .line 258
    .line 259
    new-instance v2, Lm7/r0;

    .line 260
    .line 261
    const/4 v3, 0x1

    .line 262
    invoke-direct {v2, p2, v0, v3}, Lm7/r0;-><init>(Li7/b;Li7/b;I)V

    .line 263
    .line 264
    .line 265
    goto :goto_0

    .line 266
    :cond_6
    const-class v0, Lkotlin/Triple;

    .line 267
    .line 268
    invoke-static {v0}, Lkotlin/jvm/internal/m;->a(Ljava/lang/Class;)Lkotlin/jvm/internal/d;

    .line 269
    .line 270
    .line 271
    move-result-object v0

    .line 272
    invoke-virtual {p0, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 273
    .line 274
    .line 275
    move-result v0

    .line 276
    if-eqz v0, :cond_7

    .line 277
    .line 278
    invoke-virtual {p1, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 279
    .line 280
    .line 281
    move-result-object p2

    .line 282
    check-cast p2, Li7/b;

    .line 283
    .line 284
    invoke-virtual {p1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 285
    .line 286
    .line 287
    move-result-object v0

    .line 288
    check-cast v0, Li7/b;

    .line 289
    .line 290
    const/4 v2, 0x2

    .line 291
    invoke-virtual {p1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 292
    .line 293
    .line 294
    move-result-object v2

    .line 295
    check-cast v2, Li7/b;

    .line 296
    .line 297
    const-string v3, "aSerializer"

    .line 298
    .line 299
    invoke-static {p2, v3}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 300
    .line 301
    .line 302
    const-string v3, "bSerializer"

    .line 303
    .line 304
    invoke-static {v0, v3}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 305
    .line 306
    .line 307
    const-string v3, "cSerializer"

    .line 308
    .line 309
    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 310
    .line 311
    .line 312
    new-instance v3, Lm7/n1;

    .line 313
    .line 314
    invoke-direct {v3, p2, v0, v2}, Lm7/n1;-><init>(Li7/b;Li7/b;Li7/b;)V

    .line 315
    .line 316
    .line 317
    move-object p2, v3

    .line 318
    goto :goto_4

    .line 319
    :cond_7
    invoke-static {p0}, Lv7/d;->m(Ly6/c;)Ljava/lang/Class;

    .line 320
    .line 321
    .line 322
    move-result-object v0

    .line 323
    invoke-virtual {v0}, Ljava/lang/Class;->isArray()Z

    .line 324
    .line 325
    .line 326
    move-result v0

    .line 327
    if-eqz v0, :cond_8

    .line 328
    .line 329
    invoke-interface {p2}, Lr6/a;->invoke()Ljava/lang/Object;

    .line 330
    .line 331
    .line 332
    move-result-object p2

    .line 333
    const-string v0, "null cannot be cast to non-null type kotlin.reflect.KClass<kotlin.Any>"

    .line 334
    .line 335
    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 336
    .line 337
    .line 338
    check-cast p2, Ly6/c;

    .line 339
    .line 340
    invoke-virtual {p1, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 341
    .line 342
    .line 343
    move-result-object v0

    .line 344
    check-cast v0, Li7/b;

    .line 345
    .line 346
    invoke-static {p2, v0}, Lkotlin/collections/u;->a(Ly6/c;Li7/b;)Lm7/g1;

    .line 347
    .line 348
    .line 349
    move-result-object p2

    .line 350
    goto :goto_4

    .line 351
    :cond_8
    const/4 p2, 0x0

    .line 352
    goto :goto_4

    .line 353
    :cond_9
    :goto_1
    new-instance p2, Lm7/e0;

    .line 354
    .line 355
    invoke-virtual {p1, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 356
    .line 357
    .line 358
    move-result-object v0

    .line 359
    check-cast v0, Li7/b;

    .line 360
    .line 361
    invoke-virtual {p1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 362
    .line 363
    .line 364
    move-result-object v2

    .line 365
    check-cast v2, Li7/b;

    .line 366
    .line 367
    const/4 v3, 0x1

    .line 368
    invoke-direct {p2, v0, v2, v3}, Lm7/e0;-><init>(Li7/b;Li7/b;I)V

    .line 369
    .line 370
    .line 371
    goto :goto_4

    .line 372
    :cond_a
    :goto_2
    new-instance p2, Lm7/d;

    .line 373
    .line 374
    invoke-virtual {p1, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 375
    .line 376
    .line 377
    move-result-object v0

    .line 378
    check-cast v0, Li7/b;

    .line 379
    .line 380
    const/4 v2, 0x2

    .line 381
    invoke-direct {p2, v0, v2}, Lm7/d;-><init>(Li7/b;I)V

    .line 382
    .line 383
    .line 384
    goto :goto_4

    .line 385
    :cond_b
    :goto_3
    new-instance p2, Lm7/d;

    .line 386
    .line 387
    invoke-virtual {p1, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 388
    .line 389
    .line 390
    move-result-object v0

    .line 391
    check-cast v0, Li7/b;

    .line 392
    .line 393
    const/4 v2, 0x0

    .line 394
    invoke-direct {p2, v0, v2}, Lm7/d;-><init>(Li7/b;I)V

    .line 395
    .line 396
    .line 397
    :goto_4
    if-nez p2, :cond_c

    .line 398
    .line 399
    new-array p2, v1, [Li7/b;

    .line 400
    .line 401
    invoke-virtual {p1, p2}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 402
    .line 403
    .line 404
    move-result-object p1

    .line 405
    check-cast p1, [Li7/b;

    .line 406
    .line 407
    array-length p2, p1

    .line 408
    invoke-static {p1, p2}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 409
    .line 410
    .line 411
    move-result-object p1

    .line 412
    check-cast p1, [Li7/b;

    .line 413
    .line 414
    invoke-static {p0, p1}, Lm7/y0;->d(Ly6/c;[Li7/b;)Li7/b;

    .line 415
    .line 416
    .line 417
    move-result-object p0

    .line 418
    return-object p0

    .line 419
    :cond_c
    return-object p2
.end method

.method public static final r(Ly6/c;)Li7/b;
    .locals 1

    .line 1
    const-string v0, "<this>"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-static {p0}, Ly1/a;->s(Ly6/c;)Li7/b;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    return-object v0

    .line 13
    :cond_0
    invoke-static {p0}, Lm7/y0;->j(Ly6/c;)V

    .line 14
    .line 15
    .line 16
    const/4 p0, 0x0

    .line 17
    throw p0
.end method

.method public static final s(Ly6/c;)Li7/b;
    .locals 1

    .line 1
    const-string v0, "<this>"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const/4 v0, 0x0

    .line 7
    new-array v0, v0, [Li7/b;

    .line 8
    .line 9
    invoke-static {p0, v0}, Lm7/y0;->d(Ly6/c;[Li7/b;)Li7/b;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    if-nez v0, :cond_0

    .line 14
    .line 15
    sget-object v0, Lm7/f1;->a:Ljava/util/Map;

    .line 16
    .line 17
    invoke-interface {v0, p0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    check-cast p0, Li7/b;

    .line 22
    .line 23
    return-object p0

    .line 24
    :cond_0
    return-object v0
.end method

.method public static final t(Lo7/e;Ljava/util/List;Z)Ljava/util/ArrayList;
    .locals 5

    .line 1
    const-string v0, "<this>"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v1, "typeArguments"

    .line 7
    .line 8
    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const/4 v1, 0x0

    .line 12
    const-string v2, "type"

    .line 13
    .line 14
    const/16 v3, 0xa

    .line 15
    .line 16
    if-eqz p2, :cond_2

    .line 17
    .line 18
    new-instance p2, Ljava/util/ArrayList;

    .line 19
    .line 20
    invoke-static {p1, v3}, Lkotlin/collections/u;->p(Ljava/lang/Iterable;I)I

    .line 21
    .line 22
    .line 23
    move-result v3

    .line 24
    invoke-direct {p2, v3}, Ljava/util/ArrayList;-><init>(I)V

    .line 25
    .line 26
    .line 27
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 32
    .line 33
    .line 34
    move-result v3

    .line 35
    if-eqz v3, :cond_1

    .line 36
    .line 37
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object v3

    .line 41
    check-cast v3, Ly6/q;

    .line 42
    .line 43
    invoke-static {v3, v2}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 44
    .line 45
    .line 46
    const/4 v4, 0x1

    .line 47
    invoke-static {p0, v3, v4}, La/a;->o(Lo7/e;Ly6/q;Z)Li7/b;

    .line 48
    .line 49
    .line 50
    move-result-object v4

    .line 51
    if-eqz v4, :cond_0

    .line 52
    .line 53
    invoke-virtual {p2, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 54
    .line 55
    .line 56
    goto :goto_0

    .line 57
    :cond_0
    invoke-static {v3}, Lm7/y0;->i(Ly6/q;)Ly6/c;

    .line 58
    .line 59
    .line 60
    move-result-object p0

    .line 61
    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 62
    .line 63
    .line 64
    invoke-static {p0}, Lm7/y0;->j(Ly6/c;)V

    .line 65
    .line 66
    .line 67
    throw v1

    .line 68
    :cond_1
    return-object p2

    .line 69
    :cond_2
    new-instance p2, Ljava/util/ArrayList;

    .line 70
    .line 71
    invoke-static {p1, v3}, Lkotlin/collections/u;->p(Ljava/lang/Iterable;I)I

    .line 72
    .line 73
    .line 74
    move-result v0

    .line 75
    invoke-direct {p2, v0}, Ljava/util/ArrayList;-><init>(I)V

    .line 76
    .line 77
    .line 78
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 79
    .line 80
    .line 81
    move-result-object p1

    .line 82
    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 83
    .line 84
    .line 85
    move-result v0

    .line 86
    if-eqz v0, :cond_4

    .line 87
    .line 88
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 89
    .line 90
    .line 91
    move-result-object v0

    .line 92
    check-cast v0, Ly6/q;

    .line 93
    .line 94
    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 95
    .line 96
    .line 97
    const/4 v3, 0x0

    .line 98
    invoke-static {p0, v0, v3}, La/a;->o(Lo7/e;Ly6/q;Z)Li7/b;

    .line 99
    .line 100
    .line 101
    move-result-object v0

    .line 102
    if-nez v0, :cond_3

    .line 103
    .line 104
    return-object v1

    .line 105
    :cond_3
    invoke-virtual {p2, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 106
    .line 107
    .line 108
    goto :goto_1

    .line 109
    :cond_4
    return-object p2
.end method

.method public static u(Lt/c;Lcoil3/size/Scale;)I
    .locals 1

    .line 1
    instance-of v0, p0, Lt/a;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    check-cast p0, Lt/a;

    .line 6
    .line 7
    iget p0, p0, Lt/a;->a:I

    .line 8
    .line 9
    return p0

    .line 10
    :cond_0
    sget-object p0, Lcoil3/decode/h;->a:[I

    .line 11
    .line 12
    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    .line 13
    .line 14
    .line 15
    move-result p1

    .line 16
    aget p0, p0, p1

    .line 17
    .line 18
    const/4 p1, 0x1

    .line 19
    if-eq p0, p1, :cond_2

    .line 20
    .line 21
    const/4 p1, 0x2

    .line 22
    if-ne p0, p1, :cond_1

    .line 23
    .line 24
    const p0, 0x7fffffff

    .line 25
    .line 26
    .line 27
    return p0

    .line 28
    :cond_1
    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    .line 29
    .line 30
    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    .line 31
    .line 32
    .line 33
    throw p0

    .line 34
    :cond_2
    const/high16 p0, -0x80000000

    .line 35
    .line 36
    return p0
.end method


# virtual methods
.method public abstract e(Ljava/lang/String;Ljava/util/List;)Ljava/util/List;
.end method
