.class public final Landroidx/constraintlayout/compose/MotionCarouselKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000t\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a8\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0011\u0010\u0008\u001a\r\u0012\u0004\u0012\u00020\u00010\t\u00a2\u0006\u0002\u0008\nH\u0007\u00a2\u0006\u0002\u0010\u000b\u001af\u0010\u000c\u001a\u00020\u00012\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0011\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u0012\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u0013\u001a\u00020\u00072\u0017\u0010\u0014\u001a\u0013\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00010\u0015\u00a2\u0006\u0002\u0008\u0017H\u0007\u00a2\u0006\u0002\u0010\u0018\u001a,\u0010\u0019\u001a\u0008\u0012\u0004\u0012\u00020\u001b0\u001a2\u0017\u0010\u0014\u001a\u0013\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00010\u0015\u00a2\u0006\u0002\u0008\u0017H\u0003\u00a2\u0006\u0002\u0010\u001c\u001aP\u0010\u001d\u001a\u00020\u0001\"\u0004\u0008\u0000\u0010\u001e*\u00020\u00162\u000c\u0010\u001d\u001a\u0008\u0012\u0004\u0012\u0002H\u001e0\u001f2(\u0008\u0004\u0010 \u001a\"\u0012\u0013\u0012\u0011H\u001e\u00a2\u0006\u000c\u0008!\u0012\u0008\u0008\"\u0012\u0004\u0008\u0008(#\u0012\u0004\u0012\u00020\u00010\u0015\u00a2\u0006\u0002\u0008\nH\u0086\u0008\u00a2\u0006\u0002\u0010$\u001ao\u0010%\u001a\u00020\u0001\"\u0004\u0008\u0000\u0010\u001e*\u00020\u00162\u000c\u0010\u001d\u001a\u0008\u0012\u0004\u0012\u0002H\u001e0\u001f2G\u0008\u0004\u0010 \u001aA\u0012\u0013\u0012\u0011H\u001e\u00a2\u0006\u000c\u0008!\u0012\u0008\u0008\"\u0012\u0004\u0008\u0008(#\u0012\u001d\u0012\u001b\u0012\u0008\u0012\u00060\'R\u00020(0\u001a\u00a2\u0006\u000c\u0008!\u0012\u0008\u0008\"\u0012\u0004\u0008\u0008()\u0012\u0004\u0012\u00020\u00010&\u00a2\u0006\u0002\u0008\nH\u0086\u0008\u00a2\u0006\u0002\u0010*\u00a8\u0006+\u00b2\u0006\n\u0010,\u001a\u00020-X\u008a\u008e\u0002\u00b2\u0006\n\u0010.\u001a\u00020/X\u008a\u008e\u0002\u00b2\u0006\n\u00100\u001a\u00020\u0003X\u008a\u008e\u0002"
    }
    d2 = {
        "ItemHolder",
        "",
        "i",
        "",
        "slotPrefix",
        "",
        "showSlot",
        "",
        "function",
        "Lkotlin/Function0;",
        "Landroidx/compose/runtime/Composable;",
        "(ILjava/lang/String;ZLkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V",
        "MotionCarousel",
        "motionScene",
        "Landroidx/constraintlayout/compose/MotionScene;",
        "initialSlotIndex",
        "numSlots",
        "backwardTransition",
        "forwardTransition",
        "showSlots",
        "content",
        "Lkotlin/Function1;",
        "Landroidx/constraintlayout/compose/MotionCarouselScope;",
        "Lkotlin/ExtensionFunctionType;",
        "(Landroidx/constraintlayout/compose/MotionScene;IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V",
        "rememberStateOfItemsProvider",
        "Landroidx/compose/runtime/State;",
        "Landroidx/constraintlayout/compose/MotionItemsProvider;",
        "(Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;",
        "items",
        "T",
        "",
        "itemContent",
        "Lkotlin/ParameterName;",
        "name",
        "item",
        "(Landroidx/constraintlayout/compose/MotionCarouselScope;Ljava/util/List;Lkotlin/jvm/functions/Function3;)V",
        "itemsWithProperties",
        "Lkotlin/Function2;",
        "Landroidx/constraintlayout/compose/MotionLayoutScope$MotionProperties;",
        "Landroidx/constraintlayout/compose/MotionLayoutScope;",
        "properties",
        "(Landroidx/constraintlayout/compose/MotionCarouselScope;Ljava/util/List;Lkotlin/jvm/functions/Function4;)V",
        "constraintlayout-compose_release",
        "componentWidth",
        "",
        "state",
        "Landroidx/constraintlayout/compose/CarouselState;",
        "currentIndex"
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
        "SMAP\nMotionCarousel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MotionCarousel.kt\nandroidx/constraintlayout/compose/MotionCarouselKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 MotionLayout.kt\nandroidx/constraintlayout/compose/MotionLayoutKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 6 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 7 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 8 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 9 Composer.kt\nandroidx/compose/runtime/Updater\n+ 10 SnapshotFloatState.kt\nandroidx/compose/runtime/PrimitiveSnapshotStateKt__SnapshotFloatStateKt\n+ 11 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 12 SnapshotIntState.kt\nandroidx/compose/runtime/SnapshotIntStateKt__SnapshotIntStateKt\n*L\n1#1,373:1\n1225#2,6:374\n1225#2,6:380\n1225#2,6:386\n1225#2,6:392\n1225#2,6:398\n1225#2,6:404\n1225#2,6:410\n1225#2,6:429\n1225#2,6:492\n249#3:416\n245#3,12:417\n257#3,2:435\n262#3:438\n279#3,10:439\n278#3:449\n290#3:450\n1#4:437\n149#5:451\n149#5:452\n71#6:453\n69#6,5:454\n74#6:487\n78#6:491\n79#7,6:459\n86#7,4:474\n90#7,2:484\n94#7:490\n368#8,9:465\n377#8:486\n378#8,2:488\n4034#9,6:478\n79#10:498\n112#10,2:499\n81#11:501\n107#11,2:502\n78#12:504\n111#12,2:505\n*S KotlinDebug\n*F\n+ 1 MotionCarousel.kt\nandroidx/constraintlayout/compose/MotionCarouselKt\n*L\n156#1:374,6\n160#1:380,6\n163#1:386,6\n178#1:392,6\n194#1:398,6\n205#1:404,6\n231#1:410,6\n216#1:429,6\n310#1:492,6\n216#1:416\n216#1:417,12\n216#1:435,2\n216#1:438\n216#1:439,10\n216#1:449\n216#1:450\n216#1:437\n257#1:451\n258#1:452\n260#1:453\n260#1:454,5\n260#1:487\n260#1:491\n260#1:459,6\n260#1:474,4\n260#1:484,2\n260#1:490\n260#1:465,9\n260#1:486\n260#1:488,2\n260#1:478,6\n156#1:498\n156#1:499,2\n160#1:501\n160#1:502,2\n163#1:504\n163#1:505,2\n*E\n"
    }
.end annotation


