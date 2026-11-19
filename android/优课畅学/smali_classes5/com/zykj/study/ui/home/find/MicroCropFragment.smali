.class public final Lcom/zykj/study/ui/home/find/MicroCropFragment;
.super Lcom/zykj/base/BaseFragment;
.source "SourceFile"


# annotations
.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x0
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/zykj/study/ui/home/find/MicroCropFragment$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/zykj/base/BaseFragment<",
        "Lcom/zykj/study/databinding/FragmentMicroCropBinding;",
        ">;"
    }
.end annotation


# static fields
.field public static final b:Lcom/zykj/study/ui/home/find/MicroCropFragment$a;

.field public static final c:I


# instance fields
.field public final a:Landroidx/navigation/NavArgsLazy;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/zykj/study/ui/home/find/MicroCropFragment$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/zykj/study/ui/home/find/MicroCropFragment$a;-><init>(Lkotlin/jvm/internal/n;)V

    sput-object v0, Lcom/zykj/study/ui/home/find/MicroCropFragment;->b:Lcom/zykj/study/ui/home/find/MicroCropFragment$a;

    const/16 v0, 0x8

    sput v0, Lcom/zykj/study/ui/home/find/MicroCropFragment;->c:I

    return-void
.end method

.method public constructor <init>()V
    .locals 3

    .line 1
    invoke-direct {p0}, Lcom/zykj/base/BaseFragment;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Landroidx/navigation/NavArgsLazy;

    .line 5
    .line 6
    const-class v1, Lcom/zykj/study/ui/home/find/MicroCropFragmentArgs;

    .line 7
    .line 8
    invoke-static {v1}, Lkotlin/jvm/internal/y;->b(Ljava/lang/Class;)Le8/c;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    new-instance v2, Lcom/zykj/study/ui/home/find/MicroCropFragment$b;

    .line 13
    .line 14
    invoke-direct {v2, p0}, Lcom/zykj/study/ui/home/find/MicroCropFragment$b;-><init>(Landroidx/fragment/app/Fragment;)V

    .line 15
    .line 16
    .line 17
    invoke-direct {v0, v1, v2}, Landroidx/navigation/NavArgsLazy;-><init>(Le8/c;Lx7/a;)V

    .line 18
    .line 19
    .line 20
    iput-object v0, p0, Lcom/zykj/study/ui/home/find/MicroCropFragment;->a:Landroidx/navigation/NavArgsLazy;

    .line 21
    .line 22
    return-void
.end method

