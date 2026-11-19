.class public final Le/q/g/e;
.super Le/q/g/h;
.source ""


# direct methods
.method public constructor <init>(Ljava/lang/reflect/Method;Ljava/lang/reflect/Method;Ljava/lang/reflect/Method;Ljava/lang/Class;Ljava/lang/Class;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/reflect/Method;",
            "Ljava/lang/reflect/Method;",
            "Ljava/lang/reflect/Method;",
            "Ljava/lang/Class<",
            "*>;",
            "Ljava/lang/Class<",
            "*>;)V"
        }
    .end annotation

    const-string v0, "putMethod"

    invoke-static {p1, v0}, Ld/f/b/d;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "getMethod"

    invoke-static {p2, p1}, Ld/f/b/d;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "removeMethod"

    invoke-static {p3, p1}, Ld/f/b/d;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "clientProviderClass"

    invoke-static {p4, p1}, Ld/f/b/d;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "serverProviderClass"

    invoke-static {p5, p1}, Ld/f/b/d;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Le/q/g/h;-><init>()V

    return-void
.end method
