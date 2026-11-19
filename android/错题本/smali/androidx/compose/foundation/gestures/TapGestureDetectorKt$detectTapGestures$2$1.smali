.class final Landroidx/compose/foundation/gestures/TapGestureDetectorKt$detectTapGestures$2$1;
.super Lkotlin/coroutines/jvm/internal/RestrictedSuspendLambda;
.source "SourceFile"

# interfaces
.implements Lr6/e;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/foundation/gestures/TapGestureDetectorKt$detectTapGestures$2;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
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
    c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1"
    f = "TapGestureDetector.kt"
    i = {
        0x0,
        0x1,
        0x1,
        0x2,
        0x2,
        0x2,
        0x3,
        0x4,
        0x4,
        0x4,
        0x5,
        0x5,
        0x6,
        0x6,
        0x6,
        0x6,
        0x7
    }
    l = {
        0x69,
        0x74,
        0x77,
        0x7a,
        0x95,
        0xa7,
        0xa9,
        0xb4
    }
    m = "invokeSuspend"
    n = {
        "$this$awaitEachGesture",
        "$this$awaitEachGesture",
        "resetJob",
        "$this$awaitEachGesture",
        "down",
        "resetJob",
        "resetJob",
        "$this$awaitEachGesture",
        "upOrCancel",
        "cancelOrReleaseJob",
        "resetJob",
        "upOrCancel",
        "$this$awaitEachGesture",
        "resetJob",
        "upOrCancel",
        "secondDown",
        "resetJob"
    }
    s = {
        "L$0",
        "L$0",
        "L$1",
        "L$0",
        "L$1",
        "L$2",
        "L$0",
        "L$0",
        "L$1",
        "L$2",
        "L$0",
        "L$1",
        "L$0",
        "L$1",
        "L$2",
        "L$3",
        "L$0"
    }
.end annotation


# instance fields
.field final synthetic $$this$coroutineScope:Lkotlinx/coroutines/v;

.field final synthetic $onDoubleTap:Lr6/c;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lr6/c;"
        }
    .end annotation
.end field

.field final synthetic $onLongPress:Lr6/c;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lr6/c;"
        }
    .end annotation
.end field

.field final synthetic $onPress:Lr6/f;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lr6/f;"
        }
    .end annotation
.end field

.field final synthetic $onTap:Lr6/c;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lr6/c;"
        }
    .end annotation
.end field

.field final synthetic $pressScope:Landroidx/compose/foundation/gestures/PressGestureScopeImpl;

.field private synthetic L$0:Ljava/lang/Object;

.field L$1:Ljava/lang/Object;

.field L$2:Ljava/lang/Object;

.field L$3:Ljava/lang/Object;

.field label:I


