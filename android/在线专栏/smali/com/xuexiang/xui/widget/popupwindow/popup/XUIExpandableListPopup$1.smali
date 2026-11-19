.class Lcom/xuexiang/xui/widget/popupwindow/popup/XUIExpandableListPopup$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/widget/ExpandableListView$OnGroupExpandListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/xuexiang/xui/widget/popupwindow/popup/XUIExpandableListPopup;->setEnableOnlyExpandOne(Z)Lcom/xuexiang/xui/widget/popupwindow/popup/XUIExpandableListPopup;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/xuexiang/xui/widget/popupwindow/popup/XUIExpandableListPopup;


# direct methods
.method constructor <init>(Lcom/xuexiang/xui/widget/popupwindow/popup/XUIExpandableListPopup;)V
    .locals 0

    iput-object p1, p0, Lcom/xuexiang/xui/widget/popupwindow/popup/XUIExpandableListPopup$1;->this$0:Lcom/xuexiang/xui/widget/popupwindow/popup/XUIExpandableListPopup;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onGroupExpand(I)V
    .locals 1

    iget-object v0, p0, Lcom/xuexiang/xui/widget/popupwindow/popup/XUIExpandableListPopup$1;->this$0:Lcom/xuexiang/xui/widget/popupwindow/popup/XUIExpandableListPopup;

    invoke-virtual {v0, p1}, Lcom/xuexiang/xui/widget/popupwindow/popup/XUIExpandableListPopup;->expandOnlyOne(I)Z

    return-void
.end method
