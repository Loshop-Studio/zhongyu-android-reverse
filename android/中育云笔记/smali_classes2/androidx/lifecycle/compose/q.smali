.class public final synthetic Landroidx/lifecycle/compose/q;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lhd/p;


# instance fields
.field public final synthetic c:Ljava/lang/Object;

.field public final synthetic d:Ljava/lang/Object;

.field public final synthetic e:Ljava/lang/Object;

.field public final synthetic f:Landroidx/lifecycle/LifecycleOwner;

.field public final synthetic g:Lhd/l;

.field public final synthetic h:I

.field public final synthetic i:I


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Landroidx/lifecycle/LifecycleOwner;Lhd/l;II)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/lifecycle/compose/q;->c:Ljava/lang/Object;

    iput-object p2, p0, Landroidx/lifecycle/compose/q;->d:Ljava/lang/Object;

    iput-object p3, p0, Landroidx/lifecycle/compose/q;->e:Ljava/lang/Object;

    iput-object p4, p0, Landroidx/lifecycle/compose/q;->f:Landroidx/lifecycle/LifecycleOwner;

    iput-object p5, p0, Landroidx/lifecycle/compose/q;->g:Lhd/l;

    iput p6, p0, Landroidx/lifecycle/compose/q;->h:I

    iput p7, p0, Landroidx/lifecycle/compose/q;->i:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    .line 1
    iget-object v0, p0, Landroidx/lifecycle/compose/q;->c:Ljava/lang/Object;

    iget-object v1, p0, Landroidx/lifecycle/compose/q;->d:Ljava/lang/Object;

    iget-object v2, p0, Landroidx/lifecycle/compose/q;->e:Ljava/lang/Object;

    iget-object v3, p0, Landroidx/lifecycle/compose/q;->f:Landroidx/lifecycle/LifecycleOwner;

    iget-object v4, p0, Landroidx/lifecycle/compose/q;->g:Lhd/l;

    iget v5, p0, Landroidx/lifecycle/compose/q;->h:I

    iget v6, p0, Landroidx/lifecycle/compose/q;->i:I

    move-object v7, p1

    check-cast v7, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v8

    invoke-static/range {v0 .. v8}, Landroidx/lifecycle/compose/LifecycleEffectKt;->l(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Landroidx/lifecycle/LifecycleOwner;Lhd/l;IILandroidx/compose/runtime/Composer;I)Lqc/q;

    move-result-object p1

    return-object p1
.end method
