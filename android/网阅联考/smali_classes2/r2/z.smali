.class public abstract Lr2/z;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lr2/z$a;
    }
.end annotation


# static fields
.field public static final Companion:Lr2/z$a;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lr2/z$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lr2/z$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lr2/z;->Companion:Lr2/z$a;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static final create(Ljava/io/File;Lr2/v;)Lr2/z;
    .locals 1
    .annotation build Lkotlin/jvm/JvmName;
        name = "create"
    .end annotation

    .annotation runtime Lkotlin/jvm/JvmStatic;
    .end annotation

    .line 1
    sget-object v0, Lr2/z;->Companion:Lr2/z$a;

    invoke-virtual {v0, p0, p1}, Lr2/z$a;->a(Ljava/io/File;Lr2/v;)Lr2/z;

    move-result-object p0

    return-object p0
.end method

.method public static final create(Ljava/lang/String;Lr2/v;)Lr2/z;
    .locals 1
    .annotation build Lkotlin/jvm/JvmName;
        name = "create"
    .end annotation

    .annotation runtime Lkotlin/jvm/JvmStatic;
    .end annotation

    .line 2
    sget-object v0, Lr2/z;->Companion:Lr2/z$a;

    invoke-virtual {v0, p0, p1}, Lr2/z$a;->b(Ljava/lang/String;Lr2/v;)Lr2/z;

    move-result-object p0

    return-object p0
.end method

.method public static final create(Lokio/ByteString;Lr2/v;)Lr2/z;
    .locals 1
    .annotation build Lkotlin/jvm/JvmName;
        name = "create"
    .end annotation

    .annotation runtime Lkotlin/jvm/JvmStatic;
    .end annotation

    .line 3
    sget-object v0, Lr2/z;->Companion:Lr2/z$a;

    invoke-virtual {v0, p0, p1}, Lr2/z$a;->c(Lokio/ByteString;Lr2/v;)Lr2/z;

    move-result-object p0

    return-object p0
.end method

.method public static final create(Lr2/v;Ljava/io/File;)Lr2/z;
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

    .line 4
    sget-object v0, Lr2/z;->Companion:Lr2/z$a;

    invoke-virtual {v0, p0, p1}, Lr2/z$a;->d(Lr2/v;Ljava/io/File;)Lr2/z;

    move-result-object p0

    return-object p0
.end method

.method public static final create(Lr2/v;Ljava/lang/String;)Lr2/z;
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

    .line 5
    sget-object v0, Lr2/z;->Companion:Lr2/z$a;

    invoke-virtual {v0, p0, p1}, Lr2/z$a;->e(Lr2/v;Ljava/lang/String;)Lr2/z;

    move-result-object p0

    return-object p0
.end method

.method public static final create(Lr2/v;Lokio/ByteString;)Lr2/z;
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

    .line 6
    sget-object v0, Lr2/z;->Companion:Lr2/z$a;

    invoke-virtual {v0, p0, p1}, Lr2/z$a;->f(Lr2/v;Lokio/ByteString;)Lr2/z;

    move-result-object p0

    return-object p0
.end method

