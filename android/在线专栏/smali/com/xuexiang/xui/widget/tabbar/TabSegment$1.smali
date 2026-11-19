.class Lcom/xuexiang/xui/widget/tabbar/TabSegment$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/xuexiang/xui/widget/tabbar/TabSegment;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/xuexiang/xui/widget/tabbar/TabSegment;


# direct methods
.method constructor <init>(Lcom/xuexiang/xui/widget/tabbar/TabSegment;)V
    .locals 0

    iput-object p1, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment$1;->this$0:Lcom/xuexiang/xui/widget/tabbar/TabSegment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment$1;->this$0:Lcom/xuexiang/xui/widget/tabbar/TabSegment;

    invoke-static {v0}, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->access$000(Lcom/xuexiang/xui/widget/tabbar/TabSegment;)Landroid/animation/Animator;

    move-result-object v0

    if-nez v0, :cond_3

    iget-object v0, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment$1;->this$0:Lcom/xuexiang/xui/widget/tabbar/TabSegment;

    invoke-static {v0}, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->access$100(Lcom/xuexiang/xui/widget/tabbar/TabSegment;)I

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_1

    .line 2
    :cond_0
    invoke-virtual {p1}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    .line 3
    iget-object v0, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment$1;->this$0:Lcom/xuexiang/xui/widget/tabbar/TabSegment;

    invoke-static {v0}, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->access$200(Lcom/xuexiang/xui/widget/tabbar/TabSegment;)Lcom/xuexiang/xui/widget/tabbar/TabSegment$TabAdapter;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/xuexiang/xui/widget/tabbar/XUIItemViewsAdapter;->getItem(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/xuexiang/xui/widget/tabbar/TabSegment$Tab;

    if-eqz v0, :cond_2

    .line 4
    iget-object v1, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment$1;->this$0:Lcom/xuexiang/xui/widget/tabbar/TabSegment;

    invoke-static {v1}, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->access$300(Lcom/xuexiang/xui/widget/tabbar/TabSegment;)Z

    move-result v2

    const/4 v3, 0x1

    if-nez v2, :cond_1

    invoke-virtual {v0}, Lcom/xuexiang/xui/widget/tabbar/TabSegment$Tab;->isDynamicChangeIconColor()Z

    move-result v0

    if-nez v0, :cond_1

    const/4 v0, 0x1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    invoke-virtual {v1, p1, v0, v3}, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->selectTab(IZZ)V

    .line 5
    :cond_2
    iget-object v0, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment$1;->this$0:Lcom/xuexiang/xui/widget/tabbar/TabSegment;

    invoke-static {v0}, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->access$400(Lcom/xuexiang/xui/widget/tabbar/TabSegment;)Lcom/xuexiang/xui/widget/tabbar/TabSegment$OnTabClickListener;

    move-result-object v0

    if-eqz v0, :cond_3

    .line 6
    iget-object v0, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment$1;->this$0:Lcom/xuexiang/xui/widget/tabbar/TabSegment;

    invoke-static {v0}, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->access$400(Lcom/xuexiang/xui/widget/tabbar/TabSegment;)Lcom/xuexiang/xui/widget/tabbar/TabSegment$OnTabClickListener;

    move-result-object v0

    invoke-interface {v0, p1}, Lcom/xuexiang/xui/widget/tabbar/TabSegment$OnTabClickListener;->onTabClick(I)V

    :cond_3
    :goto_1
    return-void
.end method
