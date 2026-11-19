.class Lcom/xuexiang/xui/widget/picker/RulerView$2;
.super Landroid/animation/AnimatorListenerAdapter;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/xuexiang/xui/widget/picker/RulerView;->autoVelocityScroll(I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/xuexiang/xui/widget/picker/RulerView;


# direct methods
.method constructor <init>(Lcom/xuexiang/xui/widget/picker/RulerView;)V
    .locals 0

    iput-object p1, p0, Lcom/xuexiang/xui/widget/picker/RulerView$2;->this$0:Lcom/xuexiang/xui/widget/picker/RulerView;

    invoke-direct {p0}, Landroid/animation/AnimatorListenerAdapter;-><init>()V

    return-void
.end method


# virtual methods
.method public onAnimationEnd(Landroid/animation/Animator;)V
    .locals 1

    .line 1
    iget-object p1, p0, Lcom/xuexiang/xui/widget/picker/RulerView$2;->this$0:Lcom/xuexiang/xui/widget/picker/RulerView;

    const/4 v0, 0x1

    invoke-static {p1, v0}, Lcom/xuexiang/xui/widget/picker/RulerView;->access$502(Lcom/xuexiang/xui/widget/picker/RulerView;Z)Z

    .line 2
    iget-object p1, p0, Lcom/xuexiang/xui/widget/picker/RulerView$2;->this$0:Lcom/xuexiang/xui/widget/picker/RulerView;

    invoke-virtual {p1}, Landroid/view/View;->invalidate()V

    return-void
.end method
