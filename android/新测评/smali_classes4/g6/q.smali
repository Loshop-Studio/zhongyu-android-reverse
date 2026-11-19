.class public final synthetic Lg6/q;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:Landroidx/compose/ui/Modifier;

.field public final synthetic b:Ljava/lang/String;

.field public final synthetic c:Ljava/lang/String;

.field public final synthetic d:Z

.field public final synthetic e:Lkotlin/jvm/functions/Function0;

.field public final synthetic f:Lcom/zykj/evaluation/ui/detail/e;

.field public final synthetic g:Lkotlin/jvm/functions/Function1;

.field public final synthetic h:Lcom/zykj/evaluation/ui/detail/f;

.field public final synthetic i:I

.field public final synthetic j:I


# direct methods
.method public synthetic constructor <init>(Landroidx/compose/ui/Modifier;Ljava/lang/String;Ljava/lang/String;ZLkotlin/jvm/functions/Function0;Lcom/zykj/evaluation/ui/detail/e;Lkotlin/jvm/functions/Function1;Lcom/zykj/evaluation/ui/detail/f;II)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lg6/q;->a:Landroidx/compose/ui/Modifier;

    iput-object p2, p0, Lg6/q;->b:Ljava/lang/String;

    iput-object p3, p0, Lg6/q;->c:Ljava/lang/String;

    iput-boolean p4, p0, Lg6/q;->d:Z

    iput-object p5, p0, Lg6/q;->e:Lkotlin/jvm/functions/Function0;

    iput-object p6, p0, Lg6/q;->f:Lcom/zykj/evaluation/ui/detail/e;

    iput-object p7, p0, Lg6/q;->g:Lkotlin/jvm/functions/Function1;

    iput-object p8, p0, Lg6/q;->h:Lcom/zykj/evaluation/ui/detail/f;

    iput p9, p0, Lg6/q;->i:I

    iput p10, p0, Lg6/q;->j:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 12

    .line 1
    iget-object v0, p0, Lg6/q;->a:Landroidx/compose/ui/Modifier;

    iget-object v1, p0, Lg6/q;->b:Ljava/lang/String;

    iget-object v2, p0, Lg6/q;->c:Ljava/lang/String;

    iget-boolean v3, p0, Lg6/q;->d:Z

    iget-object v4, p0, Lg6/q;->e:Lkotlin/jvm/functions/Function0;

    iget-object v5, p0, Lg6/q;->f:Lcom/zykj/evaluation/ui/detail/e;

    iget-object v6, p0, Lg6/q;->g:Lkotlin/jvm/functions/Function1;

    iget-object v7, p0, Lg6/q;->h:Lcom/zykj/evaluation/ui/detail/f;

    iget v8, p0, Lg6/q;->i:I

    iget v9, p0, Lg6/q;->j:I

    move-object v10, p1

    check-cast v10, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v11

    invoke-static/range {v0 .. v11}, Lcom/zykj/evaluation/ui/detail/widget/question/HandQuestionViewKt;->c(Landroidx/compose/ui/Modifier;Ljava/lang/String;Ljava/lang/String;ZLkotlin/jvm/functions/Function0;Lcom/zykj/evaluation/ui/detail/e;Lkotlin/jvm/functions/Function1;Lcom/zykj/evaluation/ui/detail/f;IILandroidx/compose/runtime/Composer;I)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
