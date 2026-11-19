.class Lcom/xuexiang/xui/widget/tabbar/TabSegment$3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/animation/Animator$AnimatorListener;


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

.field final synthetic val$index:I

.field final synthetic val$nowModel:Lcom/xuexiang/xui/widget/tabbar/TabSegment$Tab;

.field final synthetic val$nowView:Lcom/xuexiang/xui/widget/tabbar/TabSegment$TabItemView;

.field final synthetic val$prev:I

.field final synthetic val$prevModel:Lcom/xuexiang/xui/widget/tabbar/TabSegment$Tab;

.field final synthetic val$prevView:Lcom/xuexiang/xui/widget/tabbar/TabSegment$TabItemView;


# direct methods
.method constructor <init>(Lcom/xuexiang/xui/widget/tabbar/TabSegment;Lcom/xuexiang/xui/widget/tabbar/TabSegment$TabItemView;Lcom/xuexiang/xui/widget/tabbar/TabSegment$Tab;Lcom/xuexiang/xui/widget/tabbar/TabSegment$TabItemView;Lcom/xuexiang/xui/widget/tabbar/TabSegment$Tab;II)V
    .locals 0

    iput-object p1, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment$3;->this$0:Lcom/xuexiang/xui/widget/tabbar/TabSegment;

    iput-object p2, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment$3;->val$prevView:Lcom/xuexiang/xui/widget/tabbar/TabSegment$TabItemView;

    iput-object p3, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment$3;->val$prevModel:Lcom/xuexiang/xui/widget/tabbar/TabSegment$Tab;

    iput-object p4, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment$3;->val$nowView:Lcom/xuexiang/xui/widget/tabbar/TabSegment$TabItemView;

    iput-object p5, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment$3;->val$nowModel:Lcom/xuexiang/xui/widget/tabbar/TabSegment$Tab;

    iput p6, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment$3;->val$index:I

    iput p7, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment$3;->val$prev:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onAnimationCancel(Landroid/animation/Animator;)V
    .locals 3

    .line 1
    iget-object p1, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment$3;->this$0:Lcom/xuexiang/xui/widget/tabbar/TabSegment;

    const/4 v0, 0x0

    invoke-static {p1, v0}, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->access$002(Lcom/xuexiang/xui/widget/tabbar/TabSegment;Landroid/animation/Animator;)Landroid/animation/Animator;

    .line 2
    iget-object p1, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment$3;->val$prevView:Lcom/xuexiang/xui/widget/tabbar/TabSegment$TabItemView;

    iget-object v0, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment$3;->val$prevModel:Lcom/xuexiang/xui/widget/tabbar/TabSegment$Tab;

    const/4 v1, 0x1

    invoke-virtual {p1, v0, v1}, Lcom/xuexiang/xui/widget/tabbar/TabSegment$TabItemView;->updateDecoration(Lcom/xuexiang/xui/widget/tabbar/TabSegment$Tab;Z)V

    .line 3
    iget-object p1, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment$3;->val$nowView:Lcom/xuexiang/xui/widget/tabbar/TabSegment$TabItemView;

    iget-object v0, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment$3;->val$nowModel:Lcom/xuexiang/xui/widget/tabbar/TabSegment$Tab;

    const/4 v2, 0x0

    invoke-virtual {p1, v0, v2}, Lcom/xuexiang/xui/widget/tabbar/TabSegment$TabItemView;->updateDecoration(Lcom/xuexiang/xui/widget/tabbar/TabSegment$Tab;Z)V

    .line 4
    iget-object p1, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment$3;->this$0:Lcom/xuexiang/xui/widget/tabbar/TabSegment;

    iget-object v0, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment$3;->val$prevModel:Lcom/xuexiang/xui/widget/tabbar/TabSegment$Tab;

    invoke-static {p1, v0, v1}, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->access$1300(Lcom/xuexiang/xui/widget/tabbar/TabSegment;Lcom/xuexiang/xui/widget/tabbar/TabSegment$Tab;Z)V

    return-void
.end method

