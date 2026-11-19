.class Lcom/xuexiang/xui/widget/popupwindow/popup/XUIBasePopup$3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/widget/PopupWindow$OnDismissListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/xuexiang/xui/widget/popupwindow/popup/XUIBasePopup;->setContentView(Landroid/view/View;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/xuexiang/xui/widget/popupwindow/popup/XUIBasePopup;


# direct methods
.method constructor <init>(Lcom/xuexiang/xui/widget/popupwindow/popup/XUIBasePopup;)V
    .locals 0

    iput-object p1, p0, Lcom/xuexiang/xui/widget/popupwindow/popup/XUIBasePopup$3;->this$0:Lcom/xuexiang/xui/widget/popupwindow/popup/XUIBasePopup;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onDismiss()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/popupwindow/popup/XUIBasePopup$3;->this$0:Lcom/xuexiang/xui/widget/popupwindow/popup/XUIBasePopup;

    invoke-virtual {v0}, Lcom/xuexiang/xui/widget/popupwindow/popup/XUIBasePopup;->onDismiss()V

    .line 2
    iget-object v0, p0, Lcom/xuexiang/xui/widget/popupwindow/popup/XUIBasePopup$3;->this$0:Lcom/xuexiang/xui/widget/popupwindow/popup/XUIBasePopup;

    invoke-static {v0}, Lcom/xuexiang/xui/widget/popupwindow/popup/XUIBasePopup;->access$100(Lcom/xuexiang/xui/widget/popupwindow/popup/XUIBasePopup;)Landroid/widget/PopupWindow$OnDismissListener;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 3
    iget-object v0, p0, Lcom/xuexiang/xui/widget/popupwindow/popup/XUIBasePopup$3;->this$0:Lcom/xuexiang/xui/widget/popupwindow/popup/XUIBasePopup;

    invoke-static {v0}, Lcom/xuexiang/xui/widget/popupwindow/popup/XUIBasePopup;->access$100(Lcom/xuexiang/xui/widget/popupwindow/popup/XUIBasePopup;)Landroid/widget/PopupWindow$OnDismissListener;

    move-result-object v0

    invoke-interface {v0}, Landroid/widget/PopupWindow$OnDismissListener;->onDismiss()V

    :cond_0
    return-void
.end method
