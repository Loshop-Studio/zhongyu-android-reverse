.class public final Lcom/zykj/student/dialogue/ui/detail/AnswerPagerFragment;
.super Lcom/zykj/student/dialogue/ui/detail/Hilt_AnswerPagerFragment;
.source "SourceFile"


# annotations
.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x0
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0090\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0010\u0006\n\u0002\u0008\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0008\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0007\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002\u00a2\u0006\u0004\u0008\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\u0008\u001a\u00020\u0007H\u0002\u00a2\u0006\u0004\u0008\t\u0010\nJ\u000f\u0010\u000c\u001a\u00020\u000bH\u0002\u00a2\u0006\u0004\u0008\u000c\u0010\u0003J\u000f\u0010\u000e\u001a\u00020\rH\u0002\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0002\u00a2\u0006\u0004\u0008\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u000bH\u0002\u00a2\u0006\u0004\u0008\u0013\u0010\u0003J%\u0010\u0018\u001a\u00020\u000b2\u000c\u0010\u0016\u001a\u0008\u0012\u0004\u0012\u00020\u00150\u00142\u0006\u0010\u0017\u001a\u00020\u0004H\u0002\u00a2\u0006\u0004\u0008\u0018\u0010\u0019J\u0017\u0010\u001b\u001a\u00020\u000b2\u0006\u0010\u001a\u001a\u00020\u0004H\u0002\u00a2\u0006\u0004\u0008\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\u000bH\u0002\u00a2\u0006\u0004\u0008\u001d\u0010\u0003J\u0017\u0010 \u001a\u00020\u000b2\u0006\u0010\u001f\u001a\u00020\u001eH\u0002\u00a2\u0006\u0004\u0008 \u0010!J+\u0010)\u001a\u00020(2\u0006\u0010#\u001a\u00020\"2\u0008\u0010%\u001a\u0004\u0018\u00010$2\u0008\u0010\'\u001a\u0004\u0018\u00010&H\u0016\u00a2\u0006\u0004\u0008)\u0010*J\u0017\u0010-\u001a\u00020\u000b2\u0006\u0010,\u001a\u00020+H\u0016\u00a2\u0006\u0004\u0008-\u0010.J!\u00100\u001a\u00020\u000b2\u0006\u0010/\u001a\u00020(2\u0008\u0010\'\u001a\u0004\u0018\u00010&H\u0016\u00a2\u0006\u0004\u00080\u00101R\u0016\u00105\u001a\u0002028\u0002@\u0002X\u0082.\u00a2\u0006\u0006\n\u0004\u00083\u00104R\u0018\u00109\u001a\u0004\u0018\u0001068\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u00087\u00108R\u001b\u0010?\u001a\u00020:8BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008;\u0010<\u001a\u0004\u0008=\u0010>R\u001b\u0010D\u001a\u00020@8BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008A\u0010<\u001a\u0004\u0008B\u0010CR\u001b\u0010H\u001a\u00020\u001e8BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008E\u0010<\u001a\u0004\u0008F\u0010GR\u0018\u0010L\u001a\u0004\u0018\u00010I8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008J\u0010K\u00a8\u0006M"
    }
    d2 = {
        "Lcom/zykj/student/dialogue/ui/detail/AnswerPagerFragment;",
        "Landroidx/fragment/app/Fragment;",
        "<init>",
        "()V",
        "",
        "S",
        "()Z",
        "Lp6/k;",
        "viewState",
        "C",
        "(Lp6/k;)Z",
        "",
        "L",
        "",
        "H",
        "()I",
        "",
        "I",
        "()D",
        "U",
        "",
        "Lcom/liulishuo/okdownload/a;",
        "downloadTasks",
        "showLoading",
        "E",
        "(Ljava/util/List;Z)V",
        "succeed",
        "T",
        "(Z)V",
        "V",
        "",
        "path",
        "M",
        "(Ljava/lang/String;)V",
        "Landroid/view/LayoutInflater;",
        "inflater",
        "Landroid/view/ViewGroup;",
        "container",
        "Landroid/os/Bundle;",
        "savedInstanceState",
        "Landroid/view/View;",
        "onCreateView",
        "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;",
        "Landroid/content/Context;",
        "context",
        "onAttach",
        "(Landroid/content/Context;)V",
        "view",
        "onViewCreated",
        "(Landroid/view/View;Landroid/os/Bundle;)V",
        "Lcom/zykj/student/dialogue/databinding/DialogueFragmentAnswerPagerBinding;",
        "f",
        "Lcom/zykj/student/dialogue/databinding/DialogueFragmentAnswerPagerBinding;",
        "binding",
        "Lcom/zykj/view/board/play/SketchPlayFragment;",
        "g",
        "Lcom/zykj/view/board/play/SketchPlayFragment;",
        "sketchPlayFragment",
        "Lcom/zykj/student/dialogue/ui/detail/viewmodel/AnswerViewModel;",
        "h",
        "Lkotlin/Lazy;",
        "K",
        "()Lcom/zykj/student/dialogue/ui/detail/viewmodel/AnswerViewModel;",
        "viewModel",
        "Lcom/zykj/student/dialogue/ui/detail/viewmodel/NewAnswerViewModel;",
        "i",
        "G",
        "()Lcom/zykj/student/dialogue/ui/detail/viewmodel/NewAnswerViewModel;",
        "newAnswerViewModel",
        "j",
        "J",
        "()Ljava/lang/String;",
        "tempPreviewImagePath",
        "Lkotlinx/coroutines/Job;",
        "k",
        "Lkotlinx/coroutines/Job;",
        "job",
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
        "SMAP\nAnswerPagerFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnswerPagerFragment.kt\ncom/zykj/student/dialogue/ui/detail/AnswerPagerFragment\n+ 2 HiltNavGraphViewModelLazy.kt\nandroidx/hilt/navigation/fragment/HiltNavGraphViewModelLazyKt\n+ 3 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n+ 4 View.kt\nandroidx/core/view/ViewKt\n+ 5 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,579:1\n49#2,8:580\n106#3,15:588\n278#4,2:603\n257#4,2:607\n257#4,2:609\n257#4,2:611\n257#4,2:613\n255#4:615\n278#4,2:616\n255#4:618\n278#4,2:619\n255#4:621\n278#4,2:622\n1869#5,2:605\n*S KotlinDebug\n*F\n+ 1 AnswerPagerFragment.kt\ncom/zykj/student/dialogue/ui/detail/AnswerPagerFragment\n*L\n60#1:580,8\n62#1:588,15\n101#1:603,2\n450#1:607,2\n201#1:609,2\n202#1:611,2\n203#1:613,2\n213#1:615\n212#1:616,2\n214#1:618\n214#1:619,2\n216#1:621\n216#1:622,2\n342#1:605,2\n*E\n"
    }
.end annotation


# instance fields
.field public f:Lcom/zykj/student/dialogue/databinding/DialogueFragmentAnswerPagerBinding;

.field public g:Lcom/zykj/view/board/play/SketchPlayFragment;

.field public final h:Lkotlin/Lazy;

.field public final i:Lkotlin/Lazy;

.field public final j:Lkotlin/Lazy;

