.class public final Landroidx/paging/PagingDataTransforms__PagingDataTransforms_jvmKt$map$$inlined$transform$1$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlinx/coroutines/flow/FlowCollector;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/paging/PagingDataTransforms__PagingDataTransforms_jvmKt$map$$inlined$transform$1;->collect(Lkotlinx/coroutines/flow/FlowCollector;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Lkotlinx/coroutines/flow/FlowCollector;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0008\u0010\u0000\u001a\u00020\u0001\"\u0004\u0008\u0000\u0010\u0002\"\u0004\u0008\u0001\u0010\u00032\u0006\u0010\u0004\u001a\u0002H\u0002H\u008a@\u00a2\u0006\u0004\u0008\u0005\u0010\u0006\u00a8\u0006\t"
    }
    d2 = {
        "<anonymous>",
        "",
        "T",
        "R",
        "value",
        "emit",
        "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "kotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1",
        "kotlinx/coroutines/flow/FlowKt__TransformKt$map$$inlined$unsafeTransform$1$2",
        "androidx/paging/PagingDataTransforms__PagingDataTransformsKt$transform$$inlined$map$1$2"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 PagingDataTransforms.kt\nandroidx/paging/PagingDataTransforms__PagingDataTransformsKt\n+ 4 PagingDataTransforms.jvm.kt\nandroidx/paging/PagingDataTransforms__PagingDataTransforms_jvmKt\n*L\n1#1,222:1\n54#2:223\n33#3:224\n38#4:225\n*E\n"
    }
.end annotation


# instance fields
.field final synthetic $executor$inlined:Ljava/util/concurrent/Executor;

.field final synthetic $this_unsafeFlow:Lkotlinx/coroutines/flow/FlowCollector;

.field final synthetic $transform$inlined:Lkotlin/jvm/functions/Function1;


