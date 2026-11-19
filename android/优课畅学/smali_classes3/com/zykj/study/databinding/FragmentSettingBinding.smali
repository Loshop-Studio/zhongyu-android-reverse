.class public abstract Lcom/zykj/study/databinding/FragmentSettingBinding;
.super Landroidx/databinding/ViewDataBinding;
.source "SourceFile"


# instance fields
.field public final btExit:Lcom/xuexiang/xui/widget/button/roundbutton/RoundButton;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field public final fragmentSetting:Landroidx/constraintlayout/widget/ConstraintLayout;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field protected mIsTeacher:Ljava/lang/Boolean;
    .annotation runtime Landroidx/databinding/Bindable;
    .end annotation
.end field

.field protected mNeedShowPatch:Z
    .annotation runtime Landroidx/databinding/Bindable;
    .end annotation
.end field

.field protected mSettingViewModel:Lcom/zykj/study/viewmodels/SettingViewModel;
    .annotation runtime Landroidx/databinding/Bindable;
    .end annotation
.end field

.field protected mTinkerId:Ljava/lang/String;
    .annotation runtime Landroidx/databinding/Bindable;
    .end annotation
.end field

.field public final policyCheckView:Lcom/zykj/policy/ui/PolicyCheckView;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field public final superAbout:Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field public final superCache:Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field public final superFeedback:Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field public final superMessage:Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field public final superSwitchMode:Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field public final superSwitchNet:Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field public final superVersion:Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field public final textView5:Landroid/widget/TextView;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field public final tvAddHotfix:Landroid/widget/TextView;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field public final tvClearHotfix:Landroid/widget/TextView;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/lang/Object;Landroid/view/View;ILcom/xuexiang/xui/widget/button/roundbutton/RoundButton;Landroidx/constraintlayout/widget/ConstraintLayout;Lcom/zykj/policy/ui/PolicyCheckView;Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;)V
    .locals 0

    .line 1
    invoke-direct/range {p0 .. p3}, Landroidx/databinding/ViewDataBinding;-><init>(Ljava/lang/Object;Landroid/view/View;I)V

    .line 2
    .line 3
    .line 4
    iput-object p4, p0, Lcom/zykj/study/databinding/FragmentSettingBinding;->btExit:Lcom/xuexiang/xui/widget/button/roundbutton/RoundButton;

    .line 5
    .line 6
    iput-object p5, p0, Lcom/zykj/study/databinding/FragmentSettingBinding;->fragmentSetting:Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 7
    .line 8
    iput-object p6, p0, Lcom/zykj/study/databinding/FragmentSettingBinding;->policyCheckView:Lcom/zykj/policy/ui/PolicyCheckView;

    .line 9
    .line 10
    iput-object p7, p0, Lcom/zykj/study/databinding/FragmentSettingBinding;->superAbout:Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;

    .line 11
    .line 12
    iput-object p8, p0, Lcom/zykj/study/databinding/FragmentSettingBinding;->superCache:Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;

    .line 13
    .line 14
    iput-object p9, p0, Lcom/zykj/study/databinding/FragmentSettingBinding;->superFeedback:Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;

    .line 15
    .line 16
    iput-object p10, p0, Lcom/zykj/study/databinding/FragmentSettingBinding;->superMessage:Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;

    .line 17
    .line 18
    iput-object p11, p0, Lcom/zykj/study/databinding/FragmentSettingBinding;->superSwitchMode:Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;

    .line 19
    .line 20
    iput-object p12, p0, Lcom/zykj/study/databinding/FragmentSettingBinding;->superSwitchNet:Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;

    .line 21
    .line 22
    iput-object p13, p0, Lcom/zykj/study/databinding/FragmentSettingBinding;->superVersion:Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;

    .line 23
    .line 24
    iput-object p14, p0, Lcom/zykj/study/databinding/FragmentSettingBinding;->textView5:Landroid/widget/TextView;

    .line 25
    .line 26
    iput-object p15, p0, Lcom/zykj/study/databinding/FragmentSettingBinding;->tvAddHotfix:Landroid/widget/TextView;

    .line 27
    .line 28
    move-object/from16 p1, p16

    .line 29
    .line 30
    iput-object p1, p0, Lcom/zykj/study/databinding/FragmentSettingBinding;->tvClearHotfix:Landroid/widget/TextView;

    .line 31
    .line 32
    return-void
.end method

