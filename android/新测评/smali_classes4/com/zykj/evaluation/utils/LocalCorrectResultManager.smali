# RE note localCorrectResult.bin 以 JSON 保存 Map<String,Integer>。
.class public final Lcom/zykj/evaluation/utils/LocalCorrectResultManager;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lcom/zykj/evaluation/utils/LocalCorrectResultManager;

.field public static final b:Lcom/google/gson/Gson;

.field public static final c:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lcom/zykj/evaluation/utils/LocalCorrectResultManager;

    .line 2
    .line 3
    invoke-direct {v0}, Lcom/zykj/evaluation/utils/LocalCorrectResultManager;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lcom/zykj/evaluation/utils/LocalCorrectResultManager;->a:Lcom/zykj/evaluation/utils/LocalCorrectResultManager;

    .line 7
    .line 8
    new-instance v0, Lcom/google/gson/Gson;

    .line 9
    .line 10
    invoke-direct {v0}, Lcom/google/gson/Gson;-><init>()V

    .line 11
    .line 12
    .line 13
    sput-object v0, Lcom/zykj/evaluation/utils/LocalCorrectResultManager;->b:Lcom/google/gson/Gson;

    .line 14
    .line 15
    const/16 v0, 0x8

    .line 16
    .line 17
    sput v0, Lcom/zykj/evaluation/utils/LocalCorrectResultManager;->c:I

    .line 18
    .line 19
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
# RE I/O 读取 JSON（Gson.fromJson）。
.method public final a(Ljava/lang/String;)Ljava/util/Map;
    .locals 2

    .line 1
    const-string v0, "path"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance v0, Ljava/io/File;

    .line 7
    .line 8
    const-string v1, "localCorrectResult.bin"

    .line 9
    .line 10
    invoke-direct {v0, p1, v1}, Ljava/io/File;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    invoke-static {v0}, Lcom/blankj/utilcode/util/FileIOUtils;->readFile2String(Ljava/io/File;)Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    sget-object v0, Lcom/zykj/evaluation/utils/LocalCorrectResultManager;->b:Lcom/google/gson/Gson;

    .line 18
    .line 19
    new-instance v1, Lcom/zykj/evaluation/utils/LocalCorrectResultManager$readLocalCorrectResult$1;

    .line 20
    .line 21
    invoke-direct {v1}, Lcom/zykj/evaluation/utils/LocalCorrectResultManager$readLocalCorrectResult$1;-><init>()V

    .line 22
    .line 23
    .line 24
    invoke-virtual {v1}, Lcom/google/gson/reflect/TypeToken;->getType()Ljava/lang/reflect/Type;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    invoke-virtual {v0, p1, v1}, Lcom/google/gson/Gson;->fromJson(Ljava/lang/String;Ljava/lang/reflect/Type;)Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    check-cast p1, Ljava/util/Map;

    .line 33
    .line 34
    if-nez p1, :cond_0

    .line 35
    .line 36
    invoke-static {}, Lkotlin/collections/MapsKt;->emptyMap()Ljava/util/Map;

    .line 37
    .line 38
    .line 39
    move-result-object p1

    .line 40
    :cond_0
    return-object p1
.end method

# RE I/O 写入 JSON（Gson.toJson）。
.method public final b(Ljava/util/Map;Ljava/lang/String;)V
    .locals 2

    .line 1
    const-string v0, "map"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "path"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    new-instance v0, Ljava/io/File;

    .line 12
    .line 13
    const-string v1, "localCorrectResult.bin"

    .line 14
    .line 15
    invoke-direct {v0, p2, v1}, Ljava/io/File;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    sget-object p2, Lcom/zykj/evaluation/utils/LocalCorrectResultManager;->b:Lcom/google/gson/Gson;

    .line 19
    .line 20
    invoke-virtual {p2, p1}, Lcom/google/gson/Gson;->toJson(Ljava/lang/Object;)Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    invoke-static {v0, p1}, Lcom/blankj/utilcode/util/FileIOUtils;->writeFileFromString(Ljava/io/File;Ljava/lang/String;)Z

    .line 25
    .line 26
    .line 27
    return-void
.end method
