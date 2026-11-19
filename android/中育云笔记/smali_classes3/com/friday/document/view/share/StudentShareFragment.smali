.class public final Lcom/friday/document/view/share/StudentShareFragment;
.super Lcom/friday/document/view/share/Hilt_StudentShareFragment;
.source "SourceFile"

# interfaces
.implements Lj2/i;


# annotations
.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x0
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/friday/document/view/share/Hilt_StudentShareFragment<",
        "Lcom/friday/document/databinding/FragmentStudentShareBinding;",
        ">;",
        "Lj2/i;"
    }
.end annotation


# instance fields
.field public final i:[Ljava/lang/String;

.field public j:Ljava/util/List;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Lcom/friday/document/view/share/Hilt_StudentShareFragment;-><init>()V

    .line 2
    .line 3
    .line 4
    const-string v0, "\u5168\u90e8"

    .line 5
    .line 6
    const-string v1, "\u6309\u6559\u5e08"

    .line 7
    .line 8
    filled-new-array {v0, v1}, [Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    iput-object v0, p0, Lcom/friday/document/view/share/StudentShareFragment;->i:[Ljava/lang/String;

    .line 13
    .line 14
    new-instance v0, Ljava/util/ArrayList;

    .line 15
    .line 16
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 17
    .line 18
    .line 19
    iput-object v0, p0, Lcom/friday/document/view/share/StudentShareFragment;->j:Ljava/util/List;

    .line 20
    .line 21
    return-void
.end method

.method public static final A(Lcom/friday/document/view/share/StudentShareFragment;Lcom/friday/document/model/ShareFile;)V
    .locals 0

    .line 1
    invoke-static {p1}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0, p1}, Lcom/friday/document/view/share/StudentShareFragment;->w(Lcom/friday/document/model/ShareFile;)V

    .line 5
    .line 6
    .line 7
    return-void
.end method

.method public static synthetic r(Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/friday/document/view/share/StudentShareFragment;->y(Landroid/view/View;)V

    return-void
.end method

.method public static synthetic s(Lcom/friday/document/view/share/StudentShareFragment;Lcom/google/android/material/tabs/TabLayout$Tab;I)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lcom/friday/document/view/share/StudentShareFragment;->z(Lcom/friday/document/view/share/StudentShareFragment;Lcom/google/android/material/tabs/TabLayout$Tab;I)V

    return-void
.end method

.method public static synthetic t(Lcom/friday/document/view/share/StudentShareFragment;ILcom/friday/document/model/ShareFile;)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lcom/friday/document/view/share/StudentShareFragment;->x(Lcom/friday/document/view/share/StudentShareFragment;ILcom/friday/document/model/ShareFile;)V

    return-void
.end method

.method public static synthetic u(Lcom/friday/document/view/share/StudentShareFragment;Lcom/friday/document/model/ShareFile;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/friday/document/view/share/StudentShareFragment;->A(Lcom/friday/document/view/share/StudentShareFragment;Lcom/friday/document/model/ShareFile;)V

    return-void
.end method

.method public static final synthetic v(Lcom/friday/document/view/share/StudentShareFragment;)Ljava/util/List;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/friday/document/view/share/StudentShareFragment;->j:Ljava/util/List;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final x(Lcom/friday/document/view/share/StudentShareFragment;ILcom/friday/document/model/ShareFile;)V
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/friday/document/view/share/StudentShareFragment;->j:Ljava/util/List;

    .line 2
    .line 3
    invoke-interface {p0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    instance-of p1, p0, Lcom/friday/document/view/share/ShareListFragment;

    .line 8
    .line 9
    if-eqz p1, :cond_0

    .line 10
    .line 11
    check-cast p0, Lcom/friday/document/view/share/ShareListFragment;

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    const/4 p0, 0x0

    .line 15
    :goto_0
    if-eqz p0, :cond_1

    .line 16
    .line 17
    invoke-virtual {p0, p2}, Lcom/friday/document/view/share/ShareListFragment;->X(Lcom/friday/document/model/ShareFile;)V

    .line 18
    .line 19
    .line 20
    :cond_1
    return-void
.end method

.method public static final y(Landroid/view/View;)V
    .locals 0

    .line 1
    sget-object p0, Lcom/friday/common/helper/c;->a:Lcom/friday/common/helper/c;

    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/friday/common/helper/c;->o()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public static final z(Lcom/friday/document/view/share/StudentShareFragment;Lcom/google/android/material/tabs/TabLayout$Tab;I)V
    .locals 1

    .line 1
    const-string v0, "tab"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object p0, p0, Lcom/friday/document/view/share/StudentShareFragment;->i:[Ljava/lang/String;

    .line 7
    .line 8
    aget-object p0, p0, p2

    .line 9
    .line 10
    invoke-virtual {p1, p0}, Lcom/google/android/material/tabs/TabLayout$Tab;->setText(Ljava/lang/CharSequence;)Lcom/google/android/material/tabs/TabLayout$Tab;

    .line 11
    .line 12
    .line 13
    return-void
.end method


# virtual methods
.method public getLayoutId()I
    .locals 1

    .line 1
    sget v0, Lcom/friday/document/R$layout;->fragment_student_share:I

    .line 2
    .line 3
    return v0
.end method

.method public initData()V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/friday/document/view/share/StudentShareFragment;->initView()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public initView()V
    .locals 4

    .line 1
    invoke-super {p0}, Lcom/friday/common/base/BaseFragment;->initView()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lcom/friday/document/view/share/ShareListFragment;

    .line 5
    .line 6
    invoke-direct {v0}, Lcom/friday/document/view/share/ShareListFragment;-><init>()V

    .line 7
    .line 8
    .line 9
    new-instance v1, Lcom/friday/document/view/share/ShareByTeacherFragment;

    .line 10
    .line 11
    invoke-direct {v1}, Lcom/friday/document/view/share/ShareByTeacherFragment;-><init>()V

    .line 12
    .line 13
    .line 14
    const/4 v2, 0x2

    .line 15
    new-array v2, v2, [Landroidx/fragment/app/Fragment;

    .line 16
    .line 17
    const/4 v3, 0x0

    .line 18
    aput-object v0, v2, v3

    .line 19
    .line 20
    const/4 v0, 0x1

    .line 21
    aput-object v1, v2, v0

    .line 22
    .line 23
    invoke-static {v2}, Lrc/w;->s([Ljava/lang/Object;)Ljava/util/List;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    iput-object v0, p0, Lcom/friday/document/view/share/StudentShareFragment;->j:Ljava/util/List;

    .line 28
    .line 29
    new-instance v0, Lcom/friday/document/view/share/StudentShareFragment$initView$tabAdapter$1;

    .line 30
    .line 31
    invoke-direct {v0, p0}, Lcom/friday/document/view/share/StudentShareFragment$initView$tabAdapter$1;-><init>(Lcom/friday/document/view/share/StudentShareFragment;)V

    .line 32
    .line 33
    .line 34
    invoke-virtual {p0}, Lcom/friday/common/base/BaseFragment;->getMBinding()Landroidx/databinding/ViewDataBinding;

    .line 35
    .line 36
    .line 37
    move-result-object v1

    .line 38
    check-cast v1, Lcom/friday/document/databinding/FragmentStudentShareBinding;

    .line 39
    .line 40
    iget-object v1, v1, Lcom/friday/document/databinding/FragmentStudentShareBinding;->g:Landroidx/viewpager2/widget/ViewPager2;

    .line 41
    .line 42
    new-instance v2, Lcom/friday/document/view/share/StudentShareFragment$initView$1;

    .line 43
    .line 44
    invoke-direct {v2, p0}, Lcom/friday/document/view/share/StudentShareFragment$initView$1;-><init>(Lcom/friday/document/view/share/StudentShareFragment;)V

    .line 45
    .line 46
    .line 47
    invoke-virtual {v1, v2}, Landroidx/viewpager2/widget/ViewPager2;->registerOnPageChangeCallback(Landroidx/viewpager2/widget/ViewPager2$OnPageChangeCallback;)V

    .line 48
    .line 49
    .line 50
    invoke-virtual {p0}, Lcom/friday/common/base/BaseFragment;->getMBinding()Landroidx/databinding/ViewDataBinding;

    .line 51
    .line 52
    .line 53
    move-result-object v1

    .line 54
    check-cast v1, Lcom/friday/document/databinding/FragmentStudentShareBinding;

    .line 55
    .line 56
    iget-object v1, v1, Lcom/friday/document/databinding/FragmentStudentShareBinding;->c:Landroid/widget/ImageView;

    .line 57
    .line 58
    new-instance v2, Lx2/x;

    .line 59
    .line 60
    invoke-direct {v2}, Lx2/x;-><init>()V

    .line 61
    .line 62
    .line 63
    invoke-virtual {v1, v2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 64
    .line 65
    .line 66
    invoke-virtual {p0}, Lcom/friday/common/base/BaseFragment;->getMBinding()Landroidx/databinding/ViewDataBinding;

    .line 67
    .line 68
    .line 69
    move-result-object v1

    .line 70
    check-cast v1, Lcom/friday/document/databinding/FragmentStudentShareBinding;

    .line 71
    .line 72
    iget-object v1, v1, Lcom/friday/document/databinding/FragmentStudentShareBinding;->g:Landroidx/viewpager2/widget/ViewPager2;

    .line 73
    .line 74
    invoke-virtual {v1, v0}, Landroidx/viewpager2/widget/ViewPager2;->setAdapter(Landroidx/recyclerview/widget/RecyclerView$Adapter;)V

    .line 75
    .line 76
    .line 77
    invoke-virtual {p0}, Lcom/friday/common/base/BaseFragment;->getMBinding()Landroidx/databinding/ViewDataBinding;

    .line 78
    .line 79
    .line 80
    move-result-object v0

    .line 81
    check-cast v0, Lcom/friday/document/databinding/FragmentStudentShareBinding;

    .line 82
    .line 83
    iget-object v0, v0, Lcom/friday/document/databinding/FragmentStudentShareBinding;->g:Landroidx/viewpager2/widget/ViewPager2;

    .line 84
    .line 85
    invoke-virtual {v0, v3}, Landroidx/viewpager2/widget/ViewPager2;->setUserInputEnabled(Z)V

    .line 86
    .line 87
    .line 88
    new-instance v0, Lcom/google/android/material/tabs/TabLayoutMediator;

    .line 89
    .line 90
    invoke-virtual {p0}, Lcom/friday/common/base/BaseFragment;->getMBinding()Landroidx/databinding/ViewDataBinding;

    .line 91
    .line 92
    .line 93
    move-result-object v1

    .line 94
    check-cast v1, Lcom/friday/document/databinding/FragmentStudentShareBinding;

    .line 95
    .line 96
    iget-object v1, v1, Lcom/friday/document/databinding/FragmentStudentShareBinding;->f:Lcom/google/android/material/tabs/TabLayout;

    .line 97
    .line 98
    invoke-virtual {p0}, Lcom/friday/common/base/BaseFragment;->getMBinding()Landroidx/databinding/ViewDataBinding;

    .line 99
    .line 100
    .line 101
    move-result-object v2

    .line 102
    check-cast v2, Lcom/friday/document/databinding/FragmentStudentShareBinding;

    .line 103
    .line 104
    iget-object v2, v2, Lcom/friday/document/databinding/FragmentStudentShareBinding;->g:Landroidx/viewpager2/widget/ViewPager2;

    .line 105
    .line 106
    new-instance v3, Lx2/y;

    .line 107
    .line 108
    invoke-direct {v3, p0}, Lx2/y;-><init>(Lcom/friday/document/view/share/StudentShareFragment;)V

    .line 109
    .line 110
    .line 111
    invoke-direct {v0, v1, v2, v3}, Lcom/google/android/material/tabs/TabLayoutMediator;-><init>(Lcom/google/android/material/tabs/TabLayout;Landroidx/viewpager2/widget/ViewPager2;Lcom/google/android/material/tabs/TabLayoutMediator$TabConfigurationStrategy;)V

    .line 112
    .line 113
    .line 114
    invoke-virtual {v0}, Lcom/google/android/material/tabs/TabLayoutMediator;->attach()V

    .line 115
    .line 116
    .line 117
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getChildFragmentManager()Landroidx/fragment/app/FragmentManager;

    .line 118
    .line 119
    .line 120
    move-result-object v0

    .line 121
    invoke-virtual {v0}, Landroidx/fragment/app/FragmentManager;->beginTransaction()Landroidx/fragment/app/FragmentTransaction;

    .line 122
    .line 123
    .line 124
    move-result-object v0

    .line 125
    sget v1, Lcom/friday/document/R$id;->preview_container:I

    .line 126
    .line 127
    new-instance v2, Lcom/friday/document/view/share/StudentSharePreviewFragment;

    .line 128
    .line 129
    invoke-direct {v2}, Lcom/friday/document/view/share/StudentSharePreviewFragment;-><init>()V

    .line 130
    .line 131
    .line 132
    invoke-virtual {v0, v1, v2}, Landroidx/fragment/app/FragmentTransaction;->add(ILandroidx/fragment/app/Fragment;)Landroidx/fragment/app/FragmentTransaction;

    .line 133
    .line 134
    .line 135
    move-result-object v0

    .line 136
    invoke-virtual {v0}, Landroidx/fragment/app/FragmentTransaction;->commitAllowingStateLoss()I

    .line 137
    .line 138
    .line 139
    const-string v0, "ShareSearchToDetailPath"

    .line 140
    .line 141
    const-class v1, Lcom/friday/document/model/ShareFile;

    .line 142
    .line 143
    invoke-static {v0, v1}, Lcom/jeremyliao/liveeventbus/LiveEventBus;->get(Ljava/lang/String;Ljava/lang/Class;)Lcom/jeremyliao/liveeventbus/core/Observable;

    .line 144
    .line 145
    .line 146
    move-result-object v0

    .line 147
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getViewLifecycleOwner()Landroidx/lifecycle/LifecycleOwner;

    .line 148
    .line 149
    .line 150
    move-result-object v1

    .line 151
    new-instance v2, Lx2/z;

    .line 152
    .line 153
    invoke-direct {v2, p0}, Lx2/z;-><init>(Lcom/friday/document/view/share/StudentShareFragment;)V

    .line 154
    .line 155
    .line 156
    invoke-interface {v0, v1, v2}, Lcom/jeremyliao/liveeventbus/core/Observable;->observe(Landroidx/lifecycle/LifecycleOwner;Landroidx/lifecycle/Observer;)V

    .line 157
    .line 158
    .line 159
    return-void
.end method

.method public l()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/friday/document/view/share/StudentShareFragment;->j:Ljava/util/List;

    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/friday/common/base/BaseFragment;->getMBinding()Landroidx/databinding/ViewDataBinding;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    check-cast v1, Lcom/friday/document/databinding/FragmentStudentShareBinding;

    .line 8
    .line 9
    iget-object v1, v1, Lcom/friday/document/databinding/FragmentStudentShareBinding;->g:Landroidx/viewpager2/widget/ViewPager2;

    .line 10
    .line 11
    invoke-virtual {v1}, Landroidx/viewpager2/widget/ViewPager2;->getCurrentItem()I

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    invoke-static {v0, v1}, Lrc/g0;->p0(Ljava/util/List;I)Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    instance-of v1, v0, Lj2/i;

    .line 20
    .line 21
    if-eqz v1, :cond_0

    .line 22
    .line 23
    check-cast v0, Lj2/i;

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_0
    const/4 v0, 0x0

    .line 27
    :goto_0
    if-eqz v0, :cond_1

    .line 28
    .line 29
    invoke-interface {v0}, Lj2/i;->l()V

    .line 30
    .line 31
    .line 32
    :cond_1
    return-void
.end method

.method public final w(Lcom/friday/document/model/ShareFile;)V
    .locals 5

    .line 1
    invoke-virtual {p0}, Lcom/friday/common/base/BaseFragment;->getMBinding()Landroidx/databinding/ViewDataBinding;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    check-cast v0, Lcom/friday/document/databinding/FragmentStudentShareBinding;

    .line 6
    .line 7
    iget-object v0, v0, Lcom/friday/document/databinding/FragmentStudentShareBinding;->g:Landroidx/viewpager2/widget/ViewPager2;

    .line 8
    .line 9
    invoke-virtual {v0}, Landroidx/viewpager2/widget/ViewPager2;->getCurrentItem()I

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    const/4 v1, 0x0

    .line 14
    if-eqz v0, :cond_0

    .line 15
    .line 16
    invoke-virtual {p0}, Lcom/friday/common/base/BaseFragment;->getMBinding()Landroidx/databinding/ViewDataBinding;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    check-cast v0, Lcom/friday/document/databinding/FragmentStudentShareBinding;

    .line 21
    .line 22
    iget-object v0, v0, Lcom/friday/document/databinding/FragmentStudentShareBinding;->g:Landroidx/viewpager2/widget/ViewPager2;

    .line 23
    .line 24
    const/4 v2, 0x1

    .line 25
    invoke-virtual {v0, v1, v2}, Landroidx/viewpager2/widget/ViewPager2;->setCurrentItem(IZ)V

    .line 26
    .line 27
    .line 28
    :cond_0
    invoke-virtual {p0}, Lcom/friday/common/base/BaseFragment;->getMBinding()Landroidx/databinding/ViewDataBinding;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    check-cast v0, Lcom/friday/document/databinding/FragmentStudentShareBinding;

    .line 33
    .line 34
    iget-object v0, v0, Lcom/friday/document/databinding/FragmentStudentShareBinding;->g:Landroidx/viewpager2/widget/ViewPager2;

    .line 35
    .line 36
    new-instance v2, Lx2/a0;

    .line 37
    .line 38
    invoke-direct {v2, p0, v1, p1}, Lx2/a0;-><init>(Lcom/friday/document/view/share/StudentShareFragment;ILcom/friday/document/model/ShareFile;)V

    .line 39
    .line 40
    .line 41
    const-wide/16 v3, 0x12c

    .line 42
    .line 43
    invoke-virtual {v0, v2, v3, v4}, Landroid/view/View;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 44
    .line 45
    .line 46
    return-void
.end method
