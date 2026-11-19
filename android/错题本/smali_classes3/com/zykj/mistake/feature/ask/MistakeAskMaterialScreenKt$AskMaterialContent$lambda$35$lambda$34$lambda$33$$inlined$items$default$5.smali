.class public final Lcom/zykj/mistake/feature/ask/MistakeAskMaterialScreenKt$AskMaterialContent$lambda$35$lambda$34$lambda$33$$inlined$items$default$5;
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
        "SMAP\nLazyGridDsl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyGridDsl.kt\nandroidx/compose/foundation/lazy/grid/LazyGridDslKt$items$5\n+ 2 MistakeAskMaterialScreen.kt\ncom/zykj/mistake/feature/ask/MistakeAskMaterialScreenKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,544:1\n246#2,6:545\n255#2:557\n1247#3,6:551\n*S KotlinDebug\n*F\n+ 1 MistakeAskMaterialScreen.kt\ncom/zykj/mistake/feature/ask/MistakeAskMaterialScreenKt\n*L\n251#1:551,6\n*E\n"
    }
.end annotation


# instance fields
.field final synthetic $group$inlined:Lcom/zykj/mistake/feature/ask/n;

.field final synthetic $items:Ljava/util/List;

.field final synthetic $onIntent$inlined:Lr6/c;


