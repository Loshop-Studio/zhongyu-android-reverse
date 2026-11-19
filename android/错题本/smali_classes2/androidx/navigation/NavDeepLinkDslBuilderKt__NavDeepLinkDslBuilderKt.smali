.class final synthetic Landroidx/navigation/NavDeepLinkDslBuilderKt__NavDeepLinkDslBuilderKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u001a&\u0010\u0006\u001a\u00020\u00052\u0017\u0010\u0004\u001a\u0013\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000\u00a2\u0006\u0002\u0008\u0003\u00a2\u0006\u0004\u0008\u0006\u0010\u0007\u001aa\u0010\u0006\u001a\u00020\u0005\"\n\u0008\u0000\u0010\t\u0018\u0001*\u00020\u00082\u0006\u0010\u000b\u001a\u00020\n2\u001d\u0008\u0002\u0010\u0010\u001a\u0017\u0012\u0004\u0012\u00020\r\u0012\r\u0012\u000b\u0012\u0002\u0008\u00030\u000e\u00a2\u0006\u0002\u0008\u000f0\u000c2\u0019\u0008\n\u0010\u0004\u001a\u0013\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000\u00a2\u0006\u0002\u0008\u0003H\u0086\u0008\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008\u0006\u0010\u0011\u001ag\u0010\u0006\u001a\u00020\u0005\"\u0008\u0008\u0000\u0010\t*\u00020\u00082\u000c\u0010\u0013\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u00122\u0006\u0010\u000b\u001a\u00020\n2\u001d\u0008\u0002\u0010\u0010\u001a\u0017\u0012\u0004\u0012\u00020\r\u0012\r\u0012\u000b\u0012\u0002\u0008\u00030\u000e\u00a2\u0006\u0002\u0008\u000f0\u000c2\u0017\u0010\u0004\u001a\u0013\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000\u00a2\u0006\u0002\u0008\u0003H\u0007\u00a2\u0006\u0004\u0008\u0006\u0010\u0014\u0082\u0002\u0007\n\u0005\u0008\u009920\u0001\u00a8\u0006\u0015"
    }
    d2 = {
        "Lkotlin/Function1;",
        "Landroidx/navigation/NavDeepLinkDslBuilder;",
        "Ld6/s;",
        "Lkotlin/ExtensionFunctionType;",
        "deepLinkBuilder",
        "Landroidx/navigation/NavDeepLink;",
        "navDeepLink",
        "(Lr6/c;)Landroidx/navigation/NavDeepLink;",
        "",
        "T",
        "",
        "basePath",
        "",
        "Ly6/q;",
        "Landroidx/navigation/NavType;",
        "Lkotlin/jvm/JvmSuppressWildcards;",
        "typeMap",
        "(Ljava/lang/String;Ljava/util/Map;Lr6/c;)Landroidx/navigation/NavDeepLink;",
        "Ly6/c;",
        "route",
        "(Ly6/c;Ljava/lang/String;Ljava/util/Map;Lr6/c;)Landroidx/navigation/NavDeepLink;",
        "navigation-common_release"
    }
    k = 0x5
    mv = {
        0x2,
        0x0,
        0x0
    }
    xi = 0x30
    xs = "androidx/navigation/NavDeepLinkDslBuilderKt"
.end annotation


