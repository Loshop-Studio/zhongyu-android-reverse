.class public final Lcom/friday/login/view/SMSVerificationDialog;
.super Lcom/friday/login/view/Hilt_SMSVerificationDialog;
.source "SourceFile"


# annotations
.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x0
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/friday/login/view/SMSVerificationDialog$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/friday/login/view/Hilt_SMSVerificationDialog<",
        "Lcom/friday/login/databinding/DialogSmsVerificationBinding;",
        ">;"
    }
.end annotation


# static fields
.field public static final m:Lcom/friday/login/view/SMSVerificationDialog$a;

.field public static final n:I


# instance fields
.field public final k:Lqc/d;

.field public final l:Lqc/d;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/friday/login/view/SMSVerificationDialog$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/friday/login/view/SMSVerificationDialog$a;-><init>(Lkotlin/jvm/internal/n;)V

    sput-object v0, Lcom/friday/login/view/SMSVerificationDialog;->m:Lcom/friday/login/view/SMSVerificationDialog$a;

    const/16 v0, 0x8

    sput v0, Lcom/friday/login/view/SMSVerificationDialog;->n:I

    return-void
.end method

.method public constructor <init>()V
    .locals 4

    .line 1
    invoke-direct {p0}, Lcom/friday/login/view/Hilt_SMSVerificationDialog;-><init>()V

    .line 2
    .line 3
    .line 4
    const-class v0, Lcom/friday/login/viewmodel/LoginViewModel;

    .line 5
    .line 6
    invoke-static {v0}, Lkotlin/jvm/internal/y;->b(Ljava/lang/Class;)Lod/c;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    new-instance v1, Lcom/friday/login/view/SMSVerificationDialog$special$$inlined$activityViewModels$default$1;

    .line 11
    .line 12
    invoke-direct {v1, p0}, Lcom/friday/login/view/SMSVerificationDialog$special$$inlined$activityViewModels$default$1;-><init>(Landroidx/fragment/app/Fragment;)V

    .line 13
    .line 14
    .line 15
    new-instance v2, Lcom/friday/login/view/SMSVerificationDialog$special$$inlined$activityViewModels$default$2;

    .line 16
    .line 17
    const/4 v3, 0x0

    .line 18
    invoke-direct {v2, v3, p0}, Lcom/friday/login/view/SMSVerificationDialog$special$$inlined$activityViewModels$default$2;-><init>(Lhd/a;Landroidx/fragment/app/Fragment;)V

    .line 19
    .line 20
    .line 21
    new-instance v3, Lcom/friday/login/view/SMSVerificationDialog$special$$inlined$activityViewModels$default$3;

    .line 22
    .line 23
    invoke-direct {v3, p0}, Lcom/friday/login/view/SMSVerificationDialog$special$$inlined$activityViewModels$default$3;-><init>(Landroidx/fragment/app/Fragment;)V

    .line 24
    .line 25
    .line 26
    invoke-static {p0, v0, v1, v2, v3}, Landroidx/fragment/app/FragmentViewModelLazyKt;->createViewModelLazy(Landroidx/fragment/app/Fragment;Lod/c;Lhd/a;Lhd/a;Lhd/a;)Lqc/d;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    iput-object v0, p0, Lcom/friday/login/view/SMSVerificationDialog;->k:Lqc/d;

    .line 31
    .line 32
    new-instance v0, Lp3/k;

    .line 33
    .line 34
    invoke-direct {v0, p0}, Lp3/k;-><init>(Lcom/friday/login/view/SMSVerificationDialog;)V

    .line 35
    .line 36
    .line 37
    invoke-static {v0}, Lkotlin/a;->a(Lhd/a;)Lqc/d;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    iput-object v0, p0, Lcom/friday/login/view/SMSVerificationDialog;->l:Lqc/d;

    .line 42
    .line 43
    return-void
.end method

