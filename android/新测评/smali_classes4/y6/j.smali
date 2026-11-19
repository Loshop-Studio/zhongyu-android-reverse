.class public final synthetic Ly6/j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/lifecycle/Observer;


# instance fields
.field public final synthetic a:Lcom/zykj/evaluation/ui/sheet/a;

.field public final synthetic b:Landroidx/navigation/NavController;

.field public final synthetic c:Landroidx/lifecycle/SavedStateHandle;

.field public final synthetic d:Lcom/zykj/evaluation/ui/sheet/AnswerSheetViewModel;


# direct methods
.method public synthetic constructor <init>(Lcom/zykj/evaluation/ui/sheet/a;Landroidx/navigation/NavController;Landroidx/lifecycle/SavedStateHandle;Lcom/zykj/evaluation/ui/sheet/AnswerSheetViewModel;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ly6/j;->a:Lcom/zykj/evaluation/ui/sheet/a;

    iput-object p2, p0, Ly6/j;->b:Landroidx/navigation/NavController;

    iput-object p3, p0, Ly6/j;->c:Landroidx/lifecycle/SavedStateHandle;

    iput-object p4, p0, Ly6/j;->d:Lcom/zykj/evaluation/ui/sheet/AnswerSheetViewModel;

    return-void
.end method


# virtual methods
.method public final onChanged(Ljava/lang/Object;)V
    .locals 4

    .line 1
    iget-object v0, p0, Ly6/j;->a:Lcom/zykj/evaluation/ui/sheet/a;

    iget-object v1, p0, Ly6/j;->b:Landroidx/navigation/NavController;

    iget-object v2, p0, Ly6/j;->c:Landroidx/lifecycle/SavedStateHandle;

    iget-object v3, p0, Ly6/j;->d:Lcom/zykj/evaluation/ui/sheet/AnswerSheetViewModel;

    check-cast p1, Ljava/lang/String;

    invoke-static {v0, v1, v2, v3, p1}, Lcom/zykj/evaluation/ui/sheet/preview/PreviewPageKt;->h(Lcom/zykj/evaluation/ui/sheet/a;Landroidx/navigation/NavController;Landroidx/lifecycle/SavedStateHandle;Lcom/zykj/evaluation/ui/sheet/AnswerSheetViewModel;Ljava/lang/String;)V

    return-void
.end method
