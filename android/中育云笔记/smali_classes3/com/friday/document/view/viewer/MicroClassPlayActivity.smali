.class public final Lcom/friday/document/view/viewer/MicroClassPlayActivity;
.super Lcom/friday/document/view/viewer/Hilt_MicroClassPlayActivity;
.source "SourceFile"


# annotations
.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x0
.end annotation

.annotation build Lcom/alibaba/android/arouter/facade/annotation/Route;
    path = "/document/MICRO_CLASS_ACTIVITY"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/friday/document/view/viewer/Hilt_MicroClassPlayActivity<",
        "Lcom/friday/document/databinding/ActivityMicroClassPlayerBinding;",
        ">;"
    }
.end annotation


# instance fields
.field public g:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Lcom/friday/document/view/viewer/Hilt_MicroClassPlayActivity;-><init>()V

    .line 2
    .line 3
    .line 4
    const-string v0, ""

    .line 5
    .line 6
    iput-object v0, p0, Lcom/friday/document/view/viewer/MicroClassPlayActivity;->g:Ljava/lang/String;

    .line 7
    .line 8
    return-void
.end method

.method public static synthetic N(Lcom/friday/document/view/viewer/MicroClassPlayActivity;)Lqc/q;
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/friday/document/view/viewer/MicroClassPlayActivity;->Q(Lcom/friday/document/view/viewer/MicroClassPlayActivity;)Lqc/q;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic O(Lcom/friday/document/view/viewer/MicroClassPlayActivity;)Lqc/q;
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/friday/document/view/viewer/MicroClassPlayActivity;->S(Lcom/friday/document/view/viewer/MicroClassPlayActivity;)Lqc/q;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic P(Lcom/zykj/view/board/play/SketchPlayFragment;Lcom/friday/document/view/viewer/MicroClassPlayActivity;)Lqc/q;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/friday/document/view/viewer/MicroClassPlayActivity;->R(Lcom/zykj/view/board/play/SketchPlayFragment;Lcom/friday/document/view/viewer/MicroClassPlayActivity;)Lqc/q;

    move-result-object p0

    return-object p0
.end method

.method public static final Q(Lcom/friday/document/view/viewer/MicroClassPlayActivity;)Lqc/q;
    .locals 0

    .line 1
    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    .line 2
    .line 3
    .line 4
    sget-object p0, Lqc/q;->a:Lqc/q;

    .line 5
    .line 6
    return-object p0
.end method

.method public static final R(Lcom/zykj/view/board/play/SketchPlayFragment;Lcom/friday/document/view/viewer/MicroClassPlayActivity;)Lqc/q;
    .locals 2

    .line 1
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getViewLifecycleOwner()Landroidx/lifecycle/LifecycleOwner;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-interface {v0}, Landroidx/lifecycle/LifecycleOwner;->getLifecycle()Landroidx/lifecycle/Lifecycle;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    new-instance v1, Lcom/friday/document/view/viewer/MicroClassPlayActivity$initView$1$1;

    .line 10
    .line 11
    invoke-direct {v1, p0, p1}, Lcom/friday/document/view/viewer/MicroClassPlayActivity$initView$1$1;-><init>(Lcom/zykj/view/board/play/SketchPlayFragment;Lcom/friday/document/view/viewer/MicroClassPlayActivity;)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {v0, v1}, Landroidx/lifecycle/Lifecycle;->addObserver(Landroidx/lifecycle/LifecycleObserver;)V

    .line 15
    .line 16
    .line 17
    sget-object p0, Lqc/q;->a:Lqc/q;

    .line 18
    .line 19
    return-object p0
.end method