.method public static final A(Lcom/friday/login/view/SMSVerificationDialog;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/view/View;)V
    .locals 2

    .line 1
    invoke-virtual {p0}, Lcom/friday/common/base/BaseDialogFragment;->getMBinding()Landroidx/databinding/ViewDataBinding;

    .line 2
    .line 3
    .line 4
    move-result-object p4

    .line 5
    check-cast p4, Lcom/friday/login/databinding/DialogSmsVerificationBinding;

    .line 6
    .line 7
    iget-object p4, p4, Lcom/friday/login/databinding/DialogSmsVerificationBinding;->c:Landroid/widget/EditText;

    .line 8
    .line 9
    invoke-virtual {p4}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    .line 10
    .line 11
    .line 12
    move-result-object p4

    .line 13
    const-string v0, "getText(...)"

    .line 14
    .line 15
    invoke-static {p4, v0}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    invoke-static {p4}, Lqd/c0;->e1(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 19
    .line 20
    .line 21
    move-result-object p4

    .line 22
    invoke-virtual {p4}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object p4

    .line 26
    invoke-static {p4}, Lqd/c0;->h0(Ljava/lang/CharSequence;)Z

    .line 27
    .line 28
    .line 29
    move-result v0

    .line 30
    if-eqz v0, :cond_0

    .line 31
    .line 32
    const-string p0, "\u8bf7\u586b\u5199\u9a8c\u8bc1\u7801"

    .line 33
    .line 34
    invoke-static {p0}, Lz1/b;->i(Ljava/lang/CharSequence;)V

    .line 35
    .line 36
    .line 37
    return-void

    .line 38
    :cond_0
    invoke-virtual {p4}, Ljava/lang/String;->length()I

    .line 39
    .line 40
    .line 41
    move-result v0

    .line 42
    const/4 v1, 0x4

    .line 43
    if-eq v0, v1, :cond_1

    .line 44
    .line 45
    const-string p0, "\u9a8c\u8bc1\u7801\u957f\u5ea6\u4e0d\u5bf9"

    .line 46
    .line 47
    invoke-static {p0}, Lz1/b;->i(Ljava/lang/CharSequence;)V

    .line 48
    .line 49
    .line 50
    return-void

    .line 51
    :cond_1
    const/4 v0, 0x1

    .line 52
    invoke-virtual {p0, v0}, Lcom/friday/common/base/BaseDialogFragment;->isShowLoading(Z)V

    .line 53
    .line 54
    .line 55
    invoke-virtual {p0}, Lcom/friday/login/view/SMSVerificationDialog;->z()Lcom/friday/login/viewmodel/LoginViewModel;

    .line 56
    .line 57
    .line 58
    move-result-object p0

    .line 59
    invoke-static {p1}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 60
    .line 61
    .line 62
    invoke-static {p2}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 63
    .line 64
    .line 65
    invoke-static {p3}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 66
    .line 67
    .line 68
    invoke-virtual {p0, p1, p2, p3, p4}, Lcom/friday/login/viewmodel/LoginViewModel;->q(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 69
    .line 70
    .line 71
    return-void
.end method

.method public static final B(Lcom/friday/login/view/SMSVerificationDialog;Ljava/lang/String;Landroid/view/View;)V
    .locals 0

    .line 1
    const/4 p2, 0x1

    .line 2
    invoke-virtual {p0, p2}, Lcom/friday/common/base/BaseDialogFragment;->isShowLoading(Z)V

    .line 3
    .line 4
    .line 5
    sget-object p2, Lcom/friday/common/helper/b;->a:Lcom/friday/common/helper/b$a;

    .line 6
    .line 7
    invoke-virtual {p2}, Lcom/friday/common/helper/b$a;->a()Lcom/friday/common/helper/b;

    .line 8
    .line 9
    .line 10
    move-result-object p2

    .line 11
    invoke-static {p1}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {p2, p1}, Lcom/friday/common/helper/b;->A(Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {p0}, Lcom/friday/login/view/SMSVerificationDialog;->z()Lcom/friday/login/viewmodel/LoginViewModel;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    invoke-virtual {p0}, Lcom/friday/login/viewmodel/LoginViewModel;->o()V

    .line 22
    .line 23
    .line 24
    return-void
.end method

.method public static final C(Lcom/friday/login/view/SMSVerificationDialog;Ljava/lang/Boolean;)Lqc/q;
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-virtual {p0, v0}, Lcom/friday/common/base/BaseDialogFragment;->isShowLoading(Z)V

    .line 3
    .line 4
    .line 5
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 6
    .line 7
    .line 8
    move-result p1

    .line 9
    if-eqz p1, :cond_0

    .line 10
    .line 11
    invoke-virtual {p0}, Landroidx/fragment/app/DialogFragment;->dismissAllowingStateLoss()V

    .line 12
    .line 13
    .line 14
    :cond_0
    sget-object p0, Lqc/q;->a:Lqc/q;

    .line 15
    .line 16
    return-object p0
.end method

.method public static final D(Lcom/friday/login/view/SMSVerificationDialog;Ljava/lang/String;Ljava/lang/Boolean;)Lqc/q;
    .locals 4

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-virtual {p0, v0}, Lcom/friday/common/base/BaseDialogFragment;->isShowLoading(Z)V

    .line 3
    .line 4
    .line 5
    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 6
    .line 7
    .line 8
    move-result p2

    .line 9
    if-eqz p2, :cond_1

    .line 10
    .line 11
    invoke-virtual {p0}, Lcom/friday/common/base/BaseDialogFragment;->getMBinding()Landroidx/databinding/ViewDataBinding;

    .line 12
    .line 13
    .line 14
    move-result-object p2

    .line 15
    check-cast p2, Lcom/friday/login/databinding/DialogSmsVerificationBinding;

    .line 16
    .line 17
    iget-object p2, p2, Lcom/friday/login/databinding/DialogSmsVerificationBinding;->f:Landroid/widget/TextView;

    .line 18
    .line 19
    invoke-virtual {p2, v0}, Landroid/widget/TextView;->setEnabled(Z)V

    .line 20
    .line 21
    .line 22
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 23
    .line 24
    .line 25
    move-result p2

    .line 26
    const/16 v1, 0xb

    .line 27
    .line 28
    if-ne p2, v1, :cond_0

    .line 29
    .line 30
    invoke-virtual {p0}, Lcom/friday/common/base/BaseDialogFragment;->getMBinding()Landroidx/databinding/ViewDataBinding;

    .line 31
    .line 32
    .line 33
    move-result-object p2

    .line 34
    check-cast p2, Lcom/friday/login/databinding/DialogSmsVerificationBinding;

    .line 35
    .line 36
    iget-object p2, p2, Lcom/friday/login/databinding/DialogSmsVerificationBinding;->g:Landroid/widget/TextView;

    .line 37
    .line 38
    invoke-static {p1}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 39
    .line 40
    .line 41
    const/4 v2, 0x3

    .line 42
    invoke-virtual {p1, v0, v2}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    const-string v2, "substring(...)"

    .line 47
    .line 48
    invoke-static {v0, v2}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 49
    .line 50
    .line 51
    const/4 v3, 0x7

    .line 52
    invoke-virtual {p1, v3, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 53
    .line 54
    .line 55
    move-result-object p1

    .line 56
    invoke-static {p1, v2}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 57
    .line 58
    .line 59
    new-instance v1, Ljava/lang/StringBuilder;

    .line 60
    .line 61
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 62
    .line 63
    .line 64
    const-string v2, "\u77ed\u4fe1\u9a8c\u8bc1\u7801\u5df2\u53d1\u9001\u81f3 +86 "

    .line 65
    .line 66
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 67
    .line 68
    .line 69
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 70
    .line 71
    .line 72
    const-string v0, "****"

    .line 73
    .line 74
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 75
    .line 76
    .line 77
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 78
    .line 79
    .line 80
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 81
    .line 82
    .line 83
    move-result-object p1

    .line 84
    invoke-virtual {p2, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 85
    .line 86
    .line 87
    :cond_0
    invoke-virtual {p0}, Lcom/friday/common/base/BaseDialogFragment;->getMBinding()Landroidx/databinding/ViewDataBinding;

    .line 88
    .line 89
    .line 90
    move-result-object p1

    .line 91
    check-cast p1, Lcom/friday/login/databinding/DialogSmsVerificationBinding;

    .line 92
    .line 93
    iget-object p1, p1, Lcom/friday/login/databinding/DialogSmsVerificationBinding;->f:Landroid/widget/TextView;

    .line 94
    .line 95
    const-string p2, "#B0B0B0"

    .line 96
    .line 97
    invoke-static {p2}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 98
    .line 99
    .line 100
    move-result p2

    .line 101
    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setTextColor(I)V

    .line 102
    .line 103
    .line 104
    invoke-virtual {p0}, Lcom/friday/login/view/SMSVerificationDialog;->y()Lcom/friday/login/view/SMSVerificationDialog$b;

    .line 105
    .line 106
    .line 107
    move-result-object p0

    .line 108
    invoke-virtual {p0}, Landroid/os/CountDownTimer;->start()Landroid/os/CountDownTimer;

    .line 109
    .line 110
    .line 111
    const-string p0, "\u9a8c\u8bc1\u7801\u53d1\u9001\u6210\u529f"

    .line 112
    .line 113
    invoke-static {p0}, Lz1/b;->i(Ljava/lang/CharSequence;)V

    .line 114
    .line 115
    .line 116
    :cond_1
    sget-object p0, Lqc/q;->a:Lqc/q;

    .line 117
    .line 118
    return-object p0
.end method

.method public static synthetic r(Lcom/friday/login/view/SMSVerificationDialog;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2, p3, p4}, Lcom/friday/login/view/SMSVerificationDialog;->A(Lcom/friday/login/view/SMSVerificationDialog;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic s(Lcom/friday/login/view/SMSVerificationDialog;Ljava/lang/String;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lcom/friday/login/view/SMSVerificationDialog;->B(Lcom/friday/login/view/SMSVerificationDialog;Ljava/lang/String;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic t(Lcom/friday/login/view/SMSVerificationDialog;)Lcom/friday/login/view/SMSVerificationDialog$b;
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/friday/login/view/SMSVerificationDialog;->x(Lcom/friday/login/view/SMSVerificationDialog;)Lcom/friday/login/view/SMSVerificationDialog$b;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic u(Lcom/friday/login/view/SMSVerificationDialog;Ljava/lang/Boolean;)Lqc/q;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/friday/login/view/SMSVerificationDialog;->C(Lcom/friday/login/view/SMSVerificationDialog;Ljava/lang/Boolean;)Lqc/q;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic v(Lcom/friday/login/view/SMSVerificationDialog;Ljava/lang/String;Ljava/lang/Boolean;)Lqc/q;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lcom/friday/login/view/SMSVerificationDialog;->D(Lcom/friday/login/view/SMSVerificationDialog;Ljava/lang/String;Ljava/lang/Boolean;)Lqc/q;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic w(Lcom/friday/login/view/SMSVerificationDialog;)Lcom/friday/login/databinding/DialogSmsVerificationBinding;
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/friday/common/base/BaseDialogFragment;->getMBinding()Landroidx/databinding/ViewDataBinding;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    check-cast p0, Lcom/friday/login/databinding/DialogSmsVerificationBinding;

    .line 6
    .line 7
    return-object p0
.end method

.method public static final x(Lcom/friday/login/view/SMSVerificationDialog;)Lcom/friday/login/view/SMSVerificationDialog$b;
    .locals 1

    .line 1
    new-instance v0, Lcom/friday/login/view/SMSVerificationDialog$b;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Lcom/friday/login/view/SMSVerificationDialog$b;-><init>(Lcom/friday/login/view/SMSVerificationDialog;)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method


# virtual methods
.method public getLayoutId()I
    .locals 1

    .line 1
    sget v0, Lcom/friday/login/R$layout;->dialog_sms_verification:I

    .line 2
    .line 3
    return v0
.end method

.method public initData()V
    .locals 6

    .line 1
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getArguments()Landroid/os/Bundle;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    const-string v0, "\u672a\u83b7\u53d6\u5230\u7528\u6237\u4fe1\u606f"

    .line 8
    .line 9
    invoke-static {v0}, Lz1/b;->i(Ljava/lang/CharSequence;)V

    .line 10
    .line 11
    .line 12
    return-void

    .line 13
    :cond_0
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->requireArguments()Landroid/os/Bundle;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    const-string v1, "school_code"

    .line 18
    .line 19
    const-string v2, ""

    .line 20
    .line 21
    invoke-virtual {v0, v1, v2}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->requireArguments()Landroid/os/Bundle;

    .line 26
    .line 27
    .line 28
    move-result-object v1

    .line 29
    const-string v3, "mobile_number"

    .line 30
    .line 31
    invoke-virtual {v1, v3, v2}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object v1

    .line 35
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->requireArguments()Landroid/os/Bundle;

    .line 36
    .line 37
    .line 38
    move-result-object v3

    .line 39
    const-string v4, "account"

    .line 40
    .line 41
    invoke-virtual {v3, v4, v2}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object v3

    .line 45
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->requireArguments()Landroid/os/Bundle;

    .line 46
    .line 47
    .line 48
    move-result-object v4

    .line 49
    const-string v5, "password"

    .line 50
    .line 51
    invoke-virtual {v4, v5, v2}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 52
    .line 53
    .line 54
    move-result-object v2

    .line 55
    invoke-virtual {p0}, Lcom/friday/common/base/BaseDialogFragment;->getMBinding()Landroidx/databinding/ViewDataBinding;

    .line 56
    .line 57
    .line 58
    move-result-object v4

    .line 59
    check-cast v4, Lcom/friday/login/databinding/DialogSmsVerificationBinding;

    .line 60
    .line 61
    iget-object v4, v4, Lcom/friday/login/databinding/DialogSmsVerificationBinding;->e:Landroid/widget/TextView;

    .line 62
    .line 63
    const/4 v5, 0x0

    .line 64
    invoke-virtual {v4, v5}, Landroid/widget/TextView;->setEnabled(Z)V

    .line 65
    .line 66
    .line 67
    invoke-virtual {p0}, Lcom/friday/common/base/BaseDialogFragment;->getMBinding()Landroidx/databinding/ViewDataBinding;

    .line 68
    .line 69
    .line 70
    move-result-object v4

    .line 71
    check-cast v4, Lcom/friday/login/databinding/DialogSmsVerificationBinding;

    .line 72
    .line 73
    iget-object v4, v4, Lcom/friday/login/databinding/DialogSmsVerificationBinding;->e:Landroid/widget/TextView;

    .line 74
    .line 75
    new-instance v5, Lp3/g;

    .line 76
    .line 77
    invoke-direct {v5, p0, v0, v3, v2}, Lp3/g;-><init>(Lcom/friday/login/view/SMSVerificationDialog;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 78
    .line 79
    .line 80
    const-wide/16 v2, 0x1f4

    .line 81
    .line 82
    invoke-static {v4, v2, v3, v5}, Lcom/blankj/utilcode/util/ClickUtils;->applyGlobalDebouncing(Landroid/view/View;JLandroid/view/View$OnClickListener;)V

    .line 83
    .line 84
    .line 85
    invoke-virtual {p0}, Lcom/friday/common/base/BaseDialogFragment;->getMBinding()Landroidx/databinding/ViewDataBinding;

    .line 86
    .line 87
    .line 88
    move-result-object v4

    .line 89
    check-cast v4, Lcom/friday/login/databinding/DialogSmsVerificationBinding;

    .line 90
    .line 91
    iget-object v4, v4, Lcom/friday/login/databinding/DialogSmsVerificationBinding;->f:Landroid/widget/TextView;

    .line 92
    .line 93
    new-instance v5, Lp3/h;

    .line 94
    .line 95
    invoke-direct {v5, p0, v0}, Lp3/h;-><init>(Lcom/friday/login/view/SMSVerificationDialog;Ljava/lang/String;)V

    .line 96
    .line 97
    .line 98
    invoke-static {v4, v2, v3, v5}, Lcom/blankj/utilcode/util/ClickUtils;->applyGlobalDebouncing(Landroid/view/View;JLandroid/view/View$OnClickListener;)V

    .line 99
    .line 100
    .line 101
    invoke-virtual {p0}, Lcom/friday/common/base/BaseDialogFragment;->getMBinding()Landroidx/databinding/ViewDataBinding;

    .line 102
    .line 103
    .line 104
    move-result-object v2

    .line 105
    check-cast v2, Lcom/friday/login/databinding/DialogSmsVerificationBinding;

    .line 106
    .line 107
    iget-object v2, v2, Lcom/friday/login/databinding/DialogSmsVerificationBinding;->c:Landroid/widget/EditText;

    .line 108
    .line 109
    const-string v3, "etSms"

    .line 110
    .line 111
    invoke-static {v2, v3}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 112
    .line 113
    .line 114
    new-instance v3, Lcom/friday/login/view/SMSVerificationDialog$c;

    .line 115
    .line 116
    invoke-direct {v3, p0}, Lcom/friday/login/view/SMSVerificationDialog$c;-><init>(Lcom/friday/login/view/SMSVerificationDialog;)V

    .line 117
    .line 118
    .line 119
    invoke-virtual {v2, v3}, Landroid/widget/TextView;->addTextChangedListener(Landroid/text/TextWatcher;)V

    .line 120
    .line 121
    .line 122
    invoke-virtual {p0}, Lcom/friday/login/view/SMSVerificationDialog;->z()Lcom/friday/login/viewmodel/LoginViewModel;

    .line 123
    .line 124
    .line 125
    move-result-object v2

    .line 126
    invoke-virtual {v2}, Lcom/friday/login/viewmodel/LoginViewModel;->m()Landroidx/lifecycle/MutableLiveData;

    .line 127
    .line 128
    .line 129
    move-result-object v2

    .line 130
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getViewLifecycleOwner()Landroidx/lifecycle/LifecycleOwner;

    .line 131
    .line 132
    .line 133
    move-result-object v3

    .line 134
    new-instance v4, Lp3/i;

    .line 135
    .line 136
    invoke-direct {v4, p0}, Lp3/i;-><init>(Lcom/friday/login/view/SMSVerificationDialog;)V

    .line 137
    .line 138
    .line 139
    new-instance v5, Lcom/friday/login/view/SMSVerificationDialog$d;

    .line 140
    .line 141
    invoke-direct {v5, v4}, Lcom/friday/login/view/SMSVerificationDialog$d;-><init>(Lhd/l;)V

    .line 142
    .line 143
    .line 144
    invoke-virtual {v2, v3, v5}, Landroidx/lifecycle/LiveData;->observe(Landroidx/lifecycle/LifecycleOwner;Landroidx/lifecycle/Observer;)V

    .line 145
    .line 146
    .line 147
    invoke-virtual {p0}, Lcom/friday/login/view/SMSVerificationDialog;->z()Lcom/friday/login/viewmodel/LoginViewModel;

    .line 148
    .line 149
    .line 150
    move-result-object v2

    .line 151
    invoke-virtual {v2}, Lcom/friday/login/viewmodel/LoginViewModel;->k()Landroidx/lifecycle/MutableLiveData;

    .line 152
    .line 153
    .line 154
    move-result-object v2

    .line 155
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getViewLifecycleOwner()Landroidx/lifecycle/LifecycleOwner;

    .line 156
    .line 157
    .line 158
    move-result-object v3

    .line 159
    new-instance v4, Lp3/j;

    .line 160
    .line 161
    invoke-direct {v4, p0, v1}, Lp3/j;-><init>(Lcom/friday/login/view/SMSVerificationDialog;Ljava/lang/String;)V

    .line 162
    .line 163
    .line 164
    new-instance v1, Lcom/friday/login/view/SMSVerificationDialog$d;

    .line 165
    .line 166
    invoke-direct {v1, v4}, Lcom/friday/login/view/SMSVerificationDialog$d;-><init>(Lhd/l;)V

    .line 167
    .line 168
    .line 169
    invoke-virtual {v2, v3, v1}, Landroidx/lifecycle/LiveData;->observe(Landroidx/lifecycle/LifecycleOwner;Landroidx/lifecycle/Observer;)V

    .line 170
    .line 171
    .line 172
    const/4 v1, 0x1

    .line 173
    invoke-virtual {p0, v1}, Lcom/friday/common/base/BaseDialogFragment;->isShowLoading(Z)V

    .line 174
    .line 175
    .line 176
    sget-object v1, Lcom/friday/common/helper/b;->a:Lcom/friday/common/helper/b$a;

    .line 177
    .line 178
    invoke-virtual {v1}, Lcom/friday/common/helper/b$a;->a()Lcom/friday/common/helper/b;

    .line 179
    .line 180
    .line 181
    move-result-object v1

    .line 182
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 183
    .line 184
    .line 185
    invoke-virtual {v1, v0}, Lcom/friday/common/helper/b;->A(Ljava/lang/String;)V

    .line 186
    .line 187
    .line 188
    invoke-virtual {p0}, Lcom/friday/login/view/SMSVerificationDialog;->z()Lcom/friday/login/viewmodel/LoginViewModel;

    .line 189
    .line 190
    .line 191
    move-result-object v0

    .line 192
    invoke-virtual {v0}, Lcom/friday/login/viewmodel/LoginViewModel;->o()V

    .line 193
    .line 194
    .line 195
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
    sget v0, Lcom/friday/login/R$style;->airPlayDialog:I

    .line 6
    .line 7
    invoke-virtual {p0, p1, v0}, Landroidx/fragment/app/DialogFragment;->setStyle(II)V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public onDestroy()V
    .locals 1

    .line 1
    invoke-super {p0}, Landroidx/fragment/app/Fragment;->onDestroy()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Lcom/friday/login/view/SMSVerificationDialog;->y()Lcom/friday/login/view/SMSVerificationDialog$b;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    invoke-virtual {v0}, Landroid/os/CountDownTimer;->cancel()V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public onStart()V
    .locals 2

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
    const/4 v1, 0x0

    .line 8
    invoke-virtual {v0, v1}, Landroid/app/Dialog;->setCancelable(Z)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0, v1}, Landroid/app/Dialog;->setCanceledOnTouchOutside(Z)V

    .line 12
    .line 13
    .line 14
    :cond_0
    invoke-super {p0}, Landroidx/fragment/app/DialogFragment;->onStart()V

    .line 15
    .line 16
    .line 17
    return-void
.end method

.method public final y()Lcom/friday/login/view/SMSVerificationDialog$b;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/friday/login/view/SMSVerificationDialog;->l:Lqc/d;

    .line 2
    .line 3
    invoke-interface {v0}, Lqc/d;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lcom/friday/login/view/SMSVerificationDialog$b;

    .line 8
    .line 9
    return-object v0
.end method

.method public final z()Lcom/friday/login/viewmodel/LoginViewModel;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/friday/login/view/SMSVerificationDialog;->k:Lqc/d;

    .line 2
    .line 3
    invoke-interface {v0}, Lqc/d;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lcom/friday/login/viewmodel/LoginViewModel;

    .line 8
    .line 9
    return-object v0
.end method
