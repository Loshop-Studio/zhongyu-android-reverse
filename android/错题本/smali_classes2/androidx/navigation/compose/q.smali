.class public final synthetic Landroidx/navigation/compose/q;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lr6/e;


# instance fields
.field public final synthetic a:Lkotlinx/coroutines/v;

.field public final synthetic b:Landroidx/compose/animation/core/SeekableTransitionState;

.field public final synthetic c:Landroidx/navigation/NavBackStackEntry;


# direct methods
.method public synthetic constructor <init>(Lkotlinx/coroutines/v;Landroidx/compose/animation/core/SeekableTransitionState;Landroidx/navigation/NavBackStackEntry;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/navigation/compose/q;->a:Lkotlinx/coroutines/v;

    iput-object p2, p0, Landroidx/navigation/compose/q;->b:Landroidx/compose/animation/core/SeekableTransitionState;

    iput-object p3, p0, Landroidx/navigation/compose/q;->c:Landroidx/navigation/NavBackStackEntry;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    .line 1
    check-cast p1, Ljava/lang/Float;

    invoke-virtual {p1}, Ljava/lang/Float;->floatValue()F

    move-result p1

    check-cast p2, Ljava/lang/Float;

    invoke-virtual {p2}, Ljava/lang/Float;->floatValue()F

    move-result p2

    iget-object v0, p0, Landroidx/navigation/compose/q;->a:Lkotlinx/coroutines/v;

    iget-object v1, p0, Landroidx/navigation/compose/q;->b:Landroidx/compose/animation/core/SeekableTransitionState;

    iget-object v2, p0, Landroidx/navigation/compose/q;->c:Landroidx/navigation/NavBackStackEntry;

    invoke-static {v0, v1, v2, p1, p2}, Landroidx/navigation/compose/NavHostKt$NavHost$29$1;->e(Lkotlinx/coroutines/v;Landroidx/compose/animation/core/SeekableTransitionState;Landroidx/navigation/NavBackStackEntry;FF)Ld6/s;

    move-result-object p1

    return-object p1
.end method
