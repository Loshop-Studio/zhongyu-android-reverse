.class Lcom/xuexiang/xui/widget/picker/RulerView$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/animation/ValueAnimator$AnimatorUpdateListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/xuexiang/xui/widget/picker/RulerView;->autoVelocityScroll(I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/xuexiang/xui/widget/picker/RulerView;


# direct methods
.method constructor <init>(Lcom/xuexiang/xui/widget/picker/RulerView;)V
    .locals 0

    iput-object p1, p0, Lcom/xuexiang/xui/widget/picker/RulerView$1;->this$0:Lcom/xuexiang/xui/widget/picker/RulerView;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onAnimationUpdate(Landroid/animation/ValueAnimator;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/picker/RulerView$1;->this$0:Lcom/xuexiang/xui/widget/picker/RulerView;

    invoke-static {v0}, Lcom/xuexiang/xui/widget/picker/RulerView;->access$000(Lcom/xuexiang/xui/widget/picker/RulerView;)F

    move-result v1

    invoke-virtual {p1}, Landroid/animation/ValueAnimator;->getAnimatedValue()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    int-to-float p1, p1

    add-float/2addr v1, p1

    invoke-static {v0, v1}, Lcom/xuexiang/xui/widget/picker/RulerView;->access$002(Lcom/xuexiang/xui/widget/picker/RulerView;F)F

    .line 2
    iget-object p1, p0, Lcom/xuexiang/xui/widget/picker/RulerView$1;->this$0:Lcom/xuexiang/xui/widget/picker/RulerView;

    invoke-static {p1}, Lcom/xuexiang/xui/widget/picker/RulerView;->access$000(Lcom/xuexiang/xui/widget/picker/RulerView;)F

    move-result p1

    iget-object v0, p0, Lcom/xuexiang/xui/widget/picker/RulerView$1;->this$0:Lcom/xuexiang/xui/widget/picker/RulerView;

    invoke-static {v0}, Lcom/xuexiang/xui/widget/picker/RulerView;->access$100(Lcom/xuexiang/xui/widget/picker/RulerView;)I

    move-result v0

    int-to-float v0, v0

    const/high16 v1, 0x40000000    # 2.0f

    div-float/2addr v0, v1

    cmpl-float p1, p1, v0

    if-ltz p1, :cond_0

    .line 3
    iget-object p1, p0, Lcom/xuexiang/xui/widget/picker/RulerView$1;->this$0:Lcom/xuexiang/xui/widget/picker/RulerView;

    invoke-static {p1}, Lcom/xuexiang/xui/widget/picker/RulerView;->access$100(Lcom/xuexiang/xui/widget/picker/RulerView;)I

    move-result v0

    int-to-float v0, v0

    div-float/2addr v0, v1

    invoke-static {p1, v0}, Lcom/xuexiang/xui/widget/picker/RulerView;->access$002(Lcom/xuexiang/xui/widget/picker/RulerView;F)F

    goto :goto_0

    .line 4
    :cond_0
    iget-object p1, p0, Lcom/xuexiang/xui/widget/picker/RulerView$1;->this$0:Lcom/xuexiang/xui/widget/picker/RulerView;

    invoke-static {p1}, Lcom/xuexiang/xui/widget/picker/RulerView;->access$000(Lcom/xuexiang/xui/widget/picker/RulerView;)F

    move-result p1

    iget-object v0, p0, Lcom/xuexiang/xui/widget/picker/RulerView$1;->this$0:Lcom/xuexiang/xui/widget/picker/RulerView;

    invoke-static {v0}, Lcom/xuexiang/xui/widget/picker/RulerView;->access$200(Lcom/xuexiang/xui/widget/picker/RulerView;)I

    move-result v1

    int-to-float v1, v1

    invoke-static {v0, v1}, Lcom/xuexiang/xui/widget/picker/RulerView;->access$300(Lcom/xuexiang/xui/widget/picker/RulerView;F)F

    move-result v0

    cmpg-float p1, p1, v0

    if-gtz p1, :cond_1

    .line 5
    iget-object p1, p0, Lcom/xuexiang/xui/widget/picker/RulerView$1;->this$0:Lcom/xuexiang/xui/widget/picker/RulerView;

    invoke-static {p1}, Lcom/xuexiang/xui/widget/picker/RulerView;->access$200(Lcom/xuexiang/xui/widget/picker/RulerView;)I

    move-result v0

    int-to-float v0, v0

    invoke-static {p1, v0}, Lcom/xuexiang/xui/widget/picker/RulerView;->access$300(Lcom/xuexiang/xui/widget/picker/RulerView;F)F

    move-result v0

    invoke-static {p1, v0}, Lcom/xuexiang/xui/widget/picker/RulerView;->access$002(Lcom/xuexiang/xui/widget/picker/RulerView;F)F

    .line 6
    :cond_1
    :goto_0
    iget-object p1, p0, Lcom/xuexiang/xui/widget/picker/RulerView$1;->this$0:Lcom/xuexiang/xui/widget/picker/RulerView;

    invoke-static {p1}, Lcom/xuexiang/xui/widget/picker/RulerView;->access$000(Lcom/xuexiang/xui/widget/picker/RulerView;)F

    move-result v0

    invoke-static {p1, v0}, Lcom/xuexiang/xui/widget/picker/RulerView;->access$402(Lcom/xuexiang/xui/widget/picker/RulerView;F)F

    .line 7
    iget-object p1, p0, Lcom/xuexiang/xui/widget/picker/RulerView$1;->this$0:Lcom/xuexiang/xui/widget/picker/RulerView;

    invoke-virtual {p1}, Landroid/view/View;->invalidate()V

    return-void
.end method
