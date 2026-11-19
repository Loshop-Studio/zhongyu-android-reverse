.class public final synthetic Lo5/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/io/Closeable;


# direct methods
.method public synthetic constructor <init>(Ljava/io/Closeable;I)V
    .locals 0

    .line 1
    iput p2, p0, Lo5/a;->a:I

    iput-object p1, p0, Lo5/a;->b:Ljava/io/Closeable;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 10

    .line 1
    iget v0, p0, Lo5/a;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lo5/a;->b:Ljava/io/Closeable;

    .line 7
    .line 8
    check-cast v0, Landroid/content/res/AssetFileDescriptor;

    .line 9
    .line 10
    return-object v0

    .line 11
    :pswitch_0
    iget-object v0, p0, Lo5/a;->b:Ljava/io/Closeable;

    .line 12
    .line 13
    move-object v1, v0

    .line 14
    check-cast v1, Lio/objectbox/query/Query;

    .line 15
    .line 16
    iget-wide v2, v1, Lio/objectbox/query/Query;->d:J

    .line 17
    .line 18
    iget-object v0, v1, Lio/objectbox/query/Query;->a:Lio/objectbox/a;

    .line 19
    .line 20
    invoke-virtual {v0}, Lio/objectbox/a;->b()Lio/objectbox/Cursor;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    invoke-virtual {v0}, Lio/objectbox/Cursor;->internalHandle()J

    .line 25
    .line 26
    .line 27
    move-result-wide v4

    .line 28
    const-wide/16 v6, 0x0

    .line 29
    .line 30
    const-wide/16 v8, 0x0

    .line 31
    .line 32
    invoke-virtual/range {v1 .. v9}, Lio/objectbox/query/Query;->nativeFind(JJJJ)Ljava/util/List;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    return-object v0

    .line 37
    :pswitch_1
    iget-object v0, p0, Lo5/a;->b:Ljava/io/Closeable;

    .line 38
    .line 39
    check-cast v0, Lio/objectbox/query/Query;

    .line 40
    .line 41
    iget-wide v1, v0, Lio/objectbox/query/Query;->d:J

    .line 42
    .line 43
    iget-object v3, v0, Lio/objectbox/query/Query;->a:Lio/objectbox/a;

    .line 44
    .line 45
    invoke-virtual {v3}, Lio/objectbox/a;->b()Lio/objectbox/Cursor;

    .line 46
    .line 47
    .line 48
    move-result-object v3

    .line 49
    invoke-virtual {v3}, Lio/objectbox/Cursor;->internalHandle()J

    .line 50
    .line 51
    .line 52
    move-result-wide v3

    .line 53
    invoke-virtual {v0, v1, v2, v3, v4}, Lio/objectbox/query/Query;->nativeFindUnique(JJ)Ljava/lang/Object;

    .line 54
    .line 55
    .line 56
    move-result-object v0

    .line 57
    return-object v0

    .line 58
    nop

    .line 59
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
