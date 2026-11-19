.class public final Lcom/zykj/study/ui/home/find/CourseDetailsFragment;
.super Lcom/zykj/study/ui/home/find/Hilt_CourseDetailsFragment;
.source "SourceFile"


# annotations
.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x0
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/zykj/study/ui/home/find/CourseDetailsFragment$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/zykj/study/ui/home/find/Hilt_CourseDetailsFragment<",
        "Lcom/zykj/study/databinding/FragmentCourseDetailsBinding;",
        ">;"
    }
.end annotation


# instance fields
.field public final f:Landroidx/navigation/NavArgsLazy;

.field public final g:Lh7/d;

.field public final h:Lh7/d;

.field public i:Lcom/zykj/study/adapter/CatalogProgressAdapter;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 5

    .line 1
    invoke-direct {p0}, Lcom/zykj/study/ui/home/find/Hilt_CourseDetailsFragment;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Landroidx/navigation/NavArgsLazy;

    .line 5
    .line 6
    const-class v1, Lcom/zykj/study/ui/home/find/CourseDetailsFragmentArgs;

    .line 7
    .line 8
    invoke-static {v1}, Lkotlin/jvm/internal/y;->b(Ljava/lang/Class;)Le8/c;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    new-instance v2, Lcom/zykj/study/ui/home/find/CourseDetailsFragment$c;

    .line 13
    .line 14
    invoke-direct {v2, p0}, Lcom/zykj/study/ui/home/find/CourseDetailsFragment$c;-><init>(Landroidx/fragment/app/Fragment;)V

    .line 15
    .line 16
    .line 17
    invoke-direct {v0, v1, v2}, Landroidx/navigation/NavArgsLazy;-><init>(Le8/c;Lx7/a;)V

    .line 18
    .line 19
    .line 20
    iput-object v0, p0, Lcom/zykj/study/ui/home/find/CourseDetailsFragment;->f:Landroidx/navigation/NavArgsLazy;

    .line 21
    .line 22
    const-class v0, Lcom/zykj/study/viewmodels/DictViewModel;

    .line 23
    .line 24
    invoke-static {v0}, Lkotlin/jvm/internal/y;->b(Ljava/lang/Class;)Le8/c;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    new-instance v1, Lcom/zykj/study/ui/home/find/CourseDetailsFragment$special$$inlined$activityViewModels$default$1;

    .line 29
    .line 30
    invoke-direct {v1, p0}, Lcom/zykj/study/ui/home/find/CourseDetailsFragment$special$$inlined$activityViewModels$default$1;-><init>(Landroidx/fragment/app/Fragment;)V

    .line 31
    .line 32
    .line 33
    new-instance v2, Lcom/zykj/study/ui/home/find/CourseDetailsFragment$special$$inlined$activityViewModels$default$2;

    .line 34
    .line 35
    const/4 v3, 0x0

    .line 36
    invoke-direct {v2, v3, p0}, Lcom/zykj/study/ui/home/find/CourseDetailsFragment$special$$inlined$activityViewModels$default$2;-><init>(Lx7/a;Landroidx/fragment/app/Fragment;)V

    .line 37
    .line 38
    .line 39
    new-instance v4, Lcom/zykj/study/ui/home/find/CourseDetailsFragment$special$$inlined$activityViewModels$default$3;

    .line 40
    .line 41
    invoke-direct {v4, p0}, Lcom/zykj/study/ui/home/find/CourseDetailsFragment$special$$inlined$activityViewModels$default$3;-><init>(Landroidx/fragment/app/Fragment;)V

    .line 42
    .line 43
    .line 44
    invoke-static {p0, v0, v1, v2, v4}, Landroidx/fragment/app/FragmentViewModelLazyKt;->createViewModelLazy(Landroidx/fragment/app/Fragment;Le8/c;Lx7/a;Lx7/a;Lx7/a;)Lh7/d;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    iput-object v0, p0, Lcom/zykj/study/ui/home/find/CourseDetailsFragment;->g:Lh7/d;

    .line 49
    .line 50
    new-instance v0, Lcom/zykj/study/ui/home/find/CourseDetailsFragment$special$$inlined$viewModels$default$1;

    .line 51
    .line 52
    invoke-direct {v0, p0}, Lcom/zykj/study/ui/home/find/CourseDetailsFragment$special$$inlined$viewModels$default$1;-><init>(Landroidx/fragment/app/Fragment;)V

    .line 53
    .line 54
    .line 55
    sget-object v1, Lkotlin/LazyThreadSafetyMode;->c:Lkotlin/LazyThreadSafetyMode;

    .line 56
    .line 57
    new-instance v2, Lcom/zykj/study/ui/home/find/CourseDetailsFragment$special$$inlined$viewModels$default$2;

    .line 58
    .line 59
    invoke-direct {v2, v0}, Lcom/zykj/study/ui/home/find/CourseDetailsFragment$special$$inlined$viewModels$default$2;-><init>(Lx7/a;)V

    .line 60
    .line 61
    .line 62
    invoke-static {v1, v2}, Lkotlin/a;->a(Lkotlin/LazyThreadSafetyMode;Lx7/a;)Lh7/d;

    .line 63
    .line 64
    .line 65
    move-result-object v0

    .line 66
    const-class v1, Lcom/zykj/study/viewmodels/CourseDetailsViewModel;

    .line 67
    .line 68
    invoke-static {v1}, Lkotlin/jvm/internal/y;->b(Ljava/lang/Class;)Le8/c;

    .line 69
    .line 70
    .line 71
    move-result-object v1

    .line 72
    new-instance v2, Lcom/zykj/study/ui/home/find/CourseDetailsFragment$special$$inlined$viewModels$default$3;

    .line 73
    .line 74
    invoke-direct {v2, v0}, Lcom/zykj/study/ui/home/find/CourseDetailsFragment$special$$inlined$viewModels$default$3;-><init>(Lh7/d;)V

    .line 75
    .line 76
    .line 77
    new-instance v4, Lcom/zykj/study/ui/home/find/CourseDetailsFragment$special$$inlined$viewModels$default$4;

    .line 78
    .line 79
    invoke-direct {v4, v3, v0}, Lcom/zykj/study/ui/home/find/CourseDetailsFragment$special$$inlined$viewModels$default$4;-><init>(Lx7/a;Lh7/d;)V

    .line 80
    .line 81
    .line 82
    new-instance v3, Lcom/zykj/study/ui/home/find/CourseDetailsFragment$special$$inlined$viewModels$default$5;

    .line 83
    .line 84
    invoke-direct {v3, p0, v0}, Lcom/zykj/study/ui/home/find/CourseDetailsFragment$special$$inlined$viewModels$default$5;-><init>(Landroidx/fragment/app/Fragment;Lh7/d;)V

    .line 85
    .line 86
    .line 87
    invoke-static {p0, v1, v2, v4, v3}, Landroidx/fragment/app/FragmentViewModelLazyKt;->createViewModelLazy(Landroidx/fragment/app/Fragment;Le8/c;Lx7/a;Lx7/a;Lx7/a;)Lh7/d;

    .line 88
    .line 89
    .line 90
    move-result-object v0

    .line 91
    iput-object v0, p0, Lcom/zykj/study/ui/home/find/CourseDetailsFragment;->h:Lh7/d;

    .line 92
    .line 93
    return-void
.end method

