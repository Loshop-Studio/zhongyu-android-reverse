.class public final Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lt5/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->a0()Lt5/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;


# direct methods
.method public constructor <init>(Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment$c;->a:Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public static synthetic e(Lkotlin/jvm/functions/Function1;Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;I)Lkotlin/Unit;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment$c;->f(Lkotlin/jvm/functions/Function1;Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;I)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static final f(Lkotlin/jvm/functions/Function1;Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;I)Lkotlin/Unit;
    .locals 1

    .line 1
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    invoke-static {p1, p2}, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->P(Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;I)V

    .line 9
    .line 10
    .line 11
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 12
    .line 13
    return-object p0
.end method


# virtual methods
.method public a(Ljava/lang/Integer;)V
    .locals 2

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    return-void

    .line 4
    :cond_0
    iget-object v0, p0, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment$c;->a:Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;

    .line 5
    .line 6
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 7
    .line 8
    .line 9
    move-result p1

    .line 10
    invoke-static {v0, p1}, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->N(Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;I)I

    .line 11
    .line 12
    .line 13
    move-result p1

    .line 14
    invoke-static {v0, p1}, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->L(Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;I)I

    .line 15
    .line 16
    .line 17
    move-result p1

    .line 18
    iget-object v0, p0, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment$c;->a:Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;

    .line 19
    .line 20
    const/4 v1, 0x1

    .line 21
    invoke-static {v0, p1, v1, v1}, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->F(Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;IZZ)V

    .line 22
    .line 23
    .line 24
    iget-object v0, p0, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment$c;->a:Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;

    .line 25
    .line 26
    invoke-static {v0, p1}, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->Q(Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;I)V

    .line 27
    .line 28
    .line 29
    return-void
.end method

.method public b(Ljava/lang/Integer;)V
    .locals 0

    .line 1
    return-void
.end method

.method public c(I)Z
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment$c;->a:Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;

    .line 2
    .line 3
    invoke-static {v0, p1}, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->M(Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;I)Z

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    return p1
.end method

.method public d(Lkotlin/jvm/functions/Function1;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment$c;->a:Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;

    .line 2
    .line 3
    if-eqz p1, :cond_0

    .line 4
    .line 5
    new-instance v1, Ld7/c0;

    .line 6
    .line 7
    invoke-direct {v1, p1, v0}, Ld7/c0;-><init>(Lkotlin/jvm/functions/Function1;Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;)V

    .line 8
    .line 9
    .line 10
    goto :goto_0

    .line 11
    :cond_0
    const/4 v1, 0x0

    .line 12
    :goto_0
    invoke-static {v0, v1}, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->O(Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;Lkotlin/jvm/functions/Function1;)V

    .line 13
    .line 14
    .line 15
    return-void
.end method

.method public dispatchTouchEvent(Landroid/view/MotionEvent;)V
    .locals 1

    .line 1
    const-string v0, "event"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment$c;->a:Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;

    .line 7
    .line 8
    invoke-static {v0}, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->J(Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;)Lcom/zykj/view/databinding/ViewFragmentBlackboardEvaluationBinding;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    if-nez v0, :cond_0

    .line 13
    .line 14
    const-string v0, "mBinding"

    .line 15
    .line 16
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    const/4 v0, 0x0

    .line 20
    :cond_0
    iget-object v0, v0, Lcom/zykj/view/databinding/ViewFragmentBlackboardEvaluationBinding;->a:Landroid/widget/FrameLayout;

    .line 21
    .line 22
    invoke-virtual {v0, p1}, Landroid/view/View;->dispatchTouchEvent(Landroid/view/MotionEvent;)Z

    .line 23
    .line 24
    .line 25
    return-void
.end method

.method public draw(Landroid/graphics/Canvas;)V
    .locals 1

    .line 1
    const-string v0, "canvas"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment$c;->a:Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;

    .line 7
    .line 8
    invoke-static {v0}, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->J(Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;)Lcom/zykj/view/databinding/ViewFragmentBlackboardEvaluationBinding;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    if-nez v0, :cond_0

    .line 13
    .line 14
    const-string v0, "mBinding"

    .line 15
    .line 16
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    const/4 v0, 0x0

    .line 20
    :cond_0
    iget-object v0, v0, Lcom/zykj/view/databinding/ViewFragmentBlackboardEvaluationBinding;->a:Landroid/widget/FrameLayout;

    .line 21
    .line 22
    invoke-virtual {v0, p1}, Landroid/view/View;->draw(Landroid/graphics/Canvas;)V

    .line 23
    .line 24
    .line 25
    return-void
.end method

.method public getHeight()F
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment$c;->a:Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->getResources()Landroid/content/res/Resources;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    sget v1, Lcom/zykj/view/R$dimen;->evaluation_pen_color_strip_height:I

    .line 8
    .line 9
    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDimension(I)F

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    return v0
.end method

.method public getWidth()F
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment$c;->a:Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->getResources()Landroid/content/res/Resources;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    sget v1, Lcom/zykj/view/R$dimen;->evaluation_pen_color_strip_width:I

    .line 8
    .line 9
    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDimension(I)F

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    return v0
.end method
