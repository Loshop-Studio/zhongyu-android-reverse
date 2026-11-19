.class public final synthetic Lv6/r;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:Lcom/zykj/evaluation/ui/sheet/AnswerSheetViewModel;

.field public final synthetic b:Landroidx/navigation/NavController;


# direct methods
.method public synthetic constructor <init>(Lcom/zykj/evaluation/ui/sheet/AnswerSheetViewModel;Landroidx/navigation/NavController;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lv6/r;->a:Lcom/zykj/evaluation/ui/sheet/AnswerSheetViewModel;

    iput-object p2, p0, Lv6/r;->b:Landroidx/navigation/NavController;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    iget-object v0, p0, Lv6/r;->a:Lcom/zykj/evaluation/ui/sheet/AnswerSheetViewModel;

    iget-object v1, p0, Lv6/r;->b:Landroidx/navigation/NavController;

    check-cast p1, Lb7/c1;

    invoke-static {v0, v1, p1}, Lcom/zykj/evaluation/ui/sheet/AnswerSheetPageKt;->c(Lcom/zykj/evaluation/ui/sheet/AnswerSheetViewModel;Landroidx/navigation/NavController;Lb7/c1;)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
