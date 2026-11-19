.class final Landroidx/compose/foundation/gestures/DragGestureDetectorKt$detectDragGestures$9;
.super Lkotlin/coroutines/jvm/internal/RestrictedSuspendLambda;
.source "SourceFile"

# interfaces
.implements Lr6/e;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/foundation/gestures/DragGestureDetectorKt;->detectDragGestures(Landroidx/compose/ui/input/pointer/PointerInputScope;Lr6/f;Lr6/c;Lr6/a;Lr6/a;Landroidx/compose/foundation/gestures/Orientation;Lr6/e;Lh6/c;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/coroutines/jvm/internal/RestrictedSuspendLambda;",
        "Lr6/e;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@\u00a2\u0006\u0004\u0008\u0002\u0010\u0003"
    }
    d2 = {
        "Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;",
        "Ld6/s;",
        "<anonymous>",
        "(Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;)V"
    }
    k = 0x3
    mv = {
        0x1,
        0x9,
        0x0
    }
.end annotation

.annotation runtime Lkotlin/coroutines/jvm/internal/DebugMetadata;
    c = "androidx.compose.foundation.gestures.DragGestureDetectorKt$detectDragGestures$9"
    f = "DragGestureDetector.kt"
    i = {
        0x0,
        0x1,
        0x1,
        0x1,
        0x2,
        0x2,
        0x2,
        0x2,
        0x2,
        0x2,
        0x3,
        0x3,
        0x3,
        0x3,
        0x3,
        0x3,
        0x3,
        0x4,
        0x4,
        0x4,
        0x5,
        0x5,
        0x5,
        0x5,
        0x5,
        0x5,
        0x6,
        0x6,
        0x6,
        0x6,
        0x6,
        0x6,
        0x6,
        0x7,
        0x7,
        0x7,
        0x7
    }
    l = {
        0xf5,
        0xfb,
        0x425,
        0x44d,
        0x116,
        0x47c,
        0x4a6,
        0x4b2
    }
    m = "invokeSuspend"
    n = {
        "$this$awaitEachGesture",
        "$this$awaitEachGesture",
        "initialDown",
        "awaitTouchSlop",
        "$this$awaitEachGesture",
        "down",
        "$this$awaitPointerSlopOrCancellation_u2d6ksA65w_u24default$iv",
        "pointer$iv",
        "touchSlopDetector$iv",
        "touchSlop$iv",
        "$this$awaitEachGesture",
        "down",
        "$this$awaitPointerSlopOrCancellation_u2d6ksA65w_u24default$iv",
        "pointer$iv",
        "touchSlopDetector$iv",
        "dragEvent$iv",
        "touchSlop$iv",
        "$this$awaitEachGesture",
        "down",
        "drag",
        "$this$awaitEachGesture",
        "down",
        "$this$awaitPointerSlopOrCancellation_u2d6ksA65w$iv",
        "pointer$iv",
        "touchSlopDetector$iv",
        "touchSlop$iv",
        "$this$awaitEachGesture",
        "down",
        "$this$awaitPointerSlopOrCancellation_u2d6ksA65w$iv",
        "pointer$iv",
        "touchSlopDetector$iv",
        "dragEvent$iv",
        "touchSlop$iv",
        "$this$drag_u2dVnAYq1g$iv",
        "orientation$iv",
        "$this$awaitDragOrUp_u2djO51t88$iv$iv",
        "pointer$iv$iv"
    }
    s = {
        "L$0",
        "L$0",
        "L$1",
        "Z$0",
        "L$0",
        "L$1",
        "L$2",
        "L$4",
        "L$5",
        "F$0",
        "L$0",
        "L$1",
        "L$2",
        "L$4",
        "L$5",
        "L$6",
        "F$0",
        "L$0",
        "L$1",
        "L$2",
        "L$0",
        "L$1",
        "L$2",
        "L$4",
        "L$5",
        "F$0",
        "L$0",
        "L$1",
        "L$2",
        "L$4",
        "L$5",
        "L$6",
        "F$0",
        "L$0",
        "L$2",
        "L$3",
        "L$4"
    }
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nDragGestureDetector.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DragGestureDetector.kt\nandroidx/compose/foundation/gestures/DragGestureDetectorKt$detectDragGestures$9\n+ 2 DragGestureDetector.kt\nandroidx/compose/foundation/gestures/DragGestureDetectorKt\n+ 3 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 4 Offset.kt\nandroidx/compose/ui/geometry/OffsetKt\n+ 5 Offset.kt\nandroidx/compose/ui/geometry/Offset\n+ 6 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 7 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n*L\n1#1,1045:1\n787#2,17:1046\n804#2,4:1072\n808#2,9:1083\n817#2,11:1093\n794#2,10:1140\n804#2,4:1159\n808#2,9:1172\n817#2,11:1182\n702#2,7:1193\n746#2,4:1200\n750#2,2:1213\n752#2,7:1222\n709#2,6:1229\n715#2:1238\n710#2,8:1241\n759#2:1249\n718#2:1250\n707#2:1251\n720#2,10:1252\n117#3,2:1063\n34#3,6:1065\n119#3:1071\n34#3,6:1076\n119#3:1082\n102#3,2:1104\n34#3,6:1106\n104#3:1112\n102#3,2:1113\n34#3,6:1115\n104#3:1121\n102#3,2:1122\n34#3,6:1124\n104#3:1130\n102#3,2:1131\n34#3,6:1133\n104#3:1139\n117#3,2:1150\n34#3,6:1152\n119#3:1158\n117#3,2:1163\n34#3,6:1165\n119#3:1171\n117#3,2:1204\n34#3,6:1206\n119#3:1212\n34#3,6:1215\n119#3:1221\n273#4:1092\n273#4:1181\n69#5:1235\n65#5:1239\n70#6:1236\n60#6:1240\n22#7:1237\n*S KotlinDebug\n*F\n+ 1 DragGestureDetector.kt\nandroidx/compose/foundation/gestures/DragGestureDetectorKt$detectDragGestures$9\n*L\n257#1:1046,17\n257#1:1072,4\n257#1:1083,9\n257#1:1093,11\n291#1:1140,10\n291#1:1159,4\n291#1:1172,9\n291#1:1182,11\n308#1:1193,7\n308#1:1200,4\n308#1:1213,2\n308#1:1222,7\n308#1:1229,6\n308#1:1238\n308#1:1241,8\n308#1:1249\n308#1:1250\n308#1:1251\n308#1:1252,10\n257#1:1063,2\n257#1:1065,6\n257#1:1071\n257#1:1076,6\n257#1:1082\n272#1:1104,2\n272#1:1106,6\n272#1:1112\n280#1:1113,2\n280#1:1115,6\n280#1:1121\n280#1:1122,2\n280#1:1124,6\n280#1:1130\n284#1:1131,2\n284#1:1133,6\n284#1:1139\n291#1:1150,2\n291#1:1152,6\n291#1:1158\n291#1:1163,2\n291#1:1165,6\n291#1:1171\n308#1:1204,2\n308#1:1206,6\n308#1:1212\n308#1:1215,6\n308#1:1221\n257#1:1092\n291#1:1181\n308#1:1235\n308#1:1239\n308#1:1236\n308#1:1240\n308#1:1237\n*E\n"
    }
.end annotation


# instance fields
.field final synthetic $onDrag:Lr6/e;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lr6/e;"
        }
    .end annotation
.end field

.field final synthetic $onDragCancel:Lr6/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lr6/a;"
        }
    .end annotation
.end field

.field final synthetic $onDragEnd:Lr6/c;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lr6/c;"
        }
    .end annotation
.end field

.field final synthetic $onDragStart:Lr6/f;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lr6/f;"
        }
    .end annotation
.end field

.field final synthetic $orientationLock:Landroidx/compose/foundation/gestures/Orientation;

.field final synthetic $overSlop:Lkotlin/jvm/internal/Ref$LongRef;

.field final synthetic $shouldAwaitTouchSlop:Lr6/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lr6/a;"
        }
    .end annotation
.end field

.field F$0:F

.field private synthetic L$0:Ljava/lang/Object;

.field L$1:Ljava/lang/Object;

.field L$2:Ljava/lang/Object;

.field L$3:Ljava/lang/Object;

.field L$4:Ljava/lang/Object;

.field L$5:Ljava/lang/Object;

.field L$6:Ljava/lang/Object;

.field Z$0:Z

.field label:I


# direct methods
.method public constructor <init>(Lr6/a;Lkotlin/jvm/internal/Ref$LongRef;Landroidx/compose/foundation/gestures/Orientation;Lr6/f;Lr6/e;Lr6/a;Lr6/c;Lh6/c;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lr6/a;",
            "Lkotlin/jvm/internal/Ref$LongRef;",
            "Landroidx/compose/foundation/gestures/Orientation;",
            "Lr6/f;",
            "Lr6/e;",
            "Lr6/a;",
            "Lr6/c;",
            "Lh6/c<",
            "-",
            "Landroidx/compose/foundation/gestures/DragGestureDetectorKt$detectDragGestures$9;",
            ">;)V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$detectDragGestures$9;->$shouldAwaitTouchSlop:Lr6/a;

    .line 2
    .line 3
    iput-object p2, p0, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$detectDragGestures$9;->$overSlop:Lkotlin/jvm/internal/Ref$LongRef;

    .line 4
    .line 5
    iput-object p3, p0, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$detectDragGestures$9;->$orientationLock:Landroidx/compose/foundation/gestures/Orientation;

    .line 6
    .line 7
    iput-object p4, p0, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$detectDragGestures$9;->$onDragStart:Lr6/f;

    .line 8
    .line 9
    iput-object p5, p0, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$detectDragGestures$9;->$onDrag:Lr6/e;

    .line 10
    .line 11
    iput-object p6, p0, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$detectDragGestures$9;->$onDragCancel:Lr6/a;

    .line 12
    .line 13
    iput-object p7, p0, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$detectDragGestures$9;->$onDragEnd:Lr6/c;

    .line 14
    .line 15
    const/4 p1, 0x2

    .line 16
    invoke-direct {p0, p1, p8}, Lkotlin/coroutines/jvm/internal/RestrictedSuspendLambda;-><init>(ILh6/c;)V

    .line 17
    .line 18
    .line 19
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lh6/c;)Lh6/c;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            "Lh6/c<",
            "*>;)",
            "Lh6/c<",
            "Ld6/s;",
            ">;"
        }
    .end annotation

    .line 1
    new-instance v0, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$detectDragGestures$9;

    .line 2
    .line 3
    iget-object v1, p0, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$detectDragGestures$9;->$shouldAwaitTouchSlop:Lr6/a;

    .line 4
    .line 5
    iget-object v2, p0, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$detectDragGestures$9;->$overSlop:Lkotlin/jvm/internal/Ref$LongRef;

    .line 6
    .line 7
    iget-object v3, p0, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$detectDragGestures$9;->$orientationLock:Landroidx/compose/foundation/gestures/Orientation;

    .line 8
    .line 9
    iget-object v4, p0, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$detectDragGestures$9;->$onDragStart:Lr6/f;

    .line 10
    .line 11
    iget-object v5, p0, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$detectDragGestures$9;->$onDrag:Lr6/e;

    .line 12
    .line 13
    iget-object v6, p0, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$detectDragGestures$9;->$onDragCancel:Lr6/a;

    .line 14
    .line 15
    iget-object v7, p0, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$detectDragGestures$9;->$onDragEnd:Lr6/c;

    .line 16
    .line 17
    move-object v8, p2

    .line 18
    invoke-direct/range {v0 .. v8}, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$detectDragGestures$9;-><init>(Lr6/a;Lkotlin/jvm/internal/Ref$LongRef;Landroidx/compose/foundation/gestures/Orientation;Lr6/f;Lr6/e;Lr6/a;Lr6/c;Lh6/c;)V

    .line 19
    .line 20
    .line 21
    iput-object p1, v0, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$detectDragGestures$9;->L$0:Ljava/lang/Object;

    .line 22
    .line 23
    return-object v0
