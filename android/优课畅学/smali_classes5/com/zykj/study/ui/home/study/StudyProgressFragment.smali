# RE note 本类字节码直接引用的读写或显示接口包括DataStore。
.class public final Lcom/zykj/study/ui/home/study/StudyProgressFragment;
.super Lcom/zykj/study/ui/home/study/Hilt_StudyProgressFragment;
.source "SourceFile"


# annotations
.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x0
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/zykj/study/ui/home/study/StudyProgressFragment$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/zykj/study/ui/home/study/Hilt_StudyProgressFragment<",
        "Lcom/zykj/study/databinding/FragmentStudyProgressBinding;",
        ">;"
    }
.end annotation


# instance fields
.field public final f:Lh7/d;

.field public final g:Lh7/d;

.field public h:Lcom/zykj/study/adapter/CatalogProgressAdapter;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 6

    .line 1
    invoke-direct {p0}, Lcom/zykj/study/ui/home/study/Hilt_StudyProgressFragment;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ld5/f;

    .line 5
    .line 6
    invoke-direct {v0, p0}, Ld5/f;-><init>(Lcom/zykj/study/ui/home/study/StudyProgressFragment;)V

    .line 7
    .line 8
    .line 9
    sget-object v1, Lkotlin/LazyThreadSafetyMode;->c:Lkotlin/LazyThreadSafetyMode;

    .line 10
    .line 11
    new-instance v2, Lcom/zykj/study/ui/home/study/StudyProgressFragment$special$$inlined$viewModels$default$1;

    .line 12
    .line 13
    invoke-direct {v2, v0}, Lcom/zykj/study/ui/home/study/StudyProgressFragment$special$$inlined$viewModels$default$1;-><init>(Lx7/a;)V

    .line 14
    .line 15
    .line 16
    invoke-static {v1, v2}, Lkotlin/a;->a(Lkotlin/LazyThreadSafetyMode;Lx7/a;)Lh7/d;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    const-class v1, Lcom/zykj/study/viewmodels/StudyViewModel;

    .line 21
    .line 22
    invoke-static {v1}, Lkotlin/jvm/internal/y;->b(Ljava/lang/Class;)Le8/c;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    new-instance v2, Lcom/zykj/study/ui/home/study/StudyProgressFragment$special$$inlined$viewModels$default$2;

    .line 27
    .line 28
    invoke-direct {v2, v0}, Lcom/zykj/study/ui/home/study/StudyProgressFragment$special$$inlined$viewModels$default$2;-><init>(Lh7/d;)V

    .line 29
    .line 30
    .line 31
    new-instance v3, Lcom/zykj/study/ui/home/study/StudyProgressFragment$special$$inlined$viewModels$default$3;

    .line 32
    .line 33
    const/4 v4, 0x0

    .line 34
    invoke-direct {v3, v4, v0}, Lcom/zykj/study/ui/home/study/StudyProgressFragment$special$$inlined$viewModels$default$3;-><init>(Lx7/a;Lh7/d;)V

    .line 35
    .line 36
    .line 37
    new-instance v5, Lcom/zykj/study/ui/home/study/StudyProgressFragment$special$$inlined$viewModels$default$4;

    .line 38
    .line 39
    invoke-direct {v5, p0, v0}, Lcom/zykj/study/ui/home/study/StudyProgressFragment$special$$inlined$viewModels$default$4;-><init>(Landroidx/fragment/app/Fragment;Lh7/d;)V

    .line 40
    .line 41
    .line 42
    invoke-static {p0, v1, v2, v3, v5}, Landroidx/fragment/app/FragmentViewModelLazyKt;->createViewModelLazy(Landroidx/fragment/app/Fragment;Le8/c;Lx7/a;Lx7/a;Lx7/a;)Lh7/d;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    iput-object v0, p0, Lcom/zykj/study/ui/home/study/StudyProgressFragment;->f:Lh7/d;

    .line 47
    .line 48
    const-class v0, Lcom/zykj/study/viewmodels/NotifyDataChangedViewModel;

    .line 49
    .line 50
    invoke-static {v0}, Lkotlin/jvm/internal/y;->b(Ljava/lang/Class;)Le8/c;

    .line 51
    .line 52
    .line 53
    move-result-object v0

    .line 54
    new-instance v1, Lcom/zykj/study/ui/home/study/StudyProgressFragment$special$$inlined$activityViewModels$default$1;

    .line 55
    .line 56
    invoke-direct {v1, p0}, Lcom/zykj/study/ui/home/study/StudyProgressFragment$special$$inlined$activityViewModels$default$1;-><init>(Landroidx/fragment/app/Fragment;)V

    .line 57
    .line 58
    .line 59
    new-instance v2, Lcom/zykj/study/ui/home/study/StudyProgressFragment$special$$inlined$activityViewModels$default$2;

    .line 60
    .line 61
    invoke-direct {v2, v4, p0}, Lcom/zykj/study/ui/home/study/StudyProgressFragment$special$$inlined$activityViewModels$default$2;-><init>(Lx7/a;Landroidx/fragment/app/Fragment;)V

    .line 62
    .line 63
    .line 64
    new-instance v3, Lcom/zykj/study/ui/home/study/StudyProgressFragment$special$$inlined$activityViewModels$default$3;

    .line 65
    .line 66
    invoke-direct {v3, p0}, Lcom/zykj/study/ui/home/study/StudyProgressFragment$special$$inlined$activityViewModels$default$3;-><init>(Landroidx/fragment/app/Fragment;)V

    .line 67
    .line 68
    .line 69
    invoke-static {p0, v0, v1, v2, v3}, Landroidx/fragment/app/FragmentViewModelLazyKt;->createViewModelLazy(Landroidx/fragment/app/Fragment;Le8/c;Lx7/a;Lx7/a;Lx7/a;)Lh7/d;

    .line 70
    .line 71
    .line 72
    move-result-object v0

    .line 73
    iput-object v0, p0, Lcom/zykj/study/ui/home/study/StudyProgressFragment;->g:Lh7/d;

    .line 74
    .line 75
    return-void
.end method

