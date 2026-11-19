.class public final synthetic Lu6/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:Ljava/util/List;

.field public final synthetic b:Ljava/util/List;

.field public final synthetic c:Lcom/zykj/evaluation/ui/progress/ProgressViewModel;

.field public final synthetic d:I

.field public final synthetic e:I


# direct methods
.method public synthetic constructor <init>(Ljava/util/List;Ljava/util/List;Lcom/zykj/evaluation/ui/progress/ProgressViewModel;II)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lu6/g;->a:Ljava/util/List;

    iput-object p2, p0, Lu6/g;->b:Ljava/util/List;

    iput-object p3, p0, Lu6/g;->c:Lcom/zykj/evaluation/ui/progress/ProgressViewModel;

    iput p4, p0, Lu6/g;->d:I

    iput p5, p0, Lu6/g;->e:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    .line 1
    iget-object v0, p0, Lu6/g;->a:Ljava/util/List;

    iget-object v1, p0, Lu6/g;->b:Ljava/util/List;

    iget-object v2, p0, Lu6/g;->c:Lcom/zykj/evaluation/ui/progress/ProgressViewModel;

    iget v3, p0, Lu6/g;->d:I

    iget v4, p0, Lu6/g;->e:I

    move-object v5, p1

    check-cast v5, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v6

    invoke-static/range {v0 .. v6}, Lcom/zykj/evaluation/ui/progress/ProgressPageKt;->a(Ljava/util/List;Ljava/util/List;Lcom/zykj/evaluation/ui/progress/ProgressViewModel;IILandroidx/compose/runtime/Composer;I)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
