.class Lcom/xuexiang/xui/widget/popupwindow/popup/XUISimplePopup$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/widget/AdapterView$OnItemClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/xuexiang/xui/widget/popupwindow/popup/XUISimplePopup;->setOnPopupItemClickListener(Lcom/xuexiang/xui/widget/popupwindow/popup/XUISimplePopup$OnPopupItemClickListener;)Lcom/xuexiang/xui/widget/popupwindow/popup/XUISimplePopup;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/xuexiang/xui/widget/popupwindow/popup/XUISimplePopup;

.field final synthetic val$onItemClickListener:Lcom/xuexiang/xui/widget/popupwindow/popup/XUISimplePopup$OnPopupItemClickListener;


# direct methods
.method constructor <init>(Lcom/xuexiang/xui/widget/popupwindow/popup/XUISimplePopup;Lcom/xuexiang/xui/widget/popupwindow/popup/XUISimplePopup$OnPopupItemClickListener;)V
    .locals 0

    iput-object p1, p0, Lcom/xuexiang/xui/widget/popupwindow/popup/XUISimplePopup$1;->this$0:Lcom/xuexiang/xui/widget/popupwindow/popup/XUISimplePopup;

    iput-object p2, p0, Lcom/xuexiang/xui/widget/popupwindow/popup/XUISimplePopup$1;->val$onItemClickListener:Lcom/xuexiang/xui/widget/popupwindow/popup/XUISimplePopup$OnPopupItemClickListener;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onItemClick(Landroid/widget/AdapterView;Landroid/view/View;IJ)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/widget/AdapterView<",
            "*>;",
            "Landroid/view/View;",
            "IJ)V"
        }
    .end annotation

    .line 1
    iget-object p1, p0, Lcom/xuexiang/xui/widget/popupwindow/popup/XUISimplePopup$1;->val$onItemClickListener:Lcom/xuexiang/xui/widget/popupwindow/popup/XUISimplePopup$OnPopupItemClickListener;

    if-eqz p1, :cond_0

    .line 2
    iget-object p2, p0, Lcom/xuexiang/xui/widget/popupwindow/popup/XUISimplePopup$1;->this$0:Lcom/xuexiang/xui/widget/popupwindow/popup/XUISimplePopup;

    invoke-virtual {p2}, Lcom/xuexiang/xui/widget/popupwindow/popup/XUISimplePopup;->getAdapter()Lcom/xuexiang/xui/adapter/simple/XUISimpleAdapter;

    move-result-object p2

    iget-object p4, p0, Lcom/xuexiang/xui/widget/popupwindow/popup/XUISimplePopup$1;->this$0:Lcom/xuexiang/xui/widget/popupwindow/popup/XUISimplePopup;

    invoke-virtual {p4}, Lcom/xuexiang/xui/widget/popupwindow/popup/XUISimplePopup;->getAdapter()Lcom/xuexiang/xui/adapter/simple/XUISimpleAdapter;

    move-result-object p4

    invoke-virtual {p4, p3}, Lcom/xuexiang/xui/adapter/listview/XListAdapter;->getItem(I)Ljava/lang/Object;

    move-result-object p4

    check-cast p4, Lcom/xuexiang/xui/adapter/simple/AdapterItem;

    invoke-interface {p1, p2, p4, p3}, Lcom/xuexiang/xui/widget/popupwindow/popup/XUISimplePopup$OnPopupItemClickListener;->onItemClick(Lcom/xuexiang/xui/adapter/simple/XUISimpleAdapter;Lcom/xuexiang/xui/adapter/simple/AdapterItem;I)V

    .line 3
    :cond_0
    iget-object p1, p0, Lcom/xuexiang/xui/widget/popupwindow/popup/XUISimplePopup$1;->this$0:Lcom/xuexiang/xui/widget/popupwindow/popup/XUISimplePopup;

    invoke-virtual {p1}, Lcom/xuexiang/xui/widget/popupwindow/popup/XUIBasePopup;->dismiss()V

    return-void
.end method