# direct methods
.method public static final navDeepLink(Ljava/lang/String;Ljava/util/Map;Lr6/c;)Landroidx/navigation/NavDeepLink;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/String;",
            "Ljava/util/Map<",
            "Ly6/q;",
            "Landroidx/navigation/NavType<",
            "*>;>;",
            "Lr6/c;",
            ")",
            "Landroidx/navigation/NavDeepLink;"
        }
    .end annotation

    const-string v0, "basePath"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo p0, "typeMap"

    invoke-static {p1, p0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p0, "deepLinkBuilder"

    invoke-static {p2, p0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    invoke-static {}, Lkotlin/jvm/internal/k;->o()V

    const/4 p0, 0x0

    throw p0
.end method

.method public static final navDeepLink(Lr6/c;)Landroidx/navigation/NavDeepLink;
    .locals 1
    .param p0    # Lr6/c;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lr6/c;",
            ")",
            "Landroidx/navigation/NavDeepLink;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "deepLinkBuilder"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    new-instance v0, Landroidx/navigation/NavDeepLinkDslBuilder;

    invoke-direct {v0}, Landroidx/navigation/NavDeepLinkDslBuilder;-><init>()V

    invoke-interface {p0, v0}, Lr6/c;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v0}, Landroidx/navigation/NavDeepLinkDslBuilder;->build$navigation_common_release()Landroidx/navigation/NavDeepLink;

    move-result-object p0

    return-object p0
.end method

.method public static final navDeepLink(Ly6/c;Ljava/lang/String;Ljava/util/Map;Lr6/c;)Landroidx/navigation/NavDeepLink;
    .locals 1
    .param p0    # Ly6/c;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Ljava/util/Map;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Lr6/c;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ly6/c;",
            "Ljava/lang/String;",
            "Ljava/util/Map<",
            "Ly6/q;",
            "Landroidx/navigation/NavType<",
            "*>;>;",
            "Lr6/c;",
            ")",
            "Landroidx/navigation/NavDeepLink;"
        }
    .end annotation

    .annotation build Lkotlin/jvm/JvmOverloads;
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string/jumbo v0, "route"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "basePath"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "typeMap"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "deepLinkBuilder"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 3
    new-instance v0, Landroidx/navigation/NavDeepLinkDslBuilder;

    invoke-direct {v0, p1, p0, p2}, Landroidx/navigation/NavDeepLinkDslBuilder;-><init>(Ljava/lang/String;Ly6/c;Ljava/util/Map;)V

    invoke-interface {p3, v0}, Lr6/c;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v0}, Landroidx/navigation/NavDeepLinkDslBuilder;->build$navigation_common_release()Landroidx/navigation/NavDeepLink;

    move-result-object p0

    return-object p0
.end method

.method public static final navDeepLink(Ly6/c;Ljava/lang/String;Lr6/c;)Landroidx/navigation/NavDeepLink;
    .locals 7
    .param p0    # Ly6/c;
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
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ly6/c;",
            "Ljava/lang/String;",
            "Lr6/c;",
            ")",
            "Landroidx/navigation/NavDeepLink;"
        }
    .end annotation

    .annotation build Lkotlin/jvm/JvmOverloads;
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    const-string/jumbo v0, "route"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "basePath"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "deepLinkBuilder"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v5, 0x4

    const/4 v6, 0x0

    const/4 v3, 0x0

    move-object v1, p0

    move-object v2, p1

    move-object v4, p2

    invoke-static/range {v1 .. v6}, Landroidx/navigation/NavDeepLinkDslBuilderKt;->navDeepLink$default(Ly6/c;Ljava/lang/String;Ljava/util/Map;Lr6/c;ILjava/lang/Object;)Landroidx/navigation/NavDeepLink;

    move-result-object p0

    return-object p0
.end method

.method public static navDeepLink$default(Ljava/lang/String;Ljava/util/Map;Lr6/c;ILjava/lang/Object;)Landroidx/navigation/NavDeepLink;
    .locals 0

    and-int/lit8 p4, p3, 0x2

    if-eqz p4, :cond_0

    .line 1
    invoke-static {}, Lkotlin/collections/e0;->A()Ljava/util/Map;

    move-result-object p1

    :cond_0
    and-int/lit8 p3, p3, 0x4

    if-eqz p3, :cond_1

    .line 2
    sget-object p2, Landroidx/navigation/NavDeepLinkDslBuilderKt__NavDeepLinkDslBuilderKt$navDeepLink$1;->INSTANCE:Landroidx/navigation/NavDeepLinkDslBuilderKt__NavDeepLinkDslBuilderKt$navDeepLink$1;

    .line 3
    :cond_1
    const-string p3, "basePath"

    invoke-static {p0, p3}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo p0, "typeMap"

    invoke-static {p1, p0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p0, "deepLinkBuilder"

    invoke-static {p2, p0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    invoke-static {}, Lkotlin/jvm/internal/k;->o()V

    const/4 p0, 0x0

    throw p0
.end method

.method public static synthetic navDeepLink$default(Ly6/c;Ljava/lang/String;Ljava/util/Map;Lr6/c;ILjava/lang/Object;)Landroidx/navigation/NavDeepLink;
    .locals 0

    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_0

    .line 5
    invoke-static {}, Lkotlin/collections/e0;->A()Ljava/util/Map;

    move-result-object p2

    .line 6
    :cond_0
    invoke-static {p0, p1, p2, p3}, Landroidx/navigation/NavDeepLinkDslBuilderKt;->navDeepLink(Ly6/c;Ljava/lang/String;Ljava/util/Map;Lr6/c;)Landroidx/navigation/NavDeepLink;

    move-result-object p0

    return-object p0
.end method