.method public static final create(Lr2/v;[B)Lr2/z;
    .locals 7
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

    .line 7
    sget-object v0, Lr2/z;->Companion:Lr2/z$a;

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/16 v5, 0xc

    const/4 v6, 0x0

    move-object v1, p0

    move-object v2, p1

    invoke-static/range {v0 .. v6}, Lr2/z$a;->i(Lr2/z$a;Lr2/v;[BIIILjava/lang/Object;)Lr2/z;

    move-result-object p0

    return-object p0
.end method

.method public static final create(Lr2/v;[BI)Lr2/z;
    .locals 7
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

    .line 8
    sget-object v0, Lr2/z;->Companion:Lr2/z$a;

    const/4 v4, 0x0

    const/16 v5, 0x8

    const/4 v6, 0x0

    move-object v1, p0

    move-object v2, p1

    move v3, p2

    invoke-static/range {v0 .. v6}, Lr2/z$a;->i(Lr2/z$a;Lr2/v;[BIIILjava/lang/Object;)Lr2/z;

    move-result-object p0

    return-object p0
.end method

.method public static final create(Lr2/v;[BII)Lr2/z;
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

    .line 9
    sget-object v0, Lr2/z;->Companion:Lr2/z$a;

    invoke-virtual {v0, p0, p1, p2, p3}, Lr2/z$a;->g(Lr2/v;[BII)Lr2/z;

    move-result-object p0

    return-object p0
.end method

.method public static final create([B)Lr2/z;
    .locals 7
    .annotation build Lkotlin/jvm/JvmName;
        name = "create"
    .end annotation

    .annotation build Lkotlin/jvm/JvmOverloads;
    .end annotation

    .annotation runtime Lkotlin/jvm/JvmStatic;
    .end annotation

    .line 10
    sget-object v0, Lr2/z;->Companion:Lr2/z$a;

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x7

    const/4 v6, 0x0

    move-object v1, p0

    invoke-static/range {v0 .. v6}, Lr2/z$a;->j(Lr2/z$a;[BLr2/v;IIILjava/lang/Object;)Lr2/z;

    move-result-object p0

    return-object p0
.end method

.method public static final create([BLr2/v;)Lr2/z;
    .locals 7
    .annotation build Lkotlin/jvm/JvmName;
        name = "create"
    .end annotation

    .annotation build Lkotlin/jvm/JvmOverloads;
    .end annotation

    .annotation runtime Lkotlin/jvm/JvmStatic;
    .end annotation

    .line 11
    sget-object v0, Lr2/z;->Companion:Lr2/z$a;

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x6

    const/4 v6, 0x0

    move-object v1, p0

    move-object v2, p1

    invoke-static/range {v0 .. v6}, Lr2/z$a;->j(Lr2/z$a;[BLr2/v;IIILjava/lang/Object;)Lr2/z;

    move-result-object p0

    return-object p0
.end method

.method public static final create([BLr2/v;I)Lr2/z;
    .locals 7
    .annotation build Lkotlin/jvm/JvmName;
        name = "create"
    .end annotation

    .annotation build Lkotlin/jvm/JvmOverloads;
    .end annotation

    .annotation runtime Lkotlin/jvm/JvmStatic;
    .end annotation

    .line 12
    sget-object v0, Lr2/z;->Companion:Lr2/z$a;

    const/4 v4, 0x0

    const/4 v5, 0x4

    const/4 v6, 0x0

    move-object v1, p0

    move-object v2, p1

    move v3, p2

    invoke-static/range {v0 .. v6}, Lr2/z$a;->j(Lr2/z$a;[BLr2/v;IIILjava/lang/Object;)Lr2/z;

    move-result-object p0

    return-object p0
.end method

.method public static final create([BLr2/v;II)Lr2/z;
    .locals 1
    .annotation build Lkotlin/jvm/JvmName;
        name = "create"
    .end annotation

    .annotation build Lkotlin/jvm/JvmOverloads;
    .end annotation

    .annotation runtime Lkotlin/jvm/JvmStatic;
    .end annotation

    .line 13
    sget-object v0, Lr2/z;->Companion:Lr2/z$a;

    invoke-virtual {v0, p0, p1, p2, p3}, Lr2/z$a;->h([BLr2/v;II)Lr2/z;

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

    return-wide v0
.end method

.method public abstract contentType()Lr2/v;
.end method

.method public isDuplex()Z
    .locals 1

    .line 1
    const/4 v0, 0x0

    return v0
.end method

.method public isOneShot()Z
    .locals 1

    .line 1
    const/4 v0, 0x0

    return v0
.end method

.method public abstract writeTo(Lokio/BufferedSink;)V
.end method
