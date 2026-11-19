.class public final Landroidx/navigation/NavOptions$Builder;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/navigation/NavOptions;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Builder"
.end annotation


# instance fields
.field private enterAnim:I
    .annotation build Landroidx/annotation/AnimRes;
    .end annotation

    .annotation build Landroidx/annotation/AnimatorRes;
    .end annotation
.end field

.field private exitAnim:I
    .annotation build Landroidx/annotation/AnimRes;
    .end annotation

    .annotation build Landroidx/annotation/AnimatorRes;
    .end annotation
.end field

.field private popEnterAnim:I
    .annotation build Landroidx/annotation/AnimRes;
    .end annotation

    .annotation build Landroidx/annotation/AnimatorRes;
    .end annotation
.end field

.field private popExitAnim:I
    .annotation build Landroidx/annotation/AnimRes;
    .end annotation

    .annotation build Landroidx/annotation/AnimatorRes;
    .end annotation
.end field

.field private popUpToId:I
    .annotation build Landroidx/annotation/IdRes;
    .end annotation
.end field

.field private popUpToInclusive:Z

.field private popUpToRoute:Ljava/lang/String;

.field private popUpToRouteClass:Lod/c;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lod/c;"
        }
    .end annotation
.end field

.field private popUpToRouteObject:Ljava/lang/Object;

.field private popUpToSaveState:Z

.field private restoreState:Z

.field private singleTop:Z


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, -0x1

    .line 5
    iput v0, p0, Landroidx/navigation/NavOptions$Builder;->popUpToId:I

    .line 6
    .line 7
    iput v0, p0, Landroidx/navigation/NavOptions$Builder;->enterAnim:I

    .line 8
    .line 9
    iput v0, p0, Landroidx/navigation/NavOptions$Builder;->exitAnim:I

    .line 10
    .line 11
    iput v0, p0, Landroidx/navigation/NavOptions$Builder;->popEnterAnim:I

    .line 12
    .line 13
    iput v0, p0, Landroidx/navigation/NavOptions$Builder;->popExitAnim:I

    .line 14
    .line 15
    return-void
.end method

.method public static synthetic setPopUpTo$default(Landroidx/navigation/NavOptions$Builder;IZZILjava/lang/Object;)Landroidx/navigation/NavOptions$Builder;
    .locals 0

    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_0

    const/4 p3, 0x0

    .line 1
    :cond_0
    invoke-virtual {p0, p1, p2, p3}, Landroidx/navigation/NavOptions$Builder;->setPopUpTo(IZZ)Landroidx/navigation/NavOptions$Builder;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic setPopUpTo$default(Landroidx/navigation/NavOptions$Builder;Ljava/lang/Object;ZZILjava/lang/Object;)Landroidx/navigation/NavOptions$Builder;
    .locals 0

    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_0

    const/4 p3, 0x0

    .line 5
    :cond_0
    invoke-virtual {p0, p1, p2, p3}, Landroidx/navigation/NavOptions$Builder;->setPopUpTo(Ljava/lang/Object;ZZ)Landroidx/navigation/NavOptions$Builder;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic setPopUpTo$default(Landroidx/navigation/NavOptions$Builder;Ljava/lang/String;ZZILjava/lang/Object;)Landroidx/navigation/NavOptions$Builder;
    .locals 0

    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_0

    const/4 p3, 0x0

    .line 2
    :cond_0
    invoke-virtual {p0, p1, p2, p3}, Landroidx/navigation/NavOptions$Builder;->setPopUpTo(Ljava/lang/String;ZZ)Landroidx/navigation/NavOptions$Builder;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic setPopUpTo$default(Landroidx/navigation/NavOptions$Builder;Lod/c;ZZILjava/lang/Object;)Landroidx/navigation/NavOptions$Builder;
    .locals 0

    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_0

    const/4 p3, 0x0

    .line 4
    :cond_0
    invoke-virtual {p0, p1, p2, p3}, Landroidx/navigation/NavOptions$Builder;->setPopUpTo(Lod/c;ZZ)Landroidx/navigation/NavOptions$Builder;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic setPopUpTo$default(Landroidx/navigation/NavOptions$Builder;ZZILjava/lang/Object;)Landroidx/navigation/NavOptions$Builder;
    .locals 0

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    const/4 p2, 0x0

    :cond_0
    const/4 p3, 0x4

    .line 3
    const-string p4, "T"

    invoke-static {p3, p4}, Lkotlin/jvm/internal/u;->m(ILjava/lang/String;)V

    const-class p3, Ljava/lang/Object;

    invoke-static {p3}, Lkotlin/jvm/internal/y;->b(Ljava/lang/Class;)Lod/c;

    move-result-object p3

    invoke-virtual {p0, p3, p1, p2}, Landroidx/navigation/NavOptions$Builder;->setPopUpTo(Lod/c;ZZ)Landroidx/navigation/NavOptions$Builder;

    return-object p0
