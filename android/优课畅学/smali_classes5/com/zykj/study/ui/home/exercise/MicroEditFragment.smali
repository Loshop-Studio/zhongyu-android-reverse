.class public final Lcom/zykj/study/ui/home/exercise/MicroEditFragment;
.super Lcom/zykj/study/ui/home/exercise/Hilt_MicroEditFragment;
.source "SourceFile"


# annotations
.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x0
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/zykj/study/ui/home/exercise/MicroEditFragment$a;,
        Lcom/zykj/study/ui/home/exercise/MicroEditFragment$b;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/zykj/study/ui/home/exercise/Hilt_MicroEditFragment<",
        "Lcom/zykj/study/databinding/FragmentMicroEditBinding;",
        ">;"
    }
.end annotation


# static fields
.field public static final n:Lcom/zykj/study/ui/home/exercise/MicroEditFragment$a;

.field public static final o:I


# instance fields
.field public final f:Landroidx/navigation/NavArgsLazy;

.field public final g:Lh7/d;

.field public final h:Lh7/d;

.field public i:Lp4/s;

.field public j:Lcom/zykj/view/board/board/BoardFragment;

.field public final k:Landroidx/activity/result/ActivityResultLauncher;

.field public final l:La6/l;

.field public m:Lcom/zykj/study/ui/home/exercise/MicroCropExtraFragment;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/zykj/study/ui/home/exercise/MicroEditFragment$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/zykj/study/ui/home/exercise/MicroEditFragment$a;-><init>(Lkotlin/jvm/internal/n;)V

    sput-object v0, Lcom/zykj/study/ui/home/exercise/MicroEditFragment;->n:Lcom/zykj/study/ui/home/exercise/MicroEditFragment$a;

    const/16 v0, 0x8

    sput v0, Lcom/zykj/study/ui/home/exercise/MicroEditFragment;->o:I

    return-void
.end method

.method public constructor <init>()V
    .locals 6

    .line 1
    invoke-direct {p0}, Lcom/zykj/study/ui/home/exercise/Hilt_MicroEditFragment;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Landroidx/navigation/NavArgsLazy;

    .line 5
    .line 6
    const-class v1, Lcom/zykj/study/ui/home/exercise/MicroEditFragmentArgs;

    .line 7
    .line 8
    invoke-static {v1}, Lkotlin/jvm/internal/y;->b(Ljava/lang/Class;)Le8/c;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    new-instance v2, Lcom/zykj/study/ui/home/exercise/MicroEditFragment$d;

    .line 13
    .line 14
    invoke-direct {v2, p0}, Lcom/zykj/study/ui/home/exercise/MicroEditFragment$d;-><init>(Landroidx/fragment/app/Fragment;)V

    .line 15
    .line 16
    .line 17
    invoke-direct {v0, v1, v2}, Landroidx/navigation/NavArgsLazy;-><init>(Le8/c;Lx7/a;)V

    .line 18
    .line 19
    .line 20
    iput-object v0, p0, Lcom/zykj/study/ui/home/exercise/MicroEditFragment;->f:Landroidx/navigation/NavArgsLazy;

    .line 21
    .line 22
    new-instance v0, Lcom/zykj/study/ui/home/exercise/MicroEditFragment$special$$inlined$viewModels$default$1;

    .line 23
    .line 24
    invoke-direct {v0, p0}, Lcom/zykj/study/ui/home/exercise/MicroEditFragment$special$$inlined$viewModels$default$1;-><init>(Landroidx/fragment/app/Fragment;)V

    .line 25
    .line 26
    .line 27
    sget-object v1, Lkotlin/LazyThreadSafetyMode;->c:Lkotlin/LazyThreadSafetyMode;

    .line 28
    .line 29
    new-instance v2, Lcom/zykj/study/ui/home/exercise/MicroEditFragment$special$$inlined$viewModels$default$2;

    .line 30
    .line 31
    invoke-direct {v2, v0}, Lcom/zykj/study/ui/home/exercise/MicroEditFragment$special$$inlined$viewModels$default$2;-><init>(Lx7/a;)V

    .line 32
    .line 33
    .line 34
    invoke-static {v1, v2}, Lkotlin/a;->a(Lkotlin/LazyThreadSafetyMode;Lx7/a;)Lh7/d;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    const-class v1, Lcom/zykj/study/viewmodels/OssTokenViewModel;

    .line 39
    .line 40
    invoke-static {v1}, Lkotlin/jvm/internal/y;->b(Ljava/lang/Class;)Le8/c;

    .line 41
    .line 42
    .line 43
    move-result-object v1

    .line 44
    new-instance v2, Lcom/zykj/study/ui/home/exercise/MicroEditFragment$special$$inlined$viewModels$default$3;

    .line 45
    .line 46
    invoke-direct {v2, v0}, Lcom/zykj/study/ui/home/exercise/MicroEditFragment$special$$inlined$viewModels$default$3;-><init>(Lh7/d;)V

    .line 47
    .line 48
    .line 49
    new-instance v3, Lcom/zykj/study/ui/home/exercise/MicroEditFragment$special$$inlined$viewModels$default$4;

    .line 50
    .line 51
    const/4 v4, 0x0

    .line 52
    invoke-direct {v3, v4, v0}, Lcom/zykj/study/ui/home/exercise/MicroEditFragment$special$$inlined$viewModels$default$4;-><init>(Lx7/a;Lh7/d;)V

    .line 53
    .line 54
    .line 55
    new-instance v5, Lcom/zykj/study/ui/home/exercise/MicroEditFragment$special$$inlined$viewModels$default$5;

    .line 56
    .line 57
    invoke-direct {v5, p0, v0}, Lcom/zykj/study/ui/home/exercise/MicroEditFragment$special$$inlined$viewModels$default$5;-><init>(Landroidx/fragment/app/Fragment;Lh7/d;)V

    .line 58
    .line 59
    .line 60
    invoke-static {p0, v1, v2, v3, v5}, Landroidx/fragment/app/FragmentViewModelLazyKt;->createViewModelLazy(Landroidx/fragment/app/Fragment;Le8/c;Lx7/a;Lx7/a;Lx7/a;)Lh7/d;

    .line 61
    .line 62
    .line 63
    move-result-object v0

    .line 64
    iput-object v0, p0, Lcom/zykj/study/ui/home/exercise/MicroEditFragment;->g:Lh7/d;

    .line 65
    .line 66
    const-class v0, Lcom/zykj/study/viewmodels/MicroEditViewModel;

    .line 67
    .line 68
    invoke-static {v0}, Lkotlin/jvm/internal/y;->b(Ljava/lang/Class;)Le8/c;

    .line 69
    .line 70
    .line 71
    move-result-object v0

    .line 72
    new-instance v1, Lcom/zykj/study/ui/home/exercise/MicroEditFragment$special$$inlined$activityViewModels$default$1;

    .line 73
    .line 74
    invoke-direct {v1, p0}, Lcom/zykj/study/ui/home/exercise/MicroEditFragment$special$$inlined$activityViewModels$default$1;-><init>(Landroidx/fragment/app/Fragment;)V

    .line 75
    .line 76
    .line 77
    new-instance v2, Lcom/zykj/study/ui/home/exercise/MicroEditFragment$special$$inlined$activityViewModels$default$2;

    .line 78
    .line 79
    invoke-direct {v2, v4, p0}, Lcom/zykj/study/ui/home/exercise/MicroEditFragment$special$$inlined$activityViewModels$default$2;-><init>(Lx7/a;Landroidx/fragment/app/Fragment;)V

    .line 80
    .line 81
    .line 82
    new-instance v3, Lcom/zykj/study/ui/home/exercise/MicroEditFragment$special$$inlined$activityViewModels$default$3;

    .line 83
    .line 84
    invoke-direct {v3, p0}, Lcom/zykj/study/ui/home/exercise/MicroEditFragment$special$$inlined$activityViewModels$default$3;-><init>(Landroidx/fragment/app/Fragment;)V

    .line 85
    .line 86
    .line 87
    invoke-static {p0, v0, v1, v2, v3}, Landroidx/fragment/app/FragmentViewModelLazyKt;->createViewModelLazy(Landroidx/fragment/app/Fragment;Le8/c;Lx7/a;Lx7/a;Lx7/a;)Lh7/d;

    .line 88
    .line 89
    .line 90
    move-result-object v0

    .line 91
    iput-object v0, p0, Lcom/zykj/study/ui/home/exercise/MicroEditFragment;->h:Lh7/d;

    .line 92
    .line 93
    new-instance v0, Landroidx/activity/result/contract/ActivityResultContracts$RequestPermission;

    .line 94
    .line 95
    invoke-direct {v0}, Landroidx/activity/result/contract/ActivityResultContracts$RequestPermission;-><init>()V

    .line 96
    .line 97
    .line 98
    new-instance v1, Lw4/g1;

    .line 99
    .line 100
    invoke-direct {v1}, Lw4/g1;-><init>()V

    .line 101
    .line 102
    .line 103
    invoke-virtual {p0, v0, v1}, Landroidx/fragment/app/Fragment;->registerForActivityResult(Landroidx/activity/result/contract/ActivityResultContract;Landroidx/activity/result/ActivityResultCallback;)Landroidx/activity/result/ActivityResultLauncher;

    .line 104
    .line 105
    .line 106
    move-result-object v0

    .line 107
    const-string v1, "registerForActivityResult(...)"

    .line 108
    .line 109
    invoke-static {v0, v1}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 110
    .line 111
    .line 112
    iput-object v0, p0, Lcom/zykj/study/ui/home/exercise/MicroEditFragment;->k:Landroidx/activity/result/ActivityResultLauncher;

    .line 113
    .line 114
    new-instance v0, La6/l;

    .line 115
    .line 116
    const/4 v1, 0x2

    .line 117
    invoke-direct {v0, p0, v4, v1, v4}, La6/l;-><init>(Landroidx/fragment/app/Fragment;Landroidx/activity/ComponentActivity;ILkotlin/jvm/internal/n;)V

    .line 118
    .line 119
    .line 120
    iput-object v0, p0, Lcom/zykj/study/ui/home/exercise/MicroEditFragment;->l:La6/l;

    .line 121
    .line 122
    return-void