# direct methods
.method public constructor <init>(Ljava/util/List;Lcom/zykj/mistake/feature/ask/n;Lr6/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/zykj/mistake/feature/ask/MistakeAskMaterialScreenKt$AskMaterialContent$lambda$35$lambda$34$lambda$33$$inlined$items$default$5;->$items:Ljava/util/List;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/zykj/mistake/feature/ask/MistakeAskMaterialScreenKt$AskMaterialContent$lambda$35$lambda$34$lambda$33$$inlined$items$default$5;->$group$inlined:Lcom/zykj/mistake/feature/ask/n;

    .line 4
    .line 5
    iput-object p3, p0, Lcom/zykj/mistake/feature/ask/MistakeAskMaterialScreenKt$AskMaterialContent$lambda$35$lambda$34$lambda$33$$inlined$items$default$5;->$onIntent$inlined:Lr6/c;

    .line 6
    .line 7
    const/4 p1, 0x4

    .line 8
    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    .line 9
    .line 10
    .line 11
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

    invoke-virtual {p0, p1, p2, p3, p4}, Lcom/zykj/mistake/feature/ask/MistakeAskMaterialScreenKt$AskMaterialContent$lambda$35$lambda$34$lambda$33$$inlined$items$default$5;->invoke(Landroidx/compose/foundation/lazy/grid/LazyGridItemScope;ILandroidx/compose/runtime/Composer;I)V

    sget-object p1, Ld6/s;->a:Ld6/s;

    return-object p1
.end method

.method public final invoke(Landroidx/compose/foundation/lazy/grid/LazyGridItemScope;ILandroidx/compose/runtime/Composer;I)V
    .locals 10
    .annotation build Landroidx/compose/runtime/Composable;
    .end annotation

    and-int/lit8 v0, p4, 0x6

    const/4 v1, 0x2

    if-nez v0, :cond_1

    invoke-interface {p3, p1}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x4

    goto :goto_0

    :cond_0
    move p1, v1

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

    const/4 v2, 0x0

    if-eq p4, v0, :cond_4

    const/4 p4, 0x1

    goto :goto_3

    :cond_4
    move p4, v2

    :goto_3
    and-int/lit8 v0, p1, 0x1

    .line 2
    invoke-interface {p3, p4, v0}, Landroidx/compose/runtime/Composer;->shouldExecute(ZI)Z

    move-result p4

    if-eqz p4, :cond_9

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result p4

    if-eqz p4, :cond_5

    const/4 p4, -0x1

    const-string v0, "androidx.compose.foundation.lazy.grid.items.<anonymous> (LazyGridDsl.kt:542)"

    const v3, 0x29b3c0fe

    invoke-static {v3, p1, p4, v0}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    :cond_5
    iget-object p1, p0, Lcom/zykj/mistake/feature/ask/MistakeAskMaterialScreenKt$AskMaterialContent$lambda$35$lambda$34$lambda$33$$inlined$items$default$5;->$items:Ljava/util/List;

    invoke-interface {p1, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    move-object v4, p1

    check-cast v4, Lcom/zykj/mistake/feature/ask/y;

    const p1, -0x6f364432

    .line 3
    invoke-interface {p3, p1}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    .line 4
    iget-object p1, p0, Lcom/zykj/mistake/feature/ask/MistakeAskMaterialScreenKt$AskMaterialContent$lambda$35$lambda$34$lambda$33$$inlined$items$default$5;->$group$inlined:Lcom/zykj/mistake/feature/ask/n;

    .line 5
    iget-object v3, p1, Lcom/zykj/mistake/feature/ask/n;->a:Lcom/zykj/mistake/feature/ask/MistakeAskMaterialContract$MaterialType;

    .line 6
    sget-object p1, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    const p2, 0x3fd33333    # 1.65f

    const/4 p4, 0x0

    invoke-static {p1, p2, v2, v1, p4}, Landroidx/compose/foundation/layout/AspectRatioKt;->aspectRatio$default(Landroidx/compose/ui/Modifier;FZILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    .line 7
    iget-object p1, p0, Lcom/zykj/mistake/feature/ask/MistakeAskMaterialScreenKt$AskMaterialContent$lambda$35$lambda$34$lambda$33$$inlined$items$default$5;->$onIntent$inlined:Lr6/c;

    invoke-interface {p3, p1}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result p1

    iget-object p2, p0, Lcom/zykj/mistake/feature/ask/MistakeAskMaterialScreenKt$AskMaterialContent$lambda$35$lambda$34$lambda$33$$inlined$items$default$5;->$group$inlined:Lcom/zykj/mistake/feature/ask/n;

    invoke-interface {p3, p2}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result p2

    or-int/2addr p1, p2

    invoke-interface {p3, v4}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result p2

    or-int/2addr p1, p2

    .line 8
    invoke-interface {p3}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object p2

    if-nez p1, :cond_6

    .line 9
    sget-object p1, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    invoke-virtual {p1}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object p1

    if-ne p2, p1, :cond_7

    .line 10
    :cond_6
    new-instance p2, Lcom/zykj/mistake/feature/ask/m0;

    iget-object p1, p0, Lcom/zykj/mistake/feature/ask/MistakeAskMaterialScreenKt$AskMaterialContent$lambda$35$lambda$34$lambda$33$$inlined$items$default$5;->$onIntent$inlined:Lr6/c;

    iget-object p4, p0, Lcom/zykj/mistake/feature/ask/MistakeAskMaterialScreenKt$AskMaterialContent$lambda$35$lambda$34$lambda$33$$inlined$items$default$5;->$group$inlined:Lcom/zykj/mistake/feature/ask/n;

    const/4 v0, 0x2

    invoke-direct {p2, p1, p4, v4, v0}, Lcom/zykj/mistake/feature/ask/m0;-><init>(Lr6/c;Lcom/zykj/mistake/feature/ask/n;Lcom/zykj/mistake/feature/ask/y;I)V

    .line 11
    invoke-interface {p3, p2}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 12
    :cond_7
    move-object v7, p2

    check-cast v7, Lr6/a;

    const/16 v9, 0xd80

    const/4 v6, 0x1

    move-object v8, p3

    .line 13
    invoke-static/range {v3 .. v9}, Lcom/zykj/mistake/feature/ask/o0;->e(Lcom/zykj/mistake/feature/ask/MistakeAskMaterialContract$MaterialType;Lcom/zykj/mistake/feature/ask/y;Landroidx/compose/ui/Modifier;ZLr6/a;Landroidx/compose/runtime/Composer;I)V

    .line 14
    invoke-interface {v8}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    .line 15
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result p1

    if-eqz p1, :cond_8

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    :cond_8
    return-void

    :cond_9
    move-object v8, p3

    invoke-interface {v8}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    return-void
.end method
