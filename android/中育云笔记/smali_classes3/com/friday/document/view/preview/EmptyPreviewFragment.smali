.class public final Lcom/friday/document/view/preview/EmptyPreviewFragment;
.super Lcom/friday/common/base/BaseFragment;
.source "SourceFile"


# annotations
.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x0
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/friday/document/view/preview/EmptyPreviewFragment$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/friday/common/base/BaseFragment<",
        "Lcom/friday/document/databinding/FragmentPreviewEmptyBinding;",
        ">;"
    }
.end annotation


# static fields
.field public static final d:Lcom/friday/document/view/preview/EmptyPreviewFragment$a;

.field public static final e:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/friday/document/view/preview/EmptyPreviewFragment$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/friday/document/view/preview/EmptyPreviewFragment$a;-><init>(Lkotlin/jvm/internal/n;)V

    sput-object v0, Lcom/friday/document/view/preview/EmptyPreviewFragment;->d:Lcom/friday/document/view/preview/EmptyPreviewFragment$a;

    sget v0, Lcom/friday/common/base/BaseFragment;->$stable:I

    sput v0, Lcom/friday/document/view/preview/EmptyPreviewFragment;->e:I

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/friday/common/base/BaseFragment;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic q(Lcom/friday/document/view/preview/EmptyPreviewFragment;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/friday/document/view/preview/EmptyPreviewFragment;->r(Lcom/friday/document/view/preview/EmptyPreviewFragment;Landroid/view/View;)V

    return-void
.end method

.method public static final r(Lcom/friday/document/view/preview/EmptyPreviewFragment;Landroid/view/View;)V
    .locals 1

    .line 1
    new-instance p1, Lcom/friday/common/widget/dialog/FBIWarningDialog;

    .line 2
    .line 3
    invoke-direct {p1}, Lcom/friday/common/widget/dialog/FBIWarningDialog;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getChildFragmentManager()Landroidx/fragment/app/FragmentManager;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    const-class v0, Lcom/friday/common/widget/dialog/FBIWarningDialog;

    .line 11
    .line 12
    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    invoke-virtual {p1, p0, v0}, Landroidx/fragment/app/DialogFragment;->show(Landroidx/fragment/app/FragmentManager;Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    return-void
.end method


# virtual methods
.method public getLayoutId()I
    .locals 1

    .line 1
    sget v0, Lcom/friday/document/R$layout;->fragment_preview_empty:I

    .line 2
    .line 3
    return v0
.end method

.method public initData()V
    .locals 0

    return-void
.end method

.method public needHideLoadingOnDestroy()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public onViewCreated(Landroid/view/View;Landroid/os/Bundle;)V
    .locals 1

    .line 1
    const-string v0, "view"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-super {p0, p1, p2}, Landroidx/fragment/app/Fragment;->onViewCreated(Landroid/view/View;Landroid/os/Bundle;)V

    .line 7
    .line 8
    .line 9
    invoke-virtual {p0}, Lcom/friday/common/base/BaseFragment;->getMBinding()Landroidx/databinding/ViewDataBinding;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    check-cast p1, Lcom/friday/document/databinding/FragmentPreviewEmptyBinding;

    .line 14
    .line 15
    iget-object p1, p1, Lcom/friday/document/databinding/FragmentPreviewEmptyBinding;->c:Lcom/friday/document/databinding/LayoutEmptyPreviewBinding;

    .line 16
    .line 17
    iget-object p1, p1, Lcom/friday/document/databinding/LayoutEmptyPreviewBinding;->c:Landroid/widget/ImageView;

    .line 18
    .line 19
    const/4 p2, 0x0

    .line 20
    invoke-virtual {p1, p2}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 21
    .line 22
    .line 23
    invoke-virtual {p0}, Lcom/friday/common/base/BaseFragment;->getMBinding()Landroidx/databinding/ViewDataBinding;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    check-cast p1, Lcom/friday/document/databinding/FragmentPreviewEmptyBinding;

    .line 28
    .line 29
    iget-object p1, p1, Lcom/friday/document/databinding/FragmentPreviewEmptyBinding;->c:Lcom/friday/document/databinding/LayoutEmptyPreviewBinding;

    .line 30
    .line 31
    iget-object p1, p1, Lcom/friday/document/databinding/LayoutEmptyPreviewBinding;->c:Landroid/widget/ImageView;

    .line 32
    .line 33
    new-instance p2, Lw2/a;

    .line 34
    .line 35
    invoke-direct {p2, p0}, Lw2/a;-><init>(Lcom/friday/document/view/preview/EmptyPreviewFragment;)V

    .line 36
    .line 37
    .line 38
    invoke-virtual {p1, p2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 39
    .line 40
    .line 41
    return-void
.end method
