.class public final Lu3/a;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lu3/a;

.field public static final synthetic b:[Le8/k;

.field public static final c:La8/d;


# direct methods
.method static constructor <clinit>()V
    .locals 8

    .line 1
    new-instance v0, Lkotlin/jvm/internal/PropertyReference2Impl;

    .line 2
    .line 3
    const-class v1, Lu3/a;

    .line 4
    .line 5
    const-string v2, "updateSettingsDataStore"

    .line 6
    .line 7
    const-string v3, "getUpdateSettingsDataStore(Landroid/content/Context;)Landroidx/datastore/core/DataStore;"

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
    const/4 v1, 0x1

    .line 18
    new-array v1, v1, [Le8/k;

    .line 19
    .line 20
    aput-object v0, v1, v4

    .line 21
    .line 22
    sput-object v1, Lu3/a;->b:[Le8/k;

    .line 23
    .line 24
    new-instance v0, Lu3/a;

    .line 25
    .line 26
    invoke-direct {v0}, Lu3/a;-><init>()V

    .line 27
    .line 28
    .line 29
    sput-object v0, Lu3/a;->a:Lu3/a;

    .line 30
    .line 31
    sget-object v2, Lcom/zykj/lib/ota/provide/UpdateSettingsSerializer;->a:Lcom/zykj/lib/ota/provide/UpdateSettingsSerializer;

    .line 32
    .line 33
    const/16 v6, 0x1c

    .line 34
    .line 35
    const/4 v7, 0x0

    .line 36
    const-string v1, "updateSettings.pb"

    .line 37
    .line 38
    const/4 v3, 0x0

    .line 39
    const/4 v4, 0x0

    .line 40
    const/4 v5, 0x0

    .line 41
    invoke-static/range {v1 .. v7}, Landroidx/datastore/DataStoreDelegateKt;->dataStore$default(Ljava/lang/String;Landroidx/datastore/core/Serializer;Landroidx/datastore/core/handlers/ReplaceFileCorruptionHandler;Lx7/l;Li8/b0;ILjava/lang/Object;)La8/d;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    sput-object v0, Lu3/a;->c:La8/d;

    .line 46
    .line 47
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
    sget-object v0, Lu3/a;->c:La8/d;

    .line 2
    .line 3
    sget-object v1, Lu3/a;->b:[Le8/k;

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

.method public final b(Landroid/content/Context;)Landroidx/datastore/core/DataStore;
    .locals 1

    .line 1
    const-string v0, "context"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0, p1}, Lu3/a;->a(Landroid/content/Context;)Landroidx/datastore/core/DataStore;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    return-object p1
.end method
