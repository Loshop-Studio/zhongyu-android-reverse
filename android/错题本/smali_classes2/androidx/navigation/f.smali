.class public final synthetic Landroidx/navigation/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lr6/a;


# instance fields
.field public final synthetic a:Landroidx/navigation/NavController$NavControllerNavigatorState;

.field public final synthetic b:Landroidx/navigation/NavBackStackEntry;

.field public final synthetic c:Z


# direct methods
.method public synthetic constructor <init>(Landroidx/navigation/NavController$NavControllerNavigatorState;Landroidx/navigation/NavBackStackEntry;Z)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/navigation/f;->a:Landroidx/navigation/NavController$NavControllerNavigatorState;

    iput-object p2, p0, Landroidx/navigation/f;->b:Landroidx/navigation/NavBackStackEntry;

    iput-boolean p3, p0, Landroidx/navigation/f;->c:Z

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 3

    .line 1
    iget-object v0, p0, Landroidx/navigation/f;->b:Landroidx/navigation/NavBackStackEntry;

    iget-boolean v1, p0, Landroidx/navigation/f;->c:Z

    iget-object v2, p0, Landroidx/navigation/f;->a:Landroidx/navigation/NavController$NavControllerNavigatorState;

    invoke-static {v2, v0, v1}, Landroidx/navigation/NavController$NavControllerNavigatorState;->b(Landroidx/navigation/NavController$NavControllerNavigatorState;Landroidx/navigation/NavBackStackEntry;Z)Ld6/s;

    move-result-object v0

    return-object v0
.end method
