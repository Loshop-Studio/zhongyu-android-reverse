.class final Lcom/zykj/huiwei/launcher/viewmodels/AppUpdateViewModel$checkDownloadSuccess$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/huiwei/launcher/viewmodels/AppUpdateViewModel;->a(Lcom/zykj/huiwei/launcher/bean/resp/VersionInfo;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/coroutines/jvm/internal/SuspendLambda;",
        "Lkotlin/jvm/functions/Function2<",
        "Lkotlinx/coroutines/flow/FlowCollector<",
        "-",
        "Ljava/lang/String;",
        ">;",
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
        "\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\u0010\u0000\u001a\u00020\u0001*\u0008\u0012\u0004\u0012\u00020\u00030\u0002H\n"
    }
    d2 = {
        "<anonymous>",
        "",
        "Lkotlinx/coroutines/flow/FlowCollector;",
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
    c = "com.zykj.huiwei.launcher.viewmodels.AppUpdateViewModel$checkDownloadSuccess$1"
    f = "AppUpdateViewModel.kt"
    i = {
        0x0,
        0x0,
        0x1,
        0x1,
        0x1
    }
    l = {
        0x5f,
        0x63
    }
    m = "invokeSuspend"
    n = {
        "$this$flow",
        "downloadProxy",
        "$this$flow",
        "downloadProxy",
        "path"
    }
    s = {
        "L$0",
        "L$1",
        "L$0",
        "L$1",
        "L$2"
    }
.end annotation


# instance fields
.field public a:Ljava/lang/Object;

.field public b:Ljava/lang/Object;

.field public c:I

.field public synthetic d:Ljava/lang/Object;

.field public final synthetic e:Lcom/zykj/huiwei/launcher/bean/resp/VersionInfo;


# direct methods
.method public constructor <init>(Lcom/zykj/huiwei/launcher/bean/resp/VersionInfo;Lkotlin/coroutines/Continuation;)V
    .locals 0

    iput-object p1, p0, Lcom/zykj/huiwei/launcher/viewmodels/AppUpdateViewModel$checkDownloadSuccess$1;->e:Lcom/zykj/huiwei/launcher/bean/resp/VersionInfo;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILkotlin/coroutines/Continuation;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;
    .locals 2

    new-instance v0, Lcom/zykj/huiwei/launcher/viewmodels/AppUpdateViewModel$checkDownloadSuccess$1;

    iget-object v1, p0, Lcom/zykj/huiwei/launcher/viewmodels/AppUpdateViewModel$checkDownloadSuccess$1;->e:Lcom/zykj/huiwei/launcher/bean/resp/VersionInfo;

    invoke-direct {v0, v1, p2}, Lcom/zykj/huiwei/launcher/viewmodels/AppUpdateViewModel$checkDownloadSuccess$1;-><init>(Lcom/zykj/huiwei/launcher/bean/resp/VersionInfo;Lkotlin/coroutines/Continuation;)V

    iput-object p1, v0, Lcom/zykj/huiwei/launcher/viewmodels/AppUpdateViewModel$checkDownloadSuccess$1;->d:Ljava/lang/Object;

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lkotlinx/coroutines/flow/FlowCollector;

    check-cast p2, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2}, Lcom/zykj/huiwei/launcher/viewmodels/AppUpdateViewModel$checkDownloadSuccess$1;->invoke(Lkotlinx/coroutines/flow/FlowCollector;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Lkotlinx/coroutines/flow/FlowCollector;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0

    .line 2
    invoke-virtual {p0, p1, p2}, Lcom/zykj/huiwei/launcher/viewmodels/AppUpdateViewModel$checkDownloadSuccess$1;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object p1

    check-cast p1, Lcom/zykj/huiwei/launcher/viewmodels/AppUpdateViewModel$checkDownloadSuccess$1;

    sget-object p2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lcom/zykj/huiwei/launcher/viewmodels/AppUpdateViewModel$checkDownloadSuccess$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    .line 1
    iget-object v0, p0, Lcom/zykj/huiwei/launcher/viewmodels/AppUpdateViewModel$checkDownloadSuccess$1;->d:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lkotlinx/coroutines/flow/FlowCollector;

    .line 4
    .line 5
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    iget v2, p0, Lcom/zykj/huiwei/launcher/viewmodels/AppUpdateViewModel$checkDownloadSuccess$1;->c:I

    .line 10
    .line 11
    const/4 v3, 0x2

    .line 12
    const/4 v4, 0x1

    .line 13
    if-eqz v2, :cond_2

    .line 14
    .line 15
    if-eq v2, v4, :cond_1

    .line 16
    .line 17
    if-ne v2, v3, :cond_0

    .line 18
    .line 19
    iget-object v0, p0, Lcom/zykj/huiwei/launcher/viewmodels/AppUpdateViewModel$checkDownloadSuccess$1;->b:Ljava/lang/Object;

    .line 20
    .line 21
    check-cast v0, Ljava/lang/String;

    .line 22
    .line 23
    iget-object v0, p0, Lcom/zykj/huiwei/launcher/viewmodels/AppUpdateViewModel$checkDownloadSuccess$1;->a:Ljava/lang/Object;

    .line 24
    .line 25
    check-cast v0, Lcom/zykj/download/work/DownloadFileWorkProxy;

    .line 26
    .line 27
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 28
    .line 29
    .line 30
    goto :goto_2

    .line 31
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 32
    .line 33
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 34
    .line 35
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 36
    .line 37
    .line 38
    throw p1

    .line 39
    :cond_1
    iget-object v2, p0, Lcom/zykj/huiwei/launcher/viewmodels/AppUpdateViewModel$checkDownloadSuccess$1;->a:Ljava/lang/Object;

    .line 40
    .line 41
    check-cast v2, Lcom/zykj/download/work/DownloadFileWorkProxy;

    .line 42
    .line 43
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 44
    .line 45
    .line 46
    goto :goto_0

    .line 47
    :cond_2
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 48
    .line 49
    .line 50
    new-instance v2, Lcom/zykj/download/work/DownloadFileWorkProxy;

    .line 51
    .line 52
    sget-object p1, Lcom/zykj/huiwei/launcher/app/App;->Companion:Lcom/zykj/huiwei/launcher/app/App$a;

    .line 53
    .line 54
    invoke-virtual {p1}, Lcom/zykj/huiwei/launcher/app/App$a;->a()Lcom/zykj/huiwei/launcher/app/App;

    .line 55
    .line 56
    .line 57
    move-result-object v5

    .line 58
    sget-object v6, Lcom/zykj/download/data/AppDatabase;->a:Lcom/zykj/download/data/AppDatabase$a;

    .line 59
    .line 60
    invoke-virtual {p1}, Lcom/zykj/huiwei/launcher/app/App$a;->a()Lcom/zykj/huiwei/launcher/app/App;

    .line 61
    .line 62
    .line 63
    move-result-object p1

    .line 64
    invoke-virtual {v6, p1}, Lcom/zykj/download/data/AppDatabase$a;->b(Landroid/content/Context;)Lcom/zykj/download/data/AppDatabase;

    .line 65
    .line 66
    .line 67
    move-result-object p1

    .line 68
    const/4 v6, 0x0

    .line 69
    invoke-direct {v2, v5, p1, v6}, Lcom/zykj/download/work/DownloadFileWorkProxy;-><init>(Landroid/content/Context;Lcom/zykj/download/data/AppDatabase;Lcom/zykj/download/work/DownloadFileWork;)V

    .line 70
    .line 71
    .line 72
    iget-object p1, p0, Lcom/zykj/huiwei/launcher/viewmodels/AppUpdateViewModel$checkDownloadSuccess$1;->e:Lcom/zykj/huiwei/launcher/bean/resp/VersionInfo;

    .line 73
    .line 74
    invoke-virtual {p1}, Lcom/zykj/huiwei/launcher/bean/resp/VersionInfo;->getFileUrl()Ljava/lang/String;

    .line 75
    .line 76
    .line 77
    move-result-object p1

    .line 78
    new-instance v5, Ljava/io/File;

    .line 79
    .line 80
    invoke-static {}, Lcom/blankj/utilcode/util/y;->b()Ljava/lang/String;

    .line 81
    .line 82
    .line 83
    move-result-object v6

    .line 84
    invoke-direct {v5, v6}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 85
    .line 86
    .line 87
    iput-object v0, p0, Lcom/zykj/huiwei/launcher/viewmodels/AppUpdateViewModel$checkDownloadSuccess$1;->d:Ljava/lang/Object;

    .line 88
    .line 89
    invoke-static {v2}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 90
    .line 91
    .line 92
    move-result-object v6

    .line 93
    iput-object v6, p0, Lcom/zykj/huiwei/launcher/viewmodels/AppUpdateViewModel$checkDownloadSuccess$1;->a:Ljava/lang/Object;

    .line 94
    .line 95
    iput v4, p0, Lcom/zykj/huiwei/launcher/viewmodels/AppUpdateViewModel$checkDownloadSuccess$1;->c:I

    .line 96
    .line 97
    invoke-virtual {v2, p1, v5, p0}, Lcom/zykj/download/work/DownloadFileWorkProxy;->checkDownloadSuccess(Ljava/lang/String;Ljava/io/File;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 98
    .line 99
    .line 100
    move-result-object p1

    .line 101
    if-ne p1, v1, :cond_3

    .line 102
    .line 103
    goto :goto_1

    .line 104
    :cond_3
    :goto_0
    check-cast p1, Ljava/lang/String;

    .line 105
    .line 106
    if-nez p1, :cond_4

    .line 107
    .line 108
    const-string p1, ""

    .line 109
    .line 110
    :cond_4
    invoke-static {v0}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 111
    .line 112
    .line 113
    move-result-object v4

    .line 114
    iput-object v4, p0, Lcom/zykj/huiwei/launcher/viewmodels/AppUpdateViewModel$checkDownloadSuccess$1;->d:Ljava/lang/Object;

    .line 115
    .line 116
    invoke-static {v2}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 117
    .line 118
    .line 119
    move-result-object v2

    .line 120
    iput-object v2, p0, Lcom/zykj/huiwei/launcher/viewmodels/AppUpdateViewModel$checkDownloadSuccess$1;->a:Ljava/lang/Object;

    .line 121
    .line 122
    invoke-static {p1}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 123
    .line 124
    .line 125
    move-result-object v2

    .line 126
    iput-object v2, p0, Lcom/zykj/huiwei/launcher/viewmodels/AppUpdateViewModel$checkDownloadSuccess$1;->b:Ljava/lang/Object;

    .line 127
    .line 128
    iput v3, p0, Lcom/zykj/huiwei/launcher/viewmodels/AppUpdateViewModel$checkDownloadSuccess$1;->c:I

    .line 129
    .line 130
    invoke-interface {v0, p1, p0}, Lkotlinx/coroutines/flow/FlowCollector;->emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 131
    .line 132
    .line 133
    move-result-object p1

    .line 134
    if-ne p1, v1, :cond_5

    .line 135
    .line 136
    :goto_1
    return-object v1

    .line 137
    :cond_5
    :goto_2
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 138
    .line 139
    return-object p1
.end method
