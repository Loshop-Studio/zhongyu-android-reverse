.class final Lcom/zykj/huiwei/launcher/ui/dialog/changePsdDialog/ChangePsdViewModel$performSubmit$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/huiwei/launcher/ui/dialog/changePsdDialog/ChangePsdViewModel;->h()V
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
    c = "com.zykj.huiwei.launcher.ui.dialog.changePsdDialog.ChangePsdViewModel$performSubmit$1"
    f = "ChangePsdViewModel.kt"
    i = {}
    l = {
        0x7d
    }
    m = "invokeSuspend"
    n = {}
    s = {}
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nChangePsdViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ChangePsdViewModel.kt\ncom/zykj/huiwei/launcher/ui/dialog/changePsdDialog/ChangePsdViewModel$performSubmit$1\n+ 2 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,141:1\n230#2,5:142\n230#2,5:147\n*S KotlinDebug\n*F\n+ 1 ChangePsdViewModel.kt\ncom/zykj/huiwei/launcher/ui/dialog/changePsdDialog/ChangePsdViewModel$performSubmit$1\n*L\n122#1:142,5\n132#1:147,5\n*E\n"
    }
.end annotation


# instance fields
.field public a:I

.field public final synthetic b:Lcom/zykj/huiwei/launcher/ui/dialog/changePsdDialog/ChangePsdViewModel;

.field public final synthetic c:Ld4/q;


