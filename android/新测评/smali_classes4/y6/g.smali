.class public final synthetic Ly6/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:Lcom/zykj/evaluation/ui/sheet/AnswerSheetViewModel;


# direct methods
.method public synthetic constructor <init>(Lcom/zykj/evaluation/ui/sheet/AnswerSheetViewModel;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ly6/g;->a:Lcom/zykj/evaluation/ui/sheet/AnswerSheetViewModel;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, Ly6/g;->a:Lcom/zykj/evaluation/ui/sheet/AnswerSheetViewModel;

    invoke-static {v0}, Lcom/zykj/evaluation/ui/sheet/preview/PreviewPageKt;->g(Lcom/zykj/evaluation/ui/sheet/AnswerSheetViewModel;)Lkotlin/Unit;

    move-result-object v0

    return-object v0
.end method
