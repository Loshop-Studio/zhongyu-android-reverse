.class public final synthetic Lg6/x0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# instance fields
.field public final synthetic a:Z

.field public final synthetic b:Ljava/util/List;

.field public final synthetic c:Lkotlin/jvm/functions/Function3;

.field public final synthetic d:Lkotlin/jvm/functions/Function2;

.field public final synthetic e:Lkotlin/jvm/functions/Function2;


# direct methods
.method public synthetic constructor <init>(ZLjava/util/List;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, Lg6/x0;->a:Z

    iput-object p2, p0, Lg6/x0;->b:Ljava/util/List;

    iput-object p3, p0, Lg6/x0;->c:Lkotlin/jvm/functions/Function3;

    iput-object p4, p0, Lg6/x0;->d:Lkotlin/jvm/functions/Function2;

    iput-object p5, p0, Lg6/x0;->e:Lkotlin/jvm/functions/Function2;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    .line 1
    iget-boolean v0, p0, Lg6/x0;->a:Z

    iget-object v1, p0, Lg6/x0;->b:Ljava/util/List;

    iget-object v2, p0, Lg6/x0;->c:Lkotlin/jvm/functions/Function3;

    iget-object v3, p0, Lg6/x0;->d:Lkotlin/jvm/functions/Function2;

    iget-object v4, p0, Lg6/x0;->e:Lkotlin/jvm/functions/Function2;

    move-object v5, p1

    check-cast v5, Landroidx/compose/foundation/layout/ColumnScope;

    move-object v6, p2

    check-cast v6, Landroidx/compose/runtime/Composer;

    check-cast p3, Ljava/lang/Integer;

    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    move-result v7

    invoke-static/range {v0 .. v7}, Lg6/z0;->C(ZLjava/util/List;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/foundation/layout/ColumnScope;Landroidx/compose/runtime/Composer;I)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
