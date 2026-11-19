.class public final Lcom/friday/main/view/DBActivity$ImageListCard$lambda$52$lambda$51$lambda$50$$inlined$itemsIndexed$default$3;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lhd/r;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/friday/main/view/DBActivity;->r0(Lcom/friday/main/viewmodel/DbViewModel;Landroidx/compose/runtime/Composer;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lhd/r;"
    }
.end annotation


# instance fields
.field public final synthetic c:Ljava/util/List;

.field public final synthetic d:Lcom/friday/main/view/DBActivity;


# direct methods
.method public constructor <init>(Ljava/util/List;Lcom/friday/main/view/DBActivity;)V
    .locals 0

    iput-object p1, p0, Lcom/friday/main/view/DBActivity$ImageListCard$lambda$52$lambda$51$lambda$50$$inlined$itemsIndexed$default$3;->c:Ljava/util/List;

    iput-object p2, p0, Lcom/friday/main/view/DBActivity$ImageListCard$lambda$52$lambda$51$lambda$50$$inlined$itemsIndexed$default$3;->d:Lcom/friday/main/view/DBActivity;

    const/4 p1, 0x4

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Landroidx/compose/foundation/lazy/LazyItemScope;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    check-cast p3, Landroidx/compose/runtime/Composer;

    check-cast p4, Ljava/lang/Number;

    invoke-virtual {p4}, Ljava/lang/Number;->intValue()I

    move-result p4

    invoke-virtual {p0, p1, p2, p3, p4}, Lcom/friday/main/view/DBActivity$ImageListCard$lambda$52$lambda$51$lambda$50$$inlined$itemsIndexed$default$3;->invoke(Landroidx/compose/foundation/lazy/LazyItemScope;ILandroidx/compose/runtime/Composer;I)V

    sget-object p1, Lqc/q;->a:Lqc/q;

    return-object p1
.end method

.method public final invoke(Landroidx/compose/foundation/lazy/LazyItemScope;ILandroidx/compose/runtime/Composer;I)V
    .locals 7

    and-int/lit8 v1, p4, 0x6

    if-nez v1, :cond_1

    invoke-interface {p3, p1}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, 0x4

    goto :goto_0

    :cond_0
    const/4 v1, 0x2

    :goto_0
    or-int/2addr v1, p4

    goto :goto_1

    :cond_1
    move v1, p4

    :goto_1
    and-int/lit8 v2, p4, 0x30

    if-nez v2, :cond_3

    invoke-interface {p3, p2}, Landroidx/compose/runtime/Composer;->changed(I)Z

    move-result v2

    if-eqz v2, :cond_2

    const/16 v2, 0x20

    goto :goto_2

    :cond_2
    const/16 v2, 0x10

    :goto_2
    or-int/2addr v1, v2

    :cond_3
    and-int/lit16 v2, v1, 0x93

    const/16 v3, 0x92

    const/4 v5, 0x1

    if-eq v2, v3, :cond_4

    move v2, v5

    goto :goto_3

    :cond_4
    const/4 v2, 0x0

    :goto_3
    and-int/lit8 v3, v1, 0x1

    .line 2
    invoke-interface {p3, v2, v3}, Landroidx/compose/runtime/Composer;->shouldExecute(ZI)Z

    move-result v2

    if-eqz v2, :cond_7

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v2

    if-eqz v2, :cond_5

    const/4 v2, -0x1

    const-string v3, "androidx.compose.foundation.lazy.itemsIndexed.<anonymous> (LazyDsl.kt:214)"

    const v6, -0x410876af

    invoke-static {v6, v1, v2, v3}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    :cond_5
    iget-object v1, p0, Lcom/friday/main/view/DBActivity$ImageListCard$lambda$52$lambda$51$lambda$50$$inlined$itemsIndexed$default$3;->c:Ljava/util/List;

    invoke-interface {v1, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    move-object v2, v1

    check-cast v2, Lcom/friday/common/entity/ImageSafetyEntity;

    const v1, -0x443a76e6

    .line 3
    invoke-interface {p3, v1}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    iget-object v0, p0, Lcom/friday/main/view/DBActivity$ImageListCard$lambda$52$lambda$51$lambda$50$$inlined$itemsIndexed$default$3;->d:Lcom/friday/main/view/DBActivity;

    add-int/lit8 v1, p2, 0x1

    sget v3, Lcom/friday/common/entity/ImageSafetyEntity;->$stable:I

    shl-int/lit8 v5, v3, 0x3

    const/4 v6, 0x4

    const/4 v3, 0x0

    move-object v4, p3

    invoke-virtual/range {v0 .. v6}, Lcom/friday/main/view/DBActivity;->p0(ILcom/friday/common/entity/ImageSafetyEntity;ZLandroidx/compose/runtime/Composer;II)V

    .line 4
    sget-object v0, Landroidx/compose/ui/graphics/Color;->Companion:Landroidx/compose/ui/graphics/Color$Companion;

    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getDarkGray-0d7_KjU()J

    move-result-wide v2

    const/16 v5, 0x180

    const/4 v6, 0x3

    const/4 v0, 0x0

    const/4 v1, 0x0

    invoke-static/range {v0 .. v6}, Landroidx/compose/material3/DividerKt;->HorizontalDivider-9IZ8Weo(Landroidx/compose/ui/Modifier;FJLandroidx/compose/runtime/Composer;II)V

    invoke-interface {p3}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    .line 5
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v0

    if-eqz v0, :cond_6

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    :cond_6
    return-void

    :cond_7
    invoke-interface {p3}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    return-void
.end method
