.class public Lcom/zykj/study/databinding/ItemCourseTeachAddBindingImpl;
.super Lcom/zykj/study/databinding/ItemCourseTeachAddBinding;
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

.field private final mboundView0:Landroid/widget/LinearLayout;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field private final mboundView2:Landroid/widget/TextView;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field private final mboundView3:Landroid/widget/ImageView;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field private final mboundView4:Landroid/widget/LinearLayout;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 1
    new-instance v0, Landroidx/databinding/ViewDataBinding$IncludedLayouts;

    .line 2
    .line 3
    const/4 v1, 0x7

    .line 4
    invoke-direct {v0, v1}, Landroidx/databinding/ViewDataBinding$IncludedLayouts;-><init>(I)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lcom/zykj/study/databinding/ItemCourseTeachAddBindingImpl;->sIncludes:Landroidx/databinding/ViewDataBinding$IncludedLayouts;

    .line 8
    .line 9
    const-string v1, "item_course_title"

    .line 10
    .line 11
    const-string v2, "item_course_status"

    .line 12
    .line 13
    filled-new-array {v1, v2}, [Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    const/4 v2, 0x5

    .line 18
    const/4 v3, 0x6

    .line 19
    filled-new-array {v2, v3}, [I

    .line 20
    .line 21
    .line 22
    move-result-object v2

    .line 23
    sget v3, Lcom/zykj/study/R$layout;->item_course_title:I

    .line 24
    .line 25
    sget v4, Lcom/zykj/study/R$layout;->item_course_status:I

    .line 26
    .line 27
    filled-new-array {v3, v4}, [I

    .line 28
    .line 29
    .line 30
    move-result-object v3

    .line 31
    const/4 v4, 0x4

    .line 32
    invoke-virtual {v0, v4, v1, v2, v3}, Landroidx/databinding/ViewDataBinding$IncludedLayouts;->setIncludes(I[Ljava/lang/String;[I[I)V

    .line 33
    .line 34
    .line 35
    const/4 v0, 0x0

    .line 36
    sput-object v0, Lcom/zykj/study/databinding/ItemCourseTeachAddBindingImpl;->sViewsWithIds:Landroid/util/SparseIntArray;

    .line 37
    .line 38
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
    sget-object v0, Lcom/zykj/study/databinding/ItemCourseTeachAddBindingImpl;->sIncludes:Landroidx/databinding/ViewDataBinding$IncludedLayouts;

    sget-object v1, Lcom/zykj/study/databinding/ItemCourseTeachAddBindingImpl;->sViewsWithIds:Landroid/util/SparseIntArray;

    const/4 v2, 0x7

    invoke-static {p1, p2, v2, v0, v1}, Landroidx/databinding/ViewDataBinding;->mapBindings(Landroidx/databinding/DataBindingComponent;Landroid/view/View;ILandroidx/databinding/ViewDataBinding$IncludedLayouts;Landroid/util/SparseIntArray;)[Ljava/lang/Object;

    move-result-object v0

    invoke-direct {p0, p1, p2, v0}, Lcom/zykj/study/databinding/ItemCourseTeachAddBindingImpl;-><init>(Landroidx/databinding/DataBindingComponent;Landroid/view/View;[Ljava/lang/Object;)V

    return-void
.end method

.method private constructor <init>(Landroidx/databinding/DataBindingComponent;Landroid/view/View;[Ljava/lang/Object;)V
    .locals 8

    const/4 v0, 0x6

    .line 2
    aget-object v0, p3, v0

    move-object v5, v0

    check-cast v5, Lcom/zykj/study/databinding/ItemCourseStatusBinding;

    const/4 v0, 0x5

    aget-object v0, p3, v0

    move-object v6, v0

    check-cast v6, Lcom/zykj/study/databinding/ItemCourseTitleBinding;

    const/4 v0, 0x1

    aget-object v0, p3, v0

    move-object v7, v0

    check-cast v7, Landroid/widget/ImageView;

    const/4 v4, 0x2

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    invoke-direct/range {v1 .. v7}, Lcom/zykj/study/databinding/ItemCourseTeachAddBinding;-><init>(Ljava/lang/Object;Landroid/view/View;ILcom/zykj/study/databinding/ItemCourseStatusBinding;Lcom/zykj/study/databinding/ItemCourseTitleBinding;Landroid/widget/ImageView;)V

    const-wide/16 p1, -0x1

    .line 3
    iput-wide p1, v1, Lcom/zykj/study/databinding/ItemCourseTeachAddBindingImpl;->mDirtyFlags:J

    .line 4
    iget-object p1, v1, Lcom/zykj/study/databinding/ItemCourseTeachAddBinding;->itemCourseStatus:Lcom/zykj/study/databinding/ItemCourseStatusBinding;

    invoke-virtual {p0, p1}, Landroidx/databinding/ViewDataBinding;->setContainedBinding(Landroidx/databinding/ViewDataBinding;)V

    .line 5
    iget-object p1, v1, Lcom/zykj/study/databinding/ItemCourseTeachAddBinding;->itemCourseTitle:Lcom/zykj/study/databinding/ItemCourseTitleBinding;

    invoke-virtual {p0, p1}, Landroidx/databinding/ViewDataBinding;->setContainedBinding(Landroidx/databinding/ViewDataBinding;)V

    .line 6
    iget-object p1, v1, Lcom/zykj/study/databinding/ItemCourseTeachAddBinding;->ivCover:Landroid/widget/ImageView;

    const/4 p2, 0x0

    invoke-virtual {p1, p2}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    const/4 p1, 0x0

    .line 7
    aget-object p1, p3, p1

    check-cast p1, Landroid/widget/LinearLayout;

    iput-object p1, v1, Lcom/zykj/study/databinding/ItemCourseTeachAddBindingImpl;->mboundView0:Landroid/widget/LinearLayout;

    .line 8
    invoke-virtual {p1, p2}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    const/4 p1, 0x2

    .line 9
    aget-object p1, p3, p1

    check-cast p1, Landroid/widget/TextView;

    iput-object p1, v1, Lcom/zykj/study/databinding/ItemCourseTeachAddBindingImpl;->mboundView2:Landroid/widget/TextView;

    .line 10
    invoke-virtual {p1, p2}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    const/4 p1, 0x3

    .line 11
    aget-object p1, p3, p1

    check-cast p1, Landroid/widget/ImageView;

    iput-object p1, v1, Lcom/zykj/study/databinding/ItemCourseTeachAddBindingImpl;->mboundView3:Landroid/widget/ImageView;

    .line 12
    invoke-virtual {p1, p2}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    const/4 p1, 0x4

    .line 13
    aget-object p1, p3, p1

    check-cast p1, Landroid/widget/LinearLayout;

    iput-object p1, v1, Lcom/zykj/study/databinding/ItemCourseTeachAddBindingImpl;->mboundView4:Landroid/widget/LinearLayout;

    .line 14
    invoke-virtual {p1, p2}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 15
    invoke-virtual {p0, v3}, Landroidx/databinding/ViewDataBinding;->setRootTag(Landroid/view/View;)V

    .line 16
    invoke-virtual {p0}, Lcom/zykj/study/databinding/ItemCourseTeachAddBindingImpl;->invalidateAll()V

    return-void
.end method

.method private onChangeItemCourseStatus(Lcom/zykj/study/databinding/ItemCourseStatusBinding;I)Z
    .locals 2

    .line 1
    if-nez p2, :cond_0

    .line 2
    .line 3
    monitor-enter p0

    .line 4
    :try_start_0
    iget-wide p1, p0, Lcom/zykj/study/databinding/ItemCourseTeachAddBindingImpl;->mDirtyFlags:J

    .line 5
    .line 6
    const-wide/16 v0, 0x1

    .line 7
    .line 8
    or-long/2addr p1, v0

    .line 9
    iput-wide p1, p0, Lcom/zykj/study/databinding/ItemCourseTeachAddBindingImpl;->mDirtyFlags:J

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

.method private onChangeItemCourseTitle(Lcom/zykj/study/databinding/ItemCourseTitleBinding;I)Z
    .locals 2

    .line 1
    if-nez p2, :cond_0

    .line 2
    .line 3
    monitor-enter p0

    .line 4
    :try_start_0
    iget-wide p1, p0, Lcom/zykj/study/databinding/ItemCourseTeachAddBindingImpl;->mDirtyFlags:J

    .line 5
    .line 6
    const-wide/16 v0, 0x2

    .line 7
    .line 8
    or-long/2addr p1, v0

    .line 9
    iput-wide p1, p0, Lcom/zykj/study/databinding/ItemCourseTeachAddBindingImpl;->mDirtyFlags:J

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
    .locals 15

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-wide v0, p0, Lcom/zykj/study/databinding/ItemCourseTeachAddBindingImpl;->mDirtyFlags:J

    .line 3
    .line 4
    const-wide/16 v2, 0x0

    .line 5
    .line 6
    iput-wide v2, p0, Lcom/zykj/study/databinding/ItemCourseTeachAddBindingImpl;->mDirtyFlags:J

    .line 7
    .line 8
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 9
    iget-boolean v4, p0, Lcom/zykj/study/databinding/ItemCourseTeachAddBinding;->mIsSelected:Z

    .line 10
    .line 11
    iget-object v5, p0, Lcom/zykj/study/databinding/ItemCourseTeachAddBinding;->mClickListener:Landroid/view/View$OnClickListener;

    .line 12
    .line 13
    iget-object v6, p0, Lcom/zykj/study/databinding/ItemCourseTeachAddBinding;->mEntity:Lcom/zykj/study/data/MyCourseEntity;

    .line 14
    .line 15
    iget-object v7, p0, Lcom/zykj/study/databinding/ItemCourseTeachAddBinding;->mDictViewModel:Lcom/zykj/study/viewmodels/DictViewModel;

    .line 16
    .line 17
    const-wide/16 v8, 0x44

    .line 18
    .line 19
    and-long/2addr v8, v0

    .line 20
    cmp-long v8, v8, v2

    .line 21
    .line 22
    const-wide/16 v9, 0x48

    .line 23
    .line 24
    and-long/2addr v9, v0

    .line 25
    cmp-long v9, v9, v2

    .line 26
    .line 27
    const-wide/16 v10, 0x50

    .line 28
    .line 29
    and-long/2addr v10, v0

    .line 30
    cmp-long v10, v10, v2

    .line 31
    .line 32
    if-eqz v10, :cond_0

    .line 33
    .line 34
    if-eqz v6, :cond_0

    .line 35
    .line 36
    invoke-virtual {v6}, Lcom/zykj/study/data/MyCourseEntity;->isSuperviser()Z

    .line 37
    .line 38
    .line 39
    move-result v11

    .line 40
    invoke-virtual {v6}, Lcom/zykj/study/bean/course/CourseBean;->getCover()Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object v12

    .line 44
    goto :goto_0

    .line 45
    :cond_0
    const/4 v11, 0x0

    .line 46
    const/4 v12, 0x0

    .line 47
    :goto_0
    const-wide/16 v13, 0x60

    .line 48
    .line 49
    and-long/2addr v0, v13

    .line 50
    cmp-long v0, v0, v2

    .line 51
    .line 52
    if-eqz v10, :cond_1

    .line 53
    .line 54
    iget-object v1, p0, Lcom/zykj/study/databinding/ItemCourseTeachAddBinding;->itemCourseStatus:Lcom/zykj/study/databinding/ItemCourseStatusBinding;

    .line 55
    .line 56
    invoke-virtual {v1, v6}, Lcom/zykj/study/databinding/ItemCourseStatusBinding;->setEntity(Lcom/zykj/study/bean/course/CourseBean;)V

    .line 57
    .line 58
    .line 59
    iget-object v1, p0, Lcom/zykj/study/databinding/ItemCourseTeachAddBinding;->itemCourseTitle:Lcom/zykj/study/databinding/ItemCourseTitleBinding;

    .line 60
    .line 61
    invoke-virtual {v1, v6}, Lcom/zykj/study/databinding/ItemCourseTitleBinding;->setEntity(Lcom/zykj/study/bean/course/CourseBean;)V

    .line 62
    .line 63
    .line 64
    iget-object v1, p0, Lcom/zykj/study/databinding/ItemCourseTeachAddBinding;->ivCover:Landroid/widget/ImageView;

    .line 65
    .line 66
    invoke-static {v1, v12}, Lcom/zykj/base/ext/BindingAdaptersKt;->netUrl(Landroid/widget/ImageView;Ljava/lang/String;)V

    .line 67
    .line 68
    .line 69
    iget-object v1, p0, Lcom/zykj/study/databinding/ItemCourseTeachAddBindingImpl;->mboundView2:Landroid/widget/TextView;

    .line 70
    .line 71
    invoke-static {v11}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 72
    .line 73
    .line 74
    move-result-object v2

    .line 75
    invoke-static {v1, v2}, Le5/c;->t(Landroid/view/View;Ljava/lang/Boolean;)V

    .line 76
    .line 77
    .line 78
    :cond_1
    if-eqz v0, :cond_2

    .line 79
    .line 80
    iget-object v0, p0, Lcom/zykj/study/databinding/ItemCourseTeachAddBinding;->itemCourseTitle:Lcom/zykj/study/databinding/ItemCourseTitleBinding;

    .line 81
    .line 82
    invoke-virtual {v0, v7}, Lcom/zykj/study/databinding/ItemCourseTitleBinding;->setDictViewModel(Lcom/zykj/study/viewmodels/DictViewModel;)V

    .line 83
    .line 84
    .line 85
    :cond_2
    if-eqz v9, :cond_3

    .line 86
    .line 87
    iget-object v0, p0, Lcom/zykj/study/databinding/ItemCourseTeachAddBindingImpl;->mboundView0:Landroid/widget/LinearLayout;

    .line 88
    .line 89
    invoke-virtual {v0, v5}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 90
    .line 91
    .line 92
    :cond_3
    if-eqz v8, :cond_4

    .line 93
    .line 94
    iget-object v0, p0, Lcom/zykj/study/databinding/ItemCourseTeachAddBindingImpl;->mboundView3:Landroid/widget/ImageView;

    .line 95
    .line 96
    invoke-static {v4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 97
    .line 98
    .line 99
    move-result-object v1

    .line 100
    invoke-static {v0, v1}, Le5/c;->t(Landroid/view/View;Ljava/lang/Boolean;)V

    .line 101
    .line 102
    .line 103
    :cond_4
    iget-object v0, p0, Lcom/zykj/study/databinding/ItemCourseTeachAddBinding;->itemCourseTitle:Lcom/zykj/study/databinding/ItemCourseTitleBinding;

    .line 104
    .line 105
    invoke-static {v0}, Landroidx/databinding/ViewDataBinding;->executeBindingsOn(Landroidx/databinding/ViewDataBinding;)V

    .line 106
    .line 107
    .line 108
    iget-object v0, p0, Lcom/zykj/study/databinding/ItemCourseTeachAddBinding;->itemCourseStatus:Lcom/zykj/study/databinding/ItemCourseStatusBinding;

    .line 109
    .line 110
    invoke-static {v0}, Landroidx/databinding/ViewDataBinding;->executeBindingsOn(Landroidx/databinding/ViewDataBinding;)V

    .line 111
    .line 112
    .line 113
    return-void

    .line 114
    :catchall_0
    move-exception v0

    .line 115
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 116
    throw v0
.end method

.method public hasPendingBindings()Z
    .locals 4

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-wide v0, p0, Lcom/zykj/study/databinding/ItemCourseTeachAddBindingImpl;->mDirtyFlags:J

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
    iget-object v0, p0, Lcom/zykj/study/databinding/ItemCourseTeachAddBinding;->itemCourseTitle:Lcom/zykj/study/databinding/ItemCourseTitleBinding;

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
    iget-object v0, p0, Lcom/zykj/study/databinding/ItemCourseTeachAddBinding;->itemCourseStatus:Lcom/zykj/study/databinding/ItemCourseStatusBinding;

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
    const/4 v0, 0x0

    .line 35
    return v0

    .line 36
    :goto_0
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 37
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
    iput-wide v0, p0, Lcom/zykj/study/databinding/ItemCourseTeachAddBindingImpl;->mDirtyFlags:J

    .line 5
    .line 6
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 7
    iget-object v0, p0, Lcom/zykj/study/databinding/ItemCourseTeachAddBinding;->itemCourseTitle:Lcom/zykj/study/databinding/ItemCourseTitleBinding;

    .line 8
    .line 9
    invoke-virtual {v0}, Landroidx/databinding/ViewDataBinding;->invalidateAll()V

    .line 10
    .line 11
    .line 12
    iget-object v0, p0, Lcom/zykj/study/databinding/ItemCourseTeachAddBinding;->itemCourseStatus:Lcom/zykj/study/databinding/ItemCourseStatusBinding;

    .line 13
    .line 14
    invoke-virtual {v0}, Landroidx/databinding/ViewDataBinding;->invalidateAll()V

    .line 15
    .line 16
    .line 17
    invoke-virtual {p0}, Landroidx/databinding/ViewDataBinding;->requestRebind()V

    .line 18
    .line 19
    .line 20
    return-void

    .line 21
    :catchall_0
    move-exception v0

    .line 22
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 23
    throw v0
.end method

.method public onFieldChange(ILjava/lang/Object;I)Z
    .locals 1

    .line 1
    if-eqz p1, :cond_1

    .line 2
    .line 3
    const/4 v0, 0x1

    .line 4
    if-eq p1, v0, :cond_0

    .line 5
    .line 6
    const/4 p1, 0x0

    .line 7
    return p1

    .line 8
    :cond_0
    check-cast p2, Lcom/zykj/study/databinding/ItemCourseTitleBinding;

    .line 9
    .line 10
    invoke-direct {p0, p2, p3}, Lcom/zykj/study/databinding/ItemCourseTeachAddBindingImpl;->onChangeItemCourseTitle(Lcom/zykj/study/databinding/ItemCourseTitleBinding;I)Z

    .line 11
    .line 12
    .line 13
    move-result p1

    .line 14
    return p1

    .line 15
    :cond_1
    check-cast p2, Lcom/zykj/study/databinding/ItemCourseStatusBinding;

    .line 16
    .line 17
    invoke-direct {p0, p2, p3}, Lcom/zykj/study/databinding/ItemCourseTeachAddBindingImpl;->onChangeItemCourseStatus(Lcom/zykj/study/databinding/ItemCourseStatusBinding;I)Z

    .line 18
    .line 19
    .line 20
    move-result p1

    .line 21
    return p1
.end method

.method public setClickListener(Landroid/view/View$OnClickListener;)V
    .locals 4
    .param p1    # Landroid/view/View$OnClickListener;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param

    .line 1
    iput-object p1, p0, Lcom/zykj/study/databinding/ItemCourseTeachAddBinding;->mClickListener:Landroid/view/View$OnClickListener;

    .line 2
    .line 3
    monitor-enter p0

    .line 4
    :try_start_0
    iget-wide v0, p0, Lcom/zykj/study/databinding/ItemCourseTeachAddBindingImpl;->mDirtyFlags:J

    .line 5
    .line 6
    const-wide/16 v2, 0x8

    .line 7
    .line 8
    or-long/2addr v0, v2

    .line 9
    iput-wide v0, p0, Lcom/zykj/study/databinding/ItemCourseTeachAddBindingImpl;->mDirtyFlags:J

    .line 10
    .line 11
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 12
    const/4 p1, 0x5

    .line 13
    invoke-virtual {p0, p1}, Landroidx/databinding/BaseObservable;->notifyPropertyChanged(I)V

    .line 14
    .line 15
    .line 16
    invoke-super {p0}, Landroidx/databinding/ViewDataBinding;->requestRebind()V

    .line 17
    .line 18
    .line 19
    return-void

    .line 20
    :catchall_0
    move-exception p1

    .line 21
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 22
    throw p1
.end method

.method public setDictViewModel(Lcom/zykj/study/viewmodels/DictViewModel;)V
    .locals 4
    .param p1    # Lcom/zykj/study/viewmodels/DictViewModel;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param

    .line 1
    iput-object p1, p0, Lcom/zykj/study/databinding/ItemCourseTeachAddBinding;->mDictViewModel:Lcom/zykj/study/viewmodels/DictViewModel;

    .line 2
    .line 3
    monitor-enter p0

    .line 4
    :try_start_0
    iget-wide v0, p0, Lcom/zykj/study/databinding/ItemCourseTeachAddBindingImpl;->mDirtyFlags:J

    .line 5
    .line 6
    const-wide/16 v2, 0x20

    .line 7
    .line 8
    or-long/2addr v0, v2

    .line 9
    iput-wide v0, p0, Lcom/zykj/study/databinding/ItemCourseTeachAddBindingImpl;->mDirtyFlags:J

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

.method public setEntity(Lcom/zykj/study/data/MyCourseEntity;)V
    .locals 4
    .param p1    # Lcom/zykj/study/data/MyCourseEntity;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param

    .line 1
    iput-object p1, p0, Lcom/zykj/study/databinding/ItemCourseTeachAddBinding;->mEntity:Lcom/zykj/study/data/MyCourseEntity;

    .line 2
    .line 3
    monitor-enter p0

    .line 4
    :try_start_0
    iget-wide v0, p0, Lcom/zykj/study/databinding/ItemCourseTeachAddBindingImpl;->mDirtyFlags:J

    .line 5
    .line 6
    const-wide/16 v2, 0x10

    .line 7
    .line 8
    or-long/2addr v0, v2

    .line 9
    iput-wide v0, p0, Lcom/zykj/study/databinding/ItemCourseTeachAddBindingImpl;->mDirtyFlags:J

    .line 10
    .line 11
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 12
    const/16 p1, 0xf

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

.method public setIsSelected(Z)V
    .locals 4

    .line 1
    iput-boolean p1, p0, Lcom/zykj/study/databinding/ItemCourseTeachAddBinding;->mIsSelected:Z

    .line 2
    .line 3
    monitor-enter p0

    .line 4
    :try_start_0
    iget-wide v0, p0, Lcom/zykj/study/databinding/ItemCourseTeachAddBindingImpl;->mDirtyFlags:J

    .line 5
    .line 6
    const-wide/16 v2, 0x4

    .line 7
    .line 8
    or-long/2addr v0, v2

    .line 9
    iput-wide v0, p0, Lcom/zykj/study/databinding/ItemCourseTeachAddBindingImpl;->mDirtyFlags:J

    .line 10
    .line 11
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 12
    const/16 p1, 0x1c

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
    iget-object v0, p0, Lcom/zykj/study/databinding/ItemCourseTeachAddBinding;->itemCourseTitle:Lcom/zykj/study/databinding/ItemCourseTitleBinding;

    .line 5
    .line 6
    invoke-virtual {v0, p1}, Landroidx/databinding/ViewDataBinding;->setLifecycleOwner(Landroidx/lifecycle/LifecycleOwner;)V

    .line 7
    .line 8
    .line 9
    iget-object v0, p0, Lcom/zykj/study/databinding/ItemCourseTeachAddBinding;->itemCourseStatus:Lcom/zykj/study/databinding/ItemCourseStatusBinding;

    .line 10
    .line 11
    invoke-virtual {v0, p1}, Landroidx/databinding/ViewDataBinding;->setLifecycleOwner(Landroidx/lifecycle/LifecycleOwner;)V

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method public setVariable(ILjava/lang/Object;)Z
    .locals 2
    .param p2    # Ljava/lang/Object;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param

    .line 1
    const/16 v0, 0x1c

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    if-ne v0, p1, :cond_0

    .line 5
    .line 6
    check-cast p2, Ljava/lang/Boolean;

    .line 7
    .line 8
    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 9
    .line 10
    .line 11
    move-result p1

    .line 12
    invoke-virtual {p0, p1}, Lcom/zykj/study/databinding/ItemCourseTeachAddBindingImpl;->setIsSelected(Z)V

    .line 13
    .line 14
    .line 15
    return v1

    .line 16
    :cond_0
    const/4 v0, 0x5

    .line 17
    if-ne v0, p1, :cond_1

    .line 18
    .line 19
    check-cast p2, Landroid/view/View$OnClickListener;

    .line 20
    .line 21
    invoke-virtual {p0, p2}, Lcom/zykj/study/databinding/ItemCourseTeachAddBindingImpl;->setClickListener(Landroid/view/View$OnClickListener;)V

    .line 22
    .line 23
    .line 24
    return v1

    .line 25
    :cond_1
    const/16 v0, 0xf

    .line 26
    .line 27
    if-ne v0, p1, :cond_2

    .line 28
    .line 29
    check-cast p2, Lcom/zykj/study/data/MyCourseEntity;

    .line 30
    .line 31
    invoke-virtual {p0, p2}, Lcom/zykj/study/databinding/ItemCourseTeachAddBindingImpl;->setEntity(Lcom/zykj/study/data/MyCourseEntity;)V

    .line 32
    .line 33
    .line 34
    return v1

    .line 35
    :cond_2
    const/16 v0, 0xb

    .line 36
    .line 37
    if-ne v0, p1, :cond_3

    .line 38
    .line 39
    check-cast p2, Lcom/zykj/study/viewmodels/DictViewModel;

    .line 40
    .line 41
    invoke-virtual {p0, p2}, Lcom/zykj/study/databinding/ItemCourseTeachAddBindingImpl;->setDictViewModel(Lcom/zykj/study/viewmodels/DictViewModel;)V

    .line 42
    .line 43
    .line 44
    return v1

    .line 45
    :cond_3
    const/4 p1, 0x0

    .line 46
    return p1
.end method
