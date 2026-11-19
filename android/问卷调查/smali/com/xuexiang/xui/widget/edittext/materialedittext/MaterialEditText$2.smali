.class public Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText$2;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroid/text/TextWatcher;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->initFloatingLabel()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic this$0:Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;


# direct methods
.method public constructor <init>(Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;)V
    .locals 0

    iput-object p1, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText$2;->this$0:Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public afterTextChanged(Landroid/text/Editable;)V
    .locals 1

    iget-object v0, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText$2;->this$0:Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;

    invoke-static {v0}, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->access$200(Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;)Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p1}, Landroid/text/Editable;->length()I

    move-result p1

    if-nez p1, :cond_0

    iget-object p1, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText$2;->this$0:Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;

    invoke-static {p1}, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->access$300(Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;)Z

    move-result p1

    if-eqz p1, :cond_1

    iget-object p1, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText$2;->this$0:Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;

    const/4 v0, 0x0

    invoke-static {p1, v0}, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->access$302(Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;Z)Z

    iget-object p1, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText$2;->this$0:Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;

    invoke-static {p1}, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->access$400(Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;)Landroid/animation/ObjectAnimator;

    move-result-object p1

    invoke-virtual {p1}, Landroid/animation/ObjectAnimator;->reverse()V

    goto :goto_0

    :cond_0
    iget-object p1, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText$2;->this$0:Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;

    invoke-static {p1}, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->access$300(Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;)Z

    move-result p1

    if-nez p1, :cond_1

    iget-object p1, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText$2;->this$0:Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;

    const/4 v0, 0x1

    invoke-static {p1, v0}, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->access$302(Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;Z)Z

    iget-object p1, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText$2;->this$0:Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;

    invoke-static {p1}, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->access$400(Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;)Landroid/animation/ObjectAnimator;

    move-result-object p1

    invoke-virtual {p1}, Landroid/animation/ObjectAnimator;->start()V

    :cond_1
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
