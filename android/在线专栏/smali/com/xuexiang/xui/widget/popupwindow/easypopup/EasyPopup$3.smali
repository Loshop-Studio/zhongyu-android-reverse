.class Lcom/xuexiang/xui/widget/popupwindow/easypopup/EasyPopup$3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/xuexiang/xui/widget/popupwindow/easypopup/EasyPopup;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/xuexiang/xui/widget/popupwindow/easypopup/EasyPopup;


# direct methods
.method constructor <init>(Lcom/xuexiang/xui/widget/popupwindow/easypopup/EasyPopup;)V
    .locals 0

    iput-object p1, p0, Lcom/xuexiang/xui/widget/popupwindow/easypopup/EasyPopup$3;->this$0:Lcom/xuexiang/xui/widget/popupwindow/easypopup/EasyPopup;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onGlobalLayout()V
    .locals 9

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/popupwindow/easypopup/EasyPopup$3;->this$0:Lcom/xuexiang/xui/widget/popupwindow/easypopup/EasyPopup;

    invoke-virtual {v0}, Lcom/xuexiang/xui/widget/popupwindow/easypopup/EasyPopup;->getContentView()Landroid/view/View;

    move-result-object v1

    invoke-virtual {v1}, Landroid/view/View;->getWidth()I

    move-result v1

    iput v1, v0, Lcom/xuexiang/xui/widget/popupwindow/easypopup/EasyPopup;->mWidth:I

    .line 2
    iget-object v0, p0, Lcom/xuexiang/xui/widget/popupwindow/easypopup/EasyPopup$3;->this$0:Lcom/xuexiang/xui/widget/popupwindow/easypopup/EasyPopup;

    invoke-virtual {v0}, Lcom/xuexiang/xui/widget/popupwindow/easypopup/EasyPopup;->getContentView()Landroid/view/View;

    move-result-object v1

    invoke-virtual {v1}, Landroid/view/View;->getHeight()I

    move-result v1

    iput v1, v0, Lcom/xuexiang/xui/widget/popupwindow/easypopup/EasyPopup;->mHeight:I

    .line 3
    iget-object v0, p0, Lcom/xuexiang/xui/widget/popupwindow/easypopup/EasyPopup$3;->this$0:Lcom/xuexiang/xui/widget/popupwindow/easypopup/EasyPopup;

    invoke-static {v0}, Lcom/xuexiang/xui/widget/popupwindow/easypopup/EasyPopup;->access$100(Lcom/xuexiang/xui/widget/popupwindow/easypopup/EasyPopup;)Lcom/xuexiang/xui/widget/popupwindow/easypopup/EasyPopup$OnAttachedWindowListener;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 4
    iget-object v0, p0, Lcom/xuexiang/xui/widget/popupwindow/easypopup/EasyPopup$3;->this$0:Lcom/xuexiang/xui/widget/popupwindow/easypopup/EasyPopup;

    invoke-static {v0}, Lcom/xuexiang/xui/widget/popupwindow/easypopup/EasyPopup;->access$100(Lcom/xuexiang/xui/widget/popupwindow/easypopup/EasyPopup;)Lcom/xuexiang/xui/widget/popupwindow/easypopup/EasyPopup$OnAttachedWindowListener;

    move-result-object v0

    iget-object v1, p0, Lcom/xuexiang/xui/widget/popupwindow/easypopup/EasyPopup$3;->this$0:Lcom/xuexiang/xui/widget/popupwindow/easypopup/EasyPopup;

    iget v2, v1, Lcom/xuexiang/xui/widget/popupwindow/easypopup/EasyPopup;->mWidth:I

    iget v3, v1, Lcom/xuexiang/xui/widget/popupwindow/easypopup/EasyPopup;->mHeight:I

    invoke-interface {v0, v2, v3, v1}, Lcom/xuexiang/xui/widget/popupwindow/easypopup/EasyPopup$OnAttachedWindowListener;->onAttachedWindow(IILcom/xuexiang/xui/widget/popupwindow/easypopup/EasyPopup;)V

    .line 5
    :cond_0
    iget-object v0, p0, Lcom/xuexiang/xui/widget/popupwindow/easypopup/EasyPopup$3;->this$0:Lcom/xuexiang/xui/widget/popupwindow/easypopup/EasyPopup;

    invoke-static {v0}, Lcom/xuexiang/xui/widget/popupwindow/easypopup/EasyPopup;->access$200(Lcom/xuexiang/xui/widget/popupwindow/easypopup/EasyPopup;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 6
    iget-object v0, p0, Lcom/xuexiang/xui/widget/popupwindow/easypopup/EasyPopup$3;->this$0:Lcom/xuexiang/xui/widget/popupwindow/easypopup/EasyPopup;

    invoke-static {v0}, Lcom/xuexiang/xui/widget/popupwindow/easypopup/EasyPopup;->access$300(Lcom/xuexiang/xui/widget/popupwindow/easypopup/EasyPopup;)V

    return-void

    .line 7
    :cond_1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/popupwindow/easypopup/EasyPopup$3;->this$0:Lcom/xuexiang/xui/widget/popupwindow/easypopup/EasyPopup;

    invoke-static {v0}, Lcom/xuexiang/xui/widget/popupwindow/easypopup/EasyPopup;->access$000(Lcom/xuexiang/xui/widget/popupwindow/easypopup/EasyPopup;)Landroid/widget/PopupWindow;

    move-result-object v0

    if-nez v0, :cond_2

    return-void

    .line 8
    :cond_2
    iget-object v1, p0, Lcom/xuexiang/xui/widget/popupwindow/easypopup/EasyPopup$3;->this$0:Lcom/xuexiang/xui/widget/popupwindow/easypopup/EasyPopup;

    iget v2, v1, Lcom/xuexiang/xui/widget/popupwindow/easypopup/EasyPopup;->mWidth:I

    iget v3, v1, Lcom/xuexiang/xui/widget/popupwindow/easypopup/EasyPopup;->mHeight:I

    invoke-static {v1}, Lcom/xuexiang/xui/widget/popupwindow/easypopup/EasyPopup;->access$400(Lcom/xuexiang/xui/widget/popupwindow/easypopup/EasyPopup;)Landroid/view/View;

    move-result-object v4

    iget-object v0, p0, Lcom/xuexiang/xui/widget/popupwindow/easypopup/EasyPopup$3;->this$0:Lcom/xuexiang/xui/widget/popupwindow/easypopup/EasyPopup;

    invoke-static {v0}, Lcom/xuexiang/xui/widget/popupwindow/easypopup/EasyPopup;->access$500(Lcom/xuexiang/xui/widget/popupwindow/easypopup/EasyPopup;)I

    move-result v5

    iget-object v0, p0, Lcom/xuexiang/xui/widget/popupwindow/easypopup/EasyPopup$3;->this$0:Lcom/xuexiang/xui/widget/popupwindow/easypopup/EasyPopup;

    invoke-static {v0}, Lcom/xuexiang/xui/widget/popupwindow/easypopup/EasyPopup;->access$600(Lcom/xuexiang/xui/widget/popupwindow/easypopup/EasyPopup;)I

    move-result v6

    iget-object v0, p0, Lcom/xuexiang/xui/widget/popupwindow/easypopup/EasyPopup$3;->this$0:Lcom/xuexiang/xui/widget/popupwindow/easypopup/EasyPopup;

    invoke-static {v0}, Lcom/xuexiang/xui/widget/popupwindow/easypopup/EasyPopup;->access$700(Lcom/xuexiang/xui/widget/popupwindow/easypopup/EasyPopup;)I

    move-result v7

    iget-object v0, p0, Lcom/xuexiang/xui/widget/popupwindow/easypopup/EasyPopup$3;->this$0:Lcom/xuexiang/xui/widget/popupwindow/easypopup/EasyPopup;

    invoke-static {v0}, Lcom/xuexiang/xui/widget/popupwindow/easypopup/EasyPopup;->access$800(Lcom/xuexiang/xui/widget/popupwindow/easypopup/EasyPopup;)I

    move-result v8

    invoke-static/range {v1 .. v8}, Lcom/xuexiang/xui/widget/popupwindow/easypopup/EasyPopup;->access$900(Lcom/xuexiang/xui/widget/popupwindow/easypopup/EasyPopup;IILandroid/view/View;IIII)V

    .line 9
    iget-object v0, p0, Lcom/xuexiang/xui/widget/popupwindow/easypopup/EasyPopup$3;->this$0:Lcom/xuexiang/xui/widget/popupwindow/easypopup/EasyPopup;

    invoke-static {v0}, Lcom/xuexiang/xui/widget/popupwindow/easypopup/EasyPopup;->access$300(Lcom/xuexiang/xui/widget/popupwindow/easypopup/EasyPopup;)V

    return-void
.end method
