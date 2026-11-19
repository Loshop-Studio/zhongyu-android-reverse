.class public abstract Lh3/b0;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static synthetic a(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lcoil3/compose/AsyncImagePainter$c;)Lkotlin/Unit;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lh3/b0;->f(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lcoil3/compose/AsyncImagePainter$c;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static final b(Ljava/lang/String;)Lh3/c0;
    .locals 1

    .line 1
    const-string v0, "<this>"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Ljava/lang/String;->hashCode()I

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    sparse-switch v0, :sswitch_data_0

    .line 11
    .line 12
    .line 13
    goto :goto_0

    .line 14
    :sswitch_0
    const-string v0, "Share"

    .line 15
    .line 16
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 17
    .line 18
    .line 19
    move-result p0

    .line 20
    if-nez p0, :cond_0

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_0
    sget-object p0, Lh3/c0$e;->g:Lh3/c0$e;

    .line 24
    .line 25
    return-object p0

    .line 26
    :sswitch_1
    const-string v0, "Recycle"

    .line 27
    .line 28
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 29
    .line 30
    .line 31
    move-result p0

    .line 32
    if-nez p0, :cond_1

    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_1
    sget-object p0, Lh3/c0$c;->g:Lh3/c0$c;

    .line 36
    .line 37
    return-object p0

    .line 38
    :sswitch_2
    const-string v0, "Select"

    .line 39
    .line 40
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 41
    .line 42
    .line 43
    move-result p0

    .line 44
    if-nez p0, :cond_2

    .line 45
    .line 46
    goto :goto_0

    .line 47
    :cond_2
    sget-object p0, Lh3/c0$d;->g:Lh3/c0$d;

    .line 48
    .line 49
    return-object p0

    .line 50
    :sswitch_3
    const-string v0, "Normal"

    .line 51
    .line 52
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 53
    .line 54
    .line 55
    move-result p0

    .line 56
    if-nez p0, :cond_3

    .line 57
    .line 58
    :goto_0
    sget-object p0, Lh3/c0$a;->g:Lh3/c0$a;

    .line 59
    .line 60
    return-object p0

    .line 61
    :cond_3
    sget-object p0, Lh3/c0$b;->g:Lh3/c0$b;

    .line 62
    .line 63
    return-object p0

    .line 64
    nop

    .line 65
    :sswitch_data_0
    .sparse-switch
        -0x749456f9 -> :sswitch_3
        -0x6c9bdee4 -> :sswitch_2
        -0x5c3bf58d -> :sswitch_1
        0x4c25fbf -> :sswitch_0
    .end sparse-switch
.end method

.method public static final c(Lcom/zykj/gallery/bean/GalleryImgBean;)Lh3/d0;
    .locals 8

    .line 1
    const-string v0, "<this>"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance v1, Lh3/d0;

    .line 7
    .line 8
    invoke-virtual {p0}, Lcom/zykj/gallery/bean/GalleryImgBean;->getId()J

    .line 9
    .line 10
    .line 11
    move-result-wide v2

    .line 12
    invoke-virtual {p0}, Lcom/zykj/gallery/bean/GalleryImgBean;->getName()Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object v4

    .line 16
    invoke-virtual {p0}, Lcom/zykj/gallery/bean/GalleryImgBean;->getCreateTime()Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object v5

    .line 20
    invoke-virtual {p0}, Lcom/zykj/gallery/bean/GalleryImgBean;->getSize()Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object v6

    .line 24
    invoke-virtual {p0}, Lcom/zykj/gallery/bean/GalleryImgBean;->getPicture()Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object v7

    .line 28
    invoke-direct/range {v1 .. v7}, Lh3/d0;-><init>(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    return-object v1
.end method

.method public static final d(Lh3/c0;)Ljava/lang/String;
    .locals 1

    .line 1
    const-string v0, "<this>"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Lh3/c0;->a()Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    return-object p0
.end method

.method public static final e(Ljava/lang/String;ILkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)Landroidx/compose/ui/graphics/painter/Painter;
    .locals 11

    .line 1
    move/from16 v1, p5

    .line 2
    .line 3
    const-string v2, "<this>"

    .line 4
    .line 5
    invoke-static {p0, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    const v2, 0x14ef91b6

    .line 9
    .line 10
    .line 11
    invoke-interface {p4, v2}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    .line 12
    .line 13
    .line 14
    and-int/lit8 v3, p6, 0x1

    .line 15
    .line 16
    const/4 v4, 0x0

    .line 17
    if-eqz v3, :cond_0

    .line 18
    .line 19
    move v3, v4

    .line 20
    goto :goto_0

    .line 21
    :cond_0
    move v3, p1

    .line 22
    :goto_0
    and-int/lit8 v6, p6, 0x2

    .line 23
    .line 24
    const/4 v7, 0x0

    .line 25
    if-eqz v6, :cond_1

    .line 26
    .line 27
    move-object v6, v7

    .line 28
    goto :goto_1

    .line 29
    :cond_1
    move-object v6, p2

    .line 30
    :goto_1
    and-int/lit8 v8, p6, 0x4

    .line 31
    .line 32
    if-eqz v8, :cond_2

    .line 33
    .line 34
    move-object v8, v7

    .line 35
    goto :goto_2

    .line 36
    :cond_2
    move-object v8, p3

    .line 37
    :goto_2
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 38
    .line 39
    .line 40
    move-result v9

    .line 41
    if-eqz v9, :cond_3

    .line 42
    .line 43
    const/4 v9, -0x1

    .line 44
    const-string v10, "com.zykj.gallery.ui.gallery.detail.painterWithDeletedFallback (Ext.kt:90)"

    .line 45
    .line 46
    invoke-static {v2, v1, v9, v10}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 47
    .line 48
    .line 49
    :cond_3
    const-string v2, "deleted."

    .line 50
    .line 51
    const/4 v9, 0x2

    .line 52
    invoke-static {p0, v2, v4, v9, v7}, Lkotlin/text/StringsKt;->contains$default(Ljava/lang/CharSequence;Ljava/lang/CharSequence;ZILjava/lang/Object;)Z

    .line 53
    .line 54
    .line 55
    move-result v2

    .line 56
    if-eqz v2, :cond_5

    .line 57
    .line 58
    const v0, 0x52f07ac8

    .line 59
    .line 60
    .line 61
    invoke-interface {p4, v0}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    .line 62
    .line 63
    .line 64
    sget v0, Lcom/zykj/gallery/R$drawable;->error_holder:I

    .line 65
    .line 66
    invoke-static {v0, p4, v4}, Landroidx/compose/ui/res/PainterResources_androidKt;->painterResource(ILandroidx/compose/runtime/Composer;I)Landroidx/compose/ui/graphics/painter/Painter;

    .line 67
    .line 68
    .line 69
    move-result-object v0

    .line 70
    invoke-interface {p4}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    .line 71
    .line 72
    .line 73
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 74
    .line 75
    .line 76
    move-result v1

    .line 77
    if-eqz v1, :cond_4

    .line 78
    .line 79
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 80
    .line 81
    .line 82
    :cond_4
    invoke-interface {p4}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    .line 83
    .line 84
    .line 85
    return-object v0

    .line 86
    :cond_5
    const v2, 0x52ce6b8c    # 4.432838E11f

    .line 87
    .line 88
    .line 89
    invoke-interface {p4, v2}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    .line 90
    .line 91
    .line 92
    invoke-interface {p4}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    .line 93
    .line 94
    .line 95
    new-instance v2, Ljava/lang/StringBuilder;

    .line 96
    .line 97
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 98
    .line 99
    .line 100
    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 101
    .line 102
    .line 103
    const-string v0, "?reload_key="

    .line 104
    .line 105
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 106
    .line 107
    .line 108
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 109
    .line 110
    .line 111
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 112
    .line 113
    .line 114
    move-result-object v0

    .line 115
    new-instance v2, Ly/e$a;

    .line 116
    .line 117
    invoke-static {}, Landroidx/compose/ui/platform/AndroidCompositionLocals_androidKt;->getLocalContext()Landroidx/compose/runtime/ProvidableCompositionLocal;

    .line 118
    .line 119
    .line 120
    move-result-object v3

    .line 121
    invoke-interface {p4, v3}, Landroidx/compose/runtime/Composer;->consume(Landroidx/compose/runtime/CompositionLocal;)Ljava/lang/Object;

    .line 122
    .line 123
    .line 124
    move-result-object v3

    .line 125
    check-cast v3, Landroid/content/Context;

    .line 126
    .line 127
    invoke-direct {v2, v3}, Ly/e$a;-><init>(Landroid/content/Context;)V

    .line 128
    .line 129
    .line 130
    invoke-virtual {v2, v0}, Ly/e$a;->c(Ljava/lang/Object;)Ly/e$a;

    .line 131
    .line 132
    .line 133
    move-result-object v0

    .line 134
    sget v2, Lcom/zykj/gallery/R$drawable;->galler_icon_normal:I

    .line 135
    .line 136
    invoke-static {v0, v2}, Ly/i;->p(Ly/e$a;I)Ly/e$a;

    .line 137
    .line 138
    .line 139
    move-result-object v0

    .line 140
    invoke-static {v0, v2}, Ly/i;->c(Ly/e$a;I)Ly/e$a;

    .line 141
    .line 142
    .line 143
    move-result-object v0

    .line 144
    invoke-virtual {v0}, Ly/e$a;->a()Ly/e;

    .line 145
    .line 146
    .line 147
    move-result-object v0

    .line 148
    and-int/lit16 v2, v1, 0x380

    .line 149
    .line 150
    xor-int/lit16 v2, v2, 0x180

    .line 151
    .line 152
    const/16 v3, 0x100

    .line 153
    .line 154
    const/4 v7, 0x1

    .line 155
    if-le v2, v3, :cond_6

    .line 156
    .line 157
    invoke-interface {p4, v6}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 158
    .line 159
    .line 160
    move-result v2

    .line 161
    if-nez v2, :cond_7

    .line 162
    .line 163
    :cond_6
    and-int/lit16 v2, v1, 0x180

    .line 164
    .line 165
    if-ne v2, v3, :cond_8

    .line 166
    .line 167
    :cond_7
    move v2, v7

    .line 168
    goto :goto_3

    .line 169
    :cond_8
    move v2, v4

    .line 170
    :goto_3
    and-int/lit16 v3, v1, 0x1c00

    .line 171
    .line 172
    xor-int/lit16 v3, v3, 0xc00

    .line 173
    .line 174
    const/16 v9, 0x800

    .line 175
    .line 176
    if-le v3, v9, :cond_9

    .line 177
    .line 178
    invoke-interface {p4, v8}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 179
    .line 180
    .line 181
    move-result v3

    .line 182
    if-nez v3, :cond_a

    .line 183
    .line 184
    :cond_9
    and-int/lit16 v1, v1, 0xc00

    .line 185
    .line 186
    if-ne v1, v9, :cond_b

    .line 187
    .line 188
    :cond_a
    move v4, v7

    .line 189
    :cond_b
    or-int v1, v2, v4

    .line 190
    .line 191
    invoke-interface {p4}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 192
    .line 193
    .line 194
    move-result-object v2

    .line 195
    if-nez v1, :cond_c

    .line 196
    .line 197
    sget-object v1, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    .line 198
    .line 199
    invoke-virtual {v1}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    .line 200
    .line 201
    .line 202
    move-result-object v1

    .line 203
    if-ne v2, v1, :cond_d

    .line 204
    .line 205
    :cond_c
    new-instance v2, Lh3/a0;

    .line 206
    .line 207
    invoke-direct {v2, v6, v8}, Lh3/a0;-><init>(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V

    .line 208
    .line 209
    .line 210
    invoke-interface {p4, v2}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 211
    .line 212
    .line 213
    :cond_d
    check-cast v2, Lkotlin/jvm/functions/Function1;

    .line 214
    .line 215
    const/4 v6, 0x0

    .line 216
    const/16 v7, 0x1a

    .line 217
    .line 218
    const/4 v1, 0x0

    .line 219
    const/4 v3, 0x0

    .line 220
    const/4 v4, 0x0

    .line 221
    move-object v5, p4

    .line 222
    invoke-static/range {v0 .. v7}, Lcoil3/compose/c;->a(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/layout/ContentScale;ILandroidx/compose/runtime/Composer;II)Lcoil3/compose/AsyncImagePainter;

    .line 223
    .line 224
    .line 225
    move-result-object v0

    .line 226
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 227
    .line 228
    .line 229
    move-result v1

    .line 230
    if-eqz v1, :cond_e

    .line 231
    .line 232
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 233
    .line 234
    .line 235
    :cond_e
    invoke-interface {p4}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    .line 236
    .line 237
    .line 238
    return-object v0
.end method

.method public static final f(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lcoil3/compose/AsyncImagePainter$c;)Lkotlin/Unit;
    .locals 1

    .line 1
    const-string v0, "state"

    .line 2
    .line 3
    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    instance-of v0, p2, Lcoil3/compose/AsyncImagePainter$c$d;

    .line 7
    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    if-eqz p0, :cond_1

    .line 11
    .line 12
    invoke-interface {p0}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    instance-of p0, p2, Lcoil3/compose/AsyncImagePainter$c$b;

    .line 17
    .line 18
    if-eqz p0, :cond_1

    .line 19
    .line 20
    if-eqz p1, :cond_1

    .line 21
    .line 22
    invoke-interface {p1}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    :cond_1
    :goto_0
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 26
    .line 27
    return-object p0
.end method
