.class public final Lcom/zykj/mistake/feature/collection/component/MistakeQuestionGridKt$MistakeQuestionGrid$lambda$12$lambda$11$lambda$10$$inlined$items$default$5;
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
        "SMAP\nLazyGridDsl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyGridDsl.kt\nandroidx/compose/foundation/lazy/grid/LazyGridDslKt$items$5\n+ 2 MistakeQuestionGrid.kt\ncom/zykj/mistake/feature/collection/component/MistakeQuestionGridKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,544:1\n107#2,7:545\n114#2,2:558\n118#2:566\n1247#3,6:552\n1247#3,6:560\n*S KotlinDebug\n*F\n+ 1 MistakeQuestionGrid.kt\ncom/zykj/mistake/feature/collection/component/MistakeQuestionGridKt\n*L\n113#1:552,6\n115#1:560,6\n*E\n"
    }
.end annotation


# instance fields
.field final synthetic $disabledItemIds$inlined:Ljava/util/Set;

.field final synthetic $isSelectionMode$inlined:Z

.field final synthetic $items:Ljava/util/List;

.field final synthetic $onItemClick$inlined:Lr6/c;

.field final synthetic $onItemLongClick$inlined:Lr6/c;

.field final synthetic $selectedItemIds$inlined:Ljava/util/Set;


