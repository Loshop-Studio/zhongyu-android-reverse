.class Lcom/xuexiang/xui/widget/button/SmoothCheckBox$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/xuexiang/xui/widget/button/SmoothCheckBox;->initAttrs(Landroid/content/Context;Landroid/util/AttributeSet;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/xuexiang/xui/widget/button/SmoothCheckBox;


# direct methods
.method constructor <init>(Lcom/xuexiang/xui/widget/button/SmoothCheckBox;)V
    .locals 0

    iput-object p1, p0, Lcom/xuexiang/xui/widget/button/SmoothCheckBox$1;->this$0:Lcom/xuexiang/xui/widget/button/SmoothCheckBox;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 1

    .line 1
    iget-object p1, p0, Lcom/xuexiang/xui/widget/button/SmoothCheckBox$1;->this$0:Lcom/xuexiang/xui/widget/button/SmoothCheckBox;

    invoke-virtual {p1}, Lcom/xuexiang/xui/widget/button/SmoothCheckBox;->toggle()V

    .line 2
    iget-object p1, p0, Lcom/xuexiang/xui/widget/button/SmoothCheckBox$1;->this$0:Lcom/xuexiang/xui/widget/button/SmoothCheckBox;

    const/4 v0, 0x0

    invoke-static {p1, v0}, Lcom/xuexiang/xui/widget/button/SmoothCheckBox;->access$002(Lcom/xuexiang/xui/widget/button/SmoothCheckBox;Z)Z

    .line 3
    iget-object p1, p0, Lcom/xuexiang/xui/widget/button/SmoothCheckBox$1;->this$0:Lcom/xuexiang/xui/widget/button/SmoothCheckBox;

    const/4 v0, 0x0

    invoke-static {p1, v0}, Lcom/xuexiang/xui/widget/button/SmoothCheckBox;->access$102(Lcom/xuexiang/xui/widget/button/SmoothCheckBox;F)F

    .line 4
    iget-object p1, p0, Lcom/xuexiang/xui/widget/button/SmoothCheckBox$1;->this$0:Lcom/xuexiang/xui/widget/button/SmoothCheckBox;

    invoke-virtual {p1}, Lcom/xuexiang/xui/widget/button/SmoothCheckBox;->isChecked()Z

    move-result p1

    if-eqz p1, :cond_0

    .line 5
    iget-object p1, p0, Lcom/xuexiang/xui/widget/button/SmoothCheckBox$1;->this$0:Lcom/xuexiang/xui/widget/button/SmoothCheckBox;

    invoke-static {p1}, Lcom/xuexiang/xui/widget/button/SmoothCheckBox;->access$200(Lcom/xuexiang/xui/widget/button/SmoothCheckBox;)V

    goto :goto_0

    .line 6
    :cond_0
    iget-object p1, p0, Lcom/xuexiang/xui/widget/button/SmoothCheckBox$1;->this$0:Lcom/xuexiang/xui/widget/button/SmoothCheckBox;

    invoke-static {p1}, Lcom/xuexiang/xui/widget/button/SmoothCheckBox;->access$300(Lcom/xuexiang/xui/widget/button/SmoothCheckBox;)V

    :goto_0
    return-void
.end method
