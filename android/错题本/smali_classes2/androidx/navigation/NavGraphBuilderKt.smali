.class public final Landroidx/navigation/NavGraphBuilderKt;
.super Ljava/lang/Object;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "androidx/navigation/NavGraphBuilderKt__NavGraphBuilderKt",
        "androidx/navigation/NavGraphBuilderKt__NavGraphBuilder_androidKt"
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
.method public static final navigation(Landroidx/navigation/NavigatorProvider;IILr6/c;)Landroidx/navigation/NavGraph;
    .locals 0
    .param p0    # Landroidx/navigation/NavigatorProvider;
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
            "Landroidx/navigation/NavigatorProvider;",
            "II",
            "Lr6/c;",
            ")",
            "Landroidx/navigation/NavGraph;"
        }
    .end annotation

    .annotation runtime Lkotlin/Deprecated;
        message = "Use routes to build your NavGraph instead"
        replaceWith = .subannotation Lkotlin/ReplaceWith;
            expression = "navigation(startDestination = startDestination.toString(), route = id.toString()) { builder.invoke() }"
            imports = {}
        .end subannotation
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    invoke-static {p0, p1, p2, p3}, Landroidx/navigation/NavGraphBuilderKt__NavGraphBuilder_androidKt;->navigation(Landroidx/navigation/NavigatorProvider;IILr6/c;)Landroidx/navigation/NavGraph;

    move-result-object p0

    return-object p0
.end method

.method public static final navigation(Landroidx/navigation/NavigatorProvider;Ljava/lang/Object;Ly6/c;Ljava/util/Map;Lr6/c;)Landroidx/navigation/NavGraph;
    .locals 0
    .param p0    # Landroidx/navigation/NavigatorProvider;
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
            "Landroidx/navigation/NavigatorProvider;",
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
    invoke-static {p0, p1, p2, p3, p4}, Landroidx/navigation/NavGraphBuilderKt__NavGraphBuilderKt;->navigation(Landroidx/navigation/NavigatorProvider;Ljava/lang/Object;Ly6/c;Ljava/util/Map;Lr6/c;)Landroidx/navigation/NavGraph;

    move-result-object p0

    return-object p0
.end method

.method public static final navigation(Landroidx/navigation/NavigatorProvider;Ljava/lang/String;Ljava/lang/String;Lr6/c;)Landroidx/navigation/NavGraph;
    .locals 0
    .param p0    # Landroidx/navigation/NavigatorProvider;
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
            "Landroidx/navigation/NavigatorProvider;",
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
    invoke-static {p0, p1, p2, p3}, Landroidx/navigation/NavGraphBuilderKt__NavGraphBuilderKt;->navigation(Landroidx/navigation/NavigatorProvider;Ljava/lang/String;Ljava/lang/String;Lr6/c;)Landroidx/navigation/NavGraph;

    move-result-object p0

    return-object p0
.end method

.method public static final navigation(Landroidx/navigation/NavigatorProvider;Ly6/c;Ly6/c;Ljava/util/Map;Lr6/c;)Landroidx/navigation/NavGraph;
    .locals 0
    .param p0    # Landroidx/navigation/NavigatorProvider;
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
            "Landroidx/navigation/NavigatorProvider;",
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
    invoke-static {p0, p1, p2, p3, p4}, Landroidx/navigation/NavGraphBuilderKt__NavGraphBuilderKt;->navigation(Landroidx/navigation/NavigatorProvider;Ly6/c;Ly6/c;Ljava/util/Map;Lr6/c;)Landroidx/navigation/NavGraph;

    move-result-object p0

    return-object p0
.end method

.method public static final navigation(Landroidx/navigation/NavGraphBuilder;IILr6/c;)V
    .locals 0
    .param p0    # Landroidx/navigation/NavGraphBuilder;
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
            "Landroidx/navigation/NavGraphBuilder;",
            "II",
            "Lr6/c;",
            ")V"
        }
    .end annotation

    .annotation runtime Lkotlin/Deprecated;
        message = "Use routes to build your nested NavGraph instead"
        replaceWith = .subannotation Lkotlin/ReplaceWith;
            expression = "navigation(startDestination = startDestination.toString(), route = id.toString()) { builder.invoke() }"
            imports = {}
        .end subannotation
    .end annotation

    .line 5
    invoke-static {p0, p1, p2, p3}, Landroidx/navigation/NavGraphBuilderKt__NavGraphBuilder_androidKt;->navigation(Landroidx/navigation/NavGraphBuilder;IILr6/c;)V

    return-void
