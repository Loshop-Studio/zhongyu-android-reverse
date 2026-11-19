.class public final synthetic Lc7/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:Lcom/zykj/evaluation/ui/sketch/SketchPlayViewModel;

.field public final synthetic b:Landroidx/navigation/NavController;


# direct methods
.method public synthetic constructor <init>(Lcom/zykj/evaluation/ui/sketch/SketchPlayViewModel;Landroidx/navigation/NavController;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lc7/d;->a:Lcom/zykj/evaluation/ui/sketch/SketchPlayViewModel;

    iput-object p2, p0, Lc7/d;->b:Landroidx/navigation/NavController;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    iget-object v0, p0, Lc7/d;->a:Lcom/zykj/evaluation/ui/sketch/SketchPlayViewModel;

    iget-object v1, p0, Lc7/d;->b:Landroidx/navigation/NavController;

    check-cast p1, Ljava/lang/Float;

    invoke-virtual {p1}, Ljava/lang/Float;->floatValue()F

    move-result p1

    invoke-static {v0, v1, p1}, Lcom/zykj/evaluation/ui/sketch/SketchPlayPageKt;->b(Lcom/zykj/evaluation/ui/sketch/SketchPlayViewModel;Landroidx/navigation/NavController;F)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