.end method


# virtual methods
.method public final build()Landroidx/navigation/NavOptions;
    .locals 13

    .line 1
    iget-object v3, p0, Landroidx/navigation/NavOptions$Builder;->popUpToRoute:Ljava/lang/String;

    .line 2
    .line 3
    if-eqz v3, :cond_0

    .line 4
    .line 5
    new-instance v0, Landroidx/navigation/NavOptions;

    .line 6
    .line 7
    iget-boolean v1, p0, Landroidx/navigation/NavOptions$Builder;->singleTop:Z

    .line 8
    .line 9
    iget-boolean v2, p0, Landroidx/navigation/NavOptions$Builder;->restoreState:Z

    .line 10
    .line 11
    iget-boolean v4, p0, Landroidx/navigation/NavOptions$Builder;->popUpToInclusive:Z

    .line 12
    .line 13
    iget-boolean v5, p0, Landroidx/navigation/NavOptions$Builder;->popUpToSaveState:Z

    .line 14
    .line 15
    iget v6, p0, Landroidx/navigation/NavOptions$Builder;->enterAnim:I

    .line 16
    .line 17
    iget v7, p0, Landroidx/navigation/NavOptions$Builder;->exitAnim:I

    .line 18
    .line 19
    iget v8, p0, Landroidx/navigation/NavOptions$Builder;->popEnterAnim:I

    .line 20
    .line 21
    iget v9, p0, Landroidx/navigation/NavOptions$Builder;->popExitAnim:I

    .line 22
    .line 23
    invoke-direct/range {v0 .. v9}, Landroidx/navigation/NavOptions;-><init>(ZZLjava/lang/String;ZZIIII)V

    .line 24
    .line 25
    .line 26
    return-object v0

    .line 27
    :cond_0
    iget-object v4, p0, Landroidx/navigation/NavOptions$Builder;->popUpToRouteClass:Lod/c;

    .line 28
    .line 29
    if-eqz v4, :cond_1

    .line 30
    .line 31
    new-instance v1, Landroidx/navigation/NavOptions;

    .line 32
    .line 33
    iget-boolean v2, p0, Landroidx/navigation/NavOptions$Builder;->singleTop:Z

    .line 34
    .line 35
    iget-boolean v3, p0, Landroidx/navigation/NavOptions$Builder;->restoreState:Z

    .line 36
    .line 37
    iget-boolean v5, p0, Landroidx/navigation/NavOptions$Builder;->popUpToInclusive:Z

    .line 38
    .line 39
    iget-boolean v6, p0, Landroidx/navigation/NavOptions$Builder;->popUpToSaveState:Z

    .line 40
    .line 41
    iget v7, p0, Landroidx/navigation/NavOptions$Builder;->enterAnim:I

    .line 42
    .line 43
    iget v8, p0, Landroidx/navigation/NavOptions$Builder;->exitAnim:I

    .line 44
    .line 45
    iget v9, p0, Landroidx/navigation/NavOptions$Builder;->popEnterAnim:I

    .line 46
    .line 47
    iget v10, p0, Landroidx/navigation/NavOptions$Builder;->popExitAnim:I

    .line 48
    .line 49
    invoke-direct/range {v1 .. v10}, Landroidx/navigation/NavOptions;-><init>(ZZLod/c;ZZIIII)V

    .line 50
    .line 51
    .line 52
    return-object v1

    .line 53
    :cond_1
    iget-object v5, p0, Landroidx/navigation/NavOptions$Builder;->popUpToRouteObject:Ljava/lang/Object;

    .line 54
    .line 55
    if-eqz v5, :cond_2

    .line 56
    .line 57
    new-instance v2, Landroidx/navigation/NavOptions;

    .line 58
    .line 59
    iget-boolean v3, p0, Landroidx/navigation/NavOptions$Builder;->singleTop:Z

    .line 60
    .line 61
    iget-boolean v4, p0, Landroidx/navigation/NavOptions$Builder;->restoreState:Z

    .line 62
    .line 63
    invoke-static {v5}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 64
    .line 65
    .line 66
    iget-boolean v6, p0, Landroidx/navigation/NavOptions$Builder;->popUpToInclusive:Z

    .line 67
    .line 68
    iget-boolean v7, p0, Landroidx/navigation/NavOptions$Builder;->popUpToSaveState:Z

    .line 69
    .line 70
    iget v8, p0, Landroidx/navigation/NavOptions$Builder;->enterAnim:I

    .line 71
    .line 72
    iget v9, p0, Landroidx/navigation/NavOptions$Builder;->exitAnim:I

    .line 73
    .line 74
    iget v10, p0, Landroidx/navigation/NavOptions$Builder;->popEnterAnim:I

    .line 75
    .line 76
    iget v11, p0, Landroidx/navigation/NavOptions$Builder;->popExitAnim:I

    .line 77
    .line 78
    invoke-direct/range {v2 .. v11}, Landroidx/navigation/NavOptions;-><init>(ZZLjava/lang/Object;ZZIIII)V

    .line 79
    .line 80
    .line 81
    return-object v2

    .line 82
    :cond_2
    new-instance v3, Landroidx/navigation/NavOptions;

    .line 83
    .line 84
    iget-boolean v4, p0, Landroidx/navigation/NavOptions$Builder;->singleTop:Z

    .line 85
    .line 86
    iget-boolean v5, p0, Landroidx/navigation/NavOptions$Builder;->restoreState:Z

    .line 87
    .line 88
    iget v6, p0, Landroidx/navigation/NavOptions$Builder;->popUpToId:I

    .line 89
    .line 90
    iget-boolean v7, p0, Landroidx/navigation/NavOptions$Builder;->popUpToInclusive:Z

    .line 91
    .line 92
    iget-boolean v8, p0, Landroidx/navigation/NavOptions$Builder;->popUpToSaveState:Z

    .line 93
    .line 94
    iget v9, p0, Landroidx/navigation/NavOptions$Builder;->enterAnim:I

    .line 95
    .line 96
    iget v10, p0, Landroidx/navigation/NavOptions$Builder;->exitAnim:I

    .line 97
    .line 98
    iget v11, p0, Landroidx/navigation/NavOptions$Builder;->popEnterAnim:I

    .line 99
    .line 100
    iget v12, p0, Landroidx/navigation/NavOptions$Builder;->popExitAnim:I

    .line 101
    .line 102
    invoke-direct/range {v3 .. v12}, Landroidx/navigation/NavOptions;-><init>(ZZIZZIIII)V

    .line 103
    .line 104
    .line 105
    return-object v3
