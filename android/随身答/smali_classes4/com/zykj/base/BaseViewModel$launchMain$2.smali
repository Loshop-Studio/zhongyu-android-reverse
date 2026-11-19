.class final Lcom/zykj/base/BaseViewModel$launchMain$2;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/base/BaseViewModel;->launchMain(Lcom/kunminx/architecture/ui/callback/UnPeekLiveData;Lcom/kunminx/architecture/ui/callback/UnPeekLiveData;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
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
        "\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"
    }
    d2 = {
        "<anonymous>",
        "",
        "Lkotlinx/coroutines/CoroutineScope;"
    }
    k = 0x3
    mv = {
        0x1,
        0x5,
        0x1
    }
    xi = 0x30
.end annotation

.annotation runtime Lkotlin/coroutines/jvm/internal/DebugMetadata;
    c = "com.zykj.base.BaseViewModel$launchMain$2"
    f = "BaseViewModel.kt"
    i = {}
    l = {
        0x52
    }
    m = "invokeSuspend"
    n = {}
    s = {}
.end annotation


# instance fields
.field public a:I

.field public synthetic b:Ljava/lang/Object;

.field public final synthetic c:Lcom/kunminx/architecture/ui/callback/UnPeekLiveData;

.field public final synthetic d:Lkotlin/jvm/functions/Function2;

.field public final synthetic e:Lcom/zykj/base/BaseViewModel;

.field public final synthetic f:Lcom/kunminx/architecture/ui/callback/UnPeekLiveData;


