# RE note 本类字节码直接引用的读写或显示接口包括ObjectBox。
.class public Lcom/friday/paint/view/six/NewPaintFragment;
.super Lcom/friday/paint/view/six/Hilt_NewPaintFragment;
.source "SourceFile"


# annotations
.annotation build Landroidx/annotation/Keep;
.end annotation

.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x0
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/friday/paint/view/six/NewPaintFragment$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/friday/paint/view/six/Hilt_NewPaintFragment<",
        "Lcom/friday/paint/databinding/ResFragmentNewPaintBinding;",
        ">;"
    }
.end annotation


# static fields
.field public static final $stable:I

.field public static final Companion:Lcom/friday/paint/view/six/NewPaintFragment$a;

.field public static final TAG_NOTE_FRAGMENT:Ljava/lang/String; = "NoteFragment"


# instance fields
.field private final askLauncher:Landroidx/activity/result/ActivityResultLauncher;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/activity/result/ActivityResultLauncher<",
            "Landroid/content/Intent;",
            ">;"
        }
    .end annotation
.end field

.field private final homeworkViewModel$delegate:Lqc/d;

.field public iClassManager:Lj2/b;

.field private final rightNoteListAdapter$delegate:Lqc/d;

.field private screensPermission:Z

.field private final shareLauncher:Landroidx/activity/result/ActivityResultLauncher;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/activity/result/ActivityResultLauncher<",
            "Landroid/content/Intent;",
            ">;"
        }
    .end annotation
.end field

.field private final viewModel$delegate:Lqc/d;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/friday/paint/view/six/NewPaintFragment$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/friday/paint/view/six/NewPaintFragment$a;-><init>(Lkotlin/jvm/internal/n;)V

    sput-object v0, Lcom/friday/paint/view/six/NewPaintFragment;->Companion:Lcom/friday/paint/view/six/NewPaintFragment$a;

    const/16 v0, 0x8

    sput v0, Lcom/friday/paint/view/six/NewPaintFragment;->$stable:I

    return-void
.end method

.method public constructor <init>()V
    .locals 5

    .line 1
    invoke-direct {p0}, Lcom/friday/paint/view/six/Hilt_NewPaintFragment;-><init>()V

    .line 2
    .line 3
    .line 4
    const-class v0, Lcom/friday/paint/viewmodel/NewNoteViewModel;

    .line 5
    .line 6
    invoke-static {v0}, Lkotlin/jvm/internal/y;->b(Ljava/lang/Class;)Lod/c;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    new-instance v1, Lcom/friday/paint/view/six/NewPaintFragment$special$$inlined$activityViewModels$default$1;

    .line 11
    .line 12
    invoke-direct {v1, p0}, Lcom/friday/paint/view/six/NewPaintFragment$special$$inlined$activityViewModels$default$1;-><init>(Landroidx/fragment/app/Fragment;)V

    .line 13
    .line 14
    .line 15
    new-instance v2, Lcom/friday/paint/view/six/NewPaintFragment$special$$inlined$activityViewModels$default$2;

    .line 16
    .line 17
    const/4 v3, 0x0

    .line 18
    invoke-direct {v2, v3, p0}, Lcom/friday/paint/view/six/NewPaintFragment$special$$inlined$activityViewModels$default$2;-><init>(Lhd/a;Landroidx/fragment/app/Fragment;)V

    .line 19
    .line 20
    .line 21
    new-instance v4, Lcom/friday/paint/view/six/NewPaintFragment$special$$inlined$activityViewModels$default$3;

    .line 22
    .line 23
    invoke-direct {v4, p0}, Lcom/friday/paint/view/six/NewPaintFragment$special$$inlined$activityViewModels$default$3;-><init>(Landroidx/fragment/app/Fragment;)V

    .line 24
    .line 25
    .line 26
    invoke-static {p0, v0, v1, v2, v4}, Landroidx/fragment/app/FragmentViewModelLazyKt;->createViewModelLazy(Landroidx/fragment/app/Fragment;Lod/c;Lhd/a;Lhd/a;Lhd/a;)Lqc/d;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    iput-object v0, p0, Lcom/friday/paint/view/six/NewPaintFragment;->viewModel$delegate:Lqc/d;

    .line 31
    .line 32
    new-instance v0, Ld4/m;

    .line 33
    .line 34
    invoke-direct {v0}, Ld4/m;-><init>()V

    .line 35
    .line 36
    .line 37
    invoke-static {v0}, Lkotlin/a;->a(Lhd/a;)Lqc/d;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    iput-object v0, p0, Lcom/friday/paint/view/six/NewPaintFragment;->rightNoteListAdapter$delegate:Lqc/d;

    .line 42
    .line 43
    const-class v0, Lcom/friday/paint/viewmodel/DoHomeworkViewModel;

    .line 44
    .line 45
    invoke-static {v0}, Lkotlin/jvm/internal/y;->b(Ljava/lang/Class;)Lod/c;

    .line 46
    .line 47
    .line 48
    move-result-object v0

    .line 49
    new-instance v1, Lcom/friday/paint/view/six/NewPaintFragment$special$$inlined$activityViewModels$default$4;

    .line 50
    .line 51
    invoke-direct {v1, p0}, Lcom/friday/paint/view/six/NewPaintFragment$special$$inlined$activityViewModels$default$4;-><init>(Landroidx/fragment/app/Fragment;)V

    .line 52
    .line 53
    .line 54
    new-instance v2, Lcom/friday/paint/view/six/NewPaintFragment$special$$inlined$activityViewModels$default$5;

    .line 55
    .line 56
    invoke-direct {v2, v3, p0}, Lcom/friday/paint/view/six/NewPaintFragment$special$$inlined$activityViewModels$default$5;-><init>(Lhd/a;Landroidx/fragment/app/Fragment;)V

    .line 57
    .line 58
    .line 59
    new-instance v3, Lcom/friday/paint/view/six/NewPaintFragment$special$$inlined$activityViewModels$default$6;

    .line 60
    .line 61
    invoke-direct {v3, p0}, Lcom/friday/paint/view/six/NewPaintFragment$special$$inlined$activityViewModels$default$6;-><init>(Landroidx/fragment/app/Fragment;)V

    .line 62
    .line 63
    .line 64
    invoke-static {p0, v0, v1, v2, v3}, Landroidx/fragment/app/FragmentViewModelLazyKt;->createViewModelLazy(Landroidx/fragment/app/Fragment;Lod/c;Lhd/a;Lhd/a;Lhd/a;)Lqc/d;

    .line 65
    .line 66
    .line 67
    move-result-object v0

    .line 68
    iput-object v0, p0, Lcom/friday/paint/view/six/NewPaintFragment;->homeworkViewModel$delegate:Lqc/d;

    .line 69
    .line 70
    new-instance v0, Landroidx/activity/result/contract/ActivityResultContracts$StartActivityForResult;

    .line 71
    .line 72
    invoke-direct {v0}, Landroidx/activity/result/contract/ActivityResultContracts$StartActivityForResult;-><init>()V

    .line 73
    .line 74
    .line 75
    new-instance v1, Ld4/x;

    .line 76
    .line 77
    invoke-direct {v1}, Ld4/x;-><init>()V

    .line 78
    .line 79
    .line 80
    invoke-virtual {p0, v0, v1}, Landroidx/fragment/app/Fragment;->registerForActivityResult(Landroidx/activity/result/contract/ActivityResultContract;Landroidx/activity/result/ActivityResultCallback;)Landroidx/activity/result/ActivityResultLauncher;

    .line 81
    .line 82
    .line 83
    move-result-object v0

    .line 84
    const-string v1, "registerForActivityResult(...)"

    .line 85
    .line 86
    invoke-static {v0, v1}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 87
    .line 88
    .line 89
    iput-object v0, p0, Lcom/friday/paint/view/six/NewPaintFragment;->askLauncher:Landroidx/activity/result/ActivityResultLauncher;

    .line 90
    .line 91
    new-instance v0, Landroidx/activity/result/contract/ActivityResultContracts$StartActivityForResult;

    .line 92
    .line 93
    invoke-direct {v0}, Landroidx/activity/result/contract/ActivityResultContracts$StartActivityForResult;-><init>()V

    .line 94
    .line 95
    .line 96
    new-instance v2, Ld4/i0;

    .line 97
    .line 98
    invoke-direct {v2, p0}, Ld4/i0;-><init>(Lcom/friday/paint/view/six/NewPaintFragment;)V

    .line 99
    .line 100
    .line 101
    invoke-virtual {p0, v0, v2}, Landroidx/fragment/app/Fragment;->registerForActivityResult(Landroidx/activity/result/contract/ActivityResultContract;Landroidx/activity/result/ActivityResultCallback;)Landroidx/activity/result/ActivityResultLauncher;

    .line 102
    .line 103
    .line 104
    move-result-object v0

    .line 105
    invoke-static {v0, v1}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 106
    .line 107
    .line 108
    iput-object v0, p0, Lcom/friday/paint/view/six/NewPaintFragment;->shareLauncher:Landroidx/activity/result/ActivityResultLauncher;

    .line 109
    .line 110
    return-void
.end method

.method public static synthetic A(Lcom/friday/paint/view/six/NewPaintFragment;Landroid/view/View;)Lqc/q;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/friday/paint/view/six/NewPaintFragment;->initDrawerRight$lambda$41(Lcom/friday/paint/view/six/NewPaintFragment;Landroid/view/View;)Lqc/q;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic B(Lkb/y1;Lcom/friday/paint/view/six/NewPaintFragment;)Lqc/q;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/friday/paint/view/six/NewPaintFragment;->getNoteFragment$lambda$64(Lkb/y1;Lcom/friday/paint/view/six/NewPaintFragment;)Lqc/q;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic C(Lcom/friday/paint/view/six/NewPaintFragment;Landroidx/activity/result/ActivityResult;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/friday/paint/view/six/NewPaintFragment;->shareLauncher$lambda$72(Lcom/friday/paint/view/six/NewPaintFragment;Landroidx/activity/result/ActivityResult;)V

    return-void
.end method

.method public static synthetic D(Lcom/friday/paint/view/six/NewPaintFragment;Lcom/chad/library/adapter/base/BaseQuickAdapter;Landroid/view/View;I)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2, p3}, Lcom/friday/paint/view/six/NewPaintFragment;->initDrawerRight$lambda$34$lambda$33(Lcom/friday/paint/view/six/NewPaintFragment;Lcom/chad/library/adapter/base/BaseQuickAdapter;Landroid/view/View;I)V

    return-void
.end method

.method public static synthetic E(Lcom/friday/paint/view/six/NewPaintFragment;Landroid/view/View;)Lqc/q;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/friday/paint/view/six/NewPaintFragment;->initClick$lambda$7(Lcom/friday/paint/view/six/NewPaintFragment;Landroid/view/View;)Lqc/q;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic F(Lcom/friday/paint/view/six/NewPaintFragment;Ljava/lang/Throwable;)Lqc/q;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/friday/paint/view/six/NewPaintFragment;->initDrawerRight$lambda$45$lambda$42(Lcom/friday/paint/view/six/NewPaintFragment;Ljava/lang/Throwable;)Lqc/q;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic G(Lcom/friday/paint/view/six/NewPaintFragment;Ljava/lang/String;)Lqc/q;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/friday/paint/view/six/NewPaintFragment;->initDrawerRight$lambda$28$lambda$26(Lcom/friday/paint/view/six/NewPaintFragment;Ljava/lang/String;)Lqc/q;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic H(Lcom/friday/paint/view/six/NewPaintFragment;Ljava/lang/Boolean;)Lqc/q;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/friday/paint/view/six/NewPaintFragment;->initObserver$lambda$16(Lcom/friday/paint/view/six/NewPaintFragment;Ljava/lang/Boolean;)Lqc/q;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic I(Ljava/lang/Throwable;)Lqc/q;
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/friday/paint/view/six/NewPaintFragment;->save$lambda$69(Ljava/lang/Throwable;)Lqc/q;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic J(Ljava/lang/String;Ljava/lang/String;)Lqc/q;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/friday/paint/view/six/NewPaintFragment;->shareLauncher$lambda$72$lambda$71$lambda$70(Ljava/lang/String;Ljava/lang/String;)Lqc/q;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic K(Lcom/friday/paint/view/six/NewPaintFragment;I)Lqc/q;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/friday/paint/view/six/NewPaintFragment;->initDrawerRight$lambda$38$lambda$37$lambda$36(Lcom/friday/paint/view/six/NewPaintFragment;I)Lqc/q;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic L(Landroidx/activity/result/ActivityResult;)V
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/friday/paint/view/six/NewPaintFragment;->askLauncher$lambda$11(Landroidx/activity/result/ActivityResult;)V

    return-void
.end method

