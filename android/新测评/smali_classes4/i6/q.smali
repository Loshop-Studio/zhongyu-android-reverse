.class public final synthetic Li6/q;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:Ljava/util/List;

.field public final synthetic b:Ljava/util/List;

.field public final synthetic c:Lkotlin/jvm/functions/Function2;

.field public final synthetic d:I


# direct methods
.method public synthetic constructor <init>(Ljava/util/List;Ljava/util/List;Lkotlin/jvm/functions/Function2;I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Li6/q;->a:Ljava/util/List;

    iput-object p2, p0, Li6/q;->b:Ljava/util/List;

    iput-object p3, p0, Li6/q;->c:Lkotlin/jvm/functions/Function2;

    iput p4, p0, Li6/q;->d:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    .line 1
    iget-object v0, p0, Li6/q;->a:Ljava/util/List;

    iget-object v1, p0, Li6/q;->b:Ljava/util/List;

    iget-object v2, p0, Li6/q;->c:Lkotlin/jvm/functions/Function2;

    iget v3, p0, Li6/q;->d:I

    move-object v4, p1

    check-cast v4, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v5

    invoke-static/range {v0 .. v5}, Li6/k0;->d(Ljava/util/List;Ljava/util/List;Lkotlin/jvm/functions/Function2;ILandroidx/compose/runtime/Composer;I)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
