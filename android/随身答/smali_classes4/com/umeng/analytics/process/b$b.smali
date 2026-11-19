.class public Lcom/umeng/analytics/process/b$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lz2/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/umeng/analytics/process/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "b"
.end annotation


# instance fields
.field public final synthetic a:Lcom/umeng/analytics/process/b;


# direct methods
.method public constructor <init>(Lcom/umeng/analytics/process/b;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/umeng/analytics/process/b$b;->a:Lcom/umeng/analytics/process/b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lcom/umeng/analytics/process/b;Lcom/umeng/analytics/process/b$a;)V
    .locals 0

    .line 2
    invoke-direct {p0, p1}, Lcom/umeng/analytics/process/b$b;-><init>(Lcom/umeng/analytics/process/b;)V

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/String;)Z
    .locals 3

    .line 1
    iget-object p1, p0, Lcom/umeng/analytics/process/b$b;->a:Lcom/umeng/analytics/process/b;

    .line 2
    .line 3
    invoke-static {p1}, Lcom/umeng/analytics/process/b;->b(Lcom/umeng/analytics/process/b;)Landroid/content/Context;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-static {v0}, Lcom/umeng/commonsdk/framework/a;->l(Landroid/content/Context;)J

    .line 8
    .line 9
    .line 10
    move-result-wide v0

    .line 11
    invoke-virtual {p1, v0, v1}, Lcom/umeng/analytics/process/b;->d(J)Lorg/json/JSONObject;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    const/4 v0, 0x1

    .line 16
    if-eqz p1, :cond_1

    .line 17
    .line 18
    invoke-virtual {p1}, Lorg/json/JSONObject;->length()I

    .line 19
    .line 20
    .line 21
    move-result v1

    .line 22
    if-ge v1, v0, :cond_0

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_0
    const-string v1, "header"

    .line 26
    .line 27
    invoke-virtual {p1, v1}, Lorg/json/JSONObject;->opt(Ljava/lang/String;)Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    check-cast v1, Lorg/json/JSONObject;

    .line 32
    .line 33
    const-string v2, "content"

    .line 34
    .line 35
    invoke-virtual {p1, v2}, Lorg/json/JSONObject;->opt(Ljava/lang/String;)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object p1

    .line 39
    check-cast p1, Lorg/json/JSONObject;

    .line 40
    .line 41
    iget-object v2, p0, Lcom/umeng/analytics/process/b$b;->a:Lcom/umeng/analytics/process/b;

    .line 42
    .line 43
    invoke-static {v2}, Lcom/umeng/analytics/process/b;->b(Lcom/umeng/analytics/process/b;)Landroid/content/Context;

    .line 44
    .line 45
    .line 46
    move-result-object v2

    .line 47
    if-eqz v2, :cond_1

    .line 48
    .line 49
    if-eqz v1, :cond_1

    .line 50
    .line 51
    if-eqz p1, :cond_1

    .line 52
    .line 53
    iget-object v2, p0, Lcom/umeng/analytics/process/b$b;->a:Lcom/umeng/analytics/process/b;

    .line 54
    .line 55
    invoke-static {v2}, Lcom/umeng/analytics/process/b;->b(Lcom/umeng/analytics/process/b;)Landroid/content/Context;

    .line 56
    .line 57
    .line 58
    move-result-object v2

    .line 59
    invoke-static {v2, v1, p1}, Lcom/umeng/commonsdk/framework/a;->b(Landroid/content/Context;Lorg/json/JSONObject;Lorg/json/JSONObject;)Lorg/json/JSONObject;

    .line 60
    .line 61
    .line 62
    move-result-object p1

    .line 63
    if-eqz p1, :cond_1

    .line 64
    .line 65
    iget-object v1, p0, Lcom/umeng/analytics/process/b$b;->a:Lcom/umeng/analytics/process/b;

    .line 66
    .line 67
    invoke-virtual {v1, p1}, Lcom/umeng/analytics/process/b;->a(Ljava/lang/Object;)V

    .line 68
    .line 69
    .line 70
    :cond_1
    :goto_0
    return v0
.end method

.method public c(Ljava/lang/String;Ljava/lang/Object;)Z
    .locals 0

    .line 1
    const/4 p1, 0x0

    return p1
.end method

.method public e(Ljava/io/File;I)Z
    .locals 0

    .line 1
    const/4 p1, 0x0

    return p1
.end method
