.class public final Lff/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ldf/h;


# static fields
.field public static final a:Lff/b;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lff/b;

    .line 2
    .line 3
    invoke-direct {v0}, Lff/b;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lff/b;->a:Lff/b;

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
.method public a(Lje/z;)Ljava/lang/Boolean;
    .locals 0

    .line 1
    invoke-virtual {p1}, Lje/z;->string()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Ljava/lang/String;)Ljava/lang/Boolean;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    return-object p1
.end method

.method public bridge synthetic convert(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lje/z;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lff/b;->a(Lje/z;)Ljava/lang/Boolean;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    return-object p1
.end method
