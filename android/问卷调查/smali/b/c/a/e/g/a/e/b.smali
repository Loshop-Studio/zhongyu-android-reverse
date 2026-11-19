.class public final Lb/c/a/e/g/a/e/b;
.super Landroid/os/Handler;
.source ""


# instance fields
.field public final a:Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;


# direct methods
.method public constructor <init>(Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;)V
    .locals 0

    invoke-direct {p0}, Landroid/os/Handler;-><init>()V

    iput-object p1, p0, Lb/c/a/e/g/a/e/b;->a:Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;

    return-void
.end method


# virtual methods
.method public final handleMessage(Landroid/os/Message;)V
    .locals 3

    iget p1, p1, Landroid/os/Message;->what:I

    const/16 v0, 0x3e8

    if-eq p1, v0, :cond_2

    const/16 v0, 0x7d0

    if-eq p1, v0, :cond_1

    const/16 v0, 0xbb8

    if-eq p1, v0, :cond_0

    goto :goto_0

    :cond_0
    iget-object p1, p0, Lb/c/a/e/g/a/e/b;->a:Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;

    .line 1
    iget-object v0, p1, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->f:Lb/c/a/e/g/a/d/b;

    if-eqz v0, :cond_3

    new-instance v0, Lb/c/a/e/g/a/a;

    invoke-direct {v0, p1}, Lb/c/a/e/g/a/a;-><init>(Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;)V

    const-wide/16 v1, 0xc8

    invoke-virtual {p1, v0, v1, v2}, Landroid/view/View;->postDelayed(Ljava/lang/Runnable;J)Z

    goto :goto_0

    .line 2
    :cond_1
    iget-object p1, p0, Lb/c/a/e/g/a/e/b;->a:Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;

    sget-object v0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView$a;->c:Lcom/xuexiang/xui/widget/picker/wheelview/WheelView$a;

    invoke-virtual {p1, v0}, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->f(Lcom/xuexiang/xui/widget/picker/wheelview/WheelView$a;)V

    goto :goto_0

    :cond_2
    iget-object p1, p0, Lb/c/a/e/g/a/e/b;->a:Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;

    invoke-virtual {p1}, Landroid/view/View;->invalidate()V

    :cond_3
    :goto_0
    return-void
.end method
