.class public Lio/objectbox/android/ObjectBoxDataSource$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lu8/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lio/objectbox/android/ObjectBoxDataSource;-><init>(Lio/objectbox/query/Query;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lio/objectbox/android/ObjectBoxDataSource;


# direct methods
.method public constructor <init>(Lio/objectbox/android/ObjectBoxDataSource;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lio/objectbox/android/ObjectBoxDataSource$a;->a:Lio/objectbox/android/ObjectBoxDataSource;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public a(Ljava/util/List;)V
    .locals 0

    .line 1
    iget-object p1, p0, Lio/objectbox/android/ObjectBoxDataSource$a;->a:Lio/objectbox/android/ObjectBoxDataSource;

    .line 2
    .line 3
    invoke-virtual {p1}, Landroidx/paging/DataSource;->invalidate()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public bridge synthetic b(Ljava/lang/Object;)V
    .locals 0

    .line 1
    check-cast p1, Ljava/util/List;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lio/objectbox/android/ObjectBoxDataSource$a;->a(Ljava/util/List;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method
