.class public final Landroidx/compose/material3/NavigationDrawerKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000r\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0012\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u001ao\u0010\u0007\u001a\u00020\u00082\u0008\u0008\u0002\u0010\t\u001a\u00020\n2\u0008\u0008\u0002\u0010\u000b\u001a\u00020\u000c2\u0008\u0008\u0002\u0010\r\u001a\u00020\u000e2\u0008\u0008\u0002\u0010\u000f\u001a\u00020\u000e2\u0008\u0008\u0002\u0010\u0010\u001a\u00020\u00042\u0008\u0008\u0002\u0010\u0011\u001a\u00020\u00122\u001c\u0010\u0013\u001a\u0018\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00080\u0014\u00a2\u0006\u0002\u0008\u0016\u00a2\u0006\u0002\u0008\u0017H\u0007\u00f8\u0001\u0001\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008\u0018\u0010\u0019\u001aQ\u0010\u001a\u001a\u00020\u00082\u0011\u0010\u001b\u001a\r\u0012\u0004\u0012\u00020\u00080\u001c\u00a2\u0006\u0002\u0008\u00162\u0008\u0008\u0002\u0010\t\u001a\u00020\n2\u0008\u0008\u0002\u0010\u001d\u001a\u00020\u001e2\u0008\u0008\u0002\u0010\u001f\u001a\u00020 2\u0011\u0010\u0013\u001a\r\u0012\u0004\u0012\u00020\u00080\u001c\u00a2\u0006\u0002\u0008\u0016H\u0007\u00a2\u0006\u0002\u0010!\u001am\u0010\"\u001a\u00020\u00082\u0006\u0010\u0011\u001a\u00020\u00122\u0008\u0008\u0002\u0010\t\u001a\u00020\n2\u0008\u0008\u0002\u0010\u000b\u001a\u00020\u000c2\u0008\u0008\u0002\u0010\r\u001a\u00020\u000e2\u0008\u0008\u0002\u0010\u000f\u001a\u00020\u000e2\u0008\u0008\u0002\u0010\u0010\u001a\u00020\u00042\u001c\u0010\u0013\u001a\u0018\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00080\u0014\u00a2\u0006\u0002\u0008\u0016\u00a2\u0006\u0002\u0008\u0017H\u0003\u00f8\u0001\u0001\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008#\u0010$\u001ao\u0010%\u001a\u00020\u00082\u0008\u0008\u0002\u0010\t\u001a\u00020\n2\u0008\u0008\u0002\u0010\u000b\u001a\u00020\u000c2\u0008\u0008\u0002\u0010\r\u001a\u00020\u000e2\u0008\u0008\u0002\u0010\u000f\u001a\u00020\u000e2\u0008\u0008\u0002\u0010\u0010\u001a\u00020\u00042\u0008\u0008\u0002\u0010\u0011\u001a\u00020\u00122\u001c\u0010\u0013\u001a\u0018\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00080\u0014\u00a2\u0006\u0002\u0008\u0016\u00a2\u0006\u0002\u0008\u0017H\u0007\u00f8\u0001\u0001\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008&\u0010\u0019\u001ac\u0010\'\u001a\u00020\u00082\u0011\u0010\u001b\u001a\r\u0012\u0004\u0012\u00020\u00080\u001c\u00a2\u0006\u0002\u0008\u00162\u0008\u0008\u0002\u0010\t\u001a\u00020\n2\u0008\u0008\u0002\u0010\u001d\u001a\u00020\u001e2\u0008\u0008\u0002\u0010\u001f\u001a\u00020 2\u0008\u0008\u0002\u0010(\u001a\u00020\u000e2\u0011\u0010\u0013\u001a\r\u0012\u0004\u0012\u00020\u00080\u001c\u00a2\u0006\u0002\u0008\u0016H\u0007\u00f8\u0001\u0001\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008)\u0010*\u001a\u008c\u0001\u0010+\u001a\u00020\u00082\u0011\u0010,\u001a\r\u0012\u0004\u0012\u00020\u00080\u001c\u00a2\u0006\u0002\u0008\u00162\u0006\u0010-\u001a\u00020 2\u000c\u0010.\u001a\u0008\u0012\u0004\u0012\u00020\u00080\u001c2\u0008\u0008\u0002\u0010\t\u001a\u00020\n2\u0015\u0008\u0002\u0010/\u001a\u000f\u0012\u0004\u0012\u00020\u0008\u0018\u00010\u001c\u00a2\u0006\u0002\u0008\u00162\u0015\u0008\u0002\u00100\u001a\u000f\u0012\u0004\u0012\u00020\u0008\u0018\u00010\u001c\u00a2\u0006\u0002\u0008\u00162\u0008\u0008\u0002\u00101\u001a\u00020\u000c2\u0008\u0008\u0002\u00102\u001a\u0002032\u0008\u0008\u0002\u00104\u001a\u000205H\u0007\u00a2\u0006\u0002\u00106\u001ao\u00107\u001a\u00020\u00082\u0008\u0008\u0002\u0010\t\u001a\u00020\n2\u0008\u0008\u0002\u0010\u000b\u001a\u00020\u000c2\u0008\u0008\u0002\u0010\r\u001a\u00020\u000e2\u0008\u0008\u0002\u0010\u000f\u001a\u00020\u000e2\u0008\u0008\u0002\u0010\u0010\u001a\u00020\u00042\u0008\u0008\u0002\u0010\u0011\u001a\u00020\u00122\u001c\u0010\u0013\u001a\u0018\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00080\u0014\u00a2\u0006\u0002\u0008\u0016\u00a2\u0006\u0002\u0008\u0017H\u0007\u00f8\u0001\u0001\u00f8\u0001\u0000\u00a2\u0006\u0004\u00088\u0010\u0019\u001a=\u00109\u001a\u00020\u00082\u0011\u0010\u001b\u001a\r\u0012\u0004\u0012\u00020\u00080\u001c\u00a2\u0006\u0002\u0008\u00162\u0008\u0008\u0002\u0010\t\u001a\u00020\n2\u0011\u0010\u0013\u001a\r\u0012\u0004\u0012\u00020\u00080\u001c\u00a2\u0006\u0002\u0008\u0016H\u0007\u00a2\u0006\u0002\u0010:\u001aA\u0010;\u001a\u00020\u00082\u0006\u0010<\u001a\u00020 2\u000c\u0010=\u001a\u0008\u0012\u0004\u0012\u00020\u00080\u001c2\u000c\u0010>\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u001c2\u0006\u0010?\u001a\u00020\u000eH\u0003\u00f8\u0001\u0001\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008@\u0010A\u001a \u0010B\u001a\u00020\u00022\u0006\u0010C\u001a\u00020\u00022\u0006\u0010D\u001a\u00020\u00022\u0006\u0010E\u001a\u00020\u0002H\u0002\u001a+\u0010F\u001a\u00020\u001e2\u0006\u0010G\u001a\u00020H2\u0014\u0008\u0002\u0010I\u001a\u000e\u0012\u0004\u0012\u00020H\u0012\u0004\u0012\u00020 0\u0014H\u0007\u00a2\u0006\u0002\u0010J\"\u0014\u0010\u0000\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u0001X\u0082\u0004\u00a2\u0006\u0002\n\u0000\"\u0013\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00f8\u0001\u0000\u00a2\u0006\u0004\n\u0002\u0010\u0005\"\u0013\u0010\u0006\u001a\u00020\u0004X\u0082\u0004\u00f8\u0001\u0000\u00a2\u0006\u0004\n\u0002\u0010\u0005\u0082\u0002\u000b\n\u0002\u0008\u0019\n\u0005\u0008\u00a1\u001e0\u0001\u00a8\u0006K"
    }
    d2 = {
        "AnimationSpec",
        "Landroidx/compose/animation/core/TweenSpec;",
        "",
        "DrawerVelocityThreshold",
        "Landroidx/compose/ui/unit/Dp;",
        "F",
        "MinimumDrawerWidth",
        "DismissibleDrawerSheet",
        "",
        "modifier",
        "Landroidx/compose/ui/Modifier;",
        "drawerShape",
        "Landroidx/compose/ui/graphics/Shape;",
        "drawerContainerColor",
        "Landroidx/compose/ui/graphics/Color;",
        "drawerContentColor",
        "drawerTonalElevation",
        "windowInsets",
        "Landroidx/compose/foundation/layout/WindowInsets;",
        "content",
        "Lkotlin/Function1;",
        "Landroidx/compose/foundation/layout/ColumnScope;",
        "Landroidx/compose/runtime/Composable;",
        "Lkotlin/ExtensionFunctionType;",
        "DismissibleDrawerSheet-afqeVBk",
        "(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/graphics/Shape;JJFLandroidx/compose/foundation/layout/WindowInsets;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V",
        "DismissibleNavigationDrawer",
        "drawerContent",
        "Lkotlin/Function0;",
        "drawerState",
        "Landroidx/compose/material3/DrawerState;",
        "gesturesEnabled",
        "",
        "(Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/Modifier;Landroidx/compose/material3/DrawerState;ZLkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V",
        "DrawerSheet",
        "DrawerSheet-vywBR7E",
        "(Landroidx/compose/foundation/layout/WindowInsets;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/graphics/Shape;JJFLkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V",
        "ModalDrawerSheet",
        "ModalDrawerSheet-afqeVBk",
        "ModalNavigationDrawer",
        "scrimColor",
        "ModalNavigationDrawer-FHprtrg",
        "(Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/Modifier;Landroidx/compose/material3/DrawerState;ZJLkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V",
        "NavigationDrawerItem",
        "label",
        "selected",
        "onClick",
        "icon",
        "badge",
        "shape",
        "colors",
        "Landroidx/compose/material3/NavigationDrawerItemColors;",
        "interactionSource",
        "Landroidx/compose/foundation/interaction/MutableInteractionSource;",
        "(Lkotlin/jvm/functions/Function2;ZLkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material3/NavigationDrawerItemColors;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/runtime/Composer;II)V",
        "PermanentDrawerSheet",
        "PermanentDrawerSheet-afqeVBk",
        "PermanentNavigationDrawer",
        "(Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V",
        "Scrim",
        "open",
        "onClose",
        "fraction",
        "color",
        "Scrim-Bx497Mc",
        "(ZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;JLandroidx/compose/runtime/Composer;I)V",
        "calculateFraction",
        "a",
        "b",
        "pos",
        "rememberDrawerState",
        "initialValue",
        "Landroidx/compose/material3/DrawerValue;",
        "confirmStateChange",
        "(Landroidx/compose/material3/DrawerValue;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)Landroidx/compose/material3/DrawerState;",
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
.field private static final AnimationSpec:Landroidx/compose/animation/core/TweenSpec;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/compose/animation/core/TweenSpec<",
            "Ljava/lang/Float;",
            ">;"
        }
    .end annotation
.end field

.field private static final DrawerVelocityThreshold:F

.field private static final MinimumDrawerWidth:F


