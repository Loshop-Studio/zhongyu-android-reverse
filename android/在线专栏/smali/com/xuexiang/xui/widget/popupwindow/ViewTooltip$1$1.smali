.class Lcom/xuexiang/xui/widget/popupwindow/ViewTooltip$1$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/ViewTreeObserver$OnPreDrawListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/xuexiang/xui/widget/popupwindow/ViewTooltip$1;->run()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$1:Lcom/xuexiang/xui/widget/popupwindow/ViewTooltip$1;

.field final synthetic val$rect:Landroid/graphics/Rect;


# direct methods
.method constructor <init>(Lcom/xuexiang/xui/widget/popupwindow/ViewTooltip$1;Landroid/graphics/Rect;)V
    .locals 0

    iput-object p1, p0, Lcom/xuexiang/xui/widget/popupwindow/ViewTooltip$1$1;->this$1:Lcom/xuexiang/xui/widget/popupwindow/ViewTooltip$1;

    iput-object p2, p0, Lcom/xuexiang/xui/widget/popupwindow/ViewTooltip$1$1;->val$rect:Landroid/graphics/Rect;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onPreDraw()Z
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/popupwindow/ViewTooltip$1$1;->this$1:Lcom/xuexiang/xui/widget/popupwindow/ViewTooltip$1;

    iget-object v0, v0, Lcom/xuexiang/xui/widget/popupwindow/ViewTooltip$1;->this$0:Lcom/xuexiang/xui/widget/popupwindow/ViewTooltip;

    invoke-static {v0}, Lcom/xuexiang/xui/widget/popupwindow/ViewTooltip;->access$100(Lcom/xuexiang/xui/widget/popupwindow/ViewTooltip;)Lcom/xuexiang/xui/widget/popupwindow/ViewTooltip$TooltipView;

    move-result-object v0

    iget-object v1, p0, Lcom/xuexiang/xui/widget/popupwindow/ViewTooltip$1$1;->val$rect:Landroid/graphics/Rect;

    iget-object v2, p0, Lcom/xuexiang/xui/widget/popupwindow/ViewTooltip$1$1;->this$1:Lcom/xuexiang/xui/widget/popupwindow/ViewTooltip$1;

    iget-object v2, v2, Lcom/xuexiang/xui/widget/popupwindow/ViewTooltip$1;->val$decorView:Landroid/view/ViewGroup;

    invoke-virtual {v2}, Landroid/view/ViewGroup;->getWidth()I

    move-result v2

    invoke-virtual {v0, v1, v2}, Lcom/xuexiang/xui/widget/popupwindow/ViewTooltip$TooltipView;->setup(Landroid/graphics/Rect;I)V

    .line 2
    iget-object v0, p0, Lcom/xuexiang/xui/widget/popupwindow/ViewTooltip$1$1;->this$1:Lcom/xuexiang/xui/widget/popupwindow/ViewTooltip$1;

    iget-object v0, v0, Lcom/xuexiang/xui/widget/popupwindow/ViewTooltip$1;->this$0:Lcom/xuexiang/xui/widget/popupwindow/ViewTooltip;

    invoke-static {v0}, Lcom/xuexiang/xui/widget/popupwindow/ViewTooltip;->access$100(Lcom/xuexiang/xui/widget/popupwindow/ViewTooltip;)Lcom/xuexiang/xui/widget/popupwindow/ViewTooltip$TooltipView;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/FrameLayout;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    move-result-object v0

    invoke-virtual {v0, p0}, Landroid/view/ViewTreeObserver;->removeOnPreDrawListener(Landroid/view/ViewTreeObserver$OnPreDrawListener;)V

    const/4 v0, 0x0

    return v0
.end method
