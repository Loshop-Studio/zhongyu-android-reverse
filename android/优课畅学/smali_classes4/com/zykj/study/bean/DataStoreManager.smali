# RE note 本类字节码直接引用的读写或显示接口包括DataStore。
.class public final Lcom/zykj/study/bean/DataStoreManager;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x0
.end annotation


# static fields
.field static final synthetic $$delegatedProperties:[Le8/k;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "[",
            "Le8/k;"
        }
    .end annotation
.end field

.field public static final $stable:I


# instance fields
.field private final appContext:Landroid/content/Context;

.field private final settingsDataStore$delegate:La8/d;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    new-instance v0, Lkotlin/jvm/internal/PropertyReference2Impl;

    const-class v1, Lcom/zykj/study/bean/DataStoreManager;

    const-string v2, "settingsDataStore"

    const-string v3, "getSettingsDataStore(Landroid/content/Context;)Landroidx/datastore/core/DataStore;"

    const/4 v4, 0x0

    invoke-direct {v0, v1, v2, v3, v4}, Lkotlin/jvm/internal/PropertyReference2Impl;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    invoke-static {v0}, Lkotlin/jvm/internal/y;->h(Lkotlin/jvm/internal/PropertyReference2;)Le8/n;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Le8/k;

    aput-object v0, v1, v4

    sput-object v1, Lcom/zykj/study/bean/DataStoreManager;->$$delegatedProperties:[Le8/k;

    const/16 v0, 0x8

    sput v0, Lcom/zykj/study/bean/DataStoreManager;->$stable:I

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 7

    .line 1
    const-string v0, "appContext"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object p1, p0, Lcom/zykj/study/bean/DataStoreManager;->appContext:Landroid/content/Context;

    .line 10
    .line 11
    const/16 v5, 0xe

    .line 12
    .line 13
    const/4 v6, 0x0

    .line 14
    const-string v1, "filename"

    .line 15
    .line 16
    const/4 v2, 0x0

    .line 17
    const/4 v3, 0x0

    .line 18
    const/4 v4, 0x0

    .line 19
    invoke-static/range {v1 .. v6}, Landroidx/datastore/preferences/PreferenceDataStoreDelegateKt;->preferencesDataStore$default(Ljava/lang/String;Landroidx/datastore/core/handlers/ReplaceFileCorruptionHandler;Lx7/l;Li8/b0;ILjava/lang/Object;)La8/d;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    iput-object p1, p0, Lcom/zykj/study/bean/DataStoreManager;->settingsDataStore$delegate:La8/d;

    .line 24
    .line 25
    return-void
.end method


# virtual methods
.method public final exerciseRevised(Ljava/lang/String;)Ll8/c;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Ll8/c;"
        }
    .end annotation

    .line 1
    const-string v0, "keyName"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/zykj/study/bean/DataStoreManager;->appContext:Landroid/content/Context;

    .line 7
    .line 8
    invoke-virtual {p0, v0}, Lcom/zykj/study/bean/DataStoreManager;->getSettingsDataStore(Landroid/content/Context;)Landroidx/datastore/core/DataStore;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    invoke-interface {v0}, Landroidx/datastore/core/DataStore;->getData()Ll8/c;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    new-instance v1, Lcom/zykj/study/bean/DataStoreManager$exerciseRevised$$inlined$map$1;

    .line 17
    .line 18
    invoke-direct {v1, v0, p1}, Lcom/zykj/study/bean/DataStoreManager$exerciseRevised$$inlined$map$1;-><init>(Ll8/c;Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    return-object v1
.end method

.method public final getSettingsDataStore(Landroid/content/Context;)Landroidx/datastore/core/DataStore;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            ")",
            "Landroidx/datastore/core/DataStore<",
            "Landroidx/datastore/preferences/core/Preferences;",
            ">;"
        }
    .end annotation

    .line 1
    const-string v0, "<this>"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/zykj/study/bean/DataStoreManager;->settingsDataStore$delegate:La8/d;

    .line 7
    .line 8
    sget-object v1, Lcom/zykj/study/bean/DataStoreManager;->$$delegatedProperties:[Le8/k;

    .line 9
    .line 10
    const/4 v2, 0x0

    .line 11
    aget-object v1, v1, v2

    .line 12
    .line 13
    invoke-interface {v0, p1, v1}, La8/d;->getValue(Ljava/lang/Object;Le8/k;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    check-cast p1, Landroidx/datastore/core/DataStore;

    .line 18
    .line 19
    return-object p1
.end method

.method public final removeKey(Ljava/lang/String;Lm7/c;)Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lm7/c<",
            "-",
            "Lh7/p;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/zykj/study/bean/DataStoreManager;->appContext:Landroid/content/Context;

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Lcom/zykj/study/bean/DataStoreManager;->getSettingsDataStore(Landroid/content/Context;)Landroidx/datastore/core/DataStore;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    new-instance v1, Lcom/zykj/study/bean/DataStoreManager$removeKey$2;

    .line 8
    .line 9
    const/4 v2, 0x0

    .line 10
    invoke-direct {v1, p1, v2}, Lcom/zykj/study/bean/DataStoreManager$removeKey$2;-><init>(Ljava/lang/String;Lm7/c;)V

    .line 11
    .line 12
    .line 13
    invoke-static {v0, v1, p2}, Landroidx/datastore/preferences/core/PreferencesKt;->edit(Landroidx/datastore/core/DataStore;Lx7/p;Lm7/c;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    invoke-static {}, Ln7/a;->f()Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object p2

    .line 21
    if-ne p1, p2, :cond_0

    .line 22
    .line 23
    return-object p1

    .line 24
    :cond_0
    sget-object p1, Lh7/p;->a:Lh7/p;

    .line 25
    .line 26
    return-object p1
.end method

.method public final setExerciseRevised(Ljava/lang/String;ZLm7/c;)Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Z",
            "Lm7/c<",
            "-",
            "Lh7/p;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/zykj/study/bean/DataStoreManager;->appContext:Landroid/content/Context;

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Lcom/zykj/study/bean/DataStoreManager;->getSettingsDataStore(Landroid/content/Context;)Landroidx/datastore/core/DataStore;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    new-instance v1, Lcom/zykj/study/bean/DataStoreManager$setExerciseRevised$2;

    .line 8
    .line 9
    const/4 v2, 0x0

    .line 10
    invoke-direct {v1, p1, p2, v2}, Lcom/zykj/study/bean/DataStoreManager$setExerciseRevised$2;-><init>(Ljava/lang/String;ZLm7/c;)V

    .line 11
    .line 12
    .line 13
    invoke-static {v0, v1, p3}, Landroidx/datastore/preferences/core/PreferencesKt;->edit(Landroidx/datastore/core/DataStore;Lx7/p;Lm7/c;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    invoke-static {}, Ln7/a;->f()Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object p2

    .line 21
    if-ne p1, p2, :cond_0

    .line 22
    .line 23
    return-object p1

    .line 24
    :cond_0
    sget-object p1, Lh7/p;->a:Lh7/p;

    .line 25
    .line 26
    return-object p1
.end method
