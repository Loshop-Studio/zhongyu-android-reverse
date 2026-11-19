.class public final Lcom/zykj/mistake/feature/collection/list/MistakeCollectionScreenKt$MistakeCollectionListContent$lambda$33$lambda$32$lambda$31$$inlined$items$default$5;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lr6/g;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lr6/g;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0010\u0008\u001a\u00020\u0004\"\u0004\u0008\u0000\u0010\u0000*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u000b\u00a2\u0006\u0004\u0008\u0005\u0010\u0006\u00a8\u0006\u0007"
    }
    d2 = {
        "T",
        "Landroidx/compose/foundation/lazy/grid/LazyGridItemScope;",
        "",
        "it",
        "Ld6/s;",
        "invoke",
        "(Landroidx/compose/foundation/lazy/grid/LazyGridItemScope;ILandroidx/compose/runtime/Composer;I)V",
        "androidx/compose/foundation/lazy/grid/LazyGridDslKt$items$5",
        "<anonymous>"
    }
    k = 0x3
    mv = {
        0x2,
        0x2,
        0x0
    }
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nLazyGridDsl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyGridDsl.kt\nandroidx/compose/foundation/lazy/grid/LazyGridDslKt$items$5\n+ 2 MistakeCollectionScreen.kt\ncom/zykj/mistake/feature/collection/list/MistakeCollectionScreenKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,544:1\n235#2,5:545\n246#2:556\n252#2:563\n1247#3,6:550\n1247#3,6:557\n*S KotlinDebug\n*F\n+ 1 MistakeCollectionScreen.kt\ncom/zykj/mistake/feature/collection/list/MistakeCollectionScreenKt\n*L\n239#1:550,6\n246#1:557,6\n*E\n"
    }
.end annotation


# instance fields
.field final synthetic $items:Ljava/util/List;

.field final synthetic $onIntent$inlined:Lr6/c;

.field final synthetic $onOpenCollection$inlined:Lr6/c;

.field final synthetic $state$inlined:Lcom/zykj/mistake/feature/collection/list/v;


