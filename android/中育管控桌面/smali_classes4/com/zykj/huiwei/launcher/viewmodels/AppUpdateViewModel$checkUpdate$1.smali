.class final Lcom/zykj/huiwei/launcher/viewmodels/AppUpdateViewModel$checkUpdate$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/huiwei/launcher/viewmodels/AppUpdateViewModel;->b(Lo1/a;Ljava/lang/String;)V
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
    c = "com.zykj.huiwei.launcher.viewmodels.AppUpdateViewModel$checkUpdate$1"
    f = "AppUpdateViewModel.kt"
    i = {}
    l = {
        0x95
    }
    m = "invokeSuspend"
    n = {}
    s = {}
.end annotation


# instance fields
.field public a:I

.field public final synthetic b:Lo1/a;

.field public final synthetic c:Ljava/lang/String;

.field public final synthetic d:Lcom/zykj/huiwei/launcher/viewmodels/AppUpdateViewModel;


# direct methods
.method public constructor <init>(Lo1/a;Ljava/lang/String;Lcom/zykj/huiwei/launcher/viewmodels/AppUpdateViewModel;Lkotlin/coroutines/Continuation;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/zykj/huiwei/launcher/viewmodels/AppUpdateViewModel$checkUpdate$1;->b:Lo1/a;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/zykj/huiwei/launcher/viewmodels/AppUpdateViewModel$checkUpdate$1;->c:Ljava/lang/String;

    .line 4
    .line 5
    iput-object p3, p0, Lcom/zykj/huiwei/launcher/viewmodels/AppUpdateViewModel$checkUpdate$1;->d:Lcom/zykj/huiwei/launcher/viewmodels/AppUpdateViewModel;

    .line 6
    .line 7
    const/4 p1, 0x2

    .line 8
    invoke-direct {p0, p1, p4}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILkotlin/coroutines/Continuation;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;
    .locals 3

    new-instance p1, Lcom/zykj/huiwei/launcher/viewmodels/AppUpdateViewModel$checkUpdate$1;

    iget-object v0, p0, Lcom/zykj/huiwei/launcher/viewmodels/AppUpdateViewModel$checkUpdate$1;->b:Lo1/a;

    iget-object v1, p0, Lcom/zykj/huiwei/launcher/viewmodels/AppUpdateViewModel$checkUpdate$1;->c:Ljava/lang/String;

    iget-object v2, p0, Lcom/zykj/huiwei/launcher/viewmodels/AppUpdateViewModel$checkUpdate$1;->d:Lcom/zykj/huiwei/launcher/viewmodels/AppUpdateViewModel;

    invoke-direct {p1, v0, v1, v2, p2}, Lcom/zykj/huiwei/launcher/viewmodels/AppUpdateViewModel$checkUpdate$1;-><init>(Lo1/a;Ljava/lang/String;Lcom/zykj/huiwei/launcher/viewmodels/AppUpdateViewModel;Lkotlin/coroutines/Continuation;)V

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lkotlinx/coroutines/CoroutineScope;

    check-cast p2, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2}, Lcom/zykj/huiwei/launcher/viewmodels/AppUpdateViewModel$checkUpdate$1;->invoke(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0

    .line 2
    invoke-virtual {p0, p1, p2}, Lcom/zykj/huiwei/launcher/viewmodels/AppUpdateViewModel$checkUpdate$1;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object p1

    check-cast p1, Lcom/zykj/huiwei/launcher/viewmodels/AppUpdateViewModel$checkUpdate$1;

    sget-object p2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lcom/zykj/huiwei/launcher/viewmodels/AppUpdateViewModel$checkUpdate$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    .line 1
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget v1, p0, Lcom/zykj/huiwei/launcher/viewmodels/AppUpdateViewModel$checkUpdate$1;->a:I

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
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 13
    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 17
    .line 18
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 19
    .line 20
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    throw p1

    .line 24
    :cond_1
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 25
    .line 26
    .line 27
    iget-object p1, p0, Lcom/zykj/huiwei/launcher/viewmodels/AppUpdateViewModel$checkUpdate$1;->b:Lo1/a;

    .line 28
    .line 29
    iget-object v1, p0, Lcom/zykj/huiwei/launcher/viewmodels/AppUpdateViewModel$checkUpdate$1;->c:Ljava/lang/String;

    .line 30
    .line 31
    invoke-interface {p1, v1}, Lo1/a;->b(Ljava/lang/String;)Z

    .line 32
    .line 33
    .line 34
    move-result p1

    .line 35
    if-eqz p1, :cond_2

    .line 36
    .line 37
    iget-object p1, p0, Lcom/zykj/huiwei/launcher/viewmodels/AppUpdateViewModel$checkUpdate$1;->d:Lcom/zykj/huiwei/launcher/viewmodels/AppUpdateViewModel;

    .line 38
    .line 39
    invoke-virtual {p1}, Lcom/zykj/huiwei/launcher/viewmodels/AppUpdateViewModel;->l()Lkotlinx/coroutines/flow/MutableSharedFlow;

    .line 40
    .line 41
    .line 42
    move-result-object p1

    .line 43
    invoke-static {v2}, Lkotlin/coroutines/jvm/internal/Boxing;->boxBoolean(Z)Ljava/lang/Boolean;

    .line 44
    .line 45
    .line 46
    move-result-object v1

    .line 47
    iput v2, p0, Lcom/zykj/huiwei/launcher/viewmodels/AppUpdateViewModel$checkUpdate$1;->a:I

    .line 48
    .line 49
    invoke-interface {p1, v1, p0}, Lkotlinx/coroutines/flow/MutableSharedFlow;->emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    move-result-object p1

    .line 53
    if-ne p1, v0, :cond_2

    .line 54
    .line 55
    return-object v0

    .line 56
    :cond_2
    :goto_0
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 57
    .line 58
    return-object p1
.end method
