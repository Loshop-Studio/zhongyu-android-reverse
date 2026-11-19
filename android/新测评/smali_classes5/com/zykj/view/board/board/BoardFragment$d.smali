.class public final Lcom/zykj/view/board/board/BoardFragment$d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ld5/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/view/board/board/BoardFragment;->r0()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lcom/zykj/view/board/board/BoardFragment;


# direct methods
.method public constructor <init>(Lcom/zykj/view/board/board/BoardFragment;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/zykj/view/board/board/BoardFragment$d;->a:Lcom/zykj/view/board/board/BoardFragment;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public a(Ljava/lang/Integer;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/zykj/view/board/board/BoardFragment$d;->a:Lcom/zykj/view/board/board/BoardFragment;

    .line 2
    .line 3
    invoke-static {v0}, Lcom/zykj/view/board/board/BoardFragment;->g0(Lcom/zykj/view/board/board/BoardFragment;)Lcom/zykj/view/databinding/ViewFragmentBoardBinding;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    const/4 v1, 0x0

    .line 8
    const-string v2, "mBinding"

    .line 9
    .line 10
    if-nez v0, :cond_0

    .line 11
    .line 12
    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    move-object v0, v1

    .line 16
    :cond_0
    iget-object v0, v0, Lcom/zykj/view/databinding/ViewFragmentBoardBinding;->a:Lcom/zykj/view/widget/customColor/CustomColorFrameLayout;

    .line 17
    .line 18
    invoke-virtual {v0, p1}, Lcom/zykj/view/widget/customColor/CustomColorFrameLayout;->setSelectColor(Ljava/lang/Integer;)V

    .line 19
    .line 20
    .line 21
    iget-object p1, p0, Lcom/zykj/view/board/board/BoardFragment$d;->a:Lcom/zykj/view/board/board/BoardFragment;

    .line 22
    .line 23
    invoke-static {p1}, Lcom/zykj/view/board/board/BoardFragment;->g0(Lcom/zykj/view/board/board/BoardFragment;)Lcom/zykj/view/databinding/ViewFragmentBoardBinding;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    if-nez p1, :cond_1

    .line 28
    .line 29
    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_1
    move-object v1, p1

    .line 34
    :goto_0
    iget-object p1, v1, Lcom/zykj/view/databinding/ViewFragmentBoardBinding;->a:Lcom/zykj/view/widget/customColor/CustomColorFrameLayout;

    .line 35
    .line 36
    invoke-virtual {p1}, Lcom/zykj/view/widget/customColor/CustomColorFrameLayout;->c()V

    .line 37
    .line 38
    .line 39
    return-void
.end method

.method public b(Ljava/lang/Integer;)V
    .locals 1

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    sget-object v0, Lb8/s;->a:Lb8/s;

    .line 8
    .line 9
    invoke-virtual {v0, p1}, Lb8/s;->d(I)V

    .line 10
    .line 11
    .line 12
    :cond_0
    return-void
.end method

.method public c(I)Z
    .locals 1

    .line 1
    sget-object v0, Lb8/b;->a:Lb8/b;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lb8/b;->b(I)Z

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    return p1
.end method

.method public d(Lkotlin/jvm/functions/Function1;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/view/board/board/BoardFragment$d;->a:Lcom/zykj/view/board/board/BoardFragment;

    .line 2
    .line 3
    invoke-static {v0}, Lcom/zykj/view/board/board/BoardFragment;->g0(Lcom/zykj/view/board/board/BoardFragment;)Lcom/zykj/view/databinding/ViewFragmentBoardBinding;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    const-string v0, "mBinding"

    .line 10
    .line 11
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    const/4 v0, 0x0

    .line 15
    :cond_0
    iget-object v0, v0, Lcom/zykj/view/databinding/ViewFragmentBoardBinding;->a:Lcom/zykj/view/widget/customColor/CustomColorFrameLayout;

    .line 16
    .line 17
    invoke-virtual {v0, p1}, Lcom/zykj/view/widget/customColor/CustomColorFrameLayout;->setOnColorChangeListener(Lkotlin/jvm/functions/Function1;)V

    .line 18
    .line 19
    .line 20
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
    iget-object v0, p0, Lcom/zykj/view/board/board/BoardFragment$d;->a:Lcom/zykj/view/board/board/BoardFragment;

    .line 7
    .line 8
    invoke-static {v0}, Lcom/zykj/view/board/board/BoardFragment;->g0(Lcom/zykj/view/board/board/BoardFragment;)Lcom/zykj/view/databinding/ViewFragmentBoardBinding;

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
    iget-object v0, v0, Lcom/zykj/view/databinding/ViewFragmentBoardBinding;->a:Lcom/zykj/view/widget/customColor/CustomColorFrameLayout;

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
    iget-object v0, p0, Lcom/zykj/view/board/board/BoardFragment$d;->a:Lcom/zykj/view/board/board/BoardFragment;

    .line 7
    .line 8
    invoke-static {v0}, Lcom/zykj/view/board/board/BoardFragment;->g0(Lcom/zykj/view/board/board/BoardFragment;)Lcom/zykj/view/databinding/ViewFragmentBoardBinding;

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
    iget-object v0, v0, Lcom/zykj/view/databinding/ViewFragmentBoardBinding;->a:Lcom/zykj/view/widget/customColor/CustomColorFrameLayout;

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
    iget-object v0, p0, Lcom/zykj/view/board/board/BoardFragment$d;->a:Lcom/zykj/view/board/board/BoardFragment;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->requireContext()Landroid/content/Context;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    sget v1, Lcom/zykj/view/R$dimen;->view_138:I

    .line 12
    .line 13
    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDimension(I)F

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    return v0
.end method

.method public getWidth()F
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/zykj/view/board/board/BoardFragment$d;->a:Lcom/zykj/view/board/board/BoardFragment;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->requireContext()Landroid/content/Context;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    sget v1, Lcom/zykj/view/R$dimen;->view_174:I

    .line 12
    .line 13
    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDimension(I)F

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    return v0
.end method