# direct methods
.method public constructor <init>(Lkotlinx/coroutines/flow/FlowCollector;Ljava/util/concurrent/Executor;Lkotlin/jvm/functions/Function1;)V
    .locals 0

    iput-object p1, p0, Landroidx/paging/PagingDataTransforms__PagingDataTransforms_jvmKt$map$$inlined$transform$1$2;->$this_unsafeFlow:Lkotlinx/coroutines/flow/FlowCollector;

    iput-object p2, p0, Landroidx/paging/PagingDataTransforms__PagingDataTransforms_jvmKt$map$$inlined$transform$1$2;->$executor$inlined:Ljava/util/concurrent/Executor;

    iput-object p3, p0, Landroidx/paging/PagingDataTransforms__PagingDataTransforms_jvmKt$map$$inlined$transform$1$2;->$transform$inlined:Lkotlin/jvm/functions/Function1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 9

    .line 1
    instance-of v0, p2, Landroidx/paging/PagingDataTransforms__PagingDataTransforms_jvmKt$map$$inlined$transform$1$2$1;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p2

    .line 6
    check-cast v0, Landroidx/paging/PagingDataTransforms__PagingDataTransforms_jvmKt$map$$inlined$transform$1$2$1;

    .line 7
    .line 8
    iget v1, v0, Landroidx/paging/PagingDataTransforms__PagingDataTransforms_jvmKt$map$$inlined$transform$1$2$1;->label:I

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
    iput v1, v0, Landroidx/paging/PagingDataTransforms__PagingDataTransforms_jvmKt$map$$inlined$transform$1$2$1;->label:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Landroidx/paging/PagingDataTransforms__PagingDataTransforms_jvmKt$map$$inlined$transform$1$2$1;

    .line 21
    .line 22
    invoke-direct {v0, p0, p2}, Landroidx/paging/PagingDataTransforms__PagingDataTransforms_jvmKt$map$$inlined$transform$1$2$1;-><init>(Landroidx/paging/PagingDataTransforms__PagingDataTransforms_jvmKt$map$$inlined$transform$1$2;Lkotlin/coroutines/Continuation;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p2, v0, Landroidx/paging/PagingDataTransforms__PagingDataTransforms_jvmKt$map$$inlined$transform$1$2$1;->result:Ljava/lang/Object;

    .line 26
    .line 27
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    iget v2, v0, Landroidx/paging/PagingDataTransforms__PagingDataTransforms_jvmKt$map$$inlined$transform$1$2$1;->label:I

    .line 32
    .line 33
    const/4 v3, 0x0

    .line 34
    const/4 v4, 0x2

    .line 35
    const/4 v5, 0x1

    .line 36
    if-eqz v2, :cond_3

    .line 37
    .line 38
    if-eq v2, v5, :cond_2

    .line 39
    .line 40
    if-ne v2, v4, :cond_1

    .line 41
    .line 42
    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 43
    .line 44
    .line 45
    goto :goto_3

    .line 46
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 47
    .line 48
    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 49
    .line 50
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 51
    .line 52
    .line 53
    throw p1

    .line 54
    :cond_2
    iget-object p1, v0, Landroidx/paging/PagingDataTransforms__PagingDataTransforms_jvmKt$map$$inlined$transform$1$2$1;->L$0:Ljava/lang/Object;

    .line 55
    .line 56
    check-cast p1, Lkotlinx/coroutines/flow/FlowCollector;

    .line 57
    .line 58
    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 59
    .line 60
    .line 61
    goto :goto_1

    .line 62
    :cond_3
    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 63
    .line 64
    .line 65
    iget-object p2, p0, Landroidx/paging/PagingDataTransforms__PagingDataTransforms_jvmKt$map$$inlined$transform$1$2;->$this_unsafeFlow:Lkotlinx/coroutines/flow/FlowCollector;

    .line 66
    .line 67
    check-cast p1, Landroidx/paging/PageEvent;

    .line 68
    .line 69
    iget-object v2, p0, Landroidx/paging/PagingDataTransforms__PagingDataTransforms_jvmKt$map$$inlined$transform$1$2;->$executor$inlined:Ljava/util/concurrent/Executor;

    .line 70
    .line 71
    invoke-static {v2}, Lkotlinx/coroutines/ExecutorsKt;->from(Ljava/util/concurrent/Executor;)Lkotlinx/coroutines/CoroutineDispatcher;

    .line 72
    .line 73
    .line 74
    move-result-object v2

    .line 75
    new-instance v6, Landroidx/paging/PagingDataTransforms__PagingDataTransforms_jvmKt$map$1$1;

    .line 76
    .line 77
    iget-object v7, p0, Landroidx/paging/PagingDataTransforms__PagingDataTransforms_jvmKt$map$$inlined$transform$1$2;->$transform$inlined:Lkotlin/jvm/functions/Function1;

    .line 78
    .line 79
    invoke-direct {v6, p1, v7, v3}, Landroidx/paging/PagingDataTransforms__PagingDataTransforms_jvmKt$map$1$1;-><init>(Landroidx/paging/PageEvent;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)V

    .line 80
    .line 81
    .line 82
    iput-object p2, v0, Landroidx/paging/PagingDataTransforms__PagingDataTransforms_jvmKt$map$$inlined$transform$1$2$1;->L$0:Ljava/lang/Object;

    .line 83
    .line 84
    iput v5, v0, Landroidx/paging/PagingDataTransforms__PagingDataTransforms_jvmKt$map$$inlined$transform$1$2$1;->label:I

    .line 85
    .line 86
    invoke-static {v2, v6, v0}, Lkotlinx/coroutines/BuildersKt;->withContext(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 87
    .line 88
    .line 89
    move-result-object p1

    .line 90
    if-ne p1, v1, :cond_4

    .line 91
    .line 92
    goto :goto_2

    .line 93
    :cond_4
    move-object v8, p2

    .line 94
    move-object p2, p1

    .line 95
    move-object p1, v8

    .line 96
    :goto_1
    iput-object v3, v0, Landroidx/paging/PagingDataTransforms__PagingDataTransforms_jvmKt$map$$inlined$transform$1$2$1;->L$0:Ljava/lang/Object;

    .line 97
    .line 98
    iput v4, v0, Landroidx/paging/PagingDataTransforms__PagingDataTransforms_jvmKt$map$$inlined$transform$1$2$1;->label:I

    .line 99
    .line 100
    invoke-interface {p1, p2, v0}, Lkotlinx/coroutines/flow/FlowCollector;->emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 101
    .line 102
    .line 103
    move-result-object p1

    .line 104
    if-ne p1, v1, :cond_5

    .line 105
    .line 106
    :goto_2
    return-object v1

    .line 107
    :cond_5
    :goto_3
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 108
    .line 109
    return-object p1
.end method
