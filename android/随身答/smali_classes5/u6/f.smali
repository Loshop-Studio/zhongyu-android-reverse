.class public final synthetic Lu6/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:Landroidx/navigation/NavHostController;

.field public final synthetic b:Ljava/util/List;

.field public final synthetic c:Lkotlin/jvm/functions/Function0;

.field public final synthetic d:Lkotlin/jvm/functions/Function1;

.field public final synthetic e:I

.field public final synthetic f:I


# direct methods
.method public synthetic constructor <init>(Landroidx/navigation/NavHostController;Ljava/util/List;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;II)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lu6/f;->a:Landroidx/navigation/NavHostController;

    iput-object p2, p0, Lu6/f;->b:Ljava/util/List;

    iput-object p3, p0, Lu6/f;->c:Lkotlin/jvm/functions/Function0;

    iput-object p4, p0, Lu6/f;->d:Lkotlin/jvm/functions/Function1;

    iput p5, p0, Lu6/f;->e:I

    iput p6, p0, Lu6/f;->f:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    .line 1
    iget-object v0, p0, Lu6/f;->a:Landroidx/navigation/NavHostController;

    iget-object v1, p0, Lu6/f;->b:Ljava/util/List;

    iget-object v2, p0, Lu6/f;->c:Lkotlin/jvm/functions/Function0;

    iget-object v3, p0, Lu6/f;->d:Lkotlin/jvm/functions/Function1;

    iget v4, p0, Lu6/f;->e:I

    iget v5, p0, Lu6/f;->f:I

    move-object v6, p1

    check-cast v6, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v7

    invoke-static/range {v0 .. v7}, Lcom/zykj/student/dialogue/ui/home/dialog/MoveDialogKt;->c(Landroidx/navigation/NavHostController;Ljava/util/List;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
