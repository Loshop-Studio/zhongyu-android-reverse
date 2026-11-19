.class public final synthetic Lw6/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:Landroidx/navigation/NavController;

.field public final synthetic b:Lcom/zykj/evaluation/ui/sheet/composition/CompositionViewModel;


# direct methods
.method public synthetic constructor <init>(Landroidx/navigation/NavController;Lcom/zykj/evaluation/ui/sheet/composition/CompositionViewModel;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lw6/a;->a:Landroidx/navigation/NavController;

    iput-object p2, p0, Lw6/a;->b:Lcom/zykj/evaluation/ui/sheet/composition/CompositionViewModel;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 2

    .line 1
    iget-object v0, p0, Lw6/a;->a:Landroidx/navigation/NavController;

    iget-object v1, p0, Lw6/a;->b:Lcom/zykj/evaluation/ui/sheet/composition/CompositionViewModel;

    invoke-static {v0, v1}, Lw6/c;->b(Landroidx/navigation/NavController;Lcom/zykj/evaluation/ui/sheet/composition/CompositionViewModel;)Lkotlin/Unit;

    move-result-object v0

    return-object v0
.end method
