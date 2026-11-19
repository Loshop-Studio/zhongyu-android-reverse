.class final Landroidx/compose/foundation/gestures/DragGestureDetectorKt$detectDragGestures$5;
.super Lkotlin/coroutines/jvm/internal/RestrictedSuspendLambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/foundation/gestures/DragGestureDetectorKt;->detectDragGestures(Landroidx/compose/ui/input/pointer/PointerInputScope;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/coroutines/jvm/internal/RestrictedSuspendLambda;",
        "Lkotlin/jvm/functions/Function2<",
        "Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;",
        "Lkotlin/coroutines/Continuation<",
        "-",
        "Lkotlin/Unit;",
        ">;",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"
    }
    d2 = {
        "Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;",
        "",
        "<anonymous>"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation

.annotation runtime Lkotlin/coroutines/jvm/internal/DebugMetadata;
    c = "androidx.compose.foundation.gestures.DragGestureDetectorKt$detectDragGestures$5"
    f = "DragGestureDetector.kt"
    i = {
        0x0,
        0x1,
        0x1,
        0x1,
        0x1,
        0x1,
        0x1,
        0x1,
        0x1,
        0x1,
        0x1,
        0x2,
        0x2,
        0x2,
        0x2,
        0x2,
        0x2,
        0x2,
        0x2,
        0x2,
        0x2,
        0x2
    }
    l = {
        0xb0,
        0x37a,
        0x3ac,
        0xc1
    }
    m = "invokeSuspend"
    n = {
        "$this$awaitEachGesture",
        "$this$awaitEachGesture",
        "down",
        "overSlop",
        "$this$awaitPointerSlopOrCancellation_u2dwtdNQyU_u24default$iv",
        "pointerDirectionConfig$iv",
        "pointer$iv",
        "triggerOnMainAxisSlop$iv",
        "touchSlop$iv",
        "totalMainPositionChange$iv",
        "totalCrossPositionChange$iv",
        "$this$awaitEachGesture",
        "down",
        "overSlop",
        "$this$awaitPointerSlopOrCancellation_u2dwtdNQyU_u24default$iv",
        "pointerDirectionConfig$iv",
        "pointer$iv",
        "dragEvent$iv",
        "triggerOnMainAxisSlop$iv",
        "touchSlop$iv",
        "totalMainPositionChange$iv",
        "totalCrossPositionChange$iv"
    }
    s = {
        "L$0",
        "L$0",
        "L$1",
        "L$2",
        "L$3",
        "L$4",
        "L$5",
        "I$0",
        "F$0",
        "F$1",
        "F$2",
        "L$0",
        "L$1",
        "L$2",
        "L$3",
        "L$4",
        "L$5",
        "L$6",
        "I$0",
        "F$0",
        "F$1",
        "F$2"
    }
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nDragGestureDetector.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DragGestureDetector.kt\nandroidx/compose/foundation/gestures/DragGestureDetectorKt$detectDragGestures$5\n+ 2 DragGestureDetector.kt\nandroidx/compose/foundation/gestures/DragGestureDetectorKt\n+ 3 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,873:1\n658#2,18:874\n676#2,4:901\n680#2,58:912\n116#3,2:892\n33#3,6:894\n118#3:900\n33#3,6:905\n118#3:911\n*S KotlinDebug\n*F\n+ 1 DragGestureDetector.kt\nandroidx/compose/foundation/gestures/DragGestureDetectorKt$detectDragGestures$5\n*L\n180#1:874,18\n180#1:901,4\n180#1:912,58\n180#1:892,2\n180#1:894,6\n180#1:900\n180#1:905,6\n180#1:911\n*E\n"
    }
.end annotation


# instance fields
.field final synthetic $onDrag:Lkotlin/jvm/functions/Function2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function2<",
            "Landroidx/compose/ui/input/pointer/PointerInputChange;",
            "Landroidx/compose/ui/geometry/Offset;",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $onDragCancel:Lkotlin/jvm/functions/Function0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $onDragEnd:Lkotlin/jvm/functions/Function0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $onDragStart:Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function1<",
            "Landroidx/compose/ui/geometry/Offset;",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field

.field F$0:F

.field F$1:F

.field F$2:F

.field I$0:I

.field private synthetic L$0:Ljava/lang/Object;

.field L$1:Ljava/lang/Object;

.field L$2:Ljava/lang/Object;

.field L$3:Ljava/lang/Object;

.field L$4:Ljava/lang/Object;

.field L$5:Ljava/lang/Object;

.field L$6:Ljava/lang/Object;

.field label:I


