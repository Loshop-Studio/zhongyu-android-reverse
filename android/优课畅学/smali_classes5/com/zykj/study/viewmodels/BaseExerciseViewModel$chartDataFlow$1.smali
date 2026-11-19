.class final Lcom/zykj/study/viewmodels/BaseExerciseViewModel$chartDataFlow$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lx7/q;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/study/viewmodels/BaseExerciseViewModel;-><init>()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/coroutines/jvm/internal/SuspendLambda;",
        "Lx7/q;"
    }
.end annotation

.annotation runtime Lo7/d;
    c = "com.zykj.study.viewmodels.BaseExerciseViewModel$chartDataFlow$1"
    f = "BaseExerciseViewModel.kt"
    l = {}
    m = "invokeSuspend"
.end annotation


# instance fields
.field public a:I

.field public synthetic b:Ljava/lang/Object;

.field public synthetic c:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lm7/c;)V
    .locals 1

    .line 1
    const/4 v0, 0x3

    .line 2
    invoke-direct {p0, v0, p1}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILm7/c;)V

    .line 3
    .line 4
    .line 5
    return-void
.end method


# virtual methods
.method public final c(Lcom/zykj/study/bean/exercise/QuestionBean;Lcom/zykj/study/bean/teach/ChoiceChartData;Lm7/c;)Ljava/lang/Object;
    .locals 1

    .line 1
    new-instance v0, Lcom/zykj/study/viewmodels/BaseExerciseViewModel$chartDataFlow$1;

    .line 2
    .line 3
    invoke-direct {v0, p3}, Lcom/zykj/study/viewmodels/BaseExerciseViewModel$chartDataFlow$1;-><init>(Lm7/c;)V

    .line 4
    .line 5
    .line 6
    iput-object p1, v0, Lcom/zykj/study/viewmodels/BaseExerciseViewModel$chartDataFlow$1;->b:Ljava/lang/Object;

    .line 7
    .line 8
    iput-object p2, v0, Lcom/zykj/study/viewmodels/BaseExerciseViewModel$chartDataFlow$1;->c:Ljava/lang/Object;

    .line 9
    .line 10
    sget-object p1, Lh7/p;->a:Lh7/p;

    .line 11
    .line 12
    invoke-virtual {v0, p1}, Lcom/zykj/study/viewmodels/BaseExerciseViewModel$chartDataFlow$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lcom/zykj/study/bean/exercise/QuestionBean;

    check-cast p2, Lcom/zykj/study/bean/teach/ChoiceChartData;

    check-cast p3, Lm7/c;

    invoke-virtual {p0, p1, p2, p3}, Lcom/zykj/study/viewmodels/BaseExerciseViewModel$chartDataFlow$1;->c(Lcom/zykj/study/bean/exercise/QuestionBean;Lcom/zykj/study/bean/teach/ChoiceChartData;Lm7/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 20

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v1, v0, Lcom/zykj/study/viewmodels/BaseExerciseViewModel$chartDataFlow$1;->b:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v1, Lcom/zykj/study/bean/exercise/QuestionBean;

    .line 6
    .line 7
    iget-object v2, v0, Lcom/zykj/study/viewmodels/BaseExerciseViewModel$chartDataFlow$1;->c:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v2, Lcom/zykj/study/bean/teach/ChoiceChartData;

    .line 10
    .line 11
    invoke-static {}, Ln7/a;->f()Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    iget v3, v0, Lcom/zykj/study/viewmodels/BaseExerciseViewModel$chartDataFlow$1;->a:I

    .line 15
    .line 16
    if-nez v3, :cond_e

    .line 17
    .line 18
    invoke-static/range {p1 .. p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 19
    .line 20
    .line 21
    if-nez v1, :cond_0

    .line 22
    .line 23
    invoke-static {}, Li7/v;->n()Ljava/util/List;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    return-object v1

    .line 28
    :cond_0
    invoke-virtual {v1}, Lcom/zykj/study/bean/exercise/QuestionBean;->getTotalNum()Ljava/lang/Integer;

    .line 29
    .line 30
    .line 31
    move-result-object v3

    .line 32
    if-eqz v3, :cond_1

    .line 33
    .line 34
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    .line 35
    .line 36
    .line 37
    move-result v3

    .line 38
    goto :goto_0

    .line 39
    :cond_1
    const/4 v3, 0x0

    .line 40
    :goto_0
    invoke-virtual {v1}, Lcom/zykj/study/bean/exercise/QuestionBean;->getAnswerForStu()Ljava/util/Map;

    .line 41
    .line 42
    .line 43
    move-result-object v5

    .line 44
    if-nez v5, :cond_2

    .line 45
    .line 46
    invoke-static {}, Lkotlin/collections/a;->h()Ljava/util/Map;

    .line 47
    .line 48
    .line 49
    move-result-object v5

    .line 50
    :cond_2
    invoke-virtual {v1}, Lcom/zykj/study/bean/exercise/QuestionBean;->getOptions()Ljava/util/List;

    .line 51
    .line 52
    .line 53
    move-result-object v6

    .line 54
    if-nez v6, :cond_3

    .line 55
    .line 56
    invoke-static {}, Li7/v;->n()Ljava/util/List;

    .line 57
    .line 58
    .line 59
    move-result-object v6

    .line 60
    :cond_3
    invoke-virtual {v1}, Lcom/zykj/study/bean/exercise/QuestionBean;->getCorrectAnswers()Ljava/util/List;

    .line 61
    .line 62
    .line 63
    move-result-object v7

    .line 64
    if-nez v7, :cond_4

    .line 65
    .line 66
    invoke-static {}, Li7/v;->n()Ljava/util/List;

    .line 67
    .line 68
    .line 69
    move-result-object v7

    .line 70
    :cond_4
    invoke-virtual {v1}, Lcom/zykj/study/bean/exercise/QuestionBean;->getQuestionType()Lcom/zykj/study/bean/exercise/QuestionType;

    .line 71
    .line 72
    .line 73
    move-result-object v1

    .line 74
    sget-object v8, Lcom/zykj/study/bean/exercise/QuestionType;->ANSWER:Lcom/zykj/study/bean/exercise/QuestionType;

    .line 75
    .line 76
    if-eq v1, v8, :cond_5

    .line 77
    .line 78
    const/4 v1, 0x1

    .line 79
    goto :goto_1

    .line 80
    :cond_5
    const/4 v1, 0x0

    .line 81
    :goto_1
    new-instance v8, Ljava/util/ArrayList;

    .line 82
    .line 83
    const/16 v9, 0xa

    .line 84
    .line 85
    invoke-static {v6, v9}, Li7/w;->x(Ljava/lang/Iterable;I)I

    .line 86
    .line 87
    .line 88
    move-result v9

    .line 89
    invoke-direct {v8, v9}, Ljava/util/ArrayList;-><init>(I)V

    .line 90
    .line 91
    .line 92
    invoke-interface {v6}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 93
    .line 94
    .line 95
    move-result-object v6

    .line 96
    :goto_2
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    .line 97
    .line 98
    .line 99
    move-result v9

    .line 100
    if-eqz v9, :cond_d

    .line 101
    .line 102
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 103
    .line 104
    .line 105
    move-result-object v9

    .line 106
    move-object v12, v9

    .line 107
    check-cast v12, Ljava/lang/String;

    .line 108
    .line 109
    const-string v9, "A"

    .line 110
    .line 111
    if-eqz v1, :cond_6

    .line 112
    .line 113
    move-object v11, v12

    .line 114
    goto :goto_4

    .line 115
    :cond_6
    invoke-static {v12, v9}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 116
    .line 117
    .line 118
    move-result v10

    .line 119
    if-eqz v10, :cond_7

    .line 120
    .line 121
    const-string v10, "\u5bf9"

    .line 122
    .line 123
    :goto_3
    move-object v11, v10

    .line 124
    goto :goto_4

    .line 125
    :cond_7
    const-string v10, "\u9519"

    .line 126
    .line 127
    goto :goto_3

    .line 128
    :goto_4
    if-eqz v1, :cond_8

    .line 129
    .line 130
    invoke-interface {v7, v12}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 131
    .line 132
    .line 133
    move-result v9

    .line 134
    :goto_5
    move v14, v9

    .line 135
    goto :goto_6

    .line 136
    :cond_8
    invoke-static {v12, v9}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 137
    .line 138
    .line 139
    move-result v9

    .line 140
    goto :goto_5

    .line 141
    :goto_6
    invoke-interface {v5, v12}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 142
    .line 143
    .line 144
    move-result-object v9

    .line 145
    check-cast v9, Ljava/util/List;

    .line 146
    .line 147
    if-nez v9, :cond_9

    .line 148
    .line 149
    invoke-static {}, Li7/v;->n()Ljava/util/List;

    .line 150
    .line 151
    .line 152
    move-result-object v9

    .line 153
    :cond_9
    move-object v15, v9

    .line 154
    invoke-interface {v15}, Ljava/util/List;->size()I

    .line 155
    .line 156
    .line 157
    move-result v9

    .line 158
    move-object/from16 v17, v5

    .line 159
    .line 160
    int-to-double v4, v3

    .line 161
    const-wide/16 v18, 0x0

    .line 162
    .line 163
    cmpg-double v10, v4, v18

    .line 164
    .line 165
    if-nez v10, :cond_a

    .line 166
    .line 167
    goto :goto_7

    .line 168
    :cond_a
    if-gtz v3, :cond_b

    .line 169
    .line 170
    :goto_7
    const/4 v13, 0x0

    .line 171
    goto :goto_8

    .line 172
    :cond_b
    int-to-double v9, v9

    .line 173
    div-double/2addr v9, v4

    .line 174
    const/16 v4, 0x64

    .line 175
    .line 176
    int-to-double v4, v4

    .line 177
    mul-double/2addr v9, v4

    .line 178
    invoke-static {v9, v10}, Lz7/c;->c(D)I

    .line 179
    .line 180
    .line 181
    move-result v4

    .line 182
    move v13, v4

    .line 183
    :goto_8
    new-instance v10, Lcom/zykj/study/bean/teach/ChoiceChartData;

    .line 184
    .line 185
    if-eqz v2, :cond_c

    .line 186
    .line 187
    invoke-virtual {v2}, Lcom/zykj/study/bean/teach/ChoiceChartData;->getName()Ljava/lang/String;

    .line 188
    .line 189
    .line 190
    move-result-object v4

    .line 191
    goto :goto_9

    .line 192
    :cond_c
    const/4 v4, 0x0

    .line 193
    :goto_9
    invoke-static {v12, v4}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 194
    .line 195
    .line 196
    move-result v16

    .line 197
    invoke-direct/range {v10 .. v16}, Lcom/zykj/study/bean/teach/ChoiceChartData;-><init>(Ljava/lang/String;Ljava/lang/String;IZLjava/util/List;Z)V

    .line 198
    .line 199
    .line 200
    invoke-interface {v8, v10}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 201
    .line 202
    .line 203
    move-object/from16 v5, v17

    .line 204
    .line 205
    goto :goto_2

    .line 206
    :cond_d
    return-object v8

    .line 207
    :cond_e
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 208
    .line 209
    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 210
    .line 211
    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 212
    .line 213
    .line 214
    throw v1
.end method