.method public onAnimationEnd(Landroid/animation/Animator;)V
    .locals 4

    .line 1
    iget-object p1, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment$3;->this$0:Lcom/xuexiang/xui/widget/tabbar/TabSegment;

    const/4 v0, 0x0

    invoke-static {p1, v0}, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->access$002(Lcom/xuexiang/xui/widget/tabbar/TabSegment;Landroid/animation/Animator;)Landroid/animation/Animator;

    .line 2
    iget-object p1, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment$3;->val$prevView:Lcom/xuexiang/xui/widget/tabbar/TabSegment$TabItemView;

    iget-object v0, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment$3;->val$prevModel:Lcom/xuexiang/xui/widget/tabbar/TabSegment$Tab;

    const/4 v1, 0x0

    invoke-virtual {p1, v0, v1}, Lcom/xuexiang/xui/widget/tabbar/TabSegment$TabItemView;->updateDecoration(Lcom/xuexiang/xui/widget/tabbar/TabSegment$Tab;Z)V

    .line 3
    iget-object p1, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment$3;->val$nowView:Lcom/xuexiang/xui/widget/tabbar/TabSegment$TabItemView;

    iget-object v0, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment$3;->val$nowModel:Lcom/xuexiang/xui/widget/tabbar/TabSegment$Tab;

    const/4 v2, 0x1

    invoke-virtual {p1, v0, v2}, Lcom/xuexiang/xui/widget/tabbar/TabSegment$TabItemView;->updateDecoration(Lcom/xuexiang/xui/widget/tabbar/TabSegment$Tab;Z)V

    .line 4
    iget-object p1, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment$3;->this$0:Lcom/xuexiang/xui/widget/tabbar/TabSegment;

    iget v0, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment$3;->val$index:I

    invoke-static {p1, v0}, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->access$800(Lcom/xuexiang/xui/widget/tabbar/TabSegment;I)V

    .line 5
    iget-object p1, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment$3;->this$0:Lcom/xuexiang/xui/widget/tabbar/TabSegment;

    iget v0, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment$3;->val$prev:I

    invoke-static {p1, v0}, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->access$900(Lcom/xuexiang/xui/widget/tabbar/TabSegment;I)V

    .line 6
    iget-object p1, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment$3;->this$0:Lcom/xuexiang/xui/widget/tabbar/TabSegment;

    iget-object v0, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment$3;->val$prevView:Lcom/xuexiang/xui/widget/tabbar/TabSegment$TabItemView;

    invoke-virtual {v0}, Lcom/xuexiang/xui/widget/tabbar/TabSegment$TabItemView;->getTextView()Landroid/widget/TextView;

    move-result-object v0

    invoke-static {p1, v0, v1}, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->access$1000(Lcom/xuexiang/xui/widget/tabbar/TabSegment;Landroid/widget/TextView;Z)V

    .line 7
    iget-object p1, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment$3;->this$0:Lcom/xuexiang/xui/widget/tabbar/TabSegment;

    iget-object v0, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment$3;->val$nowView:Lcom/xuexiang/xui/widget/tabbar/TabSegment$TabItemView;

    invoke-virtual {v0}, Lcom/xuexiang/xui/widget/tabbar/TabSegment$TabItemView;->getTextView()Landroid/widget/TextView;

    move-result-object v0

    invoke-static {p1, v0, v2}, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->access$1000(Lcom/xuexiang/xui/widget/tabbar/TabSegment;Landroid/widget/TextView;Z)V

    .line 8
    iget-object p1, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment$3;->this$0:Lcom/xuexiang/xui/widget/tabbar/TabSegment;

    iget v0, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment$3;->val$index:I

    invoke-static {p1, v0}, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->access$1102(Lcom/xuexiang/xui/widget/tabbar/TabSegment;I)I

    .line 9
    iget-object p1, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment$3;->this$0:Lcom/xuexiang/xui/widget/tabbar/TabSegment;

    invoke-static {p1}, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->access$1200(Lcom/xuexiang/xui/widget/tabbar/TabSegment;)I

    move-result p1

    const/4 v0, -0x1

    if-eq p1, v0, :cond_0

    iget-object p1, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment$3;->this$0:Lcom/xuexiang/xui/widget/tabbar/TabSegment;

    invoke-static {p1}, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->access$100(Lcom/xuexiang/xui/widget/tabbar/TabSegment;)I

    move-result p1

    if-nez p1, :cond_0

    .line 10
    iget-object p1, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment$3;->this$0:Lcom/xuexiang/xui/widget/tabbar/TabSegment;

    invoke-static {p1}, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->access$1200(Lcom/xuexiang/xui/widget/tabbar/TabSegment;)I

    move-result v3

    invoke-virtual {p1, v3, v2, v1}, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->selectTab(IZZ)V

    .line 11
    iget-object p1, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment$3;->this$0:Lcom/xuexiang/xui/widget/tabbar/TabSegment;

    invoke-static {p1, v0}, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->access$1202(Lcom/xuexiang/xui/widget/tabbar/TabSegment;I)I

    :cond_0
    return-void
.end method

.method public onAnimationRepeat(Landroid/animation/Animator;)V
    .locals 0

    return-void
.end method

.method public onAnimationStart(Landroid/animation/Animator;)V
    .locals 1

    iget-object v0, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment$3;->this$0:Lcom/xuexiang/xui/widget/tabbar/TabSegment;

    invoke-static {v0, p1}, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->access$002(Lcom/xuexiang/xui/widget/tabbar/TabSegment;Landroid/animation/Animator;)Landroid/animation/Animator;

    return-void
.end method
