.class Lcom/xuexiang/xui/widget/picker/RulerView$6;
.super Landroid/animation/AnimatorListenerAdapter;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/xuexiang/xui/widget/picker/RulerView;->drawScaleAndNum(Landroid/graphics/Canvas;)V
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

    iput-object p1, p0, Lcom/xuexiang/xui/widget/picker/RulerView$6;->this$0:Lcom/xuexiang/xui/widget/picker/RulerView;

    invoke-direct {p0}, Landroid/animation/AnimatorListenerAdapter;-><init>()V

    return-void
.end method


# virtual methods
.method public onAnimationEnd(Landroid/animation/Animator;)V
    .locals 1

    .line 1
    invoke-super {p0, p1}, Landroid/animation/AnimatorListenerAdapter;->onAnimationEnd(Landroid/animation/Animator;)V

    .line 2
    iget-object p1, p0, Lcom/xuexiang/xui/widget/picker/RulerView$6;->this$0:Lcom/xuexiang/xui/widget/picker/RulerView;

    invoke-static {p1}, Lcom/xuexiang/xui/widget/picker/RulerView;->access$700(Lcom/xuexiang/xui/widget/picker/RulerView;)Lcom/xuexiang/xui/widget/picker/RulerView$OnChooseResultListener;

    move-result-object p1

    if-eqz p1, :cond_0

    .line 3
    iget-object p1, p0, Lcom/xuexiang/xui/widget/picker/RulerView$6;->this$0:Lcom/xuexiang/xui/widget/picker/RulerView;

    invoke-static {p1}, Lcom/xuexiang/xui/widget/picker/RulerView;->access$700(Lcom/xuexiang/xui/widget/picker/RulerView;)Lcom/xuexiang/xui/widget/picker/RulerView$OnChooseResultListener;

    move-result-object p1

    iget-object v0, p0, Lcom/xuexiang/xui/widget/picker/RulerView$6;->this$0:Lcom/xuexiang/xui/widget/picker/RulerView;

    invoke-static {v0}, Lcom/xuexiang/xui/widget/picker/RulerView;->access$800(Lcom/xuexiang/xui/widget/picker/RulerView;)Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v0}, Lcom/xuexiang/xui/widget/picker/RulerView$OnChooseResultListener;->onEndResult(Ljava/lang/String;)V

    :cond_0
    return-void
.end method