# direct methods
.method public constructor <init>(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Landroidx/compose/ui/geometry/Offset;",
            "Lkotlin/Unit;",
            ">;",
            "Lkotlin/jvm/functions/Function2<",
            "-",
            "Landroidx/compose/ui/input/pointer/PointerInputChange;",
            "-",
            "Landroidx/compose/ui/geometry/Offset;",
            "Lkotlin/Unit;",
            ">;",
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;",
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Landroidx/compose/foundation/gestures/DragGestureDetectorKt$detectDragGestures$5;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$detectDragGestures$5;->$onDragStart:Lkotlin/jvm/functions/Function1;

    iput-object p2, p0, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$detectDragGestures$5;->$onDrag:Lkotlin/jvm/functions/Function2;

    iput-object p3, p0, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$detectDragGestures$5;->$onDragCancel:Lkotlin/jvm/functions/Function0;

    iput-object p4, p0, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$detectDragGestures$5;->$onDragEnd:Lkotlin/jvm/functions/Function0;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p5}, Lkotlin/coroutines/jvm/internal/RestrictedSuspendLambda;-><init>(ILkotlin/coroutines/Continuation;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            "Lkotlin/coroutines/Continuation<",
            "*>;)",
            "Lkotlin/coroutines/Continuation<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation

    new-instance v6, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$detectDragGestures$5;

    iget-object v1, p0, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$detectDragGestures$5;->$onDragStart:Lkotlin/jvm/functions/Function1;

    iget-object v2, p0, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$detectDragGestures$5;->$onDrag:Lkotlin/jvm/functions/Function2;

    iget-object v3, p0, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$detectDragGestures$5;->$onDragCancel:Lkotlin/jvm/functions/Function0;

    iget-object v4, p0, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$detectDragGestures$5;->$onDragEnd:Lkotlin/jvm/functions/Function0;

    move-object v0, v6

    move-object v5, p2

    invoke-direct/range {v0 .. v5}, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$detectDragGestures$5;-><init>(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)V

    iput-object p1, v6, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$detectDragGestures$5;->L$0:Ljava/lang/Object;

    return-object v6
.end method

.method public final invoke(Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0, p1, p2}, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$detectDragGestures$5;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object p1

    check-cast p1, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$detectDragGestures$5;

    sget-object p2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$detectDragGestures$5;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;

    check-cast p2, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2}, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$detectDragGestures$5;->invoke(Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 22

    .line 1
    move-object/from16 v6, p0

    .line 2
    .line 3
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v7

    .line 7
    iget v0, v6, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$detectDragGestures$5;->label:I

    .line 8
    .line 9
    const/4 v8, 0x4

    .line 10
    const/4 v9, 0x3

    .line 11
    const/4 v10, 0x2

    .line 12
    const/4 v13, 0x1

    .line 13
    const/4 v14, 0x0

    .line 14
    if-eqz v0, :cond_4

    .line 15
    .line 16
    if-eq v0, v13, :cond_3

    .line 17
    .line 18
    if-eq v0, v10, :cond_2

    .line 19
    .line 20
    if-eq v0, v9, :cond_1

    .line 21
    .line 22
    if-ne v0, v8, :cond_0

    .line 23
    .line 24
    invoke-static/range {p1 .. p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 25
    .line 26
    .line 27
    move-object/from16 v0, p1

    .line 28
    .line 29
    move-object v2, v6

    .line 30
    goto/16 :goto_10

    .line 31
    .line 32
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 33
    .line 34
    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    .line 35
    .line 36
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 37
    .line 38
    .line 39
    throw v0

    .line 40
    :cond_1
    iget v0, v6, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$detectDragGestures$5;->F$2:F

    .line 41
    .line 42
    iget v1, v6, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$detectDragGestures$5;->F$1:F

    .line 43
    .line 44
    iget v2, v6, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$detectDragGestures$5;->F$0:F

    .line 45
    .line 46
    iget v3, v6, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$detectDragGestures$5;->I$0:I

    .line 47
    .line 48
    iget-object v4, v6, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$detectDragGestures$5;->L$6:Ljava/lang/Object;

    .line 49
    .line 50
    check-cast v4, Landroidx/compose/ui/input/pointer/PointerInputChange;

    .line 51
    .line 52
    iget-object v5, v6, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$detectDragGestures$5;->L$5:Ljava/lang/Object;

    .line 53
    .line 54
    check-cast v5, Lkotlin/jvm/internal/Ref$LongRef;

    .line 55
    .line 56
    iget-object v15, v6, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$detectDragGestures$5;->L$4:Ljava/lang/Object;

    .line 57
    .line 58
    check-cast v15, Landroidx/compose/foundation/gestures/PointerDirectionConfig;

    .line 59
    .line 60
    iget-object v11, v6, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$detectDragGestures$5;->L$3:Ljava/lang/Object;

    .line 61
    .line 62
    check-cast v11, Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;

    .line 63
    .line 64
    iget-object v12, v6, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$detectDragGestures$5;->L$2:Ljava/lang/Object;

    .line 65
    .line 66
    check-cast v12, Lkotlin/jvm/internal/Ref$LongRef;

    .line 67
    .line 68
    iget-object v8, v6, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$detectDragGestures$5;->L$1:Ljava/lang/Object;

    .line 69
    .line 70
    check-cast v8, Landroidx/compose/ui/input/pointer/PointerInputChange;

    .line 71
    .line 72
    iget-object v9, v6, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$detectDragGestures$5;->L$0:Ljava/lang/Object;

    .line 73
    .line 74
    check-cast v9, Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;

    .line 75
    .line 76
    invoke-static/range {p1 .. p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 77
    .line 78
    .line 79
    const/4 v10, 0x3

    .line 80
    move/from16 v20, v1

    .line 81
    .line 82
    move v1, v0

    .line 83
    move-object v0, v8

    .line 84
    move-object v8, v11

    .line 85
    move-object v11, v15

    .line 86
    move v15, v3

    .line 87
    move/from16 v3, v20

    .line 88
    .line 89
    move-object/from16 v21, v5

    .line 90
    .line 91
    move v5, v2

    .line 92
    move-object v2, v12

    .line 93
    move-object/from16 v12, v21

    .line 94
    .line 95
    goto/16 :goto_b

    .line 96
    .line 97
    :cond_2
    iget v0, v6, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$detectDragGestures$5;->F$2:F

    .line 98
    .line 99
    iget v1, v6, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$detectDragGestures$5;->F$1:F

    .line 100
    .line 101
    iget v2, v6, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$detectDragGestures$5;->F$0:F

    .line 102
    .line 103
    iget v3, v6, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$detectDragGestures$5;->I$0:I

    .line 104
    .line 105
    iget-object v4, v6, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$detectDragGestures$5;->L$5:Ljava/lang/Object;

    .line 106
    .line 107
    check-cast v4, Lkotlin/jvm/internal/Ref$LongRef;

    .line 108
    .line 109
    iget-object v5, v6, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$detectDragGestures$5;->L$4:Ljava/lang/Object;

    .line 110
    .line 111
    check-cast v5, Landroidx/compose/foundation/gestures/PointerDirectionConfig;

    .line 112
    .line 113
    iget-object v8, v6, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$detectDragGestures$5;->L$3:Ljava/lang/Object;

    .line 114
    .line 115
    check-cast v8, Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;

    .line 116
    .line 117
    iget-object v9, v6, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$detectDragGestures$5;->L$2:Ljava/lang/Object;

    .line 118
    .line 119
    check-cast v9, Lkotlin/jvm/internal/Ref$LongRef;

    .line 120
    .line 121
    iget-object v11, v6, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$detectDragGestures$5;->L$1:Ljava/lang/Object;

    .line 122
    .line 123
    check-cast v11, Landroidx/compose/ui/input/pointer/PointerInputChange;

    .line 124
    .line 125
    iget-object v12, v6, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$detectDragGestures$5;->L$0:Ljava/lang/Object;

    .line 126
    .line 127
    check-cast v12, Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;

    .line 128
    .line 129
    invoke-static/range {p1 .. p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 130
    .line 131
    .line 132
    move-object/from16 v10, p1

    .line 133
    .line 134
    move v15, v3

    .line 135
    move v3, v1

    .line 136
    move v1, v0

    .line 137
    move-object v0, v11

    .line 138
    move-object v11, v5

    .line 139
    move v5, v2

    .line 140
    move-object v2, v9

    .line 141
    move-object v9, v12

    .line 142
    move-object v12, v4

    .line 143
    move-object v4, v6

    .line 144
    goto/16 :goto_3

    .line 145
    .line 146
    :cond_3
    iget-object v0, v6, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$detectDragGestures$5;->L$0:Ljava/lang/Object;

    .line 147
    .line 148
    check-cast v0, Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;

    .line 149
    .line 150
    invoke-static/range {p1 .. p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 151
    .line 152
    .line 153
    move-object v8, v0

    .line 154
    move-object/from16 v0, p1

    .line 155
    .line 156
    goto :goto_0

    .line 157
    :cond_4
    invoke-static/range {p1 .. p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 158
    .line 159
    .line 160
    iget-object v0, v6, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$detectDragGestures$5;->L$0:Ljava/lang/Object;

    .line 161
    .line 162
    move-object v8, v0

    .line 163
    check-cast v8, Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;

    .line 164
    .line 165
    const/4 v1, 0x0

    .line 166
    const/4 v2, 0x0

    .line 167
    const/4 v4, 0x2

    .line 168
    const/4 v5, 0x0

    .line 169
    iput-object v8, v6, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$detectDragGestures$5;->L$0:Ljava/lang/Object;

    .line 170
    .line 171
    iput v13, v6, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$detectDragGestures$5;->label:I

    .line 172
    .line 173
    move-object v0, v8

    .line 174
    move-object/from16 v3, p0

    .line 175
    .line 176
    invoke-static/range {v0 .. v5}, Landroidx/compose/foundation/gestures/TapGestureDetectorKt;->awaitFirstDown$default(Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;ZLandroidx/compose/ui/input/pointer/PointerEventPass;Lkotlin/coroutines/Continuation;ILjava/lang/Object;)Ljava/lang/Object;

    .line 177
    .line 178
    .line 179
    move-result-object v0

    .line 180
    if-ne v0, v7, :cond_5

    .line 181
    .line 182
    return-object v7

    .line 183
    :cond_5
    :goto_0
    check-cast v0, Landroidx/compose/ui/input/pointer/PointerInputChange;

    .line 184
    .line 185
    new-instance v1, Lkotlin/jvm/internal/Ref$LongRef;

    .line 186
    .line 187
    invoke-direct {v1}, Lkotlin/jvm/internal/Ref$LongRef;-><init>()V

    .line 188
    .line 189
    .line 190
    sget-object v2, Landroidx/compose/ui/geometry/Offset;->Companion:Landroidx/compose/ui/geometry/Offset$Companion;

    .line 191
    .line 192
    invoke-virtual {v2}, Landroidx/compose/ui/geometry/Offset$Companion;->getZero-F1C5BW0()J

    .line 193
    .line 194
    .line 195
    move-result-wide v2

    .line 196
    iput-wide v2, v1, Lkotlin/jvm/internal/Ref$LongRef;->element:J

    .line 197
    .line 198
    move-object v2, v6

    .line 199
    :goto_1
    invoke-virtual {v0}, Landroidx/compose/ui/input/pointer/PointerInputChange;->getId-J3iCeTQ()J

    .line 200
    .line 201
    .line 202
    move-result-wide v3

    .line 203
    invoke-virtual {v0}, Landroidx/compose/ui/input/pointer/PointerInputChange;->getType-T8wyACA()I

    .line 204
    .line 205
    .line 206
    move-result v5

    .line 207
    invoke-static {}, Landroidx/compose/foundation/gestures/DragGestureDetectorKt;->getHorizontalPointerDirectionConfig()Landroidx/compose/foundation/gestures/PointerDirectionConfig;

    .line 208
    .line 209
    .line 210
    move-result-object v9

    .line 211
    invoke-interface {v8}, Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;->getCurrentEvent()Landroidx/compose/ui/input/pointer/PointerEvent;

    .line 212
    .line 213
    .line 214
    move-result-object v11

    .line 215
    invoke-static {v11, v3, v4}, Landroidx/compose/foundation/gestures/DragGestureDetectorKt;->access$isPointerUp-DmW0f2w(Landroidx/compose/ui/input/pointer/PointerEvent;J)Z

    .line 216
    .line 217
    .line 218
    move-result v11

    .line 219
    if-eqz v11, :cond_6

    .line 220
    .line 221
    move-object v6, v14

    .line 222
    goto/16 :goto_e

    .line 223
    .line 224
    :cond_6
    invoke-interface {v8}, Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;->getViewConfiguration()Landroidx/compose/ui/platform/ViewConfiguration;

    .line 225
    .line 226
    .line 227
    move-result-object v11

    .line 228
    invoke-static {v11, v5}, Landroidx/compose/foundation/gestures/DragGestureDetectorKt;->pointerSlop-E8SPZFQ(Landroidx/compose/ui/platform/ViewConfiguration;I)F

    .line 229
    .line 230
    .line 231
    move-result v5

    .line 232
    new-instance v11, Lkotlin/jvm/internal/Ref$LongRef;

    .line 233
    .line 234
    invoke-direct {v11}, Lkotlin/jvm/internal/Ref$LongRef;-><init>()V

    .line 235
    .line 236
    .line 237
    iput-wide v3, v11, Lkotlin/jvm/internal/Ref$LongRef;->element:J

    .line 238
    .line 239
    move-object v4, v2

    .line 240
    move-object v12, v11

    .line 241
    const/4 v3, 0x0

    .line 242
    const/4 v15, 0x0

    .line 243
    move-object v2, v1

    .line 244
    move-object v11, v9

    .line 245
    const/4 v1, 0x0

    .line 246
    move-object v9, v8

    .line 247
    :goto_2
    iput-object v9, v4, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$detectDragGestures$5;->L$0:Ljava/lang/Object;

    .line 248
    .line 249
    iput-object v0, v4, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$detectDragGestures$5;->L$1:Ljava/lang/Object;

    .line 250
    .line 251
    iput-object v2, v4, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$detectDragGestures$5;->L$2:Ljava/lang/Object;

    .line 252
    .line 253
    iput-object v8, v4, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$detectDragGestures$5;->L$3:Ljava/lang/Object;

    .line 254
    .line 255
    iput-object v11, v4, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$detectDragGestures$5;->L$4:Ljava/lang/Object;

    .line 256
    .line 257
    iput-object v12, v4, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$detectDragGestures$5;->L$5:Ljava/lang/Object;

    .line 258
    .line 259
    iput-object v14, v4, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$detectDragGestures$5;->L$6:Ljava/lang/Object;

    .line 260
    .line 261
    iput v15, v4, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$detectDragGestures$5;->I$0:I

    .line 262
    .line 263
    iput v5, v4, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$detectDragGestures$5;->F$0:F

    .line 264
    .line 265
    iput v3, v4, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$detectDragGestures$5;->F$1:F

    .line 266
    .line 267
    iput v1, v4, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$detectDragGestures$5;->F$2:F

    .line 268
    .line 269
    iput v10, v4, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$detectDragGestures$5;->label:I

    .line 270
    .line 271
    invoke-static {v8, v14, v4, v13, v14}, Landroidx/compose/ui/input/pointer/b;->t(Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;Landroidx/compose/ui/input/pointer/PointerEventPass;Lkotlin/coroutines/Continuation;ILjava/lang/Object;)Ljava/lang/Object;

    .line 272
    .line 273
    .line 274
    move-result-object v10

    .line 275
    if-ne v10, v7, :cond_7

    .line 276
    .line 277
    return-object v7

    .line 278
    :cond_7
    :goto_3
    check-cast v10, Landroidx/compose/ui/input/pointer/PointerEvent;

    .line 279
    .line 280
    invoke-virtual {v10}, Landroidx/compose/ui/input/pointer/PointerEvent;->getChanges()Ljava/util/List;

    .line 281
    .line 282
    .line 283
    move-result-object v13

    .line 284
    invoke-interface {v13}, Ljava/util/List;->size()I

    .line 285
    .line 286
    .line 287
    move-result v14

    .line 288
    const/4 v6, 0x0

    .line 289
    :goto_4
    if-ge v6, v14, :cond_9

    .line 290
    .line 291
    invoke-interface {v13, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 292
    .line 293
    .line 294
    move-result-object v16

    .line 295
    move-object/from16 v17, v16

    .line 296
    .line 297
    check-cast v17, Landroidx/compose/ui/input/pointer/PointerInputChange;

    .line 298
    .line 299
    move-object/from16 p1, v13

    .line 300
    .line 301
    move/from16 v18, v14

    .line 302
    .line 303
    invoke-virtual/range {v17 .. v17}, Landroidx/compose/ui/input/pointer/PointerInputChange;->getId-J3iCeTQ()J

    .line 304
    .line 305
    .line 306
    move-result-wide v13

    .line 307
    move-object/from16 v17, v7

    .line 308
    .line 309
    move-object/from16 v19, v8

    .line 310
    .line 311
    iget-wide v7, v12, Lkotlin/jvm/internal/Ref$LongRef;->element:J

    .line 312
    .line 313
    invoke-static {v13, v14, v7, v8}, Landroidx/compose/ui/input/pointer/PointerId;->equals-impl0(JJ)Z

    .line 314
    .line 315
    .line 316
    move-result v7

    .line 317
    if-eqz v7, :cond_8

    .line 318
    .line 319
    goto :goto_5

    .line 320
    :cond_8
    add-int/lit8 v6, v6, 0x1

    .line 321
    .line 322
    move-object/from16 v13, p1

    .line 323
    .line 324
    move-object/from16 v7, v17

    .line 325
    .line 326
    move/from16 v14, v18

    .line 327
    .line 328
    move-object/from16 v8, v19

    .line 329
    .line 330
    goto :goto_4

    .line 331
    :cond_9
    move-object/from16 v17, v7

    .line 332
    .line 333
    move-object/from16 v19, v8

    .line 334
    .line 335
    const/16 v16, 0x0

    .line 336
    .line 337
    :goto_5
    move-object/from16 v6, v16

    .line 338
    .line 339
    check-cast v6, Landroidx/compose/ui/input/pointer/PointerInputChange;

    .line 340
    .line 341
    if-nez v6, :cond_a

    .line 342
    .line 343
    :goto_6
    move-object v1, v2

    .line 344
    move-object v2, v4

    .line 345
    move-object v8, v9

    .line 346
    move-object/from16 v7, v17

    .line 347
    .line 348
    goto/16 :goto_c

    .line 349
    .line 350
    :cond_a
    invoke-virtual {v6}, Landroidx/compose/ui/input/pointer/PointerInputChange;->isConsumed()Z

    .line 351
    .line 352
    .line 353
    move-result v7

    .line 354
    if-eqz v7, :cond_b

    .line 355
    .line 356
    goto :goto_6

    .line 357
    :cond_b
    invoke-static {v6}, Landroidx/compose/ui/input/pointer/PointerEventKt;->changedToUpIgnoreConsumed(Landroidx/compose/ui/input/pointer/PointerInputChange;)Z

    .line 358
    .line 359
    .line 360
    move-result v7

    .line 361
    if-eqz v7, :cond_f

    .line 362
    .line 363
    invoke-virtual {v10}, Landroidx/compose/ui/input/pointer/PointerEvent;->getChanges()Ljava/util/List;

    .line 364
    .line 365
    .line 366
    move-result-object v6

    .line 367
    invoke-interface {v6}, Ljava/util/List;->size()I

    .line 368
    .line 369
    .line 370
    move-result v7

    .line 371
    const/4 v8, 0x0

    .line 372
    :goto_7
    if-ge v8, v7, :cond_d

    .line 373
    .line 374
    invoke-interface {v6, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 375
    .line 376
    .line 377
    move-result-object v10

    .line 378
    move-object v13, v10

    .line 379
    check-cast v13, Landroidx/compose/ui/input/pointer/PointerInputChange;

    .line 380
    .line 381
    invoke-virtual {v13}, Landroidx/compose/ui/input/pointer/PointerInputChange;->getPressed()Z

    .line 382
    .line 383
    .line 384
    move-result v13

    .line 385
    if-eqz v13, :cond_c

    .line 386
    .line 387
    goto :goto_8

    .line 388
    :cond_c
    add-int/lit8 v8, v8, 0x1

    .line 389
    .line 390
    goto :goto_7

    .line 391
    :cond_d
    const/4 v10, 0x0

    .line 392
    :goto_8
    check-cast v10, Landroidx/compose/ui/input/pointer/PointerInputChange;

    .line 393
    .line 394
    if-nez v10, :cond_e

    .line 395
    .line 396
    goto :goto_6

    .line 397
    :cond_e
    invoke-virtual {v10}, Landroidx/compose/ui/input/pointer/PointerInputChange;->getId-J3iCeTQ()J

    .line 398
    .line 399
    .line 400
    move-result-wide v6

    .line 401
    iput-wide v6, v12, Lkotlin/jvm/internal/Ref$LongRef;->element:J

    .line 402
    .line 403
    move-object/from16 v6, p0

    .line 404
    .line 405
    move-object/from16 v7, v17

    .line 406
    .line 407
    move-object/from16 v8, v19

    .line 408
    .line 409
    :goto_9
    const/4 v10, 0x2

    .line 410
    const/4 v13, 0x1

    .line 411
    const/4 v14, 0x0

    .line 412
    goto/16 :goto_2

    .line 413
    .line 414
    :cond_f
    invoke-virtual {v6}, Landroidx/compose/ui/input/pointer/PointerInputChange;->getPosition-F1C5BW0()J

    .line 415
    .line 416
    .line 417
    move-result-wide v7

    .line 418
    invoke-virtual {v6}, Landroidx/compose/ui/input/pointer/PointerInputChange;->getPreviousPosition-F1C5BW0()J

    .line 419
    .line 420
    .line 421
    move-result-wide v13

    .line 422
    invoke-interface {v11, v7, v8}, Landroidx/compose/foundation/gestures/PointerDirectionConfig;->mainAxisDelta-k-4lQ0M(J)F

    .line 423
    .line 424
    .line 425
    move-result v10

    .line 426
    invoke-interface {v11, v13, v14}, Landroidx/compose/foundation/gestures/PointerDirectionConfig;->mainAxisDelta-k-4lQ0M(J)F

    .line 427
    .line 428
    .line 429
    move-result v16

    .line 430
    sub-float v10, v10, v16

    .line 431
    .line 432
    invoke-interface {v11, v7, v8}, Landroidx/compose/foundation/gestures/PointerDirectionConfig;->crossAxisDelta-k-4lQ0M(J)F

    .line 433
    .line 434
    .line 435
    move-result v7

    .line 436
    invoke-interface {v11, v13, v14}, Landroidx/compose/foundation/gestures/PointerDirectionConfig;->crossAxisDelta-k-4lQ0M(J)F

    .line 437
    .line 438
    .line 439
    move-result v8

    .line 440
    sub-float/2addr v7, v8

    .line 441
    add-float/2addr v3, v10

    .line 442
    add-float/2addr v1, v7

    .line 443
    if-eqz v15, :cond_10

    .line 444
    .line 445
    invoke-static {v3}, Ljava/lang/Math;->abs(F)F

    .line 446
    .line 447
    .line 448
    move-result v7

    .line 449
    goto :goto_a

    .line 450
    :cond_10
    invoke-interface {v11, v3, v1}, Landroidx/compose/foundation/gestures/PointerDirectionConfig;->offsetFromChanges-dBAh8RU(FF)J

    .line 451
    .line 452
    .line 453
    move-result-wide v7

    .line 454
    invoke-static {v7, v8}, Landroidx/compose/ui/geometry/Offset;->getDistance-impl(J)F

    .line 455
    .line 456
    .line 457
    move-result v7

    .line 458
    :goto_a
    cmpg-float v8, v7, v5

    .line 459
    .line 460
    if-gez v8, :cond_13

    .line 461
    .line 462
    sget-object v7, Landroidx/compose/ui/input/pointer/PointerEventPass;->Final:Landroidx/compose/ui/input/pointer/PointerEventPass;

    .line 463
    .line 464
    iput-object v9, v4, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$detectDragGestures$5;->L$0:Ljava/lang/Object;

    .line 465
    .line 466
    iput-object v0, v4, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$detectDragGestures$5;->L$1:Ljava/lang/Object;

    .line 467
    .line 468
    iput-object v2, v4, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$detectDragGestures$5;->L$2:Ljava/lang/Object;

    .line 469
    .line 470
    move-object/from16 v8, v19

    .line 471
    .line 472
    iput-object v8, v4, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$detectDragGestures$5;->L$3:Ljava/lang/Object;

    .line 473
    .line 474
    iput-object v11, v4, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$detectDragGestures$5;->L$4:Ljava/lang/Object;

    .line 475
    .line 476
    iput-object v12, v4, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$detectDragGestures$5;->L$5:Ljava/lang/Object;

    .line 477
    .line 478
    iput-object v6, v4, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$detectDragGestures$5;->L$6:Ljava/lang/Object;

    .line 479
    .line 480
    iput v15, v4, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$detectDragGestures$5;->I$0:I

    .line 481
    .line 482
    iput v5, v4, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$detectDragGestures$5;->F$0:F

    .line 483
    .line 484
    iput v3, v4, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$detectDragGestures$5;->F$1:F

    .line 485
    .line 486
    iput v1, v4, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$detectDragGestures$5;->F$2:F

    .line 487
    .line 488
    const/4 v10, 0x3

    .line 489
    iput v10, v4, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$detectDragGestures$5;->label:I

    .line 490
    .line 491
    invoke-interface {v8, v7, v4}, Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;->awaitPointerEvent(Landroidx/compose/ui/input/pointer/PointerEventPass;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 492
    .line 493
    .line 494
    move-result-object v7

    .line 495
    move-object/from16 v13, v17

    .line 496
    .line 497
    if-ne v7, v13, :cond_11

    .line 498
    .line 499
    return-object v13

    .line 500
    :cond_11
    move-object v7, v13

    .line 501
    move-object/from16 v20, v6

    .line 502
    .line 503
    move-object v6, v4

    .line 504
    move-object/from16 v4, v20

    .line 505
    .line 506
    :goto_b
    invoke-virtual {v4}, Landroidx/compose/ui/input/pointer/PointerInputChange;->isConsumed()Z

    .line 507
    .line 508
    .line 509
    move-result v4

    .line 510
    if-eqz v4, :cond_12

    .line 511
    .line 512
    move-object v1, v2

    .line 513
    move-object v2, v6

    .line 514
    move-object v8, v9

    .line 515
    :goto_c
    const/4 v6, 0x0

    .line 516
    goto :goto_e

    .line 517
    :cond_12
    move-object v4, v6

    .line 518
    const/4 v10, 0x2

    .line 519
    const/4 v13, 0x1

    .line 520
    const/4 v14, 0x0

    .line 521
    move-object/from16 v6, p0

    .line 522
    .line 523
    goto/16 :goto_2

    .line 524
    .line 525
    :cond_13
    move-object/from16 v13, v17

    .line 526
    .line 527
    move-object/from16 v8, v19

    .line 528
    .line 529
    const/4 v10, 0x3

    .line 530
    if-eqz v15, :cond_14

    .line 531
    .line 532
    invoke-static {v3}, Ljava/lang/Math;->signum(F)F

    .line 533
    .line 534
    .line 535
    move-result v7

    .line 536
    mul-float/2addr v7, v5

    .line 537
    sub-float/2addr v3, v7

    .line 538
    invoke-interface {v11, v3, v1}, Landroidx/compose/foundation/gestures/PointerDirectionConfig;->offsetFromChanges-dBAh8RU(FF)J

    .line 539
    .line 540
    .line 541
    move-result-wide v16

    .line 542
    move-object v14, v0

    .line 543
    move-object v3, v11

    .line 544
    goto :goto_d

    .line 545
    :cond_14
    move-object v14, v0

    .line 546
    invoke-interface {v11, v3, v1}, Landroidx/compose/foundation/gestures/PointerDirectionConfig;->offsetFromChanges-dBAh8RU(FF)J

    .line 547
    .line 548
    .line 549
    move-result-wide v0

    .line 550
    move-object v3, v11

    .line 551
    invoke-static {v0, v1, v7}, Landroidx/compose/ui/geometry/Offset;->div-tuRUvjQ(JF)J

    .line 552
    .line 553
    .line 554
    move-result-wide v10

    .line 555
    invoke-static {v10, v11, v5}, Landroidx/compose/ui/geometry/Offset;->times-tuRUvjQ(JF)J

    .line 556
    .line 557
    .line 558
    move-result-wide v10

    .line 559
    invoke-static {v0, v1, v10, v11}, Landroidx/compose/ui/geometry/Offset;->minus-MK-Hz9U(JJ)J

    .line 560
    .line 561
    .line 562
    move-result-wide v16

    .line 563
    :goto_d
    move-wide/from16 v0, v16

    .line 564
    .line 565
    invoke-virtual {v6}, Landroidx/compose/ui/input/pointer/PointerInputChange;->consume()V

    .line 566
    .line 567
    .line 568
    iput-wide v0, v2, Lkotlin/jvm/internal/Ref$LongRef;->element:J

    .line 569
    .line 570
    invoke-virtual {v6}, Landroidx/compose/ui/input/pointer/PointerInputChange;->isConsumed()Z

    .line 571
    .line 572
    .line 573
    move-result v0

    .line 574
    if-eqz v0, :cond_1a

    .line 575
    .line 576
    move-object v1, v2

    .line 577
    move-object v2, v4

    .line 578
    move-object v8, v9

    .line 579
    move-object v7, v13

    .line 580
    move-object v0, v14

    .line 581
    :goto_e
    if-eqz v6, :cond_16

    .line 582
    .line 583
    invoke-virtual {v6}, Landroidx/compose/ui/input/pointer/PointerInputChange;->isConsumed()Z

    .line 584
    .line 585
    .line 586
    move-result v3

    .line 587
    if-eqz v3, :cond_15

    .line 588
    .line 589
    goto :goto_f

    .line 590
    :cond_15
    move-object/from16 v6, p0

    .line 591
    .line 592
    const/4 v10, 0x2

    .line 593
    const/4 v13, 0x1

    .line 594
    const/4 v14, 0x0

    .line 595
    goto/16 :goto_1

    .line 596
    .line 597
    :cond_16
    :goto_f
    if-eqz v6, :cond_19

    .line 598
    .line 599
    iget-object v0, v2, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$detectDragGestures$5;->$onDragStart:Lkotlin/jvm/functions/Function1;

    .line 600
    .line 601
    invoke-virtual {v6}, Landroidx/compose/ui/input/pointer/PointerInputChange;->getPosition-F1C5BW0()J

    .line 602
    .line 603
    .line 604
    move-result-wide v3

    .line 605
    invoke-static {v3, v4}, Landroidx/compose/ui/geometry/Offset;->box-impl(J)Landroidx/compose/ui/geometry/Offset;

    .line 606
    .line 607
    .line 608
    move-result-object v3

    .line 609
    invoke-interface {v0, v3}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 610
    .line 611
    .line 612
    iget-object v0, v2, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$detectDragGestures$5;->$onDrag:Lkotlin/jvm/functions/Function2;

    .line 613
    .line 614
    iget-wide v3, v1, Lkotlin/jvm/internal/Ref$LongRef;->element:J

    .line 615
    .line 616
    invoke-static {v3, v4}, Landroidx/compose/ui/geometry/Offset;->box-impl(J)Landroidx/compose/ui/geometry/Offset;

    .line 617
    .line 618
    .line 619
    move-result-object v1

    .line 620
    invoke-interface {v0, v6, v1}, Lkotlin/jvm/functions/Function2;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 621
    .line 622
    .line 623
    invoke-virtual {v6}, Landroidx/compose/ui/input/pointer/PointerInputChange;->getId-J3iCeTQ()J

    .line 624
    .line 625
    .line 626
    move-result-wide v0

    .line 627
    new-instance v3, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$detectDragGestures$5$2;

    .line 628
    .line 629
    iget-object v4, v2, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$detectDragGestures$5;->$onDrag:Lkotlin/jvm/functions/Function2;

    .line 630
    .line 631
    invoke-direct {v3, v4}, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$detectDragGestures$5$2;-><init>(Lkotlin/jvm/functions/Function2;)V

    .line 632
    .line 633
    .line 634
    const/4 v6, 0x0

    .line 635
    iput-object v6, v2, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$detectDragGestures$5;->L$0:Ljava/lang/Object;

    .line 636
    .line 637
    iput-object v6, v2, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$detectDragGestures$5;->L$1:Ljava/lang/Object;

    .line 638
    .line 639
    iput-object v6, v2, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$detectDragGestures$5;->L$2:Ljava/lang/Object;

    .line 640
    .line 641
    iput-object v6, v2, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$detectDragGestures$5;->L$3:Ljava/lang/Object;

    .line 642
    .line 643
    iput-object v6, v2, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$detectDragGestures$5;->L$4:Ljava/lang/Object;

    .line 644
    .line 645
    iput-object v6, v2, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$detectDragGestures$5;->L$5:Ljava/lang/Object;

    .line 646
    .line 647
    iput-object v6, v2, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$detectDragGestures$5;->L$6:Ljava/lang/Object;

    .line 648
    .line 649
    const/4 v10, 0x4

    .line 650
    iput v10, v2, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$detectDragGestures$5;->label:I

    .line 651
    .line 652
    invoke-static {v8, v0, v1, v3, v2}, Landroidx/compose/foundation/gestures/DragGestureDetectorKt;->drag-jO51t88(Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;JLkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 653
    .line 654
    .line 655
    move-result-object v0

    .line 656
    if-ne v0, v7, :cond_17

    .line 657
    .line 658
    return-object v7

    .line 659
    :cond_17
    :goto_10
    check-cast v0, Ljava/lang/Boolean;

    .line 660
    .line 661
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 662
    .line 663
    .line 664
    move-result v0

    .line 665
    if-nez v0, :cond_18

    .line 666
    .line 667
    iget-object v0, v2, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$detectDragGestures$5;->$onDragCancel:Lkotlin/jvm/functions/Function0;

    .line 668
    .line 669
    invoke-interface {v0}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    .line 670
    .line 671
    .line 672
    goto :goto_11

    .line 673
    :cond_18
    iget-object v0, v2, Landroidx/compose/foundation/gestures/DragGestureDetectorKt$detectDragGestures$5;->$onDragEnd:Lkotlin/jvm/functions/Function0;

    .line 674
    .line 675
    invoke-interface {v0}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    .line 676
    .line 677
    .line 678
    :cond_19
    :goto_11
    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 679
    .line 680
    return-object v0

    .line 681
    :cond_1a
    move-object/from16 v6, p0

    .line 682
    .line 683
    move-object v11, v3

    .line 684
    move-object v7, v13

    .line 685
    move-object v0, v14

    .line 686
    const/4 v1, 0x0

    .line 687
    const/4 v3, 0x0

    .line 688
    goto/16 :goto_9
.end method
