.class Lcom/xuexiang/xui/widget/popupwindow/ViewTooltip$TooltipView$6;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/ViewTreeObserver$OnPreDrawListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/xuexiang/xui/widget/popupwindow/ViewTooltip$TooltipView;->setup(Landroid/graphics/Rect;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/xuexiang/xui/widget/popupwindow/ViewTooltip$TooltipView;

.field final synthetic val$myRect:Landroid/graphics/Rect;


# direct methods
.method constructor <init>(Lcom/xuexiang/xui/widget/popupwindow/ViewTooltip$TooltipView;Landroid/graphics/Rect;)V
    .locals 0

    iput-object p1, p0, Lcom/xuexiang/xui/widget/popupwindow/ViewTooltip$TooltipView$6;->this$0:Lcom/xuexiang/xui/widget/popupwindow/ViewTooltip$TooltipView;

    iput-object p2, p0, Lcom/xuexiang/xui/widget/popupwindow/ViewTooltip$TooltipView$6;->val$myRect:Landroid/graphics/Rect;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onPreDraw()Z
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/popupwindow/ViewTooltip$TooltipView$6;->this$0:Lcom/xuexiang/xui/widget/popupwindow/ViewTooltip$TooltipView;

    iget-object v1, p0, Lcom/xuexiang/xui/widget/popupwindow/ViewTooltip$TooltipView$6;->val$myRect:Landroid/graphics/Rect;

    invoke-static {v0, v1}, Lcom/xuexiang/xui/widget/popupwindow/ViewTooltip$TooltipView;->access$900(Lcom/xuexiang/xui/widget/popupwindow/ViewTooltip$TooltipView;Landroid/graphics/Rect;)V

    .line 2
    iget-object v0, p0, Lcom/xuexiang/xui/widget/popupwindow/ViewTooltip$TooltipView$6;->this$0:Lcom/xuexiang/xui/widget/popupwindow/ViewTooltip$TooltipView;

    invoke-virtual {v0}, Landroid/widget/FrameLayout;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    move-result-object v0

    invoke-virtual {v0, p0}, Landroid/view/ViewTreeObserver;->removeOnPreDrawListener(Landroid/view/ViewTreeObserver$OnPreDrawListener;)V

    const/4 v0, 0x0

    return v0
.end method