.field public k:Lkotlinx/coroutines/Job;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 5

    .line 1
    invoke-direct {p0}, Lcom/zykj/student/dialogue/ui/detail/Hilt_AnswerPagerFragment;-><init>()V

    .line 2
    .line 3
    .line 4
    sget v0, Lcom/zykj/student/dialogue/R$id;->dialogue_detail_main:I

    .line 5
    .line 6
    new-instance v1, Lcom/zykj/student/dialogue/ui/detail/AnswerPagerFragment$special$$inlined$hiltNavGraphViewModels$1;

    .line 7
    .line 8
    invoke-direct {v1, p0, v0}, Lcom/zykj/student/dialogue/ui/detail/AnswerPagerFragment$special$$inlined$hiltNavGraphViewModels$1;-><init>(Landroidx/fragment/app/Fragment;I)V

    .line 9
    .line 10
    .line 11
    invoke-static {v1}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    new-instance v1, Lcom/zykj/student/dialogue/ui/detail/AnswerPagerFragment$special$$inlined$hiltNavGraphViewModels$2;

    .line 16
    .line 17
    invoke-direct {v1, v0}, Lcom/zykj/student/dialogue/ui/detail/AnswerPagerFragment$special$$inlined$hiltNavGraphViewModels$2;-><init>(Lkotlin/Lazy;)V

    .line 18
    .line 19
    .line 20
    const-class v2, Lcom/zykj/student/dialogue/ui/detail/viewmodel/AnswerViewModel;

    .line 21
    .line 22
    invoke-static {v2}, Lkotlin/jvm/internal/Reflection;->getOrCreateKotlinClass(Ljava/lang/Class;)Lkotlin/reflect/KClass;

    .line 23
    .line 24
    .line 25
    move-result-object v2

    .line 26
    new-instance v3, Lcom/zykj/student/dialogue/ui/detail/AnswerPagerFragment$special$$inlined$hiltNavGraphViewModels$3;

    .line 27
    .line 28
    invoke-direct {v3, v0}, Lcom/zykj/student/dialogue/ui/detail/AnswerPagerFragment$special$$inlined$hiltNavGraphViewModels$3;-><init>(Lkotlin/Lazy;)V

    .line 29
    .line 30
    .line 31
    new-instance v4, Lcom/zykj/student/dialogue/ui/detail/AnswerPagerFragment$special$$inlined$hiltNavGraphViewModels$4;

    .line 32
    .line 33
    invoke-direct {v4, p0, v0}, Lcom/zykj/student/dialogue/ui/detail/AnswerPagerFragment$special$$inlined$hiltNavGraphViewModels$4;-><init>(Landroidx/fragment/app/Fragment;Lkotlin/Lazy;)V

    .line 34
    .line 35
    .line 36
    invoke-static {p0, v2, v1, v3, v4}, Landroidx/fragment/app/FragmentViewModelLazyKt;->createViewModelLazy(Landroidx/fragment/app/Fragment;Lkotlin/reflect/KClass;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    iput-object v0, p0, Lcom/zykj/student/dialogue/ui/detail/AnswerPagerFragment;->h:Lkotlin/Lazy;

    .line 41
    .line 42
    new-instance v0, Lcom/zykj/student/dialogue/ui/detail/AnswerPagerFragment$special$$inlined$viewModels$default$1;

    .line 43
    .line 44
    invoke-direct {v0, p0}, Lcom/zykj/student/dialogue/ui/detail/AnswerPagerFragment$special$$inlined$viewModels$default$1;-><init>(Landroidx/fragment/app/Fragment;)V

    .line 45
    .line 46
    .line 47
    sget-object v1, Lkotlin/LazyThreadSafetyMode;->NONE:Lkotlin/LazyThreadSafetyMode;

    .line 48
    .line 49
    new-instance v2, Lcom/zykj/student/dialogue/ui/detail/AnswerPagerFragment$special$$inlined$viewModels$default$2;

    .line 50
    .line 51
    invoke-direct {v2, v0}, Lcom/zykj/student/dialogue/ui/detail/AnswerPagerFragment$special$$inlined$viewModels$default$2;-><init>(Lkotlin/jvm/functions/Function0;)V

    .line 52
    .line 53
    .line 54
    invoke-static {v1, v2}, Lkotlin/LazyKt;->lazy(Lkotlin/LazyThreadSafetyMode;Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    .line 55
    .line 56
    .line 57
    move-result-object v0

    .line 58
    const-class v1, Lcom/zykj/student/dialogue/ui/detail/viewmodel/NewAnswerViewModel;

    .line 59
    .line 60
    invoke-static {v1}, Lkotlin/jvm/internal/Reflection;->getOrCreateKotlinClass(Ljava/lang/Class;)Lkotlin/reflect/KClass;

    .line 61
    .line 62
    .line 63
    move-result-object v1

    .line 64
    new-instance v2, Lcom/zykj/student/dialogue/ui/detail/AnswerPagerFragment$special$$inlined$viewModels$default$3;

    .line 65
    .line 66
    invoke-direct {v2, v0}, Lcom/zykj/student/dialogue/ui/detail/AnswerPagerFragment$special$$inlined$viewModels$default$3;-><init>(Lkotlin/Lazy;)V

    .line 67
    .line 68
    .line 69
    new-instance v3, Lcom/zykj/student/dialogue/ui/detail/AnswerPagerFragment$special$$inlined$viewModels$default$4;

    .line 70
    .line 71
    const/4 v4, 0x0

    .line 72
    invoke-direct {v3, v4, v0}, Lcom/zykj/student/dialogue/ui/detail/AnswerPagerFragment$special$$inlined$viewModels$default$4;-><init>(Lkotlin/jvm/functions/Function0;Lkotlin/Lazy;)V

    .line 73
    .line 74
    .line 75
    new-instance v4, Lcom/zykj/student/dialogue/ui/detail/AnswerPagerFragment$special$$inlined$viewModels$default$5;

    .line 76
    .line 77
    invoke-direct {v4, p0, v0}, Lcom/zykj/student/dialogue/ui/detail/AnswerPagerFragment$special$$inlined$viewModels$default$5;-><init>(Landroidx/fragment/app/Fragment;Lkotlin/Lazy;)V

    .line 78
    .line 79
    .line 80
    invoke-static {p0, v1, v2, v3, v4}, Landroidx/fragment/app/FragmentViewModelLazyKt;->createViewModelLazy(Landroidx/fragment/app/Fragment;Lkotlin/reflect/KClass;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    .line 81
    .line 82
    .line 83
    move-result-object v0

    .line 84
    iput-object v0, p0, Lcom/zykj/student/dialogue/ui/detail/AnswerPagerFragment;->i:Lkotlin/Lazy;

    .line 85
    .line 86
    new-instance v0, Lo6/l;

    .line 87
    .line 88
    invoke-direct {v0}, Lo6/l;-><init>()V

    .line 89
    .line 90
    .line 91
    invoke-static {v0}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    .line 92
    .line 93
    .line 94
    move-result-object v0

    .line 95
    iput-object v0, p0, Lcom/zykj/student/dialogue/ui/detail/AnswerPagerFragment;->j:Lkotlin/Lazy;

    .line 96
    .line 97
    return-void
.end method

.method public static final synthetic A(Lcom/zykj/student/dialogue/ui/detail/AnswerPagerFragment;)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/zykj/student/dialogue/ui/detail/AnswerPagerFragment;->U()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static final synthetic B(Lcom/zykj/student/dialogue/ui/detail/AnswerPagerFragment;)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/zykj/student/dialogue/ui/detail/AnswerPagerFragment;->V()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static final D(Ljava/io/File;)Z
    .locals 6

    .line 1
    const-string v0, "file"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Ljava/io/File;->isFile()Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    const/4 v1, 0x0

    .line 11
    if-eqz v0, :cond_1

    .line 12
    .line 13
    invoke-virtual {p0}, Ljava/io/File;->getName()Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    const-string v2, "getName(...)"

    .line 18
    .line 19
    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    const-string v3, ".amr"

    .line 23
    .line 24
    const/4 v4, 0x2

    .line 25
    const/4 v5, 0x0

    .line 26
    invoke-static {v0, v3, v1, v4, v5}, Lkotlin/text/StringsKt;->endsWith$default(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z

    .line 27
    .line 28
    .line 29
    move-result v0

    .line 30
    if-nez v0, :cond_0

    .line 31
    .line 32
    invoke-virtual {p0}, Ljava/io/File;->getName()Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 37
    .line 38
    .line 39
    const-string v3, ".wav"

    .line 40
    .line 41
    invoke-static {v0, v3, v1, v4, v5}, Lkotlin/text/StringsKt;->endsWith$default(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z

    .line 42
    .line 43
    .line 44
    move-result v0

    .line 45
    if-nez v0, :cond_0

    .line 46
    .line 47
    invoke-virtual {p0}, Ljava/io/File;->getName()Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object p0

    .line 51
    invoke-static {p0, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 52
    .line 53
    .line 54
    const-string v0, ".mp3"

    .line 55
    .line 56
    invoke-static {p0, v0, v1, v4, v5}, Lkotlin/text/StringsKt;->endsWith$default(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z

    .line 57
    .line 58
    .line 59
    move-result p0

    .line 60
    if-eqz p0, :cond_1

    .line 61
    .line 62
    :cond_0
    const/4 p0, 0x1

    .line 63
    return p0

    .line 64
    :cond_1
    return v1
.end method

.method public static final F(Lcom/liulishuo/okdownload/a;Landroid/content/DialogInterface;)V
    .locals 0

    .line 1
    if-eqz p0, :cond_0

    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/liulishuo/okdownload/a;->i()V

    .line 4
    .line 5
    .line 6
    :cond_0
    return-void
.end method

.method private final H()I
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/student/dialogue/ui/detail/AnswerPagerFragment;->g:Lcom/zykj/view/board/play/SketchPlayFragment;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/zykj/view/board/play/SketchPlayFragment;->J()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    return v0

    .line 10
    :cond_0
    const/4 v0, 0x0

    .line 11
    return v0
.end method

.method private final I()D
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/zykj/student/dialogue/ui/detail/AnswerPagerFragment;->g:Lcom/zykj/view/board/play/SketchPlayFragment;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/zykj/view/board/play/SketchPlayFragment;->L()D

    .line 6
    .line 7
    .line 8
    move-result-wide v0

    .line 9
    return-wide v0

    .line 10
    :cond_0
    const-wide/high16 v0, 0x3ff0000000000000L    # 1.0

    .line 11
    .line 12
    return-wide v0
.end method

.method private final K()Lcom/zykj/student/dialogue/ui/detail/viewmodel/AnswerViewModel;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/student/dialogue/ui/detail/AnswerPagerFragment;->h:Lkotlin/Lazy;

    .line 2
    .line 3
    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lcom/zykj/student/dialogue/ui/detail/viewmodel/AnswerViewModel;

    .line 8
    .line 9
    return-object v0
.end method

.method public static final N(Lcom/zykj/student/dialogue/ui/detail/AnswerPagerFragment;Landroid/view/View;)Lkotlin/Unit;
    .locals 1

    .line 1
    const-string v0, "it"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Lcom/zykj/student/dialogue/ui/detail/AnswerPagerFragment;->L()V

    .line 7
    .line 8
    .line 9
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 10
    .line 11
    return-object p0
.end method

.method public static final O(Lcom/zykj/student/dialogue/ui/detail/AnswerPagerFragment;Landroid/view/View;)Lkotlin/Unit;
    .locals 10

    .line 1
    const-string v0, "it"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object p1, p0, Lcom/zykj/student/dialogue/ui/detail/AnswerPagerFragment;->g:Lcom/zykj/view/board/play/SketchPlayFragment;

    .line 7
    .line 8
    if-eqz p1, :cond_0

    .line 9
    .line 10
    invoke-virtual {p1}, Lcom/zykj/view/board/play/SketchPlayFragment;->F()V

    .line 11
    .line 12
    .line 13
    :cond_0
    invoke-direct {p0}, Lcom/zykj/student/dialogue/ui/detail/AnswerPagerFragment;->K()Lcom/zykj/student/dialogue/ui/detail/viewmodel/AnswerViewModel;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    sget-object v0, Lcom/zykj/student/dialogue/ui/detail/viewmodel/b$c;->a:Lcom/zykj/student/dialogue/ui/detail/viewmodel/b$c;

    .line 18
    .line 19
    invoke-virtual {p1, v0}, Lcom/zykj/student/dialogue/ui/detail/viewmodel/AnswerViewModel;->M(Lcom/zykj/student/dialogue/ui/detail/viewmodel/b;)V

    .line 20
    .line 21
    .line 22
    invoke-direct {p0}, Lcom/zykj/student/dialogue/ui/detail/AnswerPagerFragment;->K()Lcom/zykj/student/dialogue/ui/detail/viewmodel/AnswerViewModel;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    invoke-virtual {p1}, Lcom/zykj/student/dialogue/ui/detail/viewmodel/AnswerViewModel;->K()Lkotlinx/coroutines/flow/StateFlow;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    invoke-interface {p1}, Lkotlinx/coroutines/flow/StateFlow;->getValue()Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object p1

    .line 34
    check-cast p1, Lp6/k;

    .line 35
    .line 36
    invoke-virtual {p1}, Lp6/k;->t()Z

    .line 37
    .line 38
    .line 39
    move-result p1

    .line 40
    if-eqz p1, :cond_3

    .line 41
    .line 42
    invoke-virtual {p0}, Lcom/zykj/student/dialogue/ui/detail/AnswerPagerFragment;->J()Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object p1

    .line 46
    invoke-static {p1}, Lcom/blankj/utilcode/util/FileUtils;->isFileExists(Ljava/lang/String;)Z

    .line 47
    .line 48
    .line 49
    move-result p1

    .line 50
    if-eqz p1, :cond_1

    .line 51
    .line 52
    invoke-virtual {p0}, Lcom/zykj/student/dialogue/ui/detail/AnswerPagerFragment;->J()Ljava/lang/String;

    .line 53
    .line 54
    .line 55
    move-result-object p1

    .line 56
    invoke-static {p1}, Lcom/blankj/utilcode/util/FileUtils;->delete(Ljava/lang/String;)Z

    .line 57
    .line 58
    .line 59
    :cond_1
    iget-object p1, p0, Lcom/zykj/student/dialogue/ui/detail/AnswerPagerFragment;->g:Lcom/zykj/view/board/play/SketchPlayFragment;

    .line 60
    .line 61
    if-eqz p1, :cond_2

    .line 62
    .line 63
    invoke-virtual {p1}, Lcom/zykj/view/board/play/SketchPlayFragment;->K()Landroid/graphics/Bitmap;

    .line 64
    .line 65
    .line 66
    move-result-object p1

    .line 67
    if-eqz p1, :cond_2

    .line 68
    .line 69
    invoke-virtual {p0}, Lcom/zykj/student/dialogue/ui/detail/AnswerPagerFragment;->J()Ljava/lang/String;

    .line 70
    .line 71
    .line 72
    move-result-object v0

    .line 73
    sget-object v1, Landroid/graphics/Bitmap$CompressFormat;->PNG:Landroid/graphics/Bitmap$CompressFormat;

    .line 74
    .line 75
    invoke-static {p1, v0, v1}, Lcom/blankj/utilcode/util/ImageUtils;->save(Landroid/graphics/Bitmap;Ljava/lang/String;Landroid/graphics/Bitmap$CompressFormat;)Z

    .line 76
    .line 77
    .line 78
    :cond_2
    invoke-static {p0}, Landroidx/navigation/fragment/FragmentKt;->findNavController(Landroidx/fragment/app/Fragment;)Landroidx/navigation/NavController;

    .line 79
    .line 80
    .line 81
    move-result-object p1

    .line 82
    sget v0, Lcom/zykj/student/dialogue/R$id;->dialogue_nav_new_answer:I

    .line 83
    .line 84
    new-instance v1, Lcom/zykj/student/dialogue/ui/detail/NewAnswerFragmentArgs;

    .line 85
    .line 86
    invoke-virtual {p0}, Lcom/zykj/student/dialogue/ui/detail/AnswerPagerFragment;->J()Ljava/lang/String;

    .line 87
    .line 88
    .line 89
    move-result-object v2

    .line 90
    invoke-direct {p0}, Lcom/zykj/student/dialogue/ui/detail/AnswerPagerFragment;->K()Lcom/zykj/student/dialogue/ui/detail/viewmodel/AnswerViewModel;

    .line 91
    .line 92
    .line 93
    move-result-object p0

    .line 94
    invoke-virtual {p0}, Lcom/zykj/student/dialogue/ui/detail/viewmodel/AnswerViewModel;->I()Ljava/lang/String;

    .line 95
    .line 96
    .line 97
    move-result-object v4

    .line 98
    const/16 v8, 0x3a

    .line 99
    .line 100
    const/4 v9, 0x0

    .line 101
    const/4 v3, 0x0

    .line 102
    const/4 v5, 0x0

    .line 103
    const/4 v6, 0x0

    .line 104
    const/4 v7, 0x0

    .line 105
    invoke-direct/range {v1 .. v9}, Lcom/zykj/student/dialogue/ui/detail/NewAnswerFragmentArgs;-><init>(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 106
    .line 107
    .line 108
    invoke-virtual {v1}, Lcom/zykj/student/dialogue/ui/detail/NewAnswerFragmentArgs;->g()Landroid/os/Bundle;

    .line 109
    .line 110
    .line 111
    move-result-object p0

    .line 112
    invoke-virtual {p1, v0, p0}, Landroidx/navigation/NavController;->navigate(ILandroid/os/Bundle;)V

    .line 113
    .line 114
    .line 115
    goto :goto_0

    .line 116
    :cond_3
    invoke-static {p0}, Landroidx/navigation/fragment/FragmentKt;->findNavController(Landroidx/fragment/app/Fragment;)Landroidx/navigation/NavController;

    .line 117
    .line 118
    .line 119
    move-result-object p1

    .line 120
    sget v0, Lcom/zykj/student/dialogue/R$id;->dialogue_nav_new_answer:I

    .line 121
    .line 122
    new-instance v1, Lcom/zykj/student/dialogue/ui/detail/NewAnswerFragmentArgs;

    .line 123
    .line 124
    invoke-direct {p0}, Lcom/zykj/student/dialogue/ui/detail/AnswerPagerFragment;->K()Lcom/zykj/student/dialogue/ui/detail/viewmodel/AnswerViewModel;

    .line 125
    .line 126
    .line 127
    move-result-object v2

    .line 128
    invoke-virtual {v2}, Lcom/zykj/student/dialogue/ui/detail/viewmodel/AnswerViewModel;->K()Lkotlinx/coroutines/flow/StateFlow;

    .line 129
    .line 130
    .line 131
    move-result-object v2

    .line 132
    invoke-interface {v2}, Lkotlinx/coroutines/flow/StateFlow;->getValue()Ljava/lang/Object;

    .line 133
    .line 134
    .line 135
    move-result-object v2

    .line 136
    check-cast v2, Lp6/k;

    .line 137
    .line 138
    invoke-virtual {v2}, Lp6/k;->f()Ljava/lang/String;

    .line 139
    .line 140
    .line 141
    move-result-object v2

    .line 142
    invoke-direct {p0}, Lcom/zykj/student/dialogue/ui/detail/AnswerPagerFragment;->K()Lcom/zykj/student/dialogue/ui/detail/viewmodel/AnswerViewModel;

    .line 143
    .line 144
    .line 145
    move-result-object p0

    .line 146
    invoke-virtual {p0}, Lcom/zykj/student/dialogue/ui/detail/viewmodel/AnswerViewModel;->I()Ljava/lang/String;

    .line 147
    .line 148
    .line 149
    move-result-object v4

    .line 150
    const/16 v8, 0x3a

    .line 151
    .line 152
    const/4 v9, 0x0

    .line 153
    const/4 v3, 0x0

    .line 154
    const/4 v5, 0x0

    .line 155
    const/4 v6, 0x0

    .line 156
    const/4 v7, 0x0

    .line 157
    invoke-direct/range {v1 .. v9}, Lcom/zykj/student/dialogue/ui/detail/NewAnswerFragmentArgs;-><init>(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 158
    .line 159
    .line 160
    invoke-virtual {v1}, Lcom/zykj/student/dialogue/ui/detail/NewAnswerFragmentArgs;->g()Landroid/os/Bundle;

    .line 161
    .line 162
    .line 163
    move-result-object p0

    .line 164
    invoke-virtual {p1, v0, p0}, Landroidx/navigation/NavController;->navigate(ILandroid/os/Bundle;)V

    .line 165
    .line 166
    .line 167
    :goto_0
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 168
    .line 169
    return-object p0
.end method

.method public static final P(Lcom/zykj/student/dialogue/ui/detail/AnswerPagerFragment;Landroid/view/View;)Lkotlin/Unit;
    .locals 4

    .line 1
    const-string v0, "it"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object p1, p0, Lcom/zykj/student/dialogue/ui/detail/AnswerPagerFragment;->f:Lcom/zykj/student/dialogue/databinding/DialogueFragmentAnswerPagerBinding;

    .line 7
    .line 8
    const/4 v0, 0x0

    .line 9
    const-string v1, "binding"

    .line 10
    .line 11
    if-nez p1, :cond_0

    .line 12
    .line 13
    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    move-object p1, v0

    .line 17
    :cond_0
    iget-object p1, p1, Lcom/zykj/student/dialogue/databinding/DialogueFragmentAnswerPagerBinding;->g:Lcom/xuexiang/xui/widget/imageview/photoview/PhotoView;

    .line 18
    .line 19
    const-string v2, "photoView"

    .line 20
    .line 21
    invoke-static {p1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    const/16 v2, 0x8

    .line 25
    .line 26
    invoke-virtual {p1, v2}, Landroid/view/View;->setVisibility(I)V

    .line 27
    .line 28
    .line 29
    iget-object p1, p0, Lcom/zykj/student/dialogue/ui/detail/AnswerPagerFragment;->f:Lcom/zykj/student/dialogue/databinding/DialogueFragmentAnswerPagerBinding;

    .line 30
    .line 31
    if-nez p1, :cond_1

    .line 32
    .line 33
    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    move-object p1, v0

    .line 37
    :cond_1
    iget-object p1, p1, Lcom/zykj/student/dialogue/databinding/DialogueFragmentAnswerPagerBinding;->e:Landroid/widget/ImageView;

    .line 38
    .line 39
    const-string v3, "ivStart"

    .line 40
    .line 41
    invoke-static {p1, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 42
    .line 43
    .line 44
    invoke-virtual {p1, v2}, Landroid/view/View;->setVisibility(I)V

    .line 45
    .line 46
    .line 47
    iget-object p1, p0, Lcom/zykj/student/dialogue/ui/detail/AnswerPagerFragment;->f:Lcom/zykj/student/dialogue/databinding/DialogueFragmentAnswerPagerBinding;

    .line 48
    .line 49
    if-nez p1, :cond_2

    .line 50
    .line 51
    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 52
    .line 53
    .line 54
    goto :goto_0

    .line 55
    :cond_2
    move-object v0, p1

    .line 56
    :goto_0
    iget-object p1, v0, Lcom/zykj/student/dialogue/databinding/DialogueFragmentAnswerPagerBinding;->d:Landroid/widget/ImageView;

    .line 57
    .line 58
    const-string v0, "ivFullscreen"

    .line 59
    .line 60
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 61
    .line 62
    .line 63
    invoke-virtual {p1, v2}, Landroid/view/View;->setVisibility(I)V

    .line 64
    .line 65
    .line 66
    iget-object p0, p0, Lcom/zykj/student/dialogue/ui/detail/AnswerPagerFragment;->g:Lcom/zykj/view/board/play/SketchPlayFragment;

    .line 67
    .line 68
    if-eqz p0, :cond_3

    .line 69
    .line 70
    invoke-virtual {p0}, Lcom/zykj/view/board/play/SketchPlayFragment;->e0()V

    .line 71
    .line 72
    .line 73
    :cond_3
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 74
    .line 75
    return-object p0
.end method

.method public static final Q(Lcom/zykj/student/dialogue/ui/detail/AnswerPagerFragment;Landroid/view/View;)Lkotlin/Unit;
    .locals 1

    .line 1
    const-string v0, "it"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Lcom/zykj/student/dialogue/ui/detail/AnswerPagerFragment;->V()V

    .line 7
    .line 8
    .line 9
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 10
    .line 11
    return-object p0
.end method

.method public static final R(Lcom/zykj/student/dialogue/ui/detail/AnswerPagerFragment;Landroid/view/View;FF)V
    .locals 5

    .line 1
    iget-object p1, p0, Lcom/zykj/student/dialogue/ui/detail/AnswerPagerFragment;->f:Lcom/zykj/student/dialogue/databinding/DialogueFragmentAnswerPagerBinding;

    .line 2
    .line 3
    const/4 p2, 0x0

    .line 4
    const-string p3, "binding"

    .line 5
    .line 6
    if-nez p1, :cond_0

    .line 7
    .line 8
    invoke-static {p3}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    move-object p1, p2

    .line 12
    :cond_0
    iget-object p1, p1, Lcom/zykj/student/dialogue/databinding/DialogueFragmentAnswerPagerBinding;->c:Landroid/widget/ImageView;

    .line 13
    .line 14
    const-string v0, "ivAnswer"

    .line 15
    .line 16
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    invoke-virtual {p0}, Lcom/zykj/student/dialogue/ui/detail/AnswerPagerFragment;->S()Z

    .line 20
    .line 21
    .line 22
    move-result v1

    .line 23
    const/4 v2, 0x1

    .line 24
    const/4 v3, 0x0

    .line 25
    if-eqz v1, :cond_1

    .line 26
    .line 27
    :goto_0
    move v0, v2

    .line 28
    goto :goto_1

    .line 29
    :cond_1
    iget-object v1, p0, Lcom/zykj/student/dialogue/ui/detail/AnswerPagerFragment;->f:Lcom/zykj/student/dialogue/databinding/DialogueFragmentAnswerPagerBinding;

    .line 30
    .line 31
    if-nez v1, :cond_2

    .line 32
    .line 33
    invoke-static {p3}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    move-object v1, p2

    .line 37
    :cond_2
    iget-object v1, v1, Lcom/zykj/student/dialogue/databinding/DialogueFragmentAnswerPagerBinding;->c:Landroid/widget/ImageView;

    .line 38
    .line 39
    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 40
    .line 41
    .line 42
    invoke-virtual {v1}, Landroid/view/View;->getVisibility()I

    .line 43
    .line 44
    .line 45
    move-result v0

    .line 46
    if-nez v0, :cond_3

    .line 47
    .line 48
    goto :goto_0

    .line 49
    :cond_3
    move v0, v3

    .line 50
    :goto_1
    const/4 v1, 0x4

    .line 51
    if-eqz v0, :cond_4

    .line 52
    .line 53
    move v0, v1

    .line 54
    goto :goto_2

    .line 55
    :cond_4
    move v0, v3

    .line 56
    :goto_2
    invoke-virtual {p1, v0}, Landroid/view/View;->setVisibility(I)V

    .line 57
    .line 58
    .line 59
    iget-object p1, p0, Lcom/zykj/student/dialogue/ui/detail/AnswerPagerFragment;->f:Lcom/zykj/student/dialogue/databinding/DialogueFragmentAnswerPagerBinding;

    .line 60
    .line 61
    if-nez p1, :cond_5

    .line 62
    .line 63
    invoke-static {p3}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 64
    .line 65
    .line 66
    move-object p1, p2

    .line 67
    :cond_5
    iget-object p1, p1, Lcom/zykj/student/dialogue/databinding/DialogueFragmentAnswerPagerBinding;->d:Landroid/widget/ImageView;

    .line 68
    .line 69
    const-string v0, "ivFullscreen"

    .line 70
    .line 71
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 72
    .line 73
    .line 74
    iget-object v4, p0, Lcom/zykj/student/dialogue/ui/detail/AnswerPagerFragment;->f:Lcom/zykj/student/dialogue/databinding/DialogueFragmentAnswerPagerBinding;

    .line 75
    .line 76
    if-nez v4, :cond_6

    .line 77
    .line 78
    invoke-static {p3}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 79
    .line 80
    .line 81
    move-object v4, p2

    .line 82
    :cond_6
    iget-object v4, v4, Lcom/zykj/student/dialogue/databinding/DialogueFragmentAnswerPagerBinding;->d:Landroid/widget/ImageView;

    .line 83
    .line 84
    invoke-static {v4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 85
    .line 86
    .line 87
    invoke-virtual {v4}, Landroid/view/View;->getVisibility()I

    .line 88
    .line 89
    .line 90
    move-result v0

    .line 91
    if-nez v0, :cond_7

    .line 92
    .line 93
    move v0, v2

    .line 94
    goto :goto_3

    .line 95
    :cond_7
    move v0, v3

    .line 96
    :goto_3
    if-eqz v0, :cond_8

    .line 97
    .line 98
    move v0, v1

    .line 99
    goto :goto_4

    .line 100
    :cond_8
    move v0, v3

    .line 101
    :goto_4
    invoke-virtual {p1, v0}, Landroid/view/View;->setVisibility(I)V

    .line 102
    .line 103
    .line 104
    invoke-direct {p0}, Lcom/zykj/student/dialogue/ui/detail/AnswerPagerFragment;->K()Lcom/zykj/student/dialogue/ui/detail/viewmodel/AnswerViewModel;

    .line 105
    .line 106
    .line 107
    move-result-object p1

    .line 108
    invoke-virtual {p1}, Lcom/zykj/student/dialogue/ui/detail/viewmodel/AnswerViewModel;->K()Lkotlinx/coroutines/flow/StateFlow;

    .line 109
    .line 110
    .line 111
    move-result-object p1

    .line 112
    invoke-interface {p1}, Lkotlinx/coroutines/flow/StateFlow;->getValue()Ljava/lang/Object;

    .line 113
    .line 114
    .line 115
    move-result-object p1

    .line 116
    check-cast p1, Lp6/k;

    .line 117
    .line 118
    invoke-virtual {p0, p1}, Lcom/zykj/student/dialogue/ui/detail/AnswerPagerFragment;->C(Lp6/k;)Z

    .line 119
    .line 120
    .line 121
    move-result p1

    .line 122
    if-eqz p1, :cond_d

    .line 123
    .line 124
    iget-object p1, p0, Lcom/zykj/student/dialogue/ui/detail/AnswerPagerFragment;->f:Lcom/zykj/student/dialogue/databinding/DialogueFragmentAnswerPagerBinding;

    .line 125
    .line 126
    if-nez p1, :cond_9

    .line 127
    .line 128
    invoke-static {p3}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 129
    .line 130
    .line 131
    move-object p1, p2

    .line 132
    :cond_9
    iget-object p1, p1, Lcom/zykj/student/dialogue/databinding/DialogueFragmentAnswerPagerBinding;->e:Landroid/widget/ImageView;

    .line 133
    .line 134
    const-string v0, "ivStart"

    .line 135
    .line 136
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 137
    .line 138
    .line 139
    iget-object p0, p0, Lcom/zykj/student/dialogue/ui/detail/AnswerPagerFragment;->f:Lcom/zykj/student/dialogue/databinding/DialogueFragmentAnswerPagerBinding;

    .line 140
    .line 141
    if-nez p0, :cond_a

    .line 142
    .line 143
    invoke-static {p3}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 144
    .line 145
    .line 146
    goto :goto_5

    .line 147
    :cond_a
    move-object p2, p0

    .line 148
    :goto_5
    iget-object p0, p2, Lcom/zykj/student/dialogue/databinding/DialogueFragmentAnswerPagerBinding;->e:Landroid/widget/ImageView;

    .line 149
    .line 150
    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 151
    .line 152
    .line 153
    invoke-virtual {p0}, Landroid/view/View;->getVisibility()I

    .line 154
    .line 155
    .line 156
    move-result p0

    .line 157
    if-nez p0, :cond_b

    .line 158
    .line 159
    goto :goto_6

    .line 160
    :cond_b
    move v2, v3

    .line 161
    :goto_6
    if-eqz v2, :cond_c

    .line 162
    .line 163
    move v3, v1

    .line 164
    :cond_c
    invoke-virtual {p1, v3}, Landroid/view/View;->setVisibility(I)V

    .line 165
    .line 166
    .line 167
    :cond_d
    return-void
.end method

.method public static final W(Lcom/zykj/view/board/play/SketchPlayFragment;Lcom/zykj/student/dialogue/ui/detail/AnswerPagerFragment;Z)V
    .locals 6

    .line 1
    invoke-virtual {p0}, Lcom/zykj/view/board/play/SketchPlayFragment;->d0()Z

    .line 2
    .line 3
    .line 4
    move-result v3

    .line 5
    iget-object v0, p1, Lcom/zykj/student/dialogue/ui/detail/AnswerPagerFragment;->g:Lcom/zykj/view/board/play/SketchPlayFragment;

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    invoke-virtual {v0}, Lcom/zykj/view/board/play/SketchPlayFragment;->H0()V

    .line 10
    .line 11
    .line 12
    :cond_0
    invoke-direct {p1}, Lcom/zykj/student/dialogue/ui/detail/AnswerPagerFragment;->K()Lcom/zykj/student/dialogue/ui/detail/viewmodel/AnswerViewModel;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    new-instance v0, Lcom/zykj/student/dialogue/ui/detail/viewmodel/b$a;

    .line 17
    .line 18
    xor-int/lit8 v1, p2, 0x1

    .line 19
    .line 20
    invoke-virtual {p0}, Lcom/zykj/view/board/play/SketchPlayFragment;->J()I

    .line 21
    .line 22
    .line 23
    move-result v2

    .line 24
    invoke-virtual {p0}, Lcom/zykj/view/board/play/SketchPlayFragment;->L()D

    .line 25
    .line 26
    .line 27
    move-result-wide v4

    .line 28
    invoke-direct/range {v0 .. v5}, Lcom/zykj/student/dialogue/ui/detail/viewmodel/b$a;-><init>(ZIZD)V

    .line 29
    .line 30
    .line 31
    invoke-virtual {p1, v0}, Lcom/zykj/student/dialogue/ui/detail/viewmodel/AnswerViewModel;->M(Lcom/zykj/student/dialogue/ui/detail/viewmodel/b;)V

    .line 32
    .line 33
    .line 34
    return-void
.end method

.method public static final X()Ljava/lang/String;
    .locals 3

    .line 1
    invoke-static {}, Lcom/blankj/utilcode/util/PathUtils;->getExternalAppCachePath()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    sget-object v1, Ljava/io/File;->separator:Ljava/lang/String;

    .line 6
    .line 7
    new-instance v2, Ljava/lang/StringBuilder;

    .line 8
    .line 9
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 10
    .line 11
    .line 12
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 13
    .line 14
    .line 15
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    const-string v0, "temp_add.png"

    .line 19
    .line 20
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    return-object v0
.end method

.method public static synthetic g(Ljava/io/File;)Z
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/zykj/student/dialogue/ui/detail/AnswerPagerFragment;->D(Ljava/io/File;)Z

    move-result p0

    return p0
.end method

.method public static synthetic h()Ljava/lang/String;
    .locals 1

    .line 1
    invoke-static {}, Lcom/zykj/student/dialogue/ui/detail/AnswerPagerFragment;->X()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic i(Lcom/zykj/student/dialogue/ui/detail/AnswerPagerFragment;Landroid/view/View;FF)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2, p3}, Lcom/zykj/student/dialogue/ui/detail/AnswerPagerFragment;->R(Lcom/zykj/student/dialogue/ui/detail/AnswerPagerFragment;Landroid/view/View;FF)V

    return-void
.end method

.method public static synthetic j(Lcom/zykj/student/dialogue/ui/detail/AnswerPagerFragment;Landroid/view/View;)Lkotlin/Unit;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/zykj/student/dialogue/ui/detail/AnswerPagerFragment;->P(Lcom/zykj/student/dialogue/ui/detail/AnswerPagerFragment;Landroid/view/View;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic k(Lcom/zykj/student/dialogue/ui/detail/AnswerPagerFragment;Landroid/view/View;)Lkotlin/Unit;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/zykj/student/dialogue/ui/detail/AnswerPagerFragment;->O(Lcom/zykj/student/dialogue/ui/detail/AnswerPagerFragment;Landroid/view/View;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic l(Lcom/zykj/student/dialogue/ui/detail/AnswerPagerFragment;Landroid/view/View;)Lkotlin/Unit;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/zykj/student/dialogue/ui/detail/AnswerPagerFragment;->N(Lcom/zykj/student/dialogue/ui/detail/AnswerPagerFragment;Landroid/view/View;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic m(Lcom/liulishuo/okdownload/a;Landroid/content/DialogInterface;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/zykj/student/dialogue/ui/detail/AnswerPagerFragment;->F(Lcom/liulishuo/okdownload/a;Landroid/content/DialogInterface;)V

    return-void
.end method

.method public static synthetic n(Lcom/zykj/student/dialogue/ui/detail/AnswerPagerFragment;Landroid/view/View;)Lkotlin/Unit;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/zykj/student/dialogue/ui/detail/AnswerPagerFragment;->Q(Lcom/zykj/student/dialogue/ui/detail/AnswerPagerFragment;Landroid/view/View;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic o(Lcom/zykj/student/dialogue/ui/detail/AnswerPagerFragment;Lp6/k;)Z
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcom/zykj/student/dialogue/ui/detail/AnswerPagerFragment;->C(Lp6/k;)Z

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method

.method public static final synthetic p(Lcom/zykj/student/dialogue/ui/detail/AnswerPagerFragment;Ljava/util/List;Z)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Lcom/zykj/student/dialogue/ui/detail/AnswerPagerFragment;->E(Ljava/util/List;Z)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static final synthetic q(Lcom/zykj/student/dialogue/ui/detail/AnswerPagerFragment;)Lcom/zykj/student/dialogue/databinding/DialogueFragmentAnswerPagerBinding;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/zykj/student/dialogue/ui/detail/AnswerPagerFragment;->f:Lcom/zykj/student/dialogue/databinding/DialogueFragmentAnswerPagerBinding;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic r(Lcom/zykj/student/dialogue/ui/detail/AnswerPagerFragment;)Lcom/zykj/student/dialogue/ui/detail/viewmodel/NewAnswerViewModel;
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/zykj/student/dialogue/ui/detail/AnswerPagerFragment;->G()Lcom/zykj/student/dialogue/ui/detail/viewmodel/NewAnswerViewModel;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static final synthetic s(Lcom/zykj/student/dialogue/ui/detail/AnswerPagerFragment;)I
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/zykj/student/dialogue/ui/detail/AnswerPagerFragment;->H()I

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method

.method public static final synthetic t(Lcom/zykj/student/dialogue/ui/detail/AnswerPagerFragment;)Lcom/zykj/view/board/play/SketchPlayFragment;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/zykj/student/dialogue/ui/detail/AnswerPagerFragment;->g:Lcom/zykj/view/board/play/SketchPlayFragment;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic u(Lcom/zykj/student/dialogue/ui/detail/AnswerPagerFragment;)D
    .locals 2

    .line 1
    invoke-direct {p0}, Lcom/zykj/student/dialogue/ui/detail/AnswerPagerFragment;->I()D

    .line 2
    .line 3
    .line 4
    move-result-wide v0

    .line 5
    return-wide v0
.end method

.method public static final synthetic v(Lcom/zykj/student/dialogue/ui/detail/AnswerPagerFragment;)Lcom/zykj/student/dialogue/ui/detail/viewmodel/AnswerViewModel;
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/zykj/student/dialogue/ui/detail/AnswerPagerFragment;->K()Lcom/zykj/student/dialogue/ui/detail/viewmodel/AnswerViewModel;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static final synthetic w(Lcom/zykj/student/dialogue/ui/detail/AnswerPagerFragment;)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/zykj/student/dialogue/ui/detail/AnswerPagerFragment;->L()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static final synthetic x(Lcom/zykj/student/dialogue/ui/detail/AnswerPagerFragment;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcom/zykj/student/dialogue/ui/detail/AnswerPagerFragment;->M(Ljava/lang/String;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static final synthetic y(Lcom/zykj/student/dialogue/ui/detail/AnswerPagerFragment;)Z
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/zykj/student/dialogue/ui/detail/AnswerPagerFragment;->S()Z

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method

.method public static final synthetic z(Lcom/zykj/student/dialogue/ui/detail/AnswerPagerFragment;Z)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcom/zykj/student/dialogue/ui/detail/AnswerPagerFragment;->T(Z)V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public final C(Lp6/k;)Z
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/zykj/student/dialogue/ui/detail/AnswerPagerFragment;->g:Lcom/zykj/view/board/play/SketchPlayFragment;

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/zykj/view/board/play/SketchPlayFragment;->J()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-nez v0, :cond_1

    .line 10
    .line 11
    new-instance v0, Ljava/io/File;

    .line 12
    .line 13
    invoke-virtual {p1}, Lp6/k;->i()Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    if-nez p1, :cond_0

    .line 18
    .line 19
    const-string p1, ""

    .line 20
    .line 21
    :cond_0
    invoke-direct {v0, p1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    const/4 p1, 0x0

    .line 25
    const/4 v1, 0x1

    .line 26
    invoke-static {v0, p1, v1, p1}, Lkotlin/io/FilesKt;->walk$default(Ljava/io/File;Lkotlin/io/FileWalkDirection;ILjava/lang/Object;)Lkotlin/io/FileTreeWalk;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    new-instance v0, Lo6/m;

    .line 31
    .line 32
    invoke-direct {v0}, Lo6/m;-><init>()V

    .line 33
    .line 34
    .line 35
    invoke-static {p1, v0}, Lkotlin/sequences/SequencesKt;->filter(Lkotlin/sequences/Sequence;Lkotlin/jvm/functions/Function1;)Lkotlin/sequences/Sequence;

    .line 36
    .line 37
    .line 38
    move-result-object p1

    .line 39
    invoke-static {p1}, Lkotlin/sequences/SequencesKt;->count(Lkotlin/sequences/Sequence;)I

    .line 40
    .line 41
    .line 42
    move-result p1

    .line 43
    if-lez p1, :cond_1

    .line 44
    .line 45
    return v1

    .line 46
    :cond_1
    const/4 p1, 0x0

    .line 47
    return p1
.end method

.method public final E(Ljava/util/List;Z)V
    .locals 5

    .line 1
    if-eqz p2, :cond_0

    .line 2
    .line 3
    invoke-static {p1}, Lkotlin/collections/CollectionsKt;->firstOrNull(Ljava/util/List;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lcom/liulishuo/okdownload/a;

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    const/4 v0, 0x0

    .line 11
    :goto_0
    new-instance v1, Lkotlin/jvm/internal/Ref$ObjectRef;

    .line 12
    .line 13
    invoke-direct {v1}, Lkotlin/jvm/internal/Ref$ObjectRef;-><init>()V

    .line 14
    .line 15
    .line 16
    if-eqz p2, :cond_1

    .line 17
    .line 18
    new-instance p2, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;

    .line 19
    .line 20
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->requireContext()Landroid/content/Context;

    .line 21
    .line 22
    .line 23
    move-result-object v2

    .line 24
    invoke-direct {p2, v2}, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;-><init>(Landroid/content/Context;)V

    .line 25
    .line 26
    .line 27
    const-string v2, "\u6b63\u5728\u4e0b\u8f7d\u8bf7\u7a0d\u540e"

    .line 28
    .line 29
    invoke-virtual {p2, v2}, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;->f(Ljava/lang/CharSequence;)Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;

    .line 30
    .line 31
    .line 32
    move-result-object p2

    .line 33
    sget-object v2, Lcom/xuexiang/xui/widget/dialog/materialdialog/GravityEnum;->b:Lcom/xuexiang/xui/widget/dialog/materialdialog/GravityEnum;

    .line 34
    .line 35
    invoke-virtual {p2, v2}, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;->g(Lcom/xuexiang/xui/widget/dialog/materialdialog/GravityEnum;)Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;

    .line 36
    .line 37
    .line 38
    move-result-object p2

    .line 39
    const/16 v2, 0x64

    .line 40
    .line 41
    const/4 v3, 0x1

    .line 42
    const/4 v4, 0x0

    .line 43
    invoke-virtual {p2, v4, v2, v3}, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;->m(ZIZ)Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;

    .line 44
    .line 45
    .line 46
    move-result-object p2

    .line 47
    invoke-virtual {p2, v4}, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;->d(Z)Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;

    .line 48
    .line 49
    .line 50
    move-result-object p2

    .line 51
    new-instance v2, Lo6/n;

    .line 52
    .line 53
    invoke-direct {v2, v0}, Lo6/n;-><init>(Lcom/liulishuo/okdownload/a;)V

    .line 54
    .line 55
    .line 56
    invoke-virtual {p2, v2}, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;->b(Landroid/content/DialogInterface$OnCancelListener;)Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;

    .line 57
    .line 58
    .line 59
    move-result-object p2

    .line 60
    sget v2, Lcom/zykj/student/dialogue/R$string;->cancel:I

    .line 61
    .line 62
    invoke-virtual {p0, v2}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    .line 63
    .line 64
    .line 65
    move-result-object v2

    .line 66
    invoke-virtual {p2, v2}, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;->i(Ljava/lang/CharSequence;)Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;

    .line 67
    .line 68
    .line 69
    move-result-object p2

    .line 70
    invoke-virtual {p2}, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;->n()Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;

    .line 71
    .line 72
    .line 73
    move-result-object p2

    .line 74
    iput-object p2, v1, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    .line 75
    .line 76
    :cond_1
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 77
    .line 78
    .line 79
    move-result-object p1

    .line 80
    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 81
    .line 82
    .line 83
    move-result p2

    .line 84
    if-eqz p2, :cond_2

    .line 85
    .line 86
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 87
    .line 88
    .line 89
    move-result-object p2

    .line 90
    check-cast p2, Lcom/liulishuo/okdownload/a;

    .line 91
    .line 92
    new-instance v2, Lcom/zykj/student/dialogue/ui/detail/AnswerPagerFragment$download$2$1;

    .line 93
    .line 94
    invoke-direct {v2, p0, v1, v0}, Lcom/zykj/student/dialogue/ui/detail/AnswerPagerFragment$download$2$1;-><init>(Lcom/zykj/student/dialogue/ui/detail/AnswerPagerFragment;Lkotlin/jvm/internal/Ref$ObjectRef;Lcom/liulishuo/okdownload/a;)V

    .line 95
    .line 96
    .line 97
    invoke-virtual {p2, v2}, Lcom/liulishuo/okdownload/a;->k(Lp1/a;)V

    .line 98
    .line 99
    .line 100
    goto :goto_1

    .line 101
    :cond_2
    return-void
.end method

.method public final G()Lcom/zykj/student/dialogue/ui/detail/viewmodel/NewAnswerViewModel;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/student/dialogue/ui/detail/AnswerPagerFragment;->i:Lkotlin/Lazy;

    .line 2
    .line 3
    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lcom/zykj/student/dialogue/ui/detail/viewmodel/NewAnswerViewModel;

    .line 8
    .line 9
    return-object v0
.end method

.method public final J()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/student/dialogue/ui/detail/AnswerPagerFragment;->j:Lkotlin/Lazy;

    .line 2
    .line 3
    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Ljava/lang/String;

    .line 8
    .line 9
    return-object v0
.end method

.method public final L()V
    .locals 3

    .line 1
    invoke-static {p0}, Landroidx/lifecycle/LifecycleOwnerKt;->getLifecycleScope(Landroidx/lifecycle/LifecycleOwner;)Landroidx/lifecycle/LifecycleCoroutineScope;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    new-instance v1, Lcom/zykj/student/dialogue/ui/detail/AnswerPagerFragment$loadData$1;

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    invoke-direct {v1, p0, v2}, Lcom/zykj/student/dialogue/ui/detail/AnswerPagerFragment$loadData$1;-><init>(Lcom/zykj/student/dialogue/ui/detail/AnswerPagerFragment;Lkotlin/coroutines/Continuation;)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0, v1}, Landroidx/lifecycle/LifecycleCoroutineScope;->launchWhenResumed(Lkotlin/jvm/functions/Function2;)Lkotlinx/coroutines/Job;

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method public final M(Ljava/lang/String;)V
    .locals 3

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
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    invoke-static {v0}, Landroidx/lifecycle/LifecycleOwnerKt;->getLifecycleScope(Landroidx/lifecycle/LifecycleOwner;)Landroidx/lifecycle/LifecycleCoroutineScope;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    new-instance v1, Lcom/zykj/student/dialogue/ui/detail/AnswerPagerFragment$loadMicroLesson$1;

    .line 15
    .line 16
    const/4 v2, 0x0

    .line 17
    invoke-direct {v1, p0, p1, v2}, Lcom/zykj/student/dialogue/ui/detail/AnswerPagerFragment$loadMicroLesson$1;-><init>(Lcom/zykj/student/dialogue/ui/detail/AnswerPagerFragment;Ljava/lang/String;Lkotlin/coroutines/Continuation;)V

    .line 18
    .line 19
    .line 20
    invoke-virtual {v0, v1}, Landroidx/lifecycle/LifecycleCoroutineScope;->launchWhenStarted(Lkotlin/jvm/functions/Function2;)Lkotlinx/coroutines/Job;

    .line 21
    .line 22
    .line 23
    return-void
.end method

.method public final S()Z
    .locals 2

    .line 1
    invoke-direct {p0}, Lcom/zykj/student/dialogue/ui/detail/AnswerPagerFragment;->K()Lcom/zykj/student/dialogue/ui/detail/viewmodel/AnswerViewModel;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Lcom/zykj/student/dialogue/ui/detail/viewmodel/AnswerViewModel;->B()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    const/4 v1, 0x1

    .line 10
    if-nez v0, :cond_1

    .line 11
    .line 12
    invoke-direct {p0}, Lcom/zykj/student/dialogue/ui/detail/AnswerPagerFragment;->K()Lcom/zykj/student/dialogue/ui/detail/viewmodel/AnswerViewModel;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    invoke-virtual {v0}, Lcom/zykj/student/dialogue/ui/detail/viewmodel/AnswerViewModel;->H()Lkotlinx/coroutines/flow/StateFlow;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    invoke-interface {v0}, Lkotlinx/coroutines/flow/StateFlow;->getValue()Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    check-cast v0, Lcom/zykj/student/dialogue/bean/resp/QuestionResp;

    .line 25
    .line 26
    if-eqz v0, :cond_0

    .line 27
    .line 28
    invoke-virtual {v0}, Lcom/zykj/student/dialogue/bean/resp/QuestionResp;->getClosed()Z

    .line 29
    .line 30
    .line 31
    move-result v0

    .line 32
    if-ne v0, v1, :cond_0

    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_0
    const/4 v0, 0x0

    .line 36
    return v0

    .line 37
    :cond_1
    :goto_0
    return v1
.end method

.method public final T(Z)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/zykj/student/dialogue/ui/detail/AnswerPagerFragment;->f:Lcom/zykj/student/dialogue/databinding/DialogueFragmentAnswerPagerBinding;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const-string v0, "binding"

    .line 6
    .line 7
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    const/4 v0, 0x0

    .line 11
    :cond_0
    iget-object v0, v0, Lcom/zykj/student/dialogue/databinding/DialogueFragmentAnswerPagerBinding;->f:Landroid/widget/LinearLayout;

    .line 12
    .line 13
    const-string v1, "llLoadError"

    .line 14
    .line 15
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    if-nez p1, :cond_1

    .line 19
    .line 20
    const/4 p1, 0x0

    .line 21
    goto :goto_0

    .line 22
    :cond_1
    const/16 p1, 0x8

    .line 23
    .line 24
    :goto_0
    invoke-virtual {v0, p1}, Landroid/view/View;->setVisibility(I)V

    .line 25
    .line 26
    .line 27
    return-void
.end method

.method public final U()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/zykj/student/dialogue/ui/detail/AnswerPagerFragment;->k:Lkotlinx/coroutines/Job;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    const/4 v2, 0x1

    .line 7
    invoke-static {v0, v1, v2, v1}, Lkotlinx/coroutines/Job$DefaultImpls;->cancel$default(Lkotlinx/coroutines/Job;Ljava/util/concurrent/CancellationException;ILjava/lang/Object;)V

    .line 8
    .line 9
    .line 10
    :cond_0
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getViewLifecycleOwner()Landroidx/lifecycle/LifecycleOwner;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    const-string v2, "getViewLifecycleOwner(...)"

    .line 15
    .line 16
    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    invoke-static {v0}, Landroidx/lifecycle/LifecycleOwnerKt;->getLifecycleScope(Landroidx/lifecycle/LifecycleOwner;)Landroidx/lifecycle/LifecycleCoroutineScope;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    new-instance v2, Lcom/zykj/student/dialogue/ui/detail/AnswerPagerFragment$startAutoHideJob$1;

    .line 24
    .line 25
    invoke-direct {v2, p0, v1}, Lcom/zykj/student/dialogue/ui/detail/AnswerPagerFragment$startAutoHideJob$1;-><init>(Lcom/zykj/student/dialogue/ui/detail/AnswerPagerFragment;Lkotlin/coroutines/Continuation;)V

    .line 26
    .line 27
    .line 28
    invoke-virtual {v0, v2}, Landroidx/lifecycle/LifecycleCoroutineScope;->launchWhenStarted(Lkotlin/jvm/functions/Function2;)Lkotlinx/coroutines/Job;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    iput-object v0, p0, Lcom/zykj/student/dialogue/ui/detail/AnswerPagerFragment;->k:Lkotlinx/coroutines/Job;

    .line 33
    .line 34
    return-void
.end method

.method public final V()V
    .locals 7

    .line 1
    iget-object v0, p0, Lcom/zykj/student/dialogue/ui/detail/AnswerPagerFragment;->g:Lcom/zykj/view/board/play/SketchPlayFragment;

    .line 2
    .line 3
    if-eqz v0, :cond_3

    .line 4
    .line 5
    invoke-direct {p0}, Lcom/zykj/student/dialogue/ui/detail/AnswerPagerFragment;->K()Lcom/zykj/student/dialogue/ui/detail/viewmodel/AnswerViewModel;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-virtual {v1}, Lcom/zykj/student/dialogue/ui/detail/viewmodel/AnswerViewModel;->K()Lkotlinx/coroutines/flow/StateFlow;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    invoke-interface {v1}, Lkotlinx/coroutines/flow/StateFlow;->getValue()Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    check-cast v1, Lp6/k;

    .line 18
    .line 19
    invoke-virtual {v1}, Lp6/k;->h()J

    .line 20
    .line 21
    .line 22
    move-result-wide v1

    .line 23
    invoke-direct {p0}, Lcom/zykj/student/dialogue/ui/detail/AnswerPagerFragment;->K()Lcom/zykj/student/dialogue/ui/detail/viewmodel/AnswerViewModel;

    .line 24
    .line 25
    .line 26
    move-result-object v3

    .line 27
    invoke-virtual {v3}, Lcom/zykj/student/dialogue/ui/detail/viewmodel/AnswerViewModel;->K()Lkotlinx/coroutines/flow/StateFlow;

    .line 28
    .line 29
    .line 30
    move-result-object v3

    .line 31
    invoke-interface {v3}, Lkotlinx/coroutines/flow/StateFlow;->getValue()Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v3

    .line 35
    check-cast v3, Lp6/k;

    .line 36
    .line 37
    invoke-virtual {v3}, Lp6/k;->s()Z

    .line 38
    .line 39
    .line 40
    move-result v3

    .line 41
    const-string v4, "\u4e0d\u8981\u9891\u7e41\u64cd\u4f5c"

    .line 42
    .line 43
    if-eqz v3, :cond_1

    .line 44
    .line 45
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 46
    .line 47
    .line 48
    move-result-wide v5

    .line 49
    sub-long/2addr v5, v1

    .line 50
    const-wide/16 v1, 0x3e8

    .line 51
    .line 52
    cmp-long v1, v5, v1

    .line 53
    .line 54
    if-lez v1, :cond_0

    .line 55
    .line 56
    invoke-static {v0, p0, v3}, Lcom/zykj/student/dialogue/ui/detail/AnswerPagerFragment;->W(Lcom/zykj/view/board/play/SketchPlayFragment;Lcom/zykj/student/dialogue/ui/detail/AnswerPagerFragment;Z)V

    .line 57
    .line 58
    .line 59
    return-void

    .line 60
    :cond_0
    sget-object v0, Lcom/zykj/base/utils/XToastUtils;->INSTANCE:Lcom/zykj/base/utils/XToastUtils;

    .line 61
    .line 62
    invoke-virtual {v0, v4}, Lcom/zykj/base/utils/XToastUtils;->warning(Ljava/lang/CharSequence;)V

    .line 63
    .line 64
    .line 65
    return-void

    .line 66
    :cond_1
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 67
    .line 68
    .line 69
    move-result-wide v5

    .line 70
    sub-long/2addr v5, v1

    .line 71
    const-wide/16 v1, 0xbb8

    .line 72
    .line 73
    cmp-long v1, v5, v1

    .line 74
    .line 75
    if-lez v1, :cond_2

    .line 76
    .line 77
    invoke-static {v0, p0, v3}, Lcom/zykj/student/dialogue/ui/detail/AnswerPagerFragment;->W(Lcom/zykj/view/board/play/SketchPlayFragment;Lcom/zykj/student/dialogue/ui/detail/AnswerPagerFragment;Z)V

    .line 78
    .line 79
    .line 80
    return-void

    .line 81
    :cond_2
    sget-object v0, Lcom/zykj/base/utils/XToastUtils;->INSTANCE:Lcom/zykj/base/utils/XToastUtils;

    .line 82
    .line 83
    invoke-virtual {v0, v4}, Lcom/zykj/base/utils/XToastUtils;->warning(Ljava/lang/CharSequence;)V

    .line 84
    .line 85
    .line 86
    :cond_3
    return-void
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
    invoke-super {p0, p1}, Lcom/zykj/student/dialogue/ui/detail/Hilt_AnswerPagerFragment;->onAttach(Landroid/content/Context;)V

    .line 7
    .line 8
    .line 9
    new-instance p1, Lcom/zykj/student/dialogue/ui/detail/AnswerPagerFragment$onAttach$callback$1;

    .line 10
    .line 11
    invoke-direct {p1, p0}, Lcom/zykj/student/dialogue/ui/detail/AnswerPagerFragment$onAttach$callback$1;-><init>(Lcom/zykj/student/dialogue/ui/detail/AnswerPagerFragment;)V

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
    invoke-static {p1, p2, p3}, Lcom/zykj/student/dialogue/databinding/DialogueFragmentAnswerPagerBinding;->a(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/zykj/student/dialogue/databinding/DialogueFragmentAnswerPagerBinding;

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
    iput-object p1, p0, Lcom/zykj/student/dialogue/ui/detail/AnswerPagerFragment;->f:Lcom/zykj/student/dialogue/databinding/DialogueFragmentAnswerPagerBinding;

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
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    const-string v1, "view"

    .line 4
    .line 5
    move-object/from16 v2, p1

    .line 6
    .line 7
    invoke-static {v2, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    invoke-super/range {p0 .. p2}, Landroidx/fragment/app/Fragment;->onViewCreated(Landroid/view/View;Landroid/os/Bundle;)V

    .line 11
    .line 12
    .line 13
    iget-object v1, v0, Lcom/zykj/student/dialogue/ui/detail/AnswerPagerFragment;->f:Lcom/zykj/student/dialogue/databinding/DialogueFragmentAnswerPagerBinding;

    .line 14
    .line 15
    const-string v2, "binding"

    .line 16
    .line 17
    const/4 v3, 0x0

    .line 18
    if-nez v1, :cond_0

    .line 19
    .line 20
    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    move-object v1, v3

    .line 24
    :cond_0
    iget-object v1, v1, Lcom/zykj/student/dialogue/databinding/DialogueFragmentAnswerPagerBinding;->c:Landroid/widget/ImageView;

    .line 25
    .line 26
    const-string v4, "ivAnswer"

    .line 27
    .line 28
    invoke-static {v1, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    invoke-virtual {v0}, Lcom/zykj/student/dialogue/ui/detail/AnswerPagerFragment;->S()Z

    .line 32
    .line 33
    .line 34
    move-result v5

    .line 35
    if-eqz v5, :cond_1

    .line 36
    .line 37
    const/4 v5, 0x4

    .line 38
    goto :goto_0

    .line 39
    :cond_1
    const/4 v5, 0x0

    .line 40
    :goto_0
    invoke-virtual {v1, v5}, Landroid/view/View;->setVisibility(I)V

    .line 41
    .line 42
    .line 43
    new-instance v1, Lcom/zykj/view/board/play/SketchPlayFragment;

    .line 44
    .line 45
    invoke-direct {v1}, Lcom/zykj/view/board/play/SketchPlayFragment;-><init>()V

    .line 46
    .line 47
    .line 48
    iput-object v1, v0, Lcom/zykj/student/dialogue/ui/detail/AnswerPagerFragment;->g:Lcom/zykj/view/board/play/SketchPlayFragment;

    .line 49
    .line 50
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->getChildFragmentManager()Landroidx/fragment/app/FragmentManager;

    .line 51
    .line 52
    .line 53
    move-result-object v1

    .line 54
    invoke-virtual {v1}, Landroidx/fragment/app/FragmentManager;->beginTransaction()Landroidx/fragment/app/FragmentTransaction;

    .line 55
    .line 56
    .line 57
    move-result-object v1

    .line 58
    sget v5, Lcom/zykj/student/dialogue/R$id;->fl_container:I

    .line 59
    .line 60
    iget-object v6, v0, Lcom/zykj/student/dialogue/ui/detail/AnswerPagerFragment;->g:Lcom/zykj/view/board/play/SketchPlayFragment;

    .line 61
    .line 62
    invoke-static {v6}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 63
    .line 64
    .line 65
    invoke-virtual {v1, v5, v6}, Landroidx/fragment/app/FragmentTransaction;->replace(ILandroidx/fragment/app/Fragment;)Landroidx/fragment/app/FragmentTransaction;

    .line 66
    .line 67
    .line 68
    move-result-object v1

    .line 69
    invoke-virtual {v1}, Landroidx/fragment/app/FragmentTransaction;->commitNowAllowingStateLoss()V

    .line 70
    .line 71
    .line 72
    iget-object v1, v0, Lcom/zykj/student/dialogue/ui/detail/AnswerPagerFragment;->g:Lcom/zykj/view/board/play/SketchPlayFragment;

    .line 73
    .line 74
    if-eqz v1, :cond_2

    .line 75
    .line 76
    new-instance v5, Le7/a;

    .line 77
    .line 78
    const/16 v16, 0x2ff

    .line 79
    .line 80
    const/16 v17, 0x0

    .line 81
    .line 82
    const/4 v6, 0x0

    .line 83
    const/4 v7, 0x0

    .line 84
    const/4 v8, 0x0

    .line 85
    const/4 v9, 0x0

    .line 86
    const/4 v10, 0x0

    .line 87
    const/4 v11, 0x0

    .line 88
    const/4 v12, 0x0

    .line 89
    const/4 v13, 0x0

    .line 90
    const/4 v14, 0x0

    .line 91
    const/4 v15, 0x0

    .line 92
    invoke-direct/range {v5 .. v17}, Le7/a;-><init>(ZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;ZLkotlin/jvm/functions/Function0;Ljava/util/List;Lkotlin/jvm/functions/Function0;Le7/b;ZZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 93
    .line 94
    .line 95
    invoke-virtual {v1, v5}, Lcom/zykj/view/board/play/SketchPlayFragment;->r0(Le7/a;)V

    .line 96
    .line 97
    .line 98
    :cond_2
    invoke-virtual {v0}, Lcom/zykj/student/dialogue/ui/detail/AnswerPagerFragment;->L()V

    .line 99
    .line 100
    .line 101
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->getViewLifecycleOwner()Landroidx/lifecycle/LifecycleOwner;

    .line 102
    .line 103
    .line 104
    move-result-object v1

    .line 105
    const-string v5, "getViewLifecycleOwner(...)"

    .line 106
    .line 107
    invoke-static {v1, v5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 108
    .line 109
    .line 110
    invoke-static {v1}, Landroidx/lifecycle/LifecycleOwnerKt;->getLifecycleScope(Landroidx/lifecycle/LifecycleOwner;)Landroidx/lifecycle/LifecycleCoroutineScope;

    .line 111
    .line 112
    .line 113
    move-result-object v6

    .line 114
    new-instance v9, Lcom/zykj/student/dialogue/ui/detail/AnswerPagerFragment$onViewCreated$1;

    .line 115
    .line 116
    invoke-direct {v9, v0, v3}, Lcom/zykj/student/dialogue/ui/detail/AnswerPagerFragment$onViewCreated$1;-><init>(Lcom/zykj/student/dialogue/ui/detail/AnswerPagerFragment;Lkotlin/coroutines/Continuation;)V

    .line 117
    .line 118
    .line 119
    const/4 v10, 0x3

    .line 120
    const/4 v11, 0x0

    .line 121
    const/4 v7, 0x0

    .line 122
    const/4 v8, 0x0

    .line 123
    invoke-static/range {v6 .. v11}, Lkotlinx/coroutines/BuildersKt;->launch$default(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/Job;

    .line 124
    .line 125
    .line 126
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->getViewLifecycleOwner()Landroidx/lifecycle/LifecycleOwner;

    .line 127
    .line 128
    .line 129
    move-result-object v1

    .line 130
    invoke-static {v1, v5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 131
    .line 132
    .line 133
    invoke-static {v1}, Landroidx/lifecycle/LifecycleOwnerKt;->getLifecycleScope(Landroidx/lifecycle/LifecycleOwner;)Landroidx/lifecycle/LifecycleCoroutineScope;

    .line 134
    .line 135
    .line 136
    move-result-object v1

    .line 137
    new-instance v6, Lcom/zykj/student/dialogue/ui/detail/AnswerPagerFragment$onViewCreated$2;

    .line 138
    .line 139
    invoke-direct {v6, v0, v3}, Lcom/zykj/student/dialogue/ui/detail/AnswerPagerFragment$onViewCreated$2;-><init>(Lcom/zykj/student/dialogue/ui/detail/AnswerPagerFragment;Lkotlin/coroutines/Continuation;)V

    .line 140
    .line 141
    .line 142
    invoke-virtual {v1, v6}, Landroidx/lifecycle/LifecycleCoroutineScope;->launchWhenStarted(Lkotlin/jvm/functions/Function2;)Lkotlinx/coroutines/Job;

    .line 143
    .line 144
    .line 145
    invoke-static {v0}, Landroidx/lifecycle/LifecycleOwnerKt;->getLifecycleScope(Landroidx/lifecycle/LifecycleOwner;)Landroidx/lifecycle/LifecycleCoroutineScope;

    .line 146
    .line 147
    .line 148
    move-result-object v7

    .line 149
    new-instance v10, Lcom/zykj/student/dialogue/ui/detail/AnswerPagerFragment$onViewCreated$3;

    .line 150
    .line 151
    invoke-direct {v10, v0, v3}, Lcom/zykj/student/dialogue/ui/detail/AnswerPagerFragment$onViewCreated$3;-><init>(Lcom/zykj/student/dialogue/ui/detail/AnswerPagerFragment;Lkotlin/coroutines/Continuation;)V

    .line 152
    .line 153
    .line 154
    const/4 v11, 0x3

    .line 155
    const/4 v12, 0x0

    .line 156
    const/4 v9, 0x0

    .line 157
    invoke-static/range {v7 .. v12}, Lkotlinx/coroutines/BuildersKt;->launch$default(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/Job;

    .line 158
    .line 159
    .line 160
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->getViewLifecycleOwner()Landroidx/lifecycle/LifecycleOwner;

    .line 161
    .line 162
    .line 163
    move-result-object v1

    .line 164
    invoke-static {v1, v5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 165
    .line 166
    .line 167
    invoke-static {v1}, Landroidx/lifecycle/LifecycleOwnerKt;->getLifecycleScope(Landroidx/lifecycle/LifecycleOwner;)Landroidx/lifecycle/LifecycleCoroutineScope;

    .line 168
    .line 169
    .line 170
    move-result-object v6

    .line 171
    new-instance v9, Lcom/zykj/student/dialogue/ui/detail/AnswerPagerFragment$onViewCreated$4;

    .line 172
    .line 173
    invoke-direct {v9, v0, v3}, Lcom/zykj/student/dialogue/ui/detail/AnswerPagerFragment$onViewCreated$4;-><init>(Lcom/zykj/student/dialogue/ui/detail/AnswerPagerFragment;Lkotlin/coroutines/Continuation;)V

    .line 174
    .line 175
    .line 176
    const/4 v10, 0x3

    .line 177
    const/4 v11, 0x0

    .line 178
    const/4 v7, 0x0

    .line 179
    invoke-static/range {v6 .. v11}, Lkotlinx/coroutines/BuildersKt;->launch$default(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/Job;

    .line 180
    .line 181
    .line 182
    iget-object v1, v0, Lcom/zykj/student/dialogue/ui/detail/AnswerPagerFragment;->f:Lcom/zykj/student/dialogue/databinding/DialogueFragmentAnswerPagerBinding;

    .line 183
    .line 184
    if-nez v1, :cond_3

    .line 185
    .line 186
    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 187
    .line 188
    .line 189
    move-object v1, v3

    .line 190
    :cond_3
    iget-object v1, v1, Lcom/zykj/student/dialogue/databinding/DialogueFragmentAnswerPagerBinding;->f:Landroid/widget/LinearLayout;

    .line 191
    .line 192
    const-string v5, "llLoadError"

    .line 193
    .line 194
    invoke-static {v1, v5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 195
    .line 196
    .line 197
    new-instance v5, Lo6/g;

    .line 198
    .line 199
    invoke-direct {v5, v0}, Lo6/g;-><init>(Lcom/zykj/student/dialogue/ui/detail/AnswerPagerFragment;)V

    .line 200
    .line 201
    .line 202
    invoke-static {v1, v5}, Li6/b;->h(Landroid/view/View;Lkotlin/jvm/functions/Function1;)V

    .line 203
    .line 204
    .line 205
    iget-object v1, v0, Lcom/zykj/student/dialogue/ui/detail/AnswerPagerFragment;->f:Lcom/zykj/student/dialogue/databinding/DialogueFragmentAnswerPagerBinding;

    .line 206
    .line 207
    if-nez v1, :cond_4

    .line 208
    .line 209
    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 210
    .line 211
    .line 212
    move-object v1, v3

    .line 213
    :cond_4
    iget-object v1, v1, Lcom/zykj/student/dialogue/databinding/DialogueFragmentAnswerPagerBinding;->c:Landroid/widget/ImageView;

    .line 214
    .line 215
    invoke-static {v1, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 216
    .line 217
    .line 218
    new-instance v4, Lo6/h;

    .line 219
    .line 220
    invoke-direct {v4, v0}, Lo6/h;-><init>(Lcom/zykj/student/dialogue/ui/detail/AnswerPagerFragment;)V

    .line 221
    .line 222
    .line 223
    invoke-static {v1, v4}, Li6/b;->h(Landroid/view/View;Lkotlin/jvm/functions/Function1;)V

    .line 224
    .line 225
    .line 226
    iget-object v1, v0, Lcom/zykj/student/dialogue/ui/detail/AnswerPagerFragment;->f:Lcom/zykj/student/dialogue/databinding/DialogueFragmentAnswerPagerBinding;

    .line 227
    .line 228
    if-nez v1, :cond_5

    .line 229
    .line 230
    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 231
    .line 232
    .line 233
    move-object v1, v3

    .line 234
    :cond_5
    iget-object v1, v1, Lcom/zykj/student/dialogue/databinding/DialogueFragmentAnswerPagerBinding;->e:Landroid/widget/ImageView;

    .line 235
    .line 236
    const-string v4, "ivStart"

    .line 237
    .line 238
    invoke-static {v1, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 239
    .line 240
    .line 241
    new-instance v4, Lo6/i;

    .line 242
    .line 243
    invoke-direct {v4, v0}, Lo6/i;-><init>(Lcom/zykj/student/dialogue/ui/detail/AnswerPagerFragment;)V

    .line 244
    .line 245
    .line 246
    invoke-static {v1, v4}, Li6/b;->h(Landroid/view/View;Lkotlin/jvm/functions/Function1;)V

    .line 247
    .line 248
    .line 249
    iget-object v1, v0, Lcom/zykj/student/dialogue/ui/detail/AnswerPagerFragment;->f:Lcom/zykj/student/dialogue/databinding/DialogueFragmentAnswerPagerBinding;

    .line 250
    .line 251
    if-nez v1, :cond_6

    .line 252
    .line 253
    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 254
    .line 255
    .line 256
    move-object v1, v3

    .line 257
    :cond_6
    iget-object v1, v1, Lcom/zykj/student/dialogue/databinding/DialogueFragmentAnswerPagerBinding;->d:Landroid/widget/ImageView;

    .line 258
    .line 259
    const-string v4, "ivFullscreen"

    .line 260
    .line 261
    invoke-static {v1, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 262
    .line 263
    .line 264
    new-instance v4, Lo6/j;

    .line 265
    .line 266
    invoke-direct {v4, v0}, Lo6/j;-><init>(Lcom/zykj/student/dialogue/ui/detail/AnswerPagerFragment;)V

    .line 267
    .line 268
    .line 269
    invoke-static {v1, v4}, Li6/b;->h(Landroid/view/View;Lkotlin/jvm/functions/Function1;)V

    .line 270
    .line 271
    .line 272
    iget-object v1, v0, Lcom/zykj/student/dialogue/ui/detail/AnswerPagerFragment;->f:Lcom/zykj/student/dialogue/databinding/DialogueFragmentAnswerPagerBinding;

    .line 273
    .line 274
    if-nez v1, :cond_7

    .line 275
    .line 276
    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 277
    .line 278
    .line 279
    goto :goto_1

    .line 280
    :cond_7
    move-object v3, v1

    .line 281
    :goto_1
    iget-object v1, v3, Lcom/zykj/student/dialogue/databinding/DialogueFragmentAnswerPagerBinding;->g:Lcom/xuexiang/xui/widget/imageview/photoview/PhotoView;

    .line 282
    .line 283
    new-instance v2, Lo6/k;

    .line 284
    .line 285
    invoke-direct {v2, v0}, Lo6/k;-><init>(Lcom/zykj/student/dialogue/ui/detail/AnswerPagerFragment;)V

    .line 286
    .line 287
    .line 288
    invoke-virtual {v1, v2}, Lcom/xuexiang/xui/widget/imageview/photoview/PhotoView;->setOnViewTapListener(Lcom/xuexiang/xui/widget/imageview/photoview/c$i;)V

    .line 289
    .line 290
    .line 291
    return-void
.end method
