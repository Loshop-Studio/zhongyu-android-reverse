.class public final synthetic Lz6/o;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:Lcom/zykj/evaluation/ui/sheet/AnswerSheetViewModel;

.field public final synthetic b:Landroidx/navigation/NavController;


# direct methods
.method public synthetic constructor <init>(Lcom/zykj/evaluation/ui/sheet/AnswerSheetViewModel;Landroidx/navigation/NavController;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lz6/o;->a:Lcom/zykj/evaluation/ui/sheet/AnswerSheetViewModel;

    iput-object p2, p0, Lz6/o;->b:Landroidx/navigation/NavController;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 2

    .line 1
    iget-object v0, p0, Lz6/o;->a:Lcom/zykj/evaluation/ui/sheet/AnswerSheetViewModel;

    iget-object v1, p0, Lz6/o;->b:Landroidx/navigation/NavController;

    invoke-static {v0, v1}, Lz6/s;->b(Lcom/zykj/evaluation/ui/sheet/AnswerSheetViewModel;Landroidx/navigation/NavController;)Lkotlin/Unit;

    move-result-object v0

    return-object v0
.end method
