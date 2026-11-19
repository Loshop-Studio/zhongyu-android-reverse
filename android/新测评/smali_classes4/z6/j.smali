.class public final synthetic Lz6/j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:Lx6/b;

.field public final synthetic b:Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel;

.field public final synthetic c:Landroidx/navigation/NavController;


# direct methods
.method public synthetic constructor <init>(Lx6/b;Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel;Landroidx/navigation/NavController;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lz6/j;->a:Lx6/b;

    iput-object p2, p0, Lz6/j;->b:Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel;

    iput-object p3, p0, Lz6/j;->c:Landroidx/navigation/NavController;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 3

    .line 1
    iget-object v0, p0, Lz6/j;->a:Lx6/b;

    iget-object v1, p0, Lz6/j;->b:Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel;

    iget-object v2, p0, Lz6/j;->c:Landroidx/navigation/NavController;

    invoke-static {v0, v1, v2}, Lz6/n;->c(Lx6/b;Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel;Landroidx/navigation/NavController;)Lkotlin/Unit;

    move-result-object v0

    return-object v0
.end method
