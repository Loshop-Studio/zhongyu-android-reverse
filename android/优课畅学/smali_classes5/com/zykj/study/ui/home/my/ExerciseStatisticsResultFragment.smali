.class public final Lcom/zykj/study/ui/home/my/ExerciseStatisticsResultFragment;
.super Lcom/zykj/study/ui/home/my/Hilt_ExerciseStatisticsResultFragment;
.source "SourceFile"


# annotations
.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x0
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/zykj/study/ui/home/my/Hilt_ExerciseStatisticsResultFragment<",
        "Lcom/zykj/study/databinding/FragmentExerciseStatisticsResultBinding;",
        ">;"
    }
.end annotation


# instance fields
.field public final f:Lh7/d;

.field public final g:Lcom/zykj/study/adapter/StudentAchievementAdapter;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 4

    .line 1
    invoke-direct {p0}, Lcom/zykj/study/ui/home/my/Hilt_ExerciseStatisticsResultFragment;-><init>()V

    .line 2
    .line 3
    .line 4
    const-class v0, Lcom/zykj/study/viewmodels/ExerciseStatisticsViewModel;

    .line 5
    .line 6
    invoke-static {v0}, Lkotlin/jvm/internal/y;->b(Ljava/lang/Class;)Le8/c;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    new-instance v1, Lcom/zykj/study/ui/home/my/ExerciseStatisticsResultFragment$special$$inlined$activityViewModels$default$1;

    .line 11
    .line 12
    invoke-direct {v1, p0}, Lcom/zykj/study/ui/home/my/ExerciseStatisticsResultFragment$special$$inlined$activityViewModels$default$1;-><init>(Landroidx/fragment/app/Fragment;)V

    .line 13
    .line 14
    .line 15
    new-instance v2, Lcom/zykj/study/ui/home/my/ExerciseStatisticsResultFragment$special$$inlined$activityViewModels$default$2;

    .line 16
    .line 17
    const/4 v3, 0x0

    .line 18
    invoke-direct {v2, v3, p0}, Lcom/zykj/study/ui/home/my/ExerciseStatisticsResultFragment$special$$inlined$activityViewModels$default$2;-><init>(Lx7/a;Landroidx/fragment/app/Fragment;)V

    .line 19
    .line 20
    .line 21
    new-instance v3, Lcom/zykj/study/ui/home/my/ExerciseStatisticsResultFragment$special$$inlined$activityViewModels$default$3;

    .line 22
    .line 23
    invoke-direct {v3, p0}, Lcom/zykj/study/ui/home/my/ExerciseStatisticsResultFragment$special$$inlined$activityViewModels$default$3;-><init>(Landroidx/fragment/app/Fragment;)V

    .line 24
    .line 25
    .line 26
    invoke-static {p0, v0, v1, v2, v3}, Landroidx/fragment/app/FragmentViewModelLazyKt;->createViewModelLazy(Landroidx/fragment/app/Fragment;Le8/c;Lx7/a;Lx7/a;Lx7/a;)Lh7/d;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    iput-object v0, p0, Lcom/zykj/study/ui/home/my/ExerciseStatisticsResultFragment;->f:Lh7/d;

    .line 31
    .line 32
    new-instance v0, Lcom/zykj/study/adapter/StudentAchievementAdapter;

    .line 33
    .line 34
    new-instance v1, Lb5/j1;

    .line 35
    .line 36
    invoke-direct {v1, p0}, Lb5/j1;-><init>(Lcom/zykj/study/ui/home/my/ExerciseStatisticsResultFragment;)V

    .line 37
    .line 38
    .line 39
    invoke-direct {v0, v1}, Lcom/zykj/study/adapter/StudentAchievementAdapter;-><init>(Lx7/p;)V

    .line 40
    .line 41
    .line 42
    iput-object v0, p0, Lcom/zykj/study/ui/home/my/ExerciseStatisticsResultFragment;->g:Lcom/zykj/study/adapter/StudentAchievementAdapter;

    .line 43
    .line 44
    return-void
.end method

.method public static synthetic g(Lcom/zykj/study/ui/home/my/ExerciseStatisticsResultFragment;ILjava/lang/String;)Lh7/p;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lcom/zykj/study/ui/home/my/ExerciseStatisticsResultFragment;->i(Lcom/zykj/study/ui/home/my/ExerciseStatisticsResultFragment;ILjava/lang/String;)Lh7/p;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic h(Lcom/zykj/study/ui/home/my/ExerciseStatisticsResultFragment;Lcom/zykj/study/bean/teach/SuperviseGroup;)Lh7/p;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/zykj/study/ui/home/my/ExerciseStatisticsResultFragment;->k(Lcom/zykj/study/ui/home/my/ExerciseStatisticsResultFragment;Lcom/zykj/study/bean/teach/SuperviseGroup;)Lh7/p;

    move-result-object p0

    return-object p0
