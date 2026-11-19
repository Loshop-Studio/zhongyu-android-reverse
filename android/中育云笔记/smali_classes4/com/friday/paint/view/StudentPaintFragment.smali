.class public final Lcom/friday/paint/view/StudentPaintFragment;
.super Lcom/friday/paint/view/Hilt_StudentPaintFragment;
.source "SourceFile"


# annotations
.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x0
.end annotation


# instance fields
.field public final r:Lqc/d;

.field public final s:Lqc/d;

.field public t:J

.field public u:I

.field public v:Z

.field public w:Lkotlinx/coroutines/g;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 5

    .line 1
    invoke-direct {p0}, Lcom/friday/paint/view/Hilt_StudentPaintFragment;-><init>()V

    .line 2
    .line 3
    .line 4
    const-class v0, Lcom/friday/paint/viewmodel/DoHomeworkViewModel;

    .line 5
    .line 6
    invoke-static {v0}, Lkotlin/jvm/internal/y;->b(Ljava/lang/Class;)Lod/c;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    new-instance v1, Lcom/friday/paint/view/StudentPaintFragment$special$$inlined$activityViewModels$default$1;

    .line 11
    .line 12
    invoke-direct {v1, p0}, Lcom/friday/paint/view/StudentPaintFragment$special$$inlined$activityViewModels$default$1;-><init>(Landroidx/fragment/app/Fragment;)V

    .line 13
    .line 14
    .line 15
    new-instance v2, Lcom/friday/paint/view/StudentPaintFragment$special$$inlined$activityViewModels$default$2;

    .line 16
    .line 17
    const/4 v3, 0x0

    .line 18
    invoke-direct {v2, v3, p0}, Lcom/friday/paint/view/StudentPaintFragment$special$$inlined$activityViewModels$default$2;-><init>(Lhd/a;Landroidx/fragment/app/Fragment;)V

    .line 19
    .line 20
    .line 21
    new-instance v4, Lcom/friday/paint/view/StudentPaintFragment$special$$inlined$activityViewModels$default$3;

    .line 22
    .line 23
    invoke-direct {v4, p0}, Lcom/friday/paint/view/StudentPaintFragment$special$$inlined$activityViewModels$default$3;-><init>(Landroidx/fragment/app/Fragment;)V

    .line 24
    .line 25
    .line 26
    invoke-static {p0, v0, v1, v2, v4}, Landroidx/fragment/app/FragmentViewModelLazyKt;->createViewModelLazy(Landroidx/fragment/app/Fragment;Lod/c;Lhd/a;Lhd/a;Lhd/a;)Lqc/d;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    iput-object v0, p0, Lcom/friday/paint/view/StudentPaintFragment;->r:Lqc/d;

    .line 31
    .line 32
    const-class v0, Lcom/friday/paint/viewmodel/NoteViewModel;

    .line 33
    .line 34
    invoke-static {v0}, Lkotlin/jvm/internal/y;->b(Ljava/lang/Class;)Lod/c;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    new-instance v1, Lcom/friday/paint/view/StudentPaintFragment$special$$inlined$activityViewModels$default$4;

    .line 39
    .line 40
    invoke-direct {v1, p0}, Lcom/friday/paint/view/StudentPaintFragment$special$$inlined$activityViewModels$default$4;-><init>(Landroidx/fragment/app/Fragment;)V

    .line 41
    .line 42
    .line 43
    new-instance v2, Lcom/friday/paint/view/StudentPaintFragment$special$$inlined$activityViewModels$default$5;

    .line 44
    .line 45
    invoke-direct {v2, v3, p0}, Lcom/friday/paint/view/StudentPaintFragment$special$$inlined$activityViewModels$default$5;-><init>(Lhd/a;Landroidx/fragment/app/Fragment;)V

    .line 46
    .line 47
    .line 48
    new-instance v3, Lcom/friday/paint/view/StudentPaintFragment$special$$inlined$activityViewModels$default$6;

    .line 49
    .line 50
    invoke-direct {v3, p0}, Lcom/friday/paint/view/StudentPaintFragment$special$$inlined$activityViewModels$default$6;-><init>(Landroidx/fragment/app/Fragment;)V

    .line 51
    .line 52
    .line 53
    invoke-static {p0, v0, v1, v2, v3}, Landroidx/fragment/app/FragmentViewModelLazyKt;->createViewModelLazy(Landroidx/fragment/app/Fragment;Lod/c;Lhd/a;Lhd/a;Lhd/a;)Lqc/d;

    .line 54
    .line 55
    .line 56
    move-result-object v0

    .line 57
    iput-object v0, p0, Lcom/friday/paint/view/StudentPaintFragment;->s:Lqc/d;

    .line 58
    .line 59
    return-void
.end method

.method public static final A1(Lcom/friday/paint/view/StudentPaintFragment;Lcom/friday/paint/dialog/HomeworkSubmitConfirmDialog;)Lqc/q;
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/friday/paint/view/StudentPaintFragment;->submitSubjectiveHomework()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1}, Landroidx/fragment/app/DialogFragment;->dismissAllowingStateLoss()V

    .line 5
    .line 6
    .line 7
    sget-object p0, Lqc/q;->a:Lqc/q;

    .line 8
    .line 9
    return-object p0
.end method

