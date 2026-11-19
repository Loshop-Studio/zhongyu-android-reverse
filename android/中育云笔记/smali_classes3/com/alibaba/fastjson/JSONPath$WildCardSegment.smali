.class Lcom/alibaba/fastjson/JSONPath$WildCardSegment;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/alibaba/fastjson/JSONPath$Segment;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/alibaba/fastjson/JSONPath;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "WildCardSegment"
.end annotation


# static fields
.field public static final instance:Lcom/alibaba/fastjson/JSONPath$WildCardSegment;

.field public static final instance_deep:Lcom/alibaba/fastjson/JSONPath$WildCardSegment;


# instance fields
.field private deep:Z


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lcom/alibaba/fastjson/JSONPath$WildCardSegment;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Lcom/alibaba/fastjson/JSONPath$WildCardSegment;-><init>(Z)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lcom/alibaba/fastjson/JSONPath$WildCardSegment;->instance:Lcom/alibaba/fastjson/JSONPath$WildCardSegment;

    .line 8
    .line 9
    new-instance v0, Lcom/alibaba/fastjson/JSONPath$WildCardSegment;

    .line 10
    .line 11
    const/4 v1, 0x1

    .line 12
    invoke-direct {v0, v1}, Lcom/alibaba/fastjson/JSONPath$WildCardSegment;-><init>(Z)V

    .line 13
    .line 14
    .line 15
    sput-object v0, Lcom/alibaba/fastjson/JSONPath$WildCardSegment;->instance_deep:Lcom/alibaba/fastjson/JSONPath$WildCardSegment;

    .line 16
    .line 17
    return-void
.end method

.method private constructor <init>(Z)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-boolean p1, p0, Lcom/alibaba/fastjson/JSONPath$WildCardSegment;->deep:Z

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public eval(Lcom/alibaba/fastjson/JSONPath;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    iget-boolean p2, p0, Lcom/alibaba/fastjson/JSONPath$WildCardSegment;->deep:Z

    .line 2
    .line 3
    if-nez p2, :cond_0

    .line 4
    .line 5
    invoke-virtual {p1, p3}, Lcom/alibaba/fastjson/JSONPath;->getPropertyValues(Ljava/lang/Object;)Ljava/util/Collection;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    return-object p1

    .line 10
    :cond_0
    new-instance p2, Ljava/util/ArrayList;

    .line 11
    .line 12
    invoke-direct {p2}, Ljava/util/ArrayList;-><init>()V

    .line 13
    .line 14
    .line 15
    invoke-virtual {p1, p3, p2}, Lcom/alibaba/fastjson/JSONPath;->deepGetPropertyValues(Ljava/lang/Object;Ljava/util/List;)V

    .line 16
    .line 17
    .line 18
    return-object p2
.end method

.method public extract(Lcom/alibaba/fastjson/JSONPath;Lcom/alibaba/fastjson/parser/DefaultJSONParser;Lcom/alibaba/fastjson/JSONPath$Context;)V
    .locals 1

    .line 1
    iget-boolean v0, p3, Lcom/alibaba/fastjson/JSONPath$Context;->eval:Z

    .line 2
    .line 3
    if-eqz v0, :cond_2

    .line 4
    .line 5
    invoke-virtual {p2}, Lcom/alibaba/fastjson/parser/DefaultJSONParser;->parse()Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object p2

    .line 9
    iget-boolean v0, p0, Lcom/alibaba/fastjson/JSONPath$WildCardSegment;->deep:Z

    .line 10
    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    new-instance v0, Ljava/util/ArrayList;

    .line 14
    .line 15
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 16
    .line 17
    .line 18
    invoke-virtual {p1, p2, v0}, Lcom/alibaba/fastjson/JSONPath;->deepGetPropertyValues(Ljava/lang/Object;Ljava/util/List;)V

    .line 19
    .line 20
    .line 21
    iput-object v0, p3, Lcom/alibaba/fastjson/JSONPath$Context;->object:Ljava/lang/Object;

    .line 22
    .line 23
    return-void

    .line 24
    :cond_0
    instance-of p1, p2, Lcom/alibaba/fastjson/JSONObject;

    .line 25
    .line 26
    if-eqz p1, :cond_1

    .line 27
    .line 28
    check-cast p2, Lcom/alibaba/fastjson/JSONObject;

    .line 29
    .line 30
    invoke-virtual {p2}, Lcom/alibaba/fastjson/JSONObject;->values()Ljava/util/Collection;

    .line 31
    .line 32
    .line 33
    move-result-object p1

    .line 34
    new-instance p2, Lcom/alibaba/fastjson/JSONArray;

    .line 35
    .line 36
    invoke-interface {p1}, Ljava/util/Collection;->size()I

    .line 37
    .line 38
    .line 39
    move-result v0

    .line 40
    invoke-direct {p2, v0}, Lcom/alibaba/fastjson/JSONArray;-><init>(I)V

    .line 41
    .line 42
    .line 43
    invoke-virtual {p2, p1}, Lcom/alibaba/fastjson/JSONArray;->addAll(Ljava/util/Collection;)Z

    .line 44
    .line 45
    .line 46
    iput-object p2, p3, Lcom/alibaba/fastjson/JSONPath$Context;->object:Ljava/lang/Object;

    .line 47
    .line 48
    return-void

    .line 49
    :cond_1
    instance-of p1, p2, Lcom/alibaba/fastjson/JSONArray;

    .line 50
    .line 51
    if-eqz p1, :cond_2

    .line 52
    .line 53
    iput-object p2, p3, Lcom/alibaba/fastjson/JSONPath$Context;->object:Ljava/lang/Object;

    .line 54
    .line 55
    return-void

    .line 56
    :cond_2
    new-instance p1, Lcom/alibaba/fastjson/JSONException;

    .line 57
    .line 58
    const-string p2, "TODO"

    .line 59
    .line 60
    invoke-direct {p1, p2}, Lcom/alibaba/fastjson/JSONException;-><init>(Ljava/lang/String;)V

    .line 61
    .line 62
    .line 63
    throw p1
.end method
