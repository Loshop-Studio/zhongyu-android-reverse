.class public final synthetic Landroidx/navigation/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lx7/l;


# instance fields
.field public final synthetic a:Landroidx/navigation/NavDestination;

.field public final synthetic b:Landroidx/navigation/NavController;


# direct methods
.method public synthetic constructor <init>(Landroidx/navigation/NavDestination;Landroidx/navigation/NavController;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/navigation/h;->a:Landroidx/navigation/NavDestination;

    iput-object p2, p0, Landroidx/navigation/h;->b:Landroidx/navigation/NavController;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/navigation/h;->a:Landroidx/navigation/NavDestination;

    iget-object v1, p0, Landroidx/navigation/h;->b:Landroidx/navigation/NavController;

    check-cast p1, Landroidx/navigation/NavOptionsBuilder;

    invoke-static {v0, v1, p1}, Landroidx/navigation/NavController;->c(Landroidx/navigation/NavDestination;Landroidx/navigation/NavController;Landroidx/navigation/NavOptionsBuilder;)Lh7/p;

    move-result-object p1

    return-object p1
.end method
