.class public final Lcom/friday/document/view/preview/PdfPreviewFragment;
.super Lcom/friday/document/view/preview/Hilt_PdfPreviewFragment;
.source "SourceFile"

# interfaces
.implements Ll4/f;
.implements Ll4/d;
.implements Ll4/g;
.implements Lw2/b;


# annotations
.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x0
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/friday/document/view/preview/PdfPreviewFragment$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/friday/document/view/preview/Hilt_PdfPreviewFragment<",
        "Lcom/friday/document/databinding/FragmentPreviewPdfBinding;",
        ">;",
        "Ll4/f;",
        "Ll4/d;",
        "Ll4/g;",
        "Lw2/b;"
    }
.end annotation


# static fields
.field public static final j:Lcom/friday/document/view/preview/PdfPreviewFragment$a;

.field public static final k:I


# instance fields
.field public final i:Lqc/d;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/friday/document/view/preview/PdfPreviewFragment$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/friday/document/view/preview/PdfPreviewFragment$a;-><init>(Lkotlin/jvm/internal/n;)V

    sput-object v0, Lcom/friday/document/view/preview/PdfPreviewFragment;->j:Lcom/friday/document/view/preview/PdfPreviewFragment$a;

    const/16 v0, 0x8

    sput v0, Lcom/friday/document/view/preview/PdfPreviewFragment;->k:I

    return-void
.end method

.method public constructor <init>()V
    .locals 5

    .line 1
    invoke-direct {p0}, Lcom/friday/document/view/preview/Hilt_PdfPreviewFragment;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lcom/friday/document/view/preview/PdfPreviewFragment$special$$inlined$viewModels$default$1;

    .line 5
    .line 6
    invoke-direct {v0, p0}, Lcom/friday/document/view/preview/PdfPreviewFragment$special$$inlined$viewModels$default$1;-><init>(Landroidx/fragment/app/Fragment;)V

    .line 7
    .line 8
    .line 9
    sget-object v1, Lkotlin/LazyThreadSafetyMode;->e:Lkotlin/LazyThreadSafetyMode;

    .line 10
    .line 11
    new-instance v2, Lcom/friday/document/view/preview/PdfPreviewFragment$special$$inlined$viewModels$default$2;

    .line 12
    .line 13
    invoke-direct {v2, v0}, Lcom/friday/document/view/preview/PdfPreviewFragment$special$$inlined$viewModels$default$2;-><init>(Lhd/a;)V

    .line 14
    .line 15
    .line 16
    invoke-static {v1, v2}, Lkotlin/a;->b(Lkotlin/LazyThreadSafetyMode;Lhd/a;)Lqc/d;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    const-class v1, Lcom/friday/document/viewmodel/PdfViewerViewModel;

    .line 21
    .line 22
    invoke-static {v1}, Lkotlin/jvm/internal/y;->b(Ljava/lang/Class;)Lod/c;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    new-instance v2, Lcom/friday/document/view/preview/PdfPreviewFragment$special$$inlined$viewModels$default$3;

    .line 27
    .line 28
    invoke-direct {v2, v0}, Lcom/friday/document/view/preview/PdfPreviewFragment$special$$inlined$viewModels$default$3;-><init>(Lqc/d;)V

    .line 29
    .line 30
    .line 31
    new-instance v3, Lcom/friday/document/view/preview/PdfPreviewFragment$special$$inlined$viewModels$default$4;

    .line 32
    .line 33
    const/4 v4, 0x0

    .line 34
    invoke-direct {v3, v4, v0}, Lcom/friday/document/view/preview/PdfPreviewFragment$special$$inlined$viewModels$default$4;-><init>(Lhd/a;Lqc/d;)V

    .line 35
    .line 36
    .line 37
    new-instance v4, Lcom/friday/document/view/preview/PdfPreviewFragment$special$$inlined$viewModels$default$5;

    .line 38
    .line 39
    invoke-direct {v4, p0, v0}, Lcom/friday/document/view/preview/PdfPreviewFragment$special$$inlined$viewModels$default$5;-><init>(Landroidx/fragment/app/Fragment;Lqc/d;)V

    .line 40
    .line 41
    .line 42
    invoke-static {p0, v1, v2, v3, v4}, Landroidx/fragment/app/FragmentViewModelLazyKt;->createViewModelLazy(Landroidx/fragment/app/Fragment;Lod/c;Lhd/a;Lhd/a;Lhd/a;)Lqc/d;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    iput-object v0, p0, Lcom/friday/document/view/preview/PdfPreviewFragment;->i:Lqc/d;

    .line 47
    .line 48
    return-void
.end method

