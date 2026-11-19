.class public final Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment$buildEvaluationSelectCustomColorView$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/zykj/blackboard/proxy/CustomColorView;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->buildEvaluationSelectCustomColorView()Lcom/zykj/blackboard/proxy/CustomColorView;
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
        "com/zykj/view/board/evaluation/BlackboardEvaluationFragment$buildEvaluationSelectCustomColorView$1",
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
.field final synthetic this$0:Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;


# direct methods
.method public constructor <init>(Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment$buildEvaluationSelectCustomColorView$1;->this$0:Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method private static final _set_changeColor_$lambda$1$lambda$0(Lr6/c;Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;I)Ld6/s;
    .locals 1

    .line 1
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-interface {p0, v0}, Lr6/c;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    invoke-static {p1, p2}, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->access$syncEvaluationPenColorFromEditedGraph(Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;I)V

    .line 9
    .line 10
    .line 11
    sget-object p0, Ld6/s;->a:Ld6/s;

    .line 12
    .line 13
    return-object p0
.end method

.method public static synthetic a(Lr6/c;Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;I)Ld6/s;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment$buildEvaluationSelectCustomColorView$1;->_set_changeColor_$lambda$1$lambda$0(Lr6/c;Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;I)Ld6/s;

    move-result-object p0

    return-object p0
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
    iget-object v0, p0, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment$buildEvaluationSelectCustomColorView$1;->this$0:Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;

    .line 7
    .line 8
    invoke-static {v0}, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->access$getMBinding$p(Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;)Lcom/zykj/view/databinding/ViewFragmentBlackboardEvaluationBinding;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    iget-object v0, v0, Lcom/zykj/view/databinding/ViewFragmentBlackboardEvaluationBinding;->flEvaluationPenColorProxy:Landroid/widget/FrameLayout;

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
    iget-object v0, p0, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment$buildEvaluationSelectCustomColorView$1;->this$0:Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;

    .line 7
    .line 8
    invoke-static {v0}, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->access$getMBinding$p(Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;)Lcom/zykj/view/databinding/ViewFragmentBlackboardEvaluationBinding;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    iget-object v0, v0, Lcom/zykj/view/databinding/ViewFragmentBlackboardEvaluationBinding;->flEvaluationPenColorProxy:Landroid/widget/FrameLayout;

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
    iget-object v0, p0, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment$buildEvaluationSelectCustomColorView$1;->this$0:Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;

    .line 2
    .line 3
    invoke-static {v0}, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->access$getEvaluationSelectColorChangeCallback$p(Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;)Lr6/c;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public getHeight()F
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment$buildEvaluationSelectCustomColorView$1;->this$0:Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;

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
    iget-object v0, p0, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment$buildEvaluationSelectCustomColorView$1;->this$0:Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;

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

.method public initColor(Ljava/lang/Integer;)V
    .locals 2

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    return-void

    .line 4
    :cond_0
    iget-object v0, p0, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment$buildEvaluationSelectCustomColorView$1;->this$0:Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;

    .line 5
    .line 6
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 7
    .line 8
    .line 9
    move-result p1

    .line 10
    invoke-static {v0, p1}, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->access$normalizeEvaluationPenColor(Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;I)I

    .line 11
    .line 12
    .line 13
    move-result p1

    .line 14
    invoke-static {v0, p1}, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->access$indexOfToolbarSlotMatchingColor(Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;I)I

    .line 15
    .line 16
    .line 17
    move-result p1

    .line 18
    iget-object v0, p0, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment$buildEvaluationSelectCustomColorView$1;->this$0:Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;

    .line 19
    .line 20
    const/4 v1, 0x1

    .line 21
    invoke-static {v0, p1, v1, v1}, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->access$applyEvaluationPenColorAtSlot(Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;IZZ)V

    .line 22
    .line 23
    .line 24
    iget-object v0, p0, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment$buildEvaluationSelectCustomColorView$1;->this$0:Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;

    .line 25
    .line 26
    invoke-static {v0, p1}, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->access$syncEvaluationPenRadiosAtSlot(Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;I)V

    .line 27
    .line 28
    .line 29
    return-void
.end method

.method public isColorExist(I)Z
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment$buildEvaluationSelectCustomColorView$1;->this$0:Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;

    .line 2
    .line 3
    invoke-static {v0, p1}, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->access$isEvaluationAllowedPenColor(Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;I)Z

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    return p1
.end method

.method public onColorUsed(Ljava/lang/Integer;)V
    .locals 0

    return-void
.end method

.method public setChangeColor(Lr6/c;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lr6/c;",
            ")V"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment$buildEvaluationSelectCustomColorView$1;->this$0:Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;

    .line 2
    .line 3
    if-eqz p1, :cond_0

    .line 4
    .line 5
    new-instance v1, Landroidx/navigation/d;

    .line 6
    .line 7
    const/16 v2, 0xf

    .line 8
    .line 9
    invoke-direct {v1, v2, p1, v0}, Landroidx/navigation/d;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 10
    .line 11
    .line 12
    goto :goto_0

    .line 13
    :cond_0
    const/4 v1, 0x0

    .line 14
    :goto_0
    invoke-static {v0, v1}, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->access$setEvaluationSelectColorChangeCallback$p(Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;Lr6/c;)V

    .line 15
    .line 16
    .line 17
    return-void
.end method
