.class public final Landroidx/compose/foundation/layout/ContextualFlowLayoutKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0084\u0001\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u001a\u008e\u0001\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u00072\u0008\u0008\u0002\u0010\u0008\u001a\u00020\t2\u0008\u0008\u0002\u0010\n\u001a\u00020\u000b2\u0008\u0008\u0002\u0010\u000c\u001a\u00020\u00032\u0008\u0008\u0002\u0010\r\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u000e\u001a\u00020\u000f21\u0010\u0010\u001a-\u0012\u0004\u0012\u00020\u0012\u0012\u0013\u0012\u00110\u0003\u00a2\u0006\u000c\u0008\u0013\u0012\u0008\u0008\u0014\u0012\u0004\u0008\u0008(\u0015\u0012\u0004\u0012\u00020\u00010\u0011\u00a2\u0006\u0002\u0008\u0016\u00a2\u0006\u0002\u0008\u0017H\u0007\u00a2\u0006\u0002\u0010\u0018\u001a\u008e\u0001\u0010\u0019\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u0008\u001a\u00020\t2\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u00072\u0008\u0008\u0002\u0010\u001a\u001a\u00020\u001b2\u0008\u0008\u0002\u0010\u001c\u001a\u00020\u00032\u0008\u0008\u0002\u0010\r\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u000e\u001a\u00020\u001d21\u0010\u0010\u001a-\u0012\u0004\u0012\u00020\u001e\u0012\u0013\u0012\u00110\u0003\u00a2\u0006\u000c\u0008\u0013\u0012\u0008\u0008\u0014\u0012\u0004\u0008\u0008(\u0015\u0012\u0004\u0012\u00020\u00010\u0011\u00a2\u0006\u0002\u0008\u0016\u00a2\u0006\u0002\u0008\u0017H\u0007\u00a2\u0006\u0002\u0010\u001f\u001a\u00ad\u0001\u0010 \u001a\u0014\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020#0\u00112\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0008\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010$\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u00032\u0006\u0010%\u001a\u00020&2\u0006\u0010\u0002\u001a\u00020\u00032\u0017\u0010\'\u001a\u0013\u0012\u000f\u0012\r\u0012\u0004\u0012\u00020\u00010)\u00a2\u0006\u0002\u0008\u00160(2;\u0010*\u001a7\u0012\u0013\u0012\u00110\u0003\u00a2\u0006\u000c\u0008\u0013\u0012\u0008\u0008\u0014\u0012\u0004\u0008\u0008(\u0015\u0012\u0013\u0012\u00110+\u00a2\u0006\u000c\u0008\u0013\u0012\u0008\u0008\u0014\u0012\u0004\u0008\u0008(,\u0012\u0004\u0012\u00020\u00010\u0011\u00a2\u0006\u0002\u0008\u0016H\u0001\u00a2\u0006\u0002\u0010-\u001a\u00ad\u0001\u0010.\u001a\u0014\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020#0\u00112\u0006\u0010\u0008\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010$\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u00032\u0006\u0010%\u001a\u00020&2\u0006\u0010\u0002\u001a\u00020\u00032\u0017\u0010\'\u001a\u0013\u0012\u000f\u0012\r\u0012\u0004\u0012\u00020\u00010)\u00a2\u0006\u0002\u0008\u00160(2;\u0010*\u001a7\u0012\u0013\u0012\u00110\u0003\u00a2\u0006\u000c\u0008\u0013\u0012\u0008\u0008\u0014\u0012\u0004\u0008\u0008(\u0015\u0012\u0013\u0012\u00110+\u00a2\u0006\u000c\u0008\u0013\u0012\u0008\u0008\u0014\u0012\u0004\u0008\u0008(,\u0012\u0004\u0012\u00020\u00010\u0011\u00a2\u0006\u0002\u0008\u0016H\u0001\u00a2\u0006\u0002\u0010/\u00a8\u00060"
    }
    d2 = {
        "ContextualFlowColumn",
        "",
        "itemCount",
        "",
        "modifier",
        "Landroidx/compose/ui/Modifier;",
        "verticalArrangement",
        "Landroidx/compose/foundation/layout/Arrangement$Vertical;",
        "horizontalArrangement",
        "Landroidx/compose/foundation/layout/Arrangement$Horizontal;",
        "itemHorizontalAlignment",
        "Landroidx/compose/ui/Alignment$Horizontal;",
        "maxItemsInEachColumn",
        "maxLines",
        "overflow",
        "Landroidx/compose/foundation/layout/ContextualFlowColumnOverflow;",
        "content",
        "Lkotlin/Function2;",
        "Landroidx/compose/foundation/layout/ContextualFlowColumnScope;",
        "Lkotlin/ParameterName;",
        "name",
        "index",
        "Landroidx/compose/runtime/Composable;",
        "Lkotlin/ExtensionFunctionType;",
        "(ILandroidx/compose/ui/Modifier;Landroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/ui/Alignment$Horizontal;IILandroidx/compose/foundation/layout/ContextualFlowColumnOverflow;Lkotlin/jvm/functions/Function4;Landroidx/compose/runtime/Composer;II)V",
        "ContextualFlowRow",
        "itemVerticalAlignment",
        "Landroidx/compose/ui/Alignment$Vertical;",
        "maxItemsInEachRow",
        "Landroidx/compose/foundation/layout/ContextualFlowRowOverflow;",
        "Landroidx/compose/foundation/layout/ContextualFlowRowScope;",
        "(ILandroidx/compose/ui/Modifier;Landroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/ui/Alignment$Vertical;IILandroidx/compose/foundation/layout/ContextualFlowRowOverflow;Lkotlin/jvm/functions/Function4;Landroidx/compose/runtime/Composer;II)V",
        "contextualColumnMeasureHelper",
        "Landroidx/compose/ui/layout/SubcomposeMeasureScope;",
        "Landroidx/compose/ui/unit/Constraints;",
        "Landroidx/compose/ui/layout/MeasureResult;",
        "maxItemsInMainAxis",
        "overflowState",
        "Landroidx/compose/foundation/layout/FlowLayoutOverflowState;",
        "overflowComposables",
        "",
        "Lkotlin/Function0;",
        "getComposable",
        "Landroidx/compose/foundation/layout/FlowLineInfo;",
        "info",
        "(Landroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/ui/Alignment$Horizontal;IILandroidx/compose/foundation/layout/FlowLayoutOverflowState;ILjava/util/List;Lkotlin/jvm/functions/Function4;Landroidx/compose/runtime/Composer;I)Lkotlin/jvm/functions/Function2;",
        "contextualRowMeasurementHelper",
        "(Landroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/ui/Alignment$Vertical;IILandroidx/compose/foundation/layout/FlowLayoutOverflowState;ILjava/util/List;Lkotlin/jvm/functions/Function4;Landroidx/compose/runtime/Composer;I)Lkotlin/jvm/functions/Function2;",
        "foundation-layout_release"
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
        "SMAP\nContextualFlowLayout.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ContextualFlowLayout.kt\nandroidx/compose/foundation/layout/ContextualFlowLayoutKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,594:1\n1247#2,6:595\n1247#2,6:601\n1247#2,6:607\n1247#2,6:613\n1247#2,6:619\n1247#2,6:625\n*S KotlinDebug\n*F\n+ 1 ContextualFlowLayout.kt\nandroidx/compose/foundation/layout/ContextualFlowLayoutKt\n*L\n81#1:595,6\n83#1:601,6\n156#1:607,6\n158#1:613,6\n396#1:619,6\n436#1:625,6\n*E\n"
    }
.end annotation


# direct methods
.method public static final ContextualFlowColumn(ILandroidx/compose/ui/Modifier;Landroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/ui/Alignment$Horizontal;IILandroidx/compose/foundation/layout/ContextualFlowColumnOverflow;Lkotlin/jvm/functions/Function4;Landroidx/compose/runtime/Composer;II)V
    .locals 24
    .annotation build Landroidx/compose/foundation/layout/ExperimentalLayoutApi;
    .end annotation

    .annotation build Landroidx/compose/runtime/Composable;
    .end annotation

    .annotation build Landroidx/compose/runtime/ComposableInferredTarget;
        scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Landroidx/compose/ui/Modifier;",
            "Landroidx/compose/foundation/layout/Arrangement$Vertical;",
            "Landroidx/compose/foundation/layout/Arrangement$Horizontal;",
            "Landroidx/compose/ui/Alignment$Horizontal;",
            "II",
            "Landroidx/compose/foundation/layout/ContextualFlowColumnOverflow;",
            "Lkotlin/jvm/functions/Function4<",
            "-",
            "Landroidx/compose/foundation/layout/ContextualFlowColumnScope;",
            "-",
            "Ljava/lang/Integer;",
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

    .annotation runtime Lkotlin/Deprecated;
        message = "ContextualFlowLayouts are no longer maintained"
    .end annotation

    .line 1
    move-object/from16 v9, p8

    .line 2
    .line 3
    move/from16 v10, p10

    .line 4
    .line 5
    move/from16 v11, p11

    .line 6
    .line 7
    const v0, 0x3e7f7ce3

    .line 8
    .line 9
    .line 10
    move-object/from16 v1, p9

    .line 11
    .line 12
    invoke-interface {v1, v0}, Landroidx/compose/runtime/Composer;->startRestartGroup(I)Landroidx/compose/runtime/Composer;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    and-int/lit8 v2, v11, 0x1

    .line 17
    .line 18
    if-eqz v2, :cond_0

    .line 19
    .line 20
    or-int/lit8 v2, v10, 0x6

    .line 21
    .line 22
    move v3, v2

    .line 23
    move/from16 v2, p0

    .line 24
    .line 25
    goto :goto_1

    .line 26
    :cond_0
    and-int/lit8 v2, v10, 0x6

    .line 27
    .line 28
    if-nez v2, :cond_2

    .line 29
    .line 30
    move/from16 v2, p0

    .line 31
    .line 32
    invoke-interface {v1, v2}, Landroidx/compose/runtime/Composer;->changed(I)Z

    .line 33
    .line 34
    .line 35
    move-result v3

    .line 36
    if-eqz v3, :cond_1

    .line 37
    .line 38
    const/4 v3, 0x4

    .line 39
    goto :goto_0

    .line 40
    :cond_1
    const/4 v3, 0x2

    .line 41
    :goto_0
    or-int/2addr v3, v10

    .line 42
    goto :goto_1

    .line 43
    :cond_2
    move/from16 v2, p0

    .line 44
    .line 45
    move v3, v10

    .line 46
    :goto_1
    and-int/lit8 v4, v11, 0x2

    .line 47
    .line 48
    if-eqz v4, :cond_4

    .line 49
    .line 50
    or-int/lit8 v3, v3, 0x30

    .line 51
    .line 52
    :cond_3
    move-object/from16 v5, p1

    .line 53
    .line 54
    goto :goto_3

    .line 55
    :cond_4
    and-int/lit8 v5, v10, 0x30

    .line 56
    .line 57
    if-nez v5, :cond_3

    .line 58
    .line 59
    move-object/from16 v5, p1

    .line 60
    .line 61
    invoke-interface {v1, v5}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 62
    .line 63
    .line 64
    move-result v6

    .line 65
    if-eqz v6, :cond_5

    .line 66
    .line 67
    const/16 v6, 0x20

    .line 68
    .line 69
    goto :goto_2

    .line 70
    :cond_5
    const/16 v6, 0x10

    .line 71
    .line 72
    :goto_2
    or-int/2addr v3, v6

    .line 73
    :goto_3
    and-int/lit8 v6, v11, 0x4

    .line 74
    .line 75
    if-eqz v6, :cond_7

    .line 76
    .line 77
    or-int/lit16 v3, v3, 0x180

    .line 78
    .line 79
    :cond_6
    move-object/from16 v7, p2

    .line 80
    .line 81
    goto :goto_5

    .line 82
    :cond_7
    and-int/lit16 v7, v10, 0x180

    .line 83
    .line 84
    if-nez v7, :cond_6

    .line 85
    .line 86
    move-object/from16 v7, p2

    .line 87
    .line 88
    invoke-interface {v1, v7}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 89
    .line 90
    .line 91
    move-result v8

    .line 92
    if-eqz v8, :cond_8

    .line 93
    .line 94
    const/16 v8, 0x100

    .line 95
    .line 96
    goto :goto_4

    .line 97
    :cond_8
    const/16 v8, 0x80

    .line 98
    .line 99
    :goto_4
    or-int/2addr v3, v8

    .line 100
    :goto_5
    and-int/lit8 v8, v11, 0x8

    .line 101
    .line 102
    if-eqz v8, :cond_a

    .line 103
    .line 104
    or-int/lit16 v3, v3, 0xc00

    .line 105
    .line 106
    :cond_9
    move-object/from16 v12, p3

    .line 107
    .line 108
    goto :goto_7

    .line 109
    :cond_a
    and-int/lit16 v12, v10, 0xc00

    .line 110
    .line 111
    if-nez v12, :cond_9

    .line 112
    .line 113
    move-object/from16 v12, p3

    .line 114
    .line 115
    invoke-interface {v1, v12}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 116
    .line 117
    .line 118
    move-result v13

    .line 119
    if-eqz v13, :cond_b

    .line 120
    .line 121
    const/16 v13, 0x800

    .line 122
    .line 123
    goto :goto_6

    .line 124
    :cond_b
    const/16 v13, 0x400

    .line 125
    .line 126
    :goto_6
    or-int/2addr v3, v13

    .line 127
    :goto_7
    and-int/lit8 v13, v11, 0x10

    .line 128
    .line 129
    if-eqz v13, :cond_d

    .line 130
    .line 131
    or-int/lit16 v3, v3, 0x6000

    .line 132
    .line 133
    :cond_c
    move-object/from16 v14, p4

    .line 134
    .line 135
    goto :goto_9

    .line 136
    :cond_d
    and-int/lit16 v14, v10, 0x6000

    .line 137
    .line 138
    if-nez v14, :cond_c

    .line 139
    .line 140
    move-object/from16 v14, p4

    .line 141
    .line 142
    invoke-interface {v1, v14}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 143
    .line 144
    .line 145
    move-result v15

    .line 146
    if-eqz v15, :cond_e

    .line 147
    .line 148
    const/16 v15, 0x4000

    .line 149
    .line 150
    goto :goto_8

    .line 151
    :cond_e
    const/16 v15, 0x2000

    .line 152
    .line 153
    :goto_8
    or-int/2addr v3, v15

    .line 154
    :goto_9
    and-int/lit8 v15, v11, 0x20

    .line 155
    .line 156
    const/high16 v16, 0x30000

    .line 157
    .line 158
    if-eqz v15, :cond_f

    .line 159
    .line 160
    or-int v3, v3, v16

    .line 161
    .line 162
    move/from16 v0, p5

    .line 163
    .line 164
    goto :goto_b

    .line 165
    :cond_f
    and-int v16, v10, v16

    .line 166
    .line 167
    move/from16 v0, p5

    .line 168
    .line 169
    if-nez v16, :cond_11

    .line 170
    .line 171
    invoke-interface {v1, v0}, Landroidx/compose/runtime/Composer;->changed(I)Z

    .line 172
    .line 173
    .line 174
    move-result v17

    .line 175
    if-eqz v17, :cond_10

    .line 176
    .line 177
    const/high16 v17, 0x20000

    .line 178
    .line 179
    goto :goto_a

    .line 180
    :cond_10
    const/high16 v17, 0x10000

    .line 181
    .line 182
    :goto_a
    or-int v3, v3, v17

    .line 183
    .line 184
    :cond_11
    :goto_b
    and-int/lit8 v17, v11, 0x40

    .line 185
    .line 186
    const/high16 v18, 0x180000

    .line 187
    .line 188
    if-eqz v17, :cond_12

    .line 189
    .line 190
    or-int v3, v3, v18

    .line 191
    .line 192
    move/from16 v0, p6

    .line 193
    .line 194
    goto :goto_d

    .line 195
    :cond_12
    and-int v18, v10, v18

    .line 196
    .line 197
    move/from16 v0, p6

    .line 198
    .line 199
    if-nez v18, :cond_14

    .line 200
    .line 201
    invoke-interface {v1, v0}, Landroidx/compose/runtime/Composer;->changed(I)Z

    .line 202
    .line 203
    .line 204
    move-result v18

    .line 205
    if-eqz v18, :cond_13

    .line 206
    .line 207
    const/high16 v18, 0x100000

    .line 208
    .line 209
    goto :goto_c

    .line 210
    :cond_13
    const/high16 v18, 0x80000

    .line 211
    .line 212
    :goto_c
    or-int v3, v3, v18

    .line 213
    .line 214
    :cond_14
    :goto_d
    and-int/lit16 v0, v11, 0x80

    .line 215
    .line 216
    const/high16 v18, 0xc00000

    .line 217
    .line 218
    move/from16 v19, v0

    .line 219
    .line 220
    if-eqz v19, :cond_15

    .line 221
    .line 222
    or-int v3, v3, v18

    .line 223
    .line 224
    move-object/from16 v0, p7

    .line 225
    .line 226
    goto :goto_f

    .line 227
    :cond_15
    and-int v18, v10, v18

    .line 228
    .line 229
    move-object/from16 v0, p7

    .line 230
    .line 231
    if-nez v18, :cond_17

    .line 232
    .line 233
    invoke-interface {v1, v0}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 234
    .line 235
    .line 236
    move-result v18

    .line 237
    if-eqz v18, :cond_16

    .line 238
    .line 239
    const/high16 v18, 0x800000

    .line 240
    .line 241
    goto :goto_e

    .line 242
    :cond_16
    const/high16 v18, 0x400000

    .line 243
    .line 244
    :goto_e
    or-int v3, v3, v18

    .line 245
    .line 246
    :cond_17
    :goto_f
    and-int/lit16 v0, v11, 0x100

    .line 247
    .line 248
    const/high16 v18, 0x6000000

    .line 249
    .line 250
    if-eqz v0, :cond_18

    .line 251
    .line 252
    or-int v3, v3, v18

    .line 253
    .line 254
    goto :goto_11

    .line 255
    :cond_18
    and-int v0, v10, v18

    .line 256
    .line 257
    if-nez v0, :cond_1a

    .line 258
    .line 259
    invoke-interface {v1, v9}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 260
    .line 261
    .line 262
    move-result v0

    .line 263
    if-eqz v0, :cond_19

    .line 264
    .line 265
    const/high16 v0, 0x4000000

    .line 266
    .line 267
    goto :goto_10

    .line 268
    :cond_19
    const/high16 v0, 0x2000000

    .line 269
    .line 270
    :goto_10
    or-int/2addr v3, v0

    .line 271
    :cond_1a
    :goto_11
    const v0, 0x2492493

    .line 272
    .line 273
    .line 274
    and-int/2addr v0, v3

    .line 275
    const v2, 0x2492492

    .line 276
    .line 277
    .line 278
    move/from16 v20, v4

    .line 279
    .line 280
    const/4 v4, 0x1

    .line 281
    if-eq v0, v2, :cond_1b

    .line 282
    .line 283
    move v0, v4

    .line 284
    goto :goto_12

    .line 285
    :cond_1b
    const/4 v0, 0x0

    .line 286
    :goto_12
    and-int/lit8 v2, v3, 0x1

    .line 287
    .line 288
    invoke-interface {v1, v0, v2}, Landroidx/compose/runtime/Composer;->shouldExecute(ZI)Z

    .line 289
    .line 290
    .line 291
    move-result v0

    .line 292
    if-eqz v0, :cond_2b

    .line 293
    .line 294
    if-eqz v20, :cond_1c

    .line 295
    .line 296
    sget-object v0, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    .line 297
    .line 298
    move-object v5, v0

    .line 299
    :cond_1c
    if-eqz v6, :cond_1d

    .line 300
    .line 301
    sget-object v0, Landroidx/compose/foundation/layout/Arrangement;->INSTANCE:Landroidx/compose/foundation/layout/Arrangement;

    .line 302
    .line 303
    invoke-virtual {v0}, Landroidx/compose/foundation/layout/Arrangement;->getTop()Landroidx/compose/foundation/layout/Arrangement$Vertical;

    .line 304
    .line 305
    .line 306
    move-result-object v0

    .line 307
    move-object v12, v0

    .line 308
    goto :goto_13

    .line 309
    :cond_1d
    move-object v12, v7

    .line 310
    :goto_13
    if-eqz v8, :cond_1e

    .line 311
    .line 312
    sget-object v0, Landroidx/compose/foundation/layout/Arrangement;->INSTANCE:Landroidx/compose/foundation/layout/Arrangement;

    .line 313
    .line 314
    invoke-virtual {v0}, Landroidx/compose/foundation/layout/Arrangement;->getStart()Landroidx/compose/foundation/layout/Arrangement$Horizontal;

    .line 315
    .line 316
    .line 317
    move-result-object v0

    .line 318
    move/from16 v23, v13

    .line 319
    .line 320
    move-object v13, v0

    .line 321
    move/from16 v0, v23

    .line 322
    .line 323
    goto :goto_14

    .line 324
    :cond_1e
    move v0, v13

    .line 325
    move-object/from16 v13, p3

    .line 326
    .line 327
    :goto_14
    if-eqz v0, :cond_1f

    .line 328
    .line 329
    sget-object v0, Landroidx/compose/ui/Alignment;->Companion:Landroidx/compose/ui/Alignment$Companion;

    .line 330
    .line 331
    invoke-virtual {v0}, Landroidx/compose/ui/Alignment$Companion;->getStart()Landroidx/compose/ui/Alignment$Horizontal;

    .line 332
    .line 333
    .line 334
    move-result-object v0

    .line 335
    move-object v14, v0

    .line 336
    :cond_1f
    const v0, 0x7fffffff

    .line 337
    .line 338
    .line 339
    if-eqz v15, :cond_20

    .line 340
    .line 341
    move v15, v0

    .line 342
    goto :goto_15

    .line 343
    :cond_20
    move/from16 v15, p5

    .line 344
    .line 345
    :goto_15
    if-eqz v17, :cond_21

    .line 346
    .line 347
    move/from16 v16, v0

    .line 348
    .line 349
    :goto_16
    const v0, 0x3e7f7ce3

    .line 350
    .line 351
    .line 352
    goto :goto_17

    .line 353
    :cond_21
    move/from16 v16, p6

    .line 354
    .line 355
    goto :goto_16

    .line 356
    :goto_17
    if-eqz v19, :cond_22

    .line 357
    .line 358
    sget-object v2, Landroidx/compose/foundation/layout/ContextualFlowColumnOverflow;->Companion:Landroidx/compose/foundation/layout/ContextualFlowColumnOverflow$Companion;

    .line 359
    .line 360
    invoke-virtual {v2}, Landroidx/compose/foundation/layout/ContextualFlowColumnOverflow$Companion;->getClip()Landroidx/compose/foundation/layout/ContextualFlowColumnOverflow;

    .line 361
    .line 362
    .line 363
    move-result-object v2

    .line 364
    goto :goto_18

    .line 365
    :cond_22
    move-object/from16 v2, p7

    .line 366
    .line 367
    :goto_18
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 368
    .line 369
    .line 370
    move-result v6

    .line 371
    if-eqz v6, :cond_23

    .line 372
    .line 373
    const/4 v6, -0x1

    .line 374
    const-string/jumbo v7, "androidx.compose.foundation.layout.ContextualFlowColumn (ContextualFlowLayout.kt:154)"

    .line 375
    .line 376
    .line 377
    invoke-static {v0, v3, v6, v7}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 378
    .line 379
    .line 380
    :cond_23
    const/high16 v0, 0x1c00000

    .line 381
    .line 382
    and-int/2addr v0, v3

    .line 383
    const/high16 v6, 0x800000

    .line 384
    .line 385
    if-ne v0, v6, :cond_24

    .line 386
    .line 387
    move v6, v4

    .line 388
    goto :goto_19

    .line 389
    :cond_24
    const/4 v6, 0x0

    .line 390
    :goto_19
    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 391
    .line 392
    .line 393
    move-result-object v7

    .line 394
    if-nez v6, :cond_25

    .line 395
    .line 396
    sget-object v6, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    .line 397
    .line 398
    invoke-virtual {v6}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    .line 399
    .line 400
    .line 401
    move-result-object v6

    .line 402
    if-ne v7, v6, :cond_26

    .line 403
    .line 404
    :cond_25
    invoke-virtual {v2}, Landroidx/compose/foundation/layout/FlowLayoutOverflow;->createOverflowState$foundation_layout_release()Landroidx/compose/foundation/layout/FlowLayoutOverflowState;

    .line 405
    .line 406
    .line 407
    move-result-object v7

    .line 408
    invoke-interface {v1, v7}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 409
    .line 410
    .line 411
    :cond_26
    check-cast v7, Landroidx/compose/foundation/layout/FlowLayoutOverflowState;

    .line 412
    .line 413
    const/high16 v6, 0x800000

    .line 414
    .line 415
    if-ne v0, v6, :cond_27

    .line 416
    .line 417
    move v0, v4

    .line 418
    goto :goto_1a

    .line 419
    :cond_27
    const/4 v0, 0x0

    .line 420
    :goto_1a
    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 421
    .line 422
    .line 423
    move-result-object v6

    .line 424
    if-nez v0, :cond_28

    .line 425
    .line 426
    sget-object v0, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    .line 427
    .line 428
    invoke-virtual {v0}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    .line 429
    .line 430
    .line 431
    move-result-object v0

    .line 432
    if-ne v6, v0, :cond_29

    .line 433
    .line 434
    :cond_28
    new-instance v6, Ljava/util/ArrayList;

    .line 435
    .line 436
    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    .line 437
    .line 438
    .line 439
    invoke-virtual {v2, v7, v6}, Landroidx/compose/foundation/layout/FlowLayoutOverflow;->addOverflowComposables$foundation_layout_release(Landroidx/compose/foundation/layout/FlowLayoutOverflowState;Ljava/util/List;)V

    .line 440
    .line 441
    .line 442
    invoke-interface {v1, v6}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 443
    .line 444
    .line 445
    :cond_29
    move-object/from16 v19, v6

    .line 446
    .line 447
    check-cast v19, Ljava/util/List;

    .line 448
    .line 449
    new-instance v0, Landroidx/compose/foundation/layout/ContextualFlowLayoutKt$ContextualFlowColumn$measurePolicy$1;

    .line 450
    .line 451
    invoke-direct {v0, v9}, Landroidx/compose/foundation/layout/ContextualFlowLayoutKt$ContextualFlowColumn$measurePolicy$1;-><init>(Lkotlin/jvm/functions/Function4;)V

    .line 452
    .line 453
    .line 454
    const/16 v6, 0x36

    .line 455
    .line 456
    const v8, 0x3e7b3daf

    .line 457
    .line 458
    .line 459
    invoke-static {v8, v4, v0, v1, v6}, Landroidx/compose/runtime/internal/ComposableLambdaKt;->rememberComposableLambda(IZLjava/lang/Object;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/internal/ComposableLambda;

    .line 460
    .line 461
    .line 462
    move-result-object v20

    .line 463
    shr-int/lit8 v0, v3, 0x6

    .line 464
    .line 465
    and-int/lit8 v4, v0, 0xe

    .line 466
    .line 467
    or-int v4, v4, v18

    .line 468
    .line 469
    and-int/lit8 v6, v0, 0x70

    .line 470
    .line 471
    or-int/2addr v4, v6

    .line 472
    and-int/lit16 v6, v0, 0x380

    .line 473
    .line 474
    or-int/2addr v4, v6

    .line 475
    and-int/lit16 v6, v0, 0x1c00

    .line 476
    .line 477
    or-int/2addr v4, v6

    .line 478
    const v6, 0xe000

    .line 479
    .line 480
    .line 481
    and-int/2addr v0, v6

    .line 482
    or-int/2addr v0, v4

    .line 483
    shl-int/lit8 v4, v3, 0x12

    .line 484
    .line 485
    const/high16 v6, 0x380000

    .line 486
    .line 487
    and-int/2addr v4, v6

    .line 488
    or-int v22, v0, v4

    .line 489
    .line 490
    move/from16 v18, p0

    .line 491
    .line 492
    move-object/from16 v21, v1

    .line 493
    .line 494
    move-object/from16 v17, v7

    .line 495
    .line 496
    invoke-static/range {v12 .. v22}, Landroidx/compose/foundation/layout/ContextualFlowLayoutKt;->contextualColumnMeasureHelper(Landroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/ui/Alignment$Horizontal;IILandroidx/compose/foundation/layout/FlowLayoutOverflowState;ILjava/util/List;Lkotlin/jvm/functions/Function4;Landroidx/compose/runtime/Composer;I)Lkotlin/jvm/functions/Function2;

    .line 497
    .line 498
    .line 499
    move-result-object v0

    .line 500
    shr-int/lit8 v3, v3, 0x3

    .line 501
    .line 502
    and-int/lit8 v3, v3, 0xe

    .line 503
    .line 504
    const/4 v4, 0x0

    .line 505
    invoke-static {v5, v0, v1, v3, v4}, Landroidx/compose/ui/layout/SubcomposeLayoutKt;->SubcomposeLayout(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V

    .line 506
    .line 507
    .line 508
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 509
    .line 510
    .line 511
    move-result v0

    .line 512
    if-eqz v0, :cond_2a

    .line 513
    .line 514
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 515
    .line 516
    .line 517
    :cond_2a
    move-object v8, v2

    .line 518
    move-object v3, v12

    .line 519
    move-object v4, v13

    .line 520
    move v6, v15

    .line 521
    move/from16 v7, v16

    .line 522
    .line 523
    :goto_1b
    move-object v2, v5

    .line 524
    move-object v5, v14

    .line 525
    goto :goto_1c

    .line 526
    :cond_2b
    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    .line 527
    .line 528
    .line 529
    move-object/from16 v4, p3

    .line 530
    .line 531
    move/from16 v6, p5

    .line 532
    .line 533
    move-object/from16 v8, p7

    .line 534
    .line 535
    move-object v3, v7

    .line 536
    move/from16 v7, p6

    .line 537
    .line 538
    goto :goto_1b

    .line 539
    :goto_1c
    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    .line 540
    .line 541
    .line 542
    move-result-object v12

    .line 543
    if-eqz v12, :cond_2c

    .line 544
    .line 545
    new-instance v0, Landroidx/compose/foundation/layout/ContextualFlowLayoutKt$ContextualFlowColumn$1;

    .line 546
    .line 547
    move/from16 v1, p0

    .line 548
    .line 549
    invoke-direct/range {v0 .. v11}, Landroidx/compose/foundation/layout/ContextualFlowLayoutKt$ContextualFlowColumn$1;-><init>(ILandroidx/compose/ui/Modifier;Landroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/ui/Alignment$Horizontal;IILandroidx/compose/foundation/layout/ContextualFlowColumnOverflow;Lkotlin/jvm/functions/Function4;II)V

    .line 550
    .line 551
    .line 552
    invoke-interface {v12, v0}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lkotlin/jvm/functions/Function2;)V

    .line 553
    .line 554
    .line 555
    :cond_2c
    return-void
.end method

.method public static final ContextualFlowRow(ILandroidx/compose/ui/Modifier;Landroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/ui/Alignment$Vertical;IILandroidx/compose/foundation/layout/ContextualFlowRowOverflow;Lkotlin/jvm/functions/Function4;Landroidx/compose/runtime/Composer;II)V
    .locals 24
    .annotation build Landroidx/compose/foundation/layout/ExperimentalLayoutApi;
    .end annotation

    .annotation build Landroidx/compose/runtime/Composable;
    .end annotation

    .annotation build Landroidx/compose/runtime/ComposableInferredTarget;
        scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Landroidx/compose/ui/Modifier;",
            "Landroidx/compose/foundation/layout/Arrangement$Horizontal;",
            "Landroidx/compose/foundation/layout/Arrangement$Vertical;",
            "Landroidx/compose/ui/Alignment$Vertical;",
            "II",
            "Landroidx/compose/foundation/layout/ContextualFlowRowOverflow;",
            "Lkotlin/jvm/functions/Function4<",
            "-",
            "Landroidx/compose/foundation/layout/ContextualFlowRowScope;",
            "-",
            "Ljava/lang/Integer;",
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

    .annotation runtime Lkotlin/Deprecated;
        message = "ContextualFlowLayouts are no longer maintained"
    .end annotation

    .line 1
    move-object/from16 v9, p8

    .line 2
    .line 3
    move/from16 v10, p10

    .line 4
    .line 5
    move/from16 v11, p11

    .line 6
    .line 7
    const v0, 0xf22895f

    .line 8
    .line 9
    .line 10
    move-object/from16 v1, p9

    .line 11
    .line 12
    invoke-interface {v1, v0}, Landroidx/compose/runtime/Composer;->startRestartGroup(I)Landroidx/compose/runtime/Composer;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    and-int/lit8 v2, v11, 0x1

    .line 17
    .line 18
    if-eqz v2, :cond_0

    .line 19
    .line 20
    or-int/lit8 v2, v10, 0x6

    .line 21
    .line 22
    move v3, v2

    .line 23
    move/from16 v2, p0

    .line 24
    .line 25
    goto :goto_1

    .line 26
    :cond_0
    and-int/lit8 v2, v10, 0x6

    .line 27
    .line 28
    if-nez v2, :cond_2

    .line 29
    .line 30
    move/from16 v2, p0

    .line 31
    .line 32
    invoke-interface {v1, v2}, Landroidx/compose/runtime/Composer;->changed(I)Z

    .line 33
    .line 34
    .line 35
    move-result v3

    .line 36
    if-eqz v3, :cond_1

    .line 37
    .line 38
    const/4 v3, 0x4

    .line 39
    goto :goto_0

    .line 40
    :cond_1
    const/4 v3, 0x2

    .line 41
    :goto_0
    or-int/2addr v3, v10

    .line 42
    goto :goto_1

    .line 43
    :cond_2
    move/from16 v2, p0

    .line 44
    .line 45
    move v3, v10

    .line 46
    :goto_1
    and-int/lit8 v4, v11, 0x2

    .line 47
    .line 48
    if-eqz v4, :cond_4

    .line 49
    .line 50
    or-int/lit8 v3, v3, 0x30

    .line 51
    .line 52
    :cond_3
    move-object/from16 v5, p1

    .line 53
    .line 54
    goto :goto_3

    .line 55
    :cond_4
    and-int/lit8 v5, v10, 0x30

    .line 56
    .line 57
    if-nez v5, :cond_3

    .line 58
    .line 59
    move-object/from16 v5, p1

    .line 60
    .line 61
    invoke-interface {v1, v5}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 62
    .line 63
    .line 64
    move-result v6

    .line 65
    if-eqz v6, :cond_5

    .line 66
    .line 67
    const/16 v6, 0x20

    .line 68
    .line 69
    goto :goto_2

    .line 70
    :cond_5
    const/16 v6, 0x10

    .line 71
    .line 72
    :goto_2
    or-int/2addr v3, v6

    .line 73
    :goto_3
    and-int/lit8 v6, v11, 0x4

    .line 74
    .line 75
    if-eqz v6, :cond_7

    .line 76
    .line 77
    or-int/lit16 v3, v3, 0x180

    .line 78
    .line 79
    :cond_6
    move-object/from16 v7, p2

    .line 80
    .line 81
    goto :goto_5

    .line 82
    :cond_7
    and-int/lit16 v7, v10, 0x180

    .line 83
    .line 84
    if-nez v7, :cond_6

    .line 85
    .line 86
    move-object/from16 v7, p2

    .line 87
    .line 88
    invoke-interface {v1, v7}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 89
    .line 90
    .line 91
    move-result v8

    .line 92
    if-eqz v8, :cond_8

    .line 93
    .line 94
    const/16 v8, 0x100

    .line 95
    .line 96
    goto :goto_4

    .line 97
    :cond_8
    const/16 v8, 0x80

    .line 98
    .line 99
    :goto_4
    or-int/2addr v3, v8

    .line 100
    :goto_5
    and-int/lit8 v8, v11, 0x8

    .line 101
    .line 102
    if-eqz v8, :cond_a

    .line 103
    .line 104
    or-int/lit16 v3, v3, 0xc00

    .line 105
    .line 106
    :cond_9
    move-object/from16 v12, p3

    .line 107
    .line 108
    goto :goto_7

    .line 109
    :cond_a
    and-int/lit16 v12, v10, 0xc00

    .line 110
    .line 111
    if-nez v12, :cond_9

    .line 112
    .line 113
    move-object/from16 v12, p3

    .line 114
    .line 115
    invoke-interface {v1, v12}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 116
    .line 117
    .line 118
    move-result v13

    .line 119
    if-eqz v13, :cond_b

    .line 120
    .line 121
    const/16 v13, 0x800

    .line 122
    .line 123
    goto :goto_6

    .line 124
    :cond_b
    const/16 v13, 0x400

    .line 125
    .line 126
    :goto_6
    or-int/2addr v3, v13

    .line 127
    :goto_7
    and-int/lit8 v13, v11, 0x10

    .line 128
    .line 129
    if-eqz v13, :cond_d

    .line 130
    .line 131
    or-int/lit16 v3, v3, 0x6000

    .line 132
    .line 133
    :cond_c
    move-object/from16 v14, p4

    .line 134
    .line 135
    goto :goto_9

    .line 136
    :cond_d
    and-int/lit16 v14, v10, 0x6000

    .line 137
    .line 138
    if-nez v14, :cond_c

    .line 139
    .line 140
    move-object/from16 v14, p4

    .line 141
    .line 142
    invoke-interface {v1, v14}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 143
    .line 144
    .line 145
    move-result v15

    .line 146
    if-eqz v15, :cond_e

    .line 147
    .line 148
    const/16 v15, 0x4000

    .line 149
    .line 150
    goto :goto_8

    .line 151
    :cond_e
    const/16 v15, 0x2000

    .line 152
    .line 153
    :goto_8
    or-int/2addr v3, v15

    .line 154
    :goto_9
    and-int/lit8 v15, v11, 0x20

    .line 155
    .line 156
    const/high16 v16, 0x30000

    .line 157
    .line 158
    if-eqz v15, :cond_f

    .line 159
    .line 160
    or-int v3, v3, v16

    .line 161
    .line 162
    move/from16 v0, p5

    .line 163
    .line 164
    goto :goto_b

    .line 165
    :cond_f
    and-int v16, v10, v16

    .line 166
    .line 167
    move/from16 v0, p5

    .line 168
    .line 169
    if-nez v16, :cond_11

    .line 170
    .line 171
    invoke-interface {v1, v0}, Landroidx/compose/runtime/Composer;->changed(I)Z

    .line 172
    .line 173
    .line 174
    move-result v17

    .line 175
    if-eqz v17, :cond_10

    .line 176
    .line 177
    const/high16 v17, 0x20000

    .line 178
    .line 179
    goto :goto_a

    .line 180
    :cond_10
    const/high16 v17, 0x10000

    .line 181
    .line 182
    :goto_a
    or-int v3, v3, v17

    .line 183
    .line 184
    :cond_11
    :goto_b
    and-int/lit8 v17, v11, 0x40

    .line 185
    .line 186
    const/high16 v18, 0x180000

    .line 187
    .line 188
    if-eqz v17, :cond_12

    .line 189
    .line 190
    or-int v3, v3, v18

    .line 191
    .line 192
    move/from16 v0, p6

    .line 193
    .line 194
    goto :goto_d

    .line 195
    :cond_12
    and-int v18, v10, v18

    .line 196
    .line 197
    move/from16 v0, p6

    .line 198
    .line 199
    if-nez v18, :cond_14

    .line 200
    .line 201
    invoke-interface {v1, v0}, Landroidx/compose/runtime/Composer;->changed(I)Z

    .line 202
    .line 203
    .line 204
    move-result v18

    .line 205
    if-eqz v18, :cond_13

    .line 206
    .line 207
    const/high16 v18, 0x100000

    .line 208
    .line 209
    goto :goto_c

    .line 210
    :cond_13
    const/high16 v18, 0x80000

    .line 211
    .line 212
    :goto_c
    or-int v3, v3, v18

    .line 213
    .line 214
    :cond_14
    :goto_d
    and-int/lit16 v0, v11, 0x80

    .line 215
    .line 216
    const/high16 v18, 0xc00000

    .line 217
    .line 218
    move/from16 v19, v0

    .line 219
    .line 220
    if-eqz v19, :cond_15

    .line 221
    .line 222
    or-int v3, v3, v18

    .line 223
    .line 224
    move-object/from16 v0, p7

    .line 225
    .line 226
    goto :goto_f

    .line 227
    :cond_15
    and-int v18, v10, v18

    .line 228
    .line 229
    move-object/from16 v0, p7

    .line 230
    .line 231
    if-nez v18, :cond_17

    .line 232
    .line 233
    invoke-interface {v1, v0}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 234
    .line 235
    .line 236
    move-result v18

    .line 237
    if-eqz v18, :cond_16

    .line 238
    .line 239
    const/high16 v18, 0x800000

    .line 240
    .line 241
    goto :goto_e

    .line 242
    :cond_16
    const/high16 v18, 0x400000

    .line 243
    .line 244
    :goto_e
    or-int v3, v3, v18

    .line 245
    .line 246
    :cond_17
    :goto_f
    and-int/lit16 v0, v11, 0x100

    .line 247
    .line 248
    const/high16 v18, 0x6000000

    .line 249
    .line 250
    if-eqz v0, :cond_18

    .line 251
    .line 252
    or-int v3, v3, v18

    .line 253
    .line 254
    goto :goto_11

    .line 255
    :cond_18
    and-int v0, v10, v18

    .line 256
    .line 257
    if-nez v0, :cond_1a

    .line 258
    .line 259
    invoke-interface {v1, v9}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 260
    .line 261
    .line 262
    move-result v0

    .line 263
    if-eqz v0, :cond_19

    .line 264
    .line 265
    const/high16 v0, 0x4000000

    .line 266
    .line 267
    goto :goto_10

    .line 268
    :cond_19
    const/high16 v0, 0x2000000

    .line 269
    .line 270
    :goto_10
    or-int/2addr v3, v0

    .line 271
    :cond_1a
    :goto_11
    const v0, 0x2492493

    .line 272
    .line 273
    .line 274
    and-int/2addr v0, v3

    .line 275
    const v2, 0x2492492

    .line 276
    .line 277
    .line 278
    move/from16 v20, v4

    .line 279
    .line 280
    const/4 v4, 0x1

    .line 281
    if-eq v0, v2, :cond_1b

    .line 282
    .line 283
    move v0, v4

    .line 284
    goto :goto_12

    .line 285
    :cond_1b
    const/4 v0, 0x0

    .line 286
    :goto_12
    and-int/lit8 v2, v3, 0x1

    .line 287
    .line 288
    invoke-interface {v1, v0, v2}, Landroidx/compose/runtime/Composer;->shouldExecute(ZI)Z

    .line 289
    .line 290
    .line 291
    move-result v0

    .line 292
    if-eqz v0, :cond_2b

    .line 293
    .line 294
    if-eqz v20, :cond_1c

    .line 295
    .line 296
    sget-object v0, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    .line 297
    .line 298
    move-object v5, v0

    .line 299
    :cond_1c
    if-eqz v6, :cond_1d

    .line 300
    .line 301
    sget-object v0, Landroidx/compose/foundation/layout/Arrangement;->INSTANCE:Landroidx/compose/foundation/layout/Arrangement;

    .line 302
    .line 303
    invoke-virtual {v0}, Landroidx/compose/foundation/layout/Arrangement;->getStart()Landroidx/compose/foundation/layout/Arrangement$Horizontal;

    .line 304
    .line 305
    .line 306
    move-result-object v0

    .line 307
    move-object v12, v0

    .line 308
    goto :goto_13

    .line 309
    :cond_1d
    move-object v12, v7

    .line 310
    :goto_13
    if-eqz v8, :cond_1e

    .line 311
    .line 312
    sget-object v0, Landroidx/compose/foundation/layout/Arrangement;->INSTANCE:Landroidx/compose/foundation/layout/Arrangement;

    .line 313
    .line 314
    invoke-virtual {v0}, Landroidx/compose/foundation/layout/Arrangement;->getTop()Landroidx/compose/foundation/layout/Arrangement$Vertical;

    .line 315
    .line 316
    .line 317
    move-result-object v0

    .line 318
    move/from16 v23, v13

    .line 319
    .line 320
    move-object v13, v0

    .line 321
    move/from16 v0, v23

    .line 322
    .line 323
    goto :goto_14

    .line 324
    :cond_1e
    move v0, v13

    .line 325
    move-object/from16 v13, p3

    .line 326
    .line 327
    :goto_14
    if-eqz v0, :cond_1f

    .line 328
    .line 329
    sget-object v0, Landroidx/compose/ui/Alignment;->Companion:Landroidx/compose/ui/Alignment$Companion;

    .line 330
    .line 331
    invoke-virtual {v0}, Landroidx/compose/ui/Alignment$Companion;->getTop()Landroidx/compose/ui/Alignment$Vertical;

    .line 332
    .line 333
    .line 334
    move-result-object v0

    .line 335
    move-object v14, v0

    .line 336
    :cond_1f
    const v0, 0x7fffffff

    .line 337
    .line 338
    .line 339
    if-eqz v15, :cond_20

    .line 340
    .line 341
    move v15, v0

    .line 342
    goto :goto_15

    .line 343
    :cond_20
    move/from16 v15, p5

    .line 344
    .line 345
    :goto_15
    if-eqz v17, :cond_21

    .line 346
    .line 347
    move/from16 v16, v0

    .line 348
    .line 349
    :goto_16
    const v0, 0xf22895f

    .line 350
    .line 351
    .line 352
    goto :goto_17

    .line 353
    :cond_21
    move/from16 v16, p6

    .line 354
    .line 355
    goto :goto_16

    .line 356
    :goto_17
    if-eqz v19, :cond_22

    .line 357
    .line 358
    sget-object v2, Landroidx/compose/foundation/layout/ContextualFlowRowOverflow;->Companion:Landroidx/compose/foundation/layout/ContextualFlowRowOverflow$Companion;

    .line 359
    .line 360
    invoke-virtual {v2}, Landroidx/compose/foundation/layout/ContextualFlowRowOverflow$Companion;->getClip()Landroidx/compose/foundation/layout/ContextualFlowRowOverflow;

    .line 361
    .line 362
    .line 363
    move-result-object v2

    .line 364
    goto :goto_18

    .line 365
    :cond_22
    move-object/from16 v2, p7

    .line 366
    .line 367
    :goto_18
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 368
    .line 369
    .line 370
    move-result v6

    .line 371
    if-eqz v6, :cond_23

    .line 372
    .line 373
    const/4 v6, -0x1

    .line 374
    const-string/jumbo v7, "androidx.compose.foundation.layout.ContextualFlowRow (ContextualFlowLayout.kt:79)"

    .line 375
    .line 376
    .line 377
    invoke-static {v0, v3, v6, v7}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 378
    .line 379
    .line 380
    :cond_23
    const/high16 v0, 0x1c00000

    .line 381
    .line 382
    and-int/2addr v0, v3

    .line 383
    const/high16 v6, 0x800000

    .line 384
    .line 385
    if-ne v0, v6, :cond_24

    .line 386
    .line 387
    move v6, v4

    .line 388
    goto :goto_19

    .line 389
    :cond_24
    const/4 v6, 0x0

    .line 390
    :goto_19
    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 391
    .line 392
    .line 393
    move-result-object v7

    .line 394
    if-nez v6, :cond_25

    .line 395
    .line 396
    sget-object v6, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    .line 397
    .line 398
    invoke-virtual {v6}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    .line 399
    .line 400
    .line 401
    move-result-object v6

    .line 402
    if-ne v7, v6, :cond_26

    .line 403
    .line 404
    :cond_25
    invoke-virtual {v2}, Landroidx/compose/foundation/layout/FlowLayoutOverflow;->createOverflowState$foundation_layout_release()Landroidx/compose/foundation/layout/FlowLayoutOverflowState;

    .line 405
    .line 406
    .line 407
    move-result-object v7

    .line 408
    invoke-interface {v1, v7}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 409
    .line 410
    .line 411
    :cond_26
    check-cast v7, Landroidx/compose/foundation/layout/FlowLayoutOverflowState;

    .line 412
    .line 413
    const/high16 v6, 0x800000

    .line 414
    .line 415
    if-ne v0, v6, :cond_27

    .line 416
    .line 417
    move v0, v4

    .line 418
    goto :goto_1a

    .line 419
    :cond_27
    const/4 v0, 0x0

    .line 420
    :goto_1a
    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 421
    .line 422
    .line 423
    move-result-object v6

    .line 424
    if-nez v0, :cond_28

    .line 425
    .line 426
    sget-object v0, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    .line 427
    .line 428
    invoke-virtual {v0}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    .line 429
    .line 430
    .line 431
    move-result-object v0

    .line 432
    if-ne v6, v0, :cond_29

    .line 433
    .line 434
    :cond_28
    new-instance v6, Ljava/util/ArrayList;

    .line 435
    .line 436
    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    .line 437
    .line 438
    .line 439
    invoke-virtual {v2, v7, v6}, Landroidx/compose/foundation/layout/FlowLayoutOverflow;->addOverflowComposables$foundation_layout_release(Landroidx/compose/foundation/layout/FlowLayoutOverflowState;Ljava/util/List;)V

    .line 440
    .line 441
    .line 442
    invoke-interface {v1, v6}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 443
    .line 444
    .line 445
    :cond_29
    move-object/from16 v19, v6

    .line 446
    .line 447
    check-cast v19, Ljava/util/List;

    .line 448
    .line 449
    new-instance v0, Landroidx/compose/foundation/layout/ContextualFlowLayoutKt$ContextualFlowRow$measurePolicy$1;

    .line 450
    .line 451
    invoke-direct {v0, v9}, Landroidx/compose/foundation/layout/ContextualFlowLayoutKt$ContextualFlowRow$measurePolicy$1;-><init>(Lkotlin/jvm/functions/Function4;)V

    .line 452
    .line 453
    .line 454
    const/16 v6, 0x36

    .line 455
    .line 456
    const v8, -0x5f597cbf

    .line 457
    .line 458
    .line 459
    invoke-static {v8, v4, v0, v1, v6}, Landroidx/compose/runtime/internal/ComposableLambdaKt;->rememberComposableLambda(IZLjava/lang/Object;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/internal/ComposableLambda;

    .line 460
    .line 461
    .line 462
    move-result-object v20

    .line 463
    shr-int/lit8 v0, v3, 0x6

    .line 464
    .line 465
    and-int/lit8 v4, v0, 0xe

    .line 466
    .line 467
    or-int v4, v4, v18

    .line 468
    .line 469
    and-int/lit8 v6, v0, 0x70

    .line 470
    .line 471
    or-int/2addr v4, v6

    .line 472
    and-int/lit16 v6, v0, 0x380

    .line 473
    .line 474
    or-int/2addr v4, v6

    .line 475
    and-int/lit16 v6, v0, 0x1c00

    .line 476
    .line 477
    or-int/2addr v4, v6

    .line 478
    const v6, 0xe000

    .line 479
    .line 480
    .line 481
    and-int/2addr v0, v6

    .line 482
    or-int/2addr v0, v4

    .line 483
    shl-int/lit8 v4, v3, 0x12

    .line 484
    .line 485
    const/high16 v6, 0x380000

    .line 486
    .line 487
    and-int/2addr v4, v6

    .line 488
    or-int v22, v0, v4

    .line 489
    .line 490
    move/from16 v18, p0

    .line 491
    .line 492
    move-object/from16 v21, v1

    .line 493
    .line 494
    move-object/from16 v17, v7

    .line 495
    .line 496
    invoke-static/range {v12 .. v22}, Landroidx/compose/foundation/layout/ContextualFlowLayoutKt;->contextualRowMeasurementHelper(Landroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/ui/Alignment$Vertical;IILandroidx/compose/foundation/layout/FlowLayoutOverflowState;ILjava/util/List;Lkotlin/jvm/functions/Function4;Landroidx/compose/runtime/Composer;I)Lkotlin/jvm/functions/Function2;

    .line 497
    .line 498
    .line 499
    move-result-object v0

    .line 500
    shr-int/lit8 v3, v3, 0x3

    .line 501
    .line 502
    and-int/lit8 v3, v3, 0xe

    .line 503
    .line 504
    const/4 v4, 0x0

    .line 505
    invoke-static {v5, v0, v1, v3, v4}, Landroidx/compose/ui/layout/SubcomposeLayoutKt;->SubcomposeLayout(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V

    .line 506
    .line 507
    .line 508
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 509
    .line 510
    .line 511
    move-result v0

    .line 512
    if-eqz v0, :cond_2a

    .line 513
    .line 514
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 515
    .line 516
    .line 517
    :cond_2a
    move-object v8, v2

    .line 518
    move-object v3, v12

    .line 519
    move-object v4, v13

    .line 520
    move v6, v15

    .line 521
    move/from16 v7, v16

    .line 522
    .line 523
    :goto_1b
    move-object v2, v5

    .line 524
    move-object v5, v14

    .line 525
    goto :goto_1c

    .line 526
    :cond_2b
    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    .line 527
    .line 528
    .line 529
    move-object/from16 v4, p3

    .line 530
    .line 531
    move/from16 v6, p5

    .line 532
    .line 533
    move-object/from16 v8, p7

    .line 534
    .line 535
    move-object v3, v7

    .line 536
    move/from16 v7, p6

    .line 537
    .line 538
    goto :goto_1b

    .line 539
    :goto_1c
    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    .line 540
    .line 541
    .line 542
    move-result-object v12

    .line 543
    if-eqz v12, :cond_2c

    .line 544
    .line 545
    new-instance v0, Landroidx/compose/foundation/layout/ContextualFlowLayoutKt$ContextualFlowRow$1;

    .line 546
    .line 547
    move/from16 v1, p0

    .line 548
    .line 549
    invoke-direct/range {v0 .. v11}, Landroidx/compose/foundation/layout/ContextualFlowLayoutKt$ContextualFlowRow$1;-><init>(ILandroidx/compose/ui/Modifier;Landroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/ui/Alignment$Vertical;IILandroidx/compose/foundation/layout/ContextualFlowRowOverflow;Lkotlin/jvm/functions/Function4;II)V

    .line 550
    .line 551
    .line 552
    invoke-interface {v12, v0}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lkotlin/jvm/functions/Function2;)V

    .line 553
    .line 554
    .line 555
    :cond_2c
    return-void
.end method

.method public static final contextualColumnMeasureHelper(Landroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/ui/Alignment$Horizontal;IILandroidx/compose/foundation/layout/FlowLayoutOverflowState;ILjava/util/List;Lkotlin/jvm/functions/Function4;Landroidx/compose/runtime/Composer;I)Lkotlin/jvm/functions/Function2;
    .locals 21
    .annotation build Landroidx/compose/runtime/Composable;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/foundation/layout/Arrangement$Vertical;",
            "Landroidx/compose/foundation/layout/Arrangement$Horizontal;",
            "Landroidx/compose/ui/Alignment$Horizontal;",
            "II",
            "Landroidx/compose/foundation/layout/FlowLayoutOverflowState;",
            "I",
            "Ljava/util/List<",
            "+",
            "Lkotlin/jvm/functions/Function2<",
            "-",
            "Landroidx/compose/runtime/Composer;",
            "-",
            "Ljava/lang/Integer;",
            "Lkotlin/Unit;",
            ">;>;",
            "Lkotlin/jvm/functions/Function4<",
            "-",
            "Ljava/lang/Integer;",
            "-",
            "Landroidx/compose/foundation/layout/FlowLineInfo;",
            "-",
            "Landroidx/compose/runtime/Composer;",
            "-",
            "Ljava/lang/Integer;",
            "Lkotlin/Unit;",
            ">;",
            "Landroidx/compose/runtime/Composer;",
            "I)",
            "Lkotlin/jvm/functions/Function2<",
            "Landroidx/compose/ui/layout/SubcomposeMeasureScope;",
            "Landroidx/compose/ui/unit/Constraints;",
            "Landroidx/compose/ui/layout/MeasureResult;",
            ">;"
        }
    .end annotation

    .line 1
    move-object/from16 v0, p2

    .line 2
    .line 3
    move-object/from16 v1, p9

    .line 4
    .line 5
    move/from16 v2, p10

    .line 6
    .line 7
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 8
    .line 9
    .line 10
    move-result v3

    .line 11
    if-eqz v3, :cond_0

    .line 12
    .line 13
    const/4 v3, -0x1

    .line 14
    const-string/jumbo v4, "androidx.compose.foundation.layout.contextualColumnMeasureHelper (ContextualFlowLayout.kt:434)"

    .line 15
    .line 16
    .line 17
    const v5, -0x7658dc9a

    .line 18
    .line 19
    .line 20
    invoke-static {v5, v2, v3, v4}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 21
    .line 22
    .line 23
    :cond_0
    and-int/lit8 v3, v2, 0xe

    .line 24
    .line 25
    xor-int/lit8 v3, v3, 0x6

    .line 26
    .line 27
    const/4 v4, 0x4

    .line 28
    const/4 v5, 0x0

    .line 29
    const/4 v6, 0x1

    .line 30
    move-object/from16 v10, p0

    .line 31
    .line 32
    if-le v3, v4, :cond_1

    .line 33
    .line 34
    invoke-interface {v1, v10}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 35
    .line 36
    .line 37
    move-result v3

    .line 38
    if-nez v3, :cond_2

    .line 39
    .line 40
    :cond_1
    and-int/lit8 v3, v2, 0x6

    .line 41
    .line 42
    if-ne v3, v4, :cond_3

    .line 43
    .line 44
    :cond_2
    move v3, v6

    .line 45
    goto :goto_0

    .line 46
    :cond_3
    move v3, v5

    .line 47
    :goto_0
    and-int/lit8 v4, v2, 0x70

    .line 48
    .line 49
    xor-int/lit8 v4, v4, 0x30

    .line 50
    .line 51
    const/16 v7, 0x20

    .line 52
    .line 53
    move-object/from16 v9, p1

    .line 54
    .line 55
    if-le v4, v7, :cond_4

    .line 56
    .line 57
    invoke-interface {v1, v9}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 58
    .line 59
    .line 60
    move-result v4

    .line 61
    if-nez v4, :cond_5

    .line 62
    .line 63
    :cond_4
    and-int/lit8 v4, v2, 0x30

    .line 64
    .line 65
    if-ne v4, v7, :cond_6

    .line 66
    .line 67
    :cond_5
    move v4, v6

    .line 68
    goto :goto_1

    .line 69
    :cond_6
    move v4, v5

    .line 70
    :goto_1
    or-int/2addr v3, v4

    .line 71
    and-int/lit16 v4, v2, 0x380

    .line 72
    .line 73
    xor-int/lit16 v4, v4, 0x180

    .line 74
    .line 75
    const/16 v7, 0x100

    .line 76
    .line 77
    if-le v4, v7, :cond_7

    .line 78
    .line 79
    invoke-interface {v1, v0}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 80
    .line 81
    .line 82
    move-result v4

    .line 83
    if-nez v4, :cond_8

    .line 84
    .line 85
    :cond_7
    and-int/lit16 v4, v2, 0x180

    .line 86
    .line 87
    if-ne v4, v7, :cond_9

    .line 88
    .line 89
    :cond_8
    move v4, v6

    .line 90
    goto :goto_2

    .line 91
    :cond_9
    move v4, v5

    .line 92
    :goto_2
    or-int/2addr v3, v4

    .line 93
    and-int/lit16 v4, v2, 0x1c00

    .line 94
    .line 95
    xor-int/lit16 v4, v4, 0xc00

    .line 96
    .line 97
    const/16 v7, 0x800

    .line 98
    .line 99
    if-le v4, v7, :cond_a

    .line 100
    .line 101
    move/from16 v4, p3

    .line 102
    .line 103
    invoke-interface {v1, v4}, Landroidx/compose/runtime/Composer;->changed(I)Z

    .line 104
    .line 105
    .line 106
    move-result v8

    .line 107
    if-nez v8, :cond_b

    .line 108
    .line 109
    goto :goto_3

    .line 110
    :cond_a
    move/from16 v4, p3

    .line 111
    .line 112
    :goto_3
    and-int/lit16 v8, v2, 0xc00

    .line 113
    .line 114
    if-ne v8, v7, :cond_c

    .line 115
    .line 116
    :cond_b
    move v7, v6

    .line 117
    goto :goto_4

    .line 118
    :cond_c
    move v7, v5

    .line 119
    :goto_4
    or-int/2addr v3, v7

    .line 120
    const v7, 0xe000

    .line 121
    .line 122
    .line 123
    and-int/2addr v7, v2

    .line 124
    xor-int/lit16 v7, v7, 0x6000

    .line 125
    .line 126
    const/16 v8, 0x4000

    .line 127
    .line 128
    move/from16 v15, p4

    .line 129
    .line 130
    if-le v7, v8, :cond_d

    .line 131
    .line 132
    invoke-interface {v1, v15}, Landroidx/compose/runtime/Composer;->changed(I)Z

    .line 133
    .line 134
    .line 135
    move-result v7

    .line 136
    if-nez v7, :cond_e

    .line 137
    .line 138
    :cond_d
    and-int/lit16 v7, v2, 0x6000

    .line 139
    .line 140
    if-ne v7, v8, :cond_f

    .line 141
    .line 142
    :cond_e
    move v7, v6

    .line 143
    goto :goto_5

    .line 144
    :cond_f
    move v7, v5

    .line 145
    :goto_5
    or-int/2addr v3, v7

    .line 146
    move-object/from16 v7, p5

    .line 147
    .line 148
    invoke-interface {v1, v7}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 149
    .line 150
    .line 151
    move-result v8

    .line 152
    or-int/2addr v3, v8

    .line 153
    const/high16 v8, 0x380000

    .line 154
    .line 155
    and-int/2addr v8, v2

    .line 156
    const/high16 v11, 0x180000

    .line 157
    .line 158
    xor-int/2addr v8, v11

    .line 159
    const/high16 v12, 0x100000

    .line 160
    .line 161
    move/from16 v14, p6

    .line 162
    .line 163
    if-le v8, v12, :cond_10

    .line 164
    .line 165
    invoke-interface {v1, v14}, Landroidx/compose/runtime/Composer;->changed(I)Z

    .line 166
    .line 167
    .line 168
    move-result v8

    .line 169
    if-nez v8, :cond_11

    .line 170
    .line 171
    :cond_10
    and-int v8, v2, v11

    .line 172
    .line 173
    if-ne v8, v12, :cond_12

    .line 174
    .line 175
    :cond_11
    move v8, v6

    .line 176
    goto :goto_6

    .line 177
    :cond_12
    move v8, v5

    .line 178
    :goto_6
    or-int/2addr v3, v8

    .line 179
    const/high16 v8, 0xe000000

    .line 180
    .line 181
    and-int/2addr v8, v2

    .line 182
    const/high16 v11, 0x6000000

    .line 183
    .line 184
    xor-int/2addr v8, v11

    .line 185
    const/high16 v12, 0x4000000

    .line 186
    .line 187
    if-le v8, v12, :cond_13

    .line 188
    .line 189
    move-object/from16 v8, p8

    .line 190
    .line 191
    invoke-interface {v1, v8}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 192
    .line 193
    .line 194
    move-result v13

    .line 195
    if-nez v13, :cond_14

    .line 196
    .line 197
    goto :goto_7

    .line 198
    :cond_13
    move-object/from16 v8, p8

    .line 199
    .line 200
    :goto_7
    and-int/2addr v2, v11

    .line 201
    if-ne v2, v12, :cond_15

    .line 202
    .line 203
    :cond_14
    move v5, v6

    .line 204
    :cond_15
    or-int v2, v3, v5

    .line 205
    .line 206
    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 207
    .line 208
    .line 209
    move-result-object v3

    .line 210
    if-nez v2, :cond_16

    .line 211
    .line 212
    sget-object v2, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    .line 213
    .line 214
    invoke-virtual {v2}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    .line 215
    .line 216
    .line 217
    move-result-object v2

    .line 218
    if-ne v3, v2, :cond_17

    .line 219
    .line 220
    :cond_16
    invoke-interface {v10}, Landroidx/compose/foundation/layout/Arrangement$Vertical;->getSpacing-D9Ej5fM()F

    .line 221
    .line 222
    .line 223
    move-result v11

    .line 224
    sget-object v2, Landroidx/compose/foundation/layout/CrossAxisAlignment;->Companion:Landroidx/compose/foundation/layout/CrossAxisAlignment$Companion;

    .line 225
    .line 226
    invoke-virtual {v2, v0}, Landroidx/compose/foundation/layout/CrossAxisAlignment$Companion;->horizontal$foundation_layout_release(Landroidx/compose/ui/Alignment$Horizontal;)Landroidx/compose/foundation/layout/CrossAxisAlignment;

    .line 227
    .line 228
    .line 229
    move-result-object v12

    .line 230
    invoke-interface {v9}, Landroidx/compose/foundation/layout/Arrangement$Horizontal;->getSpacing-D9Ej5fM()F

    .line 231
    .line 232
    .line 233
    move-result v13

    .line 234
    new-instance v7, Landroidx/compose/foundation/layout/FlowMeasureLazyPolicy;

    .line 235
    .line 236
    const/4 v8, 0x0

    .line 237
    const/16 v20, 0x0

    .line 238
    .line 239
    move-object/from16 v17, p5

    .line 240
    .line 241
    move-object/from16 v18, p7

    .line 242
    .line 243
    move-object/from16 v19, p8

    .line 244
    .line 245
    move/from16 v16, v4

    .line 246
    .line 247
    invoke-direct/range {v7 .. v20}, Landroidx/compose/foundation/layout/FlowMeasureLazyPolicy;-><init>(ZLandroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/foundation/layout/Arrangement$Vertical;FLandroidx/compose/foundation/layout/CrossAxisAlignment;FIIILandroidx/compose/foundation/layout/FlowLayoutOverflowState;Ljava/util/List;Lkotlin/jvm/functions/Function4;Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 248
    .line 249
    .line 250
    invoke-virtual {v7}, Landroidx/compose/foundation/layout/FlowMeasureLazyPolicy;->getMeasurePolicy()Lkotlin/jvm/functions/Function2;

    .line 251
    .line 252
    .line 253
    move-result-object v3

    .line 254
    invoke-interface {v1, v3}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 255
    .line 256
    .line 257
    :cond_17
    check-cast v3, Lkotlin/jvm/functions/Function2;

    .line 258
    .line 259
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 260
    .line 261
    .line 262
    move-result v0

    .line 263
    if-eqz v0, :cond_18

    .line 264
    .line 265
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 266
    .line 267
    .line 268
    :cond_18
    return-object v3
.end method

.method public static final contextualRowMeasurementHelper(Landroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/ui/Alignment$Vertical;IILandroidx/compose/foundation/layout/FlowLayoutOverflowState;ILjava/util/List;Lkotlin/jvm/functions/Function4;Landroidx/compose/runtime/Composer;I)Lkotlin/jvm/functions/Function2;
    .locals 21
    .annotation build Landroidx/compose/runtime/Composable;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/foundation/layout/Arrangement$Horizontal;",
            "Landroidx/compose/foundation/layout/Arrangement$Vertical;",
            "Landroidx/compose/ui/Alignment$Vertical;",
            "II",
            "Landroidx/compose/foundation/layout/FlowLayoutOverflowState;",
            "I",
            "Ljava/util/List<",
            "+",
            "Lkotlin/jvm/functions/Function2<",
            "-",
            "Landroidx/compose/runtime/Composer;",
            "-",
            "Ljava/lang/Integer;",
            "Lkotlin/Unit;",
            ">;>;",
            "Lkotlin/jvm/functions/Function4<",
            "-",
            "Ljava/lang/Integer;",
            "-",
            "Landroidx/compose/foundation/layout/FlowLineInfo;",
            "-",
            "Landroidx/compose/runtime/Composer;",
            "-",
            "Ljava/lang/Integer;",
            "Lkotlin/Unit;",
            ">;",
            "Landroidx/compose/runtime/Composer;",
            "I)",
            "Lkotlin/jvm/functions/Function2<",
            "Landroidx/compose/ui/layout/SubcomposeMeasureScope;",
            "Landroidx/compose/ui/unit/Constraints;",
            "Landroidx/compose/ui/layout/MeasureResult;",
            ">;"
        }
    .end annotation

    .line 1
    move-object/from16 v0, p2

    .line 2
    .line 3
    move-object/from16 v1, p9

    .line 4
    .line 5
    move/from16 v2, p10

    .line 6
    .line 7
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 8
    .line 9
    .line 10
    move-result v3

    .line 11
    if-eqz v3, :cond_0

    .line 12
    .line 13
    const/4 v3, -0x1

    .line 14
    const-string/jumbo v4, "androidx.compose.foundation.layout.contextualRowMeasurementHelper (ContextualFlowLayout.kt:394)"

    .line 15
    .line 16
    .line 17
    const v5, 0x2ed6bd30

    .line 18
    .line 19
    .line 20
    invoke-static {v5, v2, v3, v4}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 21
    .line 22
    .line 23
    :cond_0
    and-int/lit8 v3, v2, 0xe

    .line 24
    .line 25
    xor-int/lit8 v3, v3, 0x6

    .line 26
    .line 27
    const/4 v4, 0x4

    .line 28
    const/4 v5, 0x0

    .line 29
    const/4 v6, 0x1

    .line 30
    move-object/from16 v9, p0

    .line 31
    .line 32
    if-le v3, v4, :cond_1

    .line 33
    .line 34
    invoke-interface {v1, v9}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 35
    .line 36
    .line 37
    move-result v3

    .line 38
    if-nez v3, :cond_2

    .line 39
    .line 40
    :cond_1
    and-int/lit8 v3, v2, 0x6

    .line 41
    .line 42
    if-ne v3, v4, :cond_3

    .line 43
    .line 44
    :cond_2
    move v3, v6

    .line 45
    goto :goto_0

    .line 46
    :cond_3
    move v3, v5

    .line 47
    :goto_0
    and-int/lit8 v4, v2, 0x70

    .line 48
    .line 49
    xor-int/lit8 v4, v4, 0x30

    .line 50
    .line 51
    const/16 v7, 0x20

    .line 52
    .line 53
    move-object/from16 v10, p1

    .line 54
    .line 55
    if-le v4, v7, :cond_4

    .line 56
    .line 57
    invoke-interface {v1, v10}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 58
    .line 59
    .line 60
    move-result v4

    .line 61
    if-nez v4, :cond_5

    .line 62
    .line 63
    :cond_4
    and-int/lit8 v4, v2, 0x30

    .line 64
    .line 65
    if-ne v4, v7, :cond_6

    .line 66
    .line 67
    :cond_5
    move v4, v6

    .line 68
    goto :goto_1

    .line 69
    :cond_6
    move v4, v5

    .line 70
    :goto_1
    or-int/2addr v3, v4

    .line 71
    and-int/lit16 v4, v2, 0x380

    .line 72
    .line 73
    xor-int/lit16 v4, v4, 0x180

    .line 74
    .line 75
    const/16 v7, 0x100

    .line 76
    .line 77
    if-le v4, v7, :cond_7

    .line 78
    .line 79
    invoke-interface {v1, v0}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 80
    .line 81
    .line 82
    move-result v4

    .line 83
    if-nez v4, :cond_8

    .line 84
    .line 85
    :cond_7
    and-int/lit16 v4, v2, 0x180

    .line 86
    .line 87
    if-ne v4, v7, :cond_9

    .line 88
    .line 89
    :cond_8
    move v4, v6

    .line 90
    goto :goto_2

    .line 91
    :cond_9
    move v4, v5

    .line 92
    :goto_2
    or-int/2addr v3, v4

    .line 93
    and-int/lit16 v4, v2, 0x1c00

    .line 94
    .line 95
    xor-int/lit16 v4, v4, 0xc00

    .line 96
    .line 97
    const/16 v7, 0x800

    .line 98
    .line 99
    if-le v4, v7, :cond_a

    .line 100
    .line 101
    move/from16 v4, p3

    .line 102
    .line 103
    invoke-interface {v1, v4}, Landroidx/compose/runtime/Composer;->changed(I)Z

    .line 104
    .line 105
    .line 106
    move-result v8

    .line 107
    if-nez v8, :cond_b

    .line 108
    .line 109
    goto :goto_3

    .line 110
    :cond_a
    move/from16 v4, p3

    .line 111
    .line 112
    :goto_3
    and-int/lit16 v8, v2, 0xc00

    .line 113
    .line 114
    if-ne v8, v7, :cond_c

    .line 115
    .line 116
    :cond_b
    move v7, v6

    .line 117
    goto :goto_4

    .line 118
    :cond_c
    move v7, v5

    .line 119
    :goto_4
    or-int/2addr v3, v7

    .line 120
    const v7, 0xe000

    .line 121
    .line 122
    .line 123
    and-int/2addr v7, v2

    .line 124
    xor-int/lit16 v7, v7, 0x6000

    .line 125
    .line 126
    const/16 v8, 0x4000

    .line 127
    .line 128
    move/from16 v15, p4

    .line 129
    .line 130
    if-le v7, v8, :cond_d

    .line 131
    .line 132
    invoke-interface {v1, v15}, Landroidx/compose/runtime/Composer;->changed(I)Z

    .line 133
    .line 134
    .line 135
    move-result v7

    .line 136
    if-nez v7, :cond_e

    .line 137
    .line 138
    :cond_d
    and-int/lit16 v7, v2, 0x6000

    .line 139
    .line 140
    if-ne v7, v8, :cond_f

    .line 141
    .line 142
    :cond_e
    move v7, v6

    .line 143
    goto :goto_5

    .line 144
    :cond_f
    move v7, v5

    .line 145
    :goto_5
    or-int/2addr v3, v7

    .line 146
    move-object/from16 v7, p5

    .line 147
    .line 148
    invoke-interface {v1, v7}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 149
    .line 150
    .line 151
    move-result v8

    .line 152
    or-int/2addr v3, v8

    .line 153
    const/high16 v8, 0x380000

    .line 154
    .line 155
    and-int/2addr v8, v2

    .line 156
    const/high16 v11, 0x180000

    .line 157
    .line 158
    xor-int/2addr v8, v11

    .line 159
    const/high16 v12, 0x100000

    .line 160
    .line 161
    move/from16 v14, p6

    .line 162
    .line 163
    if-le v8, v12, :cond_10

    .line 164
    .line 165
    invoke-interface {v1, v14}, Landroidx/compose/runtime/Composer;->changed(I)Z

    .line 166
    .line 167
    .line 168
    move-result v8

    .line 169
    if-nez v8, :cond_11

    .line 170
    .line 171
    :cond_10
    and-int v8, v2, v11

    .line 172
    .line 173
    if-ne v8, v12, :cond_12

    .line 174
    .line 175
    :cond_11
    move v8, v6

    .line 176
    goto :goto_6

    .line 177
    :cond_12
    move v8, v5

    .line 178
    :goto_6
    or-int/2addr v3, v8

    .line 179
    const/high16 v8, 0xe000000

    .line 180
    .line 181
    and-int/2addr v8, v2

    .line 182
    const/high16 v11, 0x6000000

    .line 183
    .line 184
    xor-int/2addr v8, v11

    .line 185
    const/high16 v12, 0x4000000

    .line 186
    .line 187
    if-le v8, v12, :cond_13

    .line 188
    .line 189
    move-object/from16 v8, p8

    .line 190
    .line 191
    invoke-interface {v1, v8}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 192
    .line 193
    .line 194
    move-result v13

    .line 195
    if-nez v13, :cond_14

    .line 196
    .line 197
    goto :goto_7

    .line 198
    :cond_13
    move-object/from16 v8, p8

    .line 199
    .line 200
    :goto_7
    and-int/2addr v2, v11

    .line 201
    if-ne v2, v12, :cond_15

    .line 202
    .line 203
    :cond_14
    move v5, v6

    .line 204
    :cond_15
    or-int v2, v3, v5

    .line 205
    .line 206
    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 207
    .line 208
    .line 209
    move-result-object v3

    .line 210
    if-nez v2, :cond_16

    .line 211
    .line 212
    sget-object v2, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    .line 213
    .line 214
    invoke-virtual {v2}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    .line 215
    .line 216
    .line 217
    move-result-object v2

    .line 218
    if-ne v3, v2, :cond_17

    .line 219
    .line 220
    :cond_16
    invoke-interface {v9}, Landroidx/compose/foundation/layout/Arrangement$Horizontal;->getSpacing-D9Ej5fM()F

    .line 221
    .line 222
    .line 223
    move-result v11

    .line 224
    sget-object v2, Landroidx/compose/foundation/layout/CrossAxisAlignment;->Companion:Landroidx/compose/foundation/layout/CrossAxisAlignment$Companion;

    .line 225
    .line 226
    invoke-virtual {v2, v0}, Landroidx/compose/foundation/layout/CrossAxisAlignment$Companion;->vertical$foundation_layout_release(Landroidx/compose/ui/Alignment$Vertical;)Landroidx/compose/foundation/layout/CrossAxisAlignment;

    .line 227
    .line 228
    .line 229
    move-result-object v12

    .line 230
    invoke-interface {v10}, Landroidx/compose/foundation/layout/Arrangement$Vertical;->getSpacing-D9Ej5fM()F

    .line 231
    .line 232
    .line 233
    move-result v13

    .line 234
    new-instance v7, Landroidx/compose/foundation/layout/FlowMeasureLazyPolicy;

    .line 235
    .line 236
    const/4 v8, 0x1

    .line 237
    const/16 v20, 0x0

    .line 238
    .line 239
    move-object/from16 v17, p5

    .line 240
    .line 241
    move-object/from16 v18, p7

    .line 242
    .line 243
    move-object/from16 v19, p8

    .line 244
    .line 245
    move/from16 v16, v4

    .line 246
    .line 247
    invoke-direct/range {v7 .. v20}, Landroidx/compose/foundation/layout/FlowMeasureLazyPolicy;-><init>(ZLandroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/foundation/layout/Arrangement$Vertical;FLandroidx/compose/foundation/layout/CrossAxisAlignment;FIIILandroidx/compose/foundation/layout/FlowLayoutOverflowState;Ljava/util/List;Lkotlin/jvm/functions/Function4;Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 248
    .line 249
    .line 250
    invoke-virtual {v7}, Landroidx/compose/foundation/layout/FlowMeasureLazyPolicy;->getMeasurePolicy()Lkotlin/jvm/functions/Function2;

    .line 251
    .line 252
    .line 253
    move-result-object v3

    .line 254
    invoke-interface {v1, v3}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 255
    .line 256
    .line 257
    :cond_17
    check-cast v3, Lkotlin/jvm/functions/Function2;

    .line 258
    .line 259
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 260
    .line 261
    .line 262
    move-result v0

    .line 263
    if-eqz v0, :cond_18

    .line 264
    .line 265
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 266
    .line 267
    .line 268
    :cond_18
    return-object v3
.end method
