.class final Lcoil3/RealImageLoader$execute$2;
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
    c = "coil3.RealImageLoader$execute$2"
    f = "RealImageLoader.kt"
    i = {}
    l = {
        0x57
    }
    m = "invokeSuspend"
    n = {}
    s = {}
.end annotation


# instance fields
.field final synthetic $request:Ls/f;

.field private synthetic L$0:Ljava/lang/Object;

.field label:I

.field final synthetic this$0:Lcoil3/r;


# direct methods
.method public constructor <init>(Ls/f;Lcoil3/r;Lh6/c;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ls/f;",
            "Lcoil3/r;",
            "Lh6/c<",
            "-",
            "Lcoil3/RealImageLoader$execute$2;",
            ">;)V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lcoil3/RealImageLoader$execute$2;->$request:Ls/f;

    .line 2
    .line 3
    iput-object p2, p0, Lcoil3/RealImageLoader$execute$2;->this$0:Lcoil3/r;

    .line 4
    .line 5
    const/4 p1, 0x2

    .line 6
    invoke-direct {p0, p1, p3}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILh6/c;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lh6/c;)Lh6/c;
    .locals 3
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
    new-instance v0, Lcoil3/RealImageLoader$execute$2;

    .line 2
    .line 3
    iget-object v1, p0, Lcoil3/RealImageLoader$execute$2;->$request:Ls/f;

    .line 4
    .line 5
    iget-object v2, p0, Lcoil3/RealImageLoader$execute$2;->this$0:Lcoil3/r;

    .line 6
    .line 7
    invoke-direct {v0, v1, v2, p2}, Lcoil3/RealImageLoader$execute$2;-><init>(Ls/f;Lcoil3/r;Lh6/c;)V

    .line 8
    .line 9
    .line 10
    iput-object p1, v0, Lcoil3/RealImageLoader$execute$2;->L$0:Ljava/lang/Object;

    .line 11
    .line 12
    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lkotlinx/coroutines/v;

    check-cast p2, Lh6/c;

    invoke-virtual {p0, p1, p2}, Lcoil3/RealImageLoader$execute$2;->invoke(Lkotlinx/coroutines/v;Lh6/c;)Ljava/lang/Object;

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
    invoke-virtual {p0, p1, p2}, Lcoil3/RealImageLoader$execute$2;->create(Ljava/lang/Object;Lh6/c;)Lh6/c;

    move-result-object p1

    check-cast p1, Lcoil3/RealImageLoader$execute$2;

    sget-object p2, Ld6/s;->a:Ld6/s;

    invoke-virtual {p1, p2}, Lcoil3/RealImageLoader$execute$2;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    .line 1
    sget-object v0, Lkotlin/coroutines/intrinsics/CoroutineSingletons;->COROUTINE_SUSPENDED:Lkotlin/coroutines/intrinsics/CoroutineSingletons;

    .line 2
    .line 3
    iget v1, p0, Lcoil3/RealImageLoader$execute$2;->label:I

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
    iget-object p1, p0, Lcoil3/RealImageLoader$execute$2;->L$0:Ljava/lang/Object;

    .line 26
    .line 27
    check-cast p1, Lkotlinx/coroutines/v;

    .line 28
    .line 29
    sget-object v1, Lkotlinx/coroutines/f0;->a:Lg7/e;

    .line 30
    .line 31
    sget-object v1, Le7/k;->a:Ld7/d;

    .line 32
    .line 33
    iget-object v1, v1, Ld7/d;->d:Ld7/d;

    .line 34
    .line 35
    new-instance v3, Lcoil3/RealImageLoader$execute$2$job$1;

    .line 36
    .line 37
    iget-object v4, p0, Lcoil3/RealImageLoader$execute$2;->this$0:Lcoil3/r;

    .line 38
    .line 39
    iget-object v5, p0, Lcoil3/RealImageLoader$execute$2;->$request:Ls/f;

    .line 40
    .line 41
    const/4 v6, 0x0

    .line 42
    invoke-direct {v3, v4, v5, v6}, Lcoil3/RealImageLoader$execute$2$job$1;-><init>(Lcoil3/r;Ls/f;Lh6/c;)V

    .line 43
    .line 44
    .line 45
    const/4 v4, 0x2

    .line 46
    invoke-static {p1, v1, v3, v4}, Lkotlinx/coroutines/x;->d(Lkotlinx/coroutines/v;Ld7/d;Lr6/e;I)Lkotlinx/coroutines/b0;

    .line 47
    .line 48
    .line 49
    move-result-object p1

    .line 50
    iget-object v1, p0, Lcoil3/RealImageLoader$execute$2;->$request:Ls/f;

    .line 51
    .line 52
    invoke-static {v1, p1}, Lcoil3/o;->d(Ls/f;Lkotlinx/coroutines/b0;)Ls/k;

    .line 53
    .line 54
    .line 55
    move-result-object p1

    .line 56
    iget-object p1, p1, Ls/k;->a:Lkotlinx/coroutines/b0;

    .line 57
    .line 58
    iput v2, p0, Lcoil3/RealImageLoader$execute$2;->label:I

    .line 59
    .line 60
    invoke-virtual {p1, p0}, Lkotlinx/coroutines/c1;->u(Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;

    .line 61
    .line 62
    .line 63
    move-result-object p1

    .line 64
    if-ne p1, v0, :cond_2

    .line 65
    .line 66
    return-object v0

    .line 67
    :cond_2
    return-object p1
.end method
