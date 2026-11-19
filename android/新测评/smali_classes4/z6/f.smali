.class public final synthetic Lz6/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:Lx6/b;

.field public final synthetic b:Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel;

.field public final synthetic c:Landroidx/navigation/NavController;


# direct methods
.method public synthetic constructor <init>(Lx6/b;Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel;Landroidx/navigation/NavController;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lz6/f;->a:Lx6/b;

    iput-object p2, p0, Lz6/f;->b:Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel;

    iput-object p3, p0, Lz6/f;->c:Landroidx/navigation/NavController;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    .line 1
    iget-object v0, p0, Lz6/f;->a:Lx6/b;

    iget-object v1, p0, Lz6/f;->b:Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel;

    iget-object v2, p0, Lz6/f;->c:Landroidx/navigation/NavController;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-static {v0, v1, v2, p1, p2}, Lz6/n;->g(Lx6/b;Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel;Landroidx/navigation/NavController;Landroidx/compose/runtime/Composer;I)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
