.class public final Landroidx/compose/material3/NavigationRailKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\u0007\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0010\u000e\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\u0008\n\u0002\u0008\u000e\u001az\u0010\u0010\u001a\u00020\u00072\u0008\u0008\u0002\u0010\u0001\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00022 \u0008\u0002\u0010\n\u001a\u001a\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0005\u00a2\u0006\u0002\u0008\u0008\u00a2\u0006\u0002\u0008\t2\u0008\u0008\u0002\u0010\u000c\u001a\u00020\u000b2\u001c\u0010\r\u001a\u0018\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005\u00a2\u0006\u0002\u0008\u0008\u00a2\u0006\u0002\u0008\tH\u0007\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008\u000e\u0010\u000f\u001a\u0083\u0001\u0010\u001d\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\u00112\u000c\u0010\u0014\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u00132\u0011\u0010\u0015\u001a\r\u0012\u0004\u0012\u00020\u00070\u0013\u00a2\u0006\u0002\u0008\u00082\u0008\u0008\u0002\u0010\u0001\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0016\u001a\u00020\u00112\u0015\u0008\u0002\u0010\u0017\u001a\u000f\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0013\u00a2\u0006\u0002\u0008\u00082\u0008\u0008\u0002\u0010\u0018\u001a\u00020\u00112\u0008\u0008\u0002\u0010\u001a\u001a\u00020\u00192\n\u0008\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001bH\u0007\u00a2\u0006\u0004\u0008\u001d\u0010\u001e\u001as\u0010#\u001a\u00020\u00072\u0011\u0010\u001f\u001a\r\u0012\u0004\u0012\u00020\u00070\u0013\u00a2\u0006\u0002\u0008\u00082\u0011\u0010 \u001a\r\u0012\u0004\u0012\u00020\u00070\u0013\u00a2\u0006\u0002\u0008\u00082\u0011\u0010\u0015\u001a\r\u0012\u0004\u0012\u00020\u00070\u0013\u00a2\u0006\u0002\u0008\u00082\u0013\u0010\u0017\u001a\u000f\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0013\u00a2\u0006\u0002\u0008\u00082\u0006\u0010\u0018\u001a\u00020\u00112\u000c\u0010\"\u001a\u0008\u0012\u0004\u0012\u00020!0\u0013H\u0003\u00a2\u0006\u0004\u0008#\u0010$\u001a8\u0010/\u001a\u00020,*\u00020%2\u0006\u0010\'\u001a\u00020&2\u0006\u0010(\u001a\u00020&2\u0008\u0010)\u001a\u0004\u0018\u00010&2\u0006\u0010+\u001a\u00020*H\u0002\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008-\u0010.\u001aP\u00103\u001a\u00020,*\u00020%2\u0006\u00100\u001a\u00020&2\u0006\u0010\'\u001a\u00020&2\u0006\u0010(\u001a\u00020&2\u0008\u0010)\u001a\u0004\u0018\u00010&2\u0006\u0010+\u001a\u00020*2\u0006\u0010\u0018\u001a\u00020\u00112\u0006\u0010\"\u001a\u00020!H\u0002\u00f8\u0001\u0000\u00a2\u0006\u0004\u00081\u00102\"\u0014\u00105\u001a\u0002048\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\u00085\u00106\"\u0014\u00107\u001a\u0002048\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\u00087\u00106\"\u0014\u00108\u001a\u0002048\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\u00088\u00106\"\u0014\u00109\u001a\u0002048\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\u00089\u00106\"\u001a\u0010;\u001a\u00020:8\u0000X\u0080\u0004\u00a2\u0006\u000c\n\u0004\u0008;\u0010<\u001a\u0004\u0008=\u0010>\"\u0014\u0010?\u001a\u00020:8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008?\u0010<\"\u0014\u0010A\u001a\u00020@8\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\u0008A\u0010B\"\u001a\u0010C\u001a\u00020:8\u0000X\u0080\u0004\u00a2\u0006\u000c\n\u0004\u0008C\u0010<\u001a\u0004\u0008D\u0010>\"\u001a\u0010E\u001a\u00020:8\u0000X\u0080\u0004\u00a2\u0006\u000c\n\u0004\u0008E\u0010<\u001a\u0004\u0008F\u0010>\"\u001a\u0010G\u001a\u00020:8\u0000X\u0080\u0004\u00a2\u0006\u000c\n\u0004\u0008G\u0010<\u001a\u0004\u0008H\u0010>\"\u0014\u0010I\u001a\u00020:8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008I\u0010<\"\u0014\u0010J\u001a\u00020:8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008J\u0010<\"\u0014\u0010K\u001a\u00020:8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008K\u0010<\u0082\u0002\u0007\n\u0005\u0008\u00a1\u001e0\u0001\u00a8\u0006N\u00b2\u0006\u000c\u0010L\u001a\u00020\u00028\nX\u008a\u0084\u0002\u00b2\u0006\u000c\u0010M\u001a\u00020\u00028\nX\u008a\u0084\u0002"
    }
    d2 = {
        "Landroidx/compose/ui/Modifier;",
        "modifier",
        "Landroidx/compose/ui/graphics/Color;",
        "containerColor",
        "contentColor",
        "Lkotlin/Function1;",
        "Landroidx/compose/foundation/layout/ColumnScope;",
        "Ld6/s;",
        "Landroidx/compose/runtime/Composable;",
        "Lkotlin/ExtensionFunctionType;",
        "header",
        "Landroidx/compose/foundation/layout/WindowInsets;",
        "windowInsets",
        "content",
        "NavigationRail-qi6gXK8",
        "(Landroidx/compose/ui/Modifier;JJLr6/f;Landroidx/compose/foundation/layout/WindowInsets;Lr6/f;Landroidx/compose/runtime/Composer;II)V",
        "NavigationRail",
        "",
        "selected",
        "Lkotlin/Function0;",
        "onClick",
        "icon",
        "enabled",
        "label",
        "alwaysShowLabel",
        "Landroidx/compose/material3/NavigationRailItemColors;",
        "colors",
        "Landroidx/compose/foundation/interaction/MutableInteractionSource;",
        "interactionSource",
        "NavigationRailItem",
        "(ZLr6/a;Lr6/e;Landroidx/compose/ui/Modifier;ZLr6/e;ZLandroidx/compose/material3/NavigationRailItemColors;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/runtime/Composer;II)V",
        "indicatorRipple",
        "indicator",
        "",
        "animationProgress",
        "NavigationRailItemLayout",
        "(Lr6/e;Lr6/e;Lr6/e;Lr6/e;ZLr6/a;Landroidx/compose/runtime/Composer;I)V",
        "Landroidx/compose/ui/layout/MeasureScope;",
        "Landroidx/compose/ui/layout/Placeable;",
        "iconPlaceable",
        "indicatorRipplePlaceable",
        "indicatorPlaceable",
        "Landroidx/compose/ui/unit/Constraints;",
        "constraints",
        "Landroidx/compose/ui/layout/MeasureResult;",
        "placeIcon-X9ElhV4",
        "(Landroidx/compose/ui/layout/MeasureScope;Landroidx/compose/ui/layout/Placeable;Landroidx/compose/ui/layout/Placeable;Landroidx/compose/ui/layout/Placeable;J)Landroidx/compose/ui/layout/MeasureResult;",
        "placeIcon",
        "labelPlaceable",
        "placeLabelAndIcon-zUg2_y0",
        "(Landroidx/compose/ui/layout/MeasureScope;Landroidx/compose/ui/layout/Placeable;Landroidx/compose/ui/layout/Placeable;Landroidx/compose/ui/layout/Placeable;Landroidx/compose/ui/layout/Placeable;JZF)Landroidx/compose/ui/layout/MeasureResult;",
        "placeLabelAndIcon",
        "",
        "IndicatorRippleLayoutIdTag",
        "Ljava/lang/String;",
        "IndicatorLayoutIdTag",
        "IconLayoutIdTag",
        "LabelLayoutIdTag",
        "Landroidx/compose/ui/unit/Dp;",
        "NavigationRailVerticalPadding",
        "F",
        "getNavigationRailVerticalPadding",
        "()F",
        "NavigationRailHeaderPadding",
        "",
        "ItemAnimationDurationMillis",
        "I",
        "NavigationRailItemWidth",
        "getNavigationRailItemWidth",
        "NavigationRailItemHeight",
        "getNavigationRailItemHeight",
        "NavigationRailItemVerticalPadding",
        "getNavigationRailItemVerticalPadding",
        "IndicatorHorizontalPadding",
        "IndicatorVerticalPaddingWithLabel",
        "IndicatorVerticalPaddingNoLabel",
        "iconColor",
        "textColor",
        "material3_release"
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
        "SMAP\nNavigationRail.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NavigationRail.kt\nandroidx/compose/material3/NavigationRailKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Composer.kt\nandroidx/compose/runtime/Updater\n+ 7 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 8 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 9 Dp.kt\nandroidx/compose/ui/unit/Dp\n*L\n1#1,749:1\n1223#2,6:750\n1223#2,6:789\n1223#2,6:795\n1223#2,6:805\n1223#2,6:882\n71#3,3:756\n74#3:787\n78#3:804\n71#3:842\n68#3,6:843\n74#3:877\n78#3:881\n71#3:888\n68#3,6:889\n74#3:923\n78#3:927\n78#4,6:759\n85#4,4:774\n89#4,2:784\n93#4:803\n78#4:811\n76#4,8:812\n85#4,4:829\n89#4,2:839\n78#4,6:849\n85#4,4:864\n89#4,2:874\n93#4:880\n78#4,6:895\n85#4,4:910\n89#4,2:920\n93#4:926\n93#4:930\n368#5,9:765\n377#5:786\n378#5,2:801\n368#5,9:820\n377#5:841\n368#5,9:855\n377#5:876\n378#5,2:878\n368#5,9:901\n377#5:922\n378#5,2:924\n378#5,2:928\n4032#6,6:778\n4032#6,6:833\n4032#6,6:868\n4032#6,6:914\n77#7:788\n148#8:931\n148#8:932\n148#8:933\n56#9:934\n71#9:935\n56#9:936\n71#9:937\n56#9:938\n71#9:939\n*S KotlinDebug\n*F\n+ 1 NavigationRail.kt\nandroidx/compose/material3/NavigationRailKt\n*L\n184#1:750,6\n247#1:789,6\n283#1:795,6\n531#1:805,6\n524#1:882,6\n216#1:756,3\n216#1:787\n216#1:804\n520#1:842\n520#1:843,6\n520#1:877\n520#1:881\n523#1:888\n523#1:889,6\n523#1:923\n523#1:927\n216#1:759,6\n216#1:774,4\n216#1:784,2\n216#1:803\n516#1:811\n516#1:812,8\n516#1:829,4\n516#1:839,2\n520#1:849,6\n520#1:864,4\n520#1:874,2\n520#1:880\n523#1:895,6\n523#1:910,4\n523#1:920,2\n523#1:926\n516#1:930\n216#1:765,9\n216#1:786\n216#1:801,2\n516#1:820,9\n516#1:841\n520#1:855,9\n520#1:876\n520#1:878,2\n523#1:901,9\n523#1:922\n523#1:924,2\n516#1:928,2\n216#1:778,6\n516#1:833,6\n520#1:868,6\n523#1:914,6\n241#1:788\n719#1:931\n725#1:932\n739#1:933\n742#1:934\n742#1:935\n745#1:936\n745#1:937\n748#1:938\n748#1:939\n*E\n"
    }
.end annotation


# static fields
.field private static final IconLayoutIdTag:Ljava/lang/String; = "icon"
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private static final IndicatorHorizontalPadding:F

.field private static final IndicatorLayoutIdTag:Ljava/lang/String; = "indicator"
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private static final IndicatorRippleLayoutIdTag:Ljava/lang/String; = "indicatorRipple"
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private static final IndicatorVerticalPaddingNoLabel:F

.field private static final IndicatorVerticalPaddingWithLabel:F

.field private static final ItemAnimationDurationMillis:I = 0x96

.field private static final LabelLayoutIdTag:Ljava/lang/String; = "label"
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private static final NavigationRailHeaderPadding:F

.field private static final NavigationRailItemHeight:F

.field private static final NavigationRailItemVerticalPadding:F

.field private static final NavigationRailItemWidth:F

.field private static final NavigationRailVerticalPadding:F


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    const/4 v0, 0x4

    .line 2
    int-to-float v0, v0

    .line 3
    invoke-static {v0}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    sput v1, Landroidx/compose/material3/NavigationRailKt;->NavigationRailVerticalPadding:F

    .line 8
    .line 9
    const/16 v1, 0x8

    .line 10
    .line 11
    int-to-float v1, v1

    .line 12
    invoke-static {v1}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    sput v1, Landroidx/compose/material3/NavigationRailKt;->NavigationRailHeaderPadding:F

    .line 17
    .line 18
    sget-object v1, Landroidx/compose/material3/tokens/NavigationRailTokens;->INSTANCE:Landroidx/compose/material3/tokens/NavigationRailTokens;

    .line 19
    .line 20
    invoke-virtual {v1}, Landroidx/compose/material3/tokens/NavigationRailTokens;->getContainerWidth-D9Ej5fM()F

    .line 21
    .line 22
    .line 23
    move-result v2

    .line 24
    sput v2, Landroidx/compose/material3/NavigationRailKt;->NavigationRailItemWidth:F

    .line 25
    .line 26
    invoke-virtual {v1}, Landroidx/compose/material3/tokens/NavigationRailTokens;->getNoLabelActiveIndicatorHeight-D9Ej5fM()F

    .line 27
    .line 28
    .line 29
    move-result v2

    .line 30
    sput v2, Landroidx/compose/material3/NavigationRailKt;->NavigationRailItemHeight:F

    .line 31
    .line 32
    invoke-static {v0}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 33
    .line 34
    .line 35
    move-result v0

    .line 36
    sput v0, Landroidx/compose/material3/NavigationRailKt;->NavigationRailItemVerticalPadding:F

    .line 37
    .line 38
    invoke-virtual {v1}, Landroidx/compose/material3/tokens/NavigationRailTokens;->getActiveIndicatorWidth-D9Ej5fM()F

    .line 39
    .line 40
    .line 41
    move-result v0

    .line 42
    invoke-virtual {v1}, Landroidx/compose/material3/tokens/NavigationRailTokens;->getIconSize-D9Ej5fM()F

    .line 43
    .line 44
    .line 45
    move-result v2

    .line 46
    sub-float/2addr v0, v2

    .line 47
    invoke-static {v0}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 48
    .line 49
    .line 50
    move-result v0

    .line 51
    const/4 v2, 0x2

    .line 52
    int-to-float v2, v2

    .line 53
    div-float/2addr v0, v2

    .line 54
    invoke-static {v0}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 55
    .line 56
    .line 57
    move-result v0

    .line 58
    sput v0, Landroidx/compose/material3/NavigationRailKt;->IndicatorHorizontalPadding:F

    .line 59
    .line 60
    invoke-virtual {v1}, Landroidx/compose/material3/tokens/NavigationRailTokens;->getActiveIndicatorHeight-D9Ej5fM()F

    .line 61
    .line 62
    .line 63
    move-result v0

    .line 64
    invoke-virtual {v1}, Landroidx/compose/material3/tokens/NavigationRailTokens;->getIconSize-D9Ej5fM()F

    .line 65
    .line 66
    .line 67
    move-result v3

    .line 68
    sub-float/2addr v0, v3

    .line 69
    invoke-static {v0}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 70
    .line 71
    .line 72
    move-result v0

    .line 73
    div-float/2addr v0, v2

    .line 74
    invoke-static {v0}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 75
    .line 76
    .line 77
    move-result v0

    .line 78
    sput v0, Landroidx/compose/material3/NavigationRailKt;->IndicatorVerticalPaddingWithLabel:F

    .line 79
    .line 80
    invoke-virtual {v1}, Landroidx/compose/material3/tokens/NavigationRailTokens;->getNoLabelActiveIndicatorHeight-D9Ej5fM()F

    .line 81
    .line 82
    .line 83
    move-result v0

    .line 84
    invoke-virtual {v1}, Landroidx/compose/material3/tokens/NavigationRailTokens;->getIconSize-D9Ej5fM()F

    .line 85
    .line 86
    .line 87
    move-result v1

    .line 88
    sub-float/2addr v0, v1

    .line 89
    invoke-static {v0}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 90
    .line 91
    .line 92
    move-result v0

    .line 93
    div-float/2addr v0, v2

    .line 94
    invoke-static {v0}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 95
    .line 96
    .line 97
    move-result v0

    .line 98
    sput v0, Landroidx/compose/material3/NavigationRailKt;->IndicatorVerticalPaddingNoLabel:F

    .line 99
    .line 100
    return-void