.end method

.method public static final D(Lcom/zykj/study/ui/home/exercise/MicroEditFragment;Lm1/c;Lm1/a;I)V
    .locals 0

    .line 1
    const-string p1, "<unused var>"

    .line 2
    .line 3
    invoke-static {p2, p1}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Lcom/zykj/study/ui/home/exercise/MicroEditFragment;->K()V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public static final E(Lcom/zykj/study/ui/home/exercise/MicroEditFragment;Ljava/lang/String;Landroid/os/Bundle;)Lh7/p;
    .locals 1

    .line 1
    const-string v0, "<unused var>"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string p1, "bundle"

    .line 7
    .line 8
    invoke-static {p2, p1}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string p1, "RESULT_KEY_ACTION"

    .line 12
    .line 13
    invoke-virtual {p2, p1}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    if-eqz p1, :cond_1

    .line 18
    .line 19
    invoke-virtual {p1}, Ljava/lang/String;->hashCode()I

    .line 20
    .line 21
    .line 22
    move-result p2

    .line 23
    const v0, -0x3a52d697

    .line 24
    .line 25
    .line 26
    if-eq p2, v0, :cond_0

    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_0
    const-string p2, "RESULT_VALUE_ACTION_CROP"

    .line 30
    .line 31
    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 32
    .line 33
    .line 34
    move-result p1

    .line 35
    if-eqz p1, :cond_1

    .line 36
    .line 37
    sget-object p1, Lcom/zykj/blackboard/utils/BoardBox;->INSTANCE:Lcom/zykj/blackboard/utils/BoardBox;

    .line 38
    .line 39
    invoke-virtual {p0}, Lcom/zykj/study/ui/home/exercise/MicroEditFragment;->z()Lcom/zykj/study/ui/home/exercise/MicroEditFragmentArgs;

    .line 40
    .line 41
    .line 42
    move-result-object p2

    .line 43
    invoke-virtual {p2}, Lcom/zykj/study/ui/home/exercise/MicroEditFragmentArgs;->b()Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object p2

    .line 47
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->requireContext()Landroid/content/Context;

    .line 48
    .line 49
    .line 50
    move-result-object p0

    .line 51
    invoke-virtual {p1, p2, p0}, Lcom/zykj/blackboard/utils/BoardBox;->clearLocalData(Ljava/lang/String;Landroid/content/Context;)V

    .line 52
    .line 53
    .line 54
    :cond_1
    :goto_0
    sget-object p0, Lh7/p;->a:Lh7/p;

    .line 55
    .line 56
    return-object p0
.end method

.method public static final F(Lcom/zykj/study/ui/home/exercise/MicroEditFragment;Landroid/view/View;)Lh7/p;
    .locals 1

    .line 1
    const-string v0, "it"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-static {p0}, Landroidx/navigation/fragment/FragmentKt;->findNavController(Landroidx/fragment/app/Fragment;)Landroidx/navigation/NavController;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    invoke-virtual {p0}, Landroidx/navigation/NavController;->navigateUp()Z

    .line 11
    .line 12
    .line 13
    sget-object p0, Lh7/p;->a:Lh7/p;

    .line 14
    .line 15
    return-object p0
.end method

.method public static final G(Lcom/zykj/study/ui/home/exercise/MicroEditFragment;Ljava/lang/String;)Lh7/p;
    .locals 1

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    sget-object p0, Lh7/p;->a:Lh7/p;

    .line 4
    .line 5
    return-object p0

    .line 6
    :cond_0
    invoke-static {p0}, Landroidx/navigation/fragment/FragmentKt;->findNavController(Landroidx/fragment/app/Fragment;)Landroidx/navigation/NavController;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    sget-object v0, Lcom/zykj/study/ui/home/exercise/i;->a:Lcom/zykj/study/ui/home/exercise/i$c;

    .line 11
    .line 12
    invoke-virtual {v0, p1}, Lcom/zykj/study/ui/home/exercise/i$c;->b(Ljava/lang/String;)Landroidx/navigation/NavDirections;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    invoke-virtual {p0, p1}, Landroidx/navigation/NavController;->navigate(Landroidx/navigation/NavDirections;)V

    .line 17
    .line 18
    .line 19
    sget-object p0, Lh7/p;->a:Lh7/p;

    .line 20
    .line 21
    return-object p0
.end method

.method public static final H(Lcom/zykj/study/ui/home/exercise/MicroEditFragment;Ljava/lang/String;)Lh7/p;
    .locals 2

    .line 1
    invoke-static {p0}, Landroidx/navigation/fragment/FragmentKt;->findNavController(Landroidx/fragment/app/Fragment;)Landroidx/navigation/NavController;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    sget-object v0, Lcom/zykj/study/ui/home/exercise/i;->a:Lcom/zykj/study/ui/home/exercise/i$c;

    .line 6
    .line 7
    invoke-virtual {p0}, Lcom/zykj/study/ui/home/exercise/MicroEditFragment;->z()Lcom/zykj/study/ui/home/exercise/MicroEditFragmentArgs;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    invoke-virtual {p0}, Lcom/zykj/study/ui/home/exercise/MicroEditFragmentArgs;->b()Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    const-string v1, "REQUEST_KEY_CROP"

    .line 16
    .line 17
    invoke-virtual {v0, v1, p0}, Lcom/zykj/study/ui/home/exercise/i$c;->a(Ljava/lang/String;Ljava/lang/String;)Landroidx/navigation/NavDirections;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    invoke-virtual {p1, p0}, Landroidx/navigation/NavController;->navigate(Landroidx/navigation/NavDirections;)V

    .line 22
    .line 23
    .line 24
    sget-object p0, Lh7/p;->a:Lh7/p;

    .line 25
    .line 26
    return-object p0
.end method

.method public static final I(Lcom/zykj/study/ui/home/exercise/MicroEditFragment;Landroid/view/View;)V
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/zykj/study/ui/home/exercise/MicroEditFragment;->i:Lp4/s;

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0, p1}, Lp4/s;->v(Landroid/view/View;)V

    .line 6
    .line 7
    .line 8
    :cond_0
    return-void
.end method

.method public static final J(Ljava/lang/Boolean;)V
    .locals 1

    .line 1
    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

.method public static final L(Lcom/zykj/study/ui/home/exercise/MicroEditFragment;Ljava/io/File;)Lh7/p;
    .locals 2

    .line 1
    const-string v0, "file"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/zykj/study/ui/home/exercise/MicroEditFragment;->l:La6/l;

    .line 7
    .line 8
    invoke-static {p1}, Lcom/blankj/utilcode/util/g0;->b(Ljava/io/File;)Landroid/net/Uri;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    const-string v1, "file2Uri(...)"

    .line 13
    .line 14
    invoke-static {p1, v1}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    new-instance v1, Lw4/s1;

    .line 18
    .line 19
    invoke-direct {v1, p0}, Lw4/s1;-><init>(Lcom/zykj/study/ui/home/exercise/MicroEditFragment;)V

    .line 20
    .line 21
    .line 22
    invoke-virtual {v0, p1, v1}, La6/l;->r(Landroid/net/Uri;Lx7/l;)V

    .line 23
    .line 24
    .line 25
    invoke-virtual {p0}, Lcom/zykj/study/ui/home/exercise/MicroEditFragment;->C()V

    .line 26
    .line 27
    .line 28
    sget-object p0, Lh7/p;->a:Lh7/p;

    .line 29
    .line 30
    return-object p0
.end method

