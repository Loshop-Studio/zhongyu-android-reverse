.class public final synthetic Lj6/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# instance fields
.field public final synthetic a:Lj6/p;

.field public final synthetic b:Ljava/util/List;

.field public final synthetic c:Landroidx/navigation/NavController;

.field public final synthetic d:Lkotlin/jvm/functions/Function1;


# direct methods
.method public synthetic constructor <init>(Lj6/p;Ljava/util/List;Landroidx/navigation/NavController;Lkotlin/jvm/functions/Function1;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lj6/d;->a:Lj6/p;

    iput-object p2, p0, Lj6/d;->b:Ljava/util/List;

    iput-object p3, p0, Lj6/d;->c:Landroidx/navigation/NavController;

    iput-object p4, p0, Lj6/d;->d:Lkotlin/jvm/functions/Function1;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    .line 1
    iget-object v0, p0, Lj6/d;->a:Lj6/p;

    iget-object v1, p0, Lj6/d;->b:Ljava/util/List;

    iget-object v2, p0, Lj6/d;->c:Landroidx/navigation/NavController;

    iget-object v3, p0, Lj6/d;->d:Lkotlin/jvm/functions/Function1;

    move-object v4, p1

    check-cast v4, Landroidx/compose/foundation/layout/RowScope;

    move-object v5, p2

    check-cast v5, Landroidx/compose/runtime/Composer;

    check-cast p3, Ljava/lang/Integer;

    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    move-result v6

    invoke-static/range {v0 .. v6}, Lcom/zykj/evaluation/ui/guide/normal/GuidePageKt;->d(Lj6/p;Ljava/util/List;Landroidx/navigation/NavController;Lkotlin/jvm/functions/Function1;Landroidx/compose/foundation/layout/RowScope;Landroidx/compose/runtime/Composer;I)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
