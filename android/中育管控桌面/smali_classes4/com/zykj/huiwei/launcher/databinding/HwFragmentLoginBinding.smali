.class public abstract Lcom/zykj/huiwei/launcher/databinding/HwFragmentLoginBinding;
.super Landroidx/databinding/ViewDataBinding;
.source "SourceFile"


# instance fields
.field public final bg:Landroid/view/View;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field public final etPassword:Landroidx/appcompat/widget/AppCompatEditText;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field public final etSchoolCode:Landroidx/appcompat/widget/AppCompatEditText;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field public final etUsername:Landroidx/appcompat/widget/AppCompatEditText;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field public final ivLogo:Landroidx/appcompat/widget/AppCompatImageView;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field protected mVm:Lcom/zykj/huiwei/launcher/viewmodels/LoginViewModel;
    .annotation runtime Landroidx/databinding/Bindable;
    .end annotation
.end field

.field public final policyCheckView:Lcom/zykj/policy/ui/PolicyCheckView;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field public final tvLogin:Landroidx/appcompat/widget/AppCompatTextView;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field public final tvNet:Landroid/widget/TextView;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field public final tvUpdateTime:Landroid/widget/TextView;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field public final tvVersion:Landroid/widget/TextView;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/lang/Object;Landroid/view/View;ILandroid/view/View;Landroidx/appcompat/widget/AppCompatEditText;Landroidx/appcompat/widget/AppCompatEditText;Landroidx/appcompat/widget/AppCompatEditText;Landroidx/appcompat/widget/AppCompatImageView;Lcom/zykj/policy/ui/PolicyCheckView;Landroidx/appcompat/widget/AppCompatTextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2, p3}, Landroidx/databinding/ViewDataBinding;-><init>(Ljava/lang/Object;Landroid/view/View;I)V

    .line 2
    .line 3
    .line 4
    iput-object p4, p0, Lcom/zykj/huiwei/launcher/databinding/HwFragmentLoginBinding;->bg:Landroid/view/View;

    .line 5
    .line 6
    iput-object p5, p0, Lcom/zykj/huiwei/launcher/databinding/HwFragmentLoginBinding;->etPassword:Landroidx/appcompat/widget/AppCompatEditText;

    .line 7
    .line 8
    iput-object p6, p0, Lcom/zykj/huiwei/launcher/databinding/HwFragmentLoginBinding;->etSchoolCode:Landroidx/appcompat/widget/AppCompatEditText;

    .line 9
    .line 10
    iput-object p7, p0, Lcom/zykj/huiwei/launcher/databinding/HwFragmentLoginBinding;->etUsername:Landroidx/appcompat/widget/AppCompatEditText;

    .line 11
    .line 12
    iput-object p8, p0, Lcom/zykj/huiwei/launcher/databinding/HwFragmentLoginBinding;->ivLogo:Landroidx/appcompat/widget/AppCompatImageView;

    .line 13
    .line 14
    iput-object p9, p0, Lcom/zykj/huiwei/launcher/databinding/HwFragmentLoginBinding;->policyCheckView:Lcom/zykj/policy/ui/PolicyCheckView;

    .line 15
    .line 16
    iput-object p10, p0, Lcom/zykj/huiwei/launcher/databinding/HwFragmentLoginBinding;->tvLogin:Landroidx/appcompat/widget/AppCompatTextView;

    .line 17
    .line 18
    iput-object p11, p0, Lcom/zykj/huiwei/launcher/databinding/HwFragmentLoginBinding;->tvNet:Landroid/widget/TextView;

    .line 19
    .line 20
    iput-object p12, p0, Lcom/zykj/huiwei/launcher/databinding/HwFragmentLoginBinding;->tvUpdateTime:Landroid/widget/TextView;

    .line 21
    .line 22
    iput-object p13, p0, Lcom/zykj/huiwei/launcher/databinding/HwFragmentLoginBinding;->tvVersion:Landroid/widget/TextView;

    .line 23
    .line 24
    return-void
.end method

.method public static bind(Landroid/view/View;)Lcom/zykj/huiwei/launcher/databinding/HwFragmentLoginBinding;
    .locals 1
    .param p0    # Landroid/view/View;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 1
    invoke-static {}, Landroidx/databinding/DataBindingUtil;->getDefaultComponent()Landroidx/databinding/DataBindingComponent;

    move-result-object v0

    invoke-static {p0, v0}, Lcom/zykj/huiwei/launcher/databinding/HwFragmentLoginBinding;->bind(Landroid/view/View;Ljava/lang/Object;)Lcom/zykj/huiwei/launcher/databinding/HwFragmentLoginBinding;

    move-result-object p0

    return-object p0
