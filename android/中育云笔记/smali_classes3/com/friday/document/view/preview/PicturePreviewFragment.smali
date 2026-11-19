.class public final Lcom/friday/document/view/preview/PicturePreviewFragment;
.super Lcom/friday/common/base/BaseFragment;
.source "SourceFile"

# interfaces
.implements Lw2/b;


# annotations
.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x0
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/friday/document/view/preview/PicturePreviewFragment$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/friday/common/base/BaseFragment<",
        "Lcom/friday/document/databinding/FragmentPreviewPicBinding;",
        ">;",
        "Lw2/b;"
    }
.end annotation


# static fields
.field public static final d:Lcom/friday/document/view/preview/PicturePreviewFragment$a;

.field public static final e:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/friday/document/view/preview/PicturePreviewFragment$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/friday/document/view/preview/PicturePreviewFragment$a;-><init>(Lkotlin/jvm/internal/n;)V

    sput-object v0, Lcom/friday/document/view/preview/PicturePreviewFragment;->d:Lcom/friday/document/view/preview/PicturePreviewFragment$a;

    sget v0, Lcom/friday/common/base/BaseFragment;->$stable:I

    sput v0, Lcom/friday/document/view/preview/PicturePreviewFragment;->e:I

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


# virtual methods
.method public getLayoutId()I
    .locals 1

    .line 1
    sget v0, Lcom/friday/document/R$layout;->fragment_preview_pic:I

    .line 2
    .line 3
    return v0
.end method

.method public i()V
    .locals 3

    .line 1
    new-instance v0, Lcom/friday/document/view/viewer/ImagePreviewDialogFragment;

    .line 2
    .line 3
    invoke-direct {v0}, Lcom/friday/document/view/viewer/ImagePreviewDialogFragment;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getParentFragmentManager()Landroidx/fragment/app/FragmentManager;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    const-string v2, "getParentFragmentManager(...)"

    .line 11
    .line 12
    invoke-static {v1, v2}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    const-string v2, "ImagePreviewDialog"

    .line 16
    .line 17
    invoke-virtual {v0, v1, v2}, Lcom/friday/common/base/BaseDialogFragment;->show(Landroidx/fragment/app/FragmentManager;Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    return-void
.end method

.method public initData()V
    .locals 5

    .line 1
    invoke-virtual {p0}, Lcom/friday/common/base/BaseFragment;->getMBinding()Landroidx/databinding/ViewDataBinding;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    check-cast v0, Lcom/friday/document/databinding/FragmentPreviewPicBinding;

    .line 6
    .line 7
    iget-object v0, v0, Lcom/friday/document/databinding/FragmentPreviewPicBinding;->c:Landroidx/appcompat/widget/AppCompatImageView;

    .line 8
    .line 9
    const-string v1, "imageView"

    .line 10
    .line 11
    invoke-static {v0, v1}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {p0}, Lcom/friday/document/view/preview/PicturePreviewFragment;->q()Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 19
    .line 20
    .line 21
    move-result-object v2

    .line 22
    invoke-static {v2}, Lcoil3/l;->a(Landroid/content/Context;)Lcoil3/e;

    .line 23
    .line 24
    .line 25
    move-result-object v2

    .line 26
    new-instance v3, Lw/g$a;

    .line 27
    .line 28
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 29
    .line 30
    .line 31
    move-result-object v4

    .line 32
    invoke-direct {v3, v4}, Lw/g$a;-><init>(Landroid/content/Context;)V

    .line 33
    .line 34
    .line 35
    invoke-virtual {v3, v1}, Lw/g$a;->d(Ljava/lang/Object;)Lw/g$a;

    .line 36
    .line 37
    .line 38
    move-result-object v1

    .line 39
    invoke-static {v1, v0}, Lw/j;->q(Lw/g$a;Landroid/widget/ImageView;)Lw/g$a;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    sget-object v1, Lcoil3/request/CachePolicy;->h:Lcoil3/request/CachePolicy;

    .line 44
    .line 45
    invoke-virtual {v0, v1}, Lw/g$a;->k(Lcoil3/request/CachePolicy;)Lw/g$a;

    .line 46
    .line 47
    .line 48
    invoke-virtual {v0, v1}, Lw/g$a;->f(Lcoil3/request/CachePolicy;)Lw/g$a;

    .line 49
    .line 50
    .line 51
    invoke-virtual {v0, v1}, Lw/g$a;->l(Lcoil3/request/CachePolicy;)Lw/g$a;

    .line 52
    .line 53
    .line 54
    sget v1, Lcom/friday/document/R$drawable;->icon_micor_class_normal:I

    .line 55
    .line 56
    invoke-static {v0, v1}, Lw/j;->b(Lw/g$a;I)Lw/g$a;

    .line 57
    .line 58
    .line 59
    invoke-virtual {v0}, Lw/g$a;->c()Lw/g;

    .line 60
    .line 61
    .line 62
    move-result-object v0

    .line 63
    invoke-interface {v2, v0}, Lcoil3/e;->c(Lw/g;)Lw/c;

    .line 64
    .line 65
    .line 66
    return-void
.end method

.method public needHideLoadingOnDestroy()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final q()Ljava/lang/String;
    .locals 2

    .line 1
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getArguments()Landroid/os/Bundle;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eqz v0, :cond_1

    .line 6
    .line 7
    const-string v1, "localPath"

    .line 8
    .line 9
    invoke-virtual {v0, v1}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    if-nez v0, :cond_0

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    return-object v0

    .line 17
    :cond_1
    :goto_0
    const-string v0, ""

    .line 18
    .line 19
    return-object v0
.end method
