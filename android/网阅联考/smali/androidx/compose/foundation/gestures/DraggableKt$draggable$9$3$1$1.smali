.class final Landroidx/compose/foundation/gestures/DraggableKt$draggable$9$3$1$1;
.super Lkotlin/coroutines/jvm/internal/RestrictedSuspendLambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/foundation/gestures/DraggableKt$draggable$9$3$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
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
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation

.annotation runtime Lkotlin/coroutines/jvm/internal/DebugMetadata;
    c = "androidx.compose.foundation.gestures.DraggableKt$draggable$9$3$1$1"
    f = "Draggable.kt"
    i = {
        0x0,
        0x0,
        0x1,
        0x1,
        0x1
    }
    l = {
        0x10c,
        0x114
    }
    m = "invokeSuspend"
    n = {
        "$this$awaitPointerEventScope",
        "velocityTracker",
        "$this$awaitPointerEventScope",
        "velocityTracker",
        "isDragSuccessful"
    }
    s = {
        "L$0",
        "L$1",
        "L$0",
        "L$1",
        "I$0"
    }
.end annotation


# instance fields
.field final synthetic $$this$coroutineScope:Lkotlinx/coroutines/CoroutineScope;

.field final synthetic $canDragState:Landroidx/compose/runtime/State;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/compose/runtime/State<",
            "Lkotlin/jvm/functions/Function1<",
            "Landroidx/compose/ui/input/pointer/PointerInputChange;",
            "Ljava/lang/Boolean;",
            ">;>;"
        }
    .end annotation
.end field

.field final synthetic $channel:Lkotlinx/coroutines/channels/Channel;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlinx/coroutines/channels/Channel<",
            "Landroidx/compose/foundation/gestures/DragEvent;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $orientation:Landroidx/compose/foundation/gestures/Orientation;

.field final synthetic $reverseDirection:Z

.field final synthetic $startImmediatelyState:Landroidx/compose/runtime/State;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/compose/runtime/State<",
            "Lkotlin/jvm/functions/Function0<",
            "Ljava/lang/Boolean;",
            ">;>;"
        }
    .end annotation
.end field

.field I$0:I

.field private synthetic L$0:Ljava/lang/Object;

.field L$1:Ljava/lang/Object;

.field L$2:Ljava/lang/Object;

.field L$3:Ljava/lang/Object;

.field Z$0:Z

.field label:I


