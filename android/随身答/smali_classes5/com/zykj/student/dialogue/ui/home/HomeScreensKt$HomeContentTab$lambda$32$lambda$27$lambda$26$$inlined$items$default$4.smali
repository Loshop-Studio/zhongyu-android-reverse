.class public final Lcom/zykj/student/dialogue/ui/home/HomeScreensKt$HomeContentTab$lambda$32$lambda$27$lambda$26$$inlined$items$default$4;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function4;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/student/dialogue/ui/home/HomeScreensKt;->D(ZLjava/util/List;Ljava/lang/Long;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function4<",
        "Landroidx/compose/foundation/lazy/LazyItemScope;",
        "Ljava/lang/Integer;",
        "Landroidx/compose/runtime/Composer;",
        "Ljava/lang/Integer;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0003\u0010\u0000\u001a\u00020\u0001\"\u0004\u0008\u0000\u0010\u0002*\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u000b\u00a2\u0006\u0004\u0008\u0006\u0010\u0007\u00a8\u0006\u0008"
    }
    d2 = {
        "<anonymous>",
        "",
        "T",
        "Landroidx/compose/foundation/lazy/LazyItemScope;",
        "it",
        "",
        "invoke",
        "(Landroidx/compose/foundation/lazy/LazyItemScope;ILandroidx/compose/runtime/Composer;I)V",
        "androidx/compose/foundation/lazy/LazyDslKt$items$4"
    }
    k = 0x3
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nLazyDsl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyDsl.kt\nandroidx/compose/foundation/lazy/LazyDslKt$items$4\n+ 2 HomeScreens.kt\ncom/zykj/student/dialogue/ui/home/HomeScreensKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,180:1\n318#2,5:181\n326#2:192\n1247#3,6:186\n*S KotlinDebug\n*F\n+ 1 HomeScreens.kt\ncom/zykj/student/dialogue/ui/home/HomeScreensKt\n*L\n322#1:186,6\n*E\n"
    }
.end annotation


# instance fields
.field public final synthetic a:Ljava/util/List;

.field public final synthetic b:Z

.field public final synthetic c:Ljava/lang/Long;

.field public final synthetic d:Lkotlin/jvm/functions/Function1;


# direct methods
.method public constructor <init>(Ljava/util/List;ZLjava/lang/Long;Lkotlin/jvm/functions/Function1;)V
    .locals 0

    iput-object p1, p0, Lcom/zykj/student/dialogue/ui/home/HomeScreensKt$HomeContentTab$lambda$32$lambda$27$lambda$26$$inlined$items$default$4;->a:Ljava/util/List;

    iput-boolean p2, p0, Lcom/zykj/student/dialogue/ui/home/HomeScreensKt$HomeContentTab$lambda$32$lambda$27$lambda$26$$inlined$items$default$4;->b:Z

    iput-object p3, p0, Lcom/zykj/student/dialogue/ui/home/HomeScreensKt$HomeContentTab$lambda$32$lambda$27$lambda$26$$inlined$items$default$4;->c:Ljava/lang/Long;

    iput-object p4, p0, Lcom/zykj/student/dialogue/ui/home/HomeScreensKt$HomeContentTab$lambda$32$lambda$27$lambda$26$$inlined$items$default$4;->d:Lkotlin/jvm/functions/Function1;

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

    invoke-virtual {p0, p1, p2, p3, p4}, Lcom/zykj/student/dialogue/ui/home/HomeScreensKt$HomeContentTab$lambda$32$lambda$27$lambda$26$$inlined$items$default$4;->invoke(Landroidx/compose/foundation/lazy/LazyItemScope;ILandroidx/compose/runtime/Composer;I)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(Landroidx/compose/foundation/lazy/LazyItemScope;ILandroidx/compose/runtime/Composer;I)V
    .locals 9

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

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-eq p4, v0, :cond_4

    move p4, v2

    goto :goto_3

    :cond_4
    move p4, v1

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

    const-string v0, "androidx.compose.foundation.lazy.items.<anonymous> (LazyDsl.kt:178)"

    const v3, -0x25b7f321

    invoke-static {v3, p1, p4, v0}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    :cond_5
    iget-object p1, p0, Lcom/zykj/student/dialogue/ui/home/HomeScreensKt$HomeContentTab$lambda$32$lambda$27$lambda$26$$inlined$items$default$4;->a:Ljava/util/List;

    invoke-interface {p1, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    move-object v5, p1

    check-cast v5, Lcom/zykj/student/dialogue/bean/resp/CatalogResp;

    const p1, -0xa8c35d2

    .line 3
    invoke-interface {p3, p1}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    .line 4
    iget-boolean v3, p0, Lcom/zykj/student/dialogue/ui/home/HomeScreensKt$HomeContentTab$lambda$32$lambda$27$lambda$26$$inlined$items$default$4;->b:Z

    .line 5
    invoke-virtual {v5}, Lcom/zykj/student/dialogue/bean/resp/CatalogResp;->getId()J

    move-result-wide p1

    iget-object p4, p0, Lcom/zykj/student/dialogue/ui/home/HomeScreensKt$HomeContentTab$lambda$32$lambda$27$lambda$26$$inlined$items$default$4;->c:Ljava/lang/Long;

    if-nez p4, :cond_6

    goto :goto_4

    :cond_6
    invoke-virtual {p4}, Ljava/lang/Long;->longValue()J

    move-result-wide v6

    cmp-long p1, p1, v6

    if-nez p1, :cond_7

    move v4, v2

    goto :goto_5

    :cond_7
    :goto_4
    move v4, v1

    .line 6
    :goto_5
    iget-object p1, p0, Lcom/zykj/student/dialogue/ui/home/HomeScreensKt$HomeContentTab$lambda$32$lambda$27$lambda$26$$inlined$items$default$4;->d:Lkotlin/jvm/functions/Function1;

    invoke-interface {p3, p1}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result p1

    .line 7
    invoke-interface {p3}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object p2

    if-nez p1, :cond_8

    .line 8
    sget-object p1, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    invoke-virtual {p1}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object p1

    if-ne p2, p1, :cond_9

    .line 9
    :cond_8
    new-instance p2, Lcom/zykj/student/dialogue/ui/home/HomeScreensKt$a;

    iget-object p1, p0, Lcom/zykj/student/dialogue/ui/home/HomeScreensKt$HomeContentTab$lambda$32$lambda$27$lambda$26$$inlined$items$default$4;->d:Lkotlin/jvm/functions/Function1;

    invoke-direct {p2, p1}, Lcom/zykj/student/dialogue/ui/home/HomeScreensKt$a;-><init>(Lkotlin/jvm/functions/Function1;)V

    .line 10
    invoke-interface {p3, p2}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 11
    :cond_9
    move-object v6, p2

    check-cast v6, Lkotlin/jvm/functions/Function1;

    const/4 v8, 0x0

    move-object v7, p3

    .line 12
    invoke-static/range {v3 .. v8}, Lcom/zykj/student/dialogue/ui/home/HomeScreensKt;->I(ZZLcom/zykj/student/dialogue/bean/resp/CatalogResp;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    invoke-interface {v7}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    .line 13
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result p1

    if-eqz p1, :cond_a

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    :cond_a
    return-void

    :cond_b
    move-object v7, p3

    invoke-interface {v7}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    return-void
.end method
