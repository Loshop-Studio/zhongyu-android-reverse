.class public Lcom/zykj/study/databinding/ItemStudyBindingImpl;
.super Lcom/zykj/study/databinding/ItemStudyBinding;
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

.field private final mboundView0:Landroid/widget/RelativeLayout;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field private final mboundView2:Landroid/widget/RelativeLayout;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field private final mboundView5:Landroid/widget/RelativeLayout;
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
    const/16 v1, 0x9

    .line 4
    .line 5
    invoke-direct {v0, v1}, Landroidx/databinding/ViewDataBinding$IncludedLayouts;-><init>(I)V

    .line 6
    .line 7
    .line 8
    sput-object v0, Lcom/zykj/study/databinding/ItemStudyBindingImpl;->sIncludes:Landroidx/databinding/ViewDataBinding$IncludedLayouts;

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
    const/4 v2, 0x7

    .line 17
    filled-new-array {v2}, [I

    .line 18
    .line 19
    .line 20
    move-result-object v2

    .line 21
    sget v3, Lcom/zykj/study/R$layout;->item_course_title:I

    .line 22
    .line 23
    filled-new-array {v3}, [I

    .line 24
    .line 25
    .line 26
    move-result-object v3

    .line 27
    const/4 v4, 0x2

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
    sput-object v0, Lcom/zykj/study/databinding/ItemStudyBindingImpl;->sViewsWithIds:Landroid/util/SparseIntArray;

    .line 37
    .line 38
    sget v1, Lcom/zykj/study/R$id;->container:I

    .line 39
    .line 40
    const/16 v2, 0x8

    .line 41
    .line 42
    invoke-virtual {v0, v1, v2}, Landroid/util/SparseIntArray;->put(II)V

    .line 43
    .line 44
    .line 45
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
    sget-object v0, Lcom/zykj/study/databinding/ItemStudyBindingImpl;->sIncludes:Landroidx/databinding/ViewDataBinding$IncludedLayouts;

    sget-object v1, Lcom/zykj/study/databinding/ItemStudyBindingImpl;->sViewsWithIds:Landroid/util/SparseIntArray;

    const/16 v2, 0x9

    invoke-static {p1, p2, v2, v0, v1}, Landroidx/databinding/ViewDataBinding;->mapBindings(Landroidx/databinding/DataBindingComponent;Landroid/view/View;ILandroidx/databinding/ViewDataBinding$IncludedLayouts;Landroid/util/SparseIntArray;)[Ljava/lang/Object;

    move-result-object v0

    invoke-direct {p0, p1, p2, v0}, Lcom/zykj/study/databinding/ItemStudyBindingImpl;-><init>(Landroidx/databinding/DataBindingComponent;Landroid/view/View;[Ljava/lang/Object;)V

    return-void
.end method

.method private constructor <init>(Landroidx/databinding/DataBindingComponent;Landroid/view/View;[Ljava/lang/Object;)V
    .locals 11

    const/16 v0, 0x8

    .line 2
    aget-object v0, p3, v0

    move-object v5, v0

    check-cast v5, Landroidx/constraintlayout/widget/ConstraintLayout;

    const/4 v0, 0x1

    aget-object v0, p3, v0

    move-object v6, v0

    check-cast v6, Landroid/widget/ImageView;

    const/4 v0, 0x7

    aget-object v0, p3, v0

    move-object v7, v0

    check-cast v7, Lcom/zykj/study/databinding/ItemCourseTitleBinding;

    const/4 v0, 0x6

    aget-object v0, p3, v0

    move-object v8, v0

    check-cast v8, Landroid/widget/TextView;

    const/4 v0, 0x4

    aget-object v0, p3, v0

    move-object v9, v0

    check-cast v9, Landroid/widget/TextView;

    const/4 v0, 0x3

    aget-object v0, p3, v0

    move-object v10, v0

    check-cast v10, Landroid/widget/TextView;

    const/4 v4, 0x1

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    invoke-direct/range {v1 .. v10}, Lcom/zykj/study/databinding/ItemStudyBinding;-><init>(Ljava/lang/Object;Landroid/view/View;ILandroidx/constraintlayout/widget/ConstraintLayout;Landroid/widget/ImageView;Lcom/zykj/study/databinding/ItemCourseTitleBinding;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;)V

    const-wide/16 p1, -0x1

    .line 3
    iput-wide p1, v1, Lcom/zykj/study/databinding/ItemStudyBindingImpl;->mDirtyFlags:J

    .line 4
    iget-object p1, v1, Lcom/zykj/study/databinding/ItemStudyBinding;->imageView2:Landroid/widget/ImageView;

    const/4 p2, 0x0

    invoke-virtual {p1, p2}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 5
    iget-object p1, v1, Lcom/zykj/study/databinding/ItemStudyBinding;->itemCourseTitle:Lcom/zykj/study/databinding/ItemCourseTitleBinding;

    invoke-virtual {p0, p1}, Landroidx/databinding/ViewDataBinding;->setContainedBinding(Landroidx/databinding/ViewDataBinding;)V

    const/4 p1, 0x0

    .line 6
    aget-object p1, p3, p1

    check-cast p1, Landroid/widget/RelativeLayout;

    iput-object p1, v1, Lcom/zykj/study/databinding/ItemStudyBindingImpl;->mboundView0:Landroid/widget/RelativeLayout;

    .line 7
    invoke-virtual {p1, p2}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    const/4 p1, 0x2

    .line 8
    aget-object p1, p3, p1

    check-cast p1, Landroid/widget/RelativeLayout;

    iput-object p1, v1, Lcom/zykj/study/databinding/ItemStudyBindingImpl;->mboundView2:Landroid/widget/RelativeLayout;

    .line 9
    invoke-virtual {p1, p2}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    const/4 p1, 0x5

    .line 10
    aget-object p1, p3, p1

    check-cast p1, Landroid/widget/RelativeLayout;

    iput-object p1, v1, Lcom/zykj/study/databinding/ItemStudyBindingImpl;->mboundView5:Landroid/widget/RelativeLayout;

    .line 11
    invoke-virtual {p1, p2}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 12
    iget-object p1, v1, Lcom/zykj/study/databinding/ItemStudyBinding;->textView26:Landroid/widget/TextView;

    invoke-virtual {p1, p2}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 13
    iget-object p1, v1, Lcom/zykj/study/databinding/ItemStudyBinding;->tvProgress:Landroid/widget/TextView;

    invoke-virtual {p1, p2}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 14
    iget-object p1, v1, Lcom/zykj/study/databinding/ItemStudyBinding;->tvTeacherName:Landroid/widget/TextView;

    invoke-virtual {p1, p2}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 15
    invoke-virtual {p0, v3}, Landroidx/databinding/ViewDataBinding;->setRootTag(Landroid/view/View;)V

    .line 16
    invoke-virtual {p0}, Lcom/zykj/study/databinding/ItemStudyBindingImpl;->invalidateAll()V

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
    iget-wide p1, p0, Lcom/zykj/study/databinding/ItemStudyBindingImpl;->mDirtyFlags:J

    .line 5
    .line 6
    const-wide/16 v0, 0x1

    .line 7
    .line 8
    or-long/2addr p1, v0

    .line 9
    iput-wide p1, p0, Lcom/zykj/study/databinding/ItemStudyBindingImpl;->mDirtyFlags:J

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
    .locals 25

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    monitor-enter p0

    .line 4
    :try_start_0
    iget-wide v2, v1, Lcom/zykj/study/databinding/ItemStudyBindingImpl;->mDirtyFlags:J

    .line 5
    .line 6
    const-wide/16 v4, 0x0

    .line 7
    .line 8
    iput-wide v4, v1, Lcom/zykj/study/databinding/ItemStudyBindingImpl;->mDirtyFlags:J

    .line 9
    .line 10
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 11
    iget-boolean v0, v1, Lcom/zykj/study/databinding/ItemStudyBinding;->mIsSelected:Z

    .line 12
    .line 13
    iget-object v6, v1, Lcom/zykj/study/databinding/ItemStudyBinding;->mEntity:Lcom/zykj/study/data/CourseStudyEntity;

    .line 14
    .line 15
    iget-object v7, v1, Lcom/zykj/study/databinding/ItemStudyBinding;->mDictViewModel:Lcom/zykj/study/viewmodels/DictViewModel;

    .line 16
    .line 17
    iget-object v8, v1, Lcom/zykj/study/databinding/ItemStudyBinding;->mClickListener:Landroid/view/View$OnClickListener;

    .line 18
    .line 19
    const-wide/16 v9, 0x22

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
    if-eqz v11, :cond_3

    .line 27
    .line 28
    if-eqz v11, :cond_1

    .line 29
    .line 30
    if-eqz v0, :cond_0

    .line 31
    .line 32
    const-wide/16 v13, 0x200

    .line 33
    .line 34
    :goto_0
    or-long/2addr v2, v13

    .line 35
    goto :goto_1

    .line 36
    :cond_0
    const-wide/16 v13, 0x100

    .line 37
    .line 38
    goto :goto_0

    .line 39
    :cond_1
    :goto_1
    if-eqz v0, :cond_2

    .line 40
    .line 41
    iget-object v0, v1, Lcom/zykj/study/databinding/ItemStudyBindingImpl;->mboundView0:Landroid/widget/RelativeLayout;

    .line 42
    .line 43
    sget v11, Lcom/zykj/study/R$color;->bg_card:I

    .line 44
    .line 45
    :goto_2
    invoke-static {v0, v11}, Landroidx/databinding/ViewDataBinding;->getColorFromResource(Landroid/view/View;I)I

    .line 46
    .line 47
    .line 48
    move-result v0

    .line 49
    goto :goto_3

    .line 50
    :cond_2
    iget-object v0, v1, Lcom/zykj/study/databinding/ItemStudyBindingImpl;->mboundView0:Landroid/widget/RelativeLayout;

    .line 51
    .line 52
    sget v11, Lcom/zykj/study/R$color;->white:I

    .line 53
    .line 54
    goto :goto_2

    .line 55
    :cond_3
    move v0, v12

    .line 56
    :goto_3
    const-wide/16 v13, 0x24

    .line 57
    .line 58
    and-long v15, v2, v13

    .line 59
    .line 60
    cmp-long v11, v15, v4

    .line 61
    .line 62
    const/4 v15, 0x0

    .line 63
    if-eqz v11, :cond_a

    .line 64
    .line 65
    if-eqz v6, :cond_4

    .line 66
    .line 67
    invoke-virtual {v6}, Lcom/zykj/study/data/CourseStudyEntity;->getUserName()Ljava/lang/String;

    .line 68
    .line 69
    .line 70
    move-result-object v15

    .line 71
    invoke-virtual {v6}, Lcom/zykj/study/bean/course/CourseBean;->getStatus()Lcom/zykj/study/bean/course/CourseType;

    .line 72
    .line 73
    .line 74
    move-result-object v16

    .line 75
    invoke-virtual {v6}, Lcom/zykj/study/data/CourseStudyEntity;->getProgress()I

    .line 76
    .line 77
    .line 78
    move-result v17

    .line 79
    invoke-virtual {v6}, Lcom/zykj/study/bean/course/CourseBean;->getCover()Ljava/lang/String;

    .line 80
    .line 81
    .line 82
    move-result-object v18

    .line 83
    move-wide/from16 v23, v4

    .line 84
    .line 85
    move-object/from16 v4, v16

    .line 86
    .line 87
    move/from16 v5, v17

    .line 88
    .line 89
    move-wide/from16 v16, v23

    .line 90
    .line 91
    :goto_4
    move-wide/from16 v19, v9

    .line 92
    .line 93
    goto :goto_5

    .line 94
    :cond_4
    move-wide/from16 v16, v4

    .line 95
    .line 96
    move v5, v12

    .line 97
    move-object v4, v15

    .line 98
    move-object/from16 v18, v4

    .line 99
    .line 100
    goto :goto_4

    .line 101
    :goto_5
    iget-object v9, v1, Lcom/zykj/study/databinding/ItemStudyBinding;->tvTeacherName:Landroid/widget/TextView;

    .line 102
    .line 103
    invoke-virtual {v9}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 104
    .line 105
    .line 106
    move-result-object v9

    .line 107
    sget v10, Lcom/zykj/study/R$string;->author:I

    .line 108
    .line 109
    filled-new-array {v15}, [Ljava/lang/Object;

    .line 110
    .line 111
    .line 112
    move-result-object v15

    .line 113
    invoke-virtual {v9, v10, v15}, Landroid/content/res/Resources;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 114
    .line 115
    .line 116
    move-result-object v15

    .line 117
    sget-object v9, Lcom/zykj/study/bean/course/CourseType;->DELETE:Lcom/zykj/study/bean/course/CourseType;

    .line 118
    .line 119
    if-ne v4, v9, :cond_5

    .line 120
    .line 121
    const/4 v9, 0x1

    .line 122
    goto :goto_6

    .line 123
    :cond_5
    move v9, v12

    .line 124
    :goto_6
    sget-object v10, Lcom/zykj/study/bean/course/CourseType;->GROUNDING:Lcom/zykj/study/bean/course/CourseType;

    .line 125
    .line 126
    if-eq v4, v10, :cond_6

    .line 127
    .line 128
    const/4 v12, 0x1

    .line 129
    :cond_6
    iget-object v10, v1, Lcom/zykj/study/databinding/ItemStudyBinding;->tvProgress:Landroid/widget/TextView;

    .line 130
    .line 131
    invoke-virtual {v10}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 132
    .line 133
    .line 134
    move-result-object v10

    .line 135
    move-wide/from16 v21, v13

    .line 136
    .line 137
    sget v13, Lcom/zykj/study/R$string;->complete_progress:I

    .line 138
    .line 139
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 140
    .line 141
    .line 142
    move-result-object v5

    .line 143
    filled-new-array {v5}, [Ljava/lang/Object;

    .line 144
    .line 145
    .line 146
    move-result-object v5

    .line 147
    invoke-virtual {v10, v13, v5}, Landroid/content/res/Resources;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 148
    .line 149
    .line 150
    move-result-object v5

    .line 151
    if-eqz v11, :cond_8

    .line 152
    .line 153
    if-eqz v9, :cond_7

    .line 154
    .line 155
    const-wide/16 v10, 0x80

    .line 156
    .line 157
    :goto_7
    or-long/2addr v2, v10

    .line 158
    goto :goto_8

    .line 159
    :cond_7
    const-wide/16 v10, 0x40

    .line 160
    .line 161
    goto :goto_7

    .line 162
    :cond_8
    :goto_8
    if-eqz v9, :cond_9

    .line 163
    .line 164
    iget-object v9, v1, Lcom/zykj/study/databinding/ItemStudyBindingImpl;->mboundView5:Landroid/widget/RelativeLayout;

    .line 165
    .line 166
    sget v10, Lcom/zykj/study/R$color;->warn:I

    .line 167
    .line 168
    :goto_9
    invoke-static {v9, v10}, Landroidx/databinding/ViewDataBinding;->getColorFromResource(Landroid/view/View;I)I

    .line 169
    .line 170
    .line 171
    move-result v9

    .line 172
    goto :goto_a

    .line 173
    :cond_9
    iget-object v9, v1, Lcom/zykj/study/databinding/ItemStudyBindingImpl;->mboundView5:Landroid/widget/RelativeLayout;

    .line 174
    .line 175
    sget v10, Lcom/zykj/study/R$color;->icon:I

    .line 176
    .line 177
    goto :goto_9

    .line 178
    :goto_a
    move-object v10, v15

    .line 179
    move-object/from16 v15, v18

    .line 180
    .line 181
    goto :goto_b

    .line 182
    :cond_a
    move-wide/from16 v16, v4

    .line 183
    .line 184
    move-wide/from16 v19, v9

    .line 185
    .line 186
    move-wide/from16 v21, v13

    .line 187
    .line 188
    move v9, v12

    .line 189
    move-object v4, v15

    .line 190
    move-object v5, v4

    .line 191
    move-object v10, v5

    .line 192
    :goto_b
    const-wide/16 v13, 0x28

    .line 193
    .line 194
    and-long/2addr v13, v2

    .line 195
    cmp-long v11, v13, v16

    .line 196
    .line 197
    const-wide/16 v13, 0x30

    .line 198
    .line 199
    and-long/2addr v13, v2

    .line 200
    cmp-long v13, v13, v16

    .line 201
    .line 202
    and-long v21, v2, v21

    .line 203
    .line 204
    cmp-long v14, v21, v16

    .line 205
    .line 206
    if-eqz v14, :cond_b

    .line 207
    .line 208
    iget-object v14, v1, Lcom/zykj/study/databinding/ItemStudyBinding;->imageView2:Landroid/widget/ImageView;

    .line 209
    .line 210
    invoke-static {v14, v15}, Lcom/zykj/base/ext/BindingAdaptersKt;->netUrl(Landroid/widget/ImageView;Ljava/lang/String;)V

    .line 211
    .line 212
    .line 213
    iget-object v14, v1, Lcom/zykj/study/databinding/ItemStudyBinding;->itemCourseTitle:Lcom/zykj/study/databinding/ItemCourseTitleBinding;

    .line 214
    .line 215
    invoke-virtual {v14, v6}, Lcom/zykj/study/databinding/ItemCourseTitleBinding;->setEntity(Lcom/zykj/study/bean/course/CourseBean;)V

    .line 216
    .line 217
    .line 218
    iget-object v6, v1, Lcom/zykj/study/databinding/ItemStudyBindingImpl;->mboundView5:Landroid/widget/RelativeLayout;

    .line 219
    .line 220
    invoke-static {v12}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 221
    .line 222
    .line 223
    move-result-object v12

    .line 224
    invoke-static {v6, v12}, Lcom/zykj/base/ext/BindingAdaptersKt;->visibleOrGone(Landroid/view/View;Ljava/lang/Boolean;)V

    .line 225
    .line 226
    .line 227
    iget-object v6, v1, Lcom/zykj/study/databinding/ItemStudyBinding;->textView26:Landroid/widget/TextView;

    .line 228
    .line 229
    invoke-static {v6, v4}, Le5/c;->l(Landroid/widget/TextView;Lcom/zykj/study/bean/course/CourseType;)V

    .line 230
    .line 231
    .line 232
    iget-object v4, v1, Lcom/zykj/study/databinding/ItemStudyBinding;->tvProgress:Landroid/widget/TextView;

    .line 233
    .line 234
    invoke-static {v4, v5}, Landroidx/databinding/adapters/TextViewBindingAdapter;->setText(Landroid/widget/TextView;Ljava/lang/CharSequence;)V

    .line 235
    .line 236
    .line 237
    iget-object v4, v1, Lcom/zykj/study/databinding/ItemStudyBinding;->tvTeacherName:Landroid/widget/TextView;

    .line 238
    .line 239
    invoke-static {v4, v10}, Landroidx/databinding/adapters/TextViewBindingAdapter;->setText(Landroid/widget/TextView;Ljava/lang/CharSequence;)V

    .line 240
    .line 241
    .line 242
    invoke-static {}, Landroidx/databinding/ViewDataBinding;->getBuildSdkInt()I

    .line 243
    .line 244
    .line 245
    move-result v4

    .line 246
    const/16 v5, 0x15

    .line 247
    .line 248
    if-lt v4, v5, :cond_b

    .line 249
    .line 250
    iget-object v4, v1, Lcom/zykj/study/databinding/ItemStudyBindingImpl;->mboundView5:Landroid/widget/RelativeLayout;

    .line 251
    .line 252
    invoke-static {v9}, Landroidx/databinding/adapters/Converters;->convertColorToColorStateList(I)Landroid/content/res/ColorStateList;

    .line 253
    .line 254
    .line 255
    move-result-object v5

    .line 256
    invoke-virtual {v4, v5}, Landroid/view/View;->setBackgroundTintList(Landroid/content/res/ColorStateList;)V

    .line 257
    .line 258
    .line 259
    :cond_b
    if-eqz v11, :cond_c

    .line 260
    .line 261
    iget-object v4, v1, Lcom/zykj/study/databinding/ItemStudyBinding;->itemCourseTitle:Lcom/zykj/study/databinding/ItemCourseTitleBinding;

    .line 262
    .line 263
    invoke-virtual {v4, v7}, Lcom/zykj/study/databinding/ItemCourseTitleBinding;->setDictViewModel(Lcom/zykj/study/viewmodels/DictViewModel;)V

    .line 264
    .line 265
    .line 266
    :cond_c
    if-eqz v13, :cond_d

    .line 267
    .line 268
    iget-object v4, v1, Lcom/zykj/study/databinding/ItemStudyBindingImpl;->mboundView0:Landroid/widget/RelativeLayout;

    .line 269
    .line 270
    invoke-virtual {v4, v8}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 271
    .line 272
    .line 273
    :cond_d
    and-long v4, v2, v19

    .line 274
    .line 275
    cmp-long v4, v4, v16

    .line 276
    .line 277
    if-eqz v4, :cond_e

    .line 278
    .line 279
    iget-object v4, v1, Lcom/zykj/study/databinding/ItemStudyBindingImpl;->mboundView0:Landroid/widget/RelativeLayout;

    .line 280
    .line 281
    invoke-static {v0}, Landroidx/databinding/adapters/Converters;->convertColorToDrawable(I)Landroid/graphics/drawable/ColorDrawable;

    .line 282
    .line 283
    .line 284
    move-result-object v0

    .line 285
    invoke-static {v4, v0}, Landroidx/databinding/adapters/ViewBindingAdapter;->setBackground(Landroid/view/View;Landroid/graphics/drawable/Drawable;)V

    .line 286
    .line 287
    .line 288
    :cond_e
    const-wide/16 v4, 0x20

    .line 289
    .line 290
    and-long/2addr v2, v4

    .line 291
    cmp-long v0, v2, v16

    .line 292
    .line 293
    if-eqz v0, :cond_f

    .line 294
    .line 295
    invoke-static {}, Landroidx/databinding/ViewDataBinding;->getBuildSdkInt()I

    .line 296
    .line 297
    .line 298
    move-result v0

    .line 299
    const/16 v2, 0xb

    .line 300
    .line 301
    if-lt v0, v2, :cond_f

    .line 302
    .line 303
    iget-object v0, v1, Lcom/zykj/study/databinding/ItemStudyBindingImpl;->mboundView5:Landroid/widget/RelativeLayout;

    .line 304
    .line 305
    invoke-virtual {v0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 306
    .line 307
    .line 308
    move-result-object v2

    .line 309
    sget v3, Lcom/zykj/image/R$dimen;->view_15:I

    .line 310
    .line 311
    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getDimension(I)F

    .line 312
    .line 313
    .line 314
    move-result v2

    .line 315
    neg-float v2, v2

    .line 316
    invoke-virtual {v0, v2}, Landroid/view/View;->setTranslationY(F)V

    .line 317
    .line 318
    .line 319
    :cond_f
    iget-object v0, v1, Lcom/zykj/study/databinding/ItemStudyBinding;->itemCourseTitle:Lcom/zykj/study/databinding/ItemCourseTitleBinding;

    .line 320
    .line 321
    invoke-static {v0}, Landroidx/databinding/ViewDataBinding;->executeBindingsOn(Landroidx/databinding/ViewDataBinding;)V

    .line 322
    .line 323
    .line 324
    return-void

    .line 325
    :catchall_0
    move-exception v0

    .line 326
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 327
    throw v0
.end method

.method public hasPendingBindings()Z
    .locals 4

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-wide v0, p0, Lcom/zykj/study/databinding/ItemStudyBindingImpl;->mDirtyFlags:J

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
    iget-object v0, p0, Lcom/zykj/study/databinding/ItemStudyBinding;->itemCourseTitle:Lcom/zykj/study/databinding/ItemCourseTitleBinding;

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
    const-wide/16 v0, 0x20

    .line 3
    .line 4
    :try_start_0
    iput-wide v0, p0, Lcom/zykj/study/databinding/ItemStudyBindingImpl;->mDirtyFlags:J

    .line 5
    .line 6
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 7
    iget-object v0, p0, Lcom/zykj/study/databinding/ItemStudyBinding;->itemCourseTitle:Lcom/zykj/study/databinding/ItemCourseTitleBinding;

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
    invoke-direct {p0, p2, p3}, Lcom/zykj/study/databinding/ItemStudyBindingImpl;->onChangeItemCourseTitle(Lcom/zykj/study/databinding/ItemCourseTitleBinding;I)Z

    .line 8
    .line 9
    .line 10
    move-result p1

    .line 11
    return p1
.end method

.method public setClickListener(Landroid/view/View$OnClickListener;)V
    .locals 4
    .param p1    # Landroid/view/View$OnClickListener;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param

    .line 1
    iput-object p1, p0, Lcom/zykj/study/databinding/ItemStudyBinding;->mClickListener:Landroid/view/View$OnClickListener;

    .line 2
    .line 3
    monitor-enter p0

    .line 4
    :try_start_0
    iget-wide v0, p0, Lcom/zykj/study/databinding/ItemStudyBindingImpl;->mDirtyFlags:J

    .line 5
    .line 6
    const-wide/16 v2, 0x10

    .line 7
    .line 8
    or-long/2addr v0, v2

    .line 9
    iput-wide v0, p0, Lcom/zykj/study/databinding/ItemStudyBindingImpl;->mDirtyFlags:J

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
    iput-object p1, p0, Lcom/zykj/study/databinding/ItemStudyBinding;->mDictViewModel:Lcom/zykj/study/viewmodels/DictViewModel;

    .line 2
    .line 3
    monitor-enter p0

    .line 4
    :try_start_0
    iget-wide v0, p0, Lcom/zykj/study/databinding/ItemStudyBindingImpl;->mDirtyFlags:J

    .line 5
    .line 6
    const-wide/16 v2, 0x8

    .line 7
    .line 8
    or-long/2addr v0, v2

    .line 9
    iput-wide v0, p0, Lcom/zykj/study/databinding/ItemStudyBindingImpl;->mDirtyFlags:J

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

.method public setEntity(Lcom/zykj/study/data/CourseStudyEntity;)V
    .locals 4
    .param p1    # Lcom/zykj/study/data/CourseStudyEntity;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param

    .line 1
    iput-object p1, p0, Lcom/zykj/study/databinding/ItemStudyBinding;->mEntity:Lcom/zykj/study/data/CourseStudyEntity;

    .line 2
    .line 3
    monitor-enter p0

    .line 4
    :try_start_0
    iget-wide v0, p0, Lcom/zykj/study/databinding/ItemStudyBindingImpl;->mDirtyFlags:J

    .line 5
    .line 6
    const-wide/16 v2, 0x4

    .line 7
    .line 8
    or-long/2addr v0, v2

    .line 9
    iput-wide v0, p0, Lcom/zykj/study/databinding/ItemStudyBindingImpl;->mDirtyFlags:J

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
    iput-boolean p1, p0, Lcom/zykj/study/databinding/ItemStudyBinding;->mIsSelected:Z

    .line 2
    .line 3
    monitor-enter p0

    .line 4
    :try_start_0
    iget-wide v0, p0, Lcom/zykj/study/databinding/ItemStudyBindingImpl;->mDirtyFlags:J

    .line 5
    .line 6
    const-wide/16 v2, 0x2

    .line 7
    .line 8
    or-long/2addr v0, v2

    .line 9
    iput-wide v0, p0, Lcom/zykj/study/databinding/ItemStudyBindingImpl;->mDirtyFlags:J

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
    iget-object v0, p0, Lcom/zykj/study/databinding/ItemStudyBinding;->itemCourseTitle:Lcom/zykj/study/databinding/ItemCourseTitleBinding;

    .line 5
    .line 6
    invoke-virtual {v0, p1}, Landroidx/databinding/ViewDataBinding;->setLifecycleOwner(Landroidx/lifecycle/LifecycleOwner;)V

    .line 7
    .line 8
    .line 9
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
    invoke-virtual {p0, p1}, Lcom/zykj/study/databinding/ItemStudyBindingImpl;->setIsSelected(Z)V

    .line 13
    .line 14
    .line 15
    return v1

    .line 16
    :cond_0
    const/16 v0, 0xf

    .line 17
    .line 18
    if-ne v0, p1, :cond_1

    .line 19
    .line 20
    check-cast p2, Lcom/zykj/study/data/CourseStudyEntity;

    .line 21
    .line 22
    invoke-virtual {p0, p2}, Lcom/zykj/study/databinding/ItemStudyBindingImpl;->setEntity(Lcom/zykj/study/data/CourseStudyEntity;)V

    .line 23
    .line 24
    .line 25
    return v1

    .line 26
    :cond_1
    const/16 v0, 0xb

    .line 27
    .line 28
    if-ne v0, p1, :cond_2

    .line 29
    .line 30
    check-cast p2, Lcom/zykj/study/viewmodels/DictViewModel;

    .line 31
    .line 32
    invoke-virtual {p0, p2}, Lcom/zykj/study/databinding/ItemStudyBindingImpl;->setDictViewModel(Lcom/zykj/study/viewmodels/DictViewModel;)V

    .line 33
    .line 34
    .line 35
    return v1

    .line 36
    :cond_2
    const/4 v0, 0x5

    .line 37
    if-ne v0, p1, :cond_3

    .line 38
    .line 39
    check-cast p2, Landroid/view/View$OnClickListener;

    .line 40
    .line 41
    invoke-virtual {p0, p2}, Lcom/zykj/study/databinding/ItemStudyBindingImpl;->setClickListener(Landroid/view/View$OnClickListener;)V

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
