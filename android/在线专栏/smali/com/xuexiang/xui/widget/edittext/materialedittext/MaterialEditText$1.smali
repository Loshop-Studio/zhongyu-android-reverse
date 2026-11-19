.class Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/text/TextWatcher;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->initTextWatcher()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;


# direct methods
.method constructor <init>(Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;)V
    .locals 0

    iput-object p1, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText$1;->this$0:Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public afterTextChanged(Landroid/text/Editable;)V
    .locals 1

    .line 1
    iget-object p1, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText$1;->this$0:Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;

    invoke-static {p1}, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->access$000(Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;)V

    .line 2
    iget-object p1, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText$1;->this$0:Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;

    invoke-static {p1}, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->access$100(Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;)Z

    move-result p1

    if-eqz p1, :cond_0

    .line 3
    iget-object p1, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText$1;->this$0:Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;

    invoke-virtual {p1}, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->validate()Z

    goto :goto_0

    .line 4
    :cond_0
    iget-object p1, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText$1;->this$0:Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->setError(Ljava/lang/CharSequence;)V

    .line 5
    :goto_0
    iget-object p1, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText$1;->this$0:Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;

    invoke-virtual {p1}, Landroid/widget/EditText;->postInvalidate()V

    return-void
.end method

.method public beforeTextChanged(Ljava/lang/CharSequence;III)V
    .locals 0

    return-void
.end method

.method public onTextChanged(Ljava/lang/CharSequence;III)V
    .locals 0

    return-void
.end method
