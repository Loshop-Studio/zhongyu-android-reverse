.class Lcom/xuexiang/xui/widget/textview/MarqueeTextView$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Handler$Callback;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/xuexiang/xui/widget/textview/MarqueeTextView;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/xuexiang/xui/widget/textview/MarqueeTextView;


# direct methods
.method constructor <init>(Lcom/xuexiang/xui/widget/textview/MarqueeTextView;)V
    .locals 0

    iput-object p1, p0, Lcom/xuexiang/xui/widget/textview/MarqueeTextView$1;->this$0:Lcom/xuexiang/xui/widget/textview/MarqueeTextView;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)Z
    .locals 3

    .line 1
    iget p1, p1, Landroid/os/Message;->what:I

    const/4 v0, 0x1

    if-eq p1, v0, :cond_0

    goto :goto_0

    .line 2
    :cond_0
    iget-object p1, p0, Lcom/xuexiang/xui/widget/textview/MarqueeTextView$1;->this$0:Lcom/xuexiang/xui/widget/textview/MarqueeTextView;

    invoke-static {p1}, Lcom/xuexiang/xui/widget/textview/MarqueeTextView;->access$000(Lcom/xuexiang/xui/widget/textview/MarqueeTextView;)F

    move-result p1

    iget-object v1, p0, Lcom/xuexiang/xui/widget/textview/MarqueeTextView$1;->this$0:Lcom/xuexiang/xui/widget/textview/MarqueeTextView;

    invoke-static {v1}, Lcom/xuexiang/xui/widget/textview/MarqueeTextView;->access$100(Lcom/xuexiang/xui/widget/textview/MarqueeTextView;)F

    move-result v1

    neg-float v1, v1

    cmpg-float p1, p1, v1

    if-gez p1, :cond_1

    .line 3
    iget-object p1, p0, Lcom/xuexiang/xui/widget/textview/MarqueeTextView$1;->this$0:Lcom/xuexiang/xui/widget/textview/MarqueeTextView;

    invoke-static {p1}, Lcom/xuexiang/xui/widget/textview/MarqueeTextView;->access$200(Lcom/xuexiang/xui/widget/textview/MarqueeTextView;)V

    goto :goto_0

    .line 4
    :cond_1
    iget-object p1, p0, Lcom/xuexiang/xui/widget/textview/MarqueeTextView$1;->this$0:Lcom/xuexiang/xui/widget/textview/MarqueeTextView;

    invoke-static {p1}, Lcom/xuexiang/xui/widget/textview/MarqueeTextView;->access$000(Lcom/xuexiang/xui/widget/textview/MarqueeTextView;)F

    move-result v1

    iget-object v2, p0, Lcom/xuexiang/xui/widget/textview/MarqueeTextView$1;->this$0:Lcom/xuexiang/xui/widget/textview/MarqueeTextView;

    invoke-static {v2}, Lcom/xuexiang/xui/widget/textview/MarqueeTextView;->access$300(Lcom/xuexiang/xui/widget/textview/MarqueeTextView;)I

    move-result v2

    int-to-float v2, v2

    sub-float/2addr v1, v2

    invoke-static {p1, v1}, Lcom/xuexiang/xui/widget/textview/MarqueeTextView;->access$002(Lcom/xuexiang/xui/widget/textview/MarqueeTextView;F)F

    .line 5
    iget-object p1, p0, Lcom/xuexiang/xui/widget/textview/MarqueeTextView$1;->this$0:Lcom/xuexiang/xui/widget/textview/MarqueeTextView;

    const/16 v1, 0x1e

    invoke-static {p1, v1}, Lcom/xuexiang/xui/widget/textview/MarqueeTextView;->access$400(Lcom/xuexiang/xui/widget/textview/MarqueeTextView;I)V

    :goto_0
    return v0
.end method
