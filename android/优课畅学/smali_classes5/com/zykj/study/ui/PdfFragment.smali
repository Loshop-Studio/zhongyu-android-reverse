.class public final Lcom/zykj/study/ui/PdfFragment;
.super Lcom/zykj/study/ui/Hilt_PdfFragment;
.source "SourceFile"

# interfaces
.implements Lz0/f;
.implements Lz0/d;
.implements Lz0/g;


# annotations
.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x0
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/zykj/study/ui/Hilt_PdfFragment<",
        "Lcom/zykj/study/databinding/FragmentPdfBinding;",
        ">;",
        "Lz0/f;",
        "Lz0/d;",
        "Lz0/g;"
    }
.end annotation


# instance fields
.field public final f:Lh7/d;

.field public final g:Landroidx/navigation/NavArgsLazy;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 5

    .line 1
    invoke-direct {p0}, Lcom/zykj/study/ui/Hilt_PdfFragment;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lcom/zykj/study/ui/PdfFragment$special$$inlined$viewModels$default$1;

    .line 5
    .line 6
    invoke-direct {v0, p0}, Lcom/zykj/study/ui/PdfFragment$special$$inlined$viewModels$default$1;-><init>(Landroidx/fragment/app/Fragment;)V

    .line 7
    .line 8
    .line 9
    sget-object v1, Lkotlin/LazyThreadSafetyMode;->c:Lkotlin/LazyThreadSafetyMode;

    .line 10
    .line 11
    new-instance v2, Lcom/zykj/study/ui/PdfFragment$special$$inlined$viewModels$default$2;

    .line 12
    .line 13
    invoke-direct {v2, v0}, Lcom/zykj/study/ui/PdfFragment$special$$inlined$viewModels$default$2;-><init>(Lx7/a;)V

    .line 14
    .line 15
    .line 16
    invoke-static {v1, v2}, Lkotlin/a;->a(Lkotlin/LazyThreadSafetyMode;Lx7/a;)Lh7/d;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    const-class v1, Lcom/zykj/study/viewmodels/PDFViewModel;

    .line 21
    .line 22
    invoke-static {v1}, Lkotlin/jvm/internal/y;->b(Ljava/lang/Class;)Le8/c;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    new-instance v2, Lcom/zykj/study/ui/PdfFragment$special$$inlined$viewModels$default$3;

    .line 27
    .line 28
    invoke-direct {v2, v0}, Lcom/zykj/study/ui/PdfFragment$special$$inlined$viewModels$default$3;-><init>(Lh7/d;)V

    .line 29
    .line 30
    .line 31
    new-instance v3, Lcom/zykj/study/ui/PdfFragment$special$$inlined$viewModels$default$4;

    .line 32
    .line 33
    const/4 v4, 0x0

    .line 34
    invoke-direct {v3, v4, v0}, Lcom/zykj/study/ui/PdfFragment$special$$inlined$viewModels$default$4;-><init>(Lx7/a;Lh7/d;)V

    .line 35
    .line 36
    .line 37
    new-instance v4, Lcom/zykj/study/ui/PdfFragment$special$$inlined$viewModels$default$5;

    .line 38
    .line 39
    invoke-direct {v4, p0, v0}, Lcom/zykj/study/ui/PdfFragment$special$$inlined$viewModels$default$5;-><init>(Landroidx/fragment/app/Fragment;Lh7/d;)V

    .line 40
    .line 41
    .line 42
    invoke-static {p0, v1, v2, v3, v4}, Landroidx/fragment/app/FragmentViewModelLazyKt;->createViewModelLazy(Landroidx/fragment/app/Fragment;Le8/c;Lx7/a;Lx7/a;Lx7/a;)Lh7/d;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    iput-object v0, p0, Lcom/zykj/study/ui/PdfFragment;->f:Lh7/d;

    .line 47
    .line 48
    new-instance v0, Landroidx/navigation/NavArgsLazy;

    .line 49
    .line 50
    const-class v1, Lcom/zykj/study/ui/PdfFragmentArgs;

    .line 51
    .line 52
    invoke-static {v1}, Lkotlin/jvm/internal/y;->b(Ljava/lang/Class;)Le8/c;

    .line 53
    .line 54
    .line 55
    move-result-object v1

    .line 56
    new-instance v2, Lcom/zykj/study/ui/PdfFragment$a;

    .line 57
    .line 58
    invoke-direct {v2, p0}, Lcom/zykj/study/ui/PdfFragment$a;-><init>(Landroidx/fragment/app/Fragment;)V

    .line 59
    .line 60
    .line 61
    invoke-direct {v0, v1, v2}, Landroidx/navigation/NavArgsLazy;-><init>(Le8/c;Lx7/a;)V

    .line 62
    .line 63
    .line 64
    iput-object v0, p0, Lcom/zykj/study/ui/PdfFragment;->g:Landroidx/navigation/NavArgsLazy;

    .line 65
    .line 66
    return-void
