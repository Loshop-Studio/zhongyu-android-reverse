.class final Lcom/zykj/huiwei/launcher/viewmodels/ResetPwdViewModel$performSubmit$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/huiwei/launcher/viewmodels/ResetPwdViewModel;->e()V
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
    c = "com.zykj.huiwei.launcher.viewmodels.ResetPwdViewModel$performSubmit$1"
    f = "ResetPwdViewModel.kt"
    i = {}
    l = {
        0x65
    }
    m = "invokeSuspend"
    n = {}
    s = {}
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nResetPwdViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ResetPwdViewModel.kt\ncom/zykj/huiwei/launcher/viewmodels/ResetPwdViewModel$performSubmit$1\n+ 2 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,155:1\n230#2,5:156\n230#2,5:161\n230#2,5:166\n*S KotlinDebug\n*F\n+ 1 ResetPwdViewModel.kt\ncom/zykj/huiwei/launcher/viewmodels/ResetPwdViewModel$performSubmit$1\n*L\n99#1:156,5\n102#1:161,5\n104#1:166,5\n*E\n"
    }
.end annotation


# instance fields
.field public a:I

.field public final synthetic b:Lcom/zykj/huiwei/launcher/viewmodels/ResetPwdViewModel;

.field public final synthetic c:Ll4/g;