# direct methods
.method public static constructor <clinit>()V
    .locals 7

    .line 1
    const/16 v0, 0x190

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
    sput v0, Landroidx/compose/material3/NavigationDrawerKt;->DrawerVelocityThreshold:F

    .line 9
    .line 10
    const/16 v0, 0xf0

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
    sput v0, Landroidx/compose/material3/NavigationDrawerKt;->MinimumDrawerWidth:F

    .line 18
    .line 19
    new-instance v0, Landroidx/compose/animation/core/TweenSpec;

    .line 20
    .line 21
    const/16 v2, 0x100

    .line 22
    .line 23
    const/4 v3, 0x0

    .line 24
    const/4 v4, 0x0

    .line 25
    const/4 v5, 0x6

    .line 26
    const/4 v6, 0x0

    .line 27
    move-object v1, v0

    .line 28
    invoke-direct/range {v1 .. v6}, Landroidx/compose/animation/core/TweenSpec;-><init>(IILandroidx/compose/animation/core/Easing;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 29
    .line 30
    .line 31
    sput-object v0, Landroidx/compose/material3/NavigationDrawerKt;->AnimationSpec:Landroidx/compose/animation/core/TweenSpec;

    .line 32
    .line 33
    return-void
.end method

.method public static final DismissibleDrawerSheet-afqeVBk(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/graphics/Shape;JJFLandroidx/compose/foundation/layout/WindowInsets;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V
    .locals 25
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
            "JJF",
            "Landroidx/compose/foundation/layout/WindowInsets;",
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
    move-object/from16 v12, p8

    .line 2
    .line 3
    move/from16 v13, p10

    .line 4
    .line 5
    const-string v0, "content"

    .line 6
    .line 7
    invoke-static {v12, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    const v0, -0x23155507

    .line 11
    .line 12
    .line 13
    move-object/from16 v1, p9

    .line 14
    .line 15
    invoke-interface {v1, v0}, Landroidx/compose/runtime/Composer;->startRestartGroup(I)Landroidx/compose/runtime/Composer;

    .line 16
    .line 17
    .line 18
    move-result-object v14

    .line 19
    and-int/lit8 v1, p11, 0x1

    .line 20
    .line 21
    if-eqz v1, :cond_0

    .line 22
    .line 23
    or-int/lit8 v2, v13, 0x6

    .line 24
    .line 25
    move v3, v2

    .line 26
    move-object/from16 v2, p0

    .line 27
    .line 28
    goto :goto_1

    .line 29
    :cond_0
    and-int/lit8 v2, v13, 0xe

    .line 30
    .line 31
    if-nez v2, :cond_2

    .line 32
    .line 33
    move-object/from16 v2, p0

    .line 34
    .line 35
    invoke-interface {v14, v2}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 36
    .line 37
    .line 38
    move-result v3

    .line 39
    if-eqz v3, :cond_1

    .line 40
    .line 41
    const/4 v3, 0x4

    .line 42
    goto :goto_0

    .line 43
    :cond_1
    const/4 v3, 0x2

    .line 44
    :goto_0
    or-int/2addr v3, v13

    .line 45
    goto :goto_1

    .line 46
    :cond_2
    move-object/from16 v2, p0

    .line 47
    .line 48
    move v3, v13

    .line 49
    :goto_1
    and-int/lit8 v4, p11, 0x2

    .line 50
    .line 51
    if-eqz v4, :cond_3

    .line 52
    .line 53
    or-int/lit8 v3, v3, 0x30

    .line 54
    .line 55
    goto :goto_3

    .line 56
    :cond_3
    and-int/lit8 v5, v13, 0x70

    .line 57
    .line 58
    if-nez v5, :cond_5

    .line 59
    .line 60
    move-object/from16 v5, p1

    .line 61
    .line 62
    invoke-interface {v14, v5}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 63
    .line 64
    .line 65
    move-result v6

    .line 66
    if-eqz v6, :cond_4

    .line 67
    .line 68
    const/16 v6, 0x20

    .line 69
    .line 70
    goto :goto_2

    .line 71
    :cond_4
    const/16 v6, 0x10

    .line 72
    .line 73
    :goto_2
    or-int/2addr v3, v6

    .line 74
    goto :goto_4

    .line 75
    :cond_5
    :goto_3
    move-object/from16 v5, p1

    .line 76
    .line 77
    :goto_4
    and-int/lit16 v6, v13, 0x380

    .line 78
    .line 79
    if-nez v6, :cond_8

    .line 80
    .line 81
    and-int/lit8 v6, p11, 0x4

    .line 82
    .line 83
    if-nez v6, :cond_6

    .line 84
    .line 85
    move-wide/from16 v6, p2

    .line 86
    .line 87
    invoke-interface {v14, v6, v7}, Landroidx/compose/runtime/Composer;->changed(J)Z

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
    goto :goto_5

    .line 96
    :cond_6
    move-wide/from16 v6, p2

    .line 97
    .line 98
    :cond_7
    const/16 v8, 0x80

    .line 99
    .line 100
    :goto_5
    or-int/2addr v3, v8

    .line 101
    goto :goto_6

    .line 102
    :cond_8
    move-wide/from16 v6, p2

    .line 103
    .line 104
    :goto_6
    and-int/lit16 v8, v13, 0x1c00

    .line 105
    .line 106
    if-nez v8, :cond_b

    .line 107
    .line 108
    and-int/lit8 v8, p11, 0x8

    .line 109
    .line 110
    if-nez v8, :cond_9

    .line 111
    .line 112
    move-wide/from16 v8, p4

    .line 113
    .line 114
    invoke-interface {v14, v8, v9}, Landroidx/compose/runtime/Composer;->changed(J)Z

    .line 115
    .line 116
    .line 117
    move-result v10

    .line 118
    if-eqz v10, :cond_a

    .line 119
    .line 120
    const/16 v10, 0x800

    .line 121
    .line 122
    goto :goto_7

    .line 123
    :cond_9
    move-wide/from16 v8, p4

    .line 124
    .line 125
    :cond_a
    const/16 v10, 0x400

    .line 126
    .line 127
    :goto_7
    or-int/2addr v3, v10

    .line 128
    goto :goto_8

    .line 129
    :cond_b
    move-wide/from16 v8, p4

    .line 130
    .line 131
    :goto_8
    and-int/lit8 v10, p11, 0x10

    .line 132
    .line 133
    const v11, 0xe000

    .line 134
    .line 135
    .line 136
    if-eqz v10, :cond_c

    .line 137
    .line 138
    or-int/lit16 v3, v3, 0x6000

    .line 139
    .line 140
    goto :goto_a

    .line 141
    :cond_c
    and-int v15, v13, v11

    .line 142
    .line 143
    if-nez v15, :cond_e

    .line 144
    .line 145
    move/from16 v15, p6

    .line 146
    .line 147
    invoke-interface {v14, v15}, Landroidx/compose/runtime/Composer;->changed(F)Z

    .line 148
    .line 149
    .line 150
    move-result v16

    .line 151
    if-eqz v16, :cond_d

    .line 152
    .line 153
    const/16 v16, 0x4000

    .line 154
    .line 155
    goto :goto_9

    .line 156
    :cond_d
    const/16 v16, 0x2000

    .line 157
    .line 158
    :goto_9
    or-int v3, v3, v16

    .line 159
    .line 160
    goto :goto_b

    .line 161
    :cond_e
    :goto_a
    move/from16 v15, p6

    .line 162
    .line 163
    :goto_b
    const/high16 v16, 0x70000

    .line 164
    .line 165
    and-int v17, v13, v16

    .line 166
    .line 167
    if-nez v17, :cond_10

    .line 168
    .line 169
    and-int/lit8 v17, p11, 0x20

    .line 170
    .line 171
    move-object/from16 v11, p7

    .line 172
    .line 173
    if-nez v17, :cond_f

    .line 174
    .line 175
    invoke-interface {v14, v11}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 176
    .line 177
    .line 178
    move-result v17

    .line 179
    if-eqz v17, :cond_f

    .line 180
    .line 181
    const/high16 v17, 0x20000

    .line 182
    .line 183
    goto :goto_c

    .line 184
    :cond_f
    const/high16 v17, 0x10000

    .line 185
    .line 186
    :goto_c
    or-int v3, v3, v17

    .line 187
    .line 188
    goto :goto_d

    .line 189
    :cond_10
    move-object/from16 v11, p7

    .line 190
    .line 191
    :goto_d
    and-int/lit8 v17, p11, 0x40

    .line 192
    .line 193
    const/high16 v18, 0x380000

    .line 194
    .line 195
    if-eqz v17, :cond_11

    .line 196
    .line 197
    const/high16 v17, 0x180000

    .line 198
    .line 199
    :goto_e
    or-int v3, v3, v17

    .line 200
    .line 201
    goto :goto_f

    .line 202
    :cond_11
    and-int v17, v13, v18

    .line 203
    .line 204
    if-nez v17, :cond_13

    .line 205
    .line 206
    invoke-interface {v14, v12}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 207
    .line 208
    .line 209
    move-result v17

    .line 210
    if-eqz v17, :cond_12

    .line 211
    .line 212
    const/high16 v17, 0x100000

    .line 213
    .line 214
    goto :goto_e

    .line 215
    :cond_12
    const/high16 v17, 0x80000

    .line 216
    .line 217
    goto :goto_e

    .line 218
    :cond_13
    :goto_f
    const v17, 0x2db6db

    .line 219
    .line 220
    .line 221
    and-int v0, v3, v17

    .line 222
    .line 223
    const v2, 0x92492

    .line 224
    .line 225
    .line 226
    if-ne v0, v2, :cond_15

    .line 227
    .line 228
    invoke-interface {v14}, Landroidx/compose/runtime/Composer;->getSkipping()Z

    .line 229
    .line 230
    .line 231
    move-result v0

    .line 232
    if-nez v0, :cond_14

    .line 233
    .line 234
    goto :goto_10

    .line 235
    :cond_14
    invoke-interface {v14}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    .line 236
    .line 237
    .line 238
    move-object/from16 v1, p0

    .line 239
    .line 240
    move-object v2, v5

    .line 241
    move-wide v3, v6

    .line 242
    move-wide v5, v8

    .line 243
    move-object v8, v11

    .line 244
    move v7, v15

    .line 245
    goto/16 :goto_15

    .line 246
    .line 247
    :cond_15
    :goto_10
    invoke-interface {v14}, Landroidx/compose/runtime/Composer;->startDefaults()V

    .line 248
    .line 249
    .line 250
    and-int/lit8 v0, v13, 0x1

    .line 251
    .line 252
    const v2, -0x70001

    .line 253
    .line 254
    .line 255
    if-eqz v0, :cond_1a

    .line 256
    .line 257
    invoke-interface {v14}, Landroidx/compose/runtime/Composer;->getDefaultsInvalid()Z

    .line 258
    .line 259
    .line 260
    move-result v0

    .line 261
    if-eqz v0, :cond_16

    .line 262
    .line 263
    goto :goto_11

    .line 264
    :cond_16
    invoke-interface {v14}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    .line 265
    .line 266
    .line 267
    and-int/lit8 v0, p11, 0x4

    .line 268
    .line 269
    if-eqz v0, :cond_17

    .line 270
    .line 271
    and-int/lit16 v3, v3, -0x381

    .line 272
    .line 273
    :cond_17
    and-int/lit8 v0, p11, 0x8

    .line 274
    .line 275
    if-eqz v0, :cond_18

    .line 276
    .line 277
    and-int/lit16 v3, v3, -0x1c01

    .line 278
    .line 279
    :cond_18
    and-int/lit8 v0, p11, 0x20

    .line 280
    .line 281
    if-eqz v0, :cond_19

    .line 282
    .line 283
    and-int/2addr v3, v2

    .line 284
    :cond_19
    move-object/from16 v17, v5

    .line 285
    .line 286
    move-wide/from16 v19, v6

    .line 287
    .line 288
    move-wide/from16 v21, v8

    .line 289
    .line 290
    move-object/from16 v24, v11

    .line 291
    .line 292
    move/from16 v23, v15

    .line 293
    .line 294
    move-object/from16 v15, p0

    .line 295
    .line 296
    goto :goto_14

    .line 297
    :cond_1a
    :goto_11
    if-eqz v1, :cond_1b

    .line 298
    .line 299
    sget-object v0, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    .line 300
    .line 301
    goto :goto_12

    .line 302
    :cond_1b
    move-object/from16 v0, p0

    .line 303
    .line 304
    :goto_12
    if-eqz v4, :cond_1c

    .line 305
    .line 306
    invoke-static {}, Landroidx/compose/ui/graphics/RectangleShapeKt;->getRectangleShape()Landroidx/compose/ui/graphics/Shape;

    .line 307
    .line 308
    .line 309
    move-result-object v1

    .line 310
    move-object v5, v1

    .line 311
    :cond_1c
    and-int/lit8 v1, p11, 0x4

    .line 312
    .line 313
    const/4 v4, 0x6

    .line 314
    if-eqz v1, :cond_1d

    .line 315
    .line 316
    sget-object v1, Landroidx/compose/material3/MaterialTheme;->INSTANCE:Landroidx/compose/material3/MaterialTheme;

    .line 317
    .line 318
    invoke-virtual {v1, v14, v4}, Landroidx/compose/material3/MaterialTheme;->getColorScheme(Landroidx/compose/runtime/Composer;I)Landroidx/compose/material3/ColorScheme;

    .line 319
    .line 320
    .line 321
    move-result-object v1

    .line 322
    invoke-virtual {v1}, Landroidx/compose/material3/ColorScheme;->getSurface-0d7_KjU()J

    .line 323
    .line 324
    .line 325
    move-result-wide v6

    .line 326
    and-int/lit16 v3, v3, -0x381

    .line 327
    .line 328
    :cond_1d
    and-int/lit8 v1, p11, 0x8

    .line 329
    .line 330
    if-eqz v1, :cond_1e

    .line 331
    .line 332
    shr-int/lit8 v1, v3, 0x6

    .line 333
    .line 334
    and-int/lit8 v1, v1, 0xe

    .line 335
    .line 336
    invoke-static {v6, v7, v14, v1}, Landroidx/compose/material3/ColorSchemeKt;->contentColorFor-ek8zF_U(JLandroidx/compose/runtime/Composer;I)J

    .line 337
    .line 338
    .line 339
    move-result-wide v8

    .line 340
    and-int/lit16 v1, v3, -0x1c01

    .line 341
    .line 342
    move v3, v1

    .line 343
    :cond_1e
    if-eqz v10, :cond_1f

    .line 344
    .line 345
    sget-object v1, Landroidx/compose/material3/DrawerDefaults;->INSTANCE:Landroidx/compose/material3/DrawerDefaults;

    .line 346
    .line 347
    invoke-virtual {v1}, Landroidx/compose/material3/DrawerDefaults;->getDismissibleDrawerElevation-D9Ej5fM()F

    .line 348
    .line 349
    .line 350
    move-result v1

    .line 351
    move v15, v1

    .line 352
    :cond_1f
    and-int/lit8 v1, p11, 0x20

    .line 353
    .line 354
    if-eqz v1, :cond_20

    .line 355
    .line 356
    sget-object v1, Landroidx/compose/material3/DrawerDefaults;->INSTANCE:Landroidx/compose/material3/DrawerDefaults;

    .line 357
    .line 358
    invoke-virtual {v1, v14, v4}, Landroidx/compose/material3/DrawerDefaults;->getWindowInsets(Landroidx/compose/runtime/Composer;I)Landroidx/compose/foundation/layout/WindowInsets;

    .line 359
    .line 360
    .line 361
    move-result-object v1

    .line 362
    and-int/2addr v3, v2

    .line 363
    move-object/from16 v24, v1

    .line 364
    .line 365
    move-object/from16 v17, v5

    .line 366
    .line 367
    move-wide/from16 v19, v6

    .line 368
    .line 369
    move-wide/from16 v21, v8

    .line 370
    .line 371
    goto :goto_13

    .line 372
    :cond_20
    move-object/from16 v17, v5

    .line 373
    .line 374
    move-wide/from16 v19, v6

    .line 375
    .line 376
    move-wide/from16 v21, v8

    .line 377
    .line 378
    move-object/from16 v24, v11

    .line 379
    .line 380
    :goto_13
    move/from16 v23, v15

    .line 381
    .line 382
    move-object v15, v0

    .line 383
    :goto_14
    invoke-interface {v14}, Landroidx/compose/runtime/Composer;->endDefaults()V

    .line 384
    .line 385
    .line 386
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 387
    .line 388
    .line 389
    move-result v0

    .line 390
    if-eqz v0, :cond_21

    .line 391
    .line 392
    const/4 v0, -0x1

    .line 393
    const-string v1, "androidx.compose.material3.DismissibleDrawerSheet (NavigationDrawer.kt:496)"

    .line 394
    .line 395
    const v2, -0x23155507

    .line 396
    .line 397
    .line 398
    invoke-static {v2, v3, v0, v1}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 399
    .line 400
    .line 401
    :cond_21
    shr-int/lit8 v0, v3, 0xf

    .line 402
    .line 403
    and-int/lit8 v0, v0, 0xe

    .line 404
    .line 405
    shl-int/lit8 v1, v3, 0x3

    .line 406
    .line 407
    and-int/lit8 v2, v1, 0x70

    .line 408
    .line 409
    or-int/2addr v0, v2

    .line 410
    and-int/lit16 v2, v1, 0x380

    .line 411
    .line 412
    or-int/2addr v0, v2

    .line 413
    and-int/lit16 v2, v1, 0x1c00

    .line 414
    .line 415
    or-int/2addr v0, v2

    .line 416
    const v2, 0xe000

    .line 417
    .line 418
    .line 419
    and-int/2addr v2, v1

    .line 420
    or-int/2addr v0, v2

    .line 421
    and-int v1, v1, v16

    .line 422
    .line 423
    or-int/2addr v0, v1

    .line 424
    and-int v1, v3, v18

    .line 425
    .line 426
    or-int v10, v0, v1

    .line 427
    .line 428
    const/4 v11, 0x0

    .line 429
    move-object/from16 v0, v24

    .line 430
    .line 431
    move-object v1, v15

    .line 432
    move-object/from16 v2, v17

    .line 433
    .line 434
    move-wide/from16 v3, v19

    .line 435
    .line 436
    move-wide/from16 v5, v21

    .line 437
    .line 438
    move/from16 v7, v23

    .line 439
    .line 440
    move-object/from16 v8, p8

    .line 441
    .line 442
    move-object v9, v14

    .line 443
    invoke-static/range {v0 .. v11}, Landroidx/compose/material3/NavigationDrawerKt;->DrawerSheet-vywBR7E(Landroidx/compose/foundation/layout/WindowInsets;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/graphics/Shape;JJFLkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V

    .line 444
    .line 445
    .line 446
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 447
    .line 448
    .line 449
    move-result v0

    .line 450
    if-eqz v0, :cond_22

    .line 451
    .line 452
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 453
    .line 454
    .line 455
    :cond_22
    move-object v1, v15

    .line 456
    move-object/from16 v2, v17

    .line 457
    .line 458
    move-wide/from16 v3, v19

    .line 459
    .line 460
    move-wide/from16 v5, v21

    .line 461
    .line 462
    move/from16 v7, v23

    .line 463
    .line 464
    move-object/from16 v8, v24

    .line 465
    .line 466
    :goto_15
    invoke-interface {v14}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    .line 467
    .line 468
    .line 469
    move-result-object v14

    .line 470
    if-nez v14, :cond_23

    .line 471
    .line 472
    goto :goto_16

    .line 473
    :cond_23
    new-instance v15, Landroidx/compose/material3/NavigationDrawerKt$DismissibleDrawerSheet$1;

    .line 474
    .line 475
    move-object v0, v15

    .line 476
    move-object/from16 v9, p8

    .line 477
    .line 478
    move/from16 v10, p10

    .line 479
    .line 480
    move/from16 v11, p11

    .line 481
    .line 482
    invoke-direct/range {v0 .. v11}, Landroidx/compose/material3/NavigationDrawerKt$DismissibleDrawerSheet$1;-><init>(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/graphics/Shape;JJFLandroidx/compose/foundation/layout/WindowInsets;Lkotlin/jvm/functions/Function3;II)V

    .line 483
    .line 484
    .line 485
    invoke-interface {v14, v15}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lkotlin/jvm/functions/Function2;)V

    .line 486
    .line 487
    .line 488
    :goto_16
    return-void
.end method

.method public static final DismissibleNavigationDrawer(Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/Modifier;Landroidx/compose/material3/DrawerState;ZLkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V
    .locals 28
    .annotation runtime Landroidx/compose/material3/ExperimentalMaterial3Api;
    .end annotation

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
            "Landroidx/compose/ui/Modifier;",
            "Landroidx/compose/material3/DrawerState;",
            "Z",
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
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v5, p4

    .line 4
    .line 5
    move/from16 v6, p6

    .line 6
    .line 7
    const-string v0, "drawerContent"

    .line 8
    .line 9
    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    const-string v0, "content"

    .line 13
    .line 14
    invoke-static {v5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    const v0, 0x17c56426

    .line 18
    .line 19
    .line 20
    move-object/from16 v2, p5

    .line 21
    .line 22
    invoke-interface {v2, v0}, Landroidx/compose/runtime/Composer;->startRestartGroup(I)Landroidx/compose/runtime/Composer;

    .line 23
    .line 24
    .line 25
    move-result-object v2

    .line 26
    and-int/lit8 v3, p7, 0x1

    .line 27
    .line 28
    const/4 v4, 0x2

    .line 29
    if-eqz v3, :cond_0

    .line 30
    .line 31
    or-int/lit8 v3, v6, 0x6

    .line 32
    .line 33
    goto :goto_1

    .line 34
    :cond_0
    and-int/lit8 v3, v6, 0xe

    .line 35
    .line 36
    if-nez v3, :cond_2

    .line 37
    .line 38
    invoke-interface {v2, v1}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 39
    .line 40
    .line 41
    move-result v3

    .line 42
    if-eqz v3, :cond_1

    .line 43
    .line 44
    const/4 v3, 0x4

    .line 45
    goto :goto_0

    .line 46
    :cond_1
    move v3, v4

    .line 47
    :goto_0
    or-int/2addr v3, v6

    .line 48
    goto :goto_1

    .line 49
    :cond_2
    move v3, v6

    .line 50
    :goto_1
    and-int/lit8 v7, p7, 0x2

    .line 51
    .line 52
    if-eqz v7, :cond_3

    .line 53
    .line 54
    or-int/lit8 v3, v3, 0x30

    .line 55
    .line 56
    goto :goto_3

    .line 57
    :cond_3
    and-int/lit8 v8, v6, 0x70

    .line 58
    .line 59
    if-nez v8, :cond_5

    .line 60
    .line 61
    move-object/from16 v8, p1

    .line 62
    .line 63
    invoke-interface {v2, v8}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 64
    .line 65
    .line 66
    move-result v9

    .line 67
    if-eqz v9, :cond_4

    .line 68
    .line 69
    const/16 v9, 0x20

    .line 70
    .line 71
    goto :goto_2

    .line 72
    :cond_4
    const/16 v9, 0x10

    .line 73
    .line 74
    :goto_2
    or-int/2addr v3, v9

    .line 75
    goto :goto_4

    .line 76
    :cond_5
    :goto_3
    move-object/from16 v8, p1

    .line 77
    .line 78
    :goto_4
    and-int/lit16 v9, v6, 0x380

    .line 79
    .line 80
    if-nez v9, :cond_8

    .line 81
    .line 82
    and-int/lit8 v9, p7, 0x4

    .line 83
    .line 84
    if-nez v9, :cond_6

    .line 85
    .line 86
    move-object/from16 v9, p2

    .line 87
    .line 88
    invoke-interface {v2, v9}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 89
    .line 90
    .line 91
    move-result v10

    .line 92
    if-eqz v10, :cond_7

    .line 93
    .line 94
    const/16 v10, 0x100

    .line 95
    .line 96
    goto :goto_5

    .line 97
    :cond_6
    move-object/from16 v9, p2

    .line 98
    .line 99
    :cond_7
    const/16 v10, 0x80

    .line 100
    .line 101
    :goto_5
    or-int/2addr v3, v10

    .line 102
    goto :goto_6

    .line 103
    :cond_8
    move-object/from16 v9, p2

    .line 104
    .line 105
    :goto_6
    and-int/lit8 v10, p7, 0x8

    .line 106
    .line 107
    if-eqz v10, :cond_9

    .line 108
    .line 109
    or-int/lit16 v3, v3, 0xc00

    .line 110
    .line 111
    goto :goto_8

    .line 112
    :cond_9
    and-int/lit16 v11, v6, 0x1c00

    .line 113
    .line 114
    if-nez v11, :cond_b

    .line 115
    .line 116
    move/from16 v11, p3

    .line 117
    .line 118
    invoke-interface {v2, v11}, Landroidx/compose/runtime/Composer;->changed(Z)Z

    .line 119
    .line 120
    .line 121
    move-result v12

    .line 122
    if-eqz v12, :cond_a

    .line 123
    .line 124
    const/16 v12, 0x800

    .line 125
    .line 126
    goto :goto_7

    .line 127
    :cond_a
    const/16 v12, 0x400

    .line 128
    .line 129
    :goto_7
    or-int/2addr v3, v12

    .line 130
    goto :goto_9

    .line 131
    :cond_b
    :goto_8
    move/from16 v11, p3

    .line 132
    .line 133
    :goto_9
    and-int/lit8 v12, p7, 0x10

    .line 134
    .line 135
    if-eqz v12, :cond_c

    .line 136
    .line 137
    or-int/lit16 v3, v3, 0x6000

    .line 138
    .line 139
    goto :goto_b

    .line 140
    :cond_c
    const v12, 0xe000

    .line 141
    .line 142
    .line 143
    and-int/2addr v12, v6

    .line 144
    if-nez v12, :cond_e

    .line 145
    .line 146
    invoke-interface {v2, v5}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 147
    .line 148
    .line 149
    move-result v12

    .line 150
    if-eqz v12, :cond_d

    .line 151
    .line 152
    const/16 v12, 0x4000

    .line 153
    .line 154
    goto :goto_a

    .line 155
    :cond_d
    const/16 v12, 0x2000

    .line 156
    .line 157
    :goto_a
    or-int/2addr v3, v12

    .line 158
    :cond_e
    :goto_b
    const v12, 0xb6db

    .line 159
    .line 160
    .line 161
    and-int/2addr v12, v3

    .line 162
    const/16 v13, 0x2492

    .line 163
    .line 164
    if-ne v12, v13, :cond_10

    .line 165
    .line 166
    invoke-interface {v2}, Landroidx/compose/runtime/Composer;->getSkipping()Z

    .line 167
    .line 168
    .line 169
    move-result v12

    .line 170
    if-nez v12, :cond_f

    .line 171
    .line 172
    goto :goto_c

    .line 173
    :cond_f
    invoke-interface {v2}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    .line 174
    .line 175
    .line 176
    move-object v3, v9

    .line 177
    move v4, v11

    .line 178
    goto/16 :goto_14

    .line 179
    .line 180
    :cond_10
    :goto_c
    invoke-interface {v2}, Landroidx/compose/runtime/Composer;->startDefaults()V

    .line 181
    .line 182
    .line 183
    and-int/lit8 v12, v6, 0x1

    .line 184
    .line 185
    const/4 v13, 0x0

    .line 186
    const/4 v14, 0x6

    .line 187
    const/4 v15, 0x1

    .line 188
    if-eqz v12, :cond_12

    .line 189
    .line 190
    invoke-interface {v2}, Landroidx/compose/runtime/Composer;->getDefaultsInvalid()Z

    .line 191
    .line 192
    .line 193
    move-result v12

    .line 194
    if-eqz v12, :cond_11

    .line 195
    .line 196
    goto :goto_d

    .line 197
    :cond_11
    invoke-interface {v2}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    .line 198
    .line 199
    .line 200
    and-int/lit8 v7, p7, 0x4

    .line 201
    .line 202
    if-eqz v7, :cond_15

    .line 203
    .line 204
    and-int/lit16 v3, v3, -0x381

    .line 205
    .line 206
    goto :goto_e

    .line 207
    :cond_12
    :goto_d
    if-eqz v7, :cond_13

    .line 208
    .line 209
    sget-object v7, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    .line 210
    .line 211
    move-object v8, v7

    .line 212
    :cond_13
    and-int/lit8 v7, p7, 0x4

    .line 213
    .line 214
    if-eqz v7, :cond_14

    .line 215
    .line 216
    sget-object v7, Landroidx/compose/material3/DrawerValue;->Closed:Landroidx/compose/material3/DrawerValue;

    .line 217
    .line 218
    invoke-static {v7, v13, v2, v14, v4}, Landroidx/compose/material3/NavigationDrawerKt;->rememberDrawerState(Landroidx/compose/material3/DrawerValue;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)Landroidx/compose/material3/DrawerState;

    .line 219
    .line 220
    .line 221
    move-result-object v7

    .line 222
    and-int/lit16 v3, v3, -0x381

    .line 223
    .line 224
    move-object v9, v7

    .line 225
    :cond_14
    if-eqz v10, :cond_15

    .line 226
    .line 227
    move v11, v15

    .line 228
    :cond_15
    :goto_e
    invoke-interface {v2}, Landroidx/compose/runtime/Composer;->endDefaults()V

    .line 229
    .line 230
    .line 231
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 232
    .line 233
    .line 234
    move-result v7

    .line 235
    if-eqz v7, :cond_16

    .line 236
    .line 237
    const/4 v7, -0x1

    .line 238
    const-string v10, "androidx.compose.material3.DismissibleNavigationDrawer (NavigationDrawer.kt:346)"

    .line 239
    .line 240
    invoke-static {v0, v3, v7, v10}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 241
    .line 242
    .line 243
    :cond_16
    sget-object v0, Landroidx/compose/material3/tokens/NavigationDrawerTokens;->INSTANCE:Landroidx/compose/material3/tokens/NavigationDrawerTokens;

    .line 244
    .line 245
    invoke-virtual {v0}, Landroidx/compose/material3/tokens/NavigationDrawerTokens;->getContainerWidth-D9Ej5fM()F

    .line 246
    .line 247
    .line 248
    move-result v0

    .line 249
    invoke-static {}, Landroidx/compose/ui/platform/CompositionLocalsKt;->getLocalDensity()Landroidx/compose/runtime/ProvidableCompositionLocal;

    .line 250
    .line 251
    .line 252
    move-result-object v7

    .line 253
    invoke-interface {v2, v7}, Landroidx/compose/runtime/Composer;->consume(Landroidx/compose/runtime/CompositionLocal;)Ljava/lang/Object;

    .line 254
    .line 255
    .line 256
    move-result-object v7

    .line 257
    check-cast v7, Landroidx/compose/ui/unit/Density;

    .line 258
    .line 259
    invoke-interface {v7, v0}, Landroidx/compose/ui/unit/Density;->toPx-0680j_4(F)F

    .line 260
    .line 261
    .line 262
    move-result v0

    .line 263
    neg-float v0, v0

    .line 264
    const v7, 0x2e20b340

    .line 265
    .line 266
    .line 267
    invoke-interface {v2, v7}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 268
    .line 269
    .line 270
    const v7, -0x1d58f75c

    .line 271
    .line 272
    .line 273
    invoke-interface {v2, v7}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 274
    .line 275
    .line 276
    invoke-interface {v2}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 277
    .line 278
    .line 279
    move-result-object v7

    .line 280
    sget-object v10, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    .line 281
    .line 282
    invoke-virtual {v10}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    .line 283
    .line 284
    .line 285
    move-result-object v10

    .line 286
    if-ne v7, v10, :cond_17

    .line 287
    .line 288
    sget-object v7, Lkotlin/coroutines/EmptyCoroutineContext;->INSTANCE:Lkotlin/coroutines/EmptyCoroutineContext;

    .line 289
    .line 290
    invoke-static {v7, v2}, Landroidx/compose/runtime/EffectsKt;->createCompositionCoroutineScope(Lkotlin/coroutines/CoroutineContext;Landroidx/compose/runtime/Composer;)Lkotlinx/coroutines/CoroutineScope;

    .line 291
    .line 292
    .line 293
    move-result-object v7

    .line 294
    new-instance v10, Landroidx/compose/runtime/CompositionScopedCoroutineScopeCanceller;

    .line 295
    .line 296
    invoke-direct {v10, v7}, Landroidx/compose/runtime/CompositionScopedCoroutineScopeCanceller;-><init>(Lkotlinx/coroutines/CoroutineScope;)V

    .line 297
    .line 298
    .line 299
    invoke-interface {v2, v10}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 300
    .line 301
    .line 302
    move-object v7, v10

    .line 303
    :cond_17
    invoke-interface {v2}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 304
    .line 305
    .line 306
    check-cast v7, Landroidx/compose/runtime/CompositionScopedCoroutineScopeCanceller;

    .line 307
    .line 308
    invoke-virtual {v7}, Landroidx/compose/runtime/CompositionScopedCoroutineScopeCanceller;->getCoroutineScope()Lkotlinx/coroutines/CoroutineScope;

    .line 309
    .line 310
    .line 311
    move-result-object v7

    .line 312
    invoke-interface {v2}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 313
    .line 314
    .line 315
    sget-object v10, Landroidx/compose/material3/Strings;->Companion:Landroidx/compose/material3/Strings$Companion;

    .line 316
    .line 317
    invoke-virtual {v10}, Landroidx/compose/material3/Strings$Companion;->getNavigationMenu-adMyvUU()I

    .line 318
    .line 319
    .line 320
    move-result v10

    .line 321
    invoke-static {v10, v2, v14}, Landroidx/compose/material3/Strings_androidKt;->getString-NWtq2-8(ILandroidx/compose/runtime/Composer;I)Ljava/lang/String;

    .line 322
    .line 323
    .line 324
    move-result-object v10

    .line 325
    new-array v4, v4, [Lkotlin/Pair;

    .line 326
    .line 327
    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 328
    .line 329
    .line 330
    move-result-object v0

    .line 331
    sget-object v12, Landroidx/compose/material3/DrawerValue;->Closed:Landroidx/compose/material3/DrawerValue;

    .line 332
    .line 333
    invoke-static {v0, v12}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 334
    .line 335
    .line 336
    move-result-object v0

    .line 337
    const/4 v12, 0x0

    .line 338
    aput-object v0, v4, v12

    .line 339
    .line 340
    const/4 v0, 0x0

    .line 341
    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 342
    .line 343
    .line 344
    move-result-object v0

    .line 345
    sget-object v14, Landroidx/compose/material3/DrawerValue;->Open:Landroidx/compose/material3/DrawerValue;

    .line 346
    .line 347
    invoke-static {v0, v14}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 348
    .line 349
    .line 350
    move-result-object v0

    .line 351
    aput-object v0, v4, v15

    .line 352
    .line 353
    invoke-static {v4}, Lkotlin/collections/MapsKt;->mapOf([Lkotlin/Pair;)Ljava/util/Map;

    .line 354
    .line 355
    .line 356
    move-result-object v18

    .line 357
    invoke-static {}, Landroidx/compose/ui/platform/CompositionLocalsKt;->getLocalLayoutDirection()Landroidx/compose/runtime/ProvidableCompositionLocal;

    .line 358
    .line 359
    .line 360
    move-result-object v0

    .line 361
    invoke-interface {v2, v0}, Landroidx/compose/runtime/Composer;->consume(Landroidx/compose/runtime/CompositionLocal;)Ljava/lang/Object;

    .line 362
    .line 363
    .line 364
    move-result-object v0

    .line 365
    sget-object v4, Landroidx/compose/ui/unit/LayoutDirection;->Rtl:Landroidx/compose/ui/unit/LayoutDirection;

    .line 366
    .line 367
    if-ne v0, v4, :cond_18

    .line 368
    .line 369
    move/from16 v21, v15

    .line 370
    .line 371
    goto :goto_f

    .line 372
    :cond_18
    move/from16 v21, v12

    .line 373
    .line 374
    :goto_f
    invoke-virtual {v9}, Landroidx/compose/material3/DrawerState;->getSwipeableState$material3_release()Landroidx/compose/material3/SwipeableState;

    .line 375
    .line 376
    .line 377
    move-result-object v17

    .line 378
    sget-object v19, Landroidx/compose/foundation/gestures/Orientation;->Horizontal:Landroidx/compose/foundation/gestures/Orientation;

    .line 379
    .line 380
    sget v25, Landroidx/compose/material3/NavigationDrawerKt;->DrawerVelocityThreshold:F

    .line 381
    .line 382
    const/16 v22, 0x0

    .line 383
    .line 384
    sget-object v23, Landroidx/compose/material3/NavigationDrawerKt$DismissibleNavigationDrawer$1;->INSTANCE:Landroidx/compose/material3/NavigationDrawerKt$DismissibleNavigationDrawer$1;

    .line 385
    .line 386
    const/16 v24, 0x0

    .line 387
    .line 388
    const/16 v26, 0x20

    .line 389
    .line 390
    const/16 v27, 0x0

    .line 391
    .line 392
    move-object/from16 v16, v8

    .line 393
    .line 394
    move/from16 v20, v11

    .line 395
    .line 396
    invoke-static/range {v16 .. v27}, Landroidx/compose/material3/SwipeableKt;->swipeable-pPrIpRY$default(Landroidx/compose/ui/Modifier;Landroidx/compose/material3/SwipeableState;Ljava/util/Map;Landroidx/compose/foundation/gestures/Orientation;ZZLandroidx/compose/foundation/interaction/MutableInteractionSource;Lkotlin/jvm/functions/Function2;Landroidx/compose/material3/ResistanceConfig;FILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    .line 397
    .line 398
    .line 399
    move-result-object v0

    .line 400
    const v4, 0x2bb5b5d7

    .line 401
    .line 402
    .line 403
    invoke-interface {v2, v4}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 404
    .line 405
    .line 406
    sget-object v14, Landroidx/compose/ui/Alignment;->Companion:Landroidx/compose/ui/Alignment$Companion;

    .line 407
    .line 408
    invoke-virtual {v14}, Landroidx/compose/ui/Alignment$Companion;->getTopStart()Landroidx/compose/ui/Alignment;

    .line 409
    .line 410
    .line 411
    move-result-object v4

    .line 412
    invoke-static {v4, v12, v2, v12}, Landroidx/compose/foundation/layout/BoxKt;->rememberBoxMeasurePolicy(Landroidx/compose/ui/Alignment;ZLandroidx/compose/runtime/Composer;I)Landroidx/compose/ui/layout/MeasurePolicy;

    .line 413
    .line 414
    .line 415
    move-result-object v4

    .line 416
    const v13, -0x4ee9b9da

    .line 417
    .line 418
    .line 419
    invoke-interface {v2, v13}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 420
    .line 421
    .line 422
    invoke-static {}, Landroidx/compose/ui/platform/CompositionLocalsKt;->getLocalDensity()Landroidx/compose/runtime/ProvidableCompositionLocal;

    .line 423
    .line 424
    .line 425
    move-result-object v15

    .line 426
    invoke-interface {v2, v15}, Landroidx/compose/runtime/Composer;->consume(Landroidx/compose/runtime/CompositionLocal;)Ljava/lang/Object;

    .line 427
    .line 428
    .line 429
    move-result-object v15

    .line 430
    check-cast v15, Landroidx/compose/ui/unit/Density;

    .line 431
    .line 432
    invoke-static {}, Landroidx/compose/ui/platform/CompositionLocalsKt;->getLocalLayoutDirection()Landroidx/compose/runtime/ProvidableCompositionLocal;

    .line 433
    .line 434
    .line 435
    move-result-object v13

    .line 436
    invoke-interface {v2, v13}, Landroidx/compose/runtime/Composer;->consume(Landroidx/compose/runtime/CompositionLocal;)Ljava/lang/Object;

    .line 437
    .line 438
    .line 439
    move-result-object v13

    .line 440
    check-cast v13, Landroidx/compose/ui/unit/LayoutDirection;

    .line 441
    .line 442
    invoke-static {}, Landroidx/compose/ui/platform/CompositionLocalsKt;->getLocalViewConfiguration()Landroidx/compose/runtime/ProvidableCompositionLocal;

    .line 443
    .line 444
    .line 445
    move-result-object v12

    .line 446
    invoke-interface {v2, v12}, Landroidx/compose/runtime/Composer;->consume(Landroidx/compose/runtime/CompositionLocal;)Ljava/lang/Object;

    .line 447
    .line 448
    .line 449
    move-result-object v12

    .line 450
    check-cast v12, Landroidx/compose/ui/platform/ViewConfiguration;

    .line 451
    .line 452
    sget-object v17, Landroidx/compose/ui/node/ComposeUiNode;->Companion:Landroidx/compose/ui/node/ComposeUiNode$Companion;

    .line 453
    .line 454
    invoke-virtual/range {v17 .. v17}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getConstructor()Lkotlin/jvm/functions/Function0;

    .line 455
    .line 456
    .line 457
    move-result-object v6

    .line 458
    invoke-static {v0}, Landroidx/compose/ui/layout/LayoutKt;->materializerOf(Landroidx/compose/ui/Modifier;)Lkotlin/jvm/functions/Function3;

    .line 459
    .line 460
    .line 461
    move-result-object v0

    .line 462
    move-object/from16 v18, v8

    .line 463
    .line 464
    invoke-interface {v2}, Landroidx/compose/runtime/Composer;->getApplier()Landroidx/compose/runtime/Applier;

    .line 465
    .line 466
    .line 467
    move-result-object v8

    .line 468
    instance-of v8, v8, Landroidx/compose/runtime/Applier;

    .line 469
    .line 470
    if-nez v8, :cond_19

    .line 471
    .line 472
    invoke-static {}, Landroidx/compose/runtime/ComposablesKt;->invalidApplier()V

    .line 473
    .line 474
    .line 475
    :cond_19
    invoke-interface {v2}, Landroidx/compose/runtime/Composer;->startReusableNode()V

    .line 476
    .line 477
    .line 478
    invoke-interface {v2}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 479
    .line 480
    .line 481
    move-result v8

    .line 482
    if-eqz v8, :cond_1a

    .line 483
    .line 484
    invoke-interface {v2, v6}, Landroidx/compose/runtime/Composer;->createNode(Lkotlin/jvm/functions/Function0;)V

    .line 485
    .line 486
    .line 487
    goto :goto_10

    .line 488
    :cond_1a
    invoke-interface {v2}, Landroidx/compose/runtime/Composer;->useNode()V

    .line 489
    .line 490
    .line 491
    :goto_10
    invoke-interface {v2}, Landroidx/compose/runtime/Composer;->disableReusing()V

    .line 492
    .line 493
    .line 494
    invoke-static {v2}, Landroidx/compose/runtime/Updater;->constructor-impl(Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;

    .line 495
    .line 496
    .line 497
    move-result-object v6

    .line 498
    invoke-virtual/range {v17 .. v17}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetMeasurePolicy()Lkotlin/jvm/functions/Function2;

    .line 499
    .line 500
    .line 501
    move-result-object v8

    .line 502
    invoke-static {v6, v4, v8}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 503
    .line 504
    .line 505
    invoke-virtual/range {v17 .. v17}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetDensity()Lkotlin/jvm/functions/Function2;

    .line 506
    .line 507
    .line 508
    move-result-object v4

    .line 509
    invoke-static {v6, v15, v4}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 510
    .line 511
    .line 512
    invoke-virtual/range {v17 .. v17}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetLayoutDirection()Lkotlin/jvm/functions/Function2;

    .line 513
    .line 514
    .line 515
    move-result-object v4

    .line 516
    invoke-static {v6, v13, v4}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 517
    .line 518
    .line 519
    invoke-virtual/range {v17 .. v17}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetViewConfiguration()Lkotlin/jvm/functions/Function2;

    .line 520
    .line 521
    .line 522
    move-result-object v4

    .line 523
    invoke-static {v6, v12, v4}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 524
    .line 525
    .line 526
    invoke-interface {v2}, Landroidx/compose/runtime/Composer;->enableReusing()V

    .line 527
    .line 528
    .line 529
    invoke-static {v2}, Landroidx/compose/runtime/SkippableUpdater;->constructor-impl(Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;

    .line 530
    .line 531
    .line 532
    move-result-object v4

    .line 533
    invoke-static {v4}, Landroidx/compose/runtime/SkippableUpdater;->box-impl(Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/SkippableUpdater;

    .line 534
    .line 535
    .line 536
    move-result-object v4

    .line 537
    const/4 v6, 0x0

    .line 538
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 539
    .line 540
    .line 541
    move-result-object v8

    .line 542
    invoke-interface {v0, v4, v2, v8}, Lkotlin/jvm/functions/Function3;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 543
    .line 544
    .line 545
    const v0, 0x7ab4aae9

    .line 546
    .line 547
    .line 548
    invoke-interface {v2, v0}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 549
    .line 550
    .line 551
    const v4, -0x7f65a980

    .line 552
    .line 553
    .line 554
    invoke-interface {v2, v4}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 555
    .line 556
    .line 557
    sget-object v6, Landroidx/compose/foundation/layout/BoxScopeInstance;->INSTANCE:Landroidx/compose/foundation/layout/BoxScopeInstance;

    .line 558
    .line 559
    const v6, 0xf2f8a2c

    .line 560
    .line 561
    .line 562
    invoke-interface {v2, v6}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 563
    .line 564
    .line 565
    new-instance v6, Landroidx/compose/material3/NavigationDrawerKt$DismissibleNavigationDrawer$2$2;

    .line 566
    .line 567
    invoke-direct {v6, v9}, Landroidx/compose/material3/NavigationDrawerKt$DismissibleNavigationDrawer$2$2;-><init>(Landroidx/compose/material3/DrawerState;)V

    .line 568
    .line 569
    .line 570
    const v8, -0x4ee9b9da

    .line 571
    .line 572
    .line 573
    invoke-interface {v2, v8}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 574
    .line 575
    .line 576
    sget-object v8, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    .line 577
    .line 578
    invoke-static {}, Landroidx/compose/ui/platform/CompositionLocalsKt;->getLocalDensity()Landroidx/compose/runtime/ProvidableCompositionLocal;

    .line 579
    .line 580
    .line 581
    move-result-object v12

    .line 582
    invoke-interface {v2, v12}, Landroidx/compose/runtime/Composer;->consume(Landroidx/compose/runtime/CompositionLocal;)Ljava/lang/Object;

    .line 583
    .line 584
    .line 585
    move-result-object v12

    .line 586
    check-cast v12, Landroidx/compose/ui/unit/Density;

    .line 587
    .line 588
    invoke-static {}, Landroidx/compose/ui/platform/CompositionLocalsKt;->getLocalLayoutDirection()Landroidx/compose/runtime/ProvidableCompositionLocal;

    .line 589
    .line 590
    .line 591
    move-result-object v13

    .line 592
    invoke-interface {v2, v13}, Landroidx/compose/runtime/Composer;->consume(Landroidx/compose/runtime/CompositionLocal;)Ljava/lang/Object;

    .line 593
    .line 594
    .line 595
    move-result-object v13

    .line 596
    check-cast v13, Landroidx/compose/ui/unit/LayoutDirection;

    .line 597
    .line 598
    invoke-static {}, Landroidx/compose/ui/platform/CompositionLocalsKt;->getLocalViewConfiguration()Landroidx/compose/runtime/ProvidableCompositionLocal;

    .line 599
    .line 600
    .line 601
    move-result-object v15

    .line 602
    invoke-interface {v2, v15}, Landroidx/compose/runtime/Composer;->consume(Landroidx/compose/runtime/CompositionLocal;)Ljava/lang/Object;

    .line 603
    .line 604
    .line 605
    move-result-object v15

    .line 606
    check-cast v15, Landroidx/compose/ui/platform/ViewConfiguration;

    .line 607
    .line 608
    invoke-virtual/range {v17 .. v17}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getConstructor()Lkotlin/jvm/functions/Function0;

    .line 609
    .line 610
    .line 611
    move-result-object v4

    .line 612
    invoke-static {v8}, Landroidx/compose/ui/layout/LayoutKt;->materializerOf(Landroidx/compose/ui/Modifier;)Lkotlin/jvm/functions/Function3;

    .line 613
    .line 614
    .line 615
    move-result-object v0

    .line 616
    move/from16 v21, v11

    .line 617
    .line 618
    invoke-interface {v2}, Landroidx/compose/runtime/Composer;->getApplier()Landroidx/compose/runtime/Applier;

    .line 619
    .line 620
    .line 621
    move-result-object v11

    .line 622
    instance-of v11, v11, Landroidx/compose/runtime/Applier;

    .line 623
    .line 624
    if-nez v11, :cond_1b

    .line 625
    .line 626
    invoke-static {}, Landroidx/compose/runtime/ComposablesKt;->invalidApplier()V

    .line 627
    .line 628
    .line 629
    :cond_1b
    invoke-interface {v2}, Landroidx/compose/runtime/Composer;->startReusableNode()V

    .line 630
    .line 631
    .line 632
    invoke-interface {v2}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 633
    .line 634
    .line 635
    move-result v11

    .line 636
    if-eqz v11, :cond_1c

    .line 637
    .line 638
    invoke-interface {v2, v4}, Landroidx/compose/runtime/Composer;->createNode(Lkotlin/jvm/functions/Function0;)V

    .line 639
    .line 640
    .line 641
    goto :goto_11

    .line 642
    :cond_1c
    invoke-interface {v2}, Landroidx/compose/runtime/Composer;->useNode()V

    .line 643
    .line 644
    .line 645
    :goto_11
    invoke-interface {v2}, Landroidx/compose/runtime/Composer;->disableReusing()V

    .line 646
    .line 647
    .line 648
    invoke-static {v2}, Landroidx/compose/runtime/Updater;->constructor-impl(Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;

    .line 649
    .line 650
    .line 651
    move-result-object v4

    .line 652
    invoke-virtual/range {v17 .. v17}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetMeasurePolicy()Lkotlin/jvm/functions/Function2;

    .line 653
    .line 654
    .line 655
    move-result-object v11

    .line 656
    invoke-static {v4, v6, v11}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 657
    .line 658
    .line 659
    invoke-virtual/range {v17 .. v17}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetDensity()Lkotlin/jvm/functions/Function2;

    .line 660
    .line 661
    .line 662
    move-result-object v6

    .line 663
    invoke-static {v4, v12, v6}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 664
    .line 665
    .line 666
    invoke-virtual/range {v17 .. v17}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetLayoutDirection()Lkotlin/jvm/functions/Function2;

    .line 667
    .line 668
    .line 669
    move-result-object v6

    .line 670
    invoke-static {v4, v13, v6}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 671
    .line 672
    .line 673
    invoke-virtual/range {v17 .. v17}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetViewConfiguration()Lkotlin/jvm/functions/Function2;

    .line 674
    .line 675
    .line 676
    move-result-object v6

    .line 677
    invoke-static {v4, v15, v6}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 678
    .line 679
    .line 680
    invoke-interface {v2}, Landroidx/compose/runtime/Composer;->enableReusing()V

    .line 681
    .line 682
    .line 683
    invoke-static {v2}, Landroidx/compose/runtime/SkippableUpdater;->constructor-impl(Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;

    .line 684
    .line 685
    .line 686
    move-result-object v4

    .line 687
    invoke-static {v4}, Landroidx/compose/runtime/SkippableUpdater;->box-impl(Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/SkippableUpdater;

    .line 688
    .line 689
    .line 690
    move-result-object v4

    .line 691
    const/4 v6, 0x0

    .line 692
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 693
    .line 694
    .line 695
    move-result-object v11

    .line 696
    invoke-interface {v0, v4, v2, v11}, Lkotlin/jvm/functions/Function3;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 697
    .line 698
    .line 699
    const v0, 0x7ab4aae9

    .line 700
    .line 701
    .line 702
    invoke-interface {v2, v0}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 703
    .line 704
    .line 705
    const v0, 0x76390363

    .line 706
    .line 707
    .line 708
    invoke-interface {v2, v0}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 709
    .line 710
    .line 711
    new-instance v0, Landroidx/compose/material3/NavigationDrawerKt$DismissibleNavigationDrawer$2$1$1;

    .line 712
    .line 713
    invoke-direct {v0, v10, v9, v7}, Landroidx/compose/material3/NavigationDrawerKt$DismissibleNavigationDrawer$2$1$1;-><init>(Ljava/lang/String;Landroidx/compose/material3/DrawerState;Lkotlinx/coroutines/CoroutineScope;)V

    .line 714
    .line 715
    .line 716
    const/4 v4, 0x0

    .line 717
    const/4 v7, 0x1

    .line 718
    invoke-static {v8, v6, v0, v7, v4}, Landroidx/compose/ui/semantics/SemanticsModifierKt;->semantics$default(Landroidx/compose/ui/Modifier;ZLkotlin/jvm/functions/Function1;ILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    .line 719
    .line 720
    .line 721
    move-result-object v0

    .line 722
    const v4, 0x2bb5b5d7

    .line 723
    .line 724
    .line 725
    invoke-interface {v2, v4}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 726
    .line 727
    .line 728
    invoke-virtual {v14}, Landroidx/compose/ui/Alignment$Companion;->getTopStart()Landroidx/compose/ui/Alignment;

    .line 729
    .line 730
    .line 731
    move-result-object v4

    .line 732
    invoke-static {v4, v6, v2, v6}, Landroidx/compose/foundation/layout/BoxKt;->rememberBoxMeasurePolicy(Landroidx/compose/ui/Alignment;ZLandroidx/compose/runtime/Composer;I)Landroidx/compose/ui/layout/MeasurePolicy;

    .line 733
    .line 734
    .line 735
    move-result-object v4

    .line 736
    const v6, -0x4ee9b9da

    .line 737
    .line 738
    .line 739
    invoke-interface {v2, v6}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 740
    .line 741
    .line 742
    invoke-static {}, Landroidx/compose/ui/platform/CompositionLocalsKt;->getLocalDensity()Landroidx/compose/runtime/ProvidableCompositionLocal;

    .line 743
    .line 744
    .line 745
    move-result-object v6

    .line 746
    invoke-interface {v2, v6}, Landroidx/compose/runtime/Composer;->consume(Landroidx/compose/runtime/CompositionLocal;)Ljava/lang/Object;

    .line 747
    .line 748
    .line 749
    move-result-object v6

    .line 750
    check-cast v6, Landroidx/compose/ui/unit/Density;

    .line 751
    .line 752
    invoke-static {}, Landroidx/compose/ui/platform/CompositionLocalsKt;->getLocalLayoutDirection()Landroidx/compose/runtime/ProvidableCompositionLocal;

    .line 753
    .line 754
    .line 755
    move-result-object v7

    .line 756
    invoke-interface {v2, v7}, Landroidx/compose/runtime/Composer;->consume(Landroidx/compose/runtime/CompositionLocal;)Ljava/lang/Object;

    .line 757
    .line 758
    .line 759
    move-result-object v7

    .line 760
    check-cast v7, Landroidx/compose/ui/unit/LayoutDirection;

    .line 761
    .line 762
    invoke-static {}, Landroidx/compose/ui/platform/CompositionLocalsKt;->getLocalViewConfiguration()Landroidx/compose/runtime/ProvidableCompositionLocal;

    .line 763
    .line 764
    .line 765
    move-result-object v10

    .line 766
    invoke-interface {v2, v10}, Landroidx/compose/runtime/Composer;->consume(Landroidx/compose/runtime/CompositionLocal;)Ljava/lang/Object;

    .line 767
    .line 768
    .line 769
    move-result-object v10

    .line 770
    check-cast v10, Landroidx/compose/ui/platform/ViewConfiguration;

    .line 771
    .line 772
    invoke-virtual/range {v17 .. v17}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getConstructor()Lkotlin/jvm/functions/Function0;

    .line 773
    .line 774
    .line 775
    move-result-object v11

    .line 776
    invoke-static {v0}, Landroidx/compose/ui/layout/LayoutKt;->materializerOf(Landroidx/compose/ui/Modifier;)Lkotlin/jvm/functions/Function3;

    .line 777
    .line 778
    .line 779
    move-result-object v0

    .line 780
    invoke-interface {v2}, Landroidx/compose/runtime/Composer;->getApplier()Landroidx/compose/runtime/Applier;

    .line 781
    .line 782
    .line 783
    move-result-object v12

    .line 784
    instance-of v12, v12, Landroidx/compose/runtime/Applier;

    .line 785
    .line 786
    if-nez v12, :cond_1d

    .line 787
    .line 788
    invoke-static {}, Landroidx/compose/runtime/ComposablesKt;->invalidApplier()V

    .line 789
    .line 790
    .line 791
    :cond_1d
    invoke-interface {v2}, Landroidx/compose/runtime/Composer;->startReusableNode()V

    .line 792
    .line 793
    .line 794
    invoke-interface {v2}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 795
    .line 796
    .line 797
    move-result v12

    .line 798
    if-eqz v12, :cond_1e

    .line 799
    .line 800
    invoke-interface {v2, v11}, Landroidx/compose/runtime/Composer;->createNode(Lkotlin/jvm/functions/Function0;)V

    .line 801
    .line 802
    .line 803
    goto :goto_12

    .line 804
    :cond_1e
    invoke-interface {v2}, Landroidx/compose/runtime/Composer;->useNode()V

    .line 805
    .line 806
    .line 807
    :goto_12
    invoke-interface {v2}, Landroidx/compose/runtime/Composer;->disableReusing()V

    .line 808
    .line 809
    .line 810
    invoke-static {v2}, Landroidx/compose/runtime/Updater;->constructor-impl(Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;

    .line 811
    .line 812
    .line 813
    move-result-object v11

    .line 814
    invoke-virtual/range {v17 .. v17}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetMeasurePolicy()Lkotlin/jvm/functions/Function2;

    .line 815
    .line 816
    .line 817
    move-result-object v12

    .line 818
    invoke-static {v11, v4, v12}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 819
    .line 820
    .line 821
    invoke-virtual/range {v17 .. v17}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetDensity()Lkotlin/jvm/functions/Function2;

    .line 822
    .line 823
    .line 824
    move-result-object v4

    .line 825
    invoke-static {v11, v6, v4}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 826
    .line 827
    .line 828
    invoke-virtual/range {v17 .. v17}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetLayoutDirection()Lkotlin/jvm/functions/Function2;

    .line 829
    .line 830
    .line 831
    move-result-object v4

    .line 832
    invoke-static {v11, v7, v4}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 833
    .line 834
    .line 835
    invoke-virtual/range {v17 .. v17}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetViewConfiguration()Lkotlin/jvm/functions/Function2;

    .line 836
    .line 837
    .line 838
    move-result-object v4

    .line 839
    invoke-static {v11, v10, v4}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 840
    .line 841
    .line 842
    invoke-interface {v2}, Landroidx/compose/runtime/Composer;->enableReusing()V

    .line 843
    .line 844
    .line 845
    invoke-static {v2}, Landroidx/compose/runtime/SkippableUpdater;->constructor-impl(Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;

    .line 846
    .line 847
    .line 848
    move-result-object v4

    .line 849
    invoke-static {v4}, Landroidx/compose/runtime/SkippableUpdater;->box-impl(Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/SkippableUpdater;

    .line 850
    .line 851
    .line 852
    move-result-object v4

    .line 853
    const/4 v6, 0x0

    .line 854
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 855
    .line 856
    .line 857
    move-result-object v7

    .line 858
    invoke-interface {v0, v4, v2, v7}, Lkotlin/jvm/functions/Function3;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 859
    .line 860
    .line 861
    const v0, 0x7ab4aae9

    .line 862
    .line 863
    .line 864
    invoke-interface {v2, v0}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 865
    .line 866
    .line 867
    const v0, -0x7f65a980

    .line 868
    .line 869
    .line 870
    invoke-interface {v2, v0}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 871
    .line 872
    .line 873
    const v0, -0xa22ef17

    .line 874
    .line 875
    .line 876
    invoke-interface {v2, v0}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 877
    .line 878
    .line 879
    and-int/lit8 v0, v3, 0xe

    .line 880
    .line 881
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 882
    .line 883
    .line 884
    move-result-object v0

    .line 885
    invoke-interface {v1, v2, v0}, Lkotlin/jvm/functions/Function2;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 886
    .line 887
    .line 888
    invoke-interface {v2}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 889
    .line 890
    .line 891
    invoke-interface {v2}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 892
    .line 893
    .line 894
    invoke-interface {v2}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 895
    .line 896
    .line 897
    invoke-interface {v2}, Landroidx/compose/runtime/Composer;->endNode()V

    .line 898
    .line 899
    .line 900
    invoke-interface {v2}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 901
    .line 902
    .line 903
    invoke-interface {v2}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 904
    .line 905
    .line 906
    const v0, 0x2bb5b5d7

    .line 907
    .line 908
    .line 909
    invoke-interface {v2, v0}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 910
    .line 911
    .line 912
    invoke-virtual {v14}, Landroidx/compose/ui/Alignment$Companion;->getTopStart()Landroidx/compose/ui/Alignment;

    .line 913
    .line 914
    .line 915
    move-result-object v0

    .line 916
    const/4 v4, 0x0

    .line 917
    invoke-static {v0, v4, v2, v4}, Landroidx/compose/foundation/layout/BoxKt;->rememberBoxMeasurePolicy(Landroidx/compose/ui/Alignment;ZLandroidx/compose/runtime/Composer;I)Landroidx/compose/ui/layout/MeasurePolicy;

    .line 918
    .line 919
    .line 920
    move-result-object v0

    .line 921
    const v4, -0x4ee9b9da

    .line 922
    .line 923
    .line 924
    invoke-interface {v2, v4}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 925
    .line 926
    .line 927
    invoke-static {}, Landroidx/compose/ui/platform/CompositionLocalsKt;->getLocalDensity()Landroidx/compose/runtime/ProvidableCompositionLocal;

    .line 928
    .line 929
    .line 930
    move-result-object v4

    .line 931
    invoke-interface {v2, v4}, Landroidx/compose/runtime/Composer;->consume(Landroidx/compose/runtime/CompositionLocal;)Ljava/lang/Object;

    .line 932
    .line 933
    .line 934
    move-result-object v4

    .line 935
    check-cast v4, Landroidx/compose/ui/unit/Density;

    .line 936
    .line 937
    invoke-static {}, Landroidx/compose/ui/platform/CompositionLocalsKt;->getLocalLayoutDirection()Landroidx/compose/runtime/ProvidableCompositionLocal;

    .line 938
    .line 939
    .line 940
    move-result-object v6

    .line 941
    invoke-interface {v2, v6}, Landroidx/compose/runtime/Composer;->consume(Landroidx/compose/runtime/CompositionLocal;)Ljava/lang/Object;

    .line 942
    .line 943
    .line 944
    move-result-object v6

    .line 945
    check-cast v6, Landroidx/compose/ui/unit/LayoutDirection;

    .line 946
    .line 947
    invoke-static {}, Landroidx/compose/ui/platform/CompositionLocalsKt;->getLocalViewConfiguration()Landroidx/compose/runtime/ProvidableCompositionLocal;

    .line 948
    .line 949
    .line 950
    move-result-object v7

    .line 951
    invoke-interface {v2, v7}, Landroidx/compose/runtime/Composer;->consume(Landroidx/compose/runtime/CompositionLocal;)Ljava/lang/Object;

    .line 952
    .line 953
    .line 954
    move-result-object v7

    .line 955
    check-cast v7, Landroidx/compose/ui/platform/ViewConfiguration;

    .line 956
    .line 957
    invoke-virtual/range {v17 .. v17}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getConstructor()Lkotlin/jvm/functions/Function0;

    .line 958
    .line 959
    .line 960
    move-result-object v10

    .line 961
    invoke-static {v8}, Landroidx/compose/ui/layout/LayoutKt;->materializerOf(Landroidx/compose/ui/Modifier;)Lkotlin/jvm/functions/Function3;

    .line 962
    .line 963
    .line 964
    move-result-object v8

    .line 965
    invoke-interface {v2}, Landroidx/compose/runtime/Composer;->getApplier()Landroidx/compose/runtime/Applier;

    .line 966
    .line 967
    .line 968
    move-result-object v11

    .line 969
    instance-of v11, v11, Landroidx/compose/runtime/Applier;

    .line 970
    .line 971
    if-nez v11, :cond_1f

    .line 972
    .line 973
    invoke-static {}, Landroidx/compose/runtime/ComposablesKt;->invalidApplier()V

    .line 974
    .line 975
    .line 976
    :cond_1f
    invoke-interface {v2}, Landroidx/compose/runtime/Composer;->startReusableNode()V

    .line 977
    .line 978
    .line 979
    invoke-interface {v2}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 980
    .line 981
    .line 982
    move-result v11

    .line 983
    if-eqz v11, :cond_20

    .line 984
    .line 985
    invoke-interface {v2, v10}, Landroidx/compose/runtime/Composer;->createNode(Lkotlin/jvm/functions/Function0;)V

    .line 986
    .line 987
    .line 988
    goto :goto_13

    .line 989
    :cond_20
    invoke-interface {v2}, Landroidx/compose/runtime/Composer;->useNode()V

    .line 990
    .line 991
    .line 992
    :goto_13
    invoke-interface {v2}, Landroidx/compose/runtime/Composer;->disableReusing()V

    .line 993
    .line 994
    .line 995
    invoke-static {v2}, Landroidx/compose/runtime/Updater;->constructor-impl(Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;

    .line 996
    .line 997
    .line 998
    move-result-object v10

    .line 999
    invoke-virtual/range {v17 .. v17}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetMeasurePolicy()Lkotlin/jvm/functions/Function2;

    .line 1000
    .line 1001
    .line 1002
    move-result-object v11

    .line 1003
    invoke-static {v10, v0, v11}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 1004
    .line 1005
    .line 1006
    invoke-virtual/range {v17 .. v17}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetDensity()Lkotlin/jvm/functions/Function2;

    .line 1007
    .line 1008
    .line 1009
    move-result-object v0

    .line 1010
    invoke-static {v10, v4, v0}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 1011
    .line 1012
    .line 1013
    invoke-virtual/range {v17 .. v17}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetLayoutDirection()Lkotlin/jvm/functions/Function2;

    .line 1014
    .line 1015
    .line 1016
    move-result-object v0

    .line 1017
    invoke-static {v10, v6, v0}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 1018
    .line 1019
    .line 1020
    invoke-virtual/range {v17 .. v17}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetViewConfiguration()Lkotlin/jvm/functions/Function2;

    .line 1021
    .line 1022
    .line 1023
    move-result-object v0

    .line 1024
    invoke-static {v10, v7, v0}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 1025
    .line 1026
    .line 1027
    invoke-interface {v2}, Landroidx/compose/runtime/Composer;->enableReusing()V

    .line 1028
    .line 1029
    .line 1030
    invoke-static {v2}, Landroidx/compose/runtime/SkippableUpdater;->constructor-impl(Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;

    .line 1031
    .line 1032
    .line 1033
    move-result-object v0

    .line 1034
    invoke-static {v0}, Landroidx/compose/runtime/SkippableUpdater;->box-impl(Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/SkippableUpdater;

    .line 1035
    .line 1036
    .line 1037
    move-result-object v0

    .line 1038
    const/4 v4, 0x0

    .line 1039
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1040
    .line 1041
    .line 1042
    move-result-object v4

    .line 1043
    invoke-interface {v8, v0, v2, v4}, Lkotlin/jvm/functions/Function3;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1044
    .line 1045
    .line 1046
    const v0, 0x7ab4aae9

    .line 1047
    .line 1048
    .line 1049
    invoke-interface {v2, v0}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 1050
    .line 1051
    .line 1052
    const v0, -0x7f65a980

    .line 1053
    .line 1054
    .line 1055
    invoke-interface {v2, v0}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 1056
    .line 1057
    .line 1058
    const v0, 0x6e5af60

    .line 1059
    .line 1060
    .line 1061
    invoke-interface {v2, v0}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 1062
    .line 1063
    .line 1064
    shr-int/lit8 v0, v3, 0xc

    .line 1065
    .line 1066
    and-int/lit8 v0, v0, 0xe

    .line 1067
    .line 1068
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1069
    .line 1070
    .line 1071
    move-result-object v0

    .line 1072
    invoke-interface {v5, v2, v0}, Lkotlin/jvm/functions/Function2;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1073
    .line 1074
    .line 1075
    invoke-interface {v2}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 1076
    .line 1077
    .line 1078
    invoke-interface {v2}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 1079
    .line 1080
    .line 1081
    invoke-interface {v2}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 1082
    .line 1083
    .line 1084
    invoke-interface {v2}, Landroidx/compose/runtime/Composer;->endNode()V

    .line 1085
    .line 1086
    .line 1087
    invoke-interface {v2}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 1088
    .line 1089
    .line 1090
    invoke-interface {v2}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 1091
    .line 1092
    .line 1093
    invoke-interface {v2}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 1094
    .line 1095
    .line 1096
    invoke-interface {v2}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 1097
    .line 1098
    .line 1099
    invoke-interface {v2}, Landroidx/compose/runtime/Composer;->endNode()V

    .line 1100
    .line 1101
    .line 1102
    invoke-interface {v2}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 1103
    .line 1104
    .line 1105
    invoke-interface {v2}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 1106
    .line 1107
    .line 1108
    invoke-interface {v2}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 1109
    .line 1110
    .line 1111
    invoke-interface {v2}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 1112
    .line 1113
    .line 1114
    invoke-interface {v2}, Landroidx/compose/runtime/Composer;->endNode()V

    .line 1115
    .line 1116
    .line 1117
    invoke-interface {v2}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 1118
    .line 1119
    .line 1120
    invoke-interface {v2}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 1121
    .line 1122
    .line 1123
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 1124
    .line 1125
    .line 1126
    move-result v0

    .line 1127
    if-eqz v0, :cond_21

    .line 1128
    .line 1129
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 1130
    .line 1131
    .line 1132
    :cond_21
    move-object v3, v9

    .line 1133
    move-object/from16 v8, v18

    .line 1134
    .line 1135
    move/from16 v4, v21

    .line 1136
    .line 1137
    :goto_14
    invoke-interface {v2}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    .line 1138
    .line 1139
    .line 1140
    move-result-object v9

    .line 1141
    if-nez v9, :cond_22

    .line 1142
    .line 1143
    goto :goto_15

    .line 1144
    :cond_22
    new-instance v10, Landroidx/compose/material3/NavigationDrawerKt$DismissibleNavigationDrawer$3;

    .line 1145
    .line 1146
    move-object v0, v10

    .line 1147
    move-object/from16 v1, p0

    .line 1148
    .line 1149
    move-object v2, v8

    .line 1150
    move-object/from16 v5, p4

    .line 1151
    .line 1152
    move/from16 v6, p6

    .line 1153
    .line 1154
    move/from16 v7, p7

    .line 1155
    .line 1156
    invoke-direct/range {v0 .. v7}, Landroidx/compose/material3/NavigationDrawerKt$DismissibleNavigationDrawer$3;-><init>(Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/Modifier;Landroidx/compose/material3/DrawerState;ZLkotlin/jvm/functions/Function2;II)V

    .line 1157
    .line 1158
    .line 1159
    invoke-interface {v9, v10}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lkotlin/jvm/functions/Function2;)V

    .line 1160
    .line 1161
    .line 1162
    :goto_15
    return-void
.end method

.method private static final DrawerSheet-vywBR7E(Landroidx/compose/foundation/layout/WindowInsets;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/graphics/Shape;JJFLkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V
    .locals 26
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
            "Landroidx/compose/foundation/layout/WindowInsets;",
            "Landroidx/compose/ui/Modifier;",
            "Landroidx/compose/ui/graphics/Shape;",
            "JJF",
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
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v9, p8

    .line 4
    .line 5
    move/from16 v10, p10

    .line 6
    .line 7
    const v0, 0xa6f6635

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
    move-result-object v2

    .line 16
    and-int/lit8 v3, p11, 0x1

    .line 17
    .line 18
    if-eqz v3, :cond_0

    .line 19
    .line 20
    or-int/lit8 v3, v10, 0x6

    .line 21
    .line 22
    goto :goto_1

    .line 23
    :cond_0
    and-int/lit8 v3, v10, 0xe

    .line 24
    .line 25
    if-nez v3, :cond_2

    .line 26
    .line 27
    invoke-interface {v2, v1}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 28
    .line 29
    .line 30
    move-result v3

    .line 31
    if-eqz v3, :cond_1

    .line 32
    .line 33
    const/4 v3, 0x4

    .line 34
    goto :goto_0

    .line 35
    :cond_1
    const/4 v3, 0x2

    .line 36
    :goto_0
    or-int/2addr v3, v10

    .line 37
    goto :goto_1

    .line 38
    :cond_2
    move v3, v10

    .line 39
    :goto_1
    and-int/lit8 v4, p11, 0x2

    .line 40
    .line 41
    if-eqz v4, :cond_3

    .line 42
    .line 43
    or-int/lit8 v3, v3, 0x30

    .line 44
    .line 45
    goto :goto_3

    .line 46
    :cond_3
    and-int/lit8 v5, v10, 0x70

    .line 47
    .line 48
    if-nez v5, :cond_5

    .line 49
    .line 50
    move-object/from16 v5, p1

    .line 51
    .line 52
    invoke-interface {v2, v5}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 53
    .line 54
    .line 55
    move-result v6

    .line 56
    if-eqz v6, :cond_4

    .line 57
    .line 58
    const/16 v6, 0x20

    .line 59
    .line 60
    goto :goto_2

    .line 61
    :cond_4
    const/16 v6, 0x10

    .line 62
    .line 63
    :goto_2
    or-int/2addr v3, v6

    .line 64
    goto :goto_4

    .line 65
    :cond_5
    :goto_3
    move-object/from16 v5, p1

    .line 66
    .line 67
    :goto_4
    and-int/lit8 v6, p11, 0x4

    .line 68
    .line 69
    if-eqz v6, :cond_6

    .line 70
    .line 71
    or-int/lit16 v3, v3, 0x180

    .line 72
    .line 73
    goto :goto_6

    .line 74
    :cond_6
    and-int/lit16 v7, v10, 0x380

    .line 75
    .line 76
    if-nez v7, :cond_8

    .line 77
    .line 78
    move-object/from16 v7, p2

    .line 79
    .line 80
    invoke-interface {v2, v7}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 81
    .line 82
    .line 83
    move-result v8

    .line 84
    if-eqz v8, :cond_7

    .line 85
    .line 86
    const/16 v8, 0x100

    .line 87
    .line 88
    goto :goto_5

    .line 89
    :cond_7
    const/16 v8, 0x80

    .line 90
    .line 91
    :goto_5
    or-int/2addr v3, v8

    .line 92
    goto :goto_7

    .line 93
    :cond_8
    :goto_6
    move-object/from16 v7, p2

    .line 94
    .line 95
    :goto_7
    and-int/lit16 v8, v10, 0x1c00

    .line 96
    .line 97
    if-nez v8, :cond_a

    .line 98
    .line 99
    and-int/lit8 v8, p11, 0x8

    .line 100
    .line 101
    move-wide/from16 v11, p3

    .line 102
    .line 103
    if-nez v8, :cond_9

    .line 104
    .line 105
    invoke-interface {v2, v11, v12}, Landroidx/compose/runtime/Composer;->changed(J)Z

    .line 106
    .line 107
    .line 108
    move-result v8

    .line 109
    if-eqz v8, :cond_9

    .line 110
    .line 111
    const/16 v8, 0x800

    .line 112
    .line 113
    goto :goto_8

    .line 114
    :cond_9
    const/16 v8, 0x400

    .line 115
    .line 116
    :goto_8
    or-int/2addr v3, v8

    .line 117
    goto :goto_9

    .line 118
    :cond_a
    move-wide/from16 v11, p3

    .line 119
    .line 120
    :goto_9
    const v8, 0xe000

    .line 121
    .line 122
    .line 123
    and-int v13, v10, v8

    .line 124
    .line 125
    if-nez v13, :cond_d

    .line 126
    .line 127
    and-int/lit8 v13, p11, 0x10

    .line 128
    .line 129
    if-nez v13, :cond_b

    .line 130
    .line 131
    move-wide/from16 v13, p5

    .line 132
    .line 133
    invoke-interface {v2, v13, v14}, Landroidx/compose/runtime/Composer;->changed(J)Z

    .line 134
    .line 135
    .line 136
    move-result v15

    .line 137
    if-eqz v15, :cond_c

    .line 138
    .line 139
    const/16 v15, 0x4000

    .line 140
    .line 141
    goto :goto_a

    .line 142
    :cond_b
    move-wide/from16 v13, p5

    .line 143
    .line 144
    :cond_c
    const/16 v15, 0x2000

    .line 145
    .line 146
    :goto_a
    or-int/2addr v3, v15

    .line 147
    goto :goto_b

    .line 148
    :cond_d
    move-wide/from16 v13, p5

    .line 149
    .line 150
    :goto_b
    and-int/lit8 v15, p11, 0x20

    .line 151
    .line 152
    if-eqz v15, :cond_e

    .line 153
    .line 154
    const/high16 v16, 0x30000

    .line 155
    .line 156
    or-int v3, v3, v16

    .line 157
    .line 158
    move/from16 v8, p7

    .line 159
    .line 160
    goto :goto_d

    .line 161
    :cond_e
    const/high16 v16, 0x70000

    .line 162
    .line 163
    and-int v16, v10, v16

    .line 164
    .line 165
    move/from16 v8, p7

    .line 166
    .line 167
    if-nez v16, :cond_10

    .line 168
    .line 169
    invoke-interface {v2, v8}, Landroidx/compose/runtime/Composer;->changed(F)Z

    .line 170
    .line 171
    .line 172
    move-result v16

    .line 173
    if-eqz v16, :cond_f

    .line 174
    .line 175
    const/high16 v16, 0x20000

    .line 176
    .line 177
    goto :goto_c

    .line 178
    :cond_f
    const/high16 v16, 0x10000

    .line 179
    .line 180
    :goto_c
    or-int v3, v3, v16

    .line 181
    .line 182
    :cond_10
    :goto_d
    and-int/lit8 v16, p11, 0x40

    .line 183
    .line 184
    if-eqz v16, :cond_11

    .line 185
    .line 186
    const/high16 v16, 0x180000

    .line 187
    .line 188
    :goto_e
    or-int v3, v3, v16

    .line 189
    .line 190
    goto :goto_f

    .line 191
    :cond_11
    const/high16 v16, 0x380000

    .line 192
    .line 193
    and-int v16, v10, v16

    .line 194
    .line 195
    if-nez v16, :cond_13

    .line 196
    .line 197
    invoke-interface {v2, v9}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 198
    .line 199
    .line 200
    move-result v16

    .line 201
    if-eqz v16, :cond_12

    .line 202
    .line 203
    const/high16 v16, 0x100000

    .line 204
    .line 205
    goto :goto_e

    .line 206
    :cond_12
    const/high16 v16, 0x80000

    .line 207
    .line 208
    goto :goto_e

    .line 209
    :cond_13
    :goto_f
    const v16, 0x2db6db

    .line 210
    .line 211
    .line 212
    and-int v0, v3, v16

    .line 213
    .line 214
    const v5, 0x92492

    .line 215
    .line 216
    .line 217
    if-ne v0, v5, :cond_15

    .line 218
    .line 219
    invoke-interface {v2}, Landroidx/compose/runtime/Composer;->getSkipping()Z

    .line 220
    .line 221
    .line 222
    move-result v0

    .line 223
    if-nez v0, :cond_14

    .line 224
    .line 225
    goto :goto_10

    .line 226
    :cond_14
    invoke-interface {v2}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    .line 227
    .line 228
    .line 229
    move-object/from16 v3, p1

    .line 230
    .line 231
    move-object v4, v7

    .line 232
    move-wide v6, v11

    .line 233
    move-wide/from16 v24, v13

    .line 234
    .line 235
    goto/16 :goto_17

    .line 236
    .line 237
    :cond_15
    :goto_10
    invoke-interface {v2}, Landroidx/compose/runtime/Composer;->startDefaults()V

    .line 238
    .line 239
    .line 240
    and-int/lit8 v0, v10, 0x1

    .line 241
    .line 242
    const v5, -0xe001

    .line 243
    .line 244
    .line 245
    if-eqz v0, :cond_19

    .line 246
    .line 247
    invoke-interface {v2}, Landroidx/compose/runtime/Composer;->getDefaultsInvalid()Z

    .line 248
    .line 249
    .line 250
    move-result v0

    .line 251
    if-eqz v0, :cond_16

    .line 252
    .line 253
    goto :goto_11

    .line 254
    :cond_16
    invoke-interface {v2}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    .line 255
    .line 256
    .line 257
    and-int/lit8 v0, p11, 0x8

    .line 258
    .line 259
    if-eqz v0, :cond_17

    .line 260
    .line 261
    and-int/lit16 v3, v3, -0x1c01

    .line 262
    .line 263
    :cond_17
    and-int/lit8 v0, p11, 0x10

    .line 264
    .line 265
    if-eqz v0, :cond_18

    .line 266
    .line 267
    and-int/2addr v3, v5

    .line 268
    :cond_18
    move-object/from16 v0, p1

    .line 269
    .line 270
    move-object v4, v7

    .line 271
    move-wide v6, v11

    .line 272
    move-wide/from16 v24, v13

    .line 273
    .line 274
    goto :goto_16

    .line 275
    :cond_19
    :goto_11
    if-eqz v4, :cond_1a

    .line 276
    .line 277
    sget-object v0, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    .line 278
    .line 279
    goto :goto_12

    .line 280
    :cond_1a
    move-object/from16 v0, p1

    .line 281
    .line 282
    :goto_12
    if-eqz v6, :cond_1b

    .line 283
    .line 284
    invoke-static {}, Landroidx/compose/ui/graphics/RectangleShapeKt;->getRectangleShape()Landroidx/compose/ui/graphics/Shape;

    .line 285
    .line 286
    .line 287
    move-result-object v4

    .line 288
    goto :goto_13

    .line 289
    :cond_1b
    move-object v4, v7

    .line 290
    :goto_13
    and-int/lit8 v6, p11, 0x8

    .line 291
    .line 292
    if-eqz v6, :cond_1c

    .line 293
    .line 294
    sget-object v6, Landroidx/compose/material3/MaterialTheme;->INSTANCE:Landroidx/compose/material3/MaterialTheme;

    .line 295
    .line 296
    const/4 v7, 0x6

    .line 297
    invoke-virtual {v6, v2, v7}, Landroidx/compose/material3/MaterialTheme;->getColorScheme(Landroidx/compose/runtime/Composer;I)Landroidx/compose/material3/ColorScheme;

    .line 298
    .line 299
    .line 300
    move-result-object v6

    .line 301
    invoke-virtual {v6}, Landroidx/compose/material3/ColorScheme;->getSurface-0d7_KjU()J

    .line 302
    .line 303
    .line 304
    move-result-wide v6

    .line 305
    and-int/lit16 v3, v3, -0x1c01

    .line 306
    .line 307
    goto :goto_14

    .line 308
    :cond_1c
    move-wide v6, v11

    .line 309
    :goto_14
    and-int/lit8 v11, p11, 0x10

    .line 310
    .line 311
    if-eqz v11, :cond_1d

    .line 312
    .line 313
    shr-int/lit8 v11, v3, 0x9

    .line 314
    .line 315
    and-int/lit8 v11, v11, 0xe

    .line 316
    .line 317
    invoke-static {v6, v7, v2, v11}, Landroidx/compose/material3/ColorSchemeKt;->contentColorFor-ek8zF_U(JLandroidx/compose/runtime/Composer;I)J

    .line 318
    .line 319
    .line 320
    move-result-wide v11

    .line 321
    and-int/2addr v3, v5

    .line 322
    goto :goto_15

    .line 323
    :cond_1d
    move-wide v11, v13

    .line 324
    :goto_15
    if-eqz v15, :cond_1e

    .line 325
    .line 326
    sget-object v5, Landroidx/compose/material3/DrawerDefaults;->INSTANCE:Landroidx/compose/material3/DrawerDefaults;

    .line 327
    .line 328
    invoke-virtual {v5}, Landroidx/compose/material3/DrawerDefaults;->getPermanentDrawerElevation-D9Ej5fM()F

    .line 329
    .line 330
    .line 331
    move-result v5

    .line 332
    move v8, v5

    .line 333
    :cond_1e
    move-wide/from16 v24, v11

    .line 334
    .line 335
    :goto_16
    invoke-interface {v2}, Landroidx/compose/runtime/Composer;->endDefaults()V

    .line 336
    .line 337
    .line 338
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 339
    .line 340
    .line 341
    move-result v5

    .line 342
    if-eqz v5, :cond_1f

    .line 343
    .line 344
    const/4 v5, -0x1

    .line 345
    const-string v11, "androidx.compose.material3.DrawerSheet (NavigationDrawer.kt:559)"

    .line 346
    .line 347
    const v12, 0xa6f6635

    .line 348
    .line 349
    .line 350
    invoke-static {v12, v3, v5, v11}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 351
    .line 352
    .line 353
    :cond_1f
    sget v5, Landroidx/compose/material3/NavigationDrawerKt;->MinimumDrawerWidth:F

    .line 354
    .line 355
    const/4 v11, 0x0

    .line 356
    sget-object v12, Landroidx/compose/material3/DrawerDefaults;->INSTANCE:Landroidx/compose/material3/DrawerDefaults;

    .line 357
    .line 358
    invoke-virtual {v12}, Landroidx/compose/material3/DrawerDefaults;->getMaximumDrawerWidth-D9Ej5fM()F

    .line 359
    .line 360
    .line 361
    move-result v12

    .line 362
    const/4 v13, 0x0

    .line 363
    const/16 v14, 0xa

    .line 364
    .line 365
    const/4 v15, 0x0

    .line 366
    move-object/from16 p1, v0

    .line 367
    .line 368
    move/from16 p2, v5

    .line 369
    .line 370
    move/from16 p3, v11

    .line 371
    .line 372
    move/from16 p4, v12

    .line 373
    .line 374
    move/from16 p5, v13

    .line 375
    .line 376
    move/from16 p6, v14

    .line 377
    .line 378
    move-object/from16 p7, v15

    .line 379
    .line 380
    invoke-static/range {p1 .. p7}, Landroidx/compose/foundation/layout/SizeKt;->sizeIn-qDBjuR0$default(Landroidx/compose/ui/Modifier;FFFFILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    .line 381
    .line 382
    .line 383
    move-result-object v5

    .line 384
    const/4 v12, 0x0

    .line 385
    const/4 v13, 0x1

    .line 386
    invoke-static {v5, v11, v13, v12}, Landroidx/compose/foundation/layout/SizeKt;->fillMaxHeight$default(Landroidx/compose/ui/Modifier;FILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    .line 387
    .line 388
    .line 389
    move-result-object v11

    .line 390
    const/16 v18, 0x0

    .line 391
    .line 392
    const/16 v19, 0x0

    .line 393
    .line 394
    new-instance v5, Landroidx/compose/material3/NavigationDrawerKt$DrawerSheet$1;

    .line 395
    .line 396
    invoke-direct {v5, v1, v9, v3}, Landroidx/compose/material3/NavigationDrawerKt$DrawerSheet$1;-><init>(Landroidx/compose/foundation/layout/WindowInsets;Lkotlin/jvm/functions/Function3;I)V

    .line 397
    .line 398
    .line 399
    const v12, 0x392eb850

    .line 400
    .line 401
    .line 402
    invoke-static {v2, v12, v13, v5}, Landroidx/compose/runtime/internal/ComposableLambdaKt;->composableLambda(Landroidx/compose/runtime/Composer;IZLjava/lang/Object;)Landroidx/compose/runtime/internal/ComposableLambda;

    .line 403
    .line 404
    .line 405
    move-result-object v20

    .line 406
    shr-int/lit8 v3, v3, 0x3

    .line 407
    .line 408
    and-int/lit8 v5, v3, 0x70

    .line 409
    .line 410
    const/high16 v12, 0xc00000

    .line 411
    .line 412
    or-int/2addr v5, v12

    .line 413
    and-int/lit16 v12, v3, 0x380

    .line 414
    .line 415
    or-int/2addr v5, v12

    .line 416
    and-int/lit16 v12, v3, 0x1c00

    .line 417
    .line 418
    or-int/2addr v5, v12

    .line 419
    const v12, 0xe000

    .line 420
    .line 421
    .line 422
    and-int/2addr v3, v12

    .line 423
    or-int v22, v5, v3

    .line 424
    .line 425
    const/16 v23, 0x60

    .line 426
    .line 427
    move-object v12, v4

    .line 428
    move-wide v13, v6

    .line 429
    move-wide/from16 v15, v24

    .line 430
    .line 431
    move/from16 v17, v8

    .line 432
    .line 433
    move-object/from16 v21, v2

    .line 434
    .line 435
    invoke-static/range {v11 .. v23}, Landroidx/compose/material3/SurfaceKt;->Surface-T9BRK9s(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/graphics/Shape;JJFFLandroidx/compose/foundation/BorderStroke;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V

    .line 436
    .line 437
    .line 438
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 439
    .line 440
    .line 441
    move-result v3

    .line 442
    if-eqz v3, :cond_20

    .line 443
    .line 444
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 445
    .line 446
    .line 447
    :cond_20
    move-object v3, v0

    .line 448
    :goto_17
    invoke-interface {v2}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    .line 449
    .line 450
    .line 451
    move-result-object v12

    .line 452
    if-nez v12, :cond_21

    .line 453
    .line 454
    goto :goto_18

    .line 455
    :cond_21
    new-instance v13, Landroidx/compose/material3/NavigationDrawerKt$DrawerSheet$2;

    .line 456
    .line 457
    move-object v0, v13

    .line 458
    move-object/from16 v1, p0

    .line 459
    .line 460
    move-object v2, v3

    .line 461
    move-object v3, v4

    .line 462
    move-wide v4, v6

    .line 463
    move-wide/from16 v6, v24

    .line 464
    .line 465
    move-object/from16 v9, p8

    .line 466
    .line 467
    move/from16 v10, p10

    .line 468
    .line 469
    move/from16 v11, p11

    .line 470
    .line 471
    invoke-direct/range {v0 .. v11}, Landroidx/compose/material3/NavigationDrawerKt$DrawerSheet$2;-><init>(Landroidx/compose/foundation/layout/WindowInsets;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/graphics/Shape;JJFLkotlin/jvm/functions/Function3;II)V

    .line 472
    .line 473
    .line 474
    invoke-interface {v12, v13}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lkotlin/jvm/functions/Function2;)V

    .line 475
    .line 476
    .line 477
    :goto_18
    return-void
.end method

.method public static final ModalDrawerSheet-afqeVBk(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/graphics/Shape;JJFLandroidx/compose/foundation/layout/WindowInsets;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V
    .locals 25
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
            "JJF",
            "Landroidx/compose/foundation/layout/WindowInsets;",
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
    move-object/from16 v12, p8

    .line 2
    .line 3
    move/from16 v13, p10

    .line 4
    .line 5
    const-string v0, "content"

    .line 6
    .line 7
    invoke-static {v12, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    const v0, 0x3bac8a48

    .line 11
    .line 12
    .line 13
    move-object/from16 v1, p9

    .line 14
    .line 15
    invoke-interface {v1, v0}, Landroidx/compose/runtime/Composer;->startRestartGroup(I)Landroidx/compose/runtime/Composer;

    .line 16
    .line 17
    .line 18
    move-result-object v14

    .line 19
    and-int/lit8 v1, p11, 0x1

    .line 20
    .line 21
    if-eqz v1, :cond_0

    .line 22
    .line 23
    or-int/lit8 v2, v13, 0x6

    .line 24
    .line 25
    move v3, v2

    .line 26
    move-object/from16 v2, p0

    .line 27
    .line 28
    goto :goto_1

    .line 29
    :cond_0
    and-int/lit8 v2, v13, 0xe

    .line 30
    .line 31
    if-nez v2, :cond_2

    .line 32
    .line 33
    move-object/from16 v2, p0

    .line 34
    .line 35
    invoke-interface {v14, v2}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 36
    .line 37
    .line 38
    move-result v3

    .line 39
    if-eqz v3, :cond_1

    .line 40
    .line 41
    const/4 v3, 0x4

    .line 42
    goto :goto_0

    .line 43
    :cond_1
    const/4 v3, 0x2

    .line 44
    :goto_0
    or-int/2addr v3, v13

    .line 45
    goto :goto_1

    .line 46
    :cond_2
    move-object/from16 v2, p0

    .line 47
    .line 48
    move v3, v13

    .line 49
    :goto_1
    and-int/lit8 v4, v13, 0x70

    .line 50
    .line 51
    if-nez v4, :cond_5

    .line 52
    .line 53
    and-int/lit8 v4, p11, 0x2

    .line 54
    .line 55
    if-nez v4, :cond_3

    .line 56
    .line 57
    move-object/from16 v4, p1

    .line 58
    .line 59
    invoke-interface {v14, v4}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 60
    .line 61
    .line 62
    move-result v5

    .line 63
    if-eqz v5, :cond_4

    .line 64
    .line 65
    const/16 v5, 0x20

    .line 66
    .line 67
    goto :goto_2

    .line 68
    :cond_3
    move-object/from16 v4, p1

    .line 69
    .line 70
    :cond_4
    const/16 v5, 0x10

    .line 71
    .line 72
    :goto_2
    or-int/2addr v3, v5

    .line 73
    goto :goto_3

    .line 74
    :cond_5
    move-object/from16 v4, p1

    .line 75
    .line 76
    :goto_3
    and-int/lit16 v5, v13, 0x380

    .line 77
    .line 78
    if-nez v5, :cond_8

    .line 79
    .line 80
    and-int/lit8 v5, p11, 0x4

    .line 81
    .line 82
    if-nez v5, :cond_6

    .line 83
    .line 84
    move-wide/from16 v5, p2

    .line 85
    .line 86
    invoke-interface {v14, v5, v6}, Landroidx/compose/runtime/Composer;->changed(J)Z

    .line 87
    .line 88
    .line 89
    move-result v7

    .line 90
    if-eqz v7, :cond_7

    .line 91
    .line 92
    const/16 v7, 0x100

    .line 93
    .line 94
    goto :goto_4

    .line 95
    :cond_6
    move-wide/from16 v5, p2

    .line 96
    .line 97
    :cond_7
    const/16 v7, 0x80

    .line 98
    .line 99
    :goto_4
    or-int/2addr v3, v7

    .line 100
    goto :goto_5

    .line 101
    :cond_8
    move-wide/from16 v5, p2

    .line 102
    .line 103
    :goto_5
    and-int/lit16 v7, v13, 0x1c00

    .line 104
    .line 105
    if-nez v7, :cond_b

    .line 106
    .line 107
    and-int/lit8 v7, p11, 0x8

    .line 108
    .line 109
    if-nez v7, :cond_9

    .line 110
    .line 111
    move-wide/from16 v7, p4

    .line 112
    .line 113
    invoke-interface {v14, v7, v8}, Landroidx/compose/runtime/Composer;->changed(J)Z

    .line 114
    .line 115
    .line 116
    move-result v9

    .line 117
    if-eqz v9, :cond_a

    .line 118
    .line 119
    const/16 v9, 0x800

    .line 120
    .line 121
    goto :goto_6

    .line 122
    :cond_9
    move-wide/from16 v7, p4

    .line 123
    .line 124
    :cond_a
    const/16 v9, 0x400

    .line 125
    .line 126
    :goto_6
    or-int/2addr v3, v9

    .line 127
    goto :goto_7

    .line 128
    :cond_b
    move-wide/from16 v7, p4

    .line 129
    .line 130
    :goto_7
    and-int/lit8 v9, p11, 0x10

    .line 131
    .line 132
    const v10, 0xe000

    .line 133
    .line 134
    .line 135
    if-eqz v9, :cond_c

    .line 136
    .line 137
    or-int/lit16 v3, v3, 0x6000

    .line 138
    .line 139
    goto :goto_9

    .line 140
    :cond_c
    and-int v11, v13, v10

    .line 141
    .line 142
    if-nez v11, :cond_e

    .line 143
    .line 144
    move/from16 v11, p6

    .line 145
    .line 146
    invoke-interface {v14, v11}, Landroidx/compose/runtime/Composer;->changed(F)Z

    .line 147
    .line 148
    .line 149
    move-result v15

    .line 150
    if-eqz v15, :cond_d

    .line 151
    .line 152
    const/16 v15, 0x4000

    .line 153
    .line 154
    goto :goto_8

    .line 155
    :cond_d
    const/16 v15, 0x2000

    .line 156
    .line 157
    :goto_8
    or-int/2addr v3, v15

    .line 158
    goto :goto_a

    .line 159
    :cond_e
    :goto_9
    move/from16 v11, p6

    .line 160
    .line 161
    :goto_a
    const/high16 v15, 0x70000

    .line 162
    .line 163
    and-int v16, v13, v15

    .line 164
    .line 165
    if-nez v16, :cond_10

    .line 166
    .line 167
    and-int/lit8 v16, p11, 0x20

    .line 168
    .line 169
    move-object/from16 v15, p7

    .line 170
    .line 171
    if-nez v16, :cond_f

    .line 172
    .line 173
    invoke-interface {v14, v15}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 174
    .line 175
    .line 176
    move-result v16

    .line 177
    if-eqz v16, :cond_f

    .line 178
    .line 179
    const/high16 v16, 0x20000

    .line 180
    .line 181
    goto :goto_b

    .line 182
    :cond_f
    const/high16 v16, 0x10000

    .line 183
    .line 184
    :goto_b
    or-int v3, v3, v16

    .line 185
    .line 186
    goto :goto_c

    .line 187
    :cond_10
    move-object/from16 v15, p7

    .line 188
    .line 189
    :goto_c
    and-int/lit8 v16, p11, 0x40

    .line 190
    .line 191
    const/high16 v17, 0x380000

    .line 192
    .line 193
    if-eqz v16, :cond_11

    .line 194
    .line 195
    const/high16 v16, 0x180000

    .line 196
    .line 197
    :goto_d
    or-int v3, v3, v16

    .line 198
    .line 199
    goto :goto_e

    .line 200
    :cond_11
    and-int v16, v13, v17

    .line 201
    .line 202
    if-nez v16, :cond_13

    .line 203
    .line 204
    invoke-interface {v14, v12}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 205
    .line 206
    .line 207
    move-result v16

    .line 208
    if-eqz v16, :cond_12

    .line 209
    .line 210
    const/high16 v16, 0x100000

    .line 211
    .line 212
    goto :goto_d

    .line 213
    :cond_12
    const/high16 v16, 0x80000

    .line 214
    .line 215
    goto :goto_d

    .line 216
    :cond_13
    :goto_e
    const v16, 0x2db6db

    .line 217
    .line 218
    .line 219
    and-int v10, v3, v16

    .line 220
    .line 221
    const v0, 0x92492

    .line 222
    .line 223
    .line 224
    if-ne v10, v0, :cond_15

    .line 225
    .line 226
    invoke-interface {v14}, Landroidx/compose/runtime/Composer;->getSkipping()Z

    .line 227
    .line 228
    .line 229
    move-result v0

    .line 230
    if-nez v0, :cond_14

    .line 231
    .line 232
    goto :goto_f

    .line 233
    :cond_14
    invoke-interface {v14}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    .line 234
    .line 235
    .line 236
    move-object v1, v2

    .line 237
    move-object v2, v4

    .line 238
    move-wide v3, v5

    .line 239
    move-wide v5, v7

    .line 240
    move v7, v11

    .line 241
    move-object v8, v15

    .line 242
    goto/16 :goto_13

    .line 243
    .line 244
    :cond_15
    :goto_f
    invoke-interface {v14}, Landroidx/compose/runtime/Composer;->startDefaults()V

    .line 245
    .line 246
    .line 247
    and-int/lit8 v0, v13, 0x1

    .line 248
    .line 249
    const v10, -0x70001

    .line 250
    .line 251
    .line 252
    if-eqz v0, :cond_1b

    .line 253
    .line 254
    invoke-interface {v14}, Landroidx/compose/runtime/Composer;->getDefaultsInvalid()Z

    .line 255
    .line 256
    .line 257
    move-result v0

    .line 258
    if-eqz v0, :cond_16

    .line 259
    .line 260
    goto :goto_10

    .line 261
    :cond_16
    invoke-interface {v14}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    .line 262
    .line 263
    .line 264
    and-int/lit8 v0, p11, 0x2

    .line 265
    .line 266
    if-eqz v0, :cond_17

    .line 267
    .line 268
    and-int/lit8 v3, v3, -0x71

    .line 269
    .line 270
    :cond_17
    and-int/lit8 v0, p11, 0x4

    .line 271
    .line 272
    if-eqz v0, :cond_18

    .line 273
    .line 274
    and-int/lit16 v3, v3, -0x381

    .line 275
    .line 276
    :cond_18
    and-int/lit8 v0, p11, 0x8

    .line 277
    .line 278
    if-eqz v0, :cond_19

    .line 279
    .line 280
    and-int/lit16 v3, v3, -0x1c01

    .line 281
    .line 282
    :cond_19
    and-int/lit8 v0, p11, 0x20

    .line 283
    .line 284
    if-eqz v0, :cond_1a

    .line 285
    .line 286
    and-int/2addr v3, v10

    .line 287
    :cond_1a
    move-object/from16 v18, v4

    .line 288
    .line 289
    move-wide/from16 v19, v5

    .line 290
    .line 291
    move-wide/from16 v21, v7

    .line 292
    .line 293
    move/from16 v23, v11

    .line 294
    .line 295
    move-object/from16 v24, v15

    .line 296
    .line 297
    move-object v15, v2

    .line 298
    goto/16 :goto_12

    .line 299
    .line 300
    :cond_1b
    :goto_10
    if-eqz v1, :cond_1c

    .line 301
    .line 302
    sget-object v0, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    .line 303
    .line 304
    goto :goto_11

    .line 305
    :cond_1c
    move-object v0, v2

    .line 306
    :goto_11
    and-int/lit8 v1, p11, 0x2

    .line 307
    .line 308
    const/4 v2, 0x6

    .line 309
    if-eqz v1, :cond_1d

    .line 310
    .line 311
    sget-object v1, Landroidx/compose/material3/DrawerDefaults;->INSTANCE:Landroidx/compose/material3/DrawerDefaults;

    .line 312
    .line 313
    invoke-virtual {v1, v14, v2}, Landroidx/compose/material3/DrawerDefaults;->getShape(Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/graphics/Shape;

    .line 314
    .line 315
    .line 316
    move-result-object v1

    .line 317
    and-int/lit8 v3, v3, -0x71

    .line 318
    .line 319
    move-object v4, v1

    .line 320
    :cond_1d
    and-int/lit8 v1, p11, 0x4

    .line 321
    .line 322
    if-eqz v1, :cond_1e

    .line 323
    .line 324
    sget-object v1, Landroidx/compose/material3/MaterialTheme;->INSTANCE:Landroidx/compose/material3/MaterialTheme;

    .line 325
    .line 326
    invoke-virtual {v1, v14, v2}, Landroidx/compose/material3/MaterialTheme;->getColorScheme(Landroidx/compose/runtime/Composer;I)Landroidx/compose/material3/ColorScheme;

    .line 327
    .line 328
    .line 329
    move-result-object v1

    .line 330
    invoke-virtual {v1}, Landroidx/compose/material3/ColorScheme;->getSurface-0d7_KjU()J

    .line 331
    .line 332
    .line 333
    move-result-wide v5

    .line 334
    and-int/lit16 v3, v3, -0x381

    .line 335
    .line 336
    :cond_1e
    and-int/lit8 v1, p11, 0x8

    .line 337
    .line 338
    if-eqz v1, :cond_1f

    .line 339
    .line 340
    shr-int/lit8 v1, v3, 0x6

    .line 341
    .line 342
    and-int/lit8 v1, v1, 0xe

    .line 343
    .line 344
    invoke-static {v5, v6, v14, v1}, Landroidx/compose/material3/ColorSchemeKt;->contentColorFor-ek8zF_U(JLandroidx/compose/runtime/Composer;I)J

    .line 345
    .line 346
    .line 347
    move-result-wide v7

    .line 348
    and-int/lit16 v1, v3, -0x1c01

    .line 349
    .line 350
    move v3, v1

    .line 351
    :cond_1f
    if-eqz v9, :cond_20

    .line 352
    .line 353
    sget-object v1, Landroidx/compose/material3/DrawerDefaults;->INSTANCE:Landroidx/compose/material3/DrawerDefaults;

    .line 354
    .line 355
    invoke-virtual {v1}, Landroidx/compose/material3/DrawerDefaults;->getModalDrawerElevation-D9Ej5fM()F

    .line 356
    .line 357
    .line 358
    move-result v1

    .line 359
    move v11, v1

    .line 360
    :cond_20
    and-int/lit8 v1, p11, 0x20

    .line 361
    .line 362
    if-eqz v1, :cond_21

    .line 363
    .line 364
    sget-object v1, Landroidx/compose/material3/DrawerDefaults;->INSTANCE:Landroidx/compose/material3/DrawerDefaults;

    .line 365
    .line 366
    invoke-virtual {v1, v14, v2}, Landroidx/compose/material3/DrawerDefaults;->getWindowInsets(Landroidx/compose/runtime/Composer;I)Landroidx/compose/foundation/layout/WindowInsets;

    .line 367
    .line 368
    .line 369
    move-result-object v1

    .line 370
    and-int/2addr v3, v10

    .line 371
    move-object v15, v0

    .line 372
    move-object/from16 v24, v1

    .line 373
    .line 374
    move-object/from16 v18, v4

    .line 375
    .line 376
    move-wide/from16 v19, v5

    .line 377
    .line 378
    move-wide/from16 v21, v7

    .line 379
    .line 380
    move/from16 v23, v11

    .line 381
    .line 382
    goto :goto_12

    .line 383
    :cond_21
    move-object/from16 v18, v4

    .line 384
    .line 385
    move-wide/from16 v19, v5

    .line 386
    .line 387
    move-wide/from16 v21, v7

    .line 388
    .line 389
    move/from16 v23, v11

    .line 390
    .line 391
    move-object/from16 v24, v15

    .line 392
    .line 393
    move-object v15, v0

    .line 394
    :goto_12
    invoke-interface {v14}, Landroidx/compose/runtime/Composer;->endDefaults()V

    .line 395
    .line 396
    .line 397
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 398
    .line 399
    .line 400
    move-result v0

    .line 401
    if-eqz v0, :cond_22

    .line 402
    .line 403
    const/4 v0, -0x1

    .line 404
    const-string v1, "androidx.compose.material3.ModalDrawerSheet (NavigationDrawer.kt:458)"

    .line 405
    .line 406
    const v2, 0x3bac8a48

    .line 407
    .line 408
    .line 409
    invoke-static {v2, v3, v0, v1}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 410
    .line 411
    .line 412
    :cond_22
    shr-int/lit8 v0, v3, 0xf

    .line 413
    .line 414
    and-int/lit8 v0, v0, 0xe

    .line 415
    .line 416
    shl-int/lit8 v1, v3, 0x3

    .line 417
    .line 418
    and-int/lit8 v2, v1, 0x70

    .line 419
    .line 420
    or-int/2addr v0, v2

    .line 421
    and-int/lit16 v2, v1, 0x380

    .line 422
    .line 423
    or-int/2addr v0, v2

    .line 424
    and-int/lit16 v2, v1, 0x1c00

    .line 425
    .line 426
    or-int/2addr v0, v2

    .line 427
    const v2, 0xe000

    .line 428
    .line 429
    .line 430
    and-int/2addr v2, v1

    .line 431
    or-int/2addr v0, v2

    .line 432
    const/high16 v2, 0x70000

    .line 433
    .line 434
    and-int/2addr v1, v2

    .line 435
    or-int/2addr v0, v1

    .line 436
    and-int v1, v3, v17

    .line 437
    .line 438
    or-int v10, v0, v1

    .line 439
    .line 440
    const/4 v11, 0x0

    .line 441
    move-object/from16 v0, v24

    .line 442
    .line 443
    move-object v1, v15

    .line 444
    move-object/from16 v2, v18

    .line 445
    .line 446
    move-wide/from16 v3, v19

    .line 447
    .line 448
    move-wide/from16 v5, v21

    .line 449
    .line 450
    move/from16 v7, v23

    .line 451
    .line 452
    move-object/from16 v8, p8

    .line 453
    .line 454
    move-object v9, v14

    .line 455
    invoke-static/range {v0 .. v11}, Landroidx/compose/material3/NavigationDrawerKt;->DrawerSheet-vywBR7E(Landroidx/compose/foundation/layout/WindowInsets;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/graphics/Shape;JJFLkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V

    .line 456
    .line 457
    .line 458
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 459
    .line 460
    .line 461
    move-result v0

    .line 462
    if-eqz v0, :cond_23

    .line 463
    .line 464
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 465
    .line 466
    .line 467
    :cond_23
    move-object v1, v15

    .line 468
    move-object/from16 v2, v18

    .line 469
    .line 470
    move-wide/from16 v3, v19

    .line 471
    .line 472
    move-wide/from16 v5, v21

    .line 473
    .line 474
    move/from16 v7, v23

    .line 475
    .line 476
    move-object/from16 v8, v24

    .line 477
    .line 478
    :goto_13
    invoke-interface {v14}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    .line 479
    .line 480
    .line 481
    move-result-object v14

    .line 482
    if-nez v14, :cond_24

    .line 483
    .line 484
    goto :goto_14

    .line 485
    :cond_24
    new-instance v15, Landroidx/compose/material3/NavigationDrawerKt$ModalDrawerSheet$1;

    .line 486
    .line 487
    move-object v0, v15

    .line 488
    move-object/from16 v9, p8

    .line 489
    .line 490
    move/from16 v10, p10

    .line 491
    .line 492
    move/from16 v11, p11

    .line 493
    .line 494
    invoke-direct/range {v0 .. v11}, Landroidx/compose/material3/NavigationDrawerKt$ModalDrawerSheet$1;-><init>(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/graphics/Shape;JJFLandroidx/compose/foundation/layout/WindowInsets;Lkotlin/jvm/functions/Function3;II)V

    .line 495
    .line 496
    .line 497
    invoke-interface {v14, v15}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lkotlin/jvm/functions/Function2;)V

    .line 498
    .line 499
    .line 500
    :goto_14
    return-void
.end method

.method public static final ModalNavigationDrawer-FHprtrg(Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/Modifier;Landroidx/compose/material3/DrawerState;ZJLkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V
    .locals 32
    .annotation runtime Landroidx/compose/material3/ExperimentalMaterial3Api;
    .end annotation

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
            "Landroidx/compose/ui/Modifier;",
            "Landroidx/compose/material3/DrawerState;",
            "ZJ",
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
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v7, p6

    .line 4
    .line 5
    move/from16 v8, p8

    .line 6
    .line 7
    const-string v0, "drawerContent"

    .line 8
    .line 9
    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    const-string v0, "content"

    .line 13
    .line 14
    invoke-static {v7, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    const v0, -0x45b22880

    .line 18
    .line 19
    .line 20
    move-object/from16 v2, p7

    .line 21
    .line 22
    invoke-interface {v2, v0}, Landroidx/compose/runtime/Composer;->startRestartGroup(I)Landroidx/compose/runtime/Composer;

    .line 23
    .line 24
    .line 25
    move-result-object v2

    .line 26
    and-int/lit8 v3, p9, 0x1

    .line 27
    .line 28
    const/4 v4, 0x2

    .line 29
    if-eqz v3, :cond_0

    .line 30
    .line 31
    or-int/lit8 v3, v8, 0x6

    .line 32
    .line 33
    goto :goto_1

    .line 34
    :cond_0
    and-int/lit8 v3, v8, 0xe

    .line 35
    .line 36
    if-nez v3, :cond_2

    .line 37
    .line 38
    invoke-interface {v2, v1}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 39
    .line 40
    .line 41
    move-result v3

    .line 42
    if-eqz v3, :cond_1

    .line 43
    .line 44
    const/4 v3, 0x4

    .line 45
    goto :goto_0

    .line 46
    :cond_1
    move v3, v4

    .line 47
    :goto_0
    or-int/2addr v3, v8

    .line 48
    goto :goto_1

    .line 49
    :cond_2
    move v3, v8

    .line 50
    :goto_1
    and-int/lit8 v5, p9, 0x2

    .line 51
    .line 52
    if-eqz v5, :cond_3

    .line 53
    .line 54
    or-int/lit8 v3, v3, 0x30

    .line 55
    .line 56
    goto :goto_3

    .line 57
    :cond_3
    and-int/lit8 v6, v8, 0x70

    .line 58
    .line 59
    if-nez v6, :cond_5

    .line 60
    .line 61
    move-object/from16 v6, p1

    .line 62
    .line 63
    invoke-interface {v2, v6}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 64
    .line 65
    .line 66
    move-result v9

    .line 67
    if-eqz v9, :cond_4

    .line 68
    .line 69
    const/16 v9, 0x20

    .line 70
    .line 71
    goto :goto_2

    .line 72
    :cond_4
    const/16 v9, 0x10

    .line 73
    .line 74
    :goto_2
    or-int/2addr v3, v9

    .line 75
    goto :goto_4

    .line 76
    :cond_5
    :goto_3
    move-object/from16 v6, p1

    .line 77
    .line 78
    :goto_4
    and-int/lit16 v9, v8, 0x380

    .line 79
    .line 80
    if-nez v9, :cond_8

    .line 81
    .line 82
    and-int/lit8 v9, p9, 0x4

    .line 83
    .line 84
    if-nez v9, :cond_6

    .line 85
    .line 86
    move-object/from16 v9, p2

    .line 87
    .line 88
    invoke-interface {v2, v9}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 89
    .line 90
    .line 91
    move-result v10

    .line 92
    if-eqz v10, :cond_7

    .line 93
    .line 94
    const/16 v10, 0x100

    .line 95
    .line 96
    goto :goto_5

    .line 97
    :cond_6
    move-object/from16 v9, p2

    .line 98
    .line 99
    :cond_7
    const/16 v10, 0x80

    .line 100
    .line 101
    :goto_5
    or-int/2addr v3, v10

    .line 102
    goto :goto_6

    .line 103
    :cond_8
    move-object/from16 v9, p2

    .line 104
    .line 105
    :goto_6
    and-int/lit8 v10, p9, 0x8

    .line 106
    .line 107
    if-eqz v10, :cond_9

    .line 108
    .line 109
    or-int/lit16 v3, v3, 0xc00

    .line 110
    .line 111
    goto :goto_8

    .line 112
    :cond_9
    and-int/lit16 v11, v8, 0x1c00

    .line 113
    .line 114
    if-nez v11, :cond_b

    .line 115
    .line 116
    move/from16 v11, p3

    .line 117
    .line 118
    invoke-interface {v2, v11}, Landroidx/compose/runtime/Composer;->changed(Z)Z

    .line 119
    .line 120
    .line 121
    move-result v12

    .line 122
    if-eqz v12, :cond_a

    .line 123
    .line 124
    const/16 v12, 0x800

    .line 125
    .line 126
    goto :goto_7

    .line 127
    :cond_a
    const/16 v12, 0x400

    .line 128
    .line 129
    :goto_7
    or-int/2addr v3, v12

    .line 130
    goto :goto_9

    .line 131
    :cond_b
    :goto_8
    move/from16 v11, p3

    .line 132
    .line 133
    :goto_9
    const v12, 0xe000

    .line 134
    .line 135
    .line 136
    and-int/2addr v12, v8

    .line 137
    if-nez v12, :cond_e

    .line 138
    .line 139
    and-int/lit8 v12, p9, 0x10

    .line 140
    .line 141
    if-nez v12, :cond_c

    .line 142
    .line 143
    move-wide/from16 v12, p4

    .line 144
    .line 145
    invoke-interface {v2, v12, v13}, Landroidx/compose/runtime/Composer;->changed(J)Z

    .line 146
    .line 147
    .line 148
    move-result v14

    .line 149
    if-eqz v14, :cond_d

    .line 150
    .line 151
    const/16 v14, 0x4000

    .line 152
    .line 153
    goto :goto_a

    .line 154
    :cond_c
    move-wide/from16 v12, p4

    .line 155
    .line 156
    :cond_d
    const/16 v14, 0x2000

    .line 157
    .line 158
    :goto_a
    or-int/2addr v3, v14

    .line 159
    goto :goto_b

    .line 160
    :cond_e
    move-wide/from16 v12, p4

    .line 161
    .line 162
    :goto_b
    and-int/lit8 v14, p9, 0x20

    .line 163
    .line 164
    if-eqz v14, :cond_f

    .line 165
    .line 166
    const/high16 v14, 0x30000

    .line 167
    .line 168
    :goto_c
    or-int/2addr v3, v14

    .line 169
    goto :goto_d

    .line 170
    :cond_f
    const/high16 v14, 0x70000

    .line 171
    .line 172
    and-int/2addr v14, v8

    .line 173
    if-nez v14, :cond_11

    .line 174
    .line 175
    invoke-interface {v2, v7}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 176
    .line 177
    .line 178
    move-result v14

    .line 179
    if-eqz v14, :cond_10

    .line 180
    .line 181
    const/high16 v14, 0x20000

    .line 182
    .line 183
    goto :goto_c

    .line 184
    :cond_10
    const/high16 v14, 0x10000

    .line 185
    .line 186
    goto :goto_c

    .line 187
    :cond_11
    :goto_d
    const v14, 0x5b6db

    .line 188
    .line 189
    .line 190
    and-int/2addr v14, v3

    .line 191
    const v15, 0x12492

    .line 192
    .line 193
    .line 194
    if-ne v14, v15, :cond_13

    .line 195
    .line 196
    invoke-interface {v2}, Landroidx/compose/runtime/Composer;->getSkipping()Z

    .line 197
    .line 198
    .line 199
    move-result v14

    .line 200
    if-nez v14, :cond_12

    .line 201
    .line 202
    goto :goto_e

    .line 203
    :cond_12
    invoke-interface {v2}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    .line 204
    .line 205
    .line 206
    move-object v3, v9

    .line 207
    move v4, v11

    .line 208
    goto/16 :goto_16

    .line 209
    .line 210
    :cond_13
    :goto_e
    invoke-interface {v2}, Landroidx/compose/runtime/Composer;->startDefaults()V

    .line 211
    .line 212
    .line 213
    and-int/lit8 v14, v8, 0x1

    .line 214
    .line 215
    const v15, -0xe001

    .line 216
    .line 217
    .line 218
    const/4 v0, 0x1

    .line 219
    if-eqz v14, :cond_17

    .line 220
    .line 221
    invoke-interface {v2}, Landroidx/compose/runtime/Composer;->getDefaultsInvalid()Z

    .line 222
    .line 223
    .line 224
    move-result v14

    .line 225
    if-eqz v14, :cond_14

    .line 226
    .line 227
    goto :goto_10

    .line 228
    :cond_14
    invoke-interface {v2}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    .line 229
    .line 230
    .line 231
    and-int/lit8 v5, p9, 0x4

    .line 232
    .line 233
    if-eqz v5, :cond_15

    .line 234
    .line 235
    and-int/lit16 v3, v3, -0x381

    .line 236
    .line 237
    :cond_15
    and-int/lit8 v5, p9, 0x10

    .line 238
    .line 239
    if-eqz v5, :cond_16

    .line 240
    .line 241
    :goto_f
    and-int/2addr v3, v15

    .line 242
    :cond_16
    move v15, v3

    .line 243
    move-object v3, v9

    .line 244
    move v5, v11

    .line 245
    move-wide/from16 v30, v12

    .line 246
    .line 247
    goto :goto_11

    .line 248
    :cond_17
    :goto_10
    if-eqz v5, :cond_18

    .line 249
    .line 250
    sget-object v5, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    .line 251
    .line 252
    move-object v6, v5

    .line 253
    :cond_18
    and-int/lit8 v5, p9, 0x4

    .line 254
    .line 255
    if-eqz v5, :cond_19

    .line 256
    .line 257
    sget-object v5, Landroidx/compose/material3/DrawerValue;->Closed:Landroidx/compose/material3/DrawerValue;

    .line 258
    .line 259
    const/4 v9, 0x0

    .line 260
    const/4 v14, 0x6

    .line 261
    invoke-static {v5, v9, v2, v14, v4}, Landroidx/compose/material3/NavigationDrawerKt;->rememberDrawerState(Landroidx/compose/material3/DrawerValue;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)Landroidx/compose/material3/DrawerState;

    .line 262
    .line 263
    .line 264
    move-result-object v5

    .line 265
    and-int/lit16 v3, v3, -0x381

    .line 266
    .line 267
    move-object v9, v5

    .line 268
    :cond_19
    if-eqz v10, :cond_1a

    .line 269
    .line 270
    move v11, v0

    .line 271
    :cond_1a
    and-int/lit8 v5, p9, 0x10

    .line 272
    .line 273
    if-eqz v5, :cond_16

    .line 274
    .line 275
    sget-object v5, Landroidx/compose/material3/DrawerDefaults;->INSTANCE:Landroidx/compose/material3/DrawerDefaults;

    .line 276
    .line 277
    const/4 v10, 0x6

    .line 278
    invoke-virtual {v5, v2, v10}, Landroidx/compose/material3/DrawerDefaults;->getScrimColor(Landroidx/compose/runtime/Composer;I)J

    .line 279
    .line 280
    .line 281
    move-result-wide v12

    .line 282
    goto :goto_f

    .line 283
    :goto_11
    invoke-interface {v2}, Landroidx/compose/runtime/Composer;->endDefaults()V

    .line 284
    .line 285
    .line 286
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 287
    .line 288
    .line 289
    move-result v9

    .line 290
    if-eqz v9, :cond_1b

    .line 291
    .line 292
    const/4 v9, -0x1

    .line 293
    const-string v10, "androidx.compose.material3.ModalNavigationDrawer (NavigationDrawer.kt:255)"

    .line 294
    .line 295
    const v11, -0x45b22880

    .line 296
    .line 297
    .line 298
    invoke-static {v11, v15, v9, v10}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 299
    .line 300
    .line 301
    :cond_1b
    const v9, 0x2e20b340

    .line 302
    .line 303
    .line 304
    invoke-interface {v2, v9}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 305
    .line 306
    .line 307
    const v9, -0x1d58f75c

    .line 308
    .line 309
    .line 310
    invoke-interface {v2, v9}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 311
    .line 312
    .line 313
    invoke-interface {v2}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 314
    .line 315
    .line 316
    move-result-object v9

    .line 317
    sget-object v16, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    .line 318
    .line 319
    invoke-virtual/range {v16 .. v16}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    .line 320
    .line 321
    .line 322
    move-result-object v10

    .line 323
    if-ne v9, v10, :cond_1c

    .line 324
    .line 325
    sget-object v9, Lkotlin/coroutines/EmptyCoroutineContext;->INSTANCE:Lkotlin/coroutines/EmptyCoroutineContext;

    .line 326
    .line 327
    invoke-static {v9, v2}, Landroidx/compose/runtime/EffectsKt;->createCompositionCoroutineScope(Lkotlin/coroutines/CoroutineContext;Landroidx/compose/runtime/Composer;)Lkotlinx/coroutines/CoroutineScope;

    .line 328
    .line 329
    .line 330
    move-result-object v9

    .line 331
    new-instance v10, Landroidx/compose/runtime/CompositionScopedCoroutineScopeCanceller;

    .line 332
    .line 333
    invoke-direct {v10, v9}, Landroidx/compose/runtime/CompositionScopedCoroutineScopeCanceller;-><init>(Lkotlinx/coroutines/CoroutineScope;)V

    .line 334
    .line 335
    .line 336
    invoke-interface {v2, v10}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 337
    .line 338
    .line 339
    move-object v9, v10

    .line 340
    :cond_1c
    invoke-interface {v2}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 341
    .line 342
    .line 343
    check-cast v9, Landroidx/compose/runtime/CompositionScopedCoroutineScopeCanceller;

    .line 344
    .line 345
    invoke-virtual {v9}, Landroidx/compose/runtime/CompositionScopedCoroutineScopeCanceller;->getCoroutineScope()Lkotlinx/coroutines/CoroutineScope;

    .line 346
    .line 347
    .line 348
    move-result-object v14

    .line 349
    invoke-interface {v2}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 350
    .line 351
    .line 352
    sget-object v9, Landroidx/compose/material3/Strings;->Companion:Landroidx/compose/material3/Strings$Companion;

    .line 353
    .line 354
    invoke-virtual {v9}, Landroidx/compose/material3/Strings$Companion;->getNavigationMenu-adMyvUU()I

    .line 355
    .line 356
    .line 357
    move-result v9

    .line 358
    const/4 v10, 0x6

    .line 359
    invoke-static {v9, v2, v10}, Landroidx/compose/material3/Strings_androidKt;->getString-NWtq2-8(ILandroidx/compose/runtime/Composer;I)Ljava/lang/String;

    .line 360
    .line 361
    .line 362
    move-result-object v12

    .line 363
    invoke-static {}, Landroidx/compose/ui/platform/CompositionLocalsKt;->getLocalDensity()Landroidx/compose/runtime/ProvidableCompositionLocal;

    .line 364
    .line 365
    .line 366
    move-result-object v9

    .line 367
    invoke-interface {v2, v9}, Landroidx/compose/runtime/Composer;->consume(Landroidx/compose/runtime/CompositionLocal;)Ljava/lang/Object;

    .line 368
    .line 369
    .line 370
    move-result-object v9

    .line 371
    check-cast v9, Landroidx/compose/ui/unit/Density;

    .line 372
    .line 373
    sget-object v10, Landroidx/compose/material3/tokens/NavigationDrawerTokens;->INSTANCE:Landroidx/compose/material3/tokens/NavigationDrawerTokens;

    .line 374
    .line 375
    invoke-virtual {v10}, Landroidx/compose/material3/tokens/NavigationDrawerTokens;->getContainerWidth-D9Ej5fM()F

    .line 376
    .line 377
    .line 378
    move-result v10

    .line 379
    invoke-interface {v9, v10}, Landroidx/compose/ui/unit/Density;->toPx-0680j_4(F)F

    .line 380
    .line 381
    .line 382
    move-result v9

    .line 383
    neg-float v9, v9

    .line 384
    new-array v4, v4, [Lkotlin/Pair;

    .line 385
    .line 386
    invoke-static {v9}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 387
    .line 388
    .line 389
    move-result-object v10

    .line 390
    sget-object v11, Landroidx/compose/material3/DrawerValue;->Closed:Landroidx/compose/material3/DrawerValue;

    .line 391
    .line 392
    invoke-static {v10, v11}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 393
    .line 394
    .line 395
    move-result-object v10

    .line 396
    const/4 v13, 0x0

    .line 397
    aput-object v10, v4, v13

    .line 398
    .line 399
    const/4 v10, 0x0

    .line 400
    invoke-static {v10}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 401
    .line 402
    .line 403
    move-result-object v11

    .line 404
    sget-object v13, Landroidx/compose/material3/DrawerValue;->Open:Landroidx/compose/material3/DrawerValue;

    .line 405
    .line 406
    invoke-static {v11, v13}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 407
    .line 408
    .line 409
    move-result-object v11

    .line 410
    aput-object v11, v4, v0

    .line 411
    .line 412
    invoke-static {v4}, Lkotlin/collections/MapsKt;->mapOf([Lkotlin/Pair;)Ljava/util/Map;

    .line 413
    .line 414
    .line 415
    move-result-object v20

    .line 416
    invoke-static {}, Landroidx/compose/ui/platform/CompositionLocalsKt;->getLocalLayoutDirection()Landroidx/compose/runtime/ProvidableCompositionLocal;

    .line 417
    .line 418
    .line 419
    move-result-object v4

    .line 420
    invoke-interface {v2, v4}, Landroidx/compose/runtime/Composer;->consume(Landroidx/compose/runtime/CompositionLocal;)Ljava/lang/Object;

    .line 421
    .line 422
    .line 423
    move-result-object v4

    .line 424
    sget-object v11, Landroidx/compose/ui/unit/LayoutDirection;->Rtl:Landroidx/compose/ui/unit/LayoutDirection;

    .line 425
    .line 426
    if-ne v4, v11, :cond_1d

    .line 427
    .line 428
    move/from16 v23, v0

    .line 429
    .line 430
    const/4 v4, 0x0

    .line 431
    goto :goto_12

    .line 432
    :cond_1d
    const/4 v4, 0x0

    .line 433
    const/16 v23, 0x0

    .line 434
    .line 435
    :goto_12
    invoke-static {v6, v10, v0, v4}, Landroidx/compose/foundation/layout/SizeKt;->fillMaxSize$default(Landroidx/compose/ui/Modifier;FILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    .line 436
    .line 437
    .line 438
    move-result-object v18

    .line 439
    invoke-virtual {v3}, Landroidx/compose/material3/DrawerState;->getSwipeableState$material3_release()Landroidx/compose/material3/SwipeableState;

    .line 440
    .line 441
    .line 442
    move-result-object v19

    .line 443
    sget-object v21, Landroidx/compose/foundation/gestures/Orientation;->Horizontal:Landroidx/compose/foundation/gestures/Orientation;

    .line 444
    .line 445
    sget v27, Landroidx/compose/material3/NavigationDrawerKt;->DrawerVelocityThreshold:F

    .line 446
    .line 447
    const/16 v24, 0x0

    .line 448
    .line 449
    sget-object v25, Landroidx/compose/material3/NavigationDrawerKt$ModalNavigationDrawer$1;->INSTANCE:Landroidx/compose/material3/NavigationDrawerKt$ModalNavigationDrawer$1;

    .line 450
    .line 451
    const/16 v26, 0x0

    .line 452
    .line 453
    const/16 v28, 0x20

    .line 454
    .line 455
    const/16 v29, 0x0

    .line 456
    .line 457
    move/from16 v22, v5

    .line 458
    .line 459
    invoke-static/range {v18 .. v29}, Landroidx/compose/material3/SwipeableKt;->swipeable-pPrIpRY$default(Landroidx/compose/ui/Modifier;Landroidx/compose/material3/SwipeableState;Ljava/util/Map;Landroidx/compose/foundation/gestures/Orientation;ZZLandroidx/compose/foundation/interaction/MutableInteractionSource;Lkotlin/jvm/functions/Function2;Landroidx/compose/material3/ResistanceConfig;FILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    .line 460
    .line 461
    .line 462
    move-result-object v4

    .line 463
    const v13, 0x2bb5b5d7

    .line 464
    .line 465
    .line 466
    invoke-interface {v2, v13}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 467
    .line 468
    .line 469
    sget-object v17, Landroidx/compose/ui/Alignment;->Companion:Landroidx/compose/ui/Alignment$Companion;

    .line 470
    .line 471
    invoke-virtual/range {v17 .. v17}, Landroidx/compose/ui/Alignment$Companion;->getTopStart()Landroidx/compose/ui/Alignment;

    .line 472
    .line 473
    .line 474
    move-result-object v11

    .line 475
    const/4 v0, 0x0

    .line 476
    invoke-static {v11, v0, v2, v0}, Landroidx/compose/foundation/layout/BoxKt;->rememberBoxMeasurePolicy(Landroidx/compose/ui/Alignment;ZLandroidx/compose/runtime/Composer;I)Landroidx/compose/ui/layout/MeasurePolicy;

    .line 477
    .line 478
    .line 479
    move-result-object v11

    .line 480
    const v0, -0x4ee9b9da

    .line 481
    .line 482
    .line 483
    invoke-interface {v2, v0}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 484
    .line 485
    .line 486
    invoke-static {}, Landroidx/compose/ui/platform/CompositionLocalsKt;->getLocalDensity()Landroidx/compose/runtime/ProvidableCompositionLocal;

    .line 487
    .line 488
    .line 489
    move-result-object v10

    .line 490
    invoke-interface {v2, v10}, Landroidx/compose/runtime/Composer;->consume(Landroidx/compose/runtime/CompositionLocal;)Ljava/lang/Object;

    .line 491
    .line 492
    .line 493
    move-result-object v10

    .line 494
    check-cast v10, Landroidx/compose/ui/unit/Density;

    .line 495
    .line 496
    invoke-static {}, Landroidx/compose/ui/platform/CompositionLocalsKt;->getLocalLayoutDirection()Landroidx/compose/runtime/ProvidableCompositionLocal;

    .line 497
    .line 498
    .line 499
    move-result-object v0

    .line 500
    invoke-interface {v2, v0}, Landroidx/compose/runtime/Composer;->consume(Landroidx/compose/runtime/CompositionLocal;)Ljava/lang/Object;

    .line 501
    .line 502
    .line 503
    move-result-object v0

    .line 504
    check-cast v0, Landroidx/compose/ui/unit/LayoutDirection;

    .line 505
    .line 506
    invoke-static {}, Landroidx/compose/ui/platform/CompositionLocalsKt;->getLocalViewConfiguration()Landroidx/compose/runtime/ProvidableCompositionLocal;

    .line 507
    .line 508
    .line 509
    move-result-object v13

    .line 510
    invoke-interface {v2, v13}, Landroidx/compose/runtime/Composer;->consume(Landroidx/compose/runtime/CompositionLocal;)Ljava/lang/Object;

    .line 511
    .line 512
    .line 513
    move-result-object v13

    .line 514
    check-cast v13, Landroidx/compose/ui/platform/ViewConfiguration;

    .line 515
    .line 516
    sget-object v19, Landroidx/compose/ui/node/ComposeUiNode;->Companion:Landroidx/compose/ui/node/ComposeUiNode$Companion;

    .line 517
    .line 518
    move-object/from16 v20, v6

    .line 519
    .line 520
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getConstructor()Lkotlin/jvm/functions/Function0;

    .line 521
    .line 522
    .line 523
    move-result-object v6

    .line 524
    invoke-static {v4}, Landroidx/compose/ui/layout/LayoutKt;->materializerOf(Landroidx/compose/ui/Modifier;)Lkotlin/jvm/functions/Function3;

    .line 525
    .line 526
    .line 527
    move-result-object v4

    .line 528
    invoke-interface {v2}, Landroidx/compose/runtime/Composer;->getApplier()Landroidx/compose/runtime/Applier;

    .line 529
    .line 530
    .line 531
    move-result-object v8

    .line 532
    instance-of v8, v8, Landroidx/compose/runtime/Applier;

    .line 533
    .line 534
    if-nez v8, :cond_1e

    .line 535
    .line 536
    invoke-static {}, Landroidx/compose/runtime/ComposablesKt;->invalidApplier()V

    .line 537
    .line 538
    .line 539
    :cond_1e
    invoke-interface {v2}, Landroidx/compose/runtime/Composer;->startReusableNode()V

    .line 540
    .line 541
    .line 542
    invoke-interface {v2}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 543
    .line 544
    .line 545
    move-result v8

    .line 546
    if-eqz v8, :cond_1f

    .line 547
    .line 548
    invoke-interface {v2, v6}, Landroidx/compose/runtime/Composer;->createNode(Lkotlin/jvm/functions/Function0;)V

    .line 549
    .line 550
    .line 551
    goto :goto_13

    .line 552
    :cond_1f
    invoke-interface {v2}, Landroidx/compose/runtime/Composer;->useNode()V

    .line 553
    .line 554
    .line 555
    :goto_13
    invoke-interface {v2}, Landroidx/compose/runtime/Composer;->disableReusing()V

    .line 556
    .line 557
    .line 558
    invoke-static {v2}, Landroidx/compose/runtime/Updater;->constructor-impl(Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;

    .line 559
    .line 560
    .line 561
    move-result-object v6

    .line 562
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetMeasurePolicy()Lkotlin/jvm/functions/Function2;

    .line 563
    .line 564
    .line 565
    move-result-object v8

    .line 566
    invoke-static {v6, v11, v8}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 567
    .line 568
    .line 569
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetDensity()Lkotlin/jvm/functions/Function2;

    .line 570
    .line 571
    .line 572
    move-result-object v8

    .line 573
    invoke-static {v6, v10, v8}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 574
    .line 575
    .line 576
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetLayoutDirection()Lkotlin/jvm/functions/Function2;

    .line 577
    .line 578
    .line 579
    move-result-object v8

    .line 580
    invoke-static {v6, v0, v8}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 581
    .line 582
    .line 583
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetViewConfiguration()Lkotlin/jvm/functions/Function2;

    .line 584
    .line 585
    .line 586
    move-result-object v0

    .line 587
    invoke-static {v6, v13, v0}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 588
    .line 589
    .line 590
    invoke-interface {v2}, Landroidx/compose/runtime/Composer;->enableReusing()V

    .line 591
    .line 592
    .line 593
    invoke-static {v2}, Landroidx/compose/runtime/SkippableUpdater;->constructor-impl(Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;

    .line 594
    .line 595
    .line 596
    move-result-object v0

    .line 597
    invoke-static {v0}, Landroidx/compose/runtime/SkippableUpdater;->box-impl(Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/SkippableUpdater;

    .line 598
    .line 599
    .line 600
    move-result-object v0

    .line 601
    const/4 v6, 0x0

    .line 602
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 603
    .line 604
    .line 605
    move-result-object v8

    .line 606
    invoke-interface {v4, v0, v2, v8}, Lkotlin/jvm/functions/Function3;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 607
    .line 608
    .line 609
    const v0, 0x7ab4aae9

    .line 610
    .line 611
    .line 612
    invoke-interface {v2, v0}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 613
    .line 614
    .line 615
    const v4, -0x7f65a980

    .line 616
    .line 617
    .line 618
    invoke-interface {v2, v4}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 619
    .line 620
    .line 621
    sget-object v6, Landroidx/compose/foundation/layout/BoxScopeInstance;->INSTANCE:Landroidx/compose/foundation/layout/BoxScopeInstance;

    .line 622
    .line 623
    const v6, -0x4e48027a

    .line 624
    .line 625
    .line 626
    invoke-interface {v2, v6}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 627
    .line 628
    .line 629
    const v6, 0x2bb5b5d7

    .line 630
    .line 631
    .line 632
    invoke-interface {v2, v6}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 633
    .line 634
    .line 635
    sget-object v8, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    .line 636
    .line 637
    invoke-virtual/range {v17 .. v17}, Landroidx/compose/ui/Alignment$Companion;->getTopStart()Landroidx/compose/ui/Alignment;

    .line 638
    .line 639
    .line 640
    move-result-object v10

    .line 641
    const/4 v11, 0x0

    .line 642
    invoke-static {v10, v11, v2, v11}, Landroidx/compose/foundation/layout/BoxKt;->rememberBoxMeasurePolicy(Landroidx/compose/ui/Alignment;ZLandroidx/compose/runtime/Composer;I)Landroidx/compose/ui/layout/MeasurePolicy;

    .line 643
    .line 644
    .line 645
    move-result-object v10

    .line 646
    const v11, -0x4ee9b9da

    .line 647
    .line 648
    .line 649
    invoke-interface {v2, v11}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 650
    .line 651
    .line 652
    invoke-static {}, Landroidx/compose/ui/platform/CompositionLocalsKt;->getLocalDensity()Landroidx/compose/runtime/ProvidableCompositionLocal;

    .line 653
    .line 654
    .line 655
    move-result-object v11

    .line 656
    invoke-interface {v2, v11}, Landroidx/compose/runtime/Composer;->consume(Landroidx/compose/runtime/CompositionLocal;)Ljava/lang/Object;

    .line 657
    .line 658
    .line 659
    move-result-object v11

    .line 660
    check-cast v11, Landroidx/compose/ui/unit/Density;

    .line 661
    .line 662
    invoke-static {}, Landroidx/compose/ui/platform/CompositionLocalsKt;->getLocalLayoutDirection()Landroidx/compose/runtime/ProvidableCompositionLocal;

    .line 663
    .line 664
    .line 665
    move-result-object v13

    .line 666
    invoke-interface {v2, v13}, Landroidx/compose/runtime/Composer;->consume(Landroidx/compose/runtime/CompositionLocal;)Ljava/lang/Object;

    .line 667
    .line 668
    .line 669
    move-result-object v13

    .line 670
    check-cast v13, Landroidx/compose/ui/unit/LayoutDirection;

    .line 671
    .line 672
    invoke-static {}, Landroidx/compose/ui/platform/CompositionLocalsKt;->getLocalViewConfiguration()Landroidx/compose/runtime/ProvidableCompositionLocal;

    .line 673
    .line 674
    .line 675
    move-result-object v6

    .line 676
    invoke-interface {v2, v6}, Landroidx/compose/runtime/Composer;->consume(Landroidx/compose/runtime/CompositionLocal;)Ljava/lang/Object;

    .line 677
    .line 678
    .line 679
    move-result-object v6

    .line 680
    check-cast v6, Landroidx/compose/ui/platform/ViewConfiguration;

    .line 681
    .line 682
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getConstructor()Lkotlin/jvm/functions/Function0;

    .line 683
    .line 684
    .line 685
    move-result-object v4

    .line 686
    invoke-static {v8}, Landroidx/compose/ui/layout/LayoutKt;->materializerOf(Landroidx/compose/ui/Modifier;)Lkotlin/jvm/functions/Function3;

    .line 687
    .line 688
    .line 689
    move-result-object v0

    .line 690
    move-object/from16 v22, v12

    .line 691
    .line 692
    invoke-interface {v2}, Landroidx/compose/runtime/Composer;->getApplier()Landroidx/compose/runtime/Applier;

    .line 693
    .line 694
    .line 695
    move-result-object v12

    .line 696
    instance-of v12, v12, Landroidx/compose/runtime/Applier;

    .line 697
    .line 698
    if-nez v12, :cond_20

    .line 699
    .line 700
    invoke-static {}, Landroidx/compose/runtime/ComposablesKt;->invalidApplier()V

    .line 701
    .line 702
    .line 703
    :cond_20
    invoke-interface {v2}, Landroidx/compose/runtime/Composer;->startReusableNode()V

    .line 704
    .line 705
    .line 706
    invoke-interface {v2}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 707
    .line 708
    .line 709
    move-result v12

    .line 710
    if-eqz v12, :cond_21

    .line 711
    .line 712
    invoke-interface {v2, v4}, Landroidx/compose/runtime/Composer;->createNode(Lkotlin/jvm/functions/Function0;)V

    .line 713
    .line 714
    .line 715
    goto :goto_14

    .line 716
    :cond_21
    invoke-interface {v2}, Landroidx/compose/runtime/Composer;->useNode()V

    .line 717
    .line 718
    .line 719
    :goto_14
    invoke-interface {v2}, Landroidx/compose/runtime/Composer;->disableReusing()V

    .line 720
    .line 721
    .line 722
    invoke-static {v2}, Landroidx/compose/runtime/Updater;->constructor-impl(Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;

    .line 723
    .line 724
    .line 725
    move-result-object v4

    .line 726
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetMeasurePolicy()Lkotlin/jvm/functions/Function2;

    .line 727
    .line 728
    .line 729
    move-result-object v12

    .line 730
    invoke-static {v4, v10, v12}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 731
    .line 732
    .line 733
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetDensity()Lkotlin/jvm/functions/Function2;

    .line 734
    .line 735
    .line 736
    move-result-object v10

    .line 737
    invoke-static {v4, v11, v10}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 738
    .line 739
    .line 740
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetLayoutDirection()Lkotlin/jvm/functions/Function2;

    .line 741
    .line 742
    .line 743
    move-result-object v10

    .line 744
    invoke-static {v4, v13, v10}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 745
    .line 746
    .line 747
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetViewConfiguration()Lkotlin/jvm/functions/Function2;

    .line 748
    .line 749
    .line 750
    move-result-object v10

    .line 751
    invoke-static {v4, v6, v10}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 752
    .line 753
    .line 754
    invoke-interface {v2}, Landroidx/compose/runtime/Composer;->enableReusing()V

    .line 755
    .line 756
    .line 757
    invoke-static {v2}, Landroidx/compose/runtime/SkippableUpdater;->constructor-impl(Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;

    .line 758
    .line 759
    .line 760
    move-result-object v4

    .line 761
    invoke-static {v4}, Landroidx/compose/runtime/SkippableUpdater;->box-impl(Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/SkippableUpdater;

    .line 762
    .line 763
    .line 764
    move-result-object v4

    .line 765
    const/4 v6, 0x0

    .line 766
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 767
    .line 768
    .line 769
    move-result-object v10

    .line 770
    invoke-interface {v0, v4, v2, v10}, Lkotlin/jvm/functions/Function3;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 771
    .line 772
    .line 773
    const v0, 0x7ab4aae9

    .line 774
    .line 775
    .line 776
    invoke-interface {v2, v0}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 777
    .line 778
    .line 779
    const v0, -0x7f65a980

    .line 780
    .line 781
    .line 782
    invoke-interface {v2, v0}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 783
    .line 784
    .line 785
    const v0, 0x222c890c

    .line 786
    .line 787
    .line 788
    invoke-interface {v2, v0}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 789
    .line 790
    .line 791
    shr-int/lit8 v0, v15, 0xf

    .line 792
    .line 793
    and-int/lit8 v0, v0, 0xe

    .line 794
    .line 795
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 796
    .line 797
    .line 798
    move-result-object v0

    .line 799
    invoke-interface {v7, v2, v0}, Lkotlin/jvm/functions/Function2;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 800
    .line 801
    .line 802
    invoke-interface {v2}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 803
    .line 804
    .line 805
    invoke-interface {v2}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 806
    .line 807
    .line 808
    invoke-interface {v2}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 809
    .line 810
    .line 811
    invoke-interface {v2}, Landroidx/compose/runtime/Composer;->endNode()V

    .line 812
    .line 813
    .line 814
    invoke-interface {v2}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 815
    .line 816
    .line 817
    invoke-interface {v2}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 818
    .line 819
    .line 820
    invoke-virtual {v3}, Landroidx/compose/material3/DrawerState;->isOpen()Z

    .line 821
    .line 822
    .line 823
    move-result v0

    .line 824
    new-instance v10, Landroidx/compose/material3/NavigationDrawerKt$ModalNavigationDrawer$2$2;

    .line 825
    .line 826
    invoke-direct {v10, v5, v3, v14}, Landroidx/compose/material3/NavigationDrawerKt$ModalNavigationDrawer$2$2;-><init>(ZLandroidx/compose/material3/DrawerState;Lkotlinx/coroutines/CoroutineScope;)V

    .line 827
    .line 828
    .line 829
    invoke-static {v9}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 830
    .line 831
    .line 832
    move-result-object v4

    .line 833
    const/4 v11, 0x0

    .line 834
    invoke-static {v11}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 835
    .line 836
    .line 837
    move-result-object v12

    .line 838
    const v11, 0x607fb4c4

    .line 839
    .line 840
    .line 841
    invoke-interface {v2, v11}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 842
    .line 843
    .line 844
    invoke-interface {v2, v4}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 845
    .line 846
    .line 847
    move-result v4

    .line 848
    invoke-interface {v2, v12}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 849
    .line 850
    .line 851
    move-result v11

    .line 852
    or-int/2addr v4, v11

    .line 853
    invoke-interface {v2, v3}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 854
    .line 855
    .line 856
    move-result v11

    .line 857
    or-int/2addr v4, v11

    .line 858
    invoke-interface {v2}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 859
    .line 860
    .line 861
    move-result-object v11

    .line 862
    if-nez v4, :cond_22

    .line 863
    .line 864
    invoke-virtual/range {v16 .. v16}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    .line 865
    .line 866
    .line 867
    move-result-object v4

    .line 868
    if-ne v11, v4, :cond_23

    .line 869
    .line 870
    :cond_22
    new-instance v11, Landroidx/compose/material3/NavigationDrawerKt$ModalNavigationDrawer$2$3$1;

    .line 871
    .line 872
    const/4 v4, 0x0

    .line 873
    invoke-direct {v11, v9, v4, v3}, Landroidx/compose/material3/NavigationDrawerKt$ModalNavigationDrawer$2$3$1;-><init>(FFLandroidx/compose/material3/DrawerState;)V

    .line 874
    .line 875
    .line 876
    invoke-interface {v2, v11}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 877
    .line 878
    .line 879
    :cond_23
    invoke-interface {v2}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 880
    .line 881
    .line 882
    check-cast v11, Lkotlin/jvm/functions/Function0;

    .line 883
    .line 884
    shr-int/lit8 v4, v15, 0x3

    .line 885
    .line 886
    and-int/lit16 v4, v4, 0x1c00

    .line 887
    .line 888
    move v9, v0

    .line 889
    move-object/from16 v0, v22

    .line 890
    .line 891
    move-wide/from16 v12, v30

    .line 892
    .line 893
    move-object v6, v14

    .line 894
    move-object v14, v2

    .line 895
    move/from16 v22, v15

    .line 896
    .line 897
    move v15, v4

    .line 898
    invoke-static/range {v9 .. v15}, Landroidx/compose/material3/NavigationDrawerKt;->Scrim-Bx497Mc(ZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;JLandroidx/compose/runtime/Composer;I)V

    .line 899
    .line 900
    .line 901
    const v4, 0x44faf204

    .line 902
    .line 903
    .line 904
    invoke-interface {v2, v4}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 905
    .line 906
    .line 907
    invoke-interface {v2, v3}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 908
    .line 909
    .line 910
    move-result v4

    .line 911
    invoke-interface {v2}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 912
    .line 913
    .line 914
    move-result-object v9

    .line 915
    if-nez v4, :cond_24

    .line 916
    .line 917
    invoke-virtual/range {v16 .. v16}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    .line 918
    .line 919
    .line 920
    move-result-object v4

    .line 921
    if-ne v9, v4, :cond_25

    .line 922
    .line 923
    :cond_24
    new-instance v9, Landroidx/compose/material3/NavigationDrawerKt$ModalNavigationDrawer$2$4$1;

    .line 924
    .line 925
    invoke-direct {v9, v3}, Landroidx/compose/material3/NavigationDrawerKt$ModalNavigationDrawer$2$4$1;-><init>(Landroidx/compose/material3/DrawerState;)V

    .line 926
    .line 927
    .line 928
    invoke-interface {v2, v9}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 929
    .line 930
    .line 931
    :cond_25
    invoke-interface {v2}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 932
    .line 933
    .line 934
    check-cast v9, Lkotlin/jvm/functions/Function1;

    .line 935
    .line 936
    invoke-static {v8, v9}, Landroidx/compose/foundation/layout/OffsetKt;->offset(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/Modifier;

    .line 937
    .line 938
    .line 939
    move-result-object v4

    .line 940
    new-instance v8, Landroidx/compose/material3/NavigationDrawerKt$ModalNavigationDrawer$2$5;

    .line 941
    .line 942
    invoke-direct {v8, v0, v3, v6}, Landroidx/compose/material3/NavigationDrawerKt$ModalNavigationDrawer$2$5;-><init>(Ljava/lang/String;Landroidx/compose/material3/DrawerState;Lkotlinx/coroutines/CoroutineScope;)V

    .line 943
    .line 944
    .line 945
    const/4 v0, 0x0

    .line 946
    const/4 v6, 0x0

    .line 947
    const/4 v9, 0x1

    .line 948
    invoke-static {v4, v6, v8, v9, v0}, Landroidx/compose/ui/semantics/SemanticsModifierKt;->semantics$default(Landroidx/compose/ui/Modifier;ZLkotlin/jvm/functions/Function1;ILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    .line 949
    .line 950
    .line 951
    move-result-object v0

    .line 952
    const v4, 0x2bb5b5d7

    .line 953
    .line 954
    .line 955
    invoke-interface {v2, v4}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 956
    .line 957
    .line 958
    invoke-virtual/range {v17 .. v17}, Landroidx/compose/ui/Alignment$Companion;->getTopStart()Landroidx/compose/ui/Alignment;

    .line 959
    .line 960
    .line 961
    move-result-object v4

    .line 962
    invoke-static {v4, v6, v2, v6}, Landroidx/compose/foundation/layout/BoxKt;->rememberBoxMeasurePolicy(Landroidx/compose/ui/Alignment;ZLandroidx/compose/runtime/Composer;I)Landroidx/compose/ui/layout/MeasurePolicy;

    .line 963
    .line 964
    .line 965
    move-result-object v4

    .line 966
    const v6, -0x4ee9b9da

    .line 967
    .line 968
    .line 969
    invoke-interface {v2, v6}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 970
    .line 971
    .line 972
    invoke-static {}, Landroidx/compose/ui/platform/CompositionLocalsKt;->getLocalDensity()Landroidx/compose/runtime/ProvidableCompositionLocal;

    .line 973
    .line 974
    .line 975
    move-result-object v6

    .line 976
    invoke-interface {v2, v6}, Landroidx/compose/runtime/Composer;->consume(Landroidx/compose/runtime/CompositionLocal;)Ljava/lang/Object;

    .line 977
    .line 978
    .line 979
    move-result-object v6

    .line 980
    check-cast v6, Landroidx/compose/ui/unit/Density;

    .line 981
    .line 982
    invoke-static {}, Landroidx/compose/ui/platform/CompositionLocalsKt;->getLocalLayoutDirection()Landroidx/compose/runtime/ProvidableCompositionLocal;

    .line 983
    .line 984
    .line 985
    move-result-object v8

    .line 986
    invoke-interface {v2, v8}, Landroidx/compose/runtime/Composer;->consume(Landroidx/compose/runtime/CompositionLocal;)Ljava/lang/Object;

    .line 987
    .line 988
    .line 989
    move-result-object v8

    .line 990
    check-cast v8, Landroidx/compose/ui/unit/LayoutDirection;

    .line 991
    .line 992
    invoke-static {}, Landroidx/compose/ui/platform/CompositionLocalsKt;->getLocalViewConfiguration()Landroidx/compose/runtime/ProvidableCompositionLocal;

    .line 993
    .line 994
    .line 995
    move-result-object v9

    .line 996
    invoke-interface {v2, v9}, Landroidx/compose/runtime/Composer;->consume(Landroidx/compose/runtime/CompositionLocal;)Ljava/lang/Object;

    .line 997
    .line 998
    .line 999
    move-result-object v9

    .line 1000
    check-cast v9, Landroidx/compose/ui/platform/ViewConfiguration;

    .line 1001
    .line 1002
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getConstructor()Lkotlin/jvm/functions/Function0;

    .line 1003
    .line 1004
    .line 1005
    move-result-object v10

    .line 1006
    invoke-static {v0}, Landroidx/compose/ui/layout/LayoutKt;->materializerOf(Landroidx/compose/ui/Modifier;)Lkotlin/jvm/functions/Function3;

    .line 1007
    .line 1008
    .line 1009
    move-result-object v0

    .line 1010
    invoke-interface {v2}, Landroidx/compose/runtime/Composer;->getApplier()Landroidx/compose/runtime/Applier;

    .line 1011
    .line 1012
    .line 1013
    move-result-object v11

    .line 1014
    instance-of v11, v11, Landroidx/compose/runtime/Applier;

    .line 1015
    .line 1016
    if-nez v11, :cond_26

    .line 1017
    .line 1018
    invoke-static {}, Landroidx/compose/runtime/ComposablesKt;->invalidApplier()V

    .line 1019
    .line 1020
    .line 1021
    :cond_26
    invoke-interface {v2}, Landroidx/compose/runtime/Composer;->startReusableNode()V

    .line 1022
    .line 1023
    .line 1024
    invoke-interface {v2}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 1025
    .line 1026
    .line 1027
    move-result v11

    .line 1028
    if-eqz v11, :cond_27

    .line 1029
    .line 1030
    invoke-interface {v2, v10}, Landroidx/compose/runtime/Composer;->createNode(Lkotlin/jvm/functions/Function0;)V

    .line 1031
    .line 1032
    .line 1033
    goto :goto_15

    .line 1034
    :cond_27
    invoke-interface {v2}, Landroidx/compose/runtime/Composer;->useNode()V

    .line 1035
    .line 1036
    .line 1037
    :goto_15
    invoke-interface {v2}, Landroidx/compose/runtime/Composer;->disableReusing()V

    .line 1038
    .line 1039
    .line 1040
    invoke-static {v2}, Landroidx/compose/runtime/Updater;->constructor-impl(Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;

    .line 1041
    .line 1042
    .line 1043
    move-result-object v10

    .line 1044
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetMeasurePolicy()Lkotlin/jvm/functions/Function2;

    .line 1045
    .line 1046
    .line 1047
    move-result-object v11

    .line 1048
    invoke-static {v10, v4, v11}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 1049
    .line 1050
    .line 1051
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetDensity()Lkotlin/jvm/functions/Function2;

    .line 1052
    .line 1053
    .line 1054
    move-result-object v4

    .line 1055
    invoke-static {v10, v6, v4}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 1056
    .line 1057
    .line 1058
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetLayoutDirection()Lkotlin/jvm/functions/Function2;

    .line 1059
    .line 1060
    .line 1061
    move-result-object v4

    .line 1062
    invoke-static {v10, v8, v4}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 1063
    .line 1064
    .line 1065
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetViewConfiguration()Lkotlin/jvm/functions/Function2;

    .line 1066
    .line 1067
    .line 1068
    move-result-object v4

    .line 1069
    invoke-static {v10, v9, v4}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 1070
    .line 1071
    .line 1072
    invoke-interface {v2}, Landroidx/compose/runtime/Composer;->enableReusing()V

    .line 1073
    .line 1074
    .line 1075
    invoke-static {v2}, Landroidx/compose/runtime/SkippableUpdater;->constructor-impl(Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;

    .line 1076
    .line 1077
    .line 1078
    move-result-object v4

    .line 1079
    invoke-static {v4}, Landroidx/compose/runtime/SkippableUpdater;->box-impl(Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/SkippableUpdater;

    .line 1080
    .line 1081
    .line 1082
    move-result-object v4

    .line 1083
    const/4 v6, 0x0

    .line 1084
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1085
    .line 1086
    .line 1087
    move-result-object v6

    .line 1088
    invoke-interface {v0, v4, v2, v6}, Lkotlin/jvm/functions/Function3;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1089
    .line 1090
    .line 1091
    const v0, 0x7ab4aae9

    .line 1092
    .line 1093
    .line 1094
    invoke-interface {v2, v0}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 1095
    .line 1096
    .line 1097
    const v0, -0x7f65a980

    .line 1098
    .line 1099
    .line 1100
    invoke-interface {v2, v0}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 1101
    .line 1102
    .line 1103
    const v0, 0x16b62a83

    .line 1104
    .line 1105
    .line 1106
    invoke-interface {v2, v0}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 1107
    .line 1108
    .line 1109
    and-int/lit8 v0, v22, 0xe

    .line 1110
    .line 1111
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1112
    .line 1113
    .line 1114
    move-result-object v0

    .line 1115
    invoke-interface {v1, v2, v0}, Lkotlin/jvm/functions/Function2;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1116
    .line 1117
    .line 1118
    invoke-interface {v2}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 1119
    .line 1120
    .line 1121
    invoke-interface {v2}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 1122
    .line 1123
    .line 1124
    invoke-interface {v2}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 1125
    .line 1126
    .line 1127
    invoke-interface {v2}, Landroidx/compose/runtime/Composer;->endNode()V

    .line 1128
    .line 1129
    .line 1130
    invoke-interface {v2}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 1131
    .line 1132
    .line 1133
    invoke-interface {v2}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 1134
    .line 1135
    .line 1136
    invoke-interface {v2}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 1137
    .line 1138
    .line 1139
    invoke-interface {v2}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 1140
    .line 1141
    .line 1142
    invoke-interface {v2}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 1143
    .line 1144
    .line 1145
    invoke-interface {v2}, Landroidx/compose/runtime/Composer;->endNode()V

    .line 1146
    .line 1147
    .line 1148
    invoke-interface {v2}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 1149
    .line 1150
    .line 1151
    invoke-interface {v2}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 1152
    .line 1153
    .line 1154
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 1155
    .line 1156
    .line 1157
    move-result v0

    .line 1158
    if-eqz v0, :cond_28

    .line 1159
    .line 1160
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 1161
    .line 1162
    .line 1163
    :cond_28
    move v4, v5

    .line 1164
    move-object/from16 v6, v20

    .line 1165
    .line 1166
    move-wide/from16 v12, v30

    .line 1167
    .line 1168
    :goto_16
    invoke-interface {v2}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    .line 1169
    .line 1170
    .line 1171
    move-result-object v10

    .line 1172
    if-nez v10, :cond_29

    .line 1173
    .line 1174
    goto :goto_17

    .line 1175
    :cond_29
    new-instance v11, Landroidx/compose/material3/NavigationDrawerKt$ModalNavigationDrawer$3;

    .line 1176
    .line 1177
    move-object v0, v11

    .line 1178
    move-object/from16 v1, p0

    .line 1179
    .line 1180
    move-object v2, v6

    .line 1181
    move-wide v5, v12

    .line 1182
    move-object/from16 v7, p6

    .line 1183
    .line 1184
    move/from16 v8, p8

    .line 1185
    .line 1186
    move/from16 v9, p9

    .line 1187
    .line 1188
    invoke-direct/range {v0 .. v9}, Landroidx/compose/material3/NavigationDrawerKt$ModalNavigationDrawer$3;-><init>(Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/Modifier;Landroidx/compose/material3/DrawerState;ZJLkotlin/jvm/functions/Function2;II)V

    .line 1189
    .line 1190
    .line 1191
    invoke-interface {v10, v11}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lkotlin/jvm/functions/Function2;)V

    .line 1192
    .line 1193
    .line 1194
    :goto_17
    return-void
.end method

.method public static final NavigationDrawerItem(Lkotlin/jvm/functions/Function2;ZLkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material3/NavigationDrawerItemColors;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/runtime/Composer;II)V
    .locals 36
    .annotation runtime Landroidx/compose/material3/ExperimentalMaterial3Api;
    .end annotation

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
            ">;Z",
            "Lkotlin/jvm/functions/Function0<",
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
            "Landroidx/compose/ui/graphics/Shape;",
            "Landroidx/compose/material3/NavigationDrawerItemColors;",
            "Landroidx/compose/foundation/interaction/MutableInteractionSource;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move/from16 v0, p1

    .line 4
    .line 5
    move-object/from16 v14, p2

    .line 6
    .line 7
    move/from16 v6, p10

    .line 8
    .line 9
    move/from16 v3, p11

    .line 10
    .line 11
    const-string v2, "label"

    .line 12
    .line 13
    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    const-string v2, "onClick"

    .line 17
    .line 18
    invoke-static {v14, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    const v2, -0x4dc3056f    # -1.10000125E-8f

    .line 22
    .line 23
    .line 24
    move-object/from16 v4, p9

    .line 25
    .line 26
    invoke-interface {v4, v2}, Landroidx/compose/runtime/Composer;->startRestartGroup(I)Landroidx/compose/runtime/Composer;

    .line 27
    .line 28
    .line 29
    move-result-object v13

    .line 30
    and-int/lit8 v4, v3, 0x1

    .line 31
    .line 32
    if-eqz v4, :cond_0

    .line 33
    .line 34
    or-int/lit8 v4, v6, 0x6

    .line 35
    .line 36
    goto :goto_1

    .line 37
    :cond_0
    and-int/lit8 v4, v6, 0xe

    .line 38
    .line 39
    if-nez v4, :cond_2

    .line 40
    .line 41
    invoke-interface {v13, v1}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 42
    .line 43
    .line 44
    move-result v4

    .line 45
    if-eqz v4, :cond_1

    .line 46
    .line 47
    const/4 v4, 0x4

    .line 48
    goto :goto_0

    .line 49
    :cond_1
    const/4 v4, 0x2

    .line 50
    :goto_0
    or-int/2addr v4, v6

    .line 51
    goto :goto_1

    .line 52
    :cond_2
    move v4, v6

    .line 53
    :goto_1
    and-int/lit8 v5, v3, 0x2

    .line 54
    .line 55
    if-eqz v5, :cond_3

    .line 56
    .line 57
    or-int/lit8 v4, v4, 0x30

    .line 58
    .line 59
    goto :goto_3

    .line 60
    :cond_3
    and-int/lit8 v5, v6, 0x70

    .line 61
    .line 62
    if-nez v5, :cond_5

    .line 63
    .line 64
    invoke-interface {v13, v0}, Landroidx/compose/runtime/Composer;->changed(Z)Z

    .line 65
    .line 66
    .line 67
    move-result v5

    .line 68
    if-eqz v5, :cond_4

    .line 69
    .line 70
    const/16 v5, 0x20

    .line 71
    .line 72
    goto :goto_2

    .line 73
    :cond_4
    const/16 v5, 0x10

    .line 74
    .line 75
    :goto_2
    or-int/2addr v4, v5

    .line 76
    :cond_5
    :goto_3
    and-int/lit8 v5, v3, 0x4

    .line 77
    .line 78
    if-eqz v5, :cond_6

    .line 79
    .line 80
    or-int/lit16 v4, v4, 0x180

    .line 81
    .line 82
    goto :goto_5

    .line 83
    :cond_6
    and-int/lit16 v5, v6, 0x380

    .line 84
    .line 85
    if-nez v5, :cond_8

    .line 86
    .line 87
    invoke-interface {v13, v14}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 88
    .line 89
    .line 90
    move-result v5

    .line 91
    if-eqz v5, :cond_7

    .line 92
    .line 93
    const/16 v5, 0x100

    .line 94
    .line 95
    goto :goto_4

    .line 96
    :cond_7
    const/16 v5, 0x80

    .line 97
    .line 98
    :goto_4
    or-int/2addr v4, v5

    .line 99
    :cond_8
    :goto_5
    and-int/lit8 v5, v3, 0x8

    .line 100
    .line 101
    if-eqz v5, :cond_9

    .line 102
    .line 103
    or-int/lit16 v4, v4, 0xc00

    .line 104
    .line 105
    goto :goto_7

    .line 106
    :cond_9
    and-int/lit16 v7, v6, 0x1c00

    .line 107
    .line 108
    if-nez v7, :cond_b

    .line 109
    .line 110
    move-object/from16 v7, p3

    .line 111
    .line 112
    invoke-interface {v13, v7}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 113
    .line 114
    .line 115
    move-result v8

    .line 116
    if-eqz v8, :cond_a

    .line 117
    .line 118
    const/16 v8, 0x800

    .line 119
    .line 120
    goto :goto_6

    .line 121
    :cond_a
    const/16 v8, 0x400

    .line 122
    .line 123
    :goto_6
    or-int/2addr v4, v8

    .line 124
    goto :goto_8

    .line 125
    :cond_b
    :goto_7
    move-object/from16 v7, p3

    .line 126
    .line 127
    :goto_8
    and-int/lit8 v8, v3, 0x10

    .line 128
    .line 129
    const v35, 0xe000

    .line 130
    .line 131
    .line 132
    if-eqz v8, :cond_c

    .line 133
    .line 134
    or-int/lit16 v4, v4, 0x6000

    .line 135
    .line 136
    goto :goto_a

    .line 137
    :cond_c
    and-int v9, v6, v35

    .line 138
    .line 139
    if-nez v9, :cond_e

    .line 140
    .line 141
    move-object/from16 v9, p4

    .line 142
    .line 143
    invoke-interface {v13, v9}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 144
    .line 145
    .line 146
    move-result v10

    .line 147
    if-eqz v10, :cond_d

    .line 148
    .line 149
    const/16 v10, 0x4000

    .line 150
    .line 151
    goto :goto_9

    .line 152
    :cond_d
    const/16 v10, 0x2000

    .line 153
    .line 154
    :goto_9
    or-int/2addr v4, v10

    .line 155
    goto :goto_b

    .line 156
    :cond_e
    :goto_a
    move-object/from16 v9, p4

    .line 157
    .line 158
    :goto_b
    and-int/lit8 v10, v3, 0x20

    .line 159
    .line 160
    if-eqz v10, :cond_f

    .line 161
    .line 162
    const/high16 v11, 0x30000

    .line 163
    .line 164
    or-int/2addr v4, v11

    .line 165
    goto :goto_d

    .line 166
    :cond_f
    const/high16 v11, 0x70000

    .line 167
    .line 168
    and-int/2addr v11, v6

    .line 169
    if-nez v11, :cond_11

    .line 170
    .line 171
    move-object/from16 v11, p5

    .line 172
    .line 173
    invoke-interface {v13, v11}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 174
    .line 175
    .line 176
    move-result v12

    .line 177
    if-eqz v12, :cond_10

    .line 178
    .line 179
    const/high16 v12, 0x20000

    .line 180
    .line 181
    goto :goto_c

    .line 182
    :cond_10
    const/high16 v12, 0x10000

    .line 183
    .line 184
    :goto_c
    or-int/2addr v4, v12

    .line 185
    goto :goto_e

    .line 186
    :cond_11
    :goto_d
    move-object/from16 v11, p5

    .line 187
    .line 188
    :goto_e
    const/high16 v12, 0x380000

    .line 189
    .line 190
    and-int/2addr v12, v6

    .line 191
    if-nez v12, :cond_14

    .line 192
    .line 193
    and-int/lit8 v12, v3, 0x40

    .line 194
    .line 195
    if-nez v12, :cond_12

    .line 196
    .line 197
    move-object/from16 v12, p6

    .line 198
    .line 199
    invoke-interface {v13, v12}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 200
    .line 201
    .line 202
    move-result v15

    .line 203
    if-eqz v15, :cond_13

    .line 204
    .line 205
    const/high16 v15, 0x100000

    .line 206
    .line 207
    goto :goto_f

    .line 208
    :cond_12
    move-object/from16 v12, p6

    .line 209
    .line 210
    :cond_13
    const/high16 v15, 0x80000

    .line 211
    .line 212
    :goto_f
    or-int/2addr v4, v15

    .line 213
    goto :goto_10

    .line 214
    :cond_14
    move-object/from16 v12, p6

    .line 215
    .line 216
    :goto_10
    const/high16 v15, 0x1c00000

    .line 217
    .line 218
    and-int/2addr v15, v6

    .line 219
    if-nez v15, :cond_17

    .line 220
    .line 221
    and-int/lit16 v15, v3, 0x80

    .line 222
    .line 223
    if-nez v15, :cond_15

    .line 224
    .line 225
    move-object/from16 v15, p7

    .line 226
    .line 227
    invoke-interface {v13, v15}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 228
    .line 229
    .line 230
    move-result v16

    .line 231
    if-eqz v16, :cond_16

    .line 232
    .line 233
    const/high16 v16, 0x800000

    .line 234
    .line 235
    goto :goto_11

    .line 236
    :cond_15
    move-object/from16 v15, p7

    .line 237
    .line 238
    :cond_16
    const/high16 v16, 0x400000

    .line 239
    .line 240
    :goto_11
    or-int v4, v4, v16

    .line 241
    .line 242
    goto :goto_12

    .line 243
    :cond_17
    move-object/from16 v15, p7

    .line 244
    .line 245
    :goto_12
    and-int/lit16 v2, v3, 0x100

    .line 246
    .line 247
    if-eqz v2, :cond_18

    .line 248
    .line 249
    const/high16 v16, 0x6000000

    .line 250
    .line 251
    or-int v4, v4, v16

    .line 252
    .line 253
    move-object/from16 v1, p8

    .line 254
    .line 255
    goto :goto_14

    .line 256
    :cond_18
    const/high16 v16, 0xe000000

    .line 257
    .line 258
    and-int v16, v6, v16

    .line 259
    .line 260
    move-object/from16 v1, p8

    .line 261
    .line 262
    if-nez v16, :cond_1a

    .line 263
    .line 264
    invoke-interface {v13, v1}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 265
    .line 266
    .line 267
    move-result v16

    .line 268
    if-eqz v16, :cond_19

    .line 269
    .line 270
    const/high16 v16, 0x4000000

    .line 271
    .line 272
    goto :goto_13

    .line 273
    :cond_19
    const/high16 v16, 0x2000000

    .line 274
    .line 275
    :goto_13
    or-int v4, v4, v16

    .line 276
    .line 277
    :cond_1a
    :goto_14
    const v16, 0xb6db6db

    .line 278
    .line 279
    .line 280
    and-int v1, v4, v16

    .line 281
    .line 282
    const v7, 0x2492492

    .line 283
    .line 284
    .line 285
    if-ne v1, v7, :cond_1c

    .line 286
    .line 287
    invoke-interface {v13}, Landroidx/compose/runtime/Composer;->getSkipping()Z

    .line 288
    .line 289
    .line 290
    move-result v1

    .line 291
    if-nez v1, :cond_1b

    .line 292
    .line 293
    goto :goto_15

    .line 294
    :cond_1b
    invoke-interface {v13}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    .line 295
    .line 296
    .line 297
    move-object/from16 v4, p3

    .line 298
    .line 299
    move-object v5, v9

    .line 300
    move-object v6, v11

    .line 301
    move-object v7, v12

    .line 302
    move-object/from16 v24, v13

    .line 303
    .line 304
    move-object v8, v15

    .line 305
    move-object/from16 v9, p8

    .line 306
    .line 307
    goto/16 :goto_1c

    .line 308
    .line 309
    :cond_1c
    :goto_15
    invoke-interface {v13}, Landroidx/compose/runtime/Composer;->startDefaults()V

    .line 310
    .line 311
    .line 312
    and-int/lit8 v1, v6, 0x1

    .line 313
    .line 314
    const v16, -0x380001

    .line 315
    .line 316
    .line 317
    const/4 v7, 0x0

    .line 318
    if-eqz v1, :cond_20

    .line 319
    .line 320
    invoke-interface {v13}, Landroidx/compose/runtime/Composer;->getDefaultsInvalid()Z

    .line 321
    .line 322
    .line 323
    move-result v1

    .line 324
    if-eqz v1, :cond_1d

    .line 325
    .line 326
    goto :goto_16

    .line 327
    :cond_1d
    invoke-interface {v13}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    .line 328
    .line 329
    .line 330
    and-int/lit8 v1, v3, 0x40

    .line 331
    .line 332
    if-eqz v1, :cond_1e

    .line 333
    .line 334
    and-int v4, v4, v16

    .line 335
    .line 336
    :cond_1e
    and-int/lit16 v1, v3, 0x80

    .line 337
    .line 338
    if-eqz v1, :cond_1f

    .line 339
    .line 340
    const v1, -0x1c00001

    .line 341
    .line 342
    .line 343
    and-int/2addr v4, v1

    .line 344
    :cond_1f
    move-object/from16 v1, p3

    .line 345
    .line 346
    move-object/from16 v23, p8

    .line 347
    .line 348
    move-object/from16 v20, v9

    .line 349
    .line 350
    move-object/from16 v21, v11

    .line 351
    .line 352
    move-object/from16 v22, v12

    .line 353
    .line 354
    move-object v2, v15

    .line 355
    move v15, v4

    .line 356
    goto/16 :goto_1b

    .line 357
    .line 358
    :cond_20
    :goto_16
    if-eqz v5, :cond_21

    .line 359
    .line 360
    sget-object v1, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    .line 361
    .line 362
    goto :goto_17

    .line 363
    :cond_21
    move-object/from16 v1, p3

    .line 364
    .line 365
    :goto_17
    if-eqz v8, :cond_22

    .line 366
    .line 367
    move-object v9, v7

    .line 368
    :cond_22
    if-eqz v10, :cond_23

    .line 369
    .line 370
    move-object v11, v7

    .line 371
    :cond_23
    and-int/lit8 v5, v3, 0x40

    .line 372
    .line 373
    if-eqz v5, :cond_24

    .line 374
    .line 375
    sget-object v5, Landroidx/compose/material3/tokens/NavigationDrawerTokens;->INSTANCE:Landroidx/compose/material3/tokens/NavigationDrawerTokens;

    .line 376
    .line 377
    invoke-virtual {v5}, Landroidx/compose/material3/tokens/NavigationDrawerTokens;->getActiveIndicatorShape()Landroidx/compose/material3/tokens/ShapeKeyTokens;

    .line 378
    .line 379
    .line 380
    move-result-object v5

    .line 381
    const/4 v8, 0x6

    .line 382
    invoke-static {v5, v13, v8}, Landroidx/compose/material3/ShapesKt;->toShape(Landroidx/compose/material3/tokens/ShapeKeyTokens;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/graphics/Shape;

    .line 383
    .line 384
    .line 385
    move-result-object v5

    .line 386
    and-int v4, v4, v16

    .line 387
    .line 388
    goto :goto_18

    .line 389
    :cond_24
    move-object v5, v12

    .line 390
    :goto_18
    and-int/lit16 v8, v3, 0x80

    .line 391
    .line 392
    if-eqz v8, :cond_25

    .line 393
    .line 394
    sget-object v15, Landroidx/compose/material3/NavigationDrawerItemDefaults;->INSTANCE:Landroidx/compose/material3/NavigationDrawerItemDefaults;

    .line 395
    .line 396
    const-wide/16 v16, 0x0

    .line 397
    .line 398
    const-wide/16 v18, 0x0

    .line 399
    .line 400
    const-wide/16 v20, 0x0

    .line 401
    .line 402
    const-wide/16 v22, 0x0

    .line 403
    .line 404
    const-wide/16 v24, 0x0

    .line 405
    .line 406
    const-wide/16 v26, 0x0

    .line 407
    .line 408
    const-wide/16 v28, 0x0

    .line 409
    .line 410
    const-wide/16 v30, 0x0

    .line 411
    .line 412
    const/high16 v33, 0x6000000

    .line 413
    .line 414
    const/16 v34, 0xff

    .line 415
    .line 416
    move-object/from16 v32, v13

    .line 417
    .line 418
    invoke-virtual/range {v15 .. v34}, Landroidx/compose/material3/NavigationDrawerItemDefaults;->colors-oq7We08(JJJJJJJJLandroidx/compose/runtime/Composer;II)Landroidx/compose/material3/NavigationDrawerItemColors;

    .line 419
    .line 420
    .line 421
    move-result-object v8

    .line 422
    const v10, -0x1c00001

    .line 423
    .line 424
    .line 425
    and-int/2addr v4, v10

    .line 426
    goto :goto_19

    .line 427
    :cond_25
    move-object v8, v15

    .line 428
    :goto_19
    if-eqz v2, :cond_27

    .line 429
    .line 430
    const v2, -0x1d58f75c

    .line 431
    .line 432
    .line 433
    invoke-interface {v13, v2}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 434
    .line 435
    .line 436
    invoke-interface {v13}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 437
    .line 438
    .line 439
    move-result-object v2

    .line 440
    sget-object v10, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    .line 441
    .line 442
    invoke-virtual {v10}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    .line 443
    .line 444
    .line 445
    move-result-object v10

    .line 446
    if-ne v2, v10, :cond_26

    .line 447
    .line 448
    invoke-static {}, Landroidx/compose/foundation/interaction/InteractionSourceKt;->MutableInteractionSource()Landroidx/compose/foundation/interaction/MutableInteractionSource;

    .line 449
    .line 450
    .line 451
    move-result-object v2

    .line 452
    invoke-interface {v13, v2}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 453
    .line 454
    .line 455
    :cond_26
    invoke-interface {v13}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 456
    .line 457
    .line 458
    check-cast v2, Landroidx/compose/foundation/interaction/MutableInteractionSource;

    .line 459
    .line 460
    move-object/from16 v23, v2

    .line 461
    .line 462
    goto :goto_1a

    .line 463
    :cond_27
    move-object/from16 v23, p8

    .line 464
    .line 465
    :goto_1a
    move v15, v4

    .line 466
    move-object/from16 v22, v5

    .line 467
    .line 468
    move-object v2, v8

    .line 469
    move-object/from16 v20, v9

    .line 470
    .line 471
    move-object/from16 v21, v11

    .line 472
    .line 473
    :goto_1b
    invoke-interface {v13}, Landroidx/compose/runtime/Composer;->endDefaults()V

    .line 474
    .line 475
    .line 476
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 477
    .line 478
    .line 479
    move-result v4

    .line 480
    if-eqz v4, :cond_28

    .line 481
    .line 482
    const/4 v4, -0x1

    .line 483
    const-string v5, "androidx.compose.material3.NavigationDrawerItem (NavigationDrawer.kt:659)"

    .line 484
    .line 485
    const v8, -0x4dc3056f    # -1.10000125E-8f

    .line 486
    .line 487
    .line 488
    invoke-static {v8, v15, v4, v5}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 489
    .line 490
    .line 491
    :cond_28
    sget-object v4, Landroidx/compose/material3/tokens/NavigationDrawerTokens;->INSTANCE:Landroidx/compose/material3/tokens/NavigationDrawerTokens;

    .line 492
    .line 493
    invoke-virtual {v4}, Landroidx/compose/material3/tokens/NavigationDrawerTokens;->getActiveIndicatorHeight-D9Ej5fM()F

    .line 494
    .line 495
    .line 496
    move-result v4

    .line 497
    invoke-static {v1, v4}, Landroidx/compose/foundation/layout/SizeKt;->height-3ABfNKs(Landroidx/compose/ui/Modifier;F)Landroidx/compose/ui/Modifier;

    .line 498
    .line 499
    .line 500
    move-result-object v4

    .line 501
    const/4 v5, 0x0

    .line 502
    const/4 v12, 0x1

    .line 503
    invoke-static {v4, v5, v12, v7}, Landroidx/compose/foundation/layout/SizeKt;->fillMaxWidth$default(Landroidx/compose/ui/Modifier;FILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    .line 504
    .line 505
    .line 506
    move-result-object v4

    .line 507
    const/4 v5, 0x0

    .line 508
    shr-int/lit8 v16, v15, 0x3

    .line 509
    .line 510
    and-int/lit8 v17, v16, 0xe

    .line 511
    .line 512
    shr-int/lit8 v7, v15, 0x12

    .line 513
    .line 514
    and-int/lit8 v7, v7, 0x70

    .line 515
    .line 516
    or-int v7, v17, v7

    .line 517
    .line 518
    invoke-interface {v2, v0, v13, v7}, Landroidx/compose/material3/NavigationDrawerItemColors;->containerColor(ZLandroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;

    .line 519
    .line 520
    .line 521
    move-result-object v7

    .line 522
    invoke-interface {v7}, Landroidx/compose/runtime/State;->getValue()Ljava/lang/Object;

    .line 523
    .line 524
    .line 525
    move-result-object v7

    .line 526
    check-cast v7, Landroidx/compose/ui/graphics/Color;

    .line 527
    .line 528
    invoke-virtual {v7}, Landroidx/compose/ui/graphics/Color;->unbox-impl()J

    .line 529
    .line 530
    .line 531
    move-result-wide v7

    .line 532
    const-wide/16 v9, 0x0

    .line 533
    .line 534
    const/4 v11, 0x0

    .line 535
    const/16 v18, 0x0

    .line 536
    .line 537
    move v5, v12

    .line 538
    move/from16 v12, v18

    .line 539
    .line 540
    const/16 v18, 0x0

    .line 541
    .line 542
    move-object v9, v13

    .line 543
    move-object/from16 v13, v18

    .line 544
    .line 545
    new-instance v10, Landroidx/compose/material3/NavigationDrawerKt$NavigationDrawerItem$2;

    .line 546
    .line 547
    move-object/from16 p3, v10

    .line 548
    .line 549
    move-object/from16 p4, v20

    .line 550
    .line 551
    move-object/from16 p5, v2

    .line 552
    .line 553
    move/from16 p6, p1

    .line 554
    .line 555
    move/from16 p7, v15

    .line 556
    .line 557
    move-object/from16 p8, v21

    .line 558
    .line 559
    move-object/from16 p9, p0

    .line 560
    .line 561
    invoke-direct/range {p3 .. p9}, Landroidx/compose/material3/NavigationDrawerKt$NavigationDrawerItem$2;-><init>(Lkotlin/jvm/functions/Function2;Landroidx/compose/material3/NavigationDrawerItemColors;ZILkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;)V

    .line 562
    .line 563
    .line 564
    const v11, 0xb69e1a7

    .line 565
    .line 566
    .line 567
    invoke-static {v9, v11, v5, v10}, Landroidx/compose/runtime/internal/ComposableLambdaKt;->composableLambda(Landroidx/compose/runtime/Composer;IZLjava/lang/Object;)Landroidx/compose/runtime/internal/ComposableLambda;

    .line 568
    .line 569
    .line 570
    move-result-object v5

    .line 571
    move v10, v15

    .line 572
    move-object v15, v5

    .line 573
    and-int/lit8 v5, v16, 0x70

    .line 574
    .line 575
    or-int v5, v17, v5

    .line 576
    .line 577
    shr-int/lit8 v11, v10, 0x6

    .line 578
    .line 579
    and-int v11, v11, v35

    .line 580
    .line 581
    or-int v17, v5, v11

    .line 582
    .line 583
    shr-int/lit8 v5, v10, 0x18

    .line 584
    .line 585
    and-int/lit8 v5, v5, 0xe

    .line 586
    .line 587
    or-int/lit8 v18, v5, 0x30

    .line 588
    .line 589
    const/16 v19, 0x3c8

    .line 590
    .line 591
    move-object/from16 v27, v2

    .line 592
    .line 593
    move/from16 v2, p1

    .line 594
    .line 595
    move-object/from16 v3, p2

    .line 596
    .line 597
    move-object/from16 v6, v22

    .line 598
    .line 599
    move-object/from16 v14, v23

    .line 600
    .line 601
    move-object/from16 v16, v9

    .line 602
    .line 603
    move-object/from16 v24, v9

    .line 604
    .line 605
    const/4 v5, 0x0

    .line 606
    const-wide/16 v9, 0x0

    .line 607
    .line 608
    const/4 v11, 0x0

    .line 609
    invoke-static/range {v2 .. v19}, Landroidx/compose/material3/SurfaceKt;->Surface-d85dljk(ZLkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;ZLandroidx/compose/ui/graphics/Shape;JJFFLandroidx/compose/foundation/BorderStroke;Landroidx/compose/foundation/interaction/MutableInteractionSource;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;III)V

    .line 610
    .line 611
    .line 612
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 613
    .line 614
    .line 615
    move-result v2

    .line 616
    if-eqz v2, :cond_29

    .line 617
    .line 618
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 619
    .line 620
    .line 621
    :cond_29
    move-object v4, v1

    .line 622
    move-object/from16 v5, v20

    .line 623
    .line 624
    move-object/from16 v6, v21

    .line 625
    .line 626
    move-object/from16 v7, v22

    .line 627
    .line 628
    move-object/from16 v9, v23

    .line 629
    .line 630
    move-object/from16 v8, v27

    .line 631
    .line 632
    :goto_1c
    invoke-interface/range {v24 .. v24}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    .line 633
    .line 634
    .line 635
    move-result-object v12

    .line 636
    if-nez v12, :cond_2a

    .line 637
    .line 638
    goto :goto_1d

    .line 639
    :cond_2a
    new-instance v13, Landroidx/compose/material3/NavigationDrawerKt$NavigationDrawerItem$3;

    .line 640
    .line 641
    move-object v0, v13

    .line 642
    move-object/from16 v1, p0

    .line 643
    .line 644
    move/from16 v2, p1

    .line 645
    .line 646
    move-object/from16 v3, p2

    .line 647
    .line 648
    move/from16 v10, p10

    .line 649
    .line 650
    move/from16 v11, p11

    .line 651
    .line 652
    invoke-direct/range {v0 .. v11}, Landroidx/compose/material3/NavigationDrawerKt$NavigationDrawerItem$3;-><init>(Lkotlin/jvm/functions/Function2;ZLkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material3/NavigationDrawerItemColors;Landroidx/compose/foundation/interaction/MutableInteractionSource;II)V

    .line 653
    .line 654
    .line 655
    invoke-interface {v12, v13}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lkotlin/jvm/functions/Function2;)V

    .line 656
    .line 657
    .line 658
    :goto_1d
    return-void
.end method

.method public static final PermanentDrawerSheet-afqeVBk(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/graphics/Shape;JJFLandroidx/compose/foundation/layout/WindowInsets;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V
    .locals 25
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
            "JJF",
            "Landroidx/compose/foundation/layout/WindowInsets;",
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
    move-object/from16 v12, p8

    .line 2
    .line 3
    move/from16 v13, p10

    .line 4
    .line 5
    const-string v0, "content"

    .line 6
    .line 7
    invoke-static {v12, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    const v0, -0x6750df19

    .line 11
    .line 12
    .line 13
    move-object/from16 v1, p9

    .line 14
    .line 15
    invoke-interface {v1, v0}, Landroidx/compose/runtime/Composer;->startRestartGroup(I)Landroidx/compose/runtime/Composer;

    .line 16
    .line 17
    .line 18
    move-result-object v14

    .line 19
    and-int/lit8 v1, p11, 0x1

    .line 20
    .line 21
    if-eqz v1, :cond_0

    .line 22
    .line 23
    or-int/lit8 v2, v13, 0x6

    .line 24
    .line 25
    move v3, v2

    .line 26
    move-object/from16 v2, p0

    .line 27
    .line 28
    goto :goto_1

    .line 29
    :cond_0
    and-int/lit8 v2, v13, 0xe

    .line 30
    .line 31
    if-nez v2, :cond_2

    .line 32
    .line 33
    move-object/from16 v2, p0

    .line 34
    .line 35
    invoke-interface {v14, v2}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 36
    .line 37
    .line 38
    move-result v3

    .line 39
    if-eqz v3, :cond_1

    .line 40
    .line 41
    const/4 v3, 0x4

    .line 42
    goto :goto_0

    .line 43
    :cond_1
    const/4 v3, 0x2

    .line 44
    :goto_0
    or-int/2addr v3, v13

    .line 45
    goto :goto_1

    .line 46
    :cond_2
    move-object/from16 v2, p0

    .line 47
    .line 48
    move v3, v13

    .line 49
    :goto_1
    and-int/lit8 v4, p11, 0x2

    .line 50
    .line 51
    if-eqz v4, :cond_3

    .line 52
    .line 53
    or-int/lit8 v3, v3, 0x30

    .line 54
    .line 55
    goto :goto_3

    .line 56
    :cond_3
    and-int/lit8 v5, v13, 0x70

    .line 57
    .line 58
    if-nez v5, :cond_5

    .line 59
    .line 60
    move-object/from16 v5, p1

    .line 61
    .line 62
    invoke-interface {v14, v5}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 63
    .line 64
    .line 65
    move-result v6

    .line 66
    if-eqz v6, :cond_4

    .line 67
    .line 68
    const/16 v6, 0x20

    .line 69
    .line 70
    goto :goto_2

    .line 71
    :cond_4
    const/16 v6, 0x10

    .line 72
    .line 73
    :goto_2
    or-int/2addr v3, v6

    .line 74
    goto :goto_4

    .line 75
    :cond_5
    :goto_3
    move-object/from16 v5, p1

    .line 76
    .line 77
    :goto_4
    and-int/lit16 v6, v13, 0x380

    .line 78
    .line 79
    if-nez v6, :cond_8

    .line 80
    .line 81
    and-int/lit8 v6, p11, 0x4

    .line 82
    .line 83
    if-nez v6, :cond_6

    .line 84
    .line 85
    move-wide/from16 v6, p2

    .line 86
    .line 87
    invoke-interface {v14, v6, v7}, Landroidx/compose/runtime/Composer;->changed(J)Z

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
    goto :goto_5

    .line 96
    :cond_6
    move-wide/from16 v6, p2

    .line 97
    .line 98
    :cond_7
    const/16 v8, 0x80

    .line 99
    .line 100
    :goto_5
    or-int/2addr v3, v8

    .line 101
    goto :goto_6

    .line 102
    :cond_8
    move-wide/from16 v6, p2

    .line 103
    .line 104
    :goto_6
    and-int/lit16 v8, v13, 0x1c00

    .line 105
    .line 106
    if-nez v8, :cond_b

    .line 107
    .line 108
    and-int/lit8 v8, p11, 0x8

    .line 109
    .line 110
    if-nez v8, :cond_9

    .line 111
    .line 112
    move-wide/from16 v8, p4

    .line 113
    .line 114
    invoke-interface {v14, v8, v9}, Landroidx/compose/runtime/Composer;->changed(J)Z

    .line 115
    .line 116
    .line 117
    move-result v10

    .line 118
    if-eqz v10, :cond_a

    .line 119
    .line 120
    const/16 v10, 0x800

    .line 121
    .line 122
    goto :goto_7

    .line 123
    :cond_9
    move-wide/from16 v8, p4

    .line 124
    .line 125
    :cond_a
    const/16 v10, 0x400

    .line 126
    .line 127
    :goto_7
    or-int/2addr v3, v10

    .line 128
    goto :goto_8

    .line 129
    :cond_b
    move-wide/from16 v8, p4

    .line 130
    .line 131
    :goto_8
    and-int/lit8 v10, p11, 0x10

    .line 132
    .line 133
    const v11, 0xe000

    .line 134
    .line 135
    .line 136
    if-eqz v10, :cond_c

    .line 137
    .line 138
    or-int/lit16 v3, v3, 0x6000

    .line 139
    .line 140
    goto :goto_a

    .line 141
    :cond_c
    and-int v15, v13, v11

    .line 142
    .line 143
    if-nez v15, :cond_e

    .line 144
    .line 145
    move/from16 v15, p6

    .line 146
    .line 147
    invoke-interface {v14, v15}, Landroidx/compose/runtime/Composer;->changed(F)Z

    .line 148
    .line 149
    .line 150
    move-result v16

    .line 151
    if-eqz v16, :cond_d

    .line 152
    .line 153
    const/16 v16, 0x4000

    .line 154
    .line 155
    goto :goto_9

    .line 156
    :cond_d
    const/16 v16, 0x2000

    .line 157
    .line 158
    :goto_9
    or-int v3, v3, v16

    .line 159
    .line 160
    goto :goto_b

    .line 161
    :cond_e
    :goto_a
    move/from16 v15, p6

    .line 162
    .line 163
    :goto_b
    const/high16 v16, 0x70000

    .line 164
    .line 165
    and-int v17, v13, v16

    .line 166
    .line 167
    if-nez v17, :cond_10

    .line 168
    .line 169
    and-int/lit8 v17, p11, 0x20

    .line 170
    .line 171
    move-object/from16 v11, p7

    .line 172
    .line 173
    if-nez v17, :cond_f

    .line 174
    .line 175
    invoke-interface {v14, v11}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 176
    .line 177
    .line 178
    move-result v17

    .line 179
    if-eqz v17, :cond_f

    .line 180
    .line 181
    const/high16 v17, 0x20000

    .line 182
    .line 183
    goto :goto_c

    .line 184
    :cond_f
    const/high16 v17, 0x10000

    .line 185
    .line 186
    :goto_c
    or-int v3, v3, v17

    .line 187
    .line 188
    goto :goto_d

    .line 189
    :cond_10
    move-object/from16 v11, p7

    .line 190
    .line 191
    :goto_d
    and-int/lit8 v17, p11, 0x40

    .line 192
    .line 193
    const/high16 v18, 0x380000

    .line 194
    .line 195
    if-eqz v17, :cond_11

    .line 196
    .line 197
    const/high16 v17, 0x180000

    .line 198
    .line 199
    :goto_e
    or-int v3, v3, v17

    .line 200
    .line 201
    goto :goto_f

    .line 202
    :cond_11
    and-int v17, v13, v18

    .line 203
    .line 204
    if-nez v17, :cond_13

    .line 205
    .line 206
    invoke-interface {v14, v12}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 207
    .line 208
    .line 209
    move-result v17

    .line 210
    if-eqz v17, :cond_12

    .line 211
    .line 212
    const/high16 v17, 0x100000

    .line 213
    .line 214
    goto :goto_e

    .line 215
    :cond_12
    const/high16 v17, 0x80000

    .line 216
    .line 217
    goto :goto_e

    .line 218
    :cond_13
    :goto_f
    const v17, 0x2db6db

    .line 219
    .line 220
    .line 221
    and-int v0, v3, v17

    .line 222
    .line 223
    const v2, 0x92492

    .line 224
    .line 225
    .line 226
    if-ne v0, v2, :cond_15

    .line 227
    .line 228
    invoke-interface {v14}, Landroidx/compose/runtime/Composer;->getSkipping()Z

    .line 229
    .line 230
    .line 231
    move-result v0

    .line 232
    if-nez v0, :cond_14

    .line 233
    .line 234
    goto :goto_10

    .line 235
    :cond_14
    invoke-interface {v14}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    .line 236
    .line 237
    .line 238
    move-object/from16 v1, p0

    .line 239
    .line 240
    move-object v2, v5

    .line 241
    move-wide v3, v6

    .line 242
    move-wide v5, v8

    .line 243
    move-object v8, v11

    .line 244
    move v7, v15

    .line 245
    goto/16 :goto_15

    .line 246
    .line 247
    :cond_15
    :goto_10
    invoke-interface {v14}, Landroidx/compose/runtime/Composer;->startDefaults()V

    .line 248
    .line 249
    .line 250
    and-int/lit8 v0, v13, 0x1

    .line 251
    .line 252
    const/4 v2, 0x6

    .line 253
    if-eqz v0, :cond_1a

    .line 254
    .line 255
    invoke-interface {v14}, Landroidx/compose/runtime/Composer;->getDefaultsInvalid()Z

    .line 256
    .line 257
    .line 258
    move-result v0

    .line 259
    if-eqz v0, :cond_16

    .line 260
    .line 261
    goto :goto_11

    .line 262
    :cond_16
    invoke-interface {v14}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    .line 263
    .line 264
    .line 265
    and-int/lit8 v0, p11, 0x4

    .line 266
    .line 267
    if-eqz v0, :cond_17

    .line 268
    .line 269
    and-int/lit16 v3, v3, -0x381

    .line 270
    .line 271
    :cond_17
    and-int/lit8 v0, p11, 0x8

    .line 272
    .line 273
    if-eqz v0, :cond_18

    .line 274
    .line 275
    and-int/lit16 v3, v3, -0x1c01

    .line 276
    .line 277
    :cond_18
    and-int/lit8 v0, p11, 0x20

    .line 278
    .line 279
    if-eqz v0, :cond_19

    .line 280
    .line 281
    const v0, -0x70001

    .line 282
    .line 283
    .line 284
    and-int/2addr v3, v0

    .line 285
    :cond_19
    move-object/from16 v17, v5

    .line 286
    .line 287
    move-wide/from16 v19, v6

    .line 288
    .line 289
    move-wide/from16 v21, v8

    .line 290
    .line 291
    move-object/from16 v24, v11

    .line 292
    .line 293
    move/from16 v23, v15

    .line 294
    .line 295
    move-object/from16 v15, p0

    .line 296
    .line 297
    goto :goto_14

    .line 298
    :cond_1a
    :goto_11
    if-eqz v1, :cond_1b

    .line 299
    .line 300
    sget-object v0, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    .line 301
    .line 302
    goto :goto_12

    .line 303
    :cond_1b
    move-object/from16 v0, p0

    .line 304
    .line 305
    :goto_12
    if-eqz v4, :cond_1c

    .line 306
    .line 307
    invoke-static {}, Landroidx/compose/ui/graphics/RectangleShapeKt;->getRectangleShape()Landroidx/compose/ui/graphics/Shape;

    .line 308
    .line 309
    .line 310
    move-result-object v1

    .line 311
    move-object v5, v1

    .line 312
    :cond_1c
    and-int/lit8 v1, p11, 0x4

    .line 313
    .line 314
    if-eqz v1, :cond_1d

    .line 315
    .line 316
    sget-object v1, Landroidx/compose/material3/MaterialTheme;->INSTANCE:Landroidx/compose/material3/MaterialTheme;

    .line 317
    .line 318
    invoke-virtual {v1, v14, v2}, Landroidx/compose/material3/MaterialTheme;->getColorScheme(Landroidx/compose/runtime/Composer;I)Landroidx/compose/material3/ColorScheme;

    .line 319
    .line 320
    .line 321
    move-result-object v1

    .line 322
    invoke-virtual {v1}, Landroidx/compose/material3/ColorScheme;->getSurface-0d7_KjU()J

    .line 323
    .line 324
    .line 325
    move-result-wide v6

    .line 326
    and-int/lit16 v3, v3, -0x381

    .line 327
    .line 328
    :cond_1d
    and-int/lit8 v1, p11, 0x8

    .line 329
    .line 330
    if-eqz v1, :cond_1e

    .line 331
    .line 332
    shr-int/lit8 v1, v3, 0x6

    .line 333
    .line 334
    and-int/lit8 v1, v1, 0xe

    .line 335
    .line 336
    invoke-static {v6, v7, v14, v1}, Landroidx/compose/material3/ColorSchemeKt;->contentColorFor-ek8zF_U(JLandroidx/compose/runtime/Composer;I)J

    .line 337
    .line 338
    .line 339
    move-result-wide v8

    .line 340
    and-int/lit16 v1, v3, -0x1c01

    .line 341
    .line 342
    move v3, v1

    .line 343
    :cond_1e
    if-eqz v10, :cond_1f

    .line 344
    .line 345
    sget-object v1, Landroidx/compose/material3/DrawerDefaults;->INSTANCE:Landroidx/compose/material3/DrawerDefaults;

    .line 346
    .line 347
    invoke-virtual {v1}, Landroidx/compose/material3/DrawerDefaults;->getPermanentDrawerElevation-D9Ej5fM()F

    .line 348
    .line 349
    .line 350
    move-result v1

    .line 351
    move v15, v1

    .line 352
    :cond_1f
    and-int/lit8 v1, p11, 0x20

    .line 353
    .line 354
    if-eqz v1, :cond_20

    .line 355
    .line 356
    sget-object v1, Landroidx/compose/material3/DrawerDefaults;->INSTANCE:Landroidx/compose/material3/DrawerDefaults;

    .line 357
    .line 358
    invoke-virtual {v1, v14, v2}, Landroidx/compose/material3/DrawerDefaults;->getWindowInsets(Landroidx/compose/runtime/Composer;I)Landroidx/compose/foundation/layout/WindowInsets;

    .line 359
    .line 360
    .line 361
    move-result-object v1

    .line 362
    const v4, -0x70001

    .line 363
    .line 364
    .line 365
    and-int/2addr v3, v4

    .line 366
    move-object/from16 v24, v1

    .line 367
    .line 368
    move-object/from16 v17, v5

    .line 369
    .line 370
    move-wide/from16 v19, v6

    .line 371
    .line 372
    move-wide/from16 v21, v8

    .line 373
    .line 374
    goto :goto_13

    .line 375
    :cond_20
    move-object/from16 v17, v5

    .line 376
    .line 377
    move-wide/from16 v19, v6

    .line 378
    .line 379
    move-wide/from16 v21, v8

    .line 380
    .line 381
    move-object/from16 v24, v11

    .line 382
    .line 383
    :goto_13
    move/from16 v23, v15

    .line 384
    .line 385
    move-object v15, v0

    .line 386
    :goto_14
    invoke-interface {v14}, Landroidx/compose/runtime/Composer;->endDefaults()V

    .line 387
    .line 388
    .line 389
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 390
    .line 391
    .line 392
    move-result v0

    .line 393
    if-eqz v0, :cond_21

    .line 394
    .line 395
    const/4 v0, -0x1

    .line 396
    const-string v1, "androidx.compose.material3.PermanentDrawerSheet (NavigationDrawer.kt:534)"

    .line 397
    .line 398
    const v4, -0x6750df19

    .line 399
    .line 400
    .line 401
    invoke-static {v4, v3, v0, v1}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 402
    .line 403
    .line 404
    :cond_21
    sget-object v0, Landroidx/compose/material3/Strings;->Companion:Landroidx/compose/material3/Strings$Companion;

    .line 405
    .line 406
    invoke-virtual {v0}, Landroidx/compose/material3/Strings$Companion;->getNavigationMenu-adMyvUU()I

    .line 407
    .line 408
    .line 409
    move-result v0

    .line 410
    invoke-static {v0, v14, v2}, Landroidx/compose/material3/Strings_androidKt;->getString-NWtq2-8(ILandroidx/compose/runtime/Composer;I)Ljava/lang/String;

    .line 411
    .line 412
    .line 413
    move-result-object v0

    .line 414
    const v1, 0x44faf204

    .line 415
    .line 416
    .line 417
    invoke-interface {v14, v1}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 418
    .line 419
    .line 420
    invoke-interface {v14, v0}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 421
    .line 422
    .line 423
    move-result v1

    .line 424
    invoke-interface {v14}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 425
    .line 426
    .line 427
    move-result-object v2

    .line 428
    if-nez v1, :cond_22

    .line 429
    .line 430
    sget-object v1, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    .line 431
    .line 432
    invoke-virtual {v1}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    .line 433
    .line 434
    .line 435
    move-result-object v1

    .line 436
    if-ne v2, v1, :cond_23

    .line 437
    .line 438
    :cond_22
    new-instance v2, Landroidx/compose/material3/NavigationDrawerKt$PermanentDrawerSheet$1$1;

    .line 439
    .line 440
    invoke-direct {v2, v0}, Landroidx/compose/material3/NavigationDrawerKt$PermanentDrawerSheet$1$1;-><init>(Ljava/lang/String;)V

    .line 441
    .line 442
    .line 443
    invoke-interface {v14, v2}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 444
    .line 445
    .line 446
    :cond_23
    invoke-interface {v14}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 447
    .line 448
    .line 449
    check-cast v2, Lkotlin/jvm/functions/Function1;

    .line 450
    .line 451
    const/4 v0, 0x0

    .line 452
    const/4 v1, 0x0

    .line 453
    const/4 v4, 0x1

    .line 454
    invoke-static {v15, v1, v2, v4, v0}, Landroidx/compose/ui/semantics/SemanticsModifierKt;->semantics$default(Landroidx/compose/ui/Modifier;ZLkotlin/jvm/functions/Function1;ILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    .line 455
    .line 456
    .line 457
    move-result-object v1

    .line 458
    shr-int/lit8 v0, v3, 0xf

    .line 459
    .line 460
    and-int/lit8 v0, v0, 0xe

    .line 461
    .line 462
    shl-int/lit8 v2, v3, 0x3

    .line 463
    .line 464
    and-int/lit16 v4, v2, 0x380

    .line 465
    .line 466
    or-int/2addr v0, v4

    .line 467
    and-int/lit16 v4, v2, 0x1c00

    .line 468
    .line 469
    or-int/2addr v0, v4

    .line 470
    const v4, 0xe000

    .line 471
    .line 472
    .line 473
    and-int/2addr v4, v2

    .line 474
    or-int/2addr v0, v4

    .line 475
    and-int v2, v2, v16

    .line 476
    .line 477
    or-int/2addr v0, v2

    .line 478
    and-int v2, v3, v18

    .line 479
    .line 480
    or-int v10, v0, v2

    .line 481
    .line 482
    const/4 v11, 0x0

    .line 483
    move-object/from16 v0, v24

    .line 484
    .line 485
    move-object/from16 v2, v17

    .line 486
    .line 487
    move-wide/from16 v3, v19

    .line 488
    .line 489
    move-wide/from16 v5, v21

    .line 490
    .line 491
    move/from16 v7, v23

    .line 492
    .line 493
    move-object/from16 v8, p8

    .line 494
    .line 495
    move-object v9, v14

    .line 496
    invoke-static/range {v0 .. v11}, Landroidx/compose/material3/NavigationDrawerKt;->DrawerSheet-vywBR7E(Landroidx/compose/foundation/layout/WindowInsets;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/graphics/Shape;JJFLkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V

    .line 497
    .line 498
    .line 499
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 500
    .line 501
    .line 502
    move-result v0

    .line 503
    if-eqz v0, :cond_24

    .line 504
    .line 505
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 506
    .line 507
    .line 508
    :cond_24
    move-object v1, v15

    .line 509
    move-object/from16 v2, v17

    .line 510
    .line 511
    move-wide/from16 v3, v19

    .line 512
    .line 513
    move-wide/from16 v5, v21

    .line 514
    .line 515
    move/from16 v7, v23

    .line 516
    .line 517
    move-object/from16 v8, v24

    .line 518
    .line 519
    :goto_15
    invoke-interface {v14}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    .line 520
    .line 521
    .line 522
    move-result-object v14

    .line 523
    if-nez v14, :cond_25

    .line 524
    .line 525
    goto :goto_16

    .line 526
    :cond_25
    new-instance v15, Landroidx/compose/material3/NavigationDrawerKt$PermanentDrawerSheet$2;

    .line 527
    .line 528
    move-object v0, v15

    .line 529
    move-object/from16 v9, p8

    .line 530
    .line 531
    move/from16 v10, p10

    .line 532
    .line 533
    move/from16 v11, p11

    .line 534
    .line 535
    invoke-direct/range {v0 .. v11}, Landroidx/compose/material3/NavigationDrawerKt$PermanentDrawerSheet$2;-><init>(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/graphics/Shape;JJFLandroidx/compose/foundation/layout/WindowInsets;Lkotlin/jvm/functions/Function3;II)V

    .line 536
    .line 537
    .line 538
    invoke-interface {v14, v15}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lkotlin/jvm/functions/Function2;)V

    .line 539
    .line 540
    .line 541
    :goto_16
    return-void
.end method

.method public static final PermanentNavigationDrawer(Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V
    .locals 16
    .annotation runtime Landroidx/compose/material3/ExperimentalMaterial3Api;
    .end annotation

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
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v3, p2

    .line 4
    .line 5
    move/from16 v4, p4

    .line 6
    .line 7
    const-string v0, "drawerContent"

    .line 8
    .line 9
    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    const-string v0, "content"

    .line 13
    .line 14
    invoke-static {v3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    const v0, -0x10804c58

    .line 18
    .line 19
    .line 20
    move-object/from16 v2, p3

    .line 21
    .line 22
    invoke-interface {v2, v0}, Landroidx/compose/runtime/Composer;->startRestartGroup(I)Landroidx/compose/runtime/Composer;

    .line 23
    .line 24
    .line 25
    move-result-object v2

    .line 26
    and-int/lit8 v5, p5, 0x1

    .line 27
    .line 28
    if-eqz v5, :cond_0

    .line 29
    .line 30
    or-int/lit8 v5, v4, 0x6

    .line 31
    .line 32
    goto :goto_1

    .line 33
    :cond_0
    and-int/lit8 v5, v4, 0xe

    .line 34
    .line 35
    if-nez v5, :cond_2

    .line 36
    .line 37
    invoke-interface {v2, v1}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

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
    or-int/2addr v5, v4

    .line 47
    goto :goto_1

    .line 48
    :cond_2
    move v5, v4

    .line 49
    :goto_1
    and-int/lit8 v6, p5, 0x2

    .line 50
    .line 51
    if-eqz v6, :cond_3

    .line 52
    .line 53
    or-int/lit8 v5, v5, 0x30

    .line 54
    .line 55
    goto :goto_3

    .line 56
    :cond_3
    and-int/lit8 v7, v4, 0x70

    .line 57
    .line 58
    if-nez v7, :cond_5

    .line 59
    .line 60
    move-object/from16 v7, p1

    .line 61
    .line 62
    invoke-interface {v2, v7}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 63
    .line 64
    .line 65
    move-result v8

    .line 66
    if-eqz v8, :cond_4

    .line 67
    .line 68
    const/16 v8, 0x20

    .line 69
    .line 70
    goto :goto_2

    .line 71
    :cond_4
    const/16 v8, 0x10

    .line 72
    .line 73
    :goto_2
    or-int/2addr v5, v8

    .line 74
    goto :goto_4

    .line 75
    :cond_5
    :goto_3
    move-object/from16 v7, p1

    .line 76
    .line 77
    :goto_4
    and-int/lit8 v8, p5, 0x4

    .line 78
    .line 79
    if-eqz v8, :cond_6

    .line 80
    .line 81
    or-int/lit16 v5, v5, 0x180

    .line 82
    .line 83
    goto :goto_6

    .line 84
    :cond_6
    and-int/lit16 v8, v4, 0x380

    .line 85
    .line 86
    if-nez v8, :cond_8

    .line 87
    .line 88
    invoke-interface {v2, v3}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 89
    .line 90
    .line 91
    move-result v8

    .line 92
    if-eqz v8, :cond_7

    .line 93
    .line 94
    const/16 v8, 0x100

    .line 95
    .line 96
    goto :goto_5

    .line 97
    :cond_7
    const/16 v8, 0x80

    .line 98
    .line 99
    :goto_5
    or-int/2addr v5, v8

    .line 100
    :cond_8
    :goto_6
    and-int/lit16 v8, v5, 0x2db

    .line 101
    .line 102
    const/16 v9, 0x92

    .line 103
    .line 104
    if-ne v8, v9, :cond_a

    .line 105
    .line 106
    invoke-interface {v2}, Landroidx/compose/runtime/Composer;->getSkipping()Z

    .line 107
    .line 108
    .line 109
    move-result v8

    .line 110
    if-nez v8, :cond_9

    .line 111
    .line 112
    goto :goto_7

    .line 113
    :cond_9
    invoke-interface {v2}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    .line 114
    .line 115
    .line 116
    move-object v6, v7

    .line 117
    goto/16 :goto_b

    .line 118
    .line 119
    :cond_a
    :goto_7
    if-eqz v6, :cond_b

    .line 120
    .line 121
    sget-object v6, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    .line 122
    .line 123
    goto :goto_8

    .line 124
    :cond_b
    move-object v6, v7

    .line 125
    :goto_8
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 126
    .line 127
    .line 128
    move-result v7

    .line 129
    if-eqz v7, :cond_c

    .line 130
    .line 131
    const/4 v7, -0x1

    .line 132
    const-string v8, "androidx.compose.material3.PermanentNavigationDrawer (NavigationDrawer.kt:427)"

    .line 133
    .line 134
    invoke-static {v0, v5, v7, v8}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 135
    .line 136
    .line 137
    :cond_c
    const/4 v0, 0x0

    .line 138
    const/4 v7, 0x0

    .line 139
    const/4 v8, 0x1

    .line 140
    invoke-static {v6, v0, v8, v7}, Landroidx/compose/foundation/layout/SizeKt;->fillMaxSize$default(Landroidx/compose/ui/Modifier;FILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    .line 141
    .line 142
    .line 143
    move-result-object v0

    .line 144
    const v7, 0x2952b718

    .line 145
    .line 146
    .line 147
    invoke-interface {v2, v7}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 148
    .line 149
    .line 150
    sget-object v7, Landroidx/compose/foundation/layout/Arrangement;->INSTANCE:Landroidx/compose/foundation/layout/Arrangement;

    .line 151
    .line 152
    invoke-virtual {v7}, Landroidx/compose/foundation/layout/Arrangement;->getStart()Landroidx/compose/foundation/layout/Arrangement$Horizontal;

    .line 153
    .line 154
    .line 155
    move-result-object v7

    .line 156
    sget-object v8, Landroidx/compose/ui/Alignment;->Companion:Landroidx/compose/ui/Alignment$Companion;

    .line 157
    .line 158
    invoke-virtual {v8}, Landroidx/compose/ui/Alignment$Companion;->getTop()Landroidx/compose/ui/Alignment$Vertical;

    .line 159
    .line 160
    .line 161
    move-result-object v9

    .line 162
    const/4 v10, 0x0

    .line 163
    invoke-static {v7, v9, v2, v10}, Landroidx/compose/foundation/layout/RowKt;->rowMeasurePolicy(Landroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/ui/Alignment$Vertical;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/layout/MeasurePolicy;

    .line 164
    .line 165
    .line 166
    move-result-object v7

    .line 167
    const v9, -0x4ee9b9da

    .line 168
    .line 169
    .line 170
    invoke-interface {v2, v9}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 171
    .line 172
    .line 173
    invoke-static {}, Landroidx/compose/ui/platform/CompositionLocalsKt;->getLocalDensity()Landroidx/compose/runtime/ProvidableCompositionLocal;

    .line 174
    .line 175
    .line 176
    move-result-object v11

    .line 177
    invoke-interface {v2, v11}, Landroidx/compose/runtime/Composer;->consume(Landroidx/compose/runtime/CompositionLocal;)Ljava/lang/Object;

    .line 178
    .line 179
    .line 180
    move-result-object v11

    .line 181
    check-cast v11, Landroidx/compose/ui/unit/Density;

    .line 182
    .line 183
    invoke-static {}, Landroidx/compose/ui/platform/CompositionLocalsKt;->getLocalLayoutDirection()Landroidx/compose/runtime/ProvidableCompositionLocal;

    .line 184
    .line 185
    .line 186
    move-result-object v12

    .line 187
    invoke-interface {v2, v12}, Landroidx/compose/runtime/Composer;->consume(Landroidx/compose/runtime/CompositionLocal;)Ljava/lang/Object;

    .line 188
    .line 189
    .line 190
    move-result-object v12

    .line 191
    check-cast v12, Landroidx/compose/ui/unit/LayoutDirection;

    .line 192
    .line 193
    invoke-static {}, Landroidx/compose/ui/platform/CompositionLocalsKt;->getLocalViewConfiguration()Landroidx/compose/runtime/ProvidableCompositionLocal;

    .line 194
    .line 195
    .line 196
    move-result-object v13

    .line 197
    invoke-interface {v2, v13}, Landroidx/compose/runtime/Composer;->consume(Landroidx/compose/runtime/CompositionLocal;)Ljava/lang/Object;

    .line 198
    .line 199
    .line 200
    move-result-object v13

    .line 201
    check-cast v13, Landroidx/compose/ui/platform/ViewConfiguration;

    .line 202
    .line 203
    sget-object v14, Landroidx/compose/ui/node/ComposeUiNode;->Companion:Landroidx/compose/ui/node/ComposeUiNode$Companion;

    .line 204
    .line 205
    invoke-virtual {v14}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getConstructor()Lkotlin/jvm/functions/Function0;

    .line 206
    .line 207
    .line 208
    move-result-object v15

    .line 209
    invoke-static {v0}, Landroidx/compose/ui/layout/LayoutKt;->materializerOf(Landroidx/compose/ui/Modifier;)Lkotlin/jvm/functions/Function3;

    .line 210
    .line 211
    .line 212
    move-result-object v0

    .line 213
    invoke-interface {v2}, Landroidx/compose/runtime/Composer;->getApplier()Landroidx/compose/runtime/Applier;

    .line 214
    .line 215
    .line 216
    move-result-object v9

    .line 217
    instance-of v9, v9, Landroidx/compose/runtime/Applier;

    .line 218
    .line 219
    if-nez v9, :cond_d

    .line 220
    .line 221
    invoke-static {}, Landroidx/compose/runtime/ComposablesKt;->invalidApplier()V

    .line 222
    .line 223
    .line 224
    :cond_d
    invoke-interface {v2}, Landroidx/compose/runtime/Composer;->startReusableNode()V

    .line 225
    .line 226
    .line 227
    invoke-interface {v2}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 228
    .line 229
    .line 230
    move-result v9

    .line 231
    if-eqz v9, :cond_e

    .line 232
    .line 233
    invoke-interface {v2, v15}, Landroidx/compose/runtime/Composer;->createNode(Lkotlin/jvm/functions/Function0;)V

    .line 234
    .line 235
    .line 236
    goto :goto_9

    .line 237
    :cond_e
    invoke-interface {v2}, Landroidx/compose/runtime/Composer;->useNode()V

    .line 238
    .line 239
    .line 240
    :goto_9
    invoke-interface {v2}, Landroidx/compose/runtime/Composer;->disableReusing()V

    .line 241
    .line 242
    .line 243
    invoke-static {v2}, Landroidx/compose/runtime/Updater;->constructor-impl(Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;

    .line 244
    .line 245
    .line 246
    move-result-object v9

    .line 247
    invoke-virtual {v14}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetMeasurePolicy()Lkotlin/jvm/functions/Function2;

    .line 248
    .line 249
    .line 250
    move-result-object v15

    .line 251
    invoke-static {v9, v7, v15}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 252
    .line 253
    .line 254
    invoke-virtual {v14}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetDensity()Lkotlin/jvm/functions/Function2;

    .line 255
    .line 256
    .line 257
    move-result-object v7

    .line 258
    invoke-static {v9, v11, v7}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 259
    .line 260
    .line 261
    invoke-virtual {v14}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetLayoutDirection()Lkotlin/jvm/functions/Function2;

    .line 262
    .line 263
    .line 264
    move-result-object v7

    .line 265
    invoke-static {v9, v12, v7}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 266
    .line 267
    .line 268
    invoke-virtual {v14}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetViewConfiguration()Lkotlin/jvm/functions/Function2;

    .line 269
    .line 270
    .line 271
    move-result-object v7

    .line 272
    invoke-static {v9, v13, v7}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 273
    .line 274
    .line 275
    invoke-interface {v2}, Landroidx/compose/runtime/Composer;->enableReusing()V

    .line 276
    .line 277
    .line 278
    invoke-static {v2}, Landroidx/compose/runtime/SkippableUpdater;->constructor-impl(Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;

    .line 279
    .line 280
    .line 281
    move-result-object v7

    .line 282
    invoke-static {v7}, Landroidx/compose/runtime/SkippableUpdater;->box-impl(Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/SkippableUpdater;

    .line 283
    .line 284
    .line 285
    move-result-object v7

    .line 286
    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 287
    .line 288
    .line 289
    move-result-object v9

    .line 290
    invoke-interface {v0, v7, v2, v9}, Lkotlin/jvm/functions/Function3;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 291
    .line 292
    .line 293
    const v0, 0x7ab4aae9

    .line 294
    .line 295
    .line 296
    invoke-interface {v2, v0}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 297
    .line 298
    .line 299
    const v7, -0x286e2e7f

    .line 300
    .line 301
    .line 302
    invoke-interface {v2, v7}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 303
    .line 304
    .line 305
    sget-object v7, Landroidx/compose/foundation/layout/RowScopeInstance;->INSTANCE:Landroidx/compose/foundation/layout/RowScopeInstance;

    .line 306
    .line 307
    const v7, 0x689f50c

    .line 308
    .line 309
    .line 310
    invoke-interface {v2, v7}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 311
    .line 312
    .line 313
    and-int/lit8 v7, v5, 0xe

    .line 314
    .line 315
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 316
    .line 317
    .line 318
    move-result-object v7

    .line 319
    invoke-interface {v1, v2, v7}, Lkotlin/jvm/functions/Function2;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 320
    .line 321
    .line 322
    const v7, 0x2bb5b5d7

    .line 323
    .line 324
    .line 325
    invoke-interface {v2, v7}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 326
    .line 327
    .line 328
    sget-object v7, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    .line 329
    .line 330
    invoke-virtual {v8}, Landroidx/compose/ui/Alignment$Companion;->getTopStart()Landroidx/compose/ui/Alignment;

    .line 331
    .line 332
    .line 333
    move-result-object v8

    .line 334
    invoke-static {v8, v10, v2, v10}, Landroidx/compose/foundation/layout/BoxKt;->rememberBoxMeasurePolicy(Landroidx/compose/ui/Alignment;ZLandroidx/compose/runtime/Composer;I)Landroidx/compose/ui/layout/MeasurePolicy;

    .line 335
    .line 336
    .line 337
    move-result-object v8

    .line 338
    const v9, -0x4ee9b9da

    .line 339
    .line 340
    .line 341
    invoke-interface {v2, v9}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 342
    .line 343
    .line 344
    invoke-static {}, Landroidx/compose/ui/platform/CompositionLocalsKt;->getLocalDensity()Landroidx/compose/runtime/ProvidableCompositionLocal;

    .line 345
    .line 346
    .line 347
    move-result-object v9

    .line 348
    invoke-interface {v2, v9}, Landroidx/compose/runtime/Composer;->consume(Landroidx/compose/runtime/CompositionLocal;)Ljava/lang/Object;

    .line 349
    .line 350
    .line 351
    move-result-object v9

    .line 352
    check-cast v9, Landroidx/compose/ui/unit/Density;

    .line 353
    .line 354
    invoke-static {}, Landroidx/compose/ui/platform/CompositionLocalsKt;->getLocalLayoutDirection()Landroidx/compose/runtime/ProvidableCompositionLocal;

    .line 355
    .line 356
    .line 357
    move-result-object v11

    .line 358
    invoke-interface {v2, v11}, Landroidx/compose/runtime/Composer;->consume(Landroidx/compose/runtime/CompositionLocal;)Ljava/lang/Object;

    .line 359
    .line 360
    .line 361
    move-result-object v11

    .line 362
    check-cast v11, Landroidx/compose/ui/unit/LayoutDirection;

    .line 363
    .line 364
    invoke-static {}, Landroidx/compose/ui/platform/CompositionLocalsKt;->getLocalViewConfiguration()Landroidx/compose/runtime/ProvidableCompositionLocal;

    .line 365
    .line 366
    .line 367
    move-result-object v12

    .line 368
    invoke-interface {v2, v12}, Landroidx/compose/runtime/Composer;->consume(Landroidx/compose/runtime/CompositionLocal;)Ljava/lang/Object;

    .line 369
    .line 370
    .line 371
    move-result-object v12

    .line 372
    check-cast v12, Landroidx/compose/ui/platform/ViewConfiguration;

    .line 373
    .line 374
    invoke-virtual {v14}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getConstructor()Lkotlin/jvm/functions/Function0;

    .line 375
    .line 376
    .line 377
    move-result-object v13

    .line 378
    invoke-static {v7}, Landroidx/compose/ui/layout/LayoutKt;->materializerOf(Landroidx/compose/ui/Modifier;)Lkotlin/jvm/functions/Function3;

    .line 379
    .line 380
    .line 381
    move-result-object v7

    .line 382
    invoke-interface {v2}, Landroidx/compose/runtime/Composer;->getApplier()Landroidx/compose/runtime/Applier;

    .line 383
    .line 384
    .line 385
    move-result-object v15

    .line 386
    instance-of v15, v15, Landroidx/compose/runtime/Applier;

    .line 387
    .line 388
    if-nez v15, :cond_f

    .line 389
    .line 390
    invoke-static {}, Landroidx/compose/runtime/ComposablesKt;->invalidApplier()V

    .line 391
    .line 392
    .line 393
    :cond_f
    invoke-interface {v2}, Landroidx/compose/runtime/Composer;->startReusableNode()V

    .line 394
    .line 395
    .line 396
    invoke-interface {v2}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 397
    .line 398
    .line 399
    move-result v15

    .line 400
    if-eqz v15, :cond_10

    .line 401
    .line 402
    invoke-interface {v2, v13}, Landroidx/compose/runtime/Composer;->createNode(Lkotlin/jvm/functions/Function0;)V

    .line 403
    .line 404
    .line 405
    goto :goto_a

    .line 406
    :cond_10
    invoke-interface {v2}, Landroidx/compose/runtime/Composer;->useNode()V

    .line 407
    .line 408
    .line 409
    :goto_a
    invoke-interface {v2}, Landroidx/compose/runtime/Composer;->disableReusing()V

    .line 410
    .line 411
    .line 412
    invoke-static {v2}, Landroidx/compose/runtime/Updater;->constructor-impl(Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;

    .line 413
    .line 414
    .line 415
    move-result-object v13

    .line 416
    invoke-virtual {v14}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetMeasurePolicy()Lkotlin/jvm/functions/Function2;

    .line 417
    .line 418
    .line 419
    move-result-object v15

    .line 420
    invoke-static {v13, v8, v15}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 421
    .line 422
    .line 423
    invoke-virtual {v14}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetDensity()Lkotlin/jvm/functions/Function2;

    .line 424
    .line 425
    .line 426
    move-result-object v8

    .line 427
    invoke-static {v13, v9, v8}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 428
    .line 429
    .line 430
    invoke-virtual {v14}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetLayoutDirection()Lkotlin/jvm/functions/Function2;

    .line 431
    .line 432
    .line 433
    move-result-object v8

    .line 434
    invoke-static {v13, v11, v8}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 435
    .line 436
    .line 437
    invoke-virtual {v14}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetViewConfiguration()Lkotlin/jvm/functions/Function2;

    .line 438
    .line 439
    .line 440
    move-result-object v8

    .line 441
    invoke-static {v13, v12, v8}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 442
    .line 443
    .line 444
    invoke-interface {v2}, Landroidx/compose/runtime/Composer;->enableReusing()V

    .line 445
    .line 446
    .line 447
    invoke-static {v2}, Landroidx/compose/runtime/SkippableUpdater;->constructor-impl(Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;

    .line 448
    .line 449
    .line 450
    move-result-object v8

    .line 451
    invoke-static {v8}, Landroidx/compose/runtime/SkippableUpdater;->box-impl(Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/SkippableUpdater;

    .line 452
    .line 453
    .line 454
    move-result-object v8

    .line 455
    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 456
    .line 457
    .line 458
    move-result-object v9

    .line 459
    invoke-interface {v7, v8, v2, v9}, Lkotlin/jvm/functions/Function3;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 460
    .line 461
    .line 462
    invoke-interface {v2, v0}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 463
    .line 464
    .line 465
    const v0, -0x7f65a980

    .line 466
    .line 467
    .line 468
    invoke-interface {v2, v0}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 469
    .line 470
    .line 471
    sget-object v0, Landroidx/compose/foundation/layout/BoxScopeInstance;->INSTANCE:Landroidx/compose/foundation/layout/BoxScopeInstance;

    .line 472
    .line 473
    const v0, 0x2483e912

    .line 474
    .line 475
    .line 476
    invoke-interface {v2, v0}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 477
    .line 478
    .line 479
    shr-int/lit8 v0, v5, 0x6

    .line 480
    .line 481
    and-int/lit8 v0, v0, 0xe

    .line 482
    .line 483
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 484
    .line 485
    .line 486
    move-result-object v0

    .line 487
    invoke-interface {v3, v2, v0}, Lkotlin/jvm/functions/Function2;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 488
    .line 489
    .line 490
    invoke-interface {v2}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 491
    .line 492
    .line 493
    invoke-interface {v2}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 494
    .line 495
    .line 496
    invoke-interface {v2}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 497
    .line 498
    .line 499
    invoke-interface {v2}, Landroidx/compose/runtime/Composer;->endNode()V

    .line 500
    .line 501
    .line 502
    invoke-interface {v2}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 503
    .line 504
    .line 505
    invoke-interface {v2}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 506
    .line 507
    .line 508
    invoke-interface {v2}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 509
    .line 510
    .line 511
    invoke-interface {v2}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 512
    .line 513
    .line 514
    invoke-interface {v2}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 515
    .line 516
    .line 517
    invoke-interface {v2}, Landroidx/compose/runtime/Composer;->endNode()V

    .line 518
    .line 519
    .line 520
    invoke-interface {v2}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 521
    .line 522
    .line 523
    invoke-interface {v2}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 524
    .line 525
    .line 526
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 527
    .line 528
    .line 529
    move-result v0

    .line 530
    if-eqz v0, :cond_11

    .line 531
    .line 532
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 533
    .line 534
    .line 535
    :cond_11
    :goto_b
    invoke-interface {v2}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    .line 536
    .line 537
    .line 538
    move-result-object v7

    .line 539
    if-nez v7, :cond_12

    .line 540
    .line 541
    goto :goto_c

    .line 542
    :cond_12
    new-instance v8, Landroidx/compose/material3/NavigationDrawerKt$PermanentNavigationDrawer$2;

    .line 543
    .line 544
    move-object v0, v8

    .line 545
    move-object/from16 v1, p0

    .line 546
    .line 547
    move-object v2, v6

    .line 548
    move-object/from16 v3, p2

    .line 549
    .line 550
    move/from16 v4, p4

    .line 551
    .line 552
    move/from16 v5, p5

    .line 553
    .line 554
    invoke-direct/range {v0 .. v5}, Landroidx/compose/material3/NavigationDrawerKt$PermanentNavigationDrawer$2;-><init>(Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;II)V

    .line 555
    .line 556
    .line 557
    invoke-interface {v7, v8}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lkotlin/jvm/functions/Function2;)V

    .line 558
    .line 559
    .line 560
    :goto_c
    return-void
.end method

.method private static final Scrim-Bx497Mc(ZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;JLandroidx/compose/runtime/Composer;I)V
    .locals 8
    .annotation build Landroidx/compose/runtime/Composable;
    .end annotation

    .annotation build Landroidx/compose/runtime/ComposableTarget;
        applier = "androidx.compose.ui.UiComposable"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z",
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;",
            "Lkotlin/jvm/functions/Function0<",
            "Ljava/lang/Float;",
            ">;J",
            "Landroidx/compose/runtime/Composer;",
            "I)V"
        }
    .end annotation

    .line 1
    const v0, 0x7d8e725b

    .line 2
    .line 3
    .line 4
    invoke-interface {p5, v0}, Landroidx/compose/runtime/Composer;->startRestartGroup(I)Landroidx/compose/runtime/Composer;

    .line 5
    .line 6
    .line 7
    move-result-object p5

    .line 8
    and-int/lit8 v1, p6, 0xe

    .line 9
    .line 10
    if-nez v1, :cond_1

    .line 11
    .line 12
    invoke-interface {p5, p0}, Landroidx/compose/runtime/Composer;->changed(Z)Z

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
    or-int/2addr v1, p6

    .line 22
    goto :goto_1

    .line 23
    :cond_1
    move v1, p6

    .line 24
    :goto_1
    and-int/lit8 v2, p6, 0x70

    .line 25
    .line 26
    if-nez v2, :cond_3

    .line 27
    .line 28
    invoke-interface {p5, p1}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

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
    and-int/lit16 v2, p6, 0x380

    .line 41
    .line 42
    if-nez v2, :cond_5

    .line 43
    .line 44
    invoke-interface {p5, p2}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

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
    and-int/lit16 v2, p6, 0x1c00

    .line 57
    .line 58
    if-nez v2, :cond_7

    .line 59
    .line 60
    invoke-interface {p5, p3, p4}, Landroidx/compose/runtime/Composer;->changed(J)Z

    .line 61
    .line 62
    .line 63
    move-result v2

    .line 64
    if-eqz v2, :cond_6

    .line 65
    .line 66
    const/16 v2, 0x800

    .line 67
    .line 68
    goto :goto_4

    .line 69
    :cond_6
    const/16 v2, 0x400

    .line 70
    .line 71
    :goto_4
    or-int/2addr v1, v2

    .line 72
    :cond_7
    and-int/lit16 v2, v1, 0x16db

    .line 73
    .line 74
    const/16 v3, 0x492

    .line 75
    .line 76
    if-ne v2, v3, :cond_9

    .line 77
    .line 78
    invoke-interface {p5}, Landroidx/compose/runtime/Composer;->getSkipping()Z

    .line 79
    .line 80
    .line 81
    move-result v2

    .line 82
    if-nez v2, :cond_8

    .line 83
    .line 84
    goto :goto_5

    .line 85
    :cond_8
    invoke-interface {p5}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    .line 86
    .line 87
    .line 88
    goto/16 :goto_7

    .line 89
    .line 90
    :cond_9
    :goto_5
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 91
    .line 92
    .line 93
    move-result v2

    .line 94
    if-eqz v2, :cond_a

    .line 95
    .line 96
    const/4 v2, -0x1

    .line 97
    const-string v3, "androidx.compose.material3.Scrim (NavigationDrawer.kt:854)"

    .line 98
    .line 99
    invoke-static {v0, v1, v2, v3}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 100
    .line 101
    .line 102
    :cond_a
    sget-object v0, Landroidx/compose/material3/Strings;->Companion:Landroidx/compose/material3/Strings$Companion;

    .line 103
    .line 104
    invoke-virtual {v0}, Landroidx/compose/material3/Strings$Companion;->getCloseDrawer-adMyvUU()I

    .line 105
    .line 106
    .line 107
    move-result v0

    .line 108
    const/4 v1, 0x6

    .line 109
    invoke-static {v0, p5, v1}, Landroidx/compose/material3/Strings_androidKt;->getString-NWtq2-8(ILandroidx/compose/runtime/Composer;I)Ljava/lang/String;

    .line 110
    .line 111
    .line 112
    move-result-object v0

    .line 113
    const v1, -0x6ec98f21

    .line 114
    .line 115
    .line 116
    invoke-interface {p5, v1}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 117
    .line 118
    .line 119
    const v1, 0x1e7b2b64

    .line 120
    .line 121
    .line 122
    const/4 v2, 0x0

    .line 123
    const/4 v3, 0x1

    .line 124
    if-eqz p0, :cond_f

    .line 125
    .line 126
    sget-object v4, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    .line 127
    .line 128
    const v5, 0x44faf204

    .line 129
    .line 130
    .line 131
    invoke-interface {p5, v5}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 132
    .line 133
    .line 134
    invoke-interface {p5, p1}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 135
    .line 136
    .line 137
    move-result v5

    .line 138
    invoke-interface {p5}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 139
    .line 140
    .line 141
    move-result-object v6

    .line 142
    if-nez v5, :cond_b

    .line 143
    .line 144
    sget-object v5, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    .line 145
    .line 146
    invoke-virtual {v5}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    .line 147
    .line 148
    .line 149
    move-result-object v5

    .line 150
    if-ne v6, v5, :cond_c

    .line 151
    .line 152
    :cond_b
    new-instance v6, Landroidx/compose/material3/NavigationDrawerKt$Scrim$dismissDrawer$1$1;

    .line 153
    .line 154
    invoke-direct {v6, p1, v2}, Landroidx/compose/material3/NavigationDrawerKt$Scrim$dismissDrawer$1$1;-><init>(Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)V

    .line 155
    .line 156
    .line 157
    invoke-interface {p5, v6}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 158
    .line 159
    .line 160
    :cond_c
    invoke-interface {p5}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 161
    .line 162
    .line 163
    check-cast v6, Lkotlin/jvm/functions/Function2;

    .line 164
    .line 165
    invoke-static {v4, p1, v6}, Landroidx/compose/ui/input/pointer/SuspendingPointerInputFilterKt;->pointerInput(Landroidx/compose/ui/Modifier;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)Landroidx/compose/ui/Modifier;

    .line 166
    .line 167
    .line 168
    move-result-object v4

    .line 169
    invoke-interface {p5, v1}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 170
    .line 171
    .line 172
    invoke-interface {p5, v0}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 173
    .line 174
    .line 175
    move-result v5

    .line 176
    invoke-interface {p5, p1}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 177
    .line 178
    .line 179
    move-result v6

    .line 180
    or-int/2addr v5, v6

    .line 181
    invoke-interface {p5}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 182
    .line 183
    .line 184
    move-result-object v6

    .line 185
    if-nez v5, :cond_d

    .line 186
    .line 187
    sget-object v5, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    .line 188
    .line 189
    invoke-virtual {v5}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    .line 190
    .line 191
    .line 192
    move-result-object v5

    .line 193
    if-ne v6, v5, :cond_e

    .line 194
    .line 195
    :cond_d
    new-instance v6, Landroidx/compose/material3/NavigationDrawerKt$Scrim$dismissDrawer$2$1;

    .line 196
    .line 197
    invoke-direct {v6, v0, p1}, Landroidx/compose/material3/NavigationDrawerKt$Scrim$dismissDrawer$2$1;-><init>(Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V

    .line 198
    .line 199
    .line 200
    invoke-interface {p5, v6}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 201
    .line 202
    .line 203
    :cond_e
    invoke-interface {p5}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 204
    .line 205
    .line 206
    check-cast v6, Lkotlin/jvm/functions/Function1;

    .line 207
    .line 208
    invoke-static {v4, v3, v6}, Landroidx/compose/ui/semantics/SemanticsModifierKt;->semantics(Landroidx/compose/ui/Modifier;ZLkotlin/jvm/functions/Function1;)Landroidx/compose/ui/Modifier;

    .line 209
    .line 210
    .line 211
    move-result-object v0

    .line 212
    goto :goto_6

    .line 213
    :cond_f
    sget-object v0, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    .line 214
    .line 215
    :goto_6
    invoke-interface {p5}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 216
    .line 217
    .line 218
    sget-object v4, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    .line 219
    .line 220
    const/4 v5, 0x0

    .line 221
    invoke-static {v4, v5, v3, v2}, Landroidx/compose/foundation/layout/SizeKt;->fillMaxSize$default(Landroidx/compose/ui/Modifier;FILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    .line 222
    .line 223
    .line 224
    move-result-object v2

    .line 225
    invoke-interface {v2, v0}, Landroidx/compose/ui/Modifier;->then(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    .line 226
    .line 227
    .line 228
    move-result-object v0

    .line 229
    invoke-static {p3, p4}, Landroidx/compose/ui/graphics/Color;->box-impl(J)Landroidx/compose/ui/graphics/Color;

    .line 230
    .line 231
    .line 232
    move-result-object v2

    .line 233
    invoke-interface {p5, v1}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 234
    .line 235
    .line 236
    invoke-interface {p5, v2}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 237
    .line 238
    .line 239
    move-result v1

    .line 240
    invoke-interface {p5, p2}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 241
    .line 242
    .line 243
    move-result v2

    .line 244
    or-int/2addr v1, v2

    .line 245
    invoke-interface {p5}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 246
    .line 247
    .line 248
    move-result-object v2

    .line 249
    if-nez v1, :cond_10

    .line 250
    .line 251
    sget-object v1, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    .line 252
    .line 253
    invoke-virtual {v1}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    .line 254
    .line 255
    .line 256
    move-result-object v1

    .line 257
    if-ne v2, v1, :cond_11

    .line 258
    .line 259
    :cond_10
    new-instance v2, Landroidx/compose/material3/NavigationDrawerKt$Scrim$1$1;

    .line 260
    .line 261
    invoke-direct {v2, p3, p4, p2}, Landroidx/compose/material3/NavigationDrawerKt$Scrim$1$1;-><init>(JLkotlin/jvm/functions/Function0;)V

    .line 262
    .line 263
    .line 264
    invoke-interface {p5, v2}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 265
    .line 266
    .line 267
    :cond_11
    invoke-interface {p5}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 268
    .line 269
    .line 270
    check-cast v2, Lkotlin/jvm/functions/Function1;

    .line 271
    .line 272
    const/4 v1, 0x0

    .line 273
    invoke-static {v0, v2, p5, v1}, Landroidx/compose/foundation/CanvasKt;->Canvas(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    .line 274
    .line 275
    .line 276
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 277
    .line 278
    .line 279
    move-result v0

    .line 280
    if-eqz v0, :cond_12

    .line 281
    .line 282
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 283
    .line 284
    .line 285
    :cond_12
    :goto_7
    invoke-interface {p5}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    .line 286
    .line 287
    .line 288
    move-result-object p5

    .line 289
    if-nez p5, :cond_13

    .line 290
    .line 291
    goto :goto_8

    .line 292
    :cond_13
    new-instance v7, Landroidx/compose/material3/NavigationDrawerKt$Scrim$2;

    .line 293
    .line 294
    move-object v0, v7

    .line 295
    move v1, p0

    .line 296
    move-object v2, p1

    .line 297
    move-object v3, p2

    .line 298
    move-wide v4, p3

    .line 299
    move v6, p6

    .line 300
    invoke-direct/range {v0 .. v6}, Landroidx/compose/material3/NavigationDrawerKt$Scrim$2;-><init>(ZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;JI)V

    .line 301
    .line 302
    .line 303
    invoke-interface {p5, v7}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lkotlin/jvm/functions/Function2;)V

    .line 304
    .line 305
    .line 306
    :goto_8
    return-void
.end method

.method public static final synthetic access$DrawerSheet-vywBR7E(Landroidx/compose/foundation/layout/WindowInsets;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/graphics/Shape;JJFLkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V
    .locals 0

    .line 1
    invoke-static/range {p0 .. p11}, Landroidx/compose/material3/NavigationDrawerKt;->DrawerSheet-vywBR7E(Landroidx/compose/foundation/layout/WindowInsets;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/graphics/Shape;JJFLkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static final synthetic access$Scrim-Bx497Mc(ZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;JLandroidx/compose/runtime/Composer;I)V
    .locals 0

    .line 1
    invoke-static/range {p0 .. p6}, Landroidx/compose/material3/NavigationDrawerKt;->Scrim-Bx497Mc(ZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;JLandroidx/compose/runtime/Composer;I)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static final synthetic access$calculateFraction(FFF)F
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Landroidx/compose/material3/NavigationDrawerKt;->calculateFraction(FFF)F

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method

.method public static final synthetic access$getAnimationSpec$p()Landroidx/compose/animation/core/TweenSpec;
    .locals 1

    .line 1
    sget-object v0, Landroidx/compose/material3/NavigationDrawerKt;->AnimationSpec:Landroidx/compose/animation/core/TweenSpec;

    .line 2
    .line 3
    return-object v0
.end method

.method public static final synthetic access$getMinimumDrawerWidth$p()F
    .locals 1

    .line 1
    sget v0, Landroidx/compose/material3/NavigationDrawerKt;->MinimumDrawerWidth:F

    .line 2
    .line 3
    return v0
.end method

.method private static final calculateFraction(FFF)F
    .locals 0

    .line 1
    sub-float/2addr p2, p0

    .line 2
    sub-float/2addr p1, p0

    .line 3
    div-float/2addr p2, p1

    .line 4
    const/4 p0, 0x0

    .line 5
    const/high16 p1, 0x3f800000    # 1.0f

    .line 6
    .line 7
    invoke-static {p2, p0, p1}, Lkotlin/ranges/RangesKt;->coerceIn(FFF)F

    .line 8
    .line 9
    .line 10
    move-result p0

    .line 11
    return p0
.end method

.method public static final rememberDrawerState(Landroidx/compose/material3/DrawerValue;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)Landroidx/compose/material3/DrawerState;
    .locals 7
    .annotation runtime Landroidx/compose/material3/ExperimentalMaterial3Api;
    .end annotation

    .annotation build Landroidx/compose/runtime/Composable;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/material3/DrawerValue;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Landroidx/compose/material3/DrawerValue;",
            "Ljava/lang/Boolean;",
            ">;",
            "Landroidx/compose/runtime/Composer;",
            "II)",
            "Landroidx/compose/material3/DrawerState;"
        }
    .end annotation

    .line 1
    const-string v0, "initialValue"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const v0, 0x7d179bd6

    .line 7
    .line 8
    .line 9
    invoke-interface {p2, v0}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 10
    .line 11
    .line 12
    and-int/lit8 p4, p4, 0x2

    .line 13
    .line 14
    if-eqz p4, :cond_0

    .line 15
    .line 16
    sget-object p1, Landroidx/compose/material3/NavigationDrawerKt$rememberDrawerState$1;->INSTANCE:Landroidx/compose/material3/NavigationDrawerKt$rememberDrawerState$1;

    .line 17
    .line 18
    :cond_0
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 19
    .line 20
    .line 21
    move-result p4

    .line 22
    if-eqz p4, :cond_1

    .line 23
    .line 24
    const/4 p4, -0x1

    .line 25
    const-string v1, "androidx.compose.material3.rememberDrawerState (NavigationDrawer.kt:225)"

    .line 26
    .line 27
    invoke-static {v0, p3, p4, v1}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 28
    .line 29
    .line 30
    :cond_1
    const/4 p3, 0x0

    .line 31
    new-array v0, p3, [Ljava/lang/Object;

    .line 32
    .line 33
    sget-object p3, Landroidx/compose/material3/DrawerState;->Companion:Landroidx/compose/material3/DrawerState$Companion;

    .line 34
    .line 35
    invoke-virtual {p3, p1}, Landroidx/compose/material3/DrawerState$Companion;->Saver(Lkotlin/jvm/functions/Function1;)Landroidx/compose/runtime/saveable/Saver;

    .line 36
    .line 37
    .line 38
    move-result-object v1

    .line 39
    const/4 v2, 0x0

    .line 40
    const p3, 0x1e7b2b64

    .line 41
    .line 42
    .line 43
    invoke-interface {p2, p3}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 44
    .line 45
    .line 46
    invoke-interface {p2, p0}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 47
    .line 48
    .line 49
    move-result p3

    .line 50
    invoke-interface {p2, p1}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 51
    .line 52
    .line 53
    move-result p4

    .line 54
    or-int/2addr p3, p4

    .line 55
    invoke-interface {p2}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    move-result-object p4

    .line 59
    if-nez p3, :cond_2

    .line 60
    .line 61
    sget-object p3, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    .line 62
    .line 63
    invoke-virtual {p3}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    .line 64
    .line 65
    .line 66
    move-result-object p3

    .line 67
    if-ne p4, p3, :cond_3

    .line 68
    .line 69
    :cond_2
    new-instance p4, Landroidx/compose/material3/NavigationDrawerKt$rememberDrawerState$2$1;

    .line 70
    .line 71
    invoke-direct {p4, p0, p1}, Landroidx/compose/material3/NavigationDrawerKt$rememberDrawerState$2$1;-><init>(Landroidx/compose/material3/DrawerValue;Lkotlin/jvm/functions/Function1;)V

    .line 72
    .line 73
    .line 74
    invoke-interface {p2, p4}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 75
    .line 76
    .line 77
    :cond_3
    invoke-interface {p2}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 78
    .line 79
    .line 80
    move-object v3, p4

    .line 81
    check-cast v3, Lkotlin/jvm/functions/Function0;

    .line 82
    .line 83
    const/16 v5, 0x48

    .line 84
    .line 85
    const/4 v6, 0x4

    .line 86
    move-object v4, p2

    .line 87
    invoke-static/range {v0 .. v6}, Landroidx/compose/runtime/saveable/RememberSaveableKt;->rememberSaveable([Ljava/lang/Object;Landroidx/compose/runtime/saveable/Saver;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)Ljava/lang/Object;

    .line 88
    .line 89
    .line 90
    move-result-object p0

    .line 91
    check-cast p0, Landroidx/compose/material3/DrawerState;

    .line 92
    .line 93
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 94
    .line 95
    .line 96
    move-result p1

    .line 97
    if-eqz p1, :cond_4

    .line 98
    .line 99
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 100
    .line 101
    .line 102
    :cond_4
    invoke-interface {p2}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 103
    .line 104
    .line 105
    return-object p0
.end method
