.class public final synthetic Landroidx/navigation/compose/p0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lhd/l;


# instance fields
.field public final synthetic c:Landroidx/navigation/compose/ComposeNavigator;

.field public final synthetic d:Lhd/l;

.field public final synthetic e:Lhd/l;

.field public final synthetic f:Landroidx/compose/runtime/MutableState;


# direct methods
.method public synthetic constructor <init>(Landroidx/navigation/compose/ComposeNavigator;Lhd/l;Lhd/l;Landroidx/compose/runtime/MutableState;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/navigation/compose/p0;->c:Landroidx/navigation/compose/ComposeNavigator;

    iput-object p2, p0, Landroidx/navigation/compose/p0;->d:Lhd/l;

    iput-object p3, p0, Landroidx/navigation/compose/p0;->e:Lhd/l;

    iput-object p4, p0, Landroidx/navigation/compose/p0;->f:Landroidx/compose/runtime/MutableState;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    .line 1
    iget-object v0, p0, Landroidx/navigation/compose/p0;->c:Landroidx/navigation/compose/ComposeNavigator;

    iget-object v1, p0, Landroidx/navigation/compose/p0;->d:Lhd/l;

    iget-object v2, p0, Landroidx/navigation/compose/p0;->e:Lhd/l;

    iget-object v3, p0, Landroidx/navigation/compose/p0;->f:Landroidx/compose/runtime/MutableState;

    check-cast p1, Landroidx/compose/animation/AnimatedContentTransitionScope;

    invoke-static {v0, v1, v2, v3, p1}, Landroidx/navigation/compose/NavHostKt;->C(Landroidx/navigation/compose/ComposeNavigator;Lhd/l;Lhd/l;Landroidx/compose/runtime/MutableState;Landroidx/compose/animation/AnimatedContentTransitionScope;)Landroidx/compose/animation/EnterTransition;

    move-result-object p1

    return-object p1
.end method
