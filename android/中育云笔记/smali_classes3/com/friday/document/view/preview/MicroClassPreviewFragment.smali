.class public final Lcom/friday/document/view/preview/MicroClassPreviewFragment;
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
        Lcom/friday/document/view/preview/MicroClassPreviewFragment$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/friday/common/base/BaseFragment<",
        "Lcom/friday/document/databinding/FragmentPreviewMicroClassBinding;",
        ">;",
        "Lw2/b;"
    }
.end annotation


# static fields
.field public static final e:Lcom/friday/document/view/preview/MicroClassPreviewFragment$a;

.field public static final f:I


# instance fields
.field public final d:Lvd/l;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/friday/document/view/preview/MicroClassPreviewFragment$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/friday/document/view/preview/MicroClassPreviewFragment$a;-><init>(Lkotlin/jvm/internal/n;)V

    sput-object v0, Lcom/friday/document/view/preview/MicroClassPreviewFragment;->e:Lcom/friday/document/view/preview/MicroClassPreviewFragment$a;

    const/16 v0, 0x8

    sput v0, Lcom/friday/document/view/preview/MicroClassPreviewFragment;->f:I

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Lcom/friday/common/base/BaseFragment;-><init>()V

    .line 2
    .line 3
    .line 4
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 5
    .line 6
    invoke-static {v0}, Lvd/v;->a(Ljava/lang/Object;)Lvd/l;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    iput-object v0, p0, Lcom/friday/document/view/preview/MicroClassPreviewFragment;->d:Lvd/l;

    .line 11
    .line 12
    return-void
.end method

.method public static synthetic q(Lcom/friday/document/view/preview/MicroClassPreviewFragment;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/friday/document/view/preview/MicroClassPreviewFragment;->x(Lcom/friday/document/view/preview/MicroClassPreviewFragment;Landroid/view/View;)V

    return-void
.end method

.method public static final synthetic r(Lcom/friday/document/view/preview/MicroClassPreviewFragment;)Ljava/lang/String;
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/friday/document/view/preview/MicroClassPreviewFragment;->v()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static final synthetic s(Lcom/friday/document/view/preview/MicroClassPreviewFragment;)Ljava/lang/String;
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/friday/document/view/preview/MicroClassPreviewFragment;->w()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static final synthetic t(Lcom/friday/document/view/preview/MicroClassPreviewFragment;)Lcom/friday/document/databinding/FragmentPreviewMicroClassBinding;
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/friday/common/base/BaseFragment;->getMBinding()Landroidx/databinding/ViewDataBinding;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    check-cast p0, Lcom/friday/document/databinding/FragmentPreviewMicroClassBinding;

    .line 6
    .line 7
    return-object p0
.end method

.method public static final synthetic u(Lcom/friday/document/view/preview/MicroClassPreviewFragment;)Lvd/l;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/friday/document/view/preview/MicroClassPreviewFragment;->d:Lvd/l;

    .line 2
    .line 3
    return-object p0
.end method

.method private final w()Ljava/lang/String;
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

.method public static final x(Lcom/friday/document/view/preview/MicroClassPreviewFragment;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/friday/document/view/preview/MicroClassPreviewFragment;->i()V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public getLayoutId()I
    .locals 1

    .line 1
    sget v0, Lcom/friday/document/R$layout;->fragment_preview_micro_class:I

    .line 2
    .line 3
    return v0
.end method

.method public i()V
    .locals 8

    .line 1
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getViewLifecycleOwner()Landroidx/lifecycle/LifecycleOwner;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const-string v1, "getViewLifecycleOwner(...)"

    .line 6
    .line 7
    invoke-static {v0, v1}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    invoke-static {v0}, Landroidx/lifecycle/LifecycleOwnerKt;->getLifecycleScope(Landroidx/lifecycle/LifecycleOwner;)Landroidx/lifecycle/LifecycleCoroutineScope;

    .line 11
    .line 12
    .line 13
    move-result-object v2

    .line 14
    new-instance v5, Lcom/friday/document/view/preview/MicroClassPreviewFragment$onFullScreen$1;

    .line 15
    .line 16
    const/4 v0, 0x0

    .line 17
    invoke-direct {v5, p0, v0}, Lcom/friday/document/view/preview/MicroClassPreviewFragment$onFullScreen$1;-><init>(Lcom/friday/document/view/preview/MicroClassPreviewFragment;Lvc/c;)V

    .line 18
    .line 19
    .line 20
    const/4 v6, 0x3

    .line 21
    const/4 v7, 0x0

    .line 22
    const/4 v3, 0x0

    .line 23
    const/4 v4, 0x0

    .line 24
    invoke-static/range {v2 .. v7}, Lsd/f;->d(Lsd/i0;Lkotlin/coroutines/d;Lkotlinx/coroutines/CoroutineStart;Lhd/p;ILjava/lang/Object;)Lkotlinx/coroutines/g;

    .line 25
    .line 26
    .line 27
    return-void
.end method

.method public initData()V
    .locals 2

    .line 1
    invoke-virtual {p0}, Lcom/friday/common/base/BaseFragment;->getMBinding()Landroidx/databinding/ViewDataBinding;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    check-cast v0, Lcom/friday/document/databinding/FragmentPreviewMicroClassBinding;

    .line 6
    .line 7
    iget-object v0, v0, Lcom/friday/document/databinding/FragmentPreviewMicroClassBinding;->c:Landroidx/appcompat/widget/AppCompatImageView;

    .line 8
    .line 9
    new-instance v1, Lw2/c;

    .line 10
    .line 11
    invoke-direct {v1, p0}, Lw2/c;-><init>(Lcom/friday/document/view/preview/MicroClassPreviewFragment;)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

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

.method public onViewCreated(Landroid/view/View;Landroid/os/Bundle;)V
    .locals 6

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
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getViewLifecycleOwner()Landroidx/lifecycle/LifecycleOwner;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    const-string p2, "getViewLifecycleOwner(...)"

    .line 14
    .line 15
    invoke-static {p1, p2}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    invoke-static {p1}, Landroidx/lifecycle/LifecycleOwnerKt;->getLifecycleScope(Landroidx/lifecycle/LifecycleOwner;)Landroidx/lifecycle/LifecycleCoroutineScope;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    new-instance v3, Lcom/friday/document/view/preview/MicroClassPreviewFragment$onViewCreated$1;

    .line 23
    .line 24
    const/4 p1, 0x0

    .line 25
    invoke-direct {v3, p0, p1}, Lcom/friday/document/view/preview/MicroClassPreviewFragment$onViewCreated$1;-><init>(Lcom/friday/document/view/preview/MicroClassPreviewFragment;Lvc/c;)V

    .line 26
    .line 27
    .line 28
    const/4 v4, 0x3

    .line 29
    const/4 v5, 0x0

    .line 30
    const/4 v1, 0x0

    .line 31
    const/4 v2, 0x0

    .line 32
    invoke-static/range {v0 .. v5}, Lsd/f;->d(Lsd/i0;Lkotlin/coroutines/d;Lkotlinx/coroutines/CoroutineStart;Lhd/p;ILjava/lang/Object;)Lkotlinx/coroutines/g;

    .line 33
    .line 34
    .line 35
    return-void
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
    const-string v1, "coverPath"

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

.method public final y(Z)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/friday/document/view/preview/MicroClassPreviewFragment;->d:Lvd/l;

    .line 2
    .line 3
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    invoke-interface {v0, p1}, Lvd/k;->a(Ljava/lang/Object;)Z

    .line 8
    .line 9
    .line 10
    return-void
.end method
