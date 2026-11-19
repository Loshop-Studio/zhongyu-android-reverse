.class public final synthetic Lg6/p;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# instance fields
.field public final synthetic a:Ljava/lang/String;

.field public final synthetic b:Ljava/lang/String;

.field public final synthetic c:Lcom/zykj/evaluation/ui/detail/f;

.field public final synthetic d:Z

.field public final synthetic e:Lcom/zykj/evaluation/ui/detail/e;

.field public final synthetic f:Lkotlin/jvm/functions/Function1;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/String;Ljava/lang/String;Lcom/zykj/evaluation/ui/detail/f;ZLcom/zykj/evaluation/ui/detail/e;Lkotlin/jvm/functions/Function1;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lg6/p;->a:Ljava/lang/String;

    iput-object p2, p0, Lg6/p;->b:Ljava/lang/String;

    iput-object p3, p0, Lg6/p;->c:Lcom/zykj/evaluation/ui/detail/f;

    iput-boolean p4, p0, Lg6/p;->d:Z

    iput-object p5, p0, Lg6/p;->e:Lcom/zykj/evaluation/ui/detail/e;

    iput-object p6, p0, Lg6/p;->f:Lkotlin/jvm/functions/Function1;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    .line 1
    iget-object v0, p0, Lg6/p;->a:Ljava/lang/String;

    iget-object v1, p0, Lg6/p;->b:Ljava/lang/String;

    iget-object v2, p0, Lg6/p;->c:Lcom/zykj/evaluation/ui/detail/f;

    iget-boolean v3, p0, Lg6/p;->d:Z

    iget-object v4, p0, Lg6/p;->e:Lcom/zykj/evaluation/ui/detail/e;

    iget-object v5, p0, Lg6/p;->f:Lkotlin/jvm/functions/Function1;

    move-object v6, p1

    check-cast v6, Landroidx/compose/foundation/layout/BoxScope;

    move-object v7, p2

    check-cast v7, Landroidx/compose/runtime/Composer;

    check-cast p3, Ljava/lang/Integer;

    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    move-result v8

    invoke-static/range {v0 .. v8}, Lcom/zykj/evaluation/ui/detail/widget/question/HandQuestionViewKt;->a(Ljava/lang/String;Ljava/lang/String;Lcom/zykj/evaluation/ui/detail/f;ZLcom/zykj/evaluation/ui/detail/e;Lkotlin/jvm/functions/Function1;Landroidx/compose/foundation/layout/BoxScope;Landroidx/compose/runtime/Composer;I)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
