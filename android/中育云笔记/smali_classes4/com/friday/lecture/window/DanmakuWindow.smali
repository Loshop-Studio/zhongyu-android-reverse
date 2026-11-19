.class public final Lcom/friday/lecture/window/DanmakuWindow;
.super Landroid/widget/FrameLayout;
.source "SourceFile"


# annotations
.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x0
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/friday/lecture/window/DanmakuWindow$ClockTextView;
    }
.end annotation


# instance fields
.field public c:Landroid/os/Handler;

.field public d:Lcom/friday/lecture/databinding/WindowDanmakuBinding;

.field public e:Landroidx/core/util/Pools$SimplePool;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 1
    const-string v0, "context"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0, p1}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;)V

    .line 7
    .line 8
    .line 9
    invoke-virtual {p0}, Lcom/friday/lecture/window/DanmakuWindow;->c()V

    .line 10
    .line 11
    .line 12
    new-instance p1, Landroidx/core/util/Pools$SimplePool;

    .line 13
    .line 14
    const/4 v0, 0x5

    .line 15
    invoke-direct {p1, v0}, Landroidx/core/util/Pools$SimplePool;-><init>(I)V

    .line 16
    .line 17
    .line 18
    iput-object p1, p0, Lcom/friday/lecture/window/DanmakuWindow;->e:Landroidx/core/util/Pools$SimplePool;

    .line 19
    .line 20
    return-void
.end method

.method public static final synthetic a(Lcom/friday/lecture/window/DanmakuWindow;)Lcom/friday/lecture/databinding/WindowDanmakuBinding;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/friday/lecture/window/DanmakuWindow;->d:Lcom/friday/lecture/databinding/WindowDanmakuBinding;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic b(Lcom/friday/lecture/window/DanmakuWindow;)Lcom/friday/lecture/window/DanmakuWindow$ClockTextView;
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/friday/lecture/window/DanmakuWindow;->d()Lcom/friday/lecture/window/DanmakuWindow$ClockTextView;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method


# virtual methods
.method public final c()V
    .locals 3

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    sget v1, Lcom/friday/lecture/R$layout;->window_danmaku:I

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    invoke-static {v0, v1, v2}, Landroid/view/View;->inflate(Landroid/content/Context;ILandroid/view/ViewGroup;)Landroid/view/View;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    invoke-virtual {p0, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 13
    .line 14
    .line 15
    invoke-static {v0}, Landroidx/databinding/DataBindingUtil;->bind(Landroid/view/View;)Landroidx/databinding/ViewDataBinding;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 20
    .line 21
    .line 22
    check-cast v0, Lcom/friday/lecture/databinding/WindowDanmakuBinding;

    .line 23
    .line 24
    iput-object v0, p0, Lcom/friday/lecture/window/DanmakuWindow;->d:Lcom/friday/lecture/databinding/WindowDanmakuBinding;

    .line 25
    .line 26
    if-nez v0, :cond_0

    .line 27
    .line 28
    const-string v0, "dataBinding"

    .line 29
    .line 30
    invoke-static {v0}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 31
    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_0
    move-object v2, v0

    .line 35
    :goto_0
    iget-object v0, v2, Lcom/friday/lecture/databinding/WindowDanmakuBinding;->c:Landroid/widget/LinearLayout;

    .line 36
    .line 37
    const/16 v1, 0x8

    .line 38
    .line 39
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 40
    .line 41
    .line 42
    new-instance v0, Lcom/friday/lecture/window/DanmakuWindow$a;

    .line 43
    .line 44
    invoke-direct {v0, p0}, Lcom/friday/lecture/window/DanmakuWindow$a;-><init>(Lcom/friday/lecture/window/DanmakuWindow;)V

    .line 45
    .line 46
    .line 47
    iput-object v0, p0, Lcom/friday/lecture/window/DanmakuWindow;->c:Landroid/os/Handler;

    .line 48
    .line 49
    return-void
.end method

.method public final d()Lcom/friday/lecture/window/DanmakuWindow$ClockTextView;
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/friday/lecture/window/DanmakuWindow;->e:Landroidx/core/util/Pools$SimplePool;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroidx/core/util/Pools$SimplePool;->acquire()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lcom/friday/lecture/window/DanmakuWindow$ClockTextView;

    .line 8
    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    new-instance v0, Lcom/friday/lecture/window/DanmakuWindow$ClockTextView;

    .line 12
    .line 13
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    const-string v2, "getContext(...)"

    .line 18
    .line 19
    invoke-static {v1, v2}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    invoke-direct {v0, v1}, Lcom/friday/lecture/window/DanmakuWindow$ClockTextView;-><init>(Landroid/content/Context;)V

    .line 23
    .line 24
    .line 25
    new-instance v1, Landroid/widget/LinearLayout$LayoutParams;

    .line 26
    .line 27
    const/4 v2, -0x1

    .line 28
    const/4 v3, -0x2

    .line 29
    invoke-direct {v1, v2, v3}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 30
    .line 31
    .line 32
    invoke-virtual {v0, v1}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 33
    .line 34
    .line 35
    const/high16 v1, -0x1000000

    .line 36
    .line 37
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 38
    .line 39
    .line 40
    const/high16 v1, 0x41400000    # 12.0f

    .line 41
    .line 42
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextSize(F)V

    .line 43
    .line 44
    .line 45
    :cond_0
    const/16 v1, 0x11

    .line 46
    .line 47
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setGravity(I)V

    .line 48
    .line 49
    .line 50
    invoke-virtual {v0}, Lcom/friday/lecture/window/DanmakuWindow$ClockTextView;->d()V

    .line 51
    .line 52
    .line 53
    return-object v0
.end method