.method public static final A(Lcom/zykj/study/ui/home/find/CourseDetailsFragment;Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;Lcom/xuexiang/xui/widget/dialog/materialdialog/DialogAction;)V
    .locals 1

    .line 1
    const-string v0, "<unused var>"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-static {p2, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 7
    .line 8
    .line 9
    invoke-virtual {p0}, Lcom/zykj/study/ui/home/find/CourseDetailsFragment;->s()Lcom/zykj/study/viewmodels/CourseDetailsViewModel;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    invoke-virtual {p0}, Lcom/zykj/study/viewmodels/CourseDetailsViewModel;->k()V

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method public static final B(Lcom/zykj/study/ui/home/find/CourseDetailsFragment;Lcom/zykj/study/bean/course/CourseDetailsBean;)Lh7/p;
    .locals 4

    .line 1
    invoke-virtual {p1}, Lcom/zykj/study/bean/course/CourseBean;->getStatus()Lcom/zykj/study/bean/course/CourseType;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    sget-object v1, Lcom/zykj/study/ui/home/find/CourseDetailsFragment$a;->a:[I

    .line 6
    .line 7
    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    aget v0, v1, v0

    .line 12
    .line 13
    const/4 v1, -0x1

    .line 14
    const/4 v2, 0x1

    .line 15
    if-eq v0, v2, :cond_3

    .line 16
    .line 17
    const/4 v3, 0x2

    .line 18
    if-eq v0, v3, :cond_1

    .line 19
    .line 20
    const/4 v2, 0x3

    .line 21
    if-ne v0, v2, :cond_0

    .line 22
    .line 23
    invoke-virtual {p0}, Lcom/zykj/base/BaseFragment;->getMBindView()Landroidx/databinding/ViewDataBinding;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    check-cast v0, Lcom/zykj/study/databinding/FragmentCourseDetailsBinding;

    .line 28
    .line 29
    iget-object v0, v0, Lcom/zykj/study/databinding/FragmentCourseDetailsBinding;->courseCatalog:Lcom/zykj/study/databinding/LayoutCourseDetailsCatalogBinding;

    .line 30
    .line 31
    iget-object v0, v0, Lcom/zykj/study/databinding/LayoutCourseDetailsCatalogBinding;->multipleStatusView:Lcom/xuexiang/xui/widget/statelayout/MultipleStatusView;

    .line 32
    .line 33
    sget v2, Lcom/zykj/study/R$layout;->layout_status_course_delete:I

    .line 34
    .line 35
    new-instance v3, Landroid/view/ViewGroup$LayoutParams;

    .line 36
    .line 37
    invoke-direct {v3, v1, v1}, Landroid/view/ViewGroup$LayoutParams;-><init>(II)V

    .line 38
    .line 39
    .line 40
    invoke-virtual {v0, v2, v3}, Lcom/xuexiang/xui/widget/statelayout/MultipleStatusView;->j(ILandroid/view/ViewGroup$LayoutParams;)V

    .line 41
    .line 42
    .line 43
    goto :goto_0

    .line 44
    :cond_0
    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    .line 45
    .line 46
    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    .line 47
    .line 48
    .line 49
    throw p0

    .line 50
    :cond_1
    invoke-virtual {p1}, Lcom/zykj/study/bean/course/CourseDetailsBean;->getCatalogs()Ljava/util/List;

    .line 51
    .line 52
    .line 53
    move-result-object v0

    .line 54
    if-eqz v0, :cond_2

    .line 55
    .line 56
    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    .line 57
    .line 58
    .line 59
    move-result v0

    .line 60
    xor-int/2addr v0, v2

    .line 61
    if-ne v0, v2, :cond_2

    .line 62
    .line 63
    invoke-virtual {p0}, Lcom/zykj/base/BaseFragment;->getMBindView()Landroidx/databinding/ViewDataBinding;

    .line 64
    .line 65
    .line 66
    move-result-object v0

    .line 67
    check-cast v0, Lcom/zykj/study/databinding/FragmentCourseDetailsBinding;

    .line 68
    .line 69
    iget-object v0, v0, Lcom/zykj/study/databinding/FragmentCourseDetailsBinding;->courseCatalog:Lcom/zykj/study/databinding/LayoutCourseDetailsCatalogBinding;

    .line 70
    .line 71
    iget-object v0, v0, Lcom/zykj/study/databinding/LayoutCourseDetailsCatalogBinding;->multipleStatusView:Lcom/xuexiang/xui/widget/statelayout/MultipleStatusView;

    .line 72
    .line 73
    invoke-virtual {v0}, Lcom/xuexiang/xui/widget/statelayout/MultipleStatusView;->d()V

    .line 74
    .line 75
    .line 76
    goto :goto_0

    .line 77
    :cond_2
    invoke-virtual {p0}, Lcom/zykj/base/BaseFragment;->getMBindView()Landroidx/databinding/ViewDataBinding;

    .line 78
    .line 79
    .line 80
    move-result-object v0

    .line 81
    check-cast v0, Lcom/zykj/study/databinding/FragmentCourseDetailsBinding;

    .line 82
    .line 83
    iget-object v0, v0, Lcom/zykj/study/databinding/FragmentCourseDetailsBinding;->courseCatalog:Lcom/zykj/study/databinding/LayoutCourseDetailsCatalogBinding;

    .line 84
    .line 85
    iget-object v0, v0, Lcom/zykj/study/databinding/LayoutCourseDetailsCatalogBinding;->multipleStatusView:Lcom/xuexiang/xui/widget/statelayout/MultipleStatusView;

    .line 86
    .line 87
    invoke-virtual {v0}, Lcom/xuexiang/xui/widget/statelayout/MultipleStatusView;->f()V

    .line 88
    .line 89
    .line 90
    goto :goto_0

    .line 91
    :cond_3
    invoke-virtual {p0}, Lcom/zykj/base/BaseFragment;->getMBindView()Landroidx/databinding/ViewDataBinding;

    .line 92
    .line 93
    .line 94
    move-result-object v0

    .line 95
    check-cast v0, Lcom/zykj/study/databinding/FragmentCourseDetailsBinding;

    .line 96
    .line 97
    iget-object v0, v0, Lcom/zykj/study/databinding/FragmentCourseDetailsBinding;->courseCatalog:Lcom/zykj/study/databinding/LayoutCourseDetailsCatalogBinding;

    .line 98
    .line 99
    iget-object v0, v0, Lcom/zykj/study/databinding/LayoutCourseDetailsCatalogBinding;->multipleStatusView:Lcom/xuexiang/xui/widget/statelayout/MultipleStatusView;

    .line 100
    .line 101
    sget v2, Lcom/zykj/study/R$layout;->layout_status_course_undercarriage:I

    .line 102
    .line 103
    new-instance v3, Landroid/view/ViewGroup$LayoutParams;

    .line 104
    .line 105
    invoke-direct {v3, v1, v1}, Landroid/view/ViewGroup$LayoutParams;-><init>(II)V

    .line 106
    .line 107
    .line 108
    invoke-virtual {v0, v2, v3}, Lcom/xuexiang/xui/widget/statelayout/MultipleStatusView;->j(ILandroid/view/ViewGroup$LayoutParams;)V

    .line 109
    .line 110
    .line 111
    :goto_0
    invoke-virtual {p1}, Lcom/zykj/study/bean/course/CourseDetailsBean;->getCatalogs()Ljava/util/List;

    .line 112
    .line 113
    .line 114
    move-result-object p1

    .line 115
    if-eqz p1, :cond_6

    .line 116
    .line 117
    invoke-virtual {p0}, Lcom/zykj/base/BaseFragment;->getMBindView()Landroidx/databinding/ViewDataBinding;

    .line 118
    .line 119
    .line 120
    move-result-object v0

    .line 121
    check-cast v0, Lcom/zykj/study/databinding/FragmentCourseDetailsBinding;

    .line 122
    .line 123
    iget-object v0, v0, Lcom/zykj/study/databinding/FragmentCourseDetailsBinding;->courseCatalog:Lcom/zykj/study/databinding/LayoutCourseDetailsCatalogBinding;

    .line 124
    .line 125
    iget-object v0, v0, Lcom/zykj/study/databinding/LayoutCourseDetailsCatalogBinding;->recycle:Landroidx/recyclerview/widget/RecyclerView;

    .line 126
    .line 127
    new-instance v1, Lcom/zykj/study/adapter/CatalogAdapter;

    .line 128
    .line 129
    invoke-virtual {p0}, Lcom/zykj/study/ui/home/find/CourseDetailsFragment;->s()Lcom/zykj/study/viewmodels/CourseDetailsViewModel;

    .line 130
    .line 131
    .line 132
    move-result-object v2

    .line 133
    invoke-virtual {v2, p1}, Lcom/zykj/study/viewmodels/CourseDetailsViewModel;->a(Ljava/util/List;)Ljava/util/List;

    .line 134
    .line 135
    .line 136
    move-result-object p1

    .line 137
    invoke-virtual {p0}, Lcom/zykj/study/ui/home/find/CourseDetailsFragment;->s()Lcom/zykj/study/viewmodels/CourseDetailsViewModel;

    .line 138
    .line 139
    .line 140
    move-result-object v2

    .line 141
    invoke-virtual {v2}, Lcom/zykj/study/viewmodels/CourseDetailsViewModel;->f()Ljava/util/HashSet;

    .line 142
    .line 143
    .line 144
    move-result-object v2

    .line 145
    new-instance v3, Ly4/g;

    .line 146
    .line 147
    invoke-direct {v3, v0}, Ly4/g;-><init>(Landroidx/recyclerview/widget/RecyclerView;)V

    .line 148
    .line 149
    .line 150
    invoke-direct {v1, p1, v2, v3}, Lcom/zykj/study/adapter/CatalogAdapter;-><init>(Ljava/util/List;Ljava/util/HashSet;Lx7/l;)V

    .line 151
    .line 152
    .line 153
    sget-object p1, Landroidx/recyclerview/widget/RecyclerView$Adapter$StateRestorationPolicy;->PREVENT_WHEN_EMPTY:Landroidx/recyclerview/widget/RecyclerView$Adapter$StateRestorationPolicy;

    .line 154
    .line 155
    invoke-virtual {v1, p1}, Landroidx/recyclerview/widget/RecyclerView$Adapter;->setStateRestorationPolicy(Landroidx/recyclerview/widget/RecyclerView$Adapter$StateRestorationPolicy;)V

    .line 156
    .line 157
    .line 158
    invoke-virtual {v0, v1}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(Landroidx/recyclerview/widget/RecyclerView$Adapter;)V

    .line 159
    .line 160
    .line 161
    iget-object v0, p0, Lcom/zykj/study/ui/home/find/CourseDetailsFragment;->i:Lcom/zykj/study/adapter/CatalogProgressAdapter;

    .line 162
    .line 163
    if-eqz v0, :cond_5

    .line 164
    .line 165
    invoke-virtual {p0}, Lcom/zykj/study/ui/home/find/CourseDetailsFragment;->s()Lcom/zykj/study/viewmodels/CourseDetailsViewModel;

    .line 166
    .line 167
    .line 168
    move-result-object v1

    .line 169
    invoke-virtual {p0}, Lcom/zykj/study/ui/home/find/CourseDetailsFragment;->s()Lcom/zykj/study/viewmodels/CourseDetailsViewModel;

    .line 170
    .line 171
    .line 172
    move-result-object v2

    .line 173
    invoke-virtual {v2}, Lcom/zykj/study/viewmodels/CourseDetailsViewModel;->b()Landroidx/lifecycle/MutableLiveData;

    .line 174
    .line 175
    .line 176
    move-result-object v2

    .line 177
    invoke-virtual {v2}, Landroidx/lifecycle/LiveData;->getValue()Ljava/lang/Object;

    .line 178
    .line 179
    .line 180
    move-result-object v2

    .line 181
    check-cast v2, Lcom/zykj/study/bean/course/CourseDetailsBean;

    .line 182
    .line 183
    if-eqz v2, :cond_4

    .line 184
    .line 185
    invoke-virtual {v2}, Lcom/zykj/study/bean/course/CourseDetailsBean;->getCatalogs()Ljava/util/List;

    .line 186
    .line 187
    .line 188
    move-result-object v2

    .line 189
    goto :goto_1

    .line 190
    :cond_4
    const/4 v2, 0x0

    .line 191
    :goto_1
    invoke-virtual {v1, v2}, Lcom/zykj/study/viewmodels/CourseDetailsViewModel;->a(Ljava/util/List;)Ljava/util/List;

    .line 192
    .line 193
    .line 194
    move-result-object v1

    .line 195
    invoke-virtual {v0, v1}, Lcom/zykj/study/adapter/CatalogProgressAdapter;->g(Ljava/util/List;)V

    .line 196
    .line 197
    .line 198
    :cond_5
    invoke-virtual {p0}, Lcom/zykj/base/BaseFragment;->getMBindView()Landroidx/databinding/ViewDataBinding;

    .line 199
    .line 200
    .line 201
    move-result-object p0

    .line 202
    check-cast p0, Lcom/zykj/study/databinding/FragmentCourseDetailsBinding;

    .line 203
    .line 204
    iget-object p0, p0, Lcom/zykj/study/databinding/FragmentCourseDetailsBinding;->courseCatalog:Lcom/zykj/study/databinding/LayoutCourseDetailsCatalogBinding;

    .line 205
    .line 206
    iget-object p0, p0, Lcom/zykj/study/databinding/LayoutCourseDetailsCatalogBinding;->recycleProgress:Landroidx/recyclerview/widget/RecyclerView;

    .line 207
    .line 208
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView;->getAdapter()Landroidx/recyclerview/widget/RecyclerView$Adapter;

    .line 209
    .line 210
    .line 211
    move-result-object p0

    .line 212
    if-eqz p0, :cond_6

    .line 213
    .line 214
    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/RecyclerView$Adapter;->setStateRestorationPolicy(Landroidx/recyclerview/widget/RecyclerView$Adapter$StateRestorationPolicy;)V

    .line 215
    .line 216
    .line 217
    :cond_6
    sget-object p0, Lh7/p;->a:Lh7/p;

    .line 218
    .line 219
    return-object p0
.end method

.method public static final C(Landroidx/recyclerview/widget/RecyclerView;Lcom/zykj/study/bean/course/CatalogBean;)Lh7/p;
    .locals 1

    .line 1
    const-string v0, "it"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    sget-object p1, Lcom/zykj/base/utils/XToastUtils;->INSTANCE:Lcom/zykj/base/utils/XToastUtils;

    .line 7
    .line 8
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    sget v0, Lcom/zykj/study/R$string;->subscribe_frist:I

    .line 13
    .line 14
    invoke-virtual {p0, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    const-string v0, "getString(...)"

    .line 19
    .line 20
    invoke-static {p0, v0}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    invoke-static {p1, p0}, Le5/o;->d(Lcom/zykj/base/utils/XToastUtils;Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    sget-object p0, Lh7/p;->a:Lh7/p;

    .line 27
    .line 28
    return-object p0
.end method

.method public static final D(Lcom/zykj/study/ui/home/find/CourseDetailsFragment;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-static {p0}, Landroidx/navigation/fragment/FragmentKt;->findNavController(Landroidx/fragment/app/Fragment;)Landroidx/navigation/NavController;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0}, Landroidx/navigation/NavController;->navigateUp()Z

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public static final E(Lcom/zykj/study/ui/home/find/CourseDetailsFragment;Lcom/zykj/study/bean/course/CourseDetailsBean;)Lh7/p;
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/zykj/base/BaseFragment;->getMBindView()Landroidx/databinding/ViewDataBinding;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    check-cast p0, Lcom/zykj/study/databinding/FragmentCourseDetailsBinding;

    .line 6
    .line 7
    iget-object p0, p0, Lcom/zykj/study/databinding/FragmentCourseDetailsBinding;->courseSynopsis:Lcom/zykj/study/databinding/LayoutCourseSynopsisBinding;

    .line 8
    .line 9
    iget-object p0, p0, Lcom/zykj/study/databinding/LayoutCourseSynopsisBinding;->expandTextView:Lcom/xuexiang/xui/widget/textview/ExpandableTextView;

    .line 10
    .line 11
    invoke-virtual {p1}, Lcom/zykj/study/bean/course/CourseBean;->getDescription()Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    invoke-virtual {p0, p1}, Lcom/xuexiang/xui/widget/textview/ExpandableTextView;->setText(Ljava/lang/CharSequence;)V

    .line 16
    .line 17
    .line 18
    sget-object p0, Lh7/p;->a:Lh7/p;

    .line 19
    .line 20
    return-object p0
.end method

.method public static synthetic g(Lcom/zykj/study/ui/home/find/CourseDetailsFragment;Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;Lcom/xuexiang/xui/widget/dialog/materialdialog/DialogAction;)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lcom/zykj/study/ui/home/find/CourseDetailsFragment;->w(Lcom/zykj/study/ui/home/find/CourseDetailsFragment;Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;Lcom/xuexiang/xui/widget/dialog/materialdialog/DialogAction;)V

    return-void
.end method

.method public static synthetic h(Lcom/zykj/study/ui/home/find/CourseDetailsFragment;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/zykj/study/ui/home/find/CourseDetailsFragment;->x(Lcom/zykj/study/ui/home/find/CourseDetailsFragment;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic i(Lcom/zykj/study/ui/home/find/CourseDetailsFragment;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/zykj/study/ui/home/find/CourseDetailsFragment;->z(Lcom/zykj/study/ui/home/find/CourseDetailsFragment;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic j(Lcom/zykj/study/ui/home/find/CourseDetailsFragment;Lcom/zykj/study/bean/course/CourseDetailsBean;)Lh7/p;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/zykj/study/ui/home/find/CourseDetailsFragment;->E(Lcom/zykj/study/ui/home/find/CourseDetailsFragment;Lcom/zykj/study/bean/course/CourseDetailsBean;)Lh7/p;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic k(Landroidx/recyclerview/widget/RecyclerView;Lcom/zykj/study/bean/course/CatalogBean;)Lh7/p;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/zykj/study/ui/home/find/CourseDetailsFragment;->C(Landroidx/recyclerview/widget/RecyclerView;Lcom/zykj/study/bean/course/CatalogBean;)Lh7/p;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic l(Lcom/zykj/study/ui/home/find/CourseDetailsFragment;Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;Lcom/xuexiang/xui/widget/dialog/materialdialog/DialogAction;)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lcom/zykj/study/ui/home/find/CourseDetailsFragment;->A(Lcom/zykj/study/ui/home/find/CourseDetailsFragment;Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;Lcom/xuexiang/xui/widget/dialog/materialdialog/DialogAction;)V

    return-void
.end method

.method public static synthetic m(Lcom/zykj/study/ui/home/find/CourseDetailsFragment;Lcom/zykj/study/bean/course/CourseDetailsBean;)Lh7/p;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/zykj/study/ui/home/find/CourseDetailsFragment;->B(Lcom/zykj/study/ui/home/find/CourseDetailsFragment;Lcom/zykj/study/bean/course/CourseDetailsBean;)Lh7/p;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic n(Lcom/zykj/study/ui/home/find/CourseDetailsFragment;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/zykj/study/ui/home/find/CourseDetailsFragment;->v(Lcom/zykj/study/ui/home/find/CourseDetailsFragment;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic o(Lcom/zykj/study/ui/home/find/CourseDetailsFragment;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/zykj/study/ui/home/find/CourseDetailsFragment;->D(Lcom/zykj/study/ui/home/find/CourseDetailsFragment;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic p(Lcom/zykj/study/ui/home/find/CourseDetailsFragment;Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;Lcom/xuexiang/xui/widget/dialog/materialdialog/DialogAction;)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lcom/zykj/study/ui/home/find/CourseDetailsFragment;->y(Lcom/zykj/study/ui/home/find/CourseDetailsFragment;Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;Lcom/xuexiang/xui/widget/dialog/materialdialog/DialogAction;)V

    return-void
.end method

.method public static final synthetic q(Lcom/zykj/study/ui/home/find/CourseDetailsFragment;)Lcom/zykj/study/viewmodels/CourseDetailsViewModel;
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/zykj/study/ui/home/find/CourseDetailsFragment;->s()Lcom/zykj/study/viewmodels/CourseDetailsViewModel;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method private final t()Lcom/zykj/study/viewmodels/DictViewModel;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/study/ui/home/find/CourseDetailsFragment;->g:Lh7/d;

    .line 2
    .line 3
    invoke-interface {v0}, Lh7/d;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lcom/zykj/study/viewmodels/DictViewModel;

    .line 8
    .line 9
    return-object v0
.end method

.method private final u()V
    .locals 2

    .line 1
    invoke-virtual {p0}, Lcom/zykj/base/BaseFragment;->getMBindView()Landroidx/databinding/ViewDataBinding;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    check-cast v0, Lcom/zykj/study/databinding/FragmentCourseDetailsBinding;

    .line 6
    .line 7
    iget-object v0, v0, Lcom/zykj/study/databinding/FragmentCourseDetailsBinding;->courseSynopsis:Lcom/zykj/study/databinding/LayoutCourseSynopsisBinding;

    .line 8
    .line 9
    iget-object v0, v0, Lcom/zykj/study/databinding/LayoutCourseSynopsisBinding;->courseStatusBtn:Lcom/zykj/study/databinding/ItemCourseStatusBtnBinding;

    .line 10
    .line 11
    iget-object v0, v0, Lcom/zykj/study/databinding/ItemCourseStatusBtnBinding;->btSubscribeCancel:Landroid/widget/Button;

    .line 12
    .line 13
    new-instance v1, Ly4/d;

    .line 14
    .line 15
    invoke-direct {v1, p0}, Ly4/d;-><init>(Lcom/zykj/study/ui/home/find/CourseDetailsFragment;)V

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 19
    .line 20
    .line 21
    invoke-virtual {p0}, Lcom/zykj/base/BaseFragment;->getMBindView()Landroidx/databinding/ViewDataBinding;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    check-cast v0, Lcom/zykj/study/databinding/FragmentCourseDetailsBinding;

    .line 26
    .line 27
    iget-object v0, v0, Lcom/zykj/study/databinding/FragmentCourseDetailsBinding;->courseSynopsis:Lcom/zykj/study/databinding/LayoutCourseSynopsisBinding;

    .line 28
    .line 29
    iget-object v0, v0, Lcom/zykj/study/databinding/LayoutCourseSynopsisBinding;->courseStatusBtn:Lcom/zykj/study/databinding/ItemCourseStatusBtnBinding;

    .line 30
    .line 31
    iget-object v0, v0, Lcom/zykj/study/databinding/ItemCourseStatusBtnBinding;->btSubscribe:Landroid/widget/Button;

    .line 32
    .line 33
    new-instance v1, Ly4/e;

    .line 34
    .line 35
    invoke-direct {v1, p0}, Ly4/e;-><init>(Lcom/zykj/study/ui/home/find/CourseDetailsFragment;)V

    .line 36
    .line 37
    .line 38
    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 39
    .line 40
    .line 41
    invoke-virtual {p0}, Lcom/zykj/base/BaseFragment;->getMBindView()Landroidx/databinding/ViewDataBinding;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    check-cast v0, Lcom/zykj/study/databinding/FragmentCourseDetailsBinding;

    .line 46
    .line 47
    iget-object v0, v0, Lcom/zykj/study/databinding/FragmentCourseDetailsBinding;->courseSynopsis:Lcom/zykj/study/databinding/LayoutCourseSynopsisBinding;

    .line 48
    .line 49
    iget-object v0, v0, Lcom/zykj/study/databinding/LayoutCourseSynopsisBinding;->courseStatusBtn:Lcom/zykj/study/databinding/ItemCourseStatusBtnBinding;

    .line 50
    .line 51
    iget-object v0, v0, Lcom/zykj/study/databinding/ItemCourseStatusBtnBinding;->btnChoiceToTeach:Landroid/widget/Button;

    .line 52
    .line 53
    new-instance v1, Ly4/f;

    .line 54
    .line 55
    invoke-direct {v1, p0}, Ly4/f;-><init>(Lcom/zykj/study/ui/home/find/CourseDetailsFragment;)V

    .line 56
    .line 57
    .line 58
    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 59
    .line 60
    .line 61
    return-void
.end method

.method public static final v(Lcom/zykj/study/ui/home/find/CourseDetailsFragment;Landroid/view/View;)V
    .locals 1

    .line 1
    new-instance p1, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;

    .line 2
    .line 3
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->requireContext()Landroid/content/Context;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-direct {p1, v0}, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;-><init>(Landroid/content/Context;)V

    .line 8
    .line 9
    .line 10
    sget v0, Lcom/zykj/study/R$string;->is_need_unsubscribe_course:I

    .line 11
    .line 12
    invoke-virtual {p0, v0}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    invoke-virtual {p1, v0}, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;->j(Ljava/lang/CharSequence;)Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    sget v0, Lcom/zykj/study/R$string;->sure:I

    .line 21
    .line 22
    invoke-virtual {p1, v0}, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;->z(I)Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    sget v0, Lcom/zykj/study/R$string;->cancel:I

    .line 27
    .line 28
    invoke-virtual {p1, v0}, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;->t(I)Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    new-instance v0, Ly4/h;

    .line 33
    .line 34
    invoke-direct {v0, p0}, Ly4/h;-><init>(Lcom/zykj/study/ui/home/find/CourseDetailsFragment;)V

    .line 35
    .line 36
    .line 37
    invoke-virtual {p1, v0}, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;->w(Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$i;)Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;

    .line 38
    .line 39
    .line 40
    move-result-object p0

    .line 41
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;->E()Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;

    .line 42
    .line 43
    .line 44
    return-void
.end method

.method public static final w(Lcom/zykj/study/ui/home/find/CourseDetailsFragment;Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;Lcom/xuexiang/xui/widget/dialog/materialdialog/DialogAction;)V
    .locals 1

    .line 1
    const-string v0, "<unused var>"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-static {p2, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 7
    .line 8
    .line 9
    invoke-virtual {p0}, Lcom/zykj/study/ui/home/find/CourseDetailsFragment;->s()Lcom/zykj/study/viewmodels/CourseDetailsViewModel;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    invoke-virtual {p0}, Lcom/zykj/study/viewmodels/CourseDetailsViewModel;->l()V

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method public static final x(Lcom/zykj/study/ui/home/find/CourseDetailsFragment;Landroid/view/View;)V
    .locals 1

    .line 1
    new-instance p1, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;

    .line 2
    .line 3
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->requireContext()Landroid/content/Context;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-direct {p1, v0}, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;-><init>(Landroid/content/Context;)V

    .line 8
    .line 9
    .line 10
    sget v0, Lcom/zykj/study/R$string;->is_need_subscribe_course:I

    .line 11
    .line 12
    invoke-virtual {p0, v0}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    invoke-virtual {p1, v0}, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;->j(Ljava/lang/CharSequence;)Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    sget v0, Lcom/zykj/study/R$string;->sure:I

    .line 21
    .line 22
    invoke-virtual {p1, v0}, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;->z(I)Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    sget v0, Lcom/zykj/study/R$string;->cancel:I

    .line 27
    .line 28
    invoke-virtual {p1, v0}, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;->t(I)Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    new-instance v0, Ly4/i;

    .line 33
    .line 34
    invoke-direct {v0, p0}, Ly4/i;-><init>(Lcom/zykj/study/ui/home/find/CourseDetailsFragment;)V

    .line 35
    .line 36
    .line 37
    invoke-virtual {p1, v0}, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;->w(Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$i;)Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;

    .line 38
    .line 39
    .line 40
    move-result-object p0

    .line 41
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;->E()Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;

    .line 42
    .line 43
    .line 44
    return-void
.end method

.method public static final y(Lcom/zykj/study/ui/home/find/CourseDetailsFragment;Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;Lcom/xuexiang/xui/widget/dialog/materialdialog/DialogAction;)V
    .locals 1

    .line 1
    const-string v0, "<unused var>"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-static {p2, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 7
    .line 8
    .line 9
    invoke-virtual {p0}, Lcom/zykj/study/ui/home/find/CourseDetailsFragment;->s()Lcom/zykj/study/viewmodels/CourseDetailsViewModel;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    invoke-virtual {p0}, Lcom/zykj/study/viewmodels/CourseDetailsViewModel;->j()V

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method public static final z(Lcom/zykj/study/ui/home/find/CourseDetailsFragment;Landroid/view/View;)V
    .locals 1

    .line 1
    new-instance p1, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;

    .line 2
    .line 3
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->requireContext()Landroid/content/Context;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-direct {p1, v0}, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;-><init>(Landroid/content/Context;)V

    .line 8
    .line 9
    .line 10
    sget v0, Lcom/zykj/study/R$string;->is_need_teach_course:I

    .line 11
    .line 12
    invoke-virtual {p0, v0}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    invoke-virtual {p1, v0}, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;->j(Ljava/lang/CharSequence;)Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    sget v0, Lcom/zykj/study/R$string;->sure:I

    .line 21
    .line 22
    invoke-virtual {p1, v0}, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;->z(I)Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    sget v0, Lcom/zykj/study/R$string;->cancel:I

    .line 27
    .line 28
    invoke-virtual {p1, v0}, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;->t(I)Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    new-instance v0, Ly4/j;

    .line 33
    .line 34
    invoke-direct {v0, p0}, Ly4/j;-><init>(Lcom/zykj/study/ui/home/find/CourseDetailsFragment;)V

    .line 35
    .line 36
    .line 37
    invoke-virtual {p1, v0}, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;->w(Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$i;)Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;

    .line 38
    .line 39
    .line 40
    move-result-object p0

    .line 41
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;->E()Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;

    .line 42
    .line 43
    .line 44
    return-void
.end method


# virtual methods
.method public initData(Lm7/c;)Ljava/lang/Object;
    .locals 4

    .line 1
    instance-of v0, p1, Lcom/zykj/study/ui/home/find/CourseDetailsFragment$initData$1;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p1

    .line 6
    check-cast v0, Lcom/zykj/study/ui/home/find/CourseDetailsFragment$initData$1;

    .line 7
    .line 8
    iget v1, v0, Lcom/zykj/study/ui/home/find/CourseDetailsFragment$initData$1;->c:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, Lcom/zykj/study/ui/home/find/CourseDetailsFragment$initData$1;->c:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lcom/zykj/study/ui/home/find/CourseDetailsFragment$initData$1;

    .line 21
    .line 22
    invoke-direct {v0, p0, p1}, Lcom/zykj/study/ui/home/find/CourseDetailsFragment$initData$1;-><init>(Lcom/zykj/study/ui/home/find/CourseDetailsFragment;Lm7/c;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p1, v0, Lcom/zykj/study/ui/home/find/CourseDetailsFragment$initData$1;->a:Ljava/lang/Object;

    .line 26
    .line 27
    invoke-static {}, Ln7/a;->f()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    iget v2, v0, Lcom/zykj/study/ui/home/find/CourseDetailsFragment$initData$1;->c:I

    .line 32
    .line 33
    const/4 v3, 0x1

    .line 34
    if-eqz v2, :cond_2

    .line 35
    .line 36
    if-ne v2, v3, :cond_1

    .line 37
    .line 38
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 39
    .line 40
    .line 41
    goto :goto_1

    .line 42
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 43
    .line 44
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 45
    .line 46
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 47
    .line 48
    .line 49
    throw p1

    .line 50
    :cond_2
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 51
    .line 52
    .line 53
    iput v3, v0, Lcom/zykj/study/ui/home/find/CourseDetailsFragment$initData$1;->c:I

    .line 54
    .line 55
    invoke-super {p0, v0}, Lcom/zykj/base/BaseFragment;->initData(Lm7/c;)Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    move-result-object p1

    .line 59
    if-ne p1, v1, :cond_3

    .line 60
    .line 61
    return-object v1

    .line 62
    :cond_3
    :goto_1
    invoke-virtual {p0}, Lcom/zykj/study/ui/home/find/CourseDetailsFragment;->s()Lcom/zykj/study/viewmodels/CourseDetailsViewModel;

    .line 63
    .line 64
    .line 65
    move-result-object p1

    .line 66
    invoke-virtual {p1}, Lcom/zykj/study/viewmodels/CourseDetailsViewModel;->c()Landroidx/lifecycle/MutableLiveData;

    .line 67
    .line 68
    .line 69
    move-result-object p1

    .line 70
    invoke-virtual {p0}, Lcom/zykj/study/ui/home/find/CourseDetailsFragment;->r()Lcom/zykj/study/ui/home/find/CourseDetailsFragmentArgs;

    .line 71
    .line 72
    .line 73
    move-result-object v0

    .line 74
    invoke-virtual {v0}, Lcom/zykj/study/ui/home/find/CourseDetailsFragmentArgs;->a()Lcom/zykj/study/bean/course/CourseSimpleBean;

    .line 75
    .line 76
    .line 77
    move-result-object v0

    .line 78
    invoke-virtual {p1, v0}, Landroidx/lifecycle/MutableLiveData;->setValue(Ljava/lang/Object;)V

    .line 79
    .line 80
    .line 81
    sget-object p1, Lh7/p;->a:Lh7/p;

    .line 82
    .line 83
    return-object p1
.end method

.method public initView(Landroid/os/Bundle;Lm7/c;)Ljava/lang/Object;
    .locals 4

    .line 1
    invoke-virtual {p0}, Lcom/zykj/study/ui/home/find/CourseDetailsFragment;->s()Lcom/zykj/study/viewmodels/CourseDetailsViewModel;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-virtual {p0}, Lcom/zykj/study/ui/home/find/CourseDetailsFragment;->r()Lcom/zykj/study/ui/home/find/CourseDetailsFragmentArgs;

    .line 6
    .line 7
    .line 8
    move-result-object p2

    .line 9
    invoke-virtual {p2}, Lcom/zykj/study/ui/home/find/CourseDetailsFragmentArgs;->a()Lcom/zykj/study/bean/course/CourseSimpleBean;

    .line 10
    .line 11
    .line 12
    move-result-object p2

    .line 13
    invoke-virtual {p2}, Lcom/zykj/study/bean/course/CourseBean;->getId()I

    .line 14
    .line 15
    .line 16
    move-result p2

    .line 17
    invoke-virtual {p1, p2}, Lcom/zykj/study/viewmodels/CourseDetailsViewModel;->i(I)V

    .line 18
    .line 19
    .line 20
    invoke-virtual {p0}, Lcom/zykj/base/BaseFragment;->getMBindView()Landroidx/databinding/ViewDataBinding;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    check-cast p1, Lcom/zykj/study/databinding/FragmentCourseDetailsBinding;

    .line 25
    .line 26
    invoke-virtual {p0}, Lcom/zykj/study/ui/home/find/CourseDetailsFragment;->s()Lcom/zykj/study/viewmodels/CourseDetailsViewModel;

    .line 27
    .line 28
    .line 29
    move-result-object p2

    .line 30
    invoke-virtual {p1, p2}, Lcom/zykj/study/databinding/FragmentCourseDetailsBinding;->setDetailsEntity(Lcom/zykj/study/viewmodels/CourseDetailsViewModel;)V

    .line 31
    .line 32
    .line 33
    invoke-virtual {p0}, Lcom/zykj/base/BaseFragment;->getMBindView()Landroidx/databinding/ViewDataBinding;

    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    check-cast p1, Lcom/zykj/study/databinding/FragmentCourseDetailsBinding;

    .line 38
    .line 39
    invoke-direct {p0}, Lcom/zykj/study/ui/home/find/CourseDetailsFragment;->t()Lcom/zykj/study/viewmodels/DictViewModel;

    .line 40
    .line 41
    .line 42
    move-result-object p2

    .line 43
    invoke-virtual {p1, p2}, Lcom/zykj/study/databinding/FragmentCourseDetailsBinding;->setDictViewModel(Lcom/zykj/study/viewmodels/DictViewModel;)V

    .line 44
    .line 45
    .line 46
    new-instance p1, Lcom/zykj/study/ui/home/find/CourseDetailsFragment$initView$2;

    .line 47
    .line 48
    const/4 p2, 0x0

    .line 49
    invoke-direct {p1, p0, p2}, Lcom/zykj/study/ui/home/find/CourseDetailsFragment$initView$2;-><init>(Lcom/zykj/study/ui/home/find/CourseDetailsFragment;Lm7/c;)V

    .line 50
    .line 51
    .line 52
    const/4 v0, 0x1

    .line 53
    invoke-static {p2, p1, v0, p2}, Li8/f;->f(Lkotlin/coroutines/d;Lx7/p;ILjava/lang/Object;)Ljava/lang/Object;

    .line 54
    .line 55
    .line 56
    move-result-object p1

    .line 57
    check-cast p1, Lcom/zykj/study/adapter/CatalogProgressAdapter;

    .line 58
    .line 59
    iput-object p1, p0, Lcom/zykj/study/ui/home/find/CourseDetailsFragment;->i:Lcom/zykj/study/adapter/CatalogProgressAdapter;

    .line 60
    .line 61
    invoke-virtual {p0}, Lcom/zykj/base/BaseFragment;->getMBindView()Landroidx/databinding/ViewDataBinding;

    .line 62
    .line 63
    .line 64
    move-result-object p1

    .line 65
    check-cast p1, Lcom/zykj/study/databinding/FragmentCourseDetailsBinding;

    .line 66
    .line 67
    iget-object p1, p1, Lcom/zykj/study/databinding/FragmentCourseDetailsBinding;->courseCatalog:Lcom/zykj/study/databinding/LayoutCourseDetailsCatalogBinding;

    .line 68
    .line 69
    iget-object p1, p1, Lcom/zykj/study/databinding/LayoutCourseDetailsCatalogBinding;->recycleProgress:Landroidx/recyclerview/widget/RecyclerView;

    .line 70
    .line 71
    iget-object v1, p0, Lcom/zykj/study/ui/home/find/CourseDetailsFragment;->i:Lcom/zykj/study/adapter/CatalogProgressAdapter;

    .line 72
    .line 73
    if-eqz v1, :cond_1

    .line 74
    .line 75
    invoke-virtual {p0}, Lcom/zykj/study/ui/home/find/CourseDetailsFragment;->s()Lcom/zykj/study/viewmodels/CourseDetailsViewModel;

    .line 76
    .line 77
    .line 78
    move-result-object v2

    .line 79
    invoke-virtual {p0}, Lcom/zykj/study/ui/home/find/CourseDetailsFragment;->s()Lcom/zykj/study/viewmodels/CourseDetailsViewModel;

    .line 80
    .line 81
    .line 82
    move-result-object v3

    .line 83
    invoke-virtual {v3}, Lcom/zykj/study/viewmodels/CourseDetailsViewModel;->b()Landroidx/lifecycle/MutableLiveData;

    .line 84
    .line 85
    .line 86
    move-result-object v3

    .line 87
    invoke-virtual {v3}, Landroidx/lifecycle/LiveData;->getValue()Ljava/lang/Object;

    .line 88
    .line 89
    .line 90
    move-result-object v3

    .line 91
    check-cast v3, Lcom/zykj/study/bean/course/CourseDetailsBean;

    .line 92
    .line 93
    if-eqz v3, :cond_0

    .line 94
    .line 95
    invoke-virtual {v3}, Lcom/zykj/study/bean/course/CourseDetailsBean;->getCatalogs()Ljava/util/List;

    .line 96
    .line 97
    .line 98
    move-result-object v3

    .line 99
    goto :goto_0

    .line 100
    :cond_0
    move-object v3, p2

    .line 101
    :goto_0
    invoke-virtual {v2, v3}, Lcom/zykj/study/viewmodels/CourseDetailsViewModel;->a(Ljava/util/List;)Ljava/util/List;

    .line 102
    .line 103
    .line 104
    move-result-object v2

    .line 105
    invoke-virtual {v1, v2}, Lcom/zykj/study/adapter/CatalogProgressAdapter;->g(Ljava/util/List;)V

    .line 106
    .line 107
    .line 108
    :cond_1
    invoke-virtual {p0}, Lcom/zykj/base/BaseFragment;->getMBindView()Landroidx/databinding/ViewDataBinding;

    .line 109
    .line 110
    .line 111
    move-result-object v2

    .line 112
    check-cast v2, Lcom/zykj/study/databinding/FragmentCourseDetailsBinding;

    .line 113
    .line 114
    iget-object v2, v2, Lcom/zykj/study/databinding/FragmentCourseDetailsBinding;->courseCatalog:Lcom/zykj/study/databinding/LayoutCourseDetailsCatalogBinding;

    .line 115
    .line 116
    iget-object v2, v2, Lcom/zykj/study/databinding/LayoutCourseDetailsCatalogBinding;->recycleProgress:Landroidx/recyclerview/widget/RecyclerView;

    .line 117
    .line 118
    invoke-virtual {v2}, Landroidx/recyclerview/widget/RecyclerView;->getAdapter()Landroidx/recyclerview/widget/RecyclerView$Adapter;

    .line 119
    .line 120
    .line 121
    move-result-object v2

    .line 122
    if-eqz v2, :cond_2

    .line 123
    .line 124
    sget-object v3, Landroidx/recyclerview/widget/RecyclerView$Adapter$StateRestorationPolicy;->PREVENT_WHEN_EMPTY:Landroidx/recyclerview/widget/RecyclerView$Adapter$StateRestorationPolicy;

    .line 125
    .line 126
    invoke-virtual {v2, v3}, Landroidx/recyclerview/widget/RecyclerView$Adapter;->setStateRestorationPolicy(Landroidx/recyclerview/widget/RecyclerView$Adapter$StateRestorationPolicy;)V

    .line 127
    .line 128
    .line 129
    :cond_2
    invoke-virtual {p1, v1}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(Landroidx/recyclerview/widget/RecyclerView$Adapter;)V

    .line 130
    .line 131
    .line 132
    invoke-virtual {p0}, Lcom/zykj/study/ui/home/find/CourseDetailsFragment;->s()Lcom/zykj/study/viewmodels/CourseDetailsViewModel;

    .line 133
    .line 134
    .line 135
    move-result-object p1

    .line 136
    invoke-virtual {p1}, Lcom/zykj/study/viewmodels/CourseDetailsViewModel;->b()Landroidx/lifecycle/MutableLiveData;

    .line 137
    .line 138
    .line 139
    move-result-object p1

    .line 140
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getViewLifecycleOwner()Landroidx/lifecycle/LifecycleOwner;

    .line 141
    .line 142
    .line 143
    move-result-object v1

    .line 144
    new-instance v2, Ly4/a;

    .line 145
    .line 146
    invoke-direct {v2, p0}, Ly4/a;-><init>(Lcom/zykj/study/ui/home/find/CourseDetailsFragment;)V

    .line 147
    .line 148
    .line 149
    new-instance v3, Lcom/zykj/study/ui/home/find/CourseDetailsFragment$b;

    .line 150
    .line 151
    invoke-direct {v3, v2}, Lcom/zykj/study/ui/home/find/CourseDetailsFragment$b;-><init>(Lx7/l;)V

    .line 152
    .line 153
    .line 154
    invoke-virtual {p1, v1, v3}, Landroidx/lifecycle/LiveData;->observe(Landroidx/lifecycle/LifecycleOwner;Landroidx/lifecycle/Observer;)V

    .line 155
    .line 156
    .line 157
    invoke-virtual {p0}, Lcom/zykj/base/BaseFragment;->getMBindView()Landroidx/databinding/ViewDataBinding;

    .line 158
    .line 159
    .line 160
    move-result-object p1

    .line 161
    check-cast p1, Lcom/zykj/study/databinding/FragmentCourseDetailsBinding;

    .line 162
    .line 163
    iget-object p1, p1, Lcom/zykj/study/databinding/FragmentCourseDetailsBinding;->toolbar2:Lcom/xuexiang/xui/widget/actionbar/TitleBar;

    .line 164
    .line 165
    invoke-virtual {p0}, Lcom/zykj/study/ui/home/find/CourseDetailsFragment;->s()Lcom/zykj/study/viewmodels/CourseDetailsViewModel;

    .line 166
    .line 167
    .line 168
    move-result-object v1

    .line 169
    invoke-virtual {v1}, Lcom/zykj/study/viewmodels/CourseDetailsViewModel;->c()Landroidx/lifecycle/MutableLiveData;

    .line 170
    .line 171
    .line 172
    move-result-object v1

    .line 173
    invoke-virtual {v1}, Landroidx/lifecycle/LiveData;->getValue()Ljava/lang/Object;

    .line 174
    .line 175
    .line 176
    move-result-object v1

    .line 177
    check-cast v1, Lcom/zykj/study/bean/course/CourseSimpleBean;

    .line 178
    .line 179
    if-eqz v1, :cond_3

    .line 180
    .line 181
    invoke-virtual {v1}, Lcom/zykj/study/bean/course/CourseBean;->getTitle()Ljava/lang/String;

    .line 182
    .line 183
    .line 184
    move-result-object p2

    .line 185
    :cond_3
    invoke-virtual {p1, p2}, Lcom/xuexiang/xui/widget/actionbar/TitleBar;->t(Ljava/lang/CharSequence;)Lcom/xuexiang/xui/widget/actionbar/TitleBar;

    .line 186
    .line 187
    .line 188
    move-result-object p1

    .line 189
    sget p2, Lcom/zykj/study/R$string;->arrow_left_return:I

    .line 190
    .line 191
    invoke-virtual {p0, p2}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    .line 192
    .line 193
    .line 194
    move-result-object p2

    .line 195
    invoke-virtual {p1, p2}, Lcom/xuexiang/xui/widget/actionbar/TitleBar;->p(Ljava/lang/CharSequence;)Lcom/xuexiang/xui/widget/actionbar/TitleBar;

    .line 196
    .line 197
    .line 198
    move-result-object p1

    .line 199
    sget p2, Lcom/zykj/study/R$drawable;->ic_arrow_left:I

    .line 200
    .line 201
    invoke-virtual {p1, p2}, Lcom/xuexiang/xui/widget/actionbar/TitleBar;->o(I)Lcom/xuexiang/xui/widget/actionbar/TitleBar;

    .line 202
    .line 203
    .line 204
    move-result-object p1

    .line 205
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getResources()Landroid/content/res/Resources;

    .line 206
    .line 207
    .line 208
    move-result-object p2

    .line 209
    sget v1, Lcom/zykj/study/R$color;->toolbar_back_icon_color:I

    .line 210
    .line 211
    invoke-virtual {p2, v1}, Landroid/content/res/Resources;->getColor(I)I

    .line 212
    .line 213
    .line 214
    move-result p2

    .line 215
    invoke-virtual {p1, p2}, Lcom/xuexiang/xui/widget/actionbar/TitleBar;->r(I)Lcom/xuexiang/xui/widget/actionbar/TitleBar;

    .line 216
    .line 217
    .line 218
    move-result-object p1

    .line 219
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getResources()Landroid/content/res/Resources;

    .line 220
    .line 221
    .line 222
    move-result-object p2

    .line 223
    sget v1, Lcom/zykj/lib/ui/R$dimen;->text_9:I

    .line 224
    .line 225
    invoke-virtual {p2, v1}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 226
    .line 227
    .line 228
    move-result p2

    .line 229
    int-to-float p2, p2

    .line 230
    invoke-virtual {p1, p2}, Lcom/xuexiang/xui/widget/actionbar/TitleBar;->s(F)Lcom/xuexiang/xui/widget/actionbar/TitleBar;

    .line 231
    .line 232
    .line 233
    move-result-object p1

    .line 234
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getResources()Landroid/content/res/Resources;

    .line 235
    .line 236
    .line 237
    move-result-object p2

    .line 238
    sget v1, Lcom/zykj/lib/ui/R$dimen;->text_9:I

    .line 239
    .line 240
    invoke-virtual {p2, v1}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 241
    .line 242
    .line 243
    move-result p2

    .line 244
    int-to-float p2, p2

    .line 245
    invoke-virtual {p1, p2}, Lcom/xuexiang/xui/widget/actionbar/TitleBar;->v(F)Lcom/xuexiang/xui/widget/actionbar/TitleBar;

    .line 246
    .line 247
    .line 248
    move-result-object p1

    .line 249
    const/4 p2, 0x0

    .line 250
    invoke-virtual {p1, p2}, Lcom/xuexiang/xui/widget/actionbar/TitleBar;->q(Z)Lcom/xuexiang/xui/widget/actionbar/TitleBar;

    .line 251
    .line 252
    .line 253
    move-result-object p1

    .line 254
    invoke-virtual {p1, v0}, Lcom/xuexiang/xui/widget/actionbar/TitleBar;->l(Z)Lcom/xuexiang/xui/widget/actionbar/TitleBar;

    .line 255
    .line 256
    .line 257
    move-result-object p1

    .line 258
    new-instance p2, Ly4/b;

    .line 259
    .line 260
    invoke-direct {p2, p0}, Ly4/b;-><init>(Lcom/zykj/study/ui/home/find/CourseDetailsFragment;)V

    .line 261
    .line 262
    .line 263
    invoke-virtual {p1, p2}, Lcom/xuexiang/xui/widget/actionbar/TitleBar;->n(Landroid/view/View$OnClickListener;)Lcom/xuexiang/xui/widget/actionbar/TitleBar;

    .line 264
    .line 265
    .line 266
    invoke-virtual {p0}, Lcom/zykj/study/ui/home/find/CourseDetailsFragment;->s()Lcom/zykj/study/viewmodels/CourseDetailsViewModel;

    .line 267
    .line 268
    .line 269
    move-result-object p1

    .line 270
    invoke-virtual {p1}, Lcom/zykj/study/viewmodels/CourseDetailsViewModel;->b()Landroidx/lifecycle/MutableLiveData;

    .line 271
    .line 272
    .line 273
    move-result-object p1

    .line 274
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getViewLifecycleOwner()Landroidx/lifecycle/LifecycleOwner;

    .line 275
    .line 276
    .line 277
    move-result-object p2

    .line 278
    new-instance v0, Ly4/c;

    .line 279
    .line 280
    invoke-direct {v0, p0}, Ly4/c;-><init>(Lcom/zykj/study/ui/home/find/CourseDetailsFragment;)V

    .line 281
    .line 282
    .line 283
    new-instance v1, Lcom/zykj/study/ui/home/find/CourseDetailsFragment$b;

    .line 284
    .line 285
    invoke-direct {v1, v0}, Lcom/zykj/study/ui/home/find/CourseDetailsFragment$b;-><init>(Lx7/l;)V

    .line 286
    .line 287
    .line 288
    invoke-virtual {p1, p2, v1}, Landroidx/lifecycle/LiveData;->observe(Landroidx/lifecycle/LifecycleOwner;Landroidx/lifecycle/Observer;)V

    .line 289
    .line 290
    .line 291
    invoke-direct {p0}, Lcom/zykj/study/ui/home/find/CourseDetailsFragment;->u()V

    .line 292
    .line 293
    .line 294
    sget-object p1, Lh7/p;->a:Lh7/p;

    .line 295
    .line 296
    return-object p1
.end method

.method public layoutId()I
    .locals 1

    .line 1
    sget v0, Lcom/zykj/study/R$layout;->fragment_course_details:I

    .line 2
    .line 3
    return v0
.end method

.method public final r()Lcom/zykj/study/ui/home/find/CourseDetailsFragmentArgs;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/study/ui/home/find/CourseDetailsFragment;->f:Landroidx/navigation/NavArgsLazy;

    .line 2
    .line 3
    invoke-interface {v0}, Lh7/d;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lcom/zykj/study/ui/home/find/CourseDetailsFragmentArgs;

    .line 8
    .line 9
    return-object v0
.end method

.method public final s()Lcom/zykj/study/viewmodels/CourseDetailsViewModel;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/study/ui/home/find/CourseDetailsFragment;->h:Lh7/d;

    .line 2
    .line 3
    invoke-interface {v0}, Lh7/d;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lcom/zykj/study/viewmodels/CourseDetailsViewModel;

    .line 8
    .line 9
    return-object v0
.end method
