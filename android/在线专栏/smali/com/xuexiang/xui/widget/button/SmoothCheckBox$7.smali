.class Lcom/xuexiang/xui/widget/button/SmoothCheckBox$7;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/xuexiang/xui/widget/button/SmoothCheckBox;->drawTickDelayed()V
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

    iput-object p1, p0, Lcom/xuexiang/xui/widget/button/SmoothCheckBox$7;->this$0:Lcom/xuexiang/xui/widget/button/SmoothCheckBox;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/button/SmoothCheckBox$7;->this$0:Lcom/xuexiang/xui/widget/button/SmoothCheckBox;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/xuexiang/xui/widget/button/SmoothCheckBox;->access$002(Lcom/xuexiang/xui/widget/button/SmoothCheckBox;Z)Z

    .line 2
    iget-object v0, p0, Lcom/xuexiang/xui/widget/button/SmoothCheckBox$7;->this$0:Lcom/xuexiang/xui/widget/button/SmoothCheckBox;

    invoke-virtual {v0}, Landroid/view/View;->postInvalidate()V

    return-void
.end method
