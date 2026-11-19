.class public Lcom/zykj/student/dialogue/ui/widget/TouchSwitchMotionLayout;
.super Landroidx/constraintlayout/motion/widget/MotionLayout;
.source "SourceFile"


# instance fields
.field public a:Z


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 0
    .param p1    # Landroid/content/Context;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Landroid/util/AttributeSet;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param

    .line 1
    invoke-direct {p0, p1, p2}, Landroidx/constraintlayout/motion/widget/MotionLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 2
    .line 3
    .line 4
    const/4 p1, 0x0

    .line 5
    iput-boolean p1, p0, Lcom/zykj/student/dialogue/ui/widget/TouchSwitchMotionLayout;->a:Z

    .line 6
    .line 7
    return-void
.end method


# virtual methods
.method public onInterceptTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 0

    .line 1
    iget-boolean p1, p0, Lcom/zykj/student/dialogue/ui/widget/TouchSwitchMotionLayout;->a:Z

    .line 2
    .line 3
    return p1
.end method

.method public setIntercepted(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/zykj/student/dialogue/ui/widget/TouchSwitchMotionLayout;->a:Z

    .line 2
    .line 3
    return-void
.end method
