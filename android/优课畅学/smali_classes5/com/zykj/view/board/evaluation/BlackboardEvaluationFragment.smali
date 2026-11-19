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
.field public static final l:Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment$a;


# instance fields
.field public final a:La6/l;

.field public b:Lcom/zykj/view/databinding/ViewFragmentBlackboardEvaluationBinding;

.field public c:Lcom/zykj/blackboard/core/edit/IBoardControl;

.field public d:Lcom/zykj/blackboard/core/edit/IPageControl;

.field public e:Lcom/zykj/blackboard/bean/BoardConfig;

.field public f:Ljava/lang/String;

.field public g:Lr5/a;

.field public h:Landroid/graphics/Rect;

.field public i:F

.field public j:F

.field public k:Lx7/l;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment$a;-><init>(Lkotlin/jvm/internal/n;)V

    sput-object v0, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->l:Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment$a;

    return-void
.end method

.method public constructor <init>()V
    .locals 3

    .line 1
    invoke-direct {p0}, Landroidx/fragment/app/Fragment;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, La6/l;

    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    const/4 v2, 0x2

    .line 8
    invoke-direct {v0, p0, v1, v2, v1}, La6/l;-><init>(Landroidx/fragment/app/Fragment;Landroidx/activity/ComponentActivity;ILkotlin/jvm/internal/n;)V

    .line 9
    .line 10
    .line 11
    iput-object v0, p0, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->a:La6/l;

    .line 12
    .line 13
    new-instance v0, Landroid/graphics/Rect;

    .line 14
    .line 15
    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    .line 16
    .line 17
    .line 18
    iput-object v0, p0, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->h:Landroid/graphics/Rect;

    .line 19
    .line 20
    return-void
.end method

.method public static synthetic A(Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;)V
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->s0(Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;)V

    return-void
.end method

