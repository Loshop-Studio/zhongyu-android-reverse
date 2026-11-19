.class public interface abstract Landroidx/compose/ui/platform/TextToolbar;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/compose/ui/platform/TextToolbar$DefaultImpls;
    }
.end annotation


# direct methods
.method public static synthetic access$showMenu$jd(Landroidx/compose/ui/platform/TextToolbar;Landroidx/compose/ui/geometry/Rect;Lx7/a;Lx7/a;Lx7/a;Lx7/a;Lx7/a;)V
    .locals 0

    .line 1
    invoke-super/range {p0 .. p6}, Landroidx/compose/ui/platform/TextToolbar;->showMenu(Landroidx/compose/ui/geometry/Rect;Lx7/a;Lx7/a;Lx7/a;Lx7/a;Lx7/a;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic showMenu$default(Landroidx/compose/ui/platform/TextToolbar;Landroidx/compose/ui/geometry/Rect;Lx7/a;Lx7/a;Lx7/a;Lx7/a;ILjava/lang/Object;)V
    .locals 1

    if-nez p7, :cond_4

    and-int/lit8 p7, p6, 0x2

    const/4 v0, 0x0

    if-eqz p7, :cond_0

    move-object p2, v0

    :cond_0
    and-int/lit8 p7, p6, 0x4

    if-eqz p7, :cond_1

    move-object p3, v0

    :cond_1
    and-int/lit8 p7, p6, 0x8

    if-eqz p7, :cond_2

    move-object p4, v0

    :cond_2
    and-int/lit8 p6, p6, 0x10

    if-eqz p6, :cond_3

    move-object p5, v0

    .line 2
    :cond_3
    invoke-interface/range {p0 .. p5}, Landroidx/compose/ui/platform/TextToolbar;->showMenu(Landroidx/compose/ui/geometry/Rect;Lx7/a;Lx7/a;Lx7/a;Lx7/a;)V

    return-void

    :cond_4
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    const-string p1, "Super calls with default arguments not supported in this target, function: showMenu"

    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static synthetic showMenu$default(Landroidx/compose/ui/platform/TextToolbar;Landroidx/compose/ui/geometry/Rect;Lx7/a;Lx7/a;Lx7/a;Lx7/a;Lx7/a;ILjava/lang/Object;)V
    .locals 1

    if-nez p8, :cond_5

    and-int/lit8 p8, p7, 0x2

    const/4 v0, 0x0

    if-eqz p8, :cond_0

    move-object p2, v0

    :cond_0
    and-int/lit8 p8, p7, 0x4

    if-eqz p8, :cond_1

    move-object p3, v0

    :cond_1
    and-int/lit8 p8, p7, 0x8

    if-eqz p8, :cond_2

    move-object p4, v0

    :cond_2
    and-int/lit8 p8, p7, 0x10

    if-eqz p8, :cond_3

    move-object p5, v0

    :cond_3
    and-int/lit8 p7, p7, 0x20

    if-eqz p7, :cond_4

    move-object p6, v0

    .line 1
    :cond_4
    invoke-interface/range {p0 .. p6}, Landroidx/compose/ui/platform/TextToolbar;->showMenu(Landroidx/compose/ui/geometry/Rect;Lx7/a;Lx7/a;Lx7/a;Lx7/a;Lx7/a;)V

    return-void

    :cond_5
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    const-string p1, "Super calls with default arguments not supported in this target, function: showMenu"

    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p0
.end method


# virtual methods
.method public abstract getStatus()Landroidx/compose/ui/platform/TextToolbarStatus;
.end method

.method public abstract hide()V
.end method

.method public abstract showMenu(Landroidx/compose/ui/geometry/Rect;Lx7/a;Lx7/a;Lx7/a;Lx7/a;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/ui/geometry/Rect;",
            "Lx7/a;",
            "Lx7/a;",
            "Lx7/a;",
            "Lx7/a;",
            ")V"
        }
    .end annotation
.end method

.method public showMenu(Landroidx/compose/ui/geometry/Rect;Lx7/a;Lx7/a;Lx7/a;Lx7/a;Lx7/a;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/ui/geometry/Rect;",
            "Lx7/a;",
            "Lx7/a;",
            "Lx7/a;",
            "Lx7/a;",
            "Lx7/a;",
            ")V"
        }
    .end annotation

    .line 1
    invoke-interface/range {p0 .. p5}, Landroidx/compose/ui/platform/TextToolbar;->showMenu(Landroidx/compose/ui/geometry/Rect;Lx7/a;Lx7/a;Lx7/a;Lx7/a;)V

    return-void
.end method