.method public static synthetic M(Lcom/friday/paint/view/six/NewPaintFragment;Ljava/lang/Integer;)Lqc/q;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/friday/paint/view/six/NewPaintFragment;->initObserver$lambda$15(Lcom/friday/paint/view/six/NewPaintFragment;Ljava/lang/Integer;)Lqc/q;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic N(Lcom/friday/paint/view/six/NewPaintFragment;Landroid/view/View;)Lqc/q;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/friday/paint/view/six/NewPaintFragment;->initDrawerRight$lambda$47(Lcom/friday/paint/view/six/NewPaintFragment;Landroid/view/View;)Lqc/q;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic O(Lcom/friday/paint/view/six/NewPaintFragment;Ljava/lang/Object;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/friday/paint/view/six/NewPaintFragment;->initObserver$lambda$14(Lcom/friday/paint/view/six/NewPaintFragment;Ljava/lang/Object;)V

    return-void
.end method

.method public static synthetic P(Lcom/friday/paint/view/six/NewPaintFragment;Landroid/view/View;)Lqc/q;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/friday/paint/view/six/NewPaintFragment;->initDrawerRight$lambda$32(Lcom/friday/paint/view/six/NewPaintFragment;Landroid/view/View;)Lqc/q;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic Q(Lcom/friday/paint/view/six/NewPaintFragment;Landroid/view/View;)Lqc/q;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/friday/paint/view/six/NewPaintFragment;->initDrawerRight$lambda$45(Lcom/friday/paint/view/six/NewPaintFragment;Landroid/view/View;)Lqc/q;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic R(Lcom/friday/paint/view/six/NewPaintFragment;Ljava/lang/Throwable;)Lqc/q;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/friday/paint/view/six/NewPaintFragment;->initClick$lambda$7$lambda$5$lambda$3(Lcom/friday/paint/view/six/NewPaintFragment;Ljava/lang/Throwable;)Lqc/q;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic S(Lcom/friday/paint/view/six/NewPaintFragment;Landroid/view/View;)Lqc/q;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/friday/paint/view/six/NewPaintFragment;->initDrawerRight$lambda$28(Lcom/friday/paint/view/six/NewPaintFragment;Landroid/view/View;)Lqc/q;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic T(Lcom/friday/paint/view/six/NewPaintFragment;Lkotlin/Pair;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/friday/paint/view/six/NewPaintFragment;->initObserver$lambda$20(Lcom/friday/paint/view/six/NewPaintFragment;Lkotlin/Pair;)V

    return-void
.end method

.method public static synthetic U(Lcom/friday/paint/view/six/NewPaintFragment;Landroidx/activity/OnBackPressedCallback;)Lqc/q;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/friday/paint/view/six/NewPaintFragment;->initClick$lambda$9(Lcom/friday/paint/view/six/NewPaintFragment;Landroidx/activity/OnBackPressedCallback;)Lqc/q;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic V(Lcom/friday/paint/view/six/NewPaintFragment;Lhd/a;)Lqc/q;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/friday/paint/view/six/NewPaintFragment;->getNoteFragment$lambda$62(Lcom/friday/paint/view/six/NewPaintFragment;Lhd/a;)Lqc/q;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic W(Lcom/friday/paint/view/six/NewPaintFragment;Landroid/view/View;)Lqc/q;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/friday/paint/view/six/NewPaintFragment;->initDrawerRight$lambda$30(Lcom/friday/paint/view/six/NewPaintFragment;Landroid/view/View;)Lqc/q;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic X(Lcom/friday/paint/view/six/NewPaintFragment;Landroid/graphics/Bitmap;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/friday/paint/view/six/NewPaintFragment;->initObserver$lambda$19(Lcom/friday/paint/view/six/NewPaintFragment;Landroid/graphics/Bitmap;)V

    return-void
.end method

.method public static synthetic Y(Lcom/friday/paint/view/six/NewPaintFragment;Ljava/lang/String;)Lqc/q;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/friday/paint/view/six/NewPaintFragment;->initObserver$lambda$19$lambda$18(Lcom/friday/paint/view/six/NewPaintFragment;Ljava/lang/String;)Lqc/q;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic Z(Lcom/friday/paint/view/six/NewPaintFragment;Ljava/lang/String;)Lqc/q;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/friday/paint/view/six/NewPaintFragment;->initDrawerRight$lambda$41$lambda$40(Lcom/friday/paint/view/six/NewPaintFragment;Ljava/lang/String;)Lqc/q;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic a0(Landroid/view/View;Lcom/friday/paint/view/six/NewPaintFragment;Ljava/lang/String;)Lqc/q;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lcom/friday/paint/view/six/NewPaintFragment;->getNoteFragment$lambda$61$lambda$59$lambda$58(Landroid/view/View;Lcom/friday/paint/view/six/NewPaintFragment;Ljava/lang/String;)Lqc/q;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$changeNote(Lcom/friday/paint/view/six/NewPaintFragment;Ljava/lang/String;Lvc/c;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Lcom/friday/paint/view/six/NewPaintFragment;->changeNote(Ljava/lang/String;Lvc/c;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static final synthetic access$checkImageSafety(Lcom/friday/paint/view/six/NewPaintFragment;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/friday/paint/view/six/NewPaintFragment;->checkImageSafety(Ljava/lang/String;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static final varargs synthetic access$convertEnable(Lcom/friday/paint/view/six/NewPaintFragment;[Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/friday/paint/view/six/NewPaintFragment;->convertEnable([Landroid/view/View;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static final synthetic access$getAskLauncher$p(Lcom/friday/paint/view/six/NewPaintFragment;)Landroidx/activity/result/ActivityResultLauncher;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/friday/paint/view/six/NewPaintFragment;->askLauncher:Landroidx/activity/result/ActivityResultLauncher;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic access$getHomeworkViewModel(Lcom/friday/paint/view/six/NewPaintFragment;)Lcom/friday/paint/viewmodel/DoHomeworkViewModel;
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/friday/paint/view/six/NewPaintFragment;->getHomeworkViewModel()Lcom/friday/paint/viewmodel/DoHomeworkViewModel;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static final synthetic access$getMBinding(Lcom/friday/paint/view/six/NewPaintFragment;)Lcom/friday/paint/databinding/ResFragmentNewPaintBinding;
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/friday/common/base/BaseFragment;->getMBinding()Landroidx/databinding/ViewDataBinding;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    check-cast p0, Lcom/friday/paint/databinding/ResFragmentNewPaintBinding;

    .line 6
    .line 7
    return-object p0
.end method

.method public static final synthetic access$getNoteFragment(Lcom/friday/paint/view/six/NewPaintFragment;Ljava/lang/String;Lkb/y1;Lvc/c;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2, p3}, Lcom/friday/paint/view/six/NewPaintFragment;->getNoteFragment(Ljava/lang/String;Lkb/y1;Lvc/c;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static final synthetic access$getViewModel(Lcom/friday/paint/view/six/NewPaintFragment;)Lcom/friday/paint/viewmodel/NewNoteViewModel;
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/friday/paint/view/six/NewPaintFragment;->getViewModel()Lcom/friday/paint/viewmodel/NewNoteViewModel;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static final synthetic access$handleMdbUpdate(Lcom/friday/paint/view/six/NewPaintFragment;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/friday/paint/view/six/NewPaintFragment;->handleMdbUpdate(Ljava/lang/String;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static final synthetic access$moveToPosition(Lcom/friday/paint/view/six/NewPaintFragment;Landroidx/recyclerview/widget/RecyclerView;I)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Lcom/friday/paint/view/six/NewPaintFragment;->moveToPosition(Landroidx/recyclerview/widget/RecyclerView;I)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static final synthetic access$renameBin(Lcom/friday/paint/view/six/NewPaintFragment;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/util/HashMap;)Ljava/util/List;
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2, p3, p4}, Lcom/friday/paint/view/six/NewPaintFragment;->renameBin(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/util/HashMap;)Ljava/util/List;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static final synthetic access$saveScreenCaptureToPng(Lcom/friday/paint/view/six/NewPaintFragment;Landroid/graphics/Bitmap;Ljava/lang/String;Lvc/c;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2, p3}, Lcom/friday/paint/view/six/NewPaintFragment;->saveScreenCaptureToPng(Landroid/graphics/Bitmap;Ljava/lang/String;Lvc/c;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static final synthetic access$setScreensPermission$p(Lcom/friday/paint/view/six/NewPaintFragment;Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/friday/paint/view/six/NewPaintFragment;->screensPermission:Z

    .line 2
    .line 3
    return-void
.end method

.method public static final synthetic access$updateCurrentPage(Lcom/friday/paint/view/six/NewPaintFragment;II)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Lcom/friday/paint/view/six/NewPaintFragment;->updateCurrentPage(II)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static final synthetic access$updateGraphName(Lcom/friday/paint/view/six/NewPaintFragment;Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;Ljava/util/HashMap;)Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Lcom/friday/paint/view/six/NewPaintFragment;->updateGraphName(Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;Ljava/util/HashMap;)Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static final synthetic access$updateNoteScreenShotByNotePath(Lcom/friday/paint/view/six/NewPaintFragment;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/friday/paint/view/six/NewPaintFragment;->updateNoteScreenShotByNotePath(Ljava/lang/String;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic addNote$default(Lcom/friday/paint/view/six/NewPaintFragment;IZILjava/lang/Object;)V
    .locals 0

    .line 1
    if-nez p4, :cond_1

    .line 2
    .line 3
    and-int/lit8 p3, p3, 0x2

    .line 4
    .line 5
    if-eqz p3, :cond_0

    .line 6
    .line 7
    const/4 p2, 0x0

    .line 8
    :cond_0
    invoke-virtual {p0, p1, p2}, Lcom/friday/paint/view/six/NewPaintFragment;->addNote(IZ)V

    .line 9
    .line 10
    .line 11
    return-void

    .line 12
    :cond_1
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    .line 13
    .line 14
    const-string p1, "Super calls with default arguments not supported in this target, function: addNote"

    .line 15
    .line 16
    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    throw p0
.end method

.method private static final addNote$lambda$57(Lcom/friday/paint/view/six/NewPaintFragment;I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/friday/paint/view/six/NewPaintFragment;->getViewModel()Lcom/friday/paint/viewmodel/NewNoteViewModel;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0, p1}, Lcom/friday/paint/viewmodel/NewNoteViewModel;->b0(I)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method private static final askLauncher$lambda$11(Landroidx/activity/result/ActivityResult;)V
    .locals 1

    .line 1
    const-string v0, "activityResult"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Landroidx/activity/result/ActivityResult;->getResultCode()I

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-nez v0, :cond_0

    .line 11
    .line 12
    invoke-virtual {p0}, Landroidx/activity/result/ActivityResult;->getData()Landroid/content/Intent;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    if-eqz p0, :cond_0

    .line 17
    .line 18
    const-string v0, "errorMsg"

    .line 19
    .line 20
    invoke-virtual {p0, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    if-eqz p0, :cond_0

    .line 25
    .line 26
    const/4 v0, 0x0

    .line 27
    new-array v0, v0, [Ljava/lang/Object;

    .line 28
    .line 29
    invoke-static {p0, v0}, Lcom/blankj/utilcode/util/ToastUtils;->showShort(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 30
    .line 31
    .line 32
    :cond_0
    return-void
.end method

.method public static synthetic b0(Lcom/friday/paint/view/six/NewPaintFragment;Ljava/lang/String;)Lqc/q;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/friday/paint/view/six/NewPaintFragment;->getNoteFragment$lambda$66(Lcom/friday/paint/view/six/NewPaintFragment;Ljava/lang/String;)Lqc/q;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c0(Lcom/friday/paint/view/six/NewPaintFragment;Ljava/lang/Throwable;)Lqc/q;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/friday/paint/view/six/NewPaintFragment;->initDrawerRight$lambda$28$lambda$24(Lcom/friday/paint/view/six/NewPaintFragment;Ljava/lang/Throwable;)Lqc/q;

    move-result-object p0

    return-object p0
.end method

.method private final changeNote(Ljava/lang/String;Lvc/c;)Ljava/lang/Object;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lvc/c<",
            "-",
            "Lqc/q;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    instance-of v0, p2, Lcom/friday/paint/view/six/NewPaintFragment$changeNote$1;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p2

    .line 6
    check-cast v0, Lcom/friday/paint/view/six/NewPaintFragment$changeNote$1;

    .line 7
    .line 8
    iget v1, v0, Lcom/friday/paint/view/six/NewPaintFragment$changeNote$1;->i:I

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
    iput v1, v0, Lcom/friday/paint/view/six/NewPaintFragment$changeNote$1;->i:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lcom/friday/paint/view/six/NewPaintFragment$changeNote$1;

    .line 21
    .line 22
    invoke-direct {v0, p0, p2}, Lcom/friday/paint/view/six/NewPaintFragment$changeNote$1;-><init>(Lcom/friday/paint/view/six/NewPaintFragment;Lvc/c;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p2, v0, Lcom/friday/paint/view/six/NewPaintFragment$changeNote$1;->g:Ljava/lang/Object;

    .line 26
    .line 27
    invoke-static {}, Lwc/a;->f()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    iget v2, v0, Lcom/friday/paint/view/six/NewPaintFragment$changeNote$1;->i:I

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
    iget p1, v0, Lcom/friday/paint/view/six/NewPaintFragment$changeNote$1;->f:I

    .line 39
    .line 40
    iget-object v1, v0, Lcom/friday/paint/view/six/NewPaintFragment$changeNote$1;->e:Ljava/lang/Object;

    .line 41
    .line 42
    check-cast v1, Landroidx/fragment/app/FragmentTransaction;

    .line 43
    .line 44
    iget-object v2, v0, Lcom/friday/paint/view/six/NewPaintFragment$changeNote$1;->d:Ljava/lang/Object;

    .line 45
    .line 46
    check-cast v2, Lkb/y1;

    .line 47
    .line 48
    iget-object v0, v0, Lcom/friday/paint/view/six/NewPaintFragment$changeNote$1;->c:Ljava/lang/Object;

    .line 49
    .line 50
    check-cast v0, Ljava/lang/String;

    .line 51
    .line 52
    invoke-static {p2}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 53
    .line 54
    .line 55
    goto :goto_2

    .line 56
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 57
    .line 58
    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 59
    .line 60
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 61
    .line 62
    .line 63
    throw p1

    .line 64
    :cond_2
    invoke-static {p2}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 65
    .line 66
    .line 67
    invoke-virtual {p0, v3}, Lcom/friday/common/base/BaseFragment;->isShowLoading(Z)V

    .line 68
    .line 69
    .line 70
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    .line 71
    .line 72
    .line 73
    move-result p2

    .line 74
    if-lez p2, :cond_3

    .line 75
    .line 76
    invoke-direct {p0}, Lcom/friday/paint/view/six/NewPaintFragment;->getViewModel()Lcom/friday/paint/viewmodel/NewNoteViewModel;

    .line 77
    .line 78
    .line 79
    move-result-object p2

    .line 80
    invoke-virtual {p2, p1}, Lcom/friday/paint/viewmodel/NewNoteViewModel;->U(Ljava/lang/String;)V

    .line 81
    .line 82
    .line 83
    :cond_3
    invoke-virtual {p0}, Lcom/friday/paint/view/six/NewPaintFragment;->getCurrentNoteFragment()Lcom/zykj/view/board/board/BoardFragment;

    .line 84
    .line 85
    .line 86
    move-result-object p2

    .line 87
    if-eqz p2, :cond_4

    .line 88
    .line 89
    invoke-virtual {p2}, Lcom/zykj/view/board/board/BoardFragment;->B0()Lkb/y1;

    .line 90
    .line 91
    .line 92
    move-result-object p2

    .line 93
    goto :goto_1

    .line 94
    :cond_4
    const/4 p2, 0x0

    .line 95
    :goto_1
    new-instance v2, Ljava/lang/StringBuilder;

    .line 96
    .line 97
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 98
    .line 99
    .line 100
    const-string v4, "BBD: NewPaintFragment.changeNote to: "

    .line 101
    .line 102
    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 103
    .line 104
    .line 105
    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 106
    .line 107
    .line 108
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 109
    .line 110
    .line 111
    move-result-object v2

    .line 112
    filled-new-array {v2}, [Ljava/lang/Object;

    .line 113
    .line 114
    .line 115
    move-result-object v2

    .line 116
    invoke-static {v2}, Lcom/blankj/utilcode/util/LogUtils;->i([Ljava/lang/Object;)V

    .line 117
    .line 118
    .line 119
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getChildFragmentManager()Landroidx/fragment/app/FragmentManager;

    .line 120
    .line 121
    .line 122
    move-result-object v2

    .line 123
    invoke-virtual {v2}, Landroidx/fragment/app/FragmentManager;->beginTransaction()Landroidx/fragment/app/FragmentTransaction;

    .line 124
    .line 125
    .line 126
    move-result-object v2

    .line 127
    sget v4, Lcom/friday/paint/R$id;->flSketch:I

    .line 128
    .line 129
    invoke-static {p1}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 130
    .line 131
    .line 132
    move-result-object v5

    .line 133
    iput-object v5, v0, Lcom/friday/paint/view/six/NewPaintFragment$changeNote$1;->c:Ljava/lang/Object;

    .line 134
    .line 135
    invoke-static {p2}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 136
    .line 137
    .line 138
    move-result-object v5

    .line 139
    iput-object v5, v0, Lcom/friday/paint/view/six/NewPaintFragment$changeNote$1;->d:Ljava/lang/Object;

    .line 140
    .line 141
    iput-object v2, v0, Lcom/friday/paint/view/six/NewPaintFragment$changeNote$1;->e:Ljava/lang/Object;

    .line 142
    .line 143
    iput v4, v0, Lcom/friday/paint/view/six/NewPaintFragment$changeNote$1;->f:I

    .line 144
    .line 145
    iput v3, v0, Lcom/friday/paint/view/six/NewPaintFragment$changeNote$1;->i:I

    .line 146
    .line 147
    invoke-direct {p0, p1, p2, v0}, Lcom/friday/paint/view/six/NewPaintFragment;->getNoteFragment(Ljava/lang/String;Lkb/y1;Lvc/c;)Ljava/lang/Object;

    .line 148
    .line 149
    .line 150
    move-result-object p2

    .line 151
    if-ne p2, v1, :cond_5

    .line 152
    .line 153
    return-object v1

    .line 154
    :cond_5
    move-object v1, v2

    .line 155
    move p1, v4

    .line 156
    :goto_2
    check-cast p2, Landroidx/fragment/app/Fragment;

    .line 157
    .line 158
    const-string v0, "NoteFragment"

    .line 159
    .line 160
    invoke-virtual {v1, p1, p2, v0}, Landroidx/fragment/app/FragmentTransaction;->replace(ILandroidx/fragment/app/Fragment;Ljava/lang/String;)Landroidx/fragment/app/FragmentTransaction;

    .line 161
    .line 162
    .line 163
    move-result-object p1

    .line 164
    invoke-virtual {p1}, Landroidx/fragment/app/FragmentTransaction;->commitNowAllowingStateLoss()V

    .line 165
    .line 166
    .line 167
    sget-object p1, Lqc/q;->a:Lqc/q;

    .line 168
    .line 169
    return-object p1
.end method

.method private final checkImageSafety(Ljava/lang/String;)V
    .locals 7

    .line 1
    sget-object v0, Lcom/friday/common/helper/b;->a:Lcom/friday/common/helper/b$a;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/friday/common/helper/b$a;->a()Lcom/friday/common/helper/b;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0}, Lcom/friday/common/helper/b;->v()Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    invoke-static {p1}, Lcom/blankj/utilcode/util/FileUtils;->isFileExists(Ljava/lang/String;)Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-eqz v0, :cond_0

    .line 18
    .line 19
    invoke-static {p0}, Landroidx/lifecycle/LifecycleOwnerKt;->getLifecycleScope(Landroidx/lifecycle/LifecycleOwner;)Landroidx/lifecycle/LifecycleCoroutineScope;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    new-instance v4, Lcom/friday/paint/view/six/NewPaintFragment$checkImageSafety$1;

    .line 24
    .line 25
    const/4 v0, 0x0

    .line 26
    invoke-direct {v4, p0, p1, v0}, Lcom/friday/paint/view/six/NewPaintFragment$checkImageSafety$1;-><init>(Lcom/friday/paint/view/six/NewPaintFragment;Ljava/lang/String;Lvc/c;)V

    .line 27
    .line 28
    .line 29
    const/4 v5, 0x3

    .line 30
    const/4 v6, 0x0

    .line 31
    const/4 v2, 0x0

    .line 32
    const/4 v3, 0x0

    .line 33
    invoke-static/range {v1 .. v6}, Lsd/f;->d(Lsd/i0;Lkotlin/coroutines/d;Lkotlinx/coroutines/CoroutineStart;Lhd/p;ILjava/lang/Object;)Lkotlinx/coroutines/g;

    .line 34
    .line 35
    .line 36
    :cond_0
    return-void
.end method

.method private final varargs convertEnable([Landroid/view/View;)V
    .locals 4

    .line 1
    array-length v0, p1

    .line 2
    const/4 v1, 0x0

    .line 3
    :goto_0
    if-ge v1, v0, :cond_0

    .line 4
    .line 5
    aget-object v2, p1, v1

    .line 6
    .line 7
    invoke-virtual {v2}, Landroid/view/View;->isEnabled()Z

    .line 8
    .line 9
    .line 10
    move-result v3

    .line 11
    xor-int/lit8 v3, v3, 0x1

    .line 12
    .line 13
    invoke-virtual {v2, v3}, Landroid/view/View;->setEnabled(Z)V

    .line 14
    .line 15
    .line 16
    add-int/lit8 v1, v1, 0x1

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_0
    return-void
.end method

.method private final copyNote(I)V
    .locals 6

    .line 1
    invoke-static {p0}, Landroidx/lifecycle/LifecycleOwnerKt;->getLifecycleScope(Landroidx/lifecycle/LifecycleOwner;)Landroidx/lifecycle/LifecycleCoroutineScope;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    new-instance v3, Lcom/friday/paint/view/six/NewPaintFragment$copyNote$1;

    .line 6
    .line 7
    const/4 v1, 0x0

    .line 8
    invoke-direct {v3, p0, p1, v1}, Lcom/friday/paint/view/six/NewPaintFragment$copyNote$1;-><init>(Lcom/friday/paint/view/six/NewPaintFragment;ILvc/c;)V

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

.method public static synthetic d0(Lcom/friday/paint/view/six/NewPaintFragment;)Lqc/q;
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/friday/paint/view/six/NewPaintFragment;->getNoteFragment$lambda$65(Lcom/friday/paint/view/six/NewPaintFragment;)Lqc/q;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic e0(Lcom/friday/paint/view/six/NewPaintFragment;Ljava/lang/String;)Lqc/q;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/friday/paint/view/six/NewPaintFragment;->initDrawerRight$lambda$45$lambda$44(Lcom/friday/paint/view/six/NewPaintFragment;Ljava/lang/String;)Lqc/q;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic f0(Lcom/friday/paint/view/six/NewPaintFragment;Ljava/lang/Integer;)Lqc/q;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/friday/paint/view/six/NewPaintFragment;->initObserver$lambda$12(Lcom/friday/paint/view/six/NewPaintFragment;Ljava/lang/Integer;)Lqc/q;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic g0(Ljava/lang/String;)Lqc/q;
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/friday/paint/view/six/NewPaintFragment;->getNoteFragment$lambda$67(Ljava/lang/String;)Lqc/q;

    move-result-object p0

    return-object p0
.end method

.method private final getHomeworkViewModel()Lcom/friday/paint/viewmodel/DoHomeworkViewModel;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/friday/paint/view/six/NewPaintFragment;->homeworkViewModel$delegate:Lqc/d;

    .line 2
    .line 3
    invoke-interface {v0}, Lqc/d;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lcom/friday/paint/viewmodel/DoHomeworkViewModel;

    .line 8
    .line 9
    return-object v0
.end method

.method private final getNoteFragment(Ljava/lang/String;Lkb/y1;Lvc/c;)Ljava/lang/Object;
    .locals 32
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lkb/y1;",
            "Lvc/c<",
            "-",
            "Lcom/zykj/view/board/board/BoardFragment;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p3

    .line 4
    .line 5
    instance-of v2, v1, Lcom/friday/paint/view/six/NewPaintFragment$getNoteFragment$1;

    .line 6
    .line 7
    if-eqz v2, :cond_0

    .line 8
    .line 9
    move-object v2, v1

    .line 10
    check-cast v2, Lcom/friday/paint/view/six/NewPaintFragment$getNoteFragment$1;

    .line 11
    .line 12
    iget v3, v2, Lcom/friday/paint/view/six/NewPaintFragment$getNoteFragment$1;->j:I

    .line 13
    .line 14
    const/high16 v4, -0x80000000

    .line 15
    .line 16
    and-int v5, v3, v4

    .line 17
    .line 18
    if-eqz v5, :cond_0

    .line 19
    .line 20
    sub-int/2addr v3, v4

    .line 21
    iput v3, v2, Lcom/friday/paint/view/six/NewPaintFragment$getNoteFragment$1;->j:I

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    new-instance v2, Lcom/friday/paint/view/six/NewPaintFragment$getNoteFragment$1;

    .line 25
    .line 26
    invoke-direct {v2, v0, v1}, Lcom/friday/paint/view/six/NewPaintFragment$getNoteFragment$1;-><init>(Lcom/friday/paint/view/six/NewPaintFragment;Lvc/c;)V

    .line 27
    .line 28
    .line 29
    :goto_0
    iget-object v1, v2, Lcom/friday/paint/view/six/NewPaintFragment$getNoteFragment$1;->h:Ljava/lang/Object;

    .line 30
    .line 31
    invoke-static {}, Lwc/a;->f()Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v3

    .line 35
    iget v4, v2, Lcom/friday/paint/view/six/NewPaintFragment$getNoteFragment$1;->j:I

    .line 36
    .line 37
    const/4 v5, 0x2

    .line 38
    const/4 v6, 0x1

    .line 39
    if-eqz v4, :cond_3

    .line 40
    .line 41
    if-eq v4, v6, :cond_2

    .line 42
    .line 43
    if-ne v4, v5, :cond_1

    .line 44
    .line 45
    iget-boolean v3, v2, Lcom/friday/paint/view/six/NewPaintFragment$getNoteFragment$1;->g:Z

    .line 46
    .line 47
    iget-object v4, v2, Lcom/friday/paint/view/six/NewPaintFragment$getNoteFragment$1;->f:Ljava/lang/Object;

    .line 48
    .line 49
    check-cast v4, Ljava/lang/String;

    .line 50
    .line 51
    iget-object v5, v2, Lcom/friday/paint/view/six/NewPaintFragment$getNoteFragment$1;->e:Ljava/lang/Object;

    .line 52
    .line 53
    check-cast v5, Lcom/zykj/view/board/board/BoardFragment$a;

    .line 54
    .line 55
    iget-object v6, v2, Lcom/friday/paint/view/six/NewPaintFragment$getNoteFragment$1;->d:Ljava/lang/Object;

    .line 56
    .line 57
    check-cast v6, Lkb/y1;

    .line 58
    .line 59
    iget-object v2, v2, Lcom/friday/paint/view/six/NewPaintFragment$getNoteFragment$1;->c:Ljava/lang/Object;

    .line 60
    .line 61
    check-cast v2, Ljava/lang/String;

    .line 62
    .line 63
    invoke-static {v1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 64
    .line 65
    .line 66
    move v8, v3

    .line 67
    move-object v14, v5

    .line 68
    move-object v15, v6

    .line 69
    :goto_1
    move-object v13, v4

    .line 70
    goto/16 :goto_4

    .line 71
    .line 72
    :cond_1
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 73
    .line 74
    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 75
    .line 76
    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 77
    .line 78
    .line 79
    throw v1

    .line 80
    :cond_2
    iget-object v4, v2, Lcom/friday/paint/view/six/NewPaintFragment$getNoteFragment$1;->f:Ljava/lang/Object;

    .line 81
    .line 82
    check-cast v4, Ljava/lang/String;

    .line 83
    .line 84
    iget-object v6, v2, Lcom/friday/paint/view/six/NewPaintFragment$getNoteFragment$1;->e:Ljava/lang/Object;

    .line 85
    .line 86
    check-cast v6, Lcom/zykj/view/board/board/BoardFragment$a;

    .line 87
    .line 88
    iget-object v7, v2, Lcom/friday/paint/view/six/NewPaintFragment$getNoteFragment$1;->d:Ljava/lang/Object;

    .line 89
    .line 90
    check-cast v7, Lkb/y1;

    .line 91
    .line 92
    iget-object v8, v2, Lcom/friday/paint/view/six/NewPaintFragment$getNoteFragment$1;->c:Ljava/lang/Object;

    .line 93
    .line 94
    check-cast v8, Ljava/lang/String;

    .line 95
    .line 96
    invoke-static {v1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 97
    .line 98
    .line 99
    goto :goto_2

    .line 100
    :cond_3
    invoke-static {v1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 101
    .line 102
    .line 103
    sget-object v1, Lcom/zykj/view/board/board/BoardFragment;->i:Lcom/zykj/view/board/board/BoardFragment$a;

    .line 104
    .line 105
    invoke-direct {v0}, Lcom/friday/paint/view/six/NewPaintFragment;->getViewModel()Lcom/friday/paint/viewmodel/NewNoteViewModel;

    .line 106
    .line 107
    .line 108
    move-result-object v4

    .line 109
    invoke-static/range {p1 .. p1}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 110
    .line 111
    .line 112
    move-result-object v7

    .line 113
    iput-object v7, v2, Lcom/friday/paint/view/six/NewPaintFragment$getNoteFragment$1;->c:Ljava/lang/Object;

    .line 114
    .line 115
    move-object/from16 v7, p2

    .line 116
    .line 117
    iput-object v7, v2, Lcom/friday/paint/view/six/NewPaintFragment$getNoteFragment$1;->d:Ljava/lang/Object;

    .line 118
    .line 119
    iput-object v1, v2, Lcom/friday/paint/view/six/NewPaintFragment$getNoteFragment$1;->e:Ljava/lang/Object;

    .line 120
    .line 121
    move-object/from16 v8, p1

    .line 122
    .line 123
    iput-object v8, v2, Lcom/friday/paint/view/six/NewPaintFragment$getNoteFragment$1;->f:Ljava/lang/Object;

    .line 124
    .line 125
    iput v6, v2, Lcom/friday/paint/view/six/NewPaintFragment$getNoteFragment$1;->j:I

    .line 126
    .line 127
    invoke-virtual {v4, v2}, Lcom/friday/paint/viewmodel/NewNoteViewModel;->z(Lvc/c;)Ljava/lang/Object;

    .line 128
    .line 129
    .line 130
    move-result-object v4

    .line 131
    if-ne v4, v3, :cond_4

    .line 132
    .line 133
    goto :goto_3

    .line 134
    :cond_4
    move-object v6, v1

    .line 135
    move-object v1, v4

    .line 136
    move-object v4, v8

    .line 137
    :goto_2
    check-cast v1, Ljava/lang/Boolean;

    .line 138
    .line 139
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 140
    .line 141
    .line 142
    move-result v1

    .line 143
    invoke-direct {v0}, Lcom/friday/paint/view/six/NewPaintFragment;->getViewModel()Lcom/friday/paint/viewmodel/NewNoteViewModel;

    .line 144
    .line 145
    .line 146
    move-result-object v9

    .line 147
    invoke-static {v8}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 148
    .line 149
    .line 150
    move-result-object v8

    .line 151
    iput-object v8, v2, Lcom/friday/paint/view/six/NewPaintFragment$getNoteFragment$1;->c:Ljava/lang/Object;

    .line 152
    .line 153
    iput-object v7, v2, Lcom/friday/paint/view/six/NewPaintFragment$getNoteFragment$1;->d:Ljava/lang/Object;

    .line 154
    .line 155
    iput-object v6, v2, Lcom/friday/paint/view/six/NewPaintFragment$getNoteFragment$1;->e:Ljava/lang/Object;

    .line 156
    .line 157
    iput-object v4, v2, Lcom/friday/paint/view/six/NewPaintFragment$getNoteFragment$1;->f:Ljava/lang/Object;

    .line 158
    .line 159
    iput-boolean v1, v2, Lcom/friday/paint/view/six/NewPaintFragment$getNoteFragment$1;->g:Z

    .line 160
    .line 161
    iput v5, v2, Lcom/friday/paint/view/six/NewPaintFragment$getNoteFragment$1;->j:I

    .line 162
    .line 163
    invoke-virtual {v9, v2}, Lcom/friday/paint/viewmodel/NewNoteViewModel;->x(Lvc/c;)Ljava/lang/Object;

    .line 164
    .line 165
    .line 166
    move-result-object v2

    .line 167
    if-ne v2, v3, :cond_5

    .line 168
    .line 169
    :goto_3
    return-object v3

    .line 170
    :cond_5
    move v8, v1

    .line 171
    move-object v1, v2

    .line 172
    move-object v14, v6

    .line 173
    move-object v15, v7

    .line 174
    goto :goto_1

    .line 175
    :goto_4
    check-cast v1, Ljava/lang/Boolean;

    .line 176
    .line 177
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 178
    .line 179
    .line 180
    move-result v7

    .line 181
    sget-object v12, Lcom/zykj/view/board/board/g$a;->c:Lcom/zykj/view/board/board/g$a;

    .line 182
    .line 183
    new-instance v2, Lcom/zykj/view/board/board/d;

    .line 184
    .line 185
    const/4 v10, 0x1

    .line 186
    const/4 v11, 0x1

    .line 187
    const/4 v3, 0x1

    .line 188
    const/4 v4, 0x1

    .line 189
    const/4 v5, 0x1

    .line 190
    const/4 v6, 0x1

    .line 191
    const/4 v9, 0x1

    .line 192
    invoke-direct/range {v2 .. v12}, Lcom/zykj/view/board/board/d;-><init>(ZZZZZZZZZLcom/zykj/view/board/board/g;)V

    .line 193
    .line 194
    .line 195
    new-instance v3, Lkb/b1;

    .line 196
    .line 197
    const/16 v10, 0x23

    .line 198
    .line 199
    const/4 v11, 0x0

    .line 200
    const/4 v4, 0x0

    .line 201
    const/4 v5, 0x0

    .line 202
    const/4 v7, 0x2

    .line 203
    const/4 v8, 0x5

    .line 204
    const/4 v9, 0x0

    .line 205
    invoke-direct/range {v3 .. v11}, Lkb/b1;-><init>(Lcom/zykj/view/utils/ZoomPointSolution;ZZIIZILkotlin/jvm/internal/n;)V

    .line 206
    .line 207
    .line 208
    new-instance v16, Lkb/a;

    .line 209
    .line 210
    new-instance v1, Ld4/o0;

    .line 211
    .line 212
    invoke-direct {v1, v0}, Ld4/o0;-><init>(Lcom/friday/paint/view/six/NewPaintFragment;)V

    .line 213
    .line 214
    .line 215
    new-instance v4, Ld4/p0;

    .line 216
    .line 217
    invoke-direct {v4, v0}, Ld4/p0;-><init>(Lcom/friday/paint/view/six/NewPaintFragment;)V

    .line 218
    .line 219
    .line 220
    new-instance v5, Ld4/q0;

    .line 221
    .line 222
    invoke-direct {v5, v15, v0}, Ld4/q0;-><init>(Lkb/y1;Lcom/friday/paint/view/six/NewPaintFragment;)V

    .line 223
    .line 224
    .line 225
    new-instance v6, Ld4/c;

    .line 226
    .line 227
    invoke-direct {v6, v0}, Ld4/c;-><init>(Lcom/friday/paint/view/six/NewPaintFragment;)V

    .line 228
    .line 229
    .line 230
    new-instance v7, Ld4/d;

    .line 231
    .line 232
    invoke-direct {v7, v0}, Ld4/d;-><init>(Lcom/friday/paint/view/six/NewPaintFragment;)V

    .line 233
    .line 234
    .line 235
    new-instance v29, Ld4/e;

    .line 236
    .line 237
    invoke-direct/range {v29 .. v29}, Ld4/e;-><init>()V

    .line 238
    .line 239
    .line 240
    const/16 v30, 0x65c

    .line 241
    .line 242
    const/16 v31, 0x0

    .line 243
    .line 244
    const/16 v17, 0x0

    .line 245
    .line 246
    const/16 v19, 0x0

    .line 247
    .line 248
    const/16 v20, 0x0

    .line 249
    .line 250
    const/16 v21, 0x0

    .line 251
    .line 252
    const/16 v23, 0x0

    .line 253
    .line 254
    const/16 v26, 0x0

    .line 255
    .line 256
    const/16 v27, 0x0

    .line 257
    .line 258
    move-object/from16 v18, v1

    .line 259
    .line 260
    move-object/from16 v22, v4

    .line 261
    .line 262
    move-object/from16 v24, v5

    .line 263
    .line 264
    move-object/from16 v25, v6

    .line 265
    .line 266
    move-object/from16 v28, v7

    .line 267
    .line 268
    invoke-direct/range {v16 .. v31}, Lkb/a;-><init>(ZLhd/l;Lhd/p;Lhd/l;Lhd/l;Lhd/l;Lhd/l;Lhd/a;Lhd/a;Lhd/l;Lhd/l;Lhd/l;Lhd/l;ILkotlin/jvm/internal/n;)V

    .line 269
    .line 270
    .line 271
    move-object/from16 v1, v16

    .line 272
    .line 273
    invoke-virtual {v14, v13, v2, v3, v1}, Lcom/zykj/view/board/board/BoardFragment$a;->a(Ljava/lang/String;Lcom/zykj/view/board/board/d;Lkb/b1;Lkb/a;)Lcom/zykj/view/board/board/BoardFragment;

    .line 274
    .line 275
    .line 276
    move-result-object v1

    .line 277
    return-object v1
.end method

.method private static final getNoteFragment$lambda$61(Lcom/friday/paint/view/six/NewPaintFragment;Landroid/view/View;)Lqc/q;
    .locals 9

    .line 1
    const-string v0, "view"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const/4 v0, 0x0

    .line 7
    invoke-virtual {p1, v0}, Landroid/view/View;->setEnabled(Z)V

    .line 8
    .line 9
    .line 10
    invoke-direct {p0}, Lcom/friday/paint/view/six/NewPaintFragment;->getViewModel()Lcom/friday/paint/viewmodel/NewNoteViewModel;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    invoke-virtual {v0}, Lcom/friday/paint/viewmodel/NewNoteViewModel;->F()Landroidx/lifecycle/MutableLiveData;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 19
    .line 20
    invoke-virtual {v0, v1}, Landroidx/lifecycle/MutableLiveData;->setValue(Ljava/lang/Object;)V

    .line 21
    .line 22
    .line 23
    invoke-virtual {p0}, Lcom/friday/paint/view/six/NewPaintFragment;->getCurrentNoteFragment()Lcom/zykj/view/board/board/BoardFragment;

    .line 24
    .line 25
    .line 26
    move-result-object v3

    .line 27
    if-eqz v3, :cond_0

    .line 28
    .line 29
    new-instance v6, Ld4/k;

    .line 30
    .line 31
    invoke-direct {v6, p1, p0}, Ld4/k;-><init>(Landroid/view/View;Lcom/friday/paint/view/six/NewPaintFragment;)V

    .line 32
    .line 33
    .line 34
    const/4 v7, 0x6

    .line 35
    const/4 v8, 0x0

    .line 36
    const/4 v4, 0x0

    .line 37
    const/4 v5, 0x0

    .line 38
    move-object v2, p0

    .line 39
    invoke-static/range {v2 .. v8}, Lcom/friday/paint/view/six/NewPaintFragment;->save$default(Lcom/friday/paint/view/six/NewPaintFragment;Lcom/zykj/view/board/board/BoardFragment;ZLhd/l;Lhd/l;ILjava/lang/Object;)V

    .line 40
    .line 41
    .line 42
    goto :goto_0

    .line 43
    :cond_0
    const/4 p0, 0x1

    .line 44
    invoke-virtual {p1, p0}, Landroid/view/View;->setEnabled(Z)V

    .line 45
    .line 46
    .line 47
    :goto_0
    sget-object p0, Lqc/q;->a:Lqc/q;

    .line 48
    .line 49
    return-object p0
.end method

.method private static final getNoteFragment$lambda$61$lambda$59$lambda$58(Landroid/view/View;Lcom/friday/paint/view/six/NewPaintFragment;Ljava/lang/String;)Lqc/q;
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    invoke-virtual {p0, v0}, Landroid/view/View;->setEnabled(Z)V

    .line 3
    .line 4
    .line 5
    invoke-direct {p1, p2}, Lcom/friday/paint/view/six/NewPaintFragment;->updateThumbnailAndDb(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    sget-object p0, Lqc/q;->a:Lqc/q;

    .line 9
    .line 10
    return-object p0
.end method

.method private static final getNoteFragment$lambda$62(Lcom/friday/paint/view/six/NewPaintFragment;Lhd/a;)Lqc/q;
    .locals 1

    .line 1
    const-string v0, "it"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Lcom/friday/paint/view/six/NewPaintFragment;->startActivityToGallery()V

    .line 7
    .line 8
    .line 9
    sget-object p0, Lqc/q;->a:Lqc/q;

    .line 10
    .line 11
    return-object p0
.end method

.method private static final getNoteFragment$lambda$64(Lkb/y1;Lcom/friday/paint/view/six/NewPaintFragment;)Lqc/q;
    .locals 1

    .line 1
    if-eqz p0, :cond_0

    .line 2
    .line 3
    invoke-virtual {p1}, Lcom/friday/paint/view/six/NewPaintFragment;->getCurrentNoteFragment()Lcom/zykj/view/board/board/BoardFragment;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    invoke-virtual {v0, p0}, Lcom/zykj/view/board/board/BoardFragment;->M1(Lkb/y1;)V

    .line 10
    .line 11
    .line 12
    :cond_0
    const/4 p0, 0x0

    .line 13
    invoke-virtual {p1, p0}, Lcom/friday/common/base/BaseFragment;->isShowLoading(Z)V

    .line 14
    .line 15
    .line 16
    sget-object p0, Lqc/q;->a:Lqc/q;

    .line 17
    .line 18
    return-object p0
.end method

.method private static final getNoteFragment$lambda$65(Lcom/friday/paint/view/six/NewPaintFragment;)Lqc/q;
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-virtual {p0, v0}, Lcom/friday/common/base/BaseFragment;->isShowLoading(Z)V

    .line 3
    .line 4
    .line 5
    const-string p0, "\u8be5\u9875\u6570\u636e\u5f02\u5e38"

    .line 6
    .line 7
    invoke-static {p0}, Lz1/b;->i(Ljava/lang/CharSequence;)V

    .line 8
    .line 9
    .line 10
    sget-object p0, Lqc/q;->a:Lqc/q;

    .line 11
    .line 12
    return-object p0
.end method

.method private static final getNoteFragment$lambda$66(Lcom/friday/paint/view/six/NewPaintFragment;Ljava/lang/String;)Lqc/q;
    .locals 2

    .line 1
    const-string v0, "imagePath"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-lez v0, :cond_0

    .line 11
    .line 12
    new-instance v0, Ljava/lang/StringBuilder;

    .line 13
    .line 14
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 15
    .line 16
    .line 17
    const-string v1, "\u9875\u9762NewPaintFragment -> onImageDelete, imagePath="

    .line 18
    .line 19
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 20
    .line 21
    .line 22
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 23
    .line 24
    .line 25
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    filled-new-array {v0}, [Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    invoke-static {v0}, Lcom/blankj/utilcode/util/LogUtils;->i([Ljava/lang/Object;)V

    .line 34
    .line 35
    .line 36
    invoke-direct {p0}, Lcom/friday/paint/view/six/NewPaintFragment;->getViewModel()Lcom/friday/paint/viewmodel/NewNoteViewModel;

    .line 37
    .line 38
    .line 39
    move-result-object p0

    .line 40
    invoke-virtual {p0, p1}, Lcom/friday/paint/viewmodel/NewNoteViewModel;->T(Ljava/lang/String;)V

    .line 41
    .line 42
    .line 43
    :cond_0
    sget-object p0, Lqc/q;->a:Lqc/q;

    .line 44
    .line 45
    return-object p0
.end method

.method private static final getNoteFragment$lambda$67(Ljava/lang/String;)Lqc/q;
    .locals 6

    .line 1
    const-string v0, "it"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance v0, Lcom/friday/common/util/CustomException;

    .line 7
    .line 8
    sget-object v1, Lcom/friday/common/helper/b;->a:Lcom/friday/common/helper/b$a;

    .line 9
    .line 10
    invoke-virtual {v1}, Lcom/friday/common/helper/b$a;->a()Lcom/friday/common/helper/b;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    invoke-virtual {v1}, Lcom/friday/common/helper/b;->t()J

    .line 15
    .line 16
    .line 17
    move-result-wide v1

    .line 18
    invoke-static {}, Lcom/blankj/utilcode/util/TimeUtils;->getNowString()Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object v3

    .line 22
    new-instance v4, Ljava/lang/StringBuilder;

    .line 23
    .line 24
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 25
    .line 26
    .line 27
    const-string v5, "["

    .line 28
    .line 29
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 30
    .line 31
    .line 32
    invoke-virtual {v4, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 33
    .line 34
    .line 35
    const-string v1, "]["

    .line 36
    .line 37
    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 38
    .line 39
    .line 40
    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 41
    .line 42
    .line 43
    const-string v1, "]"

    .line 44
    .line 45
    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 46
    .line 47
    .line 48
    invoke-virtual {v4, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 49
    .line 50
    .line 51
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 52
    .line 53
    .line 54
    move-result-object p0

    .line 55
    invoke-direct {v0, p0}, Lcom/friday/common/util/CustomException;-><init>(Ljava/lang/String;)V

    .line 56
    .line 57
    .line 58
    invoke-static {v0}, Lcom/tencent/bugly/crashreport/CrashReport;->postCatchedException(Ljava/lang/Throwable;)V

    .line 59
    .line 60
    .line 61
    sget-object p0, Lqc/q;->a:Lqc/q;

    .line 62
    .line 63
    return-object p0
.end method

.method private final getViewModel()Lcom/friday/paint/viewmodel/NewNoteViewModel;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/friday/paint/view/six/NewPaintFragment;->viewModel$delegate:Lqc/d;

    .line 2
    .line 3
    invoke-interface {v0}, Lqc/d;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lcom/friday/paint/viewmodel/NewNoteViewModel;

    .line 8
    .line 9
    return-object v0
.end method

.method private final handleMdbUpdate(Ljava/lang/String;)V
    .locals 4

    .line 1
    const-string v0, "NewPaintFragment.kt -> copyNote(),\u5f00\u59cb\u590d\u5236\u65b0\u7b14\u8bb0"

    .line 2
    .line 3
    filled-new-array {v0}, [Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-static {v0}, Lcom/blankj/utilcode/util/LogUtils;->d([Ljava/lang/Object;)V

    .line 8
    .line 9
    .line 10
    new-instance v0, Ljava/io/File;

    .line 11
    .line 12
    const-string v1, "page_mdb"

    .line 13
    .line 14
    invoke-direct {v0, p1, v1}, Ljava/io/File;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    invoke-static {}, Lcom/zykj/blackboard/core/data/dao/a;->y()Ljc/c;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    invoke-static {}, Lcom/blankj/utilcode/util/Utils;->getApp()Landroid/app/Application;

    .line 22
    .line 23
    .line 24
    move-result-object v2

    .line 25
    invoke-virtual {v1, v2}, Ljc/c;->a(Ljava/lang/Object;)Ljc/c;

    .line 26
    .line 27
    .line 28
    move-result-object v1

    .line 29
    invoke-virtual {v1, v0}, Ljc/c;->f(Ljava/io/File;)Ljc/c;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    invoke-virtual {v0}, Ljc/c;->b()Lio/objectbox/BoxStore;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    :try_start_0
    const-class v1, Lcom/zykj/blackboard/core/data/dao/PageEntity;

    .line 38
    .line 39
    invoke-virtual {v0, v1}, Lio/objectbox/BoxStore;->g(Ljava/lang/Class;)Ljc/a;

    .line 40
    .line 41
    .line 42
    move-result-object v1

    .line 43
    invoke-virtual {v1}, Ljc/a;->e()Ljava/util/List;

    .line 44
    .line 45
    .line 46
    move-result-object v2

    .line 47
    new-instance v3, Ld4/l;

    .line 48
    .line 49
    invoke-direct {v3, v2, v1, p1, v0}, Ld4/l;-><init>(Ljava/util/List;Ljc/a;Ljava/lang/String;Lio/objectbox/BoxStore;)V

    .line 50
    .line 51
    .line 52
    invoke-virtual {v0, v3}, Lio/objectbox/BoxStore;->I(Ljava/lang/Runnable;)V

    .line 53
    .line 54
    .line 55
    const-string p1, "\u9875\u9762NewPaintFragment.kt -> ObjectBox \uff0c MDB\u6a21\u5f0f\u6570\u636e\u540c\u6b65\u4fee\u6b63\u5b8c\u6210"

    .line 56
    .line 57
    filled-new-array {p1}, [Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    move-result-object p1

    .line 61
    invoke-static {p1}, Lcom/blankj/utilcode/util/LogUtils;->i([Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 62
    .line 63
    .line 64
    invoke-virtual {v0}, Lio/objectbox/BoxStore;->close()V

    .line 65
    .line 66
    .line 67
    return-void

    .line 68
    :catchall_0
    move-exception p1

    .line 69
    goto :goto_0

    .line 70
    :catch_0
    move-exception p1

    .line 71
    :try_start_1
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 72
    .line 73
    .line 74
    move-result-object v1

    .line 75
    new-instance v2, Ljava/lang/StringBuilder;

    .line 76
    .line 77
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 78
    .line 79
    .line 80
    const-string v3, "\u9875\u9762NewPaintFragment.kt -> ObjectBox\uff0cMDB\u5931\u8d25: "

    .line 81
    .line 82
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 83
    .line 84
    .line 85
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 86
    .line 87
    .line 88
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 89
    .line 90
    .line 91
    move-result-object v1

    .line 92
    filled-new-array {v1}, [Ljava/lang/Object;

    .line 93
    .line 94
    .line 95
    move-result-object v1

    .line 96
    invoke-static {v1}, Lcom/blankj/utilcode/util/LogUtils;->e([Ljava/lang/Object;)V

    .line 97
    .line 98
    .line 99
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 100
    .line 101
    .line 102
    invoke-virtual {v0}, Lio/objectbox/BoxStore;->close()V

    .line 103
    .line 104
    .line 105
    return-void

    .line 106
    :goto_0
    invoke-virtual {v0}, Lio/objectbox/BoxStore;->close()V

    .line 107
    .line 108
    .line 109
    throw p1
.end method

.method private static final handleMdbUpdate$lambda$51(Ljava/util/List;Ljc/a;Ljava/lang/String;Lio/objectbox/BoxStore;)V
    .locals 10

    .line 1
    invoke-static {p0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 2
    .line 3
    .line 4
    move-object v0, p0

    .line 5
    check-cast v0, Ljava/lang/Iterable;

    .line 6
    .line 7
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    const/4 v1, 0x0

    .line 12
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 13
    .line 14
    .line 15
    move-result v2

    .line 16
    if-eqz v2, :cond_4

    .line 17
    .line 18
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object v2

    .line 22
    add-int/lit8 v3, v1, 0x1

    .line 23
    .line 24
    if-gez v1, :cond_0

    .line 25
    .line 26
    invoke-static {}, Lrc/w;->w()V

    .line 27
    .line 28
    .line 29
    :cond_0
    check-cast v2, Lcom/zykj/blackboard/core/data/dao/PageEntity;

    .line 30
    .line 31
    invoke-virtual {v2}, Lcom/zykj/blackboard/core/data/dao/PageEntity;->d()Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object v1

    .line 35
    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    .line 36
    .line 37
    .line 38
    move-result-object v4

    .line 39
    invoke-virtual {v4}, Ljava/util/UUID;->toString()Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object v4

    .line 43
    const-string v5, "toString(...)"

    .line 44
    .line 45
    invoke-static {v4, v5}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 46
    .line 47
    .line 48
    new-instance v5, Ljava/io/File;

    .line 49
    .line 50
    invoke-direct {v5, p2, v1}, Ljava/io/File;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 51
    .line 52
    .line 53
    invoke-virtual {v5}, Ljava/io/File;->exists()Z

    .line 54
    .line 55
    .line 56
    move-result v6

    .line 57
    if-eqz v6, :cond_2

    .line 58
    .line 59
    invoke-static {v5, v4}, Lcom/blankj/utilcode/util/FileUtils;->rename(Ljava/io/File;Ljava/lang/String;)Z

    .line 60
    .line 61
    .line 62
    move-result v5

    .line 63
    invoke-virtual {v2}, Lcom/zykj/blackboard/core/data/dao/PageEntity;->f()J

    .line 64
    .line 65
    .line 66
    move-result-wide v6

    .line 67
    if-eqz v5, :cond_1

    .line 68
    .line 69
    const-string v5, "\u6210\u529f"

    .line 70
    .line 71
    goto :goto_1

    .line 72
    :cond_1
    const-string v5, "\u5931\u8d25"

    .line 73
    .line 74
    :goto_1
    new-instance v8, Ljava/lang/StringBuilder;

    .line 75
    .line 76
    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    .line 77
    .line 78
    .line 79
    const-string v9, "\u9875\u9762NewPaintFragment.kt -> ObjectBox,  copyNote()\uff0c\u9875\u9762 "

    .line 80
    .line 81
    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 82
    .line 83
    .line 84
    invoke-virtual {v8, v6, v7}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 85
    .line 86
    .line 87
    const-string v6, ": \u7269\u7406\u91cd\u547d\u540d ["

    .line 88
    .line 89
    invoke-virtual {v8, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 90
    .line 91
    .line 92
    invoke-virtual {v8, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 93
    .line 94
    .line 95
    const-string v1, "] -> ["

    .line 96
    .line 97
    invoke-virtual {v8, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 98
    .line 99
    .line 100
    invoke-virtual {v8, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 101
    .line 102
    .line 103
    const-string v1, "] "

    .line 104
    .line 105
    invoke-virtual {v8, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 106
    .line 107
    .line 108
    invoke-virtual {v8, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 109
    .line 110
    .line 111
    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 112
    .line 113
    .line 114
    move-result-object v1

    .line 115
    filled-new-array {v1}, [Ljava/lang/Object;

    .line 116
    .line 117
    .line 118
    move-result-object v1

    .line 119
    invoke-static {v1}, Lcom/blankj/utilcode/util/LogUtils;->i([Ljava/lang/Object;)V

    .line 120
    .line 121
    .line 122
    goto :goto_2

    .line 123
    :cond_2
    new-instance v5, Ljava/lang/StringBuilder;

    .line 124
    .line 125
    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    .line 126
    .line 127
    .line 128
    const-string v6, "\u9875\u9762NewPaintFragment.kt -> ObjectBox,  copyNote()\uff0cObjectBox,\u627e\u4e0d\u5230\u7269\u7406\u6587\u4ef6\u5939 "

    .line 129
    .line 130
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 131
    .line 132
    .line 133
    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 134
    .line 135
    .line 136
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 137
    .line 138
    .line 139
    move-result-object v1

    .line 140
    filled-new-array {v1}, [Ljava/lang/Object;

    .line 141
    .line 142
    .line 143
    move-result-object v1

    .line 144
    invoke-static {v1}, Lcom/blankj/utilcode/util/LogUtils;->e([Ljava/lang/Object;)V

    .line 145
    .line 146
    .line 147
    :goto_2
    invoke-virtual {v2, v4}, Lcom/zykj/blackboard/core/data/dao/PageEntity;->m(Ljava/lang/String;)V

    .line 148
    .line 149
    .line 150
    new-instance v1, Ljava/lang/StringBuilder;

    .line 151
    .line 152
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 153
    .line 154
    .line 155
    const-string v5, "\u66f4\u65b0 PageEntity \u5b57\u6bb5: dirName \u5df2\u8bbe\u4e3a "

    .line 156
    .line 157
    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 158
    .line 159
    .line 160
    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 161
    .line 162
    .line 163
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 164
    .line 165
    .line 166
    move-result-object v1

    .line 167
    const-string v4, "\u9875\u9762NewPaintFragment.kt -> ObjectBox,copyNote()"

    .line 168
    .line 169
    filled-new-array {v4, v1}, [Ljava/lang/Object;

    .line 170
    .line 171
    .line 172
    move-result-object v1

    .line 173
    invoke-static {v1}, Lcom/blankj/utilcode/util/LogUtils;->d([Ljava/lang/Object;)V

    .line 174
    .line 175
    .line 176
    invoke-virtual {v2}, Lcom/zykj/blackboard/core/data/dao/PageEntity;->a()Lio/objectbox/relation/ToOne;

    .line 177
    .line 178
    .line 179
    move-result-object v1

    .line 180
    invoke-virtual {v1}, Lio/objectbox/relation/ToOne;->d()Ljava/lang/Object;

    .line 181
    .line 182
    .line 183
    move-result-object v1

    .line 184
    check-cast v1, Lcom/zykj/blackboard/core/data/dao/BlackBoardEntity;

    .line 185
    .line 186
    if-eqz v1, :cond_3

    .line 187
    .line 188
    invoke-virtual {v1, p2}, Lcom/zykj/blackboard/core/data/dao/BlackBoardEntity;->e(Ljava/lang/String;)V

    .line 189
    .line 190
    .line 191
    const-class v2, Lcom/zykj/blackboard/core/data/dao/BlackBoardEntity;

    .line 192
    .line 193
    invoke-virtual {p3, v2}, Lio/objectbox/BoxStore;->g(Ljava/lang/Class;)Ljc/a;

    .line 194
    .line 195
    .line 196
    move-result-object v2

    .line 197
    invoke-virtual {v2, v1}, Ljc/a;->m(Ljava/lang/Object;)J

    .line 198
    .line 199
    .line 200
    :cond_3
    move v1, v3

    .line 201
    goto/16 :goto_0

    .line 202
    .line 203
    :cond_4
    check-cast p0, Ljava/util/Collection;

    .line 204
    .line 205
    invoke-virtual {p1, p0}, Ljc/a;->n(Ljava/util/Collection;)V

    .line 206
    .line 207
    .line 208
    return-void
.end method

.method private final initClick()V
    .locals 7

    .line 1
    invoke-virtual {p0}, Lcom/friday/common/base/BaseFragment;->getMBinding()Landroidx/databinding/ViewDataBinding;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    check-cast v0, Lcom/friday/paint/databinding/ResFragmentNewPaintBinding;

    .line 6
    .line 7
    iget-object v0, v0, Lcom/friday/paint/databinding/ResFragmentNewPaintBinding;->h:Landroid/widget/ImageView;

    .line 8
    .line 9
    const-string v1, "ivBack"

    .line 10
    .line 11
    invoke-static {v0, v1}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    new-instance v1, Ld4/h0;

    .line 15
    .line 16
    invoke-direct {v1, p0}, Ld4/h0;-><init>(Lcom/friday/paint/view/six/NewPaintFragment;)V

    .line 17
    .line 18
    .line 19
    invoke-static {v0, v1}, Lcom/friday/paint/view/six/i;->b(Landroid/view/View;Lhd/l;)V

    .line 20
    .line 21
    .line 22
    invoke-virtual {p0}, Lcom/friday/common/base/BaseFragment;->getMBinding()Landroidx/databinding/ViewDataBinding;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    check-cast v0, Lcom/friday/paint/databinding/ResFragmentNewPaintBinding;

    .line 27
    .line 28
    iget-object v0, v0, Lcom/friday/paint/databinding/ResFragmentNewPaintBinding;->g:Landroid/widget/ImageView;

    .line 29
    .line 30
    const-string v1, "ivAsk"

    .line 31
    .line 32
    invoke-static {v0, v1}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    new-instance v1, Ld4/j0;

    .line 36
    .line 37
    invoke-direct {v1, p0}, Ld4/j0;-><init>(Lcom/friday/paint/view/six/NewPaintFragment;)V

    .line 38
    .line 39
    .line 40
    invoke-static {v0, v1}, Lcom/friday/paint/view/six/i;->b(Landroid/view/View;Lhd/l;)V

    .line 41
    .line 42
    .line 43
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->requireActivity()Landroidx/fragment/app/FragmentActivity;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    invoke-virtual {v0}, Landroidx/activity/ComponentActivity;->getOnBackPressedDispatcher()Landroidx/activity/OnBackPressedDispatcher;

    .line 48
    .line 49
    .line 50
    move-result-object v1

    .line 51
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getViewLifecycleOwner()Landroidx/lifecycle/LifecycleOwner;

    .line 52
    .line 53
    .line 54
    move-result-object v2

    .line 55
    new-instance v4, Ld4/k0;

    .line 56
    .line 57
    invoke-direct {v4, p0}, Ld4/k0;-><init>(Lcom/friday/paint/view/six/NewPaintFragment;)V

    .line 58
    .line 59
    .line 60
    const/4 v5, 0x2

    .line 61
    const/4 v6, 0x0

    .line 62
    const/4 v3, 0x0

    .line 63
    invoke-static/range {v1 .. v6}, Landroidx/activity/OnBackPressedDispatcherKt;->addCallback$default(Landroidx/activity/OnBackPressedDispatcher;Landroidx/lifecycle/LifecycleOwner;ZLhd/l;ILjava/lang/Object;)Landroidx/activity/OnBackPressedCallback;

    .line 64
    .line 65
    .line 66
    return-void
.end method

.method private static final initClick$lambda$7(Lcom/friday/paint/view/six/NewPaintFragment;Landroid/view/View;)Lqc/q;
    .locals 7

    .line 1
    const-string v0, "it"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const/4 p1, 0x1

    .line 7
    invoke-virtual {p0, p1}, Lcom/friday/common/base/BaseFragment;->isShowLoading(Z)V

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0}, Lcom/friday/paint/view/six/NewPaintFragment;->getCurrentNoteFragment()Lcom/zykj/view/board/board/BoardFragment;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    if-eqz v1, :cond_0

    .line 15
    .line 16
    new-instance v3, Ld4/f0;

    .line 17
    .line 18
    invoke-direct {v3, p0}, Ld4/f0;-><init>(Lcom/friday/paint/view/six/NewPaintFragment;)V

    .line 19
    .line 20
    .line 21
    new-instance v4, Ld4/g0;

    .line 22
    .line 23
    invoke-direct {v4, p0}, Ld4/g0;-><init>(Lcom/friday/paint/view/six/NewPaintFragment;)V

    .line 24
    .line 25
    .line 26
    const/4 v5, 0x2

    .line 27
    const/4 v6, 0x0

    .line 28
    const/4 v2, 0x0

    .line 29
    move-object v0, p0

    .line 30
    invoke-static/range {v0 .. v6}, Lcom/friday/paint/view/six/NewPaintFragment;->save$default(Lcom/friday/paint/view/six/NewPaintFragment;Lcom/zykj/view/board/board/BoardFragment;ZLhd/l;Lhd/l;ILjava/lang/Object;)V

    .line 31
    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_0
    move-object v0, p0

    .line 35
    invoke-direct {v0}, Lcom/friday/paint/view/six/NewPaintFragment;->getViewModel()Lcom/friday/paint/viewmodel/NewNoteViewModel;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    invoke-virtual {p0}, Lcom/friday/paint/viewmodel/NewNoteViewModel;->F()Landroidx/lifecycle/MutableLiveData;

    .line 40
    .line 41
    .line 42
    move-result-object p0

    .line 43
    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 44
    .line 45
    invoke-virtual {p0, v1}, Landroidx/lifecycle/MutableLiveData;->setValue(Ljava/lang/Object;)V

    .line 46
    .line 47
    .line 48
    invoke-direct {v0}, Lcom/friday/paint/view/six/NewPaintFragment;->getViewModel()Lcom/friday/paint/viewmodel/NewNoteViewModel;

    .line 49
    .line 50
    .line 51
    move-result-object p0

    .line 52
    invoke-virtual {p0, p1}, Lcom/friday/paint/viewmodel/NewNoteViewModel;->c0(Z)V

    .line 53
    .line 54
    .line 55
    :goto_0
    sget-object p0, Lqc/q;->a:Lqc/q;

    .line 56
    .line 57
    return-object p0
.end method

.method private static final initClick$lambda$7$lambda$5$lambda$3(Lcom/friday/paint/view/six/NewPaintFragment;Ljava/lang/Throwable;)Lqc/q;
    .locals 1

    .line 1
    const-string v0, "it"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const/4 p1, 0x0

    .line 7
    invoke-virtual {p0, p1}, Lcom/friday/common/base/BaseFragment;->isShowLoading(Z)V

    .line 8
    .line 9
    .line 10
    const-string v0, "\u7b14\u8bb0\u4fdd\u5b58\u5931\u8d25"

    .line 11
    .line 12
    new-array p1, p1, [Ljava/lang/Object;

    .line 13
    .line 14
    invoke-static {v0, p1}, Lcom/blankj/utilcode/util/ToastUtils;->showShort(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 15
    .line 16
    .line 17
    const-string p1, "NewPaintFragment -> initClick -> save\u4fdd\u5b58\u7b14\u8bb0\u5931\u8d25"

    .line 18
    .line 19
    filled-new-array {p1}, [Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    invoke-static {p1}, Lcom/blankj/utilcode/util/LogUtils;->e([Ljava/lang/Object;)V

    .line 24
    .line 25
    .line 26
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->requireActivity()Landroidx/fragment/app/FragmentActivity;

    .line 27
    .line 28
    .line 29
    move-result-object p0

    .line 30
    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    .line 31
    .line 32
    .line 33
    sget-object p0, Lqc/q;->a:Lqc/q;

    .line 34
    .line 35
    return-object p0
.end method

.method private static final initClick$lambda$7$lambda$5$lambda$4(Lcom/friday/paint/view/six/NewPaintFragment;Ljava/lang/String;)Lqc/q;
    .locals 1

    .line 1
    invoke-direct {p0}, Lcom/friday/paint/view/six/NewPaintFragment;->getViewModel()Lcom/friday/paint/viewmodel/NewNoteViewModel;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-virtual {p1}, Lcom/friday/paint/viewmodel/NewNoteViewModel;->F()Landroidx/lifecycle/MutableLiveData;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 10
    .line 11
    invoke-virtual {p1, v0}, Landroidx/lifecycle/MutableLiveData;->setValue(Ljava/lang/Object;)V

    .line 12
    .line 13
    .line 14
    invoke-direct {p0}, Lcom/friday/paint/view/six/NewPaintFragment;->getViewModel()Lcom/friday/paint/viewmodel/NewNoteViewModel;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    const/4 p1, 0x1

    .line 19
    invoke-virtual {p0, p1}, Lcom/friday/paint/viewmodel/NewNoteViewModel;->c0(Z)V

    .line 20
    .line 21
    .line 22
    sget-object p0, Lqc/q;->a:Lqc/q;

    .line 23
    .line 24
    return-object p0
.end method

.method private static final initClick$lambda$8(Lcom/friday/paint/view/six/NewPaintFragment;Landroid/view/View;)Lqc/q;
    .locals 7

    .line 1
    const-string v0, "it"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getViewLifecycleOwner()Landroidx/lifecycle/LifecycleOwner;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    const-string v0, "getViewLifecycleOwner(...)"

    .line 11
    .line 12
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    invoke-static {p1}, Landroidx/lifecycle/LifecycleOwnerKt;->getLifecycleScope(Landroidx/lifecycle/LifecycleOwner;)Landroidx/lifecycle/LifecycleCoroutineScope;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    new-instance v4, Lcom/friday/paint/view/six/NewPaintFragment$initClick$2$1;

    .line 20
    .line 21
    const/4 p1, 0x0

    .line 22
    invoke-direct {v4, p0, p1}, Lcom/friday/paint/view/six/NewPaintFragment$initClick$2$1;-><init>(Lcom/friday/paint/view/six/NewPaintFragment;Lvc/c;)V

    .line 23
    .line 24
    .line 25
    const/4 v5, 0x3

    .line 26
    const/4 v6, 0x0

    .line 27
    const/4 v2, 0x0

    .line 28
    const/4 v3, 0x0

    .line 29
    invoke-static/range {v1 .. v6}, Lsd/f;->d(Lsd/i0;Lkotlin/coroutines/d;Lkotlinx/coroutines/CoroutineStart;Lhd/p;ILjava/lang/Object;)Lkotlinx/coroutines/g;

    .line 30
    .line 31
    .line 32
    sget-object p0, Lqc/q;->a:Lqc/q;

    .line 33
    .line 34
    return-object p0
.end method

.method private static final initClick$lambda$9(Lcom/friday/paint/view/six/NewPaintFragment;Landroidx/activity/OnBackPressedCallback;)Lqc/q;
    .locals 1

    .line 1
    const-string v0, "$this$addCallback"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Lcom/friday/common/base/BaseFragment;->getMBinding()Landroidx/databinding/ViewDataBinding;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    check-cast p0, Lcom/friday/paint/databinding/ResFragmentNewPaintBinding;

    .line 11
    .line 12
    iget-object p0, p0, Lcom/friday/paint/databinding/ResFragmentNewPaintBinding;->h:Landroid/widget/ImageView;

    .line 13
    .line 14
    invoke-virtual {p0}, Landroid/view/View;->performClick()Z

    .line 15
    .line 16
    .line 17
    sget-object p0, Lqc/q;->a:Lqc/q;

    .line 18
    .line 19
    return-object p0
.end method

.method private final initDrawerRight()V
    .locals 4

    .line 1
    invoke-virtual {p0}, Lcom/friday/common/base/BaseFragment;->getMBinding()Landroidx/databinding/ViewDataBinding;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    check-cast v0, Lcom/friday/paint/databinding/ResFragmentNewPaintBinding;

    .line 6
    .line 7
    iget-object v0, v0, Lcom/friday/paint/databinding/ResFragmentNewPaintBinding;->k:Landroid/widget/ImageView;

    .line 8
    .line 9
    const-string v1, "ivDrawerHint"

    .line 10
    .line 11
    invoke-static {v0, v1}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    new-instance v1, Ld4/n;

    .line 15
    .line 16
    invoke-direct {v1, p0}, Ld4/n;-><init>(Lcom/friday/paint/view/six/NewPaintFragment;)V

    .line 17
    .line 18
    .line 19
    invoke-static {v0, v1}, Lcom/friday/paint/view/six/i;->b(Landroid/view/View;Lhd/l;)V

    .line 20
    .line 21
    .line 22
    invoke-virtual {p0}, Lcom/friday/common/base/BaseFragment;->getMBinding()Landroidx/databinding/ViewDataBinding;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    check-cast v0, Lcom/friday/paint/databinding/ResFragmentNewPaintBinding;

    .line 27
    .line 28
    iget-object v0, v0, Lcom/friday/paint/databinding/ResFragmentNewPaintBinding;->l:Landroid/widget/ImageView;

    .line 29
    .line 30
    const-string v1, "ivNextPage"

    .line 31
    .line 32
    invoke-static {v0, v1}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    new-instance v1, Ld4/o;

    .line 36
    .line 37
    invoke-direct {v1, p0}, Ld4/o;-><init>(Lcom/friday/paint/view/six/NewPaintFragment;)V

    .line 38
    .line 39
    .line 40
    invoke-static {v0, v1}, Lcom/friday/paint/view/six/i;->b(Landroid/view/View;Lhd/l;)V

    .line 41
    .line 42
    .line 43
    invoke-virtual {p0}, Lcom/friday/common/base/BaseFragment;->getMBinding()Landroidx/databinding/ViewDataBinding;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    check-cast v0, Lcom/friday/paint/databinding/ResFragmentNewPaintBinding;

    .line 48
    .line 49
    iget-object v0, v0, Lcom/friday/paint/databinding/ResFragmentNewPaintBinding;->m:Landroid/widget/ImageView;

    .line 50
    .line 51
    const-string v1, "ivPrevPage"

    .line 52
    .line 53
    invoke-static {v0, v1}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 54
    .line 55
    .line 56
    new-instance v1, Ld4/p;

    .line 57
    .line 58
    invoke-direct {v1, p0}, Ld4/p;-><init>(Lcom/friday/paint/view/six/NewPaintFragment;)V

    .line 59
    .line 60
    .line 61
    invoke-static {v0, v1}, Lcom/friday/paint/view/six/i;->b(Landroid/view/View;Lhd/l;)V

    .line 62
    .line 63
    .line 64
    invoke-virtual {p0}, Lcom/friday/common/base/BaseFragment;->getMBinding()Landroidx/databinding/ViewDataBinding;

    .line 65
    .line 66
    .line 67
    move-result-object v0

    .line 68
    check-cast v0, Lcom/friday/paint/databinding/ResFragmentNewPaintBinding;

    .line 69
    .line 70
    iget-object v0, v0, Lcom/friday/paint/databinding/ResFragmentNewPaintBinding;->q:Landroid/widget/LinearLayout;

    .line 71
    .line 72
    const/4 v1, 0x1

    .line 73
    invoke-virtual {v0, v1}, Landroid/view/View;->setClickable(Z)V

    .line 74
    .line 75
    .line 76
    invoke-virtual {p0}, Lcom/friday/common/base/BaseFragment;->getMBinding()Landroidx/databinding/ViewDataBinding;

    .line 77
    .line 78
    .line 79
    move-result-object v0

    .line 80
    check-cast v0, Lcom/friday/paint/databinding/ResFragmentNewPaintBinding;

    .line 81
    .line 82
    iget-object v0, v0, Lcom/friday/paint/databinding/ResFragmentNewPaintBinding;->s:Landroidx/recyclerview/widget/RecyclerView;

    .line 83
    .line 84
    new-instance v2, Landroidx/recyclerview/widget/LinearLayoutManager;

    .line 85
    .line 86
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->requireActivity()Landroidx/fragment/app/FragmentActivity;

    .line 87
    .line 88
    .line 89
    move-result-object v3

    .line 90
    invoke-direct {v2, v3}, Landroidx/recyclerview/widget/LinearLayoutManager;-><init>(Landroid/content/Context;)V

    .line 91
    .line 92
    .line 93
    invoke-virtual {v0, v2}, Landroidx/recyclerview/widget/RecyclerView;->setLayoutManager(Landroidx/recyclerview/widget/RecyclerView$LayoutManager;)V

    .line 94
    .line 95
    .line 96
    invoke-virtual {p0}, Lcom/friday/paint/view/six/NewPaintFragment;->getRightNoteListAdapter()Lcom/friday/paint/view/six/NewThumbnailListAdapter;

    .line 97
    .line 98
    .line 99
    move-result-object v2

    .line 100
    invoke-virtual {v0, v2}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(Landroidx/recyclerview/widget/RecyclerView$Adapter;)V

    .line 101
    .line 102
    .line 103
    invoke-virtual {p0}, Lcom/friday/paint/view/six/NewPaintFragment;->getRightNoteListAdapter()Lcom/friday/paint/view/six/NewThumbnailListAdapter;

    .line 104
    .line 105
    .line 106
    move-result-object v2

    .line 107
    new-instance v3, Ld4/q;

    .line 108
    .line 109
    invoke-direct {v3, p0}, Ld4/q;-><init>(Lcom/friday/paint/view/six/NewPaintFragment;)V

    .line 110
    .line 111
    .line 112
    invoke-virtual {v2, v3}, Lcom/chad/library/adapter/base/BaseQuickAdapter;->setOnItemClickListener(Lo1/d;)V

    .line 113
    .line 114
    .line 115
    new-instance v2, Lcom/friday/paint/view/six/NewPaintFragment$initDrawerRight$4$2;

    .line 116
    .line 117
    invoke-direct {v2, v0}, Lcom/friday/paint/view/six/NewPaintFragment$initDrawerRight$4$2;-><init>(Landroidx/recyclerview/widget/RecyclerView;)V

    .line 118
    .line 119
    .line 120
    invoke-virtual {v0, v2}, Landroidx/recyclerview/widget/RecyclerView;->addItemDecoration(Landroidx/recyclerview/widget/RecyclerView$ItemDecoration;)V

    .line 121
    .line 122
    .line 123
    invoke-virtual {p0}, Lcom/friday/common/base/BaseFragment;->getMBinding()Landroidx/databinding/ViewDataBinding;

    .line 124
    .line 125
    .line 126
    move-result-object v0

    .line 127
    check-cast v0, Lcom/friday/paint/databinding/ResFragmentNewPaintBinding;

    .line 128
    .line 129
    iget-object v0, v0, Lcom/friday/paint/databinding/ResFragmentNewPaintBinding;->c:Landroidx/drawerlayout/widget/DrawerLayout;

    .line 130
    .line 131
    invoke-virtual {v0, v1}, Landroidx/drawerlayout/widget/DrawerLayout;->setDrawerLockMode(I)V

    .line 132
    .line 133
    .line 134
    invoke-virtual {p0}, Lcom/friday/common/base/BaseFragment;->getMBinding()Landroidx/databinding/ViewDataBinding;

    .line 135
    .line 136
    .line 137
    move-result-object v0

    .line 138
    check-cast v0, Lcom/friday/paint/databinding/ResFragmentNewPaintBinding;

    .line 139
    .line 140
    iget-object v0, v0, Lcom/friday/paint/databinding/ResFragmentNewPaintBinding;->n:Landroid/widget/ImageView;

    .line 141
    .line 142
    const-string v2, "ivRemovePage"

    .line 143
    .line 144
    invoke-static {v0, v2}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 145
    .line 146
    .line 147
    new-instance v2, Ld4/r;

    .line 148
    .line 149
    invoke-direct {v2, p0}, Ld4/r;-><init>(Lcom/friday/paint/view/six/NewPaintFragment;)V

    .line 150
    .line 151
    .line 152
    invoke-static {v0, v2}, Lcom/friday/paint/view/six/i;->b(Landroid/view/View;Lhd/l;)V

    .line 153
    .line 154
    .line 155
    invoke-virtual {p0}, Lcom/friday/common/base/BaseFragment;->getMBinding()Landroidx/databinding/ViewDataBinding;

    .line 156
    .line 157
    .line 158
    move-result-object v0

    .line 159
    check-cast v0, Lcom/friday/paint/databinding/ResFragmentNewPaintBinding;

    .line 160
    .line 161
    iget-object v0, v0, Lcom/friday/paint/databinding/ResFragmentNewPaintBinding;->j:Landroid/widget/ImageView;

    .line 162
    .line 163
    const-string v2, "ivCopyToOthers"

    .line 164
    .line 165
    invoke-static {v0, v2}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 166
    .line 167
    .line 168
    new-instance v2, Ld4/s;

    .line 169
    .line 170
    invoke-direct {v2, p0}, Ld4/s;-><init>(Lcom/friday/paint/view/six/NewPaintFragment;)V

    .line 171
    .line 172
    .line 173
    invoke-static {v0, v2}, Lcom/friday/paint/view/six/i;->b(Landroid/view/View;Lhd/l;)V

    .line 174
    .line 175
    .line 176
    invoke-virtual {p0}, Lcom/friday/common/base/BaseFragment;->getMBinding()Landroidx/databinding/ViewDataBinding;

    .line 177
    .line 178
    .line 179
    move-result-object v0

    .line 180
    check-cast v0, Lcom/friday/paint/databinding/ResFragmentNewPaintBinding;

    .line 181
    .line 182
    iget-object v0, v0, Lcom/friday/paint/databinding/ResFragmentNewPaintBinding;->i:Landroid/widget/ImageView;

    .line 183
    .line 184
    const-string v2, "ivCopyPage"

    .line 185
    .line 186
    invoke-static {v0, v2}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 187
    .line 188
    .line 189
    new-instance v2, Ld4/t;

    .line 190
    .line 191
    invoke-direct {v2, p0}, Ld4/t;-><init>(Lcom/friday/paint/view/six/NewPaintFragment;)V

    .line 192
    .line 193
    .line 194
    invoke-static {v0, v2}, Lcom/friday/paint/view/six/i;->b(Landroid/view/View;Lhd/l;)V

    .line 195
    .line 196
    .line 197
    invoke-virtual {p0}, Lcom/friday/common/base/BaseFragment;->getMBinding()Landroidx/databinding/ViewDataBinding;

    .line 198
    .line 199
    .line 200
    move-result-object v0

    .line 201
    check-cast v0, Lcom/friday/paint/databinding/ResFragmentNewPaintBinding;

    .line 202
    .line 203
    iget-object v0, v0, Lcom/friday/paint/databinding/ResFragmentNewPaintBinding;->e:Landroid/widget/ImageView;

    .line 204
    .line 205
    const-string v2, "ivAddPage"

    .line 206
    .line 207
    invoke-static {v0, v2}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 208
    .line 209
    .line 210
    new-instance v2, Ld4/u;

    .line 211
    .line 212
    invoke-direct {v2, p0}, Ld4/u;-><init>(Lcom/friday/paint/view/six/NewPaintFragment;)V

    .line 213
    .line 214
    .line 215
    invoke-static {v0, v2}, Lcom/friday/paint/view/six/i;->b(Landroid/view/View;Lhd/l;)V

    .line 216
    .line 217
    .line 218
    invoke-virtual {p0}, Lcom/friday/paint/view/six/NewPaintFragment;->getRightNoteListAdapter()Lcom/friday/paint/view/six/NewThumbnailListAdapter;

    .line 219
    .line 220
    .line 221
    move-result-object v0

    .line 222
    invoke-virtual {v0}, Lcom/chad/library/adapter/base/BaseQuickAdapter;->getDraggableModule()Lp1/a;

    .line 223
    .line 224
    .line 225
    move-result-object v0

    .line 226
    invoke-virtual {v0, v1}, Lp1/a;->s(Z)V

    .line 227
    .line 228
    .line 229
    invoke-virtual {v0}, Lp1/a;->c()Lcom/chad/library/adapter/base/dragswipe/DragAndSwipeCallback;

    .line 230
    .line 231
    .line 232
    move-result-object v0

    .line 233
    const/4 v1, 0x3

    .line 234
    invoke-virtual {v0, v1}, Lcom/chad/library/adapter/base/dragswipe/DragAndSwipeCallback;->b(I)V

    .line 235
    .line 236
    .line 237
    invoke-virtual {p0}, Lcom/friday/paint/view/six/NewPaintFragment;->getRightNoteListAdapter()Lcom/friday/paint/view/six/NewThumbnailListAdapter;

    .line 238
    .line 239
    .line 240
    move-result-object v0

    .line 241
    invoke-virtual {v0}, Lcom/chad/library/adapter/base/BaseQuickAdapter;->getDraggableModule()Lp1/a;

    .line 242
    .line 243
    .line 244
    move-result-object v0

    .line 245
    new-instance v1, Lcom/friday/paint/view/six/NewPaintFragment$b;

    .line 246
    .line 247
    invoke-direct {v1, p0}, Lcom/friday/paint/view/six/NewPaintFragment$b;-><init>(Lcom/friday/paint/view/six/NewPaintFragment;)V

    .line 248
    .line 249
    .line 250
    invoke-virtual {v0, v1}, Lp1/a;->v(Lo1/e;)V

    .line 251
    .line 252
    .line 253
    return-void
.end method

.method private static final initDrawerRight$lambda$28(Lcom/friday/paint/view/six/NewPaintFragment;Landroid/view/View;)Lqc/q;
    .locals 3

    .line 1
    const-string v0, "it"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Lcom/friday/paint/view/six/NewPaintFragment;->getCurrentNoteFragment()Lcom/zykj/view/board/board/BoardFragment;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    if-eqz p1, :cond_0

    .line 11
    .line 12
    const/4 v0, 0x1

    .line 13
    invoke-virtual {p0, v0}, Lcom/friday/common/base/BaseFragment;->isShowLoading(Z)V

    .line 14
    .line 15
    .line 16
    new-instance v0, Ld4/f;

    .line 17
    .line 18
    invoke-direct {v0, p0}, Ld4/f;-><init>(Lcom/friday/paint/view/six/NewPaintFragment;)V

    .line 19
    .line 20
    .line 21
    new-instance v1, Ld4/g;

    .line 22
    .line 23
    invoke-direct {v1, p0}, Ld4/g;-><init>(Lcom/friday/paint/view/six/NewPaintFragment;)V

    .line 24
    .line 25
    .line 26
    const/4 v2, 0x0

    .line 27
    invoke-virtual {p0, p1, v2, v0, v1}, Lcom/friday/paint/view/six/NewPaintFragment;->save(Lcom/zykj/view/board/board/BoardFragment;ZLhd/l;Lhd/l;)V

    .line 28
    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_0
    invoke-virtual {p0}, Lcom/friday/common/base/BaseFragment;->getMBinding()Landroidx/databinding/ViewDataBinding;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    check-cast p0, Lcom/friday/paint/databinding/ResFragmentNewPaintBinding;

    .line 36
    .line 37
    iget-object p1, p0, Lcom/friday/paint/databinding/ResFragmentNewPaintBinding;->c:Landroidx/drawerlayout/widget/DrawerLayout;

    .line 38
    .line 39
    iget-object v0, p0, Lcom/friday/paint/databinding/ResFragmentNewPaintBinding;->q:Landroid/widget/LinearLayout;

    .line 40
    .line 41
    invoke-virtual {p1, v0}, Landroidx/drawerlayout/widget/DrawerLayout;->isDrawerOpen(Landroid/view/View;)Z

    .line 42
    .line 43
    .line 44
    move-result p1

    .line 45
    if-nez p1, :cond_1

    .line 46
    .line 47
    iget-object p1, p0, Lcom/friday/paint/databinding/ResFragmentNewPaintBinding;->c:Landroidx/drawerlayout/widget/DrawerLayout;

    .line 48
    .line 49
    iget-object p0, p0, Lcom/friday/paint/databinding/ResFragmentNewPaintBinding;->q:Landroid/widget/LinearLayout;

    .line 50
    .line 51
    invoke-virtual {p1, p0}, Landroidx/drawerlayout/widget/DrawerLayout;->openDrawer(Landroid/view/View;)V

    .line 52
    .line 53
    .line 54
    :cond_1
    :goto_0
    sget-object p0, Lqc/q;->a:Lqc/q;

    .line 55
    .line 56
    return-object p0
.end method

.method private static final initDrawerRight$lambda$28$lambda$24(Lcom/friday/paint/view/six/NewPaintFragment;Ljava/lang/Throwable;)Lqc/q;
    .locals 2

    .line 1
    const-string v0, "it"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const/4 p1, 0x0

    .line 7
    invoke-virtual {p0, p1}, Lcom/friday/common/base/BaseFragment;->isShowLoading(Z)V

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0}, Lcom/friday/common/base/BaseFragment;->getMBinding()Landroidx/databinding/ViewDataBinding;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, Lcom/friday/paint/databinding/ResFragmentNewPaintBinding;

    .line 15
    .line 16
    iget-object v0, p0, Lcom/friday/paint/databinding/ResFragmentNewPaintBinding;->c:Landroidx/drawerlayout/widget/DrawerLayout;

    .line 17
    .line 18
    iget-object v1, p0, Lcom/friday/paint/databinding/ResFragmentNewPaintBinding;->q:Landroid/widget/LinearLayout;

    .line 19
    .line 20
    invoke-virtual {v0, v1}, Landroidx/drawerlayout/widget/DrawerLayout;->isDrawerOpen(Landroid/view/View;)Z

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    if-nez v0, :cond_0

    .line 25
    .line 26
    iget-object v0, p0, Lcom/friday/paint/databinding/ResFragmentNewPaintBinding;->c:Landroidx/drawerlayout/widget/DrawerLayout;

    .line 27
    .line 28
    iget-object p0, p0, Lcom/friday/paint/databinding/ResFragmentNewPaintBinding;->q:Landroid/widget/LinearLayout;

    .line 29
    .line 30
    invoke-virtual {v0, p0}, Landroidx/drawerlayout/widget/DrawerLayout;->openDrawer(Landroid/view/View;)V

    .line 31
    .line 32
    .line 33
    :cond_0
    const-string p0, "\u8be5\u9875\u6570\u636e\u5f02\u5e38"

    .line 34
    .line 35
    new-array p1, p1, [Ljava/lang/Object;

    .line 36
    .line 37
    invoke-static {p0, p1}, Lcom/blankj/utilcode/util/ToastUtils;->showShort(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 38
    .line 39
    .line 40
    sget-object p0, Lqc/q;->a:Lqc/q;

    .line 41
    .line 42
    return-object p0
.end method

.method private static final initDrawerRight$lambda$28$lambda$26(Lcom/friday/paint/view/six/NewPaintFragment;Ljava/lang/String;)Lqc/q;
    .locals 8

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-virtual {p0, v0}, Lcom/friday/common/base/BaseFragment;->isShowLoading(Z)V

    .line 3
    .line 4
    .line 5
    invoke-virtual {p0}, Lcom/friday/common/base/BaseFragment;->getMBinding()Landroidx/databinding/ViewDataBinding;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    check-cast v0, Lcom/friday/paint/databinding/ResFragmentNewPaintBinding;

    .line 10
    .line 11
    iget-object v1, v0, Lcom/friday/paint/databinding/ResFragmentNewPaintBinding;->c:Landroidx/drawerlayout/widget/DrawerLayout;

    .line 12
    .line 13
    iget-object v2, v0, Lcom/friday/paint/databinding/ResFragmentNewPaintBinding;->q:Landroid/widget/LinearLayout;

    .line 14
    .line 15
    invoke-virtual {v1, v2}, Landroidx/drawerlayout/widget/DrawerLayout;->isDrawerOpen(Landroid/view/View;)Z

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    if-nez v1, :cond_0

    .line 20
    .line 21
    iget-object v1, v0, Lcom/friday/paint/databinding/ResFragmentNewPaintBinding;->c:Landroidx/drawerlayout/widget/DrawerLayout;

    .line 22
    .line 23
    iget-object v0, v0, Lcom/friday/paint/databinding/ResFragmentNewPaintBinding;->q:Landroid/widget/LinearLayout;

    .line 24
    .line 25
    invoke-virtual {v1, v0}, Landroidx/drawerlayout/widget/DrawerLayout;->openDrawer(Landroid/view/View;)V

    .line 26
    .line 27
    .line 28
    :cond_0
    invoke-static {p0}, Landroidx/lifecycle/LifecycleOwnerKt;->getLifecycleScope(Landroidx/lifecycle/LifecycleOwner;)Landroidx/lifecycle/LifecycleCoroutineScope;

    .line 29
    .line 30
    .line 31
    move-result-object v2

    .line 32
    new-instance v5, Lcom/friday/paint/view/six/NewPaintFragment$initDrawerRight$1$2$2;

    .line 33
    .line 34
    const/4 v0, 0x0

    .line 35
    invoke-direct {v5, p0, p1, v0}, Lcom/friday/paint/view/six/NewPaintFragment$initDrawerRight$1$2$2;-><init>(Lcom/friday/paint/view/six/NewPaintFragment;Ljava/lang/String;Lvc/c;)V

    .line 36
    .line 37
    .line 38
    const/4 v6, 0x3

    .line 39
    const/4 v7, 0x0

    .line 40
    const/4 v3, 0x0

    .line 41
    const/4 v4, 0x0

    .line 42
    invoke-static/range {v2 .. v7}, Lsd/f;->d(Lsd/i0;Lkotlin/coroutines/d;Lkotlinx/coroutines/CoroutineStart;Lhd/p;ILjava/lang/Object;)Lkotlinx/coroutines/g;

    .line 43
    .line 44
    .line 45
    invoke-direct {p0}, Lcom/friday/paint/view/six/NewPaintFragment;->getViewModel()Lcom/friday/paint/viewmodel/NewNoteViewModel;

    .line 46
    .line 47
    .line 48
    move-result-object p0

    .line 49
    const/4 p1, 0x1

    .line 50
    invoke-virtual {p0, p1}, Lcom/friday/paint/viewmodel/NewNoteViewModel;->c0(Z)V

    .line 51
    .line 52
    .line 53
    sget-object p0, Lqc/q;->a:Lqc/q;

    .line 54
    .line 55
    return-object p0
.end method

.method private static final initDrawerRight$lambda$30(Lcom/friday/paint/view/six/NewPaintFragment;Landroid/view/View;)Lqc/q;
    .locals 3

    .line 1
    const-string v0, "it"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Lcom/friday/paint/view/six/NewPaintFragment;->getViewModel()Lcom/friday/paint/viewmodel/NewNoteViewModel;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    invoke-virtual {p1}, Lcom/friday/paint/viewmodel/NewNoteViewModel;->B()Landroidx/lifecycle/MutableLiveData;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    invoke-virtual {p1}, Landroidx/lifecycle/LiveData;->getValue()Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    check-cast p1, Ljava/lang/Integer;

    .line 19
    .line 20
    if-eqz p1, :cond_1

    .line 21
    .line 22
    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    .line 23
    .line 24
    .line 25
    move-result p1

    .line 26
    invoke-virtual {p0}, Lcom/friday/paint/view/six/NewPaintFragment;->getRightNoteListAdapter()Lcom/friday/paint/view/six/NewThumbnailListAdapter;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    invoke-virtual {v0}, Lcom/chad/library/adapter/base/BaseQuickAdapter;->getItemCount()I

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    add-int/lit8 v0, v0, -0x1

    .line 35
    .line 36
    if-ne p1, v0, :cond_0

    .line 37
    .line 38
    add-int/lit8 p1, p1, 0x1

    .line 39
    .line 40
    const/4 v0, 0x2

    .line 41
    const/4 v1, 0x0

    .line 42
    const/4 v2, 0x0

    .line 43
    invoke-static {p0, p1, v2, v0, v1}, Lcom/friday/paint/view/six/NewPaintFragment;->addNote$default(Lcom/friday/paint/view/six/NewPaintFragment;IZILjava/lang/Object;)V

    .line 44
    .line 45
    .line 46
    goto :goto_0

    .line 47
    :cond_0
    invoke-direct {p0}, Lcom/friday/paint/view/six/NewPaintFragment;->getViewModel()Lcom/friday/paint/viewmodel/NewNoteViewModel;

    .line 48
    .line 49
    .line 50
    move-result-object p0

    .line 51
    add-int/lit8 p1, p1, 0x1

    .line 52
    .line 53
    invoke-virtual {p0, p1}, Lcom/friday/paint/viewmodel/NewNoteViewModel;->b0(I)V

    .line 54
    .line 55
    .line 56
    :cond_1
    :goto_0
    sget-object p0, Lqc/q;->a:Lqc/q;

    .line 57
    .line 58
    return-object p0
.end method

.method private static final initDrawerRight$lambda$32(Lcom/friday/paint/view/six/NewPaintFragment;Landroid/view/View;)Lqc/q;
    .locals 1

    .line 1
    const-string v0, "it"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Lcom/friday/paint/view/six/NewPaintFragment;->getViewModel()Lcom/friday/paint/viewmodel/NewNoteViewModel;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    invoke-virtual {p1}, Lcom/friday/paint/viewmodel/NewNoteViewModel;->B()Landroidx/lifecycle/MutableLiveData;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    invoke-virtual {p1}, Landroidx/lifecycle/LiveData;->getValue()Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    check-cast p1, Ljava/lang/Integer;

    .line 19
    .line 20
    if-eqz p1, :cond_0

    .line 21
    .line 22
    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    .line 23
    .line 24
    .line 25
    move-result p1

    .line 26
    if-lez p1, :cond_0

    .line 27
    .line 28
    invoke-direct {p0}, Lcom/friday/paint/view/six/NewPaintFragment;->getViewModel()Lcom/friday/paint/viewmodel/NewNoteViewModel;

    .line 29
    .line 30
    .line 31
    move-result-object p0

    .line 32
    add-int/lit8 p1, p1, -0x1

    .line 33
    .line 34
    invoke-virtual {p0, p1}, Lcom/friday/paint/viewmodel/NewNoteViewModel;->b0(I)V

    .line 35
    .line 36
    .line 37
    :cond_0
    sget-object p0, Lqc/q;->a:Lqc/q;

    .line 38
    .line 39
    return-object p0
.end method

.method private static final initDrawerRight$lambda$34$lambda$33(Lcom/friday/paint/view/six/NewPaintFragment;Lcom/chad/library/adapter/base/BaseQuickAdapter;Landroid/view/View;I)V
    .locals 1

    .line 1
    const-string v0, "<unused var>"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-static {p2, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 7
    .line 8
    .line 9
    sget-object p1, Lk2/m;->a:Lk2/m$a;

    .line 10
    .line 11
    invoke-virtual {p1}, Lk2/m$a;->a()Z

    .line 12
    .line 13
    .line 14
    move-result p1

    .line 15
    if-eqz p1, :cond_0

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    invoke-virtual {p0}, Lcom/friday/paint/view/six/NewPaintFragment;->getRightNoteListAdapter()Lcom/friday/paint/view/six/NewThumbnailListAdapter;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    invoke-virtual {p1}, Lcom/chad/library/adapter/base/BaseQuickAdapter;->getData()Ljava/util/List;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    invoke-interface {p1, p3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    check-cast p1, Lcom/friday/paint/model/NoteListEntity;

    .line 31
    .line 32
    invoke-virtual {p1}, Lcom/friday/paint/model/NoteListEntity;->getSelected()Z

    .line 33
    .line 34
    .line 35
    move-result p1

    .line 36
    if-nez p1, :cond_1

    .line 37
    .line 38
    invoke-direct {p0}, Lcom/friday/paint/view/six/NewPaintFragment;->getViewModel()Lcom/friday/paint/viewmodel/NewNoteViewModel;

    .line 39
    .line 40
    .line 41
    move-result-object p0

    .line 42
    invoke-virtual {p0, p3}, Lcom/friday/paint/viewmodel/NewNoteViewModel;->b0(I)V

    .line 43
    .line 44
    .line 45
    :cond_1
    :goto_0
    return-void
.end method

.method private static final initDrawerRight$lambda$38(Lcom/friday/paint/view/six/NewPaintFragment;Landroid/view/View;)Lqc/q;
    .locals 2

    .line 1
    const-string v0, "it"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Lcom/friday/paint/view/six/NewPaintFragment;->getViewModel()Lcom/friday/paint/viewmodel/NewNoteViewModel;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    invoke-virtual {p1}, Lcom/friday/paint/viewmodel/NewNoteViewModel;->B()Landroidx/lifecycle/MutableLiveData;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    invoke-virtual {p1}, Landroidx/lifecycle/LiveData;->getValue()Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    check-cast p1, Ljava/lang/Integer;

    .line 19
    .line 20
    if-eqz p1, :cond_1

    .line 21
    .line 22
    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    .line 23
    .line 24
    .line 25
    move-result p1

    .line 26
    invoke-virtual {p0}, Lcom/friday/paint/view/six/NewPaintFragment;->getRightNoteListAdapter()Lcom/friday/paint/view/six/NewThumbnailListAdapter;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    invoke-virtual {v0}, Lcom/chad/library/adapter/base/BaseQuickAdapter;->getItemCount()I

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    const/4 v1, 0x1

    .line 35
    if-ne v0, v1, :cond_0

    .line 36
    .line 37
    const/4 p0, 0x0

    .line 38
    new-array p0, p0, [Ljava/lang/Object;

    .line 39
    .line 40
    const-string p1, "\u4e0d\u80fd\u5220\u9664\u6240\u6709\u7b14\u8bb0"

    .line 41
    .line 42
    invoke-static {p1, p0}, Lcom/blankj/utilcode/util/ToastUtils;->showShort(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 43
    .line 44
    .line 45
    goto :goto_0

    .line 46
    :cond_0
    sget-object v0, Lcom/friday/common/widget/dialog/a;->a:Lcom/friday/common/widget/dialog/a;

    .line 47
    .line 48
    new-instance v1, Ld4/j;

    .line 49
    .line 50
    invoke-direct {v1, p0, p1}, Ld4/j;-><init>(Lcom/friday/paint/view/six/NewPaintFragment;I)V

    .line 51
    .line 52
    .line 53
    invoke-virtual {v0, v1}, Lcom/friday/common/widget/dialog/a;->B(Lhd/a;)Lcom/friday/common/widget/dialog/BaseDialog;

    .line 54
    .line 55
    .line 56
    move-result-object p1

    .line 57
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getChildFragmentManager()Landroidx/fragment/app/FragmentManager;

    .line 58
    .line 59
    .line 60
    move-result-object p0

    .line 61
    const-string v0, "getChildFragmentManager(...)"

    .line 62
    .line 63
    invoke-static {p0, v0}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 64
    .line 65
    .line 66
    const-string v0, "delete"

    .line 67
    .line 68
    invoke-virtual {p1, p0, v0}, Lcom/friday/common/widget/dialog/BaseDialog;->show(Landroidx/fragment/app/FragmentManager;Ljava/lang/String;)V

    .line 69
    .line 70
    .line 71
    :cond_1
    :goto_0
    sget-object p0, Lqc/q;->a:Lqc/q;

    .line 72
    .line 73
    return-object p0
.end method

.method private static final initDrawerRight$lambda$38$lambda$37$lambda$36(Lcom/friday/paint/view/six/NewPaintFragment;I)Lqc/q;
    .locals 3

    .line 1
    invoke-direct {p0}, Lcom/friday/paint/view/six/NewPaintFragment;->getViewModel()Lcom/friday/paint/viewmodel/NewNoteViewModel;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {p0}, Lcom/friday/paint/view/six/NewPaintFragment;->getRightNoteListAdapter()Lcom/friday/paint/view/six/NewThumbnailListAdapter;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    invoke-virtual {p0}, Lcom/chad/library/adapter/base/BaseQuickAdapter;->getData()Ljava/util/List;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    check-cast p0, Ljava/lang/Iterable;

    .line 14
    .line 15
    new-instance v1, Ljava/util/ArrayList;

    .line 16
    .line 17
    const/16 v2, 0xa

    .line 18
    .line 19
    invoke-static {p0, v2}, Lrc/x;->x(Ljava/lang/Iterable;I)I

    .line 20
    .line 21
    .line 22
    move-result v2

    .line 23
    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 24
    .line 25
    .line 26
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 27
    .line 28
    .line 29
    move-result-object p0

    .line 30
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 31
    .line 32
    .line 33
    move-result v2

    .line 34
    if-eqz v2, :cond_0

    .line 35
    .line 36
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object v2

    .line 40
    check-cast v2, Lcom/friday/paint/model/NoteListEntity;

    .line 41
    .line 42
    invoke-virtual {v2}, Lcom/friday/paint/model/NoteListEntity;->getNoteDir()Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object v2

    .line 46
    invoke-interface {v1, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 47
    .line 48
    .line 49
    goto :goto_0

    .line 50
    :cond_0
    invoke-virtual {v0, p1, v1}, Lcom/friday/paint/viewmodel/NewNoteViewModel;->v(ILjava/util/List;)V

    .line 51
    .line 52
    .line 53
    sget-object p0, Lqc/q;->a:Lqc/q;

    .line 54
    .line 55
    return-object p0
.end method

.method private static final initDrawerRight$lambda$41(Lcom/friday/paint/view/six/NewPaintFragment;Landroid/view/View;)Lqc/q;
    .locals 3

    .line 1
    const-string v0, "it"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Lcom/friday/paint/view/six/NewPaintFragment;->getCurrentNoteFragment()Lcom/zykj/view/board/board/BoardFragment;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    if-eqz p1, :cond_0

    .line 11
    .line 12
    const/4 v0, 0x1

    .line 13
    invoke-virtual {p0, v0}, Lcom/friday/common/base/BaseFragment;->isShowLoading(Z)V

    .line 14
    .line 15
    .line 16
    new-instance v0, Ld4/m0;

    .line 17
    .line 18
    invoke-direct {v0, p0}, Ld4/m0;-><init>(Lcom/friday/paint/view/six/NewPaintFragment;)V

    .line 19
    .line 20
    .line 21
    new-instance v1, Ld4/n0;

    .line 22
    .line 23
    invoke-direct {v1, p0}, Ld4/n0;-><init>(Lcom/friday/paint/view/six/NewPaintFragment;)V

    .line 24
    .line 25
    .line 26
    const/4 v2, 0x0

    .line 27
    invoke-virtual {p0, p1, v2, v0, v1}, Lcom/friday/paint/view/six/NewPaintFragment;->save(Lcom/zykj/view/board/board/BoardFragment;ZLhd/l;Lhd/l;)V

    .line 28
    .line 29
    .line 30
    :cond_0
    sget-object p0, Lqc/q;->a:Lqc/q;

    .line 31
    .line 32
    return-object p0
.end method

.method private static final initDrawerRight$lambda$41$lambda$39(Lcom/friday/paint/view/six/NewPaintFragment;Ljava/lang/Throwable;)Lqc/q;
    .locals 1

    .line 1
    const-string v0, "it"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const/4 p1, 0x0

    .line 7
    invoke-virtual {p0, p1}, Lcom/friday/common/base/BaseFragment;->isShowLoading(Z)V

    .line 8
    .line 9
    .line 10
    const-string p0, "\u8be5\u9875\u6570\u636e\u5f02\u5e38"

    .line 11
    .line 12
    new-array p1, p1, [Ljava/lang/Object;

    .line 13
    .line 14
    invoke-static {p0, p1}, Lcom/blankj/utilcode/util/ToastUtils;->showShort(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 15
    .line 16
    .line 17
    sget-object p0, Lqc/q;->a:Lqc/q;

    .line 18
    .line 19
    return-object p0
.end method

.method private static final initDrawerRight$lambda$41$lambda$40(Lcom/friday/paint/view/six/NewPaintFragment;Ljava/lang/String;)Lqc/q;
    .locals 6

    .line 1
    const/4 p1, 0x0

    .line 2
    invoke-virtual {p0, p1}, Lcom/friday/common/base/BaseFragment;->isShowLoading(Z)V

    .line 3
    .line 4
    .line 5
    invoke-static {p0}, Landroidx/lifecycle/LifecycleOwnerKt;->getLifecycleScope(Landroidx/lifecycle/LifecycleOwner;)Landroidx/lifecycle/LifecycleCoroutineScope;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    new-instance v3, Lcom/friday/paint/view/six/NewPaintFragment$initDrawerRight$6$2$1;

    .line 10
    .line 11
    const/4 p1, 0x0

    .line 12
    invoke-direct {v3, p0, p1}, Lcom/friday/paint/view/six/NewPaintFragment$initDrawerRight$6$2$1;-><init>(Lcom/friday/paint/view/six/NewPaintFragment;Lvc/c;)V

    .line 13
    .line 14
    .line 15
    const/4 v4, 0x3

    .line 16
    const/4 v5, 0x0

    .line 17
    const/4 v1, 0x0

    .line 18
    const/4 v2, 0x0

    .line 19
    invoke-static/range {v0 .. v5}, Lsd/f;->d(Lsd/i0;Lkotlin/coroutines/d;Lkotlinx/coroutines/CoroutineStart;Lhd/p;ILjava/lang/Object;)Lkotlinx/coroutines/g;

    .line 20
    .line 21
    .line 22
    sget-object p0, Lqc/q;->a:Lqc/q;

    .line 23
    .line 24
    return-object p0
.end method

.method private static final initDrawerRight$lambda$45(Lcom/friday/paint/view/six/NewPaintFragment;Landroid/view/View;)Lqc/q;
    .locals 3

    .line 1
    const-string v0, "it"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Lcom/friday/paint/view/six/NewPaintFragment;->getCurrentNoteFragment()Lcom/zykj/view/board/board/BoardFragment;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    if-eqz p1, :cond_0

    .line 11
    .line 12
    const/4 v0, 0x1

    .line 13
    invoke-virtual {p0, v0}, Lcom/friday/common/base/BaseFragment;->isShowLoading(Z)V

    .line 14
    .line 15
    .line 16
    new-instance v0, Ld4/v;

    .line 17
    .line 18
    invoke-direct {v0, p0}, Ld4/v;-><init>(Lcom/friday/paint/view/six/NewPaintFragment;)V

    .line 19
    .line 20
    .line 21
    new-instance v1, Ld4/w;

    .line 22
    .line 23
    invoke-direct {v1, p0}, Ld4/w;-><init>(Lcom/friday/paint/view/six/NewPaintFragment;)V

    .line 24
    .line 25
    .line 26
    const/4 v2, 0x0

    .line 27
    invoke-virtual {p0, p1, v2, v0, v1}, Lcom/friday/paint/view/six/NewPaintFragment;->save(Lcom/zykj/view/board/board/BoardFragment;ZLhd/l;Lhd/l;)V

    .line 28
    .line 29
    .line 30
    :cond_0
    sget-object p0, Lqc/q;->a:Lqc/q;

    .line 31
    .line 32
    return-object p0
.end method

.method private static final initDrawerRight$lambda$45$lambda$42(Lcom/friday/paint/view/six/NewPaintFragment;Ljava/lang/Throwable;)Lqc/q;
    .locals 1

    .line 1
    const-string v0, "it"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const/4 p1, 0x0

    .line 7
    invoke-virtual {p0, p1}, Lcom/friday/common/base/BaseFragment;->isShowLoading(Z)V

    .line 8
    .line 9
    .line 10
    const-string p0, "\u8be5\u9875\u6570\u636e\u5f02\u5e38"

    .line 11
    .line 12
    new-array p1, p1, [Ljava/lang/Object;

    .line 13
    .line 14
    invoke-static {p0, p1}, Lcom/blankj/utilcode/util/ToastUtils;->showShort(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 15
    .line 16
    .line 17
    sget-object p0, Lqc/q;->a:Lqc/q;

    .line 18
    .line 19
    return-object p0
.end method

.method private static final initDrawerRight$lambda$45$lambda$44(Lcom/friday/paint/view/six/NewPaintFragment;Ljava/lang/String;)Lqc/q;
    .locals 0

    .line 1
    const/4 p1, 0x0

    .line 2
    invoke-virtual {p0, p1}, Lcom/friday/common/base/BaseFragment;->isShowLoading(Z)V

    .line 3
    .line 4
    .line 5
    invoke-direct {p0}, Lcom/friday/paint/view/six/NewPaintFragment;->getViewModel()Lcom/friday/paint/viewmodel/NewNoteViewModel;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    invoke-virtual {p1}, Lcom/friday/paint/viewmodel/NewNoteViewModel;->B()Landroidx/lifecycle/MutableLiveData;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    invoke-virtual {p1}, Landroidx/lifecycle/LiveData;->getValue()Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    check-cast p1, Ljava/lang/Integer;

    .line 18
    .line 19
    if-eqz p1, :cond_0

    .line 20
    .line 21
    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    .line 22
    .line 23
    .line 24
    move-result p1

    .line 25
    add-int/lit8 p1, p1, 0x1

    .line 26
    .line 27
    invoke-direct {p0, p1}, Lcom/friday/paint/view/six/NewPaintFragment;->copyNote(I)V

    .line 28
    .line 29
    .line 30
    :cond_0
    sget-object p0, Lqc/q;->a:Lqc/q;

    .line 31
    .line 32
    return-object p0
.end method

.method private static final initDrawerRight$lambda$47(Lcom/friday/paint/view/six/NewPaintFragment;Landroid/view/View;)Lqc/q;
    .locals 3

    .line 1
    const-string v0, "it"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Lcom/friday/paint/view/six/NewPaintFragment;->getViewModel()Lcom/friday/paint/viewmodel/NewNoteViewModel;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    invoke-virtual {p1}, Lcom/friday/paint/viewmodel/NewNoteViewModel;->B()Landroidx/lifecycle/MutableLiveData;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    invoke-virtual {p1}, Landroidx/lifecycle/LiveData;->getValue()Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    check-cast p1, Ljava/lang/Integer;

    .line 19
    .line 20
    if-eqz p1, :cond_0

    .line 21
    .line 22
    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    .line 23
    .line 24
    .line 25
    move-result p1

    .line 26
    add-int/lit8 p1, p1, 0x1

    .line 27
    .line 28
    const/4 v0, 0x2

    .line 29
    const/4 v1, 0x0

    .line 30
    const/4 v2, 0x0

    .line 31
    invoke-static {p0, p1, v2, v0, v1}, Lcom/friday/paint/view/six/NewPaintFragment;->addNote$default(Lcom/friday/paint/view/six/NewPaintFragment;IZILjava/lang/Object;)V

    .line 32
    .line 33
    .line 34
    :cond_0
    sget-object p0, Lqc/q;->a:Lqc/q;

    .line 35
    .line 36
    return-object p0
.end method

.method private final initObserver()V
    .locals 15

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
    new-instance v5, Lcom/friday/paint/view/six/NewPaintFragment$initObserver$1;

    .line 15
    .line 16
    const/4 v0, 0x0

    .line 17
    invoke-direct {v5, p0, v0}, Lcom/friday/paint/view/six/NewPaintFragment$initObserver$1;-><init>(Lcom/friday/paint/view/six/NewPaintFragment;Lvc/c;)V

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
    invoke-direct {p0}, Lcom/friday/paint/view/six/NewPaintFragment;->getViewModel()Lcom/friday/paint/viewmodel/NewNoteViewModel;

    .line 28
    .line 29
    .line 30
    move-result-object v2

    .line 31
    invoke-virtual {v2}, Lcom/friday/paint/viewmodel/NewNoteViewModel;->D()Landroidx/lifecycle/LiveData;

    .line 32
    .line 33
    .line 34
    move-result-object v2

    .line 35
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getViewLifecycleOwner()Landroidx/lifecycle/LifecycleOwner;

    .line 36
    .line 37
    .line 38
    move-result-object v3

    .line 39
    new-instance v4, Ld4/z;

    .line 40
    .line 41
    invoke-direct {v4, p0}, Ld4/z;-><init>(Lcom/friday/paint/view/six/NewPaintFragment;)V

    .line 42
    .line 43
    .line 44
    new-instance v5, Lcom/friday/paint/view/six/i$a;

    .line 45
    .line 46
    invoke-direct {v5, v4}, Lcom/friday/paint/view/six/i$a;-><init>(Lhd/l;)V

    .line 47
    .line 48
    .line 49
    invoke-virtual {v2, v3, v5}, Landroidx/lifecycle/LiveData;->observe(Landroidx/lifecycle/LifecycleOwner;Landroidx/lifecycle/Observer;)V

    .line 50
    .line 51
    .line 52
    const-string v2, "updateCurrentThumbnailSuccess"

    .line 53
    .line 54
    const-class v3, Ljava/lang/Object;

    .line 55
    .line 56
    invoke-static {v2, v3}, Lcom/jeremyliao/liveeventbus/LiveEventBus;->get(Ljava/lang/String;Ljava/lang/Class;)Lcom/jeremyliao/liveeventbus/core/Observable;

    .line 57
    .line 58
    .line 59
    move-result-object v2

    .line 60
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getViewLifecycleOwner()Landroidx/lifecycle/LifecycleOwner;

    .line 61
    .line 62
    .line 63
    move-result-object v3

    .line 64
    new-instance v4, Ld4/a0;

    .line 65
    .line 66
    invoke-direct {v4, p0}, Ld4/a0;-><init>(Lcom/friday/paint/view/six/NewPaintFragment;)V

    .line 67
    .line 68
    .line 69
    invoke-interface {v2, v3, v4}, Lcom/jeremyliao/liveeventbus/core/Observable;->observe(Landroidx/lifecycle/LifecycleOwner;Landroidx/lifecycle/Observer;)V

    .line 70
    .line 71
    .line 72
    invoke-direct {p0}, Lcom/friday/paint/view/six/NewPaintFragment;->getViewModel()Lcom/friday/paint/viewmodel/NewNoteViewModel;

    .line 73
    .line 74
    .line 75
    move-result-object v2

    .line 76
    invoke-virtual {v2}, Lcom/friday/paint/viewmodel/NewNoteViewModel;->B()Landroidx/lifecycle/MutableLiveData;

    .line 77
    .line 78
    .line 79
    move-result-object v2

    .line 80
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getViewLifecycleOwner()Landroidx/lifecycle/LifecycleOwner;

    .line 81
    .line 82
    .line 83
    move-result-object v3

    .line 84
    new-instance v4, Ld4/b0;

    .line 85
    .line 86
    invoke-direct {v4, p0}, Ld4/b0;-><init>(Lcom/friday/paint/view/six/NewPaintFragment;)V

    .line 87
    .line 88
    .line 89
    new-instance v5, Lcom/friday/paint/view/six/i$a;

    .line 90
    .line 91
    invoke-direct {v5, v4}, Lcom/friday/paint/view/six/i$a;-><init>(Lhd/l;)V

    .line 92
    .line 93
    .line 94
    invoke-virtual {v2, v3, v5}, Landroidx/lifecycle/LiveData;->observe(Landroidx/lifecycle/LifecycleOwner;Landroidx/lifecycle/Observer;)V

    .line 95
    .line 96
    .line 97
    invoke-direct {p0}, Lcom/friday/paint/view/six/NewPaintFragment;->getViewModel()Lcom/friday/paint/viewmodel/NewNoteViewModel;

    .line 98
    .line 99
    .line 100
    move-result-object v2

    .line 101
    invoke-virtual {v2}, Lcom/friday/paint/viewmodel/NewNoteViewModel;->C()Landroidx/lifecycle/MutableLiveData;

    .line 102
    .line 103
    .line 104
    move-result-object v2

    .line 105
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getViewLifecycleOwner()Landroidx/lifecycle/LifecycleOwner;

    .line 106
    .line 107
    .line 108
    move-result-object v3

    .line 109
    new-instance v4, Ld4/c0;

    .line 110
    .line 111
    invoke-direct {v4, p0}, Ld4/c0;-><init>(Lcom/friday/paint/view/six/NewPaintFragment;)V

    .line 112
    .line 113
    .line 114
    new-instance v5, Lcom/friday/paint/view/six/i$a;

    .line 115
    .line 116
    invoke-direct {v5, v4}, Lcom/friday/paint/view/six/i$a;-><init>(Lhd/l;)V

    .line 117
    .line 118
    .line 119
    invoke-virtual {v2, v3, v5}, Landroidx/lifecycle/LiveData;->observe(Landroidx/lifecycle/LifecycleOwner;Landroidx/lifecycle/Observer;)V

    .line 120
    .line 121
    .line 122
    const-string v2, "addBitmap"

    .line 123
    .line 124
    const-class v3, Landroid/graphics/Bitmap;

    .line 125
    .line 126
    invoke-static {v2, v3}, Lcom/jeremyliao/liveeventbus/LiveEventBus;->get(Ljava/lang/String;Ljava/lang/Class;)Lcom/jeremyliao/liveeventbus/core/Observable;

    .line 127
    .line 128
    .line 129
    move-result-object v2

    .line 130
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getViewLifecycleOwner()Landroidx/lifecycle/LifecycleOwner;

    .line 131
    .line 132
    .line 133
    move-result-object v3

    .line 134
    new-instance v4, Ld4/d0;

    .line 135
    .line 136
    invoke-direct {v4, p0}, Ld4/d0;-><init>(Lcom/friday/paint/view/six/NewPaintFragment;)V

    .line 137
    .line 138
    .line 139
    invoke-interface {v2, v3, v4}, Lcom/jeremyliao/liveeventbus/core/Observable;->observe(Landroidx/lifecycle/LifecycleOwner;Landroidx/lifecycle/Observer;)V

    .line 140
    .line 141
    .line 142
    const-string v2, "ScreenCaptureImage"

    .line 143
    .line 144
    const-class v3, Lkotlin/Pair;

    .line 145
    .line 146
    invoke-static {v2, v3}, Lcom/jeremyliao/liveeventbus/LiveEventBus;->get(Ljava/lang/String;Ljava/lang/Class;)Lcom/jeremyliao/liveeventbus/core/Observable;

    .line 147
    .line 148
    .line 149
    move-result-object v2

    .line 150
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getViewLifecycleOwner()Landroidx/lifecycle/LifecycleOwner;

    .line 151
    .line 152
    .line 153
    move-result-object v3

    .line 154
    new-instance v4, Ld4/e0;

    .line 155
    .line 156
    invoke-direct {v4, p0}, Ld4/e0;-><init>(Lcom/friday/paint/view/six/NewPaintFragment;)V

    .line 157
    .line 158
    .line 159
    invoke-interface {v2, v3, v4}, Lcom/jeremyliao/liveeventbus/core/Observable;->observe(Landroidx/lifecycle/LifecycleOwner;Landroidx/lifecycle/Observer;)V

    .line 160
    .line 161
    .line 162
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getViewLifecycleOwner()Landroidx/lifecycle/LifecycleOwner;

    .line 163
    .line 164
    .line 165
    move-result-object v2

    .line 166
    invoke-static {v2, v1}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 167
    .line 168
    .line 169
    invoke-static {v2}, Landroidx/lifecycle/LifecycleOwnerKt;->getLifecycleScope(Landroidx/lifecycle/LifecycleOwner;)Landroidx/lifecycle/LifecycleCoroutineScope;

    .line 170
    .line 171
    .line 172
    move-result-object v3

    .line 173
    new-instance v6, Lcom/friday/paint/view/six/NewPaintFragment$initObserver$8;

    .line 174
    .line 175
    invoke-direct {v6, p0, v0}, Lcom/friday/paint/view/six/NewPaintFragment$initObserver$8;-><init>(Lcom/friday/paint/view/six/NewPaintFragment;Lvc/c;)V

    .line 176
    .line 177
    .line 178
    const/4 v7, 0x3

    .line 179
    const/4 v8, 0x0

    .line 180
    const/4 v4, 0x0

    .line 181
    const/4 v5, 0x0

    .line 182
    invoke-static/range {v3 .. v8}, Lsd/f;->d(Lsd/i0;Lkotlin/coroutines/d;Lkotlinx/coroutines/CoroutineStart;Lhd/p;ILjava/lang/Object;)Lkotlinx/coroutines/g;

    .line 183
    .line 184
    .line 185
    invoke-static {p0}, Landroidx/lifecycle/LifecycleOwnerKt;->getLifecycleScope(Landroidx/lifecycle/LifecycleOwner;)Landroidx/lifecycle/LifecycleCoroutineScope;

    .line 186
    .line 187
    .line 188
    move-result-object v9

    .line 189
    new-instance v12, Lcom/friday/paint/view/six/NewPaintFragment$initObserver$9;

    .line 190
    .line 191
    invoke-direct {v12, v0}, Lcom/friday/paint/view/six/NewPaintFragment$initObserver$9;-><init>(Lvc/c;)V

    .line 192
    .line 193
    .line 194
    const/4 v13, 0x3

    .line 195
    const/4 v14, 0x0

    .line 196
    const/4 v10, 0x0

    .line 197
    const/4 v11, 0x0

    .line 198
    invoke-static/range {v9 .. v14}, Lsd/f;->d(Lsd/i0;Lkotlin/coroutines/d;Lkotlinx/coroutines/CoroutineStart;Lhd/p;ILjava/lang/Object;)Lkotlinx/coroutines/g;

    .line 199
    .line 200
    .line 201
    return-void
.end method

.method private static final initObserver$lambda$12(Lcom/friday/paint/view/six/NewPaintFragment;Ljava/lang/Integer;)Lqc/q;
    .locals 2

    .line 1
    if-eqz p1, :cond_2

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/4 v1, 0x0

    .line 8
    if-ltz v0, :cond_1

    .line 9
    .line 10
    const-string v0, "\u5220\u9664\u6210\u529f"

    .line 11
    .line 12
    new-array v1, v1, [Ljava/lang/Object;

    .line 13
    .line 14
    invoke-static {v0, v1}, Lcom/blankj/utilcode/util/ToastUtils;->showShort(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {p0}, Lcom/friday/paint/view/six/NewPaintFragment;->getRightNoteListAdapter()Lcom/friday/paint/view/six/NewThumbnailListAdapter;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    invoke-virtual {v0}, Lcom/chad/library/adapter/base/BaseQuickAdapter;->getItemCount()I

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    add-int/lit8 v0, v0, -0x1

    .line 26
    .line 27
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 28
    .line 29
    .line 30
    move-result v1

    .line 31
    if-ne v1, v0, :cond_0

    .line 32
    .line 33
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 34
    .line 35
    .line 36
    move-result v0

    .line 37
    add-int/lit8 v0, v0, -0x1

    .line 38
    .line 39
    goto :goto_0

    .line 40
    :cond_0
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 41
    .line 42
    .line 43
    move-result v0

    .line 44
    :goto_0
    invoke-virtual {p0}, Lcom/friday/paint/view/six/NewPaintFragment;->getRightNoteListAdapter()Lcom/friday/paint/view/six/NewThumbnailListAdapter;

    .line 45
    .line 46
    .line 47
    move-result-object v1

    .line 48
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 49
    .line 50
    .line 51
    move-result p1

    .line 52
    invoke-virtual {v1, p1}, Lcom/chad/library/adapter/base/BaseQuickAdapter;->removeAt(I)V

    .line 53
    .line 54
    .line 55
    invoke-direct {p0}, Lcom/friday/paint/view/six/NewPaintFragment;->getViewModel()Lcom/friday/paint/viewmodel/NewNoteViewModel;

    .line 56
    .line 57
    .line 58
    move-result-object p0

    .line 59
    invoke-virtual {p0, v0}, Lcom/friday/paint/viewmodel/NewNoteViewModel;->b0(I)V

    .line 60
    .line 61
    .line 62
    goto :goto_1

    .line 63
    :cond_1
    const-string p0, "\u5220\u9664\u5931\u8d25"

    .line 64
    .line 65
    new-array p1, v1, [Ljava/lang/Object;

    .line 66
    .line 67
    invoke-static {p0, p1}, Lcom/blankj/utilcode/util/ToastUtils;->showShort(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 68
    .line 69
    .line 70
    :cond_2
    :goto_1
    sget-object p0, Lqc/q;->a:Lqc/q;

    .line 71
    .line 72
    return-object p0
.end method

.method private static final initObserver$lambda$14(Lcom/friday/paint/view/six/NewPaintFragment;Ljava/lang/Object;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Lcom/friday/paint/view/six/NewPaintFragment;->getViewModel()Lcom/friday/paint/viewmodel/NewNoteViewModel;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-virtual {p1}, Lcom/friday/paint/viewmodel/NewNoteViewModel;->B()Landroidx/lifecycle/MutableLiveData;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    invoke-virtual {p1}, Landroidx/lifecycle/LiveData;->getValue()Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    check-cast p1, Ljava/lang/Integer;

    .line 14
    .line 15
    if-eqz p1, :cond_0

    .line 16
    .line 17
    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    .line 18
    .line 19
    .line 20
    move-result p1

    .line 21
    invoke-virtual {p0}, Lcom/friday/paint/view/six/NewPaintFragment;->getRightNoteListAdapter()Lcom/friday/paint/view/six/NewThumbnailListAdapter;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    sget-object v0, Lcom/friday/common/entity/PayloadKey;->THUMBNAIL:Lcom/friday/common/entity/PayloadKey;

    .line 26
    .line 27
    invoke-virtual {p0, p1, v0}, Landroidx/recyclerview/widget/RecyclerView$Adapter;->notifyItemChanged(ILjava/lang/Object;)V

    .line 28
    .line 29
    .line 30
    :cond_0
    return-void
.end method

.method private static final initObserver$lambda$15(Lcom/friday/paint/view/six/NewPaintFragment;Ljava/lang/Integer;)Lqc/q;
    .locals 6

    .line 1
    invoke-static {p0}, Landroidx/lifecycle/LifecycleOwnerKt;->getLifecycleScope(Landroidx/lifecycle/LifecycleOwner;)Landroidx/lifecycle/LifecycleCoroutineScope;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    new-instance v3, Lcom/friday/paint/view/six/NewPaintFragment$initObserver$4$1;

    .line 6
    .line 7
    const/4 v1, 0x0

    .line 8
    invoke-direct {v3, p0, p1, v1}, Lcom/friday/paint/view/six/NewPaintFragment$initObserver$4$1;-><init>(Lcom/friday/paint/view/six/NewPaintFragment;Ljava/lang/Integer;Lvc/c;)V

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
    sget-object p0, Lqc/q;->a:Lqc/q;

    .line 18
    .line 19
    return-object p0
.end method

.method private static final initObserver$lambda$16(Lcom/friday/paint/view/six/NewPaintFragment;Ljava/lang/Boolean;)Lqc/q;
    .locals 6

    .line 1
    invoke-static {p0}, Landroidx/lifecycle/LifecycleOwnerKt;->getLifecycleScope(Landroidx/lifecycle/LifecycleOwner;)Landroidx/lifecycle/LifecycleCoroutineScope;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    new-instance v3, Lcom/friday/paint/view/six/NewPaintFragment$initObserver$5$1;

    .line 6
    .line 7
    const/4 v1, 0x0

    .line 8
    invoke-direct {v3, p1, p0, v1}, Lcom/friday/paint/view/six/NewPaintFragment$initObserver$5$1;-><init>(Ljava/lang/Boolean;Lcom/friday/paint/view/six/NewPaintFragment;Lvc/c;)V

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
    sget-object p0, Lqc/q;->a:Lqc/q;

    .line 18
    .line 19
    return-object p0
.end method

.method private static final initObserver$lambda$19(Lcom/friday/paint/view/six/NewPaintFragment;Landroid/graphics/Bitmap;)V
    .locals 8

    .line 1
    invoke-virtual {p0}, Lcom/friday/paint/view/six/NewPaintFragment;->getCurrentNoteFragment()Lcom/zykj/view/board/board/BoardFragment;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    new-instance v5, Ld4/y;

    .line 8
    .line 9
    invoke-direct {v5, p0}, Ld4/y;-><init>(Lcom/friday/paint/view/six/NewPaintFragment;)V

    .line 10
    .line 11
    .line 12
    const/4 v6, 0x6

    .line 13
    const/4 v7, 0x0

    .line 14
    const/4 v2, 0x0

    .line 15
    const/4 v3, 0x0

    .line 16
    const/4 v4, 0x1

    .line 17
    move-object v1, p1

    .line 18
    invoke-static/range {v0 .. v7}, Lcom/zykj/view/board/board/BoardFragment;->u0(Lcom/zykj/view/board/board/BoardFragment;Landroid/graphics/Bitmap;Ljava/lang/String;Ljava/lang/String;ZLhd/l;ILjava/lang/Object;)V

    .line 19
    .line 20
    .line 21
    :cond_0
    return-void
.end method

.method private static final initObserver$lambda$19$lambda$18(Lcom/friday/paint/view/six/NewPaintFragment;Ljava/lang/String;)Lqc/q;
    .locals 2

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    invoke-direct {p0, p1}, Lcom/friday/paint/view/six/NewPaintFragment;->checkImageSafety(Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Lcom/friday/paint/view/six/NewPaintFragment;->getViewModel()Lcom/friday/paint/viewmodel/NewNoteViewModel;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    invoke-virtual {p0}, Lcom/friday/paint/viewmodel/NewNoteViewModel;->G()Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    new-instance v0, Ljava/lang/StringBuilder;

    .line 15
    .line 16
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 17
    .line 18
    .line 19
    const-string v1, "["

    .line 20
    .line 21
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 22
    .line 23
    .line 24
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 25
    .line 26
    .line 27
    const-string p0, "] \u6dfb\u52a0\u56fe\u7247:\u88c1\u526a,\u8def\u5f84:"

    .line 28
    .line 29
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 30
    .line 31
    .line 32
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 33
    .line 34
    .line 35
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    filled-new-array {p0}, [Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object p0

    .line 43
    invoke-static {p0}, Lcom/blankj/utilcode/util/LogUtils;->i([Ljava/lang/Object;)V

    .line 44
    .line 45
    .line 46
    :cond_0
    sget-object p0, Lqc/q;->a:Lqc/q;

    .line 47
    .line 48
    return-object p0
.end method

.method private static final initObserver$lambda$20(Lcom/friday/paint/view/six/NewPaintFragment;Lkotlin/Pair;)V
    .locals 9

    .line 1
    invoke-virtual {p1}, Lkotlin/Pair;->f()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    instance-of v0, v0, Ljava/lang/String;

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    invoke-virtual {p1}, Lkotlin/Pair;->g()Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    instance-of v0, v0, Landroid/graphics/Bitmap;

    .line 14
    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    invoke-virtual {p1}, Lkotlin/Pair;->f()Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    const-string v1, "null cannot be cast to non-null type kotlin.String"

    .line 22
    .line 23
    invoke-static {v0, v1}, Lkotlin/jvm/internal/u;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    check-cast v0, Ljava/lang/String;

    .line 27
    .line 28
    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    .line 29
    .line 30
    .line 31
    move-result-object v1

    .line 32
    new-instance v2, Ljava/lang/StringBuilder;

    .line 33
    .line 34
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 35
    .line 36
    .line 37
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 38
    .line 39
    .line 40
    const-string v0, "screenCapture"

    .line 41
    .line 42
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 43
    .line 44
    .line 45
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 46
    .line 47
    .line 48
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    invoke-virtual {p1}, Lkotlin/Pair;->g()Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object p1

    .line 56
    const-string v1, "null cannot be cast to non-null type android.graphics.Bitmap"

    .line 57
    .line 58
    invoke-static {p1, v1}, Lkotlin/jvm/internal/u;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 59
    .line 60
    .line 61
    check-cast p1, Landroid/graphics/Bitmap;

    .line 62
    .line 63
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getViewLifecycleOwner()Landroidx/lifecycle/LifecycleOwner;

    .line 64
    .line 65
    .line 66
    move-result-object v1

    .line 67
    const-string v2, "getViewLifecycleOwner(...)"

    .line 68
    .line 69
    invoke-static {v1, v2}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 70
    .line 71
    .line 72
    invoke-static {v1}, Landroidx/lifecycle/LifecycleOwnerKt;->getLifecycleScope(Landroidx/lifecycle/LifecycleOwner;)Landroidx/lifecycle/LifecycleCoroutineScope;

    .line 73
    .line 74
    .line 75
    move-result-object v3

    .line 76
    new-instance v6, Lcom/friday/paint/view/six/NewPaintFragment$initObserver$7$1;

    .line 77
    .line 78
    const/4 v1, 0x0

    .line 79
    invoke-direct {v6, p0, p1, v0, v1}, Lcom/friday/paint/view/six/NewPaintFragment$initObserver$7$1;-><init>(Lcom/friday/paint/view/six/NewPaintFragment;Landroid/graphics/Bitmap;Ljava/lang/String;Lvc/c;)V

    .line 80
    .line 81
    .line 82
    const/4 v7, 0x3

    .line 83
    const/4 v8, 0x0

    .line 84
    const/4 v4, 0x0

    .line 85
    const/4 v5, 0x0

    .line 86
    invoke-static/range {v3 .. v8}, Lsd/f;->d(Lsd/i0;Lkotlin/coroutines/d;Lkotlinx/coroutines/CoroutineStart;Lhd/p;ILjava/lang/Object;)Lkotlinx/coroutines/g;

    .line 87
    .line 88
    .line 89
    :cond_0
    return-void
.end method

.method private final initPaint()V
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
    new-instance v5, Lcom/friday/paint/view/six/NewPaintFragment$initPaint$1;

    .line 15
    .line 16
    const/4 v0, 0x0

    .line 17
    invoke-direct {v5, p0, v0}, Lcom/friday/paint/view/six/NewPaintFragment$initPaint$1;-><init>(Lcom/friday/paint/view/six/NewPaintFragment;Lvc/c;)V

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

.method private final moveToPosition(Landroidx/recyclerview/widget/RecyclerView;I)V
    .locals 3

    .line 1
    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView;->getLayoutManager()Landroidx/recyclerview/widget/RecyclerView$LayoutManager;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const-string v1, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager"

    .line 6
    .line 7
    invoke-static {v0, v1}, Lkotlin/jvm/internal/u;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    check-cast v0, Landroidx/recyclerview/widget/LinearLayoutManager;

    .line 11
    .line 12
    invoke-virtual {v0}, Landroidx/recyclerview/widget/LinearLayoutManager;->findFirstCompletelyVisibleItemPosition()I

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    invoke-virtual {v0}, Landroidx/recyclerview/widget/LinearLayoutManager;->findLastCompletelyVisibleItemPosition()I

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    if-gt v1, p2, :cond_0

    .line 21
    .line 22
    if-gt p2, v0, :cond_0

    .line 23
    .line 24
    return-void

    .line 25
    :cond_0
    const/4 v0, 0x0

    .line 26
    invoke-virtual {p1, v0}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 27
    .line 28
    .line 29
    move-result-object v1

    .line 30
    if-nez v1, :cond_1

    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_1
    invoke-virtual {p1, v1}, Landroidx/recyclerview/widget/RecyclerView;->getChildLayoutPosition(Landroid/view/View;)I

    .line 34
    .line 35
    .line 36
    move-result v1

    .line 37
    invoke-virtual {p1}, Landroid/view/ViewGroup;->getChildCount()I

    .line 38
    .line 39
    .line 40
    move-result v2

    .line 41
    add-int/lit8 v2, v2, -0x1

    .line 42
    .line 43
    invoke-virtual {p1, v2}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 44
    .line 45
    .line 46
    move-result-object v2

    .line 47
    invoke-virtual {p1, v2}, Landroidx/recyclerview/widget/RecyclerView;->getChildLayoutPosition(Landroid/view/View;)I

    .line 48
    .line 49
    .line 50
    move-result v2

    .line 51
    if-lt p2, v1, :cond_4

    .line 52
    .line 53
    if-le p2, v2, :cond_2

    .line 54
    .line 55
    goto :goto_1

    .line 56
    :cond_2
    sub-int/2addr p2, v1

    .line 57
    invoke-virtual {p1, p2}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 58
    .line 59
    .line 60
    move-result-object p2

    .line 61
    if-eqz p2, :cond_3

    .line 62
    .line 63
    invoke-virtual {p2}, Landroid/view/View;->getTop()I

    .line 64
    .line 65
    .line 66
    move-result p2

    .line 67
    invoke-virtual {p1, v0, p2}, Landroidx/recyclerview/widget/RecyclerView;->scrollBy(II)V

    .line 68
    .line 69
    .line 70
    :cond_3
    :goto_0
    return-void

    .line 71
    :cond_4
    :goto_1
    invoke-virtual {p1, p2}, Landroidx/recyclerview/widget/RecyclerView;->scrollToPosition(I)V

    .line 72
    .line 73
    .line 74
    return-void
.end method

.method private static final onPause$lambda$2$lambda$1(Lcom/friday/paint/view/six/NewPaintFragment;Ljava/lang/String;)Lqc/q;
    .locals 6

    .line 1
    invoke-static {p0}, Landroidx/lifecycle/LifecycleOwnerKt;->getLifecycleScope(Landroidx/lifecycle/LifecycleOwner;)Landroidx/lifecycle/LifecycleCoroutineScope;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    new-instance v3, Lcom/friday/paint/view/six/NewPaintFragment$onPause$1$1$1;

    .line 6
    .line 7
    const/4 p1, 0x0

    .line 8
    invoke-direct {v3, p0, p1}, Lcom/friday/paint/view/six/NewPaintFragment$onPause$1$1$1;-><init>(Lcom/friday/paint/view/six/NewPaintFragment;Lvc/c;)V

    .line 9
    .line 10
    .line 11
    const/4 v4, 0x3

    .line 12
    const/4 v5, 0x0

    .line 13
    const/4 v1, 0x0

    .line 14
    const/4 v2, 0x0

    .line 15
    invoke-static/range {v0 .. v5}, Lsd/f;->d(Lsd/i0;Lkotlin/coroutines/d;Lkotlinx/coroutines/CoroutineStart;Lhd/p;ILjava/lang/Object;)Lkotlinx/coroutines/g;

    .line 16
    .line 17
    .line 18
    sget-object p0, Lqc/q;->a:Lqc/q;

    .line 19
    .line 20
    return-object p0
.end method

.method public static synthetic r(Lcom/friday/paint/view/six/NewPaintFragment;Ljava/lang/Throwable;)Lqc/q;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/friday/paint/view/six/NewPaintFragment;->initDrawerRight$lambda$41$lambda$39(Lcom/friday/paint/view/six/NewPaintFragment;Ljava/lang/Throwable;)Lqc/q;

    move-result-object p0

    return-object p0
.end method

.method private final renameBin(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/util/HashMap;)Ljava/util/List;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Lcom/zykj/board/EzyRouterRecord$RouterRecord$SourceCommandRecord;",
            ">;",
            "Ljava/lang/String;",
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)",
            "Ljava/util/List<",
            "Lcom/zykj/board/EzyRouterRecord$RouterRecord$SourceCommandRecord;",
            ">;"
        }
    .end annotation

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 4
    .line 5
    .line 6
    check-cast p2, Ljava/lang/Iterable;

    .line 7
    .line 8
    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 9
    .line 10
    .line 11
    move-result-object p2

    .line 12
    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    if-eqz v1, :cond_0

    .line 17
    .line 18
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    check-cast v1, Lcom/zykj/board/EzyRouterRecord$RouterRecord$SourceCommandRecord;

    .line 23
    .line 24
    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    .line 25
    .line 26
    .line 27
    move-result-object v2

    .line 28
    new-instance v3, Ljava/lang/StringBuilder;

    .line 29
    .line 30
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 31
    .line 32
    .line 33
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 34
    .line 35
    .line 36
    invoke-virtual {v3, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 37
    .line 38
    .line 39
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object v2

    .line 43
    invoke-virtual {v1}, Lcom/zykj/board/EzyRouterRecord$RouterRecord$SourceCommandRecord;->p()Lcom/zykj/board/EzyRouterRecord$RouterRecord$SourceCommandRecord$b;

    .line 44
    .line 45
    .line 46
    move-result-object v3

    .line 47
    invoke-virtual {v3}, Lcom/zykj/board/EzyRouterRecord$RouterRecord$SourceCommandRecord$b;->getFileName()Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object v4

    .line 51
    invoke-interface {p4, v4, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 52
    .line 53
    .line 54
    invoke-virtual {v3, v2}, Lcom/zykj/board/EzyRouterRecord$RouterRecord$SourceCommandRecord$b;->q(Ljava/lang/String;)Lcom/zykj/board/EzyRouterRecord$RouterRecord$SourceCommandRecord$b;

    .line 55
    .line 56
    .line 57
    move-result-object v3

    .line 58
    invoke-virtual {v3}, Lcom/zykj/board/EzyRouterRecord$RouterRecord$SourceCommandRecord$b;->d()Lcom/zykj/board/EzyRouterRecord$RouterRecord$SourceCommandRecord;

    .line 59
    .line 60
    .line 61
    move-result-object v3

    .line 62
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 63
    .line 64
    .line 65
    new-instance v3, Ljava/io/File;

    .line 66
    .line 67
    invoke-virtual {v1}, Lcom/zykj/board/EzyRouterRecord$RouterRecord$SourceCommandRecord;->getFileName()Ljava/lang/String;

    .line 68
    .line 69
    .line 70
    move-result-object v1

    .line 71
    invoke-direct {v3, p1, v1}, Ljava/io/File;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 72
    .line 73
    .line 74
    invoke-static {v3, v2}, Lcom/blankj/utilcode/util/FileUtils;->rename(Ljava/io/File;Ljava/lang/String;)Z

    .line 75
    .line 76
    .line 77
    goto :goto_0

    .line 78
    :cond_0
    return-object v0
.end method

.method private static final rightNoteListAdapter_delegate$lambda$0()Lcom/friday/paint/view/six/NewThumbnailListAdapter;
    .locals 1

    .line 1
    new-instance v0, Lcom/friday/paint/view/six/NewThumbnailListAdapter;

    .line 2
    .line 3
    invoke-direct {v0}, Lcom/friday/paint/view/six/NewThumbnailListAdapter;-><init>()V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method

.method public static synthetic s(Lcom/friday/paint/view/six/NewPaintFragment;Ljava/lang/String;)Lqc/q;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/friday/paint/view/six/NewPaintFragment;->onPause$lambda$2$lambda$1(Lcom/friday/paint/view/six/NewPaintFragment;Ljava/lang/String;)Lqc/q;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic save$default(Lcom/friday/paint/view/six/NewPaintFragment;Lcom/zykj/view/board/board/BoardFragment;ZLhd/l;Lhd/l;ILjava/lang/Object;)V
    .locals 0

    .line 1
    if-nez p6, :cond_2

    .line 2
    .line 3
    and-int/lit8 p6, p5, 0x2

    .line 4
    .line 5
    if-eqz p6, :cond_0

    .line 6
    .line 7
    const/4 p2, 0x1

    .line 8
    :cond_0
    and-int/lit8 p5, p5, 0x4

    .line 9
    .line 10
    if-eqz p5, :cond_1

    .line 11
    .line 12
    new-instance p3, Ld4/b;

    .line 13
    .line 14
    invoke-direct {p3}, Ld4/b;-><init>()V

    .line 15
    .line 16
    .line 17
    :cond_1
    invoke-virtual {p0, p1, p2, p3, p4}, Lcom/friday/paint/view/six/NewPaintFragment;->save(Lcom/zykj/view/board/board/BoardFragment;ZLhd/l;Lhd/l;)V

    .line 18
    .line 19
    .line 20
    return-void

    .line 21
    :cond_2
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    .line 22
    .line 23
    const-string p1, "Super calls with default arguments not supported in this target, function: save"

    .line 24
    .line 25
    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    throw p0
.end method

.method private static final save$lambda$69(Ljava/lang/Throwable;)Lqc/q;
    .locals 1

    .line 1
    const-string v0, "it"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    sget-object p0, Lqc/q;->a:Lqc/q;

    .line 7
    .line 8
    return-object p0
.end method

.method private final saveScreenCaptureToPng(Landroid/graphics/Bitmap;Ljava/lang/String;Lvc/c;)Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/graphics/Bitmap;",
            "Ljava/lang/String;",
            "Lvc/c<",
            "-",
            "Ljava/lang/String;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    invoke-static {}, Lsd/r0;->b()Lsd/e0;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    new-instance v1, Lcom/friday/paint/view/six/NewPaintFragment$saveScreenCaptureToPng$2;

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    invoke-direct {v1, p2, p1, p0, v2}, Lcom/friday/paint/view/six/NewPaintFragment$saveScreenCaptureToPng$2;-><init>(Ljava/lang/String;Landroid/graphics/Bitmap;Lcom/friday/paint/view/six/NewPaintFragment;Lvc/c;)V

    .line 9
    .line 10
    .line 11
    invoke-static {v0, v1, p3}, Lsd/f;->g(Lkotlin/coroutines/d;Lhd/p;Lvc/c;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    return-object p1
.end method

.method private static final shareLauncher$lambda$72(Lcom/friday/paint/view/six/NewPaintFragment;Landroidx/activity/result/ActivityResult;)V
    .locals 8

    .line 1
    const-string v0, "result"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p1}, Landroidx/activity/result/ActivityResult;->getResultCode()I

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    const/4 v1, -0x1

    .line 11
    if-ne v0, v1, :cond_1

    .line 12
    .line 13
    invoke-virtual {p1}, Landroidx/activity/result/ActivityResult;->getData()Landroid/content/Intent;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    if-eqz p1, :cond_0

    .line 18
    .line 19
    invoke-virtual {p1}, Landroid/content/Intent;->getData()Landroid/net/Uri;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    goto :goto_0

    .line 24
    :cond_0
    const/4 p1, 0x0

    .line 25
    :goto_0
    if-eqz p1, :cond_1

    .line 26
    .line 27
    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    invoke-static {p1}, Lk2/w;->a(Landroid/net/Uri;)Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object v2

    .line 34
    if-eqz v2, :cond_1

    .line 35
    .line 36
    invoke-virtual {p0}, Lcom/friday/paint/view/six/NewPaintFragment;->getCurrentNoteFragment()Lcom/zykj/view/board/board/BoardFragment;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    if-eqz v0, :cond_1

    .line 41
    .line 42
    new-instance v5, Ld4/l0;

    .line 43
    .line 44
    invoke-direct {v5, v2}, Ld4/l0;-><init>(Ljava/lang/String;)V

    .line 45
    .line 46
    .line 47
    const/4 v6, 0x5

    .line 48
    const/4 v7, 0x0

    .line 49
    const/4 v1, 0x0

    .line 50
    const/4 v3, 0x0

    .line 51
    const/4 v4, 0x1

    .line 52
    invoke-static/range {v0 .. v7}, Lcom/zykj/view/board/board/BoardFragment;->u0(Lcom/zykj/view/board/board/BoardFragment;Landroid/graphics/Bitmap;Ljava/lang/String;Ljava/lang/String;ZLhd/l;ILjava/lang/Object;)V

    .line 53
    .line 54
    .line 55
    :cond_1
    return-void
.end method

.method private static final shareLauncher$lambda$72$lambda$71$lambda$70(Ljava/lang/String;Ljava/lang/String;)Lqc/q;
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/blankj/utilcode/util/FileUtils;->delete(Ljava/lang/String;)Z

    .line 2
    .line 3
    .line 4
    sget-object p0, Lqc/q;->a:Lqc/q;

    .line 5
    .line 6
    return-object p0
.end method

.method private final startActivityToGallery()V
    .locals 4

    .line 1
    :try_start_0
    sget-object v0, Lkotlin/Result;->d:Lkotlin/Result$a;

    .line 2
    .line 3
    iget-object v0, p0, Lcom/friday/paint/view/six/NewPaintFragment;->shareLauncher:Landroidx/activity/result/ActivityResultLauncher;

    .line 4
    .line 5
    new-instance v1, Landroid/content/Intent;

    .line 6
    .line 7
    invoke-direct {v1}, Landroid/content/Intent;-><init>()V

    .line 8
    .line 9
    .line 10
    const-string v2, "com.zykj.manage"

    .line 11
    .line 12
    const-string v3, "com.zykj.gallery.ui.share.ShareActivity"

    .line 13
    .line 14
    invoke-virtual {v1, v2, v3}, Landroid/content/Intent;->setClassName(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 15
    .line 16
    .line 17
    invoke-virtual {v0, v1}, Landroidx/activity/result/ActivityResultLauncher;->launch(Ljava/lang/Object;)V

    .line 18
    .line 19
    .line 20
    sget-object v0, Lqc/q;->a:Lqc/q;

    .line 21
    .line 22
    invoke-static {v0}, Lkotlin/Result;->c(Ljava/lang/Object;)Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 26
    goto :goto_0

    .line 27
    :catchall_0
    move-exception v0

    .line 28
    sget-object v1, Lkotlin/Result;->d:Lkotlin/Result$a;

    .line 29
    .line 30
    invoke-static {v0}, Lkotlin/b;->a(Ljava/lang/Throwable;)Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    invoke-static {v0}, Lkotlin/Result;->c(Ljava/lang/Object;)Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    :goto_0
    invoke-static {v0}, Lkotlin/Result;->e(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    if-eqz v0, :cond_0

    .line 43
    .line 44
    const/4 v0, 0x0

    .line 45
    new-array v0, v0, [Ljava/lang/Object;

    .line 46
    .line 47
    const-string v1, "\u56fe\u5e93\u6253\u5f00\u5931\u8d25"

    .line 48
    .line 49
    invoke-static {v1, v0}, Lcom/blankj/utilcode/util/ToastUtils;->showShort(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 50
    .line 51
    .line 52
    :cond_0
    return-void
.end method

.method public static synthetic t(Ljava/util/List;Ljc/a;Ljava/lang/String;Lio/objectbox/BoxStore;)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2, p3}, Lcom/friday/paint/view/six/NewPaintFragment;->handleMdbUpdate$lambda$51(Ljava/util/List;Ljc/a;Ljava/lang/String;Lio/objectbox/BoxStore;)V

    return-void
.end method

.method public static synthetic u(Lcom/friday/paint/view/six/NewPaintFragment;I)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/friday/paint/view/six/NewPaintFragment;->addNote$lambda$57(Lcom/friday/paint/view/six/NewPaintFragment;I)V

    return-void
.end method

.method private final updateCurrentPage(II)V
    .locals 3

    .line 1
    invoke-virtual {p0}, Lcom/friday/common/base/BaseFragment;->getMBinding()Landroidx/databinding/ViewDataBinding;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    check-cast v0, Lcom/friday/paint/databinding/ResFragmentNewPaintBinding;

    .line 6
    .line 7
    iget-object v0, v0, Lcom/friday/paint/databinding/ResFragmentNewPaintBinding;->u:Landroid/widget/TextView;

    .line 8
    .line 9
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getResources()Landroid/content/res/Resources;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    sget v2, Lcom/friday/paint/R$string;->res_page_and_total_replace:I

    .line 14
    .line 15
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 20
    .line 21
    .line 22
    move-result-object p2

    .line 23
    filled-new-array {p1, p2}, [Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    invoke-virtual {v1, v2, p1}, Landroid/content/res/Resources;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 32
    .line 33
    .line 34
    return-void
.end method

.method private final updateGraphName(Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;Ljava/util/HashMap;)Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;",
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)",
            "Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;"
        }
    .end annotation

    .line 1
    invoke-virtual {p1}, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;->getChildGraphCount()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-gtz v0, :cond_1

    .line 6
    .line 7
    invoke-virtual {p1}, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;->Y()Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot$b;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    invoke-virtual {p1}, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot$b;->A()Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    invoke-virtual {p2, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object p2

    .line 19
    check-cast p2, Ljava/lang/String;

    .line 20
    .line 21
    if-nez p2, :cond_0

    .line 22
    .line 23
    invoke-virtual {p1}, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot$b;->A()Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object p2

    .line 27
    :cond_0
    invoke-virtual {p1, p2}, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot$b;->T(Ljava/lang/String;)Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot$b;

    .line 28
    .line 29
    .line 30
    invoke-virtual {p1}, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot$b;->g()Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;

    .line 31
    .line 32
    .line 33
    move-result-object p1

    .line 34
    invoke-static {p1}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 35
    .line 36
    .line 37
    return-object p1

    .line 38
    :cond_1
    invoke-virtual {p1}, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;->Y()Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot$b;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    invoke-virtual {v0}, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot$b;->A()Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object v1

    .line 46
    invoke-virtual {p2, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    move-result-object v1

    .line 50
    check-cast v1, Ljava/lang/String;

    .line 51
    .line 52
    if-nez v1, :cond_2

    .line 53
    .line 54
    invoke-virtual {v0}, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot$b;->A()Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    move-result-object v1

    .line 58
    :cond_2
    invoke-virtual {v0, v1}, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot$b;->T(Ljava/lang/String;)Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot$b;

    .line 59
    .line 60
    .line 61
    invoke-virtual {p1}, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;->getChildGraphList()Ljava/util/List;

    .line 62
    .line 63
    .line 64
    move-result-object p1

    .line 65
    const-string v1, "getChildGraphList(...)"

    .line 66
    .line 67
    invoke-static {p1, v1}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 68
    .line 69
    .line 70
    check-cast p1, Ljava/lang/Iterable;

    .line 71
    .line 72
    new-instance v1, Ljava/util/ArrayList;

    .line 73
    .line 74
    const/16 v2, 0xa

    .line 75
    .line 76
    invoke-static {p1, v2}, Lrc/x;->x(Ljava/lang/Iterable;I)I

    .line 77
    .line 78
    .line 79
    move-result v2

    .line 80
    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 81
    .line 82
    .line 83
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 84
    .line 85
    .line 86
    move-result-object p1

    .line 87
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 88
    .line 89
    .line 90
    move-result v2

    .line 91
    if-eqz v2, :cond_3

    .line 92
    .line 93
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 94
    .line 95
    .line 96
    move-result-object v2

    .line 97
    check-cast v2, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;

    .line 98
    .line 99
    invoke-static {v2}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 100
    .line 101
    .line 102
    invoke-direct {p0, v2, p2}, Lcom/friday/paint/view/six/NewPaintFragment;->updateGraphName(Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;Ljava/util/HashMap;)Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;

    .line 103
    .line 104
    .line 105
    move-result-object v2

    .line 106
    invoke-interface {v1, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 107
    .line 108
    .line 109
    goto :goto_0

    .line 110
    :cond_3
    invoke-virtual {v0}, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot$b;->l()Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot$b;

    .line 111
    .line 112
    .line 113
    invoke-virtual {v0, v1}, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot$b;->b(Ljava/lang/Iterable;)Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot$b;

    .line 114
    .line 115
    .line 116
    invoke-virtual {v0}, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot$b;->g()Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;

    .line 117
    .line 118
    .line 119
    move-result-object p1

    .line 120
    invoke-static {p1}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 121
    .line 122
    .line 123
    return-object p1
.end method

.method private final updateNoteScreenShotByNotePath(Ljava/lang/String;)V
    .locals 4

    .line 1
    if-eqz p1, :cond_5

    .line 2
    .line 3
    invoke-static {p1}, Lqd/c0;->h0(Ljava/lang/CharSequence;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    goto :goto_1

    .line 10
    :cond_0
    invoke-direct {p0}, Lcom/friday/paint/view/six/NewPaintFragment;->getViewModel()Lcom/friday/paint/viewmodel/NewNoteViewModel;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    invoke-virtual {v0, p1}, Lcom/friday/paint/viewmodel/NewNoteViewModel;->J(Ljava/lang/String;)Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    invoke-virtual {p0}, Lcom/friday/paint/view/six/NewPaintFragment;->getRightNoteListAdapter()Lcom/friday/paint/view/six/NewThumbnailListAdapter;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    invoke-virtual {v1}, Lcom/chad/library/adapter/base/BaseQuickAdapter;->getData()Ljava/util/List;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    check-cast v1, Ljava/lang/Iterable;

    .line 27
    .line 28
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 29
    .line 30
    .line 31
    move-result-object v1

    .line 32
    :cond_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 33
    .line 34
    .line 35
    move-result v2

    .line 36
    if-eqz v2, :cond_2

    .line 37
    .line 38
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object v2

    .line 42
    move-object v3, v2

    .line 43
    check-cast v3, Lcom/friday/paint/model/NoteListEntity;

    .line 44
    .line 45
    invoke-virtual {v3}, Lcom/friday/paint/model/NoteListEntity;->getSelected()Z

    .line 46
    .line 47
    .line 48
    move-result v3

    .line 49
    if-eqz v3, :cond_1

    .line 50
    .line 51
    goto :goto_0

    .line 52
    :cond_2
    const/4 v2, 0x0

    .line 53
    :goto_0
    check-cast v2, Lcom/friday/paint/model/NoteListEntity;

    .line 54
    .line 55
    invoke-virtual {p0}, Lcom/friday/paint/view/six/NewPaintFragment;->getRightNoteListAdapter()Lcom/friday/paint/view/six/NewThumbnailListAdapter;

    .line 56
    .line 57
    .line 58
    move-result-object v1

    .line 59
    invoke-virtual {v1}, Lcom/chad/library/adapter/base/BaseQuickAdapter;->getData()Ljava/util/List;

    .line 60
    .line 61
    .line 62
    move-result-object v1

    .line 63
    invoke-static {v1, v2}, Lrc/g0;->r0(Ljava/util/List;Ljava/lang/Object;)I

    .line 64
    .line 65
    .line 66
    move-result v1

    .line 67
    if-eqz v2, :cond_3

    .line 68
    .line 69
    invoke-virtual {v2, p1}, Lcom/friday/paint/model/NoteListEntity;->setNoteDir(Ljava/lang/String;)V

    .line 70
    .line 71
    .line 72
    :cond_3
    if-eqz v2, :cond_4

    .line 73
    .line 74
    invoke-virtual {v2, v0}, Lcom/friday/paint/model/NoteListEntity;->setThumbnailFile(Ljava/lang/String;)V

    .line 75
    .line 76
    .line 77
    :cond_4
    invoke-virtual {p0}, Lcom/friday/paint/view/six/NewPaintFragment;->getRightNoteListAdapter()Lcom/friday/paint/view/six/NewThumbnailListAdapter;

    .line 78
    .line 79
    .line 80
    move-result-object p1

    .line 81
    sget-object v0, Lcom/friday/common/entity/PayloadKey;->THUMBNAIL:Lcom/friday/common/entity/PayloadKey;

    .line 82
    .line 83
    invoke-virtual {p1, v1, v0}, Landroidx/recyclerview/widget/RecyclerView$Adapter;->notifyItemChanged(ILjava/lang/Object;)V

    .line 84
    .line 85
    .line 86
    :cond_5
    :goto_1
    return-void
.end method

.method private final updateThumbnailAndDb(Ljava/lang/String;)V
    .locals 2

    .line 1
    if-eqz p1, :cond_1

    .line 2
    .line 3
    invoke-direct {p0}, Lcom/friday/paint/view/six/NewPaintFragment;->getViewModel()Lcom/friday/paint/viewmodel/NewNoteViewModel;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0, p1}, Lcom/friday/paint/viewmodel/NewNoteViewModel;->J(Ljava/lang/String;)Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    invoke-virtual {p0}, Lcom/friday/paint/view/six/NewPaintFragment;->getCurrentPosition()I

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    invoke-virtual {p0}, Lcom/friday/paint/view/six/NewPaintFragment;->getRightNoteListAdapter()Lcom/friday/paint/view/six/NewThumbnailListAdapter;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    invoke-virtual {v1, v0}, Lcom/chad/library/adapter/base/BaseQuickAdapter;->getItemOrNull(I)Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    check-cast v1, Lcom/friday/paint/model/NoteListEntity;

    .line 24
    .line 25
    if-eqz v1, :cond_0

    .line 26
    .line 27
    invoke-virtual {v1, p1}, Lcom/friday/paint/model/NoteListEntity;->setThumbnailFile(Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    :cond_0
    invoke-virtual {p0}, Lcom/friday/paint/view/six/NewPaintFragment;->getRightNoteListAdapter()Lcom/friday/paint/view/six/NewThumbnailListAdapter;

    .line 31
    .line 32
    .line 33
    move-result-object p1

    .line 34
    sget-object v1, Lcom/friday/common/entity/PayloadKey;->THUMBNAIL:Lcom/friday/common/entity/PayloadKey;

    .line 35
    .line 36
    invoke-virtual {p1, v0, v1}, Landroidx/recyclerview/widget/RecyclerView$Adapter;->notifyItemChanged(ILjava/lang/Object;)V

    .line 37
    .line 38
    .line 39
    invoke-direct {p0}, Lcom/friday/paint/view/six/NewPaintFragment;->getViewModel()Lcom/friday/paint/viewmodel/NewNoteViewModel;

    .line 40
    .line 41
    .line 42
    move-result-object p1

    .line 43
    const/4 v0, 0x1

    .line 44
    invoke-virtual {p1, v0}, Lcom/friday/paint/viewmodel/NewNoteViewModel;->c0(Z)V

    .line 45
    .line 46
    .line 47
    :cond_1
    return-void
.end method

.method public static synthetic v()Lcom/friday/paint/view/six/NewThumbnailListAdapter;
    .locals 1

    .line 1
    invoke-static {}, Lcom/friday/paint/view/six/NewPaintFragment;->rightNoteListAdapter_delegate$lambda$0()Lcom/friday/paint/view/six/NewThumbnailListAdapter;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic w(Lcom/friday/paint/view/six/NewPaintFragment;Landroid/view/View;)Lqc/q;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/friday/paint/view/six/NewPaintFragment;->getNoteFragment$lambda$61(Lcom/friday/paint/view/six/NewPaintFragment;Landroid/view/View;)Lqc/q;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic x(Lcom/friday/paint/view/six/NewPaintFragment;Landroid/view/View;)Lqc/q;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/friday/paint/view/six/NewPaintFragment;->initDrawerRight$lambda$38(Lcom/friday/paint/view/six/NewPaintFragment;Landroid/view/View;)Lqc/q;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic y(Lcom/friday/paint/view/six/NewPaintFragment;Ljava/lang/String;)Lqc/q;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/friday/paint/view/six/NewPaintFragment;->initClick$lambda$7$lambda$5$lambda$4(Lcom/friday/paint/view/six/NewPaintFragment;Ljava/lang/String;)Lqc/q;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic z(Lcom/friday/paint/view/six/NewPaintFragment;Landroid/view/View;)Lqc/q;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/friday/paint/view/six/NewPaintFragment;->initClick$lambda$8(Lcom/friday/paint/view/six/NewPaintFragment;Landroid/view/View;)Lqc/q;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final addNote(IZ)V
    .locals 5

    .line 1
    invoke-virtual {p0}, Lcom/friday/paint/view/six/NewPaintFragment;->getRightNoteListAdapter()Lcom/friday/paint/view/six/NewThumbnailListAdapter;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Lcom/chad/library/adapter/base/BaseQuickAdapter;->getData()Ljava/util/List;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    const/16 v1, 0x63

    .line 14
    .line 15
    if-lt v0, v1, :cond_0

    .line 16
    .line 17
    const/4 p1, 0x0

    .line 18
    new-array p1, p1, [Ljava/lang/Object;

    .line 19
    .line 20
    const-string p2, "\u5df2\u8fbe\u9875\u6570\u4e0a\u9650\uff0c\u65e0\u6cd5\u65b0\u589e\u7b14\u8bb0\u9875"

    .line 21
    .line 22
    invoke-static {p2, p1}, Lcom/blankj/utilcode/util/ToastUtils;->showShort(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 23
    .line 24
    .line 25
    return-void

    .line 26
    :cond_0
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 27
    .line 28
    .line 29
    move-result-wide v0

    .line 30
    invoke-static {v0, v1}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    invoke-direct {p0}, Lcom/friday/paint/view/six/NewPaintFragment;->getViewModel()Lcom/friday/paint/viewmodel/NewNoteViewModel;

    .line 35
    .line 36
    .line 37
    move-result-object v1

    .line 38
    invoke-virtual {v1}, Lcom/friday/paint/viewmodel/NewNoteViewModel;->E()Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object v1

    .line 42
    new-instance v2, Ljava/lang/StringBuilder;

    .line 43
    .line 44
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 45
    .line 46
    .line 47
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 48
    .line 49
    .line 50
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 51
    .line 52
    .line 53
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 54
    .line 55
    .line 56
    move-result-object v0

    .line 57
    invoke-static {v0}, Lcom/blankj/utilcode/util/FileUtils;->createOrExistsDir(Ljava/lang/String;)Z

    .line 58
    .line 59
    .line 60
    invoke-virtual {p0}, Lcom/friday/paint/view/six/NewPaintFragment;->getRightNoteListAdapter()Lcom/friday/paint/view/six/NewThumbnailListAdapter;

    .line 61
    .line 62
    .line 63
    move-result-object v1

    .line 64
    new-instance v2, Lcom/friday/paint/model/NoteListEntity;

    .line 65
    .line 66
    const-string v3, ""

    .line 67
    .line 68
    const/4 v4, 0x1

    .line 69
    invoke-direct {v2, v3, v4, p2, v0}, Lcom/friday/paint/model/NoteListEntity;-><init>(Ljava/lang/String;ZZLjava/lang/String;)V

    .line 70
    .line 71
    .line 72
    invoke-virtual {v1, p1, v2}, Lcom/chad/library/adapter/base/BaseQuickAdapter;->addData(ILjava/lang/Object;)V

    .line 73
    .line 74
    .line 75
    invoke-virtual {p0}, Lcom/friday/paint/view/six/NewPaintFragment;->getRightNoteListAdapter()Lcom/friday/paint/view/six/NewThumbnailListAdapter;

    .line 76
    .line 77
    .line 78
    move-result-object p2

    .line 79
    invoke-virtual {p2}, Lcom/chad/library/adapter/base/BaseQuickAdapter;->getData()Ljava/util/List;

    .line 80
    .line 81
    .line 82
    move-result-object p2

    .line 83
    invoke-interface {p2}, Ljava/util/List;->size()I

    .line 84
    .line 85
    .line 86
    move-result p2

    .line 87
    move v0, p1

    .line 88
    :goto_0
    if-ge v0, p2, :cond_1

    .line 89
    .line 90
    invoke-virtual {p0}, Lcom/friday/paint/view/six/NewPaintFragment;->getRightNoteListAdapter()Lcom/friday/paint/view/six/NewThumbnailListAdapter;

    .line 91
    .line 92
    .line 93
    move-result-object v1

    .line 94
    invoke-virtual {v1, v0}, Landroidx/recyclerview/widget/RecyclerView$Adapter;->notifyItemChanged(I)V

    .line 95
    .line 96
    .line 97
    add-int/lit8 v0, v0, 0x1

    .line 98
    .line 99
    goto :goto_0

    .line 100
    :cond_1
    invoke-virtual {p0}, Lcom/friday/common/base/BaseFragment;->getMBinding()Landroidx/databinding/ViewDataBinding;

    .line 101
    .line 102
    .line 103
    move-result-object p2

    .line 104
    check-cast p2, Lcom/friday/paint/databinding/ResFragmentNewPaintBinding;

    .line 105
    .line 106
    iget-object p2, p2, Lcom/friday/paint/databinding/ResFragmentNewPaintBinding;->s:Landroidx/recyclerview/widget/RecyclerView;

    .line 107
    .line 108
    new-instance v0, Ld4/i;

    .line 109
    .line 110
    invoke-direct {v0, p0, p1}, Ld4/i;-><init>(Lcom/friday/paint/view/six/NewPaintFragment;I)V

    .line 111
    .line 112
    .line 113
    invoke-virtual {p2, v0}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 114
    .line 115
    .line 116
    return-void
.end method

.method public final getCurrentNoteFragment()Lcom/zykj/view/board/board/BoardFragment;
    .locals 3

    .line 1
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->isAdded()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    return-object v1

    .line 9
    :cond_0
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getChildFragmentManager()Landroidx/fragment/app/FragmentManager;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    const-string v2, "NoteFragment"

    .line 14
    .line 15
    invoke-virtual {v0, v2}, Landroidx/fragment/app/FragmentManager;->findFragmentByTag(Ljava/lang/String;)Landroidx/fragment/app/Fragment;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    instance-of v2, v0, Lcom/zykj/view/board/board/BoardFragment;

    .line 20
    .line 21
    if-eqz v2, :cond_1

    .line 22
    .line 23
    check-cast v0, Lcom/zykj/view/board/board/BoardFragment;

    .line 24
    .line 25
    return-object v0

    .line 26
    :cond_1
    return-object v1
.end method

.method public final getCurrentPosition()I
    .locals 1

    .line 1
    invoke-direct {p0}, Lcom/friday/paint/view/six/NewPaintFragment;->getViewModel()Lcom/friday/paint/viewmodel/NewNoteViewModel;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Lcom/friday/paint/viewmodel/NewNoteViewModel;->B()Landroidx/lifecycle/MutableLiveData;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-virtual {v0}, Landroidx/lifecycle/LiveData;->getValue()Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    check-cast v0, Ljava/lang/Integer;

    .line 14
    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    return v0

    .line 22
    :cond_0
    const/4 v0, 0x0

    .line 23
    return v0
.end method

.method public final getIClassManager()Lj2/b;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/friday/paint/view/six/NewPaintFragment;->iClassManager:Lj2/b;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-object v0

    .line 6
    :cond_0
    const-string v0, "iClassManager"

    .line 7
    .line 8
    invoke-static {v0}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const/4 v0, 0x0

    .line 12
    return-object v0
.end method

.method public getLayoutId()I
    .locals 1

    .line 1
    sget v0, Lcom/friday/paint/R$layout;->res_fragment_new_paint:I

    .line 2
    .line 3
    return v0
.end method

.method public final getRightNoteListAdapter()Lcom/friday/paint/view/six/NewThumbnailListAdapter;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/friday/paint/view/six/NewPaintFragment;->rightNoteListAdapter$delegate:Lqc/d;

    .line 2
    .line 3
    invoke-interface {v0}, Lqc/d;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lcom/friday/paint/view/six/NewThumbnailListAdapter;

    .line 8
    .line 9
    return-object v0
.end method

.method public initData()V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/friday/paint/view/six/NewPaintFragment;->initDrawerRight()V

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Lcom/friday/paint/view/six/NewPaintFragment;->initPaint()V

    .line 5
    .line 6
    .line 7
    invoke-direct {p0}, Lcom/friday/paint/view/six/NewPaintFragment;->initObserver()V

    .line 8
    .line 9
    .line 10
    invoke-direct {p0}, Lcom/friday/paint/view/six/NewPaintFragment;->initClick()V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public onPause()V
    .locals 8

    .line 1
    invoke-super {p0}, Landroidx/fragment/app/Fragment;->onPause()V

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Lcom/friday/paint/view/six/NewPaintFragment;->getViewModel()Lcom/friday/paint/viewmodel/NewNoteViewModel;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    invoke-virtual {v0}, Lcom/friday/paint/viewmodel/NewNoteViewModel;->F()Landroidx/lifecycle/MutableLiveData;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    invoke-virtual {v0}, Landroidx/lifecycle/LiveData;->getValue()Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    if-nez v0, :cond_0

    .line 17
    .line 18
    invoke-virtual {p0}, Lcom/friday/paint/view/six/NewPaintFragment;->getCurrentNoteFragment()Lcom/zykj/view/board/board/BoardFragment;

    .line 19
    .line 20
    .line 21
    move-result-object v2

    .line 22
    if-eqz v2, :cond_0

    .line 23
    .line 24
    new-instance v5, Ld4/h;

    .line 25
    .line 26
    invoke-direct {v5, p0}, Ld4/h;-><init>(Lcom/friday/paint/view/six/NewPaintFragment;)V

    .line 27
    .line 28
    .line 29
    const/4 v6, 0x4

    .line 30
    const/4 v7, 0x0

    .line 31
    const/4 v3, 0x0

    .line 32
    const/4 v4, 0x0

    .line 33
    move-object v1, p0

    .line 34
    invoke-static/range {v1 .. v7}, Lcom/friday/paint/view/six/NewPaintFragment;->save$default(Lcom/friday/paint/view/six/NewPaintFragment;Lcom/zykj/view/board/board/BoardFragment;ZLhd/l;Lhd/l;ILjava/lang/Object;)V

    .line 35
    .line 36
    .line 37
    :cond_0
    return-void
.end method

.method public onResume()V
    .locals 6

    .line 1
    invoke-super {p0}, Landroidx/fragment/app/Fragment;->onResume()V

    .line 2
    .line 3
    .line 4
    invoke-static {p0}, Landroidx/lifecycle/LifecycleOwnerKt;->getLifecycleScope(Landroidx/lifecycle/LifecycleOwner;)Landroidx/lifecycle/LifecycleCoroutineScope;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    new-instance v3, Lcom/friday/paint/view/six/NewPaintFragment$onResume$1;

    .line 9
    .line 10
    const/4 v1, 0x0

    .line 11
    invoke-direct {v3, p0, v1}, Lcom/friday/paint/view/six/NewPaintFragment$onResume$1;-><init>(Lcom/friday/paint/view/six/NewPaintFragment;Lvc/c;)V

    .line 12
    .line 13
    .line 14
    const/4 v4, 0x3

    .line 15
    const/4 v5, 0x0

    .line 16
    const/4 v2, 0x0

    .line 17
    invoke-static/range {v0 .. v5}, Lsd/f;->d(Lsd/i0;Lkotlin/coroutines/d;Lkotlinx/coroutines/CoroutineStart;Lhd/p;ILjava/lang/Object;)Lkotlinx/coroutines/g;

    .line 18
    .line 19
    .line 20
    return-void
.end method

.method public final save(Lcom/zykj/view/board/board/BoardFragment;ZLhd/l;Lhd/l;)V
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/zykj/view/board/board/BoardFragment;",
            "Z",
            "Lhd/l;",
            "Lhd/l;",
            ")V"
        }
    .end annotation

    .line 1
    const-string v0, "noteFragment"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "error"

    .line 7
    .line 8
    invoke-static {p3, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "callback"

    .line 12
    .line 13
    invoke-static {p4, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    invoke-static {p0}, Landroidx/lifecycle/LifecycleOwnerKt;->getLifecycleScope(Landroidx/lifecycle/LifecycleOwner;)Landroidx/lifecycle/LifecycleCoroutineScope;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    new-instance v2, Lcom/friday/paint/view/six/NewPaintFragment$save$2;

    .line 21
    .line 22
    const/4 v8, 0x0

    .line 23
    move-object v7, p0

    .line 24
    move-object v3, p1

    .line 25
    move v5, p2

    .line 26
    move-object v6, p3

    .line 27
    move-object v4, p4

    .line 28
    invoke-direct/range {v2 .. v8}, Lcom/friday/paint/view/six/NewPaintFragment$save$2;-><init>(Lcom/zykj/view/board/board/BoardFragment;Lhd/l;ZLhd/l;Lcom/friday/paint/view/six/NewPaintFragment;Lvc/c;)V

    .line 29
    .line 30
    .line 31
    const/4 v5, 0x3

    .line 32
    const/4 v6, 0x0

    .line 33
    move-object v4, v2

    .line 34
    const/4 v2, 0x0

    .line 35
    const/4 v3, 0x0

    .line 36
    invoke-static/range {v1 .. v6}, Lsd/f;->d(Lsd/i0;Lkotlin/coroutines/d;Lkotlinx/coroutines/CoroutineStart;Lhd/p;ILjava/lang/Object;)Lkotlinx/coroutines/g;

    .line 37
    .line 38
    .line 39
    return-void
.end method

.method public final setIClassManager(Lj2/b;)V
    .locals 1

    .line 1
    const-string v0, "<set-?>"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, Lcom/friday/paint/view/six/NewPaintFragment;->iClassManager:Lj2/b;

    .line 7
    .line 8
    return-void
.end method