# direct methods
.method public constructor <init>(Ljava/util/List;Lcom/zykj/mistake/feature/collection/list/v;Lr6/c;Lr6/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/zykj/mistake/feature/collection/list/MistakeCollectionScreenKt$MistakeCollectionListContent$lambda$33$lambda$32$lambda$31$$inlined$items$default$5;->$items:Ljava/util/List;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/zykj/mistake/feature/collection/list/MistakeCollectionScreenKt$MistakeCollectionListContent$lambda$33$lambda$32$lambda$31$$inlined$items$default$5;->$state$inlined:Lcom/zykj/mistake/feature/collection/list/v;

    .line 4
    .line 5
    iput-object p3, p0, Lcom/zykj/mistake/feature/collection/list/MistakeCollectionScreenKt$MistakeCollectionListContent$lambda$33$lambda$32$lambda$31$$inlined$items$default$5;->$onIntent$inlined:Lr6/c;

    .line 6
    .line 7
    iput-object p4, p0, Lcom/zykj/mistake/feature/collection/list/MistakeCollectionScreenKt$MistakeCollectionListContent$lambda$33$lambda$32$lambda$31$$inlined$items$default$5;->$onOpenCollection$inlined:Lr6/c;

    .line 8
    .line 9
    const/4 p1, 0x4

    .line 10
    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    .line 11
    .line 12
    .line 13
    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Landroidx/compose/foundation/lazy/grid/LazyGridItemScope;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    check-cast p3, Landroidx/compose/runtime/Composer;

    check-cast p4, Ljava/lang/Number;

    invoke-virtual {p4}, Ljava/lang/Number;->intValue()I

    move-result p4

    invoke-virtual {p0, p1, p2, p3, p4}, Lcom/zykj/mistake/feature/collection/list/MistakeCollectionScreenKt$MistakeCollectionListContent$lambda$33$lambda$32$lambda$31$$inlined$items$default$5;->invoke(Landroidx/compose/foundation/lazy/grid/LazyGridItemScope;ILandroidx/compose/runtime/Composer;I)V

    sget-object p1, Ld6/s;->a:Ld6/s;

    return-object p1
.end method

.method public final invoke(Landroidx/compose/foundation/lazy/grid/LazyGridItemScope;ILandroidx/compose/runtime/Composer;I)V
    .locals 7
    .annotation build Landroidx/compose/runtime/Composable;
    .end annotation

    and-int/lit8 v0, p4, 0x6

    if-nez v0, :cond_1

    invoke-interface {p3, p1}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x4

    goto :goto_0

    :cond_0
    const/4 p1, 0x2

    :goto_0
    or-int/2addr p1, p4

    goto :goto_1

    :cond_1
    move p1, p4

    :goto_1
    and-int/lit8 p4, p4, 0x30

    if-nez p4, :cond_3

    invoke-interface {p3, p2}, Landroidx/compose/runtime/Composer;->changed(I)Z

    move-result p4

    if-eqz p4, :cond_2

    const/16 p4, 0x20

    goto :goto_2

    :cond_2
    const/16 p4, 0x10

    :goto_2
    or-int/2addr p1, p4

    :cond_3
    and-int/lit16 p4, p1, 0x93

    const/16 v0, 0x92

    if-eq p4, v0, :cond_4

    const/4 p4, 0x1

    goto :goto_3

    :cond_4
    const/4 p4, 0x0

    :goto_3
    and-int/lit8 v0, p1, 0x1

    .line 2
    invoke-interface {p3, p4, v0}, Landroidx/compose/runtime/Composer;->shouldExecute(ZI)Z

    move-result p4

    if-eqz p4, :cond_b

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result p4

    if-eqz p4, :cond_5

    const/4 p4, -0x1

    const-string v0, "androidx.compose.foundation.lazy.grid.items.<anonymous> (LazyGridDsl.kt:542)"

    const v1, 0x29b3c0fe

    invoke-static {v1, p1, p4, v0}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    :cond_5
    iget-object p1, p0, Lcom/zykj/mistake/feature/collection/list/MistakeCollectionScreenKt$MistakeCollectionListContent$lambda$33$lambda$32$lambda$31$$inlined$items$default$5;->$items:Ljava/util/List;

    invoke-interface {p1, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    move-object v0, p1

    check-cast v0, Lcom/zykj/mistake/feature/collection/list/b;

    const p1, 0x71c949b5

    .line 3
    invoke-interface {p3, p1}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    .line 4
    iget-object p1, p0, Lcom/zykj/mistake/feature/collection/list/MistakeCollectionScreenKt$MistakeCollectionListContent$lambda$33$lambda$32$lambda$31$$inlined$items$default$5;->$state$inlined:Lcom/zykj/mistake/feature/collection/list/v;

    .line 5
    iget-boolean p2, p1, Lcom/zykj/mistake/feature/collection/list/v;->k:Z

    .line 6
    iget-object p1, p1, Lcom/zykj/mistake/feature/collection/list/v;->l:Ljava/util/Set;

    .line 7
    iget-object p4, v0, Lcom/zykj/mistake/feature/collection/list/b;->a:Ljava/lang/String;

    .line 8
    invoke-interface {p1, p4}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result p1

    .line 9
    iget-object p4, p0, Lcom/zykj/mistake/feature/collection/list/MistakeCollectionScreenKt$MistakeCollectionListContent$lambda$33$lambda$32$lambda$31$$inlined$items$default$5;->$state$inlined:Lcom/zykj/mistake/feature/collection/list/v;

    invoke-interface {p3, p4}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result p4

    iget-object v1, p0, Lcom/zykj/mistake/feature/collection/list/MistakeCollectionScreenKt$MistakeCollectionListContent$lambda$33$lambda$32$lambda$31$$inlined$items$default$5;->$onIntent$inlined:Lr6/c;

    invoke-interface {p3, v1}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v1

    or-int/2addr p4, v1

    invoke-interface {p3, v0}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v1

    or-int/2addr p4, v1

    iget-object v1, p0, Lcom/zykj/mistake/feature/collection/list/MistakeCollectionScreenKt$MistakeCollectionListContent$lambda$33$lambda$32$lambda$31$$inlined$items$default$5;->$onOpenCollection$inlined:Lr6/c;

    invoke-interface {p3, v1}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v1

    or-int/2addr p4, v1

    .line 10
    invoke-interface {p3}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v1

    if-nez p4, :cond_6

    .line 11
    sget-object p4, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    invoke-virtual {p4}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object p4

    if-ne v1, p4, :cond_7

    :cond_6
    move-object v3, v0

    goto :goto_4

    :cond_7
    move-object v3, v0

    goto :goto_5

    .line 12
    :goto_4
    new-instance v0, Lcom/zykj/mistake/feature/collection/list/a0;

    iget-object v1, p0, Lcom/zykj/mistake/feature/collection/list/MistakeCollectionScreenKt$MistakeCollectionListContent$lambda$33$lambda$32$lambda$31$$inlined$items$default$5;->$state$inlined:Lcom/zykj/mistake/feature/collection/list/v;

    iget-object v2, p0, Lcom/zykj/mistake/feature/collection/list/MistakeCollectionScreenKt$MistakeCollectionListContent$lambda$33$lambda$32$lambda$31$$inlined$items$default$5;->$onIntent$inlined:Lr6/c;

    iget-object v4, p0, Lcom/zykj/mistake/feature/collection/list/MistakeCollectionScreenKt$MistakeCollectionListContent$lambda$33$lambda$32$lambda$31$$inlined$items$default$5;->$onOpenCollection$inlined:Lr6/c;

    const/4 v5, 0x0

    invoke-direct/range {v0 .. v5}, Lcom/zykj/mistake/feature/collection/list/a0;-><init>(Ljava/lang/Object;Lr6/c;Ljava/lang/Object;Lr6/c;I)V

    .line 13
    invoke-interface {p3, v0}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    move-object v1, v0

    .line 14
    :goto_5
    check-cast v1, Lr6/a;

    .line 15
    iget-object p4, p0, Lcom/zykj/mistake/feature/collection/list/MistakeCollectionScreenKt$MistakeCollectionListContent$lambda$33$lambda$32$lambda$31$$inlined$items$default$5;->$state$inlined:Lcom/zykj/mistake/feature/collection/list/v;

    invoke-interface {p3, p4}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result p4

    iget-object v0, p0, Lcom/zykj/mistake/feature/collection/list/MistakeCollectionScreenKt$MistakeCollectionListContent$lambda$33$lambda$32$lambda$31$$inlined$items$default$5;->$onIntent$inlined:Lr6/c;

    invoke-interface {p3, v0}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v0

    or-int/2addr p4, v0

    invoke-interface {p3, v3}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v0

    or-int/2addr p4, v0

    .line 16
    invoke-interface {p3}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v0

    if-nez p4, :cond_8

    .line 17
    sget-object p4, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    invoke-virtual {p4}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object p4

    if-ne v0, p4, :cond_9

    .line 18
    :cond_8
    new-instance v0, Lcom/zykj/mistake/feature/collection/list/b0;

    iget-object p4, p0, Lcom/zykj/mistake/feature/collection/list/MistakeCollectionScreenKt$MistakeCollectionListContent$lambda$33$lambda$32$lambda$31$$inlined$items$default$5;->$state$inlined:Lcom/zykj/mistake/feature/collection/list/v;

    iget-object v2, p0, Lcom/zykj/mistake/feature/collection/list/MistakeCollectionScreenKt$MistakeCollectionListContent$lambda$33$lambda$32$lambda$31$$inlined$items$default$5;->$onIntent$inlined:Lr6/c;

    const/4 v4, 0x0

    invoke-direct {v0, v4, p4, v3, v2}, Lcom/zykj/mistake/feature/collection/list/b0;-><init>(ILjava/lang/Object;Ljava/lang/Object;Lr6/c;)V

    .line 19
    invoke-interface {p3, v0}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 20
    :cond_9
    move-object v4, v0

    check-cast v4, Lr6/a;

    const/4 v6, 0x0

    move v2, p1

    move-object v5, p3

    move-object v0, v3

    move-object v3, v1

    move v1, p2

    .line 21
    invoke-static/range {v0 .. v6}, Lcom/zykj/mistake/feature/collection/list/c0;->b(Lcom/zykj/mistake/feature/collection/list/b;ZZLr6/a;Lr6/a;Landroidx/compose/runtime/Composer;I)V

    .line 22
    invoke-interface {v5}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    .line 23
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result p1

    if-eqz p1, :cond_a

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    :cond_a
    return-void

    :cond_b
    move-object v5, p3

    invoke-interface {v5}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    return-void
.end method
