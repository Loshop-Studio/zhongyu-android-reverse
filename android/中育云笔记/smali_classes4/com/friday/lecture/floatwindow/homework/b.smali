.class public final Lcom/friday/lecture/floatwindow/homework/b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/friday/lecture/floatwindow/homework/b$a;
    }
.end annotation


# static fields
.field public static final d:Lcom/friday/lecture/floatwindow/homework/b$a;

.field public static final e:I

.field public static final f:Lqc/d;


# instance fields
.field public final a:Landroid/content/Context;

.field public final b:Lqc/d;

.field public c:Lcom/friday/lecture/floatwindow/homework/HomeworkLayout;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lcom/friday/lecture/floatwindow/homework/b$a;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Lcom/friday/lecture/floatwindow/homework/b$a;-><init>(Lkotlin/jvm/internal/n;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lcom/friday/lecture/floatwindow/homework/b;->d:Lcom/friday/lecture/floatwindow/homework/b$a;

    .line 8
    .line 9
    const/16 v0, 0x8

    .line 10
    .line 11
    sput v0, Lcom/friday/lecture/floatwindow/homework/b;->e:I

    .line 12
    .line 13
    sget-object v0, Lkotlin/LazyThreadSafetyMode;->c:Lkotlin/LazyThreadSafetyMode;

    .line 14
    .line 15
    new-instance v1, Lf3/p;

    .line 16
    .line 17
    invoke-direct {v1}, Lf3/p;-><init>()V

    .line 18
    .line 19
    .line 20
    invoke-static {v0, v1}, Lkotlin/a;->b(Lkotlin/LazyThreadSafetyMode;Lhd/a;)Lqc/d;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    sput-object v0, Lcom/friday/lecture/floatwindow/homework/b;->f:Lqc/d;

    .line 25
    .line 26
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/friday/lecture/floatwindow/homework/b;->a:Landroid/content/Context;

    .line 5
    .line 6
    new-instance p1, Lf3/q;

    .line 7
    .line 8
    invoke-direct {p1, p0}, Lf3/q;-><init>(Lcom/friday/lecture/floatwindow/homework/b;)V

    .line 9
    .line 10
    .line 11
    invoke-static {p1}, Lkotlin/a;->a(Lhd/a;)Lqc/d;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    iput-object p1, p0, Lcom/friday/lecture/floatwindow/homework/b;->b:Lqc/d;

    .line 16
    .line 17
    return-void
.end method

.method public static synthetic a()Lcom/friday/lecture/floatwindow/homework/b;
    .locals 1

    .line 1
    invoke-static {}, Lcom/friday/lecture/floatwindow/homework/b;->c()Lcom/friday/lecture/floatwindow/homework/b;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic b(Lcom/friday/lecture/floatwindow/homework/b;)Landroid/view/WindowManager;
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/friday/lecture/floatwindow/homework/b;->j(Lcom/friday/lecture/floatwindow/homework/b;)Landroid/view/WindowManager;

    move-result-object p0

    return-object p0
.end method

.method public static final c()Lcom/friday/lecture/floatwindow/homework/b;
    .locals 3

    .line 1
    new-instance v0, Lcom/friday/lecture/floatwindow/homework/b;

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
    invoke-direct {v0, v1}, Lcom/friday/lecture/floatwindow/homework/b;-><init>(Landroid/content/Context;)V

    .line 13
    .line 14
    .line 15
    return-object v0
.end method

.method public static final synthetic d()Lqc/d;
    .locals 1

    .line 1
    sget-object v0, Lcom/friday/lecture/floatwindow/homework/b;->f:Lqc/d;

    .line 2
    .line 3
    return-object v0
.end method

.method public static final j(Lcom/friday/lecture/floatwindow/homework/b;)Landroid/view/WindowManager;
    .locals 1

    .line 1
    iget-object p0, p0, Lcom/friday/lecture/floatwindow/homework/b;->a:Landroid/content/Context;

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
.method public final e()Landroid/view/WindowManager;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/friday/lecture/floatwindow/homework/b;->b:Lqc/d;

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

.method public final f(Landroid/graphics/Bitmap;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/friday/lecture/floatwindow/homework/b;->c:Lcom/friday/lecture/floatwindow/homework/HomeworkLayout;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0, p1}, Lcom/friday/lecture/floatwindow/homework/HomeworkLayout;->y(Landroid/graphics/Bitmap;)V

    .line 6
    .line 7
    .line 8
    :cond_0
    return-void
.end method

.method public final g()V
    .locals 2

    .line 1
    :try_start_0
    invoke-virtual {p0}, Lcom/friday/lecture/floatwindow/homework/b;->e()Landroid/view/WindowManager;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    iget-object v1, p0, Lcom/friday/lecture/floatwindow/homework/b;->c:Lcom/friday/lecture/floatwindow/homework/HomeworkLayout;

    .line 8
    .line 9
    invoke-interface {v0, v1}, Landroid/view/WindowManager;->removeViewImmediate(Landroid/view/View;)V
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    .line 10
    .line 11
    .line 12
    :catch_0
    :cond_0
    return-void
.end method

.method public final h()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/friday/lecture/floatwindow/homework/b;->c:Lcom/friday/lecture/floatwindow/homework/HomeworkLayout;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Lcom/friday/lecture/floatwindow/homework/HomeworkLayout;

    .line 6
    .line 7
    iget-object v1, p0, Lcom/friday/lecture/floatwindow/homework/b;->a:Landroid/content/Context;

    .line 8
    .line 9
    invoke-direct {v0, v1}, Lcom/friday/lecture/floatwindow/homework/HomeworkLayout;-><init>(Landroid/content/Context;)V

    .line 10
    .line 11
    .line 12
    iput-object v0, p0, Lcom/friday/lecture/floatwindow/homework/b;->c:Lcom/friday/lecture/floatwindow/homework/HomeworkLayout;

    .line 13
    .line 14
    :cond_0
    return-void
.end method

.method public final i()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/friday/lecture/floatwindow/homework/b;->c:Lcom/friday/lecture/floatwindow/homework/HomeworkLayout;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Lcom/friday/lecture/floatwindow/homework/HomeworkLayout;

    .line 6
    .line 7
    iget-object v1, p0, Lcom/friday/lecture/floatwindow/homework/b;->a:Landroid/content/Context;

    .line 8
    .line 9
    invoke-direct {v0, v1}, Lcom/friday/lecture/floatwindow/homework/HomeworkLayout;-><init>(Landroid/content/Context;)V

    .line 10
    .line 11
    .line 12
    iput-object v0, p0, Lcom/friday/lecture/floatwindow/homework/b;->c:Lcom/friday/lecture/floatwindow/homework/HomeworkLayout;

    .line 13
    .line 14
    :cond_0
    new-instance v0, Landroid/view/WindowManager$LayoutParams;

    .line 15
    .line 16
    invoke-direct {v0}, Landroid/view/WindowManager$LayoutParams;-><init>()V

    .line 17
    .line 18
    .line 19
    const/4 v1, 0x0

    .line 20
    iput v1, v0, Landroid/view/WindowManager$LayoutParams;->screenOrientation:I

    .line 21
    .line 22
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 23
    .line 24
    const/16 v2, 0x1a

    .line 25
    .line 26
    if-lt v1, v2, :cond_1

    .line 27
    .line 28
    const/16 v1, 0x7f6

    .line 29
    .line 30
    iput v1, v0, Landroid/view/WindowManager$LayoutParams;->type:I

    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_1
    const/16 v1, 0x7d2

    .line 34
    .line 35
    iput v1, v0, Landroid/view/WindowManager$LayoutParams;->type:I

    .line 36
    .line 37
    :goto_0
    const/16 v1, 0x11

    .line 38
    .line 39
    iput v1, v0, Landroid/view/WindowManager$LayoutParams;->gravity:I

    .line 40
    .line 41
    const/4 v1, -0x1

    .line 42
    iput v1, v0, Landroid/view/WindowManager$LayoutParams;->width:I

    .line 43
    .line 44
    iput v1, v0, Landroid/view/WindowManager$LayoutParams;->height:I

    .line 45
    .line 46
    const/4 v1, 0x1

    .line 47
    iput v1, v0, Landroid/view/WindowManager$LayoutParams;->format:I

    .line 48
    .line 49
    invoke-virtual {p0}, Lcom/friday/lecture/floatwindow/homework/b;->e()Landroid/view/WindowManager;

    .line 50
    .line 51
    .line 52
    move-result-object v1

    .line 53
    if-eqz v1, :cond_2

    .line 54
    .line 55
    iget-object v2, p0, Lcom/friday/lecture/floatwindow/homework/b;->c:Lcom/friday/lecture/floatwindow/homework/HomeworkLayout;

    .line 56
    .line 57
    invoke-interface {v1, v2, v0}, Landroid/view/ViewManager;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 58
    .line 59
    .line 60
    :cond_2
    return-void
.end method
