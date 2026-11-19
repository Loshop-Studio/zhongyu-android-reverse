.class final Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel$initData$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel;->H(Lcom/zykj/evaluation/bean/bundle/AnswerSheetBundle;)Z
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
    c = "com.zykj.evaluation.ui.sheet.normal.NormalViewModel$initData$1"
    f = "NormalViewModel.kt"
    i = {
        0x2,
        0x2
    }
    l = {
        0xd3,
        0xd6,
        0xe7
    }
    m = "invokeSuspend"
    n = {
        "config",
        "pageSize"
    }
    s = {
        "L$0",
        "I$0"
    }
.end annotation


# instance fields
.field public a:Ljava/lang/Object;

.field public b:I

.field public c:I

.field public final synthetic d:Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel;

.field public final synthetic e:Lcom/zykj/evaluation/bean/bundle/AnswerSheetBundle;


# direct methods
.method public constructor <init>(Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel;Lcom/zykj/evaluation/bean/bundle/AnswerSheetBundle;Lkotlin/coroutines/Continuation;)V
    .locals 0

    iput-object p1, p0, Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel$initData$1;->d:Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel;

    iput-object p2, p0, Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel$initData$1;->e:Lcom/zykj/evaluation/bean/bundle/AnswerSheetBundle;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILkotlin/coroutines/Continuation;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;
    .locals 2

    new-instance p1, Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel$initData$1;

    iget-object v0, p0, Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel$initData$1;->d:Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel;

    iget-object v1, p0, Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel$initData$1;->e:Lcom/zykj/evaluation/bean/bundle/AnswerSheetBundle;

    invoke-direct {p1, v0, v1, p2}, Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel$initData$1;-><init>(Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel;Lcom/zykj/evaluation/bean/bundle/AnswerSheetBundle;Lkotlin/coroutines/Continuation;)V

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lkotlinx/coroutines/CoroutineScope;

    check-cast p2, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2}, Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel$initData$1;->invoke(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0

    .line 2
    invoke-virtual {p0, p1, p2}, Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel$initData$1;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object p1

    check-cast p1, Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel$initData$1;

    sget-object p2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel$initData$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    .line 1
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget v1, p0, Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel$initData$1;->c:I

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    const/4 v3, 0x3

    .line 9
    const/4 v4, 0x1

    .line 10
    const/4 v5, 0x2

    .line 11
    if-eqz v1, :cond_3

    .line 12
    .line 13
    if-eq v1, v4, :cond_2

    .line 14
    .line 15
    if-eq v1, v5, :cond_1

    .line 16
    .line 17
    if-ne v1, v3, :cond_0

    .line 18
    .line 19
    iget v0, p0, Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel$initData$1;->b:I

    .line 20
    .line 21
    iget-object v1, p0, Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel$initData$1;->a:Ljava/lang/Object;

    .line 22
    .line 23
    check-cast v1, Lcom/zykj/evaluation/bean/PaperConfig;

    .line 24
    .line 25
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 26
    .line 27
    .line 28
    goto/16 :goto_3

    .line 29
    .line 30
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 31
    .line 32
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 33
    .line 34
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    throw p1

    .line 38
    :cond_1
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 39
    .line 40
    .line 41
    goto :goto_1

    .line 42
    :cond_2
    iget-object v1, p0, Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel$initData$1;->a:Ljava/lang/Object;

    .line 43
    .line 44
    check-cast v1, Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel;

    .line 45
    .line 46
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 47
    .line 48
    .line 49
    goto :goto_0

    .line 50
    :cond_3
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 51
    .line 52
    .line 53
    iget-object p1, p0, Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel$initData$1;->d:Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel;

    .line 54
    .line 55
    invoke-virtual {p1}, Lcom/zykj/evaluation/ui/sheet/AnswerSheetViewModel;->u()Lv6/v;

    .line 56
    .line 57
    .line 58
    move-result-object v1

    .line 59
    sget-object v6, Lv6/w$c;->a:Lv6/w$c;

    .line 60
    .line 61
    const/4 v7, 0x0

    .line 62
    invoke-static {v1, v6, v7, v5, v2}, Lv6/v;->b(Lv6/v;Lv6/w;IILjava/lang/Object;)Lv6/v;

    .line 63
    .line 64
    .line 65
    move-result-object v1

    .line 66
    invoke-virtual {p1, v1}, Lcom/zykj/evaluation/ui/sheet/AnswerSheetViewModel;->P(Lv6/v;)V

    .line 67
    .line 68
    .line 69
    iget-object v1, p0, Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel$initData$1;->d:Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel;

    .line 70
    .line 71
    iput-object v1, p0, Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel$initData$1;->a:Ljava/lang/Object;

    .line 72
    .line 73
    iput v4, p0, Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel$initData$1;->c:I

    .line 74
    .line 75
    invoke-static {v1, p0}, Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel;->i0(Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 76
    .line 77
    .line 78
    move-result-object p1

    .line 79
    if-ne p1, v0, :cond_4

    .line 80
    .line 81
    goto :goto_2

    .line 82
    :cond_4
    :goto_0
    check-cast p1, [B

    .line 83
    .line 84
    if-eqz p1, :cond_8

    .line 85
    .line 86
    invoke-static {v1, p1}, Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel;->w0(Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel;[B)V

    .line 87
    .line 88
    .line 89
    iget-object p1, p0, Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel$initData$1;->d:Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel;

    .line 90
    .line 91
    iget-object v1, p0, Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel$initData$1;->e:Lcom/zykj/evaluation/bean/bundle/AnswerSheetBundle;

    .line 92
    .line 93
    invoke-virtual {v1}, Lcom/zykj/evaluation/bean/bundle/AnswerSheetBundle;->getAddress()Ljava/lang/String;

    .line 94
    .line 95
    .line 96
    move-result-object v1

    .line 97
    iget-object v4, p0, Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel$initData$1;->e:Lcom/zykj/evaluation/bean/bundle/AnswerSheetBundle;

    .line 98
    .line 99
    invoke-virtual {v4}, Lcom/zykj/evaluation/bean/bundle/AnswerSheetBundle;->getTestPagerId()J

    .line 100
    .line 101
    .line 102
    move-result-wide v6

    .line 103
    iput-object v2, p0, Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel$initData$1;->a:Ljava/lang/Object;

    .line 104
    .line 105
    iput v5, p0, Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel$initData$1;->c:I

    .line 106
    .line 107
    invoke-static {p1, v1, v6, v7, p0}, Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel;->q0(Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel;Ljava/lang/String;JLkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 108
    .line 109
    .line 110
    move-result-object p1

    .line 111
    if-ne p1, v0, :cond_5

    .line 112
    .line 113
    goto :goto_2

    .line 114
    :cond_5
    :goto_1
    iget-object p1, p0, Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel$initData$1;->d:Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel;

    .line 115
    .line 116
    invoke-static {p1}, Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel;->d0(Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel;)Lcom/zykj/evaluation/bean/PaperConfig;

    .line 117
    .line 118
    .line 119
    move-result-object p1

    .line 120
    if-nez p1, :cond_6

    .line 121
    .line 122
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 123
    .line 124
    return-object p1

    .line 125
    :cond_6
    iget-object v1, p0, Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel$initData$1;->d:Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel;

    .line 126
    .line 127
    invoke-static {v1, p1}, Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel;->o0(Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel;Lcom/zykj/evaluation/bean/PaperConfig;)V

    .line 128
    .line 129
    .line 130
    iget-object v1, p0, Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel$initData$1;->d:Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel;

    .line 131
    .line 132
    sget-object v2, Lg7/j;->a:Lg7/j;

    .line 133
    .line 134
    invoke-virtual {p1}, Lcom/zykj/evaluation/bean/PaperConfig;->getVersion()Ljava/lang/String;

    .line 135
    .line 136
    .line 137
    move-result-object v4

    .line 138
    iget-object v5, p0, Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel$initData$1;->e:Lcom/zykj/evaluation/bean/bundle/AnswerSheetBundle;

    .line 139
    .line 140
    invoke-virtual {v5}, Lcom/zykj/evaluation/bean/bundle/AnswerSheetBundle;->isNoStem()Z

    .line 141
    .line 142
    .line 143
    move-result v5

    .line 144
    invoke-virtual {v2, v4, v5}, Lg7/j;->a(Ljava/lang/String;Z)Z

    .line 145
    .line 146
    .line 147
    move-result v2

    .line 148
    invoke-static {v1, v2}, Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel;->v0(Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel;Z)V

    .line 149
    .line 150
    .line 151
    invoke-virtual {p1}, Lcom/zykj/evaluation/bean/PaperConfig;->getPages()Ljava/util/List;

    .line 152
    .line 153
    .line 154
    move-result-object v1

    .line 155
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 156
    .line 157
    .line 158
    move-result v1

    .line 159
    iget-object v2, p0, Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel$initData$1;->d:Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel;

    .line 160
    .line 161
    invoke-static {v2, v1}, Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel;->Y(Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel;I)V

    .line 162
    .line 163
    .line 164
    iget-object v2, p0, Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel$initData$1;->d:Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel;

    .line 165
    .line 166
    invoke-static {v2, v1}, Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel;->n0(Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel;I)V

    .line 167
    .line 168
    .line 169
    iget-object v2, p0, Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel$initData$1;->d:Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel;

    .line 170
    .line 171
    invoke-static {v2, v1}, Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel;->p0(Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel;I)V

    .line 172
    .line 173
    .line 174
    iget-object v2, p0, Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel$initData$1;->d:Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel;

    .line 175
    .line 176
    invoke-static {p1}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 177
    .line 178
    .line 179
    move-result-object p1

    .line 180
    iput-object p1, p0, Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel$initData$1;->a:Ljava/lang/Object;

    .line 181
    .line 182
    iput v1, p0, Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel$initData$1;->b:I

    .line 183
    .line 184
    iput v3, p0, Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel$initData$1;->c:I

    .line 185
    .line 186
    invoke-static {v2, p0}, Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel;->s0(Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 187
    .line 188
    .line 189
    move-result-object p1

    .line 190
    if-ne p1, v0, :cond_7

    .line 191
    .line 192
    :goto_2
    return-object v0

    .line 193
    :cond_7
    move v0, v1

    .line 194
    :goto_3
    iget-object p1, p0, Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel$initData$1;->d:Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel;

    .line 195
    .line 196
    invoke-static {p1, v0}, Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel;->r0(Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel;I)V

    .line 197
    .line 198
    .line 199
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 200
    .line 201
    return-object p1

    .line 202
    :cond_8
    new-instance p1, Ljava/lang/Exception;

    .line 203
    .line 204
    const-string v0, "TFLite init Failed"

    .line 205
    .line 206
    invoke-direct {p1, v0}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 207
    .line 208
    .line 209
    throw p1
.end method
