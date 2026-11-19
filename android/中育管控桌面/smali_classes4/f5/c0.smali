.class public abstract Lf5/c0;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lf5/c0$a;
    }
.end annotation


# static fields
.field public static final Companion:Lf5/c0$a;

.field public static final EMPTY:Lf5/c0;
    .annotation build Lkotlin/jvm/JvmField;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    new-instance v0, Lf5/c0$a;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Lf5/c0$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lf5/c0;->Companion:Lf5/c0$a;

    .line 8
    .line 9
    sget-object v2, Lokio/ByteString;->EMPTY:Lokio/ByteString;

    .line 10
    .line 11
    const/4 v3, 0x1

    .line 12
    invoke-static {v0, v2, v1, v3, v1}, Lf5/c0$a;->q(Lf5/c0$a;Lokio/ByteString;Lf5/y;ILjava/lang/Object;)Lf5/c0;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    sput-object v0, Lf5/c0;->EMPTY:Lf5/c0;

    .line 17
    .line 18
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

.method public static final create(Lf5/y;Ljava/io/File;)Lf5/c0;
    .locals 1
    .annotation runtime Lkotlin/Deprecated;
        level = .enum Lkotlin/DeprecationLevel;->WARNING:Lkotlin/DeprecationLevel;
        message = "Moved to extension function. Put the \'file\' argument first to fix Java"
        replaceWith = .subannotation Lkotlin/ReplaceWith;
            expression = "file.asRequestBody(contentType)"
            imports = {
                "okhttp3.RequestBody.Companion.asRequestBody"
            }
        .end subannotation
    .end annotation

    .annotation runtime Lkotlin/jvm/JvmStatic;
    .end annotation

    .line 1
    sget-object v0, Lf5/c0;->Companion:Lf5/c0$a;

    invoke-virtual {v0, p0, p1}, Lf5/c0$a;->a(Lf5/y;Ljava/io/File;)Lf5/c0;

    move-result-object p0

    return-object p0
.end method

.method public static final create(Lf5/y;Ljava/lang/String;)Lf5/c0;
    .locals 1
    .annotation runtime Lkotlin/Deprecated;
        level = .enum Lkotlin/DeprecationLevel;->WARNING:Lkotlin/DeprecationLevel;
        message = "Moved to extension function. Put the \'content\' argument first to fix Java"
        replaceWith = .subannotation Lkotlin/ReplaceWith;
            expression = "content.toRequestBody(contentType)"
            imports = {
                "okhttp3.RequestBody.Companion.toRequestBody"
            }
        .end subannotation
    .end annotation

    .annotation runtime Lkotlin/jvm/JvmStatic;
    .end annotation

    .line 2
    sget-object v0, Lf5/c0;->Companion:Lf5/c0$a;

    invoke-virtual {v0, p0, p1}, Lf5/c0$a;->b(Lf5/y;Ljava/lang/String;)Lf5/c0;

    move-result-object p0

    return-object p0
.end method

.method public static final create(Lf5/y;Lokio/ByteString;)Lf5/c0;
    .locals 1
    .annotation runtime Lkotlin/Deprecated;
        level = .enum Lkotlin/DeprecationLevel;->WARNING:Lkotlin/DeprecationLevel;
        message = "Moved to extension function. Put the \'content\' argument first to fix Java"
        replaceWith = .subannotation Lkotlin/ReplaceWith;
            expression = "content.toRequestBody(contentType)"
            imports = {
                "okhttp3.RequestBody.Companion.toRequestBody"
            }
        .end subannotation
    .end annotation

    .annotation runtime Lkotlin/jvm/JvmStatic;
    .end annotation

    .line 3
    sget-object v0, Lf5/c0;->Companion:Lf5/c0$a;

    invoke-virtual {v0, p0, p1}, Lf5/c0$a;->c(Lf5/y;Lokio/ByteString;)Lf5/c0;

    move-result-object p0

    return-object p0
.end method