.end method

.method public static final i(Lcom/zykj/study/ui/home/my/ExerciseStatisticsResultFragment;ILjava/lang/String;)Lh7/p;
    .locals 7

    .line 1
    const-string v0, "userId"

    .line 2
    .line 3
    invoke-static {p2, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Lcom/zykj/study/ui/home/my/ExerciseStatisticsResultFragment;->j()Lcom/zykj/study/viewmodels/ExerciseStatisticsViewModel;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    invoke-virtual {v1}, Lcom/zykj/study/viewmodels/ExerciseStatisticsViewModel;->l()Landroidx/lifecycle/MutableLiveData;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    invoke-virtual {v1}, Landroidx/lifecycle/LiveData;->getValue()Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    check-cast v1, Lcom/zykj/study/bean/teach/SuperviseGroup;

    .line 19
    .line 20
    if-eqz v1, :cond_7

    .line 21
    .line 22
    new-instance v2, Ljava/util/ArrayList;

    .line 23
    .line 24
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 25
    .line 26
    .line 27
    invoke-virtual {v1}, Lcom/zykj/study/bean/teach/SuperviseGroup;->getMemberList()Ljava/util/List;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    new-instance v3, Ljava/util/ArrayList;

    .line 32
    .line 33
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 34
    .line 35
    .line 36
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 37
    .line 38
    .line 39
    move-result-object v1

    .line 40
    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 41
    .line 42
    .line 43
    move-result v4

    .line 44
    if-eqz v4, :cond_1

    .line 45
    .line 46
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    move-result-object v4

    .line 50
    move-object v5, v4

    .line 51
    check-cast v5, Lcom/zykj/study/bean/teach/SuperviseGroupMember;

    .line 52
    .line 53
    invoke-virtual {v5}, Lcom/zykj/study/bean/teach/SuperviseGroupMember;->getStatus()Lcom/zykj/study/bean/exercise/ExerciseType;

    .line 54
    .line 55
    .line 56
    move-result-object v5

    .line 57
    sget-object v6, Lcom/zykj/study/bean/exercise/ExerciseType;->COMPLETED:Lcom/zykj/study/bean/exercise/ExerciseType;

    .line 58
    .line 59
    if-ne v5, v6, :cond_0

    .line 60
    .line 61
    invoke-interface {v3, v4}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 62
    .line 63
    .line 64
    goto :goto_0

    .line 65
    :cond_1
    invoke-interface {v2, v3}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 66
    .line 67
    .line 68
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 69
    .line 70
    .line 71
    move-result-object v1

    .line 72
    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 73
    .line 74
    .line 75
    move-result v2

    .line 76
    if-eqz v2, :cond_2

    .line 77
    .line 78
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 79
    .line 80
    .line 81
    move-result-object v2

    .line 82
    check-cast v2, Lcom/zykj/study/bean/teach/SuperviseGroupMember;

    .line 83
    .line 84
    invoke-direct {p0}, Lcom/zykj/study/ui/home/my/ExerciseStatisticsResultFragment;->j()Lcom/zykj/study/viewmodels/ExerciseStatisticsViewModel;

    .line 85
    .line 86
    .line 87
    move-result-object v3

    .line 88
    invoke-virtual {v3}, Lcom/zykj/study/viewmodels/ExerciseStatisticsViewModel;->t()Ljava/util/List;

    .line 89
    .line 90
    .line 91
    move-result-object v3

    .line 92
    new-instance v4, Lcom/zykj/study/bean/teach/Member;

    .line 93
    .line 94
    invoke-virtual {v2}, Lcom/zykj/study/bean/teach/SuperviseGroupMember;->getUserId()Ljava/lang/String;

    .line 95
    .line 96
    .line 97
    move-result-object v5

    .line 98
    invoke-virtual {v2}, Lcom/zykj/study/bean/teach/SuperviseGroupMember;->getUserName()Ljava/lang/String;

    .line 99
    .line 100
    .line 101
    move-result-object v6

    .line 102
    invoke-virtual {v2}, Lcom/zykj/study/bean/teach/SuperviseGroupMember;->getGroupId()I

    .line 103
    .line 104
    .line 105
    move-result v2

    .line 106
    invoke-direct {v4, v5, v6, v2}, Lcom/zykj/study/bean/teach/Member;-><init>(Ljava/lang/String;Ljava/lang/String;I)V

    .line 107
    .line 108
    .line 109
    invoke-interface {v3, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 110
    .line 111
    .line 112
    goto :goto_1

    .line 113
    :cond_2
    invoke-direct {p0}, Lcom/zykj/study/ui/home/my/ExerciseStatisticsResultFragment;->j()Lcom/zykj/study/viewmodels/ExerciseStatisticsViewModel;

    .line 114
    .line 115
    .line 116
    move-result-object v1

    .line 117
    invoke-virtual {v1}, Lcom/zykj/study/viewmodels/ExerciseStatisticsViewModel;->t()Ljava/util/List;

    .line 118
    .line 119
    .line 120
    move-result-object v1

    .line 121
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 122
    .line 123
    .line 124
    move-result-object v1

    .line 125
    :cond_3
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 126
    .line 127
    .line 128
    move-result v2

    .line 129
    const/4 v3, 0x0

    .line 130
    if-eqz v2, :cond_4

    .line 131
    .line 132
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 133
    .line 134
    .line 135
    move-result-object v2

    .line 136
    move-object v4, v2

    .line 137
    check-cast v4, Lcom/zykj/study/bean/teach/Member;

    .line 138
    .line 139
    invoke-virtual {v4}, Lcom/zykj/study/bean/teach/Member;->getGroupId()I

    .line 140
    .line 141
    .line 142
    move-result v5

    .line 143
    if-ne v5, p1, :cond_3

    .line 144
    .line 145
    invoke-virtual {v4}, Lcom/zykj/study/bean/teach/Member;->getUserId()Ljava/lang/String;

    .line 146
    .line 147
    .line 148
    move-result-object v4

    .line 149
    invoke-static {v4, p2}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 150
    .line 151
    .line 152
    move-result v4

    .line 153
    if-eqz v4, :cond_3

    .line 154
    .line 155
    goto :goto_2

    .line 156
    :cond_4
    move-object v2, v3

    .line 157
    :goto_2
    check-cast v2, Lcom/zykj/study/bean/teach/Member;

    .line 158
    .line 159
    if-eqz v2, :cond_5

    .line 160
    .line 161
    invoke-direct {p0}, Lcom/zykj/study/ui/home/my/ExerciseStatisticsResultFragment;->j()Lcom/zykj/study/viewmodels/ExerciseStatisticsViewModel;

    .line 162
    .line 163
    .line 164
    move-result-object p1

    .line 165
    invoke-virtual {p1, v2}, Lcom/zykj/study/viewmodels/ExerciseStatisticsViewModel;->B(Lcom/zykj/study/bean/teach/Member;)V

    .line 166
    .line 167
    .line 168
    :cond_5
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->requireParentFragment()Landroidx/fragment/app/Fragment;

    .line 169
    .line 170
    .line 171
    move-result-object p1

    .line 172
    const-string v1, "requireParentFragment(...)"

    .line 173
    .line 174
    invoke-static {p1, v1}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 175
    .line 176
    .line 177
    invoke-static {p1}, Landroidx/navigation/fragment/FragmentKt;->findNavController(Landroidx/fragment/app/Fragment;)Landroidx/navigation/NavController;

    .line 178
    .line 179
    .line 180
    move-result-object p1

    .line 181
    sget v1, Lcom/zykj/study/R$id;->studentExercisesFragment:I

    .line 182
    .line 183
    invoke-direct {p0}, Lcom/zykj/study/ui/home/my/ExerciseStatisticsResultFragment;->j()Lcom/zykj/study/viewmodels/ExerciseStatisticsViewModel;

    .line 184
    .line 185
    .line 186
    move-result-object v2

    .line 187
    invoke-virtual {v2}, Lcom/zykj/study/viewmodels/ExerciseStatisticsViewModel;->u()I

    .line 188
    .line 189
    .line 190
    move-result v2

    .line 191
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 192
    .line 193
    .line 194
    move-result-object v2

    .line 195
    const-string v4, "superviseId"

    .line 196
    .line 197
    invoke-static {v4, v2}, Lh7/f;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 198
    .line 199
    .line 200
    move-result-object v2

    .line 201
    invoke-direct {p0}, Lcom/zykj/study/ui/home/my/ExerciseStatisticsResultFragment;->j()Lcom/zykj/study/viewmodels/ExerciseStatisticsViewModel;

    .line 202
    .line 203
    .line 204
    move-result-object v4

    .line 205
    invoke-virtual {v4}, Lcom/zykj/study/viewmodels/ExerciseStatisticsViewModel;->p()Landroidx/lifecycle/MutableLiveData;

    .line 206
    .line 207
    .line 208
    move-result-object v4

    .line 209
    invoke-virtual {v4}, Landroidx/lifecycle/LiveData;->getValue()Ljava/lang/Object;

    .line 210
    .line 211
    .line 212
    move-result-object v4

    .line 213
    check-cast v4, Lcom/zykj/study/bean/teach/QuizScore;

    .line 214
    .line 215
    if-eqz v4, :cond_6

    .line 216
    .line 217
    invoke-virtual {v4}, Lcom/zykj/study/bean/teach/QuizScore;->getTitle()Ljava/lang/String;

    .line 218
    .line 219
    .line 220
    move-result-object v3

    .line 221
    :cond_6
    const-string v4, "title"

    .line 222
    .line 223
    invoke-static {v4, v3}, Lh7/f;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 224
    .line 225
    .line 226
    move-result-object v3

    .line 227
    invoke-direct {p0}, Lcom/zykj/study/ui/home/my/ExerciseStatisticsResultFragment;->j()Lcom/zykj/study/viewmodels/ExerciseStatisticsViewModel;

    .line 228
    .line 229
    .line 230
    move-result-object p0

    .line 231
    invoke-virtual {p0}, Lcom/zykj/study/viewmodels/ExerciseStatisticsViewModel;->g()I

    .line 232
    .line 233
    .line 234
    move-result p0

    .line 235
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 236
    .line 237
    .line 238
    move-result-object p0

    .line 239
    const-string v4, "catalogId"

    .line 240
    .line 241
    invoke-static {v4, p0}, Lh7/f;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 242
    .line 243
    .line 244
    move-result-object p0

    .line 245
    invoke-static {v0, p2}, Lh7/f;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 246
    .line 247
    .line 248
    move-result-object p2

    .line 249
    const-string v0, "fromScore"

    .line 250
    .line 251
    sget-object v4, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 252
    .line 253
    invoke-static {v0, v4}, Lh7/f;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 254
    .line 255
    .line 256
    move-result-object v0

    .line 257
    filled-new-array {v2, v3, p0, p2, v0}, [Lkotlin/Pair;

    .line 258
    .line 259
    .line 260
    move-result-object p0

    .line 261
    invoke-static {p0}, Landroidx/core/os/BundleKt;->bundleOf([Lkotlin/Pair;)Landroid/os/Bundle;

    .line 262
    .line 263
    .line 264
    move-result-object p0

    .line 265
    invoke-virtual {p1, v1, p0}, Landroidx/navigation/NavController;->navigate(ILandroid/os/Bundle;)V

    .line 266
    .line 267
    .line 268
    :cond_7
    sget-object p0, Lh7/p;->a:Lh7/p;

    .line 269
    .line 270
    return-object p0
.end method

.method private final j()Lcom/zykj/study/viewmodels/ExerciseStatisticsViewModel;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/study/ui/home/my/ExerciseStatisticsResultFragment;->f:Lh7/d;

    .line 2
    .line 3
    invoke-interface {v0}, Lh7/d;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lcom/zykj/study/viewmodels/ExerciseStatisticsViewModel;

    .line 8
    .line 9
    return-object v0
.end method

.method public static final k(Lcom/zykj/study/ui/home/my/ExerciseStatisticsResultFragment;Lcom/zykj/study/bean/teach/SuperviseGroup;)Lh7/p;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/zykj/base/BaseFragment;->getMBindView()Landroidx/databinding/ViewDataBinding;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    check-cast v0, Lcom/zykj/study/databinding/FragmentExerciseStatisticsResultBinding;

    .line 6
    .line 7
    invoke-virtual {v0, p1}, Lcom/zykj/study/databinding/FragmentExerciseStatisticsResultBinding;->setGroup(Lcom/zykj/study/bean/teach/SuperviseGroup;)V

    .line 8
    .line 9
    .line 10
    invoke-virtual {p1}, Lcom/zykj/study/bean/teach/SuperviseGroup;->getMemberList()Ljava/util/List;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    if-eqz v0, :cond_0

    .line 19
    .line 20
    invoke-virtual {p0}, Lcom/zykj/base/BaseFragment;->getMBindView()Landroidx/databinding/ViewDataBinding;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    check-cast p0, Lcom/zykj/study/databinding/FragmentExerciseStatisticsResultBinding;

    .line 25
    .line 26
    iget-object p0, p0, Lcom/zykj/study/databinding/FragmentExerciseStatisticsResultBinding;->multipleStatusView:Lcom/zykj/study/view/MultipleStatusView;

    .line 27
    .line 28
    sget p1, Lcom/zykj/study/R$layout;->layout_status_supervise_group_no_member:I

    .line 29
    .line 30
    invoke-virtual {p0, p1}, Lcom/zykj/study/view/MultipleStatusView;->d(I)V

    .line 31
    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_0
    invoke-virtual {p0}, Lcom/zykj/base/BaseFragment;->getMBindView()Landroidx/databinding/ViewDataBinding;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    check-cast v0, Lcom/zykj/study/databinding/FragmentExerciseStatisticsResultBinding;

    .line 39
    .line 40
    iget-object v0, v0, Lcom/zykj/study/databinding/FragmentExerciseStatisticsResultBinding;->multipleStatusView:Lcom/zykj/study/view/MultipleStatusView;

    .line 41
    .line 42
    invoke-virtual {v0}, Lcom/zykj/study/view/MultipleStatusView;->f()V

    .line 43
    .line 44
    .line 45
    iget-object p0, p0, Lcom/zykj/study/ui/home/my/ExerciseStatisticsResultFragment;->g:Lcom/zykj/study/adapter/StudentAchievementAdapter;

    .line 46
    .line 47
    invoke-virtual {p1}, Lcom/zykj/study/bean/teach/SuperviseGroup;->getMemberList()Ljava/util/List;

    .line 48
    .line 49
    .line 50
    move-result-object p1

    .line 51
    invoke-virtual {p0, p1}, Lcom/zykj/study/adapter/StudentAchievementAdapter;->g(Ljava/util/List;)V

    .line 52
    .line 53
    .line 54
    :goto_0
    sget-object p0, Lh7/p;->a:Lh7/p;

    .line 55
    .line 56
    return-object p0
.end method


# virtual methods
.method public initView(Landroid/os/Bundle;Lm7/c;)Ljava/lang/Object;
    .locals 2

    .line 1
    invoke-virtual {p0}, Lcom/zykj/base/BaseFragment;->getMBindView()Landroidx/databinding/ViewDataBinding;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    check-cast p1, Lcom/zykj/study/databinding/FragmentExerciseStatisticsResultBinding;

    .line 6
    .line 7
    iget-object p1, p1, Lcom/zykj/study/databinding/FragmentExerciseStatisticsResultBinding;->recycler:Landroidx/recyclerview/widget/RecyclerView;

    .line 8
    .line 9
    iget-object p2, p0, Lcom/zykj/study/ui/home/my/ExerciseStatisticsResultFragment;->g:Lcom/zykj/study/adapter/StudentAchievementAdapter;

    .line 10
    .line 11
    invoke-virtual {p1, p2}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(Landroidx/recyclerview/widget/RecyclerView$Adapter;)V

    .line 12
    .line 13
    .line 14
    invoke-direct {p0}, Lcom/zykj/study/ui/home/my/ExerciseStatisticsResultFragment;->j()Lcom/zykj/study/viewmodels/ExerciseStatisticsViewModel;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    invoke-virtual {p1}, Lcom/zykj/study/viewmodels/ExerciseStatisticsViewModel;->l()Landroidx/lifecycle/MutableLiveData;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getViewLifecycleOwner()Landroidx/lifecycle/LifecycleOwner;

    .line 23
    .line 24
    .line 25
    move-result-object p2

    .line 26
    new-instance v0, Lb5/i1;

    .line 27
    .line 28
    invoke-direct {v0, p0}, Lb5/i1;-><init>(Lcom/zykj/study/ui/home/my/ExerciseStatisticsResultFragment;)V

    .line 29
    .line 30
    .line 31
    new-instance v1, Lcom/zykj/study/ui/home/my/ExerciseStatisticsResultFragment$a;

    .line 32
    .line 33
    invoke-direct {v1, v0}, Lcom/zykj/study/ui/home/my/ExerciseStatisticsResultFragment$a;-><init>(Lx7/l;)V

    .line 34
    .line 35
    .line 36
    invoke-virtual {p1, p2, v1}, Landroidx/lifecycle/LiveData;->observe(Landroidx/lifecycle/LifecycleOwner;Landroidx/lifecycle/Observer;)V

    .line 37
    .line 38
    .line 39
    sget-object p1, Lh7/p;->a:Lh7/p;

    .line 40
    .line 41
    return-object p1
.end method

.method public layoutId()I
    .locals 1

    .line 1
    sget v0, Lcom/zykj/study/R$layout;->fragment_exercise_statistics_result:I

    .line 2
    .line 3
    return v0
.end method
