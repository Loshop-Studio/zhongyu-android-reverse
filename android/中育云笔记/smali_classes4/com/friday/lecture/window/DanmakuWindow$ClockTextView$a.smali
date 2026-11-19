.class public final Lcom/friday/lecture/window/DanmakuWindow$ClockTextView$a;
.super Landroid/os/CountDownTimer;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/friday/lecture/window/DanmakuWindow$ClockTextView;-><init>(Landroid/content/Context;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lcom/friday/lecture/window/DanmakuWindow$ClockTextView;


# direct methods
.method public constructor <init>(Lcom/friday/lecture/window/DanmakuWindow$ClockTextView;)V
    .locals 4

    .line 1
    iput-object p1, p0, Lcom/friday/lecture/window/DanmakuWindow$ClockTextView$a;->a:Lcom/friday/lecture/window/DanmakuWindow$ClockTextView;

    .line 2
    .line 3
    const-wide/16 v0, 0x1388

    .line 4
    .line 5
    const-wide/16 v2, 0x3e8

    .line 6
    .line 7
    invoke-direct {p0, v0, v1, v2, v3}, Landroid/os/CountDownTimer;-><init>(JJ)V

    .line 8
    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public onFinish()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/friday/lecture/window/DanmakuWindow$ClockTextView$a;->a:Lcom/friday/lecture/window/DanmakuWindow$ClockTextView;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    const-string v1, "null cannot be cast to non-null type android.view.ViewGroup"

    .line 8
    .line 9
    invoke-static {v0, v1}, Lkotlin/jvm/internal/u;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    check-cast v0, Landroid/view/ViewGroup;

    .line 13
    .line 14
    iget-object v1, p0, Lcom/friday/lecture/window/DanmakuWindow$ClockTextView$a;->a:Lcom/friday/lecture/window/DanmakuWindow$ClockTextView;

    .line 15
    .line 16
    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    .line 17
    .line 18
    .line 19
    invoke-virtual {v0}, Landroid/view/ViewGroup;->getChildCount()I

    .line 20
    .line 21
    .line 22
    move-result v1

    .line 23
    if-nez v1, :cond_0

    .line 24
    .line 25
    const/16 v1, 0x8

    .line 26
    .line 27
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 28
    .line 29
    .line 30
    :cond_0
    return-void
.end method

.method public onTick(J)V
    .locals 0

    return-void
.end method
