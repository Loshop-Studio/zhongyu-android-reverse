.class public final synthetic Landroidx/lifecycle/compose/r;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lhd/p;


# instance fields
.field public final synthetic c:[Ljava/lang/Object;

.field public final synthetic d:Landroidx/lifecycle/LifecycleOwner;

.field public final synthetic e:Lhd/l;

.field public final synthetic f:I

.field public final synthetic g:I


# direct methods
.method public synthetic constructor <init>([Ljava/lang/Object;Landroidx/lifecycle/LifecycleOwner;Lhd/l;II)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/lifecycle/compose/r;->c:[Ljava/lang/Object;

    iput-object p2, p0, Landroidx/lifecycle/compose/r;->d:Landroidx/lifecycle/LifecycleOwner;

    iput-object p3, p0, Landroidx/lifecycle/compose/r;->e:Lhd/l;

    iput p4, p0, Landroidx/lifecycle/compose/r;->f:I

    iput p5, p0, Landroidx/lifecycle/compose/r;->g:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    .line 1
    iget-object v0, p0, Landroidx/lifecycle/compose/r;->c:[Ljava/lang/Object;

    iget-object v1, p0, Landroidx/lifecycle/compose/r;->d:Landroidx/lifecycle/LifecycleOwner;

    iget-object v2, p0, Landroidx/lifecycle/compose/r;->e:Lhd/l;

    iget v3, p0, Landroidx/lifecycle/compose/r;->f:I

    iget v4, p0, Landroidx/lifecycle/compose/r;->g:I

    move-object v5, p1

    check-cast v5, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v6

    invoke-static/range {v0 .. v6}, Landroidx/lifecycle/compose/LifecycleEffectKt;->h([Ljava/lang/Object;Landroidx/lifecycle/LifecycleOwner;Lhd/l;IILandroidx/compose/runtime/Composer;I)Lqc/q;

    move-result-object p1

    return-object p1
.end method
