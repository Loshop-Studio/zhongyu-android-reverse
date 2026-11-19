.class Lcom/xuexiang/xui/widget/popupwindow/status/StatusView$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/xuexiang/xui/widget/popupwindow/status/StatusView;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/xuexiang/xui/widget/popupwindow/status/StatusView;


# direct methods
.method constructor <init>(Lcom/xuexiang/xui/widget/popupwindow/status/StatusView;)V
    .locals 0

    iput-object p1, p0, Lcom/xuexiang/xui/widget/popupwindow/status/StatusView$1;->this$0:Lcom/xuexiang/xui/widget/popupwindow/status/StatusView;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/popupwindow/status/StatusView$1;->this$0:Lcom/xuexiang/xui/widget/popupwindow/status/StatusView;

    invoke-static {v0}, Lcom/xuexiang/xui/widget/popupwindow/status/StatusView;->access$000(Lcom/xuexiang/xui/widget/popupwindow/status/StatusView;)Lcom/xuexiang/xui/widget/popupwindow/status/Status;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/xuexiang/xui/widget/popupwindow/status/StatusView;->access$100(Lcom/xuexiang/xui/widget/popupwindow/status/StatusView;Lcom/xuexiang/xui/widget/popupwindow/status/Status;)Landroid/view/View;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/xuexiang/xui/widget/popupwindow/status/StatusView;->access$200(Lcom/xuexiang/xui/widget/popupwindow/status/StatusView;Landroid/view/View;)V

    .line 2
    iget-object v0, p0, Lcom/xuexiang/xui/widget/popupwindow/status/StatusView$1;->this$0:Lcom/xuexiang/xui/widget/popupwindow/status/StatusView;

    invoke-static {v0}, Lcom/xuexiang/xui/widget/popupwindow/status/StatusView;->access$400(Lcom/xuexiang/xui/widget/popupwindow/status/StatusView;)Landroid/os/Handler;

    move-result-object v0

    iget-object v1, p0, Lcom/xuexiang/xui/widget/popupwindow/status/StatusView$1;->this$0:Lcom/xuexiang/xui/widget/popupwindow/status/StatusView;

    invoke-static {v1}, Lcom/xuexiang/xui/widget/popupwindow/status/StatusView;->access$300(Lcom/xuexiang/xui/widget/popupwindow/status/StatusView;)Ljava/lang/Runnable;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    return-void
.end method
