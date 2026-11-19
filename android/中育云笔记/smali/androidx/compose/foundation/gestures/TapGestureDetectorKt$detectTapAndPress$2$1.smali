.class final Landroidx/compose/foundation/gestures/TapGestureDetectorKt$detectTapAndPress$2$1;
.super Lkotlin/coroutines/jvm/internal/RestrictedSuspendLambda;
.source "SourceFile"

# interfaces
.implements Lhd/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/foundation/gestures/TapGestureDetectorKt$detectTapAndPress$2;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/coroutines/jvm/internal/RestrictedSuspendLambda;",
        "Lhd/p;"
    }
.end annotation

.annotation runtime Lxc/d;
    c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapAndPress$2$1"
    f = "TapGestureDetector.kt"
    l = {
        0xfb,
        0x101
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field final synthetic $$this$coroutineScope:Lsd/i0;

.field final synthetic $onPress:Lhd/q;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lhd/q;"
        }
    .end annotation
.end field

.field final synthetic $onTap:Lhd/l;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lhd/l;"
        }
    .end annotation
.end field

.field final synthetic $pressScope:Landroidx/compose/foundation/gestures/PressGestureScopeImpl;

.field private synthetic L$0:Ljava/lang/Object;

.field L$1:Ljava/lang/Object;

.field label:I


# direct methods
.method public constructor <init>(Lsd/i0;Lhd/q;Lhd/l;Landroidx/compose/foundation/gestures/PressGestureScopeImpl;Lvc/c;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lsd/i0;",
            "Lhd/q;",
            "Lhd/l;",
            "Landroidx/compose/foundation/gestures/PressGestureScopeImpl;",
            "Lvc/c<",
            "-",
            "Landroidx/compose/foundation/gestures/TapGestureDetectorKt$detectTapAndPress$2$1;",
            ">;)V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Landroidx/compose/foundation/gestures/TapGestureDetectorKt$detectTapAndPress$2$1;->$$this$coroutineScope:Lsd/i0;

    .line 2
    .line 3
    iput-object p2, p0, Landroidx/compose/foundation/gestures/TapGestureDetectorKt$detectTapAndPress$2$1;->$onPress:Lhd/q;

    .line 4
    .line 5
    iput-object p3, p0, Landroidx/compose/foundation/gestures/TapGestureDetectorKt$detectTapAndPress$2$1;->$onTap:Lhd/l;

    .line 6
    .line 7
    iput-object p4, p0, Landroidx/compose/foundation/gestures/TapGestureDetectorKt$detectTapAndPress$2$1;->$pressScope:Landroidx/compose/foundation/gestures/PressGestureScopeImpl;

    .line 8
    .line 9
    const/4 p1, 0x2

    .line 10
    invoke-direct {p0, p1, p5}, Lkotlin/coroutines/jvm/internal/RestrictedSuspendLambda;-><init>(ILvc/c;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lvc/c;)Lvc/c;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            "Lvc/c<",
            "*>;)",
            "Lvc/c<",
            "Lqc/q;",
            ">;"
        }
    .end annotation

    .line 1
    new-instance v0, Landroidx/compose/foundation/gestures/TapGestureDetectorKt$detectTapAndPress$2$1;

    .line 2
    .line 3
    iget-object v1, p0, Landroidx/compose/foundation/gestures/TapGestureDetectorKt$detectTapAndPress$2$1;->$$this$coroutineScope:Lsd/i0;

    .line 4
    .line 5
    iget-object v2, p0, Landroidx/compose/foundation/gestures/TapGestureDetectorKt$detectTapAndPress$2$1;->$onPress:Lhd/q;

    .line 6
    .line 7
    iget-object v3, p0, Landroidx/compose/foundation/gestures/TapGestureDetectorKt$detectTapAndPress$2$1;->$onTap:Lhd/l;

    .line 8
    .line 9
    iget-object v4, p0, Landroidx/compose/foundation/gestures/TapGestureDetectorKt$detectTapAndPress$2$1;->$pressScope:Landroidx/compose/foundation/gestures/PressGestureScopeImpl;

    .line 10
    .line 11
    move-object v5, p2

    .line 12
    invoke-direct/range {v0 .. v5}, Landroidx/compose/foundation/gestures/TapGestureDetectorKt$detectTapAndPress$2$1;-><init>(Lsd/i0;Lhd/q;Lhd/l;Landroidx/compose/foundation/gestures/PressGestureScopeImpl;Lvc/c;)V

    .line 13
    .line 14
    .line 15
    iput-object p1, v0, Landroidx/compose/foundation/gestures/TapGestureDetectorKt$detectTapAndPress$2$1;->L$0:Ljava/lang/Object;

    .line 16
    .line 17
    return-object v0
