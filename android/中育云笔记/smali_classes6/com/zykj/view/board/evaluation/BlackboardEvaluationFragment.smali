.class public final Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;
.super Landroidx/fragment/app/Fragment;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment$a;
    }
.end annotation


# static fields
.field public static final n:Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment$a;


# instance fields
.field public final d:Lvb/l;

.field public e:Lcom/zykj/view/databinding/ViewFragmentBlackboardEvaluationBinding;

.field public f:Lcom/zykj/blackboard/core/edit/IBoardControl;

.field public g:Ly9/n;

.field public h:Lq9/b;

.field public i:Ljava/lang/String;

.field public j:Landroid/graphics/Rect;

.field public k:F

.field public l:F

.field public m:Lhd/l;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment$a;-><init>(Lkotlin/jvm/internal/n;)V

    sput-object v0, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->n:Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment$a;

    return-void
.end method

.method public constructor <init>()V
    .locals 3

    .line 1
    invoke-direct {p0}, Landroidx/fragment/app/Fragment;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lvb/l;

    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    const/4 v2, 0x2

    .line 8
    invoke-direct {v0, p0, v1, v2, v1}, Lvb/l;-><init>(Landroidx/fragment/app/Fragment;Landroidx/activity/ComponentActivity;ILkotlin/jvm/internal/n;)V

    .line 9
    .line 10
    .line 11
    iput-object v0, p0, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->d:Lvb/l;

    .line 12
    .line 13
    new-instance v0, Landroid/graphics/Rect;

    .line 14
    .line 15
    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    .line 16
    .line 17
    .line 18
    iput-object v0, p0, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->j:Landroid/graphics/Rect;

    .line 19
    .line 20
    return-void
.end method

