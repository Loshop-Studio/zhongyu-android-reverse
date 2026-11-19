.class final Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel$startInitialReviewPractice$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lr6/e;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/coroutines/jvm/internal/SuspendLambda;",
        "Lr6/e;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0002\u0010\u0003"
    }
    d2 = {
        "Lkotlinx/coroutines/v;",
        "Ld6/s;",
        "<anonymous>",
        "(Lkotlinx/coroutines/v;)V"
    }
    k = 0x3
    mv = {
        0x2,
        0x2,
        0x0
    }
.end annotation

.annotation runtime Lkotlin/coroutines/jvm/internal/DebugMetadata;
    c = "com.zykj.mistake.feature.notebook.detail.MistakeDetailNewViewModel$startInitialReviewPractice$1"
    f = "MistakeDetailNewViewModel.kt"
    i = {
        0x0,
        0x0,
        0x0,
        0x1,
        0x1,
        0x1
    }
    l = {
        0x2dd,
        0x2df
    }
    m = "invokeSuspend"
    n = {
        "$this$launch",
        "$this$invokeSuspend_u24lambda_u240",
        "$i$a$-runCatching-MistakeDetailNewViewModel$startInitialReviewPractice$1$round$1",
        "$this$launch",
        "$this$invokeSuspend_u24lambda_u240",
        "$i$a$-runCatching-MistakeDetailNewViewModel$startInitialReviewPractice$1$round$1"
    }
    s = {
        "L$0",
        "L$1",
        "I$0",
        "L$0",
        "L$1",
        "I$0"
    }
.end annotation


# instance fields
.field final synthetic $poolType:Lcom/zykj/mistake/feature/review/ReviewContract$PracticePoolType;

.field final synthetic $scene:Lcom/zykj/mistake/feature/review/ReviewContract$PracticeScene;

.field I$0:I

.field private synthetic L$0:Ljava/lang/Object;

.field L$1:Ljava/lang/Object;

.field label:I

.field final synthetic this$0:Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel;


