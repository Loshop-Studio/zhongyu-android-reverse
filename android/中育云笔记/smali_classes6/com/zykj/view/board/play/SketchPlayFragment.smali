.class public final Lcom/zykj/view/board/play/SketchPlayFragment;
.super Landroidx/fragment/app/Fragment;
.source "SourceFile"


# annotations
.annotation build Landroid/annotation/SuppressLint;
    value = {
        "SetTextI18n"
    }
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/zykj/view/board/play/SketchPlayFragment$a;,
        Lcom/zykj/view/board/play/SketchPlayFragment$b;
    }
.end annotation


# static fields
.field public static final v:Lcom/zykj/view/board/play/SketchPlayFragment$a;


# instance fields
.field public d:Lnb/a;

.field public e:Ljava/util/ArrayList;

.field public f:Lnb/h;

.field public g:Z

.field public h:Ljava/lang/String;

.field public i:Ljava/lang/String;

.field public j:I

.field public k:Z

.field public l:I

.field public m:Lnb/f;

.field public n:Lnb/d;

.field public o:Lcom/zykj/view/databinding/ViewFragmentSketchPlayBinding;

.field public p:Lhd/p;

.field public q:Lhd/a;

.field public final r:Landroidx/activity/result/ActivityResultLauncher;

.field public final s:Lqc/d;

.field public t:Lkotlinx/coroutines/g;

.field public u:Landroid/app/ProgressDialog;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/zykj/view/board/play/SketchPlayFragment$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/zykj/view/board/play/SketchPlayFragment$a;-><init>(Lkotlin/jvm/internal/n;)V

    sput-object v0, Lcom/zykj/view/board/play/SketchPlayFragment;->v:Lcom/zykj/view/board/play/SketchPlayFragment$a;

    return-void
.end method

.method public constructor <init>()V
    .locals 11

    .line 1
    invoke-direct {p0}, Landroidx/fragment/app/Fragment;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/util/ArrayList;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lcom/zykj/view/board/play/SketchPlayFragment;->e:Ljava/util/ArrayList;

    .line 10
    .line 11
    new-instance v1, Lnb/h;

    .line 12
    .line 13
    const/16 v9, 0x7f

    .line 14
    .line 15
    const/4 v10, 0x0

    .line 16
    const/4 v2, 0x0

    .line 17
    const/4 v3, 0x0

    .line 18
    const/4 v4, 0x0

    .line 19
    const/4 v5, 0x0

    .line 20
    const/4 v6, 0x0

    .line 21
    const/4 v7, 0x0

    .line 22
    const/4 v8, 0x0

    .line 23
    invoke-direct/range {v1 .. v10}, Lnb/h;-><init>(ZZZZLhd/a;Lhd/l;Lhd/l;ILkotlin/jvm/internal/n;)V

    .line 24
    .line 25
    .line 26
    iput-object v1, p0, Lcom/zykj/view/board/play/SketchPlayFragment;->f:Lnb/h;

    .line 27
    .line 28
    const-string v0, "00:00"

    .line 29
    .line 30
    iput-object v0, p0, Lcom/zykj/view/board/play/SketchPlayFragment;->h:Ljava/lang/String;

    .line 31
    .line 32
    iput-object v0, p0, Lcom/zykj/view/board/play/SketchPlayFragment;->i:Ljava/lang/String;

    .line 33
    .line 34
    const/4 v0, -0x1

    .line 35
    iput v0, p0, Lcom/zykj/view/board/play/SketchPlayFragment;->j:I

    .line 36
    .line 37
    new-instance v0, Landroidx/activity/result/contract/ActivityResultContracts$RequestPermission;

    .line 38
    .line 39
    invoke-direct {v0}, Landroidx/activity/result/contract/ActivityResultContracts$RequestPermission;-><init>()V

    .line 40
    .line 41
    .line 42
    new-instance v1, Lnb/i;

    .line 43
    .line 44
    invoke-direct {v1, p0}, Lnb/i;-><init>(Lcom/zykj/view/board/play/SketchPlayFragment;)V

    .line 45
    .line 46
    .line 47
    invoke-virtual {p0, v0, v1}, Landroidx/fragment/app/Fragment;->registerForActivityResult(Landroidx/activity/result/contract/ActivityResultContract;Landroidx/activity/result/ActivityResultCallback;)Landroidx/activity/result/ActivityResultLauncher;

    .line 48
    .line 49
    .line 50
    move-result-object v0

    .line 51
    const-string v1, "registerForActivityResult(...)"

    .line 52
    .line 53
    invoke-static {v0, v1}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 54
    .line 55
    .line 56
    iput-object v0, p0, Lcom/zykj/view/board/play/SketchPlayFragment;->r:Landroidx/activity/result/ActivityResultLauncher;

    .line 57
    .line 58
    new-instance v0, Lnb/m;

    .line 59
    .line 60
    invoke-direct {v0, p0}, Lnb/m;-><init>(Lcom/zykj/view/board/play/SketchPlayFragment;)V

    .line 61
    .line 62
    .line 63
    invoke-static {v0}, Lkotlin/a;->a(Lhd/a;)Lqc/d;

    .line 64
    .line 65
    .line 66
    move-result-object v0

    .line 67
    iput-object v0, p0, Lcom/zykj/view/board/play/SketchPlayFragment;->s:Lqc/d;

    .line 68
    .line 69
    return-void
.end method

.method public static synthetic A()Lqc/q;
    .locals 1

    .line 1
    invoke-static {}, Lcom/zykj/view/board/play/SketchPlayFragment;->W()Lqc/q;

    move-result-object v0

    return-object v0
.end method

.method public static final synthetic B(Lcom/zykj/view/board/play/SketchPlayFragment;)Lnb/h;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/zykj/view/board/play/SketchPlayFragment;->f:Lnb/h;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic C(Lcom/zykj/view/board/play/SketchPlayFragment;)Lcom/zykj/view/databinding/ViewFragmentSketchPlayBinding;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/zykj/view/board/play/SketchPlayFragment;->o:Lcom/zykj/view/databinding/ViewFragmentSketchPlayBinding;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic D(Lcom/zykj/view/board/play/SketchPlayFragment;)Lnb/a;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/zykj/view/board/play/SketchPlayFragment;->d:Lnb/a;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic E(Lcom/zykj/view/board/play/SketchPlayFragment;)I
    .locals 0

    .line 1
    iget p0, p0, Lcom/zykj/view/board/play/SketchPlayFragment;->j:I

    .line 2
    .line 3
    return p0
.end method

