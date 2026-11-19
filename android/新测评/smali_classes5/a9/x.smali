.class public abstract La9/x;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        La9/x$a;
    }
.end annotation


# static fields
.field public static final Companion:La9/x$a;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, La9/x$a;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, La9/x$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, La9/x;->Companion:La9/x$a;

    .line 8
    .line 9
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

.method public static final create(La9/t;Ljava/io/File;)La9/x;
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
    sget-object v0, La9/x;->Companion:La9/x$a;

    invoke-virtual {v0, p0, p1}, La9/x$a;->a(La9/t;Ljava/io/File;)La9/x;

    move-result-object p0

    return-object p0
.end method

.method public static final create(La9/t;Ljava/lang/String;)La9/x;
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
    sget-object v0, La9/x;->Companion:La9/x$a;

    invoke-virtual {v0, p0, p1}, La9/x$a;->b(La9/t;Ljava/lang/String;)La9/x;

    move-result-object p0

    return-object p0
.end method

.method public static final create(La9/t;Lokio/ByteString;)La9/x;
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
    sget-object v0, La9/x;->Companion:La9/x$a;

    invoke-virtual {v0, p0, p1}, La9/x$a;->c(La9/t;Lokio/ByteString;)La9/x;

    move-result-object p0

    return-object p0
.end method

.method public static final create(La9/t;[B)La9/x;
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
    sget-object v0, La9/x;->Companion:La9/x$a;

    invoke-virtual {v0, p0, p1}, La9/x$a;->d(La9/t;[B)La9/x;

    move-result-object p0

    return-object p0
.end method

.method public static final create(La9/t;[BI)La9/x;
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
    sget-object v0, La9/x;->Companion:La9/x$a;

    invoke-virtual {v0, p0, p1, p2}, La9/x$a;->e(La9/t;[BI)La9/x;

    move-result-object p0

    return-object p0
.end method

.method public static final create(La9/t;[BII)La9/x;
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
    sget-object v0, La9/x;->Companion:La9/x$a;

    invoke-virtual {v0, p0, p1, p2, p3}, La9/x$a;->f(La9/t;[BII)La9/x;

    move-result-object p0

    return-object p0
.end method

.method public static final create(Ljava/io/File;La9/t;)La9/x;
    .locals 1
    .annotation build Lkotlin/jvm/JvmName;
        name = "create"
    .end annotation

    .annotation runtime Lkotlin/jvm/JvmStatic;
    .end annotation

    .line 7
    sget-object v0, La9/x;->Companion:La9/x$a;

    invoke-virtual {v0, p0, p1}, La9/x$a;->g(Ljava/io/File;La9/t;)La9/x;

    move-result-object p0

    return-object p0
.end method

.method public static final create(Ljava/lang/String;La9/t;)La9/x;
    .locals 1
    .annotation build Lkotlin/jvm/JvmName;
        name = "create"
    .end annotation

    .annotation runtime Lkotlin/jvm/JvmStatic;
    .end annotation

    .line 8
    sget-object v0, La9/x;->Companion:La9/x$a;

    invoke-virtual {v0, p0, p1}, La9/x$a;->h(Ljava/lang/String;La9/t;)La9/x;

    move-result-object p0

    return-object p0
.end method

.method public static final create(Lokio/ByteString;La9/t;)La9/x;
    .locals 1
    .annotation build Lkotlin/jvm/JvmName;
        name = "create"
    .end annotation

    .annotation runtime Lkotlin/jvm/JvmStatic;
    .end annotation

    .line 9
    sget-object v0, La9/x;->Companion:La9/x$a;

    invoke-virtual {v0, p0, p1}, La9/x$a;->i(Lokio/ByteString;La9/t;)La9/x;

    move-result-object p0

    return-object p0
.end method

.method public static final create([B)La9/x;
    .locals 1
    .annotation build Lkotlin/jvm/JvmName;
        name = "create"
    .end annotation

    .annotation build Lkotlin/jvm/JvmOverloads;
    .end annotation

    .annotation runtime Lkotlin/jvm/JvmStatic;
    .end annotation

    .line 10
    sget-object v0, La9/x;->Companion:La9/x$a;

    invoke-virtual {v0, p0}, La9/x$a;->j([B)La9/x;

    move-result-object p0

    return-object p0
.end method

.method public static final create([BLa9/t;)La9/x;
    .locals 1
    .annotation build Lkotlin/jvm/JvmName;
        name = "create"
    .end annotation

    .annotation build Lkotlin/jvm/JvmOverloads;
    .end annotation

    .annotation runtime Lkotlin/jvm/JvmStatic;
    .end annotation

    .line 11
    sget-object v0, La9/x;->Companion:La9/x$a;

    invoke-virtual {v0, p0, p1}, La9/x$a;->k([BLa9/t;)La9/x;

    move-result-object p0

    return-object p0
.end method

.method public static final create([BLa9/t;I)La9/x;
    .locals 1
    .annotation build Lkotlin/jvm/JvmName;
        name = "create"
    .end annotation

    .annotation build Lkotlin/jvm/JvmOverloads;
    .end annotation

    .annotation runtime Lkotlin/jvm/JvmStatic;
    .end annotation

    .line 12
    sget-object v0, La9/x;->Companion:La9/x$a;

    invoke-virtual {v0, p0, p1, p2}, La9/x$a;->l([BLa9/t;I)La9/x;

    move-result-object p0

    return-object p0
.end method

.method public static final create([BLa9/t;II)La9/x;
    .locals 1
    .annotation build Lkotlin/jvm/JvmName;
        name = "create"
    .end annotation

    .annotation build Lkotlin/jvm/JvmOverloads;
    .end annotation

    .annotation runtime Lkotlin/jvm/JvmStatic;
    .end annotation

    .line 13
    sget-object v0, La9/x;->Companion:La9/x$a;

    invoke-virtual {v0, p0, p1, p2, p3}, La9/x$a;->m([BLa9/t;II)La9/x;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public contentLength()J
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    const-wide/16 v0, -0x1

    .line 2
    .line 3
    return-wide v0
.end method

.method public abstract contentType()La9/t;
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
