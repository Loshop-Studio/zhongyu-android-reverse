.class public final synthetic Lb7/z;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:Lcom/zykj/evaluation/databinding/ViewAnswerSheetCommonBinding;


# direct methods
.method public synthetic constructor <init>(Lcom/zykj/evaluation/databinding/ViewAnswerSheetCommonBinding;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lb7/z;->a:Lcom/zykj/evaluation/databinding/ViewAnswerSheetCommonBinding;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, Lb7/z;->a:Lcom/zykj/evaluation/databinding/ViewAnswerSheetCommonBinding;

    check-cast p1, Lg5/d;

    invoke-static {v0, p1}, Lcom/zykj/evaluation/ui/sheet/widget/AnswerSheetViewKt;->g(Lcom/zykj/evaluation/databinding/ViewAnswerSheetCommonBinding;Lg5/d;)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
