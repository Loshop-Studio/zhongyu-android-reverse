.class public final Le/d$a;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Le/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# direct methods
.method public constructor <init>(Ld/f/b/c;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static final a(Le/d$a;Ljava/lang/String;I)Le/d;
    .locals 0

    .line 1
    new-instance p0, Le/d;

    const/4 p2, 0x0

    invoke-direct {p0, p1, p2}, Le/d;-><init>(Ljava/lang/String;Ld/f/b/c;)V

    .line 2
    sget-object p2, Le/d;->b:Ljava/util/Map;

    .line 3
    invoke-interface {p2, p1, p0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-object p0
.end method


# virtual methods
.method public final b(Ljava/lang/String;)Ljava/lang/String;
    .locals 7

    const-string v0, "TLS_"

    const/4 v1, 0x0

    const/4 v2, 0x2

    invoke-static {p1, v0, v1, v2}, Ld/i/g;->l(Ljava/lang/String;Ljava/lang/String;ZI)Z

    move-result v3

    const-string v4, "(this as java.lang.String).substring(startIndex)"

    const/4 v5, 0x4

    const-string v6, "SSL_"

    if-eqz v3, :cond_0

    invoke-static {v6}, Lb/a/a/a/a;->g(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    :goto_0
    invoke-virtual {p1, v5}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1, v4}, Ld/f/b/d;->d(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    goto :goto_1

    :cond_0
    invoke-static {p1, v6, v1, v2}, Ld/i/g;->l(Ljava/lang/String;Ljava/lang/String;ZI)Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-static {v0}, Lb/a/a/a/a;->g(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    goto :goto_0

    :cond_1
    :goto_1
    return-object p1
.end method
