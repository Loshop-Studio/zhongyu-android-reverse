.class public Lanet/channel/strategy/l$b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lanet/channel/strategy/l;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "b"
.end annotation


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:I

.field public final c:Ljava/lang/String;

.field public final d:Ljava/lang/String;

.field public final e:Ljava/lang/String;

.field public final f:[Ljava/lang/String;

.field public final g:[Ljava/lang/String;

.field public final h:[Lanet/channel/strategy/l$a;

.field public final i:[Lanet/channel/strategy/l$e;

.field public final j:Z

.field public final k:Z

.field public final l:I


# direct methods
.method public constructor <init>(Lorg/json/JSONObject;)V
    .locals 8

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v0, "host"

    .line 2
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lanet/channel/strategy/l$b;->a:Ljava/lang/String;

    const-string v0, "ttl"

    .line 3
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    move-result v0

    iput v0, p0, Lanet/channel/strategy/l$b;->b:I

    const-string v0, "safeAisles"

    .line 4
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lanet/channel/strategy/l$b;->c:Ljava/lang/String;

    const-string v0, "cname"

    const/4 v1, 0x0

    .line 5
    invoke-virtual {p1, v0, v1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lanet/channel/strategy/l$b;->d:Ljava/lang/String;

    const-string v0, "unit"

    .line 6
    invoke-virtual {p1, v0, v1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lanet/channel/strategy/l$b;->e:Ljava/lang/String;

    const-string v0, "clear"

    .line 7
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    move-result v0

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-ne v0, v3, :cond_0

    goto :goto_0

    :cond_0
    const/4 v3, 0x0

    :goto_0
    iput-boolean v3, p0, Lanet/channel/strategy/l$b;->j:Z

    const-string v0, "effectNow"

    .line 8
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;)Z

    move-result v0

    iput-boolean v0, p0, Lanet/channel/strategy/l$b;->k:Z

    const-string v0, "version"

    .line 9
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    move-result v0

    iput v0, p0, Lanet/channel/strategy/l$b;->l:I

    const-string v0, "ips"

    .line 10
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 11
    invoke-virtual {v0}, Lorg/json/JSONArray;->length()I

    move-result v3

    .line 12
    new-array v4, v3, [Ljava/lang/String;

    iput-object v4, p0, Lanet/channel/strategy/l$b;->f:[Ljava/lang/String;

    const/4 v4, 0x0

    :goto_1
    if-ge v4, v3, :cond_2

    .line 13
    iget-object v5, p0, Lanet/channel/strategy/l$b;->f:[Ljava/lang/String;

    invoke-virtual {v0, v4}, Lorg/json/JSONArray;->optString(I)Ljava/lang/String;

    move-result-object v6

    aput-object v6, v5, v4

    add-int/lit8 v4, v4, 0x1

    goto :goto_1

    .line 14
    :cond_1
    iput-object v1, p0, Lanet/channel/strategy/l$b;->f:[Ljava/lang/String;

    :cond_2
    const-string v0, "sips"

    .line 15
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v0

    if-eqz v0, :cond_3

    .line 16
    invoke-virtual {v0}, Lorg/json/JSONArray;->length()I

    move-result v3

    if-lez v3, :cond_3

    .line 17
    invoke-virtual {v0}, Lorg/json/JSONArray;->length()I

    move-result v3

    .line 18
    new-array v4, v3, [Ljava/lang/String;

    iput-object v4, p0, Lanet/channel/strategy/l$b;->g:[Ljava/lang/String;

    const/4 v4, 0x0

    :goto_2
    if-ge v4, v3, :cond_4

    .line 19
    iget-object v5, p0, Lanet/channel/strategy/l$b;->g:[Ljava/lang/String;

    invoke-virtual {v0, v4}, Lorg/json/JSONArray;->optString(I)Ljava/lang/String;

    move-result-object v6

    aput-object v6, v5, v4

    add-int/lit8 v4, v4, 0x1

    goto :goto_2

    .line 20
    :cond_3
    iput-object v1, p0, Lanet/channel/strategy/l$b;->g:[Ljava/lang/String;

    :cond_4
    const-string v0, "aisles"

    .line 21
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v0

    if-eqz v0, :cond_5

    .line 22
    invoke-virtual {v0}, Lorg/json/JSONArray;->length()I

    move-result v3

    .line 23
    new-array v4, v3, [Lanet/channel/strategy/l$a;

    iput-object v4, p0, Lanet/channel/strategy/l$b;->h:[Lanet/channel/strategy/l$a;

    const/4 v4, 0x0

    :goto_3
    if-ge v4, v3, :cond_6

    .line 24
    iget-object v5, p0, Lanet/channel/strategy/l$b;->h:[Lanet/channel/strategy/l$a;

    new-instance v6, Lanet/channel/strategy/l$a;

    invoke-virtual {v0, v4}, Lorg/json/JSONArray;->optJSONObject(I)Lorg/json/JSONObject;

    move-result-object v7

    invoke-direct {v6, v7}, Lanet/channel/strategy/l$a;-><init>(Lorg/json/JSONObject;)V

    aput-object v6, v5, v4

    add-int/lit8 v4, v4, 0x1

    goto :goto_3

    .line 25
    :cond_5
    iput-object v1, p0, Lanet/channel/strategy/l$b;->h:[Lanet/channel/strategy/l$a;

    :cond_6
    const-string v0, "strategies"

    .line 26
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object p1

    if-eqz p1, :cond_7

    .line 27
    invoke-virtual {p1}, Lorg/json/JSONArray;->length()I

    move-result v0

    if-lez v0, :cond_7

    .line 28
    invoke-virtual {p1}, Lorg/json/JSONArray;->length()I

    move-result v0

    .line 29
    new-array v1, v0, [Lanet/channel/strategy/l$e;

    iput-object v1, p0, Lanet/channel/strategy/l$b;->i:[Lanet/channel/strategy/l$e;

    :goto_4
    if-ge v2, v0, :cond_8

    .line 30
    iget-object v1, p0, Lanet/channel/strategy/l$b;->i:[Lanet/channel/strategy/l$e;

    new-instance v3, Lanet/channel/strategy/l$e;

    invoke-virtual {p1, v2}, Lorg/json/JSONArray;->optJSONObject(I)Lorg/json/JSONObject;

    move-result-object v4

    invoke-direct {v3, v4}, Lanet/channel/strategy/l$e;-><init>(Lorg/json/JSONObject;)V

    aput-object v3, v1, v2

    add-int/lit8 v2, v2, 0x1

    goto :goto_4

    .line 31
    :cond_7
    iput-object v1, p0, Lanet/channel/strategy/l$b;->i:[Lanet/channel/strategy/l$e;

    :cond_8
    return-void
.end method
