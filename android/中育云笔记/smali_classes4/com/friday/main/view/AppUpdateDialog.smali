.class public final Lcom/friday/main/view/AppUpdateDialog;
.super Lcom/friday/main/view/Hilt_AppUpdateDialog;
.source "SourceFile"


# annotations
.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x0
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/friday/main/view/AppUpdateDialog$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/friday/main/view/Hilt_AppUpdateDialog<",
        "Lcom/friday/main/databinding/DialogVersionUpdateBinding;",
        ">;"
    }
.end annotation


# instance fields
.field public final k:Lqc/d;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 4

    .line 1
    invoke-direct {p0}, Lcom/friday/main/view/Hilt_AppUpdateDialog;-><init>()V

    .line 2
    .line 3
    .line 4
    const-class v0, Lcom/friday/main/viewmodel/HomeViewModel;

    .line 5
    .line 6
    invoke-static {v0}, Lkotlin/jvm/internal/y;->b(Ljava/lang/Class;)Lod/c;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    new-instance v1, Lcom/friday/main/view/AppUpdateDialog$special$$inlined$activityViewModels$default$1;

    .line 11
    .line 12
    invoke-direct {v1, p0}, Lcom/friday/main/view/AppUpdateDialog$special$$inlined$activityViewModels$default$1;-><init>(Landroidx/fragment/app/Fragment;)V

    .line 13
    .line 14
    .line 15
    new-instance v2, Lcom/friday/main/view/AppUpdateDialog$special$$inlined$activityViewModels$default$2;

    .line 16
    .line 17
    const/4 v3, 0x0

    .line 18
    invoke-direct {v2, v3, p0}, Lcom/friday/main/view/AppUpdateDialog$special$$inlined$activityViewModels$default$2;-><init>(Lhd/a;Landroidx/fragment/app/Fragment;)V

    .line 19
    .line 20
    .line 21
    new-instance v3, Lcom/friday/main/view/AppUpdateDialog$special$$inlined$activityViewModels$default$3;

    .line 22
    .line 23
    invoke-direct {v3, p0}, Lcom/friday/main/view/AppUpdateDialog$special$$inlined$activityViewModels$default$3;-><init>(Landroidx/fragment/app/Fragment;)V

    .line 24
    .line 25
    .line 26
    invoke-static {p0, v0, v1, v2, v3}, Landroidx/fragment/app/FragmentViewModelLazyKt;->createViewModelLazy(Landroidx/fragment/app/Fragment;Lod/c;Lhd/a;Lhd/a;Lhd/a;)Lqc/d;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    iput-object v0, p0, Lcom/friday/main/view/AppUpdateDialog;->k:Lqc/d;

    .line 31
    .line 32
    return-void
.end method

