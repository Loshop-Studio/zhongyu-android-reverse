.class Lcom/xuexiang/xui/widget/popupwindow/ViewTooltip$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/xuexiang/xui/widget/popupwindow/ViewTooltip;->show()Lcom/xuexiang/xui/widget/popupwindow/ViewTooltip$TooltipView;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/xuexiang/xui/widget/popupwindow/ViewTooltip;

.field final synthetic val$decorView:Landroid/view/ViewGroup;


# direct methods
.method constructor <init>(Lcom/xuexiang/xui/widget/popupwindow/ViewTooltip;Landroid/view/ViewGroup;)V
    .locals 0

    iput-object p1, p0, Lcom/xuexiang/xui/widget/popupwindow/ViewTooltip$1;->this$0:Lcom/xuexiang/xui/widget/popupwindow/ViewTooltip;

    iput-object p2, p0, Lcom/xuexiang/xui/widget/popupwindow/ViewTooltip$1;->val$decorView:Landroid/view/ViewGroup;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 4

    .line 1
    new-instance v0, Landroid/graphics/Rect;

    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    .line 2
    iget-object v1, p0, Lcom/xuexiang/xui/widget/popupwindow/ViewTooltip$1;->this$0:Lcom/xuexiang/xui/widget/popupwindow/ViewTooltip;

    invoke-static {v1}, Lcom/xuexiang/xui/widget/popupwindow/ViewTooltip;->access$000(Lcom/xuexiang/xui/widget/popupwindow/ViewTooltip;)Landroid/view/View;

    move-result-object v1

    invoke-virtual {v1, v0}, Landroid/view/View;->getGlobalVisibleRect(Landroid/graphics/Rect;)Z

    const/4 v1, 0x2

    new-array v1, v1, [I

    .line 3
    iget-object v2, p0, Lcom/xuexiang/xui/widget/popupwindow/ViewTooltip$1;->this$0:Lcom/xuexiang/xui/widget/popupwindow/ViewTooltip;

    invoke-static {v2}, Lcom/xuexiang/xui/widget/popupwindow/ViewTooltip;->access$000(Lcom/xuexiang/xui/widget/popupwindow/ViewTooltip;)Landroid/view/View;

    move-result-object v2

    invoke-virtual {v2, v1}, Landroid/view/View;->getLocationOnScreen([I)V

    const/4 v2, 0x0

    aget v1, v1, v2

    .line 4
    iput v1, v0, Landroid/graphics/Rect;->left:I

    .line 5
    iget-object v1, p0, Lcom/xuexiang/xui/widget/popupwindow/ViewTooltip$1;->val$decorView:Landroid/view/ViewGroup;

    iget-object v2, p0, Lcom/xuexiang/xui/widget/popupwindow/ViewTooltip$1;->this$0:Lcom/xuexiang/xui/widget/popupwindow/ViewTooltip;

    invoke-static {v2}, Lcom/xuexiang/xui/widget/popupwindow/ViewTooltip;->access$100(Lcom/xuexiang/xui/widget/popupwindow/ViewTooltip;)Lcom/xuexiang/xui/widget/popupwindow/ViewTooltip$TooltipView;

    move-result-object v2

    const/4 v3, -0x2

    invoke-virtual {v1, v2, v3, v3}, Landroid/view/ViewGroup;->addView(Landroid/view/View;II)V

    .line 6
    iget-object v1, p0, Lcom/xuexiang/xui/widget/popupwindow/ViewTooltip$1;->this$0:Lcom/xuexiang/xui/widget/popupwindow/ViewTooltip;

    invoke-static {v1}, Lcom/xuexiang/xui/widget/popupwindow/ViewTooltip;->access$100(Lcom/xuexiang/xui/widget/popupwindow/ViewTooltip;)Lcom/xuexiang/xui/widget/popupwindow/ViewTooltip$TooltipView;

    move-result-object v1

    invoke-virtual {v1}, Landroid/widget/FrameLayout;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    move-result-object v1

    new-instance v2, Lcom/xuexiang/xui/widget/popupwindow/ViewTooltip$1$1;

    invoke-direct {v2, p0, v0}, Lcom/xuexiang/xui/widget/popupwindow/ViewTooltip$1$1;-><init>(Lcom/xuexiang/xui/widget/popupwindow/ViewTooltip$1;Landroid/graphics/Rect;)V

    invoke-virtual {v1, v2}, Landroid/view/ViewTreeObserver;->addOnPreDrawListener(Landroid/view/ViewTreeObserver$OnPreDrawListener;)V

    return-void
.end method
