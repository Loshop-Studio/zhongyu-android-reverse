.class public final synthetic Lb7/t;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:Lcom/zykj/evaluation/databinding/ViewAnswerSheetTrebleBinding;


# direct methods
.method public synthetic constructor <init>(Lcom/zykj/evaluation/databinding/ViewAnswerSheetTrebleBinding;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lb7/t;->a:Lcom/zykj/evaluation/databinding/ViewAnswerSheetTrebleBinding;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, Lb7/t;->a:Lcom/zykj/evaluation/databinding/ViewAnswerSheetTrebleBinding;

    invoke-static {v0}, Lcom/zykj/evaluation/ui/sheet/widget/AnswerSheetViewKt;->o(Lcom/zykj/evaluation/databinding/ViewAnswerSheetTrebleBinding;)Lkotlin/Unit;

    move-result-object v0

    return-object v0
.end method
