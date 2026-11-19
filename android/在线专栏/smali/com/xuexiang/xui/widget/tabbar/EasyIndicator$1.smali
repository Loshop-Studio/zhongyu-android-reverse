.class Lcom/xuexiang/xui/widget/tabbar/EasyIndicator$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/animation/ValueAnimator$AnimatorUpdateListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/xuexiang/xui/widget/tabbar/EasyIndicator;->buildIndicatorAnimatorTowards(Landroid/widget/TextView;)Landroid/animation/AnimatorSet;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/xuexiang/xui/widget/tabbar/EasyIndicator;

.field final synthetic val$params:Landroid/view/ViewGroup$LayoutParams;


# direct methods
.method constructor <init>(Lcom/xuexiang/xui/widget/tabbar/EasyIndicator;Landroid/view/ViewGroup$LayoutParams;)V
    .locals 0

    iput-object p1, p0, Lcom/xuexiang/xui/widget/tabbar/EasyIndicator$1;->this$0:Lcom/xuexiang/xui/widget/tabbar/EasyIndicator;

    iput-object p2, p0, Lcom/xuexiang/xui/widget/tabbar/EasyIndicator$1;->val$params:Landroid/view/ViewGroup$LayoutParams;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onAnimationUpdate(Landroid/animation/ValueAnimator;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/tabbar/EasyIndicator$1;->val$params:Landroid/view/ViewGroup$LayoutParams;

    invoke-virtual {p1}, Landroid/animation/ValueAnimator;->getAnimatedValue()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    iput p1, v0, Landroid/view/ViewGroup$LayoutParams;->width:I

    .line 2
    iget-object p1, p0, Lcom/xuexiang/xui/widget/tabbar/EasyIndicator$1;->this$0:Lcom/xuexiang/xui/widget/tabbar/EasyIndicator;

    invoke-static {p1}, Lcom/xuexiang/xui/widget/tabbar/EasyIndicator;->access$000(Lcom/xuexiang/xui/widget/tabbar/EasyIndicator;)Landroid/widget/LinearLayout;

    move-result-object p1

    iget-object v0, p0, Lcom/xuexiang/xui/widget/tabbar/EasyIndicator$1;->val$params:Landroid/view/ViewGroup$LayoutParams;

    invoke-virtual {p1, v0}, Landroid/widget/LinearLayout;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    return-void
.end method
