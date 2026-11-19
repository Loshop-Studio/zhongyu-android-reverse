.class public final Lcom/zykj/student/dialogue/ui/detail/PlayLessonFragment;
.super Lcom/zykj/student/dialogue/ui/detail/Hilt_PlayLessonFragment;
.source "SourceFile"


# annotations
.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x0
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0008\u0007\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J+\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0008\u0010\t\u001a\u0004\u0018\u00010\u0008H\u0016\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ!\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\n2\u0008\u0010\t\u001a\u0004\u0018\u00010\u0008H\u0016\u00a2\u0006\u0004\u0008\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016\u00a2\u0006\u0004\u0008\u0013\u0010\u0014R\u0016\u0010\u0018\u001a\u00020\u00158\u0002@\u0002X\u0082.\u00a2\u0006\u0006\n\u0004\u0008\u0016\u0010\u0017R\u0016\u0010\u001c\u001a\u00020\u00198\u0002@\u0002X\u0082.\u00a2\u0006\u0006\n\u0004\u0008\u001a\u0010\u001bR\u001b\u0010\"\u001a\u00020\u001d8BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u001e\u0010\u001f\u001a\u0004\u0008 \u0010!\u00a8\u0006#"
    }
    d2 = {
        "Lcom/zykj/student/dialogue/ui/detail/PlayLessonFragment;",
        "Landroidx/fragment/app/Fragment;",
        "<init>",
        "()V",
        "Landroid/view/LayoutInflater;",
        "inflater",
        "Landroid/view/ViewGroup;",
        "container",
        "Landroid/os/Bundle;",
        "savedInstanceState",
        "Landroid/view/View;",
        "onCreateView",
        "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;",
        "view",
        "",
        "onViewCreated",
        "(Landroid/view/View;Landroid/os/Bundle;)V",
        "Landroid/content/Context;",
        "context",
        "onAttach",
        "(Landroid/content/Context;)V",
        "Lcom/zykj/student/dialogue/databinding/DialogueFragmentPlayLessonBinding;",
        "f",
        "Lcom/zykj/student/dialogue/databinding/DialogueFragmentPlayLessonBinding;",
        "binding",
        "Lcom/zykj/view/board/play/SketchPlayFragment;",
        "g",
        "Lcom/zykj/view/board/play/SketchPlayFragment;",
        "sketchPlayFragment",
        "Lcom/zykj/student/dialogue/ui/detail/PlayLessonFragmentArgs;",
        "h",
        "Landroidx/navigation/NavArgsLazy;",
        "i",
        "()Lcom/zykj/student/dialogue/ui/detail/PlayLessonFragmentArgs;",
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
        "SMAP\nPlayLessonFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PlayLessonFragment.kt\ncom/zykj/student/dialogue/ui/detail/PlayLessonFragment\n+ 2 FragmentNavArgsLazy.kt\nandroidx/navigation/fragment/FragmentNavArgsLazyKt\n*L\n1#1,89:1\n42#2,3:90\n*S KotlinDebug\n*F\n+ 1 PlayLessonFragment.kt\ncom/zykj/student/dialogue/ui/detail/PlayLessonFragment\n*L\n24#1:90,3\n*E\n"
    }
.end annotation


# instance fields
.field public f:Lcom/zykj/student/dialogue/databinding/DialogueFragmentPlayLessonBinding;

.field public g:Lcom/zykj/view/board/play/SketchPlayFragment;

.field public final h:Landroidx/navigation/NavArgsLazy;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 3

    .line 1
    invoke-direct {p0}, Lcom/zykj/student/dialogue/ui/detail/Hilt_PlayLessonFragment;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Landroidx/navigation/NavArgsLazy;

    .line 5
    .line 6
    const-class v1, Lcom/zykj/student/dialogue/ui/detail/PlayLessonFragmentArgs;

    .line 7
    .line 8
    invoke-static {v1}, Lkotlin/jvm/internal/Reflection;->getOrCreateKotlinClass(Ljava/lang/Class;)Lkotlin/reflect/KClass;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    new-instance v2, Lcom/zykj/student/dialogue/ui/detail/PlayLessonFragment$a;

    .line 13
    .line 14
    invoke-direct {v2, p0}, Lcom/zykj/student/dialogue/ui/detail/PlayLessonFragment$a;-><init>(Landroidx/fragment/app/Fragment;)V

    .line 15
    .line 16
    .line 17
    invoke-direct {v0, v1, v2}, Landroidx/navigation/NavArgsLazy;-><init>(Lkotlin/reflect/KClass;Lkotlin/jvm/functions/Function0;)V

    .line 18
    .line 19
    .line 20
    iput-object v0, p0, Lcom/zykj/student/dialogue/ui/detail/PlayLessonFragment;->h:Landroidx/navigation/NavArgsLazy;

    .line 21
    .line 22
    return-void
.end method

