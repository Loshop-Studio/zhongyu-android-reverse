.class public Lcom/zykj/study/databinding/ItemMyCourseBindingImpl;
.super Lcom/zykj/study/databinding/ItemMyCourseBinding;
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

.field private final mboundView1:Landroid/widget/ImageView;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field private final mboundView2:Landroid/widget/RelativeLayout;
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
    sput-object v0, Lcom/zykj/study/databinding/ItemMyCourseBindingImpl;->sIncludes:Landroidx/databinding/ViewDataBinding$IncludedLayouts;

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
    const/4 v2, 0x4

    .line 18
    const/4 v3, 0x5

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
    const/4 v4, 0x2

    .line 32
    invoke-virtual {v0, v4, v1, v2, v3}, Landroidx/databinding/ViewDataBinding$IncludedLayouts;->setIncludes(I[Ljava/lang/String;[I[I)V

    .line 33
    .line 34
    .line 35
    new-instance v0, Landroid/util/SparseIntArray;

    .line 36
    .line 37
    invoke-direct {v0}, Landroid/util/SparseIntArray;-><init>()V

    .line 38
    .line 39
    .line 40
    sput-object v0, Lcom/zykj/study/databinding/ItemMyCourseBindingImpl;->sViewsWithIds:Landroid/util/SparseIntArray;

    .line 41
    .line 42
    sget v1, Lcom/zykj/study/R$id;->container:I

    .line 43
    .line 44
    const/4 v2, 0x6

    .line 45
    invoke-virtual {v0, v1, v2}, Landroid/util/SparseIntArray;->put(II)V

    .line 46
    .line 47
    .line 48
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
    sget-object v0, Lcom/zykj/study/databinding/ItemMyCourseBindingImpl;->sIncludes:Landroidx/databinding/ViewDataBinding$IncludedLayouts;

    sget-object v1, Lcom/zykj/study/databinding/ItemMyCourseBindingImpl;->sViewsWithIds:Landroid/util/SparseIntArray;

    const/4 v2, 0x7

    invoke-static {p1, p2, v2, v0, v1}, Landroidx/databinding/ViewDataBinding;->mapBindings(Landroidx/databinding/DataBindingComponent;Landroid/view/View;ILandroidx/databinding/ViewDataBinding$IncludedLayouts;Landroid/util/SparseIntArray;)[Ljava/lang/Object;

    move-result-object v0

    invoke-direct {p0, p1, p2, v0}, Lcom/zykj/study/databinding/ItemMyCourseBindingImpl;-><init>(Landroidx/databinding/DataBindingComponent;Landroid/view/View;[Ljava/lang/Object;)V

    return-void
.end method

.method private constructor <init>(Landroidx/databinding/DataBindingComponent;Landroid/view/View;[Ljava/lang/Object;)V
    .locals 10

    const/4 v0, 0x6

    .line 2
    aget-object v0, p3, v0

    move-object v5, v0

    check-cast v5, Landroidx/constraintlayout/widget/ConstraintLayout;

    const/4 v0, 0x5

    aget-object v0, p3, v0

    move-object v6, v0

    check-cast v6, Lcom/zykj/study/databinding/ItemCourseStatusBinding;

    const/4 v0, 0x4

    aget-object v0, p3, v0

    move-object v7, v0

    check-cast v7, Lcom/zykj/study/databinding/ItemCourseTitleBinding;

    const/4 v0, 0x0

    aget-object v0, p3, v0

    move-object v8, v0

    check-cast v8, Landroid/widget/RelativeLayout;

    const/4 v0, 0x3

    aget-object v0, p3, v0

    move-object v9, v0

    check-cast v9, Landroid/widget/TextView;

    const/4 v4, 0x2

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    invoke-direct/range {v1 .. v9}, Lcom/zykj/study/databinding/ItemMyCourseBinding;-><init>(Ljava/lang/Object;Landroid/view/View;ILandroidx/constraintlayout/widget/ConstraintLayout;Lcom/zykj/study/databinding/ItemCourseStatusBinding;Lcom/zykj/study/databinding/ItemCourseTitleBinding;Landroid/widget/RelativeLayout;Landroid/widget/TextView;)V

    const-wide/16 p1, -0x1

    .line 3
    iput-wide p1, v1, Lcom/zykj/study/databinding/ItemMyCourseBindingImpl;->mDirtyFlags:J

    .line 4
    iget-object p1, v1, Lcom/zykj/study/databinding/ItemMyCourseBinding;->itemCourseStatus:Lcom/zykj/study/databinding/ItemCourseStatusBinding;

    invoke-virtual {p0, p1}, Landroidx/databinding/ViewDataBinding;->setContainedBinding(Landroidx/databinding/ViewDataBinding;)V

    .line 5
    iget-object p1, v1, Lcom/zykj/study/databinding/ItemMyCourseBinding;->itemCourseTitle:Lcom/zykj/study/databinding/ItemCourseTitleBinding;

    invoke-virtual {p0, p1}, Landroidx/databinding/ViewDataBinding;->setContainedBinding(Landroidx/databinding/ViewDataBinding;)V

    const/4 p1, 0x1

    .line 6
    aget-object p1, p3, p1

    check-cast p1, Landroid/widget/ImageView;

    iput-object p1, v1, Lcom/zykj/study/databinding/ItemMyCourseBindingImpl;->mboundView1:Landroid/widget/ImageView;

    const/4 p2, 0x0

    .line 7
    invoke-virtual {p1, p2}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    const/4 p1, 0x2

    .line 8
    aget-object p1, p3, p1

    check-cast p1, Landroid/widget/RelativeLayout;

    iput-object p1, v1, Lcom/zykj/study/databinding/ItemMyCourseBindingImpl;->mboundView2:Landroid/widget/RelativeLayout;

    .line 9
    invoke-virtual {p1, p2}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 10
    iget-object p1, v1, Lcom/zykj/study/databinding/ItemMyCourseBinding;->rlContainer:Landroid/widget/RelativeLayout;

    invoke-virtual {p1, p2}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 11
    iget-object p1, v1, Lcom/zykj/study/databinding/ItemMyCourseBinding;->tvTeacherName:Landroid/widget/TextView;

    invoke-virtual {p1, p2}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 12
    invoke-virtual {p0, v3}, Landroidx/databinding/ViewDataBinding;->setRootTag(Landroid/view/View;)V

    .line 13
    invoke-virtual {p0}, Lcom/zykj/study/databinding/ItemMyCourseBindingImpl;->invalidateAll()V

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
    iget-wide p1, p0, Lcom/zykj/study/databinding/ItemMyCourseBindingImpl;->mDirtyFlags:J

    .line 5
    .line 6
    const-wide/16 v0, 0x1

    .line 7
    .line 8
    or-long/2addr p1, v0

    .line 9
    iput-wide p1, p0, Lcom/zykj/study/databinding/ItemMyCourseBindingImpl;->mDirtyFlags:J

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
    iget-wide p1, p0, Lcom/zykj/study/databinding/ItemMyCourseBindingImpl;->mDirtyFlags:J

    .line 5
    .line 6
    const-wide/16 v0, 0x2

    .line 7
    .line 8
    or-long/2addr p1, v0

    .line 9
    iput-wide p1, p0, Lcom/zykj/study/databinding/ItemMyCourseBindingImpl;->mDirtyFlags:J

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
    iget-wide v2, v1, Lcom/zykj/study/databinding/ItemMyCourseBindingImpl;->mDirtyFlags:J

    .line 5
    .line 6
    const-wide/16 v4, 0x0

    .line 7
    .line 8
    iput-wide v4, v1, Lcom/zykj/study/databinding/ItemMyCourseBindingImpl;->mDirtyFlags:J

    .line 9
    .line 10
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 11
    iget-object v0, v1, Lcom/zykj/study/databinding/ItemMyCourseBinding;->mEntity:Lcom/zykj/study/data/MyCourseEntity;

    .line 12
    .line 13
    iget-object v6, v1, Lcom/zykj/study/databinding/ItemMyCourseBinding;->mUserInfo:Lcom/zykj/lib/login/proto/UserBean;

    .line 14
    .line 15
    iget-object v7, v1, Lcom/zykj/study/databinding/ItemMyCourseBinding;->mDictViewModel:Lcom/zykj/study/viewmodels/DictViewModel;

    .line 16
    .line 17
    iget-object v8, v1, Lcom/zykj/study/databinding/ItemMyCourseBinding;->mClickListener:Landroid/view/View$OnClickListener;

    .line 18
    .line 19
    const-wide/16 v9, 0x44

    .line 20
    .line 21
    and-long v11, v2, v9

    .line 22
    .line 23
    cmp-long v11, v11, v4

    .line 24
    .line 25
    const/4 v12, 0x0

    .line 26
    if-eqz v11, :cond_0

    .line 27
    .line 28
    if-eqz v0, :cond_0

    .line 29
    .line 30
    invoke-virtual {v0}, Lcom/zykj/study/bean/course/CourseBean;->getCover()Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object v11

    .line 34
    goto :goto_0

    .line 35
    :cond_0
    move-object v11, v12

    .line 36
    :goto_0
    const-wide/16 v13, 0x48

    .line 37
    .line 38
    and-long v15, v2, v13

    .line 39
    .line 40
    cmp-long v15, v15, v4

    .line 41
    .line 42
    const-wide/16 v16, 0x80

    .line 43
    .line 44
    const/16 v18, 0x0

    .line 45
    .line 46
    if-eqz v15, :cond_3

    .line 47
    .line 48
    if-nez v6, :cond_1

    .line 49
    .line 50
    const/16 v18, 0x1

    .line 51
    .line 52
    :cond_1
    if-eqz v15, :cond_3

    .line 53
    .line 54
    if-eqz v18, :cond_2

    .line 55
    .line 56
    const-wide/16 v19, 0x100

    .line 57
    .line 58
    or-long v2, v2, v19

    .line 59
    .line 60
    goto :goto_1

    .line 61
    :cond_2
    or-long v2, v2, v16

    .line 62
    .line 63
    :cond_3
    :goto_1
    const-wide/16 v19, 0x50

    .line 64
    .line 65
    and-long v19, v2, v19

    .line 66
    .line 67
    cmp-long v15, v19, v4

    .line 68
    .line 69
    const-wide/16 v19, 0x60

    .line 70
    .line 71
    and-long v19, v2, v19

    .line 72
    .line 73
    cmp-long v19, v19, v4

    .line 74
    .line 75
    and-long v16, v2, v16

    .line 76
    .line 77
    cmp-long v16, v16, v4

    .line 78
    .line 79
    if-eqz v16, :cond_4

    .line 80
    .line 81
    if-eqz v6, :cond_4

    .line 82
    .line 83
    invoke-virtual {v6}, Lcom/zykj/lib/login/proto/UserBean;->getRealName()Ljava/lang/String;

    .line 84
    .line 85
    .line 86
    move-result-object v6

    .line 87
    goto :goto_2

    .line 88
    :cond_4
    move-object v6, v12

    .line 89
    :goto_2
    and-long/2addr v13, v2

    .line 90
    cmp-long v13, v13, v4

    .line 91
    .line 92
    if-eqz v13, :cond_6

    .line 93
    .line 94
    if-eqz v18, :cond_5

    .line 95
    .line 96
    const-string v6, ""

    .line 97
    .line 98
    :cond_5
    iget-object v12, v1, Lcom/zykj/study/databinding/ItemMyCourseBinding;->tvTeacherName:Landroid/widget/TextView;

    .line 99
    .line 100
    invoke-virtual {v12}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 101
    .line 102
    .line 103
    move-result-object v12

    .line 104
    sget v14, Lcom/zykj/study/R$string;->author:I

    .line 105
    .line 106
    filled-new-array {v6}, [Ljava/lang/Object;

    .line 107
    .line 108
    .line 109
    move-result-object v6

    .line 110
    invoke-virtual {v12, v14, v6}, Landroid/content/res/Resources;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 111
    .line 112
    .line 113
    move-result-object v12

    .line 114
    :cond_6
    and-long/2addr v2, v9

    .line 115
    cmp-long v2, v2, v4

    .line 116
    .line 117
    if-eqz v2, :cond_7

    .line 118
    .line 119
    iget-object v2, v1, Lcom/zykj/study/databinding/ItemMyCourseBinding;->itemCourseStatus:Lcom/zykj/study/databinding/ItemCourseStatusBinding;

    .line 120
    .line 121
    invoke-virtual {v2, v0}, Lcom/zykj/study/databinding/ItemCourseStatusBinding;->setEntity(Lcom/zykj/study/bean/course/CourseBean;)V

    .line 122
    .line 123
    .line 124
    iget-object v2, v1, Lcom/zykj/study/databinding/ItemMyCourseBinding;->itemCourseTitle:Lcom/zykj/study/databinding/ItemCourseTitleBinding;

    .line 125
    .line 126
    invoke-virtual {v2, v0}, Lcom/zykj/study/databinding/ItemCourseTitleBinding;->setEntity(Lcom/zykj/study/bean/course/CourseBean;)V

    .line 127
    .line 128
    .line 129
    iget-object v0, v1, Lcom/zykj/study/databinding/ItemMyCourseBindingImpl;->mboundView1:Landroid/widget/ImageView;

    .line 130
    .line 131
    invoke-static {v0, v11}, Lcom/zykj/base/ext/BindingAdaptersKt;->netUrl(Landroid/widget/ImageView;Ljava/lang/String;)V

    .line 132
    .line 133
    .line 134
    :cond_7
    if-eqz v15, :cond_8

    .line 135
    .line 136
    iget-object v0, v1, Lcom/zykj/study/databinding/ItemMyCourseBinding;->itemCourseTitle:Lcom/zykj/study/databinding/ItemCourseTitleBinding;

    .line 137
    .line 138
    invoke-virtual {v0, v7}, Lcom/zykj/study/databinding/ItemCourseTitleBinding;->setDictViewModel(Lcom/zykj/study/viewmodels/DictViewModel;)V

    .line 139
    .line 140
    .line 141
    :cond_8
    if-eqz v19, :cond_9

    .line 142
    .line 143
    iget-object v0, v1, Lcom/zykj/study/databinding/ItemMyCourseBinding;->rlContainer:Landroid/widget/RelativeLayout;

    .line 144
    .line 145
    invoke-virtual {v0, v8}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 146
    .line 147
    .line 148
    :cond_9
    if-eqz v13, :cond_a

    .line 149
    .line 150
    iget-object v0, v1, Lcom/zykj/study/databinding/ItemMyCourseBinding;->tvTeacherName:Landroid/widget/TextView;

    .line 151
    .line 152
    invoke-static {v0, v12}, Landroidx/databinding/adapters/TextViewBindingAdapter;->setText(Landroid/widget/TextView;Ljava/lang/CharSequence;)V

    .line 153
    .line 154
    .line 155
    :cond_a
    iget-object v0, v1, Lcom/zykj/study/databinding/ItemMyCourseBinding;->itemCourseTitle:Lcom/zykj/study/databinding/ItemCourseTitleBinding;

    .line 156
    .line 157
    invoke-static {v0}, Landroidx/databinding/ViewDataBinding;->executeBindingsOn(Landroidx/databinding/ViewDataBinding;)V

    .line 158
    .line 159
    .line 160
    iget-object v0, v1, Lcom/zykj/study/databinding/ItemMyCourseBinding;->itemCourseStatus:Lcom/zykj/study/databinding/ItemCourseStatusBinding;

    .line 161
    .line 162
    invoke-static {v0}, Landroidx/databinding/ViewDataBinding;->executeBindingsOn(Landroidx/databinding/ViewDataBinding;)V

    .line 163
    .line 164
    .line 165
    return-void

    .line 166
    :catchall_0
    move-exception v0

    .line 167
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 168
    throw v0
.end method

.method public hasPendingBindings()Z
    .locals 4

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-wide v0, p0, Lcom/zykj/study/databinding/ItemMyCourseBindingImpl;->mDirtyFlags:J

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
    iget-object v0, p0, Lcom/zykj/study/databinding/ItemMyCourseBinding;->itemCourseTitle:Lcom/zykj/study/databinding/ItemCourseTitleBinding;

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
    iget-object v0, p0, Lcom/zykj/study/databinding/ItemMyCourseBinding;->itemCourseStatus:Lcom/zykj/study/databinding/ItemCourseStatusBinding;

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
    iput-wide v0, p0, Lcom/zykj/study/databinding/ItemMyCourseBindingImpl;->mDirtyFlags:J

    .line 5
    .line 6
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 7
    iget-object v0, p0, Lcom/zykj/study/databinding/ItemMyCourseBinding;->itemCourseTitle:Lcom/zykj/study/databinding/ItemCourseTitleBinding;

    .line 8
    .line 9
    invoke-virtual {v0}, Landroidx/databinding/ViewDataBinding;->invalidateAll()V

    .line 10
    .line 11
    .line 12
    iget-object v0, p0, Lcom/zykj/study/databinding/ItemMyCourseBinding;->itemCourseStatus:Lcom/zykj/study/databinding/ItemCourseStatusBinding;

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
    invoke-direct {p0, p2, p3}, Lcom/zykj/study/databinding/ItemMyCourseBindingImpl;->onChangeItemCourseTitle(Lcom/zykj/study/databinding/ItemCourseTitleBinding;I)Z

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
    invoke-direct {p0, p2, p3}, Lcom/zykj/study/databinding/ItemMyCourseBindingImpl;->onChangeItemCourseStatus(Lcom/zykj/study/databinding/ItemCourseStatusBinding;I)Z

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
    iput-object p1, p0, Lcom/zykj/study/databinding/ItemMyCourseBinding;->mClickListener:Landroid/view/View$OnClickListener;

    .line 2
    .line 3
    monitor-enter p0

    .line 4
    :try_start_0
    iget-wide v0, p0, Lcom/zykj/study/databinding/ItemMyCourseBindingImpl;->mDirtyFlags:J

    .line 5
    .line 6
    const-wide/16 v2, 0x20

    .line 7
    .line 8
    or-long/2addr v0, v2

    .line 9
    iput-wide v0, p0, Lcom/zykj/study/databinding/ItemMyCourseBindingImpl;->mDirtyFlags:J

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
    iput-object p1, p0, Lcom/zykj/study/databinding/ItemMyCourseBinding;->mDictViewModel:Lcom/zykj/study/viewmodels/DictViewModel;

    .line 2
    .line 3
    monitor-enter p0

    .line 4
    :try_start_0
    iget-wide v0, p0, Lcom/zykj/study/databinding/ItemMyCourseBindingImpl;->mDirtyFlags:J

    .line 5
    .line 6
    const-wide/16 v2, 0x10

    .line 7
    .line 8
    or-long/2addr v0, v2

    .line 9
    iput-wide v0, p0, Lcom/zykj/study/databinding/ItemMyCourseBindingImpl;->mDirtyFlags:J

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
    iput-object p1, p0, Lcom/zykj/study/databinding/ItemMyCourseBinding;->mEntity:Lcom/zykj/study/data/MyCourseEntity;

    .line 2
    .line 3
    monitor-enter p0

    .line 4
    :try_start_0
    iget-wide v0, p0, Lcom/zykj/study/databinding/ItemMyCourseBindingImpl;->mDirtyFlags:J

    .line 5
    .line 6
    const-wide/16 v2, 0x4

    .line 7
    .line 8
    or-long/2addr v0, v2

    .line 9
    iput-wide v0, p0, Lcom/zykj/study/databinding/ItemMyCourseBindingImpl;->mDirtyFlags:J

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
    iget-object v0, p0, Lcom/zykj/study/databinding/ItemMyCourseBinding;->itemCourseTitle:Lcom/zykj/study/databinding/ItemCourseTitleBinding;

    .line 5
    .line 6
    invoke-virtual {v0, p1}, Landroidx/databinding/ViewDataBinding;->setLifecycleOwner(Landroidx/lifecycle/LifecycleOwner;)V

    .line 7
    .line 8
    .line 9
    iget-object v0, p0, Lcom/zykj/study/databinding/ItemMyCourseBinding;->itemCourseStatus:Lcom/zykj/study/databinding/ItemCourseStatusBinding;

    .line 10
    .line 11
    invoke-virtual {v0, p1}, Landroidx/databinding/ViewDataBinding;->setLifecycleOwner(Landroidx/lifecycle/LifecycleOwner;)V

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method public setUserInfo(Lcom/zykj/lib/login/proto/UserBean;)V
    .locals 4
    .param p1    # Lcom/zykj/lib/login/proto/UserBean;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param

    .line 1
    iput-object p1, p0, Lcom/zykj/study/databinding/ItemMyCourseBinding;->mUserInfo:Lcom/zykj/lib/login/proto/UserBean;

    .line 2
    .line 3
    monitor-enter p0

    .line 4
    :try_start_0
    iget-wide v0, p0, Lcom/zykj/study/databinding/ItemMyCourseBindingImpl;->mDirtyFlags:J

    .line 5
    .line 6
    const-wide/16 v2, 0x8

    .line 7
    .line 8
    or-long/2addr v0, v2

    .line 9
    iput-wide v0, p0, Lcom/zykj/study/databinding/ItemMyCourseBindingImpl;->mDirtyFlags:J

    .line 10
    .line 11
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 12
    const/16 p1, 0x38

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

.method public setVariable(ILjava/lang/Object;)Z
    .locals 2
    .param p2    # Ljava/lang/Object;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param

    .line 1
    const/16 v0, 0xf

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    if-ne v0, p1, :cond_0

    .line 5
    .line 6
    check-cast p2, Lcom/zykj/study/data/MyCourseEntity;

    .line 7
    .line 8
    invoke-virtual {p0, p2}, Lcom/zykj/study/databinding/ItemMyCourseBindingImpl;->setEntity(Lcom/zykj/study/data/MyCourseEntity;)V

    .line 9
    .line 10
    .line 11
    return v1

    .line 12
    :cond_0
    const/16 v0, 0x38

    .line 13
    .line 14
    if-ne v0, p1, :cond_1

    .line 15
    .line 16
    check-cast p2, Lcom/zykj/lib/login/proto/UserBean;

    .line 17
    .line 18
    invoke-virtual {p0, p2}, Lcom/zykj/study/databinding/ItemMyCourseBindingImpl;->setUserInfo(Lcom/zykj/lib/login/proto/UserBean;)V

    .line 19
    .line 20
    .line 21
    return v1

    .line 22
    :cond_1
    const/16 v0, 0xb

    .line 23
    .line 24
    if-ne v0, p1, :cond_2

    .line 25
    .line 26
    check-cast p2, Lcom/zykj/study/viewmodels/DictViewModel;

    .line 27
    .line 28
    invoke-virtual {p0, p2}, Lcom/zykj/study/databinding/ItemMyCourseBindingImpl;->setDictViewModel(Lcom/zykj/study/viewmodels/DictViewModel;)V

    .line 29
    .line 30
    .line 31
    return v1

    .line 32
    :cond_2
    const/4 v0, 0x5

    .line 33
    if-ne v0, p1, :cond_3

    .line 34
    .line 35
    check-cast p2, Landroid/view/View$OnClickListener;

    .line 36
    .line 37
    invoke-virtual {p0, p2}, Lcom/zykj/study/databinding/ItemMyCourseBindingImpl;->setClickListener(Landroid/view/View$OnClickListener;)V

    .line 38
    .line 39
    .line 40
    return v1

    .line 41
    :cond_3
    const/4 p1, 0x0

    .line 42
    return p1
.end method
