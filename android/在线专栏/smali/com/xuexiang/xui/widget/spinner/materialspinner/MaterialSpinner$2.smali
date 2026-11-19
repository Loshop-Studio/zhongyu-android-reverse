.class Lcom/xuexiang/xui/widget/spinner/materialspinner/MaterialSpinner$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/widget/PopupWindow$OnDismissListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/xuexiang/xui/widget/spinner/materialspinner/MaterialSpinner;->initAttrs(Landroid/content/Context;Landroid/util/AttributeSet;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/xuexiang/xui/widget/spinner/materialspinner/MaterialSpinner;


# direct methods
.method constructor <init>(Lcom/xuexiang/xui/widget/spinner/materialspinner/MaterialSpinner;)V
    .locals 0

    iput-object p1, p0, Lcom/xuexiang/xui/widget/spinner/materialspinner/MaterialSpinner$2;->this$0:Lcom/xuexiang/xui/widget/spinner/materialspinner/MaterialSpinner;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onDismiss()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/spinner/materialspinner/MaterialSpinner$2;->this$0:Lcom/xuexiang/xui/widget/spinner/materialspinner/MaterialSpinner;

    invoke-static {v0}, Lcom/xuexiang/xui/widget/spinner/materialspinner/MaterialSpinner;->access$200(Lcom/xuexiang/xui/widget/spinner/materialspinner/MaterialSpinner;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/xuexiang/xui/widget/spinner/materialspinner/MaterialSpinner$2;->this$0:Lcom/xuexiang/xui/widget/spinner/materialspinner/MaterialSpinner;

    invoke-static {v0}, Lcom/xuexiang/xui/widget/spinner/materialspinner/MaterialSpinner;->access$400(Lcom/xuexiang/xui/widget/spinner/materialspinner/MaterialSpinner;)Lcom/xuexiang/xui/widget/spinner/materialspinner/MaterialSpinner$OnNothingSelectedListener;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 2
    iget-object v0, p0, Lcom/xuexiang/xui/widget/spinner/materialspinner/MaterialSpinner$2;->this$0:Lcom/xuexiang/xui/widget/spinner/materialspinner/MaterialSpinner;

    invoke-static {v0}, Lcom/xuexiang/xui/widget/spinner/materialspinner/MaterialSpinner;->access$400(Lcom/xuexiang/xui/widget/spinner/materialspinner/MaterialSpinner;)Lcom/xuexiang/xui/widget/spinner/materialspinner/MaterialSpinner$OnNothingSelectedListener;

    move-result-object v0

    iget-object v1, p0, Lcom/xuexiang/xui/widget/spinner/materialspinner/MaterialSpinner$2;->this$0:Lcom/xuexiang/xui/widget/spinner/materialspinner/MaterialSpinner;

    invoke-interface {v0, v1}, Lcom/xuexiang/xui/widget/spinner/materialspinner/MaterialSpinner$OnNothingSelectedListener;->onNothingSelected(Lcom/xuexiang/xui/widget/spinner/materialspinner/MaterialSpinner;)V

    .line 3
    :cond_0
    iget-object v0, p0, Lcom/xuexiang/xui/widget/spinner/materialspinner/MaterialSpinner$2;->this$0:Lcom/xuexiang/xui/widget/spinner/materialspinner/MaterialSpinner;

    invoke-static {v0}, Lcom/xuexiang/xui/widget/spinner/materialspinner/MaterialSpinner;->access$500(Lcom/xuexiang/xui/widget/spinner/materialspinner/MaterialSpinner;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 4
    iget-object v0, p0, Lcom/xuexiang/xui/widget/spinner/materialspinner/MaterialSpinner$2;->this$0:Lcom/xuexiang/xui/widget/spinner/materialspinner/MaterialSpinner;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/xuexiang/xui/widget/spinner/materialspinner/MaterialSpinner;->access$600(Lcom/xuexiang/xui/widget/spinner/materialspinner/MaterialSpinner;Z)V

    :cond_1
    return-void
.end method