.end method

.method public static final synthetic navigation(Landroidx/navigation/NavGraphBuilder;Ljava/lang/Object;Ljava/util/Map;Lr6/c;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Landroidx/navigation/NavGraphBuilder;",
            "Ljava/lang/Object;",
            "Ljava/util/Map<",
            "Ly6/q;",
            "Landroidx/navigation/NavType<",
            "*>;>;",
            "Lr6/c;",
            ")V"
        }
    .end annotation

    .line 6
    invoke-static {p0, p1, p2, p3}, Landroidx/navigation/NavGraphBuilderKt__NavGraphBuilderKt;->navigation(Landroidx/navigation/NavGraphBuilder;Ljava/lang/Object;Ljava/util/Map;Lr6/c;)V

    return-void
.end method

.method public static final navigation(Landroidx/navigation/NavGraphBuilder;Ljava/lang/String;Ljava/lang/String;Lr6/c;)V
    .locals 0
    .param p0    # Landroidx/navigation/NavGraphBuilder;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Lr6/c;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/navigation/NavGraphBuilder;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lr6/c;",
            ")V"
        }
    .end annotation

    .line 7
    invoke-static {p0, p1, p2, p3}, Landroidx/navigation/NavGraphBuilderKt__NavGraphBuilderKt;->navigation(Landroidx/navigation/NavGraphBuilder;Ljava/lang/String;Ljava/lang/String;Lr6/c;)V

    return-void
.end method

.method public static final navigation(Landroidx/navigation/NavGraphBuilder;Ly6/c;Ljava/lang/Object;Ljava/util/Map;Lr6/c;)V
    .locals 0
    .param p0    # Landroidx/navigation/NavGraphBuilder;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p1    # Ly6/c;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Ljava/lang/Object;
        .annotation build Lorg/jetbrains/annotations/NotNull;
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
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Landroidx/navigation/NavGraphBuilder;",
            "Ly6/c;",
            "Ljava/lang/Object;",
            "Ljava/util/Map<",
            "Ly6/q;",
            "Landroidx/navigation/NavType<",
            "*>;>;",
            "Lr6/c;",
            ")V"
        }
    .end annotation

    .line 8
    invoke-static {p0, p1, p2, p3, p4}, Landroidx/navigation/NavGraphBuilderKt__NavGraphBuilderKt;->navigation(Landroidx/navigation/NavGraphBuilder;Ly6/c;Ljava/lang/Object;Ljava/util/Map;Lr6/c;)V

    return-void
.end method

.method public static final synthetic navigation(Landroidx/navigation/NavGraphBuilder;Ly6/c;Ljava/util/Map;Lr6/c;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Landroidx/navigation/NavGraphBuilder;",
            "Ly6/c;",
            "Ljava/util/Map<",
            "Ly6/q;",
            "Landroidx/navigation/NavType<",
            "*>;>;",
            "Lr6/c;",
            ")V"
        }
    .end annotation

    .line 9
    invoke-static {p0, p1, p2, p3}, Landroidx/navigation/NavGraphBuilderKt__NavGraphBuilderKt;->navigation(Landroidx/navigation/NavGraphBuilder;Ly6/c;Ljava/util/Map;Lr6/c;)V

    return-void
.end method

.method public static final navigation(Landroidx/navigation/NavGraphBuilder;Ly6/c;Ly6/c;Ljava/util/Map;Lr6/c;)V
    .locals 0
    .param p0    # Landroidx/navigation/NavGraphBuilder;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p1    # Ly6/c;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Ly6/c;
        .annotation build Lorg/jetbrains/annotations/NotNull;
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
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Landroidx/navigation/NavGraphBuilder;",
            "Ly6/c;",
            "Ly6/c;",
            "Ljava/util/Map<",
            "Ly6/q;",
            "Landroidx/navigation/NavType<",
            "*>;>;",
            "Lr6/c;",
            ")V"
        }
    .end annotation

    .line 10
    invoke-static {p0, p1, p2, p3, p4}, Landroidx/navigation/NavGraphBuilderKt__NavGraphBuilderKt;->navigation(Landroidx/navigation/NavGraphBuilder;Ly6/c;Ly6/c;Ljava/util/Map;Lr6/c;)V

    return-void
.end method

