.class public final synthetic Landroidx/navigation/compose/r0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lhd/p;


# instance fields
.field public final synthetic c:Lsd/i0;

.field public final synthetic d:Landroidx/compose/animation/core/SeekableTransitionState;

.field public final synthetic e:Landroidx/navigation/NavBackStackEntry;


# direct methods
.method public synthetic constructor <init>(Lsd/i0;Landroidx/compose/animation/core/SeekableTransitionState;Landroidx/navigation/NavBackStackEntry;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/navigation/compose/r0;->c:Lsd/i0;

    iput-object p2, p0, Landroidx/navigation/compose/r0;->d:Landroidx/compose/animation/core/SeekableTransitionState;

    iput-object p3, p0, Landroidx/navigation/compose/r0;->e:Landroidx/navigation/NavBackStackEntry;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    .line 1
    iget-object v0, p0, Landroidx/navigation/compose/r0;->c:Lsd/i0;

    iget-object v1, p0, Landroidx/navigation/compose/r0;->d:Landroidx/compose/animation/core/SeekableTransitionState;

    iget-object v2, p0, Landroidx/navigation/compose/r0;->e:Landroidx/navigation/NavBackStackEntry;

    check-cast p1, Ljava/lang/Float;

    invoke-virtual {p1}, Ljava/lang/Float;->floatValue()F

    move-result p1

    check-cast p2, Ljava/lang/Float;

    invoke-virtual {p2}, Ljava/lang/Float;->floatValue()F

    move-result p2

    invoke-static {v0, v1, v2, p1, p2}, Landroidx/navigation/compose/NavHostKt$NavHost$29$1;->g(Lsd/i0;Landroidx/compose/animation/core/SeekableTransitionState;Landroidx/navigation/NavBackStackEntry;FF)Lqc/q;

    move-result-object p1

    return-object p1
.end method
