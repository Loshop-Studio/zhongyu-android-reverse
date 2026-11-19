.class Lcom/xuexiang/xui/widget/popupwindow/bar/Cookie$6;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/xuexiang/xui/widget/popupwindow/bar/Cookie;->destroy()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/xuexiang/xui/widget/popupwindow/bar/Cookie;


# direct methods
.method constructor <init>(Lcom/xuexiang/xui/widget/popupwindow/bar/Cookie;)V
    .locals 0

    iput-object p1, p0, Lcom/xuexiang/xui/widget/popupwindow/bar/Cookie$6;->this$0:Lcom/xuexiang/xui/widget/popupwindow/bar/Cookie;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/popupwindow/bar/Cookie$6;->this$0:Lcom/xuexiang/xui/widget/popupwindow/bar/Cookie;

    invoke-virtual {v0}, Landroid/widget/LinearLayout;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 2
    iget-object v1, p0, Lcom/xuexiang/xui/widget/popupwindow/bar/Cookie$6;->this$0:Lcom/xuexiang/xui/widget/popupwindow/bar/Cookie;

    invoke-virtual {v1}, Landroid/widget/LinearLayout;->clearAnimation()V

    .line 3
    check-cast v0, Landroid/view/ViewGroup;

    iget-object v1, p0, Lcom/xuexiang/xui/widget/popupwindow/bar/Cookie$6;->this$0:Lcom/xuexiang/xui/widget/popupwindow/bar/Cookie;

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    :cond_0
    return-void
.end method
