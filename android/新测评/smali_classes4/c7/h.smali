.class public final synthetic Lc7/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:J

.field public final synthetic b:J

.field public final synthetic c:Ljava/lang/String;

.field public final synthetic d:Landroidx/navigation/NavController;

.field public final synthetic e:Lcom/zykj/evaluation/ui/sketch/SketchPlayViewModel;

.field public final synthetic f:I

.field public final synthetic g:I


# direct methods
.method public synthetic constructor <init>(JJLjava/lang/String;Landroidx/navigation/NavController;Lcom/zykj/evaluation/ui/sketch/SketchPlayViewModel;II)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-wide p1, p0, Lc7/h;->a:J

    iput-wide p3, p0, Lc7/h;->b:J

    iput-object p5, p0, Lc7/h;->c:Ljava/lang/String;

    iput-object p6, p0, Lc7/h;->d:Landroidx/navigation/NavController;

    iput-object p7, p0, Lc7/h;->e:Lcom/zykj/evaluation/ui/sketch/SketchPlayViewModel;

    iput p8, p0, Lc7/h;->f:I

    iput p9, p0, Lc7/h;->g:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 11

    .line 1
    iget-wide v0, p0, Lc7/h;->a:J

    iget-wide v2, p0, Lc7/h;->b:J

    iget-object v4, p0, Lc7/h;->c:Ljava/lang/String;

    iget-object v5, p0, Lc7/h;->d:Landroidx/navigation/NavController;

    iget-object v6, p0, Lc7/h;->e:Lcom/zykj/evaluation/ui/sketch/SketchPlayViewModel;

    iget v7, p0, Lc7/h;->f:I

    iget v8, p0, Lc7/h;->g:I

    move-object v9, p1

    check-cast v9, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v10

    invoke-static/range {v0 .. v10}, Lcom/zykj/evaluation/ui/sketch/SketchPlayPageKt;->a(JJLjava/lang/String;Landroidx/navigation/NavController;Lcom/zykj/evaluation/ui/sketch/SketchPlayViewModel;IILandroidx/compose/runtime/Composer;I)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
