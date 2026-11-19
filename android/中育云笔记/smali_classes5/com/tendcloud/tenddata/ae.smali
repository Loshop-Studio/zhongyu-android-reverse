.class public Lcom/tendcloud/tenddata/ae;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static a:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/tendcloud/tenddata/w;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(Landroid/view/View;Z)Lcom/tendcloud/tenddata/w;
    .locals 1

    if-nez p0, :cond_0

    const/4 p0, 0x0

    return-object p0

    .line 1
    :cond_0
    sget-object v0, Lcom/tendcloud/tenddata/ae;->a:Ljava/util/List;

    invoke-static {p0, v0, p1}, Lcom/tendcloud/tenddata/v;->a(Landroid/view/View;Ljava/util/List;Z)Lcom/tendcloud/tenddata/w;

    move-result-object p0

    return-object p0
.end method

.method public static a()V
    .locals 1

    .line 2
    sget-object v0, Lcom/tendcloud/tenddata/ae;->a:Ljava/util/List;

    if-eqz v0, :cond_0

    .line 3
    invoke-interface {v0}, Ljava/util/List;->clear()V

    :cond_0
    return-void
.end method

.method public static addConfigFromString(Ljava/lang/String;)V
    .locals 3

    .line 1
    invoke-static {p0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    goto :goto_1

    .line 8
    :cond_0
    :try_start_0
    new-instance v0, Lorg/json/JSONArray;

    .line 9
    .line 10
    invoke-direct {v0, p0}, Lorg/json/JSONArray;-><init>(Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    invoke-virtual {v0}, Lorg/json/JSONArray;->length()I

    .line 14
    .line 15
    .line 16
    move-result p0

    .line 17
    if-nez p0, :cond_1

    .line 18
    .line 19
    goto :goto_1

    .line 20
    :cond_1
    sget-object p0, Lcom/tendcloud/tenddata/ae;->a:Ljava/util/List;

    .line 21
    .line 22
    if-nez p0, :cond_2

    .line 23
    .line 24
    new-instance p0, Ljava/util/ArrayList;

    .line 25
    .line 26
    invoke-virtual {v0}, Lorg/json/JSONArray;->length()I

    .line 27
    .line 28
    .line 29
    move-result v1

    .line 30
    invoke-direct {p0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 31
    .line 32
    .line 33
    sput-object p0, Lcom/tendcloud/tenddata/ae;->a:Ljava/util/List;

    .line 34
    .line 35
    :cond_2
    const/4 p0, 0x0

    .line 36
    :goto_0
    invoke-virtual {v0}, Lorg/json/JSONArray;->length()I

    .line 37
    .line 38
    .line 39
    move-result v1

    .line 40
    if-ge p0, v1, :cond_4

    .line 41
    .line 42
    invoke-virtual {v0, p0}, Lorg/json/JSONArray;->getJSONObject(I)Lorg/json/JSONObject;

    .line 43
    .line 44
    .line 45
    move-result-object v1

    .line 46
    invoke-static {v1}, Lcom/tendcloud/tenddata/w;->a(Lorg/json/JSONObject;)Lcom/tendcloud/tenddata/w;

    .line 47
    .line 48
    .line 49
    move-result-object v1

    .line 50
    if-eqz v1, :cond_3

    .line 51
    .line 52
    sget-object v2, Lcom/tendcloud/tenddata/ae;->a:Ljava/util/List;

    .line 53
    .line 54
    invoke-interface {v2, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 55
    .line 56
    .line 57
    :cond_3
    add-int/lit8 p0, p0, 0x1

    .line 58
    .line 59
    goto :goto_0

    .line 60
    :cond_4
    :goto_1
    return-void

    .line 61
    :catchall_0
    move-exception p0

    .line 62
    invoke-virtual {p0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 63
    .line 64
    .line 65
    return-void
.end method
