.class public Lcom/zykj/study/databinding/LayoutCourseSynopsisBindingImpl;
.super Lcom/zykj/study/databinding/LayoutCourseSynopsisBinding;
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

.field private final mboundView2:Landroid/widget/RelativeLayout;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field private final mboundView3:Landroid/widget/TextView;
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
    const/16 v1, 0xe

    .line 4
    .line 5
    invoke-direct {v0, v1}, Landroidx/databinding/ViewDataBinding$IncludedLayouts;-><init>(I)V

    .line 6
    .line 7
    .line 8
    sput-object v0, Lcom/zykj/study/databinding/LayoutCourseSynopsisBindingImpl;->sIncludes:Landroidx/databinding/ViewDataBinding$IncludedLayouts;

    .line 9
    .line 10
    const-string v1, "item_course_status_btn"

    .line 11
    .line 12
    filled-new-array {v1}, [Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    const/16 v2, 0x8

    .line 17
    .line 18
    filled-new-array {v2}, [I

    .line 19
    .line 20
    .line 21
    move-result-object v2

    .line 22
    sget v3, Lcom/zykj/study/R$layout;->item_course_status_btn:I

    .line 23
    .line 24
    filled-new-array {v3}, [I

    .line 25
    .line 26
    .line 27
    move-result-object v3

    .line 28
    const/4 v4, 0x0

    .line 29
    invoke-virtual {v0, v4, v1, v2, v3}, Landroidx/databinding/ViewDataBinding$IncludedLayouts;->setIncludes(I[Ljava/lang/String;[I[I)V

    .line 30
    .line 31
    .line 32
    const-string v1, "item_course_title"

    .line 33
    .line 34
    filled-new-array {v1}, [Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object v1

    .line 38
    const/4 v2, 0x7

    .line 39
    filled-new-array {v2}, [I

    .line 40
    .line 41
    .line 42
    move-result-object v2

    .line 43
    sget v3, Lcom/zykj/study/R$layout;->item_course_title:I

    .line 44
    .line 45
    filled-new-array {v3}, [I

    .line 46
    .line 47
    .line 48
    move-result-object v3

    .line 49
    const/4 v4, 0x2

    .line 50
    invoke-virtual {v0, v4, v1, v2, v3}, Landroidx/databinding/ViewDataBinding$IncludedLayouts;->setIncludes(I[Ljava/lang/String;[I[I)V

    .line 51
    .line 52
    .line 53
    new-instance v0, Landroid/util/SparseIntArray;

    .line 54
    .line 55
    invoke-direct {v0}, Landroid/util/SparseIntArray;-><init>()V

    .line 56
    .line 57
    .line 58
    sput-object v0, Lcom/zykj/study/databinding/LayoutCourseSynopsisBindingImpl;->sViewsWithIds:Landroid/util/SparseIntArray;

    .line 59
    .line 60
    sget v1, Lcom/zykj/study/R$id;->imageView5:I

    .line 61
    .line 62
    const/16 v2, 0x9

    .line 63
    .line 64
    invoke-virtual {v0, v1, v2}, Landroid/util/SparseIntArray;->put(II)V

    .line 65
    .line 66
    .line 67
    sget v1, Lcom/zykj/study/R$id;->imageView6:I

    .line 68
    .line 69
    const/16 v2, 0xa

    .line 70
    .line 71
    invoke-virtual {v0, v1, v2}, Landroid/util/SparseIntArray;->put(II)V

    .line 72
    .line 73
    .line 74
    sget v1, Lcom/zykj/study/R$id;->expand_text_view:I

    .line 75
    .line 76
    const/16 v2, 0xb

    .line 77
    .line 78
    invoke-virtual {v0, v1, v2}, Landroid/util/SparseIntArray;->put(II)V

    .line 79
    .line 80
    .line 81
    sget v1, Lcom/zykj/image/R$id;->expandable_text:I

    .line 82
    .line 83
    const/16 v2, 0xc

    .line 84
    .line 85
    invoke-virtual {v0, v1, v2}, Landroid/util/SparseIntArray;->put(II)V

    .line 86
    .line 87
    .line 88
    sget v1, Lcom/zykj/image/R$id;->expand_collapse:I

    .line 89
    .line 90
    const/16 v2, 0xd

    .line 91
    .line 92
    invoke-virtual {v0, v1, v2}, Landroid/util/SparseIntArray;->put(II)V

    .line 93
    .line 94
    .line 95
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
    sget-object v0, Lcom/zykj/study/databinding/LayoutCourseSynopsisBindingImpl;->sIncludes:Landroidx/databinding/ViewDataBinding$IncludedLayouts;

    sget-object v1, Lcom/zykj/study/databinding/LayoutCourseSynopsisBindingImpl;->sViewsWithIds:Landroid/util/SparseIntArray;

    const/16 v2, 0xe

    invoke-static {p1, p2, v2, v0, v1}, Landroidx/databinding/ViewDataBinding;->mapBindings(Landroidx/databinding/DataBindingComponent;Landroid/view/View;ILandroidx/databinding/ViewDataBinding$IncludedLayouts;Landroid/util/SparseIntArray;)[Ljava/lang/Object;

    move-result-object v0

    invoke-direct {p0, p1, p2, v0}, Lcom/zykj/study/databinding/LayoutCourseSynopsisBindingImpl;-><init>(Landroidx/databinding/DataBindingComponent;Landroid/view/View;[Ljava/lang/Object;)V

    return-void
.end method

.method private constructor <init>(Landroidx/databinding/DataBindingComponent;Landroid/view/View;[Ljava/lang/Object;)V
    .locals 15

    const/16 v0, 0x8

    .line 2
    aget-object v0, p3, v0

    move-object v4, v0

    check-cast v4, Lcom/zykj/study/databinding/ItemCourseStatusBtnBinding;

    const/16 v0, 0xd

    aget-object v0, p3, v0

    move-object v5, v0

    check-cast v5, Landroid/widget/ImageButton;

    const/16 v0, 0xb

    aget-object v0, p3, v0

    move-object v6, v0

    check-cast v6, Lcom/xuexiang/xui/widget/textview/ExpandableTextView;

    const/16 v0, 0xc

    aget-object v0, p3, v0

    move-object v7, v0

    check-cast v7, Landroid/widget/TextView;

    const/16 v0, 0x9

    aget-object v0, p3, v0

    move-object v8, v0

    check-cast v8, Landroid/widget/ImageView;

    const/16 v0, 0xa

    aget-object v0, p3, v0

    move-object v9, v0

    check-cast v9, Landroid/widget/ImageView;

    const/4 v0, 0x7

    aget-object v0, p3, v0

    move-object v10, v0

    check-cast v10, Lcom/zykj/study/databinding/ItemCourseTitleBinding;

    const/4 v0, 0x1

    aget-object v0, p3, v0

    move-object v11, v0

    check-cast v11, Landroid/widget/ImageView;

    const/4 v0, 0x5

    aget-object v0, p3, v0

    move-object v12, v0

    check-cast v12, Landroid/widget/TextView;

    const/4 v0, 0x6

    aget-object v0, p3, v0

    move-object v13, v0

    check-cast v13, Landroid/widget/TextView;

    const/4 v0, 0x4

    aget-object v0, p3, v0

    move-object v14, v0

    check-cast v14, Landroid/widget/TextView;

    const/4 v3, 0x2

    move-object v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    invoke-direct/range {v0 .. v14}, Lcom/zykj/study/databinding/LayoutCourseSynopsisBinding;-><init>(Ljava/lang/Object;Landroid/view/View;ILcom/zykj/study/databinding/ItemCourseStatusBtnBinding;Landroid/widget/ImageButton;Lcom/xuexiang/xui/widget/textview/ExpandableTextView;Landroid/widget/TextView;Landroid/widget/ImageView;Landroid/widget/ImageView;Lcom/zykj/study/databinding/ItemCourseTitleBinding;Landroid/widget/ImageView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;)V

    const-wide/16 v1, -0x1

    .line 3
    iput-wide v1, p0, Lcom/zykj/study/databinding/LayoutCourseSynopsisBindingImpl;->mDirtyFlags:J

    .line 4
    iget-object v1, p0, Lcom/zykj/study/databinding/LayoutCourseSynopsisBinding;->courseStatusBtn:Lcom/zykj/study/databinding/ItemCourseStatusBtnBinding;

    invoke-virtual {p0, v1}, Landroidx/databinding/ViewDataBinding;->setContainedBinding(Landroidx/databinding/ViewDataBinding;)V

    .line 5
    iget-object v1, p0, Lcom/zykj/study/databinding/LayoutCourseSynopsisBinding;->itemCourseTitle:Lcom/zykj/study/databinding/ItemCourseTitleBinding;

    invoke-virtual {p0, v1}, Landroidx/databinding/ViewDataBinding;->setContainedBinding(Landroidx/databinding/ViewDataBinding;)V

    .line 6
    iget-object v1, p0, Lcom/zykj/study/databinding/LayoutCourseSynopsisBinding;->ivCover:Landroid/widget/ImageView;

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    const/4 v1, 0x0

    .line 7
    aget-object v1, p3, v1

    check-cast v1, Landroid/widget/LinearLayout;

    iput-object v1, p0, Lcom/zykj/study/databinding/LayoutCourseSynopsisBindingImpl;->mboundView0:Landroid/widget/LinearLayout;

    .line 8
    invoke-virtual {v1, v2}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    const/4 v1, 0x2

    .line 9
    aget-object v1, p3, v1

    check-cast v1, Landroid/widget/RelativeLayout;

    iput-object v1, p0, Lcom/zykj/study/databinding/LayoutCourseSynopsisBindingImpl;->mboundView2:Landroid/widget/RelativeLayout;

    .line 10
    invoke-virtual {v1, v2}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    const/4 v1, 0x3

    .line 11
    aget-object v1, p3, v1

    check-cast v1, Landroid/widget/TextView;

    iput-object v1, p0, Lcom/zykj/study/databinding/LayoutCourseSynopsisBindingImpl;->mboundView3:Landroid/widget/TextView;

    .line 12
    invoke-virtual {v1, v2}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 13
    iget-object v1, p0, Lcom/zykj/study/databinding/LayoutCourseSynopsisBinding;->textView4:Landroid/widget/TextView;

    invoke-virtual {v1, v2}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 14
    iget-object v1, p0, Lcom/zykj/study/databinding/LayoutCourseSynopsisBinding;->textView6:Landroid/widget/TextView;

    invoke-virtual {v1, v2}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 15
    iget-object v1, p0, Lcom/zykj/study/databinding/LayoutCourseSynopsisBinding;->tvTeacherName:Landroid/widget/TextView;

    invoke-virtual {v1, v2}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    move-object/from16 v2, p2

    .line 16
    invoke-virtual {p0, v2}, Landroidx/databinding/ViewDataBinding;->setRootTag(Landroid/view/View;)V

    .line 17
    invoke-virtual {p0}, Lcom/zykj/study/databinding/LayoutCourseSynopsisBindingImpl;->invalidateAll()V

    return-void
.end method

.method private onChangeCourseStatusBtn(Lcom/zykj/study/databinding/ItemCourseStatusBtnBinding;I)Z
    .locals 2

    .line 1
    if-nez p2, :cond_0

    .line 2
    .line 3
    monitor-enter p0

    .line 4
    :try_start_0
    iget-wide p1, p0, Lcom/zykj/study/databinding/LayoutCourseSynopsisBindingImpl;->mDirtyFlags:J

    .line 5
    .line 6
    const-wide/16 v0, 0x1

    .line 7
    .line 8
    or-long/2addr p1, v0

    .line 9
    iput-wide p1, p0, Lcom/zykj/study/databinding/LayoutCourseSynopsisBindingImpl;->mDirtyFlags:J

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
    iget-wide p1, p0, Lcom/zykj/study/databinding/LayoutCourseSynopsisBindingImpl;->mDirtyFlags:J

    .line 5
    .line 6
    const-wide/16 v0, 0x2

    .line 7
    .line 8
    or-long/2addr p1, v0

    .line 9
    iput-wide p1, p0, Lcom/zykj/study/databinding/LayoutCourseSynopsisBindingImpl;->mDirtyFlags:J

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
    .locals 22

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    monitor-enter p0

    .line 4
    :try_start_0
    iget-wide v2, v1, Lcom/zykj/study/databinding/LayoutCourseSynopsisBindingImpl;->mDirtyFlags:J

    .line 5
    .line 6
    const-wide/16 v4, 0x0

    .line 7
    .line 8
    iput-wide v4, v1, Lcom/zykj/study/databinding/LayoutCourseSynopsisBindingImpl;->mDirtyFlags:J

    .line 9
    .line 10
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 11
    iget-object v0, v1, Lcom/zykj/study/databinding/LayoutCourseSynopsisBinding;->mEntity:Lcom/zykj/study/bean/course/CourseDetailsBean;

    .line 12
    .line 13
    iget-object v6, v1, Lcom/zykj/study/databinding/LayoutCourseSynopsisBinding;->mUserInfo:Lcom/zykj/lib/login/proto/UserBean;

    .line 14
    .line 15
    iget-object v7, v1, Lcom/zykj/study/databinding/LayoutCourseSynopsisBinding;->mDictViewModel:Lcom/zykj/study/viewmodels/DictViewModel;

    .line 16
    .line 17
    const-wide/16 v8, 0x24

    .line 18
    .line 19
    and-long v10, v2, v8

    .line 20
    .line 21
    cmp-long v10, v10, v4

    .line 22
    .line 23
    const-wide/16 v11, 0x40

    .line 24
    .line 25
    const/4 v13, 0x0

    .line 26
    const/4 v14, 0x0

    .line 27
    if-eqz v10, :cond_4

    .line 28
    .line 29
    if-eqz v0, :cond_0

    .line 30
    .line 31
    invoke-virtual {v0}, Lcom/zykj/study/bean/course/CourseBean;->getLearning()I

    .line 32
    .line 33
    .line 34
    move-result v15

    .line 35
    invoke-virtual {v0}, Lcom/zykj/study/bean/course/CourseDetailsBean;->isLearning()Z

    .line 36
    .line 37
    .line 38
    move-result v16

    .line 39
    invoke-virtual {v0}, Lcom/zykj/study/bean/course/CourseDetailsBean;->getProgress()Ljava/lang/Integer;

    .line 40
    .line 41
    .line 42
    move-result-object v17

    .line 43
    invoke-virtual {v0}, Lcom/zykj/study/bean/course/CourseBean;->getCover()Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object v18

    .line 47
    invoke-virtual {v0}, Lcom/zykj/study/bean/course/CourseBean;->getLikes()I

    .line 48
    .line 49
    .line 50
    move-result v19

    .line 51
    goto :goto_0

    .line 52
    :cond_0
    move v15, v13

    .line 53
    move/from16 v16, v15

    .line 54
    .line 55
    move/from16 v19, v16

    .line 56
    .line 57
    move-object/from16 v17, v14

    .line 58
    .line 59
    move-object/from16 v18, v17

    .line 60
    .line 61
    :goto_0
    if-nez v0, :cond_1

    .line 62
    .line 63
    const/4 v13, 0x1

    .line 64
    :cond_1
    if-eqz v10, :cond_3

    .line 65
    .line 66
    if-eqz v13, :cond_2

    .line 67
    .line 68
    const-wide/16 v20, 0x80

    .line 69
    .line 70
    or-long v2, v2, v20

    .line 71
    .line 72
    goto :goto_1

    .line 73
    :cond_2
    or-long/2addr v2, v11

    .line 74
    :cond_3
    :goto_1
    invoke-static {v15}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 75
    .line 76
    .line 77
    move-result-object v10

    .line 78
    iget-object v15, v1, Lcom/zykj/study/databinding/LayoutCourseSynopsisBindingImpl;->mboundView3:Landroid/widget/TextView;

    .line 79
    .line 80
    invoke-virtual {v15}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 81
    .line 82
    .line 83
    move-result-object v15

    .line 84
    move-wide/from16 v20, v4

    .line 85
    .line 86
    sget v4, Lcom/zykj/study/R$string;->complete_progress:I

    .line 87
    .line 88
    filled-new-array/range {v17 .. v17}, [Ljava/lang/Object;

    .line 89
    .line 90
    .line 91
    move-result-object v5

    .line 92
    invoke-virtual {v15, v4, v5}, Landroid/content/res/Resources;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 93
    .line 94
    .line 95
    move-result-object v4

    .line 96
    invoke-static/range {v19 .. v19}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 97
    .line 98
    .line 99
    move-result-object v5

    .line 100
    move-object/from16 v15, v18

    .line 101
    .line 102
    goto :goto_2

    .line 103
    :cond_4
    move-wide/from16 v20, v4

    .line 104
    .line 105
    move/from16 v16, v13

    .line 106
    .line 107
    move-object v4, v14

    .line 108
    move-object v5, v4

    .line 109
    move-object v10, v5

    .line 110
    move-object v15, v10

    .line 111
    :goto_2
    const-wide/16 v17, 0x28

    .line 112
    .line 113
    and-long v17, v2, v17

    .line 114
    .line 115
    cmp-long v17, v17, v20

    .line 116
    .line 117
    const-wide/16 v18, 0x30

    .line 118
    .line 119
    and-long v18, v2, v18

    .line 120
    .line 121
    cmp-long v18, v18, v20

    .line 122
    .line 123
    and-long/2addr v11, v2

    .line 124
    cmp-long v11, v11, v20

    .line 125
    .line 126
    if-eqz v11, :cond_5

    .line 127
    .line 128
    if-eqz v0, :cond_5

    .line 129
    .line 130
    invoke-virtual {v0}, Lcom/zykj/study/bean/course/CourseSimpleBean;->getUserName()Ljava/lang/String;

    .line 131
    .line 132
    .line 133
    move-result-object v11

    .line 134
    goto :goto_3

    .line 135
    :cond_5
    move-object v11, v14

    .line 136
    :goto_3
    and-long/2addr v2, v8

    .line 137
    cmp-long v2, v2, v20

    .line 138
    .line 139
    if-eqz v2, :cond_7

    .line 140
    .line 141
    if-eqz v13, :cond_6

    .line 142
    .line 143
    const-string v11, ""

    .line 144
    .line 145
    :cond_6
    iget-object v3, v1, Lcom/zykj/study/databinding/LayoutCourseSynopsisBinding;->tvTeacherName:Landroid/widget/TextView;

    .line 146
    .line 147
    invoke-virtual {v3}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 148
    .line 149
    .line 150
    move-result-object v3

    .line 151
    sget v8, Lcom/zykj/study/R$string;->author:I

    .line 152
    .line 153
    filled-new-array {v11}, [Ljava/lang/Object;

    .line 154
    .line 155
    .line 156
    move-result-object v9

    .line 157
    invoke-virtual {v3, v8, v9}, Landroid/content/res/Resources;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 158
    .line 159
    .line 160
    move-result-object v14

    .line 161
    :cond_7
    if-eqz v2, :cond_8

    .line 162
    .line 163
    iget-object v2, v1, Lcom/zykj/study/databinding/LayoutCourseSynopsisBinding;->courseStatusBtn:Lcom/zykj/study/databinding/ItemCourseStatusBtnBinding;

    .line 164
    .line 165
    invoke-virtual {v2, v0}, Lcom/zykj/study/databinding/ItemCourseStatusBtnBinding;->setEntity(Lcom/zykj/study/bean/course/CourseDetailsBean;)V

    .line 166
    .line 167
    .line 168
    iget-object v2, v1, Lcom/zykj/study/databinding/LayoutCourseSynopsisBinding;->itemCourseTitle:Lcom/zykj/study/databinding/ItemCourseTitleBinding;

    .line 169
    .line 170
    invoke-virtual {v2, v0}, Lcom/zykj/study/databinding/ItemCourseTitleBinding;->setEntity(Lcom/zykj/study/bean/course/CourseBean;)V

    .line 171
    .line 172
    .line 173
    iget-object v0, v1, Lcom/zykj/study/databinding/LayoutCourseSynopsisBinding;->ivCover:Landroid/widget/ImageView;

    .line 174
    .line 175
    invoke-static {v0, v15}, Le5/c;->f(Landroid/widget/ImageView;Ljava/lang/String;)V

    .line 176
    .line 177
    .line 178
    iget-object v0, v1, Lcom/zykj/study/databinding/LayoutCourseSynopsisBindingImpl;->mboundView3:Landroid/widget/TextView;

    .line 179
    .line 180
    invoke-static {v0, v4}, Landroidx/databinding/adapters/TextViewBindingAdapter;->setText(Landroid/widget/TextView;Ljava/lang/CharSequence;)V

    .line 181
    .line 182
    .line 183
    iget-object v0, v1, Lcom/zykj/study/databinding/LayoutCourseSynopsisBindingImpl;->mboundView3:Landroid/widget/TextView;

    .line 184
    .line 185
    invoke-static/range {v16 .. v16}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 186
    .line 187
    .line 188
    move-result-object v2

    .line 189
    invoke-static {v0, v2}, Le5/c;->t(Landroid/view/View;Ljava/lang/Boolean;)V

    .line 190
    .line 191
    .line 192
    iget-object v0, v1, Lcom/zykj/study/databinding/LayoutCourseSynopsisBinding;->textView4:Landroid/widget/TextView;

    .line 193
    .line 194
    invoke-static {v0, v10}, Landroidx/databinding/adapters/TextViewBindingAdapter;->setText(Landroid/widget/TextView;Ljava/lang/CharSequence;)V

    .line 195
    .line 196
    .line 197
    iget-object v0, v1, Lcom/zykj/study/databinding/LayoutCourseSynopsisBinding;->textView6:Landroid/widget/TextView;

    .line 198
    .line 199
    invoke-static {v0, v5}, Landroidx/databinding/adapters/TextViewBindingAdapter;->setText(Landroid/widget/TextView;Ljava/lang/CharSequence;)V

    .line 200
    .line 201
    .line 202
    iget-object v0, v1, Lcom/zykj/study/databinding/LayoutCourseSynopsisBinding;->tvTeacherName:Landroid/widget/TextView;

    .line 203
    .line 204
    invoke-static {v0, v14}, Landroidx/databinding/adapters/TextViewBindingAdapter;->setText(Landroid/widget/TextView;Ljava/lang/CharSequence;)V

    .line 205
    .line 206
    .line 207
    :cond_8
    if-eqz v17, :cond_9

    .line 208
    .line 209
    iget-object v0, v1, Lcom/zykj/study/databinding/LayoutCourseSynopsisBinding;->courseStatusBtn:Lcom/zykj/study/databinding/ItemCourseStatusBtnBinding;

    .line 210
    .line 211
    invoke-virtual {v0, v6}, Lcom/zykj/study/databinding/ItemCourseStatusBtnBinding;->setUserInfo(Lcom/zykj/lib/login/proto/UserBean;)V

    .line 212
    .line 213
    .line 214
    :cond_9
    if-eqz v18, :cond_a

    .line 215
    .line 216
    iget-object v0, v1, Lcom/zykj/study/databinding/LayoutCourseSynopsisBinding;->itemCourseTitle:Lcom/zykj/study/databinding/ItemCourseTitleBinding;

    .line 217
    .line 218
    invoke-virtual {v0, v7}, Lcom/zykj/study/databinding/ItemCourseTitleBinding;->setDictViewModel(Lcom/zykj/study/viewmodels/DictViewModel;)V

    .line 219
    .line 220
    .line 221
    :cond_a
    iget-object v0, v1, Lcom/zykj/study/databinding/LayoutCourseSynopsisBinding;->itemCourseTitle:Lcom/zykj/study/databinding/ItemCourseTitleBinding;

    .line 222
    .line 223
    invoke-static {v0}, Landroidx/databinding/ViewDataBinding;->executeBindingsOn(Landroidx/databinding/ViewDataBinding;)V

    .line 224
    .line 225
    .line 226
    iget-object v0, v1, Lcom/zykj/study/databinding/LayoutCourseSynopsisBinding;->courseStatusBtn:Lcom/zykj/study/databinding/ItemCourseStatusBtnBinding;

    .line 227
    .line 228
    invoke-static {v0}, Landroidx/databinding/ViewDataBinding;->executeBindingsOn(Landroidx/databinding/ViewDataBinding;)V

    .line 229
    .line 230
    .line 231
    return-void

    .line 232
    :catchall_0
    move-exception v0

    .line 233
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 234
    throw v0
.end method

.method public hasPendingBindings()Z
    .locals 4

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-wide v0, p0, Lcom/zykj/study/databinding/LayoutCourseSynopsisBindingImpl;->mDirtyFlags:J

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
    iget-object v0, p0, Lcom/zykj/study/databinding/LayoutCourseSynopsisBinding;->itemCourseTitle:Lcom/zykj/study/databinding/ItemCourseTitleBinding;

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
    iget-object v0, p0, Lcom/zykj/study/databinding/LayoutCourseSynopsisBinding;->courseStatusBtn:Lcom/zykj/study/databinding/ItemCourseStatusBtnBinding;

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
    const-wide/16 v0, 0x20

    .line 3
    .line 4
    :try_start_0
    iput-wide v0, p0, Lcom/zykj/study/databinding/LayoutCourseSynopsisBindingImpl;->mDirtyFlags:J

    .line 5
    .line 6
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 7
    iget-object v0, p0, Lcom/zykj/study/databinding/LayoutCourseSynopsisBinding;->itemCourseTitle:Lcom/zykj/study/databinding/ItemCourseTitleBinding;

    .line 8
    .line 9
    invoke-virtual {v0}, Landroidx/databinding/ViewDataBinding;->invalidateAll()V

    .line 10
    .line 11
    .line 12
    iget-object v0, p0, Lcom/zykj/study/databinding/LayoutCourseSynopsisBinding;->courseStatusBtn:Lcom/zykj/study/databinding/ItemCourseStatusBtnBinding;

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
    invoke-direct {p0, p2, p3}, Lcom/zykj/study/databinding/LayoutCourseSynopsisBindingImpl;->onChangeItemCourseTitle(Lcom/zykj/study/databinding/ItemCourseTitleBinding;I)Z

    .line 11
    .line 12
    .line 13
    move-result p1

    .line 14
    return p1

    .line 15
    :cond_1
    check-cast p2, Lcom/zykj/study/databinding/ItemCourseStatusBtnBinding;

    .line 16
    .line 17
    invoke-direct {p0, p2, p3}, Lcom/zykj/study/databinding/LayoutCourseSynopsisBindingImpl;->onChangeCourseStatusBtn(Lcom/zykj/study/databinding/ItemCourseStatusBtnBinding;I)Z

    .line 18
    .line 19
    .line 20
    move-result p1

    .line 21
    return p1
.end method

.method public setDictViewModel(Lcom/zykj/study/viewmodels/DictViewModel;)V
    .locals 4
    .param p1    # Lcom/zykj/study/viewmodels/DictViewModel;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param

    .line 1
    iput-object p1, p0, Lcom/zykj/study/databinding/LayoutCourseSynopsisBinding;->mDictViewModel:Lcom/zykj/study/viewmodels/DictViewModel;

    .line 2
    .line 3
    monitor-enter p0

    .line 4
    :try_start_0
    iget-wide v0, p0, Lcom/zykj/study/databinding/LayoutCourseSynopsisBindingImpl;->mDirtyFlags:J

    .line 5
    .line 6
    const-wide/16 v2, 0x10

    .line 7
    .line 8
    or-long/2addr v0, v2

    .line 9
    iput-wide v0, p0, Lcom/zykj/study/databinding/LayoutCourseSynopsisBindingImpl;->mDirtyFlags:J

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

.method public setEntity(Lcom/zykj/study/bean/course/CourseDetailsBean;)V
    .locals 4
    .param p1    # Lcom/zykj/study/bean/course/CourseDetailsBean;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param

    .line 1
    iput-object p1, p0, Lcom/zykj/study/databinding/LayoutCourseSynopsisBinding;->mEntity:Lcom/zykj/study/bean/course/CourseDetailsBean;

    .line 2
    .line 3
    monitor-enter p0

    .line 4
    :try_start_0
    iget-wide v0, p0, Lcom/zykj/study/databinding/LayoutCourseSynopsisBindingImpl;->mDirtyFlags:J

    .line 5
    .line 6
    const-wide/16 v2, 0x4

    .line 7
    .line 8
    or-long/2addr v0, v2

    .line 9
    iput-wide v0, p0, Lcom/zykj/study/databinding/LayoutCourseSynopsisBindingImpl;->mDirtyFlags:J

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
    iget-object v0, p0, Lcom/zykj/study/databinding/LayoutCourseSynopsisBinding;->itemCourseTitle:Lcom/zykj/study/databinding/ItemCourseTitleBinding;

    .line 5
    .line 6
    invoke-virtual {v0, p1}, Landroidx/databinding/ViewDataBinding;->setLifecycleOwner(Landroidx/lifecycle/LifecycleOwner;)V

    .line 7
    .line 8
    .line 9
    iget-object v0, p0, Lcom/zykj/study/databinding/LayoutCourseSynopsisBinding;->courseStatusBtn:Lcom/zykj/study/databinding/ItemCourseStatusBtnBinding;

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
    iput-object p1, p0, Lcom/zykj/study/databinding/LayoutCourseSynopsisBinding;->mUserInfo:Lcom/zykj/lib/login/proto/UserBean;

    .line 2
    .line 3
    monitor-enter p0

    .line 4
    :try_start_0
    iget-wide v0, p0, Lcom/zykj/study/databinding/LayoutCourseSynopsisBindingImpl;->mDirtyFlags:J

    .line 5
    .line 6
    const-wide/16 v2, 0x8

    .line 7
    .line 8
    or-long/2addr v0, v2

    .line 9
    iput-wide v0, p0, Lcom/zykj/study/databinding/LayoutCourseSynopsisBindingImpl;->mDirtyFlags:J

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
    check-cast p2, Lcom/zykj/study/bean/course/CourseDetailsBean;

    .line 7
    .line 8
    invoke-virtual {p0, p2}, Lcom/zykj/study/databinding/LayoutCourseSynopsisBindingImpl;->setEntity(Lcom/zykj/study/bean/course/CourseDetailsBean;)V

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
    invoke-virtual {p0, p2}, Lcom/zykj/study/databinding/LayoutCourseSynopsisBindingImpl;->setUserInfo(Lcom/zykj/lib/login/proto/UserBean;)V

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
    invoke-virtual {p0, p2}, Lcom/zykj/study/databinding/LayoutCourseSynopsisBindingImpl;->setDictViewModel(Lcom/zykj/study/viewmodels/DictViewModel;)V

    .line 29
    .line 30
    .line 31
    return v1

    .line 32
    :cond_2
    const/4 p1, 0x0

    .line 33
    return p1
.end method
