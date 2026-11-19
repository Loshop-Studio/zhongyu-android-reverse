.class public final synthetic Landroidx/paging/o;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lhd/a;


# instance fields
.field public final synthetic c:Lsd/e0;

.field public final synthetic d:Landroidx/paging/DataSource$Factory;


# direct methods
.method public synthetic constructor <init>(Lsd/e0;Landroidx/paging/DataSource$Factory;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/paging/o;->c:Lsd/e0;

    iput-object p2, p0, Landroidx/paging/o;->d:Landroidx/paging/DataSource$Factory;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/paging/o;->c:Lsd/e0;

    iget-object v1, p0, Landroidx/paging/o;->d:Landroidx/paging/DataSource$Factory;

    invoke-static {v0, v1}, Landroidx/paging/DataSource$Factory;->c(Lsd/e0;Landroidx/paging/DataSource$Factory;)Landroidx/paging/PagingSource;

    move-result-object v0

    return-object v0
.end method
