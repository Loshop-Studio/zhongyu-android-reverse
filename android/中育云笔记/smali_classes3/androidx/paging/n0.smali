.class public final synthetic Landroidx/paging/n0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lhd/p;


# instance fields
.field public final synthetic c:Landroidx/paging/PagedListAdapter;


# direct methods
.method public synthetic constructor <init>(Landroidx/paging/PagedListAdapter;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/paging/n0;->c:Landroidx/paging/PagedListAdapter;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/paging/n0;->c:Landroidx/paging/PagedListAdapter;

    check-cast p1, Landroidx/paging/PagedList;

    check-cast p2, Landroidx/paging/PagedList;

    invoke-static {v0, p1, p2}, Landroidx/paging/PagedListAdapter;->d(Landroidx/paging/PagedListAdapter;Landroidx/paging/PagedList;Landroidx/paging/PagedList;)Lqc/q;

    move-result-object p1

    return-object p1
.end method