.method public static final B1(Lcom/friday/paint/view/StudentPaintFragment;Ljava/lang/String;)V
    .locals 2

    .line 1
    const-string v0, "TIME_UP"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/16 v1, 0x8

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    invoke-virtual {p0}, Lcom/friday/common/base/BaseFragment;->getMBinding()Landroidx/databinding/ViewDataBinding;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    check-cast p1, Lcom/friday/paint/databinding/FragmentThePaintBinding;

    .line 16
    .line 17
    iget-object p1, p1, Lcom/friday/paint/databinding/FragmentThePaintBinding;->w:Landroid/widget/ImageView;

    .line 18
    .line 19
    invoke-virtual {p1, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 20
    .line 21
    .line 22
    invoke-virtual {p0}, Lcom/friday/paint/view/StudentPaintFragment;->getViewModel()Lcom/friday/paint/viewmodel/DoHomeworkViewModel;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    invoke-virtual {p0}, Lcom/friday/paint/viewmodel/DoHomeworkViewModel;->j()Landroidx/lifecycle/MutableLiveData;

    .line 27
    .line 28
    .line 29
    move-result-object p0

    .line 30
    sget-object p1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 31
    .line 32
    invoke-virtual {p0, p1}, Landroidx/lifecycle/MutableLiveData;->setValue(Ljava/lang/Object;)V

    .line 33
    .line 34
    .line 35
    return-void

    .line 36
    :cond_0
    const-string v0, "END_CLASS"

    .line 37
    .line 38
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 39
    .line 40
    .line 41
    move-result p1

    .line 42
    if-eqz p1, :cond_1

    .line 43
    .line 44
    invoke-static {}, Lcom/blankj/utilcode/util/CacheMemoryUtils;->getInstance()Lcom/blankj/utilcode/util/CacheMemoryUtils;

    .line 45
    .line 46
    .line 47
    move-result-object p1

    .line 48
    const-string v0, "answer_cache"

    .line 49
    .line 50
    invoke-virtual {p1, v0}, Lcom/blankj/utilcode/util/CacheMemoryUtils;->remove(Ljava/lang/String;)Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    invoke-virtual {p0}, Lcom/friday/common/base/BaseFragment;->getMBinding()Landroidx/databinding/ViewDataBinding;

    .line 54
    .line 55
    .line 56
    move-result-object p1

    .line 57
    check-cast p1, Lcom/friday/paint/databinding/FragmentThePaintBinding;

    .line 58
    .line 59
    iget-object p1, p1, Lcom/friday/paint/databinding/FragmentThePaintBinding;->w:Landroid/widget/ImageView;

    .line 60
    .line 61
    invoke-virtual {p1, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 62
    .line 63
    .line 64
    invoke-virtual {p0}, Lcom/friday/common/base/BaseFragment;->getMBinding()Landroidx/databinding/ViewDataBinding;

    .line 65
    .line 66
    .line 67
    move-result-object p1

    .line 68
    check-cast p1, Lcom/friday/paint/databinding/FragmentThePaintBinding;

    .line 69
    .line 70
    iget-object p1, p1, Lcom/friday/paint/databinding/FragmentThePaintBinding;->f:Landroid/widget/ImageView;

    .line 71
    .line 72
    invoke-virtual {p1, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 73
    .line 74
    .line 75
    invoke-virtual {p0}, Lcom/friday/paint/view/StudentPaintFragment;->getViewModel()Lcom/friday/paint/viewmodel/DoHomeworkViewModel;

    .line 76
    .line 77
    .line 78
    move-result-object p1

    .line 79
    const/4 v0, 0x1

    .line 80
    invoke-virtual {p1, v0}, Lcom/friday/paint/viewmodel/DoHomeworkViewModel;->t(Z)V

    .line 81
    .line 82
    .line 83
    :try_start_0
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getChildFragmentManager()Landroidx/fragment/app/FragmentManager;

    .line 84
    .line 85
    .line 86
    move-result-object p0

    .line 87
    const-class p1, Lcom/friday/paint/dialog/ObjectiveHomeworkSubmitDialog;

    .line 88
    .line 89
    invoke-virtual {p1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 90
    .line 91
    .line 92
    move-result-object p1

    .line 93
    invoke-virtual {p0, p1}, Landroidx/fragment/app/FragmentManager;->findFragmentByTag(Ljava/lang/String;)Landroidx/fragment/app/Fragment;

    .line 94
    .line 95
    .line 96
    move-result-object p0

    .line 97
    const-string p1, "null cannot be cast to non-null type com.friday.paint.dialog.ObjectiveHomeworkSubmitDialog"

    .line 98
    .line 99
    invoke-static {p0, p1}, Lkotlin/jvm/internal/u;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 100
    .line 101
    .line 102
    check-cast p0, Lcom/friday/paint/dialog/ObjectiveHomeworkSubmitDialog;

    .line 103
    .line 104
    invoke-virtual {p0}, Landroidx/fragment/app/DialogFragment;->dismissAllowingStateLoss()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 105
    .line 106
    .line 107
    :catch_0
    :cond_1
    return-void
.end method

.method public static final C1(Lcom/friday/paint/view/StudentPaintFragment;Ljava/lang/String;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/friday/paint/view/StudentPaintFragment;->w:Lkotlinx/coroutines/g;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    const/4 v2, 0x0

    .line 7
    invoke-static {v0, v2, v1, v2}, Lkotlinx/coroutines/g$a;->a(Lkotlinx/coroutines/g;Ljava/util/concurrent/CancellationException;ILjava/lang/Object;)V

    .line 8
    .line 9
    .line 10
    :cond_0
    if-eqz p1, :cond_4

    .line 11
    .line 12
    invoke-virtual {p1}, Ljava/lang/String;->hashCode()I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    const/16 v2, 0x8

    .line 17
    .line 18
    sparse-switch v0, :sswitch_data_0

    .line 19
    .line 20
    .line 21
    goto/16 :goto_0

    .line 22
    .line 23
    :sswitch_0
    const-string v0, "ID_ERROR"

    .line 24
    .line 25
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 26
    .line 27
    .line 28
    move-result p1

    .line 29
    if-nez p1, :cond_1

    .line 30
    .line 31
    goto/16 :goto_0

    .line 32
    .line 33
    :cond_1
    invoke-virtual {p0}, Lcom/friday/common/base/BaseFragment;->getMBinding()Landroidx/databinding/ViewDataBinding;

    .line 34
    .line 35
    .line 36
    move-result-object p0

    .line 37
    check-cast p0, Lcom/friday/paint/databinding/FragmentThePaintBinding;

    .line 38
    .line 39
    iget-object p0, p0, Lcom/friday/paint/databinding/FragmentThePaintBinding;->w:Landroid/widget/ImageView;

    .line 40
    .line 41
    invoke-virtual {p0, v2}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 42
    .line 43
    .line 44
    const-string p0, "\u9898\u76ee\u4e0d\u4e00\u81f4\uff0c\u8bf7\u91cd\u65b0\u63a5\u6536\u968f\u5802\u6d4b\u7b54\u9898"

    .line 45
    .line 46
    invoke-static {p0}, Lz1/b;->i(Ljava/lang/CharSequence;)V

    .line 47
    .line 48
    .line 49
    return-void

    .line 50
    :sswitch_1
    const-string v0, "END_CLASS"

    .line 51
    .line 52
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 53
    .line 54
    .line 55
    move-result p1

    .line 56
    if-nez p1, :cond_2

    .line 57
    .line 58
    goto/16 :goto_0

    .line 59
    .line 60
    :cond_2
    invoke-static {}, Lcom/blankj/utilcode/util/CacheMemoryUtils;->getInstance()Lcom/blankj/utilcode/util/CacheMemoryUtils;

    .line 61
    .line 62
    .line 63
    move-result-object p1

    .line 64
    const-string v0, "answer_cache"

    .line 65
    .line 66
    invoke-virtual {p1, v0}, Lcom/blankj/utilcode/util/CacheMemoryUtils;->remove(Ljava/lang/String;)Ljava/lang/Object;

    .line 67
    .line 68
    .line 69
    invoke-virtual {p0}, Lcom/friday/common/base/BaseFragment;->getMBinding()Landroidx/databinding/ViewDataBinding;

    .line 70
    .line 71
    .line 72
    move-result-object p1

    .line 73
    check-cast p1, Lcom/friday/paint/databinding/FragmentThePaintBinding;

    .line 74
    .line 75
    iget-object p1, p1, Lcom/friday/paint/databinding/FragmentThePaintBinding;->w:Landroid/widget/ImageView;

    .line 76
    .line 77
    invoke-virtual {p1, v2}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 78
    .line 79
    .line 80
    invoke-virtual {p0}, Lcom/friday/common/base/BaseFragment;->getMBinding()Landroidx/databinding/ViewDataBinding;

    .line 81
    .line 82
    .line 83
    move-result-object p1

    .line 84
    check-cast p1, Lcom/friday/paint/databinding/FragmentThePaintBinding;

    .line 85
    .line 86
    iget-object p1, p1, Lcom/friday/paint/databinding/FragmentThePaintBinding;->f:Landroid/widget/ImageView;

    .line 87
    .line 88
    invoke-virtual {p1, v2}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 89
    .line 90
    .line 91
    invoke-virtual {p0}, Lcom/friday/paint/view/StudentPaintFragment;->getViewModel()Lcom/friday/paint/viewmodel/DoHomeworkViewModel;

    .line 92
    .line 93
    .line 94
    move-result-object p1

    .line 95
    invoke-virtual {p1, v1}, Lcom/friday/paint/viewmodel/DoHomeworkViewModel;->t(Z)V

    .line 96
    .line 97
    .line 98
    :try_start_0
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getChildFragmentManager()Landroidx/fragment/app/FragmentManager;

    .line 99
    .line 100
    .line 101
    move-result-object p0

    .line 102
    const-class p1, Lcom/friday/paint/dialog/ObjectiveHomeworkSubmitDialog;

    .line 103
    .line 104
    invoke-virtual {p1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 105
    .line 106
    .line 107
    move-result-object p1

    .line 108
    invoke-virtual {p0, p1}, Landroidx/fragment/app/FragmentManager;->findFragmentByTag(Ljava/lang/String;)Landroidx/fragment/app/Fragment;

    .line 109
    .line 110
    .line 111
    move-result-object p0

    .line 112
    const-string p1, "null cannot be cast to non-null type com.friday.paint.dialog.ObjectiveHomeworkSubmitDialog"

    .line 113
    .line 114
    invoke-static {p0, p1}, Lkotlin/jvm/internal/u;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 115
    .line 116
    .line 117
    check-cast p0, Lcom/friday/paint/dialog/ObjectiveHomeworkSubmitDialog;

    .line 118
    .line 119
    invoke-virtual {p0}, Landroidx/fragment/app/DialogFragment;->dismissAllowingStateLoss()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 120
    .line 121
    .line 122
    :catch_0
    const-string p0, "\u968f\u5802\u6d4b\u5df2\u7ed3\u675f"

    .line 123
    .line 124
    invoke-static {p0}, Lz1/b;->i(Ljava/lang/CharSequence;)V

    .line 125
    .line 126
    .line 127
    return-void

    .line 128
    :sswitch_2
    const-string v0, "TIME_UP"

    .line 129
    .line 130
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 131
    .line 132
    .line 133
    move-result p1

    .line 134
    if-nez p1, :cond_3

    .line 135
    .line 136
    goto :goto_0

    .line 137
    :cond_3
    invoke-virtual {p0}, Lcom/friday/common/base/BaseFragment;->getMBinding()Landroidx/databinding/ViewDataBinding;

    .line 138
    .line 139
    .line 140
    move-result-object p1

    .line 141
    check-cast p1, Lcom/friday/paint/databinding/FragmentThePaintBinding;

    .line 142
    .line 143
    iget-object p1, p1, Lcom/friday/paint/databinding/FragmentThePaintBinding;->w:Landroid/widget/ImageView;

    .line 144
    .line 145
    invoke-virtual {p1, v2}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 146
    .line 147
    .line 148
    invoke-virtual {p0}, Lcom/friday/paint/view/StudentPaintFragment;->getViewModel()Lcom/friday/paint/viewmodel/DoHomeworkViewModel;

    .line 149
    .line 150
    .line 151
    move-result-object p0

    .line 152
    invoke-virtual {p0}, Lcom/friday/paint/viewmodel/DoHomeworkViewModel;->j()Landroidx/lifecycle/MutableLiveData;

    .line 153
    .line 154
    .line 155
    move-result-object p0

    .line 156
    sget-object p1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 157
    .line 158
    invoke-virtual {p0, p1}, Landroidx/lifecycle/MutableLiveData;->setValue(Ljava/lang/Object;)V

    .line 159
    .line 160
    .line 161
    const-string p0, "\u7b54\u9898\u5df2\u622a\u6b62"

    .line 162
    .line 163
    invoke-static {p0}, Lz1/b;->i(Ljava/lang/CharSequence;)V

    .line 164
    .line 165
    .line 166
    return-void

    .line 167
    :sswitch_3
    const-string v0, "NORMAL"

    .line 168
    .line 169
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 170
    .line 171
    .line 172
    move-result p1

    .line 173
    if-eqz p1, :cond_4

    .line 174
    .line 175
    invoke-virtual {p0}, Lcom/friday/paint/view/StudentPaintFragment;->getViewModel()Lcom/friday/paint/viewmodel/DoHomeworkViewModel;

    .line 176
    .line 177
    .line 178
    move-result-object p1

    .line 179
    invoke-virtual {p1, v1}, Lcom/friday/paint/viewmodel/DoHomeworkViewModel;->v(Z)V

    .line 180
    .line 181
    .line 182
    const-string p1, "\u63d0\u4ea4\u7b54\u6848\u6210\u529f"

    .line 183
    .line 184
    invoke-static {p1}, Lz1/b;->i(Ljava/lang/CharSequence;)V

    .line 185
    .line 186
    .line 187
    invoke-virtual {p0}, Lcom/friday/common/base/BaseFragment;->getMBinding()Landroidx/databinding/ViewDataBinding;

    .line 188
    .line 189
    .line 190
    move-result-object p1

    .line 191
    check-cast p1, Lcom/friday/paint/databinding/FragmentThePaintBinding;

    .line 192
    .line 193
    iget-object p1, p1, Lcom/friday/paint/databinding/FragmentThePaintBinding;->w:Landroid/widget/ImageView;

    .line 194
    .line 195
    invoke-virtual {p1, v1}, Landroid/view/View;->setEnabled(Z)V

    .line 196
    .line 197
    .line 198
    invoke-virtual {p0}, Lcom/friday/common/base/BaseFragment;->getMBinding()Landroidx/databinding/ViewDataBinding;

    .line 199
    .line 200
    .line 201
    move-result-object p0

    .line 202
    check-cast p0, Lcom/friday/paint/databinding/FragmentThePaintBinding;

    .line 203
    .line 204
    iget-object p0, p0, Lcom/friday/paint/databinding/FragmentThePaintBinding;->w:Landroid/widget/ImageView;

    .line 205
    .line 206
    invoke-virtual {p0, v2}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 207
    .line 208
    .line 209
    :cond_4
    :goto_0
    return-void

    .line 210
    nop

    .line 211
    :sswitch_data_0
    .sparse-switch
        -0x76664f19 -> :sswitch_3
        -0x2384eab3 -> :sswitch_2
        0x502568d4 -> :sswitch_1
        0x526cc5c4 -> :sswitch_0
    .end sparse-switch
.end method

.method public static final D1(Lcom/friday/paint/view/StudentPaintFragment;Ljava/lang/String;)V
    .locals 5

    .line 1
    invoke-virtual {p0}, Lcom/friday/paint/view/StudentPaintFragment;->getViewModel()Lcom/friday/paint/viewmodel/DoHomeworkViewModel;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Lcom/friday/paint/viewmodel/DoHomeworkViewModel;->h()Ljava/util/ArrayList;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 10
    .line 11
    .line 12
    invoke-static {}, Lcom/blankj/utilcode/util/CacheMemoryUtils;->getInstance()Lcom/blankj/utilcode/util/CacheMemoryUtils;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    const-string v0, "answer_cache"

    .line 17
    .line 18
    invoke-virtual {p1, v0}, Lcom/blankj/utilcode/util/CacheMemoryUtils;->remove(Ljava/lang/String;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    const-string p1, "\u968f\u5802\u6d4b\u5df2\u7ed3\u675f"

    .line 22
    .line 23
    invoke-static {p1}, Lz1/b;->i(Ljava/lang/CharSequence;)V

    .line 24
    .line 25
    .line 26
    invoke-virtual {p0}, Lcom/friday/paint/view/StudentPaintFragment;->getViewModel()Lcom/friday/paint/viewmodel/DoHomeworkViewModel;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    const/4 v0, 0x0

    .line 31
    invoke-virtual {p1, v0}, Lcom/friday/paint/viewmodel/DoHomeworkViewModel;->w(Lcom/friday/common/classtest/MqttResponse;)V

    .line 32
    .line 33
    .line 34
    invoke-virtual {p0}, Lcom/friday/paint/view/StudentPaintFragment;->getViewModel()Lcom/friday/paint/viewmodel/DoHomeworkViewModel;

    .line 35
    .line 36
    .line 37
    move-result-object p1

    .line 38
    const/4 v0, 0x1

    .line 39
    invoke-virtual {p1, v0}, Lcom/friday/paint/viewmodel/DoHomeworkViewModel;->t(Z)V

    .line 40
    .line 41
    .line 42
    invoke-virtual {p0}, Lcom/friday/common/base/BaseFragment;->getMBinding()Landroidx/databinding/ViewDataBinding;

    .line 43
    .line 44
    .line 45
    move-result-object p1

    .line 46
    check-cast p1, Lcom/friday/paint/databinding/FragmentThePaintBinding;

    .line 47
    .line 48
    iget-object p1, p1, Lcom/friday/paint/databinding/FragmentThePaintBinding;->w:Landroid/widget/ImageView;

    .line 49
    .line 50
    const/16 v0, 0x8

    .line 51
    .line 52
    invoke-virtual {p1, v0}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 53
    .line 54
    .line 55
    invoke-virtual {p0}, Lcom/friday/common/base/BaseFragment;->getMBinding()Landroidx/databinding/ViewDataBinding;

    .line 56
    .line 57
    .line 58
    move-result-object p1

    .line 59
    check-cast p1, Lcom/friday/paint/databinding/FragmentThePaintBinding;

    .line 60
    .line 61
    iget-object p1, p1, Lcom/friday/paint/databinding/FragmentThePaintBinding;->f:Landroid/widget/ImageView;

    .line 62
    .line 63
    invoke-virtual {p1, v0}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 64
    .line 65
    .line 66
    :try_start_0
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getChildFragmentManager()Landroidx/fragment/app/FragmentManager;

    .line 67
    .line 68
    .line 69
    move-result-object p1

    .line 70
    const-class v0, Lcom/friday/paint/dialog/ObjectiveHomeworkSubmitDialog;

    .line 71
    .line 72
    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 73
    .line 74
    .line 75
    move-result-object v0

    .line 76
    invoke-virtual {p1, v0}, Landroidx/fragment/app/FragmentManager;->findFragmentByTag(Ljava/lang/String;)Landroidx/fragment/app/Fragment;

    .line 77
    .line 78
    .line 79
    move-result-object p1

    .line 80
    const-string v0, "null cannot be cast to non-null type com.friday.paint.dialog.ObjectiveHomeworkSubmitDialog"

    .line 81
    .line 82
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 83
    .line 84
    .line 85
    check-cast p1, Lcom/friday/paint/dialog/ObjectiveHomeworkSubmitDialog;

    .line 86
    .line 87
    invoke-virtual {p1}, Landroidx/fragment/app/DialogFragment;->dismissAllowingStateLoss()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 88
    .line 89
    .line 90
    goto :goto_0

    .line 91
    :catch_0
    move-exception p1

    .line 92
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 93
    .line 94
    .line 95
    :goto_0
    :try_start_1
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getChildFragmentManager()Landroidx/fragment/app/FragmentManager;

    .line 96
    .line 97
    .line 98
    move-result-object p1

    .line 99
    const-class v0, Lcom/friday/paint/dialog/ReceiveClassTestDialog;

    .line 100
    .line 101
    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 102
    .line 103
    .line 104
    move-result-object v0

    .line 105
    invoke-virtual {p1, v0}, Landroidx/fragment/app/FragmentManager;->findFragmentByTag(Ljava/lang/String;)Landroidx/fragment/app/Fragment;

    .line 106
    .line 107
    .line 108
    move-result-object p1

    .line 109
    const-string v0, "null cannot be cast to non-null type com.friday.paint.dialog.ReceiveClassTestDialog"

    .line 110
    .line 111
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 112
    .line 113
    .line 114
    check-cast p1, Lcom/friday/paint/dialog/ReceiveClassTestDialog;

    .line 115
    .line 116
    invoke-virtual {p1}, Landroidx/fragment/app/DialogFragment;->dismissAllowingStateLoss()V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    .line 117
    .line 118
    .line 119
    :catch_1
    invoke-virtual {p0}, Lcom/friday/paint/view/ThePaintFragment;->u0()Lcom/friday/paint/adapter/ThumbnailListAdapter;

    .line 120
    .line 121
    .line 122
    move-result-object p1

    .line 123
    invoke-virtual {p1}, Lcom/chad/library/adapter/base/BaseQuickAdapter;->getData()Ljava/util/List;

    .line 124
    .line 125
    .line 126
    move-result-object p1

    .line 127
    check-cast p1, Ljava/lang/Iterable;

    .line 128
    .line 129
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 130
    .line 131
    .line 132
    move-result-object p1

    .line 133
    const/4 v0, 0x0

    .line 134
    move v1, v0

    .line 135
    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 136
    .line 137
    .line 138
    move-result v2

    .line 139
    if-eqz v2, :cond_1

    .line 140
    .line 141
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 142
    .line 143
    .line 144
    move-result-object v2

    .line 145
    add-int/lit8 v3, v1, 0x1

    .line 146
    .line 147
    if-gez v1, :cond_0

    .line 148
    .line 149
    invoke-static {}, Lrc/w;->w()V

    .line 150
    .line 151
    .line 152
    :cond_0
    check-cast v2, Lcom/friday/paint/model/NoteListEntity;

    .line 153
    .line 154
    invoke-virtual {v2, v0}, Lcom/friday/paint/model/NoteListEntity;->setInClass(Z)V

    .line 155
    .line 156
    .line 157
    invoke-virtual {p0}, Lcom/friday/paint/view/ThePaintFragment;->u0()Lcom/friday/paint/adapter/ThumbnailListAdapter;

    .line 158
    .line 159
    .line 160
    move-result-object v2

    .line 161
    sget-object v4, Lcom/friday/common/entity/PayloadKey;->IN_CLASS:Lcom/friday/common/entity/PayloadKey;

    .line 162
    .line 163
    invoke-virtual {v2, v1, v4}, Landroidx/recyclerview/widget/RecyclerView$Adapter;->notifyItemChanged(ILjava/lang/Object;)V

    .line 164
    .line 165
    .line 166
    move v1, v3

    .line 167
    goto :goto_1

    .line 168
    :cond_1
    return-void
.end method

.method public static final E1(Lcom/friday/paint/view/StudentPaintFragment;Ljava/lang/Object;)V
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/friday/common/base/BaseFragment;->getMBinding()Landroidx/databinding/ViewDataBinding;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    check-cast p1, Lcom/friday/paint/databinding/FragmentThePaintBinding;

    .line 6
    .line 7
    iget-object p1, p1, Lcom/friday/paint/databinding/FragmentThePaintBinding;->w:Landroid/widget/ImageView;

    .line 8
    .line 9
    const/16 v0, 0x8

    .line 10
    .line 11
    invoke-virtual {p1, v0}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {p0}, Lcom/friday/paint/view/StudentPaintFragment;->getViewModel()Lcom/friday/paint/viewmodel/DoHomeworkViewModel;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    invoke-virtual {p0}, Lcom/friday/paint/viewmodel/DoHomeworkViewModel;->j()Landroidx/lifecycle/MutableLiveData;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    sget-object p1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 23
    .line 24
    invoke-virtual {p0, p1}, Landroidx/lifecycle/MutableLiveData;->setValue(Ljava/lang/Object;)V

    .line 25
    .line 26
    .line 27
    const-string p0, "\u7b54\u9898\u5df2\u622a\u6b62"

    .line 28
    .line 29
    invoke-static {p0}, Lz1/b;->i(Ljava/lang/CharSequence;)V

    .line 30
    .line 31
    .line 32
    return-void
.end method

.method public static final F1(Lcom/friday/paint/view/StudentPaintFragment;Landroid/view/View;)V
    .locals 2

    .line 1
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getChildFragmentManager()Landroidx/fragment/app/FragmentManager;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    const-class v0, Lcom/friday/paint/dialog/ObjectiveHomeworkSubmitDialog;

    .line 6
    .line 7
    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    invoke-virtual {p1, v1}, Landroidx/fragment/app/FragmentManager;->findFragmentByTag(Ljava/lang/String;)Landroidx/fragment/app/Fragment;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    if-eqz p1, :cond_0

    .line 16
    .line 17
    return-void

    .line 18
    :cond_0
    new-instance p1, Lcom/friday/paint/dialog/ObjectiveHomeworkSubmitDialog;

    .line 19
    .line 20
    invoke-direct {p1}, Lcom/friday/paint/dialog/ObjectiveHomeworkSubmitDialog;-><init>()V

    .line 21
    .line 22
    .line 23
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getChildFragmentManager()Landroidx/fragment/app/FragmentManager;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    const-string v1, "getChildFragmentManager(...)"

    .line 28
    .line 29
    invoke-static {p0, v1}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    invoke-virtual {p1, p0, v0}, Lcom/friday/common/base/BaseDialogFragment;->show(Landroidx/fragment/app/FragmentManager;Ljava/lang/String;)V

    .line 37
    .line 38
    .line 39
    return-void
.end method

.method public static final G1(Lcom/friday/paint/view/StudentPaintFragment;Landroid/view/View;)V
    .locals 5

    .line 1
    sget-object p1, Lf2/c;->a:Lf2/c;

    .line 2
    .line 3
    invoke-virtual {p1}, Lf2/c;->e()Z

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    if-nez p1, :cond_0

    .line 8
    .line 9
    const-string p0, "\u7f51\u7edc\u672a\u8fde\u63a5"

    .line 10
    .line 11
    invoke-static {p0}, Lz1/b;->i(Ljava/lang/CharSequence;)V

    .line 12
    .line 13
    .line 14
    return-void

    .line 15
    :cond_0
    iget-boolean p1, p0, Lcom/friday/paint/view/StudentPaintFragment;->v:Z

    .line 16
    .line 17
    if-nez p1, :cond_1

    .line 18
    .line 19
    const-string p0, "\u60a8\u7684\u622a\u56fe\u6743\u9650\u5df2\u5173\u95ed\uff0c\u8bf7\u8054\u7cfb\u5b66\u6821\u5de5\u4f5c\u4eba\u5458\u8fdb\u884c\u5f00\u542f"

    .line 20
    .line 21
    invoke-static {p0}, Lz1/b;->i(Ljava/lang/CharSequence;)V

    .line 22
    .line 23
    .line 24
    return-void

    .line 25
    :cond_1
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 26
    .line 27
    .line 28
    move-result-wide v0

    .line 29
    iget-wide v2, p0, Lcom/friday/paint/view/StudentPaintFragment;->t:J

    .line 30
    .line 31
    sub-long/2addr v0, v2

    .line 32
    const-wide/16 v2, 0xbb8

    .line 33
    .line 34
    cmp-long p1, v0, v2

    .line 35
    .line 36
    if-gez p1, :cond_2

    .line 37
    .line 38
    const-string p0, "\u622a\u56fe\u8fc7\u4e8e\u9891\u7e41"

    .line 39
    .line 40
    invoke-static {p0}, Lz1/b;->i(Ljava/lang/CharSequence;)V

    .line 41
    .line 42
    .line 43
    return-void

    .line 44
    :cond_2
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 45
    .line 46
    .line 47
    move-result-wide v0

    .line 48
    iput-wide v0, p0, Lcom/friday/paint/view/StudentPaintFragment;->t:J

    .line 49
    .line 50
    const-string p0, "\u6b63\u5728\u622a\u56fe"

    .line 51
    .line 52
    invoke-static {p0}, Lz1/b;->i(Ljava/lang/CharSequence;)V

    .line 53
    .line 54
    .line 55
    const-class p0, Lcom/friday/common/entity/MqttEntity;

    .line 56
    .line 57
    invoke-static {p0}, Lcom/jeremyliao/liveeventbus/LiveEventBus;->get(Ljava/lang/Class;)Lcom/jeremyliao/liveeventbus/core/Observable;

    .line 58
    .line 59
    .line 60
    move-result-object p0

    .line 61
    new-instance p1, Lcom/friday/common/entity/MqttEntity;

    .line 62
    .line 63
    sget-object v0, Lcom/friday/common/entity/MqttType;->NONE:Lcom/friday/common/entity/MqttType;

    .line 64
    .line 65
    new-instance v1, Lcom/friday/common/classtest/MqttRequestEntity;

    .line 66
    .line 67
    const/16 v2, 0x2715

    .line 68
    .line 69
    const/4 v3, 0x2

    .line 70
    const/4 v4, 0x0

    .line 71
    invoke-direct {v1, v2, v4, v3, v4}, Lcom/friday/common/classtest/MqttRequestEntity;-><init>(ILcom/friday/common/classtest/RequestScreencastData;ILkotlin/jvm/internal/n;)V

    .line 72
    .line 73
    .line 74
    invoke-static {v1}, Lcom/blankj/utilcode/util/GsonUtils;->toJson(Ljava/lang/Object;)Ljava/lang/String;

    .line 75
    .line 76
    .line 77
    move-result-object v1

    .line 78
    const-string v2, "toJson(...)"

    .line 79
    .line 80
    invoke-static {v1, v2}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 81
    .line 82
    .line 83
    const-string v2, "board"

    .line 84
    .line 85
    invoke-direct {p1, v0, v1, v2}, Lcom/friday/common/entity/MqttEntity;-><init>(Lcom/friday/common/entity/MqttType;Ljava/lang/String;Ljava/lang/String;)V

    .line 86
    .line 87
    .line 88
    invoke-interface {p0, p1}, Lcom/jeremyliao/liveeventbus/core/Observable;->post(Ljava/lang/Object;)V

    .line 89
    .line 90
    .line 91
    return-void
.end method

.method public static final H1(Lcom/friday/paint/view/StudentPaintFragment;Ljava/lang/String;)V
    .locals 1

    .line 1
    invoke-static {p1}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    invoke-virtual {p0, p1, v0}, Lcom/friday/paint/view/StudentPaintFragment;->saveScreenShoot(Ljava/lang/String;Z)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public static final I1(Lcom/friday/paint/view/StudentPaintFragment;Ljava/lang/Boolean;)V
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/friday/common/base/BaseFragment;->getMBinding()Landroidx/databinding/ViewDataBinding;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    check-cast p0, Lcom/friday/paint/databinding/FragmentThePaintBinding;

    .line 6
    .line 7
    iget-object p0, p0, Lcom/friday/paint/databinding/FragmentThePaintBinding;->u:Landroid/widget/ImageView;

    .line 8
    .line 9
    const-string v0, "ivScreenShoot"

    .line 10
    .line 11
    invoke-static {p0, v0}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    invoke-static {p1}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 18
    .line 19
    .line 20
    move-result p1

    .line 21
    if-eqz p1, :cond_0

    .line 22
    .line 23
    const/4 p1, 0x0

    .line 24
    goto :goto_0

    .line 25
    :cond_0
    const/16 p1, 0x8

    .line 26
    .line 27
    :goto_0
    invoke-virtual {p0, p1}, Landroid/view/View;->setVisibility(I)V

    .line 28
    .line 29
    .line 30
    return-void
.end method

.method public static final J1(Lcom/friday/paint/view/StudentPaintFragment;Ljava/lang/String;)V
    .locals 2

    .line 1
    invoke-static {}, Lcom/blankj/utilcode/util/CacheMemoryUtils;->getInstance()Lcom/blankj/utilcode/util/CacheMemoryUtils;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const-string v1, "answer_cache"

    .line 6
    .line 7
    invoke-virtual {v0, v1}, Lcom/blankj/utilcode/util/CacheMemoryUtils;->get(Ljava/lang/String;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    check-cast v0, Lcom/friday/common/entity/AnswerCache;

    .line 12
    .line 13
    const-class v1, Lcom/friday/common/classtest/MqttResponse;

    .line 14
    .line 15
    invoke-static {p1, v1}, Lcom/blankj/utilcode/util/GsonUtils;->fromJson(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    check-cast p1, Lcom/friday/common/classtest/MqttResponse;

    .line 20
    .line 21
    if-eqz v0, :cond_0

    .line 22
    .line 23
    invoke-virtual {p1}, Lcom/friday/common/classtest/MqttResponse;->getGuid()Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    invoke-virtual {v0}, Lcom/friday/common/entity/AnswerCache;->getGuid()Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    invoke-static {v1, v0}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 32
    .line 33
    .line 34
    move-result v0

    .line 35
    if-eqz v0, :cond_0

    .line 36
    .line 37
    return-void

    .line 38
    :cond_0
    invoke-virtual {p0}, Lcom/friday/paint/view/StudentPaintFragment;->getViewModel()Lcom/friday/paint/viewmodel/DoHomeworkViewModel;

    .line 39
    .line 40
    .line 41
    move-result-object p0

    .line 42
    invoke-virtual {p0, p1}, Lcom/friday/paint/viewmodel/DoHomeworkViewModel;->A(Lcom/friday/common/classtest/MqttResponse;)V

    .line 43
    .line 44
    .line 45
    return-void
.end method

.method public static final K1(Lcom/friday/paint/view/StudentPaintFragment;Ljava/lang/Object;)V
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getActivity()Landroidx/fragment/app/FragmentActivity;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    if-eqz p1, :cond_0

    .line 6
    .line 7
    new-instance v0, Lc4/f;

    .line 8
    .line 9
    invoke-direct {v0, p0}, Lc4/f;-><init>(Lcom/friday/paint/view/StudentPaintFragment;)V

    .line 10
    .line 11
    .line 12
    invoke-virtual {p1, v0}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    .line 13
    .line 14
    .line 15
    :cond_0
    return-void
.end method

.method public static final L1(Lcom/friday/paint/view/StudentPaintFragment;)V
    .locals 6

    .line 1
    invoke-virtual {p0}, Lcom/friday/paint/view/ThePaintFragment;->u0()Lcom/friday/paint/adapter/ThumbnailListAdapter;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Lcom/chad/library/adapter/base/BaseQuickAdapter;->getData()Ljava/util/List;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    check-cast v0, Ljava/lang/Iterable;

    .line 10
    .line 11
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    const/4 v1, 0x0

    .line 16
    move v2, v1

    .line 17
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 18
    .line 19
    .line 20
    move-result v3

    .line 21
    if-eqz v3, :cond_2

    .line 22
    .line 23
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v3

    .line 27
    add-int/lit8 v4, v2, 0x1

    .line 28
    .line 29
    if-gez v2, :cond_0

    .line 30
    .line 31
    invoke-static {}, Lrc/w;->w()V

    .line 32
    .line 33
    .line 34
    :cond_0
    check-cast v3, Lcom/friday/paint/model/NoteListEntity;

    .line 35
    .line 36
    invoke-virtual {v3}, Lcom/friday/paint/model/NoteListEntity;->getInClass()Z

    .line 37
    .line 38
    .line 39
    move-result v5

    .line 40
    if-eqz v5, :cond_1

    .line 41
    .line 42
    invoke-virtual {v3, v1}, Lcom/friday/paint/model/NoteListEntity;->setInClass(Z)V

    .line 43
    .line 44
    .line 45
    invoke-virtual {p0}, Lcom/friday/paint/view/ThePaintFragment;->u0()Lcom/friday/paint/adapter/ThumbnailListAdapter;

    .line 46
    .line 47
    .line 48
    move-result-object v3

    .line 49
    sget-object v5, Lcom/friday/common/entity/PayloadKey;->IN_CLASS:Lcom/friday/common/entity/PayloadKey;

    .line 50
    .line 51
    invoke-virtual {v3, v2, v5}, Landroidx/recyclerview/widget/RecyclerView$Adapter;->notifyItemChanged(ILjava/lang/Object;)V

    .line 52
    .line 53
    .line 54
    :cond_1
    move v2, v4

    .line 55
    goto :goto_0

    .line 56
    :cond_2
    return-void
.end method

.method public static final M1(Lcom/friday/paint/view/StudentPaintFragment;Ljava/lang/Object;)V
    .locals 6

    .line 1
    invoke-static {p0}, Landroidx/lifecycle/LifecycleOwnerKt;->getLifecycleScope(Landroidx/lifecycle/LifecycleOwner;)Landroidx/lifecycle/LifecycleCoroutineScope;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {}, Lsd/r0;->b()Lsd/e0;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    new-instance v3, Lcom/friday/paint/view/StudentPaintFragment$initObserver$1$1;

    .line 10
    .line 11
    const/4 p1, 0x0

    .line 12
    invoke-direct {v3, p0, p1}, Lcom/friday/paint/view/StudentPaintFragment$initObserver$1$1;-><init>(Lcom/friday/paint/view/StudentPaintFragment;Lvc/c;)V

    .line 13
    .line 14
    .line 15
    const/4 v4, 0x2

    .line 16
    const/4 v5, 0x0

    .line 17
    const/4 v2, 0x0

    .line 18
    invoke-static/range {v0 .. v5}, Lsd/f;->d(Lsd/i0;Lkotlin/coroutines/d;Lkotlinx/coroutines/CoroutineStart;Lhd/p;ILjava/lang/Object;)Lkotlinx/coroutines/g;

    .line 19
    .line 20
    .line 21
    return-void
.end method

.method public static synthetic d1(Lcom/friday/paint/view/StudentPaintFragment;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/friday/paint/view/StudentPaintFragment;->G1(Lcom/friday/paint/view/StudentPaintFragment;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic e1(Lcom/friday/paint/view/StudentPaintFragment;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/friday/paint/view/StudentPaintFragment;->J1(Lcom/friday/paint/view/StudentPaintFragment;Ljava/lang/String;)V

    return-void
.end method

.method public static synthetic f1(Lcom/friday/paint/view/StudentPaintFragment;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/friday/paint/view/StudentPaintFragment;->D1(Lcom/friday/paint/view/StudentPaintFragment;Ljava/lang/String;)V

    return-void
.end method

.method public static synthetic g1(Lcom/friday/paint/view/StudentPaintFragment;Ljava/lang/Object;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/friday/paint/view/StudentPaintFragment;->M1(Lcom/friday/paint/view/StudentPaintFragment;Ljava/lang/Object;)V

    return-void
.end method

.method public static synthetic h1(Lcom/friday/paint/view/StudentPaintFragment;Ljava/lang/Object;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/friday/paint/view/StudentPaintFragment;->E1(Lcom/friday/paint/view/StudentPaintFragment;Ljava/lang/Object;)V

    return-void
.end method

.method public static synthetic i1(Lcom/friday/paint/view/StudentPaintFragment;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/friday/paint/view/StudentPaintFragment;->z1(Lcom/friday/paint/view/StudentPaintFragment;Landroid/view/View;)V

    return-void
.end method

.method private final initObserver()V
    .locals 3

    .line 1
    const-string v0, "submitHomework"

    .line 2
    .line 3
    invoke-static {v0}, Lcom/jeremyliao/liveeventbus/LiveEventBus;->get(Ljava/lang/String;)Lcom/jeremyliao/liveeventbus/core/Observable;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getViewLifecycleOwner()Landroidx/lifecycle/LifecycleOwner;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    new-instance v2, Lc4/e;

    .line 12
    .line 13
    invoke-direct {v2, p0}, Lc4/e;-><init>(Lcom/friday/paint/view/StudentPaintFragment;)V

    .line 14
    .line 15
    .line 16
    invoke-interface {v0, v1, v2}, Lcom/jeremyliao/liveeventbus/core/Observable;->observe(Landroidx/lifecycle/LifecycleOwner;Landroidx/lifecycle/Observer;)V

    .line 17
    .line 18
    .line 19
    return-void
.end method

.method public static synthetic j1(Lcom/friday/paint/view/StudentPaintFragment;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/friday/paint/view/StudentPaintFragment;->F1(Lcom/friday/paint/view/StudentPaintFragment;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic k1(Lcom/friday/paint/view/StudentPaintFragment;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/friday/paint/view/StudentPaintFragment;->C1(Lcom/friday/paint/view/StudentPaintFragment;Ljava/lang/String;)V

    return-void
.end method

.method public static synthetic l1(Lcom/friday/paint/view/StudentPaintFragment;Ljava/lang/Boolean;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/friday/paint/view/StudentPaintFragment;->I1(Lcom/friday/paint/view/StudentPaintFragment;Ljava/lang/Boolean;)V

    return-void
.end method

.method public static synthetic m1(Lcom/friday/paint/view/StudentPaintFragment;)V
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/friday/paint/view/StudentPaintFragment;->L1(Lcom/friday/paint/view/StudentPaintFragment;)V

    return-void
.end method

.method public static synthetic n1(Lcom/friday/paint/view/StudentPaintFragment;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/friday/paint/view/StudentPaintFragment;->H1(Lcom/friday/paint/view/StudentPaintFragment;Ljava/lang/String;)V

    return-void
.end method

.method public static synthetic o1(Lcom/friday/paint/view/StudentPaintFragment;Lcom/friday/paint/dialog/HomeworkSubmitConfirmDialog;)Lqc/q;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/friday/paint/view/StudentPaintFragment;->A1(Lcom/friday/paint/view/StudentPaintFragment;Lcom/friday/paint/dialog/HomeworkSubmitConfirmDialog;)Lqc/q;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic p1(Lcom/friday/paint/view/StudentPaintFragment;Ljava/lang/Object;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/friday/paint/view/StudentPaintFragment;->K1(Lcom/friday/paint/view/StudentPaintFragment;Ljava/lang/Object;)V

    return-void
.end method

.method public static synthetic q1(Lcom/friday/paint/view/StudentPaintFragment;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/friday/paint/view/StudentPaintFragment;->B1(Lcom/friday/paint/view/StudentPaintFragment;Ljava/lang/String;)V

    return-void
.end method

.method public static final synthetic r1(Lcom/friday/paint/view/StudentPaintFragment;)Lcom/friday/paint/databinding/FragmentThePaintBinding;
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/friday/common/base/BaseFragment;->getMBinding()Landroidx/databinding/ViewDataBinding;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    check-cast p0, Lcom/friday/paint/databinding/FragmentThePaintBinding;

    .line 6
    .line 7
    return-object p0
.end method

.method public static final synthetic s1(Lcom/friday/paint/view/StudentPaintFragment;)I
    .locals 0

    .line 1
    iget p0, p0, Lcom/friday/paint/view/StudentPaintFragment;->u:I

    .line 2
    .line 3
    return p0
.end method

.method public static final synthetic t1(Lcom/friday/paint/view/StudentPaintFragment;)Lcom/friday/paint/viewmodel/DoHomeworkViewModel;
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/friday/paint/view/StudentPaintFragment;->getViewModel()Lcom/friday/paint/viewmodel/DoHomeworkViewModel;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static final synthetic u1(Lcom/friday/paint/view/StudentPaintFragment;)Lcom/friday/paint/viewmodel/NoteViewModel;
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/friday/paint/view/StudentPaintFragment;->y1()Lcom/friday/paint/viewmodel/NoteViewModel;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static final synthetic v1(Lcom/friday/paint/view/StudentPaintFragment;Lcom/friday/common/classtest/MqttResponse;)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcom/friday/paint/view/StudentPaintFragment;->handleHomework(Lcom/friday/common/classtest/MqttResponse;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static final synthetic w1(Lcom/friday/paint/view/StudentPaintFragment;I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/friday/paint/view/StudentPaintFragment;->u:I

    .line 2
    .line 3
    return-void
.end method

.method public static final synthetic x1(Lcom/friday/paint/view/StudentPaintFragment;Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/friday/paint/view/StudentPaintFragment;->v:Z

    .line 2
    .line 3
    return-void
.end method

.method public static final z1(Lcom/friday/paint/view/StudentPaintFragment;Landroid/view/View;)V
    .locals 1

    .line 1
    new-instance p1, Lcom/friday/paint/dialog/HomeworkSubmitConfirmDialog;

    .line 2
    .line 3
    invoke-direct {p1}, Lcom/friday/paint/dialog/HomeworkSubmitConfirmDialog;-><init>()V

    .line 4
    .line 5
    .line 6
    new-instance v0, Lc4/g;

    .line 7
    .line 8
    invoke-direct {v0, p0, p1}, Lc4/g;-><init>(Lcom/friday/paint/view/StudentPaintFragment;Lcom/friday/paint/dialog/HomeworkSubmitConfirmDialog;)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p1, v0}, Lcom/friday/paint/dialog/HomeworkSubmitConfirmDialog;->s(Lhd/a;)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getChildFragmentManager()Landroidx/fragment/app/FragmentManager;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    const-class v0, Lcom/friday/paint/dialog/HomeworkSubmitConfirmDialog;

    .line 19
    .line 20
    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    invoke-virtual {p1, p0, v0}, Landroidx/fragment/app/DialogFragment;->show(Landroidx/fragment/app/FragmentManager;Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    return-void
.end method


# virtual methods
.method public final base64ToBitmap(Ljava/lang/String;)Landroid/graphics/Bitmap;
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    :try_start_0
    invoke-static {p1, v0}, Landroid/util/Base64;->decode(Ljava/lang/String;I)[B

    .line 3
    .line 4
    .line 5
    move-result-object p1

    .line 6
    const-string v1, "decode(...)"

    .line 7
    .line 8
    invoke-static {p1, v1}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    array-length v1, p1

    .line 12
    invoke-static {p1, v0, v1}, Landroid/graphics/BitmapFactory;->decodeByteArray([BII)Landroid/graphics/Bitmap;

    .line 13
    .line 14
    .line 15
    move-result-object p1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 16
    return-object p1

    .line 17
    :catch_0
    move-exception p1

    .line 18
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 19
    .line 20
    .line 21
    const/4 p1, 0x0

    .line 22
    return-object p1
.end method

.method public final getViewModel()Lcom/friday/paint/viewmodel/DoHomeworkViewModel;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/friday/paint/view/StudentPaintFragment;->r:Lqc/d;

    .line 2
    .line 3
    invoke-interface {v0}, Lqc/d;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lcom/friday/paint/viewmodel/DoHomeworkViewModel;

    .line 8
    .line 9
    return-object v0
.end method

.method public final handleHomework(Lcom/friday/common/classtest/MqttResponse;)V
    .locals 3

    .line 1
    invoke-static {p0}, Landroidx/lifecycle/LifecycleOwnerKt;->getLifecycleScope(Landroidx/lifecycle/LifecycleOwner;)Landroidx/lifecycle/LifecycleCoroutineScope;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    new-instance v1, Lcom/friday/paint/view/StudentPaintFragment$handleHomework$1;

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    invoke-direct {v1, p0, p1, v2}, Lcom/friday/paint/view/StudentPaintFragment$handleHomework$1;-><init>(Lcom/friday/paint/view/StudentPaintFragment;Lcom/friday/common/classtest/MqttResponse;Lvc/c;)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0, v1}, Landroidx/lifecycle/LifecycleCoroutineScope;->launchWhenResumed(Lhd/p;)Lkotlinx/coroutines/g;

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method public initData()V
    .locals 9

    .line 1
    invoke-super {p0}, Lcom/friday/paint/view/ThePaintFragment;->initData()V

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Lcom/friday/paint/view/StudentPaintFragment;->initObserver()V

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0}, Lcom/friday/common/base/BaseFragment;->getMBinding()Landroidx/databinding/ViewDataBinding;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    check-cast v0, Lcom/friday/paint/databinding/FragmentThePaintBinding;

    .line 12
    .line 13
    iget-object v0, v0, Lcom/friday/paint/databinding/FragmentThePaintBinding;->z:Landroid/widget/LinearLayout;

    .line 14
    .line 15
    const/4 v1, 0x0

    .line 16
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 17
    .line 18
    .line 19
    invoke-virtual {p0}, Lcom/friday/common/base/BaseFragment;->getMBinding()Landroidx/databinding/ViewDataBinding;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    check-cast v0, Lcom/friday/paint/databinding/FragmentThePaintBinding;

    .line 24
    .line 25
    iget-object v0, v0, Lcom/friday/paint/databinding/FragmentThePaintBinding;->w:Landroid/widget/ImageView;

    .line 26
    .line 27
    new-instance v2, Lc4/c;

    .line 28
    .line 29
    invoke-direct {v2, p0}, Lc4/c;-><init>(Lcom/friday/paint/view/StudentPaintFragment;)V

    .line 30
    .line 31
    .line 32
    invoke-static {v0, v2}, Lcom/blankj/utilcode/util/ClickUtils;->applyGlobalDebouncing(Landroid/view/View;Landroid/view/View$OnClickListener;)V

    .line 33
    .line 34
    .line 35
    invoke-static {p0}, Landroidx/lifecycle/LifecycleOwnerKt;->getLifecycleScope(Landroidx/lifecycle/LifecycleOwner;)Landroidx/lifecycle/LifecycleCoroutineScope;

    .line 36
    .line 37
    .line 38
    move-result-object v3

    .line 39
    new-instance v6, Lcom/friday/paint/view/StudentPaintFragment$initData$2;

    .line 40
    .line 41
    const/4 v0, 0x0

    .line 42
    invoke-direct {v6, p0, v0}, Lcom/friday/paint/view/StudentPaintFragment$initData$2;-><init>(Lcom/friday/paint/view/StudentPaintFragment;Lvc/c;)V

    .line 43
    .line 44
    .line 45
    const/4 v7, 0x3

    .line 46
    const/4 v8, 0x0

    .line 47
    const/4 v4, 0x0

    .line 48
    const/4 v5, 0x0

    .line 49
    invoke-static/range {v3 .. v8}, Lsd/f;->d(Lsd/i0;Lkotlin/coroutines/d;Lkotlinx/coroutines/CoroutineStart;Lhd/p;ILjava/lang/Object;)Lkotlinx/coroutines/g;

    .line 50
    .line 51
    .line 52
    invoke-virtual {p0}, Lcom/friday/common/base/BaseFragment;->getMBinding()Landroidx/databinding/ViewDataBinding;

    .line 53
    .line 54
    .line 55
    move-result-object v2

    .line 56
    check-cast v2, Lcom/friday/paint/databinding/FragmentThePaintBinding;

    .line 57
    .line 58
    iget-object v2, v2, Lcom/friday/paint/databinding/FragmentThePaintBinding;->u:Landroid/widget/ImageView;

    .line 59
    .line 60
    const-string v3, "ivScreenShoot"

    .line 61
    .line 62
    invoke-static {v2, v3}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 63
    .line 64
    .line 65
    invoke-virtual {p0}, Lcom/friday/paint/view/ThePaintFragment;->getIClassManager()Lj2/b;

    .line 66
    .line 67
    .line 68
    move-result-object v3

    .line 69
    invoke-interface {v3}, Lj2/b;->g()Z

    .line 70
    .line 71
    .line 72
    move-result v3

    .line 73
    if-eqz v3, :cond_0

    .line 74
    .line 75
    goto :goto_0

    .line 76
    :cond_0
    const/16 v1, 0x8

    .line 77
    .line 78
    :goto_0
    invoke-virtual {v2, v1}, Landroid/view/View;->setVisibility(I)V

    .line 79
    .line 80
    .line 81
    invoke-virtual {p0}, Lcom/friday/common/base/BaseFragment;->getMBinding()Landroidx/databinding/ViewDataBinding;

    .line 82
    .line 83
    .line 84
    move-result-object v1

    .line 85
    check-cast v1, Lcom/friday/paint/databinding/FragmentThePaintBinding;

    .line 86
    .line 87
    iget-object v1, v1, Lcom/friday/paint/databinding/FragmentThePaintBinding;->f:Landroid/widget/ImageView;

    .line 88
    .line 89
    new-instance v2, Lc4/i;

    .line 90
    .line 91
    invoke-direct {v2, p0}, Lc4/i;-><init>(Lcom/friday/paint/view/StudentPaintFragment;)V

    .line 92
    .line 93
    .line 94
    invoke-static {v1, v2}, Lcom/blankj/utilcode/util/ClickUtils;->applyGlobalDebouncing(Landroid/view/View;Landroid/view/View$OnClickListener;)V

    .line 95
    .line 96
    .line 97
    invoke-virtual {p0}, Lcom/friday/common/base/BaseFragment;->getMBinding()Landroidx/databinding/ViewDataBinding;

    .line 98
    .line 99
    .line 100
    move-result-object v1

    .line 101
    check-cast v1, Lcom/friday/paint/databinding/FragmentThePaintBinding;

    .line 102
    .line 103
    iget-object v1, v1, Lcom/friday/paint/databinding/FragmentThePaintBinding;->u:Landroid/widget/ImageView;

    .line 104
    .line 105
    new-instance v2, Lc4/j;

    .line 106
    .line 107
    invoke-direct {v2, p0}, Lc4/j;-><init>(Lcom/friday/paint/view/StudentPaintFragment;)V

    .line 108
    .line 109
    .line 110
    invoke-static {v1, v2}, Lcom/blankj/utilcode/util/ClickUtils;->applyGlobalDebouncing(Landroid/view/View;Landroid/view/View$OnClickListener;)V

    .line 111
    .line 112
    .line 113
    invoke-static {p0}, Landroidx/lifecycle/LifecycleOwnerKt;->getLifecycleScope(Landroidx/lifecycle/LifecycleOwner;)Landroidx/lifecycle/LifecycleCoroutineScope;

    .line 114
    .line 115
    .line 116
    move-result-object v3

    .line 117
    new-instance v6, Lcom/friday/paint/view/StudentPaintFragment$initData$5;

    .line 118
    .line 119
    invoke-direct {v6, p0, v0}, Lcom/friday/paint/view/StudentPaintFragment$initData$5;-><init>(Lcom/friday/paint/view/StudentPaintFragment;Lvc/c;)V

    .line 120
    .line 121
    .line 122
    const/4 v7, 0x3

    .line 123
    const/4 v8, 0x0

    .line 124
    const/4 v4, 0x0

    .line 125
    const/4 v5, 0x0

    .line 126
    invoke-static/range {v3 .. v8}, Lsd/f;->d(Lsd/i0;Lkotlin/coroutines/d;Lkotlinx/coroutines/CoroutineStart;Lhd/p;ILjava/lang/Object;)Lkotlinx/coroutines/g;

    .line 127
    .line 128
    .line 129
    const-string v1, "LiveSnapshot"

    .line 130
    .line 131
    const-class v2, Ljava/lang/String;

    .line 132
    .line 133
    invoke-static {v1, v2}, Lcom/jeremyliao/liveeventbus/LiveEventBus;->get(Ljava/lang/String;Ljava/lang/Class;)Lcom/jeremyliao/liveeventbus/core/Observable;

    .line 134
    .line 135
    .line 136
    move-result-object v1

    .line 137
    new-instance v3, Lc4/k;

    .line 138
    .line 139
    invoke-direct {v3, p0}, Lc4/k;-><init>(Lcom/friday/paint/view/StudentPaintFragment;)V

    .line 140
    .line 141
    .line 142
    invoke-interface {v1, p0, v3}, Lcom/jeremyliao/liveeventbus/core/Observable;->observe(Landroidx/lifecycle/LifecycleOwner;Landroidx/lifecycle/Observer;)V

    .line 143
    .line 144
    .line 145
    const-string v1, "mqttServiceStatus"

    .line 146
    .line 147
    sget-object v3, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    .line 148
    .line 149
    invoke-static {v1, v3}, Lcom/jeremyliao/liveeventbus/LiveEventBus;->get(Ljava/lang/String;Ljava/lang/Class;)Lcom/jeremyliao/liveeventbus/core/Observable;

    .line 150
    .line 151
    .line 152
    move-result-object v1

    .line 153
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getViewLifecycleOwner()Landroidx/lifecycle/LifecycleOwner;

    .line 154
    .line 155
    .line 156
    move-result-object v3

    .line 157
    new-instance v4, Lc4/l;

    .line 158
    .line 159
    invoke-direct {v4, p0}, Lc4/l;-><init>(Lcom/friday/paint/view/StudentPaintFragment;)V

    .line 160
    .line 161
    .line 162
    invoke-interface {v1, v3, v4}, Lcom/jeremyliao/liveeventbus/core/Observable;->observe(Landroidx/lifecycle/LifecycleOwner;Landroidx/lifecycle/Observer;)V

    .line 163
    .line 164
    .line 165
    const-string v1, "receiveHomework"

    .line 166
    .line 167
    invoke-static {v1, v2}, Lcom/jeremyliao/liveeventbus/LiveEventBus;->get(Ljava/lang/String;Ljava/lang/Class;)Lcom/jeremyliao/liveeventbus/core/Observable;

    .line 168
    .line 169
    .line 170
    move-result-object v1

    .line 171
    new-instance v3, Lc4/m;

    .line 172
    .line 173
    invoke-direct {v3, p0}, Lc4/m;-><init>(Lcom/friday/paint/view/StudentPaintFragment;)V

    .line 174
    .line 175
    .line 176
    invoke-interface {v1, p0, v3}, Lcom/jeremyliao/liveeventbus/core/Observable;->observe(Landroidx/lifecycle/LifecycleOwner;Landroidx/lifecycle/Observer;)V

    .line 177
    .line 178
    .line 179
    invoke-static {p0}, Landroidx/lifecycle/LifecycleOwnerKt;->getLifecycleScope(Landroidx/lifecycle/LifecycleOwner;)Landroidx/lifecycle/LifecycleCoroutineScope;

    .line 180
    .line 181
    .line 182
    move-result-object v1

    .line 183
    new-instance v3, Lcom/friday/paint/view/StudentPaintFragment$initData$9;

    .line 184
    .line 185
    invoke-direct {v3, p0, v0}, Lcom/friday/paint/view/StudentPaintFragment$initData$9;-><init>(Lcom/friday/paint/view/StudentPaintFragment;Lvc/c;)V

    .line 186
    .line 187
    .line 188
    invoke-virtual {v1, v3}, Landroidx/lifecycle/LifecycleCoroutineScope;->launchWhenResumed(Lhd/p;)Lkotlinx/coroutines/g;

    .line 189
    .line 190
    .line 191
    const-string v0, "submitHomeworkOver"

    .line 192
    .line 193
    invoke-static {v0}, Lcom/jeremyliao/liveeventbus/LiveEventBus;->get(Ljava/lang/String;)Lcom/jeremyliao/liveeventbus/core/Observable;

    .line 194
    .line 195
    .line 196
    move-result-object v0

    .line 197
    new-instance v1, Lc4/n;

    .line 198
    .line 199
    invoke-direct {v1, p0}, Lc4/n;-><init>(Lcom/friday/paint/view/StudentPaintFragment;)V

    .line 200
    .line 201
    .line 202
    invoke-interface {v0, p0, v1}, Lcom/jeremyliao/liveeventbus/core/Observable;->observe(Landroidx/lifecycle/LifecycleOwner;Landroidx/lifecycle/Observer;)V

    .line 203
    .line 204
    .line 205
    const-string v0, "requestHomeworkStatusReply"

    .line 206
    .line 207
    invoke-static {v0, v2}, Lcom/jeremyliao/liveeventbus/LiveEventBus;->get(Ljava/lang/String;Ljava/lang/Class;)Lcom/jeremyliao/liveeventbus/core/Observable;

    .line 208
    .line 209
    .line 210
    move-result-object v0

    .line 211
    new-instance v1, Lc4/o;

    .line 212
    .line 213
    invoke-direct {v1, p0}, Lc4/o;-><init>(Lcom/friday/paint/view/StudentPaintFragment;)V

    .line 214
    .line 215
    .line 216
    invoke-interface {v0, p0, v1}, Lcom/jeremyliao/liveeventbus/core/Observable;->observe(Landroidx/lifecycle/LifecycleOwner;Landroidx/lifecycle/Observer;)V

    .line 217
    .line 218
    .line 219
    const-string v0, "submitHomeworkReply"

    .line 220
    .line 221
    invoke-static {v0, v2}, Lcom/jeremyliao/liveeventbus/LiveEventBus;->get(Ljava/lang/String;Ljava/lang/Class;)Lcom/jeremyliao/liveeventbus/core/Observable;

    .line 222
    .line 223
    .line 224
    move-result-object v0

    .line 225
    new-instance v1, Lc4/p;

    .line 226
    .line 227
    invoke-direct {v1, p0}, Lc4/p;-><init>(Lcom/friday/paint/view/StudentPaintFragment;)V

    .line 228
    .line 229
    .line 230
    invoke-interface {v0, p0, v1}, Lcom/jeremyliao/liveeventbus/core/Observable;->observe(Landroidx/lifecycle/LifecycleOwner;Landroidx/lifecycle/Observer;)V

    .line 231
    .line 232
    .line 233
    const-string v0, "homeworkEndClass"

    .line 234
    .line 235
    invoke-static {v0, v2}, Lcom/jeremyliao/liveeventbus/LiveEventBus;->get(Ljava/lang/String;Ljava/lang/Class;)Lcom/jeremyliao/liveeventbus/core/Observable;

    .line 236
    .line 237
    .line 238
    move-result-object v0

    .line 239
    new-instance v1, Lc4/d;

    .line 240
    .line 241
    invoke-direct {v1, p0}, Lc4/d;-><init>(Lcom/friday/paint/view/StudentPaintFragment;)V

    .line 242
    .line 243
    .line 244
    invoke-interface {v0, p0, v1}, Lcom/jeremyliao/liveeventbus/core/Observable;->observe(Landroidx/lifecycle/LifecycleOwner;Landroidx/lifecycle/Observer;)V

    .line 245
    .line 246
    .line 247
    const-string v0, "homeworkTimeUp"

    .line 248
    .line 249
    invoke-static {v0}, Lcom/jeremyliao/liveeventbus/LiveEventBus;->get(Ljava/lang/String;)Lcom/jeremyliao/liveeventbus/core/Observable;

    .line 250
    .line 251
    .line 252
    move-result-object v0

    .line 253
    new-instance v1, Lc4/h;

    .line 254
    .line 255
    invoke-direct {v1, p0}, Lc4/h;-><init>(Lcom/friday/paint/view/StudentPaintFragment;)V

    .line 256
    .line 257
    .line 258
    invoke-interface {v0, p0, v1}, Lcom/jeremyliao/liveeventbus/core/Observable;->observe(Landroidx/lifecycle/LifecycleOwner;Landroidx/lifecycle/Observer;)V

    .line 259
    .line 260
    .line 261
    const-class v0, Lcom/friday/common/entity/MqttEntity;

    .line 262
    .line 263
    invoke-static {v0}, Lcom/jeremyliao/liveeventbus/LiveEventBus;->get(Ljava/lang/Class;)Lcom/jeremyliao/liveeventbus/core/Observable;

    .line 264
    .line 265
    .line 266
    move-result-object v0

    .line 267
    new-instance v1, Lcom/friday/common/entity/MqttEntity;

    .line 268
    .line 269
    sget-object v2, Lcom/friday/common/entity/MqttType;->REQUEST_HOMEWORK_STATUS:Lcom/friday/common/entity/MqttType;

    .line 270
    .line 271
    sget-object v3, Lcom/friday/common/helper/b;->a:Lcom/friday/common/helper/b$a;

    .line 272
    .line 273
    invoke-virtual {v3}, Lcom/friday/common/helper/b$a;->a()Lcom/friday/common/helper/b;

    .line 274
    .line 275
    .line 276
    move-result-object v3

    .line 277
    invoke-virtual {v3}, Lcom/friday/common/helper/b;->t()J

    .line 278
    .line 279
    .line 280
    move-result-wide v3

    .line 281
    invoke-static {v3, v4}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    .line 282
    .line 283
    .line 284
    move-result-object v3

    .line 285
    const/4 v5, 0x4

    .line 286
    const/4 v6, 0x0

    .line 287
    const/4 v4, 0x0

    .line 288
    invoke-direct/range {v1 .. v6}, Lcom/friday/common/entity/MqttEntity;-><init>(Lcom/friday/common/entity/MqttType;Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/n;)V

    .line 289
    .line 290
    .line 291
    invoke-interface {v0, v1}, Lcom/jeremyliao/liveeventbus/core/Observable;->post(Ljava/lang/Object;)V

    .line 292
    .line 293
    .line 294
    return-void
.end method

.method public onResume()V
    .locals 6

    .line 1
    invoke-super {p0}, Landroidx/fragment/app/Fragment;->onResume()V

    .line 2
    .line 3
    .line 4
    invoke-static {p0}, Landroidx/lifecycle/LifecycleOwnerKt;->getLifecycleScope(Landroidx/lifecycle/LifecycleOwner;)Landroidx/lifecycle/LifecycleCoroutineScope;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    new-instance v3, Lcom/friday/paint/view/StudentPaintFragment$onResume$1;

    .line 9
    .line 10
    const/4 v1, 0x0

    .line 11
    invoke-direct {v3, p0, v1}, Lcom/friday/paint/view/StudentPaintFragment$onResume$1;-><init>(Lcom/friday/paint/view/StudentPaintFragment;Lvc/c;)V

    .line 12
    .line 13
    .line 14
    const/4 v4, 0x3

    .line 15
    const/4 v5, 0x0

    .line 16
    const/4 v2, 0x0

    .line 17
    invoke-static/range {v0 .. v5}, Lsd/f;->d(Lsd/i0;Lkotlin/coroutines/d;Lkotlinx/coroutines/CoroutineStart;Lhd/p;ILjava/lang/Object;)Lkotlinx/coroutines/g;

    .line 18
    .line 19
    .line 20
    return-void
.end method

.method public final saveScreenShoot(Ljava/lang/String;Z)V
    .locals 8

    .line 1
    if-eqz p2, :cond_0

    .line 2
    .line 3
    invoke-static {}, Lcom/blankj/utilcode/util/PathUtils;->getExternalAppCachePath()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object p2

    .line 7
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 8
    .line 9
    .line 10
    move-result-wide v0

    .line 11
    new-instance v2, Ljava/lang/StringBuilder;

    .line 12
    .line 13
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 14
    .line 15
    .line 16
    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 17
    .line 18
    .line 19
    const-string p2, "/"

    .line 20
    .line 21
    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 22
    .line 23
    .line 24
    invoke-virtual {v2, v0, v1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 25
    .line 26
    .line 27
    const-string p2, ".webp"

    .line 28
    .line 29
    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 30
    .line 31
    .line 32
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object p2

    .line 36
    invoke-virtual {p0, p1}, Lcom/friday/paint/view/StudentPaintFragment;->base64ToBitmap(Ljava/lang/String;)Landroid/graphics/Bitmap;

    .line 37
    .line 38
    .line 39
    move-result-object p1

    .line 40
    sget-object v0, Landroid/graphics/Bitmap$CompressFormat;->WEBP:Landroid/graphics/Bitmap$CompressFormat;

    .line 41
    .line 42
    const/16 v1, 0x46

    .line 43
    .line 44
    invoke-static {p1, p2, v0, v1}, Lcom/blankj/utilcode/util/ImageUtils;->save(Landroid/graphics/Bitmap;Ljava/lang/String;Landroid/graphics/Bitmap$CompressFormat;I)Z

    .line 45
    .line 46
    .line 47
    move-object v3, p2

    .line 48
    goto :goto_0

    .line 49
    :cond_0
    move-object v3, p1

    .line 50
    :goto_0
    sget-object v2, Lk2/n;->a:Lk2/n$a;

    .line 51
    .line 52
    const/4 v6, 0x6

    .line 53
    const/4 v7, 0x0

    .line 54
    const/4 v4, 0x0

    .line 55
    const/4 v5, 0x0

    .line 56
    invoke-static/range {v2 .. v7}, Lk2/n$a;->b(Lk2/n$a;Ljava/lang/String;Ljava/lang/String;IILjava/lang/Object;)V

    .line 57
    .line 58
    .line 59
    return-void
.end method

.method public final startBtEnableStatusJob()V
    .locals 9

    .line 1
    iget-object v0, p0, Lcom/friday/paint/view/StudentPaintFragment;->w:Lkotlinx/coroutines/g;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    const/4 v2, 0x1

    .line 7
    invoke-static {v0, v1, v2, v1}, Lkotlinx/coroutines/g$a;->a(Lkotlinx/coroutines/g;Ljava/util/concurrent/CancellationException;ILjava/lang/Object;)V

    .line 8
    .line 9
    .line 10
    :cond_0
    invoke-static {p0}, Landroidx/lifecycle/LifecycleOwnerKt;->getLifecycleScope(Landroidx/lifecycle/LifecycleOwner;)Landroidx/lifecycle/LifecycleCoroutineScope;

    .line 11
    .line 12
    .line 13
    move-result-object v3

    .line 14
    new-instance v6, Lcom/friday/paint/view/StudentPaintFragment$startBtEnableStatusJob$1;

    .line 15
    .line 16
    invoke-direct {v6, p0, v1}, Lcom/friday/paint/view/StudentPaintFragment$startBtEnableStatusJob$1;-><init>(Lcom/friday/paint/view/StudentPaintFragment;Lvc/c;)V

    .line 17
    .line 18
    .line 19
    const/4 v7, 0x3

    .line 20
    const/4 v8, 0x0

    .line 21
    const/4 v4, 0x0

    .line 22
    const/4 v5, 0x0

    .line 23
    invoke-static/range {v3 .. v8}, Lsd/f;->d(Lsd/i0;Lkotlin/coroutines/d;Lkotlinx/coroutines/CoroutineStart;Lhd/p;ILjava/lang/Object;)Lkotlinx/coroutines/g;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    iput-object v0, p0, Lcom/friday/paint/view/StudentPaintFragment;->w:Lkotlinx/coroutines/g;

    .line 28
    .line 29
    return-void
.end method

.method public final submitSubjectiveHomework()V
    .locals 2

    .line 1
    invoke-static {}, Lcom/blankj/utilcode/util/NetworkUtils;->isWifiConnected()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    const-string v0, "\u7f51\u7edc\u5f02\u5e38\uff0c\u63d0\u4ea4\u5931\u8d25\uff0c\u8bf7\u91cd\u8bd5\u3002"

    .line 8
    .line 9
    invoke-static {v0}, Lz1/b;->i(Ljava/lang/CharSequence;)V

    .line 10
    .line 11
    .line 12
    return-void

    .line 13
    :cond_0
    const/4 v0, 0x1

    .line 14
    invoke-virtual {p0, v0}, Lcom/friday/common/base/BaseFragment;->isShowLoading(Z)V

    .line 15
    .line 16
    .line 17
    const-string v0, "updateThumbnailForHomework"

    .line 18
    .line 19
    invoke-static {v0}, Lcom/jeremyliao/liveeventbus/LiveEventBus;->get(Ljava/lang/String;)Lcom/jeremyliao/liveeventbus/core/Observable;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    const/4 v1, 0x0

    .line 24
    invoke-interface {v0, v1}, Lcom/jeremyliao/liveeventbus/core/Observable;->post(Ljava/lang/Object;)V

    .line 25
    .line 26
    .line 27
    invoke-virtual {p0}, Lcom/friday/paint/view/StudentPaintFragment;->startBtEnableStatusJob()V

    .line 28
    .line 29
    .line 30
    return-void
.end method

.method public final y1()Lcom/friday/paint/viewmodel/NoteViewModel;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/friday/paint/view/StudentPaintFragment;->s:Lqc/d;

    .line 2
    .line 3
    invoke-interface {v0}, Lqc/d;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lcom/friday/paint/viewmodel/NoteViewModel;

    .line 8
    .line 9
    return-object v0
.end method
