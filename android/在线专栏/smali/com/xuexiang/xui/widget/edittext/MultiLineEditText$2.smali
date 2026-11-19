.class Lcom/xuexiang/xui/widget/edittext/MultiLineEditText$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/text/TextWatcher;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/xuexiang/xui/widget/edittext/MultiLineEditText;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/xuexiang/xui/widget/edittext/MultiLineEditText;


# direct methods
.method constructor <init>(Lcom/xuexiang/xui/widget/edittext/MultiLineEditText;)V
    .locals 0

    iput-object p1, p0, Lcom/xuexiang/xui/widget/edittext/MultiLineEditText$2;->this$0:Lcom/xuexiang/xui/widget/edittext/MultiLineEditText;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public afterTextChanged(Landroid/text/Editable;)V
    .locals 7

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/edittext/MultiLineEditText$2;->this$0:Lcom/xuexiang/xui/widget/edittext/MultiLineEditText;

    invoke-static {v0}, Lcom/xuexiang/xui/widget/edittext/MultiLineEditText;->access$000(Lcom/xuexiang/xui/widget/edittext/MultiLineEditText;)Landroid/widget/EditText;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/EditText;->getSelectionStart()I

    move-result v0

    .line 2
    iget-object v1, p0, Lcom/xuexiang/xui/widget/edittext/MultiLineEditText$2;->this$0:Lcom/xuexiang/xui/widget/edittext/MultiLineEditText;

    invoke-static {v1}, Lcom/xuexiang/xui/widget/edittext/MultiLineEditText;->access$000(Lcom/xuexiang/xui/widget/edittext/MultiLineEditText;)Landroid/widget/EditText;

    move-result-object v1

    invoke-virtual {v1}, Landroid/widget/EditText;->getSelectionEnd()I

    move-result v1

    .line 3
    iget-object v2, p0, Lcom/xuexiang/xui/widget/edittext/MultiLineEditText$2;->this$0:Lcom/xuexiang/xui/widget/edittext/MultiLineEditText;

    invoke-static {v2}, Lcom/xuexiang/xui/widget/edittext/MultiLineEditText;->access$000(Lcom/xuexiang/xui/widget/edittext/MultiLineEditText;)Landroid/widget/EditText;

    move-result-object v2

    iget-object v3, p0, Lcom/xuexiang/xui/widget/edittext/MultiLineEditText$2;->this$0:Lcom/xuexiang/xui/widget/edittext/MultiLineEditText;

    invoke-static {v3}, Lcom/xuexiang/xui/widget/edittext/MultiLineEditText;->access$100(Lcom/xuexiang/xui/widget/edittext/MultiLineEditText;)Landroid/text/TextWatcher;

    move-result-object v3

    invoke-virtual {v2, v3}, Landroid/widget/EditText;->removeTextChangedListener(Landroid/text/TextWatcher;)V

    .line 4
    iget-object v2, p0, Lcom/xuexiang/xui/widget/edittext/MultiLineEditText$2;->this$0:Lcom/xuexiang/xui/widget/edittext/MultiLineEditText;

    invoke-static {v2}, Lcom/xuexiang/xui/widget/edittext/MultiLineEditText;->access$200(Lcom/xuexiang/xui/widget/edittext/MultiLineEditText;)Z

    move-result v2

    if-eqz v2, :cond_0

    .line 5
    :goto_0
    iget-object v2, p0, Lcom/xuexiang/xui/widget/edittext/MultiLineEditText$2;->this$0:Lcom/xuexiang/xui/widget/edittext/MultiLineEditText;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3}, Lcom/xuexiang/xui/widget/edittext/MultiLineEditText;->access$300(Lcom/xuexiang/xui/widget/edittext/MultiLineEditText;Ljava/lang/CharSequence;)I

    move-result v2

    iget-object v3, p0, Lcom/xuexiang/xui/widget/edittext/MultiLineEditText$2;->this$0:Lcom/xuexiang/xui/widget/edittext/MultiLineEditText;

    invoke-static {v3}, Lcom/xuexiang/xui/widget/edittext/MultiLineEditText;->access$400(Lcom/xuexiang/xui/widget/edittext/MultiLineEditText;)I

    move-result v3

    if-le v2, v3, :cond_1

    add-int/lit8 v2, v0, -0x1

    .line 6
    invoke-interface {p1, v2, v1}, Landroid/text/Editable;->delete(II)Landroid/text/Editable;

    add-int/lit8 v0, v0, -0x1

    add-int/lit8 v1, v1, -0x1

    goto :goto_0

    .line 7
    :cond_0
    :goto_1
    iget-object v2, p0, Lcom/xuexiang/xui/widget/edittext/MultiLineEditText$2;->this$0:Lcom/xuexiang/xui/widget/edittext/MultiLineEditText;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3}, Lcom/xuexiang/xui/widget/edittext/MultiLineEditText;->access$500(Lcom/xuexiang/xui/widget/edittext/MultiLineEditText;Ljava/lang/CharSequence;)J

    move-result-wide v2

    iget-object v4, p0, Lcom/xuexiang/xui/widget/edittext/MultiLineEditText$2;->this$0:Lcom/xuexiang/xui/widget/edittext/MultiLineEditText;

    invoke-static {v4}, Lcom/xuexiang/xui/widget/edittext/MultiLineEditText;->access$400(Lcom/xuexiang/xui/widget/edittext/MultiLineEditText;)I

    move-result v4

    int-to-long v4, v4

    cmp-long v6, v2, v4

    if-lez v6, :cond_1

    add-int/lit8 v2, v0, -0x1

    .line 8
    invoke-interface {p1, v2, v1}, Landroid/text/Editable;->delete(II)Landroid/text/Editable;

    add-int/lit8 v0, v0, -0x1

    add-int/lit8 v1, v1, -0x1

    goto :goto_1

    .line 9
    :cond_1
    iget-object p1, p0, Lcom/xuexiang/xui/widget/edittext/MultiLineEditText$2;->this$0:Lcom/xuexiang/xui/widget/edittext/MultiLineEditText;

    invoke-static {p1}, Lcom/xuexiang/xui/widget/edittext/MultiLineEditText;->access$000(Lcom/xuexiang/xui/widget/edittext/MultiLineEditText;)Landroid/widget/EditText;

    move-result-object p1

    invoke-virtual {p1, v0}, Landroid/widget/EditText;->setSelection(I)V

    .line 10
    iget-object p1, p0, Lcom/xuexiang/xui/widget/edittext/MultiLineEditText$2;->this$0:Lcom/xuexiang/xui/widget/edittext/MultiLineEditText;

    invoke-static {p1}, Lcom/xuexiang/xui/widget/edittext/MultiLineEditText;->access$000(Lcom/xuexiang/xui/widget/edittext/MultiLineEditText;)Landroid/widget/EditText;

    move-result-object p1

    iget-object v0, p0, Lcom/xuexiang/xui/widget/edittext/MultiLineEditText$2;->this$0:Lcom/xuexiang/xui/widget/edittext/MultiLineEditText;

    invoke-static {v0}, Lcom/xuexiang/xui/widget/edittext/MultiLineEditText;->access$100(Lcom/xuexiang/xui/widget/edittext/MultiLineEditText;)Landroid/text/TextWatcher;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/widget/EditText;->addTextChangedListener(Landroid/text/TextWatcher;)V

    .line 11
    iget-object p1, p0, Lcom/xuexiang/xui/widget/edittext/MultiLineEditText$2;->this$0:Lcom/xuexiang/xui/widget/edittext/MultiLineEditText;

    invoke-static {p1}, Lcom/xuexiang/xui/widget/edittext/MultiLineEditText;->access$600(Lcom/xuexiang/xui/widget/edittext/MultiLineEditText;)V

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
