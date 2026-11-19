.class public final synthetic Lc6/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function4;


# instance fields
.field public final synthetic a:Lkotlin/jvm/functions/Function7;

.field public final synthetic b:Lcom/zykj/evaluation/ui/detail/toCorrect/ToCorrectDetailViewModel;

.field public final synthetic c:Landroidx/compose/runtime/MutableState;


# direct methods
.method public synthetic constructor <init>(Lkotlin/jvm/functions/Function7;Lcom/zykj/evaluation/ui/detail/toCorrect/ToCorrectDetailViewModel;Landroidx/compose/runtime/MutableState;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lc6/b;->a:Lkotlin/jvm/functions/Function7;

    iput-object p2, p0, Lc6/b;->b:Lcom/zykj/evaluation/ui/detail/toCorrect/ToCorrectDetailViewModel;

    iput-object p3, p0, Lc6/b;->c:Landroidx/compose/runtime/MutableState;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    .line 1
    iget-object v0, p0, Lc6/b;->a:Lkotlin/jvm/functions/Function7;

    iget-object v1, p0, Lc6/b;->b:Lcom/zykj/evaluation/ui/detail/toCorrect/ToCorrectDetailViewModel;

    iget-object v2, p0, Lc6/b;->c:Landroidx/compose/runtime/MutableState;

    move-object v3, p1

    check-cast v3, Ljava/lang/String;

    move-object v4, p2

    check-cast v4, Ljava/lang/String;

    check-cast p3, Ljava/lang/Boolean;

    invoke-virtual {p3}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v5

    move-object v6, p4

    check-cast v6, Ljava/lang/String;

    invoke-static/range {v0 .. v6}, Lcom/zykj/evaluation/ui/detail/toCorrect/ToCorrectDetailPageKt;->a(Lkotlin/jvm/functions/Function7;Lcom/zykj/evaluation/ui/detail/toCorrect/ToCorrectDetailViewModel;Landroidx/compose/runtime/MutableState;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
