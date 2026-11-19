.class public final Landroidx/navigation/compose/NavGraphBuilderKt;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final composable(Landroidx/navigation/NavGraphBuilder;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Lhd/l;Lhd/l;Lhd/l;Lhd/l;Lhd/l;Lhd/r;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/navigation/NavGraphBuilder;",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Landroidx/navigation/NamedNavArgument;",
            ">;",
            "Ljava/util/List<",
            "Landroidx/navigation/NavDeepLink;",
            ">;",
            "Lhd/l;",
            "Lhd/l;",
            "Lhd/l;",
            "Lhd/l;",
            "Lhd/l;",
            "Lhd/r;",
            ")V"
        }
    .end annotation

    .line 26
    new-instance v0, Landroidx/navigation/compose/ComposeNavigatorDestinationBuilder;

    invoke-virtual {p0}, Landroidx/navigation/NavGraphBuilder;->getProvider()Landroidx/navigation/NavigatorProvider;

    move-result-object v1

    const-class v2, Landroidx/navigation/compose/ComposeNavigator;

    .line 27
    invoke-virtual {v1, v2}, Landroidx/navigation/NavigatorProvider;->getNavigator(Ljava/lang/Class;)Landroidx/navigation/Navigator;

    move-result-object v1

    check-cast v1, Landroidx/navigation/compose/ComposeNavigator;

    .line 28
    invoke-direct {v0, v1, p1, p9}, Landroidx/navigation/compose/ComposeNavigatorDestinationBuilder;-><init>(Landroidx/navigation/compose/ComposeNavigator;Ljava/lang/String;Lhd/r;)V

    .line 29
    check-cast p2, Ljava/lang/Iterable;

    .line 30
    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p2

    if-eqz p2, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Landroidx/navigation/NamedNavArgument;

    invoke-virtual {p2}, Landroidx/navigation/NamedNavArgument;->component1()Ljava/lang/String;

    move-result-object p9

    invoke-virtual {p2}, Landroidx/navigation/NamedNavArgument;->component2()Landroidx/navigation/NavArgument;

    move-result-object p2

    .line 31
    invoke-virtual {v0, p9, p2}, Landroidx/navigation/NavDestinationBuilder;->argument(Ljava/lang/String;Landroidx/navigation/NavArgument;)V

    goto :goto_0

    .line 32
    :cond_0
    check-cast p3, Ljava/lang/Iterable;

    .line 33
    invoke-interface {p3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p2

    if-eqz p2, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Landroidx/navigation/NavDeepLink;

    .line 34
    invoke-virtual {v0, p2}, Landroidx/navigation/NavDestinationBuilder;->deepLink(Landroidx/navigation/NavDeepLink;)V

    goto :goto_1

    .line 35
    :cond_1
    invoke-virtual {v0, p4}, Landroidx/navigation/compose/ComposeNavigatorDestinationBuilder;->setEnterTransition(Lhd/l;)V

    .line 36
    invoke-virtual {v0, p5}, Landroidx/navigation/compose/ComposeNavigatorDestinationBuilder;->setExitTransition(Lhd/l;)V

    .line 37
    invoke-virtual {v0, p6}, Landroidx/navigation/compose/ComposeNavigatorDestinationBuilder;->setPopEnterTransition(Lhd/l;)V

    .line 38
    invoke-virtual {v0, p7}, Landroidx/navigation/compose/ComposeNavigatorDestinationBuilder;->setPopExitTransition(Lhd/l;)V

    .line 39
    invoke-virtual {v0, p8}, Landroidx/navigation/compose/ComposeNavigatorDestinationBuilder;->setSizeTransform(Lhd/l;)V

    .line 40
    invoke-virtual {p0, v0}, Landroidx/navigation/NavGraphBuilder;->destination(Landroidx/navigation/NavDestinationBuilder;)V

    return-void
.end method

.method public static final synthetic composable(Landroidx/navigation/NavGraphBuilder;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Lhd/l;Lhd/l;Lhd/l;Lhd/l;Lhd/r;)V
    .locals 3
    .annotation runtime Lqc/a;
    .end annotation

    .line 12
    new-instance v0, Landroidx/navigation/compose/ComposeNavigatorDestinationBuilder;

    invoke-virtual {p0}, Landroidx/navigation/NavGraphBuilder;->getProvider()Landroidx/navigation/NavigatorProvider;

    move-result-object v1

    const-class v2, Landroidx/navigation/compose/ComposeNavigator;

    .line 13
    invoke-virtual {v1, v2}, Landroidx/navigation/NavigatorProvider;->getNavigator(Ljava/lang/Class;)Landroidx/navigation/Navigator;

    move-result-object v1

    check-cast v1, Landroidx/navigation/compose/ComposeNavigator;

    .line 14
    invoke-direct {v0, v1, p1, p8}, Landroidx/navigation/compose/ComposeNavigatorDestinationBuilder;-><init>(Landroidx/navigation/compose/ComposeNavigator;Ljava/lang/String;Lhd/r;)V

    .line 15
    check-cast p2, Ljava/lang/Iterable;

    .line 16
    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p2

    if-eqz p2, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Landroidx/navigation/NamedNavArgument;

    invoke-virtual {p2}, Landroidx/navigation/NamedNavArgument;->component1()Ljava/lang/String;

    move-result-object p8

    invoke-virtual {p2}, Landroidx/navigation/NamedNavArgument;->component2()Landroidx/navigation/NavArgument;

    move-result-object p2

    .line 17
    invoke-virtual {v0, p8, p2}, Landroidx/navigation/NavDestinationBuilder;->argument(Ljava/lang/String;Landroidx/navigation/NavArgument;)V

    goto :goto_0

    .line 18
    :cond_0
    check-cast p3, Ljava/lang/Iterable;

    .line 19
    invoke-interface {p3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p2

    if-eqz p2, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Landroidx/navigation/NavDeepLink;

    .line 20
    invoke-virtual {v0, p2}, Landroidx/navigation/NavDestinationBuilder;->deepLink(Landroidx/navigation/NavDeepLink;)V

    goto :goto_1

    .line 21
    :cond_1
    invoke-virtual {v0, p4}, Landroidx/navigation/compose/ComposeNavigatorDestinationBuilder;->setEnterTransition(Lhd/l;)V

    .line 22
    invoke-virtual {v0, p5}, Landroidx/navigation/compose/ComposeNavigatorDestinationBuilder;->setExitTransition(Lhd/l;)V

    .line 23
    invoke-virtual {v0, p6}, Landroidx/navigation/compose/ComposeNavigatorDestinationBuilder;->setPopEnterTransition(Lhd/l;)V

    .line 24
    invoke-virtual {v0, p7}, Landroidx/navigation/compose/ComposeNavigatorDestinationBuilder;->setPopExitTransition(Lhd/l;)V

    .line 25
    invoke-virtual {p0, v0}, Landroidx/navigation/NavGraphBuilder;->destination(Landroidx/navigation/NavDestinationBuilder;)V

    return-void
.end method

.method public static final synthetic composable(Landroidx/navigation/NavGraphBuilder;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Lhd/q;)V
    .locals 4
    .annotation runtime Lqc/a;
    .end annotation

    .line 1
    new-instance v0, Landroidx/navigation/compose/ComposeNavigator$Destination;

    invoke-virtual {p0}, Landroidx/navigation/NavGraphBuilder;->getProvider()Landroidx/navigation/NavigatorProvider;

    move-result-object v1

    const-class v2, Landroidx/navigation/compose/ComposeNavigator;

    .line 2
    invoke-virtual {v1, v2}, Landroidx/navigation/NavigatorProvider;->getNavigator(Ljava/lang/Class;)Landroidx/navigation/Navigator;

    move-result-object v1

    check-cast v1, Landroidx/navigation/compose/ComposeNavigator;

    .line 3
    new-instance v2, Landroidx/navigation/compose/NavGraphBuilderKt$composable$1;

    invoke-direct {v2, p4}, Landroidx/navigation/compose/NavGraphBuilderKt$composable$1;-><init>(Lhd/q;)V

    const p4, -0x5a6902e9

    const/4 v3, 0x1

    invoke-static {p4, v3, v2}, Landroidx/compose/runtime/internal/ComposableLambdaKt;->composableLambdaInstance(IZLjava/lang/Object;)Landroidx/compose/runtime/internal/ComposableLambda;

    move-result-object p4

    invoke-direct {v0, v1, p4}, Landroidx/navigation/compose/ComposeNavigator$Destination;-><init>(Landroidx/navigation/compose/ComposeNavigator;Lhd/r;)V

    .line 4
    invoke-virtual {v0, p1}, Landroidx/navigation/NavDestination;->setRoute(Ljava/lang/String;)V

    .line 5
    check-cast p2, Ljava/lang/Iterable;

    .line 6
    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p2

    if-eqz p2, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Landroidx/navigation/NamedNavArgument;

    invoke-virtual {p2}, Landroidx/navigation/NamedNavArgument;->component1()Ljava/lang/String;

    move-result-object p4

    invoke-virtual {p2}, Landroidx/navigation/NamedNavArgument;->component2()Landroidx/navigation/NavArgument;

    move-result-object p2

    .line 7
    invoke-virtual {v0, p4, p2}, Landroidx/navigation/NavDestination;->addArgument(Ljava/lang/String;Landroidx/navigation/NavArgument;)V

    goto :goto_0

    .line 8
    :cond_0
    check-cast p3, Ljava/lang/Iterable;

    .line 9
    invoke-interface {p3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p2

    if-eqz p2, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Landroidx/navigation/NavDeepLink;

    .line 10
    invoke-virtual {v0, p2}, Landroidx/navigation/NavDestination;->addDeepLink(Landroidx/navigation/NavDeepLink;)V

    goto :goto_1

    .line 11
    :cond_1
    invoke-virtual {p0, v0}, Landroidx/navigation/NavGraphBuilder;->addDestination(Landroidx/navigation/NavDestination;)V

    return-void
.end method

.method public static final synthetic composable(Landroidx/navigation/NavGraphBuilder;Ljava/util/Map;Ljava/util/List;Lhd/l;Lhd/l;Lhd/l;Lhd/l;Lhd/l;Lhd/r;)V
    .locals 11
    .annotation build Landroidx/compose/runtime/ComposableInferredTarget;
        scheme = "[0[0]]"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Landroidx/navigation/NavGraphBuilder;",
            "Ljava/util/Map<",
            "Lod/o;",
            "Landroidx/navigation/NavType<",
            "*>;>;",
            "Ljava/util/List<",
            "Landroidx/navigation/NavDeepLink;",
            ">;",
            "Lhd/l;",
            "Lhd/l;",
            "Lhd/l;",
            "Lhd/l;",
            "Lhd/l;",
            "Lhd/r;",
            ")V"
        }
    .end annotation

    const/4 v0, 0x4

    .line 41
    const-string v1, "T"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/u;->m(ILjava/lang/String;)V

    const-class v0, Ljava/lang/Object;

    invoke-static {v0}, Lkotlin/jvm/internal/y;->b(Ljava/lang/Class;)Lod/c;

    move-result-object v2

    move-object v1, p0

    move-object v3, p1

    move-object v4, p2

    move-object v5, p3

    move-object v6, p4

    move-object/from16 v7, p5

    move-object/from16 v8, p6

    move-object/from16 v9, p7

    move-object/from16 v10, p8

    invoke-static/range {v1 .. v10}, Landroidx/navigation/compose/NavGraphBuilderKt;->composable(Landroidx/navigation/NavGraphBuilder;Lod/c;Ljava/util/Map;Ljava/util/List;Lhd/l;Lhd/l;Lhd/l;Lhd/l;Lhd/l;Lhd/r;)V

    return-void
.end method

.method public static final composable(Landroidx/navigation/NavGraphBuilder;Lod/c;Ljava/util/Map;Ljava/util/List;Lhd/l;Lhd/l;Lhd/l;Lhd/l;Lhd/l;Lhd/r;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Landroidx/navigation/NavGraphBuilder;",
            "Lod/c;",
            "Ljava/util/Map<",
            "Lod/o;",
            "Landroidx/navigation/NavType<",
            "*>;>;",
            "Ljava/util/List<",
            "Landroidx/navigation/NavDeepLink;",
            ">;",
            "Lhd/l;",
            "Lhd/l;",
            "Lhd/l;",
            "Lhd/l;",
            "Lhd/l;",
            "Lhd/r;",
            ")V"
        }
    .end annotation

    .line 42
    new-instance v0, Landroidx/navigation/compose/ComposeNavigatorDestinationBuilder;

    .line 43
    invoke-virtual {p0}, Landroidx/navigation/NavGraphBuilder;->getProvider()Landroidx/navigation/NavigatorProvider;

    move-result-object v1

    const-class v2, Landroidx/navigation/compose/ComposeNavigator;

    .line 44
    invoke-virtual {v1, v2}, Landroidx/navigation/NavigatorProvider;->getNavigator(Ljava/lang/Class;)Landroidx/navigation/Navigator;

    move-result-object v1

    check-cast v1, Landroidx/navigation/compose/ComposeNavigator;

    .line 45
    invoke-direct {v0, v1, p1, p2, p9}, Landroidx/navigation/compose/ComposeNavigatorDestinationBuilder;-><init>(Landroidx/navigation/compose/ComposeNavigator;Lod/c;Ljava/util/Map;Lhd/r;)V

    .line 46
    check-cast p3, Ljava/lang/Iterable;

    .line 47
    invoke-interface {p3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p2

    if-eqz p2, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Landroidx/navigation/NavDeepLink;

    .line 48
    invoke-virtual {v0, p2}, Landroidx/navigation/NavDestinationBuilder;->deepLink(Landroidx/navigation/NavDeepLink;)V

    goto :goto_0

    .line 49
    :cond_0
    invoke-virtual {v0, p4}, Landroidx/navigation/compose/ComposeNavigatorDestinationBuilder;->setEnterTransition(Lhd/l;)V

    .line 50
    invoke-virtual {v0, p5}, Landroidx/navigation/compose/ComposeNavigatorDestinationBuilder;->setExitTransition(Lhd/l;)V

    .line 51
    invoke-virtual {v0, p6}, Landroidx/navigation/compose/ComposeNavigatorDestinationBuilder;->setPopEnterTransition(Lhd/l;)V

    .line 52
    invoke-virtual {v0, p7}, Landroidx/navigation/compose/ComposeNavigatorDestinationBuilder;->setPopExitTransition(Lhd/l;)V

    .line 53
    invoke-virtual {v0, p8}, Landroidx/navigation/compose/ComposeNavigatorDestinationBuilder;->setSizeTransform(Lhd/l;)V

    .line 54
    invoke-virtual {p0, v0}, Landroidx/navigation/NavGraphBuilder;->destination(Landroidx/navigation/NavDestinationBuilder;)V

    return-void
.end method

.method public static synthetic composable$default(Landroidx/navigation/NavGraphBuilder;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Lhd/l;Lhd/l;Lhd/l;Lhd/l;Lhd/l;Lhd/r;ILjava/lang/Object;)V
    .locals 10

    move/from16 v0, p10

    and-int/lit8 v1, v0, 0x2

    if-eqz v1, :cond_0

    .line 7
    invoke-static {}, Lrc/w;->n()Ljava/util/List;

    move-result-object p2

    :cond_0
    move-object v2, p2

    and-int/lit8 p2, v0, 0x4

    if-eqz p2, :cond_1

    .line 8
    invoke-static {}, Lrc/w;->n()Ljava/util/List;

    move-result-object p3

    :cond_1
    move-object v3, p3

    and-int/lit8 p2, v0, 0x8

    const/4 p3, 0x0

    if-eqz p2, :cond_2

    move-object v4, p3

    goto :goto_0

    :cond_2
    move-object v4, p4

    :goto_0
    and-int/lit8 p2, v0, 0x10

    if-eqz p2, :cond_3

    move-object v5, p3

    goto :goto_1

    :cond_3
    move-object v5, p5

    :goto_1
    and-int/lit8 p2, v0, 0x20

    if-eqz p2, :cond_4

    move-object v6, v4

    goto :goto_2

    :cond_4
    move-object/from16 v6, p6

    :goto_2
    and-int/lit8 p2, v0, 0x40

    if-eqz p2, :cond_5

    move-object v7, v5

    goto :goto_3

    :cond_5
    move-object/from16 v7, p7

    :goto_3
    and-int/lit16 p2, v0, 0x80

    if-eqz p2, :cond_6

    move-object v8, p3

    :goto_4
    move-object v0, p0

    move-object v1, p1

    move-object/from16 v9, p9

    goto :goto_5

    :cond_6
    move-object/from16 v8, p8

    goto :goto_4

    .line 9
    :goto_5
    invoke-static/range {v0 .. v9}, Landroidx/navigation/compose/NavGraphBuilderKt;->composable(Landroidx/navigation/NavGraphBuilder;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Lhd/l;Lhd/l;Lhd/l;Lhd/l;Lhd/l;Lhd/r;)V

    return-void
.end method

.method public static synthetic composable$default(Landroidx/navigation/NavGraphBuilder;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Lhd/l;Lhd/l;Lhd/l;Lhd/l;Lhd/r;ILjava/lang/Object;)V
    .locals 9

    and-int/lit8 v0, p9, 0x2

    if-eqz v0, :cond_0

    .line 4
    invoke-static {}, Lrc/w;->n()Ljava/util/List;

    move-result-object p2

    :cond_0
    move-object v2, p2

    and-int/lit8 p2, p9, 0x4

    if-eqz p2, :cond_1

    .line 5
    invoke-static {}, Lrc/w;->n()Ljava/util/List;

    move-result-object p3

    :cond_1
    move-object v3, p3

    and-int/lit8 p2, p9, 0x8

    const/4 p3, 0x0

    if-eqz p2, :cond_2

    move-object v4, p3

    goto :goto_0

    :cond_2
    move-object v4, p4

    :goto_0
    and-int/lit8 p2, p9, 0x10

    if-eqz p2, :cond_3

    move-object v5, p3

    goto :goto_1

    :cond_3
    move-object v5, p5

    :goto_1
    and-int/lit8 p2, p9, 0x20

    if-eqz p2, :cond_4

    move-object v6, v4

    goto :goto_2

    :cond_4
    move-object v6, p6

    :goto_2
    and-int/lit8 p2, p9, 0x40

    if-eqz p2, :cond_5

    move-object v7, v5

    :goto_3
    move-object v0, p0

    move-object v1, p1

    move-object/from16 v8, p8

    goto :goto_4

    :cond_5
    move-object/from16 v7, p7

    goto :goto_3

    .line 6
    :goto_4
    invoke-static/range {v0 .. v8}, Landroidx/navigation/compose/NavGraphBuilderKt;->composable(Landroidx/navigation/NavGraphBuilder;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Lhd/l;Lhd/l;Lhd/l;Lhd/l;Lhd/r;)V

    return-void
.end method

.method public static synthetic composable$default(Landroidx/navigation/NavGraphBuilder;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Lhd/q;ILjava/lang/Object;)V
    .locals 0

    and-int/lit8 p6, p5, 0x2

    if-eqz p6, :cond_0

    .line 1
    invoke-static {}, Lrc/w;->n()Ljava/util/List;

    move-result-object p2

    :cond_0
    and-int/lit8 p5, p5, 0x4

    if-eqz p5, :cond_1

    .line 2
    invoke-static {}, Lrc/w;->n()Ljava/util/List;

    move-result-object p3

    .line 3
    :cond_1
    invoke-static {p0, p1, p2, p3, p4}, Landroidx/navigation/compose/NavGraphBuilderKt;->composable(Landroidx/navigation/NavGraphBuilder;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Lhd/q;)V

    return-void
.end method

.method public static synthetic composable$default(Landroidx/navigation/NavGraphBuilder;Ljava/util/Map;Ljava/util/List;Lhd/l;Lhd/l;Lhd/l;Lhd/l;Lhd/l;Lhd/r;ILjava/lang/Object;)V
    .locals 10

    and-int/lit8 v0, p9, 0x1

    if-eqz v0, :cond_0

    .line 10
    invoke-static {}, Lkotlin/collections/a;->h()Ljava/util/Map;

    move-result-object p1

    :cond_0
    move-object v2, p1

    and-int/lit8 p1, p9, 0x2

    if-eqz p1, :cond_1

    .line 11
    invoke-static {}, Lrc/w;->n()Ljava/util/List;

    move-result-object p2

    :cond_1
    move-object v3, p2

    and-int/lit8 p1, p9, 0x4

    const/4 p2, 0x0

    if-eqz p1, :cond_2

    move-object v4, p2

    goto :goto_0

    :cond_2
    move-object v4, p3

    :goto_0
    and-int/lit8 p1, p9, 0x8

    if-eqz p1, :cond_3

    move-object v5, p2

    goto :goto_1

    :cond_3
    move-object v5, p4

    :goto_1
    and-int/lit8 p1, p9, 0x10

    if-eqz p1, :cond_4

    move-object v6, v4

    goto :goto_2

    :cond_4
    move-object v6, p5

    :goto_2
    and-int/lit8 p1, p9, 0x20

    if-eqz p1, :cond_5

    move-object v7, v5

    goto :goto_3

    :cond_5
    move-object/from16 v7, p6

    :goto_3
    and-int/lit8 p1, p9, 0x40

    if-eqz p1, :cond_6

    move-object v8, p2

    goto :goto_4

    :cond_6
    move-object/from16 v8, p7

    .line 12
    :goto_4
    const-string p1, "T"

    const/4 p2, 0x4

    invoke-static {p2, p1}, Lkotlin/jvm/internal/u;->m(ILjava/lang/String;)V

    const-class p1, Ljava/lang/Object;

    invoke-static {p1}, Lkotlin/jvm/internal/y;->b(Ljava/lang/Class;)Lod/c;

    move-result-object v1

    move-object v0, p0

    move-object/from16 v9, p8

    invoke-static/range {v0 .. v9}, Landroidx/navigation/compose/NavGraphBuilderKt;->composable(Landroidx/navigation/NavGraphBuilder;Lod/c;Ljava/util/Map;Ljava/util/List;Lhd/l;Lhd/l;Lhd/l;Lhd/l;Lhd/l;Lhd/r;)V

    return-void
.end method

.method public static synthetic composable$default(Landroidx/navigation/NavGraphBuilder;Lod/c;Ljava/util/Map;Ljava/util/List;Lhd/l;Lhd/l;Lhd/l;Lhd/l;Lhd/l;Lhd/r;ILjava/lang/Object;)V
    .locals 10

    move/from16 v0, p10

    and-int/lit8 v1, v0, 0x2

    if-eqz v1, :cond_0

    .line 13
    invoke-static {}, Lkotlin/collections/a;->h()Ljava/util/Map;

    move-result-object p2

    :cond_0
    move-object v2, p2

    and-int/lit8 p2, v0, 0x4

    if-eqz p2, :cond_1

    .line 14
    invoke-static {}, Lrc/w;->n()Ljava/util/List;

    move-result-object p3

    :cond_1
    move-object v3, p3

    and-int/lit8 p2, v0, 0x8

    const/4 p3, 0x0

    if-eqz p2, :cond_2

    move-object v4, p3

    goto :goto_0

    :cond_2
    move-object v4, p4

    :goto_0
    and-int/lit8 p2, v0, 0x10

    if-eqz p2, :cond_3

    move-object v5, p3

    goto :goto_1

    :cond_3
    move-object v5, p5

    :goto_1
    and-int/lit8 p2, v0, 0x20

    if-eqz p2, :cond_4

    move-object v6, v4

    goto :goto_2

    :cond_4
    move-object/from16 v6, p6

    :goto_2
    and-int/lit8 p2, v0, 0x40

    if-eqz p2, :cond_5

    move-object v7, v5

    goto :goto_3

    :cond_5
    move-object/from16 v7, p7

    :goto_3
    and-int/lit16 p2, v0, 0x80

    if-eqz p2, :cond_6

    move-object v8, p3

    :goto_4
    move-object v0, p0

    move-object v1, p1

    move-object/from16 v9, p9

    goto :goto_5

    :cond_6
    move-object/from16 v8, p8

    goto :goto_4

    .line 15
    :goto_5
    invoke-static/range {v0 .. v9}, Landroidx/navigation/compose/NavGraphBuilderKt;->composable(Landroidx/navigation/NavGraphBuilder;Lod/c;Ljava/util/Map;Ljava/util/List;Lhd/l;Lhd/l;Lhd/l;Lhd/l;Lhd/l;Lhd/r;)V

    return-void
.end method

.method public static final dialog(Landroidx/navigation/NavGraphBuilder;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Landroidx/compose/ui/window/DialogProperties;Lhd/q;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/navigation/NavGraphBuilder;",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Landroidx/navigation/NamedNavArgument;",
            ">;",
            "Ljava/util/List<",
            "Landroidx/navigation/NavDeepLink;",
            ">;",
            "Landroidx/compose/ui/window/DialogProperties;",
            "Lhd/q;",
            ")V"
        }
    .end annotation

    .line 1
    new-instance v0, Landroidx/navigation/compose/DialogNavigatorDestinationBuilder;

    .line 2
    invoke-virtual {p0}, Landroidx/navigation/NavGraphBuilder;->getProvider()Landroidx/navigation/NavigatorProvider;

    move-result-object v1

    const-class v2, Landroidx/navigation/compose/DialogNavigator;

    .line 3
    invoke-virtual {v1, v2}, Landroidx/navigation/NavigatorProvider;->getNavigator(Ljava/lang/Class;)Landroidx/navigation/Navigator;

    move-result-object v1

    check-cast v1, Landroidx/navigation/compose/DialogNavigator;

    .line 4
    invoke-direct {v0, v1, p1, p4, p5}, Landroidx/navigation/compose/DialogNavigatorDestinationBuilder;-><init>(Landroidx/navigation/compose/DialogNavigator;Ljava/lang/String;Landroidx/compose/ui/window/DialogProperties;Lhd/q;)V

    .line 5
    check-cast p2, Ljava/lang/Iterable;

    .line 6
    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p2

    if-eqz p2, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Landroidx/navigation/NamedNavArgument;

    invoke-virtual {p2}, Landroidx/navigation/NamedNavArgument;->component1()Ljava/lang/String;

    move-result-object p4

    invoke-virtual {p2}, Landroidx/navigation/NamedNavArgument;->component2()Landroidx/navigation/NavArgument;

    move-result-object p2

    .line 7
    invoke-virtual {v0, p4, p2}, Landroidx/navigation/NavDestinationBuilder;->argument(Ljava/lang/String;Landroidx/navigation/NavArgument;)V

    goto :goto_0

    .line 8
    :cond_0
    check-cast p3, Ljava/lang/Iterable;

    .line 9
    invoke-interface {p3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p2

    if-eqz p2, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Landroidx/navigation/NavDeepLink;

    .line 10
    invoke-virtual {v0, p2}, Landroidx/navigation/NavDestinationBuilder;->deepLink(Landroidx/navigation/NavDeepLink;)V

    goto :goto_1

    .line 11
    :cond_1
    invoke-virtual {p0, v0}, Landroidx/navigation/NavGraphBuilder;->destination(Landroidx/navigation/NavDestinationBuilder;)V

    return-void
.end method

.method public static final synthetic dialog(Landroidx/navigation/NavGraphBuilder;Ljava/util/Map;Ljava/util/List;Landroidx/compose/ui/window/DialogProperties;Lhd/q;)V
    .locals 7
    .annotation build Landroidx/compose/runtime/ComposableInferredTarget;
        scheme = "[0[0]]"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Landroidx/navigation/NavGraphBuilder;",
            "Ljava/util/Map<",
            "Lod/o;",
            "Landroidx/navigation/NavType<",
            "*>;>;",
            "Ljava/util/List<",
            "Landroidx/navigation/NavDeepLink;",
            ">;",
            "Landroidx/compose/ui/window/DialogProperties;",
            "Lhd/q;",
            ")V"
        }
    .end annotation

    const/4 v0, 0x4

    .line 12
    const-string v1, "T"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/u;->m(ILjava/lang/String;)V

    const-class v0, Ljava/lang/Object;

    invoke-static {v0}, Lkotlin/jvm/internal/y;->b(Ljava/lang/Class;)Lod/c;

    move-result-object v2

    move-object v1, p0

    move-object v3, p1

    move-object v4, p2

    move-object v5, p3

    move-object v6, p4

    invoke-static/range {v1 .. v6}, Landroidx/navigation/compose/NavGraphBuilderKt;->dialog(Landroidx/navigation/NavGraphBuilder;Lod/c;Ljava/util/Map;Ljava/util/List;Landroidx/compose/ui/window/DialogProperties;Lhd/q;)V

    return-void
.end method

.method public static final dialog(Landroidx/navigation/NavGraphBuilder;Lod/c;Ljava/util/Map;Ljava/util/List;Landroidx/compose/ui/window/DialogProperties;Lhd/q;)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Landroidx/navigation/NavGraphBuilder;",
            "Lod/c;",
            "Ljava/util/Map<",
            "Lod/o;",
            "Landroidx/navigation/NavType<",
            "*>;>;",
            "Ljava/util/List<",
            "Landroidx/navigation/NavDeepLink;",
            ">;",
            "Landroidx/compose/ui/window/DialogProperties;",
            "Lhd/q;",
            ")V"
        }
    .end annotation

    .line 13
    new-instance v0, Landroidx/navigation/compose/DialogNavigatorDestinationBuilder;

    .line 14
    invoke-virtual {p0}, Landroidx/navigation/NavGraphBuilder;->getProvider()Landroidx/navigation/NavigatorProvider;

    move-result-object v1

    const-class v2, Landroidx/navigation/compose/DialogNavigator;

    .line 15
    invoke-virtual {v1, v2}, Landroidx/navigation/NavigatorProvider;->getNavigator(Ljava/lang/Class;)Landroidx/navigation/Navigator;

    move-result-object v1

    check-cast v1, Landroidx/navigation/compose/DialogNavigator;

    move-object v2, p1

    move-object v3, p2

    move-object v4, p4

    move-object v5, p5

    .line 16
    invoke-direct/range {v0 .. v5}, Landroidx/navigation/compose/DialogNavigatorDestinationBuilder;-><init>(Landroidx/navigation/compose/DialogNavigator;Lod/c;Ljava/util/Map;Landroidx/compose/ui/window/DialogProperties;Lhd/q;)V

    .line 17
    check-cast p3, Ljava/lang/Iterable;

    .line 18
    invoke-interface {p3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p2

    if-eqz p2, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Landroidx/navigation/NavDeepLink;

    .line 19
    invoke-virtual {v0, p2}, Landroidx/navigation/NavDestinationBuilder;->deepLink(Landroidx/navigation/NavDeepLink;)V

    goto :goto_0

    .line 20
    :cond_0
    invoke-virtual {p0, v0}, Landroidx/navigation/NavGraphBuilder;->destination(Landroidx/navigation/NavDestinationBuilder;)V

    return-void
.end method

.method public static synthetic dialog$default(Landroidx/navigation/NavGraphBuilder;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Landroidx/compose/ui/window/DialogProperties;Lhd/q;ILjava/lang/Object;)V
    .locals 10

    and-int/lit8 v0, p6, 0x2

    if-eqz v0, :cond_0

    .line 1
    invoke-static {}, Lrc/w;->n()Ljava/util/List;

    move-result-object p2

    :cond_0
    move-object v2, p2

    and-int/lit8 p2, p6, 0x4

    if-eqz p2, :cond_1

    .line 2
    invoke-static {}, Lrc/w;->n()Ljava/util/List;

    move-result-object p3

    :cond_1
    move-object v3, p3

    and-int/lit8 p2, p6, 0x8

    if-eqz p2, :cond_2

    .line 3
    new-instance v4, Landroidx/compose/ui/window/DialogProperties;

    const/4 v8, 0x7

    const/4 v9, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-direct/range {v4 .. v9}, Landroidx/compose/ui/window/DialogProperties;-><init>(ZZZILkotlin/jvm/internal/n;)V

    :goto_0
    move-object v0, p0

    move-object v1, p1

    move-object v5, p5

    goto :goto_1

    :cond_2
    move-object v4, p4

    goto :goto_0

    .line 4
    :goto_1
    invoke-static/range {v0 .. v5}, Landroidx/navigation/compose/NavGraphBuilderKt;->dialog(Landroidx/navigation/NavGraphBuilder;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Landroidx/compose/ui/window/DialogProperties;Lhd/q;)V

    return-void
.end method

.method public static synthetic dialog$default(Landroidx/navigation/NavGraphBuilder;Ljava/util/Map;Ljava/util/List;Landroidx/compose/ui/window/DialogProperties;Lhd/q;ILjava/lang/Object;)V
    .locals 10

    and-int/lit8 v0, p5, 0x1

    if-eqz v0, :cond_0

    .line 5
    invoke-static {}, Lkotlin/collections/a;->h()Ljava/util/Map;

    move-result-object p1

    :cond_0
    move-object v2, p1

    and-int/lit8 p1, p5, 0x2

    if-eqz p1, :cond_1

    .line 6
    invoke-static {}, Lrc/w;->n()Ljava/util/List;

    move-result-object p2

    :cond_1
    move-object v3, p2

    const/4 p1, 0x4

    and-int/lit8 p2, p5, 0x4

    if-eqz p2, :cond_2

    .line 7
    new-instance v4, Landroidx/compose/ui/window/DialogProperties;

    const/4 v8, 0x7

    const/4 v9, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-direct/range {v4 .. v9}, Landroidx/compose/ui/window/DialogProperties;-><init>(ZZZILkotlin/jvm/internal/n;)V

    goto :goto_0

    :cond_2
    move-object v4, p3

    .line 8
    :goto_0
    const-string p2, "T"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/u;->m(ILjava/lang/String;)V

    const-class p1, Ljava/lang/Object;

    invoke-static {p1}, Lkotlin/jvm/internal/y;->b(Ljava/lang/Class;)Lod/c;

    move-result-object v1

    move-object v0, p0

    move-object v5, p4

    invoke-static/range {v0 .. v5}, Landroidx/navigation/compose/NavGraphBuilderKt;->dialog(Landroidx/navigation/NavGraphBuilder;Lod/c;Ljava/util/Map;Ljava/util/List;Landroidx/compose/ui/window/DialogProperties;Lhd/q;)V

    return-void
.end method

.method public static synthetic dialog$default(Landroidx/navigation/NavGraphBuilder;Lod/c;Ljava/util/Map;Ljava/util/List;Landroidx/compose/ui/window/DialogProperties;Lhd/q;ILjava/lang/Object;)V
    .locals 10

    and-int/lit8 v0, p6, 0x2

    if-eqz v0, :cond_0

    .line 9
    invoke-static {}, Lkotlin/collections/a;->h()Ljava/util/Map;

    move-result-object p2

    :cond_0
    move-object v2, p2

    and-int/lit8 p2, p6, 0x4

    if-eqz p2, :cond_1

    .line 10
    invoke-static {}, Lrc/w;->n()Ljava/util/List;

    move-result-object p3

    :cond_1
    move-object v3, p3

    and-int/lit8 p2, p6, 0x8

    if-eqz p2, :cond_2

    .line 11
    new-instance v4, Landroidx/compose/ui/window/DialogProperties;

    const/4 v8, 0x7

    const/4 v9, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-direct/range {v4 .. v9}, Landroidx/compose/ui/window/DialogProperties;-><init>(ZZZILkotlin/jvm/internal/n;)V

    :goto_0
    move-object v0, p0

    move-object v1, p1

    move-object v5, p5

    goto :goto_1

    :cond_2
    move-object v4, p4

    goto :goto_0

    .line 12
    :goto_1
    invoke-static/range {v0 .. v5}, Landroidx/navigation/compose/NavGraphBuilderKt;->dialog(Landroidx/navigation/NavGraphBuilder;Lod/c;Ljava/util/Map;Ljava/util/List;Landroidx/compose/ui/window/DialogProperties;Lhd/q;)V

    return-void
.end method

.method public static final synthetic navigation(Landroidx/navigation/NavGraphBuilder;Ljava/lang/Object;Ljava/util/Map;Ljava/util/List;Lhd/l;Lhd/l;Lhd/l;Lhd/l;Lhd/l;Lhd/l;)V
    .locals 12
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Landroidx/navigation/NavGraphBuilder;",
            "Ljava/lang/Object;",
            "Ljava/util/Map<",
            "Lod/o;",
            "Landroidx/navigation/NavType<",
            "*>;>;",
            "Ljava/util/List<",
            "Landroidx/navigation/NavDeepLink;",
            ">;",
            "Lhd/l;",
            "Lhd/l;",
            "Lhd/l;",
            "Lhd/l;",
            "Lhd/l;",
            "Lhd/l;",
            ")V"
        }
    .end annotation

    const/4 v0, 0x4

    .line 30
    const-string v1, "T"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/u;->m(ILjava/lang/String;)V

    const-class v0, Ljava/lang/Object;

    invoke-static {v0}, Lkotlin/jvm/internal/y;->b(Ljava/lang/Class;)Lod/c;

    move-result-object v3

    move-object v1, p0

    move-object v2, p1

    move-object v4, p2

    move-object v5, p3

    move-object/from16 v6, p4

    move-object/from16 v7, p5

    move-object/from16 v8, p6

    move-object/from16 v9, p7

    move-object/from16 v10, p8

    move-object/from16 v11, p9

    .line 31
    invoke-static/range {v1 .. v11}, Landroidx/navigation/compose/NavGraphBuilderKt;->navigation(Landroidx/navigation/NavGraphBuilder;Ljava/lang/Object;Lod/c;Ljava/util/Map;Ljava/util/List;Lhd/l;Lhd/l;Lhd/l;Lhd/l;Lhd/l;Lhd/l;)V

    return-void
.end method

.method public static final navigation(Landroidx/navigation/NavGraphBuilder;Ljava/lang/Object;Lod/c;Ljava/util/Map;Ljava/util/List;Lhd/l;Lhd/l;Lhd/l;Lhd/l;Lhd/l;Lhd/l;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Landroidx/navigation/NavGraphBuilder;",
            "Ljava/lang/Object;",
            "Lod/c;",
            "Ljava/util/Map<",
            "Lod/o;",
            "Landroidx/navigation/NavType<",
            "*>;>;",
            "Ljava/util/List<",
            "Landroidx/navigation/NavDeepLink;",
            ">;",
            "Lhd/l;",
            "Lhd/l;",
            "Lhd/l;",
            "Lhd/l;",
            "Lhd/l;",
            "Lhd/l;",
            ")V"
        }
    .end annotation

    .line 32
    new-instance v0, Landroidx/navigation/NavGraphBuilder;

    invoke-virtual {p0}, Landroidx/navigation/NavGraphBuilder;->getProvider()Landroidx/navigation/NavigatorProvider;

    move-result-object v1

    invoke-direct {v0, v1, p1, p2, p3}, Landroidx/navigation/NavGraphBuilder;-><init>(Landroidx/navigation/NavigatorProvider;Ljava/lang/Object;Lod/c;Ljava/util/Map;)V

    invoke-interface {p10, v0}, Lhd/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v0}, Landroidx/navigation/NavGraphBuilder;->build()Landroidx/navigation/NavGraph;

    move-result-object p1

    .line 33
    check-cast p4, Ljava/lang/Iterable;

    .line 34
    invoke-interface {p4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result p3

    if-eqz p3, :cond_0

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Landroidx/navigation/NavDeepLink;

    .line 35
    invoke-virtual {p1, p3}, Landroidx/navigation/NavDestination;->addDeepLink(Landroidx/navigation/NavDeepLink;)V

    goto :goto_0

    .line 36
    :cond_0
    instance-of p2, p1, Landroidx/navigation/compose/ComposeNavGraphNavigator$ComposeNavGraph;

    if-eqz p2, :cond_1

    .line 37
    move-object p2, p1

    check-cast p2, Landroidx/navigation/compose/ComposeNavGraphNavigator$ComposeNavGraph;

    invoke-virtual {p2, p5}, Landroidx/navigation/compose/ComposeNavGraphNavigator$ComposeNavGraph;->setEnterTransition$navigation_compose_release(Lhd/l;)V

    .line 38
    invoke-virtual {p2, p6}, Landroidx/navigation/compose/ComposeNavGraphNavigator$ComposeNavGraph;->setExitTransition$navigation_compose_release(Lhd/l;)V

    .line 39
    invoke-virtual {p2, p7}, Landroidx/navigation/compose/ComposeNavGraphNavigator$ComposeNavGraph;->setPopEnterTransition$navigation_compose_release(Lhd/l;)V

    .line 40
    invoke-virtual {p2, p8}, Landroidx/navigation/compose/ComposeNavGraphNavigator$ComposeNavGraph;->setPopExitTransition$navigation_compose_release(Lhd/l;)V

    .line 41
    invoke-virtual {p2, p9}, Landroidx/navigation/compose/ComposeNavGraphNavigator$ComposeNavGraph;->setSizeTransform$navigation_compose_release(Lhd/l;)V

    .line 42
    :cond_1
    invoke-virtual {p0, p1}, Landroidx/navigation/NavGraphBuilder;->addDestination(Landroidx/navigation/NavDestination;)V

    return-void
.end method

.method public static final synthetic navigation(Landroidx/navigation/NavGraphBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Lhd/l;)V
    .locals 11
    .annotation runtime Lqc/a;
    .end annotation

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    move-object/from16 v10, p5

    .line 1
    invoke-static/range {v0 .. v10}, Landroidx/navigation/compose/NavGraphBuilderKt;->navigation(Landroidx/navigation/NavGraphBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Lhd/l;Lhd/l;Lhd/l;Lhd/l;Lhd/l;Lhd/l;)V

    return-void
.end method

.method public static final synthetic navigation(Landroidx/navigation/NavGraphBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Lhd/l;Lhd/l;Lhd/l;Lhd/l;Lhd/l;)V
    .locals 11
    .annotation runtime Lqc/a;
    .end annotation

    const/4 v9, 0x0

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    move-object/from16 v5, p5

    move-object/from16 v6, p6

    move-object/from16 v7, p7

    move-object/from16 v8, p8

    move-object/from16 v10, p9

    .line 2
    invoke-static/range {v0 .. v10}, Landroidx/navigation/compose/NavGraphBuilderKt;->navigation(Landroidx/navigation/NavGraphBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Lhd/l;Lhd/l;Lhd/l;Lhd/l;Lhd/l;Lhd/l;)V

    return-void
.end method

.method public static final navigation(Landroidx/navigation/NavGraphBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Lhd/l;Lhd/l;Lhd/l;Lhd/l;Lhd/l;Lhd/l;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/navigation/NavGraphBuilder;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Landroidx/navigation/NamedNavArgument;",
            ">;",
            "Ljava/util/List<",
            "Landroidx/navigation/NavDeepLink;",
            ">;",
            "Lhd/l;",
            "Lhd/l;",
            "Lhd/l;",
            "Lhd/l;",
            "Lhd/l;",
            "Lhd/l;",
            ")V"
        }
    .end annotation

    .line 3
    new-instance v0, Landroidx/navigation/NavGraphBuilder;

    invoke-virtual {p0}, Landroidx/navigation/NavGraphBuilder;->getProvider()Landroidx/navigation/NavigatorProvider;

    move-result-object v1

    invoke-direct {v0, v1, p1, p2}, Landroidx/navigation/NavGraphBuilder;-><init>(Landroidx/navigation/NavigatorProvider;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p10, v0}, Lhd/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v0}, Landroidx/navigation/NavGraphBuilder;->build()Landroidx/navigation/NavGraph;

    move-result-object p1

    .line 4
    check-cast p3, Ljava/lang/Iterable;

    .line 5
    invoke-interface {p3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result p3

    if-eqz p3, :cond_0

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Landroidx/navigation/NamedNavArgument;

    invoke-virtual {p3}, Landroidx/navigation/NamedNavArgument;->component1()Ljava/lang/String;

    move-result-object p10

    invoke-virtual {p3}, Landroidx/navigation/NamedNavArgument;->component2()Landroidx/navigation/NavArgument;

    move-result-object p3

    .line 6
    invoke-virtual {p1, p10, p3}, Landroidx/navigation/NavDestination;->addArgument(Ljava/lang/String;Landroidx/navigation/NavArgument;)V

    goto :goto_0

    .line 7
    :cond_0
    check-cast p4, Ljava/lang/Iterable;

    .line 8
    invoke-interface {p4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :goto_1
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result p3

    if-eqz p3, :cond_1

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Landroidx/navigation/NavDeepLink;

    .line 9
    invoke-virtual {p1, p3}, Landroidx/navigation/NavDestination;->addDeepLink(Landroidx/navigation/NavDeepLink;)V

    goto :goto_1

    .line 10
    :cond_1
    instance-of p2, p1, Landroidx/navigation/compose/ComposeNavGraphNavigator$ComposeNavGraph;

    if-eqz p2, :cond_2

    .line 11
    move-object p2, p1

    check-cast p2, Landroidx/navigation/compose/ComposeNavGraphNavigator$ComposeNavGraph;

    invoke-virtual {p2, p5}, Landroidx/navigation/compose/ComposeNavGraphNavigator$ComposeNavGraph;->setEnterTransition$navigation_compose_release(Lhd/l;)V

    .line 12
    invoke-virtual {p2, p6}, Landroidx/navigation/compose/ComposeNavGraphNavigator$ComposeNavGraph;->setExitTransition$navigation_compose_release(Lhd/l;)V

    .line 13
    invoke-virtual {p2, p7}, Landroidx/navigation/compose/ComposeNavGraphNavigator$ComposeNavGraph;->setPopEnterTransition$navigation_compose_release(Lhd/l;)V

    .line 14
    invoke-virtual {p2, p8}, Landroidx/navigation/compose/ComposeNavGraphNavigator$ComposeNavGraph;->setPopExitTransition$navigation_compose_release(Lhd/l;)V

    .line 15
    invoke-virtual {p2, p9}, Landroidx/navigation/compose/ComposeNavGraphNavigator$ComposeNavGraph;->setSizeTransform$navigation_compose_release(Lhd/l;)V

    .line 16
    :cond_2
    invoke-virtual {p0, p1}, Landroidx/navigation/NavGraphBuilder;->addDestination(Landroidx/navigation/NavDestination;)V

    return-void
.end method

.method public static final synthetic navigation(Landroidx/navigation/NavGraphBuilder;Lod/c;Ljava/util/Map;Ljava/util/List;Lhd/l;Lhd/l;Lhd/l;Lhd/l;Lhd/l;Lhd/l;)V
    .locals 12
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Landroidx/navigation/NavGraphBuilder;",
            "Lod/c;",
            "Ljava/util/Map<",
            "Lod/o;",
            "Landroidx/navigation/NavType<",
            "*>;>;",
            "Ljava/util/List<",
            "Landroidx/navigation/NavDeepLink;",
            ">;",
            "Lhd/l;",
            "Lhd/l;",
            "Lhd/l;",
            "Lhd/l;",
            "Lhd/l;",
            "Lhd/l;",
            ")V"
        }
    .end annotation

    const/4 v0, 0x4

    .line 17
    const-string v1, "T"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/u;->m(ILjava/lang/String;)V

    const-class v0, Ljava/lang/Object;

    invoke-static {v0}, Lkotlin/jvm/internal/y;->b(Ljava/lang/Class;)Lod/c;

    move-result-object v3

    move-object v1, p0

    move-object v2, p1

    move-object v4, p2

    move-object v5, p3

    move-object/from16 v6, p4

    move-object/from16 v7, p5

    move-object/from16 v8, p6

    move-object/from16 v9, p7

    move-object/from16 v10, p8

    move-object/from16 v11, p9

    .line 18
    invoke-static/range {v1 .. v11}, Landroidx/navigation/compose/NavGraphBuilderKt;->navigation(Landroidx/navigation/NavGraphBuilder;Lod/c;Lod/c;Ljava/util/Map;Ljava/util/List;Lhd/l;Lhd/l;Lhd/l;Lhd/l;Lhd/l;Lhd/l;)V

    return-void
.end method

.method public static final navigation(Landroidx/navigation/NavGraphBuilder;Lod/c;Lod/c;Ljava/util/Map;Ljava/util/List;Lhd/l;Lhd/l;Lhd/l;Lhd/l;Lhd/l;Lhd/l;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Landroidx/navigation/NavGraphBuilder;",
            "Lod/c;",
            "Lod/c;",
            "Ljava/util/Map<",
            "Lod/o;",
            "Landroidx/navigation/NavType<",
            "*>;>;",
            "Ljava/util/List<",
            "Landroidx/navigation/NavDeepLink;",
            ">;",
            "Lhd/l;",
            "Lhd/l;",
            "Lhd/l;",
            "Lhd/l;",
            "Lhd/l;",
            "Lhd/l;",
            ")V"
        }
    .end annotation

    .line 19
    new-instance v0, Landroidx/navigation/NavGraphBuilder;

    invoke-virtual {p0}, Landroidx/navigation/NavGraphBuilder;->getProvider()Landroidx/navigation/NavigatorProvider;

    move-result-object v1

    invoke-direct {v0, v1, p1, p2, p3}, Landroidx/navigation/NavGraphBuilder;-><init>(Landroidx/navigation/NavigatorProvider;Lod/c;Lod/c;Ljava/util/Map;)V

    invoke-interface {p10, v0}, Lhd/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v0}, Landroidx/navigation/NavGraphBuilder;->build()Landroidx/navigation/NavGraph;

    move-result-object p1

    .line 20
    check-cast p4, Ljava/lang/Iterable;

    .line 21
    invoke-interface {p4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result p3

    if-eqz p3, :cond_0

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Landroidx/navigation/NavDeepLink;

    .line 22
    invoke-virtual {p1, p3}, Landroidx/navigation/NavDestination;->addDeepLink(Landroidx/navigation/NavDeepLink;)V

    goto :goto_0

    .line 23
    :cond_0
    instance-of p2, p1, Landroidx/navigation/compose/ComposeNavGraphNavigator$ComposeNavGraph;

    if-eqz p2, :cond_1

    .line 24
    move-object p2, p1

    check-cast p2, Landroidx/navigation/compose/ComposeNavGraphNavigator$ComposeNavGraph;

    invoke-virtual {p2, p5}, Landroidx/navigation/compose/ComposeNavGraphNavigator$ComposeNavGraph;->setEnterTransition$navigation_compose_release(Lhd/l;)V

    .line 25
    invoke-virtual {p2, p6}, Landroidx/navigation/compose/ComposeNavGraphNavigator$ComposeNavGraph;->setExitTransition$navigation_compose_release(Lhd/l;)V

    .line 26
    invoke-virtual {p2, p7}, Landroidx/navigation/compose/ComposeNavGraphNavigator$ComposeNavGraph;->setPopEnterTransition$navigation_compose_release(Lhd/l;)V

    .line 27
    invoke-virtual {p2, p8}, Landroidx/navigation/compose/ComposeNavGraphNavigator$ComposeNavGraph;->setPopExitTransition$navigation_compose_release(Lhd/l;)V

    .line 28
    invoke-virtual {p2, p9}, Landroidx/navigation/compose/ComposeNavGraphNavigator$ComposeNavGraph;->setSizeTransform$navigation_compose_release(Lhd/l;)V

    .line 29
    :cond_1
    invoke-virtual {p0, p1}, Landroidx/navigation/NavGraphBuilder;->addDestination(Landroidx/navigation/NavDestination;)V

    return-void
.end method

.method public static synthetic navigation$default(Landroidx/navigation/NavGraphBuilder;Ljava/lang/Object;Ljava/util/Map;Ljava/util/List;Lhd/l;Lhd/l;Lhd/l;Lhd/l;Lhd/l;Lhd/l;ILjava/lang/Object;)V
    .locals 11

    move/from16 v0, p10

    and-int/lit8 v1, v0, 0x2

    if-eqz v1, :cond_0

    .line 17
    invoke-static {}, Lkotlin/collections/a;->h()Ljava/util/Map;

    move-result-object p2

    :cond_0
    move-object v3, p2

    and-int/lit8 p2, v0, 0x4

    if-eqz p2, :cond_1

    .line 18
    invoke-static {}, Lrc/w;->n()Ljava/util/List;

    move-result-object p2

    move-object v4, p2

    goto :goto_0

    :cond_1
    move-object v4, p3

    :goto_0
    and-int/lit8 p2, v0, 0x8

    const/4 v1, 0x0

    if-eqz p2, :cond_2

    move-object v5, v1

    goto :goto_1

    :cond_2
    move-object v5, p4

    :goto_1
    and-int/lit8 p2, v0, 0x10

    if-eqz p2, :cond_3

    move-object v6, v1

    goto :goto_2

    :cond_3
    move-object/from16 v6, p5

    :goto_2
    and-int/lit8 p2, v0, 0x20

    if-eqz p2, :cond_4

    move-object v7, v5

    goto :goto_3

    :cond_4
    move-object/from16 v7, p6

    :goto_3
    and-int/lit8 p2, v0, 0x40

    if-eqz p2, :cond_5

    move-object v8, v6

    goto :goto_4

    :cond_5
    move-object/from16 v8, p7

    :goto_4
    and-int/lit16 p2, v0, 0x80

    if-eqz p2, :cond_6

    move-object v9, v1

    goto :goto_5

    :cond_6
    move-object/from16 v9, p8

    .line 19
    :goto_5
    const-string p2, "T"

    const/4 v0, 0x4

    invoke-static {v0, p2}, Lkotlin/jvm/internal/u;->m(ILjava/lang/String;)V

    const-class p2, Ljava/lang/Object;

    invoke-static {p2}, Lkotlin/jvm/internal/y;->b(Ljava/lang/Class;)Lod/c;

    move-result-object v2

    move-object v0, p0

    move-object v1, p1

    move-object/from16 v10, p9

    .line 20
    invoke-static/range {v0 .. v10}, Landroidx/navigation/compose/NavGraphBuilderKt;->navigation(Landroidx/navigation/NavGraphBuilder;Ljava/lang/Object;Lod/c;Ljava/util/Map;Ljava/util/List;Lhd/l;Lhd/l;Lhd/l;Lhd/l;Lhd/l;Lhd/l;)V

    return-void
.end method

.method public static synthetic navigation$default(Landroidx/navigation/NavGraphBuilder;Ljava/lang/Object;Lod/c;Ljava/util/Map;Ljava/util/List;Lhd/l;Lhd/l;Lhd/l;Lhd/l;Lhd/l;Lhd/l;ILjava/lang/Object;)V
    .locals 13

    move/from16 v0, p11

    and-int/lit8 v1, v0, 0x4

    if-eqz v1, :cond_0

    .line 21
    invoke-static {}, Lkotlin/collections/a;->h()Ljava/util/Map;

    move-result-object v1

    move-object v5, v1

    goto :goto_0

    :cond_0
    move-object/from16 v5, p3

    :goto_0
    and-int/lit8 v1, v0, 0x8

    if-eqz v1, :cond_1

    .line 22
    invoke-static {}, Lrc/w;->n()Ljava/util/List;

    move-result-object v1

    move-object v6, v1

    goto :goto_1

    :cond_1
    move-object/from16 v6, p4

    :goto_1
    and-int/lit8 v1, v0, 0x10

    const/4 v2, 0x0

    if-eqz v1, :cond_2

    move-object v7, v2

    goto :goto_2

    :cond_2
    move-object/from16 v7, p5

    :goto_2
    and-int/lit8 v1, v0, 0x20

    if-eqz v1, :cond_3

    move-object v8, v2

    goto :goto_3

    :cond_3
    move-object/from16 v8, p6

    :goto_3
    and-int/lit8 v1, v0, 0x40

    if-eqz v1, :cond_4

    move-object v9, v7

    goto :goto_4

    :cond_4
    move-object/from16 v9, p7

    :goto_4
    and-int/lit16 v1, v0, 0x80

    if-eqz v1, :cond_5

    move-object v10, v8

    goto :goto_5

    :cond_5
    move-object/from16 v10, p8

    :goto_5
    and-int/lit16 v0, v0, 0x100

    if-eqz v0, :cond_6

    move-object v11, v2

    move-object v3, p1

    move-object v4, p2

    move-object/from16 v12, p10

    move-object v2, p0

    goto :goto_6

    :cond_6
    move-object/from16 v11, p9

    move-object v2, p0

    move-object v3, p1

    move-object v4, p2

    move-object/from16 v12, p10

    .line 23
    :goto_6
    invoke-static/range {v2 .. v12}, Landroidx/navigation/compose/NavGraphBuilderKt;->navigation(Landroidx/navigation/NavGraphBuilder;Ljava/lang/Object;Lod/c;Ljava/util/Map;Ljava/util/List;Lhd/l;Lhd/l;Lhd/l;Lhd/l;Lhd/l;Lhd/l;)V

    return-void
.end method

.method public static synthetic navigation$default(Landroidx/navigation/NavGraphBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Lhd/l;ILjava/lang/Object;)V
    .locals 6

    and-int/lit8 p7, p6, 0x4

    if-eqz p7, :cond_0

    .line 1
    invoke-static {}, Lrc/w;->n()Ljava/util/List;

    move-result-object p3

    :cond_0
    move-object v3, p3

    and-int/lit8 p3, p6, 0x8

    if-eqz p3, :cond_1

    .line 2
    invoke-static {}, Lrc/w;->n()Ljava/util/List;

    move-result-object p4

    :cond_1
    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v4, p4

    move-object v5, p5

    .line 3
    invoke-static/range {v0 .. v5}, Landroidx/navigation/compose/NavGraphBuilderKt;->navigation(Landroidx/navigation/NavGraphBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Lhd/l;)V

    return-void
.end method

.method public static synthetic navigation$default(Landroidx/navigation/NavGraphBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Lhd/l;Lhd/l;Lhd/l;Lhd/l;Lhd/l;ILjava/lang/Object;)V
    .locals 10

    move/from16 v0, p10

    and-int/lit8 v1, v0, 0x4

    if-eqz v1, :cond_0

    .line 4
    invoke-static {}, Lrc/w;->n()Ljava/util/List;

    move-result-object p3

    :cond_0
    move-object v3, p3

    and-int/lit8 p3, v0, 0x8

    if-eqz p3, :cond_1

    .line 5
    invoke-static {}, Lrc/w;->n()Ljava/util/List;

    move-result-object p3

    move-object v4, p3

    goto :goto_0

    :cond_1
    move-object v4, p4

    :goto_0
    and-int/lit8 p3, v0, 0x10

    const/4 v1, 0x0

    if-eqz p3, :cond_2

    move-object v5, v1

    goto :goto_1

    :cond_2
    move-object v5, p5

    :goto_1
    and-int/lit8 p3, v0, 0x20

    if-eqz p3, :cond_3

    move-object v6, v1

    goto :goto_2

    :cond_3
    move-object/from16 v6, p6

    :goto_2
    and-int/lit8 p3, v0, 0x40

    if-eqz p3, :cond_4

    move-object v7, v5

    goto :goto_3

    :cond_4
    move-object/from16 v7, p7

    :goto_3
    and-int/lit16 p3, v0, 0x80

    if-eqz p3, :cond_5

    move-object v8, v6

    :goto_4
    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object/from16 v9, p9

    goto :goto_5

    :cond_5
    move-object/from16 v8, p8

    goto :goto_4

    .line 6
    :goto_5
    invoke-static/range {v0 .. v9}, Landroidx/navigation/compose/NavGraphBuilderKt;->navigation(Landroidx/navigation/NavGraphBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Lhd/l;Lhd/l;Lhd/l;Lhd/l;Lhd/l;)V

    return-void
.end method

.method public static synthetic navigation$default(Landroidx/navigation/NavGraphBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Lhd/l;Lhd/l;Lhd/l;Lhd/l;Lhd/l;Lhd/l;ILjava/lang/Object;)V
    .locals 13

    move/from16 v0, p11

    and-int/lit8 v1, v0, 0x4

    if-eqz v1, :cond_0

    .line 7
    invoke-static {}, Lrc/w;->n()Ljava/util/List;

    move-result-object v1

    move-object v5, v1

    goto :goto_0

    :cond_0
    move-object/from16 v5, p3

    :goto_0
    and-int/lit8 v1, v0, 0x8

    if-eqz v1, :cond_1

    .line 8
    invoke-static {}, Lrc/w;->n()Ljava/util/List;

    move-result-object v1

    move-object v6, v1

    goto :goto_1

    :cond_1
    move-object/from16 v6, p4

    :goto_1
    and-int/lit8 v1, v0, 0x10

    const/4 v2, 0x0

    if-eqz v1, :cond_2

    move-object v7, v2

    goto :goto_2

    :cond_2
    move-object/from16 v7, p5

    :goto_2
    and-int/lit8 v1, v0, 0x20

    if-eqz v1, :cond_3

    move-object v8, v2

    goto :goto_3

    :cond_3
    move-object/from16 v8, p6

    :goto_3
    and-int/lit8 v1, v0, 0x40

    if-eqz v1, :cond_4

    move-object v9, v7

    goto :goto_4

    :cond_4
    move-object/from16 v9, p7

    :goto_4
    and-int/lit16 v1, v0, 0x80

    if-eqz v1, :cond_5

    move-object v10, v8

    goto :goto_5

    :cond_5
    move-object/from16 v10, p8

    :goto_5
    and-int/lit16 v0, v0, 0x100

    if-eqz v0, :cond_6

    move-object v11, v2

    move-object v3, p1

    move-object v4, p2

    move-object/from16 v12, p10

    move-object v2, p0

    goto :goto_6

    :cond_6
    move-object/from16 v11, p9

    move-object v2, p0

    move-object v3, p1

    move-object v4, p2

    move-object/from16 v12, p10

    .line 9
    :goto_6
    invoke-static/range {v2 .. v12}, Landroidx/navigation/compose/NavGraphBuilderKt;->navigation(Landroidx/navigation/NavGraphBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Lhd/l;Lhd/l;Lhd/l;Lhd/l;Lhd/l;Lhd/l;)V

    return-void
.end method

.method public static synthetic navigation$default(Landroidx/navigation/NavGraphBuilder;Lod/c;Ljava/util/Map;Ljava/util/List;Lhd/l;Lhd/l;Lhd/l;Lhd/l;Lhd/l;Lhd/l;ILjava/lang/Object;)V
    .locals 11

    move/from16 v0, p10

    and-int/lit8 v1, v0, 0x2

    if-eqz v1, :cond_0

    .line 10
    invoke-static {}, Lkotlin/collections/a;->h()Ljava/util/Map;

    move-result-object p2

    :cond_0
    move-object v3, p2

    and-int/lit8 p2, v0, 0x4

    if-eqz p2, :cond_1

    .line 11
    invoke-static {}, Lrc/w;->n()Ljava/util/List;

    move-result-object p2

    move-object v4, p2

    goto :goto_0

    :cond_1
    move-object v4, p3

    :goto_0
    and-int/lit8 p2, v0, 0x8

    const/4 v1, 0x0

    if-eqz p2, :cond_2

    move-object v5, v1

    goto :goto_1

    :cond_2
    move-object v5, p4

    :goto_1
    and-int/lit8 p2, v0, 0x10

    if-eqz p2, :cond_3

    move-object v6, v1

    goto :goto_2

    :cond_3
    move-object/from16 v6, p5

    :goto_2
    and-int/lit8 p2, v0, 0x20

    if-eqz p2, :cond_4

    move-object v7, v5

    goto :goto_3

    :cond_4
    move-object/from16 v7, p6

    :goto_3
    and-int/lit8 p2, v0, 0x40

    if-eqz p2, :cond_5

    move-object v8, v6

    goto :goto_4

    :cond_5
    move-object/from16 v8, p7

    :goto_4
    and-int/lit16 p2, v0, 0x80

    if-eqz p2, :cond_6

    move-object v9, v1

    goto :goto_5

    :cond_6
    move-object/from16 v9, p8

    .line 12
    :goto_5
    const-string p2, "T"

    const/4 v0, 0x4

    invoke-static {v0, p2}, Lkotlin/jvm/internal/u;->m(ILjava/lang/String;)V

    const-class p2, Ljava/lang/Object;

    invoke-static {p2}, Lkotlin/jvm/internal/y;->b(Ljava/lang/Class;)Lod/c;

    move-result-object v2

    move-object v0, p0

    move-object v1, p1

    move-object/from16 v10, p9

    .line 13
    invoke-static/range {v0 .. v10}, Landroidx/navigation/compose/NavGraphBuilderKt;->navigation(Landroidx/navigation/NavGraphBuilder;Lod/c;Lod/c;Ljava/util/Map;Ljava/util/List;Lhd/l;Lhd/l;Lhd/l;Lhd/l;Lhd/l;Lhd/l;)V

    return-void
.end method

.method public static synthetic navigation$default(Landroidx/navigation/NavGraphBuilder;Lod/c;Lod/c;Ljava/util/Map;Ljava/util/List;Lhd/l;Lhd/l;Lhd/l;Lhd/l;Lhd/l;Lhd/l;ILjava/lang/Object;)V
    .locals 13

    move/from16 v0, p11

    and-int/lit8 v1, v0, 0x4

    if-eqz v1, :cond_0

    .line 14
    invoke-static {}, Lkotlin/collections/a;->h()Ljava/util/Map;

    move-result-object v1

    move-object v5, v1

    goto :goto_0

    :cond_0
    move-object/from16 v5, p3

    :goto_0
    and-int/lit8 v1, v0, 0x8

    if-eqz v1, :cond_1

    .line 15
    invoke-static {}, Lrc/w;->n()Ljava/util/List;

    move-result-object v1

    move-object v6, v1

    goto :goto_1

    :cond_1
    move-object/from16 v6, p4

    :goto_1
    and-int/lit8 v1, v0, 0x10

    const/4 v2, 0x0

    if-eqz v1, :cond_2

    move-object v7, v2

    goto :goto_2

    :cond_2
    move-object/from16 v7, p5

    :goto_2
    and-int/lit8 v1, v0, 0x20

    if-eqz v1, :cond_3

    move-object v8, v2

    goto :goto_3

    :cond_3
    move-object/from16 v8, p6

    :goto_3
    and-int/lit8 v1, v0, 0x40

    if-eqz v1, :cond_4

    move-object v9, v7

    goto :goto_4

    :cond_4
    move-object/from16 v9, p7

    :goto_4
    and-int/lit16 v1, v0, 0x80

    if-eqz v1, :cond_5

    move-object v10, v8

    goto :goto_5

    :cond_5
    move-object/from16 v10, p8

    :goto_5
    and-int/lit16 v0, v0, 0x100

    if-eqz v0, :cond_6

    move-object v11, v2

    move-object v3, p1

    move-object v4, p2

    move-object/from16 v12, p10

    move-object v2, p0

    goto :goto_6

    :cond_6
    move-object/from16 v11, p9

    move-object v2, p0

    move-object v3, p1

    move-object v4, p2

    move-object/from16 v12, p10

    .line 16
    :goto_6
    invoke-static/range {v2 .. v12}, Landroidx/navigation/compose/NavGraphBuilderKt;->navigation(Landroidx/navigation/NavGraphBuilder;Lod/c;Lod/c;Ljava/util/Map;Ljava/util/List;Lhd/l;Lhd/l;Lhd/l;Lhd/l;Lhd/l;Lhd/l;)V

    return-void
.end method