# direct methods
.method public constructor <init>(Lcom/zykj/huiwei/launcher/viewmodels/ResetPwdViewModel;Ll4/g;Lkotlin/coroutines/Continuation;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/zykj/huiwei/launcher/viewmodels/ResetPwdViewModel$performSubmit$1;->b:Lcom/zykj/huiwei/launcher/viewmodels/ResetPwdViewModel;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/zykj/huiwei/launcher/viewmodels/ResetPwdViewModel$performSubmit$1;->c:Ll4/g;

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

    new-instance p1, Lcom/zykj/huiwei/launcher/viewmodels/ResetPwdViewModel$performSubmit$1;

    iget-object v0, p0, Lcom/zykj/huiwei/launcher/viewmodels/ResetPwdViewModel$performSubmit$1;->b:Lcom/zykj/huiwei/launcher/viewmodels/ResetPwdViewModel;

    iget-object v1, p0, Lcom/zykj/huiwei/launcher/viewmodels/ResetPwdViewModel$performSubmit$1;->c:Ll4/g;

    invoke-direct {p1, v0, v1, p2}, Lcom/zykj/huiwei/launcher/viewmodels/ResetPwdViewModel$performSubmit$1;-><init>(Lcom/zykj/huiwei/launcher/viewmodels/ResetPwdViewModel;Ll4/g;Lkotlin/coroutines/Continuation;)V

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lkotlinx/coroutines/CoroutineScope;

    check-cast p2, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2}, Lcom/zykj/huiwei/launcher/viewmodels/ResetPwdViewModel$performSubmit$1;->invoke(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0

    .line 2
    invoke-virtual {p0, p1, p2}, Lcom/zykj/huiwei/launcher/viewmodels/ResetPwdViewModel$performSubmit$1;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object p1

    check-cast p1, Lcom/zykj/huiwei/launcher/viewmodels/ResetPwdViewModel$performSubmit$1;

    sget-object p2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lcom/zykj/huiwei/launcher/viewmodels/ResetPwdViewModel$performSubmit$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 19

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
    iget v2, v1, Lcom/zykj/huiwei/launcher/viewmodels/ResetPwdViewModel$performSubmit$1;->a:I

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
    goto :goto_0

    .line 18
    :catch_0
    move-exception v0

    .line 19
    move-object v4, v0

    .line 20
    goto :goto_1

    .line 21
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 22
    .line 23
    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 24
    .line 25
    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    throw v0

    .line 29
    :cond_1
    invoke-static/range {p1 .. p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 30
    .line 31
    .line 32
    iget-object v2, v1, Lcom/zykj/huiwei/launcher/viewmodels/ResetPwdViewModel$performSubmit$1;->b:Lcom/zykj/huiwei/launcher/viewmodels/ResetPwdViewModel;

    .line 33
    .line 34
    invoke-static {v2}, Lcom/zykj/huiwei/launcher/viewmodels/ResetPwdViewModel;->b(Lcom/zykj/huiwei/launcher/viewmodels/ResetPwdViewModel;)Lkotlinx/coroutines/flow/MutableStateFlow;

    .line 35
    .line 36
    .line 37
    move-result-object v2

    .line 38
    :cond_2
    invoke-interface {v2}, Lkotlinx/coroutines/flow/MutableStateFlow;->getValue()Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object v4

    .line 42
    move-object v5, v4

    .line 43
    check-cast v5, Ll4/g;

    .line 44
    .line 45
    const/16 v16, 0x3bb

    .line 46
    .line 47
    const/16 v17, 0x0

    .line 48
    .line 49
    const/4 v6, 0x0

    .line 50
    const/4 v7, 0x0

    .line 51
    const/4 v8, 0x1

    .line 52
    const/4 v9, 0x0

    .line 53
    const/4 v10, 0x0

    .line 54
    const/4 v11, 0x0

    .line 55
    const/4 v12, 0x0

    .line 56
    const/4 v13, 0x0

    .line 57
    const/4 v14, 0x0

    .line 58
    const/4 v15, 0x0

    .line 59
    invoke-static/range {v5 .. v17}, Ll4/g;->b(Ll4/g;Ljava/lang/String;Ljava/lang/String;ZZLcom/zykj/huiwei/launcher/viewmodels/PasswordSecurityLevel;ZLjava/lang/String;ZZLjava/lang/String;ILjava/lang/Object;)Ll4/g;

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
    iget-object v2, v1, Lcom/zykj/huiwei/launcher/viewmodels/ResetPwdViewModel$performSubmit$1;->b:Lcom/zykj/huiwei/launcher/viewmodels/ResetPwdViewModel;

    .line 70
    .line 71
    invoke-static {v2}, Lcom/zykj/huiwei/launcher/viewmodels/ResetPwdViewModel;->a(Lcom/zykj/huiwei/launcher/viewmodels/ResetPwdViewModel;)Lcom/zykj/huiwei/launcher/repository/UserRepository;

    .line 72
    .line 73
    .line 74
    move-result-object v2

    .line 75
    iget-object v4, v1, Lcom/zykj/huiwei/launcher/viewmodels/ResetPwdViewModel$performSubmit$1;->c:Ll4/g;

    .line 76
    .line 77
    invoke-virtual {v4}, Ll4/g;->g()Ljava/lang/String;

    .line 78
    .line 79
    .line 80
    move-result-object v4

    .line 81
    iput v3, v1, Lcom/zykj/huiwei/launcher/viewmodels/ResetPwdViewModel$performSubmit$1;->a:I

    .line 82
    .line 83
    invoke-virtual {v2, v4, v1}, Lcom/zykj/huiwei/launcher/repository/UserRepository;->b(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 84
    .line 85
    .line 86
    move-result-object v2

    .line 87
    if-ne v2, v0, :cond_3

    .line 88
    .line 89
    return-object v0

    .line 90
    :cond_3
    :goto_0
    iget-object v0, v1, Lcom/zykj/huiwei/launcher/viewmodels/ResetPwdViewModel$performSubmit$1;->b:Lcom/zykj/huiwei/launcher/viewmodels/ResetPwdViewModel;

    .line 91
    .line 92
    invoke-static {v0}, Lcom/zykj/huiwei/launcher/viewmodels/ResetPwdViewModel;->b(Lcom/zykj/huiwei/launcher/viewmodels/ResetPwdViewModel;)Lkotlinx/coroutines/flow/MutableStateFlow;

    .line 93
    .line 94
    .line 95
    move-result-object v0

    .line 96
    :cond_4
    invoke-interface {v0}, Lkotlinx/coroutines/flow/MutableStateFlow;->getValue()Ljava/lang/Object;

    .line 97
    .line 98
    .line 99
    move-result-object v2

    .line 100
    move-object v3, v2

    .line 101
    check-cast v3, Ll4/g;

    .line 102
    .line 103
    const/16 v14, 0x3db

    .line 104
    .line 105
    const/4 v15, 0x0

    .line 106
    const/4 v4, 0x0

    .line 107
    const/4 v5, 0x0

    .line 108
    const/4 v6, 0x0

    .line 109
    const/4 v7, 0x0

    .line 110
    const/4 v8, 0x0

    .line 111
    const/4 v9, 0x1

    .line 112
    const/4 v10, 0x0

    .line 113
    const/4 v11, 0x0

    .line 114
    const/4 v12, 0x0

    .line 115
    const/4 v13, 0x0

    .line 116
    invoke-static/range {v3 .. v15}, Ll4/g;->b(Ll4/g;Ljava/lang/String;Ljava/lang/String;ZZLcom/zykj/huiwei/launcher/viewmodels/PasswordSecurityLevel;ZLjava/lang/String;ZZLjava/lang/String;ILjava/lang/Object;)Ll4/g;

    .line 117
    .line 118
    .line 119
    move-result-object v3

    .line 120
    invoke-interface {v0, v2, v3}, Lkotlinx/coroutines/flow/MutableStateFlow;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 121
    .line 122
    .line 123
    move-result v2
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    .line 124
    if-eqz v2, :cond_4

    .line 125
    .line 126
    goto :goto_2

    .line 127
    :goto_1
    iget-object v0, v1, Lcom/zykj/huiwei/launcher/viewmodels/ResetPwdViewModel$performSubmit$1;->b:Lcom/zykj/huiwei/launcher/viewmodels/ResetPwdViewModel;

    .line 128
    .line 129
    invoke-static {v0}, Lcom/zykj/huiwei/launcher/viewmodels/ResetPwdViewModel;->b(Lcom/zykj/huiwei/launcher/viewmodels/ResetPwdViewModel;)Lkotlinx/coroutines/flow/MutableStateFlow;

    .line 130
    .line 131
    .line 132
    move-result-object v5

    .line 133
    :cond_5
    invoke-interface {v5}, Lkotlinx/coroutines/flow/MutableStateFlow;->getValue()Ljava/lang/Object;

    .line 134
    .line 135
    .line 136
    move-result-object v0

    .line 137
    move-object v6, v0

    .line 138
    check-cast v6, Ll4/g;

    .line 139
    .line 140
    invoke-virtual {v4}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 141
    .line 142
    .line 143
    move-result-object v2

    .line 144
    if-nez v2, :cond_6

    .line 145
    .line 146
    const-string v2, "\u63d0\u4ea4\u5931\u8d25"

    .line 147
    .line 148
    :cond_6
    move-object v13, v2

    .line 149
    const/16 v17, 0x3bb

    .line 150
    .line 151
    const/16 v18, 0x0

    .line 152
    .line 153
    const/4 v7, 0x0

    .line 154
    const/4 v8, 0x0

    .line 155
    const/4 v9, 0x0

    .line 156
    const/4 v10, 0x0

    .line 157
    const/4 v11, 0x0

    .line 158
    const/4 v12, 0x0

    .line 159
    const/4 v14, 0x0

    .line 160
    const/4 v15, 0x0

    .line 161
    const/16 v16, 0x0

    .line 162
    .line 163
    invoke-static/range {v6 .. v18}, Ll4/g;->b(Ll4/g;Ljava/lang/String;Ljava/lang/String;ZZLcom/zykj/huiwei/launcher/viewmodels/PasswordSecurityLevel;ZLjava/lang/String;ZZLjava/lang/String;ILjava/lang/Object;)Ll4/g;

    .line 164
    .line 165
    .line 166
    move-result-object v2

    .line 167
    invoke-interface {v5, v0, v2}, Lkotlinx/coroutines/flow/MutableStateFlow;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 168
    .line 169
    .line 170
    move-result v0

    .line 171
    if-eqz v0, :cond_5

    .line 172
    .line 173
    :goto_2
    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 174
    .line 175
    return-object v0
.end method
