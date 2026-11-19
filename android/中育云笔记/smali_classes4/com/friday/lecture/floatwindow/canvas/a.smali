.class public final Lcom/friday/lecture/floatwindow/canvas/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/friday/lecture/floatwindow/canvas/a$a;
    }
.end annotation


# static fields
.field public static final d:Lcom/friday/lecture/floatwindow/canvas/a$a;

.field public static final e:I

.field public static final f:Lqc/d;


# instance fields
.field public final a:Landroid/content/Context;

.field public b:Lcom/friday/lecture/floatwindow/canvas/CanvasListLayout;

.field public final c:Lqc/d;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lcom/friday/lecture/floatwindow/canvas/a$a;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Lcom/friday/lecture/floatwindow/canvas/a$a;-><init>(Lkotlin/jvm/internal/n;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lcom/friday/lecture/floatwindow/canvas/a;->d:Lcom/friday/lecture/floatwindow/canvas/a$a;

    .line 8
    .line 9
    const/16 v0, 0x8

    .line 10
    .line 11
    sput v0, Lcom/friday/lecture/floatwindow/canvas/a;->e:I

    .line 12
    .line 13
    sget-object v0, Lkotlin/LazyThreadSafetyMode;->c:Lkotlin/LazyThreadSafetyMode;

    .line 14
    .line 15
    new-instance v1, Le3/o;

    .line 16
    .line 17
    invoke-direct {v1}, Le3/o;-><init>()V

    .line 18
    .line 19
    .line 20
    invoke-static {v0, v1}, Lkotlin/a;->b(Lkotlin/LazyThreadSafetyMode;Lhd/a;)Lqc/d;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    sput-object v0, Lcom/friday/lecture/floatwindow/canvas/a;->f:Lqc/d;

    .line 25
    .line 26
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/friday/lecture/floatwindow/canvas/a;->a:Landroid/content/Context;

    .line 5
    .line 6
    new-instance v0, Lcom/friday/lecture/floatwindow/canvas/CanvasListLayout;

    .line 7
    .line 8
    invoke-direct {v0, p1}, Lcom/friday/lecture/floatwindow/canvas/CanvasListLayout;-><init>(Landroid/content/Context;)V

    .line 9
    .line 10
    .line 11
    iput-object v0, p0, Lcom/friday/lecture/floatwindow/canvas/a;->b:Lcom/friday/lecture/floatwindow/canvas/CanvasListLayout;

    .line 12
    .line 13
    new-instance p1, Le3/p;

    .line 14
    .line 15
    invoke-direct {p1, p0}, Le3/p;-><init>(Lcom/friday/lecture/floatwindow/canvas/a;)V

    .line 16
    .line 17
    .line 18
    invoke-static {p1}, Lkotlin/a;->a(Lhd/a;)Lqc/d;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    iput-object p1, p0, Lcom/friday/lecture/floatwindow/canvas/a;->c:Lqc/d;

    .line 23
    .line 24
    const-string p1, "resetCanvas"

    .line 25
    .line 26
    invoke-static {p1}, Lcom/jeremyliao/liveeventbus/LiveEventBus;->get(Ljava/lang/String;)Lcom/jeremyliao/liveeventbus/core/Observable;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    new-instance v0, Le3/q;

    .line 31
    .line 32
    invoke-direct {v0, p0}, Le3/q;-><init>(Lcom/friday/lecture/floatwindow/canvas/a;)V

    .line 33
    .line 34
    .line 35
    invoke-interface {p1, v0}, Lcom/jeremyliao/liveeventbus/core/Observable;->observeForever(Landroidx/lifecycle/Observer;)V

    .line 36
    .line 37
    .line 38
    return-void
.end method

.method public static synthetic a(Lcom/friday/lecture/floatwindow/canvas/a;Ljava/lang/Object;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/friday/lecture/floatwindow/canvas/a;->e(Lcom/friday/lecture/floatwindow/canvas/a;Ljava/lang/Object;)V

    return-void
.end method

.method public static synthetic b(Lcom/friday/lecture/floatwindow/canvas/a;)Landroid/view/WindowManager;
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/friday/lecture/floatwindow/canvas/a;->j(Lcom/friday/lecture/floatwindow/canvas/a;)Landroid/view/WindowManager;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c()Lcom/friday/lecture/floatwindow/canvas/a;
    .locals 1

    .line 1
    invoke-static {}, Lcom/friday/lecture/floatwindow/canvas/a;->d()Lcom/friday/lecture/floatwindow/canvas/a;

    move-result-object v0

    return-object v0
.end method

.method public static final d()Lcom/friday/lecture/floatwindow/canvas/a;
    .locals 3

    .line 1
    new-instance v0, Lcom/friday/lecture/floatwindow/canvas/a;

    .line 2
    .line 3
    invoke-static {}, Lcom/blankj/utilcode/util/Utils;->getApp()Landroid/app/Application;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    const-string v2, "getApp(...)"

    .line 8
    .line 9
    invoke-static {v1, v2}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    invoke-direct {v0, v1}, Lcom/friday/lecture/floatwindow/canvas/a;-><init>(Landroid/content/Context;)V

    .line 13
    .line 14
    .line 15
    return-object v0
.end method

.method public static final e(Lcom/friday/lecture/floatwindow/canvas/a;Ljava/lang/Object;)V
    .locals 1

    .line 1
    new-instance p1, Lcom/friday/lecture/floatwindow/canvas/CanvasListLayout;

    .line 2
    .line 3
    iget-object v0, p0, Lcom/friday/lecture/floatwindow/canvas/a;->a:Landroid/content/Context;

    .line 4
    .line 5
    invoke-direct {p1, v0}, Lcom/friday/lecture/floatwindow/canvas/CanvasListLayout;-><init>(Landroid/content/Context;)V

    .line 6
    .line 7
    .line 8
    iput-object p1, p0, Lcom/friday/lecture/floatwindow/canvas/a;->b:Lcom/friday/lecture/floatwindow/canvas/CanvasListLayout;

    .line 9
    .line 10
    return-void
.end method

.method public static final synthetic f()Lqc/d;
    .locals 1

    .line 1
    sget-object v0, Lcom/friday/lecture/floatwindow/canvas/a;->f:Lqc/d;

    .line 2
    .line 3
    return-object v0
.end method

.method public static final j(Lcom/friday/lecture/floatwindow/canvas/a;)Landroid/view/WindowManager;
    .locals 1

    .line 1
    iget-object p0, p0, Lcom/friday/lecture/floatwindow/canvas/a;->a:Landroid/content/Context;

    .line 2
    .line 3
    const-string v0, "window"

    .line 4
    .line 5
    invoke-virtual {p0, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    const-string v0, "null cannot be cast to non-null type android.view.WindowManager"

    .line 10
    .line 11
    invoke-static {p0, v0}, Lkotlin/jvm/internal/u;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    check-cast p0, Landroid/view/WindowManager;

    .line 15
    .line 16
    return-object p0
.end method


# virtual methods
.method public final g()Landroid/view/WindowManager;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/friday/lecture/floatwindow/canvas/a;->c:Lqc/d;

    .line 2
    .line 3
    invoke-interface {v0}, Lqc/d;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Landroid/view/WindowManager;

    .line 8
    .line 9
    return-object v0
.end method

.method public final h()V
    .locals 2

    .line 1
    :try_start_0
    invoke-virtual {p0}, Lcom/friday/lecture/floatwindow/canvas/a;->g()Landroid/view/WindowManager;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v1, p0, Lcom/friday/lecture/floatwindow/canvas/a;->b:Lcom/friday/lecture/floatwindow/canvas/CanvasListLayout;

    .line 6
    .line 7
    invoke-interface {v0, v1}, Landroid/view/WindowManager;->removeViewImmediate(Landroid/view/View;)V
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    .line 8
    .line 9
    .line 10
    :catch_0
    return-void
.end method

.method public final i()V
    .locals 3

    .line 1
    new-instance v0, Landroid/view/WindowManager$LayoutParams;

    .line 2
    .line 3
    invoke-direct {v0}, Landroid/view/WindowManager$LayoutParams;-><init>()V

    .line 4
    .line 5
    .line 6
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 7
    .line 8
    const/16 v2, 0x1a

    .line 9
    .line 10
    if-lt v1, v2, :cond_0

    .line 11
    .line 12
    const/16 v1, 0x7f6

    .line 13
    .line 14
    iput v1, v0, Landroid/view/WindowManager$LayoutParams;->type:I

    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_0
    const/16 v1, 0x7d2

    .line 18
    .line 19
    iput v1, v0, Landroid/view/WindowManager$LayoutParams;->type:I

    .line 20
    .line 21
    :goto_0
    const/16 v1, 0x11

    .line 22
    .line 23
    iput v1, v0, Landroid/view/WindowManager$LayoutParams;->gravity:I

    .line 24
    .line 25
    const/4 v1, -0x1

    .line 26
    iput v1, v0, Landroid/view/WindowManager$LayoutParams;->width:I

    .line 27
    .line 28
    iput v1, v0, Landroid/view/WindowManager$LayoutParams;->height:I

    .line 29
    .line 30
    const/4 v1, 0x1

    .line 31
    iput v1, v0, Landroid/view/WindowManager$LayoutParams;->format:I

    .line 32
    .line 33
    invoke-virtual {p0}, Lcom/friday/lecture/floatwindow/canvas/a;->g()Landroid/view/WindowManager;

    .line 34
    .line 35
    .line 36
    move-result-object v1

    .line 37
    iget-object v2, p0, Lcom/friday/lecture/floatwindow/canvas/a;->b:Lcom/friday/lecture/floatwindow/canvas/CanvasListLayout;

    .line 38
    .line 39
    invoke-interface {v1, v2, v0}, Landroid/view/ViewManager;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 40
    .line 41
    .line 42
    return-void
.end method
