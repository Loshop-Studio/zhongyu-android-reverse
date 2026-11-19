# RE note 本类字节码直接引用的读写或显示接口包括JSON。
.class public final Lcom/zykj/download/work/UploadFileOssWork$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/zykj/download/work/UploadFileOssWork;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/n;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/zykj/download/work/UploadFileOssWork$a;-><init>()V

    return-void
.end method


# virtual methods
# RE I/O 写入 JSON（Gson.toJson）。
.method public final a(Ljava/lang/String;Ljava/lang/String;Lcom/zykj/download/OssToken;)Landroidx/work/Data;
    .locals 2

    .line 1
    const-string v0, "filePath"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "objectName"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "ossToken"

    .line 12
    .line 13
    invoke-static {p3, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    const-string v0, "file_path"

    .line 17
    .line 18
    invoke-static {v0, p1}, Lh7/f;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    const-string v0, "oss_object_name"

    .line 23
    .line 24
    invoke-static {v0, p2}, Lh7/f;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 25
    .line 26
    .line 27
    move-result-object p2

    .line 28
    new-instance v0, Lcom/google/gson/Gson;

    .line 29
    .line 30
    invoke-direct {v0}, Lcom/google/gson/Gson;-><init>()V

    .line 31
    .line 32
    .line 33
    invoke-virtual {v0, p3}, Lcom/google/gson/Gson;->toJson(Ljava/lang/Object;)Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object p3

    .line 37
    const-string v0, "OSS_DATA"

    .line 38
    .line 39
    invoke-static {v0, p3}, Lh7/f;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 40
    .line 41
    .line 42
    move-result-object p3

    .line 43
    filled-new-array {p1, p2, p3}, [Lkotlin/Pair;

    .line 44
    .line 45
    .line 46
    move-result-object p1

    .line 47
    new-instance p2, Landroidx/work/Data$Builder;

    .line 48
    .line 49
    invoke-direct {p2}, Landroidx/work/Data$Builder;-><init>()V

    .line 50
    .line 51
    .line 52
    const/4 p3, 0x0

    .line 53
    :goto_0
    const/4 v0, 0x3

    .line 54
    if-ge p3, v0, :cond_0

    .line 55
    .line 56
    aget-object v0, p1, p3

    .line 57
    .line 58
    invoke-virtual {v0}, Lkotlin/Pair;->e()Ljava/lang/Object;

    .line 59
    .line 60
    .line 61
    move-result-object v1

    .line 62
    check-cast v1, Ljava/lang/String;

    .line 63
    .line 64
    invoke-virtual {v0}, Lkotlin/Pair;->g()Ljava/lang/Object;

    .line 65
    .line 66
    .line 67
    move-result-object v0

    .line 68
    invoke-virtual {p2, v1, v0}, Landroidx/work/Data$Builder;->put(Ljava/lang/String;Ljava/lang/Object;)Landroidx/work/Data$Builder;

    .line 69
    .line 70
    .line 71
    add-int/lit8 p3, p3, 0x1

    .line 72
    .line 73
    goto :goto_0

    .line 74
    :cond_0
    invoke-virtual {p2}, Landroidx/work/Data$Builder;->build()Landroidx/work/Data;

    .line 75
    .line 76
    .line 77
    move-result-object p1

    .line 78
    const-string p2, "dataBuilder.build()"

    .line 79
    .line 80
    invoke-static {p1, p2}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 81
    .line 82
    .line 83
    new-instance p2, Landroidx/work/Data;

    .line 84
    .line 85
    invoke-direct {p2, p1}, Landroidx/work/Data;-><init>(Landroidx/work/Data;)V

    .line 86
    .line 87
    .line 88
    return-object p2
.end method
