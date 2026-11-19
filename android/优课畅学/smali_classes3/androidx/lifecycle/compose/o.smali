.class public final synthetic Landroidx/lifecycle/compose/o;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lx7/p;


# instance fields
.field public final synthetic a:Ljava/lang/Object;

.field public final synthetic b:Ljava/lang/Object;

.field public final synthetic c:Landroidx/lifecycle/LifecycleOwner;

.field public final synthetic d:Lx7/l;

.field public final synthetic e:I

.field public final synthetic f:I


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Landroidx/lifecycle/LifecycleOwner;Lx7/l;II)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/lifecycle/compose/o;->a:Ljava/lang/Object;

    iput-object p2, p0, Landroidx/lifecycle/compose/o;->b:Ljava/lang/Object;

    iput-object p3, p0, Landroidx/lifecycle/compose/o;->c:Landroidx/lifecycle/LifecycleOwner;

    iput-object p4, p0, Landroidx/lifecycle/compose/o;->d:Lx7/l;

    iput p5, p0, Landroidx/lifecycle/compose/o;->e:I

    iput p6, p0, Landroidx/lifecycle/compose/o;->f:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    .line 1
    iget-object v0, p0, Landroidx/lifecycle/compose/o;->a:Ljava/lang/Object;

    iget-object v1, p0, Landroidx/lifecycle/compose/o;->b:Ljava/lang/Object;

    iget-object v2, p0, Landroidx/lifecycle/compose/o;->c:Landroidx/lifecycle/LifecycleOwner;

    iget-object v3, p0, Landroidx/lifecycle/compose/o;->d:Lx7/l;

    iget v4, p0, Landroidx/lifecycle/compose/o;->e:I

    iget v5, p0, Landroidx/lifecycle/compose/o;->f:I

    move-object v6, p1

    check-cast v6, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v7

    invoke-static/range {v0 .. v7}, Landroidx/lifecycle/compose/LifecycleEffectKt;->b(Ljava/lang/Object;Ljava/lang/Object;Landroidx/lifecycle/LifecycleOwner;Lx7/l;IILandroidx/compose/runtime/Composer;I)Lh7/p;

    move-result-object p1

    return-object p1
.end method