# direct methods
.method public constructor <init>(Lcom/kunminx/architecture/ui/callback/UnPeekLiveData;Lkotlin/jvm/functions/Function2;Lcom/zykj/base/BaseViewModel;Lcom/kunminx/architecture/ui/callback/UnPeekLiveData;Lkotlin/coroutines/Continuation;)V
    .locals 0

    iput-object p1, p0, Lcom/zykj/base/BaseViewModel$launchMain$2;->c:Lcom/kunminx/architecture/ui/callback/UnPeekLiveData;

    iput-object p2, p0, Lcom/zykj/base/BaseViewModel$launchMain$2;->d:Lkotlin/jvm/functions/Function2;

    iput-object p3, p0, Lcom/zykj/base/BaseViewModel$launchMain$2;->e:Lcom/zykj/base/BaseViewModel;

    iput-object p4, p0, Lcom/zykj/base/BaseViewModel$launchMain$2;->f:Lcom/kunminx/architecture/ui/callback/UnPeekLiveData;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p5}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILkotlin/coroutines/Continuation;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;
    .locals 6

    new-instance v0, Lcom/zykj/base/BaseViewModel$launchMain$2;

    iget-object v1, p0, Lcom/zykj/base/BaseViewModel$launchMain$2;->c:Lcom/kunminx/architecture/ui/callback/UnPeekLiveData;

    iget-object v2, p0, Lcom/zykj/base/BaseViewModel$launchMain$2;->d:Lkotlin/jvm/functions/Function2;

    iget-object v3, p0, Lcom/zykj/base/BaseViewModel$launchMain$2;->e:Lcom/zykj/base/BaseViewModel;

    iget-object v4, p0, Lcom/zykj/base/BaseViewModel$launchMain$2;->f:Lcom/kunminx/architecture/ui/callback/UnPeekLiveData;

    move-object v5, p2

    invoke-direct/range {v0 .. v5}, Lcom/zykj/base/BaseViewModel$launchMain$2;-><init>(Lcom/kunminx/architecture/ui/callback/UnPeekLiveData;Lkotlin/jvm/functions/Function2;Lcom/zykj/base/BaseViewModel;Lcom/kunminx/architecture/ui/callback/UnPeekLiveData;Lkotlin/coroutines/Continuation;)V

    iput-object p1, v0, Lcom/zykj/base/BaseViewModel$launchMain$2;->b:Ljava/lang/Object;

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lkotlinx/coroutines/CoroutineScope;

    check-cast p2, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2}, Lcom/zykj/base/BaseViewModel$launchMain$2;->invoke(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0

    .line 2
    invoke-virtual {p0, p1, p2}, Lcom/zykj/base/BaseViewModel$launchMain$2;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object p1

    check-cast p1, Lcom/zykj/base/BaseViewModel$launchMain$2;

    sget-object p2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lcom/zykj/base/BaseViewModel$launchMain$2;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    .line 1
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget v1, p0, Lcom/zykj/base/BaseViewModel$launchMain$2;->a:I

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    const/4 v3, 0x1

    .line 9
    if-eqz v1, :cond_1

    .line 10
    .line 11
    if-ne v1, v3, :cond_0

    .line 12
    .line 13
    :try_start_0
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 14
    .line 15
    .line 16
    goto :goto_1

    .line 17
    :catchall_0
    move-exception p1

    .line 18
    goto :goto_2

    .line 19
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 20
    .line 21
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 22
    .line 23
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    throw p1

    .line 27
    :cond_1
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 28
    .line 29
    .line 30
    iget-object p1, p0, Lcom/zykj/base/BaseViewModel$launchMain$2;->b:Ljava/lang/Object;

    .line 31
    .line 32
    check-cast p1, Lkotlinx/coroutines/CoroutineScope;

    .line 33
    .line 34
    iget-object v1, p0, Lcom/zykj/base/BaseViewModel$launchMain$2;->c:Lcom/kunminx/architecture/ui/callback/UnPeekLiveData;

    .line 35
    .line 36
    if-nez v1, :cond_2

    .line 37
    .line 38
    goto :goto_0

    .line 39
    :cond_2
    invoke-static {v3}, Lkotlin/coroutines/jvm/internal/Boxing;->boxBoolean(Z)Ljava/lang/Boolean;

    .line 40
    .line 41
    .line 42
    move-result-object v4

    .line 43
    invoke-virtual {v1, v4}, Lcom/kunminx/architecture/ui/callback/UnPeekLiveData;->setValue(Ljava/lang/Object;)V

    .line 44
    .line 45
    .line 46
    :goto_0
    :try_start_1
    iget-object v1, p0, Lcom/zykj/base/BaseViewModel$launchMain$2;->d:Lkotlin/jvm/functions/Function2;

    .line 47
    .line 48
    iput v3, p0, Lcom/zykj/base/BaseViewModel$launchMain$2;->a:I

    .line 49
    .line 50
    invoke-interface {v1, p1, p0}, Lkotlin/jvm/functions/Function2;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    move-result-object p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 54
    if-ne p1, v0, :cond_3

    .line 55
    .line 56
    return-object v0

    .line 57
    :cond_3
    :goto_1
    iget-object p1, p0, Lcom/zykj/base/BaseViewModel$launchMain$2;->c:Lcom/kunminx/architecture/ui/callback/UnPeekLiveData;

    .line 58
    .line 59
    if-nez p1, :cond_4

    .line 60
    .line 61
    goto :goto_3

    .line 62
    :cond_4
    invoke-static {v2}, Lkotlin/coroutines/jvm/internal/Boxing;->boxBoolean(Z)Ljava/lang/Boolean;

    .line 63
    .line 64
    .line 65
    move-result-object v0

    .line 66
    invoke-virtual {p1, v0}, Lcom/kunminx/architecture/ui/callback/UnPeekLiveData;->setValue(Ljava/lang/Object;)V

    .line 67
    .line 68
    .line 69
    goto :goto_3

    .line 70
    :goto_2
    :try_start_2
    iget-object v0, p0, Lcom/zykj/base/BaseViewModel$launchMain$2;->e:Lcom/zykj/base/BaseViewModel;

    .line 71
    .line 72
    iget-object v1, p0, Lcom/zykj/base/BaseViewModel$launchMain$2;->f:Lcom/kunminx/architecture/ui/callback/UnPeekLiveData;

    .line 73
    .line 74
    invoke-virtual {v0, p1, v1}, Lcom/zykj/base/BaseViewModel;->handlerThrowable(Ljava/lang/Throwable;Lcom/kunminx/architecture/ui/callback/UnPeekLiveData;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 75
    .line 76
    .line 77
    iget-object p1, p0, Lcom/zykj/base/BaseViewModel$launchMain$2;->c:Lcom/kunminx/architecture/ui/callback/UnPeekLiveData;

    .line 78
    .line 79
    if-nez p1, :cond_4

    .line 80
    .line 81
    :goto_3
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 82
    .line 83
    return-object p1

    .line 84
    :catchall_1
    move-exception p1

    .line 85
    iget-object v0, p0, Lcom/zykj/base/BaseViewModel$launchMain$2;->c:Lcom/kunminx/architecture/ui/callback/UnPeekLiveData;

    .line 86
    .line 87
    if-nez v0, :cond_5

    .line 88
    .line 89
    goto :goto_4

    .line 90
    :cond_5
    invoke-static {v2}, Lkotlin/coroutines/jvm/internal/Boxing;->boxBoolean(Z)Ljava/lang/Boolean;

    .line 91
    .line 92
    .line 93
    move-result-object v1

    .line 94
    invoke-virtual {v0, v1}, Lcom/kunminx/architecture/ui/callback/UnPeekLiveData;->setValue(Ljava/lang/Object;)V

    .line 95
    .line 96
    .line 97
    :goto_4
    throw p1
.end method
