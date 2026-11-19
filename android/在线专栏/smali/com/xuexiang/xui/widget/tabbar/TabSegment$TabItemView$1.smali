.class Lcom/xuexiang/xui/widget/tabbar/TabSegment$TabItemView$1;
.super Landroid/view/GestureDetector$SimpleOnGestureListener;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/xuexiang/xui/widget/tabbar/TabSegment$TabItemView;-><init>(Lcom/xuexiang/xui/widget/tabbar/TabSegment;Landroid/content/Context;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$1:Lcom/xuexiang/xui/widget/tabbar/TabSegment$TabItemView;

.field final synthetic val$this$0:Lcom/xuexiang/xui/widget/tabbar/TabSegment;


# direct methods
.method constructor <init>(Lcom/xuexiang/xui/widget/tabbar/TabSegment$TabItemView;Lcom/xuexiang/xui/widget/tabbar/TabSegment;)V
    .locals 0

    iput-object p1, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment$TabItemView$1;->this$1:Lcom/xuexiang/xui/widget/tabbar/TabSegment$TabItemView;

    iput-object p2, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment$TabItemView$1;->val$this$0:Lcom/xuexiang/xui/widget/tabbar/TabSegment;

    invoke-direct {p0}, Landroid/view/GestureDetector$SimpleOnGestureListener;-><init>()V

    return-void
.end method


# virtual methods
.method public onDoubleTap(Landroid/view/MotionEvent;)Z
    .locals 2

    .line 1
    iget-object p1, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment$TabItemView$1;->this$1:Lcom/xuexiang/xui/widget/tabbar/TabSegment$TabItemView;

    iget-object p1, p1, Lcom/xuexiang/xui/widget/tabbar/TabSegment$TabItemView;->this$0:Lcom/xuexiang/xui/widget/tabbar/TabSegment;

    invoke-static {p1}, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->access$2100(Lcom/xuexiang/xui/widget/tabbar/TabSegment;)Ljava/util/ArrayList;

    move-result-object p1

    invoke-virtual {p1}, Ljava/util/ArrayList;->isEmpty()Z

    move-result p1

    const/4 v0, 0x0

    if-eqz p1, :cond_0

    return v0

    .line 2
    :cond_0
    iget-object p1, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment$TabItemView$1;->this$1:Lcom/xuexiang/xui/widget/tabbar/TabSegment$TabItemView;

    invoke-virtual {p1}, Landroid/widget/RelativeLayout;->getTag()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    .line 3
    iget-object v1, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment$TabItemView$1;->this$1:Lcom/xuexiang/xui/widget/tabbar/TabSegment$TabItemView;

    iget-object v1, v1, Lcom/xuexiang/xui/widget/tabbar/TabSegment$TabItemView;->this$0:Lcom/xuexiang/xui/widget/tabbar/TabSegment;

    invoke-static {v1}, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->access$200(Lcom/xuexiang/xui/widget/tabbar/TabSegment;)Lcom/xuexiang/xui/widget/tabbar/TabSegment$TabAdapter;

    move-result-object v1

    invoke-virtual {v1, p1}, Lcom/xuexiang/xui/widget/tabbar/XUIItemViewsAdapter;->getItem(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/xuexiang/xui/widget/tabbar/TabSegment$Tab;

    if-eqz v1, :cond_1

    .line 4
    iget-object v0, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment$TabItemView$1;->this$1:Lcom/xuexiang/xui/widget/tabbar/TabSegment$TabItemView;

    iget-object v0, v0, Lcom/xuexiang/xui/widget/tabbar/TabSegment$TabItemView;->this$0:Lcom/xuexiang/xui/widget/tabbar/TabSegment;

    invoke-static {v0, p1}, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->access$2200(Lcom/xuexiang/xui/widget/tabbar/TabSegment;I)V

    const/4 p1, 0x1

    return p1

    :cond_1
    return v0
.end method
