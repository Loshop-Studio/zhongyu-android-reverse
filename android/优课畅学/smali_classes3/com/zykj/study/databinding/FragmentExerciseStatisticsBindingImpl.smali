.class public Lcom/zykj/study/databinding/FragmentExerciseStatisticsBindingImpl;
.super Lcom/zykj/study/databinding/FragmentExerciseStatisticsBinding;
.source "SourceFile"

# interfaces
.implements Lr4/a$a;


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
.field private final mCallback7:Landroid/view/View$OnClickListener;
    .annotation build Landroidx/annotation/Nullable;
    .end annotation
.end field

.field private final mCallback8:Landroid/view/View$OnClickListener;
    .annotation build Landroidx/annotation/Nullable;
    .end annotation
.end field

.field private mDirtyFlags:J


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 1
    new-instance v0, Landroidx/databinding/ViewDataBinding$IncludedLayouts;

    .line 2
    .line 3
    const/16 v1, 0xd

    .line 4
    .line 5
    invoke-direct {v0, v1}, Landroidx/databinding/ViewDataBinding$IncludedLayouts;-><init>(I)V

    .line 6
    .line 7
    .line 8
    sput-object v0, Lcom/zykj/study/databinding/FragmentExerciseStatisticsBindingImpl;->sIncludes:Landroidx/databinding/ViewDataBinding$IncludedLayouts;

    .line 9
    .line 10
    const-string v1, "layout_bind_view_model"

    .line 11
    .line 12
    filled-new-array {v1}, [Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    const/4 v2, 0x6

    .line 17
    filled-new-array {v2}, [I

    .line 18
    .line 19
    .line 20
    move-result-object v2

    .line 21
    sget v3, Lcom/zykj/study/R$layout;->layout_bind_view_model:I

    .line 22
    .line 23
    filled-new-array {v3}, [I

    .line 24
    .line 25
    .line 26
    move-result-object v3

    .line 27
    const/4 v4, 0x0

    .line 28
    invoke-virtual {v0, v4, v1, v2, v3}, Landroidx/databinding/ViewDataBinding$IncludedLayouts;->setIncludes(I[Ljava/lang/String;[I[I)V

    .line 29
    .line 30
    .line 31
    new-instance v0, Landroid/util/SparseIntArray;

    .line 32
    .line 33
    invoke-direct {v0}, Landroid/util/SparseIntArray;-><init>()V

    .line 34
    .line 35
    .line 36
    sput-object v0, Lcom/zykj/study/databinding/FragmentExerciseStatisticsBindingImpl;->sViewsWithIds:Landroid/util/SparseIntArray;

    .line 37
    .line 38
    sget v1, Lcom/zykj/study/R$id;->toolbar:I

    .line 39
    .line 40
    const/4 v2, 0x7

    .line 41
    invoke-virtual {v0, v1, v2}, Landroid/util/SparseIntArray;->put(II)V

    .line 42
    .line 43
    .line 44
    sget v1, Lcom/zykj/study/R$id;->linearLayout:I

    .line 45
    .line 46
    const/16 v2, 0x8

    .line 47
    .line 48
    invoke-virtual {v0, v1, v2}, Landroid/util/SparseIntArray;->put(II)V

    .line 49
    .line 50
    .line 51
    sget v1, Lcom/zykj/study/R$id;->rv:I

    .line 52
    .line 53
    const/16 v2, 0x9

    .line 54
    .line 55
    invoke-virtual {v0, v1, v2}, Landroid/util/SparseIntArray;->put(II)V

    .line 56
    .line 57
    .line 58
    sget v1, Lcom/zykj/study/R$id;->view2:I

    .line 59
    .line 60
    const/16 v2, 0xa

    .line 61
    .line 62
    invoke-virtual {v0, v1, v2}, Landroid/util/SparseIntArray;->put(II)V

    .line 63
    .line 64
    .line 65
    sget v1, Lcom/zykj/study/R$id;->multiple_status_view:I

    .line 66
    .line 67
    const/16 v2, 0xb

    .line 68
    .line 69
    invoke-virtual {v0, v1, v2}, Landroid/util/SparseIntArray;->put(II)V

    .line 70
    .line 71
    .line 72
    sget v1, Lcom/zykj/study/R$id;->viewPager:I

    .line 73
    .line 74
    const/16 v2, 0xc

    .line 75
    .line 76
    invoke-virtual {v0, v1, v2}, Landroid/util/SparseIntArray;->put(II)V

    .line 77
    .line 78
    .line 79
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
    sget-object v0, Lcom/zykj/study/databinding/FragmentExerciseStatisticsBindingImpl;->sIncludes:Landroidx/databinding/ViewDataBinding$IncludedLayouts;

    sget-object v1, Lcom/zykj/study/databinding/FragmentExerciseStatisticsBindingImpl;->sViewsWithIds:Landroid/util/SparseIntArray;

    const/16 v2, 0xd

    invoke-static {p1, p2, v2, v0, v1}, Landroidx/databinding/ViewDataBinding;->mapBindings(Landroidx/databinding/DataBindingComponent;Landroid/view/View;ILandroidx/databinding/ViewDataBinding$IncludedLayouts;Landroid/util/SparseIntArray;)[Ljava/lang/Object;

    move-result-object v0

    invoke-direct {p0, p1, p2, v0}, Lcom/zykj/study/databinding/FragmentExerciseStatisticsBindingImpl;-><init>(Landroidx/databinding/DataBindingComponent;Landroid/view/View;[Ljava/lang/Object;)V

    return-void
.end method

.method private constructor <init>(Landroidx/databinding/DataBindingComponent;Landroid/view/View;[Ljava/lang/Object;)V
    .locals 17

    const/4 v0, 0x0

    .line 2
    aget-object v0, p3, v0

    move-object v4, v0

    check-cast v4, Landroidx/constraintlayout/widget/ConstraintLayout;

    const/4 v0, 0x6

    aget-object v0, p3, v0

    move-object v5, v0

    check-cast v5, Lcom/zykj/study/databinding/LayoutBindViewModelBinding;

    const/4 v0, 0x2

    aget-object v1, p3, v0

    move-object v6, v1

    check-cast v6, Landroid/widget/ImageView;

    const/4 v1, 0x3

    aget-object v1, p3, v1

    move-object v7, v1

    check-cast v7, Landroid/widget/ImageView;

    const/16 v1, 0x8

    aget-object v1, p3, v1

    move-object v8, v1

    check-cast v8, Landroid/widget/LinearLayout;

    const/16 v1, 0xb

    aget-object v1, p3, v1

    move-object v9, v1

    check-cast v9, Lcom/xuexiang/xui/widget/statelayout/MultipleStatusView;

    const/16 v1, 0x9

    aget-object v1, p3, v1

    move-object v10, v1

    check-cast v10, Landroidx/recyclerview/widget/RecyclerView;

    const/4 v1, 0x7

    aget-object v1, p3, v1

    move-object v11, v1

    check-cast v11, Lcom/xuexiang/xui/widget/actionbar/TitleBar;

    const/4 v1, 0x4

    aget-object v1, p3, v1

    move-object v12, v1

    check-cast v12, Landroid/widget/TextView;

    const/4 v1, 0x1

    aget-object v2, p3, v1

    move-object v13, v2

    check-cast v13, Landroid/widget/TextView;

    const/4 v2, 0x5

    aget-object v2, p3, v2

    move-object v14, v2

    check-cast v14, Landroid/widget/TextView;

    const/16 v2, 0xa

    aget-object v2, p3, v2

    move-object v15, v2

    check-cast v15, Landroid/view/View;

    const/16 v2, 0xc

    aget-object v2, p3, v2

    move-object/from16 v16, v2

    check-cast v16, Landroidx/viewpager2/widget/ViewPager2;

    const/4 v3, 0x5

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    invoke-direct/range {v0 .. v16}, Lcom/zykj/study/databinding/FragmentExerciseStatisticsBinding;-><init>(Ljava/lang/Object;Landroid/view/View;ILandroidx/constraintlayout/widget/ConstraintLayout;Lcom/zykj/study/databinding/LayoutBindViewModelBinding;Landroid/widget/ImageView;Landroid/widget/ImageView;Landroid/widget/LinearLayout;Lcom/xuexiang/xui/widget/statelayout/MultipleStatusView;Landroidx/recyclerview/widget/RecyclerView;Lcom/xuexiang/xui/widget/actionbar/TitleBar;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/view/View;Landroidx/viewpager2/widget/ViewPager2;)V

    const-wide/16 v1, -0x1

    .line 3
    iput-wide v1, v0, Lcom/zykj/study/databinding/FragmentExerciseStatisticsBindingImpl;->mDirtyFlags:J

    .line 4
    iget-object v1, v0, Lcom/zykj/study/databinding/FragmentExerciseStatisticsBinding;->fragmentTeachDetails:Landroidx/constraintlayout/widget/ConstraintLayout;

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 5
    iget-object v1, v0, Lcom/zykj/study/databinding/FragmentExerciseStatisticsBinding;->include:Lcom/zykj/study/databinding/LayoutBindViewModelBinding;

    invoke-virtual {v0, v1}, Landroidx/databinding/ViewDataBinding;->setContainedBinding(Landroidx/databinding/ViewDataBinding;)V

    .line 6
    iget-object v1, v0, Lcom/zykj/study/databinding/FragmentExerciseStatisticsBinding;->ivDown:Landroid/widget/ImageView;

    invoke-virtual {v1, v2}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 7
    iget-object v1, v0, Lcom/zykj/study/databinding/FragmentExerciseStatisticsBinding;->ivUp:Landroid/widget/ImageView;

    invoke-virtual {v1, v2}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 8
    iget-object v1, v0, Lcom/zykj/study/databinding/FragmentExerciseStatisticsBinding;->tvAllCondition:Landroid/widget/TextView;

    invoke-virtual {v1, v2}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 9
    iget-object v1, v0, Lcom/zykj/study/databinding/FragmentExerciseStatisticsBinding;->tvCourseGroupName:Landroid/widget/TextView;

    invoke-virtual {v1, v2}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 10
    iget-object v1, v0, Lcom/zykj/study/databinding/FragmentExerciseStatisticsBinding;->tvDoProblem:Landroid/widget/TextView;

    invoke-virtual {v1, v2}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    move-object/from16 v2, p2

    .line 11
    invoke-virtual {v0, v2}, Landroidx/databinding/ViewDataBinding;->setRootTag(Landroid/view/View;)V

    .line 12
    new-instance v1, Lr4/a;

    const/4 v2, 0x2

    invoke-direct {v1, v0, v2}, Lr4/a;-><init>(Lr4/a$a;I)V

    iput-object v1, v0, Lcom/zykj/study/databinding/FragmentExerciseStatisticsBindingImpl;->mCallback8:Landroid/view/View$OnClickListener;

    .line 13
    new-instance v1, Lr4/a;

    const/4 v2, 0x1

    invoke-direct {v1, v0, v2}, Lr4/a;-><init>(Lr4/a$a;I)V

    iput-object v1, v0, Lcom/zykj/study/databinding/FragmentExerciseStatisticsBindingImpl;->mCallback7:Landroid/view/View$OnClickListener;

    .line 14
    invoke-virtual {v0}, Lcom/zykj/study/databinding/FragmentExerciseStatisticsBindingImpl;->invalidateAll()V

    return-void
.end method

.method private onChangeInclude(Lcom/zykj/study/databinding/LayoutBindViewModelBinding;I)Z
    .locals 2

    .line 1
    if-nez p2, :cond_0

    .line 2
    .line 3
    monitor-enter p0

    .line 4
    :try_start_0
    iget-wide p1, p0, Lcom/zykj/study/databinding/FragmentExerciseStatisticsBindingImpl;->mDirtyFlags:J

    .line 5
    .line 6
    const-wide/16 v0, 0x1

    .line 7
    .line 8
    or-long/2addr p1, v0

    .line 9
    iput-wide p1, p0, Lcom/zykj/study/databinding/FragmentExerciseStatisticsBindingImpl;->mDirtyFlags:J

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

.method private onChangeViewModelCurrentSuperviseGroupLiveData(Landroidx/lifecycle/MutableLiveData;I)Z
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/lifecycle/MutableLiveData<",
            "Lcom/zykj/study/bean/teach/SuperviseGroup;",
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
    iget-wide p1, p0, Lcom/zykj/study/databinding/FragmentExerciseStatisticsBindingImpl;->mDirtyFlags:J

    .line 5
    .line 6
    const-wide/16 v0, 0x10

    .line 7
    .line 8
    or-long/2addr p1, v0

    .line 9
    iput-wide p1, p0, Lcom/zykj/study/databinding/FragmentExerciseStatisticsBindingImpl;->mDirtyFlags:J

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

.method private onChangeViewModelIsDialogVisible(Lcom/kunminx/architecture/ui/callback/UnPeekLiveData;I)Z
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
    iget-wide p1, p0, Lcom/zykj/study/databinding/FragmentExerciseStatisticsBindingImpl;->mDirtyFlags:J

    .line 5
    .line 6
    const-wide/16 v0, 0x4

    .line 7
    .line 8
    or-long/2addr p1, v0

    .line 9
    iput-wide p1, p0, Lcom/zykj/study/databinding/FragmentExerciseStatisticsBindingImpl;->mDirtyFlags:J

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

.method private onChangeViewModelIsMenuPopupShow(Landroidx/lifecycle/MutableLiveData;I)Z
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/lifecycle/MutableLiveData<",
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
    iget-wide p1, p0, Lcom/zykj/study/databinding/FragmentExerciseStatisticsBindingImpl;->mDirtyFlags:J

    .line 5
    .line 6
    const-wide/16 v0, 0x2

    .line 7
    .line 8
    or-long/2addr p1, v0

    .line 9
    iput-wide p1, p0, Lcom/zykj/study/databinding/FragmentExerciseStatisticsBindingImpl;->mDirtyFlags:J

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

.method private onChangeViewModelToastLiveData(Lcom/kunminx/architecture/ui/callback/UnPeekLiveData;I)Z
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
    iget-wide p1, p0, Lcom/zykj/study/databinding/FragmentExerciseStatisticsBindingImpl;->mDirtyFlags:J

    .line 5
    .line 6
    const-wide/16 v0, 0x8

    .line 7
    .line 8
    or-long/2addr p1, v0

    .line 9
    iput-wide p1, p0, Lcom/zykj/study/databinding/FragmentExerciseStatisticsBindingImpl;->mDirtyFlags:J

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
.method public final _internalCallbackOnClick(ILandroid/view/View;)V
    .locals 1

    .line 1
    const/4 p2, 0x1

    .line 2
    if-eq p1, p2, :cond_2

    .line 3
    .line 4
    const/4 v0, 0x2

    .line 5
    if-eq p1, v0, :cond_0

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    iget-object p1, p0, Lcom/zykj/study/databinding/FragmentExerciseStatisticsBinding;->mViewModel:Lcom/zykj/study/viewmodels/ExerciseStatisticsViewModel;

    .line 9
    .line 10
    if-eqz p1, :cond_1

    .line 11
    .line 12
    invoke-virtual {p1, p2}, Lcom/zykj/study/viewmodels/ExerciseStatisticsViewModel;->d(I)V

    .line 13
    .line 14
    .line 15
    :cond_1
    return-void

    .line 16
    :cond_2
    iget-object p1, p0, Lcom/zykj/study/databinding/FragmentExerciseStatisticsBinding;->mViewModel:Lcom/zykj/study/viewmodels/ExerciseStatisticsViewModel;

    .line 17
    .line 18
    if-eqz p1, :cond_3

    .line 19
    .line 20
    const/4 p2, 0x0

    .line 21
    invoke-virtual {p1, p2}, Lcom/zykj/study/viewmodels/ExerciseStatisticsViewModel;->d(I)V

    .line 22
    .line 23
    .line 24
    :cond_3
    return-void
.end method

.method public executeBindings()V
    .locals 26

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    monitor-enter p0

    .line 4
    :try_start_0
    iget-wide v2, v1, Lcom/zykj/study/databinding/FragmentExerciseStatisticsBindingImpl;->mDirtyFlags:J

    .line 5
    .line 6
    const-wide/16 v4, 0x0

    .line 7
    .line 8
    iput-wide v4, v1, Lcom/zykj/study/databinding/FragmentExerciseStatisticsBindingImpl;->mDirtyFlags:J

    .line 9
    .line 10
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 11
    iget-object v0, v1, Lcom/zykj/study/databinding/FragmentExerciseStatisticsBinding;->mViewModel:Lcom/zykj/study/viewmodels/ExerciseStatisticsViewModel;

    .line 12
    .line 13
    const-wide/16 v6, 0x7e

    .line 14
    .line 15
    and-long/2addr v6, v2

    .line 16
    cmp-long v6, v6, v4

    .line 17
    .line 18
    const-wide/16 v9, 0x70

    .line 19
    .line 20
    const-wide/16 v11, 0x68

    .line 21
    .line 22
    const-wide/16 v13, 0x64

    .line 23
    .line 24
    const-wide/16 v15, 0x62

    .line 25
    .line 26
    const/16 v17, 0x0

    .line 27
    .line 28
    const/16 v18, 0x0

    .line 29
    .line 30
    if-eqz v6, :cond_e

    .line 31
    .line 32
    and-long v19, v2, v15

    .line 33
    .line 34
    cmp-long v6, v19, v4

    .line 35
    .line 36
    move-wide/from16 v19, v4

    .line 37
    .line 38
    const/4 v4, 0x1

    .line 39
    if-eqz v6, :cond_2

    .line 40
    .line 41
    if-eqz v0, :cond_0

    .line 42
    .line 43
    invoke-virtual {v0}, Lcom/zykj/study/viewmodels/ExerciseStatisticsViewModel;->x()Landroidx/lifecycle/MutableLiveData;

    .line 44
    .line 45
    .line 46
    move-result-object v5

    .line 47
    goto :goto_0

    .line 48
    :cond_0
    move-object/from16 v5, v18

    .line 49
    .line 50
    :goto_0
    invoke-virtual {v1, v4, v5}, Landroidx/databinding/ViewDataBinding;->updateLiveDataRegistration(ILandroidx/lifecycle/LiveData;)Z

    .line 51
    .line 52
    .line 53
    if-eqz v5, :cond_1

    .line 54
    .line 55
    invoke-virtual {v5}, Landroidx/lifecycle/LiveData;->getValue()Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    move-result-object v5

    .line 59
    check-cast v5, Ljava/lang/Boolean;

    .line 60
    .line 61
    goto :goto_1

    .line 62
    :cond_1
    move-object/from16 v5, v18

    .line 63
    .line 64
    :goto_1
    invoke-static {v5}, Landroidx/databinding/ViewDataBinding;->safeUnbox(Ljava/lang/Boolean;)Z

    .line 65
    .line 66
    .line 67
    move-result v6

    .line 68
    xor-int/2addr v6, v4

    .line 69
    goto :goto_2

    .line 70
    :cond_2
    move/from16 v6, v17

    .line 71
    .line 72
    move-object/from16 v5, v18

    .line 73
    .line 74
    :goto_2
    and-long v21, v2, v13

    .line 75
    .line 76
    cmp-long v21, v21, v19

    .line 77
    .line 78
    if-eqz v21, :cond_4

    .line 79
    .line 80
    if-eqz v0, :cond_3

    .line 81
    .line 82
    invoke-virtual {v0}, Lcom/zykj/base/BaseViewModel;->isDialogVisible()Lcom/kunminx/architecture/ui/callback/UnPeekLiveData;

    .line 83
    .line 84
    .line 85
    move-result-object v21

    .line 86
    move-object/from16 v4, v21

    .line 87
    .line 88
    :goto_3
    const-wide/16 v22, 0x80

    .line 89
    .line 90
    goto :goto_4

    .line 91
    :cond_3
    move-object/from16 v4, v18

    .line 92
    .line 93
    goto :goto_3

    .line 94
    :goto_4
    const/4 v7, 0x2

    .line 95
    invoke-virtual {v1, v7, v4}, Landroidx/databinding/ViewDataBinding;->updateLiveDataRegistration(ILandroidx/lifecycle/LiveData;)Z

    .line 96
    .line 97
    .line 98
    if-eqz v4, :cond_5

    .line 99
    .line 100
    invoke-virtual {v4}, Landroidx/lifecycle/LiveData;->getValue()Ljava/lang/Object;

    .line 101
    .line 102
    .line 103
    move-result-object v4

    .line 104
    check-cast v4, Ljava/lang/Boolean;

    .line 105
    .line 106
    goto :goto_5

    .line 107
    :cond_4
    const-wide/16 v22, 0x80

    .line 108
    .line 109
    :cond_5
    move-object/from16 v4, v18

    .line 110
    .line 111
    :goto_5
    and-long v7, v2, v11

    .line 112
    .line 113
    cmp-long v7, v7, v19

    .line 114
    .line 115
    if-eqz v7, :cond_7

    .line 116
    .line 117
    if-eqz v0, :cond_6

    .line 118
    .line 119
    invoke-virtual {v0}, Lcom/zykj/base/BaseViewModel;->getToastLiveData()Lcom/kunminx/architecture/ui/callback/UnPeekLiveData;

    .line 120
    .line 121
    .line 122
    move-result-object v7

    .line 123
    goto :goto_6

    .line 124
    :cond_6
    move-object/from16 v7, v18

    .line 125
    .line 126
    :goto_6
    const/4 v8, 0x3

    .line 127
    invoke-virtual {v1, v8, v7}, Landroidx/databinding/ViewDataBinding;->updateLiveDataRegistration(ILandroidx/lifecycle/LiveData;)Z

    .line 128
    .line 129
    .line 130
    if-eqz v7, :cond_8

    .line 131
    .line 132
    invoke-virtual {v7}, Landroidx/lifecycle/LiveData;->getValue()Ljava/lang/Object;

    .line 133
    .line 134
    .line 135
    move-result-object v8

    .line 136
    check-cast v8, Lcom/zykj/base/bean/toast/ToastMessage;

    .line 137
    .line 138
    goto :goto_7

    .line 139
    :cond_7
    move-object/from16 v7, v18

    .line 140
    .line 141
    :cond_8
    :goto_7
    and-long v24, v2, v9

    .line 142
    .line 143
    cmp-long v8, v24, v19

    .line 144
    .line 145
    if-eqz v8, :cond_d

    .line 146
    .line 147
    if-eqz v0, :cond_9

    .line 148
    .line 149
    invoke-virtual {v0}, Lcom/zykj/study/viewmodels/ExerciseStatisticsViewModel;->l()Landroidx/lifecycle/MutableLiveData;

    .line 150
    .line 151
    .line 152
    move-result-object v0

    .line 153
    :goto_8
    move-wide/from16 v24, v9

    .line 154
    .line 155
    goto :goto_9

    .line 156
    :cond_9
    move-object/from16 v0, v18

    .line 157
    .line 158
    goto :goto_8

    .line 159
    :goto_9
    const/4 v9, 0x4

    .line 160
    invoke-virtual {v1, v9, v0}, Landroidx/databinding/ViewDataBinding;->updateLiveDataRegistration(ILandroidx/lifecycle/LiveData;)Z

    .line 161
    .line 162
    .line 163
    if-eqz v0, :cond_a

    .line 164
    .line 165
    invoke-virtual {v0}, Landroidx/lifecycle/LiveData;->getValue()Ljava/lang/Object;

    .line 166
    .line 167
    .line 168
    move-result-object v0

    .line 169
    check-cast v0, Lcom/zykj/study/bean/teach/SuperviseGroup;

    .line 170
    .line 171
    goto :goto_a

    .line 172
    :cond_a
    move-object/from16 v0, v18

    .line 173
    .line 174
    :goto_a
    if-nez v0, :cond_b

    .line 175
    .line 176
    const/16 v21, 0x1

    .line 177
    .line 178
    goto :goto_b

    .line 179
    :cond_b
    move/from16 v21, v17

    .line 180
    .line 181
    :goto_b
    if-eqz v8, :cond_f

    .line 182
    .line 183
    if-eqz v21, :cond_c

    .line 184
    .line 185
    const-wide/16 v8, 0x100

    .line 186
    .line 187
    or-long/2addr v2, v8

    .line 188
    goto :goto_c

    .line 189
    :cond_c
    or-long v2, v2, v22

    .line 190
    .line 191
    goto :goto_c

    .line 192
    :cond_d
    move-wide/from16 v24, v9

    .line 193
    .line 194
    move/from16 v21, v17

    .line 195
    .line 196
    move-object/from16 v0, v18

    .line 197
    .line 198
    goto :goto_c

    .line 199
    :cond_e
    move-wide/from16 v19, v4

    .line 200
    .line 201
    move-wide/from16 v24, v9

    .line 202
    .line 203
    const-wide/16 v22, 0x80

    .line 204
    .line 205
    move/from16 v6, v17

    .line 206
    .line 207
    move/from16 v21, v6

    .line 208
    .line 209
    move-object/from16 v0, v18

    .line 210
    .line 211
    move-object v4, v0

    .line 212
    move-object v5, v4

    .line 213
    move-object v7, v5

    .line 214
    :cond_f
    :goto_c
    and-long v8, v2, v22

    .line 215
    .line 216
    cmp-long v8, v8, v19

    .line 217
    .line 218
    if-eqz v8, :cond_11

    .line 219
    .line 220
    if-eqz v0, :cond_10

    .line 221
    .line 222
    invoke-virtual {v0}, Lcom/zykj/study/bean/teach/SuperviseGroup;->getMembers()I

    .line 223
    .line 224
    .line 225
    move-result v17

    .line 226
    invoke-virtual {v0}, Lcom/zykj/study/bean/teach/SuperviseGroup;->getName()Ljava/lang/String;

    .line 227
    .line 228
    .line 229
    move-result-object v0

    .line 230
    goto :goto_d

    .line 231
    :cond_10
    move-object/from16 v0, v18

    .line 232
    .line 233
    :goto_d
    iget-object v8, v1, Lcom/zykj/study/databinding/FragmentExerciseStatisticsBinding;->tvCourseGroupName:Landroid/widget/TextView;

    .line 234
    .line 235
    invoke-virtual {v8}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 236
    .line 237
    .line 238
    move-result-object v8

    .line 239
    sget v9, Lcom/zykj/study/R$string;->supervise_group_name_with_member:I

    .line 240
    .line 241
    invoke-static/range {v17 .. v17}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 242
    .line 243
    .line 244
    move-result-object v10

    .line 245
    filled-new-array {v0, v10}, [Ljava/lang/Object;

    .line 246
    .line 247
    .line 248
    move-result-object v0

    .line 249
    invoke-virtual {v8, v9, v0}, Landroid/content/res/Resources;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 250
    .line 251
    .line 252
    move-result-object v0

    .line 253
    goto :goto_e

    .line 254
    :cond_11
    move-object/from16 v0, v18

    .line 255
    .line 256
    :goto_e
    and-long v8, v2, v24

    .line 257
    .line 258
    cmp-long v8, v8, v19

    .line 259
    .line 260
    if-eqz v8, :cond_13

    .line 261
    .line 262
    if-eqz v21, :cond_12

    .line 263
    .line 264
    const-string v0, ""

    .line 265
    .line 266
    :cond_12
    move-object/from16 v18, v0

    .line 267
    .line 268
    :cond_13
    move-object/from16 v0, v18

    .line 269
    .line 270
    and-long v9, v2, v13

    .line 271
    .line 272
    cmp-long v9, v9, v19

    .line 273
    .line 274
    if-eqz v9, :cond_14

    .line 275
    .line 276
    iget-object v9, v1, Lcom/zykj/study/databinding/FragmentExerciseStatisticsBinding;->include:Lcom/zykj/study/databinding/LayoutBindViewModelBinding;

    .line 277
    .line 278
    invoke-virtual {v9, v4}, Lcom/zykj/study/databinding/LayoutBindViewModelBinding;->setIsDialogVisible(Ljava/lang/Boolean;)V

    .line 279
    .line 280
    .line 281
    :cond_14
    and-long v9, v2, v11

    .line 282
    .line 283
    cmp-long v4, v9, v19

    .line 284
    .line 285
    if-eqz v4, :cond_15

    .line 286
    .line 287
    iget-object v4, v1, Lcom/zykj/study/databinding/FragmentExerciseStatisticsBinding;->include:Lcom/zykj/study/databinding/LayoutBindViewModelBinding;

    .line 288
    .line 289
    invoke-virtual {v4, v7}, Lcom/zykj/study/databinding/LayoutBindViewModelBinding;->setToastLiveData(Lcom/kunminx/architecture/ui/callback/ProtectedUnPeekLiveData;)V

    .line 290
    .line 291
    .line 292
    :cond_15
    and-long v9, v2, v15

    .line 293
    .line 294
    cmp-long v4, v9, v19

    .line 295
    .line 296
    if-eqz v4, :cond_16

    .line 297
    .line 298
    iget-object v4, v1, Lcom/zykj/study/databinding/FragmentExerciseStatisticsBinding;->ivDown:Landroid/widget/ImageView;

    .line 299
    .line 300
    invoke-static {v6}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 301
    .line 302
    .line 303
    move-result-object v6

    .line 304
    invoke-static {v4, v6}, Le5/c;->t(Landroid/view/View;Ljava/lang/Boolean;)V

    .line 305
    .line 306
    .line 307
    iget-object v4, v1, Lcom/zykj/study/databinding/FragmentExerciseStatisticsBinding;->ivUp:Landroid/widget/ImageView;

    .line 308
    .line 309
    invoke-static {v4, v5}, Le5/c;->t(Landroid/view/View;Ljava/lang/Boolean;)V

    .line 310
    .line 311
    .line 312
    :cond_16
    const-wide/16 v4, 0x40

    .line 313
    .line 314
    and-long/2addr v2, v4

    .line 315
    cmp-long v2, v2, v19

    .line 316
    .line 317
    if-eqz v2, :cond_17

    .line 318
    .line 319
    iget-object v2, v1, Lcom/zykj/study/databinding/FragmentExerciseStatisticsBinding;->tvAllCondition:Landroid/widget/TextView;

    .line 320
    .line 321
    iget-object v3, v1, Lcom/zykj/study/databinding/FragmentExerciseStatisticsBindingImpl;->mCallback7:Landroid/view/View$OnClickListener;

    .line 322
    .line 323
    invoke-virtual {v2, v3}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 324
    .line 325
    .line 326
    iget-object v2, v1, Lcom/zykj/study/databinding/FragmentExerciseStatisticsBinding;->tvDoProblem:Landroid/widget/TextView;

    .line 327
    .line 328
    iget-object v3, v1, Lcom/zykj/study/databinding/FragmentExerciseStatisticsBindingImpl;->mCallback8:Landroid/view/View$OnClickListener;

    .line 329
    .line 330
    invoke-virtual {v2, v3}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 331
    .line 332
    .line 333
    :cond_17
    if-eqz v8, :cond_18

    .line 334
    .line 335
    iget-object v2, v1, Lcom/zykj/study/databinding/FragmentExerciseStatisticsBinding;->tvCourseGroupName:Landroid/widget/TextView;

    .line 336
    .line 337
    invoke-static {v2, v0}, Landroidx/databinding/adapters/TextViewBindingAdapter;->setText(Landroid/widget/TextView;Ljava/lang/CharSequence;)V

    .line 338
    .line 339
    .line 340
    :cond_18
    iget-object v0, v1, Lcom/zykj/study/databinding/FragmentExerciseStatisticsBinding;->include:Lcom/zykj/study/databinding/LayoutBindViewModelBinding;

    .line 341
    .line 342
    invoke-static {v0}, Landroidx/databinding/ViewDataBinding;->executeBindingsOn(Landroidx/databinding/ViewDataBinding;)V

    .line 343
    .line 344
    .line 345
    return-void

    .line 346
    :catchall_0
    move-exception v0

    .line 347
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 348
    throw v0
.end method

.method public hasPendingBindings()Z
    .locals 4

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-wide v0, p0, Lcom/zykj/study/databinding/FragmentExerciseStatisticsBindingImpl;->mDirtyFlags:J

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
    iget-object v0, p0, Lcom/zykj/study/databinding/FragmentExerciseStatisticsBinding;->include:Lcom/zykj/study/databinding/LayoutBindViewModelBinding;

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
    const/4 v0, 0x0

    .line 26
    return v0

    .line 27
    :goto_0
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 28
    throw v0
.end method

.method public invalidateAll()V
    .locals 2

    .line 1
    monitor-enter p0

    .line 2
    const-wide/16 v0, 0x40

    .line 3
    .line 4
    :try_start_0
    iput-wide v0, p0, Lcom/zykj/study/databinding/FragmentExerciseStatisticsBindingImpl;->mDirtyFlags:J

    .line 5
    .line 6
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 7
    iget-object v0, p0, Lcom/zykj/study/databinding/FragmentExerciseStatisticsBinding;->include:Lcom/zykj/study/databinding/LayoutBindViewModelBinding;

    .line 8
    .line 9
    invoke-virtual {v0}, Landroidx/databinding/ViewDataBinding;->invalidateAll()V

    .line 10
    .line 11
    .line 12
    invoke-virtual {p0}, Landroidx/databinding/ViewDataBinding;->requestRebind()V

    .line 13
    .line 14
    .line 15
    return-void

    .line 16
    :catchall_0
    move-exception v0

    .line 17
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 18
    throw v0
.end method

.method public onFieldChange(ILjava/lang/Object;I)Z
    .locals 1

    .line 1
    if-eqz p1, :cond_4

    .line 2
    .line 3
    const/4 v0, 0x1

    .line 4
    if-eq p1, v0, :cond_3

    .line 5
    .line 6
    const/4 v0, 0x2

    .line 7
    if-eq p1, v0, :cond_2

    .line 8
    .line 9
    const/4 v0, 0x3

    .line 10
    if-eq p1, v0, :cond_1

    .line 11
    .line 12
    const/4 v0, 0x4

    .line 13
    if-eq p1, v0, :cond_0

    .line 14
    .line 15
    const/4 p1, 0x0

    .line 16
    return p1

    .line 17
    :cond_0
    check-cast p2, Landroidx/lifecycle/MutableLiveData;

    .line 18
    .line 19
    invoke-direct {p0, p2, p3}, Lcom/zykj/study/databinding/FragmentExerciseStatisticsBindingImpl;->onChangeViewModelCurrentSuperviseGroupLiveData(Landroidx/lifecycle/MutableLiveData;I)Z

    .line 20
    .line 21
    .line 22
    move-result p1

    .line 23
    return p1

    .line 24
    :cond_1
    check-cast p2, Lcom/kunminx/architecture/ui/callback/UnPeekLiveData;

    .line 25
    .line 26
    invoke-direct {p0, p2, p3}, Lcom/zykj/study/databinding/FragmentExerciseStatisticsBindingImpl;->onChangeViewModelToastLiveData(Lcom/kunminx/architecture/ui/callback/UnPeekLiveData;I)Z

    .line 27
    .line 28
    .line 29
    move-result p1

    .line 30
    return p1

    .line 31
    :cond_2
    check-cast p2, Lcom/kunminx/architecture/ui/callback/UnPeekLiveData;

    .line 32
    .line 33
    invoke-direct {p0, p2, p3}, Lcom/zykj/study/databinding/FragmentExerciseStatisticsBindingImpl;->onChangeViewModelIsDialogVisible(Lcom/kunminx/architecture/ui/callback/UnPeekLiveData;I)Z

    .line 34
    .line 35
    .line 36
    move-result p1

    .line 37
    return p1

    .line 38
    :cond_3
    check-cast p2, Landroidx/lifecycle/MutableLiveData;

    .line 39
    .line 40
    invoke-direct {p0, p2, p3}, Lcom/zykj/study/databinding/FragmentExerciseStatisticsBindingImpl;->onChangeViewModelIsMenuPopupShow(Landroidx/lifecycle/MutableLiveData;I)Z

    .line 41
    .line 42
    .line 43
    move-result p1

    .line 44
    return p1

    .line 45
    :cond_4
    check-cast p2, Lcom/zykj/study/databinding/LayoutBindViewModelBinding;

    .line 46
    .line 47
    invoke-direct {p0, p2, p3}, Lcom/zykj/study/databinding/FragmentExerciseStatisticsBindingImpl;->onChangeInclude(Lcom/zykj/study/databinding/LayoutBindViewModelBinding;I)Z

    .line 48
    .line 49
    .line 50
    move-result p1

    .line 51
    return p1
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
    iget-object v0, p0, Lcom/zykj/study/databinding/FragmentExerciseStatisticsBinding;->include:Lcom/zykj/study/databinding/LayoutBindViewModelBinding;

    .line 5
    .line 6
    invoke-virtual {v0, p1}, Landroidx/databinding/ViewDataBinding;->setLifecycleOwner(Landroidx/lifecycle/LifecycleOwner;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public setVariable(ILjava/lang/Object;)Z
    .locals 1
    .param p2    # Ljava/lang/Object;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param

    .line 1
    const/16 v0, 0x3b

    .line 2
    .line 3
    if-ne v0, p1, :cond_0

    .line 4
    .line 5
    check-cast p2, Lcom/zykj/study/viewmodels/ExerciseStatisticsViewModel;

    .line 6
    .line 7
    invoke-virtual {p0, p2}, Lcom/zykj/study/databinding/FragmentExerciseStatisticsBindingImpl;->setViewModel(Lcom/zykj/study/viewmodels/ExerciseStatisticsViewModel;)V

    .line 8
    .line 9
    .line 10
    const/4 p1, 0x1

    .line 11
    return p1

    .line 12
    :cond_0
    const/4 p1, 0x0

    .line 13
    return p1
.end method

.method public setViewModel(Lcom/zykj/study/viewmodels/ExerciseStatisticsViewModel;)V
    .locals 4
    .param p1    # Lcom/zykj/study/viewmodels/ExerciseStatisticsViewModel;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param

    .line 1
    iput-object p1, p0, Lcom/zykj/study/databinding/FragmentExerciseStatisticsBinding;->mViewModel:Lcom/zykj/study/viewmodels/ExerciseStatisticsViewModel;

    .line 2
    .line 3
    monitor-enter p0

    .line 4
    :try_start_0
    iget-wide v0, p0, Lcom/zykj/study/databinding/FragmentExerciseStatisticsBindingImpl;->mDirtyFlags:J

    .line 5
    .line 6
    const-wide/16 v2, 0x20

    .line 7
    .line 8
    or-long/2addr v0, v2

    .line 9
    iput-wide v0, p0, Lcom/zykj/study/databinding/FragmentExerciseStatisticsBindingImpl;->mDirtyFlags:J

    .line 10
    .line 11
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 12
    const/16 p1, 0x3b

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
