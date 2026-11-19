.class final Lcom/zykj/huiwei/launcher/viewmodels/HomeViewModel$getUnReadCount$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/huiwei/launcher/viewmodels/HomeViewModel;->I()V
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
    c = "com.zykj.huiwei.launcher.viewmodels.HomeViewModel$getUnReadCount$1"
    f = "HomeViewModel.kt"
    i = {}
    l = {
        0xe5
    }
    m = "invokeSuspend"
    n = {}
    s = {}
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nHomeViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HomeViewModel.kt\ncom/zykj/huiwei/launcher/viewmodels/HomeViewModel$getUnReadCount$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,373:1\n295#2,2:374\n*S KotlinDebug\n*F\n+ 1 HomeViewModel.kt\ncom/zykj/huiwei/launcher/viewmodels/HomeViewModel$getUnReadCount$1\n*L\n231#1:374,2\n*E\n"
    }
.end annotation


# instance fields
.field public a:I

.field public final synthetic b:Lcom/zykj/huiwei/launcher/viewmodels/HomeViewModel;


# direct methods
.method public constructor <init>(Lcom/zykj/huiwei/launcher/viewmodels/HomeViewModel;Lkotlin/coroutines/Continuation;)V
    .locals 0

    iput-object p1, p0, Lcom/zykj/huiwei/launcher/viewmodels/HomeViewModel$getUnReadCount$1;->b:Lcom/zykj/huiwei/launcher/viewmodels/HomeViewModel;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILkotlin/coroutines/Continuation;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;
    .locals 1

    new-instance p1, Lcom/zykj/huiwei/launcher/viewmodels/HomeViewModel$getUnReadCount$1;

    iget-object v0, p0, Lcom/zykj/huiwei/launcher/viewmodels/HomeViewModel$getUnReadCount$1;->b:Lcom/zykj/huiwei/launcher/viewmodels/HomeViewModel;

    invoke-direct {p1, v0, p2}, Lcom/zykj/huiwei/launcher/viewmodels/HomeViewModel$getUnReadCount$1;-><init>(Lcom/zykj/huiwei/launcher/viewmodels/HomeViewModel;Lkotlin/coroutines/Continuation;)V

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lkotlinx/coroutines/CoroutineScope;

    check-cast p2, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2}, Lcom/zykj/huiwei/launcher/viewmodels/HomeViewModel$getUnReadCount$1;->invoke(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0

    .line 2
    invoke-virtual {p0, p1, p2}, Lcom/zykj/huiwei/launcher/viewmodels/HomeViewModel$getUnReadCount$1;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object p1

    check-cast p1, Lcom/zykj/huiwei/launcher/viewmodels/HomeViewModel$getUnReadCount$1;

    sget-object p2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lcom/zykj/huiwei/launcher/viewmodels/HomeViewModel$getUnReadCount$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    iget v1, p0, Lcom/zykj/huiwei/launcher/viewmodels/HomeViewModel$getUnReadCount$1;->a:I

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
    iget-object p1, p0, Lcom/zykj/huiwei/launcher/viewmodels/HomeViewModel$getUnReadCount$1;->b:Lcom/zykj/huiwei/launcher/viewmodels/HomeViewModel;

    .line 28
    .line 29
    invoke-static {p1}, Lcom/zykj/huiwei/launcher/viewmodels/HomeViewModel;->k(Lcom/zykj/huiwei/launcher/viewmodels/HomeViewModel;)Lcom/zykj/huiwei/launcher/repository/NotificationRepository;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    iput v2, p0, Lcom/zykj/huiwei/launcher/viewmodels/HomeViewModel$getUnReadCount$1;->a:I

    .line 34
    .line 35
    invoke-virtual {p1, p0}, Lcom/zykj/huiwei/launcher/repository/NotificationRepository;->f(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object p1

    .line 39
    if-ne p1, v0, :cond_2

    .line 40
    .line 41
    return-object v0

    .line 42
    :cond_2
    :goto_0
    check-cast p1, Ljava/util/List;

    .line 43
    .line 44
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 45
    .line 46
    .line 47
    move-result-object p1

    .line 48
    :cond_3
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 49
    .line 50
    .line 51
    move-result v0

    .line 52
    if-eqz v0, :cond_4

    .line 53
    .line 54
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    move-result-object v0

    .line 58
    move-object v1, v0

    .line 59
    check-cast v1, Lcom/zykj/huiwei/launcher/bean/resp/UnReadMessageBean;

    .line 60
    .line 61
    invoke-virtual {v1}, Lcom/zykj/huiwei/launcher/bean/resp/UnReadMessageBean;->getType()I

    .line 62
    .line 63
    .line 64
    move-result v1

    .line 65
    sget-object v3, Lcom/zykj/huiwei/launcher/bean/resp/MessageType;->NoticePublish:Lcom/zykj/huiwei/launcher/bean/resp/MessageType;

    .line 66
    .line 67
    invoke-virtual {v3}, Lcom/zykj/huiwei/launcher/bean/resp/MessageType;->getType()I

    .line 68
    .line 69
    .line 70
    move-result v3

    .line 71
    if-ne v1, v3, :cond_3

    .line 72
    .line 73
    goto :goto_1

    .line 74
    :cond_4
    const/4 v0, 0x0

    .line 75
    :goto_1
    check-cast v0, Lcom/zykj/huiwei/launcher/bean/resp/UnReadMessageBean;

    .line 76
    .line 77
    const/4 p1, 0x0

    .line 78
    if-eqz v0, :cond_5

    .line 79
    .line 80
    invoke-virtual {v0}, Lcom/zykj/huiwei/launcher/bean/resp/UnReadMessageBean;->getCount()I

    .line 81
    .line 82
    .line 83
    move-result v0

    .line 84
    goto :goto_2

    .line 85
    :cond_5
    move v0, p1

    .line 86
    :goto_2
    iget-object v1, p0, Lcom/zykj/huiwei/launcher/viewmodels/HomeViewModel$getUnReadCount$1;->b:Lcom/zykj/huiwei/launcher/viewmodels/HomeViewModel;

    .line 87
    .line 88
    invoke-static {v1}, Lcom/zykj/huiwei/launcher/viewmodels/HomeViewModel;->u(Lcom/zykj/huiwei/launcher/viewmodels/HomeViewModel;)Landroidx/lifecycle/MutableLiveData;

    .line 89
    .line 90
    .line 91
    move-result-object v1

    .line 92
    invoke-static {v0}, Lkotlin/coroutines/jvm/internal/Boxing;->boxInt(I)Ljava/lang/Integer;

    .line 93
    .line 94
    .line 95
    move-result-object v3

    .line 96
    invoke-virtual {v1, v3}, Landroidx/lifecycle/MutableLiveData;->postValue(Ljava/lang/Object;)V

    .line 97
    .line 98
    .line 99
    iget-object v1, p0, Lcom/zykj/huiwei/launcher/viewmodels/HomeViewModel$getUnReadCount$1;->b:Lcom/zykj/huiwei/launcher/viewmodels/HomeViewModel;

    .line 100
    .line 101
    invoke-static {v1}, Lcom/zykj/huiwei/launcher/viewmodels/HomeViewModel;->t(Lcom/zykj/huiwei/launcher/viewmodels/HomeViewModel;)Landroidx/lifecycle/MutableLiveData;

    .line 102
    .line 103
    .line 104
    move-result-object v1

    .line 105
    invoke-static {p1}, Lkotlin/coroutines/jvm/internal/Boxing;->boxInt(I)Ljava/lang/Integer;

    .line 106
    .line 107
    .line 108
    move-result-object v3

    .line 109
    invoke-virtual {v1, v3}, Landroidx/lifecycle/MutableLiveData;->postValue(Ljava/lang/Object;)V

    .line 110
    .line 111
    .line 112
    iget-object v1, p0, Lcom/zykj/huiwei/launcher/viewmodels/HomeViewModel$getUnReadCount$1;->b:Lcom/zykj/huiwei/launcher/viewmodels/HomeViewModel;

    .line 113
    .line 114
    invoke-static {v1}, Lcom/zykj/huiwei/launcher/viewmodels/HomeViewModel;->m(Lcom/zykj/huiwei/launcher/viewmodels/HomeViewModel;)Landroidx/lifecycle/MutableLiveData;

    .line 115
    .line 116
    .line 117
    move-result-object v1

    .line 118
    if-lez v0, :cond_6

    .line 119
    .line 120
    goto :goto_3

    .line 121
    :cond_6
    move v2, p1

    .line 122
    :goto_3
    invoke-static {v2}, Lkotlin/coroutines/jvm/internal/Boxing;->boxBoolean(Z)Ljava/lang/Boolean;

    .line 123
    .line 124
    .line 125
    move-result-object p1

    .line 126
    invoke-virtual {v1, p1}, Landroidx/lifecycle/MutableLiveData;->postValue(Ljava/lang/Object;)V

    .line 127
    .line 128
    .line 129
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 130
    .line 131
    return-object p1
.end method
