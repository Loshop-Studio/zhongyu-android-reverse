.class public final synthetic Lv6/p;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:Lkotlin/jvm/functions/Function1;

.field public final synthetic b:Landroidx/navigation/NavController;

.field public final synthetic c:Lcom/zykj/evaluation/ui/sheet/AnswerSheetViewModel;

.field public final synthetic d:Lkotlin/jvm/functions/Function0;

.field public final synthetic e:I


# direct methods
.method public synthetic constructor <init>(Lkotlin/jvm/functions/Function1;Landroidx/navigation/NavController;Lcom/zykj/evaluation/ui/sheet/AnswerSheetViewModel;Lkotlin/jvm/functions/Function0;I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lv6/p;->a:Lkotlin/jvm/functions/Function1;

    iput-object p2, p0, Lv6/p;->b:Landroidx/navigation/NavController;

    iput-object p3, p0, Lv6/p;->c:Lcom/zykj/evaluation/ui/sheet/AnswerSheetViewModel;

    iput-object p4, p0, Lv6/p;->d:Lkotlin/jvm/functions/Function0;

    iput p5, p0, Lv6/p;->e:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    .line 1
    iget-object v0, p0, Lv6/p;->a:Lkotlin/jvm/functions/Function1;

    iget-object v1, p0, Lv6/p;->b:Landroidx/navigation/NavController;

    iget-object v2, p0, Lv6/p;->c:Lcom/zykj/evaluation/ui/sheet/AnswerSheetViewModel;

    iget-object v3, p0, Lv6/p;->d:Lkotlin/jvm/functions/Function0;

    iget v4, p0, Lv6/p;->e:I

    move-object v5, p1

    check-cast v5, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v6

    invoke-static/range {v0 .. v6}, Lcom/zykj/evaluation/ui/sheet/AnswerSheetPageKt;->f(Lkotlin/jvm/functions/Function1;Landroidx/navigation/NavController;Lcom/zykj/evaluation/ui/sheet/AnswerSheetViewModel;Lkotlin/jvm/functions/Function0;ILandroidx/compose/runtime/Composer;I)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
