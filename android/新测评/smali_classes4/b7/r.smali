.class public final synthetic Lb7/r;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:Lcom/zykj/evaluation/databinding/ViewAnswerSheetTrebleBinding;


# direct methods
.method public synthetic constructor <init>(Lcom/zykj/evaluation/databinding/ViewAnswerSheetTrebleBinding;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lb7/r;->a:Lcom/zykj/evaluation/databinding/ViewAnswerSheetTrebleBinding;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, Lb7/r;->a:Lcom/zykj/evaluation/databinding/ViewAnswerSheetTrebleBinding;

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    invoke-static {v0, p1}, Lcom/zykj/evaluation/ui/sheet/widget/AnswerSheetViewKt;->h(Lcom/zykj/evaluation/databinding/ViewAnswerSheetTrebleBinding;Z)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
