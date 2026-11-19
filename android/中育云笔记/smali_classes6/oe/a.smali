.class public final Loe/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lje/s;


# static fields
.field public static final a:Loe/a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Loe/a;

    .line 2
    .line 3
    invoke-direct {v0}, Loe/a;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Loe/a;->a:Loe/a;

    .line 7
    .line 8
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


# virtual methods
.method public intercept(Lje/s$a;)Lje/y;
    .locals 10

    .line 1
    const-string v0, "chain"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    move-object v1, p1

    .line 7
    check-cast v1, Lpe/g;

    .line 8
    .line 9
    invoke-virtual {v1}, Lpe/g;->e()Loe/e;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    invoke-virtual {p1, v1}, Loe/e;->s(Lpe/g;)Loe/c;

    .line 14
    .line 15
    .line 16
    move-result-object v3

    .line 17
    const/16 v8, 0x3d

    .line 18
    .line 19
    const/4 v9, 0x0

    .line 20
    const/4 v2, 0x0

    .line 21
    const/4 v4, 0x0

    .line 22
    const/4 v5, 0x0

    .line 23
    const/4 v6, 0x0

    .line 24
    const/4 v7, 0x0

    .line 25
    invoke-static/range {v1 .. v9}, Lpe/g;->d(Lpe/g;ILoe/c;Lje/w;IIIILjava/lang/Object;)Lpe/g;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    invoke-virtual {v1}, Lpe/g;->i()Lje/w;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    invoke-virtual {p1, v0}, Lpe/g;->a(Lje/w;)Lje/y;

    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    return-object p1
.end method