# direct methods
.method public constructor <init>(Lkotlinx/coroutines/CoroutineScope;Landroidx/compose/runtime/State;Landroidx/compose/runtime/State;Landroidx/compose/foundation/gestures/Orientation;Lkotlinx/coroutines/channels/Channel;ZLkotlin/coroutines/Continuation;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlinx/coroutines/CoroutineScope;",
            "Landroidx/compose/runtime/State<",
            "+",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Landroidx/compose/ui/input/pointer/PointerInputChange;",
            "Ljava/lang/Boolean;",
            ">;>;",
            "Landroidx/compose/runtime/State<",
            "+",
            "Lkotlin/jvm/functions/Function0<",
            "Ljava/lang/Boolean;",
            ">;>;",
            "Landroidx/compose/foundation/gestures/Orientation;",
            "Lkotlinx/coroutines/channels/Channel<",
            "Landroidx/compose/foundation/gestures/DragEvent;",
            ">;Z",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Landroidx/compose/foundation/gestures/DraggableKt$draggable$9$3$1$1;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Landroidx/compose/foundation/gestures/DraggableKt$draggable$9$3$1$1;->$$this$coroutineScope:Lkotlinx/coroutines/CoroutineScope;

    iput-object p2, p0, Landroidx/compose/foundation/gestures/DraggableKt$draggable$9$3$1$1;->$canDragState:Landroidx/compose/runtime/State;

    iput-object p3, p0, Landroidx/compose/foundation/gestures/DraggableKt$draggable$9$3$1$1;->$startImmediatelyState:Landroidx/compose/runtime/State;

    iput-object p4, p0, Landroidx/compose/foundation/gestures/DraggableKt$draggable$9$3$1$1;->$orientation:Landroidx/compose/foundation/gestures/Orientation;

    iput-object p5, p0, Landroidx/compose/foundation/gestures/DraggableKt$draggable$9$3$1$1;->$channel:Lkotlinx/coroutines/channels/Channel;

    iput-boolean p6, p0, Landroidx/compose/foundation/gestures/DraggableKt$draggable$9$3$1$1;->$reverseDirection:Z

    const/4 p1, 0x2

    invoke-direct {p0, p1, p7}, Lkotlin/coroutines/jvm/internal/RestrictedSuspendLambda;-><init>(ILkotlin/coroutines/Continuation;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;
    .locals 9
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

    new-instance v8, Landroidx/compose/foundation/gestures/DraggableKt$draggable$9$3$1$1;

    iget-object v1, p0, Landroidx/compose/foundation/gestures/DraggableKt$draggable$9$3$1$1;->$$this$coroutineScope:Lkotlinx/coroutines/CoroutineScope;

    iget-object v2, p0, Landroidx/compose/foundation/gestures/DraggableKt$draggable$9$3$1$1;->$canDragState:Landroidx/compose/runtime/State;

    iget-object v3, p0, Landroidx/compose/foundation/gestures/DraggableKt$draggable$9$3$1$1;->$startImmediatelyState:Landroidx/compose/runtime/State;

    iget-object v4, p0, Landroidx/compose/foundation/gestures/DraggableKt$draggable$9$3$1$1;->$orientation:Landroidx/compose/foundation/gestures/Orientation;

    iget-object v5, p0, Landroidx/compose/foundation/gestures/DraggableKt$draggable$9$3$1$1;->$channel:Lkotlinx/coroutines/channels/Channel;

    iget-boolean v6, p0, Landroidx/compose/foundation/gestures/DraggableKt$draggable$9$3$1$1;->$reverseDirection:Z

    move-object v0, v8

    move-object v7, p2

    invoke-direct/range {v0 .. v7}, Landroidx/compose/foundation/gestures/DraggableKt$draggable$9$3$1$1;-><init>(Lkotlinx/coroutines/CoroutineScope;Landroidx/compose/runtime/State;Landroidx/compose/runtime/State;Landroidx/compose/foundation/gestures/Orientation;Lkotlinx/coroutines/channels/Channel;ZLkotlin/coroutines/Continuation;)V

    iput-object p1, v8, Landroidx/compose/foundation/gestures/DraggableKt$draggable$9$3$1$1;->L$0:Ljava/lang/Object;

    return-object v8
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
    invoke-virtual {p0, p1, p2}, Landroidx/compose/foundation/gestures/DraggableKt$draggable$9$3$1$1;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object p1

    check-cast p1, Landroidx/compose/foundation/gestures/DraggableKt$draggable$9$3$1$1;

    sget-object p2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Landroidx/compose/foundation/gestures/DraggableKt$draggable$9$3$1$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;

    check-cast p2, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2}, Landroidx/compose/foundation/gestures/DraggableKt$draggable$9$3$1$1;->invoke(Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 24

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v2

    .line 7
    iget v0, v1, Landroidx/compose/foundation/gestures/DraggableKt$draggable$9$3$1$1;->label:I

    .line 8
    .line 9
    const/4 v5, 0x2

    .line 10
    const/4 v6, 0x0

    .line 11
    const/4 v7, 0x1

    .line 12
    const/4 v8, 0x0

    .line 13
    if-eqz v0, :cond_2

    .line 14
    .line 15
    if-eq v0, v7, :cond_1

    .line 16
    .line 17
    if-ne v0, v5, :cond_0

    .line 18
    .line 19
    iget v9, v1, Landroidx/compose/foundation/gestures/DraggableKt$draggable$9$3$1$1;->I$0:I

    .line 20
    .line 21
    iget-boolean v10, v1, Landroidx/compose/foundation/gestures/DraggableKt$draggable$9$3$1$1;->Z$0:Z

    .line 22
    .line 23
    iget-object v0, v1, Landroidx/compose/foundation/gestures/DraggableKt$draggable$9$3$1$1;->L$3:Ljava/lang/Object;

    .line 24
    .line 25
    move-object v11, v0

    .line 26
    check-cast v11, Lkotlinx/coroutines/CoroutineScope;

    .line 27
    .line 28
    iget-object v0, v1, Landroidx/compose/foundation/gestures/DraggableKt$draggable$9$3$1$1;->L$2:Ljava/lang/Object;

    .line 29
    .line 30
    move-object v12, v0

    .line 31
    check-cast v12, Lkotlinx/coroutines/channels/Channel;

    .line 32
    .line 33
    iget-object v0, v1, Landroidx/compose/foundation/gestures/DraggableKt$draggable$9$3$1$1;->L$1:Ljava/lang/Object;

    .line 34
    .line 35
    move-object v13, v0

    .line 36
    check-cast v13, Landroidx/compose/ui/input/pointer/util/VelocityTracker;

    .line 37
    .line 38
    iget-object v0, v1, Landroidx/compose/foundation/gestures/DraggableKt$draggable$9$3$1$1;->L$0:Ljava/lang/Object;

    .line 39
    .line 40
    move-object v14, v0

    .line 41
    check-cast v14, Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;

    .line 42
    .line 43
    :try_start_0
    invoke-static/range {p1 .. p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/util/concurrent/CancellationException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 44
    .line 45
    .line 46
    move-object/from16 v0, p1

    .line 47
    .line 48
    move-object v3, v12

    .line 49
    move-object v12, v1

    .line 50
    goto/16 :goto_4

    .line 51
    .line 52
    :catchall_0
    move-exception v0

    .line 53
    :goto_0
    move v6, v9

    .line 54
    goto/16 :goto_b

    .line 55
    .line 56
    :catch_0
    move-exception v0

    .line 57
    move-object/from16 v21, v1

    .line 58
    .line 59
    goto/16 :goto_9

    .line 60
    .line 61
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 62
    .line 63
    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 64
    .line 65
    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 66
    .line 67
    .line 68
    throw v0

    .line 69
    :cond_1
    iget-object v0, v1, Landroidx/compose/foundation/gestures/DraggableKt$draggable$9$3$1$1;->L$1:Ljava/lang/Object;

    .line 70
    .line 71
    check-cast v0, Landroidx/compose/ui/input/pointer/util/VelocityTracker;

    .line 72
    .line 73
    iget-object v9, v1, Landroidx/compose/foundation/gestures/DraggableKt$draggable$9$3$1$1;->L$0:Ljava/lang/Object;

    .line 74
    .line 75
    check-cast v9, Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;

    .line 76
    .line 77
    invoke-static/range {p1 .. p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 78
    .line 79
    .line 80
    move-object v14, v0

    .line 81
    move-object v12, v1

    .line 82
    move-object v15, v2

    .line 83
    move-object v2, v9

    .line 84
    move-object/from16 v9, p1

    .line 85
    .line 86
    goto :goto_2

    .line 87
    :cond_2
    invoke-static/range {p1 .. p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 88
    .line 89
    .line 90
    iget-object v0, v1, Landroidx/compose/foundation/gestures/DraggableKt$draggable$9$3$1$1;->L$0:Ljava/lang/Object;

    .line 91
    .line 92
    check-cast v0, Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;

    .line 93
    .line 94
    move-object v15, v1

    .line 95
    :goto_1
    iget-object v9, v15, Landroidx/compose/foundation/gestures/DraggableKt$draggable$9$3$1$1;->$$this$coroutineScope:Lkotlinx/coroutines/CoroutineScope;

    .line 96
    .line 97
    invoke-static {v9}, Lkotlinx/coroutines/CoroutineScopeKt;->isActive(Lkotlinx/coroutines/CoroutineScope;)Z

    .line 98
    .line 99
    .line 100
    move-result v9

    .line 101
    if-eqz v9, :cond_c

    .line 102
    .line 103
    new-instance v14, Landroidx/compose/ui/input/pointer/util/VelocityTracker;

    .line 104
    .line 105
    invoke-direct {v14}, Landroidx/compose/ui/input/pointer/util/VelocityTracker;-><init>()V

    .line 106
    .line 107
    .line 108
    iget-object v10, v15, Landroidx/compose/foundation/gestures/DraggableKt$draggable$9$3$1$1;->$canDragState:Landroidx/compose/runtime/State;

    .line 109
    .line 110
    iget-object v11, v15, Landroidx/compose/foundation/gestures/DraggableKt$draggable$9$3$1$1;->$startImmediatelyState:Landroidx/compose/runtime/State;

    .line 111
    .line 112
    iget-object v13, v15, Landroidx/compose/foundation/gestures/DraggableKt$draggable$9$3$1$1;->$orientation:Landroidx/compose/foundation/gestures/Orientation;

    .line 113
    .line 114
    iput-object v0, v15, Landroidx/compose/foundation/gestures/DraggableKt$draggable$9$3$1$1;->L$0:Ljava/lang/Object;

    .line 115
    .line 116
    iput-object v14, v15, Landroidx/compose/foundation/gestures/DraggableKt$draggable$9$3$1$1;->L$1:Ljava/lang/Object;

    .line 117
    .line 118
    iput-object v8, v15, Landroidx/compose/foundation/gestures/DraggableKt$draggable$9$3$1$1;->L$2:Ljava/lang/Object;

    .line 119
    .line 120
    iput-object v8, v15, Landroidx/compose/foundation/gestures/DraggableKt$draggable$9$3$1$1;->L$3:Ljava/lang/Object;

    .line 121
    .line 122
    iput v7, v15, Landroidx/compose/foundation/gestures/DraggableKt$draggable$9$3$1$1;->label:I

    .line 123
    .line 124
    move-object v9, v0

    .line 125
    move-object v12, v14

    .line 126
    move-object/from16 v16, v14

    .line 127
    .line 128
    move-object v14, v15

    .line 129
    invoke-static/range {v9 .. v14}, Landroidx/compose/foundation/gestures/DraggableKt;->access$awaitDownAndSlop(Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;Landroidx/compose/runtime/State;Landroidx/compose/runtime/State;Landroidx/compose/ui/input/pointer/util/VelocityTracker;Landroidx/compose/foundation/gestures/Orientation;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 130
    .line 131
    .line 132
    move-result-object v9

    .line 133
    if-ne v9, v2, :cond_3

    .line 134
    .line 135
    return-object v2

    .line 136
    :cond_3
    move-object v12, v15

    .line 137
    move-object/from16 v14, v16

    .line 138
    .line 139
    move-object v15, v2

    .line 140
    move-object v2, v0

    .line 141
    :goto_2
    check-cast v9, Lkotlin/Pair;

    .line 142
    .line 143
    if-eqz v9, :cond_b

    .line 144
    .line 145
    iget-object v13, v12, Landroidx/compose/foundation/gestures/DraggableKt$draggable$9$3$1$1;->$channel:Lkotlinx/coroutines/channels/Channel;

    .line 146
    .line 147
    iget-boolean v11, v12, Landroidx/compose/foundation/gestures/DraggableKt$draggable$9$3$1$1;->$reverseDirection:Z

    .line 148
    .line 149
    iget-object v0, v12, Landroidx/compose/foundation/gestures/DraggableKt$draggable$9$3$1$1;->$orientation:Landroidx/compose/foundation/gestures/Orientation;

    .line 150
    .line 151
    iget-object v10, v12, Landroidx/compose/foundation/gestures/DraggableKt$draggable$9$3$1$1;->$$this$coroutineScope:Lkotlinx/coroutines/CoroutineScope;

    .line 152
    .line 153
    :try_start_1
    invoke-virtual {v9}, Lkotlin/Pair;->getFirst()Ljava/lang/Object;

    .line 154
    .line 155
    .line 156
    move-result-object v16

    .line 157
    check-cast v16, Landroidx/compose/ui/input/pointer/PointerInputChange;

    .line 158
    .line 159
    invoke-virtual {v9}, Lkotlin/Pair;->getSecond()Ljava/lang/Object;

    .line 160
    .line 161
    .line 162
    move-result-object v9

    .line 163
    check-cast v9, Landroidx/compose/ui/geometry/Offset;

    .line 164
    .line 165
    invoke-virtual {v9}, Landroidx/compose/ui/geometry/Offset;->unbox-impl()J

    .line 166
    .line 167
    .line 168
    move-result-wide v17

    .line 169
    if-eqz v11, :cond_4

    .line 170
    .line 171
    move v9, v7

    .line 172
    goto :goto_3

    .line 173
    :cond_4
    move v9, v6

    .line 174
    :goto_3
    iput-object v2, v12, Landroidx/compose/foundation/gestures/DraggableKt$draggable$9$3$1$1;->L$0:Ljava/lang/Object;

    .line 175
    .line 176
    iput-object v14, v12, Landroidx/compose/foundation/gestures/DraggableKt$draggable$9$3$1$1;->L$1:Ljava/lang/Object;

    .line 177
    .line 178
    iput-object v13, v12, Landroidx/compose/foundation/gestures/DraggableKt$draggable$9$3$1$1;->L$2:Ljava/lang/Object;

    .line 179
    .line 180
    iput-object v10, v12, Landroidx/compose/foundation/gestures/DraggableKt$draggable$9$3$1$1;->L$3:Ljava/lang/Object;

    .line 181
    .line 182
    iput-boolean v11, v12, Landroidx/compose/foundation/gestures/DraggableKt$draggable$9$3$1$1;->Z$0:Z

    .line 183
    .line 184
    iput v6, v12, Landroidx/compose/foundation/gestures/DraggableKt$draggable$9$3$1$1;->I$0:I

    .line 185
    .line 186
    iput v5, v12, Landroidx/compose/foundation/gestures/DraggableKt$draggable$9$3$1$1;->label:I
    :try_end_1
    .catch Ljava/util/concurrent/CancellationException; {:try_start_1 .. :try_end_1} :catch_3
    .catchall {:try_start_1 .. :try_end_1} :catchall_3

    .line 187
    .line 188
    move-object/from16 v19, v10

    .line 189
    .line 190
    move-object v10, v2

    .line 191
    move/from16 v20, v11

    .line 192
    .line 193
    move-object/from16 v11, v16

    .line 194
    .line 195
    move-object/from16 v21, v12

    .line 196
    .line 197
    move-object/from16 v22, v13

    .line 198
    .line 199
    move-wide/from16 v12, v17

    .line 200
    .line 201
    move-object/from16 v23, v14

    .line 202
    .line 203
    move-object v3, v15

    .line 204
    move-object/from16 v15, v22

    .line 205
    .line 206
    move/from16 v16, v9

    .line 207
    .line 208
    move-object/from16 v17, v0

    .line 209
    .line 210
    move-object/from16 v18, v21

    .line 211
    .line 212
    :try_start_2
    invoke-static/range {v10 .. v18}, Landroidx/compose/foundation/gestures/DraggableKt;->access$awaitDrag-Su4bsnU(Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;Landroidx/compose/ui/input/pointer/PointerInputChange;JLandroidx/compose/ui/input/pointer/util/VelocityTracker;Lkotlinx/coroutines/channels/SendChannel;ZLandroidx/compose/foundation/gestures/Orientation;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 213
    .line 214
    .line 215
    move-result-object v0
    :try_end_2
    .catch Ljava/util/concurrent/CancellationException; {:try_start_2 .. :try_end_2} :catch_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 216
    if-ne v0, v3, :cond_5

    .line 217
    .line 218
    return-object v3

    .line 219
    :cond_5
    move-object v14, v2

    .line 220
    move-object v2, v3

    .line 221
    move v9, v6

    .line 222
    move-object/from16 v11, v19

    .line 223
    .line 224
    move/from16 v10, v20

    .line 225
    .line 226
    move-object/from16 v12, v21

    .line 227
    .line 228
    move-object/from16 v3, v22

    .line 229
    .line 230
    move-object/from16 v13, v23

    .line 231
    .line 232
    :goto_4
    :try_start_3
    check-cast v0, Ljava/lang/Boolean;

    .line 233
    .line 234
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 235
    .line 236
    .line 237
    move-result v0
    :try_end_3
    .catch Ljava/util/concurrent/CancellationException; {:try_start_3 .. :try_end_3} :catch_1
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 238
    if-eqz v0, :cond_7

    .line 239
    .line 240
    invoke-virtual {v13}, Landroidx/compose/ui/input/pointer/util/VelocityTracker;->calculateVelocity-9UxMQ8M()J

    .line 241
    .line 242
    .line 243
    move-result-wide v4

    .line 244
    new-instance v0, Landroidx/compose/foundation/gestures/DragEvent$DragStopped;

    .line 245
    .line 246
    if-eqz v10, :cond_6

    .line 247
    .line 248
    const/high16 v9, -0x40800000    # -1.0f

    .line 249
    .line 250
    goto :goto_5

    .line 251
    :cond_6
    const/high16 v9, 0x3f800000    # 1.0f

    .line 252
    .line 253
    :goto_5
    invoke-static {v4, v5, v9}, Landroidx/compose/ui/unit/Velocity;->times-adjELrA(JF)J

    .line 254
    .line 255
    .line 256
    move-result-wide v4

    .line 257
    invoke-direct {v0, v4, v5, v8}, Landroidx/compose/foundation/gestures/DragEvent$DragStopped;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 258
    .line 259
    .line 260
    goto :goto_6

    .line 261
    :cond_7
    sget-object v0, Landroidx/compose/foundation/gestures/DragEvent$DragCancelled;->INSTANCE:Landroidx/compose/foundation/gestures/DragEvent$DragCancelled;

    .line 262
    .line 263
    :goto_6
    invoke-interface {v3, v0}, Lkotlinx/coroutines/channels/SendChannel;->trySend-JP2dKIU(Ljava/lang/Object;)Ljava/lang/Object;

    .line 264
    .line 265
    .line 266
    move-object/from16 v21, v12

    .line 267
    .line 268
    goto :goto_a

    .line 269
    :catchall_1
    move-exception v0

    .line 270
    move-object v12, v3

    .line 271
    goto/16 :goto_0

    .line 272
    .line 273
    :catch_1
    move-exception v0

    .line 274
    move-object/from16 v21, v12

    .line 275
    .line 276
    move-object v12, v3

    .line 277
    goto :goto_9

    .line 278
    :catchall_2
    move-exception v0

    .line 279
    goto :goto_7

    .line 280
    :catch_2
    move-exception v0

    .line 281
    goto :goto_8

    .line 282
    :catchall_3
    move-exception v0

    .line 283
    move/from16 v20, v11

    .line 284
    .line 285
    move-object/from16 v22, v13

    .line 286
    .line 287
    move-object/from16 v23, v14

    .line 288
    .line 289
    :goto_7
    move/from16 v10, v20

    .line 290
    .line 291
    move-object/from16 v12, v22

    .line 292
    .line 293
    move-object/from16 v13, v23

    .line 294
    .line 295
    goto :goto_b

    .line 296
    :catch_3
    move-exception v0

    .line 297
    move-object/from16 v19, v10

    .line 298
    .line 299
    move/from16 v20, v11

    .line 300
    .line 301
    move-object/from16 v21, v12

    .line 302
    .line 303
    move-object/from16 v22, v13

    .line 304
    .line 305
    move-object/from16 v23, v14

    .line 306
    .line 307
    move-object v3, v15

    .line 308
    :goto_8
    move-object v14, v2

    .line 309
    move-object v2, v3

    .line 310
    move-object/from16 v11, v19

    .line 311
    .line 312
    move/from16 v10, v20

    .line 313
    .line 314
    move-object/from16 v12, v22

    .line 315
    .line 316
    move-object/from16 v13, v23

    .line 317
    .line 318
    :goto_9
    :try_start_4
    invoke-static {v11}, Lkotlinx/coroutines/CoroutineScopeKt;->isActive(Lkotlinx/coroutines/CoroutineScope;)Z

    .line 319
    .line 320
    .line 321
    move-result v3
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_4

    .line 322
    if-eqz v3, :cond_8

    .line 323
    .line 324
    sget-object v0, Landroidx/compose/foundation/gestures/DragEvent$DragCancelled;->INSTANCE:Landroidx/compose/foundation/gestures/DragEvent$DragCancelled;

    .line 325
    .line 326
    invoke-interface {v12, v0}, Lkotlinx/coroutines/channels/SendChannel;->trySend-JP2dKIU(Ljava/lang/Object;)Ljava/lang/Object;

    .line 327
    .line 328
    .line 329
    :goto_a
    move-object v0, v14

    .line 330
    move-object/from16 v15, v21

    .line 331
    .line 332
    const/4 v5, 0x2

    .line 333
    goto/16 :goto_1

    .line 334
    .line 335
    :cond_8
    :try_start_5
    throw v0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_4

    .line 336
    :catchall_4
    move-exception v0

    .line 337
    :goto_b
    if-eqz v6, :cond_a

    .line 338
    .line 339
    invoke-virtual {v13}, Landroidx/compose/ui/input/pointer/util/VelocityTracker;->calculateVelocity-9UxMQ8M()J

    .line 340
    .line 341
    .line 342
    move-result-wide v2

    .line 343
    new-instance v4, Landroidx/compose/foundation/gestures/DragEvent$DragStopped;

    .line 344
    .line 345
    if-eqz v10, :cond_9

    .line 346
    .line 347
    const/high16 v15, -0x40800000    # -1.0f

    .line 348
    .line 349
    goto :goto_c

    .line 350
    :cond_9
    const/high16 v15, 0x3f800000    # 1.0f

    .line 351
    .line 352
    :goto_c
    invoke-static {v2, v3, v15}, Landroidx/compose/ui/unit/Velocity;->times-adjELrA(JF)J

    .line 353
    .line 354
    .line 355
    move-result-wide v2

    .line 356
    invoke-direct {v4, v2, v3, v8}, Landroidx/compose/foundation/gestures/DragEvent$DragStopped;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 357
    .line 358
    .line 359
    goto :goto_d

    .line 360
    :cond_a
    sget-object v4, Landroidx/compose/foundation/gestures/DragEvent$DragCancelled;->INSTANCE:Landroidx/compose/foundation/gestures/DragEvent$DragCancelled;

    .line 361
    .line 362
    :goto_d
    invoke-interface {v12, v4}, Lkotlinx/coroutines/channels/SendChannel;->trySend-JP2dKIU(Ljava/lang/Object;)Ljava/lang/Object;

    .line 363
    .line 364
    .line 365
    throw v0

    .line 366
    :cond_b
    move-object/from16 v21, v12

    .line 367
    .line 368
    move-object v3, v15

    .line 369
    move-object v0, v2

    .line 370
    move-object v2, v3

    .line 371
    move-object/from16 v15, v21

    .line 372
    .line 373
    goto/16 :goto_1

    .line 374
    .line 375
    :cond_c
    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 376
    .line 377
    return-object v0
.end method
