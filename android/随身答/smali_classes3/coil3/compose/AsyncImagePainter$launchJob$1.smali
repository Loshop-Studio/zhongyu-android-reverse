.class final Lcoil3/compose/AsyncImagePainter$launchJob$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcoil3/compose/AsyncImagePainter;->l()V
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
        "\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"
    }
    d2 = {
        "<anonymous>",
        "",
        "Lkotlinx/coroutines/CoroutineScope;"
    }
    k = 0x3
    mv = {
        0x2,
        0x1,
        0x0
    }
    xi = 0x30
.end annotation

.annotation runtime Lkotlin/coroutines/jvm/internal/DebugMetadata;
    c = "coil3.compose.AsyncImagePainter$launchJob$1"
    f = "AsyncImagePainter.kt"
    i = {}
    l = {
        0xe4,
        0xe8
    }
    m = "invokeSuspend"
    n = {}
    s = {}
.end annotation


# instance fields
.field public a:Ljava/lang/Object;

.field public b:I

.field public final synthetic c:Lcoil3/compose/AsyncImagePainter;

.field public final synthetic d:Lcoil3/compose/AsyncImagePainter$b;


# direct methods
.method public constructor <init>(Lcoil3/compose/AsyncImagePainter;Lcoil3/compose/AsyncImagePainter$b;Lkotlin/coroutines/Continuation;)V
    .locals 0

    iput-object p1, p0, Lcoil3/compose/AsyncImagePainter$launchJob$1;->c:Lcoil3/compose/AsyncImagePainter;

    iput-object p2, p0, Lcoil3/compose/AsyncImagePainter$launchJob$1;->d:Lcoil3/compose/AsyncImagePainter$b;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILkotlin/coroutines/Continuation;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;
    .locals 2

    new-instance p1, Lcoil3/compose/AsyncImagePainter$launchJob$1;

    iget-object v0, p0, Lcoil3/compose/AsyncImagePainter$launchJob$1;->c:Lcoil3/compose/AsyncImagePainter;

    iget-object v1, p0, Lcoil3/compose/AsyncImagePainter$launchJob$1;->d:Lcoil3/compose/AsyncImagePainter$b;

    invoke-direct {p1, v0, v1, p2}, Lcoil3/compose/AsyncImagePainter$launchJob$1;-><init>(Lcoil3/compose/AsyncImagePainter;Lcoil3/compose/AsyncImagePainter$b;Lkotlin/coroutines/Continuation;)V

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lkotlinx/coroutines/CoroutineScope;

    check-cast p2, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2}, Lcoil3/compose/AsyncImagePainter$launchJob$1;->invoke(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0

    .line 2
    invoke-virtual {p0, p1, p2}, Lcoil3/compose/AsyncImagePainter$launchJob$1;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object p1

    check-cast p1, Lcoil3/compose/AsyncImagePainter$launchJob$1;

    sget-object p2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lcoil3/compose/AsyncImagePainter$launchJob$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    .line 1
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget v1, p0, Lcoil3/compose/AsyncImagePainter$launchJob$1;->b:I

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
    iget-object v0, p0, Lcoil3/compose/AsyncImagePainter$launchJob$1;->a:Ljava/lang/Object;

    .line 16
    .line 17
    check-cast v0, Lcoil3/compose/AsyncImagePainter;

    .line 18
    .line 19
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 20
    .line 21
    .line 22
    goto :goto_2

    .line 23
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 24
    .line 25
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 26
    .line 27
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    throw p1

    .line 31
    :cond_1
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 32
    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_2
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 36
    .line 37
    .line 38
    iget-object p1, p0, Lcoil3/compose/AsyncImagePainter$launchJob$1;->c:Lcoil3/compose/AsyncImagePainter;

    .line 39
    .line 40
    invoke-virtual {p1}, Lcoil3/compose/AsyncImagePainter;->i()Lcoil3/compose/AsyncImagePreviewHandler;

    .line 41
    .line 42
    .line 43
    move-result-object p1

    .line 44
    if-eqz p1, :cond_4

    .line 45
    .line 46
    iget-object v1, p0, Lcoil3/compose/AsyncImagePainter$launchJob$1;->c:Lcoil3/compose/AsyncImagePainter;

    .line 47
    .line 48
    iget-object v2, p0, Lcoil3/compose/AsyncImagePainter$launchJob$1;->d:Lcoil3/compose/AsyncImagePainter$b;

    .line 49
    .line 50
    invoke-virtual {v2}, Lcoil3/compose/AsyncImagePainter$b;->b()Ly/e;

    .line 51
    .line 52
    .line 53
    move-result-object v2

    .line 54
    invoke-static {v1, v2, v3}, Lcoil3/compose/AsyncImagePainter;->e(Lcoil3/compose/AsyncImagePainter;Ly/e;Z)Ly/e;

    .line 55
    .line 56
    .line 57
    move-result-object v1

    .line 58
    iget-object v2, p0, Lcoil3/compose/AsyncImagePainter$launchJob$1;->d:Lcoil3/compose/AsyncImagePainter$b;

    .line 59
    .line 60
    invoke-virtual {v2}, Lcoil3/compose/AsyncImagePainter$b;->a()Lcoil3/e;

    .line 61
    .line 62
    .line 63
    move-result-object v2

    .line 64
    iput v3, p0, Lcoil3/compose/AsyncImagePainter$launchJob$1;->b:I

    .line 65
    .line 66
    invoke-interface {p1, v2, v1, p0}, Lcoil3/compose/AsyncImagePreviewHandler;->a(Lcoil3/e;Ly/e;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 67
    .line 68
    .line 69
    move-result-object p1

    .line 70
    if-ne p1, v0, :cond_3

    .line 71
    .line 72
    goto :goto_1

    .line 73
    :cond_3
    :goto_0
    check-cast p1, Lcoil3/compose/AsyncImagePainter$c;

    .line 74
    .line 75
    goto :goto_3

    .line 76
    :cond_4
    iget-object p1, p0, Lcoil3/compose/AsyncImagePainter$launchJob$1;->c:Lcoil3/compose/AsyncImagePainter;

    .line 77
    .line 78
    iget-object v1, p0, Lcoil3/compose/AsyncImagePainter$launchJob$1;->d:Lcoil3/compose/AsyncImagePainter$b;

    .line 79
    .line 80
    invoke-virtual {v1}, Lcoil3/compose/AsyncImagePainter$b;->b()Ly/e;

    .line 81
    .line 82
    .line 83
    move-result-object v1

    .line 84
    const/4 v3, 0x0

    .line 85
    invoke-static {p1, v1, v3}, Lcoil3/compose/AsyncImagePainter;->e(Lcoil3/compose/AsyncImagePainter;Ly/e;Z)Ly/e;

    .line 86
    .line 87
    .line 88
    move-result-object p1

    .line 89
    iget-object v1, p0, Lcoil3/compose/AsyncImagePainter$launchJob$1;->c:Lcoil3/compose/AsyncImagePainter;

    .line 90
    .line 91
    iget-object v3, p0, Lcoil3/compose/AsyncImagePainter$launchJob$1;->d:Lcoil3/compose/AsyncImagePainter$b;

    .line 92
    .line 93
    invoke-virtual {v3}, Lcoil3/compose/AsyncImagePainter$b;->a()Lcoil3/e;

    .line 94
    .line 95
    .line 96
    move-result-object v3

    .line 97
    iput-object v1, p0, Lcoil3/compose/AsyncImagePainter$launchJob$1;->a:Ljava/lang/Object;

    .line 98
    .line 99
    iput v2, p0, Lcoil3/compose/AsyncImagePainter$launchJob$1;->b:I

    .line 100
    .line 101
    invoke-interface {v3, p1, p0}, Lcoil3/e;->c(Ly/e;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 102
    .line 103
    .line 104
    move-result-object p1

    .line 105
    if-ne p1, v0, :cond_5

    .line 106
    .line 107
    :goto_1
    return-object v0

    .line 108
    :cond_5
    move-object v0, v1

    .line 109
    :goto_2
    check-cast p1, Ly/j;

    .line 110
    .line 111
    invoke-static {v0, p1}, Lcoil3/compose/AsyncImagePainter;->d(Lcoil3/compose/AsyncImagePainter;Ly/j;)Lcoil3/compose/AsyncImagePainter$c;

    .line 112
    .line 113
    .line 114
    move-result-object p1

    .line 115
    :goto_3
    iget-object v0, p0, Lcoil3/compose/AsyncImagePainter$launchJob$1;->c:Lcoil3/compose/AsyncImagePainter;

    .line 116
    .line 117
    invoke-static {v0, p1}, Lcoil3/compose/AsyncImagePainter;->f(Lcoil3/compose/AsyncImagePainter;Lcoil3/compose/AsyncImagePainter$c;)V

    .line 118
    .line 119
    .line 120
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 121
    .line 122
    return-object p1
.end method
