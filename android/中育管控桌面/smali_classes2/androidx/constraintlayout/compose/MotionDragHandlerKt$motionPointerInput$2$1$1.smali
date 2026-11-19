.class final Landroidx/constraintlayout/compose/MotionDragHandlerKt$motionPointerInput$2$1$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/constraintlayout/compose/MotionDragHandlerKt$motionPointerInput$2;->invoke(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/Modifier;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/coroutines/jvm/internal/SuspendLambda;",
        "Lkotlin/jvm/functions/Function2<",
        "Lkotlinx/coroutines/CoroutineScope;",
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
        "\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"
    }
    d2 = {
        "<anonymous>",
        "",
        "Lkotlinx/coroutines/CoroutineScope;"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation

.annotation runtime Lkotlin/coroutines/jvm/internal/DebugMetadata;
    c = "androidx.constraintlayout.compose.MotionDragHandlerKt$motionPointerInput$2$1$1"
    f = "MotionDragHandler.kt"
    i = {
        0x0,
        0x0,
        0x0,
        0x1,
        0x2,
        0x2
    }
    l = {
        0x4d,
        0x50,
        0x55
    }
    m = "invokeSuspend"
    n = {
        "$this$effectScope",
        "dragState",
        "isTouchUp",
        "$this$effectScope",
        "$this$effectScope",
        "isTouchUp"
    }
    s = {
        "L$0",
        "L$1",
        "I$0",
        "L$0",
        "L$0",
        "I$0"
    }
.end annotation


# instance fields
.field final synthetic $dragChannel:Lkotlinx/coroutines/channels/Channel;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlinx/coroutines/channels/Channel<",
            "Landroidx/constraintlayout/compose/MotionDragState;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $swipeHandler:Landroidx/constraintlayout/compose/TransitionHandler;

.field I$0:I

.field private synthetic L$0:Ljava/lang/Object;

.field L$1:Ljava/lang/Object;

.field label:I


# direct methods
.method public constructor <init>(Landroidx/constraintlayout/compose/TransitionHandler;Lkotlinx/coroutines/channels/Channel;Lkotlin/coroutines/Continuation;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/constraintlayout/compose/TransitionHandler;",
            "Lkotlinx/coroutines/channels/Channel<",
            "Landroidx/constraintlayout/compose/MotionDragState;",
            ">;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Landroidx/constraintlayout/compose/MotionDragHandlerKt$motionPointerInput$2$1$1;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Landroidx/constraintlayout/compose/MotionDragHandlerKt$motionPointerInput$2$1$1;->$swipeHandler:Landroidx/constraintlayout/compose/TransitionHandler;

    iput-object p2, p0, Landroidx/constraintlayout/compose/MotionDragHandlerKt$motionPointerInput$2$1$1;->$dragChannel:Lkotlinx/coroutines/channels/Channel;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILkotlin/coroutines/Continuation;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;
    .locals 3
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

    new-instance v0, Landroidx/constraintlayout/compose/MotionDragHandlerKt$motionPointerInput$2$1$1;

    iget-object v1, p0, Landroidx/constraintlayout/compose/MotionDragHandlerKt$motionPointerInput$2$1$1;->$swipeHandler:Landroidx/constraintlayout/compose/TransitionHandler;

    iget-object v2, p0, Landroidx/constraintlayout/compose/MotionDragHandlerKt$motionPointerInput$2$1$1;->$dragChannel:Lkotlinx/coroutines/channels/Channel;

    invoke-direct {v0, v1, v2, p2}, Landroidx/constraintlayout/compose/MotionDragHandlerKt$motionPointerInput$2$1$1;-><init>(Landroidx/constraintlayout/compose/TransitionHandler;Lkotlinx/coroutines/channels/Channel;Lkotlin/coroutines/Continuation;)V

    iput-object p1, v0, Landroidx/constraintlayout/compose/MotionDragHandlerKt$motionPointerInput$2$1$1;->L$0:Ljava/lang/Object;

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lkotlinx/coroutines/CoroutineScope;

    check-cast p2, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2}, Landroidx/constraintlayout/compose/MotionDragHandlerKt$motionPointerInput$2$1$1;->invoke(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlinx/coroutines/CoroutineScope;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 2
    invoke-virtual {p0, p1, p2}, Landroidx/constraintlayout/compose/MotionDragHandlerKt$motionPointerInput$2$1$1;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object p1

    check-cast p1, Landroidx/constraintlayout/compose/MotionDragHandlerKt$motionPointerInput$2$1$1;

    sget-object p2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Landroidx/constraintlayout/compose/MotionDragHandlerKt$motionPointerInput$2$1$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 11

    .line 1
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget v1, p0, Landroidx/constraintlayout/compose/MotionDragHandlerKt$motionPointerInput$2$1$1;->label:I

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    const/4 v3, 0x3

    .line 9
    const/4 v4, 0x2

    .line 10
    const/4 v5, 0x1

    .line 11
    const/4 v6, 0x0

    .line 12
    if-eqz v1, :cond_3

    .line 13
    .line 14
    if-eq v1, v5, :cond_2

    .line 15
    .line 16
    if-eq v1, v4, :cond_1

    .line 17
    .line 18
    if-ne v1, v3, :cond_0

    .line 19
    .line 20
    iget v1, p0, Landroidx/constraintlayout/compose/MotionDragHandlerKt$motionPointerInput$2$1$1;->I$0:I

    .line 21
    .line 22
    iget-object v7, p0, Landroidx/constraintlayout/compose/MotionDragHandlerKt$motionPointerInput$2$1$1;->L$0:Ljava/lang/Object;

    .line 23
    .line 24
    check-cast v7, Lkotlinx/coroutines/CoroutineScope;

    .line 25
    .line 26
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 27
    .line 28
    .line 29
    goto/16 :goto_4

    .line 30
    .line 31
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 32
    .line 33
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 34
    .line 35
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 36
    .line 37
    .line 38
    throw p1

    .line 39
    :cond_1
    iget-object v1, p0, Landroidx/constraintlayout/compose/MotionDragHandlerKt$motionPointerInput$2$1$1;->L$0:Ljava/lang/Object;

    .line 40
    .line 41
    check-cast v1, Lkotlinx/coroutines/CoroutineScope;

    .line 42
    .line 43
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 44
    .line 45
    .line 46
    goto :goto_2

    .line 47
    :cond_2
    iget v1, p0, Landroidx/constraintlayout/compose/MotionDragHandlerKt$motionPointerInput$2$1$1;->I$0:I

    .line 48
    .line 49
    iget-object v7, p0, Landroidx/constraintlayout/compose/MotionDragHandlerKt$motionPointerInput$2$1$1;->L$1:Ljava/lang/Object;

    .line 50
    .line 51
    check-cast v7, Landroidx/constraintlayout/compose/MotionDragState;

    .line 52
    .line 53
    iget-object v8, p0, Landroidx/constraintlayout/compose/MotionDragHandlerKt$motionPointerInput$2$1$1;->L$0:Ljava/lang/Object;

    .line 54
    .line 55
    check-cast v8, Lkotlinx/coroutines/CoroutineScope;

    .line 56
    .line 57
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 58
    .line 59
    .line 60
    goto :goto_1

    .line 61
    :cond_3
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 62
    .line 63
    .line 64
    iget-object p1, p0, Landroidx/constraintlayout/compose/MotionDragHandlerKt$motionPointerInput$2$1$1;->L$0:Ljava/lang/Object;

    .line 65
    .line 66
    check-cast p1, Lkotlinx/coroutines/CoroutineScope;

    .line 67
    .line 68
    move-object v1, p1

    .line 69
    move p1, v2

    .line 70
    move-object v7, v6

    .line 71
    :cond_4
    :goto_0
    invoke-interface {v1}, Lkotlinx/coroutines/CoroutineScope;->getCoroutineContext()Lkotlin/coroutines/CoroutineContext;

    .line 72
    .line 73
    .line 74
    move-result-object v8

    .line 75
    invoke-static {v8}, Lkotlinx/coroutines/JobKt;->isActive(Lkotlin/coroutines/CoroutineContext;)Z

    .line 76
    .line 77
    .line 78
    move-result v8

    .line 79
    if-eqz v8, :cond_b

    .line 80
    .line 81
    if-eqz p1, :cond_6

    .line 82
    .line 83
    iget-object v8, p0, Landroidx/constraintlayout/compose/MotionDragHandlerKt$motionPointerInput$2$1$1;->$swipeHandler:Landroidx/constraintlayout/compose/TransitionHandler;

    .line 84
    .line 85
    invoke-virtual {v8}, Landroidx/constraintlayout/compose/TransitionHandler;->pendingProgressWhileTouchUp()Z

    .line 86
    .line 87
    .line 88
    move-result v8

    .line 89
    if-eqz v8, :cond_6

    .line 90
    .line 91
    iget-object v8, p0, Landroidx/constraintlayout/compose/MotionDragHandlerKt$motionPointerInput$2$1$1;->$swipeHandler:Landroidx/constraintlayout/compose/TransitionHandler;

    .line 92
    .line 93
    iput-object v1, p0, Landroidx/constraintlayout/compose/MotionDragHandlerKt$motionPointerInput$2$1$1;->L$0:Ljava/lang/Object;

    .line 94
    .line 95
    iput-object v7, p0, Landroidx/constraintlayout/compose/MotionDragHandlerKt$motionPointerInput$2$1$1;->L$1:Ljava/lang/Object;

    .line 96
    .line 97
    iput p1, p0, Landroidx/constraintlayout/compose/MotionDragHandlerKt$motionPointerInput$2$1$1;->I$0:I

    .line 98
    .line 99
    iput v5, p0, Landroidx/constraintlayout/compose/MotionDragHandlerKt$motionPointerInput$2$1$1;->label:I

    .line 100
    .line 101
    invoke-virtual {v8, p0}, Landroidx/constraintlayout/compose/TransitionHandler;->updateProgressWhileTouchUp(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 102
    .line 103
    .line 104
    move-result-object v8

    .line 105
    if-ne v8, v0, :cond_5

    .line 106
    .line 107
    goto :goto_3

    .line 108
    :cond_5
    move-object v8, v1

    .line 109
    move v1, p1

    .line 110
    :goto_1
    move p1, v1

    .line 111
    move-object v1, v8

    .line 112
    goto :goto_6

    .line 113
    :cond_6
    if-nez v7, :cond_8

    .line 114
    .line 115
    iget-object p1, p0, Landroidx/constraintlayout/compose/MotionDragHandlerKt$motionPointerInput$2$1$1;->$dragChannel:Lkotlinx/coroutines/channels/Channel;

    .line 116
    .line 117
    iput-object v1, p0, Landroidx/constraintlayout/compose/MotionDragHandlerKt$motionPointerInput$2$1$1;->L$0:Ljava/lang/Object;

    .line 118
    .line 119
    iput-object v6, p0, Landroidx/constraintlayout/compose/MotionDragHandlerKt$motionPointerInput$2$1$1;->L$1:Ljava/lang/Object;

    .line 120
    .line 121
    iput v4, p0, Landroidx/constraintlayout/compose/MotionDragHandlerKt$motionPointerInput$2$1$1;->label:I

    .line 122
    .line 123
    invoke-interface {p1, p0}, Lkotlinx/coroutines/channels/ReceiveChannel;->receive(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 124
    .line 125
    .line 126
    move-result-object p1

    .line 127
    if-ne p1, v0, :cond_7

    .line 128
    .line 129
    goto :goto_3

    .line 130
    :cond_7
    :goto_2
    move-object v7, p1

    .line 131
    check-cast v7, Landroidx/constraintlayout/compose/MotionDragState;

    .line 132
    .line 133
    :cond_8
    move-object p1, v7

    .line 134
    move-object v7, v1

    .line 135
    invoke-interface {v7}, Lkotlinx/coroutines/CoroutineScope;->getCoroutineContext()Lkotlin/coroutines/CoroutineContext;

    .line 136
    .line 137
    .line 138
    move-result-object v1

    .line 139
    invoke-static {v1}, Lkotlinx/coroutines/JobKt;->ensureActive(Lkotlin/coroutines/CoroutineContext;)V

    .line 140
    .line 141
    .line 142
    invoke-virtual {p1}, Landroidx/constraintlayout/compose/MotionDragState;->isDragging()Z

    .line 143
    .line 144
    .line 145
    move-result v1

    .line 146
    xor-int/lit8 v8, v1, 0x1

    .line 147
    .line 148
    if-nez v1, :cond_a

    .line 149
    .line 150
    iget-object v1, p0, Landroidx/constraintlayout/compose/MotionDragHandlerKt$motionPointerInput$2$1$1;->$swipeHandler:Landroidx/constraintlayout/compose/TransitionHandler;

    .line 151
    .line 152
    invoke-virtual {p1}, Landroidx/constraintlayout/compose/MotionDragState;->getVelocity-9UxMQ8M()J

    .line 153
    .line 154
    .line 155
    move-result-wide v9

    .line 156
    iput-object v7, p0, Landroidx/constraintlayout/compose/MotionDragHandlerKt$motionPointerInput$2$1$1;->L$0:Ljava/lang/Object;

    .line 157
    .line 158
    iput-object v6, p0, Landroidx/constraintlayout/compose/MotionDragHandlerKt$motionPointerInput$2$1$1;->L$1:Ljava/lang/Object;

    .line 159
    .line 160
    iput v8, p0, Landroidx/constraintlayout/compose/MotionDragHandlerKt$motionPointerInput$2$1$1;->I$0:I

    .line 161
    .line 162
    iput v3, p0, Landroidx/constraintlayout/compose/MotionDragHandlerKt$motionPointerInput$2$1$1;->label:I

    .line 163
    .line 164
    invoke-virtual {v1, v9, v10, p0}, Landroidx/constraintlayout/compose/TransitionHandler;->onTouchUp-sF-c-tU(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 165
    .line 166
    .line 167
    move-result-object p1

    .line 168
    if-ne p1, v0, :cond_9

    .line 169
    .line 170
    :goto_3
    return-object v0

    .line 171
    :cond_9
    move v1, v8

    .line 172
    :goto_4
    move v8, v1

    .line 173
    goto :goto_5

    .line 174
    :cond_a
    iget-object v1, p0, Landroidx/constraintlayout/compose/MotionDragHandlerKt$motionPointerInput$2$1$1;->$swipeHandler:Landroidx/constraintlayout/compose/TransitionHandler;

    .line 175
    .line 176
    invoke-virtual {p1}, Landroidx/constraintlayout/compose/MotionDragState;->getDragAmount-F1C5BW0()J

    .line 177
    .line 178
    .line 179
    move-result-wide v9

    .line 180
    invoke-virtual {v1, v9, v10}, Landroidx/constraintlayout/compose/TransitionHandler;->updateProgressOnDrag-k-4lQ0M(J)V

    .line 181
    .line 182
    .line 183
    :goto_5
    move-object v1, v7

    .line 184
    move p1, v8

    .line 185
    move-object v7, v6

    .line 186
    :goto_6
    iget-object v8, p0, Landroidx/constraintlayout/compose/MotionDragHandlerKt$motionPointerInput$2$1$1;->$dragChannel:Lkotlinx/coroutines/channels/Channel;

    .line 187
    .line 188
    invoke-interface {v8}, Lkotlinx/coroutines/channels/ReceiveChannel;->tryReceive-PtdJZtk()Ljava/lang/Object;

    .line 189
    .line 190
    .line 191
    move-result-object v8

    .line 192
    invoke-static {v8}, Lkotlinx/coroutines/channels/ChannelResult;->isSuccess-impl(Ljava/lang/Object;)Z

    .line 193
    .line 194
    .line 195
    move-result v9

    .line 196
    if-eqz v9, :cond_4

    .line 197
    .line 198
    invoke-static {v8}, Lkotlinx/coroutines/channels/ChannelResult;->getOrThrow-impl(Ljava/lang/Object;)Ljava/lang/Object;

    .line 199
    .line 200
    .line 201
    move-result-object v7

    .line 202
    check-cast v7, Landroidx/constraintlayout/compose/MotionDragState;

    .line 203
    .line 204
    invoke-virtual {v7}, Landroidx/constraintlayout/compose/MotionDragState;->isDragging()Z

    .line 205
    .line 206
    .line 207
    move-result v8

    .line 208
    if-eqz v8, :cond_4

    .line 209
    .line 210
    move p1, v2

    .line 211
    goto/16 :goto_0

    .line 212
    .line 213
    :cond_b
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 214
    .line 215
    return-object p1
.end method
