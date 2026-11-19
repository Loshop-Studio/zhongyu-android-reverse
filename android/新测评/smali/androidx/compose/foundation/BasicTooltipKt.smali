.class public final Landroidx/compose/foundation/BasicTooltipKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000D\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0010\u000e\n\u0002\u0008\u0003\u001aa\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0011\u0010\u0004\u001a\r\u0012\u0004\u0012\u00020\u00010\u0005\u00a2\u0006\u0002\u0008\u00062\u0006\u0010\u0007\u001a\u00020\u00082\u0008\u0008\u0002\u0010\t\u001a\u00020\n2\u0008\u0008\u0002\u0010\u000b\u001a\u00020\u000c2\u0008\u0008\u0002\u0010\r\u001a\u00020\u000c2\u0011\u0010\u000e\u001a\r\u0012\u0004\u0012\u00020\u00010\u0005\u00a2\u0006\u0002\u0008\u0006H\u0007\u00a2\u0006\u0002\u0010\u000f\u001a&\u0010\u0010\u001a\u00020\u00082\u0008\u0008\u0002\u0010\u0011\u001a\u00020\u000c2\u0008\u0008\u0002\u0010\u0012\u001a\u00020\u000c2\u0008\u0008\u0002\u0010\u0013\u001a\u00020\u0014H\u0007\u001a@\u0010\u0015\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u00082\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u000b\u001a\u00020\u000c2\u0011\u0010\u000e\u001a\r\u0012\u0004\u0012\u00020\u00010\u0005\u00a2\u0006\u0002\u0008\u0006H\u0003\u00a2\u0006\u0002\u0010\u0018\u001a:\u0010\u0019\u001a\u00020\u00012\u0006\u0010\r\u001a\u00020\u000c2\u0006\u0010\u0007\u001a\u00020\u00082\u0008\u0008\u0002\u0010\t\u001a\u00020\n2\u0011\u0010\u000e\u001a\r\u0012\u0004\u0012\u00020\u00010\u0005\u00a2\u0006\u0002\u0008\u0006H\u0003\u00a2\u0006\u0002\u0010\u001a\u001a+\u0010\u001b\u001a\u00020\u00082\u0008\u0008\u0002\u0010\u0011\u001a\u00020\u000c2\u0008\u0008\u0002\u0010\u0012\u001a\u00020\u000c2\u0008\u0008\u0002\u0010\u0013\u001a\u00020\u0014H\u0007\u00a2\u0006\u0002\u0010\u001c\u001a,\u0010\u001d\u001a\u00020\n*\u00020\n2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u000c2\u0006\u0010\u0007\u001a\u00020\u00082\u0006\u0010\u0016\u001a\u00020\u0017H\u0002\u001a\u001c\u0010!\u001a\u00020\n*\u00020\n2\u0006\u0010 \u001a\u00020\u000c2\u0006\u0010\u0007\u001a\u00020\u0008H\u0002\u00a8\u0006\""
    }
    d2 = {
        "BasicTooltipBox",
        "",
        "positionProvider",
        "Landroidx/compose/ui/window/PopupPositionProvider;",
        "tooltip",
        "Lkotlin/Function0;",
        "Landroidx/compose/runtime/Composable;",
        "state",
        "Landroidx/compose/foundation/BasicTooltipState;",
        "modifier",
        "Landroidx/compose/ui/Modifier;",
        "focusable",
        "",
        "enableUserInput",
        "content",
        "(Landroidx/compose/ui/window/PopupPositionProvider;Lkotlin/jvm/functions/Function2;Landroidx/compose/foundation/BasicTooltipState;Landroidx/compose/ui/Modifier;ZZLkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V",
        "BasicTooltipState",
        "initialIsVisible",
        "isPersistent",
        "mutatorMutex",
        "Landroidx/compose/foundation/MutatorMutex;",
        "TooltipPopup",
        "scope",
        "Lkotlinx/coroutines/CoroutineScope;",
        "(Landroidx/compose/ui/window/PopupPositionProvider;Landroidx/compose/foundation/BasicTooltipState;Lkotlinx/coroutines/CoroutineScope;ZLkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V",
        "WrappedAnchor",
        "(ZLandroidx/compose/foundation/BasicTooltipState;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V",
        "rememberBasicTooltipState",
        "(ZZLandroidx/compose/foundation/MutatorMutex;Landroidx/compose/runtime/Composer;II)Landroidx/compose/foundation/BasicTooltipState;",
        "anchorSemantics",
        "label",
        "",
        "enabled",
        "handleGestures",
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
        "SMAP\nBasicTooltip.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BasicTooltip.kt\nandroidx/compose/foundation/BasicTooltipKt\n+ 2 Effects.kt\nandroidx/compose/runtime/EffectsKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 Effects.kt\nandroidx/compose/runtime/EffectsKt$rememberCoroutineScope$1\n+ 5 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 6 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 7 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 8 Composer.kt\nandroidx/compose/runtime/Updater\n*L\n1#1,390:1\n557#2:391\n554#2,6:392\n557#2:453\n554#2,6:454\n1247#3,3:398\n1250#3,3:402\n1247#3,6:447\n1247#3,3:460\n1250#3,3:464\n1247#3,6:508\n1247#3,6:514\n555#4:401\n555#4:463\n70#5:405\n66#5,10:406\n77#5:446\n70#5:467\n67#5,9:468\n77#5:507\n79#6,6:416\n86#6,3:431\n89#6,2:440\n93#6:445\n79#6,6:477\n86#6,3:492\n89#6,2:501\n93#6:506\n347#7,9:422\n356#7,3:442\n347#7,9:483\n356#7,3:503\n4206#8,6:434\n4206#8,6:495\n*S KotlinDebug\n*F\n+ 1 BasicTooltip.kt\nandroidx/compose/foundation/BasicTooltipKt\n*L\n83#1:391\n83#1:392,6\n114#1:453\n114#1:454,6\n83#1:398,3\n83#1:402,3\n103#1:447,6\n114#1:460,3\n114#1:464,3\n138#1:508,6\n246#1:514,6\n83#1:401\n114#1:463\n84#1:405\n84#1:406,10\n84#1:446\n116#1:467\n116#1:468,9\n116#1:507\n84#1:416,6\n84#1:431,3\n84#1:440,2\n84#1:445\n116#1:477,6\n116#1:492,3\n116#1:501,2\n116#1:506\n84#1:422,9\n84#1:442,3\n116#1:483,9\n116#1:503,3\n84#1:434,6\n116#1:495,6\n*E\n"
    }
.end annotation


