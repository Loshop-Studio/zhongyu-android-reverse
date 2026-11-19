.class public Lcom/xuexiang/xui/widget/button/shinebutton/ShineButton$OnClickListenWrapper;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/xuexiang/xui/widget/button/shinebutton/ShineButton;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "OnClickListenWrapper"
.end annotation


# instance fields
.field private mListener:Landroid/view/View$OnClickListener;

.field final synthetic this$0:Lcom/xuexiang/xui/widget/button/shinebutton/ShineButton;


# direct methods
.method constructor <init>(Lcom/xuexiang/xui/widget/button/shinebutton/ShineButton;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/xuexiang/xui/widget/button/shinebutton/ShineButton$OnClickListenWrapper;->this$0:Lcom/xuexiang/xui/widget/button/shinebutton/ShineButton;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(Lcom/xuexiang/xui/widget/button/shinebutton/ShineButton;Landroid/view/View$OnClickListener;)V
    .locals 0

    .line 2
    iput-object p1, p0, Lcom/xuexiang/xui/widget/button/shinebutton/ShineButton$OnClickListenWrapper;->this$0:Lcom/xuexiang/xui/widget/button/shinebutton/ShineButton;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p2, p0, Lcom/xuexiang/xui/widget/button/shinebutton/ShineButton$OnClickListenWrapper;->mListener:Landroid/view/View$OnClickListener;

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/button/shinebutton/ShineButton$OnClickListenWrapper;->this$0:Lcom/xuexiang/xui/widget/button/shinebutton/ShineButton;

    invoke-static {v0}, Lcom/xuexiang/xui/widget/button/shinebutton/ShineButton;->access$100(Lcom/xuexiang/xui/widget/button/shinebutton/ShineButton;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 2
    iget-object v0, p0, Lcom/xuexiang/xui/widget/button/shinebutton/ShineButton$OnClickListenWrapper;->this$0:Lcom/xuexiang/xui/widget/button/shinebutton/ShineButton;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/xuexiang/xui/widget/button/shinebutton/ShineButton;->access$102(Lcom/xuexiang/xui/widget/button/shinebutton/ShineButton;Z)Z

    .line 3
    iget-object v0, p0, Lcom/xuexiang/xui/widget/button/shinebutton/ShineButton$OnClickListenWrapper;->this$0:Lcom/xuexiang/xui/widget/button/shinebutton/ShineButton;

    invoke-virtual {v0}, Lcom/xuexiang/xui/widget/button/shinebutton/ShineButton;->showAnim()V

    goto :goto_0

    .line 4
    :cond_0
    iget-object v0, p0, Lcom/xuexiang/xui/widget/button/shinebutton/ShineButton$OnClickListenWrapper;->this$0:Lcom/xuexiang/xui/widget/button/shinebutton/ShineButton;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/xuexiang/xui/widget/button/shinebutton/ShineButton;->access$102(Lcom/xuexiang/xui/widget/button/shinebutton/ShineButton;Z)Z

    .line 5
    iget-object v0, p0, Lcom/xuexiang/xui/widget/button/shinebutton/ShineButton$OnClickListenWrapper;->this$0:Lcom/xuexiang/xui/widget/button/shinebutton/ShineButton;

    invoke-virtual {v0}, Lcom/xuexiang/xui/widget/button/shinebutton/ShineButton;->setCancel()V

    .line 6
    :goto_0
    iget-object v0, p0, Lcom/xuexiang/xui/widget/button/shinebutton/ShineButton$OnClickListenWrapper;->this$0:Lcom/xuexiang/xui/widget/button/shinebutton/ShineButton;

    invoke-static {v0}, Lcom/xuexiang/xui/widget/button/shinebutton/ShineButton;->access$100(Lcom/xuexiang/xui/widget/button/shinebutton/ShineButton;)Z

    move-result v1

    invoke-static {v0, v1}, Lcom/xuexiang/xui/widget/button/shinebutton/ShineButton;->access$300(Lcom/xuexiang/xui/widget/button/shinebutton/ShineButton;Z)V

    .line 7
    iget-object v0, p0, Lcom/xuexiang/xui/widget/button/shinebutton/ShineButton$OnClickListenWrapper;->mListener:Landroid/view/View$OnClickListener;

    if-eqz v0, :cond_1

    .line 8
    invoke-interface {v0, p1}, Landroid/view/View$OnClickListener;->onClick(Landroid/view/View;)V

    :cond_1
    return-void
.end method

.method public wrapListener(Landroid/view/View$OnClickListener;)V
    .locals 0

    iput-object p1, p0, Lcom/xuexiang/xui/widget/button/shinebutton/ShineButton$OnClickListenWrapper;->mListener:Landroid/view/View$OnClickListener;

    return-void
.end method