.method public static final A(Lcom/zykj/study/ui/home/study/StudyProgressFragment;Lcom/zykj/study/bean/course/CatalogBean;)Lh7/p;
    .locals 8

    .line 1
    const-string v0, "catalogBean"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Lcom/zykj/study/ui/home/study/StudyProgressFragment;->s()Lcom/zykj/study/viewmodels/StudyViewModel;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    invoke-virtual {v0}, Lcom/zykj/study/viewmodels/StudyViewModel;->l()Landroidx/lifecycle/MutableLiveData;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    invoke-virtual {v0}, Landroidx/lifecycle/LiveData;->getValue()Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    move-object v2, v0

    .line 19
    check-cast v2, Lcom/zykj/study/data/CourseStudyEntity;

    .line 20
    .line 21
    if-eqz v2, :cond_0

    .line 22
    .line 23
    invoke-static {p0}, Landroidx/navigation/fragment/FragmentKt;->findNavController(Landroidx/fragment/app/Fragment;)Landroidx/navigation/NavController;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    sget-object v1, Lv4/c;->a:Lv4/c$h;

    .line 28
    .line 29
    sget-object v3, Le5/e;->a:Le5/e;

    .line 30
    .line 31
    invoke-virtual {v3}, Le5/e;->c()Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object v3

    .line 35
    invoke-direct {p0}, Lcom/zykj/study/ui/home/study/StudyProgressFragment;->s()Lcom/zykj/study/viewmodels/StudyViewModel;

    .line 36
    .line 37
    .line 38
    move-result-object v4

    .line 39
    invoke-virtual {v4}, Lcom/zykj/study/viewmodels/StudyViewModel;->h()Ll8/h;

    .line 40
    .line 41
    .line 42
    move-result-object v4

    .line 43
    invoke-interface {v4}, Ll8/h;->getValue()Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object v4

    .line 47
    check-cast v4, Lcom/zykj/http/bean/HeaderBean;

    .line 48
    .line 49
    invoke-virtual {v4}, Lcom/zykj/http/bean/HeaderBean;->getAccessToken()Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object v4

    .line 53
    invoke-direct {p0}, Lcom/zykj/study/ui/home/study/StudyProgressFragment;->s()Lcom/zykj/study/viewmodels/StudyViewModel;

    .line 54
    .line 55
    .line 56
    move-result-object p0

    .line 57
    invoke-virtual {p0}, Lcom/zykj/study/viewmodels/StudyViewModel;->h()Ll8/h;

    .line 58
    .line 59
    .line 60
    move-result-object p0

    .line 61
    invoke-interface {p0}, Ll8/h;->getValue()Ljava/lang/Object;

    .line 62
    .line 63
    .line 64
    move-result-object p0

    .line 65
    check-cast p0, Lcom/zykj/http/bean/HeaderBean;

    .line 66
    .line 67
    invoke-virtual {p0}, Lcom/zykj/http/bean/HeaderBean;->getServerUrl()Ljava/lang/String;

    .line 68
    .line 69
    .line 70
    move-result-object p0

    .line 71
    invoke-virtual {p1}, Lcom/zykj/study/bean/course/CatalogBean;->getId()I

    .line 72
    .line 73
    .line 74
    move-result v5

    .line 75
    invoke-virtual {v2}, Lcom/zykj/study/bean/course/CourseBean;->getId()I

    .line 76
    .line 77
    .line 78
    move-result v6

    .line 79
    new-instance v7, Ljava/lang/StringBuilder;

    .line 80
    .line 81
    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    .line 82
    .line 83
    .line 84
    invoke-virtual {v7, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 85
    .line 86
    .line 87
    const-string v3, "?token="

    .line 88
    .line 89
    invoke-virtual {v7, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 90
    .line 91
    .line 92
    invoke-virtual {v7, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 93
    .line 94
    .line 95
    const-string v3, "&url="

    .line 96
    .line 97
    invoke-virtual {v7, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 98
    .line 99
    .line 100
    invoke-virtual {v7, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 101
    .line 102
    .line 103
    const-string p0, "#/?entry=study&catalogId="

    .line 104
    .line 105
    invoke-virtual {v7, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 106
    .line 107
    .line 108
    invoke-virtual {v7, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 109
    .line 110
    .line 111
    const-string p0, "&courseId="

    .line 112
    .line 113
    invoke-virtual {v7, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 114
    .line 115
    .line 116
    invoke-virtual {v7, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 117
    .line 118
    .line 119
    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 120
    .line 121
    .line 122
    move-result-object v5

    .line 123
    invoke-virtual {p1}, Lcom/zykj/study/bean/course/CatalogBean;->getTitle()Ljava/lang/String;

    .line 124
    .line 125
    .line 126
    move-result-object v6

    .line 127
    const/4 v3, 0x0

    .line 128
    const/4 v4, 0x0

    .line 129
    invoke-virtual/range {v1 .. v6}, Lv4/c$h;->a(Lcom/zykj/study/bean/course/CourseBean;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroidx/navigation/NavDirections;

    .line 130
    .line 131
    .line 132
    move-result-object p0

    .line 133
    invoke-virtual {v0, p0}, Landroidx/navigation/NavController;->navigate(Landroidx/navigation/NavDirections;)V

    .line 134
    .line 135
    .line 136
    :cond_0
    sget-object p0, Lh7/p;->a:Lh7/p;

    .line 137
    .line 138
    return-object p0
.end method

.method public static final B(Lcom/zykj/study/ui/home/study/StudyProgressFragment;Lcom/zykj/study/data/CourseStudyEntity;)Lh7/p;
    .locals 4

    .line 1
    invoke-direct {p0}, Lcom/zykj/study/ui/home/study/StudyProgressFragment;->r()Lcom/zykj/study/viewmodels/NotifyDataChangedViewModel;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Lcom/zykj/study/viewmodels/NotifyDataChangedViewModel;->b()Ll8/q;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-interface {v0}, Ll8/q;->getValue()Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    check-cast v0, Ljava/lang/Boolean;

    .line 14
    .line 15
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    if-eqz p1, :cond_3

    .line 20
    .line 21
    if-eqz v0, :cond_0

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    invoke-virtual {p1}, Lcom/zykj/study/bean/course/CourseBean;->getStatus()Lcom/zykj/study/bean/course/CourseType;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    sget-object v1, Lcom/zykj/study/bean/course/CourseType;->DELETE:Lcom/zykj/study/bean/course/CourseType;

    .line 29
    .line 30
    const/4 v2, 0x0

    .line 31
    const-string v3, "getViewLifecycleOwner(...)"

    .line 32
    .line 33
    if-ne v0, v1, :cond_1

    .line 34
    .line 35
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getViewLifecycleOwner()Landroidx/lifecycle/LifecycleOwner;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    invoke-static {v0, v3}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 40
    .line 41
    .line 42
    invoke-static {v0}, Landroidx/lifecycle/LifecycleOwnerKt;->getLifecycleScope(Landroidx/lifecycle/LifecycleOwner;)Landroidx/lifecycle/LifecycleCoroutineScope;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    new-instance v1, Lcom/zykj/study/ui/home/study/StudyProgressFragment$initView$5$1;

    .line 47
    .line 48
    invoke-direct {v1, p0, v2}, Lcom/zykj/study/ui/home/study/StudyProgressFragment$initView$5$1;-><init>(Lcom/zykj/study/ui/home/study/StudyProgressFragment;Lm7/c;)V

    .line 49
    .line 50
    .line 51
    invoke-virtual {v0, v1}, Landroidx/lifecycle/LifecycleCoroutineScope;->launchWhenResumed(Lx7/p;)Lkotlinx/coroutines/n;

    .line 52
    .line 53
    .line 54
    :cond_1
    invoke-virtual {p1}, Lcom/zykj/study/bean/course/CourseBean;->getStatus()Lcom/zykj/study/bean/course/CourseType;

    .line 55
    .line 56
    .line 57
    move-result-object v0

    .line 58
    sget-object v1, Lcom/zykj/study/bean/course/CourseType;->UNDERCARRIAGE:Lcom/zykj/study/bean/course/CourseType;

    .line 59
    .line 60
    if-ne v0, v1, :cond_2

    .line 61
    .line 62
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getViewLifecycleOwner()Landroidx/lifecycle/LifecycleOwner;

    .line 63
    .line 64
    .line 65
    move-result-object v0

    .line 66
    invoke-static {v0, v3}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 67
    .line 68
    .line 69
    invoke-static {v0}, Landroidx/lifecycle/LifecycleOwnerKt;->getLifecycleScope(Landroidx/lifecycle/LifecycleOwner;)Landroidx/lifecycle/LifecycleCoroutineScope;

    .line 70
    .line 71
    .line 72
    move-result-object v0

    .line 73
    new-instance v1, Lcom/zykj/study/ui/home/study/StudyProgressFragment$initView$5$2;

    .line 74
    .line 75
    invoke-direct {v1, p0, v2}, Lcom/zykj/study/ui/home/study/StudyProgressFragment$initView$5$2;-><init>(Lcom/zykj/study/ui/home/study/StudyProgressFragment;Lm7/c;)V

    .line 76
    .line 77
    .line 78
    invoke-virtual {v0, v1}, Landroidx/lifecycle/LifecycleCoroutineScope;->launchWhenResumed(Lx7/p;)Lkotlinx/coroutines/n;

    .line 79
    .line 80
    .line 81
    :cond_2
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getViewLifecycleOwner()Landroidx/lifecycle/LifecycleOwner;

    .line 82
    .line 83
    .line 84
    move-result-object v0

    .line 85
    invoke-static {v0, v3}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 86
    .line 87
    .line 88
    invoke-static {v0}, Landroidx/lifecycle/LifecycleOwnerKt;->getLifecycleScope(Landroidx/lifecycle/LifecycleOwner;)Landroidx/lifecycle/LifecycleCoroutineScope;

    .line 89
    .line 90
    .line 91
    move-result-object v0

    .line 92
    new-instance v1, Lcom/zykj/study/ui/home/study/StudyProgressFragment$initView$5$3;

    .line 93
    .line 94
    invoke-direct {v1, p0, p1, v2}, Lcom/zykj/study/ui/home/study/StudyProgressFragment$initView$5$3;-><init>(Lcom/zykj/study/ui/home/study/StudyProgressFragment;Lcom/zykj/study/data/CourseStudyEntity;Lm7/c;)V

    .line 95
    .line 96
    .line 97
    invoke-virtual {v0, v1}, Landroidx/lifecycle/LifecycleCoroutineScope;->launchWhenResumed(Lx7/p;)Lkotlinx/coroutines/n;

    .line 98
    .line 99
    .line 100
    sget-object p0, Lh7/p;->a:Lh7/p;

    .line 101
    .line 102
    return-object p0

    .line 103
    :cond_3
    :goto_0
    invoke-virtual {p0}, Lcom/zykj/base/BaseFragment;->getMBindView()Landroidx/databinding/ViewDataBinding;

    .line 104
    .line 105
    .line 106
    move-result-object p0

    .line 107
    check-cast p0, Lcom/zykj/study/databinding/FragmentStudyProgressBinding;

    .line 108
    .line 109
    iget-object p0, p0, Lcom/zykj/study/databinding/FragmentStudyProgressBinding;->multipleStatusView:Lcom/zykj/study/view/MultipleStatusView;

    .line 110
    .line 111
    sget p1, Lcom/zykj/study/R$layout;->layout_status_course_not_selected:I

    .line 112
    .line 113
    invoke-virtual {p0, p1}, Lcom/zykj/study/view/MultipleStatusView;->d(I)V

    .line 114
    .line 115
    .line 116
    sget-object p0, Lh7/p;->a:Lh7/p;

    .line 117
    .line 118
    return-object p0
.end method

.method public static final C(Lcom/zykj/study/ui/home/study/StudyProgressFragment;Lcom/zykj/study/bean/course/CourseDetailsBean;)Lh7/p;
    .locals 5

    .line 1
    const-string v0, "catalogProgressAdapter"

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-nez p1, :cond_2

    .line 5
    .line 6
    invoke-direct {p0}, Lcom/zykj/study/ui/home/study/StudyProgressFragment;->s()Lcom/zykj/study/viewmodels/StudyViewModel;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    invoke-virtual {p1}, Lcom/zykj/study/viewmodels/StudyViewModel;->l()Landroidx/lifecycle/MutableLiveData;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    invoke-virtual {p1}, Landroidx/lifecycle/LiveData;->getValue()Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    if-nez p1, :cond_1

    .line 19
    .line 20
    invoke-virtual {p0}, Lcom/zykj/base/BaseFragment;->getMBindView()Landroidx/databinding/ViewDataBinding;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    check-cast p1, Lcom/zykj/study/databinding/FragmentStudyProgressBinding;

    .line 25
    .line 26
    invoke-virtual {p1, v1}, Lcom/zykj/study/databinding/FragmentStudyProgressBinding;->setEntity(Lcom/zykj/study/bean/course/CourseDetailsBean;)V

    .line 27
    .line 28
    .line 29
    iget-object p1, p0, Lcom/zykj/study/ui/home/study/StudyProgressFragment;->h:Lcom/zykj/study/adapter/CatalogProgressAdapter;

    .line 30
    .line 31
    if-nez p1, :cond_0

    .line 32
    .line 33
    invoke-static {v0}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    goto :goto_0

    .line 37
    :cond_0
    move-object v1, p1

    .line 38
    :goto_0
    invoke-static {}, Li7/v;->n()Ljava/util/List;

    .line 39
    .line 40
    .line 41
    move-result-object p1

    .line 42
    invoke-virtual {v1, p1}, Lcom/zykj/study/adapter/CatalogProgressAdapter;->g(Ljava/util/List;)V

    .line 43
    .line 44
    .line 45
    invoke-virtual {p0}, Lcom/zykj/base/BaseFragment;->getMBindView()Landroidx/databinding/ViewDataBinding;

    .line 46
    .line 47
    .line 48
    move-result-object p0

    .line 49
    check-cast p0, Lcom/zykj/study/databinding/FragmentStudyProgressBinding;

    .line 50
    .line 51
    iget-object p0, p0, Lcom/zykj/study/databinding/FragmentStudyProgressBinding;->multipleStatusView:Lcom/zykj/study/view/MultipleStatusView;

    .line 52
    .line 53
    sget p1, Lcom/zykj/study/R$layout;->layout_status_course_not_selected:I

    .line 54
    .line 55
    invoke-virtual {p0, p1}, Lcom/zykj/study/view/MultipleStatusView;->d(I)V

    .line 56
    .line 57
    .line 58
    goto :goto_1

    .line 59
    :cond_1
    invoke-virtual {p0}, Lcom/zykj/base/BaseFragment;->getMBindView()Landroidx/databinding/ViewDataBinding;

    .line 60
    .line 61
    .line 62
    move-result-object p0

    .line 63
    check-cast p0, Lcom/zykj/study/databinding/FragmentStudyProgressBinding;

    .line 64
    .line 65
    iget-object p0, p0, Lcom/zykj/study/databinding/FragmentStudyProgressBinding;->multipleStatusView:Lcom/zykj/study/view/MultipleStatusView;

    .line 66
    .line 67
    invoke-virtual {p0}, Lcom/zykj/study/view/MultipleStatusView;->k()V

    .line 68
    .line 69
    .line 70
    :goto_1
    sget-object p0, Lh7/p;->a:Lh7/p;

    .line 71
    .line 72
    return-object p0

    .line 73
    :cond_2
    invoke-virtual {p0}, Lcom/zykj/base/BaseFragment;->getMBindView()Landroidx/databinding/ViewDataBinding;

    .line 74
    .line 75
    .line 76
    move-result-object v2

    .line 77
    check-cast v2, Lcom/zykj/study/databinding/FragmentStudyProgressBinding;

    .line 78
    .line 79
    invoke-virtual {v2, p1}, Lcom/zykj/study/databinding/FragmentStudyProgressBinding;->setEntity(Lcom/zykj/study/bean/course/CourseDetailsBean;)V

    .line 80
    .line 81
    .line 82
    invoke-virtual {p1}, Lcom/zykj/study/bean/course/CourseBean;->getStatus()Lcom/zykj/study/bean/course/CourseType;

    .line 83
    .line 84
    .line 85
    move-result-object v2

    .line 86
    sget-object v3, Lcom/zykj/study/ui/home/study/StudyProgressFragment$a;->a:[I

    .line 87
    .line 88
    invoke-virtual {v2}, Ljava/lang/Enum;->ordinal()I

    .line 89
    .line 90
    .line 91
    move-result v2

    .line 92
    aget v2, v3, v2

    .line 93
    .line 94
    const/4 v3, 0x1

    .line 95
    if-eq v2, v3, :cond_8

    .line 96
    .line 97
    const/4 v4, 0x2

    .line 98
    if-eq v2, v4, :cond_4

    .line 99
    .line 100
    const/4 p1, 0x3

    .line 101
    if-ne v2, p1, :cond_3

    .line 102
    .line 103
    invoke-virtual {p0}, Lcom/zykj/base/BaseFragment;->getMBindView()Landroidx/databinding/ViewDataBinding;

    .line 104
    .line 105
    .line 106
    move-result-object p0

    .line 107
    check-cast p0, Lcom/zykj/study/databinding/FragmentStudyProgressBinding;

    .line 108
    .line 109
    iget-object p0, p0, Lcom/zykj/study/databinding/FragmentStudyProgressBinding;->multipleStatusView:Lcom/zykj/study/view/MultipleStatusView;

    .line 110
    .line 111
    sget p1, Lcom/zykj/study/R$layout;->layout_status_course_delete:I

    .line 112
    .line 113
    invoke-virtual {p0, p1}, Lcom/zykj/study/view/MultipleStatusView;->d(I)V

    .line 114
    .line 115
    .line 116
    goto :goto_4

    .line 117
    :cond_3
    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    .line 118
    .line 119
    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    .line 120
    .line 121
    .line 122
    throw p0

    .line 123
    :cond_4
    invoke-virtual {p1}, Lcom/zykj/study/bean/course/CourseDetailsBean;->getCatalogs()Ljava/util/List;

    .line 124
    .line 125
    .line 126
    move-result-object v2

    .line 127
    if-eqz v2, :cond_6

    .line 128
    .line 129
    invoke-interface {v2}, Ljava/util/List;->isEmpty()Z

    .line 130
    .line 131
    .line 132
    move-result v2

    .line 133
    if-ne v2, v3, :cond_6

    .line 134
    .line 135
    iget-object p1, p0, Lcom/zykj/study/ui/home/study/StudyProgressFragment;->h:Lcom/zykj/study/adapter/CatalogProgressAdapter;

    .line 136
    .line 137
    if-nez p1, :cond_5

    .line 138
    .line 139
    invoke-static {v0}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 140
    .line 141
    .line 142
    goto :goto_2

    .line 143
    :cond_5
    move-object v1, p1

    .line 144
    :goto_2
    invoke-static {}, Li7/v;->n()Ljava/util/List;

    .line 145
    .line 146
    .line 147
    move-result-object p1

    .line 148
    invoke-virtual {v1, p1}, Lcom/zykj/study/adapter/CatalogProgressAdapter;->g(Ljava/util/List;)V

    .line 149
    .line 150
    .line 151
    invoke-virtual {p0}, Lcom/zykj/base/BaseFragment;->getMBindView()Landroidx/databinding/ViewDataBinding;

    .line 152
    .line 153
    .line 154
    move-result-object p0

    .line 155
    check-cast p0, Lcom/zykj/study/databinding/FragmentStudyProgressBinding;

    .line 156
    .line 157
    iget-object p0, p0, Lcom/zykj/study/databinding/FragmentStudyProgressBinding;->multipleStatusView:Lcom/zykj/study/view/MultipleStatusView;

    .line 158
    .line 159
    sget p1, Lcom/zykj/study/R$layout;->layout_status_course_no_catalog:I

    .line 160
    .line 161
    invoke-virtual {p0, p1}, Lcom/zykj/study/view/MultipleStatusView;->d(I)V

    .line 162
    .line 163
    .line 164
    goto :goto_4

    .line 165
    :cond_6
    iget-object v2, p0, Lcom/zykj/study/ui/home/study/StudyProgressFragment;->h:Lcom/zykj/study/adapter/CatalogProgressAdapter;

    .line 166
    .line 167
    if-nez v2, :cond_7

    .line 168
    .line 169
    invoke-static {v0}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 170
    .line 171
    .line 172
    goto :goto_3

    .line 173
    :cond_7
    move-object v1, v2

    .line 174
    :goto_3
    invoke-direct {p0}, Lcom/zykj/study/ui/home/study/StudyProgressFragment;->s()Lcom/zykj/study/viewmodels/StudyViewModel;

    .line 175
    .line 176
    .line 177
    move-result-object v0

    .line 178
    invoke-virtual {p1}, Lcom/zykj/study/bean/course/CourseDetailsBean;->getCatalogs()Ljava/util/List;

    .line 179
    .line 180
    .line 181
    move-result-object p1

    .line 182
    invoke-virtual {v0, p1}, Lcom/zykj/study/viewmodels/StudyViewModel;->b(Ljava/util/List;)Ljava/util/List;

    .line 183
    .line 184
    .line 185
    move-result-object p1

    .line 186
    invoke-virtual {v1, p1}, Lcom/zykj/study/adapter/CatalogProgressAdapter;->g(Ljava/util/List;)V

    .line 187
    .line 188
    .line 189
    invoke-virtual {p0}, Lcom/zykj/base/BaseFragment;->getMBindView()Landroidx/databinding/ViewDataBinding;

    .line 190
    .line 191
    .line 192
    move-result-object p0

    .line 193
    check-cast p0, Lcom/zykj/study/databinding/FragmentStudyProgressBinding;

    .line 194
    .line 195
    iget-object p0, p0, Lcom/zykj/study/databinding/FragmentStudyProgressBinding;->multipleStatusView:Lcom/zykj/study/view/MultipleStatusView;

    .line 196
    .line 197
    invoke-virtual {p0}, Lcom/zykj/study/view/MultipleStatusView;->f()V

    .line 198
    .line 199
    .line 200
    goto :goto_4

    .line 201
    :cond_8
    invoke-virtual {p0}, Lcom/zykj/base/BaseFragment;->getMBindView()Landroidx/databinding/ViewDataBinding;

    .line 202
    .line 203
    .line 204
    move-result-object p0

    .line 205
    check-cast p0, Lcom/zykj/study/databinding/FragmentStudyProgressBinding;

    .line 206
    .line 207
    iget-object p0, p0, Lcom/zykj/study/databinding/FragmentStudyProgressBinding;->multipleStatusView:Lcom/zykj/study/view/MultipleStatusView;

    .line 208
    .line 209
    sget p1, Lcom/zykj/study/R$layout;->layout_status_course_undercarriage:I

    .line 210
    .line 211
    invoke-virtual {p0, p1}, Lcom/zykj/study/view/MultipleStatusView;->d(I)V

    .line 212
    .line 213
    .line 214
    :goto_4
    sget-object p0, Lh7/p;->a:Lh7/p;

    .line 215
    .line 216
    return-object p0
.end method

.method public static final D(Lcom/zykj/study/ui/home/study/StudyProgressFragment;)Landroidx/lifecycle/ViewModelStoreOwner;
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->requireParentFragment()Landroidx/fragment/app/Fragment;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    const-string v0, "requireParentFragment(...)"

    .line 6
    .line 7
    invoke-static {p0, v0}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    return-object p0
.end method

.method public static synthetic g(Lcom/zykj/study/ui/home/study/StudyProgressFragment;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/zykj/study/ui/home/study/StudyProgressFragment;->x(Lcom/zykj/study/ui/home/study/StudyProgressFragment;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic h(Lcom/zykj/study/ui/home/study/StudyProgressFragment;Lcom/zykj/study/data/CourseStudyEntity;)Lh7/p;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/zykj/study/ui/home/study/StudyProgressFragment;->B(Lcom/zykj/study/ui/home/study/StudyProgressFragment;Lcom/zykj/study/data/CourseStudyEntity;)Lh7/p;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic i(Lcom/zykj/study/ui/home/study/StudyProgressFragment;Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;Lcom/xuexiang/xui/widget/dialog/materialdialog/DialogAction;)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lcom/zykj/study/ui/home/study/StudyProgressFragment;->y(Lcom/zykj/study/ui/home/study/StudyProgressFragment;Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;Lcom/xuexiang/xui/widget/dialog/materialdialog/DialogAction;)V

    return-void
.end method

.method public static synthetic j(Lcom/zykj/study/ui/home/study/StudyProgressFragment;Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;Lcom/xuexiang/xui/widget/dialog/materialdialog/DialogAction;)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lcom/zykj/study/ui/home/study/StudyProgressFragment;->v(Lcom/zykj/study/ui/home/study/StudyProgressFragment;Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;Lcom/xuexiang/xui/widget/dialog/materialdialog/DialogAction;)V

    return-void
.end method

.method public static synthetic k(Lcom/zykj/study/ui/home/study/StudyProgressFragment;Lcom/zykj/study/bean/course/CourseDetailsBean;)Lh7/p;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/zykj/study/ui/home/study/StudyProgressFragment;->C(Lcom/zykj/study/ui/home/study/StudyProgressFragment;Lcom/zykj/study/bean/course/CourseDetailsBean;)Lh7/p;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic l(Lcom/zykj/study/ui/home/study/StudyProgressFragment;)Landroidx/lifecycle/ViewModelStoreOwner;
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/zykj/study/ui/home/study/StudyProgressFragment;->D(Lcom/zykj/study/ui/home/study/StudyProgressFragment;)Landroidx/lifecycle/ViewModelStoreOwner;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic m(Lcom/zykj/study/ui/home/study/StudyProgressFragment;Lcom/zykj/study/bean/course/CatalogBean;)Lh7/p;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/zykj/study/ui/home/study/StudyProgressFragment;->A(Lcom/zykj/study/ui/home/study/StudyProgressFragment;Lcom/zykj/study/bean/course/CatalogBean;)Lh7/p;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic n(Lcom/zykj/study/ui/home/study/StudyProgressFragment;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/zykj/study/ui/home/study/StudyProgressFragment;->u(Lcom/zykj/study/ui/home/study/StudyProgressFragment;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic o(Lcom/zykj/study/ui/home/study/StudyProgressFragment;Lcom/zykj/lib/login/proto/UserBean;)Lh7/p;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/zykj/study/ui/home/study/StudyProgressFragment;->z(Lcom/zykj/study/ui/home/study/StudyProgressFragment;Lcom/zykj/lib/login/proto/UserBean;)Lh7/p;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic p(Lcom/zykj/study/ui/home/study/StudyProgressFragment;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/zykj/study/ui/home/study/StudyProgressFragment;->w(Lcom/zykj/study/ui/home/study/StudyProgressFragment;Landroid/view/View;)V

    return-void
.end method

.method public static final synthetic q(Lcom/zykj/study/ui/home/study/StudyProgressFragment;)Lcom/zykj/study/viewmodels/StudyViewModel;
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/zykj/study/ui/home/study/StudyProgressFragment;->s()Lcom/zykj/study/viewmodels/StudyViewModel;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method private final r()Lcom/zykj/study/viewmodels/NotifyDataChangedViewModel;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/study/ui/home/study/StudyProgressFragment;->g:Lh7/d;

    .line 2
    .line 3
    invoke-interface {v0}, Lh7/d;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lcom/zykj/study/viewmodels/NotifyDataChangedViewModel;

    .line 8
    .line 9
    return-object v0
.end method

.method private final s()Lcom/zykj/study/viewmodels/StudyViewModel;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/study/ui/home/study/StudyProgressFragment;->f:Lh7/d;

    .line 2
    .line 3
    invoke-interface {v0}, Lh7/d;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lcom/zykj/study/viewmodels/StudyViewModel;

    .line 8
    .line 9
    return-object v0
.end method

.method public static final u(Lcom/zykj/study/ui/home/study/StudyProgressFragment;Landroid/view/View;)V
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
    new-instance v0, Ld5/n;

    .line 33
    .line 34
    invoke-direct {v0, p0}, Ld5/n;-><init>(Lcom/zykj/study/ui/home/study/StudyProgressFragment;)V

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

.method public static final v(Lcom/zykj/study/ui/home/study/StudyProgressFragment;Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;Lcom/xuexiang/xui/widget/dialog/materialdialog/DialogAction;)V
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
    invoke-direct {p0}, Lcom/zykj/study/ui/home/study/StudyProgressFragment;->s()Lcom/zykj/study/viewmodels/StudyViewModel;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    invoke-virtual {p0}, Lcom/zykj/study/viewmodels/StudyViewModel;->q()V

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method public static final w(Lcom/zykj/study/ui/home/study/StudyProgressFragment;Landroid/view/View;)V
    .locals 3

    .line 1
    invoke-direct {p0}, Lcom/zykj/study/ui/home/study/StudyProgressFragment;->s()Lcom/zykj/study/viewmodels/StudyViewModel;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-virtual {p1}, Lcom/zykj/study/viewmodels/StudyViewModel;->l()Landroidx/lifecycle/MutableLiveData;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    invoke-virtual {p1}, Landroidx/lifecycle/LiveData;->getValue()Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    check-cast p1, Lcom/zykj/study/data/CourseStudyEntity;

    .line 14
    .line 15
    if-eqz p1, :cond_0

    .line 16
    .line 17
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getViewLifecycleOwner()Landroidx/lifecycle/LifecycleOwner;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    const-string v1, "getViewLifecycleOwner(...)"

    .line 22
    .line 23
    invoke-static {v0, v1}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    invoke-static {v0}, Landroidx/lifecycle/LifecycleOwnerKt;->getLifecycleScope(Landroidx/lifecycle/LifecycleOwner;)Landroidx/lifecycle/LifecycleCoroutineScope;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    new-instance v1, Lcom/zykj/study/ui/home/study/StudyProgressFragment$initListener$3$1$1;

    .line 31
    .line 32
    const/4 v2, 0x0

    .line 33
    invoke-direct {v1, p0, p1, v2}, Lcom/zykj/study/ui/home/study/StudyProgressFragment$initListener$3$1$1;-><init>(Lcom/zykj/study/ui/home/study/StudyProgressFragment;Lcom/zykj/study/data/CourseStudyEntity;Lm7/c;)V

    .line 34
    .line 35
    .line 36
    invoke-virtual {v0, v1}, Landroidx/lifecycle/LifecycleCoroutineScope;->launchWhenResumed(Lx7/p;)Lkotlinx/coroutines/n;

    .line 37
    .line 38
    .line 39
    :cond_0
    return-void
.end method

.method public static final x(Lcom/zykj/study/ui/home/study/StudyProgressFragment;Landroid/view/View;)V
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
    new-instance v0, Ld5/o;

    .line 33
    .line 34
    invoke-direct {v0, p0}, Ld5/o;-><init>(Lcom/zykj/study/ui/home/study/StudyProgressFragment;)V

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

.method public static final y(Lcom/zykj/study/ui/home/study/StudyProgressFragment;Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;Lcom/xuexiang/xui/widget/dialog/materialdialog/DialogAction;)V
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
    invoke-direct {p0}, Lcom/zykj/study/ui/home/study/StudyProgressFragment;->s()Lcom/zykj/study/viewmodels/StudyViewModel;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    invoke-virtual {p0}, Lcom/zykj/study/viewmodels/StudyViewModel;->r()V

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method public static final z(Lcom/zykj/study/ui/home/study/StudyProgressFragment;Lcom/zykj/lib/login/proto/UserBean;)Lh7/p;
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/zykj/base/BaseFragment;->getMBindView()Landroidx/databinding/ViewDataBinding;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    check-cast p0, Lcom/zykj/study/databinding/FragmentStudyProgressBinding;

    .line 6
    .line 7
    invoke-virtual {p0, p1}, Lcom/zykj/study/databinding/FragmentStudyProgressBinding;->setUserInfo(Lcom/zykj/lib/login/proto/UserBean;)V

    .line 8
    .line 9
    .line 10
    sget-object p0, Lh7/p;->a:Lh7/p;

    .line 11
    .line 12
    return-object p0
.end method


# virtual methods
.method public initData(Lm7/c;)Ljava/lang/Object;
    .locals 4

    .line 1
    instance-of v0, p1, Lcom/zykj/study/ui/home/study/StudyProgressFragment$initData$1;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p1

    .line 6
    check-cast v0, Lcom/zykj/study/ui/home/study/StudyProgressFragment$initData$1;

    .line 7
    .line 8
    iget v1, v0, Lcom/zykj/study/ui/home/study/StudyProgressFragment$initData$1;->c:I

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
    iput v1, v0, Lcom/zykj/study/ui/home/study/StudyProgressFragment$initData$1;->c:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lcom/zykj/study/ui/home/study/StudyProgressFragment$initData$1;

    .line 21
    .line 22
    invoke-direct {v0, p0, p1}, Lcom/zykj/study/ui/home/study/StudyProgressFragment$initData$1;-><init>(Lcom/zykj/study/ui/home/study/StudyProgressFragment;Lm7/c;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p1, v0, Lcom/zykj/study/ui/home/study/StudyProgressFragment$initData$1;->a:Ljava/lang/Object;

    .line 26
    .line 27
    invoke-static {}, Ln7/a;->f()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    iget v2, v0, Lcom/zykj/study/ui/home/study/StudyProgressFragment$initData$1;->c:I

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
    iput v3, v0, Lcom/zykj/study/ui/home/study/StudyProgressFragment$initData$1;->c:I

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
    invoke-static {p0}, Landroidx/lifecycle/LifecycleOwnerKt;->getLifecycleScope(Landroidx/lifecycle/LifecycleOwner;)Landroidx/lifecycle/LifecycleCoroutineScope;

    .line 63
    .line 64
    .line 65
    move-result-object p1

    .line 66
    new-instance v0, Lcom/zykj/study/ui/home/study/StudyProgressFragment$initData$2;

    .line 67
    .line 68
    const/4 v1, 0x0

    .line 69
    invoke-direct {v0, p0, v1}, Lcom/zykj/study/ui/home/study/StudyProgressFragment$initData$2;-><init>(Lcom/zykj/study/ui/home/study/StudyProgressFragment;Lm7/c;)V

    .line 70
    .line 71
    .line 72
    invoke-virtual {p1, v0}, Landroidx/lifecycle/LifecycleCoroutineScope;->launchWhenResumed(Lx7/p;)Lkotlinx/coroutines/n;

    .line 73
    .line 74
    .line 75
    sget-object p1, Lh7/p;->a:Lh7/p;

    .line 76
    .line 77
    return-object p1
.end method

.method public initView(Landroid/os/Bundle;Lm7/c;)Ljava/lang/Object;
    .locals 10

    .line 1
    instance-of v0, p2, Lcom/zykj/study/ui/home/study/StudyProgressFragment$initView$1;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p2

    .line 6
    check-cast v0, Lcom/zykj/study/ui/home/study/StudyProgressFragment$initView$1;

    .line 7
    .line 8
    iget v1, v0, Lcom/zykj/study/ui/home/study/StudyProgressFragment$initView$1;->e:I

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
    iput v1, v0, Lcom/zykj/study/ui/home/study/StudyProgressFragment$initView$1;->e:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lcom/zykj/study/ui/home/study/StudyProgressFragment$initView$1;

    .line 21
    .line 22
    invoke-direct {v0, p0, p2}, Lcom/zykj/study/ui/home/study/StudyProgressFragment$initView$1;-><init>(Lcom/zykj/study/ui/home/study/StudyProgressFragment;Lm7/c;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p2, v0, Lcom/zykj/study/ui/home/study/StudyProgressFragment$initView$1;->c:Ljava/lang/Object;

    .line 26
    .line 27
    invoke-static {}, Ln7/a;->f()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    iget v2, v0, Lcom/zykj/study/ui/home/study/StudyProgressFragment$initView$1;->e:I

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
    iget-object p1, v0, Lcom/zykj/study/ui/home/study/StudyProgressFragment$initView$1;->b:Ljava/lang/Object;

    .line 39
    .line 40
    check-cast p1, Lcom/zykj/study/ui/home/study/StudyProgressFragment;

    .line 41
    .line 42
    iget-object v0, v0, Lcom/zykj/study/ui/home/study/StudyProgressFragment$initView$1;->a:Ljava/lang/Object;

    .line 43
    .line 44
    check-cast v0, Landroid/os/Bundle;

    .line 45
    .line 46
    invoke-static {p2}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 47
    .line 48
    .line 49
    goto :goto_1

    .line 50
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 51
    .line 52
    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 53
    .line 54
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 55
    .line 56
    .line 57
    throw p1

    .line 58
    :cond_2
    invoke-static {p2}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 59
    .line 60
    .line 61
    invoke-direct {p0}, Lcom/zykj/study/ui/home/study/StudyProgressFragment;->s()Lcom/zykj/study/viewmodels/StudyViewModel;

    .line 62
    .line 63
    .line 64
    move-result-object p2

    .line 65
    invoke-virtual {p2}, Lcom/zykj/study/viewmodels/StudyViewModel;->m()Landroidx/datastore/core/DataStore;

    .line 66
    .line 67
    .line 68
    move-result-object p2

    .line 69
    invoke-interface {p2}, Landroidx/datastore/core/DataStore;->getData()Ll8/c;

    .line 70
    .line 71
    .line 72
    move-result-object v4

    .line 73
    const/4 v8, 0x3

    .line 74
    const/4 v9, 0x0

    .line 75
    const/4 v5, 0x0

    .line 76
    const-wide/16 v6, 0x0

    .line 77
    .line 78
    invoke-static/range {v4 .. v9}, Landroidx/lifecycle/FlowLiveDataConversions;->asLiveData$default(Ll8/c;Lkotlin/coroutines/d;JILjava/lang/Object;)Landroidx/lifecycle/LiveData;

    .line 79
    .line 80
    .line 81
    move-result-object p2

    .line 82
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getViewLifecycleOwner()Landroidx/lifecycle/LifecycleOwner;

    .line 83
    .line 84
    .line 85
    move-result-object v2

    .line 86
    new-instance v4, Ld5/g;

    .line 87
    .line 88
    invoke-direct {v4, p0}, Ld5/g;-><init>(Lcom/zykj/study/ui/home/study/StudyProgressFragment;)V

    .line 89
    .line 90
    .line 91
    new-instance v5, Lcom/zykj/study/ui/home/study/StudyProgressFragment$b;

    .line 92
    .line 93
    invoke-direct {v5, v4}, Lcom/zykj/study/ui/home/study/StudyProgressFragment$b;-><init>(Lx7/l;)V

    .line 94
    .line 95
    .line 96
    invoke-virtual {p2, v2, v5}, Landroidx/lifecycle/LiveData;->observe(Landroidx/lifecycle/LifecycleOwner;Landroidx/lifecycle/Observer;)V

    .line 97
    .line 98
    .line 99
    invoke-direct {p0}, Lcom/zykj/study/ui/home/study/StudyProgressFragment;->s()Lcom/zykj/study/viewmodels/StudyViewModel;

    .line 100
    .line 101
    .line 102
    move-result-object p2

    .line 103
    invoke-virtual {p2}, Lcom/zykj/study/viewmodels/StudyViewModel;->m()Landroidx/datastore/core/DataStore;

    .line 104
    .line 105
    .line 106
    move-result-object p2

    .line 107
    invoke-interface {p2}, Landroidx/datastore/core/DataStore;->getData()Ll8/c;

    .line 108
    .line 109
    .line 110
    move-result-object p2

    .line 111
    invoke-static {p1}, Lo7/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 112
    .line 113
    .line 114
    move-result-object p1

    .line 115
    iput-object p1, v0, Lcom/zykj/study/ui/home/study/StudyProgressFragment$initView$1;->a:Ljava/lang/Object;

    .line 116
    .line 117
    iput-object p0, v0, Lcom/zykj/study/ui/home/study/StudyProgressFragment$initView$1;->b:Ljava/lang/Object;

    .line 118
    .line 119
    iput v3, v0, Lcom/zykj/study/ui/home/study/StudyProgressFragment$initView$1;->e:I

    .line 120
    .line 121
    invoke-static {p2, v0}, Ll8/e;->z(Ll8/c;Lm7/c;)Ljava/lang/Object;

    .line 122
    .line 123
    .line 124
    move-result-object p2

    .line 125
    if-ne p2, v1, :cond_3

    .line 126
    .line 127
    return-object v1

    .line 128
    :cond_3
    move-object p1, p0

    .line 129
    :goto_1
    check-cast p2, Lcom/zykj/lib/login/proto/UserBean;

    .line 130
    .line 131
    const/4 v0, 0x0

    .line 132
    if-eqz p2, :cond_4

    .line 133
    .line 134
    invoke-virtual {p2}, Lcom/zykj/lib/login/proto/UserBean;->getRole()Lcom/zykj/lib/login/proto/RoleType;

    .line 135
    .line 136
    .line 137
    move-result-object p2

    .line 138
    goto :goto_2

    .line 139
    :cond_4
    move-object p2, v0

    .line 140
    :goto_2
    sget-object v1, Lcom/zykj/lib/login/proto/RoleType;->Teacher:Lcom/zykj/lib/login/proto/RoleType;

    .line 141
    .line 142
    if-ne p2, v1, :cond_5

    .line 143
    .line 144
    goto :goto_3

    .line 145
    :cond_5
    const/4 v3, 0x0

    .line 146
    :goto_3
    invoke-direct {p0}, Lcom/zykj/study/ui/home/study/StudyProgressFragment;->s()Lcom/zykj/study/viewmodels/StudyViewModel;

    .line 147
    .line 148
    .line 149
    move-result-object p2

    .line 150
    invoke-virtual {p2}, Lcom/zykj/study/viewmodels/StudyViewModel;->k()Ljava/util/HashSet;

    .line 151
    .line 152
    .line 153
    move-result-object p2

    .line 154
    new-instance v1, Ld5/h;

    .line 155
    .line 156
    invoke-direct {v1, p0}, Ld5/h;-><init>(Lcom/zykj/study/ui/home/study/StudyProgressFragment;)V

    .line 157
    .line 158
    .line 159
    new-instance v2, Lcom/zykj/study/adapter/CatalogProgressAdapter;

    .line 160
    .line 161
    invoke-direct {v2, v3, p2, v1}, Lcom/zykj/study/adapter/CatalogProgressAdapter;-><init>(ZLjava/util/HashSet;Lx7/l;)V

    .line 162
    .line 163
    .line 164
    iput-object v2, p1, Lcom/zykj/study/ui/home/study/StudyProgressFragment;->h:Lcom/zykj/study/adapter/CatalogProgressAdapter;

    .line 165
    .line 166
    invoke-virtual {p0}, Lcom/zykj/base/BaseFragment;->getMBindView()Landroidx/databinding/ViewDataBinding;

    .line 167
    .line 168
    .line 169
    move-result-object p1

    .line 170
    check-cast p1, Lcom/zykj/study/databinding/FragmentStudyProgressBinding;

    .line 171
    .line 172
    iget-object p1, p1, Lcom/zykj/study/databinding/FragmentStudyProgressBinding;->recyclerProgress:Landroidx/recyclerview/widget/RecyclerView;

    .line 173
    .line 174
    iget-object p2, p0, Lcom/zykj/study/ui/home/study/StudyProgressFragment;->h:Lcom/zykj/study/adapter/CatalogProgressAdapter;

    .line 175
    .line 176
    if-nez p2, :cond_6

    .line 177
    .line 178
    const-string p2, "catalogProgressAdapter"

    .line 179
    .line 180
    invoke-static {p2}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 181
    .line 182
    .line 183
    goto :goto_4

    .line 184
    :cond_6
    move-object v0, p2

    .line 185
    :goto_4
    invoke-virtual {p1, v0}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(Landroidx/recyclerview/widget/RecyclerView$Adapter;)V

    .line 186
    .line 187
    .line 188
    invoke-direct {p0}, Lcom/zykj/study/ui/home/study/StudyProgressFragment;->s()Lcom/zykj/study/viewmodels/StudyViewModel;

    .line 189
    .line 190
    .line 191
    move-result-object p1

    .line 192
    invoke-virtual {p1}, Lcom/zykj/study/viewmodels/StudyViewModel;->l()Landroidx/lifecycle/MutableLiveData;

    .line 193
    .line 194
    .line 195
    move-result-object p1

    .line 196
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getViewLifecycleOwner()Landroidx/lifecycle/LifecycleOwner;

    .line 197
    .line 198
    .line 199
    move-result-object p2

    .line 200
    new-instance v0, Ld5/i;

    .line 201
    .line 202
    invoke-direct {v0, p0}, Ld5/i;-><init>(Lcom/zykj/study/ui/home/study/StudyProgressFragment;)V

    .line 203
    .line 204
    .line 205
    new-instance v1, Lcom/zykj/study/ui/home/study/StudyProgressFragment$b;

    .line 206
    .line 207
    invoke-direct {v1, v0}, Lcom/zykj/study/ui/home/study/StudyProgressFragment$b;-><init>(Lx7/l;)V

    .line 208
    .line 209
    .line 210
    invoke-virtual {p1, p2, v1}, Landroidx/lifecycle/LiveData;->observe(Landroidx/lifecycle/LifecycleOwner;Landroidx/lifecycle/Observer;)V

    .line 211
    .line 212
    .line 213
    invoke-direct {p0}, Lcom/zykj/study/ui/home/study/StudyProgressFragment;->s()Lcom/zykj/study/viewmodels/StudyViewModel;

    .line 214
    .line 215
    .line 216
    move-result-object p1

    .line 217
    invoke-virtual {p1}, Lcom/zykj/study/viewmodels/StudyViewModel;->f()Landroidx/lifecycle/MutableLiveData;

    .line 218
    .line 219
    .line 220
    move-result-object p1

    .line 221
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getViewLifecycleOwner()Landroidx/lifecycle/LifecycleOwner;

    .line 222
    .line 223
    .line 224
    move-result-object p2

    .line 225
    new-instance v0, Ld5/j;

    .line 226
    .line 227
    invoke-direct {v0, p0}, Ld5/j;-><init>(Lcom/zykj/study/ui/home/study/StudyProgressFragment;)V

    .line 228
    .line 229
    .line 230
    new-instance v1, Lcom/zykj/study/ui/home/study/StudyProgressFragment$b;

    .line 231
    .line 232
    invoke-direct {v1, v0}, Lcom/zykj/study/ui/home/study/StudyProgressFragment$b;-><init>(Lx7/l;)V

    .line 233
    .line 234
    .line 235
    invoke-virtual {p1, p2, v1}, Landroidx/lifecycle/LiveData;->observe(Landroidx/lifecycle/LifecycleOwner;Landroidx/lifecycle/Observer;)V

    .line 236
    .line 237
    .line 238
    invoke-virtual {p0}, Lcom/zykj/study/ui/home/study/StudyProgressFragment;->t()V

    .line 239
    .line 240
    .line 241
    sget-object p1, Lh7/p;->a:Lh7/p;

    .line 242
    .line 243
    return-object p1
.end method

.method public layoutId()I
    .locals 1

    .line 1
    sget v0, Lcom/zykj/study/R$layout;->fragment_study_progress:I

    .line 2
    .line 3
    return v0
.end method

.method public final t()V
    .locals 2

    .line 1
    invoke-virtual {p0}, Lcom/zykj/base/BaseFragment;->getMBindView()Landroidx/databinding/ViewDataBinding;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    check-cast v0, Lcom/zykj/study/databinding/FragmentStudyProgressBinding;

    .line 6
    .line 7
    iget-object v0, v0, Lcom/zykj/study/databinding/FragmentStudyProgressBinding;->courseStatusBtn:Lcom/zykj/study/databinding/ItemCourseStatusBtnBinding;

    .line 8
    .line 9
    iget-object v0, v0, Lcom/zykj/study/databinding/ItemCourseStatusBtnBinding;->btSubscribeCancel:Landroid/widget/Button;

    .line 10
    .line 11
    new-instance v1, Ld5/k;

    .line 12
    .line 13
    invoke-direct {v1, p0}, Ld5/k;-><init>(Lcom/zykj/study/ui/home/study/StudyProgressFragment;)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 17
    .line 18
    .line 19
    invoke-virtual {p0}, Lcom/zykj/base/BaseFragment;->getMBindView()Landroidx/databinding/ViewDataBinding;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    check-cast v0, Lcom/zykj/study/databinding/FragmentStudyProgressBinding;

    .line 24
    .line 25
    iget-object v0, v0, Lcom/zykj/study/databinding/FragmentStudyProgressBinding;->courseStatusBtn:Lcom/zykj/study/databinding/ItemCourseStatusBtnBinding;

    .line 26
    .line 27
    iget-object v0, v0, Lcom/zykj/study/databinding/ItemCourseStatusBtnBinding;->btnChoiceToTeach:Landroid/widget/Button;

    .line 28
    .line 29
    new-instance v1, Ld5/l;

    .line 30
    .line 31
    invoke-direct {v1, p0}, Ld5/l;-><init>(Lcom/zykj/study/ui/home/study/StudyProgressFragment;)V

    .line 32
    .line 33
    .line 34
    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 35
    .line 36
    .line 37
    invoke-virtual {p0}, Lcom/zykj/base/BaseFragment;->getMBindView()Landroidx/databinding/ViewDataBinding;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    check-cast v0, Lcom/zykj/study/databinding/FragmentStudyProgressBinding;

    .line 42
    .line 43
    iget-object v0, v0, Lcom/zykj/study/databinding/FragmentStudyProgressBinding;->multipleStatusView:Lcom/zykj/study/view/MultipleStatusView;

    .line 44
    .line 45
    new-instance v1, Ld5/m;

    .line 46
    .line 47
    invoke-direct {v1, p0}, Ld5/m;-><init>(Lcom/zykj/study/ui/home/study/StudyProgressFragment;)V

    .line 48
    .line 49
    .line 50
    invoke-virtual {v0, v1}, Lcom/zykj/study/view/MultipleStatusView;->setOnRetryClickListener(Landroid/view/View$OnClickListener;)V

    .line 51
    .line 52
    .line 53
    return-void
.end method
