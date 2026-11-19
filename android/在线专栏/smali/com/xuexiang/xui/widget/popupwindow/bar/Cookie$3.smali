.class Lcom/xuexiang/xui/widget/popupwindow/bar/Cookie$3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/animation/Animation$AnimationListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/xuexiang/xui/widget/popupwindow/bar/Cookie;->createInAnim()V
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

    iput-object p1, p0, Lcom/xuexiang/xui/widget/popupwindow/bar/Cookie$3;->this$0:Lcom/xuexiang/xui/widget/popupwindow/bar/Cookie;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onAnimationEnd(Landroid/view/animation/Animation;)V
    .locals 4

    .line 1
    iget-object p1, p0, Lcom/xuexiang/xui/widget/popupwindow/bar/Cookie$3;->this$0:Lcom/xuexiang/xui/widget/popupwindow/bar/Cookie;

    invoke-static {p1}, Lcom/xuexiang/xui/widget/popupwindow/bar/Cookie;->access$000(Lcom/xuexiang/xui/widget/popupwindow/bar/Cookie;)J

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmp-long p1, v0, v2

    if-gez p1, :cond_0

    return-void

    .line 2
    :cond_0
    iget-object p1, p0, Lcom/xuexiang/xui/widget/popupwindow/bar/Cookie$3;->this$0:Lcom/xuexiang/xui/widget/popupwindow/bar/Cookie;

    new-instance v0, Lcom/xuexiang/xui/widget/popupwindow/bar/Cookie$3$1;

    invoke-direct {v0, p0}, Lcom/xuexiang/xui/widget/popupwindow/bar/Cookie$3$1;-><init>(Lcom/xuexiang/xui/widget/popupwindow/bar/Cookie$3;)V

    iget-object v1, p0, Lcom/xuexiang/xui/widget/popupwindow/bar/Cookie$3;->this$0:Lcom/xuexiang/xui/widget/popupwindow/bar/Cookie;

    .line 3
    invoke-static {v1}, Lcom/xuexiang/xui/widget/popupwindow/bar/Cookie;->access$000(Lcom/xuexiang/xui/widget/popupwindow/bar/Cookie;)J

    move-result-wide v1

    .line 4
    invoke-virtual {p1, v0, v1, v2}, Landroid/widget/LinearLayout;->postDelayed(Ljava/lang/Runnable;J)Z

    return-void
.end method

.method public onAnimationRepeat(Landroid/view/animation/Animation;)V
    .locals 0

    return-void
.end method

.method public onAnimationStart(Landroid/view/animation/Animation;)V
    .locals 0

    return-void
.end method
