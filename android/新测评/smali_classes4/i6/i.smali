.class public final synthetic Li6/i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/lifecycle/Observer;


# instance fields
.field public final synthetic a:Lcom/zykj/evaluation/ui/guide/noStem/NoStemViewModel;

.field public final synthetic b:Landroidx/navigation/NavController;

.field public final synthetic c:Landroidx/lifecycle/SavedStateHandle;


# direct methods
.method public synthetic constructor <init>(Lcom/zykj/evaluation/ui/guide/noStem/NoStemViewModel;Landroidx/navigation/NavController;Landroidx/lifecycle/SavedStateHandle;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Li6/i;->a:Lcom/zykj/evaluation/ui/guide/noStem/NoStemViewModel;

    iput-object p2, p0, Li6/i;->b:Landroidx/navigation/NavController;

    iput-object p3, p0, Li6/i;->c:Landroidx/lifecycle/SavedStateHandle;

    return-void
.end method


# virtual methods
.method public final onChanged(Ljava/lang/Object;)V
    .locals 3

    .line 1
    iget-object v0, p0, Li6/i;->a:Lcom/zykj/evaluation/ui/guide/noStem/NoStemViewModel;

    iget-object v1, p0, Li6/i;->b:Landroidx/navigation/NavController;

    iget-object v2, p0, Li6/i;->c:Landroidx/lifecycle/SavedStateHandle;

    check-cast p1, Ljava/lang/String;

    invoke-static {v0, v1, v2, p1}, Lcom/zykj/evaluation/ui/guide/noStem/NoStemPageKt;->g(Lcom/zykj/evaluation/ui/guide/noStem/NoStemViewModel;Landroidx/navigation/NavController;Landroidx/lifecycle/SavedStateHandle;Ljava/lang/String;)V

    return-void
.end method
