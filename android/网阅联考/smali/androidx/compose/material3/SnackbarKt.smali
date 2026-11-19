.class public final Landroidx/compose/material3/SnackbarKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000D\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\t\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\t\u001ah\u0010\n\u001a\u00020\u000b2\u0011\u0010\u000c\u001a\r\u0012\u0004\u0012\u00020\u000b0\r\u00a2\u0006\u0002\u0008\u000e2\u0011\u0010\u000f\u001a\r\u0012\u0004\u0012\u00020\u000b0\r\u00a2\u0006\u0002\u0008\u000e2\u0013\u0010\u0010\u001a\u000f\u0012\u0004\u0012\u00020\u000b\u0018\u00010\r\u00a2\u0006\u0002\u0008\u000e2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0014H\u0003\u00f8\u0001\u0001\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008\u0016\u0010\u0017\u001aj\u0010\u0018\u001a\u00020\u000b2\u0011\u0010\u000c\u001a\r\u0012\u0004\u0012\u00020\u000b0\r\u00a2\u0006\u0002\u0008\u000e2\u0013\u0010\u000f\u001a\u000f\u0012\u0004\u0012\u00020\u000b\u0018\u00010\r\u00a2\u0006\u0002\u0008\u000e2\u0013\u0010\u0010\u001a\u000f\u0012\u0004\u0012\u00020\u000b\u0018\u00010\r\u00a2\u0006\u0002\u0008\u000e2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0019\u001a\u00020\u00142\u0006\u0010\u001a\u001a\u00020\u0014H\u0003\u00f8\u0001\u0001\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008\u001b\u0010\u0017\u001am\u0010\u001c\u001a\u00020\u000b2\u0006\u0010\u001d\u001a\u00020\u001e2\u0008\u0008\u0002\u0010\u001f\u001a\u00020 2\u0008\u0008\u0002\u0010!\u001a\u00020\"2\u0008\u0008\u0002\u0010#\u001a\u00020$2\u0008\u0008\u0002\u0010%\u001a\u00020\u00142\u0008\u0008\u0002\u0010&\u001a\u00020\u00142\u0008\u0008\u0002\u0010\'\u001a\u00020\u00142\u0008\u0008\u0002\u0010\u0013\u001a\u00020\u00142\u0008\u0008\u0002\u0010\u0015\u001a\u00020\u0014H\u0007\u00f8\u0001\u0001\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008(\u0010)\u001a\u009c\u0001\u0010\u001c\u001a\u00020\u000b2\u0008\u0008\u0002\u0010\u001f\u001a\u00020 2\u0015\u0008\u0002\u0010\u000f\u001a\u000f\u0012\u0004\u0012\u00020\u000b\u0018\u00010\r\u00a2\u0006\u0002\u0008\u000e2\u0015\u0008\u0002\u0010\u0010\u001a\u000f\u0012\u0004\u0012\u00020\u000b\u0018\u00010\r\u00a2\u0006\u0002\u0008\u000e2\u0008\u0008\u0002\u0010!\u001a\u00020\"2\u0008\u0008\u0002\u0010#\u001a\u00020$2\u0008\u0008\u0002\u0010%\u001a\u00020\u00142\u0008\u0008\u0002\u0010&\u001a\u00020\u00142\u0008\u0008\u0002\u0010\u0013\u001a\u00020\u00142\u0008\u0008\u0002\u0010\u0015\u001a\u00020\u00142\u0011\u0010*\u001a\r\u0012\u0004\u0012\u00020\u000b0\r\u00a2\u0006\u0002\u0008\u000eH\u0007\u00f8\u0001\u0001\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008+\u0010,\"\u0013\u0010\u0000\u001a\u00020\u0001X\u0082\u0004\u00f8\u0001\u0000\u00a2\u0006\u0004\n\u0002\u0010\u0002\"\u0013\u0010\u0003\u001a\u00020\u0001X\u0082\u0004\u00f8\u0001\u0000\u00a2\u0006\u0004\n\u0002\u0010\u0002\"\u0013\u0010\u0004\u001a\u00020\u0001X\u0082\u0004\u00f8\u0001\u0000\u00a2\u0006\u0004\n\u0002\u0010\u0002\"\u0013\u0010\u0005\u001a\u00020\u0001X\u0082\u0004\u00f8\u0001\u0000\u00a2\u0006\u0004\n\u0002\u0010\u0002\"\u0013\u0010\u0006\u001a\u00020\u0001X\u0082\u0004\u00f8\u0001\u0000\u00a2\u0006\u0004\n\u0002\u0010\u0002\"\u0013\u0010\u0007\u001a\u00020\u0001X\u0082\u0004\u00f8\u0001\u0000\u00a2\u0006\u0004\n\u0002\u0010\u0002\"\u0013\u0010\u0008\u001a\u00020\u0001X\u0082\u0004\u00f8\u0001\u0000\u00a2\u0006\u0004\n\u0002\u0010\u0002\"\u0013\u0010\t\u001a\u00020\u0001X\u0082\u0004\u00f8\u0001\u0000\u00a2\u0006\u0004\n\u0002\u0010\u0002\u0082\u0002\u000b\n\u0002\u0008\u0019\n\u0005\u0008\u00a1\u001e0\u0001\u00a8\u0006-"
    }
    d2 = {
        "ContainerMaxWidth",
        "Landroidx/compose/ui/unit/Dp;",
        "F",
        "HeightToFirstLine",
        "HorizontalSpacing",
        "HorizontalSpacingButtonSide",
        "LongButtonVerticalOffset",
        "SeparateButtonExtraY",
        "SnackbarVerticalPadding",
        "TextEndExtraSpacing",
        "NewLineButtonSnackbar",
        "",
        "text",
        "Lkotlin/Function0;",
        "Landroidx/compose/runtime/Composable;",
        "action",
        "dismissAction",
        "actionTextStyle",
        "Landroidx/compose/ui/text/TextStyle;",
        "actionContentColor",
        "Landroidx/compose/ui/graphics/Color;",
        "dismissActionContentColor",
        "NewLineButtonSnackbar-kKq0p4A",
        "(Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/text/TextStyle;JJLandroidx/compose/runtime/Composer;I)V",
        "OneRowSnackbar",
        "actionTextColor",
        "dismissActionColor",
        "OneRowSnackbar-kKq0p4A",
        "Snackbar",
        "snackbarData",
        "Landroidx/compose/material3/SnackbarData;",
        "modifier",
        "Landroidx/compose/ui/Modifier;",
        "actionOnNewLine",
        "",
        "shape",
        "Landroidx/compose/ui/graphics/Shape;",
        "containerColor",
        "contentColor",
        "actionColor",
        "Snackbar-sDKtq54",
        "(Landroidx/compose/material3/SnackbarData;Landroidx/compose/ui/Modifier;ZLandroidx/compose/ui/graphics/Shape;JJJJJLandroidx/compose/runtime/Composer;II)V",
        "content",
        "Snackbar-eQBnUkQ",
        "(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;ZLandroidx/compose/ui/graphics/Shape;JJJJLkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V",
        "material3_release"
    }
    k = 0x2
    mv = {
        0x1,
        0x7,
        0x1
    }
    xi = 0x30
.end annotation


# static fields
.field private static final ContainerMaxWidth:F

.field private static final HeightToFirstLine:F

.field private static final HorizontalSpacing:F

.field private static final HorizontalSpacingButtonSide:F

.field private static final LongButtonVerticalOffset:F

.field private static final SeparateButtonExtraY:F

.field private static final SnackbarVerticalPadding:F

.field private static final TextEndExtraSpacing:F


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    .line 1
    const/16 v0, 0x258

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
    sput v0, Landroidx/compose/material3/SnackbarKt;->ContainerMaxWidth:F

    .line 9
    .line 10
    const/16 v0, 0x1e

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
    sput v0, Landroidx/compose/material3/SnackbarKt;->HeightToFirstLine:F

    .line 18
    .line 19
    const/16 v0, 0x10

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
    sput v0, Landroidx/compose/material3/SnackbarKt;->HorizontalSpacing:F

    .line 27
    .line 28
    const/16 v0, 0x8

    .line 29
    .line 30
    int-to-float v0, v0

    .line 31
    invoke-static {v0}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 32
    .line 33
    .line 34
    move-result v1

    .line 35
    sput v1, Landroidx/compose/material3/SnackbarKt;->HorizontalSpacingButtonSide:F

    .line 36
    .line 37
    const/4 v1, 0x2

    .line 38
    int-to-float v1, v1

    .line 39
    invoke-static {v1}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 40
    .line 41
    .line 42
    move-result v1

    .line 43
    sput v1, Landroidx/compose/material3/SnackbarKt;->SeparateButtonExtraY:F

    .line 44
    .line 45
    const/4 v1, 0x6

    .line 46
    int-to-float v1, v1

    .line 47
    invoke-static {v1}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 48
    .line 49
    .line 50
    move-result v1

    .line 51
    sput v1, Landroidx/compose/material3/SnackbarKt;->SnackbarVerticalPadding:F

    .line 52
    .line 53
    invoke-static {v0}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 54
    .line 55
    .line 56
    move-result v0

    .line 57
    sput v0, Landroidx/compose/material3/SnackbarKt;->TextEndExtraSpacing:F

    .line 58
    .line 59
    const/16 v0, 0xc

    .line 60
    .line 61
    int-to-float v0, v0

    .line 62
    invoke-static {v0}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 63
    .line 64
    .line 65
    move-result v0

    .line 66
    sput v0, Landroidx/compose/material3/SnackbarKt;->LongButtonVerticalOffset:F

    .line 67
    .line 68
    return-void
.end method