.method public static synthetic g(Lcom/zykj/student/dialogue/ui/detail/PlayLessonFragment;)Lkotlin/Unit;
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/zykj/student/dialogue/ui/detail/PlayLessonFragment;->j(Lcom/zykj/student/dialogue/ui/detail/PlayLessonFragment;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic h(Lcom/zykj/student/dialogue/ui/detail/PlayLessonFragment;)Lcom/zykj/view/board/play/SketchPlayFragment;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/zykj/student/dialogue/ui/detail/PlayLessonFragment;->g:Lcom/zykj/view/board/play/SketchPlayFragment;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final j(Lcom/zykj/student/dialogue/ui/detail/PlayLessonFragment;)Lkotlin/Unit;
    .locals 0

    .line 1
    invoke-static {p0}, Landroidx/navigation/fragment/FragmentKt;->findNavController(Landroidx/fragment/app/Fragment;)Landroidx/navigation/NavController;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0}, Landroidx/navigation/NavController;->navigateUp()Z

    .line 6
    .line 7
    .line 8
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 9
    .line 10
    return-object p0
.end method


# virtual methods
.method public final i()Lcom/zykj/student/dialogue/ui/detail/PlayLessonFragmentArgs;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/student/dialogue/ui/detail/PlayLessonFragment;->h:Landroidx/navigation/NavArgsLazy;

    .line 2
    .line 3
    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lcom/zykj/student/dialogue/ui/detail/PlayLessonFragmentArgs;

    .line 8
    .line 9
    return-object v0
.end method

.method public onAttach(Landroid/content/Context;)V
    .locals 1

    .line 1
    const-string v0, "context"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-super {p0, p1}, Lcom/zykj/student/dialogue/ui/detail/Hilt_PlayLessonFragment;->onAttach(Landroid/content/Context;)V

    .line 7
    .line 8
    .line 9
    new-instance p1, Lcom/zykj/student/dialogue/ui/detail/PlayLessonFragment$onAttach$callback$1;

    .line 10
    .line 11
    invoke-direct {p1, p0}, Lcom/zykj/student/dialogue/ui/detail/PlayLessonFragment$onAttach$callback$1;-><init>(Lcom/zykj/student/dialogue/ui/detail/PlayLessonFragment;)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->requireActivity()Landroidx/fragment/app/FragmentActivity;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    invoke-virtual {v0}, Landroidx/activity/ComponentActivity;->getOnBackPressedDispatcher()Landroidx/activity/OnBackPressedDispatcher;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    invoke-virtual {v0, p0, p1}, Landroidx/activity/OnBackPressedDispatcher;->addCallback(Landroidx/lifecycle/LifecycleOwner;Landroidx/activity/OnBackPressedCallback;)V

    .line 23
    .line 24
    .line 25
    return-void
.end method

