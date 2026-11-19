.class public Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText$3;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroid/view/View$OnFocusChangeListener;


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

    iput-object p1, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText$3;->this$0:Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onFocusChange(Landroid/view/View;Z)V
    .locals 1

    iget-object v0, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText$3;->this$0:Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;

    invoke-static {v0}, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->access$200(Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText$3;->this$0:Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;

    invoke-static {v0}, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->access$500(Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText$3;->this$0:Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;

    invoke-static {v0}, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->access$600(Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;)Landroid/animation/ObjectAnimator;

    move-result-object v0

    if-eqz p2, :cond_0

    invoke-virtual {v0}, Landroid/animation/ObjectAnimator;->start()V

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Landroid/animation/ObjectAnimator;->reverse()V

    :cond_1
    :goto_0
    iget-object v0, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText$3;->this$0:Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;

    invoke-static {v0}, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->access$700(Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;)Z

    move-result v0

    if-eqz v0, :cond_2

    if-nez p2, :cond_2

    iget-object v0, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText$3;->this$0:Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;

    invoke-virtual {v0}, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->validate()Z

    :cond_2
    iget-object v0, p0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText$3;->this$0:Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;

    iget-object v0, v0, Lcom/xuexiang/xui/widget/edittext/materialedittext/MaterialEditText;->outerFocusChangeListener:Landroid/view/View$OnFocusChangeListener;

    if-eqz v0, :cond_3

    invoke-interface {v0, p1, p2}, Landroid/view/View$OnFocusChangeListener;->onFocusChange(Landroid/view/View;Z)V

    :cond_3
    return-void
.end method