.method public static synthetic f(Lcom/zykj/study/ui/home/find/MicroCropFragment;Lcom/zykj/view/board/crop/BlackboardCropFragment;Z)Lh7/p;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lcom/zykj/study/ui/home/find/MicroCropFragment;->s(Lcom/zykj/study/ui/home/find/MicroCropFragment;Lcom/zykj/view/board/crop/BlackboardCropFragment;Z)Lh7/p;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic g(Lcom/zykj/study/ui/home/find/MicroCropFragment;Landroidx/activity/OnBackPressedCallback;)Lh7/p;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/zykj/study/ui/home/find/MicroCropFragment;->o(Lcom/zykj/study/ui/home/find/MicroCropFragment;Landroidx/activity/OnBackPressedCallback;)Lh7/p;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic h(Lcom/zykj/study/ui/home/find/MicroCropFragment;)Lh7/p;
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/zykj/study/ui/home/find/MicroCropFragment;->q(Lcom/zykj/study/ui/home/find/MicroCropFragment;)Lh7/p;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic i(Lcom/zykj/study/ui/home/find/MicroCropFragment;)Lh7/p;
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/zykj/study/ui/home/find/MicroCropFragment;->r(Lcom/zykj/study/ui/home/find/MicroCropFragment;)Lh7/p;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic j(Lcom/zykj/view/board/crop/BlackboardCropFragment;Lcom/zykj/study/ui/home/find/MicroCropFragment;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/zykj/study/ui/home/find/MicroCropFragment;->t(Lcom/zykj/view/board/crop/BlackboardCropFragment;Lcom/zykj/study/ui/home/find/MicroCropFragment;)V

    return-void
.end method

.method public static final o(Lcom/zykj/study/ui/home/find/MicroCropFragment;Landroidx/activity/OnBackPressedCallback;)Lh7/p;
    .locals 1

    .line 1
    const-string v0, "$this$addCallback"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Lcom/zykj/study/ui/home/find/MicroCropFragment;->k()V

    .line 7
    .line 8
    .line 9
    sget-object p0, Lh7/p;->a:Lh7/p;

    .line 10
    .line 11
    return-object p0
.end method

.method private final p()V
    .locals 8

    .line 1
    invoke-virtual {p0}, Lcom/zykj/study/ui/home/find/MicroCropFragment;->m()Lcom/zykj/view/board/crop/BlackboardCropFragment;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    new-instance v1, Lq5/a;

    .line 6
    .line 7
    new-instance v2, Ly4/a0;

    .line 8
    .line 9
    invoke-direct {v2, p0}, Ly4/a0;-><init>(Lcom/zykj/study/ui/home/find/MicroCropFragment;)V

    .line 10
    .line 11
    .line 12
    new-instance v3, Ly4/b0;

    .line 13
    .line 14
    invoke-direct {v3, p0}, Ly4/b0;-><init>(Lcom/zykj/study/ui/home/find/MicroCropFragment;)V

    .line 15
    .line 16
    .line 17
    new-instance v5, Ly4/c0;

    .line 18
    .line 19
    invoke-direct {v5, p0, v0}, Ly4/c0;-><init>(Lcom/zykj/study/ui/home/find/MicroCropFragment;Lcom/zykj/view/board/crop/BlackboardCropFragment;)V

    .line 20
    .line 21
    .line 22
    const/4 v6, 0x4

    .line 23
    const/4 v7, 0x0

    .line 24
    const/4 v4, 0x0

    .line 25
    invoke-direct/range {v1 .. v7}, Lq5/a;-><init>(Lx7/a;Lx7/a;Lx7/a;Lx7/l;ILkotlin/jvm/internal/n;)V

    .line 26
    .line 27
    .line 28
    invoke-virtual {v0, v1}, Lcom/zykj/view/board/crop/BlackboardCropFragment;->c0(Lq5/a;)V

    .line 29
    .line 30
    .line 31
    invoke-virtual {p0}, Lcom/zykj/base/BaseFragment;->getMBindView()Landroidx/databinding/ViewDataBinding;

    .line 32
    .line 33
    .line 34
    move-result-object v1

    .line 35
    check-cast v1, Lcom/zykj/study/databinding/FragmentMicroCropBinding;

    .line 36
    .line 37
    iget-object v1, v1, Lcom/zykj/study/databinding/FragmentMicroCropBinding;->fragmentContainerSketchCrop:Landroidx/fragment/app/FragmentContainerView;

    .line 38
    .line 39
    new-instance v2, Ly4/d0;

    .line 40
    .line 41
    invoke-direct {v2, v0, p0}, Ly4/d0;-><init>(Lcom/zykj/view/board/crop/BlackboardCropFragment;Lcom/zykj/study/ui/home/find/MicroCropFragment;)V

    .line 42
    .line 43
    .line 44
    invoke-virtual {v1, v2}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 45
    .line 46
    .line 47
    return-void
.end method

.method public static final q(Lcom/zykj/study/ui/home/find/MicroCropFragment;)Lh7/p;
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/zykj/study/ui/home/find/MicroCropFragment;->k()V

    .line 2
    .line 3
    .line 4
    sget-object p0, Lh7/p;->a:Lh7/p;

    .line 5
    .line 6
    return-object p0
.end method

.method public static final r(Lcom/zykj/study/ui/home/find/MicroCropFragment;)Lh7/p;
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/zykj/study/ui/home/find/MicroCropFragment;->k()V

    .line 2
    .line 3
    .line 4
    sget-object p0, Lh7/p;->a:Lh7/p;

    .line 5
    .line 6
    return-object p0
.end method

.method public static final s(Lcom/zykj/study/ui/home/find/MicroCropFragment;Lcom/zykj/view/board/crop/BlackboardCropFragment;Z)Lh7/p;
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    new-array v0, v0, [Ljava/lang/Object;

    .line 3
    .line 4
    const-string v1, "\u5220\u9664\u6210\u529f"

    .line 5
    .line 6
    invoke-static {v1, v0}, Lcom/blankj/utilcode/util/ToastUtils;->s(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 7
    .line 8
    .line 9
    if-eqz p2, :cond_0

    .line 10
    .line 11
    invoke-virtual {p0}, Lcom/zykj/study/ui/home/find/MicroCropFragment;->k()V

    .line 12
    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_0
    invoke-virtual {p0}, Lcom/zykj/study/ui/home/find/MicroCropFragment;->l()Lcom/zykj/study/ui/home/find/MicroCropFragmentArgs;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    invoke-virtual {p0}, Lcom/zykj/study/ui/home/find/MicroCropFragmentArgs;->a()Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    invoke-virtual {p1, p0}, Lcom/zykj/view/board/crop/BlackboardCropFragment;->R(Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    :goto_0
    sget-object p0, Lh7/p;->a:Lh7/p;

    .line 27
    .line 28
    return-object p0
.end method

.method public static final t(Lcom/zykj/view/board/crop/BlackboardCropFragment;Lcom/zykj/study/ui/home/find/MicroCropFragment;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Lcom/zykj/study/ui/home/find/MicroCropFragment;->l()Lcom/zykj/study/ui/home/find/MicroCropFragmentArgs;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-virtual {p1}, Lcom/zykj/study/ui/home/find/MicroCropFragmentArgs;->a()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    invoke-virtual {p0, p1}, Lcom/zykj/view/board/crop/BlackboardCropFragment;->R(Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public initData(Lm7/c;)Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-super {p0, p1}, Lcom/zykj/base/BaseFragment;->initData(Lm7/c;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-static {}, Ln7/a;->f()Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    if-ne p1, v0, :cond_0

    .line 10
    .line 11
    return-object p1

    .line 12
    :cond_0
    sget-object p1, Lh7/p;->a:Lh7/p;

    .line 13
    .line 14
    return-object p1
.end method

.method public initView(Landroid/os/Bundle;Lm7/c;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/zykj/study/ui/home/find/MicroCropFragment;->n()V

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Lcom/zykj/study/ui/home/find/MicroCropFragment;->p()V

    .line 5
    .line 6
    .line 7
    sget-object p1, Lh7/p;->a:Lh7/p;

    .line 8
    .line 9
    return-object p1
.end method

.method public final k()V
    .locals 3

    .line 1
    invoke-virtual {p0}, Lcom/zykj/study/ui/home/find/MicroCropFragment;->l()Lcom/zykj/study/ui/home/find/MicroCropFragmentArgs;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Lcom/zykj/study/ui/home/find/MicroCropFragmentArgs;->b()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    const-string v1, "RESULT_KEY_ACTION"

    .line 10
    .line 11
    const-string v2, "RESULT_VALUE_ACTION_CROP"

    .line 12
    .line 13
    invoke-static {v1, v2}, Lh7/f;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    filled-new-array {v1}, [Lkotlin/Pair;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    invoke-static {v1}, Landroidx/core/os/BundleKt;->bundleOf([Lkotlin/Pair;)Landroid/os/Bundle;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    invoke-static {p0, v0, v1}, Landroidx/fragment/app/FragmentKt;->setFragmentResult(Landroidx/fragment/app/Fragment;Ljava/lang/String;Landroid/os/Bundle;)V

    .line 26
    .line 27
    .line 28
    invoke-static {p0}, Landroidx/navigation/fragment/FragmentKt;->findNavController(Landroidx/fragment/app/Fragment;)Landroidx/navigation/NavController;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    invoke-virtual {v0}, Landroidx/navigation/NavController;->navigateUp()Z

    .line 33
    .line 34
    .line 35
    return-void
.end method

.method public final l()Lcom/zykj/study/ui/home/find/MicroCropFragmentArgs;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/study/ui/home/find/MicroCropFragment;->a:Landroidx/navigation/NavArgsLazy;

    .line 2
    .line 3
    invoke-interface {v0}, Lh7/d;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lcom/zykj/study/ui/home/find/MicroCropFragmentArgs;

    .line 8
    .line 9
    return-object v0
.end method

.method public layoutId()I
    .locals 1

    .line 1
    sget v0, Lcom/zykj/study/R$layout;->fragment_micro_crop:I

    .line 2
    .line 3
    return v0
.end method

.method public final m()Lcom/zykj/view/board/crop/BlackboardCropFragment;
    .locals 2

    .line 1
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getChildFragmentManager()Landroidx/fragment/app/FragmentManager;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    sget v1, Lcom/zykj/study/R$id;->fragment_container_sketch_crop:I

    .line 6
    .line 7
    invoke-virtual {v0, v1}, Landroidx/fragment/app/FragmentManager;->findFragmentById(I)Landroidx/fragment/app/Fragment;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    const-string v1, "null cannot be cast to non-null type com.zykj.view.board.crop.BlackboardCropFragment"

    .line 12
    .line 13
    invoke-static {v0, v1}, Lkotlin/jvm/internal/u;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    check-cast v0, Lcom/zykj/view/board/crop/BlackboardCropFragment;

    .line 17
    .line 18
    return-object v0
.end method

.method public final n()V
    .locals 7

    .line 1
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->requireActivity()Landroidx/fragment/app/FragmentActivity;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Landroidx/activity/ComponentActivity;->getOnBackPressedDispatcher()Landroidx/activity/OnBackPressedDispatcher;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getViewLifecycleOwner()Landroidx/lifecycle/LifecycleOwner;

    .line 10
    .line 11
    .line 12
    move-result-object v2

    .line 13
    new-instance v4, Ly4/e0;

    .line 14
    .line 15
    invoke-direct {v4, p0}, Ly4/e0;-><init>(Lcom/zykj/study/ui/home/find/MicroCropFragment;)V

    .line 16
    .line 17
    .line 18
    const/4 v5, 0x2

    .line 19
    const/4 v6, 0x0

    .line 20
    const/4 v3, 0x0

    .line 21
    invoke-static/range {v1 .. v6}, Landroidx/activity/OnBackPressedDispatcherKt;->addCallback$default(Landroidx/activity/OnBackPressedDispatcher;Landroidx/lifecycle/LifecycleOwner;ZLx7/l;ILjava/lang/Object;)Landroidx/activity/OnBackPressedCallback;

    .line 22
    .line 23
    .line 24
    return-void
.end method
