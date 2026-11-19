.class public final Lcom/zykj/student/dialogue/ui/detail/DialogueSketchCropFragment;
.super Lcom/zykj/base/BaseFragment;
.source "SourceFile"


# annotations
.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x0
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/zykj/base/BaseFragment<",
        "Lcom/zykj/student/dialogue/databinding/DialogueFragmentSketchCropBinding;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0008\u0007\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0014\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\u0008H\u0096@\u00a2\u0006\u0004\u0008\t\u0010\nJ\u001a\u0010\r\u001a\u00020\u00082\u0008\u0010\u000c\u001a\u0004\u0018\u00010\u000bH\u0094@\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0008H\u0002\u00a2\u0006\u0004\u0008\u000f\u0010\u0004J\u000f\u0010\u0010\u001a\u00020\u0008H\u0002\u00a2\u0006\u0004\u0008\u0010\u0010\u0004J\u000f\u0010\u0011\u001a\u00020\u0008H\u0002\u00a2\u0006\u0004\u0008\u0011\u0010\u0004J\u000f\u0010\u0013\u001a\u00020\u0012H\u0002\u00a2\u0006\u0004\u0008\u0013\u0010\u0014R\u001b\u0010\u001a\u001a\u00020\u00158BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u0016\u0010\u0017\u001a\u0004\u0008\u0018\u0010\u0019\u00a8\u0006\u001b"
    }
    d2 = {
        "Lcom/zykj/student/dialogue/ui/detail/DialogueSketchCropFragment;",
        "Lcom/zykj/base/BaseFragment;",
        "Lcom/zykj/student/dialogue/databinding/DialogueFragmentSketchCropBinding;",
        "<init>",
        "()V",
        "",
        "layoutId",
        "()I",
        "",
        "initData",
        "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "Landroid/os/Bundle;",
        "savedInstanceState",
        "initView",
        "(Landroid/os/Bundle;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "j",
        "g",
        "l",
        "Lcom/zykj/view/board/crop/BlackboardCropFragment;",
        "i",
        "()Lcom/zykj/view/board/crop/BlackboardCropFragment;",
        "Lcom/zykj/student/dialogue/ui/detail/DialogueSketchCropFragmentArgs;",
        "a",
        "Landroidx/navigation/NavArgsLazy;",
        "h",
        "()Lcom/zykj/student/dialogue/ui/detail/DialogueSketchCropFragmentArgs;",
        "args",
        "app_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nDialogueSketchCropFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DialogueSketchCropFragment.kt\ncom/zykj/student/dialogue/ui/detail/DialogueSketchCropFragment\n+ 2 FragmentNavArgsLazy.kt\nandroidx/navigation/fragment/FragmentNavArgsLazyKt\n*L\n1#1,78:1\n42#2,3:79\n*S KotlinDebug\n*F\n+ 1 DialogueSketchCropFragment.kt\ncom/zykj/student/dialogue/ui/detail/DialogueSketchCropFragment\n*L\n17#1:79,3\n*E\n"
    }
.end annotation


# instance fields
.field public final a:Landroidx/navigation/NavArgsLazy;


# direct methods
.method static constructor <clinit>()V
    .locals 0

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
    const-class v1, Lcom/zykj/student/dialogue/ui/detail/DialogueSketchCropFragmentArgs;

    .line 7
    .line 8
    invoke-static {v1}, Lkotlin/jvm/internal/Reflection;->getOrCreateKotlinClass(Ljava/lang/Class;)Lkotlin/reflect/KClass;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    new-instance v2, Lcom/zykj/student/dialogue/ui/detail/DialogueSketchCropFragment$a;

    .line 13
    .line 14
    invoke-direct {v2, p0}, Lcom/zykj/student/dialogue/ui/detail/DialogueSketchCropFragment$a;-><init>(Landroidx/fragment/app/Fragment;)V

    .line 15
    .line 16
    .line 17
    invoke-direct {v0, v1, v2}, Landroidx/navigation/NavArgsLazy;-><init>(Lkotlin/reflect/KClass;Lkotlin/jvm/functions/Function0;)V

    .line 18
    .line 19
    .line 20
    iput-object v0, p0, Lcom/zykj/student/dialogue/ui/detail/DialogueSketchCropFragment;->a:Landroidx/navigation/NavArgsLazy;

    .line 21
    .line 22
    return-void
.end method

