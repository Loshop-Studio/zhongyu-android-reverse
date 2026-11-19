.class public final synthetic Ly6/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:Landroidx/navigation/NavController;

.field public final synthetic b:Lcom/zykj/evaluation/ui/sheet/a;

.field public final synthetic c:Lcom/zykj/evaluation/ui/sheet/AnswerSheetViewModel;


# direct methods
.method public synthetic constructor <init>(Landroidx/navigation/NavController;Lcom/zykj/evaluation/ui/sheet/a;Lcom/zykj/evaluation/ui/sheet/AnswerSheetViewModel;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ly6/a;->a:Landroidx/navigation/NavController;

    iput-object p2, p0, Ly6/a;->b:Lcom/zykj/evaluation/ui/sheet/a;

    iput-object p3, p0, Ly6/a;->c:Lcom/zykj/evaluation/ui/sheet/AnswerSheetViewModel;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    .line 1
    iget-object v0, p0, Ly6/a;->a:Landroidx/navigation/NavController;

    iget-object v1, p0, Ly6/a;->b:Lcom/zykj/evaluation/ui/sheet/a;

    iget-object v2, p0, Ly6/a;->c:Lcom/zykj/evaluation/ui/sheet/AnswerSheetViewModel;

    check-cast p1, Landroidx/compose/runtime/DisposableEffectScope;

    invoke-static {v0, v1, v2, p1}, Lcom/zykj/evaluation/ui/sheet/preview/PreviewPageKt;->l(Landroidx/navigation/NavController;Lcom/zykj/evaluation/ui/sheet/a;Lcom/zykj/evaluation/ui/sheet/AnswerSheetViewModel;Landroidx/compose/runtime/DisposableEffectScope;)Landroidx/compose/runtime/DisposableEffectResult;

    move-result-object p1

    return-object p1
.end method
