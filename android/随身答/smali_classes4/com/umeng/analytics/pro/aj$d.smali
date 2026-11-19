.class public Lcom/umeng/analytics/pro/aj$d;
.super Lg2/z;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/umeng/analytics/pro/aj;
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

.method public synthetic constructor <init>(Lcom/umeng/analytics/pro/aj$a;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Lcom/umeng/analytics/pro/aj$d;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Lg2/s;Lcom/umeng/analytics/pro/aq;)V
    .locals 0

    .line 1
    check-cast p2, Lcom/umeng/analytics/pro/aj;

    .line 2
    .line 3
    invoke-virtual {p0, p1, p2}, Lcom/umeng/analytics/pro/aj$d;->d(Lg2/s;Lcom/umeng/analytics/pro/aj;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public bridge synthetic b(Lg2/s;Lcom/umeng/analytics/pro/aq;)V
    .locals 0

    .line 1
    check-cast p2, Lcom/umeng/analytics/pro/aj;

    .line 2
    .line 3
    invoke-virtual {p0, p1, p2}, Lcom/umeng/analytics/pro/aj$d;->c(Lg2/s;Lcom/umeng/analytics/pro/aj;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public c(Lg2/s;Lcom/umeng/analytics/pro/aj;)V
    .locals 0

    .line 1
    invoke-static {p1}, Lq/a;->a(Ljava/lang/Object;)V

    .line 2
    .line 3
    .line 4
    iget-object p1, p2, Lcom/umeng/analytics/pro/aj;->a:Ljava/lang/String;

    .line 5
    .line 6
    const/4 p1, 0x0

    .line 7
    throw p1
.end method

.method public d(Lg2/s;Lcom/umeng/analytics/pro/aj;)V
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