.end method

.method public final setEnterAnim(I)Landroidx/navigation/NavOptions$Builder;
    .locals 0
    .param p1    # I
        .annotation build Landroidx/annotation/AnimRes;
        .end annotation

        .annotation build Landroidx/annotation/AnimatorRes;
        .end annotation
    .end param

    .line 1
    iput p1, p0, Landroidx/navigation/NavOptions$Builder;->enterAnim:I

    .line 2
    .line 3
    return-object p0
.end method

.method public final setExitAnim(I)Landroidx/navigation/NavOptions$Builder;
    .locals 0
    .param p1    # I
        .annotation build Landroidx/annotation/AnimRes;
        .end annotation

        .annotation build Landroidx/annotation/AnimatorRes;
        .end annotation
    .end param

    .line 1
    iput p1, p0, Landroidx/navigation/NavOptions$Builder;->exitAnim:I

    .line 2
    .line 3
    return-object p0
.end method

.method public final setLaunchSingleTop(Z)Landroidx/navigation/NavOptions$Builder;
    .locals 0

    .line 1
    iput-boolean p1, p0, Landroidx/navigation/NavOptions$Builder;->singleTop:Z

    .line 2
    .line 3
    return-object p0
.end method

.method public final setPopEnterAnim(I)Landroidx/navigation/NavOptions$Builder;
    .locals 0
    .param p1    # I
        .annotation build Landroidx/annotation/AnimRes;
        .end annotation

        .annotation build Landroidx/annotation/AnimatorRes;
        .end annotation
    .end param

    .line 1
    iput p1, p0, Landroidx/navigation/NavOptions$Builder;->popEnterAnim:I

    .line 2
    .line 3
    return-object p0
