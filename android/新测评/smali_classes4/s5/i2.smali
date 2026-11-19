.class public final synthetic Ls5/i2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:Landroidx/navigation/NavHostController;

.field public final synthetic b:Lcom/zykj/evaluation/ui/MainFragment;


# direct methods
.method public synthetic constructor <init>(Landroidx/navigation/NavHostController;Lcom/zykj/evaluation/ui/MainFragment;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ls5/i2;->a:Landroidx/navigation/NavHostController;

    iput-object p2, p0, Ls5/i2;->b:Lcom/zykj/evaluation/ui/MainFragment;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    iget-object v0, p0, Ls5/i2;->a:Landroidx/navigation/NavHostController;

    iget-object v1, p0, Ls5/i2;->b:Lcom/zykj/evaluation/ui/MainFragment;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-static {v0, v1, p1, p2}, Lcom/zykj/evaluation/ui/MainFragment;->i(Landroidx/navigation/NavHostController;Lcom/zykj/evaluation/ui/MainFragment;Landroidx/compose/runtime/Composer;I)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
