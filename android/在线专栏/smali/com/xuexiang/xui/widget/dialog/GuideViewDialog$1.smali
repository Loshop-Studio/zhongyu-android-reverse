.class Lcom/xuexiang/xui/widget/dialog/GuideViewDialog$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/xuexiang/xui/widget/dialog/GuideViewDialog;->initView()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/xuexiang/xui/widget/dialog/GuideViewDialog;


# direct methods
.method constructor <init>(Lcom/xuexiang/xui/widget/dialog/GuideViewDialog;)V
    .locals 0

    iput-object p1, p0, Lcom/xuexiang/xui/widget/dialog/GuideViewDialog$1;->this$0:Lcom/xuexiang/xui/widget/dialog/GuideViewDialog;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 2

    .line 1
    iget-object p1, p0, Lcom/xuexiang/xui/widget/dialog/GuideViewDialog$1;->this$0:Lcom/xuexiang/xui/widget/dialog/GuideViewDialog;

    invoke-static {p1}, Lcom/xuexiang/xui/widget/dialog/GuideViewDialog;->access$000(Lcom/xuexiang/xui/widget/dialog/GuideViewDialog;)I

    move-result p1

    iget-object v0, p0, Lcom/xuexiang/xui/widget/dialog/GuideViewDialog$1;->this$0:Lcom/xuexiang/xui/widget/dialog/GuideViewDialog;

    invoke-static {v0}, Lcom/xuexiang/xui/widget/dialog/GuideViewDialog;->access$100(Lcom/xuexiang/xui/widget/dialog/GuideViewDialog;)[I

    move-result-object v0

    array-length v0, v0

    add-int/lit8 v0, v0, -0x1

    if-ne p1, v0, :cond_0

    .line 2
    iget-object p1, p0, Lcom/xuexiang/xui/widget/dialog/GuideViewDialog$1;->this$0:Lcom/xuexiang/xui/widget/dialog/GuideViewDialog;

    invoke-virtual {p1}, Lcom/xuexiang/xui/widget/dialog/GuideViewDialog;->dismiss()V

    goto :goto_0

    .line 3
    :cond_0
    iget-object p1, p0, Lcom/xuexiang/xui/widget/dialog/GuideViewDialog$1;->this$0:Lcom/xuexiang/xui/widget/dialog/GuideViewDialog;

    invoke-static {p1}, Lcom/xuexiang/xui/widget/dialog/GuideViewDialog;->access$008(Lcom/xuexiang/xui/widget/dialog/GuideViewDialog;)I

    .line 4
    iget-object p1, p0, Lcom/xuexiang/xui/widget/dialog/GuideViewDialog$1;->this$0:Lcom/xuexiang/xui/widget/dialog/GuideViewDialog;

    invoke-static {p1}, Lcom/xuexiang/xui/widget/dialog/GuideViewDialog;->access$200(Lcom/xuexiang/xui/widget/dialog/GuideViewDialog;)Landroid/widget/ImageView;

    move-result-object p1

    iget-object v0, p0, Lcom/xuexiang/xui/widget/dialog/GuideViewDialog$1;->this$0:Lcom/xuexiang/xui/widget/dialog/GuideViewDialog;

    invoke-static {v0}, Lcom/xuexiang/xui/widget/dialog/GuideViewDialog;->access$100(Lcom/xuexiang/xui/widget/dialog/GuideViewDialog;)[I

    move-result-object v0

    iget-object v1, p0, Lcom/xuexiang/xui/widget/dialog/GuideViewDialog$1;->this$0:Lcom/xuexiang/xui/widget/dialog/GuideViewDialog;

    invoke-static {v1}, Lcom/xuexiang/xui/widget/dialog/GuideViewDialog;->access$000(Lcom/xuexiang/xui/widget/dialog/GuideViewDialog;)I

    move-result v1

    aget v0, v0, v1

    invoke-virtual {p1, v0}, Landroid/widget/ImageView;->setImageResource(I)V

    :goto_0
    return-void
.end method
