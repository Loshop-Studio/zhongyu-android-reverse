.class public final Lcom/friday/document/view/preview/TxtPreviewFragment;
.super Lcom/friday/document/view/preview/Hilt_TxtPreviewFragment;
.source "SourceFile"

# interfaces
.implements Lw2/b;


# annotations
.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x0
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/friday/document/view/preview/TxtPreviewFragment$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/friday/document/view/preview/Hilt_TxtPreviewFragment<",
        "Lcom/friday/document/databinding/FragmentPreviewTxtBinding;",
        ">;",
        "Lw2/b;"
    }
.end annotation


# static fields
.field public static final i:Lcom/friday/document/view/preview/TxtPreviewFragment$a;

.field public static final j:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/friday/document/view/preview/TxtPreviewFragment$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/friday/document/view/preview/TxtPreviewFragment$a;-><init>(Lkotlin/jvm/internal/n;)V

    sput-object v0, Lcom/friday/document/view/preview/TxtPreviewFragment;->i:Lcom/friday/document/view/preview/TxtPreviewFragment$a;

    sget v0, Lcom/friday/common/base/BaseFragment;->$stable:I

    sput v0, Lcom/friday/document/view/preview/TxtPreviewFragment;->j:I

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/friday/document/view/preview/Hilt_TxtPreviewFragment;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static final synthetic r(Lcom/friday/document/view/preview/TxtPreviewFragment;)Ljava/lang/String;
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/friday/document/view/preview/TxtPreviewFragment;->u()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static final synthetic s(Lcom/friday/document/view/preview/TxtPreviewFragment;)Lcom/friday/document/databinding/FragmentPreviewTxtBinding;
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/friday/common/base/BaseFragment;->getMBinding()Landroidx/databinding/ViewDataBinding;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    check-cast p0, Lcom/friday/document/databinding/FragmentPreviewTxtBinding;

    .line 6
    .line 7
    return-object p0
.end method

.method private final u()Ljava/lang/String;
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
    const-string v1, "filePath"

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


# virtual methods
.method public getLayoutId()I
    .locals 1

    .line 1
    sget v0, Lcom/friday/document/R$layout;->fragment_preview_txt:I

    .line 2
    .line 3
    return v0
.end method

.method public i()V
    .locals 10

    .line 1
    sget-object v0, Lcom/friday/common/helper/c;->a:Lcom/friday/common/helper/c;

    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/friday/document/view/preview/TxtPreviewFragment;->t()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v3

    .line 7
    invoke-virtual {p0}, Lcom/friday/document/view/preview/TxtPreviewFragment;->v()Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object v5

    .line 11
    invoke-direct {p0}, Lcom/friday/document/view/preview/TxtPreviewFragment;->u()Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object v7

    .line 15
    const/16 v8, 0x8

    .line 16
    .line 17
    const/4 v9, 0x0

    .line 18
    const-string v1, ""

    .line 19
    .line 20
    const-string v2, ""

    .line 21
    .line 22
    const/4 v4, 0x0

    .line 23
    const/4 v6, 0x0

    .line 24
    invoke-static/range {v0 .. v9}, Lcom/friday/common/helper/c;->q(Lcom/friday/common/helper/c;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/friday/common/entity/FromPage;Ljava/lang/String;ZLjava/lang/String;ILjava/lang/Object;)V

    .line 25
    .line 26
    .line 27
    return-void
.end method

.method public initData()V
    .locals 6

    .line 1
    invoke-static {p0}, Landroidx/lifecycle/LifecycleOwnerKt;->getLifecycleScope(Landroidx/lifecycle/LifecycleOwner;)Landroidx/lifecycle/LifecycleCoroutineScope;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    new-instance v3, Lcom/friday/document/view/preview/TxtPreviewFragment$initData$1;

    .line 6
    .line 7
    const/4 v1, 0x0

    .line 8
    invoke-direct {v3, p0, v1}, Lcom/friday/document/view/preview/TxtPreviewFragment$initData$1;-><init>(Lcom/friday/document/view/preview/TxtPreviewFragment;Lvc/c;)V

    .line 9
    .line 10
    .line 11
    const/4 v4, 0x3

    .line 12
    const/4 v5, 0x0

    .line 13
    const/4 v2, 0x0

    .line 14
    invoke-static/range {v0 .. v5}, Lsd/f;->d(Lsd/i0;Lkotlin/coroutines/d;Lkotlinx/coroutines/CoroutineStart;Lhd/p;ILjava/lang/Object;)Lkotlinx/coroutines/g;

    .line 15
    .line 16
    .line 17
    return-void
.end method

.method public needHideLoadingOnDestroy()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final t()Ljava/lang/String;
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
    const-string v1, "fileName"

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

.method public final v()Ljava/lang/String;
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
    const-string v1, "shareTime"

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
