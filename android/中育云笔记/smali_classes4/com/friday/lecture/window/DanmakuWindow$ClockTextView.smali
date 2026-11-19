.class public final Lcom/friday/lecture/window/DanmakuWindow$ClockTextView;
.super Landroidx/appcompat/widget/AppCompatTextView;
.source "SourceFile"


# annotations
.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x0
.end annotation

.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/friday/lecture/window/DanmakuWindow;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "ClockTextView"
.end annotation


# instance fields
.field public final d:Lqc/d;


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
    invoke-direct {p0, p1}, Landroidx/appcompat/widget/AppCompatTextView;-><init>(Landroid/content/Context;)V

    .line 7
    .line 8
    .line 9
    new-instance p1, Lo3/a;

    .line 10
    .line 11
    invoke-direct {p1, p0}, Lo3/a;-><init>(Lcom/friday/lecture/window/DanmakuWindow$ClockTextView;)V

    .line 12
    .line 13
    .line 14
    invoke-static {p1}, Lkotlin/a;->a(Lhd/a;)Lqc/d;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    iput-object p1, p0, Lcom/friday/lecture/window/DanmakuWindow$ClockTextView;->d:Lqc/d;

    .line 19
    .line 20
    return-void
.end method

.method public static synthetic c(Lcom/friday/lecture/window/DanmakuWindow$ClockTextView;)Lcom/friday/lecture/window/DanmakuWindow$ClockTextView$a;
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/friday/lecture/window/DanmakuWindow$ClockTextView;->e(Lcom/friday/lecture/window/DanmakuWindow$ClockTextView;)Lcom/friday/lecture/window/DanmakuWindow$ClockTextView$a;

    move-result-object p0

    return-object p0
.end method

.method public static final e(Lcom/friday/lecture/window/DanmakuWindow$ClockTextView;)Lcom/friday/lecture/window/DanmakuWindow$ClockTextView$a;
    .locals 1

    .line 1
    new-instance v0, Lcom/friday/lecture/window/DanmakuWindow$ClockTextView$a;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Lcom/friday/lecture/window/DanmakuWindow$ClockTextView$a;-><init>(Lcom/friday/lecture/window/DanmakuWindow$ClockTextView;)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method

.method private final getLis()Lcom/friday/lecture/window/DanmakuWindow$ClockTextView$a;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/friday/lecture/window/DanmakuWindow$ClockTextView;->d:Lqc/d;

    .line 2
    .line 3
    invoke-interface {v0}, Lqc/d;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lcom/friday/lecture/window/DanmakuWindow$ClockTextView$a;

    .line 8
    .line 9
    return-object v0
.end method


# virtual methods
.method public final d()V
    .locals 1

    .line 1
    invoke-direct {p0}, Lcom/friday/lecture/window/DanmakuWindow$ClockTextView;->getLis()Lcom/friday/lecture/window/DanmakuWindow$ClockTextView$a;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Landroid/os/CountDownTimer;->start()Landroid/os/CountDownTimer;

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public final f()V
    .locals 1

    .line 1
    invoke-direct {p0}, Lcom/friday/lecture/window/DanmakuWindow$ClockTextView;->getLis()Lcom/friday/lecture/window/DanmakuWindow$ClockTextView$a;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Landroid/os/CountDownTimer;->cancel()V

    .line 6
    .line 7
    .line 8
    return-void
.end method
