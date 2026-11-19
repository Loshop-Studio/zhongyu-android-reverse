.class final Lcoil3/RealImageLoader$execute$result$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lr6/e;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/coroutines/jvm/internal/SuspendLambda;",
        "Lr6/e;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0002\u0010\u0003"
    }
    d2 = {
        "Lkotlinx/coroutines/v;",
        "Ls/i;",
        "<anonymous>",
        "(Lkotlinx/coroutines/v;)Ls/i;"
    }
    k = 0x3
    mv = {
        0x2,
        0x1,
        0x0
    }
.end annotation

.annotation runtime Lkotlin/coroutines/jvm/internal/DebugMetadata;
    c = "coil3.RealImageLoader$execute$result$1"
    f = "RealImageLoader.kt"
    i = {}
    l = {
        0x8e
    }
    m = "invokeSuspend"
    n = {}
    s = {}
.end annotation


# instance fields
.field final synthetic $cachedPlaceholder:Lcoil3/k;

.field final synthetic $eventListener:Lcoil3/h;

.field final synthetic $request:Ls/f;

.field final synthetic $size:Lt/f;

.field label:I

.field final synthetic this$0:Lcoil3/r;


# direct methods
.method public constructor <init>(Ls/f;Lcoil3/r;Lt/f;Lcoil3/h;Lcoil3/k;Lh6/c;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ls/f;",
            "Lcoil3/r;",
            "Lt/f;",
            "Lcoil3/h;",
            "Lcoil3/k;",
            "Lh6/c<",
            "-",
            "Lcoil3/RealImageLoader$execute$result$1;",
            ">;)V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lcoil3/RealImageLoader$execute$result$1;->$request:Ls/f;

    .line 2
    .line 3
    iput-object p2, p0, Lcoil3/RealImageLoader$execute$result$1;->this$0:Lcoil3/r;

    .line 4
    .line 5
    iput-object p3, p0, Lcoil3/RealImageLoader$execute$result$1;->$size:Lt/f;

    .line 6
    .line 7
    iput-object p4, p0, Lcoil3/RealImageLoader$execute$result$1;->$eventListener:Lcoil3/h;

    .line 8
    .line 9
    iput-object p5, p0, Lcoil3/RealImageLoader$execute$result$1;->$cachedPlaceholder:Lcoil3/k;

    .line 10
    .line 11
    const/4 p1, 0x2

    .line 12
    invoke-direct {p0, p1, p6}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILh6/c;)V

    .line 13
    .line 14
    .line 15
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lh6/c;)Lh6/c;
    .locals 7
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
    new-instance v0, Lcoil3/RealImageLoader$execute$result$1;

    .line 2
    .line 3
    iget-object v1, p0, Lcoil3/RealImageLoader$execute$result$1;->$request:Ls/f;

    .line 4
    .line 5
    iget-object v2, p0, Lcoil3/RealImageLoader$execute$result$1;->this$0:Lcoil3/r;

    .line 6
    .line 7
    iget-object v3, p0, Lcoil3/RealImageLoader$execute$result$1;->$size:Lt/f;

    .line 8
    .line 9
    iget-object v4, p0, Lcoil3/RealImageLoader$execute$result$1;->$eventListener:Lcoil3/h;

    .line 10
    .line 11
    iget-object v5, p0, Lcoil3/RealImageLoader$execute$result$1;->$cachedPlaceholder:Lcoil3/k;

    .line 12
    .line 13
    move-object v6, p2

    .line 14
    invoke-direct/range {v0 .. v6}, Lcoil3/RealImageLoader$execute$result$1;-><init>(Ls/f;Lcoil3/r;Lt/f;Lcoil3/h;Lcoil3/k;Lh6/c;)V

    .line 15
    .line 16
    .line 17
    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lkotlinx/coroutines/v;

    check-cast p2, Lh6/c;

    invoke-virtual {p0, p1, p2}, Lcoil3/RealImageLoader$execute$result$1;->invoke(Lkotlinx/coroutines/v;Lh6/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Lkotlinx/coroutines/v;Lh6/c;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlinx/coroutines/v;",
            "Lh6/c<",
            "-",
            "Ls/i;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 2
    invoke-virtual {p0, p1, p2}, Lcoil3/RealImageLoader$execute$result$1;->create(Ljava/lang/Object;Lh6/c;)Lh6/c;

    move-result-object p1

    check-cast p1, Lcoil3/RealImageLoader$execute$result$1;

    sget-object p2, Ld6/s;->a:Ld6/s;

    invoke-virtual {p1, p2}, Lcoil3/RealImageLoader$execute$result$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 11

    .line 1
    sget-object v0, Lkotlin/coroutines/intrinsics/CoroutineSingletons;->COROUTINE_SUSPENDED:Lkotlin/coroutines/intrinsics/CoroutineSingletons;

    .line 2
    .line 3
    iget v1, p0, Lcoil3/RealImageLoader$execute$result$1;->label:I

    .line 4
    .line 5
    const/4 v2, 0x1

    .line 6
    if-eqz v1, :cond_1

    .line 7
    .line 8
    if-ne v1, v2, :cond_0

    .line 9
    .line 10
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 11
    .line 12
    .line 13
    return-object p1

    .line 14
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 15
    .line 16
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 17
    .line 18
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    throw p1

    .line 22
    :cond_1
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 23
    .line 24
    .line 25
    new-instance v3, Lcoil3/intercept/e;

    .line 26
    .line 27
    iget-object v4, p0, Lcoil3/RealImageLoader$execute$result$1;->$request:Ls/f;

    .line 28
    .line 29
    iget-object p1, p0, Lcoil3/RealImageLoader$execute$result$1;->this$0:Lcoil3/r;

    .line 30
    .line 31
    iget-object p1, p1, Lcoil3/r;->d:Lcoil3/d;

    .line 32
    .line 33
    iget-object v5, p1, Lcoil3/d;->a:Ljava/util/List;

    .line 34
    .line 35
    iget-object v8, p0, Lcoil3/RealImageLoader$execute$result$1;->$size:Lt/f;

    .line 36
    .line 37
    iget-object v9, p0, Lcoil3/RealImageLoader$execute$result$1;->$eventListener:Lcoil3/h;

    .line 38
    .line 39
    iget-object p1, p0, Lcoil3/RealImageLoader$execute$result$1;->$cachedPlaceholder:Lcoil3/k;

    .line 40
    .line 41
    if-eqz p1, :cond_2

    .line 42
    .line 43
    move v10, v2

    .line 44
    goto :goto_0

    .line 45
    :cond_2
    const/4 p1, 0x0

    .line 46
    move v10, p1

    .line 47
    :goto_0
    const/4 v6, 0x0

    .line 48
    move-object v7, v4

    .line 49
    invoke-direct/range {v3 .. v10}, Lcoil3/intercept/e;-><init>(Ls/f;Ljava/util/List;ILs/f;Lt/f;Lcoil3/h;Z)V

    .line 50
    .line 51
    .line 52
    iput v2, p0, Lcoil3/RealImageLoader$execute$result$1;->label:I

    .line 53
    .line 54
    invoke-virtual {v3, p0}, Lcoil3/intercept/e;->a(Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    move-result-object p1

    .line 58
    if-ne p1, v0, :cond_3

    .line 59
    .line 60
    return-object v0

    .line 61
    :cond_3
    return-object p1
.end method
