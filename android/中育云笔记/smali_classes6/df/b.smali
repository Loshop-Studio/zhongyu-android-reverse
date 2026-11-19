.class public final Ldf/b;
.super Ldf/h$a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ldf/b$d;,
        Ldf/b$a;,
        Ldf/b$c;,
        Ldf/b$b;,
        Ldf/b$e;,
        Ldf/b$f;
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ldf/h$a;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public requestBodyConverter(Ljava/lang/reflect/Type;[Ljava/lang/annotation/Annotation;[Ljava/lang/annotation/Annotation;Ldf/d0;)Ldf/h;
    .locals 0

    .line 1
    const-class p2, Lje/x;

    .line 2
    .line 3
    invoke-static {p1}, Ldf/h0;->h(Ljava/lang/reflect/Type;)Ljava/lang/Class;

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
    sget-object p1, Ldf/b$b;->a:Ldf/b$b;

    .line 14
    .line 15
    return-object p1

    .line 16
    :cond_0
    const/4 p1, 0x0

    .line 17
    return-object p1
.end method

.method public responseBodyConverter(Ljava/lang/reflect/Type;[Ljava/lang/annotation/Annotation;Ldf/d0;)Ldf/h;
    .locals 0

    .line 1
    const-class p3, Lje/z;

    .line 2
    .line 3
    if-ne p1, p3, :cond_1

    .line 4
    .line 5
    const-class p1, Lgf/w;

    .line 6
    .line 7
    invoke-static {p2, p1}, Ldf/h0;->l([Ljava/lang/annotation/Annotation;Ljava/lang/Class;)Z

    .line 8
    .line 9
    .line 10
    move-result p1

    .line 11
    if-eqz p1, :cond_0

    .line 12
    .line 13
    sget-object p1, Ldf/b$c;->a:Ldf/b$c;

    .line 14
    .line 15
    return-object p1

    .line 16
    :cond_0
    sget-object p1, Ldf/b$a;->a:Ldf/b$a;

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
    sget-object p1, Ldf/b$f;->a:Ldf/b$f;

    .line 24
    .line 25
    return-object p1

    .line 26
    :cond_2
    invoke-static {p1}, Ldf/h0;->m(Ljava/lang/reflect/Type;)Z

    .line 27
    .line 28
    .line 29
    move-result p1

    .line 30
    if-eqz p1, :cond_3

    .line 31
    .line 32
    sget-object p1, Ldf/b$e;->a:Ldf/b$e;

    .line 33
    .line 34
    return-object p1

    .line 35
    :cond_3
    const/4 p1, 0x0

    .line 36
    return-object p1
.end method