.method public static final create(Lf5/y;[B)Lf5/c0;
    .locals 1
    .annotation runtime Lkotlin/Deprecated;
        level = .enum Lkotlin/DeprecationLevel;->WARNING:Lkotlin/DeprecationLevel;
        message = "Moved to extension function. Put the \'content\' argument first to fix Java"
        replaceWith = .subannotation Lkotlin/ReplaceWith;
            expression = "content.toRequestBody(contentType, offset, byteCount)"
            imports = {
                "okhttp3.RequestBody.Companion.toRequestBody"
            }
        .end subannotation
    .end annotation

    .annotation build Lkotlin/jvm/JvmOverloads;
    .end annotation

    .annotation runtime Lkotlin/jvm/JvmStatic;
    .end annotation

    .line 4
    sget-object v0, Lf5/c0;->Companion:Lf5/c0$a;

    invoke-virtual {v0, p0, p1}, Lf5/c0$a;->d(Lf5/y;[B)Lf5/c0;

    move-result-object p0

    return-object p0
.end method

.method public static final create(Lf5/y;[BI)Lf5/c0;
    .locals 1
    .annotation runtime Lkotlin/Deprecated;
        level = .enum Lkotlin/DeprecationLevel;->WARNING:Lkotlin/DeprecationLevel;
        message = "Moved to extension function. Put the \'content\' argument first to fix Java"
        replaceWith = .subannotation Lkotlin/ReplaceWith;
            expression = "content.toRequestBody(contentType, offset, byteCount)"
            imports = {
                "okhttp3.RequestBody.Companion.toRequestBody"
            }
        .end subannotation
    .end annotation

    .annotation build Lkotlin/jvm/JvmOverloads;
    .end annotation

    .annotation runtime Lkotlin/jvm/JvmStatic;
    .end annotation

    .line 5
    sget-object v0, Lf5/c0;->Companion:Lf5/c0$a;

    invoke-virtual {v0, p0, p1, p2}, Lf5/c0$a;->e(Lf5/y;[BI)Lf5/c0;

    move-result-object p0

    return-object p0
.end method

.method public static final create(Lf5/y;[BII)Lf5/c0;
    .locals 1
    .annotation runtime Lkotlin/Deprecated;
        level = .enum Lkotlin/DeprecationLevel;->WARNING:Lkotlin/DeprecationLevel;
        message = "Moved to extension function. Put the \'content\' argument first to fix Java"
        replaceWith = .subannotation Lkotlin/ReplaceWith;
            expression = "content.toRequestBody(contentType, offset, byteCount)"
            imports = {
                "okhttp3.RequestBody.Companion.toRequestBody"
            }
        .end subannotation
    .end annotation

    .annotation build Lkotlin/jvm/JvmOverloads;
    .end annotation

    .annotation runtime Lkotlin/jvm/JvmStatic;
    .end annotation

    .line 6
    sget-object v0, Lf5/c0;->Companion:Lf5/c0$a;

    invoke-virtual {v0, p0, p1, p2, p3}, Lf5/c0$a;->f(Lf5/y;[BII)Lf5/c0;

    move-result-object p0

    return-object p0
.end method

.method public static final create(Ljava/io/File;Lf5/y;)Lf5/c0;
    .locals 1
    .annotation build Lkotlin/jvm/JvmName;
        name = "create"
    .end annotation

    .annotation runtime Lkotlin/jvm/JvmStatic;
    .end annotation

    .line 7
    sget-object v0, Lf5/c0;->Companion:Lf5/c0$a;

    invoke-virtual {v0, p0, p1}, Lf5/c0$a;->g(Ljava/io/File;Lf5/y;)Lf5/c0;

    move-result-object p0

    return-object p0
.end method

.method public static final create(Ljava/io/FileDescriptor;Lf5/y;)Lf5/c0;
    .locals 1
    .annotation build Lkotlin/jvm/JvmName;
        name = "create"
    .end annotation

    .annotation runtime Lkotlin/jvm/JvmStatic;
    .end annotation

    .line 8
    sget-object v0, Lf5/c0;->Companion:Lf5/c0$a;

    invoke-virtual {v0, p0, p1}, Lf5/c0$a;->h(Ljava/io/FileDescriptor;Lf5/y;)Lf5/c0;

    move-result-object p0

    return-object p0
.end method

.method public static final create(Ljava/lang/String;Lf5/y;)Lf5/c0;
    .locals 1
    .annotation build Lkotlin/jvm/JvmName;
        name = "create"
    .end annotation

    .annotation runtime Lkotlin/jvm/JvmStatic;
    .end annotation

    .line 9
    sget-object v0, Lf5/c0;->Companion:Lf5/c0$a;

    invoke-virtual {v0, p0, p1}, Lf5/c0$a;->i(Ljava/lang/String;Lf5/y;)Lf5/c0;

    move-result-object p0

    return-object p0
.end method

.method public static final create(Lokio/ByteString;Lf5/y;)Lf5/c0;
    .locals 1
    .annotation build Lkotlin/jvm/JvmName;
        name = "create"
    .end annotation

    .annotation runtime Lkotlin/jvm/JvmStatic;
    .end annotation

    .line 10
    sget-object v0, Lf5/c0;->Companion:Lf5/c0$a;

    invoke-virtual {v0, p0, p1}, Lf5/c0$a;->j(Lokio/ByteString;Lf5/y;)Lf5/c0;

    move-result-object p0

    return-object p0
.end method

.method public static final create(Lokio/Path;Lokio/FileSystem;Lf5/y;)Lf5/c0;
    .locals 1
    .annotation build Lkotlin/jvm/JvmName;
        name = "create"
    .end annotation

    .annotation runtime Lkotlin/jvm/JvmStatic;
    .end annotation

    .line 11
    sget-object v0, Lf5/c0;->Companion:Lf5/c0$a;

    invoke-virtual {v0, p0, p1, p2}, Lf5/c0$a;->k(Lokio/Path;Lokio/FileSystem;Lf5/y;)Lf5/c0;

    move-result-object p0

    return-object p0
.end method

.method public static final create([B)Lf5/c0;
    .locals 1
    .annotation build Lkotlin/jvm/JvmName;
        name = "create"
    .end annotation

    .annotation build Lkotlin/jvm/JvmOverloads;
    .end annotation

    .annotation runtime Lkotlin/jvm/JvmStatic;
    .end annotation

    .line 12
    sget-object v0, Lf5/c0;->Companion:Lf5/c0$a;

    invoke-virtual {v0, p0}, Lf5/c0$a;->l([B)Lf5/c0;

    move-result-object p0

    return-object p0
.end method

.method public static final create([BLf5/y;)Lf5/c0;
    .locals 1
    .annotation build Lkotlin/jvm/JvmName;
        name = "create"
    .end annotation

    .annotation build Lkotlin/jvm/JvmOverloads;
    .end annotation

    .annotation runtime Lkotlin/jvm/JvmStatic;
    .end annotation

    .line 13
    sget-object v0, Lf5/c0;->Companion:Lf5/c0$a;

    invoke-virtual {v0, p0, p1}, Lf5/c0$a;->m([BLf5/y;)Lf5/c0;

    move-result-object p0

    return-object p0
.end method

.method public static final create([BLf5/y;I)Lf5/c0;
    .locals 1
    .annotation build Lkotlin/jvm/JvmName;
        name = "create"
    .end annotation

    .annotation build Lkotlin/jvm/JvmOverloads;
    .end annotation

    .annotation runtime Lkotlin/jvm/JvmStatic;
    .end annotation

    .line 14
    sget-object v0, Lf5/c0;->Companion:Lf5/c0$a;

    invoke-virtual {v0, p0, p1, p2}, Lf5/c0$a;->n([BLf5/y;I)Lf5/c0;

    move-result-object p0

    return-object p0
.end method

.method public static final create([BLf5/y;II)Lf5/c0;
    .locals 1
    .annotation build Lkotlin/jvm/JvmName;
        name = "create"
    .end annotation

    .annotation build Lkotlin/jvm/JvmOverloads;
    .end annotation

    .annotation runtime Lkotlin/jvm/JvmStatic;
    .end annotation

    .line 15
    sget-object v0, Lf5/c0;->Companion:Lf5/c0$a;

    invoke-virtual {v0, p0, p1, p2, p3}, Lf5/c0$a;->o([BLf5/y;II)Lf5/c0;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public contentLength()J
    .locals 2

    .line 1
    const-wide/16 v0, -0x1

    .line 2
    .line 3
    return-wide v0
.end method

.method public abstract contentType()Lf5/y;
.end method

.method public isDuplex()Z
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    return v0
.end method

.method public isOneShot()Z
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    return v0
.end method

.method public abstract writeTo(Lokio/BufferedSink;)V
.end method
