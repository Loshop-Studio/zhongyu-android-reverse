.class public final synthetic Lg6/n;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# instance fields
.field public final synthetic a:Ljava/lang/String;

.field public final synthetic b:Ljava/lang/String;

.field public final synthetic c:Z

.field public final synthetic d:Lkotlin/jvm/functions/Function0;

.field public final synthetic e:Lcom/zykj/evaluation/ui/detail/e;

.field public final synthetic f:Lkotlin/jvm/functions/Function1;

.field public final synthetic g:Lcom/zykj/evaluation/ui/detail/f;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/String;Ljava/lang/String;ZLkotlin/jvm/functions/Function0;Lcom/zykj/evaluation/ui/detail/e;Lkotlin/jvm/functions/Function1;Lcom/zykj/evaluation/ui/detail/f;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lg6/n;->a:Ljava/lang/String;

    iput-object p2, p0, Lg6/n;->b:Ljava/lang/String;

    iput-boolean p3, p0, Lg6/n;->c:Z

    iput-object p4, p0, Lg6/n;->d:Lkotlin/jvm/functions/Function0;

    iput-object p5, p0, Lg6/n;->e:Lcom/zykj/evaluation/ui/detail/e;

    iput-object p6, p0, Lg6/n;->f:Lkotlin/jvm/functions/Function1;

    iput-object p7, p0, Lg6/n;->g:Lcom/zykj/evaluation/ui/detail/f;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    .line 1
    iget-object v0, p0, Lg6/n;->a:Ljava/lang/String;

    iget-object v1, p0, Lg6/n;->b:Ljava/lang/String;

    iget-boolean v2, p0, Lg6/n;->c:Z

    iget-object v3, p0, Lg6/n;->d:Lkotlin/jvm/functions/Function0;

    iget-object v4, p0, Lg6/n;->e:Lcom/zykj/evaluation/ui/detail/e;

    iget-object v5, p0, Lg6/n;->f:Lkotlin/jvm/functions/Function1;

    iget-object v6, p0, Lg6/n;->g:Lcom/zykj/evaluation/ui/detail/f;

    move-object v7, p1

    check-cast v7, Landroidx/compose/foundation/layout/RowScope;

    move-object v8, p2

    check-cast v8, Landroidx/compose/runtime/Composer;

    check-cast p3, Ljava/lang/Integer;

    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    move-result v9

    invoke-static/range {v0 .. v9}, Lcom/zykj/evaluation/ui/detail/widget/question/HandQuestionViewKt;->h(Ljava/lang/String;Ljava/lang/String;ZLkotlin/jvm/functions/Function0;Lcom/zykj/evaluation/ui/detail/e;Lkotlin/jvm/functions/Function1;Lcom/zykj/evaluation/ui/detail/f;Landroidx/compose/foundation/layout/RowScope;Landroidx/compose/runtime/Composer;I)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
