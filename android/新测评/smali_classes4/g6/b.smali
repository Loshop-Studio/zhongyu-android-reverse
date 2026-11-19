.class public final synthetic Lg6/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:Ljava/lang/String;

.field public final synthetic b:Ljava/lang/String;

.field public final synthetic c:Z

.field public final synthetic d:Lkotlin/jvm/functions/Function0;

.field public final synthetic e:Lcom/zykj/evaluation/ui/detail/e;

.field public final synthetic f:Lkotlin/jvm/functions/Function1;

.field public final synthetic g:Lcom/zykj/evaluation/ui/detail/f;

.field public final synthetic h:I

.field public final synthetic i:I


# direct methods
.method public synthetic constructor <init>(Ljava/lang/String;Ljava/lang/String;ZLkotlin/jvm/functions/Function0;Lcom/zykj/evaluation/ui/detail/e;Lkotlin/jvm/functions/Function1;Lcom/zykj/evaluation/ui/detail/f;II)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lg6/b;->a:Ljava/lang/String;

    iput-object p2, p0, Lg6/b;->b:Ljava/lang/String;

    iput-boolean p3, p0, Lg6/b;->c:Z

    iput-object p4, p0, Lg6/b;->d:Lkotlin/jvm/functions/Function0;

    iput-object p5, p0, Lg6/b;->e:Lcom/zykj/evaluation/ui/detail/e;

    iput-object p6, p0, Lg6/b;->f:Lkotlin/jvm/functions/Function1;

    iput-object p7, p0, Lg6/b;->g:Lcom/zykj/evaluation/ui/detail/f;

    iput p8, p0, Lg6/b;->h:I

    iput p9, p0, Lg6/b;->i:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 11

    .line 1
    iget-object v0, p0, Lg6/b;->a:Ljava/lang/String;

    iget-object v1, p0, Lg6/b;->b:Ljava/lang/String;

    iget-boolean v2, p0, Lg6/b;->c:Z

    iget-object v3, p0, Lg6/b;->d:Lkotlin/jvm/functions/Function0;

    iget-object v4, p0, Lg6/b;->e:Lcom/zykj/evaluation/ui/detail/e;

    iget-object v5, p0, Lg6/b;->f:Lkotlin/jvm/functions/Function1;

    iget-object v6, p0, Lg6/b;->g:Lcom/zykj/evaluation/ui/detail/f;

    iget v7, p0, Lg6/b;->h:I

    iget v8, p0, Lg6/b;->i:I

    move-object v9, p1

    check-cast v9, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v10

    invoke-static/range {v0 .. v10}, Lg6/f;->e(Ljava/lang/String;Ljava/lang/String;ZLkotlin/jvm/functions/Function0;Lcom/zykj/evaluation/ui/detail/e;Lkotlin/jvm/functions/Function1;Lcom/zykj/evaluation/ui/detail/f;IILandroidx/compose/runtime/Composer;I)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
