.class public abstract Lcoil3/compose/o;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(Ljava/lang/String;Landroidx/compose/runtime/Composer;I)Lcoil3/compose/AsyncImagePainter;
    .locals 8

    .line 1
    sget-object v0, Lcoil3/compose/AsyncImagePainter;->q:Landroidx/navigation/a;

    .line 2
    .line 3
    sget-object v1, Landroidx/compose/ui/layout/ContentScale;->Companion:Landroidx/compose/ui/layout/ContentScale$Companion;

    .line 4
    .line 5
    invoke-virtual {v1}, Landroidx/compose/ui/layout/ContentScale$Companion;->getFit()Landroidx/compose/ui/layout/ContentScale;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    sget-object v2, Landroidx/compose/ui/graphics/drawscope/DrawScope;->Companion:Landroidx/compose/ui/graphics/drawscope/DrawScope$Companion;

    .line 10
    .line 11
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/drawscope/DrawScope$Companion;->getDefaultFilterQuality-f-v9h1I()I

    .line 12
    .line 13
    .line 14
    move-result v2

    .line 15
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 16
    .line 17
    .line 18
    move-result v3

    .line 19
    const/4 v4, -0x1

    .line 20
    if-eqz v3, :cond_0

    .line 21
    .line 22
    const v3, -0x4125e770

    .line 23
    .line 24
    .line 25
    const-string v5, "coil3.compose.rememberAsyncImagePainter (SingletonAsyncImagePainter.kt:76)"

    .line 26
    .line 27
    invoke-static {v3, p2, v4, v5}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 28
    .line 29
    .line 30
    :cond_0
    invoke-static {}, Landroidx/compose/ui/platform/AndroidCompositionLocals_androidKt;->getLocalContext()Landroidx/compose/runtime/ProvidableCompositionLocal;

    .line 31
    .line 32
    .line 33
    move-result-object v3

    .line 34
    invoke-interface {p1, v3}, Landroidx/compose/runtime/Composer;->consume(Landroidx/compose/runtime/CompositionLocal;)Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object v3

    .line 38
    check-cast v3, Landroid/content/Context;

    .line 39
    .line 40
    invoke-static {v3}, Lcoil3/u;->a(Landroid/content/Context;)Lcoil3/n;

    .line 41
    .line 42
    .line 43
    move-result-object v3

    .line 44
    and-int/lit8 v5, p2, 0xe

    .line 45
    .line 46
    shl-int/lit8 p2, p2, 0x3

    .line 47
    .line 48
    and-int/lit16 v6, p2, 0x380

    .line 49
    .line 50
    or-int/2addr v5, v6

    .line 51
    and-int/lit16 v6, p2, 0x1c00

    .line 52
    .line 53
    or-int/2addr v5, v6

    .line 54
    const v6, 0xe000

    .line 55
    .line 56
    .line 57
    and-int/2addr v6, p2

    .line 58
    or-int/2addr v5, v6

    .line 59
    const/high16 v6, 0x70000

    .line 60
    .line 61
    and-int/2addr p2, v6

    .line 62
    or-int/2addr p2, v5

    .line 63
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 64
    .line 65
    .line 66
    move-result v5

    .line 67
    if-eqz v5, :cond_1

    .line 68
    .line 69
    const v5, 0x3f8b48af

    .line 70
    .line 71
    .line 72
    const-string v6, "coil3.compose.rememberAsyncImagePainter (AsyncImagePainter.kt:113)"

    .line 73
    .line 74
    invoke-static {v5, p2, v4, v6}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 75
    .line 76
    .line 77
    :cond_1
    sget-object v5, Lcoil3/compose/m;->a:Landroidx/compose/runtime/ProvidableCompositionLocal;

    .line 78
    .line 79
    invoke-interface {p1, v5}, Landroidx/compose/runtime/Composer;->consume(Landroidx/compose/runtime/CompositionLocal;)Ljava/lang/Object;

    .line 80
    .line 81
    .line 82
    move-result-object v5

    .line 83
    check-cast v5, Lcoil3/compose/c;

    .line 84
    .line 85
    shr-int/lit8 p2, p2, 0x3

    .line 86
    .line 87
    const v6, 0xfff0

    .line 88
    .line 89
    .line 90
    and-int/2addr p2, v6

    .line 91
    const v6, -0x4a168af5

    .line 92
    .line 93
    .line 94
    invoke-interface {p1, v6}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    .line 95
    .line 96
    .line 97
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 98
    .line 99
    .line 100
    move-result v7

    .line 101
    if-eqz v7, :cond_2

    .line 102
    .line 103
    const-string v7, "coil3.compose.rememberAsyncImagePainter (AsyncImagePainter.kt:128)"

    .line 104
    .line 105
    invoke-static {v6, p2, v4, v7}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 106
    .line 107
    .line 108
    :cond_2
    const-string p2, "rememberAsyncImagePainter"

    .line 109
    .line 110
    invoke-static {p2}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    .line 111
    .line 112
    .line 113
    :try_start_0
    invoke-static {p1, p0}, Lm/e;->c(Landroidx/compose/runtime/Composer;Ljava/lang/Object;)Ls/f;

    .line 114
    .line 115
    .line 116
    move-result-object p0

    .line 117
    invoke-static {p0}, Lm/e;->f(Ls/f;)V

    .line 118
    .line 119
    .line 120
    new-instance p2, Lcoil3/compose/d;

    .line 121
    .line 122
    invoke-direct {p2, v3, p0, v5}, Lcoil3/compose/d;-><init>(Lcoil3/n;Ls/f;Lcoil3/compose/c;)V

    .line 123
    .line 124
    .line 125
    invoke-interface {p1}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 126
    .line 127
    .line 128
    move-result-object p0

    .line 129
    sget-object v3, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    .line 130
    .line 131
    invoke-virtual {v3}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    .line 132
    .line 133
    .line 134
    move-result-object v4

    .line 135
    if-ne p0, v4, :cond_3

    .line 136
    .line 137
    new-instance p0, Lcoil3/compose/AsyncImagePainter;

    .line 138
    .line 139
    invoke-direct {p0, p2}, Lcoil3/compose/AsyncImagePainter;-><init>(Lcoil3/compose/d;)V

    .line 140
    .line 141
    .line 142
    invoke-interface {p1, p0}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 143
    .line 144
    .line 145
    :cond_3
    check-cast p0, Lcoil3/compose/AsyncImagePainter;

    .line 146
    .line 147
    invoke-interface {p1}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 148
    .line 149
    .line 150
    move-result-object v4

    .line 151
    invoke-virtual {v3}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    .line 152
    .line 153
    .line 154
    move-result-object v3

    .line 155
    if-ne v4, v3, :cond_4

    .line 156
    .line 157
    sget-object v3, Lkotlin/coroutines/EmptyCoroutineContext;->INSTANCE:Lkotlin/coroutines/EmptyCoroutineContext;

    .line 158
    .line 159
    invoke-static {v3, p1}, Landroidx/compose/runtime/EffectsKt;->createCompositionCoroutineScope(Lh6/h;Landroidx/compose/runtime/Composer;)Lkotlinx/coroutines/v;

    .line 160
    .line 161
    .line 162
    move-result-object v4

    .line 163
    invoke-interface {p1, v4}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 164
    .line 165
    .line 166
    :cond_4
    check-cast v4, Lkotlinx/coroutines/v;

    .line 167
    .line 168
    iput-object v4, p0, Lcoil3/compose/AsyncImagePainter;->g:Lkotlinx/coroutines/v;

    .line 169
    .line 170
    iput-object v0, p0, Lcoil3/compose/AsyncImagePainter;->h:Lr6/c;

    .line 171
    .line 172
    const/4 v0, 0x0

    .line 173
    iput-object v0, p0, Lcoil3/compose/AsyncImagePainter;->i:Lr6/c;

    .line 174
    .line 175
    iput-object v1, p0, Lcoil3/compose/AsyncImagePainter;->j:Landroidx/compose/ui/layout/ContentScale;

    .line 176
    .line 177
    iput v2, p0, Lcoil3/compose/AsyncImagePainter;->k:I

    .line 178
    .line 179
    invoke-static {p1}, Lm/e;->a(Landroidx/compose/runtime/Composer;)Lcoil3/compose/j;

    .line 180
    .line 181
    .line 182
    move-result-object v0

    .line 183
    iput-object v0, p0, Lcoil3/compose/AsyncImagePainter;->l:Lcoil3/compose/j;

    .line 184
    .line 185
    invoke-virtual {p0, p2}, Lcoil3/compose/AsyncImagePainter;->d(Lcoil3/compose/d;)V

    .line 186
    .line 187
    .line 188
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 189
    .line 190
    .line 191
    move-result p2

    .line 192
    if-eqz p2, :cond_5

    .line 193
    .line 194
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 195
    .line 196
    .line 197
    :cond_5
    invoke-interface {p1}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 198
    .line 199
    .line 200
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 201
    .line 202
    .line 203
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 204
    .line 205
    .line 206
    move-result p1

    .line 207
    if-eqz p1, :cond_6

    .line 208
    .line 209
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 210
    .line 211
    .line 212
    :cond_6
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 213
    .line 214
    .line 215
    move-result p1

    .line 216
    if-eqz p1, :cond_7

    .line 217
    .line 218
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 219
    .line 220
    .line 221
    :cond_7
    return-object p0

    .line 222
    :catchall_0
    move-exception p0

    .line 223
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 224
    .line 225
    .line 226
    throw p0
.end method