.end method

.method public static final synthetic g(Lcom/zykj/study/ui/PdfFragment;)Lcom/zykj/study/ui/PdfFragmentArgs;
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/zykj/study/ui/PdfFragment;->i()Lcom/zykj/study/ui/PdfFragmentArgs;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static final synthetic h(Lcom/zykj/study/ui/PdfFragment;)Lcom/zykj/study/viewmodels/PDFViewModel;
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/zykj/study/ui/PdfFragment;->j()Lcom/zykj/study/viewmodels/PDFViewModel;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method


# virtual methods
.method public a(ILjava/lang/Throwable;)V
    .locals 0

    .line 1
    return-void
.end method

.method public c(II)V
    .locals 4

    .line 1
    invoke-virtual {p0}, Lcom/zykj/study/ui/PdfFragment;->j()Lcom/zykj/study/viewmodels/PDFViewModel;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    new-instance v1, Lcom/zykj/study/viewmodels/a$b;

    .line 6
    .line 7
    new-instance v2, Lcom/zykj/study/data/PdfEntity;

    .line 8
    .line 9
    invoke-virtual {p0}, Lcom/zykj/study/ui/PdfFragment;->i()Lcom/zykj/study/ui/PdfFragmentArgs;

    .line 10
    .line 11
    .line 12
    move-result-object v3

    .line 13
    invoke-virtual {v3}, Lcom/zykj/study/ui/PdfFragmentArgs;->a()Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object v3

    .line 17
    invoke-direct {v2, v3, p1, p2}, Lcom/zykj/study/data/PdfEntity;-><init>(Ljava/lang/String;II)V

    .line 18
    .line 19
    .line 20
    invoke-direct {v1, v2}, Lcom/zykj/study/viewmodels/a$b;-><init>(Lcom/zykj/study/data/PdfEntity;)V

    .line 21
    .line 22
    .line 23
    invoke-virtual {v0, v1}, Lcom/zykj/study/viewmodels/PDFViewModel;->c(Lcom/zykj/study/viewmodels/a;)V

    .line 24
    .line 25
    .line 26
    return-void
.end method

.method public d(I)V
    .locals 0

    .line 1
    return-void
.end method

.method public final i()Lcom/zykj/study/ui/PdfFragmentArgs;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/study/ui/PdfFragment;->g:Landroidx/navigation/NavArgsLazy;

    .line 2
    .line 3
    invoke-interface {v0}, Lh7/d;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lcom/zykj/study/ui/PdfFragmentArgs;

    .line 8
    .line 9
    return-object v0
.end method

