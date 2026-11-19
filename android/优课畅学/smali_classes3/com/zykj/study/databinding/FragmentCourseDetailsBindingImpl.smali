.class public Lcom/zykj/study/databinding/FragmentCourseDetailsBindingImpl;
.super Lcom/zykj/study/databinding/FragmentCourseDetailsBinding;
.source "SourceFile"


# static fields
.field private static final sIncludes:Landroidx/databinding/ViewDataBinding$IncludedLayouts;
    .annotation build Landroidx/annotation/Nullable;
    .end annotation
.end field

.field private static final sViewsWithIds:Landroid/util/SparseIntArray;
    .annotation build Landroidx/annotation/Nullable;
    .end annotation
.end field


# instance fields
.field private mDirtyFlags:J

.field private final mboundView0:Lcom/zykj/study/databinding/LayoutBindViewModelBinding;
    .annotation build Landroidx/annotation/Nullable;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 6

    .line 1
    new-instance v0, Landroidx/databinding/ViewDataBinding$IncludedLayouts;

    .line 2
    .line 3
    const/4 v1, 0x6

    .line 4
    invoke-direct {v0, v1}, Landroidx/databinding/ViewDataBinding$IncludedLayouts;-><init>(I)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lcom/zykj/study/databinding/FragmentCourseDetailsBindingImpl;->sIncludes:Landroidx/databinding/ViewDataBinding$IncludedLayouts;

    .line 8
    .line 9
    const-string v1, "layout_course_details_catalog"

    .line 10
    .line 11
    const-string v2, "layout_bind_view_model"

    .line 12
    .line 13
    const-string v3, "layout_course_synopsis"

    .line 14
    .line 15
    filled-new-array {v3, v1, v2}, [Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    const/4 v2, 0x2

    .line 20
    const/4 v3, 0x3

    .line 21
    const/4 v4, 0x1

    .line 22
    filled-new-array {v4, v2, v3}, [I

    .line 23
    .line 24
    .line 25
    move-result-object v2

    .line 26
    sget v3, Lcom/zykj/study/R$layout;->layout_course_synopsis:I

    .line 27
    .line 28
    sget v4, Lcom/zykj/study/R$layout;->layout_course_details_catalog:I

    .line 29
    .line 30
    sget v5, Lcom/zykj/study/R$layout;->layout_bind_view_model:I

    .line 31
    .line 32
    filled-new-array {v3, v4, v5}, [I

    .line 33
    .line 34
    .line 35
    move-result-object v3

    .line 36
    const/4 v4, 0x0

    .line 37
    invoke-virtual {v0, v4, v1, v2, v3}, Landroidx/databinding/ViewDataBinding$IncludedLayouts;->setIncludes(I[Ljava/lang/String;[I[I)V

    .line 38
    .line 39
    .line 40
    new-instance v0, Landroid/util/SparseIntArray;

    .line 41
    .line 42
    invoke-direct {v0}, Landroid/util/SparseIntArray;-><init>()V

    .line 43
    .line 44
    .line 45
    sput-object v0, Lcom/zykj/study/databinding/FragmentCourseDetailsBindingImpl;->sViewsWithIds:Landroid/util/SparseIntArray;

    .line 46
    .line 47
    sget v1, Lcom/zykj/study/R$id;->toolbar2:I

    .line 48
    .line 49
    const/4 v2, 0x4

    .line 50
    invoke-virtual {v0, v1, v2}, Landroid/util/SparseIntArray;->put(II)V

    .line 51
    .line 52
    .line 53
    sget v1, Lcom/zykj/study/R$id;->guideline2:I

    .line 54
    .line 55
    const/4 v2, 0x5

    .line 56
    invoke-virtual {v0, v1, v2}, Landroid/util/SparseIntArray;->put(II)V

    .line 57
    .line 58
    .line 59
    return-void
.end method

.method public constructor <init>(Landroidx/databinding/DataBindingComponent;Landroid/view/View;)V
    .locals 3
    .param p1    # Landroidx/databinding/DataBindingComponent;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param
    .param p2    # Landroid/view/View;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 1
    sget-object v0, Lcom/zykj/study/databinding/FragmentCourseDetailsBindingImpl;->sIncludes:Landroidx/databinding/ViewDataBinding$IncludedLayouts;

    sget-object v1, Lcom/zykj/study/databinding/FragmentCourseDetailsBindingImpl;->sViewsWithIds:Landroid/util/SparseIntArray;

    const/4 v2, 0x6

    invoke-static {p1, p2, v2, v0, v1}, Landroidx/databinding/ViewDataBinding;->mapBindings(Landroidx/databinding/DataBindingComponent;Landroid/view/View;ILandroidx/databinding/ViewDataBinding$IncludedLayouts;Landroid/util/SparseIntArray;)[Ljava/lang/Object;

    move-result-object v0

    invoke-direct {p0, p1, p2, v0}, Lcom/zykj/study/databinding/FragmentCourseDetailsBindingImpl;-><init>(Landroidx/databinding/DataBindingComponent;Landroid/view/View;[Ljava/lang/Object;)V

    return-void
.end method

.method private constructor <init>(Landroidx/databinding/DataBindingComponent;Landroid/view/View;[Ljava/lang/Object;)V
    .locals 10

    const/4 v0, 0x2

    .line 2
    aget-object v0, p3, v0

    move-object v5, v0

    check-cast v5, Lcom/zykj/study/databinding/LayoutCourseDetailsCatalogBinding;

    const/4 v0, 0x1

    aget-object v0, p3, v0

    move-object v6, v0

    check-cast v6, Lcom/zykj/study/databinding/LayoutCourseSynopsisBinding;

    const/4 v0, 0x0

    aget-object v0, p3, v0

    move-object v7, v0

    check-cast v7, Landroidx/constraintlayout/widget/ConstraintLayout;

    const/4 v0, 0x5

    aget-object v0, p3, v0

    move-object v8, v0

    check-cast v8, Landroidx/constraintlayout/widget/Guideline;

    const/4 v0, 0x4

    aget-object v0, p3, v0

    move-object v9, v0

    check-cast v9, Lcom/xuexiang/xui/widget/actionbar/TitleBar;

    const/4 v4, 0x6

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    invoke-direct/range {v1 .. v9}, Lcom/zykj/study/databinding/FragmentCourseDetailsBinding;-><init>(Ljava/lang/Object;Landroid/view/View;ILcom/zykj/study/databinding/LayoutCourseDetailsCatalogBinding;Lcom/zykj/study/databinding/LayoutCourseSynopsisBinding;Landroidx/constraintlayout/widget/ConstraintLayout;Landroidx/constraintlayout/widget/Guideline;Lcom/xuexiang/xui/widget/actionbar/TitleBar;)V

    const-wide/16 p1, -0x1

    .line 3
    iput-wide p1, v1, Lcom/zykj/study/databinding/FragmentCourseDetailsBindingImpl;->mDirtyFlags:J

    .line 4
    iget-object p1, v1, Lcom/zykj/study/databinding/FragmentCourseDetailsBinding;->courseCatalog:Lcom/zykj/study/databinding/LayoutCourseDetailsCatalogBinding;

    invoke-virtual {p0, p1}, Landroidx/databinding/ViewDataBinding;->setContainedBinding(Landroidx/databinding/ViewDataBinding;)V

    .line 5
    iget-object p1, v1, Lcom/zykj/study/databinding/FragmentCourseDetailsBinding;->courseSynopsis:Lcom/zykj/study/databinding/LayoutCourseSynopsisBinding;

    invoke-virtual {p0, p1}, Landroidx/databinding/ViewDataBinding;->setContainedBinding(Landroidx/databinding/ViewDataBinding;)V

    .line 6
    iget-object p1, v1, Lcom/zykj/study/databinding/FragmentCourseDetailsBinding;->fragmentCourseDetails:Landroidx/constraintlayout/widget/ConstraintLayout;

    const/4 p2, 0x0

    invoke-virtual {p1, p2}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    const/4 p1, 0x3

    .line 7
    aget-object p1, p3, p1

    check-cast p1, Lcom/zykj/study/databinding/LayoutBindViewModelBinding;

    iput-object p1, v1, Lcom/zykj/study/databinding/FragmentCourseDetailsBindingImpl;->mboundView0:Lcom/zykj/study/databinding/LayoutBindViewModelBinding;

    .line 8
    invoke-virtual {p0, p1}, Landroidx/databinding/ViewDataBinding;->setContainedBinding(Landroidx/databinding/ViewDataBinding;)V

    .line 9
    invoke-virtual {p0, v3}, Landroidx/databinding/ViewDataBinding;->setRootTag(Landroid/view/View;)V

    .line 10
    invoke-virtual {p0}, Lcom/zykj/study/databinding/FragmentCourseDetailsBindingImpl;->invalidateAll()V

    return-void
.end method

.method private onChangeCourseCatalog(Lcom/zykj/study/databinding/LayoutCourseDetailsCatalogBinding;I)Z
    .locals 2

    .line 1
    if-nez p2, :cond_0

    .line 2
    .line 3
    monitor-enter p0

    .line 4
    :try_start_0
    iget-wide p1, p0, Lcom/zykj/study/databinding/FragmentCourseDetailsBindingImpl;->mDirtyFlags:J

    .line 5
    .line 6
    const-wide/16 v0, 0x10

    .line 7
    .line 8
    or-long/2addr p1, v0

    .line 9
    iput-wide p1, p0, Lcom/zykj/study/databinding/FragmentCourseDetailsBindingImpl;->mDirtyFlags:J

    .line 10
    .line 11
    monitor-exit p0

    .line 12
    const/4 p1, 0x1

    .line 13
    return p1

    .line 14
    :catchall_0
    move-exception p1

    .line 15
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 16
    throw p1

    .line 17
    :cond_0
    const/4 p1, 0x0

    .line 18
    return p1
.end method

.method private onChangeCourseSynopsis(Lcom/zykj/study/databinding/LayoutCourseSynopsisBinding;I)Z
    .locals 2

    .line 1
    if-nez p2, :cond_0

    .line 2
    .line 3
    monitor-enter p0

    .line 4
    :try_start_0
    iget-wide p1, p0, Lcom/zykj/study/databinding/FragmentCourseDetailsBindingImpl;->mDirtyFlags:J

    .line 5
    .line 6
    const-wide/16 v0, 0x8

    .line 7
    .line 8
    or-long/2addr p1, v0

    .line 9
    iput-wide p1, p0, Lcom/zykj/study/databinding/FragmentCourseDetailsBindingImpl;->mDirtyFlags:J

    .line 10
    .line 11
    monitor-exit p0

    .line 12
    const/4 p1, 0x1

    .line 13
    return p1

    .line 14
    :catchall_0
    move-exception p1

    .line 15
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 16
    throw p1

    .line 17
    :cond_0
    const/4 p1, 0x0

    .line 18
    return p1
.end method

.method private onChangeDetailsEntityCourseDetailsLiveData(Landroidx/lifecycle/MutableLiveData;I)Z
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/lifecycle/MutableLiveData<",
            "Lcom/zykj/study/bean/course/CourseDetailsBean;",
            ">;I)Z"
        }
    .end annotation

    .line 1
    if-nez p2, :cond_0

    .line 2
    .line 3
    monitor-enter p0

    .line 4
    :try_start_0
    iget-wide p1, p0, Lcom/zykj/study/databinding/FragmentCourseDetailsBindingImpl;->mDirtyFlags:J

    .line 5
    .line 6
    const-wide/16 v0, 0x1

    .line 7
    .line 8
    or-long/2addr p1, v0

    .line 9
    iput-wide p1, p0, Lcom/zykj/study/databinding/FragmentCourseDetailsBindingImpl;->mDirtyFlags:J

    .line 10
    .line 11
    monitor-exit p0

    .line 12
    const/4 p1, 0x1

    .line 13
    return p1

    .line 14
    :catchall_0
    move-exception p1

    .line 15
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 16
    throw p1

    .line 17
    :cond_0
    const/4 p1, 0x0

    .line 18
    return p1
.end method

.method private onChangeDetailsEntityIsDialogVisible(Lcom/kunminx/architecture/ui/callback/UnPeekLiveData;I)Z
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/kunminx/architecture/ui/callback/UnPeekLiveData<",
            "Ljava/lang/Boolean;",
            ">;I)Z"
        }
    .end annotation

    .line 1
    if-nez p2, :cond_0

    .line 2
    .line 3
    monitor-enter p0

    .line 4
    :try_start_0
    iget-wide p1, p0, Lcom/zykj/study/databinding/FragmentCourseDetailsBindingImpl;->mDirtyFlags:J

    .line 5
    .line 6
    const-wide/16 v0, 0x20

    .line 7
    .line 8
    or-long/2addr p1, v0

    .line 9
    iput-wide p1, p0, Lcom/zykj/study/databinding/FragmentCourseDetailsBindingImpl;->mDirtyFlags:J

    .line 10
    .line 11
    monitor-exit p0

    .line 12
    const/4 p1, 0x1

    .line 13
    return p1

    .line 14
    :catchall_0
    move-exception p1

    .line 15
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 16
    throw p1

    .line 17
    :cond_0
    const/4 p1, 0x0

    .line 18
    return p1
.end method

.method private onChangeDetailsEntityToastLiveData(Lcom/kunminx/architecture/ui/callback/UnPeekLiveData;I)Z
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/kunminx/architecture/ui/callback/UnPeekLiveData<",
            "Lcom/zykj/base/bean/toast/ToastMessage;",
            ">;I)Z"
        }
    .end annotation

    .line 1
    if-nez p2, :cond_0

    .line 2
    .line 3
    monitor-enter p0

    .line 4
    :try_start_0
    iget-wide p1, p0, Lcom/zykj/study/databinding/FragmentCourseDetailsBindingImpl;->mDirtyFlags:J

    .line 5
    .line 6
    const-wide/16 v0, 0x4

    .line 7
    .line 8
    or-long/2addr p1, v0

    .line 9
    iput-wide p1, p0, Lcom/zykj/study/databinding/FragmentCourseDetailsBindingImpl;->mDirtyFlags:J

    .line 10
    .line 11
    monitor-exit p0

    .line 12
    const/4 p1, 0x1

    .line 13
    return p1

    .line 14
    :catchall_0
    move-exception p1

    .line 15
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 16
    throw p1

    .line 17
    :cond_0
    const/4 p1, 0x0

    .line 18
    return p1
.end method

.method private onChangeDetailsEntityUserBean(Landroidx/lifecycle/LiveData;I)Z
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/lifecycle/LiveData<",
            "Lcom/zykj/lib/login/proto/UserBean;",
            ">;I)Z"
        }
    .end annotation

    .line 1
    if-nez p2, :cond_0

    .line 2
    .line 3
    monitor-enter p0

    .line 4
    :try_start_0
    iget-wide p1, p0, Lcom/zykj/study/databinding/FragmentCourseDetailsBindingImpl;->mDirtyFlags:J

    .line 5
    .line 6
    const-wide/16 v0, 0x2

    .line 7
    .line 8
    or-long/2addr p1, v0

    .line 9
    iput-wide p1, p0, Lcom/zykj/study/databinding/FragmentCourseDetailsBindingImpl;->mDirtyFlags:J

    .line 10
    .line 11
    monitor-exit p0

    .line 12
    const/4 p1, 0x1

    .line 13
    return p1

    .line 14
    :catchall_0
    move-exception p1

    .line 15
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 16
    throw p1

    .line 17
    :cond_0
    const/4 p1, 0x0

    .line 18
    return p1
.end method


# virtual methods
.method public executeBindings()V
    .locals 21

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    monitor-enter p0

    .line 4
    :try_start_0
    iget-wide v2, v1, Lcom/zykj/study/databinding/FragmentCourseDetailsBindingImpl;->mDirtyFlags:J

    .line 5
    .line 6
    const-wide/16 v4, 0x0

    .line 7
    .line 8
    iput-wide v4, v1, Lcom/zykj/study/databinding/FragmentCourseDetailsBindingImpl;->mDirtyFlags:J

    .line 9
    .line 10
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 11
    iget-object v0, v1, Lcom/zykj/study/databinding/FragmentCourseDetailsBinding;->mDetailsEntity:Lcom/zykj/study/viewmodels/CourseDetailsViewModel;

    .line 12
    .line 13
    iget-object v6, v1, Lcom/zykj/study/databinding/FragmentCourseDetailsBinding;->mDictViewModel:Lcom/zykj/study/viewmodels/DictViewModel;

    .line 14
    .line 15
    const-wide/16 v7, 0x167

    .line 16
    .line 17
    and-long/2addr v7, v2

    .line 18
    cmp-long v7, v7, v4

    .line 19
    .line 20
    const-wide/16 v10, 0x144

    .line 21
    .line 22
    const-wide/16 v12, 0x142

    .line 23
    .line 24
    const-wide/16 v14, 0x141

    .line 25
    .line 26
    const/16 v16, 0x0

    .line 27
    .line 28
    if-eqz v7, :cond_a

    .line 29
    .line 30
    and-long v17, v2, v14

    .line 31
    .line 32
    cmp-long v7, v17, v4

    .line 33
    .line 34
    if-eqz v7, :cond_1

    .line 35
    .line 36
    if-eqz v0, :cond_0

    .line 37
    .line 38
    invoke-virtual {v0}, Lcom/zykj/study/viewmodels/CourseDetailsViewModel;->b()Landroidx/lifecycle/MutableLiveData;

    .line 39
    .line 40
    .line 41
    move-result-object v7

    .line 42
    :goto_0
    move-wide/from16 v17, v4

    .line 43
    .line 44
    goto :goto_1

    .line 45
    :cond_0
    move-object/from16 v7, v16

    .line 46
    .line 47
    goto :goto_0

    .line 48
    :goto_1
    const/4 v4, 0x0

    .line 49
    invoke-virtual {v1, v4, v7}, Landroidx/databinding/ViewDataBinding;->updateLiveDataRegistration(ILandroidx/lifecycle/LiveData;)Z

    .line 50
    .line 51
    .line 52
    if-eqz v7, :cond_2

    .line 53
    .line 54
    invoke-virtual {v7}, Landroidx/lifecycle/LiveData;->getValue()Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    move-result-object v4

    .line 58
    check-cast v4, Lcom/zykj/study/bean/course/CourseDetailsBean;

    .line 59
    .line 60
    goto :goto_2

    .line 61
    :cond_1
    move-wide/from16 v17, v4

    .line 62
    .line 63
    :cond_2
    move-object/from16 v4, v16

    .line 64
    .line 65
    :goto_2
    and-long v19, v2, v12

    .line 66
    .line 67
    cmp-long v5, v19, v17

    .line 68
    .line 69
    if-eqz v5, :cond_4

    .line 70
    .line 71
    if-eqz v0, :cond_3

    .line 72
    .line 73
    invoke-virtual {v0}, Lcom/zykj/study/viewmodels/CourseDetailsViewModel;->g()Landroidx/lifecycle/LiveData;

    .line 74
    .line 75
    .line 76
    move-result-object v5

    .line 77
    goto :goto_3

    .line 78
    :cond_3
    move-object/from16 v5, v16

    .line 79
    .line 80
    :goto_3
    const/4 v7, 0x1

    .line 81
    invoke-virtual {v1, v7, v5}, Landroidx/databinding/ViewDataBinding;->updateLiveDataRegistration(ILandroidx/lifecycle/LiveData;)Z

    .line 82
    .line 83
    .line 84
    if-eqz v5, :cond_4

    .line 85
    .line 86
    invoke-virtual {v5}, Landroidx/lifecycle/LiveData;->getValue()Ljava/lang/Object;

    .line 87
    .line 88
    .line 89
    move-result-object v5

    .line 90
    check-cast v5, Lcom/zykj/lib/login/proto/UserBean;

    .line 91
    .line 92
    goto :goto_4

    .line 93
    :cond_4
    move-object/from16 v5, v16

    .line 94
    .line 95
    :goto_4
    and-long v19, v2, v10

    .line 96
    .line 97
    cmp-long v7, v19, v17

    .line 98
    .line 99
    if-eqz v7, :cond_6

    .line 100
    .line 101
    if-eqz v0, :cond_5

    .line 102
    .line 103
    invoke-virtual {v0}, Lcom/zykj/base/BaseViewModel;->getToastLiveData()Lcom/kunminx/architecture/ui/callback/UnPeekLiveData;

    .line 104
    .line 105
    .line 106
    move-result-object v7

    .line 107
    :goto_5
    const-wide/16 v19, 0x160

    .line 108
    .line 109
    goto :goto_6

    .line 110
    :cond_5
    move-object/from16 v7, v16

    .line 111
    .line 112
    goto :goto_5

    .line 113
    :goto_6
    const/4 v8, 0x2

    .line 114
    invoke-virtual {v1, v8, v7}, Landroidx/databinding/ViewDataBinding;->updateLiveDataRegistration(ILandroidx/lifecycle/LiveData;)Z

    .line 115
    .line 116
    .line 117
    if-eqz v7, :cond_7

    .line 118
    .line 119
    invoke-virtual {v7}, Landroidx/lifecycle/LiveData;->getValue()Ljava/lang/Object;

    .line 120
    .line 121
    .line 122
    move-result-object v8

    .line 123
    check-cast v8, Lcom/zykj/base/bean/toast/ToastMessage;

    .line 124
    .line 125
    goto :goto_7

    .line 126
    :cond_6
    const-wide/16 v19, 0x160

    .line 127
    .line 128
    move-object/from16 v7, v16

    .line 129
    .line 130
    :cond_7
    :goto_7
    and-long v8, v2, v19

    .line 131
    .line 132
    cmp-long v8, v8, v17

    .line 133
    .line 134
    if-eqz v8, :cond_9

    .line 135
    .line 136
    if-eqz v0, :cond_8

    .line 137
    .line 138
    invoke-virtual {v0}, Lcom/zykj/base/BaseViewModel;->isDialogVisible()Lcom/kunminx/architecture/ui/callback/UnPeekLiveData;

    .line 139
    .line 140
    .line 141
    move-result-object v0

    .line 142
    goto :goto_8

    .line 143
    :cond_8
    move-object/from16 v0, v16

    .line 144
    .line 145
    :goto_8
    const/4 v8, 0x5

    .line 146
    invoke-virtual {v1, v8, v0}, Landroidx/databinding/ViewDataBinding;->updateLiveDataRegistration(ILandroidx/lifecycle/LiveData;)Z

    .line 147
    .line 148
    .line 149
    if-eqz v0, :cond_9

    .line 150
    .line 151
    invoke-virtual {v0}, Landroidx/lifecycle/LiveData;->getValue()Ljava/lang/Object;

    .line 152
    .line 153
    .line 154
    move-result-object v0

    .line 155
    move-object/from16 v16, v0

    .line 156
    .line 157
    check-cast v16, Ljava/lang/Boolean;

    .line 158
    .line 159
    :cond_9
    move-object/from16 v0, v16

    .line 160
    .line 161
    goto :goto_9

    .line 162
    :cond_a
    move-wide/from16 v17, v4

    .line 163
    .line 164
    const-wide/16 v19, 0x160

    .line 165
    .line 166
    move-object/from16 v0, v16

    .line 167
    .line 168
    move-object v4, v0

    .line 169
    move-object v5, v4

    .line 170
    move-object v7, v5

    .line 171
    :goto_9
    const-wide/16 v8, 0x180

    .line 172
    .line 173
    and-long/2addr v8, v2

    .line 174
    cmp-long v8, v8, v17

    .line 175
    .line 176
    and-long/2addr v14, v2

    .line 177
    cmp-long v9, v14, v17

    .line 178
    .line 179
    if-eqz v9, :cond_b

    .line 180
    .line 181
    iget-object v9, v1, Lcom/zykj/study/databinding/FragmentCourseDetailsBinding;->courseCatalog:Lcom/zykj/study/databinding/LayoutCourseDetailsCatalogBinding;

    .line 182
    .line 183
    invoke-virtual {v9, v4}, Lcom/zykj/study/databinding/LayoutCourseDetailsCatalogBinding;->setEntity(Lcom/zykj/study/bean/course/CourseDetailsBean;)V

    .line 184
    .line 185
    .line 186
    iget-object v9, v1, Lcom/zykj/study/databinding/FragmentCourseDetailsBinding;->courseSynopsis:Lcom/zykj/study/databinding/LayoutCourseSynopsisBinding;

    .line 187
    .line 188
    invoke-virtual {v9, v4}, Lcom/zykj/study/databinding/LayoutCourseSynopsisBinding;->setEntity(Lcom/zykj/study/bean/course/CourseDetailsBean;)V

    .line 189
    .line 190
    .line 191
    :cond_b
    if-eqz v8, :cond_c

    .line 192
    .line 193
    iget-object v4, v1, Lcom/zykj/study/databinding/FragmentCourseDetailsBinding;->courseSynopsis:Lcom/zykj/study/databinding/LayoutCourseSynopsisBinding;

    .line 194
    .line 195
    invoke-virtual {v4, v6}, Lcom/zykj/study/databinding/LayoutCourseSynopsisBinding;->setDictViewModel(Lcom/zykj/study/viewmodels/DictViewModel;)V

    .line 196
    .line 197
    .line 198
    :cond_c
    and-long v8, v2, v12

    .line 199
    .line 200
    cmp-long v4, v8, v17

    .line 201
    .line 202
    if-eqz v4, :cond_d

    .line 203
    .line 204
    iget-object v4, v1, Lcom/zykj/study/databinding/FragmentCourseDetailsBinding;->courseSynopsis:Lcom/zykj/study/databinding/LayoutCourseSynopsisBinding;

    .line 205
    .line 206
    invoke-virtual {v4, v5}, Lcom/zykj/study/databinding/LayoutCourseSynopsisBinding;->setUserInfo(Lcom/zykj/lib/login/proto/UserBean;)V

    .line 207
    .line 208
    .line 209
    :cond_d
    and-long v4, v2, v19

    .line 210
    .line 211
    cmp-long v4, v4, v17

    .line 212
    .line 213
    if-eqz v4, :cond_e

    .line 214
    .line 215
    iget-object v4, v1, Lcom/zykj/study/databinding/FragmentCourseDetailsBindingImpl;->mboundView0:Lcom/zykj/study/databinding/LayoutBindViewModelBinding;

    .line 216
    .line 217
    invoke-virtual {v4, v0}, Lcom/zykj/study/databinding/LayoutBindViewModelBinding;->setIsDialogVisible(Ljava/lang/Boolean;)V

    .line 218
    .line 219
    .line 220
    :cond_e
    and-long/2addr v2, v10

    .line 221
    cmp-long v0, v2, v17

    .line 222
    .line 223
    if-eqz v0, :cond_f

    .line 224
    .line 225
    iget-object v0, v1, Lcom/zykj/study/databinding/FragmentCourseDetailsBindingImpl;->mboundView0:Lcom/zykj/study/databinding/LayoutBindViewModelBinding;

    .line 226
    .line 227
    invoke-virtual {v0, v7}, Lcom/zykj/study/databinding/LayoutBindViewModelBinding;->setToastLiveData(Lcom/kunminx/architecture/ui/callback/ProtectedUnPeekLiveData;)V

    .line 228
    .line 229
    .line 230
    :cond_f
    iget-object v0, v1, Lcom/zykj/study/databinding/FragmentCourseDetailsBinding;->courseSynopsis:Lcom/zykj/study/databinding/LayoutCourseSynopsisBinding;

    .line 231
    .line 232
    invoke-static {v0}, Landroidx/databinding/ViewDataBinding;->executeBindingsOn(Landroidx/databinding/ViewDataBinding;)V

    .line 233
    .line 234
    .line 235
    iget-object v0, v1, Lcom/zykj/study/databinding/FragmentCourseDetailsBinding;->courseCatalog:Lcom/zykj/study/databinding/LayoutCourseDetailsCatalogBinding;

    .line 236
    .line 237
    invoke-static {v0}, Landroidx/databinding/ViewDataBinding;->executeBindingsOn(Landroidx/databinding/ViewDataBinding;)V

    .line 238
    .line 239
    .line 240
    iget-object v0, v1, Lcom/zykj/study/databinding/FragmentCourseDetailsBindingImpl;->mboundView0:Lcom/zykj/study/databinding/LayoutBindViewModelBinding;

    .line 241
    .line 242
    invoke-static {v0}, Landroidx/databinding/ViewDataBinding;->executeBindingsOn(Landroidx/databinding/ViewDataBinding;)V

    .line 243
    .line 244
    .line 245
    return-void

    .line 246
    :catchall_0
    move-exception v0

    .line 247
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 248
    throw v0
.end method

.method public hasPendingBindings()Z
    .locals 4

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-wide v0, p0, Lcom/zykj/study/databinding/FragmentCourseDetailsBindingImpl;->mDirtyFlags:J

    .line 3
    .line 4
    const-wide/16 v2, 0x0

    .line 5
    .line 6
    cmp-long v0, v0, v2

    .line 7
    .line 8
    const/4 v1, 0x1

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    monitor-exit p0

    .line 12
    return v1

    .line 13
    :catchall_0
    move-exception v0

    .line 14
    goto :goto_0

    .line 15
    :cond_0
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 16
    iget-object v0, p0, Lcom/zykj/study/databinding/FragmentCourseDetailsBinding;->courseSynopsis:Lcom/zykj/study/databinding/LayoutCourseSynopsisBinding;

    .line 17
    .line 18
    invoke-virtual {v0}, Landroidx/databinding/ViewDataBinding;->hasPendingBindings()Z

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    if-eqz v0, :cond_1

    .line 23
    .line 24
    return v1

    .line 25
    :cond_1
    iget-object v0, p0, Lcom/zykj/study/databinding/FragmentCourseDetailsBinding;->courseCatalog:Lcom/zykj/study/databinding/LayoutCourseDetailsCatalogBinding;

    .line 26
    .line 27
    invoke-virtual {v0}, Landroidx/databinding/ViewDataBinding;->hasPendingBindings()Z

    .line 28
    .line 29
    .line 30
    move-result v0

    .line 31
    if-eqz v0, :cond_2

    .line 32
    .line 33
    return v1

    .line 34
    :cond_2
    iget-object v0, p0, Lcom/zykj/study/databinding/FragmentCourseDetailsBindingImpl;->mboundView0:Lcom/zykj/study/databinding/LayoutBindViewModelBinding;

    .line 35
    .line 36
    invoke-virtual {v0}, Landroidx/databinding/ViewDataBinding;->hasPendingBindings()Z

    .line 37
    .line 38
    .line 39
    move-result v0

    .line 40
    if-eqz v0, :cond_3

    .line 41
    .line 42
    return v1

    .line 43
    :cond_3
    const/4 v0, 0x0

    .line 44
    return v0

    .line 45
    :goto_0
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 46
    throw v0
.end method

.method public invalidateAll()V
    .locals 2

    .line 1
    monitor-enter p0

    .line 2
    const-wide/16 v0, 0x100

    .line 3
    .line 4
    :try_start_0
    iput-wide v0, p0, Lcom/zykj/study/databinding/FragmentCourseDetailsBindingImpl;->mDirtyFlags:J

    .line 5
    .line 6
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 7
    iget-object v0, p0, Lcom/zykj/study/databinding/FragmentCourseDetailsBinding;->courseSynopsis:Lcom/zykj/study/databinding/LayoutCourseSynopsisBinding;

    .line 8
    .line 9
    invoke-virtual {v0}, Landroidx/databinding/ViewDataBinding;->invalidateAll()V

    .line 10
    .line 11
    .line 12
    iget-object v0, p0, Lcom/zykj/study/databinding/FragmentCourseDetailsBinding;->courseCatalog:Lcom/zykj/study/databinding/LayoutCourseDetailsCatalogBinding;

    .line 13
    .line 14
    invoke-virtual {v0}, Landroidx/databinding/ViewDataBinding;->invalidateAll()V

    .line 15
    .line 16
    .line 17
    iget-object v0, p0, Lcom/zykj/study/databinding/FragmentCourseDetailsBindingImpl;->mboundView0:Lcom/zykj/study/databinding/LayoutBindViewModelBinding;

    .line 18
    .line 19
    invoke-virtual {v0}, Landroidx/databinding/ViewDataBinding;->invalidateAll()V

    .line 20
    .line 21
    .line 22
    invoke-virtual {p0}, Landroidx/databinding/ViewDataBinding;->requestRebind()V

    .line 23
    .line 24
    .line 25
    return-void

    .line 26
    :catchall_0
    move-exception v0

    .line 27
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 28
    throw v0
.end method

.method public onFieldChange(ILjava/lang/Object;I)Z
    .locals 1

    .line 1
    if-eqz p1, :cond_5

    .line 2
    .line 3
    const/4 v0, 0x1

    .line 4
    if-eq p1, v0, :cond_4

    .line 5
    .line 6
    const/4 v0, 0x2

    .line 7
    if-eq p1, v0, :cond_3

    .line 8
    .line 9
    const/4 v0, 0x3

    .line 10
    if-eq p1, v0, :cond_2

    .line 11
    .line 12
    const/4 v0, 0x4

    .line 13
    if-eq p1, v0, :cond_1

    .line 14
    .line 15
    const/4 v0, 0x5

    .line 16
    if-eq p1, v0, :cond_0

    .line 17
    .line 18
    const/4 p1, 0x0

    .line 19
    return p1

    .line 20
    :cond_0
    check-cast p2, Lcom/kunminx/architecture/ui/callback/UnPeekLiveData;

    .line 21
    .line 22
    invoke-direct {p0, p2, p3}, Lcom/zykj/study/databinding/FragmentCourseDetailsBindingImpl;->onChangeDetailsEntityIsDialogVisible(Lcom/kunminx/architecture/ui/callback/UnPeekLiveData;I)Z

    .line 23
    .line 24
    .line 25
    move-result p1

    .line 26
    return p1

    .line 27
    :cond_1
    check-cast p2, Lcom/zykj/study/databinding/LayoutCourseDetailsCatalogBinding;

    .line 28
    .line 29
    invoke-direct {p0, p2, p3}, Lcom/zykj/study/databinding/FragmentCourseDetailsBindingImpl;->onChangeCourseCatalog(Lcom/zykj/study/databinding/LayoutCourseDetailsCatalogBinding;I)Z

    .line 30
    .line 31
    .line 32
    move-result p1

    .line 33
    return p1

    .line 34
    :cond_2
    check-cast p2, Lcom/zykj/study/databinding/LayoutCourseSynopsisBinding;

    .line 35
    .line 36
    invoke-direct {p0, p2, p3}, Lcom/zykj/study/databinding/FragmentCourseDetailsBindingImpl;->onChangeCourseSynopsis(Lcom/zykj/study/databinding/LayoutCourseSynopsisBinding;I)Z

    .line 37
    .line 38
    .line 39
    move-result p1

    .line 40
    return p1

    .line 41
    :cond_3
    check-cast p2, Lcom/kunminx/architecture/ui/callback/UnPeekLiveData;

    .line 42
    .line 43
    invoke-direct {p0, p2, p3}, Lcom/zykj/study/databinding/FragmentCourseDetailsBindingImpl;->onChangeDetailsEntityToastLiveData(Lcom/kunminx/architecture/ui/callback/UnPeekLiveData;I)Z

    .line 44
    .line 45
    .line 46
    move-result p1

    .line 47
    return p1

    .line 48
    :cond_4
    check-cast p2, Landroidx/lifecycle/LiveData;

    .line 49
    .line 50
    invoke-direct {p0, p2, p3}, Lcom/zykj/study/databinding/FragmentCourseDetailsBindingImpl;->onChangeDetailsEntityUserBean(Landroidx/lifecycle/LiveData;I)Z

    .line 51
    .line 52
    .line 53
    move-result p1

    .line 54
    return p1

    .line 55
    :cond_5
    check-cast p2, Landroidx/lifecycle/MutableLiveData;

    .line 56
    .line 57
    invoke-direct {p0, p2, p3}, Lcom/zykj/study/databinding/FragmentCourseDetailsBindingImpl;->onChangeDetailsEntityCourseDetailsLiveData(Landroidx/lifecycle/MutableLiveData;I)Z

    .line 58
    .line 59
    .line 60
    move-result p1

    .line 61
    return p1
.end method

.method public setDetailsEntity(Lcom/zykj/study/viewmodels/CourseDetailsViewModel;)V
    .locals 4
    .param p1    # Lcom/zykj/study/viewmodels/CourseDetailsViewModel;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param

    .line 1
    iput-object p1, p0, Lcom/zykj/study/databinding/FragmentCourseDetailsBinding;->mDetailsEntity:Lcom/zykj/study/viewmodels/CourseDetailsViewModel;

    .line 2
    .line 3
    monitor-enter p0

    .line 4
    :try_start_0
    iget-wide v0, p0, Lcom/zykj/study/databinding/FragmentCourseDetailsBindingImpl;->mDirtyFlags:J

    .line 5
    .line 6
    const-wide/16 v2, 0x40

    .line 7
    .line 8
    or-long/2addr v0, v2

    .line 9
    iput-wide v0, p0, Lcom/zykj/study/databinding/FragmentCourseDetailsBindingImpl;->mDirtyFlags:J

    .line 10
    .line 11
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 12
    const/16 p1, 0xa

    .line 13
    .line 14
    invoke-virtual {p0, p1}, Landroidx/databinding/BaseObservable;->notifyPropertyChanged(I)V

    .line 15
    .line 16
    .line 17
    invoke-super {p0}, Landroidx/databinding/ViewDataBinding;->requestRebind()V

    .line 18
    .line 19
    .line 20
    return-void

    .line 21
    :catchall_0
    move-exception p1

    .line 22
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 23
    throw p1
.end method

.method public setDictViewModel(Lcom/zykj/study/viewmodels/DictViewModel;)V
    .locals 4
    .param p1    # Lcom/zykj/study/viewmodels/DictViewModel;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param

    .line 1
    iput-object p1, p0, Lcom/zykj/study/databinding/FragmentCourseDetailsBinding;->mDictViewModel:Lcom/zykj/study/viewmodels/DictViewModel;

    .line 2
    .line 3
    monitor-enter p0

    .line 4
    :try_start_0
    iget-wide v0, p0, Lcom/zykj/study/databinding/FragmentCourseDetailsBindingImpl;->mDirtyFlags:J

    .line 5
    .line 6
    const-wide/16 v2, 0x80

    .line 7
    .line 8
    or-long/2addr v0, v2

    .line 9
    iput-wide v0, p0, Lcom/zykj/study/databinding/FragmentCourseDetailsBindingImpl;->mDirtyFlags:J

    .line 10
    .line 11
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 12
    const/16 p1, 0xb

    .line 13
    .line 14
    invoke-virtual {p0, p1}, Landroidx/databinding/BaseObservable;->notifyPropertyChanged(I)V

    .line 15
    .line 16
    .line 17
    invoke-super {p0}, Landroidx/databinding/ViewDataBinding;->requestRebind()V

    .line 18
    .line 19
    .line 20
    return-void

    .line 21
    :catchall_0
    move-exception p1

    .line 22
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 23
    throw p1
.end method

.method public setLifecycleOwner(Landroidx/lifecycle/LifecycleOwner;)V
    .locals 1
    .param p1    # Landroidx/lifecycle/LifecycleOwner;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param

    .line 1
    invoke-super {p0, p1}, Landroidx/databinding/ViewDataBinding;->setLifecycleOwner(Landroidx/lifecycle/LifecycleOwner;)V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/zykj/study/databinding/FragmentCourseDetailsBinding;->courseSynopsis:Lcom/zykj/study/databinding/LayoutCourseSynopsisBinding;

    .line 5
    .line 6
    invoke-virtual {v0, p1}, Landroidx/databinding/ViewDataBinding;->setLifecycleOwner(Landroidx/lifecycle/LifecycleOwner;)V

    .line 7
    .line 8
    .line 9
    iget-object v0, p0, Lcom/zykj/study/databinding/FragmentCourseDetailsBinding;->courseCatalog:Lcom/zykj/study/databinding/LayoutCourseDetailsCatalogBinding;

    .line 10
    .line 11
    invoke-virtual {v0, p1}, Landroidx/databinding/ViewDataBinding;->setLifecycleOwner(Landroidx/lifecycle/LifecycleOwner;)V

    .line 12
    .line 13
    .line 14
    iget-object v0, p0, Lcom/zykj/study/databinding/FragmentCourseDetailsBindingImpl;->mboundView0:Lcom/zykj/study/databinding/LayoutBindViewModelBinding;

    .line 15
    .line 16
    invoke-virtual {v0, p1}, Landroidx/databinding/ViewDataBinding;->setLifecycleOwner(Landroidx/lifecycle/LifecycleOwner;)V

    .line 17
    .line 18
    .line 19
    return-void
.end method

.method public setVariable(ILjava/lang/Object;)Z
    .locals 2
    .param p2    # Ljava/lang/Object;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param

    .line 1
    const/16 v0, 0xa

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    if-ne v0, p1, :cond_0

    .line 5
    .line 6
    check-cast p2, Lcom/zykj/study/viewmodels/CourseDetailsViewModel;

    .line 7
    .line 8
    invoke-virtual {p0, p2}, Lcom/zykj/study/databinding/FragmentCourseDetailsBindingImpl;->setDetailsEntity(Lcom/zykj/study/viewmodels/CourseDetailsViewModel;)V

    .line 9
    .line 10
    .line 11
    return v1

    .line 12
    :cond_0
    const/16 v0, 0xb

    .line 13
    .line 14
    if-ne v0, p1, :cond_1

    .line 15
    .line 16
    check-cast p2, Lcom/zykj/study/viewmodels/DictViewModel;

    .line 17
    .line 18
    invoke-virtual {p0, p2}, Lcom/zykj/study/databinding/FragmentCourseDetailsBindingImpl;->setDictViewModel(Lcom/zykj/study/viewmodels/DictViewModel;)V

    .line 19
    .line 20
    .line 21
    return v1

    .line 22
    :cond_1
    const/4 p1, 0x0

    .line 23
    return p1
.end method
