.class Lcom/xuexiang/xui/widget/button/shinebutton/ShineView$4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/animation/ValueAnimator$AnimatorUpdateListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/xuexiang/xui/widget/button/shinebutton/ShineView;->showAnimation(Lcom/xuexiang/xui/widget/button/shinebutton/ShineButton;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/xuexiang/xui/widget/button/shinebutton/ShineView;


# direct methods
.method constructor <init>(Lcom/xuexiang/xui/widget/button/shinebutton/ShineView;)V
    .locals 0

    iput-object p1, p0, Lcom/xuexiang/xui/widget/button/shinebutton/ShineView$4;->this$0:Lcom/xuexiang/xui/widget/button/shinebutton/ShineView;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onAnimationUpdate(Landroid/animation/ValueAnimator;)V
    .locals 7

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/button/shinebutton/ShineView$4;->this$0:Lcom/xuexiang/xui/widget/button/shinebutton/ShineView;

    invoke-virtual {p1}, Landroid/animation/ValueAnimator;->getAnimatedValue()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Float;

    invoke-virtual {p1}, Ljava/lang/Float;->floatValue()F

    move-result p1

    invoke-static {v0, p1}, Lcom/xuexiang/xui/widget/button/shinebutton/ShineView;->access$202(Lcom/xuexiang/xui/widget/button/shinebutton/ShineView;F)F

    .line 2
    iget-object p1, p0, Lcom/xuexiang/xui/widget/button/shinebutton/ShineView$4;->this$0:Lcom/xuexiang/xui/widget/button/shinebutton/ShineView;

    invoke-static {p1}, Lcom/xuexiang/xui/widget/button/shinebutton/ShineView;->access$300(Lcom/xuexiang/xui/widget/button/shinebutton/ShineView;)I

    move-result p1

    const/high16 v0, 0x40000000    # 2.0f

    const/high16 v1, 0x40400000    # 3.0f

    if-eqz p1, :cond_0

    iget-object p1, p0, Lcom/xuexiang/xui/widget/button/shinebutton/ShineView$4;->this$0:Lcom/xuexiang/xui/widget/button/shinebutton/ShineView;

    invoke-static {p1}, Lcom/xuexiang/xui/widget/button/shinebutton/ShineView;->access$300(Lcom/xuexiang/xui/widget/button/shinebutton/ShineView;)I

    move-result p1

    if-lez p1, :cond_0

    .line 3
    iget-object p1, p0, Lcom/xuexiang/xui/widget/button/shinebutton/ShineView$4;->this$0:Lcom/xuexiang/xui/widget/button/shinebutton/ShineView;

    invoke-static {p1}, Lcom/xuexiang/xui/widget/button/shinebutton/ShineView;->access$500(Lcom/xuexiang/xui/widget/button/shinebutton/ShineView;)Landroid/graphics/Paint;

    move-result-object p1

    iget-object v2, p0, Lcom/xuexiang/xui/widget/button/shinebutton/ShineView$4;->this$0:Lcom/xuexiang/xui/widget/button/shinebutton/ShineView;

    invoke-static {v2}, Lcom/xuexiang/xui/widget/button/shinebutton/ShineView;->access$300(Lcom/xuexiang/xui/widget/button/shinebutton/ShineView;)I

    move-result v2

    int-to-float v2, v2

    iget-object v3, p0, Lcom/xuexiang/xui/widget/button/shinebutton/ShineView$4;->this$0:Lcom/xuexiang/xui/widget/button/shinebutton/ShineView;

    invoke-static {v3}, Lcom/xuexiang/xui/widget/button/shinebutton/ShineView;->access$400(Lcom/xuexiang/xui/widget/button/shinebutton/ShineView;)F

    move-result v3

    iget-object v4, p0, Lcom/xuexiang/xui/widget/button/shinebutton/ShineView$4;->this$0:Lcom/xuexiang/xui/widget/button/shinebutton/ShineView;

    invoke-static {v4}, Lcom/xuexiang/xui/widget/button/shinebutton/ShineView;->access$200(Lcom/xuexiang/xui/widget/button/shinebutton/ShineView;)F

    move-result v4

    sub-float/2addr v3, v4

    mul-float v2, v2, v3

    invoke-virtual {p1, v2}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 4
    iget-object p1, p0, Lcom/xuexiang/xui/widget/button/shinebutton/ShineView$4;->this$0:Lcom/xuexiang/xui/widget/button/shinebutton/ShineView;

    invoke-static {p1}, Lcom/xuexiang/xui/widget/button/shinebutton/ShineView;->access$600(Lcom/xuexiang/xui/widget/button/shinebutton/ShineView;)Landroid/graphics/Paint;

    move-result-object p1

    iget-object v2, p0, Lcom/xuexiang/xui/widget/button/shinebutton/ShineView$4;->this$0:Lcom/xuexiang/xui/widget/button/shinebutton/ShineView;

    invoke-static {v2}, Lcom/xuexiang/xui/widget/button/shinebutton/ShineView;->access$300(Lcom/xuexiang/xui/widget/button/shinebutton/ShineView;)I

    move-result v2

    int-to-float v2, v2

    div-float/2addr v2, v1

    mul-float v2, v2, v0

    iget-object v0, p0, Lcom/xuexiang/xui/widget/button/shinebutton/ShineView$4;->this$0:Lcom/xuexiang/xui/widget/button/shinebutton/ShineView;

    invoke-static {v0}, Lcom/xuexiang/xui/widget/button/shinebutton/ShineView;->access$400(Lcom/xuexiang/xui/widget/button/shinebutton/ShineView;)F

    move-result v0

    iget-object v3, p0, Lcom/xuexiang/xui/widget/button/shinebutton/ShineView$4;->this$0:Lcom/xuexiang/xui/widget/button/shinebutton/ShineView;

    invoke-static {v3}, Lcom/xuexiang/xui/widget/button/shinebutton/ShineView;->access$200(Lcom/xuexiang/xui/widget/button/shinebutton/ShineView;)F

    move-result v3

    sub-float/2addr v0, v3

    mul-float v2, v2, v0

    invoke-virtual {p1, v2}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    goto :goto_0

    .line 5
    :cond_0
    iget-object p1, p0, Lcom/xuexiang/xui/widget/button/shinebutton/ShineView$4;->this$0:Lcom/xuexiang/xui/widget/button/shinebutton/ShineView;

    invoke-static {p1}, Lcom/xuexiang/xui/widget/button/shinebutton/ShineView;->access$500(Lcom/xuexiang/xui/widget/button/shinebutton/ShineView;)Landroid/graphics/Paint;

    move-result-object p1

    iget-object v2, p0, Lcom/xuexiang/xui/widget/button/shinebutton/ShineView$4;->this$0:Lcom/xuexiang/xui/widget/button/shinebutton/ShineView;

    invoke-static {v2}, Lcom/xuexiang/xui/widget/button/shinebutton/ShineView;->access$700(Lcom/xuexiang/xui/widget/button/shinebutton/ShineView;)I

    move-result v2

    int-to-float v2, v2

    div-float/2addr v2, v0

    iget-object v0, p0, Lcom/xuexiang/xui/widget/button/shinebutton/ShineView$4;->this$0:Lcom/xuexiang/xui/widget/button/shinebutton/ShineView;

    invoke-static {v0}, Lcom/xuexiang/xui/widget/button/shinebutton/ShineView;->access$400(Lcom/xuexiang/xui/widget/button/shinebutton/ShineView;)F

    move-result v0

    iget-object v3, p0, Lcom/xuexiang/xui/widget/button/shinebutton/ShineView$4;->this$0:Lcom/xuexiang/xui/widget/button/shinebutton/ShineView;

    invoke-static {v3}, Lcom/xuexiang/xui/widget/button/shinebutton/ShineView;->access$200(Lcom/xuexiang/xui/widget/button/shinebutton/ShineView;)F

    move-result v3

    sub-float/2addr v0, v3

    mul-float v2, v2, v0

    invoke-virtual {p1, v2}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 6
    iget-object p1, p0, Lcom/xuexiang/xui/widget/button/shinebutton/ShineView$4;->this$0:Lcom/xuexiang/xui/widget/button/shinebutton/ShineView;

    invoke-static {p1}, Lcom/xuexiang/xui/widget/button/shinebutton/ShineView;->access$600(Lcom/xuexiang/xui/widget/button/shinebutton/ShineView;)Landroid/graphics/Paint;

    move-result-object p1

    iget-object v0, p0, Lcom/xuexiang/xui/widget/button/shinebutton/ShineView$4;->this$0:Lcom/xuexiang/xui/widget/button/shinebutton/ShineView;

    invoke-static {v0}, Lcom/xuexiang/xui/widget/button/shinebutton/ShineView;->access$700(Lcom/xuexiang/xui/widget/button/shinebutton/ShineView;)I

    move-result v0

    int-to-float v0, v0

    div-float/2addr v0, v1

    iget-object v2, p0, Lcom/xuexiang/xui/widget/button/shinebutton/ShineView$4;->this$0:Lcom/xuexiang/xui/widget/button/shinebutton/ShineView;

    invoke-static {v2}, Lcom/xuexiang/xui/widget/button/shinebutton/ShineView;->access$400(Lcom/xuexiang/xui/widget/button/shinebutton/ShineView;)F

    move-result v2

    iget-object v3, p0, Lcom/xuexiang/xui/widget/button/shinebutton/ShineView$4;->this$0:Lcom/xuexiang/xui/widget/button/shinebutton/ShineView;

    invoke-static {v3}, Lcom/xuexiang/xui/widget/button/shinebutton/ShineView;->access$200(Lcom/xuexiang/xui/widget/button/shinebutton/ShineView;)F

    move-result v3

    sub-float/2addr v2, v3

    mul-float v0, v0, v2

    invoke-virtual {p1, v0}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 7
    :goto_0
    iget-object p1, p0, Lcom/xuexiang/xui/widget/button/shinebutton/ShineView$4;->this$0:Lcom/xuexiang/xui/widget/button/shinebutton/ShineView;

    invoke-static {p1}, Lcom/xuexiang/xui/widget/button/shinebutton/ShineView;->access$1100(Lcom/xuexiang/xui/widget/button/shinebutton/ShineView;)Landroid/graphics/RectF;

    move-result-object p1

    iget-object v0, p0, Lcom/xuexiang/xui/widget/button/shinebutton/ShineView$4;->this$0:Lcom/xuexiang/xui/widget/button/shinebutton/ShineView;

    invoke-static {v0}, Lcom/xuexiang/xui/widget/button/shinebutton/ShineView;->access$800(Lcom/xuexiang/xui/widget/button/shinebutton/ShineView;)I

    move-result v0

    int-to-float v0, v0

    iget-object v2, p0, Lcom/xuexiang/xui/widget/button/shinebutton/ShineView$4;->this$0:Lcom/xuexiang/xui/widget/button/shinebutton/ShineView;

    invoke-static {v2}, Lcom/xuexiang/xui/widget/button/shinebutton/ShineView;->access$700(Lcom/xuexiang/xui/widget/button/shinebutton/ShineView;)I

    move-result v2

    int-to-float v2, v2

    iget-object v3, p0, Lcom/xuexiang/xui/widget/button/shinebutton/ShineView$4;->this$0:Lcom/xuexiang/xui/widget/button/shinebutton/ShineView;

    invoke-static {v3}, Lcom/xuexiang/xui/widget/button/shinebutton/ShineView;->access$400(Lcom/xuexiang/xui/widget/button/shinebutton/ShineView;)F

    move-result v3

    sub-float v3, v1, v3

    div-float/2addr v2, v3

    iget-object v3, p0, Lcom/xuexiang/xui/widget/button/shinebutton/ShineView$4;->this$0:Lcom/xuexiang/xui/widget/button/shinebutton/ShineView;

    invoke-static {v3}, Lcom/xuexiang/xui/widget/button/shinebutton/ShineView;->access$200(Lcom/xuexiang/xui/widget/button/shinebutton/ShineView;)F

    move-result v3

    mul-float v2, v2, v3

    sub-float/2addr v0, v2

    iget-object v2, p0, Lcom/xuexiang/xui/widget/button/shinebutton/ShineView$4;->this$0:Lcom/xuexiang/xui/widget/button/shinebutton/ShineView;

    invoke-static {v2}, Lcom/xuexiang/xui/widget/button/shinebutton/ShineView;->access$900(Lcom/xuexiang/xui/widget/button/shinebutton/ShineView;)I

    move-result v2

    int-to-float v2, v2

    iget-object v3, p0, Lcom/xuexiang/xui/widget/button/shinebutton/ShineView$4;->this$0:Lcom/xuexiang/xui/widget/button/shinebutton/ShineView;

    invoke-static {v3}, Lcom/xuexiang/xui/widget/button/shinebutton/ShineView;->access$1000(Lcom/xuexiang/xui/widget/button/shinebutton/ShineView;)I

    move-result v3

    int-to-float v3, v3

    iget-object v4, p0, Lcom/xuexiang/xui/widget/button/shinebutton/ShineView$4;->this$0:Lcom/xuexiang/xui/widget/button/shinebutton/ShineView;

    invoke-static {v4}, Lcom/xuexiang/xui/widget/button/shinebutton/ShineView;->access$400(Lcom/xuexiang/xui/widget/button/shinebutton/ShineView;)F

    move-result v4

    sub-float v4, v1, v4

    div-float/2addr v3, v4

    iget-object v4, p0, Lcom/xuexiang/xui/widget/button/shinebutton/ShineView$4;->this$0:Lcom/xuexiang/xui/widget/button/shinebutton/ShineView;

    invoke-static {v4}, Lcom/xuexiang/xui/widget/button/shinebutton/ShineView;->access$200(Lcom/xuexiang/xui/widget/button/shinebutton/ShineView;)F

    move-result v4

    mul-float v3, v3, v4

    sub-float/2addr v2, v3

    iget-object v3, p0, Lcom/xuexiang/xui/widget/button/shinebutton/ShineView$4;->this$0:Lcom/xuexiang/xui/widget/button/shinebutton/ShineView;

    invoke-static {v3}, Lcom/xuexiang/xui/widget/button/shinebutton/ShineView;->access$800(Lcom/xuexiang/xui/widget/button/shinebutton/ShineView;)I

    move-result v3

    int-to-float v3, v3

    iget-object v4, p0, Lcom/xuexiang/xui/widget/button/shinebutton/ShineView$4;->this$0:Lcom/xuexiang/xui/widget/button/shinebutton/ShineView;

    invoke-static {v4}, Lcom/xuexiang/xui/widget/button/shinebutton/ShineView;->access$700(Lcom/xuexiang/xui/widget/button/shinebutton/ShineView;)I

    move-result v4

    int-to-float v4, v4

    iget-object v5, p0, Lcom/xuexiang/xui/widget/button/shinebutton/ShineView$4;->this$0:Lcom/xuexiang/xui/widget/button/shinebutton/ShineView;

    invoke-static {v5}, Lcom/xuexiang/xui/widget/button/shinebutton/ShineView;->access$400(Lcom/xuexiang/xui/widget/button/shinebutton/ShineView;)F

    move-result v5

    sub-float v5, v1, v5

    div-float/2addr v4, v5

    iget-object v5, p0, Lcom/xuexiang/xui/widget/button/shinebutton/ShineView$4;->this$0:Lcom/xuexiang/xui/widget/button/shinebutton/ShineView;

    invoke-static {v5}, Lcom/xuexiang/xui/widget/button/shinebutton/ShineView;->access$200(Lcom/xuexiang/xui/widget/button/shinebutton/ShineView;)F

    move-result v5

    mul-float v4, v4, v5

    add-float/2addr v3, v4

    iget-object v4, p0, Lcom/xuexiang/xui/widget/button/shinebutton/ShineView$4;->this$0:Lcom/xuexiang/xui/widget/button/shinebutton/ShineView;

    invoke-static {v4}, Lcom/xuexiang/xui/widget/button/shinebutton/ShineView;->access$900(Lcom/xuexiang/xui/widget/button/shinebutton/ShineView;)I

    move-result v4

    int-to-float v4, v4

    iget-object v5, p0, Lcom/xuexiang/xui/widget/button/shinebutton/ShineView$4;->this$0:Lcom/xuexiang/xui/widget/button/shinebutton/ShineView;

    invoke-static {v5}, Lcom/xuexiang/xui/widget/button/shinebutton/ShineView;->access$1000(Lcom/xuexiang/xui/widget/button/shinebutton/ShineView;)I

    move-result v5

    int-to-float v5, v5

    iget-object v6, p0, Lcom/xuexiang/xui/widget/button/shinebutton/ShineView$4;->this$0:Lcom/xuexiang/xui/widget/button/shinebutton/ShineView;

    invoke-static {v6}, Lcom/xuexiang/xui/widget/button/shinebutton/ShineView;->access$400(Lcom/xuexiang/xui/widget/button/shinebutton/ShineView;)F

    move-result v6

    sub-float v6, v1, v6

    div-float/2addr v5, v6

    iget-object v6, p0, Lcom/xuexiang/xui/widget/button/shinebutton/ShineView$4;->this$0:Lcom/xuexiang/xui/widget/button/shinebutton/ShineView;

    invoke-static {v6}, Lcom/xuexiang/xui/widget/button/shinebutton/ShineView;->access$200(Lcom/xuexiang/xui/widget/button/shinebutton/ShineView;)F

    move-result v6

    mul-float v5, v5, v6

    add-float/2addr v4, v5

    invoke-virtual {p1, v0, v2, v3, v4}, Landroid/graphics/RectF;->set(FFFF)V

    .line 8
    iget-object p1, p0, Lcom/xuexiang/xui/widget/button/shinebutton/ShineView$4;->this$0:Lcom/xuexiang/xui/widget/button/shinebutton/ShineView;

    invoke-static {p1}, Lcom/xuexiang/xui/widget/button/shinebutton/ShineView;->access$1300(Lcom/xuexiang/xui/widget/button/shinebutton/ShineView;)Landroid/graphics/RectF;

    move-result-object p1

    iget-object v0, p0, Lcom/xuexiang/xui/widget/button/shinebutton/ShineView$4;->this$0:Lcom/xuexiang/xui/widget/button/shinebutton/ShineView;

    invoke-static {v0}, Lcom/xuexiang/xui/widget/button/shinebutton/ShineView;->access$800(Lcom/xuexiang/xui/widget/button/shinebutton/ShineView;)I

    move-result v0

    int-to-float v0, v0

    iget-object v2, p0, Lcom/xuexiang/xui/widget/button/shinebutton/ShineView$4;->this$0:Lcom/xuexiang/xui/widget/button/shinebutton/ShineView;

    invoke-static {v2}, Lcom/xuexiang/xui/widget/button/shinebutton/ShineView;->access$700(Lcom/xuexiang/xui/widget/button/shinebutton/ShineView;)I

    move-result v2

    int-to-float v2, v2

    iget-object v3, p0, Lcom/xuexiang/xui/widget/button/shinebutton/ShineView$4;->this$0:Lcom/xuexiang/xui/widget/button/shinebutton/ShineView;

    invoke-static {v3}, Lcom/xuexiang/xui/widget/button/shinebutton/ShineView;->access$400(Lcom/xuexiang/xui/widget/button/shinebutton/ShineView;)F

    move-result v3

    sub-float v3, v1, v3

    iget-object v4, p0, Lcom/xuexiang/xui/widget/button/shinebutton/ShineView$4;->this$0:Lcom/xuexiang/xui/widget/button/shinebutton/ShineView;

    invoke-static {v4}, Lcom/xuexiang/xui/widget/button/shinebutton/ShineView;->access$1200(Lcom/xuexiang/xui/widget/button/shinebutton/ShineView;)F

    move-result v4

    add-float/2addr v3, v4

    div-float/2addr v2, v3

    iget-object v3, p0, Lcom/xuexiang/xui/widget/button/shinebutton/ShineView$4;->this$0:Lcom/xuexiang/xui/widget/button/shinebutton/ShineView;

    invoke-static {v3}, Lcom/xuexiang/xui/widget/button/shinebutton/ShineView;->access$200(Lcom/xuexiang/xui/widget/button/shinebutton/ShineView;)F

    move-result v3

    mul-float v2, v2, v3

    sub-float/2addr v0, v2

    iget-object v2, p0, Lcom/xuexiang/xui/widget/button/shinebutton/ShineView$4;->this$0:Lcom/xuexiang/xui/widget/button/shinebutton/ShineView;

    invoke-static {v2}, Lcom/xuexiang/xui/widget/button/shinebutton/ShineView;->access$900(Lcom/xuexiang/xui/widget/button/shinebutton/ShineView;)I

    move-result v2

    int-to-float v2, v2

    iget-object v3, p0, Lcom/xuexiang/xui/widget/button/shinebutton/ShineView$4;->this$0:Lcom/xuexiang/xui/widget/button/shinebutton/ShineView;

    invoke-static {v3}, Lcom/xuexiang/xui/widget/button/shinebutton/ShineView;->access$1000(Lcom/xuexiang/xui/widget/button/shinebutton/ShineView;)I

    move-result v3

    int-to-float v3, v3

    iget-object v4, p0, Lcom/xuexiang/xui/widget/button/shinebutton/ShineView$4;->this$0:Lcom/xuexiang/xui/widget/button/shinebutton/ShineView;

    invoke-static {v4}, Lcom/xuexiang/xui/widget/button/shinebutton/ShineView;->access$400(Lcom/xuexiang/xui/widget/button/shinebutton/ShineView;)F

    move-result v4

    sub-float v4, v1, v4

    iget-object v5, p0, Lcom/xuexiang/xui/widget/button/shinebutton/ShineView$4;->this$0:Lcom/xuexiang/xui/widget/button/shinebutton/ShineView;

    invoke-static {v5}, Lcom/xuexiang/xui/widget/button/shinebutton/ShineView;->access$1200(Lcom/xuexiang/xui/widget/button/shinebutton/ShineView;)F

    move-result v5

    add-float/2addr v4, v5

    div-float/2addr v3, v4

    iget-object v4, p0, Lcom/xuexiang/xui/widget/button/shinebutton/ShineView$4;->this$0:Lcom/xuexiang/xui/widget/button/shinebutton/ShineView;

    invoke-static {v4}, Lcom/xuexiang/xui/widget/button/shinebutton/ShineView;->access$200(Lcom/xuexiang/xui/widget/button/shinebutton/ShineView;)F

    move-result v4

    mul-float v3, v3, v4

    sub-float/2addr v2, v3

    iget-object v3, p0, Lcom/xuexiang/xui/widget/button/shinebutton/ShineView$4;->this$0:Lcom/xuexiang/xui/widget/button/shinebutton/ShineView;

    invoke-static {v3}, Lcom/xuexiang/xui/widget/button/shinebutton/ShineView;->access$800(Lcom/xuexiang/xui/widget/button/shinebutton/ShineView;)I

    move-result v3

    int-to-float v3, v3

    iget-object v4, p0, Lcom/xuexiang/xui/widget/button/shinebutton/ShineView$4;->this$0:Lcom/xuexiang/xui/widget/button/shinebutton/ShineView;

    invoke-static {v4}, Lcom/xuexiang/xui/widget/button/shinebutton/ShineView;->access$700(Lcom/xuexiang/xui/widget/button/shinebutton/ShineView;)I

    move-result v4

    int-to-float v4, v4

    iget-object v5, p0, Lcom/xuexiang/xui/widget/button/shinebutton/ShineView$4;->this$0:Lcom/xuexiang/xui/widget/button/shinebutton/ShineView;

    invoke-static {v5}, Lcom/xuexiang/xui/widget/button/shinebutton/ShineView;->access$400(Lcom/xuexiang/xui/widget/button/shinebutton/ShineView;)F

    move-result v5

    sub-float v5, v1, v5

    iget-object v6, p0, Lcom/xuexiang/xui/widget/button/shinebutton/ShineView$4;->this$0:Lcom/xuexiang/xui/widget/button/shinebutton/ShineView;

    invoke-static {v6}, Lcom/xuexiang/xui/widget/button/shinebutton/ShineView;->access$1200(Lcom/xuexiang/xui/widget/button/shinebutton/ShineView;)F

    move-result v6

    add-float/2addr v5, v6

    div-float/2addr v4, v5

    iget-object v5, p0, Lcom/xuexiang/xui/widget/button/shinebutton/ShineView$4;->this$0:Lcom/xuexiang/xui/widget/button/shinebutton/ShineView;

    invoke-static {v5}, Lcom/xuexiang/xui/widget/button/shinebutton/ShineView;->access$200(Lcom/xuexiang/xui/widget/button/shinebutton/ShineView;)F

    move-result v5

    mul-float v4, v4, v5

    add-float/2addr v3, v4

    iget-object v4, p0, Lcom/xuexiang/xui/widget/button/shinebutton/ShineView$4;->this$0:Lcom/xuexiang/xui/widget/button/shinebutton/ShineView;

    invoke-static {v4}, Lcom/xuexiang/xui/widget/button/shinebutton/ShineView;->access$900(Lcom/xuexiang/xui/widget/button/shinebutton/ShineView;)I

    move-result v4

    int-to-float v4, v4

    iget-object v5, p0, Lcom/xuexiang/xui/widget/button/shinebutton/ShineView$4;->this$0:Lcom/xuexiang/xui/widget/button/shinebutton/ShineView;

    invoke-static {v5}, Lcom/xuexiang/xui/widget/button/shinebutton/ShineView;->access$1000(Lcom/xuexiang/xui/widget/button/shinebutton/ShineView;)I

    move-result v5

    int-to-float v5, v5

    iget-object v6, p0, Lcom/xuexiang/xui/widget/button/shinebutton/ShineView$4;->this$0:Lcom/xuexiang/xui/widget/button/shinebutton/ShineView;

    invoke-static {v6}, Lcom/xuexiang/xui/widget/button/shinebutton/ShineView;->access$400(Lcom/xuexiang/xui/widget/button/shinebutton/ShineView;)F

    move-result v6

    sub-float/2addr v1, v6

    iget-object v6, p0, Lcom/xuexiang/xui/widget/button/shinebutton/ShineView$4;->this$0:Lcom/xuexiang/xui/widget/button/shinebutton/ShineView;

    invoke-static {v6}, Lcom/xuexiang/xui/widget/button/shinebutton/ShineView;->access$1200(Lcom/xuexiang/xui/widget/button/shinebutton/ShineView;)F

    move-result v6

    add-float/2addr v1, v6

    div-float/2addr v5, v1

    iget-object v1, p0, Lcom/xuexiang/xui/widget/button/shinebutton/ShineView$4;->this$0:Lcom/xuexiang/xui/widget/button/shinebutton/ShineView;

    invoke-static {v1}, Lcom/xuexiang/xui/widget/button/shinebutton/ShineView;->access$200(Lcom/xuexiang/xui/widget/button/shinebutton/ShineView;)F

    move-result v1

    mul-float v5, v5, v1

    add-float/2addr v4, v5

    invoke-virtual {p1, v0, v2, v3, v4}, Landroid/graphics/RectF;->set(FFFF)V

    .line 9
    iget-object p1, p0, Lcom/xuexiang/xui/widget/button/shinebutton/ShineView$4;->this$0:Lcom/xuexiang/xui/widget/button/shinebutton/ShineView;

    invoke-virtual {p1}, Landroid/view/View;->invalidate()V

    return-void
.end method
