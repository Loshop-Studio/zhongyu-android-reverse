# RE note 本类字节码直接引用的读写或显示接口包括DataStore。
.class public final Lcom/zykj/huiwei/launcher/providers/LocalCacheProvide;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x0
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\r\u0008\u00c7\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u001f\u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u00062\u0008\u0008\u0001\u0010\u0005\u001a\u00020\u0004H\u0007\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u001f\u0010\u000b\u001a\u0008\u0012\u0004\u0012\u00020\n0\u00062\u0008\u0008\u0001\u0010\u0005\u001a\u00020\u0004H\u0007\u00a2\u0006\u0004\u0008\u000b\u0010\tJ\u001f\u0010\r\u001a\u0008\u0012\u0004\u0012\u00020\u000c0\u00062\u0008\u0008\u0001\u0010\u0005\u001a\u00020\u0004H\u0007\u00a2\u0006\u0004\u0008\r\u0010\tJ\u001f\u0010\u000f\u001a\u0008\u0012\u0004\u0012\u00020\u000e0\u00062\u0008\u0008\u0001\u0010\u0005\u001a\u00020\u0004H\u0007\u00a2\u0006\u0004\u0008\u000f\u0010\tJ\u001f\u0010\u0011\u001a\u0008\u0012\u0004\u0012\u00020\u00100\u00062\u0008\u0008\u0001\u0010\u0005\u001a\u00020\u0004H\u0007\u00a2\u0006\u0004\u0008\u0011\u0010\tR%\u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u0006*\u00020\u00048BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u0012\u0010\u0013\u001a\u0004\u0008\u0014\u0010\tR%\u0010\u000b\u001a\u0008\u0012\u0004\u0012\u00020\n0\u0006*\u00020\u00048BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u0015\u0010\u0013\u001a\u0004\u0008\u0016\u0010\tR%\u0010\r\u001a\u0008\u0012\u0004\u0012\u00020\u000c0\u0006*\u00020\u00048BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u0017\u0010\u0013\u001a\u0004\u0008\u0018\u0010\tR%\u0010\u000f\u001a\u0008\u0012\u0004\u0012\u00020\u000e0\u0006*\u00020\u00048BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u0019\u0010\u0013\u001a\u0004\u0008\u001a\u0010\tR%\u0010\u0011\u001a\u0008\u0012\u0004\u0012\u00020\u00100\u0006*\u00020\u00048BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u001b\u0010\u0013\u001a\u0004\u0008\u001c\u0010\t\u00a8\u0006\u001d"
    }
    d2 = {
        "Lcom/zykj/huiwei/launcher/providers/LocalCacheProvide;",
        "",
        "<init>",
        "()V",
        "Landroid/content/Context;",
        "context",
        "Landroidx/datastore/core/DataStore;",
        "Lcom/zykj/huiwei/launcher/proto/d;",
        "settingDataStore",
        "(Landroid/content/Context;)Landroidx/datastore/core/DataStore;",
        "Lcom/zykj/huiwei/launcher/proto/g;",
        "studentInfoDataStore",
        "Lcom/zykj/huiwei/launcher/proto/m;",
        "userCacheBeanDataStore",
        "Lcom/zykj/huiwei/launcher/proto/a;",
        "serverBeanDataStore",
        "Lcom/zykj/huiwei/launcher/proto/j;",
        "updateSettingsDataStore",
        "settingDataStore$delegate",
        "Lkotlin/properties/ReadOnlyProperty;",
        "getSettingDataStore",
        "studentInfoDataStore$delegate",
        "getStudentInfoDataStore",
        "userCacheBeanDataStore$delegate",
        "getUserCacheBeanDataStore",
        "serverBeanDataStore$delegate",
        "getServerBeanDataStore",
        "updateSettingsDataStore$delegate",
        "getUpdateSettingsDataStore",
        "app_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field static final synthetic $$delegatedProperties:[Lkotlin/reflect/KProperty;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "[",
            "Lkotlin/reflect/KProperty<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field public static final $stable:I

.field public static final INSTANCE:Lcom/zykj/huiwei/launcher/providers/LocalCacheProvide;

.field private static final serverBeanDataStore$delegate:Lkotlin/properties/ReadOnlyProperty;

.field private static final settingDataStore$delegate:Lkotlin/properties/ReadOnlyProperty;

.field private static final studentInfoDataStore$delegate:Lkotlin/properties/ReadOnlyProperty;

.field private static final updateSettingsDataStore$delegate:Lkotlin/properties/ReadOnlyProperty;

.field private static final userCacheBeanDataStore$delegate:Lkotlin/properties/ReadOnlyProperty;


# direct methods
.method static constructor <clinit>()V
    .locals 9

    new-instance v0, Lkotlin/jvm/internal/PropertyReference2Impl;

    const-class v1, Lcom/zykj/huiwei/launcher/providers/LocalCacheProvide;

    const-string v2, "settingDataStore"

    const-string v3, "getSettingDataStore(Landroid/content/Context;)Landroidx/datastore/core/DataStore;"

    const/4 v4, 0x0

    invoke-direct {v0, v1, v2, v3, v4}, Lkotlin/jvm/internal/PropertyReference2Impl;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    invoke-static {v0}, Lkotlin/jvm/internal/Reflection;->property2(Lkotlin/jvm/internal/PropertyReference2;)Lkotlin/reflect/KProperty2;

    move-result-object v0

    new-instance v2, Lkotlin/jvm/internal/PropertyReference2Impl;

    const-string v3, "studentInfoDataStore"

    const-string v5, "getStudentInfoDataStore(Landroid/content/Context;)Landroidx/datastore/core/DataStore;"

    invoke-direct {v2, v1, v3, v5, v4}, Lkotlin/jvm/internal/PropertyReference2Impl;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    invoke-static {v2}, Lkotlin/jvm/internal/Reflection;->property2(Lkotlin/jvm/internal/PropertyReference2;)Lkotlin/reflect/KProperty2;

    move-result-object v2

    new-instance v3, Lkotlin/jvm/internal/PropertyReference2Impl;

    const-string v5, "userCacheBeanDataStore"

    const-string v6, "getUserCacheBeanDataStore(Landroid/content/Context;)Landroidx/datastore/core/DataStore;"

    invoke-direct {v3, v1, v5, v6, v4}, Lkotlin/jvm/internal/PropertyReference2Impl;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    invoke-static {v3}, Lkotlin/jvm/internal/Reflection;->property2(Lkotlin/jvm/internal/PropertyReference2;)Lkotlin/reflect/KProperty2;

    move-result-object v3

    new-instance v5, Lkotlin/jvm/internal/PropertyReference2Impl;

    const-string v6, "serverBeanDataStore"

    const-string v7, "getServerBeanDataStore(Landroid/content/Context;)Landroidx/datastore/core/DataStore;"

    invoke-direct {v5, v1, v6, v7, v4}, Lkotlin/jvm/internal/PropertyReference2Impl;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    invoke-static {v5}, Lkotlin/jvm/internal/Reflection;->property2(Lkotlin/jvm/internal/PropertyReference2;)Lkotlin/reflect/KProperty2;

    move-result-object v5

    new-instance v6, Lkotlin/jvm/internal/PropertyReference2Impl;

    const-string v7, "updateSettingsDataStore"

    const-string v8, "getUpdateSettingsDataStore(Landroid/content/Context;)Landroidx/datastore/core/DataStore;"

    invoke-direct {v6, v1, v7, v8, v4}, Lkotlin/jvm/internal/PropertyReference2Impl;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    invoke-static {v6}, Lkotlin/jvm/internal/Reflection;->property2(Lkotlin/jvm/internal/PropertyReference2;)Lkotlin/reflect/KProperty2;

    move-result-object v1

    const/4 v6, 0x5

    new-array v6, v6, [Lkotlin/reflect/KProperty;

    aput-object v0, v6, v4

    const/4 v0, 0x1

    aput-object v2, v6, v0

    const/4 v0, 0x2

    aput-object v3, v6, v0

    const/4 v0, 0x3

    aput-object v5, v6, v0

    const/4 v0, 0x4

    aput-object v1, v6, v0

    sput-object v6, Lcom/zykj/huiwei/launcher/providers/LocalCacheProvide;->$$delegatedProperties:[Lkotlin/reflect/KProperty;

    new-instance v0, Lcom/zykj/huiwei/launcher/providers/LocalCacheProvide;

    invoke-direct {v0}, Lcom/zykj/huiwei/launcher/providers/LocalCacheProvide;-><init>()V

    sput-object v0, Lcom/zykj/huiwei/launcher/providers/LocalCacheProvide;->INSTANCE:Lcom/zykj/huiwei/launcher/providers/LocalCacheProvide;

    sget-object v2, Lcom/zykj/huiwei/launcher/providers/SettingsSerializer;->INSTANCE:Lcom/zykj/huiwei/launcher/providers/SettingsSerializer;

    const/16 v6, 0x1c

    const/4 v7, 0x0

    const-string v1, "settings.pb"

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-static/range {v1 .. v7}, Landroidx/datastore/DataStoreDelegateKt;->dataStore$default(Ljava/lang/String;Landroidx/datastore/core/Serializer;Landroidx/datastore/core/handlers/ReplaceFileCorruptionHandler;Lkotlin/jvm/functions/Function1;Lkotlinx/coroutines/CoroutineScope;ILjava/lang/Object;)Lkotlin/properties/ReadOnlyProperty;

    move-result-object v0

    sput-object v0, Lcom/zykj/huiwei/launcher/providers/LocalCacheProvide;->settingDataStore$delegate:Lkotlin/properties/ReadOnlyProperty;

    sget-object v2, Lcom/zykj/huiwei/launcher/providers/StudentInfoSerializer;->INSTANCE:Lcom/zykj/huiwei/launcher/providers/StudentInfoSerializer;

    const-string v1, "studentInfo.pb"

    invoke-static/range {v1 .. v7}, Landroidx/datastore/DataStoreDelegateKt;->dataStore$default(Ljava/lang/String;Landroidx/datastore/core/Serializer;Landroidx/datastore/core/handlers/ReplaceFileCorruptionHandler;Lkotlin/jvm/functions/Function1;Lkotlinx/coroutines/CoroutineScope;ILjava/lang/Object;)Lkotlin/properties/ReadOnlyProperty;

    move-result-object v0

    sput-object v0, Lcom/zykj/huiwei/launcher/providers/LocalCacheProvide;->studentInfoDataStore$delegate:Lkotlin/properties/ReadOnlyProperty;

    sget-object v2, Lcom/zykj/huiwei/launcher/providers/UserCacheBeanSerializer;->INSTANCE:Lcom/zykj/huiwei/launcher/providers/UserCacheBeanSerializer;

    const-string v1, "userCacheBean.pb"

    invoke-static/range {v1 .. v7}, Landroidx/datastore/DataStoreDelegateKt;->dataStore$default(Ljava/lang/String;Landroidx/datastore/core/Serializer;Landroidx/datastore/core/handlers/ReplaceFileCorruptionHandler;Lkotlin/jvm/functions/Function1;Lkotlinx/coroutines/CoroutineScope;ILjava/lang/Object;)Lkotlin/properties/ReadOnlyProperty;

    move-result-object v0

    sput-object v0, Lcom/zykj/huiwei/launcher/providers/LocalCacheProvide;->userCacheBeanDataStore$delegate:Lkotlin/properties/ReadOnlyProperty;

    sget-object v2, Lcom/zykj/huiwei/launcher/providers/ServerBeanSerializer;->INSTANCE:Lcom/zykj/huiwei/launcher/providers/ServerBeanSerializer;

    const-string v1, "serverBean.pb"

    invoke-static/range {v1 .. v7}, Landroidx/datastore/DataStoreDelegateKt;->dataStore$default(Ljava/lang/String;Landroidx/datastore/core/Serializer;Landroidx/datastore/core/handlers/ReplaceFileCorruptionHandler;Lkotlin/jvm/functions/Function1;Lkotlinx/coroutines/CoroutineScope;ILjava/lang/Object;)Lkotlin/properties/ReadOnlyProperty;

    move-result-object v0

    sput-object v0, Lcom/zykj/huiwei/launcher/providers/LocalCacheProvide;->serverBeanDataStore$delegate:Lkotlin/properties/ReadOnlyProperty;

    sget-object v2, Lcom/zykj/huiwei/launcher/providers/UpdateSettingsSerializer;->INSTANCE:Lcom/zykj/huiwei/launcher/providers/UpdateSettingsSerializer;

    const-string v1, "updateSettings.pb"

    invoke-static/range {v1 .. v7}, Landroidx/datastore/DataStoreDelegateKt;->dataStore$default(Ljava/lang/String;Landroidx/datastore/core/Serializer;Landroidx/datastore/core/handlers/ReplaceFileCorruptionHandler;Lkotlin/jvm/functions/Function1;Lkotlinx/coroutines/CoroutineScope;ILjava/lang/Object;)Lkotlin/properties/ReadOnlyProperty;

    move-result-object v0

    sput-object v0, Lcom/zykj/huiwei/launcher/providers/LocalCacheProvide;->updateSettingsDataStore$delegate:Lkotlin/properties/ReadOnlyProperty;

    const/16 v0, 0x8

    sput v0, Lcom/zykj/huiwei/launcher/providers/LocalCacheProvide;->$stable:I

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private final getServerBeanDataStore(Landroid/content/Context;)Landroidx/datastore/core/DataStore;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            ")",
            "Landroidx/datastore/core/DataStore<",
            "Lcom/zykj/huiwei/launcher/proto/a;",
            ">;"
        }
    .end annotation

    .line 1
    sget-object v0, Lcom/zykj/huiwei/launcher/providers/LocalCacheProvide;->serverBeanDataStore$delegate:Lkotlin/properties/ReadOnlyProperty;

    .line 2
    .line 3
    sget-object v1, Lcom/zykj/huiwei/launcher/providers/LocalCacheProvide;->$$delegatedProperties:[Lkotlin/reflect/KProperty;

    .line 4
    .line 5
    const/4 v2, 0x3

    .line 6
    aget-object v1, v1, v2

    .line 7
    .line 8
    invoke-interface {v0, p1, v1}, Lkotlin/properties/ReadOnlyProperty;->getValue(Ljava/lang/Object;Lkotlin/reflect/KProperty;)Ljava/lang/Object;

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

.method private final getSettingDataStore(Landroid/content/Context;)Landroidx/datastore/core/DataStore;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            ")",
            "Landroidx/datastore/core/DataStore<",
            "Lcom/zykj/huiwei/launcher/proto/d;",
            ">;"
        }
    .end annotation

    .line 1
    sget-object v0, Lcom/zykj/huiwei/launcher/providers/LocalCacheProvide;->settingDataStore$delegate:Lkotlin/properties/ReadOnlyProperty;

    .line 2
    .line 3
    sget-object v1, Lcom/zykj/huiwei/launcher/providers/LocalCacheProvide;->$$delegatedProperties:[Lkotlin/reflect/KProperty;

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    aget-object v1, v1, v2

    .line 7
    .line 8
    invoke-interface {v0, p1, v1}, Lkotlin/properties/ReadOnlyProperty;->getValue(Ljava/lang/Object;Lkotlin/reflect/KProperty;)Ljava/lang/Object;

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

.method private final getStudentInfoDataStore(Landroid/content/Context;)Landroidx/datastore/core/DataStore;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            ")",
            "Landroidx/datastore/core/DataStore<",
            "Lcom/zykj/huiwei/launcher/proto/g;",
            ">;"
        }
    .end annotation

    .line 1
    sget-object v0, Lcom/zykj/huiwei/launcher/providers/LocalCacheProvide;->studentInfoDataStore$delegate:Lkotlin/properties/ReadOnlyProperty;

    .line 2
    .line 3
    sget-object v1, Lcom/zykj/huiwei/launcher/providers/LocalCacheProvide;->$$delegatedProperties:[Lkotlin/reflect/KProperty;

    .line 4
    .line 5
    const/4 v2, 0x1

    .line 6
    aget-object v1, v1, v2

    .line 7
    .line 8
    invoke-interface {v0, p1, v1}, Lkotlin/properties/ReadOnlyProperty;->getValue(Ljava/lang/Object;Lkotlin/reflect/KProperty;)Ljava/lang/Object;

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

.method private final getUpdateSettingsDataStore(Landroid/content/Context;)Landroidx/datastore/core/DataStore;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            ")",
            "Landroidx/datastore/core/DataStore<",
            "Lcom/zykj/huiwei/launcher/proto/j;",
            ">;"
        }
    .end annotation

    .line 1
    sget-object v0, Lcom/zykj/huiwei/launcher/providers/LocalCacheProvide;->updateSettingsDataStore$delegate:Lkotlin/properties/ReadOnlyProperty;

    .line 2
    .line 3
    sget-object v1, Lcom/zykj/huiwei/launcher/providers/LocalCacheProvide;->$$delegatedProperties:[Lkotlin/reflect/KProperty;

    .line 4
    .line 5
    const/4 v2, 0x4

    .line 6
    aget-object v1, v1, v2

    .line 7
    .line 8
    invoke-interface {v0, p1, v1}, Lkotlin/properties/ReadOnlyProperty;->getValue(Ljava/lang/Object;Lkotlin/reflect/KProperty;)Ljava/lang/Object;

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

.method private final getUserCacheBeanDataStore(Landroid/content/Context;)Landroidx/datastore/core/DataStore;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            ")",
            "Landroidx/datastore/core/DataStore<",
            "Lcom/zykj/huiwei/launcher/proto/m;",
            ">;"
        }
    .end annotation

    .line 1
    sget-object v0, Lcom/zykj/huiwei/launcher/providers/LocalCacheProvide;->userCacheBeanDataStore$delegate:Lkotlin/properties/ReadOnlyProperty;

    .line 2
    .line 3
    sget-object v1, Lcom/zykj/huiwei/launcher/providers/LocalCacheProvide;->$$delegatedProperties:[Lkotlin/reflect/KProperty;

    .line 4
    .line 5
    const/4 v2, 0x2

    .line 6
    aget-object v1, v1, v2

    .line 7
    .line 8
    invoke-interface {v0, p1, v1}, Lkotlin/properties/ReadOnlyProperty;->getValue(Ljava/lang/Object;Lkotlin/reflect/KProperty;)Ljava/lang/Object;

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


# virtual methods
.method public final serverBeanDataStore(Landroid/content/Context;)Landroidx/datastore/core/DataStore;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            ")",
            "Landroidx/datastore/core/DataStore<",
            "Lcom/zykj/huiwei/launcher/proto/a;",
            ">;"
        }
    .end annotation

    .annotation runtime Ljavax/inject/Singleton;
    .end annotation

    .line 1
    const-string v0, "context"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0, p1}, Lcom/zykj/huiwei/launcher/providers/LocalCacheProvide;->getServerBeanDataStore(Landroid/content/Context;)Landroidx/datastore/core/DataStore;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    return-object p1
.end method

.method public final settingDataStore(Landroid/content/Context;)Landroidx/datastore/core/DataStore;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            ")",
            "Landroidx/datastore/core/DataStore<",
            "Lcom/zykj/huiwei/launcher/proto/d;",
            ">;"
        }
    .end annotation

    .annotation runtime Ljavax/inject/Singleton;
    .end annotation

    .line 1
    const-string v0, "context"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0, p1}, Lcom/zykj/huiwei/launcher/providers/LocalCacheProvide;->getSettingDataStore(Landroid/content/Context;)Landroidx/datastore/core/DataStore;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    return-object p1