.end method

.method public final invoke(Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;Lh6/c;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;",
            "Lh6/c<",
            "-",
            "Ld6/s;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0, p1, p2}, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$detectDragGestures$9;->create(Ljava/lang/Object;Lh6/c;)Lh6/c;

    move-result-object p1

    check-cast p1, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$detectDragGestures$9;

    sget-object p2, Ld6/s;->a:Ld6/s;

    invoke-virtual {p1, p2}, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$detectDragGestures$9;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;

    check-cast p2, Lh6/c;

    invoke-virtual {p0, p1, p2}, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$detectDragGestures$9;->invoke(Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;Lh6/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 23

    .line 1
    move-object/from16 v3, p0

    .line 2
    .line 3
    sget-object v6, Lkotlin/coroutines/intrinsics/CoroutineSingletons;->COROUTINE_SUSPENDED:Lkotlin/coroutines/intrinsics/CoroutineSingletons;

    .line 4
    .line 5
    iget v0, v3, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$detectDragGestures$9;->label:I

    .line 6
    .line 7
    const/4 v11, 0x0

    .line 8
    const/4 v12, 0x1

    .line 9
    const/4 v13, 0x0

    .line 10
    packed-switch v0, :pswitch_data_0

    .line 11
    .line 12
    .line 13
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 14
    .line 15
    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    .line 16
    .line 17
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    throw v0

    .line 21
    :pswitch_0
    iget-object v0, v3, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$detectDragGestures$9;->L$4:Ljava/lang/Object;

    .line 22
    .line 23
    check-cast v0, Lkotlin/jvm/internal/Ref$LongRef;

    .line 24
    .line 25
    iget-object v1, v3, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$detectDragGestures$9;->L$3:Ljava/lang/Object;

    .line 26
    .line 27
    check-cast v1, Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;

    .line 28
    .line 29
    iget-object v2, v3, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$detectDragGestures$9;->L$2:Ljava/lang/Object;

    .line 30
    .line 31
    check-cast v2, Landroidx/compose/foundation/gestures/Orientation;

    .line 32
    .line 33
    iget-object v4, v3, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$detectDragGestures$9;->L$1:Ljava/lang/Object;

    .line 34
    .line 35
    check-cast v4, Lr6/e;

    .line 36
    .line 37
    iget-object v5, v3, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$detectDragGestures$9;->L$0:Ljava/lang/Object;

    .line 38
    .line 39
    check-cast v5, Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;

    .line 40
    .line 41
    invoke-static/range {p1 .. p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 42
    .line 43
    .line 44
    move-object/from16 v9, p1

    .line 45
    .line 46
    move v7, v12

    .line 47
    move-object v8, v13

    .line 48
    goto/16 :goto_24

    .line 49
    .line 50
    :pswitch_1
    iget v0, v3, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$detectDragGestures$9;->F$0:F

    .line 51
    .line 52
    iget-object v1, v3, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$detectDragGestures$9;->L$6:Ljava/lang/Object;

    .line 53
    .line 54
    check-cast v1, Landroidx/compose/ui/input/pointer/PointerInputChange;

    .line 55
    .line 56
    iget-object v2, v3, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$detectDragGestures$9;->L$5:Ljava/lang/Object;

    .line 57
    .line 58
    check-cast v2, Landroidx/compose/foundation/gestures/TouchSlopDetector;

    .line 59
    .line 60
    iget-object v4, v3, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$detectDragGestures$9;->L$4:Ljava/lang/Object;

    .line 61
    .line 62
    check-cast v4, Lkotlin/jvm/internal/Ref$LongRef;

    .line 63
    .line 64
    iget-object v5, v3, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$detectDragGestures$9;->L$3:Ljava/lang/Object;

    .line 65
    .line 66
    check-cast v5, Lkotlin/jvm/internal/Ref$LongRef;

    .line 67
    .line 68
    iget-object v14, v3, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$detectDragGestures$9;->L$2:Ljava/lang/Object;

    .line 69
    .line 70
    check-cast v14, Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;

    .line 71
    .line 72
    iget-object v15, v3, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$detectDragGestures$9;->L$1:Ljava/lang/Object;

    .line 73
    .line 74
    check-cast v15, Landroidx/compose/ui/input/pointer/PointerInputChange;

    .line 75
    .line 76
    const-wide v16, 0x7fc000007fc00000L    # 2.247117487993712E307

    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    iget-object v7, v3, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$detectDragGestures$9;->L$0:Ljava/lang/Object;

    .line 82
    .line 83
    check-cast v7, Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;

    .line 84
    .line 85
    invoke-static/range {p1 .. p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 86
    .line 87
    .line 88
    move-object v11, v4

    .line 89
    move-object v10, v5

    .line 90
    move-object v4, v7

    .line 91
    const-wide v18, 0x7fffffff7fffffffL

    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    move-object v7, v2

    .line 97
    move-object v2, v14

    .line 98
    goto/16 :goto_1f

    .line 99
    .line 100
    :pswitch_2
    const-wide v16, 0x7fc000007fc00000L    # 2.247117487993712E307

    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    iget v0, v3, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$detectDragGestures$9;->F$0:F

    .line 106
    .line 107
    iget-object v1, v3, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$detectDragGestures$9;->L$5:Ljava/lang/Object;

    .line 108
    .line 109
    check-cast v1, Landroidx/compose/foundation/gestures/TouchSlopDetector;

    .line 110
    .line 111
    iget-object v2, v3, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$detectDragGestures$9;->L$4:Ljava/lang/Object;

    .line 112
    .line 113
    check-cast v2, Lkotlin/jvm/internal/Ref$LongRef;

    .line 114
    .line 115
    iget-object v4, v3, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$detectDragGestures$9;->L$3:Ljava/lang/Object;

    .line 116
    .line 117
    check-cast v4, Lkotlin/jvm/internal/Ref$LongRef;

    .line 118
    .line 119
    iget-object v5, v3, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$detectDragGestures$9;->L$2:Ljava/lang/Object;

    .line 120
    .line 121
    check-cast v5, Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;

    .line 122
    .line 123
    iget-object v7, v3, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$detectDragGestures$9;->L$1:Ljava/lang/Object;

    .line 124
    .line 125
    check-cast v7, Landroidx/compose/ui/input/pointer/PointerInputChange;

    .line 126
    .line 127
    iget-object v8, v3, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$detectDragGestures$9;->L$0:Ljava/lang/Object;

    .line 128
    .line 129
    check-cast v8, Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;

    .line 130
    .line 131
    invoke-static/range {p1 .. p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 132
    .line 133
    .line 134
    move-object v9, v7

    .line 135
    move-object v7, v1

    .line 136
    move-object v1, v9

    .line 137
    move-object/from16 v9, p1

    .line 138
    .line 139
    move-object v11, v2

    .line 140
    move-object v10, v4

    .line 141
    move-object v2, v5

    .line 142
    move-object v4, v8

    .line 143
    const-wide v18, 0x7fffffff7fffffffL

    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    goto/16 :goto_18

    .line 149
    .line 150
    :pswitch_3
    const-wide v16, 0x7fc000007fc00000L    # 2.247117487993712E307

    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    iget-object v0, v3, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$detectDragGestures$9;->L$2:Ljava/lang/Object;

    .line 156
    .line 157
    check-cast v0, Landroidx/compose/ui/input/pointer/PointerInputChange;

    .line 158
    .line 159
    iget-object v1, v3, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$detectDragGestures$9;->L$1:Ljava/lang/Object;

    .line 160
    .line 161
    check-cast v1, Landroidx/compose/ui/input/pointer/PointerInputChange;

    .line 162
    .line 163
    iget-object v2, v3, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$detectDragGestures$9;->L$0:Ljava/lang/Object;

    .line 164
    .line 165
    check-cast v2, Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;

    .line 166
    .line 167
    invoke-static/range {p1 .. p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 168
    .line 169
    .line 170
    move-object/from16 v4, p1

    .line 171
    .line 172
    const-wide v18, 0x7fffffff7fffffffL

    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    goto/16 :goto_11

    .line 178
    .line 179
    :pswitch_4
    const-wide v16, 0x7fc000007fc00000L    # 2.247117487993712E307

    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    iget v0, v3, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$detectDragGestures$9;->F$0:F

    .line 185
    .line 186
    iget-object v1, v3, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$detectDragGestures$9;->L$6:Ljava/lang/Object;

    .line 187
    .line 188
    check-cast v1, Landroidx/compose/ui/input/pointer/PointerInputChange;

    .line 189
    .line 190
    iget-object v2, v3, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$detectDragGestures$9;->L$5:Ljava/lang/Object;

    .line 191
    .line 192
    check-cast v2, Landroidx/compose/foundation/gestures/TouchSlopDetector;

    .line 193
    .line 194
    iget-object v4, v3, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$detectDragGestures$9;->L$4:Ljava/lang/Object;

    .line 195
    .line 196
    check-cast v4, Lkotlin/jvm/internal/Ref$LongRef;

    .line 197
    .line 198
    iget-object v5, v3, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$detectDragGestures$9;->L$3:Ljava/lang/Object;

    .line 199
    .line 200
    check-cast v5, Lkotlin/jvm/internal/Ref$LongRef;

    .line 201
    .line 202
    iget-object v7, v3, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$detectDragGestures$9;->L$2:Ljava/lang/Object;

    .line 203
    .line 204
    check-cast v7, Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;

    .line 205
    .line 206
    iget-object v8, v3, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$detectDragGestures$9;->L$1:Ljava/lang/Object;

    .line 207
    .line 208
    check-cast v8, Landroidx/compose/ui/input/pointer/PointerInputChange;

    .line 209
    .line 210
    iget-object v14, v3, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$detectDragGestures$9;->L$0:Ljava/lang/Object;

    .line 211
    .line 212
    check-cast v14, Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;

    .line 213
    .line 214
    invoke-static/range {p1 .. p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 215
    .line 216
    .line 217
    move-object v9, v5

    .line 218
    move-object v5, v2

    .line 219
    move-object v2, v7

    .line 220
    move-object v7, v9

    .line 221
    move-object v9, v4

    .line 222
    move-object v4, v14

    .line 223
    const-wide v18, 0x7fffffff7fffffffL

    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    goto/16 :goto_c

    .line 229
    .line 230
    :pswitch_5
    const-wide v16, 0x7fc000007fc00000L    # 2.247117487993712E307

    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    iget v0, v3, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$detectDragGestures$9;->F$0:F

    .line 236
    .line 237
    iget-object v1, v3, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$detectDragGestures$9;->L$5:Ljava/lang/Object;

    .line 238
    .line 239
    check-cast v1, Landroidx/compose/foundation/gestures/TouchSlopDetector;

    .line 240
    .line 241
    iget-object v2, v3, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$detectDragGestures$9;->L$4:Ljava/lang/Object;

    .line 242
    .line 243
    check-cast v2, Lkotlin/jvm/internal/Ref$LongRef;

    .line 244
    .line 245
    iget-object v4, v3, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$detectDragGestures$9;->L$3:Ljava/lang/Object;

    .line 246
    .line 247
    check-cast v4, Lkotlin/jvm/internal/Ref$LongRef;

    .line 248
    .line 249
    iget-object v5, v3, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$detectDragGestures$9;->L$2:Ljava/lang/Object;

    .line 250
    .line 251
    check-cast v5, Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;

    .line 252
    .line 253
    iget-object v7, v3, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$detectDragGestures$9;->L$1:Ljava/lang/Object;

    .line 254
    .line 255
    check-cast v7, Landroidx/compose/ui/input/pointer/PointerInputChange;

    .line 256
    .line 257
    iget-object v8, v3, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$detectDragGestures$9;->L$0:Ljava/lang/Object;

    .line 258
    .line 259
    check-cast v8, Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;

    .line 260
    .line 261
    invoke-static/range {p1 .. p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 262
    .line 263
    .line 264
    move-object v9, v8

    .line 265
    move-object v8, v4

    .line 266
    move-object v4, v9

    .line 267
    move-object v9, v2

    .line 268
    move-object v2, v5

    .line 269
    const-wide v18, 0x7fffffff7fffffffL

    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    move-object v5, v1

    .line 275
    move-object v1, v7

    .line 276
    move-object/from16 v7, p1

    .line 277
    .line 278
    goto/16 :goto_4

    .line 279
    .line 280
    :pswitch_6
    const-wide v16, 0x7fc000007fc00000L    # 2.247117487993712E307

    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    iget-boolean v0, v3, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$detectDragGestures$9;->Z$0:Z

    .line 286
    .line 287
    iget-object v1, v3, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$detectDragGestures$9;->L$1:Ljava/lang/Object;

    .line 288
    .line 289
    check-cast v1, Landroidx/compose/ui/input/pointer/PointerInputChange;

    .line 290
    .line 291
    iget-object v2, v3, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$detectDragGestures$9;->L$0:Ljava/lang/Object;

    .line 292
    .line 293
    check-cast v2, Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;

    .line 294
    .line 295
    invoke-static/range {p1 .. p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 296
    .line 297
    .line 298
    move-object v7, v1

    .line 299
    move-object/from16 v1, p1

    .line 300
    .line 301
    goto :goto_1

    .line 302
    :pswitch_7
    const-wide v16, 0x7fc000007fc00000L    # 2.247117487993712E307

    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    iget-object v0, v3, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$detectDragGestures$9;->L$0:Ljava/lang/Object;

    .line 308
    .line 309
    check-cast v0, Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;

    .line 310
    .line 311
    invoke-static/range {p1 .. p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 312
    .line 313
    .line 314
    move-object/from16 v1, p1

    .line 315
    .line 316
    goto :goto_0

    .line 317
    :pswitch_8
    const-wide v16, 0x7fc000007fc00000L    # 2.247117487993712E307

    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    invoke-static/range {p1 .. p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 323
    .line 324
    .line 325
    iget-object v0, v3, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$detectDragGestures$9;->L$0:Ljava/lang/Object;

    .line 326
    .line 327
    check-cast v0, Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;

    .line 328
    .line 329
    sget-object v1, Landroidx/compose/ui/input/pointer/PointerEventPass;->Initial:Landroidx/compose/ui/input/pointer/PointerEventPass;

    .line 330
    .line 331
    iput-object v0, v3, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$detectDragGestures$9;->L$0:Ljava/lang/Object;

    .line 332
    .line 333
    iput v12, v3, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$detectDragGestures$9;->label:I

    .line 334
    .line 335
    invoke-static {v0, v11, v1, v3}, Landroidx/compose/foundation/gestures/TapGestureDetectorKt;->awaitFirstDown(Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;ZLandroidx/compose/ui/input/pointer/PointerEventPass;Lh6/c;)Ljava/lang/Object;

    .line 336
    .line 337
    .line 338
    move-result-object v1

    .line 339
    if-ne v1, v6, :cond_0

    .line 340
    .line 341
    goto/16 :goto_23

    .line 342
    .line 343
    :cond_0
    :goto_0
    move-object v7, v1

    .line 344
    check-cast v7, Landroidx/compose/ui/input/pointer/PointerInputChange;

    .line 345
    .line 346
    iget-object v1, v3, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$detectDragGestures$9;->$shouldAwaitTouchSlop:Lr6/a;

    .line 347
    .line 348
    invoke-interface {v1}, Lr6/a;->invoke()Ljava/lang/Object;

    .line 349
    .line 350
    .line 351
    move-result-object v1

    .line 352
    check-cast v1, Ljava/lang/Boolean;

    .line 353
    .line 354
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 355
    .line 356
    .line 357
    move-result v8

    .line 358
    if-nez v8, :cond_1

    .line 359
    .line 360
    invoke-virtual {v7}, Landroidx/compose/ui/input/pointer/PointerInputChange;->consume()V

    .line 361
    .line 362
    .line 363
    :cond_1
    iput-object v0, v3, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$detectDragGestures$9;->L$0:Ljava/lang/Object;

    .line 364
    .line 365
    iput-object v7, v3, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$detectDragGestures$9;->L$1:Ljava/lang/Object;

    .line 366
    .line 367
    iput-boolean v8, v3, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$detectDragGestures$9;->Z$0:Z

    .line 368
    .line 369
    const/4 v1, 0x2

    .line 370
    iput v1, v3, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$detectDragGestures$9;->label:I

    .line 371
    .line 372
    const/4 v1, 0x0

    .line 373
    const/4 v2, 0x0

    .line 374
    const/4 v4, 0x2

    .line 375
    const/4 v5, 0x0

    .line 376
    invoke-static/range {v0 .. v5}, Landroidx/compose/foundation/gestures/TapGestureDetectorKt;->awaitFirstDown$default(Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;ZLandroidx/compose/ui/input/pointer/PointerEventPass;Lh6/c;ILjava/lang/Object;)Ljava/lang/Object;

    .line 377
    .line 378
    .line 379
    move-result-object v1

    .line 380
    if-ne v1, v6, :cond_2

    .line 381
    .line 382
    goto/16 :goto_23

    .line 383
    .line 384
    :cond_2
    move-object v2, v0

    .line 385
    move v0, v8

    .line 386
    :goto_1
    check-cast v1, Landroidx/compose/ui/input/pointer/PointerInputChange;

    .line 387
    .line 388
    iget-object v4, v3, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$detectDragGestures$9;->$overSlop:Lkotlin/jvm/internal/Ref$LongRef;

    .line 389
    .line 390
    sget-object v5, Landroidx/compose/ui/geometry/Offset;->Companion:Landroidx/compose/ui/geometry/Offset$Companion;

    .line 391
    .line 392
    invoke-virtual {v5}, Landroidx/compose/ui/geometry/Offset$Companion;->getZero-F1C5BW0()J

    .line 393
    .line 394
    .line 395
    move-result-wide v14

    .line 396
    iput-wide v14, v4, Lkotlin/jvm/internal/Ref$LongRef;->element:J

    .line 397
    .line 398
    if-eqz v0, :cond_12

    .line 399
    .line 400
    :goto_2
    invoke-virtual {v1}, Landroidx/compose/ui/input/pointer/PointerInputChange;->getId-J3iCeTQ()J

    .line 401
    .line 402
    .line 403
    move-result-wide v4

    .line 404
    invoke-virtual {v1}, Landroidx/compose/ui/input/pointer/PointerInputChange;->getType-T8wyACA()I

    .line 405
    .line 406
    .line 407
    move-result v0

    .line 408
    iget-object v7, v3, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$detectDragGestures$9;->$orientationLock:Landroidx/compose/foundation/gestures/Orientation;

    .line 409
    .line 410
    iget-object v8, v3, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$detectDragGestures$9;->$overSlop:Lkotlin/jvm/internal/Ref$LongRef;

    .line 411
    .line 412
    sget-object v14, Landroidx/compose/ui/geometry/Offset;->Companion:Landroidx/compose/ui/geometry/Offset$Companion;

    .line 413
    .line 414
    invoke-virtual {v14}, Landroidx/compose/ui/geometry/Offset$Companion;->getZero-F1C5BW0()J

    .line 415
    .line 416
    .line 417
    move-result-wide v14

    .line 418
    const-wide v18, 0x7fffffff7fffffffL

    .line 419
    .line 420
    .line 421
    .line 422
    .line 423
    invoke-interface {v2}, Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;->getCurrentEvent()Landroidx/compose/ui/input/pointer/PointerEvent;

    .line 424
    .line 425
    .line 426
    move-result-object v9

    .line 427
    invoke-static {v9, v4, v5}, Landroidx/compose/foundation/gestures/DragGestureDetectorKt;->access$isPointerUp-DmW0f2w(Landroidx/compose/ui/input/pointer/PointerEvent;J)Z

    .line 428
    .line 429
    .line 430
    move-result v9

    .line 431
    if-eqz v9, :cond_3

    .line 432
    .line 433
    move-object v7, v13

    .line 434
    goto/16 :goto_d

    .line 435
    .line 436
    :cond_3
    invoke-interface {v2}, Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;->getViewConfiguration()Landroidx/compose/ui/platform/ViewConfiguration;

    .line 437
    .line 438
    .line 439
    move-result-object v9

    .line 440
    invoke-static {v9, v0}, Landroidx/compose/foundation/gestures/DragGestureDetectorKt;->pointerSlop-E8SPZFQ(Landroidx/compose/ui/platform/ViewConfiguration;I)F

    .line 441
    .line 442
    .line 443
    move-result v0

    .line 444
    new-instance v9, Lkotlin/jvm/internal/Ref$LongRef;

    .line 445
    .line 446
    invoke-direct {v9}, Lkotlin/jvm/internal/Ref$LongRef;-><init>()V

    .line 447
    .line 448
    .line 449
    iput-wide v4, v9, Lkotlin/jvm/internal/Ref$LongRef;->element:J

    .line 450
    .line 451
    new-instance v4, Landroidx/compose/foundation/gestures/TouchSlopDetector;

    .line 452
    .line 453
    invoke-direct {v4, v7, v14, v15, v13}, Landroidx/compose/foundation/gestures/TouchSlopDetector;-><init>(Landroidx/compose/foundation/gestures/Orientation;JLkotlin/jvm/internal/e;)V

    .line 454
    .line 455
    .line 456
    move-object v5, v4

    .line 457
    move-object v4, v2

    .line 458
    :goto_3
    iput-object v4, v3, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$detectDragGestures$9;->L$0:Ljava/lang/Object;

    .line 459
    .line 460
    iput-object v1, v3, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$detectDragGestures$9;->L$1:Ljava/lang/Object;

    .line 461
    .line 462
    iput-object v2, v3, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$detectDragGestures$9;->L$2:Ljava/lang/Object;

    .line 463
    .line 464
    iput-object v8, v3, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$detectDragGestures$9;->L$3:Ljava/lang/Object;

    .line 465
    .line 466
    iput-object v9, v3, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$detectDragGestures$9;->L$4:Ljava/lang/Object;

    .line 467
    .line 468
    iput-object v5, v3, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$detectDragGestures$9;->L$5:Ljava/lang/Object;

    .line 469
    .line 470
    iput-object v13, v3, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$detectDragGestures$9;->L$6:Ljava/lang/Object;

    .line 471
    .line 472
    iput v0, v3, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$detectDragGestures$9;->F$0:F

    .line 473
    .line 474
    const/4 v7, 0x3

    .line 475
    iput v7, v3, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$detectDragGestures$9;->label:I

    .line 476
    .line 477
    invoke-static {v2, v13, v3, v12, v13}, Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;->awaitPointerEvent$default(Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;Landroidx/compose/ui/input/pointer/PointerEventPass;Lh6/c;ILjava/lang/Object;)Ljava/lang/Object;

    .line 478
    .line 479
    .line 480
    move-result-object v7

    .line 481
    if-ne v7, v6, :cond_4

    .line 482
    .line 483
    goto/16 :goto_23

    .line 484
    .line 485
    :cond_4
    :goto_4
    check-cast v7, Landroidx/compose/ui/input/pointer/PointerEvent;

    .line 486
    .line 487
    invoke-virtual {v7}, Landroidx/compose/ui/input/pointer/PointerEvent;->getChanges()Ljava/util/List;

    .line 488
    .line 489
    .line 490
    move-result-object v10

    .line 491
    invoke-interface {v10}, Ljava/util/Collection;->size()I

    .line 492
    .line 493
    .line 494
    move-result v14

    .line 495
    move v15, v11

    .line 496
    :goto_5
    if-ge v15, v14, :cond_6

    .line 497
    .line 498
    invoke-interface {v10, v15}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 499
    .line 500
    .line 501
    move-result-object v20

    .line 502
    move-object/from16 v21, v20

    .line 503
    .line 504
    check-cast v21, Landroidx/compose/ui/input/pointer/PointerInputChange;

    .line 505
    .line 506
    invoke-virtual/range {v21 .. v21}, Landroidx/compose/ui/input/pointer/PointerInputChange;->getId-J3iCeTQ()J

    .line 507
    .line 508
    .line 509
    move-result-wide v11

    .line 510
    move/from16 p1, v14

    .line 511
    .line 512
    iget-wide v13, v9, Lkotlin/jvm/internal/Ref$LongRef;->element:J

    .line 513
    .line 514
    invoke-static {v11, v12, v13, v14}, Landroidx/compose/ui/input/pointer/PointerId;->equals-impl0(JJ)Z

    .line 515
    .line 516
    .line 517
    move-result v11

    .line 518
    if-eqz v11, :cond_5

    .line 519
    .line 520
    goto :goto_6

    .line 521
    :cond_5
    add-int/lit8 v15, v15, 0x1

    .line 522
    .line 523
    move/from16 v14, p1

    .line 524
    .line 525
    const/4 v11, 0x0

    .line 526
    const/4 v12, 0x1

    .line 527
    const/4 v13, 0x0

    .line 528
    goto :goto_5

    .line 529
    :cond_6
    const/16 v20, 0x0

    .line 530
    .line 531
    :goto_6
    move-object/from16 v10, v20

    .line 532
    .line 533
    check-cast v10, Landroidx/compose/ui/input/pointer/PointerInputChange;

    .line 534
    .line 535
    if-nez v10, :cond_7

    .line 536
    .line 537
    :goto_7
    move-object v2, v4

    .line 538
    :goto_8
    const/4 v7, 0x0

    .line 539
    goto/16 :goto_d

    .line 540
    .line 541
    :cond_7
    invoke-virtual {v10}, Landroidx/compose/ui/input/pointer/PointerInputChange;->isConsumed()Z

    .line 542
    .line 543
    .line 544
    move-result v11

    .line 545
    if-eqz v11, :cond_8

    .line 546
    .line 547
    goto :goto_7

    .line 548
    :cond_8
    invoke-static {v10}, Landroidx/compose/ui/input/pointer/PointerEventKt;->changedToUpIgnoreConsumed(Landroidx/compose/ui/input/pointer/PointerInputChange;)Z

    .line 549
    .line 550
    .line 551
    move-result v11

    .line 552
    if-eqz v11, :cond_c

    .line 553
    .line 554
    invoke-virtual {v7}, Landroidx/compose/ui/input/pointer/PointerEvent;->getChanges()Ljava/util/List;

    .line 555
    .line 556
    .line 557
    move-result-object v7

    .line 558
    invoke-interface {v7}, Ljava/util/Collection;->size()I

    .line 559
    .line 560
    .line 561
    move-result v10

    .line 562
    const/4 v11, 0x0

    .line 563
    :goto_9
    if-ge v11, v10, :cond_a

    .line 564
    .line 565
    invoke-interface {v7, v11}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 566
    .line 567
    .line 568
    move-result-object v12

    .line 569
    move-object v13, v12

    .line 570
    check-cast v13, Landroidx/compose/ui/input/pointer/PointerInputChange;

    .line 571
    .line 572
    invoke-virtual {v13}, Landroidx/compose/ui/input/pointer/PointerInputChange;->getPressed()Z

    .line 573
    .line 574
    .line 575
    move-result v13

    .line 576
    if-eqz v13, :cond_9

    .line 577
    .line 578
    goto :goto_a

    .line 579
    :cond_9
    add-int/lit8 v11, v11, 0x1

    .line 580
    .line 581
    goto :goto_9

    .line 582
    :cond_a
    const/4 v12, 0x0

    .line 583
    :goto_a
    check-cast v12, Landroidx/compose/ui/input/pointer/PointerInputChange;

    .line 584
    .line 585
    if-nez v12, :cond_b

    .line 586
    .line 587
    goto :goto_7

    .line 588
    :cond_b
    invoke-virtual {v12}, Landroidx/compose/ui/input/pointer/PointerInputChange;->getId-J3iCeTQ()J

    .line 589
    .line 590
    .line 591
    move-result-wide v10

    .line 592
    iput-wide v10, v9, Lkotlin/jvm/internal/Ref$LongRef;->element:J

    .line 593
    .line 594
    goto :goto_b

    .line 595
    :cond_c
    invoke-virtual {v5, v10, v0}, Landroidx/compose/foundation/gestures/TouchSlopDetector;->addPointerInputChange-dBAh8RU(Landroidx/compose/ui/input/pointer/PointerInputChange;F)J

    .line 596
    .line 597
    .line 598
    move-result-wide v11

    .line 599
    and-long v13, v11, v18

    .line 600
    .line 601
    cmp-long v7, v13, v16

    .line 602
    .line 603
    if-eqz v7, :cond_e

    .line 604
    .line 605
    invoke-virtual {v10}, Landroidx/compose/ui/input/pointer/PointerInputChange;->consume()V

    .line 606
    .line 607
    .line 608
    iput-wide v11, v8, Lkotlin/jvm/internal/Ref$LongRef;->element:J

    .line 609
    .line 610
    invoke-virtual {v10}, Landroidx/compose/ui/input/pointer/PointerInputChange;->isConsumed()Z

    .line 611
    .line 612
    .line 613
    move-result v7

    .line 614
    if-eqz v7, :cond_d

    .line 615
    .line 616
    move-object v2, v4

    .line 617
    move-object v7, v10

    .line 618
    goto :goto_d

    .line 619
    :cond_d
    invoke-virtual {v5}, Landroidx/compose/foundation/gestures/TouchSlopDetector;->reset()V

    .line 620
    .line 621
    .line 622
    :goto_b
    const/4 v11, 0x0

    .line 623
    const/4 v12, 0x1

    .line 624
    const/4 v13, 0x0

    .line 625
    goto/16 :goto_3

    .line 626
    .line 627
    :cond_e
    sget-object v7, Landroidx/compose/ui/input/pointer/PointerEventPass;->Final:Landroidx/compose/ui/input/pointer/PointerEventPass;

    .line 628
    .line 629
    iput-object v4, v3, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$detectDragGestures$9;->L$0:Ljava/lang/Object;

    .line 630
    .line 631
    iput-object v1, v3, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$detectDragGestures$9;->L$1:Ljava/lang/Object;

    .line 632
    .line 633
    iput-object v2, v3, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$detectDragGestures$9;->L$2:Ljava/lang/Object;

    .line 634
    .line 635
    iput-object v8, v3, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$detectDragGestures$9;->L$3:Ljava/lang/Object;

    .line 636
    .line 637
    iput-object v9, v3, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$detectDragGestures$9;->L$4:Ljava/lang/Object;

    .line 638
    .line 639
    iput-object v5, v3, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$detectDragGestures$9;->L$5:Ljava/lang/Object;

    .line 640
    .line 641
    iput-object v10, v3, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$detectDragGestures$9;->L$6:Ljava/lang/Object;

    .line 642
    .line 643
    iput v0, v3, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$detectDragGestures$9;->F$0:F

    .line 644
    .line 645
    const/4 v11, 0x4

    .line 646
    iput v11, v3, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$detectDragGestures$9;->label:I

    .line 647
    .line 648
    invoke-interface {v2, v7, v3}, Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;->awaitPointerEvent(Landroidx/compose/ui/input/pointer/PointerEventPass;Lh6/c;)Ljava/lang/Object;

    .line 649
    .line 650
    .line 651
    move-result-object v7

    .line 652
    if-ne v7, v6, :cond_f

    .line 653
    .line 654
    goto/16 :goto_23

    .line 655
    .line 656
    :cond_f
    move-object v7, v8

    .line 657
    move-object v8, v1

    .line 658
    move-object v1, v10

    .line 659
    :goto_c
    invoke-virtual {v1}, Landroidx/compose/ui/input/pointer/PointerInputChange;->isConsumed()Z

    .line 660
    .line 661
    .line 662
    move-result v1

    .line 663
    if-eqz v1, :cond_11

    .line 664
    .line 665
    move-object v2, v4

    .line 666
    move-object v1, v8

    .line 667
    goto/16 :goto_8

    .line 668
    .line 669
    :goto_d
    if-eqz v7, :cond_13

    .line 670
    .line 671
    invoke-virtual {v7}, Landroidx/compose/ui/input/pointer/PointerInputChange;->isConsumed()Z

    .line 672
    .line 673
    .line 674
    move-result v0

    .line 675
    if-eqz v0, :cond_10

    .line 676
    .line 677
    goto :goto_e

    .line 678
    :cond_10
    const/4 v11, 0x0

    .line 679
    const/4 v12, 0x1

    .line 680
    const/4 v13, 0x0

    .line 681
    goto/16 :goto_2

    .line 682
    .line 683
    :cond_11
    move-object v1, v8

    .line 684
    const/4 v11, 0x0

    .line 685
    const/4 v12, 0x1

    .line 686
    const/4 v13, 0x0

    .line 687
    move-object v8, v7

    .line 688
    goto/16 :goto_3

    .line 689
    .line 690
    :cond_12
    const-wide v18, 0x7fffffff7fffffffL

    .line 691
    .line 692
    .line 693
    .line 694
    .line 695
    :cond_13
    :goto_e
    sget-boolean v0, Landroidx/compose/foundation/ComposeFoundationFlags;->DragGesturePickUpEnabled:Z

    .line 696
    .line 697
    if-eqz v0, :cond_2a

    .line 698
    .line 699
    if-nez v7, :cond_2a

    .line 700
    .line 701
    invoke-interface {v2}, Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;->getCurrentEvent()Landroidx/compose/ui/input/pointer/PointerEvent;

    .line 702
    .line 703
    .line 704
    move-result-object v0

    .line 705
    invoke-virtual {v0}, Landroidx/compose/ui/input/pointer/PointerEvent;->getChanges()Ljava/util/List;

    .line 706
    .line 707
    .line 708
    move-result-object v0

    .line 709
    invoke-interface {v0}, Ljava/util/Collection;->size()I

    .line 710
    .line 711
    .line 712
    move-result v4

    .line 713
    const/4 v5, 0x0

    .line 714
    :goto_f
    if-ge v5, v4, :cond_2a

    .line 715
    .line 716
    invoke-interface {v0, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 717
    .line 718
    .line 719
    move-result-object v8

    .line 720
    check-cast v8, Landroidx/compose/ui/input/pointer/PointerInputChange;

    .line 721
    .line 722
    invoke-virtual {v8}, Landroidx/compose/ui/input/pointer/PointerInputChange;->getPressed()Z

    .line 723
    .line 724
    .line 725
    move-result v8

    .line 726
    if-eqz v8, :cond_29

    .line 727
    .line 728
    move-object v0, v7

    .line 729
    :goto_10
    sget-object v4, Landroidx/compose/ui/input/pointer/PointerEventPass;->Final:Landroidx/compose/ui/input/pointer/PointerEventPass;

    .line 730
    .line 731
    iput-object v2, v3, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$detectDragGestures$9;->L$0:Ljava/lang/Object;

    .line 732
    .line 733
    iput-object v1, v3, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$detectDragGestures$9;->L$1:Ljava/lang/Object;

    .line 734
    .line 735
    iput-object v0, v3, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$detectDragGestures$9;->L$2:Ljava/lang/Object;

    .line 736
    .line 737
    const/4 v5, 0x0

    .line 738
    iput-object v5, v3, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$detectDragGestures$9;->L$3:Ljava/lang/Object;

    .line 739
    .line 740
    iput-object v5, v3, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$detectDragGestures$9;->L$4:Ljava/lang/Object;

    .line 741
    .line 742
    iput-object v5, v3, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$detectDragGestures$9;->L$5:Ljava/lang/Object;

    .line 743
    .line 744
    iput-object v5, v3, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$detectDragGestures$9;->L$6:Ljava/lang/Object;

    .line 745
    .line 746
    const/4 v5, 0x5

    .line 747
    iput v5, v3, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$detectDragGestures$9;->label:I

    .line 748
    .line 749
    invoke-interface {v2, v4, v3}, Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;->awaitPointerEvent(Landroidx/compose/ui/input/pointer/PointerEventPass;Lh6/c;)Ljava/lang/Object;

    .line 750
    .line 751
    .line 752
    move-result-object v4

    .line 753
    if-ne v4, v6, :cond_14

    .line 754
    .line 755
    goto/16 :goto_23

    .line 756
    .line 757
    :cond_14
    :goto_11
    check-cast v4, Landroidx/compose/ui/input/pointer/PointerEvent;

    .line 758
    .line 759
    invoke-virtual {v4}, Landroidx/compose/ui/input/pointer/PointerEvent;->getChanges()Ljava/util/List;

    .line 760
    .line 761
    .line 762
    move-result-object v5

    .line 763
    invoke-interface {v5}, Ljava/util/Collection;->size()I

    .line 764
    .line 765
    .line 766
    move-result v7

    .line 767
    const/4 v8, 0x0

    .line 768
    :goto_12
    if-ge v8, v7, :cond_17

    .line 769
    .line 770
    invoke-interface {v5, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 771
    .line 772
    .line 773
    move-result-object v9

    .line 774
    check-cast v9, Landroidx/compose/ui/input/pointer/PointerInputChange;

    .line 775
    .line 776
    invoke-virtual {v9}, Landroidx/compose/ui/input/pointer/PointerInputChange;->isConsumed()Z

    .line 777
    .line 778
    .line 779
    move-result v9

    .line 780
    if-eqz v9, :cond_16

    .line 781
    .line 782
    invoke-virtual {v4}, Landroidx/compose/ui/input/pointer/PointerEvent;->getChanges()Ljava/util/List;

    .line 783
    .line 784
    .line 785
    move-result-object v5

    .line 786
    invoke-interface {v5}, Ljava/util/Collection;->size()I

    .line 787
    .line 788
    .line 789
    move-result v7

    .line 790
    const/4 v8, 0x0

    .line 791
    :goto_13
    if-ge v8, v7, :cond_17

    .line 792
    .line 793
    invoke-interface {v5, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 794
    .line 795
    .line 796
    move-result-object v9

    .line 797
    check-cast v9, Landroidx/compose/ui/input/pointer/PointerInputChange;

    .line 798
    .line 799
    invoke-virtual {v9}, Landroidx/compose/ui/input/pointer/PointerInputChange;->getPressed()Z

    .line 800
    .line 801
    .line 802
    move-result v9

    .line 803
    if-eqz v9, :cond_15

    .line 804
    .line 805
    goto :goto_10

    .line 806
    :cond_15
    add-int/lit8 v8, v8, 0x1

    .line 807
    .line 808
    goto :goto_13

    .line 809
    :cond_16
    add-int/lit8 v8, v8, 0x1

    .line 810
    .line 811
    goto :goto_12

    .line 812
    :cond_17
    invoke-virtual {v4}, Landroidx/compose/ui/input/pointer/PointerEvent;->getChanges()Ljava/util/List;

    .line 813
    .line 814
    .line 815
    move-result-object v5

    .line 816
    invoke-interface {v5}, Ljava/util/Collection;->size()I

    .line 817
    .line 818
    .line 819
    move-result v7

    .line 820
    const/4 v8, 0x0

    .line 821
    :goto_14
    if-ge v8, v7, :cond_28

    .line 822
    .line 823
    invoke-interface {v5, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 824
    .line 825
    .line 826
    move-result-object v9

    .line 827
    check-cast v9, Landroidx/compose/ui/input/pointer/PointerInputChange;

    .line 828
    .line 829
    invoke-virtual {v9}, Landroidx/compose/ui/input/pointer/PointerInputChange;->getPressed()Z

    .line 830
    .line 831
    .line 832
    move-result v9

    .line 833
    if-eqz v9, :cond_27

    .line 834
    .line 835
    invoke-virtual {v4}, Landroidx/compose/ui/input/pointer/PointerEvent;->getChanges()Ljava/util/List;

    .line 836
    .line 837
    .line 838
    move-result-object v0

    .line 839
    invoke-static {v0}, Lkotlin/collections/t;->i0(Ljava/util/List;)Ljava/lang/Object;

    .line 840
    .line 841
    .line 842
    move-result-object v0

    .line 843
    check-cast v0, Landroidx/compose/ui/input/pointer/PointerInputChange;

    .line 844
    .line 845
    if-eqz v0, :cond_18

    .line 846
    .line 847
    invoke-virtual {v0}, Landroidx/compose/ui/input/pointer/PointerInputChange;->getPosition-F1C5BW0()J

    .line 848
    .line 849
    .line 850
    move-result-wide v4

    .line 851
    goto :goto_15

    .line 852
    :cond_18
    sget-object v0, Landroidx/compose/ui/geometry/Offset;->Companion:Landroidx/compose/ui/geometry/Offset$Companion;

    .line 853
    .line 854
    invoke-virtual {v0}, Landroidx/compose/ui/geometry/Offset$Companion;->getZero-F1C5BW0()J

    .line 855
    .line 856
    .line 857
    move-result-wide v4

    .line 858
    :goto_15
    invoke-virtual {v1}, Landroidx/compose/ui/input/pointer/PointerInputChange;->getPosition-F1C5BW0()J

    .line 859
    .line 860
    .line 861
    move-result-wide v7

    .line 862
    invoke-static {v4, v5, v7, v8}, Landroidx/compose/ui/geometry/Offset;->minus-MK-Hz9U(JJ)J

    .line 863
    .line 864
    .line 865
    move-result-wide v4

    .line 866
    invoke-virtual {v1}, Landroidx/compose/ui/input/pointer/PointerInputChange;->getId-J3iCeTQ()J

    .line 867
    .line 868
    .line 869
    move-result-wide v7

    .line 870
    invoke-virtual {v1}, Landroidx/compose/ui/input/pointer/PointerInputChange;->getType-T8wyACA()I

    .line 871
    .line 872
    .line 873
    move-result v0

    .line 874
    iget-object v9, v3, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$detectDragGestures$9;->$orientationLock:Landroidx/compose/foundation/gestures/Orientation;

    .line 875
    .line 876
    iget-object v10, v3, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$detectDragGestures$9;->$overSlop:Lkotlin/jvm/internal/Ref$LongRef;

    .line 877
    .line 878
    invoke-interface {v2}, Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;->getCurrentEvent()Landroidx/compose/ui/input/pointer/PointerEvent;

    .line 879
    .line 880
    .line 881
    move-result-object v11

    .line 882
    invoke-static {v11, v7, v8}, Landroidx/compose/foundation/gestures/DragGestureDetectorKt;->access$isPointerUp-DmW0f2w(Landroidx/compose/ui/input/pointer/PointerEvent;J)Z

    .line 883
    .line 884
    .line 885
    move-result v11

    .line 886
    if-eqz v11, :cond_19

    .line 887
    .line 888
    :goto_16
    const/4 v7, 0x0

    .line 889
    goto/16 :goto_e

    .line 890
    .line 891
    :cond_19
    invoke-interface {v2}, Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;->getViewConfiguration()Landroidx/compose/ui/platform/ViewConfiguration;

    .line 892
    .line 893
    .line 894
    move-result-object v11

    .line 895
    invoke-static {v11, v0}, Landroidx/compose/foundation/gestures/DragGestureDetectorKt;->pointerSlop-E8SPZFQ(Landroidx/compose/ui/platform/ViewConfiguration;I)F

    .line 896
    .line 897
    .line 898
    move-result v0

    .line 899
    new-instance v11, Lkotlin/jvm/internal/Ref$LongRef;

    .line 900
    .line 901
    invoke-direct {v11}, Lkotlin/jvm/internal/Ref$LongRef;-><init>()V

    .line 902
    .line 903
    .line 904
    iput-wide v7, v11, Lkotlin/jvm/internal/Ref$LongRef;->element:J

    .line 905
    .line 906
    new-instance v7, Landroidx/compose/foundation/gestures/TouchSlopDetector;

    .line 907
    .line 908
    const/4 v8, 0x0

    .line 909
    invoke-direct {v7, v9, v4, v5, v8}, Landroidx/compose/foundation/gestures/TouchSlopDetector;-><init>(Landroidx/compose/foundation/gestures/Orientation;JLkotlin/jvm/internal/e;)V

    .line 910
    .line 911
    .line 912
    move-object v4, v2

    .line 913
    :goto_17
    iput-object v4, v3, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$detectDragGestures$9;->L$0:Ljava/lang/Object;

    .line 914
    .line 915
    iput-object v1, v3, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$detectDragGestures$9;->L$1:Ljava/lang/Object;

    .line 916
    .line 917
    iput-object v2, v3, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$detectDragGestures$9;->L$2:Ljava/lang/Object;

    .line 918
    .line 919
    iput-object v10, v3, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$detectDragGestures$9;->L$3:Ljava/lang/Object;

    .line 920
    .line 921
    iput-object v11, v3, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$detectDragGestures$9;->L$4:Ljava/lang/Object;

    .line 922
    .line 923
    iput-object v7, v3, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$detectDragGestures$9;->L$5:Ljava/lang/Object;

    .line 924
    .line 925
    iput-object v8, v3, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$detectDragGestures$9;->L$6:Ljava/lang/Object;

    .line 926
    .line 927
    iput v0, v3, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$detectDragGestures$9;->F$0:F

    .line 928
    .line 929
    const/4 v5, 0x6

    .line 930
    iput v5, v3, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$detectDragGestures$9;->label:I

    .line 931
    .line 932
    const/4 v5, 0x1

    .line 933
    invoke-static {v2, v8, v3, v5, v8}, Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;->awaitPointerEvent$default(Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;Landroidx/compose/ui/input/pointer/PointerEventPass;Lh6/c;ILjava/lang/Object;)Ljava/lang/Object;

    .line 934
    .line 935
    .line 936
    move-result-object v9

    .line 937
    if-ne v9, v6, :cond_1a

    .line 938
    .line 939
    goto/16 :goto_23

    .line 940
    .line 941
    :cond_1a
    :goto_18
    check-cast v9, Landroidx/compose/ui/input/pointer/PointerEvent;

    .line 942
    .line 943
    invoke-virtual {v9}, Landroidx/compose/ui/input/pointer/PointerEvent;->getChanges()Ljava/util/List;

    .line 944
    .line 945
    .line 946
    move-result-object v5

    .line 947
    invoke-interface {v5}, Ljava/util/Collection;->size()I

    .line 948
    .line 949
    .line 950
    move-result v8

    .line 951
    const/4 v12, 0x0

    .line 952
    :goto_19
    if-ge v12, v8, :cond_1c

    .line 953
    .line 954
    invoke-interface {v5, v12}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 955
    .line 956
    .line 957
    move-result-object v13

    .line 958
    move-object v14, v13

    .line 959
    check-cast v14, Landroidx/compose/ui/input/pointer/PointerInputChange;

    .line 960
    .line 961
    invoke-virtual {v14}, Landroidx/compose/ui/input/pointer/PointerInputChange;->getId-J3iCeTQ()J

    .line 962
    .line 963
    .line 964
    move-result-wide v14

    .line 965
    move/from16 v20, v8

    .line 966
    .line 967
    move-object/from16 p1, v9

    .line 968
    .line 969
    iget-wide v8, v11, Lkotlin/jvm/internal/Ref$LongRef;->element:J

    .line 970
    .line 971
    invoke-static {v14, v15, v8, v9}, Landroidx/compose/ui/input/pointer/PointerId;->equals-impl0(JJ)Z

    .line 972
    .line 973
    .line 974
    move-result v8

    .line 975
    if-eqz v8, :cond_1b

    .line 976
    .line 977
    move-object v5, v13

    .line 978
    goto :goto_1a

    .line 979
    :cond_1b
    add-int/lit8 v12, v12, 0x1

    .line 980
    .line 981
    move-object/from16 v9, p1

    .line 982
    .line 983
    move/from16 v8, v20

    .line 984
    .line 985
    goto :goto_19

    .line 986
    :cond_1c
    move-object/from16 p1, v9

    .line 987
    .line 988
    const/4 v5, 0x0

    .line 989
    :goto_1a
    check-cast v5, Landroidx/compose/ui/input/pointer/PointerInputChange;

    .line 990
    .line 991
    if-nez v5, :cond_1d

    .line 992
    .line 993
    :goto_1b
    move-object v2, v4

    .line 994
    goto :goto_16

    .line 995
    :cond_1d
    invoke-virtual {v5}, Landroidx/compose/ui/input/pointer/PointerInputChange;->isConsumed()Z

    .line 996
    .line 997
    .line 998
    move-result v8

    .line 999
    if-eqz v8, :cond_1e

    .line 1000
    .line 1001
    goto :goto_1b

    .line 1002
    :cond_1e
    invoke-static {v5}, Landroidx/compose/ui/input/pointer/PointerEventKt;->changedToUpIgnoreConsumed(Landroidx/compose/ui/input/pointer/PointerInputChange;)Z

    .line 1003
    .line 1004
    .line 1005
    move-result v8

    .line 1006
    if-eqz v8, :cond_22

    .line 1007
    .line 1008
    invoke-virtual/range {p1 .. p1}, Landroidx/compose/ui/input/pointer/PointerEvent;->getChanges()Ljava/util/List;

    .line 1009
    .line 1010
    .line 1011
    move-result-object v5

    .line 1012
    invoke-interface {v5}, Ljava/util/Collection;->size()I

    .line 1013
    .line 1014
    .line 1015
    move-result v8

    .line 1016
    const/4 v9, 0x0

    .line 1017
    :goto_1c
    if-ge v9, v8, :cond_20

    .line 1018
    .line 1019
    invoke-interface {v5, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 1020
    .line 1021
    .line 1022
    move-result-object v12

    .line 1023
    move-object v13, v12

    .line 1024
    check-cast v13, Landroidx/compose/ui/input/pointer/PointerInputChange;

    .line 1025
    .line 1026
    invoke-virtual {v13}, Landroidx/compose/ui/input/pointer/PointerInputChange;->getPressed()Z

    .line 1027
    .line 1028
    .line 1029
    move-result v13

    .line 1030
    if-eqz v13, :cond_1f

    .line 1031
    .line 1032
    move-object v5, v12

    .line 1033
    goto :goto_1d

    .line 1034
    :cond_1f
    add-int/lit8 v9, v9, 0x1

    .line 1035
    .line 1036
    goto :goto_1c

    .line 1037
    :cond_20
    const/4 v5, 0x0

    .line 1038
    :goto_1d
    check-cast v5, Landroidx/compose/ui/input/pointer/PointerInputChange;

    .line 1039
    .line 1040
    if-nez v5, :cond_21

    .line 1041
    .line 1042
    goto :goto_1b

    .line 1043
    :cond_21
    invoke-virtual {v5}, Landroidx/compose/ui/input/pointer/PointerInputChange;->getId-J3iCeTQ()J

    .line 1044
    .line 1045
    .line 1046
    move-result-wide v8

    .line 1047
    iput-wide v8, v11, Lkotlin/jvm/internal/Ref$LongRef;->element:J

    .line 1048
    .line 1049
    goto :goto_1e

    .line 1050
    :cond_22
    invoke-virtual {v7, v5, v0}, Landroidx/compose/foundation/gestures/TouchSlopDetector;->addPointerInputChange-dBAh8RU(Landroidx/compose/ui/input/pointer/PointerInputChange;F)J

    .line 1051
    .line 1052
    .line 1053
    move-result-wide v8

    .line 1054
    and-long v8, v8, v18

    .line 1055
    .line 1056
    cmp-long v8, v8, v16

    .line 1057
    .line 1058
    if-eqz v8, :cond_24

    .line 1059
    .line 1060
    invoke-virtual {v5}, Landroidx/compose/ui/input/pointer/PointerInputChange;->consume()V

    .line 1061
    .line 1062
    .line 1063
    invoke-static {v5}, Landroidx/compose/ui/input/pointer/PointerEventKt;->positionChange(Landroidx/compose/ui/input/pointer/PointerInputChange;)J

    .line 1064
    .line 1065
    .line 1066
    move-result-wide v8

    .line 1067
    iput-wide v8, v10, Lkotlin/jvm/internal/Ref$LongRef;->element:J

    .line 1068
    .line 1069
    invoke-virtual {v5}, Landroidx/compose/ui/input/pointer/PointerInputChange;->isConsumed()Z

    .line 1070
    .line 1071
    .line 1072
    move-result v8

    .line 1073
    if-eqz v8, :cond_23

    .line 1074
    .line 1075
    move-object v2, v4

    .line 1076
    move-object v7, v5

    .line 1077
    goto/16 :goto_e

    .line 1078
    .line 1079
    :cond_23
    invoke-virtual {v7}, Landroidx/compose/foundation/gestures/TouchSlopDetector;->reset()V

    .line 1080
    .line 1081
    .line 1082
    :goto_1e
    const/4 v8, 0x0

    .line 1083
    goto/16 :goto_17

    .line 1084
    .line 1085
    :cond_24
    sget-object v8, Landroidx/compose/ui/input/pointer/PointerEventPass;->Final:Landroidx/compose/ui/input/pointer/PointerEventPass;

    .line 1086
    .line 1087
    iput-object v4, v3, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$detectDragGestures$9;->L$0:Ljava/lang/Object;

    .line 1088
    .line 1089
    iput-object v1, v3, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$detectDragGestures$9;->L$1:Ljava/lang/Object;

    .line 1090
    .line 1091
    iput-object v2, v3, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$detectDragGestures$9;->L$2:Ljava/lang/Object;

    .line 1092
    .line 1093
    iput-object v10, v3, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$detectDragGestures$9;->L$3:Ljava/lang/Object;

    .line 1094
    .line 1095
    iput-object v11, v3, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$detectDragGestures$9;->L$4:Ljava/lang/Object;

    .line 1096
    .line 1097
    iput-object v7, v3, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$detectDragGestures$9;->L$5:Ljava/lang/Object;

    .line 1098
    .line 1099
    iput-object v5, v3, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$detectDragGestures$9;->L$6:Ljava/lang/Object;

    .line 1100
    .line 1101
    iput v0, v3, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$detectDragGestures$9;->F$0:F

    .line 1102
    .line 1103
    const/4 v9, 0x7

    .line 1104
    iput v9, v3, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$detectDragGestures$9;->label:I

    .line 1105
    .line 1106
    invoke-interface {v2, v8, v3}, Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;->awaitPointerEvent(Landroidx/compose/ui/input/pointer/PointerEventPass;Lh6/c;)Ljava/lang/Object;

    .line 1107
    .line 1108
    .line 1109
    move-result-object v8

    .line 1110
    if-ne v8, v6, :cond_25

    .line 1111
    .line 1112
    goto/16 :goto_23

    .line 1113
    .line 1114
    :cond_25
    move-object v15, v1

    .line 1115
    move-object v1, v5

    .line 1116
    :goto_1f
    invoke-virtual {v1}, Landroidx/compose/ui/input/pointer/PointerInputChange;->isConsumed()Z

    .line 1117
    .line 1118
    .line 1119
    move-result v1

    .line 1120
    if-eqz v1, :cond_26

    .line 1121
    .line 1122
    move-object v2, v4

    .line 1123
    move-object v1, v15

    .line 1124
    goto/16 :goto_16

    .line 1125
    .line 1126
    :cond_26
    move-object v1, v15

    .line 1127
    goto :goto_1e

    .line 1128
    :cond_27
    add-int/lit8 v8, v8, 0x1

    .line 1129
    .line 1130
    goto/16 :goto_14

    .line 1131
    .line 1132
    :cond_28
    move-object v7, v0

    .line 1133
    goto/16 :goto_e

    .line 1134
    .line 1135
    :cond_29
    add-int/lit8 v5, v5, 0x1

    .line 1136
    .line 1137
    goto/16 :goto_f

    .line 1138
    .line 1139
    :cond_2a
    if-eqz v7, :cond_3c

    .line 1140
    .line 1141
    iget-object v0, v3, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$detectDragGestures$9;->$onDragStart:Lr6/f;

    .line 1142
    .line 1143
    iget-object v4, v3, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$detectDragGestures$9;->$overSlop:Lkotlin/jvm/internal/Ref$LongRef;

    .line 1144
    .line 1145
    iget-wide v4, v4, Lkotlin/jvm/internal/Ref$LongRef;->element:J

    .line 1146
    .line 1147
    invoke-static {v4, v5}, Landroidx/compose/ui/geometry/Offset;->box-impl(J)Landroidx/compose/ui/geometry/Offset;

    .line 1148
    .line 1149
    .line 1150
    move-result-object v4

    .line 1151
    invoke-interface {v0, v1, v7, v4}, Lr6/f;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1152
    .line 1153
    .line 1154
    iget-object v0, v3, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$detectDragGestures$9;->$onDrag:Lr6/e;

    .line 1155
    .line 1156
    iget-object v1, v3, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$detectDragGestures$9;->$overSlop:Lkotlin/jvm/internal/Ref$LongRef;

    .line 1157
    .line 1158
    iget-wide v4, v1, Lkotlin/jvm/internal/Ref$LongRef;->element:J

    .line 1159
    .line 1160
    invoke-static {v4, v5}, Landroidx/compose/ui/geometry/Offset;->box-impl(J)Landroidx/compose/ui/geometry/Offset;

    .line 1161
    .line 1162
    .line 1163
    move-result-object v1

    .line 1164
    invoke-interface {v0, v7, v1}, Lr6/e;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1165
    .line 1166
    .line 1167
    invoke-virtual {v7}, Landroidx/compose/ui/input/pointer/PointerInputChange;->getId-J3iCeTQ()J

    .line 1168
    .line 1169
    .line 1170
    move-result-wide v0

    .line 1171
    iget-object v4, v3, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$detectDragGestures$9;->$onDrag:Lr6/e;

    .line 1172
    .line 1173
    iget-object v5, v3, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$detectDragGestures$9;->$orientationLock:Landroidx/compose/foundation/gestures/Orientation;

    .line 1174
    .line 1175
    invoke-interface {v2}, Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;->getCurrentEvent()Landroidx/compose/ui/input/pointer/PointerEvent;

    .line 1176
    .line 1177
    .line 1178
    move-result-object v7

    .line 1179
    invoke-static {v7, v0, v1}, Landroidx/compose/foundation/gestures/DragGestureDetectorKt;->access$isPointerUp-DmW0f2w(Landroidx/compose/ui/input/pointer/PointerEvent;J)Z

    .line 1180
    .line 1181
    .line 1182
    move-result v7

    .line 1183
    if-eqz v7, :cond_2b

    .line 1184
    .line 1185
    :goto_20
    const/4 v13, 0x0

    .line 1186
    goto/16 :goto_2d

    .line 1187
    .line 1188
    :cond_2b
    :goto_21
    new-instance v7, Lkotlin/jvm/internal/Ref$LongRef;

    .line 1189
    .line 1190
    invoke-direct {v7}, Lkotlin/jvm/internal/Ref$LongRef;-><init>()V

    .line 1191
    .line 1192
    .line 1193
    iput-wide v0, v7, Lkotlin/jvm/internal/Ref$LongRef;->element:J

    .line 1194
    .line 1195
    move-object v1, v2

    .line 1196
    move-object v0, v7

    .line 1197
    move-object v2, v5

    .line 1198
    move-object v5, v1

    .line 1199
    :cond_2c
    :goto_22
    iput-object v5, v3, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$detectDragGestures$9;->L$0:Ljava/lang/Object;

    .line 1200
    .line 1201
    iput-object v4, v3, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$detectDragGestures$9;->L$1:Ljava/lang/Object;

    .line 1202
    .line 1203
    iput-object v2, v3, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$detectDragGestures$9;->L$2:Ljava/lang/Object;

    .line 1204
    .line 1205
    iput-object v1, v3, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$detectDragGestures$9;->L$3:Ljava/lang/Object;

    .line 1206
    .line 1207
    iput-object v0, v3, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$detectDragGestures$9;->L$4:Ljava/lang/Object;

    .line 1208
    .line 1209
    const/4 v8, 0x0

    .line 1210
    iput-object v8, v3, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$detectDragGestures$9;->L$5:Ljava/lang/Object;

    .line 1211
    .line 1212
    iput-object v8, v3, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$detectDragGestures$9;->L$6:Ljava/lang/Object;

    .line 1213
    .line 1214
    const/16 v7, 0x8

    .line 1215
    .line 1216
    iput v7, v3, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$detectDragGestures$9;->label:I

    .line 1217
    .line 1218
    const/4 v7, 0x1

    .line 1219
    invoke-static {v1, v8, v3, v7, v8}, Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;->awaitPointerEvent$default(Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;Landroidx/compose/ui/input/pointer/PointerEventPass;Lh6/c;ILjava/lang/Object;)Ljava/lang/Object;

    .line 1220
    .line 1221
    .line 1222
    move-result-object v9

    .line 1223
    if-ne v9, v6, :cond_2d

    .line 1224
    .line 1225
    :goto_23
    return-object v6

    .line 1226
    :cond_2d
    :goto_24
    check-cast v9, Landroidx/compose/ui/input/pointer/PointerEvent;

    .line 1227
    .line 1228
    invoke-virtual {v9}, Landroidx/compose/ui/input/pointer/PointerEvent;->getChanges()Ljava/util/List;

    .line 1229
    .line 1230
    .line 1231
    move-result-object v10

    .line 1232
    invoke-interface {v10}, Ljava/util/Collection;->size()I

    .line 1233
    .line 1234
    .line 1235
    move-result v11

    .line 1236
    const/4 v12, 0x0

    .line 1237
    :goto_25
    if-ge v12, v11, :cond_2f

    .line 1238
    .line 1239
    invoke-interface {v10, v12}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 1240
    .line 1241
    .line 1242
    move-result-object v13

    .line 1243
    move-object v14, v13

    .line 1244
    check-cast v14, Landroidx/compose/ui/input/pointer/PointerInputChange;

    .line 1245
    .line 1246
    invoke-virtual {v14}, Landroidx/compose/ui/input/pointer/PointerInputChange;->getId-J3iCeTQ()J

    .line 1247
    .line 1248
    .line 1249
    move-result-wide v14

    .line 1250
    iget-wide v7, v0, Lkotlin/jvm/internal/Ref$LongRef;->element:J

    .line 1251
    .line 1252
    invoke-static {v14, v15, v7, v8}, Landroidx/compose/ui/input/pointer/PointerId;->equals-impl0(JJ)Z

    .line 1253
    .line 1254
    .line 1255
    move-result v7

    .line 1256
    if-eqz v7, :cond_2e

    .line 1257
    .line 1258
    goto :goto_26

    .line 1259
    :cond_2e
    add-int/lit8 v12, v12, 0x1

    .line 1260
    .line 1261
    const/4 v7, 0x1

    .line 1262
    const/4 v8, 0x0

    .line 1263
    goto :goto_25

    .line 1264
    :cond_2f
    const/4 v13, 0x0

    .line 1265
    :goto_26
    move-object v7, v13

    .line 1266
    check-cast v7, Landroidx/compose/ui/input/pointer/PointerInputChange;

    .line 1267
    .line 1268
    if-nez v7, :cond_30

    .line 1269
    .line 1270
    const/4 v7, 0x0

    .line 1271
    goto :goto_2c

    .line 1272
    :cond_30
    invoke-static {v7}, Landroidx/compose/ui/input/pointer/PointerEventKt;->changedToUpIgnoreConsumed(Landroidx/compose/ui/input/pointer/PointerInputChange;)Z

    .line 1273
    .line 1274
    .line 1275
    move-result v8

    .line 1276
    if-eqz v8, :cond_34

    .line 1277
    .line 1278
    invoke-virtual {v9}, Landroidx/compose/ui/input/pointer/PointerEvent;->getChanges()Ljava/util/List;

    .line 1279
    .line 1280
    .line 1281
    move-result-object v8

    .line 1282
    invoke-interface {v8}, Ljava/util/Collection;->size()I

    .line 1283
    .line 1284
    .line 1285
    move-result v9

    .line 1286
    const/4 v10, 0x0

    .line 1287
    :goto_27
    if-ge v10, v9, :cond_32

    .line 1288
    .line 1289
    invoke-interface {v8, v10}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 1290
    .line 1291
    .line 1292
    move-result-object v11

    .line 1293
    move-object v12, v11

    .line 1294
    check-cast v12, Landroidx/compose/ui/input/pointer/PointerInputChange;

    .line 1295
    .line 1296
    invoke-virtual {v12}, Landroidx/compose/ui/input/pointer/PointerInputChange;->getPressed()Z

    .line 1297
    .line 1298
    .line 1299
    move-result v12

    .line 1300
    if-eqz v12, :cond_31

    .line 1301
    .line 1302
    goto :goto_28

    .line 1303
    :cond_31
    add-int/lit8 v10, v10, 0x1

    .line 1304
    .line 1305
    goto :goto_27

    .line 1306
    :cond_32
    const/4 v11, 0x0

    .line 1307
    :goto_28
    check-cast v11, Landroidx/compose/ui/input/pointer/PointerInputChange;

    .line 1308
    .line 1309
    if-nez v11, :cond_33

    .line 1310
    .line 1311
    goto :goto_2c

    .line 1312
    :cond_33
    invoke-virtual {v11}, Landroidx/compose/ui/input/pointer/PointerInputChange;->getId-J3iCeTQ()J

    .line 1313
    .line 1314
    .line 1315
    move-result-wide v7

    .line 1316
    iput-wide v7, v0, Lkotlin/jvm/internal/Ref$LongRef;->element:J

    .line 1317
    .line 1318
    goto :goto_22

    .line 1319
    :cond_34
    invoke-static {v7}, Landroidx/compose/ui/input/pointer/PointerEventKt;->positionChangeIgnoreConsumed(Landroidx/compose/ui/input/pointer/PointerInputChange;)J

    .line 1320
    .line 1321
    .line 1322
    move-result-wide v8

    .line 1323
    if-nez v2, :cond_35

    .line 1324
    .line 1325
    invoke-static {v8, v9}, Landroidx/compose/ui/geometry/Offset;->getDistance-impl(J)F

    .line 1326
    .line 1327
    .line 1328
    move-result v8

    .line 1329
    goto :goto_2a

    .line 1330
    :cond_35
    sget-object v10, Landroidx/compose/foundation/gestures/Orientation;->Vertical:Landroidx/compose/foundation/gestures/Orientation;

    .line 1331
    .line 1332
    if-ne v2, v10, :cond_36

    .line 1333
    .line 1334
    const-wide v10, 0xffffffffL

    .line 1335
    .line 1336
    .line 1337
    .line 1338
    .line 1339
    and-long/2addr v8, v10

    .line 1340
    :goto_29
    long-to-int v8, v8

    .line 1341
    invoke-static {v8}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 1342
    .line 1343
    .line 1344
    move-result v8

    .line 1345
    goto :goto_2a

    .line 1346
    :cond_36
    const/16 v10, 0x20

    .line 1347
    .line 1348
    shr-long/2addr v8, v10

    .line 1349
    goto :goto_29

    .line 1350
    :goto_2a
    const/4 v9, 0x0

    .line 1351
    cmpg-float v8, v8, v9

    .line 1352
    .line 1353
    if-nez v8, :cond_37

    .line 1354
    .line 1355
    const/4 v8, 0x1

    .line 1356
    goto :goto_2b

    .line 1357
    :cond_37
    const/4 v8, 0x0

    .line 1358
    :goto_2b
    if-nez v8, :cond_2c

    .line 1359
    .line 1360
    :goto_2c
    if-nez v7, :cond_38

    .line 1361
    .line 1362
    goto/16 :goto_20

    .line 1363
    .line 1364
    :cond_38
    invoke-virtual {v7}, Landroidx/compose/ui/input/pointer/PointerInputChange;->isConsumed()Z

    .line 1365
    .line 1366
    .line 1367
    move-result v0

    .line 1368
    if-eqz v0, :cond_39

    .line 1369
    .line 1370
    goto/16 :goto_20

    .line 1371
    .line 1372
    :cond_39
    invoke-static {v7}, Landroidx/compose/ui/input/pointer/PointerEventKt;->changedToUpIgnoreConsumed(Landroidx/compose/ui/input/pointer/PointerInputChange;)Z

    .line 1373
    .line 1374
    .line 1375
    move-result v0

    .line 1376
    if-eqz v0, :cond_3b

    .line 1377
    .line 1378
    move-object v13, v7

    .line 1379
    :goto_2d
    if-nez v13, :cond_3a

    .line 1380
    .line 1381
    iget-object v0, v3, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$detectDragGestures$9;->$onDragCancel:Lr6/a;

    .line 1382
    .line 1383
    invoke-interface {v0}, Lr6/a;->invoke()Ljava/lang/Object;

    .line 1384
    .line 1385
    .line 1386
    goto :goto_2e

    .line 1387
    :cond_3a
    iget-object v0, v3, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$detectDragGestures$9;->$onDragEnd:Lr6/c;

    .line 1388
    .line 1389
    invoke-interface {v0, v13}, Lr6/c;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1390
    .line 1391
    .line 1392
    goto :goto_2e

    .line 1393
    :cond_3b
    invoke-static {v7}, Landroidx/compose/ui/input/pointer/PointerEventKt;->positionChange(Landroidx/compose/ui/input/pointer/PointerInputChange;)J

    .line 1394
    .line 1395
    .line 1396
    move-result-wide v0

    .line 1397
    invoke-static {v0, v1}, Landroidx/compose/ui/geometry/Offset;->box-impl(J)Landroidx/compose/ui/geometry/Offset;

    .line 1398
    .line 1399
    .line 1400
    move-result-object v0

    .line 1401
    invoke-interface {v4, v7, v0}, Lr6/e;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1402
    .line 1403
    .line 1404
    invoke-virtual {v7}, Landroidx/compose/ui/input/pointer/PointerInputChange;->consume()V

    .line 1405
    .line 1406
    .line 1407
    invoke-virtual {v7}, Landroidx/compose/ui/input/pointer/PointerInputChange;->getId-J3iCeTQ()J

    .line 1408
    .line 1409
    .line 1410
    move-result-wide v0

    .line 1411
    move-object/from16 v22, v5

    .line 1412
    .line 1413
    move-object v5, v2

    .line 1414
    move-object/from16 v2, v22

    .line 1415
    .line 1416
    goto/16 :goto_21

    .line 1417
    .line 1418
    :cond_3c
    :goto_2e
    sget-object v0, Ld6/s;->a:Ld6/s;

    .line 1419
    .line 1420
    return-object v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
