.class public final synthetic Lp6/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/lifecycle/Observer;


# instance fields
.field public final synthetic a:Lcom/zykj/evaluation/ui/guide/normal/toCorrectSelf/ToCorrectSelfGuideViewModel;

.field public final synthetic b:Landroidx/navigation/NavController;

.field public final synthetic c:Landroidx/lifecycle/SavedStateHandle;


# direct methods
.method public synthetic constructor <init>(Lcom/zykj/evaluation/ui/guide/normal/toCorrectSelf/ToCorrectSelfGuideViewModel;Landroidx/navigation/NavController;Landroidx/lifecycle/SavedStateHandle;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lp6/e;->a:Lcom/zykj/evaluation/ui/guide/normal/toCorrectSelf/ToCorrectSelfGuideViewModel;

    iput-object p2, p0, Lp6/e;->b:Landroidx/navigation/NavController;

    iput-object p3, p0, Lp6/e;->c:Landroidx/lifecycle/SavedStateHandle;

    return-void
.end method


# virtual methods
.method public final onChanged(Ljava/lang/Object;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lp6/e;->a:Lcom/zykj/evaluation/ui/guide/normal/toCorrectSelf/ToCorrectSelfGuideViewModel;

    iget-object v1, p0, Lp6/e;->b:Landroidx/navigation/NavController;

    iget-object v2, p0, Lp6/e;->c:Landroidx/lifecycle/SavedStateHandle;

    check-cast p1, Ljava/lang/String;

    invoke-static {v0, v1, v2, p1}, Lcom/zykj/evaluation/ui/guide/normal/toCorrectSelf/ToCorrectSelfGuidePageKt;->c(Lcom/zykj/evaluation/ui/guide/normal/toCorrectSelf/ToCorrectSelfGuideViewModel;Landroidx/navigation/NavController;Landroidx/lifecycle/SavedStateHandle;Ljava/lang/String;)V

    return-void
.end method
