.class public final synthetic Ly6/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# instance fields
.field public final synthetic a:Lcom/zykj/evaluation/ui/sheet/a;

.field public final synthetic b:Lcom/zykj/evaluation/ui/sheet/AnswerSheetViewModel;

.field public final synthetic c:Landroidx/navigation/NavController;

.field public final synthetic d:Lkotlin/jvm/functions/Function0;


# direct methods
.method public synthetic constructor <init>(Lcom/zykj/evaluation/ui/sheet/a;Lcom/zykj/evaluation/ui/sheet/AnswerSheetViewModel;Landroidx/navigation/NavController;Lkotlin/jvm/functions/Function0;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ly6/h;->a:Lcom/zykj/evaluation/ui/sheet/a;

    iput-object p2, p0, Ly6/h;->b:Lcom/zykj/evaluation/ui/sheet/AnswerSheetViewModel;

    iput-object p3, p0, Ly6/h;->c:Landroidx/navigation/NavController;

    iput-object p4, p0, Ly6/h;->d:Lkotlin/jvm/functions/Function0;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    .line 1
    iget-object v0, p0, Ly6/h;->a:Lcom/zykj/evaluation/ui/sheet/a;

    iget-object v1, p0, Ly6/h;->b:Lcom/zykj/evaluation/ui/sheet/AnswerSheetViewModel;

    iget-object v2, p0, Ly6/h;->c:Landroidx/navigation/NavController;

    iget-object v3, p0, Ly6/h;->d:Lkotlin/jvm/functions/Function0;

    move-object v4, p1

    check-cast v4, Landroidx/compose/foundation/layout/BoxScope;

    move-object v5, p2

    check-cast v5, Landroidx/compose/runtime/Composer;

    check-cast p3, Ljava/lang/Integer;

    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    move-result v6

    invoke-static/range {v0 .. v6}, Lcom/zykj/evaluation/ui/sheet/preview/PreviewPageKt;->n(Lcom/zykj/evaluation/ui/sheet/a;Lcom/zykj/evaluation/ui/sheet/AnswerSheetViewModel;Landroidx/navigation/NavController;Lkotlin/jvm/functions/Function0;Landroidx/compose/foundation/layout/BoxScope;Landroidx/compose/runtime/Composer;I)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
