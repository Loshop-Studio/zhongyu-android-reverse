.class Lcom/xuexiang/xui/widget/behavior/TranslateAnimateHelper$4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/animation/ValueAnimator$AnimatorUpdateListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/xuexiang/xui/widget/behavior/TranslateAnimateHelper;->hideBottom()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/xuexiang/xui/widget/behavior/TranslateAnimateHelper;


# direct methods
.method constructor <init>(Lcom/xuexiang/xui/widget/behavior/TranslateAnimateHelper;)V
    .locals 0

    iput-object p1, p0, Lcom/xuexiang/xui/widget/behavior/TranslateAnimateHelper$4;->this$0:Lcom/xuexiang/xui/widget/behavior/TranslateAnimateHelper;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onAnimationUpdate(Landroid/animation/ValueAnimator;)V
    .locals 1

    iget-object v0, p0, Lcom/xuexiang/xui/widget/behavior/TranslateAnimateHelper$4;->this$0:Lcom/xuexiang/xui/widget/behavior/TranslateAnimateHelper;

    iget-object v0, v0, Lcom/xuexiang/xui/widget/behavior/TranslateAnimateHelper;->mTarget:Landroid/view/View;

    invoke-virtual {p1}, Landroid/animation/ValueAnimator;->getAnimatedValue()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Float;

    invoke-virtual {p1}, Ljava/lang/Float;->floatValue()F

    move-result p1

    invoke-virtual {v0, p1}, Landroid/view/View;->setY(F)V

    return-void
.end method