.method public static final S(Lcom/friday/document/view/viewer/MicroClassPlayActivity;)Lqc/q;
    .locals 1

    .line 1
    const-string v0, "\u5fae\u8bfe\u6587\u4ef6\u635f\u574f"

    .line 2
    .line 3
    invoke-static {v0}, Lz1/b;->d(Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object p0, p0, Lcom/friday/document/view/viewer/MicroClassPlayActivity;->g:Ljava/lang/String;

    .line 7
    .line 8
    invoke-static {p0}, Lcom/blankj/utilcode/util/FileUtils;->delete(Ljava/lang/String;)Z

    .line 9
    .line 10
    .line 11
    sget-object p0, Lqc/q;->a:Lqc/q;

    .line 12
    .line 13
    return-object p0
.end method


# virtual methods
.method public getLayoutId()I
    .locals 1

    .line 1
    # RE layout layout/activity_micro_class_player (0x7f0c001f), APK res/dy.xml
    sget v0, Lcom/friday/document/R$layout;->activity_micro_class_player:I

    .line 2
    .line 3
    return v0
.end method

.method public initData()V
    .locals 1

    .line 1
    invoke-static {}, Lcom/alibaba/android/arouter/launcher/ARouter;->getInstance()Lcom/alibaba/android/arouter/launcher/ARouter;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0, p0}, Lcom/alibaba/android/arouter/launcher/ARouter;->inject(Ljava/lang/Object;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0}, Lcom/friday/document/view/viewer/MicroClassPlayActivity;->initView()V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public initView()V
    .locals 14

    .line 1
    invoke-virtual {p0}, Landroidx/fragment/app/FragmentActivity;->getSupportFragmentManager()Landroidx/fragment/app/FragmentManager;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    sget v1, Lcom/friday/document/R$id;->sketch_play_fragment:I

    .line 6
    .line 7
    invoke-virtual {v0, v1}, Landroidx/fragment/app/FragmentManager;->findFragmentById(I)Landroidx/fragment/app/Fragment;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    const-string v1, "null cannot be cast to non-null type com.zykj.view.board.play.SketchPlayFragment"

    .line 12
    .line 13
    invoke-static {v0, v1}, Lkotlin/jvm/internal/u;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    check-cast v0, Lcom/zykj/view/board/play/SketchPlayFragment;

    .line 17
    .line 18
    new-instance v1, Lnb/a;

    .line 19
    .line 20
    new-instance v3, Ly2/f;

    .line 21
    .line 22
    invoke-direct {v3, p0}, Ly2/f;-><init>(Lcom/friday/document/view/viewer/MicroClassPlayActivity;)V

    .line 23
    .line 24
    .line 25
    const/16 v12, 0x2fd

    .line 26
    .line 27
    const/4 v13, 0x0

    .line 28
    const/4 v2, 0x0

    .line 29
    const/4 v4, 0x0

    .line 30
    const/4 v5, 0x0

    .line 31
    const/4 v6, 0x0

    .line 32
    const/4 v7, 0x0

    .line 33
    const/4 v8, 0x0

    .line 34
    const/4 v9, 0x0

    .line 35
    const/4 v10, 0x1

    .line 36
    const/4 v11, 0x0

    .line 37
    invoke-direct/range {v1 .. v13}, Lnb/a;-><init>(ZLhd/a;Lhd/a;ZLhd/a;Ljava/util/List;Lhd/a;Lnb/b;ZZILkotlin/jvm/internal/n;)V

    .line 38
    .line 39
    .line 40
    invoke-virtual {v0, v1}, Lcom/zykj/view/board/play/SketchPlayFragment;->p0(Lnb/a;)V

    .line 41
    .line 42
    .line 43
    new-instance v1, Lk2/t;

    .line 44
    .line 45
    iget-object v2, p0, Lcom/friday/document/view/viewer/MicroClassPlayActivity;->g:Ljava/lang/String;

    .line 46
    .line 47
    const/4 v3, 0x0

    .line 48
    invoke-direct {v1, v2, v3}, Lk2/t;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 49
    .line 50
    .line 51
    new-instance v2, Ly2/g;

    .line 52
    .line 53
    invoke-direct {v2, v0, p0}, Ly2/g;-><init>(Lcom/zykj/view/board/play/SketchPlayFragment;Lcom/friday/document/view/viewer/MicroClassPlayActivity;)V

    .line 54
    .line 55
    .line 56
    new-instance v0, Ly2/h;

    .line 57
    .line 58
    invoke-direct {v0, p0}, Ly2/h;-><init>(Lcom/friday/document/view/viewer/MicroClassPlayActivity;)V

    .line 59
    .line 60
    .line 61
    invoke-virtual {v1, v2, v0}, Lk2/t;->a(Lhd/a;Lhd/a;)V

    .line 62
    .line 63
    .line 64
    return-void
.end method
