.class public final synthetic Lb7/p;
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

    iput-object p1, p0, Lb7/p;->a:Lcom/zykj/evaluation/databinding/ViewAnswerSheetTrebleBinding;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, Lb7/p;->a:Lcom/zykj/evaluation/databinding/ViewAnswerSheetTrebleBinding;

    check-cast p1, Lg5/f$d;

    invoke-static {v0, p1}, Lcom/zykj/evaluation/ui/sheet/widget/AnswerSheetViewKt;->t(Lcom/zykj/evaluation/databinding/ViewAnswerSheetTrebleBinding;Lg5/f$d;)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
