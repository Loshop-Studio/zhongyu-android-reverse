.class public Lcom/zykj/study/databinding/FragmentEditCourseBindingImpl;
.super Lcom/zykj/study/databinding/FragmentEditCourseBinding;
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
.field private editTextandroidTextAttrChanged:Landroidx/databinding/InverseBindingListener;

.field private mDirtyFlags:J

.field private final mboundView0:Lcom/zykj/study/databinding/LayoutBindViewModelBinding;
    .annotation build Landroidx/annotation/Nullable;
    .end annotation
.end field

.field private final mboundView6:Landroid/widget/TextView;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field private rbCustomandroidCheckedAttrChanged:Landroidx/databinding/InverseBindingListener;

.field private rbSystemandroidCheckedAttrChanged:Landroidx/databinding/InverseBindingListener;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 1
    new-instance v0, Landroidx/databinding/ViewDataBinding$IncludedLayouts;

    .line 2
    .line 3
    const/16 v1, 0x18

    .line 4
    .line 5
    invoke-direct {v0, v1}, Landroidx/databinding/ViewDataBinding$IncludedLayouts;-><init>(I)V

    .line 6
    .line 7
    .line 8
    sput-object v0, Lcom/zykj/study/databinding/FragmentEditCourseBindingImpl;->sIncludes:Landroidx/databinding/ViewDataBinding$IncludedLayouts;

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
    const/16 v2, 0xa

    .line 17
    .line 18
    filled-new-array {v2}, [I

    .line 19
    .line 20
    .line 21
    move-result-object v2

    .line 22
    sget v3, Lcom/zykj/study/R$layout;->layout_bind_view_model:I

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
    new-instance v0, Landroid/util/SparseIntArray;

    .line 33
    .line 34
    invoke-direct {v0}, Landroid/util/SparseIntArray;-><init>()V

    .line 35
    .line 36
    .line 37
    sput-object v0, Lcom/zykj/study/databinding/FragmentEditCourseBindingImpl;->sViewsWithIds:Landroid/util/SparseIntArray;

    .line 38
    .line 39
    sget v1, Lcom/zykj/study/R$id;->toolbar:I

    .line 40
    .line 41
    const/16 v2, 0xb

    .line 42
    .line 43
    invoke-virtual {v0, v1, v2}, Landroid/util/SparseIntArray;->put(II)V

    .line 44
    .line 45
    .line 46
    sget v1, Lcom/zykj/study/R$id;->textView6:I

    .line 47
    .line 48
    const/16 v2, 0xc

    .line 49
    .line 50
    invoke-virtual {v0, v1, v2}, Landroid/util/SparseIntArray;->put(II)V

    .line 51
    .line 52
    .line 53
    sget v1, Lcom/zykj/study/R$id;->textView7:I

    .line 54
    .line 55
    const/16 v2, 0xd

    .line 56
    .line 57
    invoke-virtual {v0, v1, v2}, Landroid/util/SparseIntArray;->put(II)V

    .line 58
    .line 59
    .line 60
    sget v1, Lcom/zykj/study/R$id;->radioGroup:I

    .line 61
    .line 62
    const/16 v2, 0xe

    .line 63
    .line 64
    invoke-virtual {v0, v1, v2}, Landroid/util/SparseIntArray;->put(II)V

    .line 65
    .line 66
    .line 67
    sget v1, Lcom/zykj/study/R$id;->barrier:I

    .line 68
    .line 69
    const/16 v2, 0xf

    .line 70
    .line 71
    invoke-virtual {v0, v1, v2}, Landroid/util/SparseIntArray;->put(II)V

    .line 72
    .line 73
    .line 74
    sget v1, Lcom/zykj/study/R$id;->textView8:I

    .line 75
    .line 76
    const/16 v2, 0x10

    .line 77
    .line 78
    invoke-virtual {v0, v1, v2}, Landroid/util/SparseIntArray;->put(II)V

    .line 79
    .line 80
    .line 81
    sget v1, Lcom/zykj/study/R$id;->textView9:I

    .line 82
    .line 83
    const/16 v2, 0x11

    .line 84
    .line 85
    invoke-virtual {v0, v1, v2}, Landroid/util/SparseIntArray;->put(II)V

    .line 86
    .line 87
    .line 88
    sget v1, Lcom/zykj/study/R$id;->textView10:I

    .line 89
    .line 90
    const/16 v2, 0x12

    .line 91
    .line 92
    invoke-virtual {v0, v1, v2}, Landroid/util/SparseIntArray;->put(II)V

    .line 93
    .line 94
    .line 95
    sget v1, Lcom/zykj/study/R$id;->et_desc:I

    .line 96
    .line 97
    const/16 v2, 0x13

    .line 98
    .line 99
    invoke-virtual {v0, v1, v2}, Landroid/util/SparseIntArray;->put(II)V

    .line 100
    .line 101
    .line 102
    sget v1, Lcom/zykj/study/R$id;->textView11:I

    .line 103
    .line 104
    const/16 v2, 0x14

    .line 105
    .line 106
    invoke-virtual {v0, v1, v2}, Landroid/util/SparseIntArray;->put(II)V

    .line 107
    .line 108
    .line 109
    sget v1, Lcom/zykj/study/R$id;->textView12:I

    .line 110
    .line 111
    const/16 v2, 0x15

    .line 112
    .line 113
    invoke-virtual {v0, v1, v2}, Landroid/util/SparseIntArray;->put(II)V

    .line 114
    .line 115
    .line 116
    sget v1, Lcom/zykj/study/R$id;->textView13:I

    .line 117
    .line 118
    const/16 v2, 0x16

    .line 119
    .line 120
    invoke-virtual {v0, v1, v2}, Landroid/util/SparseIntArray;->put(II)V

    .line 121
    .line 122
    .line 123
    sget v1, Lcom/zykj/study/R$id;->textView14:I

    .line 124
    .line 125
    const/16 v2, 0x17

    .line 126
    .line 127
    invoke-virtual {v0, v1, v2}, Landroid/util/SparseIntArray;->put(II)V

    .line 128
    .line 129
    .line 130
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
    sget-object v0, Lcom/zykj/study/databinding/FragmentEditCourseBindingImpl;->sIncludes:Landroidx/databinding/ViewDataBinding$IncludedLayouts;

    sget-object v1, Lcom/zykj/study/databinding/FragmentEditCourseBindingImpl;->sViewsWithIds:Landroid/util/SparseIntArray;

    const/16 v2, 0x18

    invoke-static {p1, p2, v2, v0, v1}, Landroidx/databinding/ViewDataBinding;->mapBindings(Landroidx/databinding/DataBindingComponent;Landroid/view/View;ILandroidx/databinding/ViewDataBinding$IncludedLayouts;Landroid/util/SparseIntArray;)[Ljava/lang/Object;

    move-result-object v0

    invoke-direct {p0, p1, p2, v0}, Lcom/zykj/study/databinding/FragmentEditCourseBindingImpl;-><init>(Landroidx/databinding/DataBindingComponent;Landroid/view/View;[Ljava/lang/Object;)V

    return-void
.end method

.method private constructor <init>(Landroidx/databinding/DataBindingComponent;Landroid/view/View;[Ljava/lang/Object;)V
    .locals 26

    const/16 v0, 0xf

    .line 2
    aget-object v0, p3, v0

    move-object v4, v0

    check-cast v4, Landroidx/constraintlayout/widget/Barrier;

    const/4 v0, 0x7

    aget-object v0, p3, v0

    move-object v5, v0

    check-cast v5, Landroid/widget/EditText;

    const/16 v0, 0x13

    aget-object v0, p3, v0

    move-object v6, v0

    check-cast v6, Lcom/xuexiang/xui/widget/edittext/MultiLineEditText;

    const/4 v0, 0x0

    aget-object v0, p3, v0

    move-object v7, v0

    check-cast v7, Landroid/widget/LinearLayout;

    const/4 v0, 0x5

    aget-object v0, p3, v0

    move-object v8, v0

    check-cast v8, Landroid/widget/ImageView;

    const/16 v0, 0xe

    aget-object v0, p3, v0

    move-object v9, v0

    check-cast v9, Landroid/widget/RadioGroup;

    const/4 v0, 0x2

    aget-object v0, p3, v0

    move-object v10, v0

    check-cast v10, Landroid/widget/RadioButton;

    const/4 v0, 0x1

    aget-object v0, p3, v0

    move-object v11, v0

    check-cast v11, Landroid/widget/RadioButton;

    const/4 v0, 0x3

    aget-object v0, p3, v0

    move-object v12, v0

    check-cast v12, Landroidx/recyclerview/widget/RecyclerView;

    const/4 v0, 0x4

    aget-object v0, p3, v0

    move-object v13, v0

    check-cast v13, Landroid/widget/RelativeLayout;

    const/16 v0, 0x8

    aget-object v0, p3, v0

    move-object v14, v0

    check-cast v14, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;

    const/16 v0, 0x9

    aget-object v0, p3, v0

    move-object v15, v0

    check-cast v15, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;

    const/16 v0, 0x12

    aget-object v0, p3, v0

    move-object/from16 v16, v0

    check-cast v16, Landroid/widget/TextView;

    const/16 v0, 0x14

    aget-object v0, p3, v0

    move-object/from16 v17, v0

    check-cast v17, Landroid/widget/TextView;

    const/16 v0, 0x15

    aget-object v0, p3, v0

    move-object/from16 v18, v0

    check-cast v18, Landroid/widget/TextView;

    const/16 v0, 0x16

    aget-object v0, p3, v0

    move-object/from16 v19, v0

    check-cast v19, Landroid/widget/TextView;

    const/16 v0, 0x17

    aget-object v0, p3, v0

    move-object/from16 v20, v0

    check-cast v20, Landroid/widget/TextView;

    const/16 v0, 0xc

    aget-object v0, p3, v0

    move-object/from16 v21, v0

    check-cast v21, Landroid/widget/TextView;

    const/16 v0, 0xd

    aget-object v0, p3, v0

    move-object/from16 v22, v0

    check-cast v22, Landroid/widget/TextView;

    const/16 v0, 0x10

    aget-object v0, p3, v0

    move-object/from16 v23, v0

    check-cast v23, Landroid/widget/TextView;

    const/16 v0, 0x11

    aget-object v0, p3, v0

    move-object/from16 v24, v0

    check-cast v24, Landroid/widget/TextView;

    const/16 v0, 0xb

    aget-object v0, p3, v0

    move-object/from16 v25, v0

    check-cast v25, Landroidx/appcompat/widget/Toolbar;

    const/16 v3, 0x9

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    invoke-direct/range {v0 .. v25}, Lcom/zykj/study/databinding/FragmentEditCourseBinding;-><init>(Ljava/lang/Object;Landroid/view/View;ILandroidx/constraintlayout/widget/Barrier;Landroid/widget/EditText;Lcom/xuexiang/xui/widget/edittext/MultiLineEditText;Landroid/widget/LinearLayout;Landroid/widget/ImageView;Landroid/widget/RadioGroup;Landroid/widget/RadioButton;Landroid/widget/RadioButton;Landroidx/recyclerview/widget/RecyclerView;Landroid/widget/RelativeLayout;Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroidx/appcompat/widget/Toolbar;)V

    .line 3
    new-instance v1, Lcom/zykj/study/databinding/FragmentEditCourseBindingImpl$1;

    invoke-direct {v1, v0}, Lcom/zykj/study/databinding/FragmentEditCourseBindingImpl$1;-><init>(Lcom/zykj/study/databinding/FragmentEditCourseBindingImpl;)V

    iput-object v1, v0, Lcom/zykj/study/databinding/FragmentEditCourseBindingImpl;->editTextandroidTextAttrChanged:Landroidx/databinding/InverseBindingListener;

    .line 4
    new-instance v1, Lcom/zykj/study/databinding/FragmentEditCourseBindingImpl$2;

    invoke-direct {v1, v0}, Lcom/zykj/study/databinding/FragmentEditCourseBindingImpl$2;-><init>(Lcom/zykj/study/databinding/FragmentEditCourseBindingImpl;)V

    iput-object v1, v0, Lcom/zykj/study/databinding/FragmentEditCourseBindingImpl;->rbCustomandroidCheckedAttrChanged:Landroidx/databinding/InverseBindingListener;

    .line 5
    new-instance v1, Lcom/zykj/study/databinding/FragmentEditCourseBindingImpl$3;

    invoke-direct {v1, v0}, Lcom/zykj/study/databinding/FragmentEditCourseBindingImpl$3;-><init>(Lcom/zykj/study/databinding/FragmentEditCourseBindingImpl;)V

    iput-object v1, v0, Lcom/zykj/study/databinding/FragmentEditCourseBindingImpl;->rbSystemandroidCheckedAttrChanged:Landroidx/databinding/InverseBindingListener;

    const-wide/16 v1, -0x1

    .line 6
    iput-wide v1, v0, Lcom/zykj/study/databinding/FragmentEditCourseBindingImpl;->mDirtyFlags:J

    .line 7
    iget-object v1, v0, Lcom/zykj/study/databinding/FragmentEditCourseBinding;->editText:Landroid/widget/EditText;

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 8
    iget-object v1, v0, Lcom/zykj/study/databinding/FragmentEditCourseBinding;->fragmentEditCourse:Landroid/widget/LinearLayout;

    invoke-virtual {v1, v2}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 9
    iget-object v1, v0, Lcom/zykj/study/databinding/FragmentEditCourseBinding;->ivCover:Landroid/widget/ImageView;

    invoke-virtual {v1, v2}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    const/16 v1, 0xa

    .line 10
    aget-object v1, p3, v1

    check-cast v1, Lcom/zykj/study/databinding/LayoutBindViewModelBinding;

    iput-object v1, v0, Lcom/zykj/study/databinding/FragmentEditCourseBindingImpl;->mboundView0:Lcom/zykj/study/databinding/LayoutBindViewModelBinding;

    .line 11
    invoke-virtual {v0, v1}, Landroidx/databinding/ViewDataBinding;->setContainedBinding(Landroidx/databinding/ViewDataBinding;)V

    const/4 v1, 0x6

    .line 12
    aget-object v1, p3, v1

    check-cast v1, Landroid/widget/TextView;

    iput-object v1, v0, Lcom/zykj/study/databinding/FragmentEditCourseBindingImpl;->mboundView6:Landroid/widget/TextView;

    .line 13
    invoke-virtual {v1, v2}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 14
    iget-object v1, v0, Lcom/zykj/study/databinding/FragmentEditCourseBinding;->rbCustom:Landroid/widget/RadioButton;

    invoke-virtual {v1, v2}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 15
    iget-object v1, v0, Lcom/zykj/study/databinding/FragmentEditCourseBinding;->rbSystem:Landroid/widget/RadioButton;

    invoke-virtual {v1, v2}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 16
    iget-object v1, v0, Lcom/zykj/study/databinding/FragmentEditCourseBinding;->recycleViewSys:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {v1, v2}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 17
    iget-object v1, v0, Lcom/zykj/study/databinding/FragmentEditCourseBinding;->rlCustomCover:Landroid/widget/RelativeLayout;

    invoke-virtual {v1, v2}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 18
    iget-object v1, v0, Lcom/zykj/study/databinding/FragmentEditCourseBinding;->svCatalog:Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;

    invoke-virtual {v1, v2}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 19
    iget-object v1, v0, Lcom/zykj/study/databinding/FragmentEditCourseBinding;->svPublic:Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;

    invoke-virtual {v1, v2}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    move-object/from16 v2, p2

    .line 20
    invoke-virtual {v0, v2}, Landroidx/databinding/ViewDataBinding;->setRootTag(Landroid/view/View;)V

    .line 21
    invoke-virtual {v0}, Lcom/zykj/study/databinding/FragmentEditCourseBindingImpl;->invalidateAll()V

    return-void
.end method

.method private onChangeEditCourseViewModelGradeId(Landroidx/lifecycle/MutableLiveData;I)Z
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/lifecycle/MutableLiveData<",
            "Ljava/lang/Integer;",
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
    iget-wide p1, p0, Lcom/zykj/study/databinding/FragmentEditCourseBindingImpl;->mDirtyFlags:J

    .line 5
    .line 6
    const-wide/16 v0, 0x20

    .line 7
    .line 8
    or-long/2addr p1, v0

    .line 9
    iput-wide p1, p0, Lcom/zykj/study/databinding/FragmentEditCourseBindingImpl;->mDirtyFlags:J

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

.method private onChangeEditCourseViewModelIsDialogVisible(Lcom/kunminx/architecture/ui/callback/UnPeekLiveData;I)Z
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
    iget-wide p1, p0, Lcom/zykj/study/databinding/FragmentEditCourseBindingImpl;->mDirtyFlags:J

    .line 5
    .line 6
    const-wide/16 v0, 0x80

    .line 7
    .line 8
    or-long/2addr p1, v0

    .line 9
    iput-wide p1, p0, Lcom/zykj/study/databinding/FragmentEditCourseBindingImpl;->mDirtyFlags:J

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

.method private onChangeEditCourseViewModelIsPublic(Landroidx/lifecycle/MutableLiveData;I)Z
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
    iget-wide p1, p0, Lcom/zykj/study/databinding/FragmentEditCourseBindingImpl;->mDirtyFlags:J

    .line 5
    .line 6
    const-wide/16 v0, 0x10

    .line 7
    .line 8
    or-long/2addr p1, v0

    .line 9
    iput-wide p1, p0, Lcom/zykj/study/databinding/FragmentEditCourseBindingImpl;->mDirtyFlags:J

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

.method private onChangeEditCourseViewModelIsSystemCover(Landroidx/databinding/ObservableBoolean;I)Z
    .locals 2

    .line 1
    if-nez p2, :cond_0

    .line 2
    .line 3
    monitor-enter p0

    .line 4
    :try_start_0
    iget-wide p1, p0, Lcom/zykj/study/databinding/FragmentEditCourseBindingImpl;->mDirtyFlags:J

    .line 5
    .line 6
    const-wide/16 v0, 0x2

    .line 7
    .line 8
    or-long/2addr p1, v0

    .line 9
    iput-wide p1, p0, Lcom/zykj/study/databinding/FragmentEditCourseBindingImpl;->mDirtyFlags:J

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

.method private onChangeEditCourseViewModelLocalCover(Landroidx/lifecycle/MutableLiveData;I)Z
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/lifecycle/MutableLiveData<",
            "Ljava/lang/String;",
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
    iget-wide p1, p0, Lcom/zykj/study/databinding/FragmentEditCourseBindingImpl;->mDirtyFlags:J

    .line 5
    .line 6
    const-wide/16 v0, 0x1

    .line 7
    .line 8
    or-long/2addr p1, v0

    .line 9
    iput-wide p1, p0, Lcom/zykj/study/databinding/FragmentEditCourseBindingImpl;->mDirtyFlags:J

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

.method private onChangeEditCourseViewModelPeriodId(Landroidx/lifecycle/MutableLiveData;I)Z
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/lifecycle/MutableLiveData<",
            "Ljava/lang/Integer;",
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
    iget-wide p1, p0, Lcom/zykj/study/databinding/FragmentEditCourseBindingImpl;->mDirtyFlags:J

    .line 5
    .line 6
    const-wide/16 v0, 0x100

    .line 7
    .line 8
    or-long/2addr p1, v0

    .line 9
    iput-wide p1, p0, Lcom/zykj/study/databinding/FragmentEditCourseBindingImpl;->mDirtyFlags:J

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

.method private onChangeEditCourseViewModelSubjectId(Landroidx/lifecycle/MutableLiveData;I)Z
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/lifecycle/MutableLiveData<",
            "Ljava/lang/Integer;",
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
    iget-wide p1, p0, Lcom/zykj/study/databinding/FragmentEditCourseBindingImpl;->mDirtyFlags:J

    .line 5
    .line 6
    const-wide/16 v0, 0x4

    .line 7
    .line 8
    or-long/2addr p1, v0

    .line 9
    iput-wide p1, p0, Lcom/zykj/study/databinding/FragmentEditCourseBindingImpl;->mDirtyFlags:J

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

.method private onChangeEditCourseViewModelTitle(Landroidx/lifecycle/MutableLiveData;I)Z
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/lifecycle/MutableLiveData<",
            "Ljava/lang/String;",
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
    iget-wide p1, p0, Lcom/zykj/study/databinding/FragmentEditCourseBindingImpl;->mDirtyFlags:J

    .line 5
    .line 6
    const-wide/16 v0, 0x40

    .line 7
    .line 8
    or-long/2addr p1, v0

    .line 9
    iput-wide p1, p0, Lcom/zykj/study/databinding/FragmentEditCourseBindingImpl;->mDirtyFlags:J

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

.method private onChangeEditCourseViewModelToastLiveData(Lcom/kunminx/architecture/ui/callback/UnPeekLiveData;I)Z
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
    iget-wide p1, p0, Lcom/zykj/study/databinding/FragmentEditCourseBindingImpl;->mDirtyFlags:J

    .line 5
    .line 6
    const-wide/16 v0, 0x8

    .line 7
    .line 8
    or-long/2addr p1, v0

    .line 9
    iput-wide p1, p0, Lcom/zykj/study/databinding/FragmentEditCourseBindingImpl;->mDirtyFlags:J

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
    .locals 36

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    monitor-enter p0

    .line 4
    :try_start_0
    iget-wide v2, v1, Lcom/zykj/study/databinding/FragmentEditCourseBindingImpl;->mDirtyFlags:J

    .line 5
    .line 6
    const-wide/16 v4, 0x0

    .line 7
    .line 8
    iput-wide v4, v1, Lcom/zykj/study/databinding/FragmentEditCourseBindingImpl;->mDirtyFlags:J

    .line 9
    .line 10
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 11
    iget-object v0, v1, Lcom/zykj/study/databinding/FragmentEditCourseBinding;->mEditCourseViewModel:Lcom/zykj/study/viewmodels/EditCourseViewModel;

    .line 12
    .line 13
    iget-object v6, v1, Lcom/zykj/study/databinding/FragmentEditCourseBinding;->mDictViewModel:Lcom/zykj/study/viewmodels/DictViewModel;

    .line 14
    .line 15
    const-wide/16 v7, 0xfff

    .line 16
    .line 17
    and-long/2addr v7, v2

    .line 18
    cmp-long v7, v7, v4

    .line 19
    .line 20
    const-wide/16 v14, 0xa08

    .line 21
    .line 22
    const-wide/16 v16, 0xf24

    .line 23
    .line 24
    const-wide/16 v18, 0xa02

    .line 25
    .line 26
    const-wide/16 v20, 0xa01

    .line 27
    .line 28
    move-wide/from16 v22, v4

    .line 29
    .line 30
    const/4 v4, 0x0

    .line 31
    const/4 v5, 0x0

    .line 32
    if-eqz v7, :cond_18

    .line 33
    .line 34
    and-long v24, v2, v20

    .line 35
    .line 36
    cmp-long v7, v24, v22

    .line 37
    .line 38
    const-wide/16 v24, 0xa80

    .line 39
    .line 40
    const/4 v8, 0x1

    .line 41
    if-eqz v7, :cond_5

    .line 42
    .line 43
    if-eqz v0, :cond_0

    .line 44
    .line 45
    invoke-virtual {v0}, Lcom/zykj/study/viewmodels/EditCourseViewModel;->f()Landroidx/lifecycle/MutableLiveData;

    .line 46
    .line 47
    .line 48
    move-result-object v7

    .line 49
    goto :goto_0

    .line 50
    :cond_0
    move-object v7, v5

    .line 51
    :goto_0
    invoke-virtual {v1, v4, v7}, Landroidx/databinding/ViewDataBinding;->updateLiveDataRegistration(ILandroidx/lifecycle/LiveData;)Z

    .line 52
    .line 53
    .line 54
    if-eqz v7, :cond_1

    .line 55
    .line 56
    invoke-virtual {v7}, Landroidx/lifecycle/LiveData;->getValue()Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    move-result-object v7

    .line 60
    check-cast v7, Ljava/lang/String;

    .line 61
    .line 62
    goto :goto_1

    .line 63
    :cond_1
    move-object v7, v5

    .line 64
    :goto_1
    if-eqz v7, :cond_2

    .line 65
    .line 66
    invoke-virtual {v7}, Ljava/lang/String;->length()I

    .line 67
    .line 68
    .line 69
    move-result v9

    .line 70
    goto :goto_2

    .line 71
    :cond_2
    move v9, v4

    .line 72
    :goto_2
    if-lez v9, :cond_3

    .line 73
    .line 74
    move/from16 v26, v8

    .line 75
    .line 76
    goto :goto_3

    .line 77
    :cond_3
    move/from16 v26, v4

    .line 78
    .line 79
    :goto_3
    if-nez v9, :cond_4

    .line 80
    .line 81
    move v9, v8

    .line 82
    goto :goto_4

    .line 83
    :cond_4
    move v9, v4

    .line 84
    goto :goto_4

    .line 85
    :cond_5
    move v9, v4

    .line 86
    move/from16 v26, v9

    .line 87
    .line 88
    move-object v7, v5

    .line 89
    :goto_4
    and-long v27, v2, v18

    .line 90
    .line 91
    cmp-long v27, v27, v22

    .line 92
    .line 93
    if-eqz v27, :cond_8

    .line 94
    .line 95
    if-eqz v0, :cond_6

    .line 96
    .line 97
    invoke-virtual {v0}, Lcom/zykj/study/viewmodels/EditCourseViewModel;->o()Landroidx/databinding/ObservableBoolean;

    .line 98
    .line 99
    .line 100
    move-result-object v27

    .line 101
    move-object/from16 v4, v27

    .line 102
    .line 103
    goto :goto_5

    .line 104
    :cond_6
    move-object v4, v5

    .line 105
    :goto_5
    invoke-virtual {v1, v8, v4}, Landroidx/databinding/ViewDataBinding;->updateRegistration(ILandroidx/databinding/Observable;)Z

    .line 106
    .line 107
    .line 108
    if-eqz v4, :cond_7

    .line 109
    .line 110
    invoke-virtual {v4}, Landroidx/databinding/ObservableBoolean;->get()Z

    .line 111
    .line 112
    .line 113
    move-result v4

    .line 114
    goto :goto_6

    .line 115
    :cond_7
    const/4 v4, 0x0

    .line 116
    :goto_6
    xor-int/lit8 v8, v4, 0x1

    .line 117
    .line 118
    goto :goto_7

    .line 119
    :cond_8
    const/4 v4, 0x0

    .line 120
    const/4 v8, 0x0

    .line 121
    :goto_7
    and-long v28, v2, v16

    .line 122
    .line 123
    cmp-long v28, v28, v22

    .line 124
    .line 125
    if-eqz v28, :cond_d

    .line 126
    .line 127
    if-eqz v0, :cond_9

    .line 128
    .line 129
    invoke-virtual {v0}, Lcom/zykj/study/viewmodels/EditCourseViewModel;->j()Landroidx/lifecycle/MutableLiveData;

    .line 130
    .line 131
    .line 132
    move-result-object v28

    .line 133
    invoke-virtual {v0}, Lcom/zykj/study/viewmodels/EditCourseViewModel;->b()Landroidx/lifecycle/MutableLiveData;

    .line 134
    .line 135
    .line 136
    move-result-object v29

    .line 137
    invoke-virtual {v0}, Lcom/zykj/study/viewmodels/EditCourseViewModel;->h()Landroidx/lifecycle/MutableLiveData;

    .line 138
    .line 139
    .line 140
    move-result-object v30

    .line 141
    move-object/from16 v10, v28

    .line 142
    .line 143
    move-object/from16 v11, v29

    .line 144
    .line 145
    move-object/from16 v12, v30

    .line 146
    .line 147
    :goto_8
    const-wide/16 v28, 0xa40

    .line 148
    .line 149
    const-wide/16 v30, 0xa10

    .line 150
    .line 151
    goto :goto_9

    .line 152
    :cond_9
    move-object v10, v5

    .line 153
    move-object v11, v10

    .line 154
    move-object v12, v11

    .line 155
    goto :goto_8

    .line 156
    :goto_9
    const/4 v13, 0x2

    .line 157
    invoke-virtual {v1, v13, v10}, Landroidx/databinding/ViewDataBinding;->updateLiveDataRegistration(ILandroidx/lifecycle/LiveData;)Z

    .line 158
    .line 159
    .line 160
    const/4 v13, 0x5

    .line 161
    invoke-virtual {v1, v13, v11}, Landroidx/databinding/ViewDataBinding;->updateLiveDataRegistration(ILandroidx/lifecycle/LiveData;)Z

    .line 162
    .line 163
    .line 164
    const/16 v13, 0x8

    .line 165
    .line 166
    invoke-virtual {v1, v13, v12}, Landroidx/databinding/ViewDataBinding;->updateLiveDataRegistration(ILandroidx/lifecycle/LiveData;)Z

    .line 167
    .line 168
    .line 169
    if-eqz v10, :cond_a

    .line 170
    .line 171
    invoke-virtual {v10}, Landroidx/lifecycle/LiveData;->getValue()Ljava/lang/Object;

    .line 172
    .line 173
    .line 174
    move-result-object v10

    .line 175
    check-cast v10, Ljava/lang/Integer;

    .line 176
    .line 177
    goto :goto_a

    .line 178
    :cond_a
    move-object v10, v5

    .line 179
    :goto_a
    if-eqz v11, :cond_b

    .line 180
    .line 181
    invoke-virtual {v11}, Landroidx/lifecycle/LiveData;->getValue()Ljava/lang/Object;

    .line 182
    .line 183
    .line 184
    move-result-object v11

    .line 185
    check-cast v11, Ljava/lang/Integer;

    .line 186
    .line 187
    goto :goto_b

    .line 188
    :cond_b
    move-object v11, v5

    .line 189
    :goto_b
    if-eqz v12, :cond_c

    .line 190
    .line 191
    invoke-virtual {v12}, Landroidx/lifecycle/LiveData;->getValue()Ljava/lang/Object;

    .line 192
    .line 193
    .line 194
    move-result-object v12

    .line 195
    check-cast v12, Ljava/lang/Integer;

    .line 196
    .line 197
    goto :goto_c

    .line 198
    :cond_c
    move-object v12, v5

    .line 199
    :goto_c
    invoke-static {v10}, Landroidx/databinding/ViewDataBinding;->safeUnbox(Ljava/lang/Integer;)I

    .line 200
    .line 201
    .line 202
    move-result v10

    .line 203
    invoke-static {v11}, Landroidx/databinding/ViewDataBinding;->safeUnbox(Ljava/lang/Integer;)I

    .line 204
    .line 205
    .line 206
    move-result v11

    .line 207
    invoke-static {v12}, Landroidx/databinding/ViewDataBinding;->safeUnbox(Ljava/lang/Integer;)I

    .line 208
    .line 209
    .line 210
    move-result v12

    .line 211
    goto :goto_d

    .line 212
    :cond_d
    const-wide/16 v28, 0xa40

    .line 213
    .line 214
    const-wide/16 v30, 0xa10

    .line 215
    .line 216
    const/4 v10, 0x0

    .line 217
    const/4 v11, 0x0

    .line 218
    const/4 v12, 0x0

    .line 219
    :goto_d
    and-long v32, v2, v14

    .line 220
    .line 221
    cmp-long v13, v32, v22

    .line 222
    .line 223
    if-eqz v13, :cond_f

    .line 224
    .line 225
    if-eqz v0, :cond_e

    .line 226
    .line 227
    invoke-virtual {v0}, Lcom/zykj/base/BaseViewModel;->getToastLiveData()Lcom/kunminx/architecture/ui/callback/UnPeekLiveData;

    .line 228
    .line 229
    .line 230
    move-result-object v13

    .line 231
    :goto_e
    move-wide/from16 v32, v14

    .line 232
    .line 233
    goto :goto_f

    .line 234
    :cond_e
    move-object v13, v5

    .line 235
    goto :goto_e

    .line 236
    :goto_f
    const/4 v14, 0x3

    .line 237
    invoke-virtual {v1, v14, v13}, Landroidx/databinding/ViewDataBinding;->updateLiveDataRegistration(ILandroidx/lifecycle/LiveData;)Z

    .line 238
    .line 239
    .line 240
    if-eqz v13, :cond_10

    .line 241
    .line 242
    invoke-virtual {v13}, Landroidx/lifecycle/LiveData;->getValue()Ljava/lang/Object;

    .line 243
    .line 244
    .line 245
    move-result-object v14

    .line 246
    check-cast v14, Lcom/zykj/base/bean/toast/ToastMessage;

    .line 247
    .line 248
    goto :goto_10

    .line 249
    :cond_f
    move-wide/from16 v32, v14

    .line 250
    .line 251
    move-object v13, v5

    .line 252
    :cond_10
    :goto_10
    and-long v14, v2, v30

    .line 253
    .line 254
    cmp-long v14, v14, v22

    .line 255
    .line 256
    if-eqz v14, :cond_13

    .line 257
    .line 258
    if-eqz v0, :cond_11

    .line 259
    .line 260
    invoke-virtual {v0}, Lcom/zykj/study/viewmodels/EditCourseViewModel;->m()Landroidx/lifecycle/MutableLiveData;

    .line 261
    .line 262
    .line 263
    move-result-object v14

    .line 264
    goto :goto_11

    .line 265
    :cond_11
    move-object v14, v5

    .line 266
    :goto_11
    const/4 v15, 0x4

    .line 267
    invoke-virtual {v1, v15, v14}, Landroidx/databinding/ViewDataBinding;->updateLiveDataRegistration(ILandroidx/lifecycle/LiveData;)Z

    .line 268
    .line 269
    .line 270
    if-eqz v14, :cond_12

    .line 271
    .line 272
    invoke-virtual {v14}, Landroidx/lifecycle/LiveData;->getValue()Ljava/lang/Object;

    .line 273
    .line 274
    .line 275
    move-result-object v14

    .line 276
    check-cast v14, Ljava/lang/Boolean;

    .line 277
    .line 278
    goto :goto_12

    .line 279
    :cond_12
    move-object v14, v5

    .line 280
    :goto_12
    invoke-static {v14}, Landroidx/databinding/ViewDataBinding;->safeUnbox(Ljava/lang/Boolean;)Z

    .line 281
    .line 282
    .line 283
    move-result v14

    .line 284
    move/from16 v27, v14

    .line 285
    .line 286
    goto :goto_13

    .line 287
    :cond_13
    const/16 v27, 0x0

    .line 288
    .line 289
    :goto_13
    and-long v14, v2, v28

    .line 290
    .line 291
    cmp-long v14, v14, v22

    .line 292
    .line 293
    if-eqz v14, :cond_15

    .line 294
    .line 295
    if-eqz v0, :cond_14

    .line 296
    .line 297
    invoke-virtual {v0}, Lcom/zykj/study/viewmodels/EditCourseViewModel;->l()Landroidx/lifecycle/MutableLiveData;

    .line 298
    .line 299
    .line 300
    move-result-object v14

    .line 301
    goto :goto_14

    .line 302
    :cond_14
    move-object v14, v5

    .line 303
    :goto_14
    const/4 v15, 0x6

    .line 304
    invoke-virtual {v1, v15, v14}, Landroidx/databinding/ViewDataBinding;->updateLiveDataRegistration(ILandroidx/lifecycle/LiveData;)Z

    .line 305
    .line 306
    .line 307
    if-eqz v14, :cond_15

    .line 308
    .line 309
    invoke-virtual {v14}, Landroidx/lifecycle/LiveData;->getValue()Ljava/lang/Object;

    .line 310
    .line 311
    .line 312
    move-result-object v14

    .line 313
    check-cast v14, Ljava/lang/String;

    .line 314
    .line 315
    goto :goto_15

    .line 316
    :cond_15
    move-object v14, v5

    .line 317
    :goto_15
    and-long v34, v2, v24

    .line 318
    .line 319
    cmp-long v15, v34, v22

    .line 320
    .line 321
    if-eqz v15, :cond_17

    .line 322
    .line 323
    if-eqz v0, :cond_16

    .line 324
    .line 325
    invoke-virtual {v0}, Lcom/zykj/base/BaseViewModel;->isDialogVisible()Lcom/kunminx/architecture/ui/callback/UnPeekLiveData;

    .line 326
    .line 327
    .line 328
    move-result-object v0

    .line 329
    goto :goto_16

    .line 330
    :cond_16
    move-object v0, v5

    .line 331
    :goto_16
    const/4 v15, 0x7

    .line 332
    invoke-virtual {v1, v15, v0}, Landroidx/databinding/ViewDataBinding;->updateLiveDataRegistration(ILandroidx/lifecycle/LiveData;)Z

    .line 333
    .line 334
    .line 335
    if-eqz v0, :cond_17

    .line 336
    .line 337
    invoke-virtual {v0}, Landroidx/lifecycle/LiveData;->getValue()Ljava/lang/Object;

    .line 338
    .line 339
    .line 340
    move-result-object v0

    .line 341
    check-cast v0, Ljava/lang/Boolean;

    .line 342
    .line 343
    :goto_17
    move-object v15, v14

    .line 344
    move-object v14, v13

    .line 345
    move-object v13, v7

    .line 346
    move v7, v4

    .line 347
    move v4, v12

    .line 348
    move/from16 v12, v27

    .line 349
    .line 350
    goto :goto_18

    .line 351
    :cond_17
    move-object v0, v5

    .line 352
    goto :goto_17

    .line 353
    :cond_18
    move-wide/from16 v32, v14

    .line 354
    .line 355
    const-wide/16 v24, 0xa80

    .line 356
    .line 357
    const-wide/16 v28, 0xa40

    .line 358
    .line 359
    const-wide/16 v30, 0xa10

    .line 360
    .line 361
    move-object v0, v5

    .line 362
    move-object v13, v0

    .line 363
    move-object v14, v13

    .line 364
    move-object v15, v14

    .line 365
    const/4 v4, 0x0

    .line 366
    const/4 v7, 0x0

    .line 367
    const/4 v8, 0x0

    .line 368
    const/4 v9, 0x0

    .line 369
    const/4 v10, 0x0

    .line 370
    const/4 v11, 0x0

    .line 371
    const/4 v12, 0x0

    .line 372
    const/16 v26, 0x0

    .line 373
    .line 374
    :goto_18
    and-long v16, v2, v16

    .line 375
    .line 376
    cmp-long v16, v16, v22

    .line 377
    .line 378
    if-eqz v16, :cond_19

    .line 379
    .line 380
    if-eqz v6, :cond_19

    .line 381
    .line 382
    invoke-virtual {v6, v4, v11, v10}, Lcom/zykj/study/viewmodels/DictViewModel;->k(III)Ljava/lang/String;

    .line 383
    .line 384
    .line 385
    move-result-object v4

    .line 386
    goto :goto_19

    .line 387
    :cond_19
    move-object v4, v5

    .line 388
    :goto_19
    and-long v10, v2, v28

    .line 389
    .line 390
    cmp-long v6, v10, v22

    .line 391
    .line 392
    if-eqz v6, :cond_1a

    .line 393
    .line 394
    iget-object v6, v1, Lcom/zykj/study/databinding/FragmentEditCourseBinding;->editText:Landroid/widget/EditText;

    .line 395
    .line 396
    invoke-static {v6, v15}, Landroidx/databinding/adapters/TextViewBindingAdapter;->setText(Landroid/widget/TextView;Ljava/lang/CharSequence;)V

    .line 397
    .line 398
    .line 399
    :cond_1a
    const-wide/16 v10, 0x800

    .line 400
    .line 401
    and-long/2addr v10, v2

    .line 402
    cmp-long v6, v10, v22

    .line 403
    .line 404
    if-eqz v6, :cond_1b

    .line 405
    .line 406
    iget-object v6, v1, Lcom/zykj/study/databinding/FragmentEditCourseBinding;->editText:Landroid/widget/EditText;

    .line 407
    .line 408
    iget-object v10, v1, Lcom/zykj/study/databinding/FragmentEditCourseBindingImpl;->editTextandroidTextAttrChanged:Landroidx/databinding/InverseBindingListener;

    .line 409
    .line 410
    invoke-static {v6, v5, v5, v5, v10}, Landroidx/databinding/adapters/TextViewBindingAdapter;->setTextWatcher(Landroid/widget/TextView;Landroidx/databinding/adapters/TextViewBindingAdapter$BeforeTextChanged;Landroidx/databinding/adapters/TextViewBindingAdapter$OnTextChanged;Landroidx/databinding/adapters/TextViewBindingAdapter$AfterTextChanged;Landroidx/databinding/InverseBindingListener;)V

    .line 411
    .line 412
    .line 413
    iget-object v6, v1, Lcom/zykj/study/databinding/FragmentEditCourseBinding;->rbCustom:Landroid/widget/RadioButton;

    .line 414
    .line 415
    iget-object v10, v1, Lcom/zykj/study/databinding/FragmentEditCourseBindingImpl;->rbCustomandroidCheckedAttrChanged:Landroidx/databinding/InverseBindingListener;

    .line 416
    .line 417
    invoke-static {v6, v5, v10}, Landroidx/databinding/adapters/CompoundButtonBindingAdapter;->setListeners(Landroid/widget/CompoundButton;Landroid/widget/CompoundButton$OnCheckedChangeListener;Landroidx/databinding/InverseBindingListener;)V

    .line 418
    .line 419
    .line 420
    iget-object v6, v1, Lcom/zykj/study/databinding/FragmentEditCourseBinding;->rbSystem:Landroid/widget/RadioButton;

    .line 421
    .line 422
    iget-object v10, v1, Lcom/zykj/study/databinding/FragmentEditCourseBindingImpl;->rbSystemandroidCheckedAttrChanged:Landroidx/databinding/InverseBindingListener;

    .line 423
    .line 424
    invoke-static {v6, v5, v10}, Landroidx/databinding/adapters/CompoundButtonBindingAdapter;->setListeners(Landroid/widget/CompoundButton;Landroid/widget/CompoundButton$OnCheckedChangeListener;Landroidx/databinding/InverseBindingListener;)V

    .line 425
    .line 426
    .line 427
    :cond_1b
    and-long v5, v2, v20

    .line 428
    .line 429
    cmp-long v5, v5, v22

    .line 430
    .line 431
    if-eqz v5, :cond_1c

    .line 432
    .line 433
    iget-object v5, v1, Lcom/zykj/study/databinding/FragmentEditCourseBinding;->ivCover:Landroid/widget/ImageView;

    .line 434
    .line 435
    invoke-static {v5, v13}, Lcom/zykj/base/ext/BindingAdaptersKt;->netUrl(Landroid/widget/ImageView;Ljava/lang/String;)V

    .line 436
    .line 437
    .line 438
    iget-object v5, v1, Lcom/zykj/study/databinding/FragmentEditCourseBinding;->ivCover:Landroid/widget/ImageView;

    .line 439
    .line 440
    invoke-static/range {v26 .. v26}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 441
    .line 442
    .line 443
    move-result-object v6

    .line 444
    invoke-static {v5, v6}, Lcom/zykj/base/ext/BindingAdaptersKt;->visibleOrGone(Landroid/view/View;Ljava/lang/Boolean;)V

    .line 445
    .line 446
    .line 447
    iget-object v5, v1, Lcom/zykj/study/databinding/FragmentEditCourseBindingImpl;->mboundView6:Landroid/widget/TextView;

    .line 448
    .line 449
    invoke-static {v9}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 450
    .line 451
    .line 452
    move-result-object v6

    .line 453
    invoke-static {v5, v6}, Lcom/zykj/base/ext/BindingAdaptersKt;->visibleOrGone(Landroid/view/View;Ljava/lang/Boolean;)V

    .line 454
    .line 455
    .line 456
    :cond_1c
    and-long v5, v2, v24

    .line 457
    .line 458
    cmp-long v5, v5, v22

    .line 459
    .line 460
    if-eqz v5, :cond_1d

    .line 461
    .line 462
    iget-object v5, v1, Lcom/zykj/study/databinding/FragmentEditCourseBindingImpl;->mboundView0:Lcom/zykj/study/databinding/LayoutBindViewModelBinding;

    .line 463
    .line 464
    invoke-virtual {v5, v0}, Lcom/zykj/study/databinding/LayoutBindViewModelBinding;->setIsDialogVisible(Ljava/lang/Boolean;)V

    .line 465
    .line 466
    .line 467
    :cond_1d
    and-long v5, v2, v32

    .line 468
    .line 469
    cmp-long v0, v5, v22

    .line 470
    .line 471
    if-eqz v0, :cond_1e

    .line 472
    .line 473
    iget-object v0, v1, Lcom/zykj/study/databinding/FragmentEditCourseBindingImpl;->mboundView0:Lcom/zykj/study/databinding/LayoutBindViewModelBinding;

    .line 474
    .line 475
    invoke-virtual {v0, v14}, Lcom/zykj/study/databinding/LayoutBindViewModelBinding;->setToastLiveData(Lcom/kunminx/architecture/ui/callback/ProtectedUnPeekLiveData;)V

    .line 476
    .line 477
    .line 478
    :cond_1e
    and-long v5, v2, v18

    .line 479
    .line 480
    cmp-long v0, v5, v22

    .line 481
    .line 482
    if-eqz v0, :cond_1f

    .line 483
    .line 484
    iget-object v0, v1, Lcom/zykj/study/databinding/FragmentEditCourseBinding;->rbCustom:Landroid/widget/RadioButton;

    .line 485
    .line 486
    invoke-static {v0, v8}, Landroidx/databinding/adapters/CompoundButtonBindingAdapter;->setChecked(Landroid/widget/CompoundButton;Z)V

    .line 487
    .line 488
    .line 489
    iget-object v0, v1, Lcom/zykj/study/databinding/FragmentEditCourseBinding;->rbSystem:Landroid/widget/RadioButton;

    .line 490
    .line 491
    invoke-static {v0, v7}, Landroidx/databinding/adapters/CompoundButtonBindingAdapter;->setChecked(Landroid/widget/CompoundButton;Z)V

    .line 492
    .line 493
    .line 494
    iget-object v0, v1, Lcom/zykj/study/databinding/FragmentEditCourseBinding;->recycleViewSys:Landroidx/recyclerview/widget/RecyclerView;

    .line 495
    .line 496
    invoke-static {v7}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 497
    .line 498
    .line 499
    move-result-object v5

    .line 500
    invoke-static {v0, v5}, Lcom/zykj/base/ext/BindingAdaptersKt;->visibleOrGone(Landroid/view/View;Ljava/lang/Boolean;)V

    .line 501
    .line 502
    .line 503
    iget-object v0, v1, Lcom/zykj/study/databinding/FragmentEditCourseBinding;->rlCustomCover:Landroid/widget/RelativeLayout;

    .line 504
    .line 505
    invoke-static {v8}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 506
    .line 507
    .line 508
    move-result-object v5

    .line 509
    invoke-static {v0, v5}, Lcom/zykj/base/ext/BindingAdaptersKt;->visibleOrGone(Landroid/view/View;Ljava/lang/Boolean;)V

    .line 510
    .line 511
    .line 512
    :cond_1f
    if-eqz v16, :cond_20

    .line 513
    .line 514
    iget-object v0, v1, Lcom/zykj/study/databinding/FragmentEditCourseBinding;->svCatalog:Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;

    .line 515
    .line 516
    invoke-static {v0, v4}, Le5/c;->j(Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;Ljava/lang/String;)V

    .line 517
    .line 518
    .line 519
    :cond_20
    and-long v2, v2, v30

    .line 520
    .line 521
    cmp-long v0, v2, v22

    .line 522
    .line 523
    if-eqz v0, :cond_21

    .line 524
    .line 525
    iget-object v0, v1, Lcom/zykj/study/databinding/FragmentEditCourseBinding;->svPublic:Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;

    .line 526
    .line 527
    invoke-static {v0, v12}, Le5/c;->c(Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;Z)V

    .line 528
    .line 529
    .line 530
    :cond_21
    iget-object v0, v1, Lcom/zykj/study/databinding/FragmentEditCourseBindingImpl;->mboundView0:Lcom/zykj/study/databinding/LayoutBindViewModelBinding;

    .line 531
    .line 532
    invoke-static {v0}, Landroidx/databinding/ViewDataBinding;->executeBindingsOn(Landroidx/databinding/ViewDataBinding;)V

    .line 533
    .line 534
    .line 535
    return-void

    .line 536
    :catchall_0
    move-exception v0

    .line 537
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 538
    throw v0
.end method

.method public hasPendingBindings()Z
    .locals 4

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-wide v0, p0, Lcom/zykj/study/databinding/FragmentEditCourseBindingImpl;->mDirtyFlags:J

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
    iget-object v0, p0, Lcom/zykj/study/databinding/FragmentEditCourseBindingImpl;->mboundView0:Lcom/zykj/study/databinding/LayoutBindViewModelBinding;

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
    const-wide/16 v0, 0x800

    .line 3
    .line 4
    :try_start_0
    iput-wide v0, p0, Lcom/zykj/study/databinding/FragmentEditCourseBindingImpl;->mDirtyFlags:J

    .line 5
    .line 6
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 7
    iget-object v0, p0, Lcom/zykj/study/databinding/FragmentEditCourseBindingImpl;->mboundView0:Lcom/zykj/study/databinding/LayoutBindViewModelBinding;

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
    packed-switch p1, :pswitch_data_0

    .line 2
    .line 3
    .line 4
    const/4 p1, 0x0

    .line 5
    return p1

    .line 6
    :pswitch_0
    check-cast p2, Landroidx/lifecycle/MutableLiveData;

    .line 7
    .line 8
    invoke-direct {p0, p2, p3}, Lcom/zykj/study/databinding/FragmentEditCourseBindingImpl;->onChangeEditCourseViewModelPeriodId(Landroidx/lifecycle/MutableLiveData;I)Z

    .line 9
    .line 10
    .line 11
    move-result p1

    .line 12
    return p1

    .line 13
    :pswitch_1
    check-cast p2, Lcom/kunminx/architecture/ui/callback/UnPeekLiveData;

    .line 14
    .line 15
    invoke-direct {p0, p2, p3}, Lcom/zykj/study/databinding/FragmentEditCourseBindingImpl;->onChangeEditCourseViewModelIsDialogVisible(Lcom/kunminx/architecture/ui/callback/UnPeekLiveData;I)Z

    .line 16
    .line 17
    .line 18
    move-result p1

    .line 19
    return p1

    .line 20
    :pswitch_2
    check-cast p2, Landroidx/lifecycle/MutableLiveData;

    .line 21
    .line 22
    invoke-direct {p0, p2, p3}, Lcom/zykj/study/databinding/FragmentEditCourseBindingImpl;->onChangeEditCourseViewModelTitle(Landroidx/lifecycle/MutableLiveData;I)Z

    .line 23
    .line 24
    .line 25
    move-result p1

    .line 26
    return p1

    .line 27
    :pswitch_3
    check-cast p2, Landroidx/lifecycle/MutableLiveData;

    .line 28
    .line 29
    invoke-direct {p0, p2, p3}, Lcom/zykj/study/databinding/FragmentEditCourseBindingImpl;->onChangeEditCourseViewModelGradeId(Landroidx/lifecycle/MutableLiveData;I)Z

    .line 30
    .line 31
    .line 32
    move-result p1

    .line 33
    return p1

    .line 34
    :pswitch_4
    check-cast p2, Landroidx/lifecycle/MutableLiveData;

    .line 35
    .line 36
    invoke-direct {p0, p2, p3}, Lcom/zykj/study/databinding/FragmentEditCourseBindingImpl;->onChangeEditCourseViewModelIsPublic(Landroidx/lifecycle/MutableLiveData;I)Z

    .line 37
    .line 38
    .line 39
    move-result p1

    .line 40
    return p1

    .line 41
    :pswitch_5
    check-cast p2, Lcom/kunminx/architecture/ui/callback/UnPeekLiveData;

    .line 42
    .line 43
    invoke-direct {p0, p2, p3}, Lcom/zykj/study/databinding/FragmentEditCourseBindingImpl;->onChangeEditCourseViewModelToastLiveData(Lcom/kunminx/architecture/ui/callback/UnPeekLiveData;I)Z

    .line 44
    .line 45
    .line 46
    move-result p1

    .line 47
    return p1

    .line 48
    :pswitch_6
    check-cast p2, Landroidx/lifecycle/MutableLiveData;

    .line 49
    .line 50
    invoke-direct {p0, p2, p3}, Lcom/zykj/study/databinding/FragmentEditCourseBindingImpl;->onChangeEditCourseViewModelSubjectId(Landroidx/lifecycle/MutableLiveData;I)Z

    .line 51
    .line 52
    .line 53
    move-result p1

    .line 54
    return p1

    .line 55
    :pswitch_7
    check-cast p2, Landroidx/databinding/ObservableBoolean;

    .line 56
    .line 57
    invoke-direct {p0, p2, p3}, Lcom/zykj/study/databinding/FragmentEditCourseBindingImpl;->onChangeEditCourseViewModelIsSystemCover(Landroidx/databinding/ObservableBoolean;I)Z

    .line 58
    .line 59
    .line 60
    move-result p1

    .line 61
    return p1

    .line 62
    :pswitch_8
    check-cast p2, Landroidx/lifecycle/MutableLiveData;

    .line 63
    .line 64
    invoke-direct {p0, p2, p3}, Lcom/zykj/study/databinding/FragmentEditCourseBindingImpl;->onChangeEditCourseViewModelLocalCover(Landroidx/lifecycle/MutableLiveData;I)Z

    .line 65
    .line 66
    .line 67
    move-result p1

    .line 68
    return p1

    .line 69
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public setDictViewModel(Lcom/zykj/study/viewmodels/DictViewModel;)V
    .locals 4
    .param p1    # Lcom/zykj/study/viewmodels/DictViewModel;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param

    .line 1
    iput-object p1, p0, Lcom/zykj/study/databinding/FragmentEditCourseBinding;->mDictViewModel:Lcom/zykj/study/viewmodels/DictViewModel;

    .line 2
    .line 3
    monitor-enter p0

    .line 4
    :try_start_0
    iget-wide v0, p0, Lcom/zykj/study/databinding/FragmentEditCourseBindingImpl;->mDirtyFlags:J

    .line 5
    .line 6
    const-wide/16 v2, 0x400

    .line 7
    .line 8
    or-long/2addr v0, v2

    .line 9
    iput-wide v0, p0, Lcom/zykj/study/databinding/FragmentEditCourseBindingImpl;->mDirtyFlags:J

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

.method public setEditCourseViewModel(Lcom/zykj/study/viewmodels/EditCourseViewModel;)V
    .locals 4
    .param p1    # Lcom/zykj/study/viewmodels/EditCourseViewModel;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param

    .line 1
    iput-object p1, p0, Lcom/zykj/study/databinding/FragmentEditCourseBinding;->mEditCourseViewModel:Lcom/zykj/study/viewmodels/EditCourseViewModel;

    .line 2
    .line 3
    monitor-enter p0

    .line 4
    :try_start_0
    iget-wide v0, p0, Lcom/zykj/study/databinding/FragmentEditCourseBindingImpl;->mDirtyFlags:J

    .line 5
    .line 6
    const-wide/16 v2, 0x200

    .line 7
    .line 8
    or-long/2addr v0, v2

    .line 9
    iput-wide v0, p0, Lcom/zykj/study/databinding/FragmentEditCourseBindingImpl;->mDirtyFlags:J

    .line 10
    .line 11
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 12
    const/16 p1, 0xc

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
    iget-object v0, p0, Lcom/zykj/study/databinding/FragmentEditCourseBindingImpl;->mboundView0:Lcom/zykj/study/databinding/LayoutBindViewModelBinding;

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
    const/16 v0, 0xc

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    if-ne v0, p1, :cond_0

    .line 5
    .line 6
    check-cast p2, Lcom/zykj/study/viewmodels/EditCourseViewModel;

    .line 7
    .line 8
    invoke-virtual {p0, p2}, Lcom/zykj/study/databinding/FragmentEditCourseBindingImpl;->setEditCourseViewModel(Lcom/zykj/study/viewmodels/EditCourseViewModel;)V

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
    invoke-virtual {p0, p2}, Lcom/zykj/study/databinding/FragmentEditCourseBindingImpl;->setDictViewModel(Lcom/zykj/study/viewmodels/DictViewModel;)V

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
