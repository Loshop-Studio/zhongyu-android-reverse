.class public final synthetic Ly4/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lr6/c;


# instance fields
.field public final synthetic a:Ljava/util/List;

.field public final synthetic b:I

.field public final synthetic c:I


# direct methods
.method public synthetic constructor <init>(Ljava/util/List;II)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ly4/b;->a:Ljava/util/List;

    iput p2, p0, Ly4/b;->b:I

    iput p3, p0, Ly4/b;->c:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    .line 1
    move-object v0, p1

    .line 2
    check-cast v0, Landroidx/compose/ui/layout/Placeable$PlacementScope;

    .line 3
    .line 4
    const-string p1, "$this$layout"

    .line 5
    .line 6
    invoke-static {v0, p1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 7
    .line 8
    .line 9
    iget-object p1, p0, Ly4/b;->a:Ljava/util/List;

    .line 10
    .line 11
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    const/4 v1, 0x0

    .line 16
    move v2, v1

    .line 17
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 18
    .line 19
    .line 20
    move-result v3

    .line 21
    if-eqz v3, :cond_2

    .line 22
    .line 23
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v3

    .line 27
    add-int/lit8 v7, v1, 0x1

    .line 28
    .line 29
    if-ltz v1, :cond_1

    .line 30
    .line 31
    check-cast v3, Landroidx/compose/ui/layout/Placeable;

    .line 32
    .line 33
    if-lez v1, :cond_0

    .line 34
    .line 35
    iget v1, p0, Ly4/b;->b:I

    .line 36
    .line 37
    add-int/2addr v2, v1

    .line 38
    :cond_0
    const/4 v1, 0x2

    .line 39
    iget v4, p0, Ly4/b;->c:I

    .line 40
    .line 41
    invoke-static {v3, v4, v1}, Landroidx/collection/a;->g(Landroidx/compose/ui/layout/Placeable;II)I

    .line 42
    .line 43
    .line 44
    move-result v1

    .line 45
    const/4 v5, 0x4

    .line 46
    const/4 v6, 0x0

    .line 47
    const/4 v4, 0x0

    .line 48
    move-object v8, v3

    .line 49
    move v3, v1

    .line 50
    move-object v1, v8

    .line 51
    invoke-static/range {v0 .. v6}, Landroidx/compose/ui/layout/Placeable$PlacementScope;->place$default(Landroidx/compose/ui/layout/Placeable$PlacementScope;Landroidx/compose/ui/layout/Placeable;IIFILjava/lang/Object;)V

    .line 52
    .line 53
    .line 54
    invoke-virtual {v1}, Landroidx/compose/ui/layout/Placeable;->getWidth()I

    .line 55
    .line 56
    .line 57
    move-result v1

    .line 58
    add-int/2addr v2, v1

    .line 59
    move v1, v7

    .line 60
    goto :goto_0

    .line 61
    :cond_1
    invoke-static {}, Lkotlin/collections/u;->L()V

    .line 62
    .line 63
    .line 64
    const/4 p1, 0x0

    .line 65
    throw p1

    .line 66
    :cond_2
    sget-object p1, Ld6/s;->a:Ld6/s;

    .line 67
    .line 68
    return-object p1
.end method
