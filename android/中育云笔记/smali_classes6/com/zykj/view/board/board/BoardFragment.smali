.class public final Lcom/zykj/view/board/board/BoardFragment;
.super Landroidx/fragment/app/Fragment;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/zykj/view/board/board/BoardFragment$a;
    }
.end annotation


# static fields
.field public static final i:Lcom/zykj/view/board/board/BoardFragment$a;


# instance fields
.field public d:Lcom/zykj/view/databinding/ViewFragmentBoardBinding;

.field public final e:Lqc/d;

.field public final f:Lvb/l;

.field public g:Lhd/a;

.field public final h:Landroidx/activity/result/ActivityResultLauncher;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/zykj/view/board/board/BoardFragment$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/zykj/view/board/board/BoardFragment$a;-><init>(Lkotlin/jvm/internal/n;)V

    sput-object v0, Lcom/zykj/view/board/board/BoardFragment;->i:Lcom/zykj/view/board/board/BoardFragment$a;

    return-void
.end method

.method public constructor <init>()V
    .locals 3

    .line 1
    invoke-direct {p0}, Landroidx/fragment/app/Fragment;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lkb/y;

    .line 5
    .line 6
    invoke-direct {v0}, Lkb/y;-><init>()V

    .line 7
    .line 8
    .line 9
    invoke-static {v0}, Lkotlin/a;->a(Lhd/a;)Lqc/d;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    iput-object v0, p0, Lcom/zykj/view/board/board/BoardFragment;->e:Lqc/d;

    .line 14
    .line 15
    new-instance v0, Lvb/l;

    .line 16
    .line 17
    const/4 v1, 0x0

    .line 18
    const/4 v2, 0x2

    .line 19
    invoke-direct {v0, p0, v1, v2, v1}, Lvb/l;-><init>(Landroidx/fragment/app/Fragment;Landroidx/activity/ComponentActivity;ILkotlin/jvm/internal/n;)V

    .line 20
    .line 21
    .line 22
    iput-object v0, p0, Lcom/zykj/view/board/board/BoardFragment;->f:Lvb/l;

    .line 23
    .line 24
    new-instance v0, Landroidx/activity/result/contract/ActivityResultContracts$RequestPermission;

    .line 25
    .line 26
    invoke-direct {v0}, Landroidx/activity/result/contract/ActivityResultContracts$RequestPermission;-><init>()V

    .line 27
    .line 28
    .line 29
    new-instance v1, Lkb/z;

    .line 30
    .line 31
    invoke-direct {v1, p0}, Lkb/z;-><init>(Lcom/zykj/view/board/board/BoardFragment;)V

    .line 32
    .line 33
    .line 34
    invoke-virtual {p0, v0, v1}, Landroidx/fragment/app/Fragment;->registerForActivityResult(Landroidx/activity/result/contract/ActivityResultContract;Landroidx/activity/result/ActivityResultCallback;)Landroidx/activity/result/ActivityResultLauncher;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    const-string v1, "registerForActivityResult(...)"

    .line 39
    .line 40
    invoke-static {v0, v1}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 41
    .line 42
    .line 43
    iput-object v0, p0, Lcom/zykj/view/board/board/BoardFragment;->h:Landroidx/activity/result/ActivityResultLauncher;

    .line 44
    .line 45
    return-void
.end method

.method public static synthetic A(Lcom/zykj/view/board/board/BoardFragment;)Lqc/q;
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/zykj/view/board/board/BoardFragment;->X0(Lcom/zykj/view/board/board/BoardFragment;)Lqc/q;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic A0(Lhd/l;Ljava/lang/String;Lvc/c;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-interface {p0, p1}, Lhd/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    sget-object p0, Lqc/q;->a:Lqc/q;

    .line 5
    .line 6
    return-object p0
.end method

.method public static final A1(Lcom/zykj/view/board/board/BoardFragment;)Lqc/q;
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/zykj/view/board/board/BoardFragment;->w0()Lcom/zykj/view/board/board/BoardViewModel;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0}, Lcom/zykj/view/board/board/BoardViewModel;->C()V

    .line 6
    .line 7
    .line 8
    sget-object p0, Lqc/q;->a:Lqc/q;

    .line 9
    .line 10
    return-object p0
.end method

