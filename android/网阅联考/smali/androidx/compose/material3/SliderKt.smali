.class public final Landroidx/compose/material3/SliderKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u00ba\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0008\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\u0014\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u000e\n\u0002\u0018\u0002\n\u0002\u0008\u0014\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0000\u001a\u007f\u0010\u0015\u001a\u00020\u00162\u000c\u0010\u0017\u001a\u0008\u0012\u0004\u0012\u00020\u00080\u00182\u0018\u0010\u0019\u001a\u0014\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00080\u0018\u0012\u0004\u0012\u00020\u00160\u001a2\u0008\u0008\u0002\u0010\u001b\u001a\u00020\u00012\u0008\u0008\u0002\u0010\u001c\u001a\u00020\u001d2\u000e\u0008\u0002\u0010\u001e\u001a\u0008\u0012\u0004\u0012\u00020\u00080\u00182\u0008\u0008\u0002\u0010\u001f\u001a\u00020 2\u0010\u0008\u0002\u0010!\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\"2\u0008\u0008\u0002\u0010#\u001a\u00020$H\u0007\u00a2\u0006\u0002\u0010%\u001ae\u0010&\u001a\u00020\u00162\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\'\u001a\u00020\u00082\u0006\u0010(\u001a\u00020\u00082\u0006\u0010)\u001a\u00020*2\u0006\u0010#\u001a\u00020$2\u0006\u0010+\u001a\u00020\u00082\u0006\u0010,\u001a\u00020-2\u0006\u0010.\u001a\u00020-2\u0006\u0010\u001b\u001a\u00020\u00012\u0006\u0010/\u001a\u00020\u00012\u0006\u00100\u001a\u00020\u0001H\u0003\u00a2\u0006\u0002\u00101\u001a\u00b1\u0001\u00102\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00082\u0012\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0008\u0012\u0004\u0012\u00020\u00160\u001a2\u0017\u00103\u001a\u0013\u0012\u0004\u0012\u000204\u0012\u0004\u0012\u00020\u00160\u001a\u00a2\u0006\u0002\u000852\u0008\u0008\u0002\u0010\u001b\u001a\u00020\u00012\u0008\u0008\u0002\u0010\u001c\u001a\u00020\u001d2\u000e\u0008\u0002\u0010\u001e\u001a\u0008\u0012\u0004\u0012\u00020\u00080\u00182\u0008\u0008\u0002\u0010\u001f\u001a\u00020 2\u0010\u0008\u0002\u0010!\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\"2\u0008\u0008\u0002\u0010#\u001a\u00020$2\u0008\u0008\u0002\u00106\u001a\u00020-2\u0019\u0008\u0002\u00107\u001a\u0013\u0012\u0004\u0012\u000204\u0012\u0004\u0012\u00020\u00160\u001a\u00a2\u0006\u0002\u00085H\u0007\u00a2\u0006\u0002\u00108\u001a}\u00102\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00082\u0012\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0008\u0012\u0004\u0012\u00020\u00160\u001a2\u0008\u0008\u0002\u0010\u001b\u001a\u00020\u00012\u0008\u0008\u0002\u0010\u001c\u001a\u00020\u001d2\u000e\u0008\u0002\u0010\u001e\u001a\u0008\u0012\u0004\u0012\u00020\u00080\u00182\u0008\u0008\u0002\u0010\u001f\u001a\u00020 2\u0010\u0008\u0002\u0010!\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\"2\u0008\u0008\u0002\u0010#\u001a\u00020$2\u0008\u0008\u0002\u00106\u001a\u00020-H\u0007\u00a2\u0006\u0002\u00109\u001a\u0096\u0001\u00102\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00082\u0012\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0008\u0012\u0004\u0012\u00020\u00160\u001a2\u0008\u0008\u0002\u0010\u001b\u001a\u00020\u00012\u0008\u0008\u0002\u0010\u001c\u001a\u00020\u001d2\u000e\u0008\u0002\u0010\u001e\u001a\u0008\u0012\u0004\u0012\u00020\u00080\u00182\u0008\u0008\u0002\u0010\u001f\u001a\u00020 2\u0010\u0008\u0002\u0010!\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\"2\u0008\u0008\u0002\u0010#\u001a\u00020$2\u0008\u0008\u0002\u00106\u001a\u00020-2\u0017\u00107\u001a\u0013\u0012\u0004\u0012\u000204\u0012\u0004\u0012\u00020\u00160\u001a\u00a2\u0006\u0002\u00085H\u0007\u00a2\u0006\u0002\u0010:\u001a\u0099\u0001\u0010;\u001a\u00020\u00162\u0006\u0010\u001b\u001a\u00020\u00012\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u00106\u001a\u00020-2\u0012\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0008\u0012\u0004\u0012\u00020\u00160\u001a2\u000e\u0010!\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\"2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010\u0017\u001a\u00020\u00082\u000c\u0010\u001e\u001a\u0008\u0012\u0004\u0012\u00020\u00080\u00182\u0017\u00107\u001a\u0013\u0012\u0004\u0012\u000204\u0012\u0004\u0012\u00020\u00160\u001a\u00a2\u0006\u0002\u000852\u0017\u00103\u001a\u0013\u0012\u0004\u0012\u000204\u0012\u0004\u0012\u00020\u00160\u001a\u00a2\u0006\u0002\u00085H\u0003\u00a2\u0006\u0002\u0010<\u001aU\u0010=\u001a\u00020\u00162\u0006\u0010\u001b\u001a\u00020\u00012\u0006\u0010#\u001a\u00020$2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\'\u001a\u00020\u00082\u0006\u0010(\u001a\u00020\u00082\u0006\u0010)\u001a\u00020*2\u0006\u0010>\u001a\u00020\u00032\u0006\u0010?\u001a\u00020\u0008H\u0003\u00f8\u0001\u0001\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008@\u0010A\u001a1\u0010B\u001a\u00020\u00162\u0006\u0010C\u001a\u00020D2\u0006\u0010E\u001a\u00020\u00082\u0006\u0010F\u001a\u00020\u00082\u0006\u0010G\u001a\u00020\u0008H\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010H\u001a \u0010I\u001a\u00020\u00082\u0006\u0010J\u001a\u00020\u00082\u0006\u0010K\u001a\u00020\u00082\u0006\u0010L\u001a\u00020\u0008H\u0002\u001a0\u0010M\u001a\u00020\u00082\u0006\u0010N\u001a\u00020\u00082\u0006\u0010O\u001a\u00020\u00082\u0006\u0010P\u001a\u00020\u00082\u0006\u0010Q\u001a\u00020\u00082\u0006\u0010R\u001a\u00020\u0008H\u0002\u001a<\u0010M\u001a\u0008\u0012\u0004\u0012\u00020\u00080\u00182\u0006\u0010N\u001a\u00020\u00082\u0006\u0010O\u001a\u00020\u00082\u000c\u0010S\u001a\u0008\u0012\u0004\u0012\u00020\u00080\u00182\u0006\u0010Q\u001a\u00020\u00082\u0006\u0010R\u001a\u00020\u0008H\u0002\u001a(\u0010T\u001a\u00020\u00082\u0006\u0010E\u001a\u00020\u00082\u0006\u0010)\u001a\u00020*2\u0006\u0010U\u001a\u00020\u00082\u0006\u0010V\u001a\u00020\u0008H\u0002\u001a\u0010\u0010W\u001a\u00020*2\u0006\u0010\u001f\u001a\u00020 H\u0002\u001a?\u0010X\u001a\u00020\u0016*\u00020Y2\u0006\u0010Z\u001a\u00020\u00032\u001c\u0010[\u001a\u0018\u0012\u0004\u0012\u00020Y\u0012\u0004\u0012\u00020\u00160\u001a\u00a2\u0006\u0002\u00085\u00a2\u0006\u0002\u0008\\H\u0003\u00f8\u0001\u0001\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008]\u0010^\u001a;\u0010_\u001a\u0010\u0012\u0004\u0012\u00020a\u0012\u0004\u0012\u00020\u0008\u0018\u00010`*\u00020b2\u0006\u0010c\u001a\u00020d2\u0006\u0010e\u001a\u00020fH\u0082@\u00f8\u0001\u0001\u00f8\u0001\u0000\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008g\u0010h\u001a\u0098\u0001\u0010i\u001a\u00020\u0001*\u00020\u00012\u0006\u0010,\u001a\u00020-2\u0006\u0010.\u001a\u00020-2\u000c\u0010j\u001a\u0008\u0012\u0004\u0012\u00020\u00080k2\u000c\u0010l\u001a\u0008\u0012\u0004\u0012\u00020\u00080k2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010m\u001a\u00020\u001d2\u0006\u0010V\u001a\u00020\u00082\u000c\u0010\u001e\u001a\u0008\u0012\u0004\u0012\u00020\u00080\u00182\u0018\u0010n\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u00160\u001a0k2\u001e\u0010o\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u0008\u0012\u0004\u0012\u00020\u00160p0kH\u0002\u001a\\\u0010q\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0017\u001a\u00020\u00082\u0006\u0010\u001c\u001a\u00020\u001d2\u0012\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0008\u0012\u0004\u0012\u00020\u00160\u001a2\u0010\u0008\u0002\u0010!\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\"2\u000e\u0008\u0002\u0010\u001e\u001a\u0008\u0012\u0004\u0012\u00020\u00080\u00182\u0008\u0008\u0002\u0010\u001f\u001a\u00020 H\u0002\u001ad\u0010r\u001a\u00020\u0001*\u00020\u00012\u0006\u0010C\u001a\u00020D2\u0006\u00106\u001a\u00020-2\u0006\u0010V\u001a\u00020 2\u0006\u0010m\u001a\u00020\u001d2\u000c\u0010s\u001a\u0008\u0012\u0004\u0012\u00020\u00080k2\u0012\u0010n\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00160\"0k2\u000c\u0010t\u001a\u0008\u0012\u0004\u0012\u00020\u00080u2\u0006\u0010\u001c\u001a\u00020\u001dH\u0002\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082\u0004\u00a2\u0006\u0002\n\u0000\"\u0013\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00f8\u0001\u0000\u00a2\u0006\u0004\n\u0002\u0010\u0004\"\u0013\u0010\u0005\u001a\u00020\u0003X\u0082\u0004\u00f8\u0001\u0000\u00a2\u0006\u0004\n\u0002\u0010\u0004\"\u0014\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00080\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000\"\u0013\u0010\t\u001a\u00020\u0003X\u0082\u0004\u00f8\u0001\u0000\u00a2\u0006\u0004\n\u0002\u0010\u0004\"\u0013\u0010\n\u001a\u00020\u0003X\u0082\u0004\u00f8\u0001\u0000\u00a2\u0006\u0004\n\u0002\u0010\u0004\"\u0013\u0010\u000b\u001a\u00020\u0003X\u0082\u0004\u00f8\u0001\u0000\u00a2\u0006\u0004\n\u0002\u0010\u0004\"\u0013\u0010\u000c\u001a\u00020\rX\u0082\u0004\u00f8\u0001\u0000\u00a2\u0006\u0004\n\u0002\u0010\u000e\"\u0019\u0010\u000f\u001a\u00020\u0003X\u0080\u0004\u00f8\u0001\u0000\u00a2\u0006\n\n\u0002\u0010\u0004\u001a\u0004\u0008\u0010\u0010\u0011\"\u0013\u0010\u0012\u001a\u00020\u0003X\u0082\u0004\u00f8\u0001\u0000\u00a2\u0006\u0004\n\u0002\u0010\u0004\"\u0019\u0010\u0013\u001a\u00020\u0003X\u0080\u0004\u00f8\u0001\u0000\u00a2\u0006\n\n\u0002\u0010\u0004\u001a\u0004\u0008\u0014\u0010\u0011\u0082\u0002\u000b\n\u0002\u0008\u0019\n\u0005\u0008\u00a1\u001e0\u0001\u00a8\u0006v"
    }
    d2 = {
        "DefaultSliderConstraints",
        "Landroidx/compose/ui/Modifier;",
        "SliderHeight",
        "Landroidx/compose/ui/unit/Dp;",
        "F",
        "SliderMinWidth",
        "SliderToTickAnimation",
        "Landroidx/compose/animation/core/TweenSpec;",
        "",
        "ThumbDefaultElevation",
        "ThumbHeight",
        "ThumbPressedElevation",
        "ThumbSize",
        "Landroidx/compose/ui/unit/DpSize;",
        "J",
        "ThumbWidth",
        "getThumbWidth",
        "()F",
        "TickSize",
        "TrackHeight",
        "getTrackHeight",
        "RangeSlider",
        "",
        "value",
        "Lkotlin/ranges/ClosedFloatingPointRange;",
        "onValueChange",
        "Lkotlin/Function1;",
        "modifier",
        "enabled",
        "",
        "valueRange",
        "steps",
        "",
        "onValueChangeFinished",
        "Lkotlin/Function0;",
        "colors",
        "Landroidx/compose/material3/SliderColors;",
        "(Lkotlin/ranges/ClosedFloatingPointRange;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZLkotlin/ranges/ClosedFloatingPointRange;ILkotlin/jvm/functions/Function0;Landroidx/compose/material3/SliderColors;Landroidx/compose/runtime/Composer;II)V",
        "RangeSliderImpl",
        "positionFractionStart",
        "positionFractionEnd",
        "tickFractions",
        "",
        "width",
        "startInteractionSource",
        "Landroidx/compose/foundation/interaction/MutableInteractionSource;",
        "endInteractionSource",
        "startThumbSemantics",
        "endThumbSemantics",
        "(ZFF[FLandroidx/compose/material3/SliderColors;FLandroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V",
        "Slider",
        "track",
        "Landroidx/compose/material3/SliderPositions;",
        "Landroidx/compose/runtime/Composable;",
        "interactionSource",
        "thumb",
        "(FLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function3;Landroidx/compose/ui/Modifier;ZLkotlin/ranges/ClosedFloatingPointRange;ILkotlin/jvm/functions/Function0;Landroidx/compose/material3/SliderColors;Landroidx/compose/foundation/interaction/MutableInteractionSource;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;III)V",
        "(FLkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZLkotlin/ranges/ClosedFloatingPointRange;ILkotlin/jvm/functions/Function0;Landroidx/compose/material3/SliderColors;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/runtime/Composer;II)V",
        "(FLkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZLkotlin/ranges/ClosedFloatingPointRange;ILkotlin/jvm/functions/Function0;Landroidx/compose/material3/SliderColors;Landroidx/compose/foundation/interaction/MutableInteractionSource;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V",
        "SliderImpl",
        "(Landroidx/compose/ui/Modifier;ZLandroidx/compose/foundation/interaction/MutableInteractionSource;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;IFLkotlin/ranges/ClosedFloatingPointRange;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;I)V",
        "TempRangeSliderTrack",
        "thumbWidth",
        "trackStrokeWidth",
        "TempRangeSliderTrack-au3_HiA",
        "(Landroidx/compose/ui/Modifier;Landroidx/compose/material3/SliderColors;ZFF[FFFLandroidx/compose/runtime/Composer;I)V",
        "animateToTarget",
        "draggableState",
        "Landroidx/compose/foundation/gestures/DraggableState;",
        "current",
        "target",
        "velocity",
        "(Landroidx/compose/foundation/gestures/DraggableState;FFFLkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "calcFraction",
        "a",
        "b",
        "pos",
        "scale",
        "a1",
        "b1",
        "x1",
        "a2",
        "b2",
        "x",
        "snapValueToTick",
        "minPx",
        "maxPx",
        "stepsToTickFractions",
        "TempRangeSliderThumb",
        "Landroidx/compose/foundation/layout/BoxScope;",
        "offset",
        "content",
        "Lkotlin/ExtensionFunctionType;",
        "TempRangeSliderThumb-rAjV9yQ",
        "(Landroidx/compose/foundation/layout/BoxScope;FLkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;I)V",
        "awaitSlop",
        "Lkotlin/Pair;",
        "Landroidx/compose/ui/input/pointer/PointerInputChange;",
        "Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;",
        "id",
        "Landroidx/compose/ui/input/pointer/PointerId;",
        "type",
        "Landroidx/compose/ui/input/pointer/PointerType;",
        "awaitSlop-8vUncbI",
        "(Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;JILkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "rangeSliderPressDragModifier",
        "rawOffsetStart",
        "Landroidx/compose/runtime/State;",
        "rawOffsetEnd",
        "isRtl",
        "gestureEndAction",
        "onDrag",
        "Lkotlin/Function2;",
        "sliderSemantics",
        "sliderTapModifier",
        "rawOffset",
        "pressOffset",
        "Landroidx/compose/runtime/MutableState;",
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
.field private static final DefaultSliderConstraints:Landroidx/compose/ui/Modifier;

.field private static final SliderHeight:F

.field private static final SliderMinWidth:F

.field private static final SliderToTickAnimation:Landroidx/compose/animation/core/TweenSpec;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/compose/animation/core/TweenSpec<",
            "Ljava/lang/Float;",
            ">;"
        }
    .end annotation
.end field

.field private static final ThumbDefaultElevation:F

.field private static final ThumbHeight:F

.field private static final ThumbPressedElevation:F

.field private static final ThumbSize:J

.field private static final ThumbWidth:F

.field private static final TickSize:F

.field private static final TrackHeight:F