.method public static synthetic B(Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;Landroid/net/Uri;)Lh7/p;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->M(Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;Landroid/net/Uri;)Lh7/p;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic C(Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->e0(Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic D(Landroid/content/DialogInterface;I)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->J(Landroid/content/DialogInterface;I)V

    return-void
.end method

.method public static final synthetic E(Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;)Lcom/zykj/view/databinding/ViewFragmentBlackboardEvaluationBinding;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->b:Lcom/zykj/view/databinding/ViewFragmentBlackboardEvaluationBinding;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic F(Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;)Lx7/l;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->k:Lx7/l;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic G(Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;Lr5/a;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->g:Lr5/a;

    .line 2
    .line 3
    return-void
.end method

.method public static final I(Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;Landroid/content/DialogInterface;I)V
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->d:Lcom/zykj/blackboard/core/edit/IPageControl;

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    const/4 p1, 0x1

    .line 6
    const/4 p2, 0x0

    .line 7
    invoke-static {p0, p2, p1, p2}, Lcom/zykj/blackboard/core/edit/IPageControl$DefaultImpls;->cleanPage$default(Lcom/zykj/blackboard/core/edit/IPageControl;Lcom/zykj/blackboard/core/graph/IGraph;ILjava/lang/Object;)V

    .line 8
    .line 9
    .line 10
    :cond_0
    return-void
.end method

.method public static final J(Landroid/content/DialogInterface;I)V
    .locals 0

    .line 1
    invoke-interface {p0}, Landroid/content/DialogInterface;->dismiss()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static final M(Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;Landroid/net/Uri;)Lh7/p;
    .locals 3

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
    invoke-static {p1}, Lcom/blankj/utilcode/util/g0;->f(Landroid/net/Uri;)Ljava/io/File;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    iget-object v0, p0, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->d:Lcom/zykj/blackboard/core/edit/IPageControl;

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
    invoke-interface {v0, v1}, Lcom/zykj/blackboard/core/edit/IPageControl;->addSpecialImage(Ljava/lang/String;)Lcom/zykj/blackboard/core/graph/group/ImageGraph;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    if-eqz v0, :cond_2

    .line 28
    .line 29
    invoke-static {p1}, Lcom/blankj/utilcode/util/k;->d(Ljava/io/File;)Z

    .line 30
    .line 31
    .line 32
    iget-object p1, p0, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->b:Lcom/zykj/view/databinding/ViewFragmentBlackboardEvaluationBinding;

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
    iget-object p1, p1, Lcom/zykj/view/databinding/ViewFragmentBlackboardEvaluationBinding;->o:Lcom/zykj/blackboard/core/canvas/SketchRecorderView;

    .line 43
    .line 44
    new-instance v1, Lr5/r;

    .line 45
    .line 46
    invoke-direct {v1, v0, p0}, Lr5/r;-><init>(Lcom/zykj/blackboard/core/graph/group/ImageGraph;Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;)V

    .line 47
    .line 48
    .line 49
    invoke-virtual {p1, v1}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 50
    .line 51
    .line 52
    :cond_2
    sget-object p0, Lh7/p;->a:Lh7/p;

    .line 53
    .line 54
    return-object p0
.end method

.method public static final N(Lcom/zykj/blackboard/core/graph/group/ImageGraph;Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;)V
    .locals 4

    .line 1
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/graph/Graph;->getRenderRectF()Landroid/graphics/RectF;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    iget p0, p0, Landroid/graphics/RectF;->top:F

    .line 6
    .line 7
    iget-object v0, p1, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->b:Lcom/zykj/view/databinding/ViewFragmentBlackboardEvaluationBinding;

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
    iget-object v0, v0, Lcom/zykj/view/databinding/ViewFragmentBlackboardEvaluationBinding;->o:Lcom/zykj/blackboard/core/canvas/SketchRecorderView;

    .line 19
    .line 20
    invoke-virtual {v0}, Landroid/view/View;->getHeight()I

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    iget-object v2, p1, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->e:Lcom/zykj/blackboard/bean/BoardConfig;

    .line 25
    .line 26
    if-eqz v2, :cond_1

    .line 27
    .line 28
    invoke-virtual {v2}, Lcom/zykj/blackboard/bean/BoardConfig;->getMoveActionConfig()Lcom/zykj/blackboard/bean/MoveActionConfig;

    .line 29
    .line 30
    .line 31
    move-result-object v2

    .line 32
    if-eqz v2, :cond_1

    .line 33
    .line 34
    invoke-virtual {v2}, Lcom/zykj/blackboard/bean/MoveActionConfig;->getMaxHeightTimes()I

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
    iget-object v0, p1, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->d:Lcom/zykj/blackboard/core/edit/IPageControl;

    .line 46
    .line 47
    if-eqz v0, :cond_2

    .line 48
    .line 49
    invoke-interface {v0}, Lcom/zykj/blackboard/core/edit/IPageControl;->areaMoveStart()V

    .line 50
    .line 51
    .line 52
    :cond_2
    iget-object v0, p1, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->d:Lcom/zykj/blackboard/core/edit/IPageControl;

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
    invoke-static {v0, v1, v2, v3, v1}, Lcom/zykj/blackboard/core/edit/IPageControl$DefaultImpls;->areaMoveEnd$default(Lcom/zykj/blackboard/core/edit/IPageControl;Ljava/lang/Float;Ljava/lang/Float;ILjava/lang/Object;)V

    .line 61
    .line 62
    .line 63
    :cond_3
    iget-object p1, p1, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->k:Lx7/l;

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
    invoke-interface {p1, p0}, Lx7/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 72
    .line 73
    .line 74
    :cond_4
    return-void
.end method

.method public static synthetic Q(Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;IIIIZILjava/lang/Object;)Landroid/graphics/Bitmap;
    .locals 6

    .line 1
    and-int/lit8 p6, p6, 0x10

    .line 2
    .line 3
    if-eqz p6, :cond_0

    .line 4
    .line 5
    const/4 p5, 0x0

    .line 6
    :cond_0
    move-object v0, p0

    .line 7
    move v1, p1

    .line 8
    move v2, p2

    .line 9
    move v3, p3

    .line 10
    move v4, p4

    .line 11
    move v5, p5

    .line 12
    invoke-virtual/range {v0 .. v5}, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->P(IIIIZ)Landroid/graphics/Bitmap;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    return-object p0
.end method

.method public static final T(Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;Lcom/zykj/blackboard/core/edit/IBoardControl;ZJ)Lh7/p;
    .locals 0

    .line 1
    const-string p2, "boardControl"

    .line 2
    .line 3
    invoke-static {p1, p2}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->c:Lcom/zykj/blackboard/core/edit/IBoardControl;

    .line 7
    .line 8
    invoke-virtual {p0}, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->V()V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0}, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->p0()V

    .line 12
    .line 13
    .line 14
    iget-object p1, p0, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->g:Lr5/a;

    .line 15
    .line 16
    if-eqz p1, :cond_0

    .line 17
    .line 18
    invoke-virtual {p0, p1}, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->O(Lr5/a;)V

    .line 19
    .line 20
    .line 21
    :cond_0
    iget-object p1, p0, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->b:Lcom/zykj/view/databinding/ViewFragmentBlackboardEvaluationBinding;

    .line 22
    .line 23
    const/4 p2, 0x0

    .line 24
    const-string p3, "mBinding"

    .line 25
    .line 26
    if-nez p1, :cond_1

    .line 27
    .line 28
    invoke-static {p3}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    move-object p1, p2

    .line 32
    :cond_1
    iget-object p1, p1, Lcom/zykj/view/databinding/ViewFragmentBlackboardEvaluationBinding;->i:Landroid/widget/ImageView;

    .line 33
    .line 34
    invoke-virtual {p1}, Landroid/view/View;->performClick()Z

    .line 35
    .line 36
    .line 37
    const/4 p1, 0x1

    .line 38
    invoke-virtual {p0, p1}, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->w0(Z)V

    .line 39
    .line 40
    .line 41
    iget-object p0, p0, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->b:Lcom/zykj/view/databinding/ViewFragmentBlackboardEvaluationBinding;

    .line 42
    .line 43
    if-nez p0, :cond_2

    .line 44
    .line 45
    invoke-static {p3}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 46
    .line 47
    .line 48
    goto :goto_0

    .line 49
    :cond_2
    move-object p2, p0

    .line 50
    :goto_0
    iget-object p0, p2, Lcom/zykj/view/databinding/ViewFragmentBlackboardEvaluationBinding;->p:Landroid/widget/TextView;

    .line 51
    .line 52
    const/16 p1, 0x8

    .line 53
    .line 54
    invoke-virtual {p0, p1}, Landroid/view/View;->setVisibility(I)V

    .line 55
    .line 56
    .line 57
    sget-object p0, Lh7/p;->a:Lh7/p;

    .line 58
    .line 59
    return-object p0
.end method

.method public static final U(Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;Ljava/lang/Throwable;)Lh7/p;
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
    invoke-static {v0, p1}, Lcom/blankj/utilcode/util/ToastUtils;->s(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 12
    .line 13
    .line 14
    const/4 p1, 0x1

    .line 15
    invoke-virtual {p0, p1}, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->w0(Z)V

    .line 16
    .line 17
    .line 18
    iget-object p0, p0, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->b:Lcom/zykj/view/databinding/ViewFragmentBlackboardEvaluationBinding;

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
    iget-object p0, p0, Lcom/zykj/view/databinding/ViewFragmentBlackboardEvaluationBinding;->p:Landroid/widget/TextView;

    .line 29
    .line 30
    const/16 p1, 0x8

    .line 31
    .line 32
    invoke-virtual {p0, p1}, Landroid/view/View;->setVisibility(I)V

    .line 33
    .line 34
    .line 35
    sget-object p0, Lh7/p;->a:Lh7/p;

    .line 36
    .line 37
    return-object p0
.end method

.method private final W()V
    .locals 9

    .line 1
    iget-object v0, p0, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->b:Lcom/zykj/view/databinding/ViewFragmentBlackboardEvaluationBinding;

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
    iget-object v0, v0, Lcom/zykj/view/databinding/ViewFragmentBlackboardEvaluationBinding;->n:Landroid/widget/ImageView;

    .line 13
    .line 14
    new-instance v3, Lr5/m;

    .line 15
    .line 16
    invoke-direct {v3, p0}, Lr5/m;-><init>(Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;)V

    .line 17
    .line 18
    .line 19
    invoke-virtual {v0, v3}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 20
    .line 21
    .line 22
    iget-object v0, p0, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->b:Lcom/zykj/view/databinding/ViewFragmentBlackboardEvaluationBinding;

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
    iget-object v0, v0, Lcom/zykj/view/databinding/ViewFragmentBlackboardEvaluationBinding;->j:Landroid/widget/ImageView;

    .line 31
    .line 32
    new-instance v3, Lr5/w;

    .line 33
    .line 34
    invoke-direct {v3, p0}, Lr5/w;-><init>(Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;)V

    .line 35
    .line 36
    .line 37
    invoke-virtual {v0, v3}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 38
    .line 39
    .line 40
    iget-object v0, p0, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->b:Lcom/zykj/view/databinding/ViewFragmentBlackboardEvaluationBinding;

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
    iget-object v0, v0, Lcom/zykj/view/databinding/ViewFragmentBlackboardEvaluationBinding;->k:Landroid/widget/ImageView;

    .line 49
    .line 50
    new-instance v3, Lr5/x;

    .line 51
    .line 52
    invoke-direct {v3, p0}, Lr5/x;-><init>(Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;)V

    .line 53
    .line 54
    .line 55
    invoke-virtual {v0, v3}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 56
    .line 57
    .line 58
    iget-object v0, p0, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->b:Lcom/zykj/view/databinding/ViewFragmentBlackboardEvaluationBinding;

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
    iget-object v0, v0, Lcom/zykj/view/databinding/ViewFragmentBlackboardEvaluationBinding;->m:Landroid/widget/ImageView;

    .line 67
    .line 68
    new-instance v3, Lr5/y;

    .line 69
    .line 70
    invoke-direct {v3, p0}, Lr5/y;-><init>(Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;)V

    .line 71
    .line 72
    .line 73
    invoke-virtual {v0, v3}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 74
    .line 75
    .line 76
    iget-object v0, p0, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->b:Lcom/zykj/view/databinding/ViewFragmentBlackboardEvaluationBinding;

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
    iget-object v0, v0, Lcom/zykj/view/databinding/ViewFragmentBlackboardEvaluationBinding;->i:Landroid/widget/ImageView;

    .line 85
    .line 86
    new-instance v3, Lr5/z;

    .line 87
    .line 88
    invoke-direct {v3, p0}, Lr5/z;-><init>(Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;)V

    .line 89
    .line 90
    .line 91
    invoke-virtual {v0, v3}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 92
    .line 93
    .line 94
    iget-object v0, p0, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->b:Lcom/zykj/view/databinding/ViewFragmentBlackboardEvaluationBinding;

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
    iget-object v0, v0, Lcom/zykj/view/databinding/ViewFragmentBlackboardEvaluationBinding;->h:Landroid/widget/ImageView;

    .line 103
    .line 104
    new-instance v3, Lr5/c;

    .line 105
    .line 106
    invoke-direct {v3, p0}, Lr5/c;-><init>(Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;)V

    .line 107
    .line 108
    .line 109
    invoke-virtual {v0, v3}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 110
    .line 111
    .line 112
    iget-object v0, p0, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->b:Lcom/zykj/view/databinding/ViewFragmentBlackboardEvaluationBinding;

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
    iget-object v0, v0, Lcom/zykj/view/databinding/ViewFragmentBlackboardEvaluationBinding;->c:Landroid/widget/ImageView;

    .line 121
    .line 122
    new-instance v3, Lr5/d;

    .line 123
    .line 124
    invoke-direct {v3, p0}, Lr5/d;-><init>(Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;)V

    .line 125
    .line 126
    .line 127
    invoke-virtual {v0, v3}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 128
    .line 129
    .line 130
    iget-object v0, p0, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->b:Lcom/zykj/view/databinding/ViewFragmentBlackboardEvaluationBinding;

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
    iget-object v0, v0, Lcom/zykj/view/databinding/ViewFragmentBlackboardEvaluationBinding;->e:Landroid/widget/ImageView;

    .line 139
    .line 140
    new-instance v3, Lr5/e;

    .line 141
    .line 142
    invoke-direct {v3, p0}, Lr5/e;-><init>(Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;)V

    .line 143
    .line 144
    .line 145
    invoke-virtual {v0, v3}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 146
    .line 147
    .line 148
    iget-object v0, p0, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->b:Lcom/zykj/view/databinding/ViewFragmentBlackboardEvaluationBinding;

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
    iget-object v3, v0, Lcom/zykj/view/databinding/ViewFragmentBlackboardEvaluationBinding;->a:Landroid/widget/ImageView;

    .line 157
    .line 158
    const-string v0, "ivCamera"

    .line 159
    .line 160
    invoke-static {v3, v0}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 161
    .line 162
    .line 163
    new-instance v6, Lr5/f;

    .line 164
    .line 165
    invoke-direct {v6, p0}, Lr5/f;-><init>(Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;)V

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
    invoke-static/range {v3 .. v8}, La6/a;->d(Landroid/view/View;JLandroid/view/View$OnClickListener;ILjava/lang/Object;)V

    .line 173
    .line 174
    .line 175
    iget-object v0, p0, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->b:Lcom/zykj/view/databinding/ViewFragmentBlackboardEvaluationBinding;

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
    iget-object v3, v0, Lcom/zykj/view/databinding/ViewFragmentBlackboardEvaluationBinding;->g:Landroid/widget/ImageView;

    .line 184
    .line 185
    const-string v0, "ivImport"

    .line 186
    .line 187
    invoke-static {v3, v0}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 188
    .line 189
    .line 190
    new-instance v6, Lr5/g;

    .line 191
    .line 192
    invoke-direct {v6, p0}, Lr5/g;-><init>(Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;)V

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
    invoke-static/range {v3 .. v8}, La6/a;->d(Landroid/view/View;JLandroid/view/View$OnClickListener;ILjava/lang/Object;)V

    .line 200
    .line 201
    .line 202
    iget-object v0, p0, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->b:Lcom/zykj/view/databinding/ViewFragmentBlackboardEvaluationBinding;

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
    iget-object v3, v0, Lcom/zykj/view/databinding/ViewFragmentBlackboardEvaluationBinding;->l:Landroid/widget/ImageView;

    .line 211
    .line 212
    const-string v0, "ivText"

    .line 213
    .line 214
    invoke-static {v3, v0}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 215
    .line 216
    .line 217
    new-instance v6, Lr5/s;

    .line 218
    .line 219
    invoke-direct {v6, p0}, Lr5/s;-><init>(Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;)V

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
    invoke-static/range {v3 .. v8}, La6/a;->d(Landroid/view/View;JLandroid/view/View$OnClickListener;ILjava/lang/Object;)V

    .line 227
    .line 228
    .line 229
    iget-object v0, p0, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->b:Lcom/zykj/view/databinding/ViewFragmentBlackboardEvaluationBinding;

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
    iget-object v0, v0, Lcom/zykj/view/databinding/ViewFragmentBlackboardEvaluationBinding;->b:Landroid/widget/ImageView;

    .line 238
    .line 239
    new-instance v3, Lr5/t;

    .line 240
    .line 241
    invoke-direct {v3, p0}, Lr5/t;-><init>(Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;)V

    .line 242
    .line 243
    .line 244
    invoke-virtual {v0, v3}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 245
    .line 246
    .line 247
    iget-object v0, p0, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->b:Lcom/zykj/view/databinding/ViewFragmentBlackboardEvaluationBinding;

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
    iget-object v0, v0, Lcom/zykj/view/databinding/ViewFragmentBlackboardEvaluationBinding;->f:Landroid/widget/ImageView;

    .line 256
    .line 257
    new-instance v3, Lr5/u;

    .line 258
    .line 259
    invoke-direct {v3, p0}, Lr5/u;-><init>(Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;)V

    .line 260
    .line 261
    .line 262
    invoke-virtual {v0, v3}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 263
    .line 264
    .line 265
    iget-object v0, p0, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->b:Lcom/zykj/view/databinding/ViewFragmentBlackboardEvaluationBinding;

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
    iget-object v0, v1, Lcom/zykj/view/databinding/ViewFragmentBlackboardEvaluationBinding;->d:Landroid/widget/ImageView;

    .line 275
    .line 276
    new-instance v1, Lr5/v;

    .line 277
    .line 278
    invoke-direct {v1, p0}, Lr5/v;-><init>(Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;)V

    .line 279
    .line 280
    .line 281
    invoke-virtual {v0, v1}, Landroid/view/View;->setOnTouchListener(Landroid/view/View$OnTouchListener;)V

    .line 282
    .line 283
    .line 284
    return-void
.end method

.method public static final X(Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;Landroid/view/View;)V
    .locals 1

    .line 1
    iget-object p1, p0, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->e:Lcom/zykj/blackboard/bean/BoardConfig;

    .line 2
    .line 3
    if-eqz p1, :cond_1

    .line 4
    .line 5
    sget-object v0, Lcom/zykj/board/EzyModeEnum$ModeEnum;->k:Lcom/zykj/board/EzyModeEnum$ModeEnum;

    .line 6
    .line 7
    invoke-virtual {p1, v0}, Lcom/zykj/blackboard/bean/BoardConfig;->setMode(Lcom/zykj/board/EzyModeEnum$ModeEnum;)V

    .line 8
    .line 9
    .line 10
    iget-object p1, p0, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->b:Lcom/zykj/view/databinding/ViewFragmentBlackboardEvaluationBinding;

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
    iget-object p1, p1, Lcom/zykj/view/databinding/ViewFragmentBlackboardEvaluationBinding;->k:Landroid/widget/ImageView;

    .line 21
    .line 22
    const-string v0, "ivSelect"

    .line 23
    .line 24
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    invoke-virtual {p0, p1}, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->u0(Landroid/view/View;)V

    .line 28
    .line 29
    .line 30
    :cond_1
    return-void
.end method

.method public static final Y(Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;Landroid/view/View;)V
    .locals 1

    .line 1
    iget-object p1, p0, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->e:Lcom/zykj/blackboard/bean/BoardConfig;

    .line 2
    .line 3
    if-eqz p1, :cond_1

    .line 4
    .line 5
    invoke-virtual {p1}, Lcom/zykj/blackboard/bean/BoardConfig;->isFingerDraw()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    xor-int/lit8 v0, v0, 0x1

    .line 10
    .line 11
    invoke-virtual {p1, v0}, Lcom/zykj/blackboard/bean/BoardConfig;->setFingerDraw(Z)V

    .line 12
    .line 13
    .line 14
    iget-object p0, p0, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->b:Lcom/zykj/view/databinding/ViewFragmentBlackboardEvaluationBinding;

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
    iget-object p0, p0, Lcom/zykj/view/databinding/ViewFragmentBlackboardEvaluationBinding;->m:Landroid/widget/ImageView;

    .line 25
    .line 26
    invoke-virtual {p1}, Lcom/zykj/blackboard/bean/BoardConfig;->isFingerDraw()Z

    .line 27
    .line 28
    .line 29
    move-result v0

    .line 30
    invoke-virtual {p0, v0}, Landroid/widget/ImageView;->setSelected(Z)V

    .line 31
    .line 32
    .line 33
    invoke-virtual {p1}, Lcom/zykj/blackboard/bean/BoardConfig;->isFingerDraw()Z

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
    invoke-static {p0}, La6/n;->q(Ljava/lang/Boolean;)V

    .line 42
    .line 43
    .line 44
    :cond_1
    return-void
.end method

.method public static final Z(Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;Landroid/view/View;)V
    .locals 6

    .line 1
    iget-object v0, p0, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->e:Lcom/zykj/blackboard/bean/BoardConfig;

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    sget-object p1, Lcom/zykj/board/EzyModeEnum$ModeEnum;->c:Lcom/zykj/board/EzyModeEnum$ModeEnum;

    .line 6
    .line 7
    invoke-virtual {v0, p1}, Lcom/zykj/blackboard/bean/BoardConfig;->setMode(Lcom/zykj/board/EzyModeEnum$ModeEnum;)V

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
    invoke-static/range {v0 .. v5}, Lcom/zykj/blackboard/bean/BoardConfig;->setDottedLine$default(Lcom/zykj/blackboard/bean/BoardConfig;ZFFILjava/lang/Object;)V

    .line 16
    .line 17
    .line 18
    iget-object p1, p0, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->b:Lcom/zykj/view/databinding/ViewFragmentBlackboardEvaluationBinding;

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
    iget-object p1, p1, Lcom/zykj/view/databinding/ViewFragmentBlackboardEvaluationBinding;->i:Landroid/widget/ImageView;

    .line 29
    .line 30
    const-string v0, "ivPen"

    .line 31
    .line 32
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    invoke-virtual {p0, p1}, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->u0(Landroid/view/View;)V

    .line 36
    .line 37
    .line 38
    :cond_1
    return-void
.end method

.method public static final a0(Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;Landroid/view/View;)V
    .locals 3

    .line 1
    iget-object p1, p0, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->e:Lcom/zykj/blackboard/bean/BoardConfig;

    .line 2
    .line 3
    if-eqz p1, :cond_1

    .line 4
    .line 5
    sget-object v0, Lcom/zykj/board/EzyModeEnum$ModeEnum;->e:Lcom/zykj/board/EzyModeEnum$ModeEnum;

    .line 6
    .line 7
    invoke-virtual {p1, v0}, Lcom/zykj/blackboard/bean/BoardConfig;->setMode(Lcom/zykj/board/EzyModeEnum$ModeEnum;)V

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
    invoke-virtual {p1, v2, v0, v1}, Lcom/zykj/blackboard/bean/BoardConfig;->setDottedLine(ZFF)V

    .line 15
    .line 16
    .line 17
    iget-object p1, p0, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->b:Lcom/zykj/view/databinding/ViewFragmentBlackboardEvaluationBinding;

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
    iget-object p1, p1, Lcom/zykj/view/databinding/ViewFragmentBlackboardEvaluationBinding;->h:Landroid/widget/ImageView;

    .line 28
    .line 29
    const-string v0, "ivLine"

    .line 30
    .line 31
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 32
    .line 33
    .line 34
    invoke-virtual {p0, p1}, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->u0(Landroid/view/View;)V

    .line 35
    .line 36
    .line 37
    :cond_1
    return-void
.end method

.method public static final b0(Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;Landroid/view/View;)V
    .locals 6

    .line 1
    iget-object v0, p0, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->e:Lcom/zykj/blackboard/bean/BoardConfig;

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    sget-object p1, Lcom/zykj/board/EzyModeEnum$ModeEnum;->e:Lcom/zykj/board/EzyModeEnum$ModeEnum;

    .line 6
    .line 7
    invoke-virtual {v0, p1}, Lcom/zykj/blackboard/bean/BoardConfig;->setMode(Lcom/zykj/board/EzyModeEnum$ModeEnum;)V

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
    invoke-static/range {v0 .. v5}, Lcom/zykj/blackboard/bean/BoardConfig;->setDottedLine$default(Lcom/zykj/blackboard/bean/BoardConfig;ZFFILjava/lang/Object;)V

    .line 16
    .line 17
    .line 18
    iget-object p1, p0, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->b:Lcom/zykj/view/databinding/ViewFragmentBlackboardEvaluationBinding;

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
    iget-object p1, p1, Lcom/zykj/view/databinding/ViewFragmentBlackboardEvaluationBinding;->c:Landroid/widget/ImageView;

    .line 29
    .line 30
    const-string v0, "ivDottedLine"

    .line 31
    .line 32
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    invoke-virtual {p0, p1}, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->u0(Landroid/view/View;)V

    .line 36
    .line 37
    .line 38
    :cond_1
    return-void
.end method

.method public static final c0(Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;Landroid/view/View;)V
    .locals 1

    .line 1
    iget-object p1, p0, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->e:Lcom/zykj/blackboard/bean/BoardConfig;

    .line 2
    .line 3
    if-eqz p1, :cond_1

    .line 4
    .line 5
    sget-object v0, Lcom/zykj/board/EzyModeEnum$ModeEnum;->f:Lcom/zykj/board/EzyModeEnum$ModeEnum;

    .line 6
    .line 7
    invoke-virtual {p1, v0}, Lcom/zykj/blackboard/bean/BoardConfig;->setMode(Lcom/zykj/board/EzyModeEnum$ModeEnum;)V

    .line 8
    .line 9
    .line 10
    iget-object p1, p0, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->b:Lcom/zykj/view/databinding/ViewFragmentBlackboardEvaluationBinding;

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
    iget-object p1, p1, Lcom/zykj/view/databinding/ViewFragmentBlackboardEvaluationBinding;->e:Landroid/widget/ImageView;

    .line 21
    .line 22
    const-string v0, "ivEraser"

    .line 23
    .line 24
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    invoke-virtual {p0, p1}, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->u0(Landroid/view/View;)V

    .line 28
    .line 29
    .line 30
    :cond_1
    return-void
.end method

.method public static final d0(Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->L()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static final e0(Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;Landroid/view/View;)V
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->g:Lr5/a;

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0}, Lr5/a;->o()Lx7/a;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    if-eqz p0, :cond_0

    .line 10
    .line 11
    invoke-interface {p0}, Lx7/a;->invoke()Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    :cond_0
    return-void
.end method

.method public static synthetic f()Lh7/p;
    .locals 1

    .line 1
    invoke-static {}, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->i0()Lh7/p;

    move-result-object v0

    return-object v0
.end method

.method public static final f0(Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;Landroid/view/View;)V
    .locals 4

    .line 1
    new-instance p1, Lu5/l;

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
    invoke-direct {p1, v0, v3, v1, v2}, Lu5/l;-><init>(Landroid/content/Context;IILkotlin/jvm/internal/n;)V

    .line 16
    .line 17
    .line 18
    new-instance v0, Lr5/k;

    .line 19
    .line 20
    invoke-direct {v0}, Lr5/k;-><init>()V

    .line 21
    .line 22
    .line 23
    new-instance v1, Lr5/l;

    .line 24
    .line 25
    invoke-direct {v1, p0}, Lr5/l;-><init>(Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;)V

    .line 26
    .line 27
    .line 28
    new-instance p0, Lr5/n;

    .line 29
    .line 30
    invoke-direct {p0}, Lr5/n;-><init>()V

    .line 31
    .line 32
    .line 33
    const-string v2, ""

    .line 34
    .line 35
    invoke-virtual {p1, v2, v0, v1, p0}, Lu5/l;->s(Ljava/lang/String;Lx7/l;Lx7/l;Lx7/a;)V

    .line 36
    .line 37
    .line 38
    return-void
.end method

.method public static synthetic g(Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->j0(Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;Landroid/view/View;)V

    return-void
.end method

.method public static final g0(Ljava/lang/String;)Lh7/p;
    .locals 1

    .line 1
    const-string v0, "it"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    sget-object p0, Lh7/p;->a:Lh7/p;

    .line 7
    .line 8
    return-object p0
.end method

.method public static synthetic h(Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;)V
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->r0(Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;)V

    return-void
.end method

.method public static final h0(Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;Ljava/lang/String;)Lh7/p;
    .locals 3

    .line 1
    const-string v0, "content"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->d:Lcom/zykj/blackboard/core/edit/IPageControl;

    .line 7
    .line 8
    if-eqz v0, :cond_1

    .line 9
    .line 10
    sget-object v1, Lcom/zykj/board/EzyPositionEnum$PositionEnum;->c:Lcom/zykj/board/EzyPositionEnum$PositionEnum;

    .line 11
    .line 12
    const/16 v2, 0x14

    .line 13
    .line 14
    invoke-interface {v0, p1, v1, v2}, Lcom/zykj/blackboard/core/edit/IPageControl;->addText(Ljava/lang/String;Lcom/zykj/board/EzyPositionEnum$PositionEnum;I)Lcom/zykj/blackboard/core/graph/group/TextGraph;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    if-eqz p1, :cond_1

    .line 19
    .line 20
    iget-object v0, p0, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->b:Lcom/zykj/view/databinding/ViewFragmentBlackboardEvaluationBinding;

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
    iget-object v0, v0, Lcom/zykj/view/databinding/ViewFragmentBlackboardEvaluationBinding;->k:Landroid/widget/ImageView;

    .line 31
    .line 32
    const-string v1, "ivSelect"

    .line 33
    .line 34
    invoke-static {v0, v1}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    invoke-virtual {p0, v0}, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->u0(Landroid/view/View;)V

    .line 38
    .line 39
    .line 40
    iget-object p0, p0, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->d:Lcom/zykj/blackboard/core/edit/IPageControl;

    .line 41
    .line 42
    if-eqz p0, :cond_1

    .line 43
    .line 44
    invoke-virtual {p1}, Lcom/zykj/blackboard/core/graph/Graph;->getId()Ljava/lang/String;

    .line 45
    .line 46
    .line 47
    move-result-object p1

    .line 48
    invoke-static {p1}, Li7/u;->e(Ljava/lang/Object;)Ljava/util/List;

    .line 49
    .line 50
    .line 51
    move-result-object p1

    .line 52
    invoke-interface {p0, p1}, Lcom/zykj/blackboard/core/edit/IPageControl;->newSelectGraph(Ljava/util/List;)V

    .line 53
    .line 54
    .line 55
    :cond_1
    sget-object p0, Lh7/p;->a:Lh7/p;

    .line 56
    .line 57
    return-object p0
.end method

.method public static synthetic i(Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;Landroid/content/DialogInterface;I)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->I(Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;Landroid/content/DialogInterface;I)V

    return-void
.end method

.method public static final i0()Lh7/p;
    .locals 1

    .line 1
    sget-object v0, Lh7/p;->a:Lh7/p;

    .line 2
    .line 3
    return-object v0
.end method

.method public static synthetic j(Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;Landroid/view/View;Landroid/view/MotionEvent;)Z
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->l0(Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;Landroid/view/View;Landroid/view/MotionEvent;)Z

    move-result p0

    return p0
.end method

.method public static final j0(Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->H()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic k(Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->Z(Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;Landroid/view/View;)V

    return-void
.end method

.method public static final k0(Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;Landroid/view/View;)V
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->g:Lr5/a;

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0}, Lr5/a;->b()Lx7/a;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    if-eqz p0, :cond_0

    .line 10
    .line 11
    invoke-interface {p0}, Lx7/a;->invoke()Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    :cond_0
    return-void
.end method

.method public static synthetic l(Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->b0(Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;Landroid/view/View;)V

    return-void
.end method

.method public static final l0(Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;Landroid/view/View;Landroid/view/MotionEvent;)Z
    .locals 0

    .line 1
    invoke-static {p2}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0, p2}, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->R(Landroid/view/MotionEvent;)V

    .line 5
    .line 6
    .line 7
    const/4 p0, 0x1

    .line 8
    return p0
.end method

.method public static synthetic m(Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->n0(Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;Landroid/view/View;)V

    return-void
.end method

.method public static final m0(Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;Landroid/view/View;)V
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->d:Lcom/zykj/blackboard/core/edit/IPageControl;

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    invoke-interface {p0}, Lcom/zykj/blackboard/core/edit/IPageControl;->withdraw()Z

    .line 6
    .line 7
    .line 8
    :cond_0
    return-void
.end method

.method public static synthetic n(Lcom/zykj/blackboard/core/graph/group/ImageGraph;Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->N(Lcom/zykj/blackboard/core/graph/group/ImageGraph;Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;)V

    return-void
.end method

.method public static final n0(Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;Landroid/view/View;)V
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->d:Lcom/zykj/blackboard/core/edit/IPageControl;

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    invoke-interface {p0}, Lcom/zykj/blackboard/core/edit/IPageControl;->recover()Z

    .line 6
    .line 7
    .line 8
    :cond_0
    return-void
.end method

.method public static synthetic o(Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->f0(Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic p(Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->X(Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic q(Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->Y(Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic r(Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->k0(Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;Landroid/view/View;)V

    return-void
.end method

.method public static final r0(Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;)V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->b:Lcom/zykj/view/databinding/ViewFragmentBlackboardEvaluationBinding;

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
    iget-object v0, v0, Lcom/zykj/view/databinding/ViewFragmentBlackboardEvaluationBinding;->d:Landroid/widget/ImageView;

    .line 13
    .line 14
    iget-object v3, p0, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->h:Landroid/graphics/Rect;

    .line 15
    .line 16
    invoke-virtual {v0, v3}, Landroid/view/View;->getGlobalVisibleRect(Landroid/graphics/Rect;)Z

    .line 17
    .line 18
    .line 19
    iget-object v0, p0, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->b:Lcom/zykj/view/databinding/ViewFragmentBlackboardEvaluationBinding;

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
    iget-object v0, v1, Lcom/zykj/view/databinding/ViewFragmentBlackboardEvaluationBinding;->q:Lcom/zykj/view/widget/TouchSwitchView;

    .line 29
    .line 30
    new-instance v1, Lr5/j;

    .line 31
    .line 32
    invoke-direct {v1, p0}, Lr5/j;-><init>(Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;)V

    .line 33
    .line 34
    .line 35
    invoke-virtual {v0, v1}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 36
    .line 37
    .line 38
    return-void
.end method

.method public static synthetic s(Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->m0(Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;Landroid/view/View;)V

    return-void
.end method

.method public static final s0(Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;)V
    .locals 6

    .line 1
    new-instance v0, Landroid/graphics/Rect;

    .line 2
    .line 3
    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-object v1, p0, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->b:Lcom/zykj/view/databinding/ViewFragmentBlackboardEvaluationBinding;

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
    iget-object v1, v1, Lcom/zykj/view/databinding/ViewFragmentBlackboardEvaluationBinding;->q:Lcom/zykj/view/widget/TouchSwitchView;

    .line 18
    .line 19
    invoke-virtual {v1, v0}, Landroid/view/View;->getGlobalVisibleRect(Landroid/graphics/Rect;)Z

    .line 20
    .line 21
    .line 22
    iget-object v1, p0, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->h:Landroid/graphics/Rect;

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
    iput v1, p0, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->i:F

    .line 51
    .line 52
    iget v0, v0, Landroid/graphics/Rect;->bottom:I

    .line 53
    .line 54
    iget-object v1, p0, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->h:Landroid/graphics/Rect;

    .line 55
    .line 56
    iget v1, v1, Landroid/graphics/Rect;->bottom:I

    .line 57
    .line 58
    sub-int/2addr v0, v1

    .line 59
    int-to-float v0, v0

    .line 60
    iput v0, p0, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->j:F

    .line 61
    .line 62
    invoke-static {}, Lcom/blankj/utilcode/util/a0;->b()I

    .line 63
    .line 64
    .line 65
    move-result v0

    .line 66
    int-to-float v0, v0

    .line 67
    iget-object v1, p0, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->g:Lr5/a;

    .line 68
    .line 69
    if-eqz v1, :cond_1

    .line 70
    .line 71
    invoke-virtual {v1}, Lr5/a;->c()F

    .line 72
    .line 73
    .line 74
    move-result v1

    .line 75
    goto :goto_0

    .line 76
    :cond_1
    const/high16 v1, 0x3f000000    # 0.5f

    .line 77
    .line 78
    :goto_0
    mul-float/2addr v0, v1

    .line 79
    invoke-virtual {p0, v0}, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->K(F)V

    .line 80
    .line 81
    .line 82
    iget-object p0, p0, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->b:Lcom/zykj/view/databinding/ViewFragmentBlackboardEvaluationBinding;

    .line 83
    .line 84
    if-nez p0, :cond_2

    .line 85
    .line 86
    invoke-static {v3}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 87
    .line 88
    .line 89
    goto :goto_1

    .line 90
    :cond_2
    move-object v2, p0

    .line 91
    :goto_1
    iget-object p0, v2, Lcom/zykj/view/databinding/ViewFragmentBlackboardEvaluationBinding;->q:Lcom/zykj/view/widget/TouchSwitchView;

    .line 92
    .line 93
    const/4 v0, 0x0

    .line 94
    invoke-virtual {p0, v0}, Landroid/view/View;->setVisibility(I)V

    .line 95
    .line 96
    .line 97
    return-void
.end method

.method public static synthetic t(Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->d0(Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;Landroid/view/View;)V

    return-void
.end method

.method private final t0()V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->W()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->S()V

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0}, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->q0()V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public static synthetic u(Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->a0(Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic v(Ljava/lang/String;)Lh7/p;
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->g0(Ljava/lang/String;)Lh7/p;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic w(Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;Ljava/lang/String;)Lh7/p;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->h0(Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;Ljava/lang/String;)Lh7/p;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic x(Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->c0(Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic y(Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;Lcom/zykj/blackboard/core/edit/IBoardControl;ZJ)Lh7/p;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2, p3, p4}, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->T(Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;Lcom/zykj/blackboard/core/edit/IBoardControl;ZJ)Lh7/p;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic z(Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;Ljava/lang/Throwable;)Lh7/p;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->U(Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;Ljava/lang/Throwable;)Lh7/p;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final H()V
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
    new-instance v2, Lr5/p;

    .line 27
    .line 28
    invoke-direct {v2, p0}, Lr5/p;-><init>(Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;)V

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
    new-instance v2, Lr5/q;

    .line 42
    .line 43
    invoke-direct {v2}, Lr5/q;-><init>()V

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

.method public final K(F)V
    .locals 5

    .line 1
    new-instance v0, Landroid/graphics/Rect;

    .line 2
    .line 3
    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-object v1, p0, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->b:Lcom/zykj/view/databinding/ViewFragmentBlackboardEvaluationBinding;

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
    iget-object v1, v1, Lcom/zykj/view/databinding/ViewFragmentBlackboardEvaluationBinding;->d:Landroid/widget/ImageView;

    .line 18
    .line 19
    invoke-virtual {v1, v0}, Landroid/view/View;->getGlobalVisibleRect(Landroid/graphics/Rect;)Z

    .line 20
    .line 21
    .line 22
    iget-object v0, p0, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->h:Landroid/graphics/Rect;

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
    iget v0, p0, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->i:F

    .line 31
    .line 32
    iget v1, p0, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->j:F

    .line 33
    .line 34
    iget-object v4, p0, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->g:Lr5/a;

    .line 35
    .line 36
    if-eqz v4, :cond_1

    .line 37
    .line 38
    invoke-virtual {v4}, Lr5/a;->a()F

    .line 39
    .line 40
    .line 41
    move-result v4

    .line 42
    goto :goto_0

    .line 43
    :cond_1
    const/4 v4, 0x0

    .line 44
    :goto_0
    sub-float/2addr v1, v4

    .line 45
    cmpg-float v4, p1, v0

    .line 46
    .line 47
    if-gez v4, :cond_2

    .line 48
    .line 49
    move p1, v0

    .line 50
    :cond_2
    cmpl-float v0, p1, v1

    .line 51
    .line 52
    if-lez v0, :cond_3

    .line 53
    .line 54
    goto :goto_1

    .line 55
    :cond_3
    move v1, p1

    .line 56
    :goto_1
    iget-object p1, p0, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->b:Lcom/zykj/view/databinding/ViewFragmentBlackboardEvaluationBinding;

    .line 57
    .line 58
    if-nez p1, :cond_4

    .line 59
    .line 60
    invoke-static {v3}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 61
    .line 62
    .line 63
    goto :goto_2

    .line 64
    :cond_4
    move-object v2, p1

    .line 65
    :goto_2
    iget-object p1, v2, Lcom/zykj/view/databinding/ViewFragmentBlackboardEvaluationBinding;->q:Lcom/zykj/view/widget/TouchSwitchView;

    .line 66
    .line 67
    invoke-virtual {p1, v1}, Landroid/view/View;->setTranslationY(F)V

    .line 68
    .line 69
    .line 70
    return-void
.end method

.method public final L()V
    .locals 8

    .line 1
    iget-object v0, p0, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->d:Lcom/zykj/blackboard/core/edit/IPageControl;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    invoke-interface {v0}, Lcom/zykj/blackboard/core/edit/IPageControl;->getImageGraphCount()I

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
    iget-object v2, p0, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->g:Lr5/a;

    .line 13
    .line 14
    if-eqz v2, :cond_1

    .line 15
    .line 16
    invoke-virtual {v2}, Lr5/a;->f()Ljava/lang/Integer;

    .line 17
    .line 18
    .line 19
    move-result-object v2

    .line 20
    if-eqz v2, :cond_1

    .line 21
    .line 22
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 23
    .line 24
    .line 25
    move-result v2

    .line 26
    goto :goto_1

    .line 27
    :cond_1
    const/4 v2, 0x3

    .line 28
    :goto_1
    if-lt v0, v2, :cond_2

    .line 29
    .line 30
    const-string v0, "\u56fe\u7247\u6570\u91cf\u5df2\u8fbe\u4e0a\u9650\uff0c\u4e0d\u53ef\u7ee7\u7eed\u63d2\u5165"

    .line 31
    .line 32
    new-array v1, v1, [Ljava/lang/Object;

    .line 33
    .line 34
    invoke-static {v0, v1}, Lcom/blankj/utilcode/util/ToastUtils;->s(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 35
    .line 36
    .line 37
    return-void

    .line 38
    :cond_2
    iget-object v2, p0, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->a:La6/l;

    .line 39
    .line 40
    new-instance v5, Lr5/o;

    .line 41
    .line 42
    invoke-direct {v5, p0}, Lr5/o;-><init>(Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;)V

    .line 43
    .line 44
    .line 45
    const/4 v6, 0x1

    .line 46
    const/4 v7, 0x0

    .line 47
    const/4 v3, 0x0

    .line 48
    const/4 v4, 0x1

    .line 49
    invoke-static/range {v2 .. v7}, La6/l;->w(La6/l;Landroid/net/Uri;ZLx7/l;ILjava/lang/Object;)V

    .line 50
    .line 51
    .line 52
    return-void
.end method

.method public final O(Lr5/a;)V
    .locals 6

    .line 1
    iget-object v0, p0, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->b:Lcom/zykj/view/databinding/ViewFragmentBlackboardEvaluationBinding;

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
    iget-object v0, v0, Lcom/zykj/view/databinding/ViewFragmentBlackboardEvaluationBinding;->c:Landroid/widget/ImageView;

    .line 13
    .line 14
    const-string v3, "ivDottedLine"

    .line 15
    .line 16
    invoke-static {v0, v3}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    invoke-virtual {p1}, Lr5/a;->i()Z

    .line 20
    .line 21
    .line 22
    move-result v3

    .line 23
    const/16 v4, 0x8

    .line 24
    .line 25
    const/4 v5, 0x0

    .line 26
    if-eqz v3, :cond_1

    .line 27
    .line 28
    move v3, v5

    .line 29
    goto :goto_0

    .line 30
    :cond_1
    move v3, v4

    .line 31
    :goto_0
    invoke-virtual {v0, v3}, Landroid/view/View;->setVisibility(I)V

    .line 32
    .line 33
    .line 34
    iget-object v0, p0, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->b:Lcom/zykj/view/databinding/ViewFragmentBlackboardEvaluationBinding;

    .line 35
    .line 36
    if-nez v0, :cond_2

    .line 37
    .line 38
    invoke-static {v2}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 39
    .line 40
    .line 41
    move-object v0, v1

    .line 42
    :cond_2
    iget-object v0, v0, Lcom/zykj/view/databinding/ViewFragmentBlackboardEvaluationBinding;->a:Landroid/widget/ImageView;

    .line 43
    .line 44
    const-string v3, "ivCamera"

    .line 45
    .line 46
    invoke-static {v0, v3}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 47
    .line 48
    .line 49
    invoke-virtual {p1}, Lr5/a;->h()Z

    .line 50
    .line 51
    .line 52
    move-result v3

    .line 53
    if-eqz v3, :cond_3

    .line 54
    .line 55
    move v3, v5

    .line 56
    goto :goto_1

    .line 57
    :cond_3
    move v3, v4

    .line 58
    :goto_1
    invoke-virtual {v0, v3}, Landroid/view/View;->setVisibility(I)V

    .line 59
    .line 60
    .line 61
    iget-object v0, p0, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->b:Lcom/zykj/view/databinding/ViewFragmentBlackboardEvaluationBinding;

    .line 62
    .line 63
    if-nez v0, :cond_4

    .line 64
    .line 65
    invoke-static {v2}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 66
    .line 67
    .line 68
    move-object v0, v1

    .line 69
    :cond_4
    iget-object v0, v0, Lcom/zykj/view/databinding/ViewFragmentBlackboardEvaluationBinding;->d:Landroid/widget/ImageView;

    .line 70
    .line 71
    const-string v3, "ivDrag"

    .line 72
    .line 73
    invoke-static {v0, v3}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 74
    .line 75
    .line 76
    invoke-virtual {p1}, Lr5/a;->e()Z

    .line 77
    .line 78
    .line 79
    move-result v3

    .line 80
    if-nez v3, :cond_5

    .line 81
    .line 82
    const/4 v3, 0x4

    .line 83
    goto :goto_2

    .line 84
    :cond_5
    move v3, v5

    .line 85
    :goto_2
    invoke-virtual {v0, v3}, Landroid/view/View;->setVisibility(I)V

    .line 86
    .line 87
    .line 88
    iget-object v0, p0, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->b:Lcom/zykj/view/databinding/ViewFragmentBlackboardEvaluationBinding;

    .line 89
    .line 90
    if-nez v0, :cond_6

    .line 91
    .line 92
    invoke-static {v2}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 93
    .line 94
    .line 95
    move-object v0, v1

    .line 96
    :cond_6
    iget-object v0, v0, Lcom/zykj/view/databinding/ViewFragmentBlackboardEvaluationBinding;->n:Landroid/widget/ImageView;

    .line 97
    .line 98
    const-string v3, "ivWithdraw"

    .line 99
    .line 100
    invoke-static {v0, v3}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 101
    .line 102
    .line 103
    invoke-virtual {p1}, Lr5/a;->n()Z

    .line 104
    .line 105
    .line 106
    move-result v3

    .line 107
    if-eqz v3, :cond_7

    .line 108
    .line 109
    move v3, v5

    .line 110
    goto :goto_3

    .line 111
    :cond_7
    move v3, v4

    .line 112
    :goto_3
    invoke-virtual {v0, v3}, Landroid/view/View;->setVisibility(I)V

    .line 113
    .line 114
    .line 115
    iget-object v0, p0, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->b:Lcom/zykj/view/databinding/ViewFragmentBlackboardEvaluationBinding;

    .line 116
    .line 117
    if-nez v0, :cond_8

    .line 118
    .line 119
    invoke-static {v2}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 120
    .line 121
    .line 122
    move-object v0, v1

    .line 123
    :cond_8
    iget-object v0, v0, Lcom/zykj/view/databinding/ViewFragmentBlackboardEvaluationBinding;->j:Landroid/widget/ImageView;

    .line 124
    .line 125
    const-string v3, "ivRecover"

    .line 126
    .line 127
    invoke-static {v0, v3}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 128
    .line 129
    .line 130
    invoke-virtual {p1}, Lr5/a;->k()Z

    .line 131
    .line 132
    .line 133
    move-result v3

    .line 134
    if-eqz v3, :cond_9

    .line 135
    .line 136
    move v3, v5

    .line 137
    goto :goto_4

    .line 138
    :cond_9
    move v3, v4

    .line 139
    :goto_4
    invoke-virtual {v0, v3}, Landroid/view/View;->setVisibility(I)V

    .line 140
    .line 141
    .line 142
    iget-object v0, p0, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->b:Lcom/zykj/view/databinding/ViewFragmentBlackboardEvaluationBinding;

    .line 143
    .line 144
    if-nez v0, :cond_a

    .line 145
    .line 146
    invoke-static {v2}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 147
    .line 148
    .line 149
    move-object v0, v1

    .line 150
    :cond_a
    iget-object v0, v0, Lcom/zykj/view/databinding/ViewFragmentBlackboardEvaluationBinding;->k:Landroid/widget/ImageView;

    .line 151
    .line 152
    const-string v3, "ivSelect"

    .line 153
    .line 154
    invoke-static {v0, v3}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 155
    .line 156
    .line 157
    invoke-virtual {p1}, Lr5/a;->l()Z

    .line 158
    .line 159
    .line 160
    move-result v3

    .line 161
    if-eqz v3, :cond_b

    .line 162
    .line 163
    move v3, v5

    .line 164
    goto :goto_5

    .line 165
    :cond_b
    move v3, v4

    .line 166
    :goto_5
    invoke-virtual {v0, v3}, Landroid/view/View;->setVisibility(I)V

    .line 167
    .line 168
    .line 169
    iget-object v0, p0, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->b:Lcom/zykj/view/databinding/ViewFragmentBlackboardEvaluationBinding;

    .line 170
    .line 171
    if-nez v0, :cond_c

    .line 172
    .line 173
    invoke-static {v2}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 174
    .line 175
    .line 176
    move-object v0, v1

    .line 177
    :cond_c
    iget-object v0, v0, Lcom/zykj/view/databinding/ViewFragmentBlackboardEvaluationBinding;->l:Landroid/widget/ImageView;

    .line 178
    .line 179
    const-string v3, "ivText"

    .line 180
    .line 181
    invoke-static {v0, v3}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 182
    .line 183
    .line 184
    invoke-virtual {p1}, Lr5/a;->m()Z

    .line 185
    .line 186
    .line 187
    move-result v3

    .line 188
    if-eqz v3, :cond_d

    .line 189
    .line 190
    move v3, v5

    .line 191
    goto :goto_6

    .line 192
    :cond_d
    move v3, v4

    .line 193
    :goto_6
    invoke-virtual {v0, v3}, Landroid/view/View;->setVisibility(I)V

    .line 194
    .line 195
    .line 196
    iget-object v0, p0, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->b:Lcom/zykj/view/databinding/ViewFragmentBlackboardEvaluationBinding;

    .line 197
    .line 198
    if-nez v0, :cond_e

    .line 199
    .line 200
    invoke-static {v2}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 201
    .line 202
    .line 203
    goto :goto_7

    .line 204
    :cond_e
    move-object v1, v0

    .line 205
    :goto_7
    iget-object v0, v1, Lcom/zykj/view/databinding/ViewFragmentBlackboardEvaluationBinding;->g:Landroid/widget/ImageView;

    .line 206
    .line 207
    const-string v1, "ivImport"

    .line 208
    .line 209
    invoke-static {v0, v1}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 210
    .line 211
    .line 212
    invoke-virtual {p1}, Lr5/a;->j()Z

    .line 213
    .line 214
    .line 215
    move-result v1

    .line 216
    if-eqz v1, :cond_f

    .line 217
    .line 218
    move v4, v5

    .line 219
    :cond_f
    invoke-virtual {v0, v4}, Landroid/view/View;->setVisibility(I)V

    .line 220
    .line 221
    .line 222
    iget-object v0, p0, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->e:Lcom/zykj/blackboard/bean/BoardConfig;

    .line 223
    .line 224
    if-eqz v0, :cond_12

    .line 225
    .line 226
    invoke-virtual {p1}, Lr5/a;->g()Ljava/lang/Integer;

    .line 227
    .line 228
    .line 229
    move-result-object v1

    .line 230
    if-eqz v1, :cond_10

    .line 231
    .line 232
    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    .line 233
    .line 234
    .line 235
    move-result v1

    .line 236
    invoke-virtual {v0}, Lcom/zykj/blackboard/bean/BoardConfig;->getMoveActionConfig()Lcom/zykj/blackboard/bean/MoveActionConfig;

    .line 237
    .line 238
    .line 239
    move-result-object v2

    .line 240
    invoke-virtual {v2, v1}, Lcom/zykj/blackboard/bean/MoveActionConfig;->setMaxHeightTimes(I)V

    .line 241
    .line 242
    .line 243
    :cond_10
    invoke-virtual {p1}, Lr5/a;->f()Ljava/lang/Integer;

    .line 244
    .line 245
    .line 246
    move-result-object v1

    .line 247
    if-eqz v1, :cond_11

    .line 248
    .line 249
    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    .line 250
    .line 251
    .line 252
    move-result v1

    .line 253
    invoke-virtual {v0, v1}, Lcom/zykj/blackboard/bean/BoardConfig;->setMaxImageSize(I)V

    .line 254
    .line 255
    .line 256
    :cond_11
    invoke-virtual {p1}, Lr5/a;->d()F

    .line 257
    .line 258
    .line 259
    move-result p1

    .line 260
    invoke-virtual {v0, p1}, Lcom/zykj/blackboard/bean/BoardConfig;->setAddTextOriginalTextSize(F)V

    .line 261
    .line 262
    .line 263
    :cond_12
    return-void
.end method

.method public final P(IIIIZ)Landroid/graphics/Bitmap;
    .locals 11

    .line 1
    iget-object v0, p0, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->d:Lcom/zykj/blackboard/core/edit/IPageControl;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    const/16 v9, 0xc0

    .line 6
    .line 7
    const/4 v10, 0x0

    .line 8
    const/4 v6, 0x1

    .line 9
    const/4 v7, 0x0

    .line 10
    const/4 v8, 0x0

    .line 11
    move v1, p1

    .line 12
    move v2, p2

    .line 13
    move v3, p3

    .line 14
    move v4, p4

    .line 15
    move/from16 v5, p5

    .line 16
    .line 17
    invoke-static/range {v0 .. v10}, Lcom/zykj/blackboard/core/edit/IPageControl$DefaultImpls;->minScreenshot$default(Lcom/zykj/blackboard/core/edit/IPageControl;IIIIZZZLcom/zykj/blackboard/core/graph/IGraph;ILjava/lang/Object;)Landroid/graphics/Bitmap;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    return-object p1

    .line 22
    :cond_0
    const/4 p1, 0x0

    .line 23
    return-object p1
.end method

.method public final R(Landroid/view/MotionEvent;)V
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
    invoke-virtual {p0, p1}, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->K(F)V

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
    invoke-virtual {p0, p1}, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->K(F)V

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
    invoke-virtual {p0, p1}, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->K(F)V

    .line 35
    .line 36
    .line 37
    return-void
.end method

.method public final S()V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->f:Ljava/lang/String;

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
    iput-object v0, p0, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->f:Ljava/lang/String;

    .line 43
    .line 44
    :cond_2
    const/4 v0, 0x0

    .line 45
    invoke-virtual {p0, v0}, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->w0(Z)V

    .line 46
    .line 47
    .line 48
    iget-object v0, p0, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->b:Lcom/zykj/view/databinding/ViewFragmentBlackboardEvaluationBinding;

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
    iget-object v0, v0, Lcom/zykj/view/databinding/ViewFragmentBlackboardEvaluationBinding;->o:Lcom/zykj/blackboard/core/canvas/SketchRecorderView;

    .line 59
    .line 60
    iget-object v1, p0, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->f:Ljava/lang/String;

    .line 61
    .line 62
    invoke-static {v1}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 63
    .line 64
    .line 65
    new-instance v2, Lr5/h;

    .line 66
    .line 67
    invoke-direct {v2, p0}, Lr5/h;-><init>(Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;)V

    .line 68
    .line 69
    .line 70
    new-instance v3, Lr5/i;

    .line 71
    .line 72
    invoke-direct {v3, p0}, Lr5/i;-><init>(Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;)V

    .line 73
    .line 74
    .line 75
    invoke-virtual {v0, v1, v2, v3}, Lcom/zykj/blackboard/core/canvas/SketchRecorderView;->ready(Ljava/lang/String;Lx7/q;Lx7/l;)V

    .line 76
    .line 77
    .line 78
    return-void
.end method

.method public final V()V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->c:Lcom/zykj/blackboard/core/edit/IBoardControl;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    invoke-interface {v0}, Lcom/zykj/blackboard/core/edit/IBoardControl;->getConfig()Lcom/zykj/blackboard/bean/BoardConfig;

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
    iput-object v0, p0, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->e:Lcom/zykj/blackboard/bean/BoardConfig;

    .line 13
    .line 14
    if-eqz v0, :cond_3

    .line 15
    .line 16
    invoke-static {}, La6/n;->h()Ljava/lang/Boolean;

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
    invoke-virtual {v0, v2}, Lcom/zykj/blackboard/bean/BoardConfig;->setFingerDraw(Z)V

    .line 30
    .line 31
    .line 32
    iget-object v2, p0, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->b:Lcom/zykj/view/databinding/ViewFragmentBlackboardEvaluationBinding;

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
    iget-object v1, v1, Lcom/zykj/view/databinding/ViewFragmentBlackboardEvaluationBinding;->m:Landroid/widget/ImageView;

    .line 44
    .line 45
    invoke-virtual {v0}, Lcom/zykj/blackboard/bean/BoardConfig;->isFingerDraw()Z

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
    invoke-virtual {v0, v1}, Lcom/zykj/blackboard/bean/BoardConfig;->setMaxImageSize(I)V

    .line 54
    .line 55
    .line 56
    invoke-virtual {v0, v3}, Lcom/zykj/blackboard/bean/BoardConfig;->setImageBackground(Z)V

    .line 57
    .line 58
    .line 59
    const/high16 v1, 0x40400000    # 3.0f

    .line 60
    .line 61
    invoke-virtual {v0, v1}, Lcom/zykj/blackboard/bean/BoardConfig;->setPaintWidth(F)V

    .line 62
    .line 63
    .line 64
    invoke-virtual {v0, v1}, Lcom/zykj/blackboard/bean/BoardConfig;->setBeelinePaintWidth(F)V

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
    invoke-virtual {v0, v1}, Lcom/zykj/blackboard/bean/BoardConfig;->setPaintColor(I)V

    .line 74
    .line 75
    .line 76
    const/4 v1, -0x1

    .line 77
    invoke-virtual {v0, v1}, Lcom/zykj/blackboard/bean/BoardConfig;->setBackgroundColor(I)V

    .line 78
    .line 79
    .line 80
    invoke-virtual {v0}, Lcom/zykj/blackboard/bean/BoardConfig;->getMoveActionConfig()Lcom/zykj/blackboard/bean/MoveActionConfig;

    .line 81
    .line 82
    .line 83
    move-result-object v1

    .line 84
    invoke-virtual {v1, v3}, Lcom/zykj/blackboard/bean/MoveActionConfig;->setMoveActionEnable(Z)V

    .line 85
    .line 86
    .line 87
    invoke-virtual {v1, v3}, Lcom/zykj/blackboard/bean/MoveActionConfig;->setVerticalTranslate(Z)V

    .line 88
    .line 89
    .line 90
    const/4 v2, 0x3

    .line 91
    invoke-virtual {v1, v2}, Lcom/zykj/blackboard/bean/MoveActionConfig;->setMaxHeightTimes(I)V

    .line 92
    .line 93
    .line 94
    invoke-virtual {v1, v3}, Lcom/zykj/blackboard/bean/MoveActionConfig;->setMaxWidthTimes(I)V

    .line 95
    .line 96
    .line 97
    const/high16 v1, 0x42880000    # 68.0f

    .line 98
    .line 99
    invoke-virtual {v0, v1}, Lcom/zykj/blackboard/bean/BoardConfig;->setAddTextOriginalTextSize(F)V

    .line 100
    .line 101
    .line 102
    invoke-virtual {v0, v1}, Lcom/zykj/blackboard/bean/BoardConfig;->setAddTextOriginalTextMinSize(F)V

    .line 103
    .line 104
    .line 105
    const/high16 v1, 0x42b00000    # 88.0f

    .line 106
    .line 107
    invoke-virtual {v0, v1}, Lcom/zykj/blackboard/bean/BoardConfig;->setAddTextOriginalTextMaxSize(F)V

    .line 108
    .line 109
    .line 110
    :cond_3
    return-void
.end method

.method public final o0()V
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
    iput-object v0, p0, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->f:Ljava/lang/String;

    .line 16
    .line 17
    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Landroidx/fragment/app/Fragment;->onCreate(Landroid/os/Bundle;)V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->o0()V

    .line 5
    .line 6
    .line 7
    return-void
.end method

.method public onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 3

    .line 1
    const-string p3, "inflater"

    .line 2
    .line 3
    invoke-static {p1, p3}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-static {p1}, Lcom/zykj/view/databinding/ViewFragmentBlackboardEvaluationBinding;->a(Landroid/view/LayoutInflater;)Lcom/zykj/view/databinding/ViewFragmentBlackboardEvaluationBinding;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    iget-object p3, p0, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->g:Lr5/a;

    .line 11
    .line 12
    const-string v0, "null cannot be cast to non-null type android.view.ViewGroup.LayoutParams"

    .line 13
    .line 14
    const-string v1, "sketchView"

    .line 15
    .line 16
    if-eqz p3, :cond_3

    .line 17
    .line 18
    invoke-virtual {p3}, Lr5/a;->e()Z

    .line 19
    .line 20
    .line 21
    move-result p3

    .line 22
    const/4 v2, 0x1

    .line 23
    if-ne p3, v2, :cond_3

    .line 24
    .line 25
    if-eqz p2, :cond_0

    .line 26
    .line 27
    invoke-virtual {p2}, Landroid/view/View;->getHeight()I

    .line 28
    .line 29
    .line 30
    move-result p2

    .line 31
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 32
    .line 33
    .line 34
    move-result-object p2

    .line 35
    goto :goto_0

    .line 36
    :cond_0
    const/4 p2, 0x0

    .line 37
    :goto_0
    iget-object p3, p1, Lcom/zykj/view/databinding/ViewFragmentBlackboardEvaluationBinding;->o:Lcom/zykj/blackboard/core/canvas/SketchRecorderView;

    .line 38
    .line 39
    invoke-static {p3, v1}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 40
    .line 41
    .line 42
    invoke-virtual {p3}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 43
    .line 44
    .line 45
    move-result-object v1

    .line 46
    if-eqz v1, :cond_2

    .line 47
    .line 48
    if-eqz p2, :cond_1

    .line 49
    .line 50
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 51
    .line 52
    .line 53
    move-result v0

    .line 54
    if-lez v0, :cond_1

    .line 55
    .line 56
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 57
    .line 58
    .line 59
    move-result p2

    .line 60
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getResources()Landroid/content/res/Resources;

    .line 61
    .line 62
    .line 63
    move-result-object v0

    .line 64
    sget v2, Lcom/zykj/view/R$dimen;->view_38:I

    .line 65
    .line 66
    invoke-virtual {v0, v2}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 67
    .line 68
    .line 69
    move-result v0

    .line 70
    sub-int/2addr p2, v0

    .line 71
    goto :goto_1

    .line 72
    :cond_1
    const/4 p2, -0x1

    .line 73
    :goto_1
    iput p2, v1, Landroid/view/ViewGroup$LayoutParams;->height:I

    .line 74
    .line 75
    invoke-virtual {p3, v1}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 76
    .line 77
    .line 78
    goto :goto_3

    .line 79
    :cond_2
    new-instance p1, Ljava/lang/NullPointerException;

    .line 80
    .line 81
    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 82
    .line 83
    .line 84
    throw p1

    .line 85
    :cond_3
    iget-object p2, p0, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->g:Lr5/a;

    .line 86
    .line 87
    if-eqz p2, :cond_4

    .line 88
    .line 89
    invoke-virtual {p2}, Lr5/a;->c()F

    .line 90
    .line 91
    .line 92
    move-result p2

    .line 93
    goto :goto_2

    .line 94
    :cond_4
    const/high16 p2, 0x3f000000    # 0.5f

    .line 95
    .line 96
    :goto_2
    const/high16 p3, 0x3f800000    # 1.0f

    .line 97
    .line 98
    sub-float/2addr p3, p2

    .line 99
    invoke-static {}, Lcom/blankj/utilcode/util/a0;->b()I

    .line 100
    .line 101
    .line 102
    move-result p2

    .line 103
    int-to-float p2, p2

    .line 104
    mul-float/2addr p2, p3

    .line 105
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getResources()Landroid/content/res/Resources;

    .line 106
    .line 107
    .line 108
    move-result-object p3

    .line 109
    sget v2, Lcom/zykj/view/R$dimen;->view_9:I

    .line 110
    .line 111
    invoke-virtual {p3, v2}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 112
    .line 113
    .line 114
    move-result p3

    .line 115
    int-to-float p3, p3

    .line 116
    sub-float/2addr p2, p3

    .line 117
    iget-object p3, p1, Lcom/zykj/view/databinding/ViewFragmentBlackboardEvaluationBinding;->o:Lcom/zykj/blackboard/core/canvas/SketchRecorderView;

    .line 118
    .line 119
    invoke-static {p3, v1}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 120
    .line 121
    .line 122
    invoke-virtual {p3}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 123
    .line 124
    .line 125
    move-result-object v1

    .line 126
    if-eqz v1, :cond_5

    .line 127
    .line 128
    float-to-int p2, p2

    .line 129
    iput p2, v1, Landroid/view/ViewGroup$LayoutParams;->height:I

    .line 130
    .line 131
    invoke-virtual {p3, v1}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 132
    .line 133
    .line 134
    :goto_3
    invoke-static {p1}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 135
    .line 136
    .line 137
    iput-object p1, p0, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->b:Lcom/zykj/view/databinding/ViewFragmentBlackboardEvaluationBinding;

    .line 138
    .line 139
    invoke-virtual {p1}, Landroidx/databinding/ViewDataBinding;->getRoot()Landroid/view/View;

    .line 140
    .line 141
    .line 142
    move-result-object p1

    .line 143
    const-string p2, "getRoot(...)"

    .line 144
    .line 145
    invoke-static {p1, p2}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 146
    .line 147
    .line 148
    return-object p1

    .line 149
    :cond_5
    new-instance p1, Ljava/lang/NullPointerException;

    .line 150
    .line 151
    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 152
    .line 153
    .line 154
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
    iput-object v0, p0, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->c:Lcom/zykj/blackboard/core/edit/IBoardControl;

    .line 6
    .line 7
    iput-object v0, p0, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->e:Lcom/zykj/blackboard/bean/BoardConfig;

    .line 8
    .line 9
    iput-object v0, p0, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->d:Lcom/zykj/blackboard/core/edit/IPageControl;

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
    invoke-direct {p0}, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->t0()V

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public final p0()V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->c:Lcom/zykj/blackboard/core/edit/IBoardControl;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    invoke-interface {v0}, Lcom/zykj/blackboard/core/edit/IBoardControl;->getCurrentPage()Lcom/zykj/blackboard/core/edit/IPageControl;

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
    iput-object v0, p0, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->d:Lcom/zykj/blackboard/core/edit/IPageControl;

    .line 13
    .line 14
    const/4 v2, 0x0

    .line 15
    if-nez v0, :cond_2

    .line 16
    .line 17
    iget-object v0, p0, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->c:Lcom/zykj/blackboard/core/edit/IBoardControl;

    .line 18
    .line 19
    if-eqz v0, :cond_1

    .line 20
    .line 21
    const/4 v3, 0x3

    .line 22
    invoke-static {v0, v2, v1, v3, v1}, Lcom/zykj/blackboard/core/edit/IBoardControl$DefaultImpls;->createPage$default(Lcom/zykj/blackboard/core/edit/IBoardControl;ZLx7/a;ILjava/lang/Object;)Lcom/zykj/blackboard/core/edit/IPageControl;

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
    iput-object v0, p0, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->d:Lcom/zykj/blackboard/core/edit/IPageControl;

    .line 29
    .line 30
    :cond_2
    iget-object v0, p0, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->d:Lcom/zykj/blackboard/core/edit/IPageControl;

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
    invoke-interface {v0, v3}, Lcom/zykj/blackboard/core/edit/IPageControl;->setAreaMoveListener(Lcom/zykj/blackboard/listener/IAreaMoveListener;)V

    .line 40
    .line 41
    .line 42
    :cond_3
    iget-object v0, p0, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->d:Lcom/zykj/blackboard/core/edit/IPageControl;

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
    invoke-interface {v0, v3}, Lcom/zykj/blackboard/core/edit/IPageControl;->addWithdrawListener(Lcom/zykj/blackboard/listener/WithdrawListener;)V

    .line 52
    .line 53
    .line 54
    :cond_4
    iget-object v0, p0, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->b:Lcom/zykj/view/databinding/ViewFragmentBlackboardEvaluationBinding;

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
    iget-object v0, v0, Lcom/zykj/view/databinding/ViewFragmentBlackboardEvaluationBinding;->n:Landroid/widget/ImageView;

    .line 65
    .line 66
    invoke-virtual {v0, v2}, Landroid/view/View;->setEnabled(Z)V

    .line 67
    .line 68
    .line 69
    iget-object v0, p0, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->b:Lcom/zykj/view/databinding/ViewFragmentBlackboardEvaluationBinding;

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
    iget-object v0, v1, Lcom/zykj/view/databinding/ViewFragmentBlackboardEvaluationBinding;->j:Landroid/widget/ImageView;

    .line 79
    .line 80
    invoke-virtual {v0, v2}, Landroid/view/View;->setEnabled(Z)V

    .line 81
    .line 82
    .line 83
    return-void
.end method

.method public final q0()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->b:Lcom/zykj/view/databinding/ViewFragmentBlackboardEvaluationBinding;

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
    iget-object v0, v0, Lcom/zykj/view/databinding/ViewFragmentBlackboardEvaluationBinding;->d:Landroid/widget/ImageView;

    .line 12
    .line 13
    new-instance v1, Lr5/b;

    .line 14
    .line 15
    invoke-direct {v1, p0}, Lr5/b;-><init>(Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;)V

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0, v1}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 19
    .line 20
    .line 21
    return-void
.end method

.method public final u0(Landroid/view/View;)V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->b:Lcom/zykj/view/databinding/ViewFragmentBlackboardEvaluationBinding;

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
    iget-object v0, v0, Lcom/zykj/view/databinding/ViewFragmentBlackboardEvaluationBinding;->k:Landroid/widget/ImageView;

    .line 13
    .line 14
    const/4 v3, 0x0

    .line 15
    invoke-virtual {v0, v3}, Landroid/widget/ImageView;->setSelected(Z)V

    .line 16
    .line 17
    .line 18
    iget-object v0, p0, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->b:Lcom/zykj/view/databinding/ViewFragmentBlackboardEvaluationBinding;

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
    iget-object v0, v0, Lcom/zykj/view/databinding/ViewFragmentBlackboardEvaluationBinding;->i:Landroid/widget/ImageView;

    .line 27
    .line 28
    invoke-virtual {v0, v3}, Landroid/widget/ImageView;->setSelected(Z)V

    .line 29
    .line 30
    .line 31
    iget-object v0, p0, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->b:Lcom/zykj/view/databinding/ViewFragmentBlackboardEvaluationBinding;

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
    iget-object v0, v0, Lcom/zykj/view/databinding/ViewFragmentBlackboardEvaluationBinding;->e:Landroid/widget/ImageView;

    .line 40
    .line 41
    invoke-virtual {v0, v3}, Landroid/widget/ImageView;->setSelected(Z)V

    .line 42
    .line 43
    .line 44
    iget-object v0, p0, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->b:Lcom/zykj/view/databinding/ViewFragmentBlackboardEvaluationBinding;

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
    iget-object v0, v0, Lcom/zykj/view/databinding/ViewFragmentBlackboardEvaluationBinding;->h:Landroid/widget/ImageView;

    .line 53
    .line 54
    invoke-virtual {v0, v3}, Landroid/widget/ImageView;->setSelected(Z)V

    .line 55
    .line 56
    .line 57
    iget-object v0, p0, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->b:Lcom/zykj/view/databinding/ViewFragmentBlackboardEvaluationBinding;

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
    iget-object v0, v1, Lcom/zykj/view/databinding/ViewFragmentBlackboardEvaluationBinding;->c:Landroid/widget/ImageView;

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

.method public final v0(Lx7/l;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->k:Lx7/l;

    .line 2
    .line 3
    return-void
.end method

.method public final w0(Z)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->b:Lcom/zykj/view/databinding/ViewFragmentBlackboardEvaluationBinding;

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
    iget-object v0, v0, Lcom/zykj/view/databinding/ViewFragmentBlackboardEvaluationBinding;->q:Lcom/zykj/view/widget/TouchSwitchView;

    .line 12
    .line 13
    invoke-virtual {v0, p1}, Lcom/zykj/view/widget/TouchSwitchView;->setCanTouch(Z)V

    .line 14
    .line 15
    .line 16
    return-void
.end method
