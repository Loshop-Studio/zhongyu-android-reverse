.class public final synthetic Lv6/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:Lkotlin/jvm/functions/Function1;

.field public final synthetic b:Landroidx/navigation/NavHostController;

.field public final synthetic c:Lcom/zykj/evaluation/ui/sheet/AnswerSheetViewModel;

.field public final synthetic d:Lkotlin/jvm/functions/Function0;

.field public final synthetic e:Lkotlin/jvm/functions/Function0;


# direct methods
.method public synthetic constructor <init>(Lkotlin/jvm/functions/Function1;Landroidx/navigation/NavHostController;Lcom/zykj/evaluation/ui/sheet/AnswerSheetViewModel;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lv6/d;->a:Lkotlin/jvm/functions/Function1;

    iput-object p2, p0, Lv6/d;->b:Landroidx/navigation/NavHostController;

    iput-object p3, p0, Lv6/d;->c:Lcom/zykj/evaluation/ui/sheet/AnswerSheetViewModel;

    iput-object p4, p0, Lv6/d;->d:Lkotlin/jvm/functions/Function0;

    iput-object p5, p0, Lv6/d;->e:Lkotlin/jvm/functions/Function0;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    .line 1
    iget-object v0, p0, Lv6/d;->a:Lkotlin/jvm/functions/Function1;

    iget-object v1, p0, Lv6/d;->b:Landroidx/navigation/NavHostController;

    iget-object v2, p0, Lv6/d;->c:Lcom/zykj/evaluation/ui/sheet/AnswerSheetViewModel;

    iget-object v3, p0, Lv6/d;->d:Lkotlin/jvm/functions/Function0;

    iget-object v4, p0, Lv6/d;->e:Lkotlin/jvm/functions/Function0;

    move-object v5, p1

    check-cast v5, Landroidx/navigation/NavGraphBuilder;

    invoke-static/range {v0 .. v5}, Lcom/zykj/evaluation/ui/sheet/AnswerSheetPageKt;->d(Lkotlin/jvm/functions/Function1;Landroidx/navigation/NavHostController;Lcom/zykj/evaluation/ui/sheet/AnswerSheetViewModel;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/navigation/NavGraphBuilder;)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
