.class public final Lcom/friday/lecture/floatwindow/options/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/friday/lecture/floatwindow/options/a$a;
    }
.end annotation


# static fields
.field public static final g:Lcom/friday/lecture/floatwindow/options/a$a;

.field public static final h:I

.field public static final i:Lqc/d;


# instance fields
.field public final a:Landroid/content/Context;

.field public b:Lcom/friday/lecture/floatwindow/options/OptionLayout;

.field public c:Landroid/view/WindowManager$LayoutParams;

.field public d:I

.field public e:I

.field public final f:Landroid/view/WindowManager;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lcom/friday/lecture/floatwindow/options/a$a;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Lcom/friday/lecture/floatwindow/options/a$a;-><init>(Lkotlin/jvm/internal/n;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lcom/friday/lecture/floatwindow/options/a;->g:Lcom/friday/lecture/floatwindow/options/a$a;

    .line 8
    .line 9
    const/16 v0, 0x8

    .line 10
    .line 11
    sput v0, Lcom/friday/lecture/floatwindow/options/a;->h:I

    .line 12
    .line 13
    sget-object v0, Lkotlin/LazyThreadSafetyMode;->c:Lkotlin/LazyThreadSafetyMode;

    .line 14
    .line 15
    new-instance v1, Lg3/g;

    .line 16
    .line 17
    invoke-direct {v1}, Lg3/g;-><init>()V

    .line 18
    .line 19
    .line 20
    invoke-static {v0, v1}, Lkotlin/a;->b(Lkotlin/LazyThreadSafetyMode;Lhd/a;)Lqc/d;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    sput-object v0, Lcom/friday/lecture/floatwindow/options/a;->i:Lqc/d;

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
    iput-object p1, p0, Lcom/friday/lecture/floatwindow/options/a;->a:Landroid/content/Context;

    .line 5
    .line 6
    const-string v0, "window"

    .line 7
    .line 8
    invoke-virtual {p1, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    const-string v0, "null cannot be cast to non-null type android.view.WindowManager"

    .line 13
    .line 14
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    check-cast p1, Landroid/view/WindowManager;

    .line 18
    .line 19
    iput-object p1, p0, Lcom/friday/lecture/floatwindow/options/a;->f:Landroid/view/WindowManager;

    .line 20
    .line 21
    return-void
.end method

.method public static synthetic a()Lcom/friday/lecture/floatwindow/options/a;
    .locals 1

    .line 1
    invoke-static {}, Lcom/friday/lecture/floatwindow/options/a;->b()Lcom/friday/lecture/floatwindow/options/a;

    move-result-object v0

    return-object v0
.end method

.method public static final b()Lcom/friday/lecture/floatwindow/options/a;
    .locals 3

    .line 1
    new-instance v0, Lcom/friday/lecture/floatwindow/options/a;

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
    invoke-direct {v0, v1}, Lcom/friday/lecture/floatwindow/options/a;-><init>(Landroid/content/Context;)V

    .line 13
    .line 14
    .line 15
    return-object v0
.end method

.method public static final synthetic c()Lqc/d;
    .locals 1

    .line 1
    sget-object v0, Lcom/friday/lecture/floatwindow/options/a;->i:Lqc/d;

    .line 2
    .line 3
    return-object v0
.end method

.method public static final synthetic d(Lcom/friday/lecture/floatwindow/options/a;)Landroid/view/WindowManager$LayoutParams;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/friday/lecture/floatwindow/options/a;->c:Landroid/view/WindowManager$LayoutParams;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic e(Lcom/friday/lecture/floatwindow/options/a;)Landroid/view/WindowManager;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/friday/lecture/floatwindow/options/a;->f:Landroid/view/WindowManager;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic f(Lcom/friday/lecture/floatwindow/options/a;I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/friday/lecture/floatwindow/options/a;->d:I

    .line 2
    .line 3
    return-void
.end method

.method public static final synthetic g(Lcom/friday/lecture/floatwindow/options/a;I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/friday/lecture/floatwindow/options/a;->e:I

    .line 2
    .line 3
    return-void
.end method

.method public static synthetic q(Lcom/friday/lecture/floatwindow/options/a;ZILjava/lang/Object;)V
    .locals 0

    .line 1
    and-int/lit8 p2, p2, 0x1

    .line 2
    .line 3
    if-eqz p2, :cond_0

    .line 4
    .line 5
    const/4 p1, 0x0

    .line 6
    :cond_0
    invoke-virtual {p0, p1}, Lcom/friday/lecture/floatwindow/options/a;->p(Z)V

    .line 7
    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public final h()Lcom/friday/lecture/floatwindow/options/OptionLayout;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/friday/lecture/floatwindow/options/a;->b:Lcom/friday/lecture/floatwindow/options/OptionLayout;

    .line 2
    .line 3
    return-object v0
.end method

.method public final i()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/friday/lecture/floatwindow/options/a;->b:Lcom/friday/lecture/floatwindow/options/OptionLayout;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Lcom/friday/lecture/floatwindow/options/OptionLayout;

    .line 6
    .line 7
    iget-object v1, p0, Lcom/friday/lecture/floatwindow/options/a;->a:Landroid/content/Context;

    .line 8
    .line 9
    invoke-direct {v0, v1}, Lcom/friday/lecture/floatwindow/options/OptionLayout;-><init>(Landroid/content/Context;)V

    .line 10
    .line 11
    .line 12
    iput-object v0, p0, Lcom/friday/lecture/floatwindow/options/a;->b:Lcom/friday/lecture/floatwindow/options/OptionLayout;

    .line 13
    .line 14
    :cond_0
    return-void
.end method

.method public final j()V
    .locals 2

    .line 1
    :try_start_0
    iget-object v0, p0, Lcom/friday/lecture/floatwindow/options/a;->f:Landroid/view/WindowManager;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/friday/lecture/floatwindow/options/a;->b:Lcom/friday/lecture/floatwindow/options/OptionLayout;

    .line 4
    .line 5
    invoke-interface {v0, v1}, Landroid/view/WindowManager;->removeViewImmediate(Landroid/view/View;)V
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    .line 6
    .line 7
    .line 8
    :catch_0
    return-void
.end method

.method public final k()V
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/friday/lecture/floatwindow/options/a;->i()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/friday/lecture/floatwindow/options/a;->b:Lcom/friday/lecture/floatwindow/options/OptionLayout;

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    invoke-virtual {v0}, Lcom/friday/lecture/floatwindow/options/OptionLayout;->q()V

    .line 9
    .line 10
    .line 11
    :cond_0
    return-void
.end method

.method public final l(Z)V
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/friday/lecture/floatwindow/options/a;->i()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/friday/lecture/floatwindow/options/a;->b:Lcom/friday/lecture/floatwindow/options/OptionLayout;

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    invoke-virtual {v0, p1}, Lcom/friday/lecture/floatwindow/options/OptionLayout;->setAirPlayState(Z)V

    .line 9
    .line 10
    .line 11
    :cond_0
    return-void
.end method

.method public final m(Lcom/friday/lecture/floatwindow/FloatWindowStatus;)V
    .locals 1

    .line 1
    const-string v0, "state"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Lcom/friday/lecture/floatwindow/options/a;->i()V

    .line 7
    .line 8
    .line 9
    iget-object v0, p0, Lcom/friday/lecture/floatwindow/options/a;->b:Lcom/friday/lecture/floatwindow/options/OptionLayout;

    .line 10
    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    invoke-virtual {v0, p1}, Lcom/friday/lecture/floatwindow/options/OptionLayout;->setClassState(Lcom/friday/lecture/floatwindow/FloatWindowStatus;)V

    .line 14
    .line 15
    .line 16
    :cond_0
    return-void
.end method

.method public final n()V
    .locals 6

    .line 1
    iget-object v0, p0, Lcom/friday/lecture/floatwindow/options/a;->c:Landroid/view/WindowManager$LayoutParams;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const-string v2, "layoutParams"

    .line 5
    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    invoke-static {v2}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    move-object v0, v1

    .line 12
    :cond_0
    iget v3, p0, Lcom/friday/lecture/floatwindow/options/a;->d:I

    .line 13
    .line 14
    if-nez v3, :cond_1

    .line 15
    .line 16
    iget-object v3, p0, Lcom/friday/lecture/floatwindow/options/a;->a:Landroid/content/Context;

    .line 17
    .line 18
    invoke-virtual {v3}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 19
    .line 20
    .line 21
    move-result-object v3

    .line 22
    sget v4, Lcom/friday/lecture/R$dimen;->view_36:I

    .line 23
    .line 24
    invoke-virtual {v3, v4}, Landroid/content/res/Resources;->getDimension(I)F

    .line 25
    .line 26
    .line 27
    move-result v3

    .line 28
    float-to-int v3, v3

    .line 29
    goto :goto_0

    .line 30
    :cond_1
    iget-object v4, p0, Lcom/friday/lecture/floatwindow/options/a;->a:Landroid/content/Context;

    .line 31
    .line 32
    invoke-virtual {v4}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 33
    .line 34
    .line 35
    move-result-object v4

    .line 36
    sget v5, Lcom/friday/lecture/R$dimen;->view_15:I

    .line 37
    .line 38
    invoke-virtual {v4, v5}, Landroid/content/res/Resources;->getDimension(I)F

    .line 39
    .line 40
    .line 41
    move-result v4

    .line 42
    float-to-int v4, v4

    .line 43
    add-int/2addr v3, v4

    .line 44
    :goto_0
    iput v3, v0, Landroid/view/WindowManager$LayoutParams;->x:I

    .line 45
    .line 46
    iget-object v0, p0, Lcom/friday/lecture/floatwindow/options/a;->c:Landroid/view/WindowManager$LayoutParams;

    .line 47
    .line 48
    if-nez v0, :cond_2

    .line 49
    .line 50
    invoke-static {v2}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 51
    .line 52
    .line 53
    move-object v0, v1

    .line 54
    :cond_2
    iget v3, p0, Lcom/friday/lecture/floatwindow/options/a;->e:I

    .line 55
    .line 56
    if-nez v3, :cond_3

    .line 57
    .line 58
    iget-object v3, p0, Lcom/friday/lecture/floatwindow/options/a;->a:Landroid/content/Context;

    .line 59
    .line 60
    invoke-virtual {v3}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 61
    .line 62
    .line 63
    move-result-object v3

    .line 64
    sget v4, Lcom/friday/lecture/R$dimen;->view_305:I

    .line 65
    .line 66
    invoke-virtual {v3, v4}, Landroid/content/res/Resources;->getDimension(I)F

    .line 67
    .line 68
    .line 69
    move-result v3

    .line 70
    float-to-int v3, v3

    .line 71
    goto :goto_1

    .line 72
    :cond_3
    iget-object v4, p0, Lcom/friday/lecture/floatwindow/options/a;->a:Landroid/content/Context;

    .line 73
    .line 74
    invoke-virtual {v4}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 75
    .line 76
    .line 77
    move-result-object v4

    .line 78
    sget v5, Lcom/friday/lecture/R$dimen;->view_5:I

    .line 79
    .line 80
    invoke-virtual {v4, v5}, Landroid/content/res/Resources;->getDimension(I)F

    .line 81
    .line 82
    .line 83
    move-result v4

    .line 84
    float-to-int v4, v4

    .line 85
    sub-int/2addr v3, v4

    .line 86
    :goto_1
    iput v3, v0, Landroid/view/WindowManager$LayoutParams;->y:I

    .line 87
    .line 88
    iget-object v0, p0, Lcom/friday/lecture/floatwindow/options/a;->f:Landroid/view/WindowManager;

    .line 89
    .line 90
    iget-object v3, p0, Lcom/friday/lecture/floatwindow/options/a;->b:Lcom/friday/lecture/floatwindow/options/OptionLayout;

    .line 91
    .line 92
    iget-object v4, p0, Lcom/friday/lecture/floatwindow/options/a;->c:Landroid/view/WindowManager$LayoutParams;

    .line 93
    .line 94
    if-nez v4, :cond_4

    .line 95
    .line 96
    invoke-static {v2}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 97
    .line 98
    .line 99
    goto :goto_2

    .line 100
    :cond_4
    move-object v1, v4

    .line 101
    :goto_2
    invoke-interface {v0, v3, v1}, Landroid/view/ViewManager;->updateViewLayout(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 102
    .line 103
    .line 104
    return-void
.end method

.method public final o()V
    .locals 6

    .line 1
    invoke-virtual {p0}, Lcom/friday/lecture/floatwindow/options/a;->i()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/friday/lecture/floatwindow/options/a;->c:Landroid/view/WindowManager$LayoutParams;

    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    const-string v2, "layoutParams"

    .line 8
    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    invoke-static {v2}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    move-object v0, v1

    .line 15
    :cond_0
    iget v3, p0, Lcom/friday/lecture/floatwindow/options/a;->d:I

    .line 16
    .line 17
    if-nez v3, :cond_1

    .line 18
    .line 19
    iget-object v3, p0, Lcom/friday/lecture/floatwindow/options/a;->a:Landroid/content/Context;

    .line 20
    .line 21
    invoke-virtual {v3}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 22
    .line 23
    .line 24
    move-result-object v3

    .line 25
    sget v4, Lcom/friday/lecture/R$dimen;->view_7:I

    .line 26
    .line 27
    invoke-virtual {v3, v4}, Landroid/content/res/Resources;->getDimension(I)F

    .line 28
    .line 29
    .line 30
    move-result v3

    .line 31
    float-to-int v3, v3

    .line 32
    goto :goto_0

    .line 33
    :cond_1
    iget-object v4, p0, Lcom/friday/lecture/floatwindow/options/a;->a:Landroid/content/Context;

    .line 34
    .line 35
    invoke-virtual {v4}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 36
    .line 37
    .line 38
    move-result-object v4

    .line 39
    sget v5, Lcom/friday/lecture/R$dimen;->view_15:I

    .line 40
    .line 41
    invoke-virtual {v4, v5}, Landroid/content/res/Resources;->getDimension(I)F

    .line 42
    .line 43
    .line 44
    move-result v4

    .line 45
    float-to-int v4, v4

    .line 46
    sub-int/2addr v3, v4

    .line 47
    :goto_0
    iput v3, v0, Landroid/view/WindowManager$LayoutParams;->x:I

    .line 48
    .line 49
    iget-object v0, p0, Lcom/friday/lecture/floatwindow/options/a;->c:Landroid/view/WindowManager$LayoutParams;

    .line 50
    .line 51
    if-nez v0, :cond_2

    .line 52
    .line 53
    invoke-static {v2}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 54
    .line 55
    .line 56
    move-object v0, v1

    .line 57
    :cond_2
    iget v3, p0, Lcom/friday/lecture/floatwindow/options/a;->e:I

    .line 58
    .line 59
    if-nez v3, :cond_3

    .line 60
    .line 61
    iget-object v3, p0, Lcom/friday/lecture/floatwindow/options/a;->a:Landroid/content/Context;

    .line 62
    .line 63
    invoke-virtual {v3}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 64
    .line 65
    .line 66
    move-result-object v3

    .line 67
    sget v4, Lcom/friday/lecture/R$dimen;->view_310:I

    .line 68
    .line 69
    invoke-virtual {v3, v4}, Landroid/content/res/Resources;->getDimension(I)F

    .line 70
    .line 71
    .line 72
    move-result v3

    .line 73
    float-to-int v3, v3

    .line 74
    goto :goto_1

    .line 75
    :cond_3
    iget-object v4, p0, Lcom/friday/lecture/floatwindow/options/a;->a:Landroid/content/Context;

    .line 76
    .line 77
    invoke-virtual {v4}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 78
    .line 79
    .line 80
    move-result-object v4

    .line 81
    sget v5, Lcom/friday/lecture/R$dimen;->view_5:I

    .line 82
    .line 83
    invoke-virtual {v4, v5}, Landroid/content/res/Resources;->getDimension(I)F

    .line 84
    .line 85
    .line 86
    move-result v4

    .line 87
    float-to-int v4, v4

    .line 88
    add-int/2addr v3, v4

    .line 89
    :goto_1
    iput v3, v0, Landroid/view/WindowManager$LayoutParams;->y:I

    .line 90
    .line 91
    iget-object v0, p0, Lcom/friday/lecture/floatwindow/options/a;->f:Landroid/view/WindowManager;

    .line 92
    .line 93
    iget-object v3, p0, Lcom/friday/lecture/floatwindow/options/a;->b:Lcom/friday/lecture/floatwindow/options/OptionLayout;

    .line 94
    .line 95
    iget-object v4, p0, Lcom/friday/lecture/floatwindow/options/a;->c:Landroid/view/WindowManager$LayoutParams;

    .line 96
    .line 97
    if-nez v4, :cond_4

    .line 98
    .line 99
    invoke-static {v2}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 100
    .line 101
    .line 102
    goto :goto_2

    .line 103
    :cond_4
    move-object v1, v4

    .line 104
    :goto_2
    invoke-interface {v0, v3, v1}, Landroid/view/ViewManager;->updateViewLayout(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 105
    .line 106
    .line 107
    return-void
.end method

.method public final p(Z)V
    .locals 5

    .line 1
    invoke-virtual {p0}, Lcom/friday/lecture/floatwindow/options/a;->i()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Landroid/view/WindowManager$LayoutParams;

    .line 5
    .line 6
    invoke-direct {v0}, Landroid/view/WindowManager$LayoutParams;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lcom/friday/lecture/floatwindow/options/a;->c:Landroid/view/WindowManager$LayoutParams;

    .line 10
    .line 11
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 12
    .line 13
    const/16 v2, 0x1a

    .line 14
    .line 15
    if-lt v1, v2, :cond_0

    .line 16
    .line 17
    const/16 v1, 0x7f6

    .line 18
    .line 19
    iput v1, v0, Landroid/view/WindowManager$LayoutParams;->type:I

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    const/16 v1, 0x7d2

    .line 23
    .line 24
    iput v1, v0, Landroid/view/WindowManager$LayoutParams;->type:I

    .line 25
    .line 26
    :goto_0
    iget-object v0, p0, Lcom/friday/lecture/floatwindow/options/a;->c:Landroid/view/WindowManager$LayoutParams;

    .line 27
    .line 28
    const/4 v1, 0x0

    .line 29
    const-string v2, "layoutParams"

    .line 30
    .line 31
    if-nez v0, :cond_1

    .line 32
    .line 33
    invoke-static {v2}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    move-object v0, v1

    .line 37
    :cond_1
    const v3, 0x800033

    .line 38
    .line 39
    .line 40
    iput v3, v0, Landroid/view/WindowManager$LayoutParams;->gravity:I

    .line 41
    .line 42
    iget-object v0, p0, Lcom/friday/lecture/floatwindow/options/a;->c:Landroid/view/WindowManager$LayoutParams;

    .line 43
    .line 44
    if-nez v0, :cond_2

    .line 45
    .line 46
    invoke-static {v2}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 47
    .line 48
    .line 49
    move-object v0, v1

    .line 50
    :cond_2
    const/4 v3, -0x2

    .line 51
    iput v3, v0, Landroid/view/WindowManager$LayoutParams;->width:I

    .line 52
    .line 53
    iget-object v0, p0, Lcom/friday/lecture/floatwindow/options/a;->c:Landroid/view/WindowManager$LayoutParams;

    .line 54
    .line 55
    if-nez v0, :cond_3

    .line 56
    .line 57
    invoke-static {v2}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 58
    .line 59
    .line 60
    move-object v0, v1

    .line 61
    :cond_3
    iput v3, v0, Landroid/view/WindowManager$LayoutParams;->height:I

    .line 62
    .line 63
    iget-object v0, p0, Lcom/friday/lecture/floatwindow/options/a;->c:Landroid/view/WindowManager$LayoutParams;

    .line 64
    .line 65
    if-nez v0, :cond_4

    .line 66
    .line 67
    invoke-static {v2}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 68
    .line 69
    .line 70
    move-object v0, v1

    .line 71
    :cond_4
    iget v3, p0, Lcom/friday/lecture/floatwindow/options/a;->d:I

    .line 72
    .line 73
    if-nez v3, :cond_5

    .line 74
    .line 75
    iget-object v3, p0, Lcom/friday/lecture/floatwindow/options/a;->a:Landroid/content/Context;

    .line 76
    .line 77
    invoke-virtual {v3}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 78
    .line 79
    .line 80
    move-result-object v3

    .line 81
    sget v4, Lcom/friday/lecture/R$dimen;->view_36:I

    .line 82
    .line 83
    invoke-virtual {v3, v4}, Landroid/content/res/Resources;->getDimension(I)F

    .line 84
    .line 85
    .line 86
    move-result v3

    .line 87
    float-to-int v3, v3

    .line 88
    :cond_5
    iput v3, v0, Landroid/view/WindowManager$LayoutParams;->x:I

    .line 89
    .line 90
    iget-object v0, p0, Lcom/friday/lecture/floatwindow/options/a;->c:Landroid/view/WindowManager$LayoutParams;

    .line 91
    .line 92
    if-nez v0, :cond_6

    .line 93
    .line 94
    invoke-static {v2}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 95
    .line 96
    .line 97
    move-object v0, v1

    .line 98
    :cond_6
    iget v3, p0, Lcom/friday/lecture/floatwindow/options/a;->e:I

    .line 99
    .line 100
    if-nez v3, :cond_7

    .line 101
    .line 102
    iget-object v3, p0, Lcom/friday/lecture/floatwindow/options/a;->a:Landroid/content/Context;

    .line 103
    .line 104
    invoke-virtual {v3}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 105
    .line 106
    .line 107
    move-result-object v3

    .line 108
    sget v4, Lcom/friday/lecture/R$dimen;->view_305:I

    .line 109
    .line 110
    invoke-virtual {v3, v4}, Landroid/content/res/Resources;->getDimension(I)F

    .line 111
    .line 112
    .line 113
    move-result v3

    .line 114
    float-to-int v3, v3

    .line 115
    :cond_7
    iput v3, v0, Landroid/view/WindowManager$LayoutParams;->y:I

    .line 116
    .line 117
    iget-object v0, p0, Lcom/friday/lecture/floatwindow/options/a;->c:Landroid/view/WindowManager$LayoutParams;

    .line 118
    .line 119
    if-nez v0, :cond_8

    .line 120
    .line 121
    invoke-static {v2}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 122
    .line 123
    .line 124
    move-object v0, v1

    .line 125
    :cond_8
    const/4 v3, 0x1

    .line 126
    iput v3, v0, Landroid/view/WindowManager$LayoutParams;->format:I

    .line 127
    .line 128
    iget-object v0, p0, Lcom/friday/lecture/floatwindow/options/a;->c:Landroid/view/WindowManager$LayoutParams;

    .line 129
    .line 130
    if-nez v0, :cond_9

    .line 131
    .line 132
    invoke-static {v2}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 133
    .line 134
    .line 135
    move-object v0, v1

    .line 136
    :cond_9
    const v3, 0x40028

    .line 137
    .line 138
    .line 139
    iput v3, v0, Landroid/view/WindowManager$LayoutParams;->flags:I

    .line 140
    .line 141
    iget-object v0, p0, Lcom/friday/lecture/floatwindow/options/a;->b:Lcom/friday/lecture/floatwindow/options/OptionLayout;

    .line 142
    .line 143
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 144
    .line 145
    .line 146
    new-instance v3, Lcom/friday/lecture/floatwindow/options/a$b;

    .line 147
    .line 148
    invoke-direct {v3, p0}, Lcom/friday/lecture/floatwindow/options/a$b;-><init>(Lcom/friday/lecture/floatwindow/options/a;)V

    .line 149
    .line 150
    .line 151
    invoke-virtual {v0, v3}, Landroid/view/View;->setOnTouchListener(Landroid/view/View$OnTouchListener;)V

    .line 152
    .line 153
    .line 154
    if-eqz p1, :cond_a

    .line 155
    .line 156
    const-string p1, "CanvasEnable"

    .line 157
    .line 158
    sget-object v0, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    .line 159
    .line 160
    invoke-static {p1, v0}, Lcom/jeremyliao/liveeventbus/LiveEventBus;->get(Ljava/lang/String;Ljava/lang/Class;)Lcom/jeremyliao/liveeventbus/core/Observable;

    .line 161
    .line 162
    .line 163
    move-result-object p1

    .line 164
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 165
    .line 166
    const-wide/16 v3, 0xc8

    .line 167
    .line 168
    invoke-interface {p1, v0, v3, v4}, Lcom/jeremyliao/liveeventbus/core/Observable;->postDelay(Ljava/lang/Object;J)V

    .line 169
    .line 170
    .line 171
    :cond_a
    iget-object p1, p0, Lcom/friday/lecture/floatwindow/options/a;->f:Landroid/view/WindowManager;

    .line 172
    .line 173
    iget-object v0, p0, Lcom/friday/lecture/floatwindow/options/a;->b:Lcom/friday/lecture/floatwindow/options/OptionLayout;

    .line 174
    .line 175
    iget-object v3, p0, Lcom/friday/lecture/floatwindow/options/a;->c:Landroid/view/WindowManager$LayoutParams;

    .line 176
    .line 177
    if-nez v3, :cond_b

    .line 178
    .line 179
    invoke-static {v2}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 180
    .line 181
    .line 182
    goto :goto_1

    .line 183
    :cond_b
    move-object v1, v3

    .line 184
    :goto_1
    invoke-interface {p1, v0, v1}, Landroid/view/ViewManager;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 185
    .line 186
    .line 187
    return-void
.end method

.method public final r(I)V
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/friday/lecture/floatwindow/options/a;->i()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/friday/lecture/floatwindow/options/a;->b:Lcom/friday/lecture/floatwindow/options/OptionLayout;

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    invoke-virtual {v0, p1}, Lcom/friday/lecture/floatwindow/options/OptionLayout;->s(I)V

    .line 9
    .line 10
    .line 11
    :cond_0
    return-void
.end method
