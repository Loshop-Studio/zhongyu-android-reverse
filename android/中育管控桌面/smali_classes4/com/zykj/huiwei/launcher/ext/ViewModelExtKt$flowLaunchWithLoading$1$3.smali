.class final Lcom/zykj/huiwei/launcher/ext/ViewModelExtKt$flowLaunchWithLoading$1$3;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/huiwei/launcher/ext/ViewModelExtKt$flowLaunchWithLoading$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/coroutines/jvm/internal/SuspendLambda;",
        "Lkotlin/jvm/functions/Function3<",
        "Lkotlinx/coroutines/flow/FlowCollector<",
        "Ljava/lang/Object;",
        ">;",
        "Ljava/lang/Throwable;",
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
        "\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\u0010\u0000\u001a\u00020\u0001\"\u0004\u0008\u0000\u0010\u0002*\u0008\u0012\u0004\u0012\u0002H\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n"
    }
    d2 = {
        "<anonymous>",
        "",
        "T",
        "Lkotlinx/coroutines/flow/FlowCollector;",
        "it",
        ""
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
    c = "com.zykj.huiwei.launcher.ext.ViewModelExtKt$flowLaunchWithLoading$1$3"
    f = "ViewModelExt.kt"
    i = {
        0x0,
        0x0
    }
    l = {
        0x67
    }
    m = "invokeSuspend"
    n = {
        "it",
        "toastMessage"
    }
    s = {
        "L$0",
        "L$1"
    }
.end annotation


# instance fields
.field public a:Ljava/lang/Object;

.field public b:I

.field public synthetic c:Ljava/lang/Object;

.field public final synthetic d:Lkotlin/jvm/functions/Function2;

.field public final synthetic e:Lcom/zykj/base/BaseViewModel;


# direct methods
.method public constructor <init>(Lkotlin/jvm/functions/Function2;Lcom/zykj/base/BaseViewModel;Lkotlin/coroutines/Continuation;)V
    .locals 0

    iput-object p1, p0, Lcom/zykj/huiwei/launcher/ext/ViewModelExtKt$flowLaunchWithLoading$1$3;->d:Lkotlin/jvm/functions/Function2;

    iput-object p2, p0, Lcom/zykj/huiwei/launcher/ext/ViewModelExtKt$flowLaunchWithLoading$1$3;->e:Lcom/zykj/base/BaseViewModel;

    const/4 p1, 0x3

    invoke-direct {p0, p1, p3}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILkotlin/coroutines/Continuation;)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lkotlinx/coroutines/flow/FlowCollector;

    check-cast p2, Ljava/lang/Throwable;

    check-cast p3, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2, p3}, Lcom/zykj/huiwei/launcher/ext/ViewModelExtKt$flowLaunchWithLoading$1$3;->invoke(Lkotlinx/coroutines/flow/FlowCollector;Ljava/lang/Throwable;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Lkotlinx/coroutines/flow/FlowCollector;Ljava/lang/Throwable;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 2

    .line 2
    new-instance p1, Lcom/zykj/huiwei/launcher/ext/ViewModelExtKt$flowLaunchWithLoading$1$3;

    iget-object v0, p0, Lcom/zykj/huiwei/launcher/ext/ViewModelExtKt$flowLaunchWithLoading$1$3;->d:Lkotlin/jvm/functions/Function2;

    iget-object v1, p0, Lcom/zykj/huiwei/launcher/ext/ViewModelExtKt$flowLaunchWithLoading$1$3;->e:Lcom/zykj/base/BaseViewModel;

    invoke-direct {p1, v0, v1, p3}, Lcom/zykj/huiwei/launcher/ext/ViewModelExtKt$flowLaunchWithLoading$1$3;-><init>(Lkotlin/jvm/functions/Function2;Lcom/zykj/base/BaseViewModel;Lkotlin/coroutines/Continuation;)V

    iput-object p2, p1, Lcom/zykj/huiwei/launcher/ext/ViewModelExtKt$flowLaunchWithLoading$1$3;->c:Ljava/lang/Object;

    sget-object p2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lcom/zykj/huiwei/launcher/ext/ViewModelExtKt$flowLaunchWithLoading$1$3;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    .line 1
    iget-object v0, p0, Lcom/zykj/huiwei/launcher/ext/ViewModelExtKt$flowLaunchWithLoading$1$3;->c:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ljava/lang/Throwable;

    .line 4
    .line 5
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    iget v2, p0, Lcom/zykj/huiwei/launcher/ext/ViewModelExtKt$flowLaunchWithLoading$1$3;->b:I

    .line 10
    .line 11
    const/4 v3, 0x1

    .line 12
    if-eqz v2, :cond_1

    .line 13
    .line 14
    if-ne v2, v3, :cond_0

    .line 15
    .line 16
    iget-object v0, p0, Lcom/zykj/huiwei/launcher/ext/ViewModelExtKt$flowLaunchWithLoading$1$3;->a:Ljava/lang/Object;

    .line 17
    .line 18
    check-cast v0, Lcom/zykj/base/bean/toast/ToastMessage;

    .line 19
    .line 20
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 21
    .line 22
    .line 23
    goto/16 :goto_1

    .line 24
    .line 25
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 26
    .line 27
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 28
    .line 29
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    throw p1

    .line 33
    :cond_1
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 34
    .line 35
    .line 36
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 37
    .line 38
    .line 39
    move-result-object p1

    .line 40
    invoke-virtual {p1}, Ljava/lang/Thread;->getName()Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object p1

    .line 44
    new-instance v2, Ljava/lang/StringBuilder;

    .line 45
    .line 46
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 47
    .line 48
    .line 49
    const-string v4, "flow.catch--->"

    .line 50
    .line 51
    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 52
    .line 53
    .line 54
    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 55
    .line 56
    .line 57
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 58
    .line 59
    .line 60
    move-result-object p1

    .line 61
    filled-new-array {p1}, [Ljava/lang/Object;

    .line 62
    .line 63
    .line 64
    move-result-object p1

    .line 65
    invoke-static {p1}, Lcom/blankj/utilcode/util/s;->k([Ljava/lang/Object;)V

    .line 66
    .line 67
    .line 68
    invoke-virtual {v0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    .line 69
    .line 70
    .line 71
    move-result-object p1

    .line 72
    if-eqz p1, :cond_2

    .line 73
    .line 74
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 75
    .line 76
    .line 77
    :cond_2
    instance-of p1, v0, Lcom/zykj/http/exception/RemoteCodeException;

    .line 78
    .line 79
    if-eqz p1, :cond_3

    .line 80
    .line 81
    new-instance p1, Lcom/zykj/base/bean/toast/ToastErrorCodeMessage;

    .line 82
    .line 83
    move-object v2, v0

    .line 84
    check-cast v2, Lcom/zykj/http/exception/RemoteCodeException;

    .line 85
    .line 86
    invoke-virtual {v2}, Lcom/zykj/http/exception/RemoteCodeException;->getErrorCodeInfo()Lcom/zykj/lib/error/code/ErrorCodeInfo;

    .line 87
    .line 88
    .line 89
    move-result-object v2

    .line 90
    invoke-direct {p1, v2}, Lcom/zykj/base/bean/toast/ToastErrorCodeMessage;-><init>(Lcom/zykj/lib/error/code/ErrorCodeInfo;)V

    .line 91
    .line 92
    .line 93
    goto :goto_0

    .line 94
    :cond_3
    new-instance v4, Lcom/zykj/base/bean/toast/ToastErrorMessage;

    .line 95
    .line 96
    const/4 p1, -0x1

    .line 97
    invoke-static {p1}, Lkotlin/coroutines/jvm/internal/Boxing;->boxInt(I)Ljava/lang/Integer;

    .line 98
    .line 99
    .line 100
    move-result-object v5

    .line 101
    const/4 v8, 0x4

    .line 102
    const/4 v9, 0x0

    .line 103
    const-string v6, "\u672a\u77e5\u9519\u8bef"

    .line 104
    .line 105
    const/4 v7, 0x0

    .line 106
    invoke-direct/range {v4 .. v9}, Lcom/zykj/base/bean/toast/ToastErrorMessage;-><init>(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 107
    .line 108
    .line 109
    move-object p1, v4

    .line 110
    :goto_0
    invoke-static {}, Lkotlinx/coroutines/Dispatchers;->getMain()Lkotlinx/coroutines/MainCoroutineDispatcher;

    .line 111
    .line 112
    .line 113
    move-result-object v2

    .line 114
    new-instance v4, Lcom/zykj/huiwei/launcher/ext/ViewModelExtKt$flowLaunchWithLoading$1$3$1;

    .line 115
    .line 116
    iget-object v5, p0, Lcom/zykj/huiwei/launcher/ext/ViewModelExtKt$flowLaunchWithLoading$1$3;->d:Lkotlin/jvm/functions/Function2;

    .line 117
    .line 118
    iget-object v6, p0, Lcom/zykj/huiwei/launcher/ext/ViewModelExtKt$flowLaunchWithLoading$1$3;->e:Lcom/zykj/base/BaseViewModel;

    .line 119
    .line 120
    const/4 v7, 0x0

    .line 121
    invoke-direct {v4, v5, p1, v6, v7}, Lcom/zykj/huiwei/launcher/ext/ViewModelExtKt$flowLaunchWithLoading$1$3$1;-><init>(Lkotlin/jvm/functions/Function2;Lcom/zykj/base/bean/toast/ToastMessage;Lcom/zykj/base/BaseViewModel;Lkotlin/coroutines/Continuation;)V

    .line 122
    .line 123
    .line 124
    invoke-static {v0}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 125
    .line 126
    .line 127
    move-result-object v0

    .line 128
    iput-object v0, p0, Lcom/zykj/huiwei/launcher/ext/ViewModelExtKt$flowLaunchWithLoading$1$3;->c:Ljava/lang/Object;

    .line 129
    .line 130
    invoke-static {p1}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 131
    .line 132
    .line 133
    move-result-object p1

    .line 134
    iput-object p1, p0, Lcom/zykj/huiwei/launcher/ext/ViewModelExtKt$flowLaunchWithLoading$1$3;->a:Ljava/lang/Object;

    .line 135
    .line 136
    iput v3, p0, Lcom/zykj/huiwei/launcher/ext/ViewModelExtKt$flowLaunchWithLoading$1$3;->b:I

    .line 137
    .line 138
    invoke-static {v2, v4, p0}, Lkotlinx/coroutines/BuildersKt;->withContext(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 139
    .line 140
    .line 141
    move-result-object p1

    .line 142
    if-ne p1, v1, :cond_4

    .line 143
    .line 144
    return-object v1

    .line 145
    :cond_4
    :goto_1
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 146
    .line 147
    return-object p1
.end method
