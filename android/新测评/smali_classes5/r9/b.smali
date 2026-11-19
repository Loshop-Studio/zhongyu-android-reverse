.class public final Lr9/b;
.super Lr9/h$a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lr9/b$d;,
        Lr9/b$a;,
        Lr9/b$c;,
        Lr9/b$b;,
        Lr9/b$e;,
        Lr9/b$f;
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Lr9/h$a;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public c(Ljava/lang/reflect/Type;[Ljava/lang/annotation/Annotation;[Ljava/lang/annotation/Annotation;Lr9/d0;)Lr9/h;
    .locals 0

    .line 1
    const-class p2, La9/x;

    .line 2
    .line 3
    invoke-static {p1}, Lr9/h0;->h(Ljava/lang/reflect/Type;)Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    invoke-virtual {p2, p1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 8
    .line 9
    .line 10
    move-result p1

    .line 11
    if-eqz p1, :cond_0

    .line 12
    .line 13
    sget-object p1, Lr9/b$b;->a:Lr9/b$b;

    .line 14
    .line 15
    return-object p1

    .line 16
    :cond_0
    const/4 p1, 0x0

    .line 17
    return-object p1
.end method

.method public d(Ljava/lang/reflect/Type;[Ljava/lang/annotation/Annotation;Lr9/d0;)Lr9/h;
    .locals 0

    .line 1
    const-class p3, La9/z;

    .line 2
    .line 3
    if-ne p1, p3, :cond_1

    .line 4
    .line 5
    const-class p1, Lu9/w;

    .line 6
    .line 7
    invoke-static {p2, p1}, Lr9/h0;->l([Ljava/lang/annotation/Annotation;Ljava/lang/Class;)Z

    .line 8
    .line 9
    .line 10
    move-result p1

    .line 11
    if-eqz p1, :cond_0

    .line 12
    .line 13
    sget-object p1, Lr9/b$c;->a:Lr9/b$c;

    .line 14
    .line 15
    return-object p1

    .line 16
    :cond_0
    sget-object p1, Lr9/b$a;->a:Lr9/b$a;

    .line 17
    .line 18
    return-object p1

    .line 19
    :cond_1
    const-class p2, Ljava/lang/Void;

    .line 20
    .line 21
    if-ne p1, p2, :cond_2

    .line 22
    .line 23
    sget-object p1, Lr9/b$f;->a:Lr9/b$f;

    .line 24
    .line 25
    return-object p1

    .line 26
    :cond_2
    invoke-static {p1}, Lr9/h0;->m(Ljava/lang/reflect/Type;)Z

    .line 27
    .line 28
    .line 29
    move-result p1

    .line 30
    if-eqz p1, :cond_3

    .line 31
    .line 32
    sget-object p1, Lr9/b$e;->a:Lr9/b$e;

    .line 33
    .line 34
    return-object p1

    .line 35
    :cond_3
    const/4 p1, 0x0

    .line 36
    return-object p1
.end method
