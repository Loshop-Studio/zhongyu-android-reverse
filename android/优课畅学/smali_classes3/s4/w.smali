.class public final Ls4/w;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Ls4/w;

.field public static final synthetic b:[Le8/k;

.field public static final c:La8/d;

.field public static final d:I


# direct methods
.method static constructor <clinit>()V
    .locals 8

    .line 1
    new-instance v0, Lkotlin/jvm/internal/PropertyReference2Impl;

    .line 2
    .line 3
    const-class v1, Ls4/w;

    .line 4
    .line 5
    const-string v2, "settingsDataStore"

    .line 6
    .line 7
    const-string v3, "getSettingsDataStore(Landroid/content/Context;)Landroidx/datastore/core/DataStore;"

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
    sput-object v1, Ls4/w;->b:[Le8/k;

    .line 23
    .line 24
    new-instance v0, Ls4/w;

    .line 25
    .line 26
    invoke-direct {v0}, Ls4/w;-><init>()V

    .line 27
    .line 28
    .line 29
    sput-object v0, Ls4/w;->a:Ls4/w;

    .line 30
    .line 31
    sget-object v2, Lcom/zykj/study/provide/SettingsSerializer;->a:Lcom/zykj/study/provide/SettingsSerializer;

    .line 32
    .line 33
    const/16 v6, 0x1c

    .line 34
    .line 35
    const/4 v7, 0x0

    .line 36
    const-string v1, "settings.pb"

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
    sput-object v0, Ls4/w;->c:La8/d;

    .line 46
    .line 47
    const/16 v0, 0x8

    .line 48
    .line 49
    sput v0, Ls4/w;->d:I

    .line 50
    .line 51
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
.method public final a(Landroid/content/Context;)Lcom/zykj/study/bean/DataStoreManager;
    .locals 1

    .line 1
    const-string v0, "appContext"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance v0, Lcom/zykj/study/bean/DataStoreManager;

    .line 7
    .line 8
    invoke-direct {v0, p1}, Lcom/zykj/study/bean/DataStoreManager;-><init>(Landroid/content/Context;)V

    .line 9
    .line 10
    .line 11
    return-object v0
.end method

.method public final b()Lcom/zykj/study/bean/ClientCodeLiveData;
    .locals 1

    .line 1
    new-instance v0, Lcom/zykj/study/bean/ClientCodeLiveData;

    .line 2
    .line 3
    invoke-direct {v0}, Lcom/zykj/study/bean/ClientCodeLiveData;-><init>()V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method

.method public final c(Lo4/h;Landroidx/datastore/core/DataStore;Ll8/g;Ll8/h;Lcom/zykj/study/bean/ClientCodeLiveData;)Li3/a;
    .locals 7

    .line 1
    const-string v0, "autoService"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "serverBeanDataStore"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "unauthorizedFlow"

    .line 12
    .line 13
    invoke-static {p3, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    const-string v0, "headerLiveData"

    .line 17
    .line 18
    invoke-static {p4, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    const-string v0, "clientCodeLiveData"

    .line 22
    .line 23
    invoke-static {p5, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    new-instance v1, Lcom/zykj/study/repository/RefreshRepositoryImp;

    .line 27
    .line 28
    move-object v2, p1

    .line 29
    move-object v3, p2

    .line 30
    move-object v4, p3

    .line 31
    move-object v5, p4

    .line 32
    move-object v6, p5

    .line 33
    invoke-direct/range {v1 .. v6}, Lcom/zykj/study/repository/RefreshRepositoryImp;-><init>(Lo4/h;Landroidx/datastore/core/DataStore;Ll8/g;Ll8/h;Lcom/zykj/study/bean/ClientCodeLiveData;)V

    .line 34
    .line 35
    .line 36
    return-object v1
.end method
