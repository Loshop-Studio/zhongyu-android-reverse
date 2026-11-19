.class final Lcom/zykj/huiwei/launcher/viewmodels/MainViewModel$updateAllAppList$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/huiwei/launcher/viewmodels/MainViewModel;->o()V
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
        0x2,
        0x0
    }
    xi = 0x30
.end annotation

.annotation runtime Lkotlin/coroutines/jvm/internal/DebugMetadata;
    c = "com.zykj.huiwei.launcher.viewmodels.MainViewModel$updateAllAppList$1"
    f = "MainViewModel.kt"
    i = {}
    l = {
        0x58
    }
    m = "invokeSuspend"
    n = {}
    s = {}
.end annotation


# instance fields
.field public a:Ljava/lang/Object;

.field public b:Ljava/lang/Object;

.field public c:I

.field public final synthetic d:Lcom/zykj/huiwei/launcher/viewmodels/MainViewModel;


# direct methods
.method public constructor <init>(Lcom/zykj/huiwei/launcher/viewmodels/MainViewModel;Lkotlin/coroutines/Continuation;)V
    .locals 0

    iput-object p1, p0, Lcom/zykj/huiwei/launcher/viewmodels/MainViewModel$updateAllAppList$1;->d:Lcom/zykj/huiwei/launcher/viewmodels/MainViewModel;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILkotlin/coroutines/Continuation;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;
    .locals 1

    new-instance p1, Lcom/zykj/huiwei/launcher/viewmodels/MainViewModel$updateAllAppList$1;

    iget-object v0, p0, Lcom/zykj/huiwei/launcher/viewmodels/MainViewModel$updateAllAppList$1;->d:Lcom/zykj/huiwei/launcher/viewmodels/MainViewModel;

    invoke-direct {p1, v0, p2}, Lcom/zykj/huiwei/launcher/viewmodels/MainViewModel$updateAllAppList$1;-><init>(Lcom/zykj/huiwei/launcher/viewmodels/MainViewModel;Lkotlin/coroutines/Continuation;)V

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lkotlinx/coroutines/CoroutineScope;

    check-cast p2, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2}, Lcom/zykj/huiwei/launcher/viewmodels/MainViewModel$updateAllAppList$1;->invoke(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0

    .line 2
    invoke-virtual {p0, p1, p2}, Lcom/zykj/huiwei/launcher/viewmodels/MainViewModel$updateAllAppList$1;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object p1

    check-cast p1, Lcom/zykj/huiwei/launcher/viewmodels/MainViewModel$updateAllAppList$1;

    sget-object p2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lcom/zykj/huiwei/launcher/viewmodels/MainViewModel$updateAllAppList$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    .line 1
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget v1, p0, Lcom/zykj/huiwei/launcher/viewmodels/MainViewModel$updateAllAppList$1;->c:I

    .line 6
    .line 7
    const/4 v2, 0x1

    .line 8
    if-eqz v1, :cond_1

    .line 9
    .line 10
    if-ne v1, v2, :cond_0

    .line 11
    .line 12
    iget-object v0, p0, Lcom/zykj/huiwei/launcher/viewmodels/MainViewModel$updateAllAppList$1;->b:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast v0, Lkotlin/Triple;

    .line 15
    .line 16
    iget-object v1, p0, Lcom/zykj/huiwei/launcher/viewmodels/MainViewModel$updateAllAppList$1;->a:Ljava/lang/Object;

    .line 17
    .line 18
    check-cast v1, Lkotlinx/coroutines/flow/MutableStateFlow;

    .line 19
    .line 20
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 21
    .line 22
    .line 23
    move-object v6, p1

    .line 24
    move-object v3, v0

    .line 25
    goto :goto_0

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
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 35
    .line 36
    .line 37
    iget-object p1, p0, Lcom/zykj/huiwei/launcher/viewmodels/MainViewModel$updateAllAppList$1;->d:Lcom/zykj/huiwei/launcher/viewmodels/MainViewModel;

    .line 38
    .line 39
    invoke-static {p1}, Lcom/zykj/huiwei/launcher/viewmodels/MainViewModel;->e(Lcom/zykj/huiwei/launcher/viewmodels/MainViewModel;)Lkotlinx/coroutines/flow/MutableStateFlow;

    .line 40
    .line 41
    .line 42
    move-result-object v1

    .line 43
    iget-object p1, p0, Lcom/zykj/huiwei/launcher/viewmodels/MainViewModel$updateAllAppList$1;->d:Lcom/zykj/huiwei/launcher/viewmodels/MainViewModel;

    .line 44
    .line 45
    invoke-static {p1}, Lcom/zykj/huiwei/launcher/viewmodels/MainViewModel;->e(Lcom/zykj/huiwei/launcher/viewmodels/MainViewModel;)Lkotlinx/coroutines/flow/MutableStateFlow;

    .line 46
    .line 47
    .line 48
    move-result-object p1

    .line 49
    invoke-interface {p1}, Lkotlinx/coroutines/flow/MutableStateFlow;->getValue()Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    move-result-object p1

    .line 53
    check-cast p1, Lkotlin/Triple;

    .line 54
    .line 55
    iget-object v3, p0, Lcom/zykj/huiwei/launcher/viewmodels/MainViewModel$updateAllAppList$1;->d:Lcom/zykj/huiwei/launcher/viewmodels/MainViewModel;

    .line 56
    .line 57
    iput-object v1, p0, Lcom/zykj/huiwei/launcher/viewmodels/MainViewModel$updateAllAppList$1;->a:Ljava/lang/Object;

    .line 58
    .line 59
    iput-object p1, p0, Lcom/zykj/huiwei/launcher/viewmodels/MainViewModel$updateAllAppList$1;->b:Ljava/lang/Object;

    .line 60
    .line 61
    iput v2, p0, Lcom/zykj/huiwei/launcher/viewmodels/MainViewModel$updateAllAppList$1;->c:I

    .line 62
    .line 63
    invoke-static {v3, p0}, Lcom/zykj/huiwei/launcher/viewmodels/MainViewModel;->d(Lcom/zykj/huiwei/launcher/viewmodels/MainViewModel;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 64
    .line 65
    .line 66
    move-result-object v2

    .line 67
    if-ne v2, v0, :cond_2

    .line 68
    .line 69
    return-object v0

    .line 70
    :cond_2
    move-object v3, p1

    .line 71
    move-object v6, v2

    .line 72
    :goto_0
    const/4 v7, 0x3

    .line 73
    const/4 v8, 0x0

    .line 74
    const/4 v4, 0x0

    .line 75
    const/4 v5, 0x0

    .line 76
    invoke-static/range {v3 .. v8}, Lkotlin/Triple;->copy$default(Lkotlin/Triple;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;ILjava/lang/Object;)Lkotlin/Triple;

    .line 77
    .line 78
    .line 79
    move-result-object p1

    .line 80
    invoke-interface {v1, p1}, Lkotlinx/coroutines/flow/MutableStateFlow;->setValue(Ljava/lang/Object;)V

    .line 81
    .line 82
    .line 83
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 84
    .line 85
    return-object p1
.end method
