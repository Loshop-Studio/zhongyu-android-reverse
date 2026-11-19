.class public Lb/c/a/e/f/c/f/a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroid/animation/ValueAnimator$AnimatorUpdateListener;


# instance fields
.field public final synthetic a:Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;


# direct methods
.method public constructor <init>(Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;)V
    .locals 0

    iput-object p1, p0, Lb/c/a/e/f/c/f/a;->a:Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onAnimationUpdate(Landroid/animation/ValueAnimator;)V
    .locals 2

    iget-object v0, p0, Lb/c/a/e/f/c/f/a;->a:Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;

    .line 1
    iget-object v0, v0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->k:Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$h;

    const-string v1, "animAlpha"

    .line 2
    invoke-virtual {p1, v1}, Landroid/animation/ValueAnimator;->getAnimatedValue(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    iput v1, v0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$h;->f:I

    iget-object v0, p0, Lb/c/a/e/f/c/f/a;->a:Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;

    .line 3
    iget-object v0, v0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->k:Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$h;

    const-string v1, "animScale"

    .line 4
    invoke-virtual {p1, v1}, Landroid/animation/ValueAnimator;->getAnimatedValue(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Float;

    invoke-virtual {v1}, Ljava/lang/Float;->floatValue()F

    move-result v1

    iput v1, v0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$h;->g:F

    iget-object v0, p0, Lb/c/a/e/f/c/f/a;->a:Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;

    .line 5
    iget-object v0, v0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->k:Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$h;

    const-string v1, "animLeft"

    .line 6
    invoke-virtual {p1, v1}, Landroid/animation/ValueAnimator;->getAnimatedValue(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Float;

    invoke-virtual {v1}, Ljava/lang/Float;->floatValue()F

    move-result v1

    iput v1, v0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$h;->b:F

    iget-object v0, p0, Lb/c/a/e/f/c/f/a;->a:Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;

    .line 7
    iget-object v0, v0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->k:Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$h;

    const-string v1, "animTop"

    .line 8
    invoke-virtual {p1, v1}, Landroid/animation/ValueAnimator;->getAnimatedValue(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Float;

    invoke-virtual {v1}, Ljava/lang/Float;->floatValue()F

    move-result v1

    iput v1, v0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$h;->c:F

    iget-object v0, p0, Lb/c/a/e/f/c/f/a;->a:Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;

    .line 9
    iget-object v0, v0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->k:Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$h;

    const-string v1, "animWidth"

    .line 10
    invoke-virtual {p1, v1}, Landroid/animation/ValueAnimator;->getAnimatedValue(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Float;

    invoke-virtual {v1}, Ljava/lang/Float;->floatValue()F

    move-result v1

    iput v1, v0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$h;->d:F

    iget-object v0, p0, Lb/c/a/e/f/c/f/a;->a:Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;

    .line 11
    iget-object v0, v0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->k:Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$h;

    const-string v1, "animHeight"

    .line 12
    invoke-virtual {p1, v1}, Landroid/animation/ValueAnimator;->getAnimatedValue(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Float;

    invoke-virtual {p1}, Ljava/lang/Float;->floatValue()F

    move-result p1

    iput p1, v0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$h;->e:F

    iget-object p1, p0, Lb/c/a/e/f/c/f/a;->a:Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;

    invoke-virtual {p1}, Landroid/widget/ImageView;->invalidate()V

    return-void
.end method
