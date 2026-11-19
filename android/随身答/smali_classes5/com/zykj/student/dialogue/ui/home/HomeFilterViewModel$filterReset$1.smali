.class final Lcom/zykj/student/dialogue/ui/home/HomeFilterViewModel$filterReset$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/student/dialogue/ui/home/HomeFilterViewModel;->f(Lcom/zykj/student/dialogue/ui/home/a;)V
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
    c = "com.zykj.student.dialogue.ui.home.HomeFilterViewModel$filterReset$1"
    f = "HomeFilterViewModel.kt"
    i = {}
    l = {}
    m = "invokeSuspend"
    n = {}
    s = {}
.end annotation


# instance fields
.field public a:I

.field public final synthetic b:Lcom/zykj/student/dialogue/ui/home/a;

.field public final synthetic c:Lcom/zykj/student/dialogue/ui/home/HomeFilterViewModel;


# direct methods
.method public constructor <init>(Lcom/zykj/student/dialogue/ui/home/a;Lcom/zykj/student/dialogue/ui/home/HomeFilterViewModel;Lkotlin/coroutines/Continuation;)V
    .locals 0

    iput-object p1, p0, Lcom/zykj/student/dialogue/ui/home/HomeFilterViewModel$filterReset$1;->b:Lcom/zykj/student/dialogue/ui/home/a;

    iput-object p2, p0, Lcom/zykj/student/dialogue/ui/home/HomeFilterViewModel$filterReset$1;->c:Lcom/zykj/student/dialogue/ui/home/HomeFilterViewModel;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILkotlin/coroutines/Continuation;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;
    .locals 2

    new-instance p1, Lcom/zykj/student/dialogue/ui/home/HomeFilterViewModel$filterReset$1;

    iget-object v0, p0, Lcom/zykj/student/dialogue/ui/home/HomeFilterViewModel$filterReset$1;->b:Lcom/zykj/student/dialogue/ui/home/a;

    iget-object v1, p0, Lcom/zykj/student/dialogue/ui/home/HomeFilterViewModel$filterReset$1;->c:Lcom/zykj/student/dialogue/ui/home/HomeFilterViewModel;

    invoke-direct {p1, v0, v1, p2}, Lcom/zykj/student/dialogue/ui/home/HomeFilterViewModel$filterReset$1;-><init>(Lcom/zykj/student/dialogue/ui/home/a;Lcom/zykj/student/dialogue/ui/home/HomeFilterViewModel;Lkotlin/coroutines/Continuation;)V

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lkotlinx/coroutines/CoroutineScope;

    check-cast p2, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2}, Lcom/zykj/student/dialogue/ui/home/HomeFilterViewModel$filterReset$1;->invoke(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0

    .line 2
    invoke-virtual {p0, p1, p2}, Lcom/zykj/student/dialogue/ui/home/HomeFilterViewModel$filterReset$1;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object p1

    check-cast p1, Lcom/zykj/student/dialogue/ui/home/HomeFilterViewModel$filterReset$1;

    sget-object p2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lcom/zykj/student/dialogue/ui/home/HomeFilterViewModel$filterReset$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    iget v1, v0, Lcom/zykj/student/dialogue/ui/home/HomeFilterViewModel$filterReset$1;->a:I

    .line 7
    .line 8
    if-nez v1, :cond_3

    .line 9
    .line 10
    invoke-static/range {p1 .. p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 11
    .line 12
    .line 13
    iget-object v1, v0, Lcom/zykj/student/dialogue/ui/home/HomeFilterViewModel$filterReset$1;->b:Lcom/zykj/student/dialogue/ui/home/a;

    .line 14
    .line 15
    sget-object v2, Lcom/zykj/student/dialogue/ui/home/a$d;->a:Lcom/zykj/student/dialogue/ui/home/a$d;

    .line 16
    .line 17
    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 18
    .line 19
    .line 20
    move-result v2

    .line 21
    if-eqz v2, :cond_0

    .line 22
    .line 23
    iget-object v1, v0, Lcom/zykj/student/dialogue/ui/home/HomeFilterViewModel$filterReset$1;->c:Lcom/zykj/student/dialogue/ui/home/HomeFilterViewModel;

    .line 24
    .line 25
    invoke-virtual {v1}, Lcom/zykj/student/dialogue/ui/home/HomeFilterViewModel;->g()Ls6/l0;

    .line 26
    .line 27
    .line 28
    move-result-object v2

    .line 29
    invoke-static {}, Lcom/zykj/student/dialogue/bean/resp/HomeKt;->getInitialSubject()Lcom/zykj/student/dialogue/bean/resp/FilterType$Subject;

    .line 30
    .line 31
    .line 32
    move-result-object v13

    .line 33
    const/16 v18, 0x7bff

    .line 34
    .line 35
    const/16 v19, 0x0

    .line 36
    .line 37
    const/4 v3, 0x0

    .line 38
    const/4 v4, 0x0

    .line 39
    const/4 v5, 0x0

    .line 40
    const/4 v6, 0x0

    .line 41
    const/4 v7, 0x0

    .line 42
    const/4 v8, 0x0

    .line 43
    const/4 v9, 0x0

    .line 44
    const/4 v10, 0x0

    .line 45
    const/4 v11, 0x0

    .line 46
    const/4 v12, 0x0

    .line 47
    const/4 v14, 0x0

    .line 48
    const/4 v15, 0x0

    .line 49
    const/16 v16, 0x0

    .line 50
    .line 51
    const/16 v17, 0x0

    .line 52
    .line 53
    invoke-static/range {v2 .. v19}, Ls6/l0;->b(Ls6/l0;Lkotlin/Result;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lcom/zykj/student/dialogue/bean/resp/FilterType$QuestionState;Lcom/zykj/student/dialogue/bean/resp/FilterType$Subject;Lcom/zykj/student/dialogue/bean/resp/FilterType$Time$JoinedTime;Lcom/zykj/student/dialogue/bean/resp/FilterType$Time$UpdatedTime;Lcom/zykj/student/dialogue/bean/resp/FilterType$Time$FavoriteTime;Lcom/zykj/student/dialogue/bean/resp/FilterType$Sort;ILjava/lang/Object;)Ls6/l0;

    .line 54
    .line 55
    .line 56
    move-result-object v2

    .line 57
    invoke-static {v1, v2}, Lcom/zykj/student/dialogue/ui/home/HomeFilterViewModel;->e(Lcom/zykj/student/dialogue/ui/home/HomeFilterViewModel;Ls6/l0;)V

    .line 58
    .line 59
    .line 60
    goto :goto_0

    .line 61
    :cond_0
    sget-object v2, Lcom/zykj/student/dialogue/ui/home/a$b;->a:Lcom/zykj/student/dialogue/ui/home/a$b;

    .line 62
    .line 63
    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 64
    .line 65
    .line 66
    move-result v2

    .line 67
    if-eqz v2, :cond_1

    .line 68
    .line 69
    iget-object v1, v0, Lcom/zykj/student/dialogue/ui/home/HomeFilterViewModel$filterReset$1;->c:Lcom/zykj/student/dialogue/ui/home/HomeFilterViewModel;

    .line 70
    .line 71
    invoke-virtual {v1}, Lcom/zykj/student/dialogue/ui/home/HomeFilterViewModel;->g()Ls6/l0;

    .line 72
    .line 73
    .line 74
    move-result-object v2

    .line 75
    invoke-static {}, Lcom/zykj/student/dialogue/bean/resp/HomeKt;->getInitialViewStatus()Ljava/util/List;

    .line 76
    .line 77
    .line 78
    move-result-object v10

    .line 79
    invoke-static {}, Lcom/zykj/student/dialogue/bean/resp/HomeKt;->getInitialTeacherViewStatus()Ljava/util/List;

    .line 80
    .line 81
    .line 82
    move-result-object v11

    .line 83
    invoke-static {}, Lcom/zykj/student/dialogue/bean/resp/HomeKt;->getInitialQuestionState()Lcom/zykj/student/dialogue/bean/resp/FilterType$QuestionState$Unlimited;

    .line 84
    .line 85
    .line 86
    move-result-object v12

    .line 87
    invoke-static {}, Lcom/zykj/student/dialogue/bean/resp/HomeKt;->getInitialJoinedTime()Lcom/zykj/student/dialogue/bean/resp/FilterType$Time$JoinedTime$Unlimited;

    .line 88
    .line 89
    .line 90
    move-result-object v14

    .line 91
    invoke-static {}, Lcom/zykj/student/dialogue/bean/resp/HomeKt;->getInitialUpdatedTime()Lcom/zykj/student/dialogue/bean/resp/FilterType$Time$UpdatedTime$Unlimited;

    .line 92
    .line 93
    .line 94
    move-result-object v15

    .line 95
    const/16 v18, 0x647f

    .line 96
    .line 97
    const/16 v19, 0x0

    .line 98
    .line 99
    const/4 v3, 0x0

    .line 100
    const/4 v4, 0x0

    .line 101
    const/4 v5, 0x0

    .line 102
    const/4 v6, 0x0

    .line 103
    const/4 v7, 0x0

    .line 104
    const/4 v8, 0x0

    .line 105
    const/4 v9, 0x0

    .line 106
    const/4 v13, 0x0

    .line 107
    const/16 v16, 0x0

    .line 108
    .line 109
    const/16 v17, 0x0

    .line 110
    .line 111
    invoke-static/range {v2 .. v19}, Ls6/l0;->b(Ls6/l0;Lkotlin/Result;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lcom/zykj/student/dialogue/bean/resp/FilterType$QuestionState;Lcom/zykj/student/dialogue/bean/resp/FilterType$Subject;Lcom/zykj/student/dialogue/bean/resp/FilterType$Time$JoinedTime;Lcom/zykj/student/dialogue/bean/resp/FilterType$Time$UpdatedTime;Lcom/zykj/student/dialogue/bean/resp/FilterType$Time$FavoriteTime;Lcom/zykj/student/dialogue/bean/resp/FilterType$Sort;ILjava/lang/Object;)Ls6/l0;

    .line 112
    .line 113
    .line 114
    move-result-object v2

    .line 115
    invoke-static {v1, v2}, Lcom/zykj/student/dialogue/ui/home/HomeFilterViewModel;->e(Lcom/zykj/student/dialogue/ui/home/HomeFilterViewModel;Ls6/l0;)V

    .line 116
    .line 117
    .line 118
    goto :goto_0

    .line 119
    :cond_1
    sget-object v2, Lcom/zykj/student/dialogue/ui/home/a$a;->a:Lcom/zykj/student/dialogue/ui/home/a$a;

    .line 120
    .line 121
    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 122
    .line 123
    .line 124
    move-result v1

    .line 125
    if-eqz v1, :cond_2

    .line 126
    .line 127
    iget-object v1, v0, Lcom/zykj/student/dialogue/ui/home/HomeFilterViewModel$filterReset$1;->c:Lcom/zykj/student/dialogue/ui/home/HomeFilterViewModel;

    .line 128
    .line 129
    invoke-virtual {v1}, Lcom/zykj/student/dialogue/ui/home/HomeFilterViewModel;->g()Ls6/l0;

    .line 130
    .line 131
    .line 132
    move-result-object v2

    .line 133
    invoke-static {}, Lcom/zykj/student/dialogue/bean/resp/HomeKt;->getInitialFavoriteTime()Lcom/zykj/student/dialogue/bean/resp/FilterType$Time$FavoriteTime$Unlimited;

    .line 134
    .line 135
    .line 136
    move-result-object v16

    .line 137
    const/16 v18, 0x5fff

    .line 138
    .line 139
    const/16 v19, 0x0

    .line 140
    .line 141
    const/4 v3, 0x0

    .line 142
    const/4 v4, 0x0

    .line 143
    const/4 v5, 0x0

    .line 144
    const/4 v6, 0x0

    .line 145
    const/4 v7, 0x0

    .line 146
    const/4 v8, 0x0

    .line 147
    const/4 v9, 0x0

    .line 148
    const/4 v10, 0x0

    .line 149
    const/4 v11, 0x0

    .line 150
    const/4 v12, 0x0

    .line 151
    const/4 v13, 0x0

    .line 152
    const/4 v14, 0x0

    .line 153
    const/4 v15, 0x0

    .line 154
    const/16 v17, 0x0

    .line 155
    .line 156
    invoke-static/range {v2 .. v19}, Ls6/l0;->b(Ls6/l0;Lkotlin/Result;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lcom/zykj/student/dialogue/bean/resp/FilterType$QuestionState;Lcom/zykj/student/dialogue/bean/resp/FilterType$Subject;Lcom/zykj/student/dialogue/bean/resp/FilterType$Time$JoinedTime;Lcom/zykj/student/dialogue/bean/resp/FilterType$Time$UpdatedTime;Lcom/zykj/student/dialogue/bean/resp/FilterType$Time$FavoriteTime;Lcom/zykj/student/dialogue/bean/resp/FilterType$Sort;ILjava/lang/Object;)Ls6/l0;

    .line 157
    .line 158
    .line 159
    move-result-object v2

    .line 160
    invoke-static {v1, v2}, Lcom/zykj/student/dialogue/ui/home/HomeFilterViewModel;->e(Lcom/zykj/student/dialogue/ui/home/HomeFilterViewModel;Ls6/l0;)V

    .line 161
    .line 162
    .line 163
    :cond_2
    :goto_0
    sget-object v1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 164
    .line 165
    return-object v1

    .line 166
    :cond_3
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 167
    .line 168
    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 169
    .line 170
    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 171
    .line 172
    .line 173
    throw v1
.end method