.method public initView(Landroid/os/Bundle;Lm7/c;)Ljava/lang/Object;
    .locals 6

    .line 1
    new-instance p1, Ljava/io/File;

    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/zykj/study/ui/PdfFragment;->i()Lcom/zykj/study/ui/PdfFragmentArgs;

    .line 4
    .line 5
    .line 6
    move-result-object p2

    .line 7
    invoke-virtual {p2}, Lcom/zykj/study/ui/PdfFragmentArgs;->a()Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object p2

    .line 11
    invoke-direct {p1, p2}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {p1}, Ljava/io/File;->exists()Z

    .line 15
    .line 16
    .line 17
    move-result p1

    .line 18
    if-nez p1, :cond_0

    .line 19
    .line 20
    sget-object p1, Lcom/zykj/base/utils/XToastUtils;->INSTANCE:Lcom/zykj/base/utils/XToastUtils;

    .line 21
    .line 22
    invoke-virtual {p0}, Lcom/zykj/study/ui/PdfFragment;->i()Lcom/zykj/study/ui/PdfFragmentArgs;

    .line 23
    .line 24
    .line 25
    move-result-object p2

    .line 26
    invoke-virtual {p2}, Lcom/zykj/study/ui/PdfFragmentArgs;->a()Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object p2

    .line 30
    new-instance v0, Ljava/lang/StringBuilder;

    .line 31
    .line 32
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 33
    .line 34
    .line 35
    const-string v1, "\u6587\u4ef6\u4e0d\u5b58\u5728:"

    .line 36
    .line 37
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 38
    .line 39
    .line 40
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 41
    .line 42
    .line 43
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object p2

    .line 47
    invoke-static {p1, p2}, Le5/o;->d(Lcom/zykj/base/utils/XToastUtils;Ljava/lang/String;)V

    .line 48
    .line 49
    .line 50
    invoke-static {p0}, Landroidx/navigation/fragment/FragmentKt;->findNavController(Landroidx/fragment/app/Fragment;)Landroidx/navigation/NavController;

    .line 51
    .line 52
    .line 53
    move-result-object p1

    .line 54
    invoke-virtual {p1}, Landroidx/navigation/NavController;->navigateUp()Z

    .line 55
    .line 56
    .line 57
    sget-object p1, Lh7/p;->a:Lh7/p;

    .line 58
    .line 59
    return-object p1

    .line 60
    :cond_0
    invoke-virtual {p0}, Lcom/zykj/study/ui/PdfFragment;->j()Lcom/zykj/study/viewmodels/PDFViewModel;

    .line 61
    .line 62
    .line 63
    move-result-object p1

    .line 64
    new-instance p2, Lcom/zykj/study/viewmodels/a$a;

    .line 65
    .line 66
    invoke-virtual {p0}, Lcom/zykj/study/ui/PdfFragment;->i()Lcom/zykj/study/ui/PdfFragmentArgs;

    .line 67
    .line 68
    .line 69
    move-result-object v0

    .line 70
    invoke-virtual {v0}, Lcom/zykj/study/ui/PdfFragmentArgs;->a()Ljava/lang/String;

    .line 71
    .line 72
    .line 73
    move-result-object v0

    .line 74
    invoke-direct {p2, v0}, Lcom/zykj/study/viewmodels/a$a;-><init>(Ljava/lang/String;)V

    .line 75
    .line 76
    .line 77
    invoke-virtual {p1, p2}, Lcom/zykj/study/viewmodels/PDFViewModel;->c(Lcom/zykj/study/viewmodels/a;)V

    .line 78
    .line 79
    .line 80
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getViewLifecycleOwner()Landroidx/lifecycle/LifecycleOwner;

    .line 81
    .line 82
    .line 83
    move-result-object p1

    .line 84
    const-string p2, "getViewLifecycleOwner(...)"

    .line 85
    .line 86
    invoke-static {p1, p2}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 87
    .line 88
    .line 89
    invoke-static {p1}, Landroidx/lifecycle/LifecycleOwnerKt;->getLifecycleScope(Landroidx/lifecycle/LifecycleOwner;)Landroidx/lifecycle/LifecycleCoroutineScope;

    .line 90
    .line 91
    .line 92
    move-result-object v0

    .line 93
    new-instance v3, Lcom/zykj/study/ui/PdfFragment$initView$2;

    .line 94
    .line 95
    const/4 p1, 0x0

    .line 96
    invoke-direct {v3, p0, p1}, Lcom/zykj/study/ui/PdfFragment$initView$2;-><init>(Lcom/zykj/study/ui/PdfFragment;Lm7/c;)V

    .line 97
    .line 98
    .line 99
    const/4 v4, 0x3

    .line 100
    const/4 v5, 0x0

    .line 101
    const/4 v1, 0x0

    .line 102
    const/4 v2, 0x0

    .line 103
    invoke-static/range {v0 .. v5}, Li8/f;->d(Li8/b0;Lkotlin/coroutines/d;Lkotlinx/coroutines/CoroutineStart;Lx7/p;ILjava/lang/Object;)Lkotlinx/coroutines/n;

    .line 104
    .line 105
    .line 106
    sget-object p1, Lh7/p;->a:Lh7/p;

    .line 107
    .line 108
    return-object p1
.end method

.method public final j()Lcom/zykj/study/viewmodels/PDFViewModel;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/study/ui/PdfFragment;->f:Lh7/d;

    .line 2
    .line 3
    invoke-interface {v0}, Lh7/d;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lcom/zykj/study/viewmodels/PDFViewModel;

    .line 8
    .line 9
    return-object v0
.end method

.method public layoutId()I
    .locals 1

    .line 1
    sget v0, Lcom/zykj/study/R$layout;->fragment_pdf:I

    .line 2
    .line 3
    return v0
.end method
