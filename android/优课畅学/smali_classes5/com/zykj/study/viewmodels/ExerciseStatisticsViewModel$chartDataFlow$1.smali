.class final Lcom/zykj/study/viewmodels/ExerciseStatisticsViewModel$chartDataFlow$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lx7/r;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/study/viewmodels/ExerciseStatisticsViewModel;-><init>(Lcom/zykj/study/repository/TeachCourseRepository;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/coroutines/jvm/internal/SuspendLambda;",
        "Lx7/r;"
    }
.end annotation

.annotation runtime Lo7/d;
    c = "com.zykj.study.viewmodels.ExerciseStatisticsViewModel$chartDataFlow$1"
    f = "ExerciseStatisticsViewModel.kt"
    l = {}
    m = "invokeSuspend"
.end annotation


# instance fields
.field public a:I

.field public synthetic b:Ljava/lang/Object;

.field public synthetic c:Ljava/lang/Object;

.field public synthetic d:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lm7/c;)V
    .locals 1

    .line 1
    const/4 v0, 0x4

    .line 2
    invoke-direct {p0, v0, p1}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILm7/c;)V

    .line 3
    .line 4
    .line 5
    return-void
.end method


# virtual methods
.method public final c(Lcom/zykj/study/bean/teach/GetQuizDetailBean;Lcom/zykj/study/bean/teach/StuQuizBean;Lcom/zykj/study/bean/teach/ChoiceChartData;Lm7/c;)Ljava/lang/Object;
    .locals 1

    .line 1
    new-instance v0, Lcom/zykj/study/viewmodels/ExerciseStatisticsViewModel$chartDataFlow$1;

    .line 2
    .line 3
    invoke-direct {v0, p4}, Lcom/zykj/study/viewmodels/ExerciseStatisticsViewModel$chartDataFlow$1;-><init>(Lm7/c;)V

    .line 4
    .line 5
    .line 6
    iput-object p1, v0, Lcom/zykj/study/viewmodels/ExerciseStatisticsViewModel$chartDataFlow$1;->b:Ljava/lang/Object;

    .line 7
    .line 8
    iput-object p2, v0, Lcom/zykj/study/viewmodels/ExerciseStatisticsViewModel$chartDataFlow$1;->c:Ljava/lang/Object;

    .line 9
    .line 10
    iput-object p3, v0, Lcom/zykj/study/viewmodels/ExerciseStatisticsViewModel$chartDataFlow$1;->d:Ljava/lang/Object;

    .line 11
    .line 12
    sget-object p1, Lh7/p;->a:Lh7/p;

    .line 13
    .line 14
    invoke-virtual {v0, p1}, Lcom/zykj/study/viewmodels/ExerciseStatisticsViewModel$chartDataFlow$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lcom/zykj/study/bean/teach/GetQuizDetailBean;

    check-cast p2, Lcom/zykj/study/bean/teach/StuQuizBean;

    check-cast p3, Lcom/zykj/study/bean/teach/ChoiceChartData;

    check-cast p4, Lm7/c;

    invoke-virtual {p0, p1, p2, p3, p4}, Lcom/zykj/study/viewmodels/ExerciseStatisticsViewModel$chartDataFlow$1;->c(Lcom/zykj/study/bean/teach/GetQuizDetailBean;Lcom/zykj/study/bean/teach/StuQuizBean;Lcom/zykj/study/bean/teach/ChoiceChartData;Lm7/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v1, v0, Lcom/zykj/study/viewmodels/ExerciseStatisticsViewModel$chartDataFlow$1;->b:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v1, Lcom/zykj/study/bean/teach/GetQuizDetailBean;

    .line 6
    .line 7
    iget-object v2, v0, Lcom/zykj/study/viewmodels/ExerciseStatisticsViewModel$chartDataFlow$1;->c:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v2, Lcom/zykj/study/bean/teach/StuQuizBean;

    .line 10
    .line 11
    iget-object v3, v0, Lcom/zykj/study/viewmodels/ExerciseStatisticsViewModel$chartDataFlow$1;->d:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast v3, Lcom/zykj/study/bean/teach/ChoiceChartData;

    .line 14
    .line 15
    invoke-static {}, Ln7/a;->f()Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    iget v4, v0, Lcom/zykj/study/viewmodels/ExerciseStatisticsViewModel$chartDataFlow$1;->a:I

    .line 19
    .line 20
    if-nez v4, :cond_b

    .line 21
    .line 22
    invoke-static/range {p1 .. p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 23
    .line 24
    .line 25
    if-eqz v1, :cond_a

    .line 26
    .line 27
    if-nez v2, :cond_0

    .line 28
    .line 29
    goto/16 :goto_7

    .line 30
    .line 31
    :cond_0
    invoke-virtual {v1}, Lcom/zykj/study/bean/teach/GetQuizDetailBean;->getOptions()Ljava/util/List;

    .line 32
    .line 33
    .line 34
    move-result-object v4

    .line 35
    if-nez v4, :cond_1

    .line 36
    .line 37
    invoke-static {}, Li7/v;->n()Ljava/util/List;

    .line 38
    .line 39
    .line 40
    move-result-object v4

    .line 41
    :cond_1
    invoke-virtual {v1}, Lcom/zykj/study/bean/teach/GetQuizDetailBean;->getCorrectAnswers()Ljava/util/List;

    .line 42
    .line 43
    .line 44
    move-result-object v5

    .line 45
    if-nez v5, :cond_2

    .line 46
    .line 47
    invoke-static {}, Li7/v;->n()Ljava/util/List;

    .line 48
    .line 49
    .line 50
    move-result-object v5

    .line 51
    :cond_2
    invoke-virtual {v2}, Lcom/zykj/study/bean/teach/StuQuizBean;->getTotalNum()I

    .line 52
    .line 53
    .line 54
    move-result v6

    .line 55
    invoke-virtual {v2}, Lcom/zykj/study/bean/teach/StuQuizBean;->getAnswerForStu()Ljava/util/Map;

    .line 56
    .line 57
    .line 58
    move-result-object v2

    .line 59
    invoke-virtual {v1}, Lcom/zykj/study/bean/teach/GetQuizDetailBean;->getChoiceOptions()Z

    .line 60
    .line 61
    .line 62
    move-result v1

    .line 63
    new-instance v7, Ljava/util/ArrayList;

    .line 64
    .line 65
    const/16 v8, 0xa

    .line 66
    .line 67
    invoke-static {v4, v8}, Li7/w;->x(Ljava/lang/Iterable;I)I

    .line 68
    .line 69
    .line 70
    move-result v8

    .line 71
    invoke-direct {v7, v8}, Ljava/util/ArrayList;-><init>(I)V

    .line 72
    .line 73
    .line 74
    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 75
    .line 76
    .line 77
    move-result-object v4

    .line 78
    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 79
    .line 80
    .line 81
    move-result v8

    .line 82
    if-eqz v8, :cond_9

    .line 83
    .line 84
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 85
    .line 86
    .line 87
    move-result-object v8

    .line 88
    move-object v11, v8

    .line 89
    check-cast v11, Ljava/lang/String;

    .line 90
    .line 91
    if-eqz v1, :cond_3

    .line 92
    .line 93
    move-object v10, v11

    .line 94
    goto :goto_2

    .line 95
    :cond_3
    const-string v8, "A"

    .line 96
    .line 97
    invoke-static {v11, v8}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 98
    .line 99
    .line 100
    move-result v8

    .line 101
    if-eqz v8, :cond_4

    .line 102
    .line 103
    const-string v8, "\u5bf9"

    .line 104
    .line 105
    :goto_1
    move-object v10, v8

    .line 106
    goto :goto_2

    .line 107
    :cond_4
    const-string v8, "\u9519"

    .line 108
    .line 109
    goto :goto_1

    .line 110
    :goto_2
    invoke-interface {v5, v11}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 111
    .line 112
    .line 113
    move-result v13

    .line 114
    invoke-interface {v2, v11}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 115
    .line 116
    .line 117
    move-result-object v8

    .line 118
    check-cast v8, Ljava/util/List;

    .line 119
    .line 120
    if-nez v8, :cond_5

    .line 121
    .line 122
    invoke-static {}, Li7/v;->n()Ljava/util/List;

    .line 123
    .line 124
    .line 125
    move-result-object v8

    .line 126
    :cond_5
    move-object v14, v8

    .line 127
    invoke-interface {v14}, Ljava/util/List;->size()I

    .line 128
    .line 129
    .line 130
    move-result v8

    .line 131
    move/from16 p1, v1

    .line 132
    .line 133
    int-to-double v0, v6

    .line 134
    const-wide/16 v15, 0x0

    .line 135
    .line 136
    cmpg-double v9, v0, v15

    .line 137
    .line 138
    if-nez v9, :cond_6

    .line 139
    .line 140
    goto :goto_3

    .line 141
    :cond_6
    if-gtz v6, :cond_7

    .line 142
    .line 143
    :goto_3
    const/4 v0, 0x0

    .line 144
    :goto_4
    move v12, v0

    .line 145
    goto :goto_5

    .line 146
    :cond_7
    int-to-double v8, v8

    .line 147
    div-double/2addr v8, v0

    .line 148
    const/16 v0, 0x64

    .line 149
    .line 150
    int-to-double v0, v0

    .line 151
    mul-double/2addr v8, v0

    .line 152
    invoke-static {v8, v9}, Lz7/c;->c(D)I

    .line 153
    .line 154
    .line 155
    move-result v0

    .line 156
    goto :goto_4

    .line 157
    :goto_5
    new-instance v9, Lcom/zykj/study/bean/teach/ChoiceChartData;

    .line 158
    .line 159
    if-eqz v3, :cond_8

    .line 160
    .line 161
    invoke-virtual {v3}, Lcom/zykj/study/bean/teach/ChoiceChartData;->getName()Ljava/lang/String;

    .line 162
    .line 163
    .line 164
    move-result-object v0

    .line 165
    goto :goto_6

    .line 166
    :cond_8
    const/4 v0, 0x0

    .line 167
    :goto_6
    invoke-static {v11, v0}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 168
    .line 169
    .line 170
    move-result v15

    .line 171
    invoke-direct/range {v9 .. v15}, Lcom/zykj/study/bean/teach/ChoiceChartData;-><init>(Ljava/lang/String;Ljava/lang/String;IZLjava/util/List;Z)V

    .line 172
    .line 173
    .line 174
    invoke-interface {v7, v9}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 175
    .line 176
    .line 177
    move-object/from16 v0, p0

    .line 178
    .line 179
    move/from16 v1, p1

    .line 180
    .line 181
    goto :goto_0

    .line 182
    :cond_9
    return-object v7

    .line 183
    :cond_a
    :goto_7
    invoke-static {}, Li7/v;->n()Ljava/util/List;

    .line 184
    .line 185
    .line 186
    move-result-object v0

    .line 187
    return-object v0

    .line 188
    :cond_b
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 189
    .line 190
    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    .line 191
    .line 192
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 193
    .line 194
    .line 195
    throw v0
.end method
