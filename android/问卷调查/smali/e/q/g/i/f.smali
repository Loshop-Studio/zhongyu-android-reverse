.class public Le/q/g/i/f;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Le/q/g/i/k;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Le/q/g/i/f$a;
    }
.end annotation


# static fields
.field public static final b:Le/q/g/i/j$a;

.field public static final c:Le/q/g/i/f$a;


# instance fields
.field public final a:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class<",
            "-",
            "Ljavax/net/ssl/SSLSocket;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, Le/q/g/i/f$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Le/q/g/i/f$a;-><init>(Ld/f/b/c;)V

    sput-object v0, Le/q/g/i/f;->c:Le/q/g/i/f$a;

    .line 1
    invoke-static {v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    const-string v0, "com.google.android.gms.org.conscrypt"

    const-string v1, "packageName"

    invoke-static {v0, v1}, Ld/f/b/d;->e(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Le/q/g/i/e;

    invoke-direct {v1, v0}, Le/q/g/i/e;-><init>(Ljava/lang/String;)V

    .line 2
    sput-object v1, Le/q/g/i/f;->b:Le/q/g/i/j$a;

    return-void
.end method

.method public constructor <init>(Ljava/lang/Class;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "-",
            "Ljavax/net/ssl/SSLSocket;",
            ">;)V"
        }
    .end annotation

    const-string v0, "sslSocketClass"

    invoke-static {p1, v0}, Ld/f/b/d;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Le/q/g/i/f;->a:Ljava/lang/Class;

    const/4 v0, 0x1

    new-array v1, v0, [Ljava/lang/Class;

    sget-object v2, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const-string v2, "setUseSessionTickets"

    invoke-virtual {p1, v2, v1}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v1

    const-string v2, "sslSocketClass.getDeclar\u2026:class.javaPrimitiveType)"

    invoke-static {v1, v2}, Ld/f/b/d;->d(Ljava/lang/Object;Ljava/lang/String;)V

    new-array v1, v0, [Ljava/lang/Class;

    const-class v2, Ljava/lang/String;

    aput-object v2, v1, v3

    const-string v2, "setHostname"

    invoke-virtual {p1, v2, v1}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    new-array v1, v3, [Ljava/lang/Class;

    const-string v2, "getAlpnSelectedProtocol"

    invoke-virtual {p1, v2, v1}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    new-array v0, v0, [Ljava/lang/Class;

    const-class v1, [B

    aput-object v1, v0, v3

    const-string v1, "setAlpnProtocols"

    invoke-virtual {p1, v1, v0}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    return-void
.end method


# virtual methods
.method public a()Z
    .locals 1

    sget-object v0, Le/q/g/b;->f:Le/q/g/b$a;

    .line 1
    sget-boolean v0, Le/q/g/b;->e:Z

    return v0
.end method