.end method

.method public final invoke(Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;Lvc/c;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;",
            "Lvc/c<",
            "-",
            "Lqc/q;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0, p1, p2}, Landroidx/compose/foundation/gestures/TapGestureDetectorKt$detectTapAndPress$2$1;->create(Ljava/lang/Object;Lvc/c;)Lvc/c;

    move-result-object p1

    check-cast p1, Landroidx/compose/foundation/gestures/TapGestureDetectorKt$detectTapAndPress$2$1;

    sget-object p2, Lqc/q;->a:Lqc/q;

    invoke-virtual {p1, p2}, Landroidx/compose/foundation/gestures/TapGestureDetectorKt$detectTapAndPress$2$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;

    check-cast p2, Lvc/c;

    invoke-virtual {p0, p1, p2}, Landroidx/compose/foundation/gestures/TapGestureDetectorKt$detectTapAndPress$2$1;->invoke(Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;Lvc/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 16

    .line 1
    move-object/from16 v3, p0

    .line 2
    .line 3
    invoke-static {}, Lwc/a;->f()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v6

    .line 7
    iget v0, v3, Landroidx/compose/foundation/gestures/TapGestureDetectorKt$detectTapAndPress$2$1;->label:I

    .line 8
    .line 9
    const/4 v7, 0x2

    .line 10
    const/4 v8, 0x1

    .line 11
    const/4 v9, 0x0

    .line 12
    if-eqz v0, :cond_2

    .line 13
    .line 14
    if-eq v0, v8, :cond_1

    .line 15
    .line 16
    if-ne v0, v7, :cond_0

    .line 17
    .line 18
    iget-object v0, v3, Landroidx/compose/foundation/gestures/TapGestureDetectorKt$detectTapAndPress$2$1;->L$0:Ljava/lang/Object;

    .line 19
    .line 20
    check-cast v0, Lkotlinx/coroutines/g;

    .line 21
    .line 22
    invoke-static/range {p1 .. p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 23
    .line 24
    .line 25
    move-object v11, v0

    .line 26
    move-object/from16 v0, p1

    .line 27
    .line 28
    goto/16 :goto_2

    .line 29
    .line 30
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 31
    .line 32
    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    .line 33
    .line 34
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    throw v0

    .line 38
    :cond_1
    iget-object v0, v3, Landroidx/compose/foundation/gestures/TapGestureDetectorKt$detectTapAndPress$2$1;->L$1:Ljava/lang/Object;

    .line 39
    .line 40
    check-cast v0, Lkotlinx/coroutines/g;

    .line 41
    .line 42
    iget-object v1, v3, Landroidx/compose/foundation/gestures/TapGestureDetectorKt$detectTapAndPress$2$1;->L$0:Ljava/lang/Object;

    .line 43
    .line 44
    check-cast v1, Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;

    .line 45
    .line 46
    invoke-static/range {p1 .. p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 47
    .line 48
    .line 49
    move-object v11, v0

    .line 50
    move-object v0, v1

    .line 51
    move-object/from16 v1, p1

    .line 52
    .line 53
    goto :goto_0

    .line 54
    :cond_2
    invoke-static/range {p1 .. p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 55
    .line 56
    .line 57
    iget-object v0, v3, Landroidx/compose/foundation/gestures/TapGestureDetectorKt$detectTapAndPress$2$1;->L$0:Ljava/lang/Object;

    .line 58
    .line 59
    check-cast v0, Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;

    .line 60
    .line 61
    iget-object v10, v3, Landroidx/compose/foundation/gestures/TapGestureDetectorKt$detectTapAndPress$2$1;->$$this$coroutineScope:Lsd/i0;

    .line 62
    .line 63
    invoke-static {}, Landroidx/compose/foundation/gestures/TapGestureDetectorKt;->access$getCoroutineStartForCurrentDispatchBehavior()Lkotlinx/coroutines/CoroutineStart;

    .line 64
    .line 65
    .line 66
    move-result-object v12

    .line 67
    new-instance v13, Landroidx/compose/foundation/gestures/TapGestureDetectorKt$detectTapAndPress$2$1$resetJob$1;

    .line 68
    .line 69
    iget-object v1, v3, Landroidx/compose/foundation/gestures/TapGestureDetectorKt$detectTapAndPress$2$1;->$pressScope:Landroidx/compose/foundation/gestures/PressGestureScopeImpl;

    .line 70
    .line 71
    invoke-direct {v13, v1, v9}, Landroidx/compose/foundation/gestures/TapGestureDetectorKt$detectTapAndPress$2$1$resetJob$1;-><init>(Landroidx/compose/foundation/gestures/PressGestureScopeImpl;Lvc/c;)V

    .line 72
    .line 73
    .line 74
    const/4 v14, 0x1

    .line 75
    const/4 v15, 0x0

    .line 76
    const/4 v11, 0x0

    .line 77
    invoke-static/range {v10 .. v15}, Lsd/f;->d(Lsd/i0;Lkotlin/coroutines/d;Lkotlinx/coroutines/CoroutineStart;Lhd/p;ILjava/lang/Object;)Lkotlinx/coroutines/g;

    .line 78
    .line 79
    .line 80
    move-result-object v10

    .line 81
    iput-object v0, v3, Landroidx/compose/foundation/gestures/TapGestureDetectorKt$detectTapAndPress$2$1;->L$0:Ljava/lang/Object;

    .line 82
    .line 83
    iput-object v10, v3, Landroidx/compose/foundation/gestures/TapGestureDetectorKt$detectTapAndPress$2$1;->L$1:Ljava/lang/Object;

    .line 84
    .line 85
    iput v8, v3, Landroidx/compose/foundation/gestures/TapGestureDetectorKt$detectTapAndPress$2$1;->label:I

    .line 86
    .line 87
    const/4 v1, 0x0

    .line 88
    const/4 v2, 0x0

    .line 89
    const/4 v4, 0x3

    .line 90
    const/4 v5, 0x0

    .line 91
    invoke-static/range {v0 .. v5}, Landroidx/compose/foundation/gestures/TapGestureDetectorKt;->awaitFirstDown$default(Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;ZLandroidx/compose/ui/input/pointer/PointerEventPass;Lvc/c;ILjava/lang/Object;)Ljava/lang/Object;

    .line 92
    .line 93
    .line 94
    move-result-object v1

    .line 95
    if-ne v1, v6, :cond_3

    .line 96
    .line 97
    goto :goto_1

    .line 98
    :cond_3
    move-object v11, v10

    .line 99
    :goto_0
    check-cast v1, Landroidx/compose/ui/input/pointer/PointerInputChange;

    .line 100
    .line 101
    invoke-virtual {v1}, Landroidx/compose/ui/input/pointer/PointerInputChange;->consume()V

    .line 102
    .line 103
    .line 104
    iget-object v2, v3, Landroidx/compose/foundation/gestures/TapGestureDetectorKt$detectTapAndPress$2$1;->$onPress:Lhd/q;

    .line 105
    .line 106
    invoke-static {}, Landroidx/compose/foundation/gestures/TapGestureDetectorKt;->access$getNoPressGesture$p()Lhd/q;

    .line 107
    .line 108
    .line 109
    move-result-object v4

    .line 110
    if-eq v2, v4, :cond_4

    .line 111
    .line 112
    iget-object v10, v3, Landroidx/compose/foundation/gestures/TapGestureDetectorKt$detectTapAndPress$2$1;->$$this$coroutineScope:Lsd/i0;

    .line 113
    .line 114
    new-instance v13, Landroidx/compose/foundation/gestures/TapGestureDetectorKt$detectTapAndPress$2$1$1;

    .line 115
    .line 116
    iget-object v2, v3, Landroidx/compose/foundation/gestures/TapGestureDetectorKt$detectTapAndPress$2$1;->$onPress:Lhd/q;

    .line 117
    .line 118
    iget-object v4, v3, Landroidx/compose/foundation/gestures/TapGestureDetectorKt$detectTapAndPress$2$1;->$pressScope:Landroidx/compose/foundation/gestures/PressGestureScopeImpl;

    .line 119
    .line 120
    invoke-direct {v13, v2, v4, v1, v9}, Landroidx/compose/foundation/gestures/TapGestureDetectorKt$detectTapAndPress$2$1$1;-><init>(Lhd/q;Landroidx/compose/foundation/gestures/PressGestureScopeImpl;Landroidx/compose/ui/input/pointer/PointerInputChange;Lvc/c;)V

    .line 121
    .line 122
    .line 123
    const/4 v14, 0x2

    .line 124
    const/4 v15, 0x0

    .line 125
    const/4 v12, 0x0

    .line 126
    invoke-static/range {v10 .. v15}, Landroidx/compose/foundation/gestures/TapGestureDetectorKt;->launchAwaitingReset$default(Lsd/i0;Lkotlinx/coroutines/g;Lkotlinx/coroutines/CoroutineStart;Lhd/p;ILjava/lang/Object;)Lkotlinx/coroutines/g;

    .line 127
    .line 128
    .line 129
    :cond_4
    iput-object v11, v3, Landroidx/compose/foundation/gestures/TapGestureDetectorKt$detectTapAndPress$2$1;->L$0:Ljava/lang/Object;

    .line 130
    .line 131
    iput-object v9, v3, Landroidx/compose/foundation/gestures/TapGestureDetectorKt$detectTapAndPress$2$1;->L$1:Ljava/lang/Object;

    .line 132
    .line 133
    iput v7, v3, Landroidx/compose/foundation/gestures/TapGestureDetectorKt$detectTapAndPress$2$1;->label:I

    .line 134
    .line 135
    invoke-static {v0, v9, v3, v8, v9}, Landroidx/compose/foundation/gestures/TapGestureDetectorKt;->waitForUpOrCancellation$default(Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;Landroidx/compose/ui/input/pointer/PointerEventPass;Lvc/c;ILjava/lang/Object;)Ljava/lang/Object;

    .line 136
    .line 137
    .line 138
    move-result-object v0

    .line 139
    if-ne v0, v6, :cond_5

    .line 140
    .line 141
    :goto_1
    return-object v6

    .line 142
    :cond_5
    :goto_2
    check-cast v0, Landroidx/compose/ui/input/pointer/PointerInputChange;

    .line 143
    .line 144
    if-nez v0, :cond_6

    .line 145
    .line 146
    iget-object v10, v3, Landroidx/compose/foundation/gestures/TapGestureDetectorKt$detectTapAndPress$2$1;->$$this$coroutineScope:Lsd/i0;

    .line 147
    .line 148
    new-instance v13, Landroidx/compose/foundation/gestures/TapGestureDetectorKt$detectTapAndPress$2$1$2;

    .line 149
    .line 150
    iget-object v0, v3, Landroidx/compose/foundation/gestures/TapGestureDetectorKt$detectTapAndPress$2$1;->$pressScope:Landroidx/compose/foundation/gestures/PressGestureScopeImpl;

    .line 151
    .line 152
    invoke-direct {v13, v0, v9}, Landroidx/compose/foundation/gestures/TapGestureDetectorKt$detectTapAndPress$2$1$2;-><init>(Landroidx/compose/foundation/gestures/PressGestureScopeImpl;Lvc/c;)V

    .line 153
    .line 154
    .line 155
    const/4 v14, 0x2

    .line 156
    const/4 v15, 0x0

    .line 157
    const/4 v12, 0x0

    .line 158
    invoke-static/range {v10 .. v15}, Landroidx/compose/foundation/gestures/TapGestureDetectorKt;->launchAwaitingReset$default(Lsd/i0;Lkotlinx/coroutines/g;Lkotlinx/coroutines/CoroutineStart;Lhd/p;ILjava/lang/Object;)Lkotlinx/coroutines/g;

    .line 159
    .line 160
    .line 161
    goto :goto_3

    .line 162
    :cond_6
    invoke-virtual {v0}, Landroidx/compose/ui/input/pointer/PointerInputChange;->consume()V

    .line 163
    .line 164
    .line 165
    iget-object v10, v3, Landroidx/compose/foundation/gestures/TapGestureDetectorKt$detectTapAndPress$2$1;->$$this$coroutineScope:Lsd/i0;

    .line 166
    .line 167
    new-instance v13, Landroidx/compose/foundation/gestures/TapGestureDetectorKt$detectTapAndPress$2$1$3;

    .line 168
    .line 169
    iget-object v1, v3, Landroidx/compose/foundation/gestures/TapGestureDetectorKt$detectTapAndPress$2$1;->$pressScope:Landroidx/compose/foundation/gestures/PressGestureScopeImpl;

    .line 170
    .line 171
    invoke-direct {v13, v1, v9}, Landroidx/compose/foundation/gestures/TapGestureDetectorKt$detectTapAndPress$2$1$3;-><init>(Landroidx/compose/foundation/gestures/PressGestureScopeImpl;Lvc/c;)V

    .line 172
    .line 173
    .line 174
    const/4 v14, 0x2

    .line 175
    const/4 v15, 0x0

    .line 176
    const/4 v12, 0x0

    .line 177
    invoke-static/range {v10 .. v15}, Landroidx/compose/foundation/gestures/TapGestureDetectorKt;->launchAwaitingReset$default(Lsd/i0;Lkotlinx/coroutines/g;Lkotlinx/coroutines/CoroutineStart;Lhd/p;ILjava/lang/Object;)Lkotlinx/coroutines/g;

    .line 178
    .line 179
    .line 180
    iget-object v1, v3, Landroidx/compose/foundation/gestures/TapGestureDetectorKt$detectTapAndPress$2$1;->$onTap:Lhd/l;

    .line 181
    .line 182
    if-eqz v1, :cond_7

    .line 183
    .line 184
    invoke-virtual {v0}, Landroidx/compose/ui/input/pointer/PointerInputChange;->getPosition-F1C5BW0()J

    .line 185
    .line 186
    .line 187
    move-result-wide v4

    .line 188
    invoke-static {v4, v5}, Landroidx/compose/ui/geometry/Offset;->box-impl(J)Landroidx/compose/ui/geometry/Offset;

    .line 189
    .line 190
    .line 191
    move-result-object v0

    .line 192
    invoke-interface {v1, v0}, Lhd/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 193
    .line 194
    .line 195
    :cond_7
    :goto_3
    sget-object v0, Lqc/q;->a:Lqc/q;

    .line 196
    .line 197
    return-object v0
.end method