# direct methods
.method public constructor <init>(Lkotlinx/coroutines/v;Lr6/f;Lr6/c;Lr6/c;Lr6/c;Landroidx/compose/foundation/gestures/PressGestureScopeImpl;Lh6/c;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlinx/coroutines/v;",
            "Lr6/f;",
            "Lr6/c;",
            "Lr6/c;",
            "Lr6/c;",
            "Landroidx/compose/foundation/gestures/PressGestureScopeImpl;",
            "Lh6/c<",
            "-",
            "Landroidx/compose/foundation/gestures/TapGestureDetectorKt$detectTapGestures$2$1;",
            ">;)V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Landroidx/compose/foundation/gestures/TapGestureDetectorKt$detectTapGestures$2$1;->$$this$coroutineScope:Lkotlinx/coroutines/v;

    .line 2
    .line 3
    iput-object p2, p0, Landroidx/compose/foundation/gestures/TapGestureDetectorKt$detectTapGestures$2$1;->$onPress:Lr6/f;

    .line 4
    .line 5
    iput-object p3, p0, Landroidx/compose/foundation/gestures/TapGestureDetectorKt$detectTapGestures$2$1;->$onLongPress:Lr6/c;

    .line 6
    .line 7
    iput-object p4, p0, Landroidx/compose/foundation/gestures/TapGestureDetectorKt$detectTapGestures$2$1;->$onDoubleTap:Lr6/c;

    .line 8
    .line 9
    iput-object p5, p0, Landroidx/compose/foundation/gestures/TapGestureDetectorKt$detectTapGestures$2$1;->$onTap:Lr6/c;

    .line 10
    .line 11
    iput-object p6, p0, Landroidx/compose/foundation/gestures/TapGestureDetectorKt$detectTapGestures$2$1;->$pressScope:Landroidx/compose/foundation/gestures/PressGestureScopeImpl;

    .line 12
    .line 13
    const/4 p1, 0x2

    .line 14
    invoke-direct {p0, p1, p7}, Lkotlin/coroutines/jvm/internal/RestrictedSuspendLambda;-><init>(ILh6/c;)V

    .line 15
    .line 16
    .line 17
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lh6/c;)Lh6/c;
    .locals 8
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
    new-instance v0, Landroidx/compose/foundation/gestures/TapGestureDetectorKt$detectTapGestures$2$1;

    .line 2
    .line 3
    iget-object v1, p0, Landroidx/compose/foundation/gestures/TapGestureDetectorKt$detectTapGestures$2$1;->$$this$coroutineScope:Lkotlinx/coroutines/v;

    .line 4
    .line 5
    iget-object v2, p0, Landroidx/compose/foundation/gestures/TapGestureDetectorKt$detectTapGestures$2$1;->$onPress:Lr6/f;

    .line 6
    .line 7
    iget-object v3, p0, Landroidx/compose/foundation/gestures/TapGestureDetectorKt$detectTapGestures$2$1;->$onLongPress:Lr6/c;

    .line 8
    .line 9
    iget-object v4, p0, Landroidx/compose/foundation/gestures/TapGestureDetectorKt$detectTapGestures$2$1;->$onDoubleTap:Lr6/c;

    .line 10
    .line 11
    iget-object v5, p0, Landroidx/compose/foundation/gestures/TapGestureDetectorKt$detectTapGestures$2$1;->$onTap:Lr6/c;

    .line 12
    .line 13
    iget-object v6, p0, Landroidx/compose/foundation/gestures/TapGestureDetectorKt$detectTapGestures$2$1;->$pressScope:Landroidx/compose/foundation/gestures/PressGestureScopeImpl;

    .line 14
    .line 15
    move-object v7, p2

    .line 16
    invoke-direct/range {v0 .. v7}, Landroidx/compose/foundation/gestures/TapGestureDetectorKt$detectTapGestures$2$1;-><init>(Lkotlinx/coroutines/v;Lr6/f;Lr6/c;Lr6/c;Lr6/c;Landroidx/compose/foundation/gestures/PressGestureScopeImpl;Lh6/c;)V

    .line 17
    .line 18
    .line 19
    iput-object p1, v0, Landroidx/compose/foundation/gestures/TapGestureDetectorKt$detectTapGestures$2$1;->L$0:Ljava/lang/Object;

    .line 20
    .line 21
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
    invoke-virtual {p0, p1, p2}, Landroidx/compose/foundation/gestures/TapGestureDetectorKt$detectTapGestures$2$1;->create(Ljava/lang/Object;Lh6/c;)Lh6/c;

    move-result-object p1

    check-cast p1, Landroidx/compose/foundation/gestures/TapGestureDetectorKt$detectTapGestures$2$1;

    sget-object p2, Ld6/s;->a:Ld6/s;

    invoke-virtual {p1, p2}, Landroidx/compose/foundation/gestures/TapGestureDetectorKt$detectTapGestures$2$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;

    check-cast p2, Lh6/c;

    invoke-virtual {p0, p1, p2}, Landroidx/compose/foundation/gestures/TapGestureDetectorKt$detectTapGestures$2$1;->invoke(Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;Lh6/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 22

    .line 1
    move-object/from16 v3, p0

    .line 2
    .line 3
    sget-object v6, Lkotlin/coroutines/intrinsics/CoroutineSingletons;->COROUTINE_SUSPENDED:Lkotlin/coroutines/intrinsics/CoroutineSingletons;

    .line 4
    .line 5
    iget v0, v3, Landroidx/compose/foundation/gestures/TapGestureDetectorKt$detectTapGestures$2$1;->label:I

    .line 6
    .line 7
    sget-object v7, Ld6/s;->a:Ld6/s;

    .line 8
    .line 9
    const/4 v8, 0x1

    .line 10
    const/4 v9, 0x0

    .line 11
    packed-switch v0, :pswitch_data_0

    .line 12
    .line 13
    .line 14
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 15
    .line 16
    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    .line 17
    .line 18
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    throw v0

    .line 22
    :pswitch_0
    iget-object v0, v3, Landroidx/compose/foundation/gestures/TapGestureDetectorKt$detectTapGestures$2$1;->L$0:Ljava/lang/Object;

    .line 23
    .line 24
    check-cast v0, Lkotlinx/coroutines/w0;

    .line 25
    .line 26
    invoke-static/range {p1 .. p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 27
    .line 28
    .line 29
    move-object/from16 v16, v0

    .line 30
    .line 31
    goto/16 :goto_d

    .line 32
    .line 33
    :pswitch_1
    iget-object v0, v3, Landroidx/compose/foundation/gestures/TapGestureDetectorKt$detectTapGestures$2$1;->L$3:Ljava/lang/Object;

    .line 34
    .line 35
    check-cast v0, Landroidx/compose/ui/input/pointer/PointerInputChange;

    .line 36
    .line 37
    iget-object v1, v3, Landroidx/compose/foundation/gestures/TapGestureDetectorKt$detectTapGestures$2$1;->L$2:Ljava/lang/Object;

    .line 38
    .line 39
    check-cast v1, Landroidx/compose/ui/input/pointer/PointerInputChange;

    .line 40
    .line 41
    iget-object v2, v3, Landroidx/compose/foundation/gestures/TapGestureDetectorKt$detectTapGestures$2$1;->L$1:Ljava/lang/Object;

    .line 42
    .line 43
    check-cast v2, Lkotlinx/coroutines/w0;

    .line 44
    .line 45
    iget-object v4, v3, Landroidx/compose/foundation/gestures/TapGestureDetectorKt$detectTapGestures$2$1;->L$0:Ljava/lang/Object;

    .line 46
    .line 47
    check-cast v4, Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;

    .line 48
    .line 49
    invoke-static/range {p1 .. p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 50
    .line 51
    .line 52
    move-object v14, v2

    .line 53
    move-object v2, v4

    .line 54
    move-object v4, v0

    .line 55
    move-object/from16 v0, p1

    .line 56
    .line 57
    goto/16 :goto_b

    .line 58
    .line 59
    :pswitch_2
    iget-object v0, v3, Landroidx/compose/foundation/gestures/TapGestureDetectorKt$detectTapGestures$2$1;->L$1:Ljava/lang/Object;

    .line 60
    .line 61
    check-cast v0, Landroidx/compose/ui/input/pointer/PointerInputChange;

    .line 62
    .line 63
    iget-object v1, v3, Landroidx/compose/foundation/gestures/TapGestureDetectorKt$detectTapGestures$2$1;->L$0:Ljava/lang/Object;

    .line 64
    .line 65
    check-cast v1, Lkotlinx/coroutines/w0;

    .line 66
    .line 67
    invoke-static/range {p1 .. p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 68
    .line 69
    .line 70
    move-object v14, v1

    .line 71
    move-object v1, v0

    .line 72
    move-object/from16 v0, p1

    .line 73
    .line 74
    goto/16 :goto_9

    .line 75
    .line 76
    :pswitch_3
    iget-object v0, v3, Landroidx/compose/foundation/gestures/TapGestureDetectorKt$detectTapGestures$2$1;->L$2:Ljava/lang/Object;

    .line 77
    .line 78
    check-cast v0, Lkotlinx/coroutines/w0;

    .line 79
    .line 80
    iget-object v1, v3, Landroidx/compose/foundation/gestures/TapGestureDetectorKt$detectTapGestures$2$1;->L$1:Ljava/lang/Object;

    .line 81
    .line 82
    check-cast v1, Landroidx/compose/ui/input/pointer/PointerInputChange;

    .line 83
    .line 84
    iget-object v2, v3, Landroidx/compose/foundation/gestures/TapGestureDetectorKt$detectTapGestures$2$1;->L$0:Ljava/lang/Object;

    .line 85
    .line 86
    check-cast v2, Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;

    .line 87
    .line 88
    invoke-static/range {p1 .. p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 89
    .line 90
    .line 91
    move-object/from16 v4, p1

    .line 92
    .line 93
    goto/16 :goto_8

    .line 94
    .line 95
    :pswitch_4
    iget-object v0, v3, Landroidx/compose/foundation/gestures/TapGestureDetectorKt$detectTapGestures$2$1;->L$0:Ljava/lang/Object;

    .line 96
    .line 97
    check-cast v0, Lkotlinx/coroutines/w0;

    .line 98
    .line 99
    invoke-static/range {p1 .. p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 100
    .line 101
    .line 102
    move-object v14, v0

    .line 103
    goto/16 :goto_4

    .line 104
    .line 105
    :pswitch_5
    iget-object v0, v3, Landroidx/compose/foundation/gestures/TapGestureDetectorKt$detectTapGestures$2$1;->L$2:Ljava/lang/Object;

    .line 106
    .line 107
    check-cast v0, Lkotlinx/coroutines/w0;

    .line 108
    .line 109
    iget-object v1, v3, Landroidx/compose/foundation/gestures/TapGestureDetectorKt$detectTapGestures$2$1;->L$1:Ljava/lang/Object;

    .line 110
    .line 111
    check-cast v1, Landroidx/compose/ui/input/pointer/PointerInputChange;

    .line 112
    .line 113
    iget-object v2, v3, Landroidx/compose/foundation/gestures/TapGestureDetectorKt$detectTapGestures$2$1;->L$0:Ljava/lang/Object;

    .line 114
    .line 115
    check-cast v2, Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;

    .line 116
    .line 117
    invoke-static/range {p1 .. p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 118
    .line 119
    .line 120
    move-object v12, v0

    .line 121
    move-object/from16 v0, p1

    .line 122
    .line 123
    goto/16 :goto_3

    .line 124
    .line 125
    :pswitch_6
    iget-object v0, v3, Landroidx/compose/foundation/gestures/TapGestureDetectorKt$detectTapGestures$2$1;->L$1:Ljava/lang/Object;

    .line 126
    .line 127
    check-cast v0, Lkotlinx/coroutines/w0;

    .line 128
    .line 129
    iget-object v1, v3, Landroidx/compose/foundation/gestures/TapGestureDetectorKt$detectTapGestures$2$1;->L$0:Ljava/lang/Object;

    .line 130
    .line 131
    check-cast v1, Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;

    .line 132
    .line 133
    invoke-static/range {p1 .. p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 134
    .line 135
    .line 136
    move-object v12, v0

    .line 137
    move-object/from16 v0, p1

    .line 138
    .line 139
    goto :goto_1

    .line 140
    :pswitch_7
    iget-object v0, v3, Landroidx/compose/foundation/gestures/TapGestureDetectorKt$detectTapGestures$2$1;->L$0:Ljava/lang/Object;

    .line 141
    .line 142
    check-cast v0, Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;

    .line 143
    .line 144
    invoke-static/range {p1 .. p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 145
    .line 146
    .line 147
    move-object/from16 v1, p1

    .line 148
    .line 149
    :cond_0
    move-object v2, v0

    .line 150
    goto :goto_0

    .line 151
    :pswitch_8
    invoke-static/range {p1 .. p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 152
    .line 153
    .line 154
    iget-object v0, v3, Landroidx/compose/foundation/gestures/TapGestureDetectorKt$detectTapGestures$2$1;->L$0:Ljava/lang/Object;

    .line 155
    .line 156
    check-cast v0, Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;

    .line 157
    .line 158
    iput-object v0, v3, Landroidx/compose/foundation/gestures/TapGestureDetectorKt$detectTapGestures$2$1;->L$0:Ljava/lang/Object;

    .line 159
    .line 160
    iput v8, v3, Landroidx/compose/foundation/gestures/TapGestureDetectorKt$detectTapGestures$2$1;->label:I

    .line 161
    .line 162
    const/4 v1, 0x0

    .line 163
    const/4 v2, 0x0

    .line 164
    const/4 v4, 0x3

    .line 165
    const/4 v5, 0x0

    .line 166
    invoke-static/range {v0 .. v5}, Landroidx/compose/foundation/gestures/TapGestureDetectorKt;->awaitFirstDown$default(Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;ZLandroidx/compose/ui/input/pointer/PointerEventPass;Lh6/c;ILjava/lang/Object;)Ljava/lang/Object;

    .line 167
    .line 168
    .line 169
    move-result-object v1

    .line 170
    if-ne v1, v6, :cond_0

    .line 171
    .line 172
    goto/16 :goto_c

    .line 173
    .line 174
    :goto_0
    check-cast v1, Landroidx/compose/ui/input/pointer/PointerInputChange;

    .line 175
    .line 176
    invoke-virtual {v1}, Landroidx/compose/ui/input/pointer/PointerInputChange;->consume()V

    .line 177
    .line 178
    .line 179
    iget-object v0, v3, Landroidx/compose/foundation/gestures/TapGestureDetectorKt$detectTapGestures$2$1;->$$this$coroutineScope:Lkotlinx/coroutines/v;

    .line 180
    .line 181
    invoke-static {}, Landroidx/compose/foundation/gestures/TapGestureDetectorKt;->access$getCoroutineStartForCurrentDispatchBehavior()Lkotlinx/coroutines/CoroutineStart;

    .line 182
    .line 183
    .line 184
    move-result-object v4

    .line 185
    new-instance v5, Landroidx/compose/foundation/gestures/TapGestureDetectorKt$detectTapGestures$2$1$resetJob$1;

    .line 186
    .line 187
    iget-object v10, v3, Landroidx/compose/foundation/gestures/TapGestureDetectorKt$detectTapGestures$2$1;->$pressScope:Landroidx/compose/foundation/gestures/PressGestureScopeImpl;

    .line 188
    .line 189
    invoke-direct {v5, v10, v9}, Landroidx/compose/foundation/gestures/TapGestureDetectorKt$detectTapGestures$2$1$resetJob$1;-><init>(Landroidx/compose/foundation/gestures/PressGestureScopeImpl;Lh6/c;)V

    .line 190
    .line 191
    .line 192
    invoke-static {v0, v9, v4, v5, v8}, Lkotlinx/coroutines/x;->v(Lkotlinx/coroutines/v;Lh6/h;Lkotlinx/coroutines/CoroutineStart;Lr6/e;I)Lkotlinx/coroutines/k1;

    .line 193
    .line 194
    .line 195
    move-result-object v12

    .line 196
    iget-object v0, v3, Landroidx/compose/foundation/gestures/TapGestureDetectorKt$detectTapGestures$2$1;->$onPress:Lr6/f;

    .line 197
    .line 198
    invoke-static {}, Landroidx/compose/foundation/gestures/TapGestureDetectorKt;->access$getNoPressGesture$p()Lr6/f;

    .line 199
    .line 200
    .line 201
    move-result-object v4

    .line 202
    if-eq v0, v4, :cond_1

    .line 203
    .line 204
    iget-object v11, v3, Landroidx/compose/foundation/gestures/TapGestureDetectorKt$detectTapGestures$2$1;->$$this$coroutineScope:Lkotlinx/coroutines/v;

    .line 205
    .line 206
    new-instance v14, Landroidx/compose/foundation/gestures/TapGestureDetectorKt$detectTapGestures$2$1$1;

    .line 207
    .line 208
    iget-object v0, v3, Landroidx/compose/foundation/gestures/TapGestureDetectorKt$detectTapGestures$2$1;->$onPress:Lr6/f;

    .line 209
    .line 210
    iget-object v4, v3, Landroidx/compose/foundation/gestures/TapGestureDetectorKt$detectTapGestures$2$1;->$pressScope:Landroidx/compose/foundation/gestures/PressGestureScopeImpl;

    .line 211
    .line 212
    invoke-direct {v14, v0, v4, v1, v9}, Landroidx/compose/foundation/gestures/TapGestureDetectorKt$detectTapGestures$2$1$1;-><init>(Lr6/f;Landroidx/compose/foundation/gestures/PressGestureScopeImpl;Landroidx/compose/ui/input/pointer/PointerInputChange;Lh6/c;)V

    .line 213
    .line 214
    .line 215
    const/4 v15, 0x2

    .line 216
    const/16 v16, 0x0

    .line 217
    .line 218
    const/4 v13, 0x0

    .line 219
    invoke-static/range {v11 .. v16}, Landroidx/compose/foundation/gestures/TapGestureDetectorKt;->launchAwaitingReset$default(Lkotlinx/coroutines/v;Lkotlinx/coroutines/w0;Lkotlinx/coroutines/CoroutineStart;Lr6/e;ILjava/lang/Object;)Lkotlinx/coroutines/w0;

    .line 220
    .line 221
    .line 222
    :cond_1
    iget-object v0, v3, Landroidx/compose/foundation/gestures/TapGestureDetectorKt$detectTapGestures$2$1;->$onLongPress:Lr6/c;

    .line 223
    .line 224
    if-nez v0, :cond_3

    .line 225
    .line 226
    iput-object v2, v3, Landroidx/compose/foundation/gestures/TapGestureDetectorKt$detectTapGestures$2$1;->L$0:Ljava/lang/Object;

    .line 227
    .line 228
    iput-object v12, v3, Landroidx/compose/foundation/gestures/TapGestureDetectorKt$detectTapGestures$2$1;->L$1:Ljava/lang/Object;

    .line 229
    .line 230
    const/4 v0, 0x2

    .line 231
    iput v0, v3, Landroidx/compose/foundation/gestures/TapGestureDetectorKt$detectTapGestures$2$1;->label:I

    .line 232
    .line 233
    invoke-static {v2, v9, v3, v8, v9}, Landroidx/compose/foundation/gestures/TapGestureDetectorKt;->waitForUpOrCancellation$default(Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;Landroidx/compose/ui/input/pointer/PointerEventPass;Lh6/c;ILjava/lang/Object;)Ljava/lang/Object;

    .line 234
    .line 235
    .line 236
    move-result-object v0

    .line 237
    if-ne v0, v6, :cond_2

    .line 238
    .line 239
    goto/16 :goto_c

    .line 240
    .line 241
    :cond_2
    move-object v1, v2

    .line 242
    :goto_1
    check-cast v0, Landroidx/compose/ui/input/pointer/PointerInputChange;

    .line 243
    .line 244
    :goto_2
    move-object v11, v12

    .line 245
    goto :goto_6

    .line 246
    :cond_3
    iput-object v2, v3, Landroidx/compose/foundation/gestures/TapGestureDetectorKt$detectTapGestures$2$1;->L$0:Ljava/lang/Object;

    .line 247
    .line 248
    iput-object v1, v3, Landroidx/compose/foundation/gestures/TapGestureDetectorKt$detectTapGestures$2$1;->L$1:Ljava/lang/Object;

    .line 249
    .line 250
    iput-object v12, v3, Landroidx/compose/foundation/gestures/TapGestureDetectorKt$detectTapGestures$2$1;->L$2:Ljava/lang/Object;

    .line 251
    .line 252
    const/4 v0, 0x3

    .line 253
    iput v0, v3, Landroidx/compose/foundation/gestures/TapGestureDetectorKt$detectTapGestures$2$1;->label:I

    .line 254
    .line 255
    invoke-static {v2, v9, v3, v8, v9}, Landroidx/compose/foundation/gestures/TapGestureDetectorKt;->waitForLongPress$default(Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;Landroidx/compose/ui/input/pointer/PointerEventPass;Lh6/c;ILjava/lang/Object;)Ljava/lang/Object;

    .line 256
    .line 257
    .line 258
    move-result-object v0

    .line 259
    if-ne v0, v6, :cond_4

    .line 260
    .line 261
    goto/16 :goto_c

    .line 262
    .line 263
    :cond_4
    :goto_3
    check-cast v0, Landroidx/compose/foundation/gestures/LongPressResult;

    .line 264
    .line 265
    sget-object v4, Landroidx/compose/foundation/gestures/LongPressResult$Success;->INSTANCE:Landroidx/compose/foundation/gestures/LongPressResult$Success;

    .line 266
    .line 267
    invoke-static {v0, v4}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 268
    .line 269
    .line 270
    move-result v4

    .line 271
    if-eqz v4, :cond_6

    .line 272
    .line 273
    iget-object v0, v3, Landroidx/compose/foundation/gestures/TapGestureDetectorKt$detectTapGestures$2$1;->$onLongPress:Lr6/c;

    .line 274
    .line 275
    invoke-virtual {v1}, Landroidx/compose/ui/input/pointer/PointerInputChange;->getPosition-F1C5BW0()J

    .line 276
    .line 277
    .line 278
    move-result-wide v4

    .line 279
    invoke-static {v4, v5}, Landroidx/compose/ui/geometry/Offset;->box-impl(J)Landroidx/compose/ui/geometry/Offset;

    .line 280
    .line 281
    .line 282
    move-result-object v1

    .line 283
    invoke-interface {v0, v1}, Lr6/c;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 284
    .line 285
    .line 286
    iput-object v12, v3, Landroidx/compose/foundation/gestures/TapGestureDetectorKt$detectTapGestures$2$1;->L$0:Ljava/lang/Object;

    .line 287
    .line 288
    iput-object v9, v3, Landroidx/compose/foundation/gestures/TapGestureDetectorKt$detectTapGestures$2$1;->L$1:Ljava/lang/Object;

    .line 289
    .line 290
    iput-object v9, v3, Landroidx/compose/foundation/gestures/TapGestureDetectorKt$detectTapGestures$2$1;->L$2:Ljava/lang/Object;

    .line 291
    .line 292
    const/4 v0, 0x4

    .line 293
    iput v0, v3, Landroidx/compose/foundation/gestures/TapGestureDetectorKt$detectTapGestures$2$1;->label:I

    .line 294
    .line 295
    invoke-static {v2, v3}, Landroidx/compose/foundation/gestures/TapGestureDetectorKt;->access$consumeUntilUp(Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;Lh6/c;)Ljava/lang/Object;

    .line 296
    .line 297
    .line 298
    move-result-object v0

    .line 299
    if-ne v0, v6, :cond_5

    .line 300
    .line 301
    goto/16 :goto_c

    .line 302
    .line 303
    :cond_5
    move-object v14, v12

    .line 304
    :goto_4
    iget-object v13, v3, Landroidx/compose/foundation/gestures/TapGestureDetectorKt$detectTapGestures$2$1;->$$this$coroutineScope:Lkotlinx/coroutines/v;

    .line 305
    .line 306
    new-instance v0, Landroidx/compose/foundation/gestures/TapGestureDetectorKt$detectTapGestures$2$1$2;

    .line 307
    .line 308
    iget-object v1, v3, Landroidx/compose/foundation/gestures/TapGestureDetectorKt$detectTapGestures$2$1;->$pressScope:Landroidx/compose/foundation/gestures/PressGestureScopeImpl;

    .line 309
    .line 310
    invoke-direct {v0, v1, v9}, Landroidx/compose/foundation/gestures/TapGestureDetectorKt$detectTapGestures$2$1$2;-><init>(Landroidx/compose/foundation/gestures/PressGestureScopeImpl;Lh6/c;)V

    .line 311
    .line 312
    .line 313
    const/16 v17, 0x2

    .line 314
    .line 315
    const/16 v18, 0x0

    .line 316
    .line 317
    const/4 v15, 0x0

    .line 318
    move-object/from16 v16, v0

    .line 319
    .line 320
    invoke-static/range {v13 .. v18}, Landroidx/compose/foundation/gestures/TapGestureDetectorKt;->launchAwaitingReset$default(Lkotlinx/coroutines/v;Lkotlinx/coroutines/w0;Lkotlinx/coroutines/CoroutineStart;Lr6/e;ILjava/lang/Object;)Lkotlinx/coroutines/w0;

    .line 321
    .line 322
    .line 323
    return-object v7

    .line 324
    :cond_6
    instance-of v1, v0, Landroidx/compose/foundation/gestures/LongPressResult$Released;

    .line 325
    .line 326
    if-eqz v1, :cond_7

    .line 327
    .line 328
    check-cast v0, Landroidx/compose/foundation/gestures/LongPressResult$Released;

    .line 329
    .line 330
    invoke-virtual {v0}, Landroidx/compose/foundation/gestures/LongPressResult$Released;->getFinalUpChange()Landroidx/compose/ui/input/pointer/PointerInputChange;

    .line 331
    .line 332
    .line 333
    move-result-object v0

    .line 334
    goto :goto_5

    .line 335
    :cond_7
    instance-of v0, v0, Landroidx/compose/foundation/gestures/LongPressResult$Canceled;

    .line 336
    .line 337
    if-eqz v0, :cond_16

    .line 338
    .line 339
    move-object v0, v9

    .line 340
    :goto_5
    move-object v1, v2

    .line 341
    goto :goto_2

    .line 342
    :goto_6
    if-nez v0, :cond_8

    .line 343
    .line 344
    iget-object v10, v3, Landroidx/compose/foundation/gestures/TapGestureDetectorKt$detectTapGestures$2$1;->$$this$coroutineScope:Lkotlinx/coroutines/v;

    .line 345
    .line 346
    new-instance v13, Landroidx/compose/foundation/gestures/TapGestureDetectorKt$detectTapGestures$2$1$3;

    .line 347
    .line 348
    iget-object v2, v3, Landroidx/compose/foundation/gestures/TapGestureDetectorKt$detectTapGestures$2$1;->$pressScope:Landroidx/compose/foundation/gestures/PressGestureScopeImpl;

    .line 349
    .line 350
    invoke-direct {v13, v2, v9}, Landroidx/compose/foundation/gestures/TapGestureDetectorKt$detectTapGestures$2$1$3;-><init>(Landroidx/compose/foundation/gestures/PressGestureScopeImpl;Lh6/c;)V

    .line 351
    .line 352
    .line 353
    const/4 v14, 0x2

    .line 354
    const/4 v15, 0x0

    .line 355
    const/4 v12, 0x0

    .line 356
    invoke-static/range {v10 .. v15}, Landroidx/compose/foundation/gestures/TapGestureDetectorKt;->launchAwaitingReset$default(Lkotlinx/coroutines/v;Lkotlinx/coroutines/w0;Lkotlinx/coroutines/CoroutineStart;Lr6/e;ILjava/lang/Object;)Lkotlinx/coroutines/w0;

    .line 357
    .line 358
    .line 359
    move-result-object v2

    .line 360
    goto :goto_7

    .line 361
    :cond_8
    invoke-virtual {v0}, Landroidx/compose/ui/input/pointer/PointerInputChange;->consume()V

    .line 362
    .line 363
    .line 364
    iget-object v10, v3, Landroidx/compose/foundation/gestures/TapGestureDetectorKt$detectTapGestures$2$1;->$$this$coroutineScope:Lkotlinx/coroutines/v;

    .line 365
    .line 366
    new-instance v13, Landroidx/compose/foundation/gestures/TapGestureDetectorKt$detectTapGestures$2$1$4;

    .line 367
    .line 368
    iget-object v2, v3, Landroidx/compose/foundation/gestures/TapGestureDetectorKt$detectTapGestures$2$1;->$pressScope:Landroidx/compose/foundation/gestures/PressGestureScopeImpl;

    .line 369
    .line 370
    invoke-direct {v13, v2, v9}, Landroidx/compose/foundation/gestures/TapGestureDetectorKt$detectTapGestures$2$1$4;-><init>(Landroidx/compose/foundation/gestures/PressGestureScopeImpl;Lh6/c;)V

    .line 371
    .line 372
    .line 373
    const/4 v14, 0x2

    .line 374
    const/4 v15, 0x0

    .line 375
    const/4 v12, 0x0

    .line 376
    invoke-static/range {v10 .. v15}, Landroidx/compose/foundation/gestures/TapGestureDetectorKt;->launchAwaitingReset$default(Lkotlinx/coroutines/v;Lkotlinx/coroutines/w0;Lkotlinx/coroutines/CoroutineStart;Lr6/e;ILjava/lang/Object;)Lkotlinx/coroutines/w0;

    .line 377
    .line 378
    .line 379
    move-result-object v2

    .line 380
    :goto_7
    if-eqz v0, :cond_15

    .line 381
    .line 382
    iget-object v4, v3, Landroidx/compose/foundation/gestures/TapGestureDetectorKt$detectTapGestures$2$1;->$onDoubleTap:Lr6/c;

    .line 383
    .line 384
    if-nez v4, :cond_9

    .line 385
    .line 386
    iget-object v1, v3, Landroidx/compose/foundation/gestures/TapGestureDetectorKt$detectTapGestures$2$1;->$onTap:Lr6/c;

    .line 387
    .line 388
    if-eqz v1, :cond_15

    .line 389
    .line 390
    invoke-virtual {v0}, Landroidx/compose/ui/input/pointer/PointerInputChange;->getPosition-F1C5BW0()J

    .line 391
    .line 392
    .line 393
    move-result-wide v4

    .line 394
    invoke-static {v4, v5}, Landroidx/compose/ui/geometry/Offset;->box-impl(J)Landroidx/compose/ui/geometry/Offset;

    .line 395
    .line 396
    .line 397
    move-result-object v0

    .line 398
    invoke-interface {v1, v0}, Lr6/c;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 399
    .line 400
    .line 401
    return-object v7

    .line 402
    :cond_9
    iput-object v1, v3, Landroidx/compose/foundation/gestures/TapGestureDetectorKt$detectTapGestures$2$1;->L$0:Ljava/lang/Object;

    .line 403
    .line 404
    iput-object v0, v3, Landroidx/compose/foundation/gestures/TapGestureDetectorKt$detectTapGestures$2$1;->L$1:Ljava/lang/Object;

    .line 405
    .line 406
    iput-object v2, v3, Landroidx/compose/foundation/gestures/TapGestureDetectorKt$detectTapGestures$2$1;->L$2:Ljava/lang/Object;

    .line 407
    .line 408
    const/4 v4, 0x5

    .line 409
    iput v4, v3, Landroidx/compose/foundation/gestures/TapGestureDetectorKt$detectTapGestures$2$1;->label:I

    .line 410
    .line 411
    invoke-static {v1, v0, v3}, Landroidx/compose/foundation/gestures/TapGestureDetectorKt;->access$awaitSecondDown(Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;Landroidx/compose/ui/input/pointer/PointerInputChange;Lh6/c;)Ljava/lang/Object;

    .line 412
    .line 413
    .line 414
    move-result-object v4

    .line 415
    if-ne v4, v6, :cond_a

    .line 416
    .line 417
    goto/16 :goto_c

    .line 418
    .line 419
    :cond_a
    move-object/from16 v21, v1

    .line 420
    .line 421
    move-object v1, v0

    .line 422
    move-object v0, v2

    .line 423
    move-object/from16 v2, v21

    .line 424
    .line 425
    :goto_8
    check-cast v4, Landroidx/compose/ui/input/pointer/PointerInputChange;

    .line 426
    .line 427
    if-nez v4, :cond_b

    .line 428
    .line 429
    iget-object v0, v3, Landroidx/compose/foundation/gestures/TapGestureDetectorKt$detectTapGestures$2$1;->$onTap:Lr6/c;

    .line 430
    .line 431
    if-eqz v0, :cond_15

    .line 432
    .line 433
    invoke-virtual {v1}, Landroidx/compose/ui/input/pointer/PointerInputChange;->getPosition-F1C5BW0()J

    .line 434
    .line 435
    .line 436
    move-result-wide v1

    .line 437
    invoke-static {v1, v2}, Landroidx/compose/ui/geometry/Offset;->box-impl(J)Landroidx/compose/ui/geometry/Offset;

    .line 438
    .line 439
    .line 440
    move-result-object v1

    .line 441
    invoke-interface {v0, v1}, Lr6/c;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 442
    .line 443
    .line 444
    return-object v7

    .line 445
    :cond_b
    iget-object v5, v3, Landroidx/compose/foundation/gestures/TapGestureDetectorKt$detectTapGestures$2$1;->$$this$coroutineScope:Lkotlinx/coroutines/v;

    .line 446
    .line 447
    invoke-static {}, Landroidx/compose/foundation/gestures/TapGestureDetectorKt;->access$getCoroutineStartForCurrentDispatchBehavior()Lkotlinx/coroutines/CoroutineStart;

    .line 448
    .line 449
    .line 450
    move-result-object v10

    .line 451
    new-instance v11, Landroidx/compose/foundation/gestures/TapGestureDetectorKt$detectTapGestures$2$1$5;

    .line 452
    .line 453
    iget-object v12, v3, Landroidx/compose/foundation/gestures/TapGestureDetectorKt$detectTapGestures$2$1;->$pressScope:Landroidx/compose/foundation/gestures/PressGestureScopeImpl;

    .line 454
    .line 455
    invoke-direct {v11, v0, v12, v9}, Landroidx/compose/foundation/gestures/TapGestureDetectorKt$detectTapGestures$2$1$5;-><init>(Lkotlinx/coroutines/w0;Landroidx/compose/foundation/gestures/PressGestureScopeImpl;Lh6/c;)V

    .line 456
    .line 457
    .line 458
    invoke-static {v5, v9, v10, v11, v8}, Lkotlinx/coroutines/x;->v(Lkotlinx/coroutines/v;Lh6/h;Lkotlinx/coroutines/CoroutineStart;Lr6/e;I)Lkotlinx/coroutines/k1;

    .line 459
    .line 460
    .line 461
    move-result-object v14

    .line 462
    iget-object v0, v3, Landroidx/compose/foundation/gestures/TapGestureDetectorKt$detectTapGestures$2$1;->$onPress:Lr6/f;

    .line 463
    .line 464
    invoke-static {}, Landroidx/compose/foundation/gestures/TapGestureDetectorKt;->access$getNoPressGesture$p()Lr6/f;

    .line 465
    .line 466
    .line 467
    move-result-object v5

    .line 468
    if-eq v0, v5, :cond_c

    .line 469
    .line 470
    iget-object v13, v3, Landroidx/compose/foundation/gestures/TapGestureDetectorKt$detectTapGestures$2$1;->$$this$coroutineScope:Lkotlinx/coroutines/v;

    .line 471
    .line 472
    new-instance v0, Landroidx/compose/foundation/gestures/TapGestureDetectorKt$detectTapGestures$2$1$6;

    .line 473
    .line 474
    iget-object v5, v3, Landroidx/compose/foundation/gestures/TapGestureDetectorKt$detectTapGestures$2$1;->$onPress:Lr6/f;

    .line 475
    .line 476
    iget-object v10, v3, Landroidx/compose/foundation/gestures/TapGestureDetectorKt$detectTapGestures$2$1;->$pressScope:Landroidx/compose/foundation/gestures/PressGestureScopeImpl;

    .line 477
    .line 478
    invoke-direct {v0, v5, v10, v4, v9}, Landroidx/compose/foundation/gestures/TapGestureDetectorKt$detectTapGestures$2$1$6;-><init>(Lr6/f;Landroidx/compose/foundation/gestures/PressGestureScopeImpl;Landroidx/compose/ui/input/pointer/PointerInputChange;Lh6/c;)V

    .line 479
    .line 480
    .line 481
    const/16 v17, 0x2

    .line 482
    .line 483
    const/16 v18, 0x0

    .line 484
    .line 485
    const/4 v15, 0x0

    .line 486
    move-object/from16 v16, v0

    .line 487
    .line 488
    invoke-static/range {v13 .. v18}, Landroidx/compose/foundation/gestures/TapGestureDetectorKt;->launchAwaitingReset$default(Lkotlinx/coroutines/v;Lkotlinx/coroutines/w0;Lkotlinx/coroutines/CoroutineStart;Lr6/e;ILjava/lang/Object;)Lkotlinx/coroutines/w0;

    .line 489
    .line 490
    .line 491
    :cond_c
    iget-object v0, v3, Landroidx/compose/foundation/gestures/TapGestureDetectorKt$detectTapGestures$2$1;->$onLongPress:Lr6/c;

    .line 492
    .line 493
    if-nez v0, :cond_e

    .line 494
    .line 495
    iput-object v14, v3, Landroidx/compose/foundation/gestures/TapGestureDetectorKt$detectTapGestures$2$1;->L$0:Ljava/lang/Object;

    .line 496
    .line 497
    iput-object v1, v3, Landroidx/compose/foundation/gestures/TapGestureDetectorKt$detectTapGestures$2$1;->L$1:Ljava/lang/Object;

    .line 498
    .line 499
    iput-object v9, v3, Landroidx/compose/foundation/gestures/TapGestureDetectorKt$detectTapGestures$2$1;->L$2:Ljava/lang/Object;

    .line 500
    .line 501
    const/4 v0, 0x6

    .line 502
    iput v0, v3, Landroidx/compose/foundation/gestures/TapGestureDetectorKt$detectTapGestures$2$1;->label:I

    .line 503
    .line 504
    invoke-static {v2, v9, v3, v8, v9}, Landroidx/compose/foundation/gestures/TapGestureDetectorKt;->waitForUpOrCancellation$default(Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;Landroidx/compose/ui/input/pointer/PointerEventPass;Lh6/c;ILjava/lang/Object;)Ljava/lang/Object;

    .line 505
    .line 506
    .line 507
    move-result-object v0

    .line 508
    if-ne v0, v6, :cond_d

    .line 509
    .line 510
    goto :goto_c

    .line 511
    :cond_d
    :goto_9
    check-cast v0, Landroidx/compose/ui/input/pointer/PointerInputChange;

    .line 512
    .line 513
    :goto_a
    move-object v11, v14

    .line 514
    goto :goto_e

    .line 515
    :cond_e
    iput-object v2, v3, Landroidx/compose/foundation/gestures/TapGestureDetectorKt$detectTapGestures$2$1;->L$0:Ljava/lang/Object;

    .line 516
    .line 517
    iput-object v14, v3, Landroidx/compose/foundation/gestures/TapGestureDetectorKt$detectTapGestures$2$1;->L$1:Ljava/lang/Object;

    .line 518
    .line 519
    iput-object v1, v3, Landroidx/compose/foundation/gestures/TapGestureDetectorKt$detectTapGestures$2$1;->L$2:Ljava/lang/Object;

    .line 520
    .line 521
    iput-object v4, v3, Landroidx/compose/foundation/gestures/TapGestureDetectorKt$detectTapGestures$2$1;->L$3:Ljava/lang/Object;

    .line 522
    .line 523
    const/4 v0, 0x7

    .line 524
    iput v0, v3, Landroidx/compose/foundation/gestures/TapGestureDetectorKt$detectTapGestures$2$1;->label:I

    .line 525
    .line 526
    invoke-static {v2, v9, v3, v8, v9}, Landroidx/compose/foundation/gestures/TapGestureDetectorKt;->waitForLongPress$default(Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;Landroidx/compose/ui/input/pointer/PointerEventPass;Lh6/c;ILjava/lang/Object;)Ljava/lang/Object;

    .line 527
    .line 528
    .line 529
    move-result-object v0

    .line 530
    if-ne v0, v6, :cond_f

    .line 531
    .line 532
    goto :goto_c

    .line 533
    :cond_f
    :goto_b
    check-cast v0, Landroidx/compose/foundation/gestures/LongPressResult;

    .line 534
    .line 535
    sget-object v5, Landroidx/compose/foundation/gestures/LongPressResult$Success;->INSTANCE:Landroidx/compose/foundation/gestures/LongPressResult$Success;

    .line 536
    .line 537
    invoke-static {v0, v5}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 538
    .line 539
    .line 540
    move-result v5

    .line 541
    if-eqz v5, :cond_11

    .line 542
    .line 543
    iget-object v0, v3, Landroidx/compose/foundation/gestures/TapGestureDetectorKt$detectTapGestures$2$1;->$onLongPress:Lr6/c;

    .line 544
    .line 545
    invoke-virtual {v4}, Landroidx/compose/ui/input/pointer/PointerInputChange;->getPosition-F1C5BW0()J

    .line 546
    .line 547
    .line 548
    move-result-wide v4

    .line 549
    invoke-static {v4, v5}, Landroidx/compose/ui/geometry/Offset;->box-impl(J)Landroidx/compose/ui/geometry/Offset;

    .line 550
    .line 551
    .line 552
    move-result-object v1

    .line 553
    invoke-interface {v0, v1}, Lr6/c;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 554
    .line 555
    .line 556
    iput-object v14, v3, Landroidx/compose/foundation/gestures/TapGestureDetectorKt$detectTapGestures$2$1;->L$0:Ljava/lang/Object;

    .line 557
    .line 558
    iput-object v9, v3, Landroidx/compose/foundation/gestures/TapGestureDetectorKt$detectTapGestures$2$1;->L$1:Ljava/lang/Object;

    .line 559
    .line 560
    iput-object v9, v3, Landroidx/compose/foundation/gestures/TapGestureDetectorKt$detectTapGestures$2$1;->L$2:Ljava/lang/Object;

    .line 561
    .line 562
    iput-object v9, v3, Landroidx/compose/foundation/gestures/TapGestureDetectorKt$detectTapGestures$2$1;->L$3:Ljava/lang/Object;

    .line 563
    .line 564
    const/16 v0, 0x8

    .line 565
    .line 566
    iput v0, v3, Landroidx/compose/foundation/gestures/TapGestureDetectorKt$detectTapGestures$2$1;->label:I

    .line 567
    .line 568
    invoke-static {v2, v3}, Landroidx/compose/foundation/gestures/TapGestureDetectorKt;->access$consumeUntilUp(Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;Lh6/c;)Ljava/lang/Object;

    .line 569
    .line 570
    .line 571
    move-result-object v0

    .line 572
    if-ne v0, v6, :cond_10

    .line 573
    .line 574
    :goto_c
    return-object v6

    .line 575
    :cond_10
    move-object/from16 v16, v14

    .line 576
    .line 577
    :goto_d
    iget-object v15, v3, Landroidx/compose/foundation/gestures/TapGestureDetectorKt$detectTapGestures$2$1;->$$this$coroutineScope:Lkotlinx/coroutines/v;

    .line 578
    .line 579
    new-instance v0, Landroidx/compose/foundation/gestures/TapGestureDetectorKt$detectTapGestures$2$1$secondUp$1;

    .line 580
    .line 581
    iget-object v1, v3, Landroidx/compose/foundation/gestures/TapGestureDetectorKt$detectTapGestures$2$1;->$pressScope:Landroidx/compose/foundation/gestures/PressGestureScopeImpl;

    .line 582
    .line 583
    invoke-direct {v0, v1, v9}, Landroidx/compose/foundation/gestures/TapGestureDetectorKt$detectTapGestures$2$1$secondUp$1;-><init>(Landroidx/compose/foundation/gestures/PressGestureScopeImpl;Lh6/c;)V

    .line 584
    .line 585
    .line 586
    const/16 v19, 0x2

    .line 587
    .line 588
    const/16 v20, 0x0

    .line 589
    .line 590
    const/16 v17, 0x0

    .line 591
    .line 592
    move-object/from16 v18, v0

    .line 593
    .line 594
    invoke-static/range {v15 .. v20}, Landroidx/compose/foundation/gestures/TapGestureDetectorKt;->launchAwaitingReset$default(Lkotlinx/coroutines/v;Lkotlinx/coroutines/w0;Lkotlinx/coroutines/CoroutineStart;Lr6/e;ILjava/lang/Object;)Lkotlinx/coroutines/w0;

    .line 595
    .line 596
    .line 597
    return-object v7

    .line 598
    :cond_11
    instance-of v2, v0, Landroidx/compose/foundation/gestures/LongPressResult$Released;

    .line 599
    .line 600
    if-eqz v2, :cond_12

    .line 601
    .line 602
    check-cast v0, Landroidx/compose/foundation/gestures/LongPressResult$Released;

    .line 603
    .line 604
    invoke-virtual {v0}, Landroidx/compose/foundation/gestures/LongPressResult$Released;->getFinalUpChange()Landroidx/compose/ui/input/pointer/PointerInputChange;

    .line 605
    .line 606
    .line 607
    move-result-object v0

    .line 608
    goto :goto_a

    .line 609
    :cond_12
    instance-of v0, v0, Landroidx/compose/foundation/gestures/LongPressResult$Canceled;

    .line 610
    .line 611
    if-eqz v0, :cond_14

    .line 612
    .line 613
    move-object v0, v9

    .line 614
    goto :goto_a

    .line 615
    :goto_e
    if-eqz v0, :cond_13

    .line 616
    .line 617
    invoke-virtual {v0}, Landroidx/compose/ui/input/pointer/PointerInputChange;->consume()V

    .line 618
    .line 619
    .line 620
    iget-object v10, v3, Landroidx/compose/foundation/gestures/TapGestureDetectorKt$detectTapGestures$2$1;->$$this$coroutineScope:Lkotlinx/coroutines/v;

    .line 621
    .line 622
    new-instance v13, Landroidx/compose/foundation/gestures/TapGestureDetectorKt$detectTapGestures$2$1$7;

    .line 623
    .line 624
    iget-object v1, v3, Landroidx/compose/foundation/gestures/TapGestureDetectorKt$detectTapGestures$2$1;->$pressScope:Landroidx/compose/foundation/gestures/PressGestureScopeImpl;

    .line 625
    .line 626
    invoke-direct {v13, v1, v9}, Landroidx/compose/foundation/gestures/TapGestureDetectorKt$detectTapGestures$2$1$7;-><init>(Landroidx/compose/foundation/gestures/PressGestureScopeImpl;Lh6/c;)V

    .line 627
    .line 628
    .line 629
    const/4 v14, 0x2

    .line 630
    const/4 v15, 0x0

    .line 631
    const/4 v12, 0x0

    .line 632
    invoke-static/range {v10 .. v15}, Landroidx/compose/foundation/gestures/TapGestureDetectorKt;->launchAwaitingReset$default(Lkotlinx/coroutines/v;Lkotlinx/coroutines/w0;Lkotlinx/coroutines/CoroutineStart;Lr6/e;ILjava/lang/Object;)Lkotlinx/coroutines/w0;

    .line 633
    .line 634
    .line 635
    iget-object v1, v3, Landroidx/compose/foundation/gestures/TapGestureDetectorKt$detectTapGestures$2$1;->$onDoubleTap:Lr6/c;

    .line 636
    .line 637
    invoke-virtual {v0}, Landroidx/compose/ui/input/pointer/PointerInputChange;->getPosition-F1C5BW0()J

    .line 638
    .line 639
    .line 640
    move-result-wide v4

    .line 641
    invoke-static {v4, v5}, Landroidx/compose/ui/geometry/Offset;->box-impl(J)Landroidx/compose/ui/geometry/Offset;

    .line 642
    .line 643
    .line 644
    move-result-object v0

    .line 645
    invoke-interface {v1, v0}, Lr6/c;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 646
    .line 647
    .line 648
    return-object v7

    .line 649
    :cond_13
    iget-object v10, v3, Landroidx/compose/foundation/gestures/TapGestureDetectorKt$detectTapGestures$2$1;->$$this$coroutineScope:Lkotlinx/coroutines/v;

    .line 650
    .line 651
    new-instance v13, Landroidx/compose/foundation/gestures/TapGestureDetectorKt$detectTapGestures$2$1$8;

    .line 652
    .line 653
    iget-object v0, v3, Landroidx/compose/foundation/gestures/TapGestureDetectorKt$detectTapGestures$2$1;->$pressScope:Landroidx/compose/foundation/gestures/PressGestureScopeImpl;

    .line 654
    .line 655
    invoke-direct {v13, v0, v9}, Landroidx/compose/foundation/gestures/TapGestureDetectorKt$detectTapGestures$2$1$8;-><init>(Landroidx/compose/foundation/gestures/PressGestureScopeImpl;Lh6/c;)V

    .line 656
    .line 657
    .line 658
    const/4 v14, 0x2

    .line 659
    const/4 v15, 0x0

    .line 660
    const/4 v12, 0x0

    .line 661
    invoke-static/range {v10 .. v15}, Landroidx/compose/foundation/gestures/TapGestureDetectorKt;->launchAwaitingReset$default(Lkotlinx/coroutines/v;Lkotlinx/coroutines/w0;Lkotlinx/coroutines/CoroutineStart;Lr6/e;ILjava/lang/Object;)Lkotlinx/coroutines/w0;

    .line 662
    .line 663
    .line 664
    iget-object v0, v3, Landroidx/compose/foundation/gestures/TapGestureDetectorKt$detectTapGestures$2$1;->$onTap:Lr6/c;

    .line 665
    .line 666
    if-eqz v0, :cond_15

    .line 667
    .line 668
    invoke-virtual {v1}, Landroidx/compose/ui/input/pointer/PointerInputChange;->getPosition-F1C5BW0()J

    .line 669
    .line 670
    .line 671
    move-result-wide v1

    .line 672
    invoke-static {v1, v2}, Landroidx/compose/ui/geometry/Offset;->box-impl(J)Landroidx/compose/ui/geometry/Offset;

    .line 673
    .line 674
    .line 675
    move-result-object v1

    .line 676
    invoke-interface {v0, v1}, Lr6/c;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 677
    .line 678
    .line 679
    return-object v7

    .line 680
    :cond_14
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    .line 681
    .line 682
    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    .line 683
    .line 684
    .line 685
    throw v0

    .line 686
    :cond_15
    return-object v7

    .line 687
    :cond_16
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    .line 688
    .line 689
    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    .line 690
    .line 691
    .line 692
    throw v0

    .line 693
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
