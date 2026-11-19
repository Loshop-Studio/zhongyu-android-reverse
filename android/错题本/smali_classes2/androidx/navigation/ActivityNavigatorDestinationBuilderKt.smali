.class public final Landroidx/navigation/ActivityNavigatorDestinationBuilderKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "androidx/navigation/ActivityNavigatorDestinationBuilderKt__ActivityNavigatorDestinationBuilder_androidKt"
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
.method public static final activity(Landroidx/navigation/NavGraphBuilder;ILr6/c;)V
    .locals 0
    .param p0    # Landroidx/navigation/NavGraphBuilder;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p1    # I
        .annotation build Landroidx/annotation/IdRes;
        .end annotation
    .end param
    .param p2    # Lr6/c;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/navigation/NavGraphBuilder;",
            "I",
            "Lr6/c;",
            ")V"
        }
    .end annotation

    .annotation runtime Lkotlin/Deprecated;
        message = "Use routes to build your ActivityDestination instead"
        replaceWith = .subannotation Lkotlin/ReplaceWith;
            expression = "activity(route = id.toString()) { builder.invoke() }"
            imports = {}
        .end subannotation
    .end annotation

    .line 1
    invoke-static {p0, p1, p2}, Landroidx/navigation/ActivityNavigatorDestinationBuilderKt__ActivityNavigatorDestinationBuilder_androidKt;->activity(Landroidx/navigation/NavGraphBuilder;ILr6/c;)V

    return-void
.end method

.method public static final activity(Landroidx/navigation/NavGraphBuilder;Ljava/lang/String;Lr6/c;)V
    .locals 0
    .param p0    # Landroidx/navigation/NavGraphBuilder;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lr6/c;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/navigation/NavGraphBuilder;",
            "Ljava/lang/String;",
            "Lr6/c;",
            ")V"
        }
    .end annotation

    .line 2
    invoke-static {p0, p1, p2}, Landroidx/navigation/ActivityNavigatorDestinationBuilderKt__ActivityNavigatorDestinationBuilder_androidKt;->activity(Landroidx/navigation/NavGraphBuilder;Ljava/lang/String;Lr6/c;)V

    return-void
.end method

.method public static final synthetic activity(Landroidx/navigation/NavGraphBuilder;Ljava/util/Map;Lr6/c;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Landroidx/navigation/NavGraphBuilder;",
            "Ljava/util/Map<",
            "Ly6/q;",
            "Landroidx/navigation/NavType<",
            "*>;>;",
            "Lr6/c;",
            ")V"
        }
    .end annotation

    .line 3
    invoke-static {p0, p1, p2}, Landroidx/navigation/ActivityNavigatorDestinationBuilderKt__ActivityNavigatorDestinationBuilder_androidKt;->activity(Landroidx/navigation/NavGraphBuilder;Ljava/util/Map;Lr6/c;)V

    return-void
.end method

.method public static synthetic activity$default(Landroidx/navigation/NavGraphBuilder;Ljava/util/Map;Lr6/c;ILjava/lang/Object;)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2, p3, p4}, Landroidx/navigation/ActivityNavigatorDestinationBuilderKt__ActivityNavigatorDestinationBuilder_androidKt;->activity$default(Landroidx/navigation/NavGraphBuilder;Ljava/util/Map;Lr6/c;ILjava/lang/Object;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method
