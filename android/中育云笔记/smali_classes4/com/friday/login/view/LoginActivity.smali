.class public final Lcom/friday/login/view/LoginActivity;
.super Lcom/friday/login/view/Hilt_LoginActivity;
.source "SourceFile"


# annotations
.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x0
.end annotation

.annotation build Lcom/alibaba/android/arouter/facade/annotation/Route;
    path = "/login/LoginActivity"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/friday/login/view/Hilt_LoginActivity<",
        "Lcom/friday/login/databinding/LoginActivityBinding;",
        ">;"
    }
.end annotation


# instance fields
.field public final g:Lqc/d;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 6

    .line 1
    invoke-direct {p0}, Lcom/friday/login/view/Hilt_LoginActivity;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lcom/friday/login/view/LoginActivity$special$$inlined$viewModels$default$1;

    .line 5
    .line 6
    invoke-direct {v0, p0}, Lcom/friday/login/view/LoginActivity$special$$inlined$viewModels$default$1;-><init>(Landroidx/activity/ComponentActivity;)V

    .line 7
    .line 8
    .line 9
    new-instance v1, Landroidx/lifecycle/ViewModelLazy;

    .line 10
    .line 11
    const-class v2, Lcom/friday/login/viewmodel/LoginViewModel;

    .line 12
    .line 13
    invoke-static {v2}, Lkotlin/jvm/internal/y;->b(Ljava/lang/Class;)Lod/c;

    .line 14
    .line 15
    .line 16
    move-result-object v2

    .line 17
    new-instance v3, Lcom/friday/login/view/LoginActivity$special$$inlined$viewModels$default$2;

    .line 18
    .line 19
    invoke-direct {v3, p0}, Lcom/friday/login/view/LoginActivity$special$$inlined$viewModels$default$2;-><init>(Landroidx/activity/ComponentActivity;)V

    .line 20
    .line 21
    .line 22
    new-instance v4, Lcom/friday/login/view/LoginActivity$special$$inlined$viewModels$default$3;

    .line 23
    .line 24
    const/4 v5, 0x0

    .line 25
    invoke-direct {v4, v5, p0}, Lcom/friday/login/view/LoginActivity$special$$inlined$viewModels$default$3;-><init>(Lhd/a;Landroidx/activity/ComponentActivity;)V

    .line 26
    .line 27
    .line 28
    invoke-direct {v1, v2, v3, v0, v4}, Landroidx/lifecycle/ViewModelLazy;-><init>(Lod/c;Lhd/a;Lhd/a;Lhd/a;)V

    .line 29
    .line 30
    .line 31
    iput-object v1, p0, Lcom/friday/login/view/LoginActivity;->g:Lqc/d;

    .line 32
    .line 33
    return-void
.end method

.method public static synthetic N(Lcom/friday/login/view/LoginActivity;Z)Lqc/q;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/friday/login/view/LoginActivity;->W(Lcom/friday/login/view/LoginActivity;Z)Lqc/q;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic O(Lcom/friday/login/view/LoginActivity;Landroid/widget/TextView;ILandroid/view/KeyEvent;)Z
    .locals 0

    .line 1
    invoke-static {p0, p1, p2, p3}, Lcom/friday/login/view/LoginActivity;->Z(Lcom/friday/login/view/LoginActivity;Landroid/widget/TextView;ILandroid/view/KeyEvent;)Z

    move-result p0

    return p0
.end method

