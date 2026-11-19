.class public abstract Lcom/zykj/huiwei/launcher/databinding/HwIncludeHomeSidebarBinding;
.super Landroidx/databinding/ViewDataBinding;
.source "SourceFile"


# instance fields
.field public final ivAvatar:Landroidx/appcompat/widget/AppCompatImageView;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field public final llMenu1:Landroid/widget/LinearLayout;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field public final llMenu2:Landroid/widget/LinearLayout;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field protected mClickListener:Landroid/view/View$OnClickListener;
    .annotation runtime Landroidx/databinding/Bindable;
    .end annotation
.end field

.field protected mMainViewModel:Lcom/zykj/huiwei/launcher/viewmodels/MainViewModel;
    .annotation runtime Landroidx/databinding/Bindable;
    .end annotation
.end field

.field protected mVm:Lcom/zykj/huiwei/launcher/viewmodels/HomeViewModel;
    .annotation runtime Landroidx/databinding/Bindable;
    .end annotation
.end field

.field public final menuCheckUpdate:Lcom/zykj/huiwei/launcher/ui/view/MenuItemView;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field public final menuDeviceNo:Lcom/zykj/huiwei/launcher/ui/view/MenuItemView;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field public final menuExit:Lcom/zykj/huiwei/launcher/ui/view/MenuItemView;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field public final menuModifyGesture:Lcom/zykj/huiwei/launcher/ui/view/MenuItemView;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field public final menuModifyPassword:Lcom/zykj/huiwei/launcher/ui/view/MenuItemView;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field public final menuSchoolNotice:Lcom/zykj/huiwei/launcher/ui/view/MenuItemView;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field public final menuService:Lcom/zykj/huiwei/launcher/ui/view/MenuItemView;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field public final menuSystemMsg:Lcom/zykj/huiwei/launcher/ui/view/MenuItemView;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field public final tvClass:Landroid/widget/TextView;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field public final tvName:Lcom/zykj/huiwei/launcher/ui/view/NoPaddingTextView;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field public final tvPolicy:Lcom/zykj/policy/ui/PolicyCheckView;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field public final tvStudyNo:Landroid/widget/TextView;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/lang/Object;Landroid/view/View;ILandroidx/appcompat/widget/AppCompatImageView;Landroid/widget/LinearLayout;Landroid/widget/LinearLayout;Lcom/zykj/huiwei/launcher/ui/view/MenuItemView;Lcom/zykj/huiwei/launcher/ui/view/MenuItemView;Lcom/zykj/huiwei/launcher/ui/view/MenuItemView;Lcom/zykj/huiwei/launcher/ui/view/MenuItemView;Lcom/zykj/huiwei/launcher/ui/view/MenuItemView;Lcom/zykj/huiwei/launcher/ui/view/MenuItemView;Lcom/zykj/huiwei/launcher/ui/view/MenuItemView;Lcom/zykj/huiwei/launcher/ui/view/MenuItemView;Landroid/widget/TextView;Lcom/zykj/huiwei/launcher/ui/view/NoPaddingTextView;Lcom/zykj/policy/ui/PolicyCheckView;Landroid/widget/TextView;)V
    .locals 0

    .line 1
    invoke-direct/range {p0 .. p3}, Landroidx/databinding/ViewDataBinding;-><init>(Ljava/lang/Object;Landroid/view/View;I)V

    .line 2
    .line 3
    .line 4
    iput-object p4, p0, Lcom/zykj/huiwei/launcher/databinding/HwIncludeHomeSidebarBinding;->ivAvatar:Landroidx/appcompat/widget/AppCompatImageView;

    .line 5
    .line 6
    iput-object p5, p0, Lcom/zykj/huiwei/launcher/databinding/HwIncludeHomeSidebarBinding;->llMenu1:Landroid/widget/LinearLayout;

    .line 7
    .line 8
    iput-object p6, p0, Lcom/zykj/huiwei/launcher/databinding/HwIncludeHomeSidebarBinding;->llMenu2:Landroid/widget/LinearLayout;

    .line 9
    .line 10
    iput-object p7, p0, Lcom/zykj/huiwei/launcher/databinding/HwIncludeHomeSidebarBinding;->menuCheckUpdate:Lcom/zykj/huiwei/launcher/ui/view/MenuItemView;

    .line 11
    .line 12
    iput-object p8, p0, Lcom/zykj/huiwei/launcher/databinding/HwIncludeHomeSidebarBinding;->menuDeviceNo:Lcom/zykj/huiwei/launcher/ui/view/MenuItemView;

    .line 13
    .line 14
    iput-object p9, p0, Lcom/zykj/huiwei/launcher/databinding/HwIncludeHomeSidebarBinding;->menuExit:Lcom/zykj/huiwei/launcher/ui/view/MenuItemView;

    .line 15
    .line 16
    iput-object p10, p0, Lcom/zykj/huiwei/launcher/databinding/HwIncludeHomeSidebarBinding;->menuModifyGesture:Lcom/zykj/huiwei/launcher/ui/view/MenuItemView;

    .line 17
    .line 18
    iput-object p11, p0, Lcom/zykj/huiwei/launcher/databinding/HwIncludeHomeSidebarBinding;->menuModifyPassword:Lcom/zykj/huiwei/launcher/ui/view/MenuItemView;

    .line 19
    .line 20
    iput-object p12, p0, Lcom/zykj/huiwei/launcher/databinding/HwIncludeHomeSidebarBinding;->menuSchoolNotice:Lcom/zykj/huiwei/launcher/ui/view/MenuItemView;

    .line 21
    .line 22
    iput-object p13, p0, Lcom/zykj/huiwei/launcher/databinding/HwIncludeHomeSidebarBinding;->menuService:Lcom/zykj/huiwei/launcher/ui/view/MenuItemView;

    .line 23
    .line 24
    iput-object p14, p0, Lcom/zykj/huiwei/launcher/databinding/HwIncludeHomeSidebarBinding;->menuSystemMsg:Lcom/zykj/huiwei/launcher/ui/view/MenuItemView;

    .line 25
    .line 26
    iput-object p15, p0, Lcom/zykj/huiwei/launcher/databinding/HwIncludeHomeSidebarBinding;->tvClass:Landroid/widget/TextView;

    .line 27
    .line 28
    move-object/from16 p1, p16

    .line 29
    .line 30
    iput-object p1, p0, Lcom/zykj/huiwei/launcher/databinding/HwIncludeHomeSidebarBinding;->tvName:Lcom/zykj/huiwei/launcher/ui/view/NoPaddingTextView;

    .line 31
    .line 32
    move-object/from16 p1, p17

    .line 33
    .line 34
    iput-object p1, p0, Lcom/zykj/huiwei/launcher/databinding/HwIncludeHomeSidebarBinding;->tvPolicy:Lcom/zykj/policy/ui/PolicyCheckView;

    .line 35
    .line 36
    move-object/from16 p1, p18

    .line 37
    .line 38
    iput-object p1, p0, Lcom/zykj/huiwei/launcher/databinding/HwIncludeHomeSidebarBinding;->tvStudyNo:Landroid/widget/TextView;

    .line 39
    .line 40
    return-void
