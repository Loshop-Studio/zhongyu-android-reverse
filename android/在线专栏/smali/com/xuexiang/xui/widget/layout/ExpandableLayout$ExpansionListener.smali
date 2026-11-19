.class Lcom/xuexiang/xui/widget/layout/ExpandableLayout$ExpansionListener;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/animation/Animator$AnimatorListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/xuexiang/xui/widget/layout/ExpandableLayout;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "ExpansionListener"
.end annotation


# instance fields
.field private canceled:Z

.field private targetExpansion:I

.field final synthetic this$0:Lcom/xuexiang/xui/widget/layout/ExpandableLayout;


# direct methods
.method public constructor <init>(Lcom/xuexiang/xui/widget/layout/ExpandableLayout;I)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/xuexiang/xui/widget/layout/ExpandableLayout$ExpansionListener;->this$0:Lcom/xuexiang/xui/widget/layout/ExpandableLayout;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput p2, p0, Lcom/xuexiang/xui/widget/layout/ExpandableLayout$ExpansionListener;->targetExpansion:I

    return-void
.end method


# virtual methods
.method public onAnimationCancel(Landroid/animation/Animator;)V
    .locals 0

    const/4 p1, 0x1

    iput-boolean p1, p0, Lcom/xuexiang/xui/widget/layout/ExpandableLayout$ExpansionListener;->canceled:Z

    return-void
.end method

.method public onAnimationEnd(Landroid/animation/Animator;)V
    .locals 1

    .line 1
    iget-boolean p1, p0, Lcom/xuexiang/xui/widget/layout/ExpandableLayout$ExpansionListener;->canceled:Z

    if-nez p1, :cond_1

    .line 2
    iget-object p1, p0, Lcom/xuexiang/xui/widget/layout/ExpandableLayout$ExpansionListener;->this$0:Lcom/xuexiang/xui/widget/layout/ExpandableLayout;

    iget v0, p0, Lcom/xuexiang/xui/widget/layout/ExpandableLayout$ExpansionListener;->targetExpansion:I

    if-nez v0, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    const/4 v0, 0x3

    :goto_0
    invoke-static {p1, v0}, Lcom/xuexiang/xui/widget/layout/ExpandableLayout;->access$002(Lcom/xuexiang/xui/widget/layout/ExpandableLayout;I)I

    .line 3
    iget-object p1, p0, Lcom/xuexiang/xui/widget/layout/ExpandableLayout$ExpansionListener;->this$0:Lcom/xuexiang/xui/widget/layout/ExpandableLayout;

    iget v0, p0, Lcom/xuexiang/xui/widget/layout/ExpandableLayout$ExpansionListener;->targetExpansion:I

    int-to-float v0, v0

    invoke-virtual {p1, v0}, Lcom/xuexiang/xui/widget/layout/ExpandableLayout;->setExpansion(F)V

    :cond_1
    return-void
.end method

.method public onAnimationRepeat(Landroid/animation/Animator;)V
    .locals 0

    return-void
.end method

.method public onAnimationStart(Landroid/animation/Animator;)V
    .locals 1

    iget-object p1, p0, Lcom/xuexiang/xui/widget/layout/ExpandableLayout$ExpansionListener;->this$0:Lcom/xuexiang/xui/widget/layout/ExpandableLayout;

    iget v0, p0, Lcom/xuexiang/xui/widget/layout/ExpandableLayout$ExpansionListener;->targetExpansion:I

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x2

    :goto_0
    invoke-static {p1, v0}, Lcom/xuexiang/xui/widget/layout/ExpandableLayout;->access$002(Lcom/xuexiang/xui/widget/layout/ExpandableLayout;I)I

    return-void
.end method