.method public static synthetic P(Lcom/friday/login/view/LoginActivity;ZI)Lqc/q;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lcom/friday/login/view/LoginActivity;->a0(Lcom/friday/login/view/LoginActivity;ZI)Lqc/q;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic Q(Lcom/friday/login/view/LoginActivity;Lcom/friday/common/entity/SendSmsBean;)Lqc/q;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/friday/login/view/LoginActivity;->X(Lcom/friday/login/view/LoginActivity;Lcom/friday/common/entity/SendSmsBean;)Lqc/q;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic R(Lcom/friday/login/view/LoginActivity;Ljava/lang/Boolean;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/friday/login/view/LoginActivity;->V(Lcom/friday/login/view/LoginActivity;Ljava/lang/Boolean;)V

    return-void
.end method

.method public static final synthetic S(Lcom/friday/login/view/LoginActivity;)Lcom/friday/login/viewmodel/LoginViewModel;
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/friday/login/view/LoginActivity;->U()Lcom/friday/login/viewmodel/LoginViewModel;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static final V(Lcom/friday/login/view/LoginActivity;Ljava/lang/Boolean;)V
    .locals 1

    .line 1
    if-eqz p1, :cond_1

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    const/4 v0, 0x0

    .line 8
    if-eqz p1, :cond_0

    .line 9
    .line 10
    sget-object p1, Lcom/friday/common/helper/c;->a:Lcom/friday/common/helper/c;

    .line 11
    .line 12
    invoke-virtual {p1}, Lcom/friday/common/helper/c;->u()V

    .line 13
    .line 14
    .line 15
    invoke-virtual {p0, v0}, Lcom/friday/common/base/BaseActivity;->isShowLoading(Z)V

    .line 16
    .line 17
    .line 18
    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    .line 19
    .line 20
    .line 21
    return-void

    .line 22
    :cond_0
    invoke-virtual {p0, v0}, Lcom/friday/common/base/BaseActivity;->isShowLoading(Z)V

    .line 23
    .line 24
    .line 25
    :cond_1
    return-void
.end method

.method public static final W(Lcom/friday/login/view/LoginActivity;Z)Lqc/q;
    .locals 0

    .line 1
    xor-int/lit8 p1, p1, 0x1

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lcom/friday/common/base/BaseActivity;->isShowLoading(Z)V

    .line 4
    .line 5
    .line 6
    sget-object p0, Lqc/q;->a:Lqc/q;

    .line 7
    .line 8
    return-object p0
.end method

.method public static final X(Lcom/friday/login/view/LoginActivity;Lcom/friday/common/entity/SendSmsBean;)Lqc/q;
    .locals 6

    .line 1
    if-eqz p1, :cond_6

    .line 2
    .line 3
    invoke-virtual {p0}, Landroidx/fragment/app/FragmentActivity;->getSupportFragmentManager()Landroidx/fragment/app/FragmentManager;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    const-class v1, Lcom/friday/login/view/SMSVerificationDialog;

    .line 8
    .line 9
    invoke-virtual {v1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v2

    .line 13
    invoke-virtual {v0, v2}, Landroidx/fragment/app/FragmentManager;->findFragmentByTag(Ljava/lang/String;)Landroidx/fragment/app/Fragment;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    instance-of v2, v0, Lcom/friday/login/view/SMSVerificationDialog;

    .line 18
    .line 19
    if-eqz v2, :cond_0

    .line 20
    .line 21
    check-cast v0, Lcom/friday/login/view/SMSVerificationDialog;

    .line 22
    .line 23
    invoke-virtual {v0}, Landroidx/fragment/app/DialogFragment;->dismissAllowingStateLoss()V

    .line 24
    .line 25
    .line 26
    :cond_0
    invoke-virtual {p0}, Lcom/friday/common/base/BaseActivity;->getMBinding()Landroidx/databinding/ViewDataBinding;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    check-cast v0, Lcom/friday/login/databinding/LoginActivityBinding;

    .line 31
    .line 32
    iget-object v0, v0, Lcom/friday/login/databinding/LoginActivityBinding;->h:Lcom/google/android/material/textfield/TextInputEditText;

    .line 33
    .line 34
    invoke-virtual {v0}, Landroidx/appcompat/widget/AppCompatEditText;->getText()Landroid/text/Editable;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    const/4 v2, 0x0

    .line 39
    if-eqz v0, :cond_1

    .line 40
    .line 41
    invoke-static {v0}, Lqd/c0;->e1(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    goto :goto_0

    .line 46
    :cond_1
    move-object v0, v2

    .line 47
    :goto_0
    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object v0

    .line 51
    sget-object v3, Lcom/friday/login/view/SMSVerificationDialog;->m:Lcom/friday/login/view/SMSVerificationDialog$a;

    .line 52
    .line 53
    invoke-virtual {p1}, Lcom/friday/common/entity/SendSmsBean;->getMobile()Ljava/lang/String;

    .line 54
    .line 55
    .line 56
    move-result-object v4

    .line 57
    invoke-static {v4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 58
    .line 59
    .line 60
    move-result v4

    .line 61
    if-eqz v4, :cond_2

    .line 62
    .line 63
    move-object p1, v0

    .line 64
    goto :goto_1

    .line 65
    :cond_2
    invoke-virtual {p1}, Lcom/friday/common/entity/SendSmsBean;->getMobile()Ljava/lang/String;

    .line 66
    .line 67
    .line 68
    move-result-object p1

    .line 69
    if-nez p1, :cond_3

    .line 70
    .line 71
    const-string p1, ""

    .line 72
    .line 73
    :cond_3
    :goto_1
    invoke-virtual {p0}, Lcom/friday/common/base/BaseActivity;->getMBinding()Landroidx/databinding/ViewDataBinding;

    .line 74
    .line 75
    .line 76
    move-result-object v4

    .line 77
    check-cast v4, Lcom/friday/login/databinding/LoginActivityBinding;

    .line 78
    .line 79
    iget-object v4, v4, Lcom/friday/login/databinding/LoginActivityBinding;->j:Lcom/google/android/material/textfield/TextInputEditText;

    .line 80
    .line 81
    invoke-virtual {v4}, Landroidx/appcompat/widget/AppCompatEditText;->getText()Landroid/text/Editable;

    .line 82
    .line 83
    .line 84
    move-result-object v4

    .line 85
    if-eqz v4, :cond_4

    .line 86
    .line 87
    invoke-static {v4}, Lqd/c0;->e1(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 88
    .line 89
    .line 90
    move-result-object v4

    .line 91
    goto :goto_2

    .line 92
    :cond_4
    move-object v4, v2

    .line 93
    :goto_2
    invoke-static {v4}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 94
    .line 95
    .line 96
    move-result-object v4

    .line 97
    invoke-virtual {p0}, Lcom/friday/common/base/BaseActivity;->getMBinding()Landroidx/databinding/ViewDataBinding;

    .line 98
    .line 99
    .line 100
    move-result-object v5

    .line 101
    check-cast v5, Lcom/friday/login/databinding/LoginActivityBinding;

    .line 102
    .line 103
    iget-object v5, v5, Lcom/friday/login/databinding/LoginActivityBinding;->i:Lcom/google/android/material/textfield/TextInputEditText;

    .line 104
    .line 105
    invoke-virtual {v5}, Landroidx/appcompat/widget/AppCompatEditText;->getText()Landroid/text/Editable;

    .line 106
    .line 107
    .line 108
    move-result-object v5

    .line 109
    if-eqz v5, :cond_5

    .line 110
    .line 111
    invoke-static {v5}, Lqd/c0;->e1(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 112
    .line 113
    .line 114
    move-result-object v2

    .line 115
    :cond_5
    invoke-static {v2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 116
    .line 117
    .line 118
    move-result-object v2

    .line 119
    invoke-virtual {v3, p1, v0, v4, v2}, Lcom/friday/login/view/SMSVerificationDialog$a;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/friday/login/view/SMSVerificationDialog;

    .line 120
    .line 121
    .line 122
    move-result-object p1

    .line 123
    invoke-virtual {p0}, Landroidx/fragment/app/FragmentActivity;->getSupportFragmentManager()Landroidx/fragment/app/FragmentManager;

    .line 124
    .line 125
    .line 126
    move-result-object p0

    .line 127
    const-string v0, "getSupportFragmentManager(...)"

    .line 128
    .line 129
    invoke-static {p0, v0}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 130
    .line 131
    .line 132
    invoke-virtual {v1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 133
    .line 134
    .line 135
    move-result-object v0

    .line 136
    invoke-virtual {p1, p0, v0}, Lcom/friday/common/base/BaseDialogFragment;->show(Landroidx/fragment/app/FragmentManager;Ljava/lang/String;)V

    .line 137
    .line 138
    .line 139
    :cond_6
    sget-object p0, Lqc/q;->a:Lqc/q;

    .line 140
    .line 141
    return-object p0
.end method

.method public static final Z(Lcom/friday/login/view/LoginActivity;Landroid/widget/TextView;ILandroid/view/KeyEvent;)Z
    .locals 0

    .line 1
    const/4 p3, 0x2

    .line 2
    if-ne p2, p3, :cond_0

    .line 3
    .line 4
    invoke-static {p1}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0, p1}, Lcom/friday/login/view/LoginActivity;->b0(Landroid/view/View;)V

    .line 8
    .line 9
    .line 10
    const/4 p0, 0x1

    .line 11
    return p0

    .line 12
    :cond_0
    const/4 p0, 0x0

    .line 13
    return p0
.end method

.method public static final a0(Lcom/friday/login/view/LoginActivity;ZI)Lqc/q;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcom/friday/login/view/LoginActivity;->T(Z)V

    .line 2
    .line 3
    .line 4
    sget-object p0, Lqc/q;->a:Lqc/q;

    .line 5
    .line 6
    return-object p0
.end method


# virtual methods
.method public final T(Z)V
    .locals 4

    .line 1
    const/4 v0, 0x0

    .line 2
    const/16 v1, 0x8

    .line 3
    .line 4
    if-eqz p1, :cond_0

    .line 5
    .line 6
    invoke-virtual {p0}, Lcom/friday/common/base/BaseActivity;->getMBinding()Landroidx/databinding/ViewDataBinding;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    check-cast p1, Lcom/friday/login/databinding/LoginActivityBinding;

    .line 11
    .line 12
    iget-object p1, p1, Lcom/friday/login/databinding/LoginActivityBinding;->n:Landroid/view/View;

    .line 13
    .line 14
    invoke-virtual {p1, v1}, Landroid/view/View;->setVisibility(I)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {p0}, Lcom/friday/common/base/BaseActivity;->getMBinding()Landroidx/databinding/ViewDataBinding;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    check-cast p1, Lcom/friday/login/databinding/LoginActivityBinding;

    .line 22
    .line 23
    iget-object p1, p1, Lcom/friday/login/databinding/LoginActivityBinding;->o:Landroid/view/View;

    .line 24
    .line 25
    invoke-virtual {p1, v0}, Landroid/view/View;->setVisibility(I)V

    .line 26
    .line 27
    .line 28
    invoke-virtual {p0}, Lcom/friday/common/base/BaseActivity;->getMBinding()Landroidx/databinding/ViewDataBinding;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    check-cast p1, Lcom/friday/login/databinding/LoginActivityBinding;

    .line 33
    .line 34
    iget-object p1, p1, Lcom/friday/login/databinding/LoginActivityBinding;->q:Landroid/widget/TextView;

    .line 35
    .line 36
    invoke-virtual {p1, v0}, Landroid/view/View;->setVisibility(I)V

    .line 37
    .line 38
    .line 39
    invoke-virtual {p0}, Lcom/friday/common/base/BaseActivity;->getMBinding()Landroidx/databinding/ViewDataBinding;

    .line 40
    .line 41
    .line 42
    move-result-object p1

    .line 43
    check-cast p1, Lcom/friday/login/databinding/LoginActivityBinding;

    .line 44
    .line 45
    iget-object p1, p1, Lcom/friday/login/databinding/LoginActivityBinding;->k:Landroid/widget/ImageView;

    .line 46
    .line 47
    invoke-virtual {p1, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 48
    .line 49
    .line 50
    goto :goto_0

    .line 51
    :cond_0
    invoke-virtual {p0}, Lcom/friday/common/base/BaseActivity;->getMBinding()Landroidx/databinding/ViewDataBinding;

    .line 52
    .line 53
    .line 54
    move-result-object p1

    .line 55
    check-cast p1, Lcom/friday/login/databinding/LoginActivityBinding;

    .line 56
    .line 57
    iget-object p1, p1, Lcom/friday/login/databinding/LoginActivityBinding;->n:Landroid/view/View;

    .line 58
    .line 59
    invoke-virtual {p1, v0}, Landroid/view/View;->setVisibility(I)V

    .line 60
    .line 61
    .line 62
    invoke-virtual {p0}, Lcom/friday/common/base/BaseActivity;->getMBinding()Landroidx/databinding/ViewDataBinding;

    .line 63
    .line 64
    .line 65
    move-result-object p1

    .line 66
    check-cast p1, Lcom/friday/login/databinding/LoginActivityBinding;

    .line 67
    .line 68
    iget-object p1, p1, Lcom/friday/login/databinding/LoginActivityBinding;->o:Landroid/view/View;

    .line 69
    .line 70
    invoke-virtual {p1, v1}, Landroid/view/View;->setVisibility(I)V

    .line 71
    .line 72
    .line 73
    invoke-virtual {p0}, Lcom/friday/common/base/BaseActivity;->getMBinding()Landroidx/databinding/ViewDataBinding;

    .line 74
    .line 75
    .line 76
    move-result-object p1

    .line 77
    check-cast p1, Lcom/friday/login/databinding/LoginActivityBinding;

    .line 78
    .line 79
    iget-object p1, p1, Lcom/friday/login/databinding/LoginActivityBinding;->q:Landroid/widget/TextView;

    .line 80
    .line 81
    invoke-virtual {p1, v1}, Landroid/view/View;->setVisibility(I)V

    .line 82
    .line 83
    .line 84
    invoke-virtual {p0}, Lcom/friday/common/base/BaseActivity;->getMBinding()Landroidx/databinding/ViewDataBinding;

    .line 85
    .line 86
    .line 87
    move-result-object p1

    .line 88
    check-cast p1, Lcom/friday/login/databinding/LoginActivityBinding;

    .line 89
    .line 90
    iget-object p1, p1, Lcom/friday/login/databinding/LoginActivityBinding;->k:Landroid/widget/ImageView;

    .line 91
    .line 92
    invoke-virtual {p1, v0}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 93
    .line 94
    .line 95
    :goto_0
    invoke-virtual {p0}, Lcom/friday/common/base/BaseActivity;->getMBinding()Landroidx/databinding/ViewDataBinding;

    .line 96
    .line 97
    .line 98
    move-result-object p1

    .line 99
    check-cast p1, Lcom/friday/login/databinding/LoginActivityBinding;

    .line 100
    .line 101
    iget-object p1, p1, Lcom/friday/login/databinding/LoginActivityBinding;->q:Landroid/widget/TextView;

    .line 102
    .line 103
    sget-object v0, Lf2/a;->a:Lf2/a;

    .line 104
    .line 105
    const-wide/16 v1, 0xc8

    .line 106
    .line 107
    invoke-virtual {p1}, Landroid/view/View;->getVisibility()I

    .line 108
    .line 109
    .line 110
    move-result v3

    .line 111
    invoke-virtual {v0, p1, v1, v2, v3}, Lf2/a;->a(Landroid/view/View;JI)V

    .line 112
    .line 113
    .line 114
    invoke-virtual {p0}, Lcom/friday/common/base/BaseActivity;->getMBinding()Landroidx/databinding/ViewDataBinding;

    .line 115
    .line 116
    .line 117
    move-result-object p1

    .line 118
    check-cast p1, Lcom/friday/login/databinding/LoginActivityBinding;

    .line 119
    .line 120
    iget-object p1, p1, Lcom/friday/login/databinding/LoginActivityBinding;->k:Landroid/widget/ImageView;

    .line 121
    .line 122
    const-wide/16 v1, 0x190

    .line 123
    .line 124
    invoke-virtual {p1}, Landroid/view/View;->getVisibility()I

    .line 125
    .line 126
    .line 127
    move-result v3

    .line 128
    invoke-virtual {v0, p1, v1, v2, v3}, Lf2/a;->a(Landroid/view/View;JI)V

    .line 129
    .line 130
    .line 131
    return-void
.end method

.method public final U()Lcom/friday/login/viewmodel/LoginViewModel;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/friday/login/view/LoginActivity;->g:Lqc/d;

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

.method public final Y()V
    .locals 6

    .line 1
    sget-object v0, Lf2/c;->a:Lf2/c;

    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/friday/common/base/BaseActivity;->getMBinding()Landroidx/databinding/ViewDataBinding;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    check-cast v1, Lcom/friday/login/databinding/LoginActivityBinding;

    .line 8
    .line 9
    iget-object v1, v1, Lcom/friday/login/databinding/LoginActivityBinding;->j:Lcom/google/android/material/textfield/TextInputEditText;

    .line 10
    .line 11
    const-string v2, "etSchoolCode"

    .line 12
    .line 13
    invoke-static {v1, v2}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {p0}, Lcom/friday/common/base/BaseActivity;->getMBinding()Landroidx/databinding/ViewDataBinding;

    .line 17
    .line 18
    .line 19
    move-result-object v2

    .line 20
    check-cast v2, Lcom/friday/login/databinding/LoginActivityBinding;

    .line 21
    .line 22
    iget-object v2, v2, Lcom/friday/login/databinding/LoginActivityBinding;->h:Lcom/google/android/material/textfield/TextInputEditText;

    .line 23
    .line 24
    const-string v3, "etAccount"

    .line 25
    .line 26
    invoke-static {v2, v3}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    invoke-virtual {p0}, Lcom/friday/common/base/BaseActivity;->getMBinding()Landroidx/databinding/ViewDataBinding;

    .line 30
    .line 31
    .line 32
    move-result-object v3

    .line 33
    check-cast v3, Lcom/friday/login/databinding/LoginActivityBinding;

    .line 34
    .line 35
    iget-object v3, v3, Lcom/friday/login/databinding/LoginActivityBinding;->i:Lcom/google/android/material/textfield/TextInputEditText;

    .line 36
    .line 37
    const-string v4, "etPassword"

    .line 38
    .line 39
    invoke-static {v3, v4}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 40
    .line 41
    .line 42
    const/4 v4, 0x3

    .line 43
    new-array v4, v4, [Landroid/view/View;

    .line 44
    .line 45
    const/4 v5, 0x0

    .line 46
    aput-object v1, v4, v5

    .line 47
    .line 48
    const/4 v1, 0x1

    .line 49
    aput-object v2, v4, v1

    .line 50
    .line 51
    const/4 v1, 0x2

    .line 52
    aput-object v3, v4, v1

    .line 53
    .line 54
    invoke-virtual {v0, v4}, Lf2/c;->b([Landroid/view/View;)V

    .line 55
    .line 56
    .line 57
    invoke-virtual {p0}, Lcom/friday/common/base/BaseActivity;->getMBinding()Landroidx/databinding/ViewDataBinding;

    .line 58
    .line 59
    .line 60
    move-result-object v0

    .line 61
    check-cast v0, Lcom/friday/login/databinding/LoginActivityBinding;

    .line 62
    .line 63
    iget-object v0, v0, Lcom/friday/login/databinding/LoginActivityBinding;->i:Lcom/google/android/material/textfield/TextInputEditText;

    .line 64
    .line 65
    new-instance v1, Lp3/e;

    .line 66
    .line 67
    invoke-direct {v1, p0}, Lp3/e;-><init>(Lcom/friday/login/view/LoginActivity;)V

    .line 68
    .line 69
    .line 70
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setOnEditorActionListener(Landroid/widget/TextView$OnEditorActionListener;)V

    .line 71
    .line 72
    .line 73
    return-void
.end method

.method public final b0(Landroid/view/View;)V
    .locals 8

    .line 1
    sget-object v0, Lk2/m;->a:Lk2/m$a;

    .line 2
    .line 3
    invoke-virtual {v0}, Lk2/m$a;->a()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    return-void

    .line 10
    :cond_0
    invoke-virtual {p0}, Lcom/friday/common/base/BaseActivity;->getMBinding()Landroidx/databinding/ViewDataBinding;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    check-cast v0, Lcom/friday/login/databinding/LoginActivityBinding;

    .line 15
    .line 16
    iget-object v0, v0, Lcom/friday/login/databinding/LoginActivityBinding;->j:Lcom/google/android/material/textfield/TextInputEditText;

    .line 17
    .line 18
    invoke-virtual {v0}, Landroidx/appcompat/widget/AppCompatEditText;->getText()Landroid/text/Editable;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    sget-object v1, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    .line 27
    .line 28
    invoke-virtual {v0, v1}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object v5

    .line 32
    const-string v0, "toLowerCase(...)"

    .line 33
    .line 34
    invoke-static {v5, v0}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    invoke-virtual {p0}, Lcom/friday/common/base/BaseActivity;->getMBinding()Landroidx/databinding/ViewDataBinding;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    check-cast v0, Lcom/friday/login/databinding/LoginActivityBinding;

    .line 42
    .line 43
    iget-object v0, v0, Lcom/friday/login/databinding/LoginActivityBinding;->h:Lcom/google/android/material/textfield/TextInputEditText;

    .line 44
    .line 45
    invoke-virtual {v0}, Landroidx/appcompat/widget/AppCompatEditText;->getText()Landroid/text/Editable;

    .line 46
    .line 47
    .line 48
    move-result-object v0

    .line 49
    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object v6

    .line 53
    invoke-virtual {p0}, Lcom/friday/common/base/BaseActivity;->getMBinding()Landroidx/databinding/ViewDataBinding;

    .line 54
    .line 55
    .line 56
    move-result-object v0

    .line 57
    check-cast v0, Lcom/friday/login/databinding/LoginActivityBinding;

    .line 58
    .line 59
    iget-object v0, v0, Lcom/friday/login/databinding/LoginActivityBinding;->i:Lcom/google/android/material/textfield/TextInputEditText;

    .line 60
    .line 61
    invoke-virtual {v0}, Landroidx/appcompat/widget/AppCompatEditText;->getText()Landroid/text/Editable;

    .line 62
    .line 63
    .line 64
    move-result-object v0

    .line 65
    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 66
    .line 67
    .line 68
    move-result-object v7

    .line 69
    invoke-static {v5}, Lcom/blankj/utilcode/util/StringUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 70
    .line 71
    .line 72
    move-result v0

    .line 73
    if-eqz v0, :cond_1

    .line 74
    .line 75
    sget-object p1, Lf2/c;->a:Lf2/c;

    .line 76
    .line 77
    invoke-virtual {p0}, Lcom/friday/common/base/BaseActivity;->getMBinding()Landroidx/databinding/ViewDataBinding;

    .line 78
    .line 79
    .line 80
    move-result-object v0

    .line 81
    check-cast v0, Lcom/friday/login/databinding/LoginActivityBinding;

    .line 82
    .line 83
    iget-object v0, v0, Lcom/friday/login/databinding/LoginActivityBinding;->j:Lcom/google/android/material/textfield/TextInputEditText;

    .line 84
    .line 85
    const-string v1, "etSchoolCode"

    .line 86
    .line 87
    invoke-static {v0, v1}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 88
    .line 89
    .line 90
    sget v1, Lcom/friday/login/R$string;->input_school_code_please:I

    .line 91
    .line 92
    invoke-static {v1}, Lz1/b;->f(I)Ljava/lang/String;

    .line 93
    .line 94
    .line 95
    move-result-object v1

    .line 96
    invoke-virtual {p1, v0, v1}, Lf2/c;->f(Lcom/google/android/material/textfield/TextInputEditText;Ljava/lang/String;)V

    .line 97
    .line 98
    .line 99
    return-void

    .line 100
    :cond_1
    invoke-static {v6}, Lcom/blankj/utilcode/util/StringUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 101
    .line 102
    .line 103
    move-result v0

    .line 104
    if-eqz v0, :cond_2

    .line 105
    .line 106
    sget-object p1, Lf2/c;->a:Lf2/c;

    .line 107
    .line 108
    invoke-virtual {p0}, Lcom/friday/common/base/BaseActivity;->getMBinding()Landroidx/databinding/ViewDataBinding;

    .line 109
    .line 110
    .line 111
    move-result-object v0

    .line 112
    check-cast v0, Lcom/friday/login/databinding/LoginActivityBinding;

    .line 113
    .line 114
    iget-object v0, v0, Lcom/friday/login/databinding/LoginActivityBinding;->h:Lcom/google/android/material/textfield/TextInputEditText;

    .line 115
    .line 116
    const-string v1, "etAccount"

    .line 117
    .line 118
    invoke-static {v0, v1}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 119
    .line 120
    .line 121
    sget v1, Lcom/friday/login/R$string;->input_account_please:I

    .line 122
    .line 123
    invoke-static {v1}, Lz1/b;->f(I)Ljava/lang/String;

    .line 124
    .line 125
    .line 126
    move-result-object v1

    .line 127
    invoke-virtual {p1, v0, v1}, Lf2/c;->f(Lcom/google/android/material/textfield/TextInputEditText;Ljava/lang/String;)V

    .line 128
    .line 129
    .line 130
    return-void

    .line 131
    :cond_2
    invoke-static {v7}, Lcom/blankj/utilcode/util/StringUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 132
    .line 133
    .line 134
    move-result v0

    .line 135
    const-string v1, "etPassword"

    .line 136
    .line 137
    if-eqz v0, :cond_3

    .line 138
    .line 139
    sget-object p1, Lf2/c;->a:Lf2/c;

    .line 140
    .line 141
    invoke-virtual {p0}, Lcom/friday/common/base/BaseActivity;->getMBinding()Landroidx/databinding/ViewDataBinding;

    .line 142
    .line 143
    .line 144
    move-result-object v0

    .line 145
    check-cast v0, Lcom/friday/login/databinding/LoginActivityBinding;

    .line 146
    .line 147
    iget-object v0, v0, Lcom/friday/login/databinding/LoginActivityBinding;->i:Lcom/google/android/material/textfield/TextInputEditText;

    .line 148
    .line 149
    invoke-static {v0, v1}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 150
    .line 151
    .line 152
    sget v1, Lcom/friday/login/R$string;->input_password_please:I

    .line 153
    .line 154
    invoke-static {v1}, Lz1/b;->f(I)Ljava/lang/String;

    .line 155
    .line 156
    .line 157
    move-result-object v1

    .line 158
    invoke-virtual {p1, v0, v1}, Lf2/c;->f(Lcom/google/android/material/textfield/TextInputEditText;Ljava/lang/String;)V

    .line 159
    .line 160
    .line 161
    return-void

    .line 162
    :cond_3
    invoke-virtual {v7}, Ljava/lang/String;->length()I

    .line 163
    .line 164
    .line 165
    move-result v0

    .line 166
    const/4 v2, 0x6

    .line 167
    if-gt v2, v0, :cond_5

    .line 168
    .line 169
    const/16 v2, 0x11

    .line 170
    .line 171
    if-ge v0, v2, :cond_5

    .line 172
    .line 173
    invoke-virtual {p0}, Lcom/friday/common/base/BaseActivity;->getMBinding()Landroidx/databinding/ViewDataBinding;

    .line 174
    .line 175
    .line 176
    move-result-object v0

    .line 177
    check-cast v0, Lcom/friday/login/databinding/LoginActivityBinding;

    .line 178
    .line 179
    iget-object v0, v0, Lcom/friday/login/databinding/LoginActivityBinding;->l:Lcom/zykj/policy/ui/PolicyCheckView;

    .line 180
    .line 181
    invoke-virtual {v0}, Landroid/widget/CompoundButton;->isChecked()Z

    .line 182
    .line 183
    .line 184
    move-result v0

    .line 185
    if-nez v0, :cond_4

    .line 186
    .line 187
    invoke-static {p0}, Lcom/blankj/utilcode/util/KeyboardUtils;->hideSoftInput(Landroid/app/Activity;)V

    .line 188
    .line 189
    .line 190
    const/4 p1, 0x0

    .line 191
    new-array p1, p1, [Ljava/lang/Object;

    .line 192
    .line 193
    const-string v0, "\u8bf7\u5148\u4ed4\u7ec6\u9605\u8bfb\u5e76\u540c\u610f\u300a\u7528\u6237\u670d\u52a1\u534f\u8bae\u300b\u548c\u300a\u7528\u6237\u9690\u79c1\u653f\u7b56\u300b"

    .line 194
    .line 195
    invoke-static {v0, p1}, Lcom/blankj/utilcode/util/ToastUtils;->showShort(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 196
    .line 197
    .line 198
    return-void

    .line 199
    :cond_4
    const-string v0, "STORAGE"

    .line 200
    .line 201
    filled-new-array {v0}, [Ljava/lang/String;

    .line 202
    .line 203
    .line 204
    move-result-object v0

    .line 205
    invoke-static {v0}, Lcom/blankj/utilcode/util/PermissionUtils;->permissionGroup([Ljava/lang/String;)Lcom/blankj/utilcode/util/PermissionUtils;

    .line 206
    .line 207
    .line 208
    move-result-object v0

    .line 209
    new-instance v2, Lcom/friday/login/view/LoginActivity$a;

    .line 210
    .line 211
    move-object v3, p0

    .line 212
    move-object v4, p1

    .line 213
    invoke-direct/range {v2 .. v7}, Lcom/friday/login/view/LoginActivity$a;-><init>(Lcom/friday/login/view/LoginActivity;Landroid/view/View;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 214
    .line 215
    .line 216
    invoke-virtual {v0, v2}, Lcom/blankj/utilcode/util/PermissionUtils;->callback(Lcom/blankj/utilcode/util/PermissionUtils$SimpleCallback;)Lcom/blankj/utilcode/util/PermissionUtils;

    .line 217
    .line 218
    .line 219
    move-result-object p1

    .line 220
    invoke-virtual {p1}, Lcom/blankj/utilcode/util/PermissionUtils;->request()V

    .line 221
    .line 222
    .line 223
    return-void

    .line 224
    :cond_5
    sget-object p1, Lf2/c;->a:Lf2/c;

    .line 225
    .line 226
    invoke-virtual {p0}, Lcom/friday/common/base/BaseActivity;->getMBinding()Landroidx/databinding/ViewDataBinding;

    .line 227
    .line 228
    .line 229
    move-result-object v0

    .line 230
    check-cast v0, Lcom/friday/login/databinding/LoginActivityBinding;

    .line 231
    .line 232
    iget-object v0, v0, Lcom/friday/login/databinding/LoginActivityBinding;->i:Lcom/google/android/material/textfield/TextInputEditText;

    .line 233
    .line 234
    invoke-static {v0, v1}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 235
    .line 236
    .line 237
    sget v1, Lcom/friday/login/R$string;->password_length_hint:I

    .line 238
    .line 239
    invoke-static {v1}, Lz1/b;->f(I)Ljava/lang/String;

    .line 240
    .line 241
    .line 242
    move-result-object v1

    .line 243
    invoke-virtual {p1, v0, v1}, Lf2/c;->f(Lcom/google/android/material/textfield/TextInputEditText;Ljava/lang/String;)V

    .line 244
    .line 245
    .line 246
    return-void
.end method

.method public dispatchKeyEvent(Landroid/view/KeyEvent;)Z
    .locals 1

    .line 1
    const-string v0, "event"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-super {p0, p1}, Landroidx/appcompat/app/AppCompatActivity;->dispatchKeyEvent(Landroid/view/KeyEvent;)Z

    .line 7
    .line 8
    .line 9
    move-result p1

    .line 10
    return p1
.end method

.method public getLayoutId()I
    .locals 1

    .line 1
    # RE layout layout/login_activity (0x7f0c00aa), APK res/4Z.xml
    sget v0, Lcom/friday/login/R$layout;->login_activity:I

    .line 2
    .line 3
    return v0
.end method

.method public initData()V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/friday/login/view/LoginActivity;->Y()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Lcom/friday/login/view/LoginActivity;->initView()V

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0}, Lcom/friday/login/view/LoginActivity;->initDataSource()V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public initDataSource()V
    .locals 3

    .line 1
    invoke-super {p0}, Lcom/friday/common/base/BaseActivity;->initDataSource()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Lcom/friday/login/view/LoginActivity;->U()Lcom/friday/login/viewmodel/LoginViewModel;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    invoke-virtual {v0}, Lcom/friday/login/viewmodel/LoginViewModel;->n()Landroidx/lifecycle/MutableLiveData;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    new-instance v1, Lp3/b;

    .line 13
    .line 14
    invoke-direct {v1, p0}, Lp3/b;-><init>(Lcom/friday/login/view/LoginActivity;)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {v0, p0, v1}, Landroidx/lifecycle/LiveData;->observe(Landroidx/lifecycle/LifecycleOwner;Landroidx/lifecycle/Observer;)V

    .line 18
    .line 19
    .line 20
    invoke-virtual {p0}, Lcom/friday/login/view/LoginActivity;->U()Lcom/friday/login/viewmodel/LoginViewModel;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    invoke-virtual {v0}, Lcom/friday/login/viewmodel/LoginViewModel;->j()Landroidx/lifecycle/MutableLiveData;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    new-instance v1, Lp3/c;

    .line 29
    .line 30
    invoke-direct {v1, p0}, Lp3/c;-><init>(Lcom/friday/login/view/LoginActivity;)V

    .line 31
    .line 32
    .line 33
    invoke-static {v0, p0, v1}, Le2/b;->a(Landroidx/lifecycle/LiveData;Landroidx/lifecycle/LifecycleOwner;Lhd/l;)V

    .line 34
    .line 35
    .line 36
    invoke-virtual {p0}, Lcom/friday/login/view/LoginActivity;->U()Lcom/friday/login/viewmodel/LoginViewModel;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    invoke-virtual {v0}, Lcom/friday/login/viewmodel/LoginViewModel;->l()Landroidx/lifecycle/MutableLiveData;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    new-instance v1, Lp3/d;

    .line 45
    .line 46
    invoke-direct {v1, p0}, Lp3/d;-><init>(Lcom/friday/login/view/LoginActivity;)V

    .line 47
    .line 48
    .line 49
    new-instance v2, Lcom/friday/login/view/LoginActivity$b;

    .line 50
    .line 51
    invoke-direct {v2, v1}, Lcom/friday/login/view/LoginActivity$b;-><init>(Lhd/l;)V

    .line 52
    .line 53
    .line 54
    invoke-virtual {v0, p0, v2}, Landroidx/lifecycle/LiveData;->observe(Landroidx/lifecycle/LifecycleOwner;Landroidx/lifecycle/Observer;)V

    .line 55
    .line 56
    .line 57
    return-void
.end method

.method public initView()V
    .locals 3

    .line 1
    invoke-super {p0}, Lcom/friday/common/base/BaseActivity;->initView()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Lcom/friday/common/base/BaseActivity;->getMBinding()Landroidx/databinding/ViewDataBinding;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    check-cast v0, Lcom/friday/login/databinding/LoginActivityBinding;

    .line 9
    .line 10
    iget-object v0, v0, Lcom/friday/login/databinding/LoginActivityBinding;->j:Lcom/google/android/material/textfield/TextInputEditText;

    .line 11
    .line 12
    sget v1, Lcom/friday/login/R$string;->input_school_code_please:I

    .line 13
    .line 14
    invoke-static {v1}, Lz1/b;->f(I)Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setHint(Ljava/lang/CharSequence;)V

    .line 19
    .line 20
    .line 21
    invoke-virtual {p0}, Lcom/friday/common/base/BaseActivity;->getMBinding()Landroidx/databinding/ViewDataBinding;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    check-cast v0, Lcom/friday/login/databinding/LoginActivityBinding;

    .line 26
    .line 27
    iget-object v0, v0, Lcom/friday/login/databinding/LoginActivityBinding;->h:Lcom/google/android/material/textfield/TextInputEditText;

    .line 28
    .line 29
    sget v1, Lcom/friday/login/R$string;->input_account_please:I

    .line 30
    .line 31
    invoke-static {v1}, Lz1/b;->f(I)Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object v1

    .line 35
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setHint(Ljava/lang/CharSequence;)V

    .line 36
    .line 37
    .line 38
    invoke-virtual {p0}, Lcom/friday/common/base/BaseActivity;->getMBinding()Landroidx/databinding/ViewDataBinding;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    check-cast v0, Lcom/friday/login/databinding/LoginActivityBinding;

    .line 43
    .line 44
    iget-object v0, v0, Lcom/friday/login/databinding/LoginActivityBinding;->i:Lcom/google/android/material/textfield/TextInputEditText;

    .line 45
    .line 46
    sget v1, Lcom/friday/login/R$string;->input_password_please:I

    .line 47
    .line 48
    invoke-static {v1}, Lz1/b;->f(I)Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object v1

    .line 52
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setHint(Ljava/lang/CharSequence;)V

    .line 53
    .line 54
    .line 55
    sget-object v0, Lcom/friday/common/helper/b;->a:Lcom/friday/common/helper/b$a;

    .line 56
    .line 57
    invoke-virtual {v0}, Lcom/friday/common/helper/b$a;->a()Lcom/friday/common/helper/b;

    .line 58
    .line 59
    .line 60
    move-result-object v1

    .line 61
    invoke-virtual {v1}, Lcom/friday/common/helper/b;->h()Ljava/lang/String;

    .line 62
    .line 63
    .line 64
    move-result-object v1

    .line 65
    invoke-interface {v1}, Ljava/lang/CharSequence;->length()I

    .line 66
    .line 67
    .line 68
    move-result v1

    .line 69
    if-lez v1, :cond_0

    .line 70
    .line 71
    invoke-virtual {p0}, Lcom/friday/common/base/BaseActivity;->getMBinding()Landroidx/databinding/ViewDataBinding;

    .line 72
    .line 73
    .line 74
    move-result-object v1

    .line 75
    check-cast v1, Lcom/friday/login/databinding/LoginActivityBinding;

    .line 76
    .line 77
    iget-object v1, v1, Lcom/friday/login/databinding/LoginActivityBinding;->j:Lcom/google/android/material/textfield/TextInputEditText;

    .line 78
    .line 79
    invoke-static {}, Landroid/text/Editable$Factory;->getInstance()Landroid/text/Editable$Factory;

    .line 80
    .line 81
    .line 82
    move-result-object v2

    .line 83
    invoke-virtual {v0}, Lcom/friday/common/helper/b$a;->a()Lcom/friday/common/helper/b;

    .line 84
    .line 85
    .line 86
    move-result-object v0

    .line 87
    invoke-virtual {v0}, Lcom/friday/common/helper/b;->h()Ljava/lang/String;

    .line 88
    .line 89
    .line 90
    move-result-object v0

    .line 91
    invoke-virtual {v2, v0}, Landroid/text/Editable$Factory;->newEditable(Ljava/lang/CharSequence;)Landroid/text/Editable;

    .line 92
    .line 93
    .line 94
    move-result-object v0

    .line 95
    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 96
    .line 97
    .line 98
    :cond_0
    sget-object v0, Lf2/k;->d:Lf2/k$a;

    .line 99
    .line 100
    new-instance v1, Lp3/a;

    .line 101
    .line 102
    invoke-direct {v1, p0}, Lp3/a;-><init>(Lcom/friday/login/view/LoginActivity;)V

    .line 103
    .line 104
    .line 105
    invoke-virtual {v0, p0, v1}, Lf2/k$a;->a(Landroid/app/Activity;Lhd/p;)V

    .line 106
    .line 107
    .line 108
    invoke-virtual {p0}, Lcom/friday/common/base/BaseActivity;->getMBinding()Landroidx/databinding/ViewDataBinding;

    .line 109
    .line 110
    .line 111
    move-result-object v0

    .line 112
    check-cast v0, Lcom/friday/login/databinding/LoginActivityBinding;

    .line 113
    .line 114
    iget-object v0, v0, Lcom/friday/login/databinding/LoginActivityBinding;->c:Landroid/widget/Button;

    .line 115
    .line 116
    const-string v1, "btnLogin"

    .line 117
    .line 118
    invoke-static {v0, v1}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 119
    .line 120
    .line 121
    const/4 v1, 0x1

    .line 122
    new-array v1, v1, [Landroid/view/View;

    .line 123
    .line 124
    const/4 v2, 0x0

    .line 125
    aput-object v0, v1, v2

    .line 126
    .line 127
    invoke-virtual {p0, v1}, Lcom/friday/common/base/BaseActivity;->setClickListener([Landroid/view/View;)V

    .line 128
    .line 129
    .line 130
    new-instance v0, Lcom/zykj/policy/ext/PolicyHelper$Builder;

    .line 131
    .line 132
    invoke-virtual {p0}, Landroid/content/ContextWrapper;->getBaseContext()Landroid/content/Context;

    .line 133
    .line 134
    .line 135
    move-result-object v1

    .line 136
    const-string v2, "getBaseContext(...)"

    .line 137
    .line 138
    invoke-static {v1, v2}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 139
    .line 140
    .line 141
    invoke-direct {v0, v1}, Lcom/zykj/policy/ext/PolicyHelper$Builder;-><init>(Landroid/content/Context;)V

    .line 142
    .line 143
    .line 144
    const-string v1, "https://web.alicdn.zykj.org/privacypolicy/cloudnote/userServiceAgreement.html"

    .line 145
    .line 146
    invoke-virtual {v0, v1}, Lcom/zykj/policy/ext/PolicyHelper$Builder;->g(Ljava/lang/String;)Lcom/zykj/policy/ext/PolicyHelper$Builder;

    .line 147
    .line 148
    .line 149
    move-result-object v0

    .line 150
    const-string v1, "https://web.alicdn.zykj.org/privacypolicy/cloudnote/userPrivacyPolicy.html"

    .line 151
    .line 152
    invoke-virtual {v0, v1}, Lcom/zykj/policy/ext/PolicyHelper$Builder;->f(Ljava/lang/String;)Lcom/zykj/policy/ext/PolicyHelper$Builder;

    .line 153
    .line 154
    .line 155
    move-result-object v0

    .line 156
    invoke-virtual {p0}, Lcom/friday/common/base/BaseActivity;->getMBinding()Landroidx/databinding/ViewDataBinding;

    .line 157
    .line 158
    .line 159
    move-result-object v1

    .line 160
    check-cast v1, Lcom/friday/login/databinding/LoginActivityBinding;

    .line 161
    .line 162
    iget-object v1, v1, Lcom/friday/login/databinding/LoginActivityBinding;->l:Lcom/zykj/policy/ui/PolicyCheckView;

    .line 163
    .line 164
    const-string v2, "policyCheckView"

    .line 165
    .line 166
    invoke-static {v1, v2}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 167
    .line 168
    .line 169
    invoke-virtual {v0, v1}, Lcom/zykj/policy/ext/PolicyHelper$Builder;->h(Lcom/zykj/policy/ui/PolicyCheckView;)V

    .line 170
    .line 171
    .line 172
    return-void
.end method

.method public onClick(Landroid/view/View;)V
    .locals 1

    .line 1
    const-string v0, "view"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Lcom/friday/common/base/BaseActivity;->getMBinding()Landroidx/databinding/ViewDataBinding;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    check-cast v0, Lcom/friday/login/databinding/LoginActivityBinding;

    .line 11
    .line 12
    iget-object v0, v0, Lcom/friday/login/databinding/LoginActivityBinding;->c:Landroid/widget/Button;

    .line 13
    .line 14
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    if-eqz v0, :cond_0

    .line 19
    .line 20
    invoke-virtual {p0, p1}, Lcom/friday/login/view/LoginActivity;->b0(Landroid/view/View;)V

    .line 21
    .line 22
    .line 23
    :cond_0
    return-void
.end method
