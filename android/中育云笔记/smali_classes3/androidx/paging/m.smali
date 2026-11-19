.class public final synthetic Landroidx/paging/m;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lhd/a;


# instance fields
.field public final synthetic c:Landroidx/paging/DataSource;


# direct methods
.method public synthetic constructor <init>(Landroidx/paging/DataSource;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/paging/m;->c:Landroidx/paging/DataSource;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/paging/m;->c:Landroidx/paging/DataSource;

    invoke-static {v0}, Landroidx/paging/DataSource;->d(Landroidx/paging/DataSource;)Z

    move-result v0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method
