.class public final synthetic Lr6/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# instance fields
.field public final synthetic a:Lh6/a;

.field public final synthetic b:Landroidx/navigation/NavController;

.field public final synthetic c:Lcom/zykj/evaluation/ui/guide/BaseGuideViewModel;

.field public final synthetic d:Lkotlin/jvm/functions/Function0;

.field public final synthetic e:Lkotlin/jvm/functions/Function3;


# direct methods
.method public synthetic constructor <init>(Lh6/a;Landroidx/navigation/NavController;Lcom/zykj/evaluation/ui/guide/BaseGuideViewModel;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function3;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lr6/f;->a:Lh6/a;

    iput-object p2, p0, Lr6/f;->b:Landroidx/navigation/NavController;

    iput-object p3, p0, Lr6/f;->c:Lcom/zykj/evaluation/ui/guide/BaseGuideViewModel;

    iput-object p4, p0, Lr6/f;->d:Lkotlin/jvm/functions/Function0;

    iput-object p5, p0, Lr6/f;->e:Lkotlin/jvm/functions/Function3;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    .line 1
    iget-object v0, p0, Lr6/f;->a:Lh6/a;

    iget-object v1, p0, Lr6/f;->b:Landroidx/navigation/NavController;

    iget-object v2, p0, Lr6/f;->c:Lcom/zykj/evaluation/ui/guide/BaseGuideViewModel;

    iget-object v3, p0, Lr6/f;->d:Lkotlin/jvm/functions/Function0;

    iget-object v4, p0, Lr6/f;->e:Lkotlin/jvm/functions/Function3;

    move-object v5, p1

    check-cast v5, Landroidx/compose/foundation/layout/BoxScope;

    move-object v6, p2

    check-cast v6, Landroidx/compose/runtime/Composer;

    check-cast p3, Ljava/lang/Integer;

    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    move-result v7

    invoke-static/range {v0 .. v7}, Lr6/m;->a(Lh6/a;Landroidx/navigation/NavController;Lcom/zykj/evaluation/ui/guide/BaseGuideViewModel;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function3;Landroidx/compose/foundation/layout/BoxScope;Landroidx/compose/runtime/Composer;I)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
