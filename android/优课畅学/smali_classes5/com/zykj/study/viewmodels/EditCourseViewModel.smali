# RE note 本类字节码直接引用的读写或显示接口包括DataStore。
.class public final Lcom/zykj/study/viewmodels/EditCourseViewModel;
.super Lcom/zykj/base/BaseViewModel;
.source "SourceFile"


# annotations
.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x0
.end annotation


# instance fields
.field public final a:Lcom/zykj/study/repository/CourseRepository;

.field public final b:Landroidx/datastore/core/DataStore;

.field public final c:Landroidx/databinding/ObservableBoolean;

.field public final d:Landroidx/lifecycle/MutableLiveData;

.field public final e:Landroidx/lifecycle/MutableLiveData;

.field public final f:Landroidx/lifecycle/MutableLiveData;

.field public final g:Landroidx/lifecycle/MutableLiveData;

.field public final h:Landroidx/lifecycle/MutableLiveData;

.field public final i:Landroidx/lifecycle/MutableLiveData;

.field public final j:Landroidx/lifecycle/MutableLiveData;

.field public final k:Landroidx/lifecycle/MutableLiveData;

.field public final l:Landroidx/lifecycle/MutableLiveData;

.field public final m:Landroidx/lifecycle/MutableLiveData;

.field public final n:Landroidx/lifecycle/MutableLiveData;

.field public final o:Landroidx/lifecycle/MutableLiveData;

