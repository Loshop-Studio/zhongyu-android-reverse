.class Lcom/xuexiang/xui/widget/progress/ratingbar/RotationRatingBar$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/xuexiang/xui/widget/progress/ratingbar/RotationRatingBar;->getAnimationRunnable(FLcom/xuexiang/xui/widget/progress/ratingbar/PartialView;ID)Ljava/lang/Runnable;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/xuexiang/xui/widget/progress/ratingbar/RotationRatingBar;

.field final synthetic val$maxIntOfRating:D

.field final synthetic val$partialView:Lcom/xuexiang/xui/widget/progress/ratingbar/PartialView;

.field final synthetic val$rating:F

.field final synthetic val$ratingViewId:I


# direct methods
.method constructor <init>(Lcom/xuexiang/xui/widget/progress/ratingbar/RotationRatingBar;IDLcom/xuexiang/xui/widget/progress/ratingbar/PartialView;F)V
    .locals 0

    iput-object p1, p0, Lcom/xuexiang/xui/widget/progress/ratingbar/RotationRatingBar$2;->this$0:Lcom/xuexiang/xui/widget/progress/ratingbar/RotationRatingBar;

    iput p2, p0, Lcom/xuexiang/xui/widget/progress/ratingbar/RotationRatingBar$2;->val$ratingViewId:I

    iput-wide p3, p0, Lcom/xuexiang/xui/widget/progress/ratingbar/RotationRatingBar$2;->val$maxIntOfRating:D

    iput-object p5, p0, Lcom/xuexiang/xui/widget/progress/ratingbar/RotationRatingBar$2;->val$partialView:Lcom/xuexiang/xui/widget/progress/ratingbar/PartialView;

    iput p6, p0, Lcom/xuexiang/xui/widget/progress/ratingbar/RotationRatingBar$2;->val$rating:F

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 5

    .line 1
    iget v0, p0, Lcom/xuexiang/xui/widget/progress/ratingbar/RotationRatingBar$2;->val$ratingViewId:I

    int-to-double v0, v0

    iget-wide v2, p0, Lcom/xuexiang/xui/widget/progress/ratingbar/RotationRatingBar$2;->val$maxIntOfRating:D

    cmpl-double v4, v0, v2

    if-nez v4, :cond_0

    .line 2
    iget-object v0, p0, Lcom/xuexiang/xui/widget/progress/ratingbar/RotationRatingBar$2;->val$partialView:Lcom/xuexiang/xui/widget/progress/ratingbar/PartialView;

    iget v1, p0, Lcom/xuexiang/xui/widget/progress/ratingbar/RotationRatingBar$2;->val$rating:F

    invoke-virtual {v0, v1}, Lcom/xuexiang/xui/widget/progress/ratingbar/PartialView;->setPartialFilled(F)V

    goto :goto_0

    .line 3
    :cond_0
    iget-object v0, p0, Lcom/xuexiang/xui/widget/progress/ratingbar/RotationRatingBar$2;->val$partialView:Lcom/xuexiang/xui/widget/progress/ratingbar/PartialView;

    invoke-virtual {v0}, Lcom/xuexiang/xui/widget/progress/ratingbar/PartialView;->setFilled()V

    .line 4
    :goto_0
    iget v0, p0, Lcom/xuexiang/xui/widget/progress/ratingbar/RotationRatingBar$2;->val$ratingViewId:I

    int-to-float v0, v0

    iget v1, p0, Lcom/xuexiang/xui/widget/progress/ratingbar/RotationRatingBar$2;->val$rating:F

    cmpl-float v0, v0, v1

    if-nez v0, :cond_1

    .line 5
    iget-object v0, p0, Lcom/xuexiang/xui/widget/progress/ratingbar/RotationRatingBar$2;->this$0:Lcom/xuexiang/xui/widget/progress/ratingbar/RotationRatingBar;

    invoke-virtual {v0}, Landroid/widget/LinearLayout;->getContext()Landroid/content/Context;

    move-result-object v0

    sget v1, Lcom/xuexiang/xui/R$anim;->srb_rotation:I

    invoke-static {v0, v1}, Landroid/view/animation/AnimationUtils;->loadAnimation(Landroid/content/Context;I)Landroid/view/animation/Animation;

    move-result-object v0

    .line 6
    iget-object v1, p0, Lcom/xuexiang/xui/widget/progress/ratingbar/RotationRatingBar$2;->val$partialView:Lcom/xuexiang/xui/widget/progress/ratingbar/PartialView;

    invoke-virtual {v1, v0}, Landroid/widget/RelativeLayout;->startAnimation(Landroid/view/animation/Animation;)V

    :cond_1
    return-void
.end method
