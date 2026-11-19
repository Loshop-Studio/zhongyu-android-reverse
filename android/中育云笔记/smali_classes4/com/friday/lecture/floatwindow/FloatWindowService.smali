.class public final Lcom/friday/lecture/floatwindow/FloatWindowService;
.super Lcom/friday/common/service/BaseLifecycleService;
.source "SourceFile"


# annotations
.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x0
.end annotation


# static fields
.field public static final d:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    sget v0, Lcom/friday/common/service/BaseLifecycleService;->c:I

    sput v0, Lcom/friday/lecture/floatwindow/FloatWindowService;->d:I

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/friday/common/service/BaseLifecycleService;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic b(Lcom/friday/lecture/floatwindow/FloatWindowStatus;)V
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/friday/lecture/floatwindow/FloatWindowService;->e(Lcom/friday/lecture/floatwindow/FloatWindowStatus;)V

    return-void
.end method

.method public static synthetic c(Landroid/graphics/Bitmap;)V
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/friday/lecture/floatwindow/FloatWindowService;->f(Landroid/graphics/Bitmap;)V

    return-void
.end method

.method public static synthetic d(Lcom/friday/lecture/floatwindow/FloatWindowService;Ljava/lang/Object;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/friday/lecture/floatwindow/FloatWindowService;->g(Lcom/friday/lecture/floatwindow/FloatWindowService;Ljava/lang/Object;)V

    return-void
.end method

.method public static final e(Lcom/friday/lecture/floatwindow/FloatWindowStatus;)V
    .locals 1

    .line 1
    sget-object v0, Lcom/friday/lecture/floatwindow/options/a;->g:Lcom/friday/lecture/floatwindow/options/a$a;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/friday/lecture/floatwindow/options/a$a;->a()Lcom/friday/lecture/floatwindow/options/a;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-static {p0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 8
    .line 9
    .line 10
    invoke-virtual {v0, p0}, Lcom/friday/lecture/floatwindow/options/a;->m(Lcom/friday/lecture/floatwindow/FloatWindowStatus;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public static final f(Landroid/graphics/Bitmap;)V
    .locals 1

    .line 1
    sget-object v0, Lcom/friday/lecture/floatwindow/homework/b;->d:Lcom/friday/lecture/floatwindow/homework/b$a;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/friday/lecture/floatwindow/homework/b$a;->a()Lcom/friday/lecture/floatwindow/homework/b;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0, p0}, Lcom/friday/lecture/floatwindow/homework/b;->f(Landroid/graphics/Bitmap;)V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public static final g(Lcom/friday/lecture/floatwindow/FloatWindowService;Ljava/lang/Object;)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Landroid/app/Service;->stopSelf()V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public onCreate()V
    .locals 2

    .line 1
    invoke-super {p0}, Lcom/friday/common/service/BaseLifecycleService;->onCreate()V

    .line 2
    .line 3
    .line 4
    sget-object v0, Ld3/a;->a:Ld3/a;

    .line 5
    .line 6
    invoke-virtual {v0}, Ld3/a;->b()V

    .line 7
    .line 8
    .line 9
    sget-object v0, Lcom/friday/lecture/floatwindow/options/a;->g:Lcom/friday/lecture/floatwindow/options/a$a;

    .line 10
    .line 11
    invoke-virtual {v0}, Lcom/friday/lecture/floatwindow/options/a$a;->a()Lcom/friday/lecture/floatwindow/options/a;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    const/4 v1, 0x1

    .line 16
    invoke-virtual {v0, v1}, Lcom/friday/lecture/floatwindow/options/a;->p(Z)V

    .line 17
    .line 18
    .line 19
    const-string v0, "key_current_class_state"

    .line 20
    .line 21
    const-class v1, Lcom/friday/lecture/floatwindow/FloatWindowStatus;

    .line 22
    .line 23
    invoke-static {v0, v1}, Lcom/jeremyliao/liveeventbus/LiveEventBus;->get(Ljava/lang/String;Ljava/lang/Class;)Lcom/jeremyliao/liveeventbus/core/Observable;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    new-instance v1, Ld3/b;

    .line 28
    .line 29
    invoke-direct {v1}, Ld3/b;-><init>()V

    .line 30
    .line 31
    .line 32
    invoke-interface {v0, p0, v1}, Lcom/jeremyliao/liveeventbus/core/Observable;->observe(Landroidx/lifecycle/LifecycleOwner;Landroidx/lifecycle/Observer;)V

    .line 33
    .line 34
    .line 35
    const-string v0, "key_class_bitmap"

    .line 36
    .line 37
    const-class v1, Landroid/graphics/Bitmap;

    .line 38
    .line 39
    invoke-static {v0, v1}, Lcom/jeremyliao/liveeventbus/LiveEventBus;->get(Ljava/lang/String;Ljava/lang/Class;)Lcom/jeremyliao/liveeventbus/core/Observable;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    new-instance v1, Ld3/c;

    .line 44
    .line 45
    invoke-direct {v1}, Ld3/c;-><init>()V

    .line 46
    .line 47
    .line 48
    invoke-interface {v0, p0, v1}, Lcom/jeremyliao/liveeventbus/core/Observable;->observe(Landroidx/lifecycle/LifecycleOwner;Landroidx/lifecycle/Observer;)V

    .line 49
    .line 50
    .line 51
    const-string v0, "killClassService"

    .line 52
    .line 53
    invoke-static {v0}, Lcom/jeremyliao/liveeventbus/LiveEventBus;->get(Ljava/lang/String;)Lcom/jeremyliao/liveeventbus/core/Observable;

    .line 54
    .line 55
    .line 56
    move-result-object v0

    .line 57
    new-instance v1, Ld3/d;

    .line 58
    .line 59
    invoke-direct {v1, p0}, Ld3/d;-><init>(Lcom/friday/lecture/floatwindow/FloatWindowService;)V

    .line 60
    .line 61
    .line 62
    invoke-interface {v0, p0, v1}, Lcom/jeremyliao/liveeventbus/core/Observable;->observe(Landroidx/lifecycle/LifecycleOwner;Landroidx/lifecycle/Observer;)V

    .line 63
    .line 64
    .line 65
    return-void
.end method

.method public onDestroy()V
    .locals 1

    .line 1
    sget-object v0, Ld3/a;->a:Ld3/a;

    .line 2
    .line 3
    invoke-virtual {v0}, Ld3/a;->b()V

    .line 4
    .line 5
    .line 6
    invoke-super {p0}, Lcom/friday/common/service/BaseLifecycleService;->onDestroy()V

    .line 7
    .line 8
    .line 9
    return-void
.end method