.method public static synthetic r(Lcom/friday/main/view/AppUpdateDialog;Ljava/util/List;)Lqc/q;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/friday/main/view/AppUpdateDialog;->y(Lcom/friday/main/view/AppUpdateDialog;Ljava/util/List;)Lqc/q;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic s(Lcom/friday/main/view/AppUpdateDialog;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/friday/main/view/AppUpdateDialog;->w(Lcom/friday/main/view/AppUpdateDialog;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic t(Lcom/friday/main/view/AppUpdateDialog;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/friday/main/view/AppUpdateDialog;->v(Lcom/friday/main/view/AppUpdateDialog;Landroid/view/View;)V

    return-void
.end method

.method public static final v(Lcom/friday/main/view/AppUpdateDialog;Landroid/view/View;)V
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/friday/main/view/AppUpdateDialog;->u()Lcom/friday/main/viewmodel/HomeViewModel;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-virtual {p1}, Lcom/friday/main/viewmodel/HomeViewModel;->v()Landroidx/lifecycle/MutableLiveData;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    invoke-virtual {p1}, Landroidx/lifecycle/LiveData;->getValue()Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    check-cast p1, Le2/a;

    .line 14
    .line 15
    if-eqz p1, :cond_0

    .line 16
    .line 17
    invoke-virtual {p1}, Le2/a;->b()Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    check-cast p1, Lcom/friday/main/model/VersionUpdate;

    .line 22
    .line 23
    if-eqz p1, :cond_0

    .line 24
    .line 25
    invoke-virtual {p1}, Lcom/friday/main/model/VersionUpdate;->getResult()Lcom/friday/main/model/Result;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    if-eqz p1, :cond_0

    .line 30
    .line 31
    invoke-virtual {p1}, Lcom/friday/main/model/Result;->getFileUrl()Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    goto :goto_0

    .line 36
    :cond_0
    const/4 p1, 0x0

    .line 37
    :goto_0
    const-string v0, "utf-8"

    .line 38
    .line 39
    invoke-static {p1, v0}, Ljava/net/URLDecoder;->decode(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object p1

    .line 43
    const-string v0, "decode(...)"

    .line 44
    .line 45
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 46
    .line 47
    .line 48
    invoke-virtual {p0, p1}, Lcom/friday/main/view/AppUpdateDialog;->x(Ljava/lang/String;)V

    .line 49
    .line 50
    .line 51
    return-void
.end method

.method public static final w(Lcom/friday/main/view/AppUpdateDialog;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/friday/main/view/AppUpdateDialog;->u()Lcom/friday/main/viewmodel/HomeViewModel;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-virtual {p1}, Lcom/friday/main/viewmodel/HomeViewModel;->v()Landroidx/lifecycle/MutableLiveData;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    invoke-virtual {p1}, Landroidx/lifecycle/LiveData;->getValue()Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    check-cast p1, Le2/a;

    .line 14
    .line 15
    if-eqz p1, :cond_0

    .line 16
    .line 17
    invoke-virtual {p1}, Le2/a;->b()Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    check-cast p1, Lcom/friday/main/model/VersionUpdate;

    .line 22
    .line 23
    if-eqz p1, :cond_0

    .line 24
    .line 25
    invoke-virtual {p1}, Lcom/friday/main/model/VersionUpdate;->getResult()Lcom/friday/main/model/Result;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    if-eqz p1, :cond_0

    .line 30
    .line 31
    invoke-virtual {p1}, Lcom/friday/main/model/Result;->getForceUpdate()Z

    .line 32
    .line 33
    .line 34
    move-result p1

    .line 35
    invoke-virtual {p0}, Landroidx/fragment/app/DialogFragment;->dismissAllowingStateLoss()V

    .line 36
    .line 37
    .line 38
    if-eqz p1, :cond_0

    .line 39
    .line 40
    invoke-static {}, Lcom/blankj/utilcode/util/AppUtils;->exitApp()V

    .line 41
    .line 42
    .line 43
    :cond_0
    return-void
.end method

.method public static final y(Lcom/friday/main/view/AppUpdateDialog;Ljava/util/List;)Lqc/q;
    .locals 5

    .line 1
    invoke-static {p1}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 2
    .line 3
    .line 4
    invoke-static {p1}, Lrc/g0;->m0(Ljava/util/List;)Ljava/lang/Object;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    check-cast p1, Landroidx/work/WorkInfo;

    .line 9
    .line 10
    invoke-virtual {p1}, Landroidx/work/WorkInfo;->getState()Landroidx/work/WorkInfo$State;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    sget-object v1, Lcom/friday/main/view/AppUpdateDialog$a;->a:[I

    .line 15
    .line 16
    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    aget v0, v1, v0

    .line 21
    .line 22
    const-string v1, "#ffffff"

    .line 23
    .line 24
    const/4 v2, 0x1

    .line 25
    if-eq v0, v2, :cond_1

    .line 26
    .line 27
    const/4 v3, 0x2

    .line 28
    if-eq v0, v3, :cond_0

    .line 29
    .line 30
    invoke-virtual {p1}, Landroidx/work/WorkInfo;->getProgress()Landroidx/work/Data;

    .line 31
    .line 32
    .line 33
    move-result-object p1

    .line 34
    const-string v0, "progress"

    .line 35
    .line 36
    const/4 v1, 0x0

    .line 37
    invoke-virtual {p1, v0, v1}, Landroidx/work/Data;->getInt(Ljava/lang/String;I)I

    .line 38
    .line 39
    .line 40
    move-result p1

    .line 41
    invoke-virtual {p0}, Lcom/friday/common/base/BaseDialogFragment;->getMBinding()Landroidx/databinding/ViewDataBinding;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    check-cast v0, Lcom/friday/main/databinding/DialogVersionUpdateBinding;

    .line 46
    .line 47
    iget-object v0, v0, Lcom/friday/main/databinding/DialogVersionUpdateBinding;->e:Landroid/widget/TextView;

    .line 48
    .line 49
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setEnabled(Z)V

    .line 50
    .line 51
    .line 52
    invoke-virtual {p0}, Lcom/friday/common/base/BaseDialogFragment;->getMBinding()Landroidx/databinding/ViewDataBinding;

    .line 53
    .line 54
    .line 55
    move-result-object p0

    .line 56
    check-cast p0, Lcom/friday/main/databinding/DialogVersionUpdateBinding;

    .line 57
    .line 58
    iget-object p0, p0, Lcom/friday/main/databinding/DialogVersionUpdateBinding;->f:Landroid/widget/TextView;

    .line 59
    .line 60
    new-instance v0, Ljava/lang/StringBuilder;

    .line 61
    .line 62
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 63
    .line 64
    .line 65
    const-string v1, "\u6b63\u5728\u4e0b\u8f7d"

    .line 66
    .line 67
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 68
    .line 69
    .line 70
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 71
    .line 72
    .line 73
    const-string p1, "%"

    .line 74
    .line 75
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 76
    .line 77
    .line 78
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 79
    .line 80
    .line 81
    move-result-object p1

    .line 82
    invoke-virtual {p0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 83
    .line 84
    .line 85
    goto/16 :goto_0

    .line 86
    .line 87
    :cond_0
    invoke-virtual {p0}, Lcom/friday/common/base/BaseDialogFragment;->getMBinding()Landroidx/databinding/ViewDataBinding;

    .line 88
    .line 89
    .line 90
    move-result-object p1

    .line 91
    check-cast p1, Lcom/friday/main/databinding/DialogVersionUpdateBinding;

    .line 92
    .line 93
    iget-object p1, p1, Lcom/friday/main/databinding/DialogVersionUpdateBinding;->f:Landroid/widget/TextView;

    .line 94
    .line 95
    const-string v0, "\u6587\u4ef6\u6821\u9a8c\u5931\u8d25"

    .line 96
    .line 97
    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 98
    .line 99
    .line 100
    invoke-virtual {p0}, Lcom/friday/common/base/BaseDialogFragment;->getMBinding()Landroidx/databinding/ViewDataBinding;

    .line 101
    .line 102
    .line 103
    move-result-object p1

    .line 104
    check-cast p1, Lcom/friday/main/databinding/DialogVersionUpdateBinding;

    .line 105
    .line 106
    iget-object p1, p1, Lcom/friday/main/databinding/DialogVersionUpdateBinding;->g:Landroid/widget/TextView;

    .line 107
    .line 108
    invoke-virtual {p1, v2}, Landroid/widget/TextView;->setEnabled(Z)V

    .line 109
    .line 110
    .line 111
    invoke-virtual {p0}, Lcom/friday/common/base/BaseDialogFragment;->getMBinding()Landroidx/databinding/ViewDataBinding;

    .line 112
    .line 113
    .line 114
    move-result-object p1

    .line 115
    check-cast p1, Lcom/friday/main/databinding/DialogVersionUpdateBinding;

    .line 116
    .line 117
    iget-object p1, p1, Lcom/friday/main/databinding/DialogVersionUpdateBinding;->d:Landroidx/cardview/widget/CardView;

    .line 118
    .line 119
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->requireContext()Landroid/content/Context;

    .line 120
    .line 121
    .line 122
    move-result-object v0

    .line 123
    sget v3, Lcom/friday/main/R$color;->colorPrimary:I

    .line 124
    .line 125
    invoke-static {v0, v3}, Landroidx/core/content/ContextCompat;->getColor(Landroid/content/Context;I)I

    .line 126
    .line 127
    .line 128
    move-result v0

    .line 129
    invoke-virtual {p1, v0}, Landroidx/cardview/widget/CardView;->setCardBackgroundColor(I)V

    .line 130
    .line 131
    .line 132
    invoke-virtual {p0}, Lcom/friday/common/base/BaseDialogFragment;->getMBinding()Landroidx/databinding/ViewDataBinding;

    .line 133
    .line 134
    .line 135
    move-result-object p1

    .line 136
    check-cast p1, Lcom/friday/main/databinding/DialogVersionUpdateBinding;

    .line 137
    .line 138
    iget-object p1, p1, Lcom/friday/main/databinding/DialogVersionUpdateBinding;->g:Landroid/widget/TextView;

    .line 139
    .line 140
    invoke-static {v1}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 141
    .line 142
    .line 143
    move-result v0

    .line 144
    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setTextColor(I)V

    .line 145
    .line 146
    .line 147
    invoke-virtual {p0}, Lcom/friday/common/base/BaseDialogFragment;->getMBinding()Landroidx/databinding/ViewDataBinding;

    .line 148
    .line 149
    .line 150
    move-result-object p0

    .line 151
    check-cast p0, Lcom/friday/main/databinding/DialogVersionUpdateBinding;

    .line 152
    .line 153
    iget-object p0, p0, Lcom/friday/main/databinding/DialogVersionUpdateBinding;->e:Landroid/widget/TextView;

    .line 154
    .line 155
    invoke-virtual {p0, v2}, Landroid/widget/TextView;->setEnabled(Z)V

    .line 156
    .line 157
    .line 158
    goto :goto_0

    .line 159
    :cond_1
    invoke-virtual {p1}, Landroidx/work/WorkInfo;->getOutputData()Landroidx/work/Data;

    .line 160
    .line 161
    .line 162
    move-result-object p1

    .line 163
    const-string v0, "success_key"

    .line 164
    .line 165
    invoke-virtual {p1, v0}, Landroidx/work/Data;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 166
    .line 167
    .line 168
    move-result-object p1

    .line 169
    invoke-virtual {p0}, Lcom/friday/common/base/BaseDialogFragment;->getMBinding()Landroidx/databinding/ViewDataBinding;

    .line 170
    .line 171
    .line 172
    move-result-object v0

    .line 173
    check-cast v0, Lcom/friday/main/databinding/DialogVersionUpdateBinding;

    .line 174
    .line 175
    iget-object v0, v0, Lcom/friday/main/databinding/DialogVersionUpdateBinding;->f:Landroid/widget/TextView;

    .line 176
    .line 177
    const-string v3, "\u4e0b\u8f7d\u5b8c\u6210"

    .line 178
    .line 179
    invoke-virtual {v0, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 180
    .line 181
    .line 182
    invoke-virtual {p0}, Lcom/friday/common/base/BaseDialogFragment;->getMBinding()Landroidx/databinding/ViewDataBinding;

    .line 183
    .line 184
    .line 185
    move-result-object v0

    .line 186
    check-cast v0, Lcom/friday/main/databinding/DialogVersionUpdateBinding;

    .line 187
    .line 188
    iget-object v0, v0, Lcom/friday/main/databinding/DialogVersionUpdateBinding;->g:Landroid/widget/TextView;

    .line 189
    .line 190
    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setEnabled(Z)V

    .line 191
    .line 192
    .line 193
    invoke-virtual {p0}, Lcom/friday/common/base/BaseDialogFragment;->getMBinding()Landroidx/databinding/ViewDataBinding;

    .line 194
    .line 195
    .line 196
    move-result-object v0

    .line 197
    check-cast v0, Lcom/friday/main/databinding/DialogVersionUpdateBinding;

    .line 198
    .line 199
    iget-object v0, v0, Lcom/friday/main/databinding/DialogVersionUpdateBinding;->d:Landroidx/cardview/widget/CardView;

    .line 200
    .line 201
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->requireContext()Landroid/content/Context;

    .line 202
    .line 203
    .line 204
    move-result-object v3

    .line 205
    sget v4, Lcom/friday/main/R$color;->colorPrimary:I

    .line 206
    .line 207
    invoke-static {v3, v4}, Landroidx/core/content/ContextCompat;->getColor(Landroid/content/Context;I)I

    .line 208
    .line 209
    .line 210
    move-result v3

    .line 211
    invoke-virtual {v0, v3}, Landroidx/cardview/widget/CardView;->setCardBackgroundColor(I)V

    .line 212
    .line 213
    .line 214
    invoke-virtual {p0}, Lcom/friday/common/base/BaseDialogFragment;->getMBinding()Landroidx/databinding/ViewDataBinding;

    .line 215
    .line 216
    .line 217
    move-result-object v0

    .line 218
    check-cast v0, Lcom/friday/main/databinding/DialogVersionUpdateBinding;

    .line 219
    .line 220
    iget-object v0, v0, Lcom/friday/main/databinding/DialogVersionUpdateBinding;->g:Landroid/widget/TextView;

    .line 221
    .line 222
    invoke-static {v1}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 223
    .line 224
    .line 225
    move-result v1

    .line 226
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 227
    .line 228
    .line 229
    invoke-virtual {p0}, Lcom/friday/common/base/BaseDialogFragment;->getMBinding()Landroidx/databinding/ViewDataBinding;

    .line 230
    .line 231
    .line 232
    move-result-object p0

    .line 233
    check-cast p0, Lcom/friday/main/databinding/DialogVersionUpdateBinding;

    .line 234
    .line 235
    iget-object p0, p0, Lcom/friday/main/databinding/DialogVersionUpdateBinding;->e:Landroid/widget/TextView;

    .line 236
    .line 237
    invoke-virtual {p0, v2}, Landroid/widget/TextView;->setEnabled(Z)V

    .line 238
    .line 239
    .line 240
    invoke-static {p1}, Lcom/blankj/utilcode/util/AppUtils;->installApp(Ljava/lang/String;)V

    .line 241
    .line 242
    .line 243
    :goto_0
    sget-object p0, Lqc/q;->a:Lqc/q;

    .line 244
    .line 245
    return-object p0
.end method


# virtual methods
.method public getLayoutId()I
    .locals 1

    .line 1
    sget v0, Lcom/friday/main/R$layout;->dialog_version_update:I

    .line 2
    .line 3
    return v0
.end method

.method public initData()V
    .locals 4

    .line 1
    invoke-virtual {p0}, Lcom/friday/main/view/AppUpdateDialog;->u()Lcom/friday/main/viewmodel/HomeViewModel;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Lcom/friday/main/viewmodel/HomeViewModel;->v()Landroidx/lifecycle/MutableLiveData;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-virtual {v0}, Landroidx/lifecycle/LiveData;->getValue()Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    check-cast v0, Le2/a;

    .line 14
    .line 15
    if-eqz v0, :cond_1

    .line 16
    .line 17
    invoke-virtual {v0}, Le2/a;->b()Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    check-cast v0, Lcom/friday/main/model/VersionUpdate;

    .line 22
    .line 23
    if-eqz v0, :cond_1

    .line 24
    .line 25
    invoke-virtual {v0}, Lcom/friday/main/model/VersionUpdate;->getResult()Lcom/friday/main/model/Result;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    if-eqz v0, :cond_1

    .line 30
    .line 31
    invoke-virtual {v0}, Lcom/friday/main/model/Result;->getForceUpdate()Z

    .line 32
    .line 33
    .line 34
    move-result v0

    .line 35
    if-eqz v0, :cond_0

    .line 36
    .line 37
    invoke-virtual {p0}, Lcom/friday/common/base/BaseDialogFragment;->getMBinding()Landroidx/databinding/ViewDataBinding;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    check-cast v0, Lcom/friday/main/databinding/DialogVersionUpdateBinding;

    .line 42
    .line 43
    iget-object v0, v0, Lcom/friday/main/databinding/DialogVersionUpdateBinding;->e:Landroid/widget/TextView;

    .line 44
    .line 45
    const-string v1, "\u9000\u51fa"

    .line 46
    .line 47
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 48
    .line 49
    .line 50
    goto :goto_0

    .line 51
    :cond_0
    invoke-virtual {p0}, Lcom/friday/common/base/BaseDialogFragment;->getMBinding()Landroidx/databinding/ViewDataBinding;

    .line 52
    .line 53
    .line 54
    move-result-object v0

    .line 55
    check-cast v0, Lcom/friday/main/databinding/DialogVersionUpdateBinding;

    .line 56
    .line 57
    iget-object v0, v0, Lcom/friday/main/databinding/DialogVersionUpdateBinding;->e:Landroid/widget/TextView;

    .line 58
    .line 59
    const-string v1, "\u53d6\u6d88"

    .line 60
    .line 61
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 62
    .line 63
    .line 64
    :cond_1
    :goto_0
    invoke-virtual {p0}, Lcom/friday/common/base/BaseDialogFragment;->getMBinding()Landroidx/databinding/ViewDataBinding;

    .line 65
    .line 66
    .line 67
    move-result-object v0

    .line 68
    check-cast v0, Lcom/friday/main/databinding/DialogVersionUpdateBinding;

    .line 69
    .line 70
    iget-object v0, v0, Lcom/friday/main/databinding/DialogVersionUpdateBinding;->g:Landroid/widget/TextView;

    .line 71
    .line 72
    const-string v1, "tvUpdate"

    .line 73
    .line 74
    invoke-static {v0, v1}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 75
    .line 76
    .line 77
    new-instance v1, Lv3/a;

    .line 78
    .line 79
    invoke-direct {v1, p0}, Lv3/a;-><init>(Lcom/friday/main/view/AppUpdateDialog;)V

    .line 80
    .line 81
    .line 82
    const-wide/16 v2, 0x1f4

    .line 83
    .line 84
    invoke-static {v0, v2, v3, v1}, Lz1/b;->l(Landroid/view/View;JLandroid/view/View$OnClickListener;)V

    .line 85
    .line 86
    .line 87
    invoke-virtual {p0}, Lcom/friday/common/base/BaseDialogFragment;->getMBinding()Landroidx/databinding/ViewDataBinding;

    .line 88
    .line 89
    .line 90
    move-result-object v0

    .line 91
    check-cast v0, Lcom/friday/main/databinding/DialogVersionUpdateBinding;

    .line 92
    .line 93
    iget-object v0, v0, Lcom/friday/main/databinding/DialogVersionUpdateBinding;->e:Landroid/widget/TextView;

    .line 94
    .line 95
    new-instance v1, Lv3/b;

    .line 96
    .line 97
    invoke-direct {v1, p0}, Lv3/b;-><init>(Lcom/friday/main/view/AppUpdateDialog;)V

    .line 98
    .line 99
    .line 100
    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 101
    .line 102
    .line 103
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
    sget v0, Lcom/friday/main/R$style;->airPlayDialog:I

    .line 6
    .line 7
    invoke-virtual {p0, p1, v0}, Landroidx/fragment/app/DialogFragment;->setStyle(II)V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public onStart()V
    .locals 4

    .line 1
    invoke-virtual {p0}, Landroidx/fragment/app/DialogFragment;->getDialog()Landroid/app/Dialog;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-virtual {v0}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getResources()Landroid/content/res/Resources;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    sget v2, Lcom/friday/main/R$dimen;->view_189:I

    .line 18
    .line 19
    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDimension(I)F

    .line 20
    .line 21
    .line 22
    move-result v1

    .line 23
    float-to-int v1, v1

    .line 24
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getResources()Landroid/content/res/Resources;

    .line 25
    .line 26
    .line 27
    move-result-object v2

    .line 28
    sget v3, Lcom/friday/main/R$dimen;->view_140:I

    .line 29
    .line 30
    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getDimension(I)F

    .line 31
    .line 32
    .line 33
    move-result v2

    .line 34
    float-to-int v2, v2

    .line 35
    invoke-virtual {v0, v1, v2}, Landroid/view/Window;->setLayout(II)V

    .line 36
    .line 37
    .line 38
    const/16 v1, 0x11

    .line 39
    .line 40
    invoke-virtual {v0, v1}, Landroid/view/Window;->setGravity(I)V

    .line 41
    .line 42
    .line 43
    :cond_0
    invoke-virtual {p0}, Landroidx/fragment/app/DialogFragment;->getDialog()Landroid/app/Dialog;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    if-eqz v0, :cond_1

    .line 48
    .line 49
    const/4 v1, 0x0

    .line 50
    invoke-virtual {v0, v1}, Landroid/app/Dialog;->setCancelable(Z)V

    .line 51
    .line 52
    .line 53
    invoke-virtual {v0, v1}, Landroid/app/Dialog;->setCanceledOnTouchOutside(Z)V

    .line 54
    .line 55
    .line 56
    :cond_1
    invoke-super {p0}, Landroidx/fragment/app/DialogFragment;->onStart()V

    .line 57
    .line 58
    .line 59
    return-void
.end method

.method public final u()Lcom/friday/main/viewmodel/HomeViewModel;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/friday/main/view/AppUpdateDialog;->k:Lqc/d;

    .line 2
    .line 3
    invoke-interface {v0}, Lqc/d;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lcom/friday/main/viewmodel/HomeViewModel;

    .line 8
    .line 9
    return-object v0
.end method

.method public final x(Ljava/lang/String;)V
    .locals 8

    .line 1
    new-instance v0, Landroidx/work/OneTimeWorkRequest$Builder;

    .line 2
    .line 3
    const-class v1, Lcom/zykj/download/work/DownloadFileCommonWork;

    .line 4
    .line 5
    invoke-direct {v0, v1}, Landroidx/work/OneTimeWorkRequest$Builder;-><init>(Ljava/lang/Class;)V

    .line 6
    .line 7
    .line 8
    sget-object v2, Lcom/zykj/download/work/DownloadFileCommonWork;->Companion:Lcom/zykj/download/work/DownloadFileCommonWork$a;

    .line 9
    .line 10
    const/4 v6, 0x6

    .line 11
    const/4 v7, 0x0

    .line 12
    const/4 v4, 0x0

    .line 13
    const/4 v5, 0x0

    .line 14
    move-object v3, p1

    .line 15
    invoke-static/range {v2 .. v7}, Lcom/zykj/download/work/DownloadFileCommonWork$a;->b(Lcom/zykj/download/work/DownloadFileCommonWork$a;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Landroidx/work/Data;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    invoke-virtual {v0, p1}, Landroidx/work/WorkRequest$Builder;->setInputData(Landroidx/work/Data;)Landroidx/work/WorkRequest$Builder;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    check-cast p1, Landroidx/work/OneTimeWorkRequest$Builder;

    .line 24
    .line 25
    invoke-virtual {p1}, Landroidx/work/WorkRequest$Builder;->build()Landroidx/work/WorkRequest;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    check-cast p1, Landroidx/work/OneTimeWorkRequest;

    .line 30
    .line 31
    sget-object v0, Landroidx/work/WorkManager;->Companion:Landroidx/work/WorkManager$Companion;

    .line 32
    .line 33
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->requireContext()Landroid/content/Context;

    .line 34
    .line 35
    .line 36
    move-result-object v1

    .line 37
    const-string v2, "requireContext(...)"

    .line 38
    .line 39
    invoke-static {v1, v2}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 40
    .line 41
    .line 42
    invoke-virtual {v0, v1}, Landroidx/work/WorkManager$Companion;->getInstance(Landroid/content/Context;)Landroidx/work/WorkManager;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    invoke-virtual {p0}, Lcom/friday/common/base/BaseDialogFragment;->getMBinding()Landroidx/databinding/ViewDataBinding;

    .line 47
    .line 48
    .line 49
    move-result-object v1

    .line 50
    check-cast v1, Lcom/friday/main/databinding/DialogVersionUpdateBinding;

    .line 51
    .line 52
    iget-object v1, v1, Lcom/friday/main/databinding/DialogVersionUpdateBinding;->f:Landroid/widget/TextView;

    .line 53
    .line 54
    const-string v2, "\u6b63\u5728\u4e0b\u8f7d0%"

    .line 55
    .line 56
    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 57
    .line 58
    .line 59
    invoke-virtual {p0}, Lcom/friday/common/base/BaseDialogFragment;->getMBinding()Landroidx/databinding/ViewDataBinding;

    .line 60
    .line 61
    .line 62
    move-result-object v1

    .line 63
    check-cast v1, Lcom/friday/main/databinding/DialogVersionUpdateBinding;

    .line 64
    .line 65
    iget-object v1, v1, Lcom/friday/main/databinding/DialogVersionUpdateBinding;->g:Landroid/widget/TextView;

    .line 66
    .line 67
    const/4 v2, 0x0

    .line 68
    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setEnabled(Z)V

    .line 69
    .line 70
    .line 71
    invoke-virtual {p0}, Lcom/friday/common/base/BaseDialogFragment;->getMBinding()Landroidx/databinding/ViewDataBinding;

    .line 72
    .line 73
    .line 74
    move-result-object v1

    .line 75
    check-cast v1, Lcom/friday/main/databinding/DialogVersionUpdateBinding;

    .line 76
    .line 77
    iget-object v1, v1, Lcom/friday/main/databinding/DialogVersionUpdateBinding;->d:Landroidx/cardview/widget/CardView;

    .line 78
    .line 79
    const-string v2, "#dadada"

    .line 80
    .line 81
    invoke-static {v2}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 82
    .line 83
    .line 84
    move-result v2

    .line 85
    invoke-virtual {v1, v2}, Landroidx/cardview/widget/CardView;->setCardBackgroundColor(I)V

    .line 86
    .line 87
    .line 88
    invoke-virtual {p0}, Lcom/friday/common/base/BaseDialogFragment;->getMBinding()Landroidx/databinding/ViewDataBinding;

    .line 89
    .line 90
    .line 91
    move-result-object v1

    .line 92
    check-cast v1, Lcom/friday/main/databinding/DialogVersionUpdateBinding;

    .line 93
    .line 94
    iget-object v1, v1, Lcom/friday/main/databinding/DialogVersionUpdateBinding;->g:Landroid/widget/TextView;

    .line 95
    .line 96
    const-string v2, "#494949"

    .line 97
    .line 98
    invoke-static {v2}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 99
    .line 100
    .line 101
    move-result v2

    .line 102
    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setTextColor(I)V

    .line 103
    .line 104
    .line 105
    sget-object v1, Landroidx/work/ExistingWorkPolicy;->REPLACE:Landroidx/work/ExistingWorkPolicy;

    .line 106
    .line 107
    invoke-virtual {v0, v3, v1, p1}, Landroidx/work/WorkManager;->enqueueUniqueWork(Ljava/lang/String;Landroidx/work/ExistingWorkPolicy;Landroidx/work/OneTimeWorkRequest;)Landroidx/work/Operation;

    .line 108
    .line 109
    .line 110
    invoke-virtual {v0, v3}, Landroidx/work/WorkManager;->getWorkInfosForUniqueWorkLiveData(Ljava/lang/String;)Landroidx/lifecycle/LiveData;

    .line 111
    .line 112
    .line 113
    move-result-object p1

    .line 114
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getViewLifecycleOwner()Landroidx/lifecycle/LifecycleOwner;

    .line 115
    .line 116
    .line 117
    move-result-object v0

    .line 118
    new-instance v1, Lv3/c;

    .line 119
    .line 120
    invoke-direct {v1, p0}, Lv3/c;-><init>(Lcom/friday/main/view/AppUpdateDialog;)V

    .line 121
    .line 122
    .line 123
    new-instance v2, Lcom/friday/main/view/AppUpdateDialog$b;

    .line 124
    .line 125
    invoke-direct {v2, v1}, Lcom/friday/main/view/AppUpdateDialog$b;-><init>(Lhd/l;)V

    .line 126
    .line 127
    .line 128
    invoke-virtual {p1, v0, v2}, Landroidx/lifecycle/LiveData;->observe(Landroidx/lifecycle/LifecycleOwner;Landroidx/lifecycle/Observer;)V

    .line 129
    .line 130
    .line 131
    return-void
.end method
