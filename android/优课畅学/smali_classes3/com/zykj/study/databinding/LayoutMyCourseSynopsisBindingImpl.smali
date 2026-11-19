.class public Lcom/zykj/study/databinding/LayoutMyCourseSynopsisBindingImpl;
.super Lcom/zykj/study/databinding/LayoutMyCourseSynopsisBinding;
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

.field private final mboundView1:Landroid/widget/LinearLayout;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field private final mboundView5:Landroid/widget/TextView;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field private final mboundView6:Landroid/widget/TextView;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field private final mboundView7:Landroid/widget/ImageView;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field private final mboundView8:Landroid/widget/ImageView;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field private final mboundView9:Landroid/widget/TextView;
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
    const/16 v1, 0x12

    .line 4
    .line 5
    invoke-direct {v0, v1}, Landroidx/databinding/ViewDataBinding$IncludedLayouts;-><init>(I)V

    .line 6
    .line 7
    .line 8
    sput-object v0, Lcom/zykj/study/databinding/LayoutMyCourseSynopsisBindingImpl;->sIncludes:Landroidx/databinding/ViewDataBinding$IncludedLayouts;

    .line 9
    .line 10
    const-string v1, "item_course_title"

    .line 11
    .line 12
    filled-new-array {v1}, [Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    const/16 v2, 0xc

    .line 17
    .line 18
    filled-new-array {v2}, [I

    .line 19
    .line 20
    .line 21
    move-result-object v2

    .line 22
    sget v3, Lcom/zykj/study/R$layout;->item_course_title:I

    .line 23
    .line 24
    filled-new-array {v3}, [I

    .line 25
    .line 26
    .line 27
    move-result-object v3

    .line 28
    const/4 v4, 0x1

    .line 29
    invoke-virtual {v0, v4, v1, v2, v3}, Landroidx/databinding/ViewDataBinding$IncludedLayouts;->setIncludes(I[Ljava/lang/String;[I[I)V

    .line 30
    .line 31
    .line 32
    new-instance v0, Landroid/util/SparseIntArray;

    .line 33
    .line 34
    invoke-direct {v0}, Landroid/util/SparseIntArray;-><init>()V

    .line 35
    .line 36
    .line 37
    sput-object v0, Lcom/zykj/study/databinding/LayoutMyCourseSynopsisBindingImpl;->sViewsWithIds:Landroid/util/SparseIntArray;

    .line 38
    .line 39
    sget v1, Lcom/zykj/study/R$id;->imageView5:I

    .line 40
    .line 41
    const/16 v2, 0xd

    .line 42
    .line 43
    invoke-virtual {v0, v1, v2}, Landroid/util/SparseIntArray;->put(II)V

    .line 44
    .line 45
    .line 46
    sget v1, Lcom/zykj/study/R$id;->expand_text_view:I

    .line 47
    .line 48
    const/16 v2, 0xe

    .line 49
    .line 50
    invoke-virtual {v0, v1, v2}, Landroid/util/SparseIntArray;->put(II)V

    .line 51
    .line 52
    .line 53
    sget v1, Lcom/zykj/image/R$id;->expandable_text:I

    .line 54
    .line 55
    const/16 v2, 0xf

    .line 56
    .line 57
    invoke-virtual {v0, v1, v2}, Landroid/util/SparseIntArray;->put(II)V

    .line 58
    .line 59
    .line 60
    sget v1, Lcom/zykj/image/R$id;->expand_collapse:I

    .line 61
    .line 62
    const/16 v2, 0x10

    .line 63
    .line 64
    invoke-virtual {v0, v1, v2}, Landroid/util/SparseIntArray;->put(II)V

    .line 65
    .line 66
    .line 67
    sget v1, Lcom/zykj/study/R$id;->divider:I

    .line 68
    .line 69
    const/16 v2, 0x11

    .line 70
    .line 71
    invoke-virtual {v0, v1, v2}, Landroid/util/SparseIntArray;->put(II)V

    .line 72
    .line 73
    .line 74
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
    sget-object v0, Lcom/zykj/study/databinding/LayoutMyCourseSynopsisBindingImpl;->sIncludes:Landroidx/databinding/ViewDataBinding$IncludedLayouts;

    sget-object v1, Lcom/zykj/study/databinding/LayoutMyCourseSynopsisBindingImpl;->sViewsWithIds:Landroid/util/SparseIntArray;

    const/16 v2, 0x12

    invoke-static {p1, p2, v2, v0, v1}, Landroidx/databinding/ViewDataBinding;->mapBindings(Landroidx/databinding/DataBindingComponent;Landroid/view/View;ILandroidx/databinding/ViewDataBinding$IncludedLayouts;Landroid/util/SparseIntArray;)[Ljava/lang/Object;

    move-result-object v0

    invoke-direct {p0, p1, p2, v0}, Lcom/zykj/study/databinding/LayoutMyCourseSynopsisBindingImpl;-><init>(Landroidx/databinding/DataBindingComponent;Landroid/view/View;[Ljava/lang/Object;)V

    return-void
.end method

.method private constructor <init>(Landroidx/databinding/DataBindingComponent;Landroid/view/View;[Ljava/lang/Object;)V
    .locals 15

    const/16 v0, 0xb

    .line 2
    aget-object v0, p3, v0

    move-object v4, v0

    check-cast v4, Landroid/widget/Button;

    const/16 v0, 0xa

    aget-object v0, p3, v0

    move-object v5, v0

    check-cast v5, Landroid/widget/Button;

    const/16 v0, 0x11

    aget-object v0, p3, v0

    move-object v6, v0

    check-cast v6, Landroid/view/View;

    const/16 v0, 0x10

    aget-object v0, p3, v0

    move-object v7, v0

    check-cast v7, Landroid/widget/ImageButton;

    const/16 v0, 0xe

    aget-object v0, p3, v0

    move-object v8, v0

    check-cast v8, Lcom/xuexiang/xui/widget/textview/ExpandableTextView;

    const/16 v0, 0xf

    aget-object v0, p3, v0

    move-object v9, v0

    check-cast v9, Landroid/widget/TextView;

    const/16 v0, 0xd

    aget-object v0, p3, v0

    move-object v10, v0

    check-cast v10, Landroid/widget/ImageView;

    const/16 v0, 0xc

    aget-object v0, p3, v0

    move-object v11, v0

    check-cast v11, Lcom/zykj/study/databinding/ItemCourseTitleBinding;

    const/4 v0, 0x2

    aget-object v0, p3, v0

    move-object v12, v0

    check-cast v12, Landroid/widget/ImageView;

    const/4 v0, 0x4

    aget-object v0, p3, v0

    move-object v13, v0

    check-cast v13, Landroid/widget/TextView;

    const/4 v0, 0x3

    aget-object v0, p3, v0

    move-object v14, v0

    check-cast v14, Landroid/widget/TextView;

    const/4 v3, 0x1

    move-object v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    invoke-direct/range {v0 .. v14}, Lcom/zykj/study/databinding/LayoutMyCourseSynopsisBinding;-><init>(Ljava/lang/Object;Landroid/view/View;ILandroid/widget/Button;Landroid/widget/Button;Landroid/view/View;Landroid/widget/ImageButton;Lcom/xuexiang/xui/widget/textview/ExpandableTextView;Landroid/widget/TextView;Landroid/widget/ImageView;Lcom/zykj/study/databinding/ItemCourseTitleBinding;Landroid/widget/ImageView;Landroid/widget/TextView;Landroid/widget/TextView;)V

    const-wide/16 v1, -0x1

    .line 3
    iput-wide v1, p0, Lcom/zykj/study/databinding/LayoutMyCourseSynopsisBindingImpl;->mDirtyFlags:J

    .line 4
    iget-object v1, p0, Lcom/zykj/study/databinding/LayoutMyCourseSynopsisBinding;->btGrounding:Landroid/widget/Button;

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 5
    iget-object v1, p0, Lcom/zykj/study/databinding/LayoutMyCourseSynopsisBinding;->btUndercarriage:Landroid/widget/Button;

    invoke-virtual {v1, v2}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 6
    iget-object v1, p0, Lcom/zykj/study/databinding/LayoutMyCourseSynopsisBinding;->itemCourseTitle:Lcom/zykj/study/databinding/ItemCourseTitleBinding;

    invoke-virtual {p0, v1}, Landroidx/databinding/ViewDataBinding;->setContainedBinding(Landroidx/databinding/ViewDataBinding;)V

    .line 7
    iget-object v1, p0, Lcom/zykj/study/databinding/LayoutMyCourseSynopsisBinding;->ivCover:Landroid/widget/ImageView;

    invoke-virtual {v1, v2}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    const/4 v1, 0x0

    .line 8
    aget-object v1, p3, v1

    check-cast v1, Landroid/widget/LinearLayout;

    iput-object v1, p0, Lcom/zykj/study/databinding/LayoutMyCourseSynopsisBindingImpl;->mboundView0:Landroid/widget/LinearLayout;

    .line 9
    invoke-virtual {v1, v2}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    const/4 v1, 0x1

    .line 10
    aget-object v1, p3, v1

    check-cast v1, Landroid/widget/LinearLayout;

    iput-object v1, p0, Lcom/zykj/study/databinding/LayoutMyCourseSynopsisBindingImpl;->mboundView1:Landroid/widget/LinearLayout;

    .line 11
    invoke-virtual {v1, v2}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    const/4 v1, 0x5

    .line 12
    aget-object v1, p3, v1

    check-cast v1, Landroid/widget/TextView;

    iput-object v1, p0, Lcom/zykj/study/databinding/LayoutMyCourseSynopsisBindingImpl;->mboundView5:Landroid/widget/TextView;

    .line 13
    invoke-virtual {v1, v2}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    const/4 v1, 0x6

    .line 14
    aget-object v1, p3, v1

    check-cast v1, Landroid/widget/TextView;

    iput-object v1, p0, Lcom/zykj/study/databinding/LayoutMyCourseSynopsisBindingImpl;->mboundView6:Landroid/widget/TextView;

    .line 15
    invoke-virtual {v1, v2}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    const/4 v1, 0x7

    .line 16
    aget-object v1, p3, v1

    check-cast v1, Landroid/widget/ImageView;

    iput-object v1, p0, Lcom/zykj/study/databinding/LayoutMyCourseSynopsisBindingImpl;->mboundView7:Landroid/widget/ImageView;

    .line 17
    invoke-virtual {v1, v2}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    const/16 v1, 0x8

    .line 18
    aget-object v1, p3, v1

    check-cast v1, Landroid/widget/ImageView;

    iput-object v1, p0, Lcom/zykj/study/databinding/LayoutMyCourseSynopsisBindingImpl;->mboundView8:Landroid/widget/ImageView;

    .line 19
    invoke-virtual {v1, v2}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    const/16 v1, 0x9

    .line 20
    aget-object v1, p3, v1

    check-cast v1, Landroid/widget/TextView;

    iput-object v1, p0, Lcom/zykj/study/databinding/LayoutMyCourseSynopsisBindingImpl;->mboundView9:Landroid/widget/TextView;

    .line 21
    invoke-virtual {v1, v2}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 22
    iget-object v1, p0, Lcom/zykj/study/databinding/LayoutMyCourseSynopsisBinding;->textView4:Landroid/widget/TextView;

    invoke-virtual {v1, v2}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 23
    iget-object v1, p0, Lcom/zykj/study/databinding/LayoutMyCourseSynopsisBinding;->tvTeacherName:Landroid/widget/TextView;

    invoke-virtual {v1, v2}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    move-object/from16 v2, p2

    .line 24
    invoke-virtual {p0, v2}, Landroidx/databinding/ViewDataBinding;->setRootTag(Landroid/view/View;)V

    .line 25
    invoke-virtual {p0}, Lcom/zykj/study/databinding/LayoutMyCourseSynopsisBindingImpl;->invalidateAll()V

    return-void
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
    iget-wide p1, p0, Lcom/zykj/study/databinding/LayoutMyCourseSynopsisBindingImpl;->mDirtyFlags:J

    .line 5
    .line 6
    const-wide/16 v0, 0x1

    .line 7
    .line 8
    or-long/2addr p1, v0

    .line 9
    iput-wide p1, p0, Lcom/zykj/study/databinding/LayoutMyCourseSynopsisBindingImpl;->mDirtyFlags:J

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
    iget-wide v2, v1, Lcom/zykj/study/databinding/LayoutMyCourseSynopsisBindingImpl;->mDirtyFlags:J

    .line 5
    .line 6
    const-wide/16 v4, 0x0

    .line 7
    .line 8
    iput-wide v4, v1, Lcom/zykj/study/databinding/LayoutMyCourseSynopsisBindingImpl;->mDirtyFlags:J

    .line 9
    .line 10
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 11
    iget-object v0, v1, Lcom/zykj/study/databinding/LayoutMyCourseSynopsisBinding;->mEntity:Lcom/zykj/study/data/MyCourseEntity;

    .line 12
    .line 13
    iget-object v6, v1, Lcom/zykj/study/databinding/LayoutMyCourseSynopsisBinding;->mUserInfo:Lcom/zykj/lib/login/proto/UserBean;

    .line 14
    .line 15
    iget-object v7, v1, Lcom/zykj/study/databinding/LayoutMyCourseSynopsisBinding;->mDictViewModel:Lcom/zykj/study/viewmodels/DictViewModel;

    .line 16
    .line 17
    const-wide/16 v8, 0x12

    .line 18
    .line 19
    and-long/2addr v8, v2

    .line 20
    cmp-long v8, v8, v4

    .line 21
    .line 22
    const/4 v9, 0x0

    .line 23
    const/4 v10, 0x0

    .line 24
    if-eqz v8, :cond_3

    .line 25
    .line 26
    if-eqz v0, :cond_0

    .line 27
    .line 28
    invoke-virtual {v0}, Lcom/zykj/study/bean/course/CourseBean;->getLearning()I

    .line 29
    .line 30
    .line 31
    move-result v11

    .line 32
    invoke-virtual {v0}, Lcom/zykj/study/bean/course/CourseBean;->getStatus()Lcom/zykj/study/bean/course/CourseType;

    .line 33
    .line 34
    .line 35
    move-result-object v12

    .line 36
    invoke-virtual {v0}, Lcom/zykj/study/bean/course/CourseBean;->isPublic()Z

    .line 37
    .line 38
    .line 39
    move-result v13

    .line 40
    invoke-virtual {v0}, Lcom/zykj/study/bean/course/CourseBean;->getCover()Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object v14

    .line 44
    invoke-virtual {v0}, Lcom/zykj/study/bean/course/CourseBean;->getLikes()I

    .line 45
    .line 46
    .line 47
    move-result v15

    .line 48
    goto :goto_0

    .line 49
    :cond_0
    move-object v12, v9

    .line 50
    move-object v14, v12

    .line 51
    move v11, v10

    .line 52
    move v13, v11

    .line 53
    move v15, v13

    .line 54
    :goto_0
    invoke-static {v11}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    move-result-object v11

    .line 58
    move-wide/from16 v16, v4

    .line 59
    .line 60
    sget-object v4, Lcom/zykj/study/bean/course/CourseType;->UNDERCARRIAGE:Lcom/zykj/study/bean/course/CourseType;

    .line 61
    .line 62
    if-ne v12, v4, :cond_1

    .line 63
    .line 64
    const/4 v4, 0x1

    .line 65
    goto :goto_1

    .line 66
    :cond_1
    move v4, v10

    .line 67
    :goto_1
    sget-object v5, Lcom/zykj/study/bean/course/CourseType;->GROUNDING:Lcom/zykj/study/bean/course/CourseType;

    .line 68
    .line 69
    if-ne v12, v5, :cond_2

    .line 70
    .line 71
    const/4 v10, 0x1

    .line 72
    :cond_2
    xor-int/lit8 v5, v13, 0x1

    .line 73
    .line 74
    invoke-static {v15}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 75
    .line 76
    .line 77
    move-result-object v15

    .line 78
    move/from16 v21, v10

    .line 79
    .line 80
    move v10, v4

    .line 81
    move/from16 v4, v21

    .line 82
    .line 83
    goto :goto_2

    .line 84
    :cond_3
    move-wide/from16 v16, v4

    .line 85
    .line 86
    move-object v11, v9

    .line 87
    move-object v12, v11

    .line 88
    move-object v14, v12

    .line 89
    move-object v15, v14

    .line 90
    move v4, v10

    .line 91
    move v5, v4

    .line 92
    move v13, v5

    .line 93
    :goto_2
    const-wide/16 v18, 0x14

    .line 94
    .line 95
    and-long v18, v2, v18

    .line 96
    .line 97
    cmp-long v18, v18, v16

    .line 98
    .line 99
    if-eqz v18, :cond_5

    .line 100
    .line 101
    if-eqz v6, :cond_4

    .line 102
    .line 103
    invoke-virtual {v6}, Lcom/zykj/lib/login/proto/UserBean;->getRealName()Ljava/lang/String;

    .line 104
    .line 105
    .line 106
    move-result-object v9

    .line 107
    :cond_4
    iget-object v6, v1, Lcom/zykj/study/databinding/LayoutMyCourseSynopsisBinding;->tvTeacherName:Landroid/widget/TextView;

    .line 108
    .line 109
    invoke-virtual {v6}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 110
    .line 111
    .line 112
    move-result-object v6

    .line 113
    move-wide/from16 v19, v2

    .line 114
    .line 115
    sget v2, Lcom/zykj/study/R$string;->author:I

    .line 116
    .line 117
    filled-new-array {v9}, [Ljava/lang/Object;

    .line 118
    .line 119
    .line 120
    move-result-object v3

    .line 121
    invoke-virtual {v6, v2, v3}, Landroid/content/res/Resources;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 122
    .line 123
    .line 124
    move-result-object v9

    .line 125
    goto :goto_3

    .line 126
    :cond_5
    move-wide/from16 v19, v2

    .line 127
    .line 128
    :goto_3
    const-wide/16 v2, 0x18

    .line 129
    .line 130
    and-long v2, v19, v2

    .line 131
    .line 132
    cmp-long v2, v2, v16

    .line 133
    .line 134
    if-eqz v8, :cond_6

    .line 135
    .line 136
    iget-object v3, v1, Lcom/zykj/study/databinding/LayoutMyCourseSynopsisBinding;->btGrounding:Landroid/widget/Button;

    .line 137
    .line 138
    invoke-static {v10}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 139
    .line 140
    .line 141
    move-result-object v6

    .line 142
    invoke-static {v3, v6}, Lcom/zykj/base/ext/BindingAdaptersKt;->visibleOrGone(Landroid/view/View;Ljava/lang/Boolean;)V

    .line 143
    .line 144
    .line 145
    iget-object v3, v1, Lcom/zykj/study/databinding/LayoutMyCourseSynopsisBinding;->btUndercarriage:Landroid/widget/Button;

    .line 146
    .line 147
    invoke-static {v4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 148
    .line 149
    .line 150
    move-result-object v4

    .line 151
    invoke-static {v3, v4}, Lcom/zykj/base/ext/BindingAdaptersKt;->visibleOrGone(Landroid/view/View;Ljava/lang/Boolean;)V

    .line 152
    .line 153
    .line 154
    iget-object v3, v1, Lcom/zykj/study/databinding/LayoutMyCourseSynopsisBinding;->itemCourseTitle:Lcom/zykj/study/databinding/ItemCourseTitleBinding;

    .line 155
    .line 156
    invoke-virtual {v3, v0}, Lcom/zykj/study/databinding/ItemCourseTitleBinding;->setEntity(Lcom/zykj/study/bean/course/CourseBean;)V

    .line 157
    .line 158
    .line 159
    iget-object v0, v1, Lcom/zykj/study/databinding/LayoutMyCourseSynopsisBinding;->ivCover:Landroid/widget/ImageView;

    .line 160
    .line 161
    invoke-static {v0, v14}, Le5/c;->f(Landroid/widget/ImageView;Ljava/lang/String;)V

    .line 162
    .line 163
    .line 164
    iget-object v0, v1, Lcom/zykj/study/databinding/LayoutMyCourseSynopsisBindingImpl;->mboundView5:Landroid/widget/TextView;

    .line 165
    .line 166
    invoke-static {v0, v15}, Landroidx/databinding/adapters/TextViewBindingAdapter;->setText(Landroid/widget/TextView;Ljava/lang/CharSequence;)V

    .line 167
    .line 168
    .line 169
    iget-object v0, v1, Lcom/zykj/study/databinding/LayoutMyCourseSynopsisBindingImpl;->mboundView6:Landroid/widget/TextView;

    .line 170
    .line 171
    invoke-static {v0, v12}, Le5/c;->m(Landroid/widget/TextView;Lcom/zykj/study/bean/course/CourseType;)V

    .line 172
    .line 173
    .line 174
    iget-object v0, v1, Lcom/zykj/study/databinding/LayoutMyCourseSynopsisBindingImpl;->mboundView7:Landroid/widget/ImageView;

    .line 175
    .line 176
    invoke-static {v13}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 177
    .line 178
    .line 179
    move-result-object v3

    .line 180
    invoke-static {v0, v3}, Lcom/zykj/base/ext/BindingAdaptersKt;->visibleOrGone(Landroid/view/View;Ljava/lang/Boolean;)V

    .line 181
    .line 182
    .line 183
    iget-object v0, v1, Lcom/zykj/study/databinding/LayoutMyCourseSynopsisBindingImpl;->mboundView8:Landroid/widget/ImageView;

    .line 184
    .line 185
    invoke-static {v5}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 186
    .line 187
    .line 188
    move-result-object v3

    .line 189
    invoke-static {v0, v3}, Lcom/zykj/base/ext/BindingAdaptersKt;->visibleOrGone(Landroid/view/View;Ljava/lang/Boolean;)V

    .line 190
    .line 191
    .line 192
    iget-object v0, v1, Lcom/zykj/study/databinding/LayoutMyCourseSynopsisBindingImpl;->mboundView9:Landroid/widget/TextView;

    .line 193
    .line 194
    invoke-static {v0, v13}, Le5/c;->k(Landroid/widget/TextView;Z)V

    .line 195
    .line 196
    .line 197
    iget-object v0, v1, Lcom/zykj/study/databinding/LayoutMyCourseSynopsisBinding;->textView4:Landroid/widget/TextView;

    .line 198
    .line 199
    invoke-static {v0, v11}, Landroidx/databinding/adapters/TextViewBindingAdapter;->setText(Landroid/widget/TextView;Ljava/lang/CharSequence;)V

    .line 200
    .line 201
    .line 202
    :cond_6
    if-eqz v2, :cond_7

    .line 203
    .line 204
    iget-object v0, v1, Lcom/zykj/study/databinding/LayoutMyCourseSynopsisBinding;->itemCourseTitle:Lcom/zykj/study/databinding/ItemCourseTitleBinding;

    .line 205
    .line 206
    invoke-virtual {v0, v7}, Lcom/zykj/study/databinding/ItemCourseTitleBinding;->setDictViewModel(Lcom/zykj/study/viewmodels/DictViewModel;)V

    .line 207
    .line 208
    .line 209
    :cond_7
    if-eqz v18, :cond_8

    .line 210
    .line 211
    iget-object v0, v1, Lcom/zykj/study/databinding/LayoutMyCourseSynopsisBinding;->tvTeacherName:Landroid/widget/TextView;

    .line 212
    .line 213
    invoke-static {v0, v9}, Landroidx/databinding/adapters/TextViewBindingAdapter;->setText(Landroid/widget/TextView;Ljava/lang/CharSequence;)V

    .line 214
    .line 215
    .line 216
    :cond_8
    iget-object v0, v1, Lcom/zykj/study/databinding/LayoutMyCourseSynopsisBinding;->itemCourseTitle:Lcom/zykj/study/databinding/ItemCourseTitleBinding;

    .line 217
    .line 218
    invoke-static {v0}, Landroidx/databinding/ViewDataBinding;->executeBindingsOn(Landroidx/databinding/ViewDataBinding;)V

    .line 219
    .line 220
    .line 221
    return-void

    .line 222
    :catchall_0
    move-exception v0

    .line 223
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 224
    throw v0
.end method

.method public hasPendingBindings()Z
    .locals 4

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-wide v0, p0, Lcom/zykj/study/databinding/LayoutMyCourseSynopsisBindingImpl;->mDirtyFlags:J

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
    iget-object v0, p0, Lcom/zykj/study/databinding/LayoutMyCourseSynopsisBinding;->itemCourseTitle:Lcom/zykj/study/databinding/ItemCourseTitleBinding;

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
    const-wide/16 v0, 0x10

    .line 3
    .line 4
    :try_start_0
    iput-wide v0, p0, Lcom/zykj/study/databinding/LayoutMyCourseSynopsisBindingImpl;->mDirtyFlags:J

    .line 5
    .line 6
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 7
    iget-object v0, p0, Lcom/zykj/study/databinding/LayoutMyCourseSynopsisBinding;->itemCourseTitle:Lcom/zykj/study/databinding/ItemCourseTitleBinding;

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
    .locals 0

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    const/4 p1, 0x0

    .line 4
    return p1

    .line 5
    :cond_0
    check-cast p2, Lcom/zykj/study/databinding/ItemCourseTitleBinding;

    .line 6
    .line 7
    invoke-direct {p0, p2, p3}, Lcom/zykj/study/databinding/LayoutMyCourseSynopsisBindingImpl;->onChangeItemCourseTitle(Lcom/zykj/study/databinding/ItemCourseTitleBinding;I)Z

    .line 8
    .line 9
    .line 10
    move-result p1

    .line 11
    return p1
.end method

.method public setDictViewModel(Lcom/zykj/study/viewmodels/DictViewModel;)V
    .locals 4
    .param p1    # Lcom/zykj/study/viewmodels/DictViewModel;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param

    .line 1
    iput-object p1, p0, Lcom/zykj/study/databinding/LayoutMyCourseSynopsisBinding;->mDictViewModel:Lcom/zykj/study/viewmodels/DictViewModel;

    .line 2
    .line 3
    monitor-enter p0

    .line 4
    :try_start_0
    iget-wide v0, p0, Lcom/zykj/study/databinding/LayoutMyCourseSynopsisBindingImpl;->mDirtyFlags:J

    .line 5
    .line 6
    const-wide/16 v2, 0x8

    .line 7
    .line 8
    or-long/2addr v0, v2

    .line 9
    iput-wide v0, p0, Lcom/zykj/study/databinding/LayoutMyCourseSynopsisBindingImpl;->mDirtyFlags:J

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
    iput-object p1, p0, Lcom/zykj/study/databinding/LayoutMyCourseSynopsisBinding;->mEntity:Lcom/zykj/study/data/MyCourseEntity;

    .line 2
    .line 3
    monitor-enter p0

    .line 4
    :try_start_0
    iget-wide v0, p0, Lcom/zykj/study/databinding/LayoutMyCourseSynopsisBindingImpl;->mDirtyFlags:J

    .line 5
    .line 6
    const-wide/16 v2, 0x2

    .line 7
    .line 8
    or-long/2addr v0, v2

    .line 9
    iput-wide v0, p0, Lcom/zykj/study/databinding/LayoutMyCourseSynopsisBindingImpl;->mDirtyFlags:J

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
    iget-object v0, p0, Lcom/zykj/study/databinding/LayoutMyCourseSynopsisBinding;->itemCourseTitle:Lcom/zykj/study/databinding/ItemCourseTitleBinding;

    .line 5
    .line 6
    invoke-virtual {v0, p1}, Landroidx/databinding/ViewDataBinding;->setLifecycleOwner(Landroidx/lifecycle/LifecycleOwner;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public setUserInfo(Lcom/zykj/lib/login/proto/UserBean;)V
    .locals 4
    .param p1    # Lcom/zykj/lib/login/proto/UserBean;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param

    .line 1
    iput-object p1, p0, Lcom/zykj/study/databinding/LayoutMyCourseSynopsisBinding;->mUserInfo:Lcom/zykj/lib/login/proto/UserBean;

    .line 2
    .line 3
    monitor-enter p0

    .line 4
    :try_start_0
    iget-wide v0, p0, Lcom/zykj/study/databinding/LayoutMyCourseSynopsisBindingImpl;->mDirtyFlags:J

    .line 5
    .line 6
    const-wide/16 v2, 0x4

    .line 7
    .line 8
    or-long/2addr v0, v2

    .line 9
    iput-wide v0, p0, Lcom/zykj/study/databinding/LayoutMyCourseSynopsisBindingImpl;->mDirtyFlags:J

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
    invoke-virtual {p0, p2}, Lcom/zykj/study/databinding/LayoutMyCourseSynopsisBindingImpl;->setEntity(Lcom/zykj/study/data/MyCourseEntity;)V

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
    invoke-virtual {p0, p2}, Lcom/zykj/study/databinding/LayoutMyCourseSynopsisBindingImpl;->setUserInfo(Lcom/zykj/lib/login/proto/UserBean;)V

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
    invoke-virtual {p0, p2}, Lcom/zykj/study/databinding/LayoutMyCourseSynopsisBindingImpl;->setDictViewModel(Lcom/zykj/study/viewmodels/DictViewModel;)V

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
