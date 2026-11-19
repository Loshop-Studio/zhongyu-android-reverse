.class public final synthetic Lg6/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# instance fields
.field public final synthetic a:Z

.field public final synthetic b:Ljava/lang/String;

.field public final synthetic c:Lkotlin/jvm/functions/Function0;

.field public final synthetic d:Lcom/zykj/evaluation/ui/detail/f;

.field public final synthetic e:Lcom/zykj/evaluation/ui/detail/e;

.field public final synthetic f:Lkotlin/jvm/functions/Function1;


# direct methods
.method public synthetic constructor <init>(ZLjava/lang/String;Lkotlin/jvm/functions/Function0;Lcom/zykj/evaluation/ui/detail/f;Lcom/zykj/evaluation/ui/detail/e;Lkotlin/jvm/functions/Function1;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, Lg6/a;->a:Z

    iput-object p2, p0, Lg6/a;->b:Ljava/lang/String;

    iput-object p3, p0, Lg6/a;->c:Lkotlin/jvm/functions/Function0;

    iput-object p4, p0, Lg6/a;->d:Lcom/zykj/evaluation/ui/detail/f;

    iput-object p5, p0, Lg6/a;->e:Lcom/zykj/evaluation/ui/detail/e;

    iput-object p6, p0, Lg6/a;->f:Lkotlin/jvm/functions/Function1;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    .line 1
    iget-boolean v0, p0, Lg6/a;->a:Z

    iget-object v1, p0, Lg6/a;->b:Ljava/lang/String;

    iget-object v2, p0, Lg6/a;->c:Lkotlin/jvm/functions/Function0;

    iget-object v3, p0, Lg6/a;->d:Lcom/zykj/evaluation/ui/detail/f;

    iget-object v4, p0, Lg6/a;->e:Lcom/zykj/evaluation/ui/detail/e;

    iget-object v5, p0, Lg6/a;->f:Lkotlin/jvm/functions/Function1;

    move-object v6, p1

    check-cast v6, Landroidx/compose/foundation/layout/RowScope;

    move-object v7, p2

    check-cast v7, Landroidx/compose/runtime/Composer;

    check-cast p3, Ljava/lang/Integer;

    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    move-result v8

    invoke-static/range {v0 .. v8}, Lg6/f;->a(ZLjava/lang/String;Lkotlin/jvm/functions/Function0;Lcom/zykj/evaluation/ui/detail/f;Lcom/zykj/evaluation/ui/detail/e;Lkotlin/jvm/functions/Function1;Landroidx/compose/foundation/layout/RowScope;Landroidx/compose/runtime/Composer;I)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
