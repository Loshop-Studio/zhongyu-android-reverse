.class public final synthetic Ls6/y;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# instance fields
.field public final synthetic a:Ljava/util/List;

.field public final synthetic b:Landroidx/navigation/NavController;

.field public final synthetic c:Ljava/util/List;

.field public final synthetic d:Lkotlin/jvm/functions/Function0;


# direct methods
.method public synthetic constructor <init>(Ljava/util/List;Landroidx/navigation/NavController;Ljava/util/List;Lkotlin/jvm/functions/Function0;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ls6/y;->a:Ljava/util/List;

    iput-object p2, p0, Ls6/y;->b:Landroidx/navigation/NavController;

    iput-object p3, p0, Ls6/y;->c:Ljava/util/List;

    iput-object p4, p0, Ls6/y;->d:Lkotlin/jvm/functions/Function0;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    .line 1
    iget-object v0, p0, Ls6/y;->a:Ljava/util/List;

    iget-object v1, p0, Ls6/y;->b:Landroidx/navigation/NavController;

    iget-object v2, p0, Ls6/y;->c:Ljava/util/List;

    iget-object v3, p0, Ls6/y;->d:Lkotlin/jvm/functions/Function0;

    move-object v4, p1

    check-cast v4, Landroidx/compose/foundation/layout/BoxScope;

    move-object v5, p2

    check-cast v5, Landroidx/compose/runtime/Composer;

    check-cast p3, Ljava/lang/Integer;

    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    move-result v6

    invoke-static/range {v0 .. v6}, Lcom/zykj/evaluation/ui/home/HomeMainKt;->c(Ljava/util/List;Landroidx/navigation/NavController;Ljava/util/List;Lkotlin/jvm/functions/Function0;Landroidx/compose/foundation/layout/BoxScope;Landroidx/compose/runtime/Composer;I)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
