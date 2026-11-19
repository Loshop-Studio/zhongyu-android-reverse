.class public Lcom/umeng/commonsdk/statistics/proto/d$d;
.super Lg2/z;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/umeng/commonsdk/statistics/proto/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "d"
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Lg2/z;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lcom/umeng/commonsdk/statistics/proto/d$a;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Lcom/umeng/commonsdk/statistics/proto/d$d;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Lg2/s;Lcom/umeng/analytics/pro/aq;)V
    .locals 0

    .line 1
    check-cast p2, Lcom/umeng/commonsdk/statistics/proto/d;

    .line 2
    .line 3
    invoke-virtual {p0, p1, p2}, Lcom/umeng/commonsdk/statistics/proto/d$d;->d(Lg2/s;Lcom/umeng/commonsdk/statistics/proto/d;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public bridge synthetic b(Lg2/s;Lcom/umeng/analytics/pro/aq;)V
    .locals 0

    .line 1
    check-cast p2, Lcom/umeng/commonsdk/statistics/proto/d;

    .line 2
    .line 3
    invoke-virtual {p0, p1, p2}, Lcom/umeng/commonsdk/statistics/proto/d$d;->c(Lg2/s;Lcom/umeng/commonsdk/statistics/proto/d;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public c(Lg2/s;Lcom/umeng/commonsdk/statistics/proto/d;)V
    .locals 0

    .line 1
    invoke-static {p1}, Lq/a;->a(Ljava/lang/Object;)V

    .line 2
    .line 3
    .line 4
    iget-object p1, p2, Lcom/umeng/commonsdk/statistics/proto/d;->a:Ljava/util/Map;

    .line 5
    .line 6
    invoke-interface {p1}, Ljava/util/Map;->size()I

    .line 7
    .line 8
    .line 9
    const/4 p1, 0x0

    .line 10
    throw p1
.end method

.method public d(Lg2/s;Lcom/umeng/commonsdk/statistics/proto/d;)V
    .locals 0

    .line 1
    invoke-static {p1}, Lq/a;->a(Ljava/lang/Object;)V

    .line 2
    .line 3
    .line 4
    const/4 p1, 0x0

    .line 5
    throw p1
.end method
