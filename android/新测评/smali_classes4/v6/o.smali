.class public final synthetic Lv6/o;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# instance fields
.field public final synthetic a:Lv6/v;

.field public final synthetic b:Lkotlin/jvm/functions/Function1;

.field public final synthetic c:Lcom/zykj/evaluation/ui/sheet/AnswerSheetViewModel;

.field public final synthetic d:Landroidx/navigation/NavController;


# direct methods
.method public synthetic constructor <init>(Lv6/v;Lkotlin/jvm/functions/Function1;Lcom/zykj/evaluation/ui/sheet/AnswerSheetViewModel;Landroidx/navigation/NavController;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lv6/o;->a:Lv6/v;

    iput-object p2, p0, Lv6/o;->b:Lkotlin/jvm/functions/Function1;

    iput-object p3, p0, Lv6/o;->c:Lcom/zykj/evaluation/ui/sheet/AnswerSheetViewModel;

    iput-object p4, p0, Lv6/o;->d:Landroidx/navigation/NavController;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    .line 1
    iget-object v0, p0, Lv6/o;->a:Lv6/v;

    iget-object v1, p0, Lv6/o;->b:Lkotlin/jvm/functions/Function1;

    iget-object v2, p0, Lv6/o;->c:Lcom/zykj/evaluation/ui/sheet/AnswerSheetViewModel;

    iget-object v3, p0, Lv6/o;->d:Landroidx/navigation/NavController;

    move-object v4, p1

    check-cast v4, Landroidx/compose/foundation/layout/BoxScope;

    move-object v5, p2

    check-cast v5, Landroidx/compose/runtime/Composer;

    check-cast p3, Ljava/lang/Integer;

    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    move-result v6

    invoke-static/range {v0 .. v6}, Lcom/zykj/evaluation/ui/sheet/AnswerSheetPageKt;->g(Lv6/v;Lkotlin/jvm/functions/Function1;Lcom/zykj/evaluation/ui/sheet/AnswerSheetViewModel;Landroidx/navigation/NavController;Landroidx/compose/foundation/layout/BoxScope;Landroidx/compose/runtime/Composer;I)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
