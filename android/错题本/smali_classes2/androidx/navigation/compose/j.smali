.class public final synthetic Landroidx/navigation/compose/j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lr6/c;


# instance fields
.field public final synthetic a:Landroidx/collection/MutableObjectFloatMap;

.field public final synthetic b:Landroidx/navigation/compose/ComposeNavigator;

.field public final synthetic c:Lr6/c;

.field public final synthetic d:Lr6/c;

.field public final synthetic e:Lr6/c;

.field public final synthetic f:Landroidx/compose/runtime/State;

.field public final synthetic g:Landroidx/compose/runtime/MutableState;


# direct methods
.method public synthetic constructor <init>(Landroidx/collection/MutableObjectFloatMap;Landroidx/navigation/compose/ComposeNavigator;Lr6/c;Lr6/c;Lr6/c;Landroidx/compose/runtime/State;Landroidx/compose/runtime/MutableState;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/navigation/compose/j;->a:Landroidx/collection/MutableObjectFloatMap;

    iput-object p2, p0, Landroidx/navigation/compose/j;->b:Landroidx/navigation/compose/ComposeNavigator;

    iput-object p3, p0, Landroidx/navigation/compose/j;->c:Lr6/c;

    iput-object p4, p0, Landroidx/navigation/compose/j;->d:Lr6/c;

    iput-object p5, p0, Landroidx/navigation/compose/j;->e:Lr6/c;

    iput-object p6, p0, Landroidx/navigation/compose/j;->f:Landroidx/compose/runtime/State;

    iput-object p7, p0, Landroidx/navigation/compose/j;->g:Landroidx/compose/runtime/MutableState;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    .line 1
    iget-object v6, p0, Landroidx/navigation/compose/j;->g:Landroidx/compose/runtime/MutableState;

    move-object v7, p1

    check-cast v7, Landroidx/compose/animation/AnimatedContentTransitionScope;

    iget-object v0, p0, Landroidx/navigation/compose/j;->a:Landroidx/collection/MutableObjectFloatMap;

    iget-object v1, p0, Landroidx/navigation/compose/j;->b:Landroidx/navigation/compose/ComposeNavigator;

    iget-object v2, p0, Landroidx/navigation/compose/j;->c:Lr6/c;

    iget-object v3, p0, Landroidx/navigation/compose/j;->d:Lr6/c;

    iget-object v4, p0, Landroidx/navigation/compose/j;->e:Lr6/c;

    iget-object v5, p0, Landroidx/navigation/compose/j;->f:Landroidx/compose/runtime/State;

    invoke-static/range {v0 .. v7}, Landroidx/navigation/compose/NavHostKt;->d(Landroidx/collection/MutableObjectFloatMap;Landroidx/navigation/compose/ComposeNavigator;Lr6/c;Lr6/c;Lr6/c;Landroidx/compose/runtime/State;Landroidx/compose/runtime/MutableState;Landroidx/compose/animation/AnimatedContentTransitionScope;)Landroidx/compose/animation/ContentTransform;

    move-result-object p1

    return-object p1
.end method
