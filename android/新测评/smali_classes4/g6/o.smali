.class public final synthetic Lg6/o;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:Ljava/lang/String;

.field public final synthetic b:Ljava/lang/String;

.field public final synthetic c:Ljava/lang/String;

.field public final synthetic d:Z

.field public final synthetic e:Lkotlin/jvm/functions/Function0;

.field public final synthetic f:Lcom/zykj/evaluation/ui/detail/f;

.field public final synthetic g:Lcom/zykj/evaluation/ui/detail/e;

.field public final synthetic h:Lkotlin/jvm/functions/Function1;

.field public final synthetic i:I

.field public final synthetic j:I


# direct methods
.method public synthetic constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLkotlin/jvm/functions/Function0;Lcom/zykj/evaluation/ui/detail/f;Lcom/zykj/evaluation/ui/detail/e;Lkotlin/jvm/functions/Function1;II)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lg6/o;->a:Ljava/lang/String;

    iput-object p2, p0, Lg6/o;->b:Ljava/lang/String;

    iput-object p3, p0, Lg6/o;->c:Ljava/lang/String;

    iput-boolean p4, p0, Lg6/o;->d:Z

    iput-object p5, p0, Lg6/o;->e:Lkotlin/jvm/functions/Function0;

    iput-object p6, p0, Lg6/o;->f:Lcom/zykj/evaluation/ui/detail/f;

    iput-object p7, p0, Lg6/o;->g:Lcom/zykj/evaluation/ui/detail/e;

    iput-object p8, p0, Lg6/o;->h:Lkotlin/jvm/functions/Function1;

    iput p9, p0, Lg6/o;->i:I

    iput p10, p0, Lg6/o;->j:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 12

    .line 1
    iget-object v0, p0, Lg6/o;->a:Ljava/lang/String;

    iget-object v1, p0, Lg6/o;->b:Ljava/lang/String;

    iget-object v2, p0, Lg6/o;->c:Ljava/lang/String;

    iget-boolean v3, p0, Lg6/o;->d:Z

    iget-object v4, p0, Lg6/o;->e:Lkotlin/jvm/functions/Function0;

    iget-object v5, p0, Lg6/o;->f:Lcom/zykj/evaluation/ui/detail/f;

    iget-object v6, p0, Lg6/o;->g:Lcom/zykj/evaluation/ui/detail/e;

    iget-object v7, p0, Lg6/o;->h:Lkotlin/jvm/functions/Function1;

    iget v8, p0, Lg6/o;->i:I

    iget v9, p0, Lg6/o;->j:I

    move-object v10, p1

    check-cast v10, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v11

    invoke-static/range {v0 .. v11}, Lcom/zykj/evaluation/ui/detail/widget/question/HandQuestionViewKt;->g(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLkotlin/jvm/functions/Function0;Lcom/zykj/evaluation/ui/detail/f;Lcom/zykj/evaluation/ui/detail/e;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
