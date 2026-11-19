.class public final Landroidx/compose/runtime/HotReloaderKt;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final clearCompositionErrors()V
    .locals 1

    .line 1
    sget-object v0, Landroidx/compose/runtime/HotReloader;->Companion:Landroidx/compose/runtime/HotReloader$Companion;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroidx/compose/runtime/HotReloader$Companion;->clearErrors$runtime_release()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public static final currentCompositionErrors()Ljava/util/List;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lkotlin/Pair<",
            "Ljava/lang/Exception;",
            "Ljava/lang/Boolean;",
            ">;>;"
        }
    .end annotation

    .annotation runtime Lqc/a;
    .end annotation

    .line 1
    invoke-static {}, Landroidx/compose/runtime/HotReloaderKt;->getCurrentCompositionErrors()Ljava/util/List;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    check-cast v0, Ljava/lang/Iterable;

    .line 6
    .line 7
    new-instance v1, Ljava/util/ArrayList;

    .line 8
    .line 9
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 10
    .line 11
    .line 12
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 17
    .line 18
    .line 19
    move-result v2

    .line 20
    if-eqz v2, :cond_3

    .line 21
    .line 22
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object v2

    .line 26
    check-cast v2, Lkotlin/Pair;

    .line 27
    .line 28
    invoke-virtual {v2}, Lkotlin/Pair;->a()Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object v3

    .line 32
    check-cast v3, Ljava/lang/Throwable;

    .line 33
    .line 34
    invoke-virtual {v2}, Lkotlin/Pair;->c()Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object v2

    .line 38
    check-cast v2, Ljava/lang/Boolean;

    .line 39
    .line 40
    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 41
    .line 42
    .line 43
    instance-of v4, v3, Ljava/lang/Exception;

    .line 44
    .line 45
    const/4 v5, 0x0

    .line 46
    if-eqz v4, :cond_1

    .line 47
    .line 48
    check-cast v3, Ljava/lang/Exception;

    .line 49
    .line 50
    goto :goto_1

    .line 51
    :cond_1
    move-object v3, v5

    .line 52
    :goto_1
    if-nez v3, :cond_2

    .line 53
    .line 54
    goto :goto_2

    .line 55
    :cond_2
    invoke-static {v3, v2}, Lqc/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 56
    .line 57
    .line 58
    move-result-object v5

    .line 59
    :goto_2
    if-eqz v5, :cond_0

    .line 60
    .line 61
    invoke-interface {v1, v5}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 62
    .line 63
    .line 64
    goto :goto_0

    .line 65
    :cond_3
    return-object v1
.end method

.method public static final getCurrentCompositionErrors()Ljava/util/List;
    .locals 4
    .annotation build Landroidx/annotation/RestrictTo;
        value = {
            .enum Landroidx/annotation/RestrictTo$Scope;->LIBRARY_GROUP:Landroidx/annotation/RestrictTo$Scope;
        }
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lkotlin/Pair<",
            "Ljava/lang/Throwable;",
            "Ljava/lang/Boolean;",
            ">;>;"
        }
    .end annotation

    .line 1
    sget-object v0, Landroidx/compose/runtime/HotReloader;->Companion:Landroidx/compose/runtime/HotReloader$Companion;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroidx/compose/runtime/HotReloader$Companion;->getCurrentErrors$runtime_release()Ljava/util/List;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Ljava/lang/Iterable;

    .line 8
    .line 9
    new-instance v1, Ljava/util/ArrayList;

    .line 10
    .line 11
    const/16 v2, 0xa

    .line 12
    .line 13
    invoke-static {v0, v2}, Lrc/x;->x(Ljava/lang/Iterable;I)I

    .line 14
    .line 15
    .line 16
    move-result v2

    .line 17
    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 18
    .line 19
    .line 20
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 25
    .line 26
    .line 27
    move-result v2

    .line 28
    if-eqz v2, :cond_0

    .line 29
    .line 30
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object v2

    .line 34
    check-cast v2, Landroidx/compose/runtime/RecomposerErrorInfo;

    .line 35
    .line 36
    invoke-interface {v2}, Landroidx/compose/runtime/RecomposerErrorInfo;->getCause()Ljava/lang/Throwable;

    .line 37
    .line 38
    .line 39
    move-result-object v3

    .line 40
    invoke-interface {v2}, Landroidx/compose/runtime/RecomposerErrorInfo;->getRecoverable()Z

    .line 41
    .line 42
    .line 43
    move-result v2

    .line 44
    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 45
    .line 46
    .line 47
    move-result-object v2

    .line 48
    invoke-static {v3, v2}, Lqc/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 49
    .line 50
    .line 51
    move-result-object v2

    .line 52
    invoke-interface {v1, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 53
    .line 54
    .line 55
    goto :goto_0

    .line 56
    :cond_0
    return-object v1
.end method

.method public static final invalidateGroupsWithKey(I)V
    .locals 1

    .line 1
    sget-object v0, Landroidx/compose/runtime/HotReloader;->Companion:Landroidx/compose/runtime/HotReloader$Companion;

    .line 2
    .line 3
    invoke-virtual {v0, p0}, Landroidx/compose/runtime/HotReloader$Companion;->invalidateGroupsWithKey$runtime_release(I)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public static final simulateHotReload(Ljava/lang/Object;)V
    .locals 1

    .line 1
    sget-object v0, Landroidx/compose/runtime/HotReloader;->Companion:Landroidx/compose/runtime/HotReloader$Companion;

    .line 2
    .line 3
    invoke-virtual {v0, p0}, Landroidx/compose/runtime/HotReloader$Companion;->simulateHotReload$runtime_release(Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method