.end method

.method public static final NavigationRail-qi6gXK8(Landroidx/compose/ui/Modifier;JJLr6/f;Landroidx/compose/foundation/layout/WindowInsets;Lr6/f;Landroidx/compose/runtime/Composer;II)V
    .locals 23
    .param p0    # Landroidx/compose/ui/Modifier;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p5    # Lr6/f;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p6    # Landroidx/compose/foundation/layout/WindowInsets;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p7    # Lr6/f;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p8    # Landroidx/compose/runtime/Composer;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation build Landroidx/compose/runtime/Composable;
    .end annotation

    .annotation build Landroidx/compose/runtime/ComposableInferredTarget;
        scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/ui/Modifier;",
            "JJ",
            "Lr6/f;",
            "Landroidx/compose/foundation/layout/WindowInsets;",
            "Lr6/f;",
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
    const v0, 0x710f848

    .line 6
    .line 7
    .line 8
    move-object/from16 v1, p8

    .line 9
    .line 10
    invoke-interface {v1, v0}, Landroidx/compose/runtime/Composer;->startRestartGroup(I)Landroidx/compose/runtime/Composer;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    and-int/lit8 v2, p10, 0x1

    .line 15
    .line 16
    if-eqz v2, :cond_0

    .line 17
    .line 18
    or-int/lit8 v3, v9, 0x6

    .line 19
    .line 20
    move v4, v3

    .line 21
    move-object/from16 v3, p0

    .line 22
    .line 23
    goto :goto_1

    .line 24
    :cond_0
    and-int/lit8 v3, v9, 0x6

    .line 25
    .line 26
    if-nez v3, :cond_2

    .line 27
    .line 28
    move-object/from16 v3, p0

    .line 29
    .line 30
    invoke-interface {v1, v3}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 31
    .line 32
    .line 33
    move-result v4

    .line 34
    if-eqz v4, :cond_1

    .line 35
    .line 36
    const/4 v4, 0x4

    .line 37
    goto :goto_0

    .line 38
    :cond_1
    const/4 v4, 0x2

    .line 39
    :goto_0
    or-int/2addr v4, v9

    .line 40
    goto :goto_1

    .line 41
    :cond_2
    move-object/from16 v3, p0

    .line 42
    .line 43
    move v4, v9

    .line 44
    :goto_1
    and-int/lit8 v5, v9, 0x30

    .line 45
    .line 46
    if-nez v5, :cond_5

    .line 47
    .line 48
    and-int/lit8 v5, p10, 0x2

    .line 49
    .line 50
    if-nez v5, :cond_3

    .line 51
    .line 52
    move-wide/from16 v5, p1

    .line 53
    .line 54
    invoke-interface {v1, v5, v6}, Landroidx/compose/runtime/Composer;->changed(J)Z

    .line 55
    .line 56
    .line 57
    move-result v7

    .line 58
    if-eqz v7, :cond_4

    .line 59
    .line 60
    const/16 v7, 0x20

    .line 61
    .line 62
    goto :goto_2

    .line 63
    :cond_3
    move-wide/from16 v5, p1

    .line 64
    .line 65
    :cond_4
    const/16 v7, 0x10

    .line 66
    .line 67
    :goto_2
    or-int/2addr v4, v7

    .line 68
    goto :goto_3

    .line 69
    :cond_5
    move-wide/from16 v5, p1

    .line 70
    .line 71
    :goto_3
    and-int/lit16 v7, v9, 0x180

    .line 72
    .line 73
    if-nez v7, :cond_7

    .line 74
    .line 75
    and-int/lit8 v7, p10, 0x4

    .line 76
    .line 77
    move-wide/from16 v10, p3

    .line 78
    .line 79
    if-nez v7, :cond_6

    .line 80
    .line 81
    invoke-interface {v1, v10, v11}, Landroidx/compose/runtime/Composer;->changed(J)Z

    .line 82
    .line 83
    .line 84
    move-result v7

    .line 85
    if-eqz v7, :cond_6

    .line 86
    .line 87
    const/16 v7, 0x100

    .line 88
    .line 89
    goto :goto_4

    .line 90
    :cond_6
    const/16 v7, 0x80

    .line 91
    .line 92
    :goto_4
    or-int/2addr v4, v7

    .line 93
    goto :goto_5

    .line 94
    :cond_7
    move-wide/from16 v10, p3

    .line 95
    .line 96
    :goto_5
    and-int/lit8 v7, p10, 0x8

    .line 97
    .line 98
    if-eqz v7, :cond_9

    .line 99
    .line 100
    or-int/lit16 v4, v4, 0xc00

    .line 101
    .line 102
    :cond_8
    move-object/from16 v12, p5

    .line 103
    .line 104
    goto :goto_7

    .line 105
    :cond_9
    and-int/lit16 v12, v9, 0xc00

    .line 106
    .line 107
    if-nez v12, :cond_8

    .line 108
    .line 109
    move-object/from16 v12, p5

    .line 110
    .line 111
    invoke-interface {v1, v12}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 112
    .line 113
    .line 114
    move-result v13

    .line 115
    if-eqz v13, :cond_a

    .line 116
    .line 117
    const/16 v13, 0x800

    .line 118
    .line 119
    goto :goto_6

    .line 120
    :cond_a
    const/16 v13, 0x400

    .line 121
    .line 122
    :goto_6
    or-int/2addr v4, v13

    .line 123
    :goto_7
    and-int/lit16 v13, v9, 0x6000

    .line 124
    .line 125
    if-nez v13, :cond_d

    .line 126
    .line 127
    and-int/lit8 v13, p10, 0x10

    .line 128
    .line 129
    if-nez v13, :cond_b

    .line 130
    .line 131
    move-object/from16 v13, p6

    .line 132
    .line 133
    invoke-interface {v1, v13}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 134
    .line 135
    .line 136
    move-result v14

    .line 137
    if-eqz v14, :cond_c

    .line 138
    .line 139
    const/16 v14, 0x4000

    .line 140
    .line 141
    goto :goto_8

    .line 142
    :cond_b
    move-object/from16 v13, p6

    .line 143
    .line 144
    :cond_c
    const/16 v14, 0x2000

    .line 145
    .line 146
    :goto_8
    or-int/2addr v4, v14

    .line 147
    goto :goto_9

    .line 148
    :cond_d
    move-object/from16 v13, p6

    .line 149
    .line 150
    :goto_9
    and-int/lit8 v14, p10, 0x20

    .line 151
    .line 152
    const/high16 v15, 0x30000

    .line 153
    .line 154
    if-eqz v14, :cond_e

    .line 155
    .line 156
    or-int/2addr v4, v15

    .line 157
    goto :goto_b

    .line 158
    :cond_e
    and-int v14, v9, v15

    .line 159
    .line 160
    if-nez v14, :cond_10

    .line 161
    .line 162
    invoke-interface {v1, v8}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 163
    .line 164
    .line 165
    move-result v14

    .line 166
    if-eqz v14, :cond_f

    .line 167
    .line 168
    const/high16 v14, 0x20000

    .line 169
    .line 170
    goto :goto_a

    .line 171
    :cond_f
    const/high16 v14, 0x10000

    .line 172
    .line 173
    :goto_a
    or-int/2addr v4, v14

    .line 174
    :cond_10
    :goto_b
    const v14, 0x12493

    .line 175
    .line 176
    .line 177
    and-int/2addr v14, v4

    .line 178
    const v15, 0x12492

    .line 179
    .line 180
    .line 181
    if-ne v14, v15, :cond_12

    .line 182
    .line 183
    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->getSkipping()Z

    .line 184
    .line 185
    .line 186
    move-result v14

    .line 187
    if-nez v14, :cond_11

    .line 188
    .line 189
    goto :goto_c

    .line 190
    :cond_11
    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    .line 191
    .line 192
    .line 193
    move-object/from16 v20, v1

    .line 194
    .line 195
    move-object v1, v3

    .line 196
    move-wide v2, v5

    .line 197
    move-wide v4, v10

    .line 198
    move-object v6, v12

    .line 199
    move-object v7, v13

    .line 200
    goto/16 :goto_12

    .line 201
    .line 202
    :cond_12
    :goto_c
    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->startDefaults()V

    .line 203
    .line 204
    .line 205
    and-int/lit8 v14, v9, 0x1

    .line 206
    .line 207
    const v15, -0xe001

    .line 208
    .line 209
    .line 210
    if-eqz v14, :cond_17

    .line 211
    .line 212
    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->getDefaultsInvalid()Z

    .line 213
    .line 214
    .line 215
    move-result v14

    .line 216
    if-eqz v14, :cond_13

    .line 217
    .line 218
    goto :goto_e

    .line 219
    :cond_13
    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    .line 220
    .line 221
    .line 222
    and-int/lit8 v2, p10, 0x2

    .line 223
    .line 224
    if-eqz v2, :cond_14

    .line 225
    .line 226
    and-int/lit8 v4, v4, -0x71

    .line 227
    .line 228
    :cond_14
    and-int/lit8 v2, p10, 0x4

    .line 229
    .line 230
    if-eqz v2, :cond_15

    .line 231
    .line 232
    and-int/lit16 v4, v4, -0x381

    .line 233
    .line 234
    :cond_15
    and-int/lit8 v2, p10, 0x10

    .line 235
    .line 236
    if-eqz v2, :cond_16

    .line 237
    .line 238
    and-int/2addr v4, v15

    .line 239
    :cond_16
    move-wide v14, v10

    .line 240
    move-object v2, v12

    .line 241
    move-object v10, v3

    .line 242
    move-object v3, v13

    .line 243
    :goto_d
    move-wide v12, v5

    .line 244
    goto :goto_11

    .line 245
    :cond_17
    :goto_e
    if-eqz v2, :cond_18

    .line 246
    .line 247
    sget-object v2, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    .line 248
    .line 249
    goto :goto_f

    .line 250
    :cond_18
    move-object v2, v3

    .line 251
    :goto_f
    and-int/lit8 v3, p10, 0x2

    .line 252
    .line 253
    const/4 v14, 0x6

    .line 254
    if-eqz v3, :cond_19

    .line 255
    .line 256
    sget-object v3, Landroidx/compose/material3/NavigationRailDefaults;->INSTANCE:Landroidx/compose/material3/NavigationRailDefaults;

    .line 257
    .line 258
    invoke-virtual {v3, v1, v14}, Landroidx/compose/material3/NavigationRailDefaults;->getContainerColor(Landroidx/compose/runtime/Composer;I)J

    .line 259
    .line 260
    .line 261
    move-result-wide v5

    .line 262
    and-int/lit8 v4, v4, -0x71

    .line 263
    .line 264
    :cond_19
    and-int/lit8 v3, p10, 0x4

    .line 265
    .line 266
    if-eqz v3, :cond_1a

    .line 267
    .line 268
    shr-int/lit8 v3, v4, 0x3

    .line 269
    .line 270
    and-int/lit8 v3, v3, 0xe

    .line 271
    .line 272
    invoke-static {v5, v6, v1, v3}, Landroidx/compose/material3/ColorSchemeKt;->contentColorFor-ek8zF_U(JLandroidx/compose/runtime/Composer;I)J

    .line 273
    .line 274
    .line 275
    move-result-wide v10

    .line 276
    and-int/lit16 v3, v4, -0x381

    .line 277
    .line 278
    move v4, v3

    .line 279
    :cond_1a
    if-eqz v7, :cond_1b

    .line 280
    .line 281
    const/4 v3, 0x0

    .line 282
    move-object v12, v3

    .line 283
    :cond_1b
    and-int/lit8 v3, p10, 0x10

    .line 284
    .line 285
    if-eqz v3, :cond_1c

    .line 286
    .line 287
    sget-object v3, Landroidx/compose/material3/NavigationRailDefaults;->INSTANCE:Landroidx/compose/material3/NavigationRailDefaults;

    .line 288
    .line 289
    invoke-virtual {v3, v1, v14}, Landroidx/compose/material3/NavigationRailDefaults;->getWindowInsets(Landroidx/compose/runtime/Composer;I)Landroidx/compose/foundation/layout/WindowInsets;

    .line 290
    .line 291
    .line 292
    move-result-object v3

    .line 293
    and-int/2addr v4, v15

    .line 294
    move-wide v14, v10

    .line 295
    :goto_10
    move-object v10, v2

    .line 296
    move-object v2, v12

    .line 297
    goto :goto_d

    .line 298
    :cond_1c
    move-wide v14, v10

    .line 299
    move-object v3, v13

    .line 300
    goto :goto_10

    .line 301
    :goto_11
    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->endDefaults()V

    .line 302
    .line 303
    .line 304
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 305
    .line 306
    .line 307
    move-result v5

    .line 308
    if-eqz v5, :cond_1d

    .line 309
    .line 310
    const/4 v5, -0x1

    .line 311
    const-string v6, "androidx.compose.material3.NavigationRail (NavigationRail.kt:118)"

    .line 312
    .line 313
    invoke-static {v0, v4, v5, v6}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 314
    .line 315
    .line 316
    :cond_1d
    new-instance v0, Landroidx/compose/material3/NavigationRailKt$NavigationRail$1;

    .line 317
    .line 318
    invoke-direct {v0, v3, v2, v8}, Landroidx/compose/material3/NavigationRailKt$NavigationRail$1;-><init>(Landroidx/compose/foundation/layout/WindowInsets;Lr6/f;Lr6/f;)V

    .line 319
    .line 320
    .line 321
    const/16 v5, 0x36

    .line 322
    .line 323
    const v6, -0x7cbbd05d

    .line 324
    .line 325
    .line 326
    const/4 v7, 0x1

    .line 327
    invoke-static {v6, v7, v0, v1, v5}, Landroidx/compose/runtime/internal/ComposableLambdaKt;->rememberComposableLambda(IZLjava/lang/Object;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/internal/ComposableLambda;

    .line 328
    .line 329
    .line 330
    move-result-object v19

    .line 331
    and-int/lit8 v0, v4, 0xe

    .line 332
    .line 333
    const/high16 v5, 0xc00000

    .line 334
    .line 335
    or-int/2addr v0, v5

    .line 336
    shl-int/lit8 v4, v4, 0x3

    .line 337
    .line 338
    and-int/lit16 v5, v4, 0x380

    .line 339
    .line 340
    or-int/2addr v0, v5

    .line 341
    and-int/lit16 v4, v4, 0x1c00

    .line 342
    .line 343
    or-int v21, v0, v4

    .line 344
    .line 345
    const/16 v22, 0x72

    .line 346
    .line 347
    const/4 v11, 0x0

    .line 348
    const/16 v16, 0x0

    .line 349
    .line 350
    const/16 v17, 0x0

    .line 351
    .line 352
    const/16 v18, 0x0

    .line 353
    .line 354
    move-object/from16 v20, v1

    .line 355
    .line 356
    invoke-static/range {v10 .. v22}, Landroidx/compose/material3/SurfaceKt;->Surface-T9BRK9s(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/graphics/Shape;JJFFLandroidx/compose/foundation/BorderStroke;Lr6/e;Landroidx/compose/runtime/Composer;II)V

    .line 357
    .line 358
    .line 359
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 360
    .line 361
    .line 362
    move-result v0

    .line 363
    if-eqz v0, :cond_1e

    .line 364
    .line 365
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 366
    .line 367
    .line 368
    :cond_1e
    move-object v6, v2

    .line 369
    move-object v7, v3

    .line 370
    move-object v1, v10

    .line 371
    move-wide v2, v12

    .line 372
    move-wide v4, v14

    .line 373
    :goto_12
    invoke-interface/range {v20 .. v20}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    .line 374
    .line 375
    .line 376
    move-result-object v11

    .line 377
    if-eqz v11, :cond_1f

    .line 378
    .line 379
    new-instance v0, Landroidx/compose/material3/NavigationRailKt$NavigationRail$2;

    .line 380
    .line 381
    move/from16 v10, p10

    .line 382
    .line 383
    invoke-direct/range {v0 .. v10}, Landroidx/compose/material3/NavigationRailKt$NavigationRail$2;-><init>(Landroidx/compose/ui/Modifier;JJLr6/f;Landroidx/compose/foundation/layout/WindowInsets;Lr6/f;II)V

    .line 384
    .line 385
    .line 386
    invoke-interface {v11, v0}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lr6/e;)V

    .line 387
    .line 388
    .line 389
    :cond_1f
    return-void
