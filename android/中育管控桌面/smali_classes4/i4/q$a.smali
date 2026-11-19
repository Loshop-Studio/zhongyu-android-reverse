.class public final Li4/q$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Li4/q;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Li4/q$a;-><init>()V

    return-void
.end method

.method public static synthetic c(Li4/q$a;Landroid/view/Window;Landroid/view/View;ZZIILjava/lang/Object;)V
    .locals 6

    .line 1
    and-int/lit8 p7, p6, 0x2

    .line 2
    .line 3
    if-eqz p7, :cond_0

    .line 4
    .line 5
    invoke-virtual {p1}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 6
    .line 7
    .line 8
    move-result-object p2

    .line 9
    const-string p7, "getDecorView(...)"

    .line 10
    .line 11
    invoke-static {p2, p7}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    :cond_0
    move-object v2, p2

    .line 15
    and-int/lit8 p2, p6, 0x4

    .line 16
    .line 17
    const/4 p7, 0x0

    .line 18
    if-eqz p2, :cond_1

    .line 19
    .line 20
    move v3, p7

    .line 21
    goto :goto_0

    .line 22
    :cond_1
    move v3, p3

    .line 23
    :goto_0
    and-int/lit8 p2, p6, 0x8

    .line 24
    .line 25
    if-eqz p2, :cond_2

    .line 26
    .line 27
    move v4, p7

    .line 28
    goto :goto_1

    .line 29
    :cond_2
    move v4, p4

    .line 30
    :goto_1
    and-int/lit8 p2, p6, 0x10

    .line 31
    .line 32
    if-eqz p2, :cond_3

    .line 33
    .line 34
    invoke-static {}, Landroidx/core/view/WindowInsetsCompat$Type;->statusBars()I

    .line 35
    .line 36
    .line 37
    move-result p5

    .line 38
    :cond_3
    move-object v0, p0

    .line 39
    move-object v1, p1

    .line 40
    move v5, p5

    .line 41
    invoke-virtual/range {v0 .. v5}, Li4/q$a;->b(Landroid/view/Window;Landroid/view/View;ZZI)V

    .line 42
    .line 43
    .line 44
    return-void
.end method


# virtual methods
.method public final a(Landroid/view/Window;ZZ)V
    .locals 2

    .line 1
    const-string v0, "window"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance v0, Landroidx/core/view/WindowInsetsControllerCompat;

    .line 7
    .line 8
    invoke-virtual {p1}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    invoke-direct {v0, p1, v1}, Landroidx/core/view/WindowInsetsControllerCompat;-><init>(Landroid/view/Window;Landroid/view/View;)V

    .line 13
    .line 14
    .line 15
    invoke-virtual {v0, p2}, Landroidx/core/view/WindowInsetsControllerCompat;->setAppearanceLightStatusBars(Z)V

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0, p3}, Landroidx/core/view/WindowInsetsControllerCompat;->setAppearanceLightNavigationBars(Z)V

    .line 19
    .line 20
    .line 21
    return-void
.end method

.method public final b(Landroid/view/Window;Landroid/view/View;ZZI)V
    .locals 3

    .line 1
    const-string v0, "window"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "view"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const/high16 v0, -0x80000000

    .line 12
    .line 13
    invoke-virtual {p1, v0}, Landroid/view/Window;->addFlags(I)V

    .line 14
    .line 15
    .line 16
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 17
    .line 18
    const/16 v1, 0x1d

    .line 19
    .line 20
    const/4 v2, 0x0

    .line 21
    if-lt v0, v1, :cond_0

    .line 22
    .line 23
    invoke-static {p1, v2}, Landroidx/activity/p;->a(Landroid/view/Window;Z)V

    .line 24
    .line 25
    .line 26
    invoke-static {p1, v2}, Landroidx/activity/o;->a(Landroid/view/Window;Z)V

    .line 27
    .line 28
    .line 29
    :cond_0
    invoke-static {p1, v2}, Landroidx/core/view/WindowCompat;->setDecorFitsSystemWindows(Landroid/view/Window;Z)V

    .line 30
    .line 31
    .line 32
    new-instance v0, Landroidx/core/view/WindowInsetsControllerCompat;

    .line 33
    .line 34
    invoke-direct {v0, p1, p2}, Landroidx/core/view/WindowInsetsControllerCompat;-><init>(Landroid/view/Window;Landroid/view/View;)V

    .line 35
    .line 36
    .line 37
    const/4 p1, 0x2

    .line 38
    invoke-virtual {v0, p1}, Landroidx/core/view/WindowInsetsControllerCompat;->setSystemBarsBehavior(I)V

    .line 39
    .line 40
    .line 41
    invoke-virtual {v0, p3}, Landroidx/core/view/WindowInsetsControllerCompat;->setAppearanceLightStatusBars(Z)V

    .line 42
    .line 43
    .line 44
    invoke-virtual {v0, p4}, Landroidx/core/view/WindowInsetsControllerCompat;->setAppearanceLightNavigationBars(Z)V

    .line 45
    .line 46
    .line 47
    invoke-virtual {v0, p5}, Landroidx/core/view/WindowInsetsControllerCompat;->show(I)V

    .line 48
    .line 49
    .line 50
    return-void
.end method
