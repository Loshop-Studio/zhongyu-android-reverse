.class Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout$TabStrip$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout$TabStrip;->setIndicatorGravity()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$1:Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout$TabStrip;


# direct methods
.method constructor <init>(Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout$TabStrip;)V
    .locals 0

    iput-object p1, p0, Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout$TabStrip$1;->this$1:Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout$TabStrip;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout$TabStrip$1;->this$1:Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout$TabStrip;

    iget-object v0, v0, Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout$TabStrip;->this$0:Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout;

    invoke-static {v0}, Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout;->access$400(Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout;)I

    move-result v0

    const/4 v1, 0x5

    if-ne v0, v1, :cond_0

    .line 2
    iget-object v0, p0, Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout$TabStrip$1;->this$1:Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout$TabStrip;

    invoke-virtual {v0}, Landroid/widget/LinearLayout;->getWidth()I

    move-result v1

    iget-object v2, p0, Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout$TabStrip$1;->this$1:Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout$TabStrip;

    iget-object v2, v2, Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout$TabStrip;->this$0:Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout;

    invoke-static {v2}, Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout;->access$500(Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout;)I

    move-result v2

    sub-int/2addr v1, v2

    int-to-float v1, v1

    invoke-static {v0, v1}, Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout$TabStrip;->access$602(Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout$TabStrip;F)F

    goto :goto_0

    .line 3
    :cond_0
    iget-object v0, p0, Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout$TabStrip$1;->this$1:Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout$TabStrip;

    iget-object v0, v0, Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout$TabStrip;->this$0:Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout;

    invoke-static {v0}, Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout;->access$400(Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout;)I

    move-result v0

    const/16 v1, 0x77

    if-ne v0, v1, :cond_1

    .line 4
    iget-object v0, p0, Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout$TabStrip$1;->this$1:Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout$TabStrip;

    iget-object v1, v0, Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout$TabStrip;->this$0:Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout;

    invoke-static {v1}, Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout;->access$500(Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout;)I

    move-result v1

    invoke-static {v0, v1}, Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout$TabStrip;->access$702(Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout$TabStrip;I)I

    .line 5
    iget-object v0, p0, Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout$TabStrip$1;->this$1:Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout$TabStrip;

    iget-object v1, v0, Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout$TabStrip;->this$0:Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout;

    invoke-virtual {v0}, Landroid/widget/LinearLayout;->getWidth()I

    move-result v0

    invoke-static {v1, v0}, Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout;->access$502(Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout;I)I

    .line 6
    :cond_1
    :goto_0
    iget-object v0, p0, Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout$TabStrip$1;->this$1:Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout$TabStrip;

    invoke-virtual {v0}, Landroid/widget/LinearLayout;->invalidate()V

    return-void
.end method
