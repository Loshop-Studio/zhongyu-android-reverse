.class public final synthetic Landroidx/paging/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lhd/l;


# instance fields
.field public final synthetic c:Landroidx/paging/LoadType;


# direct methods
.method public synthetic constructor <init>(Landroidx/paging/LoadType;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/paging/a;->c:Landroidx/paging/LoadType;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/paging/a;->c:Landroidx/paging/LoadType;

    check-cast p1, Landroidx/paging/AccessorState$PendingRequest;

    invoke-static {v0, p1}, Landroidx/paging/AccessorState;->a(Landroidx/paging/LoadType;Landroidx/paging/AccessorState$PendingRequest;)Z

    move-result p1

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1
.end method
