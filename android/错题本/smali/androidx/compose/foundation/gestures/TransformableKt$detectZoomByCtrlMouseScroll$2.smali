.class final Landroidx/compose/foundation/gestures/TransformableKt$detectZoomByCtrlMouseScroll$2;
.super Lkotlin/coroutines/jvm/internal/RestrictedSuspendLambda;
.source "SourceFile"

# interfaces
.implements Lr6/e;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/foundation/gestures/TransformableKt;->detectZoomByCtrlMouseScroll(Landroidx/compose/ui/input/pointer/PointerInputScope;Lkotlinx/coroutines/channels/e;Landroidx/compose/foundation/gestures/ScrollConfig;Lh6/c;)Ljava/lang/Object;
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
    c = "androidx.compose.foundation.gestures.TransformableKt$detectZoomByCtrlMouseScroll$2"
    f = "Transformable.kt"
    i = {
        0x0,
        0x1
    }
    l = {
        0x110,
        0x11c
    }
    m = "invokeSuspend"
    n = {
        "$this$awaitPointerEventScope",
        "$this$awaitPointerEventScope"
    }
    s = {
        "L$0",
        "L$0"
    }
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nTransformable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Transformable.kt\nandroidx/compose/foundation/gestures/TransformableKt$detectZoomByCtrlMouseScroll$2\n+ 2 Offset.kt\nandroidx/compose/ui/geometry/Offset\n+ 3 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 4 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n*L\n1#1,399:1\n69#2:400\n70#3:401\n22#4:402\n*S KotlinDebug\n*F\n+ 1 Transformable.kt\nandroidx/compose/foundation/gestures/TransformableKt$detectZoomByCtrlMouseScroll$2\n*L\n276#1:400\n276#1:401\n276#1:402\n*E\n"
    }
.end annotation


# instance fields
.field final synthetic $channel:Lkotlinx/coroutines/channels/e;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlinx/coroutines/channels/e;"
        }
    .end annotation
.end field

.field final synthetic $currentContext:Lh6/h;

.field final synthetic $scrollConfig:Landroidx/compose/foundation/gestures/ScrollConfig;

.field private synthetic L$0:Ljava/lang/Object;

.field label:I


