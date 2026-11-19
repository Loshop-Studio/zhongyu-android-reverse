.class public final synthetic Landroidx/navigation/compose/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:Ljava/util/List;

.field public final synthetic b:Ljava/util/Collection;

.field public final synthetic c:I


# direct methods
.method public synthetic constructor <init>(Ljava/util/List;Ljava/util/Collection;I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/navigation/compose/b;->a:Ljava/util/List;

    iput-object p2, p0, Landroidx/navigation/compose/b;->b:Ljava/util/Collection;

    iput p3, p0, Landroidx/navigation/compose/b;->c:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    .line 1
    iget-object v0, p0, Landroidx/navigation/compose/b;->a:Ljava/util/List;

    iget-object v1, p0, Landroidx/navigation/compose/b;->b:Ljava/util/Collection;

    iget v2, p0, Landroidx/navigation/compose/b;->c:I

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-static {v0, v1, v2, p1, p2}, Landroidx/navigation/compose/DialogHostKt;->e(Ljava/util/List;Ljava/util/Collection;ILandroidx/compose/runtime/Composer;I)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