# direct methods
.method public static constructor <clinit>()V
    .locals 7

    .line 1
    sget-object v0, Landroidx/compose/material3/tokens/SliderTokens;->INSTANCE:Landroidx/compose/material3/tokens/SliderTokens;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroidx/compose/material3/tokens/SliderTokens;->getHandleWidth-D9Ej5fM()F

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    sput v1, Landroidx/compose/material3/SliderKt;->ThumbWidth:F

    .line 8
    .line 9
    invoke-virtual {v0}, Landroidx/compose/material3/tokens/SliderTokens;->getHandleHeight-D9Ej5fM()F

    .line 10
    .line 11
    .line 12
    move-result v2

    .line 13
    sput v2, Landroidx/compose/material3/SliderKt;->ThumbHeight:F

    .line 14
    .line 15
    invoke-static {v1, v2}, Landroidx/compose/ui/unit/DpKt;->DpSize-YgX7TsA(FF)J

    .line 16
    .line 17
    .line 18
    move-result-wide v1

    .line 19
    sput-wide v1, Landroidx/compose/material3/SliderKt;->ThumbSize:J

    .line 20
    .line 21
    const/4 v1, 0x1

    .line 22
    int-to-float v2, v1

    .line 23
    invoke-static {v2}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 24
    .line 25
    .line 26
    move-result v2

    .line 27
    sput v2, Landroidx/compose/material3/SliderKt;->ThumbDefaultElevation:F

    .line 28
    .line 29
    const/4 v2, 0x6

    .line 30
    int-to-float v2, v2

    .line 31
    invoke-static {v2}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 32
    .line 33
    .line 34
    move-result v2

    .line 35
    sput v2, Landroidx/compose/material3/SliderKt;->ThumbPressedElevation:F

    .line 36
    .line 37
    invoke-virtual {v0}, Landroidx/compose/material3/tokens/SliderTokens;->getTickMarksContainerSize-D9Ej5fM()F

    .line 38
    .line 39
    .line 40
    move-result v2

    .line 41
    sput v2, Landroidx/compose/material3/SliderKt;->TickSize:F

    .line 42
    .line 43
    invoke-virtual {v0}, Landroidx/compose/material3/tokens/SliderTokens;->getInactiveTrackHeight-D9Ej5fM()F

    .line 44
    .line 45
    .line 46
    move-result v0

    .line 47
    sput v0, Landroidx/compose/material3/SliderKt;->TrackHeight:F

    .line 48
    .line 49
    const/16 v0, 0x30

    .line 50
    .line 51
    int-to-float v0, v0

    .line 52
    invoke-static {v0}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 53
    .line 54
    .line 55
    move-result v0

    .line 56
    sput v0, Landroidx/compose/material3/SliderKt;->SliderHeight:F

    .line 57
    .line 58
    const/16 v2, 0x90

    .line 59
    .line 60
    int-to-float v2, v2

    .line 61
    invoke-static {v2}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 62
    .line 63
    .line 64
    move-result v2

    .line 65
    sput v2, Landroidx/compose/material3/SliderKt;->SliderMinWidth:F

    .line 66
    .line 67
    sget-object v3, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    .line 68
    .line 69
    const/4 v4, 0x0

    .line 70
    const/4 v5, 0x2

    .line 71
    const/4 v6, 0x0

    .line 72
    invoke-static {v3, v2, v4, v5, v6}, Landroidx/compose/foundation/layout/SizeKt;->widthIn-VpY3zN4$default(Landroidx/compose/ui/Modifier;FFILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    .line 73
    .line 74
    .line 75
    move-result-object v2

    .line 76
    invoke-static {v2, v4, v0, v1, v6}, Landroidx/compose/foundation/layout/SizeKt;->heightIn-VpY3zN4$default(Landroidx/compose/ui/Modifier;FFILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    .line 77
    .line 78
    .line 79
    move-result-object v0

    .line 80
    sput-object v0, Landroidx/compose/material3/SliderKt;->DefaultSliderConstraints:Landroidx/compose/ui/Modifier;

    .line 81
    .line 82
    new-instance v0, Landroidx/compose/animation/core/TweenSpec;

    .line 83
    .line 84
    const/16 v2, 0x64

    .line 85
    .line 86
    const/4 v3, 0x0

    .line 87
    const/4 v4, 0x0

    .line 88
    const/4 v5, 0x6

    .line 89
    move-object v1, v0

    .line 90
    invoke-direct/range {v1 .. v6}, Landroidx/compose/animation/core/TweenSpec;-><init>(IILandroidx/compose/animation/core/Easing;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 91
    .line 92
    .line 93
    sput-object v0, Landroidx/compose/material3/SliderKt;->SliderToTickAnimation:Landroidx/compose/animation/core/TweenSpec;

    .line 94
    .line 95
    return-void
.end method

.method public static final RangeSlider(Lkotlin/ranges/ClosedFloatingPointRange;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZLkotlin/ranges/ClosedFloatingPointRange;ILkotlin/jvm/functions/Function0;Landroidx/compose/material3/SliderColors;Landroidx/compose/runtime/Composer;II)V
    .locals 41
    .annotation runtime Landroidx/compose/material3/ExperimentalMaterial3Api;
    .end annotation

    .annotation build Landroidx/compose/runtime/Composable;
    .end annotation

    .annotation build Landroidx/compose/runtime/ComposableTarget;
        applier = "androidx.compose.ui.UiComposable"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/ranges/ClosedFloatingPointRange<",
            "Ljava/lang/Float;",
            ">;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Lkotlin/ranges/ClosedFloatingPointRange<",
            "Ljava/lang/Float;",
            ">;",
            "Lkotlin/Unit;",
            ">;",
            "Landroidx/compose/ui/Modifier;",
            "Z",
            "Lkotlin/ranges/ClosedFloatingPointRange<",
            "Ljava/lang/Float;",
            ">;I",
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;",
            "Landroidx/compose/material3/SliderColors;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    .line 1
    move-object/from16 v12, p0

    .line 2
    .line 3
    move-object/from16 v13, p1

    .line 4
    .line 5
    move/from16 v14, p9

    .line 6
    .line 7
    move/from16 v15, p10

    .line 8
    .line 9
    const-string/jumbo v0, "value"

    .line 10
    .line 11
    .line 12
    invoke-static {v12, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    const-string v0, "onValueChange"

    .line 16
    .line 17
    invoke-static {v13, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    const v0, -0x2c4aacd8

    .line 21
    .line 22
    .line 23
    move-object/from16 v1, p8

    .line 24
    .line 25
    invoke-interface {v1, v0}, Landroidx/compose/runtime/Composer;->startRestartGroup(I)Landroidx/compose/runtime/Composer;

    .line 26
    .line 27
    .line 28
    move-result-object v11

    .line 29
    and-int/lit8 v1, v15, 0x1

    .line 30
    .line 31
    if-eqz v1, :cond_0

    .line 32
    .line 33
    or-int/lit8 v1, v14, 0x6

    .line 34
    .line 35
    goto :goto_1

    .line 36
    :cond_0
    and-int/lit8 v1, v14, 0xe

    .line 37
    .line 38
    if-nez v1, :cond_2

    .line 39
    .line 40
    invoke-interface {v11, v12}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 41
    .line 42
    .line 43
    move-result v1

    .line 44
    if-eqz v1, :cond_1

    .line 45
    .line 46
    const/4 v1, 0x4

    .line 47
    goto :goto_0

    .line 48
    :cond_1
    const/4 v1, 0x2

    .line 49
    :goto_0
    or-int/2addr v1, v14

    .line 50
    goto :goto_1

    .line 51
    :cond_2
    move v1, v14

    .line 52
    :goto_1
    and-int/lit8 v3, v15, 0x2

    .line 53
    .line 54
    if-eqz v3, :cond_3

    .line 55
    .line 56
    or-int/lit8 v1, v1, 0x30

    .line 57
    .line 58
    goto :goto_3

    .line 59
    :cond_3
    and-int/lit8 v3, v14, 0x70

    .line 60
    .line 61
    if-nez v3, :cond_5

    .line 62
    .line 63
    invoke-interface {v11, v13}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 64
    .line 65
    .line 66
    move-result v3

    .line 67
    if-eqz v3, :cond_4

    .line 68
    .line 69
    const/16 v3, 0x20

    .line 70
    .line 71
    goto :goto_2

    .line 72
    :cond_4
    const/16 v3, 0x10

    .line 73
    .line 74
    :goto_2
    or-int/2addr v1, v3

    .line 75
    :cond_5
    :goto_3
    and-int/lit8 v3, v15, 0x4

    .line 76
    .line 77
    if-eqz v3, :cond_6

    .line 78
    .line 79
    or-int/lit16 v1, v1, 0x180

    .line 80
    .line 81
    goto :goto_5

    .line 82
    :cond_6
    and-int/lit16 v4, v14, 0x380

    .line 83
    .line 84
    if-nez v4, :cond_8

    .line 85
    .line 86
    move-object/from16 v4, p2

    .line 87
    .line 88
    invoke-interface {v11, v4}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 89
    .line 90
    .line 91
    move-result v5

    .line 92
    if-eqz v5, :cond_7

    .line 93
    .line 94
    const/16 v5, 0x100

    .line 95
    .line 96
    goto :goto_4

    .line 97
    :cond_7
    const/16 v5, 0x80

    .line 98
    .line 99
    :goto_4
    or-int/2addr v1, v5

    .line 100
    goto :goto_6

    .line 101
    :cond_8
    :goto_5
    move-object/from16 v4, p2

    .line 102
    .line 103
    :goto_6
    and-int/lit8 v5, v15, 0x8

    .line 104
    .line 105
    if-eqz v5, :cond_9

    .line 106
    .line 107
    or-int/lit16 v1, v1, 0xc00

    .line 108
    .line 109
    goto :goto_8

    .line 110
    :cond_9
    and-int/lit16 v6, v14, 0x1c00

    .line 111
    .line 112
    if-nez v6, :cond_b

    .line 113
    .line 114
    move/from16 v6, p3

    .line 115
    .line 116
    invoke-interface {v11, v6}, Landroidx/compose/runtime/Composer;->changed(Z)Z

    .line 117
    .line 118
    .line 119
    move-result v7

    .line 120
    if-eqz v7, :cond_a

    .line 121
    .line 122
    const/16 v7, 0x800

    .line 123
    .line 124
    goto :goto_7

    .line 125
    :cond_a
    const/16 v7, 0x400

    .line 126
    .line 127
    :goto_7
    or-int/2addr v1, v7

    .line 128
    goto :goto_9

    .line 129
    :cond_b
    :goto_8
    move/from16 v6, p3

    .line 130
    .line 131
    :goto_9
    const v7, 0xe000

    .line 132
    .line 133
    .line 134
    and-int/2addr v7, v14

    .line 135
    if-nez v7, :cond_e

    .line 136
    .line 137
    and-int/lit8 v7, v15, 0x10

    .line 138
    .line 139
    if-nez v7, :cond_c

    .line 140
    .line 141
    move-object/from16 v7, p4

    .line 142
    .line 143
    invoke-interface {v11, v7}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 144
    .line 145
    .line 146
    move-result v8

    .line 147
    if-eqz v8, :cond_d

    .line 148
    .line 149
    const/16 v8, 0x4000

    .line 150
    .line 151
    goto :goto_a

    .line 152
    :cond_c
    move-object/from16 v7, p4

    .line 153
    .line 154
    :cond_d
    const/16 v8, 0x2000

    .line 155
    .line 156
    :goto_a
    or-int/2addr v1, v8

    .line 157
    goto :goto_b

    .line 158
    :cond_e
    move-object/from16 v7, p4

    .line 159
    .line 160
    :goto_b
    and-int/lit8 v8, v15, 0x20

    .line 161
    .line 162
    if-eqz v8, :cond_f

    .line 163
    .line 164
    const/high16 v9, 0x30000

    .line 165
    .line 166
    or-int/2addr v1, v9

    .line 167
    goto :goto_d

    .line 168
    :cond_f
    const/high16 v9, 0x70000

    .line 169
    .line 170
    and-int/2addr v9, v14

    .line 171
    if-nez v9, :cond_11

    .line 172
    .line 173
    move/from16 v9, p5

    .line 174
    .line 175
    invoke-interface {v11, v9}, Landroidx/compose/runtime/Composer;->changed(I)Z

    .line 176
    .line 177
    .line 178
    move-result v10

    .line 179
    if-eqz v10, :cond_10

    .line 180
    .line 181
    const/high16 v10, 0x20000

    .line 182
    .line 183
    goto :goto_c

    .line 184
    :cond_10
    const/high16 v10, 0x10000

    .line 185
    .line 186
    :goto_c
    or-int/2addr v1, v10

    .line 187
    goto :goto_e

    .line 188
    :cond_11
    :goto_d
    move/from16 v9, p5

    .line 189
    .line 190
    :goto_e
    and-int/lit8 v10, v15, 0x40

    .line 191
    .line 192
    if-eqz v10, :cond_12

    .line 193
    .line 194
    const/high16 v16, 0x180000

    .line 195
    .line 196
    or-int v1, v1, v16

    .line 197
    .line 198
    move-object/from16 v2, p6

    .line 199
    .line 200
    goto :goto_10

    .line 201
    :cond_12
    const/high16 v16, 0x380000

    .line 202
    .line 203
    and-int v16, v14, v16

    .line 204
    .line 205
    move-object/from16 v2, p6

    .line 206
    .line 207
    if-nez v16, :cond_14

    .line 208
    .line 209
    invoke-interface {v11, v2}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 210
    .line 211
    .line 212
    move-result v16

    .line 213
    if-eqz v16, :cond_13

    .line 214
    .line 215
    const/high16 v16, 0x100000

    .line 216
    .line 217
    goto :goto_f

    .line 218
    :cond_13
    const/high16 v16, 0x80000

    .line 219
    .line 220
    :goto_f
    or-int v1, v1, v16

    .line 221
    .line 222
    :cond_14
    :goto_10
    const/high16 v16, 0x1c00000

    .line 223
    .line 224
    and-int v16, v14, v16

    .line 225
    .line 226
    if-nez v16, :cond_17

    .line 227
    .line 228
    and-int/lit16 v0, v15, 0x80

    .line 229
    .line 230
    if-nez v0, :cond_15

    .line 231
    .line 232
    move-object/from16 v0, p7

    .line 233
    .line 234
    invoke-interface {v11, v0}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 235
    .line 236
    .line 237
    move-result v16

    .line 238
    if-eqz v16, :cond_16

    .line 239
    .line 240
    const/high16 v16, 0x800000

    .line 241
    .line 242
    goto :goto_11

    .line 243
    :cond_15
    move-object/from16 v0, p7

    .line 244
    .line 245
    :cond_16
    const/high16 v16, 0x400000

    .line 246
    .line 247
    :goto_11
    or-int v1, v1, v16

    .line 248
    .line 249
    goto :goto_12

    .line 250
    :cond_17
    move-object/from16 v0, p7

    .line 251
    .line 252
    :goto_12
    const v16, 0x16db6db

    .line 253
    .line 254
    .line 255
    and-int v0, v1, v16

    .line 256
    .line 257
    const v2, 0x492492

    .line 258
    .line 259
    .line 260
    if-ne v0, v2, :cond_19

    .line 261
    .line 262
    invoke-interface {v11}, Landroidx/compose/runtime/Composer;->getSkipping()Z

    .line 263
    .line 264
    .line 265
    move-result v0

    .line 266
    if-nez v0, :cond_18

    .line 267
    .line 268
    goto :goto_13

    .line 269
    :cond_18
    invoke-interface {v11}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    .line 270
    .line 271
    .line 272
    move-object/from16 v8, p7

    .line 273
    .line 274
    move-object v3, v4

    .line 275
    move v4, v6

    .line 276
    move-object v5, v7

    .line 277
    move v6, v9

    .line 278
    move-object v14, v11

    .line 279
    move-object/from16 v7, p6

    .line 280
    .line 281
    goto/16 :goto_1b

    .line 282
    .line 283
    :cond_19
    :goto_13
    invoke-interface {v11}, Landroidx/compose/runtime/Composer;->startDefaults()V

    .line 284
    .line 285
    .line 286
    and-int/lit8 v0, v14, 0x1

    .line 287
    .line 288
    const v16, -0xe001

    .line 289
    .line 290
    .line 291
    const/4 v2, 0x1

    .line 292
    if-eqz v0, :cond_1d

    .line 293
    .line 294
    invoke-interface {v11}, Landroidx/compose/runtime/Composer;->getDefaultsInvalid()Z

    .line 295
    .line 296
    .line 297
    move-result v0

    .line 298
    if-eqz v0, :cond_1a

    .line 299
    .line 300
    goto :goto_15

    .line 301
    :cond_1a
    invoke-interface {v11}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    .line 302
    .line 303
    .line 304
    and-int/lit8 v0, v15, 0x10

    .line 305
    .line 306
    if-eqz v0, :cond_1b

    .line 307
    .line 308
    and-int v1, v1, v16

    .line 309
    .line 310
    :cond_1b
    and-int/lit16 v0, v15, 0x80

    .line 311
    .line 312
    if-eqz v0, :cond_1c

    .line 313
    .line 314
    const v0, -0x1c00001

    .line 315
    .line 316
    .line 317
    and-int/2addr v0, v1

    .line 318
    move-object/from16 v20, p6

    .line 319
    .line 320
    move-object/from16 v21, p7

    .line 321
    .line 322
    move v3, v0

    .line 323
    goto :goto_14

    .line 324
    :cond_1c
    move-object/from16 v20, p6

    .line 325
    .line 326
    move-object/from16 v21, p7

    .line 327
    .line 328
    move v3, v1

    .line 329
    :goto_14
    move-object/from16 v16, v4

    .line 330
    .line 331
    move/from16 v17, v6

    .line 332
    .line 333
    move-object/from16 v18, v7

    .line 334
    .line 335
    move/from16 v19, v9

    .line 336
    .line 337
    goto/16 :goto_19

    .line 338
    .line 339
    :cond_1d
    :goto_15
    if-eqz v3, :cond_1e

    .line 340
    .line 341
    sget-object v0, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    .line 342
    .line 343
    goto :goto_16

    .line 344
    :cond_1e
    move-object v0, v4

    .line 345
    :goto_16
    if-eqz v5, :cond_1f

    .line 346
    .line 347
    move v6, v2

    .line 348
    :cond_1f
    and-int/lit8 v3, v15, 0x10

    .line 349
    .line 350
    if-eqz v3, :cond_20

    .line 351
    .line 352
    const/4 v3, 0x0

    .line 353
    const/high16 v4, 0x3f800000    # 1.0f

    .line 354
    .line 355
    invoke-static {v3, v4}, Lkotlin/ranges/RangesKt;->rangeTo(FF)Lkotlin/ranges/ClosedFloatingPointRange;

    .line 356
    .line 357
    .line 358
    move-result-object v3

    .line 359
    and-int v1, v1, v16

    .line 360
    .line 361
    move-object v7, v3

    .line 362
    :cond_20
    if-eqz v8, :cond_21

    .line 363
    .line 364
    const/4 v9, 0x0

    .line 365
    :cond_21
    if-eqz v10, :cond_22

    .line 366
    .line 367
    const/4 v3, 0x0

    .line 368
    goto :goto_17

    .line 369
    :cond_22
    move-object/from16 v3, p6

    .line 370
    .line 371
    :goto_17
    and-int/lit16 v4, v15, 0x80

    .line 372
    .line 373
    if-eqz v4, :cond_23

    .line 374
    .line 375
    sget-object v16, Landroidx/compose/material3/SliderDefaults;->INSTANCE:Landroidx/compose/material3/SliderDefaults;

    .line 376
    .line 377
    const-wide/16 v17, 0x0

    .line 378
    .line 379
    const-wide/16 v19, 0x0

    .line 380
    .line 381
    const-wide/16 v21, 0x0

    .line 382
    .line 383
    const-wide/16 v23, 0x0

    .line 384
    .line 385
    const-wide/16 v25, 0x0

    .line 386
    .line 387
    const-wide/16 v27, 0x0

    .line 388
    .line 389
    const-wide/16 v29, 0x0

    .line 390
    .line 391
    const-wide/16 v31, 0x0

    .line 392
    .line 393
    const-wide/16 v33, 0x0

    .line 394
    .line 395
    const-wide/16 v35, 0x0

    .line 396
    .line 397
    const/16 v38, 0x0

    .line 398
    .line 399
    const/16 v39, 0x6

    .line 400
    .line 401
    const/16 v40, 0x3ff

    .line 402
    .line 403
    move-object/from16 v37, v11

    .line 404
    .line 405
    invoke-virtual/range {v16 .. v40}, Landroidx/compose/material3/SliderDefaults;->colors-q0g_0yA(JJJJJJJJJJLandroidx/compose/runtime/Composer;III)Landroidx/compose/material3/SliderColors;

    .line 406
    .line 407
    .line 408
    move-result-object v4

    .line 409
    const v5, -0x1c00001

    .line 410
    .line 411
    .line 412
    and-int/2addr v1, v5

    .line 413
    move-object/from16 v16, v0

    .line 414
    .line 415
    move-object/from16 v20, v3

    .line 416
    .line 417
    move-object/from16 v21, v4

    .line 418
    .line 419
    goto :goto_18

    .line 420
    :cond_23
    move-object/from16 v21, p7

    .line 421
    .line 422
    move-object/from16 v16, v0

    .line 423
    .line 424
    move-object/from16 v20, v3

    .line 425
    .line 426
    :goto_18
    move/from16 v17, v6

    .line 427
    .line 428
    move-object/from16 v18, v7

    .line 429
    .line 430
    move/from16 v19, v9

    .line 431
    .line 432
    move v3, v1

    .line 433
    :goto_19
    invoke-interface {v11}, Landroidx/compose/runtime/Composer;->endDefaults()V

    .line 434
    .line 435
    .line 436
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 437
    .line 438
    .line 439
    move-result v0

    .line 440
    if-eqz v0, :cond_24

    .line 441
    .line 442
    const/4 v0, -0x1

    .line 443
    const-string v1, "androidx.compose.material3.RangeSlider (Slider.kt:384)"

    .line 444
    .line 445
    const v4, -0x2c4aacd8

    .line 446
    .line 447
    .line 448
    invoke-static {v4, v3, v0, v1}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 449
    .line 450
    .line 451
    :cond_24
    const v0, -0x1d58f75c

    .line 452
    .line 453
    .line 454
    invoke-interface {v11, v0}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 455
    .line 456
    .line 457
    invoke-interface {v11}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 458
    .line 459
    .line 460
    move-result-object v1

    .line 461
    sget-object v4, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    .line 462
    .line 463
    invoke-virtual {v4}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    .line 464
    .line 465
    .line 466
    move-result-object v5

    .line 467
    if-ne v1, v5, :cond_25

    .line 468
    .line 469
    invoke-static {}, Landroidx/compose/foundation/interaction/InteractionSourceKt;->MutableInteractionSource()Landroidx/compose/foundation/interaction/MutableInteractionSource;

    .line 470
    .line 471
    .line 472
    move-result-object v1

    .line 473
    invoke-interface {v11, v1}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 474
    .line 475
    .line 476
    :cond_25
    invoke-interface {v11}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 477
    .line 478
    .line 479
    move-object v5, v1

    .line 480
    check-cast v5, Landroidx/compose/foundation/interaction/MutableInteractionSource;

    .line 481
    .line 482
    invoke-interface {v11, v0}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 483
    .line 484
    .line 485
    invoke-interface {v11}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 486
    .line 487
    .line 488
    move-result-object v0

    .line 489
    invoke-virtual {v4}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    .line 490
    .line 491
    .line 492
    move-result-object v1

    .line 493
    if-ne v0, v1, :cond_26

    .line 494
    .line 495
    invoke-static {}, Landroidx/compose/foundation/interaction/InteractionSourceKt;->MutableInteractionSource()Landroidx/compose/foundation/interaction/MutableInteractionSource;

    .line 496
    .line 497
    .line 498
    move-result-object v0

    .line 499
    invoke-interface {v11, v0}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 500
    .line 501
    .line 502
    :cond_26
    invoke-interface {v11}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 503
    .line 504
    .line 505
    move-object v6, v0

    .line 506
    check-cast v6, Landroidx/compose/foundation/interaction/MutableInteractionSource;

    .line 507
    .line 508
    if-ltz v19, :cond_27

    .line 509
    .line 510
    move v0, v2

    .line 511
    goto :goto_1a

    .line 512
    :cond_27
    const/4 v0, 0x0

    .line 513
    :goto_1a
    if-eqz v0, :cond_2e

    .line 514
    .line 515
    const v0, 0x1e7b2b64

    .line 516
    .line 517
    .line 518
    invoke-interface {v11, v0}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 519
    .line 520
    .line 521
    invoke-interface {v11, v12}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 522
    .line 523
    .line 524
    move-result v0

    .line 525
    invoke-interface {v11, v13}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 526
    .line 527
    .line 528
    move-result v1

    .line 529
    or-int/2addr v0, v1

    .line 530
    invoke-interface {v11}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 531
    .line 532
    .line 533
    move-result-object v1

    .line 534
    if-nez v0, :cond_28

    .line 535
    .line 536
    invoke-virtual {v4}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    .line 537
    .line 538
    .line 539
    move-result-object v0

    .line 540
    if-ne v1, v0, :cond_29

    .line 541
    .line 542
    :cond_28
    new-instance v1, Landroidx/compose/material3/SliderKt$RangeSlider$onValueChangeState$1$1;

    .line 543
    .line 544
    invoke-direct {v1, v12, v13}, Landroidx/compose/material3/SliderKt$RangeSlider$onValueChangeState$1$1;-><init>(Lkotlin/ranges/ClosedFloatingPointRange;Lkotlin/jvm/functions/Function1;)V

    .line 545
    .line 546
    .line 547
    invoke-interface {v11, v1}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 548
    .line 549
    .line 550
    :cond_29
    invoke-interface {v11}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 551
    .line 552
    .line 553
    const/4 v0, 0x0

    .line 554
    invoke-static {v1, v11, v0}, Landroidx/compose/runtime/SnapshotStateKt;->rememberUpdatedState(Ljava/lang/Object;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;

    .line 555
    .line 556
    .line 557
    move-result-object v9

    .line 558
    invoke-static/range {v19 .. v19}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 559
    .line 560
    .line 561
    move-result-object v0

    .line 562
    const v1, 0x44faf204

    .line 563
    .line 564
    .line 565
    invoke-interface {v11, v1}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 566
    .line 567
    .line 568
    invoke-interface {v11, v0}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 569
    .line 570
    .line 571
    move-result v0

    .line 572
    invoke-interface {v11}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 573
    .line 574
    .line 575
    move-result-object v1

    .line 576
    if-nez v0, :cond_2a

    .line 577
    .line 578
    invoke-virtual {v4}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    .line 579
    .line 580
    .line 581
    move-result-object v0

    .line 582
    if-ne v1, v0, :cond_2b

    .line 583
    .line 584
    :cond_2a
    invoke-static/range {v19 .. v19}, Landroidx/compose/material3/SliderKt;->access$stepsToTickFractions(I)[F

    .line 585
    .line 586
    .line 587
    move-result-object v1

    .line 588
    invoke-interface {v11, v1}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 589
    .line 590
    .line 591
    :cond_2b
    invoke-interface {v11}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 592
    .line 593
    .line 594
    move-object v10, v1

    .line 595
    check-cast v10, [F

    .line 596
    .line 597
    invoke-static/range {v16 .. v16}, Landroidx/compose/material3/TouchTargetKt;->minimumTouchTargetSize(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    .line 598
    .line 599
    .line 600
    move-result-object v22

    .line 601
    sget v0, Landroidx/compose/material3/SliderKt;->ThumbWidth:F

    .line 602
    .line 603
    const/4 v1, 0x2

    .line 604
    int-to-float v1, v1

    .line 605
    mul-float/2addr v0, v1

    .line 606
    invoke-static {v0}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 607
    .line 608
    .line 609
    move-result v23

    .line 610
    sget v0, Landroidx/compose/material3/SliderKt;->ThumbHeight:F

    .line 611
    .line 612
    mul-float/2addr v0, v1

    .line 613
    invoke-static {v0}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 614
    .line 615
    .line 616
    move-result v24

    .line 617
    const/16 v25, 0x0

    .line 618
    .line 619
    const/16 v26, 0x0

    .line 620
    .line 621
    const/16 v27, 0xc

    .line 622
    .line 623
    const/16 v28, 0x0

    .line 624
    .line 625
    invoke-static/range {v22 .. v28}, Landroidx/compose/foundation/layout/SizeKt;->requiredSizeIn-qDBjuR0$default(Landroidx/compose/ui/Modifier;FFFFILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    .line 626
    .line 627
    .line 628
    move-result-object v22

    .line 629
    const/16 v23, 0x0

    .line 630
    .line 631
    const/16 v24, 0x0

    .line 632
    .line 633
    new-instance v8, Landroidx/compose/material3/SliderKt$RangeSlider$2;

    .line 634
    .line 635
    move-object v0, v8

    .line 636
    move-object/from16 v1, v20

    .line 637
    .line 638
    move v7, v2

    .line 639
    move v2, v3

    .line 640
    move-object v3, v5

    .line 641
    move-object v4, v6

    .line 642
    move/from16 v5, v17

    .line 643
    .line 644
    move-object/from16 v6, v18

    .line 645
    .line 646
    move v12, v7

    .line 647
    move-object/from16 v7, p0

    .line 648
    .line 649
    move-object v13, v8

    .line 650
    move/from16 v8, v19

    .line 651
    .line 652
    move-object v14, v11

    .line 653
    move-object/from16 v11, v21

    .line 654
    .line 655
    invoke-direct/range {v0 .. v11}, Landroidx/compose/material3/SliderKt$RangeSlider$2;-><init>(Lkotlin/jvm/functions/Function0;ILandroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/foundation/interaction/MutableInteractionSource;ZLkotlin/ranges/ClosedFloatingPointRange;Lkotlin/ranges/ClosedFloatingPointRange;ILandroidx/compose/runtime/State;[FLandroidx/compose/material3/SliderColors;)V

    .line 656
    .line 657
    .line 658
    const v0, -0x3b0b756e

    .line 659
    .line 660
    .line 661
    invoke-static {v14, v0, v12, v13}, Landroidx/compose/runtime/internal/ComposableLambdaKt;->composableLambda(Landroidx/compose/runtime/Composer;IZLjava/lang/Object;)Landroidx/compose/runtime/internal/ComposableLambda;

    .line 662
    .line 663
    .line 664
    move-result-object v0

    .line 665
    const/16 v1, 0xc00

    .line 666
    .line 667
    const/4 v2, 0x6

    .line 668
    move-object/from16 p2, v22

    .line 669
    .line 670
    move-object/from16 p3, v23

    .line 671
    .line 672
    move/from16 p4, v24

    .line 673
    .line 674
    move-object/from16 p5, v0

    .line 675
    .line 676
    move-object/from16 p6, v14

    .line 677
    .line 678
    move/from16 p7, v1

    .line 679
    .line 680
    move/from16 p8, v2

    .line 681
    .line 682
    invoke-static/range {p2 .. p8}, Landroidx/compose/foundation/layout/BoxWithConstraintsKt;->BoxWithConstraints(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/Alignment;ZLkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V

    .line 683
    .line 684
    .line 685
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 686
    .line 687
    .line 688
    move-result v0

    .line 689
    if-eqz v0, :cond_2c

    .line 690
    .line 691
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 692
    .line 693
    .line 694
    :cond_2c
    move-object/from16 v3, v16

    .line 695
    .line 696
    move/from16 v4, v17

    .line 697
    .line 698
    move-object/from16 v5, v18

    .line 699
    .line 700
    move/from16 v6, v19

    .line 701
    .line 702
    move-object/from16 v7, v20

    .line 703
    .line 704
    move-object/from16 v8, v21

    .line 705
    .line 706
    :goto_1b
    invoke-interface {v14}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    .line 707
    .line 708
    .line 709
    move-result-object v11

    .line 710
    if-nez v11, :cond_2d

    .line 711
    .line 712
    goto :goto_1c

    .line 713
    :cond_2d
    new-instance v12, Landroidx/compose/material3/SliderKt$RangeSlider$3;

    .line 714
    .line 715
    move-object v0, v12

    .line 716
    move-object/from16 v1, p0

    .line 717
    .line 718
    move-object/from16 v2, p1

    .line 719
    .line 720
    move/from16 v9, p9

    .line 721
    .line 722
    move/from16 v10, p10

    .line 723
    .line 724
    invoke-direct/range {v0 .. v10}, Landroidx/compose/material3/SliderKt$RangeSlider$3;-><init>(Lkotlin/ranges/ClosedFloatingPointRange;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZLkotlin/ranges/ClosedFloatingPointRange;ILkotlin/jvm/functions/Function0;Landroidx/compose/material3/SliderColors;II)V

    .line 725
    .line 726
    .line 727
    invoke-interface {v11, v12}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lkotlin/jvm/functions/Function2;)V

    .line 728
    .line 729
    .line 730
    :goto_1c
    return-void

    .line 731
    :cond_2e
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 732
    .line 733
    const-string/jumbo v1, "steps should be >= 0"

    .line 734
    .line 735
    .line 736
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 737
    .line 738
    .line 739
    move-result-object v1

    .line 740
    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 741
    .line 742
    .line 743
    throw v0
.end method

.method private static final RangeSliderImpl(ZFF[FLandroidx/compose/material3/SliderColors;FLandroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V
    .locals 20
    .annotation build Landroidx/compose/runtime/Composable;
    .end annotation

    .annotation build Landroidx/compose/runtime/ComposableTarget;
        applier = "androidx.compose.ui.UiComposable"
    .end annotation

    move/from16 v12, p12

    const v0, -0x239cb049

    move-object/from16 v1, p11

    .line 1
    invoke-interface {v1, v0}, Landroidx/compose/runtime/Composer;->startRestartGroup(I)Landroidx/compose/runtime/Composer;

    move-result-object v11

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v1

    if-eqz v1, :cond_0

    const-string v1, "androidx.compose.material3.RangeSliderImpl (Slider.kt:511)"

    move/from16 v13, p13

    invoke-static {v0, v12, v13, v1}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    goto :goto_0

    :cond_0
    move/from16 v13, p13

    .line 2
    :goto_0
    sget-object v0, Landroidx/compose/material3/Strings;->Companion:Landroidx/compose/material3/Strings$Companion;

    invoke-virtual {v0}, Landroidx/compose/material3/Strings$Companion;->getSliderRangeStart-adMyvUU()I

    move-result v1

    const/4 v2, 0x6

    invoke-static {v1, v11, v2}, Landroidx/compose/material3/Strings_androidKt;->getString-NWtq2-8(ILandroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v14

    .line 3
    invoke-virtual {v0}, Landroidx/compose/material3/Strings$Companion;->getSliderRangeEnd-adMyvUU()I

    move-result v0

    invoke-static {v0, v11, v2}, Landroidx/compose/material3/Strings_androidKt;->getString-NWtq2-8(ILandroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v15

    .line 4
    sget-object v0, Landroidx/compose/material3/SliderKt;->DefaultSliderConstraints:Landroidx/compose/ui/Modifier;

    move-object/from16 v10, p8

    invoke-interface {v10, v0}, Landroidx/compose/ui/Modifier;->then(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    const v1, 0x2bb5b5d7

    invoke-interface {v11, v1}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 5
    sget-object v1, Landroidx/compose/ui/Alignment;->Companion:Landroidx/compose/ui/Alignment$Companion;

    invoke-virtual {v1}, Landroidx/compose/ui/Alignment$Companion;->getTopStart()Landroidx/compose/ui/Alignment;

    move-result-object v2

    const/4 v3, 0x0

    .line 6
    invoke-static {v2, v3, v11, v3}, Landroidx/compose/foundation/layout/BoxKt;->rememberBoxMeasurePolicy(Landroidx/compose/ui/Alignment;ZLandroidx/compose/runtime/Composer;I)Landroidx/compose/ui/layout/MeasurePolicy;

    move-result-object v2

    const v4, -0x4ee9b9da

    .line 7
    invoke-interface {v11, v4}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 8
    invoke-static {}, Landroidx/compose/ui/platform/CompositionLocalsKt;->getLocalDensity()Landroidx/compose/runtime/ProvidableCompositionLocal;

    move-result-object v4

    .line 9
    invoke-interface {v11, v4}, Landroidx/compose/runtime/Composer;->consume(Landroidx/compose/runtime/CompositionLocal;)Ljava/lang/Object;

    move-result-object v4

    .line 10
    check-cast v4, Landroidx/compose/ui/unit/Density;

    .line 11
    invoke-static {}, Landroidx/compose/ui/platform/CompositionLocalsKt;->getLocalLayoutDirection()Landroidx/compose/runtime/ProvidableCompositionLocal;

    move-result-object v5

    .line 12
    invoke-interface {v11, v5}, Landroidx/compose/runtime/Composer;->consume(Landroidx/compose/runtime/CompositionLocal;)Ljava/lang/Object;

    move-result-object v5

    .line 13
    check-cast v5, Landroidx/compose/ui/unit/LayoutDirection;

    .line 14
    invoke-static {}, Landroidx/compose/ui/platform/CompositionLocalsKt;->getLocalViewConfiguration()Landroidx/compose/runtime/ProvidableCompositionLocal;

    move-result-object v6

    .line 15
    invoke-interface {v11, v6}, Landroidx/compose/runtime/Composer;->consume(Landroidx/compose/runtime/CompositionLocal;)Ljava/lang/Object;

    move-result-object v6

    .line 16
    check-cast v6, Landroidx/compose/ui/platform/ViewConfiguration;

    .line 17
    sget-object v7, Landroidx/compose/ui/node/ComposeUiNode;->Companion:Landroidx/compose/ui/node/ComposeUiNode$Companion;

    invoke-virtual {v7}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getConstructor()Lkotlin/jvm/functions/Function0;

    move-result-object v8

    .line 18
    invoke-static {v0}, Landroidx/compose/ui/layout/LayoutKt;->materializerOf(Landroidx/compose/ui/Modifier;)Lkotlin/jvm/functions/Function3;

    move-result-object v0

    .line 19
    invoke-interface {v11}, Landroidx/compose/runtime/Composer;->getApplier()Landroidx/compose/runtime/Applier;

    move-result-object v9

    instance-of v9, v9, Landroidx/compose/runtime/Applier;

    if-nez v9, :cond_1

    invoke-static {}, Landroidx/compose/runtime/ComposablesKt;->invalidApplier()V

    .line 20
    :cond_1
    invoke-interface {v11}, Landroidx/compose/runtime/Composer;->startReusableNode()V

    .line 21
    invoke-interface {v11}, Landroidx/compose/runtime/Composer;->getInserting()Z

    move-result v9

    if-eqz v9, :cond_2

    .line 22
    invoke-interface {v11, v8}, Landroidx/compose/runtime/Composer;->createNode(Lkotlin/jvm/functions/Function0;)V

    goto :goto_1

    .line 23
    :cond_2
    invoke-interface {v11}, Landroidx/compose/runtime/Composer;->useNode()V

    .line 24
    :goto_1
    invoke-interface {v11}, Landroidx/compose/runtime/Composer;->disableReusing()V

    .line 25
    invoke-static {v11}, Landroidx/compose/runtime/Updater;->constructor-impl(Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;

    move-result-object v8

    .line 26
    invoke-virtual {v7}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetMeasurePolicy()Lkotlin/jvm/functions/Function2;

    move-result-object v9

    invoke-static {v8, v2, v9}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 27
    invoke-virtual {v7}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetDensity()Lkotlin/jvm/functions/Function2;

    move-result-object v2

    invoke-static {v8, v4, v2}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 28
    invoke-virtual {v7}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetLayoutDirection()Lkotlin/jvm/functions/Function2;

    move-result-object v2

    invoke-static {v8, v5, v2}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 29
    invoke-virtual {v7}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetViewConfiguration()Lkotlin/jvm/functions/Function2;

    move-result-object v2

    invoke-static {v8, v6, v2}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 30
    invoke-interface {v11}, Landroidx/compose/runtime/Composer;->enableReusing()V

    .line 31
    invoke-static {v11}, Landroidx/compose/runtime/SkippableUpdater;->constructor-impl(Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;

    move-result-object v2

    invoke-static {v2}, Landroidx/compose/runtime/SkippableUpdater;->box-impl(Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/SkippableUpdater;

    move-result-object v2

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-interface {v0, v2, v11, v3}, Lkotlin/jvm/functions/Function3;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const v0, 0x7ab4aae9

    .line 32
    invoke-interface {v11, v0}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    const v0, -0x7f65a980

    .line 33
    invoke-interface {v11, v0}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 34
    sget-object v0, Landroidx/compose/foundation/layout/BoxScopeInstance;->INSTANCE:Landroidx/compose/foundation/layout/BoxScopeInstance;

    const v2, 0x689babbd

    invoke-interface {v11, v2}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 35
    invoke-static {}, Landroidx/compose/ui/platform/CompositionLocalsKt;->getLocalDensity()Landroidx/compose/runtime/ProvidableCompositionLocal;

    move-result-object v2

    .line 36
    invoke-interface {v11, v2}, Landroidx/compose/runtime/Composer;->consume(Landroidx/compose/runtime/CompositionLocal;)Ljava/lang/Object;

    move-result-object v2

    .line 37
    check-cast v2, Landroidx/compose/ui/unit/Density;

    .line 38
    sget v3, Landroidx/compose/material3/SliderKt;->TrackHeight:F

    invoke-interface {v2, v3}, Landroidx/compose/ui/unit/Density;->toPx-0680j_4(F)F

    move-result v8

    move/from16 v9, p5

    .line 39
    invoke-interface {v2, v9}, Landroidx/compose/ui/unit/Density;->toDp-u2uoSUM(F)F

    move-result v2

    mul-float v3, v2, p1

    .line 40
    invoke-static {v3}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    move-result v7

    mul-float v2, v2, p2

    .line 41
    invoke-static {v2}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    move-result v6

    .line 42
    sget-object v2, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    .line 43
    invoke-virtual {v1}, Landroidx/compose/ui/Alignment$Companion;->getCenterStart()Landroidx/compose/ui/Alignment;

    move-result-object v1

    invoke-interface {v0, v2, v1}, Landroidx/compose/foundation/layout/BoxScope;->align(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/Alignment;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v5, 0x1

    .line 44
    invoke-static {v1, v2, v5, v3}, Landroidx/compose/foundation/layout/SizeKt;->fillMaxSize$default(Landroidx/compose/ui/Modifier;FILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    .line 45
    sget v16, Landroidx/compose/material3/SliderKt;->ThumbWidth:F

    shr-int/lit8 v2, v12, 0x9

    and-int/lit8 v2, v2, 0x70

    const/high16 v3, 0x1c0000

    or-int/2addr v2, v3

    shl-int/lit8 v3, v12, 0x6

    and-int/lit16 v4, v3, 0x380

    or-int/2addr v2, v4

    and-int/lit16 v4, v3, 0x1c00

    or-int/2addr v2, v4

    const v4, 0xe000

    and-int/2addr v3, v4

    or-int v17, v2, v3

    move-object/from16 v2, p4

    move/from16 v3, p0

    move/from16 v4, p1

    move v12, v5

    move/from16 v5, p2

    move/from16 v18, v6

    move-object/from16 v6, p3

    move/from16 v19, v7

    move/from16 v7, v16

    move-object v9, v11

    move/from16 v10, v17

    .line 46
    invoke-static/range {v1 .. v10}, Landroidx/compose/material3/SliderKt;->TempRangeSliderTrack-au3_HiA(Landroidx/compose/ui/Modifier;Landroidx/compose/material3/SliderColors;ZFF[FFFLandroidx/compose/runtime/Composer;I)V

    .line 47
    new-instance v7, Landroidx/compose/material3/SliderKt$RangeSliderImpl$1$2;

    move-object v8, v0

    move-object v0, v7

    move-object v1, v14

    move-object/from16 v2, p6

    move-object/from16 v3, p9

    move-object/from16 v4, p4

    move/from16 v5, p0

    move/from16 v6, p12

    invoke-direct/range {v0 .. v6}, Landroidx/compose/material3/SliderKt$RangeSliderImpl$1$2;-><init>(Ljava/lang/String;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/ui/Modifier;Landroidx/compose/material3/SliderColors;ZI)V

    const v0, -0x5ee461f2

    invoke-static {v11, v0, v12, v7}, Landroidx/compose/runtime/internal/ComposableLambdaKt;->composableLambda(Landroidx/compose/runtime/Composer;IZLjava/lang/Object;)Landroidx/compose/runtime/internal/ComposableLambda;

    move-result-object v0

    const/16 v7, 0x186

    move/from16 v1, v19

    .line 48
    invoke-static {v8, v1, v0, v11, v7}, Landroidx/compose/material3/SliderKt;->TempRangeSliderThumb-rAjV9yQ(Landroidx/compose/foundation/layout/BoxScope;FLkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;I)V

    .line 49
    new-instance v9, Landroidx/compose/material3/SliderKt$RangeSliderImpl$1$3;

    move-object v0, v9

    move-object v1, v15

    move-object/from16 v2, p7

    move-object/from16 v3, p10

    invoke-direct/range {v0 .. v6}, Landroidx/compose/material3/SliderKt$RangeSliderImpl$1$3;-><init>(Ljava/lang/String;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/ui/Modifier;Landroidx/compose/material3/SliderColors;ZI)V

    const v0, -0x440a983b

    invoke-static {v11, v0, v12, v9}, Landroidx/compose/runtime/internal/ComposableLambdaKt;->composableLambda(Landroidx/compose/runtime/Composer;IZLjava/lang/Object;)Landroidx/compose/runtime/internal/ComposableLambda;

    move-result-object v0

    move/from16 v1, v18

    .line 50
    invoke-static {v8, v1, v0, v11, v7}, Landroidx/compose/material3/SliderKt;->TempRangeSliderThumb-rAjV9yQ(Landroidx/compose/foundation/layout/BoxScope;FLkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;I)V

    .line 51
    invoke-interface {v11}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 52
    invoke-interface {v11}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 53
    invoke-interface {v11}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 54
    invoke-interface {v11}, Landroidx/compose/runtime/Composer;->endNode()V

    .line 55
    invoke-interface {v11}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 56
    invoke-interface {v11}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 57
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    :cond_3
    invoke-interface {v11}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    move-result-object v14

    if-nez v14, :cond_4

    goto :goto_2

    :cond_4
    new-instance v15, Landroidx/compose/material3/SliderKt$RangeSliderImpl$2;

    move-object v0, v15

    move/from16 v1, p0

    move/from16 v2, p1

    move/from16 v3, p2

    move-object/from16 v4, p3

    move-object/from16 v5, p4

    move/from16 v6, p5

    move-object/from16 v7, p6

    move-object/from16 v8, p7

    move-object/from16 v9, p8

    move-object/from16 v10, p9

    move-object/from16 v11, p10

    move/from16 v12, p12

    move/from16 v13, p13

    invoke-direct/range {v0 .. v13}, Landroidx/compose/material3/SliderKt$RangeSliderImpl$2;-><init>(ZFF[FLandroidx/compose/material3/SliderColors;FLandroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/Modifier;II)V

    invoke-interface {v14, v15}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lkotlin/jvm/functions/Function2;)V

    :goto_2
    return-void
.end method

.method public static final Slider(FLkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZLkotlin/ranges/ClosedFloatingPointRange;ILkotlin/jvm/functions/Function0;Landroidx/compose/material3/SliderColors;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/runtime/Composer;II)V
    .locals 44
    .annotation build Landroidx/compose/runtime/Composable;
    .end annotation

    .annotation build Landroidx/compose/runtime/ComposableTarget;
        applier = "androidx.compose.ui.UiComposable"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(F",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Ljava/lang/Float;",
            "Lkotlin/Unit;",
            ">;",
            "Landroidx/compose/ui/Modifier;",
            "Z",
            "Lkotlin/ranges/ClosedFloatingPointRange<",
            "Ljava/lang/Float;",
            ">;I",
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;",
            "Landroidx/compose/material3/SliderColors;",
            "Landroidx/compose/foundation/interaction/MutableInteractionSource;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    move-object/from16 v15, p1

    move/from16 v14, p10

    move/from16 v13, p11

    const-string v0, "onValueChange"

    invoke-static {v15, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const v0, -0xc0af27b

    move-object/from16 v1, p9

    .line 1
    invoke-interface {v1, v0}, Landroidx/compose/runtime/Composer;->startRestartGroup(I)Landroidx/compose/runtime/Composer;

    move-result-object v12

    and-int/lit8 v1, v13, 0x1

    if-eqz v1, :cond_0

    or-int/lit8 v1, v14, 0x6

    move/from16 v11, p0

    goto :goto_1

    :cond_0
    and-int/lit8 v1, v14, 0xe

    move/from16 v11, p0

    if-nez v1, :cond_2

    invoke-interface {v12, v11}, Landroidx/compose/runtime/Composer;->changed(F)Z

    move-result v1

    if-eqz v1, :cond_1

    const/4 v1, 0x4

    goto :goto_0

    :cond_1
    const/4 v1, 0x2

    :goto_0
    or-int/2addr v1, v14

    goto :goto_1

    :cond_2
    move v1, v14

    :goto_1
    and-int/lit8 v2, v13, 0x2

    if-eqz v2, :cond_3

    or-int/lit8 v1, v1, 0x30

    goto :goto_3

    :cond_3
    and-int/lit8 v2, v14, 0x70

    if-nez v2, :cond_5

    invoke-interface {v12, v15}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_4

    const/16 v2, 0x20

    goto :goto_2

    :cond_4
    const/16 v2, 0x10

    :goto_2
    or-int/2addr v1, v2

    :cond_5
    :goto_3
    and-int/lit8 v2, v13, 0x4

    if-eqz v2, :cond_6

    or-int/lit16 v1, v1, 0x180

    goto :goto_5

    :cond_6
    and-int/lit16 v3, v14, 0x380

    if-nez v3, :cond_8

    move-object/from16 v3, p2

    invoke-interface {v12, v3}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_7

    const/16 v4, 0x100

    goto :goto_4

    :cond_7
    const/16 v4, 0x80

    :goto_4
    or-int/2addr v1, v4

    goto :goto_6

    :cond_8
    :goto_5
    move-object/from16 v3, p2

    :goto_6
    and-int/lit8 v4, v13, 0x8

    if-eqz v4, :cond_9

    or-int/lit16 v1, v1, 0xc00

    goto :goto_8

    :cond_9
    and-int/lit16 v5, v14, 0x1c00

    if-nez v5, :cond_b

    move/from16 v5, p3

    invoke-interface {v12, v5}, Landroidx/compose/runtime/Composer;->changed(Z)Z

    move-result v6

    if-eqz v6, :cond_a

    const/16 v6, 0x800

    goto :goto_7

    :cond_a
    const/16 v6, 0x400

    :goto_7
    or-int/2addr v1, v6

    goto :goto_9

    :cond_b
    :goto_8
    move/from16 v5, p3

    :goto_9
    const v6, 0xe000

    and-int v7, v14, v6

    if-nez v7, :cond_e

    and-int/lit8 v7, v13, 0x10

    if-nez v7, :cond_c

    move-object/from16 v7, p4

    invoke-interface {v12, v7}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_d

    const/16 v8, 0x4000

    goto :goto_a

    :cond_c
    move-object/from16 v7, p4

    :cond_d
    const/16 v8, 0x2000

    :goto_a
    or-int/2addr v1, v8

    goto :goto_b

    :cond_e
    move-object/from16 v7, p4

    :goto_b
    and-int/lit8 v8, v13, 0x20

    const/high16 v9, 0x70000

    if-eqz v8, :cond_f

    const/high16 v10, 0x30000

    or-int/2addr v1, v10

    goto :goto_d

    :cond_f
    and-int v10, v14, v9

    if-nez v10, :cond_11

    move/from16 v10, p5

    invoke-interface {v12, v10}, Landroidx/compose/runtime/Composer;->changed(I)Z

    move-result v16

    if-eqz v16, :cond_10

    const/high16 v16, 0x20000

    goto :goto_c

    :cond_10
    const/high16 v16, 0x10000

    :goto_c
    or-int v1, v1, v16

    goto :goto_e

    :cond_11
    :goto_d
    move/from16 v10, p5

    :goto_e
    and-int/lit8 v16, v13, 0x40

    const/high16 v41, 0x380000

    if-eqz v16, :cond_12

    const/high16 v17, 0x180000

    or-int v1, v1, v17

    move-object/from16 v9, p6

    goto :goto_10

    :cond_12
    and-int v17, v14, v41

    move-object/from16 v9, p6

    if-nez v17, :cond_14

    invoke-interface {v12, v9}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v17

    if-eqz v17, :cond_13

    const/high16 v17, 0x100000

    goto :goto_f

    :cond_13
    const/high16 v17, 0x80000

    :goto_f
    or-int v1, v1, v17

    :cond_14
    :goto_10
    const/high16 v42, 0x1c00000

    and-int v17, v14, v42

    if-nez v17, :cond_17

    and-int/lit16 v6, v13, 0x80

    if-nez v6, :cond_15

    move-object/from16 v6, p7

    invoke-interface {v12, v6}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v17

    if-eqz v17, :cond_16

    const/high16 v17, 0x800000

    goto :goto_11

    :cond_15
    move-object/from16 v6, p7

    :cond_16
    const/high16 v17, 0x400000

    :goto_11
    or-int v1, v1, v17

    goto :goto_12

    :cond_17
    move-object/from16 v6, p7

    :goto_12
    and-int/lit16 v0, v13, 0x100

    const/high16 v43, 0xe000000

    if-eqz v0, :cond_18

    const/high16 v17, 0x6000000

    or-int v1, v1, v17

    move-object/from16 v3, p8

    goto :goto_14

    :cond_18
    and-int v17, v14, v43

    move-object/from16 v3, p8

    if-nez v17, :cond_1a

    invoke-interface {v12, v3}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v17

    if-eqz v17, :cond_19

    const/high16 v17, 0x4000000

    goto :goto_13

    :cond_19
    const/high16 v17, 0x2000000

    :goto_13
    or-int v1, v1, v17

    :cond_1a
    :goto_14
    const v17, 0xb6db6db

    and-int v3, v1, v17

    const v5, 0x2492492

    if-ne v3, v5, :cond_1c

    invoke-interface {v12}, Landroidx/compose/runtime/Composer;->getSkipping()Z

    move-result v3

    if-nez v3, :cond_1b

    goto :goto_15

    .line 2
    :cond_1b
    invoke-interface {v12}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    move-object/from16 v3, p2

    move/from16 v4, p3

    move-object v8, v6

    move-object v5, v7

    move-object v7, v9

    move v6, v10

    move-object/from16 v20, v12

    move-object/from16 v9, p8

    goto/16 :goto_1d

    .line 3
    :cond_1c
    :goto_15
    invoke-interface {v12}, Landroidx/compose/runtime/Composer;->startDefaults()V

    and-int/lit8 v3, v14, 0x1

    const v17, -0xe001

    const/4 v5, 0x1

    if-eqz v3, :cond_20

    invoke-interface {v12}, Landroidx/compose/runtime/Composer;->getDefaultsInvalid()Z

    move-result v3

    if-eqz v3, :cond_1d

    goto :goto_16

    .line 4
    :cond_1d
    invoke-interface {v12}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    and-int/lit8 v0, v13, 0x10

    if-eqz v0, :cond_1e

    and-int v1, v1, v17

    :cond_1e
    and-int/lit16 v0, v13, 0x80

    if-eqz v0, :cond_1f

    const v0, -0x1c00001

    and-int/2addr v1, v0

    :cond_1f
    move-object/from16 v16, p2

    move-object/from16 v8, p8

    move-object/from16 v17, v7

    move-object/from16 v19, v9

    move/from16 v18, v10

    move/from16 v10, p3

    move-object v9, v6

    goto/16 :goto_1c

    :cond_20
    :goto_16
    if-eqz v2, :cond_21

    .line 5
    sget-object v2, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    goto :goto_17

    :cond_21
    move-object/from16 v2, p2

    :goto_17
    if-eqz v4, :cond_22

    move v3, v5

    goto :goto_18

    :cond_22
    move/from16 v3, p3

    :goto_18
    and-int/lit8 v4, v13, 0x10

    if-eqz v4, :cond_23

    const/4 v4, 0x0

    const/high16 v7, 0x3f800000    # 1.0f

    .line 6
    invoke-static {v4, v7}, Lkotlin/ranges/RangesKt;->rangeTo(FF)Lkotlin/ranges/ClosedFloatingPointRange;

    move-result-object v4

    and-int v1, v1, v17

    goto :goto_19

    :cond_23
    move-object v4, v7

    :goto_19
    if-eqz v8, :cond_24

    const/4 v7, 0x0

    goto :goto_1a

    :cond_24
    move v7, v10

    :goto_1a
    if-eqz v16, :cond_25

    const/4 v8, 0x0

    goto :goto_1b

    :cond_25
    move-object v8, v9

    :goto_1b
    and-int/lit16 v9, v13, 0x80

    if-eqz v9, :cond_26

    .line 7
    sget-object v16, Landroidx/compose/material3/SliderDefaults;->INSTANCE:Landroidx/compose/material3/SliderDefaults;

    const-wide/16 v17, 0x0

    const-wide/16 v19, 0x0

    const-wide/16 v21, 0x0

    const-wide/16 v23, 0x0

    const-wide/16 v25, 0x0

    const-wide/16 v27, 0x0

    const-wide/16 v29, 0x0

    const-wide/16 v31, 0x0

    const-wide/16 v33, 0x0

    const-wide/16 v35, 0x0

    const/16 v38, 0x0

    const/16 v39, 0x6

    const/16 v40, 0x3ff

    move-object/from16 v37, v12

    invoke-virtual/range {v16 .. v40}, Landroidx/compose/material3/SliderDefaults;->colors-q0g_0yA(JJJJJJJJJJLandroidx/compose/runtime/Composer;III)Landroidx/compose/material3/SliderColors;

    move-result-object v6

    const v9, -0x1c00001

    and-int/2addr v1, v9

    :cond_26
    if-eqz v0, :cond_28

    const v0, -0x1d58f75c

    .line 8
    invoke-interface {v12, v0}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 9
    invoke-interface {v12}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v0

    .line 10
    sget-object v9, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    invoke-virtual {v9}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v9

    if-ne v0, v9, :cond_27

    .line 11
    invoke-static {}, Landroidx/compose/foundation/interaction/InteractionSourceKt;->MutableInteractionSource()Landroidx/compose/foundation/interaction/MutableInteractionSource;

    move-result-object v0

    .line 12
    invoke-interface {v12, v0}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 13
    :cond_27
    invoke-interface {v12}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    check-cast v0, Landroidx/compose/foundation/interaction/MutableInteractionSource;

    move-object/from16 v16, v2

    move v10, v3

    move-object/from16 v17, v4

    move-object v9, v6

    move/from16 v18, v7

    move-object/from16 v19, v8

    move-object v8, v0

    goto :goto_1c

    :cond_28
    move-object/from16 v16, v2

    move v10, v3

    move-object/from16 v17, v4

    move-object v9, v6

    move/from16 v18, v7

    move-object/from16 v19, v8

    move-object/from16 v8, p8

    :goto_1c
    invoke-interface {v12}, Landroidx/compose/runtime/Composer;->endDefaults()V

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v0

    if-eqz v0, :cond_29

    const/4 v0, -0x1

    const-string v2, "androidx.compose.material3.Slider (Slider.kt:154)"

    const v3, -0xc0af27b

    .line 14
    invoke-static {v3, v1, v0, v2}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    :cond_29
    invoke-static {v10}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    const v2, 0x607fb4c4

    .line 15
    invoke-interface {v12, v2}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 16
    invoke-interface {v12, v8}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v2

    .line 17
    invoke-interface {v12, v9}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v3

    or-int/2addr v2, v3

    .line 18
    invoke-interface {v12, v0}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v0

    or-int/2addr v0, v2

    .line 19
    invoke-interface {v12}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v2

    if-nez v0, :cond_2a

    .line 20
    sget-object v0, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    invoke-virtual {v0}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v0

    if-ne v2, v0, :cond_2b

    .line 21
    :cond_2a
    new-instance v0, Landroidx/compose/material3/SliderKt$Slider$2$1;

    invoke-direct {v0, v8, v9, v10, v1}, Landroidx/compose/material3/SliderKt$Slider$2$1;-><init>(Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/material3/SliderColors;ZI)V

    const v2, -0x72a40ab4

    invoke-static {v2, v5, v0}, Landroidx/compose/runtime/internal/ComposableLambdaKt;->composableLambdaInstance(IZLjava/lang/Object;)Landroidx/compose/runtime/internal/ComposableLambda;

    move-result-object v2

    .line 22
    invoke-interface {v12, v2}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 23
    :cond_2b
    invoke-interface {v12}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 24
    move-object/from16 v20, v2

    check-cast v20, Lkotlin/jvm/functions/Function3;

    invoke-static {v10}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    const v2, 0x1e7b2b64

    .line 25
    invoke-interface {v12, v2}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 26
    invoke-interface {v12, v9}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v2

    invoke-interface {v12, v0}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v0

    or-int/2addr v0, v2

    .line 27
    invoke-interface {v12}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v2

    if-nez v0, :cond_2c

    .line 28
    sget-object v0, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    invoke-virtual {v0}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v0

    if-ne v2, v0, :cond_2d

    .line 29
    :cond_2c
    new-instance v0, Landroidx/compose/material3/SliderKt$Slider$3$1;

    invoke-direct {v0, v9, v10, v1}, Landroidx/compose/material3/SliderKt$Slider$3$1;-><init>(Landroidx/compose/material3/SliderColors;ZI)V

    const v2, 0x3cf04de3

    invoke-static {v2, v5, v0}, Landroidx/compose/runtime/internal/ComposableLambdaKt;->composableLambdaInstance(IZLjava/lang/Object;)Landroidx/compose/runtime/internal/ComposableLambda;

    move-result-object v2

    .line 30
    invoke-interface {v12, v2}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 31
    :cond_2d
    invoke-interface {v12}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 32
    check-cast v2, Lkotlin/jvm/functions/Function3;

    and-int/lit8 v0, v1, 0xe

    and-int/lit8 v3, v1, 0x70

    or-int/2addr v0, v3

    shl-int/lit8 v1, v1, 0x3

    and-int/lit16 v3, v1, 0x1c00

    or-int/2addr v0, v3

    const v3, 0xe000

    and-int/2addr v3, v1

    or-int/2addr v0, v3

    const/high16 v3, 0x70000

    and-int/2addr v3, v1

    or-int/2addr v0, v3

    and-int v3, v1, v41

    or-int/2addr v0, v3

    and-int v3, v1, v42

    or-int/2addr v0, v3

    and-int v3, v1, v43

    or-int/2addr v0, v3

    const/high16 v3, 0x70000000

    and-int/2addr v1, v3

    or-int v21, v0, v1

    const/16 v22, 0x0

    const/16 v23, 0x0

    move/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v3, v16

    move v4, v10

    move-object/from16 v5, v17

    move/from16 v6, v18

    move-object/from16 v7, v19

    move-object/from16 v24, v8

    move-object v8, v9

    move-object/from16 v25, v9

    move-object/from16 v9, v24

    move/from16 v26, v10

    move-object/from16 v10, v20

    move-object v11, v12

    move-object/from16 v20, v12

    move/from16 v12, v21

    move/from16 v13, v22

    move/from16 v14, v23

    .line 33
    invoke-static/range {v0 .. v14}, Landroidx/compose/material3/SliderKt;->Slider(FLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function3;Landroidx/compose/ui/Modifier;ZLkotlin/ranges/ClosedFloatingPointRange;ILkotlin/jvm/functions/Function0;Landroidx/compose/material3/SliderColors;Landroidx/compose/foundation/interaction/MutableInteractionSource;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;III)V

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v0

    if-eqz v0, :cond_2e

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    :cond_2e
    move-object/from16 v3, v16

    move-object/from16 v5, v17

    move/from16 v6, v18

    move-object/from16 v7, v19

    move-object/from16 v9, v24

    move-object/from16 v8, v25

    move/from16 v4, v26

    .line 34
    :goto_1d
    invoke-interface/range {v20 .. v20}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    move-result-object v12

    if-nez v12, :cond_2f

    goto :goto_1e

    :cond_2f
    new-instance v13, Landroidx/compose/material3/SliderKt$Slider$4;

    move-object v0, v13

    move/from16 v1, p0

    move-object/from16 v2, p1

    move/from16 v10, p10

    move/from16 v11, p11

    invoke-direct/range {v0 .. v11}, Landroidx/compose/material3/SliderKt$Slider$4;-><init>(FLkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZLkotlin/ranges/ClosedFloatingPointRange;ILkotlin/jvm/functions/Function0;Landroidx/compose/material3/SliderColors;Landroidx/compose/foundation/interaction/MutableInteractionSource;II)V

    invoke-interface {v12, v13}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lkotlin/jvm/functions/Function2;)V

    :goto_1e
    return-void
.end method

.method public static final Slider(FLkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZLkotlin/ranges/ClosedFloatingPointRange;ILkotlin/jvm/functions/Function0;Landroidx/compose/material3/SliderColors;Landroidx/compose/foundation/interaction/MutableInteractionSource;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V
    .locals 45
    .annotation runtime Landroidx/compose/material3/ExperimentalMaterial3Api;
    .end annotation

    .annotation build Landroidx/compose/runtime/Composable;
    .end annotation

    .annotation build Landroidx/compose/runtime/ComposableInferredTarget;
        scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(F",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Ljava/lang/Float;",
            "Lkotlin/Unit;",
            ">;",
            "Landroidx/compose/ui/Modifier;",
            "Z",
            "Lkotlin/ranges/ClosedFloatingPointRange<",
            "Ljava/lang/Float;",
            ">;I",
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;",
            "Landroidx/compose/material3/SliderColors;",
            "Landroidx/compose/foundation/interaction/MutableInteractionSource;",
            "Lkotlin/jvm/functions/Function3<",
            "-",
            "Landroidx/compose/material3/SliderPositions;",
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

    move-object/from16 v15, p1

    move-object/from16 v14, p9

    move/from16 v13, p11

    move/from16 v12, p12

    const-string v0, "onValueChange"

    invoke-static {v15, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "thumb"

    invoke-static {v14, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const v0, 0x6a6cd118

    move-object/from16 v1, p10

    .line 35
    invoke-interface {v1, v0}, Landroidx/compose/runtime/Composer;->startRestartGroup(I)Landroidx/compose/runtime/Composer;

    move-result-object v11

    and-int/lit8 v1, v12, 0x1

    if-eqz v1, :cond_0

    or-int/lit8 v1, v13, 0x6

    move/from16 v10, p0

    goto :goto_1

    :cond_0
    and-int/lit8 v1, v13, 0xe

    move/from16 v10, p0

    if-nez v1, :cond_2

    invoke-interface {v11, v10}, Landroidx/compose/runtime/Composer;->changed(F)Z

    move-result v1

    if-eqz v1, :cond_1

    const/4 v1, 0x4

    goto :goto_0

    :cond_1
    const/4 v1, 0x2

    :goto_0
    or-int/2addr v1, v13

    goto :goto_1

    :cond_2
    move v1, v13

    :goto_1
    and-int/lit8 v2, v12, 0x2

    if-eqz v2, :cond_3

    or-int/lit8 v1, v1, 0x30

    goto :goto_3

    :cond_3
    and-int/lit8 v2, v13, 0x70

    if-nez v2, :cond_5

    invoke-interface {v11, v15}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_4

    const/16 v2, 0x20

    goto :goto_2

    :cond_4
    const/16 v2, 0x10

    :goto_2
    or-int/2addr v1, v2

    :cond_5
    :goto_3
    and-int/lit8 v2, v12, 0x4

    if-eqz v2, :cond_6

    or-int/lit16 v1, v1, 0x180

    goto :goto_5

    :cond_6
    and-int/lit16 v3, v13, 0x380

    if-nez v3, :cond_8

    move-object/from16 v3, p2

    invoke-interface {v11, v3}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_7

    const/16 v4, 0x100

    goto :goto_4

    :cond_7
    const/16 v4, 0x80

    :goto_4
    or-int/2addr v1, v4

    goto :goto_6

    :cond_8
    :goto_5
    move-object/from16 v3, p2

    :goto_6
    and-int/lit8 v4, v12, 0x8

    if-eqz v4, :cond_9

    or-int/lit16 v1, v1, 0xc00

    goto :goto_8

    :cond_9
    and-int/lit16 v5, v13, 0x1c00

    if-nez v5, :cond_b

    move/from16 v5, p3

    invoke-interface {v11, v5}, Landroidx/compose/runtime/Composer;->changed(Z)Z

    move-result v6

    if-eqz v6, :cond_a

    const/16 v6, 0x800

    goto :goto_7

    :cond_a
    const/16 v6, 0x400

    :goto_7
    or-int/2addr v1, v6

    goto :goto_9

    :cond_b
    :goto_8
    move/from16 v5, p3

    :goto_9
    const v6, 0xe000

    and-int v7, v13, v6

    if-nez v7, :cond_e

    and-int/lit8 v7, v12, 0x10

    if-nez v7, :cond_c

    move-object/from16 v7, p4

    invoke-interface {v11, v7}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_d

    const/16 v8, 0x4000

    goto :goto_a

    :cond_c
    move-object/from16 v7, p4

    :cond_d
    const/16 v8, 0x2000

    :goto_a
    or-int/2addr v1, v8

    goto :goto_b

    :cond_e
    move-object/from16 v7, p4

    :goto_b
    and-int/lit8 v8, v12, 0x20

    const/high16 v9, 0x70000

    if-eqz v8, :cond_f

    const/high16 v16, 0x30000

    or-int v1, v1, v16

    move/from16 v9, p5

    goto :goto_d

    :cond_f
    and-int v16, v13, v9

    move/from16 v9, p5

    if-nez v16, :cond_11

    invoke-interface {v11, v9}, Landroidx/compose/runtime/Composer;->changed(I)Z

    move-result v16

    if-eqz v16, :cond_10

    const/high16 v16, 0x20000

    goto :goto_c

    :cond_10
    const/high16 v16, 0x10000

    :goto_c
    or-int v1, v1, v16

    :cond_11
    :goto_d
    and-int/lit8 v16, v12, 0x40

    const/high16 v41, 0x380000

    if-eqz v16, :cond_12

    const/high16 v17, 0x180000

    or-int v1, v1, v17

    move-object/from16 v6, p6

    goto :goto_f

    :cond_12
    and-int v17, v13, v41

    move-object/from16 v6, p6

    if-nez v17, :cond_14

    invoke-interface {v11, v6}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v17

    if-eqz v17, :cond_13

    const/high16 v17, 0x100000

    goto :goto_e

    :cond_13
    const/high16 v17, 0x80000

    :goto_e
    or-int v1, v1, v17

    :cond_14
    :goto_f
    const/high16 v42, 0x1c00000

    and-int v17, v13, v42

    if-nez v17, :cond_17

    and-int/lit16 v0, v12, 0x80

    if-nez v0, :cond_15

    move-object/from16 v0, p7

    invoke-interface {v11, v0}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v17

    if-eqz v17, :cond_16

    const/high16 v17, 0x800000

    goto :goto_10

    :cond_15
    move-object/from16 v0, p7

    :cond_16
    const/high16 v17, 0x400000

    :goto_10
    or-int v1, v1, v17

    goto :goto_11

    :cond_17
    move-object/from16 v0, p7

    :goto_11
    and-int/lit16 v0, v12, 0x100

    const/high16 v43, 0xe000000

    if-eqz v0, :cond_18

    const/high16 v17, 0x6000000

    or-int v1, v1, v17

    move-object/from16 v3, p8

    goto :goto_13

    :cond_18
    and-int v17, v13, v43

    move-object/from16 v3, p8

    if-nez v17, :cond_1a

    invoke-interface {v11, v3}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v17

    if-eqz v17, :cond_19

    const/high16 v17, 0x4000000

    goto :goto_12

    :cond_19
    const/high16 v17, 0x2000000

    :goto_12
    or-int v1, v1, v17

    :cond_1a
    :goto_13
    and-int/lit16 v3, v12, 0x200

    const/high16 v44, 0x70000000

    if-eqz v3, :cond_1b

    const/high16 v3, 0x30000000

    :goto_14
    or-int/2addr v1, v3

    goto :goto_15

    :cond_1b
    and-int v3, v13, v44

    if-nez v3, :cond_1d

    invoke-interface {v11, v14}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_1c

    const/high16 v3, 0x20000000

    goto :goto_14

    :cond_1c
    const/high16 v3, 0x10000000

    goto :goto_14

    :cond_1d
    :goto_15
    const v3, 0x5b6db6db

    and-int/2addr v3, v1

    const v5, 0x12492492

    if-ne v3, v5, :cond_1f

    invoke-interface {v11}, Landroidx/compose/runtime/Composer;->getSkipping()Z

    move-result v3

    if-nez v3, :cond_1e

    goto :goto_16

    .line 36
    :cond_1e
    invoke-interface {v11}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    move-object/from16 v3, p2

    move/from16 v4, p3

    move-object/from16 v8, p7

    move-object v5, v7

    move-object/from16 v26, v11

    move-object v7, v6

    move v6, v9

    move-object/from16 v9, p8

    goto/16 :goto_1f

    .line 37
    :cond_1f
    :goto_16
    invoke-interface {v11}, Landroidx/compose/runtime/Composer;->startDefaults()V

    and-int/lit8 v3, v13, 0x1

    const v17, -0xe001

    const/4 v5, 0x1

    if-eqz v3, :cond_23

    invoke-interface {v11}, Landroidx/compose/runtime/Composer;->getDefaultsInvalid()Z

    move-result v3

    if-eqz v3, :cond_20

    goto :goto_17

    .line 38
    :cond_20
    invoke-interface {v11}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    and-int/lit8 v0, v12, 0x10

    if-eqz v0, :cond_21

    and-int v1, v1, v17

    :cond_21
    and-int/lit16 v0, v12, 0x80

    if-eqz v0, :cond_22

    const v0, -0x1c00001

    and-int/2addr v1, v0

    :cond_22
    move-object/from16 v16, p2

    move-object/from16 v8, p7

    move-object/from16 v20, p8

    move-object/from16 v19, v6

    move-object/from16 v17, v7

    move/from16 v18, v9

    move/from16 v9, p3

    goto/16 :goto_1e

    :cond_23
    :goto_17
    if-eqz v2, :cond_24

    .line 39
    sget-object v2, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    goto :goto_18

    :cond_24
    move-object/from16 v2, p2

    :goto_18
    if-eqz v4, :cond_25

    move v3, v5

    goto :goto_19

    :cond_25
    move/from16 v3, p3

    :goto_19
    and-int/lit8 v4, v12, 0x10

    if-eqz v4, :cond_26

    const/4 v4, 0x0

    const/high16 v7, 0x3f800000    # 1.0f

    .line 40
    invoke-static {v4, v7}, Lkotlin/ranges/RangesKt;->rangeTo(FF)Lkotlin/ranges/ClosedFloatingPointRange;

    move-result-object v4

    and-int v1, v1, v17

    goto :goto_1a

    :cond_26
    move-object v4, v7

    :goto_1a
    if-eqz v8, :cond_27

    const/4 v7, 0x0

    goto :goto_1b

    :cond_27
    move v7, v9

    :goto_1b
    if-eqz v16, :cond_28

    const/4 v6, 0x0

    :cond_28
    and-int/lit16 v8, v12, 0x80

    if-eqz v8, :cond_29

    .line 41
    sget-object v16, Landroidx/compose/material3/SliderDefaults;->INSTANCE:Landroidx/compose/material3/SliderDefaults;

    const-wide/16 v17, 0x0

    const-wide/16 v19, 0x0

    const-wide/16 v21, 0x0

    const-wide/16 v23, 0x0

    const-wide/16 v25, 0x0

    const-wide/16 v27, 0x0

    const-wide/16 v29, 0x0

    const-wide/16 v31, 0x0

    const-wide/16 v33, 0x0

    const-wide/16 v35, 0x0

    const/16 v38, 0x0

    const/16 v39, 0x6

    const/16 v40, 0x3ff

    move-object/from16 v37, v11

    invoke-virtual/range {v16 .. v40}, Landroidx/compose/material3/SliderDefaults;->colors-q0g_0yA(JJJJJJJJJJLandroidx/compose/runtime/Composer;III)Landroidx/compose/material3/SliderColors;

    move-result-object v8

    const v9, -0x1c00001

    and-int/2addr v1, v9

    goto :goto_1c

    :cond_29
    move-object/from16 v8, p7

    :goto_1c
    if-eqz v0, :cond_2b

    const v0, -0x1d58f75c

    .line 42
    invoke-interface {v11, v0}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 43
    invoke-interface {v11}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v0

    .line 44
    sget-object v9, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    invoke-virtual {v9}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v9

    if-ne v0, v9, :cond_2a

    .line 45
    invoke-static {}, Landroidx/compose/foundation/interaction/InteractionSourceKt;->MutableInteractionSource()Landroidx/compose/foundation/interaction/MutableInteractionSource;

    move-result-object v0

    .line 46
    invoke-interface {v11, v0}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 47
    :cond_2a
    invoke-interface {v11}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    check-cast v0, Landroidx/compose/foundation/interaction/MutableInteractionSource;

    move-object/from16 v20, v0

    goto :goto_1d

    :cond_2b
    move-object/from16 v20, p8

    :goto_1d
    move-object/from16 v16, v2

    move v9, v3

    move-object/from16 v17, v4

    move-object/from16 v19, v6

    move/from16 v18, v7

    :goto_1e
    invoke-interface {v11}, Landroidx/compose/runtime/Composer;->endDefaults()V

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v0

    if-eqz v0, :cond_2c

    const/4 v0, -0x1

    const-string v2, "androidx.compose.material3.Slider (Slider.kt:235)"

    const v3, 0x6a6cd118

    .line 48
    invoke-static {v3, v1, v0, v2}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    :cond_2c
    invoke-static {v9}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    const v2, 0x1e7b2b64

    .line 49
    invoke-interface {v11, v2}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 50
    invoke-interface {v11, v8}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v2

    invoke-interface {v11, v0}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v0

    or-int/2addr v0, v2

    .line 51
    invoke-interface {v11}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v2

    if-nez v0, :cond_2d

    .line 52
    sget-object v0, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    invoke-virtual {v0}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v0

    if-ne v2, v0, :cond_2e

    .line 53
    :cond_2d
    new-instance v0, Landroidx/compose/material3/SliderKt$Slider$6$1;

    invoke-direct {v0, v8, v9, v1}, Landroidx/compose/material3/SliderKt$Slider$6$1;-><init>(Landroidx/compose/material3/SliderColors;ZI)V

    const v2, 0x4aa52375    # 5411258.5f

    invoke-static {v2, v5, v0}, Landroidx/compose/runtime/internal/ComposableLambdaKt;->composableLambdaInstance(IZLjava/lang/Object;)Landroidx/compose/runtime/internal/ComposableLambda;

    move-result-object v2

    .line 54
    invoke-interface {v11, v2}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 55
    :cond_2e
    invoke-interface {v11}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 56
    check-cast v2, Lkotlin/jvm/functions/Function3;

    and-int/lit8 v0, v1, 0xe

    and-int/lit8 v3, v1, 0x70

    or-int/2addr v0, v3

    shl-int/lit8 v3, v1, 0x3

    and-int/lit16 v4, v3, 0x1c00

    or-int/2addr v0, v4

    const v4, 0xe000

    and-int/2addr v4, v3

    or-int/2addr v0, v4

    const/high16 v4, 0x70000

    and-int/2addr v4, v3

    or-int/2addr v0, v4

    and-int v4, v3, v41

    or-int/2addr v0, v4

    and-int v4, v3, v42

    or-int/2addr v0, v4

    and-int v4, v3, v43

    or-int/2addr v0, v4

    and-int v3, v3, v44

    or-int v21, v0, v3

    shr-int/lit8 v0, v1, 0x1b

    and-int/lit8 v22, v0, 0xe

    const/16 v23, 0x0

    move/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v3, v16

    move v4, v9

    move-object/from16 v5, v17

    move/from16 v6, v18

    move-object/from16 v7, v19

    move-object/from16 v24, v8

    move/from16 v25, v9

    move-object/from16 v9, v20

    move-object/from16 v10, p9

    move-object/from16 v26, v11

    move/from16 v12, v21

    move/from16 v13, v22

    move/from16 v14, v23

    .line 57
    invoke-static/range {v0 .. v14}, Landroidx/compose/material3/SliderKt;->Slider(FLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function3;Landroidx/compose/ui/Modifier;ZLkotlin/ranges/ClosedFloatingPointRange;ILkotlin/jvm/functions/Function0;Landroidx/compose/material3/SliderColors;Landroidx/compose/foundation/interaction/MutableInteractionSource;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;III)V

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v0

    if-eqz v0, :cond_2f

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    :cond_2f
    move-object/from16 v3, v16

    move-object/from16 v5, v17

    move/from16 v6, v18

    move-object/from16 v7, v19

    move-object/from16 v9, v20

    move-object/from16 v8, v24

    move/from16 v4, v25

    .line 58
    :goto_1f
    invoke-interface/range {v26 .. v26}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    move-result-object v13

    if-nez v13, :cond_30

    goto :goto_20

    :cond_30
    new-instance v14, Landroidx/compose/material3/SliderKt$Slider$7;

    move-object v0, v14

    move/from16 v1, p0

    move-object/from16 v2, p1

    move-object/from16 v10, p9

    move/from16 v11, p11

    move/from16 v12, p12

    invoke-direct/range {v0 .. v12}, Landroidx/compose/material3/SliderKt$Slider$7;-><init>(FLkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZLkotlin/ranges/ClosedFloatingPointRange;ILkotlin/jvm/functions/Function0;Landroidx/compose/material3/SliderColors;Landroidx/compose/foundation/interaction/MutableInteractionSource;Lkotlin/jvm/functions/Function3;II)V

    invoke-interface {v13, v14}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lkotlin/jvm/functions/Function2;)V

    :goto_20
    return-void
.end method

.method public static final Slider(FLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function3;Landroidx/compose/ui/Modifier;ZLkotlin/ranges/ClosedFloatingPointRange;ILkotlin/jvm/functions/Function0;Landroidx/compose/material3/SliderColors;Landroidx/compose/foundation/interaction/MutableInteractionSource;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;III)V
    .locals 47
    .annotation runtime Landroidx/compose/material3/ExperimentalMaterial3Api;
    .end annotation

    .annotation build Landroidx/compose/runtime/Composable;
    .end annotation

    .annotation build Landroidx/compose/runtime/ComposableInferredTarget;
        scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(F",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Ljava/lang/Float;",
            "Lkotlin/Unit;",
            ">;",
            "Lkotlin/jvm/functions/Function3<",
            "-",
            "Landroidx/compose/material3/SliderPositions;",
            "-",
            "Landroidx/compose/runtime/Composer;",
            "-",
            "Ljava/lang/Integer;",
            "Lkotlin/Unit;",
            ">;",
            "Landroidx/compose/ui/Modifier;",
            "Z",
            "Lkotlin/ranges/ClosedFloatingPointRange<",
            "Ljava/lang/Float;",
            ">;I",
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;",
            "Landroidx/compose/material3/SliderColors;",
            "Landroidx/compose/foundation/interaction/MutableInteractionSource;",
            "Lkotlin/jvm/functions/Function3<",
            "-",
            "Landroidx/compose/material3/SliderPositions;",
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

    move-object/from16 v12, p1

    move-object/from16 v13, p2

    move/from16 v14, p12

    move/from16 v15, p14

    const-string v0, "onValueChange"

    invoke-static {v12, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "track"

    invoke-static {v13, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const v0, 0x1711f46b

    move-object/from16 v1, p11

    .line 59
    invoke-interface {v1, v0}, Landroidx/compose/runtime/Composer;->startRestartGroup(I)Landroidx/compose/runtime/Composer;

    move-result-object v11

    and-int/lit8 v1, v15, 0x1

    if-eqz v1, :cond_0

    or-int/lit8 v1, v14, 0x6

    move/from16 v10, p0

    goto :goto_1

    :cond_0
    and-int/lit8 v1, v14, 0xe

    move/from16 v10, p0

    if-nez v1, :cond_2

    invoke-interface {v11, v10}, Landroidx/compose/runtime/Composer;->changed(F)Z

    move-result v1

    if-eqz v1, :cond_1

    const/4 v1, 0x4

    goto :goto_0

    :cond_1
    const/4 v1, 0x2

    :goto_0
    or-int/2addr v1, v14

    goto :goto_1

    :cond_2
    move v1, v14

    :goto_1
    and-int/lit8 v4, v15, 0x2

    if-eqz v4, :cond_3

    or-int/lit8 v1, v1, 0x30

    goto :goto_3

    :cond_3
    and-int/lit8 v4, v14, 0x70

    if-nez v4, :cond_5

    invoke-interface {v11, v12}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_4

    const/16 v4, 0x20

    goto :goto_2

    :cond_4
    const/16 v4, 0x10

    :goto_2
    or-int/2addr v1, v4

    :cond_5
    :goto_3
    and-int/lit8 v4, v15, 0x4

    if-eqz v4, :cond_6

    or-int/lit16 v1, v1, 0x180

    goto :goto_5

    :cond_6
    and-int/lit16 v4, v14, 0x380

    if-nez v4, :cond_8

    invoke-interface {v11, v13}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_7

    const/16 v4, 0x100

    goto :goto_4

    :cond_7
    const/16 v4, 0x80

    :goto_4
    or-int/2addr v1, v4

    :cond_8
    :goto_5
    and-int/lit8 v4, v15, 0x8

    if-eqz v4, :cond_9

    or-int/lit16 v1, v1, 0xc00

    goto :goto_7

    :cond_9
    and-int/lit16 v5, v14, 0x1c00

    if-nez v5, :cond_b

    move-object/from16 v5, p3

    invoke-interface {v11, v5}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_a

    const/16 v6, 0x800

    goto :goto_6

    :cond_a
    const/16 v6, 0x400

    :goto_6
    or-int/2addr v1, v6

    goto :goto_8

    :cond_b
    :goto_7
    move-object/from16 v5, p3

    :goto_8
    and-int/lit8 v6, v15, 0x10

    const v7, 0xe000

    if-eqz v6, :cond_c

    or-int/lit16 v1, v1, 0x6000

    goto :goto_a

    :cond_c
    and-int v8, v14, v7

    if-nez v8, :cond_e

    move/from16 v8, p4

    invoke-interface {v11, v8}, Landroidx/compose/runtime/Composer;->changed(Z)Z

    move-result v9

    if-eqz v9, :cond_d

    const/16 v9, 0x4000

    goto :goto_9

    :cond_d
    const/16 v9, 0x2000

    :goto_9
    or-int/2addr v1, v9

    goto :goto_b

    :cond_e
    :goto_a
    move/from16 v8, p4

    :goto_b
    const/high16 v9, 0x70000

    and-int v16, v14, v9

    if-nez v16, :cond_10

    and-int/lit8 v16, v15, 0x20

    move-object/from16 v2, p5

    if-nez v16, :cond_f

    invoke-interface {v11, v2}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v16

    if-eqz v16, :cond_f

    const/high16 v16, 0x20000

    goto :goto_c

    :cond_f
    const/high16 v16, 0x10000

    :goto_c
    or-int v1, v1, v16

    goto :goto_d

    :cond_10
    move-object/from16 v2, p5

    :goto_d
    and-int/lit8 v16, v15, 0x40

    const/high16 v41, 0x380000

    if-eqz v16, :cond_11

    const/high16 v17, 0x180000

    or-int v1, v1, v17

    move/from16 v9, p6

    goto :goto_f

    :cond_11
    and-int v17, v14, v41

    move/from16 v9, p6

    if-nez v17, :cond_13

    invoke-interface {v11, v9}, Landroidx/compose/runtime/Composer;->changed(I)Z

    move-result v17

    if-eqz v17, :cond_12

    const/high16 v17, 0x100000

    goto :goto_e

    :cond_12
    const/high16 v17, 0x80000

    :goto_e
    or-int v1, v1, v17

    :cond_13
    :goto_f
    and-int/lit16 v7, v15, 0x80

    const/high16 v42, 0x1c00000

    if-eqz v7, :cond_14

    const/high16 v17, 0xc00000

    or-int v1, v1, v17

    move-object/from16 v0, p7

    goto :goto_11

    :cond_14
    and-int v17, v14, v42

    move-object/from16 v0, p7

    if-nez v17, :cond_16

    invoke-interface {v11, v0}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v17

    if-eqz v17, :cond_15

    const/high16 v17, 0x800000

    goto :goto_10

    :cond_15
    const/high16 v17, 0x400000

    :goto_10
    or-int v1, v1, v17

    :cond_16
    :goto_11
    const/high16 v43, 0xe000000

    and-int v17, v14, v43

    if-nez v17, :cond_19

    and-int/lit16 v3, v15, 0x100

    if-nez v3, :cond_17

    move-object/from16 v3, p8

    invoke-interface {v11, v3}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v18

    if-eqz v18, :cond_18

    const/high16 v18, 0x4000000

    goto :goto_12

    :cond_17
    move-object/from16 v3, p8

    :cond_18
    const/high16 v18, 0x2000000

    :goto_12
    or-int v1, v1, v18

    goto :goto_13

    :cond_19
    move-object/from16 v3, p8

    :goto_13
    and-int/lit16 v0, v15, 0x200

    const/high16 v44, 0x70000000

    if-eqz v0, :cond_1a

    const/high16 v18, 0x30000000

    or-int v1, v1, v18

    move-object/from16 v2, p9

    goto :goto_15

    :cond_1a
    and-int v18, v14, v44

    move-object/from16 v2, p9

    if-nez v18, :cond_1c

    invoke-interface {v11, v2}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v18

    if-eqz v18, :cond_1b

    const/high16 v18, 0x20000000

    goto :goto_14

    :cond_1b
    const/high16 v18, 0x10000000

    :goto_14
    or-int v1, v1, v18

    :cond_1c
    :goto_15
    and-int/lit8 v18, p13, 0xe

    if-nez v18, :cond_1f

    and-int/lit16 v2, v15, 0x400

    if-nez v2, :cond_1d

    move-object/from16 v2, p10

    invoke-interface {v11, v2}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v18

    if-eqz v18, :cond_1e

    const/16 v18, 0x4

    goto :goto_16

    :cond_1d
    move-object/from16 v2, p10

    :cond_1e
    const/16 v18, 0x2

    :goto_16
    or-int v18, p13, v18

    move/from16 v45, v18

    goto :goto_17

    :cond_1f
    move-object/from16 v2, p10

    move/from16 v45, p13

    :goto_17
    const v18, 0x5b6db6db

    and-int v2, v1, v18

    const v3, 0x12492492

    if-ne v2, v3, :cond_21

    and-int/lit8 v2, v45, 0xb

    const/4 v3, 0x2

    if-ne v2, v3, :cond_21

    invoke-interface {v11}, Landroidx/compose/runtime/Composer;->getSkipping()Z

    move-result v2

    if-nez v2, :cond_20

    goto :goto_18

    .line 60
    :cond_20
    invoke-interface {v11}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    move-object/from16 v6, p5

    move-object/from16 v10, p9

    move-object v4, v5

    move v5, v8

    move v7, v9

    move-object/from16 v25, v11

    move-object/from16 v8, p7

    move-object/from16 v9, p8

    move-object/from16 v11, p10

    goto/16 :goto_25

    .line 61
    :cond_21
    :goto_18
    invoke-interface {v11}, Landroidx/compose/runtime/Composer;->startDefaults()V

    and-int/lit8 v2, v14, 0x1

    const v17, -0x70001

    if-eqz v2, :cond_26

    invoke-interface {v11}, Landroidx/compose/runtime/Composer;->getDefaultsInvalid()Z

    move-result v2

    if-eqz v2, :cond_22

    goto :goto_19

    .line 62
    :cond_22
    invoke-interface {v11}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    and-int/lit8 v0, v15, 0x20

    if-eqz v0, :cond_23

    and-int v1, v1, v17

    :cond_23
    and-int/lit16 v0, v15, 0x100

    if-eqz v0, :cond_24

    const v0, -0xe000001

    and-int/2addr v1, v0

    :cond_24
    and-int/lit16 v0, v15, 0x400

    if-eqz v0, :cond_25

    and-int/lit8 v45, v45, -0xf

    :cond_25
    move-object/from16 v18, p5

    move-object/from16 v20, p7

    move-object/from16 v21, p8

    move-object/from16 v22, p9

    move-object/from16 v23, p10

    move-object/from16 v16, v5

    move/from16 v17, v8

    move/from16 v19, v9

    move/from16 v2, v45

    const/4 v0, 0x1

    goto/16 :goto_23

    :cond_26
    :goto_19
    if-eqz v4, :cond_27

    .line 63
    sget-object v2, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    goto :goto_1a

    :cond_27
    move-object v2, v5

    :goto_1a
    if-eqz v6, :cond_28

    const/4 v8, 0x1

    :cond_28
    and-int/lit8 v4, v15, 0x20

    if-eqz v4, :cond_29

    const/4 v4, 0x0

    const/high16 v5, 0x3f800000    # 1.0f

    .line 64
    invoke-static {v4, v5}, Lkotlin/ranges/RangesKt;->rangeTo(FF)Lkotlin/ranges/ClosedFloatingPointRange;

    move-result-object v4

    and-int v1, v1, v17

    goto :goto_1b

    :cond_29
    move-object/from16 v4, p5

    :goto_1b
    if-eqz v16, :cond_2a

    const/4 v5, 0x0

    goto :goto_1c

    :cond_2a
    move v5, v9

    :goto_1c
    if-eqz v7, :cond_2b

    const/4 v6, 0x0

    goto :goto_1d

    :cond_2b
    move-object/from16 v6, p7

    :goto_1d
    and-int/lit16 v7, v15, 0x100

    if-eqz v7, :cond_2c

    .line 65
    sget-object v16, Landroidx/compose/material3/SliderDefaults;->INSTANCE:Landroidx/compose/material3/SliderDefaults;

    const-wide/16 v17, 0x0

    const-wide/16 v19, 0x0

    const-wide/16 v21, 0x0

    const-wide/16 v23, 0x0

    const-wide/16 v25, 0x0

    const-wide/16 v27, 0x0

    const-wide/16 v29, 0x0

    const-wide/16 v31, 0x0

    const-wide/16 v33, 0x0

    const-wide/16 v35, 0x0

    const/16 v38, 0x0

    const/16 v39, 0x6

    const/16 v40, 0x3ff

    move-object/from16 v37, v11

    invoke-virtual/range {v16 .. v40}, Landroidx/compose/material3/SliderDefaults;->colors-q0g_0yA(JJJJJJJJJJLandroidx/compose/runtime/Composer;III)Landroidx/compose/material3/SliderColors;

    move-result-object v7

    const v9, -0xe000001

    and-int/2addr v1, v9

    goto :goto_1e

    :cond_2c
    move-object/from16 v7, p8

    :goto_1e
    if-eqz v0, :cond_2e

    const v0, -0x1d58f75c

    .line 66
    invoke-interface {v11, v0}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 67
    invoke-interface {v11}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v0

    .line 68
    sget-object v9, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    invoke-virtual {v9}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v9

    if-ne v0, v9, :cond_2d

    .line 69
    invoke-static {}, Landroidx/compose/foundation/interaction/InteractionSourceKt;->MutableInteractionSource()Landroidx/compose/foundation/interaction/MutableInteractionSource;

    move-result-object v0

    .line 70
    invoke-interface {v11, v0}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 71
    :cond_2d
    invoke-interface {v11}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    check-cast v0, Landroidx/compose/foundation/interaction/MutableInteractionSource;

    goto :goto_1f

    :cond_2e
    move-object/from16 v0, p9

    :goto_1f
    and-int/lit16 v9, v15, 0x400

    if-eqz v9, :cond_31

    .line 72
    invoke-static {v8}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v9

    const v3, 0x607fb4c4

    invoke-interface {v11, v3}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 73
    invoke-interface {v11, v0}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v3

    .line 74
    invoke-interface {v11, v7}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v16

    or-int v3, v3, v16

    .line 75
    invoke-interface {v11, v9}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v9

    or-int/2addr v3, v9

    .line 76
    invoke-interface {v11}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v9

    if-nez v3, :cond_30

    .line 77
    sget-object v3, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    invoke-virtual {v3}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v3

    if-ne v9, v3, :cond_2f

    goto :goto_20

    :cond_2f
    move-object/from16 v16, v0

    const/4 v0, 0x1

    goto :goto_21

    .line 78
    :cond_30
    :goto_20
    new-instance v3, Landroidx/compose/material3/SliderKt$Slider$9$1;

    invoke-direct {v3, v0, v7, v8, v1}, Landroidx/compose/material3/SliderKt$Slider$9$1;-><init>(Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/material3/SliderColors;ZI)V

    const v9, 0x622f8718

    move-object/from16 v16, v0

    const/4 v0, 0x1

    invoke-static {v9, v0, v3}, Landroidx/compose/runtime/internal/ComposableLambdaKt;->composableLambdaInstance(IZLjava/lang/Object;)Landroidx/compose/runtime/internal/ComposableLambda;

    move-result-object v9

    .line 79
    invoke-interface {v11, v9}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 80
    :goto_21
    invoke-interface {v11}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    check-cast v9, Lkotlin/jvm/functions/Function3;

    and-int/lit8 v45, v45, -0xf

    move-object/from16 v18, v4

    move/from16 v19, v5

    move-object/from16 v20, v6

    move-object/from16 v21, v7

    move/from16 v17, v8

    move-object/from16 v23, v9

    goto :goto_22

    :cond_31
    move-object/from16 v16, v0

    const/4 v0, 0x1

    move-object/from16 v23, p10

    move-object/from16 v18, v4

    move/from16 v19, v5

    move-object/from16 v20, v6

    move-object/from16 v21, v7

    move/from16 v17, v8

    :goto_22
    move-object/from16 v22, v16

    move-object/from16 v16, v2

    move/from16 v2, v45

    :goto_23
    invoke-interface {v11}, Landroidx/compose/runtime/Composer;->endDefaults()V

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v3

    if-eqz v3, :cond_32

    const-string v3, "androidx.compose.material3.Slider (Slider.kt:312)"

    const v4, 0x1711f46b

    .line 81
    invoke-static {v4, v1, v2, v3}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    :cond_32
    if-ltz v19, :cond_33

    move v3, v0

    goto :goto_24

    :cond_33
    const/4 v3, 0x0

    :goto_24
    if-eqz v3, :cond_36

    shr-int/lit8 v0, v1, 0x9

    and-int/lit8 v3, v0, 0xe

    and-int/lit8 v4, v0, 0x70

    or-int/2addr v3, v4

    shr-int/lit8 v4, v1, 0x15

    and-int/lit16 v4, v4, 0x380

    or-int/2addr v3, v4

    shl-int/lit8 v4, v1, 0x6

    and-int/lit16 v5, v4, 0x1c00

    or-int/2addr v3, v5

    const v5, 0xe000

    and-int/2addr v0, v5

    or-int/2addr v0, v3

    shr-int/lit8 v3, v1, 0x3

    const/high16 v5, 0x70000

    and-int/2addr v3, v5

    or-int/2addr v0, v3

    shl-int/lit8 v3, v1, 0x12

    and-int v3, v3, v41

    or-int/2addr v0, v3

    and-int v3, v4, v42

    or-int/2addr v0, v3

    shl-int/lit8 v2, v2, 0x18

    and-int v2, v2, v43

    or-int/2addr v0, v2

    shl-int/lit8 v1, v1, 0x15

    and-int v1, v1, v44

    or-int v24, v0, v1

    move-object/from16 v0, v16

    move/from16 v1, v17

    move-object/from16 v2, v22

    move-object/from16 v3, p1

    move-object/from16 v4, v20

    move/from16 v5, v19

    move/from16 v6, p0

    move-object/from16 v7, v18

    move-object/from16 v8, v23

    move-object/from16 v9, p2

    move-object v10, v11

    move-object/from16 v25, v11

    move/from16 v11, v24

    .line 82
    invoke-static/range {v0 .. v11}, Landroidx/compose/material3/SliderKt;->SliderImpl(Landroidx/compose/ui/Modifier;ZLandroidx/compose/foundation/interaction/MutableInteractionSource;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;IFLkotlin/ranges/ClosedFloatingPointRange;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;I)V

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v0

    if-eqz v0, :cond_34

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    :cond_34
    move-object/from16 v4, v16

    move/from16 v5, v17

    move-object/from16 v6, v18

    move/from16 v7, v19

    move-object/from16 v8, v20

    move-object/from16 v9, v21

    move-object/from16 v10, v22

    move-object/from16 v11, v23

    .line 83
    :goto_25
    invoke-interface/range {v25 .. v25}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    move-result-object v3

    if-nez v3, :cond_35

    goto :goto_26

    :cond_35
    new-instance v2, Landroidx/compose/material3/SliderKt$Slider$11;

    move-object v0, v2

    move/from16 v1, p0

    move-object v15, v2

    move-object/from16 v2, p1

    move-object v12, v3

    move-object/from16 v3, p2

    move-object v13, v12

    move/from16 v12, p12

    move-object v14, v13

    move/from16 v13, p13

    move-object/from16 v46, v14

    move/from16 v14, p14

    invoke-direct/range {v0 .. v14}, Landroidx/compose/material3/SliderKt$Slider$11;-><init>(FLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function3;Landroidx/compose/ui/Modifier;ZLkotlin/ranges/ClosedFloatingPointRange;ILkotlin/jvm/functions/Function0;Landroidx/compose/material3/SliderColors;Landroidx/compose/foundation/interaction/MutableInteractionSource;Lkotlin/jvm/functions/Function3;III)V

    move-object/from16 v0, v46

    invoke-interface {v0, v15}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lkotlin/jvm/functions/Function2;)V

    :goto_26
    return-void

    .line 84
    :cond_36
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string/jumbo v1, "steps should be >= 0"

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method private static final SliderImpl(Landroidx/compose/ui/Modifier;ZLandroidx/compose/foundation/interaction/MutableInteractionSource;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;IFLkotlin/ranges/ClosedFloatingPointRange;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;I)V
    .locals 32
    .annotation build Landroidx/compose/runtime/Composable;
    .end annotation

    .annotation build Landroidx/compose/runtime/ComposableInferredTarget;
        scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/ui/Modifier;",
            "Z",
            "Landroidx/compose/foundation/interaction/MutableInteractionSource;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Ljava/lang/Float;",
            "Lkotlin/Unit;",
            ">;",
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;IF",
            "Lkotlin/ranges/ClosedFloatingPointRange<",
            "Ljava/lang/Float;",
            ">;",
            "Lkotlin/jvm/functions/Function3<",
            "-",
            "Landroidx/compose/material3/SliderPositions;",
            "-",
            "Landroidx/compose/runtime/Composer;",
            "-",
            "Ljava/lang/Integer;",
            "Lkotlin/Unit;",
            ">;",
            "Lkotlin/jvm/functions/Function3<",
            "-",
            "Landroidx/compose/material3/SliderPositions;",
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
    move/from16 v11, p1

    .line 2
    .line 3
    move-object/from16 v12, p2

    .line 4
    .line 5
    move-object/from16 v13, p3

    .line 6
    .line 7
    move-object/from16 v14, p4

    .line 8
    .line 9
    move/from16 v15, p6

    .line 10
    .line 11
    move-object/from16 v10, p7

    .line 12
    .line 13
    move-object/from16 v9, p8

    .line 14
    .line 15
    move-object/from16 v8, p9

    .line 16
    .line 17
    move/from16 v7, p11

    .line 18
    .line 19
    const v0, 0x32bd32f4

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
    move-result-object v6

    .line 28
    and-int/lit8 v1, v7, 0xe

    .line 29
    .line 30
    move-object/from16 v5, p0

    .line 31
    .line 32
    if-nez v1, :cond_1

    .line 33
    .line 34
    invoke-interface {v6, v5}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 35
    .line 36
    .line 37
    move-result v1

    .line 38
    if-eqz v1, :cond_0

    .line 39
    .line 40
    const/4 v1, 0x4

    .line 41
    goto :goto_0

    .line 42
    :cond_0
    const/4 v1, 0x2

    .line 43
    :goto_0
    or-int/2addr v1, v7

    .line 44
    goto :goto_1

    .line 45
    :cond_1
    move v1, v7

    .line 46
    :goto_1
    and-int/lit8 v3, v7, 0x70

    .line 47
    .line 48
    if-nez v3, :cond_3

    .line 49
    .line 50
    invoke-interface {v6, v11}, Landroidx/compose/runtime/Composer;->changed(Z)Z

    .line 51
    .line 52
    .line 53
    move-result v3

    .line 54
    if-eqz v3, :cond_2

    .line 55
    .line 56
    const/16 v3, 0x20

    .line 57
    .line 58
    goto :goto_2

    .line 59
    :cond_2
    const/16 v3, 0x10

    .line 60
    .line 61
    :goto_2
    or-int/2addr v1, v3

    .line 62
    :cond_3
    and-int/lit16 v3, v7, 0x380

    .line 63
    .line 64
    if-nez v3, :cond_5

    .line 65
    .line 66
    invoke-interface {v6, v12}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 67
    .line 68
    .line 69
    move-result v3

    .line 70
    if-eqz v3, :cond_4

    .line 71
    .line 72
    const/16 v3, 0x100

    .line 73
    .line 74
    goto :goto_3

    .line 75
    :cond_4
    const/16 v3, 0x80

    .line 76
    .line 77
    :goto_3
    or-int/2addr v1, v3

    .line 78
    :cond_5
    and-int/lit16 v3, v7, 0x1c00

    .line 79
    .line 80
    if-nez v3, :cond_7

    .line 81
    .line 82
    invoke-interface {v6, v13}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 83
    .line 84
    .line 85
    move-result v3

    .line 86
    if-eqz v3, :cond_6

    .line 87
    .line 88
    const/16 v3, 0x800

    .line 89
    .line 90
    goto :goto_4

    .line 91
    :cond_6
    const/16 v3, 0x400

    .line 92
    .line 93
    :goto_4
    or-int/2addr v1, v3

    .line 94
    :cond_7
    const v3, 0xe000

    .line 95
    .line 96
    .line 97
    and-int/2addr v3, v7

    .line 98
    if-nez v3, :cond_9

    .line 99
    .line 100
    invoke-interface {v6, v14}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 101
    .line 102
    .line 103
    move-result v3

    .line 104
    if-eqz v3, :cond_8

    .line 105
    .line 106
    const/16 v3, 0x4000

    .line 107
    .line 108
    goto :goto_5

    .line 109
    :cond_8
    const/16 v3, 0x2000

    .line 110
    .line 111
    :goto_5
    or-int/2addr v1, v3

    .line 112
    :cond_9
    const/high16 v3, 0x70000

    .line 113
    .line 114
    and-int/2addr v3, v7

    .line 115
    move/from16 v4, p5

    .line 116
    .line 117
    if-nez v3, :cond_b

    .line 118
    .line 119
    invoke-interface {v6, v4}, Landroidx/compose/runtime/Composer;->changed(I)Z

    .line 120
    .line 121
    .line 122
    move-result v3

    .line 123
    if-eqz v3, :cond_a

    .line 124
    .line 125
    const/high16 v3, 0x20000

    .line 126
    .line 127
    goto :goto_6

    .line 128
    :cond_a
    const/high16 v3, 0x10000

    .line 129
    .line 130
    :goto_6
    or-int/2addr v1, v3

    .line 131
    :cond_b
    const/high16 v3, 0x380000

    .line 132
    .line 133
    and-int/2addr v3, v7

    .line 134
    if-nez v3, :cond_d

    .line 135
    .line 136
    invoke-interface {v6, v15}, Landroidx/compose/runtime/Composer;->changed(F)Z

    .line 137
    .line 138
    .line 139
    move-result v3

    .line 140
    if-eqz v3, :cond_c

    .line 141
    .line 142
    const/high16 v3, 0x100000

    .line 143
    .line 144
    goto :goto_7

    .line 145
    :cond_c
    const/high16 v3, 0x80000

    .line 146
    .line 147
    :goto_7
    or-int/2addr v1, v3

    .line 148
    :cond_d
    const/high16 v3, 0x1c00000

    .line 149
    .line 150
    and-int/2addr v3, v7

    .line 151
    if-nez v3, :cond_f

    .line 152
    .line 153
    invoke-interface {v6, v10}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 154
    .line 155
    .line 156
    move-result v3

    .line 157
    if-eqz v3, :cond_e

    .line 158
    .line 159
    const/high16 v3, 0x800000

    .line 160
    .line 161
    goto :goto_8

    .line 162
    :cond_e
    const/high16 v3, 0x400000

    .line 163
    .line 164
    :goto_8
    or-int/2addr v1, v3

    .line 165
    :cond_f
    const/high16 v3, 0xe000000

    .line 166
    .line 167
    and-int/2addr v3, v7

    .line 168
    if-nez v3, :cond_11

    .line 169
    .line 170
    invoke-interface {v6, v9}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 171
    .line 172
    .line 173
    move-result v3

    .line 174
    if-eqz v3, :cond_10

    .line 175
    .line 176
    const/high16 v3, 0x4000000

    .line 177
    .line 178
    goto :goto_9

    .line 179
    :cond_10
    const/high16 v3, 0x2000000

    .line 180
    .line 181
    :goto_9
    or-int/2addr v1, v3

    .line 182
    :cond_11
    const/high16 v3, 0x70000000

    .line 183
    .line 184
    and-int/2addr v3, v7

    .line 185
    if-nez v3, :cond_13

    .line 186
    .line 187
    invoke-interface {v6, v8}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 188
    .line 189
    .line 190
    move-result v3

    .line 191
    if-eqz v3, :cond_12

    .line 192
    .line 193
    const/high16 v3, 0x20000000

    .line 194
    .line 195
    goto :goto_a

    .line 196
    :cond_12
    const/high16 v3, 0x10000000

    .line 197
    .line 198
    :goto_a
    or-int/2addr v1, v3

    .line 199
    :cond_13
    move v3, v1

    .line 200
    const v1, 0x5b6db6db

    .line 201
    .line 202
    .line 203
    and-int/2addr v1, v3

    .line 204
    const v2, 0x12492492

    .line 205
    .line 206
    .line 207
    if-ne v1, v2, :cond_15

    .line 208
    .line 209
    invoke-interface {v6}, Landroidx/compose/runtime/Composer;->getSkipping()Z

    .line 210
    .line 211
    .line 212
    move-result v1

    .line 213
    if-nez v1, :cond_14

    .line 214
    .line 215
    goto :goto_b

    .line 216
    :cond_14
    invoke-interface {v6}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    .line 217
    .line 218
    .line 219
    move-object v13, v6

    .line 220
    move-object v10, v8

    .line 221
    goto/16 :goto_15

    .line 222
    .line 223
    :cond_15
    :goto_b
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 224
    .line 225
    .line 226
    move-result v1

    .line 227
    if-eqz v1, :cond_16

    .line 228
    .line 229
    const/4 v1, -0x1

    .line 230
    const-string v2, "androidx.compose.material3.SliderImpl (Slider.kt:798)"

    .line 231
    .line 232
    invoke-static {v0, v3, v1, v2}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 233
    .line 234
    .line 235
    :cond_16
    invoke-static/range {p6 .. p6}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 236
    .line 237
    .line 238
    move-result-object v0

    .line 239
    const v1, 0x1e7b2b64

    .line 240
    .line 241
    .line 242
    invoke-interface {v6, v1}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 243
    .line 244
    .line 245
    invoke-interface {v6, v0}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 246
    .line 247
    .line 248
    move-result v0

    .line 249
    invoke-interface {v6, v13}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 250
    .line 251
    .line 252
    move-result v1

    .line 253
    or-int/2addr v0, v1

    .line 254
    invoke-interface {v6}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 255
    .line 256
    .line 257
    move-result-object v1

    .line 258
    if-nez v0, :cond_17

    .line 259
    .line 260
    sget-object v0, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    .line 261
    .line 262
    invoke-virtual {v0}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    .line 263
    .line 264
    .line 265
    move-result-object v0

    .line 266
    if-ne v1, v0, :cond_18

    .line 267
    .line 268
    :cond_17
    new-instance v1, Landroidx/compose/material3/SliderKt$SliderImpl$onValueChangeState$1$1;

    .line 269
    .line 270
    invoke-direct {v1, v15, v13}, Landroidx/compose/material3/SliderKt$SliderImpl$onValueChangeState$1$1;-><init>(FLkotlin/jvm/functions/Function1;)V

    .line 271
    .line 272
    .line 273
    invoke-interface {v6, v1}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 274
    .line 275
    .line 276
    :cond_18
    invoke-interface {v6}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 277
    .line 278
    .line 279
    const/4 v2, 0x0

    .line 280
    invoke-static {v1, v6, v2}, Landroidx/compose/runtime/SnapshotStateKt;->rememberUpdatedState(Ljava/lang/Object;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;

    .line 281
    .line 282
    .line 283
    move-result-object v16

    .line 284
    invoke-static/range {p5 .. p5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 285
    .line 286
    .line 287
    move-result-object v0

    .line 288
    const v1, 0x44faf204

    .line 289
    .line 290
    .line 291
    invoke-interface {v6, v1}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 292
    .line 293
    .line 294
    invoke-interface {v6, v0}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 295
    .line 296
    .line 297
    move-result v0

    .line 298
    invoke-interface {v6}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 299
    .line 300
    .line 301
    move-result-object v1

    .line 302
    if-nez v0, :cond_19

    .line 303
    .line 304
    sget-object v0, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    .line 305
    .line 306
    invoke-virtual {v0}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    .line 307
    .line 308
    .line 309
    move-result-object v0

    .line 310
    if-ne v1, v0, :cond_1a

    .line 311
    .line 312
    :cond_19
    invoke-static/range {p5 .. p5}, Landroidx/compose/material3/SliderKt;->access$stepsToTickFractions(I)[F

    .line 313
    .line 314
    .line 315
    move-result-object v1

    .line 316
    invoke-interface {v6, v1}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 317
    .line 318
    .line 319
    :cond_1a
    invoke-interface {v6}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 320
    .line 321
    .line 322
    check-cast v1, [F

    .line 323
    .line 324
    const v0, -0x1d58f75c

    .line 325
    .line 326
    .line 327
    invoke-interface {v6, v0}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 328
    .line 329
    .line 330
    invoke-interface {v6}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 331
    .line 332
    .line 333
    move-result-object v2

    .line 334
    sget-object v19, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    .line 335
    .line 336
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    .line 337
    .line 338
    .line 339
    move-result-object v0

    .line 340
    const/4 v9, 0x0

    .line 341
    if-ne v2, v0, :cond_1b

    .line 342
    .line 343
    invoke-static {}, Landroidx/compose/material3/SliderKt;->getThumbWidth()F

    .line 344
    .line 345
    .line 346
    move-result v0

    .line 347
    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 348
    .line 349
    .line 350
    move-result-object v0

    .line 351
    const/4 v2, 0x2

    .line 352
    invoke-static {v0, v9, v2, v9}, Landroidx/compose/runtime/SnapshotStateKt;->mutableStateOf$default(Ljava/lang/Object;Landroidx/compose/runtime/SnapshotMutationPolicy;ILjava/lang/Object;)Landroidx/compose/runtime/MutableState;

    .line 353
    .line 354
    .line 355
    move-result-object v0

    .line 356
    invoke-interface {v6, v0}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 357
    .line 358
    .line 359
    move/from16 v31, v2

    .line 360
    .line 361
    move-object v2, v0

    .line 362
    move/from16 v0, v31

    .line 363
    .line 364
    goto :goto_c

    .line 365
    :cond_1b
    const/4 v0, 0x2

    .line 366
    :goto_c
    invoke-interface {v6}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 367
    .line 368
    .line 369
    check-cast v2, Landroidx/compose/runtime/MutableState;

    .line 370
    .line 371
    const v0, -0x1d58f75c

    .line 372
    .line 373
    .line 374
    invoke-interface {v6, v0}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 375
    .line 376
    .line 377
    invoke-interface {v6}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 378
    .line 379
    .line 380
    move-result-object v0

    .line 381
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    .line 382
    .line 383
    .line 384
    move-result-object v9

    .line 385
    if-ne v0, v9, :cond_1c

    .line 386
    .line 387
    const/4 v9, 0x0

    .line 388
    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 389
    .line 390
    .line 391
    move-result-object v0

    .line 392
    move-object/from16 v21, v2

    .line 393
    .line 394
    const/4 v2, 0x0

    .line 395
    const/4 v9, 0x2

    .line 396
    invoke-static {v0, v2, v9, v2}, Landroidx/compose/runtime/SnapshotStateKt;->mutableStateOf$default(Ljava/lang/Object;Landroidx/compose/runtime/SnapshotMutationPolicy;ILjava/lang/Object;)Landroidx/compose/runtime/MutableState;

    .line 397
    .line 398
    .line 399
    move-result-object v0

    .line 400
    invoke-interface {v6, v0}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 401
    .line 402
    .line 403
    goto :goto_d

    .line 404
    :cond_1c
    move-object/from16 v21, v2

    .line 405
    .line 406
    :goto_d
    invoke-interface {v6}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 407
    .line 408
    .line 409
    move-object v9, v0

    .line 410
    check-cast v9, Landroidx/compose/runtime/MutableState;

    .line 411
    .line 412
    invoke-static {}, Landroidx/compose/ui/platform/CompositionLocalsKt;->getLocalLayoutDirection()Landroidx/compose/runtime/ProvidableCompositionLocal;

    .line 413
    .line 414
    .line 415
    move-result-object v0

    .line 416
    invoke-interface {v6, v0}, Landroidx/compose/runtime/Composer;->consume(Landroidx/compose/runtime/CompositionLocal;)Ljava/lang/Object;

    .line 417
    .line 418
    .line 419
    move-result-object v0

    .line 420
    sget-object v2, Landroidx/compose/ui/unit/LayoutDirection;->Rtl:Landroidx/compose/ui/unit/LayoutDirection;

    .line 421
    .line 422
    if-ne v0, v2, :cond_1d

    .line 423
    .line 424
    const/4 v0, 0x1

    .line 425
    move/from16 v22, v0

    .line 426
    .line 427
    const v0, -0x1d58f75c

    .line 428
    .line 429
    .line 430
    goto :goto_e

    .line 431
    :cond_1d
    const v0, -0x1d58f75c

    .line 432
    .line 433
    .line 434
    const/16 v22, 0x0

    .line 435
    .line 436
    :goto_e
    invoke-interface {v6, v0}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 437
    .line 438
    .line 439
    invoke-interface {v6}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 440
    .line 441
    .line 442
    move-result-object v0

    .line 443
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    .line 444
    .line 445
    .line 446
    move-result-object v2

    .line 447
    const/4 v4, 0x0

    .line 448
    if-ne v0, v2, :cond_1e

    .line 449
    .line 450
    invoke-static {v10, v4, v4, v15}, Landroidx/compose/material3/SliderKt;->access$SliderImpl$scaleToOffset(Lkotlin/ranges/ClosedFloatingPointRange;FFF)F

    .line 451
    .line 452
    .line 453
    move-result v0

    .line 454
    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 455
    .line 456
    .line 457
    move-result-object v0

    .line 458
    const/4 v2, 0x2

    .line 459
    const/4 v4, 0x0

    .line 460
    invoke-static {v0, v4, v2, v4}, Landroidx/compose/runtime/SnapshotStateKt;->mutableStateOf$default(Ljava/lang/Object;Landroidx/compose/runtime/SnapshotMutationPolicy;ILjava/lang/Object;)Landroidx/compose/runtime/MutableState;

    .line 461
    .line 462
    .line 463
    move-result-object v0

    .line 464
    invoke-interface {v6, v0}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 465
    .line 466
    .line 467
    goto :goto_f

    .line 468
    :cond_1e
    const/4 v2, 0x2

    .line 469
    const/4 v4, 0x0

    .line 470
    :goto_f
    invoke-interface {v6}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 471
    .line 472
    .line 473
    move-object/from16 v23, v0

    .line 474
    .line 475
    check-cast v23, Landroidx/compose/runtime/MutableState;

    .line 476
    .line 477
    const v0, -0x1d58f75c

    .line 478
    .line 479
    .line 480
    invoke-interface {v6, v0}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 481
    .line 482
    .line 483
    invoke-interface {v6}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 484
    .line 485
    .line 486
    move-result-object v0

    .line 487
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    .line 488
    .line 489
    .line 490
    move-result-object v2

    .line 491
    if-ne v0, v2, :cond_1f

    .line 492
    .line 493
    const/4 v2, 0x0

    .line 494
    invoke-static {v2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 495
    .line 496
    .line 497
    move-result-object v0

    .line 498
    const/4 v2, 0x2

    .line 499
    invoke-static {v0, v4, v2, v4}, Landroidx/compose/runtime/SnapshotStateKt;->mutableStateOf$default(Ljava/lang/Object;Landroidx/compose/runtime/SnapshotMutationPolicy;ILjava/lang/Object;)Landroidx/compose/runtime/MutableState;

    .line 500
    .line 501
    .line 502
    move-result-object v0

    .line 503
    invoke-interface {v6, v0}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 504
    .line 505
    .line 506
    :cond_1f
    invoke-interface {v6}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 507
    .line 508
    .line 509
    move-object/from16 v24, v0

    .line 510
    .line 511
    check-cast v24, Landroidx/compose/runtime/MutableState;

    .line 512
    .line 513
    invoke-interface/range {p7 .. p7}, Lkotlin/ranges/ClosedRange;->getStart()Ljava/lang/Comparable;

    .line 514
    .line 515
    .line 516
    move-result-object v0

    .line 517
    check-cast v0, Ljava/lang/Number;

    .line 518
    .line 519
    invoke-virtual {v0}, Ljava/lang/Number;->floatValue()F

    .line 520
    .line 521
    .line 522
    move-result v0

    .line 523
    invoke-interface/range {p7 .. p7}, Lkotlin/ranges/ClosedRange;->getEndInclusive()Ljava/lang/Comparable;

    .line 524
    .line 525
    .line 526
    move-result-object v2

    .line 527
    check-cast v2, Ljava/lang/Number;

    .line 528
    .line 529
    invoke-virtual {v2}, Ljava/lang/Number;->floatValue()F

    .line 530
    .line 531
    .line 532
    move-result v2

    .line 533
    invoke-static {v15, v0, v2}, Lkotlin/ranges/RangesKt;->coerceIn(FFF)F

    .line 534
    .line 535
    .line 536
    move-result v0

    .line 537
    invoke-interface/range {p7 .. p7}, Lkotlin/ranges/ClosedRange;->getStart()Ljava/lang/Comparable;

    .line 538
    .line 539
    .line 540
    move-result-object v2

    .line 541
    check-cast v2, Ljava/lang/Number;

    .line 542
    .line 543
    invoke-virtual {v2}, Ljava/lang/Number;->floatValue()F

    .line 544
    .line 545
    .line 546
    move-result v2

    .line 547
    invoke-interface/range {p7 .. p7}, Lkotlin/ranges/ClosedRange;->getEndInclusive()Ljava/lang/Comparable;

    .line 548
    .line 549
    .line 550
    move-result-object v4

    .line 551
    check-cast v4, Ljava/lang/Number;

    .line 552
    .line 553
    invoke-virtual {v4}, Ljava/lang/Number;->floatValue()F

    .line 554
    .line 555
    .line 556
    move-result v4

    .line 557
    invoke-static {v2, v4, v0}, Landroidx/compose/material3/SliderKt;->calcFraction(FFF)F

    .line 558
    .line 559
    .line 560
    move-result v4

    .line 561
    const v0, -0x1d58f75c

    .line 562
    .line 563
    .line 564
    invoke-interface {v6, v0}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 565
    .line 566
    .line 567
    invoke-interface {v6}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 568
    .line 569
    .line 570
    move-result-object v0

    .line 571
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    .line 572
    .line 573
    .line 574
    move-result-object v2

    .line 575
    if-ne v0, v2, :cond_20

    .line 576
    .line 577
    new-instance v0, Landroidx/compose/material3/SliderPositions;

    .line 578
    .line 579
    invoke-direct {v0, v4, v1}, Landroidx/compose/material3/SliderPositions;-><init>(F[F)V

    .line 580
    .line 581
    .line 582
    invoke-interface {v6, v0}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 583
    .line 584
    .line 585
    :cond_20
    invoke-interface {v6}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 586
    .line 587
    .line 588
    move-object v2, v0

    .line 589
    check-cast v2, Landroidx/compose/material3/SliderPositions;

    .line 590
    .line 591
    invoke-virtual {v2, v4}, Landroidx/compose/material3/SliderPositions;->setPositionFraction$material3_release(F)V

    .line 592
    .line 593
    .line 594
    invoke-virtual {v2, v1}, Landroidx/compose/material3/SliderPositions;->setTickFractions$material3_release([F)V

    .line 595
    .line 596
    .line 597
    shr-int/lit8 v20, v3, 0x15

    .line 598
    .line 599
    const v0, 0x44faf204

    .line 600
    .line 601
    .line 602
    invoke-interface {v6, v0}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 603
    .line 604
    .line 605
    invoke-interface {v6, v10}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 606
    .line 607
    .line 608
    move-result v17

    .line 609
    invoke-interface {v6}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 610
    .line 611
    .line 612
    move-result-object v0

    .line 613
    if-nez v17, :cond_22

    .line 614
    .line 615
    move-object/from16 v17, v1

    .line 616
    .line 617
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    .line 618
    .line 619
    .line 620
    move-result-object v1

    .line 621
    if-ne v0, v1, :cond_21

    .line 622
    .line 623
    goto :goto_10

    .line 624
    :cond_21
    move-object/from16 v27, v2

    .line 625
    .line 626
    move/from16 v18, v3

    .line 627
    .line 628
    move/from16 v28, v4

    .line 629
    .line 630
    move-object v10, v6

    .line 631
    move-object/from16 p10, v21

    .line 632
    .line 633
    goto :goto_11

    .line 634
    :cond_22
    move-object/from16 v17, v1

    .line 635
    .line 636
    :goto_10
    new-instance v1, Landroidx/compose/material3/SliderDraggableState;

    .line 637
    .line 638
    new-instance v0, Landroidx/compose/material3/SliderKt$SliderImpl$draggableState$1$1;

    .line 639
    .line 640
    move-object/from16 v25, v0

    .line 641
    .line 642
    const v26, 0x44faf204

    .line 643
    .line 644
    .line 645
    move-object v8, v1

    .line 646
    move/from16 v10, v26

    .line 647
    .line 648
    move-object v1, v9

    .line 649
    move-object/from16 v27, v2

    .line 650
    .line 651
    move-object/from16 p10, v21

    .line 652
    .line 653
    const/4 v10, 0x0

    .line 654
    move-object/from16 v2, p10

    .line 655
    .line 656
    move/from16 v18, v3

    .line 657
    .line 658
    move-object/from16 v3, v23

    .line 659
    .line 660
    move/from16 v28, v4

    .line 661
    .line 662
    move-object/from16 v4, v24

    .line 663
    .line 664
    move-object/from16 v5, v17

    .line 665
    .line 666
    move-object v10, v6

    .line 667
    move-object/from16 v6, v16

    .line 668
    .line 669
    move-object/from16 v7, p7

    .line 670
    .line 671
    invoke-direct/range {v0 .. v7}, Landroidx/compose/material3/SliderKt$SliderImpl$draggableState$1$1;-><init>(Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;[FLandroidx/compose/runtime/State;Lkotlin/ranges/ClosedFloatingPointRange;)V

    .line 672
    .line 673
    .line 674
    invoke-direct {v8, v0}, Landroidx/compose/material3/SliderDraggableState;-><init>(Lkotlin/jvm/functions/Function1;)V

    .line 675
    .line 676
    .line 677
    invoke-interface {v10, v8}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 678
    .line 679
    .line 680
    move-object v0, v8

    .line 681
    :goto_11
    invoke-interface {v10}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 682
    .line 683
    .line 684
    move-object v8, v0

    .line 685
    check-cast v8, Landroidx/compose/material3/SliderDraggableState;

    .line 686
    .line 687
    new-instance v0, Landroidx/compose/material3/SliderKt$SliderImpl$gestureEndAction$1;

    .line 688
    .line 689
    invoke-direct {v0, v8, v14}, Landroidx/compose/material3/SliderKt$SliderImpl$gestureEndAction$1;-><init>(Landroidx/compose/material3/SliderDraggableState;Lkotlin/jvm/functions/Function0;)V

    .line 690
    .line 691
    .line 692
    const/4 v7, 0x0

    .line 693
    invoke-static {v0, v10, v7}, Landroidx/compose/runtime/SnapshotStateKt;->rememberUpdatedState(Ljava/lang/Object;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;

    .line 694
    .line 695
    .line 696
    move-result-object v6

    .line 697
    sget-object v5, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    .line 698
    .line 699
    invoke-interface {v9}, Landroidx/compose/runtime/MutableState;->getValue()Ljava/lang/Object;

    .line 700
    .line 701
    .line 702
    move-result-object v0

    .line 703
    check-cast v0, Ljava/lang/Number;

    .line 704
    .line 705
    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    .line 706
    .line 707
    .line 708
    move-result v3

    .line 709
    move-object v0, v5

    .line 710
    move-object v1, v8

    .line 711
    move-object/from16 v2, p2

    .line 712
    .line 713
    move/from16 v4, v22

    .line 714
    .line 715
    move-object/from16 v16, v5

    .line 716
    .line 717
    move-object/from16 v5, v23

    .line 718
    .line 719
    move-object/from16 v17, v6

    .line 720
    .line 721
    move/from16 v21, v7

    .line 722
    .line 723
    move-object/from16 v7, v24

    .line 724
    .line 725
    move-object/from16 v23, v8

    .line 726
    .line 727
    move/from16 v8, p1

    .line 728
    .line 729
    invoke-static/range {v0 .. v8}, Landroidx/compose/material3/SliderKt;->sliderTapModifier(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/gestures/DraggableState;Landroidx/compose/foundation/interaction/MutableInteractionSource;IZLandroidx/compose/runtime/State;Landroidx/compose/runtime/State;Landroidx/compose/runtime/MutableState;Z)Landroidx/compose/ui/Modifier;

    .line 730
    .line 731
    .line 732
    move-result-object v8

    .line 733
    sget-object v2, Landroidx/compose/foundation/gestures/Orientation;->Horizontal:Landroidx/compose/foundation/gestures/Orientation;

    .line 734
    .line 735
    invoke-virtual/range {v23 .. v23}, Landroidx/compose/material3/SliderDraggableState;->isDragging()Z

    .line 736
    .line 737
    .line 738
    move-result v5

    .line 739
    const/4 v6, 0x0

    .line 740
    const v0, 0x44faf204

    .line 741
    .line 742
    .line 743
    invoke-interface {v10, v0}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 744
    .line 745
    .line 746
    move-object/from16 v0, v17

    .line 747
    .line 748
    invoke-interface {v10, v0}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 749
    .line 750
    .line 751
    move-result v1

    .line 752
    invoke-interface {v10}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 753
    .line 754
    .line 755
    move-result-object v3

    .line 756
    if-nez v1, :cond_23

    .line 757
    .line 758
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    .line 759
    .line 760
    .line 761
    move-result-object v1

    .line 762
    if-ne v3, v1, :cond_24

    .line 763
    .line 764
    :cond_23
    new-instance v3, Landroidx/compose/material3/SliderKt$SliderImpl$drag$1$1;

    .line 765
    .line 766
    const/4 v1, 0x0

    .line 767
    invoke-direct {v3, v0, v1}, Landroidx/compose/material3/SliderKt$SliderImpl$drag$1$1;-><init>(Landroidx/compose/runtime/State;Lkotlin/coroutines/Continuation;)V

    .line 768
    .line 769
    .line 770
    invoke-interface {v10, v3}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 771
    .line 772
    .line 773
    :cond_24
    invoke-interface {v10}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 774
    .line 775
    .line 776
    move-object v7, v3

    .line 777
    check-cast v7, Lkotlin/jvm/functions/Function3;

    .line 778
    .line 779
    const/16 v17, 0x20

    .line 780
    .line 781
    const/16 v19, 0x0

    .line 782
    .line 783
    move-object/from16 v0, v16

    .line 784
    .line 785
    move-object/from16 v1, v23

    .line 786
    .line 787
    move/from16 v3, p1

    .line 788
    .line 789
    move-object/from16 v4, p2

    .line 790
    .line 791
    move-object/from16 v29, v8

    .line 792
    .line 793
    move/from16 v8, v22

    .line 794
    .line 795
    move-object/from16 v30, v9

    .line 796
    .line 797
    move/from16 v9, v17

    .line 798
    .line 799
    move-object v13, v10

    .line 800
    move/from16 v17, v21

    .line 801
    .line 802
    move-object/from16 v10, v19

    .line 803
    .line 804
    invoke-static/range {v0 .. v10}, Landroidx/compose/foundation/gestures/DraggableKt;->draggable$default(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/gestures/DraggableState;Landroidx/compose/foundation/gestures/Orientation;ZLandroidx/compose/foundation/interaction/MutableInteractionSource;ZLkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function3;ZILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    .line 805
    .line 806
    .line 807
    move-result-object v7

    .line 808
    invoke-static/range {p0 .. p0}, Landroidx/compose/material3/TouchTargetKt;->minimumTouchTargetSize(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    .line 809
    .line 810
    .line 811
    move-result-object v0

    .line 812
    sget-object v1, Landroidx/compose/material3/tokens/SliderTokens;->INSTANCE:Landroidx/compose/material3/tokens/SliderTokens;

    .line 813
    .line 814
    invoke-virtual {v1}, Landroidx/compose/material3/tokens/SliderTokens;->getHandleWidth-D9Ej5fM()F

    .line 815
    .line 816
    .line 817
    move-result v2

    .line 818
    invoke-virtual {v1}, Landroidx/compose/material3/tokens/SliderTokens;->getHandleHeight-D9Ej5fM()F

    .line 819
    .line 820
    .line 821
    move-result v3

    .line 822
    const/4 v4, 0x0

    .line 823
    const/4 v5, 0x0

    .line 824
    const/16 v6, 0xc

    .line 825
    .line 826
    const/4 v8, 0x0

    .line 827
    move v1, v2

    .line 828
    move v2, v3

    .line 829
    move v3, v4

    .line 830
    move v4, v5

    .line 831
    move v5, v6

    .line 832
    move-object v6, v8

    .line 833
    invoke-static/range {v0 .. v6}, Landroidx/compose/foundation/layout/SizeKt;->requiredSizeIn-qDBjuR0$default(Landroidx/compose/ui/Modifier;FFFFILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    .line 834
    .line 835
    .line 836
    move-result-object v0

    .line 837
    move/from16 v1, p6

    .line 838
    .line 839
    move/from16 v2, p1

    .line 840
    .line 841
    move-object/from16 v3, p3

    .line 842
    .line 843
    move-object/from16 v4, p4

    .line 844
    .line 845
    move-object/from16 v5, p7

    .line 846
    .line 847
    move/from16 v6, p5

    .line 848
    .line 849
    invoke-static/range {v0 .. v6}, Landroidx/compose/material3/SliderKt;->sliderSemantics(Landroidx/compose/ui/Modifier;FZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/ranges/ClosedFloatingPointRange;I)Landroidx/compose/ui/Modifier;

    .line 850
    .line 851
    .line 852
    move-result-object v0

    .line 853
    invoke-static {v0, v11, v12}, Landroidx/compose/foundation/FocusableKt;->focusable(Landroidx/compose/ui/Modifier;ZLandroidx/compose/foundation/interaction/MutableInteractionSource;)Landroidx/compose/ui/Modifier;

    .line 854
    .line 855
    .line 856
    move-result-object v0

    .line 857
    move-object/from16 v1, v29

    .line 858
    .line 859
    invoke-interface {v0, v1}, Landroidx/compose/ui/Modifier;->then(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    .line 860
    .line 861
    .line 862
    move-result-object v0

    .line 863
    invoke-interface {v0, v7}, Landroidx/compose/ui/Modifier;->then(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    .line 864
    .line 865
    .line 866
    move-result-object v0

    .line 867
    new-instance v1, Landroidx/compose/material3/SliderKt$SliderImpl$2;

    .line 868
    .line 869
    move-object/from16 v2, p10

    .line 870
    .line 871
    move/from16 v4, v28

    .line 872
    .line 873
    move-object/from16 v3, v30

    .line 874
    .line 875
    invoke-direct {v1, v2, v3, v4}, Landroidx/compose/material3/SliderKt$SliderImpl$2;-><init>(Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;F)V

    .line 876
    .line 877
    .line 878
    const v2, -0x4ee9b9da

    .line 879
    .line 880
    .line 881
    invoke-interface {v13, v2}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 882
    .line 883
    .line 884
    invoke-static {}, Landroidx/compose/ui/platform/CompositionLocalsKt;->getLocalDensity()Landroidx/compose/runtime/ProvidableCompositionLocal;

    .line 885
    .line 886
    .line 887
    move-result-object v3

    .line 888
    invoke-interface {v13, v3}, Landroidx/compose/runtime/Composer;->consume(Landroidx/compose/runtime/CompositionLocal;)Ljava/lang/Object;

    .line 889
    .line 890
    .line 891
    move-result-object v3

    .line 892
    check-cast v3, Landroidx/compose/ui/unit/Density;

    .line 893
    .line 894
    invoke-static {}, Landroidx/compose/ui/platform/CompositionLocalsKt;->getLocalLayoutDirection()Landroidx/compose/runtime/ProvidableCompositionLocal;

    .line 895
    .line 896
    .line 897
    move-result-object v4

    .line 898
    invoke-interface {v13, v4}, Landroidx/compose/runtime/Composer;->consume(Landroidx/compose/runtime/CompositionLocal;)Ljava/lang/Object;

    .line 899
    .line 900
    .line 901
    move-result-object v4

    .line 902
    check-cast v4, Landroidx/compose/ui/unit/LayoutDirection;

    .line 903
    .line 904
    invoke-static {}, Landroidx/compose/ui/platform/CompositionLocalsKt;->getLocalViewConfiguration()Landroidx/compose/runtime/ProvidableCompositionLocal;

    .line 905
    .line 906
    .line 907
    move-result-object v5

    .line 908
    invoke-interface {v13, v5}, Landroidx/compose/runtime/Composer;->consume(Landroidx/compose/runtime/CompositionLocal;)Ljava/lang/Object;

    .line 909
    .line 910
    .line 911
    move-result-object v5

    .line 912
    check-cast v5, Landroidx/compose/ui/platform/ViewConfiguration;

    .line 913
    .line 914
    sget-object v6, Landroidx/compose/ui/node/ComposeUiNode;->Companion:Landroidx/compose/ui/node/ComposeUiNode$Companion;

    .line 915
    .line 916
    invoke-virtual {v6}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getConstructor()Lkotlin/jvm/functions/Function0;

    .line 917
    .line 918
    .line 919
    move-result-object v7

    .line 920
    invoke-static {v0}, Landroidx/compose/ui/layout/LayoutKt;->materializerOf(Landroidx/compose/ui/Modifier;)Lkotlin/jvm/functions/Function3;

    .line 921
    .line 922
    .line 923
    move-result-object v0

    .line 924
    invoke-interface {v13}, Landroidx/compose/runtime/Composer;->getApplier()Landroidx/compose/runtime/Applier;

    .line 925
    .line 926
    .line 927
    move-result-object v8

    .line 928
    instance-of v8, v8, Landroidx/compose/runtime/Applier;

    .line 929
    .line 930
    if-nez v8, :cond_25

    .line 931
    .line 932
    invoke-static {}, Landroidx/compose/runtime/ComposablesKt;->invalidApplier()V

    .line 933
    .line 934
    .line 935
    :cond_25
    invoke-interface {v13}, Landroidx/compose/runtime/Composer;->startReusableNode()V

    .line 936
    .line 937
    .line 938
    invoke-interface {v13}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 939
    .line 940
    .line 941
    move-result v8

    .line 942
    if-eqz v8, :cond_26

    .line 943
    .line 944
    invoke-interface {v13, v7}, Landroidx/compose/runtime/Composer;->createNode(Lkotlin/jvm/functions/Function0;)V

    .line 945
    .line 946
    .line 947
    goto :goto_12

    .line 948
    :cond_26
    invoke-interface {v13}, Landroidx/compose/runtime/Composer;->useNode()V

    .line 949
    .line 950
    .line 951
    :goto_12
    invoke-interface {v13}, Landroidx/compose/runtime/Composer;->disableReusing()V

    .line 952
    .line 953
    .line 954
    invoke-static {v13}, Landroidx/compose/runtime/Updater;->constructor-impl(Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;

    .line 955
    .line 956
    .line 957
    move-result-object v7

    .line 958
    invoke-virtual {v6}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetMeasurePolicy()Lkotlin/jvm/functions/Function2;

    .line 959
    .line 960
    .line 961
    move-result-object v8

    .line 962
    invoke-static {v7, v1, v8}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 963
    .line 964
    .line 965
    invoke-virtual {v6}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetDensity()Lkotlin/jvm/functions/Function2;

    .line 966
    .line 967
    .line 968
    move-result-object v1

    .line 969
    invoke-static {v7, v3, v1}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 970
    .line 971
    .line 972
    invoke-virtual {v6}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetLayoutDirection()Lkotlin/jvm/functions/Function2;

    .line 973
    .line 974
    .line 975
    move-result-object v1

    .line 976
    invoke-static {v7, v4, v1}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 977
    .line 978
    .line 979
    invoke-virtual {v6}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetViewConfiguration()Lkotlin/jvm/functions/Function2;

    .line 980
    .line 981
    .line 982
    move-result-object v1

    .line 983
    invoke-static {v7, v5, v1}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 984
    .line 985
    .line 986
    invoke-interface {v13}, Landroidx/compose/runtime/Composer;->enableReusing()V

    .line 987
    .line 988
    .line 989
    invoke-static {v13}, Landroidx/compose/runtime/SkippableUpdater;->constructor-impl(Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;

    .line 990
    .line 991
    .line 992
    move-result-object v1

    .line 993
    invoke-static {v1}, Landroidx/compose/runtime/SkippableUpdater;->box-impl(Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/SkippableUpdater;

    .line 994
    .line 995
    .line 996
    move-result-object v1

    .line 997
    invoke-static/range {v17 .. v17}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 998
    .line 999
    .line 1000
    move-result-object v3

    .line 1001
    invoke-interface {v0, v1, v13, v3}, Lkotlin/jvm/functions/Function3;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1002
    .line 1003
    .line 1004
    const v0, 0x7ab4aae9

    .line 1005
    .line 1006
    .line 1007
    invoke-interface {v13, v0}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 1008
    .line 1009
    .line 1010
    const v1, 0x6f7c935d

    .line 1011
    .line 1012
    .line 1013
    invoke-interface {v13, v1}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 1014
    .line 1015
    .line 1016
    sget-object v1, Landroidx/compose/material3/SliderComponents;->THUMB:Landroidx/compose/material3/SliderComponents;

    .line 1017
    .line 1018
    move-object/from16 v3, v16

    .line 1019
    .line 1020
    invoke-static {v3, v1}, Landroidx/compose/ui/layout/LayoutIdKt;->layoutId(Landroidx/compose/ui/Modifier;Ljava/lang/Object;)Landroidx/compose/ui/Modifier;

    .line 1021
    .line 1022
    .line 1023
    move-result-object v1

    .line 1024
    const v4, 0x2bb5b5d7

    .line 1025
    .line 1026
    .line 1027
    invoke-interface {v13, v4}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 1028
    .line 1029
    .line 1030
    sget-object v5, Landroidx/compose/ui/Alignment;->Companion:Landroidx/compose/ui/Alignment$Companion;

    .line 1031
    .line 1032
    invoke-virtual {v5}, Landroidx/compose/ui/Alignment$Companion;->getTopStart()Landroidx/compose/ui/Alignment;

    .line 1033
    .line 1034
    .line 1035
    move-result-object v7

    .line 1036
    move/from16 v8, v17

    .line 1037
    .line 1038
    invoke-static {v7, v8, v13, v8}, Landroidx/compose/foundation/layout/BoxKt;->rememberBoxMeasurePolicy(Landroidx/compose/ui/Alignment;ZLandroidx/compose/runtime/Composer;I)Landroidx/compose/ui/layout/MeasurePolicy;

    .line 1039
    .line 1040
    .line 1041
    move-result-object v7

    .line 1042
    invoke-interface {v13, v2}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 1043
    .line 1044
    .line 1045
    invoke-static {}, Landroidx/compose/ui/platform/CompositionLocalsKt;->getLocalDensity()Landroidx/compose/runtime/ProvidableCompositionLocal;

    .line 1046
    .line 1047
    .line 1048
    move-result-object v9

    .line 1049
    invoke-interface {v13, v9}, Landroidx/compose/runtime/Composer;->consume(Landroidx/compose/runtime/CompositionLocal;)Ljava/lang/Object;

    .line 1050
    .line 1051
    .line 1052
    move-result-object v9

    .line 1053
    check-cast v9, Landroidx/compose/ui/unit/Density;

    .line 1054
    .line 1055
    invoke-static {}, Landroidx/compose/ui/platform/CompositionLocalsKt;->getLocalLayoutDirection()Landroidx/compose/runtime/ProvidableCompositionLocal;

    .line 1056
    .line 1057
    .line 1058
    move-result-object v10

    .line 1059
    invoke-interface {v13, v10}, Landroidx/compose/runtime/Composer;->consume(Landroidx/compose/runtime/CompositionLocal;)Ljava/lang/Object;

    .line 1060
    .line 1061
    .line 1062
    move-result-object v10

    .line 1063
    check-cast v10, Landroidx/compose/ui/unit/LayoutDirection;

    .line 1064
    .line 1065
    invoke-static {}, Landroidx/compose/ui/platform/CompositionLocalsKt;->getLocalViewConfiguration()Landroidx/compose/runtime/ProvidableCompositionLocal;

    .line 1066
    .line 1067
    .line 1068
    move-result-object v2

    .line 1069
    invoke-interface {v13, v2}, Landroidx/compose/runtime/Composer;->consume(Landroidx/compose/runtime/CompositionLocal;)Ljava/lang/Object;

    .line 1070
    .line 1071
    .line 1072
    move-result-object v2

    .line 1073
    check-cast v2, Landroidx/compose/ui/platform/ViewConfiguration;

    .line 1074
    .line 1075
    invoke-virtual {v6}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getConstructor()Lkotlin/jvm/functions/Function0;

    .line 1076
    .line 1077
    .line 1078
    move-result-object v4

    .line 1079
    invoke-static {v1}, Landroidx/compose/ui/layout/LayoutKt;->materializerOf(Landroidx/compose/ui/Modifier;)Lkotlin/jvm/functions/Function3;

    .line 1080
    .line 1081
    .line 1082
    move-result-object v1

    .line 1083
    invoke-interface {v13}, Landroidx/compose/runtime/Composer;->getApplier()Landroidx/compose/runtime/Applier;

    .line 1084
    .line 1085
    .line 1086
    move-result-object v0

    .line 1087
    instance-of v0, v0, Landroidx/compose/runtime/Applier;

    .line 1088
    .line 1089
    if-nez v0, :cond_27

    .line 1090
    .line 1091
    invoke-static {}, Landroidx/compose/runtime/ComposablesKt;->invalidApplier()V

    .line 1092
    .line 1093
    .line 1094
    :cond_27
    invoke-interface {v13}, Landroidx/compose/runtime/Composer;->startReusableNode()V

    .line 1095
    .line 1096
    .line 1097
    invoke-interface {v13}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 1098
    .line 1099
    .line 1100
    move-result v0

    .line 1101
    if-eqz v0, :cond_28

    .line 1102
    .line 1103
    invoke-interface {v13, v4}, Landroidx/compose/runtime/Composer;->createNode(Lkotlin/jvm/functions/Function0;)V

    .line 1104
    .line 1105
    .line 1106
    goto :goto_13

    .line 1107
    :cond_28
    invoke-interface {v13}, Landroidx/compose/runtime/Composer;->useNode()V

    .line 1108
    .line 1109
    .line 1110
    :goto_13
    invoke-interface {v13}, Landroidx/compose/runtime/Composer;->disableReusing()V

    .line 1111
    .line 1112
    .line 1113
    invoke-static {v13}, Landroidx/compose/runtime/Updater;->constructor-impl(Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;

    .line 1114
    .line 1115
    .line 1116
    move-result-object v0

    .line 1117
    invoke-virtual {v6}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetMeasurePolicy()Lkotlin/jvm/functions/Function2;

    .line 1118
    .line 1119
    .line 1120
    move-result-object v4

    .line 1121
    invoke-static {v0, v7, v4}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 1122
    .line 1123
    .line 1124
    invoke-virtual {v6}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetDensity()Lkotlin/jvm/functions/Function2;

    .line 1125
    .line 1126
    .line 1127
    move-result-object v4

    .line 1128
    invoke-static {v0, v9, v4}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 1129
    .line 1130
    .line 1131
    invoke-virtual {v6}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetLayoutDirection()Lkotlin/jvm/functions/Function2;

    .line 1132
    .line 1133
    .line 1134
    move-result-object v4

    .line 1135
    invoke-static {v0, v10, v4}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 1136
    .line 1137
    .line 1138
    invoke-virtual {v6}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetViewConfiguration()Lkotlin/jvm/functions/Function2;

    .line 1139
    .line 1140
    .line 1141
    move-result-object v4

    .line 1142
    invoke-static {v0, v2, v4}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 1143
    .line 1144
    .line 1145
    invoke-interface {v13}, Landroidx/compose/runtime/Composer;->enableReusing()V

    .line 1146
    .line 1147
    .line 1148
    invoke-static {v13}, Landroidx/compose/runtime/SkippableUpdater;->constructor-impl(Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;

    .line 1149
    .line 1150
    .line 1151
    move-result-object v0

    .line 1152
    invoke-static {v0}, Landroidx/compose/runtime/SkippableUpdater;->box-impl(Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/SkippableUpdater;

    .line 1153
    .line 1154
    .line 1155
    move-result-object v0

    .line 1156
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1157
    .line 1158
    .line 1159
    move-result-object v2

    .line 1160
    invoke-interface {v1, v0, v13, v2}, Lkotlin/jvm/functions/Function3;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1161
    .line 1162
    .line 1163
    const v0, 0x7ab4aae9

    .line 1164
    .line 1165
    .line 1166
    invoke-interface {v13, v0}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 1167
    .line 1168
    .line 1169
    const v0, -0x7f65a980

    .line 1170
    .line 1171
    .line 1172
    invoke-interface {v13, v0}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 1173
    .line 1174
    .line 1175
    sget-object v1, Landroidx/compose/foundation/layout/BoxScopeInstance;->INSTANCE:Landroidx/compose/foundation/layout/BoxScopeInstance;

    .line 1176
    .line 1177
    const v1, -0x48c455e9

    .line 1178
    .line 1179
    .line 1180
    invoke-interface {v13, v1}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 1181
    .line 1182
    .line 1183
    and-int/lit8 v1, v20, 0x70

    .line 1184
    .line 1185
    or-int/lit8 v1, v1, 0x6

    .line 1186
    .line 1187
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1188
    .line 1189
    .line 1190
    move-result-object v1

    .line 1191
    move-object/from16 v9, p8

    .line 1192
    .line 1193
    move-object/from16 v2, v27

    .line 1194
    .line 1195
    invoke-interface {v9, v2, v13, v1}, Lkotlin/jvm/functions/Function3;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1196
    .line 1197
    .line 1198
    invoke-interface {v13}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 1199
    .line 1200
    .line 1201
    invoke-interface {v13}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 1202
    .line 1203
    .line 1204
    invoke-interface {v13}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 1205
    .line 1206
    .line 1207
    invoke-interface {v13}, Landroidx/compose/runtime/Composer;->endNode()V

    .line 1208
    .line 1209
    .line 1210
    invoke-interface {v13}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 1211
    .line 1212
    .line 1213
    invoke-interface {v13}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 1214
    .line 1215
    .line 1216
    sget-object v1, Landroidx/compose/material3/SliderComponents;->TRACK:Landroidx/compose/material3/SliderComponents;

    .line 1217
    .line 1218
    invoke-static {v3, v1}, Landroidx/compose/ui/layout/LayoutIdKt;->layoutId(Landroidx/compose/ui/Modifier;Ljava/lang/Object;)Landroidx/compose/ui/Modifier;

    .line 1219
    .line 1220
    .line 1221
    move-result-object v1

    .line 1222
    const v3, 0x2bb5b5d7

    .line 1223
    .line 1224
    .line 1225
    invoke-interface {v13, v3}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 1226
    .line 1227
    .line 1228
    invoke-virtual {v5}, Landroidx/compose/ui/Alignment$Companion;->getTopStart()Landroidx/compose/ui/Alignment;

    .line 1229
    .line 1230
    .line 1231
    move-result-object v3

    .line 1232
    invoke-static {v3, v8, v13, v8}, Landroidx/compose/foundation/layout/BoxKt;->rememberBoxMeasurePolicy(Landroidx/compose/ui/Alignment;ZLandroidx/compose/runtime/Composer;I)Landroidx/compose/ui/layout/MeasurePolicy;

    .line 1233
    .line 1234
    .line 1235
    move-result-object v3

    .line 1236
    const v4, -0x4ee9b9da

    .line 1237
    .line 1238
    .line 1239
    invoke-interface {v13, v4}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 1240
    .line 1241
    .line 1242
    invoke-static {}, Landroidx/compose/ui/platform/CompositionLocalsKt;->getLocalDensity()Landroidx/compose/runtime/ProvidableCompositionLocal;

    .line 1243
    .line 1244
    .line 1245
    move-result-object v4

    .line 1246
    invoke-interface {v13, v4}, Landroidx/compose/runtime/Composer;->consume(Landroidx/compose/runtime/CompositionLocal;)Ljava/lang/Object;

    .line 1247
    .line 1248
    .line 1249
    move-result-object v4

    .line 1250
    check-cast v4, Landroidx/compose/ui/unit/Density;

    .line 1251
    .line 1252
    invoke-static {}, Landroidx/compose/ui/platform/CompositionLocalsKt;->getLocalLayoutDirection()Landroidx/compose/runtime/ProvidableCompositionLocal;

    .line 1253
    .line 1254
    .line 1255
    move-result-object v5

    .line 1256
    invoke-interface {v13, v5}, Landroidx/compose/runtime/Composer;->consume(Landroidx/compose/runtime/CompositionLocal;)Ljava/lang/Object;

    .line 1257
    .line 1258
    .line 1259
    move-result-object v5

    .line 1260
    check-cast v5, Landroidx/compose/ui/unit/LayoutDirection;

    .line 1261
    .line 1262
    invoke-static {}, Landroidx/compose/ui/platform/CompositionLocalsKt;->getLocalViewConfiguration()Landroidx/compose/runtime/ProvidableCompositionLocal;

    .line 1263
    .line 1264
    .line 1265
    move-result-object v7

    .line 1266
    invoke-interface {v13, v7}, Landroidx/compose/runtime/Composer;->consume(Landroidx/compose/runtime/CompositionLocal;)Ljava/lang/Object;

    .line 1267
    .line 1268
    .line 1269
    move-result-object v7

    .line 1270
    check-cast v7, Landroidx/compose/ui/platform/ViewConfiguration;

    .line 1271
    .line 1272
    invoke-virtual {v6}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getConstructor()Lkotlin/jvm/functions/Function0;

    .line 1273
    .line 1274
    .line 1275
    move-result-object v10

    .line 1276
    invoke-static {v1}, Landroidx/compose/ui/layout/LayoutKt;->materializerOf(Landroidx/compose/ui/Modifier;)Lkotlin/jvm/functions/Function3;

    .line 1277
    .line 1278
    .line 1279
    move-result-object v1

    .line 1280
    invoke-interface {v13}, Landroidx/compose/runtime/Composer;->getApplier()Landroidx/compose/runtime/Applier;

    .line 1281
    .line 1282
    .line 1283
    move-result-object v0

    .line 1284
    instance-of v0, v0, Landroidx/compose/runtime/Applier;

    .line 1285
    .line 1286
    if-nez v0, :cond_29

    .line 1287
    .line 1288
    invoke-static {}, Landroidx/compose/runtime/ComposablesKt;->invalidApplier()V

    .line 1289
    .line 1290
    .line 1291
    :cond_29
    invoke-interface {v13}, Landroidx/compose/runtime/Composer;->startReusableNode()V

    .line 1292
    .line 1293
    .line 1294
    invoke-interface {v13}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 1295
    .line 1296
    .line 1297
    move-result v0

    .line 1298
    if-eqz v0, :cond_2a

    .line 1299
    .line 1300
    invoke-interface {v13, v10}, Landroidx/compose/runtime/Composer;->createNode(Lkotlin/jvm/functions/Function0;)V

    .line 1301
    .line 1302
    .line 1303
    goto :goto_14

    .line 1304
    :cond_2a
    invoke-interface {v13}, Landroidx/compose/runtime/Composer;->useNode()V

    .line 1305
    .line 1306
    .line 1307
    :goto_14
    invoke-interface {v13}, Landroidx/compose/runtime/Composer;->disableReusing()V

    .line 1308
    .line 1309
    .line 1310
    invoke-static {v13}, Landroidx/compose/runtime/Updater;->constructor-impl(Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;

    .line 1311
    .line 1312
    .line 1313
    move-result-object v0

    .line 1314
    invoke-virtual {v6}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetMeasurePolicy()Lkotlin/jvm/functions/Function2;

    .line 1315
    .line 1316
    .line 1317
    move-result-object v10

    .line 1318
    invoke-static {v0, v3, v10}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 1319
    .line 1320
    .line 1321
    invoke-virtual {v6}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetDensity()Lkotlin/jvm/functions/Function2;

    .line 1322
    .line 1323
    .line 1324
    move-result-object v3

    .line 1325
    invoke-static {v0, v4, v3}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 1326
    .line 1327
    .line 1328
    invoke-virtual {v6}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetLayoutDirection()Lkotlin/jvm/functions/Function2;

    .line 1329
    .line 1330
    .line 1331
    move-result-object v3

    .line 1332
    invoke-static {v0, v5, v3}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 1333
    .line 1334
    .line 1335
    invoke-virtual {v6}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetViewConfiguration()Lkotlin/jvm/functions/Function2;

    .line 1336
    .line 1337
    .line 1338
    move-result-object v3

    .line 1339
    invoke-static {v0, v7, v3}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 1340
    .line 1341
    .line 1342
    invoke-interface {v13}, Landroidx/compose/runtime/Composer;->enableReusing()V

    .line 1343
    .line 1344
    .line 1345
    invoke-static {v13}, Landroidx/compose/runtime/SkippableUpdater;->constructor-impl(Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;

    .line 1346
    .line 1347
    .line 1348
    move-result-object v0

    .line 1349
    invoke-static {v0}, Landroidx/compose/runtime/SkippableUpdater;->box-impl(Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/SkippableUpdater;

    .line 1350
    .line 1351
    .line 1352
    move-result-object v0

    .line 1353
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1354
    .line 1355
    .line 1356
    move-result-object v3

    .line 1357
    invoke-interface {v1, v0, v13, v3}, Lkotlin/jvm/functions/Function3;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1358
    .line 1359
    .line 1360
    const v0, 0x7ab4aae9

    .line 1361
    .line 1362
    .line 1363
    invoke-interface {v13, v0}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 1364
    .line 1365
    .line 1366
    const v0, -0x7f65a980

    .line 1367
    .line 1368
    .line 1369
    invoke-interface {v13, v0}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 1370
    .line 1371
    .line 1372
    const v0, 0x39e99d40

    .line 1373
    .line 1374
    .line 1375
    invoke-interface {v13, v0}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 1376
    .line 1377
    .line 1378
    shr-int/lit8 v0, v18, 0x18

    .line 1379
    .line 1380
    and-int/lit8 v0, v0, 0x70

    .line 1381
    .line 1382
    or-int/lit8 v0, v0, 0x6

    .line 1383
    .line 1384
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1385
    .line 1386
    .line 1387
    move-result-object v0

    .line 1388
    move-object/from16 v10, p9

    .line 1389
    .line 1390
    invoke-interface {v10, v2, v13, v0}, Lkotlin/jvm/functions/Function3;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1391
    .line 1392
    .line 1393
    invoke-interface {v13}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 1394
    .line 1395
    .line 1396
    invoke-interface {v13}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 1397
    .line 1398
    .line 1399
    invoke-interface {v13}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 1400
    .line 1401
    .line 1402
    invoke-interface {v13}, Landroidx/compose/runtime/Composer;->endNode()V

    .line 1403
    .line 1404
    .line 1405
    invoke-interface {v13}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 1406
    .line 1407
    .line 1408
    invoke-interface {v13}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 1409
    .line 1410
    .line 1411
    invoke-interface {v13}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 1412
    .line 1413
    .line 1414
    invoke-interface {v13}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 1415
    .line 1416
    .line 1417
    invoke-interface {v13}, Landroidx/compose/runtime/Composer;->endNode()V

    .line 1418
    .line 1419
    .line 1420
    invoke-interface {v13}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 1421
    .line 1422
    .line 1423
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 1424
    .line 1425
    .line 1426
    move-result v0

    .line 1427
    if-eqz v0, :cond_2b

    .line 1428
    .line 1429
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 1430
    .line 1431
    .line 1432
    :cond_2b
    :goto_15
    invoke-interface {v13}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    .line 1433
    .line 1434
    .line 1435
    move-result-object v13

    .line 1436
    if-nez v13, :cond_2c

    .line 1437
    .line 1438
    goto :goto_16

    .line 1439
    :cond_2c
    new-instance v8, Landroidx/compose/material3/SliderKt$SliderImpl$3;

    .line 1440
    .line 1441
    move-object v0, v8

    .line 1442
    move-object/from16 v1, p0

    .line 1443
    .line 1444
    move/from16 v2, p1

    .line 1445
    .line 1446
    move-object/from16 v3, p2

    .line 1447
    .line 1448
    move-object/from16 v4, p3

    .line 1449
    .line 1450
    move-object/from16 v5, p4

    .line 1451
    .line 1452
    move/from16 v6, p5

    .line 1453
    .line 1454
    move/from16 v7, p6

    .line 1455
    .line 1456
    move-object v12, v8

    .line 1457
    move-object/from16 v8, p7

    .line 1458
    .line 1459
    move-object/from16 v9, p8

    .line 1460
    .line 1461
    move-object/from16 v10, p9

    .line 1462
    .line 1463
    move/from16 v11, p11

    .line 1464
    .line 1465
    invoke-direct/range {v0 .. v11}, Landroidx/compose/material3/SliderKt$SliderImpl$3;-><init>(Landroidx/compose/ui/Modifier;ZLandroidx/compose/foundation/interaction/MutableInteractionSource;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;IFLkotlin/ranges/ClosedFloatingPointRange;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function3;I)V

    .line 1466
    .line 1467
    .line 1468
    invoke-interface {v13, v12}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lkotlin/jvm/functions/Function2;)V

    .line 1469
    .line 1470
    .line 1471
    :goto_16
    return-void
.end method

.method private static final SliderImpl$scaleToOffset(Lkotlin/ranges/ClosedFloatingPointRange;FFF)F
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/ranges/ClosedFloatingPointRange<",
            "Ljava/lang/Float;",
            ">;FFF)F"
        }
    .end annotation

    .line 1
    invoke-interface {p0}, Lkotlin/ranges/ClosedRange;->getStart()Ljava/lang/Comparable;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    check-cast v0, Ljava/lang/Number;

    .line 6
    .line 7
    invoke-virtual {v0}, Ljava/lang/Number;->floatValue()F

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    invoke-interface {p0}, Lkotlin/ranges/ClosedRange;->getEndInclusive()Ljava/lang/Comparable;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    check-cast p0, Ljava/lang/Number;

    .line 16
    .line 17
    invoke-virtual {p0}, Ljava/lang/Number;->floatValue()F

    .line 18
    .line 19
    .line 20
    move-result p0

    .line 21
    invoke-static {v0, p0, p3, p1, p2}, Landroidx/compose/material3/SliderKt;->scale(FFFFF)F

    .line 22
    .line 23
    .line 24
    move-result p0

    .line 25
    return p0
.end method

.method private static final SliderImpl$scaleToUserValue(Lkotlin/ranges/ClosedFloatingPointRange;FFF)F
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/ranges/ClosedFloatingPointRange<",
            "Ljava/lang/Float;",
            ">;FFF)F"
        }
    .end annotation

    .line 1
    invoke-interface {p0}, Lkotlin/ranges/ClosedRange;->getStart()Ljava/lang/Comparable;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    check-cast v0, Ljava/lang/Number;

    .line 6
    .line 7
    invoke-virtual {v0}, Ljava/lang/Number;->floatValue()F

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    invoke-interface {p0}, Lkotlin/ranges/ClosedRange;->getEndInclusive()Ljava/lang/Comparable;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    check-cast p0, Ljava/lang/Number;

    .line 16
    .line 17
    invoke-virtual {p0}, Ljava/lang/Number;->floatValue()F

    .line 18
    .line 19
    .line 20
    move-result p0

    .line 21
    invoke-static {p1, p2, p3, v0, p0}, Landroidx/compose/material3/SliderKt;->scale(FFFFF)F

    .line 22
    .line 23
    .line 24
    move-result p0

    .line 25
    return p0
.end method

.method private static final TempRangeSliderThumb-rAjV9yQ(Landroidx/compose/foundation/layout/BoxScope;FLkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;I)V
    .locals 16
    .annotation build Landroidx/compose/runtime/Composable;
    .end annotation

    .annotation build Landroidx/compose/runtime/ComposableInferredTarget;
        scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/foundation/layout/BoxScope;",
            "F",
            "Lkotlin/jvm/functions/Function3<",
            "-",
            "Landroidx/compose/foundation/layout/BoxScope;",
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
    move/from16 v8, p1

    .line 4
    .line 5
    move-object/from16 v9, p2

    .line 6
    .line 7
    move/from16 v10, p4

    .line 8
    .line 9
    const v1, -0x7d6a4538    # -2.200079E-37f

    .line 10
    .line 11
    .line 12
    move-object/from16 v2, p3

    .line 13
    .line 14
    invoke-interface {v2, v1}, Landroidx/compose/runtime/Composer;->startRestartGroup(I)Landroidx/compose/runtime/Composer;

    .line 15
    .line 16
    .line 17
    move-result-object v11

    .line 18
    and-int/lit8 v2, v10, 0xe

    .line 19
    .line 20
    const/4 v12, 0x2

    .line 21
    if-nez v2, :cond_1

    .line 22
    .line 23
    invoke-interface {v11, v0}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 24
    .line 25
    .line 26
    move-result v2

    .line 27
    if-eqz v2, :cond_0

    .line 28
    .line 29
    const/4 v2, 0x4

    .line 30
    goto :goto_0

    .line 31
    :cond_0
    move v2, v12

    .line 32
    :goto_0
    or-int/2addr v2, v10

    .line 33
    goto :goto_1

    .line 34
    :cond_1
    move v2, v10

    .line 35
    :goto_1
    and-int/lit8 v3, v10, 0x70

    .line 36
    .line 37
    if-nez v3, :cond_3

    .line 38
    .line 39
    invoke-interface {v11, v8}, Landroidx/compose/runtime/Composer;->changed(F)Z

    .line 40
    .line 41
    .line 42
    move-result v3

    .line 43
    if-eqz v3, :cond_2

    .line 44
    .line 45
    const/16 v3, 0x20

    .line 46
    .line 47
    goto :goto_2

    .line 48
    :cond_2
    const/16 v3, 0x10

    .line 49
    .line 50
    :goto_2
    or-int/2addr v2, v3

    .line 51
    :cond_3
    and-int/lit16 v3, v10, 0x380

    .line 52
    .line 53
    if-nez v3, :cond_5

    .line 54
    .line 55
    invoke-interface {v11, v9}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 56
    .line 57
    .line 58
    move-result v3

    .line 59
    if-eqz v3, :cond_4

    .line 60
    .line 61
    const/16 v3, 0x100

    .line 62
    .line 63
    goto :goto_3

    .line 64
    :cond_4
    const/16 v3, 0x80

    .line 65
    .line 66
    :goto_3
    or-int/2addr v2, v3

    .line 67
    :cond_5
    move v13, v2

    .line 68
    and-int/lit16 v2, v13, 0x2db

    .line 69
    .line 70
    const/16 v3, 0x92

    .line 71
    .line 72
    if-ne v2, v3, :cond_7

    .line 73
    .line 74
    invoke-interface {v11}, Landroidx/compose/runtime/Composer;->getSkipping()Z

    .line 75
    .line 76
    .line 77
    move-result v2

    .line 78
    if-nez v2, :cond_6

    .line 79
    .line 80
    goto :goto_4

    .line 81
    :cond_6
    invoke-interface {v11}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    .line 82
    .line 83
    .line 84
    goto/16 :goto_8

    .line 85
    .line 86
    :cond_7
    :goto_4
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 87
    .line 88
    .line 89
    move-result v2

    .line 90
    if-eqz v2, :cond_8

    .line 91
    .line 92
    const/4 v2, -0x1

    .line 93
    const-string v3, "androidx.compose.material3.TempRangeSliderThumb (Slider.kt:946)"

    .line 94
    .line 95
    invoke-static {v1, v13, v2, v3}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 96
    .line 97
    .line 98
    :cond_8
    sget-object v1, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    .line 99
    .line 100
    const/4 v3, 0x0

    .line 101
    const/4 v4, 0x0

    .line 102
    const/4 v5, 0x0

    .line 103
    const/16 v6, 0xe

    .line 104
    .line 105
    const/4 v7, 0x0

    .line 106
    move/from16 v2, p1

    .line 107
    .line 108
    invoke-static/range {v1 .. v7}, Landroidx/compose/foundation/layout/PaddingKt;->padding-qDBjuR0$default(Landroidx/compose/ui/Modifier;FFFFILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    .line 109
    .line 110
    .line 111
    move-result-object v1

    .line 112
    sget-object v2, Landroidx/compose/ui/Alignment;->Companion:Landroidx/compose/ui/Alignment$Companion;

    .line 113
    .line 114
    invoke-virtual {v2}, Landroidx/compose/ui/Alignment$Companion;->getCenterStart()Landroidx/compose/ui/Alignment;

    .line 115
    .line 116
    .line 117
    move-result-object v3

    .line 118
    invoke-interface {v0, v1, v3}, Landroidx/compose/foundation/layout/BoxScope;->align(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/Alignment;)Landroidx/compose/ui/Modifier;

    .line 119
    .line 120
    .line 121
    move-result-object v1

    .line 122
    shl-int/lit8 v3, v13, 0x3

    .line 123
    .line 124
    and-int/lit16 v3, v3, 0x1c00

    .line 125
    .line 126
    const v4, 0x2bb5b5d7

    .line 127
    .line 128
    .line 129
    invoke-interface {v11, v4}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 130
    .line 131
    .line 132
    invoke-virtual {v2}, Landroidx/compose/ui/Alignment$Companion;->getTopStart()Landroidx/compose/ui/Alignment;

    .line 133
    .line 134
    .line 135
    move-result-object v2

    .line 136
    shr-int/lit8 v4, v3, 0x3

    .line 137
    .line 138
    and-int/lit8 v5, v4, 0xe

    .line 139
    .line 140
    and-int/lit8 v4, v4, 0x70

    .line 141
    .line 142
    or-int/2addr v4, v5

    .line 143
    const/4 v5, 0x0

    .line 144
    invoke-static {v2, v5, v11, v4}, Landroidx/compose/foundation/layout/BoxKt;->rememberBoxMeasurePolicy(Landroidx/compose/ui/Alignment;ZLandroidx/compose/runtime/Composer;I)Landroidx/compose/ui/layout/MeasurePolicy;

    .line 145
    .line 146
    .line 147
    move-result-object v2

    .line 148
    shl-int/lit8 v4, v3, 0x3

    .line 149
    .line 150
    and-int/lit8 v4, v4, 0x70

    .line 151
    .line 152
    const v5, -0x4ee9b9da

    .line 153
    .line 154
    .line 155
    invoke-interface {v11, v5}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 156
    .line 157
    .line 158
    invoke-static {}, Landroidx/compose/ui/platform/CompositionLocalsKt;->getLocalDensity()Landroidx/compose/runtime/ProvidableCompositionLocal;

    .line 159
    .line 160
    .line 161
    move-result-object v5

    .line 162
    invoke-interface {v11, v5}, Landroidx/compose/runtime/Composer;->consume(Landroidx/compose/runtime/CompositionLocal;)Ljava/lang/Object;

    .line 163
    .line 164
    .line 165
    move-result-object v5

    .line 166
    check-cast v5, Landroidx/compose/ui/unit/Density;

    .line 167
    .line 168
    invoke-static {}, Landroidx/compose/ui/platform/CompositionLocalsKt;->getLocalLayoutDirection()Landroidx/compose/runtime/ProvidableCompositionLocal;

    .line 169
    .line 170
    .line 171
    move-result-object v6

    .line 172
    invoke-interface {v11, v6}, Landroidx/compose/runtime/Composer;->consume(Landroidx/compose/runtime/CompositionLocal;)Ljava/lang/Object;

    .line 173
    .line 174
    .line 175
    move-result-object v6

    .line 176
    check-cast v6, Landroidx/compose/ui/unit/LayoutDirection;

    .line 177
    .line 178
    invoke-static {}, Landroidx/compose/ui/platform/CompositionLocalsKt;->getLocalViewConfiguration()Landroidx/compose/runtime/ProvidableCompositionLocal;

    .line 179
    .line 180
    .line 181
    move-result-object v7

    .line 182
    invoke-interface {v11, v7}, Landroidx/compose/runtime/Composer;->consume(Landroidx/compose/runtime/CompositionLocal;)Ljava/lang/Object;

    .line 183
    .line 184
    .line 185
    move-result-object v7

    .line 186
    check-cast v7, Landroidx/compose/ui/platform/ViewConfiguration;

    .line 187
    .line 188
    sget-object v13, Landroidx/compose/ui/node/ComposeUiNode;->Companion:Landroidx/compose/ui/node/ComposeUiNode$Companion;

    .line 189
    .line 190
    invoke-virtual {v13}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getConstructor()Lkotlin/jvm/functions/Function0;

    .line 191
    .line 192
    .line 193
    move-result-object v14

    .line 194
    invoke-static {v1}, Landroidx/compose/ui/layout/LayoutKt;->materializerOf(Landroidx/compose/ui/Modifier;)Lkotlin/jvm/functions/Function3;

    .line 195
    .line 196
    .line 197
    move-result-object v1

    .line 198
    shl-int/lit8 v4, v4, 0x9

    .line 199
    .line 200
    and-int/lit16 v4, v4, 0x1c00

    .line 201
    .line 202
    or-int/lit8 v4, v4, 0x6

    .line 203
    .line 204
    invoke-interface {v11}, Landroidx/compose/runtime/Composer;->getApplier()Landroidx/compose/runtime/Applier;

    .line 205
    .line 206
    .line 207
    move-result-object v15

    .line 208
    instance-of v15, v15, Landroidx/compose/runtime/Applier;

    .line 209
    .line 210
    if-nez v15, :cond_9

    .line 211
    .line 212
    invoke-static {}, Landroidx/compose/runtime/ComposablesKt;->invalidApplier()V

    .line 213
    .line 214
    .line 215
    :cond_9
    invoke-interface {v11}, Landroidx/compose/runtime/Composer;->startReusableNode()V

    .line 216
    .line 217
    .line 218
    invoke-interface {v11}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 219
    .line 220
    .line 221
    move-result v15

    .line 222
    if-eqz v15, :cond_a

    .line 223
    .line 224
    invoke-interface {v11, v14}, Landroidx/compose/runtime/Composer;->createNode(Lkotlin/jvm/functions/Function0;)V

    .line 225
    .line 226
    .line 227
    goto :goto_5

    .line 228
    :cond_a
    invoke-interface {v11}, Landroidx/compose/runtime/Composer;->useNode()V

    .line 229
    .line 230
    .line 231
    :goto_5
    invoke-interface {v11}, Landroidx/compose/runtime/Composer;->disableReusing()V

    .line 232
    .line 233
    .line 234
    invoke-static {v11}, Landroidx/compose/runtime/Updater;->constructor-impl(Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;

    .line 235
    .line 236
    .line 237
    move-result-object v14

    .line 238
    invoke-virtual {v13}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetMeasurePolicy()Lkotlin/jvm/functions/Function2;

    .line 239
    .line 240
    .line 241
    move-result-object v15

    .line 242
    invoke-static {v14, v2, v15}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 243
    .line 244
    .line 245
    invoke-virtual {v13}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetDensity()Lkotlin/jvm/functions/Function2;

    .line 246
    .line 247
    .line 248
    move-result-object v2

    .line 249
    invoke-static {v14, v5, v2}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 250
    .line 251
    .line 252
    invoke-virtual {v13}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetLayoutDirection()Lkotlin/jvm/functions/Function2;

    .line 253
    .line 254
    .line 255
    move-result-object v2

    .line 256
    invoke-static {v14, v6, v2}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 257
    .line 258
    .line 259
    invoke-virtual {v13}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetViewConfiguration()Lkotlin/jvm/functions/Function2;

    .line 260
    .line 261
    .line 262
    move-result-object v2

    .line 263
    invoke-static {v14, v7, v2}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 264
    .line 265
    .line 266
    invoke-interface {v11}, Landroidx/compose/runtime/Composer;->enableReusing()V

    .line 267
    .line 268
    .line 269
    invoke-static {v11}, Landroidx/compose/runtime/SkippableUpdater;->constructor-impl(Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;

    .line 270
    .line 271
    .line 272
    move-result-object v2

    .line 273
    invoke-static {v2}, Landroidx/compose/runtime/SkippableUpdater;->box-impl(Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/SkippableUpdater;

    .line 274
    .line 275
    .line 276
    move-result-object v2

    .line 277
    shr-int/lit8 v5, v4, 0x3

    .line 278
    .line 279
    and-int/lit8 v5, v5, 0x70

    .line 280
    .line 281
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 282
    .line 283
    .line 284
    move-result-object v5

    .line 285
    invoke-interface {v1, v2, v11, v5}, Lkotlin/jvm/functions/Function3;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 286
    .line 287
    .line 288
    const v1, 0x7ab4aae9

    .line 289
    .line 290
    .line 291
    invoke-interface {v11, v1}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 292
    .line 293
    .line 294
    shr-int/lit8 v1, v4, 0x9

    .line 295
    .line 296
    and-int/lit8 v1, v1, 0xe

    .line 297
    .line 298
    const v2, -0x7f65a980

    .line 299
    .line 300
    .line 301
    invoke-interface {v11, v2}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 302
    .line 303
    .line 304
    and-int/lit8 v1, v1, 0xb

    .line 305
    .line 306
    if-ne v1, v12, :cond_c

    .line 307
    .line 308
    invoke-interface {v11}, Landroidx/compose/runtime/Composer;->getSkipping()Z

    .line 309
    .line 310
    .line 311
    move-result v1

    .line 312
    if-nez v1, :cond_b

    .line 313
    .line 314
    goto :goto_6

    .line 315
    :cond_b
    invoke-interface {v11}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    .line 316
    .line 317
    .line 318
    goto :goto_7

    .line 319
    :cond_c
    :goto_6
    sget-object v1, Landroidx/compose/foundation/layout/BoxScopeInstance;->INSTANCE:Landroidx/compose/foundation/layout/BoxScopeInstance;

    .line 320
    .line 321
    shr-int/lit8 v2, v3, 0x6

    .line 322
    .line 323
    and-int/lit8 v2, v2, 0x70

    .line 324
    .line 325
    or-int/lit8 v2, v2, 0x6

    .line 326
    .line 327
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 328
    .line 329
    .line 330
    move-result-object v2

    .line 331
    invoke-interface {v9, v1, v11, v2}, Lkotlin/jvm/functions/Function3;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 332
    .line 333
    .line 334
    :goto_7
    invoke-interface {v11}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 335
    .line 336
    .line 337
    invoke-interface {v11}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 338
    .line 339
    .line 340
    invoke-interface {v11}, Landroidx/compose/runtime/Composer;->endNode()V

    .line 341
    .line 342
    .line 343
    invoke-interface {v11}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 344
    .line 345
    .line 346
    invoke-interface {v11}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 347
    .line 348
    .line 349
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 350
    .line 351
    .line 352
    move-result v1

    .line 353
    if-eqz v1, :cond_d

    .line 354
    .line 355
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 356
    .line 357
    .line 358
    :cond_d
    :goto_8
    invoke-interface {v11}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    .line 359
    .line 360
    .line 361
    move-result-object v1

    .line 362
    if-nez v1, :cond_e

    .line 363
    .line 364
    goto :goto_9

    .line 365
    :cond_e
    new-instance v2, Landroidx/compose/material3/SliderKt$TempRangeSliderThumb$1;

    .line 366
    .line 367
    invoke-direct {v2, v0, v8, v9, v10}, Landroidx/compose/material3/SliderKt$TempRangeSliderThumb$1;-><init>(Landroidx/compose/foundation/layout/BoxScope;FLkotlin/jvm/functions/Function3;I)V

    .line 368
    .line 369
    .line 370
    invoke-interface {v1, v2}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lkotlin/jvm/functions/Function2;)V

    .line 371
    .line 372
    .line 373
    :goto_9
    return-void
.end method

.method private static final TempRangeSliderTrack-au3_HiA(Landroidx/compose/ui/Modifier;Landroidx/compose/material3/SliderColors;ZFF[FFFLandroidx/compose/runtime/Composer;I)V
    .locals 21
    .annotation build Landroidx/compose/runtime/Composable;
    .end annotation

    .annotation build Landroidx/compose/runtime/ComposableTarget;
        applier = "androidx.compose.ui.UiComposable"
    .end annotation

    .line 1
    move-object/from16 v2, p1

    .line 2
    .line 3
    move/from16 v3, p2

    .line 4
    .line 5
    move/from16 v9, p9

    .line 6
    .line 7
    const v0, 0x3c89cdbe

    .line 8
    .line 9
    .line 10
    move-object/from16 v1, p8

    .line 11
    .line 12
    invoke-interface {v1, v0}, Landroidx/compose/runtime/Composer;->startRestartGroup(I)Landroidx/compose/runtime/Composer;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 17
    .line 18
    .line 19
    move-result v4

    .line 20
    if-eqz v4, :cond_0

    .line 21
    .line 22
    const/4 v4, -0x1

    .line 23
    const-string v5, "androidx.compose.material3.TempRangeSliderTrack (Slider.kt:960)"

    .line 24
    .line 25
    invoke-static {v0, v9, v4, v5}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 26
    .line 27
    .line 28
    :cond_0
    new-instance v11, Lkotlin/jvm/internal/Ref$FloatRef;

    .line 29
    .line 30
    invoke-direct {v11}, Lkotlin/jvm/internal/Ref$FloatRef;-><init>()V

    .line 31
    .line 32
    .line 33
    new-instance v0, Lkotlin/jvm/internal/Ref$FloatRef;

    .line 34
    .line 35
    invoke-direct {v0}, Lkotlin/jvm/internal/Ref$FloatRef;-><init>()V

    .line 36
    .line 37
    .line 38
    invoke-static {}, Landroidx/compose/ui/platform/CompositionLocalsKt;->getLocalDensity()Landroidx/compose/runtime/ProvidableCompositionLocal;

    .line 39
    .line 40
    .line 41
    move-result-object v4

    .line 42
    invoke-interface {v1, v4}, Landroidx/compose/runtime/Composer;->consume(Landroidx/compose/runtime/CompositionLocal;)Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object v4

    .line 46
    check-cast v4, Landroidx/compose/ui/unit/Density;

    .line 47
    .line 48
    move/from16 v7, p6

    .line 49
    .line 50
    invoke-interface {v4, v7}, Landroidx/compose/ui/unit/Density;->toPx-0680j_4(F)F

    .line 51
    .line 52
    .line 53
    move-result v5

    .line 54
    const/4 v6, 0x2

    .line 55
    int-to-float v6, v6

    .line 56
    div-float/2addr v5, v6

    .line 57
    iput v5, v11, Lkotlin/jvm/internal/Ref$FloatRef;->element:F

    .line 58
    .line 59
    sget v5, Landroidx/compose/material3/SliderKt;->TickSize:F

    .line 60
    .line 61
    invoke-interface {v4, v5}, Landroidx/compose/ui/unit/Density;->toPx-0680j_4(F)F

    .line 62
    .line 63
    .line 64
    move-result v4

    .line 65
    iput v4, v0, Lkotlin/jvm/internal/Ref$FloatRef;->element:F

    .line 66
    .line 67
    shr-int/lit8 v4, v9, 0x6

    .line 68
    .line 69
    and-int/lit8 v4, v4, 0xe

    .line 70
    .line 71
    or-int/lit8 v4, v4, 0x30

    .line 72
    .line 73
    shl-int/lit8 v5, v9, 0x3

    .line 74
    .line 75
    and-int/lit16 v5, v5, 0x380

    .line 76
    .line 77
    or-int/2addr v4, v5

    .line 78
    const/4 v5, 0x0

    .line 79
    invoke-virtual {v2, v3, v5, v1, v4}, Landroidx/compose/material3/SliderColors;->trackColor$material3_release(ZZLandroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;

    .line 80
    .line 81
    .line 82
    move-result-object v12

    .line 83
    const/4 v6, 0x1

    .line 84
    invoke-virtual {v2, v3, v6, v1, v4}, Landroidx/compose/material3/SliderColors;->trackColor$material3_release(ZZLandroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;

    .line 85
    .line 86
    .line 87
    move-result-object v16

    .line 88
    invoke-virtual {v2, v3, v5, v1, v4}, Landroidx/compose/material3/SliderColors;->tickColor$material3_release(ZZLandroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;

    .line 89
    .line 90
    .line 91
    move-result-object v18

    .line 92
    invoke-virtual {v2, v3, v6, v1, v4}, Landroidx/compose/material3/SliderColors;->tickColor$material3_release(ZZLandroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;

    .line 93
    .line 94
    .line 95
    move-result-object v19

    .line 96
    new-instance v4, Landroidx/compose/material3/SliderKt$TempRangeSliderTrack$2;

    .line 97
    .line 98
    move-object v10, v4

    .line 99
    move/from16 v13, p7

    .line 100
    .line 101
    move/from16 v14, p4

    .line 102
    .line 103
    move/from16 v15, p3

    .line 104
    .line 105
    move-object/from16 v17, p5

    .line 106
    .line 107
    move-object/from16 v20, v0

    .line 108
    .line 109
    invoke-direct/range {v10 .. v20}, Landroidx/compose/material3/SliderKt$TempRangeSliderTrack$2;-><init>(Lkotlin/jvm/internal/Ref$FloatRef;Landroidx/compose/runtime/State;FFFLandroidx/compose/runtime/State;[FLandroidx/compose/runtime/State;Landroidx/compose/runtime/State;Lkotlin/jvm/internal/Ref$FloatRef;)V

    .line 110
    .line 111
    .line 112
    and-int/lit8 v0, v9, 0xe

    .line 113
    .line 114
    move-object/from16 v5, p0

    .line 115
    .line 116
    invoke-static {v5, v4, v1, v0}, Landroidx/compose/foundation/CanvasKt;->Canvas(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    .line 117
    .line 118
    .line 119
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 120
    .line 121
    .line 122
    move-result v0

    .line 123
    if-eqz v0, :cond_1

    .line 124
    .line 125
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 126
    .line 127
    .line 128
    :cond_1
    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    .line 129
    .line 130
    .line 131
    move-result-object v10

    .line 132
    if-nez v10, :cond_2

    .line 133
    .line 134
    goto :goto_0

    .line 135
    :cond_2
    new-instance v11, Landroidx/compose/material3/SliderKt$TempRangeSliderTrack$3;

    .line 136
    .line 137
    move-object v0, v11

    .line 138
    move-object/from16 v1, p0

    .line 139
    .line 140
    move-object/from16 v2, p1

    .line 141
    .line 142
    move/from16 v3, p2

    .line 143
    .line 144
    move/from16 v4, p3

    .line 145
    .line 146
    move/from16 v5, p4

    .line 147
    .line 148
    move-object/from16 v6, p5

    .line 149
    .line 150
    move/from16 v7, p6

    .line 151
    .line 152
    move/from16 v8, p7

    .line 153
    .line 154
    move/from16 v9, p9

    .line 155
    .line 156
    invoke-direct/range {v0 .. v9}, Landroidx/compose/material3/SliderKt$TempRangeSliderTrack$3;-><init>(Landroidx/compose/ui/Modifier;Landroidx/compose/material3/SliderColors;ZFF[FFFI)V

    .line 157
    .line 158
    .line 159
    invoke-interface {v10, v11}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lkotlin/jvm/functions/Function2;)V

    .line 160
    .line 161
    .line 162
    :goto_0
    return-void
.end method

.method public static final synthetic access$RangeSliderImpl(ZFF[FLandroidx/compose/material3/SliderColors;FLandroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V
    .locals 0

    .line 1
    invoke-static/range {p0 .. p13}, Landroidx/compose/material3/SliderKt;->RangeSliderImpl(ZFF[FLandroidx/compose/material3/SliderColors;FLandroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static final synthetic access$SliderImpl(Landroidx/compose/ui/Modifier;ZLandroidx/compose/foundation/interaction/MutableInteractionSource;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;IFLkotlin/ranges/ClosedFloatingPointRange;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;I)V
    .locals 0

    .line 1
    invoke-static/range {p0 .. p11}, Landroidx/compose/material3/SliderKt;->SliderImpl(Landroidx/compose/ui/Modifier;ZLandroidx/compose/foundation/interaction/MutableInteractionSource;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;IFLkotlin/ranges/ClosedFloatingPointRange;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;I)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static final synthetic access$SliderImpl$scaleToOffset(Lkotlin/ranges/ClosedFloatingPointRange;FFF)F
    .locals 0

    .line 1
    invoke-static {p0, p1, p2, p3}, Landroidx/compose/material3/SliderKt;->SliderImpl$scaleToOffset(Lkotlin/ranges/ClosedFloatingPointRange;FFF)F

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method

.method public static final synthetic access$SliderImpl$scaleToUserValue(Lkotlin/ranges/ClosedFloatingPointRange;FFF)F
    .locals 0

    .line 1
    invoke-static {p0, p1, p2, p3}, Landroidx/compose/material3/SliderKt;->SliderImpl$scaleToUserValue(Lkotlin/ranges/ClosedFloatingPointRange;FFF)F

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method

.method public static final synthetic access$TempRangeSliderThumb-rAjV9yQ(Landroidx/compose/foundation/layout/BoxScope;FLkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;I)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2, p3, p4}, Landroidx/compose/material3/SliderKt;->TempRangeSliderThumb-rAjV9yQ(Landroidx/compose/foundation/layout/BoxScope;FLkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;I)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static final synthetic access$TempRangeSliderTrack-au3_HiA(Landroidx/compose/ui/Modifier;Landroidx/compose/material3/SliderColors;ZFF[FFFLandroidx/compose/runtime/Composer;I)V
    .locals 0

    .line 1
    invoke-static/range {p0 .. p9}, Landroidx/compose/material3/SliderKt;->TempRangeSliderTrack-au3_HiA(Landroidx/compose/ui/Modifier;Landroidx/compose/material3/SliderColors;ZFF[FFFLandroidx/compose/runtime/Composer;I)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static final synthetic access$animateToTarget(Landroidx/compose/foundation/gestures/DraggableState;FFFLkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2, p3, p4}, Landroidx/compose/material3/SliderKt;->animateToTarget(Landroidx/compose/foundation/gestures/DraggableState;FFFLkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static final synthetic access$awaitSlop-8vUncbI(Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;JILkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2, p3, p4}, Landroidx/compose/material3/SliderKt;->awaitSlop-8vUncbI(Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;JILkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static final synthetic access$calcFraction(FFF)F
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Landroidx/compose/material3/SliderKt;->calcFraction(FFF)F

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method

.method public static final synthetic access$getSliderToTickAnimation$p()Landroidx/compose/animation/core/TweenSpec;
    .locals 1

    .line 1
    sget-object v0, Landroidx/compose/material3/SliderKt;->SliderToTickAnimation:Landroidx/compose/animation/core/TweenSpec;

    .line 2
    .line 3
    return-object v0
.end method

.method public static final synthetic access$getThumbDefaultElevation$p()F
    .locals 1

    .line 1
    sget v0, Landroidx/compose/material3/SliderKt;->ThumbDefaultElevation:F

    .line 2
    .line 3
    return v0
.end method

.method public static final synthetic access$getThumbPressedElevation$p()F
    .locals 1

    .line 1
    sget v0, Landroidx/compose/material3/SliderKt;->ThumbPressedElevation:F

    .line 2
    .line 3
    return v0
.end method

.method public static final synthetic access$getThumbSize$p()J
    .locals 2

    .line 1
    sget-wide v0, Landroidx/compose/material3/SliderKt;->ThumbSize:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public static final synthetic access$getTickSize$p()F
    .locals 1

    .line 1
    sget v0, Landroidx/compose/material3/SliderKt;->TickSize:F

    .line 2
    .line 3
    return v0
.end method

.method public static final synthetic access$rangeSliderPressDragModifier(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/runtime/State;Landroidx/compose/runtime/State;ZZFLkotlin/ranges/ClosedFloatingPointRange;Landroidx/compose/runtime/State;Landroidx/compose/runtime/State;)Landroidx/compose/ui/Modifier;
    .locals 0

    .line 1
    invoke-static/range {p0 .. p10}, Landroidx/compose/material3/SliderKt;->rangeSliderPressDragModifier(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/runtime/State;Landroidx/compose/runtime/State;ZZFLkotlin/ranges/ClosedFloatingPointRange;Landroidx/compose/runtime/State;Landroidx/compose/runtime/State;)Landroidx/compose/ui/Modifier;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static final synthetic access$scale(FFFFF)F
    .locals 0

    .line 1
    invoke-static {p0, p1, p2, p3, p4}, Landroidx/compose/material3/SliderKt;->scale(FFFFF)F

    move-result p0

    return p0
.end method

.method public static final synthetic access$scale(FFLkotlin/ranges/ClosedFloatingPointRange;FF)Lkotlin/ranges/ClosedFloatingPointRange;
    .locals 0

    .line 2
    invoke-static {p0, p1, p2, p3, p4}, Landroidx/compose/material3/SliderKt;->scale(FFLkotlin/ranges/ClosedFloatingPointRange;FF)Lkotlin/ranges/ClosedFloatingPointRange;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$sliderSemantics(Landroidx/compose/ui/Modifier;FZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/ranges/ClosedFloatingPointRange;I)Landroidx/compose/ui/Modifier;
    .locals 0

    .line 1
    invoke-static/range {p0 .. p6}, Landroidx/compose/material3/SliderKt;->sliderSemantics(Landroidx/compose/ui/Modifier;FZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/ranges/ClosedFloatingPointRange;I)Landroidx/compose/ui/Modifier;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static final synthetic access$snapValueToTick(F[FFF)F
    .locals 0

    .line 1
    invoke-static {p0, p1, p2, p3}, Landroidx/compose/material3/SliderKt;->snapValueToTick(F[FFF)F

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method

.method public static final synthetic access$stepsToTickFractions(I)[F
    .locals 0

    .line 1
    invoke-static {p0}, Landroidx/compose/material3/SliderKt;->stepsToTickFractions(I)[F

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method private static final animateToTarget(Landroidx/compose/foundation/gestures/DraggableState;FFFLkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/foundation/gestures/DraggableState;",
            "FFF",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    const/4 v1, 0x0

    .line 2
    new-instance v2, Landroidx/compose/material3/SliderKt$animateToTarget$2;

    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    invoke-direct {v2, p1, p2, p3, v0}, Landroidx/compose/material3/SliderKt$animateToTarget$2;-><init>(FFFLkotlin/coroutines/Continuation;)V

    .line 6
    .line 7
    .line 8
    const/4 v4, 0x1

    .line 9
    const/4 v5, 0x0

    .line 10
    move-object v0, p0

    .line 11
    move-object v3, p4

    .line 12
    invoke-static/range {v0 .. v5}, Landroidx/compose/foundation/gestures/a;->a(Landroidx/compose/foundation/gestures/DraggableState;Landroidx/compose/foundation/MutatePriority;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;ILjava/lang/Object;)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    if-ne p0, p1, :cond_0

    .line 21
    .line 22
    return-object p0

    .line 23
    :cond_0
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 24
    .line 25
    return-object p0
.end method

.method private static final awaitSlop-8vUncbI(Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;JILkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;",
            "JI",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Pair<",
            "Landroidx/compose/ui/input/pointer/PointerInputChange;",
            "Ljava/lang/Float;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    instance-of v0, p4, Landroidx/compose/material3/SliderKt$awaitSlop$1;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p4

    .line 6
    check-cast v0, Landroidx/compose/material3/SliderKt$awaitSlop$1;

    .line 7
    .line 8
    iget v1, v0, Landroidx/compose/material3/SliderKt$awaitSlop$1;->label:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, Landroidx/compose/material3/SliderKt$awaitSlop$1;->label:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Landroidx/compose/material3/SliderKt$awaitSlop$1;

    .line 21
    .line 22
    invoke-direct {v0, p4}, Landroidx/compose/material3/SliderKt$awaitSlop$1;-><init>(Lkotlin/coroutines/Continuation;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    move-object v6, v0

    .line 26
    iget-object p4, v6, Landroidx/compose/material3/SliderKt$awaitSlop$1;->result:Ljava/lang/Object;

    .line 27
    .line 28
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    iget v1, v6, Landroidx/compose/material3/SliderKt$awaitSlop$1;->label:I

    .line 33
    .line 34
    const/4 v2, 0x1

    .line 35
    if-eqz v1, :cond_2

    .line 36
    .line 37
    if-ne v1, v2, :cond_1

    .line 38
    .line 39
    iget-object p0, v6, Landroidx/compose/material3/SliderKt$awaitSlop$1;->L$0:Ljava/lang/Object;

    .line 40
    .line 41
    check-cast p0, Lkotlin/jvm/internal/Ref$FloatRef;

    .line 42
    .line 43
    invoke-static {p4}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 44
    .line 45
    .line 46
    goto :goto_1

    .line 47
    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 48
    .line 49
    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    .line 50
    .line 51
    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 52
    .line 53
    .line 54
    throw p0

    .line 55
    :cond_2
    invoke-static {p4}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 56
    .line 57
    .line 58
    new-instance p4, Lkotlin/jvm/internal/Ref$FloatRef;

    .line 59
    .line 60
    invoke-direct {p4}, Lkotlin/jvm/internal/Ref$FloatRef;-><init>()V

    .line 61
    .line 62
    .line 63
    new-instance v5, Landroidx/compose/material3/SliderKt$awaitSlop$postPointerSlop$1;

    .line 64
    .line 65
    invoke-direct {v5, p4}, Landroidx/compose/material3/SliderKt$awaitSlop$postPointerSlop$1;-><init>(Lkotlin/jvm/internal/Ref$FloatRef;)V

    .line 66
    .line 67
    .line 68
    iput-object p4, v6, Landroidx/compose/material3/SliderKt$awaitSlop$1;->L$0:Ljava/lang/Object;

    .line 69
    .line 70
    iput v2, v6, Landroidx/compose/material3/SliderKt$awaitSlop$1;->label:I

    .line 71
    .line 72
    move-object v1, p0

    .line 73
    move-wide v2, p1

    .line 74
    move v4, p3

    .line 75
    invoke-static/range {v1 .. v6}, Landroidx/compose/material3/DragGestureDetectorCopyKt;->awaitHorizontalPointerSlopOrCancellation-gDDlDlE(Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;JILkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 76
    .line 77
    .line 78
    move-result-object p0

    .line 79
    if-ne p0, v0, :cond_3

    .line 80
    .line 81
    return-object v0

    .line 82
    :cond_3
    move-object v7, p4

    .line 83
    move-object p4, p0

    .line 84
    move-object p0, v7

    .line 85
    :goto_1
    check-cast p4, Landroidx/compose/ui/input/pointer/PointerInputChange;

    .line 86
    .line 87
    if-eqz p4, :cond_4

    .line 88
    .line 89
    iget p0, p0, Lkotlin/jvm/internal/Ref$FloatRef;->element:F

    .line 90
    .line 91
    invoke-static {p0}, Lkotlin/coroutines/jvm/internal/Boxing;->boxFloat(F)Ljava/lang/Float;

    .line 92
    .line 93
    .line 94
    move-result-object p0

    .line 95
    invoke-static {p4, p0}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 96
    .line 97
    .line 98
    move-result-object p0

    .line 99
    goto :goto_2

    .line 100
    :cond_4
    const/4 p0, 0x0

    .line 101
    :goto_2
    return-object p0
.end method

.method private static final calcFraction(FFF)F
    .locals 2

    .line 1
    sub-float/2addr p1, p0

    .line 2
    const/4 v0, 0x0

    .line 3
    cmpg-float v1, p1, v0

    .line 4
    .line 5
    if-nez v1, :cond_0

    .line 6
    .line 7
    const/4 v1, 0x1

    .line 8
    goto :goto_0

    .line 9
    :cond_0
    const/4 v1, 0x0

    .line 10
    :goto_0
    if-eqz v1, :cond_1

    .line 11
    .line 12
    move p2, v0

    .line 13
    goto :goto_1

    .line 14
    :cond_1
    sub-float/2addr p2, p0

    .line 15
    div-float/2addr p2, p1

    .line 16
    :goto_1
    const/high16 p0, 0x3f800000    # 1.0f

    .line 17
    .line 18
    invoke-static {p2, v0, p0}, Lkotlin/ranges/RangesKt;->coerceIn(FFF)F

    .line 19
    .line 20
    .line 21
    move-result p0

    .line 22
    return p0
.end method

.method public static final getThumbWidth()F
    .locals 1

    .line 1
    sget v0, Landroidx/compose/material3/SliderKt;->ThumbWidth:F

    .line 2
    .line 3
    return v0
.end method

.method public static final getTrackHeight()F
    .locals 1

    .line 1
    sget v0, Landroidx/compose/material3/SliderKt;->TrackHeight:F

    .line 2
    .line 3
    return v0
.end method

.method private static final rangeSliderPressDragModifier(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/runtime/State;Landroidx/compose/runtime/State;ZZFLkotlin/ranges/ClosedFloatingPointRange;Landroidx/compose/runtime/State;Landroidx/compose/runtime/State;)Landroidx/compose/ui/Modifier;
    .locals 12
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/ui/Modifier;",
            "Landroidx/compose/foundation/interaction/MutableInteractionSource;",
            "Landroidx/compose/foundation/interaction/MutableInteractionSource;",
            "Landroidx/compose/runtime/State<",
            "Ljava/lang/Float;",
            ">;",
            "Landroidx/compose/runtime/State<",
            "Ljava/lang/Float;",
            ">;ZZF",
            "Lkotlin/ranges/ClosedFloatingPointRange<",
            "Ljava/lang/Float;",
            ">;",
            "Landroidx/compose/runtime/State<",
            "+",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Ljava/lang/Boolean;",
            "Lkotlin/Unit;",
            ">;>;",
            "Landroidx/compose/runtime/State<",
            "+",
            "Lkotlin/jvm/functions/Function2<",
            "-",
            "Ljava/lang/Boolean;",
            "-",
            "Ljava/lang/Float;",
            "Lkotlin/Unit;",
            ">;>;)",
            "Landroidx/compose/ui/Modifier;"
        }
    .end annotation

    .line 1
    if-eqz p5, :cond_0

    .line 2
    .line 3
    const/4 v0, 0x5

    .line 4
    new-array v0, v0, [Ljava/lang/Object;

    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    aput-object p1, v0, v1

    .line 8
    .line 9
    const/4 v1, 0x1

    .line 10
    aput-object p2, v0, v1

    .line 11
    .line 12
    const/4 v1, 0x2

    .line 13
    invoke-static/range {p7 .. p7}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 14
    .line 15
    .line 16
    move-result-object v2

    .line 17
    aput-object v2, v0, v1

    .line 18
    .line 19
    const/4 v1, 0x3

    .line 20
    invoke-static/range {p6 .. p6}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 21
    .line 22
    .line 23
    move-result-object v2

    .line 24
    aput-object v2, v0, v1

    .line 25
    .line 26
    const/4 v1, 0x4

    .line 27
    aput-object p8, v0, v1

    .line 28
    .line 29
    new-instance v1, Landroidx/compose/material3/SliderKt$rangeSliderPressDragModifier$1;

    .line 30
    .line 31
    const/4 v11, 0x0

    .line 32
    move-object v2, v1

    .line 33
    move-object v3, p1

    .line 34
    move-object v4, p2

    .line 35
    move-object v5, p3

    .line 36
    move-object/from16 v6, p4

    .line 37
    .line 38
    move-object/from16 v7, p10

    .line 39
    .line 40
    move/from16 v8, p6

    .line 41
    .line 42
    move/from16 v9, p7

    .line 43
    .line 44
    move-object/from16 v10, p9

    .line 45
    .line 46
    invoke-direct/range {v2 .. v11}, Landroidx/compose/material3/SliderKt$rangeSliderPressDragModifier$1;-><init>(Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/runtime/State;Landroidx/compose/runtime/State;Landroidx/compose/runtime/State;ZFLandroidx/compose/runtime/State;Lkotlin/coroutines/Continuation;)V

    .line 47
    .line 48
    .line 49
    move-object v2, p0

    .line 50
    invoke-static {p0, v0, v1}, Landroidx/compose/ui/input/pointer/SuspendingPointerInputFilterKt;->pointerInput(Landroidx/compose/ui/Modifier;[Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)Landroidx/compose/ui/Modifier;

    .line 51
    .line 52
    .line 53
    move-result-object v0

    .line 54
    goto :goto_0

    .line 55
    :cond_0
    move-object v2, p0

    .line 56
    move-object v0, v2

    .line 57
    :goto_0
    return-object v0
.end method

.method private static final scale(FFFFF)F
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Landroidx/compose/material3/SliderKt;->calcFraction(FFF)F

    move-result p0

    invoke-static {p3, p4, p0}, Landroidx/compose/ui/util/MathHelpersKt;->lerp(FFF)F

    move-result p0

    return p0
.end method

.method private static final scale(FFLkotlin/ranges/ClosedFloatingPointRange;FF)Lkotlin/ranges/ClosedFloatingPointRange;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(FF",
            "Lkotlin/ranges/ClosedFloatingPointRange<",
            "Ljava/lang/Float;",
            ">;FF)",
            "Lkotlin/ranges/ClosedFloatingPointRange<",
            "Ljava/lang/Float;",
            ">;"
        }
    .end annotation

    .line 2
    invoke-interface {p2}, Lkotlin/ranges/ClosedRange;->getStart()Ljava/lang/Comparable;

    move-result-object v0

    check-cast v0, Ljava/lang/Number;

    invoke-virtual {v0}, Ljava/lang/Number;->floatValue()F

    move-result v0

    invoke-static {p0, p1, v0, p3, p4}, Landroidx/compose/material3/SliderKt;->scale(FFFFF)F

    move-result v0

    invoke-interface {p2}, Lkotlin/ranges/ClosedRange;->getEndInclusive()Ljava/lang/Comparable;

    move-result-object p2

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->floatValue()F

    move-result p2

    invoke-static {p0, p1, p2, p3, p4}, Landroidx/compose/material3/SliderKt;->scale(FFFFF)F

    move-result p0

    invoke-static {v0, p0}, Lkotlin/ranges/RangesKt;->rangeTo(FF)Lkotlin/ranges/ClosedFloatingPointRange;

    move-result-object p0

    return-object p0
.end method

.method private static final sliderSemantics(Landroidx/compose/ui/Modifier;FZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/ranges/ClosedFloatingPointRange;I)Landroidx/compose/ui/Modifier;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/ui/Modifier;",
            "FZ",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Ljava/lang/Float;",
            "Lkotlin/Unit;",
            ">;",
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;",
            "Lkotlin/ranges/ClosedFloatingPointRange<",
            "Ljava/lang/Float;",
            ">;I)",
            "Landroidx/compose/ui/Modifier;"
        }
    .end annotation

    .line 1
    invoke-interface {p5}, Lkotlin/ranges/ClosedRange;->getStart()Ljava/lang/Comparable;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    check-cast v0, Ljava/lang/Number;

    .line 6
    .line 7
    invoke-virtual {v0}, Ljava/lang/Number;->floatValue()F

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    invoke-interface {p5}, Lkotlin/ranges/ClosedRange;->getEndInclusive()Ljava/lang/Comparable;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    check-cast v1, Ljava/lang/Number;

    .line 16
    .line 17
    invoke-virtual {v1}, Ljava/lang/Number;->floatValue()F

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    invoke-static {p1, v0, v1}, Lkotlin/ranges/RangesKt;->coerceIn(FFF)F

    .line 22
    .line 23
    .line 24
    move-result v6

    .line 25
    new-instance v0, Landroidx/compose/material3/SliderKt$sliderSemantics$1;

    .line 26
    .line 27
    move-object v2, v0

    .line 28
    move v3, p2

    .line 29
    move-object v4, p5

    .line 30
    move v5, p6

    .line 31
    move-object v7, p3

    .line 32
    move-object v8, p4

    .line 33
    invoke-direct/range {v2 .. v8}, Landroidx/compose/material3/SliderKt$sliderSemantics$1;-><init>(ZLkotlin/ranges/ClosedFloatingPointRange;IFLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;)V

    .line 34
    .line 35
    .line 36
    const/4 p2, 0x1

    .line 37
    const/4 p3, 0x0

    .line 38
    const/4 p4, 0x0

    .line 39
    invoke-static {p0, p4, v0, p2, p3}, Landroidx/compose/ui/semantics/SemanticsModifierKt;->semantics$default(Landroidx/compose/ui/Modifier;ZLkotlin/jvm/functions/Function1;ILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    .line 40
    .line 41
    .line 42
    move-result-object p0

    .line 43
    invoke-static {p0, p1, p5, p6}, Landroidx/compose/foundation/ProgressSemanticsKt;->progressSemantics(Landroidx/compose/ui/Modifier;FLkotlin/ranges/ClosedFloatingPointRange;I)Landroidx/compose/ui/Modifier;

    .line 44
    .line 45
    .line 46
    move-result-object p0

    .line 47
    return-object p0
.end method

.method public static synthetic sliderSemantics$default(Landroidx/compose/ui/Modifier;FZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/ranges/ClosedFloatingPointRange;IILjava/lang/Object;)Landroidx/compose/ui/Modifier;
    .locals 7

    .line 1
    and-int/lit8 p8, p7, 0x8

    .line 2
    .line 3
    if-eqz p8, :cond_0

    .line 4
    .line 5
    const/4 p4, 0x0

    .line 6
    :cond_0
    move-object v4, p4

    .line 7
    and-int/lit8 p4, p7, 0x10

    .line 8
    .line 9
    if-eqz p4, :cond_1

    .line 10
    .line 11
    const/4 p4, 0x0

    .line 12
    const/high16 p5, 0x3f800000    # 1.0f

    .line 13
    .line 14
    invoke-static {p4, p5}, Lkotlin/ranges/RangesKt;->rangeTo(FF)Lkotlin/ranges/ClosedFloatingPointRange;

    .line 15
    .line 16
    .line 17
    move-result-object p5

    .line 18
    :cond_1
    move-object v5, p5

    .line 19
    and-int/lit8 p4, p7, 0x20

    .line 20
    .line 21
    if-eqz p4, :cond_2

    .line 22
    .line 23
    const/4 p6, 0x0

    .line 24
    :cond_2
    move v6, p6

    .line 25
    move-object v0, p0

    .line 26
    move v1, p1

    .line 27
    move v2, p2

    .line 28
    move-object v3, p3

    .line 29
    invoke-static/range {v0 .. v6}, Landroidx/compose/material3/SliderKt;->sliderSemantics(Landroidx/compose/ui/Modifier;FZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/ranges/ClosedFloatingPointRange;I)Landroidx/compose/ui/Modifier;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    return-object p0
.end method

.method private static final sliderTapModifier(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/gestures/DraggableState;Landroidx/compose/foundation/interaction/MutableInteractionSource;IZLandroidx/compose/runtime/State;Landroidx/compose/runtime/State;Landroidx/compose/runtime/MutableState;Z)Landroidx/compose/ui/Modifier;
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/ui/Modifier;",
            "Landroidx/compose/foundation/gestures/DraggableState;",
            "Landroidx/compose/foundation/interaction/MutableInteractionSource;",
            "IZ",
            "Landroidx/compose/runtime/State<",
            "Ljava/lang/Float;",
            ">;",
            "Landroidx/compose/runtime/State<",
            "+",
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;>;",
            "Landroidx/compose/runtime/MutableState<",
            "Ljava/lang/Float;",
            ">;Z)",
            "Landroidx/compose/ui/Modifier;"
        }
    .end annotation

    .line 1
    invoke-static {}, Landroidx/compose/ui/platform/InspectableValueKt;->isDebugInspectorInfoEnabled()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    new-instance v0, Landroidx/compose/material3/SliderKt$sliderTapModifier$$inlined$debugInspectorInfo$1;

    .line 8
    .line 9
    move-object v1, v0

    .line 10
    move-object v2, p1

    .line 11
    move-object v3, p2

    .line 12
    move v4, p3

    .line 13
    move v5, p4

    .line 14
    move-object/from16 v6, p5

    .line 15
    .line 16
    move-object/from16 v7, p6

    .line 17
    .line 18
    move-object/from16 v8, p7

    .line 19
    .line 20
    move/from16 v9, p8

    .line 21
    .line 22
    invoke-direct/range {v1 .. v9}, Landroidx/compose/material3/SliderKt$sliderTapModifier$$inlined$debugInspectorInfo$1;-><init>(Landroidx/compose/foundation/gestures/DraggableState;Landroidx/compose/foundation/interaction/MutableInteractionSource;IZLandroidx/compose/runtime/State;Landroidx/compose/runtime/State;Landroidx/compose/runtime/MutableState;Z)V

    .line 23
    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_0
    invoke-static {}, Landroidx/compose/ui/platform/InspectableValueKt;->getNoInspectorInfo()Lkotlin/jvm/functions/Function1;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    :goto_0
    new-instance v10, Landroidx/compose/material3/SliderKt$sliderTapModifier$2;

    .line 31
    .line 32
    move-object v1, v10

    .line 33
    move/from16 v2, p8

    .line 34
    .line 35
    move-object v3, p1

    .line 36
    move-object v4, p2

    .line 37
    move v5, p3

    .line 38
    move v6, p4

    .line 39
    move-object/from16 v7, p7

    .line 40
    .line 41
    move-object/from16 v8, p5

    .line 42
    .line 43
    move-object/from16 v9, p6

    .line 44
    .line 45
    invoke-direct/range {v1 .. v9}, Landroidx/compose/material3/SliderKt$sliderTapModifier$2;-><init>(ZLandroidx/compose/foundation/gestures/DraggableState;Landroidx/compose/foundation/interaction/MutableInteractionSource;IZLandroidx/compose/runtime/MutableState;Landroidx/compose/runtime/State;Landroidx/compose/runtime/State;)V

    .line 46
    .line 47
    .line 48
    move-object v1, p0

    .line 49
    invoke-static {p0, v0, v10}, Landroidx/compose/ui/ComposedModifierKt;->composed(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function3;)Landroidx/compose/ui/Modifier;

    .line 50
    .line 51
    .line 52
    move-result-object v0

    .line 53
    return-object v0
.end method

.method private static final snapValueToTick(F[FFF)F
    .locals 6

    .line 1
    array-length v0, p1

    .line 2
    const/4 v1, 0x1

    .line 3
    const/4 v2, 0x0

    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    move v0, v1

    .line 7
    goto :goto_0

    .line 8
    :cond_0
    move v0, v2

    .line 9
    :goto_0
    if-eqz v0, :cond_1

    .line 10
    .line 11
    const/4 p1, 0x0

    .line 12
    goto :goto_2

    .line 13
    :cond_1
    aget v0, p1, v2

    .line 14
    .line 15
    invoke-static {p1}, Lkotlin/collections/ArraysKt;->getLastIndex([F)I

    .line 16
    .line 17
    .line 18
    move-result v2

    .line 19
    if-nez v2, :cond_2

    .line 20
    .line 21
    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    goto :goto_2

    .line 26
    :cond_2
    invoke-static {p2, p3, v0}, Landroidx/compose/ui/util/MathHelpersKt;->lerp(FFF)F

    .line 27
    .line 28
    .line 29
    move-result v3

    .line 30
    sub-float/2addr v3, p0

    .line 31
    invoke-static {v3}, Ljava/lang/Math;->abs(F)F

    .line 32
    .line 33
    .line 34
    move-result v3

    .line 35
    new-instance v4, Lkotlin/ranges/IntRange;

    .line 36
    .line 37
    invoke-direct {v4, v1, v2}, Lkotlin/ranges/IntRange;-><init>(II)V

    .line 38
    .line 39
    .line 40
    invoke-virtual {v4}, Lkotlin/ranges/IntProgression;->iterator()Lkotlin/collections/IntIterator;

    .line 41
    .line 42
    .line 43
    move-result-object v1

    .line 44
    :cond_3
    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 45
    .line 46
    .line 47
    move-result v2

    .line 48
    if-eqz v2, :cond_4

    .line 49
    .line 50
    invoke-virtual {v1}, Lkotlin/collections/IntIterator;->nextInt()I

    .line 51
    .line 52
    .line 53
    move-result v2

    .line 54
    aget v2, p1, v2

    .line 55
    .line 56
    invoke-static {p2, p3, v2}, Landroidx/compose/ui/util/MathHelpersKt;->lerp(FFF)F

    .line 57
    .line 58
    .line 59
    move-result v4

    .line 60
    sub-float/2addr v4, p0

    .line 61
    invoke-static {v4}, Ljava/lang/Math;->abs(F)F

    .line 62
    .line 63
    .line 64
    move-result v4

    .line 65
    invoke-static {v3, v4}, Ljava/lang/Float;->compare(FF)I

    .line 66
    .line 67
    .line 68
    move-result v5

    .line 69
    if-lez v5, :cond_3

    .line 70
    .line 71
    move v0, v2

    .line 72
    move v3, v4

    .line 73
    goto :goto_1

    .line 74
    :cond_4
    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 75
    .line 76
    .line 77
    move-result-object p1

    .line 78
    :goto_2
    if-eqz p1, :cond_5

    .line 79
    .line 80
    invoke-virtual {p1}, Ljava/lang/Number;->floatValue()F

    .line 81
    .line 82
    .line 83
    move-result p0

    .line 84
    invoke-static {p2, p3, p0}, Landroidx/compose/ui/util/MathHelpersKt;->lerp(FFF)F

    .line 85
    .line 86
    .line 87
    move-result p0

    .line 88
    :cond_5
    return p0
.end method

.method private static final stepsToTickFractions(I)[F
    .locals 5

    .line 1
    const/4 v0, 0x0

    .line 2
    if-nez p0, :cond_0

    .line 3
    .line 4
    new-array p0, v0, [F

    .line 5
    .line 6
    goto :goto_1

    .line 7
    :cond_0
    add-int/lit8 v1, p0, 0x2

    .line 8
    .line 9
    new-array v2, v1, [F

    .line 10
    .line 11
    :goto_0
    if-ge v0, v1, :cond_1

    .line 12
    .line 13
    int-to-float v3, v0

    .line 14
    add-int/lit8 v4, p0, 0x1

    .line 15
    .line 16
    int-to-float v4, v4

    .line 17
    div-float/2addr v3, v4

    .line 18
    aput v3, v2, v0

    .line 19
    .line 20
    add-int/lit8 v0, v0, 0x1

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_1
    move-object p0, v2

    .line 24
    :goto_1
    return-object p0
.end method