# direct methods
.method public constructor <init>(Lh6/h;Landroidx/compose/foundation/gestures/ScrollConfig;Lkotlinx/coroutines/channels/e;Lh6/c;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lh6/h;",
            "Landroidx/compose/foundation/gestures/ScrollConfig;",
            "Lkotlinx/coroutines/channels/e;",
            "Lh6/c<",
            "-",
            "Landroidx/compose/foundation/gestures/TransformableKt$detectZoomByCtrlMouseScroll$2;",
            ">;)V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Landroidx/compose/foundation/gestures/TransformableKt$detectZoomByCtrlMouseScroll$2;->$currentContext:Lh6/h;

    .line 2
    .line 3
    iput-object p2, p0, Landroidx/compose/foundation/gestures/TransformableKt$detectZoomByCtrlMouseScroll$2;->$scrollConfig:Landroidx/compose/foundation/gestures/ScrollConfig;

    .line 4
    .line 5
    iput-object p3, p0, Landroidx/compose/foundation/gestures/TransformableKt$detectZoomByCtrlMouseScroll$2;->$channel:Lkotlinx/coroutines/channels/e;

    .line 6
    .line 7
    const/4 p1, 0x2

    .line 8
    invoke-direct {p0, p1, p4}, Lkotlin/coroutines/jvm/internal/RestrictedSuspendLambda;-><init>(ILh6/c;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lh6/c;)Lh6/c;
    .locals 4
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
    new-instance v0, Landroidx/compose/foundation/gestures/TransformableKt$detectZoomByCtrlMouseScroll$2;

    .line 2
    .line 3
    iget-object v1, p0, Landroidx/compose/foundation/gestures/TransformableKt$detectZoomByCtrlMouseScroll$2;->$currentContext:Lh6/h;

    .line 4
    .line 5
    iget-object v2, p0, Landroidx/compose/foundation/gestures/TransformableKt$detectZoomByCtrlMouseScroll$2;->$scrollConfig:Landroidx/compose/foundation/gestures/ScrollConfig;

    .line 6
    .line 7
    iget-object v3, p0, Landroidx/compose/foundation/gestures/TransformableKt$detectZoomByCtrlMouseScroll$2;->$channel:Lkotlinx/coroutines/channels/e;

    .line 8
    .line 9
    invoke-direct {v0, v1, v2, v3, p2}, Landroidx/compose/foundation/gestures/TransformableKt$detectZoomByCtrlMouseScroll$2;-><init>(Lh6/h;Landroidx/compose/foundation/gestures/ScrollConfig;Lkotlinx/coroutines/channels/e;Lh6/c;)V

    .line 10
    .line 11
    .line 12
    iput-object p1, v0, Landroidx/compose/foundation/gestures/TransformableKt$detectZoomByCtrlMouseScroll$2;->L$0:Ljava/lang/Object;

    .line 13
    .line 14
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
    invoke-virtual {p0, p1, p2}, Landroidx/compose/foundation/gestures/TransformableKt$detectZoomByCtrlMouseScroll$2;->create(Ljava/lang/Object;Lh6/c;)Lh6/c;

    move-result-object p1

    check-cast p1, Landroidx/compose/foundation/gestures/TransformableKt$detectZoomByCtrlMouseScroll$2;

    sget-object p2, Ld6/s;->a:Ld6/s;

    invoke-virtual {p1, p2}, Landroidx/compose/foundation/gestures/TransformableKt$detectZoomByCtrlMouseScroll$2;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;

    check-cast p2, Lh6/c;

    invoke-virtual {p0, p1, p2}, Landroidx/compose/foundation/gestures/TransformableKt$detectZoomByCtrlMouseScroll$2;->invoke(Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;Lh6/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 12

    .line 1
    sget-object v0, Lkotlin/coroutines/intrinsics/CoroutineSingletons;->COROUTINE_SUSPENDED:Lkotlin/coroutines/intrinsics/CoroutineSingletons;

    .line 2
    .line 3
    iget v1, p0, Landroidx/compose/foundation/gestures/TransformableKt$detectZoomByCtrlMouseScroll$2;->label:I

    .line 4
    .line 5
    const/4 v2, 0x2

    .line 6
    const/4 v3, 0x1

    .line 7
    if-eqz v1, :cond_2

    .line 8
    .line 9
    if-eq v1, v3, :cond_1

    .line 10
    .line 11
    if-ne v1, v2, :cond_0

    .line 12
    .line 13
    iget-object v1, p0, Landroidx/compose/foundation/gestures/TransformableKt$detectZoomByCtrlMouseScroll$2;->L$0:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast v1, Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;

    .line 16
    .line 17
    :try_start_0
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 18
    .line 19
    .line 20
    goto/16 :goto_4

    .line 21
    .line 22
    :catchall_0
    move-exception v0

    .line 23
    move-object p1, v0

    .line 24
    goto/16 :goto_5

    .line 25
    .line 26
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 27
    .line 28
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 29
    .line 30
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 31
    .line 32
    .line 33
    throw p1

    .line 34
    :cond_1
    iget-object v1, p0, Landroidx/compose/foundation/gestures/TransformableKt$detectZoomByCtrlMouseScroll$2;->L$0:Ljava/lang/Object;

    .line 35
    .line 36
    check-cast v1, Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;

    .line 37
    .line 38
    :try_start_1
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 39
    .line 40
    .line 41
    goto :goto_1

    .line 42
    :cond_2
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 43
    .line 44
    .line 45
    iget-object p1, p0, Landroidx/compose/foundation/gestures/TransformableKt$detectZoomByCtrlMouseScroll$2;->L$0:Ljava/lang/Object;

    .line 46
    .line 47
    check-cast p1, Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;

    .line 48
    .line 49
    move-object v1, p1

    .line 50
    :goto_0
    iget-object p1, p0, Landroidx/compose/foundation/gestures/TransformableKt$detectZoomByCtrlMouseScroll$2;->$currentContext:Lh6/h;

    .line 51
    .line 52
    invoke-static {p1}, Lkotlinx/coroutines/x;->r(Lh6/h;)Z

    .line 53
    .line 54
    .line 55
    move-result p1

    .line 56
    if-eqz p1, :cond_6

    .line 57
    .line 58
    :try_start_2
    iget-object p1, p0, Landroidx/compose/foundation/gestures/TransformableKt$detectZoomByCtrlMouseScroll$2;->$scrollConfig:Landroidx/compose/foundation/gestures/ScrollConfig;

    .line 59
    .line 60
    iput-object v1, p0, Landroidx/compose/foundation/gestures/TransformableKt$detectZoomByCtrlMouseScroll$2;->L$0:Ljava/lang/Object;

    .line 61
    .line 62
    iput v3, p0, Landroidx/compose/foundation/gestures/TransformableKt$detectZoomByCtrlMouseScroll$2;->label:I

    .line 63
    .line 64
    invoke-static {v1, p1, p0}, Landroidx/compose/foundation/gestures/TransformableKt;->access$awaitFirstCtrlMouseScroll(Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;Landroidx/compose/foundation/gestures/ScrollConfig;Lh6/c;)Ljava/lang/Object;

    .line 65
    .line 66
    .line 67
    move-result-object p1

    .line 68
    if-ne p1, v0, :cond_3

    .line 69
    .line 70
    goto :goto_3

    .line 71
    :cond_3
    :goto_1
    check-cast p1, Landroidx/compose/ui/geometry/Offset;

    .line 72
    .line 73
    invoke-virtual {p1}, Landroidx/compose/ui/geometry/Offset;->unbox-impl()J

    .line 74
    .line 75
    .line 76
    move-result-wide v4

    .line 77
    iget-object p1, p0, Landroidx/compose/foundation/gestures/TransformableKt$detectZoomByCtrlMouseScroll$2;->$channel:Lkotlinx/coroutines/channels/e;

    .line 78
    .line 79
    sget-object v6, Landroidx/compose/foundation/gestures/TransformEvent$TransformStarted;->INSTANCE:Landroidx/compose/foundation/gestures/TransformEvent$TransformStarted;

    .line 80
    .line 81
    invoke-interface {p1, v6}, Lkotlinx/coroutines/channels/p;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 82
    .line 83
    .line 84
    :goto_2
    const-wide v6, 0xffffffffL

    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    and-long/2addr v4, v6

    .line 90
    long-to-int p1, v4

    .line 91
    invoke-static {p1}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 92
    .line 93
    .line 94
    move-result p1

    .line 95
    const v4, 0x44084000    # 545.0f

    .line 96
    .line 97
    .line 98
    div-float/2addr p1, v4

    .line 99
    const/high16 v4, 0x40000000    # 2.0f

    .line 100
    .line 101
    float-to-double v4, v4

    .line 102
    float-to-double v6, p1

    .line 103
    invoke-static {v4, v5, v6, v7}, Ljava/lang/Math;->pow(DD)D

    .line 104
    .line 105
    .line 106
    move-result-wide v4

    .line 107
    double-to-float v7, v4

    .line 108
    iget-object p1, p0, Landroidx/compose/foundation/gestures/TransformableKt$detectZoomByCtrlMouseScroll$2;->$channel:Lkotlinx/coroutines/channels/e;

    .line 109
    .line 110
    new-instance v6, Landroidx/compose/foundation/gestures/TransformEvent$TransformDelta;

    .line 111
    .line 112
    sget-object v4, Landroidx/compose/ui/geometry/Offset;->Companion:Landroidx/compose/ui/geometry/Offset$Companion;

    .line 113
    .line 114
    invoke-virtual {v4}, Landroidx/compose/ui/geometry/Offset$Companion;->getZero-F1C5BW0()J

    .line 115
    .line 116
    .line 117
    move-result-wide v8

    .line 118
    const/4 v10, 0x0

    .line 119
    const/4 v11, 0x0

    .line 120
    invoke-direct/range {v6 .. v11}, Landroidx/compose/foundation/gestures/TransformEvent$TransformDelta;-><init>(FJFLkotlin/jvm/internal/e;)V

    .line 121
    .line 122
    .line 123
    invoke-interface {p1, v6}, Lkotlinx/coroutines/channels/p;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 124
    .line 125
    .line 126
    iget-object p1, p0, Landroidx/compose/foundation/gestures/TransformableKt$detectZoomByCtrlMouseScroll$2;->$scrollConfig:Landroidx/compose/foundation/gestures/ScrollConfig;

    .line 127
    .line 128
    iput-object v1, p0, Landroidx/compose/foundation/gestures/TransformableKt$detectZoomByCtrlMouseScroll$2;->L$0:Ljava/lang/Object;

    .line 129
    .line 130
    iput v2, p0, Landroidx/compose/foundation/gestures/TransformableKt$detectZoomByCtrlMouseScroll$2;->label:I

    .line 131
    .line 132
    invoke-static {v1, p1, p0}, Landroidx/compose/foundation/gestures/TransformableKt;->access$awaitCtrlMouseScrollOrNull(Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;Landroidx/compose/foundation/gestures/ScrollConfig;Lh6/c;)Ljava/lang/Object;

    .line 133
    .line 134
    .line 135
    move-result-object p1

    .line 136
    if-ne p1, v0, :cond_4

    .line 137
    .line 138
    :goto_3
    return-object v0

    .line 139
    :cond_4
    :goto_4
    check-cast p1, Landroidx/compose/ui/geometry/Offset;

    .line 140
    .line 141
    if-eqz p1, :cond_5

    .line 142
    .line 143
    invoke-virtual {p1}, Landroidx/compose/ui/geometry/Offset;->unbox-impl()J

    .line 144
    .line 145
    .line 146
    move-result-wide v4
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 147
    goto :goto_2

    .line 148
    :cond_5
    iget-object p1, p0, Landroidx/compose/foundation/gestures/TransformableKt$detectZoomByCtrlMouseScroll$2;->$channel:Lkotlinx/coroutines/channels/e;

    .line 149
    .line 150
    sget-object v4, Landroidx/compose/foundation/gestures/TransformEvent$TransformStopped;->INSTANCE:Landroidx/compose/foundation/gestures/TransformEvent$TransformStopped;

    .line 151
    .line 152
    invoke-interface {p1, v4}, Lkotlinx/coroutines/channels/p;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 153
    .line 154
    .line 155
    goto :goto_0

    .line 156
    :goto_5
    iget-object v0, p0, Landroidx/compose/foundation/gestures/TransformableKt$detectZoomByCtrlMouseScroll$2;->$channel:Lkotlinx/coroutines/channels/e;

    .line 157
    .line 158
    sget-object v1, Landroidx/compose/foundation/gestures/TransformEvent$TransformStopped;->INSTANCE:Landroidx/compose/foundation/gestures/TransformEvent$TransformStopped;

    .line 159
    .line 160
    invoke-interface {v0, v1}, Lkotlinx/coroutines/channels/p;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 161
    .line 162
    .line 163
    throw p1

    .line 164
    :cond_6
    sget-object p1, Ld6/s;->a:Ld6/s;

    .line 165
    .line 166
    return-object p1
.end method
