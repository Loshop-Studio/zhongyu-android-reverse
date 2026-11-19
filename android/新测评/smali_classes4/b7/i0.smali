.class public final synthetic Lb7/i0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:Lb7/l;

.field public final synthetic b:I


# direct methods
.method public synthetic constructor <init>(Lb7/l;I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lb7/i0;->a:Lb7/l;

    iput p2, p0, Lb7/i0;->b:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    iget-object v0, p0, Lb7/i0;->a:Lb7/l;

    iget v1, p0, Lb7/i0;->b:I

    check-cast p1, Lcom/zykj/evaluation/databinding/ViewAnswerSheetCompositionBinding;

    invoke-static {v0, v1, p1}, Lcom/zykj/evaluation/ui/sheet/widget/AnswerSheetViewKt;->e(Lb7/l;ILcom/zykj/evaluation/databinding/ViewAnswerSheetCompositionBinding;)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
