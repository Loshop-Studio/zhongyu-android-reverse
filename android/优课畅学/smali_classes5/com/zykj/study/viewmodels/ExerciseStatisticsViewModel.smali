.class public final Lcom/zykj/study/viewmodels/ExerciseStatisticsViewModel;
.super Lcom/zykj/base/BaseViewModel;
.source "SourceFile"


# annotations
.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x0
.end annotation


# instance fields
.field public final a:Lcom/zykj/study/repository/TeachCourseRepository;

.field public final b:Landroidx/lifecycle/MutableLiveData;

.field public final c:Landroidx/lifecycle/MutableLiveData;

.field public final d:Landroidx/lifecycle/MutableLiveData;

.field public final e:Ljava/util/List;

.field public final f:Landroidx/lifecycle/MutableLiveData;

.field public g:I

.field public h:I

.field public i:I

.field public j:Lcom/zykj/study/bean/teach/Member;

.field public final k:Ll8/h;

.field public final l:Ll8/q;

.field public final m:Ll8/h;

.field public final n:Ll8/q;

.field public final o:Ll8/h;

.field public final p:Ll8/q;

.field public final q:Ll8/q;

.field public final r:Ll8/q;

.field public final s:Ll8/h;

.field public final t:Ll8/q;

.field public final u:Ll8/q;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Lcom/zykj/study/repository/TeachCourseRepository;)V
    .locals 5

    .line 1
    const-string v0, "repository"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Lcom/zykj/base/BaseViewModel;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object p1, p0, Lcom/zykj/study/viewmodels/ExerciseStatisticsViewModel;->a:Lcom/zykj/study/repository/TeachCourseRepository;

    .line 10
    .line 11
    new-instance p1, Landroidx/lifecycle/MutableLiveData;

    .line 12
    .line 13
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 14
    .line 15
    invoke-direct {p1, v0}, Landroidx/lifecycle/MutableLiveData;-><init>(Ljava/lang/Object;)V

    .line 16
    .line 17
    .line 18
    iput-object p1, p0, Lcom/zykj/study/viewmodels/ExerciseStatisticsViewModel;->b:Landroidx/lifecycle/MutableLiveData;

    .line 19
    .line 20
    new-instance p1, Landroidx/lifecycle/MutableLiveData;

    .line 21
    .line 22
    invoke-direct {p1}, Landroidx/lifecycle/MutableLiveData;-><init>()V

    .line 23
    .line 24
    .line 25
    iput-object p1, p0, Lcom/zykj/study/viewmodels/ExerciseStatisticsViewModel;->c:Landroidx/lifecycle/MutableLiveData;

    .line 26
    .line 27
    new-instance p1, Landroidx/lifecycle/MutableLiveData;

    .line 28
    .line 29
    invoke-direct {p1}, Landroidx/lifecycle/MutableLiveData;-><init>()V

    .line 30
    .line 31
    .line 32
    iput-object p1, p0, Lcom/zykj/study/viewmodels/ExerciseStatisticsViewModel;->d:Landroidx/lifecycle/MutableLiveData;

    .line 33
    .line 34
    new-instance p1, Ljava/util/ArrayList;

    .line 35
    .line 36
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 37
    .line 38
    .line 39
    iput-object p1, p0, Lcom/zykj/study/viewmodels/ExerciseStatisticsViewModel;->e:Ljava/util/List;

    .line 40
    .line 41
    new-instance p1, Landroidx/lifecycle/MutableLiveData;

    .line 42
    .line 43
    invoke-direct {p1}, Landroidx/lifecycle/MutableLiveData;-><init>()V

    .line 44
    .line 45
    .line 46
    iput-object p1, p0, Lcom/zykj/study/viewmodels/ExerciseStatisticsViewModel;->f:Landroidx/lifecycle/MutableLiveData;

    .line 47
    .line 48
    new-instance p1, Lcom/zykj/study/bean/teach/Member;

    .line 49
    .line 50
    const/4 v0, 0x0

    .line 51
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 52
    .line 53
    .line 54
    move-result-object v1

    .line 55
    const-string v2, "0"

    .line 56
    .line 57
    invoke-direct {p1, v2, v2, v0}, Lcom/zykj/study/bean/teach/Member;-><init>(Ljava/lang/String;Ljava/lang/String;I)V

    .line 58
    .line 59
    .line 60
    iput-object p1, p0, Lcom/zykj/study/viewmodels/ExerciseStatisticsViewModel;->j:Lcom/zykj/study/bean/teach/Member;

    .line 61
    .line 62
    invoke-static {}, Li7/v;->n()Ljava/util/List;

    .line 63
    .line 64
    .line 65
    move-result-object p1

    .line 66
    invoke-static {p1}, Ll8/r;->a(Ljava/lang/Object;)Ll8/h;

    .line 67
    .line 68
    .line 69
    move-result-object p1

    .line 70
    iput-object p1, p0, Lcom/zykj/study/viewmodels/ExerciseStatisticsViewModel;->k:Ll8/h;

    .line 71
    .line 72
    invoke-static {p1}, Ll8/e;->b(Ll8/h;)Ll8/q;

    .line 73
    .line 74
    .line 75
    move-result-object p1

    .line 76
    iput-object p1, p0, Lcom/zykj/study/viewmodels/ExerciseStatisticsViewModel;->l:Ll8/q;

    .line 77
    .line 78
    invoke-static {v1}, Ll8/r;->a(Ljava/lang/Object;)Ll8/h;

    .line 79
    .line 80
    .line 81
    move-result-object v0

    .line 82
    iput-object v0, p0, Lcom/zykj/study/viewmodels/ExerciseStatisticsViewModel;->m:Ll8/h;

    .line 83
    .line 84
    invoke-static {v0}, Ll8/e;->b(Ll8/h;)Ll8/q;

    .line 85
    .line 86
    .line 87
    move-result-object v0

    .line 88
    iput-object v0, p0, Lcom/zykj/study/viewmodels/ExerciseStatisticsViewModel;->n:Ll8/q;

    .line 89
    .line 90
    invoke-static {v1}, Ll8/r;->a(Ljava/lang/Object;)Ll8/h;

    .line 91
    .line 92
    .line 93
    move-result-object v1

    .line 94
    iput-object v1, p0, Lcom/zykj/study/viewmodels/ExerciseStatisticsViewModel;->o:Ll8/h;

    .line 95
    .line 96
    invoke-static {v1}, Ll8/e;->b(Ll8/h;)Ll8/q;

    .line 97
    .line 98
    .line 99
    move-result-object v1

    .line 100
    iput-object v1, p0, Lcom/zykj/study/viewmodels/ExerciseStatisticsViewModel;->p:Ll8/q;

    .line 101
    .line 102
    new-instance v1, Lcom/zykj/study/viewmodels/ExerciseStatisticsViewModel$special$$inlined$map$1;

    .line 103
    .line 104
    invoke-direct {v1, p1}, Lcom/zykj/study/viewmodels/ExerciseStatisticsViewModel$special$$inlined$map$1;-><init>(Ll8/c;)V

    .line 105
    .line 106
    .line 107
    invoke-static {p0}, Landroidx/lifecycle/ViewModelKt;->getViewModelScope(Landroidx/lifecycle/ViewModel;)Li8/b0;

    .line 108
    .line 109
    .line 110
    move-result-object p1

    .line 111
    sget-object v2, Lkotlinx/coroutines/flow/a;->a:Lkotlinx/coroutines/flow/a$a;

    .line 112
    .line 113
    invoke-virtual {v2}, Lkotlinx/coroutines/flow/a$a;->c()Lkotlinx/coroutines/flow/a;

    .line 114
    .line 115
    .line 116
    move-result-object v3

    .line 117
    const/4 v4, 0x0

    .line 118
    invoke-static {v1, p1, v3, v4}, Ll8/e;->R(Ll8/c;Li8/b0;Lkotlinx/coroutines/flow/a;Ljava/lang/Object;)Ll8/q;

    .line 119
    .line 120
    .line 121
    move-result-object p1

    .line 122
    iput-object p1, p0, Lcom/zykj/study/viewmodels/ExerciseStatisticsViewModel;->q:Ll8/q;

    .line 123
    .line 124
    new-instance v1, Lcom/zykj/study/viewmodels/ExerciseStatisticsViewModel$singleDetailFlow$1;

    .line 125
    .line 126
    invoke-direct {v1, v4}, Lcom/zykj/study/viewmodels/ExerciseStatisticsViewModel$singleDetailFlow$1;-><init>(Lm7/c;)V

    .line 127
    .line 128
    .line 129
    invoke-static {p1, v0, v1}, Ll8/e;->k(Ll8/c;Ll8/c;Lx7/q;)Ll8/c;

    .line 130
    .line 131
    .line 132
    move-result-object v0

    .line 133
    invoke-static {p0}, Landroidx/lifecycle/ViewModelKt;->getViewModelScope(Landroidx/lifecycle/ViewModel;)Li8/b0;

    .line 134
    .line 135
    .line 136
    move-result-object v1

    .line 137
    invoke-virtual {v2}, Lkotlinx/coroutines/flow/a$a;->c()Lkotlinx/coroutines/flow/a;

    .line 138
    .line 139
    .line 140
    move-result-object v3

    .line 141
    invoke-static {v0, v1, v3, v4}, Ll8/e;->R(Ll8/c;Li8/b0;Lkotlinx/coroutines/flow/a;Ljava/lang/Object;)Ll8/q;

    .line 142
    .line 143
    .line 144
    move-result-object v0

    .line 145
    iput-object v0, p0, Lcom/zykj/study/viewmodels/ExerciseStatisticsViewModel;->r:Ll8/q;

    .line 146
    .line 147
    invoke-static {v4}, Ll8/r;->a(Ljava/lang/Object;)Ll8/h;

    .line 148
    .line 149
    .line 150
    move-result-object v1

    .line 151
    iput-object v1, p0, Lcom/zykj/study/viewmodels/ExerciseStatisticsViewModel;->s:Ll8/h;

    .line 152
    .line 153
    invoke-static {v1}, Ll8/e;->b(Ll8/h;)Ll8/q;

    .line 154
    .line 155
    .line 156
    move-result-object v3

    .line 157
    iput-object v3, p0, Lcom/zykj/study/viewmodels/ExerciseStatisticsViewModel;->t:Ll8/q;

    .line 158
    .line 159
    new-instance v3, Lcom/zykj/study/viewmodels/ExerciseStatisticsViewModel$chartDataFlow$1;

    .line 160
    .line 161
    invoke-direct {v3, v4}, Lcom/zykj/study/viewmodels/ExerciseStatisticsViewModel$chartDataFlow$1;-><init>(Lm7/c;)V

    .line 162
    .line 163
    .line 164
    invoke-static {p1, v0, v1, v3}, Ll8/e;->j(Ll8/c;Ll8/c;Ll8/c;Lx7/r;)Ll8/c;

    .line 165
    .line 166
    .line 167
    move-result-object p1

    .line 168
    invoke-static {p0}, Landroidx/lifecycle/ViewModelKt;->getViewModelScope(Landroidx/lifecycle/ViewModel;)Li8/b0;

    .line 169
    .line 170
    .line 171
    move-result-object v0

    .line 172
    invoke-virtual {v2}, Lkotlinx/coroutines/flow/a$a;->c()Lkotlinx/coroutines/flow/a;

    .line 173
    .line 174
    .line 175
    move-result-object v1

    .line 176
    invoke-static {}, Li7/v;->n()Ljava/util/List;

    .line 177
    .line 178
    .line 179
    move-result-object v2

    .line 180
    invoke-static {p1, v0, v1, v2}, Ll8/e;->R(Ll8/c;Li8/b0;Lkotlinx/coroutines/flow/a;Ljava/lang/Object;)Ll8/q;

    .line 181
    .line 182
    .line 183
    move-result-object p1

    .line 184
    iput-object p1, p0, Lcom/zykj/study/viewmodels/ExerciseStatisticsViewModel;->u:Ll8/q;

    .line 185
    .line 186
    return-void
