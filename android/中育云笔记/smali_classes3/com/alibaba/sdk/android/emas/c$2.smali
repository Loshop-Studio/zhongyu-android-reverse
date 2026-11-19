.class Lcom/alibaba/sdk/android/emas/c$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/Comparator;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/alibaba/sdk/android/emas/c;->clear()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/util/Comparator<",
        "Ljava/io/File;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/alibaba/sdk/android/emas/c;


# direct methods
.method public constructor <init>(Lcom/alibaba/sdk/android/emas/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/alibaba/sdk/android/emas/c$2;->a:Lcom/alibaba/sdk/android/emas/c;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public a(Ljava/io/File;Ljava/io/File;)I
    .locals 7

    .line 1
    const/4 v0, 0x0

    .line 2
    if-nez p1, :cond_0

    .line 3
    .line 4
    if-nez p2, :cond_0

    .line 5
    .line 6
    return v0

    .line 7
    :cond_0
    const/4 v1, -0x1

    .line 8
    if-nez p1, :cond_1

    .line 9
    .line 10
    return v1

    .line 11
    :cond_1
    const/4 v2, 0x1

    .line 12
    if-nez p2, :cond_2

    .line 13
    .line 14
    return v2

    .line 15
    :cond_2
    if-ne p1, p2, :cond_3

    .line 16
    .line 17
    return v0

    .line 18
    :cond_3
    invoke-virtual {p1}, Ljava/io/File;->lastModified()J

    .line 19
    .line 20
    .line 21
    move-result-wide v3

    .line 22
    invoke-virtual {p2}, Ljava/io/File;->lastModified()J

    .line 23
    .line 24
    .line 25
    move-result-wide v5

    .line 26
    cmp-long v3, v3, v5

    .line 27
    .line 28
    if-gez v3, :cond_4

    .line 29
    .line 30
    return v1

    .line 31
    :cond_4
    invoke-virtual {p1}, Ljava/io/File;->lastModified()J

    .line 32
    .line 33
    .line 34
    move-result-wide v3

    .line 35
    invoke-virtual {p2}, Ljava/io/File;->lastModified()J

    .line 36
    .line 37
    .line 38
    move-result-wide p1

    .line 39
    cmp-long p1, v3, p1

    .line 40
    .line 41
    if-nez p1, :cond_5

    .line 42
    .line 43
    return v0

    .line 44
    :cond_5
    return v2
.end method

.method public synthetic compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 0

    .line 1
    check-cast p1, Ljava/io/File;

    .line 2
    .line 3
    check-cast p2, Ljava/io/File;

    .line 4
    .line 5
    invoke-virtual {p0, p1, p2}, Lcom/alibaba/sdk/android/emas/c$2;->a(Ljava/io/File;Ljava/io/File;)I

    .line 6
    .line 7
    .line 8
    move-result p1

    .line 9
    return p1
.end method
