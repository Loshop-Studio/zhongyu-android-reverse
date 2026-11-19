.class public final Landroidx/navigation/NavHostKt;
.super Ljava/lang/Object;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "androidx/navigation/NavHostKt__NavHostKt",
        "androidx/navigation/NavHostKt__NavHost_androidKt"
    }
    k = 0x4
    mv = {
        0x2,
        0x0,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public static final createGraph(Landroidx/navigation/NavHost;IILr6/c;)Landroidx/navigation/NavGraph;
    .locals 0
    .param p0    # Landroidx/navigation/NavHost;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p1    # I
        .annotation build Landroidx/annotation/IdRes;
        .end annotation
    .end param
    .param p2    # I
        .annotation build Landroidx/annotation/IdRes;
        .end annotation
    .end param
    .param p3    # Lr6/c;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/navigation/NavHost;",
            "II",
            "Lr6/c;",
            ")",
            "Landroidx/navigation/NavGraph;"
        }
    .end annotation

    .annotation runtime Lkotlin/Deprecated;
        message = "Use routes to create your NavGraph instead"
        replaceWith = .subannotation Lkotlin/ReplaceWith;
            expression = "createGraph(startDestination = startDestination.toString(), route = id.toString()) { builder.invoke() }"
            imports = {}
        .end subannotation
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    invoke-static {p0, p1, p2, p3}, Landroidx/navigation/NavHostKt__NavHost_androidKt;->createGraph(Landroidx/navigation/NavHost;IILr6/c;)Landroidx/navigation/NavGraph;

    move-result-object p0

    return-object p0
.end method

.method public static final createGraph(Landroidx/navigation/NavHost;Ljava/lang/Object;Ly6/c;Ljava/util/Map;Lr6/c;)Landroidx/navigation/NavGraph;
    .locals 0
    .param p0    # Landroidx/navigation/NavHost;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p1    # Ljava/lang/Object;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Ly6/c;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p3    # Ljava/util/Map;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p4    # Lr6/c;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/navigation/NavHost;",
            "Ljava/lang/Object;",
            "Ly6/c;",
            "Ljava/util/Map<",
            "Ly6/q;",
            "Landroidx/navigation/NavType<",
            "*>;>;",
            "Lr6/c;",
            ")",
            "Landroidx/navigation/NavGraph;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 2
    invoke-static {p0, p1, p2, p3, p4}, Landroidx/navigation/NavHostKt__NavHostKt;->createGraph(Landroidx/navigation/NavHost;Ljava/lang/Object;Ly6/c;Ljava/util/Map;Lr6/c;)Landroidx/navigation/NavGraph;

    move-result-object p0

    return-object p0
.end method

.method public static final createGraph(Landroidx/navigation/NavHost;Ljava/lang/String;Ljava/lang/String;Lr6/c;)Landroidx/navigation/NavGraph;
    .locals 0
    .param p0    # Landroidx/navigation/NavHost;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p3    # Lr6/c;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/navigation/NavHost;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lr6/c;",
            ")",
            "Landroidx/navigation/NavGraph;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 3
    invoke-static {p0, p1, p2, p3}, Landroidx/navigation/NavHostKt__NavHostKt;->createGraph(Landroidx/navigation/NavHost;Ljava/lang/String;Ljava/lang/String;Lr6/c;)Landroidx/navigation/NavGraph;

    move-result-object p0

    return-object p0
.end method

.method public static final createGraph(Landroidx/navigation/NavHost;Ly6/c;Ly6/c;Ljava/util/Map;Lr6/c;)Landroidx/navigation/NavGraph;
    .locals 0
    .param p0    # Landroidx/navigation/NavHost;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p1    # Ly6/c;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Ly6/c;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p3    # Ljava/util/Map;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p4    # Lr6/c;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/navigation/NavHost;",
            "Ly6/c;",
            "Ly6/c;",
            "Ljava/util/Map<",
            "Ly6/q;",
            "Landroidx/navigation/NavType<",
            "*>;>;",
            "Lr6/c;",
            ")",
            "Landroidx/navigation/NavGraph;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 4
    invoke-static {p0, p1, p2, p3, p4}, Landroidx/navigation/NavHostKt__NavHostKt;->createGraph(Landroidx/navigation/NavHost;Ly6/c;Ly6/c;Ljava/util/Map;Lr6/c;)Landroidx/navigation/NavGraph;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic createGraph$default(Landroidx/navigation/NavHost;IILr6/c;ILjava/lang/Object;)Landroidx/navigation/NavGraph;
    .locals 0

    .line 1
    invoke-static/range {p0 .. p5}, Landroidx/navigation/NavHostKt__NavHost_androidKt;->createGraph$default(Landroidx/navigation/NavHost;IILr6/c;ILjava/lang/Object;)Landroidx/navigation/NavGraph;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic createGraph$default(Landroidx/navigation/NavHost;Ljava/lang/Object;Ly6/c;Ljava/util/Map;Lr6/c;ILjava/lang/Object;)Landroidx/navigation/NavGraph;
    .locals 0

    .line 2
    invoke-static/range {p0 .. p6}, Landroidx/navigation/NavHostKt__NavHostKt;->createGraph$default(Landroidx/navigation/NavHost;Ljava/lang/Object;Ly6/c;Ljava/util/Map;Lr6/c;ILjava/lang/Object;)Landroidx/navigation/NavGraph;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic createGraph$default(Landroidx/navigation/NavHost;Ljava/lang/String;Ljava/lang/String;Lr6/c;ILjava/lang/Object;)Landroidx/navigation/NavGraph;
    .locals 0

    .line 3
    invoke-static/range {p0 .. p5}, Landroidx/navigation/NavHostKt__NavHostKt;->createGraph$default(Landroidx/navigation/NavHost;Ljava/lang/String;Ljava/lang/String;Lr6/c;ILjava/lang/Object;)Landroidx/navigation/NavGraph;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic createGraph$default(Landroidx/navigation/NavHost;Ly6/c;Ly6/c;Ljava/util/Map;Lr6/c;ILjava/lang/Object;)Landroidx/navigation/NavGraph;
    .locals 0

    .line 4
    invoke-static/range {p0 .. p6}, Landroidx/navigation/NavHostKt__NavHostKt;->createGraph$default(Landroidx/navigation/NavHost;Ly6/c;Ly6/c;Ljava/util/Map;Lr6/c;ILjava/lang/Object;)Landroidx/navigation/NavGraph;

    move-result-object p0

    return-object p0
.end method