.method public static synthetic B(Lcom/zykj/view/board/board/BoardFragment;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/zykj/view/board/board/BoardFragment;->r1(Lcom/zykj/view/board/board/BoardFragment;Landroid/view/View;)V

    return-void
.end method

.method public static final B1(Lcom/zykj/view/board/board/BoardFragment;F)Lqc/q;
    .locals 2

    .line 1
    invoke-virtual {p0}, Lcom/zykj/view/board/board/BoardFragment;->w0()Lcom/zykj/view/board/board/BoardViewModel;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    const/4 v0, 0x0

    .line 10
    const/4 v1, 0x2

    .line 11
    invoke-static {p0, p1, v0, v1, v0}, Lcom/zykj/view/board/board/BoardViewModel;->E(Lcom/zykj/view/board/board/BoardViewModel;Ljava/lang/Float;Ljava/lang/Float;ILjava/lang/Object;)V

    .line 12
    .line 13
    .line 14
    sget-object p0, Lqc/q;->a:Lqc/q;

    .line 15
    .line 16
    return-object p0
.end method

.method public static synthetic C(Lcom/zykj/view/board/board/BoardFragment;Lcom/zykj/view/databinding/ViewItemSketchRecordAudioBinding;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lcom/zykj/view/board/board/BoardFragment;->R0(Lcom/zykj/view/board/board/BoardFragment;Lcom/zykj/view/databinding/ViewItemSketchRecordAudioBinding;Landroid/view/View;)V

    return-void
.end method

.method public static final C1(Lcom/zykj/view/board/board/BoardFragment;F)Lqc/q;
    .locals 2

    .line 1
    invoke-virtual {p0}, Lcom/zykj/view/board/board/BoardFragment;->w0()Lcom/zykj/view/board/board/BoardViewModel;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    const/4 v0, 0x0

    .line 10
    const/4 v1, 0x2

    .line 11
    invoke-static {p0, p1, v0, v1, v0}, Lcom/zykj/view/board/board/BoardViewModel;->B(Lcom/zykj/view/board/board/BoardViewModel;Ljava/lang/Float;Ljava/lang/Float;ILjava/lang/Object;)V

    .line 12
    .line 13
    .line 14
    sget-object p0, Lqc/q;->a:Lqc/q;

    .line 15
    .line 16
    return-object p0
.end method

.method public static synthetic D(Lcom/zykj/view/board/board/BoardFragment;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/zykj/view/board/board/BoardFragment;->M0(Lcom/zykj/view/board/board/BoardFragment;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic E(Lcom/zykj/view/board/board/BoardFragment;)Lqc/q;
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/zykj/view/board/board/BoardFragment;->Z0(Lcom/zykj/view/board/board/BoardFragment;)Lqc/q;

    move-result-object p0

    return-object p0
.end method

.method public static final E0(Lcom/zykj/view/board/board/BoardFragment;ILandroid/view/View;)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/zykj/view/board/board/BoardFragment;->w0()Lcom/zykj/view/board/board/BoardViewModel;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0, p1}, Lcom/zykj/view/board/board/BoardViewModel;->S0(I)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public static synthetic F(Lcom/zykj/view/board/board/BoardFragment;F)Lqc/q;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/zykj/view/board/board/BoardFragment;->z1(Lcom/zykj/view/board/board/BoardFragment;F)Lqc/q;

    move-result-object p0

    return-object p0
.end method

.method public static final F1(Lcom/zykj/view/board/board/BoardFragment;Lcom/zykj/blackboard/core/edit/IBoardControl;ZJ)Lqc/q;
    .locals 2

    .line 1
    const-string v0, "iBoardControl"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance v0, Ljava/lang/StringBuilder;

    .line 7
    .line 8
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 9
    .line 10
    .line 11
    const-string v1, "\u9875\u9762BoardFragment\uff0c\u753b\u677f\u6570\u636e\u52a0\u8f7d\u6210\u529f\uff0c\u662f\u5426\u7f13\u5b58"

    .line 12
    .line 13
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 14
    .line 15
    .line 16
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 17
    .line 18
    .line 19
    const-string v1, "\uff0c\u52a0\u8f7d\u8017\u65f6\u4e3a"

    .line 20
    .line 21
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 22
    .line 23
    .line 24
    invoke-virtual {v0, p3, p4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 25
    .line 26
    .line 27
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    filled-new-array {v0}, [Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    invoke-static {v0}, Lcom/blankj/utilcode/util/LogUtils;->d([Ljava/lang/Object;)V

    .line 36
    .line 37
    .line 38
    invoke-virtual {p0}, Lcom/zykj/view/board/board/BoardFragment;->w0()Lcom/zykj/view/board/board/BoardViewModel;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    invoke-virtual {v0, p1, p2, p3, p4}, Lcom/zykj/view/board/board/BoardViewModel;->f0(Lcom/zykj/blackboard/core/edit/IBoardControl;ZJ)V

    .line 43
    .line 44
    .line 45
    invoke-virtual {p0}, Lcom/zykj/view/board/board/BoardFragment;->C0()V

    .line 46
    .line 47
    .line 48
    sget-object p0, Lqc/q;->a:Lqc/q;

    .line 49
    .line 50
    return-object p0
.end method

.method public static synthetic G(Lcom/zykj/view/board/board/BoardFragment;Lcom/zykj/view/databinding/ViewItemSketchRecordAudioBinding;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lcom/zykj/view/board/board/BoardFragment;->Q0(Lcom/zykj/view/board/board/BoardFragment;Lcom/zykj/view/databinding/ViewItemSketchRecordAudioBinding;Landroid/view/View;)V

    return-void
.end method

.method public static final G0(Lcom/zykj/view/board/board/BoardFragment;)V
    .locals 4

    .line 1
    invoke-virtual {p0}, Lcom/zykj/view/board/board/BoardFragment;->w0()Lcom/zykj/view/board/board/BoardViewModel;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v1, p0, Lcom/zykj/view/board/board/BoardFragment;->d:Lcom/zykj/view/databinding/ViewFragmentBoardBinding;

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    const-string v3, "mBinding"

    .line 9
    .line 10
    if-nez v1, :cond_0

    .line 11
    .line 12
    invoke-static {v3}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    move-object v1, v2

    .line 16
    :cond_0
    iget-object v1, v1, Lcom/zykj/view/databinding/ViewFragmentBoardBinding;->o:Lcom/zykj/blackboard/core/canvas/SketchRecorderView;

    .line 17
    .line 18
    invoke-virtual {v1}, Landroid/view/View;->getWidth()I

    .line 19
    .line 20
    .line 21
    move-result v1

    .line 22
    int-to-float v1, v1

    .line 23
    iget-object p0, p0, Lcom/zykj/view/board/board/BoardFragment;->d:Lcom/zykj/view/databinding/ViewFragmentBoardBinding;

    .line 24
    .line 25
    if-nez p0, :cond_1

    .line 26
    .line 27
    invoke-static {v3}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_1
    move-object v2, p0

    .line 32
    :goto_0
    iget-object p0, v2, Lcom/zykj/view/databinding/ViewFragmentBoardBinding;->o:Lcom/zykj/blackboard/core/canvas/SketchRecorderView;

    .line 33
    .line 34
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    .line 35
    .line 36
    .line 37
    move-result p0

    .line 38
    int-to-float p0, p0

    .line 39
    invoke-virtual {v0, v1, p0}, Lcom/zykj/view/board/board/BoardViewModel;->F0(FF)V

    .line 40
    .line 41
    .line 42
    return-void
.end method

.method public static final G1(Lcom/zykj/view/board/board/BoardFragment;Ljava/lang/Throwable;)Lqc/q;
    .locals 2

    .line 1
    const-string v0, "it"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    new-instance v0, Ljava/lang/StringBuilder;

    .line 11
    .line 12
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 13
    .line 14
    .line 15
    const-string v1, "\u9875\u9762BoardFragment\uff0c\u753b\u677f\u6570\u636e\u52a0\u8f7d\u5931\u8d25\uff0cmessage: "

    .line 16
    .line 17
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 18
    .line 19
    .line 20
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    filled-new-array {p1}, [Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    invoke-static {p1}, Lcom/blankj/utilcode/util/LogUtils;->d([Ljava/lang/Object;)V

    .line 32
    .line 33
    .line 34
    invoke-virtual {p0}, Lcom/zykj/view/board/board/BoardFragment;->C0()V

    .line 35
    .line 36
    .line 37
    invoke-virtual {p0}, Lcom/zykj/view/board/board/BoardFragment;->w0()Lcom/zykj/view/board/board/BoardViewModel;

    .line 38
    .line 39
    .line 40
    move-result-object p0

    .line 41
    invoke-virtual {p0}, Lcom/zykj/view/board/board/BoardViewModel;->J()Lkb/a;

    .line 42
    .line 43
    .line 44
    move-result-object p0

    .line 45
    if-eqz p0, :cond_0

    .line 46
    .line 47
    invoke-virtual {p0}, Lkb/a;->i()Lhd/a;

    .line 48
    .line 49
    .line 50
    move-result-object p0

    .line 51
    if-eqz p0, :cond_0

    .line 52
    .line 53
    invoke-interface {p0}, Lhd/a;->invoke()Ljava/lang/Object;

    .line 54
    .line 55
    .line 56
    :cond_0
    sget-object p0, Lqc/q;->a:Lqc/q;

    .line 57
    .line 58
    return-object p0
.end method

.method public static synthetic H(Lcom/zykj/view/board/board/BoardFragment;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/zykj/view/board/board/BoardFragment;->N0(Lcom/zykj/view/board/board/BoardFragment;Landroid/view/View;)V

    return-void
.end method

.method private final H0()V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/zykj/view/board/board/BoardFragment;->f1()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Lcom/zykj/view/board/board/BoardFragment;->s1()V

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0}, Lcom/zykj/view/board/board/BoardFragment;->I0()V

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0}, Lcom/zykj/view/board/board/BoardFragment;->V0()V

    .line 11
    .line 12
    .line 13
    invoke-virtual {p0}, Lcom/zykj/view/board/board/BoardFragment;->D0()V

    .line 14
    .line 15
    .line 16
    invoke-virtual {p0}, Lcom/zykj/view/board/board/BoardFragment;->K0()V

    .line 17
    .line 18
    .line 19
    invoke-virtual {p0}, Lcom/zykj/view/board/board/BoardFragment;->w1()V

    .line 20
    .line 21
    .line 22
    return-void
.end method

.method public static final H1()Lcom/zykj/view/board/board/BoardViewModel;
    .locals 1

    .line 1
    new-instance v0, Lcom/zykj/view/board/board/BoardViewModel;

    .line 2
    .line 3
    invoke-direct {v0}, Lcom/zykj/view/board/board/BoardViewModel;-><init>()V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method

.method public static synthetic I(Lcom/zykj/view/board/board/BoardFragment;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/zykj/view/board/board/BoardFragment;->h1(Lcom/zykj/view/board/board/BoardFragment;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic J(Lcom/zykj/view/board/board/BoardFragment;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/zykj/view/board/board/BoardFragment;->W0(Lcom/zykj/view/board/board/BoardFragment;Landroid/view/View;)V

    return-void
.end method

.method public static final J0(Lcom/zykj/view/board/board/BoardFragment;ILandroid/view/View;)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/zykj/view/board/board/BoardFragment;->w0()Lcom/zykj/view/board/board/BoardViewModel;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0, p1}, Lcom/zykj/view/board/board/BoardViewModel;->V0(I)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public static synthetic K(Lcom/zykj/view/board/board/BoardFragment;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/zykj/view/board/board/BoardFragment;->e1(Lcom/zykj/view/board/board/BoardFragment;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic L(Lcom/zykj/view/board/board/BoardFragment;)Lqc/q;
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/zykj/view/board/board/BoardFragment;->o1(Lcom/zykj/view/board/board/BoardFragment;)Lqc/q;

    move-result-object p0

    return-object p0
.end method

.method public static final L0(Lcom/zykj/view/board/board/BoardFragment;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/zykj/view/board/board/BoardFragment;->w0()Lcom/zykj/view/board/board/BoardViewModel;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0}, Lcom/zykj/view/board/board/BoardViewModel;->J()Lkb/a;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    if-eqz p0, :cond_0

    .line 10
    .line 11
    invoke-virtual {p0}, Lkb/a;->b()Lhd/l;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    if-eqz p0, :cond_0

    .line 16
    .line 17
    invoke-static {p1}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 18
    .line 19
    .line 20
    invoke-interface {p0, p1}, Lhd/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    :cond_0
    return-void
.end method

.method public static synthetic M(Ljava/io/File;Ljava/lang/String;)Lqc/q;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/zykj/view/board/board/BoardFragment;->Q1(Ljava/io/File;Ljava/lang/String;)Lqc/q;

    move-result-object p0

    return-object p0
.end method

.method public static final M0(Lcom/zykj/view/board/board/BoardFragment;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/zykj/view/board/board/BoardFragment;->w0()Lcom/zykj/view/board/board/BoardViewModel;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0}, Lcom/zykj/view/board/board/BoardViewModel;->Y()V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public static synthetic N(Lcom/zykj/view/board/board/BoardFragment;Lcom/zykj/view/databinding/ViewItemSketchRecordAudioBinding;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lcom/zykj/view/board/board/BoardFragment;->S0(Lcom/zykj/view/board/board/BoardFragment;Lcom/zykj/view/databinding/ViewItemSketchRecordAudioBinding;Landroid/view/View;)V

    return-void
.end method

.method public static final N0(Lcom/zykj/view/board/board/BoardFragment;Landroid/view/View;)V
    .locals 0

    .line 1
    new-instance p1, Lkb/p0;

    .line 2
    .line 3
    invoke-direct {p1, p0}, Lkb/p0;-><init>(Lcom/zykj/view/board/board/BoardFragment;)V

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, Lcom/zykj/view/board/board/BoardFragment;->g:Lhd/a;

    .line 7
    .line 8
    iget-object p0, p0, Lcom/zykj/view/board/board/BoardFragment;->h:Landroidx/activity/result/ActivityResultLauncher;

    .line 9
    .line 10
    const-string p1, "android.permission.RECORD_AUDIO"

    .line 11
    .line 12
    invoke-virtual {p0, p1}, Landroidx/activity/result/ActivityResultLauncher;->launch(Ljava/lang/Object;)V

    .line 13
    .line 14
    .line 15
    return-void
.end method

.method public static synthetic O(Lcom/zykj/view/board/board/BoardFragment;Ljava/lang/Throwable;)Lqc/q;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/zykj/view/board/board/BoardFragment;->G1(Lcom/zykj/view/board/board/BoardFragment;Ljava/lang/Throwable;)Lqc/q;

    move-result-object p0

    return-object p0
.end method

.method public static final O0(Lcom/zykj/view/board/board/BoardFragment;)Lqc/q;
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/zykj/view/board/board/BoardFragment;->w0()Lcom/zykj/view/board/board/BoardViewModel;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0}, Lcom/zykj/view/board/board/BoardViewModel;->R0()V

    .line 6
    .line 7
    .line 8
    sget-object p0, Lqc/q;->a:Lqc/q;

    .line 9
    .line 10
    return-object p0
.end method

.method public static synthetic P(Lcom/zykj/view/board/board/BoardFragment;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/zykj/view/board/board/BoardFragment;->a1(Lcom/zykj/view/board/board/BoardFragment;Landroid/view/View;)V

    return-void
.end method

.method public static final P0(Lcom/zykj/view/board/board/BoardFragment;Landroid/view/View;)V
    .locals 2

    .line 1
    invoke-virtual {p0}, Lcom/zykj/view/board/board/BoardFragment;->w0()Lcom/zykj/view/board/board/BoardViewModel;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    const/4 p1, 0x1

    .line 6
    const/4 v0, 0x0

    .line 7
    const/4 v1, 0x0

    .line 8
    invoke-static {p0, v1, p1, v0}, Lcom/zykj/view/board/board/BoardViewModel;->Z0(Lcom/zykj/view/board/board/BoardViewModel;ZILjava/lang/Object;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public static final P1(Lcom/zykj/view/board/board/BoardFragment;Landroid/net/Uri;)Lqc/q;
    .locals 8

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    sget-object p0, Lqc/q;->a:Lqc/q;

    .line 4
    .line 5
    return-object p0

    .line 6
    :cond_0
    invoke-static {p1}, Lcom/blankj/utilcode/util/UriUtils;->uri2FileNoCacheCopy(Landroid/net/Uri;)Ljava/io/File;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    invoke-virtual {p1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object v2

    .line 14
    new-instance v5, Lkb/u0;

    .line 15
    .line 16
    invoke-direct {v5, p1}, Lkb/u0;-><init>(Ljava/io/File;)V

    .line 17
    .line 18
    .line 19
    const/4 v6, 0x5

    .line 20
    const/4 v7, 0x0

    .line 21
    const/4 v1, 0x0

    .line 22
    const/4 v3, 0x0

    .line 23
    const/4 v4, 0x1

    .line 24
    move-object v0, p0

    .line 25
    invoke-static/range {v0 .. v7}, Lcom/zykj/view/board/board/BoardFragment;->u0(Lcom/zykj/view/board/board/BoardFragment;Landroid/graphics/Bitmap;Ljava/lang/String;Ljava/lang/String;ZLhd/l;ILjava/lang/Object;)V

    .line 26
    .line 27
    .line 28
    sget-object p0, Lqc/q;->a:Lqc/q;

    .line 29
    .line 30
    return-object p0
.end method

.method public static synthetic Q(Lcom/zykj/view/board/board/BoardFragment;Ljava/lang/Boolean;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/zykj/view/board/board/BoardFragment;->v0(Lcom/zykj/view/board/board/BoardFragment;Ljava/lang/Boolean;)V

    return-void
.end method

.method public static final Q0(Lcom/zykj/view/board/board/BoardFragment;Lcom/zykj/view/databinding/ViewItemSketchRecordAudioBinding;Landroid/view/View;)V
    .locals 9

    .line 1
    invoke-virtual {p0}, Lcom/zykj/view/board/board/BoardFragment;->w0()Lcom/zykj/view/board/board/BoardViewModel;

    .line 2
    .line 3
    .line 4
    move-result-object p2

    .line 5
    invoke-virtual {p2}, Lcom/zykj/view/board/board/BoardViewModel;->J()Lkb/a;

    .line 6
    .line 7
    .line 8
    move-result-object p2

    .line 9
    if-eqz p2, :cond_0

    .line 10
    .line 11
    invoke-virtual {p2}, Lkb/a;->e()Lhd/l;

    .line 12
    .line 13
    .line 14
    move-result-object p2

    .line 15
    if-eqz p2, :cond_0

    .line 16
    .line 17
    iget-object v0, p1, Lcom/zykj/view/databinding/ViewItemSketchRecordAudioBinding;->e:Landroidx/appcompat/widget/LinearLayoutCompat;

    .line 18
    .line 19
    const/4 v1, 0x0

    .line 20
    invoke-virtual {v0, v1}, Landroid/view/View;->setEnabled(Z)V

    .line 21
    .line 22
    .line 23
    invoke-virtual {p0}, Lcom/zykj/view/board/board/BoardFragment;->w0()Lcom/zykj/view/board/board/BoardViewModel;

    .line 24
    .line 25
    .line 26
    move-result-object v2

    .line 27
    new-instance v5, Lcom/zykj/view/board/board/BoardFragment$initExtraClickListener$3$3$1$1;

    .line 28
    .line 29
    const/4 p0, 0x0

    .line 30
    invoke-direct {v5, p2, p1, p0}, Lcom/zykj/view/board/board/BoardFragment$initExtraClickListener$3$3$1$1;-><init>(Lhd/l;Lcom/zykj/view/databinding/ViewItemSketchRecordAudioBinding;Lvc/c;)V

    .line 31
    .line 32
    .line 33
    new-instance v6, Lcom/zykj/view/board/board/BoardFragment$initExtraClickListener$3$3$1$2;

    .line 34
    .line 35
    invoke-direct {v6, p2, p1, p0}, Lcom/zykj/view/board/board/BoardFragment$initExtraClickListener$3$3$1$2;-><init>(Lhd/l;Lcom/zykj/view/databinding/ViewItemSketchRecordAudioBinding;Lvc/c;)V

    .line 36
    .line 37
    .line 38
    const/4 v7, 0x2

    .line 39
    const/4 v8, 0x0

    .line 40
    const/4 v3, 0x0

    .line 41
    const/4 v4, 0x0

    .line 42
    invoke-static/range {v2 .. v8}, Lcom/zykj/view/board/board/BoardViewModel;->X(Lcom/zykj/view/board/board/BoardViewModel;ZZLhd/p;Lhd/p;ILjava/lang/Object;)V

    .line 43
    .line 44
    .line 45
    :cond_0
    return-void
.end method

.method public static final Q1(Ljava/io/File;Ljava/lang/String;)Lqc/q;
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/blankj/utilcode/util/FileUtils;->delete(Ljava/io/File;)Z

    .line 2
    .line 3
    .line 4
    sget-object p0, Lqc/q;->a:Lqc/q;

    .line 5
    .line 6
    return-object p0
.end method

.method public static synthetic R(Ljava/io/File;Ljava/lang/String;)Lqc/q;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/zykj/view/board/board/BoardFragment;->T1(Ljava/io/File;Ljava/lang/String;)Lqc/q;

    move-result-object p0

    return-object p0
.end method

.method public static final R0(Lcom/zykj/view/board/board/BoardFragment;Lcom/zykj/view/databinding/ViewItemSketchRecordAudioBinding;Landroid/view/View;)V
    .locals 9

    .line 1
    invoke-virtual {p0}, Lcom/zykj/view/board/board/BoardFragment;->w0()Lcom/zykj/view/board/board/BoardViewModel;

    .line 2
    .line 3
    .line 4
    move-result-object p2

    .line 5
    invoke-virtual {p2}, Lcom/zykj/view/board/board/BoardViewModel;->J()Lkb/a;

    .line 6
    .line 7
    .line 8
    move-result-object p2

    .line 9
    if-eqz p2, :cond_0

    .line 10
    .line 11
    invoke-virtual {p2}, Lkb/a;->j()Lhd/l;

    .line 12
    .line 13
    .line 14
    move-result-object p2

    .line 15
    if-eqz p2, :cond_0

    .line 16
    .line 17
    iget-object v0, p1, Lcom/zykj/view/databinding/ViewItemSketchRecordAudioBinding;->h:Landroidx/appcompat/widget/LinearLayoutCompat;

    .line 18
    .line 19
    const/4 v1, 0x0

    .line 20
    invoke-virtual {v0, v1}, Landroid/view/View;->setEnabled(Z)V

    .line 21
    .line 22
    .line 23
    invoke-virtual {p0}, Lcom/zykj/view/board/board/BoardFragment;->w0()Lcom/zykj/view/board/board/BoardViewModel;

    .line 24
    .line 25
    .line 26
    move-result-object v2

    .line 27
    new-instance v5, Lcom/zykj/view/board/board/BoardFragment$initExtraClickListener$3$4$1$1;

    .line 28
    .line 29
    const/4 p0, 0x0

    .line 30
    invoke-direct {v5, p2, p1, p0}, Lcom/zykj/view/board/board/BoardFragment$initExtraClickListener$3$4$1$1;-><init>(Lhd/l;Lcom/zykj/view/databinding/ViewItemSketchRecordAudioBinding;Lvc/c;)V

    .line 31
    .line 32
    .line 33
    new-instance v6, Lcom/zykj/view/board/board/BoardFragment$initExtraClickListener$3$4$1$2;

    .line 34
    .line 35
    invoke-direct {v6, p2, p1, p0}, Lcom/zykj/view/board/board/BoardFragment$initExtraClickListener$3$4$1$2;-><init>(Lhd/l;Lcom/zykj/view/databinding/ViewItemSketchRecordAudioBinding;Lvc/c;)V

    .line 36
    .line 37
    .line 38
    const/4 v7, 0x2

    .line 39
    const/4 v8, 0x0

    .line 40
    const/4 v3, 0x0

    .line 41
    const/4 v4, 0x0

    .line 42
    invoke-static/range {v2 .. v8}, Lcom/zykj/view/board/board/BoardViewModel;->X(Lcom/zykj/view/board/board/BoardViewModel;ZZLhd/p;Lhd/p;ILjava/lang/Object;)V

    .line 43
    .line 44
    .line 45
    :cond_0
    return-void
.end method

.method public static synthetic S(Lcom/zykj/view/board/board/BoardFragment;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/zykj/view/board/board/BoardFragment;->k1(Lcom/zykj/view/board/board/BoardFragment;Landroid/view/View;)V

    return-void
.end method

.method public static final S0(Lcom/zykj/view/board/board/BoardFragment;Lcom/zykj/view/databinding/ViewItemSketchRecordAudioBinding;Landroid/view/View;)V
    .locals 9

    .line 1
    invoke-virtual {p0}, Lcom/zykj/view/board/board/BoardFragment;->w0()Lcom/zykj/view/board/board/BoardViewModel;

    .line 2
    .line 3
    .line 4
    move-result-object p2

    .line 5
    invoke-virtual {p2}, Lcom/zykj/view/board/board/BoardViewModel;->J()Lkb/a;

    .line 6
    .line 7
    .line 8
    move-result-object p2

    .line 9
    if-eqz p2, :cond_0

    .line 10
    .line 11
    invoke-virtual {p2}, Lkb/a;->d()Lhd/p;

    .line 12
    .line 13
    .line 14
    move-result-object p2

    .line 15
    if-eqz p2, :cond_0

    .line 16
    .line 17
    iget-object v0, p1, Lcom/zykj/view/databinding/ViewItemSketchRecordAudioBinding;->j:Landroidx/appcompat/widget/LinearLayoutCompat;

    .line 18
    .line 19
    const/4 v1, 0x0

    .line 20
    invoke-virtual {v0, v1}, Landroid/view/View;->setEnabled(Z)V

    .line 21
    .line 22
    .line 23
    invoke-virtual {p0}, Lcom/zykj/view/board/board/BoardFragment;->w0()Lcom/zykj/view/board/board/BoardViewModel;

    .line 24
    .line 25
    .line 26
    move-result-object v2

    .line 27
    new-instance v5, Lcom/zykj/view/board/board/BoardFragment$initExtraClickListener$3$5$1$1;

    .line 28
    .line 29
    const/4 p0, 0x0

    .line 30
    invoke-direct {v5, p2, p1, p0}, Lcom/zykj/view/board/board/BoardFragment$initExtraClickListener$3$5$1$1;-><init>(Lhd/p;Lcom/zykj/view/databinding/ViewItemSketchRecordAudioBinding;Lvc/c;)V

    .line 31
    .line 32
    .line 33
    new-instance v6, Lcom/zykj/view/board/board/BoardFragment$initExtraClickListener$3$5$1$2;

    .line 34
    .line 35
    invoke-direct {v6, p2, p1, p0}, Lcom/zykj/view/board/board/BoardFragment$initExtraClickListener$3$5$1$2;-><init>(Lhd/p;Lcom/zykj/view/databinding/ViewItemSketchRecordAudioBinding;Lvc/c;)V

    .line 36
    .line 37
    .line 38
    const/4 v7, 0x3

    .line 39
    const/4 v8, 0x0

    .line 40
    const/4 v3, 0x0

    .line 41
    const/4 v4, 0x0

    .line 42
    invoke-static/range {v2 .. v8}, Lcom/zykj/view/board/board/BoardViewModel;->X(Lcom/zykj/view/board/board/BoardViewModel;ZZLhd/p;Lhd/p;ILjava/lang/Object;)V

    .line 43
    .line 44
    .line 45
    :cond_0
    return-void
.end method

.method public static final S1(Lcom/zykj/view/board/board/BoardFragment;Landroid/net/Uri;)Lqc/q;
    .locals 8

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    sget-object p0, Lqc/q;->a:Lqc/q;

    .line 4
    .line 5
    return-object p0

    .line 6
    :cond_0
    invoke-static {p1}, Lcom/blankj/utilcode/util/UriUtils;->uri2FileNoCacheCopy(Landroid/net/Uri;)Ljava/io/File;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    invoke-virtual {p1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object v2

    .line 14
    new-instance v5, Lkb/s0;

    .line 15
    .line 16
    invoke-direct {v5, p1}, Lkb/s0;-><init>(Ljava/io/File;)V

    .line 17
    .line 18
    .line 19
    const/4 v6, 0x5

    .line 20
    const/4 v7, 0x0

    .line 21
    const/4 v1, 0x0

    .line 22
    const/4 v3, 0x0

    .line 23
    const/4 v4, 0x1

    .line 24
    move-object v0, p0

    .line 25
    invoke-static/range {v0 .. v7}, Lcom/zykj/view/board/board/BoardFragment;->u0(Lcom/zykj/view/board/board/BoardFragment;Landroid/graphics/Bitmap;Ljava/lang/String;Ljava/lang/String;ZLhd/l;ILjava/lang/Object;)V

    .line 26
    .line 27
    .line 28
    sget-object p0, Lqc/q;->a:Lqc/q;

    .line 29
    .line 30
    return-object p0
.end method

.method public static synthetic T(Lcom/zykj/view/board/board/BoardFragment;Landroid/net/Uri;)Lqc/q;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/zykj/view/board/board/BoardFragment;->S1(Lcom/zykj/view/board/board/BoardFragment;Landroid/net/Uri;)Lqc/q;

    move-result-object p0

    return-object p0
.end method

.method public static final T0(Lcom/zykj/view/board/board/BoardFragment;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/zykj/view/board/board/BoardFragment;->w0()Lcom/zykj/view/board/board/BoardViewModel;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0}, Lcom/zykj/view/board/board/BoardViewModel;->G()V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public static final T1(Ljava/io/File;Ljava/lang/String;)Lqc/q;
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/blankj/utilcode/util/FileUtils;->delete(Ljava/io/File;)Z

    .line 2
    .line 3
    .line 4
    sget-object p0, Lqc/q;->a:Lqc/q;

    .line 5
    .line 6
    return-object p0
.end method

.method public static synthetic U(Lcom/zykj/view/board/board/BoardFragment;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/zykj/view/board/board/BoardFragment;->c1(Lcom/zykj/view/board/board/BoardFragment;Landroid/view/View;)V

    return-void
.end method

.method public static final U0(Lcom/zykj/view/board/board/BoardFragment;Lcom/zykj/view/databinding/ViewItemSketchRecordBinding;Landroid/view/View;)V
    .locals 9

    .line 1
    invoke-virtual {p0}, Lcom/zykj/view/board/board/BoardFragment;->w0()Lcom/zykj/view/board/board/BoardViewModel;

    .line 2
    .line 3
    .line 4
    move-result-object p2

    .line 5
    invoke-virtual {p2}, Lcom/zykj/view/board/board/BoardViewModel;->J()Lkb/a;

    .line 6
    .line 7
    .line 8
    move-result-object p2

    .line 9
    if-eqz p2, :cond_0

    .line 10
    .line 11
    invoke-virtual {p2}, Lkb/a;->d()Lhd/p;

    .line 12
    .line 13
    .line 14
    move-result-object p2

    .line 15
    if-eqz p2, :cond_0

    .line 16
    .line 17
    iget-object v0, p1, Lcom/zykj/view/databinding/ViewItemSketchRecordBinding;->c:Landroid/widget/TextView;

    .line 18
    .line 19
    const/4 v1, 0x0

    .line 20
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setEnabled(Z)V

    .line 21
    .line 22
    .line 23
    invoke-virtual {p0}, Lcom/zykj/view/board/board/BoardFragment;->w0()Lcom/zykj/view/board/board/BoardViewModel;

    .line 24
    .line 25
    .line 26
    move-result-object v2

    .line 27
    new-instance v5, Lcom/zykj/view/board/board/BoardFragment$initExtraClickListener$4$1$1$1;

    .line 28
    .line 29
    const/4 p0, 0x0

    .line 30
    invoke-direct {v5, p2, p1, p0}, Lcom/zykj/view/board/board/BoardFragment$initExtraClickListener$4$1$1$1;-><init>(Lhd/p;Lcom/zykj/view/databinding/ViewItemSketchRecordBinding;Lvc/c;)V

    .line 31
    .line 32
    .line 33
    new-instance v6, Lcom/zykj/view/board/board/BoardFragment$initExtraClickListener$4$1$1$2;

    .line 34
    .line 35
    invoke-direct {v6, p2, p1, p0}, Lcom/zykj/view/board/board/BoardFragment$initExtraClickListener$4$1$1$2;-><init>(Lhd/p;Lcom/zykj/view/databinding/ViewItemSketchRecordBinding;Lvc/c;)V

    .line 36
    .line 37
    .line 38
    const/4 v7, 0x3

    .line 39
    const/4 v8, 0x0

    .line 40
    const/4 v3, 0x0

    .line 41
    const/4 v4, 0x0

    .line 42
    invoke-static/range {v2 .. v8}, Lcom/zykj/view/board/board/BoardViewModel;->X(Lcom/zykj/view/board/board/BoardViewModel;ZZLhd/p;Lhd/p;ILjava/lang/Object;)V

    .line 43
    .line 44
    .line 45
    :cond_0
    return-void
.end method

.method public static synthetic V(Lcom/zykj/view/board/board/BoardFragment;)Lqc/q;
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/zykj/view/board/board/BoardFragment;->O0(Lcom/zykj/view/board/board/BoardFragment;)Lqc/q;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic W(Lcom/zykj/view/board/board/BoardFragment;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/zykj/view/board/board/BoardFragment;->q1(Lcom/zykj/view/board/board/BoardFragment;Landroid/view/View;)V

    return-void
.end method

.method public static final W0(Lcom/zykj/view/board/board/BoardFragment;Landroid/view/View;)V
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/zykj/view/board/board/BoardFragment;->w0()Lcom/zykj/view/board/board/BoardViewModel;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-virtual {p1}, Lcom/zykj/view/board/board/BoardViewModel;->J()Lkb/a;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    if-eqz p1, :cond_0

    .line 10
    .line 11
    invoke-virtual {p1}, Lkb/a;->f()Lhd/l;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    if-eqz p1, :cond_0

    .line 16
    .line 17
    new-instance v0, Lkb/o0;

    .line 18
    .line 19
    invoke-direct {v0, p0}, Lkb/o0;-><init>(Lcom/zykj/view/board/board/BoardFragment;)V

    .line 20
    .line 21
    .line 22
    invoke-interface {p1, v0}, Lhd/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    return-void

    .line 26
    :cond_0
    invoke-virtual {p0}, Lcom/zykj/view/board/board/BoardFragment;->R1()V

    .line 27
    .line 28
    .line 29
    return-void
.end method

.method public static synthetic X(Lcom/zykj/view/board/board/BoardFragment;)V
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/zykj/view/board/board/BoardFragment;->G0(Lcom/zykj/view/board/board/BoardFragment;)V

    return-void
.end method

.method public static final X0(Lcom/zykj/view/board/board/BoardFragment;)Lqc/q;
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/zykj/view/board/board/BoardFragment;->R1()V

    .line 2
    .line 3
    .line 4
    sget-object p0, Lqc/q;->a:Lqc/q;

    .line 5
    .line 6
    return-object p0
.end method

.method public static synthetic Y(Lcom/zykj/view/board/board/BoardFragment;ILandroid/view/View;)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lcom/zykj/view/board/board/BoardFragment;->v1(Lcom/zykj/view/board/board/BoardFragment;ILandroid/view/View;)V

    return-void
.end method

.method public static final Y0(Lcom/zykj/view/board/board/BoardFragment;Landroid/view/View;)V
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/zykj/view/board/board/BoardFragment;->w0()Lcom/zykj/view/board/board/BoardViewModel;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-virtual {p1}, Lcom/zykj/view/board/board/BoardViewModel;->J()Lkb/a;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    if-eqz p1, :cond_0

    .line 10
    .line 11
    invoke-virtual {p1}, Lkb/a;->c()Lhd/l;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    if-eqz p1, :cond_0

    .line 16
    .line 17
    new-instance v0, Lkb/l0;

    .line 18
    .line 19
    invoke-direct {v0, p0}, Lkb/l0;-><init>(Lcom/zykj/view/board/board/BoardFragment;)V

    .line 20
    .line 21
    .line 22
    invoke-interface {p1, v0}, Lhd/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    return-void

    .line 26
    :cond_0
    invoke-virtual {p0}, Lcom/zykj/view/board/board/BoardFragment;->O1()V

    .line 27
    .line 28
    .line 29
    return-void
.end method

.method public static synthetic Z(Lcom/zykj/view/board/board/BoardFragment;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/zykj/view/board/board/BoardFragment;->L0(Lcom/zykj/view/board/board/BoardFragment;Landroid/view/View;)V

    return-void
.end method

.method public static final Z0(Lcom/zykj/view/board/board/BoardFragment;)Lqc/q;
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/zykj/view/board/board/BoardFragment;->O1()V

    .line 2
    .line 3
    .line 4
    sget-object p0, Lqc/q;->a:Lqc/q;

    .line 5
    .line 6
    return-object p0
.end method

.method public static synthetic a0(Lcom/zykj/view/board/board/BoardFragment;)Lqc/q;
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/zykj/view/board/board/BoardFragment;->A1(Lcom/zykj/view/board/board/BoardFragment;)Lqc/q;

    move-result-object p0

    return-object p0
.end method

.method public static final a1(Lcom/zykj/view/board/board/BoardFragment;Landroid/view/View;)V
    .locals 7

    .line 1
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->requireContext()Landroid/content/Context;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const-string p1, "requireContext(...)"

    .line 6
    .line 7
    invoke-static {v0, p1}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    new-instance v4, Lkb/m0;

    .line 11
    .line 12
    invoke-direct {v4, p0}, Lkb/m0;-><init>(Lcom/zykj/view/board/board/BoardFragment;)V

    .line 13
    .line 14
    .line 15
    const/4 v5, 0x7

    .line 16
    const/4 v6, 0x0

    .line 17
    const/4 v1, 0x0

    .line 18
    const/4 v2, 0x0

    .line 19
    const/4 v3, 0x0

    .line 20
    invoke-static/range {v0 .. v6}, Lkb/w1;->j(Landroid/content/Context;Ljava/lang/String;Lhd/l;Lhd/a;Lhd/l;ILjava/lang/Object;)V

    .line 21
    .line 22
    .line 23
    return-void
.end method

.method public static synthetic b0(Lcom/zykj/view/board/board/BoardFragment;F)Lqc/q;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/zykj/view/board/board/BoardFragment;->y1(Lcom/zykj/view/board/board/BoardFragment;F)Lqc/q;

    move-result-object p0

    return-object p0
.end method

.method public static final b1(Lcom/zykj/view/board/board/BoardFragment;Ljava/lang/String;)Lqc/q;
    .locals 1

    .line 1
    const-string v0, "it"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Lcom/zykj/view/board/board/BoardFragment;->w0()Lcom/zykj/view/board/board/BoardViewModel;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    invoke-virtual {p0, p1}, Lcom/zykj/view/board/board/BoardViewModel;->z(Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    sget-object p0, Lqc/q;->a:Lqc/q;

    .line 14
    .line 15
    return-object p0
.end method

.method public static synthetic c0(Lcom/zykj/view/board/board/BoardFragment;)Lqc/q;
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/zykj/view/board/board/BoardFragment;->x1(Lcom/zykj/view/board/board/BoardFragment;)Lqc/q;

    move-result-object p0

    return-object p0
.end method

.method public static final c1(Lcom/zykj/view/board/board/BoardFragment;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/zykj/view/board/board/BoardFragment;->w0()Lcom/zykj/view/board/board/BoardViewModel;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    sget-object p1, Lcom/zykj/view/board/board/o$c;->e:Lcom/zykj/view/board/board/o$c;

    .line 6
    .line 7
    invoke-virtual {p0, p1}, Lcom/zykj/view/board/board/BoardViewModel;->X0(Lcom/zykj/view/board/board/o;)V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public static synthetic d0(Lcom/zykj/view/board/board/BoardFragment;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/zykj/view/board/board/BoardFragment;->j1(Lcom/zykj/view/board/board/BoardFragment;Landroid/view/View;)V

    return-void
.end method

.method public static final d1(Lcom/zykj/view/board/board/BoardFragment;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/zykj/view/board/board/BoardFragment;->w0()Lcom/zykj/view/board/board/BoardViewModel;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    sget-object p1, Lcom/zykj/view/board/board/o$b;->e:Lcom/zykj/view/board/board/o$b;

    .line 6
    .line 7
    invoke-virtual {p0, p1}, Lcom/zykj/view/board/board/BoardViewModel;->X0(Lcom/zykj/view/board/board/o;)V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public static synthetic e0(Lcom/zykj/view/board/board/BoardFragment;ILandroid/view/View;)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lcom/zykj/view/board/board/BoardFragment;->J0(Lcom/zykj/view/board/board/BoardFragment;ILandroid/view/View;)V

    return-void
.end method

.method public static final e1(Lcom/zykj/view/board/board/BoardFragment;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/zykj/view/board/board/BoardFragment;->w0()Lcom/zykj/view/board/board/BoardViewModel;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    sget-object p1, Lcom/zykj/view/board/board/o$d;->e:Lcom/zykj/view/board/board/o$d;

    .line 6
    .line 7
    invoke-virtual {p0, p1}, Lcom/zykj/view/board/board/BoardViewModel;->X0(Lcom/zykj/view/board/board/o;)V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public static synthetic f0(Lcom/zykj/view/board/board/BoardFragment;Landroid/net/Uri;)Lqc/q;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/zykj/view/board/board/BoardFragment;->P1(Lcom/zykj/view/board/board/BoardFragment;Landroid/net/Uri;)Lqc/q;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic g0(Lcom/zykj/view/board/board/BoardFragment;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/zykj/view/board/board/BoardFragment;->n1(Lcom/zykj/view/board/board/BoardFragment;Landroid/view/View;)V

    return-void
.end method

.method public static final g1(Lcom/zykj/view/board/board/BoardFragment;Landroid/view/View;)V
    .locals 2

    .line 1
    invoke-virtual {p0}, Lcom/zykj/view/board/board/BoardFragment;->w0()Lcom/zykj/view/board/board/BoardViewModel;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    const/4 p1, 0x1

    .line 6
    const/4 v0, 0x0

    .line 7
    const/4 v1, 0x0

    .line 8
    invoke-static {p0, v1, p1, v0}, Lcom/zykj/view/board/board/BoardViewModel;->g1(Lcom/zykj/view/board/board/BoardViewModel;ZILjava/lang/Object;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public static synthetic h0(Lcom/zykj/view/board/board/BoardFragment;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/zykj/view/board/board/BoardFragment;->m1(Lcom/zykj/view/board/board/BoardFragment;Landroid/view/View;)V

    return-void
.end method

.method public static final h1(Lcom/zykj/view/board/board/BoardFragment;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/zykj/view/board/board/BoardFragment;->w0()Lcom/zykj/view/board/board/BoardViewModel;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    const/4 p1, 0x1

    .line 6
    invoke-virtual {p0, p1}, Lcom/zykj/view/board/board/BoardViewModel;->i1(Z)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public static synthetic i0(Lcom/zykj/view/board/board/BoardFragment;Lcom/zykj/view/databinding/ViewItemSketchRecordBinding;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lcom/zykj/view/board/board/BoardFragment;->U0(Lcom/zykj/view/board/board/BoardFragment;Lcom/zykj/view/databinding/ViewItemSketchRecordBinding;Landroid/view/View;)V

    return-void
.end method

.method public static final i1(Lcom/zykj/view/board/board/BoardFragment;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/zykj/view/board/board/BoardFragment;->w0()Lcom/zykj/view/board/board/BoardViewModel;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    const/4 p1, 0x0

    .line 6
    invoke-virtual {p0, p1}, Lcom/zykj/view/board/board/BoardViewModel;->i1(Z)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method private final initObserver()V
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
    new-instance v5, Lcom/zykj/view/board/board/BoardFragment$initObserver$1;

    .line 15
    .line 16
    const/4 v0, 0x0

    .line 17
    invoke-direct {v5, p0, v0}, Lcom/zykj/view/board/board/BoardFragment$initObserver$1;-><init>(Lcom/zykj/view/board/board/BoardFragment;Lvc/c;)V

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

.method private final initView()V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/zykj/view/board/board/BoardFragment;->F0()V

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Lcom/zykj/view/board/board/BoardFragment;->H0()V

    .line 5
    .line 6
    .line 7
    invoke-direct {p0}, Lcom/zykj/view/board/board/BoardFragment;->initObserver()V

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0}, Lcom/zykj/view/board/board/BoardFragment;->E1()V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public static synthetic j0(Lcom/zykj/view/board/board/BoardFragment;Ljava/lang/String;)Lqc/q;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/zykj/view/board/board/BoardFragment;->b1(Lcom/zykj/view/board/board/BoardFragment;Ljava/lang/String;)Lqc/q;

    move-result-object p0

    return-object p0
.end method

.method public static final j1(Lcom/zykj/view/board/board/BoardFragment;Landroid/view/View;)V
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/zykj/view/board/board/BoardFragment;->w0()Lcom/zykj/view/board/board/BoardViewModel;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    sget-object v0, Lcom/zykj/view/board/board/q$c;->e:Lcom/zykj/view/board/board/q$c;

    .line 6
    .line 7
    invoke-virtual {p1, v0}, Lcom/zykj/view/board/board/BoardViewModel;->b1(Lcom/zykj/view/board/board/q;)V

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0}, Lcom/zykj/view/board/board/BoardFragment;->w0()Lcom/zykj/view/board/board/BoardViewModel;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    invoke-virtual {p0}, Lcom/zykj/view/board/board/BoardViewModel;->Q0()V

    .line 15
    .line 16
    .line 17
    return-void
.end method

.method public static synthetic k0(Lcom/zykj/view/board/board/BoardFragment;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/zykj/view/board/board/BoardFragment;->p1(Lcom/zykj/view/board/board/BoardFragment;Landroid/view/View;)V

    return-void
.end method

.method public static final k1(Lcom/zykj/view/board/board/BoardFragment;Landroid/view/View;)V
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/zykj/view/board/board/BoardFragment;->w0()Lcom/zykj/view/board/board/BoardViewModel;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    sget-object v0, Lcom/zykj/view/board/board/q$a;->e:Lcom/zykj/view/board/board/q$a;

    .line 6
    .line 7
    invoke-virtual {p1, v0}, Lcom/zykj/view/board/board/BoardViewModel;->b1(Lcom/zykj/view/board/board/q;)V

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0}, Lcom/zykj/view/board/board/BoardFragment;->w0()Lcom/zykj/view/board/board/BoardViewModel;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    invoke-virtual {p0}, Lcom/zykj/view/board/board/BoardViewModel;->O0()V

    .line 15
    .line 16
    .line 17
    return-void
.end method

.method public static synthetic l0(Lcom/zykj/view/board/board/BoardFragment;ILandroid/view/View;)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lcom/zykj/view/board/board/BoardFragment;->E0(Lcom/zykj/view/board/board/BoardFragment;ILandroid/view/View;)V

    return-void
.end method

.method public static final l1(Lcom/zykj/view/board/board/BoardFragment;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/zykj/view/board/board/BoardFragment;->w0()Lcom/zykj/view/board/board/BoardViewModel;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0}, Lcom/zykj/view/board/board/BoardViewModel;->P0()V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public static synthetic m0(Lcom/zykj/view/board/board/BoardFragment;Lcom/zykj/blackboard/core/edit/IBoardControl;ZJ)Lqc/q;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2, p3, p4}, Lcom/zykj/view/board/board/BoardFragment;->F1(Lcom/zykj/view/board/board/BoardFragment;Lcom/zykj/blackboard/core/edit/IBoardControl;ZJ)Lqc/q;

    move-result-object p0

    return-object p0
.end method

.method public static final m1(Lcom/zykj/view/board/board/BoardFragment;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/zykj/view/board/board/BoardFragment;->w0()Lcom/zykj/view/board/board/BoardViewModel;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0}, Lcom/zykj/view/board/board/BoardViewModel;->N0()V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public static final synthetic n0(Lcom/zykj/view/board/board/BoardFragment;)Lcom/zykj/view/databinding/ViewFragmentBoardBinding;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/zykj/view/board/board/BoardFragment;->d:Lcom/zykj/view/databinding/ViewFragmentBoardBinding;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final n1(Lcom/zykj/view/board/board/BoardFragment;Landroid/view/View;)V
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->requireContext()Landroid/content/Context;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    const-string v0, "requireContext(...)"

    .line 6
    .line 7
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    new-instance v0, Lkb/n0;

    .line 11
    .line 12
    invoke-direct {v0, p0}, Lkb/n0;-><init>(Lcom/zykj/view/board/board/BoardFragment;)V

    .line 13
    .line 14
    .line 15
    invoke-static {p1, v0}, Lkb/w1;->f(Landroid/content/Context;Lhd/a;)V

    .line 16
    .line 17
    .line 18
    return-void
.end method

.method public static synthetic o()Lcom/zykj/view/board/board/BoardViewModel;
    .locals 1

    .line 1
    invoke-static {}, Lcom/zykj/view/board/board/BoardFragment;->H1()Lcom/zykj/view/board/board/BoardViewModel;

    move-result-object v0

    return-object v0
.end method

.method public static final synthetic o0(Lcom/zykj/view/board/board/BoardFragment;)Lvb/l;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/zykj/view/board/board/BoardFragment;->f:Lvb/l;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final o1(Lcom/zykj/view/board/board/BoardFragment;)Lqc/q;
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/zykj/view/board/board/BoardFragment;->w0()Lcom/zykj/view/board/board/BoardViewModel;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0}, Lcom/zykj/view/board/board/BoardViewModel;->F()V

    .line 6
    .line 7
    .line 8
    sget-object p0, Lqc/q;->a:Lqc/q;

    .line 9
    .line 10
    return-object p0
.end method

.method public static synthetic p(Lcom/zykj/view/board/board/BoardFragment;ILandroid/view/View;)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lcom/zykj/view/board/board/BoardFragment;->u1(Lcom/zykj/view/board/board/BoardFragment;ILandroid/view/View;)V

    return-void
.end method

.method public static final synthetic p0(Lcom/zykj/view/board/board/BoardFragment;)Lcom/zykj/view/board/board/BoardViewModel;
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/zykj/view/board/board/BoardFragment;->w0()Lcom/zykj/view/board/board/BoardViewModel;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static final p1(Lcom/zykj/view/board/board/BoardFragment;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/zykj/view/board/board/BoardFragment;->w0()Lcom/zykj/view/board/board/BoardViewModel;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    const/4 p1, 0x0

    .line 6
    invoke-virtual {p0, p1}, Lcom/zykj/view/board/board/BoardViewModel;->M0(Z)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public static synthetic q(Lcom/zykj/view/board/board/BoardFragment;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/zykj/view/board/board/BoardFragment;->i1(Lcom/zykj/view/board/board/BoardFragment;Landroid/view/View;)V

    return-void
.end method

.method public static final synthetic q0(Lhd/l;Ljava/lang/String;Lvc/c;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lcom/zykj/view/board/board/BoardFragment;->A0(Lhd/l;Ljava/lang/String;Lvc/c;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static final q1(Lcom/zykj/view/board/board/BoardFragment;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/zykj/view/board/board/BoardFragment;->w0()Lcom/zykj/view/board/board/BoardViewModel;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    const/4 p1, 0x1

    .line 6
    invoke-virtual {p0, p1}, Lcom/zykj/view/board/board/BoardViewModel;->M0(Z)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public static synthetic r(Lcom/zykj/view/board/board/BoardFragment;F)Lqc/q;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/zykj/view/board/board/BoardFragment;->C1(Lcom/zykj/view/board/board/BoardFragment;F)Lqc/q;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic r0(Lcom/zykj/view/board/board/BoardFragment;Lkb/b1;)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcom/zykj/view/board/board/BoardFragment;->K1(Lkb/b1;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static final r1(Lcom/zykj/view/board/board/BoardFragment;Landroid/view/View;)V
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/zykj/view/board/board/BoardFragment;->w0()Lcom/zykj/view/board/board/BoardViewModel;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    sget-object v0, Lcom/zykj/view/board/board/q$d;->e:Lcom/zykj/view/board/board/q$d;

    .line 6
    .line 7
    invoke-virtual {p1, v0}, Lcom/zykj/view/board/board/BoardViewModel;->b1(Lcom/zykj/view/board/board/q;)V

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0}, Lcom/zykj/view/board/board/BoardFragment;->w0()Lcom/zykj/view/board/board/BoardViewModel;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    invoke-virtual {p0}, Lcom/zykj/view/board/board/BoardViewModel;->Z()V

    .line 15
    .line 16
    .line 17
    return-void
.end method

.method public static synthetic s(Lcom/zykj/view/board/board/BoardFragment;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/zykj/view/board/board/BoardFragment;->T0(Lcom/zykj/view/board/board/BoardFragment;Landroid/view/View;)V

    return-void
.end method

.method public static final synthetic s0(Lcom/zykj/view/board/board/BoardFragment;Z)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcom/zykj/view/board/board/BoardFragment;->U1(Z)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic t(Lcom/zykj/view/board/board/BoardFragment;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/zykj/view/board/board/BoardFragment;->d1(Lcom/zykj/view/board/board/BoardFragment;Landroid/view/View;)V

    return-void
.end method

.method public static final t1(Lcom/zykj/view/board/board/BoardFragment;Landroid/view/View;)V
    .locals 1

    .line 1
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    sget v0, Lcom/zykj/view/R$id;->rb_pen_custom:I

    .line 6
    .line 7
    if-ne p1, v0, :cond_0

    .line 8
    .line 9
    invoke-virtual {p0}, Lcom/zykj/view/board/board/BoardFragment;->w0()Lcom/zykj/view/board/board/BoardViewModel;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    sget-object p1, Lcom/zykj/view/board/board/u$b;->f:Lcom/zykj/view/board/board/u$b;

    .line 14
    .line 15
    invoke-virtual {p0, p1}, Lcom/zykj/view/board/board/BoardViewModel;->e1(Lcom/zykj/view/board/board/u;)V

    .line 16
    .line 17
    .line 18
    return-void

    .line 19
    :cond_0
    sget v0, Lcom/zykj/view/R$id;->rb_pen_line:I

    .line 20
    .line 21
    if-ne p1, v0, :cond_1

    .line 22
    .line 23
    invoke-virtual {p0}, Lcom/zykj/view/board/board/BoardFragment;->w0()Lcom/zykj/view/board/board/BoardViewModel;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    sget-object p1, Lcom/zykj/view/board/board/u$e;->f:Lcom/zykj/view/board/board/u$e;

    .line 28
    .line 29
    invoke-virtual {p0, p1}, Lcom/zykj/view/board/board/BoardViewModel;->e1(Lcom/zykj/view/board/board/u;)V

    .line 30
    .line 31
    .line 32
    return-void

    .line 33
    :cond_1
    sget v0, Lcom/zykj/view/R$id;->rb_pen_dotted_line:I

    .line 34
    .line 35
    if-ne p1, v0, :cond_2

    .line 36
    .line 37
    invoke-virtual {p0}, Lcom/zykj/view/board/board/BoardFragment;->w0()Lcom/zykj/view/board/board/BoardViewModel;

    .line 38
    .line 39
    .line 40
    move-result-object p0

    .line 41
    sget-object p1, Lcom/zykj/view/board/board/u$c;->f:Lcom/zykj/view/board/board/u$c;

    .line 42
    .line 43
    invoke-virtual {p0, p1}, Lcom/zykj/view/board/board/BoardViewModel;->e1(Lcom/zykj/view/board/board/u;)V

    .line 44
    .line 45
    .line 46
    return-void

    .line 47
    :cond_2
    sget v0, Lcom/zykj/view/R$id;->rb_pen_cursor:I

    .line 48
    .line 49
    if-ne p1, v0, :cond_3

    .line 50
    .line 51
    invoke-virtual {p0}, Lcom/zykj/view/board/board/BoardFragment;->w0()Lcom/zykj/view/board/board/BoardViewModel;

    .line 52
    .line 53
    .line 54
    move-result-object p0

    .line 55
    sget-object p1, Lcom/zykj/view/board/board/u$a;->f:Lcom/zykj/view/board/board/u$a;

    .line 56
    .line 57
    invoke-virtual {p0, p1}, Lcom/zykj/view/board/board/BoardViewModel;->e1(Lcom/zykj/view/board/board/u;)V

    .line 58
    .line 59
    .line 60
    return-void

    .line 61
    :cond_3
    sget v0, Lcom/zykj/view/R$id;->rb_pen_highlighter:I

    .line 62
    .line 63
    if-ne p1, v0, :cond_4

    .line 64
    .line 65
    invoke-virtual {p0}, Lcom/zykj/view/board/board/BoardFragment;->w0()Lcom/zykj/view/board/board/BoardViewModel;

    .line 66
    .line 67
    .line 68
    move-result-object p0

    .line 69
    sget-object p1, Lcom/zykj/view/board/board/u$d;->f:Lcom/zykj/view/board/board/u$d;

    .line 70
    .line 71
    invoke-virtual {p0, p1}, Lcom/zykj/view/board/board/BoardViewModel;->e1(Lcom/zykj/view/board/board/u;)V

    .line 72
    .line 73
    .line 74
    :cond_4
    return-void
.end method

.method public static synthetic u(Lcom/zykj/view/board/board/BoardFragment;F)Lqc/q;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/zykj/view/board/board/BoardFragment;->B1(Lcom/zykj/view/board/board/BoardFragment;F)Lqc/q;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic u0(Lcom/zykj/view/board/board/BoardFragment;Landroid/graphics/Bitmap;Ljava/lang/String;Ljava/lang/String;ZLhd/l;ILjava/lang/Object;)V
    .locals 1

    .line 1
    and-int/lit8 p7, p6, 0x1

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    if-eqz p7, :cond_0

    .line 5
    .line 6
    move-object p1, v0

    .line 7
    :cond_0
    and-int/lit8 p7, p6, 0x2

    .line 8
    .line 9
    if-eqz p7, :cond_1

    .line 10
    .line 11
    move-object p2, v0

    .line 12
    :cond_1
    and-int/lit8 p7, p6, 0x4

    .line 13
    .line 14
    if-eqz p7, :cond_2

    .line 15
    .line 16
    const-string p3, ""

    .line 17
    .line 18
    :cond_2
    and-int/lit8 p7, p6, 0x8

    .line 19
    .line 20
    if-eqz p7, :cond_3

    .line 21
    .line 22
    const/4 p4, 0x0

    .line 23
    :cond_3
    and-int/lit8 p6, p6, 0x10

    .line 24
    .line 25
    if-eqz p6, :cond_4

    .line 26
    .line 27
    move-object p5, v0

    .line 28
    :cond_4
    invoke-virtual/range {p0 .. p5}, Lcom/zykj/view/board/board/BoardFragment;->t0(Landroid/graphics/Bitmap;Ljava/lang/String;Ljava/lang/String;ZLhd/l;)V

    .line 29
    .line 30
    .line 31
    return-void
.end method

.method public static final u1(Lcom/zykj/view/board/board/BoardFragment;ILandroid/view/View;)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/zykj/view/board/board/BoardFragment;->w0()Lcom/zykj/view/board/board/BoardViewModel;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0, p1}, Lcom/zykj/view/board/board/BoardViewModel;->d1(I)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public static synthetic v(Lcom/zykj/view/board/board/BoardFragment;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/zykj/view/board/board/BoardFragment;->l1(Lcom/zykj/view/board/board/BoardFragment;Landroid/view/View;)V

    return-void
.end method

.method public static final v0(Lcom/zykj/view/board/board/BoardFragment;Ljava/lang/Boolean;)V
    .locals 1

    .line 1
    const-string v0, "it"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 7
    .line 8
    .line 9
    move-result p1

    .line 10
    if-eqz p1, :cond_0

    .line 11
    .line 12
    iget-object p1, p0, Lcom/zykj/view/board/board/BoardFragment;->g:Lhd/a;

    .line 13
    .line 14
    if-eqz p1, :cond_0

    .line 15
    .line 16
    invoke-interface {p1}, Lhd/a;->invoke()Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    :cond_0
    const/4 p1, 0x0

    .line 20
    iput-object p1, p0, Lcom/zykj/view/board/board/BoardFragment;->g:Lhd/a;

    .line 21
    .line 22
    return-void
.end method

.method public static final v1(Lcom/zykj/view/board/board/BoardFragment;ILandroid/view/View;)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/zykj/view/board/board/BoardFragment;->w0()Lcom/zykj/view/board/board/BoardViewModel;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0, p1}, Lcom/zykj/view/board/board/BoardViewModel;->c1(I)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public static synthetic w(Lcom/zykj/view/board/board/BoardFragment;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/zykj/view/board/board/BoardFragment;->t1(Lcom/zykj/view/board/board/BoardFragment;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic x(Lcom/zykj/view/board/board/BoardFragment;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/zykj/view/board/board/BoardFragment;->P0(Lcom/zykj/view/board/board/BoardFragment;Landroid/view/View;)V

    return-void
.end method

.method public static final x1(Lcom/zykj/view/board/board/BoardFragment;)Lqc/q;
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/zykj/view/board/board/BoardFragment;->w0()Lcom/zykj/view/board/board/BoardViewModel;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0}, Lcom/zykj/view/board/board/BoardViewModel;->C()V

    .line 6
    .line 7
    .line 8
    sget-object p0, Lqc/q;->a:Lqc/q;

    .line 9
    .line 10
    return-object p0
.end method

.method public static synthetic y(Lcom/zykj/view/board/board/BoardFragment;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/zykj/view/board/board/BoardFragment;->Y0(Lcom/zykj/view/board/board/BoardFragment;Landroid/view/View;)V

    return-void
.end method

.method public static final y1(Lcom/zykj/view/board/board/BoardFragment;F)Lqc/q;
    .locals 2

    .line 1
    invoke-virtual {p0}, Lcom/zykj/view/board/board/BoardFragment;->w0()Lcom/zykj/view/board/board/BoardViewModel;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    const/4 v0, 0x1

    .line 10
    const/4 v1, 0x0

    .line 11
    invoke-static {p0, v1, p1, v0, v1}, Lcom/zykj/view/board/board/BoardViewModel;->E(Lcom/zykj/view/board/board/BoardViewModel;Ljava/lang/Float;Ljava/lang/Float;ILjava/lang/Object;)V

    .line 12
    .line 13
    .line 14
    sget-object p0, Lqc/q;->a:Lqc/q;

    .line 15
    .line 16
    return-object p0
.end method

.method public static synthetic z(Lcom/zykj/view/board/board/BoardFragment;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/zykj/view/board/board/BoardFragment;->g1(Lcom/zykj/view/board/board/BoardFragment;Landroid/view/View;)V

    return-void
.end method

.method public static final z1(Lcom/zykj/view/board/board/BoardFragment;F)Lqc/q;
    .locals 2

    .line 1
    invoke-virtual {p0}, Lcom/zykj/view/board/board/BoardFragment;->w0()Lcom/zykj/view/board/board/BoardViewModel;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    const/4 v0, 0x1

    .line 10
    const/4 v1, 0x0

    .line 11
    invoke-static {p0, v1, p1, v0, v1}, Lcom/zykj/view/board/board/BoardViewModel;->B(Lcom/zykj/view/board/board/BoardViewModel;Ljava/lang/Float;Ljava/lang/Float;ILjava/lang/Object;)V

    .line 12
    .line 13
    .line 14
    sget-object p0, Lqc/q;->a:Lqc/q;

    .line 15
    .line 16
    return-object p0
.end method


# virtual methods
.method public final B0()Lkb/y1;
    .locals 4

    .line 1
    new-instance v0, Lkb/y1;

    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/zykj/view/board/board/BoardFragment;->w0()Lcom/zykj/view/board/board/BoardViewModel;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-virtual {v1}, Lcom/zykj/view/board/board/BoardViewModel;->R()Lvd/u;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    invoke-interface {v1}, Lvd/u;->getValue()Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    check-cast v1, Lcom/zykj/view/board/board/p;

    .line 16
    .line 17
    invoke-virtual {v1}, Lcom/zykj/view/board/board/p;->c()Lcom/zykj/view/board/board/q;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    invoke-virtual {p0}, Lcom/zykj/view/board/board/BoardFragment;->w0()Lcom/zykj/view/board/board/BoardViewModel;

    .line 22
    .line 23
    .line 24
    move-result-object v2

    .line 25
    invoke-virtual {v2}, Lcom/zykj/view/board/board/BoardViewModel;->O()Lvd/u;

    .line 26
    .line 27
    .line 28
    move-result-object v2

    .line 29
    invoke-interface {v2}, Lvd/u;->getValue()Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object v2

    .line 33
    check-cast v2, Lcom/zykj/view/board/board/m;

    .line 34
    .line 35
    invoke-virtual {v2}, Lcom/zykj/view/board/board/m;->f()Lcom/zykj/view/board/board/r;

    .line 36
    .line 37
    .line 38
    move-result-object v2

    .line 39
    invoke-virtual {p0}, Lcom/zykj/view/board/board/BoardFragment;->w0()Lcom/zykj/view/board/board/BoardViewModel;

    .line 40
    .line 41
    .line 42
    move-result-object v3

    .line 43
    invoke-virtual {v3}, Lcom/zykj/view/board/board/BoardViewModel;->N()Lvd/u;

    .line 44
    .line 45
    .line 46
    move-result-object v3

    .line 47
    invoke-interface {v3}, Lvd/u;->getValue()Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    move-result-object v3

    .line 51
    check-cast v3, Lcom/zykj/view/board/board/k;

    .line 52
    .line 53
    invoke-virtual {v3}, Lcom/zykj/view/board/board/k;->b()Lcom/zykj/view/board/board/l;

    .line 54
    .line 55
    .line 56
    move-result-object v3

    .line 57
    invoke-direct {v0, v1, v2, v3}, Lkb/y1;-><init>(Lcom/zykj/view/board/board/q;Lcom/zykj/view/board/board/r;Lcom/zykj/view/board/board/l;)V

    .line 58
    .line 59
    .line 60
    return-object v0
.end method

.method public final C0()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/zykj/view/board/board/BoardFragment;->d:Lcom/zykj/view/databinding/ViewFragmentBoardBinding;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const-string v0, "mBinding"

    .line 6
    .line 7
    invoke-static {v0}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    const/4 v0, 0x0

    .line 11
    :cond_0
    iget-object v0, v0, Lcom/zykj/view/databinding/ViewFragmentBoardBinding;->l:Landroid/widget/FrameLayout;

    .line 12
    .line 13
    const/16 v1, 0x8

    .line 14
    .line 15
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 16
    .line 17
    .line 18
    return-void
.end method

.method public final D0()V
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/zykj/view/board/board/BoardFragment;->d:Lcom/zykj/view/databinding/ViewFragmentBoardBinding;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const-string v0, "mBinding"

    .line 6
    .line 7
    invoke-static {v0}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    const/4 v0, 0x0

    .line 11
    :cond_0
    iget-object v0, v0, Lcom/zykj/view/databinding/ViewFragmentBoardBinding;->c:Lcom/zykj/view/databinding/ViewIncludeBackgroundColorBinding;

    .line 12
    .line 13
    iget-object v0, v0, Lcom/zykj/view/databinding/ViewIncludeBackgroundColorBinding;->i:Landroid/widget/RadioGroup;

    .line 14
    .line 15
    const-string v1, "rgBackgroundColor"

    .line 16
    .line 17
    invoke-static {v0, v1}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    invoke-static {v0}, Landroidx/core/view/ViewGroupKt;->getChildren(Landroid/view/ViewGroup;)Lpd/g;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    invoke-interface {v0}, Lpd/g;->iterator()Ljava/util/Iterator;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    const/4 v1, 0x0

    .line 29
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 30
    .line 31
    .line 32
    move-result v2

    .line 33
    if-eqz v2, :cond_2

    .line 34
    .line 35
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object v2

    .line 39
    add-int/lit8 v3, v1, 0x1

    .line 40
    .line 41
    if-gez v1, :cond_1

    .line 42
    .line 43
    invoke-static {}, Lrc/w;->w()V

    .line 44
    .line 45
    .line 46
    :cond_1
    check-cast v2, Landroid/view/View;

    .line 47
    .line 48
    new-instance v4, Lkb/b;

    .line 49
    .line 50
    invoke-direct {v4, p0, v1}, Lkb/b;-><init>(Lcom/zykj/view/board/board/BoardFragment;I)V

    .line 51
    .line 52
    .line 53
    invoke-virtual {v2, v4}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 54
    .line 55
    .line 56
    move v1, v3

    .line 57
    goto :goto_0

    .line 58
    :cond_2
    return-void
.end method

.method public final D1()Z
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/zykj/view/board/board/BoardFragment;->w0()Lcom/zykj/view/board/board/BoardViewModel;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Lcom/zykj/view/board/board/BoardViewModel;->G0()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    return v0
.end method

.method public final E1()V
    .locals 4

    .line 1
    invoke-virtual {p0}, Lcom/zykj/view/board/board/BoardFragment;->w0()Lcom/zykj/view/board/board/BoardViewModel;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Lcom/zykj/view/board/board/BoardViewModel;->J()Lkb/a;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    invoke-virtual {v0}, Lkb/a;->a()Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-nez v0, :cond_0

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    invoke-virtual {p0}, Lcom/zykj/view/board/board/BoardFragment;->N1()V

    .line 19
    .line 20
    .line 21
    :goto_0
    invoke-virtual {p0}, Lcom/zykj/view/board/board/BoardFragment;->x0()Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    .line 26
    .line 27
    .line 28
    move-result v1

    .line 29
    if-nez v1, :cond_2

    .line 30
    .line 31
    new-instance v0, Ljava/io/File;

    .line 32
    .line 33
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getContext()Landroid/content/Context;

    .line 34
    .line 35
    .line 36
    move-result-object v1

    .line 37
    if-eqz v1, :cond_1

    .line 38
    .line 39
    invoke-virtual {v1}, Landroid/content/Context;->getExternalCacheDir()Ljava/io/File;

    .line 40
    .line 41
    .line 42
    move-result-object v1

    .line 43
    if-eqz v1, :cond_1

    .line 44
    .line 45
    invoke-virtual {v1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object v1

    .line 49
    if-eqz v1, :cond_1

    .line 50
    .line 51
    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    .line 52
    .line 53
    .line 54
    move-result-object v2

    .line 55
    invoke-virtual {v2}, Ljava/util/UUID;->toString()Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    move-result-object v2

    .line 59
    invoke-direct {v0, v1, v2}, Ljava/io/File;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 60
    .line 61
    .line 62
    invoke-virtual {v0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 63
    .line 64
    .line 65
    move-result-object v0

    .line 66
    goto :goto_1

    .line 67
    :cond_1
    new-instance v0, Ljava/io/FileNotFoundException;

    .line 68
    .line 69
    const-string v1, "unknown board path"

    .line 70
    .line 71
    invoke-direct {v0, v1}, Ljava/io/FileNotFoundException;-><init>(Ljava/lang/String;)V

    .line 72
    .line 73
    .line 74
    throw v0

    .line 75
    :cond_2
    :goto_1
    new-instance v1, Ljava/lang/StringBuilder;

    .line 76
    .line 77
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 78
    .line 79
    .line 80
    const-string v2, "\u9875\u9762BoardFragment\uff0c\u5f00\u59cb\u52a0\u8f7d\u753b\u677f\u6570\u636e\uff0c\u753b\u677f\u8def\u5f84"

    .line 81
    .line 82
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 83
    .line 84
    .line 85
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 86
    .line 87
    .line 88
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

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
    invoke-static {v1}, Lcom/blankj/utilcode/util/LogUtils;->d([Ljava/lang/Object;)V

    .line 97
    .line 98
    .line 99
    iget-object v1, p0, Lcom/zykj/view/board/board/BoardFragment;->d:Lcom/zykj/view/databinding/ViewFragmentBoardBinding;

    .line 100
    .line 101
    if-nez v1, :cond_3

    .line 102
    .line 103
    const-string v1, "mBinding"

    .line 104
    .line 105
    invoke-static {v1}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 106
    .line 107
    .line 108
    const/4 v1, 0x0

    .line 109
    :cond_3
    iget-object v1, v1, Lcom/zykj/view/databinding/ViewFragmentBoardBinding;->o:Lcom/zykj/blackboard/core/canvas/SketchRecorderView;

    .line 110
    .line 111
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 112
    .line 113
    .line 114
    new-instance v2, Lkb/b0;

    .line 115
    .line 116
    invoke-direct {v2, p0}, Lkb/b0;-><init>(Lcom/zykj/view/board/board/BoardFragment;)V

    .line 117
    .line 118
    .line 119
    new-instance v3, Lkb/c0;

    .line 120
    .line 121
    invoke-direct {v3, p0}, Lkb/c0;-><init>(Lcom/zykj/view/board/board/BoardFragment;)V

    .line 122
    .line 123
    .line 124
    invoke-virtual {v1, v0, v2, v3}, Lcom/zykj/blackboard/core/canvas/SketchRecorderView;->b(Ljava/lang/String;Lhd/q;Lhd/l;)V

    .line 125
    .line 126
    .line 127
    return-void
.end method

.method public final F0()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/zykj/view/board/board/BoardFragment;->d:Lcom/zykj/view/databinding/ViewFragmentBoardBinding;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const-string v0, "mBinding"

    .line 6
    .line 7
    invoke-static {v0}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    const/4 v0, 0x0

    .line 11
    :cond_0
    iget-object v0, v0, Lcom/zykj/view/databinding/ViewFragmentBoardBinding;->o:Lcom/zykj/blackboard/core/canvas/SketchRecorderView;

    .line 12
    .line 13
    new-instance v1, Lkb/k0;

    .line 14
    .line 15
    invoke-direct {v1, p0}, Lkb/k0;-><init>(Lcom/zykj/view/board/board/BoardFragment;)V

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0, v1}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 19
    .line 20
    .line 21
    invoke-virtual {p0}, Lcom/zykj/view/board/board/BoardFragment;->w0()Lcom/zykj/view/board/board/BoardViewModel;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    new-instance v1, Lcom/zykj/view/board/board/BoardFragment$b;

    .line 26
    .line 27
    invoke-direct {v1, p0}, Lcom/zykj/view/board/board/BoardFragment$b;-><init>(Lcom/zykj/view/board/board/BoardFragment;)V

    .line 28
    .line 29
    .line 30
    invoke-virtual {v0, v1}, Lcom/zykj/view/board/board/BoardViewModel;->L0(Lma/j;)V

    .line 31
    .line 32
    .line 33
    invoke-virtual {p0}, Lcom/zykj/view/board/board/BoardFragment;->w0()Lcom/zykj/view/board/board/BoardViewModel;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    new-instance v1, Lcom/zykj/view/board/board/BoardFragment$c;

    .line 38
    .line 39
    invoke-direct {v1, p0}, Lcom/zykj/view/board/board/BoardFragment$c;-><init>(Lcom/zykj/view/board/board/BoardFragment;)V

    .line 40
    .line 41
    .line 42
    invoke-virtual {v0, v1}, Lcom/zykj/view/board/board/BoardViewModel;->K0(Lma/f;)V

    .line 43
    .line 44
    .line 45
    return-void
.end method

.method public final I0()V
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/zykj/view/board/board/BoardFragment;->d:Lcom/zykj/view/databinding/ViewFragmentBoardBinding;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const-string v0, "mBinding"

    .line 6
    .line 7
    invoke-static {v0}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    const/4 v0, 0x0

    .line 11
    :cond_0
    iget-object v0, v0, Lcom/zykj/view/databinding/ViewFragmentBoardBinding;->e:Lcom/zykj/view/databinding/ViewIncludeEraserBinding;

    .line 12
    .line 13
    iget-object v0, v0, Lcom/zykj/view/databinding/ViewIncludeEraserBinding;->f:Landroid/widget/RadioGroup;

    .line 14
    .line 15
    const-string v1, "rgEraserSize"

    .line 16
    .line 17
    invoke-static {v0, v1}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    invoke-static {v0}, Landroidx/core/view/ViewGroupKt;->getChildren(Landroid/view/ViewGroup;)Lpd/g;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    invoke-interface {v0}, Lpd/g;->iterator()Ljava/util/Iterator;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    const/4 v1, 0x0

    .line 29
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 30
    .line 31
    .line 32
    move-result v2

    .line 33
    if-eqz v2, :cond_2

    .line 34
    .line 35
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object v2

    .line 39
    add-int/lit8 v3, v1, 0x1

    .line 40
    .line 41
    if-gez v1, :cond_1

    .line 42
    .line 43
    invoke-static {}, Lrc/w;->w()V

    .line 44
    .line 45
    .line 46
    :cond_1
    check-cast v2, Landroid/view/View;

    .line 47
    .line 48
    new-instance v4, Lkb/a0;

    .line 49
    .line 50
    invoke-direct {v4, p0, v1}, Lkb/a0;-><init>(Lcom/zykj/view/board/board/BoardFragment;I)V

    .line 51
    .line 52
    .line 53
    invoke-virtual {v2, v4}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 54
    .line 55
    .line 56
    move v1, v3

    .line 57
    goto :goto_0

    .line 58
    :cond_2
    return-void
.end method

.method public final I1()V
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/zykj/view/board/board/BoardFragment;->w0()Lcom/zykj/view/board/board/BoardViewModel;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Lcom/zykj/view/board/board/BoardViewModel;->J0()V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public final J1(Lkb/a;)V
    .locals 1

    .line 1
    const-string v0, "boardCallbackConfig"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Lcom/zykj/view/board/board/BoardFragment;->w0()Lcom/zykj/view/board/board/BoardViewModel;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    invoke-virtual {v0, p1}, Lcom/zykj/view/board/board/BoardViewModel;->i0(Lkb/a;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public final K0()V
    .locals 9

    .line 1
    iget-object v0, p0, Lcom/zykj/view/board/board/BoardFragment;->d:Lcom/zykj/view/databinding/ViewFragmentBoardBinding;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const-string v2, "mBinding"

    .line 5
    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    invoke-static {v2}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    move-object v0, v1

    .line 12
    :cond_0
    iget-object v0, v0, Lcom/zykj/view/databinding/ViewFragmentBoardBinding;->j:Landroidx/appcompat/widget/AppCompatImageView;

    .line 13
    .line 14
    new-instance v3, Lkb/h;

    .line 15
    .line 16
    invoke-direct {v3, p0}, Lkb/h;-><init>(Lcom/zykj/view/board/board/BoardFragment;)V

    .line 17
    .line 18
    .line 19
    invoke-virtual {v0, v3}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 20
    .line 21
    .line 22
    iget-object v0, p0, Lcom/zykj/view/board/board/BoardFragment;->d:Lcom/zykj/view/databinding/ViewFragmentBoardBinding;

    .line 23
    .line 24
    if-nez v0, :cond_1

    .line 25
    .line 26
    invoke-static {v2}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    move-object v0, v1

    .line 30
    :cond_1
    iget-object v0, v0, Lcom/zykj/view/databinding/ViewFragmentBoardBinding;->k:Landroidx/appcompat/widget/AppCompatImageView;

    .line 31
    .line 32
    new-instance v3, Lkb/i;

    .line 33
    .line 34
    invoke-direct {v3, p0}, Lkb/i;-><init>(Lcom/zykj/view/board/board/BoardFragment;)V

    .line 35
    .line 36
    .line 37
    invoke-virtual {v0, v3}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 38
    .line 39
    .line 40
    iget-object v0, p0, Lcom/zykj/view/board/board/BoardFragment;->d:Lcom/zykj/view/databinding/ViewFragmentBoardBinding;

    .line 41
    .line 42
    if-nez v0, :cond_2

    .line 43
    .line 44
    invoke-static {v2}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 45
    .line 46
    .line 47
    move-object v0, v1

    .line 48
    :cond_2
    iget-object v0, v0, Lcom/zykj/view/databinding/ViewFragmentBoardBinding;->i:Lcom/zykj/view/databinding/ViewItemSketchRecordAudioBinding;

    .line 49
    .line 50
    iget-object v3, v0, Lcom/zykj/view/databinding/ViewItemSketchRecordAudioBinding;->d:Landroidx/appcompat/widget/AppCompatImageView;

    .line 51
    .line 52
    const-string v4, "ivRecord"

    .line 53
    .line 54
    invoke-static {v3, v4}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 55
    .line 56
    .line 57
    new-instance v6, Lkb/j;

    .line 58
    .line 59
    invoke-direct {v6, p0}, Lkb/j;-><init>(Lcom/zykj/view/board/board/BoardFragment;)V

    .line 60
    .line 61
    .line 62
    const/4 v7, 0x1

    .line 63
    const/4 v8, 0x0

    .line 64
    const-wide/16 v4, 0x0

    .line 65
    .line 66
    invoke-static/range {v3 .. v8}, Lvb/a;->d(Landroid/view/View;JLandroid/view/View$OnClickListener;ILjava/lang/Object;)V

    .line 67
    .line 68
    .line 69
    iget-object v3, v0, Lcom/zykj/view/databinding/ViewItemSketchRecordAudioBinding;->c:Landroid/widget/ImageView;

    .line 70
    .line 71
    new-instance v4, Lkb/k;

    .line 72
    .line 73
    invoke-direct {v4, p0}, Lkb/k;-><init>(Lcom/zykj/view/board/board/BoardFragment;)V

    .line 74
    .line 75
    .line 76
    invoke-virtual {v3, v4}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 77
    .line 78
    .line 79
    iget-object v3, v0, Lcom/zykj/view/databinding/ViewItemSketchRecordAudioBinding;->e:Landroidx/appcompat/widget/LinearLayoutCompat;

    .line 80
    .line 81
    new-instance v4, Lkb/l;

    .line 82
    .line 83
    invoke-direct {v4, p0, v0}, Lkb/l;-><init>(Lcom/zykj/view/board/board/BoardFragment;Lcom/zykj/view/databinding/ViewItemSketchRecordAudioBinding;)V

    .line 84
    .line 85
    .line 86
    invoke-virtual {v3, v4}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 87
    .line 88
    .line 89
    iget-object v3, v0, Lcom/zykj/view/databinding/ViewItemSketchRecordAudioBinding;->h:Landroidx/appcompat/widget/LinearLayoutCompat;

    .line 90
    .line 91
    new-instance v4, Lkb/n;

    .line 92
    .line 93
    invoke-direct {v4, p0, v0}, Lkb/n;-><init>(Lcom/zykj/view/board/board/BoardFragment;Lcom/zykj/view/databinding/ViewItemSketchRecordAudioBinding;)V

    .line 94
    .line 95
    .line 96
    invoke-virtual {v3, v4}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 97
    .line 98
    .line 99
    iget-object v3, v0, Lcom/zykj/view/databinding/ViewItemSketchRecordAudioBinding;->j:Landroidx/appcompat/widget/LinearLayoutCompat;

    .line 100
    .line 101
    new-instance v4, Lkb/o;

    .line 102
    .line 103
    invoke-direct {v4, p0, v0}, Lkb/o;-><init>(Lcom/zykj/view/board/board/BoardFragment;Lcom/zykj/view/databinding/ViewItemSketchRecordAudioBinding;)V

    .line 104
    .line 105
    .line 106
    invoke-virtual {v3, v4}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 107
    .line 108
    .line 109
    iget-object v0, v0, Lcom/zykj/view/databinding/ViewItemSketchRecordAudioBinding;->f:Landroidx/appcompat/widget/LinearLayoutCompat;

    .line 110
    .line 111
    new-instance v3, Lkb/p;

    .line 112
    .line 113
    invoke-direct {v3, p0}, Lkb/p;-><init>(Lcom/zykj/view/board/board/BoardFragment;)V

    .line 114
    .line 115
    .line 116
    invoke-virtual {v0, v3}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 117
    .line 118
    .line 119
    iget-object v0, p0, Lcom/zykj/view/board/board/BoardFragment;->d:Lcom/zykj/view/databinding/ViewFragmentBoardBinding;

    .line 120
    .line 121
    if-nez v0, :cond_3

    .line 122
    .line 123
    invoke-static {v2}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 124
    .line 125
    .line 126
    goto :goto_0

    .line 127
    :cond_3
    move-object v1, v0

    .line 128
    :goto_0
    iget-object v0, v1, Lcom/zykj/view/databinding/ViewFragmentBoardBinding;->d:Lcom/zykj/view/databinding/ViewItemSketchRecordBinding;

    .line 129
    .line 130
    iget-object v1, v0, Lcom/zykj/view/databinding/ViewItemSketchRecordBinding;->c:Landroid/widget/TextView;

    .line 131
    .line 132
    new-instance v2, Lkb/q;

    .line 133
    .line 134
    invoke-direct {v2, p0, v0}, Lkb/q;-><init>(Lcom/zykj/view/board/board/BoardFragment;Lcom/zykj/view/databinding/ViewItemSketchRecordBinding;)V

    .line 135
    .line 136
    .line 137
    invoke-virtual {v1, v2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 138
    .line 139
    .line 140
    return-void
.end method

.method public final K1(Lkb/b1;)V
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/zykj/view/board/board/BoardFragment;->w0()Lcom/zykj/view/board/board/BoardViewModel;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0, p1}, Lcom/zykj/view/board/board/BoardViewModel;->A0(Lkb/b1;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public final L1(Lcom/zykj/view/board/board/d;)V
    .locals 1

    .line 1
    const-string v0, "boardViewConfig"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Lcom/zykj/view/board/board/BoardFragment;->w0()Lcom/zykj/view/board/board/BoardViewModel;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    invoke-virtual {v0, p1}, Lcom/zykj/view/board/board/BoardViewModel;->h1(Lcom/zykj/view/board/board/d;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public final M1(Lkb/y1;)V
    .locals 2

    .line 1
    const-string v0, "value"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Lcom/zykj/view/board/board/BoardFragment;->w0()Lcom/zykj/view/board/board/BoardViewModel;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    invoke-virtual {p1}, Lkb/y1;->b()Lcom/zykj/view/board/board/q;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    invoke-virtual {v0, v1}, Lcom/zykj/view/board/board/BoardViewModel;->b1(Lcom/zykj/view/board/board/q;)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {p0}, Lcom/zykj/view/board/board/BoardFragment;->w0()Lcom/zykj/view/board/board/BoardViewModel;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    invoke-virtual {p1}, Lkb/y1;->c()Lcom/zykj/view/board/board/r;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    invoke-virtual {v0, v1}, Lcom/zykj/view/board/board/BoardViewModel;->a1(Lcom/zykj/view/board/board/r;)V

    .line 26
    .line 27
    .line 28
    invoke-virtual {p0}, Lcom/zykj/view/board/board/BoardFragment;->w0()Lcom/zykj/view/board/board/BoardViewModel;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    invoke-virtual {p1}, Lkb/y1;->a()Lcom/zykj/view/board/board/l;

    .line 33
    .line 34
    .line 35
    move-result-object p1

    .line 36
    sget-object v1, Lcom/zykj/view/board/board/l$b;->b:Lcom/zykj/view/board/board/l$b;

    .line 37
    .line 38
    invoke-static {p1, v1}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 39
    .line 40
    .line 41
    move-result p1

    .line 42
    invoke-virtual {v0, p1}, Lcom/zykj/view/board/board/BoardViewModel;->W0(Z)V

    .line 43
    .line 44
    .line 45
    return-void
.end method

.method public final N1()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/zykj/view/board/board/BoardFragment;->d:Lcom/zykj/view/databinding/ViewFragmentBoardBinding;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const-string v0, "mBinding"

    .line 6
    .line 7
    invoke-static {v0}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    const/4 v0, 0x0

    .line 11
    :cond_0
    iget-object v0, v0, Lcom/zykj/view/databinding/ViewFragmentBoardBinding;->l:Landroid/widget/FrameLayout;

    .line 12
    .line 13
    const/4 v1, 0x0

    .line 14
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 15
    .line 16
    .line 17
    return-void
.end method

.method public final O1()V
    .locals 8

    .line 1
    invoke-virtual {p0}, Lcom/zykj/view/board/board/BoardFragment;->w0()Lcom/zykj/view/board/board/BoardViewModel;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Lcom/zykj/view/board/board/BoardViewModel;->G0()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    const/4 v0, 0x0

    .line 12
    new-array v0, v0, [Ljava/lang/Object;

    .line 13
    .line 14
    const-string v1, "\u56fe\u7247\u6570\u91cf\u5df2\u8fbe\u4e0a\u9650\uff0c\u4e0d\u53ef\u7ee7\u7eed\u63d2\u5165"

    .line 15
    .line 16
    invoke-static {v1, v0}, Lcom/blankj/utilcode/util/ToastUtils;->showShort(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 17
    .line 18
    .line 19
    return-void

    .line 20
    :cond_0
    iget-object v2, p0, Lcom/zykj/view/board/board/BoardFragment;->f:Lvb/l;

    .line 21
    .line 22
    new-instance v5, Lkb/q0;

    .line 23
    .line 24
    invoke-direct {v5, p0}, Lkb/q0;-><init>(Lcom/zykj/view/board/board/BoardFragment;)V

    .line 25
    .line 26
    .line 27
    const/4 v6, 0x1

    .line 28
    const/4 v7, 0x0

    .line 29
    const/4 v3, 0x0

    .line 30
    const/4 v4, 0x1

    .line 31
    invoke-static/range {v2 .. v7}, Lvb/l;->v(Lvb/l;Landroid/net/Uri;ZLhd/l;ILjava/lang/Object;)V

    .line 32
    .line 33
    .line 34
    return-void
.end method

.method public final R1()V
    .locals 3

    .line 1
    invoke-virtual {p0}, Lcom/zykj/view/board/board/BoardFragment;->w0()Lcom/zykj/view/board/board/BoardViewModel;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Lcom/zykj/view/board/board/BoardViewModel;->G0()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    const/4 v0, 0x0

    .line 12
    new-array v0, v0, [Ljava/lang/Object;

    .line 13
    .line 14
    const-string v1, "\u56fe\u7247\u6570\u91cf\u5df2\u8fbe\u4e0a\u9650\uff0c\u4e0d\u53ef\u7ee7\u7eed\u63d2\u5165"

    .line 15
    .line 16
    invoke-static {v1, v0}, Lcom/blankj/utilcode/util/ToastUtils;->showShort(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 17
    .line 18
    .line 19
    return-void

    .line 20
    :cond_0
    iget-object v0, p0, Lcom/zykj/view/board/board/BoardFragment;->f:Lvb/l;

    .line 21
    .line 22
    new-instance v1, Lkb/r0;

    .line 23
    .line 24
    invoke-direct {v1, p0}, Lkb/r0;-><init>(Lcom/zykj/view/board/board/BoardFragment;)V

    .line 25
    .line 26
    .line 27
    const/4 v2, 0x1

    .line 28
    invoke-virtual {v0, v2, v1}, Lvb/l;->s(ZLhd/l;)V

    .line 29
    .line 30
    .line 31
    return-void
.end method

.method public final U1(Z)V
    .locals 11

    .line 1
    iget-object v0, p0, Lcom/zykj/view/board/board/BoardFragment;->d:Lcom/zykj/view/databinding/ViewFragmentBoardBinding;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const-string v2, "mBinding"

    .line 5
    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    invoke-static {v2}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    move-object v0, v1

    .line 12
    :cond_0
    iget-object v0, v0, Lcom/zykj/view/databinding/ViewFragmentBoardBinding;->k:Landroidx/appcompat/widget/AppCompatImageView;

    .line 13
    .line 14
    const/4 v3, 0x0

    .line 15
    invoke-virtual {v0, v3}, Landroid/view/View;->setEnabled(Z)V

    .line 16
    .line 17
    .line 18
    new-instance v0, Landroid/animation/AnimatorSet;

    .line 19
    .line 20
    invoke-direct {v0}, Landroid/animation/AnimatorSet;-><init>()V

    .line 21
    .line 22
    .line 23
    const-wide/16 v4, 0x1f4

    .line 24
    .line 25
    invoke-virtual {v0, v4, v5}, Landroid/animation/AnimatorSet;->setDuration(J)Landroid/animation/AnimatorSet;

    .line 26
    .line 27
    .line 28
    new-instance v4, Lcom/zykj/view/board/board/BoardFragment$d;

    .line 29
    .line 30
    invoke-direct {v4, p0, p1}, Lcom/zykj/view/board/board/BoardFragment$d;-><init>(Lcom/zykj/view/board/board/BoardFragment;Z)V

    .line 31
    .line 32
    .line 33
    invoke-virtual {v0, v4}, Landroid/animation/Animator;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    .line 34
    .line 35
    .line 36
    const/4 v4, 0x0

    .line 37
    if-eqz p1, :cond_2

    .line 38
    .line 39
    iget-object v5, p0, Lcom/zykj/view/board/board/BoardFragment;->d:Lcom/zykj/view/databinding/ViewFragmentBoardBinding;

    .line 40
    .line 41
    if-nez v5, :cond_1

    .line 42
    .line 43
    invoke-static {v2}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 44
    .line 45
    .line 46
    move-object v5, v1

    .line 47
    :cond_1
    iget-object v5, v5, Lcom/zykj/view/databinding/ViewFragmentBoardBinding;->g:Lcom/zykj/view/databinding/ViewIncludeMenuBinding;

    .line 48
    .line 49
    invoke-virtual {v5}, Landroidx/databinding/ViewDataBinding;->getRoot()Landroid/view/View;

    .line 50
    .line 51
    .line 52
    move-result-object v5

    .line 53
    invoke-virtual {v5}, Landroid/view/View;->getWidth()I

    .line 54
    .line 55
    .line 56
    move-result v5

    .line 57
    int-to-float v5, v5

    .line 58
    neg-float v5, v5

    .line 59
    goto :goto_0

    .line 60
    :cond_2
    move v5, v4

    .line 61
    :goto_0
    if-eqz p1, :cond_3

    .line 62
    .line 63
    goto :goto_1

    .line 64
    :cond_3
    iget-object p1, p0, Lcom/zykj/view/board/board/BoardFragment;->d:Lcom/zykj/view/databinding/ViewFragmentBoardBinding;

    .line 65
    .line 66
    if-nez p1, :cond_4

    .line 67
    .line 68
    invoke-static {v2}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 69
    .line 70
    .line 71
    move-object p1, v1

    .line 72
    :cond_4
    iget-object p1, p1, Lcom/zykj/view/databinding/ViewFragmentBoardBinding;->g:Lcom/zykj/view/databinding/ViewIncludeMenuBinding;

    .line 73
    .line 74
    invoke-virtual {p1}, Landroidx/databinding/ViewDataBinding;->getRoot()Landroid/view/View;

    .line 75
    .line 76
    .line 77
    move-result-object p1

    .line 78
    invoke-virtual {p1}, Landroid/view/View;->getWidth()I

    .line 79
    .line 80
    .line 81
    move-result p1

    .line 82
    int-to-float p1, p1

    .line 83
    neg-float v4, p1

    .line 84
    :goto_1
    iget-object p1, p0, Lcom/zykj/view/board/board/BoardFragment;->d:Lcom/zykj/view/databinding/ViewFragmentBoardBinding;

    .line 85
    .line 86
    if-nez p1, :cond_5

    .line 87
    .line 88
    invoke-static {v2}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 89
    .line 90
    .line 91
    move-object p1, v1

    .line 92
    :cond_5
    iget-object p1, p1, Lcom/zykj/view/databinding/ViewFragmentBoardBinding;->g:Lcom/zykj/view/databinding/ViewIncludeMenuBinding;

    .line 93
    .line 94
    invoke-virtual {p1}, Landroidx/databinding/ViewDataBinding;->getRoot()Landroid/view/View;

    .line 95
    .line 96
    .line 97
    move-result-object p1

    .line 98
    const/4 v6, 0x2

    .line 99
    new-array v7, v6, [F

    .line 100
    .line 101
    aput v5, v7, v3

    .line 102
    .line 103
    const/4 v8, 0x1

    .line 104
    aput v4, v7, v8

    .line 105
    .line 106
    const-string v9, "translationX"

    .line 107
    .line 108
    invoke-static {p1, v9, v7}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Ljava/lang/String;[F)Landroid/animation/ObjectAnimator;

    .line 109
    .line 110
    .line 111
    move-result-object p1

    .line 112
    invoke-virtual {v0, p1}, Landroid/animation/AnimatorSet;->play(Landroid/animation/Animator;)Landroid/animation/AnimatorSet$Builder;

    .line 113
    .line 114
    .line 115
    move-result-object p1

    .line 116
    iget-object v7, p0, Lcom/zykj/view/board/board/BoardFragment;->d:Lcom/zykj/view/databinding/ViewFragmentBoardBinding;

    .line 117
    .line 118
    if-nez v7, :cond_6

    .line 119
    .line 120
    invoke-static {v2}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 121
    .line 122
    .line 123
    move-object v7, v1

    .line 124
    :cond_6
    iget-object v7, v7, Lcom/zykj/view/databinding/ViewFragmentBoardBinding;->p:Landroid/widget/FrameLayout;

    .line 125
    .line 126
    new-array v10, v6, [F

    .line 127
    .line 128
    aput v5, v10, v3

    .line 129
    .line 130
    aput v4, v10, v8

    .line 131
    .line 132
    invoke-static {v7, v9, v10}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Ljava/lang/String;[F)Landroid/animation/ObjectAnimator;

    .line 133
    .line 134
    .line 135
    move-result-object v7

    .line 136
    invoke-virtual {p1, v7}, Landroid/animation/AnimatorSet$Builder;->with(Landroid/animation/Animator;)Landroid/animation/AnimatorSet$Builder;

    .line 137
    .line 138
    .line 139
    move-result-object p1

    .line 140
    iget-object v7, p0, Lcom/zykj/view/board/board/BoardFragment;->d:Lcom/zykj/view/databinding/ViewFragmentBoardBinding;

    .line 141
    .line 142
    if-nez v7, :cond_7

    .line 143
    .line 144
    invoke-static {v2}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 145
    .line 146
    .line 147
    goto :goto_2

    .line 148
    :cond_7
    move-object v1, v7

    .line 149
    :goto_2
    iget-object v1, v1, Lcom/zykj/view/databinding/ViewFragmentBoardBinding;->k:Landroidx/appcompat/widget/AppCompatImageView;

    .line 150
    .line 151
    new-array v2, v6, [F

    .line 152
    .line 153
    aput v5, v2, v3

    .line 154
    .line 155
    aput v4, v2, v8

    .line 156
    .line 157
    invoke-static {v1, v9, v2}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Ljava/lang/String;[F)Landroid/animation/ObjectAnimator;

    .line 158
    .line 159
    .line 160
    move-result-object v1

    .line 161
    invoke-virtual {p1, v1}, Landroid/animation/AnimatorSet$Builder;->with(Landroid/animation/Animator;)Landroid/animation/AnimatorSet$Builder;

    .line 162
    .line 163
    .line 164
    invoke-virtual {v0}, Landroid/animation/AnimatorSet;->start()V

    .line 165
    .line 166
    .line 167
    return-void
.end method

.method public final V0()V
    .locals 13

    .line 1
    iget-object v0, p0, Lcom/zykj/view/board/board/BoardFragment;->d:Lcom/zykj/view/databinding/ViewFragmentBoardBinding;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const-string v0, "mBinding"

    .line 6
    .line 7
    invoke-static {v0}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    const/4 v0, 0x0

    .line 11
    :cond_0
    iget-object v0, v0, Lcom/zykj/view/databinding/ViewFragmentBoardBinding;->f:Lcom/zykj/view/databinding/ViewIncludeImageAddBinding;

    .line 12
    .line 13
    iget-object v1, v0, Lcom/zykj/view/databinding/ViewIncludeImageAddBinding;->d:Landroidx/appcompat/widget/AppCompatImageView;

    .line 14
    .line 15
    const-string v2, "ivImageGallery"

    .line 16
    .line 17
    invoke-static {v1, v2}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    new-instance v4, Lkb/r;

    .line 21
    .line 22
    invoke-direct {v4, p0}, Lkb/r;-><init>(Lcom/zykj/view/board/board/BoardFragment;)V

    .line 23
    .line 24
    .line 25
    const/4 v5, 0x1

    .line 26
    const/4 v6, 0x0

    .line 27
    const-wide/16 v2, 0x0

    .line 28
    .line 29
    invoke-static/range {v1 .. v6}, Lvb/a;->d(Landroid/view/View;JLandroid/view/View$OnClickListener;ILjava/lang/Object;)V

    .line 30
    .line 31
    .line 32
    iget-object v7, v0, Lcom/zykj/view/databinding/ViewIncludeImageAddBinding;->c:Landroidx/appcompat/widget/AppCompatImageView;

    .line 33
    .line 34
    const-string v1, "ivImageCamera"

    .line 35
    .line 36
    invoke-static {v7, v1}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 37
    .line 38
    .line 39
    new-instance v10, Lkb/s;

    .line 40
    .line 41
    invoke-direct {v10, p0}, Lkb/s;-><init>(Lcom/zykj/view/board/board/BoardFragment;)V

    .line 42
    .line 43
    .line 44
    const/4 v11, 0x1

    .line 45
    const/4 v12, 0x0

    .line 46
    const-wide/16 v8, 0x0

    .line 47
    .line 48
    invoke-static/range {v7 .. v12}, Lvb/a;->d(Landroid/view/View;JLandroid/view/View$OnClickListener;ILjava/lang/Object;)V

    .line 49
    .line 50
    .line 51
    iget-object v1, v0, Lcom/zykj/view/databinding/ViewIncludeImageAddBinding;->g:Landroidx/appcompat/widget/AppCompatImageView;

    .line 52
    .line 53
    const-string v2, "ivText"

    .line 54
    .line 55
    invoke-static {v1, v2}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 56
    .line 57
    .line 58
    new-instance v4, Lkb/t;

    .line 59
    .line 60
    invoke-direct {v4, p0}, Lkb/t;-><init>(Lcom/zykj/view/board/board/BoardFragment;)V

    .line 61
    .line 62
    .line 63
    const-wide/16 v2, 0x0

    .line 64
    .line 65
    invoke-static/range {v1 .. v6}, Lvb/a;->d(Landroid/view/View;JLandroid/view/View$OnClickListener;ILjava/lang/Object;)V

    .line 66
    .line 67
    .line 68
    iget-object v1, v0, Lcom/zykj/view/databinding/ViewIncludeImageAddBinding;->f:Landroidx/appcompat/widget/AppCompatImageView;

    .line 69
    .line 70
    new-instance v2, Lkb/u;

    .line 71
    .line 72
    invoke-direct {v2, p0}, Lkb/u;-><init>(Lcom/zykj/view/board/board/BoardFragment;)V

    .line 73
    .line 74
    .line 75
    invoke-virtual {v1, v2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 76
    .line 77
    .line 78
    iget-object v1, v0, Lcom/zykj/view/databinding/ViewIncludeImageAddBinding;->e:Landroidx/appcompat/widget/AppCompatImageView;

    .line 79
    .line 80
    new-instance v2, Lkb/v;

    .line 81
    .line 82
    invoke-direct {v2, p0}, Lkb/v;-><init>(Lcom/zykj/view/board/board/BoardFragment;)V

    .line 83
    .line 84
    .line 85
    invoke-virtual {v1, v2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 86
    .line 87
    .line 88
    iget-object v0, v0, Lcom/zykj/view/databinding/ViewIncludeImageAddBinding;->h:Landroid/widget/ImageView;

    .line 89
    .line 90
    new-instance v1, Lkb/w;

    .line 91
    .line 92
    invoke-direct {v1, p0}, Lkb/w;-><init>(Lcom/zykj/view/board/board/BoardFragment;)V

    .line 93
    .line 94
    .line 95
    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 96
    .line 97
    .line 98
    return-void
.end method

.method public final f1()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/zykj/view/board/board/BoardFragment;->d:Lcom/zykj/view/databinding/ViewFragmentBoardBinding;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const-string v0, "mBinding"

    .line 6
    .line 7
    invoke-static {v0}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    const/4 v0, 0x0

    .line 11
    :cond_0
    iget-object v0, v0, Lcom/zykj/view/databinding/ViewFragmentBoardBinding;->g:Lcom/zykj/view/databinding/ViewIncludeMenuBinding;

    .line 12
    .line 13
    iget-object v1, v0, Lcom/zykj/view/databinding/ViewIncludeMenuBinding;->m:Landroidx/appcompat/widget/AppCompatImageView;

    .line 14
    .line 15
    new-instance v2, Lkb/t0;

    .line 16
    .line 17
    invoke-direct {v2, p0}, Lkb/t0;-><init>(Lcom/zykj/view/board/board/BoardFragment;)V

    .line 18
    .line 19
    .line 20
    invoke-virtual {v1, v2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 21
    .line 22
    .line 23
    iget-object v1, v0, Lcom/zykj/view/databinding/ViewIncludeMenuBinding;->i:Landroidx/appcompat/widget/AppCompatImageView;

    .line 24
    .line 25
    new-instance v2, Lkb/w0;

    .line 26
    .line 27
    invoke-direct {v2, p0}, Lkb/w0;-><init>(Lcom/zykj/view/board/board/BoardFragment;)V

    .line 28
    .line 29
    .line 30
    invoke-virtual {v1, v2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 31
    .line 32
    .line 33
    iget-object v1, v0, Lcom/zykj/view/databinding/ViewIncludeMenuBinding;->k:Landroidx/appcompat/widget/AppCompatImageView;

    .line 34
    .line 35
    new-instance v2, Lkb/x0;

    .line 36
    .line 37
    invoke-direct {v2, p0}, Lkb/x0;-><init>(Lcom/zykj/view/board/board/BoardFragment;)V

    .line 38
    .line 39
    .line 40
    invoke-virtual {v1, v2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 41
    .line 42
    .line 43
    iget-object v1, v0, Lcom/zykj/view/databinding/ViewIncludeMenuBinding;->l:Landroidx/appcompat/widget/AppCompatImageView;

    .line 44
    .line 45
    new-instance v2, Lkb/y0;

    .line 46
    .line 47
    invoke-direct {v2, p0}, Lkb/y0;-><init>(Lcom/zykj/view/board/board/BoardFragment;)V

    .line 48
    .line 49
    .line 50
    invoke-virtual {v1, v2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 51
    .line 52
    .line 53
    iget-object v1, v0, Lcom/zykj/view/databinding/ViewIncludeMenuBinding;->e:Landroidx/appcompat/widget/AppCompatImageView;

    .line 54
    .line 55
    new-instance v2, Lkb/z0;

    .line 56
    .line 57
    invoke-direct {v2, p0}, Lkb/z0;-><init>(Lcom/zykj/view/board/board/BoardFragment;)V

    .line 58
    .line 59
    .line 60
    invoke-virtual {v1, v2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 61
    .line 62
    .line 63
    iget-object v1, v0, Lcom/zykj/view/databinding/ViewIncludeMenuBinding;->j:Landroidx/appcompat/widget/AppCompatImageView;

    .line 64
    .line 65
    new-instance v2, Lkb/c;

    .line 66
    .line 67
    invoke-direct {v2, p0}, Lkb/c;-><init>(Lcom/zykj/view/board/board/BoardFragment;)V

    .line 68
    .line 69
    .line 70
    invoke-virtual {v1, v2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 71
    .line 72
    .line 73
    iget-object v1, v0, Lcom/zykj/view/databinding/ViewIncludeMenuBinding;->h:Landroidx/appcompat/widget/AppCompatImageView;

    .line 74
    .line 75
    new-instance v2, Lkb/d;

    .line 76
    .line 77
    invoke-direct {v2, p0}, Lkb/d;-><init>(Lcom/zykj/view/board/board/BoardFragment;)V

    .line 78
    .line 79
    .line 80
    invoke-virtual {v1, v2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 81
    .line 82
    .line 83
    iget-object v1, v0, Lcom/zykj/view/databinding/ViewIncludeMenuBinding;->f:Landroidx/appcompat/widget/AppCompatImageView;

    .line 84
    .line 85
    new-instance v2, Lkb/e;

    .line 86
    .line 87
    invoke-direct {v2, p0}, Lkb/e;-><init>(Lcom/zykj/view/board/board/BoardFragment;)V

    .line 88
    .line 89
    .line 90
    invoke-virtual {v1, v2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 91
    .line 92
    .line 93
    iget-object v1, v0, Lcom/zykj/view/databinding/ViewIncludeMenuBinding;->g:Landroidx/appcompat/widget/AppCompatImageView;

    .line 94
    .line 95
    new-instance v2, Lkb/f;

    .line 96
    .line 97
    invoke-direct {v2, p0}, Lkb/f;-><init>(Lcom/zykj/view/board/board/BoardFragment;)V

    .line 98
    .line 99
    .line 100
    invoke-virtual {v1, v2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 101
    .line 102
    .line 103
    iget-object v1, v0, Lcom/zykj/view/databinding/ViewIncludeMenuBinding;->c:Landroidx/appcompat/widget/AppCompatImageView;

    .line 104
    .line 105
    new-instance v2, Lkb/g;

    .line 106
    .line 107
    invoke-direct {v2, p0}, Lkb/g;-><init>(Lcom/zykj/view/board/board/BoardFragment;)V

    .line 108
    .line 109
    .line 110
    invoke-virtual {v1, v2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 111
    .line 112
    .line 113
    iget-object v0, v0, Lcom/zykj/view/databinding/ViewIncludeMenuBinding;->d:Landroidx/appcompat/widget/AppCompatImageView;

    .line 114
    .line 115
    new-instance v1, Lkb/v0;

    .line 116
    .line 117
    invoke-direct {v1, p0}, Lkb/v0;-><init>(Lcom/zykj/view/board/board/BoardFragment;)V

    .line 118
    .line 119
    .line 120
    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 121
    .line 122
    .line 123
    return-void
.end method

.method public onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 0

    .line 1
    const-string p2, "inflater"

    .line 2
    .line 3
    invoke-static {p1, p2}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-static {p1}, Lcom/zykj/view/databinding/ViewFragmentBoardBinding;->a(Landroid/view/LayoutInflater;)Lcom/zykj/view/databinding/ViewFragmentBoardBinding;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    invoke-static {p1}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 11
    .line 12
    .line 13
    iput-object p1, p0, Lcom/zykj/view/board/board/BoardFragment;->d:Lcom/zykj/view/databinding/ViewFragmentBoardBinding;

    .line 14
    .line 15
    invoke-virtual {p1}, Landroidx/databinding/ViewDataBinding;->getRoot()Landroid/view/View;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    const-string p2, "getRoot(...)"

    .line 20
    .line 21
    invoke-static {p1, p2}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    return-object p1
.end method

.method public onDestroyView()V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/zykj/view/board/board/BoardFragment;->C0()V

    .line 2
    .line 3
    .line 4
    invoke-super {p0}, Landroidx/fragment/app/Fragment;->onDestroyView()V

    .line 5
    .line 6
    .line 7
    return-void
.end method

.method public onViewCreated(Landroid/view/View;Landroid/os/Bundle;)V
    .locals 1

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
    invoke-direct {p0}, Lcom/zykj/view/board/board/BoardFragment;->initView()V

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public final s1()V
    .locals 8

    .line 1
    iget-object v0, p0, Lcom/zykj/view/board/board/BoardFragment;->d:Lcom/zykj/view/databinding/ViewFragmentBoardBinding;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const-string v2, "mBinding"

    .line 5
    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    invoke-static {v2}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    move-object v0, v1

    .line 12
    :cond_0
    iget-object v0, v0, Lcom/zykj/view/databinding/ViewFragmentBoardBinding;->h:Lcom/zykj/view/databinding/ViewIncludePenBinding;

    .line 13
    .line 14
    iget-object v0, v0, Lcom/zykj/view/databinding/ViewIncludePenBinding;->m:Landroid/widget/RadioGroup;

    .line 15
    .line 16
    const-string v3, "rgPenType"

    .line 17
    .line 18
    invoke-static {v0, v3}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    invoke-static {v0}, Landroidx/core/view/ViewGroupKt;->getChildren(Landroid/view/ViewGroup;)Lpd/g;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    invoke-interface {v0}, Lpd/g;->iterator()Ljava/util/Iterator;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 30
    .line 31
    .line 32
    move-result v3

    .line 33
    if-eqz v3, :cond_1

    .line 34
    .line 35
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object v3

    .line 39
    check-cast v3, Landroid/view/View;

    .line 40
    .line 41
    new-instance v4, Lkb/m;

    .line 42
    .line 43
    invoke-direct {v4, p0}, Lkb/m;-><init>(Lcom/zykj/view/board/board/BoardFragment;)V

    .line 44
    .line 45
    .line 46
    invoke-virtual {v3, v4}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 47
    .line 48
    .line 49
    goto :goto_0

    .line 50
    :cond_1
    iget-object v0, p0, Lcom/zykj/view/board/board/BoardFragment;->d:Lcom/zykj/view/databinding/ViewFragmentBoardBinding;

    .line 51
    .line 52
    if-nez v0, :cond_2

    .line 53
    .line 54
    invoke-static {v2}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 55
    .line 56
    .line 57
    move-object v0, v1

    .line 58
    :cond_2
    iget-object v0, v0, Lcom/zykj/view/databinding/ViewFragmentBoardBinding;->h:Lcom/zykj/view/databinding/ViewIncludePenBinding;

    .line 59
    .line 60
    iget-object v0, v0, Lcom/zykj/view/databinding/ViewIncludePenBinding;->l:Landroid/widget/RadioGroup;

    .line 61
    .line 62
    const-string v3, "rgPenSize"

    .line 63
    .line 64
    invoke-static {v0, v3}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 65
    .line 66
    .line 67
    invoke-static {v0}, Landroidx/core/view/ViewGroupKt;->getChildren(Landroid/view/ViewGroup;)Lpd/g;

    .line 68
    .line 69
    .line 70
    move-result-object v0

    .line 71
    invoke-interface {v0}, Lpd/g;->iterator()Ljava/util/Iterator;

    .line 72
    .line 73
    .line 74
    move-result-object v0

    .line 75
    const/4 v3, 0x0

    .line 76
    move v4, v3

    .line 77
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 78
    .line 79
    .line 80
    move-result v5

    .line 81
    if-eqz v5, :cond_4

    .line 82
    .line 83
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 84
    .line 85
    .line 86
    move-result-object v5

    .line 87
    add-int/lit8 v6, v4, 0x1

    .line 88
    .line 89
    if-gez v4, :cond_3

    .line 90
    .line 91
    invoke-static {}, Lrc/w;->w()V

    .line 92
    .line 93
    .line 94
    :cond_3
    check-cast v5, Landroid/view/View;

    .line 95
    .line 96
    new-instance v7, Lkb/x;

    .line 97
    .line 98
    invoke-direct {v7, p0, v4}, Lkb/x;-><init>(Lcom/zykj/view/board/board/BoardFragment;I)V

    .line 99
    .line 100
    .line 101
    invoke-virtual {v5, v7}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 102
    .line 103
    .line 104
    move v4, v6

    .line 105
    goto :goto_1

    .line 106
    :cond_4
    iget-object v0, p0, Lcom/zykj/view/board/board/BoardFragment;->d:Lcom/zykj/view/databinding/ViewFragmentBoardBinding;

    .line 107
    .line 108
    if-nez v0, :cond_5

    .line 109
    .line 110
    invoke-static {v2}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 111
    .line 112
    .line 113
    goto :goto_2

    .line 114
    :cond_5
    move-object v1, v0

    .line 115
    :goto_2
    iget-object v0, v1, Lcom/zykj/view/databinding/ViewFragmentBoardBinding;->h:Lcom/zykj/view/databinding/ViewIncludePenBinding;

    .line 116
    .line 117
    iget-object v0, v0, Lcom/zykj/view/databinding/ViewIncludePenBinding;->k:Landroid/widget/RadioGroup;

    .line 118
    .line 119
    const-string v1, "rgPenColor"

    .line 120
    .line 121
    invoke-static {v0, v1}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 122
    .line 123
    .line 124
    invoke-static {v0}, Landroidx/core/view/ViewGroupKt;->getChildren(Landroid/view/ViewGroup;)Lpd/g;

    .line 125
    .line 126
    .line 127
    move-result-object v0

    .line 128
    invoke-interface {v0}, Lpd/g;->iterator()Ljava/util/Iterator;

    .line 129
    .line 130
    .line 131
    move-result-object v0

    .line 132
    :goto_3
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 133
    .line 134
    .line 135
    move-result v1

    .line 136
    if-eqz v1, :cond_7

    .line 137
    .line 138
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 139
    .line 140
    .line 141
    move-result-object v1

    .line 142
    add-int/lit8 v2, v3, 0x1

    .line 143
    .line 144
    if-gez v3, :cond_6

    .line 145
    .line 146
    invoke-static {}, Lrc/w;->w()V

    .line 147
    .line 148
    .line 149
    :cond_6
    check-cast v1, Landroid/view/View;

    .line 150
    .line 151
    new-instance v4, Lkb/i0;

    .line 152
    .line 153
    invoke-direct {v4, p0, v3}, Lkb/i0;-><init>(Lcom/zykj/view/board/board/BoardFragment;I)V

    .line 154
    .line 155
    .line 156
    invoke-virtual {v1, v4}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 157
    .line 158
    .line 159
    move v3, v2

    .line 160
    goto :goto_3

    .line 161
    :cond_7
    return-void
.end method

.method public final t0(Landroid/graphics/Bitmap;Ljava/lang/String;Ljava/lang/String;ZLhd/l;)V
    .locals 10

    .line 1
    const-string v0, "filename"

    .line 2
    .line 3
    invoke-static {p3, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Lcom/zykj/view/board/board/BoardFragment;->w0()Lcom/zykj/view/board/board/BoardViewModel;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    const/4 v8, 0x4

    .line 11
    const/4 v9, 0x0

    .line 12
    const/4 v4, 0x0

    .line 13
    move-object v2, p1

    .line 14
    move-object v3, p2

    .line 15
    move-object v6, p3

    .line 16
    move v5, p4

    .line 17
    move-object v7, p5

    .line 18
    invoke-static/range {v1 .. v9}, Lcom/zykj/view/board/board/BoardViewModel;->y(Lcom/zykj/view/board/board/BoardViewModel;Landroid/graphics/Bitmap;Ljava/lang/String;Lcom/zykj/board/EzyScaleTypeEnum$ScaleTypeEnum;ZLjava/lang/String;Lhd/l;ILjava/lang/Object;)V

    .line 19
    .line 20
    .line 21
    return-void
.end method

.method public final w0()Lcom/zykj/view/board/board/BoardViewModel;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/view/board/board/BoardFragment;->e:Lqc/d;

    .line 2
    .line 3
    invoke-interface {v0}, Lqc/d;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lcom/zykj/view/board/board/BoardViewModel;

    .line 8
    .line 9
    return-object v0
.end method

.method public final w1()V
    .locals 6

    .line 1
    iget-object v0, p0, Lcom/zykj/view/board/board/BoardFragment;->d:Lcom/zykj/view/databinding/ViewFragmentBoardBinding;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const-string v2, "mBinding"

    .line 5
    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    invoke-static {v2}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    move-object v0, v1

    .line 12
    :cond_0
    iget-object v0, v0, Lcom/zykj/view/databinding/ViewFragmentBoardBinding;->n:Lcom/zykj/view/widget/SketchProgressView;

    .line 13
    .line 14
    const-string v3, "sketchProgressVertical"

    .line 15
    .line 16
    invoke-static {v0, v3}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    new-instance v3, Lkb/d0;

    .line 20
    .line 21
    invoke-direct {v3, p0}, Lkb/d0;-><init>(Lcom/zykj/view/board/board/BoardFragment;)V

    .line 22
    .line 23
    .line 24
    new-instance v4, Lkb/e0;

    .line 25
    .line 26
    invoke-direct {v4, p0}, Lkb/e0;-><init>(Lcom/zykj/view/board/board/BoardFragment;)V

    .line 27
    .line 28
    .line 29
    new-instance v5, Lkb/f0;

    .line 30
    .line 31
    invoke-direct {v5, p0}, Lkb/f0;-><init>(Lcom/zykj/view/board/board/BoardFragment;)V

    .line 32
    .line 33
    .line 34
    invoke-static {v0, v3, v4, v5}, Lvb/a;->b(Lcom/zykj/view/widget/SketchProgressView;Lhd/a;Lhd/l;Lhd/l;)V

    .line 35
    .line 36
    .line 37
    iget-object v0, p0, Lcom/zykj/view/board/board/BoardFragment;->d:Lcom/zykj/view/databinding/ViewFragmentBoardBinding;

    .line 38
    .line 39
    if-nez v0, :cond_1

    .line 40
    .line 41
    invoke-static {v2}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 42
    .line 43
    .line 44
    goto :goto_0

    .line 45
    :cond_1
    move-object v1, v0

    .line 46
    :goto_0
    iget-object v0, v1, Lcom/zykj/view/databinding/ViewFragmentBoardBinding;->m:Lcom/zykj/view/widget/SketchProgressView;

    .line 47
    .line 48
    const-string v1, "sketchProgressHorizontal"

    .line 49
    .line 50
    invoke-static {v0, v1}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 51
    .line 52
    .line 53
    new-instance v1, Lkb/g0;

    .line 54
    .line 55
    invoke-direct {v1, p0}, Lkb/g0;-><init>(Lcom/zykj/view/board/board/BoardFragment;)V

    .line 56
    .line 57
    .line 58
    new-instance v2, Lkb/h0;

    .line 59
    .line 60
    invoke-direct {v2, p0}, Lkb/h0;-><init>(Lcom/zykj/view/board/board/BoardFragment;)V

    .line 61
    .line 62
    .line 63
    new-instance v3, Lkb/j0;

    .line 64
    .line 65
    invoke-direct {v3, p0}, Lkb/j0;-><init>(Lcom/zykj/view/board/board/BoardFragment;)V

    .line 66
    .line 67
    .line 68
    invoke-static {v0, v1, v2, v3}, Lvb/a;->b(Lcom/zykj/view/widget/SketchProgressView;Lhd/a;Lhd/l;Lhd/l;)V

    .line 69
    .line 70
    .line 71
    return-void
.end method

.method public final x0()Ljava/lang/String;
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
    const-string v1, "path"

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

.method public final y0()Ljava/util/List;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/zykj/view/board/board/BoardFragment;->w0()Lcom/zykj/view/board/board/BoardViewModel;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Lcom/zykj/view/board/board/BoardViewModel;->T()Ljava/util/List;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    return-object v0
.end method

.method public final z0(ZZLhd/l;Lhd/l;)V
    .locals 4

    .line 1
    const-string v0, "callback"

    .line 2
    .line 3
    invoke-static {p4, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Lcom/zykj/view/board/board/BoardFragment;->w0()Lcom/zykj/view/board/board/BoardViewModel;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    new-instance v1, Lcom/zykj/view/board/board/BoardFragment$getSavePath$1;

    .line 11
    .line 12
    invoke-direct {v1, p4}, Lcom/zykj/view/board/board/BoardFragment$getSavePath$1;-><init>(Ljava/lang/Object;)V

    .line 13
    .line 14
    .line 15
    new-instance v2, Lcom/zykj/view/board/board/BoardFragment$getSavePath$2;

    .line 16
    .line 17
    const/4 v3, 0x0

    .line 18
    invoke-direct {v2, p3, p4, v3}, Lcom/zykj/view/board/board/BoardFragment$getSavePath$2;-><init>(Lhd/l;Lhd/l;Lvc/c;)V

    .line 19
    .line 20
    .line 21
    invoke-virtual {v0, p1, p2, v2, v1}, Lcom/zykj/view/board/board/BoardViewModel;->W(ZZLhd/p;Lhd/p;)V

    .line 22
    .line 23
    .line 24
    return-void
.end method
