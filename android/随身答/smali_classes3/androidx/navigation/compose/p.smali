.class public final synthetic Landroidx/navigation/compose/p;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:Landroidx/collection/MutableObjectFloatMap;

.field public final synthetic b:Landroidx/navigation/compose/ComposeNavigator;

.field public final synthetic c:Lkotlin/jvm/functions/Function1;

.field public final synthetic d:Lkotlin/jvm/functions/Function1;

.field public final synthetic e:Lkotlin/jvm/functions/Function1;

.field public final synthetic f:Landroidx/compose/runtime/State;

.field public final synthetic g:Landroidx/compose/runtime/MutableState;


# direct methods
.method public synthetic constructor <init>(Landroidx/collection/MutableObjectFloatMap;Landroidx/navigation/compose/ComposeNavigator;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/State;Landroidx/compose/runtime/MutableState;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/navigation/compose/p;->a:Landroidx/collection/MutableObjectFloatMap;

    iput-object p2, p0, Landroidx/navigation/compose/p;->b:Landroidx/navigation/compose/ComposeNavigator;

    iput-object p3, p0, Landroidx/navigation/compose/p;->c:Lkotlin/jvm/functions/Function1;

    iput-object p4, p0, Landroidx/navigation/compose/p;->d:Lkotlin/jvm/functions/Function1;

    iput-object p5, p0, Landroidx/navigation/compose/p;->e:Lkotlin/jvm/functions/Function1;

    iput-object p6, p0, Landroidx/navigation/compose/p;->f:Landroidx/compose/runtime/State;

    iput-object p7, p0, Landroidx/navigation/compose/p;->g:Landroidx/compose/runtime/MutableState;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    .line 1
    iget-object v0, p0, Landroidx/navigation/compose/p;->a:Landroidx/collection/MutableObjectFloatMap;

    iget-object v1, p0, Landroidx/navigation/compose/p;->b:Landroidx/navigation/compose/ComposeNavigator;

    iget-object v2, p0, Landroidx/navigation/compose/p;->c:Lkotlin/jvm/functions/Function1;

    iget-object v3, p0, Landroidx/navigation/compose/p;->d:Lkotlin/jvm/functions/Function1;

    iget-object v4, p0, Landroidx/navigation/compose/p;->e:Lkotlin/jvm/functions/Function1;

    iget-object v5, p0, Landroidx/navigation/compose/p;->f:Landroidx/compose/runtime/State;

    iget-object v6, p0, Landroidx/navigation/compose/p;->g:Landroidx/compose/runtime/MutableState;

    move-object v7, p1

    check-cast v7, Landroidx/compose/animation/AnimatedContentTransitionScope;

    invoke-static/range {v0 .. v7}, Landroidx/navigation/compose/NavHostKt;->d(Landroidx/collection/MutableObjectFloatMap;Landroidx/navigation/compose/ComposeNavigator;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/State;Landroidx/compose/runtime/MutableState;Landroidx/compose/animation/AnimatedContentTransitionScope;)Landroidx/compose/animation/ContentTransform;

    move-result-object p1

    return-object p1
.end method
