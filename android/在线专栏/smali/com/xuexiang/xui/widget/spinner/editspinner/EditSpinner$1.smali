.class Lcom/xuexiang/xui/widget/spinner/editspinner/EditSpinner$1;
.super Landroid/widget/ListPopupWindow;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/xuexiang/xui/widget/spinner/editspinner/EditSpinner;->buildPopupWindow()Landroid/widget/ListPopupWindow;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/xuexiang/xui/widget/spinner/editspinner/EditSpinner;


# direct methods
.method constructor <init>(Lcom/xuexiang/xui/widget/spinner/editspinner/EditSpinner;Landroid/content/Context;)V
    .locals 0

    iput-object p1, p0, Lcom/xuexiang/xui/widget/spinner/editspinner/EditSpinner$1;->this$0:Lcom/xuexiang/xui/widget/spinner/editspinner/EditSpinner;

    invoke-direct {p0, p2}, Landroid/widget/ListPopupWindow;-><init>(Landroid/content/Context;)V

    return-void
.end method


# virtual methods
.method public show()V
    .locals 2

    .line 1
    invoke-virtual {p0}, Landroid/widget/ListPopupWindow;->isShowing()Z

    move-result v0

    if-nez v0, :cond_0

    .line 2
    iget-object v0, p0, Lcom/xuexiang/xui/widget/spinner/editspinner/EditSpinner$1;->this$0:Lcom/xuexiang/xui/widget/spinner/editspinner/EditSpinner;

    invoke-static {v0}, Lcom/xuexiang/xui/widget/spinner/editspinner/EditSpinner;->access$100(Lcom/xuexiang/xui/widget/spinner/editspinner/EditSpinner;)Landroid/widget/ImageView;

    move-result-object v0

    iget-object v1, p0, Lcom/xuexiang/xui/widget/spinner/editspinner/EditSpinner$1;->this$0:Lcom/xuexiang/xui/widget/spinner/editspinner/EditSpinner;

    invoke-static {v1}, Lcom/xuexiang/xui/widget/spinner/editspinner/EditSpinner;->access$000(Lcom/xuexiang/xui/widget/spinner/editspinner/EditSpinner;)Landroid/view/animation/Animation;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->startAnimation(Landroid/view/animation/Animation;)V

    .line 3
    :cond_0
    invoke-super {p0}, Landroid/widget/ListPopupWindow;->show()V

    return-void
.end method
