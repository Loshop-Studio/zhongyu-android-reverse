.class public final Lcom/zykj/study/ui/home/my/card/AuthorizationSearchListKt$SearchPage$lambda$20$lambda$19$lambda$18$lambda$17$lambda$13$$inlined$itemsIndexed$default$3;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lx7/r;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/study/ui/home/my/card/AuthorizationSearchListKt;->p(Landroidx/compose/ui/Modifier;Lcom/zykj/study/viewmodels/AuthorizedLessonViewModel;Lx7/p;Landroidx/compose/runtime/Composer;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lx7/r;"
    }
.end annotation


# instance fields
.field public final synthetic a:Ljava/util/List;

.field public final synthetic b:Lx7/p;


# direct methods
.method public constructor <init>(Ljava/util/List;Lx7/p;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/zykj/study/ui/home/my/card/AuthorizationSearchListKt$SearchPage$lambda$20$lambda$19$lambda$18$lambda$17$lambda$13$$inlined$itemsIndexed$default$3;->a:Ljava/util/List;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/zykj/study/ui/home/my/card/AuthorizationSearchListKt$SearchPage$lambda$20$lambda$19$lambda$18$lambda$17$lambda$13$$inlined$itemsIndexed$default$3;->b:Lx7/p;

    .line 4
    .line 5
    const/4 p1, 0x4

    .line 6
    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    .line 7
    .line 8
    .line 9
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

    invoke-virtual {p0, p1, p2, p3, p4}, Lcom/zykj/study/ui/home/my/card/AuthorizationSearchListKt$SearchPage$lambda$20$lambda$19$lambda$18$lambda$17$lambda$13$$inlined$itemsIndexed$default$3;->invoke(Landroidx/compose/foundation/lazy/LazyItemScope;ILandroidx/compose/runtime/Composer;I)V

    sget-object p1, Lh7/p;->a:Lh7/p;

    return-object p1
.end method

.method public final invoke(Landroidx/compose/foundation/lazy/LazyItemScope;ILandroidx/compose/runtime/Composer;I)V
    .locals 10

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

    const/16 v0, 0x20

    if-nez p4, :cond_3

    invoke-interface {p3, p2}, Landroidx/compose/runtime/Composer;->changed(I)Z

    move-result p4

    if-eqz p4, :cond_2

    move p4, v0

    goto :goto_2

    :cond_2
    const/16 p4, 0x10

    :goto_2
    or-int/2addr p1, p4

    :cond_3
    and-int/lit16 p4, p1, 0x93

    const/16 v1, 0x92

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-eq p4, v1, :cond_4

    move p4, v3

    goto :goto_3

    :cond_4
    move p4, v2

    :goto_3
    and-int/lit8 v1, p1, 0x1

    .line 2
    invoke-interface {p3, p4, v1}, Landroidx/compose/runtime/Composer;->shouldExecute(ZI)Z

    move-result p4

    if-eqz p4, :cond_c

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result p4

    if-eqz p4, :cond_5

    const/4 p4, -0x1

    const-string v1, "androidx.compose.foundation.lazy.itemsIndexed.<anonymous> (LazyDsl.kt:214)"

    const v4, -0x410876af

    invoke-static {v4, p1, p4, v1}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    :cond_5
    iget-object p4, p0, Lcom/zykj/study/ui/home/my/card/AuthorizationSearchListKt$SearchPage$lambda$20$lambda$19$lambda$18$lambda$17$lambda$13$$inlined$itemsIndexed$default$3;->a:Ljava/util/List;

    invoke-interface {p4, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p4

    check-cast p4, Lcom/zykj/study/bean/exercise/AuthorizeLesson;

    const v1, -0x4d71e73e

    .line 3
    invoke-interface {p3, v1}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    iget-object v1, p0, Lcom/zykj/study/ui/home/my/card/AuthorizationSearchListKt$SearchPage$lambda$20$lambda$19$lambda$18$lambda$17$lambda$13$$inlined$itemsIndexed$default$3;->b:Lx7/p;

    invoke-interface {p3, v1}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v1

    and-int/lit8 v4, p1, 0x70

    xor-int/lit8 v4, v4, 0x30

    if-le v4, v0, :cond_6

    invoke-interface {p3, p2}, Landroidx/compose/runtime/Composer;->changed(I)Z

    move-result v4

    if-nez v4, :cond_7

    :cond_6
    and-int/lit8 p1, p1, 0x30

    if-ne p1, v0, :cond_8

    :cond_7
    move p1, v3

    goto :goto_4

    :cond_8
    move p1, v2

    :goto_4
    or-int/2addr p1, v1

    invoke-interface {p3, p4}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v0

    or-int/2addr p1, v0

    .line 4
    invoke-interface {p3}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v0

    if-nez p1, :cond_9

    .line 5
    sget-object p1, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    invoke-virtual {p1}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object p1

    if-ne v0, p1, :cond_a

    .line 6
    :cond_9
    new-instance v0, Lcom/zykj/study/ui/home/my/card/AuthorizationSearchListKt$a;

    iget-object p1, p0, Lcom/zykj/study/ui/home/my/card/AuthorizationSearchListKt$SearchPage$lambda$20$lambda$19$lambda$18$lambda$17$lambda$13$$inlined$itemsIndexed$default$3;->b:Lx7/p;

    invoke-direct {v0, p1, p2, p4}, Lcom/zykj/study/ui/home/my/card/AuthorizationSearchListKt$a;-><init>(Lx7/p;ILcom/zykj/study/bean/exercise/AuthorizeLesson;)V

    .line 7
    invoke-interface {p3, v0}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 8
    :cond_a
    check-cast v0, Lx7/a;

    invoke-static {p4, v0, p3, v2}, Lcom/zykj/study/ui/home/my/card/AuthorizationSearchListKt;->m(Lcom/zykj/study/bean/exercise/AuthorizeLesson;Lx7/a;Landroidx/compose/runtime/Composer;I)V

    .line 9
    sget-object p1, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    const/4 p2, 0x0

    const/4 p4, 0x0

    .line 10
    invoke-static {p1, p2, v3, p4}, Landroidx/compose/foundation/layout/SizeKt;->fillMaxWidth$default(Landroidx/compose/ui/Modifier;FILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    move-result-object p1

    int-to-float p2, v3

    .line 11
    invoke-static {p2}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    move-result p2

    .line 12
    invoke-static {p1, p2}, Landroidx/compose/foundation/layout/SizeKt;->height-3ABfNKs(Landroidx/compose/ui/Modifier;F)Landroidx/compose/ui/Modifier;

    move-result-object v3

    .line 13
    sget p1, Lcom/zykj/study/R$color;->divider_color:I

    invoke-static {p1, p3, v2}, Landroidx/compose/ui/res/ColorResources_androidKt;->colorResource(ILandroidx/compose/runtime/Composer;I)J

    move-result-wide v5

    const/4 v8, 0x6

    const/4 v9, 0x2

    const/4 v4, 0x0

    move-object v7, p3

    .line 14
    invoke-static/range {v3 .. v9}, Landroidx/compose/material3/DividerKt;->HorizontalDivider-9IZ8Weo(Landroidx/compose/ui/Modifier;FJLandroidx/compose/runtime/Composer;II)V

    invoke-interface {v7}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    .line 15
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result p1

    if-eqz p1, :cond_b

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    :cond_b
    return-void

    :cond_c
    move-object v7, p3

    invoke-interface {v7}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    return-void
.end method