.end method

.method public final studentInfoDataStore(Landroid/content/Context;)Landroidx/datastore/core/DataStore;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            ")",
            "Landroidx/datastore/core/DataStore<",
            "Lcom/zykj/huiwei/launcher/proto/g;",
            ">;"
        }
    .end annotation

    .annotation runtime Ljavax/inject/Singleton;
    .end annotation

    .line 1
    const-string v0, "context"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0, p1}, Lcom/zykj/huiwei/launcher/providers/LocalCacheProvide;->getStudentInfoDataStore(Landroid/content/Context;)Landroidx/datastore/core/DataStore;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    return-object p1
.end method

.method public final updateSettingsDataStore(Landroid/content/Context;)Landroidx/datastore/core/DataStore;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            ")",
            "Landroidx/datastore/core/DataStore<",
            "Lcom/zykj/huiwei/launcher/proto/j;",
            ">;"
        }
    .end annotation

    .annotation runtime Ljavax/inject/Singleton;
    .end annotation

    .line 1
    const-string v0, "context"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0, p1}, Lcom/zykj/huiwei/launcher/providers/LocalCacheProvide;->getUpdateSettingsDataStore(Landroid/content/Context;)Landroidx/datastore/core/DataStore;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    return-object p1
.end method

.method public final userCacheBeanDataStore(Landroid/content/Context;)Landroidx/datastore/core/DataStore;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            ")",
            "Landroidx/datastore/core/DataStore<",
            "Lcom/zykj/huiwei/launcher/proto/m;",
            ">;"
        }
    .end annotation

    .annotation runtime Ljavax/inject/Singleton;
    .end annotation

    .line 1
    const-string v0, "context"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0, p1}, Lcom/zykj/huiwei/launcher/providers/LocalCacheProvide;->getUserCacheBeanDataStore(Landroid/content/Context;)Landroidx/datastore/core/DataStore;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    return-object p1
.end method
