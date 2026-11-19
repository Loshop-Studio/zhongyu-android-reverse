.class public Lcom/umeng/analytics/pro/ad;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/umeng/analytics/pro/y;


# instance fields
.field private a:Z


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput-boolean v0, p0, Lcom/umeng/analytics/pro/ad;->a:Z

    .line 6
    .line 7
    return-void
.end method


# virtual methods
.method public a(Landroid/content/Context;)Ljava/lang/String;
    .locals 4

    .line 1
    const/4 v0, 0x0

    .line 2
    const/4 v1, 0x2

    .line 3
    :try_start_0
    iget-boolean v2, p0, Lcom/umeng/analytics/pro/ad;->a:Z

    .line 4
    .line 5
    const/4 v3, 0x1

    .line 6
    if-nez v2, :cond_0

    .line 7
    .line 8
    invoke-static {p1}, Lg3/a;->a(Landroid/content/Context;)V

    .line 9
    .line 10
    .line 11
    iput-boolean v3, p0, Lcom/umeng/analytics/pro/ad;->a:Z

    .line 12
    .line 13
    :cond_0
    invoke-static {}, Lg3/a;->b()Z

    .line 14
    .line 15
    .line 16
    move-result v2

    .line 17
    if-nez v2, :cond_1

    .line 18
    .line 19
    new-array p1, v3, [Ljava/lang/String;

    .line 20
    .line 21
    const-string v2, "\u5f53\u524d\u8bbe\u5907\u4e0d\u652f\u6301\u83b7\u53d6OAID"

    .line 22
    .line 23
    const/4 v3, 0x0

    .line 24
    aput-object v2, p1, v3

    .line 25
    .line 26
    invoke-static {v1, p1}, Lcom/umeng/commonsdk/debug/UMLog;->mutlInfo(I[Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_1
    invoke-static {p1}, Lg3/a;->c(Landroid/content/Context;)Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object p1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 34
    move-object v0, p1

    .line 35
    goto :goto_0

    .line 36
    :catch_0
    const-string p1, "\u672a\u68c0\u6d4b\u5230\u60a8\u96c6\u6210OAID SDK\u5305"

    .line 37
    .line 38
    filled-new-array {p1}, [Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object p1

    .line 42
    invoke-static {v1, p1}, Lcom/umeng/commonsdk/debug/UMLog;->mutlInfo(I[Ljava/lang/String;)V

    .line 43
    .line 44
    .line 45
    :goto_0
    return-object v0
.end method
