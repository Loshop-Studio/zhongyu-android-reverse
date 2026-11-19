.class public final Landroidx/compose/material3/TabKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000p\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\u0008\n\u0002\u0008\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0008\u001a\u0083\u0001\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u000c\u0010\u0013\u001a\u0008\u0012\u0004\u0012\u00020\u00100\u00142\u0011\u0010\u0015\u001a\r\u0012\u0004\u0012\u00020\u00100\u0014\u00a2\u0006\u0002\u0008\u00162\u0011\u0010\u0017\u001a\r\u0012\u0004\u0012\u00020\u00100\u0014\u00a2\u0006\u0002\u0008\u00162\u0008\u0008\u0002\u0010\u0018\u001a\u00020\u00192\u0008\u0008\u0002\u0010\u001a\u001a\u00020\u00122\u0008\u0008\u0002\u0010\u001b\u001a\u00020\u001c2\u0008\u0008\u0002\u0010\u001d\u001a\u00020\u001c2\u0008\u0008\u0002\u0010\u001e\u001a\u00020\u001fH\u0007\u00f8\u0001\u0001\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008 \u0010!\u001a\u008b\u0001\u0010\"\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u000c\u0010\u0013\u001a\u0008\u0012\u0004\u0012\u00020\u00100\u00142\u0008\u0008\u0002\u0010\u0018\u001a\u00020\u00192\u0008\u0008\u0002\u0010\u001a\u001a\u00020\u00122\u0015\u0008\u0002\u0010\u0015\u001a\u000f\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u0014\u00a2\u0006\u0002\u0008\u00162\u0015\u0008\u0002\u0010\u0017\u001a\u000f\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u0014\u00a2\u0006\u0002\u0008\u00162\u0008\u0008\u0002\u0010\u001b\u001a\u00020\u001c2\u0008\u0008\u0002\u0010\u001d\u001a\u00020\u001c2\u0008\u0008\u0002\u0010\u001e\u001a\u00020\u001fH\u0007\u00f8\u0001\u0001\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008#\u0010$\u001a{\u0010\"\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u000c\u0010\u0013\u001a\u0008\u0012\u0004\u0012\u00020\u00100\u00142\u0008\u0008\u0002\u0010\u0018\u001a\u00020\u00192\u0008\u0008\u0002\u0010\u001a\u001a\u00020\u00122\u0008\u0008\u0002\u0010\u001b\u001a\u00020\u001c2\u0008\u0008\u0002\u0010\u001d\u001a\u00020\u001c2\u0008\u0008\u0002\u0010\u001e\u001a\u00020\u001f2\u001c\u0010%\u001a\u0018\u0012\u0004\u0012\u00020\'\u0012\u0004\u0012\u00020\u00100&\u00a2\u0006\u0002\u0008\u0016\u00a2\u0006\u0002\u0008(H\u0007\u00f8\u0001\u0001\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008)\u0010*\u001a7\u0010+\u001a\u00020\u00102\u0013\u0010\u0015\u001a\u000f\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u0014\u00a2\u0006\u0002\u0008\u00162\u0013\u0010\u0017\u001a\u000f\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u0014\u00a2\u0006\u0002\u0008\u0016H\u0003\u00a2\u0006\u0002\u0010,\u001a@\u0010-\u001a\u00020\u00102\u0006\u0010.\u001a\u00020\u001c2\u0006\u0010/\u001a\u00020\u001c2\u0006\u0010\u0011\u001a\u00020\u00122\u0011\u0010%\u001a\r\u0012\u0004\u0012\u00020\u00100\u0014\u00a2\u0006\u0002\u0008\u0016H\u0003\u00f8\u0001\u0001\u00f8\u0001\u0000\u00a2\u0006\u0004\u00080\u00101\u001aD\u00102\u001a\u00020\u0010*\u0002032\u0006\u00104\u001a\u0002052\u0006\u00106\u001a\u0002072\u0006\u00108\u001a\u0002072\u0006\u00109\u001a\u00020\u000b2\u0006\u0010:\u001a\u00020\u000b2\u0006\u0010;\u001a\u00020\u000b2\u0006\u0010<\u001a\u00020\u000bH\u0002\u001a\u001c\u0010=\u001a\u00020\u0010*\u0002032\u0006\u0010>\u001a\u0002072\u0006\u0010:\u001a\u00020\u000bH\u0002\"\u0013\u0010\u0000\u001a\u00020\u0001X\u0082\u0004\u00f8\u0001\u0000\u00a2\u0006\u0004\n\u0002\u0010\u0002\"\u0013\u0010\u0003\u001a\u00020\u0001X\u0082\u0004\u00f8\u0001\u0000\u00a2\u0006\u0004\n\u0002\u0010\u0002\"\u0013\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00f8\u0001\u0000\u00a2\u0006\u0004\n\u0002\u0010\u0006\"\u0013\u0010\u0007\u001a\u00020\u0001X\u0082\u0004\u00f8\u0001\u0000\u00a2\u0006\u0004\n\u0002\u0010\u0002\"\u0013\u0010\u0008\u001a\u00020\u0001X\u0082\u0004\u00f8\u0001\u0000\u00a2\u0006\u0004\n\u0002\u0010\u0002\"\u0013\u0010\t\u001a\u00020\u0001X\u0082\u0004\u00f8\u0001\u0000\u00a2\u0006\u0004\n\u0002\u0010\u0002\"\u000e\u0010\n\u001a\u00020\u000bX\u0082T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u000c\u001a\u00020\u000bX\u0082T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\r\u001a\u00020\u000bX\u0082T\u00a2\u0006\u0002\n\u0000\"\u0013\u0010\u000e\u001a\u00020\u0001X\u0082\u0004\u00f8\u0001\u0000\u00a2\u0006\u0004\n\u0002\u0010\u0002\u0082\u0002\u000b\n\u0002\u0008\u0019\n\u0005\u0008\u00a1\u001e0\u0001\u00a8\u0006?"
    }
    d2 = {
        "DoubleLineTextBaselineWithIcon",
        "Landroidx/compose/ui/unit/Dp;",
        "F",
        "HorizontalTextPadding",
        "IconDistanceFromBaseline",
        "Landroidx/compose/ui/unit/TextUnit;",
        "J",
        "LargeTabHeight",
        "SingleLineTextBaselineWithIcon",
        "SmallTabHeight",
        "TabFadeInAnimationDelay",
        "",
        "TabFadeInAnimationDuration",
        "TabFadeOutAnimationDuration",
        "TextDistanceFromLeadingIcon",
        "LeadingIconTab",
        "",
        "selected",
        "",
        "onClick",
        "Lkotlin/Function0;",
        "text",
        "Landroidx/compose/runtime/Composable;",
        "icon",
        "modifier",
        "Landroidx/compose/ui/Modifier;",
        "enabled",
        "selectedContentColor",
        "Landroidx/compose/ui/graphics/Color;",
        "unselectedContentColor",
        "interactionSource",
        "Landroidx/compose/foundation/interaction/MutableInteractionSource;",
        "LeadingIconTab-wqdebIU",
        "(ZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/Modifier;ZJJLandroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/runtime/Composer;II)V",
        "Tab",
        "Tab-wqdebIU",
        "(ZLkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;ZLkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;JJLandroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/runtime/Composer;II)V",
        "content",
        "Lkotlin/Function1;",
        "Landroidx/compose/foundation/layout/ColumnScope;",
        "Lkotlin/ExtensionFunctionType;",
        "Tab-bogVsAg",
        "(ZLkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;ZJJLandroidx/compose/foundation/interaction/MutableInteractionSource;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V",
        "TabBaselineLayout",
        "(Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V",
        "TabTransition",
        "activeColor",
        "inactiveColor",
        "TabTransition-Klgx-Pg",
        "(JJZLkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V",
        "placeTextAndIcon",
        "Landroidx/compose/ui/layout/Placeable$PlacementScope;",
        "density",
        "Landroidx/compose/ui/unit/Density;",
        "textPlaceable",
        "Landroidx/compose/ui/layout/Placeable;",
        "iconPlaceable",
        "tabWidth",
        "tabHeight",
        "firstBaseline",
        "lastBaseline",
        "placeTextOrIcon",
        "textOrIconPlaceable",
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
.field private static final DoubleLineTextBaselineWithIcon:F

.field private static final HorizontalTextPadding:F

.field private static final IconDistanceFromBaseline:J

.field private static final LargeTabHeight:F

.field private static final SingleLineTextBaselineWithIcon:F

.field private static final SmallTabHeight:F

.field private static final TabFadeInAnimationDelay:I = 0x64

.field private static final TabFadeInAnimationDuration:I = 0x96

.field private static final TabFadeOutAnimationDuration:I = 0x64

.field private static final TextDistanceFromLeadingIcon:F


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    .line 1
    sget-object v0, Landroidx/compose/material3/tokens/PrimaryNavigationTabTokens;->INSTANCE:Landroidx/compose/material3/tokens/PrimaryNavigationTabTokens;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroidx/compose/material3/tokens/PrimaryNavigationTabTokens;->getContainerHeight-D9Ej5fM()F

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    sput v0, Landroidx/compose/material3/TabKt;->SmallTabHeight:F

    .line 8
    .line 9
    const/16 v0, 0x48

    .line 10
    .line 11
    int-to-float v0, v0

    .line 12
    invoke-static {v0}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    sput v0, Landroidx/compose/material3/TabKt;->LargeTabHeight:F

    .line 17
    .line 18
    const/16 v0, 0x10

    .line 19
    .line 20
    int-to-float v0, v0

    .line 21
    invoke-static {v0}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    sput v0, Landroidx/compose/material3/TabKt;->HorizontalTextPadding:F

    .line 26
    .line 27
    const/16 v0, 0xe

    .line 28
    .line 29
    int-to-float v0, v0

    .line 30
    invoke-static {v0}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    sput v0, Landroidx/compose/material3/TabKt;->SingleLineTextBaselineWithIcon:F

    .line 35
    .line 36
    const/4 v0, 0x6

    .line 37
    int-to-float v0, v0

    .line 38
    invoke-static {v0}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 39
    .line 40
    .line 41
    move-result v0

    .line 42
    sput v0, Landroidx/compose/material3/TabKt;->DoubleLineTextBaselineWithIcon:F

    .line 43
    .line 44
    const/16 v0, 0x14

    .line 45
    .line 46
    invoke-static {v0}, Landroidx/compose/ui/unit/TextUnitKt;->getSp(I)J

    .line 47
    .line 48
    .line 49
    move-result-wide v0

    .line 50
    sput-wide v0, Landroidx/compose/material3/TabKt;->IconDistanceFromBaseline:J

    .line 51
    .line 52
    const/16 v0, 0x8

    .line 53
    .line 54
    int-to-float v0, v0

    .line 55
    invoke-static {v0}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 56
    .line 57
    .line 58
    move-result v0

    .line 59
    sput v0, Landroidx/compose/material3/TabKt;->TextDistanceFromLeadingIcon:F

    .line 60
    .line 61
    return-void
.end method

.method public static final LeadingIconTab-wqdebIU(ZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/Modifier;ZJJLandroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/runtime/Composer;II)V
    .locals 24
    .annotation build Landroidx/compose/runtime/Composable;
    .end annotation

    .annotation build Landroidx/compose/runtime/ComposableInferredTarget;
        scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z",
            "Lkotlin/jvm/functions/Function0<",
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
            "Landroidx/compose/ui/Modifier;",
            "ZJJ",
            "Landroidx/compose/foundation/interaction/MutableInteractionSource;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    .line 1
    move-object/from16 v10, p1

    .line 2
    .line 3
    move-object/from16 v11, p2

    .line 4
    .line 5
    move-object/from16 v12, p3

    .line 6
    .line 7
    move/from16 v13, p12

    .line 8
    .line 9
    move/from16 v14, p13

    .line 10
    .line 11
    const-string v0, "onClick"

    .line 12
    .line 13
    invoke-static {v10, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    const-string/jumbo v0, "text"

    .line 17
    .line 18
    .line 19
    invoke-static {v11, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    const-string v0, "icon"

    .line 23
    .line 24
    invoke-static {v12, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    const v0, -0x2e54e8c0

    .line 28
    .line 29
    .line 30
    move-object/from16 v1, p11

    .line 31
    .line 32
    invoke-interface {v1, v0}, Landroidx/compose/runtime/Composer;->startRestartGroup(I)Landroidx/compose/runtime/Composer;

    .line 33
    .line 34
    .line 35
    move-result-object v15

    .line 36
    and-int/lit8 v1, v14, 0x1

    .line 37
    .line 38
    if-eqz v1, :cond_0

    .line 39
    .line 40
    or-int/lit8 v1, v13, 0x6

    .line 41
    .line 42
    move/from16 v9, p0

    .line 43
    .line 44
    goto :goto_1

    .line 45
    :cond_0
    and-int/lit8 v1, v13, 0xe

    .line 46
    .line 47
    move/from16 v9, p0

    .line 48
    .line 49
    if-nez v1, :cond_2

    .line 50
    .line 51
    invoke-interface {v15, v9}, Landroidx/compose/runtime/Composer;->changed(Z)Z

    .line 52
    .line 53
    .line 54
    move-result v1

    .line 55
    if-eqz v1, :cond_1

    .line 56
    .line 57
    const/4 v1, 0x4

    .line 58
    goto :goto_0

    .line 59
    :cond_1
    const/4 v1, 0x2

    .line 60
    :goto_0
    or-int/2addr v1, v13

    .line 61
    goto :goto_1

    .line 62
    :cond_2
    move v1, v13

    .line 63
    :goto_1
    and-int/lit8 v2, v14, 0x2

    .line 64
    .line 65
    if-eqz v2, :cond_3

    .line 66
    .line 67
    or-int/lit8 v1, v1, 0x30

    .line 68
    .line 69
    goto :goto_3

    .line 70
    :cond_3
    and-int/lit8 v2, v13, 0x70

    .line 71
    .line 72
    if-nez v2, :cond_5

    .line 73
    .line 74
    invoke-interface {v15, v10}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 75
    .line 76
    .line 77
    move-result v2

    .line 78
    if-eqz v2, :cond_4

    .line 79
    .line 80
    const/16 v2, 0x20

    .line 81
    .line 82
    goto :goto_2

    .line 83
    :cond_4
    const/16 v2, 0x10

    .line 84
    .line 85
    :goto_2
    or-int/2addr v1, v2

    .line 86
    :cond_5
    :goto_3
    and-int/lit8 v2, v14, 0x4

    .line 87
    .line 88
    if-eqz v2, :cond_6

    .line 89
    .line 90
    or-int/lit16 v1, v1, 0x180

    .line 91
    .line 92
    goto :goto_5

    .line 93
    :cond_6
    and-int/lit16 v2, v13, 0x380

    .line 94
    .line 95
    if-nez v2, :cond_8

    .line 96
    .line 97
    invoke-interface {v15, v11}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 98
    .line 99
    .line 100
    move-result v2

    .line 101
    if-eqz v2, :cond_7

    .line 102
    .line 103
    const/16 v2, 0x100

    .line 104
    .line 105
    goto :goto_4

    .line 106
    :cond_7
    const/16 v2, 0x80

    .line 107
    .line 108
    :goto_4
    or-int/2addr v1, v2

    .line 109
    :cond_8
    :goto_5
    and-int/lit8 v2, v14, 0x8

    .line 110
    .line 111
    if-eqz v2, :cond_9

    .line 112
    .line 113
    or-int/lit16 v1, v1, 0xc00

    .line 114
    .line 115
    goto :goto_7

    .line 116
    :cond_9
    and-int/lit16 v2, v13, 0x1c00

    .line 117
    .line 118
    if-nez v2, :cond_b

    .line 119
    .line 120
    invoke-interface {v15, v12}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 121
    .line 122
    .line 123
    move-result v2

    .line 124
    if-eqz v2, :cond_a

    .line 125
    .line 126
    const/16 v2, 0x800

    .line 127
    .line 128
    goto :goto_6

    .line 129
    :cond_a
    const/16 v2, 0x400

    .line 130
    .line 131
    :goto_6
    or-int/2addr v1, v2

    .line 132
    :cond_b
    :goto_7
    and-int/lit8 v2, v14, 0x10

    .line 133
    .line 134
    if-eqz v2, :cond_c

    .line 135
    .line 136
    or-int/lit16 v1, v1, 0x6000

    .line 137
    .line 138
    goto :goto_9

    .line 139
    :cond_c
    const v3, 0xe000

    .line 140
    .line 141
    .line 142
    and-int/2addr v3, v13

    .line 143
    if-nez v3, :cond_e

    .line 144
    .line 145
    move-object/from16 v3, p4

    .line 146
    .line 147
    invoke-interface {v15, v3}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 148
    .line 149
    .line 150
    move-result v4

    .line 151
    if-eqz v4, :cond_d

    .line 152
    .line 153
    const/16 v4, 0x4000

    .line 154
    .line 155
    goto :goto_8

    .line 156
    :cond_d
    const/16 v4, 0x2000

    .line 157
    .line 158
    :goto_8
    or-int/2addr v1, v4

    .line 159
    goto :goto_a

    .line 160
    :cond_e
    :goto_9
    move-object/from16 v3, p4

    .line 161
    .line 162
    :goto_a
    and-int/lit8 v4, v14, 0x20

    .line 163
    .line 164
    if-eqz v4, :cond_f

    .line 165
    .line 166
    const/high16 v5, 0x30000

    .line 167
    .line 168
    or-int/2addr v1, v5

    .line 169
    goto :goto_c

    .line 170
    :cond_f
    const/high16 v5, 0x70000

    .line 171
    .line 172
    and-int/2addr v5, v13

    .line 173
    if-nez v5, :cond_11

    .line 174
    .line 175
    move/from16 v5, p5

    .line 176
    .line 177
    invoke-interface {v15, v5}, Landroidx/compose/runtime/Composer;->changed(Z)Z

    .line 178
    .line 179
    .line 180
    move-result v6

    .line 181
    if-eqz v6, :cond_10

    .line 182
    .line 183
    const/high16 v6, 0x20000

    .line 184
    .line 185
    goto :goto_b

    .line 186
    :cond_10
    const/high16 v6, 0x10000

    .line 187
    .line 188
    :goto_b
    or-int/2addr v1, v6

    .line 189
    goto :goto_d

    .line 190
    :cond_11
    :goto_c
    move/from16 v5, p5

    .line 191
    .line 192
    :goto_d
    const/high16 v6, 0x380000

    .line 193
    .line 194
    and-int/2addr v6, v13

    .line 195
    if-nez v6, :cond_14

    .line 196
    .line 197
    and-int/lit8 v6, v14, 0x40

    .line 198
    .line 199
    if-nez v6, :cond_12

    .line 200
    .line 201
    move-wide/from16 v6, p6

    .line 202
    .line 203
    invoke-interface {v15, v6, v7}, Landroidx/compose/runtime/Composer;->changed(J)Z

    .line 204
    .line 205
    .line 206
    move-result v8

    .line 207
    if-eqz v8, :cond_13

    .line 208
    .line 209
    const/high16 v8, 0x100000

    .line 210
    .line 211
    goto :goto_e

    .line 212
    :cond_12
    move-wide/from16 v6, p6

    .line 213
    .line 214
    :cond_13
    const/high16 v8, 0x80000

    .line 215
    .line 216
    :goto_e
    or-int/2addr v1, v8

    .line 217
    goto :goto_f

    .line 218
    :cond_14
    move-wide/from16 v6, p6

    .line 219
    .line 220
    :goto_f
    const/high16 v8, 0x1c00000

    .line 221
    .line 222
    and-int/2addr v8, v13

    .line 223
    if-nez v8, :cond_16

    .line 224
    .line 225
    and-int/lit16 v8, v14, 0x80

    .line 226
    .line 227
    move/from16 p11, v1

    .line 228
    .line 229
    move-wide/from16 v0, p8

    .line 230
    .line 231
    if-nez v8, :cond_15

    .line 232
    .line 233
    invoke-interface {v15, v0, v1}, Landroidx/compose/runtime/Composer;->changed(J)Z

    .line 234
    .line 235
    .line 236
    move-result v16

    .line 237
    if-eqz v16, :cond_15

    .line 238
    .line 239
    const/high16 v16, 0x800000

    .line 240
    .line 241
    goto :goto_10

    .line 242
    :cond_15
    const/high16 v16, 0x400000

    .line 243
    .line 244
    :goto_10
    or-int v16, p11, v16

    .line 245
    .line 246
    goto :goto_11

    .line 247
    :cond_16
    move/from16 p11, v1

    .line 248
    .line 249
    move-wide/from16 v0, p8

    .line 250
    .line 251
    move/from16 v16, p11

    .line 252
    .line 253
    :goto_11
    and-int/lit16 v8, v14, 0x100

    .line 254
    .line 255
    if-eqz v8, :cond_17

    .line 256
    .line 257
    const/high16 v17, 0x6000000

    .line 258
    .line 259
    or-int v16, v16, v17

    .line 260
    .line 261
    move-object/from16 v0, p10

    .line 262
    .line 263
    goto :goto_13

    .line 264
    :cond_17
    const/high16 v17, 0xe000000

    .line 265
    .line 266
    and-int v17, v13, v17

    .line 267
    .line 268
    move-object/from16 v0, p10

    .line 269
    .line 270
    if-nez v17, :cond_19

    .line 271
    .line 272
    invoke-interface {v15, v0}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 273
    .line 274
    .line 275
    move-result v1

    .line 276
    if-eqz v1, :cond_18

    .line 277
    .line 278
    const/high16 v1, 0x4000000

    .line 279
    .line 280
    goto :goto_12

    .line 281
    :cond_18
    const/high16 v1, 0x2000000

    .line 282
    .line 283
    :goto_12
    or-int v16, v16, v1

    .line 284
    .line 285
    :cond_19
    :goto_13
    const v1, 0xb6db6db

    .line 286
    .line 287
    .line 288
    and-int v1, v16, v1

    .line 289
    .line 290
    const v0, 0x2492492

    .line 291
    .line 292
    .line 293
    if-ne v1, v0, :cond_1b

    .line 294
    .line 295
    invoke-interface {v15}, Landroidx/compose/runtime/Composer;->getSkipping()Z

    .line 296
    .line 297
    .line 298
    move-result v0

    .line 299
    if-nez v0, :cond_1a

    .line 300
    .line 301
    goto :goto_14

    .line 302
    :cond_1a
    invoke-interface {v15}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    .line 303
    .line 304
    .line 305
    move-wide/from16 v9, p8

    .line 306
    .line 307
    move-object/from16 v11, p10

    .line 308
    .line 309
    move-wide v7, v6

    .line 310
    move v6, v5

    .line 311
    move-object v5, v3

    .line 312
    goto/16 :goto_19

    .line 313
    .line 314
    :cond_1b
    :goto_14
    invoke-interface {v15}, Landroidx/compose/runtime/Composer;->startDefaults()V

    .line 315
    .line 316
    .line 317
    and-int/lit8 v0, v13, 0x1

    .line 318
    .line 319
    const v17, -0x380001

    .line 320
    .line 321
    .line 322
    const/4 v1, 0x1

    .line 323
    if-eqz v0, :cond_1f

    .line 324
    .line 325
    invoke-interface {v15}, Landroidx/compose/runtime/Composer;->getDefaultsInvalid()Z

    .line 326
    .line 327
    .line 328
    move-result v0

    .line 329
    if-eqz v0, :cond_1c

    .line 330
    .line 331
    goto :goto_15

    .line 332
    :cond_1c
    invoke-interface {v15}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    .line 333
    .line 334
    .line 335
    and-int/lit8 v0, v14, 0x40

    .line 336
    .line 337
    if-eqz v0, :cond_1d

    .line 338
    .line 339
    and-int v16, v16, v17

    .line 340
    .line 341
    :cond_1d
    and-int/lit16 v0, v14, 0x80

    .line 342
    .line 343
    if-eqz v0, :cond_1e

    .line 344
    .line 345
    const v0, -0x1c00001

    .line 346
    .line 347
    .line 348
    and-int v16, v16, v0

    .line 349
    .line 350
    :cond_1e
    move-wide/from16 v20, p8

    .line 351
    .line 352
    move-object/from16 v22, p10

    .line 353
    .line 354
    move/from16 v17, v5

    .line 355
    .line 356
    move-wide/from16 v18, v6

    .line 357
    .line 358
    move/from16 v8, v16

    .line 359
    .line 360
    move-object/from16 v16, v3

    .line 361
    .line 362
    goto :goto_18

    .line 363
    :cond_1f
    :goto_15
    if-eqz v2, :cond_20

    .line 364
    .line 365
    sget-object v0, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    .line 366
    .line 367
    move-object v3, v0

    .line 368
    :cond_20
    if-eqz v4, :cond_21

    .line 369
    .line 370
    move v5, v1

    .line 371
    :cond_21
    and-int/lit8 v0, v14, 0x40

    .line 372
    .line 373
    if-eqz v0, :cond_22

    .line 374
    .line 375
    invoke-static {}, Landroidx/compose/material3/ContentColorKt;->getLocalContentColor()Landroidx/compose/runtime/ProvidableCompositionLocal;

    .line 376
    .line 377
    .line 378
    move-result-object v0

    .line 379
    invoke-interface {v15, v0}, Landroidx/compose/runtime/Composer;->consume(Landroidx/compose/runtime/CompositionLocal;)Ljava/lang/Object;

    .line 380
    .line 381
    .line 382
    move-result-object v0

    .line 383
    check-cast v0, Landroidx/compose/ui/graphics/Color;

    .line 384
    .line 385
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color;->unbox-impl()J

    .line 386
    .line 387
    .line 388
    move-result-wide v6

    .line 389
    and-int v16, v16, v17

    .line 390
    .line 391
    :cond_22
    and-int/lit16 v0, v14, 0x80

    .line 392
    .line 393
    if-eqz v0, :cond_23

    .line 394
    .line 395
    const v0, -0x1c00001

    .line 396
    .line 397
    .line 398
    and-int v0, v16, v0

    .line 399
    .line 400
    move-wide/from16 v16, v6

    .line 401
    .line 402
    goto :goto_16

    .line 403
    :cond_23
    move/from16 v0, v16

    .line 404
    .line 405
    move-wide/from16 v16, p8

    .line 406
    .line 407
    :goto_16
    if-eqz v8, :cond_25

    .line 408
    .line 409
    const v2, -0x1d58f75c

    .line 410
    .line 411
    .line 412
    invoke-interface {v15, v2}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 413
    .line 414
    .line 415
    invoke-interface {v15}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 416
    .line 417
    .line 418
    move-result-object v2

    .line 419
    sget-object v4, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    .line 420
    .line 421
    invoke-virtual {v4}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    .line 422
    .line 423
    .line 424
    move-result-object v4

    .line 425
    if-ne v2, v4, :cond_24

    .line 426
    .line 427
    invoke-static {}, Landroidx/compose/foundation/interaction/InteractionSourceKt;->MutableInteractionSource()Landroidx/compose/foundation/interaction/MutableInteractionSource;

    .line 428
    .line 429
    .line 430
    move-result-object v2

    .line 431
    invoke-interface {v15, v2}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 432
    .line 433
    .line 434
    :cond_24
    invoke-interface {v15}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 435
    .line 436
    .line 437
    check-cast v2, Landroidx/compose/foundation/interaction/MutableInteractionSource;

    .line 438
    .line 439
    move v8, v0

    .line 440
    move-object/from16 v22, v2

    .line 441
    .line 442
    goto :goto_17

    .line 443
    :cond_25
    move-object/from16 v22, p10

    .line 444
    .line 445
    move v8, v0

    .line 446
    :goto_17
    move-wide/from16 v18, v6

    .line 447
    .line 448
    move-wide/from16 v20, v16

    .line 449
    .line 450
    move-object/from16 v16, v3

    .line 451
    .line 452
    move/from16 v17, v5

    .line 453
    .line 454
    :goto_18
    invoke-interface {v15}, Landroidx/compose/runtime/Composer;->endDefaults()V

    .line 455
    .line 456
    .line 457
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 458
    .line 459
    .line 460
    move-result v0

    .line 461
    if-eqz v0, :cond_26

    .line 462
    .line 463
    const/4 v0, -0x1

    .line 464
    const-string v2, "androidx.compose.material3.LeadingIconTab (Tab.kt:154)"

    .line 465
    .line 466
    const v3, -0x2e54e8c0

    .line 467
    .line 468
    .line 469
    invoke-static {v3, v8, v0, v2}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 470
    .line 471
    .line 472
    :cond_26
    const/4 v0, 0x1

    .line 473
    const/4 v2, 0x0

    .line 474
    shr-int/lit8 v3, v8, 0xc

    .line 475
    .line 476
    and-int/lit16 v3, v3, 0x380

    .line 477
    .line 478
    or-int/lit8 v3, v3, 0x6

    .line 479
    .line 480
    const/4 v4, 0x2

    .line 481
    move/from16 p4, v0

    .line 482
    .line 483
    move/from16 p5, v2

    .line 484
    .line 485
    move-wide/from16 p6, v18

    .line 486
    .line 487
    move-object/from16 p8, v15

    .line 488
    .line 489
    move/from16 p9, v3

    .line 490
    .line 491
    move/from16 p10, v4

    .line 492
    .line 493
    invoke-static/range {p4 .. p10}, Landroidx/compose/material/ripple/RippleKt;->rememberRipple-9IZ8Weo(ZFJLandroidx/compose/runtime/Composer;II)Landroidx/compose/foundation/Indication;

    .line 494
    .line 495
    .line 496
    move-result-object v4

    .line 497
    new-instance v7, Landroidx/compose/material3/TabKt$LeadingIconTab$2;

    .line 498
    .line 499
    move-object v0, v7

    .line 500
    move v6, v1

    .line 501
    move-object/from16 v1, v16

    .line 502
    .line 503
    move/from16 v2, p0

    .line 504
    .line 505
    move-object/from16 v3, v22

    .line 506
    .line 507
    move/from16 v5, v17

    .line 508
    .line 509
    move v10, v6

    .line 510
    move-object/from16 v6, p1

    .line 511
    .line 512
    move-object v11, v7

    .line 513
    move-object/from16 v7, p3

    .line 514
    .line 515
    move/from16 v23, v8

    .line 516
    .line 517
    move-object/from16 v9, p2

    .line 518
    .line 519
    invoke-direct/range {v0 .. v9}, Landroidx/compose/material3/TabKt$LeadingIconTab$2;-><init>(Landroidx/compose/ui/Modifier;ZLandroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/foundation/Indication;ZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;ILkotlin/jvm/functions/Function2;)V

    .line 520
    .line 521
    .line 522
    const v0, -0x199297fc

    .line 523
    .line 524
    .line 525
    invoke-static {v15, v0, v10, v11}, Landroidx/compose/runtime/internal/ComposableLambdaKt;->composableLambda(Landroidx/compose/runtime/Composer;IZLjava/lang/Object;)Landroidx/compose/runtime/internal/ComposableLambda;

    .line 526
    .line 527
    .line 528
    move-result-object v0

    .line 529
    shr-int/lit8 v1, v23, 0x12

    .line 530
    .line 531
    and-int/lit8 v2, v1, 0xe

    .line 532
    .line 533
    or-int/lit16 v2, v2, 0xc00

    .line 534
    .line 535
    and-int/lit8 v1, v1, 0x70

    .line 536
    .line 537
    or-int/2addr v1, v2

    .line 538
    shl-int/lit8 v2, v23, 0x6

    .line 539
    .line 540
    and-int/lit16 v2, v2, 0x380

    .line 541
    .line 542
    or-int/2addr v1, v2

    .line 543
    move-wide/from16 p4, v18

    .line 544
    .line 545
    move-wide/from16 p6, v20

    .line 546
    .line 547
    move/from16 p8, p0

    .line 548
    .line 549
    move-object/from16 p9, v0

    .line 550
    .line 551
    move-object/from16 p10, v15

    .line 552
    .line 553
    move/from16 p11, v1

    .line 554
    .line 555
    invoke-static/range {p4 .. p11}, Landroidx/compose/material3/TabKt;->TabTransition-Klgx-Pg(JJZLkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V

    .line 556
    .line 557
    .line 558
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 559
    .line 560
    .line 561
    move-result v0

    .line 562
    if-eqz v0, :cond_27

    .line 563
    .line 564
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 565
    .line 566
    .line 567
    :cond_27
    move-object/from16 v5, v16

    .line 568
    .line 569
    move/from16 v6, v17

    .line 570
    .line 571
    move-wide/from16 v7, v18

    .line 572
    .line 573
    move-wide/from16 v9, v20

    .line 574
    .line 575
    move-object/from16 v11, v22

    .line 576
    .line 577
    :goto_19
    invoke-interface {v15}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    .line 578
    .line 579
    .line 580
    move-result-object v15

    .line 581
    if-nez v15, :cond_28

    .line 582
    .line 583
    goto :goto_1a

    .line 584
    :cond_28
    new-instance v4, Landroidx/compose/material3/TabKt$LeadingIconTab$3;

    .line 585
    .line 586
    move-object v0, v4

    .line 587
    move/from16 v1, p0

    .line 588
    .line 589
    move-object/from16 v2, p1

    .line 590
    .line 591
    move-object/from16 v3, p2

    .line 592
    .line 593
    move-object v14, v4

    .line 594
    move-object/from16 v4, p3

    .line 595
    .line 596
    move/from16 v12, p12

    .line 597
    .line 598
    move/from16 v13, p13

    .line 599
    .line 600
    invoke-direct/range {v0 .. v13}, Landroidx/compose/material3/TabKt$LeadingIconTab$3;-><init>(ZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/Modifier;ZJJLandroidx/compose/foundation/interaction/MutableInteractionSource;II)V

    .line 601
    .line 602
    .line 603
    invoke-interface {v15, v14}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lkotlin/jvm/functions/Function2;)V

    .line 604
    .line 605
    .line 606
    :goto_1a
    return-void
.end method

.method public static final Tab-bogVsAg(ZLkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;ZJJLandroidx/compose/foundation/interaction/MutableInteractionSource;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V
    .locals 23
    .annotation build Landroidx/compose/runtime/Composable;
    .end annotation

    .annotation build Landroidx/compose/runtime/ComposableInferredTarget;
        scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z",
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;",
            "Landroidx/compose/ui/Modifier;",
            "ZJJ",
            "Landroidx/compose/foundation/interaction/MutableInteractionSource;",
            "Lkotlin/jvm/functions/Function3<",
            "-",
            "Landroidx/compose/foundation/layout/ColumnScope;",
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
    move-object/from16 v9, p1

    .line 2
    .line 3
    move-object/from16 v10, p9

    .line 4
    .line 5
    move/from16 v11, p11

    .line 6
    .line 7
    move/from16 v12, p12

    .line 8
    .line 9
    const-string v0, "onClick"

    .line 10
    .line 11
    invoke-static {v9, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    const-string v0, "content"

    .line 15
    .line 16
    invoke-static {v10, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    const v0, -0xc158108

    .line 20
    .line 21
    .line 22
    move-object/from16 v1, p10

    .line 23
    .line 24
    invoke-interface {v1, v0}, Landroidx/compose/runtime/Composer;->startRestartGroup(I)Landroidx/compose/runtime/Composer;

    .line 25
    .line 26
    .line 27
    move-result-object v13

    .line 28
    and-int/lit8 v1, v12, 0x1

    .line 29
    .line 30
    if-eqz v1, :cond_0

    .line 31
    .line 32
    or-int/lit8 v1, v11, 0x6

    .line 33
    .line 34
    move/from16 v14, p0

    .line 35
    .line 36
    goto :goto_1

    .line 37
    :cond_0
    and-int/lit8 v1, v11, 0xe

    .line 38
    .line 39
    move/from16 v14, p0

    .line 40
    .line 41
    if-nez v1, :cond_2

    .line 42
    .line 43
    invoke-interface {v13, v14}, Landroidx/compose/runtime/Composer;->changed(Z)Z

    .line 44
    .line 45
    .line 46
    move-result v1

    .line 47
    if-eqz v1, :cond_1

    .line 48
    .line 49
    const/4 v1, 0x4

    .line 50
    goto :goto_0

    .line 51
    :cond_1
    const/4 v1, 0x2

    .line 52
    :goto_0
    or-int/2addr v1, v11

    .line 53
    goto :goto_1

    .line 54
    :cond_2
    move v1, v11

    .line 55
    :goto_1
    and-int/lit8 v2, v12, 0x2

    .line 56
    .line 57
    if-eqz v2, :cond_3

    .line 58
    .line 59
    or-int/lit8 v1, v1, 0x30

    .line 60
    .line 61
    goto :goto_3

    .line 62
    :cond_3
    and-int/lit8 v2, v11, 0x70

    .line 63
    .line 64
    if-nez v2, :cond_5

    .line 65
    .line 66
    invoke-interface {v13, v9}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 67
    .line 68
    .line 69
    move-result v2

    .line 70
    if-eqz v2, :cond_4

    .line 71
    .line 72
    const/16 v2, 0x20

    .line 73
    .line 74
    goto :goto_2

    .line 75
    :cond_4
    const/16 v2, 0x10

    .line 76
    .line 77
    :goto_2
    or-int/2addr v1, v2

    .line 78
    :cond_5
    :goto_3
    and-int/lit8 v2, v12, 0x4

    .line 79
    .line 80
    if-eqz v2, :cond_6

    .line 81
    .line 82
    or-int/lit16 v1, v1, 0x180

    .line 83
    .line 84
    goto :goto_5

    .line 85
    :cond_6
    and-int/lit16 v3, v11, 0x380

    .line 86
    .line 87
    if-nez v3, :cond_8

    .line 88
    .line 89
    move-object/from16 v3, p2

    .line 90
    .line 91
    invoke-interface {v13, v3}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 92
    .line 93
    .line 94
    move-result v4

    .line 95
    if-eqz v4, :cond_7

    .line 96
    .line 97
    const/16 v4, 0x100

    .line 98
    .line 99
    goto :goto_4

    .line 100
    :cond_7
    const/16 v4, 0x80

    .line 101
    .line 102
    :goto_4
    or-int/2addr v1, v4

    .line 103
    goto :goto_6

    .line 104
    :cond_8
    :goto_5
    move-object/from16 v3, p2

    .line 105
    .line 106
    :goto_6
    and-int/lit8 v4, v12, 0x8

    .line 107
    .line 108
    if-eqz v4, :cond_9

    .line 109
    .line 110
    or-int/lit16 v1, v1, 0xc00

    .line 111
    .line 112
    goto :goto_8

    .line 113
    :cond_9
    and-int/lit16 v5, v11, 0x1c00

    .line 114
    .line 115
    if-nez v5, :cond_b

    .line 116
    .line 117
    move/from16 v5, p3

    .line 118
    .line 119
    invoke-interface {v13, v5}, Landroidx/compose/runtime/Composer;->changed(Z)Z

    .line 120
    .line 121
    .line 122
    move-result v6

    .line 123
    if-eqz v6, :cond_a

    .line 124
    .line 125
    const/16 v6, 0x800

    .line 126
    .line 127
    goto :goto_7

    .line 128
    :cond_a
    const/16 v6, 0x400

    .line 129
    .line 130
    :goto_7
    or-int/2addr v1, v6

    .line 131
    goto :goto_9

    .line 132
    :cond_b
    :goto_8
    move/from16 v5, p3

    .line 133
    .line 134
    :goto_9
    const v6, 0xe000

    .line 135
    .line 136
    .line 137
    and-int/2addr v6, v11

    .line 138
    if-nez v6, :cond_e

    .line 139
    .line 140
    and-int/lit8 v6, v12, 0x10

    .line 141
    .line 142
    if-nez v6, :cond_c

    .line 143
    .line 144
    move-wide/from16 v6, p4

    .line 145
    .line 146
    invoke-interface {v13, v6, v7}, Landroidx/compose/runtime/Composer;->changed(J)Z

    .line 147
    .line 148
    .line 149
    move-result v8

    .line 150
    if-eqz v8, :cond_d

    .line 151
    .line 152
    const/16 v8, 0x4000

    .line 153
    .line 154
    goto :goto_a

    .line 155
    :cond_c
    move-wide/from16 v6, p4

    .line 156
    .line 157
    :cond_d
    const/16 v8, 0x2000

    .line 158
    .line 159
    :goto_a
    or-int/2addr v1, v8

    .line 160
    goto :goto_b

    .line 161
    :cond_e
    move-wide/from16 v6, p4

    .line 162
    .line 163
    :goto_b
    const/high16 v8, 0x70000

    .line 164
    .line 165
    and-int/2addr v8, v11

    .line 166
    if-nez v8, :cond_10

    .line 167
    .line 168
    and-int/lit8 v8, v12, 0x20

    .line 169
    .line 170
    move/from16 p10, v1

    .line 171
    .line 172
    move-wide/from16 v0, p6

    .line 173
    .line 174
    if-nez v8, :cond_f

    .line 175
    .line 176
    invoke-interface {v13, v0, v1}, Landroidx/compose/runtime/Composer;->changed(J)Z

    .line 177
    .line 178
    .line 179
    move-result v15

    .line 180
    if-eqz v15, :cond_f

    .line 181
    .line 182
    const/high16 v15, 0x20000

    .line 183
    .line 184
    goto :goto_c

    .line 185
    :cond_f
    const/high16 v15, 0x10000

    .line 186
    .line 187
    :goto_c
    or-int v15, p10, v15

    .line 188
    .line 189
    goto :goto_d

    .line 190
    :cond_10
    move/from16 p10, v1

    .line 191
    .line 192
    move-wide/from16 v0, p6

    .line 193
    .line 194
    move/from16 v15, p10

    .line 195
    .line 196
    :goto_d
    and-int/lit8 v16, v12, 0x40

    .line 197
    .line 198
    if-eqz v16, :cond_11

    .line 199
    .line 200
    const/high16 v17, 0x180000

    .line 201
    .line 202
    or-int v15, v15, v17

    .line 203
    .line 204
    move-object/from16 v8, p8

    .line 205
    .line 206
    goto :goto_f

    .line 207
    :cond_11
    const/high16 v17, 0x380000

    .line 208
    .line 209
    and-int v17, v11, v17

    .line 210
    .line 211
    move-object/from16 v8, p8

    .line 212
    .line 213
    if-nez v17, :cond_13

    .line 214
    .line 215
    invoke-interface {v13, v8}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 216
    .line 217
    .line 218
    move-result v17

    .line 219
    if-eqz v17, :cond_12

    .line 220
    .line 221
    const/high16 v17, 0x100000

    .line 222
    .line 223
    goto :goto_e

    .line 224
    :cond_12
    const/high16 v17, 0x80000

    .line 225
    .line 226
    :goto_e
    or-int v15, v15, v17

    .line 227
    .line 228
    :cond_13
    :goto_f
    and-int/lit16 v0, v12, 0x80

    .line 229
    .line 230
    if-eqz v0, :cond_14

    .line 231
    .line 232
    const/high16 v0, 0xc00000

    .line 233
    .line 234
    :goto_10
    or-int/2addr v15, v0

    .line 235
    goto :goto_11

    .line 236
    :cond_14
    const/high16 v0, 0x1c00000

    .line 237
    .line 238
    and-int/2addr v0, v11

    .line 239
    if-nez v0, :cond_16

    .line 240
    .line 241
    invoke-interface {v13, v10}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 242
    .line 243
    .line 244
    move-result v0

    .line 245
    if-eqz v0, :cond_15

    .line 246
    .line 247
    const/high16 v0, 0x800000

    .line 248
    .line 249
    goto :goto_10

    .line 250
    :cond_15
    const/high16 v0, 0x400000

    .line 251
    .line 252
    goto :goto_10

    .line 253
    :cond_16
    :goto_11
    const v0, 0x16db6db

    .line 254
    .line 255
    .line 256
    and-int/2addr v0, v15

    .line 257
    const v1, 0x492492

    .line 258
    .line 259
    .line 260
    if-ne v0, v1, :cond_18

    .line 261
    .line 262
    invoke-interface {v13}, Landroidx/compose/runtime/Composer;->getSkipping()Z

    .line 263
    .line 264
    .line 265
    move-result v0

    .line 266
    if-nez v0, :cond_17

    .line 267
    .line 268
    goto :goto_12

    .line 269
    :cond_17
    invoke-interface {v13}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    .line 270
    .line 271
    .line 272
    move v4, v5

    .line 273
    move-wide v5, v6

    .line 274
    move-object v9, v8

    .line 275
    move-wide/from16 v7, p6

    .line 276
    .line 277
    goto/16 :goto_17

    .line 278
    .line 279
    :cond_18
    :goto_12
    invoke-interface {v13}, Landroidx/compose/runtime/Composer;->startDefaults()V

    .line 280
    .line 281
    .line 282
    and-int/lit8 v0, v11, 0x1

    .line 283
    .line 284
    const v17, -0xe001

    .line 285
    .line 286
    .line 287
    const/4 v1, 0x1

    .line 288
    if-eqz v0, :cond_1c

    .line 289
    .line 290
    invoke-interface {v13}, Landroidx/compose/runtime/Composer;->getDefaultsInvalid()Z

    .line 291
    .line 292
    .line 293
    move-result v0

    .line 294
    if-eqz v0, :cond_19

    .line 295
    .line 296
    goto :goto_13

    .line 297
    :cond_19
    invoke-interface {v13}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    .line 298
    .line 299
    .line 300
    and-int/lit8 v0, v12, 0x10

    .line 301
    .line 302
    if-eqz v0, :cond_1a

    .line 303
    .line 304
    and-int v15, v15, v17

    .line 305
    .line 306
    :cond_1a
    and-int/lit8 v0, v12, 0x20

    .line 307
    .line 308
    if-eqz v0, :cond_1b

    .line 309
    .line 310
    const v0, -0x70001

    .line 311
    .line 312
    .line 313
    and-int/2addr v15, v0

    .line 314
    :cond_1b
    move-wide/from16 v19, p6

    .line 315
    .line 316
    move/from16 v16, v5

    .line 317
    .line 318
    move-wide/from16 v17, v6

    .line 319
    .line 320
    move-object/from16 v21, v8

    .line 321
    .line 322
    move v8, v15

    .line 323
    move-object v15, v3

    .line 324
    goto :goto_16

    .line 325
    :cond_1c
    :goto_13
    if-eqz v2, :cond_1d

    .line 326
    .line 327
    sget-object v0, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    .line 328
    .line 329
    move-object v3, v0

    .line 330
    :cond_1d
    if-eqz v4, :cond_1e

    .line 331
    .line 332
    move v5, v1

    .line 333
    :cond_1e
    and-int/lit8 v0, v12, 0x10

    .line 334
    .line 335
    if-eqz v0, :cond_1f

    .line 336
    .line 337
    invoke-static {}, Landroidx/compose/material3/ContentColorKt;->getLocalContentColor()Landroidx/compose/runtime/ProvidableCompositionLocal;

    .line 338
    .line 339
    .line 340
    move-result-object v0

    .line 341
    invoke-interface {v13, v0}, Landroidx/compose/runtime/Composer;->consume(Landroidx/compose/runtime/CompositionLocal;)Ljava/lang/Object;

    .line 342
    .line 343
    .line 344
    move-result-object v0

    .line 345
    check-cast v0, Landroidx/compose/ui/graphics/Color;

    .line 346
    .line 347
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color;->unbox-impl()J

    .line 348
    .line 349
    .line 350
    move-result-wide v6

    .line 351
    and-int v15, v15, v17

    .line 352
    .line 353
    :cond_1f
    and-int/lit8 v0, v12, 0x20

    .line 354
    .line 355
    if-eqz v0, :cond_20

    .line 356
    .line 357
    const v0, -0x70001

    .line 358
    .line 359
    .line 360
    and-int/2addr v0, v15

    .line 361
    move v15, v0

    .line 362
    move-wide/from16 v17, v6

    .line 363
    .line 364
    goto :goto_14

    .line 365
    :cond_20
    move-wide/from16 v17, p6

    .line 366
    .line 367
    :goto_14
    if-eqz v16, :cond_22

    .line 368
    .line 369
    const v0, -0x1d58f75c

    .line 370
    .line 371
    .line 372
    invoke-interface {v13, v0}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 373
    .line 374
    .line 375
    invoke-interface {v13}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 376
    .line 377
    .line 378
    move-result-object v0

    .line 379
    sget-object v2, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    .line 380
    .line 381
    invoke-virtual {v2}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    .line 382
    .line 383
    .line 384
    move-result-object v2

    .line 385
    if-ne v0, v2, :cond_21

    .line 386
    .line 387
    invoke-static {}, Landroidx/compose/foundation/interaction/InteractionSourceKt;->MutableInteractionSource()Landroidx/compose/foundation/interaction/MutableInteractionSource;

    .line 388
    .line 389
    .line 390
    move-result-object v0

    .line 391
    invoke-interface {v13, v0}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 392
    .line 393
    .line 394
    :cond_21
    invoke-interface {v13}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 395
    .line 396
    .line 397
    check-cast v0, Landroidx/compose/foundation/interaction/MutableInteractionSource;

    .line 398
    .line 399
    move-object/from16 v21, v0

    .line 400
    .line 401
    move/from16 v16, v5

    .line 402
    .line 403
    goto :goto_15

    .line 404
    :cond_22
    move/from16 v16, v5

    .line 405
    .line 406
    move-object/from16 v21, v8

    .line 407
    .line 408
    :goto_15
    move v8, v15

    .line 409
    move-wide/from16 v19, v17

    .line 410
    .line 411
    move-object v15, v3

    .line 412
    move-wide/from16 v17, v6

    .line 413
    .line 414
    :goto_16
    invoke-interface {v13}, Landroidx/compose/runtime/Composer;->endDefaults()V

    .line 415
    .line 416
    .line 417
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 418
    .line 419
    .line 420
    move-result v0

    .line 421
    if-eqz v0, :cond_23

    .line 422
    .line 423
    const/4 v0, -0x1

    .line 424
    const-string v2, "androidx.compose.material3.Tab (Tab.kt:225)"

    .line 425
    .line 426
    const v3, -0xc158108

    .line 427
    .line 428
    .line 429
    invoke-static {v3, v8, v0, v2}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 430
    .line 431
    .line 432
    :cond_23
    const/4 v0, 0x1

    .line 433
    const/4 v2, 0x0

    .line 434
    shr-int/lit8 v3, v8, 0x6

    .line 435
    .line 436
    and-int/lit16 v3, v3, 0x380

    .line 437
    .line 438
    or-int/lit8 v3, v3, 0x6

    .line 439
    .line 440
    const/4 v4, 0x2

    .line 441
    move/from16 p2, v0

    .line 442
    .line 443
    move/from16 p3, v2

    .line 444
    .line 445
    move-wide/from16 p4, v17

    .line 446
    .line 447
    move-object/from16 p6, v13

    .line 448
    .line 449
    move/from16 p7, v3

    .line 450
    .line 451
    move/from16 p8, v4

    .line 452
    .line 453
    invoke-static/range {p2 .. p8}, Landroidx/compose/material/ripple/RippleKt;->rememberRipple-9IZ8Weo(ZFJLandroidx/compose/runtime/Composer;II)Landroidx/compose/foundation/Indication;

    .line 454
    .line 455
    .line 456
    move-result-object v4

    .line 457
    new-instance v7, Landroidx/compose/material3/TabKt$Tab$5;

    .line 458
    .line 459
    move-object v0, v7

    .line 460
    move v6, v1

    .line 461
    move-object v1, v15

    .line 462
    move/from16 v2, p0

    .line 463
    .line 464
    move-object/from16 v3, v21

    .line 465
    .line 466
    move/from16 v5, v16

    .line 467
    .line 468
    move v9, v6

    .line 469
    move-object/from16 v6, p1

    .line 470
    .line 471
    move-object v10, v7

    .line 472
    move-object/from16 v7, p9

    .line 473
    .line 474
    move/from16 v22, v8

    .line 475
    .line 476
    invoke-direct/range {v0 .. v8}, Landroidx/compose/material3/TabKt$Tab$5;-><init>(Landroidx/compose/ui/Modifier;ZLandroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/foundation/Indication;ZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function3;I)V

    .line 477
    .line 478
    .line 479
    const v0, -0x20e5444c

    .line 480
    .line 481
    .line 482
    invoke-static {v13, v0, v9, v10}, Landroidx/compose/runtime/internal/ComposableLambdaKt;->composableLambda(Landroidx/compose/runtime/Composer;IZLjava/lang/Object;)Landroidx/compose/runtime/internal/ComposableLambda;

    .line 483
    .line 484
    .line 485
    move-result-object v6

    .line 486
    shr-int/lit8 v0, v22, 0xc

    .line 487
    .line 488
    and-int/lit8 v1, v0, 0xe

    .line 489
    .line 490
    or-int/lit16 v1, v1, 0xc00

    .line 491
    .line 492
    and-int/lit8 v0, v0, 0x70

    .line 493
    .line 494
    or-int/2addr v0, v1

    .line 495
    shl-int/lit8 v1, v22, 0x6

    .line 496
    .line 497
    and-int/lit16 v1, v1, 0x380

    .line 498
    .line 499
    or-int v8, v0, v1

    .line 500
    .line 501
    move-wide/from16 v1, v17

    .line 502
    .line 503
    move-wide/from16 v3, v19

    .line 504
    .line 505
    move/from16 v5, p0

    .line 506
    .line 507
    move-object v7, v13

    .line 508
    invoke-static/range {v1 .. v8}, Landroidx/compose/material3/TabKt;->TabTransition-Klgx-Pg(JJZLkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V

    .line 509
    .line 510
    .line 511
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 512
    .line 513
    .line 514
    move-result v0

    .line 515
    if-eqz v0, :cond_24

    .line 516
    .line 517
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 518
    .line 519
    .line 520
    :cond_24
    move-object v3, v15

    .line 521
    move/from16 v4, v16

    .line 522
    .line 523
    move-wide/from16 v5, v17

    .line 524
    .line 525
    move-wide/from16 v7, v19

    .line 526
    .line 527
    move-object/from16 v9, v21

    .line 528
    .line 529
    :goto_17
    invoke-interface {v13}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    .line 530
    .line 531
    .line 532
    move-result-object v13

    .line 533
    if-nez v13, :cond_25

    .line 534
    .line 535
    goto :goto_18

    .line 536
    :cond_25
    new-instance v15, Landroidx/compose/material3/TabKt$Tab$6;

    .line 537
    .line 538
    move-object v0, v15

    .line 539
    move/from16 v1, p0

    .line 540
    .line 541
    move-object/from16 v2, p1

    .line 542
    .line 543
    move-object/from16 v10, p9

    .line 544
    .line 545
    move/from16 v11, p11

    .line 546
    .line 547
    move/from16 v12, p12

    .line 548
    .line 549
    invoke-direct/range {v0 .. v12}, Landroidx/compose/material3/TabKt$Tab$6;-><init>(ZLkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;ZJJLandroidx/compose/foundation/interaction/MutableInteractionSource;Lkotlin/jvm/functions/Function3;II)V

    .line 550
    .line 551
    .line 552
    invoke-interface {v13, v15}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lkotlin/jvm/functions/Function2;)V

    .line 553
    .line 554
    .line 555
    :goto_18
    return-void
.end method

.method public static final Tab-wqdebIU(ZLkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;ZLkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;JJLandroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/runtime/Composer;II)V
    .locals 27
    .annotation build Landroidx/compose/runtime/Composable;
    .end annotation

    .annotation build Landroidx/compose/runtime/ComposableInferredTarget;
        scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z",
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;",
            "Landroidx/compose/ui/Modifier;",
            "Z",
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
            ">;JJ",
            "Landroidx/compose/foundation/interaction/MutableInteractionSource;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    .line 1
    move-object/from16 v13, p1

    .line 2
    .line 3
    move/from16 v14, p12

    .line 4
    .line 5
    move/from16 v15, p13

    .line 6
    .line 7
    const-string v0, "onClick"

    .line 8
    .line 9
    invoke-static {v13, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    const v0, -0x14e6256d

    .line 13
    .line 14
    .line 15
    move-object/from16 v1, p11

    .line 16
    .line 17
    invoke-interface {v1, v0}, Landroidx/compose/runtime/Composer;->startRestartGroup(I)Landroidx/compose/runtime/Composer;

    .line 18
    .line 19
    .line 20
    move-result-object v12

    .line 21
    and-int/lit8 v1, v15, 0x1

    .line 22
    .line 23
    if-eqz v1, :cond_0

    .line 24
    .line 25
    or-int/lit8 v1, v14, 0x6

    .line 26
    .line 27
    move/from16 v11, p0

    .line 28
    .line 29
    goto :goto_1

    .line 30
    :cond_0
    and-int/lit8 v1, v14, 0xe

    .line 31
    .line 32
    move/from16 v11, p0

    .line 33
    .line 34
    if-nez v1, :cond_2

    .line 35
    .line 36
    invoke-interface {v12, v11}, Landroidx/compose/runtime/Composer;->changed(Z)Z

    .line 37
    .line 38
    .line 39
    move-result v1

    .line 40
    if-eqz v1, :cond_1

    .line 41
    .line 42
    const/4 v1, 0x4

    .line 43
    goto :goto_0

    .line 44
    :cond_1
    const/4 v1, 0x2

    .line 45
    :goto_0
    or-int/2addr v1, v14

    .line 46
    goto :goto_1

    .line 47
    :cond_2
    move v1, v14

    .line 48
    :goto_1
    and-int/lit8 v2, v15, 0x2

    .line 49
    .line 50
    if-eqz v2, :cond_3

    .line 51
    .line 52
    or-int/lit8 v1, v1, 0x30

    .line 53
    .line 54
    goto :goto_3

    .line 55
    :cond_3
    and-int/lit8 v2, v14, 0x70

    .line 56
    .line 57
    if-nez v2, :cond_5

    .line 58
    .line 59
    invoke-interface {v12, v13}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 60
    .line 61
    .line 62
    move-result v2

    .line 63
    if-eqz v2, :cond_4

    .line 64
    .line 65
    const/16 v2, 0x20

    .line 66
    .line 67
    goto :goto_2

    .line 68
    :cond_4
    const/16 v2, 0x10

    .line 69
    .line 70
    :goto_2
    or-int/2addr v1, v2

    .line 71
    :cond_5
    :goto_3
    and-int/lit8 v2, v15, 0x4

    .line 72
    .line 73
    if-eqz v2, :cond_6

    .line 74
    .line 75
    or-int/lit16 v1, v1, 0x180

    .line 76
    .line 77
    goto :goto_5

    .line 78
    :cond_6
    and-int/lit16 v3, v14, 0x380

    .line 79
    .line 80
    if-nez v3, :cond_8

    .line 81
    .line 82
    move-object/from16 v3, p2

    .line 83
    .line 84
    invoke-interface {v12, v3}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 85
    .line 86
    .line 87
    move-result v4

    .line 88
    if-eqz v4, :cond_7

    .line 89
    .line 90
    const/16 v4, 0x100

    .line 91
    .line 92
    goto :goto_4

    .line 93
    :cond_7
    const/16 v4, 0x80

    .line 94
    .line 95
    :goto_4
    or-int/2addr v1, v4

    .line 96
    goto :goto_6

    .line 97
    :cond_8
    :goto_5
    move-object/from16 v3, p2

    .line 98
    .line 99
    :goto_6
    and-int/lit8 v4, v15, 0x8

    .line 100
    .line 101
    if-eqz v4, :cond_9

    .line 102
    .line 103
    or-int/lit16 v1, v1, 0xc00

    .line 104
    .line 105
    goto :goto_8

    .line 106
    :cond_9
    and-int/lit16 v5, v14, 0x1c00

    .line 107
    .line 108
    if-nez v5, :cond_b

    .line 109
    .line 110
    move/from16 v5, p3

    .line 111
    .line 112
    invoke-interface {v12, v5}, Landroidx/compose/runtime/Composer;->changed(Z)Z

    .line 113
    .line 114
    .line 115
    move-result v6

    .line 116
    if-eqz v6, :cond_a

    .line 117
    .line 118
    const/16 v6, 0x800

    .line 119
    .line 120
    goto :goto_7

    .line 121
    :cond_a
    const/16 v6, 0x400

    .line 122
    .line 123
    :goto_7
    or-int/2addr v1, v6

    .line 124
    goto :goto_9

    .line 125
    :cond_b
    :goto_8
    move/from16 v5, p3

    .line 126
    .line 127
    :goto_9
    and-int/lit8 v6, v15, 0x10

    .line 128
    .line 129
    const v7, 0xe000

    .line 130
    .line 131
    .line 132
    if-eqz v6, :cond_c

    .line 133
    .line 134
    or-int/lit16 v1, v1, 0x6000

    .line 135
    .line 136
    goto :goto_b

    .line 137
    :cond_c
    and-int v8, v14, v7

    .line 138
    .line 139
    if-nez v8, :cond_e

    .line 140
    .line 141
    move-object/from16 v8, p4

    .line 142
    .line 143
    invoke-interface {v12, v8}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 144
    .line 145
    .line 146
    move-result v9

    .line 147
    if-eqz v9, :cond_d

    .line 148
    .line 149
    const/16 v9, 0x4000

    .line 150
    .line 151
    goto :goto_a

    .line 152
    :cond_d
    const/16 v9, 0x2000

    .line 153
    .line 154
    :goto_a
    or-int/2addr v1, v9

    .line 155
    goto :goto_c

    .line 156
    :cond_e
    :goto_b
    move-object/from16 v8, p4

    .line 157
    .line 158
    :goto_c
    and-int/lit8 v9, v15, 0x20

    .line 159
    .line 160
    const/high16 v10, 0x70000

    .line 161
    .line 162
    if-eqz v9, :cond_f

    .line 163
    .line 164
    const/high16 v16, 0x30000

    .line 165
    .line 166
    or-int v1, v1, v16

    .line 167
    .line 168
    move-object/from16 v10, p5

    .line 169
    .line 170
    goto :goto_e

    .line 171
    :cond_f
    and-int v16, v14, v10

    .line 172
    .line 173
    move-object/from16 v10, p5

    .line 174
    .line 175
    if-nez v16, :cond_11

    .line 176
    .line 177
    invoke-interface {v12, v10}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 178
    .line 179
    .line 180
    move-result v16

    .line 181
    if-eqz v16, :cond_10

    .line 182
    .line 183
    const/high16 v16, 0x20000

    .line 184
    .line 185
    goto :goto_d

    .line 186
    :cond_10
    const/high16 v16, 0x10000

    .line 187
    .line 188
    :goto_d
    or-int v1, v1, v16

    .line 189
    .line 190
    :cond_11
    :goto_e
    const/high16 v16, 0x380000

    .line 191
    .line 192
    and-int v17, v14, v16

    .line 193
    .line 194
    if-nez v17, :cond_13

    .line 195
    .line 196
    and-int/lit8 v17, v15, 0x40

    .line 197
    .line 198
    move-wide/from16 v7, p6

    .line 199
    .line 200
    if-nez v17, :cond_12

    .line 201
    .line 202
    invoke-interface {v12, v7, v8}, Landroidx/compose/runtime/Composer;->changed(J)Z

    .line 203
    .line 204
    .line 205
    move-result v18

    .line 206
    if-eqz v18, :cond_12

    .line 207
    .line 208
    const/high16 v18, 0x100000

    .line 209
    .line 210
    goto :goto_f

    .line 211
    :cond_12
    const/high16 v18, 0x80000

    .line 212
    .line 213
    :goto_f
    or-int v1, v1, v18

    .line 214
    .line 215
    goto :goto_10

    .line 216
    :cond_13
    move-wide/from16 v7, p6

    .line 217
    .line 218
    :goto_10
    const/high16 v18, 0x1c00000

    .line 219
    .line 220
    and-int v18, v14, v18

    .line 221
    .line 222
    if-nez v18, :cond_15

    .line 223
    .line 224
    and-int/lit16 v0, v15, 0x80

    .line 225
    .line 226
    move-wide/from16 v7, p8

    .line 227
    .line 228
    if-nez v0, :cond_14

    .line 229
    .line 230
    invoke-interface {v12, v7, v8}, Landroidx/compose/runtime/Composer;->changed(J)Z

    .line 231
    .line 232
    .line 233
    move-result v0

    .line 234
    if-eqz v0, :cond_14

    .line 235
    .line 236
    const/high16 v0, 0x800000

    .line 237
    .line 238
    goto :goto_11

    .line 239
    :cond_14
    const/high16 v0, 0x400000

    .line 240
    .line 241
    :goto_11
    or-int/2addr v1, v0

    .line 242
    goto :goto_12

    .line 243
    :cond_15
    move-wide/from16 v7, p8

    .line 244
    .line 245
    :goto_12
    and-int/lit16 v0, v15, 0x100

    .line 246
    .line 247
    if-eqz v0, :cond_16

    .line 248
    .line 249
    const/high16 v19, 0x6000000

    .line 250
    .line 251
    or-int v1, v1, v19

    .line 252
    .line 253
    move-object/from16 v3, p10

    .line 254
    .line 255
    goto :goto_14

    .line 256
    :cond_16
    const/high16 v19, 0xe000000

    .line 257
    .line 258
    and-int v19, v14, v19

    .line 259
    .line 260
    move-object/from16 v3, p10

    .line 261
    .line 262
    if-nez v19, :cond_18

    .line 263
    .line 264
    invoke-interface {v12, v3}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 265
    .line 266
    .line 267
    move-result v19

    .line 268
    if-eqz v19, :cond_17

    .line 269
    .line 270
    const/high16 v19, 0x4000000

    .line 271
    .line 272
    goto :goto_13

    .line 273
    :cond_17
    const/high16 v19, 0x2000000

    .line 274
    .line 275
    :goto_13
    or-int v1, v1, v19

    .line 276
    .line 277
    :cond_18
    :goto_14
    const v19, 0xb6db6db

    .line 278
    .line 279
    .line 280
    and-int v3, v1, v19

    .line 281
    .line 282
    const v5, 0x2492492

    .line 283
    .line 284
    .line 285
    if-ne v3, v5, :cond_1a

    .line 286
    .line 287
    invoke-interface {v12}, Landroidx/compose/runtime/Composer;->getSkipping()Z

    .line 288
    .line 289
    .line 290
    move-result v3

    .line 291
    if-nez v3, :cond_19

    .line 292
    .line 293
    goto :goto_15

    .line 294
    :cond_19
    invoke-interface {v12}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    .line 295
    .line 296
    .line 297
    move-object/from16 v3, p2

    .line 298
    .line 299
    move/from16 v4, p3

    .line 300
    .line 301
    move-object/from16 v5, p4

    .line 302
    .line 303
    move-object/from16 v11, p10

    .line 304
    .line 305
    move-object v6, v10

    .line 306
    move-object/from16 v16, v12

    .line 307
    .line 308
    move-wide v9, v7

    .line 309
    move-wide/from16 v7, p6

    .line 310
    .line 311
    goto/16 :goto_1d

    .line 312
    .line 313
    :cond_1a
    :goto_15
    invoke-interface {v12}, Landroidx/compose/runtime/Composer;->startDefaults()V

    .line 314
    .line 315
    .line 316
    and-int/lit8 v3, v14, 0x1

    .line 317
    .line 318
    const v19, -0x380001

    .line 319
    .line 320
    .line 321
    const/16 v20, 0x0

    .line 322
    .line 323
    const/4 v5, 0x1

    .line 324
    if-eqz v3, :cond_1e

    .line 325
    .line 326
    invoke-interface {v12}, Landroidx/compose/runtime/Composer;->getDefaultsInvalid()Z

    .line 327
    .line 328
    .line 329
    move-result v3

    .line 330
    if-eqz v3, :cond_1b

    .line 331
    .line 332
    goto :goto_16

    .line 333
    :cond_1b
    invoke-interface {v12}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    .line 334
    .line 335
    .line 336
    and-int/lit8 v0, v15, 0x40

    .line 337
    .line 338
    if-eqz v0, :cond_1c

    .line 339
    .line 340
    and-int v1, v1, v19

    .line 341
    .line 342
    :cond_1c
    and-int/lit16 v0, v15, 0x80

    .line 343
    .line 344
    if-eqz v0, :cond_1d

    .line 345
    .line 346
    const v0, -0x1c00001

    .line 347
    .line 348
    .line 349
    and-int/2addr v1, v0

    .line 350
    :cond_1d
    move-object/from16 v19, p2

    .line 351
    .line 352
    move/from16 v21, p3

    .line 353
    .line 354
    move-wide/from16 v22, p6

    .line 355
    .line 356
    move-object/from16 v26, p10

    .line 357
    .line 358
    move-wide/from16 v24, v7

    .line 359
    .line 360
    move-object v9, v10

    .line 361
    move-object/from16 v10, p4

    .line 362
    .line 363
    goto/16 :goto_1c

    .line 364
    .line 365
    :cond_1e
    :goto_16
    if-eqz v2, :cond_1f

    .line 366
    .line 367
    sget-object v2, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    .line 368
    .line 369
    goto :goto_17

    .line 370
    :cond_1f
    move-object/from16 v2, p2

    .line 371
    .line 372
    :goto_17
    if-eqz v4, :cond_20

    .line 373
    .line 374
    move v3, v5

    .line 375
    goto :goto_18

    .line 376
    :cond_20
    move/from16 v3, p3

    .line 377
    .line 378
    :goto_18
    if-eqz v6, :cond_21

    .line 379
    .line 380
    move-object/from16 v4, v20

    .line 381
    .line 382
    goto :goto_19

    .line 383
    :cond_21
    move-object/from16 v4, p4

    .line 384
    .line 385
    :goto_19
    if-eqz v9, :cond_22

    .line 386
    .line 387
    move-object/from16 v10, v20

    .line 388
    .line 389
    :cond_22
    and-int/lit8 v6, v15, 0x40

    .line 390
    .line 391
    if-eqz v6, :cond_23

    .line 392
    .line 393
    invoke-static {}, Landroidx/compose/material3/ContentColorKt;->getLocalContentColor()Landroidx/compose/runtime/ProvidableCompositionLocal;

    .line 394
    .line 395
    .line 396
    move-result-object v6

    .line 397
    invoke-interface {v12, v6}, Landroidx/compose/runtime/Composer;->consume(Landroidx/compose/runtime/CompositionLocal;)Ljava/lang/Object;

    .line 398
    .line 399
    .line 400
    move-result-object v6

    .line 401
    check-cast v6, Landroidx/compose/ui/graphics/Color;

    .line 402
    .line 403
    invoke-virtual {v6}, Landroidx/compose/ui/graphics/Color;->unbox-impl()J

    .line 404
    .line 405
    .line 406
    move-result-wide v22

    .line 407
    and-int v1, v1, v19

    .line 408
    .line 409
    goto :goto_1a

    .line 410
    :cond_23
    move-wide/from16 v22, p6

    .line 411
    .line 412
    :goto_1a
    and-int/lit16 v6, v15, 0x80

    .line 413
    .line 414
    if-eqz v6, :cond_24

    .line 415
    .line 416
    const v6, -0x1c00001

    .line 417
    .line 418
    .line 419
    and-int/2addr v1, v6

    .line 420
    move-wide/from16 v7, v22

    .line 421
    .line 422
    :cond_24
    if-eqz v0, :cond_26

    .line 423
    .line 424
    const v0, -0x1d58f75c

    .line 425
    .line 426
    .line 427
    invoke-interface {v12, v0}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 428
    .line 429
    .line 430
    invoke-interface {v12}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 431
    .line 432
    .line 433
    move-result-object v0

    .line 434
    sget-object v6, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    .line 435
    .line 436
    invoke-virtual {v6}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    .line 437
    .line 438
    .line 439
    move-result-object v6

    .line 440
    if-ne v0, v6, :cond_25

    .line 441
    .line 442
    invoke-static {}, Landroidx/compose/foundation/interaction/InteractionSourceKt;->MutableInteractionSource()Landroidx/compose/foundation/interaction/MutableInteractionSource;

    .line 443
    .line 444
    .line 445
    move-result-object v0

    .line 446
    invoke-interface {v12, v0}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 447
    .line 448
    .line 449
    :cond_25
    invoke-interface {v12}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 450
    .line 451
    .line 452
    check-cast v0, Landroidx/compose/foundation/interaction/MutableInteractionSource;

    .line 453
    .line 454
    move-object/from16 v26, v0

    .line 455
    .line 456
    goto :goto_1b

    .line 457
    :cond_26
    move-object/from16 v26, p10

    .line 458
    .line 459
    :goto_1b
    move-object/from16 v19, v2

    .line 460
    .line 461
    move/from16 v21, v3

    .line 462
    .line 463
    move-wide/from16 v24, v7

    .line 464
    .line 465
    move-object v9, v10

    .line 466
    move-object v10, v4

    .line 467
    :goto_1c
    invoke-interface {v12}, Landroidx/compose/runtime/Composer;->endDefaults()V

    .line 468
    .line 469
    .line 470
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 471
    .line 472
    .line 473
    move-result v0

    .line 474
    if-eqz v0, :cond_27

    .line 475
    .line 476
    const/4 v0, -0x1

    .line 477
    const-string v2, "androidx.compose.material3.Tab (Tab.kt:91)"

    .line 478
    .line 479
    const v3, -0x14e6256d

    .line 480
    .line 481
    .line 482
    invoke-static {v3, v1, v0, v2}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 483
    .line 484
    .line 485
    :cond_27
    if-eqz v10, :cond_28

    .line 486
    .line 487
    new-instance v0, Landroidx/compose/material3/TabKt$Tab$styledText$1$1;

    .line 488
    .line 489
    invoke-direct {v0, v10, v1}, Landroidx/compose/material3/TabKt$Tab$styledText$1$1;-><init>(Lkotlin/jvm/functions/Function2;I)V

    .line 490
    .line 491
    .line 492
    const v2, 0x2a4090bc

    .line 493
    .line 494
    .line 495
    invoke-static {v12, v2, v5, v0}, Landroidx/compose/runtime/internal/ComposableLambdaKt;->composableLambda(Landroidx/compose/runtime/Composer;IZLjava/lang/Object;)Landroidx/compose/runtime/internal/ComposableLambda;

    .line 496
    .line 497
    .line 498
    move-result-object v20

    .line 499
    :cond_28
    move-object/from16 v0, v20

    .line 500
    .line 501
    new-instance v2, Landroidx/compose/material3/TabKt$Tab$2;

    .line 502
    .line 503
    invoke-direct {v2, v0, v9, v1}, Landroidx/compose/material3/TabKt$Tab$2;-><init>(Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;I)V

    .line 504
    .line 505
    .line 506
    const v0, 0x5bd9bbc6

    .line 507
    .line 508
    .line 509
    invoke-static {v12, v0, v5, v2}, Landroidx/compose/runtime/internal/ComposableLambdaKt;->composableLambda(Landroidx/compose/runtime/Composer;IZLjava/lang/Object;)Landroidx/compose/runtime/internal/ComposableLambda;

    .line 510
    .line 511
    .line 512
    move-result-object v18

    .line 513
    const/high16 v0, 0xc00000

    .line 514
    .line 515
    and-int/lit8 v2, v1, 0xe

    .line 516
    .line 517
    or-int/2addr v0, v2

    .line 518
    and-int/lit8 v2, v1, 0x70

    .line 519
    .line 520
    or-int/2addr v0, v2

    .line 521
    and-int/lit16 v2, v1, 0x380

    .line 522
    .line 523
    or-int/2addr v0, v2

    .line 524
    and-int/lit16 v2, v1, 0x1c00

    .line 525
    .line 526
    or-int/2addr v0, v2

    .line 527
    shr-int/lit8 v1, v1, 0x6

    .line 528
    .line 529
    const v2, 0xe000

    .line 530
    .line 531
    .line 532
    and-int/2addr v2, v1

    .line 533
    or-int/2addr v0, v2

    .line 534
    const/high16 v2, 0x70000

    .line 535
    .line 536
    and-int/2addr v2, v1

    .line 537
    or-int/2addr v0, v2

    .line 538
    and-int v1, v1, v16

    .line 539
    .line 540
    or-int v16, v0, v1

    .line 541
    .line 542
    const/16 v17, 0x0

    .line 543
    .line 544
    move/from16 v0, p0

    .line 545
    .line 546
    move-object/from16 v1, p1

    .line 547
    .line 548
    move-object/from16 v2, v19

    .line 549
    .line 550
    move/from16 v3, v21

    .line 551
    .line 552
    move-wide/from16 v4, v22

    .line 553
    .line 554
    move-wide/from16 v6, v24

    .line 555
    .line 556
    move-object/from16 v8, v26

    .line 557
    .line 558
    move-object/from16 v20, v9

    .line 559
    .line 560
    move-object/from16 v9, v18

    .line 561
    .line 562
    move-object/from16 v18, v10

    .line 563
    .line 564
    move-object v10, v12

    .line 565
    move/from16 v11, v16

    .line 566
    .line 567
    move-object/from16 v16, v12

    .line 568
    .line 569
    move/from16 v12, v17

    .line 570
    .line 571
    invoke-static/range {v0 .. v12}, Landroidx/compose/material3/TabKt;->Tab-bogVsAg(ZLkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;ZJJLandroidx/compose/foundation/interaction/MutableInteractionSource;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V

    .line 572
    .line 573
    .line 574
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 575
    .line 576
    .line 577
    move-result v0

    .line 578
    if-eqz v0, :cond_29

    .line 579
    .line 580
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 581
    .line 582
    .line 583
    :cond_29
    move-object/from16 v5, v18

    .line 584
    .line 585
    move-object/from16 v3, v19

    .line 586
    .line 587
    move-object/from16 v6, v20

    .line 588
    .line 589
    move/from16 v4, v21

    .line 590
    .line 591
    move-wide/from16 v7, v22

    .line 592
    .line 593
    move-wide/from16 v9, v24

    .line 594
    .line 595
    move-object/from16 v11, v26

    .line 596
    .line 597
    :goto_1d
    invoke-interface/range {v16 .. v16}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    .line 598
    .line 599
    .line 600
    move-result-object v12

    .line 601
    if-nez v12, :cond_2a

    .line 602
    .line 603
    goto :goto_1e

    .line 604
    :cond_2a
    new-instance v2, Landroidx/compose/material3/TabKt$Tab$3;

    .line 605
    .line 606
    move-object v0, v2

    .line 607
    move/from16 v1, p0

    .line 608
    .line 609
    move-object v14, v2

    .line 610
    move-object/from16 v2, p1

    .line 611
    .line 612
    move-object v13, v12

    .line 613
    move/from16 v12, p12

    .line 614
    .line 615
    move-object v15, v13

    .line 616
    move/from16 v13, p13

    .line 617
    .line 618
    invoke-direct/range {v0 .. v13}, Landroidx/compose/material3/TabKt$Tab$3;-><init>(ZLkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;ZLkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;JJLandroidx/compose/foundation/interaction/MutableInteractionSource;II)V

    .line 619
    .line 620
    .line 621
    invoke-interface {v15, v14}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lkotlin/jvm/functions/Function2;)V

    .line 622
    .line 623
    .line 624
    :goto_1e
    return-void
.end method

.method private static final TabBaselineLayout(Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V
    .locals 16
    .annotation build Landroidx/compose/runtime/Composable;
    .end annotation

    .annotation build Landroidx/compose/runtime/ComposableInferredTarget;
        scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]"
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
            "Landroidx/compose/runtime/Composer;",
            "I)V"
        }
    .end annotation

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    move/from16 v2, p3

    .line 6
    .line 7
    const v3, 0x1ea50644

    .line 8
    .line 9
    .line 10
    move-object/from16 v4, p2

    .line 11
    .line 12
    invoke-interface {v4, v3}, Landroidx/compose/runtime/Composer;->startRestartGroup(I)Landroidx/compose/runtime/Composer;

    .line 13
    .line 14
    .line 15
    move-result-object v4

    .line 16
    and-int/lit8 v5, v2, 0xe

    .line 17
    .line 18
    const/4 v6, 0x2

    .line 19
    if-nez v5, :cond_1

    .line 20
    .line 21
    invoke-interface {v4, v0}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 22
    .line 23
    .line 24
    move-result v5

    .line 25
    if-eqz v5, :cond_0

    .line 26
    .line 27
    const/4 v5, 0x4

    .line 28
    goto :goto_0

    .line 29
    :cond_0
    move v5, v6

    .line 30
    :goto_0
    or-int/2addr v5, v2

    .line 31
    goto :goto_1

    .line 32
    :cond_1
    move v5, v2

    .line 33
    :goto_1
    and-int/lit8 v7, v2, 0x70

    .line 34
    .line 35
    if-nez v7, :cond_3

    .line 36
    .line 37
    invoke-interface {v4, v1}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 38
    .line 39
    .line 40
    move-result v7

    .line 41
    if-eqz v7, :cond_2

    .line 42
    .line 43
    const/16 v7, 0x20

    .line 44
    .line 45
    goto :goto_2

    .line 46
    :cond_2
    const/16 v7, 0x10

    .line 47
    .line 48
    :goto_2
    or-int/2addr v5, v7

    .line 49
    :cond_3
    and-int/lit8 v7, v5, 0x5b

    .line 50
    .line 51
    const/16 v8, 0x12

    .line 52
    .line 53
    if-ne v7, v8, :cond_5

    .line 54
    .line 55
    invoke-interface {v4}, Landroidx/compose/runtime/Composer;->getSkipping()Z

    .line 56
    .line 57
    .line 58
    move-result v7

    .line 59
    if-nez v7, :cond_4

    .line 60
    .line 61
    goto :goto_3

    .line 62
    :cond_4
    invoke-interface {v4}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    .line 63
    .line 64
    .line 65
    goto/16 :goto_7

    .line 66
    .line 67
    :cond_5
    :goto_3
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 68
    .line 69
    .line 70
    move-result v7

    .line 71
    if-eqz v7, :cond_6

    .line 72
    .line 73
    const/4 v7, -0x1

    .line 74
    const-string v8, "androidx.compose.material3.TabBaselineLayout (Tab.kt:302)"

    .line 75
    .line 76
    invoke-static {v3, v5, v7, v8}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 77
    .line 78
    .line 79
    :cond_6
    new-instance v3, Landroidx/compose/material3/TabKt$TabBaselineLayout$2;

    .line 80
    .line 81
    invoke-direct {v3, v0, v1}, Landroidx/compose/material3/TabKt$TabBaselineLayout$2;-><init>(Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;)V

    .line 82
    .line 83
    .line 84
    const v7, -0x4ee9b9da

    .line 85
    .line 86
    .line 87
    invoke-interface {v4, v7}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 88
    .line 89
    .line 90
    sget-object v8, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    .line 91
    .line 92
    invoke-static {}, Landroidx/compose/ui/platform/CompositionLocalsKt;->getLocalDensity()Landroidx/compose/runtime/ProvidableCompositionLocal;

    .line 93
    .line 94
    .line 95
    move-result-object v9

    .line 96
    invoke-interface {v4, v9}, Landroidx/compose/runtime/Composer;->consume(Landroidx/compose/runtime/CompositionLocal;)Ljava/lang/Object;

    .line 97
    .line 98
    .line 99
    move-result-object v9

    .line 100
    check-cast v9, Landroidx/compose/ui/unit/Density;

    .line 101
    .line 102
    invoke-static {}, Landroidx/compose/ui/platform/CompositionLocalsKt;->getLocalLayoutDirection()Landroidx/compose/runtime/ProvidableCompositionLocal;

    .line 103
    .line 104
    .line 105
    move-result-object v10

    .line 106
    invoke-interface {v4, v10}, Landroidx/compose/runtime/Composer;->consume(Landroidx/compose/runtime/CompositionLocal;)Ljava/lang/Object;

    .line 107
    .line 108
    .line 109
    move-result-object v10

    .line 110
    check-cast v10, Landroidx/compose/ui/unit/LayoutDirection;

    .line 111
    .line 112
    invoke-static {}, Landroidx/compose/ui/platform/CompositionLocalsKt;->getLocalViewConfiguration()Landroidx/compose/runtime/ProvidableCompositionLocal;

    .line 113
    .line 114
    .line 115
    move-result-object v11

    .line 116
    invoke-interface {v4, v11}, Landroidx/compose/runtime/Composer;->consume(Landroidx/compose/runtime/CompositionLocal;)Ljava/lang/Object;

    .line 117
    .line 118
    .line 119
    move-result-object v11

    .line 120
    check-cast v11, Landroidx/compose/ui/platform/ViewConfiguration;

    .line 121
    .line 122
    sget-object v12, Landroidx/compose/ui/node/ComposeUiNode;->Companion:Landroidx/compose/ui/node/ComposeUiNode$Companion;

    .line 123
    .line 124
    invoke-virtual {v12}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getConstructor()Lkotlin/jvm/functions/Function0;

    .line 125
    .line 126
    .line 127
    move-result-object v13

    .line 128
    invoke-static {v8}, Landroidx/compose/ui/layout/LayoutKt;->materializerOf(Landroidx/compose/ui/Modifier;)Lkotlin/jvm/functions/Function3;

    .line 129
    .line 130
    .line 131
    move-result-object v14

    .line 132
    invoke-interface {v4}, Landroidx/compose/runtime/Composer;->getApplier()Landroidx/compose/runtime/Applier;

    .line 133
    .line 134
    .line 135
    move-result-object v15

    .line 136
    instance-of v15, v15, Landroidx/compose/runtime/Applier;

    .line 137
    .line 138
    if-nez v15, :cond_7

    .line 139
    .line 140
    invoke-static {}, Landroidx/compose/runtime/ComposablesKt;->invalidApplier()V

    .line 141
    .line 142
    .line 143
    :cond_7
    invoke-interface {v4}, Landroidx/compose/runtime/Composer;->startReusableNode()V

    .line 144
    .line 145
    .line 146
    invoke-interface {v4}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 147
    .line 148
    .line 149
    move-result v15

    .line 150
    if-eqz v15, :cond_8

    .line 151
    .line 152
    invoke-interface {v4, v13}, Landroidx/compose/runtime/Composer;->createNode(Lkotlin/jvm/functions/Function0;)V

    .line 153
    .line 154
    .line 155
    goto :goto_4

    .line 156
    :cond_8
    invoke-interface {v4}, Landroidx/compose/runtime/Composer;->useNode()V

    .line 157
    .line 158
    .line 159
    :goto_4
    invoke-interface {v4}, Landroidx/compose/runtime/Composer;->disableReusing()V

    .line 160
    .line 161
    .line 162
    invoke-static {v4}, Landroidx/compose/runtime/Updater;->constructor-impl(Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;

    .line 163
    .line 164
    .line 165
    move-result-object v13

    .line 166
    invoke-virtual {v12}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetMeasurePolicy()Lkotlin/jvm/functions/Function2;

    .line 167
    .line 168
    .line 169
    move-result-object v15

    .line 170
    invoke-static {v13, v3, v15}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 171
    .line 172
    .line 173
    invoke-virtual {v12}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetDensity()Lkotlin/jvm/functions/Function2;

    .line 174
    .line 175
    .line 176
    move-result-object v3

    .line 177
    invoke-static {v13, v9, v3}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 178
    .line 179
    .line 180
    invoke-virtual {v12}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetLayoutDirection()Lkotlin/jvm/functions/Function2;

    .line 181
    .line 182
    .line 183
    move-result-object v3

    .line 184
    invoke-static {v13, v10, v3}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 185
    .line 186
    .line 187
    invoke-virtual {v12}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetViewConfiguration()Lkotlin/jvm/functions/Function2;

    .line 188
    .line 189
    .line 190
    move-result-object v3

    .line 191
    invoke-static {v13, v11, v3}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 192
    .line 193
    .line 194
    invoke-interface {v4}, Landroidx/compose/runtime/Composer;->enableReusing()V

    .line 195
    .line 196
    .line 197
    invoke-static {v4}, Landroidx/compose/runtime/SkippableUpdater;->constructor-impl(Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;

    .line 198
    .line 199
    .line 200
    move-result-object v3

    .line 201
    invoke-static {v3}, Landroidx/compose/runtime/SkippableUpdater;->box-impl(Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/SkippableUpdater;

    .line 202
    .line 203
    .line 204
    move-result-object v3

    .line 205
    const/4 v9, 0x0

    .line 206
    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 207
    .line 208
    .line 209
    move-result-object v10

    .line 210
    invoke-interface {v14, v3, v4, v10}, Lkotlin/jvm/functions/Function3;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 211
    .line 212
    .line 213
    const v3, 0x7ab4aae9

    .line 214
    .line 215
    .line 216
    invoke-interface {v4, v3}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 217
    .line 218
    .line 219
    const v10, 0x583e353b

    .line 220
    .line 221
    .line 222
    invoke-interface {v4, v10}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 223
    .line 224
    .line 225
    const v10, 0x2af74f99

    .line 226
    .line 227
    .line 228
    invoke-interface {v4, v10}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 229
    .line 230
    .line 231
    const v11, 0x2bb5b5d7

    .line 232
    .line 233
    .line 234
    if-eqz v0, :cond_b

    .line 235
    .line 236
    const-string/jumbo v13, "text"

    .line 237
    .line 238
    .line 239
    invoke-static {v8, v13}, Landroidx/compose/ui/layout/LayoutIdKt;->layoutId(Landroidx/compose/ui/Modifier;Ljava/lang/Object;)Landroidx/compose/ui/Modifier;

    .line 240
    .line 241
    .line 242
    move-result-object v13

    .line 243
    sget v14, Landroidx/compose/material3/TabKt;->HorizontalTextPadding:F

    .line 244
    .line 245
    const/4 v15, 0x0

    .line 246
    const/4 v10, 0x0

    .line 247
    invoke-static {v13, v14, v15, v6, v10}, Landroidx/compose/foundation/layout/PaddingKt;->padding-VpY3zN4$default(Landroidx/compose/ui/Modifier;FFILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    .line 248
    .line 249
    .line 250
    move-result-object v6

    .line 251
    invoke-interface {v4, v11}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 252
    .line 253
    .line 254
    sget-object v10, Landroidx/compose/ui/Alignment;->Companion:Landroidx/compose/ui/Alignment$Companion;

    .line 255
    .line 256
    invoke-virtual {v10}, Landroidx/compose/ui/Alignment$Companion;->getTopStart()Landroidx/compose/ui/Alignment;

    .line 257
    .line 258
    .line 259
    move-result-object v10

    .line 260
    invoke-static {v10, v9, v4, v9}, Landroidx/compose/foundation/layout/BoxKt;->rememberBoxMeasurePolicy(Landroidx/compose/ui/Alignment;ZLandroidx/compose/runtime/Composer;I)Landroidx/compose/ui/layout/MeasurePolicy;

    .line 261
    .line 262
    .line 263
    move-result-object v10

    .line 264
    invoke-interface {v4, v7}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 265
    .line 266
    .line 267
    invoke-static {}, Landroidx/compose/ui/platform/CompositionLocalsKt;->getLocalDensity()Landroidx/compose/runtime/ProvidableCompositionLocal;

    .line 268
    .line 269
    .line 270
    move-result-object v13

    .line 271
    invoke-interface {v4, v13}, Landroidx/compose/runtime/Composer;->consume(Landroidx/compose/runtime/CompositionLocal;)Ljava/lang/Object;

    .line 272
    .line 273
    .line 274
    move-result-object v13

    .line 275
    check-cast v13, Landroidx/compose/ui/unit/Density;

    .line 276
    .line 277
    invoke-static {}, Landroidx/compose/ui/platform/CompositionLocalsKt;->getLocalLayoutDirection()Landroidx/compose/runtime/ProvidableCompositionLocal;

    .line 278
    .line 279
    .line 280
    move-result-object v14

    .line 281
    invoke-interface {v4, v14}, Landroidx/compose/runtime/Composer;->consume(Landroidx/compose/runtime/CompositionLocal;)Ljava/lang/Object;

    .line 282
    .line 283
    .line 284
    move-result-object v14

    .line 285
    check-cast v14, Landroidx/compose/ui/unit/LayoutDirection;

    .line 286
    .line 287
    invoke-static {}, Landroidx/compose/ui/platform/CompositionLocalsKt;->getLocalViewConfiguration()Landroidx/compose/runtime/ProvidableCompositionLocal;

    .line 288
    .line 289
    .line 290
    move-result-object v15

    .line 291
    invoke-interface {v4, v15}, Landroidx/compose/runtime/Composer;->consume(Landroidx/compose/runtime/CompositionLocal;)Ljava/lang/Object;

    .line 292
    .line 293
    .line 294
    move-result-object v15

    .line 295
    check-cast v15, Landroidx/compose/ui/platform/ViewConfiguration;

    .line 296
    .line 297
    invoke-virtual {v12}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getConstructor()Lkotlin/jvm/functions/Function0;

    .line 298
    .line 299
    .line 300
    move-result-object v7

    .line 301
    invoke-static {v6}, Landroidx/compose/ui/layout/LayoutKt;->materializerOf(Landroidx/compose/ui/Modifier;)Lkotlin/jvm/functions/Function3;

    .line 302
    .line 303
    .line 304
    move-result-object v6

    .line 305
    invoke-interface {v4}, Landroidx/compose/runtime/Composer;->getApplier()Landroidx/compose/runtime/Applier;

    .line 306
    .line 307
    .line 308
    move-result-object v11

    .line 309
    instance-of v11, v11, Landroidx/compose/runtime/Applier;

    .line 310
    .line 311
    if-nez v11, :cond_9

    .line 312
    .line 313
    invoke-static {}, Landroidx/compose/runtime/ComposablesKt;->invalidApplier()V

    .line 314
    .line 315
    .line 316
    :cond_9
    invoke-interface {v4}, Landroidx/compose/runtime/Composer;->startReusableNode()V

    .line 317
    .line 318
    .line 319
    invoke-interface {v4}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 320
    .line 321
    .line 322
    move-result v11

    .line 323
    if-eqz v11, :cond_a

    .line 324
    .line 325
    invoke-interface {v4, v7}, Landroidx/compose/runtime/Composer;->createNode(Lkotlin/jvm/functions/Function0;)V

    .line 326
    .line 327
    .line 328
    goto :goto_5

    .line 329
    :cond_a
    invoke-interface {v4}, Landroidx/compose/runtime/Composer;->useNode()V

    .line 330
    .line 331
    .line 332
    :goto_5
    invoke-interface {v4}, Landroidx/compose/runtime/Composer;->disableReusing()V

    .line 333
    .line 334
    .line 335
    invoke-static {v4}, Landroidx/compose/runtime/Updater;->constructor-impl(Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;

    .line 336
    .line 337
    .line 338
    move-result-object v7

    .line 339
    invoke-virtual {v12}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetMeasurePolicy()Lkotlin/jvm/functions/Function2;

    .line 340
    .line 341
    .line 342
    move-result-object v11

    .line 343
    invoke-static {v7, v10, v11}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 344
    .line 345
    .line 346
    invoke-virtual {v12}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetDensity()Lkotlin/jvm/functions/Function2;

    .line 347
    .line 348
    .line 349
    move-result-object v10

    .line 350
    invoke-static {v7, v13, v10}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 351
    .line 352
    .line 353
    invoke-virtual {v12}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetLayoutDirection()Lkotlin/jvm/functions/Function2;

    .line 354
    .line 355
    .line 356
    move-result-object v10

    .line 357
    invoke-static {v7, v14, v10}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 358
    .line 359
    .line 360
    invoke-virtual {v12}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetViewConfiguration()Lkotlin/jvm/functions/Function2;

    .line 361
    .line 362
    .line 363
    move-result-object v10

    .line 364
    invoke-static {v7, v15, v10}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 365
    .line 366
    .line 367
    invoke-interface {v4}, Landroidx/compose/runtime/Composer;->enableReusing()V

    .line 368
    .line 369
    .line 370
    invoke-static {v4}, Landroidx/compose/runtime/SkippableUpdater;->constructor-impl(Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;

    .line 371
    .line 372
    .line 373
    move-result-object v7

    .line 374
    invoke-static {v7}, Landroidx/compose/runtime/SkippableUpdater;->box-impl(Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/SkippableUpdater;

    .line 375
    .line 376
    .line 377
    move-result-object v7

    .line 378
    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 379
    .line 380
    .line 381
    move-result-object v10

    .line 382
    invoke-interface {v6, v7, v4, v10}, Lkotlin/jvm/functions/Function3;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 383
    .line 384
    .line 385
    invoke-interface {v4, v3}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 386
    .line 387
    .line 388
    const v6, -0x7f65a980

    .line 389
    .line 390
    .line 391
    invoke-interface {v4, v6}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 392
    .line 393
    .line 394
    sget-object v6, Landroidx/compose/foundation/layout/BoxScopeInstance;->INSTANCE:Landroidx/compose/foundation/layout/BoxScopeInstance;

    .line 395
    .line 396
    const v6, -0x3879eb64

    .line 397
    .line 398
    .line 399
    invoke-interface {v4, v6}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 400
    .line 401
    .line 402
    and-int/lit8 v6, v5, 0xe

    .line 403
    .line 404
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 405
    .line 406
    .line 407
    move-result-object v6

    .line 408
    invoke-interface {v0, v4, v6}, Lkotlin/jvm/functions/Function2;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 409
    .line 410
    .line 411
    invoke-interface {v4}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 412
    .line 413
    .line 414
    invoke-interface {v4}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 415
    .line 416
    .line 417
    invoke-interface {v4}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 418
    .line 419
    .line 420
    invoke-interface {v4}, Landroidx/compose/runtime/Composer;->endNode()V

    .line 421
    .line 422
    .line 423
    invoke-interface {v4}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 424
    .line 425
    .line 426
    invoke-interface {v4}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 427
    .line 428
    .line 429
    :cond_b
    invoke-interface {v4}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 430
    .line 431
    .line 432
    if-eqz v1, :cond_e

    .line 433
    .line 434
    const-string v6, "icon"

    .line 435
    .line 436
    invoke-static {v8, v6}, Landroidx/compose/ui/layout/LayoutIdKt;->layoutId(Landroidx/compose/ui/Modifier;Ljava/lang/Object;)Landroidx/compose/ui/Modifier;

    .line 437
    .line 438
    .line 439
    move-result-object v6

    .line 440
    const v7, 0x2bb5b5d7

    .line 441
    .line 442
    .line 443
    invoke-interface {v4, v7}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 444
    .line 445
    .line 446
    sget-object v7, Landroidx/compose/ui/Alignment;->Companion:Landroidx/compose/ui/Alignment$Companion;

    .line 447
    .line 448
    invoke-virtual {v7}, Landroidx/compose/ui/Alignment$Companion;->getTopStart()Landroidx/compose/ui/Alignment;

    .line 449
    .line 450
    .line 451
    move-result-object v7

    .line 452
    invoke-static {v7, v9, v4, v9}, Landroidx/compose/foundation/layout/BoxKt;->rememberBoxMeasurePolicy(Landroidx/compose/ui/Alignment;ZLandroidx/compose/runtime/Composer;I)Landroidx/compose/ui/layout/MeasurePolicy;

    .line 453
    .line 454
    .line 455
    move-result-object v7

    .line 456
    const v8, -0x4ee9b9da

    .line 457
    .line 458
    .line 459
    invoke-interface {v4, v8}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 460
    .line 461
    .line 462
    invoke-static {}, Landroidx/compose/ui/platform/CompositionLocalsKt;->getLocalDensity()Landroidx/compose/runtime/ProvidableCompositionLocal;

    .line 463
    .line 464
    .line 465
    move-result-object v8

    .line 466
    invoke-interface {v4, v8}, Landroidx/compose/runtime/Composer;->consume(Landroidx/compose/runtime/CompositionLocal;)Ljava/lang/Object;

    .line 467
    .line 468
    .line 469
    move-result-object v8

    .line 470
    check-cast v8, Landroidx/compose/ui/unit/Density;

    .line 471
    .line 472
    invoke-static {}, Landroidx/compose/ui/platform/CompositionLocalsKt;->getLocalLayoutDirection()Landroidx/compose/runtime/ProvidableCompositionLocal;

    .line 473
    .line 474
    .line 475
    move-result-object v10

    .line 476
    invoke-interface {v4, v10}, Landroidx/compose/runtime/Composer;->consume(Landroidx/compose/runtime/CompositionLocal;)Ljava/lang/Object;

    .line 477
    .line 478
    .line 479
    move-result-object v10

    .line 480
    check-cast v10, Landroidx/compose/ui/unit/LayoutDirection;

    .line 481
    .line 482
    invoke-static {}, Landroidx/compose/ui/platform/CompositionLocalsKt;->getLocalViewConfiguration()Landroidx/compose/runtime/ProvidableCompositionLocal;

    .line 483
    .line 484
    .line 485
    move-result-object v11

    .line 486
    invoke-interface {v4, v11}, Landroidx/compose/runtime/Composer;->consume(Landroidx/compose/runtime/CompositionLocal;)Ljava/lang/Object;

    .line 487
    .line 488
    .line 489
    move-result-object v11

    .line 490
    check-cast v11, Landroidx/compose/ui/platform/ViewConfiguration;

    .line 491
    .line 492
    invoke-virtual {v12}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getConstructor()Lkotlin/jvm/functions/Function0;

    .line 493
    .line 494
    .line 495
    move-result-object v13

    .line 496
    invoke-static {v6}, Landroidx/compose/ui/layout/LayoutKt;->materializerOf(Landroidx/compose/ui/Modifier;)Lkotlin/jvm/functions/Function3;

    .line 497
    .line 498
    .line 499
    move-result-object v6

    .line 500
    invoke-interface {v4}, Landroidx/compose/runtime/Composer;->getApplier()Landroidx/compose/runtime/Applier;

    .line 501
    .line 502
    .line 503
    move-result-object v14

    .line 504
    instance-of v14, v14, Landroidx/compose/runtime/Applier;

    .line 505
    .line 506
    if-nez v14, :cond_c

    .line 507
    .line 508
    invoke-static {}, Landroidx/compose/runtime/ComposablesKt;->invalidApplier()V

    .line 509
    .line 510
    .line 511
    :cond_c
    invoke-interface {v4}, Landroidx/compose/runtime/Composer;->startReusableNode()V

    .line 512
    .line 513
    .line 514
    invoke-interface {v4}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 515
    .line 516
    .line 517
    move-result v14

    .line 518
    if-eqz v14, :cond_d

    .line 519
    .line 520
    invoke-interface {v4, v13}, Landroidx/compose/runtime/Composer;->createNode(Lkotlin/jvm/functions/Function0;)V

    .line 521
    .line 522
    .line 523
    goto :goto_6

    .line 524
    :cond_d
    invoke-interface {v4}, Landroidx/compose/runtime/Composer;->useNode()V

    .line 525
    .line 526
    .line 527
    :goto_6
    invoke-interface {v4}, Landroidx/compose/runtime/Composer;->disableReusing()V

    .line 528
    .line 529
    .line 530
    invoke-static {v4}, Landroidx/compose/runtime/Updater;->constructor-impl(Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;

    .line 531
    .line 532
    .line 533
    move-result-object v13

    .line 534
    invoke-virtual {v12}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetMeasurePolicy()Lkotlin/jvm/functions/Function2;

    .line 535
    .line 536
    .line 537
    move-result-object v14

    .line 538
    invoke-static {v13, v7, v14}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 539
    .line 540
    .line 541
    invoke-virtual {v12}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetDensity()Lkotlin/jvm/functions/Function2;

    .line 542
    .line 543
    .line 544
    move-result-object v7

    .line 545
    invoke-static {v13, v8, v7}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 546
    .line 547
    .line 548
    invoke-virtual {v12}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetLayoutDirection()Lkotlin/jvm/functions/Function2;

    .line 549
    .line 550
    .line 551
    move-result-object v7

    .line 552
    invoke-static {v13, v10, v7}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 553
    .line 554
    .line 555
    invoke-virtual {v12}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetViewConfiguration()Lkotlin/jvm/functions/Function2;

    .line 556
    .line 557
    .line 558
    move-result-object v7

    .line 559
    invoke-static {v13, v11, v7}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 560
    .line 561
    .line 562
    invoke-interface {v4}, Landroidx/compose/runtime/Composer;->enableReusing()V

    .line 563
    .line 564
    .line 565
    invoke-static {v4}, Landroidx/compose/runtime/SkippableUpdater;->constructor-impl(Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;

    .line 566
    .line 567
    .line 568
    move-result-object v7

    .line 569
    invoke-static {v7}, Landroidx/compose/runtime/SkippableUpdater;->box-impl(Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/SkippableUpdater;

    .line 570
    .line 571
    .line 572
    move-result-object v7

    .line 573
    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 574
    .line 575
    .line 576
    move-result-object v8

    .line 577
    invoke-interface {v6, v7, v4, v8}, Lkotlin/jvm/functions/Function3;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 578
    .line 579
    .line 580
    invoke-interface {v4, v3}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 581
    .line 582
    .line 583
    const v3, -0x7f65a980

    .line 584
    .line 585
    .line 586
    invoke-interface {v4, v3}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 587
    .line 588
    .line 589
    sget-object v3, Landroidx/compose/foundation/layout/BoxScopeInstance;->INSTANCE:Landroidx/compose/foundation/layout/BoxScopeInstance;

    .line 590
    .line 591
    const v3, -0x7640f1ed

    .line 592
    .line 593
    .line 594
    invoke-interface {v4, v3}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 595
    .line 596
    .line 597
    shr-int/lit8 v3, v5, 0x3

    .line 598
    .line 599
    and-int/lit8 v3, v3, 0xe

    .line 600
    .line 601
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 602
    .line 603
    .line 604
    move-result-object v3

    .line 605
    invoke-interface {v1, v4, v3}, Lkotlin/jvm/functions/Function2;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 606
    .line 607
    .line 608
    invoke-interface {v4}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 609
    .line 610
    .line 611
    invoke-interface {v4}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 612
    .line 613
    .line 614
    invoke-interface {v4}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 615
    .line 616
    .line 617
    invoke-interface {v4}, Landroidx/compose/runtime/Composer;->endNode()V

    .line 618
    .line 619
    .line 620
    invoke-interface {v4}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 621
    .line 622
    .line 623
    invoke-interface {v4}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 624
    .line 625
    .line 626
    :cond_e
    invoke-interface {v4}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 627
    .line 628
    .line 629
    invoke-interface {v4}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 630
    .line 631
    .line 632
    invoke-interface {v4}, Landroidx/compose/runtime/Composer;->endNode()V

    .line 633
    .line 634
    .line 635
    invoke-interface {v4}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 636
    .line 637
    .line 638
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 639
    .line 640
    .line 641
    move-result v3

    .line 642
    if-eqz v3, :cond_f

    .line 643
    .line 644
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 645
    .line 646
    .line 647
    :cond_f
    :goto_7
    invoke-interface {v4}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    .line 648
    .line 649
    .line 650
    move-result-object v3

    .line 651
    if-nez v3, :cond_10

    .line 652
    .line 653
    goto :goto_8

    .line 654
    :cond_10
    new-instance v4, Landroidx/compose/material3/TabKt$TabBaselineLayout$3;

    .line 655
    .line 656
    invoke-direct {v4, v0, v1, v2}, Landroidx/compose/material3/TabKt$TabBaselineLayout$3;-><init>(Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;I)V

    .line 657
    .line 658
    .line 659
    invoke-interface {v3, v4}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lkotlin/jvm/functions/Function2;)V

    .line 660
    .line 661
    .line 662
    :goto_8
    return-void
.end method

.method private static final TabTransition-Klgx-Pg(JJZLkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V
    .locals 18
    .annotation build Landroidx/compose/runtime/Composable;
    .end annotation

    .annotation build Landroidx/compose/runtime/ComposableInferredTarget;
        scheme = "[0[0]]"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(JJZ",
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
    move-object/from16 v6, p5

    .line 2
    .line 3
    move/from16 v7, p7

    .line 4
    .line 5
    const v0, 0x2bda6088

    .line 6
    .line 7
    .line 8
    move-object/from16 v1, p6

    .line 9
    .line 10
    invoke-interface {v1, v0}, Landroidx/compose/runtime/Composer;->startRestartGroup(I)Landroidx/compose/runtime/Composer;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    and-int/lit8 v2, v7, 0xe

    .line 15
    .line 16
    const/4 v3, 0x2

    .line 17
    move-wide/from16 v4, p0

    .line 18
    .line 19
    if-nez v2, :cond_1

    .line 20
    .line 21
    invoke-interface {v1, v4, v5}, Landroidx/compose/runtime/Composer;->changed(J)Z

    .line 22
    .line 23
    .line 24
    move-result v2

    .line 25
    if-eqz v2, :cond_0

    .line 26
    .line 27
    const/4 v2, 0x4

    .line 28
    goto :goto_0

    .line 29
    :cond_0
    move v2, v3

    .line 30
    :goto_0
    or-int/2addr v2, v7

    .line 31
    goto :goto_1

    .line 32
    :cond_1
    move v2, v7

    .line 33
    :goto_1
    and-int/lit8 v8, v7, 0x70

    .line 34
    .line 35
    move-wide/from16 v14, p2

    .line 36
    .line 37
    if-nez v8, :cond_3

    .line 38
    .line 39
    invoke-interface {v1, v14, v15}, Landroidx/compose/runtime/Composer;->changed(J)Z

    .line 40
    .line 41
    .line 42
    move-result v8

    .line 43
    if-eqz v8, :cond_2

    .line 44
    .line 45
    const/16 v8, 0x20

    .line 46
    .line 47
    goto :goto_2

    .line 48
    :cond_2
    const/16 v8, 0x10

    .line 49
    .line 50
    :goto_2
    or-int/2addr v2, v8

    .line 51
    :cond_3
    and-int/lit16 v8, v7, 0x380

    .line 52
    .line 53
    move/from16 v13, p4

    .line 54
    .line 55
    if-nez v8, :cond_5

    .line 56
    .line 57
    invoke-interface {v1, v13}, Landroidx/compose/runtime/Composer;->changed(Z)Z

    .line 58
    .line 59
    .line 60
    move-result v8

    .line 61
    if-eqz v8, :cond_4

    .line 62
    .line 63
    const/16 v8, 0x100

    .line 64
    .line 65
    goto :goto_3

    .line 66
    :cond_4
    const/16 v8, 0x80

    .line 67
    .line 68
    :goto_3
    or-int/2addr v2, v8

    .line 69
    :cond_5
    and-int/lit16 v8, v7, 0x1c00

    .line 70
    .line 71
    if-nez v8, :cond_7

    .line 72
    .line 73
    invoke-interface {v1, v6}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 74
    .line 75
    .line 76
    move-result v8

    .line 77
    if-eqz v8, :cond_6

    .line 78
    .line 79
    const/16 v8, 0x800

    .line 80
    .line 81
    goto :goto_4

    .line 82
    :cond_6
    const/16 v8, 0x400

    .line 83
    .line 84
    :goto_4
    or-int/2addr v2, v8

    .line 85
    :cond_7
    and-int/lit16 v8, v2, 0x16db

    .line 86
    .line 87
    const/16 v9, 0x492

    .line 88
    .line 89
    if-ne v8, v9, :cond_9

    .line 90
    .line 91
    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->getSkipping()Z

    .line 92
    .line 93
    .line 94
    move-result v8

    .line 95
    if-nez v8, :cond_8

    .line 96
    .line 97
    goto :goto_5

    .line 98
    :cond_8
    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    .line 99
    .line 100
    .line 101
    goto/16 :goto_9

    .line 102
    .line 103
    :cond_9
    :goto_5
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 104
    .line 105
    .line 106
    move-result v8

    .line 107
    const/4 v9, -0x1

    .line 108
    if-eqz v8, :cond_a

    .line 109
    .line 110
    const-string v8, "androidx.compose.material3.TabTransition (Tab.kt:265)"

    .line 111
    .line 112
    invoke-static {v0, v2, v9, v8}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 113
    .line 114
    .line 115
    :cond_a
    invoke-static/range {p4 .. p4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 116
    .line 117
    .line 118
    move-result-object v0

    .line 119
    shr-int/lit8 v2, v2, 0x6

    .line 120
    .line 121
    and-int/lit8 v8, v2, 0xe

    .line 122
    .line 123
    const/4 v10, 0x0

    .line 124
    invoke-static {v0, v10, v1, v8, v3}, Landroidx/compose/animation/core/TransitionKt;->updateTransition(Ljava/lang/Object;Ljava/lang/String;Landroidx/compose/runtime/Composer;II)Landroidx/compose/animation/core/Transition;

    .line 125
    .line 126
    .line 127
    move-result-object v8

    .line 128
    sget-object v0, Landroidx/compose/material3/TabKt$TabTransition$color$2;->INSTANCE:Landroidx/compose/material3/TabKt$TabTransition$color$2;

    .line 129
    .line 130
    const v3, -0x57267098

    .line 131
    .line 132
    .line 133
    invoke-interface {v1, v3}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 134
    .line 135
    .line 136
    const-string v3, "ColorAnimation"

    .line 137
    .line 138
    invoke-virtual {v8}, Landroidx/compose/animation/core/Transition;->getTargetState()Ljava/lang/Object;

    .line 139
    .line 140
    .line 141
    move-result-object v10

    .line 142
    check-cast v10, Ljava/lang/Boolean;

    .line 143
    .line 144
    invoke-virtual {v10}, Ljava/lang/Boolean;->booleanValue()Z

    .line 145
    .line 146
    .line 147
    move-result v10

    .line 148
    const v11, -0x770830db

    .line 149
    .line 150
    .line 151
    invoke-interface {v1, v11}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 152
    .line 153
    .line 154
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 155
    .line 156
    .line 157
    move-result v12

    .line 158
    const-string v9, "androidx.compose.material3.TabTransition.<anonymous> (Tab.kt:287)"

    .line 159
    .line 160
    const/4 v15, 0x0

    .line 161
    if-eqz v12, :cond_b

    .line 162
    .line 163
    const/4 v12, -0x1

    .line 164
    invoke-static {v11, v15, v12, v9}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 165
    .line 166
    .line 167
    :cond_b
    if-eqz v10, :cond_c

    .line 168
    .line 169
    move-wide/from16 v16, v4

    .line 170
    .line 171
    goto :goto_6

    .line 172
    :cond_c
    move-wide/from16 v16, p2

    .line 173
    .line 174
    :goto_6
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 175
    .line 176
    .line 177
    move-result v10

    .line 178
    if-eqz v10, :cond_d

    .line 179
    .line 180
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 181
    .line 182
    .line 183
    :cond_d
    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 184
    .line 185
    .line 186
    invoke-static/range {v16 .. v17}, Landroidx/compose/ui/graphics/Color;->getColorSpace-impl(J)Landroidx/compose/ui/graphics/colorspace/ColorSpace;

    .line 187
    .line 188
    .line 189
    move-result-object v10

    .line 190
    const v12, -0x384212

    .line 191
    .line 192
    .line 193
    invoke-interface {v1, v12}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 194
    .line 195
    .line 196
    invoke-interface {v1, v10}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 197
    .line 198
    .line 199
    move-result v12

    .line 200
    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 201
    .line 202
    .line 203
    move-result-object v14

    .line 204
    if-nez v12, :cond_e

    .line 205
    .line 206
    sget-object v12, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    .line 207
    .line 208
    invoke-virtual {v12}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    .line 209
    .line 210
    .line 211
    move-result-object v12

    .line 212
    if-ne v14, v12, :cond_f

    .line 213
    .line 214
    :cond_e
    sget-object v12, Landroidx/compose/ui/graphics/Color;->Companion:Landroidx/compose/ui/graphics/Color$Companion;

    .line 215
    .line 216
    invoke-static {v12}, Landroidx/compose/animation/ColorVectorConverterKt;->getVectorConverter(Landroidx/compose/ui/graphics/Color$Companion;)Lkotlin/jvm/functions/Function1;

    .line 217
    .line 218
    .line 219
    move-result-object v12

    .line 220
    invoke-interface {v12, v10}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 221
    .line 222
    .line 223
    move-result-object v10

    .line 224
    move-object v14, v10

    .line 225
    check-cast v14, Landroidx/compose/animation/core/TwoWayConverter;

    .line 226
    .line 227
    invoke-interface {v1, v14}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 228
    .line 229
    .line 230
    :cond_f
    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 231
    .line 232
    .line 233
    move-object v12, v14

    .line 234
    check-cast v12, Landroidx/compose/animation/core/TwoWayConverter;

    .line 235
    .line 236
    const v10, 0x6e220c08

    .line 237
    .line 238
    .line 239
    invoke-interface {v1, v10}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 240
    .line 241
    .line 242
    invoke-virtual {v8}, Landroidx/compose/animation/core/Transition;->getCurrentState()Ljava/lang/Object;

    .line 243
    .line 244
    .line 245
    move-result-object v10

    .line 246
    check-cast v10, Ljava/lang/Boolean;

    .line 247
    .line 248
    invoke-virtual {v10}, Ljava/lang/Boolean;->booleanValue()Z

    .line 249
    .line 250
    .line 251
    move-result v10

    .line 252
    invoke-interface {v1, v11}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 253
    .line 254
    .line 255
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 256
    .line 257
    .line 258
    move-result v14

    .line 259
    if-eqz v14, :cond_10

    .line 260
    .line 261
    const/4 v14, -0x1

    .line 262
    invoke-static {v11, v15, v14, v9}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 263
    .line 264
    .line 265
    :cond_10
    if-eqz v10, :cond_11

    .line 266
    .line 267
    move-wide/from16 v16, v4

    .line 268
    .line 269
    goto :goto_7

    .line 270
    :cond_11
    move-wide/from16 v16, p2

    .line 271
    .line 272
    :goto_7
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 273
    .line 274
    .line 275
    move-result v10

    .line 276
    if-eqz v10, :cond_12

    .line 277
    .line 278
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 279
    .line 280
    .line 281
    :cond_12
    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 282
    .line 283
    .line 284
    invoke-static/range {v16 .. v17}, Landroidx/compose/ui/graphics/Color;->box-impl(J)Landroidx/compose/ui/graphics/Color;

    .line 285
    .line 286
    .line 287
    move-result-object v10

    .line 288
    invoke-virtual {v8}, Landroidx/compose/animation/core/Transition;->getTargetState()Ljava/lang/Object;

    .line 289
    .line 290
    .line 291
    move-result-object v14

    .line 292
    check-cast v14, Ljava/lang/Boolean;

    .line 293
    .line 294
    invoke-virtual {v14}, Ljava/lang/Boolean;->booleanValue()Z

    .line 295
    .line 296
    .line 297
    move-result v14

    .line 298
    invoke-interface {v1, v11}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 299
    .line 300
    .line 301
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 302
    .line 303
    .line 304
    move-result v16

    .line 305
    if-eqz v16, :cond_13

    .line 306
    .line 307
    const/4 v4, -0x1

    .line 308
    invoke-static {v11, v15, v4, v9}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 309
    .line 310
    .line 311
    :cond_13
    if-eqz v14, :cond_14

    .line 312
    .line 313
    move-wide/from16 v4, p0

    .line 314
    .line 315
    goto :goto_8

    .line 316
    :cond_14
    move-wide/from16 v4, p2

    .line 317
    .line 318
    :goto_8
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 319
    .line 320
    .line 321
    move-result v9

    .line 322
    if-eqz v9, :cond_15

    .line 323
    .line 324
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 325
    .line 326
    .line 327
    :cond_15
    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 328
    .line 329
    .line 330
    invoke-static {v4, v5}, Landroidx/compose/ui/graphics/Color;->box-impl(J)Landroidx/compose/ui/graphics/Color;

    .line 331
    .line 332
    .line 333
    move-result-object v4

    .line 334
    invoke-virtual {v8}, Landroidx/compose/animation/core/Transition;->getSegment()Landroidx/compose/animation/core/Transition$Segment;

    .line 335
    .line 336
    .line 337
    move-result-object v5

    .line 338
    invoke-static {v15}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 339
    .line 340
    .line 341
    move-result-object v9

    .line 342
    invoke-interface {v0, v5, v1, v9}, Lkotlin/jvm/functions/Function3;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 343
    .line 344
    .line 345
    move-result-object v0

    .line 346
    move-object v11, v0

    .line 347
    check-cast v11, Landroidx/compose/animation/core/FiniteAnimationSpec;

    .line 348
    .line 349
    const v0, 0x8000

    .line 350
    .line 351
    .line 352
    move-object v9, v10

    .line 353
    move-object v10, v4

    .line 354
    move-object v13, v3

    .line 355
    move-object v14, v1

    .line 356
    move v3, v15

    .line 357
    move v15, v0

    .line 358
    invoke-static/range {v8 .. v15}, Landroidx/compose/animation/core/TransitionKt;->createTransitionAnimation(Landroidx/compose/animation/core/Transition;Ljava/lang/Object;Ljava/lang/Object;Landroidx/compose/animation/core/FiniteAnimationSpec;Landroidx/compose/animation/core/TwoWayConverter;Ljava/lang/String;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;

    .line 359
    .line 360
    .line 361
    move-result-object v0

    .line 362
    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 363
    .line 364
    .line 365
    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 366
    .line 367
    .line 368
    const/4 v4, 0x1

    .line 369
    new-array v4, v4, [Landroidx/compose/runtime/ProvidedValue;

    .line 370
    .line 371
    invoke-static {}, Landroidx/compose/material3/ContentColorKt;->getLocalContentColor()Landroidx/compose/runtime/ProvidableCompositionLocal;

    .line 372
    .line 373
    .line 374
    move-result-object v5

    .line 375
    invoke-static {v0}, Landroidx/compose/material3/TabKt;->TabTransition_Klgx_Pg$lambda-5(Landroidx/compose/runtime/State;)J

    .line 376
    .line 377
    .line 378
    move-result-wide v8

    .line 379
    invoke-static {v8, v9}, Landroidx/compose/ui/graphics/Color;->box-impl(J)Landroidx/compose/ui/graphics/Color;

    .line 380
    .line 381
    .line 382
    move-result-object v0

    .line 383
    invoke-virtual {v5, v0}, Landroidx/compose/runtime/ProvidableCompositionLocal;->provides(Ljava/lang/Object;)Landroidx/compose/runtime/ProvidedValue;

    .line 384
    .line 385
    .line 386
    move-result-object v0

    .line 387
    aput-object v0, v4, v3

    .line 388
    .line 389
    and-int/lit8 v0, v2, 0x70

    .line 390
    .line 391
    or-int/lit8 v0, v0, 0x8

    .line 392
    .line 393
    invoke-static {v4, v6, v1, v0}, Landroidx/compose/runtime/CompositionLocalKt;->CompositionLocalProvider([Landroidx/compose/runtime/ProvidedValue;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V

    .line 394
    .line 395
    .line 396
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 397
    .line 398
    .line 399
    move-result v0

    .line 400
    if-eqz v0, :cond_16

    .line 401
    .line 402
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 403
    .line 404
    .line 405
    :cond_16
    :goto_9
    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    .line 406
    .line 407
    .line 408
    move-result-object v8

    .line 409
    if-nez v8, :cond_17

    .line 410
    .line 411
    goto :goto_a

    .line 412
    :cond_17
    new-instance v9, Landroidx/compose/material3/TabKt$TabTransition$1;

    .line 413
    .line 414
    move-object v0, v9

    .line 415
    move-wide/from16 v1, p0

    .line 416
    .line 417
    move-wide/from16 v3, p2

    .line 418
    .line 419
    move/from16 v5, p4

    .line 420
    .line 421
    move-object/from16 v6, p5

    .line 422
    .line 423
    move/from16 v7, p7

    .line 424
    .line 425
    invoke-direct/range {v0 .. v7}, Landroidx/compose/material3/TabKt$TabTransition$1;-><init>(JJZLkotlin/jvm/functions/Function2;I)V

    .line 426
    .line 427
    .line 428
    invoke-interface {v8, v9}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lkotlin/jvm/functions/Function2;)V

    .line 429
    .line 430
    .line 431
    :goto_a
    return-void
.end method

.method private static final TabTransition_Klgx_Pg$lambda-5(Landroidx/compose/runtime/State;)J
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/runtime/State<",
            "Landroidx/compose/ui/graphics/Color;",
            ">;)J"
        }
    .end annotation

    .line 1
    invoke-interface {p0}, Landroidx/compose/runtime/State;->getValue()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    check-cast p0, Landroidx/compose/ui/graphics/Color;

    .line 6
    .line 7
    invoke-virtual {p0}, Landroidx/compose/ui/graphics/Color;->unbox-impl()J

    .line 8
    .line 9
    .line 10
    move-result-wide v0

    .line 11
    return-wide v0
.end method

.method public static final synthetic access$TabBaselineLayout(Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2, p3}, Landroidx/compose/material3/TabKt;->TabBaselineLayout(Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static final synthetic access$TabTransition-Klgx-Pg(JJZLkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V
    .locals 0

    .line 1
    invoke-static/range {p0 .. p7}, Landroidx/compose/material3/TabKt;->TabTransition-Klgx-Pg(JJZLkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static final synthetic access$getHorizontalTextPadding$p()F
    .locals 1

    .line 1
    sget v0, Landroidx/compose/material3/TabKt;->HorizontalTextPadding:F

    .line 2
    .line 3
    return v0
.end method

.method public static final synthetic access$getIconDistanceFromBaseline$p()J
    .locals 2

    .line 1
    sget-wide v0, Landroidx/compose/material3/TabKt;->IconDistanceFromBaseline:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public static final synthetic access$getLargeTabHeight$p()F
    .locals 1

    .line 1
    sget v0, Landroidx/compose/material3/TabKt;->LargeTabHeight:F

    .line 2
    .line 3
    return v0
.end method

.method public static final synthetic access$getSmallTabHeight$p()F
    .locals 1

    .line 1
    sget v0, Landroidx/compose/material3/TabKt;->SmallTabHeight:F

    .line 2
    .line 3
    return v0
.end method

.method public static final synthetic access$getTextDistanceFromLeadingIcon$p()F
    .locals 1

    .line 1
    sget v0, Landroidx/compose/material3/TabKt;->TextDistanceFromLeadingIcon:F

    .line 2
    .line 3
    return v0
.end method

.method public static final synthetic access$placeTextAndIcon(Landroidx/compose/ui/layout/Placeable$PlacementScope;Landroidx/compose/ui/unit/Density;Landroidx/compose/ui/layout/Placeable;Landroidx/compose/ui/layout/Placeable;IIII)V
    .locals 0

    .line 1
    invoke-static/range {p0 .. p7}, Landroidx/compose/material3/TabKt;->placeTextAndIcon(Landroidx/compose/ui/layout/Placeable$PlacementScope;Landroidx/compose/ui/unit/Density;Landroidx/compose/ui/layout/Placeable;Landroidx/compose/ui/layout/Placeable;IIII)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static final synthetic access$placeTextOrIcon(Landroidx/compose/ui/layout/Placeable$PlacementScope;Landroidx/compose/ui/layout/Placeable;I)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Landroidx/compose/material3/TabKt;->placeTextOrIcon(Landroidx/compose/ui/layout/Placeable$PlacementScope;Landroidx/compose/ui/layout/Placeable;I)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private static final placeTextAndIcon(Landroidx/compose/ui/layout/Placeable$PlacementScope;Landroidx/compose/ui/unit/Density;Landroidx/compose/ui/layout/Placeable;Landroidx/compose/ui/layout/Placeable;IIII)V
    .locals 12

    .line 1
    move-object v0, p1

    .line 2
    move/from16 v1, p6

    .line 3
    .line 4
    move/from16 v2, p7

    .line 5
    .line 6
    if-ne v1, v2, :cond_0

    .line 7
    .line 8
    sget v3, Landroidx/compose/material3/TabKt;->SingleLineTextBaselineWithIcon:F

    .line 9
    .line 10
    goto :goto_0

    .line 11
    :cond_0
    sget v3, Landroidx/compose/material3/TabKt;->DoubleLineTextBaselineWithIcon:F

    .line 12
    .line 13
    :goto_0
    invoke-interface {p1, v3}, Landroidx/compose/ui/unit/Density;->roundToPx-0680j_4(F)I

    .line 14
    .line 15
    .line 16
    move-result v3

    .line 17
    sget-object v4, Landroidx/compose/material3/tokens/PrimaryNavigationTabTokens;->INSTANCE:Landroidx/compose/material3/tokens/PrimaryNavigationTabTokens;

    .line 18
    .line 19
    invoke-virtual {v4}, Landroidx/compose/material3/tokens/PrimaryNavigationTabTokens;->getActiveIndicatorHeight-D9Ej5fM()F

    .line 20
    .line 21
    .line 22
    move-result v4

    .line 23
    invoke-interface {p1, v4}, Landroidx/compose/ui/unit/Density;->roundToPx-0680j_4(F)I

    .line 24
    .line 25
    .line 26
    move-result v4

    .line 27
    add-int/2addr v3, v4

    .line 28
    invoke-virtual {p3}, Landroidx/compose/ui/layout/Placeable;->getHeight()I

    .line 29
    .line 30
    .line 31
    move-result v4

    .line 32
    sget-wide v5, Landroidx/compose/material3/TabKt;->IconDistanceFromBaseline:J

    .line 33
    .line 34
    invoke-interface {p1, v5, v6}, Landroidx/compose/ui/unit/Density;->roundToPx--R2X_6o(J)I

    .line 35
    .line 36
    .line 37
    move-result v0

    .line 38
    add-int/2addr v4, v0

    .line 39
    sub-int/2addr v4, v1

    .line 40
    invoke-virtual {p2}, Landroidx/compose/ui/layout/Placeable;->getWidth()I

    .line 41
    .line 42
    .line 43
    move-result v0

    .line 44
    sub-int v0, p4, v0

    .line 45
    .line 46
    div-int/lit8 v7, v0, 0x2

    .line 47
    .line 48
    sub-int v0, p5, v2

    .line 49
    .line 50
    sub-int/2addr v0, v3

    .line 51
    const/4 v9, 0x0

    .line 52
    const/4 v10, 0x4

    .line 53
    const/4 v11, 0x0

    .line 54
    move-object v5, p0

    .line 55
    move-object v6, p2

    .line 56
    move v8, v0

    .line 57
    invoke-static/range {v5 .. v11}, Landroidx/compose/ui/layout/Placeable$PlacementScope;->placeRelative$default(Landroidx/compose/ui/layout/Placeable$PlacementScope;Landroidx/compose/ui/layout/Placeable;IIFILjava/lang/Object;)V

    .line 58
    .line 59
    .line 60
    invoke-virtual {p3}, Landroidx/compose/ui/layout/Placeable;->getWidth()I

    .line 61
    .line 62
    .line 63
    move-result v1

    .line 64
    sub-int v1, p4, v1

    .line 65
    .line 66
    div-int/lit8 v7, v1, 0x2

    .line 67
    .line 68
    sub-int v8, v0, v4

    .line 69
    .line 70
    move-object v6, p3

    .line 71
    invoke-static/range {v5 .. v11}, Landroidx/compose/ui/layout/Placeable$PlacementScope;->placeRelative$default(Landroidx/compose/ui/layout/Placeable$PlacementScope;Landroidx/compose/ui/layout/Placeable;IIFILjava/lang/Object;)V

    .line 72
    .line 73
    .line 74
    return-void
.end method

.method private static final placeTextOrIcon(Landroidx/compose/ui/layout/Placeable$PlacementScope;Landroidx/compose/ui/layout/Placeable;I)V
    .locals 7

    .line 1
    invoke-virtual {p1}, Landroidx/compose/ui/layout/Placeable;->getHeight()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    sub-int/2addr p2, v0

    .line 6
    div-int/lit8 v3, p2, 0x2

    .line 7
    .line 8
    const/4 v2, 0x0

    .line 9
    const/4 v4, 0x0

    .line 10
    const/4 v5, 0x4

    .line 11
    const/4 v6, 0x0

    .line 12
    move-object v0, p0

    .line 13
    move-object v1, p1

    .line 14
    invoke-static/range {v0 .. v6}, Landroidx/compose/ui/layout/Placeable$PlacementScope;->placeRelative$default(Landroidx/compose/ui/layout/Placeable$PlacementScope;Landroidx/compose/ui/layout/Placeable;IIFILjava/lang/Object;)V

    .line 15
    .line 16
    .line 17
    return-void
.end method
