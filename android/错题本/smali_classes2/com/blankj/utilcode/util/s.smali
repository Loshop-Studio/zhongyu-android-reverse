.class public abstract Lcom/blankj/utilcode/util/s;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lcom/blankj/utilcode/util/r;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lcom/blankj/utilcode/util/r;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Lcom/blankj/utilcode/util/r;-><init>(I)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lcom/blankj/utilcode/util/s;->a:Lcom/blankj/utilcode/util/r;

    .line 8
    .line 9
    return-void
.end method

.method public static a()Ljava/text/SimpleDateFormat;
    .locals 3

    .line 1
    sget-object v0, Lcom/blankj/utilcode/util/s;->a:Lcom/blankj/utilcode/util/r;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Ljava/util/Map;

    .line 8
    .line 9
    const-string/jumbo v1, "yyyyMMdd"

    .line 10
    .line 11
    .line 12
    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object v2

    .line 16
    check-cast v2, Ljava/text/SimpleDateFormat;

    .line 17
    .line 18
    if-nez v2, :cond_0

    .line 19
    .line 20
    new-instance v2, Ljava/text/SimpleDateFormat;

    .line 21
    .line 22
    invoke-direct {v2, v1}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    :cond_0
    return-object v2
.end method
