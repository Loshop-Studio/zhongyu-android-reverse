.class Lcom/xuexiang/xui/widget/textview/badge/BadgeAnimator$2;
.super Landroid/animation/AnimatorListenerAdapter;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/xuexiang/xui/widget/textview/badge/BadgeAnimator;-><init>(Landroid/graphics/Bitmap;Landroid/graphics/PointF;Lcom/xuexiang/xui/widget/textview/badge/BadgeView;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/xuexiang/xui/widget/textview/badge/BadgeAnimator;


# direct methods
.method constructor <init>(Lcom/xuexiang/xui/widget/textview/badge/BadgeAnimator;)V
    .locals 0

    iput-object p1, p0, Lcom/xuexiang/xui/widget/textview/badge/BadgeAnimator$2;->this$0:Lcom/xuexiang/xui/widget/textview/badge/BadgeAnimator;

    invoke-direct {p0}, Landroid/animation/AnimatorListenerAdapter;-><init>()V

    return-void
.end method


# virtual methods
.method public onAnimationEnd(Landroid/animation/Animator;)V
    .locals 0

    .line 1
    iget-object p1, p0, Lcom/xuexiang/xui/widget/textview/badge/BadgeAnimator$2;->this$0:Lcom/xuexiang/xui/widget/textview/badge/BadgeAnimator;

    invoke-static {p1}, Lcom/xuexiang/xui/widget/textview/badge/BadgeAnimator;->access$000(Lcom/xuexiang/xui/widget/textview/badge/BadgeAnimator;)Ljava/lang/ref/WeakReference;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/xuexiang/xui/widget/textview/badge/BadgeView;

    if-eqz p1, :cond_0

    .line 2
    invoke-virtual {p1}, Lcom/xuexiang/xui/widget/textview/badge/BadgeView;->reset()V

    :cond_0
    return-void
.end method