# direct methods
.method public constructor <init>(Ljava/util/List;Ljava/util/Set;ZLjava/util/Set;Lr6/c;Lr6/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/zykj/mistake/feature/collection/component/MistakeQuestionGridKt$MistakeQuestionGrid$lambda$12$lambda$11$lambda$10$$inlined$items$default$5;->$items:Ljava/util/List;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/zykj/mistake/feature/collection/component/MistakeQuestionGridKt$MistakeQuestionGrid$lambda$12$lambda$11$lambda$10$$inlined$items$default$5;->$disabledItemIds$inlined:Ljava/util/Set;

    .line 4
    .line 5
    iput-boolean p3, p0, Lcom/zykj/mistake/feature/collection/component/MistakeQuestionGridKt$MistakeQuestionGrid$lambda$12$lambda$11$lambda$10$$inlined$items$default$5;->$isSelectionMode$inlined:Z

    .line 6
    .line 7
    iput-object p4, p0, Lcom/zykj/mistake/feature/collection/component/MistakeQuestionGridKt$MistakeQuestionGrid$lambda$12$lambda$11$lambda$10$$inlined$items$default$5;->$selectedItemIds$inlined:Ljava/util/Set;

    .line 8
    .line 9
    iput-object p5, p0, Lcom/zykj/mistake/feature/collection/component/MistakeQuestionGridKt$MistakeQuestionGrid$lambda$12$lambda$11$lambda$10$$inlined$items$default$5;->$onItemClick$inlined:Lr6/c;

    .line 10
    .line 11
    iput-object p6, p0, Lcom/zykj/mistake/feature/collection/component/MistakeQuestionGridKt$MistakeQuestionGrid$lambda$12$lambda$11$lambda$10$$inlined$items$default$5;->$onItemLongClick$inlined:Lr6/c;

    .line 12
    .line 13
    const/4 p1, 0x4

    .line 14
    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    .line 15
    .line 16
    .line 17
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

    invoke-virtual {p0, p1, p2, p3, p4}, Lcom/zykj/mistake/feature/collection/component/MistakeQuestionGridKt$MistakeQuestionGrid$lambda$12$lambda$11$lambda$10$$inlined$items$default$5;->invoke(Landroidx/compose/foundation/lazy/grid/LazyGridItemScope;ILandroidx/compose/runtime/Composer;I)V

    sget-object p1, Ld6/s;->a:Ld6/s;

    return-object p1
.end method

.method public final invoke(Landroidx/compose/foundation/lazy/grid/LazyGridItemScope;ILandroidx/compose/runtime/Composer;I)V
    .locals 8
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

    if-eqz p4, :cond_c

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result p4

    if-eqz p4, :cond_5

    const/4 p4, -0x1

    const-string v0, "androidx.compose.foundation.lazy.grid.items.<anonymous> (LazyGridDsl.kt:542)"

    const v1, 0x29b3c0fe

    invoke-static {v1, p1, p4, v0}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    :cond_5
    iget-object p1, p0, Lcom/zykj/mistake/feature/collection/component/MistakeQuestionGridKt$MistakeQuestionGrid$lambda$12$lambda$11$lambda$10$$inlined$items$default$5;->$items:Ljava/util/List;

    invoke-interface {p1, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    move-object v0, p1

    check-cast v0, Lp4/b;

    const p1, 0x5cc6a76e

    .line 3
    invoke-interface {p3, p1}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    iget-object p1, p0, Lcom/zykj/mistake/feature/collection/component/MistakeQuestionGridKt$MistakeQuestionGrid$lambda$12$lambda$11$lambda$10$$inlined$items$default$5;->$disabledItemIds$inlined:Ljava/util/Set;

    .line 4
    iget-object p2, v0, Lp4/b;->a:Ljava/lang/String;

    .line 5
    invoke-interface {p1, p2}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v3

    .line 6
    iget-boolean v1, p0, Lcom/zykj/mistake/feature/collection/component/MistakeQuestionGridKt$MistakeQuestionGrid$lambda$12$lambda$11$lambda$10$$inlined$items$default$5;->$isSelectionMode$inlined:Z

    .line 7
    iget-object p1, p0, Lcom/zykj/mistake/feature/collection/component/MistakeQuestionGridKt$MistakeQuestionGrid$lambda$12$lambda$11$lambda$10$$inlined$items$default$5;->$selectedItemIds$inlined:Ljava/util/Set;

    .line 8
    iget-object p2, v0, Lp4/b;->a:Ljava/lang/String;

    .line 9
    invoke-interface {p1, p2}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v2

    .line 10
    iget-object p1, p0, Lcom/zykj/mistake/feature/collection/component/MistakeQuestionGridKt$MistakeQuestionGrid$lambda$12$lambda$11$lambda$10$$inlined$items$default$5;->$onItemClick$inlined:Lr6/c;

    invoke-interface {p3, p1}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result p1

    invoke-interface {p3, v0}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result p2

    or-int/2addr p1, p2

    .line 11
    invoke-interface {p3}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object p2

    if-nez p1, :cond_6

    .line 12
    sget-object p1, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    invoke-virtual {p1}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object p1

    if-ne p2, p1, :cond_7

    .line 13
    :cond_6
    new-instance p2, Lcom/zykj/mistake/feature/collection/component/n;

    iget-object p1, p0, Lcom/zykj/mistake/feature/collection/component/MistakeQuestionGridKt$MistakeQuestionGrid$lambda$12$lambda$11$lambda$10$$inlined$items$default$5;->$onItemClick$inlined:Lr6/c;

    const/4 p4, 0x0

    invoke-direct {p2, p1, v0, p4}, Lcom/zykj/mistake/feature/collection/component/n;-><init>(Lr6/c;Lp4/b;I)V

    .line 14
    invoke-interface {p3, p2}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 15
    :cond_7
    move-object v4, p2

    check-cast v4, Lr6/a;

    .line 16
    iget-object p1, p0, Lcom/zykj/mistake/feature/collection/component/MistakeQuestionGridKt$MistakeQuestionGrid$lambda$12$lambda$11$lambda$10$$inlined$items$default$5;->$onItemLongClick$inlined:Lr6/c;

    if-nez p1, :cond_8

    const p1, 0x5ccc6887

    invoke-interface {p3, p1}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    invoke-interface {p3}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    const/4 p1, 0x0

    :goto_4
    move-object v5, p1

    goto :goto_5

    :cond_8
    const p1, 0x5ccc6888

    invoke-interface {p3, p1}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    iget-object p1, p0, Lcom/zykj/mistake/feature/collection/component/MistakeQuestionGridKt$MistakeQuestionGrid$lambda$12$lambda$11$lambda$10$$inlined$items$default$5;->$onItemLongClick$inlined:Lr6/c;

    .line 17
    invoke-interface {p3, p1}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result p2

    invoke-interface {p3, v0}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result p4

    or-int/2addr p2, p4

    .line 18
    invoke-interface {p3}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object p4

    if-nez p2, :cond_9

    .line 19
    sget-object p2, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    invoke-virtual {p2}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object p2

    if-ne p4, p2, :cond_a

    .line 20
    :cond_9
    new-instance p4, Lcom/zykj/mistake/feature/collection/component/n;

    const/4 p2, 0x1

    invoke-direct {p4, p1, v0, p2}, Lcom/zykj/mistake/feature/collection/component/n;-><init>(Lr6/c;Lp4/b;I)V

    .line 21
    invoke-interface {p3, p4}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 22
    :cond_a
    move-object p1, p4

    check-cast p1, Lr6/a;

    .line 23
    invoke-interface {p3}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    goto :goto_4

    :goto_5
    const/4 v7, 0x0

    move-object v6, p3

    .line 24
    invoke-static/range {v0 .. v7}, Lcom/zykj/mistake/feature/collection/component/o;->a(Lp4/b;ZZZLr6/a;Lr6/a;Landroidx/compose/runtime/Composer;I)V

    .line 25
    invoke-interface {v6}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    .line 26
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result p1

    if-eqz p1, :cond_b

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    :cond_b
    return-void

    :cond_c
    move-object v6, p3

    invoke-interface {v6}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    return-void
.end method
