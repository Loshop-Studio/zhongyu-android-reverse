.class public final Landroidx/compose/material3/TabRowKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000`\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0016\u001a\u0094\u0001\u0010\u0007\u001a\u00020\u00082\u0006\u0010\t\u001a\u00020\n2\u0008\u0008\u0002\u0010\u000b\u001a\u00020\u000c2\u0008\u0008\u0002\u0010\r\u001a\u00020\u000e2\u0008\u0008\u0002\u0010\u000f\u001a\u00020\u00102\u0008\u0008\u0002\u0010\u0011\u001a\u00020\u00102\u0008\u0008\u0002\u0010\u0012\u001a\u00020\u00012\u001e\u0008\u0002\u0010\u0013\u001a\u0018\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00080\u0014\u00a2\u0006\u0002\u0008\u0016\u00a2\u0006\u0002\u0008\u00172\u0013\u0008\u0002\u0010\u0018\u001a\r\u0012\u0004\u0012\u00020\u00080\u0019\u00a2\u0006\u0002\u0008\u00162\u0011\u0010\u001a\u001a\r\u0012\u0004\u0012\u00020\u00080\u0019\u00a2\u0006\u0002\u0008\u0016H\u0007\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008\u001b\u0010\u001c\u001a\u0080\u0001\u0010\u001d\u001a\u00020\u00082\u0006\u0010\t\u001a\u00020\n2\u0008\u0008\u0002\u0010\u000b\u001a\u00020\u000c2\u0008\u0008\u0002\u0010\u000f\u001a\u00020\u00102\u0008\u0008\u0002\u0010\u0011\u001a\u00020\u00102\u001e\u0008\u0002\u0010\u0013\u001a\u0018\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00080\u0014\u00a2\u0006\u0002\u0008\u0016\u00a2\u0006\u0002\u0008\u00172\u0013\u0008\u0002\u0010\u0018\u001a\r\u0012\u0004\u0012\u00020\u00080\u0019\u00a2\u0006\u0002\u0008\u00162\u0011\u0010\u001a\u001a\r\u0012\u0004\u0012\u00020\u00080\u0019\u00a2\u0006\u0002\u0008\u0016H\u0007\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008\u001e\u0010\u001f\u001a\u009a\u0001\u0010 \u001a\u00020\u00082\u0006\u0010\t\u001a\u00020\n2\u0008\u0008\u0002\u0010\u000b\u001a\u00020\u000c2\u0008\u0008\u0002\u0010\u000f\u001a\u00020\u00102\u0008\u0008\u0002\u0010\u0011\u001a\u00020\u00102\u0008\u0008\u0002\u0010\u0012\u001a\u00020\u00012.\u0008\u0002\u0010\u0013\u001a(\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020\"0!\u00a2\u0006\u000c\u0008#\u0012\u0008\u0008$\u0012\u0004\u0008\u0008(%\u0012\u0004\u0012\u00020\u00080\u0014\u00a2\u0006\u0002\u0008\u00162\u0013\u0008\u0002\u0010\u0018\u001a\r\u0012\u0004\u0012\u00020\u00080\u0019\u00a2\u0006\u0002\u0008\u00162\u0011\u0010\u001a\u001a\r\u0012\u0004\u0012\u00020\u00080\u0019\u00a2\u0006\u0002\u0008\u0016H\u0007\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008&\u0010\'\u001a\u0086\u0001\u0010(\u001a\u00020\u00082\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u000c2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u00012\u0006\u0010\r\u001a\u00020\u000e2\u001c\u0010\u0013\u001a\u0018\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00080\u0014\u00a2\u0006\u0002\u0008\u0016\u00a2\u0006\u0002\u0008\u00172\u0011\u0010\u0018\u001a\r\u0012\u0004\u0012\u00020\u00080\u0019\u00a2\u0006\u0002\u0008\u00162\u0011\u0010\u001a\u001a\r\u0012\u0004\u0012\u00020\u00080\u0019\u00a2\u0006\u0002\u0008\u0016H\u0003\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008)\u0010*\u001a\u00a0\u0001\u0010+\u001a\u00020\u00082\u0006\u0010\t\u001a\u00020\n2,\u0010\u0013\u001a(\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020\"0!\u00a2\u0006\u000c\u0008#\u0012\u0008\u0008$\u0012\u0004\u0008\u0008(%\u0012\u0004\u0012\u00020\u00080\u0014\u00a2\u0006\u0002\u0008\u00162\u0008\u0008\u0002\u0010\u000b\u001a\u00020\u000c2\u0008\u0008\u0002\u0010\u000f\u001a\u00020\u00102\u0008\u0008\u0002\u0010\u0011\u001a\u00020\u00102\u0008\u0008\u0002\u0010\u0012\u001a\u00020\u00012\u0013\u0008\u0002\u0010\u0018\u001a\r\u0012\u0004\u0012\u00020\u00080\u0019\u00a2\u0006\u0002\u0008\u00162\u0011\u0010\u001a\u001a\r\u0012\u0004\u0012\u00020\u00080\u0019\u00a2\u0006\u0002\u0008\u00162\u0006\u0010\r\u001a\u00020\u000eH\u0003\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008,\u0010-\u001a\u0094\u0001\u0010.\u001a\u00020\u00082\u0006\u0010\t\u001a\u00020\n2\u0008\u0008\u0002\u0010\u000b\u001a\u00020\u000c2\u0008\u0008\u0002\u0010\r\u001a\u00020\u000e2\u0008\u0008\u0002\u0010\u000f\u001a\u00020\u00102\u0008\u0008\u0002\u0010\u0011\u001a\u00020\u00102\u0008\u0008\u0002\u0010\u0012\u001a\u00020\u00012\u001e\u0008\u0002\u0010\u0013\u001a\u0018\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00080\u0014\u00a2\u0006\u0002\u0008\u0016\u00a2\u0006\u0002\u0008\u00172\u0013\u0008\u0002\u0010\u0018\u001a\r\u0012\u0004\u0012\u00020\u00080\u0019\u00a2\u0006\u0002\u0008\u00162\u0011\u0010\u001a\u001a\r\u0012\u0004\u0012\u00020\u00080\u0019\u00a2\u0006\u0002\u0008\u0016H\u0007\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008/\u0010\u001c\u001a\u0080\u0001\u00100\u001a\u00020\u00082\u0006\u0010\t\u001a\u00020\n2\u0008\u0008\u0002\u0010\u000b\u001a\u00020\u000c2\u0008\u0008\u0002\u0010\u000f\u001a\u00020\u00102\u0008\u0008\u0002\u0010\u0011\u001a\u00020\u00102\u001e\u0008\u0002\u0010\u0013\u001a\u0018\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00080\u0014\u00a2\u0006\u0002\u0008\u0016\u00a2\u0006\u0002\u0008\u00172\u0013\u0008\u0002\u0010\u0018\u001a\r\u0012\u0004\u0012\u00020\u00080\u0019\u00a2\u0006\u0002\u0008\u00162\u0011\u0010\u001a\u001a\r\u0012\u0004\u0012\u00020\u00080\u0019\u00a2\u0006\u0002\u0008\u0016H\u0007\u00f8\u0001\u0000\u00a2\u0006\u0004\u00081\u0010\u001f\u001a\u0090\u0001\u00102\u001a\u00020\u00082\u0006\u0010\t\u001a\u00020\n2\u0008\u0008\u0002\u0010\u000b\u001a\u00020\u000c2\u0008\u0008\u0002\u0010\u000f\u001a\u00020\u00102\u0008\u0008\u0002\u0010\u0011\u001a\u00020\u00102.\u0008\u0002\u0010\u0013\u001a(\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020\"0!\u00a2\u0006\u000c\u0008#\u0012\u0008\u0008$\u0012\u0004\u0008\u0008(%\u0012\u0004\u0012\u00020\u00080\u0014\u00a2\u0006\u0002\u0008\u00162\u0013\u0008\u0002\u0010\u0018\u001a\r\u0012\u0004\u0012\u00020\u00080\u0019\u00a2\u0006\u0002\u0008\u00162\u0011\u0010\u001a\u001a\r\u0012\u0004\u0012\u00020\u00080\u0019\u00a2\u0006\u0002\u0008\u0016H\u0007\u00f8\u0001\u0000\u00a2\u0006\u0004\u00083\u0010\u001f\u001an\u00104\u001a\u00020\u00082\u0006\u0010\u000b\u001a\u00020\u000c2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00102\u001c\u0010\u0013\u001a\u0018\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00080\u0014\u00a2\u0006\u0002\u0008\u0016\u00a2\u0006\u0002\u0008\u00172\u0011\u0010\u0018\u001a\r\u0012\u0004\u0012\u00020\u00080\u0019\u00a2\u0006\u0002\u0008\u00162\u0011\u0010\u001a\u001a\r\u0012\u0004\u0012\u00020\u00080\u0019\u00a2\u0006\u0002\u0008\u0016H\u0003\u00f8\u0001\u0000\u00a2\u0006\u0004\u00085\u00106\u001a~\u00107\u001a\u00020\u00082\u0006\u0010\u000b\u001a\u00020\u000c2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00102,\u0010\u0013\u001a(\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020\"0!\u00a2\u0006\u000c\u0008#\u0012\u0008\u0008$\u0012\u0004\u0008\u0008(%\u0012\u0004\u0012\u00020\u00080\u0014\u00a2\u0006\u0002\u0008\u00162\u0011\u0010\u0018\u001a\r\u0012\u0004\u0012\u00020\u00080\u0019\u00a2\u0006\u0002\u0008\u00162\u0011\u0010\u001a\u001a\r\u0012\u0004\u0012\u00020\u00080\u0019\u00a2\u0006\u0002\u0008\u0016H\u0003\u00f8\u0001\u0000\u00a2\u0006\u0004\u00088\u00106\"\u0010\u0010\u0000\u001a\u00020\u0001X\u0082\u0004\u00a2\u0006\u0004\n\u0002\u0010\u0002\"\u0014\u0010\u0003\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\"\u0014\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00010\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0007\n\u0005\u0008\u00a1\u001e0\u0001\u00a8\u00069"
    }
    d2 = {
        "ScrollableTabRowMinimumTabWidth",
        "Landroidx/compose/ui/unit/Dp;",
        "F",
        "ScrollableTabRowScrollSpec",
        "Landroidx/compose/animation/core/AnimationSpec;",
        "",
        "TabRowIndicatorSpec",
        "PrimaryScrollableTabRow",
        "",
        "selectedTabIndex",
        "",
        "modifier",
        "Landroidx/compose/ui/Modifier;",
        "scrollState",
        "Landroidx/compose/foundation/ScrollState;",
        "containerColor",
        "Landroidx/compose/ui/graphics/Color;",
        "contentColor",
        "edgePadding",
        "indicator",
        "Lkotlin/Function1;",
        "Landroidx/compose/material3/TabIndicatorScope;",
        "Landroidx/compose/runtime/Composable;",
        "Lkotlin/ExtensionFunctionType;",
        "divider",
        "Lkotlin/Function0;",
        "tabs",
        "PrimaryScrollableTabRow-qhFBPw4",
        "(ILandroidx/compose/ui/Modifier;Landroidx/compose/foundation/ScrollState;JJFLkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V",
        "PrimaryTabRow",
        "PrimaryTabRow-pAZo6Ak",
        "(ILandroidx/compose/ui/Modifier;JJLkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V",
        "ScrollableTabRow",
        "",
        "Landroidx/compose/material3/TabPosition;",
        "Lkotlin/ParameterName;",
        "name",
        "tabPositions",
        "ScrollableTabRow-sKfQg0A",
        "(ILandroidx/compose/ui/Modifier;JJFLkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V",
        "ScrollableTabRowImpl",
        "ScrollableTabRowImpl-sKfQg0A",
        "(ILandroidx/compose/ui/Modifier;JJFLandroidx/compose/foundation/ScrollState;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V",
        "ScrollableTabRowWithSubcomposeImpl",
        "ScrollableTabRowWithSubcomposeImpl-qhFBPw4",
        "(ILkotlin/jvm/functions/Function3;Landroidx/compose/ui/Modifier;JJFLkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/foundation/ScrollState;Landroidx/compose/runtime/Composer;II)V",
        "SecondaryScrollableTabRow",
        "SecondaryScrollableTabRow-qhFBPw4",
        "SecondaryTabRow",
        "SecondaryTabRow-pAZo6Ak",
        "TabRow",
        "TabRow-pAZo6Ak",
        "TabRowImpl",
        "TabRowImpl-DTcfvLk",
        "(Landroidx/compose/ui/Modifier;JJLkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V",
        "TabRowWithSubcomposeImpl",
        "TabRowWithSubcomposeImpl-DTcfvLk",
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
        "SMAP\nTabRow.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TabRow.kt\nandroidx/compose/material3/TabRowKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,1361:1\n148#2:1362\n*S KotlinDebug\n*F\n+ 1 TabRow.kt\nandroidx/compose/material3/TabRowKt\n*L\n1352#1:1362\n*E\n"
    }
.end annotation


# static fields
.field private static final ScrollableTabRowMinimumTabWidth:F

.field private static final ScrollableTabRowScrollSpec:Landroidx/compose/animation/core/AnimationSpec;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/compose/animation/core/AnimationSpec<",
            "Ljava/lang/Float;",
            ">;"
        }
    .end annotation
.end field

.field private static final TabRowIndicatorSpec:Landroidx/compose/animation/core/AnimationSpec;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/compose/animation/core/AnimationSpec<",
            "Landroidx/compose/ui/unit/Dp;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 1
    const/16 v0, 0x5a

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
    sput v0, Landroidx/compose/material3/TabRowKt;->ScrollableTabRowMinimumTabWidth:F

    .line 9
    .line 10
    invoke-static {}, Landroidx/compose/animation/core/EasingKt;->getFastOutSlowInEasing()Landroidx/compose/animation/core/Easing;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    const/16 v1, 0xfa

    .line 15
    .line 16
    const/4 v2, 0x0

    .line 17
    const/4 v3, 0x2

    .line 18
    const/4 v4, 0x0

    .line 19
    invoke-static {v1, v2, v0, v3, v4}, Landroidx/compose/animation/core/AnimationSpecKt;->tween$default(IILandroidx/compose/animation/core/Easing;ILjava/lang/Object;)Landroidx/compose/animation/core/TweenSpec;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    sput-object v0, Landroidx/compose/material3/TabRowKt;->ScrollableTabRowScrollSpec:Landroidx/compose/animation/core/AnimationSpec;

    .line 24
    .line 25
    invoke-static {}, Landroidx/compose/animation/core/EasingKt;->getFastOutSlowInEasing()Landroidx/compose/animation/core/Easing;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    invoke-static {v1, v2, v0, v3, v4}, Landroidx/compose/animation/core/AnimationSpecKt;->tween$default(IILandroidx/compose/animation/core/Easing;ILjava/lang/Object;)Landroidx/compose/animation/core/TweenSpec;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    sput-object v0, Landroidx/compose/material3/TabRowKt;->TabRowIndicatorSpec:Landroidx/compose/animation/core/AnimationSpec;

    .line 34
    .line 35
    return-void
.end method

.method public static final PrimaryScrollableTabRow-qhFBPw4(ILandroidx/compose/ui/Modifier;Landroidx/compose/foundation/ScrollState;JJFLkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V
    .locals 21
    .annotation build Landroidx/compose/material3/ExperimentalMaterial3Api;
    .end annotation

    .annotation build Landroidx/compose/runtime/Composable;
    .end annotation

    .annotation build Landroidx/compose/runtime/ComposableInferredTarget;
        scheme = "[androidx.compose.ui.UiComposable[_][_][_]]"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Landroidx/compose/ui/Modifier;",
            "Landroidx/compose/foundation/ScrollState;",
            "JJF",
            "Lkotlin/jvm/functions/Function3<",
            "-",
            "Landroidx/compose/material3/TabIndicatorScope;",
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
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    .line 1
    move/from16 v0, p0

    .line 2
    .line 3
    move/from16 v13, p12

    .line 4
    .line 5
    move/from16 v14, p13

    .line 6
    .line 7
    const v1, -0x6918ec99

    .line 8
    .line 9
    .line 10
    move-object/from16 v2, p11

    .line 11
    .line 12
    invoke-interface {v2, v1}, Landroidx/compose/runtime/Composer;->startRestartGroup(I)Landroidx/compose/runtime/Composer;

    .line 13
    .line 14
    .line 15
    move-result-object v11

    .line 16
    and-int/lit8 v2, v14, 0x1

    .line 17
    .line 18
    if-eqz v2, :cond_0

    .line 19
    .line 20
    or-int/lit8 v2, v13, 0x6

    .line 21
    .line 22
    goto :goto_1

    .line 23
    :cond_0
    and-int/lit8 v2, v13, 0x6

    .line 24
    .line 25
    if-nez v2, :cond_2

    .line 26
    .line 27
    invoke-interface {v11, v0}, Landroidx/compose/runtime/Composer;->changed(I)Z

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
    or-int/2addr v2, v13

    .line 37
    goto :goto_1

    .line 38
    :cond_2
    move v2, v13

    .line 39
    :goto_1
    and-int/lit8 v3, v14, 0x2

    .line 40
    .line 41
    if-eqz v3, :cond_4

    .line 42
    .line 43
    or-int/lit8 v2, v2, 0x30

    .line 44
    .line 45
    :cond_3
    move-object/from16 v4, p1

    .line 46
    .line 47
    goto :goto_3

    .line 48
    :cond_4
    and-int/lit8 v4, v13, 0x30

    .line 49
    .line 50
    if-nez v4, :cond_3

    .line 51
    .line 52
    move-object/from16 v4, p1

    .line 53
    .line 54
    invoke-interface {v11, v4}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 55
    .line 56
    .line 57
    move-result v5

    .line 58
    if-eqz v5, :cond_5

    .line 59
    .line 60
    const/16 v5, 0x20

    .line 61
    .line 62
    goto :goto_2

    .line 63
    :cond_5
    const/16 v5, 0x10

    .line 64
    .line 65
    :goto_2
    or-int/2addr v2, v5

    .line 66
    :goto_3
    and-int/lit16 v5, v13, 0x180

    .line 67
    .line 68
    if-nez v5, :cond_8

    .line 69
    .line 70
    and-int/lit8 v5, v14, 0x4

    .line 71
    .line 72
    if-nez v5, :cond_6

    .line 73
    .line 74
    move-object/from16 v5, p2

    .line 75
    .line 76
    invoke-interface {v11, v5}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 77
    .line 78
    .line 79
    move-result v6

    .line 80
    if-eqz v6, :cond_7

    .line 81
    .line 82
    const/16 v6, 0x100

    .line 83
    .line 84
    goto :goto_4

    .line 85
    :cond_6
    move-object/from16 v5, p2

    .line 86
    .line 87
    :cond_7
    const/16 v6, 0x80

    .line 88
    .line 89
    :goto_4
    or-int/2addr v2, v6

    .line 90
    goto :goto_5

    .line 91
    :cond_8
    move-object/from16 v5, p2

    .line 92
    .line 93
    :goto_5
    and-int/lit16 v6, v13, 0xc00

    .line 94
    .line 95
    if-nez v6, :cond_b

    .line 96
    .line 97
    and-int/lit8 v6, v14, 0x8

    .line 98
    .line 99
    if-nez v6, :cond_9

    .line 100
    .line 101
    move-wide/from16 v6, p3

    .line 102
    .line 103
    invoke-interface {v11, v6, v7}, Landroidx/compose/runtime/Composer;->changed(J)Z

    .line 104
    .line 105
    .line 106
    move-result v8

    .line 107
    if-eqz v8, :cond_a

    .line 108
    .line 109
    const/16 v8, 0x800

    .line 110
    .line 111
    goto :goto_6

    .line 112
    :cond_9
    move-wide/from16 v6, p3

    .line 113
    .line 114
    :cond_a
    const/16 v8, 0x400

    .line 115
    .line 116
    :goto_6
    or-int/2addr v2, v8

    .line 117
    goto :goto_7

    .line 118
    :cond_b
    move-wide/from16 v6, p3

    .line 119
    .line 120
    :goto_7
    and-int/lit16 v8, v13, 0x6000

    .line 121
    .line 122
    if-nez v8, :cond_e

    .line 123
    .line 124
    and-int/lit8 v8, v14, 0x10

    .line 125
    .line 126
    if-nez v8, :cond_c

    .line 127
    .line 128
    move-wide/from16 v8, p5

    .line 129
    .line 130
    invoke-interface {v11, v8, v9}, Landroidx/compose/runtime/Composer;->changed(J)Z

    .line 131
    .line 132
    .line 133
    move-result v10

    .line 134
    if-eqz v10, :cond_d

    .line 135
    .line 136
    const/16 v10, 0x4000

    .line 137
    .line 138
    goto :goto_8

    .line 139
    :cond_c
    move-wide/from16 v8, p5

    .line 140
    .line 141
    :cond_d
    const/16 v10, 0x2000

    .line 142
    .line 143
    :goto_8
    or-int/2addr v2, v10

    .line 144
    goto :goto_9

    .line 145
    :cond_e
    move-wide/from16 v8, p5

    .line 146
    .line 147
    :goto_9
    and-int/lit8 v10, v14, 0x20

    .line 148
    .line 149
    const/high16 v12, 0x30000

    .line 150
    .line 151
    if-eqz v10, :cond_10

    .line 152
    .line 153
    or-int/2addr v2, v12

    .line 154
    :cond_f
    move/from16 v12, p7

    .line 155
    .line 156
    goto :goto_b

    .line 157
    :cond_10
    and-int/2addr v12, v13

    .line 158
    if-nez v12, :cond_f

    .line 159
    .line 160
    move/from16 v12, p7

    .line 161
    .line 162
    invoke-interface {v11, v12}, Landroidx/compose/runtime/Composer;->changed(F)Z

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
    and-int/lit8 v15, v14, 0x40

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
    move-object/from16 v1, p8

    .line 183
    .line 184
    goto :goto_d

    .line 185
    :cond_12
    and-int v16, v13, v16

    .line 186
    .line 187
    move-object/from16 v1, p8

    .line 188
    .line 189
    if-nez v16, :cond_14

    .line 190
    .line 191
    invoke-interface {v11, v1}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

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
    and-int/lit16 v1, v14, 0x80

    .line 205
    .line 206
    const/high16 v17, 0xc00000

    .line 207
    .line 208
    if-eqz v1, :cond_16

    .line 209
    .line 210
    or-int v2, v2, v17

    .line 211
    .line 212
    :cond_15
    move/from16 v17, v1

    .line 213
    .line 214
    move-object/from16 v1, p9

    .line 215
    .line 216
    goto :goto_f

    .line 217
    :cond_16
    and-int v17, v13, v17

    .line 218
    .line 219
    if-nez v17, :cond_15

    .line 220
    .line 221
    move/from16 v17, v1

    .line 222
    .line 223
    move-object/from16 v1, p9

    .line 224
    .line 225
    invoke-interface {v11, v1}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 226
    .line 227
    .line 228
    move-result v18

    .line 229
    if-eqz v18, :cond_17

    .line 230
    .line 231
    const/high16 v18, 0x800000

    .line 232
    .line 233
    goto :goto_e

    .line 234
    :cond_17
    const/high16 v18, 0x400000

    .line 235
    .line 236
    :goto_e
    or-int v2, v2, v18

    .line 237
    .line 238
    :goto_f
    and-int/lit16 v1, v14, 0x100

    .line 239
    .line 240
    const/high16 v18, 0x6000000

    .line 241
    .line 242
    if-eqz v1, :cond_19

    .line 243
    .line 244
    or-int v2, v2, v18

    .line 245
    .line 246
    :cond_18
    move-object/from16 v1, p10

    .line 247
    .line 248
    goto :goto_11

    .line 249
    :cond_19
    and-int v1, v13, v18

    .line 250
    .line 251
    if-nez v1, :cond_18

    .line 252
    .line 253
    move-object/from16 v1, p10

    .line 254
    .line 255
    invoke-interface {v11, v1}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 256
    .line 257
    .line 258
    move-result v18

    .line 259
    if-eqz v18, :cond_1a

    .line 260
    .line 261
    const/high16 v18, 0x4000000

    .line 262
    .line 263
    goto :goto_10

    .line 264
    :cond_1a
    const/high16 v18, 0x2000000

    .line 265
    .line 266
    :goto_10
    or-int v2, v2, v18

    .line 267
    .line 268
    :goto_11
    const v18, 0x2492493

    .line 269
    .line 270
    .line 271
    and-int v1, v2, v18

    .line 272
    .line 273
    move/from16 p11, v3

    .line 274
    .line 275
    const v3, 0x2492492

    .line 276
    .line 277
    .line 278
    if-ne v1, v3, :cond_1c

    .line 279
    .line 280
    invoke-interface {v11}, Landroidx/compose/runtime/Composer;->getSkipping()Z

    .line 281
    .line 282
    .line 283
    move-result v1

    .line 284
    if-nez v1, :cond_1b

    .line 285
    .line 286
    goto :goto_12

    .line 287
    :cond_1b
    invoke-interface {v11}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    .line 288
    .line 289
    .line 290
    move-object/from16 v10, p9

    .line 291
    .line 292
    move-object v2, v4

    .line 293
    move-object v3, v5

    .line 294
    move-wide v4, v6

    .line 295
    move-wide v6, v8

    .line 296
    move v8, v12

    .line 297
    move-object/from16 v9, p8

    .line 298
    .line 299
    goto/16 :goto_17

    .line 300
    .line 301
    :cond_1c
    :goto_12
    invoke-interface {v11}, Landroidx/compose/runtime/Composer;->startDefaults()V

    .line 302
    .line 303
    .line 304
    and-int/lit8 v1, v13, 0x1

    .line 305
    .line 306
    const v3, -0xe001

    .line 307
    .line 308
    .line 309
    if-eqz v1, :cond_21

    .line 310
    .line 311
    invoke-interface {v11}, Landroidx/compose/runtime/Composer;->getDefaultsInvalid()Z

    .line 312
    .line 313
    .line 314
    move-result v1

    .line 315
    if-eqz v1, :cond_1d

    .line 316
    .line 317
    goto :goto_13

    .line 318
    :cond_1d
    invoke-interface {v11}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    .line 319
    .line 320
    .line 321
    and-int/lit8 v1, v14, 0x4

    .line 322
    .line 323
    if-eqz v1, :cond_1e

    .line 324
    .line 325
    and-int/lit16 v2, v2, -0x381

    .line 326
    .line 327
    :cond_1e
    and-int/lit8 v1, v14, 0x8

    .line 328
    .line 329
    if-eqz v1, :cond_1f

    .line 330
    .line 331
    and-int/lit16 v2, v2, -0x1c01

    .line 332
    .line 333
    :cond_1f
    and-int/lit8 v1, v14, 0x10

    .line 334
    .line 335
    if-eqz v1, :cond_20

    .line 336
    .line 337
    and-int/2addr v2, v3

    .line 338
    :cond_20
    move v10, v2

    .line 339
    move-object v1, v4

    .line 340
    move-wide v2, v6

    .line 341
    move v6, v12

    .line 342
    move-object v7, v5

    .line 343
    move-wide v4, v8

    .line 344
    move-object/from16 v8, p8

    .line 345
    .line 346
    move-object/from16 v9, p9

    .line 347
    .line 348
    goto/16 :goto_16

    .line 349
    .line 350
    :cond_21
    :goto_13
    if-eqz p11, :cond_22

    .line 351
    .line 352
    sget-object v1, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    .line 353
    .line 354
    move-object v4, v1

    .line 355
    :cond_22
    and-int/lit8 v1, v14, 0x4

    .line 356
    .line 357
    move/from16 p11, v3

    .line 358
    .line 359
    const/4 v3, 0x1

    .line 360
    if-eqz v1, :cond_23

    .line 361
    .line 362
    const/4 v1, 0x0

    .line 363
    invoke-static {v1, v11, v1, v3}, Landroidx/compose/foundation/ScrollKt;->rememberScrollState(ILandroidx/compose/runtime/Composer;II)Landroidx/compose/foundation/ScrollState;

    .line 364
    .line 365
    .line 366
    move-result-object v1

    .line 367
    and-int/lit16 v2, v2, -0x381

    .line 368
    .line 369
    move-object v5, v1

    .line 370
    :cond_23
    and-int/lit8 v1, v14, 0x8

    .line 371
    .line 372
    const/4 v3, 0x6

    .line 373
    if-eqz v1, :cond_24

    .line 374
    .line 375
    sget-object v1, Landroidx/compose/material3/TabRowDefaults;->INSTANCE:Landroidx/compose/material3/TabRowDefaults;

    .line 376
    .line 377
    invoke-virtual {v1, v11, v3}, Landroidx/compose/material3/TabRowDefaults;->getPrimaryContainerColor(Landroidx/compose/runtime/Composer;I)J

    .line 378
    .line 379
    .line 380
    move-result-wide v6

    .line 381
    and-int/lit16 v2, v2, -0x1c01

    .line 382
    .line 383
    :cond_24
    and-int/lit8 v1, v14, 0x10

    .line 384
    .line 385
    if-eqz v1, :cond_25

    .line 386
    .line 387
    sget-object v1, Landroidx/compose/material3/TabRowDefaults;->INSTANCE:Landroidx/compose/material3/TabRowDefaults;

    .line 388
    .line 389
    invoke-virtual {v1, v11, v3}, Landroidx/compose/material3/TabRowDefaults;->getPrimaryContentColor(Landroidx/compose/runtime/Composer;I)J

    .line 390
    .line 391
    .line 392
    move-result-wide v8

    .line 393
    and-int v1, v2, p11

    .line 394
    .line 395
    move v2, v1

    .line 396
    :cond_25
    if-eqz v10, :cond_26

    .line 397
    .line 398
    sget-object v1, Landroidx/compose/material3/TabRowDefaults;->INSTANCE:Landroidx/compose/material3/TabRowDefaults;

    .line 399
    .line 400
    invoke-virtual {v1}, Landroidx/compose/material3/TabRowDefaults;->getScrollableTabRowEdgeStartPadding-D9Ej5fM()F

    .line 401
    .line 402
    .line 403
    move-result v1

    .line 404
    move v12, v1

    .line 405
    :cond_26
    if-eqz v15, :cond_27

    .line 406
    .line 407
    new-instance v1, Landroidx/compose/material3/TabRowKt$PrimaryScrollableTabRow$1;

    .line 408
    .line 409
    invoke-direct {v1, v0}, Landroidx/compose/material3/TabRowKt$PrimaryScrollableTabRow$1;-><init>(I)V

    .line 410
    .line 411
    .line 412
    const/16 v3, 0x36

    .line 413
    .line 414
    const v10, 0x5f79d798

    .line 415
    .line 416
    .line 417
    const/4 v15, 0x1

    .line 418
    invoke-static {v10, v15, v1, v11, v3}, Landroidx/compose/runtime/internal/ComposableLambdaKt;->rememberComposableLambda(IZLjava/lang/Object;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/internal/ComposableLambda;

    .line 419
    .line 420
    .line 421
    move-result-object v1

    .line 422
    goto :goto_14

    .line 423
    :cond_27
    move-object/from16 v1, p8

    .line 424
    .line 425
    :goto_14
    if-eqz v17, :cond_28

    .line 426
    .line 427
    sget-object v3, Landroidx/compose/material3/ComposableSingletons$TabRowKt;->INSTANCE:Landroidx/compose/material3/ComposableSingletons$TabRowKt;

    .line 428
    .line 429
    invoke-virtual {v3}, Landroidx/compose/material3/ComposableSingletons$TabRowKt;->getLambda-4$material3_release()Lkotlin/jvm/functions/Function2;

    .line 430
    .line 431
    .line 432
    move-result-object v3

    .line 433
    move v10, v2

    .line 434
    move-wide/from16 v19, v8

    .line 435
    .line 436
    move-object v8, v1

    .line 437
    move-object v9, v3

    .line 438
    move-object v1, v4

    .line 439
    move-wide v2, v6

    .line 440
    move v6, v12

    .line 441
    move-object v7, v5

    .line 442
    :goto_15
    move-wide/from16 v4, v19

    .line 443
    .line 444
    goto :goto_16

    .line 445
    :cond_28
    move v10, v2

    .line 446
    move-wide v2, v6

    .line 447
    move v6, v12

    .line 448
    move-object v7, v5

    .line 449
    move-wide/from16 v19, v8

    .line 450
    .line 451
    move-object/from16 v9, p9

    .line 452
    .line 453
    move-object v8, v1

    .line 454
    move-object v1, v4

    .line 455
    goto :goto_15

    .line 456
    :goto_16
    invoke-interface {v11}, Landroidx/compose/runtime/Composer;->endDefaults()V

    .line 457
    .line 458
    .line 459
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 460
    .line 461
    .line 462
    move-result v12

    .line 463
    if-eqz v12, :cond_29

    .line 464
    .line 465
    const/4 v12, -0x1

    .line 466
    const-string/jumbo v15, "androidx.compose.material3.PrimaryScrollableTabRow (TabRow.kt:371)"

    .line 467
    .line 468
    .line 469
    const v0, -0x6918ec99

    .line 470
    .line 471
    .line 472
    invoke-static {v0, v10, v12, v15}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 473
    .line 474
    .line 475
    :cond_29
    and-int/lit8 v0, v10, 0x7e

    .line 476
    .line 477
    shr-int/lit8 v12, v10, 0x3

    .line 478
    .line 479
    and-int/lit16 v15, v12, 0x380

    .line 480
    .line 481
    or-int/2addr v0, v15

    .line 482
    and-int/lit16 v15, v12, 0x1c00

    .line 483
    .line 484
    or-int/2addr v0, v15

    .line 485
    const v15, 0xe000

    .line 486
    .line 487
    .line 488
    and-int/2addr v12, v15

    .line 489
    or-int/2addr v0, v12

    .line 490
    shl-int/lit8 v12, v10, 0x9

    .line 491
    .line 492
    const/high16 v15, 0x70000

    .line 493
    .line 494
    and-int/2addr v12, v15

    .line 495
    or-int/2addr v0, v12

    .line 496
    const/high16 v12, 0x380000

    .line 497
    .line 498
    and-int/2addr v12, v10

    .line 499
    or-int/2addr v0, v12

    .line 500
    const/high16 v12, 0x1c00000

    .line 501
    .line 502
    and-int/2addr v12, v10

    .line 503
    or-int/2addr v0, v12

    .line 504
    const/high16 v12, 0xe000000

    .line 505
    .line 506
    and-int/2addr v10, v12

    .line 507
    or-int v12, v0, v10

    .line 508
    .line 509
    move/from16 v0, p0

    .line 510
    .line 511
    move-object/from16 v10, p10

    .line 512
    .line 513
    invoke-static/range {v0 .. v12}, Landroidx/compose/material3/TabRowKt;->ScrollableTabRowImpl-sKfQg0A(ILandroidx/compose/ui/Modifier;JJFLandroidx/compose/foundation/ScrollState;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V

    .line 514
    .line 515
    .line 516
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 517
    .line 518
    .line 519
    move-result v0

    .line 520
    if-eqz v0, :cond_2a

    .line 521
    .line 522
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 523
    .line 524
    .line 525
    :cond_2a
    move-object v10, v9

    .line 526
    move-object v9, v8

    .line 527
    move v8, v6

    .line 528
    move-wide/from16 v19, v2

    .line 529
    .line 530
    move-object v2, v1

    .line 531
    move-object v3, v7

    .line 532
    move-wide v6, v4

    .line 533
    move-wide/from16 v4, v19

    .line 534
    .line 535
    :goto_17
    invoke-interface {v11}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    .line 536
    .line 537
    .line 538
    move-result-object v15

    .line 539
    if-eqz v15, :cond_2b

    .line 540
    .line 541
    new-instance v0, Landroidx/compose/material3/TabRowKt$PrimaryScrollableTabRow$2;

    .line 542
    .line 543
    move/from16 v1, p0

    .line 544
    .line 545
    move-object/from16 v11, p10

    .line 546
    .line 547
    move v12, v13

    .line 548
    move v13, v14

    .line 549
    invoke-direct/range {v0 .. v13}, Landroidx/compose/material3/TabRowKt$PrimaryScrollableTabRow$2;-><init>(ILandroidx/compose/ui/Modifier;Landroidx/compose/foundation/ScrollState;JJFLkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;II)V

    .line 550
    .line 551
    .line 552
    invoke-interface {v15, v0}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lkotlin/jvm/functions/Function2;)V

    .line 553
    .line 554
    .line 555
    :cond_2b
    return-void
.end method

.method public static final PrimaryTabRow-pAZo6Ak(ILandroidx/compose/ui/Modifier;JJLkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V
    .locals 21
    .annotation build Landroidx/compose/material3/ExperimentalMaterial3Api;
    .end annotation

    .annotation build Landroidx/compose/runtime/Composable;
    .end annotation

    .annotation build Landroidx/compose/runtime/ComposableInferredTarget;
        scheme = "[androidx.compose.ui.UiComposable[_][_][_]]"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Landroidx/compose/ui/Modifier;",
            "JJ",
            "Lkotlin/jvm/functions/Function3<",
            "-",
            "Landroidx/compose/material3/TabIndicatorScope;",
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
    const v0, -0x70579254

    .line 6
    .line 7
    .line 8
    move-object/from16 v2, p9

    .line 9
    .line 10
    invoke-interface {v2, v0}, Landroidx/compose/runtime/Composer;->startRestartGroup(I)Landroidx/compose/runtime/Composer;

    .line 11
    .line 12
    .line 13
    move-result-object v2

    .line 14
    and-int/lit8 v3, p11, 0x1

    .line 15
    .line 16
    if-eqz v3, :cond_0

    .line 17
    .line 18
    or-int/lit8 v3, v10, 0x6

    .line 19
    .line 20
    goto :goto_1

    .line 21
    :cond_0
    and-int/lit8 v3, v10, 0x6

    .line 22
    .line 23
    if-nez v3, :cond_2

    .line 24
    .line 25
    invoke-interface {v2, v1}, Landroidx/compose/runtime/Composer;->changed(I)Z

    .line 26
    .line 27
    .line 28
    move-result v3

    .line 29
    if-eqz v3, :cond_1

    .line 30
    .line 31
    const/4 v3, 0x4

    .line 32
    goto :goto_0

    .line 33
    :cond_1
    const/4 v3, 0x2

    .line 34
    :goto_0
    or-int/2addr v3, v10

    .line 35
    goto :goto_1

    .line 36
    :cond_2
    move v3, v10

    .line 37
    :goto_1
    and-int/lit8 v4, p11, 0x2

    .line 38
    .line 39
    if-eqz v4, :cond_4

    .line 40
    .line 41
    or-int/lit8 v3, v3, 0x30

    .line 42
    .line 43
    :cond_3
    move-object/from16 v5, p1

    .line 44
    .line 45
    goto :goto_3

    .line 46
    :cond_4
    and-int/lit8 v5, v10, 0x30

    .line 47
    .line 48
    if-nez v5, :cond_3

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
    if-eqz v6, :cond_5

    .line 57
    .line 58
    const/16 v6, 0x20

    .line 59
    .line 60
    goto :goto_2

    .line 61
    :cond_5
    const/16 v6, 0x10

    .line 62
    .line 63
    :goto_2
    or-int/2addr v3, v6

    .line 64
    :goto_3
    and-int/lit16 v6, v10, 0x180

    .line 65
    .line 66
    if-nez v6, :cond_8

    .line 67
    .line 68
    and-int/lit8 v6, p11, 0x4

    .line 69
    .line 70
    if-nez v6, :cond_6

    .line 71
    .line 72
    move-wide/from16 v6, p2

    .line 73
    .line 74
    invoke-interface {v2, v6, v7}, Landroidx/compose/runtime/Composer;->changed(J)Z

    .line 75
    .line 76
    .line 77
    move-result v8

    .line 78
    if-eqz v8, :cond_7

    .line 79
    .line 80
    const/16 v8, 0x100

    .line 81
    .line 82
    goto :goto_4

    .line 83
    :cond_6
    move-wide/from16 v6, p2

    .line 84
    .line 85
    :cond_7
    const/16 v8, 0x80

    .line 86
    .line 87
    :goto_4
    or-int/2addr v3, v8

    .line 88
    goto :goto_5

    .line 89
    :cond_8
    move-wide/from16 v6, p2

    .line 90
    .line 91
    :goto_5
    and-int/lit16 v8, v10, 0xc00

    .line 92
    .line 93
    if-nez v8, :cond_b

    .line 94
    .line 95
    and-int/lit8 v8, p11, 0x8

    .line 96
    .line 97
    if-nez v8, :cond_9

    .line 98
    .line 99
    move-wide/from16 v8, p4

    .line 100
    .line 101
    invoke-interface {v2, v8, v9}, Landroidx/compose/runtime/Composer;->changed(J)Z

    .line 102
    .line 103
    .line 104
    move-result v11

    .line 105
    if-eqz v11, :cond_a

    .line 106
    .line 107
    const/16 v11, 0x800

    .line 108
    .line 109
    goto :goto_6

    .line 110
    :cond_9
    move-wide/from16 v8, p4

    .line 111
    .line 112
    :cond_a
    const/16 v11, 0x400

    .line 113
    .line 114
    :goto_6
    or-int/2addr v3, v11

    .line 115
    goto :goto_7

    .line 116
    :cond_b
    move-wide/from16 v8, p4

    .line 117
    .line 118
    :goto_7
    and-int/lit8 v11, p11, 0x10

    .line 119
    .line 120
    if-eqz v11, :cond_d

    .line 121
    .line 122
    or-int/lit16 v3, v3, 0x6000

    .line 123
    .line 124
    :cond_c
    move-object/from16 v12, p6

    .line 125
    .line 126
    goto :goto_9

    .line 127
    :cond_d
    and-int/lit16 v12, v10, 0x6000

    .line 128
    .line 129
    if-nez v12, :cond_c

    .line 130
    .line 131
    move-object/from16 v12, p6

    .line 132
    .line 133
    invoke-interface {v2, v12}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 134
    .line 135
    .line 136
    move-result v13

    .line 137
    if-eqz v13, :cond_e

    .line 138
    .line 139
    const/16 v13, 0x4000

    .line 140
    .line 141
    goto :goto_8

    .line 142
    :cond_e
    const/16 v13, 0x2000

    .line 143
    .line 144
    :goto_8
    or-int/2addr v3, v13

    .line 145
    :goto_9
    and-int/lit8 v13, p11, 0x20

    .line 146
    .line 147
    const/high16 v14, 0x30000

    .line 148
    .line 149
    if-eqz v13, :cond_10

    .line 150
    .line 151
    or-int/2addr v3, v14

    .line 152
    :cond_f
    move-object/from16 v14, p7

    .line 153
    .line 154
    goto :goto_b

    .line 155
    :cond_10
    and-int/2addr v14, v10

    .line 156
    if-nez v14, :cond_f

    .line 157
    .line 158
    move-object/from16 v14, p7

    .line 159
    .line 160
    invoke-interface {v2, v14}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 161
    .line 162
    .line 163
    move-result v15

    .line 164
    if-eqz v15, :cond_11

    .line 165
    .line 166
    const/high16 v15, 0x20000

    .line 167
    .line 168
    goto :goto_a

    .line 169
    :cond_11
    const/high16 v15, 0x10000

    .line 170
    .line 171
    :goto_a
    or-int/2addr v3, v15

    .line 172
    :goto_b
    and-int/lit8 v15, p11, 0x40

    .line 173
    .line 174
    const/high16 v16, 0x180000

    .line 175
    .line 176
    if-eqz v15, :cond_13

    .line 177
    .line 178
    or-int v3, v3, v16

    .line 179
    .line 180
    :cond_12
    move-object/from16 v15, p8

    .line 181
    .line 182
    goto :goto_d

    .line 183
    :cond_13
    and-int v15, v10, v16

    .line 184
    .line 185
    if-nez v15, :cond_12

    .line 186
    .line 187
    move-object/from16 v15, p8

    .line 188
    .line 189
    invoke-interface {v2, v15}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 190
    .line 191
    .line 192
    move-result v16

    .line 193
    if-eqz v16, :cond_14

    .line 194
    .line 195
    const/high16 v16, 0x100000

    .line 196
    .line 197
    goto :goto_c

    .line 198
    :cond_14
    const/high16 v16, 0x80000

    .line 199
    .line 200
    :goto_c
    or-int v3, v3, v16

    .line 201
    .line 202
    :goto_d
    const v16, 0x92493

    .line 203
    .line 204
    .line 205
    and-int v0, v3, v16

    .line 206
    .line 207
    move/from16 p9, v4

    .line 208
    .line 209
    const v4, 0x92492

    .line 210
    .line 211
    .line 212
    if-ne v0, v4, :cond_16

    .line 213
    .line 214
    invoke-interface {v2}, Landroidx/compose/runtime/Composer;->getSkipping()Z

    .line 215
    .line 216
    .line 217
    move-result v0

    .line 218
    if-nez v0, :cond_15

    .line 219
    .line 220
    goto :goto_e

    .line 221
    :cond_15
    invoke-interface {v2}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    .line 222
    .line 223
    .line 224
    move-object/from16 v19, v2

    .line 225
    .line 226
    move-object v2, v5

    .line 227
    move-wide v3, v6

    .line 228
    move-wide v5, v8

    .line 229
    move-object v7, v12

    .line 230
    move-object v8, v14

    .line 231
    goto/16 :goto_11

    .line 232
    .line 233
    :cond_16
    :goto_e
    invoke-interface {v2}, Landroidx/compose/runtime/Composer;->startDefaults()V

    .line 234
    .line 235
    .line 236
    and-int/lit8 v0, v10, 0x1

    .line 237
    .line 238
    if-eqz v0, :cond_1a

    .line 239
    .line 240
    invoke-interface {v2}, Landroidx/compose/runtime/Composer;->getDefaultsInvalid()Z

    .line 241
    .line 242
    .line 243
    move-result v0

    .line 244
    if-eqz v0, :cond_17

    .line 245
    .line 246
    goto :goto_f

    .line 247
    :cond_17
    invoke-interface {v2}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    .line 248
    .line 249
    .line 250
    and-int/lit8 v0, p11, 0x4

    .line 251
    .line 252
    if-eqz v0, :cond_18

    .line 253
    .line 254
    and-int/lit16 v3, v3, -0x381

    .line 255
    .line 256
    :cond_18
    and-int/lit8 v0, p11, 0x8

    .line 257
    .line 258
    if-eqz v0, :cond_19

    .line 259
    .line 260
    and-int/lit16 v3, v3, -0x1c01

    .line 261
    .line 262
    :cond_19
    move-object v11, v5

    .line 263
    move-object/from16 v16, v12

    .line 264
    .line 265
    move-object/from16 v17, v14

    .line 266
    .line 267
    const v0, -0x70579254

    .line 268
    .line 269
    .line 270
    move-wide v12, v6

    .line 271
    move-wide v14, v8

    .line 272
    goto :goto_10

    .line 273
    :cond_1a
    :goto_f
    if-eqz p9, :cond_1b

    .line 274
    .line 275
    sget-object v0, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    .line 276
    .line 277
    move-object v5, v0

    .line 278
    :cond_1b
    and-int/lit8 v0, p11, 0x4

    .line 279
    .line 280
    const/4 v4, 0x6

    .line 281
    if-eqz v0, :cond_1c

    .line 282
    .line 283
    sget-object v0, Landroidx/compose/material3/TabRowDefaults;->INSTANCE:Landroidx/compose/material3/TabRowDefaults;

    .line 284
    .line 285
    invoke-virtual {v0, v2, v4}, Landroidx/compose/material3/TabRowDefaults;->getPrimaryContainerColor(Landroidx/compose/runtime/Composer;I)J

    .line 286
    .line 287
    .line 288
    move-result-wide v6

    .line 289
    and-int/lit16 v3, v3, -0x381

    .line 290
    .line 291
    :cond_1c
    and-int/lit8 v0, p11, 0x8

    .line 292
    .line 293
    if-eqz v0, :cond_1d

    .line 294
    .line 295
    sget-object v0, Landroidx/compose/material3/TabRowDefaults;->INSTANCE:Landroidx/compose/material3/TabRowDefaults;

    .line 296
    .line 297
    invoke-virtual {v0, v2, v4}, Landroidx/compose/material3/TabRowDefaults;->getPrimaryContentColor(Landroidx/compose/runtime/Composer;I)J

    .line 298
    .line 299
    .line 300
    move-result-wide v8

    .line 301
    and-int/lit16 v0, v3, -0x1c01

    .line 302
    .line 303
    move v3, v0

    .line 304
    :cond_1d
    if-eqz v11, :cond_1e

    .line 305
    .line 306
    new-instance v0, Landroidx/compose/material3/TabRowKt$PrimaryTabRow$1;

    .line 307
    .line 308
    invoke-direct {v0, v1}, Landroidx/compose/material3/TabRowKt$PrimaryTabRow$1;-><init>(I)V

    .line 309
    .line 310
    .line 311
    const/16 v4, 0x36

    .line 312
    .line 313
    const v11, -0x7876c3a5

    .line 314
    .line 315
    .line 316
    const/4 v12, 0x1

    .line 317
    invoke-static {v11, v12, v0, v2, v4}, Landroidx/compose/runtime/internal/ComposableLambdaKt;->rememberComposableLambda(IZLjava/lang/Object;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/internal/ComposableLambda;

    .line 318
    .line 319
    .line 320
    move-result-object v0

    .line 321
    move-object v12, v0

    .line 322
    :cond_1e
    if-eqz v13, :cond_19

    .line 323
    .line 324
    sget-object v0, Landroidx/compose/material3/ComposableSingletons$TabRowKt;->INSTANCE:Landroidx/compose/material3/ComposableSingletons$TabRowKt;

    .line 325
    .line 326
    invoke-virtual {v0}, Landroidx/compose/material3/ComposableSingletons$TabRowKt;->getLambda-1$material3_release()Lkotlin/jvm/functions/Function2;

    .line 327
    .line 328
    .line 329
    move-result-object v0

    .line 330
    move-object/from16 v17, v0

    .line 331
    .line 332
    move-object v11, v5

    .line 333
    move-wide v14, v8

    .line 334
    move-object/from16 v16, v12

    .line 335
    .line 336
    const v0, -0x70579254

    .line 337
    .line 338
    .line 339
    move-wide v12, v6

    .line 340
    :goto_10
    invoke-interface {v2}, Landroidx/compose/runtime/Composer;->endDefaults()V

    .line 341
    .line 342
    .line 343
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 344
    .line 345
    .line 346
    move-result v4

    .line 347
    if-eqz v4, :cond_1f

    .line 348
    .line 349
    const/4 v4, -0x1

    .line 350
    const-string/jumbo v5, "androidx.compose.material3.PrimaryTabRow (TabRow.kt:165)"

    .line 351
    .line 352
    .line 353
    invoke-static {v0, v3, v4, v5}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 354
    .line 355
    .line 356
    :cond_1f
    shr-int/lit8 v0, v3, 0x3

    .line 357
    .line 358
    const v3, 0x7fffe

    .line 359
    .line 360
    .line 361
    and-int v20, v0, v3

    .line 362
    .line 363
    move-object/from16 v18, p8

    .line 364
    .line 365
    move-object/from16 v19, v2

    .line 366
    .line 367
    invoke-static/range {v11 .. v20}, Landroidx/compose/material3/TabRowKt;->TabRowImpl-DTcfvLk(Landroidx/compose/ui/Modifier;JJLkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V

    .line 368
    .line 369
    .line 370
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 371
    .line 372
    .line 373
    move-result v0

    .line 374
    if-eqz v0, :cond_20

    .line 375
    .line 376
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 377
    .line 378
    .line 379
    :cond_20
    move-object v2, v11

    .line 380
    move-wide v3, v12

    .line 381
    move-wide v5, v14

    .line 382
    move-object/from16 v7, v16

    .line 383
    .line 384
    move-object/from16 v8, v17

    .line 385
    .line 386
    :goto_11
    invoke-interface/range {v19 .. v19}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    .line 387
    .line 388
    .line 389
    move-result-object v12

    .line 390
    if-eqz v12, :cond_21

    .line 391
    .line 392
    new-instance v0, Landroidx/compose/material3/TabRowKt$PrimaryTabRow$2;

    .line 393
    .line 394
    move-object/from16 v9, p8

    .line 395
    .line 396
    move/from16 v11, p11

    .line 397
    .line 398
    invoke-direct/range {v0 .. v11}, Landroidx/compose/material3/TabRowKt$PrimaryTabRow$2;-><init>(ILandroidx/compose/ui/Modifier;JJLkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;II)V

    .line 399
    .line 400
    .line 401
    invoke-interface {v12, v0}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lkotlin/jvm/functions/Function2;)V

    .line 402
    .line 403
    .line 404
    :cond_21
    return-void
.end method

.method public static final ScrollableTabRow-sKfQg0A(ILandroidx/compose/ui/Modifier;JJFLkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V
    .locals 19
    .annotation build Landroidx/compose/runtime/Composable;
    .end annotation

    .annotation build Landroidx/compose/runtime/ComposableInferredTarget;
        scheme = "[androidx.compose.ui.UiComposable[_][_][_]]"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Landroidx/compose/ui/Modifier;",
            "JJF",
            "Lkotlin/jvm/functions/Function3<",
            "-",
            "Ljava/util/List<",
            "Landroidx/compose/material3/TabPosition;",
            ">;-",
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
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    .line 1
    move/from16 v0, p0

    .line 2
    .line 3
    move/from16 v14, p11

    .line 4
    .line 5
    move/from16 v15, p12

    .line 6
    .line 7
    const v1, -0x1dac254b

    .line 8
    .line 9
    .line 10
    move-object/from16 v2, p10

    .line 11
    .line 12
    invoke-interface {v2, v1}, Landroidx/compose/runtime/Composer;->startRestartGroup(I)Landroidx/compose/runtime/Composer;

    .line 13
    .line 14
    .line 15
    move-result-object v11

    .line 16
    and-int/lit8 v2, v15, 0x1

    .line 17
    .line 18
    if-eqz v2, :cond_0

    .line 19
    .line 20
    or-int/lit8 v2, v14, 0x6

    .line 21
    .line 22
    goto :goto_1

    .line 23
    :cond_0
    and-int/lit8 v2, v14, 0x6

    .line 24
    .line 25
    if-nez v2, :cond_2

    .line 26
    .line 27
    invoke-interface {v11, v0}, Landroidx/compose/runtime/Composer;->changed(I)Z

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
    or-int/2addr v2, v14

    .line 37
    goto :goto_1

    .line 38
    :cond_2
    move v2, v14

    .line 39
    :goto_1
    and-int/lit8 v3, v15, 0x2

    .line 40
    .line 41
    if-eqz v3, :cond_4

    .line 42
    .line 43
    or-int/lit8 v2, v2, 0x30

    .line 44
    .line 45
    :cond_3
    move-object/from16 v4, p1

    .line 46
    .line 47
    goto :goto_3

    .line 48
    :cond_4
    and-int/lit8 v4, v14, 0x30

    .line 49
    .line 50
    if-nez v4, :cond_3

    .line 51
    .line 52
    move-object/from16 v4, p1

    .line 53
    .line 54
    invoke-interface {v11, v4}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 55
    .line 56
    .line 57
    move-result v5

    .line 58
    if-eqz v5, :cond_5

    .line 59
    .line 60
    const/16 v5, 0x20

    .line 61
    .line 62
    goto :goto_2

    .line 63
    :cond_5
    const/16 v5, 0x10

    .line 64
    .line 65
    :goto_2
    or-int/2addr v2, v5

    .line 66
    :goto_3
    and-int/lit16 v5, v14, 0x180

    .line 67
    .line 68
    if-nez v5, :cond_8

    .line 69
    .line 70
    and-int/lit8 v5, v15, 0x4

    .line 71
    .line 72
    if-nez v5, :cond_6

    .line 73
    .line 74
    move-wide/from16 v5, p2

    .line 75
    .line 76
    invoke-interface {v11, v5, v6}, Landroidx/compose/runtime/Composer;->changed(J)Z

    .line 77
    .line 78
    .line 79
    move-result v7

    .line 80
    if-eqz v7, :cond_7

    .line 81
    .line 82
    const/16 v7, 0x100

    .line 83
    .line 84
    goto :goto_4

    .line 85
    :cond_6
    move-wide/from16 v5, p2

    .line 86
    .line 87
    :cond_7
    const/16 v7, 0x80

    .line 88
    .line 89
    :goto_4
    or-int/2addr v2, v7

    .line 90
    goto :goto_5

    .line 91
    :cond_8
    move-wide/from16 v5, p2

    .line 92
    .line 93
    :goto_5
    and-int/lit16 v7, v14, 0xc00

    .line 94
    .line 95
    if-nez v7, :cond_b

    .line 96
    .line 97
    and-int/lit8 v7, v15, 0x8

    .line 98
    .line 99
    if-nez v7, :cond_9

    .line 100
    .line 101
    move-wide/from16 v7, p4

    .line 102
    .line 103
    invoke-interface {v11, v7, v8}, Landroidx/compose/runtime/Composer;->changed(J)Z

    .line 104
    .line 105
    .line 106
    move-result v9

    .line 107
    if-eqz v9, :cond_a

    .line 108
    .line 109
    const/16 v9, 0x800

    .line 110
    .line 111
    goto :goto_6

    .line 112
    :cond_9
    move-wide/from16 v7, p4

    .line 113
    .line 114
    :cond_a
    const/16 v9, 0x400

    .line 115
    .line 116
    :goto_6
    or-int/2addr v2, v9

    .line 117
    goto :goto_7

    .line 118
    :cond_b
    move-wide/from16 v7, p4

    .line 119
    .line 120
    :goto_7
    and-int/lit8 v9, v15, 0x10

    .line 121
    .line 122
    if-eqz v9, :cond_d

    .line 123
    .line 124
    or-int/lit16 v2, v2, 0x6000

    .line 125
    .line 126
    :cond_c
    move/from16 v10, p6

    .line 127
    .line 128
    goto :goto_9

    .line 129
    :cond_d
    and-int/lit16 v10, v14, 0x6000

    .line 130
    .line 131
    if-nez v10, :cond_c

    .line 132
    .line 133
    move/from16 v10, p6

    .line 134
    .line 135
    invoke-interface {v11, v10}, Landroidx/compose/runtime/Composer;->changed(F)Z

    .line 136
    .line 137
    .line 138
    move-result v12

    .line 139
    if-eqz v12, :cond_e

    .line 140
    .line 141
    const/16 v12, 0x4000

    .line 142
    .line 143
    goto :goto_8

    .line 144
    :cond_e
    const/16 v12, 0x2000

    .line 145
    .line 146
    :goto_8
    or-int/2addr v2, v12

    .line 147
    :goto_9
    and-int/lit8 v12, v15, 0x20

    .line 148
    .line 149
    const/high16 v13, 0x30000

    .line 150
    .line 151
    if-eqz v12, :cond_10

    .line 152
    .line 153
    or-int/2addr v2, v13

    .line 154
    :cond_f
    move-object/from16 v13, p7

    .line 155
    .line 156
    goto :goto_b

    .line 157
    :cond_10
    and-int/2addr v13, v14

    .line 158
    if-nez v13, :cond_f

    .line 159
    .line 160
    move-object/from16 v13, p7

    .line 161
    .line 162
    invoke-interface {v11, v13}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 163
    .line 164
    .line 165
    move-result v16

    .line 166
    if-eqz v16, :cond_11

    .line 167
    .line 168
    const/high16 v16, 0x20000

    .line 169
    .line 170
    goto :goto_a

    .line 171
    :cond_11
    const/high16 v16, 0x10000

    .line 172
    .line 173
    :goto_a
    or-int v2, v2, v16

    .line 174
    .line 175
    :goto_b
    and-int/lit8 v16, v15, 0x40

    .line 176
    .line 177
    const/high16 v17, 0x180000

    .line 178
    .line 179
    if-eqz v16, :cond_12

    .line 180
    .line 181
    or-int v2, v2, v17

    .line 182
    .line 183
    move-object/from16 v1, p8

    .line 184
    .line 185
    goto :goto_d

    .line 186
    :cond_12
    and-int v17, v14, v17

    .line 187
    .line 188
    move-object/from16 v1, p8

    .line 189
    .line 190
    if-nez v17, :cond_14

    .line 191
    .line 192
    invoke-interface {v11, v1}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 193
    .line 194
    .line 195
    move-result v18

    .line 196
    if-eqz v18, :cond_13

    .line 197
    .line 198
    const/high16 v18, 0x100000

    .line 199
    .line 200
    goto :goto_c

    .line 201
    :cond_13
    const/high16 v18, 0x80000

    .line 202
    .line 203
    :goto_c
    or-int v2, v2, v18

    .line 204
    .line 205
    :cond_14
    :goto_d
    and-int/lit16 v1, v15, 0x80

    .line 206
    .line 207
    const/high16 v18, 0xc00000

    .line 208
    .line 209
    if-eqz v1, :cond_16

    .line 210
    .line 211
    or-int v2, v2, v18

    .line 212
    .line 213
    :cond_15
    move-object/from16 v1, p9

    .line 214
    .line 215
    goto :goto_f

    .line 216
    :cond_16
    and-int v1, v14, v18

    .line 217
    .line 218
    if-nez v1, :cond_15

    .line 219
    .line 220
    move-object/from16 v1, p9

    .line 221
    .line 222
    invoke-interface {v11, v1}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 223
    .line 224
    .line 225
    move-result v18

    .line 226
    if-eqz v18, :cond_17

    .line 227
    .line 228
    const/high16 v18, 0x800000

    .line 229
    .line 230
    goto :goto_e

    .line 231
    :cond_17
    const/high16 v18, 0x400000

    .line 232
    .line 233
    :goto_e
    or-int v2, v2, v18

    .line 234
    .line 235
    :goto_f
    const v18, 0x492493

    .line 236
    .line 237
    .line 238
    and-int v1, v2, v18

    .line 239
    .line 240
    move/from16 p10, v3

    .line 241
    .line 242
    const v3, 0x492492

    .line 243
    .line 244
    .line 245
    if-ne v1, v3, :cond_19

    .line 246
    .line 247
    invoke-interface {v11}, Landroidx/compose/runtime/Composer;->getSkipping()Z

    .line 248
    .line 249
    .line 250
    move-result v1

    .line 251
    if-nez v1, :cond_18

    .line 252
    .line 253
    goto :goto_10

    .line 254
    :cond_18
    invoke-interface {v11}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    .line 255
    .line 256
    .line 257
    move-object/from16 v9, p8

    .line 258
    .line 259
    move-object v2, v4

    .line 260
    move-wide v3, v5

    .line 261
    move-wide v5, v7

    .line 262
    move v7, v10

    .line 263
    move-object v8, v13

    .line 264
    goto/16 :goto_13

    .line 265
    .line 266
    :cond_19
    :goto_10
    invoke-interface {v11}, Landroidx/compose/runtime/Composer;->startDefaults()V

    .line 267
    .line 268
    .line 269
    and-int/lit8 v1, v14, 0x1

    .line 270
    .line 271
    if-eqz v1, :cond_1d

    .line 272
    .line 273
    invoke-interface {v11}, Landroidx/compose/runtime/Composer;->getDefaultsInvalid()Z

    .line 274
    .line 275
    .line 276
    move-result v1

    .line 277
    if-eqz v1, :cond_1a

    .line 278
    .line 279
    goto :goto_11

    .line 280
    :cond_1a
    invoke-interface {v11}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    .line 281
    .line 282
    .line 283
    and-int/lit8 v1, v15, 0x4

    .line 284
    .line 285
    if-eqz v1, :cond_1b

    .line 286
    .line 287
    and-int/lit16 v2, v2, -0x381

    .line 288
    .line 289
    :cond_1b
    and-int/lit8 v1, v15, 0x8

    .line 290
    .line 291
    if-eqz v1, :cond_1c

    .line 292
    .line 293
    and-int/lit16 v2, v2, -0x1c01

    .line 294
    .line 295
    :cond_1c
    move v9, v2

    .line 296
    move-object v2, v4

    .line 297
    move-wide v3, v5

    .line 298
    move-wide v5, v7

    .line 299
    move v7, v10

    .line 300
    move-object v1, v13

    .line 301
    move-object/from16 v8, p8

    .line 302
    .line 303
    goto :goto_12

    .line 304
    :cond_1d
    :goto_11
    if-eqz p10, :cond_1e

    .line 305
    .line 306
    sget-object v1, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    .line 307
    .line 308
    move-object v4, v1

    .line 309
    :cond_1e
    and-int/lit8 v1, v15, 0x4

    .line 310
    .line 311
    const/4 v3, 0x6

    .line 312
    if-eqz v1, :cond_1f

    .line 313
    .line 314
    sget-object v1, Landroidx/compose/material3/TabRowDefaults;->INSTANCE:Landroidx/compose/material3/TabRowDefaults;

    .line 315
    .line 316
    invoke-virtual {v1, v11, v3}, Landroidx/compose/material3/TabRowDefaults;->getPrimaryContainerColor(Landroidx/compose/runtime/Composer;I)J

    .line 317
    .line 318
    .line 319
    move-result-wide v5

    .line 320
    and-int/lit16 v2, v2, -0x381

    .line 321
    .line 322
    :cond_1f
    and-int/lit8 v1, v15, 0x8

    .line 323
    .line 324
    if-eqz v1, :cond_20

    .line 325
    .line 326
    sget-object v1, Landroidx/compose/material3/TabRowDefaults;->INSTANCE:Landroidx/compose/material3/TabRowDefaults;

    .line 327
    .line 328
    invoke-virtual {v1, v11, v3}, Landroidx/compose/material3/TabRowDefaults;->getPrimaryContentColor(Landroidx/compose/runtime/Composer;I)J

    .line 329
    .line 330
    .line 331
    move-result-wide v7

    .line 332
    and-int/lit16 v1, v2, -0x1c01

    .line 333
    .line 334
    move v2, v1

    .line 335
    :cond_20
    if-eqz v9, :cond_21

    .line 336
    .line 337
    sget-object v1, Landroidx/compose/material3/TabRowDefaults;->INSTANCE:Landroidx/compose/material3/TabRowDefaults;

    .line 338
    .line 339
    invoke-virtual {v1}, Landroidx/compose/material3/TabRowDefaults;->getScrollableTabRowEdgeStartPadding-D9Ej5fM()F

    .line 340
    .line 341
    .line 342
    move-result v1

    .line 343
    move v10, v1

    .line 344
    :cond_21
    if-eqz v12, :cond_22

    .line 345
    .line 346
    new-instance v1, Landroidx/compose/material3/TabRowKt$ScrollableTabRow$1;

    .line 347
    .line 348
    invoke-direct {v1, v0}, Landroidx/compose/material3/TabRowKt$ScrollableTabRow$1;-><init>(I)V

    .line 349
    .line 350
    .line 351
    const/16 v3, 0x36

    .line 352
    .line 353
    const v9, -0x3676b2c6

    .line 354
    .line 355
    .line 356
    const/4 v12, 0x1

    .line 357
    invoke-static {v9, v12, v1, v11, v3}, Landroidx/compose/runtime/internal/ComposableLambdaKt;->rememberComposableLambda(IZLjava/lang/Object;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/internal/ComposableLambda;

    .line 358
    .line 359
    .line 360
    move-result-object v1

    .line 361
    move-object v13, v1

    .line 362
    :cond_22
    if-eqz v16, :cond_1c

    .line 363
    .line 364
    sget-object v1, Landroidx/compose/material3/ComposableSingletons$TabRowKt;->INSTANCE:Landroidx/compose/material3/ComposableSingletons$TabRowKt;

    .line 365
    .line 366
    invoke-virtual {v1}, Landroidx/compose/material3/ComposableSingletons$TabRowKt;->getLambda-6$material3_release()Lkotlin/jvm/functions/Function2;

    .line 367
    .line 368
    .line 369
    move-result-object v1

    .line 370
    move v9, v2

    .line 371
    move-object v2, v4

    .line 372
    move-wide v3, v5

    .line 373
    move-wide v5, v7

    .line 374
    move v7, v10

    .line 375
    move-object v8, v1

    .line 376
    move-object v1, v13

    .line 377
    :goto_12
    invoke-interface {v11}, Landroidx/compose/runtime/Composer;->endDefaults()V

    .line 378
    .line 379
    .line 380
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 381
    .line 382
    .line 383
    move-result v10

    .line 384
    if-eqz v10, :cond_23

    .line 385
    .line 386
    const/4 v10, -0x1

    .line 387
    const-string/jumbo v12, "androidx.compose.material3.ScrollableTabRow (TabRow.kt:507)"

    .line 388
    .line 389
    .line 390
    const v13, -0x1dac254b

    .line 391
    .line 392
    .line 393
    invoke-static {v13, v9, v10, v12}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 394
    .line 395
    .line 396
    :cond_23
    const/4 v10, 0x0

    .line 397
    const/4 v12, 0x1

    .line 398
    invoke-static {v10, v11, v10, v12}, Landroidx/compose/foundation/ScrollKt;->rememberScrollState(ILandroidx/compose/runtime/Composer;II)Landroidx/compose/foundation/ScrollState;

    .line 399
    .line 400
    .line 401
    move-result-object v10

    .line 402
    and-int/lit8 v12, v9, 0xe

    .line 403
    .line 404
    shr-int/lit8 v13, v9, 0xc

    .line 405
    .line 406
    and-int/lit8 v13, v13, 0x70

    .line 407
    .line 408
    or-int/2addr v12, v13

    .line 409
    shl-int/lit8 v13, v9, 0x3

    .line 410
    .line 411
    and-int/lit16 v0, v13, 0x380

    .line 412
    .line 413
    or-int/2addr v0, v12

    .line 414
    and-int/lit16 v12, v13, 0x1c00

    .line 415
    .line 416
    or-int/2addr v0, v12

    .line 417
    const v12, 0xe000

    .line 418
    .line 419
    .line 420
    and-int/2addr v12, v13

    .line 421
    or-int/2addr v0, v12

    .line 422
    const/high16 v12, 0x70000

    .line 423
    .line 424
    and-int/2addr v12, v13

    .line 425
    or-int/2addr v0, v12

    .line 426
    const/high16 v12, 0x380000

    .line 427
    .line 428
    and-int/2addr v12, v9

    .line 429
    or-int/2addr v0, v12

    .line 430
    const/high16 v12, 0x1c00000

    .line 431
    .line 432
    and-int/2addr v9, v12

    .line 433
    or-int v12, v0, v9

    .line 434
    .line 435
    const/4 v13, 0x0

    .line 436
    move/from16 v0, p0

    .line 437
    .line 438
    move-object/from16 v9, p9

    .line 439
    .line 440
    invoke-static/range {v0 .. v13}, Landroidx/compose/material3/TabRowKt;->ScrollableTabRowWithSubcomposeImpl-qhFBPw4(ILkotlin/jvm/functions/Function3;Landroidx/compose/ui/Modifier;JJFLkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/foundation/ScrollState;Landroidx/compose/runtime/Composer;II)V

    .line 441
    .line 442
    .line 443
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 444
    .line 445
    .line 446
    move-result v0

    .line 447
    if-eqz v0, :cond_24

    .line 448
    .line 449
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 450
    .line 451
    .line 452
    :cond_24
    move-object v9, v8

    .line 453
    move-object v8, v1

    .line 454
    :goto_13
    invoke-interface {v11}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    .line 455
    .line 456
    .line 457
    move-result-object v13

    .line 458
    if-eqz v13, :cond_25

    .line 459
    .line 460
    new-instance v0, Landroidx/compose/material3/TabRowKt$ScrollableTabRow$2;

    .line 461
    .line 462
    move/from16 v1, p0

    .line 463
    .line 464
    move-object/from16 v10, p9

    .line 465
    .line 466
    move v11, v14

    .line 467
    move v12, v15

    .line 468
    invoke-direct/range {v0 .. v12}, Landroidx/compose/material3/TabRowKt$ScrollableTabRow$2;-><init>(ILandroidx/compose/ui/Modifier;JJFLkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;II)V

    .line 469
    .line 470
    .line 471
    invoke-interface {v13, v0}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lkotlin/jvm/functions/Function2;)V

    .line 472
    .line 473
    .line 474
    :cond_25
    return-void
.end method

.method private static final ScrollableTabRowImpl-sKfQg0A(ILandroidx/compose/ui/Modifier;JJFLandroidx/compose/foundation/ScrollState;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V
    .locals 26
    .annotation build Landroidx/compose/runtime/Composable;
    .end annotation

    .annotation build Landroidx/compose/runtime/ComposableInferredTarget;
        scheme = "[androidx.compose.ui.UiComposable[_][_][_]]"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Landroidx/compose/ui/Modifier;",
            "JJF",
            "Landroidx/compose/foundation/ScrollState;",
            "Lkotlin/jvm/functions/Function3<",
            "-",
            "Landroidx/compose/material3/TabIndicatorScope;",
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
            "Landroidx/compose/runtime/Composer;",
            "I)V"
        }
    .end annotation

    .line 1
    move-object/from16 v2, p1

    .line 2
    .line 3
    move/from16 v12, p12

    .line 4
    .line 5
    const v0, -0x5f04a583

    .line 6
    .line 7
    .line 8
    move-object/from16 v1, p11

    .line 9
    .line 10
    invoke-interface {v1, v0}, Landroidx/compose/runtime/Composer;->startRestartGroup(I)Landroidx/compose/runtime/Composer;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    and-int/lit8 v3, v12, 0x6

    .line 15
    .line 16
    move/from16 v10, p0

    .line 17
    .line 18
    if-nez v3, :cond_1

    .line 19
    .line 20
    invoke-interface {v1, v10}, Landroidx/compose/runtime/Composer;->changed(I)Z

    .line 21
    .line 22
    .line 23
    move-result v3

    .line 24
    if-eqz v3, :cond_0

    .line 25
    .line 26
    const/4 v3, 0x4

    .line 27
    goto :goto_0

    .line 28
    :cond_0
    const/4 v3, 0x2

    .line 29
    :goto_0
    or-int/2addr v3, v12

    .line 30
    goto :goto_1

    .line 31
    :cond_1
    move v3, v12

    .line 32
    :goto_1
    and-int/lit8 v5, v12, 0x30

    .line 33
    .line 34
    if-nez v5, :cond_3

    .line 35
    .line 36
    invoke-interface {v1, v2}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 37
    .line 38
    .line 39
    move-result v5

    .line 40
    if-eqz v5, :cond_2

    .line 41
    .line 42
    const/16 v5, 0x20

    .line 43
    .line 44
    goto :goto_2

    .line 45
    :cond_2
    const/16 v5, 0x10

    .line 46
    .line 47
    :goto_2
    or-int/2addr v3, v5

    .line 48
    :cond_3
    and-int/lit16 v5, v12, 0x180

    .line 49
    .line 50
    move-wide/from16 v13, p2

    .line 51
    .line 52
    if-nez v5, :cond_5

    .line 53
    .line 54
    invoke-interface {v1, v13, v14}, Landroidx/compose/runtime/Composer;->changed(J)Z

    .line 55
    .line 56
    .line 57
    move-result v5

    .line 58
    if-eqz v5, :cond_4

    .line 59
    .line 60
    const/16 v5, 0x100

    .line 61
    .line 62
    goto :goto_3

    .line 63
    :cond_4
    const/16 v5, 0x80

    .line 64
    .line 65
    :goto_3
    or-int/2addr v3, v5

    .line 66
    :cond_5
    and-int/lit16 v5, v12, 0xc00

    .line 67
    .line 68
    if-nez v5, :cond_7

    .line 69
    .line 70
    move-wide/from16 v5, p4

    .line 71
    .line 72
    invoke-interface {v1, v5, v6}, Landroidx/compose/runtime/Composer;->changed(J)Z

    .line 73
    .line 74
    .line 75
    move-result v7

    .line 76
    if-eqz v7, :cond_6

    .line 77
    .line 78
    const/16 v7, 0x800

    .line 79
    .line 80
    goto :goto_4

    .line 81
    :cond_6
    const/16 v7, 0x400

    .line 82
    .line 83
    :goto_4
    or-int/2addr v3, v7

    .line 84
    goto :goto_5

    .line 85
    :cond_7
    move-wide/from16 v5, p4

    .line 86
    .line 87
    :goto_5
    and-int/lit16 v7, v12, 0x6000

    .line 88
    .line 89
    if-nez v7, :cond_9

    .line 90
    .line 91
    move/from16 v7, p6

    .line 92
    .line 93
    invoke-interface {v1, v7}, Landroidx/compose/runtime/Composer;->changed(F)Z

    .line 94
    .line 95
    .line 96
    move-result v8

    .line 97
    if-eqz v8, :cond_8

    .line 98
    .line 99
    const/16 v8, 0x4000

    .line 100
    .line 101
    goto :goto_6

    .line 102
    :cond_8
    const/16 v8, 0x2000

    .line 103
    .line 104
    :goto_6
    or-int/2addr v3, v8

    .line 105
    goto :goto_7

    .line 106
    :cond_9
    move/from16 v7, p6

    .line 107
    .line 108
    :goto_7
    const/high16 v8, 0x30000

    .line 109
    .line 110
    and-int/2addr v8, v12

    .line 111
    if-nez v8, :cond_b

    .line 112
    .line 113
    move-object/from16 v8, p7

    .line 114
    .line 115
    invoke-interface {v1, v8}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 116
    .line 117
    .line 118
    move-result v9

    .line 119
    if-eqz v9, :cond_a

    .line 120
    .line 121
    const/high16 v9, 0x20000

    .line 122
    .line 123
    goto :goto_8

    .line 124
    :cond_a
    const/high16 v9, 0x10000

    .line 125
    .line 126
    :goto_8
    or-int/2addr v3, v9

    .line 127
    goto :goto_9

    .line 128
    :cond_b
    move-object/from16 v8, p7

    .line 129
    .line 130
    :goto_9
    const/high16 v9, 0x180000

    .line 131
    .line 132
    and-int/2addr v9, v12

    .line 133
    if-nez v9, :cond_d

    .line 134
    .line 135
    move-object/from16 v9, p8

    .line 136
    .line 137
    invoke-interface {v1, v9}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 138
    .line 139
    .line 140
    move-result v11

    .line 141
    if-eqz v11, :cond_c

    .line 142
    .line 143
    const/high16 v11, 0x100000

    .line 144
    .line 145
    goto :goto_a

    .line 146
    :cond_c
    const/high16 v11, 0x80000

    .line 147
    .line 148
    :goto_a
    or-int/2addr v3, v11

    .line 149
    goto :goto_b

    .line 150
    :cond_d
    move-object/from16 v9, p8

    .line 151
    .line 152
    :goto_b
    const/high16 v22, 0xc00000

    .line 153
    .line 154
    and-int v11, v12, v22

    .line 155
    .line 156
    if-nez v11, :cond_f

    .line 157
    .line 158
    move-object/from16 v11, p9

    .line 159
    .line 160
    invoke-interface {v1, v11}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 161
    .line 162
    .line 163
    move-result v15

    .line 164
    if-eqz v15, :cond_e

    .line 165
    .line 166
    const/high16 v15, 0x800000

    .line 167
    .line 168
    goto :goto_c

    .line 169
    :cond_e
    const/high16 v15, 0x400000

    .line 170
    .line 171
    :goto_c
    or-int/2addr v3, v15

    .line 172
    goto :goto_d

    .line 173
    :cond_f
    move-object/from16 v11, p9

    .line 174
    .line 175
    :goto_d
    const/high16 v15, 0x6000000

    .line 176
    .line 177
    and-int/2addr v15, v12

    .line 178
    if-nez v15, :cond_11

    .line 179
    .line 180
    move-object/from16 v15, p10

    .line 181
    .line 182
    invoke-interface {v1, v15}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 183
    .line 184
    .line 185
    move-result v16

    .line 186
    if-eqz v16, :cond_10

    .line 187
    .line 188
    const/high16 v16, 0x4000000

    .line 189
    .line 190
    goto :goto_e

    .line 191
    :cond_10
    const/high16 v16, 0x2000000

    .line 192
    .line 193
    :goto_e
    or-int v3, v3, v16

    .line 194
    .line 195
    goto :goto_f

    .line 196
    :cond_11
    move-object/from16 v15, p10

    .line 197
    .line 198
    :goto_f
    const v16, 0x2492493

    .line 199
    .line 200
    .line 201
    and-int v4, v3, v16

    .line 202
    .line 203
    const v0, 0x2492492

    .line 204
    .line 205
    .line 206
    if-ne v4, v0, :cond_13

    .line 207
    .line 208
    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->getSkipping()Z

    .line 209
    .line 210
    .line 211
    move-result v0

    .line 212
    if-nez v0, :cond_12

    .line 213
    .line 214
    goto :goto_10

    .line 215
    :cond_12
    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    .line 216
    .line 217
    .line 218
    move-object/from16 v23, v1

    .line 219
    .line 220
    goto/16 :goto_11

    .line 221
    .line 222
    :cond_13
    :goto_10
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 223
    .line 224
    .line 225
    move-result v0

    .line 226
    if-eqz v0, :cond_14

    .line 227
    .line 228
    const/4 v0, -0x1

    .line 229
    const-string/jumbo v4, "androidx.compose.material3.ScrollableTabRowImpl (TabRow.kt:699)"

    .line 230
    .line 231
    .line 232
    const v5, -0x5f04a583

    .line 233
    .line 234
    .line 235
    invoke-static {v5, v3, v0, v4}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 236
    .line 237
    .line 238
    :cond_14
    const/4 v0, 0x0

    .line 239
    const/4 v4, 0x1

    .line 240
    const/4 v5, 0x0

    .line 241
    invoke-static {v2, v0, v4, v5}, Landroidx/compose/foundation/layout/SizeKt;->fillMaxWidth$default(Landroidx/compose/ui/Modifier;FILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    .line 242
    .line 243
    .line 244
    move-result-object v0

    .line 245
    sget-object v6, Landroidx/compose/ui/Alignment;->Companion:Landroidx/compose/ui/Alignment$Companion;

    .line 246
    .line 247
    invoke-virtual {v6}, Landroidx/compose/ui/Alignment$Companion;->getCenterStart()Landroidx/compose/ui/Alignment;

    .line 248
    .line 249
    .line 250
    move-result-object v6

    .line 251
    const/4 v4, 0x0

    .line 252
    const/4 v2, 0x2

    .line 253
    invoke-static {v0, v6, v4, v2, v5}, Landroidx/compose/foundation/layout/SizeKt;->wrapContentSize$default(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/Alignment;ZILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    .line 254
    .line 255
    .line 256
    move-result-object v0

    .line 257
    const/16 v20, 0xe

    .line 258
    .line 259
    const/16 v21, 0x0

    .line 260
    .line 261
    const/16 v17, 0x0

    .line 262
    .line 263
    const/16 v18, 0x0

    .line 264
    .line 265
    const/16 v19, 0x0

    .line 266
    .line 267
    move-object v15, v0

    .line 268
    move-object/from16 v16, v8

    .line 269
    .line 270
    invoke-static/range {v15 .. v21}, Landroidx/compose/foundation/ScrollKt;->horizontalScroll$default(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/ScrollState;ZLandroidx/compose/foundation/gestures/FlingBehavior;ZILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    .line 271
    .line 272
    .line 273
    move-result-object v0

    .line 274
    invoke-static {v0}, Landroidx/compose/foundation/selection/SelectableGroupKt;->selectableGroup(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    .line 275
    .line 276
    .line 277
    move-result-object v0

    .line 278
    invoke-static {v0}, Landroidx/compose/ui/draw/ClipKt;->clipToBounds(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    .line 279
    .line 280
    .line 281
    move-result-object v0

    .line 282
    new-instance v5, Landroidx/compose/material3/TabRowKt$ScrollableTabRowImpl$1;

    .line 283
    .line 284
    move-object/from16 v6, p7

    .line 285
    .line 286
    move-object v8, v11

    .line 287
    move-object v11, v9

    .line 288
    move v9, v7

    .line 289
    move-object/from16 v7, p10

    .line 290
    .line 291
    invoke-direct/range {v5 .. v11}, Landroidx/compose/material3/TabRowKt$ScrollableTabRowImpl$1;-><init>(Landroidx/compose/foundation/ScrollState;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;FILkotlin/jvm/functions/Function3;)V

    .line 292
    .line 293
    .line 294
    const/16 v2, 0x36

    .line 295
    .line 296
    const v4, 0x5cc11698

    .line 297
    .line 298
    .line 299
    const/4 v6, 0x1

    .line 300
    invoke-static {v4, v6, v5, v1, v2}, Landroidx/compose/runtime/internal/ComposableLambdaKt;->rememberComposableLambda(IZLjava/lang/Object;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/internal/ComposableLambda;

    .line 301
    .line 302
    .line 303
    move-result-object v2

    .line 304
    and-int/lit16 v4, v3, 0x380

    .line 305
    .line 306
    or-int v4, v4, v22

    .line 307
    .line 308
    and-int/lit16 v3, v3, 0x1c00

    .line 309
    .line 310
    or-int v24, v4, v3

    .line 311
    .line 312
    const/16 v25, 0x72

    .line 313
    .line 314
    const/4 v14, 0x0

    .line 315
    const/16 v19, 0x0

    .line 316
    .line 317
    const/16 v20, 0x0

    .line 318
    .line 319
    move-wide/from16 v15, p2

    .line 320
    .line 321
    move-wide/from16 v17, p4

    .line 322
    .line 323
    move-object v13, v0

    .line 324
    move-object/from16 v23, v1

    .line 325
    .line 326
    move-object/from16 v22, v2

    .line 327
    .line 328
    invoke-static/range {v13 .. v25}, Landroidx/compose/material3/SurfaceKt;->Surface-T9BRK9s(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/graphics/Shape;JJFFLandroidx/compose/foundation/BorderStroke;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V

    .line 329
    .line 330
    .line 331
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 332
    .line 333
    .line 334
    move-result v0

    .line 335
    if-eqz v0, :cond_15

    .line 336
    .line 337
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 338
    .line 339
    .line 340
    :cond_15
    :goto_11
    invoke-interface/range {v23 .. v23}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    .line 341
    .line 342
    .line 343
    move-result-object v13

    .line 344
    if-eqz v13, :cond_16

    .line 345
    .line 346
    new-instance v0, Landroidx/compose/material3/TabRowKt$ScrollableTabRowImpl$2;

    .line 347
    .line 348
    move/from16 v1, p0

    .line 349
    .line 350
    move-object/from16 v2, p1

    .line 351
    .line 352
    move-wide/from16 v3, p2

    .line 353
    .line 354
    move-wide/from16 v5, p4

    .line 355
    .line 356
    move/from16 v7, p6

    .line 357
    .line 358
    move-object/from16 v8, p7

    .line 359
    .line 360
    move-object/from16 v9, p8

    .line 361
    .line 362
    move-object/from16 v10, p9

    .line 363
    .line 364
    move-object/from16 v11, p10

    .line 365
    .line 366
    invoke-direct/range {v0 .. v12}, Landroidx/compose/material3/TabRowKt$ScrollableTabRowImpl$2;-><init>(ILandroidx/compose/ui/Modifier;JJFLandroidx/compose/foundation/ScrollState;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;I)V

    .line 367
    .line 368
    .line 369
    invoke-interface {v13, v0}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lkotlin/jvm/functions/Function2;)V

    .line 370
    .line 371
    .line 372
    :cond_16
    return-void
.end method

.method private static final ScrollableTabRowWithSubcomposeImpl-qhFBPw4(ILkotlin/jvm/functions/Function3;Landroidx/compose/ui/Modifier;JJFLkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/foundation/ScrollState;Landroidx/compose/runtime/Composer;II)V
    .locals 27
    .annotation build Landroidx/compose/runtime/Composable;
    .end annotation

    .annotation build Landroidx/compose/runtime/ComposableInferredTarget;
        scheme = "[androidx.compose.ui.UiComposable[_][_][_]]"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Lkotlin/jvm/functions/Function3<",
            "-",
            "Ljava/util/List<",
            "Landroidx/compose/material3/TabPosition;",
            ">;-",
            "Landroidx/compose/runtime/Composer;",
            "-",
            "Ljava/lang/Integer;",
            "Lkotlin/Unit;",
            ">;",
            "Landroidx/compose/ui/Modifier;",
            "JJF",
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
            "Landroidx/compose/foundation/ScrollState;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    .line 1
    move/from16 v12, p12

    .line 2
    .line 3
    move/from16 v13, p13

    .line 4
    .line 5
    const v0, -0x38f2661b

    .line 6
    .line 7
    .line 8
    move-object/from16 v1, p11

    .line 9
    .line 10
    invoke-interface {v1, v0}, Landroidx/compose/runtime/Composer;->startRestartGroup(I)Landroidx/compose/runtime/Composer;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    and-int/lit8 v2, v13, 0x1

    .line 15
    .line 16
    if-eqz v2, :cond_0

    .line 17
    .line 18
    or-int/lit8 v2, v12, 0x6

    .line 19
    .line 20
    move v3, v2

    .line 21
    move/from16 v2, p0

    .line 22
    .line 23
    goto :goto_1

    .line 24
    :cond_0
    and-int/lit8 v2, v12, 0x6

    .line 25
    .line 26
    if-nez v2, :cond_2

    .line 27
    .line 28
    move/from16 v2, p0

    .line 29
    .line 30
    invoke-interface {v1, v2}, Landroidx/compose/runtime/Composer;->changed(I)Z

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
    or-int/2addr v3, v12

    .line 40
    goto :goto_1

    .line 41
    :cond_2
    move/from16 v2, p0

    .line 42
    .line 43
    move v3, v12

    .line 44
    :goto_1
    and-int/lit8 v4, v13, 0x2

    .line 45
    .line 46
    if-eqz v4, :cond_4

    .line 47
    .line 48
    or-int/lit8 v3, v3, 0x30

    .line 49
    .line 50
    :cond_3
    move-object/from16 v4, p1

    .line 51
    .line 52
    goto :goto_3

    .line 53
    :cond_4
    and-int/lit8 v4, v12, 0x30

    .line 54
    .line 55
    if-nez v4, :cond_3

    .line 56
    .line 57
    move-object/from16 v4, p1

    .line 58
    .line 59
    invoke-interface {v1, v4}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 60
    .line 61
    .line 62
    move-result v5

    .line 63
    if-eqz v5, :cond_5

    .line 64
    .line 65
    const/16 v5, 0x20

    .line 66
    .line 67
    goto :goto_2

    .line 68
    :cond_5
    const/16 v5, 0x10

    .line 69
    .line 70
    :goto_2
    or-int/2addr v3, v5

    .line 71
    :goto_3
    and-int/lit8 v5, v13, 0x4

    .line 72
    .line 73
    if-eqz v5, :cond_7

    .line 74
    .line 75
    or-int/lit16 v3, v3, 0x180

    .line 76
    .line 77
    :cond_6
    move-object/from16 v6, p2

    .line 78
    .line 79
    goto :goto_5

    .line 80
    :cond_7
    and-int/lit16 v6, v12, 0x180

    .line 81
    .line 82
    if-nez v6, :cond_6

    .line 83
    .line 84
    move-object/from16 v6, p2

    .line 85
    .line 86
    invoke-interface {v1, v6}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 87
    .line 88
    .line 89
    move-result v7

    .line 90
    if-eqz v7, :cond_8

    .line 91
    .line 92
    const/16 v7, 0x100

    .line 93
    .line 94
    goto :goto_4

    .line 95
    :cond_8
    const/16 v7, 0x80

    .line 96
    .line 97
    :goto_4
    or-int/2addr v3, v7

    .line 98
    :goto_5
    and-int/lit16 v7, v12, 0xc00

    .line 99
    .line 100
    if-nez v7, :cond_b

    .line 101
    .line 102
    and-int/lit8 v7, v13, 0x8

    .line 103
    .line 104
    if-nez v7, :cond_9

    .line 105
    .line 106
    move-wide/from16 v7, p3

    .line 107
    .line 108
    invoke-interface {v1, v7, v8}, Landroidx/compose/runtime/Composer;->changed(J)Z

    .line 109
    .line 110
    .line 111
    move-result v9

    .line 112
    if-eqz v9, :cond_a

    .line 113
    .line 114
    const/16 v9, 0x800

    .line 115
    .line 116
    goto :goto_6

    .line 117
    :cond_9
    move-wide/from16 v7, p3

    .line 118
    .line 119
    :cond_a
    const/16 v9, 0x400

    .line 120
    .line 121
    :goto_6
    or-int/2addr v3, v9

    .line 122
    goto :goto_7

    .line 123
    :cond_b
    move-wide/from16 v7, p3

    .line 124
    .line 125
    :goto_7
    and-int/lit16 v9, v12, 0x6000

    .line 126
    .line 127
    if-nez v9, :cond_e

    .line 128
    .line 129
    and-int/lit8 v9, v13, 0x10

    .line 130
    .line 131
    if-nez v9, :cond_c

    .line 132
    .line 133
    move-wide/from16 v9, p5

    .line 134
    .line 135
    invoke-interface {v1, v9, v10}, Landroidx/compose/runtime/Composer;->changed(J)Z

    .line 136
    .line 137
    .line 138
    move-result v11

    .line 139
    if-eqz v11, :cond_d

    .line 140
    .line 141
    const/16 v11, 0x4000

    .line 142
    .line 143
    goto :goto_8

    .line 144
    :cond_c
    move-wide/from16 v9, p5

    .line 145
    .line 146
    :cond_d
    const/16 v11, 0x2000

    .line 147
    .line 148
    :goto_8
    or-int/2addr v3, v11

    .line 149
    goto :goto_9

    .line 150
    :cond_e
    move-wide/from16 v9, p5

    .line 151
    .line 152
    :goto_9
    and-int/lit8 v11, v13, 0x20

    .line 153
    .line 154
    const/high16 v14, 0x30000

    .line 155
    .line 156
    if-eqz v11, :cond_10

    .line 157
    .line 158
    or-int/2addr v3, v14

    .line 159
    :cond_f
    move/from16 v14, p7

    .line 160
    .line 161
    goto :goto_b

    .line 162
    :cond_10
    and-int/2addr v14, v12

    .line 163
    if-nez v14, :cond_f

    .line 164
    .line 165
    move/from16 v14, p7

    .line 166
    .line 167
    invoke-interface {v1, v14}, Landroidx/compose/runtime/Composer;->changed(F)Z

    .line 168
    .line 169
    .line 170
    move-result v15

    .line 171
    if-eqz v15, :cond_11

    .line 172
    .line 173
    const/high16 v15, 0x20000

    .line 174
    .line 175
    goto :goto_a

    .line 176
    :cond_11
    const/high16 v15, 0x10000

    .line 177
    .line 178
    :goto_a
    or-int/2addr v3, v15

    .line 179
    :goto_b
    and-int/lit8 v15, v13, 0x40

    .line 180
    .line 181
    const/high16 v16, 0x180000

    .line 182
    .line 183
    if-eqz v15, :cond_12

    .line 184
    .line 185
    or-int v3, v3, v16

    .line 186
    .line 187
    move-object/from16 v0, p8

    .line 188
    .line 189
    goto :goto_d

    .line 190
    :cond_12
    and-int v16, v12, v16

    .line 191
    .line 192
    move-object/from16 v0, p8

    .line 193
    .line 194
    if-nez v16, :cond_14

    .line 195
    .line 196
    invoke-interface {v1, v0}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 197
    .line 198
    .line 199
    move-result v17

    .line 200
    if-eqz v17, :cond_13

    .line 201
    .line 202
    const/high16 v17, 0x100000

    .line 203
    .line 204
    goto :goto_c

    .line 205
    :cond_13
    const/high16 v17, 0x80000

    .line 206
    .line 207
    :goto_c
    or-int v3, v3, v17

    .line 208
    .line 209
    :cond_14
    :goto_d
    and-int/lit16 v0, v13, 0x80

    .line 210
    .line 211
    const/high16 v17, 0xc00000

    .line 212
    .line 213
    if-eqz v0, :cond_16

    .line 214
    .line 215
    or-int v3, v3, v17

    .line 216
    .line 217
    :cond_15
    move-object/from16 v0, p9

    .line 218
    .line 219
    goto :goto_f

    .line 220
    :cond_16
    and-int v0, v12, v17

    .line 221
    .line 222
    if-nez v0, :cond_15

    .line 223
    .line 224
    move-object/from16 v0, p9

    .line 225
    .line 226
    invoke-interface {v1, v0}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 227
    .line 228
    .line 229
    move-result v18

    .line 230
    if-eqz v18, :cond_17

    .line 231
    .line 232
    const/high16 v18, 0x800000

    .line 233
    .line 234
    goto :goto_e

    .line 235
    :cond_17
    const/high16 v18, 0x400000

    .line 236
    .line 237
    :goto_e
    or-int v3, v3, v18

    .line 238
    .line 239
    :goto_f
    and-int/lit16 v0, v13, 0x100

    .line 240
    .line 241
    const/high16 v18, 0x6000000

    .line 242
    .line 243
    if-eqz v0, :cond_19

    .line 244
    .line 245
    or-int v3, v3, v18

    .line 246
    .line 247
    :cond_18
    move-object/from16 v0, p10

    .line 248
    .line 249
    goto :goto_11

    .line 250
    :cond_19
    and-int v0, v12, v18

    .line 251
    .line 252
    if-nez v0, :cond_18

    .line 253
    .line 254
    move-object/from16 v0, p10

    .line 255
    .line 256
    invoke-interface {v1, v0}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 257
    .line 258
    .line 259
    move-result v18

    .line 260
    if-eqz v18, :cond_1a

    .line 261
    .line 262
    const/high16 v18, 0x4000000

    .line 263
    .line 264
    goto :goto_10

    .line 265
    :cond_1a
    const/high16 v18, 0x2000000

    .line 266
    .line 267
    :goto_10
    or-int v3, v3, v18

    .line 268
    .line 269
    :goto_11
    const v18, 0x2492493

    .line 270
    .line 271
    .line 272
    and-int v0, v3, v18

    .line 273
    .line 274
    const v2, 0x2492492

    .line 275
    .line 276
    .line 277
    if-ne v0, v2, :cond_1c

    .line 278
    .line 279
    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->getSkipping()Z

    .line 280
    .line 281
    .line 282
    move-result v0

    .line 283
    if-nez v0, :cond_1b

    .line 284
    .line 285
    goto :goto_12

    .line 286
    :cond_1b
    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    .line 287
    .line 288
    .line 289
    move-object/from16 v24, v1

    .line 290
    .line 291
    move-object v3, v6

    .line 292
    move-wide v4, v7

    .line 293
    move-wide v6, v9

    .line 294
    move v8, v14

    .line 295
    move-object/from16 v9, p8

    .line 296
    .line 297
    goto/16 :goto_16

    .line 298
    .line 299
    :cond_1c
    :goto_12
    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->startDefaults()V

    .line 300
    .line 301
    .line 302
    and-int/lit8 v0, v12, 0x1

    .line 303
    .line 304
    const v2, -0xe001

    .line 305
    .line 306
    .line 307
    if-eqz v0, :cond_20

    .line 308
    .line 309
    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->getDefaultsInvalid()Z

    .line 310
    .line 311
    .line 312
    move-result v0

    .line 313
    if-eqz v0, :cond_1d

    .line 314
    .line 315
    goto :goto_14

    .line 316
    :cond_1d
    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    .line 317
    .line 318
    .line 319
    and-int/lit8 v0, v13, 0x8

    .line 320
    .line 321
    if-eqz v0, :cond_1e

    .line 322
    .line 323
    and-int/lit16 v3, v3, -0x1c01

    .line 324
    .line 325
    :cond_1e
    and-int/lit8 v0, v13, 0x10

    .line 326
    .line 327
    if-eqz v0, :cond_1f

    .line 328
    .line 329
    and-int/2addr v3, v2

    .line 330
    :cond_1f
    move-object/from16 v2, p8

    .line 331
    .line 332
    :goto_13
    move-wide/from16 v18, v9

    .line 333
    .line 334
    move v0, v14

    .line 335
    move/from16 v5, v17

    .line 336
    .line 337
    move-object v14, v6

    .line 338
    move-wide/from16 v16, v7

    .line 339
    .line 340
    const v6, -0x38f2661b

    .line 341
    .line 342
    .line 343
    goto :goto_15

    .line 344
    :cond_20
    :goto_14
    if-eqz v5, :cond_21

    .line 345
    .line 346
    sget-object v0, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    .line 347
    .line 348
    move-object v6, v0

    .line 349
    :cond_21
    and-int/lit8 v0, v13, 0x8

    .line 350
    .line 351
    const/4 v5, 0x6

    .line 352
    if-eqz v0, :cond_22

    .line 353
    .line 354
    sget-object v0, Landroidx/compose/material3/TabRowDefaults;->INSTANCE:Landroidx/compose/material3/TabRowDefaults;

    .line 355
    .line 356
    invoke-virtual {v0, v1, v5}, Landroidx/compose/material3/TabRowDefaults;->getPrimaryContainerColor(Landroidx/compose/runtime/Composer;I)J

    .line 357
    .line 358
    .line 359
    move-result-wide v7

    .line 360
    and-int/lit16 v3, v3, -0x1c01

    .line 361
    .line 362
    :cond_22
    and-int/lit8 v0, v13, 0x10

    .line 363
    .line 364
    if-eqz v0, :cond_23

    .line 365
    .line 366
    sget-object v0, Landroidx/compose/material3/TabRowDefaults;->INSTANCE:Landroidx/compose/material3/TabRowDefaults;

    .line 367
    .line 368
    invoke-virtual {v0, v1, v5}, Landroidx/compose/material3/TabRowDefaults;->getPrimaryContentColor(Landroidx/compose/runtime/Composer;I)J

    .line 369
    .line 370
    .line 371
    move-result-wide v9

    .line 372
    and-int v0, v3, v2

    .line 373
    .line 374
    move v3, v0

    .line 375
    :cond_23
    if-eqz v11, :cond_24

    .line 376
    .line 377
    sget-object v0, Landroidx/compose/material3/TabRowDefaults;->INSTANCE:Landroidx/compose/material3/TabRowDefaults;

    .line 378
    .line 379
    invoke-virtual {v0}, Landroidx/compose/material3/TabRowDefaults;->getScrollableTabRowEdgeStartPadding-D9Ej5fM()F

    .line 380
    .line 381
    .line 382
    move-result v0

    .line 383
    move v14, v0

    .line 384
    :cond_24
    if-eqz v15, :cond_1f

    .line 385
    .line 386
    sget-object v0, Landroidx/compose/material3/ComposableSingletons$TabRowKt;->INSTANCE:Landroidx/compose/material3/ComposableSingletons$TabRowKt;

    .line 387
    .line 388
    invoke-virtual {v0}, Landroidx/compose/material3/ComposableSingletons$TabRowKt;->getLambda-7$material3_release()Lkotlin/jvm/functions/Function2;

    .line 389
    .line 390
    .line 391
    move-result-object v0

    .line 392
    move-object v2, v0

    .line 393
    goto :goto_13

    .line 394
    :goto_15
    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->endDefaults()V

    .line 395
    .line 396
    .line 397
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 398
    .line 399
    .line 400
    move-result v7

    .line 401
    if-eqz v7, :cond_25

    .line 402
    .line 403
    const/4 v7, -0x1

    .line 404
    const-string/jumbo v8, "androidx.compose.material3.ScrollableTabRowWithSubcomposeImpl (TabRow.kt:1020)"

    .line 405
    .line 406
    .line 407
    invoke-static {v6, v3, v7, v8}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 408
    .line 409
    .line 410
    :cond_25
    new-instance v6, Landroidx/compose/material3/TabRowKt$ScrollableTabRowWithSubcomposeImpl$1;

    .line 411
    .line 412
    move/from16 p8, p0

    .line 413
    .line 414
    move-object/from16 p5, p9

    .line 415
    .line 416
    move-object/from16 p3, p10

    .line 417
    .line 418
    move/from16 p4, v0

    .line 419
    .line 420
    move-object/from16 p6, v2

    .line 421
    .line 422
    move-object/from16 p7, v4

    .line 423
    .line 424
    move-object/from16 p2, v6

    .line 425
    .line 426
    invoke-direct/range {p2 .. p8}, Landroidx/compose/material3/TabRowKt$ScrollableTabRowWithSubcomposeImpl$1;-><init>(Landroidx/compose/foundation/ScrollState;FLkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function3;I)V

    .line 427
    .line 428
    .line 429
    move-object/from16 v4, p2

    .line 430
    .line 431
    const/16 v6, 0x36

    .line 432
    .line 433
    const v7, -0x5dc17540

    .line 434
    .line 435
    .line 436
    const/4 v8, 0x1

    .line 437
    invoke-static {v7, v8, v4, v1, v6}, Landroidx/compose/runtime/internal/ComposableLambdaKt;->rememberComposableLambda(IZLjava/lang/Object;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/internal/ComposableLambda;

    .line 438
    .line 439
    .line 440
    move-result-object v23

    .line 441
    shr-int/lit8 v4, v3, 0x6

    .line 442
    .line 443
    and-int/lit8 v4, v4, 0xe

    .line 444
    .line 445
    or-int/2addr v4, v5

    .line 446
    shr-int/lit8 v3, v3, 0x3

    .line 447
    .line 448
    and-int/lit16 v5, v3, 0x380

    .line 449
    .line 450
    or-int/2addr v4, v5

    .line 451
    and-int/lit16 v3, v3, 0x1c00

    .line 452
    .line 453
    or-int v25, v4, v3

    .line 454
    .line 455
    const/16 v26, 0x72

    .line 456
    .line 457
    const/4 v15, 0x0

    .line 458
    const/16 v20, 0x0

    .line 459
    .line 460
    const/16 v21, 0x0

    .line 461
    .line 462
    const/16 v22, 0x0

    .line 463
    .line 464
    move-object/from16 v24, v1

    .line 465
    .line 466
    invoke-static/range {v14 .. v26}, Landroidx/compose/material3/SurfaceKt;->Surface-T9BRK9s(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/graphics/Shape;JJFFLandroidx/compose/foundation/BorderStroke;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V

    .line 467
    .line 468
    .line 469
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 470
    .line 471
    .line 472
    move-result v1

    .line 473
    if-eqz v1, :cond_26

    .line 474
    .line 475
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 476
    .line 477
    .line 478
    :cond_26
    move v8, v0

    .line 479
    move-object v9, v2

    .line 480
    move-object v3, v14

    .line 481
    move-wide/from16 v4, v16

    .line 482
    .line 483
    move-wide/from16 v6, v18

    .line 484
    .line 485
    :goto_16
    invoke-interface/range {v24 .. v24}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    .line 486
    .line 487
    .line 488
    move-result-object v14

    .line 489
    if-eqz v14, :cond_27

    .line 490
    .line 491
    new-instance v0, Landroidx/compose/material3/TabRowKt$ScrollableTabRowWithSubcomposeImpl$2;

    .line 492
    .line 493
    move/from16 v1, p0

    .line 494
    .line 495
    move-object/from16 v2, p1

    .line 496
    .line 497
    move-object/from16 v10, p9

    .line 498
    .line 499
    move-object/from16 v11, p10

    .line 500
    .line 501
    invoke-direct/range {v0 .. v13}, Landroidx/compose/material3/TabRowKt$ScrollableTabRowWithSubcomposeImpl$2;-><init>(ILkotlin/jvm/functions/Function3;Landroidx/compose/ui/Modifier;JJFLkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/foundation/ScrollState;II)V

    .line 502
    .line 503
    .line 504
    invoke-interface {v14, v0}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lkotlin/jvm/functions/Function2;)V

    .line 505
    .line 506
    .line 507
    :cond_27
    return-void
.end method

.method public static final SecondaryScrollableTabRow-qhFBPw4(ILandroidx/compose/ui/Modifier;Landroidx/compose/foundation/ScrollState;JJFLkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V
    .locals 21
    .annotation build Landroidx/compose/material3/ExperimentalMaterial3Api;
    .end annotation

    .annotation build Landroidx/compose/runtime/Composable;
    .end annotation

    .annotation build Landroidx/compose/runtime/ComposableInferredTarget;
        scheme = "[androidx.compose.ui.UiComposable[_][_][_]]"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Landroidx/compose/ui/Modifier;",
            "Landroidx/compose/foundation/ScrollState;",
            "JJF",
            "Lkotlin/jvm/functions/Function3<",
            "-",
            "Landroidx/compose/material3/TabIndicatorScope;",
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
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    .line 1
    move/from16 v0, p0

    .line 2
    .line 3
    move/from16 v13, p12

    .line 4
    .line 5
    move/from16 v14, p13

    .line 6
    .line 7
    const v1, 0x6c989cb5

    .line 8
    .line 9
    .line 10
    move-object/from16 v2, p11

    .line 11
    .line 12
    invoke-interface {v2, v1}, Landroidx/compose/runtime/Composer;->startRestartGroup(I)Landroidx/compose/runtime/Composer;

    .line 13
    .line 14
    .line 15
    move-result-object v11

    .line 16
    and-int/lit8 v2, v14, 0x1

    .line 17
    .line 18
    if-eqz v2, :cond_0

    .line 19
    .line 20
    or-int/lit8 v2, v13, 0x6

    .line 21
    .line 22
    goto :goto_1

    .line 23
    :cond_0
    and-int/lit8 v2, v13, 0x6

    .line 24
    .line 25
    if-nez v2, :cond_2

    .line 26
    .line 27
    invoke-interface {v11, v0}, Landroidx/compose/runtime/Composer;->changed(I)Z

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
    or-int/2addr v2, v13

    .line 37
    goto :goto_1

    .line 38
    :cond_2
    move v2, v13

    .line 39
    :goto_1
    and-int/lit8 v3, v14, 0x2

    .line 40
    .line 41
    if-eqz v3, :cond_4

    .line 42
    .line 43
    or-int/lit8 v2, v2, 0x30

    .line 44
    .line 45
    :cond_3
    move-object/from16 v4, p1

    .line 46
    .line 47
    goto :goto_3

    .line 48
    :cond_4
    and-int/lit8 v4, v13, 0x30

    .line 49
    .line 50
    if-nez v4, :cond_3

    .line 51
    .line 52
    move-object/from16 v4, p1

    .line 53
    .line 54
    invoke-interface {v11, v4}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 55
    .line 56
    .line 57
    move-result v5

    .line 58
    if-eqz v5, :cond_5

    .line 59
    .line 60
    const/16 v5, 0x20

    .line 61
    .line 62
    goto :goto_2

    .line 63
    :cond_5
    const/16 v5, 0x10

    .line 64
    .line 65
    :goto_2
    or-int/2addr v2, v5

    .line 66
    :goto_3
    and-int/lit16 v5, v13, 0x180

    .line 67
    .line 68
    if-nez v5, :cond_8

    .line 69
    .line 70
    and-int/lit8 v5, v14, 0x4

    .line 71
    .line 72
    if-nez v5, :cond_6

    .line 73
    .line 74
    move-object/from16 v5, p2

    .line 75
    .line 76
    invoke-interface {v11, v5}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 77
    .line 78
    .line 79
    move-result v6

    .line 80
    if-eqz v6, :cond_7

    .line 81
    .line 82
    const/16 v6, 0x100

    .line 83
    .line 84
    goto :goto_4

    .line 85
    :cond_6
    move-object/from16 v5, p2

    .line 86
    .line 87
    :cond_7
    const/16 v6, 0x80

    .line 88
    .line 89
    :goto_4
    or-int/2addr v2, v6

    .line 90
    goto :goto_5

    .line 91
    :cond_8
    move-object/from16 v5, p2

    .line 92
    .line 93
    :goto_5
    and-int/lit16 v6, v13, 0xc00

    .line 94
    .line 95
    if-nez v6, :cond_b

    .line 96
    .line 97
    and-int/lit8 v6, v14, 0x8

    .line 98
    .line 99
    if-nez v6, :cond_9

    .line 100
    .line 101
    move-wide/from16 v6, p3

    .line 102
    .line 103
    invoke-interface {v11, v6, v7}, Landroidx/compose/runtime/Composer;->changed(J)Z

    .line 104
    .line 105
    .line 106
    move-result v8

    .line 107
    if-eqz v8, :cond_a

    .line 108
    .line 109
    const/16 v8, 0x800

    .line 110
    .line 111
    goto :goto_6

    .line 112
    :cond_9
    move-wide/from16 v6, p3

    .line 113
    .line 114
    :cond_a
    const/16 v8, 0x400

    .line 115
    .line 116
    :goto_6
    or-int/2addr v2, v8

    .line 117
    goto :goto_7

    .line 118
    :cond_b
    move-wide/from16 v6, p3

    .line 119
    .line 120
    :goto_7
    and-int/lit16 v8, v13, 0x6000

    .line 121
    .line 122
    if-nez v8, :cond_e

    .line 123
    .line 124
    and-int/lit8 v8, v14, 0x10

    .line 125
    .line 126
    if-nez v8, :cond_c

    .line 127
    .line 128
    move-wide/from16 v8, p5

    .line 129
    .line 130
    invoke-interface {v11, v8, v9}, Landroidx/compose/runtime/Composer;->changed(J)Z

    .line 131
    .line 132
    .line 133
    move-result v10

    .line 134
    if-eqz v10, :cond_d

    .line 135
    .line 136
    const/16 v10, 0x4000

    .line 137
    .line 138
    goto :goto_8

    .line 139
    :cond_c
    move-wide/from16 v8, p5

    .line 140
    .line 141
    :cond_d
    const/16 v10, 0x2000

    .line 142
    .line 143
    :goto_8
    or-int/2addr v2, v10

    .line 144
    goto :goto_9

    .line 145
    :cond_e
    move-wide/from16 v8, p5

    .line 146
    .line 147
    :goto_9
    and-int/lit8 v10, v14, 0x20

    .line 148
    .line 149
    const/high16 v12, 0x30000

    .line 150
    .line 151
    if-eqz v10, :cond_10

    .line 152
    .line 153
    or-int/2addr v2, v12

    .line 154
    :cond_f
    move/from16 v12, p7

    .line 155
    .line 156
    goto :goto_b

    .line 157
    :cond_10
    and-int/2addr v12, v13

    .line 158
    if-nez v12, :cond_f

    .line 159
    .line 160
    move/from16 v12, p7

    .line 161
    .line 162
    invoke-interface {v11, v12}, Landroidx/compose/runtime/Composer;->changed(F)Z

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
    and-int/lit8 v15, v14, 0x40

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
    move-object/from16 v1, p8

    .line 183
    .line 184
    goto :goto_d

    .line 185
    :cond_12
    and-int v16, v13, v16

    .line 186
    .line 187
    move-object/from16 v1, p8

    .line 188
    .line 189
    if-nez v16, :cond_14

    .line 190
    .line 191
    invoke-interface {v11, v1}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

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
    and-int/lit16 v1, v14, 0x80

    .line 205
    .line 206
    const/high16 v17, 0xc00000

    .line 207
    .line 208
    if-eqz v1, :cond_16

    .line 209
    .line 210
    or-int v2, v2, v17

    .line 211
    .line 212
    :cond_15
    move/from16 v17, v1

    .line 213
    .line 214
    move-object/from16 v1, p9

    .line 215
    .line 216
    goto :goto_f

    .line 217
    :cond_16
    and-int v17, v13, v17

    .line 218
    .line 219
    if-nez v17, :cond_15

    .line 220
    .line 221
    move/from16 v17, v1

    .line 222
    .line 223
    move-object/from16 v1, p9

    .line 224
    .line 225
    invoke-interface {v11, v1}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 226
    .line 227
    .line 228
    move-result v18

    .line 229
    if-eqz v18, :cond_17

    .line 230
    .line 231
    const/high16 v18, 0x800000

    .line 232
    .line 233
    goto :goto_e

    .line 234
    :cond_17
    const/high16 v18, 0x400000

    .line 235
    .line 236
    :goto_e
    or-int v2, v2, v18

    .line 237
    .line 238
    :goto_f
    and-int/lit16 v1, v14, 0x100

    .line 239
    .line 240
    const/high16 v18, 0x6000000

    .line 241
    .line 242
    if-eqz v1, :cond_19

    .line 243
    .line 244
    or-int v2, v2, v18

    .line 245
    .line 246
    :cond_18
    move-object/from16 v1, p10

    .line 247
    .line 248
    goto :goto_11

    .line 249
    :cond_19
    and-int v1, v13, v18

    .line 250
    .line 251
    if-nez v1, :cond_18

    .line 252
    .line 253
    move-object/from16 v1, p10

    .line 254
    .line 255
    invoke-interface {v11, v1}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 256
    .line 257
    .line 258
    move-result v18

    .line 259
    if-eqz v18, :cond_1a

    .line 260
    .line 261
    const/high16 v18, 0x4000000

    .line 262
    .line 263
    goto :goto_10

    .line 264
    :cond_1a
    const/high16 v18, 0x2000000

    .line 265
    .line 266
    :goto_10
    or-int v2, v2, v18

    .line 267
    .line 268
    :goto_11
    const v18, 0x2492493

    .line 269
    .line 270
    .line 271
    and-int v1, v2, v18

    .line 272
    .line 273
    move/from16 p11, v3

    .line 274
    .line 275
    const v3, 0x2492492

    .line 276
    .line 277
    .line 278
    if-ne v1, v3, :cond_1c

    .line 279
    .line 280
    invoke-interface {v11}, Landroidx/compose/runtime/Composer;->getSkipping()Z

    .line 281
    .line 282
    .line 283
    move-result v1

    .line 284
    if-nez v1, :cond_1b

    .line 285
    .line 286
    goto :goto_12

    .line 287
    :cond_1b
    invoke-interface {v11}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    .line 288
    .line 289
    .line 290
    move-object/from16 v10, p9

    .line 291
    .line 292
    move-object v2, v4

    .line 293
    move-object v3, v5

    .line 294
    move-wide v4, v6

    .line 295
    move-wide v6, v8

    .line 296
    move v8, v12

    .line 297
    move-object/from16 v9, p8

    .line 298
    .line 299
    goto/16 :goto_17

    .line 300
    .line 301
    :cond_1c
    :goto_12
    invoke-interface {v11}, Landroidx/compose/runtime/Composer;->startDefaults()V

    .line 302
    .line 303
    .line 304
    and-int/lit8 v1, v13, 0x1

    .line 305
    .line 306
    const v3, -0xe001

    .line 307
    .line 308
    .line 309
    if-eqz v1, :cond_21

    .line 310
    .line 311
    invoke-interface {v11}, Landroidx/compose/runtime/Composer;->getDefaultsInvalid()Z

    .line 312
    .line 313
    .line 314
    move-result v1

    .line 315
    if-eqz v1, :cond_1d

    .line 316
    .line 317
    goto :goto_13

    .line 318
    :cond_1d
    invoke-interface {v11}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    .line 319
    .line 320
    .line 321
    and-int/lit8 v1, v14, 0x4

    .line 322
    .line 323
    if-eqz v1, :cond_1e

    .line 324
    .line 325
    and-int/lit16 v2, v2, -0x381

    .line 326
    .line 327
    :cond_1e
    and-int/lit8 v1, v14, 0x8

    .line 328
    .line 329
    if-eqz v1, :cond_1f

    .line 330
    .line 331
    and-int/lit16 v2, v2, -0x1c01

    .line 332
    .line 333
    :cond_1f
    and-int/lit8 v1, v14, 0x10

    .line 334
    .line 335
    if-eqz v1, :cond_20

    .line 336
    .line 337
    and-int/2addr v2, v3

    .line 338
    :cond_20
    move v10, v2

    .line 339
    move-object v1, v4

    .line 340
    move-wide v2, v6

    .line 341
    move v6, v12

    .line 342
    move-object v7, v5

    .line 343
    move-wide v4, v8

    .line 344
    move-object/from16 v8, p8

    .line 345
    .line 346
    move-object/from16 v9, p9

    .line 347
    .line 348
    goto/16 :goto_16

    .line 349
    .line 350
    :cond_21
    :goto_13
    if-eqz p11, :cond_22

    .line 351
    .line 352
    sget-object v1, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    .line 353
    .line 354
    move-object v4, v1

    .line 355
    :cond_22
    and-int/lit8 v1, v14, 0x4

    .line 356
    .line 357
    move/from16 p11, v3

    .line 358
    .line 359
    const/4 v3, 0x1

    .line 360
    if-eqz v1, :cond_23

    .line 361
    .line 362
    const/4 v1, 0x0

    .line 363
    invoke-static {v1, v11, v1, v3}, Landroidx/compose/foundation/ScrollKt;->rememberScrollState(ILandroidx/compose/runtime/Composer;II)Landroidx/compose/foundation/ScrollState;

    .line 364
    .line 365
    .line 366
    move-result-object v1

    .line 367
    and-int/lit16 v2, v2, -0x381

    .line 368
    .line 369
    move-object v5, v1

    .line 370
    :cond_23
    and-int/lit8 v1, v14, 0x8

    .line 371
    .line 372
    const/4 v3, 0x6

    .line 373
    if-eqz v1, :cond_24

    .line 374
    .line 375
    sget-object v1, Landroidx/compose/material3/TabRowDefaults;->INSTANCE:Landroidx/compose/material3/TabRowDefaults;

    .line 376
    .line 377
    invoke-virtual {v1, v11, v3}, Landroidx/compose/material3/TabRowDefaults;->getSecondaryContainerColor(Landroidx/compose/runtime/Composer;I)J

    .line 378
    .line 379
    .line 380
    move-result-wide v6

    .line 381
    and-int/lit16 v2, v2, -0x1c01

    .line 382
    .line 383
    :cond_24
    and-int/lit8 v1, v14, 0x10

    .line 384
    .line 385
    if-eqz v1, :cond_25

    .line 386
    .line 387
    sget-object v1, Landroidx/compose/material3/TabRowDefaults;->INSTANCE:Landroidx/compose/material3/TabRowDefaults;

    .line 388
    .line 389
    invoke-virtual {v1, v11, v3}, Landroidx/compose/material3/TabRowDefaults;->getSecondaryContentColor(Landroidx/compose/runtime/Composer;I)J

    .line 390
    .line 391
    .line 392
    move-result-wide v8

    .line 393
    and-int v1, v2, p11

    .line 394
    .line 395
    move v2, v1

    .line 396
    :cond_25
    if-eqz v10, :cond_26

    .line 397
    .line 398
    sget-object v1, Landroidx/compose/material3/TabRowDefaults;->INSTANCE:Landroidx/compose/material3/TabRowDefaults;

    .line 399
    .line 400
    invoke-virtual {v1}, Landroidx/compose/material3/TabRowDefaults;->getScrollableTabRowEdgeStartPadding-D9Ej5fM()F

    .line 401
    .line 402
    .line 403
    move-result v1

    .line 404
    move v12, v1

    .line 405
    :cond_26
    if-eqz v15, :cond_27

    .line 406
    .line 407
    new-instance v1, Landroidx/compose/material3/TabRowKt$SecondaryScrollableTabRow$1;

    .line 408
    .line 409
    invoke-direct {v1, v0}, Landroidx/compose/material3/TabRowKt$SecondaryScrollableTabRow$1;-><init>(I)V

    .line 410
    .line 411
    .line 412
    const/16 v3, 0x36

    .line 413
    .line 414
    const v10, 0x5b8b18a6

    .line 415
    .line 416
    .line 417
    const/4 v15, 0x1

    .line 418
    invoke-static {v10, v15, v1, v11, v3}, Landroidx/compose/runtime/internal/ComposableLambdaKt;->rememberComposableLambda(IZLjava/lang/Object;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/internal/ComposableLambda;

    .line 419
    .line 420
    .line 421
    move-result-object v1

    .line 422
    goto :goto_14

    .line 423
    :cond_27
    move-object/from16 v1, p8

    .line 424
    .line 425
    :goto_14
    if-eqz v17, :cond_28

    .line 426
    .line 427
    sget-object v3, Landroidx/compose/material3/ComposableSingletons$TabRowKt;->INSTANCE:Landroidx/compose/material3/ComposableSingletons$TabRowKt;

    .line 428
    .line 429
    invoke-virtual {v3}, Landroidx/compose/material3/ComposableSingletons$TabRowKt;->getLambda-5$material3_release()Lkotlin/jvm/functions/Function2;

    .line 430
    .line 431
    .line 432
    move-result-object v3

    .line 433
    move v10, v2

    .line 434
    move-wide/from16 v19, v8

    .line 435
    .line 436
    move-object v8, v1

    .line 437
    move-object v9, v3

    .line 438
    move-object v1, v4

    .line 439
    move-wide v2, v6

    .line 440
    move v6, v12

    .line 441
    move-object v7, v5

    .line 442
    :goto_15
    move-wide/from16 v4, v19

    .line 443
    .line 444
    goto :goto_16

    .line 445
    :cond_28
    move v10, v2

    .line 446
    move-wide v2, v6

    .line 447
    move v6, v12

    .line 448
    move-object v7, v5

    .line 449
    move-wide/from16 v19, v8

    .line 450
    .line 451
    move-object/from16 v9, p9

    .line 452
    .line 453
    move-object v8, v1

    .line 454
    move-object v1, v4

    .line 455
    goto :goto_15

    .line 456
    :goto_16
    invoke-interface {v11}, Landroidx/compose/runtime/Composer;->endDefaults()V

    .line 457
    .line 458
    .line 459
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 460
    .line 461
    .line 462
    move-result v12

    .line 463
    if-eqz v12, :cond_29

    .line 464
    .line 465
    const/4 v12, -0x1

    .line 466
    const-string/jumbo v15, "androidx.compose.material3.SecondaryScrollableTabRow (TabRow.kt:440)"

    .line 467
    .line 468
    .line 469
    const v0, 0x6c989cb5

    .line 470
    .line 471
    .line 472
    invoke-static {v0, v10, v12, v15}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 473
    .line 474
    .line 475
    :cond_29
    and-int/lit8 v0, v10, 0x7e

    .line 476
    .line 477
    shr-int/lit8 v12, v10, 0x3

    .line 478
    .line 479
    and-int/lit16 v15, v12, 0x380

    .line 480
    .line 481
    or-int/2addr v0, v15

    .line 482
    and-int/lit16 v15, v12, 0x1c00

    .line 483
    .line 484
    or-int/2addr v0, v15

    .line 485
    const v15, 0xe000

    .line 486
    .line 487
    .line 488
    and-int/2addr v12, v15

    .line 489
    or-int/2addr v0, v12

    .line 490
    shl-int/lit8 v12, v10, 0x9

    .line 491
    .line 492
    const/high16 v15, 0x70000

    .line 493
    .line 494
    and-int/2addr v12, v15

    .line 495
    or-int/2addr v0, v12

    .line 496
    const/high16 v12, 0x380000

    .line 497
    .line 498
    and-int/2addr v12, v10

    .line 499
    or-int/2addr v0, v12

    .line 500
    const/high16 v12, 0x1c00000

    .line 501
    .line 502
    and-int/2addr v12, v10

    .line 503
    or-int/2addr v0, v12

    .line 504
    const/high16 v12, 0xe000000

    .line 505
    .line 506
    and-int/2addr v10, v12

    .line 507
    or-int v12, v0, v10

    .line 508
    .line 509
    move/from16 v0, p0

    .line 510
    .line 511
    move-object/from16 v10, p10

    .line 512
    .line 513
    invoke-static/range {v0 .. v12}, Landroidx/compose/material3/TabRowKt;->ScrollableTabRowImpl-sKfQg0A(ILandroidx/compose/ui/Modifier;JJFLandroidx/compose/foundation/ScrollState;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V

    .line 514
    .line 515
    .line 516
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 517
    .line 518
    .line 519
    move-result v0

    .line 520
    if-eqz v0, :cond_2a

    .line 521
    .line 522
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 523
    .line 524
    .line 525
    :cond_2a
    move-object v10, v9

    .line 526
    move-object v9, v8

    .line 527
    move v8, v6

    .line 528
    move-wide/from16 v19, v2

    .line 529
    .line 530
    move-object v2, v1

    .line 531
    move-object v3, v7

    .line 532
    move-wide v6, v4

    .line 533
    move-wide/from16 v4, v19

    .line 534
    .line 535
    :goto_17
    invoke-interface {v11}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    .line 536
    .line 537
    .line 538
    move-result-object v15

    .line 539
    if-eqz v15, :cond_2b

    .line 540
    .line 541
    new-instance v0, Landroidx/compose/material3/TabRowKt$SecondaryScrollableTabRow$2;

    .line 542
    .line 543
    move/from16 v1, p0

    .line 544
    .line 545
    move-object/from16 v11, p10

    .line 546
    .line 547
    move v12, v13

    .line 548
    move v13, v14

    .line 549
    invoke-direct/range {v0 .. v13}, Landroidx/compose/material3/TabRowKt$SecondaryScrollableTabRow$2;-><init>(ILandroidx/compose/ui/Modifier;Landroidx/compose/foundation/ScrollState;JJFLkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;II)V

    .line 550
    .line 551
    .line 552
    invoke-interface {v15, v0}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lkotlin/jvm/functions/Function2;)V

    .line 553
    .line 554
    .line 555
    :cond_2b
    return-void
.end method

.method public static final SecondaryTabRow-pAZo6Ak(ILandroidx/compose/ui/Modifier;JJLkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V
    .locals 21
    .annotation build Landroidx/compose/material3/ExperimentalMaterial3Api;
    .end annotation

    .annotation build Landroidx/compose/runtime/Composable;
    .end annotation

    .annotation build Landroidx/compose/runtime/ComposableInferredTarget;
        scheme = "[androidx.compose.ui.UiComposable[_][_][_]]"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Landroidx/compose/ui/Modifier;",
            "JJ",
            "Lkotlin/jvm/functions/Function3<",
            "-",
            "Landroidx/compose/material3/TabIndicatorScope;",
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
    const v0, -0x71d14762

    .line 6
    .line 7
    .line 8
    move-object/from16 v2, p9

    .line 9
    .line 10
    invoke-interface {v2, v0}, Landroidx/compose/runtime/Composer;->startRestartGroup(I)Landroidx/compose/runtime/Composer;

    .line 11
    .line 12
    .line 13
    move-result-object v2

    .line 14
    and-int/lit8 v3, p11, 0x1

    .line 15
    .line 16
    if-eqz v3, :cond_0

    .line 17
    .line 18
    or-int/lit8 v3, v10, 0x6

    .line 19
    .line 20
    goto :goto_1

    .line 21
    :cond_0
    and-int/lit8 v3, v10, 0x6

    .line 22
    .line 23
    if-nez v3, :cond_2

    .line 24
    .line 25
    invoke-interface {v2, v1}, Landroidx/compose/runtime/Composer;->changed(I)Z

    .line 26
    .line 27
    .line 28
    move-result v3

    .line 29
    if-eqz v3, :cond_1

    .line 30
    .line 31
    const/4 v3, 0x4

    .line 32
    goto :goto_0

    .line 33
    :cond_1
    const/4 v3, 0x2

    .line 34
    :goto_0
    or-int/2addr v3, v10

    .line 35
    goto :goto_1

    .line 36
    :cond_2
    move v3, v10

    .line 37
    :goto_1
    and-int/lit8 v4, p11, 0x2

    .line 38
    .line 39
    if-eqz v4, :cond_4

    .line 40
    .line 41
    or-int/lit8 v3, v3, 0x30

    .line 42
    .line 43
    :cond_3
    move-object/from16 v5, p1

    .line 44
    .line 45
    goto :goto_3

    .line 46
    :cond_4
    and-int/lit8 v5, v10, 0x30

    .line 47
    .line 48
    if-nez v5, :cond_3

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
    if-eqz v6, :cond_5

    .line 57
    .line 58
    const/16 v6, 0x20

    .line 59
    .line 60
    goto :goto_2

    .line 61
    :cond_5
    const/16 v6, 0x10

    .line 62
    .line 63
    :goto_2
    or-int/2addr v3, v6

    .line 64
    :goto_3
    and-int/lit16 v6, v10, 0x180

    .line 65
    .line 66
    if-nez v6, :cond_8

    .line 67
    .line 68
    and-int/lit8 v6, p11, 0x4

    .line 69
    .line 70
    if-nez v6, :cond_6

    .line 71
    .line 72
    move-wide/from16 v6, p2

    .line 73
    .line 74
    invoke-interface {v2, v6, v7}, Landroidx/compose/runtime/Composer;->changed(J)Z

    .line 75
    .line 76
    .line 77
    move-result v8

    .line 78
    if-eqz v8, :cond_7

    .line 79
    .line 80
    const/16 v8, 0x100

    .line 81
    .line 82
    goto :goto_4

    .line 83
    :cond_6
    move-wide/from16 v6, p2

    .line 84
    .line 85
    :cond_7
    const/16 v8, 0x80

    .line 86
    .line 87
    :goto_4
    or-int/2addr v3, v8

    .line 88
    goto :goto_5

    .line 89
    :cond_8
    move-wide/from16 v6, p2

    .line 90
    .line 91
    :goto_5
    and-int/lit16 v8, v10, 0xc00

    .line 92
    .line 93
    if-nez v8, :cond_b

    .line 94
    .line 95
    and-int/lit8 v8, p11, 0x8

    .line 96
    .line 97
    if-nez v8, :cond_9

    .line 98
    .line 99
    move-wide/from16 v8, p4

    .line 100
    .line 101
    invoke-interface {v2, v8, v9}, Landroidx/compose/runtime/Composer;->changed(J)Z

    .line 102
    .line 103
    .line 104
    move-result v11

    .line 105
    if-eqz v11, :cond_a

    .line 106
    .line 107
    const/16 v11, 0x800

    .line 108
    .line 109
    goto :goto_6

    .line 110
    :cond_9
    move-wide/from16 v8, p4

    .line 111
    .line 112
    :cond_a
    const/16 v11, 0x400

    .line 113
    .line 114
    :goto_6
    or-int/2addr v3, v11

    .line 115
    goto :goto_7

    .line 116
    :cond_b
    move-wide/from16 v8, p4

    .line 117
    .line 118
    :goto_7
    and-int/lit8 v11, p11, 0x10

    .line 119
    .line 120
    if-eqz v11, :cond_d

    .line 121
    .line 122
    or-int/lit16 v3, v3, 0x6000

    .line 123
    .line 124
    :cond_c
    move-object/from16 v12, p6

    .line 125
    .line 126
    goto :goto_9

    .line 127
    :cond_d
    and-int/lit16 v12, v10, 0x6000

    .line 128
    .line 129
    if-nez v12, :cond_c

    .line 130
    .line 131
    move-object/from16 v12, p6

    .line 132
    .line 133
    invoke-interface {v2, v12}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 134
    .line 135
    .line 136
    move-result v13

    .line 137
    if-eqz v13, :cond_e

    .line 138
    .line 139
    const/16 v13, 0x4000

    .line 140
    .line 141
    goto :goto_8

    .line 142
    :cond_e
    const/16 v13, 0x2000

    .line 143
    .line 144
    :goto_8
    or-int/2addr v3, v13

    .line 145
    :goto_9
    and-int/lit8 v13, p11, 0x20

    .line 146
    .line 147
    const/high16 v14, 0x30000

    .line 148
    .line 149
    if-eqz v13, :cond_10

    .line 150
    .line 151
    or-int/2addr v3, v14

    .line 152
    :cond_f
    move-object/from16 v14, p7

    .line 153
    .line 154
    goto :goto_b

    .line 155
    :cond_10
    and-int/2addr v14, v10

    .line 156
    if-nez v14, :cond_f

    .line 157
    .line 158
    move-object/from16 v14, p7

    .line 159
    .line 160
    invoke-interface {v2, v14}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 161
    .line 162
    .line 163
    move-result v15

    .line 164
    if-eqz v15, :cond_11

    .line 165
    .line 166
    const/high16 v15, 0x20000

    .line 167
    .line 168
    goto :goto_a

    .line 169
    :cond_11
    const/high16 v15, 0x10000

    .line 170
    .line 171
    :goto_a
    or-int/2addr v3, v15

    .line 172
    :goto_b
    and-int/lit8 v15, p11, 0x40

    .line 173
    .line 174
    const/high16 v16, 0x180000

    .line 175
    .line 176
    if-eqz v15, :cond_13

    .line 177
    .line 178
    or-int v3, v3, v16

    .line 179
    .line 180
    :cond_12
    move-object/from16 v15, p8

    .line 181
    .line 182
    goto :goto_d

    .line 183
    :cond_13
    and-int v15, v10, v16

    .line 184
    .line 185
    if-nez v15, :cond_12

    .line 186
    .line 187
    move-object/from16 v15, p8

    .line 188
    .line 189
    invoke-interface {v2, v15}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 190
    .line 191
    .line 192
    move-result v16

    .line 193
    if-eqz v16, :cond_14

    .line 194
    .line 195
    const/high16 v16, 0x100000

    .line 196
    .line 197
    goto :goto_c

    .line 198
    :cond_14
    const/high16 v16, 0x80000

    .line 199
    .line 200
    :goto_c
    or-int v3, v3, v16

    .line 201
    .line 202
    :goto_d
    const v16, 0x92493

    .line 203
    .line 204
    .line 205
    and-int v0, v3, v16

    .line 206
    .line 207
    move/from16 p9, v4

    .line 208
    .line 209
    const v4, 0x92492

    .line 210
    .line 211
    .line 212
    if-ne v0, v4, :cond_16

    .line 213
    .line 214
    invoke-interface {v2}, Landroidx/compose/runtime/Composer;->getSkipping()Z

    .line 215
    .line 216
    .line 217
    move-result v0

    .line 218
    if-nez v0, :cond_15

    .line 219
    .line 220
    goto :goto_e

    .line 221
    :cond_15
    invoke-interface {v2}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    .line 222
    .line 223
    .line 224
    move-object/from16 v19, v2

    .line 225
    .line 226
    move-object v2, v5

    .line 227
    move-wide v3, v6

    .line 228
    move-wide v5, v8

    .line 229
    move-object v7, v12

    .line 230
    move-object v8, v14

    .line 231
    goto/16 :goto_11

    .line 232
    .line 233
    :cond_16
    :goto_e
    invoke-interface {v2}, Landroidx/compose/runtime/Composer;->startDefaults()V

    .line 234
    .line 235
    .line 236
    and-int/lit8 v0, v10, 0x1

    .line 237
    .line 238
    if-eqz v0, :cond_1a

    .line 239
    .line 240
    invoke-interface {v2}, Landroidx/compose/runtime/Composer;->getDefaultsInvalid()Z

    .line 241
    .line 242
    .line 243
    move-result v0

    .line 244
    if-eqz v0, :cond_17

    .line 245
    .line 246
    goto :goto_f

    .line 247
    :cond_17
    invoke-interface {v2}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    .line 248
    .line 249
    .line 250
    and-int/lit8 v0, p11, 0x4

    .line 251
    .line 252
    if-eqz v0, :cond_18

    .line 253
    .line 254
    and-int/lit16 v3, v3, -0x381

    .line 255
    .line 256
    :cond_18
    and-int/lit8 v0, p11, 0x8

    .line 257
    .line 258
    if-eqz v0, :cond_19

    .line 259
    .line 260
    and-int/lit16 v3, v3, -0x1c01

    .line 261
    .line 262
    :cond_19
    move-object v11, v5

    .line 263
    move-object/from16 v16, v12

    .line 264
    .line 265
    move-object/from16 v17, v14

    .line 266
    .line 267
    const v0, -0x71d14762

    .line 268
    .line 269
    .line 270
    move-wide v12, v6

    .line 271
    move-wide v14, v8

    .line 272
    goto :goto_10

    .line 273
    :cond_1a
    :goto_f
    if-eqz p9, :cond_1b

    .line 274
    .line 275
    sget-object v0, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    .line 276
    .line 277
    move-object v5, v0

    .line 278
    :cond_1b
    and-int/lit8 v0, p11, 0x4

    .line 279
    .line 280
    const/4 v4, 0x6

    .line 281
    if-eqz v0, :cond_1c

    .line 282
    .line 283
    sget-object v0, Landroidx/compose/material3/TabRowDefaults;->INSTANCE:Landroidx/compose/material3/TabRowDefaults;

    .line 284
    .line 285
    invoke-virtual {v0, v2, v4}, Landroidx/compose/material3/TabRowDefaults;->getSecondaryContainerColor(Landroidx/compose/runtime/Composer;I)J

    .line 286
    .line 287
    .line 288
    move-result-wide v6

    .line 289
    and-int/lit16 v3, v3, -0x381

    .line 290
    .line 291
    :cond_1c
    and-int/lit8 v0, p11, 0x8

    .line 292
    .line 293
    if-eqz v0, :cond_1d

    .line 294
    .line 295
    sget-object v0, Landroidx/compose/material3/TabRowDefaults;->INSTANCE:Landroidx/compose/material3/TabRowDefaults;

    .line 296
    .line 297
    invoke-virtual {v0, v2, v4}, Landroidx/compose/material3/TabRowDefaults;->getSecondaryContentColor(Landroidx/compose/runtime/Composer;I)J

    .line 298
    .line 299
    .line 300
    move-result-wide v8

    .line 301
    and-int/lit16 v0, v3, -0x1c01

    .line 302
    .line 303
    move v3, v0

    .line 304
    :cond_1d
    if-eqz v11, :cond_1e

    .line 305
    .line 306
    new-instance v0, Landroidx/compose/material3/TabRowKt$SecondaryTabRow$1;

    .line 307
    .line 308
    invoke-direct {v0, v1}, Landroidx/compose/material3/TabRowKt$SecondaryTabRow$1;-><init>(I)V

    .line 309
    .line 310
    .line 311
    const/16 v4, 0x36

    .line 312
    .line 313
    const v11, 0x1116978d

    .line 314
    .line 315
    .line 316
    const/4 v12, 0x1

    .line 317
    invoke-static {v11, v12, v0, v2, v4}, Landroidx/compose/runtime/internal/ComposableLambdaKt;->rememberComposableLambda(IZLjava/lang/Object;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/internal/ComposableLambda;

    .line 318
    .line 319
    .line 320
    move-result-object v0

    .line 321
    move-object v12, v0

    .line 322
    :cond_1e
    if-eqz v13, :cond_19

    .line 323
    .line 324
    sget-object v0, Landroidx/compose/material3/ComposableSingletons$TabRowKt;->INSTANCE:Landroidx/compose/material3/ComposableSingletons$TabRowKt;

    .line 325
    .line 326
    invoke-virtual {v0}, Landroidx/compose/material3/ComposableSingletons$TabRowKt;->getLambda-2$material3_release()Lkotlin/jvm/functions/Function2;

    .line 327
    .line 328
    .line 329
    move-result-object v0

    .line 330
    move-object/from16 v17, v0

    .line 331
    .line 332
    move-object v11, v5

    .line 333
    move-wide v14, v8

    .line 334
    move-object/from16 v16, v12

    .line 335
    .line 336
    const v0, -0x71d14762

    .line 337
    .line 338
    .line 339
    move-wide v12, v6

    .line 340
    :goto_10
    invoke-interface {v2}, Landroidx/compose/runtime/Composer;->endDefaults()V

    .line 341
    .line 342
    .line 343
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 344
    .line 345
    .line 346
    move-result v4

    .line 347
    if-eqz v4, :cond_1f

    .line 348
    .line 349
    const/4 v4, -0x1

    .line 350
    const-string/jumbo v5, "androidx.compose.material3.SecondaryTabRow (TabRow.kt:219)"

    .line 351
    .line 352
    .line 353
    invoke-static {v0, v3, v4, v5}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 354
    .line 355
    .line 356
    :cond_1f
    shr-int/lit8 v0, v3, 0x3

    .line 357
    .line 358
    const v3, 0x7fffe

    .line 359
    .line 360
    .line 361
    and-int v20, v0, v3

    .line 362
    .line 363
    move-object/from16 v18, p8

    .line 364
    .line 365
    move-object/from16 v19, v2

    .line 366
    .line 367
    invoke-static/range {v11 .. v20}, Landroidx/compose/material3/TabRowKt;->TabRowImpl-DTcfvLk(Landroidx/compose/ui/Modifier;JJLkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V

    .line 368
    .line 369
    .line 370
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 371
    .line 372
    .line 373
    move-result v0

    .line 374
    if-eqz v0, :cond_20

    .line 375
    .line 376
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 377
    .line 378
    .line 379
    :cond_20
    move-object v2, v11

    .line 380
    move-wide v3, v12

    .line 381
    move-wide v5, v14

    .line 382
    move-object/from16 v7, v16

    .line 383
    .line 384
    move-object/from16 v8, v17

    .line 385
    .line 386
    :goto_11
    invoke-interface/range {v19 .. v19}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    .line 387
    .line 388
    .line 389
    move-result-object v12

    .line 390
    if-eqz v12, :cond_21

    .line 391
    .line 392
    new-instance v0, Landroidx/compose/material3/TabRowKt$SecondaryTabRow$2;

    .line 393
    .line 394
    move-object/from16 v9, p8

    .line 395
    .line 396
    move/from16 v11, p11

    .line 397
    .line 398
    invoke-direct/range {v0 .. v11}, Landroidx/compose/material3/TabRowKt$SecondaryTabRow$2;-><init>(ILandroidx/compose/ui/Modifier;JJLkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;II)V

    .line 399
    .line 400
    .line 401
    invoke-interface {v12, v0}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lkotlin/jvm/functions/Function2;)V

    .line 402
    .line 403
    .line 404
    :cond_21
    return-void
.end method

.method public static final TabRow-pAZo6Ak(ILandroidx/compose/ui/Modifier;JJLkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V
    .locals 21
    .annotation build Landroidx/compose/runtime/Composable;
    .end annotation

    .annotation build Landroidx/compose/runtime/ComposableInferredTarget;
        scheme = "[androidx.compose.ui.UiComposable[_][_][_]]"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Landroidx/compose/ui/Modifier;",
            "JJ",
            "Lkotlin/jvm/functions/Function3<",
            "-",
            "Ljava/util/List<",
            "Landroidx/compose/material3/TabPosition;",
            ">;-",
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
    const v0, -0x477a035a

    .line 6
    .line 7
    .line 8
    move-object/from16 v2, p9

    .line 9
    .line 10
    invoke-interface {v2, v0}, Landroidx/compose/runtime/Composer;->startRestartGroup(I)Landroidx/compose/runtime/Composer;

    .line 11
    .line 12
    .line 13
    move-result-object v2

    .line 14
    and-int/lit8 v3, p11, 0x1

    .line 15
    .line 16
    if-eqz v3, :cond_0

    .line 17
    .line 18
    or-int/lit8 v3, v10, 0x6

    .line 19
    .line 20
    goto :goto_1

    .line 21
    :cond_0
    and-int/lit8 v3, v10, 0x6

    .line 22
    .line 23
    if-nez v3, :cond_2

    .line 24
    .line 25
    invoke-interface {v2, v1}, Landroidx/compose/runtime/Composer;->changed(I)Z

    .line 26
    .line 27
    .line 28
    move-result v3

    .line 29
    if-eqz v3, :cond_1

    .line 30
    .line 31
    const/4 v3, 0x4

    .line 32
    goto :goto_0

    .line 33
    :cond_1
    const/4 v3, 0x2

    .line 34
    :goto_0
    or-int/2addr v3, v10

    .line 35
    goto :goto_1

    .line 36
    :cond_2
    move v3, v10

    .line 37
    :goto_1
    and-int/lit8 v4, p11, 0x2

    .line 38
    .line 39
    if-eqz v4, :cond_4

    .line 40
    .line 41
    or-int/lit8 v3, v3, 0x30

    .line 42
    .line 43
    :cond_3
    move-object/from16 v5, p1

    .line 44
    .line 45
    goto :goto_3

    .line 46
    :cond_4
    and-int/lit8 v5, v10, 0x30

    .line 47
    .line 48
    if-nez v5, :cond_3

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
    if-eqz v6, :cond_5

    .line 57
    .line 58
    const/16 v6, 0x20

    .line 59
    .line 60
    goto :goto_2

    .line 61
    :cond_5
    const/16 v6, 0x10

    .line 62
    .line 63
    :goto_2
    or-int/2addr v3, v6

    .line 64
    :goto_3
    and-int/lit16 v6, v10, 0x180

    .line 65
    .line 66
    if-nez v6, :cond_8

    .line 67
    .line 68
    and-int/lit8 v6, p11, 0x4

    .line 69
    .line 70
    if-nez v6, :cond_6

    .line 71
    .line 72
    move-wide/from16 v6, p2

    .line 73
    .line 74
    invoke-interface {v2, v6, v7}, Landroidx/compose/runtime/Composer;->changed(J)Z

    .line 75
    .line 76
    .line 77
    move-result v8

    .line 78
    if-eqz v8, :cond_7

    .line 79
    .line 80
    const/16 v8, 0x100

    .line 81
    .line 82
    goto :goto_4

    .line 83
    :cond_6
    move-wide/from16 v6, p2

    .line 84
    .line 85
    :cond_7
    const/16 v8, 0x80

    .line 86
    .line 87
    :goto_4
    or-int/2addr v3, v8

    .line 88
    goto :goto_5

    .line 89
    :cond_8
    move-wide/from16 v6, p2

    .line 90
    .line 91
    :goto_5
    and-int/lit16 v8, v10, 0xc00

    .line 92
    .line 93
    if-nez v8, :cond_b

    .line 94
    .line 95
    and-int/lit8 v8, p11, 0x8

    .line 96
    .line 97
    if-nez v8, :cond_9

    .line 98
    .line 99
    move-wide/from16 v8, p4

    .line 100
    .line 101
    invoke-interface {v2, v8, v9}, Landroidx/compose/runtime/Composer;->changed(J)Z

    .line 102
    .line 103
    .line 104
    move-result v11

    .line 105
    if-eqz v11, :cond_a

    .line 106
    .line 107
    const/16 v11, 0x800

    .line 108
    .line 109
    goto :goto_6

    .line 110
    :cond_9
    move-wide/from16 v8, p4

    .line 111
    .line 112
    :cond_a
    const/16 v11, 0x400

    .line 113
    .line 114
    :goto_6
    or-int/2addr v3, v11

    .line 115
    goto :goto_7

    .line 116
    :cond_b
    move-wide/from16 v8, p4

    .line 117
    .line 118
    :goto_7
    and-int/lit8 v11, p11, 0x10

    .line 119
    .line 120
    if-eqz v11, :cond_d

    .line 121
    .line 122
    or-int/lit16 v3, v3, 0x6000

    .line 123
    .line 124
    :cond_c
    move-object/from16 v12, p6

    .line 125
    .line 126
    goto :goto_9

    .line 127
    :cond_d
    and-int/lit16 v12, v10, 0x6000

    .line 128
    .line 129
    if-nez v12, :cond_c

    .line 130
    .line 131
    move-object/from16 v12, p6

    .line 132
    .line 133
    invoke-interface {v2, v12}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 134
    .line 135
    .line 136
    move-result v13

    .line 137
    if-eqz v13, :cond_e

    .line 138
    .line 139
    const/16 v13, 0x4000

    .line 140
    .line 141
    goto :goto_8

    .line 142
    :cond_e
    const/16 v13, 0x2000

    .line 143
    .line 144
    :goto_8
    or-int/2addr v3, v13

    .line 145
    :goto_9
    and-int/lit8 v13, p11, 0x20

    .line 146
    .line 147
    const/high16 v14, 0x30000

    .line 148
    .line 149
    if-eqz v13, :cond_10

    .line 150
    .line 151
    or-int/2addr v3, v14

    .line 152
    :cond_f
    move-object/from16 v14, p7

    .line 153
    .line 154
    goto :goto_b

    .line 155
    :cond_10
    and-int/2addr v14, v10

    .line 156
    if-nez v14, :cond_f

    .line 157
    .line 158
    move-object/from16 v14, p7

    .line 159
    .line 160
    invoke-interface {v2, v14}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 161
    .line 162
    .line 163
    move-result v15

    .line 164
    if-eqz v15, :cond_11

    .line 165
    .line 166
    const/high16 v15, 0x20000

    .line 167
    .line 168
    goto :goto_a

    .line 169
    :cond_11
    const/high16 v15, 0x10000

    .line 170
    .line 171
    :goto_a
    or-int/2addr v3, v15

    .line 172
    :goto_b
    and-int/lit8 v15, p11, 0x40

    .line 173
    .line 174
    const/high16 v16, 0x180000

    .line 175
    .line 176
    if-eqz v15, :cond_13

    .line 177
    .line 178
    or-int v3, v3, v16

    .line 179
    .line 180
    :cond_12
    move-object/from16 v15, p8

    .line 181
    .line 182
    goto :goto_d

    .line 183
    :cond_13
    and-int v15, v10, v16

    .line 184
    .line 185
    if-nez v15, :cond_12

    .line 186
    .line 187
    move-object/from16 v15, p8

    .line 188
    .line 189
    invoke-interface {v2, v15}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 190
    .line 191
    .line 192
    move-result v16

    .line 193
    if-eqz v16, :cond_14

    .line 194
    .line 195
    const/high16 v16, 0x100000

    .line 196
    .line 197
    goto :goto_c

    .line 198
    :cond_14
    const/high16 v16, 0x80000

    .line 199
    .line 200
    :goto_c
    or-int v3, v3, v16

    .line 201
    .line 202
    :goto_d
    const v16, 0x92493

    .line 203
    .line 204
    .line 205
    and-int v0, v3, v16

    .line 206
    .line 207
    move/from16 p9, v4

    .line 208
    .line 209
    const v4, 0x92492

    .line 210
    .line 211
    .line 212
    if-ne v0, v4, :cond_16

    .line 213
    .line 214
    invoke-interface {v2}, Landroidx/compose/runtime/Composer;->getSkipping()Z

    .line 215
    .line 216
    .line 217
    move-result v0

    .line 218
    if-nez v0, :cond_15

    .line 219
    .line 220
    goto :goto_e

    .line 221
    :cond_15
    invoke-interface {v2}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    .line 222
    .line 223
    .line 224
    move-object/from16 v19, v2

    .line 225
    .line 226
    move-object v2, v5

    .line 227
    move-wide v3, v6

    .line 228
    move-wide v5, v8

    .line 229
    move-object v7, v12

    .line 230
    move-object v8, v14

    .line 231
    goto/16 :goto_11

    .line 232
    .line 233
    :cond_16
    :goto_e
    invoke-interface {v2}, Landroidx/compose/runtime/Composer;->startDefaults()V

    .line 234
    .line 235
    .line 236
    and-int/lit8 v0, v10, 0x1

    .line 237
    .line 238
    if-eqz v0, :cond_1a

    .line 239
    .line 240
    invoke-interface {v2}, Landroidx/compose/runtime/Composer;->getDefaultsInvalid()Z

    .line 241
    .line 242
    .line 243
    move-result v0

    .line 244
    if-eqz v0, :cond_17

    .line 245
    .line 246
    goto :goto_f

    .line 247
    :cond_17
    invoke-interface {v2}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    .line 248
    .line 249
    .line 250
    and-int/lit8 v0, p11, 0x4

    .line 251
    .line 252
    if-eqz v0, :cond_18

    .line 253
    .line 254
    and-int/lit16 v3, v3, -0x381

    .line 255
    .line 256
    :cond_18
    and-int/lit8 v0, p11, 0x8

    .line 257
    .line 258
    if-eqz v0, :cond_19

    .line 259
    .line 260
    and-int/lit16 v3, v3, -0x1c01

    .line 261
    .line 262
    :cond_19
    move-object v11, v5

    .line 263
    move-object/from16 v16, v12

    .line 264
    .line 265
    move-object/from16 v17, v14

    .line 266
    .line 267
    const v0, -0x477a035a

    .line 268
    .line 269
    .line 270
    move-wide v12, v6

    .line 271
    move-wide v14, v8

    .line 272
    goto :goto_10

    .line 273
    :cond_1a
    :goto_f
    if-eqz p9, :cond_1b

    .line 274
    .line 275
    sget-object v0, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    .line 276
    .line 277
    move-object v5, v0

    .line 278
    :cond_1b
    and-int/lit8 v0, p11, 0x4

    .line 279
    .line 280
    const/4 v4, 0x6

    .line 281
    if-eqz v0, :cond_1c

    .line 282
    .line 283
    sget-object v0, Landroidx/compose/material3/TabRowDefaults;->INSTANCE:Landroidx/compose/material3/TabRowDefaults;

    .line 284
    .line 285
    invoke-virtual {v0, v2, v4}, Landroidx/compose/material3/TabRowDefaults;->getPrimaryContainerColor(Landroidx/compose/runtime/Composer;I)J

    .line 286
    .line 287
    .line 288
    move-result-wide v6

    .line 289
    and-int/lit16 v3, v3, -0x381

    .line 290
    .line 291
    :cond_1c
    and-int/lit8 v0, p11, 0x8

    .line 292
    .line 293
    if-eqz v0, :cond_1d

    .line 294
    .line 295
    sget-object v0, Landroidx/compose/material3/TabRowDefaults;->INSTANCE:Landroidx/compose/material3/TabRowDefaults;

    .line 296
    .line 297
    invoke-virtual {v0, v2, v4}, Landroidx/compose/material3/TabRowDefaults;->getPrimaryContentColor(Landroidx/compose/runtime/Composer;I)J

    .line 298
    .line 299
    .line 300
    move-result-wide v8

    .line 301
    and-int/lit16 v0, v3, -0x1c01

    .line 302
    .line 303
    move v3, v0

    .line 304
    :cond_1d
    if-eqz v11, :cond_1e

    .line 305
    .line 306
    new-instance v0, Landroidx/compose/material3/TabRowKt$TabRow$1;

    .line 307
    .line 308
    invoke-direct {v0, v1}, Landroidx/compose/material3/TabRowKt$TabRow$1;-><init>(I)V

    .line 309
    .line 310
    .line 311
    const/16 v4, 0x36

    .line 312
    .line 313
    const v11, -0x7a5029ff

    .line 314
    .line 315
    .line 316
    const/4 v12, 0x1

    .line 317
    invoke-static {v11, v12, v0, v2, v4}, Landroidx/compose/runtime/internal/ComposableLambdaKt;->rememberComposableLambda(IZLjava/lang/Object;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/internal/ComposableLambda;

    .line 318
    .line 319
    .line 320
    move-result-object v0

    .line 321
    move-object v12, v0

    .line 322
    :cond_1e
    if-eqz v13, :cond_19

    .line 323
    .line 324
    sget-object v0, Landroidx/compose/material3/ComposableSingletons$TabRowKt;->INSTANCE:Landroidx/compose/material3/ComposableSingletons$TabRowKt;

    .line 325
    .line 326
    invoke-virtual {v0}, Landroidx/compose/material3/ComposableSingletons$TabRowKt;->getLambda-3$material3_release()Lkotlin/jvm/functions/Function2;

    .line 327
    .line 328
    .line 329
    move-result-object v0

    .line 330
    move-object/from16 v17, v0

    .line 331
    .line 332
    move-object v11, v5

    .line 333
    move-wide v14, v8

    .line 334
    move-object/from16 v16, v12

    .line 335
    .line 336
    const v0, -0x477a035a

    .line 337
    .line 338
    .line 339
    move-wide v12, v6

    .line 340
    :goto_10
    invoke-interface {v2}, Landroidx/compose/runtime/Composer;->endDefaults()V

    .line 341
    .line 342
    .line 343
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 344
    .line 345
    .line 346
    move-result v4

    .line 347
    if-eqz v4, :cond_1f

    .line 348
    .line 349
    const/4 v4, -0x1

    .line 350
    const-string/jumbo v5, "androidx.compose.material3.TabRow (TabRow.kt:315)"

    .line 351
    .line 352
    .line 353
    invoke-static {v0, v3, v4, v5}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 354
    .line 355
    .line 356
    :cond_1f
    shr-int/lit8 v0, v3, 0x3

    .line 357
    .line 358
    const v3, 0x7fffe

    .line 359
    .line 360
    .line 361
    and-int v20, v0, v3

    .line 362
    .line 363
    move-object/from16 v18, p8

    .line 364
    .line 365
    move-object/from16 v19, v2

    .line 366
    .line 367
    invoke-static/range {v11 .. v20}, Landroidx/compose/material3/TabRowKt;->TabRowWithSubcomposeImpl-DTcfvLk(Landroidx/compose/ui/Modifier;JJLkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V

    .line 368
    .line 369
    .line 370
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 371
    .line 372
    .line 373
    move-result v0

    .line 374
    if-eqz v0, :cond_20

    .line 375
    .line 376
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 377
    .line 378
    .line 379
    :cond_20
    move-object v2, v11

    .line 380
    move-wide v3, v12

    .line 381
    move-wide v5, v14

    .line 382
    move-object/from16 v7, v16

    .line 383
    .line 384
    move-object/from16 v8, v17

    .line 385
    .line 386
    :goto_11
    invoke-interface/range {v19 .. v19}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    .line 387
    .line 388
    .line 389
    move-result-object v12

    .line 390
    if-eqz v12, :cond_21

    .line 391
    .line 392
    new-instance v0, Landroidx/compose/material3/TabRowKt$TabRow$2;

    .line 393
    .line 394
    move-object/from16 v9, p8

    .line 395
    .line 396
    move/from16 v11, p11

    .line 397
    .line 398
    invoke-direct/range {v0 .. v11}, Landroidx/compose/material3/TabRowKt$TabRow$2;-><init>(ILandroidx/compose/ui/Modifier;JJLkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;II)V

    .line 399
    .line 400
    .line 401
    invoke-interface {v12, v0}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lkotlin/jvm/functions/Function2;)V

    .line 402
    .line 403
    .line 404
    :cond_21
    return-void
.end method

.method private static final TabRowImpl-DTcfvLk(Landroidx/compose/ui/Modifier;JJLkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V
    .locals 23
    .annotation build Landroidx/compose/runtime/Composable;
    .end annotation

    .annotation build Landroidx/compose/runtime/ComposableInferredTarget;
        scheme = "[androidx.compose.ui.UiComposable[_][_][_]]"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/ui/Modifier;",
            "JJ",
            "Lkotlin/jvm/functions/Function3<",
            "-",
            "Landroidx/compose/material3/TabIndicatorScope;",
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
            "Landroidx/compose/runtime/Composer;",
            "I)V"
        }
    .end annotation

    .line 1
    move-object/from16 v6, p5

    .line 2
    .line 3
    move-object/from16 v7, p6

    .line 4
    .line 5
    move-object/from16 v8, p7

    .line 6
    .line 7
    move/from16 v9, p9

    .line 8
    .line 9
    const v0, 0x68c02f03

    .line 10
    .line 11
    .line 12
    move-object/from16 v1, p8

    .line 13
    .line 14
    invoke-interface {v1, v0}, Landroidx/compose/runtime/Composer;->startRestartGroup(I)Landroidx/compose/runtime/Composer;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    and-int/lit8 v2, v9, 0x6

    .line 19
    .line 20
    if-nez v2, :cond_1

    .line 21
    .line 22
    move-object/from16 v2, p0

    .line 23
    .line 24
    invoke-interface {v1, v2}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 25
    .line 26
    .line 27
    move-result v3

    .line 28
    if-eqz v3, :cond_0

    .line 29
    .line 30
    const/4 v3, 0x4

    .line 31
    goto :goto_0

    .line 32
    :cond_0
    const/4 v3, 0x2

    .line 33
    :goto_0
    or-int/2addr v3, v9

    .line 34
    goto :goto_1

    .line 35
    :cond_1
    move-object/from16 v2, p0

    .line 36
    .line 37
    move v3, v9

    .line 38
    :goto_1
    and-int/lit8 v4, v9, 0x30

    .line 39
    .line 40
    move-wide/from16 v12, p1

    .line 41
    .line 42
    if-nez v4, :cond_3

    .line 43
    .line 44
    invoke-interface {v1, v12, v13}, Landroidx/compose/runtime/Composer;->changed(J)Z

    .line 45
    .line 46
    .line 47
    move-result v4

    .line 48
    if-eqz v4, :cond_2

    .line 49
    .line 50
    const/16 v4, 0x20

    .line 51
    .line 52
    goto :goto_2

    .line 53
    :cond_2
    const/16 v4, 0x10

    .line 54
    .line 55
    :goto_2
    or-int/2addr v3, v4

    .line 56
    :cond_3
    and-int/lit16 v4, v9, 0x180

    .line 57
    .line 58
    move-wide/from16 v14, p3

    .line 59
    .line 60
    if-nez v4, :cond_5

    .line 61
    .line 62
    invoke-interface {v1, v14, v15}, Landroidx/compose/runtime/Composer;->changed(J)Z

    .line 63
    .line 64
    .line 65
    move-result v4

    .line 66
    if-eqz v4, :cond_4

    .line 67
    .line 68
    const/16 v4, 0x100

    .line 69
    .line 70
    goto :goto_3

    .line 71
    :cond_4
    const/16 v4, 0x80

    .line 72
    .line 73
    :goto_3
    or-int/2addr v3, v4

    .line 74
    :cond_5
    and-int/lit16 v4, v9, 0xc00

    .line 75
    .line 76
    if-nez v4, :cond_7

    .line 77
    .line 78
    invoke-interface {v1, v6}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 79
    .line 80
    .line 81
    move-result v4

    .line 82
    if-eqz v4, :cond_6

    .line 83
    .line 84
    const/16 v4, 0x800

    .line 85
    .line 86
    goto :goto_4

    .line 87
    :cond_6
    const/16 v4, 0x400

    .line 88
    .line 89
    :goto_4
    or-int/2addr v3, v4

    .line 90
    :cond_7
    and-int/lit16 v4, v9, 0x6000

    .line 91
    .line 92
    if-nez v4, :cond_9

    .line 93
    .line 94
    invoke-interface {v1, v7}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 95
    .line 96
    .line 97
    move-result v4

    .line 98
    if-eqz v4, :cond_8

    .line 99
    .line 100
    const/16 v4, 0x4000

    .line 101
    .line 102
    goto :goto_5

    .line 103
    :cond_8
    const/16 v4, 0x2000

    .line 104
    .line 105
    :goto_5
    or-int/2addr v3, v4

    .line 106
    :cond_9
    const/high16 v4, 0x30000

    .line 107
    .line 108
    and-int/2addr v4, v9

    .line 109
    if-nez v4, :cond_b

    .line 110
    .line 111
    invoke-interface {v1, v8}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 112
    .line 113
    .line 114
    move-result v4

    .line 115
    if-eqz v4, :cond_a

    .line 116
    .line 117
    const/high16 v4, 0x20000

    .line 118
    .line 119
    goto :goto_6

    .line 120
    :cond_a
    const/high16 v4, 0x10000

    .line 121
    .line 122
    :goto_6
    or-int/2addr v3, v4

    .line 123
    :cond_b
    const v4, 0x12493

    .line 124
    .line 125
    .line 126
    and-int/2addr v4, v3

    .line 127
    const v5, 0x12492

    .line 128
    .line 129
    .line 130
    if-ne v4, v5, :cond_d

    .line 131
    .line 132
    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->getSkipping()Z

    .line 133
    .line 134
    .line 135
    move-result v4

    .line 136
    if-nez v4, :cond_c

    .line 137
    .line 138
    goto :goto_7

    .line 139
    :cond_c
    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    .line 140
    .line 141
    .line 142
    move-object/from16 v20, v1

    .line 143
    .line 144
    goto :goto_8

    .line 145
    :cond_d
    :goto_7
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 146
    .line 147
    .line 148
    move-result v4

    .line 149
    if-eqz v4, :cond_e

    .line 150
    .line 151
    const/4 v4, -0x1

    .line 152
    const-string/jumbo v5, "androidx.compose.material3.TabRowImpl (TabRow.kt:571)"

    .line 153
    .line 154
    .line 155
    invoke-static {v0, v3, v4, v5}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 156
    .line 157
    .line 158
    :cond_e
    invoke-static {v2}, Landroidx/compose/foundation/selection/SelectableGroupKt;->selectableGroup(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    .line 159
    .line 160
    .line 161
    move-result-object v10

    .line 162
    new-instance v0, Landroidx/compose/material3/TabRowKt$TabRowImpl$1;

    .line 163
    .line 164
    invoke-direct {v0, v8, v7, v6}, Landroidx/compose/material3/TabRowKt$TabRowImpl$1;-><init>(Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function3;)V

    .line 165
    .line 166
    .line 167
    const/16 v4, 0x36

    .line 168
    .line 169
    const v5, -0x3e172f8

    .line 170
    .line 171
    .line 172
    const/4 v11, 0x1

    .line 173
    invoke-static {v5, v11, v0, v1, v4}, Landroidx/compose/runtime/internal/ComposableLambdaKt;->rememberComposableLambda(IZLjava/lang/Object;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/internal/ComposableLambda;

    .line 174
    .line 175
    .line 176
    move-result-object v19

    .line 177
    shl-int/lit8 v0, v3, 0x3

    .line 178
    .line 179
    and-int/lit16 v3, v0, 0x380

    .line 180
    .line 181
    const/high16 v4, 0xc00000

    .line 182
    .line 183
    or-int/2addr v3, v4

    .line 184
    and-int/lit16 v0, v0, 0x1c00

    .line 185
    .line 186
    or-int v21, v3, v0

    .line 187
    .line 188
    const/16 v22, 0x72

    .line 189
    .line 190
    const/4 v11, 0x0

    .line 191
    const/16 v16, 0x0

    .line 192
    .line 193
    const/16 v17, 0x0

    .line 194
    .line 195
    const/16 v18, 0x0

    .line 196
    .line 197
    move-object/from16 v20, v1

    .line 198
    .line 199
    invoke-static/range {v10 .. v22}, Landroidx/compose/material3/SurfaceKt;->Surface-T9BRK9s(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/graphics/Shape;JJFFLandroidx/compose/foundation/BorderStroke;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V

    .line 200
    .line 201
    .line 202
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 203
    .line 204
    .line 205
    move-result v0

    .line 206
    if-eqz v0, :cond_f

    .line 207
    .line 208
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 209
    .line 210
    .line 211
    :cond_f
    :goto_8
    invoke-interface/range {v20 .. v20}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    .line 212
    .line 213
    .line 214
    move-result-object v10

    .line 215
    if-eqz v10, :cond_10

    .line 216
    .line 217
    new-instance v0, Landroidx/compose/material3/TabRowKt$TabRowImpl$2;

    .line 218
    .line 219
    move-wide/from16 v4, p3

    .line 220
    .line 221
    move-object v1, v2

    .line 222
    move-wide/from16 v2, p1

    .line 223
    .line 224
    invoke-direct/range {v0 .. v9}, Landroidx/compose/material3/TabRowKt$TabRowImpl$2;-><init>(Landroidx/compose/ui/Modifier;JJLkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;I)V

    .line 225
    .line 226
    .line 227
    invoke-interface {v10, v0}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lkotlin/jvm/functions/Function2;)V

    .line 228
    .line 229
    .line 230
    :cond_10
    return-void
.end method

.method private static final TabRowWithSubcomposeImpl-DTcfvLk(Landroidx/compose/ui/Modifier;JJLkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V
    .locals 23
    .annotation build Landroidx/compose/runtime/Composable;
    .end annotation

    .annotation build Landroidx/compose/runtime/ComposableInferredTarget;
        scheme = "[androidx.compose.ui.UiComposable[_][_][_]]"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/ui/Modifier;",
            "JJ",
            "Lkotlin/jvm/functions/Function3<",
            "-",
            "Ljava/util/List<",
            "Landroidx/compose/material3/TabPosition;",
            ">;-",
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
            "Landroidx/compose/runtime/Composer;",
            "I)V"
        }
    .end annotation

    .line 1
    move-object/from16 v6, p5

    .line 2
    .line 3
    move-object/from16 v7, p6

    .line 4
    .line 5
    move-object/from16 v8, p7

    .line 6
    .line 7
    move/from16 v9, p9

    .line 8
    .line 9
    const v0, -0x9971f65

    .line 10
    .line 11
    .line 12
    move-object/from16 v1, p8

    .line 13
    .line 14
    invoke-interface {v1, v0}, Landroidx/compose/runtime/Composer;->startRestartGroup(I)Landroidx/compose/runtime/Composer;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    and-int/lit8 v2, v9, 0x6

    .line 19
    .line 20
    if-nez v2, :cond_1

    .line 21
    .line 22
    move-object/from16 v2, p0

    .line 23
    .line 24
    invoke-interface {v1, v2}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 25
    .line 26
    .line 27
    move-result v3

    .line 28
    if-eqz v3, :cond_0

    .line 29
    .line 30
    const/4 v3, 0x4

    .line 31
    goto :goto_0

    .line 32
    :cond_0
    const/4 v3, 0x2

    .line 33
    :goto_0
    or-int/2addr v3, v9

    .line 34
    goto :goto_1

    .line 35
    :cond_1
    move-object/from16 v2, p0

    .line 36
    .line 37
    move v3, v9

    .line 38
    :goto_1
    and-int/lit8 v4, v9, 0x30

    .line 39
    .line 40
    move-wide/from16 v12, p1

    .line 41
    .line 42
    if-nez v4, :cond_3

    .line 43
    .line 44
    invoke-interface {v1, v12, v13}, Landroidx/compose/runtime/Composer;->changed(J)Z

    .line 45
    .line 46
    .line 47
    move-result v4

    .line 48
    if-eqz v4, :cond_2

    .line 49
    .line 50
    const/16 v4, 0x20

    .line 51
    .line 52
    goto :goto_2

    .line 53
    :cond_2
    const/16 v4, 0x10

    .line 54
    .line 55
    :goto_2
    or-int/2addr v3, v4

    .line 56
    :cond_3
    and-int/lit16 v4, v9, 0x180

    .line 57
    .line 58
    move-wide/from16 v14, p3

    .line 59
    .line 60
    if-nez v4, :cond_5

    .line 61
    .line 62
    invoke-interface {v1, v14, v15}, Landroidx/compose/runtime/Composer;->changed(J)Z

    .line 63
    .line 64
    .line 65
    move-result v4

    .line 66
    if-eqz v4, :cond_4

    .line 67
    .line 68
    const/16 v4, 0x100

    .line 69
    .line 70
    goto :goto_3

    .line 71
    :cond_4
    const/16 v4, 0x80

    .line 72
    .line 73
    :goto_3
    or-int/2addr v3, v4

    .line 74
    :cond_5
    and-int/lit16 v4, v9, 0xc00

    .line 75
    .line 76
    if-nez v4, :cond_7

    .line 77
    .line 78
    invoke-interface {v1, v6}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 79
    .line 80
    .line 81
    move-result v4

    .line 82
    if-eqz v4, :cond_6

    .line 83
    .line 84
    const/16 v4, 0x800

    .line 85
    .line 86
    goto :goto_4

    .line 87
    :cond_6
    const/16 v4, 0x400

    .line 88
    .line 89
    :goto_4
    or-int/2addr v3, v4

    .line 90
    :cond_7
    and-int/lit16 v4, v9, 0x6000

    .line 91
    .line 92
    if-nez v4, :cond_9

    .line 93
    .line 94
    invoke-interface {v1, v7}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 95
    .line 96
    .line 97
    move-result v4

    .line 98
    if-eqz v4, :cond_8

    .line 99
    .line 100
    const/16 v4, 0x4000

    .line 101
    .line 102
    goto :goto_5

    .line 103
    :cond_8
    const/16 v4, 0x2000

    .line 104
    .line 105
    :goto_5
    or-int/2addr v3, v4

    .line 106
    :cond_9
    const/high16 v4, 0x30000

    .line 107
    .line 108
    and-int/2addr v4, v9

    .line 109
    if-nez v4, :cond_b

    .line 110
    .line 111
    invoke-interface {v1, v8}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 112
    .line 113
    .line 114
    move-result v4

    .line 115
    if-eqz v4, :cond_a

    .line 116
    .line 117
    const/high16 v4, 0x20000

    .line 118
    .line 119
    goto :goto_6

    .line 120
    :cond_a
    const/high16 v4, 0x10000

    .line 121
    .line 122
    :goto_6
    or-int/2addr v3, v4

    .line 123
    :cond_b
    const v4, 0x12493

    .line 124
    .line 125
    .line 126
    and-int/2addr v4, v3

    .line 127
    const v5, 0x12492

    .line 128
    .line 129
    .line 130
    if-ne v4, v5, :cond_d

    .line 131
    .line 132
    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->getSkipping()Z

    .line 133
    .line 134
    .line 135
    move-result v4

    .line 136
    if-nez v4, :cond_c

    .line 137
    .line 138
    goto :goto_7

    .line 139
    :cond_c
    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    .line 140
    .line 141
    .line 142
    move-object/from16 v20, v1

    .line 143
    .line 144
    goto :goto_8

    .line 145
    :cond_d
    :goto_7
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 146
    .line 147
    .line 148
    move-result v4

    .line 149
    if-eqz v4, :cond_e

    .line 150
    .line 151
    const/4 v4, -0x1

    .line 152
    const-string/jumbo v5, "androidx.compose.material3.TabRowWithSubcomposeImpl (TabRow.kt:948)"

    .line 153
    .line 154
    .line 155
    invoke-static {v0, v3, v4, v5}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 156
    .line 157
    .line 158
    :cond_e
    invoke-static {v2}, Landroidx/compose/foundation/selection/SelectableGroupKt;->selectableGroup(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    .line 159
    .line 160
    .line 161
    move-result-object v10

    .line 162
    new-instance v0, Landroidx/compose/material3/TabRowKt$TabRowWithSubcomposeImpl$1;

    .line 163
    .line 164
    invoke-direct {v0, v8, v7, v6}, Landroidx/compose/material3/TabRowKt$TabRowWithSubcomposeImpl$1;-><init>(Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function3;)V

    .line 165
    .line 166
    .line 167
    const/16 v4, 0x36

    .line 168
    .line 169
    const v5, -0x606c2e20

    .line 170
    .line 171
    .line 172
    const/4 v11, 0x1

    .line 173
    invoke-static {v5, v11, v0, v1, v4}, Landroidx/compose/runtime/internal/ComposableLambdaKt;->rememberComposableLambda(IZLjava/lang/Object;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/internal/ComposableLambda;

    .line 174
    .line 175
    .line 176
    move-result-object v19

    .line 177
    shl-int/lit8 v0, v3, 0x3

    .line 178
    .line 179
    and-int/lit16 v3, v0, 0x380

    .line 180
    .line 181
    const/high16 v4, 0xc00000

    .line 182
    .line 183
    or-int/2addr v3, v4

    .line 184
    and-int/lit16 v0, v0, 0x1c00

    .line 185
    .line 186
    or-int v21, v3, v0

    .line 187
    .line 188
    const/16 v22, 0x72

    .line 189
    .line 190
    const/4 v11, 0x0

    .line 191
    const/16 v16, 0x0

    .line 192
    .line 193
    const/16 v17, 0x0

    .line 194
    .line 195
    const/16 v18, 0x0

    .line 196
    .line 197
    move-object/from16 v20, v1

    .line 198
    .line 199
    invoke-static/range {v10 .. v22}, Landroidx/compose/material3/SurfaceKt;->Surface-T9BRK9s(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/graphics/Shape;JJFFLandroidx/compose/foundation/BorderStroke;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V

    .line 200
    .line 201
    .line 202
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 203
    .line 204
    .line 205
    move-result v0

    .line 206
    if-eqz v0, :cond_f

    .line 207
    .line 208
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 209
    .line 210
    .line 211
    :cond_f
    :goto_8
    invoke-interface/range {v20 .. v20}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    .line 212
    .line 213
    .line 214
    move-result-object v10

    .line 215
    if-eqz v10, :cond_10

    .line 216
    .line 217
    new-instance v0, Landroidx/compose/material3/TabRowKt$TabRowWithSubcomposeImpl$2;

    .line 218
    .line 219
    move-wide/from16 v4, p3

    .line 220
    .line 221
    move-object v1, v2

    .line 222
    move-wide/from16 v2, p1

    .line 223
    .line 224
    invoke-direct/range {v0 .. v9}, Landroidx/compose/material3/TabRowKt$TabRowWithSubcomposeImpl$2;-><init>(Landroidx/compose/ui/Modifier;JJLkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;I)V

    .line 225
    .line 226
    .line 227
    invoke-interface {v10, v0}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lkotlin/jvm/functions/Function2;)V

    .line 228
    .line 229
    .line 230
    :cond_10
    return-void
.end method

.method public static final synthetic access$ScrollableTabRowImpl-sKfQg0A(ILandroidx/compose/ui/Modifier;JJFLandroidx/compose/foundation/ScrollState;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V
    .locals 0

    .line 1
    invoke-static/range {p0 .. p12}, Landroidx/compose/material3/TabRowKt;->ScrollableTabRowImpl-sKfQg0A(ILandroidx/compose/ui/Modifier;JJFLandroidx/compose/foundation/ScrollState;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static final synthetic access$ScrollableTabRowWithSubcomposeImpl-qhFBPw4(ILkotlin/jvm/functions/Function3;Landroidx/compose/ui/Modifier;JJFLkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/foundation/ScrollState;Landroidx/compose/runtime/Composer;II)V
    .locals 0

    .line 1
    invoke-static/range {p0 .. p13}, Landroidx/compose/material3/TabRowKt;->ScrollableTabRowWithSubcomposeImpl-qhFBPw4(ILkotlin/jvm/functions/Function3;Landroidx/compose/ui/Modifier;JJFLkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/foundation/ScrollState;Landroidx/compose/runtime/Composer;II)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static final synthetic access$TabRowImpl-DTcfvLk(Landroidx/compose/ui/Modifier;JJLkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V
    .locals 0

    .line 1
    invoke-static/range {p0 .. p9}, Landroidx/compose/material3/TabRowKt;->TabRowImpl-DTcfvLk(Landroidx/compose/ui/Modifier;JJLkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static final synthetic access$TabRowWithSubcomposeImpl-DTcfvLk(Landroidx/compose/ui/Modifier;JJLkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V
    .locals 0

    .line 1
    invoke-static/range {p0 .. p9}, Landroidx/compose/material3/TabRowKt;->TabRowWithSubcomposeImpl-DTcfvLk(Landroidx/compose/ui/Modifier;JJLkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static final synthetic access$getScrollableTabRowMinimumTabWidth$p()F
    .locals 1

    .line 1
    sget v0, Landroidx/compose/material3/TabRowKt;->ScrollableTabRowMinimumTabWidth:F

    .line 2
    .line 3
    return v0
.end method

.method public static final synthetic access$getScrollableTabRowScrollSpec$p()Landroidx/compose/animation/core/AnimationSpec;
    .locals 1

    .line 1
    sget-object v0, Landroidx/compose/material3/TabRowKt;->ScrollableTabRowScrollSpec:Landroidx/compose/animation/core/AnimationSpec;

    .line 2
    .line 3
    return-object v0
.end method

.method public static final synthetic access$getTabRowIndicatorSpec$p()Landroidx/compose/animation/core/AnimationSpec;
    .locals 1

    .line 1
    sget-object v0, Landroidx/compose/material3/TabRowKt;->TabRowIndicatorSpec:Landroidx/compose/animation/core/AnimationSpec;

    .line 2
    .line 3
    return-object v0
.end method
