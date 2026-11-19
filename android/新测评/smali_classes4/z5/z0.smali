.class public final synthetic Lz5/z0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/lifecycle/Observer;


# instance fields
.field public final synthetic a:Lcom/zykj/evaluation/ui/detail/mistake/MistakeViewModel;

.field public final synthetic b:Landroidx/lifecycle/SavedStateHandle;


# direct methods
.method public synthetic constructor <init>(Lcom/zykj/evaluation/ui/detail/mistake/MistakeViewModel;Landroidx/lifecycle/SavedStateHandle;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lz5/z0;->a:Lcom/zykj/evaluation/ui/detail/mistake/MistakeViewModel;

    iput-object p2, p0, Lz5/z0;->b:Landroidx/lifecycle/SavedStateHandle;

    return-void
.end method


# virtual methods
.method public final onChanged(Ljava/lang/Object;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lz5/z0;->a:Lcom/zykj/evaluation/ui/detail/mistake/MistakeViewModel;

    iget-object v1, p0, Lz5/z0;->b:Landroidx/lifecycle/SavedStateHandle;

    check-cast p1, Ljava/lang/String;

    invoke-static {v0, v1, p1}, Lcom/zykj/evaluation/ui/detail/mistake/MistakePageKt;->t(Lcom/zykj/evaluation/ui/detail/mistake/MistakeViewModel;Landroidx/lifecycle/SavedStateHandle;Ljava/lang/String;)V

    return-void
.end method
