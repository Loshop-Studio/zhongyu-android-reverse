.class public final Landroidx/compose/material3/ListItemKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000^\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\t\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\u0004\u001a\u00ac\u0001\u0010\n\u001a\u00020\u000b2\u0011\u0010\u000c\u001a\r\u0012\u0004\u0012\u00020\u000b0\r\u00a2\u0006\u0002\u0008\u000e2\u0008\u0008\u0002\u0010\u000f\u001a\u00020\u00102\u0015\u0008\u0002\u0010\u0011\u001a\u000f\u0012\u0004\u0012\u00020\u000b\u0018\u00010\r\u00a2\u0006\u0002\u0008\u000e2\u0015\u0008\u0002\u0010\u0012\u001a\u000f\u0012\u0004\u0012\u00020\u000b\u0018\u00010\r\u00a2\u0006\u0002\u0008\u000e2\u0015\u0008\u0002\u0010\u0013\u001a\u000f\u0012\u0004\u0012\u00020\u000b\u0018\u00010\r\u00a2\u0006\u0002\u0008\u000e2\u0015\u0008\u0002\u0010\u0014\u001a\u000f\u0012\u0004\u0012\u00020\u000b\u0018\u00010\r\u00a2\u0006\u0002\u0008\u000e2\u0008\u0008\u0002\u0010\u0015\u001a\u00020\u00162\u0008\u0008\u0002\u0010\u0017\u001a\u00020\u00012\u0008\u0008\u0002\u0010\u0018\u001a\u00020\u0001H\u0007\u00f8\u0001\u0001\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008\u0019\u0010\u001a\u001a\u007f\u0010\n\u001a\u00020\u000b2\u0008\u0008\u0002\u0010\u000f\u001a\u00020\u00102\u0008\u0008\u0002\u0010\u001b\u001a\u00020\u001c2\u0008\u0008\u0002\u0010\u001d\u001a\u00020\u001e2\u0008\u0008\u0002\u0010\u001f\u001a\u00020\u001e2\u0008\u0008\u0002\u0010\u0017\u001a\u00020\u00012\u0008\u0008\u0002\u0010\u0018\u001a\u00020\u00012\u0006\u0010 \u001a\u00020\u00012\u0006\u0010!\u001a\u00020\"2\u001c\u0010#\u001a\u0018\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020\u000b0$\u00a2\u0006\u0002\u0008\u000e\u00a2\u0006\u0002\u0008&H\u0003\u00f8\u0001\u0001\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008\'\u0010(\u001a8\u0010)\u001a\u00020\u000b2\u0006\u0010*\u001a\u00020\u001e2\u0006\u0010+\u001a\u00020,2\u0011\u0010#\u001a\r\u0012\u0004\u0012\u00020\u000b0\r\u00a2\u0006\u0002\u0008\u000eH\u0003\u00f8\u0001\u0001\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008-\u0010.\u001aN\u0010\u0013\u001a\u0018\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020\u000b0$\u00a2\u0006\u0002\u0008\u000e\u00a2\u0006\u0002\u0008&2\u0011\u0010\u0013\u001a\r\u0012\u0004\u0012\u00020\u000b0\r\u00a2\u0006\u0002\u0008\u000e2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010/\u001a\u000200H\u0003\u00f8\u0001\u0001\u00f8\u0001\u0000\u00a2\u0006\u0004\u00081\u00102\u001aN\u0010\u0014\u001a\u0018\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020\u000b0$\u00a2\u0006\u0002\u0008\u000e\u00a2\u0006\u0002\u0008&2\u0011\u0010\u0014\u001a\r\u0012\u0004\u0012\u00020\u000b0\r\u00a2\u0006\u0002\u0008\u000e2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010/\u001a\u000200H\u0003\u00f8\u0001\u0001\u00f8\u0001\u0000\u00a2\u0006\u0004\u00083\u00102\"\u0013\u0010\u0000\u001a\u00020\u0001X\u0082\u0004\u00f8\u0001\u0000\u00a2\u0006\u0004\n\u0002\u0010\u0002\"\u0013\u0010\u0003\u001a\u00020\u0001X\u0082\u0004\u00f8\u0001\u0000\u00a2\u0006\u0004\n\u0002\u0010\u0002\"\u0013\u0010\u0004\u001a\u00020\u0001X\u0082\u0004\u00f8\u0001\u0000\u00a2\u0006\u0004\n\u0002\u0010\u0002\"\u0013\u0010\u0005\u001a\u00020\u0001X\u0082\u0004\u00f8\u0001\u0000\u00a2\u0006\u0004\n\u0002\u0010\u0002\"\u0013\u0010\u0006\u001a\u00020\u0001X\u0082\u0004\u00f8\u0001\u0000\u00a2\u0006\u0004\n\u0002\u0010\u0002\"\u0013\u0010\u0007\u001a\u00020\u0001X\u0082\u0004\u00f8\u0001\u0000\u00a2\u0006\u0004\n\u0002\u0010\u0002\"\u0013\u0010\u0008\u001a\u00020\u0001X\u0082\u0004\u00f8\u0001\u0000\u00a2\u0006\u0004\n\u0002\u0010\u0002\"\u0013\u0010\t\u001a\u00020\u0001X\u0082\u0004\u00f8\u0001\u0000\u00a2\u0006\u0004\n\u0002\u0010\u0002\u0082\u0002\u000b\n\u0002\u0008\u0019\n\u0005\u0008\u00a1\u001e0\u0001\u00a8\u00064"
    }
    d2 = {
        "ContentEndPadding",
        "Landroidx/compose/ui/unit/Dp;",
        "F",
        "LeadingContentEndPadding",
        "ListItemHorizontalPadding",
        "ListItemThreeLineVerticalPadding",
        "ListItemVerticalPadding",
        "ThreeLineListItemContainerHeight",
        "TrailingHorizontalPadding",
        "TwoLineListItemContainerHeight",
        "ListItem",
        "",
        "headlineText",
        "Lkotlin/Function0;",
        "Landroidx/compose/runtime/Composable;",
        "modifier",
        "Landroidx/compose/ui/Modifier;",
        "overlineText",
        "supportingText",
        "leadingContent",
        "trailingContent",
        "colors",
        "Landroidx/compose/material3/ListItemColors;",
        "tonalElevation",
        "shadowElevation",
        "ListItem-HXNGIdc",
        "(Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/material3/ListItemColors;FFLandroidx/compose/runtime/Composer;II)V",
        "shape",
        "Landroidx/compose/ui/graphics/Shape;",
        "containerColor",
        "Landroidx/compose/ui/graphics/Color;",
        "contentColor",
        "minHeight",
        "paddingValues",
        "Landroidx/compose/foundation/layout/PaddingValues;",
        "content",
        "Lkotlin/Function1;",
        "Landroidx/compose/foundation/layout/RowScope;",
        "Lkotlin/ExtensionFunctionType;",
        "ListItem-xOgov6c",
        "(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/graphics/Shape;JJFFFLandroidx/compose/foundation/layout/PaddingValues;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V",
        "ProvideTextStyleFromToken",
        "color",
        "textToken",
        "Landroidx/compose/material3/tokens/TypographyKeyTokens;",
        "ProvideTextStyleFromToken-3J-VO9M",
        "(JLandroidx/compose/material3/tokens/TypographyKeyTokens;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V",
        "topAlign",
        "",
        "leadingContent-iJQMabo",
        "(Lkotlin/jvm/functions/Function2;JZLandroidx/compose/runtime/Composer;I)Lkotlin/jvm/functions/Function3;",
        "trailingContent-iJQMabo",
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
.field private static final ContentEndPadding:F

.field private static final LeadingContentEndPadding:F

.field private static final ListItemHorizontalPadding:F

.field private static final ListItemThreeLineVerticalPadding:F

.field private static final ListItemVerticalPadding:F

.field private static final ThreeLineListItemContainerHeight:F

.field private static final TrailingHorizontalPadding:F

.field private static final TwoLineListItemContainerHeight:F


# direct methods
.method public static constructor <clinit>()V
    .locals 3

    .line 1
    const/16 v0, 0x48

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
    sput v0, Landroidx/compose/material3/ListItemKt;->TwoLineListItemContainerHeight:F

    .line 9
    .line 10
    const/16 v0, 0x58

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
    sput v0, Landroidx/compose/material3/ListItemKt;->ThreeLineListItemContainerHeight:F

    .line 18
    .line 19
    const/16 v0, 0x8

    .line 20
    .line 21
    int-to-float v0, v0

    .line 22
    invoke-static {v0}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 23
    .line 24
    .line 25
    move-result v1

    .line 26
    sput v1, Landroidx/compose/material3/ListItemKt;->ListItemVerticalPadding:F

    .line 27
    .line 28
    const/16 v1, 0x10

    .line 29
    .line 30
    int-to-float v1, v1

    .line 31
    invoke-static {v1}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 32
    .line 33
    .line 34
    move-result v2

    .line 35
    sput v2, Landroidx/compose/material3/ListItemKt;->ListItemThreeLineVerticalPadding:F

    .line 36
    .line 37
    invoke-static {v1}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 38
    .line 39
    .line 40
    move-result v2

    .line 41
    sput v2, Landroidx/compose/material3/ListItemKt;->ListItemHorizontalPadding:F

    .line 42
    .line 43
    invoke-static {v1}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 44
    .line 45
    .line 46
    move-result v1

    .line 47
    sput v1, Landroidx/compose/material3/ListItemKt;->LeadingContentEndPadding:F

    .line 48
    .line 49
    invoke-static {v0}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 50
    .line 51
    .line 52
    move-result v1

    .line 53
    sput v1, Landroidx/compose/material3/ListItemKt;->ContentEndPadding:F

    .line 54
    .line 55
    invoke-static {v0}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 56
    .line 57
    .line 58
    move-result v0

    .line 59
    sput v0, Landroidx/compose/material3/ListItemKt;->TrailingHorizontalPadding:F

    .line 60
    .line 61
    return-void
.end method

.method public static final ListItem-HXNGIdc(Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/material3/ListItemColors;FFLandroidx/compose/runtime/Composer;II)V
    .locals 36
    .annotation runtime Landroidx/compose/material3/ExperimentalMaterial3Api;
    .end annotation

    .annotation build Landroidx/compose/runtime/Composable;
    .end annotation

    .annotation build Landroidx/compose/runtime/ComposableInferredTarget;
        scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]"
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
            "Landroidx/compose/material3/ListItemColors;",
            "FF",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move/from16 v10, p10

    .line 4
    .line 5
    move/from16 v11, p11

    .line 6
    .line 7
    const-string v0, "headlineText"

    .line 8
    .line 9
    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    const v0, -0x62360673

    .line 13
    .line 14
    .line 15
    move-object/from16 v2, p9

    .line 16
    .line 17
    invoke-interface {v2, v0}, Landroidx/compose/runtime/Composer;->startRestartGroup(I)Landroidx/compose/runtime/Composer;

    .line 18
    .line 19
    .line 20
    move-result-object v2

    .line 21
    and-int/lit8 v3, v11, 0x1

    .line 22
    .line 23
    if-eqz v3, :cond_0

    .line 24
    .line 25
    or-int/lit8 v3, v10, 0x6

    .line 26
    .line 27
    goto :goto_1

    .line 28
    :cond_0
    and-int/lit8 v3, v10, 0xe

    .line 29
    .line 30
    if-nez v3, :cond_2

    .line 31
    .line 32
    invoke-interface {v2, v1}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

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
    move v3, v10

    .line 44
    :goto_1
    and-int/lit8 v4, v11, 0x2

    .line 45
    .line 46
    if-eqz v4, :cond_3

    .line 47
    .line 48
    or-int/lit8 v3, v3, 0x30

    .line 49
    .line 50
    goto :goto_3

    .line 51
    :cond_3
    and-int/lit8 v5, v10, 0x70

    .line 52
    .line 53
    if-nez v5, :cond_5

    .line 54
    .line 55
    move-object/from16 v5, p1

    .line 56
    .line 57
    invoke-interface {v2, v5}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 58
    .line 59
    .line 60
    move-result v6

    .line 61
    if-eqz v6, :cond_4

    .line 62
    .line 63
    const/16 v6, 0x20

    .line 64
    .line 65
    goto :goto_2

    .line 66
    :cond_4
    const/16 v6, 0x10

    .line 67
    .line 68
    :goto_2
    or-int/2addr v3, v6

    .line 69
    goto :goto_4

    .line 70
    :cond_5
    :goto_3
    move-object/from16 v5, p1

    .line 71
    .line 72
    :goto_4
    and-int/lit8 v6, v11, 0x4

    .line 73
    .line 74
    if-eqz v6, :cond_6

    .line 75
    .line 76
    or-int/lit16 v3, v3, 0x180

    .line 77
    .line 78
    goto :goto_6

    .line 79
    :cond_6
    and-int/lit16 v7, v10, 0x380

    .line 80
    .line 81
    if-nez v7, :cond_8

    .line 82
    .line 83
    move-object/from16 v7, p2

    .line 84
    .line 85
    invoke-interface {v2, v7}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 86
    .line 87
    .line 88
    move-result v8

    .line 89
    if-eqz v8, :cond_7

    .line 90
    .line 91
    const/16 v8, 0x100

    .line 92
    .line 93
    goto :goto_5

    .line 94
    :cond_7
    const/16 v8, 0x80

    .line 95
    .line 96
    :goto_5
    or-int/2addr v3, v8

    .line 97
    goto :goto_7

    .line 98
    :cond_8
    :goto_6
    move-object/from16 v7, p2

    .line 99
    .line 100
    :goto_7
    and-int/lit8 v8, v11, 0x8

    .line 101
    .line 102
    if-eqz v8, :cond_9

    .line 103
    .line 104
    or-int/lit16 v3, v3, 0xc00

    .line 105
    .line 106
    goto :goto_9

    .line 107
    :cond_9
    and-int/lit16 v9, v10, 0x1c00

    .line 108
    .line 109
    if-nez v9, :cond_b

    .line 110
    .line 111
    move-object/from16 v9, p3

    .line 112
    .line 113
    invoke-interface {v2, v9}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 114
    .line 115
    .line 116
    move-result v12

    .line 117
    if-eqz v12, :cond_a

    .line 118
    .line 119
    const/16 v12, 0x800

    .line 120
    .line 121
    goto :goto_8

    .line 122
    :cond_a
    const/16 v12, 0x400

    .line 123
    .line 124
    :goto_8
    or-int/2addr v3, v12

    .line 125
    goto :goto_a

    .line 126
    :cond_b
    :goto_9
    move-object/from16 v9, p3

    .line 127
    .line 128
    :goto_a
    and-int/lit8 v12, v11, 0x10

    .line 129
    .line 130
    const v34, 0xe000

    .line 131
    .line 132
    .line 133
    if-eqz v12, :cond_c

    .line 134
    .line 135
    or-int/lit16 v3, v3, 0x6000

    .line 136
    .line 137
    goto :goto_c

    .line 138
    :cond_c
    and-int v13, v10, v34

    .line 139
    .line 140
    if-nez v13, :cond_e

    .line 141
    .line 142
    move-object/from16 v13, p4

    .line 143
    .line 144
    invoke-interface {v2, v13}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 145
    .line 146
    .line 147
    move-result v14

    .line 148
    if-eqz v14, :cond_d

    .line 149
    .line 150
    const/16 v14, 0x4000

    .line 151
    .line 152
    goto :goto_b

    .line 153
    :cond_d
    const/16 v14, 0x2000

    .line 154
    .line 155
    :goto_b
    or-int/2addr v3, v14

    .line 156
    goto :goto_d

    .line 157
    :cond_e
    :goto_c
    move-object/from16 v13, p4

    .line 158
    .line 159
    :goto_d
    and-int/lit8 v14, v11, 0x20

    .line 160
    .line 161
    const/high16 v35, 0x70000

    .line 162
    .line 163
    if-eqz v14, :cond_f

    .line 164
    .line 165
    const/high16 v15, 0x30000

    .line 166
    .line 167
    or-int/2addr v3, v15

    .line 168
    goto :goto_f

    .line 169
    :cond_f
    and-int v15, v10, v35

    .line 170
    .line 171
    if-nez v15, :cond_11

    .line 172
    .line 173
    move-object/from16 v15, p5

    .line 174
    .line 175
    invoke-interface {v2, v15}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 176
    .line 177
    .line 178
    move-result v16

    .line 179
    if-eqz v16, :cond_10

    .line 180
    .line 181
    const/high16 v16, 0x20000

    .line 182
    .line 183
    goto :goto_e

    .line 184
    :cond_10
    const/high16 v16, 0x10000

    .line 185
    .line 186
    :goto_e
    or-int v3, v3, v16

    .line 187
    .line 188
    goto :goto_10

    .line 189
    :cond_11
    :goto_f
    move-object/from16 v15, p5

    .line 190
    .line 191
    :goto_10
    const/high16 v16, 0x380000

    .line 192
    .line 193
    and-int v16, v10, v16

    .line 194
    .line 195
    if-nez v16, :cond_13

    .line 196
    .line 197
    and-int/lit8 v16, v11, 0x40

    .line 198
    .line 199
    move-object/from16 v0, p6

    .line 200
    .line 201
    if-nez v16, :cond_12

    .line 202
    .line 203
    invoke-interface {v2, v0}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 204
    .line 205
    .line 206
    move-result v16

    .line 207
    if-eqz v16, :cond_12

    .line 208
    .line 209
    const/high16 v16, 0x100000

    .line 210
    .line 211
    goto :goto_11

    .line 212
    :cond_12
    const/high16 v16, 0x80000

    .line 213
    .line 214
    :goto_11
    or-int v3, v3, v16

    .line 215
    .line 216
    goto :goto_12

    .line 217
    :cond_13
    move-object/from16 v0, p6

    .line 218
    .line 219
    :goto_12
    and-int/lit16 v15, v11, 0x80

    .line 220
    .line 221
    if-eqz v15, :cond_14

    .line 222
    .line 223
    const/high16 v16, 0xc00000

    .line 224
    .line 225
    or-int v3, v3, v16

    .line 226
    .line 227
    goto :goto_14

    .line 228
    :cond_14
    const/high16 v16, 0x1c00000

    .line 229
    .line 230
    and-int v16, v10, v16

    .line 231
    .line 232
    if-nez v16, :cond_16

    .line 233
    .line 234
    move/from16 v16, v15

    .line 235
    .line 236
    move/from16 v15, p7

    .line 237
    .line 238
    invoke-interface {v2, v15}, Landroidx/compose/runtime/Composer;->changed(F)Z

    .line 239
    .line 240
    .line 241
    move-result v17

    .line 242
    if-eqz v17, :cond_15

    .line 243
    .line 244
    const/high16 v17, 0x800000

    .line 245
    .line 246
    goto :goto_13

    .line 247
    :cond_15
    const/high16 v17, 0x400000

    .line 248
    .line 249
    :goto_13
    or-int v3, v3, v17

    .line 250
    .line 251
    goto :goto_15

    .line 252
    :cond_16
    :goto_14
    move/from16 v16, v15

    .line 253
    .line 254
    move/from16 v15, p7

    .line 255
    .line 256
    :goto_15
    and-int/lit16 v15, v11, 0x100

    .line 257
    .line 258
    if-eqz v15, :cond_17

    .line 259
    .line 260
    const/high16 v17, 0x6000000

    .line 261
    .line 262
    or-int v3, v3, v17

    .line 263
    .line 264
    goto :goto_17

    .line 265
    :cond_17
    const/high16 v17, 0xe000000

    .line 266
    .line 267
    and-int v17, v10, v17

    .line 268
    .line 269
    if-nez v17, :cond_19

    .line 270
    .line 271
    move/from16 v17, v15

    .line 272
    .line 273
    move/from16 v15, p8

    .line 274
    .line 275
    invoke-interface {v2, v15}, Landroidx/compose/runtime/Composer;->changed(F)Z

    .line 276
    .line 277
    .line 278
    move-result v18

    .line 279
    if-eqz v18, :cond_18

    .line 280
    .line 281
    const/high16 v18, 0x4000000

    .line 282
    .line 283
    goto :goto_16

    .line 284
    :cond_18
    const/high16 v18, 0x2000000

    .line 285
    .line 286
    :goto_16
    or-int v3, v3, v18

    .line 287
    .line 288
    goto :goto_18

    .line 289
    :cond_19
    :goto_17
    move/from16 v17, v15

    .line 290
    .line 291
    move/from16 v15, p8

    .line 292
    .line 293
    :goto_18
    const v18, 0xb6db6db

    .line 294
    .line 295
    .line 296
    and-int v0, v3, v18

    .line 297
    .line 298
    const v1, 0x2492492

    .line 299
    .line 300
    .line 301
    if-ne v0, v1, :cond_1b

    .line 302
    .line 303
    invoke-interface {v2}, Landroidx/compose/runtime/Composer;->getSkipping()Z

    .line 304
    .line 305
    .line 306
    move-result v0

    .line 307
    if-nez v0, :cond_1a

    .line 308
    .line 309
    goto :goto_19

    .line 310
    :cond_1a
    invoke-interface {v2}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    .line 311
    .line 312
    .line 313
    move-object/from16 v6, p5

    .line 314
    .line 315
    move/from16 v8, p7

    .line 316
    .line 317
    move-object v3, v7

    .line 318
    move-object v4, v9

    .line 319
    move v9, v15

    .line 320
    move-object/from16 v7, p6

    .line 321
    .line 322
    goto/16 :goto_22

    .line 323
    .line 324
    :cond_1b
    :goto_19
    invoke-interface {v2}, Landroidx/compose/runtime/Composer;->startDefaults()V

    .line 325
    .line 326
    .line 327
    and-int/lit8 v0, v10, 0x1

    .line 328
    .line 329
    const v1, -0x380001

    .line 330
    .line 331
    .line 332
    if-eqz v0, :cond_1e

    .line 333
    .line 334
    invoke-interface {v2}, Landroidx/compose/runtime/Composer;->getDefaultsInvalid()Z

    .line 335
    .line 336
    .line 337
    move-result v0

    .line 338
    if-eqz v0, :cond_1c

    .line 339
    .line 340
    goto :goto_1a

    .line 341
    :cond_1c
    invoke-interface {v2}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    .line 342
    .line 343
    .line 344
    and-int/lit8 v0, v11, 0x40

    .line 345
    .line 346
    if-eqz v0, :cond_1d

    .line 347
    .line 348
    and-int/2addr v3, v1

    .line 349
    :cond_1d
    move-object/from16 v0, p5

    .line 350
    .line 351
    move-object/from16 v1, p6

    .line 352
    .line 353
    move v8, v3

    .line 354
    move-object v4, v13

    .line 355
    move v6, v15

    .line 356
    move/from16 v3, p7

    .line 357
    .line 358
    goto/16 :goto_20

    .line 359
    .line 360
    :cond_1e
    :goto_1a
    if-eqz v4, :cond_1f

    .line 361
    .line 362
    sget-object v0, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    .line 363
    .line 364
    move-object v5, v0

    .line 365
    :cond_1f
    const/4 v0, 0x0

    .line 366
    if-eqz v6, :cond_20

    .line 367
    .line 368
    move-object v7, v0

    .line 369
    :cond_20
    if-eqz v8, :cond_21

    .line 370
    .line 371
    move-object v9, v0

    .line 372
    :cond_21
    if-eqz v12, :cond_22

    .line 373
    .line 374
    move-object v4, v0

    .line 375
    goto :goto_1b

    .line 376
    :cond_22
    move-object v4, v13

    .line 377
    :goto_1b
    if-eqz v14, :cond_23

    .line 378
    .line 379
    goto :goto_1c

    .line 380
    :cond_23
    move-object/from16 v0, p5

    .line 381
    .line 382
    :goto_1c
    and-int/lit8 v6, v11, 0x40

    .line 383
    .line 384
    if-eqz v6, :cond_24

    .line 385
    .line 386
    sget-object v12, Landroidx/compose/material3/ListItemDefaults;->INSTANCE:Landroidx/compose/material3/ListItemDefaults;

    .line 387
    .line 388
    const-wide/16 v13, 0x0

    .line 389
    .line 390
    const-wide/16 v18, 0x0

    .line 391
    .line 392
    move/from16 v6, v16

    .line 393
    .line 394
    move/from16 v8, v17

    .line 395
    .line 396
    move-wide/from16 v15, v18

    .line 397
    .line 398
    const-wide/16 v17, 0x0

    .line 399
    .line 400
    const-wide/16 v19, 0x0

    .line 401
    .line 402
    const-wide/16 v21, 0x0

    .line 403
    .line 404
    const-wide/16 v23, 0x0

    .line 405
    .line 406
    const-wide/16 v25, 0x0

    .line 407
    .line 408
    const-wide/16 v27, 0x0

    .line 409
    .line 410
    const-wide/16 v29, 0x0

    .line 411
    .line 412
    const/high16 v32, 0x30000000

    .line 413
    .line 414
    const/16 v33, 0x1ff

    .line 415
    .line 416
    move-object/from16 v31, v2

    .line 417
    .line 418
    invoke-virtual/range {v12 .. v33}, Landroidx/compose/material3/ListItemDefaults;->colors-J08w3-E(JJJJJJJJJLandroidx/compose/runtime/Composer;II)Landroidx/compose/material3/ListItemColors;

    .line 419
    .line 420
    .line 421
    move-result-object v12

    .line 422
    and-int/2addr v3, v1

    .line 423
    goto :goto_1d

    .line 424
    :cond_24
    move/from16 v6, v16

    .line 425
    .line 426
    move/from16 v8, v17

    .line 427
    .line 428
    move-object/from16 v12, p6

    .line 429
    .line 430
    :goto_1d
    if-eqz v6, :cond_25

    .line 431
    .line 432
    sget-object v1, Landroidx/compose/material3/ListItemDefaults;->INSTANCE:Landroidx/compose/material3/ListItemDefaults;

    .line 433
    .line 434
    invoke-virtual {v1}, Landroidx/compose/material3/ListItemDefaults;->getElevation-D9Ej5fM()F

    .line 435
    .line 436
    .line 437
    move-result v1

    .line 438
    goto :goto_1e

    .line 439
    :cond_25
    move/from16 v1, p7

    .line 440
    .line 441
    :goto_1e
    if-eqz v8, :cond_26

    .line 442
    .line 443
    sget-object v6, Landroidx/compose/material3/ListItemDefaults;->INSTANCE:Landroidx/compose/material3/ListItemDefaults;

    .line 444
    .line 445
    invoke-virtual {v6}, Landroidx/compose/material3/ListItemDefaults;->getElevation-D9Ej5fM()F

    .line 446
    .line 447
    .line 448
    move-result v6

    .line 449
    goto :goto_1f

    .line 450
    :cond_26
    move/from16 v6, p8

    .line 451
    .line 452
    :goto_1f
    move v8, v3

    .line 453
    move v3, v1

    .line 454
    move-object v1, v12

    .line 455
    :goto_20
    invoke-interface {v2}, Landroidx/compose/runtime/Composer;->endDefaults()V

    .line 456
    .line 457
    .line 458
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 459
    .line 460
    .line 461
    move-result v12

    .line 462
    if-eqz v12, :cond_27

    .line 463
    .line 464
    const/4 v12, -0x1

    .line 465
    const-string v13, "androidx.compose.material3.ListItem (ListItem.kt:71)"

    .line 466
    .line 467
    const v14, -0x62360673

    .line 468
    .line 469
    .line 470
    invoke-static {v14, v8, v12, v13}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 471
    .line 472
    .line 473
    :cond_27
    const/4 v13, 0x1

    .line 474
    if-nez v7, :cond_28

    .line 475
    .line 476
    if-nez v9, :cond_28

    .line 477
    .line 478
    const v14, -0x51a5ec1

    .line 479
    .line 480
    .line 481
    invoke-interface {v2, v14}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 482
    .line 483
    .line 484
    shr-int/lit8 v15, v8, 0x12

    .line 485
    .line 486
    and-int/lit8 v15, v15, 0xe

    .line 487
    .line 488
    invoke-virtual {v1, v2, v15}, Landroidx/compose/material3/ListItemColors;->containerColor$material3_release(Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;

    .line 489
    .line 490
    .line 491
    move-result-object v15

    .line 492
    invoke-interface {v15}, Landroidx/compose/runtime/State;->getValue()Ljava/lang/Object;

    .line 493
    .line 494
    .line 495
    move-result-object v15

    .line 496
    check-cast v15, Landroidx/compose/ui/graphics/Color;

    .line 497
    .line 498
    invoke-virtual {v15}, Landroidx/compose/ui/graphics/Color;->unbox-impl()J

    .line 499
    .line 500
    .line 501
    move-result-wide v15

    .line 502
    shr-int/lit8 v17, v8, 0xf

    .line 503
    .line 504
    and-int/lit8 v17, v17, 0x70

    .line 505
    .line 506
    or-int/lit8 v14, v17, 0x6

    .line 507
    .line 508
    invoke-virtual {v1, v13, v2, v14}, Landroidx/compose/material3/ListItemColors;->headlineColor$material3_release(ZLandroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;

    .line 509
    .line 510
    .line 511
    move-result-object v14

    .line 512
    invoke-interface {v14}, Landroidx/compose/runtime/State;->getValue()Ljava/lang/Object;

    .line 513
    .line 514
    .line 515
    move-result-object v14

    .line 516
    check-cast v14, Landroidx/compose/ui/graphics/Color;

    .line 517
    .line 518
    invoke-virtual {v14}, Landroidx/compose/ui/graphics/Color;->unbox-impl()J

    .line 519
    .line 520
    .line 521
    move-result-wide v17

    .line 522
    sget-object v14, Landroidx/compose/material3/tokens/ListTokens;->INSTANCE:Landroidx/compose/material3/tokens/ListTokens;

    .line 523
    .line 524
    invoke-virtual {v14}, Landroidx/compose/material3/tokens/ListTokens;->getListItemContainerHeight-D9Ej5fM()F

    .line 525
    .line 526
    .line 527
    move-result v20

    .line 528
    sget v14, Landroidx/compose/material3/ListItemKt;->ListItemHorizontalPadding:F

    .line 529
    .line 530
    sget v12, Landroidx/compose/material3/ListItemKt;->ListItemVerticalPadding:F

    .line 531
    .line 532
    invoke-static {v14, v12}, Landroidx/compose/foundation/layout/PaddingKt;->PaddingValues-YgX7TsA(FF)Landroidx/compose/foundation/layout/PaddingValues;

    .line 533
    .line 534
    .line 535
    move-result-object v21

    .line 536
    new-instance v12, Landroidx/compose/material3/ListItemKt$ListItem$1;

    .line 537
    .line 538
    move-object/from16 p1, v12

    .line 539
    .line 540
    move-object/from16 p2, v4

    .line 541
    .line 542
    move-object/from16 p3, v1

    .line 543
    .line 544
    move/from16 p4, v8

    .line 545
    .line 546
    move-object/from16 p5, v0

    .line 547
    .line 548
    move-object/from16 p6, p0

    .line 549
    .line 550
    invoke-direct/range {p1 .. p6}, Landroidx/compose/material3/ListItemKt$ListItem$1;-><init>(Lkotlin/jvm/functions/Function2;Landroidx/compose/material3/ListItemColors;ILkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;)V

    .line 551
    .line 552
    .line 553
    const v14, 0x39a69676

    .line 554
    .line 555
    .line 556
    invoke-static {v2, v14, v13, v12}, Landroidx/compose/runtime/internal/ComposableLambdaKt;->composableLambda(Landroidx/compose/runtime/Composer;IZLjava/lang/Object;)Landroidx/compose/runtime/internal/ComposableLambda;

    .line 557
    .line 558
    .line 559
    move-result-object v22

    .line 560
    shr-int/lit8 v12, v8, 0x3

    .line 561
    .line 562
    and-int/lit8 v12, v12, 0xe

    .line 563
    .line 564
    const/high16 v13, 0x6d80000

    .line 565
    .line 566
    or-int/2addr v12, v13

    .line 567
    shr-int/lit8 v8, v8, 0x9

    .line 568
    .line 569
    and-int v13, v8, v34

    .line 570
    .line 571
    or-int/2addr v12, v13

    .line 572
    and-int v8, v8, v35

    .line 573
    .line 574
    or-int v24, v12, v8

    .line 575
    .line 576
    const/16 v25, 0x2

    .line 577
    .line 578
    move-object v12, v5

    .line 579
    const/4 v8, 0x0

    .line 580
    move-object v13, v8

    .line 581
    move-wide v14, v15

    .line 582
    move-wide/from16 v16, v17

    .line 583
    .line 584
    move/from16 v18, v3

    .line 585
    .line 586
    move/from16 v19, v6

    .line 587
    .line 588
    move-object/from16 v23, v2

    .line 589
    .line 590
    invoke-static/range {v12 .. v25}, Landroidx/compose/material3/ListItemKt;->ListItem-xOgov6c(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/graphics/Shape;JJFFFLandroidx/compose/foundation/layout/PaddingValues;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V

    .line 591
    .line 592
    .line 593
    invoke-interface {v2}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 594
    .line 595
    .line 596
    goto/16 :goto_21

    .line 597
    .line 598
    :cond_28
    if-nez v7, :cond_29

    .line 599
    .line 600
    const v12, -0x51a5912

    .line 601
    .line 602
    .line 603
    invoke-interface {v2, v12}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 604
    .line 605
    .line 606
    shr-int/lit8 v12, v8, 0x12

    .line 607
    .line 608
    and-int/lit8 v12, v12, 0xe

    .line 609
    .line 610
    invoke-virtual {v1, v2, v12}, Landroidx/compose/material3/ListItemColors;->containerColor$material3_release(Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;

    .line 611
    .line 612
    .line 613
    move-result-object v12

    .line 614
    invoke-interface {v12}, Landroidx/compose/runtime/State;->getValue()Ljava/lang/Object;

    .line 615
    .line 616
    .line 617
    move-result-object v12

    .line 618
    check-cast v12, Landroidx/compose/ui/graphics/Color;

    .line 619
    .line 620
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/Color;->unbox-impl()J

    .line 621
    .line 622
    .line 623
    move-result-wide v15

    .line 624
    shr-int/lit8 v12, v8, 0xf

    .line 625
    .line 626
    and-int/lit8 v12, v12, 0x70

    .line 627
    .line 628
    or-int/lit8 v12, v12, 0x6

    .line 629
    .line 630
    invoke-virtual {v1, v13, v2, v12}, Landroidx/compose/material3/ListItemColors;->headlineColor$material3_release(ZLandroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;

    .line 631
    .line 632
    .line 633
    move-result-object v12

    .line 634
    invoke-interface {v12}, Landroidx/compose/runtime/State;->getValue()Ljava/lang/Object;

    .line 635
    .line 636
    .line 637
    move-result-object v12

    .line 638
    check-cast v12, Landroidx/compose/ui/graphics/Color;

    .line 639
    .line 640
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/Color;->unbox-impl()J

    .line 641
    .line 642
    .line 643
    move-result-wide v17

    .line 644
    sget v20, Landroidx/compose/material3/ListItemKt;->TwoLineListItemContainerHeight:F

    .line 645
    .line 646
    sget v12, Landroidx/compose/material3/ListItemKt;->ListItemHorizontalPadding:F

    .line 647
    .line 648
    sget v14, Landroidx/compose/material3/ListItemKt;->ListItemVerticalPadding:F

    .line 649
    .line 650
    invoke-static {v12, v14}, Landroidx/compose/foundation/layout/PaddingKt;->PaddingValues-YgX7TsA(FF)Landroidx/compose/foundation/layout/PaddingValues;

    .line 651
    .line 652
    .line 653
    move-result-object v21

    .line 654
    new-instance v12, Landroidx/compose/material3/ListItemKt$ListItem$2;

    .line 655
    .line 656
    move-object/from16 p1, v12

    .line 657
    .line 658
    move-object/from16 p2, v4

    .line 659
    .line 660
    move-object/from16 p3, v1

    .line 661
    .line 662
    move/from16 p4, v8

    .line 663
    .line 664
    move-object/from16 p5, v0

    .line 665
    .line 666
    move-object/from16 p6, p0

    .line 667
    .line 668
    move-object/from16 p7, v9

    .line 669
    .line 670
    invoke-direct/range {p1 .. p7}, Landroidx/compose/material3/ListItemKt$ListItem$2;-><init>(Lkotlin/jvm/functions/Function2;Landroidx/compose/material3/ListItemColors;ILkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;)V

    .line 671
    .line 672
    .line 673
    const v14, 0x2dd7c9f

    .line 674
    .line 675
    .line 676
    invoke-static {v2, v14, v13, v12}, Landroidx/compose/runtime/internal/ComposableLambdaKt;->composableLambda(Landroidx/compose/runtime/Composer;IZLjava/lang/Object;)Landroidx/compose/runtime/internal/ComposableLambda;

    .line 677
    .line 678
    .line 679
    move-result-object v22

    .line 680
    shr-int/lit8 v12, v8, 0x3

    .line 681
    .line 682
    and-int/lit8 v12, v12, 0xe

    .line 683
    .line 684
    const/high16 v13, 0x6d80000

    .line 685
    .line 686
    or-int/2addr v12, v13

    .line 687
    shr-int/lit8 v8, v8, 0x9

    .line 688
    .line 689
    and-int v13, v8, v34

    .line 690
    .line 691
    or-int/2addr v12, v13

    .line 692
    and-int v8, v8, v35

    .line 693
    .line 694
    or-int v24, v12, v8

    .line 695
    .line 696
    const/16 v25, 0x2

    .line 697
    .line 698
    move-object v12, v5

    .line 699
    const/4 v8, 0x0

    .line 700
    move-object v13, v8

    .line 701
    move-wide v14, v15

    .line 702
    move-wide/from16 v16, v17

    .line 703
    .line 704
    move/from16 v18, v3

    .line 705
    .line 706
    move/from16 v19, v6

    .line 707
    .line 708
    move-object/from16 v23, v2

    .line 709
    .line 710
    invoke-static/range {v12 .. v25}, Landroidx/compose/material3/ListItemKt;->ListItem-xOgov6c(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/graphics/Shape;JJFFFLandroidx/compose/foundation/layout/PaddingValues;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V

    .line 711
    .line 712
    .line 713
    invoke-interface {v2}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 714
    .line 715
    .line 716
    goto/16 :goto_21

    .line 717
    .line 718
    :cond_29
    if-nez v9, :cond_2a

    .line 719
    .line 720
    const v12, -0x51a5241

    .line 721
    .line 722
    .line 723
    invoke-interface {v2, v12}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 724
    .line 725
    .line 726
    shr-int/lit8 v12, v8, 0x12

    .line 727
    .line 728
    and-int/lit8 v12, v12, 0xe

    .line 729
    .line 730
    invoke-virtual {v1, v2, v12}, Landroidx/compose/material3/ListItemColors;->containerColor$material3_release(Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;

    .line 731
    .line 732
    .line 733
    move-result-object v12

    .line 734
    invoke-interface {v12}, Landroidx/compose/runtime/State;->getValue()Ljava/lang/Object;

    .line 735
    .line 736
    .line 737
    move-result-object v12

    .line 738
    check-cast v12, Landroidx/compose/ui/graphics/Color;

    .line 739
    .line 740
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/Color;->unbox-impl()J

    .line 741
    .line 742
    .line 743
    move-result-wide v15

    .line 744
    shr-int/lit8 v12, v8, 0xf

    .line 745
    .line 746
    and-int/lit8 v12, v12, 0x70

    .line 747
    .line 748
    or-int/lit8 v12, v12, 0x6

    .line 749
    .line 750
    invoke-virtual {v1, v13, v2, v12}, Landroidx/compose/material3/ListItemColors;->headlineColor$material3_release(ZLandroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;

    .line 751
    .line 752
    .line 753
    move-result-object v12

    .line 754
    invoke-interface {v12}, Landroidx/compose/runtime/State;->getValue()Ljava/lang/Object;

    .line 755
    .line 756
    .line 757
    move-result-object v12

    .line 758
    check-cast v12, Landroidx/compose/ui/graphics/Color;

    .line 759
    .line 760
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/Color;->unbox-impl()J

    .line 761
    .line 762
    .line 763
    move-result-wide v17

    .line 764
    sget v20, Landroidx/compose/material3/ListItemKt;->TwoLineListItemContainerHeight:F

    .line 765
    .line 766
    sget v12, Landroidx/compose/material3/ListItemKt;->ListItemHorizontalPadding:F

    .line 767
    .line 768
    sget v14, Landroidx/compose/material3/ListItemKt;->ListItemVerticalPadding:F

    .line 769
    .line 770
    invoke-static {v12, v14}, Landroidx/compose/foundation/layout/PaddingKt;->PaddingValues-YgX7TsA(FF)Landroidx/compose/foundation/layout/PaddingValues;

    .line 771
    .line 772
    .line 773
    move-result-object v21

    .line 774
    new-instance v12, Landroidx/compose/material3/ListItemKt$ListItem$3;

    .line 775
    .line 776
    move-object/from16 p1, v12

    .line 777
    .line 778
    move-object/from16 p2, v4

    .line 779
    .line 780
    move-object/from16 p3, v1

    .line 781
    .line 782
    move/from16 p4, v8

    .line 783
    .line 784
    move-object/from16 p5, v0

    .line 785
    .line 786
    move-object/from16 p6, v7

    .line 787
    .line 788
    move-object/from16 p7, p0

    .line 789
    .line 790
    invoke-direct/range {p1 .. p7}, Landroidx/compose/material3/ListItemKt$ListItem$3;-><init>(Lkotlin/jvm/functions/Function2;Landroidx/compose/material3/ListItemColors;ILkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;)V

    .line 791
    .line 792
    .line 793
    const v14, 0x675a473e

    .line 794
    .line 795
    .line 796
    invoke-static {v2, v14, v13, v12}, Landroidx/compose/runtime/internal/ComposableLambdaKt;->composableLambda(Landroidx/compose/runtime/Composer;IZLjava/lang/Object;)Landroidx/compose/runtime/internal/ComposableLambda;

    .line 797
    .line 798
    .line 799
    move-result-object v22

    .line 800
    shr-int/lit8 v12, v8, 0x3

    .line 801
    .line 802
    and-int/lit8 v12, v12, 0xe

    .line 803
    .line 804
    const/high16 v13, 0x6d80000

    .line 805
    .line 806
    or-int/2addr v12, v13

    .line 807
    shr-int/lit8 v8, v8, 0x9

    .line 808
    .line 809
    and-int v13, v8, v34

    .line 810
    .line 811
    or-int/2addr v12, v13

    .line 812
    and-int v8, v8, v35

    .line 813
    .line 814
    or-int v24, v12, v8

    .line 815
    .line 816
    const/16 v25, 0x2

    .line 817
    .line 818
    move-object v12, v5

    .line 819
    const/4 v8, 0x0

    .line 820
    move-object v13, v8

    .line 821
    move-wide v14, v15

    .line 822
    move-wide/from16 v16, v17

    .line 823
    .line 824
    move/from16 v18, v3

    .line 825
    .line 826
    move/from16 v19, v6

    .line 827
    .line 828
    move-object/from16 v23, v2

    .line 829
    .line 830
    invoke-static/range {v12 .. v25}, Landroidx/compose/material3/ListItemKt;->ListItem-xOgov6c(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/graphics/Shape;JJFFFLandroidx/compose/foundation/layout/PaddingValues;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V

    .line 831
    .line 832
    .line 833
    invoke-interface {v2}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 834
    .line 835
    .line 836
    goto/16 :goto_21

    .line 837
    .line 838
    :cond_2a
    const v12, -0x51a4b98

    .line 839
    .line 840
    .line 841
    invoke-interface {v2, v12}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 842
    .line 843
    .line 844
    shr-int/lit8 v12, v8, 0x12

    .line 845
    .line 846
    and-int/lit8 v12, v12, 0xe

    .line 847
    .line 848
    invoke-virtual {v1, v2, v12}, Landroidx/compose/material3/ListItemColors;->containerColor$material3_release(Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;

    .line 849
    .line 850
    .line 851
    move-result-object v12

    .line 852
    invoke-interface {v12}, Landroidx/compose/runtime/State;->getValue()Ljava/lang/Object;

    .line 853
    .line 854
    .line 855
    move-result-object v12

    .line 856
    check-cast v12, Landroidx/compose/ui/graphics/Color;

    .line 857
    .line 858
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/Color;->unbox-impl()J

    .line 859
    .line 860
    .line 861
    move-result-wide v15

    .line 862
    shr-int/lit8 v12, v8, 0xf

    .line 863
    .line 864
    and-int/lit8 v12, v12, 0x70

    .line 865
    .line 866
    or-int/lit8 v12, v12, 0x6

    .line 867
    .line 868
    invoke-virtual {v1, v13, v2, v12}, Landroidx/compose/material3/ListItemColors;->headlineColor$material3_release(ZLandroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;

    .line 869
    .line 870
    .line 871
    move-result-object v12

    .line 872
    invoke-interface {v12}, Landroidx/compose/runtime/State;->getValue()Ljava/lang/Object;

    .line 873
    .line 874
    .line 875
    move-result-object v12

    .line 876
    check-cast v12, Landroidx/compose/ui/graphics/Color;

    .line 877
    .line 878
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/Color;->unbox-impl()J

    .line 879
    .line 880
    .line 881
    move-result-wide v17

    .line 882
    sget v20, Landroidx/compose/material3/ListItemKt;->ThreeLineListItemContainerHeight:F

    .line 883
    .line 884
    sget v12, Landroidx/compose/material3/ListItemKt;->ListItemHorizontalPadding:F

    .line 885
    .line 886
    sget v14, Landroidx/compose/material3/ListItemKt;->ListItemThreeLineVerticalPadding:F

    .line 887
    .line 888
    invoke-static {v12, v14}, Landroidx/compose/foundation/layout/PaddingKt;->PaddingValues-YgX7TsA(FF)Landroidx/compose/foundation/layout/PaddingValues;

    .line 889
    .line 890
    .line 891
    move-result-object v21

    .line 892
    new-instance v12, Landroidx/compose/material3/ListItemKt$ListItem$4;

    .line 893
    .line 894
    move-object/from16 p1, v12

    .line 895
    .line 896
    move-object/from16 p2, v4

    .line 897
    .line 898
    move-object/from16 p3, v1

    .line 899
    .line 900
    move/from16 p4, v8

    .line 901
    .line 902
    move-object/from16 p5, v0

    .line 903
    .line 904
    move-object/from16 p6, v7

    .line 905
    .line 906
    move-object/from16 p7, p0

    .line 907
    .line 908
    move-object/from16 p8, v9

    .line 909
    .line 910
    invoke-direct/range {p1 .. p8}, Landroidx/compose/material3/ListItemKt$ListItem$4;-><init>(Lkotlin/jvm/functions/Function2;Landroidx/compose/material3/ListItemColors;ILkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;)V

    .line 911
    .line 912
    .line 913
    const v14, -0x4ba68141

    .line 914
    .line 915
    .line 916
    invoke-static {v2, v14, v13, v12}, Landroidx/compose/runtime/internal/ComposableLambdaKt;->composableLambda(Landroidx/compose/runtime/Composer;IZLjava/lang/Object;)Landroidx/compose/runtime/internal/ComposableLambda;

    .line 917
    .line 918
    .line 919
    move-result-object v22

    .line 920
    shr-int/lit8 v12, v8, 0x3

    .line 921
    .line 922
    and-int/lit8 v12, v12, 0xe

    .line 923
    .line 924
    const/high16 v13, 0x6d80000

    .line 925
    .line 926
    or-int/2addr v12, v13

    .line 927
    shr-int/lit8 v8, v8, 0x9

    .line 928
    .line 929
    and-int v13, v8, v34

    .line 930
    .line 931
    or-int/2addr v12, v13

    .line 932
    and-int v8, v8, v35

    .line 933
    .line 934
    or-int v24, v12, v8

    .line 935
    .line 936
    const/16 v25, 0x2

    .line 937
    .line 938
    move-object v12, v5

    .line 939
    const/4 v8, 0x0

    .line 940
    move-object v13, v8

    .line 941
    move-wide v14, v15

    .line 942
    move-wide/from16 v16, v17

    .line 943
    .line 944
    move/from16 v18, v3

    .line 945
    .line 946
    move/from16 v19, v6

    .line 947
    .line 948
    move-object/from16 v23, v2

    .line 949
    .line 950
    invoke-static/range {v12 .. v25}, Landroidx/compose/material3/ListItemKt;->ListItem-xOgov6c(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/graphics/Shape;JJFFFLandroidx/compose/foundation/layout/PaddingValues;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V

    .line 951
    .line 952
    .line 953
    invoke-interface {v2}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 954
    .line 955
    .line 956
    :goto_21
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 957
    .line 958
    .line 959
    move-result v8

    .line 960
    if-eqz v8, :cond_2b

    .line 961
    .line 962
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 963
    .line 964
    .line 965
    :cond_2b
    move v8, v3

    .line 966
    move-object v13, v4

    .line 967
    move-object v3, v7

    .line 968
    move-object v4, v9

    .line 969
    move-object v7, v1

    .line 970
    move v9, v6

    .line 971
    move-object v6, v0

    .line 972
    :goto_22
    invoke-interface {v2}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    .line 973
    .line 974
    .line 975
    move-result-object v12

    .line 976
    if-nez v12, :cond_2c

    .line 977
    .line 978
    goto :goto_23

    .line 979
    :cond_2c
    new-instance v14, Landroidx/compose/material3/ListItemKt$ListItem$5;

    .line 980
    .line 981
    move-object v0, v14

    .line 982
    move-object/from16 v1, p0

    .line 983
    .line 984
    move-object v2, v5

    .line 985
    move-object v5, v13

    .line 986
    move/from16 v10, p10

    .line 987
    .line 988
    move/from16 v11, p11

    .line 989
    .line 990
    invoke-direct/range {v0 .. v11}, Landroidx/compose/material3/ListItemKt$ListItem$5;-><init>(Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/material3/ListItemColors;FFII)V

    .line 991
    .line 992
    .line 993
    invoke-interface {v12, v14}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lkotlin/jvm/functions/Function2;)V

    .line 994
    .line 995
    .line 996
    :goto_23
    return-void
.end method

.method private static final ListItem-xOgov6c(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/graphics/Shape;JJFFFLandroidx/compose/foundation/layout/PaddingValues;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V
    .locals 29
    .annotation runtime Landroidx/compose/material3/ExperimentalMaterial3Api;
    .end annotation

    .annotation build Landroidx/compose/runtime/Composable;
    .end annotation

    .annotation build Landroidx/compose/runtime/ComposableInferredTarget;
        scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/ui/Modifier;",
            "Landroidx/compose/ui/graphics/Shape;",
            "JJFFF",
            "Landroidx/compose/foundation/layout/PaddingValues;",
            "Lkotlin/jvm/functions/Function3<",
            "-",
            "Landroidx/compose/foundation/layout/RowScope;",
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
    move/from16 v9, p8

    .line 2
    .line 3
    move-object/from16 v10, p9

    .line 4
    .line 5
    move-object/from16 v11, p10

    .line 6
    .line 7
    move/from16 v12, p12

    .line 8
    .line 9
    move/from16 v13, p13

    .line 10
    .line 11
    const v0, 0x3fb81dcd

    .line 12
    .line 13
    .line 14
    move-object/from16 v1, p11

    .line 15
    .line 16
    invoke-interface {v1, v0}, Landroidx/compose/runtime/Composer;->startRestartGroup(I)Landroidx/compose/runtime/Composer;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    and-int/lit8 v2, v13, 0x1

    .line 21
    .line 22
    if-eqz v2, :cond_0

    .line 23
    .line 24
    or-int/lit8 v3, v12, 0x6

    .line 25
    .line 26
    move v4, v3

    .line 27
    move-object/from16 v3, p0

    .line 28
    .line 29
    goto :goto_1

    .line 30
    :cond_0
    and-int/lit8 v3, v12, 0xe

    .line 31
    .line 32
    if-nez v3, :cond_2

    .line 33
    .line 34
    move-object/from16 v3, p0

    .line 35
    .line 36
    invoke-interface {v1, v3}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 37
    .line 38
    .line 39
    move-result v4

    .line 40
    if-eqz v4, :cond_1

    .line 41
    .line 42
    const/4 v4, 0x4

    .line 43
    goto :goto_0

    .line 44
    :cond_1
    const/4 v4, 0x2

    .line 45
    :goto_0
    or-int/2addr v4, v12

    .line 46
    goto :goto_1

    .line 47
    :cond_2
    move-object/from16 v3, p0

    .line 48
    .line 49
    move v4, v12

    .line 50
    :goto_1
    and-int/lit8 v5, v12, 0x70

    .line 51
    .line 52
    if-nez v5, :cond_5

    .line 53
    .line 54
    and-int/lit8 v5, v13, 0x2

    .line 55
    .line 56
    if-nez v5, :cond_3

    .line 57
    .line 58
    move-object/from16 v5, p1

    .line 59
    .line 60
    invoke-interface {v1, v5}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 61
    .line 62
    .line 63
    move-result v6

    .line 64
    if-eqz v6, :cond_4

    .line 65
    .line 66
    const/16 v6, 0x20

    .line 67
    .line 68
    goto :goto_2

    .line 69
    :cond_3
    move-object/from16 v5, p1

    .line 70
    .line 71
    :cond_4
    const/16 v6, 0x10

    .line 72
    .line 73
    :goto_2
    or-int/2addr v4, v6

    .line 74
    goto :goto_3

    .line 75
    :cond_5
    move-object/from16 v5, p1

    .line 76
    .line 77
    :goto_3
    and-int/lit16 v6, v12, 0x380

    .line 78
    .line 79
    if-nez v6, :cond_8

    .line 80
    .line 81
    and-int/lit8 v6, v13, 0x4

    .line 82
    .line 83
    if-nez v6, :cond_6

    .line 84
    .line 85
    move-wide/from16 v6, p2

    .line 86
    .line 87
    invoke-interface {v1, v6, v7}, Landroidx/compose/runtime/Composer;->changed(J)Z

    .line 88
    .line 89
    .line 90
    move-result v8

    .line 91
    if-eqz v8, :cond_7

    .line 92
    .line 93
    const/16 v8, 0x100

    .line 94
    .line 95
    goto :goto_4

    .line 96
    :cond_6
    move-wide/from16 v6, p2

    .line 97
    .line 98
    :cond_7
    const/16 v8, 0x80

    .line 99
    .line 100
    :goto_4
    or-int/2addr v4, v8

    .line 101
    goto :goto_5

    .line 102
    :cond_8
    move-wide/from16 v6, p2

    .line 103
    .line 104
    :goto_5
    and-int/lit16 v8, v12, 0x1c00

    .line 105
    .line 106
    if-nez v8, :cond_a

    .line 107
    .line 108
    and-int/lit8 v8, v13, 0x8

    .line 109
    .line 110
    move-wide/from16 v14, p4

    .line 111
    .line 112
    if-nez v8, :cond_9

    .line 113
    .line 114
    invoke-interface {v1, v14, v15}, Landroidx/compose/runtime/Composer;->changed(J)Z

    .line 115
    .line 116
    .line 117
    move-result v8

    .line 118
    if-eqz v8, :cond_9

    .line 119
    .line 120
    const/16 v8, 0x800

    .line 121
    .line 122
    goto :goto_6

    .line 123
    :cond_9
    const/16 v8, 0x400

    .line 124
    .line 125
    :goto_6
    or-int/2addr v4, v8

    .line 126
    goto :goto_7

    .line 127
    :cond_a
    move-wide/from16 v14, p4

    .line 128
    .line 129
    :goto_7
    and-int/lit8 v8, v13, 0x10

    .line 130
    .line 131
    const v16, 0xe000

    .line 132
    .line 133
    .line 134
    if-eqz v8, :cond_b

    .line 135
    .line 136
    or-int/lit16 v4, v4, 0x6000

    .line 137
    .line 138
    move/from16 v0, p6

    .line 139
    .line 140
    goto :goto_9

    .line 141
    :cond_b
    and-int v17, v12, v16

    .line 142
    .line 143
    move/from16 v0, p6

    .line 144
    .line 145
    if-nez v17, :cond_d

    .line 146
    .line 147
    invoke-interface {v1, v0}, Landroidx/compose/runtime/Composer;->changed(F)Z

    .line 148
    .line 149
    .line 150
    move-result v18

    .line 151
    if-eqz v18, :cond_c

    .line 152
    .line 153
    const/16 v18, 0x4000

    .line 154
    .line 155
    goto :goto_8

    .line 156
    :cond_c
    const/16 v18, 0x2000

    .line 157
    .line 158
    :goto_8
    or-int v4, v4, v18

    .line 159
    .line 160
    :cond_d
    :goto_9
    and-int/lit8 v18, v13, 0x20

    .line 161
    .line 162
    const/high16 v19, 0x70000

    .line 163
    .line 164
    if-eqz v18, :cond_e

    .line 165
    .line 166
    const/high16 v20, 0x30000

    .line 167
    .line 168
    or-int v4, v4, v20

    .line 169
    .line 170
    move/from16 v0, p7

    .line 171
    .line 172
    goto :goto_b

    .line 173
    :cond_e
    and-int v20, v12, v19

    .line 174
    .line 175
    move/from16 v0, p7

    .line 176
    .line 177
    if-nez v20, :cond_10

    .line 178
    .line 179
    invoke-interface {v1, v0}, Landroidx/compose/runtime/Composer;->changed(F)Z

    .line 180
    .line 181
    .line 182
    move-result v20

    .line 183
    if-eqz v20, :cond_f

    .line 184
    .line 185
    const/high16 v20, 0x20000

    .line 186
    .line 187
    goto :goto_a

    .line 188
    :cond_f
    const/high16 v20, 0x10000

    .line 189
    .line 190
    :goto_a
    or-int v4, v4, v20

    .line 191
    .line 192
    :cond_10
    :goto_b
    and-int/lit8 v20, v13, 0x40

    .line 193
    .line 194
    if-eqz v20, :cond_11

    .line 195
    .line 196
    const/high16 v20, 0x180000

    .line 197
    .line 198
    :goto_c
    or-int v4, v4, v20

    .line 199
    .line 200
    goto :goto_d

    .line 201
    :cond_11
    const/high16 v20, 0x380000

    .line 202
    .line 203
    and-int v20, v12, v20

    .line 204
    .line 205
    if-nez v20, :cond_13

    .line 206
    .line 207
    invoke-interface {v1, v9}, Landroidx/compose/runtime/Composer;->changed(F)Z

    .line 208
    .line 209
    .line 210
    move-result v20

    .line 211
    if-eqz v20, :cond_12

    .line 212
    .line 213
    const/high16 v20, 0x100000

    .line 214
    .line 215
    goto :goto_c

    .line 216
    :cond_12
    const/high16 v20, 0x80000

    .line 217
    .line 218
    goto :goto_c

    .line 219
    :cond_13
    :goto_d
    and-int/lit16 v0, v13, 0x80

    .line 220
    .line 221
    const/high16 v20, 0xc00000

    .line 222
    .line 223
    if-eqz v0, :cond_14

    .line 224
    .line 225
    or-int v4, v4, v20

    .line 226
    .line 227
    goto :goto_f

    .line 228
    :cond_14
    const/high16 v0, 0x1c00000

    .line 229
    .line 230
    and-int/2addr v0, v12

    .line 231
    if-nez v0, :cond_16

    .line 232
    .line 233
    invoke-interface {v1, v10}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 234
    .line 235
    .line 236
    move-result v0

    .line 237
    if-eqz v0, :cond_15

    .line 238
    .line 239
    const/high16 v0, 0x800000

    .line 240
    .line 241
    goto :goto_e

    .line 242
    :cond_15
    const/high16 v0, 0x400000

    .line 243
    .line 244
    :goto_e
    or-int/2addr v4, v0

    .line 245
    :cond_16
    :goto_f
    and-int/lit16 v0, v13, 0x100

    .line 246
    .line 247
    if-eqz v0, :cond_17

    .line 248
    .line 249
    const/high16 v0, 0x6000000

    .line 250
    .line 251
    :goto_10
    or-int/2addr v4, v0

    .line 252
    goto :goto_11

    .line 253
    :cond_17
    const/high16 v0, 0xe000000

    .line 254
    .line 255
    and-int/2addr v0, v12

    .line 256
    if-nez v0, :cond_19

    .line 257
    .line 258
    invoke-interface {v1, v11}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 259
    .line 260
    .line 261
    move-result v0

    .line 262
    if-eqz v0, :cond_18

    .line 263
    .line 264
    const/high16 v0, 0x4000000

    .line 265
    .line 266
    goto :goto_10

    .line 267
    :cond_18
    const/high16 v0, 0x2000000

    .line 268
    .line 269
    goto :goto_10

    .line 270
    :cond_19
    :goto_11
    const v0, 0xb6db6db

    .line 271
    .line 272
    .line 273
    and-int/2addr v0, v4

    .line 274
    const v3, 0x2492492

    .line 275
    .line 276
    .line 277
    if-ne v0, v3, :cond_1b

    .line 278
    .line 279
    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->getSkipping()Z

    .line 280
    .line 281
    .line 282
    move-result v0

    .line 283
    if-nez v0, :cond_1a

    .line 284
    .line 285
    goto :goto_12

    .line 286
    :cond_1a
    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    .line 287
    .line 288
    .line 289
    move-object/from16 v2, p0

    .line 290
    .line 291
    move/from16 v8, p7

    .line 292
    .line 293
    move-wide v3, v6

    .line 294
    move/from16 v7, p6

    .line 295
    .line 296
    goto/16 :goto_1b

    .line 297
    .line 298
    :cond_1b
    :goto_12
    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->startDefaults()V

    .line 299
    .line 300
    .line 301
    and-int/lit8 v0, v12, 0x1

    .line 302
    .line 303
    if-eqz v0, :cond_20

    .line 304
    .line 305
    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->getDefaultsInvalid()Z

    .line 306
    .line 307
    .line 308
    move-result v0

    .line 309
    if-eqz v0, :cond_1c

    .line 310
    .line 311
    goto :goto_14

    .line 312
    :cond_1c
    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    .line 313
    .line 314
    .line 315
    and-int/lit8 v0, v13, 0x2

    .line 316
    .line 317
    if-eqz v0, :cond_1d

    .line 318
    .line 319
    and-int/lit8 v4, v4, -0x71

    .line 320
    .line 321
    :cond_1d
    and-int/lit8 v0, v13, 0x4

    .line 322
    .line 323
    if-eqz v0, :cond_1e

    .line 324
    .line 325
    and-int/lit16 v4, v4, -0x381

    .line 326
    .line 327
    :cond_1e
    and-int/lit8 v0, v13, 0x8

    .line 328
    .line 329
    if-eqz v0, :cond_1f

    .line 330
    .line 331
    and-int/lit16 v4, v4, -0x1c01

    .line 332
    .line 333
    :cond_1f
    move-object/from16 v0, p0

    .line 334
    .line 335
    move/from16 v8, p7

    .line 336
    .line 337
    move-object v2, v5

    .line 338
    move-wide v5, v6

    .line 339
    move/from16 v7, p6

    .line 340
    .line 341
    :goto_13
    move-wide/from16 v27, v14

    .line 342
    .line 343
    move v14, v4

    .line 344
    move-wide/from16 v3, v27

    .line 345
    .line 346
    goto :goto_1a

    .line 347
    :cond_20
    :goto_14
    if-eqz v2, :cond_21

    .line 348
    .line 349
    sget-object v0, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    .line 350
    .line 351
    goto :goto_15

    .line 352
    :cond_21
    move-object/from16 v0, p0

    .line 353
    .line 354
    :goto_15
    and-int/lit8 v2, v13, 0x2

    .line 355
    .line 356
    const/4 v3, 0x6

    .line 357
    if-eqz v2, :cond_22

    .line 358
    .line 359
    sget-object v2, Landroidx/compose/material3/ListItemDefaults;->INSTANCE:Landroidx/compose/material3/ListItemDefaults;

    .line 360
    .line 361
    invoke-virtual {v2, v1, v3}, Landroidx/compose/material3/ListItemDefaults;->getShape(Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/graphics/Shape;

    .line 362
    .line 363
    .line 364
    move-result-object v2

    .line 365
    and-int/lit8 v4, v4, -0x71

    .line 366
    .line 367
    goto :goto_16

    .line 368
    :cond_22
    move-object v2, v5

    .line 369
    :goto_16
    and-int/lit8 v5, v13, 0x4

    .line 370
    .line 371
    if-eqz v5, :cond_23

    .line 372
    .line 373
    sget-object v5, Landroidx/compose/material3/ListItemDefaults;->INSTANCE:Landroidx/compose/material3/ListItemDefaults;

    .line 374
    .line 375
    invoke-virtual {v5, v1, v3}, Landroidx/compose/material3/ListItemDefaults;->getContainerColor(Landroidx/compose/runtime/Composer;I)J

    .line 376
    .line 377
    .line 378
    move-result-wide v5

    .line 379
    and-int/lit16 v4, v4, -0x381

    .line 380
    .line 381
    goto :goto_17

    .line 382
    :cond_23
    move-wide v5, v6

    .line 383
    :goto_17
    and-int/lit8 v7, v13, 0x8

    .line 384
    .line 385
    if-eqz v7, :cond_24

    .line 386
    .line 387
    sget-object v7, Landroidx/compose/material3/ListItemDefaults;->INSTANCE:Landroidx/compose/material3/ListItemDefaults;

    .line 388
    .line 389
    invoke-virtual {v7, v1, v3}, Landroidx/compose/material3/ListItemDefaults;->getContentColor(Landroidx/compose/runtime/Composer;I)J

    .line 390
    .line 391
    .line 392
    move-result-wide v14

    .line 393
    and-int/lit16 v3, v4, -0x1c01

    .line 394
    .line 395
    move v4, v3

    .line 396
    :cond_24
    if-eqz v8, :cond_25

    .line 397
    .line 398
    sget-object v3, Landroidx/compose/material3/ListItemDefaults;->INSTANCE:Landroidx/compose/material3/ListItemDefaults;

    .line 399
    .line 400
    invoke-virtual {v3}, Landroidx/compose/material3/ListItemDefaults;->getElevation-D9Ej5fM()F

    .line 401
    .line 402
    .line 403
    move-result v3

    .line 404
    goto :goto_18

    .line 405
    :cond_25
    move/from16 v3, p6

    .line 406
    .line 407
    :goto_18
    if-eqz v18, :cond_26

    .line 408
    .line 409
    sget-object v7, Landroidx/compose/material3/ListItemDefaults;->INSTANCE:Landroidx/compose/material3/ListItemDefaults;

    .line 410
    .line 411
    invoke-virtual {v7}, Landroidx/compose/material3/ListItemDefaults;->getElevation-D9Ej5fM()F

    .line 412
    .line 413
    .line 414
    move-result v7

    .line 415
    move v8, v7

    .line 416
    goto :goto_19

    .line 417
    :cond_26
    move/from16 v8, p7

    .line 418
    .line 419
    :goto_19
    move v7, v3

    .line 420
    goto :goto_13

    .line 421
    :goto_1a
    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->endDefaults()V

    .line 422
    .line 423
    .line 424
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 425
    .line 426
    .line 427
    move-result v15

    .line 428
    if-eqz v15, :cond_27

    .line 429
    .line 430
    const/4 v15, -0x1

    .line 431
    const-string v12, "androidx.compose.material3.ListItem (ListItem.kt:280)"

    .line 432
    .line 433
    const v13, 0x3fb81dcd

    .line 434
    .line 435
    .line 436
    invoke-static {v13, v14, v15, v12}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 437
    .line 438
    .line 439
    :cond_27
    const/16 v22, 0x0

    .line 440
    .line 441
    new-instance v12, Landroidx/compose/material3/ListItemKt$ListItem$6;

    .line 442
    .line 443
    invoke-direct {v12, v9, v10, v11, v14}, Landroidx/compose/material3/ListItemKt$ListItem$6;-><init>(FLandroidx/compose/foundation/layout/PaddingValues;Lkotlin/jvm/functions/Function3;I)V

    .line 444
    .line 445
    .line 446
    const v13, 0x5312b568

    .line 447
    .line 448
    .line 449
    const/4 v15, 0x1

    .line 450
    invoke-static {v1, v13, v15, v12}, Landroidx/compose/runtime/internal/ComposableLambdaKt;->composableLambda(Landroidx/compose/runtime/Composer;IZLjava/lang/Object;)Landroidx/compose/runtime/internal/ComposableLambda;

    .line 451
    .line 452
    .line 453
    move-result-object v23

    .line 454
    and-int/lit8 v12, v14, 0xe

    .line 455
    .line 456
    or-int v12, v12, v20

    .line 457
    .line 458
    and-int/lit8 v13, v14, 0x70

    .line 459
    .line 460
    or-int/2addr v12, v13

    .line 461
    and-int/lit16 v13, v14, 0x380

    .line 462
    .line 463
    or-int/2addr v12, v13

    .line 464
    and-int/lit16 v13, v14, 0x1c00

    .line 465
    .line 466
    or-int/2addr v12, v13

    .line 467
    and-int v13, v14, v16

    .line 468
    .line 469
    or-int/2addr v12, v13

    .line 470
    and-int v13, v14, v19

    .line 471
    .line 472
    or-int v25, v12, v13

    .line 473
    .line 474
    const/16 v26, 0x40

    .line 475
    .line 476
    move-object v14, v0

    .line 477
    move-object v15, v2

    .line 478
    move-wide/from16 v16, v5

    .line 479
    .line 480
    move-wide/from16 v18, v3

    .line 481
    .line 482
    move/from16 v20, v7

    .line 483
    .line 484
    move/from16 v21, v8

    .line 485
    .line 486
    move-object/from16 v24, v1

    .line 487
    .line 488
    invoke-static/range {v14 .. v26}, Landroidx/compose/material3/SurfaceKt;->Surface-T9BRK9s(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/graphics/Shape;JJFFLandroidx/compose/foundation/BorderStroke;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V

    .line 489
    .line 490
    .line 491
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 492
    .line 493
    .line 494
    move-result v12

    .line 495
    if-eqz v12, :cond_28

    .line 496
    .line 497
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 498
    .line 499
    .line 500
    :cond_28
    move-wide v14, v3

    .line 501
    move-wide v3, v5

    .line 502
    move-object v5, v2

    .line 503
    move-object v2, v0

    .line 504
    :goto_1b
    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    .line 505
    .line 506
    .line 507
    move-result-object v13

    .line 508
    if-nez v13, :cond_29

    .line 509
    .line 510
    goto :goto_1c

    .line 511
    :cond_29
    new-instance v12, Landroidx/compose/material3/ListItemKt$ListItem$7;

    .line 512
    .line 513
    move-object v0, v12

    .line 514
    move-object v1, v2

    .line 515
    move-object v2, v5

    .line 516
    move-wide v5, v14

    .line 517
    move/from16 v9, p8

    .line 518
    .line 519
    move-object/from16 v10, p9

    .line 520
    .line 521
    move-object/from16 v11, p10

    .line 522
    .line 523
    move-object v14, v12

    .line 524
    move/from16 v12, p12

    .line 525
    .line 526
    move-object v15, v13

    .line 527
    move/from16 v13, p13

    .line 528
    .line 529
    invoke-direct/range {v0 .. v13}, Landroidx/compose/material3/ListItemKt$ListItem$7;-><init>(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/graphics/Shape;JJFFFLandroidx/compose/foundation/layout/PaddingValues;Lkotlin/jvm/functions/Function3;II)V

    .line 530
    .line 531
    .line 532
    invoke-interface {v15, v14}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lkotlin/jvm/functions/Function2;)V

    .line 533
    .line 534
    .line 535
    :goto_1c
    return-void
.end method

.method private static final ProvideTextStyleFromToken-3J-VO9M(JLandroidx/compose/material3/tokens/TypographyKeyTokens;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V
    .locals 7
    .annotation build Landroidx/compose/runtime/Composable;
    .end annotation

    .annotation build Landroidx/compose/runtime/ComposableInferredTarget;
        scheme = "[0[0]]"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(J",
            "Landroidx/compose/material3/tokens/TypographyKeyTokens;",
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
    const v0, 0x4396f9b3

    .line 2
    .line 3
    .line 4
    invoke-interface {p4, v0}, Landroidx/compose/runtime/Composer;->startRestartGroup(I)Landroidx/compose/runtime/Composer;

    .line 5
    .line 6
    .line 7
    move-result-object p4

    .line 8
    and-int/lit8 v1, p5, 0xe

    .line 9
    .line 10
    if-nez v1, :cond_1

    .line 11
    .line 12
    invoke-interface {p4, p0, p1}, Landroidx/compose/runtime/Composer;->changed(J)Z

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    if-eqz v1, :cond_0

    .line 17
    .line 18
    const/4 v1, 0x4

    .line 19
    goto :goto_0

    .line 20
    :cond_0
    const/4 v1, 0x2

    .line 21
    :goto_0
    or-int/2addr v1, p5

    .line 22
    goto :goto_1

    .line 23
    :cond_1
    move v1, p5

    .line 24
    :goto_1
    and-int/lit8 v2, p5, 0x70

    .line 25
    .line 26
    if-nez v2, :cond_3

    .line 27
    .line 28
    invoke-interface {p4, p2}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 29
    .line 30
    .line 31
    move-result v2

    .line 32
    if-eqz v2, :cond_2

    .line 33
    .line 34
    const/16 v2, 0x20

    .line 35
    .line 36
    goto :goto_2

    .line 37
    :cond_2
    const/16 v2, 0x10

    .line 38
    .line 39
    :goto_2
    or-int/2addr v1, v2

    .line 40
    :cond_3
    and-int/lit16 v2, p5, 0x380

    .line 41
    .line 42
    if-nez v2, :cond_5

    .line 43
    .line 44
    invoke-interface {p4, p3}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 45
    .line 46
    .line 47
    move-result v2

    .line 48
    if-eqz v2, :cond_4

    .line 49
    .line 50
    const/16 v2, 0x100

    .line 51
    .line 52
    goto :goto_3

    .line 53
    :cond_4
    const/16 v2, 0x80

    .line 54
    .line 55
    :goto_3
    or-int/2addr v1, v2

    .line 56
    :cond_5
    and-int/lit16 v2, v1, 0x2db

    .line 57
    .line 58
    const/16 v3, 0x92

    .line 59
    .line 60
    if-ne v2, v3, :cond_7

    .line 61
    .line 62
    invoke-interface {p4}, Landroidx/compose/runtime/Composer;->getSkipping()Z

    .line 63
    .line 64
    .line 65
    move-result v2

    .line 66
    if-nez v2, :cond_6

    .line 67
    .line 68
    goto :goto_4

    .line 69
    :cond_6
    invoke-interface {p4}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    .line 70
    .line 71
    .line 72
    goto :goto_5

    .line 73
    :cond_7
    :goto_4
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 74
    .line 75
    .line 76
    move-result v2

    .line 77
    if-eqz v2, :cond_8

    .line 78
    .line 79
    const/4 v2, -0x1

    .line 80
    const-string v3, "androidx.compose.material3.ProvideTextStyleFromToken (ListItem.kt:489)"

    .line 81
    .line 82
    invoke-static {v0, v1, v2, v3}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 83
    .line 84
    .line 85
    :cond_8
    sget-object v0, Landroidx/compose/material3/MaterialTheme;->INSTANCE:Landroidx/compose/material3/MaterialTheme;

    .line 86
    .line 87
    const/4 v2, 0x6

    .line 88
    invoke-virtual {v0, p4, v2}, Landroidx/compose/material3/MaterialTheme;->getTypography(Landroidx/compose/runtime/Composer;I)Landroidx/compose/material3/Typography;

    .line 89
    .line 90
    .line 91
    move-result-object v0

    .line 92
    invoke-static {v0, p2}, Landroidx/compose/material3/TypographyKt;->fromToken(Landroidx/compose/material3/Typography;Landroidx/compose/material3/tokens/TypographyKeyTokens;)Landroidx/compose/ui/text/TextStyle;

    .line 93
    .line 94
    .line 95
    move-result-object v0

    .line 96
    const/4 v2, 0x1

    .line 97
    new-array v3, v2, [Landroidx/compose/runtime/ProvidedValue;

    .line 98
    .line 99
    invoke-static {}, Landroidx/compose/material3/ContentColorKt;->getLocalContentColor()Landroidx/compose/runtime/ProvidableCompositionLocal;

    .line 100
    .line 101
    .line 102
    move-result-object v4

    .line 103
    invoke-static {p0, p1}, Landroidx/compose/ui/graphics/Color;->box-impl(J)Landroidx/compose/ui/graphics/Color;

    .line 104
    .line 105
    .line 106
    move-result-object v5

    .line 107
    invoke-virtual {v4, v5}, Landroidx/compose/runtime/ProvidableCompositionLocal;->provides(Ljava/lang/Object;)Landroidx/compose/runtime/ProvidedValue;

    .line 108
    .line 109
    .line 110
    move-result-object v4

    .line 111
    const/4 v5, 0x0

    .line 112
    aput-object v4, v3, v5

    .line 113
    .line 114
    new-instance v4, Landroidx/compose/material3/ListItemKt$ProvideTextStyleFromToken$1;

    .line 115
    .line 116
    invoke-direct {v4, v0, p3, v1}, Landroidx/compose/material3/ListItemKt$ProvideTextStyleFromToken$1;-><init>(Landroidx/compose/ui/text/TextStyle;Lkotlin/jvm/functions/Function2;I)V

    .line 117
    .line 118
    .line 119
    const v0, -0x1ea7c30d

    .line 120
    .line 121
    .line 122
    invoke-static {p4, v0, v2, v4}, Landroidx/compose/runtime/internal/ComposableLambdaKt;->composableLambda(Landroidx/compose/runtime/Composer;IZLjava/lang/Object;)Landroidx/compose/runtime/internal/ComposableLambda;

    .line 123
    .line 124
    .line 125
    move-result-object v0

    .line 126
    const/16 v1, 0x38

    .line 127
    .line 128
    invoke-static {v3, v0, p4, v1}, Landroidx/compose/runtime/CompositionLocalKt;->CompositionLocalProvider([Landroidx/compose/runtime/ProvidedValue;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V

    .line 129
    .line 130
    .line 131
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 132
    .line 133
    .line 134
    move-result v0

    .line 135
    if-eqz v0, :cond_9

    .line 136
    .line 137
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 138
    .line 139
    .line 140
    :cond_9
    :goto_5
    invoke-interface {p4}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    .line 141
    .line 142
    .line 143
    move-result-object p4

    .line 144
    if-nez p4, :cond_a

    .line 145
    .line 146
    goto :goto_6

    .line 147
    :cond_a
    new-instance v6, Landroidx/compose/material3/ListItemKt$ProvideTextStyleFromToken$2;

    .line 148
    .line 149
    move-object v0, v6

    .line 150
    move-wide v1, p0

    .line 151
    move-object v3, p2

    .line 152
    move-object v4, p3

    .line 153
    move v5, p5

    .line 154
    invoke-direct/range {v0 .. v5}, Landroidx/compose/material3/ListItemKt$ProvideTextStyleFromToken$2;-><init>(JLandroidx/compose/material3/tokens/TypographyKeyTokens;Lkotlin/jvm/functions/Function2;I)V

    .line 155
    .line 156
    .line 157
    invoke-interface {p4, v6}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lkotlin/jvm/functions/Function2;)V

    .line 158
    .line 159
    .line 160
    :goto_6
    return-void
.end method

.method public static final synthetic access$ListItem-xOgov6c(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/graphics/Shape;JJFFFLandroidx/compose/foundation/layout/PaddingValues;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V
    .locals 0

    .line 1
    invoke-static/range {p0 .. p13}, Landroidx/compose/material3/ListItemKt;->ListItem-xOgov6c(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/graphics/Shape;JJFFFLandroidx/compose/foundation/layout/PaddingValues;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static final synthetic access$ProvideTextStyleFromToken-3J-VO9M(JLandroidx/compose/material3/tokens/TypographyKeyTokens;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V
    .locals 0

    .line 1
    invoke-static/range {p0 .. p5}, Landroidx/compose/material3/ListItemKt;->ProvideTextStyleFromToken-3J-VO9M(JLandroidx/compose/material3/tokens/TypographyKeyTokens;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static final synthetic access$getContentEndPadding$p()F
    .locals 1

    .line 1
    sget v0, Landroidx/compose/material3/ListItemKt;->ContentEndPadding:F

    .line 2
    .line 3
    return v0
.end method

.method public static final synthetic access$getLeadingContentEndPadding$p()F
    .locals 1

    .line 1
    sget v0, Landroidx/compose/material3/ListItemKt;->LeadingContentEndPadding:F

    .line 2
    .line 3
    return v0
.end method

.method public static final synthetic access$getTrailingHorizontalPadding$p()F
    .locals 1

    .line 1
    sget v0, Landroidx/compose/material3/ListItemKt;->TrailingHorizontalPadding:F

    .line 2
    .line 3
    return v0
.end method

.method public static final synthetic access$leadingContent-iJQMabo(Lkotlin/jvm/functions/Function2;JZLandroidx/compose/runtime/Composer;I)Lkotlin/jvm/functions/Function3;
    .locals 0

    .line 1
    invoke-static/range {p0 .. p5}, Landroidx/compose/material3/ListItemKt;->leadingContent-iJQMabo(Lkotlin/jvm/functions/Function2;JZLandroidx/compose/runtime/Composer;I)Lkotlin/jvm/functions/Function3;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static final synthetic access$trailingContent-iJQMabo(Lkotlin/jvm/functions/Function2;JZLandroidx/compose/runtime/Composer;I)Lkotlin/jvm/functions/Function3;
    .locals 0

    .line 1
    invoke-static/range {p0 .. p5}, Landroidx/compose/material3/ListItemKt;->trailingContent-iJQMabo(Lkotlin/jvm/functions/Function2;JZLandroidx/compose/runtime/Composer;I)Lkotlin/jvm/functions/Function3;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method private static final leadingContent-iJQMabo(Lkotlin/jvm/functions/Function2;JZLandroidx/compose/runtime/Composer;I)Lkotlin/jvm/functions/Function3;
    .locals 9
    .annotation build Landroidx/compose/runtime/Composable;
    .end annotation

    .annotation build Landroidx/compose/runtime/ComposableInferredTarget;
        scheme = "[_[androidx.compose.ui.UiComposable]:[_]]"
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
            ">;JZ",
            "Landroidx/compose/runtime/Composer;",
            "I)",
            "Lkotlin/jvm/functions/Function3<",
            "Landroidx/compose/foundation/layout/RowScope;",
            "Landroidx/compose/runtime/Composer;",
            "Ljava/lang/Integer;",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation

    .line 1
    const v0, 0x1172ebbd

    .line 2
    .line 3
    .line 4
    invoke-interface {p4, v0}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 5
    .line 6
    .line 7
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    if-eqz v1, :cond_0

    .line 12
    .line 13
    const/4 v1, -0x1

    .line 14
    const-string v2, "androidx.compose.material3.leadingContent (ListItem.kt:309)"

    .line 15
    .line 16
    invoke-static {v0, p5, v1, v2}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 17
    .line 18
    .line 19
    :cond_0
    new-instance v0, Landroidx/compose/material3/ListItemKt$leadingContent$1;

    .line 20
    .line 21
    move-object v3, v0

    .line 22
    move-wide v4, p1

    .line 23
    move v6, p3

    .line 24
    move-object v7, p0

    .line 25
    move v8, p5

    .line 26
    invoke-direct/range {v3 .. v8}, Landroidx/compose/material3/ListItemKt$leadingContent$1;-><init>(JZLkotlin/jvm/functions/Function2;I)V

    .line 27
    .line 28
    .line 29
    const p0, -0x68a44e8e

    .line 30
    .line 31
    .line 32
    const/4 p1, 0x1

    .line 33
    invoke-static {p4, p0, p1, v0}, Landroidx/compose/runtime/internal/ComposableLambdaKt;->composableLambda(Landroidx/compose/runtime/Composer;IZLjava/lang/Object;)Landroidx/compose/runtime/internal/ComposableLambda;

    .line 34
    .line 35
    .line 36
    move-result-object p0

    .line 37
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 38
    .line 39
    .line 40
    move-result p1

    .line 41
    if-eqz p1, :cond_1

    .line 42
    .line 43
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 44
    .line 45
    .line 46
    :cond_1
    invoke-interface {p4}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 47
    .line 48
    .line 49
    return-object p0
.end method

.method private static final trailingContent-iJQMabo(Lkotlin/jvm/functions/Function2;JZLandroidx/compose/runtime/Composer;I)Lkotlin/jvm/functions/Function3;
    .locals 9
    .annotation build Landroidx/compose/runtime/Composable;
    .end annotation

    .annotation build Landroidx/compose/runtime/ComposableInferredTarget;
        scheme = "[_[androidx.compose.ui.UiComposable]:[_]]"
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
            ">;JZ",
            "Landroidx/compose/runtime/Composer;",
            "I)",
            "Lkotlin/jvm/functions/Function3<",
            "Landroidx/compose/foundation/layout/RowScope;",
            "Landroidx/compose/runtime/Composer;",
            "Ljava/lang/Integer;",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation

    .line 1
    const v0, 0x7b36080b

    .line 2
    .line 3
    .line 4
    invoke-interface {p4, v0}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 5
    .line 6
    .line 7
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    if-eqz v1, :cond_0

    .line 12
    .line 13
    const/4 v1, -0x1

    .line 14
    const-string v2, "androidx.compose.material3.trailingContent (ListItem.kt:334)"

    .line 15
    .line 16
    invoke-static {v0, p5, v1, v2}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 17
    .line 18
    .line 19
    :cond_0
    new-instance v0, Landroidx/compose/material3/ListItemKt$trailingContent$1;

    .line 20
    .line 21
    move-object v3, v0

    .line 22
    move v4, p3

    .line 23
    move-wide v5, p1

    .line 24
    move-object v7, p0

    .line 25
    move v8, p5

    .line 26
    invoke-direct/range {v3 .. v8}, Landroidx/compose/material3/ListItemKt$trailingContent$1;-><init>(ZJLkotlin/jvm/functions/Function2;I)V

    .line 27
    .line 28
    .line 29
    const p0, -0x4d9a070a

    .line 30
    .line 31
    .line 32
    const/4 p1, 0x1

    .line 33
    invoke-static {p4, p0, p1, v0}, Landroidx/compose/runtime/internal/ComposableLambdaKt;->composableLambda(Landroidx/compose/runtime/Composer;IZLjava/lang/Object;)Landroidx/compose/runtime/internal/ComposableLambda;

    .line 34
    .line 35
    .line 36
    move-result-object p0

    .line 37
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 38
    .line 39
    .line 40
    move-result p1

    .line 41
    if-eqz p1, :cond_1

    .line 42
    .line 43
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 44
    .line 45
    .line 46
    :cond_1
    invoke-interface {p4}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 47
    .line 48
    .line 49
    return-object p0
.end method
