.class public final Lff/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ldf/h;


# static fields
.field public static final a:Lff/a;

.field public static final b:Lje/t;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lff/a;

    .line 2
    .line 3
    invoke-direct {v0}, Lff/a;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lff/a;->a:Lff/a;

    .line 7
    .line 8
    const-string v0, "text/plain; charset=UTF-8"

    .line 9
    .line 10
    invoke-static {v0}, Lje/t;->e(Ljava/lang/String;)Lje/t;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    sput-object v0, Lff/a;->b:Lje/t;

    .line 15
    .line 16
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
.method public a(Ljava/lang/Object;)Lje/x;
    .locals 1

    .line 1
    sget-object v0, Lff/a;->b:Lje/t;

    .line 2
    .line 3
    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    invoke-static {v0, p1}, Lje/x;->create(Lje/t;Ljava/lang/String;)Lje/x;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    return-object p1
.end method

.method public bridge synthetic convert(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lff/a;->a(Ljava/lang/Object;)Lje/x;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method
