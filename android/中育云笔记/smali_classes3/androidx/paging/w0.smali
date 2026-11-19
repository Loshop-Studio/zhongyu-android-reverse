.class public final synthetic Landroidx/paging/w0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lhd/l;


# instance fields
.field public final synthetic c:Landroidx/paging/LoadStateAdapter;

.field public final synthetic d:Landroidx/paging/LoadStateAdapter;


# direct methods
.method public synthetic constructor <init>(Landroidx/paging/LoadStateAdapter;Landroidx/paging/LoadStateAdapter;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/paging/w0;->c:Landroidx/paging/LoadStateAdapter;

    iput-object p2, p0, Landroidx/paging/w0;->d:Landroidx/paging/LoadStateAdapter;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/paging/w0;->c:Landroidx/paging/LoadStateAdapter;

    iget-object v1, p0, Landroidx/paging/w0;->d:Landroidx/paging/LoadStateAdapter;

    check-cast p1, Landroidx/paging/CombinedLoadStates;

    invoke-static {v0, v1, p1}, Landroidx/paging/PagingDataAdapter;->a(Landroidx/paging/LoadStateAdapter;Landroidx/paging/LoadStateAdapter;Landroidx/paging/CombinedLoadStates;)Lqc/q;

    move-result-object p1

    return-object p1
.end method