.end method

.method public static bind(Landroid/view/View;)Lcom/zykj/huiwei/launcher/databinding/HwIncludeHomeSidebarBinding;
    .locals 1
    .param p0    # Landroid/view/View;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 1
    invoke-static {}, Landroidx/databinding/DataBindingUtil;->getDefaultComponent()Landroidx/databinding/DataBindingComponent;

    move-result-object v0

    invoke-static {p0, v0}, Lcom/zykj/huiwei/launcher/databinding/HwIncludeHomeSidebarBinding;->bind(Landroid/view/View;Ljava/lang/Object;)Lcom/zykj/huiwei/launcher/databinding/HwIncludeHomeSidebarBinding;

    move-result-object p0

    return-object p0
.end method

.method public static bind(Landroid/view/View;Ljava/lang/Object;)Lcom/zykj/huiwei/launcher/databinding/HwIncludeHomeSidebarBinding;
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

    const v0, 0x7f0c004c

    .line 2
    invoke-static {p1, p0, v0}, Landroidx/databinding/ViewDataBinding;->bind(Ljava/lang/Object;Landroid/view/View;I)Landroidx/databinding/ViewDataBinding;

    move-result-object p0

    check-cast p0, Lcom/zykj/huiwei/launcher/databinding/HwIncludeHomeSidebarBinding;

    return-object p0