.method public static final synthetic r(Lcom/friday/document/view/preview/PdfPreviewFragment;)Ljava/lang/String;
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/friday/document/view/preview/PdfPreviewFragment;->u()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static final synthetic s(Lcom/friday/document/view/preview/PdfPreviewFragment;)Lcom/friday/document/databinding/FragmentPreviewPdfBinding;
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/friday/common/base/BaseFragment;->getMBinding()Landroidx/databinding/ViewDataBinding;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    check-cast p0, Lcom/friday/document/databinding/FragmentPreviewPdfBinding;

    .line 6
    .line 7
    return-object p0
.end method

.method public static final synthetic t(Lcom/friday/document/view/preview/PdfPreviewFragment;)Lcom/friday/document/viewmodel/PdfViewerViewModel;
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/friday/document/view/preview/PdfPreviewFragment;->v()Lcom/friday/document/viewmodel/PdfViewerViewModel;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method


# virtual methods
.method public d(ILjava/lang/Throwable;)V
    .locals 0

    .line 1
    return-void
.end method

.method public getLayoutId()I
    .locals 1

    .line 1
    sget v0, Lcom/friday/document/R$layout;->fragment_preview_pdf:I

    .line 2
    .line 3
    return v0
.end method

.method public i()V
    .locals 2

    .line 1
    sget-object v0, Lcom/friday/common/helper/c;->a:Lcom/friday/common/helper/c;

    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/friday/document/view/preview/PdfPreviewFragment;->u()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-virtual {v0, v1}, Lcom/friday/common/helper/c;->m(Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public initData()V
    .locals 4

    .line 1
    invoke-virtual {p0}, Lcom/friday/document/view/preview/PdfPreviewFragment;->v()Lcom/friday/document/viewmodel/PdfViewerViewModel;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    new-instance v1, Lcom/friday/document/viewmodel/a$a;

    .line 6
    .line 7
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getArguments()Landroid/os/Bundle;

    .line 8
    .line 9
    .line 10
    move-result-object v2

    .line 11
    if-eqz v2, :cond_0

    .line 12
    .line 13
    const-string v3, "filePath"

    .line 14
    .line 15
    invoke-virtual {v2, v3}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object v2

    .line 19
    if-nez v2, :cond_1

    .line 20
    .line 21
    :cond_0
    const-string v2, ""

    .line 22
    .line 23
    :cond_1
    invoke-direct {v1, v2}, Lcom/friday/document/viewmodel/a$a;-><init>(Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    invoke-virtual {v0, v1}, Lcom/friday/document/viewmodel/PdfViewerViewModel;->c(Lcom/friday/document/viewmodel/a;)V

    .line 27
    .line 28
    .line 29
    return-void
.end method

.method public k(II)V
    .locals 4

    .line 1
    invoke-virtual {p0}, Lcom/friday/document/view/preview/PdfPreviewFragment;->v()Lcom/friday/document/viewmodel/PdfViewerViewModel;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    new-instance v1, Lcom/friday/document/viewmodel/a$b;

    .line 6
    .line 7
    new-instance v2, Lcom/friday/common/entity/PdfEntity;

    .line 8
    .line 9
    invoke-virtual {p0}, Lcom/friday/document/view/preview/PdfPreviewFragment;->u()Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v3

    .line 13
    invoke-direct {v2, v3, p1, p2}, Lcom/friday/common/entity/PdfEntity;-><init>(Ljava/lang/String;II)V

    .line 14
    .line 15
    .line 16
    invoke-direct {v1, v2}, Lcom/friday/document/viewmodel/a$b;-><init>(Lcom/friday/common/entity/PdfEntity;)V

    .line 17
    .line 18
    .line 19
    invoke-virtual {v0, v1}, Lcom/friday/document/viewmodel/PdfViewerViewModel;->c(Lcom/friday/document/viewmodel/a;)V

    .line 20
    .line 21
    .line 22
    return-void
.end method

.method public m(I)V
    .locals 0

    .line 1
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
    new-instance v3, Lcom/friday/document/view/preview/PdfPreviewFragment$onViewCreated$1;

    .line 23
    .line 24
    const/4 p1, 0x0

    .line 25
    invoke-direct {v3, p0, p1}, Lcom/friday/document/view/preview/PdfPreviewFragment$onViewCreated$1;-><init>(Lcom/friday/document/view/preview/PdfPreviewFragment;Lvc/c;)V

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

.method public final u()Ljava/lang/String;
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

.method public final v()Lcom/friday/document/viewmodel/PdfViewerViewModel;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/friday/document/view/preview/PdfPreviewFragment;->i:Lqc/d;

    .line 2
    .line 3
    invoke-interface {v0}, Lqc/d;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lcom/friday/document/viewmodel/PdfViewerViewModel;

    .line 8
    .line 9
    return-object v0
.end method