.method private static final NewLineButtonSnackbar-kKq0p4A(Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/text/TextStyle;JJLandroidx/compose/runtime/Composer;I)V
    .locals 30
    .annotation build Landroidx/compose/runtime/Composable;
    .end annotation

    .annotation build Landroidx/compose/runtime/ComposableInferredTarget;
        scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function2<",
            "-",
            "Landroidx/compose/runtime/Composer;",
            "-",
            "Ljava/lang/Integer;",
            "Lkotlin/Unit;",
            ">;",
            "Lkotlin/jvm/functions/Function2<",
            "-",
            "Landroidx/compose/runtime/Composer;",
            "-",
            "Ljava/lang/Integer;",
            "Lkotlin/Unit;",
            ">;",
            "Lkotlin/jvm/functions/Function2<",
            "-",
            "Landroidx/compose/runtime/Composer;",
            "-",
            "Ljava/lang/Integer;",
            "Lkotlin/Unit;",
            ">;",
            "Landroidx/compose/ui/text/TextStyle;",
            "JJ",
            "Landroidx/compose/runtime/Composer;",
            "I)V"
        }
    .end annotation

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
    move/from16 v9, p9

    .line 10
    .line 11
    const v0, -0x4f6c4929

    .line 12
    .line 13
    .line 14
    move-object/from16 v5, p8

    .line 15
    .line 16
    invoke-interface {v5, v0}, Landroidx/compose/runtime/Composer;->startRestartGroup(I)Landroidx/compose/runtime/Composer;

    .line 17
    .line 18
    .line 19
    move-result-object v5

    .line 20
    and-int/lit8 v6, v9, 0xe

    .line 21
    .line 22
    if-nez v6, :cond_1

    .line 23
    .line 24
    invoke-interface {v5, v1}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 25
    .line 26
    .line 27
    move-result v6

    .line 28
    if-eqz v6, :cond_0

    .line 29
    .line 30
    const/4 v6, 0x4

    .line 31
    goto :goto_0

    .line 32
    :cond_0
    const/4 v6, 0x2

    .line 33
    :goto_0
    or-int/2addr v6, v9

    .line 34
    goto :goto_1

    .line 35
    :cond_1
    move v6, v9

    .line 36
    :goto_1
    and-int/lit8 v8, v9, 0x70

    .line 37
    .line 38
    if-nez v8, :cond_3

    .line 39
    .line 40
    invoke-interface {v5, v2}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 41
    .line 42
    .line 43
    move-result v8

    .line 44
    if-eqz v8, :cond_2

    .line 45
    .line 46
    const/16 v8, 0x20

    .line 47
    .line 48
    goto :goto_2

    .line 49
    :cond_2
    const/16 v8, 0x10

    .line 50
    .line 51
    :goto_2
    or-int/2addr v6, v8

    .line 52
    :cond_3
    and-int/lit16 v8, v9, 0x380

    .line 53
    .line 54
    if-nez v8, :cond_5

    .line 55
    .line 56
    invoke-interface {v5, v3}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 57
    .line 58
    .line 59
    move-result v8

    .line 60
    if-eqz v8, :cond_4

    .line 61
    .line 62
    const/16 v8, 0x100

    .line 63
    .line 64
    goto :goto_3

    .line 65
    :cond_4
    const/16 v8, 0x80

    .line 66
    .line 67
    :goto_3
    or-int/2addr v6, v8

    .line 68
    :cond_5
    and-int/lit16 v8, v9, 0x1c00

    .line 69
    .line 70
    if-nez v8, :cond_7

    .line 71
    .line 72
    invoke-interface {v5, v4}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 73
    .line 74
    .line 75
    move-result v8

    .line 76
    if-eqz v8, :cond_6

    .line 77
    .line 78
    const/16 v8, 0x800

    .line 79
    .line 80
    goto :goto_4

    .line 81
    :cond_6
    const/16 v8, 0x400

    .line 82
    .line 83
    :goto_4
    or-int/2addr v6, v8

    .line 84
    :cond_7
    const v8, 0xe000

    .line 85
    .line 86
    .line 87
    and-int/2addr v8, v9

    .line 88
    move-wide/from16 v10, p4

    .line 89
    .line 90
    if-nez v8, :cond_9

    .line 91
    .line 92
    invoke-interface {v5, v10, v11}, Landroidx/compose/runtime/Composer;->changed(J)Z

    .line 93
    .line 94
    .line 95
    move-result v8

    .line 96
    if-eqz v8, :cond_8

    .line 97
    .line 98
    const/16 v8, 0x4000

    .line 99
    .line 100
    goto :goto_5

    .line 101
    :cond_8
    const/16 v8, 0x2000

    .line 102
    .line 103
    :goto_5
    or-int/2addr v6, v8

    .line 104
    :cond_9
    const/high16 v8, 0x70000

    .line 105
    .line 106
    and-int/2addr v8, v9

    .line 107
    move-wide/from16 v12, p6

    .line 108
    .line 109
    if-nez v8, :cond_b

    .line 110
    .line 111
    invoke-interface {v5, v12, v13}, Landroidx/compose/runtime/Composer;->changed(J)Z

    .line 112
    .line 113
    .line 114
    move-result v8

    .line 115
    if-eqz v8, :cond_a

    .line 116
    .line 117
    const/high16 v8, 0x20000

    .line 118
    .line 119
    goto :goto_6

    .line 120
    :cond_a
    const/high16 v8, 0x10000

    .line 121
    .line 122
    :goto_6
    or-int/2addr v6, v8

    .line 123
    :cond_b
    const v8, 0x5b6db

    .line 124
    .line 125
    .line 126
    and-int/2addr v8, v6

    .line 127
    const v14, 0x12492

    .line 128
    .line 129
    .line 130
    if-ne v8, v14, :cond_d

    .line 131
    .line 132
    invoke-interface {v5}, Landroidx/compose/runtime/Composer;->getSkipping()Z

    .line 133
    .line 134
    .line 135
    move-result v8

    .line 136
    if-nez v8, :cond_c

    .line 137
    .line 138
    goto :goto_7

    .line 139
    :cond_c
    invoke-interface {v5}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    .line 140
    .line 141
    .line 142
    move-object v8, v2

    .line 143
    goto/16 :goto_d

    .line 144
    .line 145
    :cond_d
    :goto_7
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 146
    .line 147
    .line 148
    move-result v8

    .line 149
    if-eqz v8, :cond_e

    .line 150
    .line 151
    const/4 v8, -0x1

    .line 152
    const-string v14, "androidx.compose.material3.NewLineButtonSnackbar (Snackbar.kt:248)"

    .line 153
    .line 154
    invoke-static {v0, v6, v8, v14}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 155
    .line 156
    .line 157
    :cond_e
    sget-object v0, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    .line 158
    .line 159
    sget v8, Landroidx/compose/material3/SnackbarKt;->ContainerMaxWidth:F

    .line 160
    .line 161
    const/4 v14, 0x0

    .line 162
    const/4 v15, 0x1

    .line 163
    const/4 v7, 0x0

    .line 164
    invoke-static {v0, v14, v8, v15, v7}, Landroidx/compose/foundation/layout/SizeKt;->widthIn-VpY3zN4$default(Landroidx/compose/ui/Modifier;FFILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    .line 165
    .line 166
    .line 167
    move-result-object v8

    .line 168
    invoke-static {v8, v14, v15, v7}, Landroidx/compose/foundation/layout/SizeKt;->fillMaxWidth$default(Landroidx/compose/ui/Modifier;FILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    .line 169
    .line 170
    .line 171
    move-result-object v16

    .line 172
    sget v17, Landroidx/compose/material3/SnackbarKt;->HorizontalSpacing:F

    .line 173
    .line 174
    const/16 v18, 0x0

    .line 175
    .line 176
    const/16 v19, 0x0

    .line 177
    .line 178
    sget v20, Landroidx/compose/material3/SnackbarKt;->SeparateButtonExtraY:F

    .line 179
    .line 180
    const/16 v21, 0x6

    .line 181
    .line 182
    const/16 v22, 0x0

    .line 183
    .line 184
    invoke-static/range {v16 .. v22}, Landroidx/compose/foundation/layout/PaddingKt;->padding-qDBjuR0$default(Landroidx/compose/ui/Modifier;FFFFILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    .line 185
    .line 186
    .line 187
    move-result-object v7

    .line 188
    const v8, -0x1cd0f17e

    .line 189
    .line 190
    .line 191
    invoke-interface {v5, v8}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 192
    .line 193
    .line 194
    sget-object v8, Landroidx/compose/foundation/layout/Arrangement;->INSTANCE:Landroidx/compose/foundation/layout/Arrangement;

    .line 195
    .line 196
    invoke-virtual {v8}, Landroidx/compose/foundation/layout/Arrangement;->getTop()Landroidx/compose/foundation/layout/Arrangement$Vertical;

    .line 197
    .line 198
    .line 199
    move-result-object v14

    .line 200
    sget-object v16, Landroidx/compose/ui/Alignment;->Companion:Landroidx/compose/ui/Alignment$Companion;

    .line 201
    .line 202
    invoke-virtual/range {v16 .. v16}, Landroidx/compose/ui/Alignment$Companion;->getStart()Landroidx/compose/ui/Alignment$Horizontal;

    .line 203
    .line 204
    .line 205
    move-result-object v15

    .line 206
    const/4 v9, 0x0

    .line 207
    invoke-static {v14, v15, v5, v9}, Landroidx/compose/foundation/layout/ColumnKt;->columnMeasurePolicy(Landroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/ui/Alignment$Horizontal;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/layout/MeasurePolicy;

    .line 208
    .line 209
    .line 210
    move-result-object v14

    .line 211
    const v15, -0x4ee9b9da

    .line 212
    .line 213
    .line 214
    invoke-interface {v5, v15}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 215
    .line 216
    .line 217
    invoke-static {}, Landroidx/compose/ui/platform/CompositionLocalsKt;->getLocalDensity()Landroidx/compose/runtime/ProvidableCompositionLocal;

    .line 218
    .line 219
    .line 220
    move-result-object v15

    .line 221
    invoke-interface {v5, v15}, Landroidx/compose/runtime/Composer;->consume(Landroidx/compose/runtime/CompositionLocal;)Ljava/lang/Object;

    .line 222
    .line 223
    .line 224
    move-result-object v15

    .line 225
    check-cast v15, Landroidx/compose/ui/unit/Density;

    .line 226
    .line 227
    invoke-static {}, Landroidx/compose/ui/platform/CompositionLocalsKt;->getLocalLayoutDirection()Landroidx/compose/runtime/ProvidableCompositionLocal;

    .line 228
    .line 229
    .line 230
    move-result-object v9

    .line 231
    invoke-interface {v5, v9}, Landroidx/compose/runtime/Composer;->consume(Landroidx/compose/runtime/CompositionLocal;)Ljava/lang/Object;

    .line 232
    .line 233
    .line 234
    move-result-object v9

    .line 235
    check-cast v9, Landroidx/compose/ui/unit/LayoutDirection;

    .line 236
    .line 237
    invoke-static {}, Landroidx/compose/ui/platform/CompositionLocalsKt;->getLocalViewConfiguration()Landroidx/compose/runtime/ProvidableCompositionLocal;

    .line 238
    .line 239
    .line 240
    move-result-object v10

    .line 241
    invoke-interface {v5, v10}, Landroidx/compose/runtime/Composer;->consume(Landroidx/compose/runtime/CompositionLocal;)Ljava/lang/Object;

    .line 242
    .line 243
    .line 244
    move-result-object v10

    .line 245
    check-cast v10, Landroidx/compose/ui/platform/ViewConfiguration;

    .line 246
    .line 247
    sget-object v11, Landroidx/compose/ui/node/ComposeUiNode;->Companion:Landroidx/compose/ui/node/ComposeUiNode$Companion;

    .line 248
    .line 249
    invoke-virtual {v11}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getConstructor()Lkotlin/jvm/functions/Function0;

    .line 250
    .line 251
    .line 252
    move-result-object v12

    .line 253
    invoke-static {v7}, Landroidx/compose/ui/layout/LayoutKt;->materializerOf(Landroidx/compose/ui/Modifier;)Lkotlin/jvm/functions/Function3;

    .line 254
    .line 255
    .line 256
    move-result-object v7

    .line 257
    invoke-interface {v5}, Landroidx/compose/runtime/Composer;->getApplier()Landroidx/compose/runtime/Applier;

    .line 258
    .line 259
    .line 260
    move-result-object v13

    .line 261
    instance-of v13, v13, Landroidx/compose/runtime/Applier;

    .line 262
    .line 263
    if-nez v13, :cond_f

    .line 264
    .line 265
    invoke-static {}, Landroidx/compose/runtime/ComposablesKt;->invalidApplier()V

    .line 266
    .line 267
    .line 268
    :cond_f
    invoke-interface {v5}, Landroidx/compose/runtime/Composer;->startReusableNode()V

    .line 269
    .line 270
    .line 271
    invoke-interface {v5}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 272
    .line 273
    .line 274
    move-result v13

    .line 275
    if-eqz v13, :cond_10

    .line 276
    .line 277
    invoke-interface {v5, v12}, Landroidx/compose/runtime/Composer;->createNode(Lkotlin/jvm/functions/Function0;)V

    .line 278
    .line 279
    .line 280
    goto :goto_8

    .line 281
    :cond_10
    invoke-interface {v5}, Landroidx/compose/runtime/Composer;->useNode()V

    .line 282
    .line 283
    .line 284
    :goto_8
    invoke-interface {v5}, Landroidx/compose/runtime/Composer;->disableReusing()V

    .line 285
    .line 286
    .line 287
    invoke-static {v5}, Landroidx/compose/runtime/Updater;->constructor-impl(Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;

    .line 288
    .line 289
    .line 290
    move-result-object v12

    .line 291
    invoke-virtual {v11}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetMeasurePolicy()Lkotlin/jvm/functions/Function2;

    .line 292
    .line 293
    .line 294
    move-result-object v13

    .line 295
    invoke-static {v12, v14, v13}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 296
    .line 297
    .line 298
    invoke-virtual {v11}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetDensity()Lkotlin/jvm/functions/Function2;

    .line 299
    .line 300
    .line 301
    move-result-object v13

    .line 302
    invoke-static {v12, v15, v13}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 303
    .line 304
    .line 305
    invoke-virtual {v11}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetLayoutDirection()Lkotlin/jvm/functions/Function2;

    .line 306
    .line 307
    .line 308
    move-result-object v13

    .line 309
    invoke-static {v12, v9, v13}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 310
    .line 311
    .line 312
    invoke-virtual {v11}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetViewConfiguration()Lkotlin/jvm/functions/Function2;

    .line 313
    .line 314
    .line 315
    move-result-object v9

    .line 316
    invoke-static {v12, v10, v9}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 317
    .line 318
    .line 319
    invoke-interface {v5}, Landroidx/compose/runtime/Composer;->enableReusing()V

    .line 320
    .line 321
    .line 322
    invoke-static {v5}, Landroidx/compose/runtime/SkippableUpdater;->constructor-impl(Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;

    .line 323
    .line 324
    .line 325
    move-result-object v9

    .line 326
    invoke-static {v9}, Landroidx/compose/runtime/SkippableUpdater;->box-impl(Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/SkippableUpdater;

    .line 327
    .line 328
    .line 329
    move-result-object v9

    .line 330
    const/4 v10, 0x0

    .line 331
    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 332
    .line 333
    .line 334
    move-result-object v12

    .line 335
    invoke-interface {v7, v9, v5, v12}, Lkotlin/jvm/functions/Function3;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 336
    .line 337
    .line 338
    const v7, 0x7ab4aae9

    .line 339
    .line 340
    .line 341
    invoke-interface {v5, v7}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 342
    .line 343
    .line 344
    const v9, -0x455f09d5

    .line 345
    .line 346
    .line 347
    invoke-interface {v5, v9}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 348
    .line 349
    .line 350
    sget-object v9, Landroidx/compose/foundation/layout/ColumnScopeInstance;->INSTANCE:Landroidx/compose/foundation/layout/ColumnScopeInstance;

    .line 351
    .line 352
    const v10, -0x15a535df

    .line 353
    .line 354
    .line 355
    invoke-interface {v5, v10}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 356
    .line 357
    .line 358
    sget v10, Landroidx/compose/material3/SnackbarKt;->HeightToFirstLine:F

    .line 359
    .line 360
    sget v12, Landroidx/compose/material3/SnackbarKt;->LongButtonVerticalOffset:F

    .line 361
    .line 362
    invoke-static {v0, v10, v12}, Landroidx/compose/foundation/layout/AlignmentLineKt;->paddingFromBaseline-VpY3zN4(Landroidx/compose/ui/Modifier;FF)Landroidx/compose/ui/Modifier;

    .line 363
    .line 364
    .line 365
    move-result-object v20

    .line 366
    const/16 v21, 0x0

    .line 367
    .line 368
    const/16 v22, 0x0

    .line 369
    .line 370
    sget v10, Landroidx/compose/material3/SnackbarKt;->HorizontalSpacingButtonSide:F

    .line 371
    .line 372
    const/16 v24, 0x0

    .line 373
    .line 374
    const/16 v25, 0xb

    .line 375
    .line 376
    const/16 v26, 0x0

    .line 377
    .line 378
    move/from16 v23, v10

    .line 379
    .line 380
    invoke-static/range {v20 .. v26}, Landroidx/compose/foundation/layout/PaddingKt;->padding-qDBjuR0$default(Landroidx/compose/ui/Modifier;FFFFILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    .line 381
    .line 382
    .line 383
    move-result-object v12

    .line 384
    const v13, 0x2bb5b5d7

    .line 385
    .line 386
    .line 387
    invoke-interface {v5, v13}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 388
    .line 389
    .line 390
    invoke-virtual/range {v16 .. v16}, Landroidx/compose/ui/Alignment$Companion;->getTopStart()Landroidx/compose/ui/Alignment;

    .line 391
    .line 392
    .line 393
    move-result-object v14

    .line 394
    const/4 v15, 0x0

    .line 395
    invoke-static {v14, v15, v5, v15}, Landroidx/compose/foundation/layout/BoxKt;->rememberBoxMeasurePolicy(Landroidx/compose/ui/Alignment;ZLandroidx/compose/runtime/Composer;I)Landroidx/compose/ui/layout/MeasurePolicy;

    .line 396
    .line 397
    .line 398
    move-result-object v14

    .line 399
    const v15, -0x4ee9b9da

    .line 400
    .line 401
    .line 402
    invoke-interface {v5, v15}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 403
    .line 404
    .line 405
    invoke-static {}, Landroidx/compose/ui/platform/CompositionLocalsKt;->getLocalDensity()Landroidx/compose/runtime/ProvidableCompositionLocal;

    .line 406
    .line 407
    .line 408
    move-result-object v15

    .line 409
    invoke-interface {v5, v15}, Landroidx/compose/runtime/Composer;->consume(Landroidx/compose/runtime/CompositionLocal;)Ljava/lang/Object;

    .line 410
    .line 411
    .line 412
    move-result-object v15

    .line 413
    check-cast v15, Landroidx/compose/ui/unit/Density;

    .line 414
    .line 415
    invoke-static {}, Landroidx/compose/ui/platform/CompositionLocalsKt;->getLocalLayoutDirection()Landroidx/compose/runtime/ProvidableCompositionLocal;

    .line 416
    .line 417
    .line 418
    move-result-object v13

    .line 419
    invoke-interface {v5, v13}, Landroidx/compose/runtime/Composer;->consume(Landroidx/compose/runtime/CompositionLocal;)Ljava/lang/Object;

    .line 420
    .line 421
    .line 422
    move-result-object v13

    .line 423
    check-cast v13, Landroidx/compose/ui/unit/LayoutDirection;

    .line 424
    .line 425
    invoke-static {}, Landroidx/compose/ui/platform/CompositionLocalsKt;->getLocalViewConfiguration()Landroidx/compose/runtime/ProvidableCompositionLocal;

    .line 426
    .line 427
    .line 428
    move-result-object v7

    .line 429
    invoke-interface {v5, v7}, Landroidx/compose/runtime/Composer;->consume(Landroidx/compose/runtime/CompositionLocal;)Ljava/lang/Object;

    .line 430
    .line 431
    .line 432
    move-result-object v7

    .line 433
    check-cast v7, Landroidx/compose/ui/platform/ViewConfiguration;

    .line 434
    .line 435
    move/from16 v22, v10

    .line 436
    .line 437
    invoke-virtual {v11}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getConstructor()Lkotlin/jvm/functions/Function0;

    .line 438
    .line 439
    .line 440
    move-result-object v10

    .line 441
    invoke-static {v12}, Landroidx/compose/ui/layout/LayoutKt;->materializerOf(Landroidx/compose/ui/Modifier;)Lkotlin/jvm/functions/Function3;

    .line 442
    .line 443
    .line 444
    move-result-object v12

    .line 445
    invoke-interface {v5}, Landroidx/compose/runtime/Composer;->getApplier()Landroidx/compose/runtime/Applier;

    .line 446
    .line 447
    .line 448
    move-result-object v2

    .line 449
    instance-of v2, v2, Landroidx/compose/runtime/Applier;

    .line 450
    .line 451
    if-nez v2, :cond_11

    .line 452
    .line 453
    invoke-static {}, Landroidx/compose/runtime/ComposablesKt;->invalidApplier()V

    .line 454
    .line 455
    .line 456
    :cond_11
    invoke-interface {v5}, Landroidx/compose/runtime/Composer;->startReusableNode()V

    .line 457
    .line 458
    .line 459
    invoke-interface {v5}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 460
    .line 461
    .line 462
    move-result v2

    .line 463
    if-eqz v2, :cond_12

    .line 464
    .line 465
    invoke-interface {v5, v10}, Landroidx/compose/runtime/Composer;->createNode(Lkotlin/jvm/functions/Function0;)V

    .line 466
    .line 467
    .line 468
    goto :goto_9

    .line 469
    :cond_12
    invoke-interface {v5}, Landroidx/compose/runtime/Composer;->useNode()V

    .line 470
    .line 471
    .line 472
    :goto_9
    invoke-interface {v5}, Landroidx/compose/runtime/Composer;->disableReusing()V

    .line 473
    .line 474
    .line 475
    invoke-static {v5}, Landroidx/compose/runtime/Updater;->constructor-impl(Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;

    .line 476
    .line 477
    .line 478
    move-result-object v2

    .line 479
    invoke-virtual {v11}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetMeasurePolicy()Lkotlin/jvm/functions/Function2;

    .line 480
    .line 481
    .line 482
    move-result-object v10

    .line 483
    invoke-static {v2, v14, v10}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 484
    .line 485
    .line 486
    invoke-virtual {v11}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetDensity()Lkotlin/jvm/functions/Function2;

    .line 487
    .line 488
    .line 489
    move-result-object v10

    .line 490
    invoke-static {v2, v15, v10}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 491
    .line 492
    .line 493
    invoke-virtual {v11}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetLayoutDirection()Lkotlin/jvm/functions/Function2;

    .line 494
    .line 495
    .line 496
    move-result-object v10

    .line 497
    invoke-static {v2, v13, v10}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 498
    .line 499
    .line 500
    invoke-virtual {v11}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetViewConfiguration()Lkotlin/jvm/functions/Function2;

    .line 501
    .line 502
    .line 503
    move-result-object v10

    .line 504
    invoke-static {v2, v7, v10}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 505
    .line 506
    .line 507
    invoke-interface {v5}, Landroidx/compose/runtime/Composer;->enableReusing()V

    .line 508
    .line 509
    .line 510
    invoke-static {v5}, Landroidx/compose/runtime/SkippableUpdater;->constructor-impl(Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;

    .line 511
    .line 512
    .line 513
    move-result-object v2

    .line 514
    invoke-static {v2}, Landroidx/compose/runtime/SkippableUpdater;->box-impl(Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/SkippableUpdater;

    .line 515
    .line 516
    .line 517
    move-result-object v2

    .line 518
    const/4 v7, 0x0

    .line 519
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 520
    .line 521
    .line 522
    move-result-object v10

    .line 523
    invoke-interface {v12, v2, v5, v10}, Lkotlin/jvm/functions/Function3;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 524
    .line 525
    .line 526
    const v2, 0x7ab4aae9

    .line 527
    .line 528
    .line 529
    invoke-interface {v5, v2}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 530
    .line 531
    .line 532
    const v2, -0x7f65a980

    .line 533
    .line 534
    .line 535
    invoke-interface {v5, v2}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 536
    .line 537
    .line 538
    sget-object v7, Landroidx/compose/foundation/layout/BoxScopeInstance;->INSTANCE:Landroidx/compose/foundation/layout/BoxScopeInstance;

    .line 539
    .line 540
    const v7, 0x472a2db

    .line 541
    .line 542
    .line 543
    invoke-interface {v5, v7}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 544
    .line 545
    .line 546
    and-int/lit8 v7, v6, 0xe

    .line 547
    .line 548
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 549
    .line 550
    .line 551
    move-result-object v7

    .line 552
    invoke-interface {v1, v5, v7}, Lkotlin/jvm/functions/Function2;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 553
    .line 554
    .line 555
    invoke-interface {v5}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 556
    .line 557
    .line 558
    invoke-interface {v5}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 559
    .line 560
    .line 561
    invoke-interface {v5}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 562
    .line 563
    .line 564
    invoke-interface {v5}, Landroidx/compose/runtime/Composer;->endNode()V

    .line 565
    .line 566
    .line 567
    invoke-interface {v5}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 568
    .line 569
    .line 570
    invoke-interface {v5}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 571
    .line 572
    .line 573
    invoke-virtual/range {v16 .. v16}, Landroidx/compose/ui/Alignment$Companion;->getEnd()Landroidx/compose/ui/Alignment$Horizontal;

    .line 574
    .line 575
    .line 576
    move-result-object v7

    .line 577
    invoke-interface {v9, v0, v7}, Landroidx/compose/foundation/layout/ColumnScope;->align(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/Alignment$Horizontal;)Landroidx/compose/ui/Modifier;

    .line 578
    .line 579
    .line 580
    move-result-object v23

    .line 581
    const/16 v24, 0x0

    .line 582
    .line 583
    const/16 v25, 0x0

    .line 584
    .line 585
    if-nez v3, :cond_13

    .line 586
    .line 587
    move/from16 v26, v22

    .line 588
    .line 589
    goto :goto_a

    .line 590
    :cond_13
    const/4 v7, 0x0

    .line 591
    int-to-float v9, v7

    .line 592
    invoke-static {v9}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 593
    .line 594
    .line 595
    move-result v10

    .line 596
    move/from16 v26, v10

    .line 597
    .line 598
    :goto_a
    const/16 v27, 0x0

    .line 599
    .line 600
    const/16 v28, 0xb

    .line 601
    .line 602
    const/16 v29, 0x0

    .line 603
    .line 604
    invoke-static/range {v23 .. v29}, Landroidx/compose/foundation/layout/PaddingKt;->padding-qDBjuR0$default(Landroidx/compose/ui/Modifier;FFFFILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    .line 605
    .line 606
    .line 607
    move-result-object v7

    .line 608
    const v9, 0x2bb5b5d7

    .line 609
    .line 610
    .line 611
    invoke-interface {v5, v9}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 612
    .line 613
    .line 614
    invoke-virtual/range {v16 .. v16}, Landroidx/compose/ui/Alignment$Companion;->getTopStart()Landroidx/compose/ui/Alignment;

    .line 615
    .line 616
    .line 617
    move-result-object v9

    .line 618
    const/4 v10, 0x0

    .line 619
    invoke-static {v9, v10, v5, v10}, Landroidx/compose/foundation/layout/BoxKt;->rememberBoxMeasurePolicy(Landroidx/compose/ui/Alignment;ZLandroidx/compose/runtime/Composer;I)Landroidx/compose/ui/layout/MeasurePolicy;

    .line 620
    .line 621
    .line 622
    move-result-object v9

    .line 623
    const v10, -0x4ee9b9da

    .line 624
    .line 625
    .line 626
    invoke-interface {v5, v10}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 627
    .line 628
    .line 629
    invoke-static {}, Landroidx/compose/ui/platform/CompositionLocalsKt;->getLocalDensity()Landroidx/compose/runtime/ProvidableCompositionLocal;

    .line 630
    .line 631
    .line 632
    move-result-object v10

    .line 633
    invoke-interface {v5, v10}, Landroidx/compose/runtime/Composer;->consume(Landroidx/compose/runtime/CompositionLocal;)Ljava/lang/Object;

    .line 634
    .line 635
    .line 636
    move-result-object v10

    .line 637
    check-cast v10, Landroidx/compose/ui/unit/Density;

    .line 638
    .line 639
    invoke-static {}, Landroidx/compose/ui/platform/CompositionLocalsKt;->getLocalLayoutDirection()Landroidx/compose/runtime/ProvidableCompositionLocal;

    .line 640
    .line 641
    .line 642
    move-result-object v12

    .line 643
    invoke-interface {v5, v12}, Landroidx/compose/runtime/Composer;->consume(Landroidx/compose/runtime/CompositionLocal;)Ljava/lang/Object;

    .line 644
    .line 645
    .line 646
    move-result-object v12

    .line 647
    check-cast v12, Landroidx/compose/ui/unit/LayoutDirection;

    .line 648
    .line 649
    invoke-static {}, Landroidx/compose/ui/platform/CompositionLocalsKt;->getLocalViewConfiguration()Landroidx/compose/runtime/ProvidableCompositionLocal;

    .line 650
    .line 651
    .line 652
    move-result-object v13

    .line 653
    invoke-interface {v5, v13}, Landroidx/compose/runtime/Composer;->consume(Landroidx/compose/runtime/CompositionLocal;)Ljava/lang/Object;

    .line 654
    .line 655
    .line 656
    move-result-object v13

    .line 657
    check-cast v13, Landroidx/compose/ui/platform/ViewConfiguration;

    .line 658
    .line 659
    invoke-virtual {v11}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getConstructor()Lkotlin/jvm/functions/Function0;

    .line 660
    .line 661
    .line 662
    move-result-object v14

    .line 663
    invoke-static {v7}, Landroidx/compose/ui/layout/LayoutKt;->materializerOf(Landroidx/compose/ui/Modifier;)Lkotlin/jvm/functions/Function3;

    .line 664
    .line 665
    .line 666
    move-result-object v7

    .line 667
    invoke-interface {v5}, Landroidx/compose/runtime/Composer;->getApplier()Landroidx/compose/runtime/Applier;

    .line 668
    .line 669
    .line 670
    move-result-object v15

    .line 671
    instance-of v15, v15, Landroidx/compose/runtime/Applier;

    .line 672
    .line 673
    if-nez v15, :cond_14

    .line 674
    .line 675
    invoke-static {}, Landroidx/compose/runtime/ComposablesKt;->invalidApplier()V

    .line 676
    .line 677
    .line 678
    :cond_14
    invoke-interface {v5}, Landroidx/compose/runtime/Composer;->startReusableNode()V

    .line 679
    .line 680
    .line 681
    invoke-interface {v5}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 682
    .line 683
    .line 684
    move-result v15

    .line 685
    if-eqz v15, :cond_15

    .line 686
    .line 687
    invoke-interface {v5, v14}, Landroidx/compose/runtime/Composer;->createNode(Lkotlin/jvm/functions/Function0;)V

    .line 688
    .line 689
    .line 690
    goto :goto_b

    .line 691
    :cond_15
    invoke-interface {v5}, Landroidx/compose/runtime/Composer;->useNode()V

    .line 692
    .line 693
    .line 694
    :goto_b
    invoke-interface {v5}, Landroidx/compose/runtime/Composer;->disableReusing()V

    .line 695
    .line 696
    .line 697
    invoke-static {v5}, Landroidx/compose/runtime/Updater;->constructor-impl(Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;

    .line 698
    .line 699
    .line 700
    move-result-object v14

    .line 701
    invoke-virtual {v11}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetMeasurePolicy()Lkotlin/jvm/functions/Function2;

    .line 702
    .line 703
    .line 704
    move-result-object v15

    .line 705
    invoke-static {v14, v9, v15}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 706
    .line 707
    .line 708
    invoke-virtual {v11}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetDensity()Lkotlin/jvm/functions/Function2;

    .line 709
    .line 710
    .line 711
    move-result-object v9

    .line 712
    invoke-static {v14, v10, v9}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 713
    .line 714
    .line 715
    invoke-virtual {v11}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetLayoutDirection()Lkotlin/jvm/functions/Function2;

    .line 716
    .line 717
    .line 718
    move-result-object v9

    .line 719
    invoke-static {v14, v12, v9}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 720
    .line 721
    .line 722
    invoke-virtual {v11}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetViewConfiguration()Lkotlin/jvm/functions/Function2;

    .line 723
    .line 724
    .line 725
    move-result-object v9

    .line 726
    invoke-static {v14, v13, v9}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 727
    .line 728
    .line 729
    invoke-interface {v5}, Landroidx/compose/runtime/Composer;->enableReusing()V

    .line 730
    .line 731
    .line 732
    invoke-static {v5}, Landroidx/compose/runtime/SkippableUpdater;->constructor-impl(Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;

    .line 733
    .line 734
    .line 735
    move-result-object v9

    .line 736
    invoke-static {v9}, Landroidx/compose/runtime/SkippableUpdater;->box-impl(Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/SkippableUpdater;

    .line 737
    .line 738
    .line 739
    move-result-object v9

    .line 740
    const/4 v10, 0x0

    .line 741
    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 742
    .line 743
    .line 744
    move-result-object v12

    .line 745
    invoke-interface {v7, v9, v5, v12}, Lkotlin/jvm/functions/Function3;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 746
    .line 747
    .line 748
    const v7, 0x7ab4aae9

    .line 749
    .line 750
    .line 751
    invoke-interface {v5, v7}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 752
    .line 753
    .line 754
    invoke-interface {v5, v2}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 755
    .line 756
    .line 757
    const v2, 0x61c9b304

    .line 758
    .line 759
    .line 760
    invoke-interface {v5, v2}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 761
    .line 762
    .line 763
    const v2, 0x2952b718

    .line 764
    .line 765
    .line 766
    invoke-interface {v5, v2}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 767
    .line 768
    .line 769
    invoke-virtual {v8}, Landroidx/compose/foundation/layout/Arrangement;->getStart()Landroidx/compose/foundation/layout/Arrangement$Horizontal;

    .line 770
    .line 771
    .line 772
    move-result-object v2

    .line 773
    invoke-virtual/range {v16 .. v16}, Landroidx/compose/ui/Alignment$Companion;->getTop()Landroidx/compose/ui/Alignment$Vertical;

    .line 774
    .line 775
    .line 776
    move-result-object v7

    .line 777
    const/4 v8, 0x0

    .line 778
    invoke-static {v2, v7, v5, v8}, Landroidx/compose/foundation/layout/RowKt;->rowMeasurePolicy(Landroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/ui/Alignment$Vertical;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/layout/MeasurePolicy;

    .line 779
    .line 780
    .line 781
    move-result-object v2

    .line 782
    const v7, -0x4ee9b9da

    .line 783
    .line 784
    .line 785
    invoke-interface {v5, v7}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 786
    .line 787
    .line 788
    invoke-static {}, Landroidx/compose/ui/platform/CompositionLocalsKt;->getLocalDensity()Landroidx/compose/runtime/ProvidableCompositionLocal;

    .line 789
    .line 790
    .line 791
    move-result-object v7

    .line 792
    invoke-interface {v5, v7}, Landroidx/compose/runtime/Composer;->consume(Landroidx/compose/runtime/CompositionLocal;)Ljava/lang/Object;

    .line 793
    .line 794
    .line 795
    move-result-object v7

    .line 796
    check-cast v7, Landroidx/compose/ui/unit/Density;

    .line 797
    .line 798
    invoke-static {}, Landroidx/compose/ui/platform/CompositionLocalsKt;->getLocalLayoutDirection()Landroidx/compose/runtime/ProvidableCompositionLocal;

    .line 799
    .line 800
    .line 801
    move-result-object v8

    .line 802
    invoke-interface {v5, v8}, Landroidx/compose/runtime/Composer;->consume(Landroidx/compose/runtime/CompositionLocal;)Ljava/lang/Object;

    .line 803
    .line 804
    .line 805
    move-result-object v8

    .line 806
    check-cast v8, Landroidx/compose/ui/unit/LayoutDirection;

    .line 807
    .line 808
    invoke-static {}, Landroidx/compose/ui/platform/CompositionLocalsKt;->getLocalViewConfiguration()Landroidx/compose/runtime/ProvidableCompositionLocal;

    .line 809
    .line 810
    .line 811
    move-result-object v9

    .line 812
    invoke-interface {v5, v9}, Landroidx/compose/runtime/Composer;->consume(Landroidx/compose/runtime/CompositionLocal;)Ljava/lang/Object;

    .line 813
    .line 814
    .line 815
    move-result-object v9

    .line 816
    check-cast v9, Landroidx/compose/ui/platform/ViewConfiguration;

    .line 817
    .line 818
    invoke-virtual {v11}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getConstructor()Lkotlin/jvm/functions/Function0;

    .line 819
    .line 820
    .line 821
    move-result-object v10

    .line 822
    invoke-static {v0}, Landroidx/compose/ui/layout/LayoutKt;->materializerOf(Landroidx/compose/ui/Modifier;)Lkotlin/jvm/functions/Function3;

    .line 823
    .line 824
    .line 825
    move-result-object v0

    .line 826
    invoke-interface {v5}, Landroidx/compose/runtime/Composer;->getApplier()Landroidx/compose/runtime/Applier;

    .line 827
    .line 828
    .line 829
    move-result-object v12

    .line 830
    instance-of v12, v12, Landroidx/compose/runtime/Applier;

    .line 831
    .line 832
    if-nez v12, :cond_16

    .line 833
    .line 834
    invoke-static {}, Landroidx/compose/runtime/ComposablesKt;->invalidApplier()V

    .line 835
    .line 836
    .line 837
    :cond_16
    invoke-interface {v5}, Landroidx/compose/runtime/Composer;->startReusableNode()V

    .line 838
    .line 839
    .line 840
    invoke-interface {v5}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 841
    .line 842
    .line 843
    move-result v12

    .line 844
    if-eqz v12, :cond_17

    .line 845
    .line 846
    invoke-interface {v5, v10}, Landroidx/compose/runtime/Composer;->createNode(Lkotlin/jvm/functions/Function0;)V

    .line 847
    .line 848
    .line 849
    goto :goto_c

    .line 850
    :cond_17
    invoke-interface {v5}, Landroidx/compose/runtime/Composer;->useNode()V

    .line 851
    .line 852
    .line 853
    :goto_c
    invoke-interface {v5}, Landroidx/compose/runtime/Composer;->disableReusing()V

    .line 854
    .line 855
    .line 856
    invoke-static {v5}, Landroidx/compose/runtime/Updater;->constructor-impl(Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;

    .line 857
    .line 858
    .line 859
    move-result-object v10

    .line 860
    invoke-virtual {v11}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetMeasurePolicy()Lkotlin/jvm/functions/Function2;

    .line 861
    .line 862
    .line 863
    move-result-object v12

    .line 864
    invoke-static {v10, v2, v12}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 865
    .line 866
    .line 867
    invoke-virtual {v11}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetDensity()Lkotlin/jvm/functions/Function2;

    .line 868
    .line 869
    .line 870
    move-result-object v2

    .line 871
    invoke-static {v10, v7, v2}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 872
    .line 873
    .line 874
    invoke-virtual {v11}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetLayoutDirection()Lkotlin/jvm/functions/Function2;

    .line 875
    .line 876
    .line 877
    move-result-object v2

    .line 878
    invoke-static {v10, v8, v2}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 879
    .line 880
    .line 881
    invoke-virtual {v11}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetViewConfiguration()Lkotlin/jvm/functions/Function2;

    .line 882
    .line 883
    .line 884
    move-result-object v2

    .line 885
    invoke-static {v10, v9, v2}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 886
    .line 887
    .line 888
    invoke-interface {v5}, Landroidx/compose/runtime/Composer;->enableReusing()V

    .line 889
    .line 890
    .line 891
    invoke-static {v5}, Landroidx/compose/runtime/SkippableUpdater;->constructor-impl(Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;

    .line 892
    .line 893
    .line 894
    move-result-object v2

    .line 895
    invoke-static {v2}, Landroidx/compose/runtime/SkippableUpdater;->box-impl(Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/SkippableUpdater;

    .line 896
    .line 897
    .line 898
    move-result-object v2

    .line 899
    const/4 v7, 0x0

    .line 900
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 901
    .line 902
    .line 903
    move-result-object v8

    .line 904
    invoke-interface {v0, v2, v5, v8}, Lkotlin/jvm/functions/Function3;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 905
    .line 906
    .line 907
    const v0, 0x7ab4aae9

    .line 908
    .line 909
    .line 910
    invoke-interface {v5, v0}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 911
    .line 912
    .line 913
    const v0, -0x286e2e7f

    .line 914
    .line 915
    .line 916
    invoke-interface {v5, v0}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 917
    .line 918
    .line 919
    sget-object v0, Landroidx/compose/foundation/layout/RowScopeInstance;->INSTANCE:Landroidx/compose/foundation/layout/RowScopeInstance;

    .line 920
    .line 921
    const v0, -0x5f1e52e0

    .line 922
    .line 923
    .line 924
    invoke-interface {v5, v0}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 925
    .line 926
    .line 927
    const/4 v0, 0x2

    .line 928
    new-array v0, v0, [Landroidx/compose/runtime/ProvidedValue;

    .line 929
    .line 930
    invoke-static {}, Landroidx/compose/material3/ContentColorKt;->getLocalContentColor()Landroidx/compose/runtime/ProvidableCompositionLocal;

    .line 931
    .line 932
    .line 933
    move-result-object v2

    .line 934
    invoke-static/range {p4 .. p5}, Landroidx/compose/ui/graphics/Color;->box-impl(J)Landroidx/compose/ui/graphics/Color;

    .line 935
    .line 936
    .line 937
    move-result-object v7

    .line 938
    invoke-virtual {v2, v7}, Landroidx/compose/runtime/ProvidableCompositionLocal;->provides(Ljava/lang/Object;)Landroidx/compose/runtime/ProvidedValue;

    .line 939
    .line 940
    .line 941
    move-result-object v2

    .line 942
    const/4 v7, 0x0

    .line 943
    aput-object v2, v0, v7

    .line 944
    .line 945
    invoke-static {}, Landroidx/compose/material3/TextKt;->getLocalTextStyle()Landroidx/compose/runtime/ProvidableCompositionLocal;

    .line 946
    .line 947
    .line 948
    move-result-object v2

    .line 949
    invoke-virtual {v2, v4}, Landroidx/compose/runtime/ProvidableCompositionLocal;->provides(Ljava/lang/Object;)Landroidx/compose/runtime/ProvidedValue;

    .line 950
    .line 951
    .line 952
    move-result-object v2

    .line 953
    const/4 v7, 0x1

    .line 954
    aput-object v2, v0, v7

    .line 955
    .line 956
    and-int/lit8 v2, v6, 0x70

    .line 957
    .line 958
    or-int/lit8 v2, v2, 0x8

    .line 959
    .line 960
    move-object/from16 v8, p1

    .line 961
    .line 962
    invoke-static {v0, v8, v5, v2}, Landroidx/compose/runtime/CompositionLocalKt;->CompositionLocalProvider([Landroidx/compose/runtime/ProvidedValue;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V

    .line 963
    .line 964
    .line 965
    if-eqz v3, :cond_18

    .line 966
    .line 967
    new-array v0, v7, [Landroidx/compose/runtime/ProvidedValue;

    .line 968
    .line 969
    invoke-static {}, Landroidx/compose/material3/ContentColorKt;->getLocalContentColor()Landroidx/compose/runtime/ProvidableCompositionLocal;

    .line 970
    .line 971
    .line 972
    move-result-object v2

    .line 973
    invoke-static/range {p6 .. p7}, Landroidx/compose/ui/graphics/Color;->box-impl(J)Landroidx/compose/ui/graphics/Color;

    .line 974
    .line 975
    .line 976
    move-result-object v7

    .line 977
    invoke-virtual {v2, v7}, Landroidx/compose/runtime/ProvidableCompositionLocal;->provides(Ljava/lang/Object;)Landroidx/compose/runtime/ProvidedValue;

    .line 978
    .line 979
    .line 980
    move-result-object v2

    .line 981
    const/4 v7, 0x0

    .line 982
    aput-object v2, v0, v7

    .line 983
    .line 984
    shr-int/lit8 v2, v6, 0x3

    .line 985
    .line 986
    and-int/lit8 v2, v2, 0x70

    .line 987
    .line 988
    or-int/lit8 v2, v2, 0x8

    .line 989
    .line 990
    invoke-static {v0, v3, v5, v2}, Landroidx/compose/runtime/CompositionLocalKt;->CompositionLocalProvider([Landroidx/compose/runtime/ProvidedValue;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V

    .line 991
    .line 992
    .line 993
    :cond_18
    invoke-interface {v5}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 994
    .line 995
    .line 996
    invoke-interface {v5}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 997
    .line 998
    .line 999
    invoke-interface {v5}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 1000
    .line 1001
    .line 1002
    invoke-interface {v5}, Landroidx/compose/runtime/Composer;->endNode()V

    .line 1003
    .line 1004
    .line 1005
    invoke-interface {v5}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 1006
    .line 1007
    .line 1008
    invoke-interface {v5}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 1009
    .line 1010
    .line 1011
    invoke-interface {v5}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 1012
    .line 1013
    .line 1014
    invoke-interface {v5}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 1015
    .line 1016
    .line 1017
    invoke-interface {v5}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 1018
    .line 1019
    .line 1020
    invoke-interface {v5}, Landroidx/compose/runtime/Composer;->endNode()V

    .line 1021
    .line 1022
    .line 1023
    invoke-interface {v5}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 1024
    .line 1025
    .line 1026
    invoke-interface {v5}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 1027
    .line 1028
    .line 1029
    invoke-interface {v5}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 1030
    .line 1031
    .line 1032
    invoke-interface {v5}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 1033
    .line 1034
    .line 1035
    invoke-interface {v5}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 1036
    .line 1037
    .line 1038
    invoke-interface {v5}, Landroidx/compose/runtime/Composer;->endNode()V

    .line 1039
    .line 1040
    .line 1041
    invoke-interface {v5}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 1042
    .line 1043
    .line 1044
    invoke-interface {v5}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 1045
    .line 1046
    .line 1047
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 1048
    .line 1049
    .line 1050
    move-result v0

    .line 1051
    if-eqz v0, :cond_19

    .line 1052
    .line 1053
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 1054
    .line 1055
    .line 1056
    :cond_19
    :goto_d
    invoke-interface {v5}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    .line 1057
    .line 1058
    .line 1059
    move-result-object v10

    .line 1060
    if-nez v10, :cond_1a

    .line 1061
    .line 1062
    goto :goto_e

    .line 1063
    :cond_1a
    new-instance v11, Landroidx/compose/material3/SnackbarKt$NewLineButtonSnackbar$2;

    .line 1064
    .line 1065
    move-object v0, v11

    .line 1066
    move-object/from16 v1, p0

    .line 1067
    .line 1068
    move-object/from16 v2, p1

    .line 1069
    .line 1070
    move-object/from16 v3, p2

    .line 1071
    .line 1072
    move-object/from16 v4, p3

    .line 1073
    .line 1074
    move-wide/from16 v5, p4

    .line 1075
    .line 1076
    move-wide/from16 v7, p6

    .line 1077
    .line 1078
    move/from16 v9, p9

    .line 1079
    .line 1080
    invoke-direct/range {v0 .. v9}, Landroidx/compose/material3/SnackbarKt$NewLineButtonSnackbar$2;-><init>(Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/text/TextStyle;JJI)V

    .line 1081
    .line 1082
    .line 1083
    invoke-interface {v10, v11}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lkotlin/jvm/functions/Function2;)V

    .line 1084
    .line 1085
    .line 1086
    :goto_e
    return-void
.end method

.method private static final OneRowSnackbar-kKq0p4A(Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/text/TextStyle;JJLandroidx/compose/runtime/Composer;I)V
    .locals 22
    .annotation build Landroidx/compose/runtime/Composable;
    .end annotation

    .annotation build Landroidx/compose/runtime/ComposableInferredTarget;
        scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function2<",
            "-",
            "Landroidx/compose/runtime/Composer;",
            "-",
            "Ljava/lang/Integer;",
            "Lkotlin/Unit;",
            ">;",
            "Lkotlin/jvm/functions/Function2<",
            "-",
            "Landroidx/compose/runtime/Composer;",
            "-",
            "Ljava/lang/Integer;",
            "Lkotlin/Unit;",
            ">;",
            "Lkotlin/jvm/functions/Function2<",
            "-",
            "Landroidx/compose/runtime/Composer;",
            "-",
            "Ljava/lang/Integer;",
            "Lkotlin/Unit;",
            ">;",
            "Landroidx/compose/ui/text/TextStyle;",
            "JJ",
            "Landroidx/compose/runtime/Composer;",
            "I)V"
        }
    .end annotation

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
    move/from16 v9, p9

    .line 10
    .line 11
    const v0, -0x35d64793

    .line 12
    .line 13
    .line 14
    move-object/from16 v5, p8

    .line 15
    .line 16
    invoke-interface {v5, v0}, Landroidx/compose/runtime/Composer;->startRestartGroup(I)Landroidx/compose/runtime/Composer;

    .line 17
    .line 18
    .line 19
    move-result-object v5

    .line 20
    and-int/lit8 v6, v9, 0xe

    .line 21
    .line 22
    if-nez v6, :cond_1

    .line 23
    .line 24
    invoke-interface {v5, v1}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 25
    .line 26
    .line 27
    move-result v6

    .line 28
    if-eqz v6, :cond_0

    .line 29
    .line 30
    const/4 v6, 0x4

    .line 31
    goto :goto_0

    .line 32
    :cond_0
    const/4 v6, 0x2

    .line 33
    :goto_0
    or-int/2addr v6, v9

    .line 34
    goto :goto_1

    .line 35
    :cond_1
    move v6, v9

    .line 36
    :goto_1
    and-int/lit8 v8, v9, 0x70

    .line 37
    .line 38
    if-nez v8, :cond_3

    .line 39
    .line 40
    invoke-interface {v5, v2}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 41
    .line 42
    .line 43
    move-result v8

    .line 44
    if-eqz v8, :cond_2

    .line 45
    .line 46
    const/16 v8, 0x20

    .line 47
    .line 48
    goto :goto_2

    .line 49
    :cond_2
    const/16 v8, 0x10

    .line 50
    .line 51
    :goto_2
    or-int/2addr v6, v8

    .line 52
    :cond_3
    and-int/lit16 v8, v9, 0x380

    .line 53
    .line 54
    if-nez v8, :cond_5

    .line 55
    .line 56
    invoke-interface {v5, v3}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 57
    .line 58
    .line 59
    move-result v8

    .line 60
    if-eqz v8, :cond_4

    .line 61
    .line 62
    const/16 v8, 0x100

    .line 63
    .line 64
    goto :goto_3

    .line 65
    :cond_4
    const/16 v8, 0x80

    .line 66
    .line 67
    :goto_3
    or-int/2addr v6, v8

    .line 68
    :cond_5
    and-int/lit16 v8, v9, 0x1c00

    .line 69
    .line 70
    if-nez v8, :cond_7

    .line 71
    .line 72
    invoke-interface {v5, v4}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 73
    .line 74
    .line 75
    move-result v8

    .line 76
    if-eqz v8, :cond_6

    .line 77
    .line 78
    const/16 v8, 0x800

    .line 79
    .line 80
    goto :goto_4

    .line 81
    :cond_6
    const/16 v8, 0x400

    .line 82
    .line 83
    :goto_4
    or-int/2addr v6, v8

    .line 84
    :cond_7
    const v8, 0xe000

    .line 85
    .line 86
    .line 87
    and-int/2addr v8, v9

    .line 88
    move-wide/from16 v10, p4

    .line 89
    .line 90
    if-nez v8, :cond_9

    .line 91
    .line 92
    invoke-interface {v5, v10, v11}, Landroidx/compose/runtime/Composer;->changed(J)Z

    .line 93
    .line 94
    .line 95
    move-result v8

    .line 96
    if-eqz v8, :cond_8

    .line 97
    .line 98
    const/16 v8, 0x4000

    .line 99
    .line 100
    goto :goto_5

    .line 101
    :cond_8
    const/16 v8, 0x2000

    .line 102
    .line 103
    :goto_5
    or-int/2addr v6, v8

    .line 104
    :cond_9
    const/high16 v8, 0x70000

    .line 105
    .line 106
    and-int/2addr v8, v9

    .line 107
    move-wide/from16 v12, p6

    .line 108
    .line 109
    if-nez v8, :cond_b

    .line 110
    .line 111
    invoke-interface {v5, v12, v13}, Landroidx/compose/runtime/Composer;->changed(J)Z

    .line 112
    .line 113
    .line 114
    move-result v8

    .line 115
    if-eqz v8, :cond_a

    .line 116
    .line 117
    const/high16 v8, 0x20000

    .line 118
    .line 119
    goto :goto_6

    .line 120
    :cond_a
    const/high16 v8, 0x10000

    .line 121
    .line 122
    :goto_6
    or-int/2addr v6, v8

    .line 123
    :cond_b
    const v8, 0x5b6db

    .line 124
    .line 125
    .line 126
    and-int/2addr v8, v6

    .line 127
    const v14, 0x12492

    .line 128
    .line 129
    .line 130
    if-ne v8, v14, :cond_d

    .line 131
    .line 132
    invoke-interface {v5}, Landroidx/compose/runtime/Composer;->getSkipping()Z

    .line 133
    .line 134
    .line 135
    move-result v8

    .line 136
    if-nez v8, :cond_c

    .line 137
    .line 138
    goto :goto_7

    .line 139
    :cond_c
    invoke-interface {v5}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    .line 140
    .line 141
    .line 142
    move-object v7, v3

    .line 143
    goto/16 :goto_d

    .line 144
    .line 145
    :cond_d
    :goto_7
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 146
    .line 147
    .line 148
    move-result v8

    .line 149
    if-eqz v8, :cond_e

    .line 150
    .line 151
    const/4 v8, -0x1

    .line 152
    const-string v14, "androidx.compose.material3.OneRowSnackbar (Snackbar.kt:293)"

    .line 153
    .line 154
    invoke-static {v0, v6, v8, v14}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 155
    .line 156
    .line 157
    :cond_e
    sget-object v0, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    .line 158
    .line 159
    sget v16, Landroidx/compose/material3/SnackbarKt;->HorizontalSpacing:F

    .line 160
    .line 161
    const/16 v17, 0x0

    .line 162
    .line 163
    const/4 v8, 0x0

    .line 164
    if-nez v3, :cond_f

    .line 165
    .line 166
    sget v14, Landroidx/compose/material3/SnackbarKt;->HorizontalSpacingButtonSide:F

    .line 167
    .line 168
    goto :goto_8

    .line 169
    :cond_f
    int-to-float v14, v8

    .line 170
    invoke-static {v14}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 171
    .line 172
    .line 173
    move-result v14

    .line 174
    :goto_8
    move/from16 v18, v14

    .line 175
    .line 176
    const/16 v19, 0x0

    .line 177
    .line 178
    const/16 v20, 0xa

    .line 179
    .line 180
    const/16 v21, 0x0

    .line 181
    .line 182
    move-object v15, v0

    .line 183
    invoke-static/range {v15 .. v21}, Landroidx/compose/foundation/layout/PaddingKt;->padding-qDBjuR0$default(Landroidx/compose/ui/Modifier;FFFFILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    .line 184
    .line 185
    .line 186
    move-result-object v14

    .line 187
    new-instance v15, Landroidx/compose/material3/SnackbarKt$OneRowSnackbar$2;

    .line 188
    .line 189
    const-string v7, "action"

    .line 190
    .line 191
    const-string v8, "dismissAction"

    .line 192
    .line 193
    const-string/jumbo v9, "text"

    .line 194
    .line 195
    .line 196
    invoke-direct {v15, v7, v8, v9}, Landroidx/compose/material3/SnackbarKt$OneRowSnackbar$2;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 197
    .line 198
    .line 199
    const v10, -0x4ee9b9da

    .line 200
    .line 201
    .line 202
    invoke-interface {v5, v10}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 203
    .line 204
    .line 205
    invoke-static {}, Landroidx/compose/ui/platform/CompositionLocalsKt;->getLocalDensity()Landroidx/compose/runtime/ProvidableCompositionLocal;

    .line 206
    .line 207
    .line 208
    move-result-object v11

    .line 209
    invoke-interface {v5, v11}, Landroidx/compose/runtime/Composer;->consume(Landroidx/compose/runtime/CompositionLocal;)Ljava/lang/Object;

    .line 210
    .line 211
    .line 212
    move-result-object v11

    .line 213
    check-cast v11, Landroidx/compose/ui/unit/Density;

    .line 214
    .line 215
    invoke-static {}, Landroidx/compose/ui/platform/CompositionLocalsKt;->getLocalLayoutDirection()Landroidx/compose/runtime/ProvidableCompositionLocal;

    .line 216
    .line 217
    .line 218
    move-result-object v10

    .line 219
    invoke-interface {v5, v10}, Landroidx/compose/runtime/Composer;->consume(Landroidx/compose/runtime/CompositionLocal;)Ljava/lang/Object;

    .line 220
    .line 221
    .line 222
    move-result-object v10

    .line 223
    check-cast v10, Landroidx/compose/ui/unit/LayoutDirection;

    .line 224
    .line 225
    invoke-static {}, Landroidx/compose/ui/platform/CompositionLocalsKt;->getLocalViewConfiguration()Landroidx/compose/runtime/ProvidableCompositionLocal;

    .line 226
    .line 227
    .line 228
    move-result-object v12

    .line 229
    invoke-interface {v5, v12}, Landroidx/compose/runtime/Composer;->consume(Landroidx/compose/runtime/CompositionLocal;)Ljava/lang/Object;

    .line 230
    .line 231
    .line 232
    move-result-object v12

    .line 233
    check-cast v12, Landroidx/compose/ui/platform/ViewConfiguration;

    .line 234
    .line 235
    sget-object v13, Landroidx/compose/ui/node/ComposeUiNode;->Companion:Landroidx/compose/ui/node/ComposeUiNode$Companion;

    .line 236
    .line 237
    move-object/from16 v18, v8

    .line 238
    .line 239
    invoke-virtual {v13}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getConstructor()Lkotlin/jvm/functions/Function0;

    .line 240
    .line 241
    .line 242
    move-result-object v8

    .line 243
    invoke-static {v14}, Landroidx/compose/ui/layout/LayoutKt;->materializerOf(Landroidx/compose/ui/Modifier;)Lkotlin/jvm/functions/Function3;

    .line 244
    .line 245
    .line 246
    move-result-object v14

    .line 247
    invoke-interface {v5}, Landroidx/compose/runtime/Composer;->getApplier()Landroidx/compose/runtime/Applier;

    .line 248
    .line 249
    .line 250
    move-result-object v3

    .line 251
    instance-of v3, v3, Landroidx/compose/runtime/Applier;

    .line 252
    .line 253
    if-nez v3, :cond_10

    .line 254
    .line 255
    invoke-static {}, Landroidx/compose/runtime/ComposablesKt;->invalidApplier()V

    .line 256
    .line 257
    .line 258
    :cond_10
    invoke-interface {v5}, Landroidx/compose/runtime/Composer;->startReusableNode()V

    .line 259
    .line 260
    .line 261
    invoke-interface {v5}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 262
    .line 263
    .line 264
    move-result v3

    .line 265
    if-eqz v3, :cond_11

    .line 266
    .line 267
    invoke-interface {v5, v8}, Landroidx/compose/runtime/Composer;->createNode(Lkotlin/jvm/functions/Function0;)V

    .line 268
    .line 269
    .line 270
    goto :goto_9

    .line 271
    :cond_11
    invoke-interface {v5}, Landroidx/compose/runtime/Composer;->useNode()V

    .line 272
    .line 273
    .line 274
    :goto_9
    invoke-interface {v5}, Landroidx/compose/runtime/Composer;->disableReusing()V

    .line 275
    .line 276
    .line 277
    invoke-static {v5}, Landroidx/compose/runtime/Updater;->constructor-impl(Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;

    .line 278
    .line 279
    .line 280
    move-result-object v3

    .line 281
    invoke-virtual {v13}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetMeasurePolicy()Lkotlin/jvm/functions/Function2;

    .line 282
    .line 283
    .line 284
    move-result-object v8

    .line 285
    invoke-static {v3, v15, v8}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 286
    .line 287
    .line 288
    invoke-virtual {v13}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetDensity()Lkotlin/jvm/functions/Function2;

    .line 289
    .line 290
    .line 291
    move-result-object v8

    .line 292
    invoke-static {v3, v11, v8}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 293
    .line 294
    .line 295
    invoke-virtual {v13}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetLayoutDirection()Lkotlin/jvm/functions/Function2;

    .line 296
    .line 297
    .line 298
    move-result-object v8

    .line 299
    invoke-static {v3, v10, v8}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 300
    .line 301
    .line 302
    invoke-virtual {v13}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetViewConfiguration()Lkotlin/jvm/functions/Function2;

    .line 303
    .line 304
    .line 305
    move-result-object v8

    .line 306
    invoke-static {v3, v12, v8}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 307
    .line 308
    .line 309
    invoke-interface {v5}, Landroidx/compose/runtime/Composer;->enableReusing()V

    .line 310
    .line 311
    .line 312
    invoke-static {v5}, Landroidx/compose/runtime/SkippableUpdater;->constructor-impl(Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;

    .line 313
    .line 314
    .line 315
    move-result-object v3

    .line 316
    invoke-static {v3}, Landroidx/compose/runtime/SkippableUpdater;->box-impl(Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/SkippableUpdater;

    .line 317
    .line 318
    .line 319
    move-result-object v3

    .line 320
    const/4 v8, 0x0

    .line 321
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 322
    .line 323
    .line 324
    move-result-object v10

    .line 325
    invoke-interface {v14, v3, v5, v10}, Lkotlin/jvm/functions/Function3;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 326
    .line 327
    .line 328
    const v3, 0x7ab4aae9

    .line 329
    .line 330
    .line 331
    invoke-interface {v5, v3}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 332
    .line 333
    .line 334
    const v8, -0x74e7965c

    .line 335
    .line 336
    .line 337
    invoke-interface {v5, v8}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 338
    .line 339
    .line 340
    invoke-static {v0, v9}, Landroidx/compose/ui/layout/LayoutIdKt;->layoutId(Landroidx/compose/ui/Modifier;Ljava/lang/Object;)Landroidx/compose/ui/Modifier;

    .line 341
    .line 342
    .line 343
    move-result-object v8

    .line 344
    sget v9, Landroidx/compose/material3/SnackbarKt;->SnackbarVerticalPadding:F

    .line 345
    .line 346
    const/4 v10, 0x0

    .line 347
    const/4 v11, 0x0

    .line 348
    const/4 v12, 0x1

    .line 349
    invoke-static {v8, v11, v9, v12, v10}, Landroidx/compose/foundation/layout/PaddingKt;->padding-VpY3zN4$default(Landroidx/compose/ui/Modifier;FFILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    .line 350
    .line 351
    .line 352
    move-result-object v8

    .line 353
    const v9, 0x2bb5b5d7

    .line 354
    .line 355
    .line 356
    invoke-interface {v5, v9}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 357
    .line 358
    .line 359
    sget-object v10, Landroidx/compose/ui/Alignment;->Companion:Landroidx/compose/ui/Alignment$Companion;

    .line 360
    .line 361
    invoke-virtual {v10}, Landroidx/compose/ui/Alignment$Companion;->getTopStart()Landroidx/compose/ui/Alignment;

    .line 362
    .line 363
    .line 364
    move-result-object v11

    .line 365
    const/4 v14, 0x0

    .line 366
    invoke-static {v11, v14, v5, v14}, Landroidx/compose/foundation/layout/BoxKt;->rememberBoxMeasurePolicy(Landroidx/compose/ui/Alignment;ZLandroidx/compose/runtime/Composer;I)Landroidx/compose/ui/layout/MeasurePolicy;

    .line 367
    .line 368
    .line 369
    move-result-object v11

    .line 370
    const v14, -0x4ee9b9da

    .line 371
    .line 372
    .line 373
    invoke-interface {v5, v14}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 374
    .line 375
    .line 376
    invoke-static {}, Landroidx/compose/ui/platform/CompositionLocalsKt;->getLocalDensity()Landroidx/compose/runtime/ProvidableCompositionLocal;

    .line 377
    .line 378
    .line 379
    move-result-object v14

    .line 380
    invoke-interface {v5, v14}, Landroidx/compose/runtime/Composer;->consume(Landroidx/compose/runtime/CompositionLocal;)Ljava/lang/Object;

    .line 381
    .line 382
    .line 383
    move-result-object v14

    .line 384
    check-cast v14, Landroidx/compose/ui/unit/Density;

    .line 385
    .line 386
    invoke-static {}, Landroidx/compose/ui/platform/CompositionLocalsKt;->getLocalLayoutDirection()Landroidx/compose/runtime/ProvidableCompositionLocal;

    .line 387
    .line 388
    .line 389
    move-result-object v15

    .line 390
    invoke-interface {v5, v15}, Landroidx/compose/runtime/Composer;->consume(Landroidx/compose/runtime/CompositionLocal;)Ljava/lang/Object;

    .line 391
    .line 392
    .line 393
    move-result-object v15

    .line 394
    check-cast v15, Landroidx/compose/ui/unit/LayoutDirection;

    .line 395
    .line 396
    invoke-static {}, Landroidx/compose/ui/platform/CompositionLocalsKt;->getLocalViewConfiguration()Landroidx/compose/runtime/ProvidableCompositionLocal;

    .line 397
    .line 398
    .line 399
    move-result-object v12

    .line 400
    invoke-interface {v5, v12}, Landroidx/compose/runtime/Composer;->consume(Landroidx/compose/runtime/CompositionLocal;)Ljava/lang/Object;

    .line 401
    .line 402
    .line 403
    move-result-object v12

    .line 404
    check-cast v12, Landroidx/compose/ui/platform/ViewConfiguration;

    .line 405
    .line 406
    invoke-virtual {v13}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getConstructor()Lkotlin/jvm/functions/Function0;

    .line 407
    .line 408
    .line 409
    move-result-object v9

    .line 410
    invoke-static {v8}, Landroidx/compose/ui/layout/LayoutKt;->materializerOf(Landroidx/compose/ui/Modifier;)Lkotlin/jvm/functions/Function3;

    .line 411
    .line 412
    .line 413
    move-result-object v8

    .line 414
    invoke-interface {v5}, Landroidx/compose/runtime/Composer;->getApplier()Landroidx/compose/runtime/Applier;

    .line 415
    .line 416
    .line 417
    move-result-object v3

    .line 418
    instance-of v3, v3, Landroidx/compose/runtime/Applier;

    .line 419
    .line 420
    if-nez v3, :cond_12

    .line 421
    .line 422
    invoke-static {}, Landroidx/compose/runtime/ComposablesKt;->invalidApplier()V

    .line 423
    .line 424
    .line 425
    :cond_12
    invoke-interface {v5}, Landroidx/compose/runtime/Composer;->startReusableNode()V

    .line 426
    .line 427
    .line 428
    invoke-interface {v5}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 429
    .line 430
    .line 431
    move-result v3

    .line 432
    if-eqz v3, :cond_13

    .line 433
    .line 434
    invoke-interface {v5, v9}, Landroidx/compose/runtime/Composer;->createNode(Lkotlin/jvm/functions/Function0;)V

    .line 435
    .line 436
    .line 437
    goto :goto_a

    .line 438
    :cond_13
    invoke-interface {v5}, Landroidx/compose/runtime/Composer;->useNode()V

    .line 439
    .line 440
    .line 441
    :goto_a
    invoke-interface {v5}, Landroidx/compose/runtime/Composer;->disableReusing()V

    .line 442
    .line 443
    .line 444
    invoke-static {v5}, Landroidx/compose/runtime/Updater;->constructor-impl(Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;

    .line 445
    .line 446
    .line 447
    move-result-object v3

    .line 448
    invoke-virtual {v13}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetMeasurePolicy()Lkotlin/jvm/functions/Function2;

    .line 449
    .line 450
    .line 451
    move-result-object v9

    .line 452
    invoke-static {v3, v11, v9}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 453
    .line 454
    .line 455
    invoke-virtual {v13}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetDensity()Lkotlin/jvm/functions/Function2;

    .line 456
    .line 457
    .line 458
    move-result-object v9

    .line 459
    invoke-static {v3, v14, v9}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 460
    .line 461
    .line 462
    invoke-virtual {v13}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetLayoutDirection()Lkotlin/jvm/functions/Function2;

    .line 463
    .line 464
    .line 465
    move-result-object v9

    .line 466
    invoke-static {v3, v15, v9}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 467
    .line 468
    .line 469
    invoke-virtual {v13}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetViewConfiguration()Lkotlin/jvm/functions/Function2;

    .line 470
    .line 471
    .line 472
    move-result-object v9

    .line 473
    invoke-static {v3, v12, v9}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 474
    .line 475
    .line 476
    invoke-interface {v5}, Landroidx/compose/runtime/Composer;->enableReusing()V

    .line 477
    .line 478
    .line 479
    invoke-static {v5}, Landroidx/compose/runtime/SkippableUpdater;->constructor-impl(Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;

    .line 480
    .line 481
    .line 482
    move-result-object v3

    .line 483
    invoke-static {v3}, Landroidx/compose/runtime/SkippableUpdater;->box-impl(Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/SkippableUpdater;

    .line 484
    .line 485
    .line 486
    move-result-object v3

    .line 487
    const/4 v9, 0x0

    .line 488
    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 489
    .line 490
    .line 491
    move-result-object v11

    .line 492
    invoke-interface {v8, v3, v5, v11}, Lkotlin/jvm/functions/Function3;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 493
    .line 494
    .line 495
    const v3, 0x7ab4aae9

    .line 496
    .line 497
    .line 498
    invoke-interface {v5, v3}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 499
    .line 500
    .line 501
    const v3, -0x7f65a980

    .line 502
    .line 503
    .line 504
    invoke-interface {v5, v3}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 505
    .line 506
    .line 507
    sget-object v8, Landroidx/compose/foundation/layout/BoxScopeInstance;->INSTANCE:Landroidx/compose/foundation/layout/BoxScopeInstance;

    .line 508
    .line 509
    const v8, -0x2f1458d6

    .line 510
    .line 511
    .line 512
    invoke-interface {v5, v8}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 513
    .line 514
    .line 515
    and-int/lit8 v8, v6, 0xe

    .line 516
    .line 517
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 518
    .line 519
    .line 520
    move-result-object v8

    .line 521
    invoke-interface {v1, v5, v8}, Lkotlin/jvm/functions/Function2;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 522
    .line 523
    .line 524
    invoke-interface {v5}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 525
    .line 526
    .line 527
    invoke-interface {v5}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 528
    .line 529
    .line 530
    invoke-interface {v5}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 531
    .line 532
    .line 533
    invoke-interface {v5}, Landroidx/compose/runtime/Composer;->endNode()V

    .line 534
    .line 535
    .line 536
    invoke-interface {v5}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 537
    .line 538
    .line 539
    invoke-interface {v5}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 540
    .line 541
    .line 542
    const v8, -0x9ff6db6

    .line 543
    .line 544
    .line 545
    invoke-interface {v5, v8}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 546
    .line 547
    .line 548
    if-eqz v2, :cond_16

    .line 549
    .line 550
    invoke-static {v0, v7}, Landroidx/compose/ui/layout/LayoutIdKt;->layoutId(Landroidx/compose/ui/Modifier;Ljava/lang/Object;)Landroidx/compose/ui/Modifier;

    .line 551
    .line 552
    .line 553
    move-result-object v7

    .line 554
    const v8, 0x2bb5b5d7

    .line 555
    .line 556
    .line 557
    invoke-interface {v5, v8}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 558
    .line 559
    .line 560
    invoke-virtual {v10}, Landroidx/compose/ui/Alignment$Companion;->getTopStart()Landroidx/compose/ui/Alignment;

    .line 561
    .line 562
    .line 563
    move-result-object v8

    .line 564
    const/4 v9, 0x0

    .line 565
    invoke-static {v8, v9, v5, v9}, Landroidx/compose/foundation/layout/BoxKt;->rememberBoxMeasurePolicy(Landroidx/compose/ui/Alignment;ZLandroidx/compose/runtime/Composer;I)Landroidx/compose/ui/layout/MeasurePolicy;

    .line 566
    .line 567
    .line 568
    move-result-object v8

    .line 569
    const v9, -0x4ee9b9da

    .line 570
    .line 571
    .line 572
    invoke-interface {v5, v9}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 573
    .line 574
    .line 575
    invoke-static {}, Landroidx/compose/ui/platform/CompositionLocalsKt;->getLocalDensity()Landroidx/compose/runtime/ProvidableCompositionLocal;

    .line 576
    .line 577
    .line 578
    move-result-object v9

    .line 579
    invoke-interface {v5, v9}, Landroidx/compose/runtime/Composer;->consume(Landroidx/compose/runtime/CompositionLocal;)Ljava/lang/Object;

    .line 580
    .line 581
    .line 582
    move-result-object v9

    .line 583
    check-cast v9, Landroidx/compose/ui/unit/Density;

    .line 584
    .line 585
    invoke-static {}, Landroidx/compose/ui/platform/CompositionLocalsKt;->getLocalLayoutDirection()Landroidx/compose/runtime/ProvidableCompositionLocal;

    .line 586
    .line 587
    .line 588
    move-result-object v11

    .line 589
    invoke-interface {v5, v11}, Landroidx/compose/runtime/Composer;->consume(Landroidx/compose/runtime/CompositionLocal;)Ljava/lang/Object;

    .line 590
    .line 591
    .line 592
    move-result-object v11

    .line 593
    check-cast v11, Landroidx/compose/ui/unit/LayoutDirection;

    .line 594
    .line 595
    invoke-static {}, Landroidx/compose/ui/platform/CompositionLocalsKt;->getLocalViewConfiguration()Landroidx/compose/runtime/ProvidableCompositionLocal;

    .line 596
    .line 597
    .line 598
    move-result-object v12

    .line 599
    invoke-interface {v5, v12}, Landroidx/compose/runtime/Composer;->consume(Landroidx/compose/runtime/CompositionLocal;)Ljava/lang/Object;

    .line 600
    .line 601
    .line 602
    move-result-object v12

    .line 603
    check-cast v12, Landroidx/compose/ui/platform/ViewConfiguration;

    .line 604
    .line 605
    invoke-virtual {v13}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getConstructor()Lkotlin/jvm/functions/Function0;

    .line 606
    .line 607
    .line 608
    move-result-object v14

    .line 609
    invoke-static {v7}, Landroidx/compose/ui/layout/LayoutKt;->materializerOf(Landroidx/compose/ui/Modifier;)Lkotlin/jvm/functions/Function3;

    .line 610
    .line 611
    .line 612
    move-result-object v7

    .line 613
    invoke-interface {v5}, Landroidx/compose/runtime/Composer;->getApplier()Landroidx/compose/runtime/Applier;

    .line 614
    .line 615
    .line 616
    move-result-object v15

    .line 617
    instance-of v15, v15, Landroidx/compose/runtime/Applier;

    .line 618
    .line 619
    if-nez v15, :cond_14

    .line 620
    .line 621
    invoke-static {}, Landroidx/compose/runtime/ComposablesKt;->invalidApplier()V

    .line 622
    .line 623
    .line 624
    :cond_14
    invoke-interface {v5}, Landroidx/compose/runtime/Composer;->startReusableNode()V

    .line 625
    .line 626
    .line 627
    invoke-interface {v5}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 628
    .line 629
    .line 630
    move-result v15

    .line 631
    if-eqz v15, :cond_15

    .line 632
    .line 633
    invoke-interface {v5, v14}, Landroidx/compose/runtime/Composer;->createNode(Lkotlin/jvm/functions/Function0;)V

    .line 634
    .line 635
    .line 636
    goto :goto_b

    .line 637
    :cond_15
    invoke-interface {v5}, Landroidx/compose/runtime/Composer;->useNode()V

    .line 638
    .line 639
    .line 640
    :goto_b
    invoke-interface {v5}, Landroidx/compose/runtime/Composer;->disableReusing()V

    .line 641
    .line 642
    .line 643
    invoke-static {v5}, Landroidx/compose/runtime/Updater;->constructor-impl(Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;

    .line 644
    .line 645
    .line 646
    move-result-object v14

    .line 647
    invoke-virtual {v13}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetMeasurePolicy()Lkotlin/jvm/functions/Function2;

    .line 648
    .line 649
    .line 650
    move-result-object v15

    .line 651
    invoke-static {v14, v8, v15}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 652
    .line 653
    .line 654
    invoke-virtual {v13}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetDensity()Lkotlin/jvm/functions/Function2;

    .line 655
    .line 656
    .line 657
    move-result-object v8

    .line 658
    invoke-static {v14, v9, v8}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 659
    .line 660
    .line 661
    invoke-virtual {v13}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetLayoutDirection()Lkotlin/jvm/functions/Function2;

    .line 662
    .line 663
    .line 664
    move-result-object v8

    .line 665
    invoke-static {v14, v11, v8}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 666
    .line 667
    .line 668
    invoke-virtual {v13}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetViewConfiguration()Lkotlin/jvm/functions/Function2;

    .line 669
    .line 670
    .line 671
    move-result-object v8

    .line 672
    invoke-static {v14, v12, v8}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 673
    .line 674
    .line 675
    invoke-interface {v5}, Landroidx/compose/runtime/Composer;->enableReusing()V

    .line 676
    .line 677
    .line 678
    invoke-static {v5}, Landroidx/compose/runtime/SkippableUpdater;->constructor-impl(Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;

    .line 679
    .line 680
    .line 681
    move-result-object v8

    .line 682
    invoke-static {v8}, Landroidx/compose/runtime/SkippableUpdater;->box-impl(Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/SkippableUpdater;

    .line 683
    .line 684
    .line 685
    move-result-object v8

    .line 686
    const/4 v9, 0x0

    .line 687
    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 688
    .line 689
    .line 690
    move-result-object v11

    .line 691
    invoke-interface {v7, v8, v5, v11}, Lkotlin/jvm/functions/Function3;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 692
    .line 693
    .line 694
    const v7, 0x7ab4aae9

    .line 695
    .line 696
    .line 697
    invoke-interface {v5, v7}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 698
    .line 699
    .line 700
    invoke-interface {v5, v3}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 701
    .line 702
    .line 703
    const v7, 0x2fc930c5

    .line 704
    .line 705
    .line 706
    invoke-interface {v5, v7}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 707
    .line 708
    .line 709
    const/4 v7, 0x2

    .line 710
    new-array v7, v7, [Landroidx/compose/runtime/ProvidedValue;

    .line 711
    .line 712
    invoke-static {}, Landroidx/compose/material3/ContentColorKt;->getLocalContentColor()Landroidx/compose/runtime/ProvidableCompositionLocal;

    .line 713
    .line 714
    .line 715
    move-result-object v8

    .line 716
    invoke-static/range {p4 .. p5}, Landroidx/compose/ui/graphics/Color;->box-impl(J)Landroidx/compose/ui/graphics/Color;

    .line 717
    .line 718
    .line 719
    move-result-object v9

    .line 720
    invoke-virtual {v8, v9}, Landroidx/compose/runtime/ProvidableCompositionLocal;->provides(Ljava/lang/Object;)Landroidx/compose/runtime/ProvidedValue;

    .line 721
    .line 722
    .line 723
    move-result-object v8

    .line 724
    const/4 v9, 0x0

    .line 725
    aput-object v8, v7, v9

    .line 726
    .line 727
    invoke-static {}, Landroidx/compose/material3/TextKt;->getLocalTextStyle()Landroidx/compose/runtime/ProvidableCompositionLocal;

    .line 728
    .line 729
    .line 730
    move-result-object v8

    .line 731
    invoke-virtual {v8, v4}, Landroidx/compose/runtime/ProvidableCompositionLocal;->provides(Ljava/lang/Object;)Landroidx/compose/runtime/ProvidedValue;

    .line 732
    .line 733
    .line 734
    move-result-object v8

    .line 735
    const/4 v9, 0x1

    .line 736
    aput-object v8, v7, v9

    .line 737
    .line 738
    and-int/lit8 v8, v6, 0x70

    .line 739
    .line 740
    or-int/lit8 v8, v8, 0x8

    .line 741
    .line 742
    invoke-static {v7, v2, v5, v8}, Landroidx/compose/runtime/CompositionLocalKt;->CompositionLocalProvider([Landroidx/compose/runtime/ProvidedValue;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V

    .line 743
    .line 744
    .line 745
    invoke-interface {v5}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 746
    .line 747
    .line 748
    invoke-interface {v5}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 749
    .line 750
    .line 751
    invoke-interface {v5}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 752
    .line 753
    .line 754
    invoke-interface {v5}, Landroidx/compose/runtime/Composer;->endNode()V

    .line 755
    .line 756
    .line 757
    invoke-interface {v5}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 758
    .line 759
    .line 760
    invoke-interface {v5}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 761
    .line 762
    .line 763
    :cond_16
    invoke-interface {v5}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 764
    .line 765
    .line 766
    move-object/from16 v7, p2

    .line 767
    .line 768
    if-eqz v7, :cond_19

    .line 769
    .line 770
    move-object/from16 v8, v18

    .line 771
    .line 772
    invoke-static {v0, v8}, Landroidx/compose/ui/layout/LayoutIdKt;->layoutId(Landroidx/compose/ui/Modifier;Ljava/lang/Object;)Landroidx/compose/ui/Modifier;

    .line 773
    .line 774
    .line 775
    move-result-object v0

    .line 776
    const v8, 0x2bb5b5d7

    .line 777
    .line 778
    .line 779
    invoke-interface {v5, v8}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 780
    .line 781
    .line 782
    invoke-virtual {v10}, Landroidx/compose/ui/Alignment$Companion;->getTopStart()Landroidx/compose/ui/Alignment;

    .line 783
    .line 784
    .line 785
    move-result-object v8

    .line 786
    const/4 v9, 0x0

    .line 787
    invoke-static {v8, v9, v5, v9}, Landroidx/compose/foundation/layout/BoxKt;->rememberBoxMeasurePolicy(Landroidx/compose/ui/Alignment;ZLandroidx/compose/runtime/Composer;I)Landroidx/compose/ui/layout/MeasurePolicy;

    .line 788
    .line 789
    .line 790
    move-result-object v8

    .line 791
    const v9, -0x4ee9b9da

    .line 792
    .line 793
    .line 794
    invoke-interface {v5, v9}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 795
    .line 796
    .line 797
    invoke-static {}, Landroidx/compose/ui/platform/CompositionLocalsKt;->getLocalDensity()Landroidx/compose/runtime/ProvidableCompositionLocal;

    .line 798
    .line 799
    .line 800
    move-result-object v9

    .line 801
    invoke-interface {v5, v9}, Landroidx/compose/runtime/Composer;->consume(Landroidx/compose/runtime/CompositionLocal;)Ljava/lang/Object;

    .line 802
    .line 803
    .line 804
    move-result-object v9

    .line 805
    check-cast v9, Landroidx/compose/ui/unit/Density;

    .line 806
    .line 807
    invoke-static {}, Landroidx/compose/ui/platform/CompositionLocalsKt;->getLocalLayoutDirection()Landroidx/compose/runtime/ProvidableCompositionLocal;

    .line 808
    .line 809
    .line 810
    move-result-object v10

    .line 811
    invoke-interface {v5, v10}, Landroidx/compose/runtime/Composer;->consume(Landroidx/compose/runtime/CompositionLocal;)Ljava/lang/Object;

    .line 812
    .line 813
    .line 814
    move-result-object v10

    .line 815
    check-cast v10, Landroidx/compose/ui/unit/LayoutDirection;

    .line 816
    .line 817
    invoke-static {}, Landroidx/compose/ui/platform/CompositionLocalsKt;->getLocalViewConfiguration()Landroidx/compose/runtime/ProvidableCompositionLocal;

    .line 818
    .line 819
    .line 820
    move-result-object v11

    .line 821
    invoke-interface {v5, v11}, Landroidx/compose/runtime/Composer;->consume(Landroidx/compose/runtime/CompositionLocal;)Ljava/lang/Object;

    .line 822
    .line 823
    .line 824
    move-result-object v11

    .line 825
    check-cast v11, Landroidx/compose/ui/platform/ViewConfiguration;

    .line 826
    .line 827
    invoke-virtual {v13}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getConstructor()Lkotlin/jvm/functions/Function0;

    .line 828
    .line 829
    .line 830
    move-result-object v12

    .line 831
    invoke-static {v0}, Landroidx/compose/ui/layout/LayoutKt;->materializerOf(Landroidx/compose/ui/Modifier;)Lkotlin/jvm/functions/Function3;

    .line 832
    .line 833
    .line 834
    move-result-object v0

    .line 835
    invoke-interface {v5}, Landroidx/compose/runtime/Composer;->getApplier()Landroidx/compose/runtime/Applier;

    .line 836
    .line 837
    .line 838
    move-result-object v14

    .line 839
    instance-of v14, v14, Landroidx/compose/runtime/Applier;

    .line 840
    .line 841
    if-nez v14, :cond_17

    .line 842
    .line 843
    invoke-static {}, Landroidx/compose/runtime/ComposablesKt;->invalidApplier()V

    .line 844
    .line 845
    .line 846
    :cond_17
    invoke-interface {v5}, Landroidx/compose/runtime/Composer;->startReusableNode()V

    .line 847
    .line 848
    .line 849
    invoke-interface {v5}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 850
    .line 851
    .line 852
    move-result v14

    .line 853
    if-eqz v14, :cond_18

    .line 854
    .line 855
    invoke-interface {v5, v12}, Landroidx/compose/runtime/Composer;->createNode(Lkotlin/jvm/functions/Function0;)V

    .line 856
    .line 857
    .line 858
    goto :goto_c

    .line 859
    :cond_18
    invoke-interface {v5}, Landroidx/compose/runtime/Composer;->useNode()V

    .line 860
    .line 861
    .line 862
    :goto_c
    invoke-interface {v5}, Landroidx/compose/runtime/Composer;->disableReusing()V

    .line 863
    .line 864
    .line 865
    invoke-static {v5}, Landroidx/compose/runtime/Updater;->constructor-impl(Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;

    .line 866
    .line 867
    .line 868
    move-result-object v12

    .line 869
    invoke-virtual {v13}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetMeasurePolicy()Lkotlin/jvm/functions/Function2;

    .line 870
    .line 871
    .line 872
    move-result-object v14

    .line 873
    invoke-static {v12, v8, v14}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 874
    .line 875
    .line 876
    invoke-virtual {v13}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetDensity()Lkotlin/jvm/functions/Function2;

    .line 877
    .line 878
    .line 879
    move-result-object v8

    .line 880
    invoke-static {v12, v9, v8}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 881
    .line 882
    .line 883
    invoke-virtual {v13}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetLayoutDirection()Lkotlin/jvm/functions/Function2;

    .line 884
    .line 885
    .line 886
    move-result-object v8

    .line 887
    invoke-static {v12, v10, v8}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 888
    .line 889
    .line 890
    invoke-virtual {v13}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetViewConfiguration()Lkotlin/jvm/functions/Function2;

    .line 891
    .line 892
    .line 893
    move-result-object v8

    .line 894
    invoke-static {v12, v11, v8}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 895
    .line 896
    .line 897
    invoke-interface {v5}, Landroidx/compose/runtime/Composer;->enableReusing()V

    .line 898
    .line 899
    .line 900
    invoke-static {v5}, Landroidx/compose/runtime/SkippableUpdater;->constructor-impl(Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;

    .line 901
    .line 902
    .line 903
    move-result-object v8

    .line 904
    invoke-static {v8}, Landroidx/compose/runtime/SkippableUpdater;->box-impl(Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/SkippableUpdater;

    .line 905
    .line 906
    .line 907
    move-result-object v8

    .line 908
    const/4 v9, 0x0

    .line 909
    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 910
    .line 911
    .line 912
    move-result-object v10

    .line 913
    invoke-interface {v0, v8, v5, v10}, Lkotlin/jvm/functions/Function3;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 914
    .line 915
    .line 916
    const v0, 0x7ab4aae9

    .line 917
    .line 918
    .line 919
    invoke-interface {v5, v0}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 920
    .line 921
    .line 922
    invoke-interface {v5, v3}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 923
    .line 924
    .line 925
    const v0, 0x5450c7c

    .line 926
    .line 927
    .line 928
    invoke-interface {v5, v0}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 929
    .line 930
    .line 931
    const/4 v0, 0x1

    .line 932
    new-array v0, v0, [Landroidx/compose/runtime/ProvidedValue;

    .line 933
    .line 934
    invoke-static {}, Landroidx/compose/material3/ContentColorKt;->getLocalContentColor()Landroidx/compose/runtime/ProvidableCompositionLocal;

    .line 935
    .line 936
    .line 937
    move-result-object v3

    .line 938
    invoke-static/range {p6 .. p7}, Landroidx/compose/ui/graphics/Color;->box-impl(J)Landroidx/compose/ui/graphics/Color;

    .line 939
    .line 940
    .line 941
    move-result-object v8

    .line 942
    invoke-virtual {v3, v8}, Landroidx/compose/runtime/ProvidableCompositionLocal;->provides(Ljava/lang/Object;)Landroidx/compose/runtime/ProvidedValue;

    .line 943
    .line 944
    .line 945
    move-result-object v3

    .line 946
    const/4 v8, 0x0

    .line 947
    aput-object v3, v0, v8

    .line 948
    .line 949
    shr-int/lit8 v3, v6, 0x3

    .line 950
    .line 951
    and-int/lit8 v3, v3, 0x70

    .line 952
    .line 953
    or-int/lit8 v3, v3, 0x8

    .line 954
    .line 955
    invoke-static {v0, v7, v5, v3}, Landroidx/compose/runtime/CompositionLocalKt;->CompositionLocalProvider([Landroidx/compose/runtime/ProvidedValue;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V

    .line 956
    .line 957
    .line 958
    invoke-interface {v5}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 959
    .line 960
    .line 961
    invoke-interface {v5}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 962
    .line 963
    .line 964
    invoke-interface {v5}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 965
    .line 966
    .line 967
    invoke-interface {v5}, Landroidx/compose/runtime/Composer;->endNode()V

    .line 968
    .line 969
    .line 970
    invoke-interface {v5}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 971
    .line 972
    .line 973
    invoke-interface {v5}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 974
    .line 975
    .line 976
    :cond_19
    invoke-interface {v5}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 977
    .line 978
    .line 979
    invoke-interface {v5}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 980
    .line 981
    .line 982
    invoke-interface {v5}, Landroidx/compose/runtime/Composer;->endNode()V

    .line 983
    .line 984
    .line 985
    invoke-interface {v5}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 986
    .line 987
    .line 988
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 989
    .line 990
    .line 991
    move-result v0

    .line 992
    if-eqz v0, :cond_1a

    .line 993
    .line 994
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 995
    .line 996
    .line 997
    :cond_1a
    :goto_d
    invoke-interface {v5}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    .line 998
    .line 999
    .line 1000
    move-result-object v10

    .line 1001
    if-nez v10, :cond_1b

    .line 1002
    .line 1003
    goto :goto_e

    .line 1004
    :cond_1b
    new-instance v11, Landroidx/compose/material3/SnackbarKt$OneRowSnackbar$3;

    .line 1005
    .line 1006
    move-object v0, v11

    .line 1007
    move-object/from16 v1, p0

    .line 1008
    .line 1009
    move-object/from16 v2, p1

    .line 1010
    .line 1011
    move-object/from16 v3, p2

    .line 1012
    .line 1013
    move-object/from16 v4, p3

    .line 1014
    .line 1015
    move-wide/from16 v5, p4

    .line 1016
    .line 1017
    move-wide/from16 v7, p6

    .line 1018
    .line 1019
    move/from16 v9, p9

    .line 1020
    .line 1021
    invoke-direct/range {v0 .. v9}, Landroidx/compose/material3/SnackbarKt$OneRowSnackbar$3;-><init>(Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/text/TextStyle;JJI)V

    .line 1022
    .line 1023
    .line 1024
    invoke-interface {v10, v11}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lkotlin/jvm/functions/Function2;)V

    .line 1025
    .line 1026
    .line 1027
    :goto_e
    return-void
.end method

.method public static final Snackbar-eQBnUkQ(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;ZLandroidx/compose/ui/graphics/Shape;JJJJLkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V
    .locals 25
    .annotation build Landroidx/compose/runtime/Composable;
    .end annotation

    .annotation build Landroidx/compose/runtime/ComposableInferredTarget;
        scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/ui/Modifier;",
            "Lkotlin/jvm/functions/Function2<",
            "-",
            "Landroidx/compose/runtime/Composer;",
            "-",
            "Ljava/lang/Integer;",
            "Lkotlin/Unit;",
            ">;",
            "Lkotlin/jvm/functions/Function2<",
            "-",
            "Landroidx/compose/runtime/Composer;",
            "-",
            "Ljava/lang/Integer;",
            "Lkotlin/Unit;",
            ">;Z",
            "Landroidx/compose/ui/graphics/Shape;",
            "JJJJ",
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
    move-object/from16 v14, p13

    .line 2
    .line 3
    move/from16 v15, p15

    .line 4
    .line 5
    move/from16 v12, p16

    .line 6
    .line 7
    const-string v0, "content"

    .line 8
    .line 9
    invoke-static {v14, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    const v0, -0x49a8a49b

    .line 13
    .line 14
    .line 15
    move-object/from16 v1, p14

    .line 16
    .line 17
    invoke-interface {v1, v0}, Landroidx/compose/runtime/Composer;->startRestartGroup(I)Landroidx/compose/runtime/Composer;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    and-int/lit8 v2, v12, 0x1

    .line 22
    .line 23
    if-eqz v2, :cond_0

    .line 24
    .line 25
    or-int/lit8 v3, v15, 0x6

    .line 26
    .line 27
    move v4, v3

    .line 28
    move-object/from16 v3, p0

    .line 29
    .line 30
    goto :goto_1

    .line 31
    :cond_0
    and-int/lit8 v3, v15, 0xe

    .line 32
    .line 33
    if-nez v3, :cond_2

    .line 34
    .line 35
    move-object/from16 v3, p0

    .line 36
    .line 37
    invoke-interface {v1, v3}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 38
    .line 39
    .line 40
    move-result v4

    .line 41
    if-eqz v4, :cond_1

    .line 42
    .line 43
    const/4 v4, 0x4

    .line 44
    goto :goto_0

    .line 45
    :cond_1
    const/4 v4, 0x2

    .line 46
    :goto_0
    or-int/2addr v4, v15

    .line 47
    goto :goto_1

    .line 48
    :cond_2
    move-object/from16 v3, p0

    .line 49
    .line 50
    move v4, v15

    .line 51
    :goto_1
    and-int/lit8 v5, v12, 0x2

    .line 52
    .line 53
    if-eqz v5, :cond_3

    .line 54
    .line 55
    or-int/lit8 v4, v4, 0x30

    .line 56
    .line 57
    goto :goto_3

    .line 58
    :cond_3
    and-int/lit8 v6, v15, 0x70

    .line 59
    .line 60
    if-nez v6, :cond_5

    .line 61
    .line 62
    move-object/from16 v6, p1

    .line 63
    .line 64
    invoke-interface {v1, v6}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 65
    .line 66
    .line 67
    move-result v7

    .line 68
    if-eqz v7, :cond_4

    .line 69
    .line 70
    const/16 v7, 0x20

    .line 71
    .line 72
    goto :goto_2

    .line 73
    :cond_4
    const/16 v7, 0x10

    .line 74
    .line 75
    :goto_2
    or-int/2addr v4, v7

    .line 76
    goto :goto_4

    .line 77
    :cond_5
    :goto_3
    move-object/from16 v6, p1

    .line 78
    .line 79
    :goto_4
    and-int/lit8 v7, v12, 0x4

    .line 80
    .line 81
    if-eqz v7, :cond_6

    .line 82
    .line 83
    or-int/lit16 v4, v4, 0x180

    .line 84
    .line 85
    goto :goto_6

    .line 86
    :cond_6
    and-int/lit16 v8, v15, 0x380

    .line 87
    .line 88
    if-nez v8, :cond_8

    .line 89
    .line 90
    move-object/from16 v8, p2

    .line 91
    .line 92
    invoke-interface {v1, v8}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 93
    .line 94
    .line 95
    move-result v9

    .line 96
    if-eqz v9, :cond_7

    .line 97
    .line 98
    const/16 v9, 0x100

    .line 99
    .line 100
    goto :goto_5

    .line 101
    :cond_7
    const/16 v9, 0x80

    .line 102
    .line 103
    :goto_5
    or-int/2addr v4, v9

    .line 104
    goto :goto_7

    .line 105
    :cond_8
    :goto_6
    move-object/from16 v8, p2

    .line 106
    .line 107
    :goto_7
    and-int/lit8 v9, v12, 0x8

    .line 108
    .line 109
    if-eqz v9, :cond_9

    .line 110
    .line 111
    or-int/lit16 v4, v4, 0xc00

    .line 112
    .line 113
    goto :goto_9

    .line 114
    :cond_9
    and-int/lit16 v10, v15, 0x1c00

    .line 115
    .line 116
    if-nez v10, :cond_b

    .line 117
    .line 118
    move/from16 v10, p3

    .line 119
    .line 120
    invoke-interface {v1, v10}, Landroidx/compose/runtime/Composer;->changed(Z)Z

    .line 121
    .line 122
    .line 123
    move-result v11

    .line 124
    if-eqz v11, :cond_a

    .line 125
    .line 126
    const/16 v11, 0x800

    .line 127
    .line 128
    goto :goto_8

    .line 129
    :cond_a
    const/16 v11, 0x400

    .line 130
    .line 131
    :goto_8
    or-int/2addr v4, v11

    .line 132
    goto :goto_a

    .line 133
    :cond_b
    :goto_9
    move/from16 v10, p3

    .line 134
    .line 135
    :goto_a
    const v11, 0xe000

    .line 136
    .line 137
    .line 138
    and-int/2addr v11, v15

    .line 139
    if-nez v11, :cond_e

    .line 140
    .line 141
    and-int/lit8 v11, v12, 0x10

    .line 142
    .line 143
    if-nez v11, :cond_c

    .line 144
    .line 145
    move-object/from16 v11, p4

    .line 146
    .line 147
    invoke-interface {v1, v11}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 148
    .line 149
    .line 150
    move-result v13

    .line 151
    if-eqz v13, :cond_d

    .line 152
    .line 153
    const/16 v13, 0x4000

    .line 154
    .line 155
    goto :goto_b

    .line 156
    :cond_c
    move-object/from16 v11, p4

    .line 157
    .line 158
    :cond_d
    const/16 v13, 0x2000

    .line 159
    .line 160
    :goto_b
    or-int/2addr v4, v13

    .line 161
    goto :goto_c

    .line 162
    :cond_e
    move-object/from16 v11, p4

    .line 163
    .line 164
    :goto_c
    const/high16 v13, 0x70000

    .line 165
    .line 166
    and-int/2addr v13, v15

    .line 167
    if-nez v13, :cond_10

    .line 168
    .line 169
    and-int/lit8 v13, v12, 0x20

    .line 170
    .line 171
    move-wide/from16 v10, p5

    .line 172
    .line 173
    if-nez v13, :cond_f

    .line 174
    .line 175
    invoke-interface {v1, v10, v11}, Landroidx/compose/runtime/Composer;->changed(J)Z

    .line 176
    .line 177
    .line 178
    move-result v13

    .line 179
    if-eqz v13, :cond_f

    .line 180
    .line 181
    const/high16 v13, 0x20000

    .line 182
    .line 183
    goto :goto_d

    .line 184
    :cond_f
    const/high16 v13, 0x10000

    .line 185
    .line 186
    :goto_d
    or-int/2addr v4, v13

    .line 187
    goto :goto_e

    .line 188
    :cond_10
    move-wide/from16 v10, p5

    .line 189
    .line 190
    :goto_e
    const/high16 v13, 0x380000

    .line 191
    .line 192
    and-int/2addr v13, v15

    .line 193
    if-nez v13, :cond_12

    .line 194
    .line 195
    and-int/lit8 v13, v12, 0x40

    .line 196
    .line 197
    move-wide/from16 v10, p7

    .line 198
    .line 199
    if-nez v13, :cond_11

    .line 200
    .line 201
    invoke-interface {v1, v10, v11}, Landroidx/compose/runtime/Composer;->changed(J)Z

    .line 202
    .line 203
    .line 204
    move-result v13

    .line 205
    if-eqz v13, :cond_11

    .line 206
    .line 207
    const/high16 v13, 0x100000

    .line 208
    .line 209
    goto :goto_f

    .line 210
    :cond_11
    const/high16 v13, 0x80000

    .line 211
    .line 212
    :goto_f
    or-int/2addr v4, v13

    .line 213
    goto :goto_10

    .line 214
    :cond_12
    move-wide/from16 v10, p7

    .line 215
    .line 216
    :goto_10
    const/high16 v13, 0x1c00000

    .line 217
    .line 218
    and-int/2addr v13, v15

    .line 219
    if-nez v13, :cond_14

    .line 220
    .line 221
    and-int/lit16 v13, v12, 0x80

    .line 222
    .line 223
    move-wide/from16 v10, p9

    .line 224
    .line 225
    if-nez v13, :cond_13

    .line 226
    .line 227
    invoke-interface {v1, v10, v11}, Landroidx/compose/runtime/Composer;->changed(J)Z

    .line 228
    .line 229
    .line 230
    move-result v13

    .line 231
    if-eqz v13, :cond_13

    .line 232
    .line 233
    const/high16 v13, 0x800000

    .line 234
    .line 235
    goto :goto_11

    .line 236
    :cond_13
    const/high16 v13, 0x400000

    .line 237
    .line 238
    :goto_11
    or-int/2addr v4, v13

    .line 239
    goto :goto_12

    .line 240
    :cond_14
    move-wide/from16 v10, p9

    .line 241
    .line 242
    :goto_12
    const/high16 v13, 0xe000000

    .line 243
    .line 244
    and-int/2addr v13, v15

    .line 245
    if-nez v13, :cond_16

    .line 246
    .line 247
    and-int/lit16 v13, v12, 0x100

    .line 248
    .line 249
    move-wide/from16 v10, p11

    .line 250
    .line 251
    if-nez v13, :cond_15

    .line 252
    .line 253
    invoke-interface {v1, v10, v11}, Landroidx/compose/runtime/Composer;->changed(J)Z

    .line 254
    .line 255
    .line 256
    move-result v13

    .line 257
    if-eqz v13, :cond_15

    .line 258
    .line 259
    const/high16 v13, 0x4000000

    .line 260
    .line 261
    goto :goto_13

    .line 262
    :cond_15
    const/high16 v13, 0x2000000

    .line 263
    .line 264
    :goto_13
    or-int/2addr v4, v13

    .line 265
    goto :goto_14

    .line 266
    :cond_16
    move-wide/from16 v10, p11

    .line 267
    .line 268
    :goto_14
    and-int/lit16 v13, v12, 0x200

    .line 269
    .line 270
    if-eqz v13, :cond_17

    .line 271
    .line 272
    const/high16 v13, 0x30000000

    .line 273
    .line 274
    :goto_15
    or-int/2addr v4, v13

    .line 275
    goto :goto_16

    .line 276
    :cond_17
    const/high16 v13, 0x70000000

    .line 277
    .line 278
    and-int/2addr v13, v15

    .line 279
    if-nez v13, :cond_19

    .line 280
    .line 281
    invoke-interface {v1, v14}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 282
    .line 283
    .line 284
    move-result v13

    .line 285
    if-eqz v13, :cond_18

    .line 286
    .line 287
    const/high16 v13, 0x20000000

    .line 288
    .line 289
    goto :goto_15

    .line 290
    :cond_18
    const/high16 v13, 0x10000000

    .line 291
    .line 292
    goto :goto_15

    .line 293
    :cond_19
    :goto_16
    const v13, 0x5b6db6db

    .line 294
    .line 295
    .line 296
    and-int/2addr v13, v4

    .line 297
    const v0, 0x12492492

    .line 298
    .line 299
    .line 300
    if-ne v13, v0, :cond_1b

    .line 301
    .line 302
    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->getSkipping()Z

    .line 303
    .line 304
    .line 305
    move-result v0

    .line 306
    if-nez v0, :cond_1a

    .line 307
    .line 308
    goto :goto_17

    .line 309
    :cond_1a
    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    .line 310
    .line 311
    .line 312
    move/from16 v4, p3

    .line 313
    .line 314
    move-object/from16 v5, p4

    .line 315
    .line 316
    move-wide/from16 v19, p7

    .line 317
    .line 318
    move-object v2, v6

    .line 319
    move-wide v12, v10

    .line 320
    move-wide/from16 v6, p5

    .line 321
    .line 322
    move-wide/from16 v10, p9

    .line 323
    .line 324
    goto/16 :goto_21

    .line 325
    .line 326
    :cond_1b
    :goto_17
    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->startDefaults()V

    .line 327
    .line 328
    .line 329
    and-int/lit8 v0, v15, 0x1

    .line 330
    .line 331
    const v13, -0xe000001

    .line 332
    .line 333
    .line 334
    const v17, -0x1c00001

    .line 335
    .line 336
    .line 337
    const v18, -0x380001

    .line 338
    .line 339
    .line 340
    const v19, -0x70001

    .line 341
    .line 342
    .line 343
    const v20, -0xe001

    .line 344
    .line 345
    .line 346
    if-eqz v0, :cond_22

    .line 347
    .line 348
    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->getDefaultsInvalid()Z

    .line 349
    .line 350
    .line 351
    move-result v0

    .line 352
    if-eqz v0, :cond_1c

    .line 353
    .line 354
    goto :goto_18

    .line 355
    :cond_1c
    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    .line 356
    .line 357
    .line 358
    and-int/lit8 v0, v12, 0x10

    .line 359
    .line 360
    if-eqz v0, :cond_1d

    .line 361
    .line 362
    and-int v4, v4, v20

    .line 363
    .line 364
    :cond_1d
    and-int/lit8 v0, v12, 0x20

    .line 365
    .line 366
    if-eqz v0, :cond_1e

    .line 367
    .line 368
    and-int v4, v4, v19

    .line 369
    .line 370
    :cond_1e
    and-int/lit8 v0, v12, 0x40

    .line 371
    .line 372
    if-eqz v0, :cond_1f

    .line 373
    .line 374
    and-int v4, v4, v18

    .line 375
    .line 376
    :cond_1f
    and-int/lit16 v0, v12, 0x80

    .line 377
    .line 378
    if-eqz v0, :cond_20

    .line 379
    .line 380
    and-int v4, v4, v17

    .line 381
    .line 382
    :cond_20
    and-int/lit16 v0, v12, 0x100

    .line 383
    .line 384
    if-eqz v0, :cond_21

    .line 385
    .line 386
    and-int/2addr v4, v13

    .line 387
    :cond_21
    move-object/from16 v5, p4

    .line 388
    .line 389
    move-wide/from16 v19, p7

    .line 390
    .line 391
    move-wide/from16 v21, p9

    .line 392
    .line 393
    move-object v0, v3

    .line 394
    move-object v2, v8

    .line 395
    move/from16 v3, p3

    .line 396
    .line 397
    move-wide/from16 v8, p5

    .line 398
    .line 399
    goto/16 :goto_20

    .line 400
    .line 401
    :cond_22
    :goto_18
    if-eqz v2, :cond_23

    .line 402
    .line 403
    sget-object v0, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    .line 404
    .line 405
    goto :goto_19

    .line 406
    :cond_23
    move-object v0, v3

    .line 407
    :goto_19
    const/4 v2, 0x0

    .line 408
    if-eqz v5, :cond_24

    .line 409
    .line 410
    move-object v6, v2

    .line 411
    :cond_24
    if-eqz v7, :cond_25

    .line 412
    .line 413
    goto :goto_1a

    .line 414
    :cond_25
    move-object v2, v8

    .line 415
    :goto_1a
    if-eqz v9, :cond_26

    .line 416
    .line 417
    const/4 v3, 0x0

    .line 418
    goto :goto_1b

    .line 419
    :cond_26
    move/from16 v3, p3

    .line 420
    .line 421
    :goto_1b
    and-int/lit8 v5, v12, 0x10

    .line 422
    .line 423
    const/4 v7, 0x6

    .line 424
    if-eqz v5, :cond_27

    .line 425
    .line 426
    sget-object v5, Landroidx/compose/material3/SnackbarDefaults;->INSTANCE:Landroidx/compose/material3/SnackbarDefaults;

    .line 427
    .line 428
    invoke-virtual {v5, v1, v7}, Landroidx/compose/material3/SnackbarDefaults;->getShape(Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/graphics/Shape;

    .line 429
    .line 430
    .line 431
    move-result-object v5

    .line 432
    and-int v4, v4, v20

    .line 433
    .line 434
    goto :goto_1c

    .line 435
    :cond_27
    move-object/from16 v5, p4

    .line 436
    .line 437
    :goto_1c
    and-int/lit8 v8, v12, 0x20

    .line 438
    .line 439
    if-eqz v8, :cond_28

    .line 440
    .line 441
    sget-object v8, Landroidx/compose/material3/SnackbarDefaults;->INSTANCE:Landroidx/compose/material3/SnackbarDefaults;

    .line 442
    .line 443
    invoke-virtual {v8, v1, v7}, Landroidx/compose/material3/SnackbarDefaults;->getColor(Landroidx/compose/runtime/Composer;I)J

    .line 444
    .line 445
    .line 446
    move-result-wide v8

    .line 447
    and-int v4, v4, v19

    .line 448
    .line 449
    goto :goto_1d

    .line 450
    :cond_28
    move-wide/from16 v8, p5

    .line 451
    .line 452
    :goto_1d
    and-int/lit8 v19, v12, 0x40

    .line 453
    .line 454
    if-eqz v19, :cond_29

    .line 455
    .line 456
    sget-object v13, Landroidx/compose/material3/SnackbarDefaults;->INSTANCE:Landroidx/compose/material3/SnackbarDefaults;

    .line 457
    .line 458
    invoke-virtual {v13, v1, v7}, Landroidx/compose/material3/SnackbarDefaults;->getContentColor(Landroidx/compose/runtime/Composer;I)J

    .line 459
    .line 460
    .line 461
    move-result-wide v19

    .line 462
    and-int v4, v4, v18

    .line 463
    .line 464
    goto :goto_1e

    .line 465
    :cond_29
    move-wide/from16 v19, p7

    .line 466
    .line 467
    :goto_1e
    and-int/lit16 v13, v12, 0x80

    .line 468
    .line 469
    if-eqz v13, :cond_2a

    .line 470
    .line 471
    sget-object v13, Landroidx/compose/material3/SnackbarDefaults;->INSTANCE:Landroidx/compose/material3/SnackbarDefaults;

    .line 472
    .line 473
    invoke-virtual {v13, v1, v7}, Landroidx/compose/material3/SnackbarDefaults;->getActionContentColor(Landroidx/compose/runtime/Composer;I)J

    .line 474
    .line 475
    .line 476
    move-result-wide v21

    .line 477
    and-int v4, v4, v17

    .line 478
    .line 479
    goto :goto_1f

    .line 480
    :cond_2a
    move-wide/from16 v21, p9

    .line 481
    .line 482
    :goto_1f
    and-int/lit16 v13, v12, 0x100

    .line 483
    .line 484
    if-eqz v13, :cond_2b

    .line 485
    .line 486
    sget-object v10, Landroidx/compose/material3/SnackbarDefaults;->INSTANCE:Landroidx/compose/material3/SnackbarDefaults;

    .line 487
    .line 488
    invoke-virtual {v10, v1, v7}, Landroidx/compose/material3/SnackbarDefaults;->getDismissActionContentColor(Landroidx/compose/runtime/Composer;I)J

    .line 489
    .line 490
    .line 491
    move-result-wide v10

    .line 492
    const v7, -0xe000001

    .line 493
    .line 494
    .line 495
    and-int/2addr v4, v7

    .line 496
    :cond_2b
    :goto_20
    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->endDefaults()V

    .line 497
    .line 498
    .line 499
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 500
    .line 501
    .line 502
    move-result v7

    .line 503
    if-eqz v7, :cond_2c

    .line 504
    .line 505
    const/4 v7, -0x1

    .line 506
    const-string v13, "androidx.compose.material3.Snackbar (Snackbar.kt:91)"

    .line 507
    .line 508
    const v12, -0x49a8a49b

    .line 509
    .line 510
    .line 511
    invoke-static {v12, v4, v7, v13}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 512
    .line 513
    .line 514
    :cond_2c
    sget-object v12, Landroidx/compose/material3/tokens/SnackbarTokens;->INSTANCE:Landroidx/compose/material3/tokens/SnackbarTokens;

    .line 515
    .line 516
    invoke-virtual {v12}, Landroidx/compose/material3/tokens/SnackbarTokens;->getContainerElevation-D9Ej5fM()F

    .line 517
    .line 518
    .line 519
    move-result v12

    .line 520
    new-instance v13, Landroidx/compose/material3/SnackbarKt$Snackbar$1;

    .line 521
    .line 522
    move-object/from16 p0, v13

    .line 523
    .line 524
    move-object/from16 p1, v6

    .line 525
    .line 526
    move-object/from16 p2, p13

    .line 527
    .line 528
    move-object/from16 p3, v2

    .line 529
    .line 530
    move-wide/from16 p4, v21

    .line 531
    .line 532
    move-wide/from16 p6, v10

    .line 533
    .line 534
    move/from16 p8, v4

    .line 535
    .line 536
    move/from16 p9, v3

    .line 537
    .line 538
    invoke-direct/range {p0 .. p9}, Landroidx/compose/material3/SnackbarKt$Snackbar$1;-><init>(Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;JJIZ)V

    .line 539
    .line 540
    .line 541
    const v7, -0x6d0e72d6

    .line 542
    .line 543
    .line 544
    move-object/from16 p14, v2

    .line 545
    .line 546
    const/4 v2, 0x1

    .line 547
    invoke-static {v1, v7, v2, v13}, Landroidx/compose/runtime/internal/ComposableLambdaKt;->composableLambda(Landroidx/compose/runtime/Composer;IZLjava/lang/Object;)Landroidx/compose/runtime/internal/ComposableLambda;

    .line 548
    .line 549
    .line 550
    move-result-object v2

    .line 551
    const/high16 v7, 0xc30000

    .line 552
    .line 553
    and-int/lit8 v13, v4, 0xe

    .line 554
    .line 555
    or-int/2addr v7, v13

    .line 556
    shr-int/lit8 v4, v4, 0x9

    .line 557
    .line 558
    and-int/lit8 v13, v4, 0x70

    .line 559
    .line 560
    or-int/2addr v7, v13

    .line 561
    and-int/lit16 v13, v4, 0x380

    .line 562
    .line 563
    or-int/2addr v7, v13

    .line 564
    and-int/lit16 v4, v4, 0x1c00

    .line 565
    .line 566
    or-int/2addr v4, v7

    .line 567
    const/16 v7, 0x50

    .line 568
    .line 569
    move-object/from16 p0, v0

    .line 570
    .line 571
    move-object/from16 p1, v5

    .line 572
    .line 573
    move-wide/from16 p2, v8

    .line 574
    .line 575
    move-wide/from16 p4, v19

    .line 576
    .line 577
    const/4 v13, 0x0

    .line 578
    move/from16 p6, v13

    .line 579
    .line 580
    move/from16 p7, v12

    .line 581
    .line 582
    const/4 v12, 0x0

    .line 583
    move-object/from16 p8, v12

    .line 584
    .line 585
    move-object/from16 p9, v2

    .line 586
    .line 587
    move-object/from16 p10, v1

    .line 588
    .line 589
    move/from16 p11, v4

    .line 590
    .line 591
    move/from16 p12, v7

    .line 592
    .line 593
    invoke-static/range {p0 .. p12}, Landroidx/compose/material3/SurfaceKt;->Surface-T9BRK9s(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/graphics/Shape;JJFFLandroidx/compose/foundation/BorderStroke;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V

    .line 594
    .line 595
    .line 596
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 597
    .line 598
    .line 599
    move-result v2

    .line 600
    if-eqz v2, :cond_2d

    .line 601
    .line 602
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 603
    .line 604
    .line 605
    :cond_2d
    move v4, v3

    .line 606
    move-object v2, v6

    .line 607
    move-wide v6, v8

    .line 608
    move-wide v12, v10

    .line 609
    move-wide/from16 v10, v21

    .line 610
    .line 611
    move-object/from16 v8, p14

    .line 612
    .line 613
    move-object v3, v0

    .line 614
    :goto_21
    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    .line 615
    .line 616
    .line 617
    move-result-object v9

    .line 618
    if-nez v9, :cond_2e

    .line 619
    .line 620
    goto :goto_22

    .line 621
    :cond_2e
    new-instance v1, Landroidx/compose/material3/SnackbarKt$Snackbar$2;

    .line 622
    .line 623
    move-object v0, v1

    .line 624
    move-object/from16 v23, v1

    .line 625
    .line 626
    move-object v1, v3

    .line 627
    move-object v3, v8

    .line 628
    move-object/from16 v24, v9

    .line 629
    .line 630
    move-wide/from16 v8, v19

    .line 631
    .line 632
    move-object/from16 v14, p13

    .line 633
    .line 634
    move/from16 v15, p15

    .line 635
    .line 636
    move/from16 v16, p16

    .line 637
    .line 638
    invoke-direct/range {v0 .. v16}, Landroidx/compose/material3/SnackbarKt$Snackbar$2;-><init>(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;ZLandroidx/compose/ui/graphics/Shape;JJJJLkotlin/jvm/functions/Function2;II)V

    .line 639
    .line 640
    .line 641
    move-object/from16 v1, v23

    .line 642
    .line 643
    move-object/from16 v0, v24

    .line 644
    .line 645
    invoke-interface {v0, v1}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lkotlin/jvm/functions/Function2;)V

    .line 646
    .line 647
    .line 648
    :goto_22
    return-void
.end method

.method public static final Snackbar-sDKtq54(Landroidx/compose/material3/SnackbarData;Landroidx/compose/ui/Modifier;ZLandroidx/compose/ui/graphics/Shape;JJJJJLandroidx/compose/runtime/Composer;II)V
    .locals 39
    .annotation build Landroidx/compose/runtime/Composable;
    .end annotation

    .annotation build Landroidx/compose/runtime/ComposableTarget;
        applier = "androidx.compose.ui.UiComposable"
    .end annotation

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move/from16 v15, p15

    .line 4
    .line 5
    move/from16 v13, p16

    .line 6
    .line 7
    const-string/jumbo v0, "snackbarData"

    .line 8
    .line 9
    .line 10
    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    const v0, 0x105e641f

    .line 14
    .line 15
    .line 16
    move-object/from16 v2, p14

    .line 17
    .line 18
    invoke-interface {v2, v0}, Landroidx/compose/runtime/Composer;->startRestartGroup(I)Landroidx/compose/runtime/Composer;

    .line 19
    .line 20
    .line 21
    move-result-object v2

    .line 22
    and-int/lit8 v3, v13, 0x1

    .line 23
    .line 24
    if-eqz v3, :cond_0

    .line 25
    .line 26
    or-int/lit8 v3, v15, 0x6

    .line 27
    .line 28
    goto :goto_1

    .line 29
    :cond_0
    and-int/lit8 v3, v15, 0xe

    .line 30
    .line 31
    if-nez v3, :cond_2

    .line 32
    .line 33
    invoke-interface {v2, v1}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 34
    .line 35
    .line 36
    move-result v3

    .line 37
    if-eqz v3, :cond_1

    .line 38
    .line 39
    const/4 v3, 0x4

    .line 40
    goto :goto_0

    .line 41
    :cond_1
    const/4 v3, 0x2

    .line 42
    :goto_0
    or-int/2addr v3, v15

    .line 43
    goto :goto_1

    .line 44
    :cond_2
    move v3, v15

    .line 45
    :goto_1
    and-int/lit8 v4, v13, 0x2

    .line 46
    .line 47
    if-eqz v4, :cond_3

    .line 48
    .line 49
    or-int/lit8 v3, v3, 0x30

    .line 50
    .line 51
    goto :goto_3

    .line 52
    :cond_3
    and-int/lit8 v5, v15, 0x70

    .line 53
    .line 54
    if-nez v5, :cond_5

    .line 55
    .line 56
    move-object/from16 v5, p1

    .line 57
    .line 58
    invoke-interface {v2, v5}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 59
    .line 60
    .line 61
    move-result v6

    .line 62
    if-eqz v6, :cond_4

    .line 63
    .line 64
    const/16 v6, 0x20

    .line 65
    .line 66
    goto :goto_2

    .line 67
    :cond_4
    const/16 v6, 0x10

    .line 68
    .line 69
    :goto_2
    or-int/2addr v3, v6

    .line 70
    goto :goto_4

    .line 71
    :cond_5
    :goto_3
    move-object/from16 v5, p1

    .line 72
    .line 73
    :goto_4
    and-int/lit8 v6, v13, 0x4

    .line 74
    .line 75
    if-eqz v6, :cond_6

    .line 76
    .line 77
    or-int/lit16 v3, v3, 0x180

    .line 78
    .line 79
    goto :goto_6

    .line 80
    :cond_6
    and-int/lit16 v7, v15, 0x380

    .line 81
    .line 82
    if-nez v7, :cond_8

    .line 83
    .line 84
    move/from16 v7, p2

    .line 85
    .line 86
    invoke-interface {v2, v7}, Landroidx/compose/runtime/Composer;->changed(Z)Z

    .line 87
    .line 88
    .line 89
    move-result v8

    .line 90
    if-eqz v8, :cond_7

    .line 91
    .line 92
    const/16 v8, 0x100

    .line 93
    .line 94
    goto :goto_5

    .line 95
    :cond_7
    const/16 v8, 0x80

    .line 96
    .line 97
    :goto_5
    or-int/2addr v3, v8

    .line 98
    goto :goto_7

    .line 99
    :cond_8
    :goto_6
    move/from16 v7, p2

    .line 100
    .line 101
    :goto_7
    and-int/lit16 v8, v15, 0x1c00

    .line 102
    .line 103
    if-nez v8, :cond_b

    .line 104
    .line 105
    and-int/lit8 v8, v13, 0x8

    .line 106
    .line 107
    if-nez v8, :cond_9

    .line 108
    .line 109
    move-object/from16 v8, p3

    .line 110
    .line 111
    invoke-interface {v2, v8}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 112
    .line 113
    .line 114
    move-result v9

    .line 115
    if-eqz v9, :cond_a

    .line 116
    .line 117
    const/16 v9, 0x800

    .line 118
    .line 119
    goto :goto_8

    .line 120
    :cond_9
    move-object/from16 v8, p3

    .line 121
    .line 122
    :cond_a
    const/16 v9, 0x400

    .line 123
    .line 124
    :goto_8
    or-int/2addr v3, v9

    .line 125
    goto :goto_9

    .line 126
    :cond_b
    move-object/from16 v8, p3

    .line 127
    .line 128
    :goto_9
    const v9, 0xe000

    .line 129
    .line 130
    .line 131
    and-int v10, v15, v9

    .line 132
    .line 133
    if-nez v10, :cond_e

    .line 134
    .line 135
    and-int/lit8 v10, v13, 0x10

    .line 136
    .line 137
    if-nez v10, :cond_c

    .line 138
    .line 139
    move-wide/from16 v10, p4

    .line 140
    .line 141
    invoke-interface {v2, v10, v11}, Landroidx/compose/runtime/Composer;->changed(J)Z

    .line 142
    .line 143
    .line 144
    move-result v12

    .line 145
    if-eqz v12, :cond_d

    .line 146
    .line 147
    const/16 v12, 0x4000

    .line 148
    .line 149
    goto :goto_a

    .line 150
    :cond_c
    move-wide/from16 v10, p4

    .line 151
    .line 152
    :cond_d
    const/16 v12, 0x2000

    .line 153
    .line 154
    :goto_a
    or-int/2addr v3, v12

    .line 155
    goto :goto_b

    .line 156
    :cond_e
    move-wide/from16 v10, p4

    .line 157
    .line 158
    :goto_b
    const/high16 v12, 0x70000

    .line 159
    .line 160
    and-int v14, v15, v12

    .line 161
    .line 162
    if-nez v14, :cond_10

    .line 163
    .line 164
    and-int/lit8 v14, v13, 0x20

    .line 165
    .line 166
    move-wide/from16 v9, p6

    .line 167
    .line 168
    if-nez v14, :cond_f

    .line 169
    .line 170
    invoke-interface {v2, v9, v10}, Landroidx/compose/runtime/Composer;->changed(J)Z

    .line 171
    .line 172
    .line 173
    move-result v11

    .line 174
    if-eqz v11, :cond_f

    .line 175
    .line 176
    const/high16 v11, 0x20000

    .line 177
    .line 178
    goto :goto_c

    .line 179
    :cond_f
    const/high16 v11, 0x10000

    .line 180
    .line 181
    :goto_c
    or-int/2addr v3, v11

    .line 182
    goto :goto_d

    .line 183
    :cond_10
    move-wide/from16 v9, p6

    .line 184
    .line 185
    :goto_d
    const/high16 v11, 0x380000

    .line 186
    .line 187
    and-int v14, v15, v11

    .line 188
    .line 189
    if-nez v14, :cond_12

    .line 190
    .line 191
    and-int/lit8 v14, v13, 0x40

    .line 192
    .line 193
    move-wide/from16 v11, p8

    .line 194
    .line 195
    if-nez v14, :cond_11

    .line 196
    .line 197
    invoke-interface {v2, v11, v12}, Landroidx/compose/runtime/Composer;->changed(J)Z

    .line 198
    .line 199
    .line 200
    move-result v16

    .line 201
    if-eqz v16, :cond_11

    .line 202
    .line 203
    const/high16 v16, 0x100000

    .line 204
    .line 205
    goto :goto_e

    .line 206
    :cond_11
    const/high16 v16, 0x80000

    .line 207
    .line 208
    :goto_e
    or-int v3, v3, v16

    .line 209
    .line 210
    goto :goto_f

    .line 211
    :cond_12
    move-wide/from16 v11, p8

    .line 212
    .line 213
    :goto_f
    const/high16 v18, 0x1c00000

    .line 214
    .line 215
    and-int v16, v15, v18

    .line 216
    .line 217
    if-nez v16, :cond_14

    .line 218
    .line 219
    and-int/lit16 v14, v13, 0x80

    .line 220
    .line 221
    move-wide/from16 v0, p10

    .line 222
    .line 223
    if-nez v14, :cond_13

    .line 224
    .line 225
    invoke-interface {v2, v0, v1}, Landroidx/compose/runtime/Composer;->changed(J)Z

    .line 226
    .line 227
    .line 228
    move-result v16

    .line 229
    if-eqz v16, :cond_13

    .line 230
    .line 231
    const/high16 v16, 0x800000

    .line 232
    .line 233
    goto :goto_10

    .line 234
    :cond_13
    const/high16 v16, 0x400000

    .line 235
    .line 236
    :goto_10
    or-int v3, v3, v16

    .line 237
    .line 238
    goto :goto_11

    .line 239
    :cond_14
    move-wide/from16 v0, p10

    .line 240
    .line 241
    :goto_11
    const/high16 v20, 0xe000000

    .line 242
    .line 243
    and-int v16, v15, v20

    .line 244
    .line 245
    if-nez v16, :cond_16

    .line 246
    .line 247
    and-int/lit16 v14, v13, 0x100

    .line 248
    .line 249
    move-wide/from16 v0, p12

    .line 250
    .line 251
    if-nez v14, :cond_15

    .line 252
    .line 253
    invoke-interface {v2, v0, v1}, Landroidx/compose/runtime/Composer;->changed(J)Z

    .line 254
    .line 255
    .line 256
    move-result v14

    .line 257
    if-eqz v14, :cond_15

    .line 258
    .line 259
    const/high16 v14, 0x4000000

    .line 260
    .line 261
    goto :goto_12

    .line 262
    :cond_15
    const/high16 v14, 0x2000000

    .line 263
    .line 264
    :goto_12
    or-int/2addr v3, v14

    .line 265
    goto :goto_13

    .line 266
    :cond_16
    move-wide/from16 v0, p12

    .line 267
    .line 268
    :goto_13
    const v14, 0xb6db6db

    .line 269
    .line 270
    .line 271
    and-int/2addr v14, v3

    .line 272
    const v0, 0x2492492

    .line 273
    .line 274
    .line 275
    if-ne v14, v0, :cond_18

    .line 276
    .line 277
    invoke-interface {v2}, Landroidx/compose/runtime/Composer;->getSkipping()Z

    .line 278
    .line 279
    .line 280
    move-result v0

    .line 281
    if-nez v0, :cond_17

    .line 282
    .line 283
    goto :goto_14

    .line 284
    :cond_17
    invoke-interface {v2}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    .line 285
    .line 286
    .line 287
    move-object/from16 v6, p0

    .line 288
    .line 289
    move-wide/from16 v33, p10

    .line 290
    .line 291
    move-wide/from16 v35, p12

    .line 292
    .line 293
    move v3, v7

    .line 294
    move-object v4, v8

    .line 295
    move-wide/from16 v7, p4

    .line 296
    .line 297
    goto/16 :goto_1e

    .line 298
    .line 299
    :cond_18
    :goto_14
    invoke-interface {v2}, Landroidx/compose/runtime/Composer;->startDefaults()V

    .line 300
    .line 301
    .line 302
    and-int/lit8 v0, v15, 0x1

    .line 303
    .line 304
    const v1, -0x1c00001

    .line 305
    .line 306
    .line 307
    const v14, -0x380001

    .line 308
    .line 309
    .line 310
    const v21, -0x70001

    .line 311
    .line 312
    .line 313
    const v22, -0xe001

    .line 314
    .line 315
    .line 316
    if-eqz v0, :cond_20

    .line 317
    .line 318
    invoke-interface {v2}, Landroidx/compose/runtime/Composer;->getDefaultsInvalid()Z

    .line 319
    .line 320
    .line 321
    move-result v0

    .line 322
    if-eqz v0, :cond_19

    .line 323
    .line 324
    goto :goto_15

    .line 325
    :cond_19
    invoke-interface {v2}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    .line 326
    .line 327
    .line 328
    and-int/lit8 v0, v13, 0x8

    .line 329
    .line 330
    if-eqz v0, :cond_1a

    .line 331
    .line 332
    and-int/lit16 v3, v3, -0x1c01

    .line 333
    .line 334
    :cond_1a
    and-int/lit8 v0, v13, 0x10

    .line 335
    .line 336
    if-eqz v0, :cond_1b

    .line 337
    .line 338
    and-int v3, v3, v22

    .line 339
    .line 340
    :cond_1b
    and-int/lit8 v0, v13, 0x20

    .line 341
    .line 342
    if-eqz v0, :cond_1c

    .line 343
    .line 344
    and-int v3, v3, v21

    .line 345
    .line 346
    :cond_1c
    and-int/lit8 v0, v13, 0x40

    .line 347
    .line 348
    if-eqz v0, :cond_1d

    .line 349
    .line 350
    and-int/2addr v3, v14

    .line 351
    :cond_1d
    and-int/lit16 v0, v13, 0x80

    .line 352
    .line 353
    if-eqz v0, :cond_1e

    .line 354
    .line 355
    and-int/2addr v3, v1

    .line 356
    :cond_1e
    and-int/lit16 v0, v13, 0x100

    .line 357
    .line 358
    if-eqz v0, :cond_1f

    .line 359
    .line 360
    const v0, -0xe000001

    .line 361
    .line 362
    .line 363
    and-int/2addr v3, v0

    .line 364
    :cond_1f
    move-wide/from16 v33, p10

    .line 365
    .line 366
    move-wide/from16 v35, p12

    .line 367
    .line 368
    move-object v0, v5

    .line 369
    move v4, v7

    .line 370
    move-object v5, v8

    .line 371
    move-wide/from16 v7, p4

    .line 372
    .line 373
    goto/16 :goto_1b

    .line 374
    .line 375
    :cond_20
    :goto_15
    if-eqz v4, :cond_21

    .line 376
    .line 377
    sget-object v0, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    .line 378
    .line 379
    goto :goto_16

    .line 380
    :cond_21
    move-object v0, v5

    .line 381
    :goto_16
    if-eqz v6, :cond_22

    .line 382
    .line 383
    const/4 v4, 0x0

    .line 384
    goto :goto_17

    .line 385
    :cond_22
    move v4, v7

    .line 386
    :goto_17
    and-int/lit8 v5, v13, 0x8

    .line 387
    .line 388
    const/4 v6, 0x6

    .line 389
    if-eqz v5, :cond_23

    .line 390
    .line 391
    sget-object v5, Landroidx/compose/material3/SnackbarDefaults;->INSTANCE:Landroidx/compose/material3/SnackbarDefaults;

    .line 392
    .line 393
    invoke-virtual {v5, v2, v6}, Landroidx/compose/material3/SnackbarDefaults;->getShape(Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/graphics/Shape;

    .line 394
    .line 395
    .line 396
    move-result-object v5

    .line 397
    and-int/lit16 v3, v3, -0x1c01

    .line 398
    .line 399
    goto :goto_18

    .line 400
    :cond_23
    move-object v5, v8

    .line 401
    :goto_18
    and-int/lit8 v7, v13, 0x10

    .line 402
    .line 403
    if-eqz v7, :cond_24

    .line 404
    .line 405
    sget-object v7, Landroidx/compose/material3/SnackbarDefaults;->INSTANCE:Landroidx/compose/material3/SnackbarDefaults;

    .line 406
    .line 407
    invoke-virtual {v7, v2, v6}, Landroidx/compose/material3/SnackbarDefaults;->getColor(Landroidx/compose/runtime/Composer;I)J

    .line 408
    .line 409
    .line 410
    move-result-wide v7

    .line 411
    and-int v3, v3, v22

    .line 412
    .line 413
    goto :goto_19

    .line 414
    :cond_24
    move-wide/from16 v7, p4

    .line 415
    .line 416
    :goto_19
    and-int/lit8 v22, v13, 0x20

    .line 417
    .line 418
    if-eqz v22, :cond_25

    .line 419
    .line 420
    sget-object v9, Landroidx/compose/material3/SnackbarDefaults;->INSTANCE:Landroidx/compose/material3/SnackbarDefaults;

    .line 421
    .line 422
    invoke-virtual {v9, v2, v6}, Landroidx/compose/material3/SnackbarDefaults;->getContentColor(Landroidx/compose/runtime/Composer;I)J

    .line 423
    .line 424
    .line 425
    move-result-wide v9

    .line 426
    and-int v3, v3, v21

    .line 427
    .line 428
    :cond_25
    and-int/lit8 v21, v13, 0x40

    .line 429
    .line 430
    if-eqz v21, :cond_26

    .line 431
    .line 432
    sget-object v11, Landroidx/compose/material3/SnackbarDefaults;->INSTANCE:Landroidx/compose/material3/SnackbarDefaults;

    .line 433
    .line 434
    invoke-virtual {v11, v2, v6}, Landroidx/compose/material3/SnackbarDefaults;->getActionColor(Landroidx/compose/runtime/Composer;I)J

    .line 435
    .line 436
    .line 437
    move-result-wide v11

    .line 438
    and-int/2addr v3, v14

    .line 439
    :cond_26
    and-int/lit16 v14, v13, 0x80

    .line 440
    .line 441
    if-eqz v14, :cond_27

    .line 442
    .line 443
    sget-object v14, Landroidx/compose/material3/SnackbarDefaults;->INSTANCE:Landroidx/compose/material3/SnackbarDefaults;

    .line 444
    .line 445
    invoke-virtual {v14, v2, v6}, Landroidx/compose/material3/SnackbarDefaults;->getActionContentColor(Landroidx/compose/runtime/Composer;I)J

    .line 446
    .line 447
    .line 448
    move-result-wide v21

    .line 449
    and-int/2addr v1, v3

    .line 450
    move v3, v1

    .line 451
    goto :goto_1a

    .line 452
    :cond_27
    move-wide/from16 v21, p10

    .line 453
    .line 454
    :goto_1a
    and-int/lit16 v1, v13, 0x100

    .line 455
    .line 456
    if-eqz v1, :cond_28

    .line 457
    .line 458
    sget-object v1, Landroidx/compose/material3/SnackbarDefaults;->INSTANCE:Landroidx/compose/material3/SnackbarDefaults;

    .line 459
    .line 460
    invoke-virtual {v1, v2, v6}, Landroidx/compose/material3/SnackbarDefaults;->getDismissActionContentColor(Landroidx/compose/runtime/Composer;I)J

    .line 461
    .line 462
    .line 463
    move-result-wide v23

    .line 464
    const v1, -0xe000001

    .line 465
    .line 466
    .line 467
    and-int/2addr v3, v1

    .line 468
    move-wide/from16 v33, v21

    .line 469
    .line 470
    move-wide/from16 v35, v23

    .line 471
    .line 472
    goto :goto_1b

    .line 473
    :cond_28
    move-wide/from16 v35, p12

    .line 474
    .line 475
    move-wide/from16 v33, v21

    .line 476
    .line 477
    :goto_1b
    invoke-interface {v2}, Landroidx/compose/runtime/Composer;->endDefaults()V

    .line 478
    .line 479
    .line 480
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 481
    .line 482
    .line 483
    move-result v1

    .line 484
    if-eqz v1, :cond_29

    .line 485
    .line 486
    const/4 v1, -0x1

    .line 487
    const-string v6, "androidx.compose.material3.Snackbar (Snackbar.kt:194)"

    .line 488
    .line 489
    const v14, 0x105e641f

    .line 490
    .line 491
    .line 492
    invoke-static {v14, v3, v1, v6}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 493
    .line 494
    .line 495
    :cond_29
    invoke-interface/range {p0 .. p0}, Landroidx/compose/material3/SnackbarData;->getVisuals()Landroidx/compose/material3/SnackbarVisuals;

    .line 496
    .line 497
    .line 498
    move-result-object v1

    .line 499
    invoke-interface {v1}, Landroidx/compose/material3/SnackbarVisuals;->getActionLabel()Ljava/lang/String;

    .line 500
    .line 501
    .line 502
    move-result-object v1

    .line 503
    const/4 v6, 0x1

    .line 504
    if-eqz v1, :cond_2a

    .line 505
    .line 506
    new-instance v14, Landroidx/compose/material3/SnackbarKt$Snackbar$actionComposable$1;

    .line 507
    .line 508
    move-object/from16 p1, v14

    .line 509
    .line 510
    move-wide/from16 p2, v11

    .line 511
    .line 512
    move/from16 p4, v3

    .line 513
    .line 514
    move-object/from16 p5, p0

    .line 515
    .line 516
    move-object/from16 p6, v1

    .line 517
    .line 518
    invoke-direct/range {p1 .. p6}, Landroidx/compose/material3/SnackbarKt$Snackbar$actionComposable$1;-><init>(JILandroidx/compose/material3/SnackbarData;Ljava/lang/String;)V

    .line 519
    .line 520
    .line 521
    const v1, -0x5227657f

    .line 522
    .line 523
    .line 524
    invoke-static {v2, v1, v6, v14}, Landroidx/compose/runtime/internal/ComposableLambdaKt;->composableLambda(Landroidx/compose/runtime/Composer;IZLjava/lang/Object;)Landroidx/compose/runtime/internal/ComposableLambda;

    .line 525
    .line 526
    .line 527
    move-result-object v1

    .line 528
    goto :goto_1c

    .line 529
    :cond_2a
    const/4 v1, 0x0

    .line 530
    :goto_1c
    invoke-interface/range {p0 .. p0}, Landroidx/compose/material3/SnackbarData;->getVisuals()Landroidx/compose/material3/SnackbarVisuals;

    .line 531
    .line 532
    .line 533
    move-result-object v14

    .line 534
    invoke-interface {v14}, Landroidx/compose/material3/SnackbarVisuals;->getWithDismissAction()Z

    .line 535
    .line 536
    .line 537
    move-result v14

    .line 538
    if-eqz v14, :cond_2b

    .line 539
    .line 540
    new-instance v14, Landroidx/compose/material3/SnackbarKt$Snackbar$dismissActionComposable$1;

    .line 541
    .line 542
    move-object/from16 v6, p0

    .line 543
    .line 544
    invoke-direct {v14, v6, v3}, Landroidx/compose/material3/SnackbarKt$Snackbar$dismissActionComposable$1;-><init>(Landroidx/compose/material3/SnackbarData;I)V

    .line 545
    .line 546
    .line 547
    move-wide/from16 p2, v11

    .line 548
    .line 549
    const v11, -0x6c0a98b1

    .line 550
    .line 551
    .line 552
    const/4 v12, 0x1

    .line 553
    invoke-static {v2, v11, v12, v14}, Landroidx/compose/runtime/internal/ComposableLambdaKt;->composableLambda(Landroidx/compose/runtime/Composer;IZLjava/lang/Object;)Landroidx/compose/runtime/internal/ComposableLambda;

    .line 554
    .line 555
    .line 556
    move-result-object v11

    .line 557
    goto :goto_1d

    .line 558
    :cond_2b
    move-object/from16 v6, p0

    .line 559
    .line 560
    move-wide/from16 p2, v11

    .line 561
    .line 562
    const/4 v11, 0x0

    .line 563
    :goto_1d
    const/16 v12, 0xc

    .line 564
    .line 565
    int-to-float v12, v12

    .line 566
    invoke-static {v12}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 567
    .line 568
    .line 569
    move-result v12

    .line 570
    invoke-static {v0, v12}, Landroidx/compose/foundation/layout/PaddingKt;->padding-3ABfNKs(Landroidx/compose/ui/Modifier;F)Landroidx/compose/ui/Modifier;

    .line 571
    .line 572
    .line 573
    move-result-object v16

    .line 574
    new-instance v12, Landroidx/compose/material3/SnackbarKt$Snackbar$3;

    .line 575
    .line 576
    invoke-direct {v12, v6}, Landroidx/compose/material3/SnackbarKt$Snackbar$3;-><init>(Landroidx/compose/material3/SnackbarData;)V

    .line 577
    .line 578
    .line 579
    const v14, -0x4b7b9086

    .line 580
    .line 581
    .line 582
    move-object/from16 p4, v0

    .line 583
    .line 584
    const/4 v0, 0x1

    .line 585
    invoke-static {v2, v14, v0, v12}, Landroidx/compose/runtime/internal/ComposableLambdaKt;->composableLambda(Landroidx/compose/runtime/Composer;IZLjava/lang/Object;)Landroidx/compose/runtime/internal/ComposableLambda;

    .line 586
    .line 587
    .line 588
    move-result-object v29

    .line 589
    shl-int/lit8 v0, v3, 0x3

    .line 590
    .line 591
    and-int/lit16 v12, v0, 0x1c00

    .line 592
    .line 593
    const/high16 v14, 0x30000000

    .line 594
    .line 595
    or-int/2addr v12, v14

    .line 596
    const v14, 0xe000

    .line 597
    .line 598
    .line 599
    and-int/2addr v14, v0

    .line 600
    or-int/2addr v12, v14

    .line 601
    const/high16 v14, 0x70000

    .line 602
    .line 603
    and-int/2addr v14, v0

    .line 604
    or-int/2addr v12, v14

    .line 605
    const/high16 v14, 0x380000

    .line 606
    .line 607
    and-int/2addr v0, v14

    .line 608
    or-int/2addr v0, v12

    .line 609
    and-int v12, v3, v18

    .line 610
    .line 611
    or-int/2addr v0, v12

    .line 612
    and-int v3, v3, v20

    .line 613
    .line 614
    or-int v31, v0, v3

    .line 615
    .line 616
    const/16 v32, 0x0

    .line 617
    .line 618
    move-object/from16 v17, v1

    .line 619
    .line 620
    move-object/from16 v18, v11

    .line 621
    .line 622
    move/from16 v19, v4

    .line 623
    .line 624
    move-object/from16 v20, v5

    .line 625
    .line 626
    move-wide/from16 v21, v7

    .line 627
    .line 628
    move-wide/from16 v23, v9

    .line 629
    .line 630
    move-wide/from16 v25, v33

    .line 631
    .line 632
    move-wide/from16 v27, v35

    .line 633
    .line 634
    move-object/from16 v30, v2

    .line 635
    .line 636
    invoke-static/range {v16 .. v32}, Landroidx/compose/material3/SnackbarKt;->Snackbar-eQBnUkQ(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;ZLandroidx/compose/ui/graphics/Shape;JJJJLkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V

    .line 637
    .line 638
    .line 639
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 640
    .line 641
    .line 642
    move-result v0

    .line 643
    if-eqz v0, :cond_2c

    .line 644
    .line 645
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 646
    .line 647
    .line 648
    :cond_2c
    move-wide/from16 v11, p2

    .line 649
    .line 650
    move v3, v4

    .line 651
    move-object v4, v5

    .line 652
    move-object/from16 v5, p4

    .line 653
    .line 654
    :goto_1e
    invoke-interface {v2}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    .line 655
    .line 656
    .line 657
    move-result-object v14

    .line 658
    if-nez v14, :cond_2d

    .line 659
    .line 660
    goto :goto_1f

    .line 661
    :cond_2d
    new-instance v2, Landroidx/compose/material3/SnackbarKt$Snackbar$4;

    .line 662
    .line 663
    move-object v0, v2

    .line 664
    move-object/from16 v1, p0

    .line 665
    .line 666
    move-object v6, v2

    .line 667
    move-object v2, v5

    .line 668
    move-object/from16 v37, v6

    .line 669
    .line 670
    move-wide v5, v7

    .line 671
    move-wide v7, v9

    .line 672
    move-wide v9, v11

    .line 673
    move-wide/from16 v11, v33

    .line 674
    .line 675
    move-object/from16 v38, v14

    .line 676
    .line 677
    move-wide/from16 v13, v35

    .line 678
    .line 679
    move/from16 v15, p15

    .line 680
    .line 681
    move/from16 v16, p16

    .line 682
    .line 683
    invoke-direct/range {v0 .. v16}, Landroidx/compose/material3/SnackbarKt$Snackbar$4;-><init>(Landroidx/compose/material3/SnackbarData;Landroidx/compose/ui/Modifier;ZLandroidx/compose/ui/graphics/Shape;JJJJJII)V

    .line 684
    .line 685
    .line 686
    move-object/from16 v1, v37

    .line 687
    .line 688
    move-object/from16 v0, v38

    .line 689
    .line 690
    invoke-interface {v0, v1}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lkotlin/jvm/functions/Function2;)V

    .line 691
    .line 692
    .line 693
    :goto_1f
    return-void
.end method

.method public static final synthetic access$NewLineButtonSnackbar-kKq0p4A(Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/text/TextStyle;JJLandroidx/compose/runtime/Composer;I)V
    .locals 0

    .line 1
    invoke-static/range {p0 .. p9}, Landroidx/compose/material3/SnackbarKt;->NewLineButtonSnackbar-kKq0p4A(Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/text/TextStyle;JJLandroidx/compose/runtime/Composer;I)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static final synthetic access$OneRowSnackbar-kKq0p4A(Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/text/TextStyle;JJLandroidx/compose/runtime/Composer;I)V
    .locals 0

    .line 1
    invoke-static/range {p0 .. p9}, Landroidx/compose/material3/SnackbarKt;->OneRowSnackbar-kKq0p4A(Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/text/TextStyle;JJLandroidx/compose/runtime/Composer;I)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static final synthetic access$getContainerMaxWidth$p()F
    .locals 1

    .line 1
    sget v0, Landroidx/compose/material3/SnackbarKt;->ContainerMaxWidth:F

    .line 2
    .line 3
    return v0
.end method

.method public static final synthetic access$getHeightToFirstLine$p()F
    .locals 1

    .line 1
    sget v0, Landroidx/compose/material3/SnackbarKt;->HeightToFirstLine:F

    .line 2
    .line 3
    return v0
.end method

.method public static final synthetic access$getTextEndExtraSpacing$p()F
    .locals 1

    .line 1
    sget v0, Landroidx/compose/material3/SnackbarKt;->TextEndExtraSpacing:F

    .line 2
    .line 3
    return v0
.end method
