.class Lcom/xuexiang/xui/widget/spinner/editspinner/EditSpinner$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/widget/PopupWindow$OnDismissListener;


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
.method constructor <init>(Lcom/xuexiang/xui/widget/spinner/editspinner/EditSpinner;)V
    .locals 0

    iput-object p1, p0, Lcom/xuexiang/xui/widget/spinner/editspinner/EditSpinner$2;->this$0:Lcom/xuexiang/xui/widget/spinner/editspinner/EditSpinner;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onDismiss()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/spinner/editspinner/EditSpinner$2;->this$0:Lcom/xuexiang/xui/widget/spinner/editspinner/EditSpinner;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    invoke-static {v0, v1, v2}, Lcom/xuexiang/xui/widget/spinner/editspinner/EditSpinner;->access$202(Lcom/xuexiang/xui/widget/spinner/editspinner/EditSpinner;J)J

    .line 2
    iget-object v0, p0, Lcom/xuexiang/xui/widget/spinner/editspinner/EditSpinner$2;->this$0:Lcom/xuexiang/xui/widget/spinner/editspinner/EditSpinner;

    invoke-static {v0}, Lcom/xuexiang/xui/widget/spinner/editspinner/EditSpinner;->access$100(Lcom/xuexiang/xui/widget/spinner/editspinner/EditSpinner;)Landroid/widget/ImageView;

    move-result-object v0

    iget-object v1, p0, Lcom/xuexiang/xui/widget/spinner/editspinner/EditSpinner$2;->this$0:Lcom/xuexiang/xui/widget/spinner/editspinner/EditSpinner;

    invoke-static {v1}, Lcom/xuexiang/xui/widget/spinner/editspinner/EditSpinner;->access$300(Lcom/xuexiang/xui/widget/spinner/editspinner/EditSpinner;)Landroid/view/animation/Animation;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->startAnimation(Landroid/view/animation/Animation;)V

    return-void
.end method