.method public static synthetic navigation$default(Landroidx/navigation/NavigatorProvider;IILr6/c;ILjava/lang/Object;)Landroidx/navigation/NavGraph;
    .locals 0

    .line 1
    invoke-static/range {p0 .. p5}, Landroidx/navigation/NavGraphBuilderKt__NavGraphBuilder_androidKt;->navigation$default(Landroidx/navigation/NavigatorProvider;IILr6/c;ILjava/lang/Object;)Landroidx/navigation/NavGraph;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic navigation$default(Landroidx/navigation/NavigatorProvider;Ljava/lang/Object;Ly6/c;Ljava/util/Map;Lr6/c;ILjava/lang/Object;)Landroidx/navigation/NavGraph;
    .locals 0

    .line 2
    invoke-static/range {p0 .. p6}, Landroidx/navigation/NavGraphBuilderKt__NavGraphBuilderKt;->navigation$default(Landroidx/navigation/NavigatorProvider;Ljava/lang/Object;Ly6/c;Ljava/util/Map;Lr6/c;ILjava/lang/Object;)Landroidx/navigation/NavGraph;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic navigation$default(Landroidx/navigation/NavigatorProvider;Ljava/lang/String;Ljava/lang/String;Lr6/c;ILjava/lang/Object;)Landroidx/navigation/NavGraph;
    .locals 0

    .line 3
    invoke-static/range {p0 .. p5}, Landroidx/navigation/NavGraphBuilderKt__NavGraphBuilderKt;->navigation$default(Landroidx/navigation/NavigatorProvider;Ljava/lang/String;Ljava/lang/String;Lr6/c;ILjava/lang/Object;)Landroidx/navigation/NavGraph;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic navigation$default(Landroidx/navigation/NavigatorProvider;Ly6/c;Ly6/c;Ljava/util/Map;Lr6/c;ILjava/lang/Object;)Landroidx/navigation/NavGraph;
    .locals 0

    .line 4
    invoke-static/range {p0 .. p6}, Landroidx/navigation/NavGraphBuilderKt__NavGraphBuilderKt;->navigation$default(Landroidx/navigation/NavigatorProvider;Ly6/c;Ly6/c;Ljava/util/Map;Lr6/c;ILjava/lang/Object;)Landroidx/navigation/NavGraph;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic navigation$default(Landroidx/navigation/NavGraphBuilder;Ljava/lang/Object;Ljava/util/Map;Lr6/c;ILjava/lang/Object;)V
    .locals 0

    .line 5
    invoke-static/range {p0 .. p5}, Landroidx/navigation/NavGraphBuilderKt__NavGraphBuilderKt;->navigation$default(Landroidx/navigation/NavGraphBuilder;Ljava/lang/Object;Ljava/util/Map;Lr6/c;ILjava/lang/Object;)V

    return-void
.end method

.method public static synthetic navigation$default(Landroidx/navigation/NavGraphBuilder;Ly6/c;Ljava/lang/Object;Ljava/util/Map;Lr6/c;ILjava/lang/Object;)V
    .locals 0

    .line 6
    invoke-static/range {p0 .. p6}, Landroidx/navigation/NavGraphBuilderKt__NavGraphBuilderKt;->navigation$default(Landroidx/navigation/NavGraphBuilder;Ly6/c;Ljava/lang/Object;Ljava/util/Map;Lr6/c;ILjava/lang/Object;)V

    return-void
.end method

.method public static synthetic navigation$default(Landroidx/navigation/NavGraphBuilder;Ly6/c;Ljava/util/Map;Lr6/c;ILjava/lang/Object;)V
    .locals 0

    .line 7
    invoke-static/range {p0 .. p5}, Landroidx/navigation/NavGraphBuilderKt__NavGraphBuilderKt;->navigation$default(Landroidx/navigation/NavGraphBuilder;Ly6/c;Ljava/util/Map;Lr6/c;ILjava/lang/Object;)V

    return-void
.end method

.method public static synthetic navigation$default(Landroidx/navigation/NavGraphBuilder;Ly6/c;Ly6/c;Ljava/util/Map;Lr6/c;ILjava/lang/Object;)V
    .locals 0

    .line 8
    invoke-static/range {p0 .. p6}, Landroidx/navigation/NavGraphBuilderKt__NavGraphBuilderKt;->navigation$default(Landroidx/navigation/NavGraphBuilder;Ly6/c;Ly6/c;Ljava/util/Map;Lr6/c;ILjava/lang/Object;)V

    return-void
.end method
