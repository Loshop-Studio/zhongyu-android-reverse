.class public abstract Lio/objectbox/d;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static a(Lio/objectbox/a;)J
    .locals 2

    .line 1
    invoke-virtual {p0}, Lio/objectbox/a;->d()Lio/objectbox/Cursor;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0}, Lio/objectbox/Cursor;->internalHandle()J

    .line 6
    .line 7
    .line 8
    move-result-wide v0

    .line 9
    return-wide v0
.end method

.method public static b(Lio/objectbox/BoxStore;Lr6/a;)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lio/objectbox/BoxStore;->C(Lr6/a;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method
