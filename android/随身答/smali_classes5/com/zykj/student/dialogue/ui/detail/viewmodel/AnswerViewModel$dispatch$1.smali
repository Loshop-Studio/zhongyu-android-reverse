.class final Lcom/zykj/student/dialogue/ui/detail/viewmodel/AnswerViewModel$dispatch$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/student/dialogue/ui/detail/viewmodel/AnswerViewModel;->w(Lcom/zykj/student/dialogue/ui/detail/viewmodel/a;)V
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
    c = "com.zykj.student.dialogue.ui.detail.viewmodel.AnswerViewModel$dispatch$1"
    f = "AnswerViewModel.kt"
    i = {
        0x0
    }
    l = {
        0xa8
    }
    m = "invokeSuspend"
    n = {
        "stateValue"
    }
    s = {
        "L$0"
    }
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nAnswerViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnswerViewModel.kt\ncom/zykj/student/dialogue/ui/detail/viewmodel/AnswerViewModel$dispatch$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,529:1\n1563#2:530\n1634#2,3:531\n774#2:534\n865#2,2:535\n*S KotlinDebug\n*F\n+ 1 AnswerViewModel.kt\ncom/zykj/student/dialogue/ui/detail/viewmodel/AnswerViewModel$dispatch$1\n*L\n121#1:530\n121#1:531,3\n138#1:534\n138#1:535,2\n*E\n"
    }
.end annotation


# instance fields
.field public a:Ljava/lang/Object;

.field public b:I

.field public final synthetic c:Lcom/zykj/student/dialogue/ui/detail/viewmodel/AnswerViewModel;

.field public final synthetic d:Lcom/zykj/student/dialogue/ui/detail/viewmodel/a;


