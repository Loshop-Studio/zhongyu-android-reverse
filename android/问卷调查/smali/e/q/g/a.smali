.class public final Le/q/g/a;
.super Le/q/g/h;
.source ""


# static fields
.field public static final d:Z

.field public static final e:Le/q/g/a;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    sget-object v0, Le/q/g/h;->c:Le/q/g/h$a;

    invoke-virtual {v0}, Le/q/g/h$a;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1d

    if-lt v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    sput-boolean v0, Le/q/g/a;->d:Z

    return-void
.end method

.method public constructor <init>()V
    .locals 5

    invoke-direct {p0}, Le/q/g/h;-><init>()V

    const/4 v0, 0x4

    new-array v0, v0, [Le/q/g/i/k;

    const-string v1, "java.vm.name"

    .line 1
    invoke-static {v1}, Ljava/lang/System;->getProperty(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const-string v2, "Dalvik"

    invoke-static {v2, v1}, Ld/f/b/d;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    const/4 v2, 0x1

    const/4 v3, 0x0

    if-eqz v1, :cond_0

    .line 2
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v4, 0x1d

    if-lt v1, v4, :cond_0

    move v1, v2

    goto :goto_0

    :cond_0
    move v1, v3

    :goto_0
    if-eqz v1, :cond_1

    .line 3
    new-instance v1, Le/q/g/i/a;

    invoke-direct {v1}, Le/q/g/i/a;-><init>()V

    goto :goto_1

    :cond_1
    const/4 v1, 0x0

    :goto_1
    aput-object v1, v0, v3

    .line 4
    new-instance v1, Le/q/g/i/j;

    sget-object v3, Le/q/g/i/f;->c:Le/q/g/i/f$a;

    .line 5
    sget-object v3, Le/q/g/i/f;->b:Le/q/g/i/j$a;

    .line 6
    invoke-direct {v1, v3}, Le/q/g/i/j;-><init>(Le/q/g/i/j$a;)V

    aput-object v1, v0, v2

    const/4 v1, 0x2

    new-instance v2, Le/q/g/i/j;

    sget-object v3, Le/q/g/i/i;->a:Le/q/g/i/j$a;

    invoke-direct {v2, v3}, Le/q/g/i/j;-><init>(Le/q/g/i/j$a;)V

    aput-object v2, v0, v1

    const/4 v1, 0x3

    new-instance v2, Le/q/g/i/j;

    sget-object v3, Le/q/g/i/g;->a:Le/q/g/i/j$a;

    invoke-direct {v2, v3}, Le/q/g/i/j;-><init>(Le/q/g/i/j$a;)V

    aput-object v2, v0, v1

    invoke-static {v0}, Ld/e/e;->c([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    check-cast v0, Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_2
    :goto_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_3

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    move-object v3, v2

    check-cast v3, Le/q/g/i/k;

    invoke-interface {v3}, Le/q/g/i/k;->a()Z

    move-result v3

    if-eqz v3, :cond_2

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_2

    :cond_3
    return-void
.end method


# virtual methods
.method public a(Ljavax/net/ssl/X509TrustManager;)Le/q/i/c;
    .locals 2

    const-string v0, "trustManager"

    invoke-static {p1, v0}, Ld/f/b/d;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-static {p1, v0}, Ld/f/b/d;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    :try_start_0
    new-instance v1, Landroid/net/http/X509TrustManagerExtensions;

    invoke-direct {v1, p1}, Landroid/net/http/X509TrustManagerExtensions;-><init>(Ljavax/net/ssl/X509TrustManager;)V
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-object v1, v0

    :goto_0
    if-eqz v1, :cond_0

    new-instance v0, Le/q/g/i/b;

    invoke-direct {v0, p1, v1}, Le/q/g/i/b;-><init>(Ljavax/net/ssl/X509TrustManager;Landroid/net/http/X509TrustManagerExtensions;)V

    :cond_0
    if-eqz v0, :cond_1

    goto :goto_1

    .line 2
    :cond_1
    invoke-super {p0, p1}, Le/q/g/h;->a(Ljavax/net/ssl/X509TrustManager;)Le/q/i/c;

    move-result-object v0

    :goto_1
    return-object v0
.end method
