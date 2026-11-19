.class public final synthetic Lu6/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:Ljava/util/List;

.field public final synthetic b:Landroidx/compose/runtime/MutableState;

.field public final synthetic c:Landroidx/navigation/NavHostController;

.field public final synthetic d:Lkotlin/jvm/functions/Function0;

.field public final synthetic e:Lkotlin/jvm/functions/Function1;


# direct methods
.method public synthetic constructor <init>(Ljava/util/List;Landroidx/compose/runtime/MutableState;Landroidx/navigation/NavHostController;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lu6/e;->a:Ljava/util/List;

    iput-object p2, p0, Lu6/e;->b:Landroidx/compose/runtime/MutableState;

    iput-object p3, p0, Lu6/e;->c:Landroidx/navigation/NavHostController;

    iput-object p4, p0, Lu6/e;->d:Lkotlin/jvm/functions/Function0;

    iput-object p5, p0, Lu6/e;->e:Lkotlin/jvm/functions/Function1;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    .line 1
    iget-object v0, p0, Lu6/e;->a:Ljava/util/List;

    iget-object v1, p0, Lu6/e;->b:Landroidx/compose/runtime/MutableState;

    iget-object v2, p0, Lu6/e;->c:Landroidx/navigation/NavHostController;

    iget-object v3, p0, Lu6/e;->d:Lkotlin/jvm/functions/Function0;

    iget-object v4, p0, Lu6/e;->e:Lkotlin/jvm/functions/Function1;

    move-object v5, p1

    check-cast v5, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v6

    invoke-static/range {v0 .. v6}, Lcom/zykj/student/dialogue/ui/home/dialog/MoveDialogKt;->e(Ljava/util/List;Landroidx/compose/runtime/MutableState;Landroidx/navigation/NavHostController;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