.method public static bind(Landroid/view/View;)Lcom/zykj/study/databinding/FragmentSettingBinding;
    .locals 1
    .param p0    # Landroid/view/View;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 1
    invoke-static {}, Landroidx/databinding/DataBindingUtil;->getDefaultComponent()Landroidx/databinding/DataBindingComponent;

    move-result-object v0

    invoke-static {p0, v0}, Lcom/zykj/study/databinding/FragmentSettingBinding;->bind(Landroid/view/View;Ljava/lang/Object;)Lcom/zykj/study/databinding/FragmentSettingBinding;

    move-result-object p0

    return-object p0
.end method

.method public static bind(Landroid/view/View;Ljava/lang/Object;)Lcom/zykj/study/databinding/FragmentSettingBinding;
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

    .line 2
    sget v0, Lcom/zykj/study/R$layout;->fragment_setting:I

    invoke-static {p1, p0, v0}, Landroidx/databinding/ViewDataBinding;->bind(Ljava/lang/Object;Landroid/view/View;I)Landroidx/databinding/ViewDataBinding;

    move-result-object p0

    check-cast p0, Lcom/zykj/study/databinding/FragmentSettingBinding;

    return-object p0
.end method

.method public static inflate(Landroid/view/LayoutInflater;)Lcom/zykj/study/databinding/FragmentSettingBinding;
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

    invoke-static {p0, v0}, Lcom/zykj/study/databinding/FragmentSettingBinding;->inflate(Landroid/view/LayoutInflater;Ljava/lang/Object;)Lcom/zykj/study/databinding/FragmentSettingBinding;

    move-result-object p0

    return-object p0
.end method

.method public static inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/zykj/study/databinding/FragmentSettingBinding;
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

    invoke-static {p0, p1, p2, v0}, Lcom/zykj/study/databinding/FragmentSettingBinding;->inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;ZLjava/lang/Object;)Lcom/zykj/study/databinding/FragmentSettingBinding;

    move-result-object p0

    return-object p0
.end method

.method public static inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;ZLjava/lang/Object;)Lcom/zykj/study/databinding/FragmentSettingBinding;
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

    .line 2
    sget v0, Lcom/zykj/study/R$layout;->fragment_setting:I

    invoke-static {p0, v0, p1, p2, p3}, Landroidx/databinding/ViewDataBinding;->inflateInternal(Landroid/view/LayoutInflater;ILandroid/view/ViewGroup;ZLjava/lang/Object;)Landroidx/databinding/ViewDataBinding;

    move-result-object p0

    check-cast p0, Lcom/zykj/study/databinding/FragmentSettingBinding;

    return-object p0
.end method

.method public static inflate(Landroid/view/LayoutInflater;Ljava/lang/Object;)Lcom/zykj/study/databinding/FragmentSettingBinding;
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

    .line 4
    sget v0, Lcom/zykj/study/R$layout;->fragment_setting:I

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-static {p0, v0, v1, v2, p1}, Landroidx/databinding/ViewDataBinding;->inflateInternal(Landroid/view/LayoutInflater;ILandroid/view/ViewGroup;ZLjava/lang/Object;)Landroidx/databinding/ViewDataBinding;

    move-result-object p0

    check-cast p0, Lcom/zykj/study/databinding/FragmentSettingBinding;

    return-object p0
.end method


# virtual methods
.method public getIsTeacher()Ljava/lang/Boolean;
    .locals 1
    .annotation build Landroidx/annotation/Nullable;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/zykj/study/databinding/FragmentSettingBinding;->mIsTeacher:Ljava/lang/Boolean;

    .line 2
    .line 3
    return-object v0
.end method

.method public getNeedShowPatch()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/zykj/study/databinding/FragmentSettingBinding;->mNeedShowPatch:Z

    .line 2
    .line 3
    return v0
.end method

.method public getSettingViewModel()Lcom/zykj/study/viewmodels/SettingViewModel;
    .locals 1
    .annotation build Landroidx/annotation/Nullable;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/zykj/study/databinding/FragmentSettingBinding;->mSettingViewModel:Lcom/zykj/study/viewmodels/SettingViewModel;

    .line 2
    .line 3
    return-object v0
.end method

.method public getTinkerId()Ljava/lang/String;
    .locals 1
    .annotation build Landroidx/annotation/Nullable;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/zykj/study/databinding/FragmentSettingBinding;->mTinkerId:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public abstract setIsTeacher(Ljava/lang/Boolean;)V
    .param p1    # Ljava/lang/Boolean;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param
.end method

.method public abstract setNeedShowPatch(Z)V
.end method

.method public abstract setSettingViewModel(Lcom/zykj/study/viewmodels/SettingViewModel;)V
    .param p1    # Lcom/zykj/study/viewmodels/SettingViewModel;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param
.end method

.method public abstract setTinkerId(Ljava/lang/String;)V
    .param p1    # Ljava/lang/String;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param
.end method
