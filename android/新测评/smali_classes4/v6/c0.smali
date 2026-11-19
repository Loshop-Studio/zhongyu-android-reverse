.class public final synthetic Lv6/c0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# instance fields
.field public final synthetic a:Lb7/w0;

.field public final synthetic b:Lv6/k0;

.field public final synthetic c:Lcom/zykj/evaluation/ui/sheet/AnswerSheetViewModel;

.field public final synthetic d:Lkotlin/jvm/functions/Function0;

.field public final synthetic e:Landroidx/navigation/NavController;


# direct methods
.method public synthetic constructor <init>(Lb7/w0;Lv6/k0;Lcom/zykj/evaluation/ui/sheet/AnswerSheetViewModel;Lkotlin/jvm/functions/Function0;Landroidx/navigation/NavController;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lv6/c0;->a:Lb7/w0;

    iput-object p2, p0, Lv6/c0;->b:Lv6/k0;

    iput-object p3, p0, Lv6/c0;->c:Lcom/zykj/evaluation/ui/sheet/AnswerSheetViewModel;

    iput-object p4, p0, Lv6/c0;->d:Lkotlin/jvm/functions/Function0;

    iput-object p5, p0, Lv6/c0;->e:Landroidx/navigation/NavController;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    .line 1
    iget-object v0, p0, Lv6/c0;->a:Lb7/w0;

    iget-object v1, p0, Lv6/c0;->b:Lv6/k0;

    iget-object v2, p0, Lv6/c0;->c:Lcom/zykj/evaluation/ui/sheet/AnswerSheetViewModel;

    iget-object v3, p0, Lv6/c0;->d:Lkotlin/jvm/functions/Function0;

    iget-object v4, p0, Lv6/c0;->e:Landroidx/navigation/NavController;

    move-object v5, p1

    check-cast v5, Landroidx/compose/foundation/layout/BoxScope;

    move-object v6, p2

    check-cast v6, Landroidx/compose/runtime/Composer;

    check-cast p3, Ljava/lang/Integer;

    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    move-result v7

    invoke-static/range {v0 .. v7}, Lv6/j0;->a(Lb7/w0;Lv6/k0;Lcom/zykj/evaluation/ui/sheet/AnswerSheetViewModel;Lkotlin/jvm/functions/Function0;Landroidx/navigation/NavController;Landroidx/compose/foundation/layout/BoxScope;Landroidx/compose/runtime/Composer;I)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
