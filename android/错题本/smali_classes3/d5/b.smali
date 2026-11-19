.class public abstract Ld5/b;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lokhttp3/z;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    new-instance v0, Lokhttp3/y;

    .line 2
    .line 3
    invoke-direct {v0}, Lokhttp3/y;-><init>()V

    .line 4
    .line 5
    .line 6
    sget-object v1, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    .line 7
    .line 8
    const-wide/16 v2, 0xa

    .line 9
    .line 10
    invoke-virtual {v0, v2, v3, v1}, Lokhttp3/y;->a(JLjava/util/concurrent/TimeUnit;)V

    .line 11
    .line 12
    .line 13
    invoke-virtual {v0, v2, v3, v1}, Lokhttp3/y;->c(JLjava/util/concurrent/TimeUnit;)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {v0, v2, v3, v1}, Lokhttp3/y;->b(JLjava/util/concurrent/TimeUnit;)V

    .line 17
    .line 18
    .line 19
    new-instance v1, Lokhttp3/z;

    .line 20
    .line 21
    invoke-direct {v1, v0}, Lokhttp3/z;-><init>(Lokhttp3/y;)V

    .line 22
    .line 23
    .line 24
    sput-object v1, Ld5/b;->a:Lokhttp3/z;

    .line 25
    .line 26
    return-void
.end method