.method public static final synthetic F(Lcom/zykj/view/board/play/SketchPlayFragment;)Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/zykj/view/board/play/SketchPlayFragment;->h:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic G(Lcom/zykj/view/board/play/SketchPlayFragment;)Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/zykj/view/board/play/SketchPlayFragment;->i:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic H(Lcom/zykj/view/board/play/SketchPlayFragment;)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/zykj/view/board/play/SketchPlayFragment;->Y()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static final synthetic I(Lcom/zykj/view/board/play/SketchPlayFragment;I)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcom/zykj/view/board/play/SketchPlayFragment;->Z(I)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static final synthetic J(Lcom/zykj/view/board/play/SketchPlayFragment;)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/zykj/view/board/play/SketchPlayFragment;->a0()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static final synthetic K(Lcom/zykj/view/board/play/SketchPlayFragment;Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/zykj/view/board/play/SketchPlayFragment;->k:Z

    .line 2
    .line 3
    return-void
.end method

.method public static final synthetic L(Lcom/zykj/view/board/play/SketchPlayFragment;I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/zykj/view/board/play/SketchPlayFragment;->j:I

    .line 2
    .line 3
    return-void
.end method

.method public static final synthetic M(Lcom/zykj/view/board/play/SketchPlayFragment;I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/zykj/view/board/play/SketchPlayFragment;->l:I

    .line 2
    .line 3
    return-void
.end method

.method public static final synthetic N(Lcom/zykj/view/board/play/SketchPlayFragment;Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/zykj/view/board/play/SketchPlayFragment;->h:Ljava/lang/String;

    .line 2
    .line 3
    return-void
.end method

.method public static final synthetic O(Lcom/zykj/view/board/play/SketchPlayFragment;)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/zykj/view/board/play/SketchPlayFragment;->s0()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static final synthetic P(Lcom/zykj/view/board/play/SketchPlayFragment;)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/zykj/view/board/play/SketchPlayFragment;->t0()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static final synthetic Q(Lcom/zykj/view/board/play/SketchPlayFragment;)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/zykj/view/board/play/SketchPlayFragment;->v0()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic S(Lcom/zykj/view/board/play/SketchPlayFragment;DZILjava/lang/Object;)V
    .locals 0

    .line 1
    and-int/lit8 p4, p4, 0x2

    .line 2
    .line 3
    if-eqz p4, :cond_0

    .line 4
    .line 5
    const/4 p3, 0x1

    .line 6
    :cond_0
    invoke-virtual {p0, p1, p2, p3}, Lcom/zykj/view/board/play/SketchPlayFragment;->R(DZ)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public static final V()Lqc/q;
    .locals 1

    .line 1
    sget-object v0, Lqc/q;->a:Lqc/q;

    .line 2
    .line 3
    return-object v0
.end method

.method public static final W()Lqc/q;
    .locals 1

    .line 1
    sget-object v0, Lqc/q;->a:Lqc/q;

    .line 2
    .line 3
    return-object v0
.end method

.method public static final b0(Lcom/zykj/view/board/play/SketchPlayFragment;Landroid/view/View;)V
    .locals 0

    .line 1
    iget-object p1, p0, Lcom/zykj/view/board/play/SketchPlayFragment;->d:Lnb/a;

    .line 2
    .line 3
    if-eqz p1, :cond_0

    .line 4
    .line 5
    if-eqz p1, :cond_1

    .line 6
    .line 7
    invoke-virtual {p1}, Lnb/a;->a()Lhd/a;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    if-eqz p0, :cond_1

    .line 12
    .line 13
    invoke-interface {p0}, Lhd/a;->invoke()Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    return-void

    .line 17
    :cond_0
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getActivity()Landroidx/fragment/app/FragmentActivity;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    if-eqz p0, :cond_1

    .line 22
    .line 23
    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    .line 24
    .line 25
    .line 26
    :cond_1
    return-void
.end method

.method public static final c0(Lcom/zykj/view/board/play/SketchPlayFragment;Landroid/view/View;)V
    .locals 2

    .line 1
    iget-object p1, p0, Lcom/zykj/view/board/play/SketchPlayFragment;->e:Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-interface {p1}, Ljava/util/Collection;->isEmpty()Z

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    if-nez p1, :cond_2

    .line 8
    .line 9
    iget-object p1, p0, Lcom/zykj/view/board/play/SketchPlayFragment;->n:Lnb/d;

    .line 10
    .line 11
    const/4 v0, 0x0

    .line 12
    if-nez p1, :cond_0

    .line 13
    .line 14
    const-string p1, "playSettingPopup"

    .line 15
    .line 16
    invoke-static {p1}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    move-object p1, v0

    .line 20
    :cond_0
    iget-object v1, p0, Lcom/zykj/view/board/play/SketchPlayFragment;->o:Lcom/zykj/view/databinding/ViewFragmentSketchPlayBinding;

    .line 21
    .line 22
    if-nez v1, :cond_1

    .line 23
    .line 24
    const-string v1, "mBinding"

    .line 25
    .line 26
    invoke-static {v1}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_1
    move-object v0, v1

    .line 31
    :goto_0
    iget-object v0, v0, Lcom/zykj/view/databinding/ViewFragmentSketchPlayBinding;->g:Landroid/widget/ImageView;

    .line 32
    .line 33
    const-string v1, "ivSetting"

    .line 34
    .line 35
    invoke-static {v0, v1}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 36
    .line 37
    .line 38
    iget-object p0, p0, Lcom/zykj/view/board/play/SketchPlayFragment;->e:Ljava/util/ArrayList;

    .line 39
    .line 40
    invoke-virtual {p1, v0, p0}, Lnb/d;->a(Landroid/view/View;Ljava/util/List;)V

    .line 41
    .line 42
    .line 43
    return-void

    .line 44
    :cond_2
    sget p1, Lcom/zykj/view/R$string;->no_content:I

    .line 45
    .line 46
    invoke-virtual {p0, p1}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object p0

    .line 50
    const/4 p1, 0x0

    .line 51
    new-array p1, p1, [Ljava/lang/Object;

    .line 52
    .line 53
    invoke-static {p0, p1}, Lcom/blankj/utilcode/util/ToastUtils;->showShort(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 54
    .line 55
    .line 56
    return-void
.end method

.method public static final d0(Lcom/zykj/view/board/play/SketchPlayFragment;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/zykj/view/board/play/SketchPlayFragment;->j0()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static final e0(Lcom/zykj/view/board/play/SketchPlayFragment;Landroid/view/View;)V
    .locals 4

    .line 1
    iget-object p1, p0, Lcom/zykj/view/board/play/SketchPlayFragment;->p:Lhd/p;

    .line 2
    .line 3
    const-string v0, "tvSpeedRate"

    .line 4
    .line 5
    const-string v1, "mBinding"

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    if-eqz p1, :cond_1

    .line 9
    .line 10
    iget-object v3, p0, Lcom/zykj/view/board/play/SketchPlayFragment;->o:Lcom/zykj/view/databinding/ViewFragmentSketchPlayBinding;

    .line 11
    .line 12
    if-nez v3, :cond_0

    .line 13
    .line 14
    invoke-static {v1}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    move-object v2, v3

    .line 19
    :goto_0
    iget-object v1, v2, Lcom/zykj/view/databinding/ViewFragmentSketchPlayBinding;->d:Lcom/zykj/view/databinding/ViewItemSketchPlayBinding;

    .line 20
    .line 21
    iget-object v1, v1, Lcom/zykj/view/databinding/ViewItemSketchPlayBinding;->g:Landroid/widget/TextView;

    .line 22
    .line 23
    invoke-static {v1, v0}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    new-instance v0, Lnb/k;

    .line 27
    .line 28
    invoke-direct {v0, p0}, Lnb/k;-><init>(Lcom/zykj/view/board/play/SketchPlayFragment;)V

    .line 29
    .line 30
    .line 31
    invoke-interface {p1, v1, v0}, Lhd/p;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    return-void

    .line 35
    :cond_1
    iget-object p1, p0, Lcom/zykj/view/board/play/SketchPlayFragment;->m:Lnb/f;

    .line 36
    .line 37
    if-nez p1, :cond_2

    .line 38
    .line 39
    const-string p1, "playSpeedRatePopup"

    .line 40
    .line 41
    invoke-static {p1}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 42
    .line 43
    .line 44
    move-object p1, v2

    .line 45
    :cond_2
    iget-object v3, p0, Lcom/zykj/view/board/play/SketchPlayFragment;->o:Lcom/zykj/view/databinding/ViewFragmentSketchPlayBinding;

    .line 46
    .line 47
    if-nez v3, :cond_3

    .line 48
    .line 49
    invoke-static {v1}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 50
    .line 51
    .line 52
    move-object v3, v2

    .line 53
    :cond_3
    iget-object v3, v3, Lcom/zykj/view/databinding/ViewFragmentSketchPlayBinding;->d:Lcom/zykj/view/databinding/ViewItemSketchPlayBinding;

    .line 54
    .line 55
    iget-object v3, v3, Lcom/zykj/view/databinding/ViewItemSketchPlayBinding;->g:Landroid/widget/TextView;

    .line 56
    .line 57
    invoke-static {v3, v0}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 58
    .line 59
    .line 60
    iget-object v0, p0, Lcom/zykj/view/board/play/SketchPlayFragment;->o:Lcom/zykj/view/databinding/ViewFragmentSketchPlayBinding;

    .line 61
    .line 62
    if-nez v0, :cond_4

    .line 63
    .line 64
    invoke-static {v1}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 65
    .line 66
    .line 67
    goto :goto_1

    .line 68
    :cond_4
    move-object v2, v0

    .line 69
    :goto_1
    iget-object v0, v2, Lcom/zykj/view/databinding/ViewFragmentSketchPlayBinding;->d:Lcom/zykj/view/databinding/ViewItemSketchPlayBinding;

    .line 70
    .line 71
    iget-object v0, v0, Lcom/zykj/view/databinding/ViewItemSketchPlayBinding;->g:Landroid/widget/TextView;

    .line 72
    .line 73
    invoke-virtual {v0}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    .line 74
    .line 75
    .line 76
    move-result-object v0

    .line 77
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 78
    .line 79
    .line 80
    move-result-object v0

    .line 81
    new-instance v1, Lnb/l;

    .line 82
    .line 83
    invoke-direct {v1, p0}, Lnb/l;-><init>(Lcom/zykj/view/board/play/SketchPlayFragment;)V

    .line 84
    .line 85
    .line 86
    invoke-virtual {p1, v3, v0, v1}, Lnb/f;->b(Landroid/view/View;Ljava/lang/String;Lhd/l;)V

    .line 87
    .line 88
    .line 89
    return-void
.end method

.method public static final f0(Lcom/zykj/view/board/play/SketchPlayFragment;D)Lqc/q;
    .locals 6

    .line 1
    const/4 v4, 0x2

    .line 2
    const/4 v5, 0x0

    .line 3
    const/4 v3, 0x0

    .line 4
    move-object v0, p0

    .line 5
    move-wide v1, p1

    .line 6
    invoke-static/range {v0 .. v5}, Lcom/zykj/view/board/play/SketchPlayFragment;->S(Lcom/zykj/view/board/play/SketchPlayFragment;DZILjava/lang/Object;)V

    .line 7
    .line 8
    .line 9
    sget-object p0, Lqc/q;->a:Lqc/q;

    .line 10
    .line 11
    return-object p0
.end method

.method public static final g0(Lcom/zykj/view/board/play/SketchPlayFragment;Lnb/c0;)Lqc/q;
    .locals 7

    .line 1
    const-string v0, "it"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p1}, Lnb/c0;->e()D

    .line 7
    .line 8
    .line 9
    move-result-wide v2

    .line 10
    const/4 v5, 0x2

    .line 11
    const/4 v6, 0x0

    .line 12
    const/4 v4, 0x0

    .line 13
    move-object v1, p0

    .line 14
    invoke-static/range {v1 .. v6}, Lcom/zykj/view/board/play/SketchPlayFragment;->S(Lcom/zykj/view/board/play/SketchPlayFragment;DZILjava/lang/Object;)V

    .line 15
    .line 16
    .line 17
    sget-object p0, Lqc/q;->a:Lqc/q;

    .line 18
    .line 19
    return-object p0
.end method

.method public static final h0(Lcom/zykj/view/board/play/SketchPlayFragment;Landroid/view/View;)V
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/zykj/view/board/play/SketchPlayFragment;->f:Lnb/h;

    .line 2
    .line 3
    invoke-virtual {p0}, Lnb/h;->b()Lhd/l;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    if-eqz p0, :cond_0

    .line 8
    .line 9
    invoke-static {p1}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 10
    .line 11
    .line 12
    invoke-interface {p0, p1}, Lhd/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    :cond_0
    return-void
.end method

.method public static final i0(Lcom/zykj/view/board/play/SketchPlayFragment;Landroid/view/View;)V
    .locals 1

    .line 1
    iget-object p1, p0, Lcom/zykj/view/board/play/SketchPlayFragment;->f:Lnb/h;

    .line 2
    .line 3
    invoke-virtual {p1}, Lnb/h;->d()Z

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    if-eqz p1, :cond_2

    .line 8
    .line 9
    invoke-virtual {p0}, Lcom/zykj/view/board/play/SketchPlayFragment;->y0()V

    .line 10
    .line 11
    .line 12
    iget-object p1, p0, Lcom/zykj/view/board/play/SketchPlayFragment;->f:Lnb/h;

    .line 13
    .line 14
    invoke-virtual {p1}, Lnb/h;->f()Lhd/l;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    if-eqz p1, :cond_2

    .line 19
    .line 20
    iget-object p0, p0, Lcom/zykj/view/board/play/SketchPlayFragment;->o:Lcom/zykj/view/databinding/ViewFragmentSketchPlayBinding;

    .line 21
    .line 22
    if-nez p0, :cond_0

    .line 23
    .line 24
    const-string p0, "mBinding"

    .line 25
    .line 26
    invoke-static {p0}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    const/4 p0, 0x0

    .line 30
    :cond_0
    iget-object p0, p0, Lcom/zykj/view/databinding/ViewFragmentSketchPlayBinding;->d:Lcom/zykj/view/databinding/ViewItemSketchPlayBinding;

    .line 31
    .line 32
    iget-object p0, p0, Lcom/zykj/view/databinding/ViewItemSketchPlayBinding;->d:Landroid/widget/ImageView;

    .line 33
    .line 34
    const-string v0, "ivFullscreen"

    .line 35
    .line 36
    invoke-static {p0, v0}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 37
    .line 38
    .line 39
    invoke-virtual {p0}, Landroid/view/View;->getVisibility()I

    .line 40
    .line 41
    .line 42
    move-result p0

    .line 43
    if-nez p0, :cond_1

    .line 44
    .line 45
    const/4 p0, 0x1

    .line 46
    goto :goto_0

    .line 47
    :cond_1
    const/4 p0, 0x0

    .line 48
    :goto_0
    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 49
    .line 50
    .line 51
    move-result-object p0

    .line 52
    invoke-interface {p1, p0}, Lhd/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    :cond_2
    return-void
.end method

.method private final initView()V
    .locals 9

    .line 1
    new-instance v0, Lnb/f;

    .line 2
    .line 3
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->requireActivity()Landroidx/fragment/app/FragmentActivity;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    const-string v2, "requireActivity(...)"

    .line 8
    .line 9
    invoke-static {v1, v2}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    invoke-direct {v0, v1}, Lnb/f;-><init>(Landroid/content/Context;)V

    .line 13
    .line 14
    .line 15
    iput-object v0, p0, Lcom/zykj/view/board/play/SketchPlayFragment;->m:Lnb/f;

    .line 16
    .line 17
    new-instance v0, Lnb/d;

    .line 18
    .line 19
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->requireActivity()Landroidx/fragment/app/FragmentActivity;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    invoke-static {v1, v2}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    invoke-direct {v0, v1}, Lnb/d;-><init>(Landroid/content/Context;)V

    .line 27
    .line 28
    .line 29
    iput-object v0, p0, Lcom/zykj/view/board/play/SketchPlayFragment;->n:Lnb/d;

    .line 30
    .line 31
    iget-object v0, p0, Lcom/zykj/view/board/play/SketchPlayFragment;->o:Lcom/zykj/view/databinding/ViewFragmentSketchPlayBinding;

    .line 32
    .line 33
    const/4 v1, 0x0

    .line 34
    const-string v2, "mBinding"

    .line 35
    .line 36
    if-nez v0, :cond_0

    .line 37
    .line 38
    invoke-static {v2}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 39
    .line 40
    .line 41
    move-object v0, v1

    .line 42
    :cond_0
    iget-object v0, v0, Lcom/zykj/view/databinding/ViewFragmentSketchPlayBinding;->d:Lcom/zykj/view/databinding/ViewItemSketchPlayBinding;

    .line 43
    .line 44
    iget-object v0, v0, Lcom/zykj/view/databinding/ViewItemSketchPlayBinding;->g:Landroid/widget/TextView;

    .line 45
    .line 46
    const-string v3, "1.0X"

    .line 47
    .line 48
    invoke-virtual {v0, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 49
    .line 50
    .line 51
    invoke-virtual {p0}, Lcom/zykj/view/board/play/SketchPlayFragment;->Y()V

    .line 52
    .line 53
    .line 54
    iget-object v0, p0, Lcom/zykj/view/board/play/SketchPlayFragment;->o:Lcom/zykj/view/databinding/ViewFragmentSketchPlayBinding;

    .line 55
    .line 56
    if-nez v0, :cond_1

    .line 57
    .line 58
    invoke-static {v2}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 59
    .line 60
    .line 61
    move-object v0, v1

    .line 62
    :cond_1
    iget-object v3, v0, Lcom/zykj/view/databinding/ViewFragmentSketchPlayBinding;->e:Landroid/widget/ImageView;

    .line 63
    .line 64
    const-string v0, "ivBack"

    .line 65
    .line 66
    invoke-static {v3, v0}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 67
    .line 68
    .line 69
    new-instance v6, Lnb/n;

    .line 70
    .line 71
    invoke-direct {v6, p0}, Lnb/n;-><init>(Lcom/zykj/view/board/play/SketchPlayFragment;)V

    .line 72
    .line 73
    .line 74
    const/4 v7, 0x1

    .line 75
    const/4 v8, 0x0

    .line 76
    const-wide/16 v4, 0x0

    .line 77
    .line 78
    invoke-static/range {v3 .. v8}, Lvb/a;->d(Landroid/view/View;JLandroid/view/View$OnClickListener;ILjava/lang/Object;)V

    .line 79
    .line 80
    .line 81
    iget-object v0, p0, Lcom/zykj/view/board/play/SketchPlayFragment;->o:Lcom/zykj/view/databinding/ViewFragmentSketchPlayBinding;

    .line 82
    .line 83
    if-nez v0, :cond_2

    .line 84
    .line 85
    invoke-static {v2}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 86
    .line 87
    .line 88
    move-object v0, v1

    .line 89
    :cond_2
    iget-object v3, v0, Lcom/zykj/view/databinding/ViewFragmentSketchPlayBinding;->g:Landroid/widget/ImageView;

    .line 90
    .line 91
    const-string v0, "ivSetting"

    .line 92
    .line 93
    invoke-static {v3, v0}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 94
    .line 95
    .line 96
    new-instance v6, Lnb/o;

    .line 97
    .line 98
    invoke-direct {v6, p0}, Lnb/o;-><init>(Lcom/zykj/view/board/play/SketchPlayFragment;)V

    .line 99
    .line 100
    .line 101
    const/4 v7, 0x1

    .line 102
    const/4 v8, 0x0

    .line 103
    const-wide/16 v4, 0x0

    .line 104
    .line 105
    invoke-static/range {v3 .. v8}, Lvb/a;->d(Landroid/view/View;JLandroid/view/View$OnClickListener;ILjava/lang/Object;)V

    .line 106
    .line 107
    .line 108
    iget-object v0, p0, Lcom/zykj/view/board/play/SketchPlayFragment;->o:Lcom/zykj/view/databinding/ViewFragmentSketchPlayBinding;

    .line 109
    .line 110
    if-nez v0, :cond_3

    .line 111
    .line 112
    invoke-static {v2}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 113
    .line 114
    .line 115
    move-object v0, v1

    .line 116
    :cond_3
    iget-object v0, v0, Lcom/zykj/view/databinding/ViewFragmentSketchPlayBinding;->d:Lcom/zykj/view/databinding/ViewItemSketchPlayBinding;

    .line 117
    .line 118
    iget-object v3, v0, Lcom/zykj/view/databinding/ViewItemSketchPlayBinding;->e:Landroid/widget/ImageView;

    .line 119
    .line 120
    const-string v0, "ivRecord"

    .line 121
    .line 122
    invoke-static {v3, v0}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 123
    .line 124
    .line 125
    new-instance v6, Lnb/p;

    .line 126
    .line 127
    invoke-direct {v6, p0}, Lnb/p;-><init>(Lcom/zykj/view/board/play/SketchPlayFragment;)V

    .line 128
    .line 129
    .line 130
    const/4 v7, 0x1

    .line 131
    const/4 v8, 0x0

    .line 132
    const-wide/16 v4, 0x0

    .line 133
    .line 134
    invoke-static/range {v3 .. v8}, Lvb/a;->d(Landroid/view/View;JLandroid/view/View$OnClickListener;ILjava/lang/Object;)V

    .line 135
    .line 136
    .line 137
    iget-object v0, p0, Lcom/zykj/view/board/play/SketchPlayFragment;->o:Lcom/zykj/view/databinding/ViewFragmentSketchPlayBinding;

    .line 138
    .line 139
    if-nez v0, :cond_4

    .line 140
    .line 141
    invoke-static {v2}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 142
    .line 143
    .line 144
    move-object v0, v1

    .line 145
    :cond_4
    iget-object v0, v0, Lcom/zykj/view/databinding/ViewFragmentSketchPlayBinding;->d:Lcom/zykj/view/databinding/ViewItemSketchPlayBinding;

    .line 146
    .line 147
    iget-object v0, v0, Lcom/zykj/view/databinding/ViewItemSketchPlayBinding;->f:Landroid/widget/SeekBar;

    .line 148
    .line 149
    new-instance v3, Lcom/zykj/view/board/play/SketchPlayFragment$f;

    .line 150
    .line 151
    invoke-direct {v3, p0}, Lcom/zykj/view/board/play/SketchPlayFragment$f;-><init>(Lcom/zykj/view/board/play/SketchPlayFragment;)V

    .line 152
    .line 153
    .line 154
    invoke-virtual {v0, v3}, Landroid/widget/SeekBar;->setOnSeekBarChangeListener(Landroid/widget/SeekBar$OnSeekBarChangeListener;)V

    .line 155
    .line 156
    .line 157
    iget-object v0, p0, Lcom/zykj/view/board/play/SketchPlayFragment;->o:Lcom/zykj/view/databinding/ViewFragmentSketchPlayBinding;

    .line 158
    .line 159
    if-nez v0, :cond_5

    .line 160
    .line 161
    invoke-static {v2}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 162
    .line 163
    .line 164
    move-object v0, v1

    .line 165
    :cond_5
    iget-object v0, v0, Lcom/zykj/view/databinding/ViewFragmentSketchPlayBinding;->d:Lcom/zykj/view/databinding/ViewItemSketchPlayBinding;

    .line 166
    .line 167
    iget-object v3, v0, Lcom/zykj/view/databinding/ViewItemSketchPlayBinding;->g:Landroid/widget/TextView;

    .line 168
    .line 169
    const-string v0, "tvSpeedRate"

    .line 170
    .line 171
    invoke-static {v3, v0}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 172
    .line 173
    .line 174
    new-instance v6, Lnb/q;

    .line 175
    .line 176
    invoke-direct {v6, p0}, Lnb/q;-><init>(Lcom/zykj/view/board/play/SketchPlayFragment;)V

    .line 177
    .line 178
    .line 179
    const/4 v7, 0x1

    .line 180
    const/4 v8, 0x0

    .line 181
    const-wide/16 v4, 0x0

    .line 182
    .line 183
    invoke-static/range {v3 .. v8}, Lvb/a;->d(Landroid/view/View;JLandroid/view/View$OnClickListener;ILjava/lang/Object;)V

    .line 184
    .line 185
    .line 186
    iget-object v0, p0, Lcom/zykj/view/board/play/SketchPlayFragment;->o:Lcom/zykj/view/databinding/ViewFragmentSketchPlayBinding;

    .line 187
    .line 188
    if-nez v0, :cond_6

    .line 189
    .line 190
    invoke-static {v2}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 191
    .line 192
    .line 193
    move-object v0, v1

    .line 194
    :cond_6
    iget-object v0, v0, Lcom/zykj/view/databinding/ViewFragmentSketchPlayBinding;->d:Lcom/zykj/view/databinding/ViewItemSketchPlayBinding;

    .line 195
    .line 196
    iget-object v0, v0, Lcom/zykj/view/databinding/ViewItemSketchPlayBinding;->d:Landroid/widget/ImageView;

    .line 197
    .line 198
    new-instance v3, Lnb/r;

    .line 199
    .line 200
    invoke-direct {v3, p0}, Lnb/r;-><init>(Lcom/zykj/view/board/play/SketchPlayFragment;)V

    .line 201
    .line 202
    .line 203
    invoke-virtual {v0, v3}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 204
    .line 205
    .line 206
    iget-object v0, p0, Lcom/zykj/view/board/play/SketchPlayFragment;->o:Lcom/zykj/view/databinding/ViewFragmentSketchPlayBinding;

    .line 207
    .line 208
    if-nez v0, :cond_7

    .line 209
    .line 210
    invoke-static {v2}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 211
    .line 212
    .line 213
    goto :goto_0

    .line 214
    :cond_7
    move-object v1, v0

    .line 215
    :goto_0
    iget-object v0, v1, Lcom/zykj/view/databinding/ViewFragmentSketchPlayBinding;->c:Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 216
    .line 217
    new-instance v1, Lnb/s;

    .line 218
    .line 219
    invoke-direct {v1, p0}, Lnb/s;-><init>(Lcom/zykj/view/board/play/SketchPlayFragment;)V

    .line 220
    .line 221
    .line 222
    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 223
    .line 224
    .line 225
    return-void
.end method

.method public static final k0(Lcom/zykj/view/board/play/SketchPlayFragment;Ljava/lang/Boolean;)V
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
    if-eqz p1, :cond_1

    .line 11
    .line 12
    iget-object p0, p0, Lcom/zykj/view/board/play/SketchPlayFragment;->q:Lhd/a;

    .line 13
    .line 14
    if-eqz p0, :cond_0

    .line 15
    .line 16
    invoke-interface {p0}, Lhd/a;->invoke()Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    :cond_0
    return-void

    .line 20
    :cond_1
    const/4 p1, 0x0

    .line 21
    iput-object p1, p0, Lcom/zykj/view/board/play/SketchPlayFragment;->q:Lhd/a;

    .line 22
    .line 23
    return-void
.end method

.method public static synthetic m0(Lcom/zykj/view/board/play/SketchPlayFragment;Ljava/lang/String;IZLhd/l;Lhd/l;ILjava/lang/Object;)V
    .locals 6

    .line 1
    and-int/lit8 p7, p6, 0x2

    .line 2
    .line 3
    if-eqz p7, :cond_0

    .line 4
    .line 5
    const/4 p2, 0x0

    .line 6
    :cond_0
    move v2, p2

    .line 7
    and-int/lit8 p2, p6, 0x4

    .line 8
    .line 9
    if-eqz p2, :cond_1

    .line 10
    .line 11
    const/4 p3, 0x1

    .line 12
    :cond_1
    move v3, p3

    .line 13
    and-int/lit8 p2, p6, 0x8

    .line 14
    .line 15
    const/4 p3, 0x0

    .line 16
    if-eqz p2, :cond_2

    .line 17
    .line 18
    move-object v4, p3

    .line 19
    goto :goto_0

    .line 20
    :cond_2
    move-object v4, p4

    .line 21
    :goto_0
    and-int/lit8 p2, p6, 0x10

    .line 22
    .line 23
    if-eqz p2, :cond_3

    .line 24
    .line 25
    move-object v5, p3

    .line 26
    :goto_1
    move-object v0, p0

    .line 27
    move-object v1, p1

    .line 28
    goto :goto_2

    .line 29
    :cond_3
    move-object v5, p5

    .line 30
    goto :goto_1

    .line 31
    :goto_2
    invoke-virtual/range {v0 .. v5}, Lcom/zykj/view/board/play/SketchPlayFragment;->l0(Ljava/lang/String;IZLhd/l;Lhd/l;)V

    .line 32
    .line 33
    .line 34
    return-void
.end method

.method public static final n0(Lcom/zykj/view/board/play/SketchPlayFragment;ZLjava/lang/String;ILhd/l;Lhd/l;)Lqc/q;
    .locals 9

    .line 1
    invoke-static {p0}, Landroidx/lifecycle/LifecycleOwnerKt;->getLifecycleScope(Landroidx/lifecycle/LifecycleOwner;)Landroidx/lifecycle/LifecycleCoroutineScope;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    new-instance v1, Lcom/zykj/view/board/play/SketchPlayFragment$play$1$1;

    .line 6
    .line 7
    const/4 v8, 0x0

    .line 8
    move-object v3, p0

    .line 9
    move v2, p1

    .line 10
    move-object v4, p2

    .line 11
    move v5, p3

    .line 12
    move-object v6, p4

    .line 13
    move-object v7, p5

    .line 14
    invoke-direct/range {v1 .. v8}, Lcom/zykj/view/board/play/SketchPlayFragment$play$1$1;-><init>(ZLcom/zykj/view/board/play/SketchPlayFragment;Ljava/lang/String;ILhd/l;Lhd/l;Lvc/c;)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {v0, v1}, Landroidx/lifecycle/LifecycleCoroutineScope;->launchWhenStarted(Lhd/p;)Lkotlinx/coroutines/g;

    .line 18
    .line 19
    .line 20
    sget-object p0, Lqc/q;->a:Lqc/q;

    .line 21
    .line 22
    return-object p0
.end method

.method public static synthetic o(Lcom/zykj/view/board/play/SketchPlayFragment;)Lcom/zykj/view/board/play/SketchPlayFragment$g;
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/zykj/view/board/play/SketchPlayFragment;->o0(Lcom/zykj/view/board/play/SketchPlayFragment;)Lcom/zykj/view/board/play/SketchPlayFragment$g;

    move-result-object p0

    return-object p0
.end method

.method public static final o0(Lcom/zykj/view/board/play/SketchPlayFragment;)Lcom/zykj/view/board/play/SketchPlayFragment$g;
    .locals 1

    .line 1
    new-instance v0, Lcom/zykj/view/board/play/SketchPlayFragment$g;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Lcom/zykj/view/board/play/SketchPlayFragment$g;-><init>(Lcom/zykj/view/board/play/SketchPlayFragment;)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method

.method public static synthetic p(Lcom/zykj/view/board/play/SketchPlayFragment;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/zykj/view/board/play/SketchPlayFragment;->e0(Lcom/zykj/view/board/play/SketchPlayFragment;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic q()Lqc/q;
    .locals 1

    .line 1
    invoke-static {}, Lcom/zykj/view/board/play/SketchPlayFragment;->V()Lqc/q;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic r(Lcom/zykj/view/board/play/SketchPlayFragment;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/zykj/view/board/play/SketchPlayFragment;->d0(Lcom/zykj/view/board/play/SketchPlayFragment;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic r0(Lcom/zykj/view/board/play/SketchPlayFragment;Ljava/lang/String;ZILjava/lang/Object;)V
    .locals 0

    .line 1
    and-int/lit8 p4, p3, 0x1

    .line 2
    .line 3
    if-eqz p4, :cond_0

    .line 4
    .line 5
    sget p1, Lcom/zykj/view/R$string;->progress_content:I

    .line 6
    .line 7
    invoke-virtual {p0, p1}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    const-string p4, "getString(...)"

    .line 12
    .line 13
    invoke-static {p1, p4}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    :cond_0
    and-int/lit8 p3, p3, 0x2

    .line 17
    .line 18
    if-eqz p3, :cond_1

    .line 19
    .line 20
    const/4 p2, 0x0

    .line 21
    :cond_1
    invoke-virtual {p0, p1, p2}, Lcom/zykj/view/board/play/SketchPlayFragment;->q0(Ljava/lang/String;Z)V

    .line 22
    .line 23
    .line 24
    return-void
.end method

.method public static synthetic s(Lcom/zykj/view/board/play/SketchPlayFragment;ZLjava/lang/String;ILhd/l;Lhd/l;)Lqc/q;
    .locals 0

    .line 1
    invoke-static/range {p0 .. p5}, Lcom/zykj/view/board/play/SketchPlayFragment;->n0(Lcom/zykj/view/board/play/SketchPlayFragment;ZLjava/lang/String;ILhd/l;Lhd/l;)Lqc/q;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic t(Lcom/zykj/view/board/play/SketchPlayFragment;Ljava/lang/Boolean;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/zykj/view/board/play/SketchPlayFragment;->k0(Lcom/zykj/view/board/play/SketchPlayFragment;Ljava/lang/Boolean;)V

    return-void
.end method

.method public static synthetic u(Lcom/zykj/view/board/play/SketchPlayFragment;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/zykj/view/board/play/SketchPlayFragment;->i0(Lcom/zykj/view/board/play/SketchPlayFragment;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic v(Lcom/zykj/view/board/play/SketchPlayFragment;Lnb/c0;)Lqc/q;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/zykj/view/board/play/SketchPlayFragment;->g0(Lcom/zykj/view/board/play/SketchPlayFragment;Lnb/c0;)Lqc/q;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic w(Lcom/zykj/view/board/play/SketchPlayFragment;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/zykj/view/board/play/SketchPlayFragment;->b0(Lcom/zykj/view/board/play/SketchPlayFragment;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic x(Lcom/zykj/view/board/play/SketchPlayFragment;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/zykj/view/board/play/SketchPlayFragment;->c0(Lcom/zykj/view/board/play/SketchPlayFragment;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic y(Lcom/zykj/view/board/play/SketchPlayFragment;D)Lqc/q;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lcom/zykj/view/board/play/SketchPlayFragment;->f0(Lcom/zykj/view/board/play/SketchPlayFragment;D)Lqc/q;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic z(Lcom/zykj/view/board/play/SketchPlayFragment;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/zykj/view/board/play/SketchPlayFragment;->h0(Lcom/zykj/view/board/play/SketchPlayFragment;Landroid/view/View;)V

    return-void
.end method


# virtual methods
.method public final R(DZ)V
    .locals 4

    .line 1
    const/4 v0, 0x0

    .line 2
    :try_start_0
    iget-object v1, p0, Lcom/zykj/view/board/play/SketchPlayFragment;->o:Lcom/zykj/view/databinding/ViewFragmentSketchPlayBinding;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 3
    .line 4
    const/4 v2, 0x0

    .line 5
    const-string v3, "mBinding"

    .line 6
    .line 7
    if-nez v1, :cond_0

    .line 8
    .line 9
    :try_start_1
    invoke-static {v3}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    move-object v1, v2

    .line 13
    :cond_0
    iget-object v1, v1, Lcom/zykj/view/databinding/ViewFragmentSketchPlayBinding;->j:Lcom/zykj/merge/sketch/view/MergeSketchPlayView;

    .line 14
    .line 15
    invoke-virtual {v1, p1, p2}, Lcom/zykj/merge/sketch/view/MergeSketchPlayView;->setRate(D)Z

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    if-eqz v1, :cond_2

    .line 20
    .line 21
    iget-object v1, p0, Lcom/zykj/view/board/play/SketchPlayFragment;->o:Lcom/zykj/view/databinding/ViewFragmentSketchPlayBinding;

    .line 22
    .line 23
    if-nez v1, :cond_1

    .line 24
    .line 25
    invoke-static {v3}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_1
    move-object v2, v1

    .line 30
    :goto_0
    iget-object v1, v2, Lcom/zykj/view/databinding/ViewFragmentSketchPlayBinding;->d:Lcom/zykj/view/databinding/ViewItemSketchPlayBinding;

    .line 31
    .line 32
    iget-object v1, v1, Lcom/zykj/view/databinding/ViewItemSketchPlayBinding;->g:Landroid/widget/TextView;

    .line 33
    .line 34
    new-instance v2, Ljava/lang/StringBuilder;

    .line 35
    .line 36
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 37
    .line 38
    .line 39
    invoke-virtual {v2, p1, p2}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    .line 40
    .line 41
    .line 42
    const-string v3, "X"

    .line 43
    .line 44
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 45
    .line 46
    .line 47
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object v2

    .line 51
    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 52
    .line 53
    .line 54
    if-eqz p3, :cond_3

    .line 55
    .line 56
    sget v1, Lcom/zykj/view/R$string;->speed_rate_change:I

    .line 57
    .line 58
    invoke-static {p1, p2}, Ljava/lang/String;->valueOf(D)Ljava/lang/String;

    .line 59
    .line 60
    .line 61
    move-result-object p1

    .line 62
    filled-new-array {p1}, [Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    move-result-object p1

    .line 66
    invoke-virtual {p0, v1, p1}, Landroidx/fragment/app/Fragment;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 67
    .line 68
    .line 69
    move-result-object p1

    .line 70
    new-array p2, v0, [Ljava/lang/Object;

    .line 71
    .line 72
    invoke-static {p1, p2}, Lcom/blankj/utilcode/util/ToastUtils;->showShort(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 73
    .line 74
    .line 75
    return-void

    .line 76
    :cond_2
    if-eqz p3, :cond_3

    .line 77
    .line 78
    sget p1, Lcom/zykj/view/R$string;->micro_lesson_not_support_speed:I

    .line 79
    .line 80
    invoke-virtual {p0, p1}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    .line 81
    .line 82
    .line 83
    move-result-object p1

    .line 84
    new-array p2, v0, [Ljava/lang/Object;

    .line 85
    .line 86
    invoke-static {p1, p2}, Lcom/blankj/utilcode/util/ToastUtils;->showShort(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    .line 87
    .line 88
    .line 89
    return-void

    .line 90
    :catch_0
    if-eqz p3, :cond_3

    .line 91
    .line 92
    sget p1, Lcom/zykj/view/R$string;->device_not_support_speed:I

    .line 93
    .line 94
    invoke-virtual {p0, p1}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    .line 95
    .line 96
    .line 97
    move-result-object p1

    .line 98
    new-array p2, v0, [Ljava/lang/Object;

    .line 99
    .line 100
    invoke-static {p1, p2}, Lcom/blankj/utilcode/util/ToastUtils;->showShort(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 101
    .line 102
    .line 103
    :cond_3
    return-void
.end method

.method public final T()Lcom/zykj/view/board/play/SketchPlayFragment$g;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/view/board/play/SketchPlayFragment;->s:Lqc/d;

    .line 2
    .line 3
    invoke-interface {v0}, Lqc/d;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lcom/zykj/view/board/play/SketchPlayFragment$g;

    .line 8
    .line 9
    return-object v0
.end method

.method public final U(Lnb/a;)V
    .locals 6

    .line 1
    iget-object v0, p0, Lcom/zykj/view/board/play/SketchPlayFragment;->e:Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p1}, Lnb/a;->f()Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    const-string v1, "getString(...)"

    .line 11
    .line 12
    if-eqz v0, :cond_1

    .line 13
    .line 14
    iget-object v0, p0, Lcom/zykj/view/board/play/SketchPlayFragment;->e:Ljava/util/ArrayList;

    .line 15
    .line 16
    new-instance v2, Lnb/g;

    .line 17
    .line 18
    sget v3, Lcom/zykj/view/R$drawable;->icon_play_setting_delete:I

    .line 19
    .line 20
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->requireContext()Landroid/content/Context;

    .line 21
    .line 22
    .line 23
    move-result-object v4

    .line 24
    sget v5, Lcom/zykj/view/R$string;->delete:I

    .line 25
    .line 26
    invoke-virtual {v4, v5}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object v4

    .line 30
    invoke-static {v4, v1}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 31
    .line 32
    .line 33
    invoke-virtual {p1}, Lnb/a;->b()Lhd/a;

    .line 34
    .line 35
    .line 36
    move-result-object v5

    .line 37
    if-nez v5, :cond_0

    .line 38
    .line 39
    new-instance v5, Lnb/t;

    .line 40
    .line 41
    invoke-direct {v5}, Lnb/t;-><init>()V

    .line 42
    .line 43
    .line 44
    :cond_0
    invoke-direct {v2, v3, v4, v5}, Lnb/g;-><init>(ILjava/lang/String;Lhd/a;)V

    .line 45
    .line 46
    .line 47
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 48
    .line 49
    .line 50
    :cond_1
    invoke-virtual {p1}, Lnb/a;->g()Z

    .line 51
    .line 52
    .line 53
    move-result v0

    .line 54
    if-eqz v0, :cond_3

    .line 55
    .line 56
    iget-object v0, p0, Lcom/zykj/view/board/play/SketchPlayFragment;->e:Ljava/util/ArrayList;

    .line 57
    .line 58
    new-instance v2, Lnb/g;

    .line 59
    .line 60
    sget v3, Lcom/zykj/view/R$drawable;->icon_play_setting_record:I

    .line 61
    .line 62
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->requireContext()Landroid/content/Context;

    .line 63
    .line 64
    .line 65
    move-result-object v4

    .line 66
    sget v5, Lcom/zykj/view/R$string;->record:I

    .line 67
    .line 68
    invoke-virtual {v4, v5}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 69
    .line 70
    .line 71
    move-result-object v4

    .line 72
    invoke-static {v4, v1}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 73
    .line 74
    .line 75
    invoke-virtual {p1}, Lnb/a;->c()Lhd/a;

    .line 76
    .line 77
    .line 78
    move-result-object v1

    .line 79
    if-nez v1, :cond_2

    .line 80
    .line 81
    new-instance v1, Lnb/u;

    .line 82
    .line 83
    invoke-direct {v1}, Lnb/u;-><init>()V

    .line 84
    .line 85
    .line 86
    :cond_2
    invoke-direct {v2, v3, v4, v1}, Lnb/g;-><init>(ILjava/lang/String;Lhd/a;)V

    .line 87
    .line 88
    .line 89
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 90
    .line 91
    .line 92
    :cond_3
    iget-object v0, p0, Lcom/zykj/view/board/play/SketchPlayFragment;->e:Ljava/util/ArrayList;

    .line 93
    .line 94
    invoke-virtual {p1}, Lnb/a;->d()Ljava/util/List;

    .line 95
    .line 96
    .line 97
    move-result-object v1

    .line 98
    check-cast v1, Ljava/util/Collection;

    .line 99
    .line 100
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 101
    .line 102
    .line 103
    iget-object v0, p0, Lcom/zykj/view/board/play/SketchPlayFragment;->o:Lcom/zykj/view/databinding/ViewFragmentSketchPlayBinding;

    .line 104
    .line 105
    const/4 v1, 0x0

    .line 106
    const-string v2, "mBinding"

    .line 107
    .line 108
    if-nez v0, :cond_4

    .line 109
    .line 110
    invoke-static {v2}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 111
    .line 112
    .line 113
    move-object v0, v1

    .line 114
    :cond_4
    iget-object v0, v0, Lcom/zykj/view/databinding/ViewFragmentSketchPlayBinding;->g:Landroid/widget/ImageView;

    .line 115
    .line 116
    iget-object v3, p0, Lcom/zykj/view/board/play/SketchPlayFragment;->e:Ljava/util/ArrayList;

    .line 117
    .line 118
    invoke-interface {v3}, Ljava/util/Collection;->isEmpty()Z

    .line 119
    .line 120
    .line 121
    move-result v3

    .line 122
    const/16 v4, 0x8

    .line 123
    .line 124
    const/4 v5, 0x0

    .line 125
    if-nez v3, :cond_5

    .line 126
    .line 127
    move v3, v5

    .line 128
    goto :goto_0

    .line 129
    :cond_5
    move v3, v4

    .line 130
    :goto_0
    invoke-virtual {v0, v3}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 131
    .line 132
    .line 133
    iget-object v0, p0, Lcom/zykj/view/board/play/SketchPlayFragment;->o:Lcom/zykj/view/databinding/ViewFragmentSketchPlayBinding;

    .line 134
    .line 135
    if-nez v0, :cond_6

    .line 136
    .line 137
    invoke-static {v2}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 138
    .line 139
    .line 140
    goto :goto_1

    .line 141
    :cond_6
    move-object v1, v0

    .line 142
    :goto_1
    iget-object v0, v1, Lcom/zykj/view/databinding/ViewFragmentSketchPlayBinding;->e:Landroid/widget/ImageView;

    .line 143
    .line 144
    invoke-virtual {p1}, Lnb/a;->e()Z

    .line 145
    .line 146
    .line 147
    move-result p1

    .line 148
    if-eqz p1, :cond_7

    .line 149
    .line 150
    move v4, v5

    .line 151
    :cond_7
    invoke-virtual {v0, v4}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 152
    .line 153
    .line 154
    return-void
.end method

.method public final X()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/view/board/play/SketchPlayFragment;->u:Landroid/app/ProgressDialog;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, Landroid/app/Dialog;->dismiss()V

    .line 6
    .line 7
    .line 8
    :cond_0
    const/4 v0, 0x0

    .line 9
    iput-object v0, p0, Lcom/zykj/view/board/play/SketchPlayFragment;->u:Landroid/app/ProgressDialog;

    .line 10
    .line 11
    return-void
.end method

.method public final Y()V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/zykj/view/board/play/SketchPlayFragment;->o:Lcom/zykj/view/databinding/ViewFragmentSketchPlayBinding;

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
    iget-object v0, v0, Lcom/zykj/view/databinding/ViewFragmentSketchPlayBinding;->d:Lcom/zykj/view/databinding/ViewItemSketchPlayBinding;

    .line 13
    .line 14
    iget-object v0, v0, Lcom/zykj/view/databinding/ViewItemSketchPlayBinding;->c:Landroidx/constraintlayout/widget/Group;

    .line 15
    .line 16
    const-string v3, "groupSeekBar"

    .line 17
    .line 18
    invoke-static {v0, v3}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    const/16 v3, 0x8

    .line 22
    .line 23
    invoke-virtual {v0, v3}, Landroid/view/View;->setVisibility(I)V

    .line 24
    .line 25
    .line 26
    iget-object v0, p0, Lcom/zykj/view/board/play/SketchPlayFragment;->f:Lnb/h;

    .line 27
    .line 28
    invoke-virtual {v0}, Lnb/h;->e()Z

    .line 29
    .line 30
    .line 31
    move-result v0

    .line 32
    if-eqz v0, :cond_2

    .line 33
    .line 34
    iget-object v0, p0, Lcom/zykj/view/board/play/SketchPlayFragment;->o:Lcom/zykj/view/databinding/ViewFragmentSketchPlayBinding;

    .line 35
    .line 36
    if-nez v0, :cond_1

    .line 37
    .line 38
    invoke-static {v2}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 39
    .line 40
    .line 41
    goto :goto_0

    .line 42
    :cond_1
    move-object v1, v0

    .line 43
    :goto_0
    iget-object v0, v1, Lcom/zykj/view/databinding/ViewFragmentSketchPlayBinding;->d:Lcom/zykj/view/databinding/ViewItemSketchPlayBinding;

    .line 44
    .line 45
    iget-object v0, v0, Lcom/zykj/view/databinding/ViewItemSketchPlayBinding;->d:Landroid/widget/ImageView;

    .line 46
    .line 47
    const-string v1, "ivFullscreen"

    .line 48
    .line 49
    invoke-static {v0, v1}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 50
    .line 51
    .line 52
    invoke-virtual {v0, v3}, Landroid/view/View;->setVisibility(I)V

    .line 53
    .line 54
    .line 55
    :cond_2
    return-void
.end method

.method public final Z(I)V
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/zykj/view/board/play/SketchPlayFragment;->o:Lcom/zykj/view/databinding/ViewFragmentSketchPlayBinding;

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
    iget-object v0, v0, Lcom/zykj/view/databinding/ViewFragmentSketchPlayBinding;->d:Lcom/zykj/view/databinding/ViewItemSketchPlayBinding;

    .line 13
    .line 14
    iget-object v0, v0, Lcom/zykj/view/databinding/ViewItemSketchPlayBinding;->f:Landroid/widget/SeekBar;

    .line 15
    .line 16
    iget v3, p0, Lcom/zykj/view/board/play/SketchPlayFragment;->j:I

    .line 17
    .line 18
    invoke-virtual {v0, v3}, Landroid/widget/ProgressBar;->setMax(I)V

    .line 19
    .line 20
    .line 21
    iget-object v0, p0, Lcom/zykj/view/board/play/SketchPlayFragment;->o:Lcom/zykj/view/databinding/ViewFragmentSketchPlayBinding;

    .line 22
    .line 23
    if-nez v0, :cond_1

    .line 24
    .line 25
    invoke-static {v2}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    move-object v0, v1

    .line 29
    :cond_1
    iget-object v0, v0, Lcom/zykj/view/databinding/ViewFragmentSketchPlayBinding;->d:Lcom/zykj/view/databinding/ViewItemSketchPlayBinding;

    .line 30
    .line 31
    iget-object v0, v0, Lcom/zykj/view/databinding/ViewItemSketchPlayBinding;->f:Landroid/widget/SeekBar;

    .line 32
    .line 33
    invoke-virtual {v0, p1}, Landroid/widget/ProgressBar;->setProgress(I)V

    .line 34
    .line 35
    .line 36
    sget-object p1, Lcom/zykj/view/board/play/SketchPlayFragment;->v:Lcom/zykj/view/board/play/SketchPlayFragment$a;

    .line 37
    .line 38
    iget v0, p0, Lcom/zykj/view/board/play/SketchPlayFragment;->j:I

    .line 39
    .line 40
    int-to-long v3, v0

    .line 41
    invoke-virtual {p1, v3, v4}, Lcom/zykj/view/board/play/SketchPlayFragment$a;->a(J)Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object p1

    .line 45
    iput-object p1, p0, Lcom/zykj/view/board/play/SketchPlayFragment;->i:Ljava/lang/String;

    .line 46
    .line 47
    iget-object p1, p0, Lcom/zykj/view/board/play/SketchPlayFragment;->o:Lcom/zykj/view/databinding/ViewFragmentSketchPlayBinding;

    .line 48
    .line 49
    if-nez p1, :cond_2

    .line 50
    .line 51
    invoke-static {v2}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 52
    .line 53
    .line 54
    move-object p1, v1

    .line 55
    :cond_2
    iget-object p1, p1, Lcom/zykj/view/databinding/ViewFragmentSketchPlayBinding;->d:Lcom/zykj/view/databinding/ViewItemSketchPlayBinding;

    .line 56
    .line 57
    iget-object p1, p1, Lcom/zykj/view/databinding/ViewItemSketchPlayBinding;->h:Landroid/widget/TextView;

    .line 58
    .line 59
    iget-object v0, p0, Lcom/zykj/view/board/play/SketchPlayFragment;->h:Ljava/lang/String;

    .line 60
    .line 61
    iget-object v3, p0, Lcom/zykj/view/board/play/SketchPlayFragment;->i:Ljava/lang/String;

    .line 62
    .line 63
    new-instance v4, Ljava/lang/StringBuilder;

    .line 64
    .line 65
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 66
    .line 67
    .line 68
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 69
    .line 70
    .line 71
    const-string v0, "/"

    .line 72
    .line 73
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 74
    .line 75
    .line 76
    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 77
    .line 78
    .line 79
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 80
    .line 81
    .line 82
    move-result-object v0

    .line 83
    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 84
    .line 85
    .line 86
    iget-object p1, p0, Lcom/zykj/view/board/play/SketchPlayFragment;->o:Lcom/zykj/view/databinding/ViewFragmentSketchPlayBinding;

    .line 87
    .line 88
    if-nez p1, :cond_3

    .line 89
    .line 90
    invoke-static {v2}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 91
    .line 92
    .line 93
    move-object p1, v1

    .line 94
    :cond_3
    iget-object p1, p1, Lcom/zykj/view/databinding/ViewFragmentSketchPlayBinding;->j:Lcom/zykj/merge/sketch/view/MergeSketchPlayView;

    .line 95
    .line 96
    invoke-virtual {p0}, Lcom/zykj/view/board/play/SketchPlayFragment;->T()Lcom/zykj/view/board/play/SketchPlayFragment$g;

    .line 97
    .line 98
    .line 99
    move-result-object v0

    .line 100
    invoke-virtual {p1, v0}, Lcom/zykj/merge/sketch/view/MergeSketchPlayView;->removePlayActionListener(Lcom/zykj/merge/sketch/listener/PlayStatusListener;)V

    .line 101
    .line 102
    .line 103
    iget-object p1, p0, Lcom/zykj/view/board/play/SketchPlayFragment;->o:Lcom/zykj/view/databinding/ViewFragmentSketchPlayBinding;

    .line 104
    .line 105
    if-nez p1, :cond_4

    .line 106
    .line 107
    invoke-static {v2}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 108
    .line 109
    .line 110
    move-object p1, v1

    .line 111
    :cond_4
    iget-object p1, p1, Lcom/zykj/view/databinding/ViewFragmentSketchPlayBinding;->j:Lcom/zykj/merge/sketch/view/MergeSketchPlayView;

    .line 112
    .line 113
    invoke-virtual {p0}, Lcom/zykj/view/board/play/SketchPlayFragment;->T()Lcom/zykj/view/board/play/SketchPlayFragment$g;

    .line 114
    .line 115
    .line 116
    move-result-object v0

    .line 117
    invoke-virtual {p1, v0}, Lcom/zykj/merge/sketch/view/MergeSketchPlayView;->addPlayActionListener(Lcom/zykj/merge/sketch/listener/PlayStatusListener;)V

    .line 118
    .line 119
    .line 120
    const/4 p1, 0x1

    .line 121
    iput-boolean p1, p0, Lcom/zykj/view/board/play/SketchPlayFragment;->g:Z

    .line 122
    .line 123
    iget-object p1, p0, Lcom/zykj/view/board/play/SketchPlayFragment;->o:Lcom/zykj/view/databinding/ViewFragmentSketchPlayBinding;

    .line 124
    .line 125
    if-nez p1, :cond_5

    .line 126
    .line 127
    invoke-static {v2}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 128
    .line 129
    .line 130
    goto :goto_0

    .line 131
    :cond_5
    move-object v1, p1

    .line 132
    :goto_0
    iget-object p1, v1, Lcom/zykj/view/databinding/ViewFragmentSketchPlayBinding;->d:Lcom/zykj/view/databinding/ViewItemSketchPlayBinding;

    .line 133
    .line 134
    iget-object p1, p1, Lcom/zykj/view/databinding/ViewItemSketchPlayBinding;->e:Landroid/widget/ImageView;

    .line 135
    .line 136
    sget v0, Lcom/zykj/view/R$drawable;->selector_btn_music_play:I

    .line 137
    .line 138
    invoke-virtual {p1, v0}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 139
    .line 140
    .line 141
    invoke-virtual {p0}, Lcom/zykj/view/board/play/SketchPlayFragment;->s0()V

    .line 142
    .line 143
    .line 144
    return-void
.end method

.method public final a0()V
    .locals 11

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 3
    .line 4
    .line 5
    move-result-object v0

    .line 6
    iget-object v1, p0, Lcom/zykj/view/board/play/SketchPlayFragment;->o:Lcom/zykj/view/databinding/ViewFragmentSketchPlayBinding;

    .line 7
    .line 8
    const-string v2, "mBinding"

    .line 9
    .line 10
    const/4 v3, 0x0

    .line 11
    if-nez v1, :cond_0

    .line 12
    .line 13
    invoke-static {v2}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    move-object v1, v3

    .line 17
    :cond_0
    iget-object v1, v1, Lcom/zykj/view/databinding/ViewFragmentSketchPlayBinding;->j:Lcom/zykj/merge/sketch/view/MergeSketchPlayView;

    .line 18
    .line 19
    new-instance v4, Lcom/zykj/view/board/play/SketchPlayFragment$c;

    .line 20
    .line 21
    invoke-direct {v4, p0}, Lcom/zykj/view/board/play/SketchPlayFragment$c;-><init>(Lcom/zykj/view/board/play/SketchPlayFragment;)V

    .line 22
    .line 23
    .line 24
    invoke-virtual {v1, v4}, Lcom/zykj/merge/sketch/view/MergeSketchPlayView;->setAreaMoveListener(Lma/d;)V

    .line 25
    .line 26
    .line 27
    iget-object v1, p0, Lcom/zykj/view/board/play/SketchPlayFragment;->o:Lcom/zykj/view/databinding/ViewFragmentSketchPlayBinding;

    .line 28
    .line 29
    if-nez v1, :cond_1

    .line 30
    .line 31
    invoke-static {v2}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 32
    .line 33
    .line 34
    move-object v1, v3

    .line 35
    :cond_1
    iget-object v1, v1, Lcom/zykj/view/databinding/ViewFragmentSketchPlayBinding;->j:Lcom/zykj/merge/sketch/view/MergeSketchPlayView;

    .line 36
    .line 37
    invoke-virtual {v1}, Lcom/zykj/merge/sketch/view/MergeSketchPlayView;->getMoveMaxWidthTimes()I

    .line 38
    .line 39
    .line 40
    move-result v1

    .line 41
    iget-object v4, p0, Lcom/zykj/view/board/play/SketchPlayFragment;->o:Lcom/zykj/view/databinding/ViewFragmentSketchPlayBinding;

    .line 42
    .line 43
    if-nez v4, :cond_2

    .line 44
    .line 45
    invoke-static {v2}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 46
    .line 47
    .line 48
    move-object v4, v3

    .line 49
    :cond_2
    iget-object v4, v4, Lcom/zykj/view/databinding/ViewFragmentSketchPlayBinding;->j:Lcom/zykj/merge/sketch/view/MergeSketchPlayView;

    .line 50
    .line 51
    invoke-virtual {v4}, Lcom/zykj/merge/sketch/view/MergeSketchPlayView;->getMoveMaxHeightTimes()I

    .line 52
    .line 53
    .line 54
    move-result v4

    .line 55
    const/16 v5, 0x8

    .line 56
    .line 57
    const/high16 v6, 0x3f800000    # 1.0f

    .line 58
    .line 59
    const/4 v7, 0x0

    .line 60
    const/4 v8, 0x1

    .line 61
    if-le v1, v8, :cond_a

    .line 62
    .line 63
    iget-object v9, p0, Lcom/zykj/view/board/play/SketchPlayFragment;->d:Lnb/a;

    .line 64
    .line 65
    if-eqz v9, :cond_5

    .line 66
    .line 67
    invoke-virtual {v9}, Lnb/a;->i()Z

    .line 68
    .line 69
    .line 70
    move-result v9

    .line 71
    if-ne v9, v8, :cond_5

    .line 72
    .line 73
    iget-object v9, p0, Lcom/zykj/view/board/play/SketchPlayFragment;->o:Lcom/zykj/view/databinding/ViewFragmentSketchPlayBinding;

    .line 74
    .line 75
    if-nez v9, :cond_3

    .line 76
    .line 77
    invoke-static {v2}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 78
    .line 79
    .line 80
    move-object v9, v3

    .line 81
    :cond_3
    iget-object v9, v9, Lcom/zykj/view/databinding/ViewFragmentSketchPlayBinding;->j:Lcom/zykj/merge/sketch/view/MergeSketchPlayView;

    .line 82
    .line 83
    invoke-virtual {v9}, Lcom/zykj/merge/sketch/view/MergeSketchPlayView;->areaMoveStart()V

    .line 84
    .line 85
    .line 86
    iget-object v9, p0, Lcom/zykj/view/board/play/SketchPlayFragment;->o:Lcom/zykj/view/databinding/ViewFragmentSketchPlayBinding;

    .line 87
    .line 88
    if-nez v9, :cond_4

    .line 89
    .line 90
    invoke-static {v2}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 91
    .line 92
    .line 93
    move-object v9, v3

    .line 94
    :cond_4
    iget-object v9, v9, Lcom/zykj/view/databinding/ViewFragmentSketchPlayBinding;->j:Lcom/zykj/merge/sketch/view/MergeSketchPlayView;

    .line 95
    .line 96
    const/4 v10, 0x2

    .line 97
    invoke-static {v9, v0, v3, v10, v3}, Lcom/zykj/merge/sketch/view/MergeSketchPlayView;->areaMoveEnd$default(Lcom/zykj/merge/sketch/view/MergeSketchPlayView;Ljava/lang/Float;Ljava/lang/Float;ILjava/lang/Object;)V

    .line 98
    .line 99
    .line 100
    :cond_5
    iget-object v9, p0, Lcom/zykj/view/board/play/SketchPlayFragment;->o:Lcom/zykj/view/databinding/ViewFragmentSketchPlayBinding;

    .line 101
    .line 102
    if-nez v9, :cond_6

    .line 103
    .line 104
    invoke-static {v2}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 105
    .line 106
    .line 107
    move-object v9, v3

    .line 108
    :cond_6
    iget-object v9, v9, Lcom/zykj/view/databinding/ViewFragmentSketchPlayBinding;->h:Lcom/zykj/view/widget/SketchProgressView;

    .line 109
    .line 110
    invoke-virtual {v9, v7}, Landroid/view/View;->setVisibility(I)V

    .line 111
    .line 112
    .line 113
    iget-object v9, p0, Lcom/zykj/view/board/play/SketchPlayFragment;->o:Lcom/zykj/view/databinding/ViewFragmentSketchPlayBinding;

    .line 114
    .line 115
    if-nez v9, :cond_7

    .line 116
    .line 117
    invoke-static {v2}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 118
    .line 119
    .line 120
    move-object v9, v3

    .line 121
    :cond_7
    iget-object v9, v9, Lcom/zykj/view/databinding/ViewFragmentSketchPlayBinding;->h:Lcom/zykj/view/widget/SketchProgressView;

    .line 122
    .line 123
    int-to-float v1, v1

    .line 124
    div-float v1, v6, v1

    .line 125
    .line 126
    invoke-virtual {v9, v1}, Lcom/zykj/view/widget/SketchProgressView;->setThumbTime(F)V

    .line 127
    .line 128
    .line 129
    iget-object v1, p0, Lcom/zykj/view/board/play/SketchPlayFragment;->o:Lcom/zykj/view/databinding/ViewFragmentSketchPlayBinding;

    .line 130
    .line 131
    if-nez v1, :cond_8

    .line 132
    .line 133
    invoke-static {v2}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 134
    .line 135
    .line 136
    move-object v1, v3

    .line 137
    :cond_8
    iget-object v1, v1, Lcom/zykj/view/databinding/ViewFragmentSketchPlayBinding;->h:Lcom/zykj/view/widget/SketchProgressView;

    .line 138
    .line 139
    iget-object v9, p0, Lcom/zykj/view/board/play/SketchPlayFragment;->o:Lcom/zykj/view/databinding/ViewFragmentSketchPlayBinding;

    .line 140
    .line 141
    if-nez v9, :cond_9

    .line 142
    .line 143
    invoke-static {v2}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 144
    .line 145
    .line 146
    move-object v9, v3

    .line 147
    :cond_9
    iget-object v9, v9, Lcom/zykj/view/databinding/ViewFragmentSketchPlayBinding;->j:Lcom/zykj/merge/sketch/view/MergeSketchPlayView;

    .line 148
    .line 149
    invoke-virtual {v9}, Lcom/zykj/merge/sketch/view/MergeSketchPlayView;->getMoveHorizontalProgress()F

    .line 150
    .line 151
    .line 152
    move-result v9

    .line 153
    invoke-virtual {v1, v9}, Lcom/zykj/view/widget/SketchProgressView;->setProgress(F)V

    .line 154
    .line 155
    .line 156
    goto :goto_0

    .line 157
    :cond_a
    iget-object v1, p0, Lcom/zykj/view/board/play/SketchPlayFragment;->o:Lcom/zykj/view/databinding/ViewFragmentSketchPlayBinding;

    .line 158
    .line 159
    if-nez v1, :cond_b

    .line 160
    .line 161
    invoke-static {v2}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 162
    .line 163
    .line 164
    move-object v1, v3

    .line 165
    :cond_b
    iget-object v1, v1, Lcom/zykj/view/databinding/ViewFragmentSketchPlayBinding;->h:Lcom/zykj/view/widget/SketchProgressView;

    .line 166
    .line 167
    invoke-virtual {v1, v5}, Landroid/view/View;->setVisibility(I)V

    .line 168
    .line 169
    .line 170
    :goto_0
    if-le v4, v8, :cond_13

    .line 171
    .line 172
    iget-object v1, p0, Lcom/zykj/view/board/play/SketchPlayFragment;->d:Lnb/a;

    .line 173
    .line 174
    if-eqz v1, :cond_e

    .line 175
    .line 176
    invoke-virtual {v1}, Lnb/a;->i()Z

    .line 177
    .line 178
    .line 179
    move-result v1

    .line 180
    if-ne v1, v8, :cond_e

    .line 181
    .line 182
    iget-object v1, p0, Lcom/zykj/view/board/play/SketchPlayFragment;->o:Lcom/zykj/view/databinding/ViewFragmentSketchPlayBinding;

    .line 183
    .line 184
    if-nez v1, :cond_c

    .line 185
    .line 186
    invoke-static {v2}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 187
    .line 188
    .line 189
    move-object v1, v3

    .line 190
    :cond_c
    iget-object v1, v1, Lcom/zykj/view/databinding/ViewFragmentSketchPlayBinding;->j:Lcom/zykj/merge/sketch/view/MergeSketchPlayView;

    .line 191
    .line 192
    invoke-virtual {v1}, Lcom/zykj/merge/sketch/view/MergeSketchPlayView;->areaMoveStart()V

    .line 193
    .line 194
    .line 195
    iget-object v1, p0, Lcom/zykj/view/board/play/SketchPlayFragment;->o:Lcom/zykj/view/databinding/ViewFragmentSketchPlayBinding;

    .line 196
    .line 197
    if-nez v1, :cond_d

    .line 198
    .line 199
    invoke-static {v2}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 200
    .line 201
    .line 202
    move-object v1, v3

    .line 203
    :cond_d
    iget-object v1, v1, Lcom/zykj/view/databinding/ViewFragmentSketchPlayBinding;->j:Lcom/zykj/merge/sketch/view/MergeSketchPlayView;

    .line 204
    .line 205
    invoke-static {v1, v3, v0, v8, v3}, Lcom/zykj/merge/sketch/view/MergeSketchPlayView;->areaMoveEnd$default(Lcom/zykj/merge/sketch/view/MergeSketchPlayView;Ljava/lang/Float;Ljava/lang/Float;ILjava/lang/Object;)V

    .line 206
    .line 207
    .line 208
    :cond_e
    iget-object v0, p0, Lcom/zykj/view/board/play/SketchPlayFragment;->o:Lcom/zykj/view/databinding/ViewFragmentSketchPlayBinding;

    .line 209
    .line 210
    if-nez v0, :cond_f

    .line 211
    .line 212
    invoke-static {v2}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 213
    .line 214
    .line 215
    move-object v0, v3

    .line 216
    :cond_f
    iget-object v0, v0, Lcom/zykj/view/databinding/ViewFragmentSketchPlayBinding;->i:Lcom/zykj/view/widget/SketchProgressView;

    .line 217
    .line 218
    invoke-virtual {v0, v7}, Landroid/view/View;->setVisibility(I)V

    .line 219
    .line 220
    .line 221
    iget-object v0, p0, Lcom/zykj/view/board/play/SketchPlayFragment;->o:Lcom/zykj/view/databinding/ViewFragmentSketchPlayBinding;

    .line 222
    .line 223
    if-nez v0, :cond_10

    .line 224
    .line 225
    invoke-static {v2}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 226
    .line 227
    .line 228
    move-object v0, v3

    .line 229
    :cond_10
    iget-object v0, v0, Lcom/zykj/view/databinding/ViewFragmentSketchPlayBinding;->i:Lcom/zykj/view/widget/SketchProgressView;

    .line 230
    .line 231
    int-to-float v1, v4

    .line 232
    div-float/2addr v6, v1

    .line 233
    invoke-virtual {v0, v6}, Lcom/zykj/view/widget/SketchProgressView;->setThumbTime(F)V

    .line 234
    .line 235
    .line 236
    iget-object v0, p0, Lcom/zykj/view/board/play/SketchPlayFragment;->o:Lcom/zykj/view/databinding/ViewFragmentSketchPlayBinding;

    .line 237
    .line 238
    if-nez v0, :cond_11

    .line 239
    .line 240
    invoke-static {v2}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 241
    .line 242
    .line 243
    move-object v0, v3

    .line 244
    :cond_11
    iget-object v0, v0, Lcom/zykj/view/databinding/ViewFragmentSketchPlayBinding;->i:Lcom/zykj/view/widget/SketchProgressView;

    .line 245
    .line 246
    iget-object v1, p0, Lcom/zykj/view/board/play/SketchPlayFragment;->o:Lcom/zykj/view/databinding/ViewFragmentSketchPlayBinding;

    .line 247
    .line 248
    if-nez v1, :cond_12

    .line 249
    .line 250
    invoke-static {v2}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 251
    .line 252
    .line 253
    move-object v1, v3

    .line 254
    :cond_12
    iget-object v1, v1, Lcom/zykj/view/databinding/ViewFragmentSketchPlayBinding;->j:Lcom/zykj/merge/sketch/view/MergeSketchPlayView;

    .line 255
    .line 256
    invoke-virtual {v1}, Lcom/zykj/merge/sketch/view/MergeSketchPlayView;->getMoveVerticalProgress()F

    .line 257
    .line 258
    .line 259
    move-result v1

    .line 260
    invoke-virtual {v0, v1}, Lcom/zykj/view/widget/SketchProgressView;->setProgress(F)V

    .line 261
    .line 262
    .line 263
    goto :goto_1

    .line 264
    :cond_13
    iget-object v0, p0, Lcom/zykj/view/board/play/SketchPlayFragment;->o:Lcom/zykj/view/databinding/ViewFragmentSketchPlayBinding;

    .line 265
    .line 266
    if-nez v0, :cond_14

    .line 267
    .line 268
    invoke-static {v2}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 269
    .line 270
    .line 271
    move-object v0, v3

    .line 272
    :cond_14
    iget-object v0, v0, Lcom/zykj/view/databinding/ViewFragmentSketchPlayBinding;->i:Lcom/zykj/view/widget/SketchProgressView;

    .line 273
    .line 274
    invoke-virtual {v0, v5}, Landroid/view/View;->setVisibility(I)V

    .line 275
    .line 276
    .line 277
    :goto_1
    iget-object v0, p0, Lcom/zykj/view/board/play/SketchPlayFragment;->o:Lcom/zykj/view/databinding/ViewFragmentSketchPlayBinding;

    .line 278
    .line 279
    if-nez v0, :cond_15

    .line 280
    .line 281
    invoke-static {v2}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 282
    .line 283
    .line 284
    move-object v0, v3

    .line 285
    :cond_15
    iget-object v0, v0, Lcom/zykj/view/databinding/ViewFragmentSketchPlayBinding;->h:Lcom/zykj/view/widget/SketchProgressView;

    .line 286
    .line 287
    new-instance v1, Lcom/zykj/view/board/play/SketchPlayFragment$d;

    .line 288
    .line 289
    invoke-direct {v1, p0}, Lcom/zykj/view/board/play/SketchPlayFragment$d;-><init>(Lcom/zykj/view/board/play/SketchPlayFragment;)V

    .line 290
    .line 291
    .line 292
    invoke-virtual {v0, v1}, Lcom/zykj/view/widget/SketchProgressView;->setProgressListener(Lcom/zykj/view/widget/SketchProgressView$b;)V

    .line 293
    .line 294
    .line 295
    iget-object v0, p0, Lcom/zykj/view/board/play/SketchPlayFragment;->o:Lcom/zykj/view/databinding/ViewFragmentSketchPlayBinding;

    .line 296
    .line 297
    if-nez v0, :cond_16

    .line 298
    .line 299
    invoke-static {v2}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 300
    .line 301
    .line 302
    goto :goto_2

    .line 303
    :cond_16
    move-object v3, v0

    .line 304
    :goto_2
    iget-object v0, v3, Lcom/zykj/view/databinding/ViewFragmentSketchPlayBinding;->i:Lcom/zykj/view/widget/SketchProgressView;

    .line 305
    .line 306
    new-instance v1, Lcom/zykj/view/board/play/SketchPlayFragment$e;

    .line 307
    .line 308
    invoke-direct {v1, p0}, Lcom/zykj/view/board/play/SketchPlayFragment$e;-><init>(Lcom/zykj/view/board/play/SketchPlayFragment;)V

    .line 309
    .line 310
    .line 311
    invoke-virtual {v0, v1}, Lcom/zykj/view/widget/SketchProgressView;->setProgressListener(Lcom/zykj/view/widget/SketchProgressView$b;)V

    .line 312
    .line 313
    .line 314
    return-void
.end method

.method public final j0()V
    .locals 6

    .line 1
    iget-object v0, p0, Lcom/zykj/view/board/play/SketchPlayFragment;->o:Lcom/zykj/view/databinding/ViewFragmentSketchPlayBinding;

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
    iget-object v0, v0, Lcom/zykj/view/databinding/ViewFragmentSketchPlayBinding;->j:Lcom/zykj/merge/sketch/view/MergeSketchPlayView;

    .line 13
    .line 14
    invoke-virtual {v0}, Lcom/zykj/merge/sketch/view/MergeSketchPlayView;->status()Lcom/zykj/merge/sketch/constant/PlayStatus;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    if-nez v0, :cond_1

    .line 19
    .line 20
    const/4 v0, -0x1

    .line 21
    goto :goto_0

    .line 22
    :cond_1
    sget-object v3, Lcom/zykj/view/board/play/SketchPlayFragment$b;->a:[I

    .line 23
    .line 24
    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    aget v0, v3, v0

    .line 29
    .line 30
    :goto_0
    const/4 v3, 0x0

    .line 31
    const/4 v4, 0x1

    .line 32
    if-eq v0, v4, :cond_9

    .line 33
    .line 34
    const/4 v5, 0x2

    .line 35
    if-eq v0, v5, :cond_6

    .line 36
    .line 37
    const/4 v3, 0x3

    .line 38
    if-eq v0, v3, :cond_4

    .line 39
    .line 40
    const/4 v3, 0x4

    .line 41
    if-eq v0, v3, :cond_2

    .line 42
    .line 43
    return-void

    .line 44
    :cond_2
    iput-boolean v4, p0, Lcom/zykj/view/board/play/SketchPlayFragment;->k:Z

    .line 45
    .line 46
    invoke-virtual {p0}, Lcom/zykj/view/board/play/SketchPlayFragment;->u0()V

    .line 47
    .line 48
    .line 49
    iget-object v0, p0, Lcom/zykj/view/board/play/SketchPlayFragment;->o:Lcom/zykj/view/databinding/ViewFragmentSketchPlayBinding;

    .line 50
    .line 51
    if-nez v0, :cond_3

    .line 52
    .line 53
    invoke-static {v2}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 54
    .line 55
    .line 56
    goto :goto_1

    .line 57
    :cond_3
    move-object v1, v0

    .line 58
    :goto_1
    iget-object v0, v1, Lcom/zykj/view/databinding/ViewFragmentSketchPlayBinding;->d:Lcom/zykj/view/databinding/ViewItemSketchPlayBinding;

    .line 59
    .line 60
    iget-object v0, v0, Lcom/zykj/view/databinding/ViewItemSketchPlayBinding;->e:Landroid/widget/ImageView;

    .line 61
    .line 62
    sget v1, Lcom/zykj/view/R$drawable;->icon_record_start:I

    .line 63
    .line 64
    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 65
    .line 66
    .line 67
    return-void

    .line 68
    :cond_4
    iput-boolean v4, p0, Lcom/zykj/view/board/play/SketchPlayFragment;->k:Z

    .line 69
    .line 70
    invoke-virtual {p0}, Lcom/zykj/view/board/play/SketchPlayFragment;->t0()V

    .line 71
    .line 72
    .line 73
    iget-object v0, p0, Lcom/zykj/view/board/play/SketchPlayFragment;->o:Lcom/zykj/view/databinding/ViewFragmentSketchPlayBinding;

    .line 74
    .line 75
    if-nez v0, :cond_5

    .line 76
    .line 77
    invoke-static {v2}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 78
    .line 79
    .line 80
    goto :goto_2

    .line 81
    :cond_5
    move-object v1, v0

    .line 82
    :goto_2
    iget-object v0, v1, Lcom/zykj/view/databinding/ViewFragmentSketchPlayBinding;->d:Lcom/zykj/view/databinding/ViewItemSketchPlayBinding;

    .line 83
    .line 84
    iget-object v0, v0, Lcom/zykj/view/databinding/ViewItemSketchPlayBinding;->e:Landroid/widget/ImageView;

    .line 85
    .line 86
    sget v1, Lcom/zykj/view/R$drawable;->view_icon_record_stop:I

    .line 87
    .line 88
    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 89
    .line 90
    .line 91
    return-void

    .line 92
    :cond_6
    iput-boolean v3, p0, Lcom/zykj/view/board/play/SketchPlayFragment;->k:Z

    .line 93
    .line 94
    iget-object v0, p0, Lcom/zykj/view/board/play/SketchPlayFragment;->o:Lcom/zykj/view/databinding/ViewFragmentSketchPlayBinding;

    .line 95
    .line 96
    if-nez v0, :cond_7

    .line 97
    .line 98
    invoke-static {v2}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 99
    .line 100
    .line 101
    move-object v0, v1

    .line 102
    :cond_7
    iget-object v0, v0, Lcom/zykj/view/databinding/ViewFragmentSketchPlayBinding;->j:Lcom/zykj/merge/sketch/view/MergeSketchPlayView;

    .line 103
    .line 104
    invoke-virtual {v0}, Lcom/zykj/merge/sketch/view/MergeSketchPlayView;->pause()V

    .line 105
    .line 106
    .line 107
    iget-object v0, p0, Lcom/zykj/view/board/play/SketchPlayFragment;->o:Lcom/zykj/view/databinding/ViewFragmentSketchPlayBinding;

    .line 108
    .line 109
    if-nez v0, :cond_8

    .line 110
    .line 111
    invoke-static {v2}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 112
    .line 113
    .line 114
    goto :goto_3

    .line 115
    :cond_8
    move-object v1, v0

    .line 116
    :goto_3
    iget-object v0, v1, Lcom/zykj/view/databinding/ViewFragmentSketchPlayBinding;->d:Lcom/zykj/view/databinding/ViewItemSketchPlayBinding;

    .line 117
    .line 118
    iget-object v0, v0, Lcom/zykj/view/databinding/ViewItemSketchPlayBinding;->e:Landroid/widget/ImageView;

    .line 119
    .line 120
    sget v1, Lcom/zykj/view/R$drawable;->icon_record_start:I

    .line 121
    .line 122
    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 123
    .line 124
    .line 125
    return-void

    .line 126
    :cond_9
    iput-boolean v3, p0, Lcom/zykj/view/board/play/SketchPlayFragment;->k:Z

    .line 127
    .line 128
    iget-object v0, p0, Lcom/zykj/view/board/play/SketchPlayFragment;->o:Lcom/zykj/view/databinding/ViewFragmentSketchPlayBinding;

    .line 129
    .line 130
    if-nez v0, :cond_a

    .line 131
    .line 132
    invoke-static {v2}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 133
    .line 134
    .line 135
    move-object v0, v1

    .line 136
    :cond_a
    iget-object v0, v0, Lcom/zykj/view/databinding/ViewFragmentSketchPlayBinding;->j:Lcom/zykj/merge/sketch/view/MergeSketchPlayView;

    .line 137
    .line 138
    invoke-virtual {v0}, Lcom/zykj/merge/sketch/view/MergeSketchPlayView;->pause()V

    .line 139
    .line 140
    .line 141
    iget-object v0, p0, Lcom/zykj/view/board/play/SketchPlayFragment;->o:Lcom/zykj/view/databinding/ViewFragmentSketchPlayBinding;

    .line 142
    .line 143
    if-nez v0, :cond_b

    .line 144
    .line 145
    invoke-static {v2}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 146
    .line 147
    .line 148
    goto :goto_4

    .line 149
    :cond_b
    move-object v1, v0

    .line 150
    :goto_4
    iget-object v0, v1, Lcom/zykj/view/databinding/ViewFragmentSketchPlayBinding;->d:Lcom/zykj/view/databinding/ViewItemSketchPlayBinding;

    .line 151
    .line 152
    iget-object v0, v0, Lcom/zykj/view/databinding/ViewItemSketchPlayBinding;->e:Landroid/widget/ImageView;

    .line 153
    .line 154
    sget v1, Lcom/zykj/view/R$drawable;->icon_record_start:I

    .line 155
    .line 156
    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 157
    .line 158
    .line 159
    return-void
.end method

.method public final l0(Ljava/lang/String;IZLhd/l;Lhd/l;)V
    .locals 8

    .line 1
    const-string v0, "path"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance v1, Lnb/j;

    .line 7
    .line 8
    move-object v2, p0

    .line 9
    move-object v4, p1

    .line 10
    move v5, p2

    .line 11
    move v3, p3

    .line 12
    move-object v7, p4

    .line 13
    move-object v6, p5

    .line 14
    invoke-direct/range {v1 .. v7}, Lnb/j;-><init>(Lcom/zykj/view/board/play/SketchPlayFragment;ZLjava/lang/String;ILhd/l;Lhd/l;)V

    .line 15
    .line 16
    .line 17
    iput-object v1, v2, Lcom/zykj/view/board/play/SketchPlayFragment;->q:Lhd/a;

    .line 18
    .line 19
    iget-object p1, v2, Lcom/zykj/view/board/play/SketchPlayFragment;->r:Landroidx/activity/result/ActivityResultLauncher;

    .line 20
    .line 21
    const-string p2, "android.permission.WRITE_EXTERNAL_STORAGE"

    .line 22
    .line 23
    invoke-virtual {p1, p2}, Landroidx/activity/result/ActivityResultLauncher;->launch(Ljava/lang/Object;)V

    .line 24
    .line 25
    .line 26
    return-void
.end method

.method public onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 0

    .line 1
    const-string p3, "inflater"

    .line 2
    .line 3
    invoke-static {p1, p3}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const/4 p3, 0x0

    .line 7
    invoke-static {p1, p2, p3}, Lcom/zykj/view/databinding/ViewFragmentSketchPlayBinding;->a(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/zykj/view/databinding/ViewFragmentSketchPlayBinding;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    const-string p2, "inflate(...)"

    .line 12
    .line 13
    invoke-static {p1, p2}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    iput-object p1, p0, Lcom/zykj/view/board/play/SketchPlayFragment;->o:Lcom/zykj/view/databinding/ViewFragmentSketchPlayBinding;

    .line 17
    .line 18
    if-nez p1, :cond_0

    .line 19
    .line 20
    const-string p1, "mBinding"

    .line 21
    .line 22
    invoke-static {p1}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

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
    invoke-static {p1, p2}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    return-object p1
.end method

.method public onDestroyView()V
    .locals 3

    .line 1
    invoke-virtual {p0}, Lcom/zykj/view/board/play/SketchPlayFragment;->X()V

    .line 2
    .line 3
    .line 4
    iget-boolean v0, p0, Lcom/zykj/view/board/play/SketchPlayFragment;->g:Z

    .line 5
    .line 6
    if-eqz v0, :cond_2

    .line 7
    .line 8
    invoke-virtual {p0}, Lcom/zykj/view/board/play/SketchPlayFragment;->x0()V

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, Lcom/zykj/view/board/play/SketchPlayFragment;->o:Lcom/zykj/view/databinding/ViewFragmentSketchPlayBinding;

    .line 12
    .line 13
    const/4 v1, 0x0

    .line 14
    const-string v2, "mBinding"

    .line 15
    .line 16
    if-nez v0, :cond_0

    .line 17
    .line 18
    invoke-static {v2}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    move-object v0, v1

    .line 22
    :cond_0
    iget-object v0, v0, Lcom/zykj/view/databinding/ViewFragmentSketchPlayBinding;->j:Lcom/zykj/merge/sketch/view/MergeSketchPlayView;

    .line 23
    .line 24
    invoke-virtual {v0}, Lcom/zykj/merge/sketch/view/MergeSketchPlayView;->release()V

    .line 25
    .line 26
    .line 27
    iget-object v0, p0, Lcom/zykj/view/board/play/SketchPlayFragment;->o:Lcom/zykj/view/databinding/ViewFragmentSketchPlayBinding;

    .line 28
    .line 29
    if-nez v0, :cond_1

    .line 30
    .line 31
    invoke-static {v2}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 32
    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_1
    move-object v1, v0

    .line 36
    :goto_0
    iget-object v0, v1, Lcom/zykj/view/databinding/ViewFragmentSketchPlayBinding;->j:Lcom/zykj/merge/sketch/view/MergeSketchPlayView;

    .line 37
    .line 38
    invoke-virtual {v0}, Lcom/zykj/merge/sketch/view/MergeSketchPlayView;->destroy()V

    .line 39
    .line 40
    .line 41
    :cond_2
    const/4 v0, 0x0

    .line 42
    iput-boolean v0, p0, Lcom/zykj/view/board/play/SketchPlayFragment;->g:Z

    .line 43
    .line 44
    invoke-super {p0}, Landroidx/fragment/app/Fragment;->onDestroyView()V

    .line 45
    .line 46
    .line 47
    return-void
.end method

.method public onHiddenChanged(Z)V
    .locals 1

    .line 1
    invoke-super {p0, p1}, Landroidx/fragment/app/Fragment;->onHiddenChanged(Z)V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->isAdded()Z

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    if-eqz p1, :cond_0

    .line 11
    .line 12
    invoke-virtual {p0}, Lcom/zykj/view/board/play/SketchPlayFragment;->x0()V

    .line 13
    .line 14
    .line 15
    :cond_0
    return-void
.end method

.method public onPause()V
    .locals 0

    .line 1
    invoke-super {p0}, Landroidx/fragment/app/Fragment;->onPause()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Lcom/zykj/view/board/play/SketchPlayFragment;->x0()V

    .line 5
    .line 6
    .line 7
    return-void
.end method

.method public onResume()V
    .locals 1

    .line 1
    invoke-super {p0}, Landroidx/fragment/app/Fragment;->onResume()V

    .line 2
    .line 3
    .line 4
    iget-boolean v0, p0, Lcom/zykj/view/board/play/SketchPlayFragment;->k:Z

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    invoke-virtual {p0}, Lcom/zykj/view/board/play/SketchPlayFragment;->w0()V

    .line 9
    .line 10
    .line 11
    :cond_0
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
    invoke-direct {p0}, Lcom/zykj/view/board/play/SketchPlayFragment;->initView()V

    .line 10
    .line 11
    .line 12
    iget-object p1, p0, Lcom/zykj/view/board/play/SketchPlayFragment;->d:Lnb/a;

    .line 13
    .line 14
    if-eqz p1, :cond_0

    .line 15
    .line 16
    invoke-virtual {p0, p1}, Lcom/zykj/view/board/play/SketchPlayFragment;->U(Lnb/a;)V

    .line 17
    .line 18
    .line 19
    :cond_0
    return-void
.end method

.method public final p0(Lnb/a;)V
    .locals 1

    .line 1
    const-string v0, "newPlayerConfig"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, Lcom/zykj/view/board/play/SketchPlayFragment;->d:Lnb/a;

    .line 7
    .line 8
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getView()Landroid/view/View;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    invoke-virtual {p0, p1}, Lcom/zykj/view/board/play/SketchPlayFragment;->U(Lnb/a;)V

    .line 15
    .line 16
    .line 17
    :cond_0
    return-void
.end method

.method public final q0(Ljava/lang/String;Z)V
    .locals 3

    .line 1
    const-string v0, "tips"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/zykj/view/board/play/SketchPlayFragment;->u:Landroid/app/ProgressDialog;

    .line 7
    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    invoke-virtual {v0}, Landroid/app/Dialog;->dismiss()V

    .line 11
    .line 12
    .line 13
    :cond_0
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->requireContext()Landroid/content/Context;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    const-string v1, ""

    .line 18
    .line 19
    const/4 v2, 0x0

    .line 20
    invoke-static {v0, v1, p1, v2, p2}, Landroid/app/ProgressDialog;->show(Landroid/content/Context;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ZZ)Landroid/app/ProgressDialog;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    iput-object p1, p0, Lcom/zykj/view/board/play/SketchPlayFragment;->u:Landroid/app/ProgressDialog;

    .line 25
    .line 26
    return-void
.end method

.method public final s0()V
    .locals 4

    .line 1
    iget v0, p0, Lcom/zykj/view/board/play/SketchPlayFragment;->j:I

    .line 2
    .line 3
    if-lez v0, :cond_2

    .line 4
    .line 5
    iget-object v0, p0, Lcom/zykj/view/board/play/SketchPlayFragment;->o:Lcom/zykj/view/databinding/ViewFragmentSketchPlayBinding;

    .line 6
    .line 7
    const/4 v1, 0x0

    .line 8
    const-string v2, "mBinding"

    .line 9
    .line 10
    if-nez v0, :cond_0

    .line 11
    .line 12
    invoke-static {v2}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    move-object v0, v1

    .line 16
    :cond_0
    iget-object v0, v0, Lcom/zykj/view/databinding/ViewFragmentSketchPlayBinding;->d:Lcom/zykj/view/databinding/ViewItemSketchPlayBinding;

    .line 17
    .line 18
    iget-object v0, v0, Lcom/zykj/view/databinding/ViewItemSketchPlayBinding;->c:Landroidx/constraintlayout/widget/Group;

    .line 19
    .line 20
    const-string v3, "groupSeekBar"

    .line 21
    .line 22
    invoke-static {v0, v3}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    const/4 v3, 0x0

    .line 26
    invoke-virtual {v0, v3}, Landroid/view/View;->setVisibility(I)V

    .line 27
    .line 28
    .line 29
    iget-object v0, p0, Lcom/zykj/view/board/play/SketchPlayFragment;->f:Lnb/h;

    .line 30
    .line 31
    invoke-virtual {v0}, Lnb/h;->e()Z

    .line 32
    .line 33
    .line 34
    move-result v0

    .line 35
    if-eqz v0, :cond_2

    .line 36
    .line 37
    iget-object v0, p0, Lcom/zykj/view/board/play/SketchPlayFragment;->o:Lcom/zykj/view/databinding/ViewFragmentSketchPlayBinding;

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
    iget-object v0, v1, Lcom/zykj/view/databinding/ViewFragmentSketchPlayBinding;->d:Lcom/zykj/view/databinding/ViewItemSketchPlayBinding;

    .line 47
    .line 48
    iget-object v0, v0, Lcom/zykj/view/databinding/ViewItemSketchPlayBinding;->d:Landroid/widget/ImageView;

    .line 49
    .line 50
    const-string v1, "ivFullscreen"

    .line 51
    .line 52
    invoke-static {v0, v1}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 53
    .line 54
    .line 55
    invoke-virtual {v0, v3}, Landroid/view/View;->setVisibility(I)V

    .line 56
    .line 57
    .line 58
    :cond_2
    return-void
.end method

.method public setUserVisibleHint(Z)V
    .locals 1

    .line 1
    invoke-super {p0, p1}, Landroidx/fragment/app/Fragment;->setUserVisibleHint(Z)V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->isAdded()Z

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    if-nez p1, :cond_0

    .line 11
    .line 12
    invoke-virtual {p0}, Lcom/zykj/view/board/play/SketchPlayFragment;->x0()V

    .line 13
    .line 14
    .line 15
    :cond_0
    return-void
.end method

.method public final t0()V
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
    invoke-static {v0, v1}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    invoke-static {v0}, Landroidx/lifecycle/LifecycleOwnerKt;->getLifecycleScope(Landroidx/lifecycle/LifecycleOwner;)Landroidx/lifecycle/LifecycleCoroutineScope;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    new-instance v1, Lcom/zykj/view/board/play/SketchPlayFragment$sketchResumePlaying$1;

    .line 15
    .line 16
    const/4 v2, 0x0

    .line 17
    invoke-direct {v1, p0, v2}, Lcom/zykj/view/board/play/SketchPlayFragment$sketchResumePlaying$1;-><init>(Lcom/zykj/view/board/play/SketchPlayFragment;Lvc/c;)V

    .line 18
    .line 19
    .line 20
    invoke-virtual {v0, v1}, Landroidx/lifecycle/LifecycleCoroutineScope;->launchWhenStarted(Lhd/p;)Lkotlinx/coroutines/g;

    .line 21
    .line 22
    .line 23
    return-void
.end method

.method public final u0()V
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
    invoke-static {v0, v1}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    invoke-static {v0}, Landroidx/lifecycle/LifecycleOwnerKt;->getLifecycleScope(Landroidx/lifecycle/LifecycleOwner;)Landroidx/lifecycle/LifecycleCoroutineScope;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    new-instance v1, Lcom/zykj/view/board/play/SketchPlayFragment$sketchStartPlaying$1;

    .line 15
    .line 16
    const/4 v2, 0x0

    .line 17
    invoke-direct {v1, p0, v2}, Lcom/zykj/view/board/play/SketchPlayFragment$sketchStartPlaying$1;-><init>(Lcom/zykj/view/board/play/SketchPlayFragment;Lvc/c;)V

    .line 18
    .line 19
    .line 20
    invoke-virtual {v0, v1}, Landroidx/lifecycle/LifecycleCoroutineScope;->launchWhenStarted(Lhd/p;)Lkotlinx/coroutines/g;

    .line 21
    .line 22
    .line 23
    return-void
.end method

.method public final v0()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/zykj/view/board/play/SketchPlayFragment;->t:Lkotlinx/coroutines/g;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    const/4 v2, 0x1

    .line 7
    invoke-static {v0, v1, v2, v1}, Lkotlinx/coroutines/g$a;->a(Lkotlinx/coroutines/g;Ljava/util/concurrent/CancellationException;ILjava/lang/Object;)V

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
    invoke-static {v0, v2}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    invoke-static {v0}, Landroidx/lifecycle/LifecycleOwnerKt;->getLifecycleScope(Landroidx/lifecycle/LifecycleOwner;)Landroidx/lifecycle/LifecycleCoroutineScope;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    new-instance v2, Lcom/zykj/view/board/play/SketchPlayFragment$startControlBarJob$1;

    .line 24
    .line 25
    invoke-direct {v2, p0, v1}, Lcom/zykj/view/board/play/SketchPlayFragment$startControlBarJob$1;-><init>(Lcom/zykj/view/board/play/SketchPlayFragment;Lvc/c;)V

    .line 26
    .line 27
    .line 28
    invoke-virtual {v0, v2}, Landroidx/lifecycle/LifecycleCoroutineScope;->launchWhenStarted(Lhd/p;)Lkotlinx/coroutines/g;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    iput-object v0, p0, Lcom/zykj/view/board/play/SketchPlayFragment;->t:Lkotlinx/coroutines/g;

    .line 33
    .line 34
    return-void
.end method

.method public final w0()V
    .locals 2

    .line 1
    iget-boolean v0, p0, Lcom/zykj/view/board/play/SketchPlayFragment;->g:Z

    .line 2
    .line 3
    if-eqz v0, :cond_4

    .line 4
    .line 5
    iget-object v0, p0, Lcom/zykj/view/board/play/SketchPlayFragment;->o:Lcom/zykj/view/databinding/ViewFragmentSketchPlayBinding;

    .line 6
    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    const-string v0, "mBinding"

    .line 10
    .line 11
    invoke-static {v0}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    const/4 v0, 0x0

    .line 15
    :cond_0
    iget-object v0, v0, Lcom/zykj/view/databinding/ViewFragmentSketchPlayBinding;->j:Lcom/zykj/merge/sketch/view/MergeSketchPlayView;

    .line 16
    .line 17
    invoke-virtual {v0}, Lcom/zykj/merge/sketch/view/MergeSketchPlayView;->status()Lcom/zykj/merge/sketch/constant/PlayStatus;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    if-nez v0, :cond_1

    .line 22
    .line 23
    const/4 v0, -0x1

    .line 24
    goto :goto_0

    .line 25
    :cond_1
    sget-object v1, Lcom/zykj/view/board/play/SketchPlayFragment$b;->a:[I

    .line 26
    .line 27
    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    .line 28
    .line 29
    .line 30
    move-result v0

    .line 31
    aget v0, v1, v0

    .line 32
    .line 33
    :goto_0
    const/4 v1, 0x3

    .line 34
    if-eq v0, v1, :cond_3

    .line 35
    .line 36
    const/4 v1, 0x4

    .line 37
    if-eq v0, v1, :cond_2

    .line 38
    .line 39
    goto :goto_1

    .line 40
    :cond_2
    invoke-virtual {p0}, Lcom/zykj/view/board/play/SketchPlayFragment;->u0()V

    .line 41
    .line 42
    .line 43
    return-void

    .line 44
    :cond_3
    invoke-virtual {p0}, Lcom/zykj/view/board/play/SketchPlayFragment;->t0()V

    .line 45
    .line 46
    .line 47
    :cond_4
    :goto_1
    return-void
.end method

.method public final x0()V
    .locals 4

    .line 1
    iget-boolean v0, p0, Lcom/zykj/view/board/play/SketchPlayFragment;->g:Z

    .line 2
    .line 3
    if-eqz v0, :cond_4

    .line 4
    .line 5
    iget-object v0, p0, Lcom/zykj/view/board/play/SketchPlayFragment;->o:Lcom/zykj/view/databinding/ViewFragmentSketchPlayBinding;

    .line 6
    .line 7
    const/4 v1, 0x0

    .line 8
    const-string v2, "mBinding"

    .line 9
    .line 10
    if-nez v0, :cond_0

    .line 11
    .line 12
    invoke-static {v2}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    move-object v0, v1

    .line 16
    :cond_0
    iget-object v0, v0, Lcom/zykj/view/databinding/ViewFragmentSketchPlayBinding;->j:Lcom/zykj/merge/sketch/view/MergeSketchPlayView;

    .line 17
    .line 18
    invoke-virtual {v0}, Lcom/zykj/merge/sketch/view/MergeSketchPlayView;->status()Lcom/zykj/merge/sketch/constant/PlayStatus;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    sget-object v3, Lcom/zykj/merge/sketch/constant/PlayStatus;->RECORD_START:Lcom/zykj/merge/sketch/constant/PlayStatus;

    .line 23
    .line 24
    if-eq v0, v3, :cond_2

    .line 25
    .line 26
    iget-object v0, p0, Lcom/zykj/view/board/play/SketchPlayFragment;->o:Lcom/zykj/view/databinding/ViewFragmentSketchPlayBinding;

    .line 27
    .line 28
    if-nez v0, :cond_1

    .line 29
    .line 30
    invoke-static {v2}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 31
    .line 32
    .line 33
    move-object v0, v1

    .line 34
    :cond_1
    iget-object v0, v0, Lcom/zykj/view/databinding/ViewFragmentSketchPlayBinding;->j:Lcom/zykj/merge/sketch/view/MergeSketchPlayView;

    .line 35
    .line 36
    invoke-virtual {v0}, Lcom/zykj/merge/sketch/view/MergeSketchPlayView;->status()Lcom/zykj/merge/sketch/constant/PlayStatus;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    sget-object v3, Lcom/zykj/merge/sketch/constant/PlayStatus;->RECORD_RESUME:Lcom/zykj/merge/sketch/constant/PlayStatus;

    .line 41
    .line 42
    if-ne v0, v3, :cond_4

    .line 43
    .line 44
    :cond_2
    iget-object v0, p0, Lcom/zykj/view/board/play/SketchPlayFragment;->o:Lcom/zykj/view/databinding/ViewFragmentSketchPlayBinding;

    .line 45
    .line 46
    if-nez v0, :cond_3

    .line 47
    .line 48
    invoke-static {v2}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 49
    .line 50
    .line 51
    goto :goto_0

    .line 52
    :cond_3
    move-object v1, v0

    .line 53
    :goto_0
    iget-object v0, v1, Lcom/zykj/view/databinding/ViewFragmentSketchPlayBinding;->j:Lcom/zykj/merge/sketch/view/MergeSketchPlayView;

    .line 54
    .line 55
    invoke-virtual {v0}, Lcom/zykj/merge/sketch/view/MergeSketchPlayView;->pause()V

    .line 56
    .line 57
    .line 58
    :cond_4
    return-void
.end method

.method public final y0()V
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
    invoke-static {v0, v1}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    invoke-static {v0}, Landroidx/lifecycle/LifecycleOwnerKt;->getLifecycleScope(Landroidx/lifecycle/LifecycleOwner;)Landroidx/lifecycle/LifecycleCoroutineScope;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    new-instance v1, Lcom/zykj/view/board/play/SketchPlayFragment$toggleControlBarVisible$1;

    .line 15
    .line 16
    const/4 v2, 0x0

    .line 17
    invoke-direct {v1, p0, v2}, Lcom/zykj/view/board/play/SketchPlayFragment$toggleControlBarVisible$1;-><init>(Lcom/zykj/view/board/play/SketchPlayFragment;Lvc/c;)V

    .line 18
    .line 19
    .line 20
    invoke-virtual {v0, v1}, Landroidx/lifecycle/LifecycleCoroutineScope;->launchWhenStarted(Lhd/p;)Lkotlinx/coroutines/g;

    .line 21
    .line 22
    .line 23
    return-void
.end method
