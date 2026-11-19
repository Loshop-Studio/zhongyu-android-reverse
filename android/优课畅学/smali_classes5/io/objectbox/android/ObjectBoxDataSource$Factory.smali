.class public Lio/objectbox/android/ObjectBoxDataSource$Factory;
.super Landroidx/paging/DataSource$Factory;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/objectbox/android/ObjectBoxDataSource;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "Factory"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<Item:",
        "Ljava/lang/Object;",
        ">",
        "Landroidx/paging/DataSource$Factory<",
        "Ljava/lang/Integer;",
        "TItem;>;"
    }
.end annotation


# instance fields
.field public final a:Lio/objectbox/query/Query;


# virtual methods
.method public create()Landroidx/paging/DataSource;
    .locals 2

    .line 1
    new-instance v0, Lio/objectbox/android/ObjectBoxDataSource;

    .line 2
    .line 3
    iget-object v1, p0, Lio/objectbox/android/ObjectBoxDataSource$Factory;->a:Lio/objectbox/query/Query;

    .line 4
    .line 5
    invoke-direct {v0, v1}, Lio/objectbox/android/ObjectBoxDataSource;-><init>(Lio/objectbox/query/Query;)V

    .line 6
    .line 7
    .line 8
    return-object v0
.end method