.method public static synthetic c(Lcom/zykj/student/dialogue/ui/detail/DialogueSketchCropFragment;)Lkotlin/Unit;
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/zykj/student/dialogue/ui/detail/DialogueSketchCropFragment;->m(Lcom/zykj/student/dialogue/ui/detail/DialogueSketchCropFragment;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Lcom/zykj/student/dialogue/ui/detail/DialogueSketchCropFragment;)Lkotlin/Unit;
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/zykj/student/dialogue/ui/detail/DialogueSketchCropFragment;->n(Lcom/zykj/student/dialogue/ui/detail/DialogueSketchCropFragment;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic e(Lcom/zykj/student/dialogue/ui/detail/DialogueSketchCropFragment;Lcom/zykj/view/board/crop/BlackboardCropFragment;Z)Lkotlin/Unit;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lcom/zykj/student/dialogue/ui/detail/DialogueSketchCropFragment;->o(Lcom/zykj/student/dialogue/ui/detail/DialogueSketchCropFragment;Lcom/zykj/view/board/crop/BlackboardCropFragment;Z)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic f(Lcom/zykj/student/dialogue/ui/detail/DialogueSketchCropFragment;Landroidx/activity/OnBackPressedCallback;)Lkotlin/Unit;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/zykj/student/dialogue/ui/detail/DialogueSketchCropFragment;->k(Lcom/zykj/student/dialogue/ui/detail/DialogueSketchCropFragment;Landroidx/activity/OnBackPressedCallback;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static final k(Lcom/zykj/student/dialogue/ui/detail/DialogueSketchCropFragment;Landroidx/activity/OnBackPressedCallback;)Lkotlin/Unit;
    .locals 1

    .line 1
    const-string v0, "$this$addCallback"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Lcom/zykj/student/dialogue/ui/detail/DialogueSketchCropFragment;->g()V

    .line 7
    .line 8
    .line 9
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 10
    .line 11
    return-object p0
.end method

.method public static final m(Lcom/zykj/student/dialogue/ui/detail/DialogueSketchCropFragment;)Lkotlin/Unit;
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/zykj/student/dialogue/ui/detail/DialogueSketchCropFragment;->g()V

    .line 2
    .line 3
    .line 4
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 5
    .line 6
    return-object p0
.end method

.method public static final n(Lcom/zykj/student/dialogue/ui/detail/DialogueSketchCropFragment;)Lkotlin/Unit;
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/zykj/student/dialogue/ui/detail/DialogueSketchCropFragment;->g()V

    .line 2
    .line 3
    .line 4
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 5
    .line 6
    return-object p0
.end method

.method public static final o(Lcom/zykj/student/dialogue/ui/detail/DialogueSketchCropFragment;Lcom/zykj/view/board/crop/BlackboardCropFragment;Z)Lkotlin/Unit;
    .locals 0

    .line 1
    if-eqz p2, :cond_0

    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/zykj/student/dialogue/ui/detail/DialogueSketchCropFragment;->g()V

    .line 4
    .line 5
    .line 6
    goto :goto_0

    .line 7
    :cond_0
    invoke-virtual {p0}, Lcom/zykj/student/dialogue/ui/detail/DialogueSketchCropFragment;->h()Lcom/zykj/student/dialogue/ui/detail/DialogueSketchCropFragmentArgs;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    invoke-virtual {p0}, Lcom/zykj/student/dialogue/ui/detail/DialogueSketchCropFragmentArgs;->a()Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    invoke-virtual {p1, p0}, Lcom/zykj/view/board/crop/BlackboardCropFragment;->O(Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    :goto_0
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 19
    .line 20
    return-object p0
.end method


# virtual methods
.method public final g()V
    .locals 3

    .line 1
    invoke-virtual {p0}, Lcom/zykj/student/dialogue/ui/detail/DialogueSketchCropFragment;->h()Lcom/zykj/student/dialogue/ui/detail/DialogueSketchCropFragmentArgs;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Lcom/zykj/student/dialogue/ui/detail/DialogueSketchCropFragmentArgs;->b()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    const-string v1, "RESULT_KEY_ACTION"

    .line 10
    .line 11
    const-string v2, "RESULT_VALUE_ACTION_EDIT"

    .line 12
    .line 13
    invoke-static {v1, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

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

.method public final h()Lcom/zykj/student/dialogue/ui/detail/DialogueSketchCropFragmentArgs;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/student/dialogue/ui/detail/DialogueSketchCropFragment;->a:Landroidx/navigation/NavArgsLazy;

    .line 2
    .line 3
    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lcom/zykj/student/dialogue/ui/detail/DialogueSketchCropFragmentArgs;

    .line 8
    .line 9
    return-object v0
.end method

.method public final i()Lcom/zykj/view/board/crop/BlackboardCropFragment;
    .locals 2

    .line 1
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getChildFragmentManager()Landroidx/fragment/app/FragmentManager;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    sget v1, Lcom/zykj/student/dialogue/R$id;->fragment_container_sketch_crop:I

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
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    check-cast v0, Lcom/zykj/view/board/crop/BlackboardCropFragment;

    .line 17
    .line 18
    return-object v0
.end method

.method public initData(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-super {p0, p1}, Lcom/zykj/base/BaseFragment;->initData(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

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
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 13
    .line 14
    return-object p1
.end method

.method public initView(Landroid/os/Bundle;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/zykj/student/dialogue/ui/detail/DialogueSketchCropFragment;->j()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Lcom/zykj/student/dialogue/ui/detail/DialogueSketchCropFragment;->l()V

    .line 5
    .line 6
    .line 7
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 8
    .line 9
    return-object p1
.end method

.method public final j()V
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
    new-instance v4, Lo6/y;

    .line 14
    .line 15
    invoke-direct {v4, p0}, Lo6/y;-><init>(Lcom/zykj/student/dialogue/ui/detail/DialogueSketchCropFragment;)V

    .line 16
    .line 17
    .line 18
    const/4 v5, 0x2

    .line 19
    const/4 v6, 0x0

    .line 20
    const/4 v3, 0x0

    .line 21
    invoke-static/range {v1 .. v6}, Landroidx/activity/OnBackPressedDispatcherKt;->addCallback$default(Landroidx/activity/OnBackPressedDispatcher;Landroidx/lifecycle/LifecycleOwner;ZLkotlin/jvm/functions/Function1;ILjava/lang/Object;)Landroidx/activity/OnBackPressedCallback;

    .line 22
    .line 23
    .line 24
    return-void
.end method

.method public final l()V
    .locals 8

    .line 1
    invoke-virtual {p0}, Lcom/zykj/student/dialogue/ui/detail/DialogueSketchCropFragment;->i()Lcom/zykj/view/board/crop/BlackboardCropFragment;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    new-instance v1, Lc7/a;

    .line 6
    .line 7
    new-instance v2, Lo6/z;

    .line 8
    .line 9
    invoke-direct {v2, p0}, Lo6/z;-><init>(Lcom/zykj/student/dialogue/ui/detail/DialogueSketchCropFragment;)V

    .line 10
    .line 11
    .line 12
    new-instance v3, Lo6/a0;

    .line 13
    .line 14
    invoke-direct {v3, p0}, Lo6/a0;-><init>(Lcom/zykj/student/dialogue/ui/detail/DialogueSketchCropFragment;)V

    .line 15
    .line 16
    .line 17
    new-instance v5, Lo6/b0;

    .line 18
    .line 19
    invoke-direct {v5, p0, v0}, Lo6/b0;-><init>(Lcom/zykj/student/dialogue/ui/detail/DialogueSketchCropFragment;Lcom/zykj/view/board/crop/BlackboardCropFragment;)V

    .line 20
    .line 21
    .line 22
    const/4 v6, 0x4

    .line 23
    const/4 v7, 0x0

    .line 24
    const/4 v4, 0x0

    .line 25
    invoke-direct/range {v1 .. v7}, Lc7/a;-><init>(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 26
    .line 27
    .line 28
    invoke-virtual {v0, v1}, Lcom/zykj/view/board/crop/BlackboardCropFragment;->Z(Lc7/a;)V

    .line 29
    .line 30
    .line 31
    invoke-virtual {p0}, Lcom/zykj/student/dialogue/ui/detail/DialogueSketchCropFragment;->h()Lcom/zykj/student/dialogue/ui/detail/DialogueSketchCropFragmentArgs;

    .line 32
    .line 33
    .line 34
    move-result-object v1

    .line 35
    invoke-virtual {v1}, Lcom/zykj/student/dialogue/ui/detail/DialogueSketchCropFragmentArgs;->a()Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object v1

    .line 39
    invoke-virtual {v0, v1}, Lcom/zykj/view/board/crop/BlackboardCropFragment;->O(Ljava/lang/String;)V

    .line 40
    .line 41
    .line 42
    return-void
.end method

.method public layoutId()I
    .locals 1

    .line 1
    sget v0, Lcom/zykj/student/dialogue/R$layout;->dialogue_fragment_sketch_crop:I

    .line 2
    .line 3
    return v0
.end method
