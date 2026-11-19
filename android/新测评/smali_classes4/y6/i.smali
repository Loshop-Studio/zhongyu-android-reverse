.class public final synthetic Ly6/i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:Landroidx/navigation/NavController;

.field public final synthetic b:Lcom/zykj/evaluation/ui/sheet/AnswerSheetViewModel;

.field public final synthetic c:Lkotlin/jvm/functions/Function0;

.field public final synthetic d:I


# direct methods
.method public synthetic constructor <init>(Landroidx/navigation/NavController;Lcom/zykj/evaluation/ui/sheet/AnswerSheetViewModel;Lkotlin/jvm/functions/Function0;I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ly6/i;->a:Landroidx/navigation/NavController;

    iput-object p2, p0, Ly6/i;->b:Lcom/zykj/evaluation/ui/sheet/AnswerSheetViewModel;

    iput-object p3, p0, Ly6/i;->c:Lkotlin/jvm/functions/Function0;

    iput p4, p0, Ly6/i;->d:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    .line 1
    iget-object v0, p0, Ly6/i;->a:Landroidx/navigation/NavController;

    iget-object v1, p0, Ly6/i;->b:Lcom/zykj/evaluation/ui/sheet/AnswerSheetViewModel;

    iget-object v2, p0, Ly6/i;->c:Lkotlin/jvm/functions/Function0;

    iget v3, p0, Ly6/i;->d:I

    move-object v4, p1

    check-cast v4, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v5

    invoke-static/range {v0 .. v5}, Lcom/zykj/evaluation/ui/sheet/preview/PreviewPageKt;->f(Landroidx/navigation/NavController;Lcom/zykj/evaluation/ui/sheet/AnswerSheetViewModel;Lkotlin/jvm/functions/Function0;ILandroidx/compose/runtime/Composer;I)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
