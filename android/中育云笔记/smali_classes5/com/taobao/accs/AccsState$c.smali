.class Lcom/taobao/accs/AccsState$c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/taobao/accs/AccsState;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "c"
.end annotation


# static fields
.field public static final MAX_HISTORY:I = 0x5


# instance fields
.field private final a:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Lcom/taobao/accs/AccsState$b;",
            ">;"
        }
    .end annotation
.end field

.field private final b:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Ljava/util/ArrayList<",
            "Lcom/taobao/accs/AccsState$b;",
            ">;>;"
        }
    .end annotation
.end field


# direct methods
.method private constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/taobao/accs/AccsState$c;->a:Ljava/util/HashMap;

    .line 3
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/taobao/accs/AccsState$c;->b:Ljava/util/HashMap;

    return-void
.end method

.method public synthetic constructor <init>(Lcom/taobao/accs/a;)V
    .locals 0

    .line 4
    invoke-direct {p0}, Lcom/taobao/accs/AccsState$c;-><init>()V

    return-void
.end method

.method private static a(Ljava/lang/Object;)Ljava/lang/String;
    .locals 0

    if-nez p0, :cond_0

    .line 2
    const-string p0, "null"

    return-object p0

    .line 3
    :cond_0
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public a()Lorg/json/JSONArray;
    .locals 6

    .line 5
    new-instance v0, Lorg/json/JSONArray;

    invoke-direct {v0}, Lorg/json/JSONArray;-><init>()V

    .line 6
    new-instance v1, Ljava/util/ArrayList;

    iget-object v2, p0, Lcom/taobao/accs/AccsState$c;->a:Ljava/util/HashMap;

    invoke-virtual {v2}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 7
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v2

    const/4 v3, 0x0

    move v4, v3

    :goto_0
    if-ge v4, v2, :cond_0

    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v5

    add-int/lit8 v4, v4, 0x1

    check-cast v5, Lcom/taobao/accs/AccsState$b;

    .line 8
    invoke-virtual {v5}, Lcom/taobao/accs/AccsState$b;->a()Lorg/json/JSONArray;

    move-result-object v5

    invoke-virtual {v0, v5}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;

    goto :goto_0

    .line 9
    :cond_0
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 10
    iget-object v2, p0, Lcom/taobao/accs/AccsState$c;->b:Ljava/util/HashMap;

    invoke-virtual {v2}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_1

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/ArrayList;

    .line 11
    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    goto :goto_1

    .line 12
    :cond_1
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v2

    :goto_2
    if-ge v3, v2, :cond_2

    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v4

    add-int/lit8 v3, v3, 0x1

    check-cast v4, Lcom/taobao/accs/AccsState$b;

    .line 13
    invoke-virtual {v4}, Lcom/taobao/accs/AccsState$b;->a()Lorg/json/JSONArray;

    move-result-object v4

    invoke-virtual {v0, v4}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;

    goto :goto_2

    :cond_2
    return-object v0
.end method

.method public a(Ljava/lang/String;Ljava/lang/Object;J)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/taobao/accs/AccsState$c;->a:Ljava/util/HashMap;

    new-instance v1, Lcom/taobao/accs/AccsState$b;

    invoke-static {p2}, Lcom/taobao/accs/AccsState$c;->a(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p2

    invoke-direct {v1, p3, p4, p1, p2}, Lcom/taobao/accs/AccsState$b;-><init>(JLjava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v0, p1, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public a(Ljava/lang/String;)Z
    .locals 1

    .line 4
    iget-object v0, p0, Lcom/taobao/accs/AccsState$c;->a:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/taobao/accs/AccsState$c;->b:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    return p1

    :cond_1
    :goto_0
    const/4 p1, 0x1

    return p1
.end method

.method public b(Ljava/lang/String;)Lorg/json/JSONArray;
    .locals 4

    .line 7
    new-instance v0, Lorg/json/JSONArray;

    invoke-direct {v0}, Lorg/json/JSONArray;-><init>()V

    .line 8
    iget-object v1, p0, Lcom/taobao/accs/AccsState$c;->a:Ljava/util/HashMap;

    invoke-virtual {v1, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/taobao/accs/AccsState$b;

    if-eqz v1, :cond_0

    .line 9
    invoke-virtual {v1}, Lcom/taobao/accs/AccsState$b;->a()Lorg/json/JSONArray;

    move-result-object v1

    invoke-virtual {v0, v1}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;

    .line 10
    :cond_0
    iget-object v1, p0, Lcom/taobao/accs/AccsState$c;->b:Ljava/util/HashMap;

    invoke-virtual {v1, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/ArrayList;

    if-eqz p1, :cond_1

    .line 11
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result v1

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_1

    invoke-virtual {p1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    add-int/lit8 v2, v2, 0x1

    check-cast v3, Lcom/taobao/accs/AccsState$b;

    .line 12
    invoke-virtual {v3}, Lcom/taobao/accs/AccsState$b;->a()Lorg/json/JSONArray;

    move-result-object v3

    invoke-virtual {v0, v3}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;

    goto :goto_0

    :cond_1
    return-object v0
.end method

.method public b(Ljava/lang/String;Ljava/lang/Object;J)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/taobao/accs/AccsState$c;->b:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/ArrayList;

    if-nez v0, :cond_0

    .line 2
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 3
    iget-object v1, p0, Lcom/taobao/accs/AccsState$c;->b:Ljava/util/HashMap;

    invoke-virtual {v1, p1, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    :cond_0
    new-instance v1, Lcom/taobao/accs/AccsState$b;

    invoke-static {p2}, Lcom/taobao/accs/AccsState$c;->a(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p2

    invoke-direct {v1, p3, p4, p1, p2}, Lcom/taobao/accs/AccsState$b;-><init>(JLjava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 5
    :goto_0
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result p1

    const/4 p2, 0x5

    if-le p1, p2, :cond_1

    const/4 p1, 0x0

    .line 6
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    goto :goto_0

    :cond_1
    return-void
.end method
