.class final Lcom/zykj/huiwei/launcher/viewmodels/NotificationViewModel$getNoticeDetail$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/huiwei/launcher/viewmodels/NotificationViewModel;->g(J)V
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
    c = "com.zykj.huiwei.launcher.viewmodels.NotificationViewModel$getNoticeDetail$1"
    f = "NotificationViewModel.kt"
    i = {
        0x1
    }
    l = {
        0x31,
        0x3a
    }
    m = "invokeSuspend"
    n = {
        "e"
    }
    s = {
        "L$0"
    }
.end annotation


# instance fields
.field public a:Ljava/lang/Object;

.field public b:I

.field public final synthetic c:Lcom/zykj/huiwei/launcher/viewmodels/NotificationViewModel;

.field public final synthetic d:J


# direct methods
.method public constructor <init>(Lcom/zykj/huiwei/launcher/viewmodels/NotificationViewModel;JLkotlin/coroutines/Continuation;)V
    .locals 0

    iput-object p1, p0, Lcom/zykj/huiwei/launcher/viewmodels/NotificationViewModel$getNoticeDetail$1;->c:Lcom/zykj/huiwei/launcher/viewmodels/NotificationViewModel;

    iput-wide p2, p0, Lcom/zykj/huiwei/launcher/viewmodels/NotificationViewModel$getNoticeDetail$1;->d:J

    const/4 p1, 0x2

    invoke-direct {p0, p1, p4}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILkotlin/coroutines/Continuation;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;
    .locals 3

    new-instance p1, Lcom/zykj/huiwei/launcher/viewmodels/NotificationViewModel$getNoticeDetail$1;

    iget-object v0, p0, Lcom/zykj/huiwei/launcher/viewmodels/NotificationViewModel$getNoticeDetail$1;->c:Lcom/zykj/huiwei/launcher/viewmodels/NotificationViewModel;

    iget-wide v1, p0, Lcom/zykj/huiwei/launcher/viewmodels/NotificationViewModel$getNoticeDetail$1;->d:J

    invoke-direct {p1, v0, v1, v2, p2}, Lcom/zykj/huiwei/launcher/viewmodels/NotificationViewModel$getNoticeDetail$1;-><init>(Lcom/zykj/huiwei/launcher/viewmodels/NotificationViewModel;JLkotlin/coroutines/Continuation;)V

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lkotlinx/coroutines/CoroutineScope;

    check-cast p2, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2}, Lcom/zykj/huiwei/launcher/viewmodels/NotificationViewModel$getNoticeDetail$1;->invoke(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0

    .line 2
    invoke-virtual {p0, p1, p2}, Lcom/zykj/huiwei/launcher/viewmodels/NotificationViewModel$getNoticeDetail$1;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object p1

    check-cast p1, Lcom/zykj/huiwei/launcher/viewmodels/NotificationViewModel$getNoticeDetail$1;

    sget-object p2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lcom/zykj/huiwei/launcher/viewmodels/NotificationViewModel$getNoticeDetail$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    .line 1
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v1

    .line 5
    iget v0, p0, Lcom/zykj/huiwei/launcher/viewmodels/NotificationViewModel$getNoticeDetail$1;->b:I

    .line 6
    .line 7
    const/4 v2, 0x2

    .line 8
    const/4 v3, 0x1

    .line 9
    if-eqz v0, :cond_2

    .line 10
    .line 11
    if-eq v0, v3, :cond_1

    .line 12
    .line 13
    if-ne v0, v2, :cond_0

    .line 14
    .line 15
    iget-object v0, p0, Lcom/zykj/huiwei/launcher/viewmodels/NotificationViewModel$getNoticeDetail$1;->a:Ljava/lang/Object;

    .line 16
    .line 17
    check-cast v0, Ljava/lang/Exception;

    .line 18
    .line 19
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 20
    .line 21
    .line 22
    goto/16 :goto_3

    .line 23
    .line 24
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 25
    .line 26
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 27
    .line 28
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    throw p1

    .line 32
    :cond_1
    :try_start_0
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 33
    .line 34
    .line 35
    goto :goto_0

    .line 36
    :catch_0
    move-exception v0

    .line 37
    move-object p1, v0

    .line 38
    goto :goto_1

    .line 39
    :cond_2
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 40
    .line 41
    .line 42
    iget-object p1, p0, Lcom/zykj/huiwei/launcher/viewmodels/NotificationViewModel$getNoticeDetail$1;->c:Lcom/zykj/huiwei/launcher/viewmodels/NotificationViewModel;

    .line 43
    .line 44
    invoke-virtual {p1}, Lcom/zykj/base/BaseViewModel;->isDialogVisible()Lcom/kunminx/architecture/ui/callback/UnPeekLiveData;

    .line 45
    .line 46
    .line 47
    move-result-object p1

    .line 48
    invoke-static {v3}, Lkotlin/coroutines/jvm/internal/Boxing;->boxBoolean(Z)Ljava/lang/Boolean;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    invoke-virtual {p1, v0}, Lcom/kunminx/architecture/ui/callback/UnPeekLiveData;->setValue(Ljava/lang/Object;)V

    .line 53
    .line 54
    .line 55
    :try_start_1
    iget-object p1, p0, Lcom/zykj/huiwei/launcher/viewmodels/NotificationViewModel$getNoticeDetail$1;->c:Lcom/zykj/huiwei/launcher/viewmodels/NotificationViewModel;

    .line 56
    .line 57
    invoke-static {p1}, Lcom/zykj/huiwei/launcher/viewmodels/NotificationViewModel;->a(Lcom/zykj/huiwei/launcher/viewmodels/NotificationViewModel;)Lcom/zykj/huiwei/launcher/repository/NotificationRepository;

    .line 58
    .line 59
    .line 60
    move-result-object p1

    .line 61
    iget-wide v4, p0, Lcom/zykj/huiwei/launcher/viewmodels/NotificationViewModel$getNoticeDetail$1;->d:J

    .line 62
    .line 63
    iput v3, p0, Lcom/zykj/huiwei/launcher/viewmodels/NotificationViewModel$getNoticeDetail$1;->b:I

    .line 64
    .line 65
    invoke-virtual {p1, v4, v5, p0}, Lcom/zykj/huiwei/launcher/repository/NotificationRepository;->c(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 66
    .line 67
    .line 68
    move-result-object p1

    .line 69
    if-ne p1, v1, :cond_3

    .line 70
    .line 71
    goto :goto_2

    .line 72
    :cond_3
    :goto_0
    check-cast p1, Lcom/zykj/http/bean/ApiResp;

    .line 73
    .line 74
    invoke-virtual {p1}, Lcom/zykj/http/bean/ApiResp;->getSuccess()Z

    .line 75
    .line 76
    .line 77
    move-result v0

    .line 78
    if-nez v0, :cond_4

    .line 79
    .line 80
    invoke-virtual {p1}, Lcom/zykj/http/bean/ApiResp;->getError()Lcom/zykj/http/bean/ErrorInfo;

    .line 81
    .line 82
    .line 83
    move-result-object v0

    .line 84
    if-eqz v0, :cond_4

    .line 85
    .line 86
    invoke-virtual {v0}, Lcom/zykj/http/bean/ErrorInfo;->getCode()I

    .line 87
    .line 88
    .line 89
    move-result v0

    .line 90
    const/16 v4, 0x271a

    .line 91
    .line 92
    if-ne v0, v4, :cond_4

    .line 93
    .line 94
    iget-object p1, p0, Lcom/zykj/huiwei/launcher/viewmodels/NotificationViewModel$getNoticeDetail$1;->c:Lcom/zykj/huiwei/launcher/viewmodels/NotificationViewModel;

    .line 95
    .line 96
    invoke-static {p1}, Lcom/zykj/huiwei/launcher/viewmodels/NotificationViewModel;->c(Lcom/zykj/huiwei/launcher/viewmodels/NotificationViewModel;)Landroidx/lifecycle/MutableLiveData;

    .line 97
    .line 98
    .line 99
    move-result-object p1

    .line 100
    invoke-static {v3}, Lkotlin/coroutines/jvm/internal/Boxing;->boxBoolean(Z)Ljava/lang/Boolean;

    .line 101
    .line 102
    .line 103
    move-result-object v0

    .line 104
    invoke-virtual {p1, v0}, Landroidx/lifecycle/MutableLiveData;->setValue(Ljava/lang/Object;)V

    .line 105
    .line 106
    .line 107
    goto :goto_5

    .line 108
    :cond_4
    invoke-virtual {p1}, Lcom/zykj/http/bean/ApiResp;->getResult()Ljava/lang/Object;

    .line 109
    .line 110
    .line 111
    move-result-object p1

    .line 112
    iget-object v0, p0, Lcom/zykj/huiwei/launcher/viewmodels/NotificationViewModel$getNoticeDetail$1;->c:Lcom/zykj/huiwei/launcher/viewmodels/NotificationViewModel;

    .line 113
    .line 114
    check-cast p1, Lcom/zykj/huiwei/launcher/bean/resp/NoticeBean;

    .line 115
    .line 116
    invoke-static {v0}, Lcom/zykj/huiwei/launcher/viewmodels/NotificationViewModel;->b(Lcom/zykj/huiwei/launcher/viewmodels/NotificationViewModel;)Landroidx/lifecycle/MutableLiveData;

    .line 117
    .line 118
    .line 119
    move-result-object v0

    .line 120
    invoke-virtual {v0, p1}, Landroidx/lifecycle/MutableLiveData;->setValue(Ljava/lang/Object;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    .line 121
    .line 122
    .line 123
    goto :goto_5

    .line 124
    :goto_1
    invoke-static {}, Lkotlinx/coroutines/Dispatchers;->getIO()Lkotlinx/coroutines/CoroutineDispatcher;

    .line 125
    .line 126
    .line 127
    move-result-object p1

    .line 128
    new-instance v3, Lcom/zykj/huiwei/launcher/viewmodels/NotificationViewModel$getNoticeDetail$1$2;

    .line 129
    .line 130
    const/4 v4, 0x0

    .line 131
    invoke-direct {v3, v4}, Lcom/zykj/huiwei/launcher/viewmodels/NotificationViewModel$getNoticeDetail$1$2;-><init>(Lkotlin/coroutines/Continuation;)V

    .line 132
    .line 133
    .line 134
    iput-object v0, p0, Lcom/zykj/huiwei/launcher/viewmodels/NotificationViewModel$getNoticeDetail$1;->a:Ljava/lang/Object;

    .line 135
    .line 136
    iput v2, p0, Lcom/zykj/huiwei/launcher/viewmodels/NotificationViewModel$getNoticeDetail$1;->b:I

    .line 137
    .line 138
    invoke-static {p1, v3, p0}, Lkotlinx/coroutines/BuildersKt;->withContext(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 139
    .line 140
    .line 141
    move-result-object p1

    .line 142
    if-ne p1, v1, :cond_5

    .line 143
    .line 144
    :goto_2
    return-object v1

    .line 145
    :cond_5
    :goto_3
    check-cast p1, Ljava/lang/Boolean;

    .line 146
    .line 147
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 148
    .line 149
    .line 150
    move-result p1

    .line 151
    if-eqz p1, :cond_6

    .line 152
    .line 153
    iget-object p1, p0, Lcom/zykj/huiwei/launcher/viewmodels/NotificationViewModel$getNoticeDetail$1;->c:Lcom/zykj/huiwei/launcher/viewmodels/NotificationViewModel;

    .line 154
    .line 155
    invoke-virtual {p1}, Lcom/zykj/base/BaseViewModel;->getToastLiveData()Lcom/kunminx/architecture/ui/callback/UnPeekLiveData;

    .line 156
    .line 157
    .line 158
    move-result-object p1

    .line 159
    new-instance v1, Lcom/zykj/base/bean/toast/ToastErrorMessage;

    .line 160
    .line 161
    const/4 v5, 0x5

    .line 162
    const/4 v6, 0x0

    .line 163
    const/4 v2, 0x0

    .line 164
    const-string v3, "\u83b7\u53d6\u901a\u77e5\u8be6\u60c5\u5931\u8d25"

    .line 165
    .line 166
    const/4 v4, 0x0

    .line 167
    invoke-direct/range {v1 .. v6}, Lcom/zykj/base/bean/toast/ToastErrorMessage;-><init>(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 168
    .line 169
    .line 170
    invoke-virtual {p1, v1}, Lcom/kunminx/architecture/ui/callback/UnPeekLiveData;->setValue(Ljava/lang/Object;)V

    .line 171
    .line 172
    .line 173
    goto :goto_4

    .line 174
    :cond_6
    iget-object p1, p0, Lcom/zykj/huiwei/launcher/viewmodels/NotificationViewModel$getNoticeDetail$1;->c:Lcom/zykj/huiwei/launcher/viewmodels/NotificationViewModel;

    .line 175
    .line 176
    invoke-virtual {p1}, Lcom/zykj/base/BaseViewModel;->getToastLiveData()Lcom/kunminx/architecture/ui/callback/UnPeekLiveData;

    .line 177
    .line 178
    .line 179
    move-result-object p1

    .line 180
    new-instance v1, Lcom/zykj/base/bean/toast/ToastErrorMessage;

    .line 181
    .line 182
    const/4 v5, 0x5

    .line 183
    const/4 v6, 0x0

    .line 184
    const/4 v2, 0x0

    .line 185
    const-string v3, "\u65e0\u7f51\u7edc\u8fde\u63a5\uff0c\u8bf7\u68c0\u67e5\u7f51\u7edc"

    .line 186
    .line 187
    const/4 v4, 0x0

    .line 188
    invoke-direct/range {v1 .. v6}, Lcom/zykj/base/bean/toast/ToastErrorMessage;-><init>(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 189
    .line 190
    .line 191
    invoke-virtual {p1, v1}, Lcom/kunminx/architecture/ui/callback/UnPeekLiveData;->setValue(Ljava/lang/Object;)V

    .line 192
    .line 193
    .line 194
    :goto_4
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 195
    .line 196
    .line 197
    :goto_5
    iget-object p1, p0, Lcom/zykj/huiwei/launcher/viewmodels/NotificationViewModel$getNoticeDetail$1;->c:Lcom/zykj/huiwei/launcher/viewmodels/NotificationViewModel;

    .line 198
    .line 199
    invoke-virtual {p1}, Lcom/zykj/base/BaseViewModel;->isDialogVisible()Lcom/kunminx/architecture/ui/callback/UnPeekLiveData;

    .line 200
    .line 201
    .line 202
    move-result-object p1

    .line 203
    const/4 v0, 0x0

    .line 204
    invoke-static {v0}, Lkotlin/coroutines/jvm/internal/Boxing;->boxBoolean(Z)Ljava/lang/Boolean;

    .line 205
    .line 206
    .line 207
    move-result-object v0

    .line 208
    invoke-virtual {p1, v0}, Lcom/kunminx/architecture/ui/callback/UnPeekLiveData;->setValue(Ljava/lang/Object;)V

    .line 209
    .line 210
    .line 211
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 212
    .line 213
    return-object p1
.end method
