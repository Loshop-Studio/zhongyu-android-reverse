.class final Landroidx/compose/foundation/gestures/TransformableKt$detectZoomByCtrlMouseScroll$2;
.super Lkotlin/coroutines/jvm/internal/RestrictedSuspendLambda;
.source "SourceFile"

# interfaces
.implements Lhd/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/foundation/gestures/TransformableKt;->detectZoomByCtrlMouseScroll(Landroidx/compose/ui/input/pointer/PointerInputScope;Lkotlinx/coroutines/channels/a;Landroidx/compose/foundation/gestures/ScrollConfig;Lvc/c;)Ljava/lang/Object;
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
    c = "androidx.compose.foundation.gestures.TransformableKt$detectZoomByCtrlMouseScroll$2"
    f = "Transformable.kt"
    l = {
        0x110,
        0x11c
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field final synthetic $channel:Lkotlinx/coroutines/channels/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlinx/coroutines/channels/a;"
        }
    .end annotation
.end field

.field final synthetic $currentContext:Lkotlin/coroutines/d;

.field final synthetic $scrollConfig:Landroidx/compose/foundation/gestures/ScrollConfig;

.field private synthetic L$0:Ljava/lang/Object;

.field label:I


# direct methods
.method public constructor <init>(Lkotlin/coroutines/d;Landroidx/compose/foundation/gestures/ScrollConfig;Lkotlinx/coroutines/channels/a;Lvc/c;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/coroutines/d;",
            "Landroidx/compose/foundation/gestures/ScrollConfig;",
            "Lkotlinx/coroutines/channels/a;",
            "Lvc/c<",
            "-",
            "Landroidx/compose/foundation/gestures/TransformableKt$detectZoomByCtrlMouseScroll$2;",
            ">;)V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Landroidx/compose/foundation/gestures/TransformableKt$detectZoomByCtrlMouseScroll$2;->$currentContext:Lkotlin/coroutines/d;

    .line 2
    .line 3
    iput-object p2, p0, Landroidx/compose/foundation/gestures/TransformableKt$detectZoomByCtrlMouseScroll$2;->$scrollConfig:Landroidx/compose/foundation/gestures/ScrollConfig;

    .line 4
    .line 5
    iput-object p3, p0, Landroidx/compose/foundation/gestures/TransformableKt$detectZoomByCtrlMouseScroll$2;->$channel:Lkotlinx/coroutines/channels/a;

    .line 6
    .line 7
    const/4 p1, 0x2

    .line 8
    invoke-direct {p0, p1, p4}, Lkotlin/coroutines/jvm/internal/RestrictedSuspendLambda;-><init>(ILvc/c;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lvc/c;)Lvc/c;
    .locals 4
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
    new-instance v0, Landroidx/compose/foundation/gestures/TransformableKt$detectZoomByCtrlMouseScroll$2;

    .line 2
    .line 3
    iget-object v1, p0, Landroidx/compose/foundation/gestures/TransformableKt$detectZoomByCtrlMouseScroll$2;->$currentContext:Lkotlin/coroutines/d;

    .line 4
    .line 5
    iget-object v2, p0, Landroidx/compose/foundation/gestures/TransformableKt$detectZoomByCtrlMouseScroll$2;->$scrollConfig:Landroidx/compose/foundation/gestures/ScrollConfig;

    .line 6
    .line 7
    iget-object v3, p0, Landroidx/compose/foundation/gestures/TransformableKt$detectZoomByCtrlMouseScroll$2;->$channel:Lkotlinx/coroutines/channels/a;

    .line 8
    .line 9
    invoke-direct {v0, v1, v2, v3, p2}, Landroidx/compose/foundation/gestures/TransformableKt$detectZoomByCtrlMouseScroll$2;-><init>(Lkotlin/coroutines/d;Landroidx/compose/foundation/gestures/ScrollConfig;Lkotlinx/coroutines/channels/a;Lvc/c;)V

    .line 10
    .line 11
    .line 12
    iput-object p1, v0, Landroidx/compose/foundation/gestures/TransformableKt$detectZoomByCtrlMouseScroll$2;->L$0:Ljava/lang/Object;

    .line 13
    .line 14
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
    invoke-virtual {p0, p1, p2}, Landroidx/compose/foundation/gestures/TransformableKt$detectZoomByCtrlMouseScroll$2;->create(Ljava/lang/Object;Lvc/c;)Lvc/c;

    move-result-object p1

    check-cast p1, Landroidx/compose/foundation/gestures/TransformableKt$detectZoomByCtrlMouseScroll$2;

    sget-object p2, Lqc/q;->a:Lqc/q;

    invoke-virtual {p1, p2}, Landroidx/compose/foundation/gestures/TransformableKt$detectZoomByCtrlMouseScroll$2;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;

    check-cast p2, Lvc/c;

    invoke-virtual {p0, p1, p2}, Landroidx/compose/foundation/gestures/TransformableKt$detectZoomByCtrlMouseScroll$2;->invoke(Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;Lvc/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 12

    .line 1
    invoke-static {}, Lwc/a;->f()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget v1, p0, Landroidx/compose/foundation/gestures/TransformableKt$detectZoomByCtrlMouseScroll$2;->label:I

    .line 6
    .line 7
    const/4 v2, 0x2

    .line 8
    const/4 v3, 0x1

    .line 9
    if-eqz v1, :cond_2

    .line 10
    .line 11
    if-eq v1, v3, :cond_1

    .line 12
    .line 13
    if-ne v1, v2, :cond_0

    .line 14
    .line 15
    iget-object v1, p0, Landroidx/compose/foundation/gestures/TransformableKt$detectZoomByCtrlMouseScroll$2;->L$0:Ljava/lang/Object;

    .line 16
    .line 17
    check-cast v1, Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;

    .line 18
    .line 19
    :try_start_0
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 20
    .line 21
    .line 22
    goto/16 :goto_4

    .line 23
    .line 24
    :catchall_0
    move-exception v0

    .line 25
    move-object p1, v0

    .line 26
    goto/16 :goto_5

    .line 27
    .line 28
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 29
    .line 30
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 31
    .line 32
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    throw p1

    .line 36
    :cond_1
    iget-object v1, p0, Landroidx/compose/foundation/gestures/TransformableKt$detectZoomByCtrlMouseScroll$2;->L$0:Ljava/lang/Object;

    .line 37
    .line 38
    check-cast v1, Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;

    .line 39
    .line 40
    :try_start_1
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 41
    .line 42
    .line 43
    goto :goto_1

    .line 44
    :cond_2
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 45
    .line 46
    .line 47
    iget-object p1, p0, Landroidx/compose/foundation/gestures/TransformableKt$detectZoomByCtrlMouseScroll$2;->L$0:Ljava/lang/Object;

    .line 48
    .line 49
    check-cast p1, Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;

    .line 50
    .line 51
    move-object v1, p1

    .line 52
    :goto_0
    iget-object p1, p0, Landroidx/compose/foundation/gestures/TransformableKt$detectZoomByCtrlMouseScroll$2;->$currentContext:Lkotlin/coroutines/d;

    .line 53
    .line 54
    invoke-static {p1}, Lsd/o1;->n(Lkotlin/coroutines/d;)Z

    .line 55
    .line 56
    .line 57
    move-result p1

    .line 58
    if-eqz p1, :cond_6

    .line 59
    .line 60
    :try_start_2
    iget-object p1, p0, Landroidx/compose/foundation/gestures/TransformableKt$detectZoomByCtrlMouseScroll$2;->$scrollConfig:Landroidx/compose/foundation/gestures/ScrollConfig;

    .line 61
    .line 62
    iput-object v1, p0, Landroidx/compose/foundation/gestures/TransformableKt$detectZoomByCtrlMouseScroll$2;->L$0:Ljava/lang/Object;

    .line 63
    .line 64
    iput v3, p0, Landroidx/compose/foundation/gestures/TransformableKt$detectZoomByCtrlMouseScroll$2;->label:I

    .line 65
    .line 66
    invoke-static {v1, p1, p0}, Landroidx/compose/foundation/gestures/TransformableKt;->access$awaitFirstCtrlMouseScroll(Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;Landroidx/compose/foundation/gestures/ScrollConfig;Lvc/c;)Ljava/lang/Object;

    .line 67
    .line 68
    .line 69
    move-result-object p1

    .line 70
    if-ne p1, v0, :cond_3

    .line 71
    .line 72
    goto :goto_3

    .line 73
    :cond_3
    :goto_1
    check-cast p1, Landroidx/compose/ui/geometry/Offset;

    .line 74
    .line 75
    invoke-virtual {p1}, Landroidx/compose/ui/geometry/Offset;->unbox-impl()J

    .line 76
    .line 77
    .line 78
    move-result-wide v4

    .line 79
    iget-object p1, p0, Landroidx/compose/foundation/gestures/TransformableKt$detectZoomByCtrlMouseScroll$2;->$channel:Lkotlinx/coroutines/channels/a;

    .line 80
    .line 81
    sget-object v6, Landroidx/compose/foundation/gestures/TransformEvent$TransformStarted;->INSTANCE:Landroidx/compose/foundation/gestures/TransformEvent$TransformStarted;

    .line 82
    .line 83
    invoke-interface {p1, v6}, Lkotlinx/coroutines/channels/f;->trySend-JP2dKIU(Ljava/lang/Object;)Ljava/lang/Object;

    .line 84
    .line 85
    .line 86
    :goto_2
    const-wide v6, 0xffffffffL

    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    and-long/2addr v4, v6

    .line 92
    long-to-int p1, v4

    .line 93
    invoke-static {p1}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 94
    .line 95
    .line 96
    move-result p1

    .line 97
    const v4, 0x44084000    # 545.0f

    .line 98
    .line 99
    .line 100
    div-float/2addr p1, v4

    .line 101
    const/high16 v4, 0x40000000    # 2.0f

    .line 102
    .line 103
    float-to-double v4, v4

    .line 104
    float-to-double v6, p1

    .line 105
    invoke-static {v4, v5, v6, v7}, Ljava/lang/Math;->pow(DD)D

    .line 106
    .line 107
    .line 108
    move-result-wide v4

    .line 109
    double-to-float v7, v4

    .line 110
    iget-object p1, p0, Landroidx/compose/foundation/gestures/TransformableKt$detectZoomByCtrlMouseScroll$2;->$channel:Lkotlinx/coroutines/channels/a;

    .line 111
    .line 112
    new-instance v6, Landroidx/compose/foundation/gestures/TransformEvent$TransformDelta;

    .line 113
    .line 114
    sget-object v4, Landroidx/compose/ui/geometry/Offset;->Companion:Landroidx/compose/ui/geometry/Offset$Companion;

    .line 115
    .line 116
    invoke-virtual {v4}, Landroidx/compose/ui/geometry/Offset$Companion;->getZero-F1C5BW0()J

    .line 117
    .line 118
    .line 119
    move-result-wide v8

    .line 120
    const/4 v10, 0x0

    .line 121
    const/4 v11, 0x0

    .line 122
    invoke-direct/range {v6 .. v11}, Landroidx/compose/foundation/gestures/TransformEvent$TransformDelta;-><init>(FJFLkotlin/jvm/internal/n;)V

    .line 123
    .line 124
    .line 125
    invoke-interface {p1, v6}, Lkotlinx/coroutines/channels/f;->trySend-JP2dKIU(Ljava/lang/Object;)Ljava/lang/Object;

    .line 126
    .line 127
    .line 128
    iget-object p1, p0, Landroidx/compose/foundation/gestures/TransformableKt$detectZoomByCtrlMouseScroll$2;->$scrollConfig:Landroidx/compose/foundation/gestures/ScrollConfig;

    .line 129
    .line 130
    iput-object v1, p0, Landroidx/compose/foundation/gestures/TransformableKt$detectZoomByCtrlMouseScroll$2;->L$0:Ljava/lang/Object;

    .line 131
    .line 132
    iput v2, p0, Landroidx/compose/foundation/gestures/TransformableKt$detectZoomByCtrlMouseScroll$2;->label:I

    .line 133
    .line 134
    invoke-static {v1, p1, p0}, Landroidx/compose/foundation/gestures/TransformableKt;->access$awaitCtrlMouseScrollOrNull(Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;Landroidx/compose/foundation/gestures/ScrollConfig;Lvc/c;)Ljava/lang/Object;

    .line 135
    .line 136
    .line 137
    move-result-object p1

    .line 138
    if-ne p1, v0, :cond_4

    .line 139
    .line 140
    :goto_3
    return-object v0

    .line 141
    :cond_4
    :goto_4
    check-cast p1, Landroidx/compose/ui/geometry/Offset;

    .line 142
    .line 143
    if-eqz p1, :cond_5

    .line 144
    .line 145
    invoke-virtual {p1}, Landroidx/compose/ui/geometry/Offset;->unbox-impl()J

    .line 146
    .line 147
    .line 148
    move-result-wide v4
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 149
    goto :goto_2

    .line 150
    :cond_5
    iget-object p1, p0, Landroidx/compose/foundation/gestures/TransformableKt$detectZoomByCtrlMouseScroll$2;->$channel:Lkotlinx/coroutines/channels/a;

    .line 151
    .line 152
    sget-object v4, Landroidx/compose/foundation/gestures/TransformEvent$TransformStopped;->INSTANCE:Landroidx/compose/foundation/gestures/TransformEvent$TransformStopped;

    .line 153
    .line 154
    invoke-interface {p1, v4}, Lkotlinx/coroutines/channels/f;->trySend-JP2dKIU(Ljava/lang/Object;)Ljava/lang/Object;

    .line 155
    .line 156
    .line 157
    goto :goto_0

    .line 158
    :goto_5
    iget-object v0, p0, Landroidx/compose/foundation/gestures/TransformableKt$detectZoomByCtrlMouseScroll$2;->$channel:Lkotlinx/coroutines/channels/a;

    .line 159
    .line 160
    sget-object v1, Landroidx/compose/foundation/gestures/TransformEvent$TransformStopped;->INSTANCE:Landroidx/compose/foundation/gestures/TransformEvent$TransformStopped;

    .line 161
    .line 162
    invoke-interface {v0, v1}, Lkotlinx/coroutines/channels/f;->trySend-JP2dKIU(Ljava/lang/Object;)Ljava/lang/Object;

    .line 163
    .line 164
    .line 165
    throw p1

    .line 166
    :cond_6
    sget-object p1, Lqc/q;->a:Lqc/q;

    .line 167
    .line 168
    return-object p1
.end method