# direct methods
.method public static final ItemHolder(ILjava/lang/String;ZLkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V
    .locals 8
    .annotation build Landroidx/compose/runtime/Composable;
    .end annotation

    .annotation build Landroidx/compose/runtime/ComposableInferredTarget;
        scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/lang/String;",
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
    const v0, 0x7573b043

    .line 2
    .line 3
    .line 4
    invoke-interface {p4, v0}, Landroidx/compose/runtime/Composer;->startRestartGroup(I)Landroidx/compose/runtime/Composer;

    .line 5
    .line 6
    .line 7
    move-result-object p4

    .line 8
    and-int/lit8 v1, p5, 0x6

    .line 9
    .line 10
    const/4 v2, 0x2

    .line 11
    if-nez v1, :cond_1

    .line 12
    .line 13
    invoke-interface {p4, p0}, Landroidx/compose/runtime/Composer;->changed(I)Z

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    if-eqz v1, :cond_0

    .line 18
    .line 19
    const/4 v1, 0x4

    .line 20
    goto :goto_0

    .line 21
    :cond_0
    move v1, v2

    .line 22
    :goto_0
    or-int/2addr v1, p5

    .line 23
    goto :goto_1

    .line 24
    :cond_1
    move v1, p5

    .line 25
    :goto_1
    and-int/lit8 v3, p5, 0x30

    .line 26
    .line 27
    if-nez v3, :cond_3

    .line 28
    .line 29
    invoke-interface {p4, p1}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 30
    .line 31
    .line 32
    move-result v3

    .line 33
    if-eqz v3, :cond_2

    .line 34
    .line 35
    const/16 v3, 0x20

    .line 36
    .line 37
    goto :goto_2

    .line 38
    :cond_2
    const/16 v3, 0x10

    .line 39
    .line 40
    :goto_2
    or-int/2addr v1, v3

    .line 41
    :cond_3
    and-int/lit16 v3, p5, 0x180

    .line 42
    .line 43
    if-nez v3, :cond_5

    .line 44
    .line 45
    invoke-interface {p4, p2}, Landroidx/compose/runtime/Composer;->changed(Z)Z

    .line 46
    .line 47
    .line 48
    move-result v3

    .line 49
    if-eqz v3, :cond_4

    .line 50
    .line 51
    const/16 v3, 0x100

    .line 52
    .line 53
    goto :goto_3

    .line 54
    :cond_4
    const/16 v3, 0x80

    .line 55
    .line 56
    :goto_3
    or-int/2addr v1, v3

    .line 57
    :cond_5
    and-int/lit16 v3, p5, 0xc00

    .line 58
    .line 59
    if-nez v3, :cond_7

    .line 60
    .line 61
    invoke-interface {p4, p3}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 62
    .line 63
    .line 64
    move-result v3

    .line 65
    if-eqz v3, :cond_6

    .line 66
    .line 67
    const/16 v3, 0x800

    .line 68
    .line 69
    goto :goto_4

    .line 70
    :cond_6
    const/16 v3, 0x400

    .line 71
    .line 72
    :goto_4
    or-int/2addr v1, v3

    .line 73
    :cond_7
    and-int/lit16 v3, v1, 0x493

    .line 74
    .line 75
    const/16 v4, 0x492

    .line 76
    .line 77
    if-ne v3, v4, :cond_9

    .line 78
    .line 79
    invoke-interface {p4}, Landroidx/compose/runtime/Composer;->getSkipping()Z

    .line 80
    .line 81
    .line 82
    move-result v3

    .line 83
    if-nez v3, :cond_8

    .line 84
    .line 85
    goto :goto_5

    .line 86
    :cond_8
    invoke-interface {p4}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    .line 87
    .line 88
    .line 89
    goto/16 :goto_7

    .line 90
    .line 91
    :cond_9
    :goto_5
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 92
    .line 93
    .line 94
    move-result v3

    .line 95
    if-eqz v3, :cond_a

    .line 96
    .line 97
    const/4 v3, -0x1

    .line 98
    const-string v4, "androidx.constraintlayout.compose.ItemHolder (MotionCarousel.kt:250)"

    .line 99
    .line 100
    invoke-static {v0, v1, v3, v4}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 101
    .line 102
    .line 103
    :cond_a
    sget-object v0, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    .line 104
    .line 105
    new-instance v3, Ljava/lang/StringBuilder;

    .line 106
    .line 107
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 108
    .line 109
    .line 110
    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 111
    .line 112
    .line 113
    invoke-virtual {v3, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 114
    .line 115
    .line 116
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 117
    .line 118
    .line 119
    move-result-object v3

    .line 120
    const/4 v4, 0x0

    .line 121
    invoke-static {v0, v3, v4, v2, v4}, Landroidx/constraintlayout/compose/ConstraintLayoutTagKt;->layoutId$default(Landroidx/compose/ui/Modifier;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    .line 122
    .line 123
    .line 124
    move-result-object v0

    .line 125
    const/4 v3, 0x0

    .line 126
    if-eqz p2, :cond_b

    .line 127
    .line 128
    const/16 v4, 0x14

    .line 129
    .line 130
    int-to-float v4, v4

    .line 131
    invoke-static {v4}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 132
    .line 133
    .line 134
    move-result v5

    .line 135
    invoke-static {v5}, Landroidx/compose/foundation/shape/RoundedCornerShapeKt;->RoundedCornerShape-0680j_4(F)Landroidx/compose/foundation/shape/RoundedCornerShape;

    .line 136
    .line 137
    .line 138
    move-result-object v5

    .line 139
    invoke-static {v0, v5}, Landroidx/compose/ui/draw/ClipKt;->clip(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/graphics/Shape;)Landroidx/compose/ui/Modifier;

    .line 140
    .line 141
    .line 142
    move-result-object v0

    .line 143
    int-to-float v2, v2

    .line 144
    invoke-static {v2}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 145
    .line 146
    .line 147
    move-result v2

    .line 148
    const/16 v5, 0x3c

    .line 149
    .line 150
    invoke-static {v3, v3, v3, v5}, Landroidx/compose/ui/graphics/ColorKt;->Color(IIII)J

    .line 151
    .line 152
    .line 153
    move-result-wide v5

    .line 154
    invoke-static {v4}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 155
    .line 156
    .line 157
    move-result v4

    .line 158
    invoke-static {v4}, Landroidx/compose/foundation/shape/RoundedCornerShapeKt;->RoundedCornerShape-0680j_4(F)Landroidx/compose/foundation/shape/RoundedCornerShape;

    .line 159
    .line 160
    .line 161
    move-result-object v4

    .line 162
    invoke-static {v0, v2, v5, v6, v4}, Landroidx/compose/foundation/BorderKt;->border-xT4_qwU(Landroidx/compose/ui/Modifier;FJLandroidx/compose/ui/graphics/Shape;)Landroidx/compose/ui/Modifier;

    .line 163
    .line 164
    .line 165
    move-result-object v0

    .line 166
    :cond_b
    sget-object v2, Landroidx/compose/ui/Alignment;->Companion:Landroidx/compose/ui/Alignment$Companion;

    .line 167
    .line 168
    invoke-virtual {v2}, Landroidx/compose/ui/Alignment$Companion;->getCenter()Landroidx/compose/ui/Alignment;

    .line 169
    .line 170
    .line 171
    move-result-object v2

    .line 172
    invoke-static {v2, v3}, Landroidx/compose/foundation/layout/BoxKt;->maybeCachedBoxMeasurePolicy(Landroidx/compose/ui/Alignment;Z)Landroidx/compose/ui/layout/MeasurePolicy;

    .line 173
    .line 174
    .line 175
    move-result-object v2

    .line 176
    invoke-static {p4, v3}, Landroidx/compose/runtime/ComposablesKt;->getCurrentCompositeKeyHash(Landroidx/compose/runtime/Composer;I)I

    .line 177
    .line 178
    .line 179
    move-result v3

    .line 180
    invoke-interface {p4}, Landroidx/compose/runtime/Composer;->getCurrentCompositionLocalMap()Landroidx/compose/runtime/CompositionLocalMap;

    .line 181
    .line 182
    .line 183
    move-result-object v4

    .line 184
    invoke-static {p4, v0}, Landroidx/compose/ui/ComposedModifierKt;->materializeModifier(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    .line 185
    .line 186
    .line 187
    move-result-object v0

    .line 188
    sget-object v5, Landroidx/compose/ui/node/ComposeUiNode;->Companion:Landroidx/compose/ui/node/ComposeUiNode$Companion;

    .line 189
    .line 190
    invoke-virtual {v5}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getConstructor()Lkotlin/jvm/functions/Function0;

    .line 191
    .line 192
    .line 193
    move-result-object v6

    .line 194
    invoke-interface {p4}, Landroidx/compose/runtime/Composer;->getApplier()Landroidx/compose/runtime/Applier;

    .line 195
    .line 196
    .line 197
    move-result-object v7

    .line 198
    if-nez v7, :cond_c

    .line 199
    .line 200
    invoke-static {}, Landroidx/compose/runtime/ComposablesKt;->invalidApplier()V

    .line 201
    .line 202
    .line 203
    :cond_c
    invoke-interface {p4}, Landroidx/compose/runtime/Composer;->startReusableNode()V

    .line 204
    .line 205
    .line 206
    invoke-interface {p4}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 207
    .line 208
    .line 209
    move-result v7

    .line 210
    if-eqz v7, :cond_d

    .line 211
    .line 212
    invoke-interface {p4, v6}, Landroidx/compose/runtime/Composer;->createNode(Lkotlin/jvm/functions/Function0;)V

    .line 213
    .line 214
    .line 215
    goto :goto_6

    .line 216
    :cond_d
    invoke-interface {p4}, Landroidx/compose/runtime/Composer;->useNode()V

    .line 217
    .line 218
    .line 219
    :goto_6
    invoke-static {p4}, Landroidx/compose/runtime/Updater;->constructor-impl(Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;

    .line 220
    .line 221
    .line 222
    move-result-object v6

    .line 223
    invoke-virtual {v5}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetMeasurePolicy()Lkotlin/jvm/functions/Function2;

    .line 224
    .line 225
    .line 226
    move-result-object v7

    .line 227
    invoke-static {v6, v2, v7}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 228
    .line 229
    .line 230
    invoke-virtual {v5}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetResolvedCompositionLocals()Lkotlin/jvm/functions/Function2;

    .line 231
    .line 232
    .line 233
    move-result-object v2

    .line 234
    invoke-static {v6, v4, v2}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 235
    .line 236
    .line 237
    invoke-virtual {v5}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetCompositeKeyHash()Lkotlin/jvm/functions/Function2;

    .line 238
    .line 239
    .line 240
    move-result-object v2

    .line 241
    invoke-interface {v6}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 242
    .line 243
    .line 244
    move-result v4

    .line 245
    if-nez v4, :cond_e

    .line 246
    .line 247
    invoke-interface {v6}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 248
    .line 249
    .line 250
    move-result-object v4

    .line 251
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 252
    .line 253
    .line 254
    move-result-object v7

    .line 255
    invoke-static {v4, v7}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 256
    .line 257
    .line 258
    move-result v4

    .line 259
    if-nez v4, :cond_f

    .line 260
    .line 261
    :cond_e
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 262
    .line 263
    .line 264
    move-result-object v4

    .line 265
    invoke-interface {v6, v4}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 266
    .line 267
    .line 268
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 269
    .line 270
    .line 271
    move-result-object v3

    .line 272
    invoke-interface {v6, v3, v2}, Landroidx/compose/runtime/Composer;->apply(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 273
    .line 274
    .line 275
    :cond_f
    invoke-virtual {v5}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetModifier()Lkotlin/jvm/functions/Function2;

    .line 276
    .line 277
    .line 278
    move-result-object v2

    .line 279
    invoke-static {v6, v0, v2}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 280
    .line 281
    .line 282
    sget-object v0, Landroidx/compose/foundation/layout/BoxScopeInstance;->INSTANCE:Landroidx/compose/foundation/layout/BoxScopeInstance;

    .line 283
    .line 284
    shr-int/lit8 v0, v1, 0x9

    .line 285
    .line 286
    and-int/lit8 v0, v0, 0xe

    .line 287
    .line 288
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 289
    .line 290
    .line 291
    move-result-object v0

    .line 292
    invoke-interface {p3, p4, v0}, Lkotlin/jvm/functions/Function2;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 293
    .line 294
    .line 295
    invoke-interface {p4}, Landroidx/compose/runtime/Composer;->endNode()V

    .line 296
    .line 297
    .line 298
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 299
    .line 300
    .line 301
    move-result v0

    .line 302
    if-eqz v0, :cond_10

    .line 303
    .line 304
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 305
    .line 306
    .line 307
    :cond_10
    :goto_7
    invoke-interface {p4}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    .line 308
    .line 309
    .line 310
    move-result-object p4

    .line 311
    if-eqz p4, :cond_11

    .line 312
    .line 313
    new-instance v0, Landroidx/constraintlayout/compose/MotionCarouselKt$ItemHolder$2;

    .line 314
    .line 315
    move v1, p0

    .line 316
    move-object v2, p1

    .line 317
    move v3, p2

    .line 318
    move-object v4, p3

    .line 319
    move v5, p5

    .line 320
    invoke-direct/range {v0 .. v5}, Landroidx/constraintlayout/compose/MotionCarouselKt$ItemHolder$2;-><init>(ILjava/lang/String;ZLkotlin/jvm/functions/Function2;I)V

    .line 321
    .line 322
    .line 323
    invoke-interface {p4, v0}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lkotlin/jvm/functions/Function2;)V

    .line 324
    .line 325
    .line 326
    :cond_11
    return-void
.end method

.method public static final MotionCarousel(Landroidx/constraintlayout/compose/MotionScene;IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V
    .locals 36
    .annotation build Landroidx/compose/runtime/Composable;
    .end annotation

    .annotation build Landroidx/compose/runtime/ComposableTarget;
        applier = "androidx.compose.ui.UiComposable"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/constraintlayout/compose/MotionScene;",
            "II",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Z",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Landroidx/constraintlayout/compose/MotionCarouselScope;",
            "Lkotlin/Unit;",
            ">;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    .line 1
    move-object/from16 v8, p7

    .line 2
    .line 3
    move/from16 v9, p9

    .line 4
    .line 5
    move/from16 v10, p10

    .line 6
    .line 7
    const/4 v0, 0x0

    .line 8
    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    const v2, -0x3dc00740

    .line 13
    .line 14
    .line 15
    move-object/from16 v3, p8

    .line 16
    .line 17
    invoke-interface {v3, v2}, Landroidx/compose/runtime/Composer;->startRestartGroup(I)Landroidx/compose/runtime/Composer;

    .line 18
    .line 19
    .line 20
    move-result-object v14

    .line 21
    and-int/lit8 v3, v10, 0x1

    .line 22
    .line 23
    if-eqz v3, :cond_0

    .line 24
    .line 25
    or-int/lit8 v3, v9, 0x6

    .line 26
    .line 27
    move v5, v3

    .line 28
    move-object/from16 v3, p0

    .line 29
    .line 30
    goto :goto_1

    .line 31
    :cond_0
    and-int/lit8 v3, v9, 0x6

    .line 32
    .line 33
    if-nez v3, :cond_2

    .line 34
    .line 35
    move-object/from16 v3, p0

    .line 36
    .line 37
    invoke-interface {v14, v3}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 38
    .line 39
    .line 40
    move-result v5

    .line 41
    if-eqz v5, :cond_1

    .line 42
    .line 43
    const/4 v5, 0x4

    .line 44
    goto :goto_0

    .line 45
    :cond_1
    const/4 v5, 0x2

    .line 46
    :goto_0
    or-int/2addr v5, v9

    .line 47
    goto :goto_1

    .line 48
    :cond_2
    move-object/from16 v3, p0

    .line 49
    .line 50
    move v5, v9

    .line 51
    :goto_1
    and-int/lit8 v6, v10, 0x2

    .line 52
    .line 53
    if-eqz v6, :cond_4

    .line 54
    .line 55
    or-int/lit8 v5, v5, 0x30

    .line 56
    .line 57
    :cond_3
    move/from16 v6, p1

    .line 58
    .line 59
    goto :goto_3

    .line 60
    :cond_4
    and-int/lit8 v6, v9, 0x30

    .line 61
    .line 62
    if-nez v6, :cond_3

    .line 63
    .line 64
    move/from16 v6, p1

    .line 65
    .line 66
    invoke-interface {v14, v6}, Landroidx/compose/runtime/Composer;->changed(I)Z

    .line 67
    .line 68
    .line 69
    move-result v7

    .line 70
    if-eqz v7, :cond_5

    .line 71
    .line 72
    const/16 v7, 0x20

    .line 73
    .line 74
    goto :goto_2

    .line 75
    :cond_5
    const/16 v7, 0x10

    .line 76
    .line 77
    :goto_2
    or-int/2addr v5, v7

    .line 78
    :goto_3
    and-int/lit8 v7, v10, 0x4

    .line 79
    .line 80
    if-eqz v7, :cond_7

    .line 81
    .line 82
    or-int/lit16 v5, v5, 0x180

    .line 83
    .line 84
    :cond_6
    move/from16 v7, p2

    .line 85
    .line 86
    goto :goto_5

    .line 87
    :cond_7
    and-int/lit16 v7, v9, 0x180

    .line 88
    .line 89
    if-nez v7, :cond_6

    .line 90
    .line 91
    move/from16 v7, p2

    .line 92
    .line 93
    invoke-interface {v14, v7}, Landroidx/compose/runtime/Composer;->changed(I)Z

    .line 94
    .line 95
    .line 96
    move-result v11

    .line 97
    if-eqz v11, :cond_8

    .line 98
    .line 99
    const/16 v11, 0x100

    .line 100
    .line 101
    goto :goto_4

    .line 102
    :cond_8
    const/16 v11, 0x80

    .line 103
    .line 104
    :goto_4
    or-int/2addr v5, v11

    .line 105
    :goto_5
    and-int/lit8 v11, v10, 0x8

    .line 106
    .line 107
    if-eqz v11, :cond_a

    .line 108
    .line 109
    or-int/lit16 v5, v5, 0xc00

    .line 110
    .line 111
    :cond_9
    move-object/from16 v12, p3

    .line 112
    .line 113
    goto :goto_7

    .line 114
    :cond_a
    and-int/lit16 v12, v9, 0xc00

    .line 115
    .line 116
    if-nez v12, :cond_9

    .line 117
    .line 118
    move-object/from16 v12, p3

    .line 119
    .line 120
    invoke-interface {v14, v12}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 121
    .line 122
    .line 123
    move-result v13

    .line 124
    if-eqz v13, :cond_b

    .line 125
    .line 126
    const/16 v13, 0x800

    .line 127
    .line 128
    goto :goto_6

    .line 129
    :cond_b
    const/16 v13, 0x400

    .line 130
    .line 131
    :goto_6
    or-int/2addr v5, v13

    .line 132
    :goto_7
    and-int/lit8 v13, v10, 0x10

    .line 133
    .line 134
    if-eqz v13, :cond_d

    .line 135
    .line 136
    or-int/lit16 v5, v5, 0x6000

    .line 137
    .line 138
    :cond_c
    move-object/from16 v15, p4

    .line 139
    .line 140
    goto :goto_9

    .line 141
    :cond_d
    and-int/lit16 v15, v9, 0x6000

    .line 142
    .line 143
    if-nez v15, :cond_c

    .line 144
    .line 145
    move-object/from16 v15, p4

    .line 146
    .line 147
    invoke-interface {v14, v15}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 148
    .line 149
    .line 150
    move-result v16

    .line 151
    if-eqz v16, :cond_e

    .line 152
    .line 153
    const/16 v16, 0x4000

    .line 154
    .line 155
    goto :goto_8

    .line 156
    :cond_e
    const/16 v16, 0x2000

    .line 157
    .line 158
    :goto_8
    or-int v5, v5, v16

    .line 159
    .line 160
    :goto_9
    and-int/lit8 v16, v10, 0x20

    .line 161
    .line 162
    const/high16 v17, 0x30000

    .line 163
    .line 164
    if-eqz v16, :cond_10

    .line 165
    .line 166
    or-int v5, v5, v17

    .line 167
    .line 168
    :cond_f
    move/from16 v17, v0

    .line 169
    .line 170
    move-object/from16 v0, p5

    .line 171
    .line 172
    goto :goto_b

    .line 173
    :cond_10
    and-int v17, v9, v17

    .line 174
    .line 175
    if-nez v17, :cond_f

    .line 176
    .line 177
    move/from16 v17, v0

    .line 178
    .line 179
    move-object/from16 v0, p5

    .line 180
    .line 181
    invoke-interface {v14, v0}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 182
    .line 183
    .line 184
    move-result v18

    .line 185
    if-eqz v18, :cond_11

    .line 186
    .line 187
    const/high16 v18, 0x20000

    .line 188
    .line 189
    goto :goto_a

    .line 190
    :cond_11
    const/high16 v18, 0x10000

    .line 191
    .line 192
    :goto_a
    or-int v5, v5, v18

    .line 193
    .line 194
    :goto_b
    and-int/lit8 v18, v10, 0x40

    .line 195
    .line 196
    const/high16 v19, 0x180000

    .line 197
    .line 198
    if-eqz v18, :cond_12

    .line 199
    .line 200
    or-int v5, v5, v19

    .line 201
    .line 202
    move/from16 v4, p6

    .line 203
    .line 204
    goto :goto_d

    .line 205
    :cond_12
    and-int v19, v9, v19

    .line 206
    .line 207
    move/from16 v4, p6

    .line 208
    .line 209
    if-nez v19, :cond_14

    .line 210
    .line 211
    invoke-interface {v14, v4}, Landroidx/compose/runtime/Composer;->changed(Z)Z

    .line 212
    .line 213
    .line 214
    move-result v19

    .line 215
    if-eqz v19, :cond_13

    .line 216
    .line 217
    const/high16 v19, 0x100000

    .line 218
    .line 219
    goto :goto_c

    .line 220
    :cond_13
    const/high16 v19, 0x80000

    .line 221
    .line 222
    :goto_c
    or-int v5, v5, v19

    .line 223
    .line 224
    :cond_14
    :goto_d
    and-int/lit16 v2, v10, 0x80

    .line 225
    .line 226
    const/high16 v20, 0xc00000

    .line 227
    .line 228
    if-eqz v2, :cond_15

    .line 229
    .line 230
    or-int v5, v5, v20

    .line 231
    .line 232
    goto :goto_f

    .line 233
    :cond_15
    and-int v2, v9, v20

    .line 234
    .line 235
    if-nez v2, :cond_17

    .line 236
    .line 237
    invoke-interface {v14, v8}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 238
    .line 239
    .line 240
    move-result v2

    .line 241
    if-eqz v2, :cond_16

    .line 242
    .line 243
    const/high16 v2, 0x800000

    .line 244
    .line 245
    goto :goto_e

    .line 246
    :cond_16
    const/high16 v2, 0x400000

    .line 247
    .line 248
    :goto_e
    or-int/2addr v5, v2

    .line 249
    :cond_17
    :goto_f
    const v2, 0x492493

    .line 250
    .line 251
    .line 252
    and-int/2addr v2, v5

    .line 253
    const v0, 0x492492

    .line 254
    .line 255
    .line 256
    if-ne v2, v0, :cond_19

    .line 257
    .line 258
    invoke-interface {v14}, Landroidx/compose/runtime/Composer;->getSkipping()Z

    .line 259
    .line 260
    .line 261
    move-result v0

    .line 262
    if-nez v0, :cond_18

    .line 263
    .line 264
    goto :goto_10

    .line 265
    :cond_18
    invoke-interface {v14}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    .line 266
    .line 267
    .line 268
    move-object/from16 v6, p5

    .line 269
    .line 270
    move v7, v4

    .line 271
    move-object v4, v12

    .line 272
    move-object/from16 v21, v14

    .line 273
    .line 274
    move-object v5, v15

    .line 275
    goto/16 :goto_1c

    .line 276
    .line 277
    :cond_19
    :goto_10
    if-eqz v11, :cond_1a

    .line 278
    .line 279
    const-string v0, "backward"

    .line 280
    .line 281
    goto :goto_11

    .line 282
    :cond_1a
    move-object v0, v12

    .line 283
    :goto_11
    if-eqz v13, :cond_1b

    .line 284
    .line 285
    const-string v2, "forward"

    .line 286
    .line 287
    goto :goto_12

    .line 288
    :cond_1b
    move-object v2, v15

    .line 289
    :goto_12
    if-eqz v16, :cond_1c

    .line 290
    .line 291
    const-string/jumbo v11, "slot"

    .line 292
    .line 293
    .line 294
    move-object/from16 v22, v11

    .line 295
    .line 296
    goto :goto_13

    .line 297
    :cond_1c
    move-object/from16 v22, p5

    .line 298
    .line 299
    :goto_13
    const/16 v20, 0x0

    .line 300
    .line 301
    if-eqz v18, :cond_1d

    .line 302
    .line 303
    move/from16 v23, v20

    .line 304
    .line 305
    goto :goto_14

    .line 306
    :cond_1d
    move/from16 v23, v4

    .line 307
    .line 308
    :goto_14
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 309
    .line 310
    .line 311
    move-result v4

    .line 312
    const/4 v11, -0x1

    .line 313
    if-eqz v4, :cond_1e

    .line 314
    .line 315
    const-string v4, "androidx.constraintlayout.compose.MotionCarousel (MotionCarousel.kt:147)"

    .line 316
    .line 317
    const v12, -0x3dc00740

    .line 318
    .line 319
    .line 320
    invoke-static {v12, v5, v11, v4}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 321
    .line 322
    .line 323
    :cond_1e
    shr-int/lit8 v4, v5, 0x15

    .line 324
    .line 325
    and-int/lit8 v4, v4, 0xe

    .line 326
    .line 327
    invoke-static {v8, v14, v4}, Landroidx/constraintlayout/compose/MotionCarouselKt;->rememberStateOfItemsProvider(Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;

    .line 328
    .line 329
    .line 330
    move-result-object v4

    .line 331
    invoke-interface {v14}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 332
    .line 333
    .line 334
    move-result-object v12

    .line 335
    sget-object v18, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    .line 336
    .line 337
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    .line 338
    .line 339
    .line 340
    move-result-object v13

    .line 341
    if-ne v12, v13, :cond_1f

    .line 342
    .line 343
    const/high16 v12, 0x447a0000    # 1000.0f

    .line 344
    .line 345
    invoke-static {v12}, Landroidx/compose/runtime/PrimitiveSnapshotStateKt;->mutableFloatStateOf(F)Landroidx/compose/runtime/MutableFloatState;

    .line 346
    .line 347
    .line 348
    move-result-object v12

    .line 349
    invoke-interface {v14, v12}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 350
    .line 351
    .line 352
    :cond_1f
    check-cast v12, Landroidx/compose/runtime/MutableFloatState;

    .line 353
    .line 354
    const/4 v15, 0x6

    .line 355
    const/16 v16, 0x6

    .line 356
    .line 357
    const-string/jumbo v27, "start"

    .line 358
    .line 359
    .line 360
    move-object v13, v12

    .line 361
    const/4 v12, 0x0

    .line 362
    move-object/from16 v19, v13

    .line 363
    .line 364
    const/4 v13, 0x0

    .line 365
    move v3, v11

    .line 366
    move-object/from16 p3, v19

    .line 367
    .line 368
    move-object/from16 v11, v27

    .line 369
    .line 370
    invoke-static/range {v11 .. v16}, Landroidx/constraintlayout/compose/carousel/CarouselSwipeableKt;->rememberCarouselSwipeableState(Ljava/lang/Object;Landroidx/compose/animation/core/AnimationSpec;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)Landroidx/constraintlayout/compose/carousel/CarouselSwipeableState;

    .line 371
    .line 372
    .line 373
    move-result-object v12

    .line 374
    invoke-virtual {v12}, Landroidx/constraintlayout/compose/carousel/CarouselSwipeableState;->getOffset()Landroidx/compose/runtime/FloatState;

    .line 375
    .line 376
    .line 377
    move-result-object v13

    .line 378
    invoke-interface {v13}, Landroidx/compose/runtime/FloatState;->getFloatValue()F

    .line 379
    .line 380
    .line 381
    move-result v13

    .line 382
    invoke-static/range {p3 .. p3}, Landroidx/constraintlayout/compose/MotionCarouselKt;->MotionCarousel$lambda$1(Landroidx/compose/runtime/MutableFloatState;)F

    .line 383
    .line 384
    .line 385
    move-result v15

    .line 386
    div-float/2addr v13, v15

    .line 387
    invoke-interface {v14}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 388
    .line 389
    .line 390
    move-result-object v15

    .line 391
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    .line 392
    .line 393
    .line 394
    move-result-object v3

    .line 395
    move/from16 v19, v5

    .line 396
    .line 397
    const/4 v5, 0x0

    .line 398
    if-ne v15, v3, :cond_20

    .line 399
    .line 400
    new-instance v24, Landroidx/constraintlayout/compose/CarouselState;

    .line 401
    .line 402
    sget-object v25, Landroidx/constraintlayout/compose/MotionCarouselDirection;->FORWARD:Landroidx/constraintlayout/compose/MotionCarouselDirection;

    .line 403
    .line 404
    const/16 v28, 0x0

    .line 405
    .line 406
    const/16 v29, 0x0

    .line 407
    .line 408
    const/16 v26, 0x0

    .line 409
    .line 410
    const/16 v27, 0x0

    .line 411
    .line 412
    invoke-direct/range {v24 .. v29}, Landroidx/constraintlayout/compose/CarouselState;-><init>(Landroidx/constraintlayout/compose/MotionCarouselDirection;IIZZ)V

    .line 413
    .line 414
    .line 415
    move-object/from16 v3, v24

    .line 416
    .line 417
    const/4 v15, 0x2

    .line 418
    invoke-static {v3, v5, v15, v5}, Landroidx/compose/runtime/SnapshotStateKt;->mutableStateOf$default(Ljava/lang/Object;Landroidx/compose/runtime/SnapshotMutationPolicy;ILjava/lang/Object;)Landroidx/compose/runtime/MutableState;

    .line 419
    .line 420
    .line 421
    move-result-object v3

    .line 422
    invoke-interface {v14, v3}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 423
    .line 424
    .line 425
    move-object v15, v3

    .line 426
    :cond_20
    move-object/from16 v28, v15

    .line 427
    .line 428
    check-cast v28, Landroidx/compose/runtime/MutableState;

    .line 429
    .line 430
    invoke-interface {v14}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 431
    .line 432
    .line 433
    move-result-object v3

    .line 434
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    .line 435
    .line 436
    .line 437
    move-result-object v15

    .line 438
    if-ne v3, v15, :cond_21

    .line 439
    .line 440
    invoke-static/range {v20 .. v20}, Landroidx/compose/runtime/SnapshotIntStateKt;->mutableIntStateOf(I)Landroidx/compose/runtime/MutableIntState;

    .line 441
    .line 442
    .line 443
    move-result-object v3

    .line 444
    invoke-interface {v14, v3}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 445
    .line 446
    .line 447
    :cond_21
    check-cast v3, Landroidx/compose/runtime/MutableIntState;

    .line 448
    .line 449
    invoke-static {v3}, Landroidx/constraintlayout/compose/MotionCarouselKt;->MotionCarousel$lambda$7(Landroidx/compose/runtime/MutableIntState;)I

    .line 450
    .line 451
    .line 452
    move-result v15

    .line 453
    const/16 p5, 0x1

    .line 454
    .line 455
    const-string/jumbo v5, "next"

    .line 456
    .line 457
    .line 458
    const-string/jumbo v6, "previous"

    .line 459
    .line 460
    .line 461
    if-nez v15, :cond_22

    .line 462
    .line 463
    invoke-static {v1, v11}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 464
    .line 465
    .line 466
    move-result-object v1

    .line 467
    invoke-static/range {p3 .. p3}, Landroidx/constraintlayout/compose/MotionCarouselKt;->MotionCarousel$lambda$1(Landroidx/compose/runtime/MutableFloatState;)F

    .line 468
    .line 469
    .line 470
    move-result v15

    .line 471
    invoke-static {v15}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 472
    .line 473
    .line 474
    move-result-object v15

    .line 475
    invoke-static {v15, v5}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 476
    .line 477
    .line 478
    move-result-object v15

    .line 479
    filled-new-array {v1, v15}, [Lkotlin/Pair;

    .line 480
    .line 481
    .line 482
    move-result-object v1

    .line 483
    invoke-static {v1}, Lkotlin/collections/MapsKt;->mapOf([Lkotlin/Pair;)Ljava/util/Map;

    .line 484
    .line 485
    .line 486
    move-result-object v1

    .line 487
    goto :goto_15

    .line 488
    :cond_22
    invoke-static {v3}, Landroidx/constraintlayout/compose/MotionCarouselKt;->MotionCarousel$lambda$7(Landroidx/compose/runtime/MutableIntState;)I

    .line 489
    .line 490
    .line 491
    move-result v15

    .line 492
    invoke-interface {v4}, Landroidx/compose/runtime/State;->getValue()Ljava/lang/Object;

    .line 493
    .line 494
    .line 495
    move-result-object v20

    .line 496
    check-cast v20, Landroidx/constraintlayout/compose/MotionItemsProvider;

    .line 497
    .line 498
    invoke-interface/range {v20 .. v20}, Landroidx/constraintlayout/compose/MotionItemsProvider;->count()I

    .line 499
    .line 500
    .line 501
    move-result v20

    .line 502
    add-int/lit8 v7, v20, -0x1

    .line 503
    .line 504
    if-ne v15, v7, :cond_23

    .line 505
    .line 506
    invoke-static/range {p3 .. p3}, Landroidx/constraintlayout/compose/MotionCarouselKt;->MotionCarousel$lambda$1(Landroidx/compose/runtime/MutableFloatState;)F

    .line 507
    .line 508
    .line 509
    move-result v7

    .line 510
    neg-float v7, v7

    .line 511
    invoke-static {v7}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 512
    .line 513
    .line 514
    move-result-object v7

    .line 515
    invoke-static {v7, v6}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 516
    .line 517
    .line 518
    move-result-object v7

    .line 519
    invoke-static {v1, v11}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 520
    .line 521
    .line 522
    move-result-object v1

    .line 523
    filled-new-array {v7, v1}, [Lkotlin/Pair;

    .line 524
    .line 525
    .line 526
    move-result-object v1

    .line 527
    invoke-static {v1}, Lkotlin/collections/MapsKt;->mapOf([Lkotlin/Pair;)Ljava/util/Map;

    .line 528
    .line 529
    .line 530
    move-result-object v1

    .line 531
    goto :goto_15

    .line 532
    :cond_23
    invoke-static/range {p3 .. p3}, Landroidx/constraintlayout/compose/MotionCarouselKt;->MotionCarousel$lambda$1(Landroidx/compose/runtime/MutableFloatState;)F

    .line 533
    .line 534
    .line 535
    move-result v7

    .line 536
    neg-float v7, v7

    .line 537
    invoke-static {v7}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 538
    .line 539
    .line 540
    move-result-object v7

    .line 541
    invoke-static {v7, v6}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 542
    .line 543
    .line 544
    move-result-object v7

    .line 545
    invoke-static {v1, v11}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 546
    .line 547
    .line 548
    move-result-object v1

    .line 549
    invoke-static/range {p3 .. p3}, Landroidx/constraintlayout/compose/MotionCarouselKt;->MotionCarousel$lambda$1(Landroidx/compose/runtime/MutableFloatState;)F

    .line 550
    .line 551
    .line 552
    move-result v15

    .line 553
    invoke-static {v15}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 554
    .line 555
    .line 556
    move-result-object v15

    .line 557
    invoke-static {v15, v5}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 558
    .line 559
    .line 560
    move-result-object v15

    .line 561
    filled-new-array {v7, v1, v15}, [Lkotlin/Pair;

    .line 562
    .line 563
    .line 564
    move-result-object v1

    .line 565
    invoke-static {v1}, Lkotlin/collections/MapsKt;->mapOf([Lkotlin/Pair;)Ljava/util/Map;

    .line 566
    .line 567
    .line 568
    move-result-object v1

    .line 569
    :goto_15
    invoke-interface {v14}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 570
    .line 571
    .line 572
    move-result-object v7

    .line 573
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    .line 574
    .line 575
    .line 576
    move-result-object v15

    .line 577
    if-ne v7, v15, :cond_24

    .line 578
    .line 579
    move-object/from16 p6, v1

    .line 580
    .line 581
    const/4 v1, 0x0

    .line 582
    const/4 v15, 0x2

    .line 583
    invoke-static {v2, v1, v15, v1}, Landroidx/compose/runtime/SnapshotStateKt;->mutableStateOf$default(Ljava/lang/Object;Landroidx/compose/runtime/SnapshotMutationPolicy;ILjava/lang/Object;)Landroidx/compose/runtime/MutableState;

    .line 584
    .line 585
    .line 586
    move-result-object v7

    .line 587
    invoke-interface {v14, v7}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 588
    .line 589
    .line 590
    goto :goto_16

    .line 591
    :cond_24
    move-object/from16 p6, v1

    .line 592
    .line 593
    :goto_16
    check-cast v7, Landroidx/compose/runtime/MutableState;

    .line 594
    .line 595
    cmpg-float v1, v13, v17

    .line 596
    .line 597
    if-gez v1, :cond_25

    .line 598
    .line 599
    invoke-static/range {v28 .. v28}, Landroidx/constraintlayout/compose/MotionCarouselKt;->MotionCarousel$lambda$4(Landroidx/compose/runtime/MutableState;)Landroidx/constraintlayout/compose/CarouselState;

    .line 600
    .line 601
    .line 602
    move-result-object v1

    .line 603
    invoke-virtual {v1}, Landroidx/constraintlayout/compose/CarouselState;->getIndex()I

    .line 604
    .line 605
    .line 606
    move-result v1

    .line 607
    if-lez v1, :cond_25

    .line 608
    .line 609
    invoke-static/range {v28 .. v28}, Landroidx/constraintlayout/compose/MotionCarouselKt;->MotionCarousel$lambda$4(Landroidx/compose/runtime/MutableState;)Landroidx/constraintlayout/compose/CarouselState;

    .line 610
    .line 611
    .line 612
    move-result-object v1

    .line 613
    sget-object v15, Landroidx/constraintlayout/compose/MotionCarouselDirection;->BACKWARD:Landroidx/constraintlayout/compose/MotionCarouselDirection;

    .line 614
    .line 615
    invoke-virtual {v1, v15}, Landroidx/constraintlayout/compose/CarouselState;->setDirection(Landroidx/constraintlayout/compose/MotionCarouselDirection;)V

    .line 616
    .line 617
    .line 618
    invoke-interface {v7, v0}, Landroidx/compose/runtime/MutableState;->setValue(Ljava/lang/Object;)V

    .line 619
    .line 620
    .line 621
    const/4 v1, -0x1

    .line 622
    int-to-float v1, v1

    .line 623
    mul-float/2addr v13, v1

    .line 624
    goto :goto_17

    .line 625
    :cond_25
    invoke-static/range {v28 .. v28}, Landroidx/constraintlayout/compose/MotionCarouselKt;->MotionCarousel$lambda$4(Landroidx/compose/runtime/MutableState;)Landroidx/constraintlayout/compose/CarouselState;

    .line 626
    .line 627
    .line 628
    move-result-object v1

    .line 629
    sget-object v15, Landroidx/constraintlayout/compose/MotionCarouselDirection;->FORWARD:Landroidx/constraintlayout/compose/MotionCarouselDirection;

    .line 630
    .line 631
    invoke-virtual {v1, v15}, Landroidx/constraintlayout/compose/CarouselState;->setDirection(Landroidx/constraintlayout/compose/MotionCarouselDirection;)V

    .line 632
    .line 633
    .line 634
    invoke-interface {v7, v2}, Landroidx/compose/runtime/MutableState;->setValue(Ljava/lang/Object;)V

    .line 635
    .line 636
    .line 637
    :goto_17
    const v1, 0x4543ab46

    .line 638
    .line 639
    .line 640
    invoke-interface {v14, v1}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    .line 641
    .line 642
    .line 643
    invoke-virtual {v12}, Landroidx/constraintlayout/compose/carousel/CarouselSwipeableState;->isAnimationRunning()Z

    .line 644
    .line 645
    .line 646
    move-result v1

    .line 647
    if-nez v1, :cond_2c

    .line 648
    .line 649
    invoke-static/range {v28 .. v28}, Landroidx/constraintlayout/compose/MotionCarouselKt;->MotionCarousel$lambda$4(Landroidx/compose/runtime/MutableState;)Landroidx/constraintlayout/compose/CarouselState;

    .line 650
    .line 651
    .line 652
    move-result-object v1

    .line 653
    invoke-virtual {v1}, Landroidx/constraintlayout/compose/CarouselState;->getDirection()Landroidx/constraintlayout/compose/MotionCarouselDirection;

    .line 654
    .line 655
    .line 656
    move-result-object v1

    .line 657
    sget-object v15, Landroidx/constraintlayout/compose/MotionCarouselDirection;->FORWARD:Landroidx/constraintlayout/compose/MotionCarouselDirection;

    .line 658
    .line 659
    move-object/from16 p8, v0

    .line 660
    .line 661
    const/4 v0, 0x6

    .line 662
    if-ne v1, v15, :cond_28

    .line 663
    .line 664
    invoke-virtual {v12}, Landroidx/constraintlayout/compose/carousel/CarouselSwipeableState;->getCurrentValue()Ljava/lang/Object;

    .line 665
    .line 666
    .line 667
    move-result-object v1

    .line 668
    check-cast v1, Ljava/lang/String;

    .line 669
    .line 670
    invoke-virtual {v1, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 671
    .line 672
    .line 673
    move-result v1

    .line 674
    if-eqz v1, :cond_28

    .line 675
    .line 676
    const v1, 0x633476dd

    .line 677
    .line 678
    .line 679
    invoke-interface {v14, v1}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    .line 680
    .line 681
    .line 682
    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 683
    .line 684
    invoke-interface {v14, v4}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 685
    .line 686
    .line 687
    move-result v5

    .line 688
    invoke-interface {v14, v12}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 689
    .line 690
    .line 691
    move-result v6

    .line 692
    or-int/2addr v5, v6

    .line 693
    invoke-interface {v14}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 694
    .line 695
    .line 696
    move-result-object v6

    .line 697
    if-nez v5, :cond_27

    .line 698
    .line 699
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    .line 700
    .line 701
    .line 702
    move-result-object v5

    .line 703
    if-ne v6, v5, :cond_26

    .line 704
    .line 705
    goto :goto_18

    .line 706
    :cond_26
    move-object/from16 v21, v4

    .line 707
    .line 708
    move-object v4, v12

    .line 709
    move-object/from16 v15, v28

    .line 710
    .line 711
    goto :goto_19

    .line 712
    :cond_27
    :goto_18
    new-instance v24, Landroidx/constraintlayout/compose/MotionCarouselKt$MotionCarousel$1$1;

    .line 713
    .line 714
    const/16 v29, 0x0

    .line 715
    .line 716
    move-object/from16 v25, v4

    .line 717
    .line 718
    move-object/from16 v27, v11

    .line 719
    .line 720
    move-object/from16 v26, v12

    .line 721
    .line 722
    invoke-direct/range {v24 .. v29}, Landroidx/constraintlayout/compose/MotionCarouselKt$MotionCarousel$1$1;-><init>(Landroidx/compose/runtime/State;Landroidx/constraintlayout/compose/carousel/CarouselSwipeableState;Ljava/lang/String;Landroidx/compose/runtime/MutableState;Lkotlin/coroutines/Continuation;)V

    .line 723
    .line 724
    .line 725
    move-object/from16 v6, v24

    .line 726
    .line 727
    move-object/from16 v21, v25

    .line 728
    .line 729
    move-object/from16 v4, v26

    .line 730
    .line 731
    move-object/from16 v15, v28

    .line 732
    .line 733
    invoke-interface {v14, v6}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 734
    .line 735
    .line 736
    :goto_19
    check-cast v6, Lkotlin/jvm/functions/Function2;

    .line 737
    .line 738
    invoke-static {v1, v6, v14, v0}, Landroidx/compose/runtime/EffectsKt;->LaunchedEffect(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V

    .line 739
    .line 740
    .line 741
    invoke-interface {v14}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    .line 742
    .line 743
    .line 744
    goto :goto_1a

    .line 745
    :cond_28
    move-object/from16 v21, v4

    .line 746
    .line 747
    move-object v4, v12

    .line 748
    move-object/from16 v15, v28

    .line 749
    .line 750
    invoke-static {v15}, Landroidx/constraintlayout/compose/MotionCarouselKt;->MotionCarousel$lambda$4(Landroidx/compose/runtime/MutableState;)Landroidx/constraintlayout/compose/CarouselState;

    .line 751
    .line 752
    .line 753
    move-result-object v1

    .line 754
    invoke-virtual {v1}, Landroidx/constraintlayout/compose/CarouselState;->getDirection()Landroidx/constraintlayout/compose/MotionCarouselDirection;

    .line 755
    .line 756
    .line 757
    move-result-object v1

    .line 758
    sget-object v5, Landroidx/constraintlayout/compose/MotionCarouselDirection;->BACKWARD:Landroidx/constraintlayout/compose/MotionCarouselDirection;

    .line 759
    .line 760
    if-ne v1, v5, :cond_2b

    .line 761
    .line 762
    invoke-virtual {v4}, Landroidx/constraintlayout/compose/carousel/CarouselSwipeableState;->getCurrentValue()Ljava/lang/Object;

    .line 763
    .line 764
    .line 765
    move-result-object v1

    .line 766
    check-cast v1, Ljava/lang/String;

    .line 767
    .line 768
    invoke-virtual {v1, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 769
    .line 770
    .line 771
    move-result v1

    .line 772
    if-eqz v1, :cond_2b

    .line 773
    .line 774
    const v1, 0x633b78de

    .line 775
    .line 776
    .line 777
    invoke-interface {v14, v1}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    .line 778
    .line 779
    .line 780
    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 781
    .line 782
    invoke-interface {v14, v4}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 783
    .line 784
    .line 785
    move-result v5

    .line 786
    invoke-interface {v14}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 787
    .line 788
    .line 789
    move-result-object v6

    .line 790
    if-nez v5, :cond_29

    .line 791
    .line 792
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    .line 793
    .line 794
    .line 795
    move-result-object v5

    .line 796
    if-ne v6, v5, :cond_2a

    .line 797
    .line 798
    :cond_29
    new-instance v6, Landroidx/constraintlayout/compose/MotionCarouselKt$MotionCarousel$2$1;

    .line 799
    .line 800
    const/4 v5, 0x0

    .line 801
    invoke-direct {v6, v4, v11, v15, v5}, Landroidx/constraintlayout/compose/MotionCarouselKt$MotionCarousel$2$1;-><init>(Landroidx/constraintlayout/compose/carousel/CarouselSwipeableState;Ljava/lang/String;Landroidx/compose/runtime/MutableState;Lkotlin/coroutines/Continuation;)V

    .line 802
    .line 803
    .line 804
    invoke-interface {v14, v6}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 805
    .line 806
    .line 807
    :cond_2a
    check-cast v6, Lkotlin/jvm/functions/Function2;

    .line 808
    .line 809
    invoke-static {v1, v6, v14, v0}, Landroidx/compose/runtime/EffectsKt;->LaunchedEffect(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V

    .line 810
    .line 811
    .line 812
    invoke-interface {v14}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    .line 813
    .line 814
    .line 815
    goto :goto_1a

    .line 816
    :cond_2b
    const v0, 0x633f75ee

    .line 817
    .line 818
    .line 819
    invoke-interface {v14, v0}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    .line 820
    .line 821
    .line 822
    invoke-interface {v14}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    .line 823
    .line 824
    .line 825
    :goto_1a
    invoke-static {v15}, Landroidx/constraintlayout/compose/MotionCarouselKt;->MotionCarousel$lambda$4(Landroidx/compose/runtime/MutableState;)Landroidx/constraintlayout/compose/CarouselState;

    .line 826
    .line 827
    .line 828
    move-result-object v0

    .line 829
    invoke-virtual {v0}, Landroidx/constraintlayout/compose/CarouselState;->getIndex()I

    .line 830
    .line 831
    .line 832
    move-result v0

    .line 833
    invoke-static {v3, v0}, Landroidx/constraintlayout/compose/MotionCarouselKt;->MotionCarousel$lambda$8(Landroidx/compose/runtime/MutableIntState;I)V

    .line 834
    .line 835
    .line 836
    goto :goto_1b

    .line 837
    :cond_2c
    move-object/from16 p8, v0

    .line 838
    .line 839
    move-object/from16 v21, v4

    .line 840
    .line 841
    move-object v4, v12

    .line 842
    :goto_1b
    invoke-interface {v14}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    .line 843
    .line 844
    .line 845
    invoke-interface {v7}, Landroidx/compose/runtime/MutableState;->getValue()Ljava/lang/Object;

    .line 846
    .line 847
    .line 848
    move-result-object v0

    .line 849
    check-cast v0, Ljava/lang/String;

    .line 850
    .line 851
    sget-object v1, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    .line 852
    .line 853
    move/from16 v7, p5

    .line 854
    .line 855
    move/from16 v5, v17

    .line 856
    .line 857
    const/4 v6, 0x0

    .line 858
    invoke-static {v1, v5, v7, v6}, Landroidx/compose/foundation/layout/SizeKt;->fillMaxSize$default(Landroidx/compose/ui/Modifier;FILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    .line 859
    .line 860
    .line 861
    move-result-object v24

    .line 862
    sget-object v1, Landroidx/compose/ui/graphics/Color;->Companion:Landroidx/compose/ui/graphics/Color$Companion;

    .line 863
    .line 864
    invoke-virtual {v1}, Landroidx/compose/ui/graphics/Color$Companion;->getWhite-0d7_KjU()J

    .line 865
    .line 866
    .line 867
    move-result-wide v25

    .line 868
    const/16 v28, 0x2

    .line 869
    .line 870
    const/16 v29, 0x0

    .line 871
    .line 872
    const/16 v27, 0x0

    .line 873
    .line 874
    invoke-static/range {v24 .. v29}, Landroidx/compose/foundation/BackgroundKt;->background-bw27NRU$default(Landroidx/compose/ui/Modifier;JLandroidx/compose/ui/graphics/Shape;ILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    .line 875
    .line 876
    .line 877
    move-result-object v24

    .line 878
    sget-object v27, Landroidx/compose/foundation/gestures/Orientation;->Horizontal:Landroidx/compose/foundation/gestures/Orientation;

    .line 879
    .line 880
    sget-object v31, Landroidx/constraintlayout/compose/MotionCarouselKt$MotionCarousel$3;->INSTANCE:Landroidx/constraintlayout/compose/MotionCarouselKt$MotionCarousel$3;

    .line 881
    .line 882
    const/16 v34, 0x1a8

    .line 883
    .line 884
    const/16 v35, 0x0

    .line 885
    .line 886
    const/16 v28, 0x0

    .line 887
    .line 888
    const/16 v29, 0x1

    .line 889
    .line 890
    const/16 v30, 0x0

    .line 891
    .line 892
    const/16 v32, 0x0

    .line 893
    .line 894
    const/16 v33, 0x0

    .line 895
    .line 896
    move-object/from16 v26, p6

    .line 897
    .line 898
    move-object/from16 v25, v4

    .line 899
    .line 900
    invoke-static/range {v24 .. v35}, Landroidx/constraintlayout/compose/carousel/CarouselSwipeableKt;->carouselSwipeable-pPrIpRY$default(Landroidx/compose/ui/Modifier;Landroidx/constraintlayout/compose/carousel/CarouselSwipeableState;Ljava/util/Map;Landroidx/compose/foundation/gestures/Orientation;ZZLandroidx/compose/foundation/interaction/MutableInteractionSource;Lkotlin/jvm/functions/Function2;Landroidx/constraintlayout/compose/carousel/ResistanceConfig;FILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    .line 901
    .line 902
    .line 903
    move-result-object v1

    .line 904
    invoke-interface {v14}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 905
    .line 906
    .line 907
    move-result-object v4

    .line 908
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    .line 909
    .line 910
    .line 911
    move-result-object v5

    .line 912
    if-ne v4, v5, :cond_2d

    .line 913
    .line 914
    new-instance v4, Landroidx/constraintlayout/compose/MotionCarouselKt$MotionCarousel$4$1;

    .line 915
    .line 916
    move-object/from16 v12, p3

    .line 917
    .line 918
    invoke-direct {v4, v12}, Landroidx/constraintlayout/compose/MotionCarouselKt$MotionCarousel$4$1;-><init>(Landroidx/compose/runtime/MutableFloatState;)V

    .line 919
    .line 920
    .line 921
    invoke-interface {v14, v4}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 922
    .line 923
    .line 924
    :cond_2d
    check-cast v4, Lkotlin/jvm/functions/Function1;

    .line 925
    .line 926
    invoke-static {v1, v4}, Landroidx/compose/ui/layout/OnRemeasuredModifierKt;->onSizeChanged(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/Modifier;

    .line 927
    .line 928
    .line 929
    move-result-object v1

    .line 930
    sget-object v4, Landroidx/constraintlayout/compose/DebugFlags;->Companion:Landroidx/constraintlayout/compose/DebugFlags$Companion;

    .line 931
    .line 932
    invoke-virtual {v4}, Landroidx/constraintlayout/compose/DebugFlags$Companion;->getNone-bfy_xzQ()I

    .line 933
    .line 934
    .line 935
    move-result v4

    .line 936
    sget-object v5, Landroidx/constraintlayout/compose/InvalidationStrategy;->Companion:Landroidx/constraintlayout/compose/InvalidationStrategy$Companion;

    .line 937
    .line 938
    invoke-virtual {v5}, Landroidx/constraintlayout/compose/InvalidationStrategy$Companion;->getDefaultInvalidationStrategy()Landroidx/constraintlayout/compose/InvalidationStrategy;

    .line 939
    .line 940
    .line 941
    move-result-object v17

    .line 942
    invoke-interface {v14}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 943
    .line 944
    .line 945
    move-result-object v5

    .line 946
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    .line 947
    .line 948
    .line 949
    move-result-object v6

    .line 950
    if-ne v5, v6, :cond_2e

    .line 951
    .line 952
    sget-object v5, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 953
    .line 954
    invoke-static {}, Landroidx/compose/runtime/SnapshotStateKt;->neverEqualPolicy()Landroidx/compose/runtime/SnapshotMutationPolicy;

    .line 955
    .line 956
    .line 957
    move-result-object v6

    .line 958
    invoke-static {v5, v6}, Landroidx/compose/runtime/SnapshotStateKt;->mutableStateOf(Ljava/lang/Object;Landroidx/compose/runtime/SnapshotMutationPolicy;)Landroidx/compose/runtime/MutableState;

    .line 959
    .line 960
    .line 961
    move-result-object v5

    .line 962
    invoke-interface {v14, v5}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 963
    .line 964
    .line 965
    :cond_2e
    move-object/from16 v16, v5

    .line 966
    .line 967
    check-cast v16, Landroidx/compose/runtime/MutableState;

    .line 968
    .line 969
    invoke-interface {v14}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 970
    .line 971
    .line 972
    move-result-object v5

    .line 973
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    .line 974
    .line 975
    .line 976
    move-result-object v6

    .line 977
    if-ne v5, v6, :cond_2f

    .line 978
    .line 979
    new-instance v5, Landroidx/compose/ui/node/Ref;

    .line 980
    .line 981
    invoke-direct {v5}, Landroidx/compose/ui/node/Ref;-><init>()V

    .line 982
    .line 983
    .line 984
    sget-object v6, Landroidx/constraintlayout/compose/CompositionSource;->Unknown:Landroidx/constraintlayout/compose/CompositionSource;

    .line 985
    .line 986
    invoke-virtual {v5, v6}, Landroidx/compose/ui/node/Ref;->setValue(Ljava/lang/Object;)V

    .line 987
    .line 988
    .line 989
    invoke-interface {v14, v5}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 990
    .line 991
    .line 992
    :cond_2f
    move-object/from16 v18, v5

    .line 993
    .line 994
    check-cast v18, Landroidx/compose/ui/node/Ref;

    .line 995
    .line 996
    new-instance v15, Landroidx/constraintlayout/compose/MotionCarouselKt$MotionCarousel$$inlined$MotionLayout-6oYECBM$1;

    .line 997
    .line 998
    move/from16 v20, p1

    .line 999
    .line 1000
    move-object/from16 v25, v3

    .line 1001
    .line 1002
    move/from16 v24, v19

    .line 1003
    .line 1004
    move/from16 v19, p2

    .line 1005
    .line 1006
    invoke-direct/range {v15 .. v25}, Landroidx/constraintlayout/compose/MotionCarouselKt$MotionCarousel$$inlined$MotionLayout-6oYECBM$1;-><init>(Landroidx/compose/runtime/MutableState;Landroidx/constraintlayout/compose/InvalidationStrategy;Landroidx/compose/ui/node/Ref;IILandroidx/compose/runtime/State;Ljava/lang/String;ZILandroidx/compose/runtime/MutableIntState;)V

    .line 1007
    .line 1008
    .line 1009
    move-object/from16 v3, v22

    .line 1010
    .line 1011
    const/16 v5, 0x36

    .line 1012
    .line 1013
    const v6, -0x163cbd7

    .line 1014
    .line 1015
    .line 1016
    const/4 v7, 0x1

    .line 1017
    invoke-static {v6, v7, v15, v14, v5}, Landroidx/compose/runtime/internal/ComposableLambdaKt;->rememberComposableLambda(IZLjava/lang/Object;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/internal/ComposableLambda;

    .line 1018
    .line 1019
    .line 1020
    move-result-object v20

    .line 1021
    const/high16 v5, 0x30180000

    .line 1022
    .line 1023
    and-int/lit8 v6, v24, 0xe

    .line 1024
    .line 1025
    or-int/2addr v5, v6

    .line 1026
    sget v6, Landroidx/compose/ui/node/Ref;->$stable:I

    .line 1027
    .line 1028
    shl-int/lit8 v6, v6, 0x15

    .line 1029
    .line 1030
    or-int v22, v5, v6

    .line 1031
    .line 1032
    move-object/from16 v21, v14

    .line 1033
    .line 1034
    const/16 v14, 0x101

    .line 1035
    .line 1036
    move-object/from16 v11, p0

    .line 1037
    .line 1038
    move v15, v4

    .line 1039
    move v12, v13

    .line 1040
    move-object/from16 v19, v17

    .line 1041
    .line 1042
    move-object v13, v0

    .line 1043
    move-object/from16 v17, v16

    .line 1044
    .line 1045
    move-object/from16 v16, v1

    .line 1046
    .line 1047
    invoke-static/range {v11 .. v22}, Landroidx/constraintlayout/compose/MotionLayoutKt;->MotionLayoutCore-SehEMGo(Landroidx/constraintlayout/compose/MotionScene;FLjava/lang/String;IILandroidx/compose/ui/Modifier;Landroidx/compose/runtime/MutableState;Landroidx/compose/ui/node/Ref;Landroidx/constraintlayout/compose/InvalidationStrategy;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;I)V

    .line 1048
    .line 1049
    .line 1050
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 1051
    .line 1052
    .line 1053
    move-result v0

    .line 1054
    if-eqz v0, :cond_30

    .line 1055
    .line 1056
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 1057
    .line 1058
    .line 1059
    :cond_30
    move-object/from16 v4, p8

    .line 1060
    .line 1061
    move-object v5, v2

    .line 1062
    move-object v6, v3

    .line 1063
    move/from16 v7, v23

    .line 1064
    .line 1065
    :goto_1c
    invoke-interface/range {v21 .. v21}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    .line 1066
    .line 1067
    .line 1068
    move-result-object v11

    .line 1069
    if-eqz v11, :cond_31

    .line 1070
    .line 1071
    new-instance v0, Landroidx/constraintlayout/compose/MotionCarouselKt$MotionCarousel$6;

    .line 1072
    .line 1073
    move-object/from16 v1, p0

    .line 1074
    .line 1075
    move/from16 v2, p1

    .line 1076
    .line 1077
    move/from16 v3, p2

    .line 1078
    .line 1079
    invoke-direct/range {v0 .. v10}, Landroidx/constraintlayout/compose/MotionCarouselKt$MotionCarousel$6;-><init>(Landroidx/constraintlayout/compose/MotionScene;IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLkotlin/jvm/functions/Function1;II)V

    .line 1080
    .line 1081
    .line 1082
    invoke-interface {v11, v0}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lkotlin/jvm/functions/Function2;)V

    .line 1083
    .line 1084
    .line 1085
    :cond_31
    return-void
.end method

.method private static final MotionCarousel$lambda$1(Landroidx/compose/runtime/MutableFloatState;)F
    .locals 0

    .line 1
    invoke-interface {p0}, Landroidx/compose/runtime/FloatState;->getFloatValue()F

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method

.method private static final MotionCarousel$lambda$2(Landroidx/compose/runtime/MutableFloatState;F)V
    .locals 0

    .line 1
    invoke-interface {p0, p1}, Landroidx/compose/runtime/MutableFloatState;->setFloatValue(F)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private static final MotionCarousel$lambda$4(Landroidx/compose/runtime/MutableState;)Landroidx/constraintlayout/compose/CarouselState;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/runtime/MutableState<",
            "Landroidx/constraintlayout/compose/CarouselState;",
            ">;)",
            "Landroidx/constraintlayout/compose/CarouselState;"
        }
    .end annotation

    .line 1
    invoke-interface {p0}, Landroidx/compose/runtime/State;->getValue()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    check-cast p0, Landroidx/constraintlayout/compose/CarouselState;

    .line 6
    .line 7
    return-object p0
.end method

.method private static final MotionCarousel$lambda$5(Landroidx/compose/runtime/MutableState;Landroidx/constraintlayout/compose/CarouselState;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/runtime/MutableState<",
            "Landroidx/constraintlayout/compose/CarouselState;",
            ">;",
            "Landroidx/constraintlayout/compose/CarouselState;",
            ")V"
        }
    .end annotation

    .line 1
    invoke-interface {p0, p1}, Landroidx/compose/runtime/MutableState;->setValue(Ljava/lang/Object;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private static final MotionCarousel$lambda$7(Landroidx/compose/runtime/MutableIntState;)I
    .locals 0

    .line 1
    invoke-interface {p0}, Landroidx/compose/runtime/IntState;->getIntValue()I

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method

.method private static final MotionCarousel$lambda$8(Landroidx/compose/runtime/MutableIntState;I)V
    .locals 0

    .line 1
    invoke-interface {p0, p1}, Landroidx/compose/runtime/MutableIntState;->setIntValue(I)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static final synthetic access$MotionCarousel$lambda$2(Landroidx/compose/runtime/MutableFloatState;F)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Landroidx/constraintlayout/compose/MotionCarouselKt;->MotionCarousel$lambda$2(Landroidx/compose/runtime/MutableFloatState;F)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static final synthetic access$MotionCarousel$lambda$4(Landroidx/compose/runtime/MutableState;)Landroidx/constraintlayout/compose/CarouselState;
    .locals 0

    .line 1
    invoke-static {p0}, Landroidx/constraintlayout/compose/MotionCarouselKt;->MotionCarousel$lambda$4(Landroidx/compose/runtime/MutableState;)Landroidx/constraintlayout/compose/CarouselState;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static final synthetic access$MotionCarousel$lambda$7(Landroidx/compose/runtime/MutableIntState;)I
    .locals 0

    .line 1
    invoke-static {p0}, Landroidx/constraintlayout/compose/MotionCarouselKt;->MotionCarousel$lambda$7(Landroidx/compose/runtime/MutableIntState;)I

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method

.method public static final items(Landroidx/constraintlayout/compose/MotionCarouselScope;Ljava/util/List;Lkotlin/jvm/functions/Function3;)V
    .locals 2
    .annotation build Landroidx/compose/runtime/ComposableInferredTarget;
        scheme = "[0[0]]"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Landroidx/constraintlayout/compose/MotionCarouselScope;",
            "Ljava/util/List<",
            "+TT;>;",
            "Lkotlin/jvm/functions/Function3<",
            "-TT;-",
            "Landroidx/compose/runtime/Composer;",
            "-",
            "Ljava/lang/Integer;",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation

    .line 1
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    new-instance v1, Landroidx/constraintlayout/compose/MotionCarouselKt$items$1;

    .line 6
    .line 7
    invoke-direct {v1, p2, p1}, Landroidx/constraintlayout/compose/MotionCarouselKt$items$1;-><init>(Lkotlin/jvm/functions/Function3;Ljava/util/List;)V

    .line 8
    .line 9
    .line 10
    const p1, 0x51a8316

    .line 11
    .line 12
    .line 13
    const/4 p2, 0x1

    .line 14
    invoke-static {p1, p2, v1}, Landroidx/compose/runtime/internal/ComposableLambdaKt;->composableLambdaInstance(IZLjava/lang/Object;)Landroidx/compose/runtime/internal/ComposableLambda;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    invoke-interface {p0, v0, p1}, Landroidx/constraintlayout/compose/MotionCarouselScope;->items(ILkotlin/jvm/functions/Function3;)V

    .line 19
    .line 20
    .line 21
    return-void
.end method

.method public static final itemsWithProperties(Landroidx/constraintlayout/compose/MotionCarouselScope;Ljava/util/List;Lkotlin/jvm/functions/Function4;)V
    .locals 2
    .annotation build Landroidx/compose/runtime/ComposableInferredTarget;
        scheme = "[0[0]]"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Landroidx/constraintlayout/compose/MotionCarouselScope;",
            "Ljava/util/List<",
            "+TT;>;",
            "Lkotlin/jvm/functions/Function4<",
            "-TT;-",
            "Landroidx/compose/runtime/State<",
            "Landroidx/constraintlayout/compose/MotionLayoutScope$MotionProperties;",
            ">;-",
            "Landroidx/compose/runtime/Composer;",
            "-",
            "Ljava/lang/Integer;",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation

    .line 1
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    new-instance v1, Landroidx/constraintlayout/compose/MotionCarouselKt$itemsWithProperties$1;

    .line 6
    .line 7
    invoke-direct {v1, p2, p1}, Landroidx/constraintlayout/compose/MotionCarouselKt$itemsWithProperties$1;-><init>(Lkotlin/jvm/functions/Function4;Ljava/util/List;)V

    .line 8
    .line 9
    .line 10
    const p1, 0x4dbc1840    # 3.9446323E8f

    .line 11
    .line 12
    .line 13
    const/4 p2, 0x1

    .line 14
    invoke-static {p1, p2, v1}, Landroidx/compose/runtime/internal/ComposableLambdaKt;->composableLambdaInstance(IZLjava/lang/Object;)Landroidx/compose/runtime/internal/ComposableLambda;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    invoke-interface {p0, v0, p1}, Landroidx/constraintlayout/compose/MotionCarouselScope;->itemsWithProperties(ILkotlin/jvm/functions/Function4;)V

    .line 19
    .line 20
    .line 21
    return-void
.end method

.method private static final rememberStateOfItemsProvider(Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;
    .locals 3
    .annotation build Landroidx/compose/runtime/Composable;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Landroidx/constraintlayout/compose/MotionCarouselScope;",
            "Lkotlin/Unit;",
            ">;",
            "Landroidx/compose/runtime/Composer;",
            "I)",
            "Landroidx/compose/runtime/State<",
            "Landroidx/constraintlayout/compose/MotionItemsProvider;",
            ">;"
        }
    .end annotation

    .line 1
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    const/4 v0, -0x1

    .line 8
    const-string v1, "androidx.constraintlayout.compose.rememberStateOfItemsProvider (MotionCarousel.kt:307)"

    .line 9
    .line 10
    const v2, 0x59e05de2

    .line 11
    .line 12
    .line 13
    invoke-static {v2, p2, v0, v1}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 14
    .line 15
    .line 16
    :cond_0
    and-int/lit8 p2, p2, 0xe

    .line 17
    .line 18
    invoke-static {p0, p1, p2}, Landroidx/compose/runtime/SnapshotStateKt;->rememberUpdatedState(Ljava/lang/Object;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    invoke-interface {p1}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object p2

    .line 26
    sget-object v0, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    .line 27
    .line 28
    invoke-virtual {v0}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    if-ne p2, v0, :cond_1

    .line 33
    .line 34
    new-instance p2, Landroidx/constraintlayout/compose/MotionCarouselKt$rememberStateOfItemsProvider$1$1;

    .line 35
    .line 36
    invoke-direct {p2, p0}, Landroidx/constraintlayout/compose/MotionCarouselKt$rememberStateOfItemsProvider$1$1;-><init>(Landroidx/compose/runtime/State;)V

    .line 37
    .line 38
    .line 39
    invoke-static {p2}, Landroidx/compose/runtime/SnapshotStateKt;->derivedStateOf(Lkotlin/jvm/functions/Function0;)Landroidx/compose/runtime/State;

    .line 40
    .line 41
    .line 42
    move-result-object p2

    .line 43
    invoke-interface {p1, p2}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 44
    .line 45
    .line 46
    :cond_1
    check-cast p2, Landroidx/compose/runtime/State;

    .line 47
    .line 48
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 49
    .line 50
    .line 51
    move-result p0

    .line 52
    if-eqz p0, :cond_2

    .line 53
    .line 54
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 55
    .line 56
    .line 57
    :cond_2
    return-object p2
.end method
