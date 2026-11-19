.class Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout$TabStrip$2$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/animation/ValueAnimator$AnimatorUpdateListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout$TabStrip$2;->run()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$2:Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout$TabStrip$2;


# direct methods
.method constructor <init>(Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout$TabStrip$2;)V
    .locals 0

    iput-object p1, p0, Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout$TabStrip$2$2;->this$2:Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout$TabStrip$2;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onAnimationUpdate(Landroid/animation/ValueAnimator;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout$TabStrip$2$2;->this$2:Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout$TabStrip$2;

    iget-object v0, v0, Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout$TabStrip$2;->this$1:Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout$TabStrip;

    invoke-virtual {p1}, Landroid/animation/ValueAnimator;->getAnimatedValue()Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    move-result p1

    invoke-static {v0, p1}, Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout$TabStrip;->access$902(Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout$TabStrip;F)F

    .line 2
    iget-object p1, p0, Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout$TabStrip$2$2;->this$2:Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout$TabStrip$2;

    iget-object p1, p1, Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout$TabStrip$2;->this$1:Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout$TabStrip;

    invoke-virtual {p1}, Landroid/widget/LinearLayout;->invalidate()V

    return-void
.end method
