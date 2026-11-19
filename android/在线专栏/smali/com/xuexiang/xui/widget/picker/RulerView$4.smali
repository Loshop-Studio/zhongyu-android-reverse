.class Lcom/xuexiang/xui/widget/picker/RulerView$4;
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

    iput-object p1, p0, Lcom/xuexiang/xui/widget/picker/RulerView$4;->this$0:Lcom/xuexiang/xui/widget/picker/RulerView;

    invoke-direct {p0}, Landroid/animation/AnimatorListenerAdapter;-><init>()V

    return-void
.end method


# virtual methods
.method public onAnimationEnd(Landroid/animation/Animator;)V
    .locals 1

    .line 1
    invoke-super {p0, p1}, Landroid/animation/AnimatorListenerAdapter;->onAnimationEnd(Landroid/animation/Animator;)V

    .line 2
    iget-object p1, p0, Lcom/xuexiang/xui/widget/picker/RulerView$4;->this$0:Lcom/xuexiang/xui/widget/picker/RulerView;

    const/high16 v0, -0x40800000    # -1.0f

    invoke-static {p1, v0}, Lcom/xuexiang/xui/widget/picker/RulerView;->access$602(Lcom/xuexiang/xui/widget/picker/RulerView;F)F

    return-void
.end method
