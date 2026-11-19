.class public final synthetic Landroidx/navigation/internal/s;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lhd/l;


# instance fields
.field public final synthetic c:Landroidx/navigation/NavDeepLink;


# direct methods
.method public synthetic constructor <init>(Landroidx/navigation/NavDeepLink;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/navigation/internal/s;->c:Landroidx/navigation/NavDeepLink;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/navigation/internal/s;->c:Landroidx/navigation/NavDeepLink;

    check-cast p1, Ljava/lang/String;

    invoke-static {v0, p1}, Landroidx/navigation/internal/NavDestinationImpl;->d(Landroidx/navigation/NavDeepLink;Ljava/lang/String;)Z

    move-result p1

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1
.end method