.method public onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 0

    .line 1
    const-string p3, "inflater"

    .line 2
    .line 3
    invoke-static {p1, p3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const/4 p3, 0x0

    .line 7
    invoke-static {p1, p2, p3}, Lcom/zykj/student/dialogue/databinding/DialogueFragmentPlayLessonBinding;->a(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/zykj/student/dialogue/databinding/DialogueFragmentPlayLessonBinding;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    const-string p2, "inflate(...)"

    .line 12
    .line 13
    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    iput-object p1, p0, Lcom/zykj/student/dialogue/ui/detail/PlayLessonFragment;->f:Lcom/zykj/student/dialogue/databinding/DialogueFragmentPlayLessonBinding;

    .line 17
    .line 18
    if-nez p1, :cond_0

    .line 19
    .line 20
    const-string p1, "binding"

    .line 21
    .line 22
    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    const/4 p1, 0x0

    .line 26
    :cond_0
    invoke-virtual {p1}, Landroidx/databinding/ViewDataBinding;->getRoot()Landroid/view/View;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    const-string p2, "getRoot(...)"

    .line 31
    .line 32
    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    return-object p1
.end method

.method public onViewCreated(Landroid/view/View;Landroid/os/Bundle;)V
    .locals 13

    .line 1
    const-string v0, "view"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-super {p0, p1, p2}, Landroidx/fragment/app/Fragment;->onViewCreated(Landroid/view/View;Landroid/os/Bundle;)V

    .line 7
    .line 8
    .line 9
    new-instance p1, Lcom/zykj/view/board/play/SketchPlayFragment;

    .line 10
    .line 11
    invoke-direct {p1}, Lcom/zykj/view/board/play/SketchPlayFragment;-><init>()V

    .line 12
    .line 13
    .line 14
    iput-object p1, p0, Lcom/zykj/student/dialogue/ui/detail/PlayLessonFragment;->g:Lcom/zykj/view/board/play/SketchPlayFragment;

    .line 15
    .line 16
    new-instance v0, Le7/a;

    .line 17
    .line 18
    new-instance v2, Lo6/q0;

    .line 19
    .line 20
    invoke-direct {v2, p0}, Lo6/q0;-><init>(Lcom/zykj/student/dialogue/ui/detail/PlayLessonFragment;)V

    .line 21
    .line 22
    .line 23
    const/16 v11, 0x2fd

    .line 24
    .line 25
    const/4 v12, 0x0

    .line 26
    const/4 v1, 0x0

    .line 27
    const/4 v3, 0x0

    .line 28
    const/4 v4, 0x0

    .line 29
    const/4 v5, 0x0

    .line 30
    const/4 v6, 0x0

    .line 31
    const/4 v7, 0x0

    .line 32
    const/4 v8, 0x0

    .line 33
    const/4 v9, 0x1

    .line 34
    const/4 v10, 0x0

    .line 35
    invoke-direct/range {v0 .. v12}, Le7/a;-><init>(ZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;ZLkotlin/jvm/functions/Function0;Ljava/util/List;Lkotlin/jvm/functions/Function0;Le7/b;ZZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 36
    .line 37
    .line 38
    invoke-virtual {p1, v0}, Lcom/zykj/view/board/play/SketchPlayFragment;->r0(Le7/a;)V

    .line 39
    .line 40
    .line 41
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getChildFragmentManager()Landroidx/fragment/app/FragmentManager;

    .line 42
    .line 43
    .line 44
    move-result-object p1

    .line 45
    invoke-virtual {p1}, Landroidx/fragment/app/FragmentManager;->beginTransaction()Landroidx/fragment/app/FragmentTransaction;

    .line 46
    .line 47
    .line 48
    move-result-object p1

    .line 49
    sget p2, Lcom/zykj/student/dialogue/R$id;->fl_container:I

    .line 50
    .line 51
    iget-object v0, p0, Lcom/zykj/student/dialogue/ui/detail/PlayLessonFragment;->g:Lcom/zykj/view/board/play/SketchPlayFragment;

    .line 52
    .line 53
    const-string v1, "sketchPlayFragment"

    .line 54
    .line 55
    const/4 v2, 0x0

    .line 56
    if-nez v0, :cond_0

    .line 57
    .line 58
    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 59
    .line 60
    .line 61
    move-object v0, v2

    .line 62
    :cond_0
    invoke-virtual {p1, p2, v0}, Landroidx/fragment/app/FragmentTransaction;->replace(ILandroidx/fragment/app/Fragment;)Landroidx/fragment/app/FragmentTransaction;

    .line 63
    .line 64
    .line 65
    move-result-object p1

    .line 66
    invoke-virtual {p1}, Landroidx/fragment/app/FragmentTransaction;->commitNowAllowingStateLoss()V

    .line 67
    .line 68
    .line 69
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getViewLifecycleOwner()Landroidx/lifecycle/LifecycleOwner;

    .line 70
    .line 71
    .line 72
    move-result-object p1

    .line 73
    const-string p2, "getViewLifecycleOwner(...)"

    .line 74
    .line 75
    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 76
    .line 77
    .line 78
    invoke-static {p1}, Landroidx/lifecycle/LifecycleOwnerKt;->getLifecycleScope(Landroidx/lifecycle/LifecycleOwner;)Landroidx/lifecycle/LifecycleCoroutineScope;

    .line 79
    .line 80
    .line 81
    move-result-object p1

    .line 82
    new-instance p2, Lcom/zykj/student/dialogue/ui/detail/PlayLessonFragment$onViewCreated$2;

    .line 83
    .line 84
    invoke-direct {p2, p0, v2}, Lcom/zykj/student/dialogue/ui/detail/PlayLessonFragment$onViewCreated$2;-><init>(Lcom/zykj/student/dialogue/ui/detail/PlayLessonFragment;Lkotlin/coroutines/Continuation;)V

    .line 85
    .line 86
    .line 87
    invoke-virtual {p1, p2}, Landroidx/lifecycle/LifecycleCoroutineScope;->launchWhenStarted(Lkotlin/jvm/functions/Function2;)Lkotlinx/coroutines/Job;

    .line 88
    .line 89
    .line 90
    iget-object p1, p0, Lcom/zykj/student/dialogue/ui/detail/PlayLessonFragment;->g:Lcom/zykj/view/board/play/SketchPlayFragment;

    .line 91
    .line 92
    if-nez p1, :cond_1

    .line 93
    .line 94
    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 95
    .line 96
    .line 97
    move-object v3, v2

    .line 98
    goto :goto_0

    .line 99
    :cond_1
    move-object v3, p1

    .line 100
    :goto_0
    invoke-virtual {p0}, Lcom/zykj/student/dialogue/ui/detail/PlayLessonFragment;->i()Lcom/zykj/student/dialogue/ui/detail/PlayLessonFragmentArgs;

    .line 101
    .line 102
    .line 103
    move-result-object p1

    .line 104
    invoke-virtual {p1}, Lcom/zykj/student/dialogue/ui/detail/PlayLessonFragmentArgs;->a()Ljava/lang/String;

    .line 105
    .line 106
    .line 107
    move-result-object v4

    .line 108
    const/16 v9, 0x1e

    .line 109
    .line 110
    const/4 v10, 0x0

    .line 111
    const/4 v5, 0x0

    .line 112
    const/4 v6, 0x0

    .line 113
    const/4 v7, 0x0

    .line 114
    const/4 v8, 0x0

    .line 115
    invoke-static/range {v3 .. v10}, Lcom/zykj/view/board/play/SketchPlayFragment;->h0(Lcom/zykj/view/board/play/SketchPlayFragment;Ljava/lang/String;IZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)V

    .line 116
    .line 117
    .line 118
    return-void
.end method
