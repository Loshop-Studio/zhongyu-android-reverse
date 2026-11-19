.class public final Landroidx/compose/runtime/ComposablesKt;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final synthetic ComposeNode(Lhd/a;Lhd/l;Landroidx/compose/runtime/Composer;I)V
    .locals 2
    .annotation build Landroidx/compose/runtime/Composable;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            "E::",
            "Landroidx/compose/runtime/Applier<",
            "*>;>(",
            "Lhd/a;",
            "Lhd/l;",
            "Landroidx/compose/runtime/Composer;",
            "I)V"
        }
    .end annotation

    .line 1
    invoke-interface {p2}, Landroidx/compose/runtime/Composer;->getApplier()Landroidx/compose/runtime/Applier;

    move-result-object p3

    const/4 v0, 0x3

    const-string v1, "E"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/u;->m(ILjava/lang/String;)V

    if-nez p3, :cond_0

    invoke-static {}, Landroidx/compose/runtime/ComposablesKt;->invalidApplier()V

    .line 2
    :cond_0
    invoke-interface {p2}, Landroidx/compose/runtime/Composer;->startNode()V

    .line 3
    invoke-interface {p2}, Landroidx/compose/runtime/Composer;->getInserting()Z

    move-result p3

    if-eqz p3, :cond_1

    .line 4
    invoke-interface {p2, p0}, Landroidx/compose/runtime/Composer;->createNode(Lhd/a;)V

    goto :goto_0

    .line 5
    :cond_1
    invoke-interface {p2}, Landroidx/compose/runtime/Composer;->useNode()V

    .line 6
    :goto_0
    invoke-static {p2}, Landroidx/compose/runtime/Updater;->constructor-impl(Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;

    move-result-object p0

    invoke-static {p0}, Landroidx/compose/runtime/Updater;->box-impl(Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Updater;

    move-result-object p0

    invoke-interface {p1, p0}, Lhd/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 7
    invoke-interface {p2}, Landroidx/compose/runtime/Composer;->endNode()V

    return-void
.end method

.method public static final synthetic ComposeNode(Lhd/a;Lhd/l;Lhd/p;Landroidx/compose/runtime/Composer;I)V
    .locals 3
    .annotation build Landroidx/compose/runtime/Composable;
    .end annotation

    .annotation build Landroidx/compose/runtime/ComposableInferredTarget;
        scheme = "[0[0]]"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            "E::",
            "Landroidx/compose/runtime/Applier<",
            "*>;>(",
            "Lhd/a;",
            "Lhd/l;",
            "Lhd/p;",
            "Landroidx/compose/runtime/Composer;",
            "I)V"
        }
    .end annotation

    .line 8
    invoke-interface {p3}, Landroidx/compose/runtime/Composer;->getApplier()Landroidx/compose/runtime/Applier;

    move-result-object v0

    const/4 v1, 0x3

    const-string v2, "E"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/u;->m(ILjava/lang/String;)V

    if-nez v0, :cond_0

    invoke-static {}, Landroidx/compose/runtime/ComposablesKt;->invalidApplier()V

    .line 9
    :cond_0
    invoke-interface {p3}, Landroidx/compose/runtime/Composer;->startNode()V

    .line 10
    invoke-interface {p3}, Landroidx/compose/runtime/Composer;->getInserting()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 11
    invoke-interface {p3, p0}, Landroidx/compose/runtime/Composer;->createNode(Lhd/a;)V

    goto :goto_0

    .line 12
    :cond_1
    invoke-interface {p3}, Landroidx/compose/runtime/Composer;->useNode()V

    .line 13
    :goto_0
    invoke-static {p3}, Landroidx/compose/runtime/Updater;->constructor-impl(Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;

    move-result-object p0

    invoke-static {p0}, Landroidx/compose/runtime/Updater;->box-impl(Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Updater;

    move-result-object p0

    invoke-interface {p1, p0}, Lhd/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    shr-int/lit8 p0, p4, 0x6

    and-int/lit8 p0, p0, 0xe

    .line 14
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    invoke-interface {p2, p3, p0}, Lhd/p;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 15
    invoke-interface {p3}, Landroidx/compose/runtime/Composer;->endNode()V

    return-void
.end method

.method public static final synthetic ComposeNode(Lhd/a;Lhd/l;Lhd/q;Lhd/p;Landroidx/compose/runtime/Composer;I)V
    .locals 3
    .annotation build Landroidx/compose/runtime/Composable;
    .end annotation

    .annotation build Landroidx/compose/runtime/ComposableInferredTarget;
        scheme = "[0[0][0]]"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            "E::",
            "Landroidx/compose/runtime/Applier<",
            "*>;>(",
            "Lhd/a;",
            "Lhd/l;",
            "Lhd/q;",
            "Lhd/p;",
            "Landroidx/compose/runtime/Composer;",
            "I)V"
        }
    .end annotation

    .line 16
    invoke-interface {p4}, Landroidx/compose/runtime/Composer;->getApplier()Landroidx/compose/runtime/Applier;

    move-result-object v0

    const/4 v1, 0x3

    const-string v2, "E"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/u;->m(ILjava/lang/String;)V

    if-nez v0, :cond_0

    invoke-static {}, Landroidx/compose/runtime/ComposablesKt;->invalidApplier()V

    .line 17
    :cond_0
    invoke-interface {p4}, Landroidx/compose/runtime/Composer;->startNode()V

    .line 18
    invoke-interface {p4}, Landroidx/compose/runtime/Composer;->getInserting()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 19
    invoke-interface {p4, p0}, Landroidx/compose/runtime/Composer;->createNode(Lhd/a;)V

    goto :goto_0

    .line 20
    :cond_1
    invoke-interface {p4}, Landroidx/compose/runtime/Composer;->useNode()V

    .line 21
    :goto_0
    invoke-static {p4}, Landroidx/compose/runtime/Updater;->constructor-impl(Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;

    move-result-object p0

    invoke-static {p0}, Landroidx/compose/runtime/Updater;->box-impl(Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Updater;

    move-result-object p0

    invoke-interface {p1, p0}, Lhd/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 22
    invoke-static {p4}, Landroidx/compose/runtime/SkippableUpdater;->constructor-impl(Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;

    move-result-object p0

    invoke-static {p0}, Landroidx/compose/runtime/SkippableUpdater;->box-impl(Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/SkippableUpdater;

    move-result-object p0

    shr-int/lit8 p1, p5, 0x3

    and-int/lit8 p1, p1, 0x70

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-interface {p2, p0, p4, p1}, Lhd/q;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const p0, 0x7ab4aae9

    .line 23
    invoke-interface {p4, p0}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    shr-int/lit8 p0, p5, 0x9

    and-int/lit8 p0, p0, 0xe

    .line 24
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    invoke-interface {p3, p4, p0}, Lhd/p;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 25
    invoke-interface {p4}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 26
    invoke-interface {p4}, Landroidx/compose/runtime/Composer;->endNode()V

    return-void
.end method

.method public static final synthetic ReusableComposeNode(Lhd/a;Lhd/l;Landroidx/compose/runtime/Composer;I)V
    .locals 2
    .annotation build Landroidx/compose/runtime/Composable;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            "E::",
            "Landroidx/compose/runtime/Applier<",
            "*>;>(",
            "Lhd/a;",
            "Lhd/l;",
            "Landroidx/compose/runtime/Composer;",
            "I)V"
        }
    .end annotation

    .line 1
    invoke-interface {p2}, Landroidx/compose/runtime/Composer;->getApplier()Landroidx/compose/runtime/Applier;

    move-result-object p3

    const/4 v0, 0x3

    const-string v1, "E"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/u;->m(ILjava/lang/String;)V

    if-nez p3, :cond_0

    invoke-static {}, Landroidx/compose/runtime/ComposablesKt;->invalidApplier()V

    .line 2
    :cond_0
    invoke-interface {p2}, Landroidx/compose/runtime/Composer;->startReusableNode()V

    .line 3
    invoke-interface {p2}, Landroidx/compose/runtime/Composer;->getInserting()Z

    move-result p3

    if-eqz p3, :cond_1

    .line 4
    invoke-interface {p2, p0}, Landroidx/compose/runtime/Composer;->createNode(Lhd/a;)V

    goto :goto_0

    .line 5
    :cond_1
    invoke-interface {p2}, Landroidx/compose/runtime/Composer;->useNode()V

    .line 6
    :goto_0
    invoke-static {p2}, Landroidx/compose/runtime/Updater;->constructor-impl(Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;

    move-result-object p0

    invoke-static {p0}, Landroidx/compose/runtime/Updater;->box-impl(Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Updater;

    move-result-object p0

    invoke-interface {p1, p0}, Lhd/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 7
    invoke-interface {p2}, Landroidx/compose/runtime/Composer;->endNode()V

    return-void
.end method

.method public static final synthetic ReusableComposeNode(Lhd/a;Lhd/l;Lhd/p;Landroidx/compose/runtime/Composer;I)V
    .locals 3
    .annotation build Landroidx/compose/runtime/Composable;
    .end annotation

    .annotation build Landroidx/compose/runtime/ComposableInferredTarget;
        scheme = "[0[0]]"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            "E::",
            "Landroidx/compose/runtime/Applier<",
            "*>;>(",
            "Lhd/a;",
            "Lhd/l;",
            "Lhd/p;",
            "Landroidx/compose/runtime/Composer;",
            "I)V"
        }
    .end annotation

    .line 8
    invoke-interface {p3}, Landroidx/compose/runtime/Composer;->getApplier()Landroidx/compose/runtime/Applier;

    move-result-object v0

    const/4 v1, 0x3

    const-string v2, "E"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/u;->m(ILjava/lang/String;)V

    if-nez v0, :cond_0

    invoke-static {}, Landroidx/compose/runtime/ComposablesKt;->invalidApplier()V

    .line 9
    :cond_0
    invoke-interface {p3}, Landroidx/compose/runtime/Composer;->startReusableNode()V

    .line 10
    invoke-interface {p3}, Landroidx/compose/runtime/Composer;->getInserting()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 11
    invoke-interface {p3, p0}, Landroidx/compose/runtime/Composer;->createNode(Lhd/a;)V

    goto :goto_0

    .line 12
    :cond_1
    invoke-interface {p3}, Landroidx/compose/runtime/Composer;->useNode()V

    .line 13
    :goto_0
    invoke-static {p3}, Landroidx/compose/runtime/Updater;->constructor-impl(Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;

    move-result-object p0

    invoke-static {p0}, Landroidx/compose/runtime/Updater;->box-impl(Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Updater;

    move-result-object p0

    invoke-interface {p1, p0}, Lhd/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    shr-int/lit8 p0, p4, 0x6

    and-int/lit8 p0, p0, 0xe

    .line 14
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    invoke-interface {p2, p3, p0}, Lhd/p;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 15
    invoke-interface {p3}, Landroidx/compose/runtime/Composer;->endNode()V

    return-void
.end method

.method public static final synthetic ReusableComposeNode(Lhd/a;Lhd/l;Lhd/q;Lhd/p;Landroidx/compose/runtime/Composer;I)V
    .locals 3
    .annotation build Landroidx/compose/runtime/Composable;
    .end annotation

    .annotation build Landroidx/compose/runtime/ComposableInferredTarget;
        scheme = "[0[0][0]]"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            "E::",
            "Landroidx/compose/runtime/Applier<",
            "*>;>(",
            "Lhd/a;",
            "Lhd/l;",
            "Lhd/q;",
            "Lhd/p;",
            "Landroidx/compose/runtime/Composer;",
            "I)V"
        }
    .end annotation

    .line 16
    invoke-interface {p4}, Landroidx/compose/runtime/Composer;->getApplier()Landroidx/compose/runtime/Applier;

    move-result-object v0

    const/4 v1, 0x3

    const-string v2, "E"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/u;->m(ILjava/lang/String;)V

    if-nez v0, :cond_0

    invoke-static {}, Landroidx/compose/runtime/ComposablesKt;->invalidApplier()V

    .line 17
    :cond_0
    invoke-interface {p4}, Landroidx/compose/runtime/Composer;->startReusableNode()V

    .line 18
    invoke-interface {p4}, Landroidx/compose/runtime/Composer;->getInserting()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 19
    invoke-interface {p4, p0}, Landroidx/compose/runtime/Composer;->createNode(Lhd/a;)V

    goto :goto_0

    .line 20
    :cond_1
    invoke-interface {p4}, Landroidx/compose/runtime/Composer;->useNode()V

    .line 21
    :goto_0
    invoke-static {p4}, Landroidx/compose/runtime/Updater;->constructor-impl(Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;

    move-result-object p0

    invoke-static {p0}, Landroidx/compose/runtime/Updater;->box-impl(Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Updater;

    move-result-object p0

    invoke-interface {p1, p0}, Lhd/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 22
    invoke-static {p4}, Landroidx/compose/runtime/SkippableUpdater;->constructor-impl(Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;

    move-result-object p0

    invoke-static {p0}, Landroidx/compose/runtime/SkippableUpdater;->box-impl(Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/SkippableUpdater;

    move-result-object p0

    shr-int/lit8 p1, p5, 0x3

    and-int/lit8 p1, p1, 0x70

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-interface {p2, p0, p4, p1}, Lhd/q;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const p0, 0x7ab4aae9

    .line 23
    invoke-interface {p4, p0}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    shr-int/lit8 p0, p5, 0x9

    and-int/lit8 p0, p0, 0xe

    .line 24
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    invoke-interface {p3, p4, p0}, Lhd/p;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 25
    invoke-interface {p4}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 26
    invoke-interface {p4}, Landroidx/compose/runtime/Composer;->endNode()V

    return-void
.end method

.method public static final ReusableContent(Ljava/lang/Object;Lhd/p;Landroidx/compose/runtime/Composer;I)V
    .locals 1
    .annotation build Landroidx/compose/runtime/Composable;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            "Lhd/p;",
            "Landroidx/compose/runtime/Composer;",
            "I)V"
        }
    .end annotation

    .line 1
    const/16 v0, 0xcf

    .line 2
    .line 3
    invoke-interface {p2, v0, p0}, Landroidx/compose/runtime/Composer;->startReusableGroup(ILjava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    shr-int/lit8 p0, p3, 0x3

    .line 7
    .line 8
    and-int/lit8 p0, p0, 0xe

    .line 9
    .line 10
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    invoke-interface {p1, p2, p0}, Lhd/p;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    invoke-interface {p2}, Landroidx/compose/runtime/Composer;->endReusableGroup()V

    .line 18
    .line 19
    .line 20
    return-void
.end method

.method public static final ReusableContentHost(ZLhd/p;Landroidx/compose/runtime/Composer;I)V
    .locals 2
    .annotation build Landroidx/compose/runtime/Composable;
    .end annotation

    .annotation build Landroidx/compose/runtime/ComposableInferredTarget;
        scheme = "[0[0]]"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z",
            "Lhd/p;",
            "Landroidx/compose/runtime/Composer;",
            "I)V"
        }
    .end annotation

    .line 1
    const/16 v0, 0xcf

    .line 2
    .line 3
    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-interface {p2, v0, v1}, Landroidx/compose/runtime/Composer;->startReusableGroup(ILjava/lang/Object;)V

    .line 8
    .line 9
    .line 10
    invoke-interface {p2, p0}, Landroidx/compose/runtime/Composer;->changed(Z)Z

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    if-eqz p0, :cond_0

    .line 15
    .line 16
    shr-int/lit8 p0, p3, 0x3

    .line 17
    .line 18
    and-int/lit8 p0, p0, 0xe

    .line 19
    .line 20
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    invoke-interface {p1, p2, p0}, Lhd/p;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_0
    invoke-interface {p2, v0}, Landroidx/compose/runtime/Composer;->deactivateToEndGroup(Z)V

    .line 29
    .line 30
    .line 31
    :goto_0
    invoke-interface {p2}, Landroidx/compose/runtime/Composer;->endReusableGroup()V

    .line 32
    .line 33
    .line 34
    return-void
.end method

.method public static final getCurrentComposer(Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/Composer;
    .locals 2
    .annotation build Landroidx/compose/runtime/Composable;
    .end annotation

    .annotation build Landroidx/compose/runtime/ReadOnlyComposable;
    .end annotation

    .line 1
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    if-eqz p0, :cond_0

    .line 6
    .line 7
    const/4 p0, -0x1

    .line 8
    const-string v0, "androidx.compose.runtime.<get-currentComposer> (Composables.kt:172)"

    .line 9
    .line 10
    const v1, -0x21092fe4

    .line 11
    .line 12
    .line 13
    invoke-static {v1, p1, p0, v0}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 14
    .line 15
    .line 16
    :cond_0
    new-instance p0, Lkotlin/NotImplementedError;

    .line 17
    .line 18
    const-string p1, "Implemented as an intrinsic"

    .line 19
    .line 20
    invoke-direct {p0, p1}, Lkotlin/NotImplementedError;-><init>(Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    throw p0
.end method

.method public static final getCurrentCompositeKeyHash(Landroidx/compose/runtime/Composer;I)I
    .locals 3
    .annotation build Landroidx/compose/runtime/Composable;
    .end annotation

    .line 1
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    const/4 v0, -0x1

    .line 8
    const-string v1, "androidx.compose.runtime.<get-currentCompositeKeyHash> (Composables.kt:213)"

    .line 9
    .line 10
    const v2, 0x1f4264f3

    .line 11
    .line 12
    .line 13
    invoke-static {v2, p1, v0, v1}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 14
    .line 15
    .line 16
    :cond_0
    invoke-interface {p0}, Landroidx/compose/runtime/Composer;->getCompoundKeyHash()I

    .line 17
    .line 18
    .line 19
    move-result p0

    .line 20
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 21
    .line 22
    .line 23
    move-result p1

    .line 24
    if-eqz p1, :cond_1

    .line 25
    .line 26
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 27
    .line 28
    .line 29
    :cond_1
    return p0
.end method

.method public static final getCurrentCompositionLocalContext(Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/CompositionLocalContext;
    .locals 3
    .annotation build Landroidx/compose/runtime/Composable;
    .end annotation

    .line 1
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    const/4 v0, -0x1

    .line 8
    const-string v1, "androidx.compose.runtime.<get-currentCompositionLocalContext> (Composables.kt:199)"

    .line 9
    .line 10
    const v2, -0x2958124

    .line 11
    .line 12
    .line 13
    invoke-static {v2, p1, v0, v1}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 14
    .line 15
    .line 16
    :cond_0
    new-instance p1, Landroidx/compose/runtime/CompositionLocalContext;

    .line 17
    .line 18
    invoke-interface {p0}, Landroidx/compose/runtime/Composer;->buildContext()Landroidx/compose/runtime/CompositionContext;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    invoke-virtual {p0}, Landroidx/compose/runtime/CompositionContext;->getCompositionLocalScope$runtime_release()Landroidx/compose/runtime/PersistentCompositionLocalMap;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    invoke-direct {p1, p0}, Landroidx/compose/runtime/CompositionLocalContext;-><init>(Landroidx/compose/runtime/PersistentCompositionLocalMap;)V

    .line 27
    .line 28
    .line 29
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 30
    .line 31
    .line 32
    move-result p0

    .line 33
    if-eqz p0, :cond_1

    .line 34
    .line 35
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 36
    .line 37
    .line 38
    :cond_1
    return-object p1
.end method

.method public static synthetic getCurrentCompositionLocalContext$annotations()V
    .locals 0

    return-void
.end method

.method public static final getCurrentRecomposeScope(Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/RecomposeScope;
    .locals 3
    .annotation build Landroidx/compose/runtime/Composable;
    .end annotation

    .annotation build Landroidx/compose/runtime/ReadOnlyComposable;
    .end annotation

    .line 1
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    const/4 v0, -0x1

    .line 8
    const-string v1, "androidx.compose.runtime.<get-currentRecomposeScope> (Composables.kt:184)"

    .line 9
    .line 10
    const v2, 0x178a93e7

    .line 11
    .line 12
    .line 13
    invoke-static {v2, p1, v0, v1}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 14
    .line 15
    .line 16
    :cond_0
    invoke-interface {p0}, Landroidx/compose/runtime/Composer;->getRecomposeScope()Landroidx/compose/runtime/RecomposeScope;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    if-eqz p1, :cond_2

    .line 21
    .line 22
    invoke-interface {p0, p1}, Landroidx/compose/runtime/Composer;->recordUsed(Landroidx/compose/runtime/RecomposeScope;)V

    .line 23
    .line 24
    .line 25
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 26
    .line 27
    .line 28
    move-result p0

    .line 29
    if-eqz p0, :cond_1

    .line 30
    .line 31
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 32
    .line 33
    .line 34
    :cond_1
    return-object p1

    .line 35
    :cond_2
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 36
    .line 37
    const-string p1, "no recompose scope found"

    .line 38
    .line 39
    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 40
    .line 41
    .line 42
    throw p0
.end method

.method public static final invalidApplier()V
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 2
    .line 3
    const-string v1, "Invalid applier"

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    throw v0
.end method

.method public static final key([Ljava/lang/Object;Lhd/p;Landroidx/compose/runtime/Composer;I)Ljava/lang/Object;
    .locals 0
    .annotation build Landroidx/compose/runtime/Composable;
    .end annotation

    .annotation build Landroidx/compose/runtime/ComposableInferredTarget;
        scheme = "[0[0]]"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">([",
            "Ljava/lang/Object;",
            "Lhd/p;",
            "Landroidx/compose/runtime/Composer;",
            "I)TT;"
        }
    .end annotation

    .line 1
    shr-int/lit8 p0, p3, 0x3

    .line 2
    .line 3
    and-int/lit8 p0, p0, 0xe

    .line 4
    .line 5
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    invoke-interface {p1, p2, p0}, Lhd/p;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    return-object p0
.end method

.method public static final remember(Lhd/a;Landroidx/compose/runtime/Composer;I)Ljava/lang/Object;
    .locals 1
    .annotation build Landroidx/compose/runtime/Composable;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lhd/a;",
            "Landroidx/compose/runtime/Composer;",
            "I)TT;"
        }
    .end annotation

    .line 23
    invoke-interface {p1}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object p2

    .line 24
    sget-object v0, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    invoke-virtual {v0}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v0

    if-ne p2, v0, :cond_0

    .line 25
    invoke-interface {p0}, Lhd/a;->invoke()Ljava/lang/Object;

    move-result-object p0

    .line 26
    invoke-interface {p1, p0}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    return-object p0

    :cond_0
    return-object p2
.end method

.method public static final remember(Ljava/lang/Object;Lhd/a;Landroidx/compose/runtime/Composer;I)Ljava/lang/Object;
    .locals 0
    .annotation build Landroidx/compose/runtime/Composable;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Object;",
            "Lhd/a;",
            "Landroidx/compose/runtime/Composer;",
            "I)TT;"
        }
    .end annotation

    .line 1
    invoke-interface {p2, p0}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result p0

    .line 2
    invoke-interface {p2}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object p3

    if-nez p0, :cond_1

    .line 3
    sget-object p0, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    invoke-virtual {p0}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object p0

    if-ne p3, p0, :cond_0

    goto :goto_0

    :cond_0
    return-object p3

    .line 4
    :cond_1
    :goto_0
    invoke-interface {p1}, Lhd/a;->invoke()Ljava/lang/Object;

    move-result-object p0

    .line 5
    invoke-interface {p2, p0}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    return-object p0
.end method

.method public static final remember(Ljava/lang/Object;Ljava/lang/Object;Lhd/a;Landroidx/compose/runtime/Composer;I)Ljava/lang/Object;
    .locals 0
    .annotation build Landroidx/compose/runtime/Composable;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Object;",
            "Ljava/lang/Object;",
            "Lhd/a;",
            "Landroidx/compose/runtime/Composer;",
            "I)TT;"
        }
    .end annotation

    .line 6
    invoke-interface {p3, p0}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result p0

    invoke-interface {p3, p1}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result p1

    or-int/2addr p0, p1

    .line 7
    invoke-interface {p3}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object p1

    if-nez p0, :cond_1

    .line 8
    sget-object p0, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    invoke-virtual {p0}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object p0

    if-ne p1, p0, :cond_0

    goto :goto_0

    :cond_0
    return-object p1

    .line 9
    :cond_1
    :goto_0
    invoke-interface {p2}, Lhd/a;->invoke()Ljava/lang/Object;

    move-result-object p0

    .line 10
    invoke-interface {p3, p0}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    return-object p0
.end method

.method public static final remember(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lhd/a;Landroidx/compose/runtime/Composer;I)Ljava/lang/Object;
    .locals 0
    .annotation build Landroidx/compose/runtime/Composable;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Object;",
            "Ljava/lang/Object;",
            "Ljava/lang/Object;",
            "Lhd/a;",
            "Landroidx/compose/runtime/Composer;",
            "I)TT;"
        }
    .end annotation

    .line 11
    invoke-interface {p4, p0}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result p0

    .line 12
    invoke-interface {p4, p1}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result p1

    or-int/2addr p0, p1

    .line 13
    invoke-interface {p4, p2}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result p1

    or-int/2addr p0, p1

    .line 14
    invoke-interface {p4}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object p1

    if-nez p0, :cond_1

    .line 15
    sget-object p0, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    invoke-virtual {p0}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object p0

    if-ne p1, p0, :cond_0

    goto :goto_0

    :cond_0
    return-object p1

    .line 16
    :cond_1
    :goto_0
    invoke-interface {p3}, Lhd/a;->invoke()Ljava/lang/Object;

    move-result-object p0

    .line 17
    invoke-interface {p4, p0}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    return-object p0
.end method

.method public static final remember([Ljava/lang/Object;Lhd/a;Landroidx/compose/runtime/Composer;I)Ljava/lang/Object;
    .locals 3
    .annotation build Landroidx/compose/runtime/Composable;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">([",
            "Ljava/lang/Object;",
            "Lhd/a;",
            "Landroidx/compose/runtime/Composer;",
            "I)TT;"
        }
    .end annotation

    .line 18
    array-length p3, p0

    const/4 v0, 0x0

    move v1, v0

    :goto_0
    if-ge v0, p3, :cond_0

    aget-object v2, p0, v0

    invoke-interface {p2, v2}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v2

    or-int/2addr v1, v2

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 19
    :cond_0
    invoke-interface {p2}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object p0

    if-nez v1, :cond_2

    .line 20
    sget-object p3, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    invoke-virtual {p3}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object p3

    if-ne p0, p3, :cond_1

    goto :goto_1

    :cond_1
    return-object p0

    .line 21
    :cond_2
    :goto_1
    invoke-interface {p1}, Lhd/a;->invoke()Ljava/lang/Object;

    move-result-object p0

    .line 22
    invoke-interface {p2, p0}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    return-object p0
.end method

.method public static final rememberCompositionContext(Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/CompositionContext;
    .locals 3
    .annotation build Landroidx/compose/runtime/Composable;
    .end annotation

    .line 1
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    const/4 v0, -0x1

    .line 8
    const-string v1, "androidx.compose.runtime.rememberCompositionContext (Composables.kt:461)"

    .line 9
    .line 10
    const v2, -0x457c7c0c

    .line 11
    .line 12
    .line 13
    invoke-static {v2, p1, v0, v1}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 14
    .line 15
    .line 16
    :cond_0
    invoke-interface {p0}, Landroidx/compose/runtime/Composer;->buildContext()Landroidx/compose/runtime/CompositionContext;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 21
    .line 22
    .line 23
    move-result p1

    .line 24
    if-eqz p1, :cond_1

    .line 25
    .line 26
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 27
    .line 28
    .line 29
    :cond_1
    return-object p0
.end method