.end method

.method public static bind(Landroid/view/View;Ljava/lang/Object;)Lcom/zykj/huiwei/launcher/databinding/HwFragmentLoginBinding;
    .locals 1
    .param p0    # Landroid/view/View;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p1    # Ljava/lang/Object;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    const v0, 0x7f0c0046

    .line 2
    invoke-static {p1, p0, v0}, Landroidx/databinding/ViewDataBinding;->bind(Ljava/lang/Object;Landroid/view/View;I)Landroidx/databinding/ViewDataBinding;

    move-result-object p0

    check-cast p0, Lcom/zykj/huiwei/launcher/databinding/HwFragmentLoginBinding;

    return-object p0
.end method

.method public static inflate(Landroid/view/LayoutInflater;)Lcom/zykj/huiwei/launcher/databinding/HwFragmentLoginBinding;
    .locals 1
    .param p0    # Landroid/view/LayoutInflater;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .line 3
    invoke-static {}, Landroidx/databinding/DataBindingUtil;->getDefaultComponent()Landroidx/databinding/DataBindingComponent;

    move-result-object v0

    invoke-static {p0, v0}, Lcom/zykj/huiwei/launcher/databinding/HwFragmentLoginBinding;->inflate(Landroid/view/LayoutInflater;Ljava/lang/Object;)Lcom/zykj/huiwei/launcher/databinding/HwFragmentLoginBinding;

    move-result-object p0

    return-object p0
.end method

.method public static inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/zykj/huiwei/launcher/databinding/HwFragmentLoginBinding;
    .locals 1
    .param p0    # Landroid/view/LayoutInflater;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p1    # Landroid/view/ViewGroup;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .line 1
    invoke-static {}, Landroidx/databinding/DataBindingUtil;->getDefaultComponent()Landroidx/databinding/DataBindingComponent;

    move-result-object v0

    invoke-static {p0, p1, p2, v0}, Lcom/zykj/huiwei/launcher/databinding/HwFragmentLoginBinding;->inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;ZLjava/lang/Object;)Lcom/zykj/huiwei/launcher/databinding/HwFragmentLoginBinding;

    move-result-object p0

    return-object p0
.end method

.method public static inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;ZLjava/lang/Object;)Lcom/zykj/huiwei/launcher/databinding/HwFragmentLoginBinding;
    .locals 1
    .param p0    # Landroid/view/LayoutInflater;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p1    # Landroid/view/ViewGroup;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param
    .param p3    # Ljava/lang/Object;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    const v0, 0x7f0c0046

    .line 2
    invoke-static {p0, v0, p1, p2, p3}, Landroidx/databinding/ViewDataBinding;->inflateInternal(Landroid/view/LayoutInflater;ILandroid/view/ViewGroup;ZLjava/lang/Object;)Landroidx/databinding/ViewDataBinding;

    move-result-object p0

    check-cast p0, Lcom/zykj/huiwei/launcher/databinding/HwFragmentLoginBinding;

    return-object p0
.end method

.method public static inflate(Landroid/view/LayoutInflater;Ljava/lang/Object;)Lcom/zykj/huiwei/launcher/databinding/HwFragmentLoginBinding;
    .locals 3
    .param p0    # Landroid/view/LayoutInflater;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p1    # Ljava/lang/Object;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    const/4 v0, 0x0

    const/4 v1, 0x0

    const v2, 0x7f0c0046

    .line 4
    invoke-static {p0, v2, v0, v1, p1}, Landroidx/databinding/ViewDataBinding;->inflateInternal(Landroid/view/LayoutInflater;ILandroid/view/ViewGroup;ZLjava/lang/Object;)Landroidx/databinding/ViewDataBinding;

    move-result-object p0

    check-cast p0, Lcom/zykj/huiwei/launcher/databinding/HwFragmentLoginBinding;

    return-object p0
.end method


# virtual methods
.method public getVm()Lcom/zykj/huiwei/launcher/viewmodels/LoginViewModel;
    .locals 1
    .annotation build Landroidx/annotation/Nullable;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/zykj/huiwei/launcher/databinding/HwFragmentLoginBinding;->mVm:Lcom/zykj/huiwei/launcher/viewmodels/LoginViewModel;

    .line 2
    .line 3
    return-object v0
.end method

.method public abstract setVm(Lcom/zykj/huiwei/launcher/viewmodels/LoginViewModel;)V
    .param p1    # Lcom/zykj/huiwei/launcher/viewmodels/LoginViewModel;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param
.end method