.end method

.method public static final NavigationRailItem(ZLr6/a;Lr6/e;Landroidx/compose/ui/Modifier;ZLr6/e;ZLandroidx/compose/material3/NavigationRailItemColors;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/runtime/Composer;II)V
    .locals 23
    .param p1    # Lr6/a;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lr6/e;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Landroidx/compose/ui/Modifier;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p5    # Lr6/e;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p7    # Landroidx/compose/material3/NavigationRailItemColors;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p8    # Landroidx/compose/foundation/interaction/MutableInteractionSource;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p9    # Landroidx/compose/runtime/Composer;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation build Landroidx/compose/runtime/Composable;
    .end annotation

    .annotation build Landroidx/compose/runtime/ComposableInferredTarget;
        scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z",
            "Lr6/a;",
            "Lr6/e;",
            "Landroidx/compose/ui/Modifier;",
            "Z",
            "Lr6/e;",
            "Z",
            "Landroidx/compose/material3/NavigationRailItemColors;",
            "Landroidx/compose/foundation/interaction/MutableInteractionSource;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    .line 1
    move/from16 v1, p0

    .line 2
    .line 3
    move/from16 v10, p10

    .line 4
    .line 5
    move/from16 v11, p11

    .line 6
    .line 7
    const v0, -0x5b6e8a65

    .line 8
    .line 9
    .line 10
    move-object/from16 v2, p9

    .line 11
    .line 12
    invoke-interface {v2, v0}, Landroidx/compose/runtime/Composer;->startRestartGroup(I)Landroidx/compose/runtime/Composer;

    .line 13
    .line 14
    .line 15
    move-result-object v6

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
    goto :goto_1

    .line 23
    :cond_0
    and-int/lit8 v2, v10, 0x6

    .line 24
    .line 25
    if-nez v2, :cond_2

    .line 26
    .line 27
    invoke-interface {v6, v1}, Landroidx/compose/runtime/Composer;->changed(Z)Z

    .line 28
    .line 29
    .line 30
    move-result v2

    .line 31
    if-eqz v2, :cond_1

    .line 32
    .line 33
    const/4 v2, 0x4

    .line 34
    goto :goto_0

    .line 35
    :cond_1
    const/4 v2, 0x2

    .line 36
    :goto_0
    or-int/2addr v2, v10

    .line 37
    goto :goto_1

    .line 38
    :cond_2
    move v2, v10

    .line 39
    :goto_1
    and-int/lit8 v3, v11, 0x2

    .line 40
    .line 41
    if-eqz v3, :cond_4

    .line 42
    .line 43
    or-int/lit8 v2, v2, 0x30

    .line 44
    .line 45
    :cond_3
    move-object/from16 v3, p1

    .line 46
    .line 47
    goto :goto_3

    .line 48
    :cond_4
    and-int/lit8 v3, v10, 0x30

    .line 49
    .line 50
    if-nez v3, :cond_3

    .line 51
    .line 52
    move-object/from16 v3, p1

    .line 53
    .line 54
    invoke-interface {v6, v3}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 55
    .line 56
    .line 57
    move-result v4

    .line 58
    if-eqz v4, :cond_5

    .line 59
    .line 60
    const/16 v4, 0x20

    .line 61
    .line 62
    goto :goto_2

    .line 63
    :cond_5
    const/16 v4, 0x10

    .line 64
    .line 65
    :goto_2
    or-int/2addr v2, v4

    .line 66
    :goto_3
    and-int/lit8 v4, v11, 0x4

    .line 67
    .line 68
    if-eqz v4, :cond_7

    .line 69
    .line 70
    or-int/lit16 v2, v2, 0x180

    .line 71
    .line 72
    :cond_6
    move-object/from16 v4, p2

    .line 73
    .line 74
    goto :goto_5

    .line 75
    :cond_7
    and-int/lit16 v4, v10, 0x180

    .line 76
    .line 77
    if-nez v4, :cond_6

    .line 78
    .line 79
    move-object/from16 v4, p2

    .line 80
    .line 81
    invoke-interface {v6, v4}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 82
    .line 83
    .line 84
    move-result v5

    .line 85
    if-eqz v5, :cond_8

    .line 86
    .line 87
    const/16 v5, 0x100

    .line 88
    .line 89
    goto :goto_4

    .line 90
    :cond_8
    const/16 v5, 0x80

    .line 91
    .line 92
    :goto_4
    or-int/2addr v2, v5

    .line 93
    :goto_5
    and-int/lit8 v5, v11, 0x8

    .line 94
    .line 95
    if-eqz v5, :cond_a

    .line 96
    .line 97
    or-int/lit16 v2, v2, 0xc00

    .line 98
    .line 99
    :cond_9
    move-object/from16 v7, p3

    .line 100
    .line 101
    goto :goto_7

    .line 102
    :cond_a
    and-int/lit16 v7, v10, 0xc00

    .line 103
    .line 104
    if-nez v7, :cond_9

    .line 105
    .line 106
    move-object/from16 v7, p3

    .line 107
    .line 108
    invoke-interface {v6, v7}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 109
    .line 110
    .line 111
    move-result v8

    .line 112
    if-eqz v8, :cond_b

    .line 113
    .line 114
    const/16 v8, 0x800

    .line 115
    .line 116
    goto :goto_6

    .line 117
    :cond_b
    const/16 v8, 0x400

    .line 118
    .line 119
    :goto_6
    or-int/2addr v2, v8

    .line 120
    :goto_7
    and-int/lit8 v8, v11, 0x10

    .line 121
    .line 122
    if-eqz v8, :cond_d

    .line 123
    .line 124
    or-int/lit16 v2, v2, 0x6000

    .line 125
    .line 126
    :cond_c
    move/from16 v12, p4

    .line 127
    .line 128
    goto :goto_9

    .line 129
    :cond_d
    and-int/lit16 v12, v10, 0x6000

    .line 130
    .line 131
    if-nez v12, :cond_c

    .line 132
    .line 133
    move/from16 v12, p4

    .line 134
    .line 135
    invoke-interface {v6, v12}, Landroidx/compose/runtime/Composer;->changed(Z)Z

    .line 136
    .line 137
    .line 138
    move-result v13

    .line 139
    if-eqz v13, :cond_e

    .line 140
    .line 141
    const/16 v13, 0x4000

    .line 142
    .line 143
    goto :goto_8

    .line 144
    :cond_e
    const/16 v13, 0x2000

    .line 145
    .line 146
    :goto_8
    or-int/2addr v2, v13

    .line 147
    :goto_9
    and-int/lit8 v13, v11, 0x20

    .line 148
    .line 149
    const/high16 v14, 0x30000

    .line 150
    .line 151
    if-eqz v13, :cond_10

    .line 152
    .line 153
    or-int/2addr v2, v14

    .line 154
    :cond_f
    move-object/from16 v14, p5

    .line 155
    .line 156
    goto :goto_b

    .line 157
    :cond_10
    and-int/2addr v14, v10

    .line 158
    if-nez v14, :cond_f

    .line 159
    .line 160
    move-object/from16 v14, p5

    .line 161
    .line 162
    invoke-interface {v6, v14}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 163
    .line 164
    .line 165
    move-result v15

    .line 166
    if-eqz v15, :cond_11

    .line 167
    .line 168
    const/high16 v15, 0x20000

    .line 169
    .line 170
    goto :goto_a

    .line 171
    :cond_11
    const/high16 v15, 0x10000

    .line 172
    .line 173
    :goto_a
    or-int/2addr v2, v15

    .line 174
    :goto_b
    and-int/lit8 v15, v11, 0x40

    .line 175
    .line 176
    const/high16 v16, 0x180000

    .line 177
    .line 178
    if-eqz v15, :cond_12

    .line 179
    .line 180
    or-int v2, v2, v16

    .line 181
    .line 182
    move/from16 v9, p6

    .line 183
    .line 184
    goto :goto_d

    .line 185
    :cond_12
    and-int v16, v10, v16

    .line 186
    .line 187
    move/from16 v9, p6

    .line 188
    .line 189
    if-nez v16, :cond_14

    .line 190
    .line 191
    invoke-interface {v6, v9}, Landroidx/compose/runtime/Composer;->changed(Z)Z

    .line 192
    .line 193
    .line 194
    move-result v17

    .line 195
    if-eqz v17, :cond_13

    .line 196
    .line 197
    const/high16 v17, 0x100000

    .line 198
    .line 199
    goto :goto_c

    .line 200
    :cond_13
    const/high16 v17, 0x80000

    .line 201
    .line 202
    :goto_c
    or-int v2, v2, v17

    .line 203
    .line 204
    :cond_14
    :goto_d
    const/high16 v17, 0xc00000

    .line 205
    .line 206
    and-int v17, v10, v17

    .line 207
    .line 208
    if-nez v17, :cond_17

    .line 209
    .line 210
    and-int/lit16 v0, v11, 0x80

    .line 211
    .line 212
    if-nez v0, :cond_15

    .line 213
    .line 214
    move-object/from16 v0, p7

    .line 215
    .line 216
    invoke-interface {v6, v0}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 217
    .line 218
    .line 219
    move-result v18

    .line 220
    if-eqz v18, :cond_16

    .line 221
    .line 222
    const/high16 v18, 0x800000

    .line 223
    .line 224
    goto :goto_e

    .line 225
    :cond_15
    move-object/from16 v0, p7

    .line 226
    .line 227
    :cond_16
    const/high16 v18, 0x400000

    .line 228
    .line 229
    :goto_e
    or-int v2, v2, v18

    .line 230
    .line 231
    goto :goto_f

    .line 232
    :cond_17
    move-object/from16 v0, p7

    .line 233
    .line 234
    :goto_f
    and-int/lit16 v0, v11, 0x100

    .line 235
    .line 236
    const/high16 v18, 0x6000000

    .line 237
    .line 238
    if-eqz v0, :cond_19

    .line 239
    .line 240
    or-int v2, v2, v18

    .line 241
    .line 242
    :cond_18
    move/from16 v18, v0

    .line 243
    .line 244
    move-object/from16 v0, p8

    .line 245
    .line 246
    goto :goto_11

    .line 247
    :cond_19
    and-int v18, v10, v18

    .line 248
    .line 249
    if-nez v18, :cond_18

    .line 250
    .line 251
    move/from16 v18, v0

    .line 252
    .line 253
    move-object/from16 v0, p8

    .line 254
    .line 255
    invoke-interface {v6, v0}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 256
    .line 257
    .line 258
    move-result v19

    .line 259
    if-eqz v19, :cond_1a

    .line 260
    .line 261
    const/high16 v19, 0x4000000

    .line 262
    .line 263
    goto :goto_10

    .line 264
    :cond_1a
    const/high16 v19, 0x2000000

    .line 265
    .line 266
    :goto_10
    or-int v2, v2, v19

    .line 267
    .line 268
    :goto_11
    const v19, 0x2492493

    .line 269
    .line 270
    .line 271
    and-int v0, v2, v19

    .line 272
    .line 273
    const v1, 0x2492492

    .line 274
    .line 275
    .line 276
    if-ne v0, v1, :cond_1c

    .line 277
    .line 278
    invoke-interface {v6}, Landroidx/compose/runtime/Composer;->getSkipping()Z

    .line 279
    .line 280
    .line 281
    move-result v0

    .line 282
    if-nez v0, :cond_1b

    .line 283
    .line 284
    goto :goto_13

    .line 285
    :cond_1b
    invoke-interface {v6}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    .line 286
    .line 287
    .line 288
    move-object/from16 v8, p7

    .line 289
    .line 290
    move-object v4, v7

    .line 291
    move v7, v9

    .line 292
    move v5, v12

    .line 293
    move-object/from16 v9, p8

    .line 294
    .line 295
    :goto_12
    move-object v0, v6

    .line 296
    move-object v6, v14

    .line 297
    goto/16 :goto_1d

    .line 298
    .line 299
    :cond_1c
    :goto_13
    invoke-interface {v6}, Landroidx/compose/runtime/Composer;->startDefaults()V

    .line 300
    .line 301
    .line 302
    and-int/lit8 v0, v10, 0x1

    .line 303
    .line 304
    const v1, -0x1c00001

    .line 305
    .line 306
    .line 307
    const/4 v3, 0x6

    .line 308
    const/4 v4, 0x0

    .line 309
    move/from16 p9, v5

    .line 310
    .line 311
    const/4 v5, 0x1

    .line 312
    if-eqz v0, :cond_20

    .line 313
    .line 314
    invoke-interface {v6}, Landroidx/compose/runtime/Composer;->getDefaultsInvalid()Z

    .line 315
    .line 316
    .line 317
    move-result v0

    .line 318
    if-eqz v0, :cond_1d

    .line 319
    .line 320
    goto :goto_14

    .line 321
    :cond_1d
    invoke-interface {v6}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    .line 322
    .line 323
    .line 324
    and-int/lit16 v0, v11, 0x80

    .line 325
    .line 326
    if-eqz v0, :cond_1e

    .line 327
    .line 328
    and-int/2addr v2, v1

    .line 329
    :cond_1e
    move-object/from16 v0, p7

    .line 330
    .line 331
    :cond_1f
    move-object/from16 v13, p8

    .line 332
    .line 333
    move v15, v2

    .line 334
    goto :goto_16

    .line 335
    :cond_20
    :goto_14
    if-eqz p9, :cond_21

    .line 336
    .line 337
    sget-object v0, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    .line 338
    .line 339
    move-object v7, v0

    .line 340
    :cond_21
    if-eqz v8, :cond_22

    .line 341
    .line 342
    move v12, v5

    .line 343
    :cond_22
    if-eqz v13, :cond_23

    .line 344
    .line 345
    move-object v14, v4

    .line 346
    :cond_23
    if-eqz v15, :cond_24

    .line 347
    .line 348
    move v9, v5

    .line 349
    :cond_24
    and-int/lit16 v0, v11, 0x80

    .line 350
    .line 351
    if-eqz v0, :cond_25

    .line 352
    .line 353
    sget-object v0, Landroidx/compose/material3/NavigationRailItemDefaults;->INSTANCE:Landroidx/compose/material3/NavigationRailItemDefaults;

    .line 354
    .line 355
    invoke-virtual {v0, v6, v3}, Landroidx/compose/material3/NavigationRailItemDefaults;->colors(Landroidx/compose/runtime/Composer;I)Landroidx/compose/material3/NavigationRailItemColors;

    .line 356
    .line 357
    .line 358
    move-result-object v0

    .line 359
    and-int/2addr v2, v1

    .line 360
    goto :goto_15

    .line 361
    :cond_25
    move-object/from16 v0, p7

    .line 362
    .line 363
    :goto_15
    if-eqz v18, :cond_1f

    .line 364
    .line 365
    move v15, v2

    .line 366
    move-object v13, v4

    .line 367
    :goto_16
    invoke-interface {v6}, Landroidx/compose/runtime/Composer;->endDefaults()V

    .line 368
    .line 369
    .line 370
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 371
    .line 372
    .line 373
    move-result v1

    .line 374
    if-eqz v1, :cond_26

    .line 375
    .line 376
    const/4 v1, -0x1

    .line 377
    const-string v2, "androidx.compose.material3.NavigationRailItem (NavigationRail.kt:181)"

    .line 378
    .line 379
    const v8, -0x5b6e8a65

    .line 380
    .line 381
    .line 382
    invoke-static {v8, v15, v1, v2}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 383
    .line 384
    .line 385
    :cond_26
    const v1, -0x2ea55868

    .line 386
    .line 387
    .line 388
    invoke-interface {v6, v1}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    .line 389
    .line 390
    .line 391
    if-nez v13, :cond_28

    .line 392
    .line 393
    invoke-interface {v6}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 394
    .line 395
    .line 396
    move-result-object v1

    .line 397
    sget-object v2, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    .line 398
    .line 399
    invoke-virtual {v2}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    .line 400
    .line 401
    .line 402
    move-result-object v2

    .line 403
    if-ne v1, v2, :cond_27

    .line 404
    .line 405
    invoke-static {}, Landroidx/compose/foundation/interaction/InteractionSourceKt;->MutableInteractionSource()Landroidx/compose/foundation/interaction/MutableInteractionSource;

    .line 406
    .line 407
    .line 408
    move-result-object v1

    .line 409
    invoke-interface {v6, v1}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 410
    .line 411
    .line 412
    :cond_27
    check-cast v1, Landroidx/compose/foundation/interaction/MutableInteractionSource;

    .line 413
    .line 414
    goto :goto_17

    .line 415
    :cond_28
    move-object v1, v13

    .line 416
    :goto_17
    invoke-interface {v6}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    .line 417
    .line 418
    .line 419
    new-instance v2, Landroidx/compose/material3/NavigationRailKt$NavigationRailItem$styledIcon$1;

    .line 420
    .line 421
    move/from16 p5, p0

    .line 422
    .line 423
    move-object/from16 p9, p2

    .line 424
    .line 425
    move-object/from16 p4, v0

    .line 426
    .line 427
    move-object/from16 p3, v2

    .line 428
    .line 429
    move/from16 p8, v9

    .line 430
    .line 431
    move/from16 p6, v12

    .line 432
    .line 433
    move-object/from16 p7, v14

    .line 434
    .line 435
    invoke-direct/range {p3 .. p9}, Landroidx/compose/material3/NavigationRailKt$NavigationRailItem$styledIcon$1;-><init>(Landroidx/compose/material3/NavigationRailItemColors;ZZLr6/e;ZLr6/e;)V

    .line 436
    .line 437
    .line 438
    move-object/from16 v8, p3

    .line 439
    .line 440
    move-object/from16 v2, p4

    .line 441
    .line 442
    move/from16 v0, p5

    .line 443
    .line 444
    const v3, -0x3cff324b

    .line 445
    .line 446
    .line 447
    move-object/from16 p3, v7

    .line 448
    .line 449
    const/16 v7, 0x36

    .line 450
    .line 451
    invoke-static {v3, v5, v8, v6, v7}, Landroidx/compose/runtime/internal/ComposableLambdaKt;->rememberComposableLambda(IZLjava/lang/Object;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/internal/ComposableLambda;

    .line 452
    .line 453
    .line 454
    move-result-object v18

    .line 455
    const v3, -0x2ea4f244

    .line 456
    .line 457
    .line 458
    invoke-interface {v6, v3}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    .line 459
    .line 460
    .line 461
    if-nez v14, :cond_29

    .line 462
    .line 463
    move-object/from16 v19, v4

    .line 464
    .line 465
    goto :goto_18

    .line 466
    :cond_29
    new-instance v3, Landroidx/compose/material3/NavigationRailKt$NavigationRailItem$styledLabel$1$1;

    .line 467
    .line 468
    invoke-direct {v3, v2, v0, v12, v14}, Landroidx/compose/material3/NavigationRailKt$NavigationRailItem$styledLabel$1$1;-><init>(Landroidx/compose/material3/NavigationRailItemColors;ZZLr6/e;)V

    .line 469
    .line 470
    .line 471
    const v8, -0x646495f

    .line 472
    .line 473
    .line 474
    invoke-static {v8, v5, v3, v6, v7}, Landroidx/compose/runtime/internal/ComposableLambdaKt;->rememberComposableLambda(IZLjava/lang/Object;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/internal/ComposableLambda;

    .line 475
    .line 476
    .line 477
    move-result-object v3

    .line 478
    move-object/from16 v19, v3

    .line 479
    .line 480
    :goto_18
    invoke-interface {v6}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    .line 481
    .line 482
    .line 483
    sget-object v3, Landroidx/compose/ui/semantics/Role;->Companion:Landroidx/compose/ui/semantics/Role$Companion;

    .line 484
    .line 485
    invoke-virtual {v3}, Landroidx/compose/ui/semantics/Role$Companion;->getTab-o7Vup1c()I

    .line 486
    .line 487
    .line 488
    move-result v3

    .line 489
    const/4 v8, 0x0

    .line 490
    invoke-static {v3}, Landroidx/compose/ui/semantics/Role;->box-impl(I)Landroidx/compose/ui/semantics/Role;

    .line 491
    .line 492
    .line 493
    move-result-object v3

    .line 494
    move-object/from16 p9, p1

    .line 495
    .line 496
    move/from16 p4, v0

    .line 497
    .line 498
    move-object/from16 p5, v1

    .line 499
    .line 500
    move-object/from16 p8, v3

    .line 501
    .line 502
    move-object/from16 p6, v8

    .line 503
    .line 504
    move/from16 p7, v12

    .line 505
    .line 506
    invoke-static/range {p3 .. p9}, Landroidx/compose/foundation/selection/SelectableKt;->selectable-O2vRcR0(Landroidx/compose/ui/Modifier;ZLandroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/foundation/Indication;ZLandroidx/compose/ui/semantics/Role;Lr6/a;)Landroidx/compose/ui/Modifier;

    .line 507
    .line 508
    .line 509
    move-result-object v0

    .line 510
    move-object/from16 v12, p3

    .line 511
    .line 512
    move/from16 v20, p7

    .line 513
    .line 514
    sget v3, Landroidx/compose/material3/NavigationRailKt;->NavigationRailItemHeight:F

    .line 515
    .line 516
    const/4 v8, 0x0

    .line 517
    invoke-static {v0, v8, v3, v5, v4}, Landroidx/compose/foundation/layout/SizeKt;->defaultMinSize-VpY3zN4$default(Landroidx/compose/ui/Modifier;FFILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    .line 518
    .line 519
    .line 520
    move-result-object v0

    .line 521
    sget v3, Landroidx/compose/material3/NavigationRailKt;->NavigationRailItemWidth:F

    .line 522
    .line 523
    const/4 v7, 0x2

    .line 524
    invoke-static {v0, v3, v8, v7, v4}, Landroidx/compose/foundation/layout/SizeKt;->widthIn-VpY3zN4$default(Landroidx/compose/ui/Modifier;FFILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    .line 525
    .line 526
    .line 527
    move-result-object v0

    .line 528
    sget-object v7, Landroidx/compose/ui/Alignment;->Companion:Landroidx/compose/ui/Alignment$Companion;

    .line 529
    .line 530
    invoke-virtual {v7}, Landroidx/compose/ui/Alignment$Companion;->getCenter()Landroidx/compose/ui/Alignment;

    .line 531
    .line 532
    .line 533
    move-result-object v7

    .line 534
    invoke-static {v7, v5}, Landroidx/compose/foundation/layout/BoxKt;->maybeCachedBoxMeasurePolicy(Landroidx/compose/ui/Alignment;Z)Landroidx/compose/ui/layout/MeasurePolicy;

    .line 535
    .line 536
    .line 537
    move-result-object v7

    .line 538
    const/4 v5, 0x0

    .line 539
    invoke-static {v6, v5}, Landroidx/compose/runtime/ComposablesKt;->getCurrentCompositeKeyHash(Landroidx/compose/runtime/Composer;I)I

    .line 540
    .line 541
    .line 542
    move-result v8

    .line 543
    invoke-interface {v6}, Landroidx/compose/runtime/Composer;->getCurrentCompositionLocalMap()Landroidx/compose/runtime/CompositionLocalMap;

    .line 544
    .line 545
    .line 546
    move-result-object v4

    .line 547
    invoke-static {v6, v0}, Landroidx/compose/ui/ComposedModifierKt;->materializeModifier(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    .line 548
    .line 549
    .line 550
    move-result-object v0

    .line 551
    sget-object v5, Landroidx/compose/ui/node/ComposeUiNode;->Companion:Landroidx/compose/ui/node/ComposeUiNode$Companion;

    .line 552
    .line 553
    move-object/from16 p6, v1

    .line 554
    .line 555
    invoke-virtual {v5}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getConstructor()Lr6/a;

    .line 556
    .line 557
    .line 558
    move-result-object v1

    .line 559
    invoke-interface {v6}, Landroidx/compose/runtime/Composer;->getApplier()Landroidx/compose/runtime/Applier;

    .line 560
    .line 561
    .line 562
    move-result-object v22

    .line 563
    if-nez v22, :cond_2a

    .line 564
    .line 565
    invoke-static {}, Landroidx/compose/runtime/ComposablesKt;->invalidApplier()V

    .line 566
    .line 567
    .line 568
    :cond_2a
    invoke-interface {v6}, Landroidx/compose/runtime/Composer;->startReusableNode()V

    .line 569
    .line 570
    .line 571
    invoke-interface {v6}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 572
    .line 573
    .line 574
    move-result v22

    .line 575
    if-eqz v22, :cond_2b

    .line 576
    .line 577
    invoke-interface {v6, v1}, Landroidx/compose/runtime/Composer;->createNode(Lr6/a;)V

    .line 578
    .line 579
    .line 580
    goto :goto_19

    .line 581
    :cond_2b
    invoke-interface {v6}, Landroidx/compose/runtime/Composer;->useNode()V

    .line 582
    .line 583
    .line 584
    :goto_19
    invoke-static {v6}, Landroidx/compose/runtime/Updater;->constructor-impl(Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;

    .line 585
    .line 586
    .line 587
    move-result-object v1

    .line 588
    invoke-static {v5, v1, v7, v1, v4}, Landroidx/collection/a;->r(Landroidx/compose/ui/node/ComposeUiNode$Companion;Landroidx/compose/runtime/Composer;Landroidx/compose/ui/layout/MeasurePolicy;Landroidx/compose/runtime/Composer;Landroidx/compose/runtime/CompositionLocalMap;)Lr6/e;

    .line 589
    .line 590
    .line 591
    move-result-object v4

    .line 592
    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 593
    .line 594
    .line 595
    move-result v7

    .line 596
    if-nez v7, :cond_2c

    .line 597
    .line 598
    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 599
    .line 600
    .line 601
    move-result-object v7

    .line 602
    move-object/from16 v22, v2

    .line 603
    .line 604
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 605
    .line 606
    .line 607
    move-result-object v2

    .line 608
    invoke-static {v7, v2}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 609
    .line 610
    .line 611
    move-result v2

    .line 612
    if-nez v2, :cond_2d

    .line 613
    .line 614
    goto :goto_1a

    .line 615
    :cond_2c
    move-object/from16 v22, v2

    .line 616
    .line 617
    :goto_1a
    invoke-static {v8, v1, v8, v4}, Landroidx/collection/a;->s(ILandroidx/compose/runtime/Composer;ILr6/e;)V

    .line 618
    .line 619
    .line 620
    :cond_2d
    invoke-virtual {v5}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetModifier()Lr6/e;

    .line 621
    .line 622
    .line 623
    move-result-object v2

    .line 624
    invoke-static {v1, v0, v2}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lr6/e;)V

    .line 625
    .line 626
    .line 627
    sget-object v0, Landroidx/compose/foundation/layout/BoxScopeInstance;->INSTANCE:Landroidx/compose/foundation/layout/BoxScopeInstance;

    .line 628
    .line 629
    if-eqz p0, :cond_2e

    .line 630
    .line 631
    const/high16 v0, 0x3f800000    # 1.0f

    .line 632
    .line 633
    move v1, v0

    .line 634
    goto :goto_1b

    .line 635
    :cond_2e
    const/4 v1, 0x0

    .line 636
    :goto_1b
    const/16 v0, 0x96

    .line 637
    .line 638
    const/4 v2, 0x0

    .line 639
    const/4 v4, 0x6

    .line 640
    const/4 v5, 0x0

    .line 641
    invoke-static {v0, v2, v5, v4, v5}, Landroidx/compose/animation/core/AnimationSpecKt;->tween$default(IILandroidx/compose/animation/core/Easing;ILjava/lang/Object;)Landroidx/compose/animation/core/TweenSpec;

    .line 642
    .line 643
    .line 644
    move-result-object v2

    .line 645
    const/16 v7, 0x30

    .line 646
    .line 647
    const/16 v8, 0x1c

    .line 648
    .line 649
    move v0, v3

    .line 650
    const/4 v3, 0x0

    .line 651
    move/from16 v17, v4

    .line 652
    .line 653
    const/4 v4, 0x0

    .line 654
    move-object/from16 v21, v5

    .line 655
    .line 656
    const/4 v5, 0x0

    .line 657
    move v10, v0

    .line 658
    move/from16 p8, v9

    .line 659
    .line 660
    move-object/from16 v0, v22

    .line 661
    .line 662
    const/4 v11, 0x0

    .line 663
    move-object/from16 v9, p6

    .line 664
    .line 665
    invoke-static/range {v1 .. v8}, Landroidx/compose/animation/core/AnimateAsStateKt;->animateFloatAsState(FLandroidx/compose/animation/core/AnimationSpec;FLjava/lang/String;Lr6/c;Landroidx/compose/runtime/Composer;II)Landroidx/compose/runtime/State;

    .line 666
    .line 667
    .line 668
    move-result-object v1

    .line 669
    invoke-static {}, Landroidx/compose/ui/platform/CompositionLocalsKt;->getLocalDensity()Landroidx/compose/runtime/ProvidableCompositionLocal;

    .line 670
    .line 671
    .line 672
    move-result-object v2

    .line 673
    invoke-interface {v6, v2}, Landroidx/compose/runtime/Composer;->consume(Landroidx/compose/runtime/CompositionLocal;)Ljava/lang/Object;

    .line 674
    .line 675
    .line 676
    move-result-object v2

    .line 677
    check-cast v2, Landroidx/compose/ui/unit/Density;

    .line 678
    .line 679
    invoke-interface {v2, v10}, Landroidx/compose/ui/unit/Density;->roundToPx-0680j_4(F)I

    .line 680
    .line 681
    .line 682
    move-result v3

    .line 683
    sget-object v4, Landroidx/compose/material3/tokens/NavigationRailTokens;->INSTANCE:Landroidx/compose/material3/tokens/NavigationRailTokens;

    .line 684
    .line 685
    invoke-virtual {v4}, Landroidx/compose/material3/tokens/NavigationRailTokens;->getActiveIndicatorWidth-D9Ej5fM()F

    .line 686
    .line 687
    .line 688
    move-result v5

    .line 689
    invoke-interface {v2, v5}, Landroidx/compose/ui/unit/Density;->roundToPx-0680j_4(F)I

    .line 690
    .line 691
    .line 692
    move-result v2

    .line 693
    sub-int/2addr v3, v2

    .line 694
    int-to-float v2, v3

    .line 695
    const/4 v7, 0x2

    .line 696
    int-to-float v3, v7

    .line 697
    div-float/2addr v2, v3

    .line 698
    invoke-static {v2, v11}, Landroidx/compose/ui/geometry/OffsetKt;->Offset(FF)J

    .line 699
    .line 700
    .line 701
    move-result-wide v2

    .line 702
    invoke-interface {v6, v9}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 703
    .line 704
    .line 705
    move-result v5

    .line 706
    invoke-interface {v6, v2, v3}, Landroidx/compose/runtime/Composer;->changed(J)Z

    .line 707
    .line 708
    .line 709
    move-result v7

    .line 710
    or-int/2addr v5, v7

    .line 711
    invoke-interface {v6}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 712
    .line 713
    .line 714
    move-result-object v7

    .line 715
    if-nez v5, :cond_2f

    .line 716
    .line 717
    sget-object v5, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    .line 718
    .line 719
    invoke-virtual {v5}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    .line 720
    .line 721
    .line 722
    move-result-object v5

    .line 723
    if-ne v7, v5, :cond_30

    .line 724
    .line 725
    :cond_2f
    new-instance v7, Landroidx/compose/material3/internal/MappedInteractionSource;

    .line 726
    .line 727
    const/4 v5, 0x0

    .line 728
    invoke-direct {v7, v9, v2, v3, v5}, Landroidx/compose/material3/internal/MappedInteractionSource;-><init>(Landroidx/compose/foundation/interaction/InteractionSource;JLkotlin/jvm/internal/e;)V

    .line 729
    .line 730
    .line 731
    invoke-interface {v6, v7}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 732
    .line 733
    .line 734
    :cond_30
    check-cast v7, Landroidx/compose/material3/internal/MappedInteractionSource;

    .line 735
    .line 736
    if-eqz v14, :cond_31

    .line 737
    .line 738
    const v2, 0x22e2e5d8

    .line 739
    .line 740
    .line 741
    invoke-interface {v6, v2}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    .line 742
    .line 743
    .line 744
    invoke-virtual {v4}, Landroidx/compose/material3/tokens/NavigationRailTokens;->getActiveIndicatorShape()Landroidx/compose/material3/tokens/ShapeKeyTokens;

    .line 745
    .line 746
    .line 747
    move-result-object v2

    .line 748
    const/4 v3, 0x6

    .line 749
    invoke-static {v2, v6, v3}, Landroidx/compose/material3/ShapesKt;->getValue(Landroidx/compose/material3/tokens/ShapeKeyTokens;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/graphics/Shape;

    .line 750
    .line 751
    .line 752
    move-result-object v2

    .line 753
    invoke-interface {v6}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    .line 754
    .line 755
    .line 756
    goto :goto_1c

    .line 757
    :cond_31
    const/4 v3, 0x6

    .line 758
    const v2, 0x22e43011

    .line 759
    .line 760
    .line 761
    invoke-interface {v6, v2}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    .line 762
    .line 763
    .line 764
    invoke-virtual {v4}, Landroidx/compose/material3/tokens/NavigationRailTokens;->getNoLabelActiveIndicatorShape()Landroidx/compose/material3/tokens/ShapeKeyTokens;

    .line 765
    .line 766
    .line 767
    move-result-object v2

    .line 768
    invoke-static {v2, v6, v3}, Landroidx/compose/material3/ShapesKt;->getValue(Landroidx/compose/material3/tokens/ShapeKeyTokens;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/graphics/Shape;

    .line 769
    .line 770
    .line 771
    move-result-object v2

    .line 772
    invoke-interface {v6}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    .line 773
    .line 774
    .line 775
    :goto_1c
    new-instance v4, Landroidx/compose/material3/NavigationRailKt$NavigationRailItem$1$indicatorRipple$1;

    .line 776
    .line 777
    invoke-direct {v4, v2, v7}, Landroidx/compose/material3/NavigationRailKt$NavigationRailItem$1$indicatorRipple$1;-><init>(Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material3/internal/MappedInteractionSource;)V

    .line 778
    .line 779
    .line 780
    const v5, 0xc9401ce

    .line 781
    .line 782
    .line 783
    const/16 v7, 0x36

    .line 784
    .line 785
    const/4 v8, 0x1

    .line 786
    invoke-static {v5, v8, v4, v6, v7}, Landroidx/compose/runtime/internal/ComposableLambdaKt;->rememberComposableLambda(IZLjava/lang/Object;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/internal/ComposableLambda;

    .line 787
    .line 788
    .line 789
    move-result-object v4

    .line 790
    new-instance v5, Landroidx/compose/material3/NavigationRailKt$NavigationRailItem$1$indicator$1;

    .line 791
    .line 792
    invoke-direct {v5, v1, v0, v2}, Landroidx/compose/material3/NavigationRailKt$NavigationRailItem$1$indicator$1;-><init>(Landroidx/compose/runtime/State;Landroidx/compose/material3/NavigationRailItemColors;Landroidx/compose/ui/graphics/Shape;)V

    .line 793
    .line 794
    .line 795
    const v2, -0x6efc0a62

    .line 796
    .line 797
    .line 798
    invoke-static {v2, v8, v5, v6, v7}, Landroidx/compose/runtime/internal/ComposableLambdaKt;->rememberComposableLambda(IZLjava/lang/Object;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/internal/ComposableLambda;

    .line 799
    .line 800
    .line 801
    move-result-object v2

    .line 802
    invoke-interface {v6, v1}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 803
    .line 804
    .line 805
    move-result v5

    .line 806
    invoke-interface {v6}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 807
    .line 808
    .line 809
    move-result-object v7

    .line 810
    if-nez v5, :cond_32

    .line 811
    .line 812
    sget-object v5, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    .line 813
    .line 814
    invoke-virtual {v5}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    .line 815
    .line 816
    .line 817
    move-result-object v5

    .line 818
    if-ne v7, v5, :cond_33

    .line 819
    .line 820
    :cond_32
    new-instance v7, Landroidx/compose/material3/NavigationRailKt$NavigationRailItem$1$2$1;

    .line 821
    .line 822
    invoke-direct {v7, v1}, Landroidx/compose/material3/NavigationRailKt$NavigationRailItem$1$2$1;-><init>(Landroidx/compose/runtime/State;)V

    .line 823
    .line 824
    .line 825
    invoke-interface {v6, v7}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 826
    .line 827
    .line 828
    :cond_33
    check-cast v7, Lr6/a;

    .line 829
    .line 830
    const v1, 0xe000

    .line 831
    .line 832
    .line 833
    shr-int/lit8 v3, v15, 0x6

    .line 834
    .line 835
    and-int/2addr v1, v3

    .line 836
    or-int/lit16 v8, v1, 0x1b6

    .line 837
    .line 838
    move-object v1, v7

    .line 839
    move-object v7, v6

    .line 840
    move-object v6, v1

    .line 841
    move/from16 v5, p8

    .line 842
    .line 843
    move-object v1, v4

    .line 844
    move-object/from16 v3, v18

    .line 845
    .line 846
    move-object/from16 v4, v19

    .line 847
    .line 848
    invoke-static/range {v1 .. v8}, Landroidx/compose/material3/NavigationRailKt;->NavigationRailItemLayout(Lr6/e;Lr6/e;Lr6/e;Lr6/e;ZLr6/a;Landroidx/compose/runtime/Composer;I)V

    .line 849
    .line 850
    .line 851
    move-object v6, v7

    .line 852
    invoke-interface {v6}, Landroidx/compose/runtime/Composer;->endNode()V

    .line 853
    .line 854
    .line 855
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 856
    .line 857
    .line 858
    move-result v1

    .line 859
    if-eqz v1, :cond_34

    .line 860
    .line 861
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 862
    .line 863
    .line 864
    :cond_34
    move-object v8, v0

    .line 865
    move v7, v5

    .line 866
    move-object v4, v12

    .line 867
    move-object v9, v13

    .line 868
    move/from16 v5, v20

    .line 869
    .line 870
    goto/16 :goto_12

    .line 871
    .line 872
    :goto_1d
    invoke-interface {v0}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    .line 873
    .line 874
    .line 875
    move-result-object v12

    .line 876
    if-eqz v12, :cond_35

    .line 877
    .line 878
    new-instance v0, Landroidx/compose/material3/NavigationRailKt$NavigationRailItem$2;

    .line 879
    .line 880
    move/from16 v1, p0

    .line 881
    .line 882
    move-object/from16 v2, p1

    .line 883
    .line 884
    move-object/from16 v3, p2

    .line 885
    .line 886
    move/from16 v10, p10

    .line 887
    .line 888
    move/from16 v11, p11

    .line 889
    .line 890
    invoke-direct/range {v0 .. v11}, Landroidx/compose/material3/NavigationRailKt$NavigationRailItem$2;-><init>(ZLr6/a;Lr6/e;Landroidx/compose/ui/Modifier;ZLr6/e;ZLandroidx/compose/material3/NavigationRailItemColors;Landroidx/compose/foundation/interaction/MutableInteractionSource;II)V

    .line 891
    .line 892
    .line 893
    invoke-interface {v12, v0}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lr6/e;)V

    .line 894
    .line 895
    .line 896
    :cond_35
    return-void
.end method

.method private static final NavigationRailItemLayout(Lr6/e;Lr6/e;Lr6/e;Lr6/e;ZLr6/a;Landroidx/compose/runtime/Composer;I)V
    .locals 18
    .annotation build Landroidx/compose/runtime/Composable;
    .end annotation

    .annotation build Landroidx/compose/runtime/ComposableInferredTarget;
        scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lr6/e;",
            "Lr6/e;",
            "Lr6/e;",
            "Lr6/e;",
            "Z",
            "Lr6/a;",
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
    move/from16 v5, p4

    .line 10
    .line 11
    move-object/from16 v6, p5

    .line 12
    .line 13
    move/from16 v7, p7

    .line 14
    .line 15
    const v0, 0x594fc274

    .line 16
    .line 17
    .line 18
    move-object/from16 v8, p6

    .line 19
    .line 20
    invoke-interface {v8, v0}, Landroidx/compose/runtime/Composer;->startRestartGroup(I)Landroidx/compose/runtime/Composer;

    .line 21
    .line 22
    .line 23
    move-result-object v8

    .line 24
    and-int/lit8 v9, v7, 0x6

    .line 25
    .line 26
    if-nez v9, :cond_1

    .line 27
    .line 28
    invoke-interface {v8, v1}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 29
    .line 30
    .line 31
    move-result v9

    .line 32
    if-eqz v9, :cond_0

    .line 33
    .line 34
    const/4 v9, 0x4

    .line 35
    goto :goto_0

    .line 36
    :cond_0
    const/4 v9, 0x2

    .line 37
    :goto_0
    or-int/2addr v9, v7

    .line 38
    goto :goto_1

    .line 39
    :cond_1
    move v9, v7

    .line 40
    :goto_1
    and-int/lit8 v10, v7, 0x30

    .line 41
    .line 42
    if-nez v10, :cond_3

    .line 43
    .line 44
    invoke-interface {v8, v2}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 45
    .line 46
    .line 47
    move-result v10

    .line 48
    if-eqz v10, :cond_2

    .line 49
    .line 50
    const/16 v10, 0x20

    .line 51
    .line 52
    goto :goto_2

    .line 53
    :cond_2
    const/16 v10, 0x10

    .line 54
    .line 55
    :goto_2
    or-int/2addr v9, v10

    .line 56
    :cond_3
    and-int/lit16 v10, v7, 0x180

    .line 57
    .line 58
    if-nez v10, :cond_5

    .line 59
    .line 60
    invoke-interface {v8, v3}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 61
    .line 62
    .line 63
    move-result v10

    .line 64
    if-eqz v10, :cond_4

    .line 65
    .line 66
    const/16 v10, 0x100

    .line 67
    .line 68
    goto :goto_3

    .line 69
    :cond_4
    const/16 v10, 0x80

    .line 70
    .line 71
    :goto_3
    or-int/2addr v9, v10

    .line 72
    :cond_5
    and-int/lit16 v10, v7, 0xc00

    .line 73
    .line 74
    const/16 v11, 0x800

    .line 75
    .line 76
    if-nez v10, :cond_7

    .line 77
    .line 78
    invoke-interface {v8, v4}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 79
    .line 80
    .line 81
    move-result v10

    .line 82
    if-eqz v10, :cond_6

    .line 83
    .line 84
    move v10, v11

    .line 85
    goto :goto_4

    .line 86
    :cond_6
    const/16 v10, 0x400

    .line 87
    .line 88
    :goto_4
    or-int/2addr v9, v10

    .line 89
    :cond_7
    and-int/lit16 v10, v7, 0x6000

    .line 90
    .line 91
    const/16 v12, 0x4000

    .line 92
    .line 93
    if-nez v10, :cond_9

    .line 94
    .line 95
    invoke-interface {v8, v5}, Landroidx/compose/runtime/Composer;->changed(Z)Z

    .line 96
    .line 97
    .line 98
    move-result v10

    .line 99
    if-eqz v10, :cond_8

    .line 100
    .line 101
    move v10, v12

    .line 102
    goto :goto_5

    .line 103
    :cond_8
    const/16 v10, 0x2000

    .line 104
    .line 105
    :goto_5
    or-int/2addr v9, v10

    .line 106
    :cond_9
    const/high16 v10, 0x30000

    .line 107
    .line 108
    and-int/2addr v10, v7

    .line 109
    const/high16 v13, 0x20000

    .line 110
    .line 111
    if-nez v10, :cond_b

    .line 112
    .line 113
    invoke-interface {v8, v6}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 114
    .line 115
    .line 116
    move-result v10

    .line 117
    if-eqz v10, :cond_a

    .line 118
    .line 119
    move v10, v13

    .line 120
    goto :goto_6

    .line 121
    :cond_a
    const/high16 v10, 0x10000

    .line 122
    .line 123
    :goto_6
    or-int/2addr v9, v10

    .line 124
    :cond_b
    const v10, 0x12493

    .line 125
    .line 126
    .line 127
    and-int/2addr v10, v9

    .line 128
    const v14, 0x12492

    .line 129
    .line 130
    .line 131
    if-ne v10, v14, :cond_d

    .line 132
    .line 133
    invoke-interface {v8}, Landroidx/compose/runtime/Composer;->getSkipping()Z

    .line 134
    .line 135
    .line 136
    move-result v10

    .line 137
    if-nez v10, :cond_c

    .line 138
    .line 139
    goto :goto_7

    .line 140
    :cond_c
    invoke-interface {v8}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    .line 141
    .line 142
    .line 143
    goto/16 :goto_12

    .line 144
    .line 145
    :cond_d
    :goto_7
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 146
    .line 147
    .line 148
    move-result v10

    .line 149
    if-eqz v10, :cond_e

    .line 150
    .line 151
    const/4 v10, -0x1

    .line 152
    const-string v14, "androidx.compose.material3.NavigationRailItemLayout (NavigationRail.kt:514)"

    .line 153
    .line 154
    invoke-static {v0, v9, v10, v14}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 155
    .line 156
    .line 157
    :cond_e
    const/high16 v0, 0x70000

    .line 158
    .line 159
    and-int/2addr v0, v9

    .line 160
    const/4 v14, 0x0

    .line 161
    if-ne v0, v13, :cond_f

    .line 162
    .line 163
    const/4 v15, 0x1

    .line 164
    goto :goto_8

    .line 165
    :cond_f
    move v15, v14

    .line 166
    :goto_8
    and-int/lit16 v10, v9, 0x1c00

    .line 167
    .line 168
    if-ne v10, v11, :cond_10

    .line 169
    .line 170
    const/4 v10, 0x1

    .line 171
    goto :goto_9

    .line 172
    :cond_10
    move v10, v14

    .line 173
    :goto_9
    or-int/2addr v10, v15

    .line 174
    const v11, 0xe000

    .line 175
    .line 176
    .line 177
    and-int/2addr v11, v9

    .line 178
    if-ne v11, v12, :cond_11

    .line 179
    .line 180
    const/4 v15, 0x1

    .line 181
    goto :goto_a

    .line 182
    :cond_11
    move v15, v14

    .line 183
    :goto_a
    or-int/2addr v10, v15

    .line 184
    invoke-interface {v8}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 185
    .line 186
    .line 187
    move-result-object v15

    .line 188
    if-nez v10, :cond_12

    .line 189
    .line 190
    sget-object v10, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    .line 191
    .line 192
    invoke-virtual {v10}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    .line 193
    .line 194
    .line 195
    move-result-object v10

    .line 196
    if-ne v15, v10, :cond_13

    .line 197
    .line 198
    :cond_12
    new-instance v15, Landroidx/compose/material3/NavigationRailKt$NavigationRailItemLayout$2$1;

    .line 199
    .line 200
    invoke-direct {v15, v6, v4, v5}, Landroidx/compose/material3/NavigationRailKt$NavigationRailItemLayout$2$1;-><init>(Lr6/a;Lr6/e;Z)V

    .line 201
    .line 202
    .line 203
    invoke-interface {v8, v15}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 204
    .line 205
    .line 206
    :cond_13
    check-cast v15, Landroidx/compose/ui/layout/MeasurePolicy;

    .line 207
    .line 208
    sget-object v10, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    .line 209
    .line 210
    invoke-static {v8, v14}, Landroidx/compose/runtime/ComposablesKt;->getCurrentCompositeKeyHash(Landroidx/compose/runtime/Composer;I)I

    .line 211
    .line 212
    .line 213
    move-result v13

    .line 214
    invoke-interface {v8}, Landroidx/compose/runtime/Composer;->getCurrentCompositionLocalMap()Landroidx/compose/runtime/CompositionLocalMap;

    .line 215
    .line 216
    .line 217
    move-result-object v12

    .line 218
    invoke-static {v8, v10}, Landroidx/compose/ui/ComposedModifierKt;->materializeModifier(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    .line 219
    .line 220
    .line 221
    move-result-object v14

    .line 222
    sget-object v7, Landroidx/compose/ui/node/ComposeUiNode;->Companion:Landroidx/compose/ui/node/ComposeUiNode$Companion;

    .line 223
    .line 224
    move/from16 v16, v9

    .line 225
    .line 226
    invoke-virtual {v7}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getConstructor()Lr6/a;

    .line 227
    .line 228
    .line 229
    move-result-object v9

    .line 230
    invoke-interface {v8}, Landroidx/compose/runtime/Composer;->getApplier()Landroidx/compose/runtime/Applier;

    .line 231
    .line 232
    .line 233
    move-result-object v17

    .line 234
    if-nez v17, :cond_14

    .line 235
    .line 236
    invoke-static {}, Landroidx/compose/runtime/ComposablesKt;->invalidApplier()V

    .line 237
    .line 238
    .line 239
    :cond_14
    invoke-interface {v8}, Landroidx/compose/runtime/Composer;->startReusableNode()V

    .line 240
    .line 241
    .line 242
    invoke-interface {v8}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 243
    .line 244
    .line 245
    move-result v17

    .line 246
    if-eqz v17, :cond_15

    .line 247
    .line 248
    invoke-interface {v8, v9}, Landroidx/compose/runtime/Composer;->createNode(Lr6/a;)V

    .line 249
    .line 250
    .line 251
    goto :goto_b

    .line 252
    :cond_15
    invoke-interface {v8}, Landroidx/compose/runtime/Composer;->useNode()V

    .line 253
    .line 254
    .line 255
    :goto_b
    invoke-static {v8}, Landroidx/compose/runtime/Updater;->constructor-impl(Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;

    .line 256
    .line 257
    .line 258
    move-result-object v9

    .line 259
    invoke-static {v7, v9, v15, v9, v12}, Landroidx/collection/a;->r(Landroidx/compose/ui/node/ComposeUiNode$Companion;Landroidx/compose/runtime/Composer;Landroidx/compose/ui/layout/MeasurePolicy;Landroidx/compose/runtime/Composer;Landroidx/compose/runtime/CompositionLocalMap;)Lr6/e;

    .line 260
    .line 261
    .line 262
    move-result-object v12

    .line 263
    invoke-interface {v9}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 264
    .line 265
    .line 266
    move-result v15

    .line 267
    if-nez v15, :cond_16

    .line 268
    .line 269
    invoke-interface {v9}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 270
    .line 271
    .line 272
    move-result-object v15

    .line 273
    invoke-static {v13}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 274
    .line 275
    .line 276
    move-result-object v4

    .line 277
    invoke-static {v15, v4}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 278
    .line 279
    .line 280
    move-result v4

    .line 281
    if-nez v4, :cond_17

    .line 282
    .line 283
    :cond_16
    invoke-static {v13, v9, v13, v12}, Landroidx/collection/a;->s(ILandroidx/compose/runtime/Composer;ILr6/e;)V

    .line 284
    .line 285
    .line 286
    :cond_17
    invoke-virtual {v7}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetModifier()Lr6/e;

    .line 287
    .line 288
    .line 289
    move-result-object v4

    .line 290
    invoke-static {v9, v14, v4}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lr6/e;)V

    .line 291
    .line 292
    .line 293
    and-int/lit8 v4, v16, 0xe

    .line 294
    .line 295
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 296
    .line 297
    .line 298
    move-result-object v4

    .line 299
    invoke-interface {v1, v8, v4}, Lr6/e;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 300
    .line 301
    .line 302
    shr-int/lit8 v4, v16, 0x3

    .line 303
    .line 304
    and-int/lit8 v4, v4, 0xe

    .line 305
    .line 306
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 307
    .line 308
    .line 309
    move-result-object v4

    .line 310
    invoke-interface {v2, v8, v4}, Lr6/e;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 311
    .line 312
    .line 313
    const-string v4, "icon"

    .line 314
    .line 315
    invoke-static {v10, v4}, Landroidx/compose/ui/layout/LayoutIdKt;->layoutId(Landroidx/compose/ui/Modifier;Ljava/lang/Object;)Landroidx/compose/ui/Modifier;

    .line 316
    .line 317
    .line 318
    move-result-object v4

    .line 319
    sget-object v9, Landroidx/compose/ui/Alignment;->Companion:Landroidx/compose/ui/Alignment$Companion;

    .line 320
    .line 321
    invoke-virtual {v9}, Landroidx/compose/ui/Alignment$Companion;->getTopStart()Landroidx/compose/ui/Alignment;

    .line 322
    .line 323
    .line 324
    move-result-object v12

    .line 325
    const/4 v13, 0x0

    .line 326
    invoke-static {v12, v13}, Landroidx/compose/foundation/layout/BoxKt;->maybeCachedBoxMeasurePolicy(Landroidx/compose/ui/Alignment;Z)Landroidx/compose/ui/layout/MeasurePolicy;

    .line 327
    .line 328
    .line 329
    move-result-object v12

    .line 330
    invoke-static {v8, v13}, Landroidx/compose/runtime/ComposablesKt;->getCurrentCompositeKeyHash(Landroidx/compose/runtime/Composer;I)I

    .line 331
    .line 332
    .line 333
    move-result v14

    .line 334
    invoke-interface {v8}, Landroidx/compose/runtime/Composer;->getCurrentCompositionLocalMap()Landroidx/compose/runtime/CompositionLocalMap;

    .line 335
    .line 336
    .line 337
    move-result-object v13

    .line 338
    invoke-static {v8, v4}, Landroidx/compose/ui/ComposedModifierKt;->materializeModifier(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    .line 339
    .line 340
    .line 341
    move-result-object v4

    .line 342
    invoke-virtual {v7}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getConstructor()Lr6/a;

    .line 343
    .line 344
    .line 345
    move-result-object v15

    .line 346
    invoke-interface {v8}, Landroidx/compose/runtime/Composer;->getApplier()Landroidx/compose/runtime/Applier;

    .line 347
    .line 348
    .line 349
    move-result-object v17

    .line 350
    if-nez v17, :cond_18

    .line 351
    .line 352
    invoke-static {}, Landroidx/compose/runtime/ComposablesKt;->invalidApplier()V

    .line 353
    .line 354
    .line 355
    :cond_18
    invoke-interface {v8}, Landroidx/compose/runtime/Composer;->startReusableNode()V

    .line 356
    .line 357
    .line 358
    invoke-interface {v8}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 359
    .line 360
    .line 361
    move-result v17

    .line 362
    if-eqz v17, :cond_19

    .line 363
    .line 364
    invoke-interface {v8, v15}, Landroidx/compose/runtime/Composer;->createNode(Lr6/a;)V

    .line 365
    .line 366
    .line 367
    goto :goto_c

    .line 368
    :cond_19
    invoke-interface {v8}, Landroidx/compose/runtime/Composer;->useNode()V

    .line 369
    .line 370
    .line 371
    :goto_c
    invoke-static {v8}, Landroidx/compose/runtime/Updater;->constructor-impl(Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;

    .line 372
    .line 373
    .line 374
    move-result-object v15

    .line 375
    invoke-static {v7, v15, v12, v15, v13}, Landroidx/collection/a;->r(Landroidx/compose/ui/node/ComposeUiNode$Companion;Landroidx/compose/runtime/Composer;Landroidx/compose/ui/layout/MeasurePolicy;Landroidx/compose/runtime/Composer;Landroidx/compose/runtime/CompositionLocalMap;)Lr6/e;

    .line 376
    .line 377
    .line 378
    move-result-object v12

    .line 379
    invoke-interface {v15}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 380
    .line 381
    .line 382
    move-result v13

    .line 383
    if-nez v13, :cond_1a

    .line 384
    .line 385
    invoke-interface {v15}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 386
    .line 387
    .line 388
    move-result-object v13

    .line 389
    invoke-static {v14}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 390
    .line 391
    .line 392
    move-result-object v1

    .line 393
    invoke-static {v13, v1}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 394
    .line 395
    .line 396
    move-result v1

    .line 397
    if-nez v1, :cond_1b

    .line 398
    .line 399
    :cond_1a
    invoke-static {v14, v15, v14, v12}, Landroidx/collection/a;->s(ILandroidx/compose/runtime/Composer;ILr6/e;)V

    .line 400
    .line 401
    .line 402
    :cond_1b
    invoke-virtual {v7}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetModifier()Lr6/e;

    .line 403
    .line 404
    .line 405
    move-result-object v1

    .line 406
    invoke-static {v15, v4, v1}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lr6/e;)V

    .line 407
    .line 408
    .line 409
    sget-object v1, Landroidx/compose/foundation/layout/BoxScopeInstance;->INSTANCE:Landroidx/compose/foundation/layout/BoxScopeInstance;

    .line 410
    .line 411
    shr-int/lit8 v1, v16, 0x6

    .line 412
    .line 413
    and-int/lit8 v1, v1, 0xe

    .line 414
    .line 415
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 416
    .line 417
    .line 418
    move-result-object v1

    .line 419
    invoke-interface {v3, v8, v1}, Lr6/e;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 420
    .line 421
    .line 422
    invoke-interface {v8}, Landroidx/compose/runtime/Composer;->endNode()V

    .line 423
    .line 424
    .line 425
    const v1, 0x7fe0386d

    .line 426
    .line 427
    .line 428
    invoke-interface {v8, v1}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    .line 429
    .line 430
    .line 431
    if-eqz p3, :cond_24

    .line 432
    .line 433
    const-string v1, "label"

    .line 434
    .line 435
    invoke-static {v10, v1}, Landroidx/compose/ui/layout/LayoutIdKt;->layoutId(Landroidx/compose/ui/Modifier;Ljava/lang/Object;)Landroidx/compose/ui/Modifier;

    .line 436
    .line 437
    .line 438
    move-result-object v1

    .line 439
    const/16 v4, 0x4000

    .line 440
    .line 441
    if-ne v11, v4, :cond_1c

    .line 442
    .line 443
    const/4 v13, 0x1

    .line 444
    :goto_d
    const/high16 v4, 0x20000

    .line 445
    .line 446
    goto :goto_e

    .line 447
    :cond_1c
    const/4 v13, 0x0

    .line 448
    goto :goto_d

    .line 449
    :goto_e
    if-ne v0, v4, :cond_1d

    .line 450
    .line 451
    const/4 v10, 0x1

    .line 452
    goto :goto_f

    .line 453
    :cond_1d
    const/4 v10, 0x0

    .line 454
    :goto_f
    or-int v0, v13, v10

    .line 455
    .line 456
    invoke-interface {v8}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 457
    .line 458
    .line 459
    move-result-object v4

    .line 460
    if-nez v0, :cond_1e

    .line 461
    .line 462
    sget-object v0, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    .line 463
    .line 464
    invoke-virtual {v0}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    .line 465
    .line 466
    .line 467
    move-result-object v0

    .line 468
    if-ne v4, v0, :cond_1f

    .line 469
    .line 470
    :cond_1e
    new-instance v4, Landroidx/compose/material3/NavigationRailKt$NavigationRailItemLayout$1$2$1;

    .line 471
    .line 472
    invoke-direct {v4, v5, v6}, Landroidx/compose/material3/NavigationRailKt$NavigationRailItemLayout$1$2$1;-><init>(ZLr6/a;)V

    .line 473
    .line 474
    .line 475
    invoke-interface {v8, v4}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 476
    .line 477
    .line 478
    :cond_1f
    check-cast v4, Lr6/c;

    .line 479
    .line 480
    invoke-static {v1, v4}, Landroidx/compose/ui/graphics/GraphicsLayerModifierKt;->graphicsLayer(Landroidx/compose/ui/Modifier;Lr6/c;)Landroidx/compose/ui/Modifier;

    .line 481
    .line 482
    .line 483
    move-result-object v0

    .line 484
    invoke-virtual {v9}, Landroidx/compose/ui/Alignment$Companion;->getTopStart()Landroidx/compose/ui/Alignment;

    .line 485
    .line 486
    .line 487
    move-result-object v1

    .line 488
    const/4 v13, 0x0

    .line 489
    invoke-static {v1, v13}, Landroidx/compose/foundation/layout/BoxKt;->maybeCachedBoxMeasurePolicy(Landroidx/compose/ui/Alignment;Z)Landroidx/compose/ui/layout/MeasurePolicy;

    .line 490
    .line 491
    .line 492
    move-result-object v1

    .line 493
    invoke-static {v8, v13}, Landroidx/compose/runtime/ComposablesKt;->getCurrentCompositeKeyHash(Landroidx/compose/runtime/Composer;I)I

    .line 494
    .line 495
    .line 496
    move-result v4

    .line 497
    invoke-interface {v8}, Landroidx/compose/runtime/Composer;->getCurrentCompositionLocalMap()Landroidx/compose/runtime/CompositionLocalMap;

    .line 498
    .line 499
    .line 500
    move-result-object v9

    .line 501
    invoke-static {v8, v0}, Landroidx/compose/ui/ComposedModifierKt;->materializeModifier(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    .line 502
    .line 503
    .line 504
    move-result-object v0

    .line 505
    invoke-virtual {v7}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getConstructor()Lr6/a;

    .line 506
    .line 507
    .line 508
    move-result-object v10

    .line 509
    invoke-interface {v8}, Landroidx/compose/runtime/Composer;->getApplier()Landroidx/compose/runtime/Applier;

    .line 510
    .line 511
    .line 512
    move-result-object v11

    .line 513
    if-nez v11, :cond_20

    .line 514
    .line 515
    invoke-static {}, Landroidx/compose/runtime/ComposablesKt;->invalidApplier()V

    .line 516
    .line 517
    .line 518
    :cond_20
    invoke-interface {v8}, Landroidx/compose/runtime/Composer;->startReusableNode()V

    .line 519
    .line 520
    .line 521
    invoke-interface {v8}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 522
    .line 523
    .line 524
    move-result v11

    .line 525
    if-eqz v11, :cond_21

    .line 526
    .line 527
    invoke-interface {v8, v10}, Landroidx/compose/runtime/Composer;->createNode(Lr6/a;)V

    .line 528
    .line 529
    .line 530
    goto :goto_10

    .line 531
    :cond_21
    invoke-interface {v8}, Landroidx/compose/runtime/Composer;->useNode()V

    .line 532
    .line 533
    .line 534
    :goto_10
    invoke-static {v8}, Landroidx/compose/runtime/Updater;->constructor-impl(Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;

    .line 535
    .line 536
    .line 537
    move-result-object v10

    .line 538
    invoke-static {v7, v10, v1, v10, v9}, Landroidx/collection/a;->r(Landroidx/compose/ui/node/ComposeUiNode$Companion;Landroidx/compose/runtime/Composer;Landroidx/compose/ui/layout/MeasurePolicy;Landroidx/compose/runtime/Composer;Landroidx/compose/runtime/CompositionLocalMap;)Lr6/e;

    .line 539
    .line 540
    .line 541
    move-result-object v1

    .line 542
    invoke-interface {v10}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 543
    .line 544
    .line 545
    move-result v9

    .line 546
    if-nez v9, :cond_22

    .line 547
    .line 548
    invoke-interface {v10}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 549
    .line 550
    .line 551
    move-result-object v9

    .line 552
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 553
    .line 554
    .line 555
    move-result-object v11

    .line 556
    invoke-static {v9, v11}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 557
    .line 558
    .line 559
    move-result v9

    .line 560
    if-nez v9, :cond_23

    .line 561
    .line 562
    :cond_22
    invoke-static {v4, v10, v4, v1}, Landroidx/collection/a;->s(ILandroidx/compose/runtime/Composer;ILr6/e;)V

    .line 563
    .line 564
    .line 565
    :cond_23
    invoke-virtual {v7}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetModifier()Lr6/e;

    .line 566
    .line 567
    .line 568
    move-result-object v1

    .line 569
    invoke-static {v10, v0, v1}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lr6/e;)V

    .line 570
    .line 571
    .line 572
    shr-int/lit8 v0, v16, 0x9

    .line 573
    .line 574
    and-int/lit8 v0, v0, 0xe

    .line 575
    .line 576
    move-object/from16 v4, p3

    .line 577
    .line 578
    invoke-static {v8, v0, v4}, Landroidx/collection/a;->u(Landroidx/compose/runtime/Composer;ILr6/e;)V

    .line 579
    .line 580
    .line 581
    goto :goto_11

    .line 582
    :cond_24
    move-object/from16 v4, p3

    .line 583
    .line 584
    :goto_11
    invoke-static {v8}, Landroidx/collection/a;->x(Landroidx/compose/runtime/Composer;)Z

    .line 585
    .line 586
    .line 587
    move-result v0

    .line 588
    if-eqz v0, :cond_25

    .line 589
    .line 590
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 591
    .line 592
    .line 593
    :cond_25
    :goto_12
    invoke-interface {v8}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    .line 594
    .line 595
    .line 596
    move-result-object v8

    .line 597
    if-eqz v8, :cond_26

    .line 598
    .line 599
    new-instance v0, Landroidx/compose/material3/NavigationRailKt$NavigationRailItemLayout$3;

    .line 600
    .line 601
    move-object/from16 v1, p0

    .line 602
    .line 603
    move/from16 v7, p7

    .line 604
    .line 605
    invoke-direct/range {v0 .. v7}, Landroidx/compose/material3/NavigationRailKt$NavigationRailItemLayout$3;-><init>(Lr6/e;Lr6/e;Lr6/e;Lr6/e;ZLr6/a;I)V

    .line 606
    .line 607
    .line 608
    invoke-interface {v8, v0}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lr6/e;)V

    .line 609
    .line 610
    .line 611
    :cond_26
    return-void
.end method

.method public static final synthetic access$NavigationRailItemLayout(Lr6/e;Lr6/e;Lr6/e;Lr6/e;ZLr6/a;Landroidx/compose/runtime/Composer;I)V
    .locals 0

    .line 1
    invoke-static/range {p0 .. p7}, Landroidx/compose/material3/NavigationRailKt;->NavigationRailItemLayout(Lr6/e;Lr6/e;Lr6/e;Lr6/e;ZLr6/a;Landroidx/compose/runtime/Composer;I)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static final synthetic access$getIndicatorHorizontalPadding$p()F
    .locals 1

    .line 1
    sget v0, Landroidx/compose/material3/NavigationRailKt;->IndicatorHorizontalPadding:F

    .line 2
    .line 3
    return v0
.end method

.method public static final synthetic access$getIndicatorVerticalPaddingNoLabel$p()F
    .locals 1

    .line 1
    sget v0, Landroidx/compose/material3/NavigationRailKt;->IndicatorVerticalPaddingNoLabel:F

    .line 2
    .line 3
    return v0
.end method

.method public static final synthetic access$getIndicatorVerticalPaddingWithLabel$p()F
    .locals 1

    .line 1
    sget v0, Landroidx/compose/material3/NavigationRailKt;->IndicatorVerticalPaddingWithLabel:F

    .line 2
    .line 3
    return v0
.end method

.method public static final synthetic access$getNavigationRailHeaderPadding$p()F
    .locals 1

    .line 1
    sget v0, Landroidx/compose/material3/NavigationRailKt;->NavigationRailHeaderPadding:F

    .line 2
    .line 3
    return v0
.end method

.method public static final synthetic access$placeIcon-X9ElhV4(Landroidx/compose/ui/layout/MeasureScope;Landroidx/compose/ui/layout/Placeable;Landroidx/compose/ui/layout/Placeable;Landroidx/compose/ui/layout/Placeable;J)Landroidx/compose/ui/layout/MeasureResult;
    .locals 0

    .line 1
    invoke-static/range {p0 .. p5}, Landroidx/compose/material3/NavigationRailKt;->placeIcon-X9ElhV4(Landroidx/compose/ui/layout/MeasureScope;Landroidx/compose/ui/layout/Placeable;Landroidx/compose/ui/layout/Placeable;Landroidx/compose/ui/layout/Placeable;J)Landroidx/compose/ui/layout/MeasureResult;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static final synthetic access$placeLabelAndIcon-zUg2_y0(Landroidx/compose/ui/layout/MeasureScope;Landroidx/compose/ui/layout/Placeable;Landroidx/compose/ui/layout/Placeable;Landroidx/compose/ui/layout/Placeable;Landroidx/compose/ui/layout/Placeable;JZF)Landroidx/compose/ui/layout/MeasureResult;
    .locals 0

    .line 1
    invoke-static/range {p0 .. p8}, Landroidx/compose/material3/NavigationRailKt;->placeLabelAndIcon-zUg2_y0(Landroidx/compose/ui/layout/MeasureScope;Landroidx/compose/ui/layout/Placeable;Landroidx/compose/ui/layout/Placeable;Landroidx/compose/ui/layout/Placeable;Landroidx/compose/ui/layout/Placeable;JZF)Landroidx/compose/ui/layout/MeasureResult;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static final getNavigationRailItemHeight()F
    .locals 1

    .line 1
    sget v0, Landroidx/compose/material3/NavigationRailKt;->NavigationRailItemHeight:F

    .line 2
    .line 3
    return v0
.end method

.method public static final getNavigationRailItemVerticalPadding()F
    .locals 1

    .line 1
    sget v0, Landroidx/compose/material3/NavigationRailKt;->NavigationRailItemVerticalPadding:F

    .line 2
    .line 3
    return v0
.end method

.method public static final getNavigationRailItemWidth()F
    .locals 1

    .line 1
    sget v0, Landroidx/compose/material3/NavigationRailKt;->NavigationRailItemWidth:F

    .line 2
    .line 3
    return v0
.end method

.method public static final getNavigationRailVerticalPadding()F
    .locals 1

    .line 1
    sget v0, Landroidx/compose/material3/NavigationRailKt;->NavigationRailVerticalPadding:F

    .line 2
    .line 3
    return v0
.end method

.method private static final placeIcon-X9ElhV4(Landroidx/compose/ui/layout/MeasureScope;Landroidx/compose/ui/layout/Placeable;Landroidx/compose/ui/layout/Placeable;Landroidx/compose/ui/layout/Placeable;J)Landroidx/compose/ui/layout/MeasureResult;
    .locals 11

    .line 1
    move-wide v0, p4

    .line 2
    invoke-virtual {p1}, Landroidx/compose/ui/layout/Placeable;->getWidth()I

    .line 3
    .line 4
    .line 5
    move-result v3

    .line 6
    invoke-virtual {p2}, Landroidx/compose/ui/layout/Placeable;->getWidth()I

    .line 7
    .line 8
    .line 9
    move-result v4

    .line 10
    if-eqz p3, :cond_0

    .line 11
    .line 12
    invoke-virtual {p3}, Landroidx/compose/ui/layout/Placeable;->getWidth()I

    .line 13
    .line 14
    .line 15
    move-result v6

    .line 16
    goto :goto_0

    .line 17
    :cond_0
    const/4 v6, 0x0

    .line 18
    :goto_0
    invoke-static {v4, v6}, Ljava/lang/Math;->max(II)I

    .line 19
    .line 20
    .line 21
    move-result v4

    .line 22
    invoke-static {v3, v4}, Ljava/lang/Math;->max(II)I

    .line 23
    .line 24
    .line 25
    move-result v3

    .line 26
    invoke-static {v0, v1, v3}, Landroidx/compose/ui/unit/ConstraintsKt;->constrainWidth-K40F9xA(JI)I

    .line 27
    .line 28
    .line 29
    move-result v8

    .line 30
    sget v3, Landroidx/compose/material3/NavigationRailKt;->NavigationRailItemHeight:F

    .line 31
    .line 32
    invoke-interface {p0, v3}, Landroidx/compose/ui/unit/Density;->roundToPx-0680j_4(F)I

    .line 33
    .line 34
    .line 35
    move-result v3

    .line 36
    invoke-static {v0, v1, v3}, Landroidx/compose/ui/unit/ConstraintsKt;->constrainHeight-K40F9xA(JI)I

    .line 37
    .line 38
    .line 39
    move-result v6

    .line 40
    const/4 v0, 0x2

    .line 41
    invoke-static {p1, v8, v0}, Landroidx/collection/a;->C(Landroidx/compose/ui/layout/Placeable;II)I

    .line 42
    .line 43
    .line 44
    move-result v3

    .line 45
    invoke-static {p1, v6, v0}, Landroidx/collection/a;->g(Landroidx/compose/ui/layout/Placeable;II)I

    .line 46
    .line 47
    .line 48
    move-result v4

    .line 49
    invoke-static {p2, v8, v0}, Landroidx/collection/a;->C(Landroidx/compose/ui/layout/Placeable;II)I

    .line 50
    .line 51
    .line 52
    move-result v1

    .line 53
    invoke-static {p2, v6, v0}, Landroidx/collection/a;->g(Landroidx/compose/ui/layout/Placeable;II)I

    .line 54
    .line 55
    .line 56
    move-result v7

    .line 57
    new-instance v0, Landroidx/compose/material3/NavigationRailKt$placeIcon$1;

    .line 58
    .line 59
    move-object v2, p1

    .line 60
    move-object v5, p2

    .line 61
    move v9, v6

    .line 62
    move v6, v1

    .line 63
    move-object v1, p3

    .line 64
    invoke-direct/range {v0 .. v9}, Landroidx/compose/material3/NavigationRailKt$placeIcon$1;-><init>(Landroidx/compose/ui/layout/Placeable;Landroidx/compose/ui/layout/Placeable;IILandroidx/compose/ui/layout/Placeable;IIII)V

    .line 65
    .line 66
    .line 67
    move v5, v8

    .line 68
    move v6, v9

    .line 69
    const/4 v9, 0x4

    .line 70
    const/4 v10, 0x0

    .line 71
    const/4 v7, 0x0

    .line 72
    move-object v4, p0

    .line 73
    move-object v8, v0

    .line 74
    invoke-static/range {v4 .. v10}, Landroidx/compose/ui/layout/MeasureScope;->layout$default(Landroidx/compose/ui/layout/MeasureScope;IILjava/util/Map;Lr6/c;ILjava/lang/Object;)Landroidx/compose/ui/layout/MeasureResult;

    .line 75
    .line 76
    .line 77
    move-result-object v0

    .line 78
    return-object v0
.end method

.method private static final placeLabelAndIcon-zUg2_y0(Landroidx/compose/ui/layout/MeasureScope;Landroidx/compose/ui/layout/Placeable;Landroidx/compose/ui/layout/Placeable;Landroidx/compose/ui/layout/Placeable;Landroidx/compose/ui/layout/Placeable;JZF)Landroidx/compose/ui/layout/MeasureResult;
    .locals 17

    .line 1
    move-object/from16 v15, p0

    .line 2
    .line 3
    invoke-virtual/range {p2 .. p2}, Landroidx/compose/ui/layout/Placeable;->getHeight()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    int-to-float v0, v0

    .line 8
    sget v1, Landroidx/compose/material3/NavigationRailKt;->IndicatorVerticalPaddingWithLabel:F

    .line 9
    .line 10
    invoke-interface {v15, v1}, Landroidx/compose/ui/unit/Density;->toPx-0680j_4(F)F

    .line 11
    .line 12
    .line 13
    move-result v2

    .line 14
    add-float/2addr v2, v0

    .line 15
    sget v0, Landroidx/compose/material3/NavigationRailKt;->NavigationRailItemVerticalPadding:F

    .line 16
    .line 17
    invoke-interface {v15, v0}, Landroidx/compose/ui/unit/Density;->toPx-0680j_4(F)F

    .line 18
    .line 19
    .line 20
    move-result v3

    .line 21
    add-float/2addr v3, v2

    .line 22
    invoke-virtual/range {p1 .. p1}, Landroidx/compose/ui/layout/Placeable;->getHeight()I

    .line 23
    .line 24
    .line 25
    move-result v2

    .line 26
    int-to-float v2, v2

    .line 27
    add-float/2addr v3, v2

    .line 28
    invoke-static/range {p5 .. p6}, Landroidx/compose/ui/unit/Constraints;->getMinHeight-impl(J)I

    .line 29
    .line 30
    .line 31
    move-result v2

    .line 32
    int-to-float v2, v2

    .line 33
    sub-float/2addr v2, v3

    .line 34
    const/4 v4, 0x2

    .line 35
    int-to-float v5, v4

    .line 36
    div-float/2addr v2, v5

    .line 37
    invoke-interface {v15, v1}, Landroidx/compose/ui/unit/Density;->toPx-0680j_4(F)F

    .line 38
    .line 39
    .line 40
    move-result v6

    .line 41
    cmpg-float v7, v2, v6

    .line 42
    .line 43
    if-gez v7, :cond_0

    .line 44
    .line 45
    move v10, v6

    .line 46
    goto :goto_0

    .line 47
    :cond_0
    move v10, v2

    .line 48
    :goto_0
    mul-float v2, v10, v5

    .line 49
    .line 50
    add-float/2addr v2, v3

    .line 51
    if-eqz p7, :cond_1

    .line 52
    .line 53
    move v3, v10

    .line 54
    goto :goto_1

    .line 55
    :cond_1
    invoke-virtual/range {p2 .. p2}, Landroidx/compose/ui/layout/Placeable;->getHeight()I

    .line 56
    .line 57
    .line 58
    move-result v3

    .line 59
    int-to-float v3, v3

    .line 60
    sub-float v3, v2, v3

    .line 61
    .line 62
    div-float/2addr v3, v5

    .line 63
    :goto_1
    sub-float/2addr v3, v10

    .line 64
    const/4 v5, 0x1

    .line 65
    int-to-float v5, v5

    .line 66
    sub-float v5, v5, p8

    .line 67
    .line 68
    mul-float v7, v5, v3

    .line 69
    .line 70
    invoke-virtual/range {p2 .. p2}, Landroidx/compose/ui/layout/Placeable;->getHeight()I

    .line 71
    .line 72
    .line 73
    move-result v3

    .line 74
    int-to-float v3, v3

    .line 75
    add-float/2addr v3, v10

    .line 76
    invoke-interface {v15, v1}, Landroidx/compose/ui/unit/Density;->toPx-0680j_4(F)F

    .line 77
    .line 78
    .line 79
    move-result v5

    .line 80
    add-float/2addr v5, v3

    .line 81
    invoke-interface {v15, v0}, Landroidx/compose/ui/unit/Density;->toPx-0680j_4(F)F

    .line 82
    .line 83
    .line 84
    move-result v0

    .line 85
    add-float v6, v0, v5

    .line 86
    .line 87
    invoke-virtual/range {p2 .. p2}, Landroidx/compose/ui/layout/Placeable;->getWidth()I

    .line 88
    .line 89
    .line 90
    move-result v0

    .line 91
    invoke-virtual/range {p1 .. p1}, Landroidx/compose/ui/layout/Placeable;->getWidth()I

    .line 92
    .line 93
    .line 94
    move-result v3

    .line 95
    if-eqz p4, :cond_2

    .line 96
    .line 97
    invoke-virtual/range {p4 .. p4}, Landroidx/compose/ui/layout/Placeable;->getWidth()I

    .line 98
    .line 99
    .line 100
    move-result v5

    .line 101
    goto :goto_2

    .line 102
    :cond_2
    const/4 v5, 0x0

    .line 103
    :goto_2
    invoke-static {v3, v5}, Ljava/lang/Math;->max(II)I

    .line 104
    .line 105
    .line 106
    move-result v3

    .line 107
    invoke-static {v0, v3}, Ljava/lang/Math;->max(II)I

    .line 108
    .line 109
    .line 110
    move-result v0

    .line 111
    move-wide/from16 v8, p5

    .line 112
    .line 113
    invoke-static {v8, v9, v0}, Landroidx/compose/ui/unit/ConstraintsKt;->constrainWidth-K40F9xA(JI)I

    .line 114
    .line 115
    .line 116
    move-result v14

    .line 117
    move-object/from16 v0, p1

    .line 118
    .line 119
    invoke-static {v0, v14, v4}, Landroidx/collection/a;->C(Landroidx/compose/ui/layout/Placeable;II)I

    .line 120
    .line 121
    .line 122
    move-result v5

    .line 123
    move-object/from16 v8, p2

    .line 124
    .line 125
    invoke-static {v8, v14, v4}, Landroidx/collection/a;->C(Landroidx/compose/ui/layout/Placeable;II)I

    .line 126
    .line 127
    .line 128
    move-result v9

    .line 129
    move-object/from16 v11, p3

    .line 130
    .line 131
    invoke-static {v11, v14, v4}, Landroidx/collection/a;->C(Landroidx/compose/ui/layout/Placeable;II)I

    .line 132
    .line 133
    .line 134
    move-result v12

    .line 135
    invoke-interface {v15, v1}, Landroidx/compose/ui/unit/Density;->toPx-0680j_4(F)F

    .line 136
    .line 137
    .line 138
    move-result v1

    .line 139
    sub-float v13, v10, v1

    .line 140
    .line 141
    invoke-static {v2}, Lt6/a;->q(F)I

    .line 142
    .line 143
    .line 144
    move-result v16

    .line 145
    new-instance v0, Landroidx/compose/material3/NavigationRailKt$placeLabelAndIcon$1;

    .line 146
    .line 147
    move-object/from16 v4, p1

    .line 148
    .line 149
    move-object/from16 v1, p4

    .line 150
    .line 151
    move/from16 v2, p7

    .line 152
    .line 153
    move/from16 v3, p8

    .line 154
    .line 155
    invoke-direct/range {v0 .. v15}, Landroidx/compose/material3/NavigationRailKt$placeLabelAndIcon$1;-><init>(Landroidx/compose/ui/layout/Placeable;ZFLandroidx/compose/ui/layout/Placeable;IFFLandroidx/compose/ui/layout/Placeable;IFLandroidx/compose/ui/layout/Placeable;IFILandroidx/compose/ui/layout/MeasureScope;)V

    .line 156
    .line 157
    .line 158
    const/4 v1, 0x4

    .line 159
    const/4 v2, 0x0

    .line 160
    const/4 v3, 0x0

    .line 161
    move-object/from16 p1, p0

    .line 162
    .line 163
    move-object/from16 p5, v0

    .line 164
    .line 165
    move/from16 p6, v1

    .line 166
    .line 167
    move-object/from16 p7, v2

    .line 168
    .line 169
    move-object/from16 p4, v3

    .line 170
    .line 171
    move/from16 p2, v14

    .line 172
    .line 173
    move/from16 p3, v16

    .line 174
    .line 175
    invoke-static/range {p1 .. p7}, Landroidx/compose/ui/layout/MeasureScope;->layout$default(Landroidx/compose/ui/layout/MeasureScope;IILjava/util/Map;Lr6/c;ILjava/lang/Object;)Landroidx/compose/ui/layout/MeasureResult;

    .line 176
    .line 177
    .line 178
    move-result-object v0

    .line 179
    return-object v0
.end method
