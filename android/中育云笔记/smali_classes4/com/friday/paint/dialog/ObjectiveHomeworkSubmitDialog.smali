.class public final Lcom/friday/paint/dialog/ObjectiveHomeworkSubmitDialog;
.super Lcom/friday/common/base/BaseDialogFragment;
.source "SourceFile"


# annotations
.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x0
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/friday/common/base/BaseDialogFragment<",
        "Lcom/friday/paint/databinding/WindowObjectiveHomeworkBinding;",
        ">;"
    }
.end annotation


# instance fields
.field public final f:Lqc/d;

.field public g:Lcom/friday/paint/adapter/OptionsListAdapter;

.field public h:Lkotlinx/coroutines/g;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 4

    .line 1
    invoke-direct {p0}, Lcom/friday/common/base/BaseDialogFragment;-><init>()V

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
    new-instance v1, Lcom/friday/paint/dialog/ObjectiveHomeworkSubmitDialog$special$$inlined$activityViewModels$default$1;

    .line 11
    .line 12
    invoke-direct {v1, p0}, Lcom/friday/paint/dialog/ObjectiveHomeworkSubmitDialog$special$$inlined$activityViewModels$default$1;-><init>(Landroidx/fragment/app/Fragment;)V

    .line 13
    .line 14
    .line 15
    new-instance v2, Lcom/friday/paint/dialog/ObjectiveHomeworkSubmitDialog$special$$inlined$activityViewModels$default$2;

    .line 16
    .line 17
    const/4 v3, 0x0

    .line 18
    invoke-direct {v2, v3, p0}, Lcom/friday/paint/dialog/ObjectiveHomeworkSubmitDialog$special$$inlined$activityViewModels$default$2;-><init>(Lhd/a;Landroidx/fragment/app/Fragment;)V

    .line 19
    .line 20
    .line 21
    new-instance v3, Lcom/friday/paint/dialog/ObjectiveHomeworkSubmitDialog$special$$inlined$activityViewModels$default$3;

    .line 22
    .line 23
    invoke-direct {v3, p0}, Lcom/friday/paint/dialog/ObjectiveHomeworkSubmitDialog$special$$inlined$activityViewModels$default$3;-><init>(Landroidx/fragment/app/Fragment;)V

    .line 24
    .line 25
    .line 26
    invoke-static {p0, v0, v1, v2, v3}, Landroidx/fragment/app/FragmentViewModelLazyKt;->createViewModelLazy(Landroidx/fragment/app/Fragment;Lod/c;Lhd/a;Lhd/a;Lhd/a;)Lqc/d;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    iput-object v0, p0, Lcom/friday/paint/dialog/ObjectiveHomeworkSubmitDialog;->f:Lqc/d;

    .line 31
    .line 32
    return-void
.end method