# direct methods
.method public constructor <init>(Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel;Lcom/zykj/mistake/feature/review/ReviewContract$PracticeScene;Lcom/zykj/mistake/feature/review/ReviewContract$PracticePoolType;Lh6/c;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel;",
            "Lcom/zykj/mistake/feature/review/ReviewContract$PracticeScene;",
            "Lcom/zykj/mistake/feature/review/ReviewContract$PracticePoolType;",
            "Lh6/c<",
            "-",
            "Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel$startInitialReviewPractice$1;",
            ">;)V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel$startInitialReviewPractice$1;->this$0:Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel$startInitialReviewPractice$1;->$scene:Lcom/zykj/mistake/feature/review/ReviewContract$PracticeScene;

    .line 4
    .line 5
    iput-object p3, p0, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel$startInitialReviewPractice$1;->$poolType:Lcom/zykj/mistake/feature/review/ReviewContract$PracticePoolType;

    .line 6
    .line 7
    const/4 p1, 0x2

    .line 8
    invoke-direct {p0, p1, p4}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILh6/c;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lh6/c;)Lh6/c;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            "Lh6/c<",
            "*>;)",
            "Lh6/c<",
            "Ld6/s;",
            ">;"
        }
    .end annotation

    .line 1
    new-instance v0, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel$startInitialReviewPractice$1;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel$startInitialReviewPractice$1;->this$0:Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel;

    .line 4
    .line 5
    iget-object v2, p0, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel$startInitialReviewPractice$1;->$scene:Lcom/zykj/mistake/feature/review/ReviewContract$PracticeScene;

    .line 6
    .line 7
    iget-object v3, p0, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel$startInitialReviewPractice$1;->$poolType:Lcom/zykj/mistake/feature/review/ReviewContract$PracticePoolType;

    .line 8
    .line 9
    invoke-direct {v0, v1, v2, v3, p2}, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel$startInitialReviewPractice$1;-><init>(Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel;Lcom/zykj/mistake/feature/review/ReviewContract$PracticeScene;Lcom/zykj/mistake/feature/review/ReviewContract$PracticePoolType;Lh6/c;)V

    .line 10
    .line 11
    .line 12
    iput-object p1, v0, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel$startInitialReviewPractice$1;->L$0:Ljava/lang/Object;

    .line 13
    .line 14
    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lkotlinx/coroutines/v;

    check-cast p2, Lh6/c;

    invoke-virtual {p0, p1, p2}, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel$startInitialReviewPractice$1;->invoke(Lkotlinx/coroutines/v;Lh6/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Lkotlinx/coroutines/v;Lh6/c;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlinx/coroutines/v;",
            "Lh6/c<",
            "-",
            "Ld6/s;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 2
    invoke-virtual {p0, p1, p2}, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel$startInitialReviewPractice$1;->create(Ljava/lang/Object;Lh6/c;)Lh6/c;

    move-result-object p1

    check-cast p1, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel$startInitialReviewPractice$1;

    sget-object p2, Ld6/s;->a:Ld6/s;

    invoke-virtual {p1, p2}, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel$startInitialReviewPractice$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    .line 1
    iget-object v0, p0, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel$startInitialReviewPractice$1;->L$0:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lkotlinx/coroutines/v;

    .line 4
    .line 5
    sget-object v0, Lkotlin/coroutines/intrinsics/CoroutineSingletons;->COROUTINE_SUSPENDED:Lkotlin/coroutines/intrinsics/CoroutineSingletons;

    .line 6
    .line 7
    iget v1, p0, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel$startInitialReviewPractice$1;->label:I

    .line 8
    .line 9
    const/4 v2, 0x2

    .line 10
    const/4 v3, 0x1

    .line 11
    if-eqz v1, :cond_2

    .line 12
    .line 13
    if-eq v1, v3, :cond_1

    .line 14
    .line 15
    if-ne v1, v2, :cond_0

    .line 16
    .line 17
    iget-object v0, p0, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel$startInitialReviewPractice$1;->L$1:Ljava/lang/Object;

    .line 18
    .line 19
    check-cast v0, Lkotlinx/coroutines/v;

    .line 20
    .line 21
    :try_start_0
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 22
    .line 23
    .line 24
    goto :goto_3

    .line 25
    :catchall_0
    move-exception p1

    .line 26
    goto/16 :goto_5

    .line 27
    .line 28
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 29
    .line 30
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 31
    .line 32
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    throw p1

    .line 36
    :cond_1
    iget-object v0, p0, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel$startInitialReviewPractice$1;->L$1:Ljava/lang/Object;

    .line 37
    .line 38
    check-cast v0, Lkotlinx/coroutines/v;

    .line 39
    .line 40
    :try_start_1
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 41
    .line 42
    .line 43
    goto :goto_0

    .line 44
    :cond_2
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 45
    .line 46
    .line 47
    iget-object p1, p0, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel$startInitialReviewPractice$1;->this$0:Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel;

    .line 48
    .line 49
    sget-object v1, Lcom/zykj/mistake/feature/notebook/detail/h1;->a:Lcom/zykj/mistake/feature/notebook/detail/h1;

    .line 50
    .line 51
    invoke-virtual {p1, v1}, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel;->S(Lcom/zykj/mistake/feature/notebook/detail/k1;)V

    .line 52
    .line 53
    .line 54
    iget-object p1, p0, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel$startInitialReviewPractice$1;->$scene:Lcom/zykj/mistake/feature/review/ReviewContract$PracticeScene;

    .line 55
    .line 56
    iget-object v1, p0, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel$startInitialReviewPractice$1;->$poolType:Lcom/zykj/mistake/feature/review/ReviewContract$PracticePoolType;

    .line 57
    .line 58
    :try_start_2
    sget-object v4, Lcom/zykj/mistake/feature/review/ReviewContract$PracticeScene;->RECOMMEND:Lcom/zykj/mistake/feature/review/ReviewContract$PracticeScene;

    .line 59
    .line 60
    const/4 v5, 0x0

    .line 61
    const/4 v6, 0x0

    .line 62
    if-ne p1, v4, :cond_4

    .line 63
    .line 64
    sget-object p1, Lcom/zykj/mistake/feature/review/q;->a:Lcom/zykj/mistake/feature/review/q;

    .line 65
    .line 66
    iput-object v5, p0, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel$startInitialReviewPractice$1;->L$0:Ljava/lang/Object;

    .line 67
    .line 68
    iput-object v5, p0, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel$startInitialReviewPractice$1;->L$1:Ljava/lang/Object;

    .line 69
    .line 70
    iput v6, p0, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel$startInitialReviewPractice$1;->I$0:I

    .line 71
    .line 72
    iput v3, p0, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel$startInitialReviewPractice$1;->label:I

    .line 73
    .line 74
    invoke-virtual {p1, v3, p0}, Lcom/zykj/mistake/feature/review/q;->d(ILkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;

    .line 75
    .line 76
    .line 77
    move-result-object p1

    .line 78
    if-ne p1, v0, :cond_3

    .line 79
    .line 80
    goto :goto_2

    .line 81
    :cond_3
    :goto_0
    check-cast p1, Lcom/zykj/mistake/feature/review/m;

    .line 82
    .line 83
    goto :goto_4

    .line 84
    :cond_4
    sget-object p1, Lcom/zykj/mistake/feature/review/q;->a:Lcom/zykj/mistake/feature/review/q;

    .line 85
    .line 86
    if-nez v1, :cond_5

    .line 87
    .line 88
    sget-object v1, Lcom/zykj/mistake/feature/review/ReviewContract$PracticePoolType;->STRENGTHENING:Lcom/zykj/mistake/feature/review/ReviewContract$PracticePoolType;

    .line 89
    .line 90
    :cond_5
    iput-object v5, p0, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel$startInitialReviewPractice$1;->L$0:Ljava/lang/Object;

    .line 91
    .line 92
    iput-object v5, p0, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel$startInitialReviewPractice$1;->L$1:Ljava/lang/Object;

    .line 93
    .line 94
    iput v6, p0, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel$startInitialReviewPractice$1;->I$0:I

    .line 95
    .line 96
    iput v2, p0, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel$startInitialReviewPractice$1;->label:I

    .line 97
    .line 98
    sget-object v4, Lcom/zykj/mistake/feature/review/p;->a:[I

    .line 99
    .line 100
    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    .line 101
    .line 102
    .line 103
    move-result v1

    .line 104
    aget v1, v4, v1

    .line 105
    .line 106
    if-eq v1, v3, :cond_8

    .line 107
    .line 108
    const/4 v3, 0x3

    .line 109
    if-eq v1, v2, :cond_7

    .line 110
    .line 111
    if-ne v1, v3, :cond_6

    .line 112
    .line 113
    const/4 v2, 0x4

    .line 114
    goto :goto_1

    .line 115
    :cond_6
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    .line 116
    .line 117
    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    .line 118
    .line 119
    .line 120
    throw p1

    .line 121
    :cond_7
    move v2, v3

    .line 122
    :cond_8
    :goto_1
    invoke-virtual {p1, v2, p0}, Lcom/zykj/mistake/feature/review/q;->d(ILkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;

    .line 123
    .line 124
    .line 125
    move-result-object p1

    .line 126
    if-ne p1, v0, :cond_9

    .line 127
    .line 128
    :goto_2
    return-object v0

    .line 129
    :cond_9
    :goto_3
    check-cast p1, Lcom/zykj/mistake/feature/review/m;

    .line 130
    .line 131
    :goto_4
    invoke-static {p1}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    .line 132
    .line 133
    .line 134
    move-result-object p1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 135
    goto :goto_6

    .line 136
    :goto_5
    invoke-static {p1}, Lkotlin/b;->a(Ljava/lang/Throwable;)Lkotlin/Result$Failure;

    .line 137
    .line 138
    .line 139
    move-result-object p1

    .line 140
    invoke-static {p1}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    .line 141
    .line 142
    .line 143
    move-result-object p1

    .line 144
    :goto_6
    iget-object v0, p0, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel$startInitialReviewPractice$1;->this$0:Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel;

    .line 145
    .line 146
    invoke-static {p1}, Lkotlin/Result;->exceptionOrNull-impl(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 147
    .line 148
    .line 149
    move-result-object v1

    .line 150
    sget-object v2, Ld6/s;->a:Ld6/s;

    .line 151
    .line 152
    sget-object v3, Lcom/zykj/mistake/feature/notebook/detail/x0;->a:Lcom/zykj/mistake/feature/notebook/detail/x0;

    .line 153
    .line 154
    if-nez v1, :cond_c

    .line 155
    .line 156
    check-cast p1, Lcom/zykj/mistake/feature/review/m;

    .line 157
    .line 158
    if-eqz p1, :cond_b

    .line 159
    .line 160
    iget-object v0, p1, Lcom/zykj/mistake/feature/review/m;->c:Ljava/util/List;

    .line 161
    .line 162
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 163
    .line 164
    .line 165
    move-result v0

    .line 166
    if-eqz v0, :cond_a

    .line 167
    .line 168
    goto :goto_7

    .line 169
    :cond_a
    iget-object v0, p0, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel$startInitialReviewPractice$1;->this$0:Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel;

    .line 170
    .line 171
    invoke-static {v0, p1}, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel;->a(Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel;Lcom/zykj/mistake/feature/review/m;)V

    .line 172
    .line 173
    .line 174
    iget-object p1, p0, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel$startInitialReviewPractice$1;->this$0:Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel;

    .line 175
    .line 176
    invoke-virtual {p1, v3}, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel;->S(Lcom/zykj/mistake/feature/notebook/detail/k1;)V

    .line 177
    .line 178
    .line 179
    return-object v2

    .line 180
    :cond_b
    :goto_7
    iget-object p1, p0, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel$startInitialReviewPractice$1;->this$0:Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel;

    .line 181
    .line 182
    new-instance v0, Lcom/zykj/mistake/feature/notebook/detail/j1;

    .line 183
    .line 184
    const-string v1, "\u6682\u65e0\u53ef\u7ec3\u4e60\u9898\u76ee"

    .line 185
    .line 186
    invoke-direct {v0, v1}, Lcom/zykj/mistake/feature/notebook/detail/j1;-><init>(Ljava/lang/String;)V

    .line 187
    .line 188
    .line 189
    invoke-virtual {p1, v0}, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel;->S(Lcom/zykj/mistake/feature/notebook/detail/k1;)V

    .line 190
    .line 191
    .line 192
    iget-object p1, p0, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel$startInitialReviewPractice$1;->this$0:Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel;

    .line 193
    .line 194
    invoke-virtual {p1, v3}, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel;->S(Lcom/zykj/mistake/feature/notebook/detail/k1;)V

    .line 195
    .line 196
    .line 197
    return-object v2

    .line 198
    :cond_c
    new-instance p1, Lcom/zykj/mistake/feature/notebook/detail/j1;

    .line 199
    .line 200
    invoke-virtual {v1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 201
    .line 202
    .line 203
    move-result-object v1

    .line 204
    if-nez v1, :cond_d

    .line 205
    .line 206
    const-string v1, ""

    .line 207
    .line 208
    :cond_d
    invoke-direct {p1, v1}, Lcom/zykj/mistake/feature/notebook/detail/j1;-><init>(Ljava/lang/String;)V

    .line 209
    .line 210
    .line 211
    invoke-virtual {v0, p1}, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel;->S(Lcom/zykj/mistake/feature/notebook/detail/k1;)V

    .line 212
    .line 213
    .line 214
    invoke-virtual {v0, v3}, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel;->S(Lcom/zykj/mistake/feature/notebook/detail/k1;)V

    .line 215
    .line 216
    .line 217
    return-object v2
.end method