.field public final p:Landroidx/lifecycle/MutableLiveData;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Lcom/zykj/study/repository/CourseRepository;Landroidx/datastore/core/DataStore;)V
    .locals 1

    .line 1
    const-string v0, "myCourseRepository"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "userDataStore"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-direct {p0}, Lcom/zykj/base/BaseViewModel;-><init>()V

    .line 12
    .line 13
    .line 14
    iput-object p1, p0, Lcom/zykj/study/viewmodels/EditCourseViewModel;->a:Lcom/zykj/study/repository/CourseRepository;

    .line 15
    .line 16
    iput-object p2, p0, Lcom/zykj/study/viewmodels/EditCourseViewModel;->b:Landroidx/datastore/core/DataStore;

    .line 17
    .line 18
    new-instance p1, Landroidx/databinding/ObservableBoolean;

    .line 19
    .line 20
    const/4 p2, 0x1

    .line 21
    invoke-direct {p1, p2}, Landroidx/databinding/ObservableBoolean;-><init>(Z)V

    .line 22
    .line 23
    .line 24
    iput-object p1, p0, Lcom/zykj/study/viewmodels/EditCourseViewModel;->c:Landroidx/databinding/ObservableBoolean;

    .line 25
    .line 26
    new-instance p1, Landroidx/lifecycle/MutableLiveData;

    .line 27
    .line 28
    const/4 p2, 0x0

    .line 29
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 30
    .line 31
    .line 32
    move-result-object p2

    .line 33
    invoke-direct {p1, p2}, Landroidx/lifecycle/MutableLiveData;-><init>(Ljava/lang/Object;)V

    .line 34
    .line 35
    .line 36
    iput-object p1, p0, Lcom/zykj/study/viewmodels/EditCourseViewModel;->d:Landroidx/lifecycle/MutableLiveData;

    .line 37
    .line 38
    new-instance p1, Landroidx/lifecycle/MutableLiveData;

    .line 39
    .line 40
    const-string v0, ""

    .line 41
    .line 42
    invoke-direct {p1, v0}, Landroidx/lifecycle/MutableLiveData;-><init>(Ljava/lang/Object;)V

    .line 43
    .line 44
    .line 45
    iput-object p1, p0, Lcom/zykj/study/viewmodels/EditCourseViewModel;->e:Landroidx/lifecycle/MutableLiveData;

    .line 46
    .line 47
    new-instance p1, Landroidx/lifecycle/MutableLiveData;

    .line 48
    .line 49
    invoke-direct {p1, v0}, Landroidx/lifecycle/MutableLiveData;-><init>(Ljava/lang/Object;)V

    .line 50
    .line 51
    .line 52
    iput-object p1, p0, Lcom/zykj/study/viewmodels/EditCourseViewModel;->f:Landroidx/lifecycle/MutableLiveData;

    .line 53
    .line 54
    new-instance p1, Landroidx/lifecycle/MutableLiveData;

    .line 55
    .line 56
    invoke-direct {p1, v0}, Landroidx/lifecycle/MutableLiveData;-><init>(Ljava/lang/Object;)V

    .line 57
    .line 58
    .line 59
    iput-object p1, p0, Lcom/zykj/study/viewmodels/EditCourseViewModel;->g:Landroidx/lifecycle/MutableLiveData;

    .line 60
    .line 61
    new-instance p1, Landroidx/lifecycle/MutableLiveData;

    .line 62
    .line 63
    invoke-direct {p1, v0}, Landroidx/lifecycle/MutableLiveData;-><init>(Ljava/lang/Object;)V

    .line 64
    .line 65
    .line 66
    iput-object p1, p0, Lcom/zykj/study/viewmodels/EditCourseViewModel;->h:Landroidx/lifecycle/MutableLiveData;

    .line 67
    .line 68
    new-instance p1, Landroidx/lifecycle/MutableLiveData;

    .line 69
    .line 70
    invoke-direct {p1, p2}, Landroidx/lifecycle/MutableLiveData;-><init>(Ljava/lang/Object;)V

    .line 71
    .line 72
    .line 73
    iput-object p1, p0, Lcom/zykj/study/viewmodels/EditCourseViewModel;->i:Landroidx/lifecycle/MutableLiveData;

    .line 74
    .line 75
    new-instance p1, Landroidx/lifecycle/MutableLiveData;

    .line 76
    .line 77
    invoke-direct {p1, p2}, Landroidx/lifecycle/MutableLiveData;-><init>(Ljava/lang/Object;)V

    .line 78
    .line 79
    .line 80
    iput-object p1, p0, Lcom/zykj/study/viewmodels/EditCourseViewModel;->j:Landroidx/lifecycle/MutableLiveData;

    .line 81
    .line 82
    new-instance p1, Landroidx/lifecycle/MutableLiveData;

    .line 83
    .line 84
    invoke-direct {p1, p2}, Landroidx/lifecycle/MutableLiveData;-><init>(Ljava/lang/Object;)V

    .line 85
    .line 86
    .line 87
    iput-object p1, p0, Lcom/zykj/study/viewmodels/EditCourseViewModel;->k:Landroidx/lifecycle/MutableLiveData;

    .line 88
    .line 89
    new-instance p1, Landroidx/lifecycle/MutableLiveData;

    .line 90
    .line 91
    invoke-direct {p1, p2}, Landroidx/lifecycle/MutableLiveData;-><init>(Ljava/lang/Object;)V

    .line 92
    .line 93
    .line 94
    iput-object p1, p0, Lcom/zykj/study/viewmodels/EditCourseViewModel;->l:Landroidx/lifecycle/MutableLiveData;

    .line 95
    .line 96
    new-instance p1, Landroidx/lifecycle/MutableLiveData;

    .line 97
    .line 98
    invoke-direct {p1, p2}, Landroidx/lifecycle/MutableLiveData;-><init>(Ljava/lang/Object;)V

    .line 99
    .line 100
    .line 101
    iput-object p1, p0, Lcom/zykj/study/viewmodels/EditCourseViewModel;->m:Landroidx/lifecycle/MutableLiveData;

    .line 102
    .line 103
    new-instance p1, Landroidx/lifecycle/MutableLiveData;

    .line 104
    .line 105
    sget-object p2, Lcom/zykj/study/bean/course/CourseType;->UNDERCARRIAGE:Lcom/zykj/study/bean/course/CourseType;

    .line 106
    .line 107
    invoke-direct {p1, p2}, Landroidx/lifecycle/MutableLiveData;-><init>(Ljava/lang/Object;)V

    .line 108
    .line 109
    .line 110
    iput-object p1, p0, Lcom/zykj/study/viewmodels/EditCourseViewModel;->n:Landroidx/lifecycle/MutableLiveData;

    .line 111
    .line 112
    new-instance p1, Landroidx/lifecycle/MutableLiveData;

    .line 113
    .line 114
    sget-object p2, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 115
    .line 116
    invoke-direct {p1, p2}, Landroidx/lifecycle/MutableLiveData;-><init>(Ljava/lang/Object;)V

    .line 117
    .line 118
    .line 119
    iput-object p1, p0, Lcom/zykj/study/viewmodels/EditCourseViewModel;->o:Landroidx/lifecycle/MutableLiveData;

    .line 120
    .line 121
    new-instance p1, Landroidx/lifecycle/MutableLiveData;

    .line 122
    .line 123
    sget-object p2, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 124
    .line 125
    invoke-direct {p1, p2}, Landroidx/lifecycle/MutableLiveData;-><init>(Ljava/lang/Object;)V

    .line 126
    .line 127
    .line 128
    iput-object p1, p0, Lcom/zykj/study/viewmodels/EditCourseViewModel;->p:Landroidx/lifecycle/MutableLiveData;

    .line 129
    .line 130
    return-void
