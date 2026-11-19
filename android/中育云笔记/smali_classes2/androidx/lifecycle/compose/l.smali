.class public final synthetic Landroidx/lifecycle/compose/l;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lhd/p;


# instance fields
.field public final synthetic c:Ljava/lang/Object;

.field public final synthetic d:Ljava/lang/Object;

.field public final synthetic e:Landroidx/lifecycle/LifecycleOwner;

.field public final synthetic f:Lhd/l;

.field public final synthetic g:I

.field public final synthetic h:I


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Landroidx/lifecycle/LifecycleOwner;Lhd/l;II)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/lifecycle/compose/l;->c:Ljava/lang/Object;

    iput-object p2, p0, Landroidx/lifecycle/compose/l;->d:Ljava/lang/Object;

    iput-object p3, p0, Landroidx/lifecycle/compose/l;->e:Landroidx/lifecycle/LifecycleOwner;

    iput-object p4, p0, Landroidx/lifecycle/compose/l;->f:Lhd/l;

    iput p5, p0, Landroidx/lifecycle/compose/l;->g:I

    iput p6, p0, Landroidx/lifecycle/compose/l;->h:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    .line 1
    iget-object v0, p0, Landroidx/lifecycle/compose/l;->c:Ljava/lang/Object;

    iget-object v1, p0, Landroidx/lifecycle/compose/l;->d:Ljava/lang/Object;

    iget-object v2, p0, Landroidx/lifecycle/compose/l;->e:Landroidx/lifecycle/LifecycleOwner;

    iget-object v3, p0, Landroidx/lifecycle/compose/l;->f:Lhd/l;

    iget v4, p0, Landroidx/lifecycle/compose/l;->g:I

    iget v5, p0, Landroidx/lifecycle/compose/l;->h:I

    move-object v6, p1

    check-cast v6, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v7

    invoke-static/range {v0 .. v7}, Landroidx/lifecycle/compose/LifecycleEffectKt;->k(Ljava/lang/Object;Ljava/lang/Object;Landroidx/lifecycle/LifecycleOwner;Lhd/l;IILandroidx/compose/runtime/Composer;I)Lqc/q;

    move-result-object p1

    return-object p1
.end method
