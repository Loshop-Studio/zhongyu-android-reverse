.class public final Lm3/a;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lm3/a;

.field public static final synthetic b:[Le8/k;

.field public static final c:La8/d;

.field public static final d:La8/d;

.field public static final e:I


# direct methods
.method static constructor <clinit>()V
    .locals 8

    .line 1
    new-instance v0, Lkotlin/jvm/internal/PropertyReference2Impl;

    .line 2
    .line 3
    const-class v1, Lm3/a;

    .line 4
    .line 5
    const-string v2, "userDataStore"

    .line 6
    .line 7
    const-string v3, "getUserDataStore(Landroid/content/Context;)Landroidx/datastore/core/DataStore;"

    .line 8
    .line 9
    const/4 v4, 0x0

    .line 10
    invoke-direct {v0, v1, v2, v3, v4}, Lkotlin/jvm/internal/PropertyReference2Impl;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 11
    .line 12
    .line 13
    invoke-static {v0}, Lkotlin/jvm/internal/y;->h(Lkotlin/jvm/internal/PropertyReference2;)Le8/n;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    new-instance v2, Lkotlin/jvm/internal/PropertyReference2Impl;

    .line 18
    .line 19
    const-string v3, "serverDataStore"

    .line 20
    .line 21
    const-string v5, "getServerDataStore(Landroid/content/Context;)Landroidx/datastore/core/DataStore;"

    .line 22
    .line 23
    invoke-direct {v2, v1, v3, v5, v4}, Lkotlin/jvm/internal/PropertyReference2Impl;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 24
    .line 25
    .line 26
    invoke-static {v2}, Lkotlin/jvm/internal/y;->h(Lkotlin/jvm/internal/PropertyReference2;)Le8/n;

    .line 27
    .line 28
    .line 29
    move-result-object v1

    .line 30
    const/4 v2, 0x2

    .line 31
    new-array v2, v2, [Le8/k;

    .line 32
    .line 33
    aput-object v0, v2, v4

    .line 34
    .line 35
    const/4 v0, 0x1

    .line 36
    aput-object v1, v2, v0

    .line 37
    .line 38
    sput-object v2, Lm3/a;->b:[Le8/k;

    .line 39
    .line 40
    new-instance v0, Lm3/a;

    .line 41
    .line 42
    invoke-direct {v0}, Lm3/a;-><init>()V

    .line 43
    .line 44
    .line 45
    sput-object v0, Lm3/a;->a:Lm3/a;

    .line 46
    .line 47
    sget-object v2, Lcom/zykj/lib/login/provide/UserBeanSerializer;->a:Lcom/zykj/lib/login/provide/UserBeanSerializer;

    .line 48
    .line 49
    const/16 v6, 0x1c

    .line 50
    .line 51
    const/4 v7, 0x0

    .line 52
    const-string v1, "UserBean.pb"

    .line 53
    .line 54
    const/4 v3, 0x0

    .line 55
    const/4 v4, 0x0

    .line 56
    const/4 v5, 0x0

    .line 57
    invoke-static/range {v1 .. v7}, Landroidx/datastore/DataStoreDelegateKt;->dataStore$default(Ljava/lang/String;Landroidx/datastore/core/Serializer;Landroidx/datastore/core/handlers/ReplaceFileCorruptionHandler;Lx7/l;Li8/b0;ILjava/lang/Object;)La8/d;

    .line 58
    .line 59
    .line 60
    move-result-object v0

    .line 61
    sput-object v0, Lm3/a;->c:La8/d;

    .line 62
    .line 63
    sget-object v2, Lcom/zykj/lib/login/provide/ServerBeanSerializer;->a:Lcom/zykj/lib/login/provide/ServerBeanSerializer;

    .line 64
    .line 65
    const-string v1, "ServerBean.pb"

    .line 66
    .line 67
    invoke-static/range {v1 .. v7}, Landroidx/datastore/DataStoreDelegateKt;->dataStore$default(Ljava/lang/String;Landroidx/datastore/core/Serializer;Landroidx/datastore/core/handlers/ReplaceFileCorruptionHandler;Lx7/l;Li8/b0;ILjava/lang/Object;)La8/d;

    .line 68
    .line 69
    .line 70
    move-result-object v0

    .line 71
    sput-object v0, Lm3/a;->d:La8/d;

    .line 72
    .line 73
    const/16 v0, 0x8

    .line 74
    .line 75
    sput v0, Lm3/a;->e:I

    .line 76
    .line 77
    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public final a(Landroid/content/Context;)Landroidx/datastore/core/DataStore;
    .locals 3

    .line 1
    sget-object v0, Lm3/a;->d:La8/d;

    .line 2
    .line 3
    sget-object v1, Lm3/a;->b:[Le8/k;

    .line 4
    .line 5
    const/4 v2, 0x1

    .line 6
    aget-object v1, v1, v2

    .line 7
    .line 8
    invoke-interface {v0, p1, v1}, La8/d;->getValue(Ljava/lang/Object;Le8/k;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    check-cast p1, Landroidx/datastore/core/DataStore;

    .line 13
    .line 14
    return-object p1
.end method

.method public final b(Landroid/content/Context;)Landroidx/datastore/core/DataStore;
    .locals 3

    .line 1
    sget-object v0, Lm3/a;->c:La8/d;

    .line 2
    .line 3
    sget-object v1, Lm3/a;->b:[Le8/k;

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    aget-object v1, v1, v2

    .line 7
    .line 8
    invoke-interface {v0, p1, v1}, La8/d;->getValue(Ljava/lang/Object;Le8/k;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    check-cast p1, Landroidx/datastore/core/DataStore;

    .line 13
    .line 14
    return-object p1
.end method

.method public final c(Landroid/content/Context;)Landroidx/datastore/core/DataStore;
    .locals 1

    .line 1
    const-string v0, "context"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0, p1}, Lm3/a;->a(Landroid/content/Context;)Landroidx/datastore/core/DataStore;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    return-object p1
.end method

.method public final d(Landroid/content/Context;)Landroidx/datastore/core/DataStore;
    .locals 1

    .line 1
    const-string v0, "context"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0, p1}, Lm3/a;->b(Landroid/content/Context;)Landroidx/datastore/core/DataStore;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    return-object p1
.end method
