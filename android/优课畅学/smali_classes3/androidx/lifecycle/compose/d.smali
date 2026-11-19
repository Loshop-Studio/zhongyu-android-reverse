.class public final synthetic Landroidx/lifecycle/compose/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lx7/p;


# instance fields
.field public final synthetic a:Ljava/lang/Object;

.field public final synthetic b:Landroidx/lifecycle/LifecycleOwner;

.field public final synthetic c:Lx7/l;

.field public final synthetic d:I

.field public final synthetic e:I


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;Landroidx/lifecycle/LifecycleOwner;Lx7/l;II)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/lifecycle/compose/d;->a:Ljava/lang/Object;

    iput-object p2, p0, Landroidx/lifecycle/compose/d;->b:Landroidx/lifecycle/LifecycleOwner;

    iput-object p3, p0, Landroidx/lifecycle/compose/d;->c:Lx7/l;

    iput p4, p0, Landroidx/lifecycle/compose/d;->d:I

    iput p5, p0, Landroidx/lifecycle/compose/d;->e:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    .line 1
    iget-object v0, p0, Landroidx/lifecycle/compose/d;->a:Ljava/lang/Object;

    iget-object v1, p0, Landroidx/lifecycle/compose/d;->b:Landroidx/lifecycle/LifecycleOwner;

    iget-object v2, p0, Landroidx/lifecycle/compose/d;->c:Lx7/l;

    iget v3, p0, Landroidx/lifecycle/compose/d;->d:I

    iget v4, p0, Landroidx/lifecycle/compose/d;->e:I

    move-object v5, p1

    check-cast v5, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v6

    invoke-static/range {v0 .. v6}, Landroidx/lifecycle/compose/LifecycleEffectKt;->d(Ljava/lang/Object;Landroidx/lifecycle/LifecycleOwner;Lx7/l;IILandroidx/compose/runtime/Composer;I)Lh7/p;

    move-result-object p1

    return-object p1
.end method