.end method


# virtual methods
.method public final a()Landroidx/lifecycle/MutableLiveData;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/study/viewmodels/EditCourseViewModel;->h:Landroidx/lifecycle/MutableLiveData;

    .line 2
    .line 3
    return-object v0
.end method

.method public final b()Landroidx/lifecycle/MutableLiveData;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/study/viewmodels/EditCourseViewModel;->j:Landroidx/lifecycle/MutableLiveData;

    .line 2
    .line 3
    return-object v0
.end method

.method public final c()Landroidx/lifecycle/MutableLiveData;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/study/viewmodels/EditCourseViewModel;->d:Landroidx/lifecycle/MutableLiveData;

    .line 2
    .line 3
    return-object v0
.end method

.method public final d()Landroidx/lifecycle/MutableLiveData;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/study/viewmodels/EditCourseViewModel;->l:Landroidx/lifecycle/MutableLiveData;

    .line 2
    .line 3
    return-object v0
.end method

.method public final e()Landroidx/lifecycle/MutableLiveData;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/study/viewmodels/EditCourseViewModel;->m:Landroidx/lifecycle/MutableLiveData;

    .line 2
    .line 3
    return-object v0
.end method

.method public final f()Landroidx/lifecycle/MutableLiveData;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/study/viewmodels/EditCourseViewModel;->e:Landroidx/lifecycle/MutableLiveData;

    .line 2
    .line 3
    return-object v0
.end method

.method public final g()Lcom/zykj/study/repository/CourseRepository;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/study/viewmodels/EditCourseViewModel;->a:Lcom/zykj/study/repository/CourseRepository;

    .line 2
    .line 3
    return-object v0
.end method

.method public final h()Landroidx/lifecycle/MutableLiveData;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/study/viewmodels/EditCourseViewModel;->i:Landroidx/lifecycle/MutableLiveData;

    .line 2
    .line 3
    return-object v0
.end method

.method public final i()Landroidx/lifecycle/MutableLiveData;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/study/viewmodels/EditCourseViewModel;->n:Landroidx/lifecycle/MutableLiveData;

    .line 2
    .line 3
    return-object v0
.end method

.method public final j()Landroidx/lifecycle/MutableLiveData;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/study/viewmodels/EditCourseViewModel;->k:Landroidx/lifecycle/MutableLiveData;

    .line 2
    .line 3
    return-object v0
.end method

.method public final k()Landroidx/lifecycle/MutableLiveData;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/study/viewmodels/EditCourseViewModel;->f:Landroidx/lifecycle/MutableLiveData;

    .line 2
    .line 3
    return-object v0
.end method

.method public final l()Landroidx/lifecycle/MutableLiveData;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/study/viewmodels/EditCourseViewModel;->g:Landroidx/lifecycle/MutableLiveData;

    .line 2
    .line 3
    return-object v0
.end method

.method public final m()Landroidx/lifecycle/MutableLiveData;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/study/viewmodels/EditCourseViewModel;->p:Landroidx/lifecycle/MutableLiveData;

    .line 2
    .line 3
    return-object v0
.end method

.method public final n()Landroidx/lifecycle/MutableLiveData;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/study/viewmodels/EditCourseViewModel;->o:Landroidx/lifecycle/MutableLiveData;

    .line 2
    .line 3
    return-object v0
.end method

.method public final o()Landroidx/databinding/ObservableBoolean;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/study/viewmodels/EditCourseViewModel;->c:Landroidx/databinding/ObservableBoolean;

    .line 2
    .line 3
    return-object v0
.end method