# direct methods
.method public constructor <init>(Lcom/zykj/student/dialogue/ui/detail/viewmodel/AnswerViewModel;Lcom/zykj/student/dialogue/ui/detail/viewmodel/a;Lkotlin/coroutines/Continuation;)V
    .locals 0

    iput-object p1, p0, Lcom/zykj/student/dialogue/ui/detail/viewmodel/AnswerViewModel$dispatch$1;->c:Lcom/zykj/student/dialogue/ui/detail/viewmodel/AnswerViewModel;

    iput-object p2, p0, Lcom/zykj/student/dialogue/ui/detail/viewmodel/AnswerViewModel$dispatch$1;->d:Lcom/zykj/student/dialogue/ui/detail/viewmodel/a;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILkotlin/coroutines/Continuation;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;
    .locals 2

    new-instance p1, Lcom/zykj/student/dialogue/ui/detail/viewmodel/AnswerViewModel$dispatch$1;

    iget-object v0, p0, Lcom/zykj/student/dialogue/ui/detail/viewmodel/AnswerViewModel$dispatch$1;->c:Lcom/zykj/student/dialogue/ui/detail/viewmodel/AnswerViewModel;

    iget-object v1, p0, Lcom/zykj/student/dialogue/ui/detail/viewmodel/AnswerViewModel$dispatch$1;->d:Lcom/zykj/student/dialogue/ui/detail/viewmodel/a;

    invoke-direct {p1, v0, v1, p2}, Lcom/zykj/student/dialogue/ui/detail/viewmodel/AnswerViewModel$dispatch$1;-><init>(Lcom/zykj/student/dialogue/ui/detail/viewmodel/AnswerViewModel;Lcom/zykj/student/dialogue/ui/detail/viewmodel/a;Lkotlin/coroutines/Continuation;)V

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lkotlinx/coroutines/CoroutineScope;

    check-cast p2, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2}, Lcom/zykj/student/dialogue/ui/detail/viewmodel/AnswerViewModel$dispatch$1;->invoke(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0

    .line 2
    invoke-virtual {p0, p1, p2}, Lcom/zykj/student/dialogue/ui/detail/viewmodel/AnswerViewModel$dispatch$1;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object p1

    check-cast p1, Lcom/zykj/student/dialogue/ui/detail/viewmodel/AnswerViewModel$dispatch$1;

    sget-object p2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lcom/zykj/student/dialogue/ui/detail/viewmodel/AnswerViewModel$dispatch$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 13

    .line 1
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget v1, p0, Lcom/zykj/student/dialogue/ui/detail/viewmodel/AnswerViewModel$dispatch$1;->b:I

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
    iget-object v0, p0, Lcom/zykj/student/dialogue/ui/detail/viewmodel/AnswerViewModel$dispatch$1;->a:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast v0, Lp6/k;

    .line 15
    .line 16
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 17
    .line 18
    .line 19
    goto/16 :goto_0

    .line 20
    .line 21
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 22
    .line 23
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 24
    .line 25
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    throw p1

    .line 29
    :cond_1
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 30
    .line 31
    .line 32
    iget-object p1, p0, Lcom/zykj/student/dialogue/ui/detail/viewmodel/AnswerViewModel$dispatch$1;->c:Lcom/zykj/student/dialogue/ui/detail/viewmodel/AnswerViewModel;

    .line 33
    .line 34
    invoke-static {p1}, Lcom/zykj/student/dialogue/ui/detail/viewmodel/AnswerViewModel;->u(Lcom/zykj/student/dialogue/ui/detail/viewmodel/AnswerViewModel;)Lkotlinx/coroutines/flow/MutableStateFlow;

    .line 35
    .line 36
    .line 37
    move-result-object p1

    .line 38
    invoke-interface {p1}, Lkotlinx/coroutines/flow/MutableStateFlow;->getValue()Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object p1

    .line 42
    move-object v3, p1

    .line 43
    check-cast v3, Lp6/k;

    .line 44
    .line 45
    iget-object p1, p0, Lcom/zykj/student/dialogue/ui/detail/viewmodel/AnswerViewModel$dispatch$1;->d:Lcom/zykj/student/dialogue/ui/detail/viewmodel/a;

    .line 46
    .line 47
    instance-of v1, p1, Lcom/zykj/student/dialogue/ui/detail/viewmodel/a$c;

    .line 48
    .line 49
    if-eqz v1, :cond_2

    .line 50
    .line 51
    iget-object p1, p0, Lcom/zykj/student/dialogue/ui/detail/viewmodel/AnswerViewModel$dispatch$1;->c:Lcom/zykj/student/dialogue/ui/detail/viewmodel/AnswerViewModel;

    .line 52
    .line 53
    invoke-virtual {p1}, Lcom/zykj/student/dialogue/ui/detail/viewmodel/AnswerViewModel;->O()V

    .line 54
    .line 55
    .line 56
    iget-object p1, p0, Lcom/zykj/student/dialogue/ui/detail/viewmodel/AnswerViewModel$dispatch$1;->c:Lcom/zykj/student/dialogue/ui/detail/viewmodel/AnswerViewModel;

    .line 57
    .line 58
    iget-object v0, p0, Lcom/zykj/student/dialogue/ui/detail/viewmodel/AnswerViewModel$dispatch$1;->d:Lcom/zykj/student/dialogue/ui/detail/viewmodel/a;

    .line 59
    .line 60
    check-cast v0, Lcom/zykj/student/dialogue/ui/detail/viewmodel/a$c;

    .line 61
    .line 62
    invoke-virtual {v0}, Lcom/zykj/student/dialogue/ui/detail/viewmodel/a$c;->a()I

    .line 63
    .line 64
    .line 65
    move-result v5

    .line 66
    const/16 v11, 0x3d

    .line 67
    .line 68
    const/4 v12, 0x0

    .line 69
    const/4 v4, 0x0

    .line 70
    const/4 v6, 0x0

    .line 71
    const/4 v7, 0x0

    .line 72
    const-wide/16 v8, 0x0

    .line 73
    .line 74
    const/4 v10, 0x0

    .line 75
    invoke-static/range {v3 .. v12}, Lp6/k;->b(Lp6/k;Lkotlin/Result;IZLcom/zykj/student/dialogue/ui/detail/viewmodel/Tab;JZILjava/lang/Object;)Lp6/k;

    .line 76
    .line 77
    .line 78
    move-result-object v0

    .line 79
    invoke-static {p1, v0}, Lcom/zykj/student/dialogue/ui/detail/viewmodel/AnswerViewModel;->n(Lcom/zykj/student/dialogue/ui/detail/viewmodel/AnswerViewModel;Lp6/k;)V

    .line 80
    .line 81
    .line 82
    goto/16 :goto_0

    .line 83
    .line 84
    :cond_2
    instance-of v1, p1, Lcom/zykj/student/dialogue/ui/detail/viewmodel/a$b;

    .line 85
    .line 86
    if-eqz v1, :cond_3

    .line 87
    .line 88
    iget-object v0, p0, Lcom/zykj/student/dialogue/ui/detail/viewmodel/AnswerViewModel$dispatch$1;->c:Lcom/zykj/student/dialogue/ui/detail/viewmodel/AnswerViewModel;

    .line 89
    .line 90
    check-cast p1, Lcom/zykj/student/dialogue/ui/detail/viewmodel/a$b;

    .line 91
    .line 92
    invoke-virtual {p1}, Lcom/zykj/student/dialogue/ui/detail/viewmodel/a$b;->a()J

    .line 93
    .line 94
    .line 95
    move-result-wide v8

    .line 96
    const/16 v11, 0x2b

    .line 97
    .line 98
    const/4 v12, 0x0

    .line 99
    const/4 v4, 0x0

    .line 100
    const/4 v5, 0x0

    .line 101
    const/4 v6, 0x1

    .line 102
    const/4 v7, 0x0

    .line 103
    const/4 v10, 0x0

    .line 104
    invoke-static/range {v3 .. v12}, Lp6/k;->b(Lp6/k;Lkotlin/Result;IZLcom/zykj/student/dialogue/ui/detail/viewmodel/Tab;JZILjava/lang/Object;)Lp6/k;

    .line 105
    .line 106
    .line 107
    move-result-object p1

    .line 108
    invoke-static {v0, p1}, Lcom/zykj/student/dialogue/ui/detail/viewmodel/AnswerViewModel;->n(Lcom/zykj/student/dialogue/ui/detail/viewmodel/AnswerViewModel;Lp6/k;)V

    .line 109
    .line 110
    .line 111
    goto :goto_0

    .line 112
    :cond_3
    instance-of v1, p1, Lcom/zykj/student/dialogue/ui/detail/viewmodel/a$a;

    .line 113
    .line 114
    if-eqz v1, :cond_4

    .line 115
    .line 116
    iget-object v0, p0, Lcom/zykj/student/dialogue/ui/detail/viewmodel/AnswerViewModel$dispatch$1;->c:Lcom/zykj/student/dialogue/ui/detail/viewmodel/AnswerViewModel;

    .line 117
    .line 118
    check-cast p1, Lcom/zykj/student/dialogue/ui/detail/viewmodel/a$a;

    .line 119
    .line 120
    invoke-virtual {p1}, Lcom/zykj/student/dialogue/ui/detail/viewmodel/a$a;->a()J

    .line 121
    .line 122
    .line 123
    move-result-wide v8

    .line 124
    const/16 v11, 0x2b

    .line 125
    .line 126
    const/4 v12, 0x0

    .line 127
    const/4 v4, 0x0

    .line 128
    const/4 v5, 0x0

    .line 129
    const/4 v6, 0x0

    .line 130
    const/4 v7, 0x0

    .line 131
    const/4 v10, 0x0

    .line 132
    invoke-static/range {v3 .. v12}, Lp6/k;->b(Lp6/k;Lkotlin/Result;IZLcom/zykj/student/dialogue/ui/detail/viewmodel/Tab;JZILjava/lang/Object;)Lp6/k;

    .line 133
    .line 134
    .line 135
    move-result-object p1

    .line 136
    invoke-static {v0, p1}, Lcom/zykj/student/dialogue/ui/detail/viewmodel/AnswerViewModel;->n(Lcom/zykj/student/dialogue/ui/detail/viewmodel/AnswerViewModel;Lp6/k;)V

    .line 137
    .line 138
    .line 139
    goto :goto_0

    .line 140
    :cond_4
    instance-of v1, p1, Lcom/zykj/student/dialogue/ui/detail/viewmodel/a$d;

    .line 141
    .line 142
    if-eqz v1, :cond_6

    .line 143
    .line 144
    iget-object p1, p0, Lcom/zykj/student/dialogue/ui/detail/viewmodel/AnswerViewModel$dispatch$1;->c:Lcom/zykj/student/dialogue/ui/detail/viewmodel/AnswerViewModel;

    .line 145
    .line 146
    invoke-virtual {p1}, Lcom/zykj/student/dialogue/ui/detail/viewmodel/AnswerViewModel;->H()Lkotlinx/coroutines/flow/StateFlow;

    .line 147
    .line 148
    .line 149
    move-result-object p1

    .line 150
    invoke-interface {p1}, Lkotlinx/coroutines/flow/StateFlow;->getValue()Ljava/lang/Object;

    .line 151
    .line 152
    .line 153
    move-result-object p1

    .line 154
    if-nez p1, :cond_5

    .line 155
    .line 156
    iget-object p1, p0, Lcom/zykj/student/dialogue/ui/detail/viewmodel/AnswerViewModel$dispatch$1;->c:Lcom/zykj/student/dialogue/ui/detail/viewmodel/AnswerViewModel;

    .line 157
    .line 158
    invoke-virtual {p1}, Lcom/zykj/student/dialogue/ui/detail/viewmodel/AnswerViewModel;->I()Ljava/lang/String;

    .line 159
    .line 160
    .line 161
    move-result-object v1

    .line 162
    invoke-static {p1, v1}, Lcom/zykj/student/dialogue/ui/detail/viewmodel/AnswerViewModel;->q(Lcom/zykj/student/dialogue/ui/detail/viewmodel/AnswerViewModel;Ljava/lang/String;)V

    .line 163
    .line 164
    .line 165
    :cond_5
    iget-object p1, p0, Lcom/zykj/student/dialogue/ui/detail/viewmodel/AnswerViewModel$dispatch$1;->c:Lcom/zykj/student/dialogue/ui/detail/viewmodel/AnswerViewModel;

    .line 166
    .line 167
    iget-object v1, p0, Lcom/zykj/student/dialogue/ui/detail/viewmodel/AnswerViewModel$dispatch$1;->d:Lcom/zykj/student/dialogue/ui/detail/viewmodel/a;

    .line 168
    .line 169
    check-cast v1, Lcom/zykj/student/dialogue/ui/detail/viewmodel/a$d;

    .line 170
    .line 171
    invoke-virtual {v1}, Lcom/zykj/student/dialogue/ui/detail/viewmodel/a$d;->a()Z

    .line 172
    .line 173
    .line 174
    move-result v1

    .line 175
    invoke-static {v3}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 176
    .line 177
    .line 178
    move-result-object v3

    .line 179
    iput-object v3, p0, Lcom/zykj/student/dialogue/ui/detail/viewmodel/AnswerViewModel$dispatch$1;->a:Ljava/lang/Object;

    .line 180
    .line 181
    iput v2, p0, Lcom/zykj/student/dialogue/ui/detail/viewmodel/AnswerViewModel$dispatch$1;->b:I

    .line 182
    .line 183
    invoke-virtual {p1, v1, p0}, Lcom/zykj/student/dialogue/ui/detail/viewmodel/AnswerViewModel;->D(ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 184
    .line 185
    .line 186
    move-result-object p1

    .line 187
    if-ne p1, v0, :cond_7

    .line 188
    .line 189
    return-object v0

    .line 190
    :cond_6
    instance-of p1, p1, Lcom/zykj/student/dialogue/ui/detail/viewmodel/a$e;

    .line 191
    .line 192
    if-eqz p1, :cond_8

    .line 193
    .line 194
    iget-object p1, p0, Lcom/zykj/student/dialogue/ui/detail/viewmodel/AnswerViewModel$dispatch$1;->c:Lcom/zykj/student/dialogue/ui/detail/viewmodel/AnswerViewModel;

    .line 195
    .line 196
    invoke-virtual {p1}, Lcom/zykj/student/dialogue/ui/detail/viewmodel/AnswerViewModel;->O()V

    .line 197
    .line 198
    .line 199
    iget-object p1, p0, Lcom/zykj/student/dialogue/ui/detail/viewmodel/AnswerViewModel$dispatch$1;->c:Lcom/zykj/student/dialogue/ui/detail/viewmodel/AnswerViewModel;

    .line 200
    .line 201
    iget-object v0, p0, Lcom/zykj/student/dialogue/ui/detail/viewmodel/AnswerViewModel$dispatch$1;->d:Lcom/zykj/student/dialogue/ui/detail/viewmodel/a;

    .line 202
    .line 203
    check-cast v0, Lcom/zykj/student/dialogue/ui/detail/viewmodel/a$e;

    .line 204
    .line 205
    invoke-virtual {v0}, Lcom/zykj/student/dialogue/ui/detail/viewmodel/a$e;->a()Lcom/zykj/student/dialogue/ui/detail/viewmodel/Tab;

    .line 206
    .line 207
    .line 208
    move-result-object v7

    .line 209
    const/16 v11, 0x35

    .line 210
    .line 211
    const/4 v12, 0x0

    .line 212
    const/4 v4, 0x0

    .line 213
    const/4 v5, 0x0

    .line 214
    const/4 v6, 0x0

    .line 215
    const-wide/16 v8, 0x0

    .line 216
    .line 217
    const/4 v10, 0x0

    .line 218
    invoke-static/range {v3 .. v12}, Lp6/k;->b(Lp6/k;Lkotlin/Result;IZLcom/zykj/student/dialogue/ui/detail/viewmodel/Tab;JZILjava/lang/Object;)Lp6/k;

    .line 219
    .line 220
    .line 221
    move-result-object v0

    .line 222
    invoke-static {p1, v0}, Lcom/zykj/student/dialogue/ui/detail/viewmodel/AnswerViewModel;->n(Lcom/zykj/student/dialogue/ui/detail/viewmodel/AnswerViewModel;Lp6/k;)V

    .line 223
    .line 224
    .line 225
    :cond_7
    :goto_0
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 226
    .line 227
    return-object p1

    .line 228
    :cond_8
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    .line 229
    .line 230
    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    .line 231
    .line 232
    .line 233
    throw p1
.end method
