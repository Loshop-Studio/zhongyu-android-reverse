.class public final synthetic Landroidx/navigation/compose/p;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lr6/c;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/Object;

.field public final synthetic c:Ljava/lang/Object;

.field public final synthetic d:Ljava/lang/Object;

.field public final synthetic e:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V
    .locals 0

    .line 1
    iput p5, p0, Landroidx/navigation/compose/p;->a:I

    iput-object p1, p0, Landroidx/navigation/compose/p;->b:Ljava/lang/Object;

    iput-object p2, p0, Landroidx/navigation/compose/p;->c:Ljava/lang/Object;

    iput-object p3, p0, Landroidx/navigation/compose/p;->d:Ljava/lang/Object;

    iput-object p4, p0, Landroidx/navigation/compose/p;->e:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    .line 1
    iget v0, p0, Landroidx/navigation/compose/p;->a:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Landroidx/navigation/compose/p;->b:Ljava/lang/Object;

    check-cast v0, Lkotlin/jvm/internal/Ref$BooleanRef;

    iget-object v1, p0, Landroidx/navigation/compose/p;->c:Ljava/lang/Object;

    check-cast v1, Landroidx/navigation/internal/NavControllerImpl;

    iget-object v2, p0, Landroidx/navigation/compose/p;->d:Ljava/lang/Object;

    check-cast v2, Landroidx/navigation/NavDestination;

    iget-object v3, p0, Landroidx/navigation/compose/p;->e:Ljava/lang/Object;

    check-cast v3, Landroid/os/Bundle;

    check-cast p1, Landroidx/navigation/NavBackStackEntry;

    invoke-static {v0, v1, v2, v3, p1}, Landroidx/navigation/internal/NavControllerImpl;->b(Lkotlin/jvm/internal/Ref$BooleanRef;Landroidx/navigation/internal/NavControllerImpl;Landroidx/navigation/NavDestination;Landroid/os/Bundle;Landroidx/navigation/NavBackStackEntry;)Ld6/s;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget-object v0, p0, Landroidx/navigation/compose/p;->b:Ljava/lang/Object;

    check-cast v0, Landroidx/navigation/compose/ComposeNavigator;

    iget-object v1, p0, Landroidx/navigation/compose/p;->c:Ljava/lang/Object;

    check-cast v1, Lr6/c;

    iget-object v2, p0, Landroidx/navigation/compose/p;->d:Ljava/lang/Object;

    check-cast v2, Lr6/c;

    iget-object v3, p0, Landroidx/navigation/compose/p;->e:Ljava/lang/Object;

    check-cast v3, Landroidx/compose/runtime/MutableState;

    check-cast p1, Landroidx/compose/animation/AnimatedContentTransitionScope;

    invoke-static {v0, v1, v2, v3, p1}, Landroidx/navigation/compose/NavHostKt;->b(Landroidx/navigation/compose/ComposeNavigator;Lr6/c;Lr6/c;Landroidx/compose/runtime/MutableState;Landroidx/compose/animation/AnimatedContentTransitionScope;)Landroidx/compose/animation/ExitTransition;

    move-result-object p1

    return-object p1

    :pswitch_1
    iget-object v0, p0, Landroidx/navigation/compose/p;->b:Ljava/lang/Object;

    check-cast v0, Landroidx/navigation/compose/ComposeNavigator;

    iget-object v1, p0, Landroidx/navigation/compose/p;->c:Ljava/lang/Object;

    check-cast v1, Lr6/c;

    iget-object v2, p0, Landroidx/navigation/compose/p;->d:Ljava/lang/Object;

    check-cast v2, Lr6/c;

    iget-object v3, p0, Landroidx/navigation/compose/p;->e:Ljava/lang/Object;

    check-cast v3, Landroidx/compose/runtime/MutableState;

    check-cast p1, Landroidx/compose/animation/AnimatedContentTransitionScope;

    invoke-static {v0, v1, v2, v3, p1}, Landroidx/navigation/compose/NavHostKt;->C(Landroidx/navigation/compose/ComposeNavigator;Lr6/c;Lr6/c;Landroidx/compose/runtime/MutableState;Landroidx/compose/animation/AnimatedContentTransitionScope;)Landroidx/compose/animation/EnterTransition;

    move-result-object p1

    return-object p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
