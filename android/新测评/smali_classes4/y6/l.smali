.class public final synthetic Ly6/l;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:Lcom/zykj/evaluation/ui/sheet/AnswerSheetViewModel;


# direct methods
.method public synthetic constructor <init>(Lcom/zykj/evaluation/ui/sheet/AnswerSheetViewModel;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ly6/l;->a:Lcom/zykj/evaluation/ui/sheet/AnswerSheetViewModel;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, Ly6/l;->a:Lcom/zykj/evaluation/ui/sheet/AnswerSheetViewModel;

    check-cast p1, Lv6/z;

    invoke-static {v0, p1}, Lcom/zykj/evaluation/ui/sheet/preview/PreviewPageKt;->o(Lcom/zykj/evaluation/ui/sheet/AnswerSheetViewModel;Lv6/z;)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