.method public final p(Lm7/c;)Ljava/lang/Object;
    .locals 27

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    instance-of v2, v1, Lcom/zykj/study/viewmodels/EditCourseViewModel$uploadMyCourse$1;

    .line 6
    .line 7
    if-eqz v2, :cond_0

    .line 8
    .line 9
    move-object v2, v1

    .line 10
    check-cast v2, Lcom/zykj/study/viewmodels/EditCourseViewModel$uploadMyCourse$1;

    .line 11
    .line 12
    iget v3, v2, Lcom/zykj/study/viewmodels/EditCourseViewModel$uploadMyCourse$1;->e:I

    .line 13
    .line 14
    const/high16 v4, -0x80000000

    .line 15
    .line 16
    and-int v5, v3, v4

    .line 17
    .line 18
    if-eqz v5, :cond_0

    .line 19
    .line 20
    sub-int/2addr v3, v4

    .line 21
    iput v3, v2, Lcom/zykj/study/viewmodels/EditCourseViewModel$uploadMyCourse$1;->e:I

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    new-instance v2, Lcom/zykj/study/viewmodels/EditCourseViewModel$uploadMyCourse$1;

    .line 25
    .line 26
    invoke-direct {v2, v0, v1}, Lcom/zykj/study/viewmodels/EditCourseViewModel$uploadMyCourse$1;-><init>(Lcom/zykj/study/viewmodels/EditCourseViewModel;Lm7/c;)V

    .line 27
    .line 28
    .line 29
    :goto_0
    iget-object v1, v2, Lcom/zykj/study/viewmodels/EditCourseViewModel$uploadMyCourse$1;->c:Ljava/lang/Object;

    .line 30
    .line 31
    invoke-static {}, Ln7/a;->f()Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v3

    .line 35
    iget v4, v2, Lcom/zykj/study/viewmodels/EditCourseViewModel$uploadMyCourse$1;->e:I

    .line 36
    .line 37
    const/4 v5, 0x2

    .line 38
    const/4 v6, 0x1

    .line 39
    const/4 v7, 0x0

    .line 40
    const/4 v8, 0x0

    .line 41
    if-eqz v4, :cond_4

    .line 42
    .line 43
    if-eq v4, v6, :cond_2

    .line 44
    .line 45
    if-ne v4, v5, :cond_1

    .line 46
    .line 47
    iget-object v2, v2, Lcom/zykj/study/viewmodels/EditCourseViewModel$uploadMyCourse$1;->b:Ljava/lang/Object;

    .line 48
    .line 49
    check-cast v2, Lcom/zykj/study/data/MyCourseEntity;

    .line 50
    .line 51
    invoke-static {v1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 52
    .line 53
    .line 54
    return-object v1

    .line 55
    :cond_1
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 56
    .line 57
    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 58
    .line 59
    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 60
    .line 61
    .line 62
    throw v1

    .line 63
    :cond_2
    iget v4, v2, Lcom/zykj/study/viewmodels/EditCourseViewModel$uploadMyCourse$1;->a:I

    .line 64
    .line 65
    invoke-static {v1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 66
    .line 67
    .line 68
    :cond_3
    move v10, v4

    .line 69
    goto/16 :goto_3

    .line 70
    .line 71
    :cond_4
    invoke-static {v1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 72
    .line 73
    .line 74
    iget-object v1, v0, Lcom/zykj/study/viewmodels/EditCourseViewModel;->c:Landroidx/databinding/ObservableBoolean;

    .line 75
    .line 76
    invoke-virtual {v1}, Landroidx/databinding/ObservableBoolean;->get()Z

    .line 77
    .line 78
    .line 79
    move-result v1

    .line 80
    if-nez v1, :cond_6

    .line 81
    .line 82
    iget-object v1, v0, Lcom/zykj/study/viewmodels/EditCourseViewModel;->e:Landroidx/lifecycle/MutableLiveData;

    .line 83
    .line 84
    invoke-virtual {v1}, Landroidx/lifecycle/LiveData;->getValue()Ljava/lang/Object;

    .line 85
    .line 86
    .line 87
    move-result-object v1

    .line 88
    check-cast v1, Ljava/lang/CharSequence;

    .line 89
    .line 90
    if-eqz v1, :cond_5

    .line 91
    .line 92
    invoke-interface {v1}, Ljava/lang/CharSequence;->length()I

    .line 93
    .line 94
    .line 95
    move-result v1

    .line 96
    if-nez v1, :cond_6

    .line 97
    .line 98
    :cond_5
    invoke-virtual {v0}, Lcom/zykj/base/BaseViewModel;->getToastLiveData()Lcom/kunminx/architecture/ui/callback/UnPeekLiveData;

    .line 99
    .line 100
    .line 101
    move-result-object v1

    .line 102
    new-instance v2, Lcom/zykj/base/bean/toast/ToastWarnMessage;

    .line 103
    .line 104
    sget v3, Lcom/zykj/study/R$string;->please_choice_local_cover:I

    .line 105
    .line 106
    invoke-static {v3}, Lo7/a;->c(I)Ljava/lang/Integer;

    .line 107
    .line 108
    .line 109
    move-result-object v3

    .line 110
    invoke-direct {v2, v7, v3, v6, v7}, Lcom/zykj/base/bean/toast/ToastWarnMessage;-><init>(Ljava/lang/String;Ljava/lang/Integer;ILkotlin/jvm/internal/n;)V

    .line 111
    .line 112
    .line 113
    invoke-virtual {v1, v2}, Lcom/kunminx/architecture/ui/callback/UnPeekLiveData;->postValue(Ljava/lang/Object;)V

    .line 114
    .line 115
    .line 116
    invoke-static {v8}, Lo7/a;->a(Z)Ljava/lang/Boolean;

    .line 117
    .line 118
    .line 119
    move-result-object v1

    .line 120
    return-object v1

    .line 121
    :cond_6
    iget-object v1, v0, Lcom/zykj/study/viewmodels/EditCourseViewModel;->g:Landroidx/lifecycle/MutableLiveData;

    .line 122
    .line 123
    invoke-virtual {v1}, Landroidx/lifecycle/LiveData;->getValue()Ljava/lang/Object;

    .line 124
    .line 125
    .line 126
    move-result-object v1

    .line 127
    check-cast v1, Ljava/lang/CharSequence;

    .line 128
    .line 129
    if-eqz v1, :cond_17

    .line 130
    .line 131
    invoke-static {v1}, Lg8/c0;->h0(Ljava/lang/CharSequence;)Z

    .line 132
    .line 133
    .line 134
    move-result v1

    .line 135
    if-eqz v1, :cond_7

    .line 136
    .line 137
    goto/16 :goto_f

    .line 138
    .line 139
    :cond_7
    iget-object v1, v0, Lcom/zykj/study/viewmodels/EditCourseViewModel;->k:Landroidx/lifecycle/MutableLiveData;

    .line 140
    .line 141
    invoke-virtual {v1}, Landroidx/lifecycle/LiveData;->getValue()Ljava/lang/Object;

    .line 142
    .line 143
    .line 144
    move-result-object v1

    .line 145
    check-cast v1, Ljava/lang/Integer;

    .line 146
    .line 147
    if-nez v1, :cond_8

    .line 148
    .line 149
    goto :goto_1

    .line 150
    :cond_8
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 151
    .line 152
    .line 153
    move-result v1

    .line 154
    if-nez v1, :cond_9

    .line 155
    .line 156
    invoke-virtual {v0}, Lcom/zykj/base/BaseViewModel;->getToastLiveData()Lcom/kunminx/architecture/ui/callback/UnPeekLiveData;

    .line 157
    .line 158
    .line 159
    move-result-object v1

    .line 160
    new-instance v2, Lcom/zykj/base/bean/toast/ToastWarnMessage;

    .line 161
    .line 162
    sget v3, Lcom/zykj/study/R$string;->please_input_course_subject:I

    .line 163
    .line 164
    invoke-static {v3}, Lo7/a;->c(I)Ljava/lang/Integer;

    .line 165
    .line 166
    .line 167
    move-result-object v3

    .line 168
    invoke-direct {v2, v7, v3, v6, v7}, Lcom/zykj/base/bean/toast/ToastWarnMessage;-><init>(Ljava/lang/String;Ljava/lang/Integer;ILkotlin/jvm/internal/n;)V

    .line 169
    .line 170
    .line 171
    invoke-virtual {v1, v2}, Lcom/kunminx/architecture/ui/callback/UnPeekLiveData;->postValue(Ljava/lang/Object;)V

    .line 172
    .line 173
    .line 174
    invoke-static {v8}, Lo7/a;->a(Z)Ljava/lang/Boolean;

    .line 175
    .line 176
    .line 177
    move-result-object v1

    .line 178
    return-object v1

    .line 179
    :cond_9
    :goto_1
    iget-object v1, v0, Lcom/zykj/study/viewmodels/EditCourseViewModel;->d:Landroidx/lifecycle/MutableLiveData;

    .line 180
    .line 181
    invoke-virtual {v1}, Landroidx/lifecycle/LiveData;->getValue()Ljava/lang/Object;

    .line 182
    .line 183
    .line 184
    move-result-object v1

    .line 185
    check-cast v1, Ljava/lang/Integer;

    .line 186
    .line 187
    if-eqz v1, :cond_a

    .line 188
    .line 189
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 190
    .line 191
    .line 192
    move-result v1

    .line 193
    move v4, v1

    .line 194
    goto :goto_2

    .line 195
    :cond_a
    move v4, v8

    .line 196
    :goto_2
    iget-object v1, v0, Lcom/zykj/study/viewmodels/EditCourseViewModel;->b:Landroidx/datastore/core/DataStore;

    .line 197
    .line 198
    invoke-interface {v1}, Landroidx/datastore/core/DataStore;->getData()Ll8/c;

    .line 199
    .line 200
    .line 201
    move-result-object v1

    .line 202
    iput v4, v2, Lcom/zykj/study/viewmodels/EditCourseViewModel$uploadMyCourse$1;->a:I

    .line 203
    .line 204
    iput v6, v2, Lcom/zykj/study/viewmodels/EditCourseViewModel$uploadMyCourse$1;->e:I

    .line 205
    .line 206
    invoke-static {v1, v2}, Ll8/e;->z(Ll8/c;Lm7/c;)Ljava/lang/Object;

    .line 207
    .line 208
    .line 209
    move-result-object v1

    .line 210
    if-ne v1, v3, :cond_3

    .line 211
    .line 212
    goto/16 :goto_e

    .line 213
    .line 214
    :goto_3
    check-cast v1, Lcom/zykj/lib/login/proto/UserBean;

    .line 215
    .line 216
    if-eqz v1, :cond_c

    .line 217
    .line 218
    invoke-virtual {v1}, Lcom/zykj/lib/login/proto/UserBean;->getId()Ljava/lang/String;

    .line 219
    .line 220
    .line 221
    move-result-object v1

    .line 222
    if-nez v1, :cond_b

    .line 223
    .line 224
    goto :goto_5

    .line 225
    :cond_b
    :goto_4
    move-object v11, v1

    .line 226
    goto :goto_6

    .line 227
    :cond_c
    :goto_5
    const-string v1, ""

    .line 228
    .line 229
    goto :goto_4

    .line 230
    :goto_6
    iget-object v1, v0, Lcom/zykj/study/viewmodels/EditCourseViewModel;->c:Landroidx/databinding/ObservableBoolean;

    .line 231
    .line 232
    invoke-virtual {v1}, Landroidx/databinding/ObservableBoolean;->get()Z

    .line 233
    .line 234
    .line 235
    move-result v1

    .line 236
    if-eqz v1, :cond_d

    .line 237
    .line 238
    iget-object v1, v0, Lcom/zykj/study/viewmodels/EditCourseViewModel;->f:Landroidx/lifecycle/MutableLiveData;

    .line 239
    .line 240
    :goto_7
    invoke-virtual {v1}, Landroidx/lifecycle/LiveData;->getValue()Ljava/lang/Object;

    .line 241
    .line 242
    .line 243
    move-result-object v1

    .line 244
    check-cast v1, Ljava/lang/String;

    .line 245
    .line 246
    move-object v12, v1

    .line 247
    goto :goto_8

    .line 248
    :cond_d
    iget-object v1, v0, Lcom/zykj/study/viewmodels/EditCourseViewModel;->e:Landroidx/lifecycle/MutableLiveData;

    .line 249
    .line 250
    goto :goto_7

    .line 251
    :goto_8
    iget-object v1, v0, Lcom/zykj/study/viewmodels/EditCourseViewModel;->g:Landroidx/lifecycle/MutableLiveData;

    .line 252
    .line 253
    invoke-virtual {v1}, Landroidx/lifecycle/LiveData;->getValue()Ljava/lang/Object;

    .line 254
    .line 255
    .line 256
    move-result-object v1

    .line 257
    move-object v13, v1

    .line 258
    check-cast v13, Ljava/lang/String;

    .line 259
    .line 260
    iget-object v1, v0, Lcom/zykj/study/viewmodels/EditCourseViewModel;->h:Landroidx/lifecycle/MutableLiveData;

    .line 261
    .line 262
    invoke-virtual {v1}, Landroidx/lifecycle/LiveData;->getValue()Ljava/lang/Object;

    .line 263
    .line 264
    .line 265
    move-result-object v1

    .line 266
    move-object v14, v1

    .line 267
    check-cast v14, Ljava/lang/String;

    .line 268
    .line 269
    iget-object v1, v0, Lcom/zykj/study/viewmodels/EditCourseViewModel;->i:Landroidx/lifecycle/MutableLiveData;

    .line 270
    .line 271
    invoke-virtual {v1}, Landroidx/lifecycle/LiveData;->getValue()Ljava/lang/Object;

    .line 272
    .line 273
    .line 274
    move-result-object v1

    .line 275
    check-cast v1, Ljava/lang/Integer;

    .line 276
    .line 277
    if-eqz v1, :cond_e

    .line 278
    .line 279
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 280
    .line 281
    .line 282
    move-result v1

    .line 283
    move v15, v1

    .line 284
    goto :goto_9

    .line 285
    :cond_e
    move v15, v8

    .line 286
    :goto_9
    iget-object v1, v0, Lcom/zykj/study/viewmodels/EditCourseViewModel;->j:Landroidx/lifecycle/MutableLiveData;

    .line 287
    .line 288
    invoke-virtual {v1}, Landroidx/lifecycle/LiveData;->getValue()Ljava/lang/Object;

    .line 289
    .line 290
    .line 291
    move-result-object v1

    .line 292
    check-cast v1, Ljava/lang/Integer;

    .line 293
    .line 294
    if-eqz v1, :cond_f

    .line 295
    .line 296
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 297
    .line 298
    .line 299
    move-result v1

    .line 300
    move/from16 v16, v1

    .line 301
    .line 302
    goto :goto_a

    .line 303
    :cond_f
    move/from16 v16, v8

    .line 304
    .line 305
    :goto_a
    iget-object v1, v0, Lcom/zykj/study/viewmodels/EditCourseViewModel;->k:Landroidx/lifecycle/MutableLiveData;

    .line 306
    .line 307
    invoke-virtual {v1}, Landroidx/lifecycle/LiveData;->getValue()Ljava/lang/Object;

    .line 308
    .line 309
    .line 310
    move-result-object v1

    .line 311
    check-cast v1, Ljava/lang/Integer;

    .line 312
    .line 313
    if-eqz v1, :cond_10

    .line 314
    .line 315
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 316
    .line 317
    .line 318
    move-result v1

    .line 319
    move/from16 v17, v1

    .line 320
    .line 321
    goto :goto_b

    .line 322
    :cond_10
    move/from16 v17, v8

    .line 323
    .line 324
    :goto_b
    iget-object v1, v0, Lcom/zykj/study/viewmodels/EditCourseViewModel;->l:Landroidx/lifecycle/MutableLiveData;

    .line 325
    .line 326
    invoke-virtual {v1}, Landroidx/lifecycle/LiveData;->getValue()Ljava/lang/Object;

    .line 327
    .line 328
    .line 329
    move-result-object v1

    .line 330
    check-cast v1, Ljava/lang/Integer;

    .line 331
    .line 332
    if-eqz v1, :cond_11

    .line 333
    .line 334
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 335
    .line 336
    .line 337
    move-result v1

    .line 338
    move/from16 v18, v1

    .line 339
    .line 340
    goto :goto_c

    .line 341
    :cond_11
    move/from16 v18, v8

    .line 342
    .line 343
    :goto_c
    iget-object v1, v0, Lcom/zykj/study/viewmodels/EditCourseViewModel;->m:Landroidx/lifecycle/MutableLiveData;

    .line 344
    .line 345
    invoke-virtual {v1}, Landroidx/lifecycle/LiveData;->getValue()Ljava/lang/Object;

    .line 346
    .line 347
    .line 348
    move-result-object v1

    .line 349
    check-cast v1, Ljava/lang/Integer;

    .line 350
    .line 351
    if-eqz v1, :cond_12

    .line 352
    .line 353
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 354
    .line 355
    .line 356
    move-result v1

    .line 357
    move/from16 v19, v1

    .line 358
    .line 359
    goto :goto_d

    .line 360
    :cond_12
    move/from16 v19, v8

    .line 361
    .line 362
    :goto_d
    iget-object v1, v0, Lcom/zykj/study/viewmodels/EditCourseViewModel;->p:Landroidx/lifecycle/MutableLiveData;

    .line 363
    .line 364
    invoke-virtual {v1}, Landroidx/lifecycle/LiveData;->getValue()Ljava/lang/Object;

    .line 365
    .line 366
    .line 367
    move-result-object v1

    .line 368
    check-cast v1, Ljava/lang/Boolean;

    .line 369
    .line 370
    if-eqz v1, :cond_13

    .line 371
    .line 372
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 373
    .line 374
    .line 375
    move-result v6

    .line 376
    :cond_13
    move/from16 v20, v6

    .line 377
    .line 378
    iget-object v1, v0, Lcom/zykj/study/viewmodels/EditCourseViewModel;->o:Landroidx/lifecycle/MutableLiveData;

    .line 379
    .line 380
    invoke-virtual {v1}, Landroidx/lifecycle/LiveData;->getValue()Ljava/lang/Object;

    .line 381
    .line 382
    .line 383
    move-result-object v1

    .line 384
    check-cast v1, Ljava/lang/Boolean;

    .line 385
    .line 386
    if-eqz v1, :cond_14

    .line 387
    .line 388
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 389
    .line 390
    .line 391
    move-result v8

    .line 392
    :cond_14
    move/from16 v21, v8

    .line 393
    .line 394
    iget-object v1, v0, Lcom/zykj/study/viewmodels/EditCourseViewModel;->n:Landroidx/lifecycle/MutableLiveData;

    .line 395
    .line 396
    invoke-virtual {v1}, Landroidx/lifecycle/LiveData;->getValue()Ljava/lang/Object;

    .line 397
    .line 398
    .line 399
    move-result-object v1

    .line 400
    check-cast v1, Lcom/zykj/study/bean/course/CourseType;

    .line 401
    .line 402
    if-nez v1, :cond_15

    .line 403
    .line 404
    sget-object v1, Lcom/zykj/study/bean/course/CourseType;->UNDERCARRIAGE:Lcom/zykj/study/bean/course/CourseType;

    .line 405
    .line 406
    :cond_15
    move-object/from16 v22, v1

    .line 407
    .line 408
    new-instance v23, Ljava/util/Date;

    .line 409
    .line 410
    invoke-direct/range {v23 .. v23}, Ljava/util/Date;-><init>()V

    .line 411
    .line 412
    .line 413
    new-instance v9, Lcom/zykj/study/data/MyCourseEntity;

    .line 414
    .line 415
    const/16 v24, 0x0

    .line 416
    .line 417
    const/16 v25, 0x4000

    .line 418
    .line 419
    const/16 v26, 0x0

    .line 420
    .line 421
    invoke-direct/range {v9 .. v26}, Lcom/zykj/study/data/MyCourseEntity;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IIIIIZZLcom/zykj/study/bean/course/CourseType;Ljava/util/Date;IILkotlin/jvm/internal/n;)V

    .line 422
    .line 423
    .line 424
    invoke-virtual {v0}, Lcom/zykj/base/BaseViewModel;->getToastLiveData()Lcom/kunminx/architecture/ui/callback/UnPeekLiveData;

    .line 425
    .line 426
    .line 427
    move-result-object v1

    .line 428
    invoke-virtual {v0}, Lcom/zykj/base/BaseViewModel;->isDialogVisible()Lcom/kunminx/architecture/ui/callback/UnPeekLiveData;

    .line 429
    .line 430
    .line 431
    move-result-object v4

    .line 432
    new-instance v6, Lcom/zykj/study/viewmodels/EditCourseViewModel$uploadMyCourse$2;

    .line 433
    .line 434
    invoke-direct {v6, v9, v0, v7}, Lcom/zykj/study/viewmodels/EditCourseViewModel$uploadMyCourse$2;-><init>(Lcom/zykj/study/data/MyCourseEntity;Lcom/zykj/study/viewmodels/EditCourseViewModel;Lm7/c;)V

    .line 435
    .line 436
    .line 437
    invoke-static {v9}, Lo7/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 438
    .line 439
    .line 440
    move-result-object v7

    .line 441
    iput-object v7, v2, Lcom/zykj/study/viewmodels/EditCourseViewModel$uploadMyCourse$1;->b:Ljava/lang/Object;

    .line 442
    .line 443
    iput v5, v2, Lcom/zykj/study/viewmodels/EditCourseViewModel$uploadMyCourse$1;->e:I

    .line 444
    .line 445
    invoke-virtual {v0, v1, v4, v6, v2}, Lcom/zykj/base/BaseViewModel;->launchAsyncData(Lcom/kunminx/architecture/ui/callback/UnPeekLiveData;Lcom/kunminx/architecture/ui/callback/UnPeekLiveData;Lx7/p;Lm7/c;)Ljava/lang/Object;

    .line 446
    .line 447
    .line 448
    move-result-object v1

    .line 449
    if-ne v1, v3, :cond_16

    .line 450
    .line 451
    :goto_e
    return-object v3

    .line 452
    :cond_16
    return-object v1

    .line 453
    :cond_17
    :goto_f
    invoke-virtual {v0}, Lcom/zykj/base/BaseViewModel;->getToastLiveData()Lcom/kunminx/architecture/ui/callback/UnPeekLiveData;

    .line 454
    .line 455
    .line 456
    move-result-object v1

    .line 457
    new-instance v2, Lcom/zykj/base/bean/toast/ToastWarnMessage;

    .line 458
    .line 459
    sget v3, Lcom/zykj/study/R$string;->please_input_course_title:I

    .line 460
    .line 461
    invoke-static {v3}, Lo7/a;->c(I)Ljava/lang/Integer;

    .line 462
    .line 463
    .line 464
    move-result-object v3

    .line 465
    invoke-direct {v2, v7, v3, v6, v7}, Lcom/zykj/base/bean/toast/ToastWarnMessage;-><init>(Ljava/lang/String;Ljava/lang/Integer;ILkotlin/jvm/internal/n;)V

    .line 466
    .line 467
    .line 468
    invoke-virtual {v1, v2}, Lcom/kunminx/architecture/ui/callback/UnPeekLiveData;->postValue(Ljava/lang/Object;)V

    .line 469
    .line 470
    .line 471
    invoke-static {v8}, Lo7/a;->a(Z)Ljava/lang/Boolean;

    .line 472
    .line 473
    .line 474
    move-result-object v1

    .line 475
    return-object v1
.end method
