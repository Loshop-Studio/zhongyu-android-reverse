.class public Lcom/zykj/study/databinding/LayoutExerciseAnswerViewerBindingImpl;
.super Lcom/zykj/study/databinding/LayoutExerciseAnswerViewerBinding;
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
.field private final mCallback1:Landroid/view/View$OnClickListener;
    .annotation build Landroidx/annotation/Nullable;
    .end annotation
.end field

.field private final mCallback2:Landroid/view/View$OnClickListener;
    .annotation build Landroidx/annotation/Nullable;
    .end annotation
.end field

.field private mDirtyFlags:J

.field private final mboundView0:Landroid/widget/LinearLayout;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field private final mboundView1:Landroidx/core/widget/NestedScrollView;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field private final mboundView2:Lcom/xuexiang/xui/widget/button/roundbutton/RoundButton;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field private final mboundView3:Lcom/xuexiang/xui/widget/button/roundbutton/RoundButton;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field private final mboundView4:Lcom/xuexiang/xui/widget/button/roundbutton/RoundButton;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field private final mboundView5:Lcom/xuexiang/xui/widget/button/roundbutton/RoundButton;
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
    sput-object v0, Lcom/zykj/study/databinding/LayoutExerciseAnswerViewerBindingImpl;->sIncludes:Landroidx/databinding/ViewDataBinding$IncludedLayouts;

    .line 8
    .line 9
    const-string v1, "view_micro"

    .line 10
    .line 11
    filled-new-array {v1}, [Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    const/4 v2, 0x6

    .line 16
    filled-new-array {v2}, [I

    .line 17
    .line 18
    .line 19
    move-result-object v2

    .line 20
    sget v3, Lcom/zykj/study/R$layout;->view_micro:I

    .line 21
    .line 22
    filled-new-array {v3}, [I

    .line 23
    .line 24
    .line 25
    move-result-object v3

    .line 26
    const/4 v4, 0x1

    .line 27
    invoke-virtual {v0, v4, v1, v2, v3}, Landroidx/databinding/ViewDataBinding$IncludedLayouts;->setIncludes(I[Ljava/lang/String;[I[I)V

    .line 28
    .line 29
    .line 30
    const/4 v0, 0x0

    .line 31
    sput-object v0, Lcom/zykj/study/databinding/LayoutExerciseAnswerViewerBindingImpl;->sViewsWithIds:Landroid/util/SparseIntArray;

    .line 32
    .line 33
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
    sget-object v0, Lcom/zykj/study/databinding/LayoutExerciseAnswerViewerBindingImpl;->sIncludes:Landroidx/databinding/ViewDataBinding$IncludedLayouts;

    sget-object v1, Lcom/zykj/study/databinding/LayoutExerciseAnswerViewerBindingImpl;->sViewsWithIds:Landroid/util/SparseIntArray;

    const/4 v2, 0x7

    invoke-static {p1, p2, v2, v0, v1}, Landroidx/databinding/ViewDataBinding;->mapBindings(Landroidx/databinding/DataBindingComponent;Landroid/view/View;ILandroidx/databinding/ViewDataBinding$IncludedLayouts;Landroid/util/SparseIntArray;)[Ljava/lang/Object;

    move-result-object v0

    invoke-direct {p0, p1, p2, v0}, Lcom/zykj/study/databinding/LayoutExerciseAnswerViewerBindingImpl;-><init>(Landroidx/databinding/DataBindingComponent;Landroid/view/View;[Ljava/lang/Object;)V

    return-void
.end method

.method private constructor <init>(Landroidx/databinding/DataBindingComponent;Landroid/view/View;[Ljava/lang/Object;)V
    .locals 4

    const/4 v0, 0x6

    .line 2
    aget-object v0, p3, v0

    check-cast v0, Lcom/zykj/study/databinding/ViewMicroBinding;

    const/4 v1, 0x2

    invoke-direct {p0, p1, p2, v1, v0}, Lcom/zykj/study/databinding/LayoutExerciseAnswerViewerBinding;-><init>(Ljava/lang/Object;Landroid/view/View;ILcom/zykj/study/databinding/ViewMicroBinding;)V

    const-wide/16 v2, -0x1

    .line 3
    iput-wide v2, p0, Lcom/zykj/study/databinding/LayoutExerciseAnswerViewerBindingImpl;->mDirtyFlags:J

    .line 4
    iget-object p1, p0, Lcom/zykj/study/databinding/LayoutExerciseAnswerViewerBinding;->answerMicro:Lcom/zykj/study/databinding/ViewMicroBinding;

    invoke-virtual {p0, p1}, Landroidx/databinding/ViewDataBinding;->setContainedBinding(Landroidx/databinding/ViewDataBinding;)V

    const/4 p1, 0x0

    .line 5
    aget-object p1, p3, p1

    check-cast p1, Landroid/widget/LinearLayout;

    iput-object p1, p0, Lcom/zykj/study/databinding/LayoutExerciseAnswerViewerBindingImpl;->mboundView0:Landroid/widget/LinearLayout;

    const/4 v0, 0x0

    .line 6
    invoke-virtual {p1, v0}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    const/4 p1, 0x1

    .line 7
    aget-object v2, p3, p1

    check-cast v2, Landroidx/core/widget/NestedScrollView;

    iput-object v2, p0, Lcom/zykj/study/databinding/LayoutExerciseAnswerViewerBindingImpl;->mboundView1:Landroidx/core/widget/NestedScrollView;

    .line 8
    invoke-virtual {v2, v0}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 9
    aget-object v2, p3, v1

    check-cast v2, Lcom/xuexiang/xui/widget/button/roundbutton/RoundButton;

    iput-object v2, p0, Lcom/zykj/study/databinding/LayoutExerciseAnswerViewerBindingImpl;->mboundView2:Lcom/xuexiang/xui/widget/button/roundbutton/RoundButton;

    .line 10
    invoke-virtual {v2, v0}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    const/4 v2, 0x3

    .line 11
    aget-object v2, p3, v2

    check-cast v2, Lcom/xuexiang/xui/widget/button/roundbutton/RoundButton;

    iput-object v2, p0, Lcom/zykj/study/databinding/LayoutExerciseAnswerViewerBindingImpl;->mboundView3:Lcom/xuexiang/xui/widget/button/roundbutton/RoundButton;

    .line 12
    invoke-virtual {v2, v0}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    const/4 v2, 0x4

    .line 13
    aget-object v2, p3, v2

    check-cast v2, Lcom/xuexiang/xui/widget/button/roundbutton/RoundButton;

    iput-object v2, p0, Lcom/zykj/study/databinding/LayoutExerciseAnswerViewerBindingImpl;->mboundView4:Lcom/xuexiang/xui/widget/button/roundbutton/RoundButton;

    .line 14
    invoke-virtual {v2, v0}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    const/4 v2, 0x5

    .line 15
    aget-object p3, p3, v2

    check-cast p3, Lcom/xuexiang/xui/widget/button/roundbutton/RoundButton;

    iput-object p3, p0, Lcom/zykj/study/databinding/LayoutExerciseAnswerViewerBindingImpl;->mboundView5:Lcom/xuexiang/xui/widget/button/roundbutton/RoundButton;

    .line 16
    invoke-virtual {p3, v0}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 17
    invoke-virtual {p0, p2}, Landroidx/databinding/ViewDataBinding;->setRootTag(Landroid/view/View;)V

    .line 18
    new-instance p2, Lr4/a;

    invoke-direct {p2, p0, p1}, Lr4/a;-><init>(Lr4/a$a;I)V

    iput-object p2, p0, Lcom/zykj/study/databinding/LayoutExerciseAnswerViewerBindingImpl;->mCallback1:Landroid/view/View$OnClickListener;

    .line 19
    new-instance p1, Lr4/a;

    invoke-direct {p1, p0, v1}, Lr4/a;-><init>(Lr4/a$a;I)V

    iput-object p1, p0, Lcom/zykj/study/databinding/LayoutExerciseAnswerViewerBindingImpl;->mCallback2:Landroid/view/View$OnClickListener;

    .line 20
    invoke-virtual {p0}, Lcom/zykj/study/databinding/LayoutExerciseAnswerViewerBindingImpl;->invalidateAll()V

    return-void
.end method

.method private onChangeAnswerMicro(Lcom/zykj/study/databinding/ViewMicroBinding;I)Z
    .locals 2

    .line 1
    if-nez p2, :cond_0

    .line 2
    .line 3
    monitor-enter p0

    .line 4
    :try_start_0
    iget-wide p1, p0, Lcom/zykj/study/databinding/LayoutExerciseAnswerViewerBindingImpl;->mDirtyFlags:J

    .line 5
    .line 6
    const-wide/16 v0, 0x1

    .line 7
    .line 8
    or-long/2addr p1, v0

    .line 9
    iput-wide p1, p0, Lcom/zykj/study/databinding/LayoutExerciseAnswerViewerBindingImpl;->mDirtyFlags:J

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

.method private onChangeEntityCurrentIndexLiveData(Landroidx/lifecycle/MutableLiveData;I)Z
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
    iget-wide p1, p0, Lcom/zykj/study/databinding/LayoutExerciseAnswerViewerBindingImpl;->mDirtyFlags:J

    .line 5
    .line 6
    const-wide/16 v0, 0x2

    .line 7
    .line 8
    or-long/2addr p1, v0

    .line 9
    iput-wide p1, p0, Lcom/zykj/study/databinding/LayoutExerciseAnswerViewerBindingImpl;->mDirtyFlags:J

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
    .locals 0

    .line 1
    const/4 p2, 0x1

    .line 2
    if-eq p1, p2, :cond_2

    .line 3
    .line 4
    const/4 p2, 0x2

    .line 5
    if-eq p1, p2, :cond_0

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    iget-object p1, p0, Lcom/zykj/study/databinding/LayoutExerciseAnswerViewerBinding;->mEntity:Lcom/zykj/study/viewmodels/ExerciseViewerViewModel;

    .line 9
    .line 10
    if-eqz p1, :cond_1

    .line 11
    .line 12
    invoke-virtual {p1}, Lcom/zykj/study/viewmodels/BaseExerciseViewModel;->k()V

    .line 13
    .line 14
    .line 15
    :cond_1
    return-void

    .line 16
    :cond_2
    iget-object p1, p0, Lcom/zykj/study/databinding/LayoutExerciseAnswerViewerBinding;->mEntity:Lcom/zykj/study/viewmodels/ExerciseViewerViewModel;

    .line 17
    .line 18
    if-eqz p1, :cond_3

    .line 19
    .line 20
    invoke-virtual {p1}, Lcom/zykj/study/viewmodels/BaseExerciseViewModel;->l()V

    .line 21
    .line 22
    .line 23
    :cond_3
    return-void
.end method

.method public executeBindings()V
    .locals 14

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-wide v0, p0, Lcom/zykj/study/databinding/LayoutExerciseAnswerViewerBindingImpl;->mDirtyFlags:J

    .line 3
    .line 4
    const-wide/16 v2, 0x0

    .line 5
    .line 6
    iput-wide v2, p0, Lcom/zykj/study/databinding/LayoutExerciseAnswerViewerBindingImpl;->mDirtyFlags:J

    .line 7
    .line 8
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 9
    iget-object v4, p0, Lcom/zykj/study/databinding/LayoutExerciseAnswerViewerBinding;->mEntity:Lcom/zykj/study/viewmodels/ExerciseViewerViewModel;

    .line 10
    .line 11
    const-wide/16 v5, 0xe

    .line 12
    .line 13
    and-long v7, v0, v5

    .line 14
    .line 15
    cmp-long v7, v7, v2

    .line 16
    .line 17
    const/4 v8, 0x0

    .line 18
    if-eqz v7, :cond_4

    .line 19
    .line 20
    const/4 v9, 0x0

    .line 21
    if-eqz v4, :cond_0

    .line 22
    .line 23
    invoke-virtual {v4}, Lcom/zykj/study/viewmodels/BaseExerciseViewModel;->e()Landroidx/lifecycle/MutableLiveData;

    .line 24
    .line 25
    .line 26
    move-result-object v10

    .line 27
    goto :goto_0

    .line 28
    :cond_0
    move-object v10, v9

    .line 29
    :goto_0
    const/4 v11, 0x1

    .line 30
    invoke-virtual {p0, v11, v10}, Landroidx/databinding/ViewDataBinding;->updateLiveDataRegistration(ILandroidx/lifecycle/LiveData;)Z

    .line 31
    .line 32
    .line 33
    if-eqz v10, :cond_1

    .line 34
    .line 35
    invoke-virtual {v10}, Landroidx/lifecycle/LiveData;->getValue()Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object v9

    .line 39
    check-cast v9, Ljava/lang/Integer;

    .line 40
    .line 41
    :cond_1
    if-eqz v9, :cond_2

    .line 42
    .line 43
    goto :goto_1

    .line 44
    :cond_2
    move v11, v8

    .line 45
    :goto_1
    if-eqz v7, :cond_5

    .line 46
    .line 47
    if-eqz v11, :cond_3

    .line 48
    .line 49
    const-wide/16 v9, 0xaa0

    .line 50
    .line 51
    :goto_2
    or-long/2addr v0, v9

    .line 52
    goto :goto_3

    .line 53
    :cond_3
    const-wide/16 v9, 0x550

    .line 54
    .line 55
    goto :goto_2

    .line 56
    :cond_4
    move v11, v8

    .line 57
    :cond_5
    :goto_3
    const-wide/16 v9, 0x220

    .line 58
    .line 59
    and-long/2addr v9, v0

    .line 60
    cmp-long v7, v9, v2

    .line 61
    .line 62
    if-eqz v7, :cond_8

    .line 63
    .line 64
    if-eqz v4, :cond_6

    .line 65
    .line 66
    invoke-virtual {v4}, Lcom/zykj/study/viewmodels/BaseExerciseViewModel;->n()Z

    .line 67
    .line 68
    .line 69
    move-result v7

    .line 70
    goto :goto_4

    .line 71
    :cond_6
    move v7, v8

    .line 72
    :goto_4
    const-wide/16 v9, 0x20

    .line 73
    .line 74
    and-long/2addr v9, v0

    .line 75
    cmp-long v9, v9, v2

    .line 76
    .line 77
    if-eqz v9, :cond_7

    .line 78
    .line 79
    xor-int/lit8 v9, v7, 0x1

    .line 80
    .line 81
    goto :goto_5

    .line 82
    :cond_7
    move v9, v8

    .line 83
    goto :goto_5

    .line 84
    :cond_8
    move v7, v8

    .line 85
    move v9, v7

    .line 86
    :goto_5
    const-wide/16 v12, 0x880

    .line 87
    .line 88
    and-long/2addr v12, v0

    .line 89
    cmp-long v10, v12, v2

    .line 90
    .line 91
    if-eqz v10, :cond_b

    .line 92
    .line 93
    if-eqz v4, :cond_9

    .line 94
    .line 95
    invoke-virtual {v4}, Lcom/zykj/study/viewmodels/BaseExerciseViewModel;->o()Z

    .line 96
    .line 97
    .line 98
    move-result v4

    .line 99
    goto :goto_6

    .line 100
    :cond_9
    move v4, v8

    .line 101
    :goto_6
    const-wide/16 v12, 0x80

    .line 102
    .line 103
    and-long/2addr v12, v0

    .line 104
    cmp-long v10, v12, v2

    .line 105
    .line 106
    if-eqz v10, :cond_a

    .line 107
    .line 108
    xor-int/lit8 v10, v4, 0x1

    .line 109
    .line 110
    goto :goto_7

    .line 111
    :cond_a
    move v10, v8

    .line 112
    goto :goto_7

    .line 113
    :cond_b
    move v4, v8

    .line 114
    move v10, v4

    .line 115
    :goto_7
    and-long/2addr v5, v0

    .line 116
    cmp-long v5, v5, v2

    .line 117
    .line 118
    if-eqz v5, :cond_10

    .line 119
    .line 120
    if-eqz v11, :cond_c

    .line 121
    .line 122
    goto :goto_8

    .line 123
    :cond_c
    move v9, v8

    .line 124
    :goto_8
    if-eqz v11, :cond_d

    .line 125
    .line 126
    goto :goto_9

    .line 127
    :cond_d
    move v10, v8

    .line 128
    :goto_9
    if-eqz v11, :cond_e

    .line 129
    .line 130
    goto :goto_a

    .line 131
    :cond_e
    move v7, v8

    .line 132
    :goto_a
    if-eqz v11, :cond_f

    .line 133
    .line 134
    move v8, v4

    .line 135
    :cond_f
    move v4, v8

    .line 136
    move v8, v7

    .line 137
    goto :goto_b

    .line 138
    :cond_10
    move v4, v8

    .line 139
    move v9, v4

    .line 140
    move v10, v9

    .line 141
    :goto_b
    if-eqz v5, :cond_11

    .line 142
    .line 143
    iget-object v5, p0, Lcom/zykj/study/databinding/LayoutExerciseAnswerViewerBindingImpl;->mboundView2:Lcom/xuexiang/xui/widget/button/roundbutton/RoundButton;

    .line 144
    .line 145
    invoke-static {v8}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 146
    .line 147
    .line 148
    move-result-object v6

    .line 149
    invoke-static {v5, v6}, Lcom/zykj/base/ext/BindingAdaptersKt;->visibleOrGone(Landroid/view/View;Ljava/lang/Boolean;)V

    .line 150
    .line 151
    .line 152
    iget-object v5, p0, Lcom/zykj/study/databinding/LayoutExerciseAnswerViewerBindingImpl;->mboundView3:Lcom/xuexiang/xui/widget/button/roundbutton/RoundButton;

    .line 153
    .line 154
    invoke-static {v9}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 155
    .line 156
    .line 157
    move-result-object v6

    .line 158
    invoke-static {v5, v6}, Lcom/zykj/base/ext/BindingAdaptersKt;->visibleOrGone(Landroid/view/View;Ljava/lang/Boolean;)V

    .line 159
    .line 160
    .line 161
    iget-object v5, p0, Lcom/zykj/study/databinding/LayoutExerciseAnswerViewerBindingImpl;->mboundView4:Lcom/xuexiang/xui/widget/button/roundbutton/RoundButton;

    .line 162
    .line 163
    invoke-static {v10}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 164
    .line 165
    .line 166
    move-result-object v6

    .line 167
    invoke-static {v5, v6}, Lcom/zykj/base/ext/BindingAdaptersKt;->visibleOrGone(Landroid/view/View;Ljava/lang/Boolean;)V

    .line 168
    .line 169
    .line 170
    iget-object v5, p0, Lcom/zykj/study/databinding/LayoutExerciseAnswerViewerBindingImpl;->mboundView5:Lcom/xuexiang/xui/widget/button/roundbutton/RoundButton;

    .line 171
    .line 172
    invoke-static {v4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 173
    .line 174
    .line 175
    move-result-object v4

    .line 176
    invoke-static {v5, v4}, Lcom/zykj/base/ext/BindingAdaptersKt;->visibleOrGone(Landroid/view/View;Ljava/lang/Boolean;)V

    .line 177
    .line 178
    .line 179
    :cond_11
    const-wide/16 v4, 0x8

    .line 180
    .line 181
    and-long/2addr v0, v4

    .line 182
    cmp-long v0, v0, v2

    .line 183
    .line 184
    if-eqz v0, :cond_12

    .line 185
    .line 186
    iget-object v0, p0, Lcom/zykj/study/databinding/LayoutExerciseAnswerViewerBindingImpl;->mboundView3:Lcom/xuexiang/xui/widget/button/roundbutton/RoundButton;

    .line 187
    .line 188
    iget-object v1, p0, Lcom/zykj/study/databinding/LayoutExerciseAnswerViewerBindingImpl;->mCallback1:Landroid/view/View$OnClickListener;

    .line 189
    .line 190
    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 191
    .line 192
    .line 193
    iget-object v0, p0, Lcom/zykj/study/databinding/LayoutExerciseAnswerViewerBindingImpl;->mboundView4:Lcom/xuexiang/xui/widget/button/roundbutton/RoundButton;

    .line 194
    .line 195
    iget-object v1, p0, Lcom/zykj/study/databinding/LayoutExerciseAnswerViewerBindingImpl;->mCallback2:Landroid/view/View$OnClickListener;

    .line 196
    .line 197
    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 198
    .line 199
    .line 200
    :cond_12
    iget-object v0, p0, Lcom/zykj/study/databinding/LayoutExerciseAnswerViewerBinding;->answerMicro:Lcom/zykj/study/databinding/ViewMicroBinding;

    .line 201
    .line 202
    invoke-static {v0}, Landroidx/databinding/ViewDataBinding;->executeBindingsOn(Landroidx/databinding/ViewDataBinding;)V

    .line 203
    .line 204
    .line 205
    return-void

    .line 206
    :catchall_0
    move-exception v0

    .line 207
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 208
    throw v0
.end method

.method public hasPendingBindings()Z
    .locals 4

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-wide v0, p0, Lcom/zykj/study/databinding/LayoutExerciseAnswerViewerBindingImpl;->mDirtyFlags:J

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
    iget-object v0, p0, Lcom/zykj/study/databinding/LayoutExerciseAnswerViewerBinding;->answerMicro:Lcom/zykj/study/databinding/ViewMicroBinding;

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
    const-wide/16 v0, 0x8

    .line 3
    .line 4
    :try_start_0
    iput-wide v0, p0, Lcom/zykj/study/databinding/LayoutExerciseAnswerViewerBindingImpl;->mDirtyFlags:J

    .line 5
    .line 6
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 7
    iget-object v0, p0, Lcom/zykj/study/databinding/LayoutExerciseAnswerViewerBinding;->answerMicro:Lcom/zykj/study/databinding/ViewMicroBinding;

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
    check-cast p2, Landroidx/lifecycle/MutableLiveData;

    .line 9
    .line 10
    invoke-direct {p0, p2, p3}, Lcom/zykj/study/databinding/LayoutExerciseAnswerViewerBindingImpl;->onChangeEntityCurrentIndexLiveData(Landroidx/lifecycle/MutableLiveData;I)Z

    .line 11
    .line 12
    .line 13
    move-result p1

    .line 14
    return p1

    .line 15
    :cond_1
    check-cast p2, Lcom/zykj/study/databinding/ViewMicroBinding;

    .line 16
    .line 17
    invoke-direct {p0, p2, p3}, Lcom/zykj/study/databinding/LayoutExerciseAnswerViewerBindingImpl;->onChangeAnswerMicro(Lcom/zykj/study/databinding/ViewMicroBinding;I)Z

    .line 18
    .line 19
    .line 20
    move-result p1

    .line 21
    return p1
.end method

.method public setEntity(Lcom/zykj/study/viewmodels/ExerciseViewerViewModel;)V
    .locals 4
    .param p1    # Lcom/zykj/study/viewmodels/ExerciseViewerViewModel;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param

    .line 1
    iput-object p1, p0, Lcom/zykj/study/databinding/LayoutExerciseAnswerViewerBinding;->mEntity:Lcom/zykj/study/viewmodels/ExerciseViewerViewModel;

    .line 2
    .line 3
    monitor-enter p0

    .line 4
    :try_start_0
    iget-wide v0, p0, Lcom/zykj/study/databinding/LayoutExerciseAnswerViewerBindingImpl;->mDirtyFlags:J

    .line 5
    .line 6
    const-wide/16 v2, 0x4

    .line 7
    .line 8
    or-long/2addr v0, v2

    .line 9
    iput-wide v0, p0, Lcom/zykj/study/databinding/LayoutExerciseAnswerViewerBindingImpl;->mDirtyFlags:J

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
    iget-object v0, p0, Lcom/zykj/study/databinding/LayoutExerciseAnswerViewerBinding;->answerMicro:Lcom/zykj/study/databinding/ViewMicroBinding;

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
    const/16 v0, 0xf

    .line 2
    .line 3
    if-ne v0, p1, :cond_0

    .line 4
    .line 5
    check-cast p2, Lcom/zykj/study/viewmodels/ExerciseViewerViewModel;

    .line 6
    .line 7
    invoke-virtual {p0, p2}, Lcom/zykj/study/databinding/LayoutExerciseAnswerViewerBindingImpl;->setEntity(Lcom/zykj/study/viewmodels/ExerciseViewerViewModel;)V

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
