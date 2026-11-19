.class public final synthetic Lcoil3/compose/k;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lr6/c;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Landroidx/compose/ui/layout/Placeable;


# direct methods
.method public synthetic constructor <init>(Landroidx/compose/ui/layout/Placeable;I)V
    .locals 0

    .line 1
    iput p2, p0, Lcoil3/compose/k;->a:I

    iput-object p1, p0, Lcoil3/compose/k;->b:Landroidx/compose/ui/layout/Placeable;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget v1, v0, Lcoil3/compose/k;->a:I

    .line 4
    .line 5
    sget-object v2, Ld6/s;->a:Ld6/s;

    .line 6
    .line 7
    packed-switch v1, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    move-object/from16 v3, p1

    .line 11
    .line 12
    check-cast v3, Landroidx/compose/ui/layout/Placeable$PlacementScope;

    .line 13
    .line 14
    const/4 v8, 0x4

    .line 15
    const/4 v9, 0x0

    .line 16
    iget-object v4, v0, Lcoil3/compose/k;->b:Landroidx/compose/ui/layout/Placeable;

    .line 17
    .line 18
    const/4 v5, 0x0

    .line 19
    const/4 v6, 0x0

    .line 20
    const/4 v7, 0x0

    .line 21
    invoke-static/range {v3 .. v9}, Landroidx/compose/ui/layout/Placeable$PlacementScope;->placeRelative$default(Landroidx/compose/ui/layout/Placeable$PlacementScope;Landroidx/compose/ui/layout/Placeable;IIFILjava/lang/Object;)V

    .line 22
    .line 23
    .line 24
    return-object v2

    .line 25
    :pswitch_0
    move-object/from16 v10, p1

    .line 26
    .line 27
    check-cast v10, Landroidx/compose/ui/layout/Placeable$PlacementScope;

    .line 28
    .line 29
    sget v1, Lcoil3/compose/ConstraintsSizeResolver;->c:I

    .line 30
    .line 31
    const/4 v15, 0x4

    .line 32
    const/16 v16, 0x0

    .line 33
    .line 34
    iget-object v11, v0, Lcoil3/compose/k;->b:Landroidx/compose/ui/layout/Placeable;

    .line 35
    .line 36
    const/4 v12, 0x0

    .line 37
    const/4 v13, 0x0

    .line 38
    const/4 v14, 0x0

    .line 39
    invoke-static/range {v10 .. v16}, Landroidx/compose/ui/layout/Placeable$PlacementScope;->place$default(Landroidx/compose/ui/layout/Placeable$PlacementScope;Landroidx/compose/ui/layout/Placeable;IIFILjava/lang/Object;)V

    .line 40
    .line 41
    .line 42
    return-object v2

    .line 43
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
