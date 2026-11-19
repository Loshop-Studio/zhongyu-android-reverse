.class final Landroidx/paging/ContiguousPagedList$deferBoundaryCallbacks$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/paging/ContiguousPagedList;->deferBoundaryCallbacks$paging_common_release(ZZZ)V
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
        "\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\u0008\u0008\u0000\u0010\u0002*\u00020\u0003\"\u0008\u0008\u0001\u0010\u0004*\u00020\u0003*\u00020\u0005H\u008a@"
    }
    d2 = {
        "<anonymous>",
        "",
        "K",
        "",
        "V",
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
    c = "androidx.paging.ContiguousPagedList$deferBoundaryCallbacks$1"
    f = "ContiguousPagedList.jvm.kt"
    i = {}
    l = {}
    m = "invokeSuspend"
    n = {}
    s = {}
.end annotation


# instance fields
.field final synthetic $deferBegin:Z

.field final synthetic $deferEmpty:Z

.field final synthetic $deferEnd:Z

.field label:I

.field final synthetic this$0:Landroidx/paging/ContiguousPagedList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/paging/ContiguousPagedList<",
            "TK;TV;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(ZLandroidx/paging/ContiguousPagedList;ZZLkotlin/coroutines/Continuation;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z",
            "Landroidx/paging/ContiguousPagedList<",
            "TK;TV;>;ZZ",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Landroidx/paging/ContiguousPagedList$deferBoundaryCallbacks$1;",
            ">;)V"
        }
    .end annotation

    iput-boolean p1, p0, Landroidx/paging/ContiguousPagedList$deferBoundaryCallbacks$1;->$deferEmpty:Z

    iput-object p2, p0, Landroidx/paging/ContiguousPagedList$deferBoundaryCallbacks$1;->this$0:Landroidx/paging/ContiguousPagedList;

    iput-boolean p3, p0, Landroidx/paging/ContiguousPagedList$deferBoundaryCallbacks$1;->$deferBegin:Z

    iput-boolean p4, p0, Landroidx/paging/ContiguousPagedList$deferBoundaryCallbacks$1;->$deferEnd:Z

    const/4 p1, 0x2

    invoke-direct {p0, p1, p5}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILkotlin/coroutines/Continuation;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;
    .locals 6
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

    new-instance v0, Landroidx/paging/ContiguousPagedList$deferBoundaryCallbacks$1;

    iget-boolean v1, p0, Landroidx/paging/ContiguousPagedList$deferBoundaryCallbacks$1;->$deferEmpty:Z

    iget-object v2, p0, Landroidx/paging/ContiguousPagedList$deferBoundaryCallbacks$1;->this$0:Landroidx/paging/ContiguousPagedList;

    iget-boolean v3, p0, Landroidx/paging/ContiguousPagedList$deferBoundaryCallbacks$1;->$deferBegin:Z

    iget-boolean v4, p0, Landroidx/paging/ContiguousPagedList$deferBoundaryCallbacks$1;->$deferEnd:Z

    move-object v5, p2

    invoke-direct/range {v0 .. v5}, Landroidx/paging/ContiguousPagedList$deferBoundaryCallbacks$1;-><init>(ZLandroidx/paging/ContiguousPagedList;ZZLkotlin/coroutines/Continuation;)V

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lkotlinx/coroutines/CoroutineScope;

    check-cast p2, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2}, Landroidx/paging/ContiguousPagedList$deferBoundaryCallbacks$1;->invoke(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

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
    invoke-virtual {p0, p1, p2}, Landroidx/paging/ContiguousPagedList$deferBoundaryCallbacks$1;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object p1

    check-cast p1, Landroidx/paging/ContiguousPagedList$deferBoundaryCallbacks$1;

    sget-object p2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Landroidx/paging/ContiguousPagedList$deferBoundaryCallbacks$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    iget v0, p0, Landroidx/paging/ContiguousPagedList$deferBoundaryCallbacks$1;->label:I

    .line 5
    .line 6
    if-nez v0, :cond_3

    .line 7
    .line 8
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 9
    .line 10
    .line 11
    iget-boolean p1, p0, Landroidx/paging/ContiguousPagedList$deferBoundaryCallbacks$1;->$deferEmpty:Z

    .line 12
    .line 13
    if-eqz p1, :cond_0

    .line 14
    .line 15
    iget-object p1, p0, Landroidx/paging/ContiguousPagedList$deferBoundaryCallbacks$1;->this$0:Landroidx/paging/ContiguousPagedList;

    .line 16
    .line 17
    invoke-virtual {p1}, Landroidx/paging/ContiguousPagedList;->getBoundaryCallback$paging_common_release()Landroidx/paging/PagedList$BoundaryCallback;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    invoke-virtual {p1}, Landroidx/paging/PagedList$BoundaryCallback;->onZeroItemsLoaded()V

    .line 22
    .line 23
    .line 24
    :cond_0
    iget-boolean p1, p0, Landroidx/paging/ContiguousPagedList$deferBoundaryCallbacks$1;->$deferBegin:Z

    .line 25
    .line 26
    const/4 v0, 0x1

    .line 27
    if-eqz p1, :cond_1

    .line 28
    .line 29
    iget-object p1, p0, Landroidx/paging/ContiguousPagedList$deferBoundaryCallbacks$1;->this$0:Landroidx/paging/ContiguousPagedList;

    .line 30
    .line 31
    invoke-static {p1, v0}, Landroidx/paging/ContiguousPagedList;->access$setBoundaryCallbackBeginDeferred$p(Landroidx/paging/ContiguousPagedList;Z)V

    .line 32
    .line 33
    .line 34
    :cond_1
    iget-boolean p1, p0, Landroidx/paging/ContiguousPagedList$deferBoundaryCallbacks$1;->$deferEnd:Z

    .line 35
    .line 36
    if-eqz p1, :cond_2

    .line 37
    .line 38
    iget-object p1, p0, Landroidx/paging/ContiguousPagedList$deferBoundaryCallbacks$1;->this$0:Landroidx/paging/ContiguousPagedList;

    .line 39
    .line 40
    invoke-static {p1, v0}, Landroidx/paging/ContiguousPagedList;->access$setBoundaryCallbackEndDeferred$p(Landroidx/paging/ContiguousPagedList;Z)V

    .line 41
    .line 42
    .line 43
    :cond_2
    iget-object p1, p0, Landroidx/paging/ContiguousPagedList$deferBoundaryCallbacks$1;->this$0:Landroidx/paging/ContiguousPagedList;

    .line 44
    .line 45
    const/4 v0, 0x0

    .line 46
    invoke-static {p1, v0}, Landroidx/paging/ContiguousPagedList;->access$tryDispatchBoundaryCallbacks(Landroidx/paging/ContiguousPagedList;Z)V

    .line 47
    .line 48
    .line 49
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 50
    .line 51
    return-object p1

    .line 52
    :cond_3
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 53
    .line 54
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 55
    .line 56
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 57
    .line 58
    .line 59
    throw p1
.end method