.end method

.method public final setPopExitAnim(I)Landroidx/navigation/NavOptions$Builder;
    .locals 0
    .param p1    # I
        .annotation build Landroidx/annotation/AnimRes;
        .end annotation

        .annotation build Landroidx/annotation/AnimatorRes;
        .end annotation
    .end param

    .line 1
    iput p1, p0, Landroidx/navigation/NavOptions$Builder;->popExitAnim:I

    .line 2
    .line 3
    return-object p0
.end method

.method public final setPopUpTo(IZ)Landroidx/navigation/NavOptions$Builder;
    .locals 6
    .param p1    # I
        .annotation build Landroidx/annotation/IdRes;
        .end annotation
    .end param

    .line 1
    const/4 v4, 0x4

    const/4 v5, 0x0

    const/4 v3, 0x0

    move-object v0, p0

    move v1, p1

    move v2, p2

    invoke-static/range {v0 .. v5}, Landroidx/navigation/NavOptions$Builder;->setPopUpTo$default(Landroidx/navigation/NavOptions$Builder;IZZILjava/lang/Object;)Landroidx/navigation/NavOptions$Builder;

    move-result-object p1

    return-object p1
.end method

.method public final setPopUpTo(IZZ)Landroidx/navigation/NavOptions$Builder;
    .locals 0
    .param p1    # I
        .annotation build Landroidx/annotation/IdRes;
        .end annotation
    .end param

    .line 5
    iput p1, p0, Landroidx/navigation/NavOptions$Builder;->popUpToId:I

    const/4 p1, 0x0

    .line 6
    iput-object p1, p0, Landroidx/navigation/NavOptions$Builder;->popUpToRoute:Ljava/lang/String;

    .line 7
    iput-boolean p2, p0, Landroidx/navigation/NavOptions$Builder;->popUpToInclusive:Z

    .line 8
    iput-boolean p3, p0, Landroidx/navigation/NavOptions$Builder;->popUpToSaveState:Z

    return-object p0
.end method

.method public final setPopUpTo(Ljava/lang/Object;Z)Landroidx/navigation/NavOptions$Builder;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(TT;Z)",
            "Landroidx/navigation/NavOptions$Builder;"
        }
    .end annotation

    .line 2
    const-string v0, "route"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v5, 0x4

    const/4 v6, 0x0

    const/4 v4, 0x0

    move-object v1, p0

    move-object v2, p1

    move v3, p2

    invoke-static/range {v1 .. v6}, Landroidx/navigation/NavOptions$Builder;->setPopUpTo$default(Landroidx/navigation/NavOptions$Builder;Ljava/lang/Object;ZZILjava/lang/Object;)Landroidx/navigation/NavOptions$Builder;

    move-result-object p1

    return-object p1
.end method

.method public final setPopUpTo(Ljava/lang/Object;ZZ)Landroidx/navigation/NavOptions$Builder;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(TT;ZZ)",
            "Landroidx/navigation/NavOptions$Builder;"
        }
    .end annotation

    const-string v0, "route"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 18
    iput-object p1, p0, Landroidx/navigation/NavOptions$Builder;->popUpToRouteObject:Ljava/lang/Object;

    .line 19
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p1

    invoke-static {p1}, Lkotlin/jvm/internal/y;->b(Ljava/lang/Class;)Lod/c;

    move-result-object p1

    invoke-static {p1}, Lce/q;->c(Lod/c;)Lce/b;

    move-result-object p1

    invoke-static {p1}, Landroidx/navigation/serialization/RouteSerializerKt;->generateHashCode(Lce/b;)I

    move-result p1

    invoke-virtual {p0, p1, p2, p3}, Landroidx/navigation/NavOptions$Builder;->setPopUpTo(IZZ)Landroidx/navigation/NavOptions$Builder;

    return-object p0
.end method

.method public final setPopUpTo(Ljava/lang/String;Z)Landroidx/navigation/NavOptions$Builder;
    .locals 6

    .line 3
    const/4 v4, 0x4

    const/4 v5, 0x0

    const/4 v3, 0x0

    move-object v0, p0

    move-object v1, p1

    move v2, p2

    invoke-static/range {v0 .. v5}, Landroidx/navigation/NavOptions$Builder;->setPopUpTo$default(Landroidx/navigation/NavOptions$Builder;Ljava/lang/String;ZZILjava/lang/Object;)Landroidx/navigation/NavOptions$Builder;

    move-result-object p1

    return-object p1
