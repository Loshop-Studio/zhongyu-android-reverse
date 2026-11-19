.class final Lcom/zykj/insight/ui/MainViewModel$getDongNiUrl$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/insight/ui/MainViewModel;->c()V
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
        "\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"
    }
    d2 = {
        "Lkotlinx/coroutines/CoroutineScope;",
        "",
        "<anonymous>"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation

.annotation runtime Lkotlin/coroutines/jvm/internal/DebugMetadata;
    c = "com.zykj.insight.ui.MainViewModel$getDongNiUrl$1"
    f = "MainViewModel.kt"
    i = {}
    l = {
        0x31,
        0x32
    }
    m = "invokeSuspend"
    n = {}
    s = {}
.end annotation


# instance fields
.field public a:I

.field public final synthetic b:Lcom/zykj/insight/ui/MainViewModel;


# direct methods
.method public constructor <init>(Lcom/zykj/insight/ui/MainViewModel;Lkotlin/coroutines/Continuation;)V
    .locals 0

    iput-object p1, p0, Lcom/zykj/insight/ui/MainViewModel$getDongNiUrl$1;->b:Lcom/zykj/insight/ui/MainViewModel;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILkotlin/coroutines/Continuation;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;
    .locals 1

    new-instance p1, Lcom/zykj/insight/ui/MainViewModel$getDongNiUrl$1;

    iget-object v0, p0, Lcom/zykj/insight/ui/MainViewModel$getDongNiUrl$1;->b:Lcom/zykj/insight/ui/MainViewModel;

    invoke-direct {p1, v0, p2}, Lcom/zykj/insight/ui/MainViewModel$getDongNiUrl$1;-><init>(Lcom/zykj/insight/ui/MainViewModel;Lkotlin/coroutines/Continuation;)V

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lkotlinx/coroutines/CoroutineScope;

    check-cast p2, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2}, Lcom/zykj/insight/ui/MainViewModel$getDongNiUrl$1;->invoke(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0

    .line 2
    invoke-virtual {p0, p1, p2}, Lcom/zykj/insight/ui/MainViewModel$getDongNiUrl$1;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object p1

    check-cast p1, Lcom/zykj/insight/ui/MainViewModel$getDongNiUrl$1;

    sget-object p2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lcom/zykj/insight/ui/MainViewModel$getDongNiUrl$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    .line 1
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget v1, p0, Lcom/zykj/insight/ui/MainViewModel$getDongNiUrl$1;->a:I

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
    :try_start_0
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 16
    .line 17
    .line 18
    goto :goto_1

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
    :try_start_1
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    .line 28
    .line 29
    .line 30
    goto :goto_0

    .line 31
    :catch_0
    move-exception p1

    .line 32
    goto :goto_2

    .line 33
    :cond_2
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 34
    .line 35
    .line 36
    :try_start_2
    iget-object p1, p0, Lcom/zykj/insight/ui/MainViewModel$getDongNiUrl$1;->b:Lcom/zykj/insight/ui/MainViewModel;

    .line 37
    .line 38
    invoke-static {p1}, Lcom/zykj/insight/ui/MainViewModel;->a(Lcom/zykj/insight/ui/MainViewModel;)Lu1/g;

    .line 39
    .line 40
    .line 41
    move-result-object p1

    .line 42
    iput v3, p0, Lcom/zykj/insight/ui/MainViewModel$getDongNiUrl$1;->a:I

    .line 43
    .line 44
    invoke-interface {p1, p0}, Lu1/g;->b(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object p1

    .line 48
    if-ne p1, v0, :cond_3

    .line 49
    .line 50
    return-object v0

    .line 51
    :cond_3
    :goto_0
    check-cast p1, Lcom/zykj/insight/network/BaseResponse;

    .line 52
    .line 53
    invoke-static {p1}, Lu1/h;->a(Lcom/zykj/insight/network/BaseResponse;)Ljava/lang/Object;

    .line 54
    .line 55
    .line 56
    move-result-object p1

    .line 57
    check-cast p1, Lcom/zykj/insight/bean/GetAllSettingsResp;

    .line 58
    .line 59
    invoke-virtual {p1}, Lcom/zykj/insight/bean/GetAllSettingsResp;->getDnOrder()Lcom/zykj/insight/bean/SettingSwitch;

    .line 60
    .line 61
    .line 62
    move-result-object p1

    .line 63
    sget-object v1, Lcom/zykj/insight/bean/SettingSwitch;->OPEN:Lcom/zykj/insight/bean/SettingSwitch;

    .line 64
    .line 65
    if-ne p1, v1, :cond_5

    .line 66
    .line 67
    iget-object p1, p0, Lcom/zykj/insight/ui/MainViewModel$getDongNiUrl$1;->b:Lcom/zykj/insight/ui/MainViewModel;

    .line 68
    .line 69
    invoke-static {p1}, Lcom/zykj/insight/ui/MainViewModel;->a(Lcom/zykj/insight/ui/MainViewModel;)Lu1/g;

    .line 70
    .line 71
    .line 72
    move-result-object p1

    .line 73
    iput v2, p0, Lcom/zykj/insight/ui/MainViewModel$getDongNiUrl$1;->a:I

    .line 74
    .line 75
    const/4 v1, 0x0

    .line 76
    const/4 v2, 0x0

    .line 77
    invoke-static {p1, v1, p0, v3, v2}, Lu1/g$a;->a(Lu1/g;ILkotlin/coroutines/Continuation;ILjava/lang/Object;)Ljava/lang/Object;

    .line 78
    .line 79
    .line 80
    move-result-object p1

    .line 81
    if-ne p1, v0, :cond_4

    .line 82
    .line 83
    return-object v0

    .line 84
    :cond_4
    :goto_1
    check-cast p1, Lcom/zykj/insight/network/BaseResponse;

    .line 85
    .line 86
    invoke-static {p1}, Lu1/h;->a(Lcom/zykj/insight/network/BaseResponse;)Ljava/lang/Object;

    .line 87
    .line 88
    .line 89
    move-result-object p1

    .line 90
    move-object v0, p1

    .line 91
    check-cast v0, Ljava/lang/String;

    .line 92
    .line 93
    const-string v1, "\""

    .line 94
    .line 95
    const-string v2, ""

    .line 96
    .line 97
    const/4 v3, 0x0

    .line 98
    const/4 v4, 0x4

    .line 99
    const/4 v5, 0x0

    .line 100
    invoke-static/range {v0 .. v5}, Lkotlin/text/StringsKt;->replace$default(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Ljava/lang/String;

    .line 101
    .line 102
    .line 103
    move-result-object p1

    .line 104
    iget-object v0, p0, Lcom/zykj/insight/ui/MainViewModel$getDongNiUrl$1;->b:Lcom/zykj/insight/ui/MainViewModel;

    .line 105
    .line 106
    invoke-virtual {v0}, Lcom/zykj/insight/ui/MainViewModel;->d()Lv1/b;

    .line 107
    .line 108
    .line 109
    move-result-object v1

    .line 110
    invoke-virtual {v1, p1}, Lv1/b;->a(Ljava/lang/String;)Lv1/b;

    .line 111
    .line 112
    .line 113
    move-result-object p1

    .line 114
    invoke-static {v0, p1}, Lcom/zykj/insight/ui/MainViewModel;->b(Lcom/zykj/insight/ui/MainViewModel;Lv1/b;)V

    .line 115
    .line 116
    .line 117
    goto :goto_3

    .line 118
    :cond_5
    sget-object p1, Lcom/zykj/base/utils/XToastUtils;->INSTANCE:Lcom/zykj/base/utils/XToastUtils;

    .line 119
    .line 120
    const-string v0, "\u767b\u9646\u5931\u8d25"

    .line 121
    .line 122
    invoke-virtual {p1, v0}, Lcom/zykj/base/utils/XToastUtils;->toast(Ljava/lang/CharSequence;)V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    .line 123
    .line 124
    .line 125
    goto :goto_3

    .line 126
    :goto_2
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 127
    .line 128
    .line 129
    :goto_3
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 130
    .line 131
    return-object p1
.end method
