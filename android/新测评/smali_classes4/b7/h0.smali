.class public final synthetic Lb7/h0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# instance fields
.field public final synthetic a:Lb7/l;

.field public final synthetic b:Lkotlin/jvm/functions/Function1;

.field public final synthetic c:Lkotlin/jvm/functions/Function1;

.field public final synthetic d:Lkotlin/jvm/internal/Ref$BooleanRef;


# direct methods
.method public synthetic constructor <init>(Lb7/l;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/internal/Ref$BooleanRef;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lb7/h0;->a:Lb7/l;

    iput-object p2, p0, Lb7/h0;->b:Lkotlin/jvm/functions/Function1;

    iput-object p3, p0, Lb7/h0;->c:Lkotlin/jvm/functions/Function1;

    iput-object p4, p0, Lb7/h0;->d:Lkotlin/jvm/internal/Ref$BooleanRef;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    .line 1
    iget-object v0, p0, Lb7/h0;->a:Lb7/l;

    iget-object v1, p0, Lb7/h0;->b:Lkotlin/jvm/functions/Function1;

    iget-object v2, p0, Lb7/h0;->c:Lkotlin/jvm/functions/Function1;

    iget-object v3, p0, Lb7/h0;->d:Lkotlin/jvm/internal/Ref$BooleanRef;

    move-object v4, p1

    check-cast v4, Landroid/view/LayoutInflater;

    move-object v5, p2

    check-cast v5, Landroid/view/ViewGroup;

    check-cast p3, Ljava/lang/Boolean;

    invoke-virtual {p3}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v6

    invoke-static/range {v0 .. v6}, Lcom/zykj/evaluation/ui/sheet/widget/AnswerSheetViewKt;->v(Lb7/l;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/internal/Ref$BooleanRef;Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/zykj/evaluation/databinding/ViewAnswerSheetCompositionBinding;

    move-result-object p1

    return-object p1
.end method