.end method

.method public final setPopUpTo(Ljava/lang/String;ZZ)Landroidx/navigation/NavOptions$Builder;
    .locals 0

    .line 9
    iput-object p1, p0, Landroidx/navigation/NavOptions$Builder;->popUpToRoute:Ljava/lang/String;

    const/4 p1, -0x1

    .line 10
    iput p1, p0, Landroidx/navigation/NavOptions$Builder;->popUpToId:I

    .line 11
    iput-boolean p2, p0, Landroidx/navigation/NavOptions$Builder;->popUpToInclusive:Z

    .line 12
    iput-boolean p3, p0, Landroidx/navigation/NavOptions$Builder;->popUpToSaveState:Z

    return-object p0
.end method

.method public final setPopUpTo(Lod/c;Z)Landroidx/navigation/NavOptions$Builder;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lod/c;",
            "Z)",
            "Landroidx/navigation/NavOptions$Builder;"
        }
    .end annotation

    .line 4
    const-string v0, "route"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v5, 0x4

    const/4 v6, 0x0

    const/4 v4, 0x0

    move-object v1, p0

    move-object v2, p1

    move v3, p2

    invoke-static/range {v1 .. v6}, Landroidx/navigation/NavOptions$Builder;->setPopUpTo$default(Landroidx/navigation/NavOptions$Builder;Lod/c;ZZILjava/lang/Object;)Landroidx/navigation/NavOptions$Builder;

    move-result-object p1

    return-object p1
.end method

.method public final setPopUpTo(Lod/c;ZZ)Landroidx/navigation/NavOptions$Builder;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lod/c;",
            "ZZ)",
            "Landroidx/navigation/NavOptions$Builder;"
        }
    .end annotation

    const-string v0, "route"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    iput-object p1, p0, Landroidx/navigation/NavOptions$Builder;->popUpToRouteClass:Lod/c;

    const/4 p1, -0x1

    .line 15
    iput p1, p0, Landroidx/navigation/NavOptions$Builder;->popUpToId:I

    .line 16
    iput-boolean p2, p0, Landroidx/navigation/NavOptions$Builder;->popUpToInclusive:Z

    .line 17
    iput-boolean p3, p0, Landroidx/navigation/NavOptions$Builder;->popUpToSaveState:Z

    return-object p0
.end method

.method public final synthetic setPopUpTo(Z)Landroidx/navigation/NavOptions$Builder;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(Z)",
            "Landroidx/navigation/NavOptions$Builder;"
        }
    .end annotation

    const/4 v0, 0x4

    .line 20
    const-string v1, "T"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/u;->m(ILjava/lang/String;)V

    const-class v0, Ljava/lang/Object;

    invoke-static {v0}, Lkotlin/jvm/internal/y;->b(Ljava/lang/Class;)Lod/c;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {p0, v0, p1, v1}, Landroidx/navigation/NavOptions$Builder;->setPopUpTo(Lod/c;ZZ)Landroidx/navigation/NavOptions$Builder;

    return-object p0
.end method

.method public final synthetic setPopUpTo(ZZ)Landroidx/navigation/NavOptions$Builder;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(ZZ)",
            "Landroidx/navigation/NavOptions$Builder;"
        }
    .end annotation

    const/4 v0, 0x4

    .line 13
    const-string v1, "T"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/u;->m(ILjava/lang/String;)V

    const-class v0, Ljava/lang/Object;

    invoke-static {v0}, Lkotlin/jvm/internal/y;->b(Ljava/lang/Class;)Lod/c;

    move-result-object v0

    invoke-virtual {p0, v0, p1, p2}, Landroidx/navigation/NavOptions$Builder;->setPopUpTo(Lod/c;ZZ)Landroidx/navigation/NavOptions$Builder;

    return-object p0
.end method

.method public final setRestoreState(Z)Landroidx/navigation/NavOptions$Builder;
    .locals 0

    .line 1
    iput-boolean p1, p0, Landroidx/navigation/NavOptions$Builder;->restoreState:Z

    .line 2
    .line 3
    return-object p0
.end method