# direct methods
.method public static final BasicTooltipBox(Landroidx/compose/ui/window/PopupPositionProvider;Lkotlin/jvm/functions/Function2;Landroidx/compose/foundation/BasicTooltipState;Landroidx/compose/ui/Modifier;ZZLkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V
    .locals 20
    .annotation build Landroidx/compose/foundation/ExperimentalFoundationApi;
    .end annotation

    .annotation build Landroidx/compose/runtime/Composable;
    .end annotation

    .annotation build Landroidx/compose/runtime/ComposableInferredTarget;
        scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/ui/window/PopupPositionProvider;",
            "Lkotlin/jvm/functions/Function2<",
            "-",
            "Landroidx/compose/runtime/Composer;",
            "-",
            "Ljava/lang/Integer;",
            "Lkotlin/Unit;",
            ">;",
            "Landroidx/compose/foundation/BasicTooltipState;",
            "Landroidx/compose/ui/Modifier;",
            "ZZ",
            "Lkotlin/jvm/functions/Function2<",
            "-",
            "Landroidx/compose/runtime/Composer;",
            "-",
            "Ljava/lang/Integer;",
            "Lkotlin/Unit;",
            ">;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    .line 1
    move-object/from16 v1, p2

    .line 2
    .line 3
    move/from16 v8, p8

    .line 4
    .line 5
    const v0, 0x6dc2ba54

    .line 6
    .line 7
    .line 8
    move-object/from16 v2, p7

    .line 9
    .line 10
    invoke-interface {v2, v0}, Landroidx/compose/runtime/Composer;->startRestartGroup(I)Landroidx/compose/runtime/Composer;

    .line 11
    .line 12
    .line 13
    move-result-object v4

    .line 14
    and-int/lit8 v2, p9, 0x1

    .line 15
    .line 16
    if-eqz v2, :cond_0

    .line 17
    .line 18
    or-int/lit8 v2, v8, 0x6

    .line 19
    .line 20
    move v3, v2

    .line 21
    move-object/from16 v2, p0

    .line 22
    .line 23
    goto :goto_1

    .line 24
    :cond_0
    and-int/lit8 v2, v8, 0x6

    .line 25
    .line 26
    if-nez v2, :cond_2

    .line 27
    .line 28
    move-object/from16 v2, p0

    .line 29
    .line 30
    invoke-interface {v4, v2}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 31
    .line 32
    .line 33
    move-result v3

    .line 34
    if-eqz v3, :cond_1

    .line 35
    .line 36
    const/4 v3, 0x4

    .line 37
    goto :goto_0

    .line 38
    :cond_1
    const/4 v3, 0x2

    .line 39
    :goto_0
    or-int/2addr v3, v8

    .line 40
    goto :goto_1

    .line 41
    :cond_2
    move-object/from16 v2, p0

    .line 42
    .line 43
    move v3, v8

    .line 44
    :goto_1
    and-int/lit8 v5, p9, 0x2

    .line 45
    .line 46
    if-eqz v5, :cond_4

    .line 47
    .line 48
    or-int/lit8 v3, v3, 0x30

    .line 49
    .line 50
    :cond_3
    move-object/from16 v5, p1

    .line 51
    .line 52
    goto :goto_3

    .line 53
    :cond_4
    and-int/lit8 v5, v8, 0x30

    .line 54
    .line 55
    if-nez v5, :cond_3

    .line 56
    .line 57
    move-object/from16 v5, p1

    .line 58
    .line 59
    invoke-interface {v4, v5}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 60
    .line 61
    .line 62
    move-result v6

    .line 63
    if-eqz v6, :cond_5

    .line 64
    .line 65
    const/16 v6, 0x20

    .line 66
    .line 67
    goto :goto_2

    .line 68
    :cond_5
    const/16 v6, 0x10

    .line 69
    .line 70
    :goto_2
    or-int/2addr v3, v6

    .line 71
    :goto_3
    and-int/lit8 v6, p9, 0x4

    .line 72
    .line 73
    if-eqz v6, :cond_6

    .line 74
    .line 75
    or-int/lit16 v3, v3, 0x180

    .line 76
    .line 77
    goto :goto_5

    .line 78
    :cond_6
    and-int/lit16 v6, v8, 0x180

    .line 79
    .line 80
    if-nez v6, :cond_8

    .line 81
    .line 82
    invoke-interface {v4, v1}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 83
    .line 84
    .line 85
    move-result v6

    .line 86
    if-eqz v6, :cond_7

    .line 87
    .line 88
    const/16 v6, 0x100

    .line 89
    .line 90
    goto :goto_4

    .line 91
    :cond_7
    const/16 v6, 0x80

    .line 92
    .line 93
    :goto_4
    or-int/2addr v3, v6

    .line 94
    :cond_8
    :goto_5
    and-int/lit8 v6, p9, 0x8

    .line 95
    .line 96
    if-eqz v6, :cond_a

    .line 97
    .line 98
    or-int/lit16 v3, v3, 0xc00

    .line 99
    .line 100
    :cond_9
    move-object/from16 v9, p3

    .line 101
    .line 102
    goto :goto_7

    .line 103
    :cond_a
    and-int/lit16 v9, v8, 0xc00

    .line 104
    .line 105
    if-nez v9, :cond_9

    .line 106
    .line 107
    move-object/from16 v9, p3

    .line 108
    .line 109
    invoke-interface {v4, v9}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 110
    .line 111
    .line 112
    move-result v10

    .line 113
    if-eqz v10, :cond_b

    .line 114
    .line 115
    const/16 v10, 0x800

    .line 116
    .line 117
    goto :goto_6

    .line 118
    :cond_b
    const/16 v10, 0x400

    .line 119
    .line 120
    :goto_6
    or-int/2addr v3, v10

    .line 121
    :goto_7
    and-int/lit8 v10, p9, 0x10

    .line 122
    .line 123
    if-eqz v10, :cond_d

    .line 124
    .line 125
    or-int/lit16 v3, v3, 0x6000

    .line 126
    .line 127
    :cond_c
    move/from16 v11, p4

    .line 128
    .line 129
    goto :goto_9

    .line 130
    :cond_d
    and-int/lit16 v11, v8, 0x6000

    .line 131
    .line 132
    if-nez v11, :cond_c

    .line 133
    .line 134
    move/from16 v11, p4

    .line 135
    .line 136
    invoke-interface {v4, v11}, Landroidx/compose/runtime/Composer;->changed(Z)Z

    .line 137
    .line 138
    .line 139
    move-result v12

    .line 140
    if-eqz v12, :cond_e

    .line 141
    .line 142
    const/16 v12, 0x4000

    .line 143
    .line 144
    goto :goto_8

    .line 145
    :cond_e
    const/16 v12, 0x2000

    .line 146
    .line 147
    :goto_8
    or-int/2addr v3, v12

    .line 148
    :goto_9
    and-int/lit8 v12, p9, 0x20

    .line 149
    .line 150
    const/high16 v13, 0x30000

    .line 151
    .line 152
    if-eqz v12, :cond_10

    .line 153
    .line 154
    or-int/2addr v3, v13

    .line 155
    :cond_f
    move/from16 v13, p5

    .line 156
    .line 157
    goto :goto_b

    .line 158
    :cond_10
    and-int/2addr v13, v8

    .line 159
    if-nez v13, :cond_f

    .line 160
    .line 161
    move/from16 v13, p5

    .line 162
    .line 163
    invoke-interface {v4, v13}, Landroidx/compose/runtime/Composer;->changed(Z)Z

    .line 164
    .line 165
    .line 166
    move-result v14

    .line 167
    if-eqz v14, :cond_11

    .line 168
    .line 169
    const/high16 v14, 0x20000

    .line 170
    .line 171
    goto :goto_a

    .line 172
    :cond_11
    const/high16 v14, 0x10000

    .line 173
    .line 174
    :goto_a
    or-int/2addr v3, v14

    .line 175
    :goto_b
    and-int/lit8 v14, p9, 0x40

    .line 176
    .line 177
    const/high16 v15, 0x180000

    .line 178
    .line 179
    if-eqz v14, :cond_13

    .line 180
    .line 181
    or-int/2addr v3, v15

    .line 182
    :cond_12
    move-object/from16 v14, p6

    .line 183
    .line 184
    :goto_c
    move v15, v3

    .line 185
    goto :goto_e

    .line 186
    :cond_13
    and-int v14, v8, v15

    .line 187
    .line 188
    if-nez v14, :cond_12

    .line 189
    .line 190
    move-object/from16 v14, p6

    .line 191
    .line 192
    invoke-interface {v4, v14}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 193
    .line 194
    .line 195
    move-result v15

    .line 196
    if-eqz v15, :cond_14

    .line 197
    .line 198
    const/high16 v15, 0x100000

    .line 199
    .line 200
    goto :goto_d

    .line 201
    :cond_14
    const/high16 v15, 0x80000

    .line 202
    .line 203
    :goto_d
    or-int/2addr v3, v15

    .line 204
    goto :goto_c

    .line 205
    :goto_e
    const v3, 0x92493

    .line 206
    .line 207
    .line 208
    and-int/2addr v3, v15

    .line 209
    const v7, 0x92492

    .line 210
    .line 211
    .line 212
    const/4 v0, 0x0

    .line 213
    const/16 v17, 0x1

    .line 214
    .line 215
    if-eq v3, v7, :cond_15

    .line 216
    .line 217
    move/from16 v3, v17

    .line 218
    .line 219
    goto :goto_f

    .line 220
    :cond_15
    move v3, v0

    .line 221
    :goto_f
    and-int/lit8 v7, v15, 0x1

    .line 222
    .line 223
    invoke-interface {v4, v3, v7}, Landroidx/compose/runtime/Composer;->shouldExecute(ZI)Z

    .line 224
    .line 225
    .line 226
    move-result v3

    .line 227
    if-eqz v3, :cond_24

    .line 228
    .line 229
    if-eqz v6, :cond_16

    .line 230
    .line 231
    sget-object v3, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    .line 232
    .line 233
    move-object v9, v3

    .line 234
    :cond_16
    if-eqz v10, :cond_17

    .line 235
    .line 236
    move/from16 v3, v17

    .line 237
    .line 238
    goto :goto_10

    .line 239
    :cond_17
    move v3, v11

    .line 240
    :goto_10
    if-eqz v12, :cond_18

    .line 241
    .line 242
    move/from16 v13, v17

    .line 243
    .line 244
    :cond_18
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 245
    .line 246
    .line 247
    move-result v6

    .line 248
    if-eqz v6, :cond_19

    .line 249
    .line 250
    const/4 v6, -0x1

    .line 251
    const-string v7, "androidx.compose.foundation.BasicTooltipBox (BasicTooltip.kt:81)"

    .line 252
    .line 253
    const v10, 0x6dc2ba54

    .line 254
    .line 255
    .line 256
    invoke-static {v10, v15, v6, v7}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 257
    .line 258
    .line 259
    :cond_19
    invoke-interface {v4}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 260
    .line 261
    .line 262
    move-result-object v6

    .line 263
    sget-object v7, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    .line 264
    .line 265
    invoke-virtual {v7}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    .line 266
    .line 267
    .line 268
    move-result-object v10

    .line 269
    if-ne v6, v10, :cond_1a

    .line 270
    .line 271
    sget-object v6, Lkotlin/coroutines/EmptyCoroutineContext;->INSTANCE:Lkotlin/coroutines/EmptyCoroutineContext;

    .line 272
    .line 273
    invoke-static {v6, v4}, Landroidx/compose/runtime/EffectsKt;->createCompositionCoroutineScope(Lkotlin/coroutines/CoroutineContext;Landroidx/compose/runtime/Composer;)Lkotlinx/coroutines/CoroutineScope;

    .line 274
    .line 275
    .line 276
    move-result-object v6

    .line 277
    invoke-interface {v4, v6}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 278
    .line 279
    .line 280
    :cond_1a
    check-cast v6, Lkotlinx/coroutines/CoroutineScope;

    .line 281
    .line 282
    sget-object v10, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    .line 283
    .line 284
    sget-object v11, Landroidx/compose/ui/Alignment;->Companion:Landroidx/compose/ui/Alignment$Companion;

    .line 285
    .line 286
    invoke-virtual {v11}, Landroidx/compose/ui/Alignment$Companion;->getTopStart()Landroidx/compose/ui/Alignment;

    .line 287
    .line 288
    .line 289
    move-result-object v11

    .line 290
    invoke-static {v11, v0}, Landroidx/compose/foundation/layout/BoxKt;->maybeCachedBoxMeasurePolicy(Landroidx/compose/ui/Alignment;Z)Landroidx/compose/ui/layout/MeasurePolicy;

    .line 291
    .line 292
    .line 293
    move-result-object v11

    .line 294
    invoke-static {v4, v0}, Landroidx/compose/runtime/ComposablesKt;->getCurrentCompositeKeyHash(Landroidx/compose/runtime/Composer;I)I

    .line 295
    .line 296
    .line 297
    move-result v12

    .line 298
    invoke-interface {v4}, Landroidx/compose/runtime/Composer;->getCurrentCompositionLocalMap()Landroidx/compose/runtime/CompositionLocalMap;

    .line 299
    .line 300
    .line 301
    move-result-object v0

    .line 302
    invoke-static {v4, v10}, Landroidx/compose/ui/ComposedModifierKt;->materializeModifier(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    .line 303
    .line 304
    .line 305
    move-result-object v10

    .line 306
    sget-object v18, Landroidx/compose/ui/node/ComposeUiNode;->Companion:Landroidx/compose/ui/node/ComposeUiNode$Companion;

    .line 307
    .line 308
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getConstructor()Lkotlin/jvm/functions/Function0;

    .line 309
    .line 310
    .line 311
    move-result-object v1

    .line 312
    invoke-interface {v4}, Landroidx/compose/runtime/Composer;->getApplier()Landroidx/compose/runtime/Applier;

    .line 313
    .line 314
    .line 315
    move-result-object v19

    .line 316
    if-nez v19, :cond_1b

    .line 317
    .line 318
    invoke-static {}, Landroidx/compose/runtime/ComposablesKt;->invalidApplier()V

    .line 319
    .line 320
    .line 321
    :cond_1b
    invoke-interface {v4}, Landroidx/compose/runtime/Composer;->startReusableNode()V

    .line 322
    .line 323
    .line 324
    invoke-interface {v4}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 325
    .line 326
    .line 327
    move-result v19

    .line 328
    if-eqz v19, :cond_1c

    .line 329
    .line 330
    invoke-interface {v4, v1}, Landroidx/compose/runtime/Composer;->createNode(Lkotlin/jvm/functions/Function0;)V

    .line 331
    .line 332
    .line 333
    goto :goto_11

    .line 334
    :cond_1c
    invoke-interface {v4}, Landroidx/compose/runtime/Composer;->useNode()V

    .line 335
    .line 336
    .line 337
    :goto_11
    invoke-static {v4}, Landroidx/compose/runtime/Updater;->constructor-impl(Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;

    .line 338
    .line 339
    .line 340
    move-result-object v1

    .line 341
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetMeasurePolicy()Lkotlin/jvm/functions/Function2;

    .line 342
    .line 343
    .line 344
    move-result-object v2

    .line 345
    invoke-static {v1, v11, v2}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 346
    .line 347
    .line 348
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetResolvedCompositionLocals()Lkotlin/jvm/functions/Function2;

    .line 349
    .line 350
    .line 351
    move-result-object v2

    .line 352
    invoke-static {v1, v0, v2}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 353
    .line 354
    .line 355
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetCompositeKeyHash()Lkotlin/jvm/functions/Function2;

    .line 356
    .line 357
    .line 358
    move-result-object v0

    .line 359
    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 360
    .line 361
    .line 362
    move-result v2

    .line 363
    if-nez v2, :cond_1d

    .line 364
    .line 365
    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 366
    .line 367
    .line 368
    move-result-object v2

    .line 369
    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 370
    .line 371
    .line 372
    move-result-object v11

    .line 373
    invoke-static {v2, v11}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 374
    .line 375
    .line 376
    move-result v2

    .line 377
    if-nez v2, :cond_1e

    .line 378
    .line 379
    :cond_1d
    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 380
    .line 381
    .line 382
    move-result-object v2

    .line 383
    invoke-interface {v1, v2}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 384
    .line 385
    .line 386
    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 387
    .line 388
    .line 389
    move-result-object v2

    .line 390
    invoke-interface {v1, v2, v0}, Landroidx/compose/runtime/Composer;->apply(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 391
    .line 392
    .line 393
    :cond_1e
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetModifier()Lkotlin/jvm/functions/Function2;

    .line 394
    .line 395
    .line 396
    move-result-object v0

    .line 397
    invoke-static {v1, v10, v0}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 398
    .line 399
    .line 400
    sget-object v0, Landroidx/compose/foundation/layout/BoxScopeInstance;->INSTANCE:Landroidx/compose/foundation/layout/BoxScopeInstance;

    .line 401
    .line 402
    invoke-interface/range {p2 .. p2}, Landroidx/compose/foundation/BasicTooltipState;->isVisible()Z

    .line 403
    .line 404
    .line 405
    move-result v0

    .line 406
    if-eqz v0, :cond_1f

    .line 407
    .line 408
    const v0, 0x82c41d8

    .line 409
    .line 410
    .line 411
    invoke-interface {v4, v0}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    .line 412
    .line 413
    .line 414
    and-int/lit8 v0, v15, 0xe

    .line 415
    .line 416
    shr-int/lit8 v1, v15, 0x3

    .line 417
    .line 418
    and-int/lit8 v2, v1, 0x70

    .line 419
    .line 420
    or-int/2addr v0, v2

    .line 421
    and-int/lit16 v1, v1, 0x1c00

    .line 422
    .line 423
    or-int/2addr v0, v1

    .line 424
    shl-int/lit8 v1, v15, 0x9

    .line 425
    .line 426
    const v2, 0xe000

    .line 427
    .line 428
    .line 429
    and-int/2addr v1, v2

    .line 430
    or-int/2addr v0, v1

    .line 431
    move-object v1, v5

    .line 432
    move-object v5, v4

    .line 433
    move-object v4, v1

    .line 434
    move-object/from16 v1, p2

    .line 435
    .line 436
    move-object v2, v6

    .line 437
    const/16 v16, 0x0

    .line 438
    .line 439
    move v6, v0

    .line 440
    move-object/from16 v0, p0

    .line 441
    .line 442
    invoke-static/range {v0 .. v6}, Landroidx/compose/foundation/BasicTooltipKt;->TooltipPopup(Landroidx/compose/ui/window/PopupPositionProvider;Landroidx/compose/foundation/BasicTooltipState;Lkotlinx/coroutines/CoroutineScope;ZLkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V

    .line 443
    .line 444
    .line 445
    move v11, v3

    .line 446
    move-object v4, v5

    .line 447
    invoke-interface {v4}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    .line 448
    .line 449
    .line 450
    goto :goto_12

    .line 451
    :cond_1f
    move v11, v3

    .line 452
    const/16 v16, 0x0

    .line 453
    .line 454
    const v0, 0x82fc307

    .line 455
    .line 456
    .line 457
    invoke-interface {v4, v0}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    .line 458
    .line 459
    .line 460
    invoke-interface {v4}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    .line 461
    .line 462
    .line 463
    :goto_12
    shr-int/lit8 v0, v15, 0xf

    .line 464
    .line 465
    and-int/lit8 v0, v0, 0xe

    .line 466
    .line 467
    shr-int/lit8 v1, v15, 0x3

    .line 468
    .line 469
    and-int/lit8 v2, v1, 0x70

    .line 470
    .line 471
    or-int/2addr v0, v2

    .line 472
    and-int/lit16 v1, v1, 0x380

    .line 473
    .line 474
    or-int/2addr v0, v1

    .line 475
    shr-int/lit8 v1, v15, 0x9

    .line 476
    .line 477
    and-int/lit16 v1, v1, 0x1c00

    .line 478
    .line 479
    or-int v5, v0, v1

    .line 480
    .line 481
    const/4 v6, 0x0

    .line 482
    move-object/from16 v1, p2

    .line 483
    .line 484
    move-object v2, v9

    .line 485
    move v0, v13

    .line 486
    move-object v3, v14

    .line 487
    invoke-static/range {v0 .. v6}, Landroidx/compose/foundation/BasicTooltipKt;->WrappedAnchor(ZLandroidx/compose/foundation/BasicTooltipState;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V

    .line 488
    .line 489
    .line 490
    invoke-interface {v4}, Landroidx/compose/runtime/Composer;->endNode()V

    .line 491
    .line 492
    .line 493
    and-int/lit16 v3, v15, 0x380

    .line 494
    .line 495
    const/16 v5, 0x100

    .line 496
    .line 497
    if-ne v3, v5, :cond_20

    .line 498
    .line 499
    move/from16 v16, v17

    .line 500
    .line 501
    :cond_20
    invoke-interface {v4}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 502
    .line 503
    .line 504
    move-result-object v3

    .line 505
    if-nez v16, :cond_21

    .line 506
    .line 507
    invoke-virtual {v7}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    .line 508
    .line 509
    .line 510
    move-result-object v5

    .line 511
    if-ne v3, v5, :cond_22

    .line 512
    .line 513
    :cond_21
    new-instance v3, Landroidx/compose/foundation/BasicTooltipKt$BasicTooltipBox$2$1;

    .line 514
    .line 515
    invoke-direct {v3, v1}, Landroidx/compose/foundation/BasicTooltipKt$BasicTooltipBox$2$1;-><init>(Landroidx/compose/foundation/BasicTooltipState;)V

    .line 516
    .line 517
    .line 518
    invoke-interface {v4, v3}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 519
    .line 520
    .line 521
    :cond_22
    check-cast v3, Lkotlin/jvm/functions/Function1;

    .line 522
    .line 523
    shr-int/lit8 v5, v15, 0x6

    .line 524
    .line 525
    and-int/lit8 v5, v5, 0xe

    .line 526
    .line 527
    invoke-static {v1, v3, v4, v5}, Landroidx/compose/runtime/EffectsKt;->DisposableEffect(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    .line 528
    .line 529
    .line 530
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 531
    .line 532
    .line 533
    move-result v3

    .line 534
    if-eqz v3, :cond_23

    .line 535
    .line 536
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 537
    .line 538
    .line 539
    :cond_23
    move v6, v0

    .line 540
    move-object v9, v2

    .line 541
    :goto_13
    move v5, v11

    .line 542
    goto :goto_14

    .line 543
    :cond_24
    invoke-interface {v4}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    .line 544
    .line 545
    .line 546
    move v6, v13

    .line 547
    goto :goto_13

    .line 548
    :goto_14
    invoke-interface {v4}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    .line 549
    .line 550
    .line 551
    move-result-object v10

    .line 552
    if-eqz v10, :cond_25

    .line 553
    .line 554
    new-instance v0, Landroidx/compose/foundation/BasicTooltipKt$BasicTooltipBox$3;

    .line 555
    .line 556
    move-object/from16 v2, p1

    .line 557
    .line 558
    move-object/from16 v7, p6

    .line 559
    .line 560
    move-object v3, v1

    .line 561
    move-object v4, v9

    .line 562
    move-object/from16 v1, p0

    .line 563
    .line 564
    move/from16 v9, p9

    .line 565
    .line 566
    invoke-direct/range {v0 .. v9}, Landroidx/compose/foundation/BasicTooltipKt$BasicTooltipBox$3;-><init>(Landroidx/compose/ui/window/PopupPositionProvider;Lkotlin/jvm/functions/Function2;Landroidx/compose/foundation/BasicTooltipState;Landroidx/compose/ui/Modifier;ZZLkotlin/jvm/functions/Function2;II)V

    .line 567
    .line 568
    .line 569
    invoke-interface {v10, v0}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lkotlin/jvm/functions/Function2;)V

    .line 570
    .line 571
    .line 572
    :cond_25
    return-void
.end method

.method public static final BasicTooltipState(ZZLandroidx/compose/foundation/MutatorMutex;)Landroidx/compose/foundation/BasicTooltipState;
    .locals 1
    .annotation build Landroidx/compose/foundation/ExperimentalFoundationApi;
    .end annotation

    .annotation build Landroidx/compose/runtime/Stable;
    .end annotation

    .line 1
    new-instance v0, Landroidx/compose/foundation/BasicTooltipStateImpl;

    .line 2
    .line 3
    invoke-direct {v0, p0, p1, p2}, Landroidx/compose/foundation/BasicTooltipStateImpl;-><init>(ZZLandroidx/compose/foundation/MutatorMutex;)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method

.method public static synthetic BasicTooltipState$default(ZZLandroidx/compose/foundation/MutatorMutex;ILjava/lang/Object;)Landroidx/compose/foundation/BasicTooltipState;
    .locals 0

    .line 1
    and-int/lit8 p4, p3, 0x1

    .line 2
    .line 3
    if-eqz p4, :cond_0

    .line 4
    .line 5
    const/4 p0, 0x0

    .line 6
    :cond_0
    and-int/lit8 p4, p3, 0x2

    .line 7
    .line 8
    if-eqz p4, :cond_1

    .line 9
    .line 10
    const/4 p1, 0x1

    .line 11
    :cond_1
    and-int/lit8 p3, p3, 0x4

    .line 12
    .line 13
    if-eqz p3, :cond_2

    .line 14
    .line 15
    sget-object p2, Landroidx/compose/foundation/BasicTooltipDefaults;->INSTANCE:Landroidx/compose/foundation/BasicTooltipDefaults;

    .line 16
    .line 17
    invoke-virtual {p2}, Landroidx/compose/foundation/BasicTooltipDefaults;->getGlobalMutatorMutex()Landroidx/compose/foundation/MutatorMutex;

    .line 18
    .line 19
    .line 20
    move-result-object p2

    .line 21
    :cond_2
    invoke-static {p0, p1, p2}, Landroidx/compose/foundation/BasicTooltipKt;->BasicTooltipState(ZZLandroidx/compose/foundation/MutatorMutex;)Landroidx/compose/foundation/BasicTooltipState;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    return-object p0
.end method

.method private static final TooltipPopup(Landroidx/compose/ui/window/PopupPositionProvider;Landroidx/compose/foundation/BasicTooltipState;Lkotlinx/coroutines/CoroutineScope;ZLkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V
    .locals 19
    .annotation build Landroidx/compose/runtime/Composable;
    .end annotation

    .annotation build Landroidx/compose/runtime/ComposableInferredTarget;
        scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/ui/window/PopupPositionProvider;",
            "Landroidx/compose/foundation/BasicTooltipState;",
            "Lkotlinx/coroutines/CoroutineScope;",
            "Z",
            "Lkotlin/jvm/functions/Function2<",
            "-",
            "Landroidx/compose/runtime/Composer;",
            "-",
            "Ljava/lang/Integer;",
            "Lkotlin/Unit;",
            ">;",
            "Landroidx/compose/runtime/Composer;",
            "I)V"
        }
    .end annotation

    .line 1
    move-object/from16 v2, p1

    .line 2
    .line 3
    move-object/from16 v3, p2

    .line 4
    .line 5
    move-object/from16 v5, p4

    .line 6
    .line 7
    move/from16 v6, p6

    .line 8
    .line 9
    const v0, -0x1d0c3c46

    .line 10
    .line 11
    .line 12
    move-object/from16 v1, p5

    .line 13
    .line 14
    invoke-interface {v1, v0}, Landroidx/compose/runtime/Composer;->startRestartGroup(I)Landroidx/compose/runtime/Composer;

    .line 15
    .line 16
    .line 17
    move-result-object v11

    .line 18
    and-int/lit8 v1, v6, 0x6

    .line 19
    .line 20
    if-nez v1, :cond_1

    .line 21
    .line 22
    move-object/from16 v1, p0

    .line 23
    .line 24
    invoke-interface {v11, v1}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 25
    .line 26
    .line 27
    move-result v4

    .line 28
    if-eqz v4, :cond_0

    .line 29
    .line 30
    const/4 v4, 0x4

    .line 31
    goto :goto_0

    .line 32
    :cond_0
    const/4 v4, 0x2

    .line 33
    :goto_0
    or-int/2addr v4, v6

    .line 34
    goto :goto_1

    .line 35
    :cond_1
    move-object/from16 v1, p0

    .line 36
    .line 37
    move v4, v6

    .line 38
    :goto_1
    and-int/lit8 v7, v6, 0x30

    .line 39
    .line 40
    const/16 v8, 0x20

    .line 41
    .line 42
    if-nez v7, :cond_3

    .line 43
    .line 44
    invoke-interface {v11, v2}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 45
    .line 46
    .line 47
    move-result v7

    .line 48
    if-eqz v7, :cond_2

    .line 49
    .line 50
    move v7, v8

    .line 51
    goto :goto_2

    .line 52
    :cond_2
    const/16 v7, 0x10

    .line 53
    .line 54
    :goto_2
    or-int/2addr v4, v7

    .line 55
    :cond_3
    and-int/lit16 v7, v6, 0x180

    .line 56
    .line 57
    if-nez v7, :cond_5

    .line 58
    .line 59
    invoke-interface {v11, v3}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 60
    .line 61
    .line 62
    move-result v7

    .line 63
    if-eqz v7, :cond_4

    .line 64
    .line 65
    const/16 v7, 0x100

    .line 66
    .line 67
    goto :goto_3

    .line 68
    :cond_4
    const/16 v7, 0x80

    .line 69
    .line 70
    :goto_3
    or-int/2addr v4, v7

    .line 71
    :cond_5
    and-int/lit16 v7, v6, 0xc00

    .line 72
    .line 73
    move/from16 v13, p3

    .line 74
    .line 75
    if-nez v7, :cond_7

    .line 76
    .line 77
    invoke-interface {v11, v13}, Landroidx/compose/runtime/Composer;->changed(Z)Z

    .line 78
    .line 79
    .line 80
    move-result v7

    .line 81
    if-eqz v7, :cond_6

    .line 82
    .line 83
    const/16 v7, 0x800

    .line 84
    .line 85
    goto :goto_4

    .line 86
    :cond_6
    const/16 v7, 0x400

    .line 87
    .line 88
    :goto_4
    or-int/2addr v4, v7

    .line 89
    :cond_7
    and-int/lit16 v7, v6, 0x6000

    .line 90
    .line 91
    if-nez v7, :cond_9

    .line 92
    .line 93
    invoke-interface {v11, v5}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 94
    .line 95
    .line 96
    move-result v7

    .line 97
    if-eqz v7, :cond_8

    .line 98
    .line 99
    const/16 v7, 0x4000

    .line 100
    .line 101
    goto :goto_5

    .line 102
    :cond_8
    const/16 v7, 0x2000

    .line 103
    .line 104
    :goto_5
    or-int/2addr v4, v7

    .line 105
    :cond_9
    and-int/lit16 v7, v4, 0x2493

    .line 106
    .line 107
    const/16 v9, 0x2492

    .line 108
    .line 109
    const/4 v10, 0x0

    .line 110
    const/4 v12, 0x1

    .line 111
    if-eq v7, v9, :cond_a

    .line 112
    .line 113
    move v7, v12

    .line 114
    goto :goto_6

    .line 115
    :cond_a
    move v7, v10

    .line 116
    :goto_6
    and-int/lit8 v9, v4, 0x1

    .line 117
    .line 118
    invoke-interface {v11, v7, v9}, Landroidx/compose/runtime/Composer;->shouldExecute(ZI)Z

    .line 119
    .line 120
    .line 121
    move-result v7

    .line 122
    if-eqz v7, :cond_f

    .line 123
    .line 124
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 125
    .line 126
    .line 127
    move-result v7

    .line 128
    if-eqz v7, :cond_b

    .line 129
    .line 130
    const/4 v7, -0x1

    .line 131
    const-string v9, "androidx.compose.foundation.TooltipPopup (BasicTooltip.kt:133)"

    .line 132
    .line 133
    invoke-static {v0, v4, v7, v9}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 134
    .line 135
    .line 136
    :cond_b
    sget-object v0, Landroidx/compose/foundation/BasicTooltipStrings;->INSTANCE:Landroidx/compose/foundation/BasicTooltipStrings;

    .line 137
    .line 138
    const/4 v7, 0x6

    .line 139
    invoke-virtual {v0, v11, v7}, Landroidx/compose/foundation/BasicTooltipStrings;->description(Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    .line 140
    .line 141
    .line 142
    move-result-object v0

    .line 143
    and-int/lit8 v7, v4, 0x70

    .line 144
    .line 145
    if-ne v7, v8, :cond_c

    .line 146
    .line 147
    move v10, v12

    .line 148
    :cond_c
    invoke-interface {v11, v3}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 149
    .line 150
    .line 151
    move-result v7

    .line 152
    or-int/2addr v7, v10

    .line 153
    invoke-interface {v11}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 154
    .line 155
    .line 156
    move-result-object v8

    .line 157
    if-nez v7, :cond_d

    .line 158
    .line 159
    sget-object v7, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    .line 160
    .line 161
    invoke-virtual {v7}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    .line 162
    .line 163
    .line 164
    move-result-object v7

    .line 165
    if-ne v8, v7, :cond_e

    .line 166
    .line 167
    :cond_d
    new-instance v8, Landroidx/compose/foundation/BasicTooltipKt$TooltipPopup$1$1;

    .line 168
    .line 169
    invoke-direct {v8, v2, v3}, Landroidx/compose/foundation/BasicTooltipKt$TooltipPopup$1$1;-><init>(Landroidx/compose/foundation/BasicTooltipState;Lkotlinx/coroutines/CoroutineScope;)V

    .line 170
    .line 171
    .line 172
    invoke-interface {v11, v8}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 173
    .line 174
    .line 175
    :cond_e
    check-cast v8, Lkotlin/jvm/functions/Function0;

    .line 176
    .line 177
    new-instance v9, Landroidx/compose/ui/window/PopupProperties;

    .line 178
    .line 179
    const/16 v17, 0xe

    .line 180
    .line 181
    const/16 v18, 0x0

    .line 182
    .line 183
    const/4 v14, 0x0

    .line 184
    const/4 v15, 0x0

    .line 185
    const/16 v16, 0x0

    .line 186
    .line 187
    move v7, v12

    .line 188
    move-object v12, v9

    .line 189
    invoke-direct/range {v12 .. v18}, Landroidx/compose/ui/window/PopupProperties;-><init>(ZZZZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 190
    .line 191
    .line 192
    new-instance v10, Landroidx/compose/foundation/BasicTooltipKt$TooltipPopup$2;

    .line 193
    .line 194
    invoke-direct {v10, v0, v5}, Landroidx/compose/foundation/BasicTooltipKt$TooltipPopup$2;-><init>(Ljava/lang/String;Lkotlin/jvm/functions/Function2;)V

    .line 195
    .line 196
    .line 197
    const/16 v0, 0x36

    .line 198
    .line 199
    const v12, -0x7c5470a8

    .line 200
    .line 201
    .line 202
    invoke-static {v12, v7, v10, v11, v0}, Landroidx/compose/runtime/internal/ComposableLambdaKt;->rememberComposableLambda(IZLjava/lang/Object;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/internal/ComposableLambda;

    .line 203
    .line 204
    .line 205
    move-result-object v10

    .line 206
    and-int/lit8 v0, v4, 0xe

    .line 207
    .line 208
    or-int/lit16 v12, v0, 0xc00

    .line 209
    .line 210
    const/4 v13, 0x0

    .line 211
    move-object v7, v1

    .line 212
    invoke-static/range {v7 .. v13}, Landroidx/compose/ui/window/AndroidPopup_androidKt;->Popup(Landroidx/compose/ui/window/PopupPositionProvider;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/window/PopupProperties;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V

    .line 213
    .line 214
    .line 215
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 216
    .line 217
    .line 218
    move-result v0

    .line 219
    if-eqz v0, :cond_10

    .line 220
    .line 221
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 222
    .line 223
    .line 224
    goto :goto_7

    .line 225
    :cond_f
    invoke-interface {v11}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    .line 226
    .line 227
    .line 228
    :cond_10
    :goto_7
    invoke-interface {v11}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    .line 229
    .line 230
    .line 231
    move-result-object v7

    .line 232
    if-eqz v7, :cond_11

    .line 233
    .line 234
    new-instance v0, Landroidx/compose/foundation/BasicTooltipKt$TooltipPopup$3;

    .line 235
    .line 236
    move-object/from16 v1, p0

    .line 237
    .line 238
    move/from16 v4, p3

    .line 239
    .line 240
    invoke-direct/range {v0 .. v6}, Landroidx/compose/foundation/BasicTooltipKt$TooltipPopup$3;-><init>(Landroidx/compose/ui/window/PopupPositionProvider;Landroidx/compose/foundation/BasicTooltipState;Lkotlinx/coroutines/CoroutineScope;ZLkotlin/jvm/functions/Function2;I)V

    .line 241
    .line 242
    .line 243
    invoke-interface {v7, v0}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lkotlin/jvm/functions/Function2;)V

    .line 244
    .line 245
    .line 246
    :cond_11
    return-void
.end method

.method private static final WrappedAnchor(ZLandroidx/compose/foundation/BasicTooltipState;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V
    .locals 8
    .annotation build Landroidx/compose/runtime/Composable;
    .end annotation

    .annotation build Landroidx/compose/runtime/ComposableInferredTarget;
        scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z",
            "Landroidx/compose/foundation/BasicTooltipState;",
            "Landroidx/compose/ui/Modifier;",
            "Lkotlin/jvm/functions/Function2<",
            "-",
            "Landroidx/compose/runtime/Composer;",
            "-",
            "Ljava/lang/Integer;",
            "Lkotlin/Unit;",
            ">;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    .line 1
    const v0, -0x6a7d23e

    .line 2
    .line 3
    .line 4
    invoke-interface {p4, v0}, Landroidx/compose/runtime/Composer;->startRestartGroup(I)Landroidx/compose/runtime/Composer;

    .line 5
    .line 6
    .line 7
    move-result-object p4

    .line 8
    and-int/lit8 v1, p6, 0x1

    .line 9
    .line 10
    if-eqz v1, :cond_0

    .line 11
    .line 12
    or-int/lit8 v1, p5, 0x6

    .line 13
    .line 14
    goto :goto_1

    .line 15
    :cond_0
    and-int/lit8 v1, p5, 0x6

    .line 16
    .line 17
    if-nez v1, :cond_2

    .line 18
    .line 19
    invoke-interface {p4, p0}, Landroidx/compose/runtime/Composer;->changed(Z)Z

    .line 20
    .line 21
    .line 22
    move-result v1

    .line 23
    if-eqz v1, :cond_1

    .line 24
    .line 25
    const/4 v1, 0x4

    .line 26
    goto :goto_0

    .line 27
    :cond_1
    const/4 v1, 0x2

    .line 28
    :goto_0
    or-int/2addr v1, p5

    .line 29
    goto :goto_1

    .line 30
    :cond_2
    move v1, p5

    .line 31
    :goto_1
    and-int/lit8 v2, p6, 0x2

    .line 32
    .line 33
    if-eqz v2, :cond_3

    .line 34
    .line 35
    or-int/lit8 v1, v1, 0x30

    .line 36
    .line 37
    goto :goto_3

    .line 38
    :cond_3
    and-int/lit8 v2, p5, 0x30

    .line 39
    .line 40
    if-nez v2, :cond_5

    .line 41
    .line 42
    invoke-interface {p4, p1}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 43
    .line 44
    .line 45
    move-result v2

    .line 46
    if-eqz v2, :cond_4

    .line 47
    .line 48
    const/16 v2, 0x20

    .line 49
    .line 50
    goto :goto_2

    .line 51
    :cond_4
    const/16 v2, 0x10

    .line 52
    .line 53
    :goto_2
    or-int/2addr v1, v2

    .line 54
    :cond_5
    :goto_3
    and-int/lit8 v2, p6, 0x4

    .line 55
    .line 56
    if-eqz v2, :cond_6

    .line 57
    .line 58
    or-int/lit16 v1, v1, 0x180

    .line 59
    .line 60
    goto :goto_5

    .line 61
    :cond_6
    and-int/lit16 v3, p5, 0x180

    .line 62
    .line 63
    if-nez v3, :cond_8

    .line 64
    .line 65
    invoke-interface {p4, p2}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 66
    .line 67
    .line 68
    move-result v3

    .line 69
    if-eqz v3, :cond_7

    .line 70
    .line 71
    const/16 v3, 0x100

    .line 72
    .line 73
    goto :goto_4

    .line 74
    :cond_7
    const/16 v3, 0x80

    .line 75
    .line 76
    :goto_4
    or-int/2addr v1, v3

    .line 77
    :cond_8
    :goto_5
    and-int/lit8 v3, p6, 0x8

    .line 78
    .line 79
    if-eqz v3, :cond_9

    .line 80
    .line 81
    or-int/lit16 v1, v1, 0xc00

    .line 82
    .line 83
    goto :goto_7

    .line 84
    :cond_9
    and-int/lit16 v3, p5, 0xc00

    .line 85
    .line 86
    if-nez v3, :cond_b

    .line 87
    .line 88
    invoke-interface {p4, p3}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 89
    .line 90
    .line 91
    move-result v3

    .line 92
    if-eqz v3, :cond_a

    .line 93
    .line 94
    const/16 v3, 0x800

    .line 95
    .line 96
    goto :goto_6

    .line 97
    :cond_a
    const/16 v3, 0x400

    .line 98
    .line 99
    :goto_6
    or-int/2addr v1, v3

    .line 100
    :cond_b
    :goto_7
    and-int/lit16 v3, v1, 0x493

    .line 101
    .line 102
    const/16 v4, 0x492

    .line 103
    .line 104
    const/4 v5, 0x0

    .line 105
    if-eq v3, v4, :cond_c

    .line 106
    .line 107
    const/4 v3, 0x1

    .line 108
    goto :goto_8

    .line 109
    :cond_c
    move v3, v5

    .line 110
    :goto_8
    and-int/lit8 v4, v1, 0x1

    .line 111
    .line 112
    invoke-interface {p4, v3, v4}, Landroidx/compose/runtime/Composer;->shouldExecute(ZI)Z

    .line 113
    .line 114
    .line 115
    move-result v3

    .line 116
    if-eqz v3, :cond_15

    .line 117
    .line 118
    if-eqz v2, :cond_d

    .line 119
    .line 120
    sget-object p2, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    .line 121
    .line 122
    :cond_d
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 123
    .line 124
    .line 125
    move-result v2

    .line 126
    if-eqz v2, :cond_e

    .line 127
    .line 128
    const/4 v2, -0x1

    .line 129
    const-string v3, "androidx.compose.foundation.WrappedAnchor (BasicTooltip.kt:112)"

    .line 130
    .line 131
    invoke-static {v0, v1, v2, v3}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 132
    .line 133
    .line 134
    :cond_e
    invoke-interface {p4}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 135
    .line 136
    .line 137
    move-result-object v0

    .line 138
    sget-object v2, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    .line 139
    .line 140
    invoke-virtual {v2}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    .line 141
    .line 142
    .line 143
    move-result-object v2

    .line 144
    if-ne v0, v2, :cond_f

    .line 145
    .line 146
    sget-object v0, Lkotlin/coroutines/EmptyCoroutineContext;->INSTANCE:Lkotlin/coroutines/EmptyCoroutineContext;

    .line 147
    .line 148
    invoke-static {v0, p4}, Landroidx/compose/runtime/EffectsKt;->createCompositionCoroutineScope(Lkotlin/coroutines/CoroutineContext;Landroidx/compose/runtime/Composer;)Lkotlinx/coroutines/CoroutineScope;

    .line 149
    .line 150
    .line 151
    move-result-object v0

    .line 152
    invoke-interface {p4, v0}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 153
    .line 154
    .line 155
    :cond_f
    check-cast v0, Lkotlinx/coroutines/CoroutineScope;

    .line 156
    .line 157
    sget-object v2, Landroidx/compose/foundation/BasicTooltipStrings;->INSTANCE:Landroidx/compose/foundation/BasicTooltipStrings;

    .line 158
    .line 159
    const/4 v3, 0x6

    .line 160
    invoke-virtual {v2, p4, v3}, Landroidx/compose/foundation/BasicTooltipStrings;->label(Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    .line 161
    .line 162
    .line 163
    move-result-object v2

    .line 164
    invoke-static {p2, p0, p1}, Landroidx/compose/foundation/BasicTooltipKt;->handleGestures(Landroidx/compose/ui/Modifier;ZLandroidx/compose/foundation/BasicTooltipState;)Landroidx/compose/ui/Modifier;

    .line 165
    .line 166
    .line 167
    move-result-object v3

    .line 168
    invoke-static {v3, v2, p0, p1, v0}, Landroidx/compose/foundation/BasicTooltipKt;->anchorSemantics(Landroidx/compose/ui/Modifier;Ljava/lang/String;ZLandroidx/compose/foundation/BasicTooltipState;Lkotlinx/coroutines/CoroutineScope;)Landroidx/compose/ui/Modifier;

    .line 169
    .line 170
    .line 171
    move-result-object v0

    .line 172
    sget-object v2, Landroidx/compose/ui/Alignment;->Companion:Landroidx/compose/ui/Alignment$Companion;

    .line 173
    .line 174
    invoke-virtual {v2}, Landroidx/compose/ui/Alignment$Companion;->getTopStart()Landroidx/compose/ui/Alignment;

    .line 175
    .line 176
    .line 177
    move-result-object v2

    .line 178
    invoke-static {v2, v5}, Landroidx/compose/foundation/layout/BoxKt;->maybeCachedBoxMeasurePolicy(Landroidx/compose/ui/Alignment;Z)Landroidx/compose/ui/layout/MeasurePolicy;

    .line 179
    .line 180
    .line 181
    move-result-object v2

    .line 182
    invoke-static {p4, v5}, Landroidx/compose/runtime/ComposablesKt;->getCurrentCompositeKeyHash(Landroidx/compose/runtime/Composer;I)I

    .line 183
    .line 184
    .line 185
    move-result v3

    .line 186
    invoke-interface {p4}, Landroidx/compose/runtime/Composer;->getCurrentCompositionLocalMap()Landroidx/compose/runtime/CompositionLocalMap;

    .line 187
    .line 188
    .line 189
    move-result-object v4

    .line 190
    invoke-static {p4, v0}, Landroidx/compose/ui/ComposedModifierKt;->materializeModifier(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    .line 191
    .line 192
    .line 193
    move-result-object v0

    .line 194
    sget-object v5, Landroidx/compose/ui/node/ComposeUiNode;->Companion:Landroidx/compose/ui/node/ComposeUiNode$Companion;

    .line 195
    .line 196
    invoke-virtual {v5}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getConstructor()Lkotlin/jvm/functions/Function0;

    .line 197
    .line 198
    .line 199
    move-result-object v6

    .line 200
    invoke-interface {p4}, Landroidx/compose/runtime/Composer;->getApplier()Landroidx/compose/runtime/Applier;

    .line 201
    .line 202
    .line 203
    move-result-object v7

    .line 204
    if-nez v7, :cond_10

    .line 205
    .line 206
    invoke-static {}, Landroidx/compose/runtime/ComposablesKt;->invalidApplier()V

    .line 207
    .line 208
    .line 209
    :cond_10
    invoke-interface {p4}, Landroidx/compose/runtime/Composer;->startReusableNode()V

    .line 210
    .line 211
    .line 212
    invoke-interface {p4}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 213
    .line 214
    .line 215
    move-result v7

    .line 216
    if-eqz v7, :cond_11

    .line 217
    .line 218
    invoke-interface {p4, v6}, Landroidx/compose/runtime/Composer;->createNode(Lkotlin/jvm/functions/Function0;)V

    .line 219
    .line 220
    .line 221
    goto :goto_9

    .line 222
    :cond_11
    invoke-interface {p4}, Landroidx/compose/runtime/Composer;->useNode()V

    .line 223
    .line 224
    .line 225
    :goto_9
    invoke-static {p4}, Landroidx/compose/runtime/Updater;->constructor-impl(Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;

    .line 226
    .line 227
    .line 228
    move-result-object v6

    .line 229
    invoke-virtual {v5}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetMeasurePolicy()Lkotlin/jvm/functions/Function2;

    .line 230
    .line 231
    .line 232
    move-result-object v7

    .line 233
    invoke-static {v6, v2, v7}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 234
    .line 235
    .line 236
    invoke-virtual {v5}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetResolvedCompositionLocals()Lkotlin/jvm/functions/Function2;

    .line 237
    .line 238
    .line 239
    move-result-object v2

    .line 240
    invoke-static {v6, v4, v2}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 241
    .line 242
    .line 243
    invoke-virtual {v5}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetCompositeKeyHash()Lkotlin/jvm/functions/Function2;

    .line 244
    .line 245
    .line 246
    move-result-object v2

    .line 247
    invoke-interface {v6}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 248
    .line 249
    .line 250
    move-result v4

    .line 251
    if-nez v4, :cond_12

    .line 252
    .line 253
    invoke-interface {v6}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 254
    .line 255
    .line 256
    move-result-object v4

    .line 257
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 258
    .line 259
    .line 260
    move-result-object v7

    .line 261
    invoke-static {v4, v7}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 262
    .line 263
    .line 264
    move-result v4

    .line 265
    if-nez v4, :cond_13

    .line 266
    .line 267
    :cond_12
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 268
    .line 269
    .line 270
    move-result-object v4

    .line 271
    invoke-interface {v6, v4}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 272
    .line 273
    .line 274
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 275
    .line 276
    .line 277
    move-result-object v3

    .line 278
    invoke-interface {v6, v3, v2}, Landroidx/compose/runtime/Composer;->apply(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 279
    .line 280
    .line 281
    :cond_13
    invoke-virtual {v5}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetModifier()Lkotlin/jvm/functions/Function2;

    .line 282
    .line 283
    .line 284
    move-result-object v2

    .line 285
    invoke-static {v6, v0, v2}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 286
    .line 287
    .line 288
    sget-object v0, Landroidx/compose/foundation/layout/BoxScopeInstance;->INSTANCE:Landroidx/compose/foundation/layout/BoxScopeInstance;

    .line 289
    .line 290
    shr-int/lit8 v0, v1, 0x9

    .line 291
    .line 292
    and-int/lit8 v0, v0, 0xe

    .line 293
    .line 294
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 295
    .line 296
    .line 297
    move-result-object v0

    .line 298
    invoke-interface {p3, p4, v0}, Lkotlin/jvm/functions/Function2;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 299
    .line 300
    .line 301
    invoke-interface {p4}, Landroidx/compose/runtime/Composer;->endNode()V

    .line 302
    .line 303
    .line 304
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 305
    .line 306
    .line 307
    move-result v0

    .line 308
    if-eqz v0, :cond_14

    .line 309
    .line 310
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 311
    .line 312
    .line 313
    :cond_14
    :goto_a
    move-object v4, p2

    .line 314
    goto :goto_b

    .line 315
    :cond_15
    invoke-interface {p4}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    .line 316
    .line 317
    .line 318
    goto :goto_a

    .line 319
    :goto_b
    invoke-interface {p4}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    .line 320
    .line 321
    .line 322
    move-result-object p2

    .line 323
    if-eqz p2, :cond_16

    .line 324
    .line 325
    new-instance v1, Landroidx/compose/foundation/BasicTooltipKt$WrappedAnchor$2;

    .line 326
    .line 327
    move v2, p0

    .line 328
    move-object v3, p1

    .line 329
    move-object v5, p3

    .line 330
    move v6, p5

    .line 331
    move v7, p6

    .line 332
    invoke-direct/range {v1 .. v7}, Landroidx/compose/foundation/BasicTooltipKt$WrappedAnchor$2;-><init>(ZLandroidx/compose/foundation/BasicTooltipState;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;II)V

    .line 333
    .line 334
    .line 335
    invoke-interface {p2, v1}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lkotlin/jvm/functions/Function2;)V

    .line 336
    .line 337
    .line 338
    :cond_16
    return-void
.end method

.method public static final synthetic access$TooltipPopup(Landroidx/compose/ui/window/PopupPositionProvider;Landroidx/compose/foundation/BasicTooltipState;Lkotlinx/coroutines/CoroutineScope;ZLkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V
    .locals 0

    .line 1
    invoke-static/range {p0 .. p6}, Landroidx/compose/foundation/BasicTooltipKt;->TooltipPopup(Landroidx/compose/ui/window/PopupPositionProvider;Landroidx/compose/foundation/BasicTooltipState;Lkotlinx/coroutines/CoroutineScope;ZLkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static final synthetic access$WrappedAnchor(ZLandroidx/compose/foundation/BasicTooltipState;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V
    .locals 0

    .line 1
    invoke-static/range {p0 .. p6}, Landroidx/compose/foundation/BasicTooltipKt;->WrappedAnchor(ZLandroidx/compose/foundation/BasicTooltipState;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private static final anchorSemantics(Landroidx/compose/ui/Modifier;Ljava/lang/String;ZLandroidx/compose/foundation/BasicTooltipState;Lkotlinx/coroutines/CoroutineScope;)Landroidx/compose/ui/Modifier;
    .locals 0

    .line 1
    if-eqz p2, :cond_0

    .line 2
    .line 3
    new-instance p2, Landroidx/compose/foundation/BasicTooltipKt$anchorSemantics$1;

    .line 4
    .line 5
    invoke-direct {p2, p1, p4, p3}, Landroidx/compose/foundation/BasicTooltipKt$anchorSemantics$1;-><init>(Ljava/lang/String;Lkotlinx/coroutines/CoroutineScope;Landroidx/compose/foundation/BasicTooltipState;)V

    .line 6
    .line 7
    .line 8
    const/4 p1, 0x1

    .line 9
    invoke-static {p0, p1, p2}, Landroidx/compose/ui/semantics/SemanticsModifierKt;->semantics(Landroidx/compose/ui/Modifier;ZLkotlin/jvm/functions/Function1;)Landroidx/compose/ui/Modifier;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    :cond_0
    return-object p0
.end method

.method private static final handleGestures(Landroidx/compose/ui/Modifier;ZLandroidx/compose/foundation/BasicTooltipState;)Landroidx/compose/ui/Modifier;
    .locals 0

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    new-instance p1, Landroidx/compose/foundation/BasicTooltipKt$handleGestures$1;

    .line 4
    .line 5
    invoke-direct {p1, p2}, Landroidx/compose/foundation/BasicTooltipKt$handleGestures$1;-><init>(Landroidx/compose/foundation/BasicTooltipState;)V

    .line 6
    .line 7
    .line 8
    invoke-static {p0, p2, p1}, Landroidx/compose/ui/input/pointer/SuspendingPointerInputFilterKt;->pointerInput(Landroidx/compose/ui/Modifier;Ljava/lang/Object;Landroidx/compose/ui/input/pointer/PointerInputEventHandler;)Landroidx/compose/ui/Modifier;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    new-instance p1, Landroidx/compose/foundation/BasicTooltipKt$handleGestures$2;

    .line 13
    .line 14
    invoke-direct {p1, p2}, Landroidx/compose/foundation/BasicTooltipKt$handleGestures$2;-><init>(Landroidx/compose/foundation/BasicTooltipState;)V

    .line 15
    .line 16
    .line 17
    invoke-static {p0, p2, p1}, Landroidx/compose/ui/input/pointer/SuspendingPointerInputFilterKt;->pointerInput(Landroidx/compose/ui/Modifier;Ljava/lang/Object;Landroidx/compose/ui/input/pointer/PointerInputEventHandler;)Landroidx/compose/ui/Modifier;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    :cond_0
    return-object p0
.end method

.method public static final rememberBasicTooltipState(ZZLandroidx/compose/foundation/MutatorMutex;Landroidx/compose/runtime/Composer;II)Landroidx/compose/foundation/BasicTooltipState;
    .locals 4
    .annotation build Landroidx/compose/foundation/ExperimentalFoundationApi;
    .end annotation

    .annotation build Landroidx/compose/runtime/Composable;
    .end annotation

    .line 1
    and-int/lit8 v0, p5, 0x1

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    move p0, v1

    .line 7
    :cond_0
    and-int/lit8 v0, p5, 0x2

    .line 8
    .line 9
    const/4 v2, 0x1

    .line 10
    if-eqz v0, :cond_1

    .line 11
    .line 12
    move p1, v2

    .line 13
    :cond_1
    and-int/lit8 p5, p5, 0x4

    .line 14
    .line 15
    if-eqz p5, :cond_2

    .line 16
    .line 17
    sget-object p2, Landroidx/compose/foundation/BasicTooltipDefaults;->INSTANCE:Landroidx/compose/foundation/BasicTooltipDefaults;

    .line 18
    .line 19
    invoke-virtual {p2}, Landroidx/compose/foundation/BasicTooltipDefaults;->getGlobalMutatorMutex()Landroidx/compose/foundation/MutatorMutex;

    .line 20
    .line 21
    .line 22
    move-result-object p2

    .line 23
    :cond_2
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 24
    .line 25
    .line 26
    move-result p5

    .line 27
    if-eqz p5, :cond_3

    .line 28
    .line 29
    const/4 p5, -0x1

    .line 30
    const-string v0, "androidx.compose.foundation.rememberBasicTooltipState (BasicTooltip.kt:245)"

    .line 31
    .line 32
    const v3, 0x42fcbc9d

    .line 33
    .line 34
    .line 35
    invoke-static {v3, p4, p5, v0}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 36
    .line 37
    .line 38
    :cond_3
    and-int/lit8 p5, p4, 0x70

    .line 39
    .line 40
    xor-int/lit8 p5, p5, 0x30

    .line 41
    .line 42
    const/16 v0, 0x20

    .line 43
    .line 44
    if-le p5, v0, :cond_4

    .line 45
    .line 46
    invoke-interface {p3, p1}, Landroidx/compose/runtime/Composer;->changed(Z)Z

    .line 47
    .line 48
    .line 49
    move-result p5

    .line 50
    if-nez p5, :cond_5

    .line 51
    .line 52
    :cond_4
    and-int/lit8 p5, p4, 0x30

    .line 53
    .line 54
    if-ne p5, v0, :cond_6

    .line 55
    .line 56
    :cond_5
    move p5, v2

    .line 57
    goto :goto_0

    .line 58
    :cond_6
    move p5, v1

    .line 59
    :goto_0
    and-int/lit16 v0, p4, 0x380

    .line 60
    .line 61
    xor-int/lit16 v0, v0, 0x180

    .line 62
    .line 63
    const/16 v3, 0x100

    .line 64
    .line 65
    if-le v0, v3, :cond_7

    .line 66
    .line 67
    invoke-interface {p3, p2}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 68
    .line 69
    .line 70
    move-result v0

    .line 71
    if-nez v0, :cond_8

    .line 72
    .line 73
    :cond_7
    and-int/lit16 p4, p4, 0x180

    .line 74
    .line 75
    if-ne p4, v3, :cond_9

    .line 76
    .line 77
    :cond_8
    move v1, v2

    .line 78
    :cond_9
    or-int p4, p5, v1

    .line 79
    .line 80
    invoke-interface {p3}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 81
    .line 82
    .line 83
    move-result-object p5

    .line 84
    if-nez p4, :cond_a

    .line 85
    .line 86
    sget-object p4, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    .line 87
    .line 88
    invoke-virtual {p4}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    .line 89
    .line 90
    .line 91
    move-result-object p4

    .line 92
    if-ne p5, p4, :cond_b

    .line 93
    .line 94
    :cond_a
    new-instance p5, Landroidx/compose/foundation/BasicTooltipStateImpl;

    .line 95
    .line 96
    invoke-direct {p5, p0, p1, p2}, Landroidx/compose/foundation/BasicTooltipStateImpl;-><init>(ZZLandroidx/compose/foundation/MutatorMutex;)V

    .line 97
    .line 98
    .line 99
    invoke-interface {p3, p5}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 100
    .line 101
    .line 102
    :cond_b
    check-cast p5, Landroidx/compose/foundation/BasicTooltipStateImpl;

    .line 103
    .line 104
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 105
    .line 106
    .line 107
    move-result p0

    .line 108
    if-eqz p0, :cond_c

    .line 109
    .line 110
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 111
    .line 112
    .line 113
    :cond_c
    return-object p5
.end method
