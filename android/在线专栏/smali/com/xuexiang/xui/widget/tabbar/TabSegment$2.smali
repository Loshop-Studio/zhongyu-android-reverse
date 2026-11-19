.class Lcom/xuexiang/xui/widget/tabbar/TabSegment$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/animation/ValueAnimator$AnimatorUpdateListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/xuexiang/xui/widget/tabbar/TabSegment;->selectTab(IZZ)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/xuexiang/xui/widget/tabbar/TabSegment;

.field final synthetic val$nowModel:Lcom/xuexiang/xui/widget/tabbar/TabSegment$Tab;

.field final synthetic val$nowView:Lcom/xuexiang/xui/widget/tabbar/TabSegment$TabItemView;

.field final synthetic val$prevModel:Lcom/xuexiang/xui/widget/tabbar/TabSegment$Tab;

.field final synthetic val$prevView:Lcom/xuexiang/xui/widget/tabbar/TabSegment$TabItemView;


# direct methods
.method constructor <init>(Lcom/xuexiang/xui/widget/tabbar/TabSegment;Lcom/xuexiang/xui/widget/tabbar/TabSegment$Tab;Lcom/xuexiang/xui/widget/tabbar/TabSegment$Tab;Lcom/xuexiang/xui/widget/tabbar/TabSegment$TabItemView;Lcom/xuexiang/xui/widget/tabbar/TabSegment$TabItemView;)V
    .locals 0

    iput-object p1, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment$2;->this$0:Lcom/xuexiang/xui/widget/tabbar/TabSegment;

    iput-object p2, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment$2;->val$prevModel:Lcom/xuexiang/xui/widget/tabbar/TabSegment$Tab;

    iput-object p3, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment$2;->val$nowModel:Lcom/xuexiang/xui/widget/tabbar/TabSegment$Tab;

    iput-object p4, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment$2;->val$prevView:Lcom/xuexiang/xui/widget/tabbar/TabSegment$TabItemView;

    iput-object p5, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment$2;->val$nowView:Lcom/xuexiang/xui/widget/tabbar/TabSegment$TabItemView;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onAnimationUpdate(Landroid/animation/ValueAnimator;)V
    .locals 4

    .line 1
    invoke-virtual {p1}, Landroid/animation/ValueAnimator;->getAnimatedValue()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Float;

    invoke-virtual {p1}, Ljava/lang/Float;->floatValue()F

    move-result p1

    .line 2
    iget-object v0, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment$2;->this$0:Lcom/xuexiang/xui/widget/tabbar/TabSegment;

    iget-object v1, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment$2;->val$prevModel:Lcom/xuexiang/xui/widget/tabbar/TabSegment$Tab;

    invoke-static {v0, v1}, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->access$500(Lcom/xuexiang/xui/widget/tabbar/TabSegment;Lcom/xuexiang/xui/widget/tabbar/TabSegment$Tab;)I

    move-result v0

    iget-object v1, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment$2;->this$0:Lcom/xuexiang/xui/widget/tabbar/TabSegment;

    iget-object v2, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment$2;->val$prevModel:Lcom/xuexiang/xui/widget/tabbar/TabSegment$Tab;

    invoke-static {v1, v2}, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->access$600(Lcom/xuexiang/xui/widget/tabbar/TabSegment;Lcom/xuexiang/xui/widget/tabbar/TabSegment$Tab;)I

    move-result v1

    invoke-static {v0, v1, p1}, Lcom/xuexiang/xui/utils/ColorUtils;->computeColor(IIF)I

    move-result v0

    .line 3
    iget-object v1, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment$2;->this$0:Lcom/xuexiang/xui/widget/tabbar/TabSegment;

    iget-object v2, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment$2;->val$nowModel:Lcom/xuexiang/xui/widget/tabbar/TabSegment$Tab;

    invoke-static {v1, v2}, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->access$600(Lcom/xuexiang/xui/widget/tabbar/TabSegment;Lcom/xuexiang/xui/widget/tabbar/TabSegment$Tab;)I

    move-result v1

    iget-object v2, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment$2;->this$0:Lcom/xuexiang/xui/widget/tabbar/TabSegment;

    iget-object v3, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment$2;->val$nowModel:Lcom/xuexiang/xui/widget/tabbar/TabSegment$Tab;

    invoke-static {v2, v3}, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->access$500(Lcom/xuexiang/xui/widget/tabbar/TabSegment;Lcom/xuexiang/xui/widget/tabbar/TabSegment$Tab;)I

    move-result v2

    invoke-static {v1, v2, p1}, Lcom/xuexiang/xui/utils/ColorUtils;->computeColor(IIF)I

    move-result v1

    .line 4
    iget-object v2, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment$2;->val$prevView:Lcom/xuexiang/xui/widget/tabbar/TabSegment$TabItemView;

    iget-object v3, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment$2;->val$prevModel:Lcom/xuexiang/xui/widget/tabbar/TabSegment$Tab;

    invoke-virtual {v2, v3, v0}, Lcom/xuexiang/xui/widget/tabbar/TabSegment$TabItemView;->setColorInTransition(Lcom/xuexiang/xui/widget/tabbar/TabSegment$Tab;I)V

    .line 5
    iget-object v0, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment$2;->val$nowView:Lcom/xuexiang/xui/widget/tabbar/TabSegment$TabItemView;

    iget-object v2, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment$2;->val$nowModel:Lcom/xuexiang/xui/widget/tabbar/TabSegment$Tab;

    invoke-virtual {v0, v2, v1}, Lcom/xuexiang/xui/widget/tabbar/TabSegment$TabItemView;->setColorInTransition(Lcom/xuexiang/xui/widget/tabbar/TabSegment$Tab;I)V

    .line 6
    iget-object v0, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment$2;->this$0:Lcom/xuexiang/xui/widget/tabbar/TabSegment;

    iget-object v1, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment$2;->val$prevModel:Lcom/xuexiang/xui/widget/tabbar/TabSegment$Tab;

    iget-object v2, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment$2;->val$nowModel:Lcom/xuexiang/xui/widget/tabbar/TabSegment$Tab;

    invoke-static {v0, v1, v2, p1}, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->access$700(Lcom/xuexiang/xui/widget/tabbar/TabSegment;Lcom/xuexiang/xui/widget/tabbar/TabSegment$Tab;Lcom/xuexiang/xui/widget/tabbar/TabSegment$Tab;F)V

    return-void
.end method
