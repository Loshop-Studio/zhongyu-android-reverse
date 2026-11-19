.class public final synthetic Lz6/k;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# instance fields
.field public final synthetic a:Lx6/d;

.field public final synthetic b:Lkotlin/jvm/functions/Function2;

.field public final synthetic c:I


# direct methods
.method public synthetic constructor <init>(Lx6/d;Lkotlin/jvm/functions/Function2;I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lz6/k;->a:Lx6/d;

    iput-object p2, p0, Lz6/k;->b:Lkotlin/jvm/functions/Function2;

    iput p3, p0, Lz6/k;->c:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    .line 1
    iget-object v0, p0, Lz6/k;->a:Lx6/d;

    iget-object v1, p0, Lz6/k;->b:Lkotlin/jvm/functions/Function2;

    iget v2, p0, Lz6/k;->c:I

    move-object v3, p1

    check-cast v3, Landroidx/compose/foundation/layout/FlowRowScope;

    move-object v4, p2

    check-cast v4, Landroidx/compose/runtime/Composer;

    check-cast p3, Ljava/lang/Integer;

    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    move-result v5

    invoke-static/range {v0 .. v5}, Lz6/n;->h(Lx6/d;Lkotlin/jvm/functions/Function2;ILandroidx/compose/foundation/layout/FlowRowScope;Landroidx/compose/runtime/Composer;I)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
