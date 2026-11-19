.class Lcom/xuexiang/xui/widget/picker/widget/BasePickerView$6;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/content/DialogInterface$OnDismissListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/xuexiang/xui/widget/picker/widget/BasePickerView;->createDialog()V
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

    iput-object p1, p0, Lcom/xuexiang/xui/widget/picker/widget/BasePickerView$6;->this$0:Lcom/xuexiang/xui/widget/picker/widget/BasePickerView;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onDismiss(Landroid/content/DialogInterface;)V
    .locals 1

    .line 1
    iget-object p1, p0, Lcom/xuexiang/xui/widget/picker/widget/BasePickerView$6;->this$0:Lcom/xuexiang/xui/widget/picker/widget/BasePickerView;

    invoke-static {p1}, Lcom/xuexiang/xui/widget/picker/widget/BasePickerView;->access$300(Lcom/xuexiang/xui/widget/picker/widget/BasePickerView;)Lcom/xuexiang/xui/widget/picker/widget/listener/OnDismissListener;

    move-result-object p1

    if-eqz p1, :cond_0

    .line 2
    iget-object p1, p0, Lcom/xuexiang/xui/widget/picker/widget/BasePickerView$6;->this$0:Lcom/xuexiang/xui/widget/picker/widget/BasePickerView;

    invoke-static {p1}, Lcom/xuexiang/xui/widget/picker/widget/BasePickerView;->access$300(Lcom/xuexiang/xui/widget/picker/widget/BasePickerView;)Lcom/xuexiang/xui/widget/picker/widget/listener/OnDismissListener;

    move-result-object p1

    iget-object v0, p0, Lcom/xuexiang/xui/widget/picker/widget/BasePickerView$6;->this$0:Lcom/xuexiang/xui/widget/picker/widget/BasePickerView;

    invoke-interface {p1, v0}, Lcom/xuexiang/xui/widget/picker/widget/listener/OnDismissListener;->onDismiss(Lcom/xuexiang/xui/widget/picker/widget/BasePickerView;)V

    :cond_0
    return-void
.end method
