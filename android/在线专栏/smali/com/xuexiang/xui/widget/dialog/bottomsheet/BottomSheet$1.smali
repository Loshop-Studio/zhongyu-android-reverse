.class Lcom/xuexiang/xui/widget/dialog/bottomsheet/BottomSheet$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/animation/Animation$AnimationListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/xuexiang/xui/widget/dialog/bottomsheet/BottomSheet;->animateDown()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/xuexiang/xui/widget/dialog/bottomsheet/BottomSheet;


# direct methods
.method constructor <init>(Lcom/xuexiang/xui/widget/dialog/bottomsheet/BottomSheet;)V
    .locals 0

    iput-object p1, p0, Lcom/xuexiang/xui/widget/dialog/bottomsheet/BottomSheet$1;->this$0:Lcom/xuexiang/xui/widget/dialog/bottomsheet/BottomSheet;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onAnimationEnd(Landroid/view/animation/Animation;)V
    .locals 1

    .line 1
    iget-object p1, p0, Lcom/xuexiang/xui/widget/dialog/bottomsheet/BottomSheet$1;->this$0:Lcom/xuexiang/xui/widget/dialog/bottomsheet/BottomSheet;

    const/4 v0, 0x0

    invoke-static {p1, v0}, Lcom/xuexiang/xui/widget/dialog/bottomsheet/BottomSheet;->access$002(Lcom/xuexiang/xui/widget/dialog/bottomsheet/BottomSheet;Z)Z

    .line 2
    iget-object p1, p0, Lcom/xuexiang/xui/widget/dialog/bottomsheet/BottomSheet$1;->this$0:Lcom/xuexiang/xui/widget/dialog/bottomsheet/BottomSheet;

    invoke-static {p1}, Lcom/xuexiang/xui/widget/dialog/bottomsheet/BottomSheet;->access$200(Lcom/xuexiang/xui/widget/dialog/bottomsheet/BottomSheet;)Landroid/view/View;

    move-result-object p1

    new-instance v0, Lcom/xuexiang/xui/widget/dialog/bottomsheet/BottomSheet$1$1;

    invoke-direct {v0, p0}, Lcom/xuexiang/xui/widget/dialog/bottomsheet/BottomSheet$1$1;-><init>(Lcom/xuexiang/xui/widget/dialog/bottomsheet/BottomSheet$1;)V

    invoke-virtual {p1, v0}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public onAnimationRepeat(Landroid/view/animation/Animation;)V
    .locals 0

    return-void
.end method

.method public onAnimationStart(Landroid/view/animation/Animation;)V
    .locals 1

    iget-object p1, p0, Lcom/xuexiang/xui/widget/dialog/bottomsheet/BottomSheet$1;->this$0:Lcom/xuexiang/xui/widget/dialog/bottomsheet/BottomSheet;

    const/4 v0, 0x1

    invoke-static {p1, v0}, Lcom/xuexiang/xui/widget/dialog/bottomsheet/BottomSheet;->access$002(Lcom/xuexiang/xui/widget/dialog/bottomsheet/BottomSheet;Z)Z

    return-void
.end method
