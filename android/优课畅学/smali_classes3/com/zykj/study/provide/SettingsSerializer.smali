# RE note 本类字节码直接引用的读写或显示接口包括Protobuf。
.class public final Lcom/zykj/study/provide/SettingsSerializer;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/datastore/core/Serializer;


# annotations
.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x1
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Landroidx/datastore/core/Serializer<",
        "Lcom/zykj/study/proto/Settings;",
        ">;"
    }
.end annotation


# static fields
.field public static final a:Lcom/zykj/study/provide/SettingsSerializer;

.field public static final b:Lcom/zykj/study/proto/Settings;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lcom/zykj/study/provide/SettingsSerializer;

    .line 2
    .line 3
    invoke-direct {v0}, Lcom/zykj/study/provide/SettingsSerializer;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lcom/zykj/study/provide/SettingsSerializer;->a:Lcom/zykj/study/provide/SettingsSerializer;

    .line 7
    .line 8
    invoke-static {}, Lcom/zykj/study/proto/Settings;->getDefaultInstance()Lcom/zykj/study/proto/Settings;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    const-string v1, "getDefaultInstance(...)"

    .line 13
    .line 14
    invoke-static {v0, v1}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    sput-object v0, Lcom/zykj/study/provide/SettingsSerializer;->b:Lcom/zykj/study/proto/Settings;

    .line 18
    .line 19
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


# virtual methods
.method public a()Lcom/zykj/study/proto/Settings;
    .locals 1

    .line 1
    sget-object v0, Lcom/zykj/study/provide/SettingsSerializer;->b:Lcom/zykj/study/proto/Settings;

    .line 2
    .line 3
    return-object v0
.end method

.method public b(Lcom/zykj/study/proto/Settings;Ljava/io/OutputStream;Lm7/c;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p1, p2}, Lcom/google/protobuf/AbstractMessageLite;->writeTo(Ljava/io/OutputStream;)V

    .line 2
    .line 3
    .line 4
    sget-object p1, Lh7/p;->a:Lh7/p;

    .line 5
    .line 6
    return-object p1
.end method

.method public bridge synthetic getDefaultValue()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/zykj/study/provide/SettingsSerializer;->a()Lcom/zykj/study/proto/Settings;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public readFrom(Ljava/io/InputStream;Lm7/c;)Ljava/lang/Object;
    .locals 1

    .line 1
    :try_start_0
    invoke-static {p1}, Lcom/zykj/study/proto/Settings;->parseFrom(Ljava/io/InputStream;)Lcom/zykj/study/proto/Settings;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    const-string p2, "parseFrom(...)"

    .line 6
    .line 7
    invoke-static {p1, p2}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V
    :try_end_0
    .catch Lcom/google/protobuf/InvalidProtocolBufferException; {:try_start_0 .. :try_end_0} :catch_0

    .line 8
    .line 9
    .line 10
    return-object p1

    .line 11
    :catch_0
    move-exception p1

    .line 12
    new-instance p2, Landroidx/datastore/core/CorruptionException;

    .line 13
    .line 14
    const-string v0, "Cannot read proto."

    .line 15
    .line 16
    invoke-direct {p2, v0, p1}, Landroidx/datastore/core/CorruptionException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 17
    .line 18
    .line 19
    throw p2
.end method

.method public bridge synthetic writeTo(Ljava/lang/Object;Ljava/io/OutputStream;Lm7/c;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lcom/zykj/study/proto/Settings;

    .line 2
    .line 3
    invoke-virtual {p0, p1, p2, p3}, Lcom/zykj/study/provide/SettingsSerializer;->b(Lcom/zykj/study/proto/Settings;Ljava/io/OutputStream;Lm7/c;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    return-object p1
.end method
