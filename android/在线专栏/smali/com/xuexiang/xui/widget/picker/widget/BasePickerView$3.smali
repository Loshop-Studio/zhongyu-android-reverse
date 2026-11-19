.class Lcom/xuexiang/xui/widget/picker/widget/BasePickerView$3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/xuexiang/xui/widget/picker/widget/BasePickerView;->dismissImmediately()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/xuexiang/xui/widget/picker/widget/BasePickerView;


# direct methods
.method constructor <init>(Lcom/xuexiang/xui/widget/picker/widget/BasePickerView;)V
    .locals 0

    iput-object p1, p0, Lcom/xuexiang/xui/widget/picker/widget/BasePickerView$3;->this$0:Lcom/xuexiang/xui/widget/picker/widget/BasePickerView;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/picker/widget/BasePickerView$3;->this$0:Lcom/xuexiang/xui/widget/picker/widget/BasePickerView;

    iget-object v1, v0, Lcom/xuexiang/xui/widget/picker/widget/BasePickerView;->mPickerOptions:Lcom/xuexiang/xui/widget/picker/widget/configure/PickerOptions;

    iget-object v1, v1, Lcom/xuexiang/xui/widget/picker/widget/configure/PickerOptions;->decorView:Landroid/view/ViewGroup;

    invoke-static {v0}, Lcom/xuexiang/xui/widget/picker/widget/BasePickerView;->access$000(Lcom/xuexiang/xui/widget/picker/widget/BasePickerView;)Landroid/view/ViewGroup;

    move-result-object v0

    invoke-virtual {v1, v0}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    .line 2
    iget-object v0, p0, Lcom/xuexiang/xui/widget/picker/widget/BasePickerView$3;->this$0:Lcom/xuexiang/xui/widget/picker/widget/BasePickerView;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/xuexiang/xui/widget/picker/widget/BasePickerView;->access$102(Lcom/xuexiang/xui/widget/picker/widget/BasePickerView;Z)Z

    .line 3
    iget-object v0, p0, Lcom/xuexiang/xui/widget/picker/widget/BasePickerView$3;->this$0:Lcom/xuexiang/xui/widget/picker/widget/BasePickerView;

    invoke-static {v0, v1}, Lcom/xuexiang/xui/widget/picker/widget/BasePickerView;->access$202(Lcom/xuexiang/xui/widget/picker/widget/BasePickerView;Z)Z

    .line 4
    iget-object v0, p0, Lcom/xuexiang/xui/widget/picker/widget/BasePickerView$3;->this$0:Lcom/xuexiang/xui/widget/picker/widget/BasePickerView;

    invoke-static {v0}, Lcom/xuexiang/xui/widget/picker/widget/BasePickerView;->access$300(Lcom/xuexiang/xui/widget/picker/widget/BasePickerView;)Lcom/xuexiang/xui/widget/picker/widget/listener/OnDismissListener;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 5
    iget-object v0, p0, Lcom/xuexiang/xui/widget/picker/widget/BasePickerView$3;->this$0:Lcom/xuexiang/xui/widget/picker/widget/BasePickerView;

    invoke-static {v0}, Lcom/xuexiang/xui/widget/picker/widget/BasePickerView;->access$300(Lcom/xuexiang/xui/widget/picker/widget/BasePickerView;)Lcom/xuexiang/xui/widget/picker/widget/listener/OnDismissListener;

    move-result-object v0

    iget-object v1, p0, Lcom/xuexiang/xui/widget/picker/widget/BasePickerView$3;->this$0:Lcom/xuexiang/xui/widget/picker/widget/BasePickerView;

    invoke-interface {v0, v1}, Lcom/xuexiang/xui/widget/picker/widget/listener/OnDismissListener;->onDismiss(Lcom/xuexiang/xui/widget/picker/widget/BasePickerView;)V

    :cond_0
    return-void
.end method
