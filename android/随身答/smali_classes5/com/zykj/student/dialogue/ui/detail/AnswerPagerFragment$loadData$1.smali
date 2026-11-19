.class final Lcom/zykj/student/dialogue/ui/detail/AnswerPagerFragment$loadData$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/student/dialogue/ui/detail/AnswerPagerFragment;->L()V
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
    c = "com.zykj.student.dialogue.ui.detail.AnswerPagerFragment$loadData$1"
    f = "AnswerPagerFragment.kt"
    i = {}
    l = {}
    m = "invokeSuspend"
    n = {}
    s = {}
.end annotation


# instance fields
.field public a:I

.field public final synthetic b:Lcom/zykj/student/dialogue/ui/detail/AnswerPagerFragment;


# direct methods
.method public constructor <init>(Lcom/zykj/student/dialogue/ui/detail/AnswerPagerFragment;Lkotlin/coroutines/Continuation;)V
    .locals 0

    iput-object p1, p0, Lcom/zykj/student/dialogue/ui/detail/AnswerPagerFragment$loadData$1;->b:Lcom/zykj/student/dialogue/ui/detail/AnswerPagerFragment;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILkotlin/coroutines/Continuation;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;
    .locals 1

    new-instance p1, Lcom/zykj/student/dialogue/ui/detail/AnswerPagerFragment$loadData$1;

    iget-object v0, p0, Lcom/zykj/student/dialogue/ui/detail/AnswerPagerFragment$loadData$1;->b:Lcom/zykj/student/dialogue/ui/detail/AnswerPagerFragment;

    invoke-direct {p1, v0, p2}, Lcom/zykj/student/dialogue/ui/detail/AnswerPagerFragment$loadData$1;-><init>(Lcom/zykj/student/dialogue/ui/detail/AnswerPagerFragment;Lkotlin/coroutines/Continuation;)V

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lkotlinx/coroutines/CoroutineScope;

    check-cast p2, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2}, Lcom/zykj/student/dialogue/ui/detail/AnswerPagerFragment$loadData$1;->invoke(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0

    .line 2
    invoke-virtual {p0, p1, p2}, Lcom/zykj/student/dialogue/ui/detail/AnswerPagerFragment$loadData$1;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object p1

    check-cast p1, Lcom/zykj/student/dialogue/ui/detail/AnswerPagerFragment$loadData$1;

    sget-object p2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lcom/zykj/student/dialogue/ui/detail/AnswerPagerFragment$loadData$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 11

    .line 1
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    iget v0, p0, Lcom/zykj/student/dialogue/ui/detail/AnswerPagerFragment$loadData$1;->a:I

    .line 5
    .line 6
    if-nez v0, :cond_6

    .line 7
    .line 8
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 9
    .line 10
    .line 11
    iget-object p1, p0, Lcom/zykj/student/dialogue/ui/detail/AnswerPagerFragment$loadData$1;->b:Lcom/zykj/student/dialogue/ui/detail/AnswerPagerFragment;

    .line 12
    .line 13
    invoke-static {p1}, Lcom/zykj/student/dialogue/ui/detail/AnswerPagerFragment;->v(Lcom/zykj/student/dialogue/ui/detail/AnswerPagerFragment;)Lcom/zykj/student/dialogue/ui/detail/viewmodel/AnswerViewModel;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    invoke-virtual {p1}, Lcom/zykj/student/dialogue/ui/detail/viewmodel/AnswerViewModel;->K()Lkotlinx/coroutines/flow/StateFlow;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    invoke-interface {p1}, Lkotlinx/coroutines/flow/StateFlow;->getValue()Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    iget-object v0, p0, Lcom/zykj/student/dialogue/ui/detail/AnswerPagerFragment$loadData$1;->b:Lcom/zykj/student/dialogue/ui/detail/AnswerPagerFragment;

    .line 26
    .line 27
    check-cast p1, Lp6/k;

    .line 28
    .line 29
    new-instance v1, Ljava/util/ArrayList;

    .line 30
    .line 31
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 32
    .line 33
    .line 34
    invoke-virtual {p1}, Lp6/k;->c()Z

    .line 35
    .line 36
    .line 37
    move-result v2

    .line 38
    const/4 v3, 0x2

    .line 39
    const-string v4, "/"

    .line 40
    .line 41
    const/4 v5, 0x0

    .line 42
    const/4 v6, 0x1

    .line 43
    const/4 v7, 0x0

    .line 44
    if-eqz v2, :cond_1

    .line 45
    .line 46
    invoke-virtual {p1}, Lp6/k;->i()Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object v2

    .line 50
    if-eqz v2, :cond_0

    .line 51
    .line 52
    invoke-static {v0, v2}, Lcom/zykj/student/dialogue/ui/detail/AnswerPagerFragment;->x(Lcom/zykj/student/dialogue/ui/detail/AnswerPagerFragment;Ljava/lang/String;)V

    .line 53
    .line 54
    .line 55
    goto :goto_1

    .line 56
    :cond_0
    invoke-static {v0, v5}, Lcom/zykj/student/dialogue/ui/detail/AnswerPagerFragment;->z(Lcom/zykj/student/dialogue/ui/detail/AnswerPagerFragment;Z)V

    .line 57
    .line 58
    .line 59
    goto :goto_1

    .line 60
    :cond_1
    invoke-virtual {p1}, Lp6/k;->g()Lcom/zykj/student/dialogue/bean/resp/MessageResponse;

    .line 61
    .line 62
    .line 63
    move-result-object v2

    .line 64
    if-eqz v2, :cond_2

    .line 65
    .line 66
    new-instance v5, Lcom/liulishuo/okdownload/a$a;

    .line 67
    .line 68
    invoke-virtual {v2}, Lcom/zykj/student/dialogue/bean/resp/MessageResponse;->getContent()Ljava/lang/String;

    .line 69
    .line 70
    .line 71
    move-result-object v8

    .line 72
    invoke-static {v0}, Lcom/zykj/student/dialogue/ui/detail/AnswerPagerFragment;->v(Lcom/zykj/student/dialogue/ui/detail/AnswerPagerFragment;)Lcom/zykj/student/dialogue/ui/detail/viewmodel/AnswerViewModel;

    .line 73
    .line 74
    .line 75
    move-result-object v9

    .line 76
    invoke-virtual {v9}, Lcom/zykj/student/dialogue/ui/detail/viewmodel/AnswerViewModel;->A()Ljava/lang/String;

    .line 77
    .line 78
    .line 79
    move-result-object v9

    .line 80
    invoke-virtual {v2}, Lcom/zykj/student/dialogue/bean/resp/MessageResponse;->getContent()Ljava/lang/String;

    .line 81
    .line 82
    .line 83
    move-result-object v2

    .line 84
    invoke-static {v2, v4, v7, v3, v7}, Lkotlin/text/StringsKt;->substringAfterLast$default(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Ljava/lang/String;

    .line 85
    .line 86
    .line 87
    move-result-object v2

    .line 88
    invoke-direct {v5, v8, v9, v2}, Lcom/liulishuo/okdownload/a$a;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 89
    .line 90
    .line 91
    const/16 v2, 0x64

    .line 92
    .line 93
    invoke-virtual {v5, v2}, Lcom/liulishuo/okdownload/a$a;->d(I)Lcom/liulishuo/okdownload/a$a;

    .line 94
    .line 95
    .line 96
    move-result-object v2

    .line 97
    invoke-virtual {v2, v6}, Lcom/liulishuo/okdownload/a$a;->c(Z)Lcom/liulishuo/okdownload/a$a;

    .line 98
    .line 99
    .line 100
    move-result-object v2

    .line 101
    invoke-virtual {v2}, Lcom/liulishuo/okdownload/a$a;->a()Lcom/liulishuo/okdownload/a;

    .line 102
    .line 103
    .line 104
    move-result-object v2

    .line 105
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 106
    .line 107
    .line 108
    move-result v2

    .line 109
    invoke-static {v2}, Lkotlin/coroutines/jvm/internal/Boxing;->boxBoolean(Z)Ljava/lang/Boolean;

    .line 110
    .line 111
    .line 112
    goto :goto_0

    .line 113
    :cond_2
    invoke-static {v0, v5}, Lcom/zykj/student/dialogue/ui/detail/AnswerPagerFragment;->z(Lcom/zykj/student/dialogue/ui/detail/AnswerPagerFragment;Z)V

    .line 114
    .line 115
    .line 116
    :goto_0
    move v5, v6

    .line 117
    :goto_1
    invoke-virtual {p1}, Lp6/k;->d()Z

    .line 118
    .line 119
    .line 120
    move-result v2

    .line 121
    if-eqz v2, :cond_3

    .line 122
    .line 123
    invoke-virtual {p1}, Lp6/k;->k()Lcom/zykj/student/dialogue/bean/resp/MessageResponse;

    .line 124
    .line 125
    .line 126
    move-result-object v2

    .line 127
    if-eqz v2, :cond_3

    .line 128
    .line 129
    new-instance v8, Lcom/liulishuo/okdownload/a$a;

    .line 130
    .line 131
    invoke-virtual {v2}, Lcom/zykj/student/dialogue/bean/resp/MessageResponse;->getContent()Ljava/lang/String;

    .line 132
    .line 133
    .line 134
    move-result-object v9

    .line 135
    invoke-static {v0}, Lcom/zykj/student/dialogue/ui/detail/AnswerPagerFragment;->v(Lcom/zykj/student/dialogue/ui/detail/AnswerPagerFragment;)Lcom/zykj/student/dialogue/ui/detail/viewmodel/AnswerViewModel;

    .line 136
    .line 137
    .line 138
    move-result-object v10

    .line 139
    invoke-virtual {v10}, Lcom/zykj/student/dialogue/ui/detail/viewmodel/AnswerViewModel;->A()Ljava/lang/String;

    .line 140
    .line 141
    .line 142
    move-result-object v10

    .line 143
    invoke-virtual {v2}, Lcom/zykj/student/dialogue/bean/resp/MessageResponse;->getContent()Ljava/lang/String;

    .line 144
    .line 145
    .line 146
    move-result-object v2

    .line 147
    invoke-static {v2, v4, v7, v3, v7}, Lkotlin/text/StringsKt;->substringAfterLast$default(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Ljava/lang/String;

    .line 148
    .line 149
    .line 150
    move-result-object v2

    .line 151
    invoke-direct {v8, v9, v10, v2}, Lcom/liulishuo/okdownload/a$a;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 152
    .line 153
    .line 154
    invoke-virtual {v8, v6}, Lcom/liulishuo/okdownload/a$a;->c(Z)Lcom/liulishuo/okdownload/a$a;

    .line 155
    .line 156
    .line 157
    move-result-object v2

    .line 158
    invoke-virtual {v2}, Lcom/liulishuo/okdownload/a$a;->a()Lcom/liulishuo/okdownload/a;

    .line 159
    .line 160
    .line 161
    move-result-object v2

    .line 162
    invoke-static {v2}, Lcom/liulishuo/okdownload/StatusUtil;->c(Lcom/liulishuo/okdownload/a;)Z

    .line 163
    .line 164
    .line 165
    move-result v8

    .line 166
    if-nez v8, :cond_3

    .line 167
    .line 168
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 169
    .line 170
    .line 171
    :cond_3
    invoke-virtual {p1}, Lp6/k;->e()Z

    .line 172
    .line 173
    .line 174
    move-result v2

    .line 175
    if-eqz v2, :cond_4

    .line 176
    .line 177
    invoke-virtual {p1}, Lp6/k;->m()Lcom/zykj/student/dialogue/bean/resp/MessageResponse;

    .line 178
    .line 179
    .line 180
    move-result-object p1

    .line 181
    if-eqz p1, :cond_4

    .line 182
    .line 183
    new-instance v2, Lcom/liulishuo/okdownload/a$a;

    .line 184
    .line 185
    invoke-virtual {p1}, Lcom/zykj/student/dialogue/bean/resp/MessageResponse;->getContent()Ljava/lang/String;

    .line 186
    .line 187
    .line 188
    move-result-object v8

    .line 189
    invoke-static {v0}, Lcom/zykj/student/dialogue/ui/detail/AnswerPagerFragment;->v(Lcom/zykj/student/dialogue/ui/detail/AnswerPagerFragment;)Lcom/zykj/student/dialogue/ui/detail/viewmodel/AnswerViewModel;

    .line 190
    .line 191
    .line 192
    move-result-object v9

    .line 193
    invoke-virtual {v9}, Lcom/zykj/student/dialogue/ui/detail/viewmodel/AnswerViewModel;->A()Ljava/lang/String;

    .line 194
    .line 195
    .line 196
    move-result-object v9

    .line 197
    invoke-virtual {p1}, Lcom/zykj/student/dialogue/bean/resp/MessageResponse;->getContent()Ljava/lang/String;

    .line 198
    .line 199
    .line 200
    move-result-object p1

    .line 201
    invoke-static {p1, v4, v7, v3, v7}, Lkotlin/text/StringsKt;->substringAfterLast$default(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Ljava/lang/String;

    .line 202
    .line 203
    .line 204
    move-result-object p1

    .line 205
    invoke-direct {v2, v8, v9, p1}, Lcom/liulishuo/okdownload/a$a;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 206
    .line 207
    .line 208
    invoke-virtual {v2, v6}, Lcom/liulishuo/okdownload/a$a;->c(Z)Lcom/liulishuo/okdownload/a$a;

    .line 209
    .line 210
    .line 211
    move-result-object p1

    .line 212
    invoke-virtual {p1}, Lcom/liulishuo/okdownload/a$a;->a()Lcom/liulishuo/okdownload/a;

    .line 213
    .line 214
    .line 215
    move-result-object p1

    .line 216
    invoke-static {p1}, Lcom/liulishuo/okdownload/StatusUtil;->c(Lcom/liulishuo/okdownload/a;)Z

    .line 217
    .line 218
    .line 219
    move-result v2

    .line 220
    if-nez v2, :cond_4

    .line 221
    .line 222
    invoke-virtual {v1, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 223
    .line 224
    .line 225
    :cond_4
    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    .line 226
    .line 227
    .line 228
    move-result p1

    .line 229
    if-nez p1, :cond_5

    .line 230
    .line 231
    invoke-static {v0, v1, v5}, Lcom/zykj/student/dialogue/ui/detail/AnswerPagerFragment;->p(Lcom/zykj/student/dialogue/ui/detail/AnswerPagerFragment;Ljava/util/List;Z)V

    .line 232
    .line 233
    .line 234
    :cond_5
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 235
    .line 236
    return-object p1

    .line 237
    :cond_6
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 238
    .line 239
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 240
    .line 241
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 242
    .line 243
    .line 244
    throw p1
.end method
