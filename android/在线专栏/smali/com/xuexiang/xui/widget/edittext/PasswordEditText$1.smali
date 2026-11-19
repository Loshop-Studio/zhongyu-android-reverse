.class Lcom/xuexiang/xui/widget/edittext/PasswordEditText$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/text/TextWatcher;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/xuexiang/xui/widget/edittext/PasswordEditText;->initAttrs(Landroid/content/Context;Landroid/util/AttributeSet;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/xuexiang/xui/widget/edittext/PasswordEditText;


# direct methods
.method constructor <init>(Lcom/xuexiang/xui/widget/edittext/PasswordEditText;)V
    .locals 0

    iput-object p1, p0, Lcom/xuexiang/xui/widget/edittext/PasswordEditText$1;->this$0:Lcom/xuexiang/xui/widget/edittext/PasswordEditText;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public afterTextChanged(Landroid/text/Editable;)V
    .locals 3

    .line 1
    invoke-interface {p1}, Landroid/text/Editable;->length()I

    move-result p1

    const/4 v0, 0x0

    if-lez p1, :cond_1

    .line 2
    iget-object p1, p0, Lcom/xuexiang/xui/widget/edittext/PasswordEditText$1;->this$0:Lcom/xuexiang/xui/widget/edittext/PasswordEditText;

    invoke-static {p1}, Lcom/xuexiang/xui/widget/edittext/PasswordEditText;->access$000(Lcom/xuexiang/xui/widget/edittext/PasswordEditText;)Z

    move-result p1

    const/4 v1, 0x1

    if-eqz p1, :cond_0

    .line 3
    iget-object p1, p0, Lcom/xuexiang/xui/widget/edittext/PasswordEditText$1;->this$0:Lcom/xuexiang/xui/widget/edittext/PasswordEditText;

    const/4 v2, 0x0

    invoke-virtual {p1, v2, v2, v2, v2}, Landroid/widget/EditText;->setCompoundDrawablesRelative(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V

    .line 4
    iget-object p1, p0, Lcom/xuexiang/xui/widget/edittext/PasswordEditText$1;->this$0:Lcom/xuexiang/xui/widget/edittext/PasswordEditText;

    invoke-static {p1, v0}, Lcom/xuexiang/xui/widget/edittext/PasswordEditText;->access$002(Lcom/xuexiang/xui/widget/edittext/PasswordEditText;Z)Z

    .line 5
    iget-object p1, p0, Lcom/xuexiang/xui/widget/edittext/PasswordEditText$1;->this$0:Lcom/xuexiang/xui/widget/edittext/PasswordEditText;

    invoke-static {p1, v1}, Lcom/xuexiang/xui/widget/edittext/PasswordEditText;->access$100(Lcom/xuexiang/xui/widget/edittext/PasswordEditText;Z)V

    .line 6
    :cond_0
    iget-object p1, p0, Lcom/xuexiang/xui/widget/edittext/PasswordEditText$1;->this$0:Lcom/xuexiang/xui/widget/edittext/PasswordEditText;

    invoke-static {p1}, Lcom/xuexiang/xui/widget/edittext/PasswordEditText;->access$200(Lcom/xuexiang/xui/widget/edittext/PasswordEditText;)Z

    move-result p1

    if-nez p1, :cond_2

    .line 7
    iget-object p1, p0, Lcom/xuexiang/xui/widget/edittext/PasswordEditText$1;->this$0:Lcom/xuexiang/xui/widget/edittext/PasswordEditText;

    invoke-static {p1, v1}, Lcom/xuexiang/xui/widget/edittext/PasswordEditText;->access$100(Lcom/xuexiang/xui/widget/edittext/PasswordEditText;Z)V

    goto :goto_0

    .line 8
    :cond_1
    iget-object p1, p0, Lcom/xuexiang/xui/widget/edittext/PasswordEditText$1;->this$0:Lcom/xuexiang/xui/widget/edittext/PasswordEditText;

    invoke-static {p1, v0}, Lcom/xuexiang/xui/widget/edittext/PasswordEditText;->access$302(Lcom/xuexiang/xui/widget/edittext/PasswordEditText;Z)Z

    .line 9
    iget-object p1, p0, Lcom/xuexiang/xui/widget/edittext/PasswordEditText$1;->this$0:Lcom/xuexiang/xui/widget/edittext/PasswordEditText;

    invoke-static {p1}, Lcom/xuexiang/xui/widget/edittext/PasswordEditText;->access$400(Lcom/xuexiang/xui/widget/edittext/PasswordEditText;)V

    .line 10
    iget-object p1, p0, Lcom/xuexiang/xui/widget/edittext/PasswordEditText$1;->this$0:Lcom/xuexiang/xui/widget/edittext/PasswordEditText;

    invoke-static {p1, v0}, Lcom/xuexiang/xui/widget/edittext/PasswordEditText;->access$100(Lcom/xuexiang/xui/widget/edittext/PasswordEditText;Z)V

    :cond_2
    :goto_0
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
