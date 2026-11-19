.class public final synthetic Le8/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc8/a;


# instance fields
.field public final synthetic a:Lio/objectbox/query/Query;


# direct methods
.method public synthetic constructor <init>(Lio/objectbox/query/Query;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Le8/c;->a:Lio/objectbox/query/Query;

    return-void
.end method


# virtual methods
.method public final a(J)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, Le8/c;->a:Lio/objectbox/query/Query;

    invoke-static {v0, p1, p2}, Lio/objectbox/query/Query;->g(Lio/objectbox/query/Query;J)Ljava/lang/Long;

    move-result-object p1

    return-object p1
.end method
