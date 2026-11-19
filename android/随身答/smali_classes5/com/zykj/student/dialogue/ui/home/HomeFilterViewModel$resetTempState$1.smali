.class final Lcom/zykj/student/dialogue/ui/home/HomeFilterViewModel$resetTempState$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/student/dialogue/ui/home/HomeFilterViewModel;->m(Ls6/k0;)V
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
    c = "com.zykj.student.dialogue.ui.home.HomeFilterViewModel$resetTempState$1"
    f = "HomeFilterViewModel.kt"
    i = {}
    l = {}
    m = "invokeSuspend"
    n = {}
    s = {}
.end annotation


# instance fields
.field public a:I

.field public final synthetic b:Lcom/zykj/student/dialogue/ui/home/HomeFilterViewModel;

.field public final synthetic c:Ls6/k0;


# direct methods
.method public constructor <init>(Lcom/zykj/student/dialogue/ui/home/HomeFilterViewModel;Ls6/k0;Lkotlin/coroutines/Continuation;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/zykj/student/dialogue/ui/home/HomeFilterViewModel$resetTempState$1;->b:Lcom/zykj/student/dialogue/ui/home/HomeFilterViewModel;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/zykj/student/dialogue/ui/home/HomeFilterViewModel$resetTempState$1;->c:Ls6/k0;

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

    new-instance p1, Lcom/zykj/student/dialogue/ui/home/HomeFilterViewModel$resetTempState$1;

    iget-object v0, p0, Lcom/zykj/student/dialogue/ui/home/HomeFilterViewModel$resetTempState$1;->b:Lcom/zykj/student/dialogue/ui/home/HomeFilterViewModel;

    iget-object v1, p0, Lcom/zykj/student/dialogue/ui/home/HomeFilterViewModel$resetTempState$1;->c:Ls6/k0;

    invoke-direct {p1, v0, v1, p2}, Lcom/zykj/student/dialogue/ui/home/HomeFilterViewModel$resetTempState$1;-><init>(Lcom/zykj/student/dialogue/ui/home/HomeFilterViewModel;Ls6/k0;Lkotlin/coroutines/Continuation;)V

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lkotlinx/coroutines/CoroutineScope;

    check-cast p2, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2}, Lcom/zykj/student/dialogue/ui/home/HomeFilterViewModel$resetTempState$1;->invoke(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0

    .line 2
    invoke-virtual {p0, p1, p2}, Lcom/zykj/student/dialogue/ui/home/HomeFilterViewModel$resetTempState$1;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object p1

    check-cast p1, Lcom/zykj/student/dialogue/ui/home/HomeFilterViewModel$resetTempState$1;

    sget-object p2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lcom/zykj/student/dialogue/ui/home/HomeFilterViewModel$resetTempState$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 20

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    iget v1, v0, Lcom/zykj/student/dialogue/ui/home/HomeFilterViewModel$resetTempState$1;->a:I

    .line 7
    .line 8
    if-nez v1, :cond_0

    .line 9
    .line 10
    invoke-static/range {p1 .. p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 11
    .line 12
    .line 13
    iget-object v1, v0, Lcom/zykj/student/dialogue/ui/home/HomeFilterViewModel$resetTempState$1;->b:Lcom/zykj/student/dialogue/ui/home/HomeFilterViewModel;

    .line 14
    .line 15
    invoke-virtual {v1}, Lcom/zykj/student/dialogue/ui/home/HomeFilterViewModel;->g()Ls6/l0;

    .line 16
    .line 17
    .line 18
    move-result-object v2

    .line 19
    iget-object v3, v0, Lcom/zykj/student/dialogue/ui/home/HomeFilterViewModel$resetTempState$1;->c:Ls6/k0;

    .line 20
    .line 21
    invoke-virtual {v3}, Ls6/k0;->h()Lcom/zykj/student/dialogue/bean/resp/FilterType$Subject;

    .line 22
    .line 23
    .line 24
    move-result-object v13

    .line 25
    iget-object v3, v0, Lcom/zykj/student/dialogue/ui/home/HomeFilterViewModel$resetTempState$1;->c:Ls6/k0;

    .line 26
    .line 27
    invoke-virtual {v3}, Ls6/k0;->e()Lcom/zykj/student/dialogue/bean/resp/FilterType$Time$JoinedTime;

    .line 28
    .line 29
    .line 30
    move-result-object v14

    .line 31
    iget-object v3, v0, Lcom/zykj/student/dialogue/ui/home/HomeFilterViewModel$resetTempState$1;->c:Ls6/k0;

    .line 32
    .line 33
    invoke-virtual {v3}, Ls6/k0;->j()Lcom/zykj/student/dialogue/bean/resp/FilterType$Time$UpdatedTime;

    .line 34
    .line 35
    .line 36
    move-result-object v15

    .line 37
    iget-object v3, v0, Lcom/zykj/student/dialogue/ui/home/HomeFilterViewModel$resetTempState$1;->c:Ls6/k0;

    .line 38
    .line 39
    invoke-virtual {v3}, Ls6/k0;->d()Lcom/zykj/student/dialogue/bean/resp/FilterType$Time$FavoriteTime;

    .line 40
    .line 41
    .line 42
    move-result-object v16

    .line 43
    iget-object v3, v0, Lcom/zykj/student/dialogue/ui/home/HomeFilterViewModel$resetTempState$1;->c:Ls6/k0;

    .line 44
    .line 45
    invoke-virtual {v3}, Ls6/k0;->f()Lcom/zykj/student/dialogue/bean/resp/FilterType$QuestionState;

    .line 46
    .line 47
    .line 48
    move-result-object v12

    .line 49
    iget-object v3, v0, Lcom/zykj/student/dialogue/ui/home/HomeFilterViewModel$resetTempState$1;->c:Ls6/k0;

    .line 50
    .line 51
    invoke-virtual {v3}, Ls6/k0;->k()Ljava/util/List;

    .line 52
    .line 53
    .line 54
    move-result-object v10

    .line 55
    iget-object v3, v0, Lcom/zykj/student/dialogue/ui/home/HomeFilterViewModel$resetTempState$1;->c:Ls6/k0;

    .line 56
    .line 57
    invoke-virtual {v3}, Ls6/k0;->i()Ljava/util/List;

    .line 58
    .line 59
    .line 60
    move-result-object v11

    .line 61
    iget-object v3, v0, Lcom/zykj/student/dialogue/ui/home/HomeFilterViewModel$resetTempState$1;->b:Lcom/zykj/student/dialogue/ui/home/HomeFilterViewModel;

    .line 62
    .line 63
    iget-object v4, v0, Lcom/zykj/student/dialogue/ui/home/HomeFilterViewModel$resetTempState$1;->c:Ls6/k0;

    .line 64
    .line 65
    invoke-virtual {v4}, Ls6/k0;->e()Lcom/zykj/student/dialogue/bean/resp/FilterType$Time$JoinedTime;

    .line 66
    .line 67
    .line 68
    move-result-object v4

    .line 69
    iget-object v5, v0, Lcom/zykj/student/dialogue/ui/home/HomeFilterViewModel$resetTempState$1;->b:Lcom/zykj/student/dialogue/ui/home/HomeFilterViewModel;

    .line 70
    .line 71
    invoke-virtual {v5}, Lcom/zykj/student/dialogue/ui/home/HomeFilterViewModel;->g()Ls6/l0;

    .line 72
    .line 73
    .line 74
    move-result-object v5

    .line 75
    invoke-virtual {v5}, Ls6/l0;->d()Lcom/zykj/student/dialogue/bean/resp/FilterType$Time$JoinedTime;

    .line 76
    .line 77
    .line 78
    move-result-object v5

    .line 79
    iget-object v6, v0, Lcom/zykj/student/dialogue/ui/home/HomeFilterViewModel$resetTempState$1;->b:Lcom/zykj/student/dialogue/ui/home/HomeFilterViewModel;

    .line 80
    .line 81
    invoke-virtual {v6}, Lcom/zykj/student/dialogue/ui/home/HomeFilterViewModel;->g()Ls6/l0;

    .line 82
    .line 83
    .line 84
    move-result-object v6

    .line 85
    invoke-virtual {v6}, Ls6/l0;->l()Ljava/util/List;

    .line 86
    .line 87
    .line 88
    move-result-object v6

    .line 89
    invoke-static {v3, v4, v5, v6}, Lcom/zykj/student/dialogue/ui/home/HomeFilterViewModel;->c(Lcom/zykj/student/dialogue/ui/home/HomeFilterViewModel;Lcom/zykj/student/dialogue/bean/resp/FilterType$Time$JoinedTime;Lcom/zykj/student/dialogue/bean/resp/FilterType$Time$JoinedTime;Ljava/util/List;)Ljava/util/List;

    .line 90
    .line 91
    .line 92
    move-result-object v5

    .line 93
    iget-object v3, v0, Lcom/zykj/student/dialogue/ui/home/HomeFilterViewModel$resetTempState$1;->b:Lcom/zykj/student/dialogue/ui/home/HomeFilterViewModel;

    .line 94
    .line 95
    iget-object v4, v0, Lcom/zykj/student/dialogue/ui/home/HomeFilterViewModel$resetTempState$1;->c:Ls6/k0;

    .line 96
    .line 97
    invoke-virtual {v4}, Ls6/k0;->j()Lcom/zykj/student/dialogue/bean/resp/FilterType$Time$UpdatedTime;

    .line 98
    .line 99
    .line 100
    move-result-object v4

    .line 101
    iget-object v6, v0, Lcom/zykj/student/dialogue/ui/home/HomeFilterViewModel$resetTempState$1;->b:Lcom/zykj/student/dialogue/ui/home/HomeFilterViewModel;

    .line 102
    .line 103
    invoke-virtual {v6}, Lcom/zykj/student/dialogue/ui/home/HomeFilterViewModel;->g()Ls6/l0;

    .line 104
    .line 105
    .line 106
    move-result-object v6

    .line 107
    invoke-virtual {v6}, Ls6/l0;->i()Lcom/zykj/student/dialogue/bean/resp/FilterType$Time$UpdatedTime;

    .line 108
    .line 109
    .line 110
    move-result-object v6

    .line 111
    iget-object v7, v0, Lcom/zykj/student/dialogue/ui/home/HomeFilterViewModel$resetTempState$1;->b:Lcom/zykj/student/dialogue/ui/home/HomeFilterViewModel;

    .line 112
    .line 113
    invoke-virtual {v7}, Lcom/zykj/student/dialogue/ui/home/HomeFilterViewModel;->g()Ls6/l0;

    .line 114
    .line 115
    .line 116
    move-result-object v7

    .line 117
    invoke-virtual {v7}, Ls6/l0;->p()Ljava/util/List;

    .line 118
    .line 119
    .line 120
    move-result-object v7

    .line 121
    invoke-static {v3, v4, v6, v7}, Lcom/zykj/student/dialogue/ui/home/HomeFilterViewModel;->d(Lcom/zykj/student/dialogue/ui/home/HomeFilterViewModel;Lcom/zykj/student/dialogue/bean/resp/FilterType$Time$UpdatedTime;Lcom/zykj/student/dialogue/bean/resp/FilterType$Time$UpdatedTime;Ljava/util/List;)Ljava/util/List;

    .line 122
    .line 123
    .line 124
    move-result-object v4

    .line 125
    iget-object v3, v0, Lcom/zykj/student/dialogue/ui/home/HomeFilterViewModel$resetTempState$1;->b:Lcom/zykj/student/dialogue/ui/home/HomeFilterViewModel;

    .line 126
    .line 127
    iget-object v6, v0, Lcom/zykj/student/dialogue/ui/home/HomeFilterViewModel$resetTempState$1;->c:Ls6/k0;

    .line 128
    .line 129
    invoke-virtual {v6}, Ls6/k0;->d()Lcom/zykj/student/dialogue/bean/resp/FilterType$Time$FavoriteTime;

    .line 130
    .line 131
    .line 132
    move-result-object v6

    .line 133
    iget-object v7, v0, Lcom/zykj/student/dialogue/ui/home/HomeFilterViewModel$resetTempState$1;->b:Lcom/zykj/student/dialogue/ui/home/HomeFilterViewModel;

    .line 134
    .line 135
    invoke-virtual {v7}, Lcom/zykj/student/dialogue/ui/home/HomeFilterViewModel;->g()Ls6/l0;

    .line 136
    .line 137
    .line 138
    move-result-object v7

    .line 139
    invoke-virtual {v7}, Ls6/l0;->c()Lcom/zykj/student/dialogue/bean/resp/FilterType$Time$FavoriteTime;

    .line 140
    .line 141
    .line 142
    move-result-object v7

    .line 143
    iget-object v8, v0, Lcom/zykj/student/dialogue/ui/home/HomeFilterViewModel$resetTempState$1;->b:Lcom/zykj/student/dialogue/ui/home/HomeFilterViewModel;

    .line 144
    .line 145
    invoke-virtual {v8}, Lcom/zykj/student/dialogue/ui/home/HomeFilterViewModel;->g()Ls6/l0;

    .line 146
    .line 147
    .line 148
    move-result-object v8

    .line 149
    invoke-virtual {v8}, Ls6/l0;->k()Ljava/util/List;

    .line 150
    .line 151
    .line 152
    move-result-object v8

    .line 153
    invoke-static {v3, v6, v7, v8}, Lcom/zykj/student/dialogue/ui/home/HomeFilterViewModel;->b(Lcom/zykj/student/dialogue/ui/home/HomeFilterViewModel;Lcom/zykj/student/dialogue/bean/resp/FilterType$Time$FavoriteTime;Lcom/zykj/student/dialogue/bean/resp/FilterType$Time$FavoriteTime;Ljava/util/List;)Ljava/util/List;

    .line 154
    .line 155
    .line 156
    move-result-object v6

    .line 157
    const/16 v18, 0x4071

    .line 158
    .line 159
    const/16 v19, 0x0

    .line 160
    .line 161
    const/4 v3, 0x0

    .line 162
    const/4 v7, 0x0

    .line 163
    const/4 v8, 0x0

    .line 164
    const/4 v9, 0x0

    .line 165
    const/16 v17, 0x0

    .line 166
    .line 167
    invoke-static/range {v2 .. v19}, Ls6/l0;->b(Ls6/l0;Lkotlin/Result;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lcom/zykj/student/dialogue/bean/resp/FilterType$QuestionState;Lcom/zykj/student/dialogue/bean/resp/FilterType$Subject;Lcom/zykj/student/dialogue/bean/resp/FilterType$Time$JoinedTime;Lcom/zykj/student/dialogue/bean/resp/FilterType$Time$UpdatedTime;Lcom/zykj/student/dialogue/bean/resp/FilterType$Time$FavoriteTime;Lcom/zykj/student/dialogue/bean/resp/FilterType$Sort;ILjava/lang/Object;)Ls6/l0;

    .line 168
    .line 169
    .line 170
    move-result-object v2

    .line 171
    invoke-static {v1, v2}, Lcom/zykj/student/dialogue/ui/home/HomeFilterViewModel;->e(Lcom/zykj/student/dialogue/ui/home/HomeFilterViewModel;Ls6/l0;)V

    .line 172
    .line 173
    .line 174
    sget-object v1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 175
    .line 176
    return-object v1

    .line 177
    :cond_0
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 178
    .line 179
    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 180
    .line 181
    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 182
    .line 183
    .line 184
    throw v1
.end method
