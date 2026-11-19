.class public final synthetic Landroidx/paging/q0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lhd/p;


# instance fields
.field public final synthetic c:Landroidx/paging/LoadStateAdapter;

.field public final synthetic d:Landroidx/paging/LoadStateAdapter;


# direct methods
.method public synthetic constructor <init>(Landroidx/paging/LoadStateAdapter;Landroidx/paging/LoadStateAdapter;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/paging/q0;->c:Landroidx/paging/LoadStateAdapter;

    iput-object p2, p0, Landroidx/paging/q0;->d:Landroidx/paging/LoadStateAdapter;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/paging/q0;->c:Landroidx/paging/LoadStateAdapter;

    iget-object v1, p0, Landroidx/paging/q0;->d:Landroidx/paging/LoadStateAdapter;

    check-cast p1, Landroidx/paging/LoadType;

    check-cast p2, Landroidx/paging/LoadState;

    invoke-static {v0, v1, p1, p2}, Landroidx/paging/PagedListAdapter;->a(Landroidx/paging/LoadStateAdapter;Landroidx/paging/LoadStateAdapter;Landroidx/paging/LoadType;Landroidx/paging/LoadState;)Lqc/q;

    move-result-object p1

    return-object p1
.end method
