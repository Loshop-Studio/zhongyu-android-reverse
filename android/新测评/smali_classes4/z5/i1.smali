.class public final synthetic Lz5/i1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:Lcom/zykj/evaluation/ui/detail/mistake/MistakeViewModel;

.field public final synthetic b:Landroidx/compose/runtime/State;

.field public final synthetic c:Landroidx/navigation/NavController;


# direct methods
.method public synthetic constructor <init>(Lcom/zykj/evaluation/ui/detail/mistake/MistakeViewModel;Landroidx/compose/runtime/State;Landroidx/navigation/NavController;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lz5/i1;->a:Lcom/zykj/evaluation/ui/detail/mistake/MistakeViewModel;

    iput-object p2, p0, Lz5/i1;->b:Landroidx/compose/runtime/State;

    iput-object p3, p0, Lz5/i1;->c:Landroidx/navigation/NavController;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 3

    .line 1
    iget-object v0, p0, Lz5/i1;->a:Lcom/zykj/evaluation/ui/detail/mistake/MistakeViewModel;

    iget-object v1, p0, Lz5/i1;->b:Landroidx/compose/runtime/State;

    iget-object v2, p0, Lz5/i1;->c:Landroidx/navigation/NavController;

    invoke-static {v0, v1, v2}, Lcom/zykj/evaluation/ui/detail/mistake/MistakePageKt;->B(Lcom/zykj/evaluation/ui/detail/mistake/MistakeViewModel;Landroidx/compose/runtime/State;Landroidx/navigation/NavController;)Lkotlin/Unit;

    move-result-object v0

    return-object v0
.end method