.method public static final M(Lcom/zykj/study/ui/home/exercise/MicroEditFragment;Landroid/net/Uri;)Lh7/p;
    .locals 8

    .line 1
    iget-object v0, p0, Lcom/zykj/study/ui/home/exercise/MicroEditFragment;->j:Lcom/zykj/view/board/board/BoardFragment;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-static {p1}, Lcom/blankj/utilcode/util/g0;->e(Landroid/net/Uri;)Ljava/io/File;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    invoke-virtual {p0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v2

    .line 13
    const/16 v6, 0x1d

    .line 14
    .line 15
    const/4 v7, 0x0

    .line 16
    const/4 v1, 0x0

    .line 17
    const/4 v3, 0x0

    .line 18
    const/4 v4, 0x0

    .line 19
    const/4 v5, 0x0

    .line 20
    invoke-static/range {v0 .. v7}, Lcom/zykj/view/board/board/BoardFragment;->k0(Lcom/zykj/view/board/board/BoardFragment;Landroid/graphics/Bitmap;Ljava/lang/String;Ljava/lang/String;ZLx7/l;ILjava/lang/Object;)V

    .line 21
    .line 22
    .line 23
    :cond_0
    sget-object p0, Lh7/p;->a:Lh7/p;

    .line 24
    .line 25
    return-object p0
.end method

.method public static final N(Lcom/zykj/study/ui/home/exercise/MicroEditFragment;)Lh7/p;
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/zykj/study/ui/home/exercise/MicroEditFragment;->C()V

    .line 2
    .line 3
    .line 4
    sget-object p0, Lh7/p;->a:Lh7/p;

    .line 5
    .line 6
    return-object p0
.end method

.method public static final Q(Landroidx/work/WorkManager;Landroidx/work/OneTimeWorkRequest;Landroid/content/DialogInterface;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Landroidx/work/WorkRequest;->getId()Ljava/util/UUID;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-virtual {p0, p1}, Landroidx/work/WorkManager;->cancelWorkById(Ljava/util/UUID;)Landroidx/work/Operation;

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public static final R(Landroidx/work/WorkManager;Landroidx/work/OneTimeWorkRequest;Lcom/zykj/study/ui/home/exercise/MicroEditFragment;Ljava/lang/String;Lcom/zykj/study/bean/OssData;Ljava/lang/String;Landroid/content/DialogInterface;)V
    .locals 6

    .line 1
    invoke-virtual {p1}, Landroidx/work/WorkRequest;->getId()Ljava/util/UUID;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-virtual {p0, p1}, Landroidx/work/WorkManager;->getWorkInfoByIdLiveData(Ljava/util/UUID;)Landroidx/lifecycle/LiveData;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    invoke-virtual {p2}, Landroidx/fragment/app/Fragment;->getViewLifecycleOwner()Landroidx/lifecycle/LifecycleOwner;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    new-instance v0, Lw4/j1;

    .line 14
    .line 15
    move-object v2, p2

    .line 16
    move-object v3, p3

    .line 17
    move-object v4, p4

    .line 18
    move-object v5, p5

    .line 19
    move-object v1, p6

    .line 20
    invoke-direct/range {v0 .. v5}, Lw4/j1;-><init>(Landroid/content/DialogInterface;Lcom/zykj/study/ui/home/exercise/MicroEditFragment;Ljava/lang/String;Lcom/zykj/study/bean/OssData;Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    new-instance p2, Lcom/zykj/study/ui/home/exercise/MicroEditFragment$c;

    .line 24
    .line 25
    invoke-direct {p2, v0}, Lcom/zykj/study/ui/home/exercise/MicroEditFragment$c;-><init>(Lx7/l;)V

    .line 26
    .line 27
    .line 28
    invoke-virtual {p0, p1, p2}, Landroidx/lifecycle/LiveData;->observe(Landroidx/lifecycle/LifecycleOwner;Landroidx/lifecycle/Observer;)V

    .line 29
    .line 30
    .line 31
    return-void
.end method

.method public static final S(Landroid/content/DialogInterface;Lcom/zykj/study/ui/home/exercise/MicroEditFragment;Ljava/lang/String;Lcom/zykj/study/bean/OssData;Ljava/lang/String;Landroidx/work/WorkInfo;)Lh7/p;
    .locals 2

    .line 1
    if-eqz p5, :cond_0

    .line 2
    .line 3
    invoke-virtual {p5}, Landroidx/work/WorkInfo;->getState()Landroidx/work/WorkInfo$State;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    goto :goto_0

    .line 8
    :cond_0
    const/4 v0, 0x0

    .line 9
    :goto_0
    if-nez v0, :cond_1

    .line 10
    .line 11
    const/4 v0, -0x1

    .line 12
    goto :goto_1

    .line 13
    :cond_1
    sget-object v1, Lcom/zykj/study/ui/home/exercise/MicroEditFragment$b;->a:[I

    .line 14
    .line 15
    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    aget v0, v1, v0

    .line 20
    .line 21
    :goto_1
    const/4 v1, 0x1

    .line 22
    if-eq v0, v1, :cond_4

    .line 23
    .line 24
    const/4 p1, 0x2

    .line 25
    const/4 p2, 0x0

    .line 26
    if-eq v0, p1, :cond_3

    .line 27
    .line 28
    if-nez p5, :cond_2

    .line 29
    .line 30
    sget-object p0, Lh7/p;->a:Lh7/p;

    .line 31
    .line 32
    return-object p0

    .line 33
    :cond_2
    const-string p1, "null cannot be cast to non-null type com.xuexiang.xui.widget.dialog.materialdialog.MaterialDialog"

    .line 34
    .line 35
    invoke-static {p0, p1}, Lkotlin/jvm/internal/u;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 36
    .line 37
    .line 38
    check-cast p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;

    .line 39
    .line 40
    invoke-virtual {p5}, Landroidx/work/WorkInfo;->getProgress()Landroidx/work/Data;

    .line 41
    .line 42
    .line 43
    move-result-object p1

    .line 44
    const-string p3, "progress"

    .line 45
    .line 46
    invoke-virtual {p1, p3, p2}, Landroidx/work/Data;->getInt(Ljava/lang/String;I)I

    .line 47
    .line 48
    .line 49
    move-result p1

    .line 50
    invoke-virtual {p0, p1}, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;->t(I)V

    .line 51
    .line 52
    .line 53
    goto :goto_2

    .line 54
    :cond_3
    invoke-virtual {p5}, Landroidx/work/WorkInfo;->getOutputData()Landroidx/work/Data;

    .line 55
    .line 56
    .line 57
    move-result-object p0

    .line 58
    const-string p1, "error_key"

    .line 59
    .line 60
    invoke-virtual {p0, p1, p2}, Landroidx/work/Data;->getInt(Ljava/lang/String;I)I

    .line 61
    .line 62
    .line 63
    move-result p0

    .line 64
    sget-object p1, Lcom/zykj/lib/error/code/ErrorCodeHandler;->INSTANCE:Lcom/zykj/lib/error/code/ErrorCodeHandler;

    .line 65
    .line 66
    invoke-virtual {p1, p0}, Lcom/zykj/lib/error/code/ErrorCodeHandler;->getErrorCode(I)Lcom/zykj/lib/error/code/ErrorCode;

    .line 67
    .line 68
    .line 69
    move-result-object p0

    .line 70
    invoke-virtual {p0}, Lcom/zykj/lib/error/code/ErrorCode;->getErrorCodeInfo()Lcom/zykj/lib/error/code/ErrorCodeInfo;

    .line 71
    .line 72
    .line 73
    move-result-object p0

    .line 74
    invoke-virtual {p0}, Lcom/zykj/lib/error/code/ErrorCodeInfo;->getMessageResId()Ljava/lang/Integer;

    .line 75
    .line 76
    .line 77
    move-result-object p0

    .line 78
    if-eqz p0, :cond_5

    .line 79
    .line 80
    invoke-virtual {p0}, Ljava/lang/Number;->intValue()I

    .line 81
    .line 82
    .line 83
    move-result p0

    .line 84
    sget-object p1, Lcom/zykj/base/utils/XToastUtils;->INSTANCE:Lcom/zykj/base/utils/XToastUtils;

    .line 85
    .line 86
    invoke-static {p1, p0}, Le5/o;->c(Lcom/zykj/base/utils/XToastUtils;I)V

    .line 87
    .line 88
    .line 89
    goto :goto_2

    .line 90
    :cond_4
    invoke-interface {p0}, Landroid/content/DialogInterface;->dismiss()V

    .line 91
    .line 92
    .line 93
    invoke-virtual {p5}, Landroidx/work/WorkInfo;->getOutputData()Landroidx/work/Data;

    .line 94
    .line 95
    .line 96
    move-result-object p0

    .line 97
    const-string p5, "success_key"

    .line 98
    .line 99
    invoke-virtual {p0, p5}, Landroidx/work/Data;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 100
    .line 101
    .line 102
    move-result-object p0

    .line 103
    if-eqz p0, :cond_5

    .line 104
    .line 105
    invoke-virtual {p1, p2, p0, p3, p4}, Lcom/zykj/study/ui/home/exercise/MicroEditFragment;->T(Ljava/lang/String;Ljava/lang/String;Lcom/zykj/study/bean/OssData;Ljava/lang/String;)V

    .line 106
    .line 107
    .line 108
    :cond_5
    :goto_2
    sget-object p0, Lh7/p;->a:Lh7/p;

    .line 109
    .line 110
    return-object p0
.end method

.method public static synthetic g(Lcom/zykj/study/ui/home/exercise/MicroEditFragment;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/zykj/study/ui/home/exercise/MicroEditFragment;->I(Lcom/zykj/study/ui/home/exercise/MicroEditFragment;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic h(Landroid/content/DialogInterface;Lcom/zykj/study/ui/home/exercise/MicroEditFragment;Ljava/lang/String;Lcom/zykj/study/bean/OssData;Ljava/lang/String;Landroidx/work/WorkInfo;)Lh7/p;
    .locals 0

    .line 1
    invoke-static/range {p0 .. p5}, Lcom/zykj/study/ui/home/exercise/MicroEditFragment;->S(Landroid/content/DialogInterface;Lcom/zykj/study/ui/home/exercise/MicroEditFragment;Ljava/lang/String;Lcom/zykj/study/bean/OssData;Ljava/lang/String;Landroidx/work/WorkInfo;)Lh7/p;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic i(Ljava/lang/Boolean;)V
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/zykj/study/ui/home/exercise/MicroEditFragment;->J(Ljava/lang/Boolean;)V

    return-void
.end method

.method public static synthetic j(Lcom/zykj/study/ui/home/exercise/MicroEditFragment;Ljava/lang/String;Landroid/os/Bundle;)Lh7/p;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lcom/zykj/study/ui/home/exercise/MicroEditFragment;->E(Lcom/zykj/study/ui/home/exercise/MicroEditFragment;Ljava/lang/String;Landroid/os/Bundle;)Lh7/p;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic k(Lcom/zykj/study/ui/home/exercise/MicroEditFragment;Ljava/lang/String;)Lh7/p;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/zykj/study/ui/home/exercise/MicroEditFragment;->G(Lcom/zykj/study/ui/home/exercise/MicroEditFragment;Ljava/lang/String;)Lh7/p;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic l(Landroidx/work/WorkManager;Landroidx/work/OneTimeWorkRequest;Lcom/zykj/study/ui/home/exercise/MicroEditFragment;Ljava/lang/String;Lcom/zykj/study/bean/OssData;Ljava/lang/String;Landroid/content/DialogInterface;)V
    .locals 0

    .line 1
    invoke-static/range {p0 .. p6}, Lcom/zykj/study/ui/home/exercise/MicroEditFragment;->R(Landroidx/work/WorkManager;Landroidx/work/OneTimeWorkRequest;Lcom/zykj/study/ui/home/exercise/MicroEditFragment;Ljava/lang/String;Lcom/zykj/study/bean/OssData;Ljava/lang/String;Landroid/content/DialogInterface;)V

    return-void
.end method

.method public static synthetic m(Lcom/zykj/study/ui/home/exercise/MicroEditFragment;)Lh7/p;
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/zykj/study/ui/home/exercise/MicroEditFragment;->N(Lcom/zykj/study/ui/home/exercise/MicroEditFragment;)Lh7/p;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic n(Lcom/zykj/study/ui/home/exercise/MicroEditFragment;Landroid/view/View;)Lh7/p;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/zykj/study/ui/home/exercise/MicroEditFragment;->F(Lcom/zykj/study/ui/home/exercise/MicroEditFragment;Landroid/view/View;)Lh7/p;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic o(Lcom/zykj/study/ui/home/exercise/MicroEditFragment;Ljava/io/File;)Lh7/p;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/zykj/study/ui/home/exercise/MicroEditFragment;->L(Lcom/zykj/study/ui/home/exercise/MicroEditFragment;Ljava/io/File;)Lh7/p;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic p(Lcom/zykj/study/ui/home/exercise/MicroEditFragment;Landroid/net/Uri;)Lh7/p;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/zykj/study/ui/home/exercise/MicroEditFragment;->M(Lcom/zykj/study/ui/home/exercise/MicroEditFragment;Landroid/net/Uri;)Lh7/p;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic q(Landroidx/work/WorkManager;Landroidx/work/OneTimeWorkRequest;Landroid/content/DialogInterface;)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lcom/zykj/study/ui/home/exercise/MicroEditFragment;->Q(Landroidx/work/WorkManager;Landroidx/work/OneTimeWorkRequest;Landroid/content/DialogInterface;)V

    return-void
.end method

.method public static synthetic r(Lcom/zykj/study/ui/home/exercise/MicroEditFragment;Lm1/c;Lm1/a;I)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2, p3}, Lcom/zykj/study/ui/home/exercise/MicroEditFragment;->D(Lcom/zykj/study/ui/home/exercise/MicroEditFragment;Lm1/c;Lm1/a;I)V

    return-void
.end method

.method public static synthetic s(Lcom/zykj/study/ui/home/exercise/MicroEditFragment;Ljava/lang/String;)Lh7/p;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/zykj/study/ui/home/exercise/MicroEditFragment;->H(Lcom/zykj/study/ui/home/exercise/MicroEditFragment;Ljava/lang/String;)Lh7/p;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic t(Lcom/zykj/study/ui/home/exercise/MicroEditFragment;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcom/zykj/study/ui/home/exercise/MicroEditFragment;->y(Ljava/lang/String;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static final synthetic u(Lcom/zykj/study/ui/home/exercise/MicroEditFragment;)Lcom/zykj/study/ui/home/exercise/MicroEditFragmentArgs;
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/zykj/study/ui/home/exercise/MicroEditFragment;->z()Lcom/zykj/study/ui/home/exercise/MicroEditFragmentArgs;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static final synthetic v(Lcom/zykj/study/ui/home/exercise/MicroEditFragment;)Lcom/zykj/view/board/board/BoardFragment;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/zykj/study/ui/home/exercise/MicroEditFragment;->j:Lcom/zykj/view/board/board/BoardFragment;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic w(Lcom/zykj/study/ui/home/exercise/MicroEditFragment;)Lcom/zykj/study/viewmodels/MicroEditViewModel;
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/zykj/study/ui/home/exercise/MicroEditFragment;->A()Lcom/zykj/study/viewmodels/MicroEditViewModel;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static final synthetic x(Lcom/zykj/study/ui/home/exercise/MicroEditFragment;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcom/zykj/study/ui/home/exercise/MicroEditFragment;->O(Ljava/lang/String;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public final A()Lcom/zykj/study/viewmodels/MicroEditViewModel;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/study/ui/home/exercise/MicroEditFragment;->h:Lh7/d;

    .line 2
    .line 3
    invoke-interface {v0}, Lh7/d;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lcom/zykj/study/viewmodels/MicroEditViewModel;

    .line 8
    .line 9
    return-object v0
.end method

.method public final B()Lcom/zykj/study/viewmodels/OssTokenViewModel;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/study/ui/home/exercise/MicroEditFragment;->g:Lh7/d;

    .line 2
    .line 3
    invoke-interface {v0}, Lh7/d;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lcom/zykj/study/viewmodels/OssTokenViewModel;

    .line 8
    .line 9
    return-object v0
.end method

.method public final C()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/zykj/study/ui/home/exercise/MicroEditFragment;->m:Lcom/zykj/study/ui/home/exercise/MicroCropExtraFragment;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getChildFragmentManager()Landroidx/fragment/app/FragmentManager;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-virtual {v1}, Landroidx/fragment/app/FragmentManager;->beginTransaction()Landroidx/fragment/app/FragmentTransaction;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    invoke-virtual {v1, v0}, Landroidx/fragment/app/FragmentTransaction;->remove(Landroidx/fragment/app/Fragment;)Landroidx/fragment/app/FragmentTransaction;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    invoke-virtual {v0}, Landroidx/fragment/app/FragmentTransaction;->commitAllowingStateLoss()I

    .line 18
    .line 19
    .line 20
    :cond_0
    return-void
.end method

.method public final K()V
    .locals 4

    .line 1
    new-instance v0, Lcom/zykj/study/ui/home/exercise/MicroCropExtraFragment;

    .line 2
    .line 3
    invoke-direct {v0}, Lcom/zykj/study/ui/home/exercise/MicroCropExtraFragment;-><init>()V

    .line 4
    .line 5
    .line 6
    new-instance v1, Lw4/q1;

    .line 7
    .line 8
    invoke-direct {v1, p0}, Lw4/q1;-><init>(Lcom/zykj/study/ui/home/exercise/MicroEditFragment;)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0, v1}, Lcom/zykj/study/ui/home/exercise/MicroCropExtraFragment;->r(Lx7/l;)V

    .line 12
    .line 13
    .line 14
    new-instance v1, Lw4/r1;

    .line 15
    .line 16
    invoke-direct {v1, p0}, Lw4/r1;-><init>(Lcom/zykj/study/ui/home/exercise/MicroEditFragment;)V

    .line 17
    .line 18
    .line 19
    invoke-virtual {v0, v1}, Lcom/zykj/study/ui/home/exercise/MicroCropExtraFragment;->q(Lx7/a;)V

    .line 20
    .line 21
    .line 22
    iput-object v0, p0, Lcom/zykj/study/ui/home/exercise/MicroEditFragment;->m:Lcom/zykj/study/ui/home/exercise/MicroCropExtraFragment;

    .line 23
    .line 24
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getChildFragmentManager()Landroidx/fragment/app/FragmentManager;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    invoke-virtual {v1}, Landroidx/fragment/app/FragmentManager;->beginTransaction()Landroidx/fragment/app/FragmentTransaction;

    .line 29
    .line 30
    .line 31
    move-result-object v1

    .line 32
    sget v2, Lcom/zykj/study/R$id;->fragment_crop:I

    .line 33
    .line 34
    const-string v3, "MicroCropExtraFragment"

    .line 35
    .line 36
    invoke-virtual {v1, v2, v0, v3}, Landroidx/fragment/app/FragmentTransaction;->replace(ILandroidx/fragment/app/Fragment;Ljava/lang/String;)Landroidx/fragment/app/FragmentTransaction;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    invoke-virtual {v0}, Landroidx/fragment/app/FragmentTransaction;->commitAllowingStateLoss()I

    .line 41
    .line 42
    .line 43
    return-void
.end method

.method public final O(Ljava/lang/String;)V
    .locals 8

    .line 1
    invoke-virtual {p0}, Lcom/zykj/study/ui/home/exercise/MicroEditFragment;->A()Lcom/zykj/study/viewmodels/MicroEditViewModel;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Lcom/zykj/base/BaseViewModel;->isDialogVisible()Lcom/kunminx/architecture/ui/callback/UnPeekLiveData;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 10
    .line 11
    invoke-virtual {v0, v1}, Lcom/kunminx/architecture/ui/callback/UnPeekLiveData;->postValue(Ljava/lang/Object;)V

    .line 12
    .line 13
    .line 14
    invoke-static {p0}, Landroidx/lifecycle/LifecycleOwnerKt;->getLifecycleScope(Landroidx/lifecycle/LifecycleOwner;)Landroidx/lifecycle/LifecycleCoroutineScope;

    .line 15
    .line 16
    .line 17
    move-result-object v2

    .line 18
    new-instance v5, Lcom/zykj/study/ui/home/exercise/MicroEditFragment$startUpload$1;

    .line 19
    .line 20
    const/4 v0, 0x0

    .line 21
    invoke-direct {v5, p1, p0, v0}, Lcom/zykj/study/ui/home/exercise/MicroEditFragment$startUpload$1;-><init>(Ljava/lang/String;Lcom/zykj/study/ui/home/exercise/MicroEditFragment;Lm7/c;)V

    .line 22
    .line 23
    .line 24
    const/4 v6, 0x3

    .line 25
    const/4 v7, 0x0

    .line 26
    const/4 v3, 0x0

    .line 27
    const/4 v4, 0x0

    .line 28
    invoke-static/range {v2 .. v7}, Li8/f;->d(Li8/b0;Lkotlin/coroutines/d;Lkotlinx/coroutines/CoroutineStart;Lx7/p;ILjava/lang/Object;)Lkotlinx/coroutines/n;

    .line 29
    .line 30
    .line 31
    return-void
.end method

.method public final P(Ljava/lang/String;Ljava/lang/String;Lm7/c;)Ljava/lang/Object;
    .locals 16

    .line 1
    move-object/from16 v3, p0

    .line 2
    .line 3
    move-object/from16 v0, p3

    .line 4
    .line 5
    instance-of v1, v0, Lcom/zykj/study/ui/home/exercise/MicroEditFragment$uploadMicro$1;

    .line 6
    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    move-object v1, v0

    .line 10
    check-cast v1, Lcom/zykj/study/ui/home/exercise/MicroEditFragment$uploadMicro$1;

    .line 11
    .line 12
    iget v2, v1, Lcom/zykj/study/ui/home/exercise/MicroEditFragment$uploadMicro$1;->e:I

    .line 13
    .line 14
    const/high16 v4, -0x80000000

    .line 15
    .line 16
    and-int v5, v2, v4

    .line 17
    .line 18
    if-eqz v5, :cond_0

    .line 19
    .line 20
    sub-int/2addr v2, v4

    .line 21
    iput v2, v1, Lcom/zykj/study/ui/home/exercise/MicroEditFragment$uploadMicro$1;->e:I

    .line 22
    .line 23
    :goto_0
    move-object v12, v1

    .line 24
    goto :goto_1

    .line 25
    :cond_0
    new-instance v1, Lcom/zykj/study/ui/home/exercise/MicroEditFragment$uploadMicro$1;

    .line 26
    .line 27
    invoke-direct {v1, v3, v0}, Lcom/zykj/study/ui/home/exercise/MicroEditFragment$uploadMicro$1;-><init>(Lcom/zykj/study/ui/home/exercise/MicroEditFragment;Lm7/c;)V

    .line 28
    .line 29
    .line 30
    goto :goto_0

    .line 31
    :goto_1
    iget-object v0, v12, Lcom/zykj/study/ui/home/exercise/MicroEditFragment$uploadMicro$1;->c:Ljava/lang/Object;

    .line 32
    .line 33
    invoke-static {}, Ln7/a;->f()Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object v1

    .line 37
    iget v2, v12, Lcom/zykj/study/ui/home/exercise/MicroEditFragment$uploadMicro$1;->e:I

    .line 38
    .line 39
    const/4 v15, 0x1

    .line 40
    if-eqz v2, :cond_2

    .line 41
    .line 42
    if-ne v2, v15, :cond_1

    .line 43
    .line 44
    iget-object v1, v12, Lcom/zykj/study/ui/home/exercise/MicroEditFragment$uploadMicro$1;->b:Ljava/lang/Object;

    .line 45
    .line 46
    check-cast v1, Ljava/lang/String;

    .line 47
    .line 48
    iget-object v2, v12, Lcom/zykj/study/ui/home/exercise/MicroEditFragment$uploadMicro$1;->a:Ljava/lang/Object;

    .line 49
    .line 50
    check-cast v2, Ljava/lang/String;

    .line 51
    .line 52
    invoke-static {v0}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 53
    .line 54
    .line 55
    move-object v4, v2

    .line 56
    goto :goto_2

    .line 57
    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 58
    .line 59
    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    .line 60
    .line 61
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 62
    .line 63
    .line 64
    throw v0

    .line 65
    :cond_2
    invoke-static {v0}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 66
    .line 67
    .line 68
    invoke-virtual {v3}, Lcom/zykj/study/ui/home/exercise/MicroEditFragment;->B()Lcom/zykj/study/viewmodels/OssTokenViewModel;

    .line 69
    .line 70
    .line 71
    move-result-object v4

    .line 72
    sget-object v5, Lcom/zykj/study/bean/OssFileType$Folder;->INSTANCE:Lcom/zykj/study/bean/OssFileType$Folder;

    .line 73
    .line 74
    sget-object v7, Lcom/zykj/study/bean/OssFileResource$Resource;->INSTANCE:Lcom/zykj/study/bean/OssFileResource$Resource;

    .line 75
    .line 76
    move-object/from16 v0, p1

    .line 77
    .line 78
    iput-object v0, v12, Lcom/zykj/study/ui/home/exercise/MicroEditFragment$uploadMicro$1;->a:Ljava/lang/Object;

    .line 79
    .line 80
    move-object/from16 v2, p2

    .line 81
    .line 82
    iput-object v2, v12, Lcom/zykj/study/ui/home/exercise/MicroEditFragment$uploadMicro$1;->b:Ljava/lang/Object;

    .line 83
    .line 84
    iput v15, v12, Lcom/zykj/study/ui/home/exercise/MicroEditFragment$uploadMicro$1;->e:I

    .line 85
    .line 86
    const/4 v6, 0x0

    .line 87
    const/4 v8, 0x0

    .line 88
    const/4 v9, 0x0

    .line 89
    const-wide/16 v10, 0x0

    .line 90
    .line 91
    const/16 v13, 0x3a

    .line 92
    .line 93
    const/4 v14, 0x0

    .line 94
    invoke-static/range {v4 .. v14}, Lcom/zykj/study/viewmodels/OssTokenViewModel;->b(Lcom/zykj/study/viewmodels/OssTokenViewModel;Lcom/zykj/study/bean/OssFileType;Ljava/lang/String;Lcom/zykj/study/bean/OssFileResource;Ljava/lang/String;Ljava/lang/String;JLm7/c;ILjava/lang/Object;)Ljava/lang/Object;

    .line 95
    .line 96
    .line 97
    move-result-object v4

    .line 98
    if-ne v4, v1, :cond_3

    .line 99
    .line 100
    return-object v1

    .line 101
    :cond_3
    move-object v1, v4

    .line 102
    move-object v4, v0

    .line 103
    move-object v0, v1

    .line 104
    move-object v1, v2

    .line 105
    :goto_2
    move-object v5, v0

    .line 106
    check-cast v5, Lcom/zykj/study/bean/OssData;

    .line 107
    .line 108
    if-nez v5, :cond_4

    .line 109
    .line 110
    sget-object v0, Lcom/zykj/base/utils/XToastUtils;->INSTANCE:Lcom/zykj/base/utils/XToastUtils;

    .line 111
    .line 112
    sget v1, Lcom/zykj/study/R$string;->lost_oss_token_please_wait:I

    .line 113
    .line 114
    invoke-static {v0, v1}, Le5/o;->c(Lcom/zykj/base/utils/XToastUtils;I)V

    .line 115
    .line 116
    .line 117
    sget-object v0, Lh7/p;->a:Lh7/p;

    .line 118
    .line 119
    return-object v0

    .line 120
    :cond_4
    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    .line 121
    .line 122
    .line 123
    move-result-object v0

    .line 124
    invoke-virtual {v0}, Ljava/util/UUID;->toString()Ljava/lang/String;

    .line 125
    .line 126
    .line 127
    move-result-object v6

    .line 128
    const-string v0, "toString(...)"

    .line 129
    .line 130
    invoke-static {v6, v0}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 131
    .line 132
    .line 133
    const/4 v10, 0x4

    .line 134
    const/4 v11, 0x0

    .line 135
    const-string v7, "-"

    .line 136
    .line 137
    const-string v8, ""

    .line 138
    .line 139
    const/4 v9, 0x0

    .line 140
    invoke-static/range {v6 .. v11}, Lg8/z;->I(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Ljava/lang/String;

    .line 141
    .line 142
    .line 143
    move-result-object v0

    .line 144
    new-instance v2, Ljava/lang/StringBuilder;

    .line 145
    .line 146
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 147
    .line 148
    .line 149
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 150
    .line 151
    .line 152
    const-string v0, "_6"

    .line 153
    .line 154
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 155
    .line 156
    .line 157
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 158
    .line 159
    .line 160
    move-result-object v6

    .line 161
    new-instance v0, Landroidx/work/OneTimeWorkRequest$Builder;

    .line 162
    .line 163
    const-class v2, Lcom/zykj/download/work/UploadFileOssWork;

    .line 164
    .line 165
    invoke-direct {v0, v2}, Landroidx/work/OneTimeWorkRequest$Builder;-><init>(Ljava/lang/Class;)V

    .line 166
    .line 167
    .line 168
    sget-object v2, Lcom/zykj/download/work/UploadFileOssWork;->Companion:Lcom/zykj/download/work/UploadFileOssWork$a;

    .line 169
    .line 170
    invoke-virtual {v5}, Lcom/zykj/study/bean/OssData;->getObjectKey()Ljava/lang/String;

    .line 171
    .line 172
    .line 173
    move-result-object v7

    .line 174
    new-instance v8, Ljava/lang/StringBuilder;

    .line 175
    .line 176
    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    .line 177
    .line 178
    .line 179
    invoke-virtual {v8, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 180
    .line 181
    .line 182
    const-string v7, "/"

    .line 183
    .line 184
    invoke-virtual {v8, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 185
    .line 186
    .line 187
    invoke-virtual {v8, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 188
    .line 189
    .line 190
    const-string v7, ".zip"

    .line 191
    .line 192
    invoke-virtual {v8, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 193
    .line 194
    .line 195
    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 196
    .line 197
    .line 198
    move-result-object v7

    .line 199
    invoke-virtual {v5}, Lcom/zykj/study/bean/OssData;->getOssToken()Lcom/zykj/download/OssToken;

    .line 200
    .line 201
    .line 202
    move-result-object v8

    .line 203
    invoke-virtual {v2, v1, v7, v8}, Lcom/zykj/download/work/UploadFileOssWork$a;->a(Ljava/lang/String;Ljava/lang/String;Lcom/zykj/download/OssToken;)Landroidx/work/Data;

    .line 204
    .line 205
    .line 206
    move-result-object v1

    .line 207
    invoke-virtual {v0, v1}, Landroidx/work/WorkRequest$Builder;->setInputData(Landroidx/work/Data;)Landroidx/work/WorkRequest$Builder;

    .line 208
    .line 209
    .line 210
    move-result-object v0

    .line 211
    check-cast v0, Landroidx/work/OneTimeWorkRequest$Builder;

    .line 212
    .line 213
    invoke-virtual {v0}, Landroidx/work/WorkRequest$Builder;->build()Landroidx/work/WorkRequest;

    .line 214
    .line 215
    .line 216
    move-result-object v0

    .line 217
    move-object v2, v0

    .line 218
    check-cast v2, Landroidx/work/OneTimeWorkRequest;

    .line 219
    .line 220
    sget-object v0, Landroidx/work/WorkManager;->Companion:Landroidx/work/WorkManager$Companion;

    .line 221
    .line 222
    invoke-virtual {v3}, Landroidx/fragment/app/Fragment;->requireContext()Landroid/content/Context;

    .line 223
    .line 224
    .line 225
    move-result-object v1

    .line 226
    const-string v7, "requireContext(...)"

    .line 227
    .line 228
    invoke-static {v1, v7}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 229
    .line 230
    .line 231
    invoke-virtual {v0, v1}, Landroidx/work/WorkManager$Companion;->getInstance(Landroid/content/Context;)Landroidx/work/WorkManager;

    .line 232
    .line 233
    .line 234
    move-result-object v1

    .line 235
    invoke-virtual {v1, v2}, Landroidx/work/WorkManager;->enqueue(Landroidx/work/WorkRequest;)Landroidx/work/Operation;

    .line 236
    .line 237
    .line 238
    new-instance v0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;

    .line 239
    .line 240
    invoke-virtual {v3}, Landroidx/fragment/app/Fragment;->requireContext()Landroid/content/Context;

    .line 241
    .line 242
    .line 243
    move-result-object v7

    .line 244
    invoke-direct {v0, v7}, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;-><init>(Landroid/content/Context;)V

    .line 245
    .line 246
    .line 247
    sget v7, Lcom/zykj/study/R$string;->upload_micro:I

    .line 248
    .line 249
    invoke-virtual {v3, v7}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    .line 250
    .line 251
    .line 252
    move-result-object v7

    .line 253
    invoke-virtual {v0, v7}, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;->j(Ljava/lang/CharSequence;)Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;

    .line 254
    .line 255
    .line 256
    move-result-object v0

    .line 257
    sget-object v7, Lcom/xuexiang/xui/widget/dialog/materialdialog/GravityEnum;->b:Lcom/xuexiang/xui/widget/dialog/materialdialog/GravityEnum;

    .line 258
    .line 259
    invoke-virtual {v0, v7}, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;->k(Lcom/xuexiang/xui/widget/dialog/materialdialog/GravityEnum;)Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;

    .line 260
    .line 261
    .line 262
    move-result-object v0

    .line 263
    const/4 v7, 0x0

    .line 264
    const/16 v8, 0x64

    .line 265
    .line 266
    invoke-virtual {v0, v7, v8, v15}, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;->C(ZIZ)Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;

    .line 267
    .line 268
    .line 269
    move-result-object v0

    .line 270
    new-instance v7, Lw4/h1;

    .line 271
    .line 272
    invoke-direct {v7, v1, v2}, Lw4/h1;-><init>(Landroidx/work/WorkManager;Landroidx/work/OneTimeWorkRequest;)V

    .line 273
    .line 274
    .line 275
    invoke-virtual {v0, v7}, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;->d(Landroid/content/DialogInterface$OnCancelListener;)Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;

    .line 276
    .line 277
    .line 278
    move-result-object v7

    .line 279
    new-instance v0, Lw4/i1;

    .line 280
    .line 281
    invoke-direct/range {v0 .. v6}, Lw4/i1;-><init>(Landroidx/work/WorkManager;Landroidx/work/OneTimeWorkRequest;Lcom/zykj/study/ui/home/exercise/MicroEditFragment;Ljava/lang/String;Lcom/zykj/study/bean/OssData;Ljava/lang/String;)V

    .line 282
    .line 283
    .line 284
    invoke-virtual {v7, v0}, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;->F(Landroid/content/DialogInterface$OnShowListener;)Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;

    .line 285
    .line 286
    .line 287
    move-result-object v0

    .line 288
    sget v1, Lcom/zykj/study/R$string;->cancel:I

    .line 289
    .line 290
    invoke-virtual {v0, v1}, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;->t(I)Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;

    .line 291
    .line 292
    .line 293
    move-result-object v0

    .line 294
    invoke-virtual {v0}, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;->E()Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;

    .line 295
    .line 296
    .line 297
    sget-object v0, Lh7/p;->a:Lh7/p;

    .line 298
    .line 299
    return-object v0
.end method

.method public final T(Ljava/lang/String;Ljava/lang/String;Lcom/zykj/study/bean/OssData;Ljava/lang/String;)V
    .locals 8

    .line 1
    invoke-static {p0}, Landroidx/lifecycle/LifecycleOwnerKt;->getLifecycleScope(Landroidx/lifecycle/LifecycleOwner;)Landroidx/lifecycle/LifecycleCoroutineScope;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    new-instance v1, Lcom/zykj/study/ui/home/exercise/MicroEditFragment$uploadMicroThumbnail$1;

    .line 6
    .line 7
    const/4 v7, 0x0

    .line 8
    move-object v5, p0

    .line 9
    move-object v2, p1

    .line 10
    move-object v6, p2

    .line 11
    move-object v3, p3

    .line 12
    move-object v4, p4

    .line 13
    invoke-direct/range {v1 .. v7}, Lcom/zykj/study/ui/home/exercise/MicroEditFragment$uploadMicroThumbnail$1;-><init>(Ljava/lang/String;Lcom/zykj/study/bean/OssData;Ljava/lang/String;Lcom/zykj/study/ui/home/exercise/MicroEditFragment;Ljava/lang/String;Lm7/c;)V

    .line 14
    .line 15
    .line 16
    const/4 v4, 0x3

    .line 17
    const/4 v5, 0x0

    .line 18
    move-object v3, v1

    .line 19
    const/4 v1, 0x0

    .line 20
    const/4 v2, 0x0

    .line 21
    invoke-static/range {v0 .. v5}, Li8/f;->d(Li8/b0;Lkotlin/coroutines/d;Lkotlinx/coroutines/CoroutineStart;Lx7/p;ILjava/lang/Object;)Lkotlinx/coroutines/n;

    .line 22
    .line 23
    .line 24
    return-void
.end method

.method public initData(Lm7/c;)Ljava/lang/Object;
    .locals 5

    .line 1
    instance-of v0, p1, Lcom/zykj/study/ui/home/exercise/MicroEditFragment$initData$1;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p1

    .line 6
    check-cast v0, Lcom/zykj/study/ui/home/exercise/MicroEditFragment$initData$1;

    .line 7
    .line 8
    iget v1, v0, Lcom/zykj/study/ui/home/exercise/MicroEditFragment$initData$1;->c:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, Lcom/zykj/study/ui/home/exercise/MicroEditFragment$initData$1;->c:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lcom/zykj/study/ui/home/exercise/MicroEditFragment$initData$1;

    .line 21
    .line 22
    invoke-direct {v0, p0, p1}, Lcom/zykj/study/ui/home/exercise/MicroEditFragment$initData$1;-><init>(Lcom/zykj/study/ui/home/exercise/MicroEditFragment;Lm7/c;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p1, v0, Lcom/zykj/study/ui/home/exercise/MicroEditFragment$initData$1;->a:Ljava/lang/Object;

    .line 26
    .line 27
    invoke-static {}, Ln7/a;->f()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    iget v2, v0, Lcom/zykj/study/ui/home/exercise/MicroEditFragment$initData$1;->c:I

    .line 32
    .line 33
    const/4 v3, 0x1

    .line 34
    if-eqz v2, :cond_2

    .line 35
    .line 36
    if-ne v2, v3, :cond_1

    .line 37
    .line 38
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 39
    .line 40
    .line 41
    goto :goto_1

    .line 42
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 43
    .line 44
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 45
    .line 46
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 47
    .line 48
    .line 49
    throw p1

    .line 50
    :cond_2
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 51
    .line 52
    .line 53
    iput v3, v0, Lcom/zykj/study/ui/home/exercise/MicroEditFragment$initData$1;->c:I

    .line 54
    .line 55
    invoke-super {p0, v0}, Lcom/zykj/base/BaseFragment;->initData(Lm7/c;)Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    move-result-object p1

    .line 59
    if-ne p1, v1, :cond_3

    .line 60
    .line 61
    return-object v1

    .line 62
    :cond_3
    :goto_1
    new-instance p1, Lp4/s;

    .line 63
    .line 64
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->requireContext()Landroid/content/Context;

    .line 65
    .line 66
    .line 67
    move-result-object v0

    .line 68
    const-string v1, "requireContext(...)"

    .line 69
    .line 70
    invoke-static {v0, v1}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 71
    .line 72
    .line 73
    new-instance v1, Lm1/a;

    .line 74
    .line 75
    sget v2, Lcom/zykj/study/R$string;->exercise_stem:I

    .line 76
    .line 77
    invoke-virtual {p0, v2}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    .line 78
    .line 79
    .line 80
    move-result-object v2

    .line 81
    sget v4, Lcom/zykj/study/R$mipmap;->icon_edit:I

    .line 82
    .line 83
    invoke-direct {v1, v2, v4}, Lm1/a;-><init>(Ljava/lang/CharSequence;I)V

    .line 84
    .line 85
    .line 86
    filled-new-array {v1}, [Lm1/a;

    .line 87
    .line 88
    .line 89
    move-result-object v1

    .line 90
    invoke-static {v1}, Li7/v;->s([Ljava/lang/Object;)Ljava/util/List;

    .line 91
    .line 92
    .line 93
    move-result-object v1

    .line 94
    invoke-direct {p1, v0, v1}, Lp4/s;-><init>(Landroid/content/Context;Ljava/util/List;)V

    .line 95
    .line 96
    .line 97
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getResources()Landroid/content/res/Resources;

    .line 98
    .line 99
    .line 100
    move-result-object v0

    .line 101
    sget v1, Lcom/zykj/lib/ui/R$dimen;->view_70:I

    .line 102
    .line 103
    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 104
    .line 105
    .line 106
    move-result v0

    .line 107
    new-instance v1, Lw4/o1;

    .line 108
    .line 109
    invoke-direct {v1, p0}, Lw4/o1;-><init>(Lcom/zykj/study/ui/home/exercise/MicroEditFragment;)V

    .line 110
    .line 111
    .line 112
    const/4 v2, 0x0

    .line 113
    invoke-virtual {p1, v0, v2, v1}, Lp2/d;->z(IILp2/d$b;)Lp2/d;

    .line 114
    .line 115
    .line 116
    move-result-object p1

    .line 117
    check-cast p1, Lp4/s;

    .line 118
    .line 119
    invoke-virtual {p1, v3}, Lp2/d;->B(Z)Lp2/d;

    .line 120
    .line 121
    .line 122
    move-result-object p1

    .line 123
    check-cast p1, Lp4/s;

    .line 124
    .line 125
    iput-object p1, p0, Lcom/zykj/study/ui/home/exercise/MicroEditFragment;->i:Lp4/s;

    .line 126
    .line 127
    new-instance p1, Lw4/p1;

    .line 128
    .line 129
    invoke-direct {p1, p0}, Lw4/p1;-><init>(Lcom/zykj/study/ui/home/exercise/MicroEditFragment;)V

    .line 130
    .line 131
    .line 132
    const-string v0, "REQUEST_KEY_CROP"

    .line 133
    .line 134
    invoke-static {p0, v0, p1}, Landroidx/fragment/app/FragmentKt;->setFragmentResultListener(Landroidx/fragment/app/Fragment;Ljava/lang/String;Lx7/p;)V

    .line 135
    .line 136
    .line 137
    iget-object p1, p0, Lcom/zykj/study/ui/home/exercise/MicroEditFragment;->k:Landroidx/activity/result/ActivityResultLauncher;

    .line 138
    .line 139
    const-string v0, "android.permission.WRITE_EXTERNAL_STORAGE"

    .line 140
    .line 141
    invoke-virtual {p1, v0}, Landroidx/activity/result/ActivityResultLauncher;->launch(Ljava/lang/Object;)V

    .line 142
    .line 143
    .line 144
    sget-object p1, Lh7/p;->a:Lh7/p;

    .line 145
    .line 146
    return-object p1
.end method

.method public initView(Landroid/os/Bundle;Lm7/c;)Ljava/lang/Object;
    .locals 22

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/zykj/base/BaseFragment;->getMBindView()Landroidx/databinding/ViewDataBinding;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    check-cast v1, Lcom/zykj/study/databinding/FragmentMicroEditBinding;

    .line 8
    .line 9
    invoke-virtual {v0}, Lcom/zykj/study/ui/home/exercise/MicroEditFragment;->A()Lcom/zykj/study/viewmodels/MicroEditViewModel;

    .line 10
    .line 11
    .line 12
    move-result-object v2

    .line 13
    invoke-virtual {v1, v2}, Lcom/zykj/study/databinding/FragmentMicroEditBinding;->setViewModel(Lcom/zykj/study/viewmodels/MicroEditViewModel;)V

    .line 14
    .line 15
    .line 16
    sget-object v1, Lcom/zykj/view/board/board/BoardFragment;->f:Lcom/zykj/view/board/board/BoardFragment$a;

    .line 17
    .line 18
    invoke-virtual {v0}, Lcom/zykj/study/ui/home/exercise/MicroEditFragment;->z()Lcom/zykj/study/ui/home/exercise/MicroEditFragmentArgs;

    .line 19
    .line 20
    .line 21
    move-result-object v2

    .line 22
    invoke-virtual {v2}, Lcom/zykj/study/ui/home/exercise/MicroEditFragmentArgs;->b()Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object v2

    .line 26
    sget-object v13, Lcom/zykj/view/board/board/g$a;->c:Lcom/zykj/view/board/board/g$a;

    .line 27
    .line 28
    new-instance v3, Lcom/zykj/view/board/board/d;

    .line 29
    .line 30
    const/16 v14, 0x10a

    .line 31
    .line 32
    const/4 v15, 0x0

    .line 33
    const/4 v4, 0x1

    .line 34
    const/4 v5, 0x0

    .line 35
    const/4 v6, 0x1

    .line 36
    const/4 v7, 0x0

    .line 37
    const/4 v8, 0x1

    .line 38
    const/4 v9, 0x1

    .line 39
    const/4 v10, 0x1

    .line 40
    const/4 v11, 0x1

    .line 41
    const/4 v12, 0x0

    .line 42
    invoke-direct/range {v3 .. v15}, Lcom/zykj/view/board/board/d;-><init>(ZZZZZZZZZLcom/zykj/view/board/board/g;ILkotlin/jvm/internal/n;)V

    .line 43
    .line 44
    .line 45
    new-instance v4, Lp5/b1;

    .line 46
    .line 47
    const/16 v11, 0x21

    .line 48
    .line 49
    const/4 v12, 0x0

    .line 50
    const/4 v5, 0x0

    .line 51
    const/4 v6, 0x0

    .line 52
    const/4 v7, 0x1

    .line 53
    const/4 v8, 0x5

    .line 54
    const/4 v9, 0x5

    .line 55
    const/4 v10, 0x0

    .line 56
    invoke-direct/range {v4 .. v12}, Lp5/b1;-><init>(Lcom/zykj/view/utils/ZoomPointSolution;ZZIIZILkotlin/jvm/internal/n;)V

    .line 57
    .line 58
    .line 59
    new-instance v5, Lp5/a;

    .line 60
    .line 61
    new-instance v7, Lw4/k1;

    .line 62
    .line 63
    invoke-direct {v7, v0}, Lw4/k1;-><init>(Lcom/zykj/study/ui/home/exercise/MicroEditFragment;)V

    .line 64
    .line 65
    .line 66
    new-instance v8, Lcom/zykj/study/ui/home/exercise/MicroEditFragment$initView$3;

    .line 67
    .line 68
    const/4 v6, 0x0

    .line 69
    invoke-direct {v8, v0, v6}, Lcom/zykj/study/ui/home/exercise/MicroEditFragment$initView$3;-><init>(Lcom/zykj/study/ui/home/exercise/MicroEditFragment;Lm7/c;)V

    .line 70
    .line 71
    .line 72
    new-instance v9, Lw4/l1;

    .line 73
    .line 74
    invoke-direct {v9, v0}, Lw4/l1;-><init>(Lcom/zykj/study/ui/home/exercise/MicroEditFragment;)V

    .line 75
    .line 76
    .line 77
    new-instance v12, Lw4/m1;

    .line 78
    .line 79
    invoke-direct {v12, v0}, Lw4/m1;-><init>(Lcom/zykj/study/ui/home/exercise/MicroEditFragment;)V

    .line 80
    .line 81
    .line 82
    const/16 v19, 0x1fb1

    .line 83
    .line 84
    const/16 v20, 0x0

    .line 85
    .line 86
    move-object v10, v6

    .line 87
    const/4 v6, 0x0

    .line 88
    move-object v11, v10

    .line 89
    const/4 v10, 0x0

    .line 90
    move-object v13, v11

    .line 91
    const/4 v11, 0x0

    .line 92
    move-object v14, v13

    .line 93
    const/4 v13, 0x0

    .line 94
    move-object v15, v14

    .line 95
    const/4 v14, 0x0

    .line 96
    move-object/from16 v16, v15

    .line 97
    .line 98
    const/4 v15, 0x0

    .line 99
    move-object/from16 v17, v16

    .line 100
    .line 101
    const/16 v16, 0x0

    .line 102
    .line 103
    move-object/from16 v18, v17

    .line 104
    .line 105
    const/16 v17, 0x0

    .line 106
    .line 107
    move-object/from16 v21, v18

    .line 108
    .line 109
    const/16 v18, 0x0

    .line 110
    .line 111
    invoke-direct/range {v5 .. v20}, Lp5/a;-><init>(ZLx7/l;Lx7/p;Lx7/l;Lx7/l;Lx7/l;Lx7/l;Lx7/a;Lx7/a;Lx7/l;Lx7/l;Lx7/l;Lx7/l;ILkotlin/jvm/internal/n;)V

    .line 112
    .line 113
    .line 114
    invoke-virtual {v1, v2, v3, v4, v5}, Lcom/zykj/view/board/board/BoardFragment$a;->a(Ljava/lang/String;Lcom/zykj/view/board/board/d;Lp5/b1;Lp5/a;)Lcom/zykj/view/board/board/BoardFragment;

    .line 115
    .line 116
    .line 117
    move-result-object v1

    .line 118
    iput-object v1, v0, Lcom/zykj/study/ui/home/exercise/MicroEditFragment;->j:Lcom/zykj/view/board/board/BoardFragment;

    .line 119
    .line 120
    invoke-virtual {v0}, Lcom/zykj/base/BaseFragment;->getMBindView()Landroidx/databinding/ViewDataBinding;

    .line 121
    .line 122
    .line 123
    move-result-object v1

    .line 124
    check-cast v1, Lcom/zykj/study/databinding/FragmentMicroEditBinding;

    .line 125
    .line 126
    iget-object v1, v1, Lcom/zykj/study/databinding/FragmentMicroEditBinding;->menuExtra:Landroid/widget/ImageView;

    .line 127
    .line 128
    new-instance v2, Lw4/n1;

    .line 129
    .line 130
    invoke-direct {v2, v0}, Lw4/n1;-><init>(Lcom/zykj/study/ui/home/exercise/MicroEditFragment;)V

    .line 131
    .line 132
    .line 133
    invoke-virtual {v1, v2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 134
    .line 135
    .line 136
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->getViewLifecycleOwner()Landroidx/lifecycle/LifecycleOwner;

    .line 137
    .line 138
    .line 139
    move-result-object v1

    .line 140
    const-string v2, "getViewLifecycleOwner(...)"

    .line 141
    .line 142
    invoke-static {v1, v2}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 143
    .line 144
    .line 145
    invoke-static {v1}, Landroidx/lifecycle/LifecycleOwnerKt;->getLifecycleScope(Landroidx/lifecycle/LifecycleOwner;)Landroidx/lifecycle/LifecycleCoroutineScope;

    .line 146
    .line 147
    .line 148
    move-result-object v1

    .line 149
    new-instance v2, Lcom/zykj/study/ui/home/exercise/MicroEditFragment$initView$7;

    .line 150
    .line 151
    const/4 v13, 0x0

    .line 152
    invoke-direct {v2, v0, v13}, Lcom/zykj/study/ui/home/exercise/MicroEditFragment$initView$7;-><init>(Lcom/zykj/study/ui/home/exercise/MicroEditFragment;Lm7/c;)V

    .line 153
    .line 154
    .line 155
    invoke-virtual {v1, v2}, Landroidx/lifecycle/LifecycleCoroutineScope;->launchWhenResumed(Lx7/p;)Lkotlinx/coroutines/n;

    .line 156
    .line 157
    .line 158
    sget-object v1, Lh7/p;->a:Lh7/p;

    .line 159
    .line 160
    return-object v1
.end method

.method public layoutId()I
    .locals 1

    .line 1
    sget v0, Lcom/zykj/study/R$layout;->fragment_micro_edit:I

    .line 2
    .line 3
    return v0
.end method

.method public onDestroy()V
    .locals 0

    .line 1
    invoke-super {p0}, Landroidx/fragment/app/Fragment;->onDestroy()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public final y(Ljava/lang/String;)V
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
    new-instance v5, Lcom/zykj/study/ui/home/exercise/MicroEditFragment$attachmentToServer$1;

    .line 15
    .line 16
    const/4 v0, 0x0

    .line 17
    invoke-direct {v5, p0, p1, v0}, Lcom/zykj/study/ui/home/exercise/MicroEditFragment$attachmentToServer$1;-><init>(Lcom/zykj/study/ui/home/exercise/MicroEditFragment;Ljava/lang/String;Lm7/c;)V

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
    invoke-static/range {v2 .. v7}, Li8/f;->d(Li8/b0;Lkotlin/coroutines/d;Lkotlinx/coroutines/CoroutineStart;Lx7/p;ILjava/lang/Object;)Lkotlinx/coroutines/n;

    .line 25
    .line 26
    .line 27
    return-void
.end method

.method public final z()Lcom/zykj/study/ui/home/exercise/MicroEditFragmentArgs;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/study/ui/home/exercise/MicroEditFragment;->f:Landroidx/navigation/NavArgsLazy;

    .line 2
    .line 3
    invoke-interface {v0}, Lh7/d;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lcom/zykj/study/ui/home/exercise/MicroEditFragmentArgs;

    .line 8
    .line 9
    return-object v0
.end method
