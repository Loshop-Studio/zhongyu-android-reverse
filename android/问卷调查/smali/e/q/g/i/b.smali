.class public final Le/q/g/i/b;
.super Le/q/i/c;
.source ""


# instance fields
.field public final a:Ljavax/net/ssl/X509TrustManager;


# direct methods
.method public constructor <init>(Ljavax/net/ssl/X509TrustManager;Landroid/net/http/X509TrustManagerExtensions;)V
    .locals 1

    const-string v0, "trustManager"

    invoke-static {p1, v0}, Ld/f/b/d;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "x509TrustManagerExtensions"

    invoke-static {p2, v0}, Ld/f/b/d;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Le/q/i/c;-><init>()V

    iput-object p1, p0, Le/q/g/i/b;->a:Ljavax/net/ssl/X509TrustManager;

    return-void
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 1

    instance-of v0, p1, Le/q/g/i/b;

    if-eqz v0, :cond_0

    check-cast p1, Le/q/g/i/b;

    iget-object p1, p1, Le/q/g/i/b;->a:Ljavax/net/ssl/X509TrustManager;

    iget-object v0, p0, Le/q/g/i/b;->a:Ljavax/net/ssl/X509TrustManager;

    if-ne p1, v0, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public hashCode()I
    .locals 1

    iget-object v0, p0, Le/q/g/i/b;->a:Ljavax/net/ssl/X509TrustManager;

    invoke-static {v0}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    move-result v0

    return v0
.end method
