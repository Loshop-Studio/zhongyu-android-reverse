.class Lcom/xuexiang/xui/widget/popupwindow/popup/XUISimpleExpandablePopup$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/widget/ExpandableListView$OnChildClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/xuexiang/xui/widget/popupwindow/popup/XUISimpleExpandablePopup;->setOnExpandableItemClickListener(ZLcom/xuexiang/xui/widget/popupwindow/popup/XUISimpleExpandablePopup$OnExpandableItemClickListener;)Lcom/xuexiang/xui/widget/popupwindow/popup/XUISimpleExpandablePopup;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/xuexiang/xui/widget/popupwindow/popup/XUISimpleExpandablePopup;

.field final synthetic val$autoDismiss:Z

.field final synthetic val$onExpandableItemClickListener:Lcom/xuexiang/xui/widget/popupwindow/popup/XUISimpleExpandablePopup$OnExpandableItemClickListener;


# direct methods
.method constructor <init>(Lcom/xuexiang/xui/widget/popupwindow/popup/XUISimpleExpandablePopup;Lcom/xuexiang/xui/widget/popupwindow/popup/XUISimpleExpandablePopup$OnExpandableItemClickListener;Z)V
    .locals 0

    iput-object p1, p0, Lcom/xuexiang/xui/widget/popupwindow/popup/XUISimpleExpandablePopup$1;->this$0:Lcom/xuexiang/xui/widget/popupwindow/popup/XUISimpleExpandablePopup;

    iput-object p2, p0, Lcom/xuexiang/xui/widget/popupwindow/popup/XUISimpleExpandablePopup$1;->val$onExpandableItemClickListener:Lcom/xuexiang/xui/widget/popupwindow/popup/XUISimpleExpandablePopup$OnExpandableItemClickListener;

    iput-boolean p3, p0, Lcom/xuexiang/xui/widget/popupwindow/popup/XUISimpleExpandablePopup$1;->val$autoDismiss:Z

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onChildClick(Landroid/widget/ExpandableListView;Landroid/view/View;IIJ)Z
    .locals 0

    .line 1
    iget-object p1, p0, Lcom/xuexiang/xui/widget/popupwindow/popup/XUISimpleExpandablePopup$1;->val$onExpandableItemClickListener:Lcom/xuexiang/xui/widget/popupwindow/popup/XUISimpleExpandablePopup$OnExpandableItemClickListener;

    if-eqz p1, :cond_0

    .line 2
    iget-object p2, p0, Lcom/xuexiang/xui/widget/popupwindow/popup/XUISimpleExpandablePopup$1;->this$0:Lcom/xuexiang/xui/widget/popupwindow/popup/XUISimpleExpandablePopup;

    invoke-virtual {p2}, Lcom/xuexiang/xui/widget/popupwindow/popup/XUISimpleExpandablePopup;->getAdapter()Lcom/xuexiang/xui/adapter/simple/XUISimpleExpandableListAdapter;

    move-result-object p2

    iget-object p5, p0, Lcom/xuexiang/xui/widget/popupwindow/popup/XUISimpleExpandablePopup$1;->this$0:Lcom/xuexiang/xui/widget/popupwindow/popup/XUISimpleExpandablePopup;

    invoke-virtual {p5}, Lcom/xuexiang/xui/widget/popupwindow/popup/XUISimpleExpandablePopup;->getAdapter()Lcom/xuexiang/xui/adapter/simple/XUISimpleExpandableListAdapter;

    move-result-object p5

    invoke-virtual {p5, p3}, Lcom/xuexiang/xui/adapter/simple/XUISimpleExpandableListAdapter;->getGroup(I)Lcom/xuexiang/xui/adapter/simple/ExpandableItem;

    move-result-object p5

    invoke-interface {p1, p2, p5, p3, p4}, Lcom/xuexiang/xui/widget/popupwindow/popup/XUISimpleExpandablePopup$OnExpandableItemClickListener;->onExpandableItemClick(Lcom/xuexiang/xui/adapter/simple/XUISimpleExpandableListAdapter;Lcom/xuexiang/xui/adapter/simple/ExpandableItem;II)V

    .line 3
    :cond_0
    iget-boolean p1, p0, Lcom/xuexiang/xui/widget/popupwindow/popup/XUISimpleExpandablePopup$1;->val$autoDismiss:Z

    if-eqz p1, :cond_1

    .line 4
    iget-object p1, p0, Lcom/xuexiang/xui/widget/popupwindow/popup/XUISimpleExpandablePopup$1;->this$0:Lcom/xuexiang/xui/widget/popupwindow/popup/XUISimpleExpandablePopup;

    invoke-virtual {p1}, Lcom/xuexiang/xui/widget/popupwindow/popup/XUIBasePopup;->dismiss()V

    :cond_1
    const/4 p1, 0x0

    return p1
.end method
