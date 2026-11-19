.class public final synthetic Lc7/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:Lcom/zykj/evaluation/ui/sketch/SketchPlayViewModel;

.field public final synthetic b:Lc7/c;

.field public final synthetic c:Landroidx/navigation/NavController;


# direct methods
.method public synthetic constructor <init>(Lcom/zykj/evaluation/ui/sketch/SketchPlayViewModel;Lc7/c;Landroidx/navigation/NavController;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lc7/e;->a:Lcom/zykj/evaluation/ui/sketch/SketchPlayViewModel;

    iput-object p2, p0, Lc7/e;->b:Lc7/c;

    iput-object p3, p0, Lc7/e;->c:Landroidx/navigation/NavController;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 3

    .line 1
    iget-object v0, p0, Lc7/e;->a:Lcom/zykj/evaluation/ui/sketch/SketchPlayViewModel;

    iget-object v1, p0, Lc7/e;->b:Lc7/c;

    iget-object v2, p0, Lc7/e;->c:Landroidx/navigation/NavController;

    invoke-static {v0, v1, v2}, Lcom/zykj/evaluation/ui/sketch/SketchPlayPageKt;->d(Lcom/zykj/evaluation/ui/sketch/SketchPlayViewModel;Lc7/c;Landroidx/navigation/NavController;)Lkotlin/Unit;

    move-result-object v0

    return-object v0
.end method
