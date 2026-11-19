.class public final Lcom/zykj/view/board/board/BoardFragment$initBasicData$4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/zykj/blackboard/proxy/CustomColorView;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/view/board/board/BoardFragment;->initBasicData()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000?\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0010\u0007\n\u0002\u0008\u0006*\u0001\u0000\u0008\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016\u00a2\u0006\u0004\u0008\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\u0008\u001a\u00020\u0007H\u0016\u00a2\u0006\u0004\u0008\t\u0010\nJ\u0019\u0010\r\u001a\u00020\u00042\u0008\u0010\u000c\u001a\u0004\u0018\u00010\u000bH\u0016\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000c\u001a\u00020\u000bH\u0016\u00a2\u0006\u0004\u0008\u0010\u0010\u0011J\u0019\u0010\u0012\u001a\u00020\u00042\u0008\u0010\u000c\u001a\u0004\u0018\u00010\u000bH\u0016\u00a2\u0006\u0004\u0008\u0012\u0010\u000eR@\u0010\u0019\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00132\u0014\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00138V@VX\u0096\u000e\u00a2\u0006\u000c\u001a\u0004\u0008\u0015\u0010\u0016\"\u0004\u0008\u0017\u0010\u0018R\u0014\u0010\u001d\u001a\u00020\u001a8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u001b\u0010\u001cR\u0014\u0010\u001f\u001a\u00020\u001a8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u001e\u0010\u001c\u00a8\u0006 "
    }
    d2 = {
        "com/zykj/view/board/board/BoardFragment$initBasicData$4",
        "Lcom/zykj/blackboard/proxy/CustomColorView;",
        "Landroid/view/MotionEvent;",
        "event",
        "Ld6/s;",
        "dispatchTouchEvent",
        "(Landroid/view/MotionEvent;)V",
        "Landroid/graphics/Canvas;",
        "canvas",
        "draw",
        "(Landroid/graphics/Canvas;)V",
        "",
        "color",
        "initColor",
        "(Ljava/lang/Integer;)V",
        "",
        "isColorExist",
        "(I)Z",
        "onColorUsed",
        "Lkotlin/Function1;",
        "value",
        "getChangeColor",
        "()Lr6/c;",
        "setChangeColor",
        "(Lr6/c;)V",
        "changeColor",
        "",
        "getWidth",
        "()F",
        "width",
        "getHeight",
        "height",
        "view_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field final synthetic this$0:Lcom/zykj/view/board/board/BoardFragment;


# direct methods
.method public constructor <init>(Lcom/zykj/view/board/board/BoardFragment;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/zykj/view/board/board/BoardFragment$initBasicData$4;->this$0:Lcom/zykj/view/board/board/BoardFragment;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public dispatchTouchEvent(Landroid/view/MotionEvent;)V
    .locals 1

    .line 1
    const-string v0, "event"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/zykj/view/board/board/BoardFragment$initBasicData$4;->this$0:Lcom/zykj/view/board/board/BoardFragment;

    .line 7
    .line 8
    invoke-static {v0}, Lcom/zykj/view/board/board/BoardFragment;->access$getMBinding$p(Lcom/zykj/view/board/board/BoardFragment;)Lcom/zykj/view/databinding/ViewFragmentBoardBinding;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    iget-object v0, v0, Lcom/zykj/view/databinding/ViewFragmentBoardBinding;->flBoardCustomColor:Lcom/zykj/view/widget/customColor/CustomColorFrameLayout;

    .line 15
    .line 16
    invoke-virtual {v0, p1}, Landroid/view/View;->dispatchTouchEvent(Landroid/view/MotionEvent;)Z

    .line 17
    .line 18
    .line 19
    return-void

    .line 20
    :cond_0
    const-string p1, "mBinding"

    .line 21
    .line 22
    invoke-static {p1}, Lkotlin/jvm/internal/k;->p(Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    const/4 p1, 0x0

    .line 26
    throw p1
.end method

.method public draw(Landroid/graphics/Canvas;)V
    .locals 1

    .line 1
    const-string v0, "canvas"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/zykj/view/board/board/BoardFragment$initBasicData$4;->this$0:Lcom/zykj/view/board/board/BoardFragment;

    .line 7
    .line 8
    invoke-static {v0}, Lcom/zykj/view/board/board/BoardFragment;->access$getMBinding$p(Lcom/zykj/view/board/board/BoardFragment;)Lcom/zykj/view/databinding/ViewFragmentBoardBinding;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    iget-object v0, v0, Lcom/zykj/view/databinding/ViewFragmentBoardBinding;->flBoardCustomColor:Lcom/zykj/view/widget/customColor/CustomColorFrameLayout;

    .line 15
    .line 16
    invoke-virtual {v0, p1}, Landroid/view/View;->draw(Landroid/graphics/Canvas;)V

    .line 17
    .line 18
    .line 19
    return-void

    .line 20
    :cond_0
    const-string p1, "mBinding"

    .line 21
    .line 22
    invoke-static {p1}, Lkotlin/jvm/internal/k;->p(Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    const/4 p1, 0x0

    .line 26
    throw p1
.end method

.method public getChangeColor()Lr6/c;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lr6/c;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/zykj/view/board/board/BoardFragment$initBasicData$4;->this$0:Lcom/zykj/view/board/board/BoardFragment;

    .line 2
    .line 3
    invoke-static {v0}, Lcom/zykj/view/board/board/BoardFragment;->access$getMBinding$p(Lcom/zykj/view/board/board/BoardFragment;)Lcom/zykj/view/databinding/ViewFragmentBoardBinding;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    iget-object v0, v0, Lcom/zykj/view/databinding/ViewFragmentBoardBinding;->flBoardCustomColor:Lcom/zykj/view/widget/customColor/CustomColorFrameLayout;

    .line 10
    .line 11
    invoke-virtual {v0}, Lcom/zykj/view/widget/customColor/CustomColorFrameLayout;->getOnColorChangeListener()Lr6/c;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    return-object v0

    .line 16
    :cond_0
    const-string v0, "mBinding"

    .line 17
    .line 18
    invoke-static {v0}, Lkotlin/jvm/internal/k;->p(Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    const/4 v0, 0x0

    .line 22
    throw v0
.end method

.method public getHeight()F
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/zykj/view/board/board/BoardFragment$initBasicData$4;->this$0:Lcom/zykj/view/board/board/BoardFragment;

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
    iget-object v0, p0, Lcom/zykj/view/board/board/BoardFragment$initBasicData$4;->this$0:Lcom/zykj/view/board/board/BoardFragment;

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

.method public initColor(Ljava/lang/Integer;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/zykj/view/board/board/BoardFragment$initBasicData$4;->this$0:Lcom/zykj/view/board/board/BoardFragment;

    .line 2
    .line 3
    invoke-static {v0}, Lcom/zykj/view/board/board/BoardFragment;->access$getMBinding$p(Lcom/zykj/view/board/board/BoardFragment;)Lcom/zykj/view/databinding/ViewFragmentBoardBinding;

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
    if-eqz v0, :cond_1

    .line 11
    .line 12
    iget-object v0, v0, Lcom/zykj/view/databinding/ViewFragmentBoardBinding;->flBoardCustomColor:Lcom/zykj/view/widget/customColor/CustomColorFrameLayout;

    .line 13
    .line 14
    invoke-virtual {v0, p1}, Lcom/zykj/view/widget/customColor/CustomColorFrameLayout;->setSelectColor(Ljava/lang/Integer;)V

    .line 15
    .line 16
    .line 17
    iget-object p1, p0, Lcom/zykj/view/board/board/BoardFragment$initBasicData$4;->this$0:Lcom/zykj/view/board/board/BoardFragment;

    .line 18
    .line 19
    invoke-static {p1}, Lcom/zykj/view/board/board/BoardFragment;->access$getMBinding$p(Lcom/zykj/view/board/board/BoardFragment;)Lcom/zykj/view/databinding/ViewFragmentBoardBinding;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    if-eqz p1, :cond_0

    .line 24
    .line 25
    iget-object p1, p1, Lcom/zykj/view/databinding/ViewFragmentBoardBinding;->flBoardCustomColor:Lcom/zykj/view/widget/customColor/CustomColorFrameLayout;

    .line 26
    .line 27
    invoke-virtual {p1}, Lcom/zykj/view/widget/customColor/CustomColorFrameLayout;->refresh()V

    .line 28
    .line 29
    .line 30
    return-void

    .line 31
    :cond_0
    invoke-static {v2}, Lkotlin/jvm/internal/k;->p(Ljava/lang/String;)V

    .line 32
    .line 33
    .line 34
    throw v1

    .line 35
    :cond_1
    invoke-static {v2}, Lkotlin/jvm/internal/k;->p(Ljava/lang/String;)V

    .line 36
    .line 37
    .line 38
    throw v1
.end method

.method public isColorExist(I)Z
    .locals 1

    .line 1
    sget-object v0, Lcom/zykj/view/utils/CustomColorManager;->INSTANCE:Lcom/zykj/view/utils/CustomColorManager;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lcom/zykj/view/utils/CustomColorManager;->isColorExist(I)Z

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    return p1
.end method

.method public onColorUsed(Ljava/lang/Integer;)V
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
    sget-object v0, Lcom/zykj/view/utils/LatestColorManager;->INSTANCE:Lcom/zykj/view/utils/LatestColorManager;

    .line 8
    .line 9
    invoke-virtual {v0, p1}, Lcom/zykj/view/utils/LatestColorManager;->putNewColor(I)V

    .line 10
    .line 11
    .line 12
    :cond_0
    return-void
.end method

.method public setChangeColor(Lr6/c;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lr6/c;",
            ")V"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/zykj/view/board/board/BoardFragment$initBasicData$4;->this$0:Lcom/zykj/view/board/board/BoardFragment;

    .line 2
    .line 3
    invoke-static {v0}, Lcom/zykj/view/board/board/BoardFragment;->access$getMBinding$p(Lcom/zykj/view/board/board/BoardFragment;)Lcom/zykj/view/databinding/ViewFragmentBoardBinding;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    iget-object v0, v0, Lcom/zykj/view/databinding/ViewFragmentBoardBinding;->flBoardCustomColor:Lcom/zykj/view/widget/customColor/CustomColorFrameLayout;

    .line 10
    .line 11
    invoke-virtual {v0, p1}, Lcom/zykj/view/widget/customColor/CustomColorFrameLayout;->setOnColorChangeListener(Lr6/c;)V

    .line 12
    .line 13
    .line 14
    return-void

    .line 15
    :cond_0
    const-string p1, "mBinding"

    .line 16
    .line 17
    invoke-static {p1}, Lkotlin/jvm/internal/k;->p(Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    const/4 p1, 0x0

    .line 21
    throw p1
.end method