.method public static final A(Lcom/friday/paint/dialog/ObjectiveHomeworkSubmitDialog;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Landroidx/fragment/app/DialogFragment;->dismissAllowingStateLoss()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static final B(Lcom/friday/paint/dialog/ObjectiveHomeworkSubmitDialog;ZLjava/lang/Boolean;)Lqc/q;
    .locals 3

    .line 1
    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 2
    .line 3
    .line 4
    move-result p2

    .line 5
    const-string v0, "\u6211\u7684\u7b54\u6848"

    .line 6
    .line 7
    const/4 v1, 0x0

    .line 8
    const/16 v2, 0x8

    .line 9
    .line 10
    if-eqz p2, :cond_0

    .line 11
    .line 12
    invoke-virtual {p0}, Lcom/friday/common/base/BaseDialogFragment;->getMBinding()Landroidx/databinding/ViewDataBinding;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    check-cast p1, Lcom/friday/paint/databinding/WindowObjectiveHomeworkBinding;

    .line 17
    .line 18
    iget-object p1, p1, Lcom/friday/paint/databinding/WindowObjectiveHomeworkBinding;->d:Lcom/friday/paint/databinding/LayoutStudentObjectiveBinding;

    .line 19
    .line 20
    iget-object p1, p1, Lcom/friday/paint/databinding/LayoutStudentObjectiveBinding;->f:Landroid/widget/TextView;

    .line 21
    .line 22
    invoke-virtual {p1, v2}, Landroid/view/View;->setVisibility(I)V

    .line 23
    .line 24
    .line 25
    invoke-virtual {p0}, Lcom/friday/common/base/BaseDialogFragment;->getMBinding()Landroidx/databinding/ViewDataBinding;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    check-cast p1, Lcom/friday/paint/databinding/WindowObjectiveHomeworkBinding;

    .line 30
    .line 31
    iget-object p1, p1, Lcom/friday/paint/databinding/WindowObjectiveHomeworkBinding;->d:Lcom/friday/paint/databinding/LayoutStudentObjectiveBinding;

    .line 32
    .line 33
    iget-object p1, p1, Lcom/friday/paint/databinding/LayoutStudentObjectiveBinding;->d:Landroid/widget/TextView;

    .line 34
    .line 35
    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 36
    .line 37
    .line 38
    invoke-virtual {p0}, Lcom/friday/common/base/BaseDialogFragment;->getMBinding()Landroidx/databinding/ViewDataBinding;

    .line 39
    .line 40
    .line 41
    move-result-object p1

    .line 42
    check-cast p1, Lcom/friday/paint/databinding/WindowObjectiveHomeworkBinding;

    .line 43
    .line 44
    iget-object p1, p1, Lcom/friday/paint/databinding/WindowObjectiveHomeworkBinding;->d:Lcom/friday/paint/databinding/LayoutStudentObjectiveBinding;

    .line 45
    .line 46
    iget-object p1, p1, Lcom/friday/paint/databinding/LayoutStudentObjectiveBinding;->e:Landroid/widget/TextView;

    .line 47
    .line 48
    const-string p2, "\u5df2\u622a\u6b62"

    .line 49
    .line 50
    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 51
    .line 52
    .line 53
    invoke-virtual {p0}, Lcom/friday/common/base/BaseDialogFragment;->getMBinding()Landroidx/databinding/ViewDataBinding;

    .line 54
    .line 55
    .line 56
    move-result-object p0

    .line 57
    check-cast p0, Lcom/friday/paint/databinding/WindowObjectiveHomeworkBinding;

    .line 58
    .line 59
    iget-object p0, p0, Lcom/friday/paint/databinding/WindowObjectiveHomeworkBinding;->d:Lcom/friday/paint/databinding/LayoutStudentObjectiveBinding;

    .line 60
    .line 61
    iget-object p0, p0, Lcom/friday/paint/databinding/LayoutStudentObjectiveBinding;->e:Landroid/widget/TextView;

    .line 62
    .line 63
    invoke-virtual {p0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 64
    .line 65
    .line 66
    goto/16 :goto_0

    .line 67
    .line 68
    :cond_0
    if-eqz p1, :cond_1

    .line 69
    .line 70
    invoke-virtual {p0}, Lcom/friday/common/base/BaseDialogFragment;->getMBinding()Landroidx/databinding/ViewDataBinding;

    .line 71
    .line 72
    .line 73
    move-result-object p1

    .line 74
    check-cast p1, Lcom/friday/paint/databinding/WindowObjectiveHomeworkBinding;

    .line 75
    .line 76
    iget-object p1, p1, Lcom/friday/paint/databinding/WindowObjectiveHomeworkBinding;->d:Lcom/friday/paint/databinding/LayoutStudentObjectiveBinding;

    .line 77
    .line 78
    iget-object p1, p1, Lcom/friday/paint/databinding/LayoutStudentObjectiveBinding;->f:Landroid/widget/TextView;

    .line 79
    .line 80
    invoke-virtual {p1, v2}, Landroid/view/View;->setVisibility(I)V

    .line 81
    .line 82
    .line 83
    invoke-virtual {p0}, Lcom/friday/common/base/BaseDialogFragment;->getMBinding()Landroidx/databinding/ViewDataBinding;

    .line 84
    .line 85
    .line 86
    move-result-object p1

    .line 87
    check-cast p1, Lcom/friday/paint/databinding/WindowObjectiveHomeworkBinding;

    .line 88
    .line 89
    iget-object p1, p1, Lcom/friday/paint/databinding/WindowObjectiveHomeworkBinding;->d:Lcom/friday/paint/databinding/LayoutStudentObjectiveBinding;

    .line 90
    .line 91
    iget-object p1, p1, Lcom/friday/paint/databinding/LayoutStudentObjectiveBinding;->d:Landroid/widget/TextView;

    .line 92
    .line 93
    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 94
    .line 95
    .line 96
    invoke-virtual {p0}, Lcom/friday/common/base/BaseDialogFragment;->getMBinding()Landroidx/databinding/ViewDataBinding;

    .line 97
    .line 98
    .line 99
    move-result-object p1

    .line 100
    check-cast p1, Lcom/friday/paint/databinding/WindowObjectiveHomeworkBinding;

    .line 101
    .line 102
    iget-object p1, p1, Lcom/friday/paint/databinding/WindowObjectiveHomeworkBinding;->d:Lcom/friday/paint/databinding/LayoutStudentObjectiveBinding;

    .line 103
    .line 104
    iget-object p1, p1, Lcom/friday/paint/databinding/LayoutStudentObjectiveBinding;->e:Landroid/widget/TextView;

    .line 105
    .line 106
    const-string p2, "\u5df2\u63d0\u4ea4"

    .line 107
    .line 108
    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 109
    .line 110
    .line 111
    invoke-virtual {p0}, Lcom/friday/common/base/BaseDialogFragment;->getMBinding()Landroidx/databinding/ViewDataBinding;

    .line 112
    .line 113
    .line 114
    move-result-object p0

    .line 115
    check-cast p0, Lcom/friday/paint/databinding/WindowObjectiveHomeworkBinding;

    .line 116
    .line 117
    iget-object p0, p0, Lcom/friday/paint/databinding/WindowObjectiveHomeworkBinding;->d:Lcom/friday/paint/databinding/LayoutStudentObjectiveBinding;

    .line 118
    .line 119
    iget-object p0, p0, Lcom/friday/paint/databinding/LayoutStudentObjectiveBinding;->e:Landroid/widget/TextView;

    .line 120
    .line 121
    invoke-virtual {p0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 122
    .line 123
    .line 124
    goto :goto_0

    .line 125
    :cond_1
    invoke-virtual {p0}, Lcom/friday/common/base/BaseDialogFragment;->getMBinding()Landroidx/databinding/ViewDataBinding;

    .line 126
    .line 127
    .line 128
    move-result-object p1

    .line 129
    check-cast p1, Lcom/friday/paint/databinding/WindowObjectiveHomeworkBinding;

    .line 130
    .line 131
    iget-object p1, p1, Lcom/friday/paint/databinding/WindowObjectiveHomeworkBinding;->d:Lcom/friday/paint/databinding/LayoutStudentObjectiveBinding;

    .line 132
    .line 133
    iget-object p1, p1, Lcom/friday/paint/databinding/LayoutStudentObjectiveBinding;->e:Landroid/widget/TextView;

    .line 134
    .line 135
    invoke-virtual {p1, v2}, Landroid/view/View;->setVisibility(I)V

    .line 136
    .line 137
    .line 138
    invoke-virtual {p0}, Lcom/friday/common/base/BaseDialogFragment;->getMBinding()Landroidx/databinding/ViewDataBinding;

    .line 139
    .line 140
    .line 141
    move-result-object p1

    .line 142
    check-cast p1, Lcom/friday/paint/databinding/WindowObjectiveHomeworkBinding;

    .line 143
    .line 144
    iget-object p1, p1, Lcom/friday/paint/databinding/WindowObjectiveHomeworkBinding;->d:Lcom/friday/paint/databinding/LayoutStudentObjectiveBinding;

    .line 145
    .line 146
    iget-object p1, p1, Lcom/friday/paint/databinding/LayoutStudentObjectiveBinding;->f:Landroid/widget/TextView;

    .line 147
    .line 148
    invoke-virtual {p1, v1}, Landroid/view/View;->setVisibility(I)V

    .line 149
    .line 150
    .line 151
    invoke-virtual {p0}, Lcom/friday/paint/dialog/ObjectiveHomeworkSubmitDialog;->x()Lcom/friday/paint/viewmodel/DoHomeworkViewModel;

    .line 152
    .line 153
    .line 154
    move-result-object p1

    .line 155
    invoke-virtual {p1}, Lcom/friday/paint/viewmodel/DoHomeworkViewModel;->r()Z

    .line 156
    .line 157
    .line 158
    move-result p1

    .line 159
    if-eqz p1, :cond_2

    .line 160
    .line 161
    invoke-virtual {p0}, Lcom/friday/common/base/BaseDialogFragment;->getMBinding()Landroidx/databinding/ViewDataBinding;

    .line 162
    .line 163
    .line 164
    move-result-object p0

    .line 165
    check-cast p0, Lcom/friday/paint/databinding/WindowObjectiveHomeworkBinding;

    .line 166
    .line 167
    iget-object p0, p0, Lcom/friday/paint/databinding/WindowObjectiveHomeworkBinding;->d:Lcom/friday/paint/databinding/LayoutStudentObjectiveBinding;

    .line 168
    .line 169
    iget-object p0, p0, Lcom/friday/paint/databinding/LayoutStudentObjectiveBinding;->d:Landroid/widget/TextView;

    .line 170
    .line 171
    const-string p1, "\u5355\u9009\u9898"

    .line 172
    .line 173
    invoke-virtual {p0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 174
    .line 175
    .line 176
    goto :goto_0

    .line 177
    :cond_2
    invoke-virtual {p0}, Lcom/friday/common/base/BaseDialogFragment;->getMBinding()Landroidx/databinding/ViewDataBinding;

    .line 178
    .line 179
    .line 180
    move-result-object p0

    .line 181
    check-cast p0, Lcom/friday/paint/databinding/WindowObjectiveHomeworkBinding;

    .line 182
    .line 183
    iget-object p0, p0, Lcom/friday/paint/databinding/WindowObjectiveHomeworkBinding;->d:Lcom/friday/paint/databinding/LayoutStudentObjectiveBinding;

    .line 184
    .line 185
    iget-object p0, p0, Lcom/friday/paint/databinding/LayoutStudentObjectiveBinding;->d:Landroid/widget/TextView;

    .line 186
    .line 187
    const-string p1, "\u591a\u9009\u9898"

    .line 188
    .line 189
    invoke-virtual {p0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 190
    .line 191
    .line 192
    :goto_0
    sget-object p0, Lqc/q;->a:Lqc/q;

    .line 193
    .line 194
    return-object p0
.end method

.method public static final C(Lcom/friday/paint/dialog/ObjectiveHomeworkSubmitDialog;Ljava/lang/String;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/friday/paint/dialog/ObjectiveHomeworkSubmitDialog;->h:Lkotlinx/coroutines/g;

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
    const-string v0, "NORMAL"

    .line 11
    .line 12
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 13
    .line 14
    .line 15
    move-result p1

    .line 16
    if-eqz p1, :cond_2

    .line 17
    .line 18
    invoke-virtual {p0}, Lcom/friday/common/base/BaseDialogFragment;->getMBinding()Landroidx/databinding/ViewDataBinding;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    check-cast p1, Lcom/friday/paint/databinding/WindowObjectiveHomeworkBinding;

    .line 23
    .line 24
    iget-object p1, p1, Lcom/friday/paint/databinding/WindowObjectiveHomeworkBinding;->e:Lcom/friday/paint/databinding/LayoutObjectiveConfirmBinding;

    .line 25
    .line 26
    invoke-virtual {p1}, Landroidx/databinding/ViewDataBinding;->getRoot()Landroid/view/View;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    const/16 v0, 0x8

    .line 31
    .line 32
    invoke-virtual {p1, v0}, Landroid/view/View;->setVisibility(I)V

    .line 33
    .line 34
    .line 35
    invoke-virtual {p0}, Lcom/friday/common/base/BaseDialogFragment;->getMBinding()Landroidx/databinding/ViewDataBinding;

    .line 36
    .line 37
    .line 38
    move-result-object p1

    .line 39
    check-cast p1, Lcom/friday/paint/databinding/WindowObjectiveHomeworkBinding;

    .line 40
    .line 41
    iget-object p1, p1, Lcom/friday/paint/databinding/WindowObjectiveHomeworkBinding;->d:Lcom/friday/paint/databinding/LayoutStudentObjectiveBinding;

    .line 42
    .line 43
    invoke-virtual {p1}, Landroidx/databinding/ViewDataBinding;->getRoot()Landroid/view/View;

    .line 44
    .line 45
    .line 46
    move-result-object p1

    .line 47
    const/4 v2, 0x0

    .line 48
    invoke-virtual {p1, v2}, Landroid/view/View;->setVisibility(I)V

    .line 49
    .line 50
    .line 51
    invoke-virtual {p0}, Lcom/friday/common/base/BaseDialogFragment;->getMBinding()Landroidx/databinding/ViewDataBinding;

    .line 52
    .line 53
    .line 54
    move-result-object p1

    .line 55
    check-cast p1, Lcom/friday/paint/databinding/WindowObjectiveHomeworkBinding;

    .line 56
    .line 57
    iget-object p1, p1, Lcom/friday/paint/databinding/WindowObjectiveHomeworkBinding;->d:Lcom/friday/paint/databinding/LayoutStudentObjectiveBinding;

    .line 58
    .line 59
    iget-object p1, p1, Lcom/friday/paint/databinding/LayoutStudentObjectiveBinding;->f:Landroid/widget/TextView;

    .line 60
    .line 61
    invoke-virtual {p1, v0}, Landroid/view/View;->setVisibility(I)V

    .line 62
    .line 63
    .line 64
    invoke-virtual {p0}, Lcom/friday/common/base/BaseDialogFragment;->getMBinding()Landroidx/databinding/ViewDataBinding;

    .line 65
    .line 66
    .line 67
    move-result-object p1

    .line 68
    check-cast p1, Lcom/friday/paint/databinding/WindowObjectiveHomeworkBinding;

    .line 69
    .line 70
    iget-object p1, p1, Lcom/friday/paint/databinding/WindowObjectiveHomeworkBinding;->d:Lcom/friday/paint/databinding/LayoutStudentObjectiveBinding;

    .line 71
    .line 72
    iget-object p1, p1, Lcom/friday/paint/databinding/LayoutStudentObjectiveBinding;->e:Landroid/widget/TextView;

    .line 73
    .line 74
    const-string v0, "\u5df2\u63d0\u4ea4"

    .line 75
    .line 76
    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 77
    .line 78
    .line 79
    iget-object p1, p0, Lcom/friday/paint/dialog/ObjectiveHomeworkSubmitDialog;->g:Lcom/friday/paint/adapter/OptionsListAdapter;

    .line 80
    .line 81
    if-eqz p1, :cond_1

    .line 82
    .line 83
    invoke-virtual {p1, v1}, Lcom/friday/paint/adapter/OptionsListAdapter;->l(Z)V

    .line 84
    .line 85
    .line 86
    :cond_1
    invoke-virtual {p0}, Lcom/friday/common/base/BaseDialogFragment;->getMBinding()Landroidx/databinding/ViewDataBinding;

    .line 87
    .line 88
    .line 89
    move-result-object p0

    .line 90
    check-cast p0, Lcom/friday/paint/databinding/WindowObjectiveHomeworkBinding;

    .line 91
    .line 92
    iget-object p0, p0, Lcom/friday/paint/databinding/WindowObjectiveHomeworkBinding;->d:Lcom/friday/paint/databinding/LayoutStudentObjectiveBinding;

    .line 93
    .line 94
    iget-object p0, p0, Lcom/friday/paint/databinding/LayoutStudentObjectiveBinding;->e:Landroid/widget/TextView;

    .line 95
    .line 96
    invoke-virtual {p0, v2}, Landroid/view/View;->setVisibility(I)V

    .line 97
    .line 98
    .line 99
    :cond_2
    return-void
.end method

.method public static final D(Lcom/friday/paint/dialog/ObjectiveHomeworkSubmitDialog;Landroid/view/View;)V
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/friday/common/base/BaseDialogFragment;->getMBinding()Landroidx/databinding/ViewDataBinding;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    check-cast p1, Lcom/friday/paint/databinding/WindowObjectiveHomeworkBinding;

    .line 6
    .line 7
    iget-object p1, p1, Lcom/friday/paint/databinding/WindowObjectiveHomeworkBinding;->e:Lcom/friday/paint/databinding/LayoutObjectiveConfirmBinding;

    .line 8
    .line 9
    invoke-virtual {p1}, Landroidx/databinding/ViewDataBinding;->getRoot()Landroid/view/View;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    const/16 v0, 0x8

    .line 14
    .line 15
    invoke-virtual {p1, v0}, Landroid/view/View;->setVisibility(I)V

    .line 16
    .line 17
    .line 18
    invoke-virtual {p0}, Lcom/friday/common/base/BaseDialogFragment;->getMBinding()Landroidx/databinding/ViewDataBinding;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    check-cast p0, Lcom/friday/paint/databinding/WindowObjectiveHomeworkBinding;

    .line 23
    .line 24
    iget-object p0, p0, Lcom/friday/paint/databinding/WindowObjectiveHomeworkBinding;->d:Lcom/friday/paint/databinding/LayoutStudentObjectiveBinding;

    .line 25
    .line 26
    invoke-virtual {p0}, Landroidx/databinding/ViewDataBinding;->getRoot()Landroid/view/View;

    .line 27
    .line 28
    .line 29
    move-result-object p0

    .line 30
    const/4 p1, 0x0

    .line 31
    invoke-virtual {p0, p1}, Landroid/view/View;->setVisibility(I)V

    .line 32
    .line 33
    .line 34
    return-void
.end method

.method public static synthetic q(Lcom/friday/paint/dialog/ObjectiveHomeworkSubmitDialog;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/friday/paint/dialog/ObjectiveHomeworkSubmitDialog;->y(Lcom/friday/paint/dialog/ObjectiveHomeworkSubmitDialog;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic r(Lcom/friday/paint/dialog/ObjectiveHomeworkSubmitDialog;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/friday/paint/dialog/ObjectiveHomeworkSubmitDialog;->A(Lcom/friday/paint/dialog/ObjectiveHomeworkSubmitDialog;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic s(Lcom/friday/paint/dialog/ObjectiveHomeworkSubmitDialog;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/friday/paint/dialog/ObjectiveHomeworkSubmitDialog;->C(Lcom/friday/paint/dialog/ObjectiveHomeworkSubmitDialog;Ljava/lang/String;)V

    return-void
.end method

.method private final startBtEnableStatusJob()V
    .locals 9

    .line 1
    iget-object v0, p0, Lcom/friday/paint/dialog/ObjectiveHomeworkSubmitDialog;->h:Lkotlinx/coroutines/g;

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
    new-instance v6, Lcom/friday/paint/dialog/ObjectiveHomeworkSubmitDialog$startBtEnableStatusJob$1;

    .line 15
    .line 16
    invoke-direct {v6, p0, v1}, Lcom/friday/paint/dialog/ObjectiveHomeworkSubmitDialog$startBtEnableStatusJob$1;-><init>(Lcom/friday/paint/dialog/ObjectiveHomeworkSubmitDialog;Lvc/c;)V

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
    iput-object v0, p0, Lcom/friday/paint/dialog/ObjectiveHomeworkSubmitDialog;->h:Lkotlinx/coroutines/g;

    .line 28
    .line 29
    return-void
.end method

.method public static synthetic t(Ljava/util/List;Lcom/friday/paint/dialog/ObjectiveHomeworkSubmitDialog;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lcom/friday/paint/dialog/ObjectiveHomeworkSubmitDialog;->z(Ljava/util/List;Lcom/friday/paint/dialog/ObjectiveHomeworkSubmitDialog;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic u(Lcom/friday/paint/dialog/ObjectiveHomeworkSubmitDialog;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/friday/paint/dialog/ObjectiveHomeworkSubmitDialog;->D(Lcom/friday/paint/dialog/ObjectiveHomeworkSubmitDialog;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic v(Lcom/friday/paint/dialog/ObjectiveHomeworkSubmitDialog;ZLjava/lang/Boolean;)Lqc/q;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lcom/friday/paint/dialog/ObjectiveHomeworkSubmitDialog;->B(Lcom/friday/paint/dialog/ObjectiveHomeworkSubmitDialog;ZLjava/lang/Boolean;)Lqc/q;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic w(Lcom/friday/paint/dialog/ObjectiveHomeworkSubmitDialog;)Lcom/friday/paint/databinding/WindowObjectiveHomeworkBinding;
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/friday/common/base/BaseDialogFragment;->getMBinding()Landroidx/databinding/ViewDataBinding;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    check-cast p0, Lcom/friday/paint/databinding/WindowObjectiveHomeworkBinding;

    .line 6
    .line 7
    return-object p0
.end method

.method public static final y(Lcom/friday/paint/dialog/ObjectiveHomeworkSubmitDialog;Landroid/view/View;)V
    .locals 7

    .line 1
    invoke-static {}, Lcom/blankj/utilcode/util/NetworkUtils;->isWifiConnected()Z

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    if-nez p1, :cond_0

    .line 6
    .line 7
    const-string p0, "\u7f51\u7edc\u5f02\u5e38\uff0c\u63d0\u4ea4\u5931\u8d25\uff0c\u8bf7\u91cd\u8bd5\u3002"

    .line 8
    .line 9
    invoke-static {p0}, Lz1/b;->i(Ljava/lang/CharSequence;)V

    .line 10
    .line 11
    .line 12
    return-void

    .line 13
    :cond_0
    iget-object p1, p0, Lcom/friday/paint/dialog/ObjectiveHomeworkSubmitDialog;->g:Lcom/friday/paint/adapter/OptionsListAdapter;

    .line 14
    .line 15
    if-eqz p1, :cond_6

    .line 16
    .line 17
    invoke-virtual {p1}, Lcom/chad/library/adapter/base/BaseQuickAdapter;->getData()Ljava/util/List;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    if-eqz p1, :cond_6

    .line 22
    .line 23
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    const/4 v1, 0x1

    .line 28
    const/4 v2, 0x0

    .line 29
    move v3, v2

    .line 30
    :goto_0
    if-ge v3, v0, :cond_4

    .line 31
    .line 32
    invoke-interface {p1, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object v4

    .line 36
    check-cast v4, Lcom/friday/common/entity/OptionListEntity;

    .line 37
    .line 38
    invoke-virtual {v4}, Lcom/friday/common/entity/OptionListEntity;->getList()Ljava/util/List;

    .line 39
    .line 40
    .line 41
    move-result-object v4

    .line 42
    check-cast v4, Ljava/lang/Iterable;

    .line 43
    .line 44
    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 45
    .line 46
    .line 47
    move-result-object v4

    .line 48
    :cond_1
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 49
    .line 50
    .line 51
    move-result v5

    .line 52
    if-eqz v5, :cond_2

    .line 53
    .line 54
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    move-result-object v5

    .line 58
    move-object v6, v5

    .line 59
    check-cast v6, Lcom/friday/common/entity/OptionEntity;

    .line 60
    .line 61
    invoke-virtual {v6}, Lcom/friday/common/entity/OptionEntity;->isSelected()Z

    .line 62
    .line 63
    .line 64
    move-result v6

    .line 65
    if-eqz v6, :cond_1

    .line 66
    .line 67
    goto :goto_1

    .line 68
    :cond_2
    const/4 v5, 0x0

    .line 69
    :goto_1
    check-cast v5, Lcom/friday/common/entity/OptionEntity;

    .line 70
    .line 71
    if-eqz v5, :cond_3

    .line 72
    .line 73
    goto :goto_2

    .line 74
    :cond_3
    move v1, v2

    .line 75
    :goto_2
    add-int/lit8 v3, v3, 0x1

    .line 76
    .line 77
    goto :goto_0

    .line 78
    :cond_4
    if-eqz v1, :cond_5

    .line 79
    .line 80
    invoke-virtual {p0}, Lcom/friday/common/base/BaseDialogFragment;->getMBinding()Landroidx/databinding/ViewDataBinding;

    .line 81
    .line 82
    .line 83
    move-result-object v0

    .line 84
    check-cast v0, Lcom/friday/paint/databinding/WindowObjectiveHomeworkBinding;

    .line 85
    .line 86
    iget-object v0, v0, Lcom/friday/paint/databinding/WindowObjectiveHomeworkBinding;->e:Lcom/friday/paint/databinding/LayoutObjectiveConfirmBinding;

    .line 87
    .line 88
    invoke-virtual {v0}, Landroidx/databinding/ViewDataBinding;->getRoot()Landroid/view/View;

    .line 89
    .line 90
    .line 91
    move-result-object v0

    .line 92
    invoke-virtual {v0, v2}, Landroid/view/View;->setVisibility(I)V

    .line 93
    .line 94
    .line 95
    invoke-virtual {p0}, Lcom/friday/common/base/BaseDialogFragment;->getMBinding()Landroidx/databinding/ViewDataBinding;

    .line 96
    .line 97
    .line 98
    move-result-object v0

    .line 99
    check-cast v0, Lcom/friday/paint/databinding/WindowObjectiveHomeworkBinding;

    .line 100
    .line 101
    iget-object v0, v0, Lcom/friday/paint/databinding/WindowObjectiveHomeworkBinding;->d:Lcom/friday/paint/databinding/LayoutStudentObjectiveBinding;

    .line 102
    .line 103
    invoke-virtual {v0}, Landroidx/databinding/ViewDataBinding;->getRoot()Landroid/view/View;

    .line 104
    .line 105
    .line 106
    move-result-object v0

    .line 107
    const/16 v1, 0x8

    .line 108
    .line 109
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 110
    .line 111
    .line 112
    invoke-virtual {p0}, Lcom/friday/common/base/BaseDialogFragment;->getMBinding()Landroidx/databinding/ViewDataBinding;

    .line 113
    .line 114
    .line 115
    move-result-object v0

    .line 116
    check-cast v0, Lcom/friday/paint/databinding/WindowObjectiveHomeworkBinding;

    .line 117
    .line 118
    iget-object v0, v0, Lcom/friday/paint/databinding/WindowObjectiveHomeworkBinding;->e:Lcom/friday/paint/databinding/LayoutObjectiveConfirmBinding;

    .line 119
    .line 120
    iget-object v0, v0, Lcom/friday/paint/databinding/LayoutObjectiveConfirmBinding;->d:Landroidx/cardview/widget/CardView;

    .line 121
    .line 122
    new-instance v1, La4/h;

    .line 123
    .line 124
    invoke-direct {v1, p1, p0}, La4/h;-><init>(Ljava/util/List;Lcom/friday/paint/dialog/ObjectiveHomeworkSubmitDialog;)V

    .line 125
    .line 126
    .line 127
    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 128
    .line 129
    .line 130
    return-void

    .line 131
    :cond_5
    const-string p0, "\u5168\u90e8\u4f5c\u7b54\u540e\u63d0\u4ea4"

    .line 132
    .line 133
    invoke-static {p0}, Lz1/b;->i(Ljava/lang/CharSequence;)V

    .line 134
    .line 135
    .line 136
    :cond_6
    return-void
.end method

.method public static final z(Ljava/util/List;Lcom/friday/paint/dialog/ObjectiveHomeworkSubmitDialog;Landroid/view/View;)V
    .locals 7

    .line 1
    new-instance p2, Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-direct {p2}, Ljava/util/ArrayList;-><init>()V

    .line 4
    .line 5
    .line 6
    check-cast p0, Ljava/lang/Iterable;

    .line 7
    .line 8
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    const/4 v0, 0x0

    .line 13
    move v1, v0

    .line 14
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 15
    .line 16
    .line 17
    move-result v2

    .line 18
    if-eqz v2, :cond_4

    .line 19
    .line 20
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object v2

    .line 24
    add-int/lit8 v3, v1, 0x1

    .line 25
    .line 26
    if-gez v1, :cond_0

    .line 27
    .line 28
    invoke-static {}, Lrc/w;->w()V

    .line 29
    .line 30
    .line 31
    :cond_0
    check-cast v2, Lcom/friday/common/entity/OptionListEntity;

    .line 32
    .line 33
    invoke-virtual {v2}, Lcom/friday/common/entity/OptionListEntity;->getList()Ljava/util/List;

    .line 34
    .line 35
    .line 36
    move-result-object v1

    .line 37
    check-cast v1, Ljava/lang/Iterable;

    .line 38
    .line 39
    new-instance v2, Ljava/util/ArrayList;

    .line 40
    .line 41
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 42
    .line 43
    .line 44
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 45
    .line 46
    .line 47
    move-result-object v1

    .line 48
    :cond_1
    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 49
    .line 50
    .line 51
    move-result v4

    .line 52
    if-eqz v4, :cond_2

    .line 53
    .line 54
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    move-result-object v4

    .line 58
    move-object v5, v4

    .line 59
    check-cast v5, Lcom/friday/common/entity/OptionEntity;

    .line 60
    .line 61
    invoke-virtual {v5}, Lcom/friday/common/entity/OptionEntity;->isSelected()Z

    .line 62
    .line 63
    .line 64
    move-result v5

    .line 65
    if-eqz v5, :cond_1

    .line 66
    .line 67
    invoke-interface {v2, v4}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 68
    .line 69
    .line 70
    goto :goto_1

    .line 71
    :cond_2
    new-instance v1, Ljava/util/ArrayList;

    .line 72
    .line 73
    const/16 v4, 0xa

    .line 74
    .line 75
    invoke-static {v2, v4}, Lrc/x;->x(Ljava/lang/Iterable;I)I

    .line 76
    .line 77
    .line 78
    move-result v4

    .line 79
    invoke-direct {v1, v4}, Ljava/util/ArrayList;-><init>(I)V

    .line 80
    .line 81
    .line 82
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 83
    .line 84
    .line 85
    move-result v4

    .line 86
    move v5, v0

    .line 87
    :goto_2
    if-ge v5, v4, :cond_3

    .line 88
    .line 89
    invoke-virtual {v2, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 90
    .line 91
    .line 92
    move-result-object v6

    .line 93
    add-int/lit8 v5, v5, 0x1

    .line 94
    .line 95
    check-cast v6, Lcom/friday/common/entity/OptionEntity;

    .line 96
    .line 97
    invoke-virtual {v6}, Lcom/friday/common/entity/OptionEntity;->getOption()Ljava/lang/String;

    .line 98
    .line 99
    .line 100
    move-result-object v6

    .line 101
    invoke-interface {v1, v6}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 102
    .line 103
    .line 104
    goto :goto_2

    .line 105
    :cond_3
    invoke-virtual {p2, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 106
    .line 107
    .line 108
    move v1, v3

    .line 109
    goto :goto_0

    .line 110
    :cond_4
    invoke-virtual {p1, p2}, Lcom/friday/paint/dialog/ObjectiveHomeworkSubmitDialog;->F(Ljava/util/List;)V

    .line 111
    .line 112
    .line 113
    invoke-virtual {p1}, Lcom/friday/common/base/BaseDialogFragment;->getMBinding()Landroidx/databinding/ViewDataBinding;

    .line 114
    .line 115
    .line 116
    move-result-object p0

    .line 117
    check-cast p0, Lcom/friday/paint/databinding/WindowObjectiveHomeworkBinding;

    .line 118
    .line 119
    iget-object p0, p0, Lcom/friday/paint/databinding/WindowObjectiveHomeworkBinding;->e:Lcom/friday/paint/databinding/LayoutObjectiveConfirmBinding;

    .line 120
    .line 121
    invoke-virtual {p0}, Landroidx/databinding/ViewDataBinding;->getRoot()Landroid/view/View;

    .line 122
    .line 123
    .line 124
    move-result-object p0

    .line 125
    const/16 p2, 0x8

    .line 126
    .line 127
    invoke-virtual {p0, p2}, Landroid/view/View;->setVisibility(I)V

    .line 128
    .line 129
    .line 130
    invoke-virtual {p1}, Lcom/friday/common/base/BaseDialogFragment;->getMBinding()Landroidx/databinding/ViewDataBinding;

    .line 131
    .line 132
    .line 133
    move-result-object p0

    .line 134
    check-cast p0, Lcom/friday/paint/databinding/WindowObjectiveHomeworkBinding;

    .line 135
    .line 136
    iget-object p0, p0, Lcom/friday/paint/databinding/WindowObjectiveHomeworkBinding;->d:Lcom/friday/paint/databinding/LayoutStudentObjectiveBinding;

    .line 137
    .line 138
    invoke-virtual {p0}, Landroidx/databinding/ViewDataBinding;->getRoot()Landroid/view/View;

    .line 139
    .line 140
    .line 141
    move-result-object p0

    .line 142
    invoke-virtual {p0, v0}, Landroid/view/View;->setVisibility(I)V

    .line 143
    .line 144
    .line 145
    invoke-direct {p1}, Lcom/friday/paint/dialog/ObjectiveHomeworkSubmitDialog;->startBtEnableStatusJob()V

    .line 146
    .line 147
    .line 148
    return-void
.end method


# virtual methods
.method public final E(I)Ljava/lang/String;
    .locals 0

    .line 1
    packed-switch p1, :pswitch_data_0

    .line 2
    .line 3
    .line 4
    const-string p1, ""

    .line 5
    .line 6
    return-object p1

    .line 7
    :pswitch_0
    const-string p1, "H"

    .line 8
    .line 9
    return-object p1

    .line 10
    :pswitch_1
    const-string p1, "G"

    .line 11
    .line 12
    return-object p1

    .line 13
    :pswitch_2
    const-string p1, "F"

    .line 14
    .line 15
    return-object p1

    .line 16
    :pswitch_3
    const-string p1, "E"

    .line 17
    .line 18
    return-object p1

    .line 19
    :pswitch_4
    const-string p1, "D"

    .line 20
    .line 21
    return-object p1

    .line 22
    :pswitch_5
    const-string p1, "C"

    .line 23
    .line 24
    return-object p1

    .line 25
    :pswitch_6
    const-string p1, "B"

    .line 26
    .line 27
    return-object p1

    .line 28
    :pswitch_7
    const-string p1, "A"

    .line 29
    .line 30
    return-object p1

    .line 31
    :pswitch_data_0
    .packed-switch 0x1
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

.method public final F(Ljava/util/List;)V
    .locals 16

    .line 1
    new-instance v5, Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 4
    .line 5
    .line 6
    move-object/from16 v0, p1

    .line 7
    .line 8
    check-cast v0, Ljava/lang/Iterable;

    .line 9
    .line 10
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 15
    .line 16
    .line 17
    move-result v1

    .line 18
    if-eqz v1, :cond_1

    .line 19
    .line 20
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    check-cast v1, Ljava/util/List;

    .line 25
    .line 26
    new-instance v2, Ljava/lang/StringBuffer;

    .line 27
    .line 28
    invoke-direct {v2}, Ljava/lang/StringBuffer;-><init>()V

    .line 29
    .line 30
    .line 31
    check-cast v1, Ljava/lang/Iterable;

    .line 32
    .line 33
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 34
    .line 35
    .line 36
    move-result-object v1

    .line 37
    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 38
    .line 39
    .line 40
    move-result v3

    .line 41
    if-eqz v3, :cond_0

    .line 42
    .line 43
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object v3

    .line 47
    check-cast v3, Ljava/lang/String;

    .line 48
    .line 49
    invoke-virtual {v2, v3}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 50
    .line 51
    .line 52
    goto :goto_1

    .line 53
    :cond_0
    invoke-virtual {v2}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    .line 54
    .line 55
    .line 56
    move-result-object v1

    .line 57
    invoke-virtual {v5, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 58
    .line 59
    .line 60
    goto :goto_0

    .line 61
    :cond_1
    const-class v0, Lcom/friday/common/entity/MqttEntity;

    .line 62
    .line 63
    invoke-static {v0}, Lcom/jeremyliao/liveeventbus/LiveEventBus;->get(Ljava/lang/Class;)Lcom/jeremyliao/liveeventbus/core/Observable;

    .line 64
    .line 65
    .line 66
    move-result-object v8

    .line 67
    new-instance v9, Lcom/friday/common/entity/MqttEntity;

    .line 68
    .line 69
    sget-object v10, Lcom/friday/common/entity/MqttType;->REQUEST_SUBMIT_HOMEWORK:Lcom/friday/common/entity/MqttType;

    .line 70
    .line 71
    new-instance v11, Lcom/friday/common/classtest/MqttResponse;

    .line 72
    .line 73
    invoke-virtual/range {p0 .. p0}, Lcom/friday/paint/dialog/ObjectiveHomeworkSubmitDialog;->x()Lcom/friday/paint/viewmodel/DoHomeworkViewModel;

    .line 74
    .line 75
    .line 76
    move-result-object v0

    .line 77
    invoke-virtual {v0}, Lcom/friday/paint/viewmodel/DoHomeworkViewModel;->l()Lcom/friday/common/classtest/MqttResponse;

    .line 78
    .line 79
    .line 80
    move-result-object v0

    .line 81
    if-eqz v0, :cond_2

    .line 82
    .line 83
    invoke-virtual {v0}, Lcom/friday/common/classtest/MqttResponse;->getGuid()Ljava/lang/String;

    .line 84
    .line 85
    .line 86
    move-result-object v0

    .line 87
    goto :goto_2

    .line 88
    :cond_2
    const/4 v0, 0x0

    .line 89
    :goto_2
    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 90
    .line 91
    .line 92
    move-result-object v12

    .line 93
    new-instance v0, Lcom/friday/common/classtest/MqttResponse$Data;

    .line 94
    .line 95
    invoke-virtual/range {p0 .. p0}, Lcom/friday/paint/dialog/ObjectiveHomeworkSubmitDialog;->x()Lcom/friday/paint/viewmodel/DoHomeworkViewModel;

    .line 96
    .line 97
    .line 98
    move-result-object v1

    .line 99
    invoke-virtual {v1}, Lcom/friday/paint/viewmodel/DoHomeworkViewModel;->r()Z

    .line 100
    .line 101
    .line 102
    move-result v1

    .line 103
    const/4 v13, 0x1

    .line 104
    if-eqz v1, :cond_3

    .line 105
    .line 106
    move v2, v13

    .line 107
    goto :goto_3

    .line 108
    :cond_3
    const/4 v1, 0x2

    .line 109
    move v2, v1

    .line 110
    :goto_3
    invoke-virtual/range {p0 .. p0}, Lcom/friday/paint/dialog/ObjectiveHomeworkSubmitDialog;->x()Lcom/friday/paint/viewmodel/DoHomeworkViewModel;

    .line 111
    .line 112
    .line 113
    move-result-object v1

    .line 114
    invoke-virtual {v1}, Lcom/friday/paint/viewmodel/DoHomeworkViewModel;->o()I

    .line 115
    .line 116
    .line 117
    move-result v3

    .line 118
    new-instance v4, Lcom/friday/common/classtest/MqttResponse$Student;

    .line 119
    .line 120
    sget-object v1, Lcom/friday/common/helper/b;->a:Lcom/friday/common/helper/b$a;

    .line 121
    .line 122
    invoke-virtual {v1}, Lcom/friday/common/helper/b$a;->a()Lcom/friday/common/helper/b;

    .line 123
    .line 124
    .line 125
    move-result-object v6

    .line 126
    invoke-virtual {v6}, Lcom/friday/common/helper/b;->u()Ljava/lang/String;

    .line 127
    .line 128
    .line 129
    move-result-object v6

    .line 130
    invoke-virtual {v1}, Lcom/friday/common/helper/b$a;->a()Lcom/friday/common/helper/b;

    .line 131
    .line 132
    .line 133
    move-result-object v1

    .line 134
    invoke-virtual {v1}, Lcom/friday/common/helper/b;->t()J

    .line 135
    .line 136
    .line 137
    move-result-wide v14

    .line 138
    invoke-static {v14, v15}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    .line 139
    .line 140
    .line 141
    move-result-object v1

    .line 142
    invoke-direct {v4, v6, v1}, Lcom/friday/common/classtest/MqttResponse$Student;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 143
    .line 144
    .line 145
    const/4 v6, 0x1

    .line 146
    const/4 v7, 0x0

    .line 147
    const-string v1, ""

    .line 148
    .line 149
    invoke-direct/range {v0 .. v7}, Lcom/friday/common/classtest/MqttResponse$Data;-><init>(Ljava/lang/String;IILcom/friday/common/classtest/MqttResponse$Student;Ljava/util/List;ZLcom/friday/common/classtest/MqttResponse$QuestionInfo;)V

    .line 150
    .line 151
    .line 152
    invoke-direct {v11, v12, v13, v0}, Lcom/friday/common/classtest/MqttResponse;-><init>(Ljava/lang/String;ILcom/friday/common/classtest/MqttResponse$Data;)V

    .line 153
    .line 154
    .line 155
    invoke-static {v11}, Lcom/blankj/utilcode/util/GsonUtils;->toJson(Ljava/lang/Object;)Ljava/lang/String;

    .line 156
    .line 157
    .line 158
    move-result-object v11

    .line 159
    const-string v0, "toJson(...)"

    .line 160
    .line 161
    invoke-static {v11, v0}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 162
    .line 163
    .line 164
    const/4 v13, 0x4

    .line 165
    const/4 v14, 0x0

    .line 166
    const/4 v12, 0x0

    .line 167
    invoke-direct/range {v9 .. v14}, Lcom/friday/common/entity/MqttEntity;-><init>(Lcom/friday/common/entity/MqttType;Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/n;)V

    .line 168
    .line 169
    .line 170
    invoke-interface {v8, v9}, Lcom/jeremyliao/liveeventbus/core/Observable;->post(Ljava/lang/Object;)V

    .line 171
    .line 172
    .line 173
    return-void
.end method

.method public getLayoutId()I
    .locals 1

    .line 1
    sget v0, Lcom/friday/paint/R$layout;->window_objective_homework:I

    .line 2
    .line 3
    return v0
.end method

.method public initData()V
    .locals 12

    .line 1
    invoke-virtual {p0}, Lcom/friday/paint/dialog/ObjectiveHomeworkSubmitDialog;->x()Lcom/friday/paint/viewmodel/DoHomeworkViewModel;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Lcom/friday/paint/viewmodel/DoHomeworkViewModel;->i()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    const/4 v1, 0x1

    .line 10
    if-eqz v0, :cond_1

    .line 11
    .line 12
    invoke-virtual {p0}, Lcom/friday/paint/dialog/ObjectiveHomeworkSubmitDialog;->x()Lcom/friday/paint/viewmodel/DoHomeworkViewModel;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    const/4 v2, 0x0

    .line 17
    invoke-virtual {v0, v2}, Lcom/friday/paint/viewmodel/DoHomeworkViewModel;->u(Z)V

    .line 18
    .line 19
    .line 20
    invoke-virtual {p0}, Lcom/friday/paint/dialog/ObjectiveHomeworkSubmitDialog;->x()Lcom/friday/paint/viewmodel/DoHomeworkViewModel;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    invoke-virtual {v0}, Lcom/friday/paint/viewmodel/DoHomeworkViewModel;->f()Ljava/util/ArrayList;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 29
    .line 30
    .line 31
    invoke-virtual {p0}, Lcom/friday/paint/dialog/ObjectiveHomeworkSubmitDialog;->x()Lcom/friday/paint/viewmodel/DoHomeworkViewModel;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    invoke-virtual {v0}, Lcom/friday/paint/viewmodel/DoHomeworkViewModel;->p()I

    .line 36
    .line 37
    .line 38
    move-result v0

    .line 39
    if-gt v1, v0, :cond_1

    .line 40
    .line 41
    move v2, v1

    .line 42
    :goto_0
    new-instance v3, Ljava/util/ArrayList;

    .line 43
    .line 44
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 45
    .line 46
    .line 47
    invoke-virtual {p0}, Lcom/friday/paint/dialog/ObjectiveHomeworkSubmitDialog;->x()Lcom/friday/paint/viewmodel/DoHomeworkViewModel;

    .line 48
    .line 49
    .line 50
    move-result-object v4

    .line 51
    invoke-virtual {v4}, Lcom/friday/paint/viewmodel/DoHomeworkViewModel;->o()I

    .line 52
    .line 53
    .line 54
    move-result v4

    .line 55
    if-gt v1, v4, :cond_0

    .line 56
    .line 57
    move v5, v1

    .line 58
    :goto_1
    new-instance v6, Lcom/friday/common/entity/OptionEntity;

    .line 59
    .line 60
    invoke-virtual {p0}, Lcom/friday/paint/dialog/ObjectiveHomeworkSubmitDialog;->x()Lcom/friday/paint/viewmodel/DoHomeworkViewModel;

    .line 61
    .line 62
    .line 63
    move-result-object v7

    .line 64
    invoke-virtual {v7}, Lcom/friday/paint/viewmodel/DoHomeworkViewModel;->r()Z

    .line 65
    .line 66
    .line 67
    move-result v7

    .line 68
    invoke-virtual {p0, v5}, Lcom/friday/paint/dialog/ObjectiveHomeworkSubmitDialog;->E(I)Ljava/lang/String;

    .line 69
    .line 70
    .line 71
    move-result-object v8

    .line 72
    const/4 v10, 0x4

    .line 73
    const/4 v11, 0x0

    .line 74
    const/4 v9, 0x0

    .line 75
    invoke-direct/range {v6 .. v11}, Lcom/friday/common/entity/OptionEntity;-><init>(ZLjava/lang/String;ZILkotlin/jvm/internal/n;)V

    .line 76
    .line 77
    .line 78
    invoke-virtual {v3, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 79
    .line 80
    .line 81
    if-eq v5, v4, :cond_0

    .line 82
    .line 83
    add-int/lit8 v5, v5, 0x1

    .line 84
    .line 85
    goto :goto_1

    .line 86
    :cond_0
    invoke-virtual {p0}, Lcom/friday/paint/dialog/ObjectiveHomeworkSubmitDialog;->x()Lcom/friday/paint/viewmodel/DoHomeworkViewModel;

    .line 87
    .line 88
    .line 89
    move-result-object v4

    .line 90
    invoke-virtual {v4}, Lcom/friday/paint/viewmodel/DoHomeworkViewModel;->f()Ljava/util/ArrayList;

    .line 91
    .line 92
    .line 93
    move-result-object v4

    .line 94
    new-instance v5, Lcom/friday/common/entity/OptionListEntity;

    .line 95
    .line 96
    invoke-direct {v5, v2, v3}, Lcom/friday/common/entity/OptionListEntity;-><init>(ILjava/util/List;)V

    .line 97
    .line 98
    .line 99
    invoke-virtual {v4, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 100
    .line 101
    .line 102
    if-eq v2, v0, :cond_1

    .line 103
    .line 104
    add-int/lit8 v2, v2, 0x1

    .line 105
    .line 106
    goto :goto_0

    .line 107
    :cond_1
    invoke-virtual {p0}, Lcom/friday/common/base/BaseDialogFragment;->getMBinding()Landroidx/databinding/ViewDataBinding;

    .line 108
    .line 109
    .line 110
    move-result-object v0

    .line 111
    check-cast v0, Lcom/friday/paint/databinding/WindowObjectiveHomeworkBinding;

    .line 112
    .line 113
    iget-object v0, v0, Lcom/friday/paint/databinding/WindowObjectiveHomeworkBinding;->c:Landroid/widget/ImageView;

    .line 114
    .line 115
    new-instance v2, La4/c;

    .line 116
    .line 117
    invoke-direct {v2, p0}, La4/c;-><init>(Lcom/friday/paint/dialog/ObjectiveHomeworkSubmitDialog;)V

    .line 118
    .line 119
    .line 120
    invoke-virtual {v0, v2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 121
    .line 122
    .line 123
    invoke-virtual {p0}, Lcom/friday/paint/dialog/ObjectiveHomeworkSubmitDialog;->x()Lcom/friday/paint/viewmodel/DoHomeworkViewModel;

    .line 124
    .line 125
    .line 126
    move-result-object v0

    .line 127
    invoke-virtual {v0}, Lcom/friday/paint/viewmodel/DoHomeworkViewModel;->j()Landroidx/lifecycle/MutableLiveData;

    .line 128
    .line 129
    .line 130
    move-result-object v0

    .line 131
    invoke-virtual {v0}, Landroidx/lifecycle/LiveData;->getValue()Ljava/lang/Object;

    .line 132
    .line 133
    .line 134
    move-result-object v0

    .line 135
    check-cast v0, Ljava/lang/Boolean;

    .line 136
    .line 137
    invoke-virtual {p0}, Lcom/friday/paint/dialog/ObjectiveHomeworkSubmitDialog;->x()Lcom/friday/paint/viewmodel/DoHomeworkViewModel;

    .line 138
    .line 139
    .line 140
    move-result-object v2

    .line 141
    invoke-virtual {v2}, Lcom/friday/paint/viewmodel/DoHomeworkViewModel;->k()Z

    .line 142
    .line 143
    .line 144
    move-result v2

    .line 145
    invoke-virtual {p0}, Lcom/friday/paint/dialog/ObjectiveHomeworkSubmitDialog;->x()Lcom/friday/paint/viewmodel/DoHomeworkViewModel;

    .line 146
    .line 147
    .line 148
    move-result-object v3

    .line 149
    invoke-virtual {v3}, Lcom/friday/paint/viewmodel/DoHomeworkViewModel;->j()Landroidx/lifecycle/MutableLiveData;

    .line 150
    .line 151
    .line 152
    move-result-object v3

    .line 153
    new-instance v4, La4/d;

    .line 154
    .line 155
    invoke-direct {v4, p0, v2}, La4/d;-><init>(Lcom/friday/paint/dialog/ObjectiveHomeworkSubmitDialog;Z)V

    .line 156
    .line 157
    .line 158
    new-instance v2, Lcom/friday/paint/dialog/ObjectiveHomeworkSubmitDialog$a;

    .line 159
    .line 160
    invoke-direct {v2, v4}, Lcom/friday/paint/dialog/ObjectiveHomeworkSubmitDialog$a;-><init>(Lhd/l;)V

    .line 161
    .line 162
    .line 163
    invoke-virtual {v3, p0, v2}, Landroidx/lifecycle/LiveData;->observe(Landroidx/lifecycle/LifecycleOwner;Landroidx/lifecycle/Observer;)V

    .line 164
    .line 165
    .line 166
    const-string v2, "submitHomeworkReply"

    .line 167
    .line 168
    const-class v3, Ljava/lang/String;

    .line 169
    .line 170
    invoke-static {v2, v3}, Lcom/jeremyliao/liveeventbus/LiveEventBus;->get(Ljava/lang/String;Ljava/lang/Class;)Lcom/jeremyliao/liveeventbus/core/Observable;

    .line 171
    .line 172
    .line 173
    move-result-object v2

    .line 174
    new-instance v3, La4/e;

    .line 175
    .line 176
    invoke-direct {v3, p0}, La4/e;-><init>(Lcom/friday/paint/dialog/ObjectiveHomeworkSubmitDialog;)V

    .line 177
    .line 178
    .line 179
    invoke-interface {v2, p0, v3}, Lcom/jeremyliao/liveeventbus/core/Observable;->observe(Landroidx/lifecycle/LifecycleOwner;Landroidx/lifecycle/Observer;)V

    .line 180
    .line 181
    .line 182
    invoke-virtual {p0}, Lcom/friday/common/base/BaseDialogFragment;->getMBinding()Landroidx/databinding/ViewDataBinding;

    .line 183
    .line 184
    .line 185
    move-result-object v2

    .line 186
    check-cast v2, Lcom/friday/paint/databinding/WindowObjectiveHomeworkBinding;

    .line 187
    .line 188
    iget-object v2, v2, Lcom/friday/paint/databinding/WindowObjectiveHomeworkBinding;->d:Lcom/friday/paint/databinding/LayoutStudentObjectiveBinding;

    .line 189
    .line 190
    iget-object v2, v2, Lcom/friday/paint/databinding/LayoutStudentObjectiveBinding;->c:Landroidx/recyclerview/widget/RecyclerView;

    .line 191
    .line 192
    new-instance v3, Landroidx/recyclerview/widget/LinearLayoutManager;

    .line 193
    .line 194
    invoke-virtual {v2}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 195
    .line 196
    .line 197
    move-result-object v4

    .line 198
    invoke-direct {v3, v4}, Landroidx/recyclerview/widget/LinearLayoutManager;-><init>(Landroid/content/Context;)V

    .line 199
    .line 200
    .line 201
    invoke-virtual {v2, v3}, Landroidx/recyclerview/widget/RecyclerView;->setLayoutManager(Landroidx/recyclerview/widget/RecyclerView$LayoutManager;)V

    .line 202
    .line 203
    .line 204
    new-instance v3, Lcom/friday/paint/adapter/OptionsListAdapter;

    .line 205
    .line 206
    sget v4, Lcom/friday/paint/R$layout;->item_student_objective:I

    .line 207
    .line 208
    invoke-virtual {p0}, Lcom/friday/paint/dialog/ObjectiveHomeworkSubmitDialog;->x()Lcom/friday/paint/viewmodel/DoHomeworkViewModel;

    .line 209
    .line 210
    .line 211
    move-result-object v5

    .line 212
    invoke-virtual {v5}, Lcom/friday/paint/viewmodel/DoHomeworkViewModel;->o()I

    .line 213
    .line 214
    .line 215
    move-result v5

    .line 216
    invoke-virtual {p0}, Lcom/friday/paint/dialog/ObjectiveHomeworkSubmitDialog;->x()Lcom/friday/paint/viewmodel/DoHomeworkViewModel;

    .line 217
    .line 218
    .line 219
    move-result-object v6

    .line 220
    invoke-virtual {v6}, Lcom/friday/paint/viewmodel/DoHomeworkViewModel;->r()Z

    .line 221
    .line 222
    .line 223
    move-result v6

    .line 224
    invoke-direct {v3, v4, v5, v6}, Lcom/friday/paint/adapter/OptionsListAdapter;-><init>(IIZ)V

    .line 225
    .line 226
    .line 227
    iput-object v3, p0, Lcom/friday/paint/dialog/ObjectiveHomeworkSubmitDialog;->g:Lcom/friday/paint/adapter/OptionsListAdapter;

    .line 228
    .line 229
    invoke-virtual {v2, v3}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(Landroidx/recyclerview/widget/RecyclerView$Adapter;)V

    .line 230
    .line 231
    .line 232
    iget-object v2, p0, Lcom/friday/paint/dialog/ObjectiveHomeworkSubmitDialog;->g:Lcom/friday/paint/adapter/OptionsListAdapter;

    .line 233
    .line 234
    if-eqz v2, :cond_3

    .line 235
    .line 236
    if-eqz v0, :cond_2

    .line 237
    .line 238
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 239
    .line 240
    .line 241
    move-result v0

    .line 242
    if-eqz v0, :cond_2

    .line 243
    .line 244
    goto :goto_2

    .line 245
    :cond_2
    invoke-virtual {p0}, Lcom/friday/paint/dialog/ObjectiveHomeworkSubmitDialog;->x()Lcom/friday/paint/viewmodel/DoHomeworkViewModel;

    .line 246
    .line 247
    .line 248
    move-result-object v0

    .line 249
    invoke-virtual {v0}, Lcom/friday/paint/viewmodel/DoHomeworkViewModel;->k()Z

    .line 250
    .line 251
    .line 252
    move-result v1

    .line 253
    :goto_2
    invoke-virtual {v2, v1}, Lcom/friday/paint/adapter/OptionsListAdapter;->l(Z)V

    .line 254
    .line 255
    .line 256
    :cond_3
    iget-object v0, p0, Lcom/friday/paint/dialog/ObjectiveHomeworkSubmitDialog;->g:Lcom/friday/paint/adapter/OptionsListAdapter;

    .line 257
    .line 258
    if-eqz v0, :cond_4

    .line 259
    .line 260
    invoke-virtual {p0}, Lcom/friday/paint/dialog/ObjectiveHomeworkSubmitDialog;->x()Lcom/friday/paint/viewmodel/DoHomeworkViewModel;

    .line 261
    .line 262
    .line 263
    move-result-object v1

    .line 264
    invoke-virtual {v1}, Lcom/friday/paint/viewmodel/DoHomeworkViewModel;->f()Ljava/util/ArrayList;

    .line 265
    .line 266
    .line 267
    move-result-object v1

    .line 268
    invoke-virtual {v0, v1}, Lcom/chad/library/adapter/base/BaseQuickAdapter;->setList(Ljava/util/Collection;)V

    .line 269
    .line 270
    .line 271
    :cond_4
    invoke-virtual {p0}, Lcom/friday/common/base/BaseDialogFragment;->getMBinding()Landroidx/databinding/ViewDataBinding;

    .line 272
    .line 273
    .line 274
    move-result-object v0

    .line 275
    check-cast v0, Lcom/friday/paint/databinding/WindowObjectiveHomeworkBinding;

    .line 276
    .line 277
    iget-object v0, v0, Lcom/friday/paint/databinding/WindowObjectiveHomeworkBinding;->e:Lcom/friday/paint/databinding/LayoutObjectiveConfirmBinding;

    .line 278
    .line 279
    iget-object v0, v0, Lcom/friday/paint/databinding/LayoutObjectiveConfirmBinding;->c:Landroidx/cardview/widget/CardView;

    .line 280
    .line 281
    new-instance v1, La4/f;

    .line 282
    .line 283
    invoke-direct {v1, p0}, La4/f;-><init>(Lcom/friday/paint/dialog/ObjectiveHomeworkSubmitDialog;)V

    .line 284
    .line 285
    .line 286
    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 287
    .line 288
    .line 289
    invoke-virtual {p0}, Lcom/friday/common/base/BaseDialogFragment;->getMBinding()Landroidx/databinding/ViewDataBinding;

    .line 290
    .line 291
    .line 292
    move-result-object v0

    .line 293
    check-cast v0, Lcom/friday/paint/databinding/WindowObjectiveHomeworkBinding;

    .line 294
    .line 295
    iget-object v0, v0, Lcom/friday/paint/databinding/WindowObjectiveHomeworkBinding;->d:Lcom/friday/paint/databinding/LayoutStudentObjectiveBinding;

    .line 296
    .line 297
    iget-object v0, v0, Lcom/friday/paint/databinding/LayoutStudentObjectiveBinding;->f:Landroid/widget/TextView;

    .line 298
    .line 299
    new-instance v1, La4/g;

    .line 300
    .line 301
    invoke-direct {v1, p0}, La4/g;-><init>(Lcom/friday/paint/dialog/ObjectiveHomeworkSubmitDialog;)V

    .line 302
    .line 303
    .line 304
    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 305
    .line 306
    .line 307
    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 1

    .line 1
    invoke-super {p0, p1}, Landroidx/fragment/app/DialogFragment;->onCreate(Landroid/os/Bundle;)V

    .line 2
    .line 3
    .line 4
    const/4 p1, 0x1

    .line 5
    sget v0, Lcom/friday/paint/R$style;->airPlayDialog:I

    .line 6
    .line 7
    invoke-virtual {p0, p1, v0}, Landroidx/fragment/app/DialogFragment;->setStyle(II)V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public onStart()V
    .locals 5

    .line 1
    invoke-virtual {p0}, Landroidx/fragment/app/DialogFragment;->getDialog()Landroid/app/Dialog;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const/4 v1, 0x0

    .line 6
    if-eqz v0, :cond_3

    .line 7
    .line 8
    invoke-virtual {v0}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    if-eqz v0, :cond_3

    .line 13
    .line 14
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getResources()Landroid/content/res/Resources;

    .line 15
    .line 16
    .line 17
    move-result-object v2

    .line 18
    sget v3, Lcom/friday/paint/R$dimen;->view_189:I

    .line 19
    .line 20
    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getDimension(I)F

    .line 21
    .line 22
    .line 23
    move-result v2

    .line 24
    float-to-int v2, v2

    .line 25
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getResources()Landroid/content/res/Resources;

    .line 26
    .line 27
    .line 28
    move-result-object v3

    .line 29
    sget v4, Lcom/friday/paint/R$dimen;->view_243:I

    .line 30
    .line 31
    invoke-virtual {v3, v4}, Landroid/content/res/Resources;->getDimension(I)F

    .line 32
    .line 33
    .line 34
    move-result v3

    .line 35
    float-to-int v3, v3

    .line 36
    invoke-virtual {v0, v2, v3}, Landroid/view/Window;->setLayout(II)V

    .line 37
    .line 38
    .line 39
    invoke-virtual {v0}, Landroid/view/Window;->getAttributes()Landroid/view/WindowManager$LayoutParams;

    .line 40
    .line 41
    .line 42
    move-result-object v2

    .line 43
    if-eqz v2, :cond_0

    .line 44
    .line 45
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getResources()Landroid/content/res/Resources;

    .line 46
    .line 47
    .line 48
    move-result-object v3

    .line 49
    sget v4, Lcom/friday/paint/R$dimen;->view_376:I

    .line 50
    .line 51
    invoke-virtual {v3, v4}, Landroid/content/res/Resources;->getDimension(I)F

    .line 52
    .line 53
    .line 54
    move-result v3

    .line 55
    float-to-int v3, v3

    .line 56
    iput v3, v2, Landroid/view/WindowManager$LayoutParams;->x:I

    .line 57
    .line 58
    :cond_0
    invoke-virtual {v0}, Landroid/view/Window;->getAttributes()Landroid/view/WindowManager$LayoutParams;

    .line 59
    .line 60
    .line 61
    move-result-object v2

    .line 62
    if-eqz v2, :cond_1

    .line 63
    .line 64
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getResources()Landroid/content/res/Resources;

    .line 65
    .line 66
    .line 67
    move-result-object v3

    .line 68
    sget v4, Lcom/friday/paint/R$dimen;->view_71:I

    .line 69
    .line 70
    invoke-virtual {v3, v4}, Landroid/content/res/Resources;->getDimension(I)F

    .line 71
    .line 72
    .line 73
    move-result v3

    .line 74
    float-to-int v3, v3

    .line 75
    iput v3, v2, Landroid/view/WindowManager$LayoutParams;->y:I

    .line 76
    .line 77
    :cond_1
    const v2, 0x800053

    .line 78
    .line 79
    .line 80
    invoke-virtual {v0, v2}, Landroid/view/Window;->setGravity(I)V

    .line 81
    .line 82
    .line 83
    invoke-virtual {v0}, Landroid/view/Window;->getAttributes()Landroid/view/WindowManager$LayoutParams;

    .line 84
    .line 85
    .line 86
    move-result-object v2

    .line 87
    if-eqz v2, :cond_2

    .line 88
    .line 89
    const/4 v3, 0x0

    .line 90
    iput v3, v2, Landroid/view/WindowManager$LayoutParams;->dimAmount:F

    .line 91
    .line 92
    :cond_2
    const/16 v2, 0x8

    .line 93
    .line 94
    invoke-virtual {v0, v2, v2}, Landroid/view/Window;->setFlags(II)V

    .line 95
    .line 96
    .line 97
    new-instance v2, Landroid/graphics/drawable/ColorDrawable;

    .line 98
    .line 99
    invoke-direct {v2, v1}, Landroid/graphics/drawable/ColorDrawable;-><init>(I)V

    .line 100
    .line 101
    .line 102
    invoke-virtual {v0, v2}, Landroid/view/Window;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 103
    .line 104
    .line 105
    :cond_3
    invoke-virtual {p0}, Landroidx/fragment/app/DialogFragment;->getDialog()Landroid/app/Dialog;

    .line 106
    .line 107
    .line 108
    move-result-object v0

    .line 109
    if-eqz v0, :cond_4

    .line 110
    .line 111
    invoke-virtual {v0, v1}, Landroid/app/Dialog;->setCancelable(Z)V

    .line 112
    .line 113
    .line 114
    :cond_4
    invoke-super {p0}, Landroidx/fragment/app/DialogFragment;->onStart()V

    .line 115
    .line 116
    .line 117
    return-void
.end method

.method public final x()Lcom/friday/paint/viewmodel/DoHomeworkViewModel;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/friday/paint/dialog/ObjectiveHomeworkSubmitDialog;->f:Lqc/d;

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