# direct methods
.method public constructor <init>(Lcom/zykj/huiwei/launcher/ui/dialog/changePsdDialog/ChangePsdViewModel;Ld4/q;Lkotlin/coroutines/Continuation;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/zykj/huiwei/launcher/ui/dialog/changePsdDialog/ChangePsdViewModel$performSubmit$1;->b:Lcom/zykj/huiwei/launcher/ui/dialog/changePsdDialog/ChangePsdViewModel;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/zykj/huiwei/launcher/ui/dialog/changePsdDialog/ChangePsdViewModel$performSubmit$1;->c:Ld4/q;

    .line 4
    .line 5
    const/4 p1, 0x2

    .line 6
    invoke-direct {p0, p1, p3}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILkotlin/coroutines/Continuation;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;
    .locals 2

    new-instance p1, Lcom/zykj/huiwei/launcher/ui/dialog/changePsdDialog/ChangePsdViewModel$performSubmit$1;

    iget-object v0, p0, Lcom/zykj/huiwei/launcher/ui/dialog/changePsdDialog/ChangePsdViewModel$performSubmit$1;->b:Lcom/zykj/huiwei/launcher/ui/dialog/changePsdDialog/ChangePsdViewModel;

    iget-object v1, p0, Lcom/zykj/huiwei/launcher/ui/dialog/changePsdDialog/ChangePsdViewModel$performSubmit$1;->c:Ld4/q;

    invoke-direct {p1, v0, v1, p2}, Lcom/zykj/huiwei/launcher/ui/dialog/changePsdDialog/ChangePsdViewModel$performSubmit$1;-><init>(Lcom/zykj/huiwei/launcher/ui/dialog/changePsdDialog/ChangePsdViewModel;Ld4/q;Lkotlin/coroutines/Continuation;)V

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lkotlinx/coroutines/CoroutineScope;

    check-cast p2, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2}, Lcom/zykj/huiwei/launcher/ui/dialog/changePsdDialog/ChangePsdViewModel$performSubmit$1;->invoke(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0

    .line 2
    invoke-virtual {p0, p1, p2}, Lcom/zykj/huiwei/launcher/ui/dialog/changePsdDialog/ChangePsdViewModel$performSubmit$1;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object p1

    check-cast p1, Lcom/zykj/huiwei/launcher/ui/dialog/changePsdDialog/ChangePsdViewModel$performSubmit$1;

    sget-object p2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lcom/zykj/huiwei/launcher/ui/dialog/changePsdDialog/ChangePsdViewModel$performSubmit$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 18

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iget v2, v1, Lcom/zykj/huiwei/launcher/ui/dialog/changePsdDialog/ChangePsdViewModel$performSubmit$1;->a:I

    .line 8
    .line 9
    const/4 v3, 0x1

    .line 10
    if-eqz v2, :cond_1

    .line 11
    .line 12
    if-ne v2, v3, :cond_0

    .line 13
    .line 14
    :try_start_0
    invoke-static/range {p1 .. p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 15
    .line 16
    .line 17
    goto/16 :goto_1

    .line 18
    .line 19
    :catch_0
    move-exception v0

    .line 20
    move-object v4, v0

    .line 21
    goto :goto_0

    .line 22
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 23
    .line 24
    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 25
    .line 26
    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    throw v0

    .line 30
    :cond_1
    invoke-static/range {p1 .. p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 31
    .line 32
    .line 33
    iget-object v2, v1, Lcom/zykj/huiwei/launcher/ui/dialog/changePsdDialog/ChangePsdViewModel$performSubmit$1;->b:Lcom/zykj/huiwei/launcher/ui/dialog/changePsdDialog/ChangePsdViewModel;

    .line 34
    .line 35
    invoke-static {v2}, Lcom/zykj/huiwei/launcher/ui/dialog/changePsdDialog/ChangePsdViewModel;->c(Lcom/zykj/huiwei/launcher/ui/dialog/changePsdDialog/ChangePsdViewModel;)Lkotlinx/coroutines/flow/MutableStateFlow;

    .line 36
    .line 37
    .line 38
    move-result-object v2

    .line 39
    :cond_2
    invoke-interface {v2}, Lkotlinx/coroutines/flow/MutableStateFlow;->getValue()Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object v4

    .line 43
    move-object v5, v4

    .line 44
    check-cast v5, Ld4/q;

    .line 45
    .line 46
    const/16 v15, 0x1f7

    .line 47
    .line 48
    const/16 v16, 0x0

    .line 49
    .line 50
    const/4 v6, 0x0

    .line 51
    const/4 v7, 0x0

    .line 52
    const/4 v8, 0x0

    .line 53
    const/4 v9, 0x1

    .line 54
    const/4 v10, 0x0

    .line 55
    const/4 v11, 0x0

    .line 56
    const/4 v12, 0x0

    .line 57
    const/4 v13, 0x0

    .line 58
    const/4 v14, 0x0

    .line 59
    invoke-static/range {v5 .. v16}, Ld4/q;->b(Ld4/q;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZLcom/zykj/huiwei/launcher/viewmodels/PasswordSecurityLevel;ZZLjava/lang/String;ILjava/lang/Object;)Ld4/q;

    .line 60
    .line 61
    .line 62
    move-result-object v5

    .line 63
    invoke-interface {v2, v4, v5}, Lkotlinx/coroutines/flow/MutableStateFlow;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 64
    .line 65
    .line 66
    move-result v4

    .line 67
    if-eqz v4, :cond_2

    .line 68
    .line 69
    :try_start_1
    iget-object v2, v1, Lcom/zykj/huiwei/launcher/ui/dialog/changePsdDialog/ChangePsdViewModel$performSubmit$1;->b:Lcom/zykj/huiwei/launcher/ui/dialog/changePsdDialog/ChangePsdViewModel;

    .line 70
    .line 71
    invoke-static {v2}, Lcom/zykj/huiwei/launcher/ui/dialog/changePsdDialog/ChangePsdViewModel;->a(Lcom/zykj/huiwei/launcher/ui/dialog/changePsdDialog/ChangePsdViewModel;)Lcom/zykj/huiwei/launcher/repository/UserRepository;

    .line 72
    .line 73
    .line 74
    move-result-object v2

    .line 75
    new-instance v4, Lcom/zykj/huiwei/launcher/bean/req/UpdatePwdReq;

    .line 76
    .line 77
    iget-object v5, v1, Lcom/zykj/huiwei/launcher/ui/dialog/changePsdDialog/ChangePsdViewModel$performSubmit$1;->c:Ld4/q;

    .line 78
    .line 79
    invoke-virtual {v5}, Ld4/q;->g()Ljava/lang/String;

    .line 80
    .line 81
    .line 82
    move-result-object v5

    .line 83
    iget-object v6, v1, Lcom/zykj/huiwei/launcher/ui/dialog/changePsdDialog/ChangePsdViewModel$performSubmit$1;->c:Ld4/q;

    .line 84
    .line 85
    invoke-virtual {v6}, Ld4/q;->f()Ljava/lang/String;

    .line 86
    .line 87
    .line 88
    move-result-object v6

    .line 89
    invoke-direct {v4, v5, v6}, Lcom/zykj/huiwei/launcher/bean/req/UpdatePwdReq;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 90
    .line 91
    .line 92
    invoke-virtual {v2, v4}, Lcom/zykj/huiwei/launcher/repository/UserRepository;->d(Lcom/zykj/huiwei/launcher/bean/req/UpdatePwdReq;)Lkotlinx/coroutines/flow/Flow;

    .line 93
    .line 94
    .line 95
    move-result-object v2

    .line 96
    new-instance v4, Lcom/zykj/huiwei/launcher/ui/dialog/changePsdDialog/ChangePsdViewModel$performSubmit$1$a;

    .line 97
    .line 98
    iget-object v5, v1, Lcom/zykj/huiwei/launcher/ui/dialog/changePsdDialog/ChangePsdViewModel$performSubmit$1;->b:Lcom/zykj/huiwei/launcher/ui/dialog/changePsdDialog/ChangePsdViewModel;

    .line 99
    .line 100
    invoke-direct {v4, v5}, Lcom/zykj/huiwei/launcher/ui/dialog/changePsdDialog/ChangePsdViewModel$performSubmit$1$a;-><init>(Lcom/zykj/huiwei/launcher/ui/dialog/changePsdDialog/ChangePsdViewModel;)V

    .line 101
    .line 102
    .line 103
    iput v3, v1, Lcom/zykj/huiwei/launcher/ui/dialog/changePsdDialog/ChangePsdViewModel$performSubmit$1;->a:I

    .line 104
    .line 105
    invoke-interface {v2, v4, v1}, Lkotlinx/coroutines/flow/Flow;->collect(Lkotlinx/coroutines/flow/FlowCollector;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 106
    .line 107
    .line 108
    move-result-object v2
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    .line 109
    if-ne v2, v0, :cond_5

    .line 110
    .line 111
    return-object v0

    .line 112
    :goto_0
    iget-object v0, v1, Lcom/zykj/huiwei/launcher/ui/dialog/changePsdDialog/ChangePsdViewModel$performSubmit$1;->b:Lcom/zykj/huiwei/launcher/ui/dialog/changePsdDialog/ChangePsdViewModel;

    .line 113
    .line 114
    invoke-static {v0}, Lcom/zykj/huiwei/launcher/ui/dialog/changePsdDialog/ChangePsdViewModel;->c(Lcom/zykj/huiwei/launcher/ui/dialog/changePsdDialog/ChangePsdViewModel;)Lkotlinx/coroutines/flow/MutableStateFlow;

    .line 115
    .line 116
    .line 117
    move-result-object v5

    .line 118
    :cond_3
    invoke-interface {v5}, Lkotlinx/coroutines/flow/MutableStateFlow;->getValue()Ljava/lang/Object;

    .line 119
    .line 120
    .line 121
    move-result-object v0

    .line 122
    move-object v6, v0

    .line 123
    check-cast v6, Ld4/q;

    .line 124
    .line 125
    const/16 v16, 0x1f7

    .line 126
    .line 127
    const/16 v17, 0x0

    .line 128
    .line 129
    const/4 v7, 0x0

    .line 130
    const/4 v8, 0x0

    .line 131
    const/4 v9, 0x0

    .line 132
    const/4 v10, 0x0

    .line 133
    const/4 v11, 0x0

    .line 134
    const/4 v12, 0x0

    .line 135
    const/4 v13, 0x0

    .line 136
    const/4 v14, 0x0

    .line 137
    const/4 v15, 0x0

    .line 138
    invoke-static/range {v6 .. v17}, Ld4/q;->b(Ld4/q;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZLcom/zykj/huiwei/launcher/viewmodels/PasswordSecurityLevel;ZZLjava/lang/String;ILjava/lang/Object;)Ld4/q;

    .line 139
    .line 140
    .line 141
    move-result-object v2

    .line 142
    invoke-interface {v5, v0, v2}, Lkotlinx/coroutines/flow/MutableStateFlow;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 143
    .line 144
    .line 145
    move-result v0

    .line 146
    if-eqz v0, :cond_3

    .line 147
    .line 148
    iget-object v0, v1, Lcom/zykj/huiwei/launcher/ui/dialog/changePsdDialog/ChangePsdViewModel$performSubmit$1;->b:Lcom/zykj/huiwei/launcher/ui/dialog/changePsdDialog/ChangePsdViewModel;

    .line 149
    .line 150
    new-instance v2, Lcom/zykj/huiwei/launcher/ui/dialog/changePsdDialog/c$a;

    .line 151
    .line 152
    invoke-virtual {v4}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 153
    .line 154
    .line 155
    move-result-object v3

    .line 156
    if-nez v3, :cond_4

    .line 157
    .line 158
    const-string v3, "\u672a\u77e5\u9519\u8bef"

    .line 159
    .line 160
    :cond_4
    invoke-direct {v2, v3}, Lcom/zykj/huiwei/launcher/ui/dialog/changePsdDialog/c$a;-><init>(Ljava/lang/String;)V

    .line 161
    .line 162
    .line 163
    invoke-static {v0, v2}, Lcom/zykj/huiwei/launcher/ui/dialog/changePsdDialog/ChangePsdViewModel;->d(Lcom/zykj/huiwei/launcher/ui/dialog/changePsdDialog/ChangePsdViewModel;Lcom/zykj/huiwei/launcher/ui/dialog/changePsdDialog/c;)V

    .line 164
    .line 165
    .line 166
    :cond_5
    :goto_1
    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 167
    .line 168
    return-object v0
.end method
