.class public final Lb/b/b/a0/z/l;
.super Lb/b/b/x;
.source ""


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lb/b/b/x<",
        "Ljava/sql/Time;",
        ">;"
    }
.end annotation


# static fields
.field public static final b:Lb/b/b/y;


# instance fields
.field public final a:Ljava/text/DateFormat;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lb/b/b/a0/z/l$a;

    invoke-direct {v0}, Lb/b/b/a0/z/l$a;-><init>()V

    sput-object v0, Lb/b/b/a0/z/l;->b:Lb/b/b/y;

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Lb/b/b/x;-><init>()V

    new-instance v0, Ljava/text/SimpleDateFormat;

    const-string v1, "hh:mm:ss a"

    invoke-direct {v0, v1}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;)V

    iput-object v0, p0, Lb/b/b/a0/z/l;->a:Ljava/text/DateFormat;

    return-void
.end method


# virtual methods
.method public a(Lb/b/b/c0/a;)Ljava/lang/Object;
    .locals 3

    .line 1
    monitor-enter p0

    :try_start_0
    invoke-virtual {p1}, Lb/b/b/c0/a;->v()Lb/b/b/c0/b;

    move-result-object v0

    sget-object v1, Lb/b/b/c0/b;->j:Lb/b/b/c0/b;

    if-ne v0, v1, :cond_0

    invoke-virtual {p1}, Lb/b/b/c0/a;->r()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const/4 p1, 0x0

    monitor-exit p0

    goto :goto_0

    :cond_0
    :try_start_1
    iget-object v0, p0, Lb/b/b/a0/z/l;->a:Ljava/text/DateFormat;

    invoke-virtual {p1}, Lb/b/b/c0/a;->t()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/text/DateFormat;->parse(Ljava/lang/String;)Ljava/util/Date;

    move-result-object p1

    new-instance v0, Ljava/sql/Time;

    invoke-virtual {p1}, Ljava/util/Date;->getTime()J

    move-result-wide v1

    invoke-direct {v0, v1, v2}, Ljava/sql/Time;-><init>(J)V
    :try_end_1
    .catch Ljava/text/ParseException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit p0

    move-object p1, v0

    :goto_0
    return-object p1

    :catch_0
    move-exception p1

    :try_start_2
    new-instance v0, Lb/b/b/v;

    invoke-direct {v0, p1}, Lb/b/b/v;-><init>(Ljava/lang/Throwable;)V

    throw v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public b(Lb/b/b/c0/c;Ljava/lang/Object;)V
    .locals 1

    check-cast p2, Ljava/sql/Time;

    .line 1
    monitor-enter p0

    if-nez p2, :cond_0

    const/4 p2, 0x0

    goto :goto_0

    :cond_0
    :try_start_0
    iget-object v0, p0, Lb/b/b/a0/z/l;->a:Ljava/text/DateFormat;

    invoke-virtual {v0, p2}, Ljava/text/DateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    move-result-object p2

    :goto_0
    invoke-virtual {p1, p2}, Lb/b/b/c0/c;->p(Ljava/lang/String;)Lb/b/b/c0/c;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method
