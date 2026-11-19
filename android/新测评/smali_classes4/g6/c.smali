.class public final synthetic Lg6/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# instance fields
.field public final synthetic a:Ljava/lang/String;

.field public final synthetic b:Lcom/zykj/evaluation/ui/detail/f;

.field public final synthetic c:Z

.field public final synthetic d:Lcom/zykj/evaluation/ui/detail/e;

.field public final synthetic e:Lkotlin/jvm/functions/Function1;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/String;Lcom/zykj/evaluation/ui/detail/f;ZLcom/zykj/evaluation/ui/detail/e;Lkotlin/jvm/functions/Function1;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lg6/c;->a:Ljava/lang/String;

    iput-object p2, p0, Lg6/c;->b:Lcom/zykj/evaluation/ui/detail/f;

    iput-boolean p3, p0, Lg6/c;->c:Z

    iput-object p4, p0, Lg6/c;->d:Lcom/zykj/evaluation/ui/detail/e;

    iput-object p5, p0, Lg6/c;->e:Lkotlin/jvm/functions/Function1;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    .line 1
    iget-object v0, p0, Lg6/c;->a:Ljava/lang/String;

    iget-object v1, p0, Lg6/c;->b:Lcom/zykj/evaluation/ui/detail/f;

    iget-boolean v2, p0, Lg6/c;->c:Z

    iget-object v3, p0, Lg6/c;->d:Lcom/zykj/evaluation/ui/detail/e;

    iget-object v4, p0, Lg6/c;->e:Lkotlin/jvm/functions/Function1;

    move-object v5, p1

    check-cast v5, Landroidx/compose/foundation/layout/BoxScope;

    move-object v6, p2

    check-cast v6, Landroidx/compose/runtime/Composer;

    check-cast p3, Ljava/lang/Integer;

    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    move-result v7

    invoke-static/range {v0 .. v7}, Lg6/f;->b(Ljava/lang/String;Lcom/zykj/evaluation/ui/detail/f;ZLcom/zykj/evaluation/ui/detail/e;Lkotlin/jvm/functions/Function1;Landroidx/compose/foundation/layout/BoxScope;Landroidx/compose/runtime/Composer;I)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