.end method

.method public static inflate(Landroid/view/LayoutInflater;)Lcom/zykj/huiwei/launcher/databinding/HwIncludeHomeSidebarBinding;
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

    invoke-static {p0, v0}, Lcom/zykj/huiwei/launcher/databinding/HwIncludeHomeSidebarBinding;->inflate(Landroid/view/LayoutInflater;Ljava/lang/Object;)Lcom/zykj/huiwei/launcher/databinding/HwIncludeHomeSidebarBinding;

    move-result-object p0

    return-object p0
.end method

.method public static inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/zykj/huiwei/launcher/databinding/HwIncludeHomeSidebarBinding;
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

    invoke-static {p0, p1, p2, v0}, Lcom/zykj/huiwei/launcher/databinding/HwIncludeHomeSidebarBinding;->inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;ZLjava/lang/Object;)Lcom/zykj/huiwei/launcher/databinding/HwIncludeHomeSidebarBinding;

    move-result-object p0

    return-object p0
.end method

.method public static inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;ZLjava/lang/Object;)Lcom/zykj/huiwei/launcher/databinding/HwIncludeHomeSidebarBinding;
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

    const v0, 0x7f0c004c

    .line 2
    invoke-static {p0, v0, p1, p2, p3}, Landroidx/databinding/ViewDataBinding;->inflateInternal(Landroid/view/LayoutInflater;ILandroid/view/ViewGroup;ZLjava/lang/Object;)Landroidx/databinding/ViewDataBinding;

    move-result-object p0

    check-cast p0, Lcom/zykj/huiwei/launcher/databinding/HwIncludeHomeSidebarBinding;

    return-object p0
.end method

.method public static inflate(Landroid/view/LayoutInflater;Ljava/lang/Object;)Lcom/zykj/huiwei/launcher/databinding/HwIncludeHomeSidebarBinding;
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

    const v2, 0x7f0c004c

    .line 4
    invoke-static {p0, v2, v0, v1, p1}, Landroidx/databinding/ViewDataBinding;->inflateInternal(Landroid/view/LayoutInflater;ILandroid/view/ViewGroup;ZLjava/lang/Object;)Landroidx/databinding/ViewDataBinding;

    move-result-object p0

    check-cast p0, Lcom/zykj/huiwei/launcher/databinding/HwIncludeHomeSidebarBinding;

    return-object p0
.end method


# virtual methods
.method public getClickListener()Landroid/view/View$OnClickListener;
    .locals 1
    .annotation build Landroidx/annotation/Nullable;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/zykj/huiwei/launcher/databinding/HwIncludeHomeSidebarBinding;->mClickListener:Landroid/view/View$OnClickListener;

    .line 2
    .line 3
    return-object v0
.end method

.method public getMainViewModel()Lcom/zykj/huiwei/launcher/viewmodels/MainViewModel;
    .locals 1
    .annotation build Landroidx/annotation/Nullable;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/zykj/huiwei/launcher/databinding/HwIncludeHomeSidebarBinding;->mMainViewModel:Lcom/zykj/huiwei/launcher/viewmodels/MainViewModel;

    .line 2
    .line 3
    return-object v0
.end method

.method public getVm()Lcom/zykj/huiwei/launcher/viewmodels/HomeViewModel;
    .locals 1
    .annotation build Landroidx/annotation/Nullable;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/zykj/huiwei/launcher/databinding/HwIncludeHomeSidebarBinding;->mVm:Lcom/zykj/huiwei/launcher/viewmodels/HomeViewModel;

    .line 2
    .line 3
    return-object v0
.end method

.method public abstract setClickListener(Landroid/view/View$OnClickListener;)V
    .param p1    # Landroid/view/View$OnClickListener;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param
.end method

.method public abstract setMainViewModel(Lcom/zykj/huiwei/launcher/viewmodels/MainViewModel;)V
    .param p1    # Lcom/zykj/huiwei/launcher/viewmodels/MainViewModel;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param
.end method

.method public abstract setVm(Lcom/zykj/huiwei/launcher/viewmodels/HomeViewModel;)V
    .param p1    # Lcom/zykj/huiwei/launcher/viewmodels/HomeViewModel;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param
.end method