.method public static synthetic A(Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->p0(Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic B(Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->r0(Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic C(Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->i0(Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic D(Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->f0(Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic E(Ljava/lang/String;)Lqc/q;
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->l0(Ljava/lang/String;)Lqc/q;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic F(Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;Ljava/lang/String;)Lqc/q;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->m0(Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;Ljava/lang/String;)Lqc/q;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic G(Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->h0(Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic H(Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;Lcom/zykj/blackboard/core/edit/IBoardControl;ZJ)Lqc/q;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2, p3, p4}, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->Y(Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;Lcom/zykj/blackboard/core/edit/IBoardControl;ZJ)Lqc/q;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic I(Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;Ljava/lang/Throwable;)Lqc/q;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->Z(Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;Ljava/lang/Throwable;)Lqc/q;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic J(Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;)V
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->w0(Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;)V

    return-void
.end method

.method public static synthetic K(Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;Landroid/net/Uri;)Lqc/q;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->U(Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;Landroid/net/Uri;)Lqc/q;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic L(Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->j0(Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic M(Landroid/content/DialogInterface;I)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->R(Landroid/content/DialogInterface;I)V

    return-void
.end method

.method public static final synthetic N(Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;)Lcom/zykj/view/databinding/ViewFragmentBlackboardEvaluationBinding;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->e:Lcom/zykj/view/databinding/ViewFragmentBlackboardEvaluationBinding;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic O(Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;)Lhd/l;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->m:Lhd/l;

    .line 2
    .line 3
    return-object p0
.end method

.method private final P()V
    .locals 3

    .line 1
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getActivity()Landroidx/fragment/app/FragmentActivity;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    new-instance v1, Landroidx/appcompat/app/AlertDialog$Builder;

    .line 8
    .line 9
    sget v2, Lcom/zykj/view/R$style;->Theme_AppCompat_Light_Dialog_Alert:I

    .line 10
    .line 11
    invoke-direct {v1, v0, v2}, Landroidx/appcompat/app/AlertDialog$Builder;-><init>(Landroid/content/Context;I)V

    .line 12
    .line 13
    .line 14
    sget v0, Lcom/zykj/view/R$string;->clear_canvas:I

    .line 15
    .line 16
    invoke-virtual {v1, v0}, Landroidx/appcompat/app/AlertDialog$Builder;->setMessage(I)Landroidx/appcompat/app/AlertDialog$Builder;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    sget v1, Lcom/zykj/view/R$string;->sure:I

    .line 21
    .line 22
    invoke-virtual {p0, v1}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    new-instance v2, Lmb/o;

    .line 27
    .line 28
    invoke-direct {v2, p0}, Lmb/o;-><init>(Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;)V

    .line 29
    .line 30
    .line 31
    invoke-virtual {v0, v1, v2}, Landroidx/appcompat/app/AlertDialog$Builder;->setPositiveButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroidx/appcompat/app/AlertDialog$Builder;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    sget v1, Lcom/zykj/view/R$string;->cancel:I

    .line 36
    .line 37
    invoke-virtual {p0, v1}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object v1

    .line 41
    new-instance v2, Lmb/p;

    .line 42
    .line 43
    invoke-direct {v2}, Lmb/p;-><init>()V

    .line 44
    .line 45
    .line 46
    invoke-virtual {v0, v1, v2}, Landroidx/appcompat/app/AlertDialog$Builder;->setNegativeButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroidx/appcompat/app/AlertDialog$Builder;

    .line 47
    .line 48
    .line 49
    move-result-object v0

    .line 50
    invoke-virtual {v0}, Landroidx/appcompat/app/AlertDialog$Builder;->create()Landroidx/appcompat/app/AlertDialog;

    .line 51
    .line 52
    .line 53
    move-result-object v0

    .line 54
    invoke-virtual {v0}, Landroid/app/Dialog;->show()V

    .line 55
    .line 56
    .line 57
    :cond_0
    return-void
.end method

.method public static final Q(Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;Landroid/content/DialogInterface;I)V
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->g:Ly9/n;

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    const/4 p1, 0x1

    .line 6
    const/4 p2, 0x0

    .line 7
    invoke-static {p0, p2, p1, p2}, Ly9/n$a;->e(Ly9/n;Lba/c;ILjava/lang/Object;)V

    .line 8
    .line 9
    .line 10
    :cond_0
    return-void
.end method

.method public static final R(Landroid/content/DialogInterface;I)V
    .locals 0

    .line 1
    invoke-interface {p0}, Landroid/content/DialogInterface;->dismiss()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private final T()V
    .locals 8

    .line 1
    iget-object v0, p0, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->g:Ly9/n;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    invoke-interface {v0}, Ly9/n;->y()I

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    goto :goto_0

    .line 11
    :cond_0
    move v0, v1

    .line 12
    :goto_0
    const/4 v2, 0x3

    .line 13
    if-lt v0, v2, :cond_1

    .line 14
    .line 15
    const-string v0, "\u56fe\u7247\u6570\u91cf\u5df2\u8fbe\u4e0a\u9650\uff0c\u4e0d\u53ef\u7ee7\u7eed\u63d2\u5165"

    .line 16
    .line 17
    new-array v1, v1, [Ljava/lang/Object;

    .line 18
    .line 19
    invoke-static {v0, v1}, Lcom/blankj/utilcode/util/ToastUtils;->showShort(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 20
    .line 21
    .line 22
    return-void

    .line 23
    :cond_1
    iget-object v2, p0, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->d:Lvb/l;

    .line 24
    .line 25
    new-instance v5, Lmb/n;

    .line 26
    .line 27
    invoke-direct {v5, p0}, Lmb/n;-><init>(Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;)V

    .line 28
    .line 29
    .line 30
    const/4 v6, 0x1

    .line 31
    const/4 v7, 0x0

    .line 32
    const/4 v3, 0x0

    .line 33
    const/4 v4, 0x1

    .line 34
    invoke-static/range {v2 .. v7}, Lvb/l;->v(Lvb/l;Landroid/net/Uri;ZLhd/l;ILjava/lang/Object;)V

    .line 35
    .line 36
    .line 37
    return-void
.end method

.method public static final U(Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;Landroid/net/Uri;)Lqc/q;
    .locals 3

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
    iget-object v0, p0, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->g:Ly9/n;

    .line 11
    .line 12
    if-eqz v0, :cond_2

    .line 13
    .line 14
    invoke-virtual {p1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    const-string v2, "getAbsolutePath(...)"

    .line 19
    .line 20
    invoke-static {v1, v2}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    invoke-interface {v0, v1}, Ly9/n;->A(Ljava/lang/String;)Lcom/zykj/blackboard/core/graph/group/ImageGraph;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    if-eqz v0, :cond_2

    .line 28
    .line 29
    invoke-static {p1}, Lcom/blankj/utilcode/util/FileUtils;->delete(Ljava/io/File;)Z

    .line 30
    .line 31
    .line 32
    iget-object p1, p0, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->e:Lcom/zykj/view/databinding/ViewFragmentBlackboardEvaluationBinding;

    .line 33
    .line 34
    if-nez p1, :cond_1

    .line 35
    .line 36
    const-string p1, "mBinding"

    .line 37
    .line 38
    invoke-static {p1}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 39
    .line 40
    .line 41
    const/4 p1, 0x0

    .line 42
    :cond_1
    iget-object p1, p1, Lcom/zykj/view/databinding/ViewFragmentBlackboardEvaluationBinding;->q:Lcom/zykj/blackboard/core/canvas/SketchRecorderView;

    .line 43
    .line 44
    new-instance v1, Lmb/q;

    .line 45
    .line 46
    invoke-direct {v1, v0, p0}, Lmb/q;-><init>(Lcom/zykj/blackboard/core/graph/group/ImageGraph;Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;)V

    .line 47
    .line 48
    .line 49
    invoke-virtual {p1, v1}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 50
    .line 51
    .line 52
    :cond_2
    sget-object p0, Lqc/q;->a:Lqc/q;

    .line 53
    .line 54
    return-object p0
.end method

.method public static final V(Lcom/zykj/blackboard/core/graph/group/ImageGraph;Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;)V
    .locals 4

    .line 1
    invoke-virtual {p0}, Lba/a;->d()Landroid/graphics/RectF;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    iget p0, p0, Landroid/graphics/RectF;->top:F

    .line 6
    .line 7
    iget-object v0, p1, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->e:Lcom/zykj/view/databinding/ViewFragmentBlackboardEvaluationBinding;

    .line 8
    .line 9
    const/4 v1, 0x0

    .line 10
    if-nez v0, :cond_0

    .line 11
    .line 12
    const-string v0, "mBinding"

    .line 13
    .line 14
    invoke-static {v0}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    move-object v0, v1

    .line 18
    :cond_0
    iget-object v0, v0, Lcom/zykj/view/databinding/ViewFragmentBlackboardEvaluationBinding;->q:Lcom/zykj/blackboard/core/canvas/SketchRecorderView;

    .line 19
    .line 20
    invoke-virtual {v0}, Landroid/view/View;->getHeight()I

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    iget-object v2, p1, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->h:Lq9/b;

    .line 25
    .line 26
    if-eqz v2, :cond_1

    .line 27
    .line 28
    invoke-virtual {v2}, Lq9/b;->z()Lq9/d;

    .line 29
    .line 30
    .line 31
    move-result-object v2

    .line 32
    if-eqz v2, :cond_1

    .line 33
    .line 34
    invoke-virtual {v2}, Lq9/d;->b()I

    .line 35
    .line 36
    .line 37
    move-result v2

    .line 38
    goto :goto_0

    .line 39
    :cond_1
    const/4 v2, 0x2

    .line 40
    :goto_0
    const/4 v3, 0x1

    .line 41
    sub-int/2addr v2, v3

    .line 42
    mul-int/2addr v0, v2

    .line 43
    int-to-float v0, v0

    .line 44
    div-float/2addr p0, v0

    .line 45
    iget-object v0, p1, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->g:Ly9/n;

    .line 46
    .line 47
    if-eqz v0, :cond_2

    .line 48
    .line 49
    invoke-interface {v0}, Ly9/n;->areaMoveStart()V

    .line 50
    .line 51
    .line 52
    :cond_2
    iget-object v0, p1, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->g:Ly9/n;

    .line 53
    .line 54
    if-eqz v0, :cond_3

    .line 55
    .line 56
    invoke-static {p0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 57
    .line 58
    .line 59
    move-result-object v2

    .line 60
    invoke-static {v0, v1, v2, v3, v1}, Ly9/n$a;->d(Ly9/n;Ljava/lang/Float;Ljava/lang/Float;ILjava/lang/Object;)V

    .line 61
    .line 62
    .line 63
    :cond_3
    iget-object p1, p1, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->m:Lhd/l;

    .line 64
    .line 65
    if-eqz p1, :cond_4

    .line 66
    .line 67
    invoke-static {p0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 68
    .line 69
    .line 70
    move-result-object p0

    .line 71
    invoke-interface {p1, p0}, Lhd/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 72
    .line 73
    .line 74
    :cond_4
    return-void
.end method

.method public static final Y(Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;Lcom/zykj/blackboard/core/edit/IBoardControl;ZJ)Lqc/q;
    .locals 0

    .line 1
    const-string p2, "boardControl"

    .line 2
    .line 3
    invoke-static {p1, p2}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->f:Lcom/zykj/blackboard/core/edit/IBoardControl;

    .line 7
    .line 8
    invoke-virtual {p0}, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->a0()V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0}, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->t0()V

    .line 12
    .line 13
    .line 14
    iget-object p1, p0, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->e:Lcom/zykj/view/databinding/ViewFragmentBlackboardEvaluationBinding;

    .line 15
    .line 16
    const/4 p2, 0x0

    .line 17
    const-string p3, "mBinding"

    .line 18
    .line 19
    if-nez p1, :cond_0

    .line 20
    .line 21
    invoke-static {p3}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    move-object p1, p2

    .line 25
    :cond_0
    iget-object p1, p1, Lcom/zykj/view/databinding/ViewFragmentBlackboardEvaluationBinding;->k:Landroid/widget/ImageView;

    .line 26
    .line 27
    invoke-virtual {p1}, Landroid/view/View;->performClick()Z

    .line 28
    .line 29
    .line 30
    const/4 p1, 0x1

    .line 31
    invoke-virtual {p0, p1}, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->y0(Z)V

    .line 32
    .line 33
    .line 34
    iget-object p0, p0, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->e:Lcom/zykj/view/databinding/ViewFragmentBlackboardEvaluationBinding;

    .line 35
    .line 36
    if-nez p0, :cond_1

    .line 37
    .line 38
    invoke-static {p3}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 39
    .line 40
    .line 41
    goto :goto_0

    .line 42
    :cond_1
    move-object p2, p0

    .line 43
    :goto_0
    iget-object p0, p2, Lcom/zykj/view/databinding/ViewFragmentBlackboardEvaluationBinding;->r:Landroid/widget/TextView;

    .line 44
    .line 45
    const/16 p1, 0x8

    .line 46
    .line 47
    invoke-virtual {p0, p1}, Landroid/view/View;->setVisibility(I)V

    .line 48
    .line 49
    .line 50
    sget-object p0, Lqc/q;->a:Lqc/q;

    .line 51
    .line 52
    return-object p0
.end method

.method public static final Z(Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;Ljava/lang/Throwable;)Lqc/q;
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
    new-array p1, p1, [Ljava/lang/Object;

    .line 8
    .line 9
    const-string v0, "\u52a0\u8f7d\u5931\u8d25,\u6e05\u9664\u7f13\u5b58\u540e\u518d\u8bd5"

    .line 10
    .line 11
    invoke-static {v0, p1}, Lcom/blankj/utilcode/util/ToastUtils;->showShort(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 12
    .line 13
    .line 14
    const/4 p1, 0x1

    .line 15
    invoke-virtual {p0, p1}, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->y0(Z)V

    .line 16
    .line 17
    .line 18
    iget-object p0, p0, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->e:Lcom/zykj/view/databinding/ViewFragmentBlackboardEvaluationBinding;

    .line 19
    .line 20
    if-nez p0, :cond_0

    .line 21
    .line 22
    const-string p0, "mBinding"

    .line 23
    .line 24
    invoke-static {p0}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    const/4 p0, 0x0

    .line 28
    :cond_0
    iget-object p0, p0, Lcom/zykj/view/databinding/ViewFragmentBlackboardEvaluationBinding;->r:Landroid/widget/TextView;

    .line 29
    .line 30
    const/16 p1, 0x8

    .line 31
    .line 32
    invoke-virtual {p0, p1}, Landroid/view/View;->setVisibility(I)V

    .line 33
    .line 34
    .line 35
    sget-object p0, Lqc/q;->a:Lqc/q;

    .line 36
    .line 37
    return-object p0
.end method

.method private final b0()V
    .locals 9

    .line 1
    iget-object v0, p0, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->e:Lcom/zykj/view/databinding/ViewFragmentBlackboardEvaluationBinding;

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
    iget-object v0, v0, Lcom/zykj/view/databinding/ViewFragmentBlackboardEvaluationBinding;->p:Landroid/widget/ImageView;

    .line 13
    .line 14
    new-instance v3, Lmb/l;

    .line 15
    .line 16
    invoke-direct {v3, p0}, Lmb/l;-><init>(Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;)V

    .line 17
    .line 18
    .line 19
    invoke-virtual {v0, v3}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 20
    .line 21
    .line 22
    iget-object v0, p0, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->e:Lcom/zykj/view/databinding/ViewFragmentBlackboardEvaluationBinding;

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
    iget-object v0, v0, Lcom/zykj/view/databinding/ViewFragmentBlackboardEvaluationBinding;->l:Landroid/widget/ImageView;

    .line 31
    .line 32
    new-instance v3, Lmb/v;

    .line 33
    .line 34
    invoke-direct {v3, p0}, Lmb/v;-><init>(Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;)V

    .line 35
    .line 36
    .line 37
    invoke-virtual {v0, v3}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 38
    .line 39
    .line 40
    iget-object v0, p0, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->e:Lcom/zykj/view/databinding/ViewFragmentBlackboardEvaluationBinding;

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
    iget-object v0, v0, Lcom/zykj/view/databinding/ViewFragmentBlackboardEvaluationBinding;->m:Landroid/widget/ImageView;

    .line 49
    .line 50
    new-instance v3, Lmb/w;

    .line 51
    .line 52
    invoke-direct {v3, p0}, Lmb/w;-><init>(Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;)V

    .line 53
    .line 54
    .line 55
    invoke-virtual {v0, v3}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 56
    .line 57
    .line 58
    iget-object v0, p0, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->e:Lcom/zykj/view/databinding/ViewFragmentBlackboardEvaluationBinding;

    .line 59
    .line 60
    if-nez v0, :cond_3

    .line 61
    .line 62
    invoke-static {v2}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 63
    .line 64
    .line 65
    move-object v0, v1

    .line 66
    :cond_3
    iget-object v0, v0, Lcom/zykj/view/databinding/ViewFragmentBlackboardEvaluationBinding;->o:Landroid/widget/ImageView;

    .line 67
    .line 68
    new-instance v3, Lmb/x;

    .line 69
    .line 70
    invoke-direct {v3, p0}, Lmb/x;-><init>(Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;)V

    .line 71
    .line 72
    .line 73
    invoke-virtual {v0, v3}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 74
    .line 75
    .line 76
    iget-object v0, p0, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->e:Lcom/zykj/view/databinding/ViewFragmentBlackboardEvaluationBinding;

    .line 77
    .line 78
    if-nez v0, :cond_4

    .line 79
    .line 80
    invoke-static {v2}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 81
    .line 82
    .line 83
    move-object v0, v1

    .line 84
    :cond_4
    iget-object v0, v0, Lcom/zykj/view/databinding/ViewFragmentBlackboardEvaluationBinding;->k:Landroid/widget/ImageView;

    .line 85
    .line 86
    new-instance v3, Lmb/y;

    .line 87
    .line 88
    invoke-direct {v3, p0}, Lmb/y;-><init>(Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;)V

    .line 89
    .line 90
    .line 91
    invoke-virtual {v0, v3}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 92
    .line 93
    .line 94
    iget-object v0, p0, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->e:Lcom/zykj/view/databinding/ViewFragmentBlackboardEvaluationBinding;

    .line 95
    .line 96
    if-nez v0, :cond_5

    .line 97
    .line 98
    invoke-static {v2}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 99
    .line 100
    .line 101
    move-object v0, v1

    .line 102
    :cond_5
    iget-object v0, v0, Lcom/zykj/view/databinding/ViewFragmentBlackboardEvaluationBinding;->j:Landroid/widget/ImageView;

    .line 103
    .line 104
    new-instance v3, Lmb/b;

    .line 105
    .line 106
    invoke-direct {v3, p0}, Lmb/b;-><init>(Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;)V

    .line 107
    .line 108
    .line 109
    invoke-virtual {v0, v3}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 110
    .line 111
    .line 112
    iget-object v0, p0, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->e:Lcom/zykj/view/databinding/ViewFragmentBlackboardEvaluationBinding;

    .line 113
    .line 114
    if-nez v0, :cond_6

    .line 115
    .line 116
    invoke-static {v2}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 117
    .line 118
    .line 119
    move-object v0, v1

    .line 120
    :cond_6
    iget-object v0, v0, Lcom/zykj/view/databinding/ViewFragmentBlackboardEvaluationBinding;->e:Landroid/widget/ImageView;

    .line 121
    .line 122
    new-instance v3, Lmb/c;

    .line 123
    .line 124
    invoke-direct {v3, p0}, Lmb/c;-><init>(Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;)V

    .line 125
    .line 126
    .line 127
    invoke-virtual {v0, v3}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 128
    .line 129
    .line 130
    iget-object v0, p0, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->e:Lcom/zykj/view/databinding/ViewFragmentBlackboardEvaluationBinding;

    .line 131
    .line 132
    if-nez v0, :cond_7

    .line 133
    .line 134
    invoke-static {v2}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 135
    .line 136
    .line 137
    move-object v0, v1

    .line 138
    :cond_7
    iget-object v0, v0, Lcom/zykj/view/databinding/ViewFragmentBlackboardEvaluationBinding;->g:Landroid/widget/ImageView;

    .line 139
    .line 140
    new-instance v3, Lmb/d;

    .line 141
    .line 142
    invoke-direct {v3, p0}, Lmb/d;-><init>(Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;)V

    .line 143
    .line 144
    .line 145
    invoke-virtual {v0, v3}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 146
    .line 147
    .line 148
    iget-object v0, p0, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->e:Lcom/zykj/view/databinding/ViewFragmentBlackboardEvaluationBinding;

    .line 149
    .line 150
    if-nez v0, :cond_8

    .line 151
    .line 152
    invoke-static {v2}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 153
    .line 154
    .line 155
    move-object v0, v1

    .line 156
    :cond_8
    iget-object v3, v0, Lcom/zykj/view/databinding/ViewFragmentBlackboardEvaluationBinding;->c:Landroid/widget/ImageView;

    .line 157
    .line 158
    const-string v0, "ivCamera"

    .line 159
    .line 160
    invoke-static {v3, v0}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 161
    .line 162
    .line 163
    new-instance v6, Lmb/e;

    .line 164
    .line 165
    invoke-direct {v6, p0}, Lmb/e;-><init>(Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;)V

    .line 166
    .line 167
    .line 168
    const/4 v7, 0x1

    .line 169
    const/4 v8, 0x0

    .line 170
    const-wide/16 v4, 0x0

    .line 171
    .line 172
    invoke-static/range {v3 .. v8}, Lvb/a;->d(Landroid/view/View;JLandroid/view/View$OnClickListener;ILjava/lang/Object;)V

    .line 173
    .line 174
    .line 175
    iget-object v0, p0, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->e:Lcom/zykj/view/databinding/ViewFragmentBlackboardEvaluationBinding;

    .line 176
    .line 177
    if-nez v0, :cond_9

    .line 178
    .line 179
    invoke-static {v2}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 180
    .line 181
    .line 182
    move-object v0, v1

    .line 183
    :cond_9
    iget-object v3, v0, Lcom/zykj/view/databinding/ViewFragmentBlackboardEvaluationBinding;->i:Landroid/widget/ImageView;

    .line 184
    .line 185
    const-string v0, "ivImport"

    .line 186
    .line 187
    invoke-static {v3, v0}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 188
    .line 189
    .line 190
    new-instance v6, Lmb/f;

    .line 191
    .line 192
    invoke-direct {v6, p0}, Lmb/f;-><init>(Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;)V

    .line 193
    .line 194
    .line 195
    const/4 v7, 0x1

    .line 196
    const/4 v8, 0x0

    .line 197
    const-wide/16 v4, 0x0

    .line 198
    .line 199
    invoke-static/range {v3 .. v8}, Lvb/a;->d(Landroid/view/View;JLandroid/view/View$OnClickListener;ILjava/lang/Object;)V

    .line 200
    .line 201
    .line 202
    iget-object v0, p0, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->e:Lcom/zykj/view/databinding/ViewFragmentBlackboardEvaluationBinding;

    .line 203
    .line 204
    if-nez v0, :cond_a

    .line 205
    .line 206
    invoke-static {v2}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 207
    .line 208
    .line 209
    move-object v0, v1

    .line 210
    :cond_a
    iget-object v3, v0, Lcom/zykj/view/databinding/ViewFragmentBlackboardEvaluationBinding;->n:Landroid/widget/ImageView;

    .line 211
    .line 212
    const-string v0, "ivText"

    .line 213
    .line 214
    invoke-static {v3, v0}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 215
    .line 216
    .line 217
    new-instance v6, Lmb/r;

    .line 218
    .line 219
    invoke-direct {v6, p0}, Lmb/r;-><init>(Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;)V

    .line 220
    .line 221
    .line 222
    const/4 v7, 0x1

    .line 223
    const/4 v8, 0x0

    .line 224
    const-wide/16 v4, 0x0

    .line 225
    .line 226
    invoke-static/range {v3 .. v8}, Lvb/a;->d(Landroid/view/View;JLandroid/view/View$OnClickListener;ILjava/lang/Object;)V

    .line 227
    .line 228
    .line 229
    iget-object v0, p0, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->e:Lcom/zykj/view/databinding/ViewFragmentBlackboardEvaluationBinding;

    .line 230
    .line 231
    if-nez v0, :cond_b

    .line 232
    .line 233
    invoke-static {v2}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 234
    .line 235
    .line 236
    move-object v0, v1

    .line 237
    :cond_b
    iget-object v0, v0, Lcom/zykj/view/databinding/ViewFragmentBlackboardEvaluationBinding;->d:Landroid/widget/ImageView;

    .line 238
    .line 239
    new-instance v3, Lmb/s;

    .line 240
    .line 241
    invoke-direct {v3, p0}, Lmb/s;-><init>(Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;)V

    .line 242
    .line 243
    .line 244
    invoke-virtual {v0, v3}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 245
    .line 246
    .line 247
    iget-object v0, p0, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->e:Lcom/zykj/view/databinding/ViewFragmentBlackboardEvaluationBinding;

    .line 248
    .line 249
    if-nez v0, :cond_c

    .line 250
    .line 251
    invoke-static {v2}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 252
    .line 253
    .line 254
    move-object v0, v1

    .line 255
    :cond_c
    iget-object v0, v0, Lcom/zykj/view/databinding/ViewFragmentBlackboardEvaluationBinding;->h:Landroid/widget/ImageView;

    .line 256
    .line 257
    new-instance v3, Lmb/t;

    .line 258
    .line 259
    invoke-direct {v3, p0}, Lmb/t;-><init>(Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;)V

    .line 260
    .line 261
    .line 262
    invoke-virtual {v0, v3}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 263
    .line 264
    .line 265
    iget-object v0, p0, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->e:Lcom/zykj/view/databinding/ViewFragmentBlackboardEvaluationBinding;

    .line 266
    .line 267
    if-nez v0, :cond_d

    .line 268
    .line 269
    invoke-static {v2}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 270
    .line 271
    .line 272
    goto :goto_0

    .line 273
    :cond_d
    move-object v1, v0

    .line 274
    :goto_0
    iget-object v0, v1, Lcom/zykj/view/databinding/ViewFragmentBlackboardEvaluationBinding;->f:Landroid/widget/ImageView;

    .line 275
    .line 276
    new-instance v1, Lmb/u;

    .line 277
    .line 278
    invoke-direct {v1, p0}, Lmb/u;-><init>(Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;)V

    .line 279
    .line 280
    .line 281
    invoke-virtual {v0, v1}, Landroid/view/View;->setOnTouchListener(Landroid/view/View$OnTouchListener;)V

    .line 282
    .line 283
    .line 284
    return-void
.end method

.method public static final c0(Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;Landroid/view/View;)V
    .locals 1

    .line 1
    iget-object p1, p0, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->h:Lq9/b;

    .line 2
    .line 3
    if-eqz p1, :cond_1

    .line 4
    .line 5
    sget-object v0, Lcom/zykj/board/EzyModeEnum$ModeEnum;->m:Lcom/zykj/board/EzyModeEnum$ModeEnum;

    .line 6
    .line 7
    invoke-virtual {p1, v0}, Lq9/b;->h0(Lcom/zykj/board/EzyModeEnum$ModeEnum;)V

    .line 8
    .line 9
    .line 10
    iget-object p1, p0, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->e:Lcom/zykj/view/databinding/ViewFragmentBlackboardEvaluationBinding;

    .line 11
    .line 12
    if-nez p1, :cond_0

    .line 13
    .line 14
    const-string p1, "mBinding"

    .line 15
    .line 16
    invoke-static {p1}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    const/4 p1, 0x0

    .line 20
    :cond_0
    iget-object p1, p1, Lcom/zykj/view/databinding/ViewFragmentBlackboardEvaluationBinding;->m:Landroid/widget/ImageView;

    .line 21
    .line 22
    const-string v0, "ivSelect"

    .line 23
    .line 24
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    invoke-virtual {p0, p1}, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->x0(Landroid/view/View;)V

    .line 28
    .line 29
    .line 30
    :cond_1
    return-void
.end method

.method public static final d0(Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;Landroid/view/View;)V
    .locals 1

    .line 1
    iget-object p1, p0, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->h:Lq9/b;

    .line 2
    .line 3
    if-eqz p1, :cond_1

    .line 4
    .line 5
    invoke-virtual {p1}, Lq9/b;->O()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    xor-int/lit8 v0, v0, 0x1

    .line 10
    .line 11
    invoke-virtual {p1, v0}, Lq9/b;->c0(Z)V

    .line 12
    .line 13
    .line 14
    iget-object p0, p0, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->e:Lcom/zykj/view/databinding/ViewFragmentBlackboardEvaluationBinding;

    .line 15
    .line 16
    if-nez p0, :cond_0

    .line 17
    .line 18
    const-string p0, "mBinding"

    .line 19
    .line 20
    invoke-static {p0}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    const/4 p0, 0x0

    .line 24
    :cond_0
    iget-object p0, p0, Lcom/zykj/view/databinding/ViewFragmentBlackboardEvaluationBinding;->o:Landroid/widget/ImageView;

    .line 25
    .line 26
    invoke-virtual {p1}, Lq9/b;->O()Z

    .line 27
    .line 28
    .line 29
    move-result v0

    .line 30
    invoke-virtual {p0, v0}, Landroid/widget/ImageView;->setSelected(Z)V

    .line 31
    .line 32
    .line 33
    invoke-virtual {p1}, Lq9/b;->O()Z

    .line 34
    .line 35
    .line 36
    move-result p0

    .line 37
    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 38
    .line 39
    .line 40
    move-result-object p0

    .line 41
    invoke-static {p0}, Lvb/n;->q(Ljava/lang/Boolean;)V

    .line 42
    .line 43
    .line 44
    :cond_1
    return-void
.end method

.method public static final e0(Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;Landroid/view/View;)V
    .locals 6

    .line 1
    iget-object v0, p0, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->h:Lq9/b;

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    sget-object p1, Lcom/zykj/board/EzyModeEnum$ModeEnum;->e:Lcom/zykj/board/EzyModeEnum$ModeEnum;

    .line 6
    .line 7
    invoke-virtual {v0, p1}, Lq9/b;->h0(Lcom/zykj/board/EzyModeEnum$ModeEnum;)V

    .line 8
    .line 9
    .line 10
    const/4 v4, 0x6

    .line 11
    const/4 v5, 0x0

    .line 12
    const/4 v1, 0x0

    .line 13
    const/4 v2, 0x0

    .line 14
    const/4 v3, 0x0

    .line 15
    invoke-static/range {v0 .. v5}, Lq9/b;->a0(Lq9/b;ZFFILjava/lang/Object;)V

    .line 16
    .line 17
    .line 18
    iget-object p1, p0, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->e:Lcom/zykj/view/databinding/ViewFragmentBlackboardEvaluationBinding;

    .line 19
    .line 20
    if-nez p1, :cond_0

    .line 21
    .line 22
    const-string p1, "mBinding"

    .line 23
    .line 24
    invoke-static {p1}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    const/4 p1, 0x0

    .line 28
    :cond_0
    iget-object p1, p1, Lcom/zykj/view/databinding/ViewFragmentBlackboardEvaluationBinding;->k:Landroid/widget/ImageView;

    .line 29
    .line 30
    const-string v0, "ivPen"

    .line 31
    .line 32
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    invoke-virtual {p0, p1}, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->x0(Landroid/view/View;)V

    .line 36
    .line 37
    .line 38
    :cond_1
    return-void
.end method

.method public static final f0(Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;Landroid/view/View;)V
    .locals 3

    .line 1
    iget-object p1, p0, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->h:Lq9/b;

    .line 2
    .line 3
    if-eqz p1, :cond_1

    .line 4
    .line 5
    sget-object v0, Lcom/zykj/board/EzyModeEnum$ModeEnum;->g:Lcom/zykj/board/EzyModeEnum$ModeEnum;

    .line 6
    .line 7
    invoke-virtual {p1, v0}, Lq9/b;->h0(Lcom/zykj/board/EzyModeEnum$ModeEnum;)V

    .line 8
    .line 9
    .line 10
    const/high16 v0, 0x41f00000    # 30.0f

    .line 11
    .line 12
    const/4 v1, 0x0

    .line 13
    const/4 v2, 0x1

    .line 14
    invoke-virtual {p1, v2, v0, v1}, Lq9/b;->Z(ZFF)V

    .line 15
    .line 16
    .line 17
    iget-object p1, p0, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->e:Lcom/zykj/view/databinding/ViewFragmentBlackboardEvaluationBinding;

    .line 18
    .line 19
    if-nez p1, :cond_0

    .line 20
    .line 21
    const-string p1, "mBinding"

    .line 22
    .line 23
    invoke-static {p1}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    const/4 p1, 0x0

    .line 27
    :cond_0
    iget-object p1, p1, Lcom/zykj/view/databinding/ViewFragmentBlackboardEvaluationBinding;->j:Landroid/widget/ImageView;

    .line 28
    .line 29
    const-string v0, "ivLine"

    .line 30
    .line 31
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 32
    .line 33
    .line 34
    invoke-virtual {p0, p1}, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->x0(Landroid/view/View;)V

    .line 35
    .line 36
    .line 37
    :cond_1
    return-void
.end method

.method public static final g0(Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;Landroid/view/View;)V
    .locals 6

    .line 1
    iget-object v0, p0, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->h:Lq9/b;

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    sget-object p1, Lcom/zykj/board/EzyModeEnum$ModeEnum;->g:Lcom/zykj/board/EzyModeEnum$ModeEnum;

    .line 6
    .line 7
    invoke-virtual {v0, p1}, Lq9/b;->h0(Lcom/zykj/board/EzyModeEnum$ModeEnum;)V

    .line 8
    .line 9
    .line 10
    const/4 v4, 0x6

    .line 11
    const/4 v5, 0x0

    .line 12
    const/4 v1, 0x1

    .line 13
    const/4 v2, 0x0

    .line 14
    const/4 v3, 0x0

    .line 15
    invoke-static/range {v0 .. v5}, Lq9/b;->a0(Lq9/b;ZFFILjava/lang/Object;)V

    .line 16
    .line 17
    .line 18
    iget-object p1, p0, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->e:Lcom/zykj/view/databinding/ViewFragmentBlackboardEvaluationBinding;

    .line 19
    .line 20
    if-nez p1, :cond_0

    .line 21
    .line 22
    const-string p1, "mBinding"

    .line 23
    .line 24
    invoke-static {p1}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    const/4 p1, 0x0

    .line 28
    :cond_0
    iget-object p1, p1, Lcom/zykj/view/databinding/ViewFragmentBlackboardEvaluationBinding;->e:Landroid/widget/ImageView;

    .line 29
    .line 30
    const-string v0, "ivDottedLine"

    .line 31
    .line 32
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    invoke-virtual {p0, p1}, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->x0(Landroid/view/View;)V

    .line 36
    .line 37
    .line 38
    :cond_1
    return-void
.end method

.method public static final h0(Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;Landroid/view/View;)V
    .locals 1

    .line 1
    iget-object p1, p0, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->h:Lq9/b;

    .line 2
    .line 3
    if-eqz p1, :cond_1

    .line 4
    .line 5
    sget-object v0, Lcom/zykj/board/EzyModeEnum$ModeEnum;->h:Lcom/zykj/board/EzyModeEnum$ModeEnum;

    .line 6
    .line 7
    invoke-virtual {p1, v0}, Lq9/b;->h0(Lcom/zykj/board/EzyModeEnum$ModeEnum;)V

    .line 8
    .line 9
    .line 10
    iget-object p1, p0, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->e:Lcom/zykj/view/databinding/ViewFragmentBlackboardEvaluationBinding;

    .line 11
    .line 12
    if-nez p1, :cond_0

    .line 13
    .line 14
    const-string p1, "mBinding"

    .line 15
    .line 16
    invoke-static {p1}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    const/4 p1, 0x0

    .line 20
    :cond_0
    iget-object p1, p1, Lcom/zykj/view/databinding/ViewFragmentBlackboardEvaluationBinding;->g:Landroid/widget/ImageView;

    .line 21
    .line 22
    const-string v0, "ivEraser"

    .line 23
    .line 24
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    invoke-virtual {p0, p1}, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->x0(Landroid/view/View;)V

    .line 28
    .line 29
    .line 30
    :cond_1
    return-void
.end method

.method public static final i0(Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->T()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private final initData()V
    .locals 2

    .line 1
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getArguments()Landroid/os/Bundle;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eqz v0, :cond_0

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
    goto :goto_0

    .line 14
    :cond_0
    const/4 v0, 0x0

    .line 15
    :goto_0
    iput-object v0, p0, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->i:Ljava/lang/String;

    .line 16
    .line 17
    return-void
.end method

.method private final initView()V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->b0()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->X()V

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0}, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->u0()V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public static final j0(Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static final k0(Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;Landroid/view/View;)V
    .locals 4

    .line 1
    new-instance p1, Lpb/l;

    .line 2
    .line 3
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->requireActivity()Landroidx/fragment/app/FragmentActivity;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    const-string v1, "requireActivity(...)"

    .line 8
    .line 9
    invoke-static {v0, v1}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    const/4 v1, 0x2

    .line 13
    const/4 v2, 0x0

    .line 14
    const/4 v3, 0x0

    .line 15
    invoke-direct {p1, v0, v3, v1, v2}, Lpb/l;-><init>(Landroid/content/Context;IILkotlin/jvm/internal/n;)V

    .line 16
    .line 17
    .line 18
    new-instance v0, Lmb/j;

    .line 19
    .line 20
    invoke-direct {v0}, Lmb/j;-><init>()V

    .line 21
    .line 22
    .line 23
    new-instance v1, Lmb/k;

    .line 24
    .line 25
    invoke-direct {v1, p0}, Lmb/k;-><init>(Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;)V

    .line 26
    .line 27
    .line 28
    new-instance p0, Lmb/m;

    .line 29
    .line 30
    invoke-direct {p0}, Lmb/m;-><init>()V

    .line 31
    .line 32
    .line 33
    const-string v2, ""

    .line 34
    .line 35
    invoke-virtual {p1, v2, v0, v1, p0}, Lpb/l;->s(Ljava/lang/String;Lhd/l;Lhd/l;Lhd/a;)V

    .line 36
    .line 37
    .line 38
    return-void
.end method

.method public static final l0(Ljava/lang/String;)Lqc/q;
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

.method public static final m0(Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;Ljava/lang/String;)Lqc/q;
    .locals 3

    .line 1
    const-string v0, "content"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->g:Ly9/n;

    .line 7
    .line 8
    if-eqz v0, :cond_1

    .line 9
    .line 10
    sget-object v1, Lcom/zykj/board/EzyPositionEnum$PositionEnum;->e:Lcom/zykj/board/EzyPositionEnum$PositionEnum;

    .line 11
    .line 12
    const/16 v2, 0x14

    .line 13
    .line 14
    invoke-interface {v0, p1, v1, v2}, Ly9/n;->o(Ljava/lang/String;Lcom/zykj/board/EzyPositionEnum$PositionEnum;I)Lca/d;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    if-eqz p1, :cond_1

    .line 19
    .line 20
    iget-object v0, p0, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->e:Lcom/zykj/view/databinding/ViewFragmentBlackboardEvaluationBinding;

    .line 21
    .line 22
    if-nez v0, :cond_0

    .line 23
    .line 24
    const-string v0, "mBinding"

    .line 25
    .line 26
    invoke-static {v0}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    const/4 v0, 0x0

    .line 30
    :cond_0
    iget-object v0, v0, Lcom/zykj/view/databinding/ViewFragmentBlackboardEvaluationBinding;->m:Landroid/widget/ImageView;

    .line 31
    .line 32
    const-string v1, "ivSelect"

    .line 33
    .line 34
    invoke-static {v0, v1}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    invoke-virtual {p0, v0}, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->x0(Landroid/view/View;)V

    .line 38
    .line 39
    .line 40
    iget-object p0, p0, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->g:Ly9/n;

    .line 41
    .line 42
    if-eqz p0, :cond_1

    .line 43
    .line 44
    invoke-virtual {p1}, Lba/a;->getId()Ljava/lang/String;

    .line 45
    .line 46
    .line 47
    move-result-object p1

    .line 48
    invoke-static {p1}, Lrc/v;->e(Ljava/lang/Object;)Ljava/util/List;

    .line 49
    .line 50
    .line 51
    move-result-object p1

    .line 52
    invoke-interface {p0, p1}, Ly9/n;->F(Ljava/util/List;)V

    .line 53
    .line 54
    .line 55
    :cond_1
    sget-object p0, Lqc/q;->a:Lqc/q;

    .line 56
    .line 57
    return-object p0
.end method

.method public static final n0()Lqc/q;
    .locals 1

    .line 1
    sget-object v0, Lqc/q;->a:Lqc/q;

    .line 2
    .line 3
    return-object v0
.end method

.method public static synthetic o()Lqc/q;
    .locals 1

    .line 1
    invoke-static {}, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->n0()Lqc/q;

    move-result-object v0

    return-object v0
.end method

.method public static final o0(Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->P()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic p(Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->o0(Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;Landroid/view/View;)V

    return-void
.end method

.method public static final p0(Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic q(Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;)V
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->v0(Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;)V

    return-void
.end method

.method public static final q0(Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;Landroid/view/View;Landroid/view/MotionEvent;)Z
    .locals 0

    .line 1
    invoke-static {p2}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0, p2}, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->W(Landroid/view/MotionEvent;)V

    .line 5
    .line 6
    .line 7
    const/4 p0, 0x1

    .line 8
    return p0
.end method

.method public static synthetic r(Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;Landroid/content/DialogInterface;I)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->Q(Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;Landroid/content/DialogInterface;I)V

    return-void
.end method

.method public static final r0(Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;Landroid/view/View;)V
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->g:Ly9/n;

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    invoke-interface {p0}, Ly9/n;->m()Z

    .line 6
    .line 7
    .line 8
    :cond_0
    return-void
.end method

.method public static synthetic s(Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;Landroid/view/View;Landroid/view/MotionEvent;)Z
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->q0(Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;Landroid/view/View;Landroid/view/MotionEvent;)Z

    move-result p0

    return p0
.end method

.method public static final s0(Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;Landroid/view/View;)V
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->g:Ly9/n;

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    invoke-interface {p0}, Ly9/n;->z()Z

    .line 6
    .line 7
    .line 8
    :cond_0
    return-void
.end method

.method public static synthetic t(Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->e0(Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic u(Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->g0(Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic v(Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->s0(Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;Landroid/view/View;)V

    return-void
.end method

.method public static final v0(Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;)V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->e:Lcom/zykj/view/databinding/ViewFragmentBlackboardEvaluationBinding;

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
    iget-object v0, v0, Lcom/zykj/view/databinding/ViewFragmentBlackboardEvaluationBinding;->f:Landroid/widget/ImageView;

    .line 13
    .line 14
    iget-object v3, p0, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->j:Landroid/graphics/Rect;

    .line 15
    .line 16
    invoke-virtual {v0, v3}, Landroid/view/View;->getGlobalVisibleRect(Landroid/graphics/Rect;)Z

    .line 17
    .line 18
    .line 19
    iget-object v0, p0, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->e:Lcom/zykj/view/databinding/ViewFragmentBlackboardEvaluationBinding;

    .line 20
    .line 21
    if-nez v0, :cond_1

    .line 22
    .line 23
    invoke-static {v2}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_1
    move-object v1, v0

    .line 28
    :goto_0
    iget-object v0, v1, Lcom/zykj/view/databinding/ViewFragmentBlackboardEvaluationBinding;->s:Lcom/zykj/view/widget/TouchSwitchView;

    .line 29
    .line 30
    new-instance v1, Lmb/i;

    .line 31
    .line 32
    invoke-direct {v1, p0}, Lmb/i;-><init>(Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;)V

    .line 33
    .line 34
    .line 35
    invoke-virtual {v0, v1}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 36
    .line 37
    .line 38
    return-void
.end method

.method public static synthetic w(Lcom/zykj/blackboard/core/graph/group/ImageGraph;Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->V(Lcom/zykj/blackboard/core/graph/group/ImageGraph;Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;)V

    return-void
.end method

.method public static final w0(Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;)V
    .locals 6

    .line 1
    new-instance v0, Landroid/graphics/Rect;

    .line 2
    .line 3
    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-object v1, p0, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->e:Lcom/zykj/view/databinding/ViewFragmentBlackboardEvaluationBinding;

    .line 7
    .line 8
    const/4 v2, 0x0

    .line 9
    const-string v3, "mBinding"

    .line 10
    .line 11
    if-nez v1, :cond_0

    .line 12
    .line 13
    invoke-static {v3}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    move-object v1, v2

    .line 17
    :cond_0
    iget-object v1, v1, Lcom/zykj/view/databinding/ViewFragmentBlackboardEvaluationBinding;->s:Lcom/zykj/view/widget/TouchSwitchView;

    .line 18
    .line 19
    invoke-virtual {v1, v0}, Landroid/view/View;->getGlobalVisibleRect(Landroid/graphics/Rect;)Z

    .line 20
    .line 21
    .line 22
    iget-object v1, p0, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->j:Landroid/graphics/Rect;

    .line 23
    .line 24
    new-instance v4, Ljava/lang/StringBuilder;

    .line 25
    .line 26
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 27
    .line 28
    .line 29
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 30
    .line 31
    .line 32
    const-string v5, " "

    .line 33
    .line 34
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 35
    .line 36
    .line 37
    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 38
    .line 39
    .line 40
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object v1

    .line 44
    const-string v4, "initTranslationConfig"

    .line 45
    .line 46
    invoke-static {v4, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 47
    .line 48
    .line 49
    const/4 v1, 0x0

    .line 50
    iput v1, p0, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->k:F

    .line 51
    .line 52
    iget v0, v0, Landroid/graphics/Rect;->bottom:I

    .line 53
    .line 54
    iget-object v1, p0, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->j:Landroid/graphics/Rect;

    .line 55
    .line 56
    iget v1, v1, Landroid/graphics/Rect;->bottom:I

    .line 57
    .line 58
    sub-int/2addr v0, v1

    .line 59
    int-to-float v0, v0

    .line 60
    iput v0, p0, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->l:F

    .line 61
    .line 62
    invoke-static {}, Lcom/blankj/utilcode/util/ScreenUtils;->getScreenHeight()I

    .line 63
    .line 64
    .line 65
    move-result v0

    .line 66
    int-to-float v0, v0

    .line 67
    const/high16 v1, 0x3f000000    # 0.5f

    .line 68
    .line 69
    mul-float/2addr v0, v1

    .line 70
    invoke-virtual {p0, v0}, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->S(F)V

    .line 71
    .line 72
    .line 73
    iget-object p0, p0, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->e:Lcom/zykj/view/databinding/ViewFragmentBlackboardEvaluationBinding;

    .line 74
    .line 75
    if-nez p0, :cond_1

    .line 76
    .line 77
    invoke-static {v3}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 78
    .line 79
    .line 80
    goto :goto_0

    .line 81
    :cond_1
    move-object v2, p0

    .line 82
    :goto_0
    iget-object p0, v2, Lcom/zykj/view/databinding/ViewFragmentBlackboardEvaluationBinding;->s:Lcom/zykj/view/widget/TouchSwitchView;

    .line 83
    .line 84
    const/4 v0, 0x0

    .line 85
    invoke-virtual {p0, v0}, Landroid/view/View;->setVisibility(I)V

    .line 86
    .line 87
    .line 88
    return-void
.end method

.method public static synthetic x(Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->k0(Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic y(Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->c0(Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic z(Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->d0(Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;Landroid/view/View;)V

    return-void
.end method


# virtual methods
.method public final S(F)V
    .locals 5

    .line 1
    new-instance v0, Landroid/graphics/Rect;

    .line 2
    .line 3
    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-object v1, p0, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->e:Lcom/zykj/view/databinding/ViewFragmentBlackboardEvaluationBinding;

    .line 7
    .line 8
    const/4 v2, 0x0

    .line 9
    const-string v3, "mBinding"

    .line 10
    .line 11
    if-nez v1, :cond_0

    .line 12
    .line 13
    invoke-static {v3}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    move-object v1, v2

    .line 17
    :cond_0
    iget-object v1, v1, Lcom/zykj/view/databinding/ViewFragmentBlackboardEvaluationBinding;->f:Landroid/widget/ImageView;

    .line 18
    .line 19
    invoke-virtual {v1, v0}, Landroid/view/View;->getGlobalVisibleRect(Landroid/graphics/Rect;)Z

    .line 20
    .line 21
    .line 22
    iget-object v0, p0, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->j:Landroid/graphics/Rect;

    .line 23
    .line 24
    invoke-virtual {v0}, Landroid/graphics/Rect;->centerY()I

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    int-to-float v0, v0

    .line 29
    sub-float/2addr p1, v0

    .line 30
    iget v0, p0, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->k:F

    .line 31
    .line 32
    iget v1, p0, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->l:F

    .line 33
    .line 34
    const/4 v4, 0x0

    .line 35
    sub-float/2addr v1, v4

    .line 36
    cmpg-float v4, p1, v0

    .line 37
    .line 38
    if-gez v4, :cond_1

    .line 39
    .line 40
    move p1, v0

    .line 41
    :cond_1
    cmpl-float v0, p1, v1

    .line 42
    .line 43
    if-lez v0, :cond_2

    .line 44
    .line 45
    goto :goto_0

    .line 46
    :cond_2
    move v1, p1

    .line 47
    :goto_0
    iget-object p1, p0, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->e:Lcom/zykj/view/databinding/ViewFragmentBlackboardEvaluationBinding;

    .line 48
    .line 49
    if-nez p1, :cond_3

    .line 50
    .line 51
    invoke-static {v3}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 52
    .line 53
    .line 54
    goto :goto_1

    .line 55
    :cond_3
    move-object v2, p1

    .line 56
    :goto_1
    iget-object p1, v2, Lcom/zykj/view/databinding/ViewFragmentBlackboardEvaluationBinding;->s:Lcom/zykj/view/widget/TouchSwitchView;

    .line 57
    .line 58
    invoke-virtual {p1, v1}, Landroid/view/View;->setTranslationY(F)V

    .line 59
    .line 60
    .line 61
    return-void
.end method

.method public final W(Landroid/view/MotionEvent;)V
    .locals 2

    .line 1
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_2

    .line 6
    .line 7
    const/4 v1, 0x1

    .line 8
    if-eq v0, v1, :cond_1

    .line 9
    .line 10
    const/4 v1, 0x2

    .line 11
    if-eq v0, v1, :cond_0

    .line 12
    .line 13
    return-void

    .line 14
    :cond_0
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getRawY()F

    .line 15
    .line 16
    .line 17
    move-result p1

    .line 18
    invoke-virtual {p0, p1}, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->S(F)V

    .line 19
    .line 20
    .line 21
    return-void

    .line 22
    :cond_1
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getRawY()F

    .line 23
    .line 24
    .line 25
    move-result p1

    .line 26
    invoke-virtual {p0, p1}, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->S(F)V

    .line 27
    .line 28
    .line 29
    return-void

    .line 30
    :cond_2
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getRawY()F

    .line 31
    .line 32
    .line 33
    move-result p1

    .line 34
    invoke-virtual {p0, p1}, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->S(F)V

    .line 35
    .line 36
    .line 37
    return-void
.end method

.method public final X()V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->i:Ljava/lang/String;

    .line 2
    .line 3
    if-nez v0, :cond_2

    .line 4
    .line 5
    new-instance v0, Ljava/io/File;

    .line 6
    .line 7
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getContext()Landroid/content/Context;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    if-eqz v1, :cond_0

    .line 12
    .line 13
    invoke-virtual {v1}, Landroid/content/Context;->getExternalCacheDir()Ljava/io/File;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    if-eqz v1, :cond_0

    .line 18
    .line 19
    invoke-virtual {v1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    if-nez v1, :cond_1

    .line 24
    .line 25
    :cond_0
    const-string v1, ""

    .line 26
    .line 27
    :cond_1
    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    .line 28
    .line 29
    .line 30
    move-result-object v2

    .line 31
    invoke-virtual {v2}, Ljava/util/UUID;->toString()Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object v2

    .line 35
    invoke-direct {v0, v1, v2}, Ljava/io/File;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 36
    .line 37
    .line 38
    invoke-virtual {v0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    iput-object v0, p0, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->i:Ljava/lang/String;

    .line 43
    .line 44
    :cond_2
    const/4 v0, 0x0

    .line 45
    invoke-virtual {p0, v0}, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->y0(Z)V

    .line 46
    .line 47
    .line 48
    iget-object v0, p0, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->e:Lcom/zykj/view/databinding/ViewFragmentBlackboardEvaluationBinding;

    .line 49
    .line 50
    if-nez v0, :cond_3

    .line 51
    .line 52
    const-string v0, "mBinding"

    .line 53
    .line 54
    invoke-static {v0}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 55
    .line 56
    .line 57
    const/4 v0, 0x0

    .line 58
    :cond_3
    iget-object v0, v0, Lcom/zykj/view/databinding/ViewFragmentBlackboardEvaluationBinding;->q:Lcom/zykj/blackboard/core/canvas/SketchRecorderView;

    .line 59
    .line 60
    iget-object v1, p0, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->i:Ljava/lang/String;

    .line 61
    .line 62
    invoke-static {v1}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 63
    .line 64
    .line 65
    new-instance v2, Lmb/g;

    .line 66
    .line 67
    invoke-direct {v2, p0}, Lmb/g;-><init>(Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;)V

    .line 68
    .line 69
    .line 70
    new-instance v3, Lmb/h;

    .line 71
    .line 72
    invoke-direct {v3, p0}, Lmb/h;-><init>(Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;)V

    .line 73
    .line 74
    .line 75
    invoke-virtual {v0, v1, v2, v3}, Lcom/zykj/blackboard/core/canvas/SketchRecorderView;->b(Ljava/lang/String;Lhd/q;Lhd/l;)V

    .line 76
    .line 77
    .line 78
    return-void
.end method

.method public final a0()V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->f:Lcom/zykj/blackboard/core/edit/IBoardControl;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    invoke-interface {v0}, Lcom/zykj/blackboard/core/edit/IBoardControl;->getConfig()Lq9/b;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    goto :goto_0

    .line 11
    :cond_0
    move-object v0, v1

    .line 12
    :goto_0
    iput-object v0, p0, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->h:Lq9/b;

    .line 13
    .line 14
    if-eqz v0, :cond_3

    .line 15
    .line 16
    invoke-static {}, Lvb/n;->h()Ljava/lang/Boolean;

    .line 17
    .line 18
    .line 19
    move-result-object v2

    .line 20
    const/4 v3, 0x1

    .line 21
    if-eqz v2, :cond_1

    .line 22
    .line 23
    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 24
    .line 25
    .line 26
    move-result v2

    .line 27
    goto :goto_1

    .line 28
    :cond_1
    move v2, v3

    .line 29
    :goto_1
    invoke-virtual {v0, v2}, Lq9/b;->c0(Z)V

    .line 30
    .line 31
    .line 32
    iget-object v2, p0, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->e:Lcom/zykj/view/databinding/ViewFragmentBlackboardEvaluationBinding;

    .line 33
    .line 34
    if-nez v2, :cond_2

    .line 35
    .line 36
    const-string v2, "mBinding"

    .line 37
    .line 38
    invoke-static {v2}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 39
    .line 40
    .line 41
    goto :goto_2

    .line 42
    :cond_2
    move-object v1, v2

    .line 43
    :goto_2
    iget-object v1, v1, Lcom/zykj/view/databinding/ViewFragmentBlackboardEvaluationBinding;->o:Landroid/widget/ImageView;

    .line 44
    .line 45
    invoke-virtual {v0}, Lq9/b;->O()Z

    .line 46
    .line 47
    .line 48
    move-result v2

    .line 49
    invoke-virtual {v1, v2}, Landroid/widget/ImageView;->setSelected(Z)V

    .line 50
    .line 51
    .line 52
    const/4 v1, 0x2

    .line 53
    invoke-virtual {v0, v1}, Lq9/b;->g0(I)V

    .line 54
    .line 55
    .line 56
    invoke-virtual {v0, v3}, Lq9/b;->e0(Z)V

    .line 57
    .line 58
    .line 59
    const/high16 v1, 0x40400000    # 3.0f

    .line 60
    .line 61
    invoke-virtual {v0, v1}, Lq9/b;->j0(F)V

    .line 62
    .line 63
    .line 64
    invoke-virtual {v0, v1}, Lq9/b;->Y(F)V

    .line 65
    .line 66
    .line 67
    const-string v1, "#000000"

    .line 68
    .line 69
    invoke-static {v1}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 70
    .line 71
    .line 72
    move-result v1

    .line 73
    invoke-virtual {v0, v1}, Lq9/b;->i0(I)V

    .line 74
    .line 75
    .line 76
    const/4 v1, -0x1

    .line 77
    invoke-virtual {v0, v1}, Lq9/b;->W(I)V

    .line 78
    .line 79
    .line 80
    invoke-virtual {v0}, Lq9/b;->z()Lq9/d;

    .line 81
    .line 82
    .line 83
    move-result-object v1

    .line 84
    invoke-virtual {v1, v3}, Lq9/d;->l(Z)V

    .line 85
    .line 86
    .line 87
    invoke-virtual {v1, v3}, Lq9/d;->o(Z)V

    .line 88
    .line 89
    .line 90
    const/4 v2, 0x3

    .line 91
    invoke-virtual {v1, v2}, Lq9/d;->j(I)V

    .line 92
    .line 93
    .line 94
    invoke-virtual {v1, v3}, Lq9/d;->k(I)V

    .line 95
    .line 96
    .line 97
    const/high16 v1, 0x42880000    # 68.0f

    .line 98
    .line 99
    invoke-virtual {v0, v1}, Lq9/b;->V(F)V

    .line 100
    .line 101
    .line 102
    invoke-virtual {v0, v1}, Lq9/b;->U(F)V

    .line 103
    .line 104
    .line 105
    const/high16 v1, 0x42b00000    # 88.0f

    .line 106
    .line 107
    invoke-virtual {v0, v1}, Lq9/b;->T(F)V

    .line 108
    .line 109
    .line 110
    :cond_3
    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Landroidx/fragment/app/Fragment;->onCreate(Landroid/os/Bundle;)V

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->initData()V

    .line 5
    .line 6
    .line 7
    return-void
.end method

.method public onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 1

    .line 1
    const-string p2, "inflater"

    .line 2
    .line 3
    invoke-static {p1, p2}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-static {p1}, Lcom/zykj/view/databinding/ViewFragmentBlackboardEvaluationBinding;->a(Landroid/view/LayoutInflater;)Lcom/zykj/view/databinding/ViewFragmentBlackboardEvaluationBinding;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    const/high16 p2, 0x3f800000    # 1.0f

    .line 11
    .line 12
    const/high16 p3, 0x3f000000    # 0.5f

    .line 13
    .line 14
    sub-float/2addr p2, p3

    .line 15
    invoke-static {}, Lcom/blankj/utilcode/util/ScreenUtils;->getScreenHeight()I

    .line 16
    .line 17
    .line 18
    move-result p3

    .line 19
    int-to-float p3, p3

    .line 20
    mul-float/2addr p3, p2

    .line 21
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getResources()Landroid/content/res/Resources;

    .line 22
    .line 23
    .line 24
    move-result-object p2

    .line 25
    sget v0, Lcom/zykj/view/R$dimen;->view_9:I

    .line 26
    .line 27
    invoke-virtual {p2, v0}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 28
    .line 29
    .line 30
    move-result p2

    .line 31
    int-to-float p2, p2

    .line 32
    sub-float/2addr p3, p2

    .line 33
    iget-object p2, p1, Lcom/zykj/view/databinding/ViewFragmentBlackboardEvaluationBinding;->q:Lcom/zykj/blackboard/core/canvas/SketchRecorderView;

    .line 34
    .line 35
    const-string v0, "sketchView"

    .line 36
    .line 37
    invoke-static {p2, v0}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 38
    .line 39
    .line 40
    invoke-virtual {p2}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    if-eqz v0, :cond_0

    .line 45
    .line 46
    float-to-int p3, p3

    .line 47
    iput p3, v0, Landroid/view/ViewGroup$LayoutParams;->height:I

    .line 48
    .line 49
    invoke-virtual {p2, v0}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 50
    .line 51
    .line 52
    invoke-static {p1}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 53
    .line 54
    .line 55
    iput-object p1, p0, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->e:Lcom/zykj/view/databinding/ViewFragmentBlackboardEvaluationBinding;

    .line 56
    .line 57
    invoke-virtual {p1}, Landroidx/databinding/ViewDataBinding;->getRoot()Landroid/view/View;

    .line 58
    .line 59
    .line 60
    move-result-object p1

    .line 61
    const-string p2, "getRoot(...)"

    .line 62
    .line 63
    invoke-static {p1, p2}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 64
    .line 65
    .line 66
    return-object p1

    .line 67
    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    .line 68
    .line 69
    const-string p2, "null cannot be cast to non-null type android.view.ViewGroup.LayoutParams"

    .line 70
    .line 71
    invoke-direct {p1, p2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 72
    .line 73
    .line 74
    throw p1
.end method

.method public onDestroyView()V
    .locals 1

    .line 1
    invoke-super {p0}, Landroidx/fragment/app/Fragment;->onDestroyView()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput-object v0, p0, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->f:Lcom/zykj/blackboard/core/edit/IBoardControl;

    .line 6
    .line 7
    iput-object v0, p0, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->h:Lq9/b;

    .line 8
    .line 9
    iput-object v0, p0, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->g:Ly9/n;

    .line 10
    .line 11
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
    invoke-direct {p0}, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->initView()V

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public final t0()V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->f:Lcom/zykj/blackboard/core/edit/IBoardControl;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    invoke-interface {v0}, Lcom/zykj/blackboard/core/edit/IBoardControl;->b()Ly9/n;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    goto :goto_0

    .line 11
    :cond_0
    move-object v0, v1

    .line 12
    :goto_0
    iput-object v0, p0, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->g:Ly9/n;

    .line 13
    .line 14
    const/4 v2, 0x0

    .line 15
    if-nez v0, :cond_2

    .line 16
    .line 17
    iget-object v0, p0, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->f:Lcom/zykj/blackboard/core/edit/IBoardControl;

    .line 18
    .line 19
    if-eqz v0, :cond_1

    .line 20
    .line 21
    const/4 v3, 0x3

    .line 22
    invoke-static {v0, v2, v1, v3, v1}, Lcom/zykj/blackboard/core/edit/IBoardControl$DefaultImpls;->a(Lcom/zykj/blackboard/core/edit/IBoardControl;ZLhd/a;ILjava/lang/Object;)Ly9/n;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    goto :goto_1

    .line 27
    :cond_1
    move-object v0, v1

    .line 28
    :goto_1
    iput-object v0, p0, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->g:Ly9/n;

    .line 29
    .line 30
    :cond_2
    iget-object v0, p0, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->g:Ly9/n;

    .line 31
    .line 32
    if-eqz v0, :cond_3

    .line 33
    .line 34
    new-instance v3, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment$b;

    .line 35
    .line 36
    invoke-direct {v3, p0}, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment$b;-><init>(Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;)V

    .line 37
    .line 38
    .line 39
    invoke-interface {v0, v3}, Ly9/n;->setAreaMoveListener(Lma/d;)V

    .line 40
    .line 41
    .line 42
    :cond_3
    iget-object v0, p0, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->g:Ly9/n;

    .line 43
    .line 44
    if-eqz v0, :cond_4

    .line 45
    .line 46
    new-instance v3, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment$c;

    .line 47
    .line 48
    invoke-direct {v3, p0}, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment$c;-><init>(Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;)V

    .line 49
    .line 50
    .line 51
    invoke-interface {v0, v3}, Ly9/n;->x(Lma/k;)V

    .line 52
    .line 53
    .line 54
    :cond_4
    iget-object v0, p0, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->e:Lcom/zykj/view/databinding/ViewFragmentBlackboardEvaluationBinding;

    .line 55
    .line 56
    const-string v3, "mBinding"

    .line 57
    .line 58
    if-nez v0, :cond_5

    .line 59
    .line 60
    invoke-static {v3}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 61
    .line 62
    .line 63
    move-object v0, v1

    .line 64
    :cond_5
    iget-object v0, v0, Lcom/zykj/view/databinding/ViewFragmentBlackboardEvaluationBinding;->p:Landroid/widget/ImageView;

    .line 65
    .line 66
    invoke-virtual {v0, v2}, Landroid/view/View;->setEnabled(Z)V

    .line 67
    .line 68
    .line 69
    iget-object v0, p0, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->e:Lcom/zykj/view/databinding/ViewFragmentBlackboardEvaluationBinding;

    .line 70
    .line 71
    if-nez v0, :cond_6

    .line 72
    .line 73
    invoke-static {v3}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 74
    .line 75
    .line 76
    goto :goto_2

    .line 77
    :cond_6
    move-object v1, v0

    .line 78
    :goto_2
    iget-object v0, v1, Lcom/zykj/view/databinding/ViewFragmentBlackboardEvaluationBinding;->l:Landroid/widget/ImageView;

    .line 79
    .line 80
    invoke-virtual {v0, v2}, Landroid/view/View;->setEnabled(Z)V

    .line 81
    .line 82
    .line 83
    return-void
.end method

.method public final u0()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->e:Lcom/zykj/view/databinding/ViewFragmentBlackboardEvaluationBinding;

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
    iget-object v0, v0, Lcom/zykj/view/databinding/ViewFragmentBlackboardEvaluationBinding;->f:Landroid/widget/ImageView;

    .line 12
    .line 13
    new-instance v1, Lmb/a;

    .line 14
    .line 15
    invoke-direct {v1, p0}, Lmb/a;-><init>(Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;)V

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0, v1}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 19
    .line 20
    .line 21
    return-void
.end method

.method public final x0(Landroid/view/View;)V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->e:Lcom/zykj/view/databinding/ViewFragmentBlackboardEvaluationBinding;

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
    iget-object v0, v0, Lcom/zykj/view/databinding/ViewFragmentBlackboardEvaluationBinding;->m:Landroid/widget/ImageView;

    .line 13
    .line 14
    const/4 v3, 0x0

    .line 15
    invoke-virtual {v0, v3}, Landroid/widget/ImageView;->setSelected(Z)V

    .line 16
    .line 17
    .line 18
    iget-object v0, p0, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->e:Lcom/zykj/view/databinding/ViewFragmentBlackboardEvaluationBinding;

    .line 19
    .line 20
    if-nez v0, :cond_1

    .line 21
    .line 22
    invoke-static {v2}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    move-object v0, v1

    .line 26
    :cond_1
    iget-object v0, v0, Lcom/zykj/view/databinding/ViewFragmentBlackboardEvaluationBinding;->k:Landroid/widget/ImageView;

    .line 27
    .line 28
    invoke-virtual {v0, v3}, Landroid/widget/ImageView;->setSelected(Z)V

    .line 29
    .line 30
    .line 31
    iget-object v0, p0, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->e:Lcom/zykj/view/databinding/ViewFragmentBlackboardEvaluationBinding;

    .line 32
    .line 33
    if-nez v0, :cond_2

    .line 34
    .line 35
    invoke-static {v2}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 36
    .line 37
    .line 38
    move-object v0, v1

    .line 39
    :cond_2
    iget-object v0, v0, Lcom/zykj/view/databinding/ViewFragmentBlackboardEvaluationBinding;->g:Landroid/widget/ImageView;

    .line 40
    .line 41
    invoke-virtual {v0, v3}, Landroid/widget/ImageView;->setSelected(Z)V

    .line 42
    .line 43
    .line 44
    iget-object v0, p0, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->e:Lcom/zykj/view/databinding/ViewFragmentBlackboardEvaluationBinding;

    .line 45
    .line 46
    if-nez v0, :cond_3

    .line 47
    .line 48
    invoke-static {v2}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 49
    .line 50
    .line 51
    move-object v0, v1

    .line 52
    :cond_3
    iget-object v0, v0, Lcom/zykj/view/databinding/ViewFragmentBlackboardEvaluationBinding;->j:Landroid/widget/ImageView;

    .line 53
    .line 54
    invoke-virtual {v0, v3}, Landroid/widget/ImageView;->setSelected(Z)V

    .line 55
    .line 56
    .line 57
    iget-object v0, p0, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->e:Lcom/zykj/view/databinding/ViewFragmentBlackboardEvaluationBinding;

    .line 58
    .line 59
    if-nez v0, :cond_4

    .line 60
    .line 61
    invoke-static {v2}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 62
    .line 63
    .line 64
    goto :goto_0

    .line 65
    :cond_4
    move-object v1, v0

    .line 66
    :goto_0
    iget-object v0, v1, Lcom/zykj/view/databinding/ViewFragmentBlackboardEvaluationBinding;->e:Landroid/widget/ImageView;

    .line 67
    .line 68
    invoke-virtual {v0, v3}, Landroid/widget/ImageView;->setSelected(Z)V

    .line 69
    .line 70
    .line 71
    const/4 v0, 0x1

    .line 72
    invoke-virtual {p1, v0}, Landroid/view/View;->setSelected(Z)V

    .line 73
    .line 74
    .line 75
    return-void
.end method

.method public final y0(Z)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->e:Lcom/zykj/view/databinding/ViewFragmentBlackboardEvaluationBinding;

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
    iget-object v0, v0, Lcom/zykj/view/databinding/ViewFragmentBlackboardEvaluationBinding;->s:Lcom/zykj/view/widget/TouchSwitchView;

    .line 12
    .line 13
    invoke-virtual {v0, p1}, Lcom/zykj/view/widget/TouchSwitchView;->setCanTouch(Z)V

    .line 14
    .line 15
    .line 16
    return-void
.end method
