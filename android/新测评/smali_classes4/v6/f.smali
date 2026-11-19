.class public final synthetic Lv6/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function4;


# instance fields
.field public final synthetic a:Lkotlin/jvm/functions/Function1;

.field public final synthetic b:Landroidx/navigation/NavHostController;

.field public final synthetic c:Lcom/zykj/evaluation/ui/sheet/AnswerSheetViewModel;

.field public final synthetic d:Lkotlin/jvm/functions/Function0;


# direct methods
.method public synthetic constructor <init>(Lkotlin/jvm/functions/Function1;Landroidx/navigation/NavHostController;Lcom/zykj/evaluation/ui/sheet/AnswerSheetViewModel;Lkotlin/jvm/functions/Function0;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lv6/f;->a:Lkotlin/jvm/functions/Function1;

    iput-object p2, p0, Lv6/f;->b:Landroidx/navigation/NavHostController;

    iput-object p3, p0, Lv6/f;->c:Lcom/zykj/evaluation/ui/sheet/AnswerSheetViewModel;

    iput-object p4, p0, Lv6/f;->d:Lkotlin/jvm/functions/Function0;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    .line 1
    iget-object v0, p0, Lv6/f;->a:Lkotlin/jvm/functions/Function1;

    iget-object v1, p0, Lv6/f;->b:Landroidx/navigation/NavHostController;

    iget-object v2, p0, Lv6/f;->c:Lcom/zykj/evaluation/ui/sheet/AnswerSheetViewModel;

    iget-object v3, p0, Lv6/f;->d:Lkotlin/jvm/functions/Function0;

    move-object v4, p1

    check-cast v4, Landroidx/compose/animation/AnimatedContentScope;

    move-object v5, p2

    check-cast v5, Landroidx/navigation/NavBackStackEntry;

    move-object v6, p3

    check-cast v6, Landroidx/compose/runtime/Composer;

    check-cast p4, Ljava/lang/Integer;

    invoke-virtual {p4}, Ljava/lang/Integer;->intValue()I

    move-result v7

    invoke-static/range {v0 .. v7}, Lcom/zykj/evaluation/ui/sheet/AnswerSheetPageKt;->s(Lkotlin/jvm/functions/Function1;Landroidx/navigation/NavHostController;Lcom/zykj/evaluation/ui/sheet/AnswerSheetViewModel;Lkotlin/jvm/functions/Function0;Landroidx/compose/animation/AnimatedContentScope;Landroidx/navigation/NavBackStackEntry;Landroidx/compose/runtime/Composer;I)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
