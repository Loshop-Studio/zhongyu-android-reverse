.class public final Landroidx/compose/material3/SearchBar_androidKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u00be\u0001\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u000e\n\u0002\u0008\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u000c\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\n\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u000b\u001a\u0091\u0001\u0010,\u001a\u00020-2\u0011\u0010.\u001a\r\u0012\u0004\u0012\u00020-0/\u00a2\u0006\u0002\u000802\u0006\u00101\u001a\u0002022\u0012\u00103\u001a\u000e\u0012\u0004\u0012\u000202\u0012\u0004\u0012\u00020-042\u0008\u0008\u0002\u00105\u001a\u0002062\u0008\u0008\u0002\u00107\u001a\u0002082\u0008\u0008\u0002\u00109\u001a\u00020:2\u0008\u0008\u0002\u0010;\u001a\u00020\u00152\u0008\u0008\u0002\u0010<\u001a\u00020\u00152\u001c\u0010=\u001a\u0018\u0012\u0004\u0012\u00020>\u0012\u0004\u0012\u00020-04\u00a2\u0006\u0002\u00080\u00a2\u0006\u0002\u0008?H\u0007\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008@\u0010A\u001a\u0089\u0002\u0010,\u001a\u00020-2\u0006\u0010B\u001a\u00020\u001a2\u0012\u0010C\u001a\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020-042\u0012\u0010D\u001a\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020-042\u0006\u0010E\u001a\u0002022\u0012\u0010F\u001a\u000e\u0012\u0004\u0012\u000202\u0012\u0004\u0012\u00020-042\u0008\u0008\u0002\u00105\u001a\u0002062\u0008\u0008\u0002\u0010G\u001a\u0002022\u0015\u0008\u0002\u0010H\u001a\u000f\u0012\u0004\u0012\u00020-\u0018\u00010/\u00a2\u0006\u0002\u000802\u0015\u0008\u0002\u0010I\u001a\u000f\u0012\u0004\u0012\u00020-\u0018\u00010/\u00a2\u0006\u0002\u000802\u0015\u0008\u0002\u0010J\u001a\u000f\u0012\u0004\u0012\u00020-\u0018\u00010/\u00a2\u0006\u0002\u000802\u0008\u0008\u0002\u00107\u001a\u0002082\u0008\u0008\u0002\u00109\u001a\u00020:2\u0008\u0008\u0002\u0010;\u001a\u00020\u00152\u0008\u0008\u0002\u0010<\u001a\u00020\u00152\n\u0008\u0002\u0010K\u001a\u0004\u0018\u00010L2\u001c\u0010=\u001a\u0018\u0012\u0004\u0012\u00020>\u0012\u0004\u0012\u00020-04\u00a2\u0006\u0002\u00080\u00a2\u0006\u0002\u0008?H\u0007\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008M\u0010N\u001a\u009b\u0001\u0010O\u001a\u00020-2\u0011\u0010.\u001a\r\u0012\u0004\u0012\u00020-0/\u00a2\u0006\u0002\u000802\u0006\u00101\u001a\u0002022\u0012\u00103\u001a\u000e\u0012\u0004\u0012\u000202\u0012\u0004\u0012\u00020-042\u0008\u0008\u0002\u00105\u001a\u0002062\u0008\u0008\u0002\u00107\u001a\u0002082\u0008\u0008\u0002\u00109\u001a\u00020:2\u0008\u0008\u0002\u0010;\u001a\u00020\u00152\u0008\u0008\u0002\u0010<\u001a\u00020\u00152\u0008\u0008\u0002\u0010P\u001a\u00020Q2\u001c\u0010=\u001a\u0018\u0012\u0004\u0012\u00020>\u0012\u0004\u0012\u00020-04\u00a2\u0006\u0002\u00080\u00a2\u0006\u0002\u0008?H\u0007\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008R\u0010S\u001a\u0093\u0002\u0010O\u001a\u00020-2\u0006\u0010B\u001a\u00020\u001a2\u0012\u0010C\u001a\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020-042\u0012\u0010D\u001a\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020-042\u0006\u0010E\u001a\u0002022\u0012\u0010F\u001a\u000e\u0012\u0004\u0012\u000202\u0012\u0004\u0012\u00020-042\u0008\u0008\u0002\u00105\u001a\u0002062\u0008\u0008\u0002\u0010G\u001a\u0002022\u0015\u0008\u0002\u0010H\u001a\u000f\u0012\u0004\u0012\u00020-\u0018\u00010/\u00a2\u0006\u0002\u000802\u0015\u0008\u0002\u0010I\u001a\u000f\u0012\u0004\u0012\u00020-\u0018\u00010/\u00a2\u0006\u0002\u000802\u0015\u0008\u0002\u0010J\u001a\u000f\u0012\u0004\u0012\u00020-\u0018\u00010/\u00a2\u0006\u0002\u000802\u0008\u0008\u0002\u00107\u001a\u0002082\u0008\u0008\u0002\u00109\u001a\u00020:2\u0008\u0008\u0002\u0010;\u001a\u00020\u00152\u0008\u0008\u0002\u0010<\u001a\u00020\u00152\u0008\u0008\u0002\u0010P\u001a\u00020Q2\n\u0008\u0002\u0010K\u001a\u0004\u0018\u00010L2\u001c\u0010=\u001a\u0018\u0012\u0004\u0012\u00020>\u0012\u0004\u0012\u00020-04\u00a2\u0006\u0002\u00080\u00a2\u0006\u0002\u0008?H\u0007\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008T\u0010U\u001a\u00bb\u0001\u0010V\u001a\u00020-2\u0012\u0010W\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020Y0X2\u0006\u0010Z\u001a\u00020[2\u000e\u0010\\\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010^0]2\u000e\u0010_\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010^0]2\u0008\u0008\u0002\u00105\u001a\u0002062\u0011\u0010.\u001a\r\u0012\u0004\u0012\u00020-0/\u00a2\u0006\u0002\u000802\u0008\u0008\u0002\u00107\u001a\u0002082\u0008\u0008\u0002\u00109\u001a\u00020:2\u0008\u0008\u0002\u0010;\u001a\u00020\u00152\u0008\u0008\u0002\u0010<\u001a\u00020\u00152\u0008\u0008\u0002\u0010P\u001a\u00020Q2\u001c\u0010=\u001a\u0018\u0012\u0004\u0012\u00020>\u0012\u0004\u0012\u00020-04\u00a2\u0006\u0002\u00080\u00a2\u0006\u0002\u0008?H\u0001\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008`\u0010a\u001a\u0094\u0001\u0010b\u001a\u00020-2\u0012\u0010W\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020Y0X2\u0006\u0010Z\u001a\u00020[2\u000e\u0010\\\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010^0]2\u000e\u0010_\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010^0]2\u0006\u00105\u001a\u0002062\u0006\u0010P\u001a\u00020Q2\u0011\u0010.\u001a\r\u0012\u0004\u0012\u00020-0/\u00a2\u0006\u0002\u000802\u0011\u0010c\u001a\r\u0012\u0004\u0012\u00020-0/\u00a2\u0006\u0002\u000802\u0013\u0010=\u001a\u000f\u0012\u0004\u0012\u00020-\u0018\u00010/\u00a2\u0006\u0002\u00080H\u0003\u00a2\u0006\u0002\u0010d\u001a\"\u0010e\u001a\u00020\u00072\u0008\u0010_\u001a\u0004\u0018\u00010^2\u0006\u0010f\u001a\u00020\u00072\u0006\u0010Z\u001a\u00020\u0007H\u0002\u001aD\u0010g\u001a\u00020\u00012\u0006\u0010h\u001a\u00020i2\u0006\u0010j\u001a\u00020\u00012\u0008\u0010_\u001a\u0004\u0018\u00010^2\u0006\u0010k\u001a\u00020l2\u0006\u0010f\u001a\u00020\u00072\u0006\u0010m\u001a\u00020\u0007H\u0002\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008n\u0010o\u001aN\u0010p\u001a\u00020\u00012\u0006\u0010h\u001a\u00020i2\u0006\u0010j\u001a\u00020\u00012\u0008\u0010_\u001a\u0004\u0018\u00010^2\u0008\u0010\\\u001a\u0004\u0018\u00010^2\u0006\u0010q\u001a\u00020\u00012\u0006\u0010r\u001a\u00020\u00012\u0006\u0010m\u001a\u00020\u0007H\u0002\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008s\u0010t\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0082T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\"\u0014\u0010\u0005\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000\"\u0014\u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00020\t0\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\n\u001a\u00020\u0001X\u0082T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u000b\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\"\u0014\u0010\u000c\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000\"\u0014\u0010\r\u001a\u0008\u0012\u0004\u0012\u00020\t0\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000\"\u0014\u0010\u000e\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0013\u001a\u00020\u0007X\u0082T\u00a2\u0006\u0002\n\u0000\"\u0016\u0010\u0014\u001a\u00020\u0015X\u0080\u0004\u00a2\u0006\n\n\u0002\u0010\u0018\u001a\u0004\u0008\u0016\u0010\u0017\"\u000e\u0010\u0019\u001a\u00020\u001aX\u0082T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u001b\u001a\u00020\u001aX\u0082T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u001c\u001a\u00020\u001aX\u0082T\u00a2\u0006\u0002\n\u0000\"\u0016\u0010\u001d\u001a\u00020\u0015X\u0082\u0004\u00a2\u0006\n\n\u0002\u0010\u0018\u0012\u0004\u0008\u001e\u0010\u001f\"\u0010\u0010 \u001a\u00020\u0015X\u0082\u0004\u00a2\u0006\u0004\n\u0002\u0010\u0018\"\u0010\u0010!\u001a\u00020\u0015X\u0082\u0004\u00a2\u0006\u0004\n\u0002\u0010\u0018\"\u0016\u0010\"\u001a\u00020\u0015X\u0080\u0004\u00a2\u0006\n\n\u0002\u0010\u0018\u001a\u0004\u0008#\u0010\u0017\"\u000e\u0010$\u001a\u00020\u0007X\u0082T\u00a2\u0006\u0002\n\u0000\"\u0010\u0010%\u001a\u00020\u0015X\u0082\u0004\u00a2\u0006\u0004\n\u0002\u0010\u0018\"\u0010\u0010&\u001a\u00020\u0015X\u0082\u0004\u00a2\u0006\u0004\n\u0002\u0010\u0018\"\u000e\u0010\'\u001a\u00020\u0007X\u0082T\u00a2\u0006\u0002\n\u0000\"\u0016\u0010(\u001a\u00020\u0015X\u0080\u0004\u00a2\u0006\n\n\u0002\u0010\u0018\u001a\u0004\u0008)\u0010\u0017\"\u000e\u0010*\u001a\u00020+X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0007\n\u0005\u0008\u00a1\u001e0\u0001\u00a8\u0006u\u00b2\u0006\n\u0010v\u001a\u000202X\u008a\u0084\u0002\u00b2\u0006\n\u0010w\u001a\u000202X\u008a\u0084\u0002"
    }
    d2 = {
        "AnimationDelayMillis",
        "",
        "AnimationEnterDurationMillis",
        "AnimationEnterEasing",
        "Landroidx/compose/animation/core/CubicBezierEasing;",
        "AnimationEnterFloatSpec",
        "Landroidx/compose/animation/core/FiniteAnimationSpec;",
        "",
        "AnimationEnterSizeSpec",
        "Landroidx/compose/ui/unit/IntSize;",
        "AnimationExitDurationMillis",
        "AnimationExitEasing",
        "AnimationExitFloatSpec",
        "AnimationExitSizeSpec",
        "AnimationPredictiveBackExitFloatSpec",
        "DockedEnterTransition",
        "Landroidx/compose/animation/EnterTransition;",
        "DockedExitTransition",
        "Landroidx/compose/animation/ExitTransition;",
        "DockedExpandedTableMaxHeightScreenRatio",
        "DockedExpandedTableMinHeight",
        "Landroidx/compose/ui/unit/Dp;",
        "getDockedExpandedTableMinHeight",
        "()F",
        "F",
        "LayoutIdInputField",
        "",
        "LayoutIdSearchContent",
        "LayoutIdSurface",
        "SearchBarCornerRadius",
        "getSearchBarCornerRadius$annotations",
        "()V",
        "SearchBarIconOffsetX",
        "SearchBarMaxWidth",
        "SearchBarMinWidth",
        "getSearchBarMinWidth",
        "SearchBarPredictiveBackMaxOffsetXRatio",
        "SearchBarPredictiveBackMaxOffsetY",
        "SearchBarPredictiveBackMinMargin",
        "SearchBarPredictiveBackMinScale",
        "SearchBarVerticalPadding",
        "getSearchBarVerticalPadding",
        "UnspecifiedTextFieldColors",
        "Landroidx/compose/material3/TextFieldColors;",
        "DockedSearchBar",
        "",
        "inputField",
        "Lkotlin/Function0;",
        "Landroidx/compose/runtime/Composable;",
        "expanded",
        "",
        "onExpandedChange",
        "Lkotlin/Function1;",
        "modifier",
        "Landroidx/compose/ui/Modifier;",
        "shape",
        "Landroidx/compose/ui/graphics/Shape;",
        "colors",
        "Landroidx/compose/material3/SearchBarColors;",
        "tonalElevation",
        "shadowElevation",
        "content",
        "Landroidx/compose/foundation/layout/ColumnScope;",
        "Lkotlin/ExtensionFunctionType;",
        "DockedSearchBar-EQC0FA8",
        "(Lkotlin/jvm/functions/Function2;ZLkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material3/SearchBarColors;FFLkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V",
        "query",
        "onQueryChange",
        "onSearch",
        "active",
        "onActiveChange",
        "enabled",
        "placeholder",
        "leadingIcon",
        "trailingIcon",
        "interactionSource",
        "Landroidx/compose/foundation/interaction/MutableInteractionSource;",
        "DockedSearchBar-eWTbjVg",
        "(Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;ZLkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZLkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material3/SearchBarColors;FFLandroidx/compose/foundation/interaction/MutableInteractionSource;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;III)V",
        "SearchBar",
        "windowInsets",
        "Landroidx/compose/foundation/layout/WindowInsets;",
        "SearchBar-Y92LkZI",
        "(Lkotlin/jvm/functions/Function2;ZLkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material3/SearchBarColors;FFLandroidx/compose/foundation/layout/WindowInsets;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V",
        "SearchBar-WuY5d9Q",
        "(Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;ZLkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZLkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material3/SearchBarColors;FFLandroidx/compose/foundation/layout/WindowInsets;Landroidx/compose/foundation/interaction/MutableInteractionSource;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;III)V",
        "SearchBarImpl",
        "animationProgress",
        "Landroidx/compose/animation/core/Animatable;",
        "Landroidx/compose/animation/core/AnimationVector1D;",
        "finalBackProgress",
        "Landroidx/compose/runtime/MutableFloatState;",
        "firstBackEvent",
        "Landroidx/compose/runtime/MutableState;",
        "Landroidx/activity/BackEventCompat;",
        "currentBackEvent",
        "SearchBarImpl-j1jLAyQ",
        "(Landroidx/compose/animation/core/Animatable;Landroidx/compose/runtime/MutableFloatState;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material3/SearchBarColors;FFLandroidx/compose/foundation/layout/WindowInsets;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;III)V",
        "SearchBarLayout",
        "surface",
        "(Landroidx/compose/animation/core/Animatable;Landroidx/compose/runtime/MutableFloatState;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/layout/WindowInsets;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V",
        "calculatePredictiveBackMultiplier",
        "progress",
        "calculatePredictiveBackOffsetX",
        "constraints",
        "Landroidx/compose/ui/unit/Constraints;",
        "minMargin",
        "layoutDirection",
        "Landroidx/compose/ui/unit/LayoutDirection;",
        "predictiveBackMultiplier",
        "calculatePredictiveBackOffsetX-rOvwMX4",
        "(JILandroidx/activity/BackEventCompat;Landroidx/compose/ui/unit/LayoutDirection;FF)I",
        "calculatePredictiveBackOffsetY",
        "height",
        "maxOffsetY",
        "calculatePredictiveBackOffsetY-dzo92Q0",
        "(JILandroidx/activity/BackEventCompat;Landroidx/activity/BackEventCompat;IIF)I",
        "material3_release",
        "useFullScreenShape",
        "showContent"
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
        "SMAP\nSearchBar.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SearchBar.android.kt\nandroidx/compose/material3/SearchBar_androidKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Composer.kt\nandroidx/compose/runtime/Updater\n+ 7 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 8 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 9 Dp.kt\nandroidx/compose/ui/unit/Dp\n+ 10 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,1243:1\n1223#2,6:1244\n1223#2,6:1250\n1223#2,6:1256\n1223#2,6:1262\n1223#2,6:1268\n1223#2,6:1274\n1223#2,6:1280\n1223#2,6:1286\n1223#2,6:1293\n1223#2,6:1299\n1223#2,6:1305\n1223#2,6:1311\n1223#2,6:1317\n1223#2,6:1323\n77#3:1292\n78#4,6:1329\n85#4,4:1344\n89#4,2:1354\n78#4,6:1364\n85#4,4:1379\n89#4,2:1389\n93#4:1395\n78#4,6:1404\n85#4,4:1419\n89#4,2:1429\n93#4:1435\n78#4,6:1444\n85#4,4:1459\n89#4,2:1469\n93#4:1475\n93#4:1479\n368#5,9:1335\n377#5:1356\n368#5,9:1370\n377#5:1391\n378#5,2:1393\n368#5,9:1410\n377#5:1431\n378#5,2:1433\n368#5,9:1450\n377#5:1471\n378#5,2:1473\n378#5,2:1477\n4032#6,6:1348\n4032#6,6:1383\n4032#6,6:1423\n4032#6,6:1463\n71#7:1357\n68#7,6:1358\n74#7:1392\n78#7:1396\n71#7:1397\n68#7,6:1398\n74#7:1432\n78#7:1436\n71#7:1437\n68#7,6:1438\n74#7:1472\n78#7:1476\n81#8:1480\n81#8:1481\n71#9:1482\n148#10:1483\n148#10:1484\n148#10:1485\n148#10:1486\n148#10:1487\n148#10:1488\n148#10:1489\n*S KotlinDebug\n*F\n+ 1 SearchBar.android.kt\nandroidx/compose/material3/SearchBar_androidKt\n*L\n179#1:1244,6\n180#1:1250,6\n181#1:1256,6\n182#1:1262,6\n184#1:1268,6\n200#1:1274,6\n201#1:1280,6\n326#1:1286,6\n873#1:1293,6\n877#1:1299,6\n904#1:1305,6\n946#1:1311,6\n951#1:1317,6\n966#1:1323,6\n869#1:1292\n947#1:1329,6\n947#1:1344,4\n947#1:1354,2\n956#1:1364,6\n956#1:1379,4\n956#1:1389,2\n956#1:1395\n957#1:1404,6\n957#1:1419,4\n957#1:1429,2\n957#1:1435\n961#1:1444,6\n961#1:1459,4\n961#1:1469,2\n961#1:1475\n947#1:1479\n947#1:1335,9\n947#1:1356\n956#1:1370,9\n956#1:1391\n956#1:1393,2\n957#1:1410,9\n957#1:1431\n957#1:1433,2\n961#1:1450,9\n961#1:1471\n961#1:1473,2\n947#1:1477,2\n947#1:1348,6\n956#1:1383,6\n957#1:1423,6\n961#1:1463,6\n956#1:1357\n956#1:1358,6\n956#1:1392\n956#1:1396\n957#1:1397\n957#1:1398,6\n957#1:1432\n957#1:1436\n961#1:1437\n961#1:1438,6\n961#1:1472\n961#1:1476\n873#1:1480\n904#1:1481\n1191#1:1482\n1192#1:1483\n1194#1:1484\n1195#1:1485\n1196#1:1486\n1198#1:1487\n1200#1:1488\n1202#1:1489\n*E\n"
    }
.end annotation


# static fields
.field private static final AnimationDelayMillis:I = 0x64

.field private static final AnimationEnterDurationMillis:I = 0x258

.field private static final AnimationEnterEasing:Landroidx/compose/animation/core/CubicBezierEasing;

.field private static final AnimationEnterFloatSpec:Landroidx/compose/animation/core/FiniteAnimationSpec;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/compose/animation/core/FiniteAnimationSpec<",
            "Ljava/lang/Float;",
            ">;"
        }
    .end annotation
.end field

.field private static final AnimationEnterSizeSpec:Landroidx/compose/animation/core/FiniteAnimationSpec;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/compose/animation/core/FiniteAnimationSpec<",
            "Landroidx/compose/ui/unit/IntSize;",
            ">;"
        }
    .end annotation
.end field

.field private static final AnimationExitDurationMillis:I = 0x15e

.field private static final AnimationExitEasing:Landroidx/compose/animation/core/CubicBezierEasing;

.field private static final AnimationExitFloatSpec:Landroidx/compose/animation/core/FiniteAnimationSpec;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/compose/animation/core/FiniteAnimationSpec<",
            "Ljava/lang/Float;",
            ">;"
        }
    .end annotation
.end field

.field private static final AnimationExitSizeSpec:Landroidx/compose/animation/core/FiniteAnimationSpec;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/compose/animation/core/FiniteAnimationSpec<",
            "Landroidx/compose/ui/unit/IntSize;",
            ">;"
        }
    .end annotation
.end field

.field private static final AnimationPredictiveBackExitFloatSpec:Landroidx/compose/animation/core/FiniteAnimationSpec;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/compose/animation/core/FiniteAnimationSpec<",
            "Ljava/lang/Float;",
            ">;"
        }
    .end annotation
.end field

.field private static final DockedEnterTransition:Landroidx/compose/animation/EnterTransition;

.field private static final DockedExitTransition:Landroidx/compose/animation/ExitTransition;

.field private static final DockedExpandedTableMaxHeightScreenRatio:F = 0.6666667f

.field private static final DockedExpandedTableMinHeight:F

.field private static final LayoutIdInputField:Ljava/lang/String; = "InputField"

.field private static final LayoutIdSearchContent:Ljava/lang/String; = "Content"

.field private static final LayoutIdSurface:Ljava/lang/String; = "Surface"

.field private static final SearchBarCornerRadius:F

.field private static final SearchBarIconOffsetX:F

.field private static final SearchBarMaxWidth:F

.field private static final SearchBarMinWidth:F

.field private static final SearchBarPredictiveBackMaxOffsetXRatio:F = 0.05f

.field private static final SearchBarPredictiveBackMaxOffsetY:F

.field private static final SearchBarPredictiveBackMinMargin:F

.field private static final SearchBarPredictiveBackMinScale:F = 0.9f

.field private static final SearchBarVerticalPadding:F

.field private static final UnspecifiedTextFieldColors:Landroidx/compose/material3/TextFieldColors;


# direct methods
.method static constructor <clinit>()V
    .locals 87

    .line 1
    new-instance v0, Landroidx/compose/material3/TextFieldColors;

    .line 2
    .line 3
    sget-object v1, Landroidx/compose/ui/graphics/Color;->Companion:Landroidx/compose/ui/graphics/Color$Companion;

    .line 4
    .line 5
    move-object v3, v1

    .line 6
    invoke-virtual {v3}, Landroidx/compose/ui/graphics/Color$Companion;->getUnspecified-0d7_KjU()J

    .line 7
    .line 8
    .line 9
    move-result-wide v1

    .line 10
    move-object v5, v3

    .line 11
    invoke-virtual {v5}, Landroidx/compose/ui/graphics/Color$Companion;->getUnspecified-0d7_KjU()J

    .line 12
    .line 13
    .line 14
    move-result-wide v3

    .line 15
    move-object v7, v5

    .line 16
    invoke-virtual {v7}, Landroidx/compose/ui/graphics/Color$Companion;->getUnspecified-0d7_KjU()J

    .line 17
    .line 18
    .line 19
    move-result-wide v5

    .line 20
    move-object v9, v7

    .line 21
    invoke-virtual {v9}, Landroidx/compose/ui/graphics/Color$Companion;->getUnspecified-0d7_KjU()J

    .line 22
    .line 23
    .line 24
    move-result-wide v7

    .line 25
    move-object v11, v9

    .line 26
    invoke-virtual {v11}, Landroidx/compose/ui/graphics/Color$Companion;->getUnspecified-0d7_KjU()J

    .line 27
    .line 28
    .line 29
    move-result-wide v9

    .line 30
    move-object v13, v11

    .line 31
    invoke-virtual {v13}, Landroidx/compose/ui/graphics/Color$Companion;->getUnspecified-0d7_KjU()J

    .line 32
    .line 33
    .line 34
    move-result-wide v11

    .line 35
    move-object v15, v13

    .line 36
    invoke-virtual {v15}, Landroidx/compose/ui/graphics/Color$Companion;->getUnspecified-0d7_KjU()J

    .line 37
    .line 38
    .line 39
    move-result-wide v13

    .line 40
    move-object/from16 v17, v15

    .line 41
    .line 42
    invoke-virtual/range {v17 .. v17}, Landroidx/compose/ui/graphics/Color$Companion;->getUnspecified-0d7_KjU()J

    .line 43
    .line 44
    .line 45
    move-result-wide v15

    .line 46
    move-object/from16 v19, v17

    .line 47
    .line 48
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/Color$Companion;->getUnspecified-0d7_KjU()J

    .line 49
    .line 50
    .line 51
    move-result-wide v17

    .line 52
    move-object/from16 v21, v19

    .line 53
    .line 54
    invoke-virtual/range {v21 .. v21}, Landroidx/compose/ui/graphics/Color$Companion;->getUnspecified-0d7_KjU()J

    .line 55
    .line 56
    .line 57
    move-result-wide v19

    .line 58
    new-instance v22, Landroidx/compose/foundation/text/selection/TextSelectionColors;

    .line 59
    .line 60
    invoke-virtual/range {v21 .. v21}, Landroidx/compose/ui/graphics/Color$Companion;->getUnspecified-0d7_KjU()J

    .line 61
    .line 62
    .line 63
    move-result-wide v23

    .line 64
    invoke-virtual/range {v21 .. v21}, Landroidx/compose/ui/graphics/Color$Companion;->getUnspecified-0d7_KjU()J

    .line 65
    .line 66
    .line 67
    move-result-wide v25

    .line 68
    const/16 v27, 0x0

    .line 69
    .line 70
    invoke-direct/range {v22 .. v27}, Landroidx/compose/foundation/text/selection/TextSelectionColors;-><init>(JJLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 71
    .line 72
    .line 73
    invoke-virtual/range {v21 .. v21}, Landroidx/compose/ui/graphics/Color$Companion;->getUnspecified-0d7_KjU()J

    .line 74
    .line 75
    .line 76
    move-result-wide v23

    .line 77
    move-object/from16 v26, v21

    .line 78
    .line 79
    move-object/from16 v21, v22

    .line 80
    .line 81
    move-wide/from16 v22, v23

    .line 82
    .line 83
    invoke-virtual/range {v26 .. v26}, Landroidx/compose/ui/graphics/Color$Companion;->getUnspecified-0d7_KjU()J

    .line 84
    .line 85
    .line 86
    move-result-wide v24

    .line 87
    move-object/from16 v28, v26

    .line 88
    .line 89
    invoke-virtual/range {v28 .. v28}, Landroidx/compose/ui/graphics/Color$Companion;->getUnspecified-0d7_KjU()J

    .line 90
    .line 91
    .line 92
    move-result-wide v26

    .line 93
    move-object/from16 v30, v28

    .line 94
    .line 95
    invoke-virtual/range {v30 .. v30}, Landroidx/compose/ui/graphics/Color$Companion;->getUnspecified-0d7_KjU()J

    .line 96
    .line 97
    .line 98
    move-result-wide v28

    .line 99
    move-object/from16 v32, v30

    .line 100
    .line 101
    invoke-virtual/range {v32 .. v32}, Landroidx/compose/ui/graphics/Color$Companion;->getUnspecified-0d7_KjU()J

    .line 102
    .line 103
    .line 104
    move-result-wide v30

    .line 105
    move-object/from16 v34, v32

    .line 106
    .line 107
    invoke-virtual/range {v34 .. v34}, Landroidx/compose/ui/graphics/Color$Companion;->getUnspecified-0d7_KjU()J

    .line 108
    .line 109
    .line 110
    move-result-wide v32

    .line 111
    move-object/from16 v36, v34

    .line 112
    .line 113
    invoke-virtual/range {v36 .. v36}, Landroidx/compose/ui/graphics/Color$Companion;->getUnspecified-0d7_KjU()J

    .line 114
    .line 115
    .line 116
    move-result-wide v34

    .line 117
    move-object/from16 v38, v36

    .line 118
    .line 119
    invoke-virtual/range {v38 .. v38}, Landroidx/compose/ui/graphics/Color$Companion;->getUnspecified-0d7_KjU()J

    .line 120
    .line 121
    .line 122
    move-result-wide v36

    .line 123
    move-object/from16 v40, v38

    .line 124
    .line 125
    invoke-virtual/range {v40 .. v40}, Landroidx/compose/ui/graphics/Color$Companion;->getUnspecified-0d7_KjU()J

    .line 126
    .line 127
    .line 128
    move-result-wide v38

    .line 129
    move-object/from16 v42, v40

    .line 130
    .line 131
    invoke-virtual/range {v42 .. v42}, Landroidx/compose/ui/graphics/Color$Companion;->getUnspecified-0d7_KjU()J

    .line 132
    .line 133
    .line 134
    move-result-wide v40

    .line 135
    move-object/from16 v44, v42

    .line 136
    .line 137
    invoke-virtual/range {v44 .. v44}, Landroidx/compose/ui/graphics/Color$Companion;->getUnspecified-0d7_KjU()J

    .line 138
    .line 139
    .line 140
    move-result-wide v42

    .line 141
    move-object/from16 v46, v44

    .line 142
    .line 143
    invoke-virtual/range {v46 .. v46}, Landroidx/compose/ui/graphics/Color$Companion;->getUnspecified-0d7_KjU()J

    .line 144
    .line 145
    .line 146
    move-result-wide v44

    .line 147
    move-object/from16 v48, v46

    .line 148
    .line 149
    invoke-virtual/range {v48 .. v48}, Landroidx/compose/ui/graphics/Color$Companion;->getUnspecified-0d7_KjU()J

    .line 150
    .line 151
    .line 152
    move-result-wide v46

    .line 153
    move-object/from16 v50, v48

    .line 154
    .line 155
    invoke-virtual/range {v50 .. v50}, Landroidx/compose/ui/graphics/Color$Companion;->getUnspecified-0d7_KjU()J

    .line 156
    .line 157
    .line 158
    move-result-wide v48

    .line 159
    move-object/from16 v52, v50

    .line 160
    .line 161
    invoke-virtual/range {v52 .. v52}, Landroidx/compose/ui/graphics/Color$Companion;->getUnspecified-0d7_KjU()J

    .line 162
    .line 163
    .line 164
    move-result-wide v50

    .line 165
    move-object/from16 v54, v52

    .line 166
    .line 167
    invoke-virtual/range {v54 .. v54}, Landroidx/compose/ui/graphics/Color$Companion;->getUnspecified-0d7_KjU()J

    .line 168
    .line 169
    .line 170
    move-result-wide v52

    .line 171
    move-object/from16 v56, v54

    .line 172
    .line 173
    invoke-virtual/range {v56 .. v56}, Landroidx/compose/ui/graphics/Color$Companion;->getUnspecified-0d7_KjU()J

    .line 174
    .line 175
    .line 176
    move-result-wide v54

    .line 177
    move-object/from16 v58, v56

    .line 178
    .line 179
    invoke-virtual/range {v58 .. v58}, Landroidx/compose/ui/graphics/Color$Companion;->getUnspecified-0d7_KjU()J

    .line 180
    .line 181
    .line 182
    move-result-wide v56

    .line 183
    move-object/from16 v60, v58

    .line 184
    .line 185
    invoke-virtual/range {v60 .. v60}, Landroidx/compose/ui/graphics/Color$Companion;->getUnspecified-0d7_KjU()J

    .line 186
    .line 187
    .line 188
    move-result-wide v58

    .line 189
    move-object/from16 v62, v60

    .line 190
    .line 191
    invoke-virtual/range {v62 .. v62}, Landroidx/compose/ui/graphics/Color$Companion;->getUnspecified-0d7_KjU()J

    .line 192
    .line 193
    .line 194
    move-result-wide v60

    .line 195
    move-object/from16 v64, v62

    .line 196
    .line 197
    invoke-virtual/range {v64 .. v64}, Landroidx/compose/ui/graphics/Color$Companion;->getUnspecified-0d7_KjU()J

    .line 198
    .line 199
    .line 200
    move-result-wide v62

    .line 201
    move-object/from16 v66, v64

    .line 202
    .line 203
    invoke-virtual/range {v66 .. v66}, Landroidx/compose/ui/graphics/Color$Companion;->getUnspecified-0d7_KjU()J

    .line 204
    .line 205
    .line 206
    move-result-wide v64

    .line 207
    move-object/from16 v68, v66

    .line 208
    .line 209
    invoke-virtual/range {v68 .. v68}, Landroidx/compose/ui/graphics/Color$Companion;->getUnspecified-0d7_KjU()J

    .line 210
    .line 211
    .line 212
    move-result-wide v66

    .line 213
    move-object/from16 v70, v68

    .line 214
    .line 215
    invoke-virtual/range {v70 .. v70}, Landroidx/compose/ui/graphics/Color$Companion;->getUnspecified-0d7_KjU()J

    .line 216
    .line 217
    .line 218
    move-result-wide v68

    .line 219
    move-object/from16 v72, v70

    .line 220
    .line 221
    invoke-virtual/range {v72 .. v72}, Landroidx/compose/ui/graphics/Color$Companion;->getUnspecified-0d7_KjU()J

    .line 222
    .line 223
    .line 224
    move-result-wide v70

    .line 225
    move-object/from16 v74, v72

    .line 226
    .line 227
    invoke-virtual/range {v74 .. v74}, Landroidx/compose/ui/graphics/Color$Companion;->getUnspecified-0d7_KjU()J

    .line 228
    .line 229
    .line 230
    move-result-wide v72

    .line 231
    move-object/from16 v76, v74

    .line 232
    .line 233
    invoke-virtual/range {v76 .. v76}, Landroidx/compose/ui/graphics/Color$Companion;->getUnspecified-0d7_KjU()J

    .line 234
    .line 235
    .line 236
    move-result-wide v74

    .line 237
    move-object/from16 v78, v76

    .line 238
    .line 239
    invoke-virtual/range {v78 .. v78}, Landroidx/compose/ui/graphics/Color$Companion;->getUnspecified-0d7_KjU()J

    .line 240
    .line 241
    .line 242
    move-result-wide v76

    .line 243
    move-object/from16 v80, v78

    .line 244
    .line 245
    invoke-virtual/range {v80 .. v80}, Landroidx/compose/ui/graphics/Color$Companion;->getUnspecified-0d7_KjU()J

    .line 246
    .line 247
    .line 248
    move-result-wide v78

    .line 249
    move-object/from16 v82, v80

    .line 250
    .line 251
    invoke-virtual/range {v82 .. v82}, Landroidx/compose/ui/graphics/Color$Companion;->getUnspecified-0d7_KjU()J

    .line 252
    .line 253
    .line 254
    move-result-wide v80

    .line 255
    move-object/from16 v84, v82

    .line 256
    .line 257
    invoke-virtual/range {v84 .. v84}, Landroidx/compose/ui/graphics/Color$Companion;->getUnspecified-0d7_KjU()J

    .line 258
    .line 259
    .line 260
    move-result-wide v82

    .line 261
    invoke-virtual/range {v84 .. v84}, Landroidx/compose/ui/graphics/Color$Companion;->getUnspecified-0d7_KjU()J

    .line 262
    .line 263
    .line 264
    move-result-wide v84

    .line 265
    const/16 v86, 0x0

    .line 266
    .line 267
    invoke-direct/range {v0 .. v86}, Landroidx/compose/material3/TextFieldColors;-><init>(JJJJJJJJJJLandroidx/compose/foundation/text/selection/TextSelectionColors;JJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 268
    .line 269
    .line 270
    sput-object v0, Landroidx/compose/material3/SearchBar_androidKt;->UnspecifiedTextFieldColors:Landroidx/compose/material3/TextFieldColors;

    .line 271
    .line 272
    sget-object v0, Landroidx/compose/material3/SearchBarDefaults;->INSTANCE:Landroidx/compose/material3/SearchBarDefaults;

    .line 273
    .line 274
    invoke-virtual {v0}, Landroidx/compose/material3/SearchBarDefaults;->getInputFieldHeight-D9Ej5fM()F

    .line 275
    .line 276
    .line 277
    move-result v0

    .line 278
    const/4 v1, 0x2

    .line 279
    int-to-float v2, v1

    .line 280
    div-float/2addr v0, v2

    .line 281
    invoke-static {v0}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 282
    .line 283
    .line 284
    move-result v0

    .line 285
    sput v0, Landroidx/compose/material3/SearchBar_androidKt;->SearchBarCornerRadius:F

    .line 286
    .line 287
    const/16 v0, 0xf0

    .line 288
    .line 289
    int-to-float v0, v0

    .line 290
    invoke-static {v0}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 291
    .line 292
    .line 293
    move-result v0

    .line 294
    sput v0, Landroidx/compose/material3/SearchBar_androidKt;->DockedExpandedTableMinHeight:F

    .line 295
    .line 296
    const/16 v0, 0x168

    .line 297
    .line 298
    int-to-float v0, v0

    .line 299
    invoke-static {v0}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 300
    .line 301
    .line 302
    move-result v0

    .line 303
    sput v0, Landroidx/compose/material3/SearchBar_androidKt;->SearchBarMinWidth:F

    .line 304
    .line 305
    const/16 v0, 0x2d0

    .line 306
    .line 307
    int-to-float v0, v0

    .line 308
    invoke-static {v0}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 309
    .line 310
    .line 311
    move-result v0

    .line 312
    sput v0, Landroidx/compose/material3/SearchBar_androidKt;->SearchBarMaxWidth:F

    .line 313
    .line 314
    const/16 v0, 0x8

    .line 315
    .line 316
    int-to-float v0, v0

    .line 317
    invoke-static {v0}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 318
    .line 319
    .line 320
    move-result v2

    .line 321
    sput v2, Landroidx/compose/material3/SearchBar_androidKt;->SearchBarVerticalPadding:F

    .line 322
    .line 323
    const/4 v2, 0x4

    .line 324
    int-to-float v2, v2

    .line 325
    invoke-static {v2}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 326
    .line 327
    .line 328
    move-result v2

    .line 329
    sput v2, Landroidx/compose/material3/SearchBar_androidKt;->SearchBarIconOffsetX:F

    .line 330
    .line 331
    invoke-static {v0}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 332
    .line 333
    .line 334
    move-result v0

    .line 335
    sput v0, Landroidx/compose/material3/SearchBar_androidKt;->SearchBarPredictiveBackMinMargin:F

    .line 336
    .line 337
    const/16 v0, 0x18

    .line 338
    .line 339
    int-to-float v0, v0

    .line 340
    invoke-static {v0}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 341
    .line 342
    .line 343
    move-result v0

    .line 344
    sput v0, Landroidx/compose/material3/SearchBar_androidKt;->SearchBarPredictiveBackMaxOffsetY:F

    .line 345
    .line 346
    sget-object v0, Landroidx/compose/material3/tokens/MotionTokens;->INSTANCE:Landroidx/compose/material3/tokens/MotionTokens;

    .line 347
    .line 348
    invoke-virtual {v0}, Landroidx/compose/material3/tokens/MotionTokens;->getEasingEmphasizedDecelerateCubicBezier()Landroidx/compose/animation/core/CubicBezierEasing;

    .line 349
    .line 350
    .line 351
    move-result-object v0

    .line 352
    sput-object v0, Landroidx/compose/material3/SearchBar_androidKt;->AnimationEnterEasing:Landroidx/compose/animation/core/CubicBezierEasing;

    .line 353
    .line 354
    new-instance v2, Landroidx/compose/animation/core/CubicBezierEasing;

    .line 355
    .line 356
    const/high16 v3, 0x3f800000    # 1.0f

    .line 357
    .line 358
    const/4 v4, 0x0

    .line 359
    invoke-direct {v2, v4, v3, v4, v3}, Landroidx/compose/animation/core/CubicBezierEasing;-><init>(FFFF)V

    .line 360
    .line 361
    .line 362
    sput-object v2, Landroidx/compose/material3/SearchBar_androidKt;->AnimationExitEasing:Landroidx/compose/animation/core/CubicBezierEasing;

    .line 363
    .line 364
    const/16 v3, 0x258

    .line 365
    .line 366
    const/16 v5, 0x64

    .line 367
    .line 368
    invoke-static {v3, v5, v0}, Landroidx/compose/animation/core/AnimationSpecKt;->tween(IILandroidx/compose/animation/core/Easing;)Landroidx/compose/animation/core/TweenSpec;

    .line 369
    .line 370
    .line 371
    move-result-object v6

    .line 372
    sput-object v6, Landroidx/compose/material3/SearchBar_androidKt;->AnimationEnterFloatSpec:Landroidx/compose/animation/core/FiniteAnimationSpec;

    .line 373
    .line 374
    const/16 v7, 0x15e

    .line 375
    .line 376
    invoke-static {v7, v5, v2}, Landroidx/compose/animation/core/AnimationSpecKt;->tween(IILandroidx/compose/animation/core/Easing;)Landroidx/compose/animation/core/TweenSpec;

    .line 377
    .line 378
    .line 379
    move-result-object v8

    .line 380
    sput-object v8, Landroidx/compose/material3/SearchBar_androidKt;->AnimationExitFloatSpec:Landroidx/compose/animation/core/FiniteAnimationSpec;

    .line 381
    .line 382
    const/4 v9, 0x0

    .line 383
    const/4 v10, 0x0

    .line 384
    invoke-static {v7, v9, v2, v1, v10}, Landroidx/compose/animation/core/AnimationSpecKt;->tween$default(IILandroidx/compose/animation/core/Easing;ILjava/lang/Object;)Landroidx/compose/animation/core/TweenSpec;

    .line 385
    .line 386
    .line 387
    move-result-object v9

    .line 388
    sput-object v9, Landroidx/compose/material3/SearchBar_androidKt;->AnimationPredictiveBackExitFloatSpec:Landroidx/compose/animation/core/FiniteAnimationSpec;

    .line 389
    .line 390
    invoke-static {v3, v5, v0}, Landroidx/compose/animation/core/AnimationSpecKt;->tween(IILandroidx/compose/animation/core/Easing;)Landroidx/compose/animation/core/TweenSpec;

    .line 391
    .line 392
    .line 393
    move-result-object v11

    .line 394
    sput-object v11, Landroidx/compose/material3/SearchBar_androidKt;->AnimationEnterSizeSpec:Landroidx/compose/animation/core/FiniteAnimationSpec;

    .line 395
    .line 396
    invoke-static {v7, v5, v2}, Landroidx/compose/animation/core/AnimationSpecKt;->tween(IILandroidx/compose/animation/core/Easing;)Landroidx/compose/animation/core/TweenSpec;

    .line 397
    .line 398
    .line 399
    move-result-object v0

    .line 400
    sput-object v0, Landroidx/compose/material3/SearchBar_androidKt;->AnimationExitSizeSpec:Landroidx/compose/animation/core/FiniteAnimationSpec;

    .line 401
    .line 402
    invoke-static {v6, v4, v1, v10}, Landroidx/compose/animation/EnterExitTransitionKt;->fadeIn$default(Landroidx/compose/animation/core/FiniteAnimationSpec;FILjava/lang/Object;)Landroidx/compose/animation/EnterTransition;

    .line 403
    .line 404
    .line 405
    move-result-object v2

    .line 406
    const/16 v15, 0xe

    .line 407
    .line 408
    const/16 v16, 0x0

    .line 409
    .line 410
    const/4 v12, 0x0

    .line 411
    const/4 v13, 0x0

    .line 412
    const/4 v14, 0x0

    .line 413
    invoke-static/range {v11 .. v16}, Landroidx/compose/animation/EnterExitTransitionKt;->expandVertically$default(Landroidx/compose/animation/core/FiniteAnimationSpec;Landroidx/compose/ui/Alignment$Vertical;ZLkotlin/jvm/functions/Function1;ILjava/lang/Object;)Landroidx/compose/animation/EnterTransition;

    .line 414
    .line 415
    .line 416
    move-result-object v3

    .line 417
    invoke-virtual {v2, v3}, Landroidx/compose/animation/EnterTransition;->plus(Landroidx/compose/animation/EnterTransition;)Landroidx/compose/animation/EnterTransition;

    .line 418
    .line 419
    .line 420
    move-result-object v2

    .line 421
    sput-object v2, Landroidx/compose/material3/SearchBar_androidKt;->DockedEnterTransition:Landroidx/compose/animation/EnterTransition;

    .line 422
    .line 423
    invoke-static {v8, v4, v1, v10}, Landroidx/compose/animation/EnterExitTransitionKt;->fadeOut$default(Landroidx/compose/animation/core/FiniteAnimationSpec;FILjava/lang/Object;)Landroidx/compose/animation/ExitTransition;

    .line 424
    .line 425
    .line 426
    move-result-object v1

    .line 427
    const/16 v16, 0xe

    .line 428
    .line 429
    const/16 v17, 0x0

    .line 430
    .line 431
    const/4 v13, 0x0

    .line 432
    const/4 v14, 0x0

    .line 433
    const/4 v15, 0x0

    .line 434
    move-object v12, v0

    .line 435
    invoke-static/range {v12 .. v17}, Landroidx/compose/animation/EnterExitTransitionKt;->shrinkVertically$default(Landroidx/compose/animation/core/FiniteAnimationSpec;Landroidx/compose/ui/Alignment$Vertical;ZLkotlin/jvm/functions/Function1;ILjava/lang/Object;)Landroidx/compose/animation/ExitTransition;

    .line 436
    .line 437
    .line 438
    move-result-object v0

    .line 439
    invoke-virtual {v1, v0}, Landroidx/compose/animation/ExitTransition;->plus(Landroidx/compose/animation/ExitTransition;)Landroidx/compose/animation/ExitTransition;

    .line 440
    .line 441
    .line 442
    move-result-object v0

    .line 443
    sput-object v0, Landroidx/compose/material3/SearchBar_androidKt;->DockedExitTransition:Landroidx/compose/animation/ExitTransition;

    .line 444
    .line 445
    return-void
.end method

.method public static final DockedSearchBar-EQC0FA8(Lkotlin/jvm/functions/Function2;ZLkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material3/SearchBarColors;FFLkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V
    .locals 26
    .annotation build Landroidx/compose/material3/ExperimentalMaterial3Api;
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
            ">;Z",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Ljava/lang/Boolean;",
            "Lkotlin/Unit;",
            ">;",
            "Landroidx/compose/ui/Modifier;",
            "Landroidx/compose/ui/graphics/Shape;",
            "Landroidx/compose/material3/SearchBarColors;",
            "FF",
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
    move/from16 v2, p1

    .line 4
    .line 5
    move-object/from16 v3, p2

    .line 6
    .line 7
    move-object/from16 v9, p8

    .line 8
    .line 9
    move/from16 v10, p10

    .line 10
    .line 11
    move/from16 v11, p11

    .line 12
    .line 13
    const v0, 0x4813336b

    .line 14
    .line 15
    .line 16
    move-object/from16 v4, p9

    .line 17
    .line 18
    invoke-interface {v4, v0}, Landroidx/compose/runtime/Composer;->startRestartGroup(I)Landroidx/compose/runtime/Composer;

    .line 19
    .line 20
    .line 21
    move-result-object v4

    .line 22
    and-int/lit8 v5, v11, 0x1

    .line 23
    .line 24
    if-eqz v5, :cond_0

    .line 25
    .line 26
    or-int/lit8 v5, v10, 0x6

    .line 27
    .line 28
    goto :goto_1

    .line 29
    :cond_0
    and-int/lit8 v5, v10, 0x6

    .line 30
    .line 31
    if-nez v5, :cond_2

    .line 32
    .line 33
    invoke-interface {v4, v1}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 34
    .line 35
    .line 36
    move-result v5

    .line 37
    if-eqz v5, :cond_1

    .line 38
    .line 39
    const/4 v5, 0x4

    .line 40
    goto :goto_0

    .line 41
    :cond_1
    const/4 v5, 0x2

    .line 42
    :goto_0
    or-int/2addr v5, v10

    .line 43
    goto :goto_1

    .line 44
    :cond_2
    move v5, v10

    .line 45
    :goto_1
    and-int/lit8 v6, v11, 0x2

    .line 46
    .line 47
    if-eqz v6, :cond_3

    .line 48
    .line 49
    or-int/lit8 v5, v5, 0x30

    .line 50
    .line 51
    goto :goto_3

    .line 52
    :cond_3
    and-int/lit8 v6, v10, 0x30

    .line 53
    .line 54
    if-nez v6, :cond_5

    .line 55
    .line 56
    invoke-interface {v4, v2}, Landroidx/compose/runtime/Composer;->changed(Z)Z

    .line 57
    .line 58
    .line 59
    move-result v6

    .line 60
    if-eqz v6, :cond_4

    .line 61
    .line 62
    const/16 v6, 0x20

    .line 63
    .line 64
    goto :goto_2

    .line 65
    :cond_4
    const/16 v6, 0x10

    .line 66
    .line 67
    :goto_2
    or-int/2addr v5, v6

    .line 68
    :cond_5
    :goto_3
    and-int/lit8 v6, v11, 0x4

    .line 69
    .line 70
    if-eqz v6, :cond_6

    .line 71
    .line 72
    or-int/lit16 v5, v5, 0x180

    .line 73
    .line 74
    goto :goto_5

    .line 75
    :cond_6
    and-int/lit16 v6, v10, 0x180

    .line 76
    .line 77
    if-nez v6, :cond_8

    .line 78
    .line 79
    invoke-interface {v4, v3}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 80
    .line 81
    .line 82
    move-result v6

    .line 83
    if-eqz v6, :cond_7

    .line 84
    .line 85
    const/16 v6, 0x100

    .line 86
    .line 87
    goto :goto_4

    .line 88
    :cond_7
    const/16 v6, 0x80

    .line 89
    .line 90
    :goto_4
    or-int/2addr v5, v6

    .line 91
    :cond_8
    :goto_5
    and-int/lit8 v6, v11, 0x8

    .line 92
    .line 93
    if-eqz v6, :cond_a

    .line 94
    .line 95
    or-int/lit16 v5, v5, 0xc00

    .line 96
    .line 97
    :cond_9
    move-object/from16 v8, p3

    .line 98
    .line 99
    goto :goto_7

    .line 100
    :cond_a
    and-int/lit16 v8, v10, 0xc00

    .line 101
    .line 102
    if-nez v8, :cond_9

    .line 103
    .line 104
    move-object/from16 v8, p3

    .line 105
    .line 106
    invoke-interface {v4, v8}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 107
    .line 108
    .line 109
    move-result v12

    .line 110
    if-eqz v12, :cond_b

    .line 111
    .line 112
    const/16 v12, 0x800

    .line 113
    .line 114
    goto :goto_6

    .line 115
    :cond_b
    const/16 v12, 0x400

    .line 116
    .line 117
    :goto_6
    or-int/2addr v5, v12

    .line 118
    :goto_7
    and-int/lit16 v12, v10, 0x6000

    .line 119
    .line 120
    if-nez v12, :cond_e

    .line 121
    .line 122
    and-int/lit8 v12, v11, 0x10

    .line 123
    .line 124
    if-nez v12, :cond_c

    .line 125
    .line 126
    move-object/from16 v12, p4

    .line 127
    .line 128
    invoke-interface {v4, v12}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 129
    .line 130
    .line 131
    move-result v13

    .line 132
    if-eqz v13, :cond_d

    .line 133
    .line 134
    const/16 v13, 0x4000

    .line 135
    .line 136
    goto :goto_8

    .line 137
    :cond_c
    move-object/from16 v12, p4

    .line 138
    .line 139
    :cond_d
    const/16 v13, 0x2000

    .line 140
    .line 141
    :goto_8
    or-int/2addr v5, v13

    .line 142
    goto :goto_9

    .line 143
    :cond_e
    move-object/from16 v12, p4

    .line 144
    .line 145
    :goto_9
    const/high16 v13, 0x30000

    .line 146
    .line 147
    and-int/2addr v13, v10

    .line 148
    if-nez v13, :cond_11

    .line 149
    .line 150
    and-int/lit8 v13, v11, 0x20

    .line 151
    .line 152
    if-nez v13, :cond_f

    .line 153
    .line 154
    move-object/from16 v13, p5

    .line 155
    .line 156
    invoke-interface {v4, v13}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 157
    .line 158
    .line 159
    move-result v14

    .line 160
    if-eqz v14, :cond_10

    .line 161
    .line 162
    const/high16 v14, 0x20000

    .line 163
    .line 164
    goto :goto_a

    .line 165
    :cond_f
    move-object/from16 v13, p5

    .line 166
    .line 167
    :cond_10
    const/high16 v14, 0x10000

    .line 168
    .line 169
    :goto_a
    or-int/2addr v5, v14

    .line 170
    goto :goto_b

    .line 171
    :cond_11
    move-object/from16 v13, p5

    .line 172
    .line 173
    :goto_b
    and-int/lit8 v20, v11, 0x40

    .line 174
    .line 175
    const/high16 v14, 0x180000

    .line 176
    .line 177
    if-eqz v20, :cond_13

    .line 178
    .line 179
    or-int/2addr v5, v14

    .line 180
    :cond_12
    move/from16 v14, p6

    .line 181
    .line 182
    goto :goto_d

    .line 183
    :cond_13
    and-int/2addr v14, v10

    .line 184
    if-nez v14, :cond_12

    .line 185
    .line 186
    move/from16 v14, p6

    .line 187
    .line 188
    invoke-interface {v4, v14}, Landroidx/compose/runtime/Composer;->changed(F)Z

    .line 189
    .line 190
    .line 191
    move-result v15

    .line 192
    if-eqz v15, :cond_14

    .line 193
    .line 194
    const/high16 v15, 0x100000

    .line 195
    .line 196
    goto :goto_c

    .line 197
    :cond_14
    const/high16 v15, 0x80000

    .line 198
    .line 199
    :goto_c
    or-int/2addr v5, v15

    .line 200
    :goto_d
    and-int/lit16 v15, v11, 0x80

    .line 201
    .line 202
    const/high16 v21, 0xc00000

    .line 203
    .line 204
    if-eqz v15, :cond_15

    .line 205
    .line 206
    or-int v5, v5, v21

    .line 207
    .line 208
    move/from16 v7, p7

    .line 209
    .line 210
    goto :goto_f

    .line 211
    :cond_15
    and-int v16, v10, v21

    .line 212
    .line 213
    move/from16 v7, p7

    .line 214
    .line 215
    if-nez v16, :cond_17

    .line 216
    .line 217
    invoke-interface {v4, v7}, Landroidx/compose/runtime/Composer;->changed(F)Z

    .line 218
    .line 219
    .line 220
    move-result v16

    .line 221
    if-eqz v16, :cond_16

    .line 222
    .line 223
    const/high16 v16, 0x800000

    .line 224
    .line 225
    goto :goto_e

    .line 226
    :cond_16
    const/high16 v16, 0x400000

    .line 227
    .line 228
    :goto_e
    or-int v5, v5, v16

    .line 229
    .line 230
    :cond_17
    :goto_f
    and-int/lit16 v0, v11, 0x100

    .line 231
    .line 232
    const/high16 v16, 0x6000000

    .line 233
    .line 234
    if-eqz v0, :cond_18

    .line 235
    .line 236
    or-int v5, v5, v16

    .line 237
    .line 238
    goto :goto_11

    .line 239
    :cond_18
    and-int v0, v10, v16

    .line 240
    .line 241
    if-nez v0, :cond_1a

    .line 242
    .line 243
    invoke-interface {v4, v9}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 244
    .line 245
    .line 246
    move-result v0

    .line 247
    if-eqz v0, :cond_19

    .line 248
    .line 249
    const/high16 v0, 0x4000000

    .line 250
    .line 251
    goto :goto_10

    .line 252
    :cond_19
    const/high16 v0, 0x2000000

    .line 253
    .line 254
    :goto_10
    or-int/2addr v5, v0

    .line 255
    :cond_1a
    :goto_11
    const v0, 0x2492493

    .line 256
    .line 257
    .line 258
    and-int/2addr v0, v5

    .line 259
    move/from16 v16, v5

    .line 260
    .line 261
    const v5, 0x2492492

    .line 262
    .line 263
    .line 264
    if-ne v0, v5, :cond_1c

    .line 265
    .line 266
    invoke-interface {v4}, Landroidx/compose/runtime/Composer;->getSkipping()Z

    .line 267
    .line 268
    .line 269
    move-result v0

    .line 270
    if-nez v0, :cond_1b

    .line 271
    .line 272
    goto :goto_12

    .line 273
    :cond_1b
    invoke-interface {v4}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    .line 274
    .line 275
    .line 276
    move v5, v14

    .line 277
    move-object v14, v4

    .line 278
    move-object v4, v8

    .line 279
    move v8, v7

    .line 280
    move v7, v5

    .line 281
    move-object v5, v12

    .line 282
    move-object v6, v13

    .line 283
    goto/16 :goto_1b

    .line 284
    .line 285
    :cond_1c
    :goto_12
    invoke-interface {v4}, Landroidx/compose/runtime/Composer;->startDefaults()V

    .line 286
    .line 287
    .line 288
    and-int/lit8 v0, v10, 0x1

    .line 289
    .line 290
    const v5, -0x70001

    .line 291
    .line 292
    .line 293
    const v17, -0xe001

    .line 294
    .line 295
    .line 296
    if-eqz v0, :cond_20

    .line 297
    .line 298
    invoke-interface {v4}, Landroidx/compose/runtime/Composer;->getDefaultsInvalid()Z

    .line 299
    .line 300
    .line 301
    move-result v0

    .line 302
    if-eqz v0, :cond_1d

    .line 303
    .line 304
    goto :goto_14

    .line 305
    :cond_1d
    invoke-interface {v4}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    .line 306
    .line 307
    .line 308
    and-int/lit8 v0, v11, 0x10

    .line 309
    .line 310
    if-eqz v0, :cond_1e

    .line 311
    .line 312
    and-int v0, v16, v17

    .line 313
    .line 314
    goto :goto_13

    .line 315
    :cond_1e
    move/from16 v0, v16

    .line 316
    .line 317
    :goto_13
    and-int/lit8 v6, v11, 0x20

    .line 318
    .line 319
    if-eqz v6, :cond_1f

    .line 320
    .line 321
    and-int/2addr v0, v5

    .line 322
    :cond_1f
    move v5, v0

    .line 323
    move/from16 v19, v7

    .line 324
    .line 325
    move-object v0, v13

    .line 326
    move/from16 v18, v14

    .line 327
    .line 328
    move-object v14, v4

    .line 329
    move-object v13, v12

    .line 330
    goto/16 :goto_19

    .line 331
    .line 332
    :cond_20
    :goto_14
    if-eqz v6, :cond_21

    .line 333
    .line 334
    sget-object v0, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    .line 335
    .line 336
    move-object v8, v0

    .line 337
    :cond_21
    and-int/lit8 v0, v11, 0x10

    .line 338
    .line 339
    if-eqz v0, :cond_22

    .line 340
    .line 341
    sget-object v0, Landroidx/compose/material3/SearchBarDefaults;->INSTANCE:Landroidx/compose/material3/SearchBarDefaults;

    .line 342
    .line 343
    const/4 v6, 0x6

    .line 344
    invoke-virtual {v0, v4, v6}, Landroidx/compose/material3/SearchBarDefaults;->getDockedShape(Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/graphics/Shape;

    .line 345
    .line 346
    .line 347
    move-result-object v0

    .line 348
    and-int v6, v16, v17

    .line 349
    .line 350
    goto :goto_15

    .line 351
    :cond_22
    move-object v0, v12

    .line 352
    move/from16 v6, v16

    .line 353
    .line 354
    :goto_15
    and-int/lit8 v12, v11, 0x20

    .line 355
    .line 356
    if-eqz v12, :cond_23

    .line 357
    .line 358
    sget-object v12, Landroidx/compose/material3/SearchBarDefaults;->INSTANCE:Landroidx/compose/material3/SearchBarDefaults;

    .line 359
    .line 360
    const/16 v18, 0x180

    .line 361
    .line 362
    const/16 v19, 0x3

    .line 363
    .line 364
    const-wide/16 v13, 0x0

    .line 365
    .line 366
    move/from16 v17, v15

    .line 367
    .line 368
    const-wide/16 v15, 0x0

    .line 369
    .line 370
    move/from16 v25, v17

    .line 371
    .line 372
    move-object/from16 v17, v4

    .line 373
    .line 374
    move/from16 v4, v25

    .line 375
    .line 376
    invoke-virtual/range {v12 .. v19}, Landroidx/compose/material3/SearchBarDefaults;->colors-dgg9oW8(JJLandroidx/compose/runtime/Composer;II)Landroidx/compose/material3/SearchBarColors;

    .line 377
    .line 378
    .line 379
    move-result-object v12

    .line 380
    move-object/from16 v14, v17

    .line 381
    .line 382
    and-int/2addr v5, v6

    .line 383
    goto :goto_16

    .line 384
    :cond_23
    move-object v14, v4

    .line 385
    move v4, v15

    .line 386
    move v5, v6

    .line 387
    move-object v12, v13

    .line 388
    :goto_16
    if-eqz v20, :cond_24

    .line 389
    .line 390
    sget-object v6, Landroidx/compose/material3/SearchBarDefaults;->INSTANCE:Landroidx/compose/material3/SearchBarDefaults;

    .line 391
    .line 392
    invoke-virtual {v6}, Landroidx/compose/material3/SearchBarDefaults;->getTonalElevation-D9Ej5fM()F

    .line 393
    .line 394
    .line 395
    move-result v6

    .line 396
    goto :goto_17

    .line 397
    :cond_24
    move/from16 v6, p6

    .line 398
    .line 399
    :goto_17
    if-eqz v4, :cond_25

    .line 400
    .line 401
    sget-object v4, Landroidx/compose/material3/SearchBarDefaults;->INSTANCE:Landroidx/compose/material3/SearchBarDefaults;

    .line 402
    .line 403
    invoke-virtual {v4}, Landroidx/compose/material3/SearchBarDefaults;->getShadowElevation-D9Ej5fM()F

    .line 404
    .line 405
    .line 406
    move-result v4

    .line 407
    move-object v13, v0

    .line 408
    move/from16 v19, v4

    .line 409
    .line 410
    move/from16 v18, v6

    .line 411
    .line 412
    :goto_18
    move-object v0, v12

    .line 413
    goto :goto_19

    .line 414
    :cond_25
    move-object v13, v0

    .line 415
    move/from16 v18, v6

    .line 416
    .line 417
    move/from16 v19, v7

    .line 418
    .line 419
    goto :goto_18

    .line 420
    :goto_19
    invoke-interface {v14}, Landroidx/compose/runtime/Composer;->endDefaults()V

    .line 421
    .line 422
    .line 423
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 424
    .line 425
    .line 426
    move-result v4

    .line 427
    if-eqz v4, :cond_26

    .line 428
    .line 429
    const/4 v4, -0x1

    .line 430
    const-string/jumbo v6, "androidx.compose.material3.DockedSearchBar (SearchBar.android.kt:292)"

    .line 431
    .line 432
    .line 433
    const v7, 0x4813336b

    .line 434
    .line 435
    .line 436
    invoke-static {v7, v5, v4, v6}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 437
    .line 438
    .line 439
    :cond_26
    invoke-virtual {v0}, Landroidx/compose/material3/SearchBarColors;->getContainerColor-0d7_KjU()J

    .line 440
    .line 441
    .line 442
    move-result-wide v6

    .line 443
    move-wide/from16 p3, v6

    .line 444
    .line 445
    invoke-virtual {v0}, Landroidx/compose/material3/SearchBarColors;->getContainerColor-0d7_KjU()J

    .line 446
    .line 447
    .line 448
    move-result-wide v6

    .line 449
    const/4 v4, 0x0

    .line 450
    invoke-static {v6, v7, v14, v4}, Landroidx/compose/material3/ColorSchemeKt;->contentColorFor-ek8zF_U(JLandroidx/compose/runtime/Composer;I)J

    .line 451
    .line 452
    .line 453
    move-result-wide v16

    .line 454
    const/high16 v6, 0x3f800000    # 1.0f

    .line 455
    .line 456
    invoke-static {v8, v6}, Landroidx/compose/ui/ZIndexModifierKt;->zIndex(Landroidx/compose/ui/Modifier;F)Landroidx/compose/ui/Modifier;

    .line 457
    .line 458
    .line 459
    move-result-object v6

    .line 460
    sget v7, Landroidx/compose/material3/SearchBar_androidKt;->SearchBarMinWidth:F

    .line 461
    .line 462
    invoke-static {v6, v7}, Landroidx/compose/foundation/layout/SizeKt;->width-3ABfNKs(Landroidx/compose/ui/Modifier;F)Landroidx/compose/ui/Modifier;

    .line 463
    .line 464
    .line 465
    move-result-object v12

    .line 466
    new-instance v6, Landroidx/compose/material3/SearchBar_androidKt$DockedSearchBar$1;

    .line 467
    .line 468
    invoke-direct {v6, v1, v2, v0, v9}, Landroidx/compose/material3/SearchBar_androidKt$DockedSearchBar$1;-><init>(Lkotlin/jvm/functions/Function2;ZLandroidx/compose/material3/SearchBarColors;Lkotlin/jvm/functions/Function3;)V

    .line 469
    .line 470
    .line 471
    const/16 v7, 0x36

    .line 472
    .line 473
    const v15, 0x345c6870

    .line 474
    .line 475
    .line 476
    const/4 v4, 0x1

    .line 477
    invoke-static {v15, v4, v6, v14, v7}, Landroidx/compose/runtime/internal/ComposableLambdaKt;->rememberComposableLambda(IZLjava/lang/Object;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/internal/ComposableLambda;

    .line 478
    .line 479
    .line 480
    move-result-object v6

    .line 481
    shr-int/lit8 v7, v5, 0x9

    .line 482
    .line 483
    and-int/lit8 v7, v7, 0x70

    .line 484
    .line 485
    or-int v7, v7, v21

    .line 486
    .line 487
    shr-int/lit8 v15, v5, 0x6

    .line 488
    .line 489
    const v20, 0xe000

    .line 490
    .line 491
    .line 492
    and-int v20, v15, v20

    .line 493
    .line 494
    or-int v7, v7, v20

    .line 495
    .line 496
    const/high16 v20, 0x70000

    .line 497
    .line 498
    and-int v15, v15, v20

    .line 499
    .line 500
    or-int v23, v7, v15

    .line 501
    .line 502
    const/16 v24, 0x40

    .line 503
    .line 504
    const/16 v20, 0x0

    .line 505
    .line 506
    move-object/from16 v21, v6

    .line 507
    .line 508
    move-object/from16 v22, v14

    .line 509
    .line 510
    move-wide/from16 v14, p3

    .line 511
    .line 512
    invoke-static/range {v12 .. v24}, Landroidx/compose/material3/SurfaceKt;->Surface-T9BRK9s(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/graphics/Shape;JJFFLandroidx/compose/foundation/BorderStroke;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V

    .line 513
    .line 514
    .line 515
    move-object/from16 v14, v22

    .line 516
    .line 517
    and-int/lit16 v6, v5, 0x380

    .line 518
    .line 519
    const/16 v7, 0x100

    .line 520
    .line 521
    if-ne v6, v7, :cond_27

    .line 522
    .line 523
    goto :goto_1a

    .line 524
    :cond_27
    const/4 v4, 0x0

    .line 525
    :goto_1a
    invoke-interface {v14}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 526
    .line 527
    .line 528
    move-result-object v6

    .line 529
    if-nez v4, :cond_28

    .line 530
    .line 531
    sget-object v4, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    .line 532
    .line 533
    invoke-virtual {v4}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    .line 534
    .line 535
    .line 536
    move-result-object v4

    .line 537
    if-ne v6, v4, :cond_29

    .line 538
    .line 539
    :cond_28
    new-instance v6, Landroidx/compose/material3/SearchBar_androidKt$DockedSearchBar$2$1;

    .line 540
    .line 541
    invoke-direct {v6, v3}, Landroidx/compose/material3/SearchBar_androidKt$DockedSearchBar$2$1;-><init>(Lkotlin/jvm/functions/Function1;)V

    .line 542
    .line 543
    .line 544
    invoke-interface {v14, v6}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 545
    .line 546
    .line 547
    :cond_29
    check-cast v6, Lkotlin/jvm/functions/Function0;

    .line 548
    .line 549
    shr-int/lit8 v4, v5, 0x3

    .line 550
    .line 551
    and-int/lit8 v4, v4, 0xe

    .line 552
    .line 553
    const/4 v5, 0x0

    .line 554
    invoke-static {v2, v6, v14, v4, v5}, Landroidx/activity/compose/BackHandlerKt;->BackHandler(ZLkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V

    .line 555
    .line 556
    .line 557
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 558
    .line 559
    .line 560
    move-result v4

    .line 561
    if-eqz v4, :cond_2a

    .line 562
    .line 563
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 564
    .line 565
    .line 566
    :cond_2a
    move-object v6, v0

    .line 567
    move-object v4, v8

    .line 568
    move-object v5, v13

    .line 569
    move/from16 v7, v18

    .line 570
    .line 571
    move/from16 v8, v19

    .line 572
    .line 573
    :goto_1b
    invoke-interface {v14}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    .line 574
    .line 575
    .line 576
    move-result-object v12

    .line 577
    if-eqz v12, :cond_2b

    .line 578
    .line 579
    new-instance v0, Landroidx/compose/material3/SearchBar_androidKt$DockedSearchBar$3;

    .line 580
    .line 581
    invoke-direct/range {v0 .. v11}, Landroidx/compose/material3/SearchBar_androidKt$DockedSearchBar$3;-><init>(Lkotlin/jvm/functions/Function2;ZLkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material3/SearchBarColors;FFLkotlin/jvm/functions/Function3;II)V

    .line 582
    .line 583
    .line 584
    invoke-interface {v12, v0}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lkotlin/jvm/functions/Function2;)V

    .line 585
    .line 586
    .line 587
    :cond_2b
    return-void
.end method

.method public static final DockedSearchBar-eWTbjVg(Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;ZLkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZLkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material3/SearchBarColors;FFLandroidx/compose/foundation/interaction/MutableInteractionSource;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;III)V
    .locals 34
    .annotation build Landroidx/compose/material3/ExperimentalMaterial3Api;
    .end annotation

    .annotation build Landroidx/compose/runtime/Composable;
    .end annotation

    .annotation build Landroidx/compose/runtime/ComposableInferredTarget;
        scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Ljava/lang/String;",
            "Lkotlin/Unit;",
            ">;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Ljava/lang/String;",
            "Lkotlin/Unit;",
            ">;Z",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Ljava/lang/Boolean;",
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
            ">;",
            "Lkotlin/jvm/functions/Function2<",
            "-",
            "Landroidx/compose/runtime/Composer;",
            "-",
            "Ljava/lang/Integer;",
            "Lkotlin/Unit;",
            ">;",
            "Landroidx/compose/ui/graphics/Shape;",
            "Landroidx/compose/material3/SearchBarColors;",
            "FF",
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
            "III)V"
        }
    .end annotation

    .annotation runtime Lkotlin/Deprecated;
        message = "Use overload which takes inputField as a parameter"
        replaceWith = .subannotation Lkotlin/ReplaceWith;
            expression = "DockedSearchBar(\n    inputField = {\n        SearchBarDefaults.InputField(\n            query = query,\n            onQueryChange = onQueryChange,\n            onSearch = onSearch,\n            expanded = active,\n            onExpandedChange = onActiveChange,\n            enabled = enabled,\n            placeholder = placeholder,\n            leadingIcon = leadingIcon,\n            trailingIcon = trailingIcon,\n            colors = colors.inputFieldColors,\n            interactionSource = interactionSource,\n        )\n    },\n    expanded = active,\n    onExpandedChange = onActiveChange,\n    modifier = modifier,\n    shape = shape,\n    colors = colors,\n    tonalElevation = tonalElevation,\n    shadowElevation = shadowElevation,\n    content = content,\n)"
            imports = {}
        .end subannotation
    .end annotation

    move/from16 v0, p17

    move/from16 v1, p18

    move/from16 v2, p19

    const v3, 0x4d6dffc5    # 2.4956014E8f

    move-object/from16 v4, p16

    .line 1
    invoke-interface {v4, v3}, Landroidx/compose/runtime/Composer;->startRestartGroup(I)Landroidx/compose/runtime/Composer;

    move-result-object v13

    and-int/lit8 v4, v2, 0x1

    if-eqz v4, :cond_0

    or-int/lit8 v4, v0, 0x6

    move-object/from16 v12, p0

    goto :goto_1

    :cond_0
    and-int/lit8 v4, v0, 0x6

    move-object/from16 v12, p0

    if-nez v4, :cond_2

    invoke-interface {v13, v12}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_1

    const/4 v4, 0x4

    goto :goto_0

    :cond_1
    const/4 v4, 0x2

    :goto_0
    or-int/2addr v4, v0

    goto :goto_1

    :cond_2
    move v4, v0

    :goto_1
    and-int/lit8 v7, v2, 0x2

    if-eqz v7, :cond_3

    or-int/lit8 v4, v4, 0x30

    move-object/from16 v14, p1

    goto :goto_3

    :cond_3
    and-int/lit8 v7, v0, 0x30

    move-object/from16 v14, p1

    if-nez v7, :cond_5

    invoke-interface {v13, v14}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_4

    const/16 v7, 0x20

    goto :goto_2

    :cond_4
    const/16 v7, 0x10

    :goto_2
    or-int/2addr v4, v7

    :cond_5
    :goto_3
    and-int/lit8 v7, v2, 0x4

    if-eqz v7, :cond_6

    or-int/lit16 v4, v4, 0x180

    move-object/from16 v15, p2

    goto :goto_5

    :cond_6
    and-int/lit16 v7, v0, 0x180

    move-object/from16 v15, p2

    if-nez v7, :cond_8

    invoke-interface {v13, v15}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_7

    const/16 v7, 0x100

    goto :goto_4

    :cond_7
    const/16 v7, 0x80

    :goto_4
    or-int/2addr v4, v7

    :cond_8
    :goto_5
    and-int/lit8 v7, v2, 0x8

    const/16 v16, 0x400

    const/16 v17, 0x800

    if-eqz v7, :cond_a

    or-int/lit16 v4, v4, 0xc00

    :cond_9
    move/from16 v7, p3

    goto :goto_7

    :cond_a
    and-int/lit16 v7, v0, 0xc00

    if-nez v7, :cond_9

    move/from16 v7, p3

    invoke-interface {v13, v7}, Landroidx/compose/runtime/Composer;->changed(Z)Z

    move-result v18

    if-eqz v18, :cond_b

    move/from16 v18, v17

    goto :goto_6

    :cond_b
    move/from16 v18, v16

    :goto_6
    or-int v4, v4, v18

    :goto_7
    and-int/lit8 v18, v2, 0x10

    const/16 v19, 0x2000

    const/16 v20, 0x4000

    if-eqz v18, :cond_d

    or-int/lit16 v4, v4, 0x6000

    :cond_c
    move-object/from16 v5, p4

    goto :goto_9

    :cond_d
    and-int/lit16 v5, v0, 0x6000

    if-nez v5, :cond_c

    move-object/from16 v5, p4

    invoke-interface {v13, v5}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v18

    if-eqz v18, :cond_e

    move/from16 v18, v20

    goto :goto_8

    :cond_e
    move/from16 v18, v19

    :goto_8
    or-int v4, v4, v18

    :goto_9
    and-int/lit8 v18, v2, 0x20

    const/high16 v21, 0x10000

    const/high16 v22, 0x20000

    const/high16 v23, 0x30000

    if-eqz v18, :cond_f

    or-int v4, v4, v23

    move-object/from16 v6, p5

    goto :goto_b

    :cond_f
    and-int v24, v0, v23

    move-object/from16 v6, p5

    if-nez v24, :cond_11

    invoke-interface {v13, v6}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v25

    if-eqz v25, :cond_10

    move/from16 v25, v22

    goto :goto_a

    :cond_10
    move/from16 v25, v21

    :goto_a
    or-int v4, v4, v25

    :cond_11
    :goto_b
    and-int/lit8 v25, v2, 0x40

    const/high16 v26, 0x180000

    if-eqz v25, :cond_12

    or-int v4, v4, v26

    move/from16 v8, p6

    goto :goto_d

    :cond_12
    and-int v26, v0, v26

    move/from16 v8, p6

    if-nez v26, :cond_14

    invoke-interface {v13, v8}, Landroidx/compose/runtime/Composer;->changed(Z)Z

    move-result v27

    if-eqz v27, :cond_13

    const/high16 v27, 0x100000

    goto :goto_c

    :cond_13
    const/high16 v27, 0x80000

    :goto_c
    or-int v4, v4, v27

    :cond_14
    :goto_d
    and-int/lit16 v9, v2, 0x80

    const/high16 v28, 0xc00000

    if-eqz v9, :cond_15

    or-int v4, v4, v28

    move-object/from16 v10, p7

    goto :goto_f

    :cond_15
    and-int v28, v0, v28

    move-object/from16 v10, p7

    if-nez v28, :cond_17

    invoke-interface {v13, v10}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v29

    if-eqz v29, :cond_16

    const/high16 v29, 0x800000

    goto :goto_e

    :cond_16
    const/high16 v29, 0x400000

    :goto_e
    or-int v4, v4, v29

    :cond_17
    :goto_f
    and-int/lit16 v11, v2, 0x100

    const/high16 v30, 0x6000000

    if-eqz v11, :cond_18

    or-int v4, v4, v30

    move-object/from16 v3, p8

    goto :goto_11

    :cond_18
    and-int v30, v0, v30

    move-object/from16 v3, p8

    if-nez v30, :cond_1a

    invoke-interface {v13, v3}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v31

    if-eqz v31, :cond_19

    const/high16 v31, 0x4000000

    goto :goto_10

    :cond_19
    const/high16 v31, 0x2000000

    :goto_10
    or-int v4, v4, v31

    :cond_1a
    :goto_11
    and-int/lit16 v0, v2, 0x200

    const/high16 v31, 0x30000000

    if-eqz v0, :cond_1c

    or-int v4, v4, v31

    :cond_1b
    move/from16 v31, v0

    move-object/from16 v0, p9

    goto :goto_13

    :cond_1c
    and-int v31, p17, v31

    if-nez v31, :cond_1b

    move/from16 v31, v0

    move-object/from16 v0, p9

    invoke-interface {v13, v0}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v32

    if-eqz v32, :cond_1d

    const/high16 v32, 0x20000000

    goto :goto_12

    :cond_1d
    const/high16 v32, 0x10000000

    :goto_12
    or-int v4, v4, v32

    :goto_13
    and-int/lit8 v32, v1, 0x6

    if-nez v32, :cond_20

    and-int/lit16 v0, v2, 0x400

    if-nez v0, :cond_1e

    move-object/from16 v0, p10

    invoke-interface {v13, v0}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v32

    if-eqz v32, :cond_1f

    const/16 v24, 0x4

    goto :goto_14

    :cond_1e
    move-object/from16 v0, p10

    :cond_1f
    const/16 v24, 0x2

    :goto_14
    or-int v24, v1, v24

    goto :goto_15

    :cond_20
    move-object/from16 v0, p10

    move/from16 v24, v1

    :goto_15
    and-int/lit8 v32, v1, 0x30

    if-nez v32, :cond_23

    and-int/lit16 v0, v2, 0x800

    if-nez v0, :cond_21

    move-object/from16 v0, p11

    invoke-interface {v13, v0}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v32

    if-eqz v32, :cond_22

    const/16 v26, 0x20

    goto :goto_16

    :cond_21
    move-object/from16 v0, p11

    :cond_22
    const/16 v26, 0x10

    :goto_16
    or-int v24, v24, v26

    :goto_17
    move/from16 v0, v24

    goto :goto_18

    :cond_23
    move-object/from16 v0, p11

    goto :goto_17

    :goto_18
    and-int/lit16 v5, v2, 0x1000

    if-eqz v5, :cond_24

    or-int/lit16 v0, v0, 0x180

    goto :goto_1b

    :cond_24
    move/from16 v24, v0

    and-int/lit16 v0, v1, 0x180

    if-nez v0, :cond_26

    move/from16 v0, p12

    invoke-interface {v13, v0}, Landroidx/compose/runtime/Composer;->changed(F)Z

    move-result v26

    if-eqz v26, :cond_25

    const/16 v28, 0x100

    goto :goto_19

    :cond_25
    const/16 v28, 0x80

    :goto_19
    or-int v24, v24, v28

    :goto_1a
    move/from16 v0, v24

    goto :goto_1b

    :cond_26
    move/from16 v0, p12

    goto :goto_1a

    :goto_1b
    move/from16 v24, v5

    and-int/lit16 v5, v2, 0x2000

    if-eqz v5, :cond_27

    or-int/lit16 v0, v0, 0xc00

    goto :goto_1c

    :cond_27
    move/from16 v26, v0

    and-int/lit16 v0, v1, 0xc00

    if-nez v0, :cond_29

    move/from16 v0, p13

    invoke-interface {v13, v0}, Landroidx/compose/runtime/Composer;->changed(F)Z

    move-result v27

    if-eqz v27, :cond_28

    move/from16 v16, v17

    :cond_28
    or-int v16, v26, v16

    move/from16 v0, v16

    goto :goto_1c

    :cond_29
    move/from16 v0, p13

    move/from16 v0, v26

    :goto_1c
    move/from16 v16, v5

    and-int/lit16 v5, v2, 0x4000

    if-eqz v5, :cond_2b

    or-int/lit16 v0, v0, 0x6000

    move/from16 v17, v0

    :cond_2a
    move-object/from16 v0, p14

    goto :goto_1d

    :cond_2b
    move/from16 v17, v0

    and-int/lit16 v0, v1, 0x6000

    if-nez v0, :cond_2a

    move-object/from16 v0, p14

    invoke-interface {v13, v0}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v26

    if-eqz v26, :cond_2c

    move/from16 v19, v20

    :cond_2c
    or-int v17, v17, v19

    :goto_1d
    const v19, 0x8000

    and-int v19, v2, v19

    if-eqz v19, :cond_2e

    or-int v17, v17, v23

    :cond_2d
    move/from16 v19, v5

    move-object/from16 v5, p15

    goto :goto_1e

    :cond_2e
    and-int v19, v1, v23

    if-nez v19, :cond_2d

    move/from16 v19, v5

    move-object/from16 v5, p15

    invoke-interface {v13, v5}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v20

    if-eqz v20, :cond_2f

    move/from16 v21, v22

    :cond_2f
    or-int v17, v17, v21

    :goto_1e
    const v20, 0x12492493

    and-int v0, v4, v20

    const v1, 0x12492492

    if-ne v0, v1, :cond_31

    const v0, 0x12493

    and-int v0, v17, v0

    const v1, 0x12492

    if-ne v0, v1, :cond_31

    invoke-interface {v13}, Landroidx/compose/runtime/Composer;->getSkipping()Z

    move-result v0

    if-nez v0, :cond_30

    goto :goto_1f

    .line 2
    :cond_30
    invoke-interface {v13}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    move-object/from16 v11, p10

    move-object/from16 v12, p11

    move/from16 v14, p13

    move-object/from16 v15, p14

    move-object v9, v3

    move v7, v8

    move-object v8, v10

    move-object v0, v13

    move-object/from16 v10, p9

    move/from16 v13, p12

    goto/16 :goto_2b

    .line 3
    :cond_31
    :goto_1f
    invoke-interface {v13}, Landroidx/compose/runtime/Composer;->startDefaults()V

    and-int/lit8 v0, p17, 0x1

    const/4 v1, 0x6

    const/4 v5, 0x1

    if-eqz v0, :cond_35

    invoke-interface {v13}, Landroidx/compose/runtime/Composer;->getDefaultsInvalid()Z

    move-result v0

    if-eqz v0, :cond_32

    goto :goto_20

    .line 4
    :cond_32
    invoke-interface {v13}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    and-int/lit16 v0, v2, 0x400

    if-eqz v0, :cond_33

    and-int/lit8 v17, v17, -0xf

    :cond_33
    and-int/lit16 v0, v2, 0x800

    if-eqz v0, :cond_34

    and-int/lit8 v17, v17, -0x71

    :cond_34
    move-object/from16 v24, p9

    move-object/from16 v15, p11

    move/from16 v11, p13

    move-object/from16 v25, p14

    move/from16 p16, v1

    move-object/from16 v23, v3

    move v1, v5

    move-object v7, v6

    move/from16 v21, v8

    move-object/from16 v22, v10

    move-object v9, v13

    move/from16 v5, v17

    move-object/from16 v8, p10

    move/from16 v10, p12

    move v13, v4

    goto/16 :goto_2a

    :cond_35
    :goto_20
    if-eqz v18, :cond_36

    .line 5
    sget-object v0, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    goto :goto_21

    :cond_36
    move-object v0, v6

    :goto_21
    if-eqz v25, :cond_37

    move/from16 v18, v5

    goto :goto_22

    :cond_37
    move/from16 v18, v8

    :goto_22
    const/16 v20, 0x0

    if-eqz v9, :cond_38

    move-object/from16 v21, v20

    goto :goto_23

    :cond_38
    move-object/from16 v21, v10

    :goto_23
    if-eqz v11, :cond_39

    move-object/from16 v3, v20

    :cond_39
    if-eqz v31, :cond_3a

    move-object/from16 v22, v20

    goto :goto_24

    :cond_3a
    move-object/from16 v22, p9

    :goto_24
    and-int/lit16 v6, v2, 0x400

    if-eqz v6, :cond_3b

    .line 6
    sget-object v6, Landroidx/compose/material3/SearchBarDefaults;->INSTANCE:Landroidx/compose/material3/SearchBarDefaults;

    invoke-virtual {v6, v13, v1}, Landroidx/compose/material3/SearchBarDefaults;->getDockedShape(Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/graphics/Shape;

    move-result-object v6

    and-int/lit8 v17, v17, -0xf

    move/from16 v23, v17

    move-object/from16 v17, v6

    goto :goto_25

    :cond_3b
    move/from16 v23, v17

    move-object/from16 v17, p10

    :goto_25
    and-int/lit16 v6, v2, 0x800

    if-eqz v6, :cond_3c

    move v6, v4

    .line 7
    sget-object v4, Landroidx/compose/material3/SearchBarDefaults;->INSTANCE:Landroidx/compose/material3/SearchBarDefaults;

    const/16 v10, 0x180

    const/4 v11, 0x3

    move v9, v5

    move v8, v6

    const-wide/16 v5, 0x0

    move/from16 v25, v8

    const-wide/16 v7, 0x0

    move/from16 p16, v1

    move v1, v9

    move-object v9, v13

    move/from16 v13, v25

    invoke-virtual/range {v4 .. v11}, Landroidx/compose/material3/SearchBarDefaults;->colors-dgg9oW8(JJLandroidx/compose/runtime/Composer;II)Landroidx/compose/material3/SearchBarColors;

    move-result-object v4

    and-int/lit8 v5, v23, -0x71

    goto :goto_26

    :cond_3c
    move/from16 p16, v1

    move v1, v5

    move-object v9, v13

    move v13, v4

    move-object/from16 v4, p11

    move/from16 v5, v23

    :goto_26
    if-eqz v24, :cond_3d

    .line 8
    sget-object v6, Landroidx/compose/material3/SearchBarDefaults;->INSTANCE:Landroidx/compose/material3/SearchBarDefaults;

    invoke-virtual {v6}, Landroidx/compose/material3/SearchBarDefaults;->getTonalElevation-D9Ej5fM()F

    move-result v6

    goto :goto_27

    :cond_3d
    move/from16 v6, p12

    :goto_27
    if-eqz v16, :cond_3e

    .line 9
    sget-object v7, Landroidx/compose/material3/SearchBarDefaults;->INSTANCE:Landroidx/compose/material3/SearchBarDefaults;

    invoke-virtual {v7}, Landroidx/compose/material3/SearchBarDefaults;->getShadowElevation-D9Ej5fM()F

    move-result v7

    goto :goto_28

    :cond_3e
    move/from16 v7, p13

    :goto_28
    if-eqz v19, :cond_3f

    move-object/from16 v23, v3

    move-object v15, v4

    move v10, v6

    move v11, v7

    move-object/from16 v8, v17

    move-object/from16 v25, v20

    :goto_29
    move-object/from16 v24, v22

    move-object v7, v0

    move-object/from16 v22, v21

    move/from16 v21, v18

    goto :goto_2a

    :cond_3f
    move-object/from16 v25, p14

    move-object/from16 v23, v3

    move-object v15, v4

    move v10, v6

    move v11, v7

    move-object/from16 v8, v17

    goto :goto_29

    .line 10
    :goto_2a
    invoke-interface {v9}, Landroidx/compose/runtime/Composer;->endDefaults()V

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v0

    if-eqz v0, :cond_40

    const-string/jumbo v0, "androidx.compose.material3.DockedSearchBar (SearchBar.android.kt:825)"

    const v3, 0x4d6dffc5    # 2.4956014E8f

    .line 11
    invoke-static {v3, v13, v5, v0}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 12
    :cond_40
    new-instance v14, Landroidx/compose/material3/SearchBar_androidKt$DockedSearchBar$4;

    move-object/from16 v17, p1

    move-object/from16 v18, p2

    move/from16 v19, p3

    move-object/from16 v20, p4

    move-object/from16 v16, v12

    invoke-direct/range {v14 .. v25}, Landroidx/compose/material3/SearchBar_androidKt$DockedSearchBar$4;-><init>(Landroidx/compose/material3/SearchBarColors;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;ZLkotlin/jvm/functions/Function1;ZLkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/foundation/interaction/MutableInteractionSource;)V

    const/16 v0, 0x36

    const v3, -0x121139a9

    invoke-static {v3, v1, v14, v9, v0}, Landroidx/compose/runtime/internal/ComposableLambdaKt;->rememberComposableLambda(IZLjava/lang/Object;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/internal/ComposableLambda;

    move-result-object v4

    shr-int/lit8 v0, v13, 0x6

    and-int/lit8 v1, v0, 0x70

    or-int/lit8 v1, v1, 0x6

    and-int/lit16 v3, v0, 0x380

    or-int/2addr v1, v3

    and-int/lit16 v0, v0, 0x1c00

    or-int/2addr v0, v1

    shl-int/lit8 v1, v5, 0xc

    const v3, 0xe000

    and-int/2addr v3, v1

    or-int/2addr v0, v3

    const/high16 v3, 0x70000

    and-int/2addr v3, v1

    or-int/2addr v0, v3

    const/high16 v3, 0x380000

    and-int/2addr v3, v1

    or-int/2addr v0, v3

    const/high16 v3, 0x1c00000

    and-int/2addr v1, v3

    or-int/2addr v0, v1

    shl-int/lit8 v1, v5, 0x9

    const/high16 v3, 0xe000000

    and-int/2addr v1, v3

    or-int v14, v0, v1

    move-object v13, v9

    move-object v9, v15

    const/4 v15, 0x0

    move/from16 v5, p3

    move-object/from16 v6, p4

    move-object/from16 v12, p15

    .line 13
    invoke-static/range {v4 .. v15}, Landroidx/compose/material3/SearchBar_androidKt;->DockedSearchBar-EQC0FA8(Lkotlin/jvm/functions/Function2;ZLkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material3/SearchBarColors;FFLkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V

    move-object v15, v9

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v0

    if-eqz v0, :cond_41

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    :cond_41
    move-object v6, v7

    move v14, v11

    move-object v0, v13

    move-object v12, v15

    move/from16 v7, v21

    move-object/from16 v9, v23

    move-object/from16 v15, v25

    move-object v11, v8

    move v13, v10

    move-object/from16 v8, v22

    move-object/from16 v10, v24

    .line 14
    :goto_2b
    invoke-interface {v0}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    move-result-object v0

    if-eqz v0, :cond_42

    move-object v1, v0

    new-instance v0, Landroidx/compose/material3/SearchBar_androidKt$DockedSearchBar$5;

    move-object/from16 v3, p2

    move/from16 v4, p3

    move-object/from16 v5, p4

    move-object/from16 v16, p15

    move/from16 v17, p17

    move/from16 v18, p18

    move-object/from16 v33, v1

    move/from16 v19, v2

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    invoke-direct/range {v0 .. v19}, Landroidx/compose/material3/SearchBar_androidKt$DockedSearchBar$5;-><init>(Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;ZLkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZLkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material3/SearchBarColors;FFLandroidx/compose/foundation/interaction/MutableInteractionSource;Lkotlin/jvm/functions/Function3;III)V

    move-object/from16 v1, v33

    invoke-interface {v1, v0}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lkotlin/jvm/functions/Function2;)V

    :cond_42
    return-void
.end method

.method public static final SearchBar-WuY5d9Q(Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;ZLkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZLkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material3/SearchBarColors;FFLandroidx/compose/foundation/layout/WindowInsets;Landroidx/compose/foundation/interaction/MutableInteractionSource;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;III)V
    .locals 35
    .annotation build Landroidx/compose/material3/ExperimentalMaterial3Api;
    .end annotation

    .annotation build Landroidx/compose/runtime/Composable;
    .end annotation

    .annotation build Landroidx/compose/runtime/ComposableInferredTarget;
        scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Ljava/lang/String;",
            "Lkotlin/Unit;",
            ">;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Ljava/lang/String;",
            "Lkotlin/Unit;",
            ">;Z",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Ljava/lang/Boolean;",
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
            ">;",
            "Lkotlin/jvm/functions/Function2<",
            "-",
            "Landroidx/compose/runtime/Composer;",
            "-",
            "Ljava/lang/Integer;",
            "Lkotlin/Unit;",
            ">;",
            "Landroidx/compose/ui/graphics/Shape;",
            "Landroidx/compose/material3/SearchBarColors;",
            "FF",
            "Landroidx/compose/foundation/layout/WindowInsets;",
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
            "III)V"
        }
    .end annotation

    .annotation runtime Lkotlin/Deprecated;
        message = "Use overload which takes inputField as a parameter"
        replaceWith = .subannotation Lkotlin/ReplaceWith;
            expression = "SearchBar(\n    inputField = {\n        SearchBarDefaults.InputField(\n            query = query,\n            onQueryChange = onQueryChange,\n            onSearch = onSearch,\n            expanded = active,\n            onExpandedChange = onActiveChange,\n            enabled = enabled,\n            placeholder = placeholder,\n            leadingIcon = leadingIcon,\n            trailingIcon = trailingIcon,\n            colors = colors.inputFieldColors,\n            interactionSource = interactionSource,\n        )\n    },\n    expanded = active,\n    onExpandedChange = onActiveChange,\n    modifier = modifier,\n    shape = shape,\n    colors = colors,\n    tonalElevation = tonalElevation,\n    shadowElevation = shadowElevation,\n    windowInsets = windowInsets,\n    content = content,\n)"
            imports = {}
        .end subannotation
    .end annotation

    move/from16 v0, p18

    move/from16 v1, p19

    move/from16 v2, p20

    const v3, 0x3bb1de91

    move-object/from16 v4, p17

    .line 1
    invoke-interface {v4, v3}, Landroidx/compose/runtime/Composer;->startRestartGroup(I)Landroidx/compose/runtime/Composer;

    move-result-object v14

    and-int/lit8 v4, v2, 0x1

    if-eqz v4, :cond_0

    or-int/lit8 v4, v0, 0x6

    move-object/from16 v12, p0

    goto :goto_1

    :cond_0
    and-int/lit8 v4, v0, 0x6

    move-object/from16 v12, p0

    if-nez v4, :cond_2

    invoke-interface {v14, v12}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_1

    const/4 v4, 0x4

    goto :goto_0

    :cond_1
    const/4 v4, 0x2

    :goto_0
    or-int/2addr v4, v0

    goto :goto_1

    :cond_2
    move v4, v0

    :goto_1
    and-int/lit8 v7, v2, 0x2

    if-eqz v7, :cond_3

    or-int/lit8 v4, v4, 0x30

    move-object/from16 v13, p1

    goto :goto_3

    :cond_3
    and-int/lit8 v7, v0, 0x30

    move-object/from16 v13, p1

    if-nez v7, :cond_5

    invoke-interface {v14, v13}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_4

    const/16 v7, 0x20

    goto :goto_2

    :cond_4
    const/16 v7, 0x10

    :goto_2
    or-int/2addr v4, v7

    :cond_5
    :goto_3
    and-int/lit8 v7, v2, 0x4

    if-eqz v7, :cond_6

    or-int/lit16 v4, v4, 0x180

    move-object/from16 v15, p2

    goto :goto_5

    :cond_6
    and-int/lit16 v7, v0, 0x180

    move-object/from16 v15, p2

    if-nez v7, :cond_8

    invoke-interface {v14, v15}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_7

    const/16 v7, 0x100

    goto :goto_4

    :cond_7
    const/16 v7, 0x80

    :goto_4
    or-int/2addr v4, v7

    :cond_8
    :goto_5
    and-int/lit8 v7, v2, 0x8

    const/16 v16, 0x400

    const/16 v17, 0x800

    if-eqz v7, :cond_a

    or-int/lit16 v4, v4, 0xc00

    :cond_9
    move/from16 v7, p3

    goto :goto_7

    :cond_a
    and-int/lit16 v7, v0, 0xc00

    if-nez v7, :cond_9

    move/from16 v7, p3

    invoke-interface {v14, v7}, Landroidx/compose/runtime/Composer;->changed(Z)Z

    move-result v18

    if-eqz v18, :cond_b

    move/from16 v18, v17

    goto :goto_6

    :cond_b
    move/from16 v18, v16

    :goto_6
    or-int v4, v4, v18

    :goto_7
    and-int/lit8 v18, v2, 0x10

    const/16 v19, 0x2000

    const/16 v20, 0x4000

    if-eqz v18, :cond_d

    or-int/lit16 v4, v4, 0x6000

    :cond_c
    move-object/from16 v5, p4

    goto :goto_9

    :cond_d
    and-int/lit16 v5, v0, 0x6000

    if-nez v5, :cond_c

    move-object/from16 v5, p4

    invoke-interface {v14, v5}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v18

    if-eqz v18, :cond_e

    move/from16 v18, v20

    goto :goto_8

    :cond_e
    move/from16 v18, v19

    :goto_8
    or-int v4, v4, v18

    :goto_9
    and-int/lit8 v18, v2, 0x20

    const/high16 v21, 0x20000

    const/high16 v22, 0x10000

    const/high16 v23, 0x30000

    if-eqz v18, :cond_f

    or-int v4, v4, v23

    move-object/from16 v6, p5

    goto :goto_b

    :cond_f
    and-int v24, v0, v23

    move-object/from16 v6, p5

    if-nez v24, :cond_11

    invoke-interface {v14, v6}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v25

    if-eqz v25, :cond_10

    move/from16 v25, v21

    goto :goto_a

    :cond_10
    move/from16 v25, v22

    :goto_a
    or-int v4, v4, v25

    :cond_11
    :goto_b
    and-int/lit8 v25, v2, 0x40

    const/high16 v26, 0x180000

    if-eqz v25, :cond_12

    or-int v4, v4, v26

    move/from16 v8, p6

    goto :goto_d

    :cond_12
    and-int v27, v0, v26

    move/from16 v8, p6

    if-nez v27, :cond_14

    invoke-interface {v14, v8}, Landroidx/compose/runtime/Composer;->changed(Z)Z

    move-result v28

    if-eqz v28, :cond_13

    const/high16 v28, 0x100000

    goto :goto_c

    :cond_13
    const/high16 v28, 0x80000

    :goto_c
    or-int v4, v4, v28

    :cond_14
    :goto_d
    and-int/lit16 v9, v2, 0x80

    const/high16 v29, 0xc00000

    if-eqz v9, :cond_15

    or-int v4, v4, v29

    move-object/from16 v10, p7

    goto :goto_f

    :cond_15
    and-int v29, v0, v29

    move-object/from16 v10, p7

    if-nez v29, :cond_17

    invoke-interface {v14, v10}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v30

    if-eqz v30, :cond_16

    const/high16 v30, 0x800000

    goto :goto_e

    :cond_16
    const/high16 v30, 0x400000

    :goto_e
    or-int v4, v4, v30

    :cond_17
    :goto_f
    and-int/lit16 v11, v2, 0x100

    const/high16 v31, 0x6000000

    if-eqz v11, :cond_18

    or-int v4, v4, v31

    move-object/from16 v3, p8

    goto :goto_11

    :cond_18
    and-int v31, v0, v31

    move-object/from16 v3, p8

    if-nez v31, :cond_1a

    invoke-interface {v14, v3}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v32

    if-eqz v32, :cond_19

    const/high16 v32, 0x4000000

    goto :goto_10

    :cond_19
    const/high16 v32, 0x2000000

    :goto_10
    or-int v4, v4, v32

    :cond_1a
    :goto_11
    and-int/lit16 v0, v2, 0x200

    const/high16 v32, 0x30000000

    if-eqz v0, :cond_1c

    or-int v4, v4, v32

    :cond_1b
    move/from16 v32, v0

    move-object/from16 v0, p9

    goto :goto_13

    :cond_1c
    and-int v32, p18, v32

    if-nez v32, :cond_1b

    move/from16 v32, v0

    move-object/from16 v0, p9

    invoke-interface {v14, v0}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v33

    if-eqz v33, :cond_1d

    const/high16 v33, 0x20000000

    goto :goto_12

    :cond_1d
    const/high16 v33, 0x10000000

    :goto_12
    or-int v4, v4, v33

    :goto_13
    and-int/lit8 v33, v1, 0x6

    if-nez v33, :cond_20

    and-int/lit16 v0, v2, 0x400

    if-nez v0, :cond_1e

    move-object/from16 v0, p10

    invoke-interface {v14, v0}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v33

    if-eqz v33, :cond_1f

    const/16 v24, 0x4

    goto :goto_14

    :cond_1e
    move-object/from16 v0, p10

    :cond_1f
    const/16 v24, 0x2

    :goto_14
    or-int v24, v1, v24

    goto :goto_15

    :cond_20
    move-object/from16 v0, p10

    move/from16 v24, v1

    :goto_15
    and-int/lit8 v33, v1, 0x30

    if-nez v33, :cond_23

    and-int/lit16 v0, v2, 0x800

    if-nez v0, :cond_21

    move-object/from16 v0, p11

    invoke-interface {v14, v0}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v33

    if-eqz v33, :cond_22

    const/16 v27, 0x20

    goto :goto_16

    :cond_21
    move-object/from16 v0, p11

    :cond_22
    const/16 v27, 0x10

    :goto_16
    or-int v24, v24, v27

    :goto_17
    move/from16 v0, v24

    goto :goto_18

    :cond_23
    move-object/from16 v0, p11

    goto :goto_17

    :goto_18
    and-int/lit16 v5, v2, 0x1000

    if-eqz v5, :cond_24

    or-int/lit16 v0, v0, 0x180

    goto :goto_1b

    :cond_24
    move/from16 v24, v0

    and-int/lit16 v0, v1, 0x180

    if-nez v0, :cond_26

    move/from16 v0, p12

    invoke-interface {v14, v0}, Landroidx/compose/runtime/Composer;->changed(F)Z

    move-result v27

    if-eqz v27, :cond_25

    const/16 v29, 0x100

    goto :goto_19

    :cond_25
    const/16 v29, 0x80

    :goto_19
    or-int v24, v24, v29

    :goto_1a
    move/from16 v0, v24

    goto :goto_1b

    :cond_26
    move/from16 v0, p12

    goto :goto_1a

    :goto_1b
    move/from16 v24, v5

    and-int/lit16 v5, v2, 0x2000

    if-eqz v5, :cond_28

    or-int/lit16 v0, v0, 0xc00

    move/from16 v27, v0

    :cond_27
    move/from16 v0, p13

    goto :goto_1c

    :cond_28
    move/from16 v27, v0

    and-int/lit16 v0, v1, 0xc00

    if-nez v0, :cond_27

    move/from16 v0, p13

    invoke-interface {v14, v0}, Landroidx/compose/runtime/Composer;->changed(F)Z

    move-result v28

    if-eqz v28, :cond_29

    move/from16 v16, v17

    :cond_29
    or-int v16, v27, v16

    move/from16 v27, v16

    :goto_1c
    and-int/lit16 v0, v1, 0x6000

    if-nez v0, :cond_2c

    and-int/lit16 v0, v2, 0x4000

    if-nez v0, :cond_2a

    move-object/from16 v0, p14

    invoke-interface {v14, v0}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v16

    if-eqz v16, :cond_2b

    move/from16 v19, v20

    goto :goto_1d

    :cond_2a
    move-object/from16 v0, p14

    :cond_2b
    :goto_1d
    or-int v27, v27, v19

    goto :goto_1e

    :cond_2c
    move-object/from16 v0, p14

    :goto_1e
    const v16, 0x8000

    and-int v16, v2, v16

    if-eqz v16, :cond_2e

    or-int v27, v27, v23

    :cond_2d
    move/from16 v17, v5

    move-object/from16 v5, p15

    goto :goto_20

    :cond_2e
    and-int v17, v1, v23

    if-nez v17, :cond_2d

    move/from16 v17, v5

    move-object/from16 v5, p15

    invoke-interface {v14, v5}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v19

    if-eqz v19, :cond_2f

    goto :goto_1f

    :cond_2f
    move/from16 v21, v22

    :goto_1f
    or-int v27, v27, v21

    :goto_20
    and-int v19, v2, v22

    if-eqz v19, :cond_30

    or-int v27, v27, v26

    move-object/from16 v5, p16

    goto :goto_22

    :cond_30
    and-int v19, v1, v26

    move-object/from16 v5, p16

    if-nez v19, :cond_32

    invoke-interface {v14, v5}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v19

    if-eqz v19, :cond_31

    const/high16 v19, 0x100000

    goto :goto_21

    :cond_31
    const/high16 v19, 0x80000

    :goto_21
    or-int v27, v27, v19

    :cond_32
    :goto_22
    const v19, 0x12492493

    and-int v0, v4, v19

    const v1, 0x12492492

    if-ne v0, v1, :cond_34

    const v0, 0x92493

    and-int v0, v27, v0

    const v1, 0x92492

    if-ne v0, v1, :cond_34

    invoke-interface {v14}, Landroidx/compose/runtime/Composer;->getSkipping()Z

    move-result v0

    if-nez v0, :cond_33

    goto :goto_23

    .line 2
    :cond_33
    invoke-interface {v14}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    move-object/from16 v11, p10

    move-object/from16 v12, p11

    move/from16 v13, p12

    move-object/from16 v15, p14

    move-object/from16 v16, p15

    move-object v9, v3

    move v7, v8

    move-object v8, v10

    move-object v0, v14

    move-object/from16 v10, p9

    move/from16 v14, p13

    goto/16 :goto_30

    .line 3
    :cond_34
    :goto_23
    invoke-interface {v14}, Landroidx/compose/runtime/Composer;->startDefaults()V

    and-int/lit8 v0, p18, 0x1

    const/4 v1, 0x6

    const/4 v5, 0x1

    if-eqz v0, :cond_39

    invoke-interface {v14}, Landroidx/compose/runtime/Composer;->getDefaultsInvalid()Z

    move-result v0

    if-eqz v0, :cond_35

    goto :goto_24

    .line 4
    :cond_35
    invoke-interface {v14}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    and-int/lit16 v0, v2, 0x400

    if-eqz v0, :cond_36

    and-int/lit8 v27, v27, -0xf

    :cond_36
    and-int/lit16 v0, v2, 0x800

    if-eqz v0, :cond_37

    and-int/lit8 v27, v27, -0x71

    :cond_37
    and-int/lit16 v0, v2, 0x4000

    if-eqz v0, :cond_38

    const v0, -0xe001

    and-int v27, v27, v0

    :cond_38
    move-object/from16 v25, p9

    move-object/from16 v16, p11

    move/from16 v11, p13

    move-object/from16 v12, p14

    move-object/from16 v26, p15

    move-object/from16 v24, v3

    move-object v7, v6

    move/from16 v22, v8

    move-object/from16 v23, v10

    move-object v9, v14

    move/from16 v0, v27

    move-object/from16 v8, p10

    move/from16 v10, p12

    move v14, v4

    goto/16 :goto_2f

    :cond_39
    :goto_24
    if-eqz v18, :cond_3a

    .line 5
    sget-object v0, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    goto :goto_25

    :cond_3a
    move-object v0, v6

    :goto_25
    if-eqz v25, :cond_3b

    move/from16 v18, v5

    goto :goto_26

    :cond_3b
    move/from16 v18, v8

    :goto_26
    const/16 v19, 0x0

    if-eqz v9, :cond_3c

    move-object/from16 v20, v19

    goto :goto_27

    :cond_3c
    move-object/from16 v20, v10

    :goto_27
    if-eqz v11, :cond_3d

    move-object/from16 v3, v19

    :cond_3d
    if-eqz v32, :cond_3e

    move-object/from16 v21, v19

    goto :goto_28

    :cond_3e
    move-object/from16 v21, p9

    :goto_28
    and-int/lit16 v6, v2, 0x400

    if-eqz v6, :cond_3f

    .line 6
    sget-object v6, Landroidx/compose/material3/SearchBarDefaults;->INSTANCE:Landroidx/compose/material3/SearchBarDefaults;

    invoke-virtual {v6, v14, v1}, Landroidx/compose/material3/SearchBarDefaults;->getInputFieldShape(Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/graphics/Shape;

    move-result-object v6

    and-int/lit8 v27, v27, -0xf

    move-object/from16 v22, v6

    goto :goto_29

    :cond_3f
    move-object/from16 v22, p10

    :goto_29
    and-int/lit16 v6, v2, 0x800

    if-eqz v6, :cond_40

    move v6, v4

    .line 7
    sget-object v4, Landroidx/compose/material3/SearchBarDefaults;->INSTANCE:Landroidx/compose/material3/SearchBarDefaults;

    const/16 v10, 0x180

    const/4 v11, 0x3

    move v9, v5

    move v8, v6

    const-wide/16 v5, 0x0

    move/from16 v23, v8

    const-wide/16 v7, 0x0

    move-object v9, v14

    move/from16 v14, v23

    invoke-virtual/range {v4 .. v11}, Landroidx/compose/material3/SearchBarDefaults;->colors-dgg9oW8(JJLandroidx/compose/runtime/Composer;II)Landroidx/compose/material3/SearchBarColors;

    move-result-object v4

    and-int/lit8 v27, v27, -0x71

    goto :goto_2a

    :cond_40
    move-object v9, v14

    move v14, v4

    move-object/from16 v4, p11

    :goto_2a
    if-eqz v24, :cond_41

    .line 8
    sget-object v5, Landroidx/compose/material3/SearchBarDefaults;->INSTANCE:Landroidx/compose/material3/SearchBarDefaults;

    invoke-virtual {v5}, Landroidx/compose/material3/SearchBarDefaults;->getTonalElevation-D9Ej5fM()F

    move-result v5

    goto :goto_2b

    :cond_41
    move/from16 v5, p12

    :goto_2b
    if-eqz v17, :cond_42

    .line 9
    sget-object v6, Landroidx/compose/material3/SearchBarDefaults;->INSTANCE:Landroidx/compose/material3/SearchBarDefaults;

    invoke-virtual {v6}, Landroidx/compose/material3/SearchBarDefaults;->getShadowElevation-D9Ej5fM()F

    move-result v6

    goto :goto_2c

    :cond_42
    move/from16 v6, p13

    :goto_2c
    and-int/lit16 v7, v2, 0x4000

    if-eqz v7, :cond_43

    .line 10
    sget-object v7, Landroidx/compose/material3/SearchBarDefaults;->INSTANCE:Landroidx/compose/material3/SearchBarDefaults;

    invoke-virtual {v7, v9, v1}, Landroidx/compose/material3/SearchBarDefaults;->getWindowInsets(Landroidx/compose/runtime/Composer;I)Landroidx/compose/foundation/layout/WindowInsets;

    move-result-object v7

    const v8, -0xe001

    and-int v8, v27, v8

    move/from16 v27, v8

    goto :goto_2d

    :cond_43
    move-object/from16 v7, p14

    :goto_2d
    if-eqz v16, :cond_44

    move-object/from16 v24, v3

    move-object/from16 v16, v4

    move v10, v5

    move v11, v6

    move-object v12, v7

    move-object/from16 v26, v19

    :goto_2e
    move-object/from16 v23, v20

    move-object/from16 v25, v21

    move-object/from16 v8, v22

    move-object v7, v0

    move/from16 v22, v18

    move/from16 v0, v27

    goto :goto_2f

    :cond_44
    move-object/from16 v26, p15

    move-object/from16 v24, v3

    move-object/from16 v16, v4

    move v10, v5

    move v11, v6

    move-object v12, v7

    goto :goto_2e

    .line 11
    :goto_2f
    invoke-interface {v9}, Landroidx/compose/runtime/Composer;->endDefaults()V

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v3

    if-eqz v3, :cond_45

    const-string/jumbo v3, "androidx.compose.material3.SearchBar (SearchBar.android.kt:745)"

    const v4, 0x3bb1de91

    .line 12
    invoke-static {v4, v14, v0, v3}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 13
    :cond_45
    new-instance v15, Landroidx/compose/material3/SearchBar_androidKt$SearchBar$4;

    move-object/from16 v17, p0

    move-object/from16 v19, p2

    move/from16 v20, p3

    move-object/from16 v21, p4

    move-object/from16 v18, v13

    invoke-direct/range {v15 .. v26}, Landroidx/compose/material3/SearchBar_androidKt$SearchBar$4;-><init>(Landroidx/compose/material3/SearchBarColors;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;ZLkotlin/jvm/functions/Function1;ZLkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/foundation/interaction/MutableInteractionSource;)V

    const/16 v3, 0x36

    const v4, -0x4507604f

    const/4 v5, 0x1

    invoke-static {v4, v5, v15, v9, v3}, Landroidx/compose/runtime/internal/ComposableLambdaKt;->rememberComposableLambda(IZLjava/lang/Object;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/internal/ComposableLambda;

    move-result-object v4

    shr-int/lit8 v3, v14, 0x6

    and-int/lit8 v5, v3, 0x70

    or-int/2addr v1, v5

    and-int/lit16 v5, v3, 0x380

    or-int/2addr v1, v5

    and-int/lit16 v3, v3, 0x1c00

    or-int/2addr v1, v3

    shl-int/lit8 v3, v0, 0xc

    const v5, 0xe000

    and-int/2addr v5, v3

    or-int/2addr v1, v5

    const/high16 v5, 0x70000

    and-int/2addr v5, v3

    or-int/2addr v1, v5

    const/high16 v5, 0x380000

    and-int/2addr v5, v3

    or-int/2addr v1, v5

    const/high16 v5, 0x1c00000

    and-int/2addr v5, v3

    or-int/2addr v1, v5

    const/high16 v5, 0xe000000

    and-int/2addr v3, v5

    or-int/2addr v1, v3

    shl-int/lit8 v0, v0, 0x9

    const/high16 v3, 0x70000000

    and-int/2addr v0, v3

    or-int v15, v1, v0

    move-object v14, v9

    move-object/from16 v9, v16

    const/16 v16, 0x0

    move/from16 v5, p3

    move-object/from16 v6, p4

    move-object/from16 v13, p16

    .line 14
    invoke-static/range {v4 .. v16}, Landroidx/compose/material3/SearchBar_androidKt;->SearchBar-Y92LkZI(Lkotlin/jvm/functions/Function2;ZLkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material3/SearchBarColors;FFLandroidx/compose/foundation/layout/WindowInsets;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V

    move-object/from16 v16, v9

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v0

    if-eqz v0, :cond_46

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    :cond_46
    move-object v6, v7

    move v13, v10

    move-object v15, v12

    move-object v0, v14

    move-object/from16 v12, v16

    move/from16 v7, v22

    move-object/from16 v9, v24

    move-object/from16 v10, v25

    move-object/from16 v16, v26

    move v14, v11

    move-object v11, v8

    move-object/from16 v8, v23

    .line 15
    :goto_30
    invoke-interface {v0}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    move-result-object v0

    if-eqz v0, :cond_47

    move-object v1, v0

    new-instance v0, Landroidx/compose/material3/SearchBar_androidKt$SearchBar$5;

    move-object/from16 v3, p2

    move/from16 v4, p3

    move-object/from16 v5, p4

    move-object/from16 v17, p16

    move/from16 v18, p18

    move/from16 v19, p19

    move-object/from16 v34, v1

    move/from16 v20, v2

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    invoke-direct/range {v0 .. v20}, Landroidx/compose/material3/SearchBar_androidKt$SearchBar$5;-><init>(Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;ZLkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZLkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material3/SearchBarColors;FFLandroidx/compose/foundation/layout/WindowInsets;Landroidx/compose/foundation/interaction/MutableInteractionSource;Lkotlin/jvm/functions/Function3;III)V

    move-object/from16 v1, v34

    invoke-interface {v1, v0}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lkotlin/jvm/functions/Function2;)V

    :cond_47
    return-void
.end method

.method public static final SearchBar-Y92LkZI(Lkotlin/jvm/functions/Function2;ZLkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material3/SearchBarColors;FFLandroidx/compose/foundation/layout/WindowInsets;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V
    .locals 29
    .annotation build Landroidx/compose/material3/ExperimentalMaterial3Api;
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
            ">;Z",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Ljava/lang/Boolean;",
            "Lkotlin/Unit;",
            ">;",
            "Landroidx/compose/ui/Modifier;",
            "Landroidx/compose/ui/graphics/Shape;",
            "Landroidx/compose/material3/SearchBarColors;",
            "FF",
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
    move/from16 v2, p1

    .line 2
    .line 3
    move/from16 v11, p11

    .line 4
    .line 5
    move/from16 v12, p12

    .line 6
    .line 7
    const v0, 0x561b9ac9

    .line 8
    .line 9
    .line 10
    move-object/from16 v1, p10

    .line 11
    .line 12
    invoke-interface {v1, v0}, Landroidx/compose/runtime/Composer;->startRestartGroup(I)Landroidx/compose/runtime/Composer;

    .line 13
    .line 14
    .line 15
    move-result-object v8

    .line 16
    and-int/lit8 v1, v12, 0x1

    .line 17
    .line 18
    if-eqz v1, :cond_0

    .line 19
    .line 20
    or-int/lit8 v1, v11, 0x6

    .line 21
    .line 22
    move-object/from16 v14, p0

    .line 23
    .line 24
    goto :goto_1

    .line 25
    :cond_0
    and-int/lit8 v1, v11, 0x6

    .line 26
    .line 27
    move-object/from16 v14, p0

    .line 28
    .line 29
    if-nez v1, :cond_2

    .line 30
    .line 31
    invoke-interface {v8, v14}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 32
    .line 33
    .line 34
    move-result v1

    .line 35
    if-eqz v1, :cond_1

    .line 36
    .line 37
    const/4 v1, 0x4

    .line 38
    goto :goto_0

    .line 39
    :cond_1
    const/4 v1, 0x2

    .line 40
    :goto_0
    or-int/2addr v1, v11

    .line 41
    goto :goto_1

    .line 42
    :cond_2
    move v1, v11

    .line 43
    :goto_1
    and-int/lit8 v3, v12, 0x2

    .line 44
    .line 45
    if-eqz v3, :cond_3

    .line 46
    .line 47
    or-int/lit8 v1, v1, 0x30

    .line 48
    .line 49
    goto :goto_3

    .line 50
    :cond_3
    and-int/lit8 v3, v11, 0x30

    .line 51
    .line 52
    if-nez v3, :cond_5

    .line 53
    .line 54
    invoke-interface {v8, v2}, Landroidx/compose/runtime/Composer;->changed(Z)Z

    .line 55
    .line 56
    .line 57
    move-result v3

    .line 58
    if-eqz v3, :cond_4

    .line 59
    .line 60
    const/16 v3, 0x20

    .line 61
    .line 62
    goto :goto_2

    .line 63
    :cond_4
    const/16 v3, 0x10

    .line 64
    .line 65
    :goto_2
    or-int/2addr v1, v3

    .line 66
    :cond_5
    :goto_3
    and-int/lit8 v3, v12, 0x4

    .line 67
    .line 68
    if-eqz v3, :cond_7

    .line 69
    .line 70
    or-int/lit16 v1, v1, 0x180

    .line 71
    .line 72
    :cond_6
    move-object/from16 v3, p2

    .line 73
    .line 74
    goto :goto_5

    .line 75
    :cond_7
    and-int/lit16 v3, v11, 0x180

    .line 76
    .line 77
    if-nez v3, :cond_6

    .line 78
    .line 79
    move-object/from16 v3, p2

    .line 80
    .line 81
    invoke-interface {v8, v3}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

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
    or-int/2addr v1, v5

    .line 93
    :goto_5
    and-int/lit8 v5, v12, 0x8

    .line 94
    .line 95
    if-eqz v5, :cond_a

    .line 96
    .line 97
    or-int/lit16 v1, v1, 0xc00

    .line 98
    .line 99
    :cond_9
    move-object/from16 v6, p3

    .line 100
    .line 101
    goto :goto_7

    .line 102
    :cond_a
    and-int/lit16 v6, v11, 0xc00

    .line 103
    .line 104
    if-nez v6, :cond_9

    .line 105
    .line 106
    move-object/from16 v6, p3

    .line 107
    .line 108
    invoke-interface {v8, v6}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 109
    .line 110
    .line 111
    move-result v7

    .line 112
    if-eqz v7, :cond_b

    .line 113
    .line 114
    const/16 v7, 0x800

    .line 115
    .line 116
    goto :goto_6

    .line 117
    :cond_b
    const/16 v7, 0x400

    .line 118
    .line 119
    :goto_6
    or-int/2addr v1, v7

    .line 120
    :goto_7
    and-int/lit16 v7, v11, 0x6000

    .line 121
    .line 122
    if-nez v7, :cond_e

    .line 123
    .line 124
    and-int/lit8 v7, v12, 0x10

    .line 125
    .line 126
    if-nez v7, :cond_c

    .line 127
    .line 128
    move-object/from16 v7, p4

    .line 129
    .line 130
    invoke-interface {v8, v7}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 131
    .line 132
    .line 133
    move-result v9

    .line 134
    if-eqz v9, :cond_d

    .line 135
    .line 136
    const/16 v9, 0x4000

    .line 137
    .line 138
    goto :goto_8

    .line 139
    :cond_c
    move-object/from16 v7, p4

    .line 140
    .line 141
    :cond_d
    const/16 v9, 0x2000

    .line 142
    .line 143
    :goto_8
    or-int/2addr v1, v9

    .line 144
    goto :goto_9

    .line 145
    :cond_e
    move-object/from16 v7, p4

    .line 146
    .line 147
    :goto_9
    const/high16 v9, 0x30000

    .line 148
    .line 149
    and-int/2addr v9, v11

    .line 150
    if-nez v9, :cond_11

    .line 151
    .line 152
    and-int/lit8 v9, v12, 0x20

    .line 153
    .line 154
    if-nez v9, :cond_f

    .line 155
    .line 156
    move-object/from16 v9, p5

    .line 157
    .line 158
    invoke-interface {v8, v9}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 159
    .line 160
    .line 161
    move-result v10

    .line 162
    if-eqz v10, :cond_10

    .line 163
    .line 164
    const/high16 v10, 0x20000

    .line 165
    .line 166
    goto :goto_a

    .line 167
    :cond_f
    move-object/from16 v9, p5

    .line 168
    .line 169
    :cond_10
    const/high16 v10, 0x10000

    .line 170
    .line 171
    :goto_a
    or-int/2addr v1, v10

    .line 172
    goto :goto_b

    .line 173
    :cond_11
    move-object/from16 v9, p5

    .line 174
    .line 175
    :goto_b
    and-int/lit8 v16, v12, 0x40

    .line 176
    .line 177
    const/high16 v10, 0x180000

    .line 178
    .line 179
    if-eqz v16, :cond_13

    .line 180
    .line 181
    or-int/2addr v1, v10

    .line 182
    :cond_12
    move/from16 v10, p6

    .line 183
    .line 184
    goto :goto_d

    .line 185
    :cond_13
    and-int/2addr v10, v11

    .line 186
    if-nez v10, :cond_12

    .line 187
    .line 188
    move/from16 v10, p6

    .line 189
    .line 190
    invoke-interface {v8, v10}, Landroidx/compose/runtime/Composer;->changed(F)Z

    .line 191
    .line 192
    .line 193
    move-result v17

    .line 194
    if-eqz v17, :cond_14

    .line 195
    .line 196
    const/high16 v17, 0x100000

    .line 197
    .line 198
    goto :goto_c

    .line 199
    :cond_14
    const/high16 v17, 0x80000

    .line 200
    .line 201
    :goto_c
    or-int v1, v1, v17

    .line 202
    .line 203
    :goto_d
    and-int/lit16 v15, v12, 0x80

    .line 204
    .line 205
    const/high16 v17, 0xc00000

    .line 206
    .line 207
    if-eqz v15, :cond_15

    .line 208
    .line 209
    or-int v1, v1, v17

    .line 210
    .line 211
    move/from16 v13, p7

    .line 212
    .line 213
    goto :goto_f

    .line 214
    :cond_15
    and-int v17, v11, v17

    .line 215
    .line 216
    move/from16 v13, p7

    .line 217
    .line 218
    if-nez v17, :cond_17

    .line 219
    .line 220
    invoke-interface {v8, v13}, Landroidx/compose/runtime/Composer;->changed(F)Z

    .line 221
    .line 222
    .line 223
    move-result v18

    .line 224
    if-eqz v18, :cond_16

    .line 225
    .line 226
    const/high16 v18, 0x800000

    .line 227
    .line 228
    goto :goto_e

    .line 229
    :cond_16
    const/high16 v18, 0x400000

    .line 230
    .line 231
    :goto_e
    or-int v1, v1, v18

    .line 232
    .line 233
    :cond_17
    :goto_f
    const/high16 v18, 0x6000000

    .line 234
    .line 235
    and-int v18, v11, v18

    .line 236
    .line 237
    if-nez v18, :cond_1a

    .line 238
    .line 239
    and-int/lit16 v4, v12, 0x100

    .line 240
    .line 241
    if-nez v4, :cond_18

    .line 242
    .line 243
    move-object/from16 v4, p8

    .line 244
    .line 245
    invoke-interface {v8, v4}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 246
    .line 247
    .line 248
    move-result v19

    .line 249
    if-eqz v19, :cond_19

    .line 250
    .line 251
    const/high16 v19, 0x4000000

    .line 252
    .line 253
    goto :goto_10

    .line 254
    :cond_18
    move-object/from16 v4, p8

    .line 255
    .line 256
    :cond_19
    const/high16 v19, 0x2000000

    .line 257
    .line 258
    :goto_10
    or-int v1, v1, v19

    .line 259
    .line 260
    goto :goto_11

    .line 261
    :cond_1a
    move-object/from16 v4, p8

    .line 262
    .line 263
    :goto_11
    and-int/lit16 v0, v12, 0x200

    .line 264
    .line 265
    const/high16 v20, 0x30000000

    .line 266
    .line 267
    if-eqz v0, :cond_1c

    .line 268
    .line 269
    or-int v1, v1, v20

    .line 270
    .line 271
    :cond_1b
    move-object/from16 v0, p9

    .line 272
    .line 273
    goto :goto_13

    .line 274
    :cond_1c
    and-int v0, v11, v20

    .line 275
    .line 276
    if-nez v0, :cond_1b

    .line 277
    .line 278
    move-object/from16 v0, p9

    .line 279
    .line 280
    invoke-interface {v8, v0}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 281
    .line 282
    .line 283
    move-result v20

    .line 284
    if-eqz v20, :cond_1d

    .line 285
    .line 286
    const/high16 v20, 0x20000000

    .line 287
    .line 288
    goto :goto_12

    .line 289
    :cond_1d
    const/high16 v20, 0x10000000

    .line 290
    .line 291
    :goto_12
    or-int v1, v1, v20

    .line 292
    .line 293
    :goto_13
    const v20, 0x12492493

    .line 294
    .line 295
    .line 296
    and-int v0, v1, v20

    .line 297
    .line 298
    move/from16 v20, v1

    .line 299
    .line 300
    const v1, 0x12492492

    .line 301
    .line 302
    .line 303
    if-ne v0, v1, :cond_1f

    .line 304
    .line 305
    invoke-interface {v8}, Landroidx/compose/runtime/Composer;->getSkipping()Z

    .line 306
    .line 307
    .line 308
    move-result v0

    .line 309
    if-nez v0, :cond_1e

    .line 310
    .line 311
    goto :goto_14

    .line 312
    :cond_1e
    invoke-interface {v8}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    .line 313
    .line 314
    .line 315
    move-object v5, v9

    .line 316
    move-object v9, v4

    .line 317
    move-object v4, v6

    .line 318
    move-object v6, v5

    .line 319
    move-object v5, v7

    .line 320
    move-object/from16 v25, v8

    .line 321
    .line 322
    move v7, v10

    .line 323
    move v8, v13

    .line 324
    goto/16 :goto_26

    .line 325
    .line 326
    :cond_1f
    :goto_14
    invoke-interface {v8}, Landroidx/compose/runtime/Composer;->startDefaults()V

    .line 327
    .line 328
    .line 329
    and-int/lit8 v0, v11, 0x1

    .line 330
    .line 331
    const v1, -0xe000001

    .line 332
    .line 333
    .line 334
    const v21, -0x70001

    .line 335
    .line 336
    .line 337
    const v22, -0xe001

    .line 338
    .line 339
    .line 340
    if-eqz v0, :cond_24

    .line 341
    .line 342
    invoke-interface {v8}, Landroidx/compose/runtime/Composer;->getDefaultsInvalid()Z

    .line 343
    .line 344
    .line 345
    move-result v0

    .line 346
    if-eqz v0, :cond_20

    .line 347
    .line 348
    goto :goto_15

    .line 349
    :cond_20
    invoke-interface {v8}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    .line 350
    .line 351
    .line 352
    and-int/lit8 v0, v12, 0x10

    .line 353
    .line 354
    if-eqz v0, :cond_21

    .line 355
    .line 356
    and-int v0, v20, v22

    .line 357
    .line 358
    move/from16 v20, v0

    .line 359
    .line 360
    :cond_21
    and-int/lit8 v0, v12, 0x20

    .line 361
    .line 362
    if-eqz v0, :cond_22

    .line 363
    .line 364
    and-int v20, v20, v21

    .line 365
    .line 366
    :cond_22
    and-int/lit16 v0, v12, 0x100

    .line 367
    .line 368
    if-eqz v0, :cond_23

    .line 369
    .line 370
    and-int v20, v20, v1

    .line 371
    .line 372
    :cond_23
    move-object/from16 v24, v4

    .line 373
    .line 374
    move v15, v13

    .line 375
    move/from16 v0, v20

    .line 376
    .line 377
    const/16 v11, 0x100

    .line 378
    .line 379
    move v13, v10

    .line 380
    move-object v10, v9

    .line 381
    move-object v9, v7

    .line 382
    move-object v7, v6

    .line 383
    goto/16 :goto_1c

    .line 384
    .line 385
    :cond_24
    :goto_15
    if-eqz v5, :cond_25

    .line 386
    .line 387
    sget-object v0, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    .line 388
    .line 389
    goto :goto_16

    .line 390
    :cond_25
    move-object v0, v6

    .line 391
    :goto_16
    and-int/lit8 v5, v12, 0x10

    .line 392
    .line 393
    const/4 v6, 0x6

    .line 394
    if-eqz v5, :cond_26

    .line 395
    .line 396
    sget-object v5, Landroidx/compose/material3/SearchBarDefaults;->INSTANCE:Landroidx/compose/material3/SearchBarDefaults;

    .line 397
    .line 398
    invoke-virtual {v5, v8, v6}, Landroidx/compose/material3/SearchBarDefaults;->getInputFieldShape(Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/graphics/Shape;

    .line 399
    .line 400
    .line 401
    move-result-object v5

    .line 402
    and-int v7, v20, v22

    .line 403
    .line 404
    move-object/from16 v20, v5

    .line 405
    .line 406
    move/from16 v22, v7

    .line 407
    .line 408
    goto :goto_17

    .line 409
    :cond_26
    move/from16 v22, v20

    .line 410
    .line 411
    move-object/from16 v20, v7

    .line 412
    .line 413
    :goto_17
    and-int/lit8 v5, v12, 0x20

    .line 414
    .line 415
    if-eqz v5, :cond_27

    .line 416
    .line 417
    sget-object v3, Landroidx/compose/material3/SearchBarDefaults;->INSTANCE:Landroidx/compose/material3/SearchBarDefaults;

    .line 418
    .line 419
    const/16 v9, 0x180

    .line 420
    .line 421
    const/4 v10, 0x3

    .line 422
    const-wide/16 v4, 0x0

    .line 423
    .line 424
    move/from16 v23, v6

    .line 425
    .line 426
    const-wide/16 v6, 0x0

    .line 427
    .line 428
    move/from16 v18, v1

    .line 429
    .line 430
    move/from16 v1, v23

    .line 431
    .line 432
    const/16 v11, 0x100

    .line 433
    .line 434
    invoke-virtual/range {v3 .. v10}, Landroidx/compose/material3/SearchBarDefaults;->colors-dgg9oW8(JJLandroidx/compose/runtime/Composer;II)Landroidx/compose/material3/SearchBarColors;

    .line 435
    .line 436
    .line 437
    move-result-object v3

    .line 438
    and-int v4, v22, v21

    .line 439
    .line 440
    goto :goto_18

    .line 441
    :cond_27
    move/from16 v18, v1

    .line 442
    .line 443
    move v1, v6

    .line 444
    const/16 v11, 0x100

    .line 445
    .line 446
    move-object v3, v9

    .line 447
    move/from16 v4, v22

    .line 448
    .line 449
    :goto_18
    if-eqz v16, :cond_28

    .line 450
    .line 451
    sget-object v5, Landroidx/compose/material3/SearchBarDefaults;->INSTANCE:Landroidx/compose/material3/SearchBarDefaults;

    .line 452
    .line 453
    invoke-virtual {v5}, Landroidx/compose/material3/SearchBarDefaults;->getTonalElevation-D9Ej5fM()F

    .line 454
    .line 455
    .line 456
    move-result v5

    .line 457
    goto :goto_19

    .line 458
    :cond_28
    move/from16 v5, p6

    .line 459
    .line 460
    :goto_19
    if-eqz v15, :cond_29

    .line 461
    .line 462
    sget-object v6, Landroidx/compose/material3/SearchBarDefaults;->INSTANCE:Landroidx/compose/material3/SearchBarDefaults;

    .line 463
    .line 464
    invoke-virtual {v6}, Landroidx/compose/material3/SearchBarDefaults;->getShadowElevation-D9Ej5fM()F

    .line 465
    .line 466
    .line 467
    move-result v6

    .line 468
    goto :goto_1a

    .line 469
    :cond_29
    move v6, v13

    .line 470
    :goto_1a
    and-int/lit16 v7, v12, 0x100

    .line 471
    .line 472
    if-eqz v7, :cond_2a

    .line 473
    .line 474
    sget-object v7, Landroidx/compose/material3/SearchBarDefaults;->INSTANCE:Landroidx/compose/material3/SearchBarDefaults;

    .line 475
    .line 476
    invoke-virtual {v7, v8, v1}, Landroidx/compose/material3/SearchBarDefaults;->getWindowInsets(Landroidx/compose/runtime/Composer;I)Landroidx/compose/foundation/layout/WindowInsets;

    .line 477
    .line 478
    .line 479
    move-result-object v1

    .line 480
    and-int v4, v4, v18

    .line 481
    .line 482
    move-object v7, v0

    .line 483
    move-object/from16 v24, v1

    .line 484
    .line 485
    :goto_1b
    move-object v10, v3

    .line 486
    move v0, v4

    .line 487
    move v13, v5

    .line 488
    move v15, v6

    .line 489
    move-object/from16 v9, v20

    .line 490
    .line 491
    goto :goto_1c

    .line 492
    :cond_2a
    move-object/from16 v24, p8

    .line 493
    .line 494
    move-object v7, v0

    .line 495
    goto :goto_1b

    .line 496
    :goto_1c
    invoke-interface {v8}, Landroidx/compose/runtime/Composer;->endDefaults()V

    .line 497
    .line 498
    .line 499
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 500
    .line 501
    .line 502
    move-result v1

    .line 503
    if-eqz v1, :cond_2b

    .line 504
    .line 505
    const/4 v1, -0x1

    .line 506
    const-string/jumbo v3, "androidx.compose.material3.SearchBar (SearchBar.android.kt:177)"

    .line 507
    .line 508
    .line 509
    const v4, 0x561b9ac9

    .line 510
    .line 511
    .line 512
    invoke-static {v4, v0, v1, v3}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 513
    .line 514
    .line 515
    :cond_2b
    invoke-interface {v8}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 516
    .line 517
    .line 518
    move-result-object v1

    .line 519
    sget-object v16, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    .line 520
    .line 521
    invoke-virtual/range {v16 .. v16}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    .line 522
    .line 523
    .line 524
    move-result-object v3

    .line 525
    const/4 v4, 0x0

    .line 526
    if-ne v1, v3, :cond_2d

    .line 527
    .line 528
    const/4 v1, 0x0

    .line 529
    if-eqz v2, :cond_2c

    .line 530
    .line 531
    const/high16 v3, 0x3f800000    # 1.0f

    .line 532
    .line 533
    :goto_1d
    const/4 v5, 0x2

    .line 534
    goto :goto_1e

    .line 535
    :cond_2c
    move v3, v1

    .line 536
    goto :goto_1d

    .line 537
    :goto_1e
    invoke-static {v3, v1, v5, v4}, Landroidx/compose/animation/core/AnimatableKt;->Animatable$default(FFILjava/lang/Object;)Landroidx/compose/animation/core/Animatable;

    .line 538
    .line 539
    .line 540
    move-result-object v1

    .line 541
    invoke-interface {v8, v1}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 542
    .line 543
    .line 544
    :cond_2d
    check-cast v1, Landroidx/compose/animation/core/Animatable;

    .line 545
    .line 546
    invoke-interface {v8}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 547
    .line 548
    .line 549
    move-result-object v3

    .line 550
    invoke-virtual/range {v16 .. v16}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    .line 551
    .line 552
    .line 553
    move-result-object v5

    .line 554
    if-ne v3, v5, :cond_2e

    .line 555
    .line 556
    const/high16 v3, 0x7fc00000    # Float.NaN

    .line 557
    .line 558
    invoke-static {v3}, Landroidx/compose/runtime/PrimitiveSnapshotStateKt;->mutableFloatStateOf(F)Landroidx/compose/runtime/MutableFloatState;

    .line 559
    .line 560
    .line 561
    move-result-object v3

    .line 562
    invoke-interface {v8, v3}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 563
    .line 564
    .line 565
    :cond_2e
    check-cast v3, Landroidx/compose/runtime/MutableFloatState;

    .line 566
    .line 567
    invoke-interface {v8}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 568
    .line 569
    .line 570
    move-result-object v5

    .line 571
    invoke-virtual/range {v16 .. v16}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    .line 572
    .line 573
    .line 574
    move-result-object v6

    .line 575
    if-ne v5, v6, :cond_2f

    .line 576
    .line 577
    const/4 v6, 0x2

    .line 578
    invoke-static {v4, v4, v6, v4}, Landroidx/compose/runtime/SnapshotStateKt;->mutableStateOf$default(Ljava/lang/Object;Landroidx/compose/runtime/SnapshotMutationPolicy;ILjava/lang/Object;)Landroidx/compose/runtime/MutableState;

    .line 579
    .line 580
    .line 581
    move-result-object v5

    .line 582
    invoke-interface {v8, v5}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 583
    .line 584
    .line 585
    goto :goto_1f

    .line 586
    :cond_2f
    const/4 v6, 0x2

    .line 587
    :goto_1f
    move-object/from16 v21, v5

    .line 588
    .line 589
    check-cast v21, Landroidx/compose/runtime/MutableState;

    .line 590
    .line 591
    invoke-interface {v8}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 592
    .line 593
    .line 594
    move-result-object v5

    .line 595
    invoke-virtual/range {v16 .. v16}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    .line 596
    .line 597
    .line 598
    move-result-object v11

    .line 599
    if-ne v5, v11, :cond_30

    .line 600
    .line 601
    invoke-static {v4, v4, v6, v4}, Landroidx/compose/runtime/SnapshotStateKt;->mutableStateOf$default(Ljava/lang/Object;Landroidx/compose/runtime/SnapshotMutationPolicy;ILjava/lang/Object;)Landroidx/compose/runtime/MutableState;

    .line 602
    .line 603
    .line 604
    move-result-object v5

    .line 605
    invoke-interface {v8, v5}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 606
    .line 607
    .line 608
    :cond_30
    check-cast v5, Landroidx/compose/runtime/MutableState;

    .line 609
    .line 610
    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 611
    .line 612
    .line 613
    move-result-object v11

    .line 614
    invoke-interface {v8, v1}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 615
    .line 616
    .line 617
    move-result v4

    .line 618
    and-int/lit8 v6, v0, 0x70

    .line 619
    .line 620
    move-object/from16 p3, v7

    .line 621
    .line 622
    const/16 v17, 0x1

    .line 623
    .line 624
    const/16 v7, 0x20

    .line 625
    .line 626
    if-ne v6, v7, :cond_31

    .line 627
    .line 628
    move/from16 v6, v17

    .line 629
    .line 630
    goto :goto_20

    .line 631
    :cond_31
    const/4 v6, 0x0

    .line 632
    :goto_20
    or-int/2addr v4, v6

    .line 633
    invoke-interface {v8}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 634
    .line 635
    .line 636
    move-result-object v6

    .line 637
    if-nez v4, :cond_32

    .line 638
    .line 639
    invoke-virtual/range {v16 .. v16}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    .line 640
    .line 641
    .line 642
    move-result-object v4

    .line 643
    if-ne v6, v4, :cond_33

    .line 644
    .line 645
    :cond_32
    move/from16 v20, v0

    .line 646
    .line 647
    goto :goto_21

    .line 648
    :cond_33
    move v7, v0

    .line 649
    move-object/from16 v4, v21

    .line 650
    .line 651
    goto :goto_22

    .line 652
    :goto_21
    new-instance v0, Landroidx/compose/material3/SearchBar_androidKt$SearchBar$1$1;

    .line 653
    .line 654
    const/4 v6, 0x0

    .line 655
    move/from16 v7, v20

    .line 656
    .line 657
    move-object/from16 v4, v21

    .line 658
    .line 659
    invoke-direct/range {v0 .. v6}, Landroidx/compose/material3/SearchBar_androidKt$SearchBar$1$1;-><init>(Landroidx/compose/animation/core/Animatable;ZLandroidx/compose/runtime/MutableFloatState;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Lkotlin/coroutines/Continuation;)V

    .line 660
    .line 661
    .line 662
    invoke-interface {v8, v0}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 663
    .line 664
    .line 665
    move-object v6, v0

    .line 666
    :goto_22
    check-cast v6, Lkotlin/jvm/functions/Function2;

    .line 667
    .line 668
    shr-int/lit8 v0, v7, 0x3

    .line 669
    .line 670
    and-int/lit8 v0, v0, 0xe

    .line 671
    .line 672
    invoke-static {v11, v6, v8, v0}, Landroidx/compose/runtime/EffectsKt;->LaunchedEffect(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V

    .line 673
    .line 674
    .line 675
    invoke-interface {v8}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 676
    .line 677
    .line 678
    move-result-object v6

    .line 679
    invoke-virtual/range {v16 .. v16}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    .line 680
    .line 681
    .line 682
    move-result-object v11

    .line 683
    if-ne v6, v11, :cond_34

    .line 684
    .line 685
    new-instance v6, Landroidx/compose/foundation/MutatorMutex;

    .line 686
    .line 687
    invoke-direct {v6}, Landroidx/compose/foundation/MutatorMutex;-><init>()V

    .line 688
    .line 689
    .line 690
    invoke-interface {v8, v6}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 691
    .line 692
    .line 693
    :cond_34
    check-cast v6, Landroidx/compose/foundation/MutatorMutex;

    .line 694
    .line 695
    invoke-interface {v8, v1}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 696
    .line 697
    .line 698
    move-result v11

    .line 699
    move-object/from16 v19, v1

    .line 700
    .line 701
    and-int/lit16 v1, v7, 0x380

    .line 702
    .line 703
    move-object/from16 p5, v3

    .line 704
    .line 705
    const/16 v3, 0x100

    .line 706
    .line 707
    if-ne v1, v3, :cond_35

    .line 708
    .line 709
    goto :goto_23

    .line 710
    :cond_35
    const/16 v17, 0x0

    .line 711
    .line 712
    :goto_23
    or-int v1, v11, v17

    .line 713
    .line 714
    invoke-interface {v8}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 715
    .line 716
    .line 717
    move-result-object v3

    .line 718
    if-nez v1, :cond_37

    .line 719
    .line 720
    invoke-virtual/range {v16 .. v16}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    .line 721
    .line 722
    .line 723
    move-result-object v1

    .line 724
    if-ne v3, v1, :cond_36

    .line 725
    .line 726
    goto :goto_24

    .line 727
    :cond_36
    move-object/from16 v18, p5

    .line 728
    .line 729
    goto :goto_25

    .line 730
    :cond_37
    :goto_24
    new-instance v16, Landroidx/compose/material3/SearchBar_androidKt$SearchBar$2$1;

    .line 731
    .line 732
    const/16 v23, 0x0

    .line 733
    .line 734
    move-object/from16 v20, p2

    .line 735
    .line 736
    move-object/from16 v18, p5

    .line 737
    .line 738
    move-object/from16 v21, v4

    .line 739
    .line 740
    move-object/from16 v22, v5

    .line 741
    .line 742
    move-object/from16 v17, v6

    .line 743
    .line 744
    invoke-direct/range {v16 .. v23}, Landroidx/compose/material3/SearchBar_androidKt$SearchBar$2$1;-><init>(Landroidx/compose/foundation/MutatorMutex;Landroidx/compose/runtime/MutableFloatState;Landroidx/compose/animation/core/Animatable;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Lkotlin/coroutines/Continuation;)V

    .line 745
    .line 746
    .line 747
    move-object/from16 v3, v16

    .line 748
    .line 749
    invoke-interface {v8, v3}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 750
    .line 751
    .line 752
    :goto_25
    check-cast v3, Lkotlin/jvm/functions/Function2;

    .line 753
    .line 754
    const/4 v1, 0x0

    .line 755
    invoke-static {v2, v3, v8, v0, v1}, Landroidx/activity/compose/PredictiveBackHandlerKt;->PredictiveBackHandler(ZLkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V

    .line 756
    .line 757
    .line 758
    sget v0, Landroidx/compose/animation/core/Animatable;->$stable:I

    .line 759
    .line 760
    or-int/lit16 v0, v0, 0xdb0

    .line 761
    .line 762
    const v1, 0xe000

    .line 763
    .line 764
    .line 765
    shl-int/lit8 v3, v7, 0x3

    .line 766
    .line 767
    and-int/2addr v1, v3

    .line 768
    or-int/2addr v0, v1

    .line 769
    shl-int/lit8 v1, v7, 0xf

    .line 770
    .line 771
    const/high16 v3, 0x70000

    .line 772
    .line 773
    and-int/2addr v1, v3

    .line 774
    or-int/2addr v0, v1

    .line 775
    shl-int/lit8 v1, v7, 0x6

    .line 776
    .line 777
    const/high16 v3, 0x380000

    .line 778
    .line 779
    and-int/2addr v3, v1

    .line 780
    or-int/2addr v0, v3

    .line 781
    const/high16 v3, 0x1c00000

    .line 782
    .line 783
    and-int/2addr v3, v1

    .line 784
    or-int/2addr v0, v3

    .line 785
    const/high16 v3, 0xe000000

    .line 786
    .line 787
    and-int/2addr v3, v1

    .line 788
    or-int/2addr v0, v3

    .line 789
    const/high16 v3, 0x70000000

    .line 790
    .line 791
    and-int/2addr v1, v3

    .line 792
    or-int v26, v0, v1

    .line 793
    .line 794
    shr-int/lit8 v0, v7, 0x18

    .line 795
    .line 796
    and-int/lit8 v27, v0, 0x7e

    .line 797
    .line 798
    const/16 v28, 0x0

    .line 799
    .line 800
    move-object/from16 v16, v18

    .line 801
    .line 802
    move-object/from16 v18, v14

    .line 803
    .line 804
    move-object/from16 v14, v16

    .line 805
    .line 806
    move-object/from16 v17, p3

    .line 807
    .line 808
    move-object/from16 v16, v5

    .line 809
    .line 810
    move-object/from16 v25, v8

    .line 811
    .line 812
    move-object/from16 v20, v10

    .line 813
    .line 814
    move/from16 v21, v13

    .line 815
    .line 816
    move/from16 v22, v15

    .line 817
    .line 818
    move-object/from16 v13, v19

    .line 819
    .line 820
    move-object/from16 v23, v24

    .line 821
    .line 822
    move-object/from16 v24, p9

    .line 823
    .line 824
    move-object v15, v4

    .line 825
    move-object/from16 v19, v9

    .line 826
    .line 827
    invoke-static/range {v13 .. v28}, Landroidx/compose/material3/SearchBar_androidKt;->SearchBarImpl-j1jLAyQ(Landroidx/compose/animation/core/Animatable;Landroidx/compose/runtime/MutableFloatState;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material3/SearchBarColors;FFLandroidx/compose/foundation/layout/WindowInsets;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;III)V

    .line 828
    .line 829
    .line 830
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 831
    .line 832
    .line 833
    move-result v0

    .line 834
    if-eqz v0, :cond_38

    .line 835
    .line 836
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 837
    .line 838
    .line 839
    :cond_38
    move-object/from16 v25, v8

    .line 840
    .line 841
    move-object/from16 v4, v17

    .line 842
    .line 843
    move-object/from16 v5, v19

    .line 844
    .line 845
    move-object/from16 v6, v20

    .line 846
    .line 847
    move/from16 v7, v21

    .line 848
    .line 849
    move/from16 v8, v22

    .line 850
    .line 851
    move-object/from16 v9, v23

    .line 852
    .line 853
    :goto_26
    invoke-interface/range {v25 .. v25}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    .line 854
    .line 855
    .line 856
    move-result-object v13

    .line 857
    if-eqz v13, :cond_39

    .line 858
    .line 859
    new-instance v0, Landroidx/compose/material3/SearchBar_androidKt$SearchBar$3;

    .line 860
    .line 861
    move-object/from16 v1, p0

    .line 862
    .line 863
    move-object/from16 v3, p2

    .line 864
    .line 865
    move-object/from16 v10, p9

    .line 866
    .line 867
    move/from16 v11, p11

    .line 868
    .line 869
    invoke-direct/range {v0 .. v12}, Landroidx/compose/material3/SearchBar_androidKt$SearchBar$3;-><init>(Lkotlin/jvm/functions/Function2;ZLkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material3/SearchBarColors;FFLandroidx/compose/foundation/layout/WindowInsets;Lkotlin/jvm/functions/Function3;II)V

    .line 870
    .line 871
    .line 872
    invoke-interface {v13, v0}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lkotlin/jvm/functions/Function2;)V

    .line 873
    .line 874
    .line 875
    :cond_39
    return-void
.end method

.method public static final SearchBarImpl-j1jLAyQ(Landroidx/compose/animation/core/Animatable;Landroidx/compose/runtime/MutableFloatState;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material3/SearchBarColors;FFLandroidx/compose/foundation/layout/WindowInsets;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;III)V
    .locals 27
    .annotation build Landroidx/compose/runtime/Composable;
    .end annotation

    .annotation build Landroidx/compose/runtime/ComposableInferredTarget;
        scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/animation/core/Animatable<",
            "Ljava/lang/Float;",
            "Landroidx/compose/animation/core/AnimationVector1D;",
            ">;",
            "Landroidx/compose/runtime/MutableFloatState;",
            "Landroidx/compose/runtime/MutableState<",
            "Landroidx/activity/BackEventCompat;",
            ">;",
            "Landroidx/compose/runtime/MutableState<",
            "Landroidx/activity/BackEventCompat;",
            ">;",
            "Landroidx/compose/ui/Modifier;",
            "Lkotlin/jvm/functions/Function2<",
            "-",
            "Landroidx/compose/runtime/Composer;",
            "-",
            "Ljava/lang/Integer;",
            "Lkotlin/Unit;",
            ">;",
            "Landroidx/compose/ui/graphics/Shape;",
            "Landroidx/compose/material3/SearchBarColors;",
            "FF",
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
            "III)V"
        }
    .end annotation

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v12, p11

    .line 4
    .line 5
    move/from16 v13, p13

    .line 6
    .line 7
    move/from16 v15, p15

    .line 8
    .line 9
    const v1, -0x1a3ef4c1

    .line 10
    .line 11
    .line 12
    move-object/from16 v2, p12

    .line 13
    .line 14
    invoke-interface {v2, v1}, Landroidx/compose/runtime/Composer;->startRestartGroup(I)Landroidx/compose/runtime/Composer;

    .line 15
    .line 16
    .line 17
    move-result-object v7

    .line 18
    and-int/lit8 v2, v15, 0x1

    .line 19
    .line 20
    if-eqz v2, :cond_0

    .line 21
    .line 22
    or-int/lit8 v2, v13, 0x6

    .line 23
    .line 24
    goto :goto_2

    .line 25
    :cond_0
    and-int/lit8 v2, v13, 0x6

    .line 26
    .line 27
    if-nez v2, :cond_3

    .line 28
    .line 29
    and-int/lit8 v2, v13, 0x8

    .line 30
    .line 31
    if-nez v2, :cond_1

    .line 32
    .line 33
    invoke-interface {v7, v0}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 34
    .line 35
    .line 36
    move-result v2

    .line 37
    goto :goto_0

    .line 38
    :cond_1
    invoke-interface {v7, v0}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 39
    .line 40
    .line 41
    move-result v2

    .line 42
    :goto_0
    if-eqz v2, :cond_2

    .line 43
    .line 44
    const/4 v2, 0x4

    .line 45
    goto :goto_1

    .line 46
    :cond_2
    const/4 v2, 0x2

    .line 47
    :goto_1
    or-int/2addr v2, v13

    .line 48
    goto :goto_2

    .line 49
    :cond_3
    move v2, v13

    .line 50
    :goto_2
    and-int/lit8 v5, v15, 0x2

    .line 51
    .line 52
    if-eqz v5, :cond_4

    .line 53
    .line 54
    or-int/lit8 v2, v2, 0x30

    .line 55
    .line 56
    move-object/from16 v10, p1

    .line 57
    .line 58
    goto :goto_4

    .line 59
    :cond_4
    and-int/lit8 v5, v13, 0x30

    .line 60
    .line 61
    move-object/from16 v10, p1

    .line 62
    .line 63
    if-nez v5, :cond_6

    .line 64
    .line 65
    invoke-interface {v7, v10}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 66
    .line 67
    .line 68
    move-result v5

    .line 69
    if-eqz v5, :cond_5

    .line 70
    .line 71
    const/16 v5, 0x20

    .line 72
    .line 73
    goto :goto_3

    .line 74
    :cond_5
    const/16 v5, 0x10

    .line 75
    .line 76
    :goto_3
    or-int/2addr v2, v5

    .line 77
    :cond_6
    :goto_4
    and-int/lit8 v5, v15, 0x4

    .line 78
    .line 79
    if-eqz v5, :cond_7

    .line 80
    .line 81
    or-int/lit16 v2, v2, 0x180

    .line 82
    .line 83
    move-object/from16 v11, p2

    .line 84
    .line 85
    goto :goto_6

    .line 86
    :cond_7
    and-int/lit16 v5, v13, 0x180

    .line 87
    .line 88
    move-object/from16 v11, p2

    .line 89
    .line 90
    if-nez v5, :cond_9

    .line 91
    .line 92
    invoke-interface {v7, v11}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 93
    .line 94
    .line 95
    move-result v5

    .line 96
    if-eqz v5, :cond_8

    .line 97
    .line 98
    const/16 v5, 0x100

    .line 99
    .line 100
    goto :goto_5

    .line 101
    :cond_8
    const/16 v5, 0x80

    .line 102
    .line 103
    :goto_5
    or-int/2addr v2, v5

    .line 104
    :cond_9
    :goto_6
    and-int/lit8 v5, v15, 0x8

    .line 105
    .line 106
    if-eqz v5, :cond_a

    .line 107
    .line 108
    or-int/lit16 v2, v2, 0xc00

    .line 109
    .line 110
    move-object/from16 v14, p3

    .line 111
    .line 112
    goto :goto_8

    .line 113
    :cond_a
    and-int/lit16 v5, v13, 0xc00

    .line 114
    .line 115
    move-object/from16 v14, p3

    .line 116
    .line 117
    if-nez v5, :cond_c

    .line 118
    .line 119
    invoke-interface {v7, v14}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 120
    .line 121
    .line 122
    move-result v5

    .line 123
    if-eqz v5, :cond_b

    .line 124
    .line 125
    const/16 v5, 0x800

    .line 126
    .line 127
    goto :goto_7

    .line 128
    :cond_b
    const/16 v5, 0x400

    .line 129
    .line 130
    :goto_7
    or-int/2addr v2, v5

    .line 131
    :cond_c
    :goto_8
    and-int/lit8 v5, v15, 0x10

    .line 132
    .line 133
    if-eqz v5, :cond_e

    .line 134
    .line 135
    or-int/lit16 v2, v2, 0x6000

    .line 136
    .line 137
    :cond_d
    move-object/from16 v9, p4

    .line 138
    .line 139
    goto :goto_a

    .line 140
    :cond_e
    and-int/lit16 v9, v13, 0x6000

    .line 141
    .line 142
    if-nez v9, :cond_d

    .line 143
    .line 144
    move-object/from16 v9, p4

    .line 145
    .line 146
    invoke-interface {v7, v9}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 147
    .line 148
    .line 149
    move-result v16

    .line 150
    if-eqz v16, :cond_f

    .line 151
    .line 152
    const/16 v16, 0x4000

    .line 153
    .line 154
    goto :goto_9

    .line 155
    :cond_f
    const/16 v16, 0x2000

    .line 156
    .line 157
    :goto_9
    or-int v2, v2, v16

    .line 158
    .line 159
    :goto_a
    and-int/lit8 v16, v15, 0x20

    .line 160
    .line 161
    const/high16 v17, 0x30000

    .line 162
    .line 163
    if-eqz v16, :cond_10

    .line 164
    .line 165
    or-int v2, v2, v17

    .line 166
    .line 167
    move-object/from16 v1, p5

    .line 168
    .line 169
    goto :goto_c

    .line 170
    :cond_10
    and-int v16, v13, v17

    .line 171
    .line 172
    move-object/from16 v1, p5

    .line 173
    .line 174
    if-nez v16, :cond_12

    .line 175
    .line 176
    invoke-interface {v7, v1}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 177
    .line 178
    .line 179
    move-result v17

    .line 180
    if-eqz v17, :cond_11

    .line 181
    .line 182
    const/high16 v17, 0x20000

    .line 183
    .line 184
    goto :goto_b

    .line 185
    :cond_11
    const/high16 v17, 0x10000

    .line 186
    .line 187
    :goto_b
    or-int v2, v2, v17

    .line 188
    .line 189
    :cond_12
    :goto_c
    const/high16 v17, 0x180000

    .line 190
    .line 191
    and-int v18, v13, v17

    .line 192
    .line 193
    if-nez v18, :cond_14

    .line 194
    .line 195
    and-int/lit8 v18, v15, 0x40

    .line 196
    .line 197
    move-object/from16 v3, p6

    .line 198
    .line 199
    if-nez v18, :cond_13

    .line 200
    .line 201
    invoke-interface {v7, v3}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 202
    .line 203
    .line 204
    move-result v19

    .line 205
    if-eqz v19, :cond_13

    .line 206
    .line 207
    const/high16 v19, 0x100000

    .line 208
    .line 209
    goto :goto_d

    .line 210
    :cond_13
    const/high16 v19, 0x80000

    .line 211
    .line 212
    :goto_d
    or-int v2, v2, v19

    .line 213
    .line 214
    goto :goto_e

    .line 215
    :cond_14
    move-object/from16 v3, p6

    .line 216
    .line 217
    :goto_e
    const/high16 v19, 0xc00000

    .line 218
    .line 219
    and-int v20, v13, v19

    .line 220
    .line 221
    if-nez v20, :cond_17

    .line 222
    .line 223
    and-int/lit16 v4, v15, 0x80

    .line 224
    .line 225
    if-nez v4, :cond_15

    .line 226
    .line 227
    move-object/from16 v4, p7

    .line 228
    .line 229
    invoke-interface {v7, v4}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 230
    .line 231
    .line 232
    move-result v21

    .line 233
    if-eqz v21, :cond_16

    .line 234
    .line 235
    const/high16 v21, 0x800000

    .line 236
    .line 237
    goto :goto_f

    .line 238
    :cond_15
    move-object/from16 v4, p7

    .line 239
    .line 240
    :cond_16
    const/high16 v21, 0x400000

    .line 241
    .line 242
    :goto_f
    or-int v2, v2, v21

    .line 243
    .line 244
    goto :goto_10

    .line 245
    :cond_17
    move-object/from16 v4, p7

    .line 246
    .line 247
    :goto_10
    and-int/lit16 v3, v15, 0x100

    .line 248
    .line 249
    const/high16 v21, 0x6000000

    .line 250
    .line 251
    if-eqz v3, :cond_19

    .line 252
    .line 253
    or-int v2, v2, v21

    .line 254
    .line 255
    :cond_18
    move/from16 v21, v3

    .line 256
    .line 257
    move/from16 v3, p8

    .line 258
    .line 259
    goto :goto_12

    .line 260
    :cond_19
    and-int v21, v13, v21

    .line 261
    .line 262
    if-nez v21, :cond_18

    .line 263
    .line 264
    move/from16 v21, v3

    .line 265
    .line 266
    move/from16 v3, p8

    .line 267
    .line 268
    invoke-interface {v7, v3}, Landroidx/compose/runtime/Composer;->changed(F)Z

    .line 269
    .line 270
    .line 271
    move-result v22

    .line 272
    if-eqz v22, :cond_1a

    .line 273
    .line 274
    const/high16 v22, 0x4000000

    .line 275
    .line 276
    goto :goto_11

    .line 277
    :cond_1a
    const/high16 v22, 0x2000000

    .line 278
    .line 279
    :goto_11
    or-int v2, v2, v22

    .line 280
    .line 281
    :goto_12
    and-int/lit16 v3, v15, 0x200

    .line 282
    .line 283
    const/high16 v22, 0x30000000

    .line 284
    .line 285
    if-eqz v3, :cond_1c

    .line 286
    .line 287
    or-int v2, v2, v22

    .line 288
    .line 289
    :cond_1b
    move/from16 v22, v3

    .line 290
    .line 291
    move/from16 v3, p9

    .line 292
    .line 293
    goto :goto_14

    .line 294
    :cond_1c
    and-int v22, v13, v22

    .line 295
    .line 296
    if-nez v22, :cond_1b

    .line 297
    .line 298
    move/from16 v22, v3

    .line 299
    .line 300
    move/from16 v3, p9

    .line 301
    .line 302
    invoke-interface {v7, v3}, Landroidx/compose/runtime/Composer;->changed(F)Z

    .line 303
    .line 304
    .line 305
    move-result v23

    .line 306
    if-eqz v23, :cond_1d

    .line 307
    .line 308
    const/high16 v23, 0x20000000

    .line 309
    .line 310
    goto :goto_13

    .line 311
    :cond_1d
    const/high16 v23, 0x10000000

    .line 312
    .line 313
    :goto_13
    or-int v2, v2, v23

    .line 314
    .line 315
    :goto_14
    and-int/lit8 v23, p14, 0x6

    .line 316
    .line 317
    if-nez v23, :cond_20

    .line 318
    .line 319
    and-int/lit16 v6, v15, 0x400

    .line 320
    .line 321
    if-nez v6, :cond_1e

    .line 322
    .line 323
    move-object/from16 v6, p10

    .line 324
    .line 325
    invoke-interface {v7, v6}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 326
    .line 327
    .line 328
    move-result v24

    .line 329
    if-eqz v24, :cond_1f

    .line 330
    .line 331
    const/16 v20, 0x4

    .line 332
    .line 333
    goto :goto_15

    .line 334
    :cond_1e
    move-object/from16 v6, p10

    .line 335
    .line 336
    :cond_1f
    const/16 v20, 0x2

    .line 337
    .line 338
    :goto_15
    or-int v20, p14, v20

    .line 339
    .line 340
    goto :goto_16

    .line 341
    :cond_20
    move-object/from16 v6, p10

    .line 342
    .line 343
    move/from16 v20, p14

    .line 344
    .line 345
    :goto_16
    and-int/lit16 v8, v15, 0x800

    .line 346
    .line 347
    if-eqz v8, :cond_21

    .line 348
    .line 349
    or-int/lit8 v20, v20, 0x30

    .line 350
    .line 351
    goto :goto_18

    .line 352
    :cond_21
    and-int/lit8 v8, p14, 0x30

    .line 353
    .line 354
    if-nez v8, :cond_23

    .line 355
    .line 356
    invoke-interface {v7, v12}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 357
    .line 358
    .line 359
    move-result v8

    .line 360
    if-eqz v8, :cond_22

    .line 361
    .line 362
    const/16 v23, 0x20

    .line 363
    .line 364
    goto :goto_17

    .line 365
    :cond_22
    const/16 v23, 0x10

    .line 366
    .line 367
    :goto_17
    or-int v20, v20, v23

    .line 368
    .line 369
    :cond_23
    :goto_18
    const v8, 0x12492493

    .line 370
    .line 371
    .line 372
    and-int/2addr v8, v2

    .line 373
    const v1, 0x12492492

    .line 374
    .line 375
    .line 376
    if-ne v8, v1, :cond_25

    .line 377
    .line 378
    and-int/lit8 v1, v20, 0x13

    .line 379
    .line 380
    const/16 v8, 0x12

    .line 381
    .line 382
    if-ne v1, v8, :cond_25

    .line 383
    .line 384
    invoke-interface {v7}, Landroidx/compose/runtime/Composer;->getSkipping()Z

    .line 385
    .line 386
    .line 387
    move-result v1

    .line 388
    if-nez v1, :cond_24

    .line 389
    .line 390
    goto :goto_19

    .line 391
    :cond_24
    invoke-interface {v7}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    .line 392
    .line 393
    .line 394
    move v10, v3

    .line 395
    move-object v8, v4

    .line 396
    move-object v11, v6

    .line 397
    move-object v0, v7

    .line 398
    move-object v5, v9

    .line 399
    move-object/from16 v7, p6

    .line 400
    .line 401
    move/from16 v9, p8

    .line 402
    .line 403
    goto/16 :goto_28

    .line 404
    .line 405
    :cond_25
    :goto_19
    invoke-interface {v7}, Landroidx/compose/runtime/Composer;->startDefaults()V

    .line 406
    .line 407
    .line 408
    and-int/lit8 v1, v13, 0x1

    .line 409
    .line 410
    const/4 v8, 0x6

    .line 411
    if-eqz v1, :cond_2a

    .line 412
    .line 413
    invoke-interface {v7}, Landroidx/compose/runtime/Composer;->getDefaultsInvalid()Z

    .line 414
    .line 415
    .line 416
    move-result v1

    .line 417
    if-eqz v1, :cond_26

    .line 418
    .line 419
    goto :goto_1a

    .line 420
    :cond_26
    invoke-interface {v7}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    .line 421
    .line 422
    .line 423
    and-int/lit8 v1, v15, 0x40

    .line 424
    .line 425
    if-eqz v1, :cond_27

    .line 426
    .line 427
    const v1, -0x380001

    .line 428
    .line 429
    .line 430
    and-int/2addr v2, v1

    .line 431
    :cond_27
    and-int/lit16 v1, v15, 0x80

    .line 432
    .line 433
    if-eqz v1, :cond_28

    .line 434
    .line 435
    const v1, -0x1c00001

    .line 436
    .line 437
    .line 438
    and-int/2addr v2, v1

    .line 439
    :cond_28
    and-int/lit16 v1, v15, 0x400

    .line 440
    .line 441
    if-eqz v1, :cond_29

    .line 442
    .line 443
    and-int/lit8 v20, v20, -0xf

    .line 444
    .line 445
    :cond_29
    move/from16 v5, p8

    .line 446
    .line 447
    move-object v8, v6

    .line 448
    move/from16 v1, v20

    .line 449
    .line 450
    move v6, v3

    .line 451
    move-object v3, v4

    .line 452
    move-object v4, v9

    .line 453
    move v9, v2

    .line 454
    move-object/from16 v2, p6

    .line 455
    .line 456
    goto/16 :goto_22

    .line 457
    .line 458
    :cond_2a
    :goto_1a
    if-eqz v5, :cond_2b

    .line 459
    .line 460
    sget-object v1, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    .line 461
    .line 462
    goto :goto_1b

    .line 463
    :cond_2b
    move-object v1, v9

    .line 464
    :goto_1b
    and-int/lit8 v5, v15, 0x40

    .line 465
    .line 466
    if-eqz v5, :cond_2c

    .line 467
    .line 468
    sget-object v5, Landroidx/compose/material3/SearchBarDefaults;->INSTANCE:Landroidx/compose/material3/SearchBarDefaults;

    .line 469
    .line 470
    invoke-virtual {v5, v7, v8}, Landroidx/compose/material3/SearchBarDefaults;->getInputFieldShape(Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/graphics/Shape;

    .line 471
    .line 472
    .line 473
    move-result-object v5

    .line 474
    const v9, -0x380001

    .line 475
    .line 476
    .line 477
    and-int/2addr v2, v9

    .line 478
    move-object/from16 v23, v5

    .line 479
    .line 480
    :goto_1c
    move/from16 v24, v2

    .line 481
    .line 482
    goto :goto_1d

    .line 483
    :cond_2c
    move-object/from16 v23, p6

    .line 484
    .line 485
    goto :goto_1c

    .line 486
    :goto_1d
    and-int/lit16 v2, v15, 0x80

    .line 487
    .line 488
    if-eqz v2, :cond_2d

    .line 489
    .line 490
    sget-object v2, Landroidx/compose/material3/SearchBarDefaults;->INSTANCE:Landroidx/compose/material3/SearchBarDefaults;

    .line 491
    .line 492
    move v4, v8

    .line 493
    const/16 v8, 0x180

    .line 494
    .line 495
    const/4 v9, 0x3

    .line 496
    move v5, v4

    .line 497
    const-wide/16 v3, 0x0

    .line 498
    .line 499
    move/from16 v25, v5

    .line 500
    .line 501
    const-wide/16 v5, 0x0

    .line 502
    .line 503
    move-object/from16 p4, v1

    .line 504
    .line 505
    move/from16 v1, v25

    .line 506
    .line 507
    invoke-virtual/range {v2 .. v9}, Landroidx/compose/material3/SearchBarDefaults;->colors-dgg9oW8(JJLandroidx/compose/runtime/Composer;II)Landroidx/compose/material3/SearchBarColors;

    .line 508
    .line 509
    .line 510
    move-result-object v2

    .line 511
    const v3, -0x1c00001

    .line 512
    .line 513
    .line 514
    and-int v3, v24, v3

    .line 515
    .line 516
    goto :goto_1e

    .line 517
    :cond_2d
    move-object/from16 p4, v1

    .line 518
    .line 519
    move v1, v8

    .line 520
    move-object v2, v4

    .line 521
    move/from16 v3, v24

    .line 522
    .line 523
    :goto_1e
    if-eqz v21, :cond_2e

    .line 524
    .line 525
    sget-object v4, Landroidx/compose/material3/SearchBarDefaults;->INSTANCE:Landroidx/compose/material3/SearchBarDefaults;

    .line 526
    .line 527
    invoke-virtual {v4}, Landroidx/compose/material3/SearchBarDefaults;->getTonalElevation-D9Ej5fM()F

    .line 528
    .line 529
    .line 530
    move-result v4

    .line 531
    goto :goto_1f

    .line 532
    :cond_2e
    move/from16 v4, p8

    .line 533
    .line 534
    :goto_1f
    if-eqz v22, :cond_2f

    .line 535
    .line 536
    sget-object v5, Landroidx/compose/material3/SearchBarDefaults;->INSTANCE:Landroidx/compose/material3/SearchBarDefaults;

    .line 537
    .line 538
    invoke-virtual {v5}, Landroidx/compose/material3/SearchBarDefaults;->getShadowElevation-D9Ej5fM()F

    .line 539
    .line 540
    .line 541
    move-result v5

    .line 542
    goto :goto_20

    .line 543
    :cond_2f
    move/from16 v5, p9

    .line 544
    .line 545
    :goto_20
    and-int/lit16 v6, v15, 0x400

    .line 546
    .line 547
    if-eqz v6, :cond_30

    .line 548
    .line 549
    sget-object v6, Landroidx/compose/material3/SearchBarDefaults;->INSTANCE:Landroidx/compose/material3/SearchBarDefaults;

    .line 550
    .line 551
    invoke-virtual {v6, v7, v1}, Landroidx/compose/material3/SearchBarDefaults;->getWindowInsets(Landroidx/compose/runtime/Composer;I)Landroidx/compose/foundation/layout/WindowInsets;

    .line 552
    .line 553
    .line 554
    move-result-object v6

    .line 555
    and-int/lit8 v20, v20, -0xf

    .line 556
    .line 557
    move v9, v3

    .line 558
    move-object v8, v6

    .line 559
    move/from16 v1, v20

    .line 560
    .line 561
    move-object v3, v2

    .line 562
    move v6, v5

    .line 563
    move-object/from16 v2, v23

    .line 564
    .line 565
    move v5, v4

    .line 566
    :goto_21
    move-object/from16 v4, p4

    .line 567
    .line 568
    goto :goto_22

    .line 569
    :cond_30
    move-object/from16 v8, p10

    .line 570
    .line 571
    move v9, v3

    .line 572
    move v6, v5

    .line 573
    move/from16 v1, v20

    .line 574
    .line 575
    move-object v3, v2

    .line 576
    move v5, v4

    .line 577
    move-object/from16 v2, v23

    .line 578
    .line 579
    goto :goto_21

    .line 580
    :goto_22
    invoke-interface {v7}, Landroidx/compose/runtime/Composer;->endDefaults()V

    .line 581
    .line 582
    .line 583
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 584
    .line 585
    .line 586
    move-result v20

    .line 587
    move-object/from16 p4, v4

    .line 588
    .line 589
    if-eqz v20, :cond_31

    .line 590
    .line 591
    const-string/jumbo v4, "androidx.compose.material3.SearchBarImpl (SearchBar.android.kt:867)"

    .line 592
    .line 593
    .line 594
    move-object/from16 p6, v8

    .line 595
    .line 596
    const v8, -0x1a3ef4c1

    .line 597
    .line 598
    .line 599
    invoke-static {v8, v9, v1, v4}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 600
    .line 601
    .line 602
    goto :goto_23

    .line 603
    :cond_31
    move-object/from16 p6, v8

    .line 604
    .line 605
    :goto_23
    invoke-static {}, Landroidx/compose/ui/platform/CompositionLocalsKt;->getLocalDensity()Landroidx/compose/runtime/ProvidableCompositionLocal;

    .line 606
    .line 607
    .line 608
    move-result-object v4

    .line 609
    invoke-interface {v7, v4}, Landroidx/compose/runtime/Composer;->consume(Landroidx/compose/runtime/CompositionLocal;)Ljava/lang/Object;

    .line 610
    .line 611
    .line 612
    move-result-object v4

    .line 613
    check-cast v4, Landroidx/compose/ui/unit/Density;

    .line 614
    .line 615
    sget-object v8, Landroidx/compose/material3/SearchBarDefaults;->INSTANCE:Landroidx/compose/material3/SearchBarDefaults;

    .line 616
    .line 617
    move/from16 v16, v1

    .line 618
    .line 619
    const/4 v1, 0x6

    .line 620
    invoke-virtual {v8, v7, v1}, Landroidx/compose/material3/SearchBarDefaults;->getInputFieldShape(Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/graphics/Shape;

    .line 621
    .line 622
    .line 623
    move-result-object v10

    .line 624
    invoke-virtual {v8, v7, v1}, Landroidx/compose/material3/SearchBarDefaults;->getFullScreenShape(Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/graphics/Shape;

    .line 625
    .line 626
    .line 627
    move-result-object v1

    .line 628
    invoke-interface {v7}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 629
    .line 630
    .line 631
    move-result-object v8

    .line 632
    sget-object v20, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    .line 633
    .line 634
    move-object/from16 p7, v1

    .line 635
    .line 636
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    .line 637
    .line 638
    .line 639
    move-result-object v1

    .line 640
    if-ne v8, v1, :cond_32

    .line 641
    .line 642
    invoke-static {}, Landroidx/compose/runtime/SnapshotStateKt;->structuralEqualityPolicy()Landroidx/compose/runtime/SnapshotMutationPolicy;

    .line 643
    .line 644
    .line 645
    move-result-object v1

    .line 646
    new-instance v8, Landroidx/compose/material3/SearchBar_androidKt$SearchBarImpl$useFullScreenShape$2$1;

    .line 647
    .line 648
    invoke-direct {v8, v0}, Landroidx/compose/material3/SearchBar_androidKt$SearchBarImpl$useFullScreenShape$2$1;-><init>(Landroidx/compose/animation/core/Animatable;)V

    .line 649
    .line 650
    .line 651
    invoke-static {v1, v8}, Landroidx/compose/runtime/SnapshotStateKt;->derivedStateOf(Landroidx/compose/runtime/SnapshotMutationPolicy;Lkotlin/jvm/functions/Function0;)Landroidx/compose/runtime/State;

    .line 652
    .line 653
    .line 654
    move-result-object v8

    .line 655
    invoke-interface {v7, v8}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 656
    .line 657
    .line 658
    :cond_32
    check-cast v8, Landroidx/compose/runtime/State;

    .line 659
    .line 660
    invoke-static {v8}, Landroidx/compose/material3/SearchBar_androidKt;->SearchBarImpl_j1jLAyQ$lambda$9(Landroidx/compose/runtime/State;)Z

    .line 661
    .line 662
    .line 663
    move-result v1

    .line 664
    invoke-interface {v7, v1}, Landroidx/compose/runtime/Composer;->changed(Z)Z

    .line 665
    .line 666
    .line 667
    move-result v1

    .line 668
    const/high16 v21, 0x380000

    .line 669
    .line 670
    and-int v21, v9, v21

    .line 671
    .line 672
    move/from16 p8, v1

    .line 673
    .line 674
    xor-int v1, v21, v17

    .line 675
    .line 676
    move-object/from16 p9, v8

    .line 677
    .line 678
    const/high16 v8, 0x100000

    .line 679
    .line 680
    if-le v1, v8, :cond_33

    .line 681
    .line 682
    invoke-interface {v7, v2}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 683
    .line 684
    .line 685
    move-result v1

    .line 686
    if-nez v1, :cond_34

    .line 687
    .line 688
    :cond_33
    and-int v1, v9, v17

    .line 689
    .line 690
    if-ne v1, v8, :cond_35

    .line 691
    .line 692
    :cond_34
    const/4 v1, 0x1

    .line 693
    goto :goto_24

    .line 694
    :cond_35
    const/4 v1, 0x0

    .line 695
    :goto_24
    or-int v1, p8, v1

    .line 696
    .line 697
    invoke-interface {v7}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 698
    .line 699
    .line 700
    move-result-object v8

    .line 701
    if-nez v1, :cond_36

    .line 702
    .line 703
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    .line 704
    .line 705
    .line 706
    move-result-object v1

    .line 707
    if-ne v8, v1, :cond_39

    .line 708
    .line 709
    :cond_36
    invoke-static {v2, v10}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 710
    .line 711
    .line 712
    move-result v1

    .line 713
    if-eqz v1, :cond_37

    .line 714
    .line 715
    new-instance v1, Landroidx/compose/foundation/shape/GenericShape;

    .line 716
    .line 717
    new-instance v8, Landroidx/compose/material3/SearchBar_androidKt$SearchBarImpl$animatedShape$1$1;

    .line 718
    .line 719
    invoke-direct {v8, v4, v0}, Landroidx/compose/material3/SearchBar_androidKt$SearchBarImpl$animatedShape$1$1;-><init>(Landroidx/compose/ui/unit/Density;Landroidx/compose/animation/core/Animatable;)V

    .line 720
    .line 721
    .line 722
    invoke-direct {v1, v8}, Landroidx/compose/foundation/shape/GenericShape;-><init>(Lkotlin/jvm/functions/Function3;)V

    .line 723
    .line 724
    .line 725
    goto :goto_25

    .line 726
    :cond_37
    invoke-static/range {p9 .. p9}, Landroidx/compose/material3/SearchBar_androidKt;->SearchBarImpl_j1jLAyQ$lambda$9(Landroidx/compose/runtime/State;)Z

    .line 727
    .line 728
    .line 729
    move-result v1

    .line 730
    if-eqz v1, :cond_38

    .line 731
    .line 732
    move-object/from16 v1, p7

    .line 733
    .line 734
    goto :goto_25

    .line 735
    :cond_38
    move-object v1, v2

    .line 736
    :goto_25
    invoke-interface {v7, v1}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 737
    .line 738
    .line 739
    move-object v8, v1

    .line 740
    :cond_39
    check-cast v8, Landroidx/compose/ui/graphics/Shape;

    .line 741
    .line 742
    new-instance v1, Landroidx/compose/material3/SearchBar_androidKt$SearchBarImpl$surface$1;

    .line 743
    .line 744
    invoke-direct {v1, v8, v3, v5, v6}, Landroidx/compose/material3/SearchBar_androidKt$SearchBarImpl$surface$1;-><init>(Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material3/SearchBarColors;FF)V

    .line 745
    .line 746
    .line 747
    const/16 v4, 0x36

    .line 748
    .line 749
    const v8, -0xa2a2596

    .line 750
    .line 751
    .line 752
    const/4 v10, 0x1

    .line 753
    invoke-static {v8, v10, v1, v7, v4}, Landroidx/compose/runtime/internal/ComposableLambdaKt;->rememberComposableLambda(IZLjava/lang/Object;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/internal/ComposableLambda;

    .line 754
    .line 755
    .line 756
    move-result-object v1

    .line 757
    invoke-interface {v7}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 758
    .line 759
    .line 760
    move-result-object v4

    .line 761
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    .line 762
    .line 763
    .line 764
    move-result-object v8

    .line 765
    if-ne v4, v8, :cond_3a

    .line 766
    .line 767
    invoke-static {}, Landroidx/compose/runtime/SnapshotStateKt;->structuralEqualityPolicy()Landroidx/compose/runtime/SnapshotMutationPolicy;

    .line 768
    .line 769
    .line 770
    move-result-object v4

    .line 771
    new-instance v8, Landroidx/compose/material3/SearchBar_androidKt$SearchBarImpl$showContent$2$1;

    .line 772
    .line 773
    invoke-direct {v8, v0}, Landroidx/compose/material3/SearchBar_androidKt$SearchBarImpl$showContent$2$1;-><init>(Landroidx/compose/animation/core/Animatable;)V

    .line 774
    .line 775
    .line 776
    invoke-static {v4, v8}, Landroidx/compose/runtime/SnapshotStateKt;->derivedStateOf(Landroidx/compose/runtime/SnapshotMutationPolicy;Lkotlin/jvm/functions/Function0;)Landroidx/compose/runtime/State;

    .line 777
    .line 778
    .line 779
    move-result-object v4

    .line 780
    invoke-interface {v7, v4}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 781
    .line 782
    .line 783
    :cond_3a
    check-cast v4, Landroidx/compose/runtime/State;

    .line 784
    .line 785
    const v8, -0x5d6998ae

    .line 786
    .line 787
    .line 788
    invoke-interface {v7, v8}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    .line 789
    .line 790
    .line 791
    invoke-static {v4}, Landroidx/compose/material3/SearchBar_androidKt;->SearchBarImpl_j1jLAyQ$lambda$12(Landroidx/compose/runtime/State;)Z

    .line 792
    .line 793
    .line 794
    move-result v4

    .line 795
    if-eqz v4, :cond_3b

    .line 796
    .line 797
    new-instance v4, Landroidx/compose/material3/SearchBar_androidKt$SearchBarImpl$wrappedContent$1;

    .line 798
    .line 799
    invoke-direct {v4, v0, v3, v12}, Landroidx/compose/material3/SearchBar_androidKt$SearchBarImpl$wrappedContent$1;-><init>(Landroidx/compose/animation/core/Animatable;Landroidx/compose/material3/SearchBarColors;Lkotlin/jvm/functions/Function3;)V

    .line 800
    .line 801
    .line 802
    const/16 v8, 0x36

    .line 803
    .line 804
    const v10, 0x8cfeaec

    .line 805
    .line 806
    .line 807
    const/4 v0, 0x1

    .line 808
    invoke-static {v10, v0, v4, v7, v8}, Landroidx/compose/runtime/internal/ComposableLambdaKt;->rememberComposableLambda(IZLjava/lang/Object;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/internal/ComposableLambda;

    .line 809
    .line 810
    .line 811
    move-result-object v0

    .line 812
    :goto_26
    move-object v8, v0

    .line 813
    goto :goto_27

    .line 814
    :cond_3b
    const/4 v0, 0x0

    .line 815
    goto :goto_26

    .line 816
    :goto_27
    invoke-interface {v7}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    .line 817
    .line 818
    .line 819
    sget v0, Landroidx/compose/animation/core/Animatable;->$stable:I

    .line 820
    .line 821
    or-int v0, v0, v19

    .line 822
    .line 823
    and-int/lit8 v4, v9, 0xe

    .line 824
    .line 825
    or-int/2addr v0, v4

    .line 826
    and-int/lit8 v4, v9, 0x70

    .line 827
    .line 828
    or-int/2addr v0, v4

    .line 829
    and-int/lit16 v4, v9, 0x380

    .line 830
    .line 831
    or-int/2addr v0, v4

    .line 832
    and-int/lit16 v4, v9, 0x1c00

    .line 833
    .line 834
    or-int/2addr v0, v4

    .line 835
    const v4, 0xe000

    .line 836
    .line 837
    .line 838
    and-int/2addr v4, v9

    .line 839
    or-int/2addr v0, v4

    .line 840
    shl-int/lit8 v4, v16, 0xf

    .line 841
    .line 842
    const/high16 v10, 0x70000

    .line 843
    .line 844
    and-int/2addr v4, v10

    .line 845
    or-int/2addr v0, v4

    .line 846
    shl-int/lit8 v4, v9, 0x3

    .line 847
    .line 848
    const/high16 v9, 0x380000

    .line 849
    .line 850
    and-int/2addr v4, v9

    .line 851
    or-int v10, v0, v4

    .line 852
    .line 853
    move-object/from16 v0, p0

    .line 854
    .line 855
    move-object/from16 v4, p4

    .line 856
    .line 857
    move-object/from16 v23, v2

    .line 858
    .line 859
    move/from16 v16, v6

    .line 860
    .line 861
    move-object v9, v7

    .line 862
    move-object v2, v11

    .line 863
    move-object/from16 v6, p5

    .line 864
    .line 865
    move-object v7, v1

    .line 866
    move-object v11, v3

    .line 867
    move-object v3, v14

    .line 868
    move-object/from16 v1, p1

    .line 869
    .line 870
    move v14, v5

    .line 871
    move-object/from16 v5, p6

    .line 872
    .line 873
    invoke-static/range {v0 .. v10}, Landroidx/compose/material3/SearchBar_androidKt;->SearchBarLayout(Landroidx/compose/animation/core/Animatable;Landroidx/compose/runtime/MutableFloatState;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/layout/WindowInsets;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V

    .line 874
    .line 875
    .line 876
    move-object v7, v9

    .line 877
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 878
    .line 879
    .line 880
    move-result v0

    .line 881
    if-eqz v0, :cond_3c

    .line 882
    .line 883
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 884
    .line 885
    .line 886
    :cond_3c
    move-object v0, v7

    .line 887
    move-object v8, v11

    .line 888
    move v9, v14

    .line 889
    move/from16 v10, v16

    .line 890
    .line 891
    move-object/from16 v7, v23

    .line 892
    .line 893
    move-object v11, v5

    .line 894
    move-object v5, v4

    .line 895
    :goto_28
    invoke-interface {v0}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    .line 896
    .line 897
    .line 898
    move-result-object v0

    .line 899
    if-eqz v0, :cond_3d

    .line 900
    .line 901
    move-object v1, v0

    .line 902
    new-instance v0, Landroidx/compose/material3/SearchBar_androidKt$SearchBarImpl$1;

    .line 903
    .line 904
    move-object/from16 v2, p1

    .line 905
    .line 906
    move-object/from16 v3, p2

    .line 907
    .line 908
    move-object/from16 v4, p3

    .line 909
    .line 910
    move-object/from16 v6, p5

    .line 911
    .line 912
    move/from16 v14, p14

    .line 913
    .line 914
    move-object/from16 v26, v1

    .line 915
    .line 916
    move-object/from16 v1, p0

    .line 917
    .line 918
    invoke-direct/range {v0 .. v15}, Landroidx/compose/material3/SearchBar_androidKt$SearchBarImpl$1;-><init>(Landroidx/compose/animation/core/Animatable;Landroidx/compose/runtime/MutableFloatState;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material3/SearchBarColors;FFLandroidx/compose/foundation/layout/WindowInsets;Lkotlin/jvm/functions/Function3;III)V

    .line 919
    .line 920
    .line 921
    move-object/from16 v1, v26

    .line 922
    .line 923
    invoke-interface {v1, v0}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lkotlin/jvm/functions/Function2;)V

    .line 924
    .line 925
    .line 926
    :cond_3d
    return-void
.end method

.method private static final SearchBarImpl_j1jLAyQ$lambda$12(Landroidx/compose/runtime/State;)Z
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/runtime/State<",
            "Ljava/lang/Boolean;",
            ">;)Z"
        }
    .end annotation

    .line 1
    invoke-interface {p0}, Landroidx/compose/runtime/State;->getValue()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    check-cast p0, Ljava/lang/Boolean;

    .line 6
    .line 7
    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 8
    .line 9
    .line 10
    move-result p0

    .line 11
    return p0
.end method

.method private static final SearchBarImpl_j1jLAyQ$lambda$9(Landroidx/compose/runtime/State;)Z
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/runtime/State<",
            "Ljava/lang/Boolean;",
            ">;)Z"
        }
    .end annotation

    .line 1
    invoke-interface {p0}, Landroidx/compose/runtime/State;->getValue()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    check-cast p0, Ljava/lang/Boolean;

    .line 6
    .line 7
    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 8
    .line 9
    .line 10
    move-result p0

    .line 11
    return p0
.end method

.method private static final SearchBarLayout(Landroidx/compose/animation/core/Animatable;Landroidx/compose/runtime/MutableFloatState;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/layout/WindowInsets;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V
    .locals 19
    .annotation build Landroidx/compose/runtime/Composable;
    .end annotation

    .annotation build Landroidx/compose/runtime/ComposableInferredTarget;
        scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/animation/core/Animatable<",
            "Ljava/lang/Float;",
            "Landroidx/compose/animation/core/AnimationVector1D;",
            ">;",
            "Landroidx/compose/runtime/MutableFloatState;",
            "Landroidx/compose/runtime/MutableState<",
            "Landroidx/activity/BackEventCompat;",
            ">;",
            "Landroidx/compose/runtime/MutableState<",
            "Landroidx/activity/BackEventCompat;",
            ">;",
            "Landroidx/compose/ui/Modifier;",
            "Landroidx/compose/foundation/layout/WindowInsets;",
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
            "Landroidx/compose/runtime/Composer;",
            "I)V"
        }
    .end annotation

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v6, p4

    .line 4
    .line 5
    move-object/from16 v7, p5

    .line 6
    .line 7
    move-object/from16 v8, p6

    .line 8
    .line 9
    move-object/from16 v9, p7

    .line 10
    .line 11
    move-object/from16 v10, p8

    .line 12
    .line 13
    move/from16 v11, p10

    .line 14
    .line 15
    const v0, 0x42c90fc

    .line 16
    .line 17
    .line 18
    move-object/from16 v2, p9

    .line 19
    .line 20
    invoke-interface {v2, v0}, Landroidx/compose/runtime/Composer;->startRestartGroup(I)Landroidx/compose/runtime/Composer;

    .line 21
    .line 22
    .line 23
    move-result-object v12

    .line 24
    and-int/lit8 v2, v11, 0x6

    .line 25
    .line 26
    if-nez v2, :cond_2

    .line 27
    .line 28
    and-int/lit8 v2, v11, 0x8

    .line 29
    .line 30
    if-nez v2, :cond_0

    .line 31
    .line 32
    invoke-interface {v12, v1}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 33
    .line 34
    .line 35
    move-result v2

    .line 36
    goto :goto_0

    .line 37
    :cond_0
    invoke-interface {v12, v1}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 38
    .line 39
    .line 40
    move-result v2

    .line 41
    :goto_0
    if-eqz v2, :cond_1

    .line 42
    .line 43
    const/4 v2, 0x4

    .line 44
    goto :goto_1

    .line 45
    :cond_1
    const/4 v2, 0x2

    .line 46
    :goto_1
    or-int/2addr v2, v11

    .line 47
    goto :goto_2

    .line 48
    :cond_2
    move v2, v11

    .line 49
    :goto_2
    and-int/lit8 v4, v11, 0x30

    .line 50
    .line 51
    if-nez v4, :cond_4

    .line 52
    .line 53
    move-object/from16 v4, p1

    .line 54
    .line 55
    invoke-interface {v12, v4}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 56
    .line 57
    .line 58
    move-result v13

    .line 59
    if-eqz v13, :cond_3

    .line 60
    .line 61
    const/16 v13, 0x20

    .line 62
    .line 63
    goto :goto_3

    .line 64
    :cond_3
    const/16 v13, 0x10

    .line 65
    .line 66
    :goto_3
    or-int/2addr v2, v13

    .line 67
    goto :goto_4

    .line 68
    :cond_4
    move-object/from16 v4, p1

    .line 69
    .line 70
    :goto_4
    and-int/lit16 v13, v11, 0x180

    .line 71
    .line 72
    if-nez v13, :cond_6

    .line 73
    .line 74
    move-object/from16 v13, p2

    .line 75
    .line 76
    invoke-interface {v12, v13}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 77
    .line 78
    .line 79
    move-result v15

    .line 80
    if-eqz v15, :cond_5

    .line 81
    .line 82
    const/16 v15, 0x100

    .line 83
    .line 84
    goto :goto_5

    .line 85
    :cond_5
    const/16 v15, 0x80

    .line 86
    .line 87
    :goto_5
    or-int/2addr v2, v15

    .line 88
    goto :goto_6

    .line 89
    :cond_6
    move-object/from16 v13, p2

    .line 90
    .line 91
    :goto_6
    and-int/lit16 v15, v11, 0xc00

    .line 92
    .line 93
    if-nez v15, :cond_8

    .line 94
    .line 95
    move-object/from16 v15, p3

    .line 96
    .line 97
    invoke-interface {v12, v15}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 98
    .line 99
    .line 100
    move-result v16

    .line 101
    if-eqz v16, :cond_7

    .line 102
    .line 103
    const/16 v16, 0x800

    .line 104
    .line 105
    goto :goto_7

    .line 106
    :cond_7
    const/16 v16, 0x400

    .line 107
    .line 108
    :goto_7
    or-int v2, v2, v16

    .line 109
    .line 110
    goto :goto_8

    .line 111
    :cond_8
    move-object/from16 v15, p3

    .line 112
    .line 113
    :goto_8
    and-int/lit16 v5, v11, 0x6000

    .line 114
    .line 115
    if-nez v5, :cond_a

    .line 116
    .line 117
    invoke-interface {v12, v6}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 118
    .line 119
    .line 120
    move-result v5

    .line 121
    if-eqz v5, :cond_9

    .line 122
    .line 123
    const/16 v5, 0x4000

    .line 124
    .line 125
    goto :goto_9

    .line 126
    :cond_9
    const/16 v5, 0x2000

    .line 127
    .line 128
    :goto_9
    or-int/2addr v2, v5

    .line 129
    :cond_a
    const/high16 v5, 0x30000

    .line 130
    .line 131
    and-int/2addr v5, v11

    .line 132
    if-nez v5, :cond_c

    .line 133
    .line 134
    invoke-interface {v12, v7}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 135
    .line 136
    .line 137
    move-result v5

    .line 138
    if-eqz v5, :cond_b

    .line 139
    .line 140
    const/high16 v5, 0x20000

    .line 141
    .line 142
    goto :goto_a

    .line 143
    :cond_b
    const/high16 v5, 0x10000

    .line 144
    .line 145
    :goto_a
    or-int/2addr v2, v5

    .line 146
    :cond_c
    const/high16 v5, 0x180000

    .line 147
    .line 148
    and-int/2addr v5, v11

    .line 149
    if-nez v5, :cond_e

    .line 150
    .line 151
    invoke-interface {v12, v8}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 152
    .line 153
    .line 154
    move-result v5

    .line 155
    if-eqz v5, :cond_d

    .line 156
    .line 157
    const/high16 v5, 0x100000

    .line 158
    .line 159
    goto :goto_b

    .line 160
    :cond_d
    const/high16 v5, 0x80000

    .line 161
    .line 162
    :goto_b
    or-int/2addr v2, v5

    .line 163
    :cond_e
    const/high16 v5, 0xc00000

    .line 164
    .line 165
    and-int/2addr v5, v11

    .line 166
    if-nez v5, :cond_10

    .line 167
    .line 168
    invoke-interface {v12, v9}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 169
    .line 170
    .line 171
    move-result v5

    .line 172
    if-eqz v5, :cond_f

    .line 173
    .line 174
    const/high16 v5, 0x800000

    .line 175
    .line 176
    goto :goto_c

    .line 177
    :cond_f
    const/high16 v5, 0x400000

    .line 178
    .line 179
    :goto_c
    or-int/2addr v2, v5

    .line 180
    :cond_10
    const/high16 v5, 0x6000000

    .line 181
    .line 182
    and-int/2addr v5, v11

    .line 183
    if-nez v5, :cond_12

    .line 184
    .line 185
    invoke-interface {v12, v10}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 186
    .line 187
    .line 188
    move-result v5

    .line 189
    if-eqz v5, :cond_11

    .line 190
    .line 191
    const/high16 v5, 0x4000000

    .line 192
    .line 193
    goto :goto_d

    .line 194
    :cond_11
    const/high16 v5, 0x2000000

    .line 195
    .line 196
    :goto_d
    or-int/2addr v2, v5

    .line 197
    :cond_12
    const v5, 0x2492493

    .line 198
    .line 199
    .line 200
    and-int/2addr v5, v2

    .line 201
    const v3, 0x2492492

    .line 202
    .line 203
    .line 204
    if-ne v5, v3, :cond_14

    .line 205
    .line 206
    invoke-interface {v12}, Landroidx/compose/runtime/Composer;->getSkipping()Z

    .line 207
    .line 208
    .line 209
    move-result v3

    .line 210
    if-nez v3, :cond_13

    .line 211
    .line 212
    goto :goto_e

    .line 213
    :cond_13
    invoke-interface {v12}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    .line 214
    .line 215
    .line 216
    goto/16 :goto_1c

    .line 217
    .line 218
    :cond_14
    :goto_e
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 219
    .line 220
    .line 221
    move-result v3

    .line 222
    if-eqz v3, :cond_15

    .line 223
    .line 224
    const/4 v3, -0x1

    .line 225
    const-string/jumbo v5, "androidx.compose.material3.SearchBarLayout (SearchBar.android.kt:941)"

    .line 226
    .line 227
    .line 228
    invoke-static {v0, v2, v3, v5}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 229
    .line 230
    .line 231
    :cond_15
    invoke-interface {v12}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 232
    .line 233
    .line 234
    move-result-object v0

    .line 235
    sget-object v3, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    .line 236
    .line 237
    invoke-virtual {v3}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    .line 238
    .line 239
    .line 240
    move-result-object v5

    .line 241
    const/4 v14, 0x1

    .line 242
    if-ne v0, v5, :cond_16

    .line 243
    .line 244
    new-instance v0, Landroidx/compose/material3/internal/MutableWindowInsets;

    .line 245
    .line 246
    const/4 v5, 0x0

    .line 247
    invoke-direct {v0, v5, v14, v5}, Landroidx/compose/material3/internal/MutableWindowInsets;-><init>(Landroidx/compose/foundation/layout/WindowInsets;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 248
    .line 249
    .line 250
    invoke-interface {v12, v0}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 251
    .line 252
    .line 253
    :cond_16
    check-cast v0, Landroidx/compose/material3/internal/MutableWindowInsets;

    .line 254
    .line 255
    const/high16 v5, 0x3f800000    # 1.0f

    .line 256
    .line 257
    invoke-static {v6, v5}, Landroidx/compose/ui/ZIndexModifierKt;->zIndex(Landroidx/compose/ui/Modifier;F)Landroidx/compose/ui/Modifier;

    .line 258
    .line 259
    .line 260
    move-result-object v5

    .line 261
    const/high16 v18, 0x70000

    .line 262
    .line 263
    and-int v14, v2, v18

    .line 264
    .line 265
    const/high16 v6, 0x20000

    .line 266
    .line 267
    if-ne v14, v6, :cond_17

    .line 268
    .line 269
    const/4 v6, 0x1

    .line 270
    goto :goto_f

    .line 271
    :cond_17
    const/4 v6, 0x0

    .line 272
    :goto_f
    invoke-interface {v12}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 273
    .line 274
    .line 275
    move-result-object v14

    .line 276
    if-nez v6, :cond_18

    .line 277
    .line 278
    invoke-virtual {v3}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    .line 279
    .line 280
    .line 281
    move-result-object v6

    .line 282
    if-ne v14, v6, :cond_19

    .line 283
    .line 284
    :cond_18
    new-instance v14, Landroidx/compose/material3/SearchBar_androidKt$SearchBarLayout$1$1;

    .line 285
    .line 286
    invoke-direct {v14, v0, v7}, Landroidx/compose/material3/SearchBar_androidKt$SearchBarLayout$1$1;-><init>(Landroidx/compose/material3/internal/MutableWindowInsets;Landroidx/compose/foundation/layout/WindowInsets;)V

    .line 287
    .line 288
    .line 289
    invoke-interface {v12, v14}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 290
    .line 291
    .line 292
    :cond_19
    check-cast v14, Lkotlin/jvm/functions/Function1;

    .line 293
    .line 294
    invoke-static {v5, v14}, Landroidx/compose/foundation/layout/WindowInsetsPaddingKt;->onConsumedWindowInsetsChanged(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/Modifier;

    .line 295
    .line 296
    .line 297
    move-result-object v5

    .line 298
    invoke-static {v5, v7}, Landroidx/compose/foundation/layout/WindowInsetsPaddingKt;->consumeWindowInsets(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/layout/WindowInsets;)Landroidx/compose/ui/Modifier;

    .line 299
    .line 300
    .line 301
    move-result-object v6

    .line 302
    and-int/lit8 v5, v2, 0xe

    .line 303
    .line 304
    const/4 v14, 0x4

    .line 305
    if-eq v5, v14, :cond_1b

    .line 306
    .line 307
    and-int/lit8 v5, v2, 0x8

    .line 308
    .line 309
    if-eqz v5, :cond_1a

    .line 310
    .line 311
    invoke-interface {v12, v1}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 312
    .line 313
    .line 314
    move-result v5

    .line 315
    if-eqz v5, :cond_1a

    .line 316
    .line 317
    goto :goto_10

    .line 318
    :cond_1a
    const/4 v5, 0x0

    .line 319
    goto :goto_11

    .line 320
    :cond_1b
    :goto_10
    const/4 v5, 0x1

    .line 321
    :goto_11
    and-int/lit16 v14, v2, 0x1c00

    .line 322
    .line 323
    move-object/from16 v17, v0

    .line 324
    .line 325
    const/16 v0, 0x800

    .line 326
    .line 327
    if-ne v14, v0, :cond_1c

    .line 328
    .line 329
    const/4 v0, 0x1

    .line 330
    goto :goto_12

    .line 331
    :cond_1c
    const/4 v0, 0x0

    .line 332
    :goto_12
    or-int/2addr v0, v5

    .line 333
    and-int/lit8 v5, v2, 0x70

    .line 334
    .line 335
    const/16 v14, 0x20

    .line 336
    .line 337
    if-ne v5, v14, :cond_1d

    .line 338
    .line 339
    const/4 v5, 0x1

    .line 340
    goto :goto_13

    .line 341
    :cond_1d
    const/4 v5, 0x0

    .line 342
    :goto_13
    or-int/2addr v0, v5

    .line 343
    and-int/lit16 v5, v2, 0x380

    .line 344
    .line 345
    const/16 v14, 0x100

    .line 346
    .line 347
    if-ne v5, v14, :cond_1e

    .line 348
    .line 349
    const/4 v5, 0x1

    .line 350
    goto :goto_14

    .line 351
    :cond_1e
    const/4 v5, 0x0

    .line 352
    :goto_14
    or-int/2addr v0, v5

    .line 353
    invoke-interface {v12}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 354
    .line 355
    .line 356
    move-result-object v5

    .line 357
    if-nez v0, :cond_20

    .line 358
    .line 359
    invoke-virtual {v3}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    .line 360
    .line 361
    .line 362
    move-result-object v0

    .line 363
    if-ne v5, v0, :cond_1f

    .line 364
    .line 365
    goto :goto_15

    .line 366
    :cond_1f
    move v13, v2

    .line 367
    goto :goto_16

    .line 368
    :cond_20
    :goto_15
    new-instance v0, Landroidx/compose/material3/SearchBar_androidKt$SearchBarLayout$2$1;

    .line 369
    .line 370
    move-object v5, v13

    .line 371
    move-object v3, v15

    .line 372
    move v13, v2

    .line 373
    move-object/from16 v2, v17

    .line 374
    .line 375
    invoke-direct/range {v0 .. v5}, Landroidx/compose/material3/SearchBar_androidKt$SearchBarLayout$2$1;-><init>(Landroidx/compose/animation/core/Animatable;Landroidx/compose/material3/internal/MutableWindowInsets;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableFloatState;Landroidx/compose/runtime/MutableState;)V

    .line 376
    .line 377
    .line 378
    invoke-interface {v12, v0}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 379
    .line 380
    .line 381
    move-object v5, v0

    .line 382
    :goto_16
    check-cast v5, Landroidx/compose/ui/layout/MeasurePolicy;

    .line 383
    .line 384
    const/4 v0, 0x0

    .line 385
    invoke-static {v12, v0}, Landroidx/compose/runtime/ComposablesKt;->getCurrentCompositeKeyHash(Landroidx/compose/runtime/Composer;I)I

    .line 386
    .line 387
    .line 388
    move-result v1

    .line 389
    invoke-interface {v12}, Landroidx/compose/runtime/Composer;->getCurrentCompositionLocalMap()Landroidx/compose/runtime/CompositionLocalMap;

    .line 390
    .line 391
    .line 392
    move-result-object v0

    .line 393
    invoke-static {v12, v6}, Landroidx/compose/ui/ComposedModifierKt;->materializeModifier(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    .line 394
    .line 395
    .line 396
    move-result-object v2

    .line 397
    sget-object v3, Landroidx/compose/ui/node/ComposeUiNode;->Companion:Landroidx/compose/ui/node/ComposeUiNode$Companion;

    .line 398
    .line 399
    invoke-virtual {v3}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getConstructor()Lkotlin/jvm/functions/Function0;

    .line 400
    .line 401
    .line 402
    move-result-object v4

    .line 403
    invoke-interface {v12}, Landroidx/compose/runtime/Composer;->getApplier()Landroidx/compose/runtime/Applier;

    .line 404
    .line 405
    .line 406
    move-result-object v6

    .line 407
    if-nez v6, :cond_21

    .line 408
    .line 409
    invoke-static {}, Landroidx/compose/runtime/ComposablesKt;->invalidApplier()V

    .line 410
    .line 411
    .line 412
    :cond_21
    invoke-interface {v12}, Landroidx/compose/runtime/Composer;->startReusableNode()V

    .line 413
    .line 414
    .line 415
    invoke-interface {v12}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 416
    .line 417
    .line 418
    move-result v6

    .line 419
    if-eqz v6, :cond_22

    .line 420
    .line 421
    invoke-interface {v12, v4}, Landroidx/compose/runtime/Composer;->createNode(Lkotlin/jvm/functions/Function0;)V

    .line 422
    .line 423
    .line 424
    goto :goto_17

    .line 425
    :cond_22
    invoke-interface {v12}, Landroidx/compose/runtime/Composer;->useNode()V

    .line 426
    .line 427
    .line 428
    :goto_17
    invoke-static {v12}, Landroidx/compose/runtime/Updater;->constructor-impl(Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;

    .line 429
    .line 430
    .line 431
    move-result-object v4

    .line 432
    invoke-virtual {v3}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetMeasurePolicy()Lkotlin/jvm/functions/Function2;

    .line 433
    .line 434
    .line 435
    move-result-object v6

    .line 436
    invoke-static {v4, v5, v6}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 437
    .line 438
    .line 439
    invoke-virtual {v3}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetResolvedCompositionLocals()Lkotlin/jvm/functions/Function2;

    .line 440
    .line 441
    .line 442
    move-result-object v5

    .line 443
    invoke-static {v4, v0, v5}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 444
    .line 445
    .line 446
    invoke-virtual {v3}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetCompositeKeyHash()Lkotlin/jvm/functions/Function2;

    .line 447
    .line 448
    .line 449
    move-result-object v0

    .line 450
    invoke-interface {v4}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 451
    .line 452
    .line 453
    move-result v5

    .line 454
    if-nez v5, :cond_23

    .line 455
    .line 456
    invoke-interface {v4}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 457
    .line 458
    .line 459
    move-result-object v5

    .line 460
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 461
    .line 462
    .line 463
    move-result-object v6

    .line 464
    invoke-static {v5, v6}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 465
    .line 466
    .line 467
    move-result v5

    .line 468
    if-nez v5, :cond_24

    .line 469
    .line 470
    :cond_23
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 471
    .line 472
    .line 473
    move-result-object v5

    .line 474
    invoke-interface {v4, v5}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 475
    .line 476
    .line 477
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 478
    .line 479
    .line 480
    move-result-object v1

    .line 481
    invoke-interface {v4, v1, v0}, Landroidx/compose/runtime/Composer;->apply(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 482
    .line 483
    .line 484
    :cond_24
    invoke-virtual {v3}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetModifier()Lkotlin/jvm/functions/Function2;

    .line 485
    .line 486
    .line 487
    move-result-object v0

    .line 488
    invoke-static {v4, v2, v0}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 489
    .line 490
    .line 491
    sget-object v0, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    .line 492
    .line 493
    const-string v1, "Surface"

    .line 494
    .line 495
    invoke-static {v0, v1}, Landroidx/compose/ui/layout/LayoutIdKt;->layoutId(Landroidx/compose/ui/Modifier;Ljava/lang/Object;)Landroidx/compose/ui/Modifier;

    .line 496
    .line 497
    .line 498
    move-result-object v1

    .line 499
    sget-object v2, Landroidx/compose/ui/Alignment;->Companion:Landroidx/compose/ui/Alignment$Companion;

    .line 500
    .line 501
    invoke-virtual {v2}, Landroidx/compose/ui/Alignment$Companion;->getTopStart()Landroidx/compose/ui/Alignment;

    .line 502
    .line 503
    .line 504
    move-result-object v4

    .line 505
    const/4 v5, 0x1

    .line 506
    invoke-static {v4, v5}, Landroidx/compose/foundation/layout/BoxKt;->maybeCachedBoxMeasurePolicy(Landroidx/compose/ui/Alignment;Z)Landroidx/compose/ui/layout/MeasurePolicy;

    .line 507
    .line 508
    .line 509
    move-result-object v4

    .line 510
    const/4 v5, 0x0

    .line 511
    invoke-static {v12, v5}, Landroidx/compose/runtime/ComposablesKt;->getCurrentCompositeKeyHash(Landroidx/compose/runtime/Composer;I)I

    .line 512
    .line 513
    .line 514
    move-result v6

    .line 515
    invoke-interface {v12}, Landroidx/compose/runtime/Composer;->getCurrentCompositionLocalMap()Landroidx/compose/runtime/CompositionLocalMap;

    .line 516
    .line 517
    .line 518
    move-result-object v5

    .line 519
    invoke-static {v12, v1}, Landroidx/compose/ui/ComposedModifierKt;->materializeModifier(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    .line 520
    .line 521
    .line 522
    move-result-object v1

    .line 523
    invoke-virtual {v3}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getConstructor()Lkotlin/jvm/functions/Function0;

    .line 524
    .line 525
    .line 526
    move-result-object v14

    .line 527
    invoke-interface {v12}, Landroidx/compose/runtime/Composer;->getApplier()Landroidx/compose/runtime/Applier;

    .line 528
    .line 529
    .line 530
    move-result-object v15

    .line 531
    if-nez v15, :cond_25

    .line 532
    .line 533
    invoke-static {}, Landroidx/compose/runtime/ComposablesKt;->invalidApplier()V

    .line 534
    .line 535
    .line 536
    :cond_25
    invoke-interface {v12}, Landroidx/compose/runtime/Composer;->startReusableNode()V

    .line 537
    .line 538
    .line 539
    invoke-interface {v12}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 540
    .line 541
    .line 542
    move-result v15

    .line 543
    if-eqz v15, :cond_26

    .line 544
    .line 545
    invoke-interface {v12, v14}, Landroidx/compose/runtime/Composer;->createNode(Lkotlin/jvm/functions/Function0;)V

    .line 546
    .line 547
    .line 548
    goto :goto_18

    .line 549
    :cond_26
    invoke-interface {v12}, Landroidx/compose/runtime/Composer;->useNode()V

    .line 550
    .line 551
    .line 552
    :goto_18
    invoke-static {v12}, Landroidx/compose/runtime/Updater;->constructor-impl(Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;

    .line 553
    .line 554
    .line 555
    move-result-object v14

    .line 556
    invoke-virtual {v3}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetMeasurePolicy()Lkotlin/jvm/functions/Function2;

    .line 557
    .line 558
    .line 559
    move-result-object v15

    .line 560
    invoke-static {v14, v4, v15}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 561
    .line 562
    .line 563
    invoke-virtual {v3}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetResolvedCompositionLocals()Lkotlin/jvm/functions/Function2;

    .line 564
    .line 565
    .line 566
    move-result-object v4

    .line 567
    invoke-static {v14, v5, v4}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 568
    .line 569
    .line 570
    invoke-virtual {v3}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetCompositeKeyHash()Lkotlin/jvm/functions/Function2;

    .line 571
    .line 572
    .line 573
    move-result-object v4

    .line 574
    invoke-interface {v14}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 575
    .line 576
    .line 577
    move-result v5

    .line 578
    if-nez v5, :cond_27

    .line 579
    .line 580
    invoke-interface {v14}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 581
    .line 582
    .line 583
    move-result-object v5

    .line 584
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 585
    .line 586
    .line 587
    move-result-object v15

    .line 588
    invoke-static {v5, v15}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 589
    .line 590
    .line 591
    move-result v5

    .line 592
    if-nez v5, :cond_28

    .line 593
    .line 594
    :cond_27
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 595
    .line 596
    .line 597
    move-result-object v5

    .line 598
    invoke-interface {v14, v5}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 599
    .line 600
    .line 601
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 602
    .line 603
    .line 604
    move-result-object v5

    .line 605
    invoke-interface {v14, v5, v4}, Landroidx/compose/runtime/Composer;->apply(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 606
    .line 607
    .line 608
    :cond_28
    invoke-virtual {v3}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetModifier()Lkotlin/jvm/functions/Function2;

    .line 609
    .line 610
    .line 611
    move-result-object v4

    .line 612
    invoke-static {v14, v1, v4}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 613
    .line 614
    .line 615
    sget-object v1, Landroidx/compose/foundation/layout/BoxScopeInstance;->INSTANCE:Landroidx/compose/foundation/layout/BoxScopeInstance;

    .line 616
    .line 617
    shr-int/lit8 v1, v13, 0x15

    .line 618
    .line 619
    and-int/lit8 v1, v1, 0xe

    .line 620
    .line 621
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 622
    .line 623
    .line 624
    move-result-object v1

    .line 625
    invoke-interface {v9, v12, v1}, Lkotlin/jvm/functions/Function2;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 626
    .line 627
    .line 628
    invoke-interface {v12}, Landroidx/compose/runtime/Composer;->endNode()V

    .line 629
    .line 630
    .line 631
    const-string v1, "InputField"

    .line 632
    .line 633
    invoke-static {v0, v1}, Landroidx/compose/ui/layout/LayoutIdKt;->layoutId(Landroidx/compose/ui/Modifier;Ljava/lang/Object;)Landroidx/compose/ui/Modifier;

    .line 634
    .line 635
    .line 636
    move-result-object v1

    .line 637
    invoke-virtual {v2}, Landroidx/compose/ui/Alignment$Companion;->getTopStart()Landroidx/compose/ui/Alignment;

    .line 638
    .line 639
    .line 640
    move-result-object v4

    .line 641
    const/4 v5, 0x1

    .line 642
    invoke-static {v4, v5}, Landroidx/compose/foundation/layout/BoxKt;->maybeCachedBoxMeasurePolicy(Landroidx/compose/ui/Alignment;Z)Landroidx/compose/ui/layout/MeasurePolicy;

    .line 643
    .line 644
    .line 645
    move-result-object v4

    .line 646
    const/4 v5, 0x0

    .line 647
    invoke-static {v12, v5}, Landroidx/compose/runtime/ComposablesKt;->getCurrentCompositeKeyHash(Landroidx/compose/runtime/Composer;I)I

    .line 648
    .line 649
    .line 650
    move-result v6

    .line 651
    invoke-interface {v12}, Landroidx/compose/runtime/Composer;->getCurrentCompositionLocalMap()Landroidx/compose/runtime/CompositionLocalMap;

    .line 652
    .line 653
    .line 654
    move-result-object v5

    .line 655
    invoke-static {v12, v1}, Landroidx/compose/ui/ComposedModifierKt;->materializeModifier(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    .line 656
    .line 657
    .line 658
    move-result-object v1

    .line 659
    invoke-virtual {v3}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getConstructor()Lkotlin/jvm/functions/Function0;

    .line 660
    .line 661
    .line 662
    move-result-object v14

    .line 663
    invoke-interface {v12}, Landroidx/compose/runtime/Composer;->getApplier()Landroidx/compose/runtime/Applier;

    .line 664
    .line 665
    .line 666
    move-result-object v15

    .line 667
    if-nez v15, :cond_29

    .line 668
    .line 669
    invoke-static {}, Landroidx/compose/runtime/ComposablesKt;->invalidApplier()V

    .line 670
    .line 671
    .line 672
    :cond_29
    invoke-interface {v12}, Landroidx/compose/runtime/Composer;->startReusableNode()V

    .line 673
    .line 674
    .line 675
    invoke-interface {v12}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 676
    .line 677
    .line 678
    move-result v15

    .line 679
    if-eqz v15, :cond_2a

    .line 680
    .line 681
    invoke-interface {v12, v14}, Landroidx/compose/runtime/Composer;->createNode(Lkotlin/jvm/functions/Function0;)V

    .line 682
    .line 683
    .line 684
    goto :goto_19

    .line 685
    :cond_2a
    invoke-interface {v12}, Landroidx/compose/runtime/Composer;->useNode()V

    .line 686
    .line 687
    .line 688
    :goto_19
    invoke-static {v12}, Landroidx/compose/runtime/Updater;->constructor-impl(Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;

    .line 689
    .line 690
    .line 691
    move-result-object v14

    .line 692
    invoke-virtual {v3}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetMeasurePolicy()Lkotlin/jvm/functions/Function2;

    .line 693
    .line 694
    .line 695
    move-result-object v15

    .line 696
    invoke-static {v14, v4, v15}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 697
    .line 698
    .line 699
    invoke-virtual {v3}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetResolvedCompositionLocals()Lkotlin/jvm/functions/Function2;

    .line 700
    .line 701
    .line 702
    move-result-object v4

    .line 703
    invoke-static {v14, v5, v4}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 704
    .line 705
    .line 706
    invoke-virtual {v3}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetCompositeKeyHash()Lkotlin/jvm/functions/Function2;

    .line 707
    .line 708
    .line 709
    move-result-object v4

    .line 710
    invoke-interface {v14}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 711
    .line 712
    .line 713
    move-result v5

    .line 714
    if-nez v5, :cond_2b

    .line 715
    .line 716
    invoke-interface {v14}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 717
    .line 718
    .line 719
    move-result-object v5

    .line 720
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 721
    .line 722
    .line 723
    move-result-object v15

    .line 724
    invoke-static {v5, v15}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 725
    .line 726
    .line 727
    move-result v5

    .line 728
    if-nez v5, :cond_2c

    .line 729
    .line 730
    :cond_2b
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 731
    .line 732
    .line 733
    move-result-object v5

    .line 734
    invoke-interface {v14, v5}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 735
    .line 736
    .line 737
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 738
    .line 739
    .line 740
    move-result-object v5

    .line 741
    invoke-interface {v14, v5, v4}, Landroidx/compose/runtime/Composer;->apply(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 742
    .line 743
    .line 744
    :cond_2c
    invoke-virtual {v3}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetModifier()Lkotlin/jvm/functions/Function2;

    .line 745
    .line 746
    .line 747
    move-result-object v4

    .line 748
    invoke-static {v14, v1, v4}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 749
    .line 750
    .line 751
    shr-int/lit8 v1, v13, 0x12

    .line 752
    .line 753
    and-int/lit8 v1, v1, 0xe

    .line 754
    .line 755
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 756
    .line 757
    .line 758
    move-result-object v1

    .line 759
    invoke-interface {v8, v12, v1}, Lkotlin/jvm/functions/Function2;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 760
    .line 761
    .line 762
    invoke-interface {v12}, Landroidx/compose/runtime/Composer;->endNode()V

    .line 763
    .line 764
    .line 765
    const v1, -0x41fe4b61

    .line 766
    .line 767
    .line 768
    invoke-interface {v12, v1}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    .line 769
    .line 770
    .line 771
    if-nez v10, :cond_2d

    .line 772
    .line 773
    goto/16 :goto_1b

    .line 774
    .line 775
    :cond_2d
    const-string v1, "Content"

    .line 776
    .line 777
    invoke-static {v0, v1}, Landroidx/compose/ui/layout/LayoutIdKt;->layoutId(Landroidx/compose/ui/Modifier;Ljava/lang/Object;)Landroidx/compose/ui/Modifier;

    .line 778
    .line 779
    .line 780
    move-result-object v0

    .line 781
    invoke-virtual {v2}, Landroidx/compose/ui/Alignment$Companion;->getTopStart()Landroidx/compose/ui/Alignment;

    .line 782
    .line 783
    .line 784
    move-result-object v1

    .line 785
    const/4 v5, 0x1

    .line 786
    invoke-static {v1, v5}, Landroidx/compose/foundation/layout/BoxKt;->maybeCachedBoxMeasurePolicy(Landroidx/compose/ui/Alignment;Z)Landroidx/compose/ui/layout/MeasurePolicy;

    .line 787
    .line 788
    .line 789
    move-result-object v1

    .line 790
    const/4 v5, 0x0

    .line 791
    invoke-static {v12, v5}, Landroidx/compose/runtime/ComposablesKt;->getCurrentCompositeKeyHash(Landroidx/compose/runtime/Composer;I)I

    .line 792
    .line 793
    .line 794
    move-result v2

    .line 795
    invoke-interface {v12}, Landroidx/compose/runtime/Composer;->getCurrentCompositionLocalMap()Landroidx/compose/runtime/CompositionLocalMap;

    .line 796
    .line 797
    .line 798
    move-result-object v4

    .line 799
    invoke-static {v12, v0}, Landroidx/compose/ui/ComposedModifierKt;->materializeModifier(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    .line 800
    .line 801
    .line 802
    move-result-object v0

    .line 803
    invoke-virtual {v3}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getConstructor()Lkotlin/jvm/functions/Function0;

    .line 804
    .line 805
    .line 806
    move-result-object v5

    .line 807
    invoke-interface {v12}, Landroidx/compose/runtime/Composer;->getApplier()Landroidx/compose/runtime/Applier;

    .line 808
    .line 809
    .line 810
    move-result-object v6

    .line 811
    if-nez v6, :cond_2e

    .line 812
    .line 813
    invoke-static {}, Landroidx/compose/runtime/ComposablesKt;->invalidApplier()V

    .line 814
    .line 815
    .line 816
    :cond_2e
    invoke-interface {v12}, Landroidx/compose/runtime/Composer;->startReusableNode()V

    .line 817
    .line 818
    .line 819
    invoke-interface {v12}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 820
    .line 821
    .line 822
    move-result v6

    .line 823
    if-eqz v6, :cond_2f

    .line 824
    .line 825
    invoke-interface {v12, v5}, Landroidx/compose/runtime/Composer;->createNode(Lkotlin/jvm/functions/Function0;)V

    .line 826
    .line 827
    .line 828
    goto :goto_1a

    .line 829
    :cond_2f
    invoke-interface {v12}, Landroidx/compose/runtime/Composer;->useNode()V

    .line 830
    .line 831
    .line 832
    :goto_1a
    invoke-static {v12}, Landroidx/compose/runtime/Updater;->constructor-impl(Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;

    .line 833
    .line 834
    .line 835
    move-result-object v5

    .line 836
    invoke-virtual {v3}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetMeasurePolicy()Lkotlin/jvm/functions/Function2;

    .line 837
    .line 838
    .line 839
    move-result-object v6

    .line 840
    invoke-static {v5, v1, v6}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 841
    .line 842
    .line 843
    invoke-virtual {v3}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetResolvedCompositionLocals()Lkotlin/jvm/functions/Function2;

    .line 844
    .line 845
    .line 846
    move-result-object v1

    .line 847
    invoke-static {v5, v4, v1}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 848
    .line 849
    .line 850
    invoke-virtual {v3}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetCompositeKeyHash()Lkotlin/jvm/functions/Function2;

    .line 851
    .line 852
    .line 853
    move-result-object v1

    .line 854
    invoke-interface {v5}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 855
    .line 856
    .line 857
    move-result v4

    .line 858
    if-nez v4, :cond_30

    .line 859
    .line 860
    invoke-interface {v5}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 861
    .line 862
    .line 863
    move-result-object v4

    .line 864
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 865
    .line 866
    .line 867
    move-result-object v6

    .line 868
    invoke-static {v4, v6}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 869
    .line 870
    .line 871
    move-result v4

    .line 872
    if-nez v4, :cond_31

    .line 873
    .line 874
    :cond_30
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 875
    .line 876
    .line 877
    move-result-object v4

    .line 878
    invoke-interface {v5, v4}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 879
    .line 880
    .line 881
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 882
    .line 883
    .line 884
    move-result-object v2

    .line 885
    invoke-interface {v5, v2, v1}, Landroidx/compose/runtime/Composer;->apply(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 886
    .line 887
    .line 888
    :cond_31
    invoke-virtual {v3}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetModifier()Lkotlin/jvm/functions/Function2;

    .line 889
    .line 890
    .line 891
    move-result-object v1

    .line 892
    invoke-static {v5, v0, v1}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 893
    .line 894
    .line 895
    const/16 v18, 0x0

    .line 896
    .line 897
    invoke-static/range {v18 .. v18}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 898
    .line 899
    .line 900
    move-result-object v0

    .line 901
    invoke-interface {v10, v12, v0}, Lkotlin/jvm/functions/Function2;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 902
    .line 903
    .line 904
    invoke-interface {v12}, Landroidx/compose/runtime/Composer;->endNode()V

    .line 905
    .line 906
    .line 907
    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 908
    .line 909
    :goto_1b
    invoke-interface {v12}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    .line 910
    .line 911
    .line 912
    invoke-interface {v12}, Landroidx/compose/runtime/Composer;->endNode()V

    .line 913
    .line 914
    .line 915
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 916
    .line 917
    .line 918
    move-result v0

    .line 919
    if-eqz v0, :cond_32

    .line 920
    .line 921
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 922
    .line 923
    .line 924
    :cond_32
    :goto_1c
    invoke-interface {v12}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    .line 925
    .line 926
    .line 927
    move-result-object v12

    .line 928
    if-eqz v12, :cond_33

    .line 929
    .line 930
    new-instance v0, Landroidx/compose/material3/SearchBar_androidKt$SearchBarLayout$4;

    .line 931
    .line 932
    move-object/from16 v1, p0

    .line 933
    .line 934
    move-object/from16 v2, p1

    .line 935
    .line 936
    move-object/from16 v3, p2

    .line 937
    .line 938
    move-object/from16 v4, p3

    .line 939
    .line 940
    move-object/from16 v5, p4

    .line 941
    .line 942
    move-object v6, v7

    .line 943
    move-object v7, v8

    .line 944
    move-object v8, v9

    .line 945
    move-object v9, v10

    .line 946
    move v10, v11

    .line 947
    invoke-direct/range {v0 .. v10}, Landroidx/compose/material3/SearchBar_androidKt$SearchBarLayout$4;-><init>(Landroidx/compose/animation/core/Animatable;Landroidx/compose/runtime/MutableFloatState;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/layout/WindowInsets;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;I)V

    .line 948
    .line 949
    .line 950
    invoke-interface {v12, v0}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lkotlin/jvm/functions/Function2;)V

    .line 951
    .line 952
    .line 953
    :cond_33
    return-void
.end method

.method public static final synthetic access$SearchBarLayout(Landroidx/compose/animation/core/Animatable;Landroidx/compose/runtime/MutableFloatState;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/layout/WindowInsets;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V
    .locals 0

    .line 1
    invoke-static/range {p0 .. p10}, Landroidx/compose/material3/SearchBar_androidKt;->SearchBarLayout(Landroidx/compose/animation/core/Animatable;Landroidx/compose/runtime/MutableFloatState;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/layout/WindowInsets;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static final synthetic access$calculatePredictiveBackMultiplier(Landroidx/activity/BackEventCompat;FF)F
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Landroidx/compose/material3/SearchBar_androidKt;->calculatePredictiveBackMultiplier(Landroidx/activity/BackEventCompat;FF)F

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method

.method public static final synthetic access$calculatePredictiveBackOffsetX-rOvwMX4(JILandroidx/activity/BackEventCompat;Landroidx/compose/ui/unit/LayoutDirection;FF)I
    .locals 0

    .line 1
    invoke-static/range {p0 .. p6}, Landroidx/compose/material3/SearchBar_androidKt;->calculatePredictiveBackOffsetX-rOvwMX4(JILandroidx/activity/BackEventCompat;Landroidx/compose/ui/unit/LayoutDirection;FF)I

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method

.method public static final synthetic access$calculatePredictiveBackOffsetY-dzo92Q0(JILandroidx/activity/BackEventCompat;Landroidx/activity/BackEventCompat;IIF)I
    .locals 0

    .line 1
    invoke-static/range {p0 .. p7}, Landroidx/compose/material3/SearchBar_androidKt;->calculatePredictiveBackOffsetY-dzo92Q0(JILandroidx/activity/BackEventCompat;Landroidx/activity/BackEventCompat;IIF)I

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method

.method public static final synthetic access$getAnimationEnterFloatSpec$p()Landroidx/compose/animation/core/FiniteAnimationSpec;
    .locals 1

    .line 1
    sget-object v0, Landroidx/compose/material3/SearchBar_androidKt;->AnimationEnterFloatSpec:Landroidx/compose/animation/core/FiniteAnimationSpec;

    .line 2
    .line 3
    return-object v0
.end method

.method public static final synthetic access$getAnimationExitFloatSpec$p()Landroidx/compose/animation/core/FiniteAnimationSpec;
    .locals 1

    .line 1
    sget-object v0, Landroidx/compose/material3/SearchBar_androidKt;->AnimationExitFloatSpec:Landroidx/compose/animation/core/FiniteAnimationSpec;

    .line 2
    .line 3
    return-object v0
.end method

.method public static final synthetic access$getAnimationPredictiveBackExitFloatSpec$p()Landroidx/compose/animation/core/FiniteAnimationSpec;
    .locals 1

    .line 1
    sget-object v0, Landroidx/compose/material3/SearchBar_androidKt;->AnimationPredictiveBackExitFloatSpec:Landroidx/compose/animation/core/FiniteAnimationSpec;

    .line 2
    .line 3
    return-object v0
.end method

.method public static final synthetic access$getDockedEnterTransition$p()Landroidx/compose/animation/EnterTransition;
    .locals 1

    .line 1
    sget-object v0, Landroidx/compose/material3/SearchBar_androidKt;->DockedEnterTransition:Landroidx/compose/animation/EnterTransition;

    .line 2
    .line 3
    return-object v0
.end method

.method public static final synthetic access$getDockedExitTransition$p()Landroidx/compose/animation/ExitTransition;
    .locals 1

    .line 1
    sget-object v0, Landroidx/compose/material3/SearchBar_androidKt;->DockedExitTransition:Landroidx/compose/animation/ExitTransition;

    .line 2
    .line 3
    return-object v0
.end method

.method public static final synthetic access$getSearchBarCornerRadius$p()F
    .locals 1

    .line 1
    sget v0, Landroidx/compose/material3/SearchBar_androidKt;->SearchBarCornerRadius:F

    .line 2
    .line 3
    return v0
.end method

.method public static final synthetic access$getSearchBarIconOffsetX$p()F
    .locals 1

    .line 1
    sget v0, Landroidx/compose/material3/SearchBar_androidKt;->SearchBarIconOffsetX:F

    .line 2
    .line 3
    return v0
.end method

.method public static final synthetic access$getSearchBarMaxWidth$p()F
    .locals 1

    .line 1
    sget v0, Landroidx/compose/material3/SearchBar_androidKt;->SearchBarMaxWidth:F

    .line 2
    .line 3
    return v0
.end method

.method public static final synthetic access$getSearchBarPredictiveBackMaxOffsetY$p()F
    .locals 1

    .line 1
    sget v0, Landroidx/compose/material3/SearchBar_androidKt;->SearchBarPredictiveBackMaxOffsetY:F

    .line 2
    .line 3
    return v0
.end method

.method public static final synthetic access$getSearchBarPredictiveBackMinMargin$p()F
    .locals 1

    .line 1
    sget v0, Landroidx/compose/material3/SearchBar_androidKt;->SearchBarPredictiveBackMinMargin:F

    .line 2
    .line 3
    return v0
.end method

.method public static final synthetic access$getUnspecifiedTextFieldColors$p()Landroidx/compose/material3/TextFieldColors;
    .locals 1

    .line 1
    sget-object v0, Landroidx/compose/material3/SearchBar_androidKt;->UnspecifiedTextFieldColors:Landroidx/compose/material3/TextFieldColors;

    .line 2
    .line 3
    return-object v0
.end method

.method private static final calculatePredictiveBackMultiplier(Landroidx/activity/BackEventCompat;FF)F
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    if-nez p0, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    invoke-static {p2}, Ljava/lang/Float;->isNaN(F)Z

    .line 6
    .line 7
    .line 8
    move-result p0

    .line 9
    if-eqz p0, :cond_1

    .line 10
    .line 11
    const/high16 p0, 0x3f800000    # 1.0f

    .line 12
    .line 13
    return p0

    .line 14
    :cond_1
    cmpg-float p0, p2, v0

    .line 15
    .line 16
    if-gtz p0, :cond_2

    .line 17
    .line 18
    return v0

    .line 19
    :cond_2
    div-float/2addr p1, p2

    .line 20
    return p1
.end method

.method private static final calculatePredictiveBackOffsetX-rOvwMX4(JILandroidx/activity/BackEventCompat;Landroidx/compose/ui/unit/LayoutDirection;FF)I
    .locals 3

    .line 1
    if-eqz p3, :cond_3

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    cmpg-float v0, p6, v0

    .line 5
    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    goto :goto_1

    .line 9
    :cond_0
    invoke-virtual {p3}, Landroidx/activity/BackEventCompat;->getSwipeEdge()I

    .line 10
    .line 11
    .line 12
    move-result p3

    .line 13
    const/4 v0, -0x1

    .line 14
    const/4 v1, 0x1

    .line 15
    if-nez p3, :cond_1

    .line 16
    .line 17
    move p3, v1

    .line 18
    goto :goto_0

    .line 19
    :cond_1
    move p3, v0

    .line 20
    :goto_0
    sget-object v2, Landroidx/compose/ui/unit/LayoutDirection;->Ltr:Landroidx/compose/ui/unit/LayoutDirection;

    .line 21
    .line 22
    if-ne p4, v2, :cond_2

    .line 23
    .line 24
    move v0, v1

    .line 25
    :cond_2
    invoke-static {p0, p1}, Landroidx/compose/ui/unit/Constraints;->getMaxWidth-impl(J)I

    .line 26
    .line 27
    .line 28
    move-result p0

    .line 29
    int-to-float p0, p0

    .line 30
    const p1, 0x3d4ccccd    # 0.05f

    .line 31
    .line 32
    .line 33
    mul-float/2addr p0, p1

    .line 34
    int-to-float p1, p2

    .line 35
    sub-float/2addr p0, p1

    .line 36
    int-to-float p1, v1

    .line 37
    sub-float/2addr p1, p5

    .line 38
    mul-float/2addr p0, p1

    .line 39
    mul-float/2addr p0, p6

    .line 40
    int-to-float p1, p3

    .line 41
    mul-float/2addr p0, p1

    .line 42
    int-to-float p1, v0

    .line 43
    mul-float/2addr p0, p1

    .line 44
    invoke-static {p0}, Lkotlin/math/MathKt;->roundToInt(F)I

    .line 45
    .line 46
    .line 47
    move-result p0

    .line 48
    return p0

    .line 49
    :cond_3
    :goto_1
    const/4 p0, 0x0

    .line 50
    return p0
.end method

.method private static final calculatePredictiveBackOffsetY-dzo92Q0(JILandroidx/activity/BackEventCompat;Landroidx/activity/BackEventCompat;IIF)I
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    if-eqz p4, :cond_1

    .line 3
    .line 4
    if-eqz p3, :cond_1

    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    cmpg-float v1, p7, v1

    .line 8
    .line 9
    if-nez v1, :cond_0

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    invoke-static {p0, p1}, Landroidx/compose/ui/unit/Constraints;->getMaxHeight-impl(J)I

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    sub-int/2addr v1, p5

    .line 17
    div-int/lit8 v1, v1, 0x2

    .line 18
    .line 19
    sub-int/2addr v1, p2

    .line 20
    invoke-static {v0, v1}, Ljava/lang/Math;->max(II)I

    .line 21
    .line 22
    .line 23
    move-result p2

    .line 24
    invoke-static {p2, p6}, Ljava/lang/Math;->min(II)I

    .line 25
    .line 26
    .line 27
    move-result p2

    .line 28
    invoke-virtual {p3}, Landroidx/activity/BackEventCompat;->getTouchY()F

    .line 29
    .line 30
    .line 31
    move-result p3

    .line 32
    invoke-virtual {p4}, Landroidx/activity/BackEventCompat;->getTouchY()F

    .line 33
    .line 34
    .line 35
    move-result p4

    .line 36
    sub-float/2addr p3, p4

    .line 37
    invoke-static {p3}, Ljava/lang/Math;->abs(F)F

    .line 38
    .line 39
    .line 40
    move-result p4

    .line 41
    invoke-static {p0, p1}, Landroidx/compose/ui/unit/Constraints;->getMaxHeight-impl(J)I

    .line 42
    .line 43
    .line 44
    move-result p0

    .line 45
    int-to-float p0, p0

    .line 46
    div-float/2addr p4, p0

    .line 47
    invoke-static {p3}, Ljava/lang/Math;->signum(F)F

    .line 48
    .line 49
    .line 50
    move-result p0

    .line 51
    invoke-static {v0, p2, p4}, Landroidx/compose/ui/util/MathHelpersKt;->lerp(IIF)I

    .line 52
    .line 53
    .line 54
    move-result p1

    .line 55
    int-to-float p1, p1

    .line 56
    mul-float/2addr p1, p7

    .line 57
    mul-float/2addr p1, p0

    .line 58
    invoke-static {p1}, Lkotlin/math/MathKt;->roundToInt(F)I

    .line 59
    .line 60
    .line 61
    move-result p0

    .line 62
    return p0

    .line 63
    :cond_1
    :goto_0
    return v0
.end method

.method public static final getDockedExpandedTableMinHeight()F
    .locals 1

    .line 1
    sget v0, Landroidx/compose/material3/SearchBar_androidKt;->DockedExpandedTableMinHeight:F

    .line 2
    .line 3
    return v0
.end method

.method private static synthetic getSearchBarCornerRadius$annotations()V
    .locals 0

    return-void
.end method

.method public static final getSearchBarMinWidth()F
    .locals 1

    .line 1
    sget v0, Landroidx/compose/material3/SearchBar_androidKt;->SearchBarMinWidth:F

    .line 2
    .line 3
    return v0
.end method

.method public static final getSearchBarVerticalPadding()F
    .locals 1

    .line 1
    sget v0, Landroidx/compose/material3/SearchBar_androidKt;->SearchBarVerticalPadding:F

    .line 2
    .line 3
    return v0
.end method
