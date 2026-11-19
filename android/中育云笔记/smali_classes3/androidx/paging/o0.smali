.class public final synthetic Landroidx/paging/o0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lhd/p;


# instance fields
.field public final synthetic c:Landroidx/paging/LoadStateAdapter;


# direct methods
.method public synthetic constructor <init>(Landroidx/paging/LoadStateAdapter;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/paging/o0;->c:Landroidx/paging/LoadStateAdapter;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/paging/o0;->c:Landroidx/paging/LoadStateAdapter;

    check-cast p1, Landroidx/paging/LoadType;

    check-cast p2, Landroidx/paging/LoadState;

    invoke-static {v0, p1, p2}, Landroidx/paging/PagedListAdapter;->c(Landroidx/paging/LoadStateAdapter;Landroidx/paging/LoadType;Landroidx/paging/LoadState;)Lqc/q;

    move-result-object p1

    return-object p1
.end method
