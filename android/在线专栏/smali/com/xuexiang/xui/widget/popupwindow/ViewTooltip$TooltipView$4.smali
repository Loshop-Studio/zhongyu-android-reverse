.class Lcom/xuexiang/xui/widget/popupwindow/ViewTooltip$TooltipView$4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/xuexiang/xui/widget/popupwindow/ViewTooltip$TooltipView;->handleAutoRemove()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/xuexiang/xui/widget/popupwindow/ViewTooltip$TooltipView;


# direct methods
.method constructor <init>(Lcom/xuexiang/xui/widget/popupwindow/ViewTooltip$TooltipView;)V
    .locals 0

    iput-object p1, p0, Lcom/xuexiang/xui/widget/popupwindow/ViewTooltip$TooltipView$4;->this$0:Lcom/xuexiang/xui/widget/popupwindow/ViewTooltip$TooltipView;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 1

    iget-object v0, p0, Lcom/xuexiang/xui/widget/popupwindow/ViewTooltip$TooltipView$4;->this$0:Lcom/xuexiang/xui/widget/popupwindow/ViewTooltip$TooltipView;

    invoke-virtual {v0}, Lcom/xuexiang/xui/widget/popupwindow/ViewTooltip$TooltipView;->remove()V

    return-void
.end method
