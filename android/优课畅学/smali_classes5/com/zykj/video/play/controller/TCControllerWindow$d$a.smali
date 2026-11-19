.class public Lcom/zykj/video/play/controller/TCControllerWindow$d$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/animation/ValueAnimator$AnimatorUpdateListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/video/play/controller/TCControllerWindow$d;->run()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lcom/zykj/video/play/controller/TCControllerWindow$d;


# direct methods
.method public constructor <init>(Lcom/zykj/video/play/controller/TCControllerWindow$d;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/zykj/video/play/controller/TCControllerWindow$d$a;->a:Lcom/zykj/video/play/controller/TCControllerWindow$d;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public onAnimationUpdate(Landroid/animation/ValueAnimator;)V
    .locals 1

    .line 1
    invoke-virtual {p1}, Landroid/animation/ValueAnimator;->getAnimatedValue()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    check-cast p1, Ljava/lang/Float;

    .line 6
    .line 7
    invoke-virtual {p1}, Ljava/lang/Float;->floatValue()F

    .line 8
    .line 9
    .line 10
    move-result p1

    .line 11
    iget-object v0, p0, Lcom/zykj/video/play/controller/TCControllerWindow$d$a;->a:Lcom/zykj/video/play/controller/TCControllerWindow$d;

    .line 12
    .line 13
    iget-object v0, v0, Lcom/zykj/video/play/controller/TCControllerWindow$d;->a:Lcom/zykj/video/play/controller/TCControllerWindow;

    .line 14
    .line 15
    invoke-static {v0}, Lcom/zykj/video/play/controller/TCControllerWindow;->h(Lcom/zykj/video/play/controller/TCControllerWindow;)Landroid/widget/ImageView;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    invoke-virtual {v0, p1}, Landroid/view/View;->setAlpha(F)V

    .line 20
    .line 21
    .line 22
    const/4 v0, 0x0

    .line 23
    cmpl-float p1, p1, v0

    .line 24
    .line 25
    if-nez p1, :cond_0

    .line 26
    .line 27
    iget-object p1, p0, Lcom/zykj/video/play/controller/TCControllerWindow$d$a;->a:Lcom/zykj/video/play/controller/TCControllerWindow$d;

    .line 28
    .line 29
    iget-object p1, p1, Lcom/zykj/video/play/controller/TCControllerWindow$d;->a:Lcom/zykj/video/play/controller/TCControllerWindow;

    .line 30
    .line 31
    invoke-static {p1}, Lcom/zykj/video/play/controller/TCControllerWindow;->h(Lcom/zykj/video/play/controller/TCControllerWindow;)Landroid/widget/ImageView;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    const/16 v0, 0x8

    .line 36
    .line 37
    invoke-virtual {p1, v0}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 38
    .line 39
    .line 40
    :cond_0
    return-void
.end method
