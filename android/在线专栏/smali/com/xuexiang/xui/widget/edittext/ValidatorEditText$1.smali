.class Lcom/xuexiang/xui/widget/edittext/ValidatorEditText$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/text/TextWatcher;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/xuexiang/xui/widget/edittext/ValidatorEditText;->initTextWatcher()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/xuexiang/xui/widget/edittext/ValidatorEditText;


# direct methods
.method constructor <init>(Lcom/xuexiang/xui/widget/edittext/ValidatorEditText;)V
    .locals 0

    iput-object p1, p0, Lcom/xuexiang/xui/widget/edittext/ValidatorEditText$1;->this$0:Lcom/xuexiang/xui/widget/edittext/ValidatorEditText;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public afterTextChanged(Landroid/text/Editable;)V
    .locals 1

    .line 1
    iget-object p1, p0, Lcom/xuexiang/xui/widget/edittext/ValidatorEditText$1;->this$0:Lcom/xuexiang/xui/widget/edittext/ValidatorEditText;

    invoke-static {p1}, Lcom/xuexiang/xui/widget/edittext/ValidatorEditText;->access$000(Lcom/xuexiang/xui/widget/edittext/ValidatorEditText;)Z

    move-result p1

    if-eqz p1, :cond_0

    .line 2
    iget-object p1, p0, Lcom/xuexiang/xui/widget/edittext/ValidatorEditText$1;->this$0:Lcom/xuexiang/xui/widget/edittext/ValidatorEditText;

    invoke-virtual {p1}, Lcom/xuexiang/xui/widget/edittext/ValidatorEditText;->updateValid()V

    goto :goto_0

    .line 3
    :cond_0
    iget-object p1, p0, Lcom/xuexiang/xui/widget/edittext/ValidatorEditText$1;->this$0:Lcom/xuexiang/xui/widget/edittext/ValidatorEditText;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Lcom/xuexiang/xui/widget/edittext/ValidatorEditText;->setError(Ljava/lang/CharSequence;)V

    .line 4
    :goto_0
    iget-object p1, p0, Lcom/xuexiang/xui/widget/edittext/ValidatorEditText$1;->this$0:Lcom/xuexiang/xui/widget/edittext/ValidatorEditText;

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
