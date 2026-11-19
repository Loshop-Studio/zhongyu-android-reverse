.class public final synthetic Landroidx/paging/b0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lhd/a;


# instance fields
.field public final synthetic c:Landroidx/paging/MulticastedPagingData;


# direct methods
.method public synthetic constructor <init>(Landroidx/paging/MulticastedPagingData;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/paging/b0;->c:Landroidx/paging/MulticastedPagingData;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/paging/b0;->c:Landroidx/paging/MulticastedPagingData;

    invoke-static {v0}, Landroidx/paging/MulticastedPagingData;->a(Landroidx/paging/MulticastedPagingData;)Landroidx/paging/PageEvent$Insert;

    move-result-object v0

    return-object v0
.end method