.end method

.method public static final synthetic a(Lcom/zykj/study/viewmodels/ExerciseStatisticsViewModel;)Ll8/h;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/zykj/study/viewmodels/ExerciseStatisticsViewModel;->k:Ll8/h;

    .line 2
    .line 3
    return-object p0
.end method

.method private final f(Lcom/zykj/study/bean/teach/ChoiceChartData;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/study/viewmodels/ExerciseStatisticsViewModel;->s:Ll8/h;

    .line 2
    .line 3
    invoke-interface {v0, p1}, Ll8/h;->setValue(Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final A(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/zykj/study/viewmodels/ExerciseStatisticsViewModel;->g:I

    .line 2
    .line 3
    return-void
.end method

.method public final B(Lcom/zykj/study/bean/teach/Member;)V
    .locals 1

    .line 1
    const-string v0, "<set-?>"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, Lcom/zykj/study/viewmodels/ExerciseStatisticsViewModel;->j:Lcom/zykj/study/bean/teach/Member;

    .line 7
    .line 8
    return-void
.end method

.method public final C(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/zykj/study/viewmodels/ExerciseStatisticsViewModel;->h:I

    .line 2
    .line 3
    return-void
.end method

.method public final D(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/zykj/study/viewmodels/ExerciseStatisticsViewModel;->i:I

    .line 2
    .line 3
    return-void
.end method

.method public final b(Lcom/zykj/study/bean/teach/ChoiceChartData;)V
    .locals 3

    .line 1
    const-string v0, "clickedItem"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/zykj/study/viewmodels/ExerciseStatisticsViewModel;->s:Ll8/h;

    .line 7
    .line 8
    invoke-interface {v0}, Ll8/h;->getValue()Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    check-cast v0, Lcom/zykj/study/bean/teach/ChoiceChartData;

    .line 13
    .line 14
    const/4 v1, 0x0

    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    invoke-virtual {v0}, Lcom/zykj/study/bean/teach/ChoiceChartData;->getName()Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    goto :goto_0

    .line 22
    :cond_0
    move-object v0, v1

    .line 23
    :goto_0
    invoke-virtual {p1}, Lcom/zykj/study/bean/teach/ChoiceChartData;->getName()Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object v2

    .line 27
    invoke-static {v0, v2}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 28
    .line 29
    .line 30
    move-result v0

    .line 31
    if-eqz v0, :cond_1

    .line 32
    .line 33
    invoke-direct {p0, v1}, Lcom/zykj/study/viewmodels/ExerciseStatisticsViewModel;->f(Lcom/zykj/study/bean/teach/ChoiceChartData;)V

    .line 34
    .line 35
    .line 36
    return-void

    .line 37
    :cond_1
    invoke-direct {p0, p1}, Lcom/zykj/study/viewmodels/ExerciseStatisticsViewModel;->f(Lcom/zykj/study/bean/teach/ChoiceChartData;)V

    .line 38
    .line 39
    .line 40
    return-void
.end method

.method public final c(I)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/study/viewmodels/ExerciseStatisticsViewModel;->m:Ll8/h;

    .line 2
    .line 3
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    invoke-interface {v0, p1}, Ll8/h;->setValue(Ljava/lang/Object;)V

    .line 8
    .line 9
    .line 10
    const/4 p1, 0x0

    .line 11
    invoke-direct {p0, p1}, Lcom/zykj/study/viewmodels/ExerciseStatisticsViewModel;->f(Lcom/zykj/study/bean/teach/ChoiceChartData;)V

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method public final d(I)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/study/viewmodels/ExerciseStatisticsViewModel;->o:Ll8/h;

    .line 2
    .line 3
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    invoke-interface {v0, p1}, Ll8/h;->setValue(Ljava/lang/Object;)V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public final e(ILcom/zykj/study/bean/teach/GetQuizDetailBean;)V
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    const-string v1, "entity"

    .line 4
    .line 5
    move-object/from16 v2, p2

    .line 6
    .line 7
    invoke-static {v2, v1}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    invoke-virtual/range {p0 .. p1}, Lcom/zykj/study/viewmodels/ExerciseStatisticsViewModel;->d(I)V

    .line 11
    .line 12
    .line 13
    const/4 v1, 0x0

    .line 14
    invoke-direct {v0, v1}, Lcom/zykj/study/viewmodels/ExerciseStatisticsViewModel;->f(Lcom/zykj/study/bean/teach/ChoiceChartData;)V

    .line 15
    .line 16
    .line 17
    iget-object v1, v0, Lcom/zykj/study/viewmodels/ExerciseStatisticsViewModel;->k:Ll8/h;

    .line 18
    .line 19
    invoke-interface {v1}, Ll8/h;->getValue()Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    check-cast v1, Ljava/util/Collection;

    .line 24
    .line 25
    invoke-static {v1}, Li7/f0;->X0(Ljava/util/Collection;)Ljava/util/List;

    .line 26
    .line 27
    .line 28
    move-result-object v1

    .line 29
    new-instance v3, Ljava/util/ArrayList;

    .line 30
    .line 31
    const/16 v4, 0xa

    .line 32
    .line 33
    invoke-static {v1, v4}, Li7/w;->x(Ljava/lang/Iterable;I)I

    .line 34
    .line 35
    .line 36
    move-result v4

    .line 37
    invoke-direct {v3, v4}, Ljava/util/ArrayList;-><init>(I)V

    .line 38
    .line 39
    .line 40
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 41
    .line 42
    .line 43
    move-result-object v1

    .line 44
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 45
    .line 46
    .line 47
    move-result v4

    .line 48
    if-eqz v4, :cond_1

    .line 49
    .line 50
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    move-result-object v4

    .line 54
    move-object v5, v4

    .line 55
    check-cast v5, Lcom/zykj/study/bean/teach/GetQuizDetailBean;

    .line 56
    .line 57
    invoke-virtual {v5}, Lcom/zykj/study/bean/teach/GetQuizDetailBean;->getId()J

    .line 58
    .line 59
    .line 60
    move-result-wide v6

    .line 61
    invoke-virtual {v2}, Lcom/zykj/study/bean/teach/GetQuizDetailBean;->getId()J

    .line 62
    .line 63
    .line 64
    move-result-wide v8

    .line 65
    cmp-long v4, v6, v8

    .line 66
    .line 67
    if-nez v4, :cond_0

    .line 68
    .line 69
    const/16 v15, 0x77

    .line 70
    .line 71
    const/16 v16, 0x0

    .line 72
    .line 73
    const-wide/16 v6, 0x0

    .line 74
    .line 75
    const-wide/16 v8, 0x0

    .line 76
    .line 77
    const/4 v10, 0x0

    .line 78
    const/4 v11, 0x1

    .line 79
    const/4 v12, 0x0

    .line 80
    const/4 v13, 0x0

    .line 81
    const/4 v14, 0x0

    .line 82
    invoke-static/range {v5 .. v16}, Lcom/zykj/study/bean/teach/GetQuizDetailBean;->copy$default(Lcom/zykj/study/bean/teach/GetQuizDetailBean;JJIZLjava/util/List;Ljava/util/List;Ljava/util/List;ILjava/lang/Object;)Lcom/zykj/study/bean/teach/GetQuizDetailBean;

    .line 83
    .line 84
    .line 85
    move-result-object v4

    .line 86
    goto :goto_1

    .line 87
    :cond_0
    const/16 v15, 0x77

    .line 88
    .line 89
    const/16 v16, 0x0

    .line 90
    .line 91
    const-wide/16 v6, 0x0

    .line 92
    .line 93
    const-wide/16 v8, 0x0

    .line 94
    .line 95
    const/4 v10, 0x0

    .line 96
    const/4 v11, 0x0

    .line 97
    const/4 v12, 0x0

    .line 98
    const/4 v13, 0x0

    .line 99
    const/4 v14, 0x0

    .line 100
    invoke-static/range {v5 .. v16}, Lcom/zykj/study/bean/teach/GetQuizDetailBean;->copy$default(Lcom/zykj/study/bean/teach/GetQuizDetailBean;JJIZLjava/util/List;Ljava/util/List;Ljava/util/List;ILjava/lang/Object;)Lcom/zykj/study/bean/teach/GetQuizDetailBean;

    .line 101
    .line 102
    .line 103
    move-result-object v4

    .line 104
    :goto_1
    invoke-interface {v3, v4}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 105
    .line 106
    .line 107
    goto :goto_0

    .line 108
    :cond_1
    iget-object v1, v0, Lcom/zykj/study/viewmodels/ExerciseStatisticsViewModel;->k:Ll8/h;

    .line 109
    .line 110
    invoke-interface {v1, v3}, Ll8/h;->setValue(Ljava/lang/Object;)V

    .line 111
    .line 112
    .line 113
    return-void
.end method

.method public final g()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/zykj/study/viewmodels/ExerciseStatisticsViewModel;->g:I

    .line 2
    .line 3
    return v0
.end method

.method public final h()Ll8/q;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/study/viewmodels/ExerciseStatisticsViewModel;->u:Ll8/q;

    .line 2
    .line 3
    return-object v0
.end method

.method public final i()Ll8/q;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/study/viewmodels/ExerciseStatisticsViewModel;->p:Ll8/q;

    .line 2
    .line 3
    return-object v0
.end method

.method public final j()Landroidx/lifecycle/MutableLiveData;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/study/viewmodels/ExerciseStatisticsViewModel;->f:Landroidx/lifecycle/MutableLiveData;

    .line 2
    .line 3
    return-object v0
.end method

.method public final k()Lcom/zykj/study/bean/teach/Member;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/study/viewmodels/ExerciseStatisticsViewModel;->j:Lcom/zykj/study/bean/teach/Member;

    .line 2
    .line 3
    return-object v0
.end method

.method public final l()Landroidx/lifecycle/MutableLiveData;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/study/viewmodels/ExerciseStatisticsViewModel;->c:Landroidx/lifecycle/MutableLiveData;

    .line 2
    .line 3
    return-object v0
.end method

.method public final m()Ll8/q;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/study/viewmodels/ExerciseStatisticsViewModel;->l:Ll8/q;

    .line 2
    .line 3
    return-object v0
.end method

.method public final n(Z)Ljava/util/List;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/study/viewmodels/ExerciseStatisticsViewModel;->r:Ll8/q;

    .line 2
    .line 3
    invoke-interface {v0}, Ll8/q;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lcom/zykj/study/bean/teach/StuQuizBean;

    .line 8
    .line 9
    if-eqz v0, :cond_2

    .line 10
    .line 11
    if-eqz p1, :cond_0

    .line 12
    .line 13
    invoke-virtual {v0}, Lcom/zykj/study/bean/teach/StuQuizBean;->getCompleteList()Ljava/util/List;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    goto :goto_0

    .line 18
    :cond_0
    invoke-virtual {v0}, Lcom/zykj/study/bean/teach/StuQuizBean;->getUnCompleteList()Ljava/util/List;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    :goto_0
    if-nez p1, :cond_1

    .line 23
    .line 24
    goto :goto_1

    .line 25
    :cond_1
    return-object p1

    .line 26
    :cond_2
    :goto_1
    invoke-static {}, Li7/v;->n()Ljava/util/List;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    return-object p1
.end method

.method public final o()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/zykj/study/viewmodels/ExerciseStatisticsViewModel;->h:I

    .line 2
    .line 3
    return v0
.end method

.method public final p()Landroidx/lifecycle/MutableLiveData;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/study/viewmodels/ExerciseStatisticsViewModel;->d:Landroidx/lifecycle/MutableLiveData;

    .line 2
    .line 3
    return-object v0
.end method

.method public final q()Lcom/zykj/study/repository/TeachCourseRepository;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/study/viewmodels/ExerciseStatisticsViewModel;->a:Lcom/zykj/study/repository/TeachCourseRepository;

    .line 2
    .line 3
    return-object v0
.end method

.method public final r()Ll8/q;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/study/viewmodels/ExerciseStatisticsViewModel;->t:Ll8/q;

    .line 2
    .line 3
    return-object v0
.end method

.method public final s()Ll8/q;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/study/viewmodels/ExerciseStatisticsViewModel;->r:Ll8/q;

    .line 2
    .line 3
    return-object v0
.end method

.method public final t()Ljava/util/List;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/study/viewmodels/ExerciseStatisticsViewModel;->e:Ljava/util/List;

    .line 2
    .line 3
    return-object v0
.end method

.method public final u()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/zykj/study/viewmodels/ExerciseStatisticsViewModel;->i:I

    .line 2
    .line 3
    return v0
.end method

.method public final v(II)V
    .locals 4

    .line 1
    invoke-virtual {p0}, Lcom/zykj/base/BaseViewModel;->getToastLiveData()Lcom/kunminx/architecture/ui/callback/UnPeekLiveData;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {p0}, Lcom/zykj/base/BaseViewModel;->isDialogVisible()Lcom/kunminx/architecture/ui/callback/UnPeekLiveData;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    new-instance v2, Lcom/zykj/study/viewmodels/ExerciseStatisticsViewModel$getTitleList$1;

    .line 10
    .line 11
    const/4 v3, 0x0

    .line 12
    invoke-direct {v2, p0, p1, p2, v3}, Lcom/zykj/study/viewmodels/ExerciseStatisticsViewModel$getTitleList$1;-><init>(Lcom/zykj/study/viewmodels/ExerciseStatisticsViewModel;IILm7/c;)V

    .line 13
    .line 14
    .line 15
    invoke-virtual {p0, v0, v1, v2}, Lcom/zykj/base/BaseViewModel;->launch(Lcom/kunminx/architecture/ui/callback/UnPeekLiveData;Lcom/kunminx/architecture/ui/callback/UnPeekLiveData;Lx7/p;)Lkotlinx/coroutines/n;

    .line 16
    .line 17
    .line 18
    return-void
.end method

.method public final w(Lcom/zykj/study/bean/teach/Member;)V
    .locals 4

    .line 1
    const-string v0, "member"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Lcom/zykj/base/BaseViewModel;->getToastLiveData()Lcom/kunminx/architecture/ui/callback/UnPeekLiveData;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    invoke-virtual {p0}, Lcom/zykj/base/BaseViewModel;->isDialogVisible()Lcom/kunminx/architecture/ui/callback/UnPeekLiveData;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    new-instance v2, Lcom/zykj/study/viewmodels/ExerciseStatisticsViewModel$getUserQuizStatistic$1;

    .line 15
    .line 16
    const/4 v3, 0x0

    .line 17
    invoke-direct {v2, p0, p1, v3}, Lcom/zykj/study/viewmodels/ExerciseStatisticsViewModel$getUserQuizStatistic$1;-><init>(Lcom/zykj/study/viewmodels/ExerciseStatisticsViewModel;Lcom/zykj/study/bean/teach/Member;Lm7/c;)V

    .line 18
    .line 19
    .line 20
    invoke-virtual {p0, v0, v1, v2}, Lcom/zykj/base/BaseViewModel;->launchData(Lcom/kunminx/architecture/ui/callback/UnPeekLiveData;Lcom/kunminx/architecture/ui/callback/UnPeekLiveData;Lx7/p;)Lkotlinx/coroutines/n;

    .line 21
    .line 22
    .line 23
    return-void
.end method

.method public final x()Landroidx/lifecycle/MutableLiveData;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/study/viewmodels/ExerciseStatisticsViewModel;->b:Landroidx/lifecycle/MutableLiveData;

    .line 2
    .line 3
    return-object v0
.end method

.method public final y(II)V
    .locals 4

    .line 1
    invoke-virtual {p0}, Lcom/zykj/base/BaseViewModel;->getToastLiveData()Lcom/kunminx/architecture/ui/callback/UnPeekLiveData;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {p0}, Lcom/zykj/base/BaseViewModel;->isDialogVisible()Lcom/kunminx/architecture/ui/callback/UnPeekLiveData;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    new-instance v2, Lcom/zykj/study/viewmodels/ExerciseStatisticsViewModel$loadDetails$1;

    .line 10
    .line 11
    const/4 v3, 0x0

    .line 12
    invoke-direct {v2, p0, p1, p2, v3}, Lcom/zykj/study/viewmodels/ExerciseStatisticsViewModel$loadDetails$1;-><init>(Lcom/zykj/study/viewmodels/ExerciseStatisticsViewModel;IILm7/c;)V

    .line 13
    .line 14
    .line 15
    invoke-virtual {p0, v0, v1, v2}, Lcom/zykj/base/BaseViewModel;->launchData(Lcom/kunminx/architecture/ui/callback/UnPeekLiveData;Lcom/kunminx/architecture/ui/callback/UnPeekLiveData;Lx7/p;)Lkotlinx/coroutines/n;

    .line 16
    .line 17
    .line 18
    return-void
.end method

.method public final z()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/zykj/study/viewmodels/ExerciseStatisticsViewModel;->o:Ll8/h;

    .line 2
    .line 3
    invoke-interface {v0}, Ll8/h;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Ljava/lang/Number;

    .line 8
    .line 9
    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    iget-object v0, p0, Lcom/zykj/study/viewmodels/ExerciseStatisticsViewModel;->o:Ll8/h;

    .line 16
    .line 17
    const/4 v1, 0x0

    .line 18
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    invoke-interface {v0, v1}, Ll8/h;->setValue(Ljava/lang/Object;)V

    .line 23
    .line 24
    .line 25
    :cond_0
    return-void
.end method
