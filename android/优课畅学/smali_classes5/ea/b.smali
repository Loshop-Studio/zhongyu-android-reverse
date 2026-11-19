.class public final Lea/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lca/h;


# static fields
.field public static final a:Lea/b;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lea/b;

    .line 2
    .line 3
    invoke-direct {v0}, Lea/b;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lea/b;->a:Lea/b;

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
.method public a(Li9/e0;)Ljava/lang/Boolean;
    .locals 0

    .line 1
    invoke-virtual {p1}, Li9/e0;->string()Ljava/lang/String;

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
    check-cast p1, Li9/e0;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lea/b;->a(Li9/e0;)Ljava/lang/Boolean;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    return-object p1
.end method
